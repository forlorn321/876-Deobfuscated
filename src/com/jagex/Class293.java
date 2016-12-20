/* Class293 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class293 implements Interface6 {
	Class459 aClass459_3258;
	Class205 aClass205_3259 = new Class205(50);
	boolean aBool3260;
	Class678 aClass678_3261;
	Class205 aClass205_3262 = new Class205(5);
	int anInt3263;
	String[] aStringArray3264;
	static boolean[] aBoolArray3265;
	static int anInt3266;

	void method5275(int i) {
		anInt3263 = i * 2042657551;
		synchronized (aClass205_3259) {
			aClass205_3259.method3793((byte) 1);
		}
		synchronized (aClass205_3262) {
			aClass205_3262.method3793((byte) 76);
		}
	}

	void method5276(byte i) {
		synchronized (aClass205_3259) {
			aClass205_3259.method3793((byte) 45);
		}
		synchronized (aClass205_3262) {
			aClass205_3262.method3793((byte) 55);
		}
	}

	void method5277(int i, int i_0_) {
		synchronized (aClass205_3259) {
			aClass205_3259.method3792(i, (byte) 45);
		}
		synchronized (aClass205_3262) {
			aClass205_3262.method3792(i, (byte) 66);
		}
	}

	void method5278(boolean bool) {
		if (bool != aBool3260) {
			aBool3260 = bool;
			method5276((byte) 59);
		}
	}

	void method5279() {
		synchronized (aClass205_3259) {
			aClass205_3259.method3820(721972759);
		}
		synchronized (aClass205_3262) {
			aClass205_3262.method3820(-1151834442);
		}
	}

	void method5280(int i) {
		synchronized (aClass205_3259) {
			aClass205_3259.method3820(-636251661);
		}
		synchronized (aClass205_3262) {
			aClass205_3262.method3820(1265776202);
		}
	}

	void method5281(int i, int i_1_) {
		anInt3263 = i * 2042657551;
		synchronized (aClass205_3259) {
			aClass205_3259.method3793((byte) 96);
		}
		synchronized (aClass205_3262) {
			aClass205_3262.method3793((byte) 80);
		}
	}

	void method5282(boolean bool) {
		if (bool != aBool3260) {
			aBool3260 = bool;
			method5276((byte) 6);
		}
	}

	void method5283(boolean bool) {
		if (bool != aBool3260) {
			aBool3260 = bool;
			method5276((byte) 78);
		}
	}

	void method5284(int i) {
		anInt3263 = i * 2042657551;
		synchronized (aClass205_3259) {
			aClass205_3259.method3793((byte) 32);
		}
		synchronized (aClass205_3262) {
			aClass205_3262.method3793((byte) 109);
		}
	}

	void method5285() {
		synchronized (aClass205_3259) {
			aClass205_3259.method3793((byte) 18);
		}
		synchronized (aClass205_3262) {
			aClass205_3262.method3793((byte) 9);
		}
	}

	void method5286() {
		synchronized (aClass205_3259) {
			aClass205_3259.method3793((byte) 49);
		}
		synchronized (aClass205_3262) {
			aClass205_3262.method3793((byte) 43);
		}
	}

	void method5287(boolean bool, int i) {
		if (bool != aBool3260) {
			aBool3260 = bool;
			method5276((byte) 59);
		}
	}

	void method5288() {
		synchronized (aClass205_3259) {
			aClass205_3259.method3820(-221414276);
		}
		synchronized (aClass205_3262) {
			aClass205_3262.method3820(-2114558729);
		}
	}

	void method5289() {
		synchronized (aClass205_3259) {
			aClass205_3259.method3820(-1434110644);
		}
		synchronized (aClass205_3262) {
			aClass205_3262.method3820(1943982185);
		}
	}

	Class293(boolean bool, Class459 class459, Class671 class671, Class678 class678) {
		aBool3260 = bool;
		aClass459_3258 = class459;
		aClass678_3261 = class678;
		if (aClass678_3261 == Class678.aClass678_8613)
			aStringArray3264 = new String[] { null, null, null, null, null, Class53.aClass53_552.method1290(class671, (byte) -88) };
		else
			aStringArray3264 = new String[] { null, null, null, null, null, null };
	}

	public static void method5290(Class579 class579, int i, int i_2_, Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1, int i_3_, int i_4_) {
		Class665 class665 = Class383.method6409((byte) -103);
		class665.aClass640_Sub1_Sub2_Sub1_8522 = class640_sub1_sub2_sub1;
		class665.anInt8544 = -483067367 * i_3_;
		Class261.method4926(class579, i, i_2_, class665, 1495419468);
		class665.aClass640_Sub1_Sub2_Sub1_8522 = null;
		class665.anInt8544 = 483067367;
	}

	static final void method5291(Class665 class665, int i) throws Exception_Sub6 {
		Class208_Sub10.aClass296_Sub1_9923.method5485((short) 255);
	}

	static boolean method5292(Class180 class180, int i, int i_5_) {
		class180.method3165();
		Class234.method4347(-1408626088);
		if (!class180.method3178(1695688735))
			return false;
		int i_6_ = client.aClass509_11072.method8284((byte) 28);
		int i_7_ = client.aClass509_11072.method8285(-178657892);
		Class470 class470 = client.aClass509_11072.method8359(-392168251);
		Class555 class555 = client.aClass509_11072.method8314(387672652);
		int i_8_ = i;
		if (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 != null) {
			int i_9_ = ((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anIntArray11902[0]) >> 3);
			int i_10_ = ((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anIntArray11944[0]) >> 3);
			if (i_9_ >= 0 && i_9_ < Class682.aBoolArrayArray8647.length && i_10_ >= 0 && i_10_ < Class682.aBoolArrayArray8647[i_9_].length && Class682.aBoolArrayArray8647[i_9_][i_10_])
				i_8_ = 0;
		}
		int i_11_ = i_6_ / 2;
		int i_12_ = 0;
		int i_13_ = 0;
		boolean bool = true;
		for (int i_14_ = i_12_; i_14_ < i_6_ + i_12_; i_14_++) {
			for (int i_15_ = i_13_; i_15_ < i_13_ + i_7_; i_15_++) {
				for (int i_16_ = i_8_; i_16_ <= 3; i_16_++) {
					if (i_16_ < i || class470.method7704(i, i_16_, i_14_, i_15_, 875612297)) {
						int i_17_ = i_16_;
						if (class470.method7706(i_14_, i_15_, (short) 28534))
							i_17_--;
						if (i_17_ >= 0)
							bool &= Class12.method697(i_17_, i_14_, i_15_, (byte) 114);
					}
				}
			}
		}
		if (!bool)
			return false;
		int i_18_ = 4 * i_6_ + 48 + 48;
		int[] is = new int[i_18_ * i_18_];
		for (int i_19_ = 0; i_19_ < is.length; i_19_++)
			is[i_19_] = 0;
		Class171_Sub2 class171_sub2 = null;
		int i_20_ = 0;
		int i_21_ = 0;
		if (Class106.aBool1313) {
			Class24_Sub6.aClass147_10969 = class180.method3161(i_18_, i_18_, false, true);
			class171_sub2 = class180.method3109();
			class171_sub2.method15321(0, Class24_Sub6.aClass147_10969.method2454());
			Interface23 interface23 = class180.method3111(i_18_, i_18_);
			class171_sub2.method15324(interface23);
			class180.method3106(class171_sub2, (byte) -101);
			i_11_ = i_6_;
			i_20_ = 48;
			i_21_ = 48;
			class180.method3136(1, 0);
		} else
			Class24_Sub6.aClass147_10969 = class180.method3163(is, 0, i_18_, i_18_, i_18_, 1156895346);
		client.aClass509_11072.method8397(1986326810).method10305(-84541815);
		int i_22_ = ~0xffffff | ((238 + (int) (Math.random() * 20.0) - 10 << 16) + (238 + (int) (Math.random() * 20.0) - 10 << 8) + (238 + (int) (Math.random() * 20.0) - 10));
		int i_23_ = ~0xffffff | 238 + (int) (Math.random() * 20.0) - 10 << 16;
		int i_24_ = ((int) (Math.random() * 8.0) << 16 | (int) (Math.random() * 8.0) << 8 | (int) (Math.random() * 8.0));
		boolean[][] bools = new boolean[2 + (i_11_ + 1)][2 + (1 + i_11_)];
		class180.method3129(Class106.anIntArray1314);
		class180.method3127();
		for (int i_25_ = i_12_; i_25_ < i_12_ + i_6_; i_25_ += i_11_) {
			for (int i_26_ = i_13_; i_26_ < i_7_ + i_13_; i_26_ += i_11_) {
				int i_27_ = i_20_;
				int i_28_ = i_21_;
				int i_29_ = i_25_;
				if (i_29_ > 0) {
					i_29_--;
					i_27_ += 4;
				}
				int i_30_ = i_26_;
				if (i_30_ > 0)
					i_30_--;
				int i_31_ = i_25_ + i_11_;
				if (i_31_ < i_6_)
					i_31_++;
				int i_32_ = i_11_ + i_26_;
				if (i_32_ < i_7_) {
					i_32_++;
					i_28_ += 4;
				}
				if (Class106.aBool1312)
					class180.method3131();
				else
					class180.method3132(0, 0, i_27_ + 4 * i_11_, i_11_ * 4 + i_28_);
				class180.method3136(3, -16777216);
				int i_33_ = i_11_;
				if (i_33_ > i_6_ - 1)
					i_33_ = i_6_ - 1;
				for (int i_34_ = i_8_; i_34_ <= 3; i_34_++) {
					for (int i_35_ = 0; i_35_ <= i_33_; i_35_++) {
						for (int i_36_ = 0; i_36_ <= i_33_; i_36_++)
							bools[i_35_][i_36_] = (i_34_ < i || class470.method7704(i, i_34_, i_35_ + i_29_, i_36_ + i_30_, -1512721999));
					}
					class555.aClass161Array7457[i_34_].method2594(i_20_, i_21_, 1024, i_29_, i_30_, i_31_, i_32_, bools);
					for (int i_37_ = -4; i_37_ < i_11_; i_37_++) {
						for (int i_38_ = -4; i_38_ < i_11_; i_38_++) {
							int i_39_ = i_25_ + i_37_;
							int i_40_ = i_38_ + i_26_;
							if (i_39_ >= i_12_ && i_40_ >= i_13_ && (i_34_ < i || class470.method7704(i, i_34_, i_39_, i_40_, 409638027))) {
								int i_41_ = i_34_;
								if (class470.method7706(i_39_, i_40_, (short) -11629))
									i_41_--;
								if (i_41_ >= 0)
									Class301.method5573(class180, i_41_, i_39_, i_40_, 4 * i_37_ + i_27_, (i_28_ + (i_11_ - i_38_) * 4 - 4), i_22_, i_23_, 1226579288);
							}
						}
					}
				}
				class180.method3348(i_27_, i_28_, 4 * i_11_, i_11_ * 4, i_24_, 2);
				class180.method3165();
				if (!Class106.aBool1313) {
					Class24_Sub6.aClass147_10969.method2445((i_25_ - i_12_) * 4 + 48, i_7_ * 4 + 48 - (i_26_ - i_13_) * 4 - i_11_ * 4, i_11_ * 4, 4 * i_11_, i_27_, i_28_);
					if (Class106.aBool1312) {
						Class24_Sub6.aClass147_10969.method2415(256, 0);
						try {
							class180.method3078((byte) 22);
							Class518.method8635(2000L);
						} catch (Exception exception) {
							/* empty */
						}
					}
				}
			}
		}
		if (Class106.aBool1313) {
			class180.method3107(class171_sub2, -677418425);
			if (Class106.aBool1312) {
				Class24_Sub6.aClass147_10969.method2415(256, 0);
				try {
					class180.method3078((byte) 57);
					Class518.method8635(2000L);
				} catch (Exception exception) {
					/* empty */
				}
			}
		}
		class180.method3131();
		class180.method3128(Class106.anIntArray1314[0], Class106.anIntArray1314[1], Class106.anIntArray1314[2], Class106.anIntArray1314[3]);
		class180.method3136(1, 1);
		Class289.method5226(1247842751);
		Class106.anInt1316 = 0;
		Class106.aClass694_1311.method14105((byte) 91);
		if (!Class106.aBool1324) {
			Class455.method7346(i, -214441092);
			Class532 class532 = client.aClass509_11072.method8286(334926193);
			if (null != class532) {
				Class457.aClass24_Sub12_5063.method17394(1024, 64, (byte) 102);
				Class592 class592 = client.aClass509_11072.method8283((short) 1414);
				for (int i_42_ = 0; i_42_ < -1479175311 * class532.anInt7208; i_42_++) {
					int i_43_ = class532.anIntArray7206[i_42_];
					if (i_43_ >> 28 == (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864)) {
						int i_44_ = ((i_43_ >> 14 & 0x3fff) - class592.anInt7798 * 153371143);
						int i_45_ = ((i_43_ & 0x3fff) - class592.anInt7799 * -2029646807);
						if (i_44_ >= 0 && i_44_ < i_6_ && i_45_ >= 0 && i_45_ < i_7_)
							Class106.aClass694_1311.method14147(new Node_Sub6(i_42_), -1010062284);
						else {
							Class249 class249 = ((Class249) (Class457.aClass24_Sub12_5063.method81(class532.anIntArray7207[i_42_], 388596646)));
							if (class249.anIntArray2760 != null && class249.anInt2771 * 1589409961 + i_44_ >= 0 && i_44_ + -1712073 * class249.anInt2740 < i_6_ && class249.anInt2764 * -548669143 + i_45_ >= 0 && (i_45_ + class249.anInt2748 * -1564335433 < i_7_))
								Class106.aClass694_1311.method14147(new Node_Sub6(i_42_), -1396436184);
						}
					}
				}
				Class457.aClass24_Sub12_5063.method17394(128, 64, (byte) -77);
			}
		}
		return true;
	}
}
