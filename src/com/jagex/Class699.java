/* Class699 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class699 implements Interface76 {
	static Class699 aClass699_8770;
	public static Class699 aClass699_8771;
	public static Class699 aClass699_8772;
	static Class699 aClass699_8773;
	static Class699 aClass699_8774;
	static Class699 aClass699_8775 = new Class699(-1);
	public static Class699 aClass699_8776;
	static Class699 aClass699_8777;
	int anInt8778;
	static Class699 aClass699_8779;
	public static Class699 aClass699_8780;

	static {
		aClass699_8771 = new Class699(-2);
		aClass699_8772 = new Class699(-3);
		aClass699_8773 = new Class699(-4);
		aClass699_8780 = new Class699(-5);
		aClass699_8776 = new Class699(2);
		aClass699_8770 = new Class699(3);
		aClass699_8777 = new Class699(7);
		aClass699_8774 = new Class699(9);
		aClass699_8779 = new Class699(37);
	}

	Class699(int i) {
		anInt8778 = -53648705 * i;
	}

	public static Class699[] method14275() {
		return new Class699[] { aClass699_8774, aClass699_8771, aClass699_8780, aClass699_8773, aClass699_8772, aClass699_8779, aClass699_8777, aClass699_8776, aClass699_8770, aClass699_8775 };
	}

	public int method42() {
		return 1036979519 * anInt8778;
	}

	public int method91() {
		return 1036979519 * anInt8778;
	}

	public static Class699[] method14276() {
		return new Class699[] { aClass699_8774, aClass699_8771, aClass699_8780, aClass699_8773, aClass699_8772, aClass699_8779, aClass699_8777, aClass699_8776, aClass699_8770, aClass699_8775 };
	}

	public int method87() {
		return 1036979519 * anInt8778;
	}

	static final void method14277(int i) {
		byte[][][] is = client.aClass509_11072.method8371((byte) 0);
		byte i_0_ = (byte) (client.anInt11129 * 1429404695 - 4 & 0xff);
		int i_1_ = (client.anInt11129 * 1429404695 % client.aClass509_11072.method8284((byte) 70));
		for (int i_2_ = 0; i_2_ < 4; i_2_++) {
			for (int i_3_ = 0; i_3_ < client.aClass509_11072.method8285(-1206762742); i_3_++)
				is[i_2_][i_1_][i_3_] = i_0_;
		}
		if (162317215 * Class673.anInt8585 != 3) {
			for (int i_4_ = 0; i_4_ < 2; i_4_++) {
				client.anIntArray11149[i_4_] = -1000000;
				client.anIntArray11052[i_4_] = 1000000;
				client.anIntArray11151[i_4_] = 0;
				client.anIntArray11104[i_4_] = 1000000;
				client.anIntArray11101[i_4_] = 0;
			}
			Class442 class442 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927);
			Class470 class470 = client.aClass509_11072.method8359(-767407927);
			Class555 class555 = client.aClass509_11072.method8314(-2023070982);
			if (-349191067 * Class30.anInt265 == 1 || -349191067 * Class30.anInt265 == 2 || -1338571303 * Class400.anInt4141 != -1) {
				Class592 class592 = client.aClass509_11072.method8283((short) 28012);
				int i_5_;
				int i_6_;
				if (Class30.anInt265 * -349191067 == 2) {
					Class442 class442_7_ = Class208_Sub10.aClass296_Sub1_9923.method5472(-1084517154).method14246((byte) 95);
					if (Float.isNaN(class442_7_.aFloat4918))
						return;
					i_5_ = ((int) class442_7_.aFloat4918 - (class592.anInt7798 * 153371143 << 9));
					i_6_ = ((int) class442_7_.aFloat4919 - (class592.anInt7799 * -2029646807 << 9));
					if (i_5_ < 0 || i_6_ < 0 || (i_5_ >> 9 >= (class470.aByteArrayArrayArray5354[Class673.anInt8585 * 162317215]).length) || i_6_ >> 9 >= (class470.aByteArrayArrayArray5354[162317215 * Class673.anInt8585][i_5_ >> 9]).length)
						return;
				} else if (Class30.anInt265 * -349191067 == 1) {
					i_5_ = (int) class442.aFloat4918;
					i_6_ = (int) class442.aFloat4919;
				} else {
					i_5_ = Class400.anInt4141 * -1338571303;
					i_6_ = 658272607 * Class452.anInt4964;
				}
				if (((class470.aByteArrayArrayArray5354[Class673.anInt8585 * 162317215][i_5_ >> 9][i_6_ >> 9]) & 0x4) != 0)
					Class650.method10862(class555.aClass561ArrayArrayArray7426, 0, i_5_ >> 9, i_6_ >> 9, false, 1601224210);
				else {
					int i_8_;
					int i_9_;
					if (Class30.anInt265 * -349191067 == 2) {
						Class442 class442_10_ = Class208_Sub10.aClass296_Sub1_9923.method5372((byte) 0).method5781(1417364289);
						i_8_ = (((int) class442_10_.aFloat4918 >> 9) - 153371143 * class592.anInt7798);
						i_9_ = (((int) class442_10_.aFloat4919 >> 9) - class592.anInt7799 * -2029646807);
						if (i_8_ < 0 || i_9_ < 0 || (i_8_ >= (class470.aByteArrayArrayArray5354[162317215 * Class673.anInt8585]).length) || i_9_ >= (class470.aByteArrayArrayArray5354[162317215 * Class673.anInt8585][i_8_]).length)
							return;
					} else {
						i_8_ = -1998563323 * Class320.anInt3543 >> 9;
						i_9_ = Class201.anInt2211 * -1261737255 >> 9;
					}
					int i_11_ = i_5_ >> 9;
					int i_12_ = i_6_ >> 9;
					if (class470.method7702(i_8_, i_9_, -1184607269)) {
						int i_13_ = Class590.method9853((-1998563323 * Class320.anInt3543), (Class201.anInt2211 * -1261737255), 3, (byte) 5);
						if (Class142.anInt1657 * 298893113 >= i_13_)
							Class650.method10862(class555.aClass561ArrayArrayArray7426, 1, i_8_, i_9_, false, 1601224210);
					} else {
						while_117_: do {
							if (-1153148977 * Class700_Sub34.anInt10928 < 2560) {
								int i_14_;
								if (i_11_ > i_8_)
									i_14_ = i_11_ - i_8_;
								else
									i_14_ = i_8_ - i_11_;
								int i_15_;
								if (i_12_ > i_9_)
									i_15_ = i_12_ - i_9_;
								else
									i_15_ = i_9_ - i_12_;
								if (i_14_ == 0 && i_15_ == 0 || i_14_ <= -client.aClass509_11072.method8284((byte) 43) || i_14_ >= client.aClass509_11072.method8284((byte) 11) || i_15_ <= -client.aClass509_11072.method8285(83601863) || i_15_ >= client.aClass509_11072.method8285(183161581)) {
									if (2 != Class30.anInt265 * -349191067)
										Class180.method3542(new StringBuilder().append(i_8_).append(Class33.aString325).append(i_9_).append(" ").append(i_11_).append(Class33.aString325).append(i_12_).append(" ").append(153371143 * class592.anInt7798).append(Class33.aString325).append(-2029646807 * class592.anInt7799).toString(), new RuntimeException(), 1604547405);
									break;
								}
								if (i_14_ > i_15_) {
									int i_16_ = i_15_ * 65536 / i_14_;
									int i_17_ = 32768;
									while_116_: do {
										for (;;) {
											if (i_11_ == i_8_)
												break while_116_;
											if (i_8_ < i_11_)
												i_8_++;
											else if (i_8_ > i_11_)
												i_8_--;
											if (((class470.aByteArrayArrayArray5354[(162317215 * Class673.anInt8585)][i_8_][i_9_]) & 0x4) != 0) {
												Class650.method10862((class555.aClass561ArrayArrayArray7426), 1, i_8_, i_9_, false, 1601224210);
												break while_116_;
											}
											if ((i_9_ + 1 < (class470.aByteArrayArrayArray5354[(162317215 * Class673.anInt8585)][i_8_]).length) && ((class470.aByteArrayArrayArray5354[(162317215 * Class673.anInt8585)][i_8_][i_9_ + 1]) & 0x4) != 0) {
												Class650.method10862((class555.aClass561ArrayArrayArray7426), 1, i_8_, 1 + i_9_, false, 1601224210);
												break while_116_;
											}
											if (i_9_ > 0 && (0 != ((class470.aByteArrayArrayArray5354[(Class673.anInt8585 * 162317215)][i_8_][i_9_ - 1]) & 0x4))) {
												Class650.method10862((class555.aClass561ArrayArrayArray7426), 1, i_8_, i_9_ - 1, false, 1601224210);
												break while_116_;
											}
											i_17_ += i_16_;
											if (i_17_ >= 65536) {
												i_17_ -= 65536;
												if (i_9_ < i_12_) {
													i_9_++;
													if ((1 + i_9_ < (class470.aByteArrayArrayArray5354[(162317215 * (Class673.anInt8585))][i_8_]).length) && ((class470.aByteArrayArrayArray5354[(162317215 * (Class673.anInt8585))][i_8_][i_9_ + 1]) & 0x4) != 0) {
														Class650.method10862((class555.aClass561ArrayArrayArray7426), 1, i_8_, i_9_ + 1, false, 1601224210);
														break while_116_;
													}
												} else if (i_9_ > i_12_ && --i_9_ > 0 && (0 != ((class470.aByteArrayArrayArray5354[((Class673.anInt8585) * 162317215)][i_8_][i_9_ - 1]) & 0x4)))
													break;
											}
										}
										Class650.method10862((class555.aClass561ArrayArrayArray7426), 1, i_8_, i_9_ - 1, false, 1601224210);
									} while (false);
								} else {
									int i_18_ = 65536 * i_14_ / i_15_;
									int i_19_ = 32768;
									for (;;) {
										if (i_9_ == i_12_)
											break while_117_;
										if (i_9_ < i_12_)
											i_9_++;
										else if (i_9_ > i_12_)
											i_9_--;
										if (((class470.aByteArrayArrayArray5354[Class673.anInt8585 * 162317215][i_8_][i_9_]) & 0x4) != 0) {
											Class650.method10862((class555.aClass561ArrayArrayArray7426), 1, i_8_, i_9_, false, 1601224210);
											break while_117_;
										}
										if ((i_8_ + 1 < (class470.aByteArrayArrayArray5354[(Class673.anInt8585 * 162317215)]).length) && ((class470.aByteArrayArrayArray5354[(162317215 * Class673.anInt8585)][1 + i_8_][i_9_]) & 0x4) != 0) {
											Class650.method10862((class555.aClass561ArrayArrayArray7426), 1, 1 + i_8_, i_9_, false, 1601224210);
											break while_117_;
										}
										if (i_8_ > 0 && 0 != ((class470.aByteArrayArrayArray5354[(162317215 * Class673.anInt8585)][i_8_ - 1][i_9_]) & 0x4)) {
											Class650.method10862((class555.aClass561ArrayArrayArray7426), 1, i_8_ - 1, i_9_, false, 1601224210);
											break while_117_;
										}
										i_19_ += i_18_;
										if (i_19_ >= 65536) {
											i_19_ -= 65536;
											if (i_8_ < i_11_) {
												if ((++i_8_ + 1 < (class470.aByteArrayArrayArray5354[(162317215 * (Class673.anInt8585))]).length) && ((class470.aByteArrayArrayArray5354[(Class673.anInt8585 * 162317215)][1 + i_8_][i_9_]) & 0x4) != 0) {
													Class650.method10862((class555.aClass561ArrayArrayArray7426), 1, 1 + i_8_, i_9_, false, 1601224210);
													break while_117_;
												}
											} else if (i_8_ > i_11_ && --i_8_ > 0 && ((class470.aByteArrayArrayArray5354[((Class673.anInt8585) * 162317215)][i_8_ - 1][i_9_]) & 0x4) != 0)
												break;
										}
									}
									Class650.method10862(class555.aClass561ArrayArrayArray7426, 1, i_8_ - 1, i_9_, false, 1601224210);
								}
							}
						} while (false);
					}
				}
			} else {
				int i_20_ = Class590.method9853(Class320.anInt3543 * -1998563323, -1261737255 * Class201.anInt2211, Class673.anInt8585 * 162317215, (byte) 5);
				if (i_20_ - 298893113 * Class142.anInt1657 < 3200 && ((class470.aByteArrayArrayArray5354[162317215 * Class673.anInt8585][-1998563323 * Class320.anInt3543 >> 9][-1261737255 * Class201.anInt2211 >> 9]) & 0x4) != 0)
					Class650.method10862(class555.aClass561ArrayArrayArray7426, 1, Class320.anInt3543 * -1998563323 >> 9, Class201.anInt2211 * -1261737255 >> 9, false, 1601224210);
			}
		}
	}

	public static void method14278(byte i) {
		if (11 == -1927019389 * client.anInt11048) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4434, client.aClass109_11066.aClass2_1367, (byte) -85);
			client.aClass109_11066.method1969(class527_sub15, (byte) 1);
			Class565.aClass687_7578 = Class687.aClass687_8675;
			Class63.aString739 = null;
		}
	}
}
