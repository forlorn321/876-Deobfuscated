/* Class279 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class279 {
	Class536_Sub18_Sub12[] aClass536_Sub18_Sub12Array3159 = new Class536_Sub18_Sub12[100];
	int anInt3160;
	static final int anInt3161 = 100;
	public static Class461 aClass461_3162;
	public static Class34_Sub3 aClass34_Sub3_3163;

	Class536_Sub18_Sub12 method3755(int i, int i_0_, String string, String string_1_, String string_2_, String string_3_, String string_4_, int i_5_, Class402 class402, int i_6_) {
		Class536_Sub18_Sub12 class536_sub18_sub12 = aClass536_Sub18_Sub12Array3159[99];
		for (int i_7_ = -2086717899 * anInt3160; i_7_ > 0; i_7_--) {
			if (100 != i_7_)
				aClass536_Sub18_Sub12Array3159[i_7_] = aClass536_Sub18_Sub12Array3159[i_7_ - 1];
		}
		if (class536_sub18_sub12 == null)
			class536_sub18_sub12 = new Class536_Sub18_Sub12(i, i_0_, string, string_1_, string_2_, string_4_, i_5_, string_3_, class402);
		else {
			class536_sub18_sub12.method6484(1557054963);
			class536_sub18_sub12.method9521(-1669901019);
			class536_sub18_sub12.method10739(i, i_0_, string, string_1_, string_2_, string_4_, i_5_, string_3_, class402, 702897581);
		}
		aClass536_Sub18_Sub12Array3159[0] = class536_sub18_sub12;
		if (anInt3160 * -2086717899 < 100)
			anInt3160 += 1422322717;
		return class536_sub18_sub12;
	}

	Class536_Sub18_Sub12 method3756(int i, int i_8_) {
		if (i < 0 || i >= anInt3160 * -2086717899)
			return null;
		return aClass536_Sub18_Sub12Array3159[i];
	}

	Class279() {
		/* empty */
	}

	int method3757() {
		return anInt3160 * -2086717899;
	}

	int method3758(int i) {
		return anInt3160 * -2086717899;
	}

	static final void method3759(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class628.method7492(class251, class234, class668, 1936075268);
	}

	static final void method3760(Class668 class668, int i) {
		Class512.method6211((String) (class668.anObjectArray8543[((class668.anInt8544 -= 1946079257) * 366709801)]), false, false, (byte) 80);
	}
}
