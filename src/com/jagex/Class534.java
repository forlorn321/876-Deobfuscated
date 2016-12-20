/* Class534 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class534 {
	int anInt7209;
	int anInt7210;
	Class540[] aClass540Array7211;
	int anInt7212;
	Class519 this$0;
	public static Class553 aClass553_7213;

	void method8945() {
		int i = 1 << anInt7209 * 711494715 + 1456398923 * anInt7210;
		for (int i_0_ = 0; i_0_ < i; i_0_++)
			aClass540Array7211[i_0_].method9005(1604459782);
	}

	Class540 method8946(int i, byte i_1_) {
		return (aClass540Array7211[(((i_1_ & 0xff) >>> 8 - 711494715 * anInt7209) + ((i & -1256087757 * anInt7212) << 711494715 * anInt7209))]);
	}

	void method8947(int i) {
		int i_2_ = 1 << anInt7209 * 711494715 + 1456398923 * anInt7210;
		for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
			aClass540Array7211[i_3_].method9005(1355500771);
	}

	Class540 method8948(int i, byte i_4_, int i_5_) {
		return (aClass540Array7211[(((i_4_ & 0xff) >>> 8 - 711494715 * anInt7209) + ((i & -1256087757 * anInt7212) << 711494715 * anInt7209))]);
	}

	void method8949(int i, int i_6_) {
		if (null == aClass540Array7211 || i_6_ != anInt7209 * 711494715 || 1456398923 * anInt7210 != i) {
			anInt7210 = i * -689612957;
			anInt7212 = -1066961925 * ((1 << i) - 1);
			anInt7209 = i_6_ * 1127116019;
			int i_7_ = 1 << anInt7210 * 1456398923 + anInt7209 * 711494715;
			aClass540Array7211 = new Class540[i_7_];
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
				aClass540Array7211[i_8_] = new Class540(this);
		}
	}

	void method8950() {
		int i = 1 << anInt7209 * 711494715 + 1456398923 * anInt7210;
		for (int i_9_ = 0; i_9_ < i; i_9_++)
			aClass540Array7211[i_9_].method9005(2124286493);
	}

	Class534(Class519 class519) {
		this$0 = class519;
	}

	void method8951() {
		int i = 1 << anInt7209 * 711494715 + 1456398923 * anInt7210;
		for (int i_10_ = 0; i_10_ < i; i_10_++)
			aClass540Array7211[i_10_].method9005(1995966849);
	}

	void method8952() {
		int i = 1 << anInt7209 * 711494715 + 1456398923 * anInt7210;
		for (int i_11_ = 0; i_11_ < i; i_11_++)
			aClass540Array7211[i_11_].method9005(1681970087);
	}

	Class540 method8953(int i, byte i_12_) {
		return (aClass540Array7211[(((i_12_ & 0xff) >>> 8 - 711494715 * anInt7209) + ((i & -1256087757 * anInt7212) << 711494715 * anInt7209))]);
	}

	void method8954(int i, int i_13_, int i_14_) {
		if (null == aClass540Array7211 || i_13_ != anInt7209 * 711494715 || 1456398923 * anInt7210 != i) {
			anInt7210 = i * -689612957;
			anInt7212 = -1066961925 * ((1 << i) - 1);
			anInt7209 = i_13_ * 1127116019;
			int i_15_ = 1 << anInt7210 * 1456398923 + anInt7209 * 711494715;
			aClass540Array7211 = new Class540[i_15_];
			for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
				aClass540Array7211[i_16_] = new Class540(this);
		}
	}

	static final void method8955(Class527_Sub38_Sub2 class527_sub38_sub2, int i) {
		int i_17_ = 0;
		class527_sub38_sub2.method18450(1783670011);
		for (int i_18_ = 0; i_18_ < 351100807 * Class105.anInt1300; i_18_++) {
			int i_19_ = Class105.anIntArray1301[i_18_];
			if (0 == (Class105.aByteArray1295[i_19_] & 0x1)) {
				if (i_17_ > 0) {
					i_17_--;
					Class105.aByteArray1295[i_19_] |= 0x2;
				} else {
					int i_20_ = class527_sub38_sub2.method18469(1, 676618944);
					if (0 == i_20_) {
						i_17_ = Class614.method10175(class527_sub38_sub2, (byte) 118);
						Class105.aByteArray1295[i_19_] |= 0x2;
					} else
						Class220.method4071(class527_sub38_sub2, i_19_, -456655989);
				}
			}
		}
		class527_sub38_sub2.method18452(1695476741);
		if (0 != i_17_)
			throw new RuntimeException();
		class527_sub38_sub2.method18450(1621362018);
		for (int i_21_ = 0; i_21_ < Class105.anInt1300 * 351100807; i_21_++) {
			int i_22_ = Class105.anIntArray1301[i_21_];
			if (0 != (Class105.aByteArray1295[i_22_] & 0x1)) {
				if (i_17_ > 0) {
					i_17_--;
					Class105.aByteArray1295[i_22_] |= 0x2;
				} else {
					int i_23_ = class527_sub38_sub2.method18469(1, -2088661778);
					if (0 == i_23_) {
						i_17_ = Class614.method10175(class527_sub38_sub2, (byte) 120);
						Class105.aByteArray1295[i_22_] |= 0x2;
					} else
						Class220.method4071(class527_sub38_sub2, i_22_, -456655989);
				}
			}
		}
		class527_sub38_sub2.method18452(1897542194);
		if (0 != i_17_)
			throw new RuntimeException();
		class527_sub38_sub2.method18450(2118599225);
		for (int i_24_ = 0; i_24_ < Class105.anInt1302 * 1242229167; i_24_++) {
			int i_25_ = Class105.anIntArray1303[i_24_];
			if (0 != (Class105.aByteArray1295[i_25_] & 0x1)) {
				if (i_17_ > 0) {
					i_17_--;
					Class105.aByteArray1295[i_25_] |= 0x2;
				} else {
					int i_26_ = class527_sub38_sub2.method18469(1, 2070144840);
					if (0 == i_26_) {
						i_17_ = Class614.method10175(class527_sub38_sub2, (byte) 111);
						Class105.aByteArray1295[i_25_] |= 0x2;
					} else if (Class522_Sub6.method15992(class527_sub38_sub2, i_25_, 572216246))
						Class105.aByteArray1295[i_25_] |= 0x2;
				}
			}
		}
		class527_sub38_sub2.method18452(1788722525);
		if (0 != i_17_)
			throw new RuntimeException();
		class527_sub38_sub2.method18450(2136473934);
		for (int i_27_ = 0; i_27_ < 1242229167 * Class105.anInt1302; i_27_++) {
			int i_28_ = Class105.anIntArray1303[i_27_];
			if (0 == (Class105.aByteArray1295[i_28_] & 0x1)) {
				if (i_17_ > 0) {
					i_17_--;
					Class105.aByteArray1295[i_28_] |= 0x2;
				} else {
					int i_29_ = class527_sub38_sub2.method18469(1, -2041864739);
					if (0 == i_29_) {
						i_17_ = Class614.method10175(class527_sub38_sub2, (byte) 104);
						Class105.aByteArray1295[i_28_] |= 0x2;
					} else if (Class522_Sub6.method15992(class527_sub38_sub2, i_28_, 1475258700))
						Class105.aByteArray1295[i_28_] |= 0x2;
				}
			}
		}
		class527_sub38_sub2.method18452(1590452886);
		if (0 != i_17_)
			throw new RuntimeException();
		Class105.anInt1300 = 0;
		Class105.anInt1302 = 0;
		for (int i_30_ = 1; i_30_ < 2048; i_30_++) {
			Class105.aByteArray1295[i_30_] >>= 1;
			Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_30_];
			if (null != class640_sub1_sub2_sub1_sub2)
				Class105.anIntArray1301[(Class105.anInt1300 += -858376649) * 351100807 - 1] = i_30_;
			else
				Class105.anIntArray1303[(Class105.anInt1302 += 410783055) * 1242229167 - 1] = i_30_;
		}
	}

	public static final void method8956(int i) {
		Class629.anImage8217 = null;
		Class515.aFont7021 = null;
	}

	public static Class527_Sub8_Sub11 method8957(int i, int i_31_, byte i_32_) {
		Class271 class271 = (Class271) Class264.aMap2869.get(Integer.valueOf(i));
		return class271.method5066(i_31_, (byte) 24);
	}
}
