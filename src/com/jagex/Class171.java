/* Class171 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class171 {
	public static Class171 aClass171_1895;
	static Class171 aClass171_1896;
	static Class171 aClass171_1897;
	public int anInt1898;
	public static Class171 aClass171_1899;
	static Class171 aClass171_1900 = new Class171(8, 1);
	public static Class171 aClass171_1901;
	public static Class171 aClass171_1902;
	public static Class171 aClass171_1903;
	public int anInt1904;
	public static Class171 aClass171_1905;

	Class171(int i, int i_0_) {
		anInt1904 = i * -422817751;
		anInt1898 = -1269352859 * i_0_;
	}

	static {
		aClass171_1896 = new Class171(3, 2);
		aClass171_1897 = new Class171(1, 4);
		aClass171_1905 = new Class171(2, 1);
		aClass171_1899 = new Class171(6, 2);
		aClass171_1895 = new Class171(4, 3);
		aClass171_1901 = new Class171(5, 4);
		aClass171_1902 = new Class171(7, 2);
		aClass171_1903 = new Class171(0, 4);
	}

	static boolean method2423(int i) {
		Class76_Sub1.anInt10981 = 1864934367;
		Class586.aClass106_7710 = client.aClass106_11218;
		return Class188.method2796(-1L == (-7692785137277514277L * Class61.aLong649), true, "", "", -7692785137277514277L * Class61.aLong649);
	}

	public static int method2424(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		if (1 == (i_5_ & 0x1)) {
			int i_7_ = i_3_;
			i_3_ = i_4_;
			i_4_ = i_7_;
		}
		i_2_ &= 0x3;
		if (i_2_ == 0)
			return i;
		if (1 == i_2_)
			return i_1_;
		if (2 == i_2_)
			return 7 - i - (i_3_ - 1);
		return 7 - i_1_ - (i_4_ - 1);
	}

	static void method2425(Class234 class234, IComponentDefinitions class251, int i) {
		if (class251 != null) {
			if (-1 != -809980533 * class251.anInt2546) {
				IComponentDefinitions class251_8_ = class234.getIComponentDefinitions(-1940204141 * class251.parentLayer);
				if (class251_8_ != null) {
					if (class251_8_.aClass251Array2725 == class251_8_.aClass251Array2726) {
						class251_8_.aClass251Array2726 = (new IComponentDefinitions[class251_8_.aClass251Array2725.length]);
						class251_8_.aClass251Array2726[class251_8_.aClass251Array2726.length - 1] = class251;
						Class687.method8116(class251_8_.aClass251Array2725, 0, class251_8_.aClass251Array2726, 0, class251.anInt2546 * -809980533);
						Class687.method8116(class251_8_.aClass251Array2725, 1 + (class251.anInt2546 * -809980533), class251_8_.aClass251Array2726, -809980533 * class251.anInt2546, ((class251_8_.aClass251Array2725).length - class251.anInt2546 * -809980533 - 1));
					} else {
						int i_9_ = 0;
						IComponentDefinitions[] class251s;
						for (class251s = class251_8_.aClass251Array2726; (i_9_ < class251s.length && class251s[i_9_] != class251); i_9_++) {
							/* empty */
						}
						if (i_9_ < class251s.length) {
							Class687.method8116(class251s, i_9_ + 1, class251s, i_9_, class251s.length - i_9_ - 1);
							class251s[(class251_8_.aClass251Array2726.length - 1)] = class251;
						}
					}
				}
			} else {
				IComponentDefinitions[] class251s = class234.method3338(1877345864);
				int i_10_;
				for (i_10_ = 0; i_10_ < class251s.length && class251s[i_10_] != class251; i_10_++) {
					/* empty */
				}
				if (i_10_ < class251s.length) {
					Class687.method8116(class251s, 1 + i_10_, class251s, i_10_, class251s.length - i_10_ - 1);
					class251s[class251s.length - 1] = class251;
				}
			}
		}
	}

	static final void method2426(Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		int i_11_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class489.method5879(string, i_11_ == 1, 2097030051);
	}

	static final void method2427(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -515799474) != null)
			string = string.substring(0, string.length() - 1);
		class251.onClickHook = Class33.method796(string, class668, (short) -21106);
		class251.hasComponentHook = true;
	}

	static int method2428(CharSequence charsequence, int i, boolean bool, int i_12_) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_13_ = false;
		boolean bool_14_ = false;
		int i_15_ = 0;
		int i_16_ = charsequence.length();
		for (int i_17_ = 0; i_17_ < i_16_; i_17_++) {
			int i_18_ = charsequence.charAt(i_17_);
			if (i_17_ == 0) {
				if (45 == i_18_) {
					bool_13_ = true;
					continue;
				}
				if (43 == i_18_ && bool)
					continue;
			}
			if (i_18_ >= 48 && i_18_ <= 57)
				i_18_ -= 48;
			else if (i_18_ >= 65 && i_18_ <= 90)
				i_18_ -= 55;
			else if (i_18_ >= 97 && i_18_ <= 122)
				i_18_ -= 87;
			else
				throw new NumberFormatException();
			if (i_18_ >= i)
				throw new NumberFormatException();
			if (bool_13_)
				i_18_ = -i_18_;
			int i_19_ = i_15_ * i + i_18_;
			if (i_15_ != i_19_ / i)
				throw new NumberFormatException();
			i_15_ = i_19_;
			bool_14_ = true;
		}
		if (!bool_14_)
			throw new NumberFormatException();
		return i_15_;
	}

	static final void method2429(IComponentDefinitions class251, Class234 class234, Class668 class668, byte i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -1435460688) != null)
			string = string.substring(0, string.length() - 1);
		class251.onHoldHook = Class33.method796(string, class668, (short) -26427);
		class251.hasComponentHook = true;
	}

	static void method2430(byte i) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(14, 0L);
		class536_sub18_sub5.method10669(-1541420434);
	}
}
