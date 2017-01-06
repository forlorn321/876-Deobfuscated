/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class74 implements Interface75 {
	int anInt806;
	static Class74 aClass74_807;
	public static Class74 aClass74_808 = new Class74(3, 0, "", "");
	static Class74 aClass74_809;
	static Class74 aClass74_810;
	public static Class74 aClass74_811;
	public static Class74 aClass74_812;
	static Class74 aClass74_813;
	public static Class74 aClass74_814;
	public static Class74 aClass74_815;
	int anInt816;
	String aString817;
	public static Class34_Sub21 aClass34_Sub21_818;

	public String method1133() {
		return aString817;
	}

	public int method12() {
		return 745468301 * anInt816;
	}

	public int method78() {
		return 745468301 * anInt816;
	}

	Class74(int i, int i_0_, String string, String string_1_, boolean bool, Class74[] class74s) {
		anInt806 = i * -921812185;
		anInt816 = i_0_ * 1546828101;
		aString817 = string_1_;
	}

	static {
		aClass74_807 = new Class74(8, 1, "", "");
		aClass74_809 = new Class74(0, 2, "", "");
		aClass74_815 = new Class74(1, 3, "", "");
		aClass74_810 = new Class74(2, 4, "", "");
		aClass74_811 = new Class74(6, 5, "", "");
		aClass74_812 = new Class74(7, 6, "", "");
		aClass74_813 = new Class74(4, 7, "", "");
		aClass74_814 = new Class74(5, -1, "", "", true, new Class74[] { aClass74_808, aClass74_807, aClass74_809, aClass74_810, aClass74_815 });
	}

	Class74(int i, int i_2_, String string, String string_3_) {
		anInt806 = -921812185 * i;
		anInt816 = 1546828101 * i_2_;
		aString817 = string_3_;
	}

	public int method73() {
		return 745468301 * anInt816;
	}

	public String method1134() {
		return aString817;
	}

	public String toString() {
		return aString817;
	}

	public String method1135() {
		return aString817;
	}

	public static Class512 method1136(int i) {
		return GameShell.aClass512_6888;
	}

	public static Class452[] method1137(int i) {
		return (new Class452[] { Class452.aClass452_4950, Class452.aClass452_4952, Class452.aClass452_4951 });
	}

	static final void method1138(byte i) {
		client.aBool11304 = false;
		if (3 != Class320.anInt3539 * -989431627) {
			Class436 class436 = (Class565.MY_PLAYER.method7837().aClass436_4823);
			Class455 class455 = client.aClass515_11066.method6251(1206723447);
			if (Class246.anInt2474 * 155362615 == 1 || Class246.anInt2474 * 155362615 == 2 || -1 != 403120773 * Class658.anInt8498) {
				Class598 class598 = client.aClass515_11066.method6255(-1290884712);
				int i_4_;
				int i_5_;
				if (Class246.anInt2474 * 155362615 == 2) {
					Class436 class436_6_ = Class683.aClass301_Sub1_8651.method4052(-810172525).method8293(-339418143);
					if (Float.isNaN(class436_6_.aFloat4850))
						return;
					i_4_ = ((int) class436_6_.aFloat4850 - (class598.anInt7839 * 1858049507 << 9));
					i_5_ = ((int) class436_6_.aFloat4853 - (class598.anInt7840 * 1479112045 << 9));
					if (i_4_ < 0 || i_5_ < 0 || (i_4_ >> 9 >= (class455.aByteArrayArrayArray5154[Class320.anInt3539 * -989431627]).length) || i_5_ >> 9 >= (class455.aByteArrayArrayArray5154[-989431627 * Class320.anInt3539][i_4_ >> 9]).length)
						return;
				} else if (Class246.anInt2474 * 155362615 == 1) {
					i_4_ = (int) class436.aFloat4850;
					i_5_ = (int) class436.aFloat4853;
				} else {
					i_4_ = 403120773 * Class658.anInt8498;
					i_5_ = -153477497 * Class667.anInt8535;
				}
				if (0 != ((class455.aByteArrayArrayArray5154[-989431627 * Class320.anInt3539][i_4_ >> 9][i_5_ >> 9]) & 0x4))
					client.aBool11304 = true;
				else {
					int i_7_;
					int i_8_;
					if (155362615 * Class246.anInt2474 == 2) {
						Class436 class436_9_ = Class683.aClass301_Sub1_8651.method4051(826143221).method4343((byte) 4);
						i_7_ = (((int) class436_9_.aFloat4850 >> 9) - 1858049507 * class598.anInt7839);
						i_8_ = (((int) class436_9_.aFloat4853 >> 9) - class598.anInt7840 * 1479112045);
						if (i_7_ < 0 || i_8_ < 0 || (i_7_ >= (class455.aByteArrayArrayArray5154[-989431627 * Class320.anInt3539]).length) || i_8_ >= (class455.aByteArrayArrayArray5154[-989431627 * Class320.anInt3539][i_7_]).length)
							return;
					} else {
						i_7_ = -1607026219 * Class637.anInt8301 >> 9;
						i_8_ = -1646092097 * Class685.anInt8665 >> 9;
					}
					int i_10_ = i_4_ >> 9;
					int i_11_ = i_5_ >> 9;
					if (class455.method5465(i_7_, i_8_, -1918445579)) {
						int i_12_ = Class54.method944((-1607026219 * Class637.anInt8301), (Class685.anInt8665 * -1646092097), 3, 1822323129);
						if (-1598853731 * Class205_Sub21.anInt9958 >= i_12_)
							client.aBool11304 = true;
					} else {
						while_86_: do {
							if (62800801 * Class141.anInt1658 < 2560) {
								int i_13_;
								if (i_10_ > i_7_)
									i_13_ = i_10_ - i_7_;
								else
									i_13_ = i_7_ - i_10_;
								int i_14_;
								if (i_11_ > i_8_)
									i_14_ = i_11_ - i_8_;
								else
									i_14_ = i_8_ - i_11_;
								if (i_13_ == 0 && i_14_ == 0 || i_13_ <= -client.aClass515_11066.method6321((byte) 11) || i_13_ >= client.aClass515_11066.method6321((byte) 40) || i_14_ <= -client.aClass515_11066.method6243(177401017) || i_14_ >= client.aClass515_11066.method6243(177401017)) {
									if (Class246.anInt2474 * 155362615 != 2)
										Class81.method1165(new StringBuilder().append(i_7_).append(Class40.aString491).append(i_8_).append(" ").append(i_10_).append(Class40.aString491).append(i_11_).append(" ").append(class598.anInt7839 * 1858049507).append(Class40.aString491).append(class598.anInt7840 * 1479112045).toString(), new RuntimeException(), (byte) -2);
									break;
								}
								if (i_13_ > i_14_) {
									int i_15_ = 65536 * i_14_ / i_13_;
									int i_16_ = 32768;
									while_85_: do {
										for (;;) {
											if (i_10_ == i_7_)
												break while_85_;
											if (i_7_ < i_10_)
												i_7_++;
											else if (i_7_ > i_10_)
												i_7_--;
											if (((class455.aByteArrayArrayArray5154[(-989431627 * Class320.anInt3539)][i_7_][i_8_]) & 0x4) != 0) {
												client.aBool11304 = true;
												return;
											}
											if ((1 + i_8_ < (class455.aByteArrayArrayArray5154[(-989431627 * Class320.anInt3539)][i_7_]).length) && ((class455.aByteArrayArrayArray5154[(Class320.anInt3539 * -989431627)][i_7_][1 + i_8_]) & 0x4) != 0) {
												client.aBool11304 = true;
												return;
											}
											if (i_8_ > 0 && (0 != ((class455.aByteArrayArrayArray5154[(Class320.anInt3539 * -989431627)][i_7_][i_8_ - 1]) & 0x4))) {
												client.aBool11304 = true;
												return;
											}
											i_16_ += i_15_;
											if (i_16_ >= 65536) {
												i_16_ -= 65536;
												if (i_8_ < i_11_) {
													if ((++i_8_ + 1 < (class455.aByteArrayArrayArray5154[(-989431627 * (Class320.anInt3539))][i_7_]).length) && (0 != ((class455.aByteArrayArrayArray5154[(-989431627 * (Class320.anInt3539))][i_7_][i_8_ + 1]) & 0x4))) {
														client.aBool11304 = true;
														return;
													}
												} else if (i_8_ > i_11_ && --i_8_ > 0 && (0 != ((class455.aByteArrayArrayArray5154[(-989431627 * (Class320.anInt3539))][i_7_][i_8_ - 1]) & 0x4)))
													break;
											}
										}
										client.aBool11304 = true;
										return;
									} while (false);
								} else {
									int i_17_ = i_13_ * 65536 / i_14_;
									int i_18_ = 32768;
									for (;;) {
										if (i_8_ == i_11_)
											break while_86_;
										if (i_8_ < i_11_)
											i_8_++;
										else if (i_8_ > i_11_)
											i_8_--;
										if (0 != ((class455.aByteArrayArrayArray5154[(-989431627 * Class320.anInt3539)][i_7_][i_8_]) & 0x4)) {
											client.aBool11304 = true;
											return;
										}
										if ((1 + i_7_ < (class455.aByteArrayArrayArray5154[(-989431627 * (Class320.anInt3539))]).length) && ((class455.aByteArrayArrayArray5154[(Class320.anInt3539 * -989431627)][i_7_ + 1][i_8_]) & 0x4) != 0) {
											client.aBool11304 = true;
											return;
										}
										if (i_7_ > 0 && ((class455.aByteArrayArrayArray5154[(-989431627 * Class320.anInt3539)][i_7_ - 1][i_8_]) & 0x4) != 0) {
											client.aBool11304 = true;
											return;
										}
										i_18_ += i_17_;
										if (i_18_ >= 65536) {
											i_18_ -= 65536;
											if (i_7_ < i_10_) {
												if ((++i_7_ + 1 < (class455.aByteArrayArrayArray5154[(-989431627 * (Class320.anInt3539))]).length) && (0 != ((class455.aByteArrayArrayArray5154[((Class320.anInt3539) * -989431627)][1 + i_7_][i_8_]) & 0x4))) {
													client.aBool11304 = true;
													return;
												}
											} else if (i_7_ > i_10_ && --i_7_ > 0 && (0 != ((class455.aByteArrayArrayArray5154[((Class320.anInt3539) * -989431627)][i_7_ - 1][i_8_]) & 0x4)))
												break;
										}
									}
									client.aBool11304 = true;
									break;
								}
							}
						} while (false);
					}
				}
			} else {
				int i_19_ = Class54.method944(Class637.anInt8301 * -1607026219, Class685.anInt8665 * -1646092097, -989431627 * Class320.anInt3539, 1956853106);
				if (i_19_ - -1598853731 * Class205_Sub21.anInt9958 < 3200 && 0 != ((class455.aByteArrayArrayArray5154[Class320.anInt3539 * -989431627][-1607026219 * Class637.anInt8301 >> 9][Class685.anInt8665 * -1646092097 >> 9]) & 0x4))
					client.aBool11304 = true;
			}
		}
	}

	public static void method1139(Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1, int[] is, int[] is_20_, int[] is_21_, byte i) {
		for (int i_22_ = 0; i_22_ < is.length; i_22_++) {
			int i_23_ = is[i_22_];
			int i_24_ = is_21_[i_22_];
			int i_25_ = is_20_[i_22_];
			for (int i_26_ = 0; i_24_ != 0 && i_26_ < (class649_sub1_sub5_sub1.aClass688_Sub2_Sub1Array11947).length; i_24_ >>>= 1) {
				if (0 != (i_24_ & 0x1)) {
					if (i_23_ == -1)
						class649_sub1_sub5_sub1.aClass688_Sub2_Sub1Array11947[i_26_] = null;
					else {
						Class191 class191 = (Class191) Class45.aClass34_Sub11_529.method70(i_23_, (byte) -52);
						int i_27_ = -15611351 * class191.anInt2169;
						Class688_Sub2_Sub1 class688_sub2_sub1 = (class649_sub1_sub5_sub1.aClass688_Sub2_Sub1Array11947[i_26_]);
						if (class688_sub2_sub1 != null && class688_sub2_sub1.method8121(-1116182351)) {
							if (i_23_ == class688_sub2_sub1.method8120((byte) 73)) {
								if (0 == i_27_) {
									class649_sub1_sub5_sub1.aClass688_Sub2_Sub1Array11947[i_26_] = null;
									class688_sub2_sub1 = null;
								} else if (1 == i_27_) {
									class688_sub2_sub1.method8137(-1981848558);
									class688_sub2_sub1.anInt11873 = i_25_ * 824206427;
								} else if (2 == i_27_)
									class688_sub2_sub1.method8136(-1421707753);
							} else if (class191.anInt2163 * -430743627 >= ((class688_sub2_sub1.method8159(1179266249).anInt2163) * -430743627)) {
								class649_sub1_sub5_sub1.aClass688_Sub2_Sub1Array11947[i_26_] = null;
								class688_sub2_sub1 = null;
							}
						}
						if (class688_sub2_sub1 == null || !class688_sub2_sub1.method8121(-97519410)) {
							class688_sub2_sub1 = class649_sub1_sub5_sub1.aClass688_Sub2_Sub1Array11947[i_26_] = (new Class688_Sub2_Sub1(class649_sub1_sub5_sub1));
							class688_sub2_sub1.method8122(i_23_, -895963799);
							class688_sub2_sub1.anInt11873 = i_25_ * 824206427;
						}
					}
				}
				i_26_++;
			}
		}
	}
}
