/* Class307 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class307 {
	int anInt3443;
	static Class307 aClass307_3444 = new Class307(0);
	static Class307 aClass307_3445;
	static Class307 aClass307_3446 = new Class307(1);
	static Class185 aClass185_3447;

	Class307(int i) {
		anInt3443 = -227749115 * i;
	}

	static {
		aClass307_3445 = new Class307(2);
	}

	static Class307 method5611(int i) {
		if (i == aClass307_3444.anInt3443 * 1483211213)
			return aClass307_3444;
		if (1483211213 * aClass307_3446.anInt3443 == i)
			return aClass307_3446;
		if (i == 1483211213 * aClass307_3445.anInt3443)
			return aClass307_3445;
		return null;
	}

	public static void method5612(String string, boolean bool, Class180 class180, Class174 class174, Class22 class22, int i) {
		boolean bool_0_ = !Class542.aBool7236 || Class588.method9816(1405956833);
		if (bool_0_) {
			if (Class542.aBool7236 && bool_0_) {
				class22 = Class99.aClass22_1175;
				class174 = class180.method3170(class22, Class651.aClass185_Sub2Array8384, true);
				int i_1_ = class22.method798(string, 250, null, -2012913394);
				int i_2_ = class22.method810(string, 250, class22.anInt212 * 169086347, null, -1638901364);
				int i_3_ = aClass185_3447.method3636();
				int i_4_ = i_3_ + 4;
				i_1_ += i_4_ * 2;
				i_2_ += 2 * i_4_;
				if (i_1_ < Class99.anInt1171 * 195041625)
					i_1_ = Class99.anInt1171 * 195041625;
				if (i_2_ < Class99.anInt1172 * 445535569)
					i_2_ = 445535569 * Class99.anInt1172;
				int i_5_ = (Class99.aClass400_1174.method6525(i_1_, (client.anInt11158 * -1844600635), -1173855569) + Exception_Sub3.anInt11361 * -1225007839);
				int i_6_ = (Class99.aClass384_1168.method6413(i_2_, (1254981347 * client.anInt11058), -205879504) + Class99.anInt1169 * -1851475317);
				class180.method3271(Class195.aClass185_2161, false).method2422(i_5_ + Class99.aClass185_1170.method3636(), i_6_ + Class99.aClass185_1170.method3570(), i_1_ - Class99.aClass185_1170.method3636() * 2, i_2_ - Class99.aClass185_1170.method3570() * 2, 1, -1, 0);
				class180.method3271(Class99.aClass185_1170, true).method2415(i_5_, i_6_);
				Class99.aClass185_1170.method3621();
				class180.method3271(Class99.aClass185_1170, true).method2415(i_5_ + i_1_ - i_3_, i_6_);
				Class99.aClass185_1170.method3582();
				class180.method3271(Class99.aClass185_1170, true).method2415(i_1_ + i_5_ - i_3_, i_6_ + i_2_ - i_3_);
				Class99.aClass185_1170.method3621();
				class180.method3271(Class99.aClass185_1170, true).method2415(i_5_, i_2_ + i_6_ - i_3_);
				Class99.aClass185_1170.method3582();
				class180.method3271(aClass185_3447, true).method2421(i_5_, i_6_ + Class99.aClass185_1170.method3570(), i_3_, i_2_ - Class99.aClass185_1170.method3570() * 2);
				aClass185_3447.method3593();
				class180.method3271(aClass185_3447, true).method2421(i_5_ + Class99.aClass185_1170.method3636(), i_6_, i_1_ - Class99.aClass185_1170.method3636() * 2, i_3_);
				aClass185_3447.method3593();
				class180.method3271(aClass185_3447, true).method2421(i_1_ + i_5_ - i_3_, i_6_ + Class99.aClass185_1170.method3570(), i_3_, i_2_ - Class99.aClass185_1170.method3570() * 2);
				aClass185_3447.method3593();
				class180.method3271(aClass185_3447, true).method2421(i_5_ + Class99.aClass185_1170.method3636(), i_6_ + i_2_ - i_3_, i_1_ - Class99.aClass185_1170.method3636() * 2, i_3_);
				aClass185_3447.method3593();
				class174.method2746(string, i_4_ + i_5_, i_6_ + i_4_, i_1_ - 2 * i_4_, i_2_ - i_4_ * 2, (-452326929 * Class488.anInt5471 | ~0xffffff), -1, 1, 1, 0, null, null, null, 0, 0, -1300246824);
				Class554_Sub1.method16829(i_5_, i_6_, i_1_, i_2_, (byte) 3);
			} else {
				int i_7_ = class22.method798(string, 250, null, -816687664);
				int i_8_ = class22.method786(string, 250, null, (byte) -44) * 13;
				int i_9_ = 4;
				int i_10_ = 6 + i_9_;
				int i_11_ = 6 + i_9_;
				class180.method3348(i_10_ - i_9_, i_11_ - i_9_, i_7_ + i_9_ + i_9_, i_8_ + i_9_ + i_9_, -16777216, 0);
				class180.method3134(i_10_ - i_9_, i_11_ - i_9_, i_9_ + (i_7_ + i_9_), i_8_ + i_9_ + i_9_, -1, 0);
				class174.method2746(string, i_10_, i_11_, i_7_, i_8_, -1, -1, 1, 1, 0, null, null, null, 0, 0, -1300246824);
				Class554_Sub1.method16829(i_10_ - i_9_, i_11_ - i_9_, i_7_ + i_9_ + i_9_, i_8_ + i_9_ + i_9_, (byte) 3);
			}
			if (bool) {
				try {
					class180.method3165();
					class180.method3078((byte) 32);
				} catch (Exception_Sub1 exception_sub1) {
					/* empty */
				}
			}
		}
	}

	static final void method5613(Class665 class665, byte i) {
		Class411.aClass411_4358.method6580((byte) 79);
	}

	static final void method5614(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class32.anInt316 * -1365985163;
	}

	static final void method5615(Class665 class665, int i) {
		long l = Class234.method4347(-1408626088);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (int) (l / 86400000L) - 11745;
	}

	public static String method5616(String string, char c, String string_12_, int i) {
		int i_13_ = string.length();
		int i_14_ = string_12_.length();
		int i_15_ = i_13_;
		int i_16_ = i_14_ - 1;
		if (i_16_ != 0) {
			int i_17_ = 0;
			for (;;) {
				i_17_ = string.indexOf(c, i_17_);
				if (i_17_ < 0)
					break;
				i_17_++;
				i_15_ += i_16_;
			}
		}
		StringBuilder stringbuilder = new StringBuilder(i_15_);
		int i_18_ = 0;
		for (;;) {
			int i_19_ = string.indexOf(c, i_18_);
			if (i_19_ < 0)
				break;
			stringbuilder.append(string.substring(i_18_, i_19_));
			stringbuilder.append(string_12_);
			i_18_ = 1 + i_19_;
		}
		stringbuilder.append(string.substring(i_18_));
		return stringbuilder.toString();
	}

	public static int method5617(int i, int i_20_, int i_21_, short i_22_) {
		int i_23_ = 255 - i_21_;
		i_20_ = ((i_20_ & 0xff00ff) * i_21_ & ~0xff00ff | i_21_ * (i_20_ & 0xff00) & 0xff0000) >>> 8;
		return i_20_ + (((i & 0xff00ff) * i_23_ & ~0xff00ff | i_23_ * (i & 0xff00) & 0xff0000) >>> 8);
	}

	static final boolean method5618(int[][] is, int[][] is_24_, int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_) {
		for (int i_30_ = i_25_; i_30_ <= i_27_; i_30_++) {
			for (int i_31_ = i_26_; i_31_ <= i_28_; i_31_++) {
				if (is[i_30_][i_31_] == i && is_24_[i_30_][i_31_] <= 1)
					return true;
			}
		}
		return false;
	}

	static final void method5619(Class665 class665, byte i) {
		class665.anInt8526 -= 102380841;
	}
}
