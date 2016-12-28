/* Class274 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class274 {
	Class264[] aClass264Array3017;
	static final int anInt3018 = 4;
	Class265[] aClass265Array3019;
	String aString3020;
	Class265[] aClass265Array3021;
	static final int anInt3022 = 256;
	static final int anInt3023 = 2;

	void method3731(byte[] is) throws Exception_Sub2 {
		Class269 class269 = new Class269(is);
		int i = class269.method3705(-1051642534);
		if (i != 4)
			throw new Exception_Sub2(this, i, 4);
		aString3020 = class269.method3709(-870526944);
		aClass265Array3019 = new Class265[class269.method3705(-880807228)];
		aClass265Array3021 = new Class265[class269.method3705(-1959027573)];
		aClass264Array3017 = new Class264[class269.method3705(-1681057007)];
		for (int i_0_ = 0; i_0_ < aClass265Array3019.length; i_0_++) {
			aClass265Array3019[i_0_] = new Class265();
			aClass265Array3019[i_0_].method3681(class269, -335044008);
		}
		for (int i_1_ = 0; i_1_ < aClass265Array3021.length; i_1_++) {
			aClass265Array3021[i_1_] = new Class265();
			aClass265Array3021[i_1_].method3681(class269, -858609469);
		}
		for (int i_2_ = 0; i_2_ < aClass264Array3017.length; i_2_++) {
			aClass264Array3017[i_2_] = new Class264();
			aClass264Array3017[i_2_].method3669(class269, (short) 5762);
		}
	}

	void method3732(byte[] is, byte i) throws Exception_Sub2 {
		Class269 class269 = new Class269(is);
		int i_3_ = class269.method3705(-1128701504);
		if (i_3_ != 4)
			throw new Exception_Sub2(this, i_3_, 4);
		aString3020 = class269.method3709(-1920084148);
		aClass265Array3019 = new Class265[class269.method3705(-1421894867)];
		aClass265Array3021 = new Class265[class269.method3705(-1797923179)];
		aClass264Array3017 = new Class264[class269.method3705(-1398594666)];
		for (int i_4_ = 0; i_4_ < aClass265Array3019.length; i_4_++) {
			aClass265Array3019[i_4_] = new Class265();
			aClass265Array3019[i_4_].method3681(class269, -755686220);
		}
		for (int i_5_ = 0; i_5_ < aClass265Array3021.length; i_5_++) {
			aClass265Array3021[i_5_] = new Class265();
			aClass265Array3021[i_5_].method3681(class269, 1151550484);
		}
		for (int i_6_ = 0; i_6_ < aClass264Array3017.length; i_6_++) {
			aClass264Array3017[i_6_] = new Class264();
			aClass264Array3017[i_6_].method3669(class269, (short) 72);
		}
	}

	public Class274(byte[] is) throws Exception_Sub2 {
		method3732(is, (byte) -20);
	}

	void method3733(byte[] is) throws Exception_Sub2 {
		Class269 class269 = new Class269(is);
		int i = class269.method3705(-2018338382);
		if (i != 4)
			throw new Exception_Sub2(this, i, 4);
		aString3020 = class269.method3709(-458092975);
		aClass265Array3019 = new Class265[class269.method3705(-1254859172)];
		aClass265Array3021 = new Class265[class269.method3705(-1076996321)];
		aClass264Array3017 = new Class264[class269.method3705(-1221856360)];
		for (int i_7_ = 0; i_7_ < aClass265Array3019.length; i_7_++) {
			aClass265Array3019[i_7_] = new Class265();
			aClass265Array3019[i_7_].method3681(class269, 242802839);
		}
		for (int i_8_ = 0; i_8_ < aClass265Array3021.length; i_8_++) {
			aClass265Array3021[i_8_] = new Class265();
			aClass265Array3021[i_8_].method3681(class269, 189657380);
		}
		for (int i_9_ = 0; i_9_ < aClass264Array3017.length; i_9_++) {
			aClass264Array3017[i_9_] = new Class264();
			aClass264Array3017[i_9_].method3669(class269, (short) -7898);
		}
	}

	static final void method3734(Class668 class668, byte i) {
		int i_10_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_10_);
		Class234 class234 = Class463.aClass234Array5227[i_10_ >> 16];
		Class645_Sub1.method10043(class251, class234, class668, 1575038518);
	}

	public static void method3735(int i, int i_11_) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(11, (long) i);
		class536_sub18_sub5.method10669(-1338561699);
	}
}
