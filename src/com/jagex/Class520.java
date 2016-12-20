/* Class520 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class520 {
	Class537 this$0;

	Class520(Class537 class537) {
		this$0 = class537;
	}

	static void method8661(Class665 class665, byte i) {
		class665.anIntArray8525[1769813785 * class665.anInt8526 - 2] = (((Class259) Class590.aClass62_Sub1_7793.method81((class665.anIntArray8525[(class665.anInt8526 * 1769813785) - 2]), 1375076266)).method4754(Class671.aClass97_8584, class665.anIntArray8525[1769813785 * class665.anInt8526 - 1], 1052684781)) ? 1 : 0;
		class665.anInt8526 -= 102380841;
	}

	static final void method8662(Class665 class665, int i) {
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4490, client.aClass109_11067.aClass2_1367, (byte) 14);
		client.aClass109_11067.method1969(class527_sub15, (byte) 1);
	}

	static final void method8663(int i) {
		client.aBool11001 = false;
		if (162317215 * Class673.anInt8585 != 3) {
			Class442 class442 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927);
			Class470 class470 = client.aClass509_11072.method8359(-594186768);
			if (1 == -349191067 * Class30.anInt265 || -349191067 * Class30.anInt265 == 2 || -1338571303 * Class400.anInt4141 != -1) {
				Class592 class592 = client.aClass509_11072.method8283((short) 10397);
				int i_0_;
				int i_1_;
				if (2 == -349191067 * Class30.anInt265) {
					Class442 class442_2_ = Class208_Sub10.aClass296_Sub1_9923.method5472(-166247620).method14246((byte) 120);
					if (Float.isNaN(class442_2_.aFloat4918))
						return;
					i_0_ = ((int) class442_2_.aFloat4918 - (153371143 * class592.anInt7798 << 9));
					i_1_ = ((int) class442_2_.aFloat4919 - (-2029646807 * class592.anInt7799 << 9));
					if (i_0_ < 0 || i_1_ < 0 || (i_0_ >> 9 >= (class470.aByteArrayArrayArray5354[Class673.anInt8585 * 162317215]).length) || i_1_ >> 9 >= (class470.aByteArrayArrayArray5354[Class673.anInt8585 * 162317215][i_0_ >> 9]).length)
						return;
				} else if (1 == -349191067 * Class30.anInt265) {
					i_0_ = (int) class442.aFloat4918;
					i_1_ = (int) class442.aFloat4919;
				} else {
					i_0_ = Class400.anInt4141 * -1338571303;
					i_1_ = 658272607 * Class452.anInt4964;
				}
				if (0 != ((class470.aByteArrayArrayArray5354[Class673.anInt8585 * 162317215][i_0_ >> 9][i_1_ >> 9]) & 0x4))
					client.aBool11001 = true;
				else {
					int i_3_;
					int i_4_;
					if (2 == Class30.anInt265 * -349191067) {
						Class442 class442_5_ = Class208_Sub10.aClass296_Sub1_9923.method5372((byte) 0).method5781(1436298486);
						i_3_ = (((int) class442_5_.aFloat4918 >> 9) - class592.anInt7798 * 153371143);
						i_4_ = (((int) class442_5_.aFloat4919 >> 9) - -2029646807 * class592.anInt7799);
						if (i_3_ < 0 || i_4_ < 0 || (i_3_ >= (class470.aByteArrayArrayArray5354[162317215 * Class673.anInt8585]).length) || i_4_ >= (class470.aByteArrayArrayArray5354[Class673.anInt8585 * 162317215][i_3_]).length)
							return;
					} else {
						i_3_ = Class320.anInt3543 * -1998563323 >> 9;
						i_4_ = -1261737255 * Class201.anInt2211 >> 9;
					}
					int i_6_ = i_0_ >> 9;
					int i_7_ = i_1_ >> 9;
					if (class470.method7702(i_3_, i_4_, -1074113113)) {
						int i_8_ = Class590.method9853((-1998563323 * Class320.anInt3543), (Class201.anInt2211 * -1261737255), 3, (byte) 5);
						if (Class142.anInt1657 * 298893113 >= i_8_)
							client.aBool11001 = true;
					} else {
						while_17_: do {
							if (-1153148977 * Class700_Sub34.anInt10928 < 2560) {
								int i_9_;
								if (i_6_ > i_3_)
									i_9_ = i_6_ - i_3_;
								else
									i_9_ = i_3_ - i_6_;
								int i_10_;
								if (i_7_ > i_4_)
									i_10_ = i_7_ - i_4_;
								else
									i_10_ = i_4_ - i_7_;
								if (i_9_ == 0 && i_10_ == 0 || i_9_ <= -client.aClass509_11072.method8284((byte) 4) || i_9_ >= client.aClass509_11072.method8284((byte) 74) || i_10_ <= -client.aClass509_11072.method8285(372640139) || i_10_ >= client.aClass509_11072.method8285(103100656)) {
									if (Class30.anInt265 * -349191067 != 2)
										Class180.method3542(new StringBuilder().append(i_3_).append(Class33.aString325).append(i_4_).append(" ").append(i_6_).append(Class33.aString325).append(i_7_).append(" ").append(class592.anInt7798 * 153371143).append(Class33.aString325).append(class592.anInt7799 * -2029646807).toString(), new RuntimeException(), 1604547405);
									break;
								}
								if (i_9_ > i_10_) {
									int i_11_ = i_10_ * 65536 / i_9_;
									int i_12_ = 32768;
									while_16_: do {
										for (;;) {
											if (i_3_ == i_6_)
												break while_16_;
											if (i_3_ < i_6_)
												i_3_++;
											else if (i_3_ > i_6_)
												i_3_--;
											if (((class470.aByteArrayArrayArray5354[(162317215 * Class673.anInt8585)][i_3_][i_4_]) & 0x4) != 0) {
												client.aBool11001 = true;
												return;
											}
											if ((1 + i_4_ < (class470.aByteArrayArrayArray5354[(162317215 * Class673.anInt8585)][i_3_]).length) && (0 != ((class470.aByteArrayArrayArray5354[(Class673.anInt8585 * 162317215)][i_3_][1 + i_4_]) & 0x4))) {
												client.aBool11001 = true;
												return;
											}
											if (i_4_ > 0 && ((class470.aByteArrayArrayArray5354[(Class673.anInt8585 * 162317215)][i_3_][i_4_ - 1]) & 0x4) != 0) {
												client.aBool11001 = true;
												return;
											}
											i_12_ += i_11_;
											if (i_12_ >= 65536) {
												i_12_ -= 65536;
												if (i_4_ < i_7_) {
													i_4_++;
													if ((1 + i_4_ < (class470.aByteArrayArrayArray5354[(162317215 * (Class673.anInt8585))][i_3_]).length) && (0 != ((class470.aByteArrayArrayArray5354[(162317215 * (Class673.anInt8585))][i_3_][i_4_ + 1]) & 0x4))) {
														client.aBool11001 = true;
														return;
													}
												} else if (i_4_ > i_7_ && --i_4_ > 0 && (0 != ((class470.aByteArrayArrayArray5354[((Class673.anInt8585) * 162317215)][i_3_][i_4_ - 1]) & 0x4)))
													break;
											}
										}
										client.aBool11001 = true;
										return;
									} while (false);
								} else {
									int i_13_ = 65536 * i_9_ / i_10_;
									int i_14_ = 32768;
									for (;;) {
										if (i_4_ == i_7_)
											break while_17_;
										if (i_4_ < i_7_)
											i_4_++;
										else if (i_4_ > i_7_)
											i_4_--;
										if (0 != ((class470.aByteArrayArrayArray5354[(162317215 * Class673.anInt8585)][i_3_][i_4_]) & 0x4)) {
											client.aBool11001 = true;
											return;
										}
										if ((1 + i_3_ < (class470.aByteArrayArrayArray5354[(162317215 * (Class673.anInt8585))]).length) && ((class470.aByteArrayArrayArray5354[(162317215 * Class673.anInt8585)][i_3_ + 1][i_4_]) & 0x4) != 0) {
											client.aBool11001 = true;
											return;
										}
										if (i_3_ > 0 && 0 != ((class470.aByteArrayArrayArray5354[(162317215 * Class673.anInt8585)][i_3_ - 1][i_4_]) & 0x4)) {
											client.aBool11001 = true;
											return;
										}
										i_14_ += i_13_;
										if (i_14_ >= 65536) {
											i_14_ -= 65536;
											if (i_3_ < i_6_) {
												if ((++i_3_ + 1 < (class470.aByteArrayArrayArray5354[(162317215 * (Class673.anInt8585))]).length) && ((class470.aByteArrayArrayArray5354[(162317215 * (Class673.anInt8585))][i_3_ + 1][i_4_]) & 0x4) != 0) {
													client.aBool11001 = true;
													return;
												}
											} else if (i_3_ > i_6_ && --i_3_ > 0 && ((class470.aByteArrayArrayArray5354[((Class673.anInt8585) * 162317215)][i_3_ - 1][i_4_]) & 0x4) != 0)
												break;
										}
									}
									client.aBool11001 = true;
									break;
								}
							}
						} while (false);
					}
				}
			} else {
				int i_15_ = Class590.method9853(-1998563323 * Class320.anInt3543, Class201.anInt2211 * -1261737255, 162317215 * Class673.anInt8585, (byte) 5);
				if (i_15_ - Class142.anInt1657 * 298893113 < 3200 && 0 != ((class470.aByteArrayArrayArray5354[Class673.anInt8585 * 162317215][-1998563323 * Class320.anInt3543 >> 9][-1261737255 * Class201.anInt2211 >> 9]) & 0x4))
					client.aBool11001 = true;
			}
		}
	}

	public static void method8664(boolean bool, boolean bool_16_, int i) {
		if (bool) {
			Class656.anInt8394 -= 1317456281;
			if (-1077773655 * Class656.anInt8394 == 0)
				Class656.anIntArray8393 = null;
		}
		if (bool_16_) {
			Class656.anInt8391 -= -1823192467;
			if (-2088546459 * Class656.anInt8391 == 0)
				Class656.anIntArray8390 = null;
		}
	}
}
