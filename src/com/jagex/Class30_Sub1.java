/* Class30_Sub1 - Decompiled by JODE
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

public class Class30_Sub1 extends Class30 {
	ProxySelector aProxySelector10965 = ProxySelector.getDefault();
	static final String aString10966 = "java.net.useSystemProxies";
	static Class552 aClass552_10967;

	Socket method17354(Proxy proxy) throws IOException {
		if (proxy.type() == Proxy.Type.DIRECT)
			return method873((short) 14788);
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
					Method method_0_ = (var_class.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]));
					method_0_.setAccessible(true);
					if (((Boolean) method_0_.invoke(object, new Object[0])).booleanValue()) {
						Method method_1_ = var_class.getDeclaredMethod("getHeaderName", new Class[0]);
						method_1_.setAccessible(true);
						Method method_2_ = (var_class.getDeclaredMethod("getHeaderValue", new Class[] { java.net.URL.class, java.lang.String.class }));
						method_2_.setAccessible(true);
						String string_3_ = (String) method_1_.invoke(object, new Object[0]);
						String string_4_ = ((String) method_2_.invoke(object, (new Object[] { new URL(new StringBuilder().append("https://").append(aString263).append("/").toString()), "https" })));
						string = new StringBuilder().append(string_3_).append(": ").append(string_4_).toString();
					}
				}
			} catch (Exception exception) {
				/* empty */
			}
			return method17358(inetsocketaddress.getHostName(), inetsocketaddress.getPort(), string, -1599286923);
		}
		if (proxy.type() == Proxy.Type.SOCKS) {
			Socket socket = new Socket(proxy);
			socket.connect(new InetSocketAddress(aString263, anInt264 * 1193730039));
			return socket;
		}
		return null;
	}

	public Socket method874(byte i) throws IOException {
		boolean bool = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
		if (!bool)
			System.setProperty("java.net.useSystemProxies", "true");
		boolean bool_5_ = anInt264 * 1193730039 == 443;
		List list;
		List list_6_;
		try {
			list = aProxySelector10965.select(new URI(new StringBuilder().append(bool_5_ ? "https" : "http").append("://").append(aString263).toString()));
			list_6_ = aProxySelector10965.select(new URI(new StringBuilder().append(bool_5_ ? "http" : "https").append("://").append(aString263).toString()));
		} catch (URISyntaxException urisyntaxexception) {
			return method873((short) 6395);
		}
		list.addAll(list_6_);
		Object[] objects = list.toArray();
		IOException_Sub1 ioexception_sub1 = null;
		Object[] objects_7_ = objects;
		for (int i_8_ = 0; i_8_ < objects_7_.length; i_8_++) {
			Object object = objects_7_[i_8_];
			Proxy proxy = (Proxy) object;
			Socket socket;
			try {
				Socket socket_9_ = method17355(proxy, (short) 19102);
				if (null == socket_9_)
					continue;
				socket = socket_9_;
			} catch (IOException_Sub1 ioexception_sub1_10_) {
				ioexception_sub1 = ioexception_sub1_10_;
				continue;
			} catch (IOException ioexception) {
				continue;
			}
			return socket;
		}
		if (ioexception_sub1 != null)
			throw ioexception_sub1;
		return method873((short) 12463);
	}

	Socket method17355(Proxy proxy, short i) throws IOException {
		if (proxy.type() == Proxy.Type.DIRECT)
			return method873((short) 9355);
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
					Method method_11_ = (var_class.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]));
					method_11_.setAccessible(true);
					if (((Boolean) method_11_.invoke(object, new Object[0])).booleanValue()) {
						Method method_12_ = var_class.getDeclaredMethod("getHeaderName", new Class[0]);
						method_12_.setAccessible(true);
						Method method_13_ = (var_class.getDeclaredMethod("getHeaderValue", new Class[] { java.net.URL.class, java.lang.String.class }));
						method_13_.setAccessible(true);
						String string_14_ = ((String) method_12_.invoke(object, new Object[0]));
						String string_15_ = ((String) method_13_.invoke(object, (new Object[] { new URL(new StringBuilder().append("https://").append(aString263).append("/").toString()), "https" })));
						string = new StringBuilder().append(string_14_).append(": ").append(string_15_).toString();
					}
				}
			} catch (Exception exception) {
				/* empty */
			}
			return method17358(inetsocketaddress.getHostName(), inetsocketaddress.getPort(), string, -1599286923);
		}
		if (proxy.type() == Proxy.Type.SOCKS) {
			Socket socket = new Socket(proxy);
			socket.connect(new InetSocketAddress(aString263, anInt264 * 1193730039));
			return socket;
		}
		return null;
	}

	Class30_Sub1() {
		/* empty */
	}

	public Socket method875() throws IOException {
		boolean bool = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
		if (!bool)
			System.setProperty("java.net.useSystemProxies", "true");
		boolean bool_16_ = anInt264 * 1193730039 == 443;
		List list;
		List list_17_;
		try {
			list = aProxySelector10965.select(new URI(new StringBuilder().append(bool_16_ ? "https" : "http").append("://").append(aString263).toString()));
			list_17_ = aProxySelector10965.select(new URI(new StringBuilder().append(bool_16_ ? "http" : "https").append("://").append(aString263).toString()));
		} catch (URISyntaxException urisyntaxexception) {
			return method873((short) 1391);
		}
		list.addAll(list_17_);
		Object[] objects = list.toArray();
		IOException_Sub1 ioexception_sub1 = null;
		Object[] objects_18_ = objects;
		for (int i = 0; i < objects_18_.length; i++) {
			Object object = objects_18_[i];
			Proxy proxy = (Proxy) object;
			Socket socket;
			try {
				Socket socket_19_ = method17355(proxy, (short) 29267);
				if (null == socket_19_)
					continue;
				socket = socket_19_;
			} catch (IOException_Sub1 ioexception_sub1_20_) {
				ioexception_sub1 = ioexception_sub1_20_;
				continue;
			} catch (IOException ioexception) {
				continue;
			}
			return socket;
		}
		if (ioexception_sub1 != null)
			throw ioexception_sub1;
		return method873((short) 21937);
	}

	Socket method17356(Proxy proxy) throws IOException {
		if (proxy.type() == Proxy.Type.DIRECT)
			return method873((short) 19624);
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
					Method method_21_ = (var_class.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]));
					method_21_.setAccessible(true);
					if (((Boolean) method_21_.invoke(object, new Object[0])).booleanValue()) {
						Method method_22_ = var_class.getDeclaredMethod("getHeaderName", new Class[0]);
						method_22_.setAccessible(true);
						Method method_23_ = (var_class.getDeclaredMethod("getHeaderValue", new Class[] { java.net.URL.class, java.lang.String.class }));
						method_23_.setAccessible(true);
						String string_24_ = ((String) method_22_.invoke(object, new Object[0]));
						String string_25_ = ((String) method_23_.invoke(object, (new Object[] { new URL(new StringBuilder().append("https://").append(aString263).append("/").toString()), "https" })));
						string = new StringBuilder().append(string_24_).append(": ").append(string_25_).toString();
					}
				}
			} catch (Exception exception) {
				/* empty */
			}
			return method17358(inetsocketaddress.getHostName(), inetsocketaddress.getPort(), string, -1599286923);
		}
		if (proxy.type() == Proxy.Type.SOCKS) {
			Socket socket = new Socket(proxy);
			socket.connect(new InetSocketAddress(aString263, anInt264 * 1193730039));
			return socket;
		}
		return null;
	}

	Socket method17357(Proxy proxy) throws IOException {
		if (proxy.type() == Proxy.Type.DIRECT)
			return method873((short) 8407);
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
					Method method_26_ = (var_class.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]));
					method_26_.setAccessible(true);
					if (((Boolean) method_26_.invoke(object, new Object[0])).booleanValue()) {
						Method method_27_ = var_class.getDeclaredMethod("getHeaderName", new Class[0]);
						method_27_.setAccessible(true);
						Method method_28_ = (var_class.getDeclaredMethod("getHeaderValue", new Class[] { java.net.URL.class, java.lang.String.class }));
						method_28_.setAccessible(true);
						String string_29_ = ((String) method_27_.invoke(object, new Object[0]));
						String string_30_ = ((String) method_28_.invoke(object, (new Object[] { new URL(new StringBuilder().append("https://").append(aString263).append("/").toString()), "https" })));
						string = new StringBuilder().append(string_29_).append(": ").append(string_30_).toString();
					}
				}
			} catch (Exception exception) {
				/* empty */
			}
			return method17358(inetsocketaddress.getHostName(), inetsocketaddress.getPort(), string, -1599286923);
		}
		if (proxy.type() == Proxy.Type.SOCKS) {
			Socket socket = new Socket(proxy);
			socket.connect(new InetSocketAddress(aString263, anInt264 * 1193730039));
			return socket;
		}
		return null;
	}

	Socket method17358(String string, int i, String string_31_, int i_32_) throws IOException {
		Socket socket = new Socket(string, i);
		socket.setSoTimeout(10000);
		OutputStream outputstream = socket.getOutputStream();
		if (string_31_ == null)
			outputstream.write(new StringBuilder().append("CONNECT ").append(aString263).append(":").append(anInt264 * 1193730039).append(" HTTP/1.0\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		else
			outputstream.write(new StringBuilder().append("CONNECT ").append(aString263).append(":").append(anInt264 * 1193730039).append(" HTTP/1.0\n").append(string_31_).append("\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		outputstream.flush();
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String string_33_ = bufferedreader.readLine();
		if (string_33_ != null) {
			if (string_33_.startsWith("HTTP/1.0 200") || string_33_.startsWith("HTTP/1.1 200"))
				return socket;
			if (string_33_.startsWith("HTTP/1.0 407") || string_33_.startsWith("HTTP/1.1 407")) {
				int i_34_ = 0;
				String string_35_ = "proxy-authenticate: ";
				for (string_33_ = bufferedreader.readLine(); string_33_ != null && i_34_ < 50; i_34_++) {
					if (string_33_.toLowerCase().startsWith(string_35_)) {
						string_33_ = string_33_.substring(string_35_.length()).trim();
						int i_36_ = string_33_.indexOf(' ');
						if (i_36_ != -1)
							string_33_ = string_33_.substring(0, i_36_);
						throw new IOException_Sub1(string_33_);
					}
					string_33_ = bufferedreader.readLine();
				}
				throw new IOException_Sub1("");
			}
		}
		outputstream.close();
		bufferedreader.close();
		socket.close();
		return null;
	}

	Socket method17359(Proxy proxy) throws IOException {
		if (proxy.type() == Proxy.Type.DIRECT)
			return method873((short) 21816);
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
					Method method_37_ = (var_class.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]));
					method_37_.setAccessible(true);
					if (((Boolean) method_37_.invoke(object, new Object[0])).booleanValue()) {
						Method method_38_ = var_class.getDeclaredMethod("getHeaderName", new Class[0]);
						method_38_.setAccessible(true);
						Method method_39_ = (var_class.getDeclaredMethod("getHeaderValue", new Class[] { java.net.URL.class, java.lang.String.class }));
						method_39_.setAccessible(true);
						String string_40_ = ((String) method_38_.invoke(object, new Object[0]));
						String string_41_ = ((String) method_39_.invoke(object, (new Object[] { new URL(new StringBuilder().append("https://").append(aString263).append("/").toString()), "https" })));
						string = new StringBuilder().append(string_40_).append(": ").append(string_41_).toString();
					}
				}
			} catch (Exception exception) {
				/* empty */
			}
			return method17358(inetsocketaddress.getHostName(), inetsocketaddress.getPort(), string, -1599286923);
		}
		if (proxy.type() == Proxy.Type.SOCKS) {
			Socket socket = new Socket(proxy);
			socket.connect(new InetSocketAddress(aString263, anInt264 * 1193730039));
			return socket;
		}
		return null;
	}

	Socket method17360(String string, int i, String string_42_) throws IOException {
		Socket socket = new Socket(string, i);
		socket.setSoTimeout(10000);
		OutputStream outputstream = socket.getOutputStream();
		if (string_42_ == null)
			outputstream.write(new StringBuilder().append("CONNECT ").append(aString263).append(":").append(anInt264 * 1193730039).append(" HTTP/1.0\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		else
			outputstream.write(new StringBuilder().append("CONNECT ").append(aString263).append(":").append(anInt264 * 1193730039).append(" HTTP/1.0\n").append(string_42_).append("\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		outputstream.flush();
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String string_43_ = bufferedreader.readLine();
		if (string_43_ != null) {
			if (string_43_.startsWith("HTTP/1.0 200") || string_43_.startsWith("HTTP/1.1 200"))
				return socket;
			if (string_43_.startsWith("HTTP/1.0 407") || string_43_.startsWith("HTTP/1.1 407")) {
				int i_44_ = 0;
				String string_45_ = "proxy-authenticate: ";
				for (string_43_ = bufferedreader.readLine(); string_43_ != null && i_44_ < 50; i_44_++) {
					if (string_43_.toLowerCase().startsWith(string_45_)) {
						string_43_ = string_43_.substring(string_45_.length()).trim();
						int i_46_ = string_43_.indexOf(' ');
						if (i_46_ != -1)
							string_43_ = string_43_.substring(0, i_46_);
						throw new IOException_Sub1(string_43_);
					}
					string_43_ = bufferedreader.readLine();
				}
				throw new IOException_Sub1("");
			}
		}
		outputstream.close();
		bufferedreader.close();
		socket.close();
		return null;
	}

	static final void method17361(Class665 class665, int i) {
		int i_47_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_47_, 1424174041);
		int i_48_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		i_48_--;
		if (null == class243.aStringArray2597 || i_48_ >= class243.aStringArray2597.length || null == class243.aStringArray2597[i_48_])
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
		else
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class243.aStringArray2597[i_48_];
	}
}
