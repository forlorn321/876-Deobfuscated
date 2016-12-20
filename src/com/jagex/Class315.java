/* Class315 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class315 implements Interface76 {
	static Class315 aClass315_3508;
	static Class315 aClass315_3509;
	static Class315 aClass315_3510;
	static Class315 aClass315_3511;
	static Class315 aClass315_3512;
	static Class315 aClass315_3513;
	static Class315 aClass315_3514;
	int anInt3515;
	static Class315 aClass315_3516;
	static Class315 aClass315_3517 = new Class315(9, 1);
	static Class315 aClass315_3518;
	static Class315 aClass315_3519;
	static Class315 aClass315_3520;
	static Class315 aClass315_3521;
	static Class315 aClass315_3522;
	int anInt3523;
	static Class315 aClass315_3524;

	static {
		aClass315_3516 = new Class315(13, 2);
		aClass315_3510 = new Class315(4, 3);
		aClass315_3512 = new Class315(7, 4);
		aClass315_3524 = new Class315(14, 5);
		aClass315_3508 = new Class315(8, 6);
		aClass315_3514 = new Class315(1, 7);
		aClass315_3513 = new Class315(6, 8);
		aClass315_3509 = new Class315(12, 9);
		aClass315_3511 = new Class315(5, 10);
		aClass315_3518 = new Class315(2, 11);
		aClass315_3519 = new Class315(3, 12);
		aClass315_3520 = new Class315(0, 13);
		aClass315_3521 = new Class315(11, 14);
		aClass315_3522 = new Class315(10, 15);
	}

	public int method87() {
		return 1566742157 * anInt3515;
	}

	public int method91() {
		return 1566742157 * anInt3515;
	}

	public int method42() {
		return 1566742157 * anInt3515;
	}

	Class315(int i, int i_0_) {
		anInt3523 = i * -344498639;
		anInt3515 = 558767173 * i_0_;
	}

	static Class315[] method5670() {
		return (new Class315[] { aClass315_3516, aClass315_3518, aClass315_3510, aClass315_3508, aClass315_3522, aClass315_3509, aClass315_3520, aClass315_3521, aClass315_3519, aClass315_3511, aClass315_3517, aClass315_3513, aClass315_3514, aClass315_3512, aClass315_3524 });
	}

	static final void method5671(Class665 class665, byte i) {
		class665.anInt8528 -= 866019034;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class23.method829((String) (class665.anObjectArray8541[318492261 * class665.anInt8528]), ((String) (class665.anObjectArray8541[class665.anInt8528 * 318492261 + 1])), Class144_Sub1.aClass671_8995, 568976556);
	}

	static final void method5672(Class665 class665, byte i) {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class217.method3973(i_1_ >> 14 & 0x3fff, i_1_ & 0x3fff, -1790885994);
	}

	public static boolean method5673(char c, byte i) {
		return c >= '0' && c <= '9';
	}

	public static int method5674(int i, int i_2_, boolean bool, int i_3_) {
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool, (byte) 53);
		if (null == class527_sub1)
			return 0;
		if (i_2_ == -1)
			return 0;
		int i_4_ = 0;
		for (int i_5_ = 0; i_5_ < class527_sub1.anIntArray10330.length; i_5_++) {
			if (i_2_ == class527_sub1.anIntArray10332[i_5_])
				i_4_ += class527_sub1.anIntArray10330[i_5_];
		}
		return i_4_;
	}

	static final void method5675(int i) {
		for (int i_6_ = Class671.aClass97_8584.aClass603_1162.method10013(true, (byte) 18); -1 != i_6_; i_6_ = Class671.aClass97_8584.aClass603_1162.method10013(false, (byte) -104)) {
			Class258_Sub1.method15716(i_6_, 335845498);
			client.anIntArray11224[(client.anInt11110 += 660260329) * 1098801753 - 1 & 0x3f] = i_6_;
		}
		for (Class527_Sub8_Sub9 class527_sub8_sub9 = Class665.method11055((byte) 0); null != class527_sub8_sub9; class527_sub8_sub9 = Class665.method11055((byte) 0)) {
			int i_7_ = class527_sub8_sub9.method18188((byte) -98);
			long l = class527_sub8_sub9.method18206(3323584);
			if (i_7_ == 1) {
				Class160 class160 = ((Class160) Class112.aClass95_Sub1_Sub2_1406.method81((int) l, -1782513474));
				Class598.aClass144_Sub1_7852.method105(class160, (-1709720595 * (class527_sub8_sub9.anInt11676)), (byte) 86);
				client.anIntArray11230[(client.anInt11231 += -375395055) * 1954587633 - 1 & 0x3f] = (int) l;
			} else if (i_7_ == 2) {
				Class160 class160 = ((Class160) Class112.aClass95_Sub1_Sub2_1406.method81((int) l, 519054875));
				Class598.aClass144_Sub1_7852.method111(class160, (class527_sub8_sub9.aString11669), 1679072659);
				client.anIntArray11146[(client.anInt11233 += 361770753) * 1141952769 - 1 & 0x3f] = (int) l;
			} else if (3 == i_7_) {
				Class243 class243 = Class648.method10837((int) l, -589233811);
				if (!class527_sub8_sub9.aString11669.equals(class243.aString2578)) {
					class243.aString2578 = class527_sub8_sub9.aString11669;
					Class430.method6876(class243, (byte) 66);
				}
			} else if (23 == i_7_) {
				Class243 class243 = Class648.method10837((int) l, 903996945);
				if ((1 == class527_sub8_sub9.anInt11676 * -1709720595) != class243.aBool2487) {
					class243.aBool2487 = 1 == -1709720595 * class527_sub8_sub9.anInt11676;
					Class430.method6876(class243, (byte) 38);
				}
			} else if (i_7_ == 4) {
				Class243 class243 = Class648.method10837((int) l, 1207850167);
				int i_8_ = -1709720595 * class527_sub8_sub9.anInt11676;
				int i_9_ = 928468045 * class527_sub8_sub9.anInt11667;
				int i_10_ = 1491183967 * class527_sub8_sub9.anInt11678;
				if (class243.anInt2541 * -1260029751 != i_8_ || i_9_ != 1538136819 * class243.anInt2542 || class243.anInt2543 * 1484887087 != i_10_) {
					class243.anInt2541 = i_8_ * 121119097;
					class243.anInt2542 = i_9_ * -174092741;
					class243.anInt2543 = i_10_ * 708326095;
					class243.aClass308_2513 = null;
					Class430.method6876(class243, (byte) 35);
				}
			} else if (5 == i_7_) {
				Class243 class243 = Class648.method10837((int) l, -922506254);
				if (class243.anInt2663 * -19060959 != class527_sub8_sub9.anInt11676 * -1709720595) {
					if (-1709720595 * class527_sub8_sub9.anInt11676 != -1) {
						if (null == class243.aClass695_2664)
							class243.aClass695_2664 = new Class695_Sub1();
						class243.aClass695_2664.method14165(-1709720595 * class527_sub8_sub9.anInt11676, (byte) 78);
					} else
						class243.aClass695_2664 = null;
					class243.anInt2663 = 1680807757 * class527_sub8_sub9.anInt11676;
					Class430.method6876(class243, (byte) 103);
				}
			} else if (6 == i_7_) {
				int i_11_ = -1709720595 * class527_sub8_sub9.anInt11676;
				int i_12_ = i_11_ >> 10 & 0x1f;
				int i_13_ = i_11_ >> 5 & 0x1f;
				int i_14_ = i_11_ & 0x1f;
				int i_15_ = (i_13_ << 11) + (i_12_ << 19) + (i_14_ << 3);
				Class243 class243 = Class648.method10837((int) l, -1152505250);
				if (class243.anInt2527 * -192538049 != i_15_) {
					class243.anInt2527 = i_15_ * 1692718527;
					Class430.method6876(class243, (byte) 72);
				}
			} else if (i_7_ == 7) {
				Class243 class243 = Class648.method10837((int) l, 353526876);
				boolean bool = 1 == class527_sub8_sub9.anInt11676 * -1709720595;
				if (class243.aBool2518 != bool) {
					class243.aBool2518 = bool;
					Class430.method6876(class243, (byte) 16);
				}
			} else if (8 == i_7_) {
				Class243 class243 = Class648.method10837((int) l, 457687487);
				if ((class527_sub8_sub9.anInt11676 * -1709720595 != 1865797529 * class243.anInt2547) || (928468045 * class527_sub8_sub9.anInt11667 != class243.anInt2548 * -1514904661) || (class527_sub8_sub9.anInt11678 * 1491183967 != class243.anInt2553 * 1228419355)) {
					class243.anInt2547 = class527_sub8_sub9.anInt11676 * -310144139;
					class243.anInt2548 = 1490491367 * class527_sub8_sub9.anInt11667;
					class243.anInt2553 = class527_sub8_sub9.anInt11678 * -101502707;
					if (-1 != class243.anInt2572 * -437471887) {
						if (class243.anInt2554 * 1514038763 > 0)
							class243.anInt2553 = (class243.anInt2553 * 654713696 / (class243.anInt2554 * 1514038763) * -413286125);
						else if (class243.anInt2509 * 1885280809 > 0)
							class243.anInt2553 = -413286125 * (654713696 * class243.anInt2553 / (1885280809 * class243.anInt2509));
					}
					Class430.method6876(class243, (byte) 45);
				}
			} else if (i_7_ == 9) {
				Class243 class243 = Class648.method10837((int) l, 1064224392);
				if ((class243.anInt2572 * -437471887 != class527_sub8_sub9.anInt11676 * -1709720595) || (-1109781355 * class243.anInt2589 != 928468045 * class527_sub8_sub9.anInt11667)) {
					class243.anInt2572 = 2037940285 * class527_sub8_sub9.anInt11676;
					class243.anInt2589 = class527_sub8_sub9.anInt11667 * -1188302119;
					Class430.method6876(class243, (byte) 85);
				}
			} else if (10 == i_7_) {
				Class243 class243 = Class648.method10837((int) l, 1995206367);
				if ((class243.anInt2545 * -1768842777 != class527_sub8_sub9.anInt11676 * -1709720595) || (class243.anInt2546 * -124591531 != class527_sub8_sub9.anInt11667 * 928468045) || (1491183967 * class527_sub8_sub9.anInt11678 != -1521042319 * class243.anInt2549)) {
					class243.anInt2545 = class527_sub8_sub9.anInt11676 * -1786050293;
					class243.anInt2546 = class527_sub8_sub9.anInt11667 * -1171756519;
					class243.anInt2549 = 394324687 * class527_sub8_sub9.anInt11678;
					Class430.method6876(class243, (byte) 74);
				}
			} else if (i_7_ == 11) {
				Class243 class243 = Class648.method10837((int) l, 113931099);
				class243.aByte2503 = (byte) 0;
				class243.anInt2634 = ((class243.anInt2507 = class527_sub8_sub9.anInt11676 * -1391544217) * -1453426071);
				class243.aByte2488 = (byte) 0;
				class243.anInt2512 = ((class243.anInt2534 = class527_sub8_sub9.anInt11667 * 940588193) * -726185513);
				Class430.method6876(class243, (byte) 104);
			} else if (i_7_ == 12) {
				Class243 class243 = Class648.method10837((int) l, 762191802);
				int i_16_ = class527_sub8_sub9.anInt11676 * -1709720595;
				if (null != class243 && 0 == -270144907 * class243.anInt2501) {
					if (i_16_ > (class243.anInt2526 * 1847049763 - class243.anInt2514 * -1386504031))
						i_16_ = (class243.anInt2526 * 1847049763 - class243.anInt2514 * -1386504031);
					if (i_16_ < 0)
						i_16_ = 0;
					if (i_16_ != 114452147 * class243.anInt2524) {
						class243.anInt2524 = i_16_ * 1351137403;
						Class430.method6876(class243, (byte) 88);
					}
				}
			} else if (i_7_ == 13) {
				Class243 class243 = Class648.method10837((int) l, -206978249);
				class243.anInt2532 = -376092615 * class527_sub8_sub9.anInt11676;
			} else if (i_7_ == 14) {
				Class106.aBool1317 = true;
				Class106.anInt1323 = class527_sub8_sub9.anInt11676 * -2141907597;
				Class106.anInt1322 = 670112675 * class527_sub8_sub9.anInt11667;
			} else if (15 == i_7_) {
				Class243 class243 = Class648.method10837((int) l, 1400301196);
				class243.anInt2576 = class527_sub8_sub9.anInt11676 * 955679551;
			} else if (21 == i_7_) {
				Class243 class243 = Class648.method10837((int) l, -870145845);
				class243.aBool2577 = 1 == class527_sub8_sub9.anInt11676 * -1709720595;
			} else if (22 == i_7_) {
				Class243 class243 = Class648.method10837((int) l, -285419223);
				class243.aBool2540 = 1 == class527_sub8_sub9.anInt11676 * -1709720595;
			} else if (17 == i_7_) {
				Class243 class243 = Class648.method10837((int) l, 1652310241);
				int i_17_ = (int) (l >> 32);
				class243.method4529(i_17_, (short) (-1709720595 * class527_sub8_sub9.anInt11676), (short) (928468045 * class527_sub8_sub9.anInt11667), 428778057);
			} else if (i_7_ == 20) {
				Class243 class243 = Class648.method10837((int) l, 569546057);
				int i_18_ = (int) (l >> 32);
				class243.method4531(i_18_, (short) (-1709720595 * class527_sub8_sub9.anInt11676), (short) (class527_sub8_sub9.anInt11667 * 928468045), 1665831656);
			}
		}
	}
}
