/* Class536_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub1 extends Class536 {
	int[] anIntArray10300;
	static Class199 aClass199_10301;
	static int anInt10302;
	static Class4 aClass4_10303 = new Class4(32);
	int[] anIntArray10304 = { -1 };
	Class21[] aClass21Array10305;

	final Class177 method9346(Class167 class167, int i, Class688 class688, int i_0_, boolean bool, Class617 class617, int i_1_) {
		Class177 class177 = null;
		int i_2_ = i;
		Class589 class589 = null;
		if (-1 != i_0_)
			class589 = (Class589) Class497.aClass34_Sub16_5554.method70(i_0_, (byte) 11);
		int[] is = anIntArray10304;
		if (class589 != null && null != class589.anIntArray7760) {
			is = new int[class589.anIntArray7760.length];
			for (int i_3_ = 0; i_3_ < class589.anIntArray7760.length; i_3_++) {
				int i_4_ = class589.anIntArray7760[i_3_];
				if (i_4_ >= 0 && i_4_ < anIntArray10304.length)
					is[i_3_] = anIntArray10304[i_4_];
				else
					is[i_3_] = -1;
			}
		}
		if (null != class688)
			i_2_ |= class688.method8162((byte) 17);
		long l = method9349(is, i_0_, class617 != null ? class617.anIntArray8072 : null, bool, -407561573);
		if (null != aClass199_10301)
			class177 = (Class177) aClass199_10301.method2886(l);
		if (class177 == null || class167.method2308(class177.method2466(), i_2_) != 0) {
			if (class177 != null)
				i_2_ = class167.method2068(i_2_, class177.method2466());
			int i_5_ = i_2_;
			boolean bool_6_ = false;
			for (int i_7_ = 0; i_7_ < is.length; i_7_++) {
				if (-1 != is[i_7_] && !((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(is[i_7_], (byte) 6)).method515(bool, null, 1585092918))
					bool_6_ = true;
			}
			if (bool_6_)
				return null;
			Class180[] class180s = new Class180[is.length];
			for (int i_8_ = 0; i_8_ < is.length; i_8_++) {
				if (-1 != is[i_8_])
					class180s[i_8_] = ((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(is[i_8_], (byte) 2)).method509(bool, null, 2055272488);
			}
			if (null != class589 && class589.anIntArrayArray7749 != null) {
				for (int i_9_ = 0; i_9_ < class589.anIntArrayArray7749.length; i_9_++) {
					if (null != class589.anIntArrayArray7749[i_9_] && null != class180s[i_9_]) {
						int i_10_ = class589.anIntArrayArray7749[i_9_][0];
						int i_11_ = class589.anIntArrayArray7749[i_9_][1];
						int i_12_ = class589.anIntArrayArray7749[i_9_][2];
						int i_13_ = class589.anIntArrayArray7749[i_9_][3];
						int i_14_ = class589.anIntArrayArray7749[i_9_][4];
						int i_15_ = class589.anIntArrayArray7749[i_9_][5];
						if (0 != i_13_ || 0 != i_14_ || i_15_ != 0)
							class180s[i_9_].method2711(i_13_, i_14_, i_15_);
						if (0 != i_10_ || 0 != i_11_ || 0 != i_12_)
							class180s[i_9_].method2705(i_10_, i_11_, i_12_);
					}
				}
			}
			Class180 class180 = new Class180(class180s, class180s.length);
			if (class617 != null)
				i_5_ |= 0x4000;
			class177 = class167.method2093(class180, i_5_, 960133935 * anInt10302, 65, 853);
			if (class617 != null) {
				for (int i_16_ = 0; i_16_ < 10; i_16_++) {
					for (int i_17_ = 0; i_17_ < Class500.aShortArrayArray6844[i_16_].length; i_17_++) {
						if (class617.anIntArray8072[i_16_] < (Class267.aShortArrayArrayArray2870[i_16_][i_17_]).length)
							class177.method2507(Class500.aShortArrayArray6844[i_16_][i_17_], (Class267.aShortArrayArrayArray2870[i_16_][i_17_][class617.anIntArray8072[i_16_]]));
					}
				}
				for (int i_18_ = 0; i_18_ < 10; i_18_++) {
					for (int i_19_ = 0; (i_19_ < Class710_Sub4.aShortArrayArray10822[i_18_].length); i_19_++) {
						if (class617.anIntArray8075[i_18_] < (Class44.aShortArrayArrayArray520[i_18_][i_19_]).length)
							class177.method2509((Class710_Sub4.aShortArrayArray10822[i_18_][i_19_]), (Class44.aShortArrayArrayArray520[i_18_][i_19_][(class617.anIntArray8075[i_18_])]));
					}
				}
			}
			if (null != aClass199_10301) {
				class177.method2465(i_2_);
				aClass199_10301.method2881(class177, l);
			}
		}
		if (null == class688)
			return class177;
		Class177 class177_20_ = class177.method2623((byte) 1, i_2_, true);
		class688.method8132(class177_20_, 0, -1598107883);
		return class177_20_;
	}

	Class536_Sub1() {
		anIntArray10300 = new int[] { 0 };
		aClass21Array10305 = null;
	}

	static void method9347(int i) {
		anInt10302 = 2045946831 * i;
		aClass199_10301.method2884((byte) -103);
	}

	static void method9348(int i, boolean bool) {
		Class536_Sub1 class536_sub1 = Class659.method7970(i, bool, -1141114876);
		if (class536_sub1 != null) {
			for (int i_21_ = 0; i_21_ < class536_sub1.anIntArray10304.length; i_21_++) {
				class536_sub1.anIntArray10304[i_21_] = -1;
				class536_sub1.anIntArray10300[i_21_] = 0;
			}
			class536_sub1.aClass21Array10305 = null;
		}
	}

	long method9349(int[] is, int i, int[] is_22_, boolean bool, int i_23_) {
		long[] ls = RSByteBuffer.aLongArray10595;
		long l = -1L;
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (i >> 8)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) i) & 0xffL)];
		for (int i_24_ = 0; i_24_ < is.length; i_24_++) {
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_24_] >> 24)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_24_] >> 16)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_24_] >> 8)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) is[i_24_]) & 0xffL)];
		}
		if (null != is_22_) {
			for (int i_25_ = 0; i_25_ < 5; i_25_++)
				l = l >>> 8 ^ ls[(int) ((l ^ (long) is_22_[i_25_]) & 0xffL)];
		}
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (bool ? 1 : 0)) & 0xffL)];
		return l;
	}

	static {
		aClass199_10301 = new Class199(10);
	}

	static void method9350() {
		aClass4_10303.method561(-2117553523);
	}

	static void method9351() {
		aClass4_10303.method561(-2117553523);
	}

	static void method9352(int i, boolean bool) {
		Class536_Sub1 class536_sub1 = Class659.method7970(i, bool, -1269467774);
		if (class536_sub1 != null) {
			for (int i_26_ = 0; i_26_ < class536_sub1.anIntArray10304.length; i_26_++) {
				class536_sub1.anIntArray10304[i_26_] = -1;
				class536_sub1.anIntArray10300[i_26_] = 0;
			}
			class536_sub1.aClass21Array10305 = null;
		}
	}

	static void method9353() {
		aClass199_10301.method2884((byte) -126);
	}

	static void method9354() {
		aClass199_10301.method2884((byte) -68);
	}

	static void method9355() {
		aClass199_10301.method2884((byte) -110);
	}

	static final void method9356(Class668 class668, byte i) {
		int i_27_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_27_);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -2092413585 * class251.anInt2584;
	}
}
