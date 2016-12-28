/* Class334 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class334 {
	static final int anInt3624 = 11;
	static final int anInt3625 = 6;
	static final int anInt3626 = 2;
	static final int anInt3627 = 2048;
	static int[] anIntArray3628 = new int[512];

	static {
		int i = 9;
		for (int i_0_ = i - 1; i_0_ >= 0; i_0_--) {
			int i_1_ = 1 << i - i_0_ - 1;
			int i_2_ = 1 << i - i_0_;
			for (int i_3_ = i_1_; i_3_ < i_2_; i_3_++)
				anIntArray3628[i_3_] = (i_2_ - i_3_ << 6 >>> i - i_0_ - 1) + (i_0_ << 6);
		}
	}

	static final void method4367(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		class668.anInt8542 -= 1472892954;
		int i_4_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_5_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		Class73 class73 = ((Class73) Class207.aClass34_Sub22_2244.method70(i_4_, (byte) -42));
		if (1566477951 * class73.anInt803 != i_5_)
			class251.method3487(i_4_, i_5_, 18725358);
		else
			class251.method3497(i_4_, (byte) 8);
	}

	static final void method4368(Class668 class668, int i) {
		int i_6_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = Class198.aClass32_2216.method788(i_6_, (byte) -81).method10713((byte) -5);
	}

	static final void method4369(Class668 class668, int i) {
		int i_7_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.aClass710_Sub33_10762.method8348(i_7_, -1102005131);
	}
}
