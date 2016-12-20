/* Class679 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class679 implements Interface76 {
	public static Class679 aClass679_8620;
	public static Class679 aClass679_8621;
	public static Class679 aClass679_8622;
	public static Class679 aClass679_8623;
	public int anInt8624;
	public static Class679 aClass679_8625 = new Class679(0, (byte) -1);
	public static final int anInt8626 = 4;
	public byte aByte8627;
	public static Class24_Sub21 aClass24_Sub21_8628;
	public static Class104[] aClass104Array8629;

	public static Class679[] method13898() {
		return new Class679[] { aClass679_8625, aClass679_8620, aClass679_8622, aClass679_8623, aClass679_8621 };
	}

	Class679(int i, byte i_0_) {
		anInt8624 = 840752829 * i;
		aByte8627 = i_0_;
	}

	static final void method13899(Class665 class665, int i) {
		Class333 class333 = (Class333) (class665.aClass527_Sub8_Sub10_8548.anObjectArray11725[class665.anInt8527 * 891367231]);
		Interface19 interface19 = ((Interface19) (0 == class665.anIntArray8545[891367231 * class665.anInt8527] ? class665.aMap8523.get(class333.aClass160_3626.aClass465_1745) : class665.aMap8536.get(class333.aClass160_3626.aClass465_1745)));
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = interface19.method100(class333, (short) -22542);
	}

	public int method13900(int i) {
		return 1 + aByte8627;
	}

	static {
		aClass679_8620 = new Class679(1, (byte) 0);
		aClass679_8622 = new Class679(2, (byte) 1);
		aClass679_8623 = new Class679(3, (byte) 2);
		aClass679_8621 = new Class679(4, (byte) 3);
	}

	public int method42() {
		return aByte8627;
	}

	public int method91() {
		return aByte8627;
	}

	public static Class679[] method13901() {
		return new Class679[] { aClass679_8625, aClass679_8620, aClass679_8622, aClass679_8623, aClass679_8621 };
	}

	public int method13902() {
		return 1 + aByte8627;
	}

	public int method87() {
		return aByte8627;
	}

	static final void method13903(Class243 class243, Class240 class240, Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, 560545558) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2646 = Class103.method1800(string, class665, (byte) -126);
		class243.aBool2606 = true;
	}

	public static Class679[] method13904(int i) {
		return new Class679[] { aClass679_8625, aClass679_8620, aClass679_8622, aClass679_8623, aClass679_8621 };
	}
}
