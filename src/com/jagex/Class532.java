/* Class532 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class532 {
	public int[] anIntArray7206;
	public int[] anIntArray7207;
	public int anInt7208;

	public static Class532 method8922(Class459 class459, String string, boolean bool) {
		int i = class459.method7540(string, -1193884611);
		if (i == -1)
			return new Class532(0);
		byte[] is = class459.method7470(i, 1, (byte) -73);
		if (is == null)
			return new Class532(0);
		RSByteBuffer class527_sub38 = new RSByteBuffer(is);
		int i_0_ = class527_sub38.readUnsignedShort();
		Class532 class532 = new Class532(i_0_);
		int i_1_ = 0;
		while (i_1_ < -1479175311 * class532.anInt7208) {
			int i_2_ = class527_sub38.readInt();
			int i_3_ = class527_sub38.readUnsignedShort();
			int i_4_ = class527_sub38.readUnsignedByte();
			if (bool || 1 != i_4_) {
				class532.anIntArray7206[i_1_] = i_2_;
				class532.anIntArray7207[i_1_] = i_3_;
				i_1_++;
			} else
				class532.anInt7208 -= -245969519;
		}
		return class532;
	}

	public static Class532 method8923(Class459 class459, String string, boolean bool) {
		int i = class459.method7540(string, -1193884611);
		if (i == -1)
			return new Class532(0);
		byte[] is = class459.method7470(i, 1, (byte) -119);
		if (is == null)
			return new Class532(0);
		RSByteBuffer class527_sub38 = new RSByteBuffer(is);
		int i_5_ = class527_sub38.readUnsignedShort();
		Class532 class532 = new Class532(i_5_);
		int i_6_ = 0;
		while (i_6_ < -1479175311 * class532.anInt7208) {
			int i_7_ = class527_sub38.readInt();
			int i_8_ = class527_sub38.readUnsignedShort();
			int i_9_ = class527_sub38.readUnsignedByte();
			if (bool || 1 != i_9_) {
				class532.anIntArray7206[i_6_] = i_7_;
				class532.anIntArray7207[i_6_] = i_8_;
				i_6_++;
			} else
				class532.anInt7208 -= -245969519;
		}
		return class532;
	}

	public Class532(int i) {
		anInt7208 = i * -245969519;
		anIntArray7206 = new int[-1479175311 * anInt7208];
		anIntArray7207 = new int[anInt7208 * -1479175311];
	}

	static void method8924(String[] strings, int[] is, int i, int i_10_, int i_11_) {
		if (i < i_10_) {
			int i_12_ = (i_10_ + i) / 2;
			int i_13_ = i;
			String string = strings[i_12_];
			strings[i_12_] = strings[i_10_];
			strings[i_10_] = string;
			int i_14_ = is[i_12_];
			is[i_12_] = is[i_10_];
			is[i_10_] = i_14_;
			for (int i_15_ = i; i_15_ < i_10_; i_15_++) {
				if (null == string || (null != strings[i_15_] && strings[i_15_].compareTo(string) < (i_15_ & 0x1))) {
					String string_16_ = strings[i_15_];
					strings[i_15_] = strings[i_13_];
					strings[i_13_] = string_16_;
					int i_17_ = is[i_15_];
					is[i_15_] = is[i_13_];
					is[i_13_++] = i_17_;
				}
			}
			strings[i_10_] = strings[i_13_];
			strings[i_13_] = string;
			is[i_10_] = is[i_13_];
			is[i_13_] = i_14_;
			method8924(strings, is, i, i_13_ - 1, -128516472);
			method8924(strings, is, 1 + i_13_, i_10_, -1855830622);
		}
	}

	static final void method8925(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_18_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_19_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		class665.aClass382_8535.anIntArray3941[i_18_] = i_19_;
	}

	static final void method8926(Class665 class665, int i) {
		boolean bool = ((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) == 1);
		if (bool)
			Class393.method6490(2, -1684120519);
		else
			Class393.method6490(1, -1942575879);
	}

	static final void method8927(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		client.aShort11153 = (short) class665.anIntArray8525[class665.anInt8526 * 1769813785];
		if (client.aShort11153 <= 0)
			client.aShort11153 = (short) 256;
		client.aShort11282 = (short) (class665.anIntArray8525[1769813785 * class665.anInt8526 + 1]);
		if (client.aShort11282 <= 0)
			client.aShort11282 = (short) 205;
	}

	static void method8928(Class180 class180, Class142 class142, Class243 class243, int i, int i_20_, int i_21_, int i_22_, int i_23_, byte i_24_) {
		Class249 class249 = ((Class249) Class457.aClass24_Sub12_5063.method81(i_23_, 269403517));
		if (class249 != null && null != class249.anIntArray2759 && class249.method4638(Class671.aClass97_8584, Class671.aClass97_8584, 1949405825))
			class249 = class249.method4645(Class671.aClass97_8584, Class671.aClass97_8584, -1691563604);
		if (null != class249 && class249.aBool2747 && class249.method4638(Class671.aClass97_8584, Class671.aClass97_8584, 1949405825)) {
			if (null != class249.anIntArray2760) {
				int[] is = new int[class249.anIntArray2760.length];
				for (int i_25_ = 0; i_25_ < is.length / 2; i_25_++) {
					int i_26_;
					if (Class30.anInt265 * -349191067 == 2)
						i_26_ = ((int) ((double) Class208_Sub10.aClass296_Sub1_9923.method5382(1275817137) * 2607.5945876176133) + client.anInt11088 * -973282125) & 0x3fff;
					else if (6 == -349191067 * Class30.anInt265)
						i_26_ = (int) client.aFloat11112 & 0x3fff;
					else
						i_26_ = ((int) client.aFloat11112 + -973282125 * client.anInt11088) & 0x3fff;
					int i_27_ = Class428.anIntArray4825[i_26_];
					int i_28_ = Class428.anIntArray4819[i_26_];
					if (-349191067 * Class30.anInt265 != 6) {
						i_27_ = i_27_ * 256 / (client.anInt10991 * -2083955513 + 256);
						i_28_ = i_28_ * 256 / (client.anInt10991 * -2083955513 + 256);
					}
					is[i_25_ * 2] = ((((i_21_ + 4 * class249.anIntArray2760[2 * i_25_]) * i_28_) + (class249.anIntArray2760[2 * i_25_ + 1] * 4 + i_22_) * i_27_) >> 14) + (i + -1054537975 * class243.anInt2511 / 2);
					is[1 + i_25_ * 2] = (class243.anInt2514 * -1386504031 / 2 + i_20_ - (((class249.anIntArray2760[2 * i_25_ + 1] * 4 + i_22_) * i_28_ - (4 * class249.anIntArray2760[2 * i_25_] + i_21_) * i_27_) >> 14));
				}
				Class248 class248 = class243.method4524(class180, 708326095);
				if (null != class248)
					Class168.method2681(class180, is, class249.anInt2765 * 1588851213, class248.anIntArray2728, class248.anIntArray2727);
				if (class249.anInt2770 * 713635825 > 0) {
					for (int i_29_ = 0; i_29_ < is.length / 2 - 1; i_29_++) {
						int i_30_ = is[i_29_ * 2];
						int i_31_ = is[i_29_ * 2 + 1];
						int i_32_ = is[(1 + i_29_) * 2];
						int i_33_ = is[2 * (i_29_ + 1) + 1];
						if (i_32_ < i_30_) {
							int i_34_ = i_30_;
							int i_35_ = i_31_;
							i_30_ = i_32_;
							i_31_ = i_33_;
							i_32_ = i_34_;
							i_33_ = i_35_;
						} else if (i_30_ == i_32_ && i_33_ < i_31_) {
							int i_36_ = i_31_;
							i_31_ = i_33_;
							i_33_ = i_36_;
						}
						if (null != class142)
							class180.method3413(i_30_, i_31_, i_32_, i_33_, (class249.anIntArray2773[(class249.aByteArray2774[i_29_]) & 0xff]), 1, class142, i, i_20_, class249.anInt2770 * 713635825, class249.anInt2767 * 127279521, (218731315 * class249.anInt2768));
						else
							class180.method3151(i_30_, i_31_, i_32_, i_33_, (class249.anIntArray2773[class249.aByteArray2774[i_29_] & 0xff]), 1, class249.anInt2770 * 713635825, class249.anInt2767 * 127279521, class249.anInt2768 * 218731315);
					}
					int i_37_ = is[is.length - 2];
					int i_38_ = is[is.length - 1];
					int i_39_ = is[0];
					int i_40_ = is[1];
					if (i_39_ < i_37_) {
						int i_41_ = i_37_;
						int i_42_ = i_38_;
						i_37_ = i_39_;
						i_38_ = i_40_;
						i_39_ = i_41_;
						i_40_ = i_42_;
					} else if (i_37_ == i_39_ && i_40_ < i_38_) {
						int i_43_ = i_38_;
						i_38_ = i_40_;
						i_40_ = i_43_;
					}
					if (class142 != null)
						class180.method3413(i_37_, i_38_, i_39_, i_40_, (class249.anIntArray2773[(class249.aByteArray2774[(class249.aByteArray2774.length - 1)]) & 0xff]), 1, class142, i, i_20_, class249.anInt2770 * 713635825, 127279521 * class249.anInt2767, 218731315 * class249.anInt2768);
					else
						class180.method3151(i_37_, i_38_, i_39_, i_40_, (class249.anIntArray2773[(class249.aByteArray2774[(class249.aByteArray2774.length - 1)]) & 0xff]), 1, class249.anInt2770 * 713635825, class249.anInt2767 * 127279521, class249.anInt2768 * 218731315);
				} else if (class142 != null) {
					for (int i_44_ = 0; i_44_ < is.length / 2 - 1; i_44_++)
						class180.method3150(is[2 * i_44_], is[1 + i_44_ * 2], is[2 * (1 + i_44_)], is[1 + (1 + i_44_) * 2], (class249.anIntArray2773[(class249.aByteArray2774[i_44_] & 0xff)]), 1, class142, i, i_20_);
					class180.method3150(is[is.length - 2], is[is.length - 1], is[0], is[1], (class249.anIntArray2773[(class249.aByteArray2774[(class249.aByteArray2774.length - 1)]) & 0xff]), 1, class142, i, i_20_);
				} else {
					for (int i_45_ = 0; i_45_ < is.length / 2 - 1; i_45_++)
						class180.method3149(is[i_45_ * 2], is[i_45_ * 2 + 1], is[(1 + i_45_) * 2], is[(i_45_ + 1) * 2 + 1], (class249.anIntArray2773[(class249.aByteArray2774[i_45_] & 0xff)]), 1);
					class180.method3149(is[is.length - 2], is[is.length - 1], is[0], is[1], (class249.anIntArray2773[(class249.aByteArray2774[(class249.aByteArray2774.length - 1)]) & 0xff]), 1);
				}
			}
			Class147 class147 = null;
			if (-1 != 1928897467 * class249.anInt2735) {
				class147 = class249.method4637(class180, false, 1998497112);
				if (null != class147) {
					int i_46_ = (-1889855101 * class249.anInt2750 > 0 ? class249.anInt2750 * -1889855101 : Class536.aClass615_7224.anInt8053 * -1542161049);
					Class275.method5137(class243, class142, i, i_20_, i_21_, i_22_, class147, (double) i_46_, class249.aClass274_2752, class249.aClass277_2763, (byte) 105);
				}
			}
			if (null != class249.aString2737) {
				int i_47_ = 0;
				if (null != class147)
					i_47_ = class147.method2424();
				Class174 class174 = Class24_Sub9.aClass174_10977;
				Class22 class22 = Class632.aClass22_8269;
				if (1 == 1365262055 * class249.anInt2741) {
					class174 = Class85.aClass174_819;
					class22 = Class581.aClass22_7677;
				}
				if (class249.anInt2741 * 1365262055 == 2) {
					class174 = Class29.aClass174_262;
					class22 = Class568.aClass22_7615;
				}
				Class558.method9443(class243, class142, i, i_20_, i_21_, i_22_, i_47_, class249.aString2737, class174, class22, 1166915573 * class249.anInt2738, -1980423200);
			}
		}
	}

	public static void method8929(String string, String string_48_, String string_49_, boolean bool, int i) {
		if (string.length() <= 320 && Class144.method2386(714441523)) {
			client.aClass109_11066.method1968((byte) 82);
			Class157.method2560(-1408297184);
			Class32.aString289 = string;
			Class32.aString306 = string_48_;
			Class32.aString318 = string_49_;
			Class32.aBool271 = bool;
			Class78.method1560(1, (byte) 0);
		}
	}

	static Class527_Sub8_Sub9 method8930(int i, long l) {
		Class527_Sub8_Sub9.aBool11679 = false;
		Class527_Sub8_Sub9 class527_sub8_sub9 = (Class527_Sub8_Sub9) Class527_Sub8_Sub9.aClass14_11692.method709((long) i << 56 | l);
		if (null == class527_sub8_sub9) {
			class527_sub8_sub9 = new Class527_Sub8_Sub9(i, l);
			Class527_Sub8_Sub9.aClass14_11692.method714(class527_sub8_sub9, (-8168620736534281759L * (class527_sub8_sub9.aLong7106)));
			Class527_Sub8_Sub9.aBool11679 = true;
		}
		return class527_sub8_sub9;
	}

	static final void method8931(Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1, Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1_50_, int i, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_, byte i_57_) {
		int i_58_ = class640_sub1_sub2_sub1_50_.method18544(-225817523);
		if (-1 != i_58_) {
			Object object = null;
			Class147 class147 = (Class147) client.aClass205_11050.method3787((long) i_58_);
			if (class147 == null) {
				Class185[] class185s = Class165.method2655(Class338.aClass459_3656, i_58_, 0);
				if (class185s == null)
					return;
				class147 = Class402.aClass180_4150.method3271(class185s[0], true);
				client.aClass205_11050.method3790(class147, (long) i_58_);
			}
			Class442 class442 = class640_sub1_sub2_sub1.method10637().aClass442_4927;
			Class638.method10576(class640_sub1_sub2_sub1.aByte10864, (int) class442.aFloat4918, (int) class442.aFloat4919, class640_sub1_sub2_sub1.method18564(-1970775534) * 256, 0, false, false, (short) 29994);
			int i_59_ = (int) (client.aFloatArray11139[0] + (float) i_51_ - 18.0F);
			int i_60_ = (int) (client.aFloatArray11139[1] + (float) i_52_ - 16.0F - 54.0F);
			i_59_ += i / 4 * 18;
			i_60_ += i % 4 * 18;
			class147.method2415(i_59_, i_60_);
			if (class640_sub1_sub2_sub1_50_ == class640_sub1_sub2_sub1)
				Class402.aClass180_4150.method3269(i_59_ - 1, i_60_ - 1, 18, 18, -256, 863859007);
			Class522_Sub2 class522_sub2 = Class54.method1303(1633073183);
			class522_sub2.aClass640_Sub1_Sub2_Sub1_10295 = class640_sub1_sub2_sub1_50_;
			class522_sub2.anInt10298 = -1625436467 * i_59_;
			class522_sub2.anInt10297 = i_60_ * 1306103823;
			class522_sub2.anInt10296 = (16 + i_59_) * -921521273;
			class522_sub2.anInt10293 = (16 + i_60_) * -1373921443;
			client.aClass705_11220.method14322(class522_sub2, -2138243595);
		}
	}

	static final void method8932(Class665 class665, int i) {
		int i_61_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_61_, 1700914725);
		Class240 class240 = Class183.aClass240Array2100[i_61_ >> 16];
		Class324.method5729(class243, class240, class665, -1865080452);
	}
}
