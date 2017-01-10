/* Class536_Sub18_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub18_Sub9 extends Class536_Sub18 {
	String aString11707;
	int anInt11708;
	int anInt11709;
	int anInt11710;
	long aLong11711;
	String aString11712;
	int anInt11713;
	boolean aBool11714;
	boolean aBool11715;
	String aString11716;
	boolean aBool11717;
	int anInt11718;
	long aLong11719;

	Class536_Sub18_Sub9(String string, String string_0_, int i, int i_1_, int i_2_, long l, int i_3_, int i_4_, boolean bool, boolean bool_5_, long l_6_, boolean bool_7_) {
		aString11712 = string_0_;
		aString11716 = string;
		anInt11709 = i * 29114659;
		anInt11718 = 2075636909 * i_1_;
		anInt11710 = i_2_ * 1328004947;
		aLong11711 = 2090502674932736451L * l;
		anInt11713 = -1810081741 * i_3_;
		anInt11708 = 1067746655 * i_4_;
		aBool11714 = bool;
		aBool11715 = bool_5_;
		aLong11719 = l_6_ * 6179382039436907421L;
		aBool11717 = bool_7_;
	}

	public long method10699() {
		return 4372728678228642485L * aLong11719;
	}

	public long method10700(int i) {
		return aLong11711 * 9092992429781309163L;
	}

	public long method10701() {
		return aLong11711 * 9092992429781309163L;
	}

	public long method10702() {
		return 4372728678228642485L * aLong11719;
	}

	public long method10703() {
		return 4372728678228642485L * aLong11719;
	}

	public long method10704() {
		return 4372728678228642485L * aLong11719;
	}

	public long method10705() {
		return 4372728678228642485L * aLong11719;
	}

	public long method10706(int i) {
		return 4372728678228642485L * aLong11719;
	}

	static boolean method10707(GraphicalRenderer class167, int i, int i_8_) {
		class167.method2084();
		Class249.method3450(1886001221);
		if (!class167.method2387(2094630559))
			return false;
		int i_9_ = client.aClass515_11066.method6321((byte) -46);
		int i_10_ = client.aClass515_11066.method6243(177401017);
		Class455 class455 = client.aClass515_11066.method6251(2023873427);
		Class553 class553 = client.aClass515_11066.method6249(1591184838);
		int i_11_ = i;
		if (null != Class565.MY_PLAYER) {
			int i_12_ = ((Class565.MY_PLAYER.screenX[0]) >> 3);
			int i_13_ = ((Class565.MY_PLAYER.screenY[0]) >> 3);
			if (i_12_ >= 0 && i_12_ < Class315_Sub1_Sub1.aBoolArrayArray11398.length && i_13_ >= 0 && (i_13_ < Class315_Sub1_Sub1.aBoolArrayArray11398[i_12_].length) && Class315_Sub1_Sub1.aBoolArrayArray11398[i_12_][i_13_])
				i_11_ = 0;
		}
		int i_14_ = i_9_ / 2;
		int i_15_ = 0;
		int i_16_ = 0;
		boolean bool = true;
		for (int i_17_ = i_15_; i_17_ < i_15_ + i_9_; i_17_++) {
			for (int i_18_ = i_16_; i_18_ < i_10_ + i_16_; i_18_++) {
				for (int i_19_ = i_11_; i_19_ <= 3; i_19_++) {
					if (i_19_ < i || class455.method5467(i, i_19_, i_17_, i_18_, 747920844)) {
						int i_20_ = i_19_;
						if (class455.method5466(i_17_, i_18_, (byte) -26))
							i_20_--;
						if (i_20_ >= 0)
							bool &= Class552.method6693(i_20_, i_17_, i_18_, 1026795716);
					}
				}
			}
		}
		if (!bool)
			return false;
		int i_21_ = 48 + i_9_ * 4 + 48;
		int[] is = new int[i_21_ * i_21_];
		for (int i_22_ = 0; i_22_ < is.length; i_22_++)
			is[i_22_] = 0;
		Class183_Sub2 class183_sub2 = null;
		int i_23_ = 0;
		int i_24_ = 0;
		if (Class101.aBool1196) {
			Class536_Sub8.aClass143_10432 = class167.method2050(i_21_, i_21_, false, true);
			class183_sub2 = class167.method2304();
			class183_sub2.method9035(0, Class536_Sub8.aClass143_10432.method1782());
			Interface21 interface21 = class167.method2386(i_21_, i_21_);
			class183_sub2.method9037(interface21);
			class167.method2028(class183_sub2, -409819235);
			i_14_ = i_9_;
			i_23_ = 48;
			i_24_ = 48;
			class167.method2000(1, 0);
		} else
			Class536_Sub8.aClass143_10432 = class167.createNativeSprite(is, 0, i_21_, i_21_, i_21_, (byte) -126);
		client.aClass515_11066.method6252(1796531619).method7616((byte) 117);
		int i_25_ = ~0xffffff | ((238 + (int) (Math.random() * 20.0) - 10 << 16) + (238 + (int) (Math.random() * 20.0) - 10 << 8) + (238 + (int) (Math.random() * 20.0) - 10));
		int i_26_ = ~0xffffff | 238 + (int) (Math.random() * 20.0) - 10 << 16;
		int i_27_ = ((int) (Math.random() * 8.0) << 16 | (int) (Math.random() * 8.0) << 8 | (int) (Math.random() * 8.0));
		boolean[][] bools = new boolean[2 + (i_14_ + 1)][2 + (i_14_ + 1)];
		class167.method2049(Class101.anIntArray1209);
		class167.method2047();
		for (int i_28_ = i_15_; i_28_ < i_15_ + i_9_; i_28_ += i_14_) {
			for (int i_29_ = i_16_; i_29_ < i_16_ + i_10_; i_29_ += i_14_) {
				int i_30_ = i_23_;
				int i_31_ = i_24_;
				int i_32_ = i_28_;
				if (i_32_ > 0) {
					i_32_--;
					i_30_ += 4;
				}
				int i_33_ = i_29_;
				if (i_33_ > 0)
					i_33_--;
				int i_34_ = i_14_ + i_28_;
				if (i_34_ < i_9_)
					i_34_++;
				int i_35_ = i_29_ + i_14_;
				if (i_35_ < i_10_) {
					i_35_++;
					i_31_ += 4;
				}
				if (Class101.aBool1195)
					class167.method2051();
				else
					class167.method2369(0, 0, i_30_ + 4 * i_14_, i_14_ * 4 + i_31_);
				class167.method2000(3, -16777216);
				int i_36_ = i_14_;
				if (i_36_ > i_9_ - 1)
					i_36_ = i_9_ - 1;
				for (int i_37_ = i_11_; i_37_ <= 3; i_37_++) {
					for (int i_38_ = 0; i_38_ <= i_36_; i_38_++) {
						for (int i_39_ = 0; i_39_ <= i_36_; i_39_++)
							bools[i_38_][i_39_] = (i_37_ < i || class455.method5467(i, i_37_, i_32_ + i_38_, i_39_ + i_33_, 747920844));
					}
					class553.aClass160Array7459[i_37_].method1943(i_23_, i_24_, 1024, i_32_, i_33_, i_34_, i_35_, bools);
					for (int i_40_ = -4; i_40_ < i_14_; i_40_++) {
						for (int i_41_ = -4; i_41_ < i_14_; i_41_++) {
							int i_42_ = i_40_ + i_28_;
							int i_43_ = i_29_ + i_41_;
							if (i_42_ >= i_15_ && i_43_ >= i_16_ && (i_37_ < i || class455.method5467(i, i_37_, i_42_, i_43_, 747920844))) {
								int i_44_ = i_37_;
								if (class455.method5466(i_42_, i_43_, (byte) -108))
									i_44_--;
								if (i_44_ >= 0)
									Class507.method6171(class167, i_44_, i_42_, i_43_, i_30_ + 4 * i_40_, (i_31_ + 4 * (i_14_ - i_41_) - 4), i_25_, i_26_, 1754634062);
							}
						}
					}
				}
				class167.method2063(i_30_, i_31_, 4 * i_14_, 4 * i_14_, i_27_, 2);
				class167.method2084();
				if (!Class101.aBool1196) {
					Class536_Sub8.aClass143_10432.method1726(48 + (i_28_ - i_15_) * 4, i_10_ * 4 + 48 - 4 * (i_29_ - i_16_) - 4 * i_14_, i_14_ * 4, 4 * i_14_, i_30_, i_31_);
					if (Class101.aBool1195) {
						Class536_Sub8.aClass143_10432.method1728(256, 0);
						try {
							class167.method2002((byte) 114);
							Class212.method3067(2000L);
						} catch (Exception exception) {
							/* empty */
						}
					}
				}
			}
		}
		if (Class101.aBool1196) {
			class167.method2029(class183_sub2, (byte) 1);
			if (Class101.aBool1195) {
				Class536_Sub8.aClass143_10432.method1728(256, 0);
				try {
					class167.method2002((byte) 98);
					Class212.method3067(2000L);
				} catch (Exception exception) {
					/* empty */
				}
			}
		}
		class167.method2051();
		class167.method2048(Class101.anIntArray1209[0], Class101.anIntArray1209[1], Class101.anIntArray1209[2], Class101.anIntArray1209[3]);
		class167.method2000(1, 1);
		Class552.method6692(-1762447523);
		Class101.anInt1199 = 0;
		Class101.aClass708_1197.method8304(454036827);
		if (!Class101.aBool1207) {
			FlickeringSetting.method10092(i, 643213747);
			Class543 class543 = client.aClass515_11066.method6244((byte) -109);
			if (null != class543) {
				Class398_Sub1.aClass34_Sub8_10110.method10330(1024, 64, 808161328);
				Class598 class598 = client.aClass515_11066.method6255(-1921400371);
				for (int i_45_ = 0; i_45_ < class543.anInt7234 * -1605869619; i_45_++) {
					int i_46_ = class543.anIntArray7235[i_45_];
					if (Class565.MY_PLAYER.aByte10839 == i_46_ >> 28) {
						int i_47_ = ((i_46_ >> 14 & 0x3fff) - 1858049507 * class598.anInt7839);
						int i_48_ = ((i_46_ & 0x3fff) - class598.anInt7840 * 1479112045);
						if (i_47_ >= 0 && i_47_ < i_9_ && i_48_ >= 0 && i_48_ < i_10_)
							Class101.aClass708_1197.method8335(new IntParam(i_45_), 452589636);
						else {
							Class248 class248 = ((Class248) (Class398_Sub1.aClass34_Sub8_10110.method70(class543.anIntArray7236[i_45_], (byte) -53)));
							if (class248.anIntArray2497 != null && (-2077796911 * class248.anInt2490 + i_47_ >= 0) && (-10405275 * class248.anInt2507 + i_47_ < i_9_) && i_48_ + class248.anInt2510 * 1889839503 >= 0 && (-1552833791 * class248.anInt2520 + i_48_ < i_10_))
								Class101.aClass708_1197.method8335(new IntParam(i_45_), 823918111);
						}
					}
				}
				Class398_Sub1.aClass34_Sub8_10110.method10330(128, 64, -1732757351);
			}
		}
		return true;
	}
}
