/* Class580 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class580 {
	Class580() throws Throwable {
		throw new Error();
	}

	public static void method9657(float f, Class442 class442, Class442 class442_0_, Class442 class442_1_, Class442 class442_2_, Class442 class442_3_, float f_4_, float f_5_, float f_6_, float f_7_) {
		if (!class442_0_.method7177(class442)) {
			Class442 class442_8_ = Class442.method7155(class442_0_, class442);
			float f_9_ = class442_8_.method7160();
			if (f_4_ > 0.0F) {
				class442_2_ = Class442.method7139(class442_2_);
				class442_2_.method7164(f_5_ * (f_9_ / f_4_));
			}
			if (class442_2_.aFloat4918 == Float.POSITIVE_INFINITY || Float.isNaN(class442.aFloat4918) || f_9_ > f_6_) {
				class442.method7146(class442_0_);
				class442_1_.method7211();
			} else {
				Class442 class442_10_ = Class442.method7139(class442_1_);
				class442_10_.method7147();
				Class442 class442_11_ = Class442.method7191(class442_10_, class442_2_);
				Class442 class442_12_ = Class442.method7163(class442_10_, class442_11_);
				class442_12_.method7164(0.5F);
				Class442 class442_13_ = Class442.method7139(class442_1_);
				Class442 class442_14_ = Class442.method7139(class442_8_);
				class442_14_.method7147();
				if (class442_12_.aFloat4918 > class442_14_.aFloat4918) {
					if (class442_8_.aFloat4918 < 0.0F) {
						class442_13_.aFloat4918 += class442_2_.aFloat4918 * f;
						if (class442_13_.aFloat4918 > 0.0F)
							class442_13_.aFloat4918 = 0.0F;
					} else {
						class442_13_.aFloat4918 -= f * class442_2_.aFloat4918;
						if (class442_13_.aFloat4918 < 0.0F)
							class442_13_.aFloat4918 = 0.0F;
					}
				} else if (class442_10_.aFloat4918 < class442_3_.aFloat4918) {
					if (class442_8_.aFloat4918 < 0.0F) {
						class442_13_.aFloat4918 -= f * class442_2_.aFloat4918;
						if (class442_13_.aFloat4918 < -class442_3_.aFloat4918)
							class442_13_.aFloat4918 = -class442_3_.aFloat4918;
					} else {
						class442_13_.aFloat4918 += class442_2_.aFloat4918 * f;
						if (class442_13_.aFloat4918 > class442_3_.aFloat4918)
							class442_13_.aFloat4918 = class442_3_.aFloat4918;
					}
				}
				if (class442_12_.aFloat4915 > class442_14_.aFloat4915) {
					if (class442_8_.aFloat4915 < 0.0F) {
						class442_13_.aFloat4915 += class442_2_.aFloat4915 * f;
						if (class442_13_.aFloat4915 > 0.0F)
							class442_13_.aFloat4915 = 0.0F;
					} else {
						class442_13_.aFloat4915 -= f * class442_2_.aFloat4915;
						if (class442_13_.aFloat4915 < 0.0F)
							class442_13_.aFloat4915 = 0.0F;
					}
				} else if (class442_10_.aFloat4915 < class442_3_.aFloat4915) {
					if (class442_8_.aFloat4915 < 0.0F) {
						class442_13_.aFloat4915 -= f * class442_2_.aFloat4915;
						if (class442_13_.aFloat4915 < -class442_3_.aFloat4915)
							class442_13_.aFloat4915 = -class442_3_.aFloat4915;
					} else {
						class442_13_.aFloat4915 += class442_2_.aFloat4915 * f;
						if (class442_13_.aFloat4915 > class442_3_.aFloat4915)
							class442_13_.aFloat4915 = class442_3_.aFloat4915;
					}
				}
				if (class442_12_.aFloat4919 > class442_14_.aFloat4919) {
					if (class442_8_.aFloat4919 < 0.0F) {
						class442_13_.aFloat4919 += f * class442_2_.aFloat4919;
						if (class442_13_.aFloat4919 > 0.0F)
							class442_13_.aFloat4919 = 0.0F;
					} else {
						class442_13_.aFloat4919 -= f * class442_2_.aFloat4919;
						if (class442_13_.aFloat4919 < 0.0F)
							class442_13_.aFloat4919 = 0.0F;
					}
				} else if (class442_10_.aFloat4919 < class442_3_.aFloat4919) {
					if (class442_8_.aFloat4919 < 0.0F) {
						class442_13_.aFloat4919 -= class442_2_.aFloat4919 * f;
						if (class442_13_.aFloat4919 < -class442_3_.aFloat4919)
							class442_13_.aFloat4919 = -class442_3_.aFloat4919;
					} else {
						class442_13_.aFloat4919 += class442_2_.aFloat4919 * f;
						if (class442_13_.aFloat4919 > class442_3_.aFloat4919)
							class442_13_.aFloat4919 = class442_3_.aFloat4919;
					}
				}
				class442_1_.method7172(class442_13_, 0.8F);
				if (f_9_ < f_7_ && class442_1_.method7160() < f_7_) {
					class442.method7146(class442_0_);
					class442_1_.method7211();
				} else
					class442.method7219(Class442.method7168(class442_1_, f));
				class442_10_.method7141();
				class442_13_.method7141();
				class442_14_.method7141();
			}
		}
	}

	public static void method9658(float f, Class442 class442, Class442 class442_15_, Class442 class442_16_, Class442 class442_17_, Class442 class442_18_, float f_19_, float f_20_, float f_21_, float f_22_) {
		if (!class442_15_.method7177(class442)) {
			Class442 class442_23_ = Class442.method7155(class442_15_, class442);
			float f_24_ = class442_23_.method7160();
			if (f_19_ > 0.0F) {
				class442_17_ = Class442.method7139(class442_17_);
				class442_17_.method7164(f_20_ * (f_24_ / f_19_));
			}
			if (class442_17_.aFloat4918 == Float.POSITIVE_INFINITY || Float.isNaN(class442.aFloat4918) || f_24_ > f_21_) {
				class442.method7146(class442_15_);
				class442_16_.method7211();
			} else {
				Class442 class442_25_ = Class442.method7139(class442_16_);
				class442_25_.method7147();
				Class442 class442_26_ = Class442.method7191(class442_25_, class442_17_);
				Class442 class442_27_ = Class442.method7163(class442_25_, class442_26_);
				class442_27_.method7164(0.5F);
				Class442 class442_28_ = Class442.method7139(class442_16_);
				Class442 class442_29_ = Class442.method7139(class442_23_);
				class442_29_.method7147();
				if (class442_27_.aFloat4918 > class442_29_.aFloat4918) {
					if (class442_23_.aFloat4918 < 0.0F) {
						class442_28_.aFloat4918 += class442_17_.aFloat4918 * f;
						if (class442_28_.aFloat4918 > 0.0F)
							class442_28_.aFloat4918 = 0.0F;
					} else {
						class442_28_.aFloat4918 -= f * class442_17_.aFloat4918;
						if (class442_28_.aFloat4918 < 0.0F)
							class442_28_.aFloat4918 = 0.0F;
					}
				} else if (class442_25_.aFloat4918 < class442_18_.aFloat4918) {
					if (class442_23_.aFloat4918 < 0.0F) {
						class442_28_.aFloat4918 -= f * class442_17_.aFloat4918;
						if (class442_28_.aFloat4918 < -class442_18_.aFloat4918)
							class442_28_.aFloat4918 = -class442_18_.aFloat4918;
					} else {
						class442_28_.aFloat4918 += class442_17_.aFloat4918 * f;
						if (class442_28_.aFloat4918 > class442_18_.aFloat4918)
							class442_28_.aFloat4918 = class442_18_.aFloat4918;
					}
				}
				if (class442_27_.aFloat4915 > class442_29_.aFloat4915) {
					if (class442_23_.aFloat4915 < 0.0F) {
						class442_28_.aFloat4915 += class442_17_.aFloat4915 * f;
						if (class442_28_.aFloat4915 > 0.0F)
							class442_28_.aFloat4915 = 0.0F;
					} else {
						class442_28_.aFloat4915 -= f * class442_17_.aFloat4915;
						if (class442_28_.aFloat4915 < 0.0F)
							class442_28_.aFloat4915 = 0.0F;
					}
				} else if (class442_25_.aFloat4915 < class442_18_.aFloat4915) {
					if (class442_23_.aFloat4915 < 0.0F) {
						class442_28_.aFloat4915 -= f * class442_17_.aFloat4915;
						if (class442_28_.aFloat4915 < -class442_18_.aFloat4915)
							class442_28_.aFloat4915 = -class442_18_.aFloat4915;
					} else {
						class442_28_.aFloat4915 += class442_17_.aFloat4915 * f;
						if (class442_28_.aFloat4915 > class442_18_.aFloat4915)
							class442_28_.aFloat4915 = class442_18_.aFloat4915;
					}
				}
				if (class442_27_.aFloat4919 > class442_29_.aFloat4919) {
					if (class442_23_.aFloat4919 < 0.0F) {
						class442_28_.aFloat4919 += f * class442_17_.aFloat4919;
						if (class442_28_.aFloat4919 > 0.0F)
							class442_28_.aFloat4919 = 0.0F;
					} else {
						class442_28_.aFloat4919 -= f * class442_17_.aFloat4919;
						if (class442_28_.aFloat4919 < 0.0F)
							class442_28_.aFloat4919 = 0.0F;
					}
				} else if (class442_25_.aFloat4919 < class442_18_.aFloat4919) {
					if (class442_23_.aFloat4919 < 0.0F) {
						class442_28_.aFloat4919 -= class442_17_.aFloat4919 * f;
						if (class442_28_.aFloat4919 < -class442_18_.aFloat4919)
							class442_28_.aFloat4919 = -class442_18_.aFloat4919;
					} else {
						class442_28_.aFloat4919 += class442_17_.aFloat4919 * f;
						if (class442_28_.aFloat4919 > class442_18_.aFloat4919)
							class442_28_.aFloat4919 = class442_18_.aFloat4919;
					}
				}
				class442_16_.method7172(class442_28_, 0.8F);
				if (f_24_ < f_22_ && class442_16_.method7160() < f_22_) {
					class442.method7146(class442_15_);
					class442_16_.method7211();
				} else
					class442.method7219(Class442.method7168(class442_16_, f));
				class442_25_.method7141();
				class442_28_.method7141();
				class442_29_.method7141();
			}
		}
	}

	static final void method9659(Class243 class243, Class240 class240, Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, -1944844147) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2651 = Class103.method1800(string, class665, (byte) -31);
		class243.aBool2606 = true;
	}

	static final void method9660(Class665 class665, int i) {
		class665.anInt8526 -= 614285046;
		int i_30_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		if (i_30_ >= 2)
			throw new RuntimeException();
		client.anInt11124 = i_30_ * 709159557;
		int i_31_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		if (i_31_ + 1 >= (client.anIntArrayArrayArray11148[client.anInt11124 * -1980203443]).length >> 1)
			throw new RuntimeException();
		client.anInt11126 = 1269239209 * i_31_;
		client.anInt11128 = 0;
		client.anInt11033 = (class665.anIntArray8525[2 + class665.anInt8526 * 1769813785] * 933404291);
		client.anInt11130 = (1984633349 * class665.anIntArray8525[1769813785 * class665.anInt8526 + 3]);
		int i_32_ = class665.anIntArray8525[4 + 1769813785 * class665.anInt8526];
		if (i_32_ >= 2)
			throw new RuntimeException();
		client.anInt11125 = i_32_ * -1118587303;
		int i_33_ = class665.anIntArray8525[5 + class665.anInt8526 * 1769813785];
		if (i_33_ + 1 >= (client.anIntArrayArrayArray11148[client.anInt11125 * 589836777]).length >> 1)
			throw new RuntimeException();
		client.anInt11079 = i_33_ * 937465371;
		Class30.anInt265 = 1160590772;
		Class452.anInt4964 = 1432081761;
		Class400.anInt4141 = -228665961;
	}

	static final void method9661(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = null == Class703.aClass219_8825 ? 0 : 1;
	}

	static final void method9662(Class665 class665, short i) {
		int i_34_ = class665.anIntArray8545[891367231 * class665.anInt8527];
		Class527_Sub8_Sub10 class527_sub8_sub10 = Class282.method5195(i_34_, 370390210);
		if (class527_sub8_sub10 == null)
			throw new RuntimeException();
		int[] is = new int[class527_sub8_sub10.anInt11726 * -1228779449];
		Object[] objects = new Object[class527_sub8_sub10.anInt11727 * 1563313657];
		long[] ls = new long[-1600507105 * class527_sub8_sub10.anInt11721];
		for (int i_35_ = 0; i_35_ < -450755967 * class527_sub8_sub10.anInt11728; i_35_++)
			is[i_35_] = (class665.anIntArray8525[i_35_ + (1769813785 * class665.anInt8526 - -450755967 * class527_sub8_sub10.anInt11728)]);
		for (int i_36_ = 0; i_36_ < 26758413 * class527_sub8_sub10.anInt11723; i_36_++)
			objects[i_36_] = (class665.anObjectArray8541[i_36_ + (318492261 * class665.anInt8528 - class527_sub8_sub10.anInt11723 * 26758413)]);
		for (int i_37_ = 0; i_37_ < class527_sub8_sub10.anInt11729 * -995706857; i_37_++)
			ls[i_37_] = (class665.aLongArray8529[(class665.anInt8530 * -2076258291 - -995706857 * class527_sub8_sub10.anInt11729 + i_37_)]);
		class665.anInt8526 -= class527_sub8_sub10.anInt11728 * 68230057;
		class665.anInt8528 -= -1749719671 * class527_sub8_sub10.anInt11723;
		class665.anInt8530 -= class527_sub8_sub10.anInt11729 * 597261235;
		Class659 class659 = new Class659();
		class659.aClass527_Sub8_Sub10_8494 = class665.aClass527_Sub8_Sub10_8548;
		class659.anInt8490 = class665.anInt8527 * -416557769;
		class659.anIntArray8492 = class665.anIntArray8546;
		class659.anObjectArray8493 = class665.anObjectArray8524;
		class659.aLongArray8495 = class665.aLongArray8547;
		if (-305384391 * class665.anInt8531 >= class665.aClass659Array8520.length)
			throw new RuntimeException();
		class665.aClass659Array8520[(class665.anInt8531 += -798524919) * -305384391 - 1] = class659;
		class665.aClass527_Sub8_Sub10_8548 = class527_sub8_sub10;
		class665.aClass501Array8521 = class665.aClass527_Sub8_Sub10_8548.aClass501Array11731;
		class665.anIntArray8545 = class665.aClass527_Sub8_Sub10_8548.anIntArray11724;
		class665.anInt8527 = 1038991169;
		class665.anIntArray8546 = is;
		class665.anObjectArray8524 = objects;
		class665.aLongArray8547 = ls;
	}

	static final void method9663(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_38_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_39_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		Class572.method9608(i_38_, i_39_ >> 14 & 0x3fff, i_39_ & 0x3fff, true, 2064324456);
	}
}
