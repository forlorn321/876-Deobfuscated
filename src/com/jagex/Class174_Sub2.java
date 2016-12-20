/* Class174_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class174_Sub2 extends Class174 {
	int[] anIntArray9113;
	Class147[] aClass147Array9114;
	Class147[] aClass147Array9115;
	int[] anIntArray9116;
	int[] anIntArray9117;
	Class180_Sub1 aClass180_Sub1_9118;
	int[] anIntArray9119;
	public static Class24_Sub17 aClass24_Sub17_9120;

	void method2760(char c, int i, int i_0_, int i_1_, boolean bool) {
		if (null != aClass180_Sub1_9118.anIntArray9386) {
			i += anIntArray9119[c];
			i_0_ += anIntArray9113[c];
			if (bool)
				aClass147Array9115[c].method2416(i, i_0_, 1, i_1_, 1);
			else
				aClass147Array9114[c].method2416(i, i_0_, 1, i_1_, 1);
		}
	}

	void method2758(char c, int i, int i_2_, int i_3_, boolean bool) {
		if (null != aClass180_Sub1_9118.anIntArray9386) {
			i += anIntArray9119[c];
			i_2_ += anIntArray9113[c];
			if (bool)
				aClass147Array9115[c].method2416(i, i_2_, 1, i_3_, 1);
			else
				aClass147Array9114[c].method2416(i, i_2_, 1, i_3_, 1);
		}
	}

	void method2759(char c, int i, int i_4_, int i_5_, boolean bool, Class142 class142, int i_6_, int i_7_) {
		/* empty */
	}

	Class174_Sub2(Class180_Sub1 class180_sub1, Class22 class22, Class185_Sub1[] class185_sub1s, int[] is, int[] is_8_) {
		super(class180_sub1, class22);
		aClass180_Sub1_9118 = class180_sub1;
		aClass180_Sub1_9118 = class180_sub1;
		anIntArray9116 = is;
		anIntArray9117 = is_8_;
		aClass147Array9114 = new Class147[class185_sub1s.length];
		aClass147Array9115 = new Class147[class185_sub1s.length];
		anIntArray9113 = new int[class185_sub1s.length];
		anIntArray9119 = new int[class185_sub1s.length];
		for (int i = 0; i < class185_sub1s.length; i++) {
			aClass147Array9114[i] = aClass180_Sub1_9118.method3271(class185_sub1s[i], false);
			int[] is_9_ = (int[]) class185_sub1s[i].method3584(false).clone();
			for (int i_10_ = 0; i_10_ < is_9_.length; i_10_++) {
				int i_11_ = is_9_[i_10_];
				int i_12_ = (byte) ((i_11_ & 0xff) + ((i_11_ >> 8 & 0xff) * 4 + (i_11_ >> 16 & 0xff) * 3) >> 3);
				is_9_[i_10_] = (is_9_[i_10_] & ~0xffffff | i_12_ << 16 | i_12_ << 8 | i_12_);
			}
			aClass147Array9115[i] = aClass180_Sub1_9118.method3162(is_9_, 0, anIntArray9116[i], anIntArray9116[i], anIntArray9117[i], false);
			anIntArray9113[i] = class185_sub1s[i].method3611();
			anIntArray9119[i] = class185_sub1s[i].method3634();
		}
	}

	void method2761(char c, int i, int i_13_, int i_14_, boolean bool) {
		if (null != aClass180_Sub1_9118.anIntArray9386) {
			i += anIntArray9119[c];
			i_13_ += anIntArray9113[c];
			if (bool)
				aClass147Array9115[c].method2416(i, i_13_, 1, i_14_, 1);
			else
				aClass147Array9114[c].method2416(i, i_13_, 1, i_14_, 1);
		}
	}

	void method2762(char c, int i, int i_15_, int i_16_, boolean bool, Class142 class142, int i_17_, int i_18_) {
		/* empty */
	}

	void method2763(char c, int i, int i_19_, int i_20_, boolean bool, Class142 class142, int i_21_, int i_22_) {
		/* empty */
	}

	static boolean method14596(Class249 class249, byte i) {
		if (null == class249)
			return false;
		if (null != class249.anIntArray2759) {
			class249 = class249.method4645(Class529_Sub1.anInterface20_7121, Class529_Sub1.anInterface18_7120, -1356438685);
			if (class249 == null)
				return false;
		}
		if (!class249.aBool2746)
			return false;
		if (!class249.method4638(Class529_Sub1.anInterface20_7121, Class529_Sub1.anInterface18_7120, 1949405825))
			return false;
		if (Class529_Sub1.aClass14_10788.method709((long) (1657285097 * class249.anInt2772)) != null)
			return false;
		if (Class529_Sub1.aClass14_10789.method709((long) (class249.anInt2777 * -1771553873)) != null)
			return false;
		if (null != class249.aString2737) {
			if (0 == 1365262055 * class249.anInt2741 && Class529_Sub1.aBool10790)
				return false;
			if (1 == class249.anInt2741 * 1365262055 && Class529_Sub1.aBool10792)
				return false;
			if (2 == class249.anInt2741 * 1365262055 && Class529_Sub1.aBool10793)
				return false;
		}
		return true;
	}
}
