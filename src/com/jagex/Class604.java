/* Class604 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class Class604 implements Interface75 {
	static Class604 aClass604_7865 = new Class604(0);
	static Class604 aClass604_7866 = new Class604(1);
	int anInt7867;
	static Class604 aClass604_7868 = new Class604(2);

	public int method12() {
		return anInt7867 * -1395955353;
	}

	public int method78() {
		return anInt7867 * -1395955353;
	}

	Class604(int i) {
		anInt7867 = i * 687120983;
	}

	public int method73() {
		return anInt7867 * -1395955353;
	}

	static final void method7203(Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		int i_0_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_1_ = class668.anIntArray8541[1 + class668.anInt8542 * 1867269829];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.aClass231_11088.method3301(i_0_, (byte) 82).method3157(i_1_, (byte) -103);
	}

	public static long method7204(int i) {
		long l;
		try {
			URL url = new URL(new StringBuilder().append(Class640.method7673("services", false, -923644264)).append("m=accountappeal/login.ws").toString());
			URLConnection urlconnection = url.openConnection();
			urlconnection.setRequestProperty("connection", "close");
			urlconnection.setDoInput(true);
			urlconnection.setDoOutput(true);
			urlconnection.setConnectTimeout(5000);
			OutputStreamWriter outputstreamwriter = new OutputStreamWriter(urlconnection.getOutputStream());
			outputstreamwriter.write("data1=req");
			outputstreamwriter.flush();
			InputStream inputstream = urlconnection.getInputStream();
			RSByteBuffer class536_sub33 = new RSByteBuffer(new byte[1000]);
			for (;;) {
				int i_2_ = inputstream.read(class536_sub33.buffer, -810172525 * class536_sub33.off, 1000 - (-810172525 * class536_sub33.off));
				if (-1 == i_2_)
					break;
				class536_sub33.off += i_2_ * 516175515;
				if (class536_sub33.off * -810172525 >= 1000)
					return 0L;
			}
			class536_sub33.off = 0;
			long l_3_ = class536_sub33.method9711(702869087);
			l = l_3_;
		} catch (Exception exception) {
			return 0L;
		}
		return l;
	}

	public static Class382 method7205(RSByteBuffer class536_sub33, int i) {
		Class382 class382 = new Class382();
		class382.anInt4013 = class536_sub33.readUnsignedShort() * -203156379;
		class382.aClass536_Sub18_Sub10_4012 = Class198.aClass32_2216.method788(810974573 * class382.anInt4013, (byte) 35);
		return class382;
	}

	public static boolean method7206(char c, byte i) {
		return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
	}

	static final int method7207(int i, int i_4_) {
		return i < 7 ? 8 : 11;
	}
}
