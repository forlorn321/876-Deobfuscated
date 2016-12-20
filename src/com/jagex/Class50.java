/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class50 implements Runnable {
	volatile String aString512;
	InetAddress anInetAddress513;

	public String method1268() {
		return aString512;
	}

	public String method1269(int i) {
		return aString512;
	}

	public void method1270() {
		aString512 = anInetAddress513.getHostName();
	}

	public void run() {
		aString512 = anInetAddress513.getHostName();
	}

	Class50(int i) throws UnknownHostException {
		anInetAddress513 = InetAddress.getByAddress(new byte[] { (byte) (i >> 24 & 0xff), (byte) (i >> 16 & 0xff), (byte) (i >> 8 & 0xff), (byte) (i & 0xff) });
	}

	public String method1271() {
		return aString512;
	}

	public void method1272() {
		aString512 = anInetAddress513.getHostName();
	}

	static final void method1273(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class208_Sub10.aClass296_Sub1_9923.method5366(i_0_, 1886679382);
	}

	public static Class176 method1274(Class180 class180, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		long l = (long) i_4_;
		Class176 class176 = (Class176) Class100.aClass205_1186.method3787(l);
		int i_6_ = 2055;
		if (null == class176) {
			Class175 class175 = Class175.method2814(Class208_Sub12.aClass459_9930, i_4_, 0);
			if (class175 == null)
				return null;
			if (class175.anInt1905 < 13)
				class175.method2829(2);
			class176 = class180.method3376(class175, i_6_, (Class527_Sub8_Sub15_Sub1.anInt12054 * 1722329827), 64, 768);
			Class100.aClass205_1186.method3790(class176, l);
		}
		class176 = class176.method2862((byte) 6, i_6_, true);
		if (0 != i)
			class176.method2911(i);
		if (0 != i_1_)
			class176.method2868(i_1_);
		if (i_2_ != 0)
			class176.method2869(i_2_);
		if (0 != i_3_)
			class176.method3015(0, i_3_, 0);
		return class176;
	}

	public static void method1275(int i) {
		Class496.method8127();
	}
}
