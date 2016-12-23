/* Class47_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

public class Class47_Sub1 extends Class47 {
	static final String aString10953 = "java.net.useSystemProxies";
	ProxySelector aProxySelector10954 = ProxySelector.getDefault();

	public Socket method909(int i) throws IOException {
		boolean bool = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
		if (!bool)
			System.setProperty("java.net.useSystemProxies", "true");
		boolean bool_0_ = anInt577 * -657305375 == 443;
		List list;
		List list_1_;
		try {
			list = aProxySelector10954.select(new URI(new StringBuilder().append(bool_0_ ? "https" : "http").append("://").append(aString576).toString()));
			list_1_ = aProxySelector10954.select(new URI(new StringBuilder().append(bool_0_ ? "http" : "https").append("://").append(aString576).toString()));
		} catch (URISyntaxException urisyntaxexception) {
			return method908(1895521386);
		}
		list.addAll(list_1_);
		Object[] objects = list.toArray();
		IOException_Sub1 ioexception_sub1 = null;
		Object[] objects_2_ = objects;
		for (int i_3_ = 0; i_3_ < objects_2_.length; i_3_++) {
			Object object = objects_2_[i_3_];
			Proxy proxy = (Proxy) object;
			Socket socket;
			try {
				Socket socket_4_ = method10299(proxy, 206064128);
				if (null == socket_4_)
					continue;
				socket = socket_4_;
			} catch (IOException_Sub1 ioexception_sub1_5_) {
				ioexception_sub1 = ioexception_sub1_5_;
				continue;
			} catch (IOException ioexception) {
				continue;
			}
			return socket;
		}
		if (null != ioexception_sub1)
			throw ioexception_sub1;
		return method908(2052043347);
	}

	Socket method10298(String string, int i, String string_6_, int i_7_) throws IOException {
		Socket socket = new Socket(string, i);
		socket.setSoTimeout(10000);
		OutputStream outputstream = socket.getOutputStream();
		if (null == string_6_)
			outputstream.write(new StringBuilder().append("CONNECT ").append(aString576).append(":").append(anInt577 * -657305375).append(" HTTP/1.0\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		else
			outputstream.write(new StringBuilder().append("CONNECT ").append(aString576).append(":").append(anInt577 * -657305375).append(" HTTP/1.0\n").append(string_6_).append("\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		outputstream.flush();
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String string_8_ = bufferedreader.readLine();
		if (string_8_ != null) {
			if (string_8_.startsWith("HTTP/1.0 200") || string_8_.startsWith("HTTP/1.1 200"))
				return socket;
			if (string_8_.startsWith("HTTP/1.0 407") || string_8_.startsWith("HTTP/1.1 407")) {
				int i_9_ = 0;
				String string_10_ = "proxy-authenticate: ";
				for (string_8_ = bufferedreader.readLine(); null != string_8_ && i_9_ < 50; i_9_++) {
					if (string_8_.toLowerCase().startsWith(string_10_)) {
						string_8_ = string_8_.substring(string_10_.length()).trim();
						int i_11_ = string_8_.indexOf(' ');
						if (i_11_ != -1)
							string_8_ = string_8_.substring(0, i_11_);
						throw new IOException_Sub1(string_8_);
					}
					string_8_ = bufferedreader.readLine();
				}
				throw new IOException_Sub1("");
			}
		}
		outputstream.close();
		bufferedreader.close();
		socket.close();
		return null;
	}

	Socket method10299(Proxy proxy, int i) throws IOException {
		if (proxy.type() == Proxy.Type.DIRECT)
			return method908(1639665613);
		java.net.SocketAddress socketaddress = proxy.address();
		if (!(socketaddress instanceof InetSocketAddress))
			return null;
		InetSocketAddress inetsocketaddress = (InetSocketAddress) socketaddress;
		if (proxy.type() == Proxy.Type.HTTP) {
			String string = null;
			try {
				Class var_class = (Class.forName("sun.net.www.protocol.http.AuthenticationInfo"));
				Method method = var_class.getDeclaredMethod("getProxyAuth", (new Class[] { java.lang.String.class, Integer.TYPE }));
				method.setAccessible(true);
				Object object = method.invoke(null, (new Object[] { inetsocketaddress.getHostName(), new Integer(inetsocketaddress.getPort()) }));
				if (null != object) {
					Method method_12_ = (var_class.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]));
					method_12_.setAccessible(true);
					if (((Boolean) method_12_.invoke(object, new Object[0])).booleanValue()) {
						Method method_13_ = var_class.getDeclaredMethod("getHeaderName", new Class[0]);
						method_13_.setAccessible(true);
						Method method_14_ = (var_class.getDeclaredMethod("getHeaderValue", new Class[] { java.net.URL.class, java.lang.String.class }));
						method_14_.setAccessible(true);
						String string_15_ = ((String) method_13_.invoke(object, new Object[0]));
						String string_16_ = ((String) method_14_.invoke(object, (new Object[] { new URL(new StringBuilder().append("https://").append(aString576).append("/").toString()), "https" })));
						string = new StringBuilder().append(string_15_).append(": ").append(string_16_).toString();
					}
				}
			} catch (Exception exception) {
				/* empty */
			}
			return method10298(inetsocketaddress.getHostName(), inetsocketaddress.getPort(), string, -1403772576);
		}
		if (proxy.type() == Proxy.Type.SOCKS) {
			Socket socket = new Socket(proxy);
			socket.connect(new InetSocketAddress(aString576, anInt577 * -657305375));
			return socket;
		}
		return null;
	}

	Class47_Sub1() {
		/* empty */
	}

	public Socket method910() throws IOException {
		boolean bool = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
		if (!bool)
			System.setProperty("java.net.useSystemProxies", "true");
		boolean bool_17_ = anInt577 * -657305375 == 443;
		List list;
		List list_18_;
		try {
			list = aProxySelector10954.select(new URI(new StringBuilder().append(bool_17_ ? "https" : "http").append("://").append(aString576).toString()));
			list_18_ = aProxySelector10954.select(new URI(new StringBuilder().append(bool_17_ ? "http" : "https").append("://").append(aString576).toString()));
		} catch (URISyntaxException urisyntaxexception) {
			return method908(1860374978);
		}
		list.addAll(list_18_);
		Object[] objects = list.toArray();
		IOException_Sub1 ioexception_sub1 = null;
		Object[] objects_19_ = objects;
		for (int i = 0; i < objects_19_.length; i++) {
			Object object = objects_19_[i];
			Proxy proxy = (Proxy) object;
			Socket socket;
			try {
				Socket socket_20_ = method10299(proxy, 1037633144);
				if (null == socket_20_)
					continue;
				socket = socket_20_;
			} catch (IOException_Sub1 ioexception_sub1_21_) {
				ioexception_sub1 = ioexception_sub1_21_;
				continue;
			} catch (IOException ioexception) {
				continue;
			}
			return socket;
		}
		if (null != ioexception_sub1)
			throw ioexception_sub1;
		return method908(1871227683);
	}
}
