/* Class248 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class248 {
	public Class142 aClass142_2725;
	public int anInt2726;
	public int[] anIntArray2727;
	public int[] anIntArray2728;
	public int anInt2729;
	int anInt2730;
	public static Class95_Sub1_Sub1 aClass95_Sub1_Sub1_2731;

	public boolean method4631(int i, int i_0_, int i_1_) {
		if (i_0_ >= 0 && i_0_ < anIntArray2728.length) {
			int i_2_ = anIntArray2728[i_0_];
			if (i >= i_2_ && i <= i_2_ + anIntArray2727[i_0_])
				return true;
		}
		return false;
	}

	Class248(int i, int i_3_, int[] is, int[] is_4_, Class142 class142, int i_5_) {
		anInt2726 = i * 192238673;
		anInt2729 = i_3_ * 2106344107;
		anIntArray2727 = is;
		anIntArray2728 = is_4_;
		aClass142_2725 = class142;
		anInt2730 = -810472325 * i_5_;
	}

	public boolean method4632(int i, int i_6_) {
		if (i_6_ >= 0 && i_6_ < anIntArray2728.length) {
			int i_7_ = anIntArray2728[i_6_];
			if (i >= i_7_ && i <= i_7_ + anIntArray2727[i_6_])
				return true;
		}
		return false;
	}

	static final void method4633(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class409.method6569(class243, class240, class665, (short) 4098);
	}

	static final void method4634(Class665 class665, int i) {
		class665.anInt8526 -= 307142523;
		int i_8_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_9_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		int i_10_ = class665.anIntArray8525[2 + 1769813785 * class665.anInt8526];
		Class217.method3970(i_10_, Class447.method7260(i_8_, i_9_, 60028438), class665, -1868759985);
	}
}
