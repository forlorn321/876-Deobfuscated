/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class47 {
	int anInt495;
	int anInt496;
	int anInt497;
	Class210 aClass210_498 = Class210.aClass210_2251;
	boolean aBool499;

	Class47() {
		/* empty */
	}

	static void method1237(Class527_Sub8_Sub7 class527_sub8_sub7, int i, int i_0_, boolean bool, short i_1_) {
		if (class527_sub8_sub7 != null && class527_sub8_sub7 != Class35.aClass694_348.aClass527_8736) {
			int i_2_ = -376653789 * class527_sub8_sub7.anInt11646;
			int i_3_ = class527_sub8_sub7.anInt11647 * 815386065;
			int i_4_ = 1720667579 * class527_sub8_sub7.anInt11652;
			int i_5_ = (int) (6794198078167911209L * class527_sub8_sub7.aLong11644);
			long l = class527_sub8_sub7.aLong11644 * 6794198078167911209L;
			if (i_4_ >= 2000)
				i_4_ -= 2000;
			Class592 class592 = client.aClass509_11072.method8283((short) 2592);
			OutgoingPacket class414 = null;
			if (18 == i_4_)
				class414 = OutgoingPacket.aClass414_4408;
			else if (i_4_ == 19)
				class414 = OutgoingPacket.aClass414_4454;
			else if (i_4_ == 20)
				class414 = OutgoingPacket.aClass414_4460;
			else if (21 == i_4_)
				class414 = OutgoingPacket.aClass414_4419;
			else if (22 == i_4_)
				class414 = OutgoingPacket.aClass414_4412;
			else if (i_4_ == 1004)
				class414 = OutgoingPacket.aClass414_4409;
			if (null != class414) {
				client.anInt11140 = 1300500861 * i;
				client.anInt11141 = 1655628027 * i_0_;
				client.anInt11123 = -1200263634;
				client.anInt11142 = 0;
				Class527_Sub15 class527_sub15 = Class70.method1489(class414, client.aClass109_11067.aClass2_1367, (byte) -13);
				class527_sub15.buffer.writeByte128((bool ? 2 : 0) | (Class475.method7770(-1276908881) ? 1 : 0), -362087053);
				class527_sub15.buffer.writeShortLE2(i_5_, (byte) -10);
				class527_sub15.buffer.writeShortLE2(class592.anInt7798 * 153371143 + i_2_, (byte) -17);
				class527_sub15.buffer.writeShortLE2(i_3_ + -2029646807 * class592.anInt7799, (byte) -117);
				client.aClass109_11067.method1969(class527_sub15, (byte) 1);
				Class388.method6457(i_2_, i_3_, 202602476);
			}
			OutgoingPacket class414_6_ = null;
			if (i_4_ == 44)
				class414_6_ = OutgoingPacket.aClass414_4484;
			else if (i_4_ == 45)
				class414_6_ = OutgoingPacket.aClass414_4452;
			else if (46 == i_4_)
				class414_6_ = OutgoingPacket.aClass414_4427;
			else if (i_4_ == 47)
				class414_6_ = OutgoingPacket.aClass414_4401;
			else if (i_4_ == 48)
				class414_6_ = OutgoingPacket.aClass414_4392;
			else if (i_4_ == 49)
				class414_6_ = OutgoingPacket.aClass414_4451;
			else if (50 == i_4_)
				class414_6_ = OutgoingPacket.aClass414_4493;
			else if (51 == i_4_)
				class414_6_ = OutgoingPacket.aClass414_4402;
			else if (i_4_ == 52)
				class414_6_ = OutgoingPacket.aClass414_4462;
			else if (53 == i_4_)
				class414_6_ = OutgoingPacket.aClass414_4477;
			if (class414_6_ != null) {
				Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_5_];
				if (class640_sub1_sub2_sub1_sub2 != null) {
					client.anInt11140 = 1300500861 * i;
					client.anInt11141 = i_0_ * 1655628027;
					client.anInt11123 = -1200263634;
					client.anInt11142 = 0;
					Class527_Sub15 class527_sub15 = Class70.method1489(class414_6_, (client.aClass109_11067.aClass2_1367), (byte) -7);
					class527_sub15.buffer.writeShort(i_5_, 1404835786);
					class527_sub15.buffer.write128Byte(Class475.method7770(-1987885430) ? 1 : 0, (byte) 8);
					client.aClass109_11067.method1969(class527_sub15, (byte) 1);
					Class388.method6457((class640_sub1_sub2_sub1_sub2.anIntArray11902[0]), (class640_sub1_sub2_sub1_sub2.anIntArray11944[0]), 81817979);
				}
			}
			if (30 == i_4_ && null == client.aClass243_11196) {
				Class644.method10741(i_3_, i_2_, 1703326456);
				client.aClass243_11196 = Class447.method7260(i_3_, i_2_, 277935414);
				if (null != client.aClass243_11196)
					Class430.method6876(client.aClass243_11196, (byte) 15);
			}
			if (23 == i_4_) {
				if (962135673 * client.anInt11075 > 0 && Class45.method1215(-1855239003))
					Class157.method2561((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), 153371143 * class592.anInt7798 + i_2_, (class592.anInt7799 * -2029646807 + i_3_), (byte) -27);
				else {
					Class527_Sub15 class527_sub15 = Class587.method9806(i_2_, i_3_, i_5_, 1053197127);
					if (1 == i_5_) {
						class527_sub15.buffer.writeByte(-1, -1124545850);
						class527_sub15.buffer.writeByte(-1, 3246703);
						class527_sub15.buffer.writeShort((int) client.aFloat11112, 1404835786);
						class527_sub15.buffer.writeByte(57, 1874565864);
						class527_sub15.buffer.writeByte(client.anInt11088 * -973282125, 1998515407);
						class527_sub15.buffer.writeByte(-2083955513 * client.anInt10991, -779609824);
						class527_sub15.buffer.writeByte(89, 1823371632);
						Class442 class442 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927);
						class527_sub15.buffer.writeShort((int) class442.aFloat4918, 1404835786);
						class527_sub15.buffer.writeShort((int) class442.aFloat4919, 1404835786);
						class527_sub15.buffer.writeByte(63, 377685440);
					} else {
						client.anInt11140 = 1300500861 * i;
						client.anInt11141 = 1655628027 * i_0_;
						client.anInt11123 = 1547351831;
						client.anInt11142 = 0;
					}
					client.aClass109_11067.method1969(class527_sub15, (byte) 1);
					Class388.method6457(i_2_, i_3_, -731330878);
				}
			}
			if (59 == i_4_) {
				client.anInt11140 = 1300500861 * i;
				client.anInt11141 = 1655628027 * i_0_;
				client.anInt11123 = 1547351831;
				client.anInt11142 = 0;
				Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4431, client.aClass109_11067.aClass2_1367, (byte) -75);
				class527_sub15.buffer.writeShort128(968228363 * client.anInt11078, 2037170466);
				class527_sub15.buffer.writeShortLE128(i_3_ + class592.anInt7799 * -2029646807, 2040487063);
				class527_sub15.buffer.writeShortLE2(client.anInt11190 * 1504620761, (byte) -22);
				class527_sub15.buffer.writeIntV1(847840847 * Class275.anInt3157, (byte) 7);
				class527_sub15.buffer.writeShortLE128(i_2_ + 153371143 * class592.anInt7798, 2013077792);
				client.aClass109_11067.method1969(class527_sub15, (byte) 1);
				Class388.method6457(i_2_, i_3_, 445553300);
			}
			if (i_4_ == 17) {
				client.anInt11140 = 1300500861 * i;
				client.anInt11141 = 1655628027 * i_0_;
				client.anInt11123 = -1200263634;
				client.anInt11142 = 0;
				Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4448, client.aClass109_11067.aClass2_1367, (byte) 82);
				class527_sub15.buffer.writeShortLE128(i_5_, 1630211974);
				class527_sub15.buffer.writeShort(-2029646807 * class592.anInt7799 + i_3_, 1404835786);
				class527_sub15.buffer.writeShort(1504620761 * client.anInt11190, 1404835786);
				class527_sub15.buffer.writeShortLE128(client.anInt11078 * 968228363, 1096213594);
				class527_sub15.buffer.writeIntV2(847840847 * Class275.anInt3157, (byte) 33);
				class527_sub15.buffer.writeByte(Class475.method7770(-1895863231) ? 1 : 0, 1482959872);
				class527_sub15.buffer.writeShortLE2(i_2_ + 153371143 * class592.anInt7798, (byte) -35);
				client.aClass109_11067.method1969(class527_sub15, (byte) 1);
				Class388.method6457(i_2_, i_3_, 529572547);
			}
			OutgoingPacket class414_7_ = null;
			if (3 == i_4_)
				class414_7_ = OutgoingPacket.aClass414_4420;
			else if (4 == i_4_)
				class414_7_ = OutgoingPacket.aClass414_4413;
			else if (i_4_ == 5)
				class414_7_ = OutgoingPacket.aClass414_4424;
			else if (i_4_ == 6)
				class414_7_ = OutgoingPacket.aClass414_4425;
			else if (i_4_ == 1001)
				class414_7_ = OutgoingPacket.aClass414_4474;
			else if (1002 == i_4_)
				class414_7_ = OutgoingPacket.aClass414_4475;
			if (class414_7_ != null) {
				client.anInt11140 = i * 1300500861;
				client.anInt11141 = i_0_ * 1655628027;
				client.anInt11123 = -1200263634;
				client.anInt11142 = 0;
				Class527_Sub15 class527_sub15 = Class70.method1489(class414_7_, client.aClass109_11067.aClass2_1367, (byte) 30);
				class527_sub15.buffer.writeByte(Class475.method7770(93858236) ? 1 : 0, 1580941926);
				class527_sub15.buffer.writeShortLE2(i_2_ + 153371143 * class592.anInt7798, (byte) -113);
				class527_sub15.buffer.writeShortLE128(class592.anInt7799 * -2029646807 + i_3_, 1036808092);
				class527_sub15.buffer.writeIntV1((int) (l >>> 32) & 0x7fffffff, (byte) 7);
				client.aClass109_11067.method1969(class527_sub15, (byte) 1);
				Class388.method6457(i_2_, i_3_, 1187204087);
			}
			if (i_4_ == 8) {
				Class527_Sub26 class527_sub26 = ((Class527_Sub26) client.aClass14_10989.method709((long) i_5_));
				if (null != class527_sub26) {
					Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) class527_sub26.anObject10522);
					client.anInt11140 = 1300500861 * i;
					client.anInt11141 = 1655628027 * i_0_;
					client.anInt11123 = -1200263634;
					client.anInt11142 = 0;
					Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4416, (client.aClass109_11067.aClass2_1367), (byte) 28);
					class527_sub15.buffer.writeShort(client.anInt11190 * 1504620761, 1404835786);
					class527_sub15.buffer.writeIntV1(Class275.anInt3157 * 847840847, (byte) 7);
					class527_sub15.buffer.writeShortLE2(i_5_, (byte) -36);
					class527_sub15.buffer.writeByte(Class475.method7770(-1537574167) ? 1 : 0, 108583617);
					class527_sub15.buffer.writeShortLE2(client.anInt11078 * 968228363, (byte) -101);
					client.aClass109_11067.method1969(class527_sub15, (byte) 1);
					Class388.method6457((class640_sub1_sub2_sub1_sub1.anIntArray11902[0]), (class640_sub1_sub2_sub1_sub1.anIntArray11944[0]), 1045159125);
				}
			}
			if (25 == i_4_) {
				Class243 class243 = Class447.method7260(i_3_, i_2_, 525827027);
				if (null != class243) {
					Class700.method14291(-1979804846);
					Class527_Sub25 class527_sub25 = client.method17815(class243);
					Class75.method1530(class243, class527_sub25.method16255((byte) 80), class527_sub25.anInt10512 * -43099239, (byte) 63);
					client.aString11191 = Class71.method1493(class243, -1054157649);
					if (null == client.aString11191)
						client.aString11191 = "Null";
					client.aString11192 = new StringBuilder().append(class243.aString2614).append(Class232.method4330(16777215, 1723578403)).toString();
				}
			} else {
				OutgoingPacket class414_8_ = null;
				if (i_4_ == 9)
					class414_8_ = OutgoingPacket.aClass414_4439;
				else if (i_4_ == 10)
					class414_8_ = OutgoingPacket.aClass414_4449;
				else if (i_4_ == 11)
					class414_8_ = OutgoingPacket.aClass414_4436;
				else if (12 == i_4_)
					class414_8_ = OutgoingPacket.aClass414_4445;
				else if (13 == i_4_)
					class414_8_ = OutgoingPacket.aClass414_4433;
				else if (1003 == i_4_)
					class414_8_ = OutgoingPacket.aClass414_4391;
				if (null != class414_8_) {
					Class527_Sub26 class527_sub26 = ((Class527_Sub26) client.aClass14_10989.method709((long) i_5_));
					if (null != class527_sub26) {
						Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) class527_sub26.anObject10522);
						client.anInt11140 = i * 1300500861;
						client.anInt11141 = i_0_ * 1655628027;
						client.anInt11123 = -1200263634;
						client.anInt11142 = 0;
						Class527_Sub15 class527_sub15 = Class70.method1489(class414_8_, (client.aClass109_11067.aClass2_1367), (byte) -6);
						class527_sub15.buffer.writeShort128(i_5_, 1433060374);
						class527_sub15.buffer.writeByte128(Class475.method7770(-382290108) ? 1 : 0, -362087053);
						client.aClass109_11067.method1969(class527_sub15, (byte) 1);
						Class388.method6457((class640_sub1_sub2_sub1_sub1.anIntArray11902[0]), (class640_sub1_sub2_sub1_sub1.anIntArray11944[0]), -647982979);
					}
				}
				if (15 == i_4_) {
					Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_5_];
					if (null != class640_sub1_sub2_sub1_sub2) {
						client.anInt11140 = i * 1300500861;
						client.anInt11141 = i_0_ * 1655628027;
						client.anInt11123 = -1200263634;
						client.anInt11142 = 0;
						Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4469, (client.aClass109_11067.aClass2_1367), (byte) -100);
						class527_sub15.buffer.writeShort128(client.anInt11078 * 968228363, 1599115252);
						class527_sub15.buffer.writeByte128(Class475.method7770(509729768) ? 1 : 0, -362087053);
						class527_sub15.buffer.writeIntV1(Class275.anInt3157 * 847840847, (byte) 7);
						class527_sub15.buffer.writeShortLE2(1504620761 * client.anInt11190, (byte) -82);
						class527_sub15.buffer.writeShortLE2(i_5_, (byte) -98);
						client.aClass109_11067.method1969(class527_sub15, (byte) 1);
						Class388.method6457((class640_sub1_sub2_sub1_sub2.anIntArray11902[0]), (class640_sub1_sub2_sub1_sub2.anIntArray11944[0]), -249803599);
					}
				}
				if (16 == i_4_) {
					client.anInt11140 = 1300500861 * i;
					client.anInt11141 = i_0_ * 1655628027;
					client.anInt11123 = -1200263634;
					client.anInt11142 = 0;
					Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4469, (client.aClass109_11067.aClass2_1367), (byte) 98);
					class527_sub15.buffer.writeShort128(client.anInt11078 * 968228363, 1496731622);
					class527_sub15.buffer.writeByte128(Class475.method7770(-2022671344) ? 1 : 0, -362087053);
					class527_sub15.buffer.writeIntV1(847840847 * Class275.anInt3157, (byte) 7);
					class527_sub15.buffer.writeShortLE2(client.anInt11190 * 1504620761, (byte) -106);
					class527_sub15.buffer.writeShortLE2((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anInt11955) * -541403241, (byte) -83);
					client.aClass109_11067.method1969(class527_sub15, (byte) 1);
				}
				if (i_4_ == 57 || i_4_ == 1007)
					Class331_Sub3.method15766(i_5_, i_3_, i_2_, class527_sub8_sub7.aString11650, 472161400);
				if (i_4_ == 58) {
					Class243 class243 = Class447.method7260(i_3_, i_2_, 603113155);
					if (null != class243)
						Class149.method2491(class243, 438430406);
				}
				if (2 == i_4_) {
					client.anInt11140 = 1300500861 * i;
					client.anInt11141 = 1655628027 * i_0_;
					client.anInt11123 = -1200263634;
					client.anInt11142 = 0;
					Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4491, (client.aClass109_11067.aClass2_1367), (byte) -77);
					class527_sub15.buffer.writeShortLE128(client.anInt11078 * 968228363, 1782626767);
					class527_sub15.buffer.writeShortLE128(client.anInt11190 * 1504620761, 1141104057);
					class527_sub15.buffer.writeByte128(Class475.method7770(390290185) ? 1 : 0, -362087053);
					class527_sub15.buffer.writeIntV2(847840847 * Class275.anInt3157, (byte) 86);
					class527_sub15.buffer.writeIntV2((int) (l >>> 32) & 0x7fffffff, (byte) 14);
					class527_sub15.buffer.writeShort128(153371143 * class592.anInt7798 + i_2_, 1550937488);
					class527_sub15.buffer.writeShortLE2(i_3_ + class592.anInt7799 * -2029646807, (byte) -86);
					client.aClass109_11067.method1969(class527_sub15, (byte) 1);
					Class388.method6457(i_2_, i_3_, -923278497);
				}
				if (i_4_ == 60) {
					if (client.anInt11075 * 962135673 > 0 && Class45.method1215(-1855239003))
						Class157.method2561((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), 153371143 * class592.anInt7798 + i_2_, i_3_ + class592.anInt7799 * -2029646807, (byte) -75);
					else {
						client.anInt11140 = i * 1300500861;
						client.anInt11141 = i_0_ * 1655628027;
						client.anInt11123 = 1547351831;
						client.anInt11142 = 0;
						Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4447, (client.aClass109_11067.aClass2_1367), (byte) -40);
						class527_sub15.buffer.writeShort(class592.anInt7798 * 153371143 + i_2_, 1404835786);
						class527_sub15.buffer.writeShortLE128(i_3_ + -2029646807 * class592.anInt7799, 1709960557);
						client.aClass109_11067.method1969(class527_sub15, (byte) 1);
					}
				}
				if (1008 == i_4_ || i_4_ == 1009 || 1010 == i_4_ || 1011 == i_4_ || i_4_ == 1012)
					Class527.method8743(i_4_, i_5_, i_2_, 1763044444);
				if (client.aBool11188)
					Class700.method14291(-30668533);
				if (Class214.aClass243_2266 != null && client.anInt11144 * -383789517 == 0)
					Class430.method6876(Class214.aClass243_2266, (byte) 4);
			}
		}
	}

	static final void method1238(Class243 class243, Class240 class240, Class665 class665, int i) {
		class243.aString2495 = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
	}

	static final void method1239(Class665 class665, int i) {
		int i_9_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4471, client.aClass109_11067.aClass2_1367, (byte) -116);
		class527_sub15.buffer.writeShort(i_9_, 1404835786);
		client.aClass109_11067.method1969(class527_sub15, (byte) 1);
	}

	static final void method1240(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class665.aClass640_Sub1_Sub2_Sub1_8522.method17049((byte) -49);
	}

	public static void method1241(int[] is, Object[] objects, int i) {
		Class605.method10048(is, objects, 0, is.length - 1, -785755354);
	}

	public static final void method1242(int i, int i_10_, int i_11_, int i_12_, boolean bool, short i_13_) {
		if (i_11_ < 1)
			i_11_ = 1;
		if (i_12_ < 1)
			i_12_ = 1;
		int i_14_ = i_12_ - 334;
		if (i_14_ < 0)
			i_14_ = 0;
		else if (i_14_ > 100)
			i_14_ = 100;
		int i_15_ = (client.aShort11153 + i_14_ * (client.aShort11282 - client.aShort11153) / 100);
		int i_16_ = 512 * (i_15_ * i_12_) / (i_11_ * 334);
		if (i_16_ < client.aShort11287) {
			i_16_ = client.aShort11287;
			i_15_ = 334 * (i_11_ * i_16_) / (i_12_ * 512);
			if (i_15_ > client.aShort11043) {
				i_15_ = client.aShort11043;
				int i_17_ = 512 * (i_12_ * i_15_) / (334 * i_16_);
				int i_18_ = (i_11_ - i_17_) / 2;
				if (bool) {
					Class402.aClass180_4150.method3131();
					Class402.aClass180_4150.method3174(i, i_10_, i_18_, i_12_, -16777216, 420058485);
					Class402.aClass180_4150.method3174(i + i_11_ - i_18_, i_10_, i_18_, i_12_, -16777216, -1875386411);
				}
				i += i_18_;
				i_11_ -= 2 * i_18_;
			}
		} else if (i_16_ > client.aShort11211) {
			i_16_ = client.aShort11211;
			i_15_ = 334 * (i_16_ * i_11_) / (512 * i_12_);
			if (i_15_ < client.aShort11285) {
				i_15_ = client.aShort11285;
				int i_19_ = i_16_ * i_11_ * 334 / (i_15_ * 512);
				int i_20_ = (i_12_ - i_19_) / 2;
				if (bool) {
					Class402.aClass180_4150.method3131();
					Class402.aClass180_4150.method3174(i, i_10_, i_11_, i_20_, -16777216, 1770991306);
					Class402.aClass180_4150.method3174(i, i_12_ + i_10_ - i_20_, i_11_, i_20_, -16777216, -1388622567);
				}
				i_10_ += i_20_;
				i_12_ -= 2 * i_20_;
			}
		}
		client.anInt11062 = i_12_ * i_15_ / 334 * 418533641;
		client.anInt11289 = i * -427097767;
		client.anInt11097 = i_10_ * -978988095;
		client.anInt11291 = (short) i_11_ * 617559259;
		client.anInt11040 = (short) i_12_ * -809717049;
	}

	static void method1243(String string, int i) {
		Class565.aClass687_7578 = Class687.aClass687_8678;
		Class63.aString739 = string;
	}
}
