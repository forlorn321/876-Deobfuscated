/* Class510 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class510 {
	RSBitBuffer aClass536_Sub33_Sub2_6924;
	Class498 aClass498_6925;

	public Class510(Class498 class498, RSBitBuffer class536_sub33_sub2) {
		aClass498_6925 = class498;
		aClass536_Sub33_Sub2_6924 = class536_sub33_sub2;
	}

	static final int[] method6183(String string, Class668 class668, int i) {
		int[] is = null;
		if (string.length() > 0 && string.charAt(string.length() - 1) == 'Y') {
			int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
			if (i_0_ > 0) {
				is = new int[i_0_];
				while (i_0_-- > 0)
					is[i_0_] = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
			}
		}
		return is;
	}

	static final void method6184(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub16_10751.method10080(-781188322) ? 1 : 0;
	}

	static final void method6185(Class668 class668, int i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_1_, -689214737);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class251.anInt2592 * -1307221069;
	}

	public static void method6186(int i) {
		Class310.aBool3471 = true;
		Class310.aString3472 = Class61.aString679;
		Class87.aString872 = Class61.aString696;
		Class275.method3737(false, -1195068252);
		Class184.method2768((short) -17335);
		Class310.aClass303Array3467 = null;
		Class290.aClass426_3223 = null;
		Class673.method8026(18, -1798113843);
	}

	static final void method6187(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		if (i_3_ >= 1 && i_4_ >= 1 && i_3_ <= client.aClass515_11066.method6321((byte) -45) - 2 && i_4_ <= client.aClass515_11066.method6243(177401017) - 2) {
			int i_11_ = i;
			if (i_11_ < 3 && client.aClass515_11066.method6251(-817528155).method5466(i_3_, i_4_, (byte) -118))
				i_11_++;
			if (client.aClass515_11066.method6249(-788777914) != null) {
				client.aClass515_11066.method6292(1084870079).method9382(Class677.aClass167_8609, i, i_2_, i_3_, i_4_, (byte) -93);
				if (i_5_ >= 0) {
					int i_12_ = Class710.aClass536_Sub40_8843.aClass710_Sub7_10753.method9932(-2015548878);
					Class710.aClass536_Sub40_8843.method9857(Class710.aClass536_Sub40_8843.aClass710_Sub7_10753, 1, (byte) 1);
					client.aClass515_11066.method6292(1613960925).method9379(Class677.aClass167_8609, i_11_, i, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, -1756284379);
					Class710.aClass536_Sub40_8843.method9857(Class710.aClass536_Sub40_8843.aClass710_Sub7_10753, i_12_, (byte) 1);
				}
				Class710_Sub17.method10092((Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839), -576910451);
			}
		}
	}

	public static Class287 method6188(int i, int i_13_) {
		Class287[] class287s = Class286.method3908(-1688993004);
		for (int i_14_ = 0; i_14_ < class287s.length; i_14_++) {
			Class287 class287 = class287s[i_14_];
			if (i == class287.anInt3207 * 2043381743)
				return class287;
		}
		return null;
	}
}
