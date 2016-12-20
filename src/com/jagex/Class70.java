/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class70 implements Interface50 {
	public Object method341(byte[] is, Class22 class22, boolean bool, short i) {
		return Class402.aClass180_4150.method3170(class22, Class165.method2657(is), bool);
	}

	public Object method340(byte[] is, Class22 class22, boolean bool) {
		return Class402.aClass180_4150.method3170(class22, Class165.method2657(is), bool);
	}

	static final void method1484(Class243 class243, Class240 class240, Class665 class665, int i) {
		class665.anInt8526 -= 614285046;
		class243.anInt2545 = 212363735 * (class665.anIntArray8525[class665.anInt8526 * 1769813785]);
		class243.anInt2546 = (class665.anIntArray8525[1769813785 * class665.anInt8526 + 1] * 654510845);
		class243.anInt2547 = (class665.anIntArray8525[class665.anInt8526 * 1769813785 + 2] * 1553077417);
		class243.anInt2548 = (-1017938173 * class665.anIntArray8525[3 + 1769813785 * class665.anInt8526]);
		class243.anInt2549 = (class665.anIntArray8525[4 + class665.anInt8526 * 1769813785] * 1518699665);
		class243.anInt2553 = (-413286125 * class665.anIntArray8525[class665.anInt8526 * 1769813785 + 5]);
		Class430.method6876(class243, (byte) 62);
		if (-1 == class243.anInt2675 * -927924265 && !class240.aBool2394) {
			Class208_Sub21.method15637(class243.anInt2504 * -254728301, (byte) -71);
			Class527_Sub31.method16351(class243.anInt2504 * -254728301, 1263244320);
		}
	}

	static final void method1485(Class665 class665, byte i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = (Class708.aClass463_8847.method7621(i_0_, 1505326290).aString11866);
	}

	static final void method1486(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aShort11283;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aShort11284;
	}

	static final void method1487(Class665 class665, int i) {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		int[] is = Class433.method6964(i_1_, 2044431776);
		Class692.method14039(is, 0, class665.anIntArray8525, class665.anInt8526 * 1769813785, 3);
		class665.anInt8526 += 307142523;
	}

	static void method1488(int i, boolean bool, short i_2_) {
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool, (byte) 93);
		if (class527_sub1 != null)
			class527_sub1.method8735(-1889161967);
	}

	public static Class527_Sub15 method1489(OutgoingPacket class414, Class2 class2, byte i) {
		Class527_Sub15 class527_sub15 = Class295.method5336((byte) -64);
		class527_sub15.aClass414_10457 = class414;
		class527_sub15.anInt10459 = class414.anInt4508 * -1031904011;
		if (-1 == class527_sub15.anInt10459 * 2102412005)
			class527_sub15.buffer = new Class527_Sub38_Sub2(260);
		else if (2102412005 * class527_sub15.anInt10459 == -2)
			class527_sub15.buffer = new Class527_Sub38_Sub2(10000);
		else if (2102412005 * class527_sub15.anInt10459 <= 18)
			class527_sub15.buffer = new Class527_Sub38_Sub2(20);
		else if (class527_sub15.anInt10459 * 2102412005 <= 98)
			class527_sub15.buffer = new Class527_Sub38_Sub2(100);
		else
			class527_sub15.buffer = new Class527_Sub38_Sub2(260);
		class527_sub15.buffer.method18445(class2, 811208799);
		class527_sub15.buffer.method18464(class527_sub15.aClass414_10457.anInt4507 * -987733637, (byte) 62);
		class527_sub15.anInt10460 = 0;
		return class527_sub15;
	}

	static void method1490(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, boolean bool, int i_16_, int i_17_) {
		if (0 != i_3_ && -1 != i_5_) {
			Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1 = null;
			if (i_3_ < 0) {
				int i_18_ = -i_3_ - 1;
				if (client.anInt11070 * -899375681 == i_18_)
					class640_sub1_sub2_sub1 = Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937;
				else
					class640_sub1_sub2_sub1 = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_18_]);
			} else {
				int i_19_ = i_3_ - 1;
				Class527_Sub26 class527_sub26 = ((Class527_Sub26) client.aClass14_10989.method709((long) i_19_));
				if (class527_sub26 != null)
					class640_sub1_sub2_sub1 = ((Class640_Sub1_Sub2_Sub1) class527_sub26.anObject10522);
			}
			if (null != class640_sub1_sub2_sub1) {
				Class587 class587 = class640_sub1_sub2_sub1.method18542(-2029108429);
				if (null != class587.anIntArrayArray7744 && null != class587.anIntArrayArray7744[i_5_])
					i_6_ -= class587.anIntArrayArray7744[i_5_][1];
				if (null != class587.anIntArrayArray7745 && class587.anIntArrayArray7745[i_5_] != null)
					i_6_ -= class587.anIntArrayArray7745[i_5_][1];
			}
		}
		Class640_Sub1_Sub2_Sub5 class640_sub1_sub2_sub5 = new Class640_Sub1_Sub2_Sub5(client.aClass509_11072.method8314(-1302812746), i, Class579.anInt7673 * 1551166221, Class579.anInt7673 * 1551166221, i_8_, i_9_, i_6_, client.anInt11019 + i_12_, client.anInt11019 + i_13_, i_14_, i_15_, i_3_, i_4_, i_7_, bool, i_5_, i_16_);
		class640_sub1_sub2_sub5.method18812(i_10_, i_11_, Class590.method9853(i_10_, i_11_, 1551166221 * Class579.anInt7673, (byte) 5) - i_7_, i_12_ + client.anInt11019, (byte) -45);
		client.aClass694_11290.method14147(new Class527_Sub8_Sub5(class640_sub1_sub2_sub5), -567004758);
	}
}
