/* Class184_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class184_Sub2 extends Class184 {
	int[] anIntArray9435;
	Class143[] aClass143Array9436;
	int[] anIntArray9437;
	Class143[] aClass143Array9438;
	int[] anIntArray9439;
	int[] anIntArray9440;
	Class167_Sub1 aClass167_Sub1_9441;
	public static Class211 aClass211_9442;
	public static Class461 aClass461_9443;

	void method2751(char c, int i, int i_0_, int i_1_, boolean bool, Class161 class161, int i_2_, int i_3_) {
		/* empty */
	}

	void method2752(char c, int i, int i_4_, int i_5_, boolean bool, Class161 class161, int i_6_, int i_7_) {
		/* empty */
	}

	void method2753(char c, int i, int i_8_, int i_9_, boolean bool) {
		if (null != aClass167_Sub1_9441.anIntArray8996) {
			i += anIntArray9437[c];
			i_8_ += anIntArray9440[c];
			if (bool)
				aClass143Array9438[c].method1729(i, i_8_, 1, i_9_, 1);
			else
				aClass143Array9436[c].method1729(i, i_8_, 1, i_9_, 1);
		}
	}

	void method2762(char c, int i, int i_10_, int i_11_, boolean bool) {
		if (null != aClass167_Sub1_9441.anIntArray8996) {
			i += anIntArray9437[c];
			i_10_ += anIntArray9440[c];
			if (bool)
				aClass143Array9438[c].method1729(i, i_10_, 1, i_11_, 1);
			else
				aClass143Array9436[c].method1729(i, i_10_, 1, i_11_, 1);
		}
	}

	void method2755(char c, int i, int i_12_, int i_13_, boolean bool) {
		if (null != aClass167_Sub1_9441.anIntArray8996) {
			i += anIntArray9437[c];
			i_12_ += anIntArray9440[c];
			if (bool)
				aClass143Array9438[c].method1729(i, i_12_, 1, i_13_, 1);
			else
				aClass143Array9436[c].method1729(i, i_12_, 1, i_13_, 1);
		}
	}

	void method2749(char c, int i, int i_14_, int i_15_, boolean bool, Class161 class161, int i_16_, int i_17_) {
		/* empty */
	}

	Class184_Sub2(Class167_Sub1 class167_sub1, Class2 class2, Class179_Sub1[] class179_sub1s, int[] is, int[] is_18_) {
		super(class167_sub1, class2);
		aClass167_Sub1_9441 = class167_sub1;
		aClass167_Sub1_9441 = class167_sub1;
		anIntArray9435 = is;
		anIntArray9439 = is_18_;
		aClass143Array9436 = new Class143[class179_sub1s.length];
		aClass143Array9438 = new Class143[class179_sub1s.length];
		anIntArray9440 = new int[class179_sub1s.length];
		anIntArray9437 = new int[class179_sub1s.length];
		for (int i = 0; i < class179_sub1s.length; i++) {
			aClass143Array9436[i] = aClass167_Sub1_9441.method2082(class179_sub1s[i], false);
			int[] is_19_ = (int[]) class179_sub1s[i].method2643(false).clone();
			for (int i_20_ = 0; i_20_ < is_19_.length; i_20_++) {
				int i_21_ = is_19_[i_20_];
				int i_22_ = (byte) ((i_21_ & 0xff) + ((i_21_ >> 8 & 0xff) * 4 + 3 * (i_21_ >> 16 & 0xff)) >> 3);
				is_19_[i_20_] = (is_19_[i_20_] & ~0xffffff | i_22_ << 16 | i_22_ << 8 | i_22_);
			}
			aClass143Array9438[i] = aClass167_Sub1_9441.method2080(is_19_, 0, anIntArray9435[i], anIntArray9435[i], anIntArray9439[i], false);
			anIntArray9440[i] = class179_sub1s[i].method2637();
			anIntArray9437[i] = class179_sub1s[i].method2635();
		}
	}

	void method2756(char c, int i, int i_23_, int i_24_, boolean bool, Class161 class161, int i_25_, int i_26_) {
		/* empty */
	}

	void method2757(char c, int i, int i_27_, int i_28_, boolean bool, Class161 class161, int i_29_, int i_30_) {
		/* empty */
	}

	static final void method8667(Class668 class668, int i) {
		class668.anInt8542 -= -1349181388;
		client.aShort11279 = (short) class668.anIntArray8541[class668.anInt8542 * 1867269829];
		if (client.aShort11279 <= 0)
			client.aShort11279 = (short) 1;
		client.aShort11280 = (short) (class668.anIntArray8541[1867269829 * class668.anInt8542 + 1]);
		if (client.aShort11280 <= 0)
			client.aShort11280 = (short) 32767;
		else if (client.aShort11280 < client.aShort11279)
			client.aShort11280 = client.aShort11279;
		client.aShort11255 = (short) (class668.anIntArray8541[2 + 1867269829 * class668.anInt8542]);
		if (client.aShort11255 <= 0)
			client.aShort11255 = (short) 1;
		client.aShort11282 = (short) (class668.anIntArray8541[3 + class668.anInt8542 * 1867269829]);
		if (client.aShort11282 <= 0)
			client.aShort11282 = (short) 32767;
		else if (client.aShort11282 < client.aShort11255)
			client.aShort11282 = client.aShort11255;
	}

	public static void method8668(int i, int i_31_) {
		Class51 class51 = (Class51) Class542_Sub1.aHashMap10719.get(Integer.valueOf(i));
		if (class51 == null)
			class51 = new Class51();
		class51.anInt588 = Class542_Sub1.anInt10716 * 1661477515;
		class51.anInt587 = Class542_Sub1.anInt10705 * 873200165;
		Class542_Sub1.aHashMap10719.put(Integer.valueOf(i), class51);
	}

	static final void method8669(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class61.anInt654 * 625930941;
	}
}
