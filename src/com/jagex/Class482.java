/* Class482 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class482 {
	static Class482 aClass482_5419 = new Class482(0);
	public static Class482 aClass482_5420 = new Class482(1);
	public static Class482 aClass482_5421 = new Class482(2);
	public static Class482 aClass482_5422 = new Class482(3);
	public static Class482 aClass482_5423 = new Class482(4);
	public static Class482 aClass482_5424 = new Class482(5);
	public static Class482 aClass482_5425 = new Class482(6);
	public static Class482 aClass482_5426 = new Class482(7);
	static Class482 aClass482_5427 = new Class482(8);
	public static Class482 aClass482_5428 = new Class482(9);
	int anInt5429;
	public static Class24_Sub22 aClass24_Sub22_5430;

	Class482(int i) {
		anInt5429 = -729407023 * i;
	}

	static final void method7839(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class555.method9407(class243, class240, class665, 1604036228);
	}

	static final void method7840(Class665 class665, byte i) {
		class665.anInt8526 -= 102380841;
		int i_0_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class259.method4787(i_0_, 1920275197);
	}

	static final void method7841(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	public static int method7842(int i) {
		return Class585.aTwitchTV7698.GetChatState();
	}

	static void method7843(Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1, int i, int i_1_, int i_2_, byte i_3_) {
		Class587 class587 = class640_sub1_sub2_sub1.method18542(-1546445921);
		Class695_Sub2 class695_sub2 = class640_sub1_sub2_sub1.aClass695_Sub2_11913;
		int i_4_ = ((class640_sub1_sub2_sub1.anInt11938 * 1672946997 - 1085423875 * class640_sub1_sub2_sub1.aClass61_11936.anInt725) & 0x3fff);
		if (Class679.aClass679_8625.aByte8627 == i) {
			if (i_4_ != 0 || class640_sub1_sub2_sub1.anInt11901 * -1701434739 > 25) {
				if (i_2_ < 0 && -1 != -1847397607 * class587.anInt7720) {
					class695_sub2.method14168(-1847397607 * class587.anInt7720, false, true, 1481513958);
					class695_sub2.aBool10970 = false;
				} else if (i_2_ > 0 && -1 != 1628333675 * class587.anInt7741) {
					class695_sub2.method14168(1628333675 * class587.anInt7741, false, true, 368853625);
					class695_sub2.aBool10970 = false;
				} else if (!class695_sub2.aBool10970 || !(class587.method9787(class695_sub2.method14164(-645755946), -1866842546))) {
					class695_sub2.method14168(class587.method9786(-1234953479), false, true, 395507295);
					class695_sub2.aBool10970 = class640_sub1_sub2_sub1.aClass695_Sub2_11913.method14162(-898419341);
				}
			} else if (!class695_sub2.aBool10970 || !class587.method9787(class695_sub2.method14164(-972304631), -459453377)) {
				class695_sub2.method14168(class587.method9786(-1710883807), false, true, 294431884);
				class695_sub2.aBool10970 = class695_sub2.method14162(-1308912891);
			}
		} else if (class640_sub1_sub2_sub1.anInt11910 * 816496727 != -1 && (i_4_ >= 10240 || i_4_ <= 2048)) {
			int i_5_ = ((client.anIntArray11143[i_1_] - (1085423875 * class640_sub1_sub2_sub1.aClass61_11936.anInt725)) & 0x3fff);
			if (Class679.aClass679_8623.aByte8627 == i && 298811127 * class587.anInt7755 != -1) {
				if (i_5_ > 2048 && i_5_ <= 6144 && class587.anInt7729 * -1620298651 != -1)
					class695_sub2.method14168(class587.anInt7729 * -1620298651, false, true, 586451202);
				else if (i_5_ >= 10240 && i_5_ < 14336 && class587.anInt7728 * 1429573541 != -1)
					class695_sub2.method14168(1429573541 * class587.anInt7728, false, true, 1481126010);
				else if (i_5_ > 6144 && i_5_ < 10240 && -1 != -1566427073 * class587.anInt7727)
					class695_sub2.method14168(-1566427073 * class587.anInt7727, false, true, 1994669180);
				else
					class695_sub2.method14168(298811127 * class587.anInt7755, false, true, 173425869);
			} else if (Class679.aClass679_8620.aByte8627 == i && -1 != class587.anInt7721 * -1585256987) {
				if (i_5_ > 2048 && i_5_ <= 6144 && -1 != -553713681 * class587.anInt7733)
					class695_sub2.method14168(-553713681 * class587.anInt7733, false, true, 295177989);
				else if (i_5_ >= 10240 && i_5_ < 14336 && class587.anInt7732 * -2115193861 != -1)
					class695_sub2.method14168(class587.anInt7732 * -2115193861, false, true, 1064421111);
				else if (i_5_ > 6144 && i_5_ < 10240 && class587.anInt7731 * 755159797 != -1)
					class695_sub2.method14168(class587.anInt7731 * 755159797, false, true, 1287187328);
				else
					class695_sub2.method14168(class587.anInt7721 * -1585256987, false, true, 1116926686);
			} else if (i_5_ > 2048 && i_5_ <= 6144 && 1404635341 * class587.anInt7716 != -1)
				class695_sub2.method14168(class587.anInt7716 * 1404635341, false, true, 966637805);
			else if (i_5_ >= 10240 && i_5_ < 14336 && -1 != class587.anInt7724 * 2112324253)
				class695_sub2.method14168(2112324253 * class587.anInt7724, false, true, 783884159);
			else if (i_5_ > 6144 && i_5_ < 10240 && -1 != class587.anInt7723 * -685957719)
				class695_sub2.method14168(class587.anInt7723 * -685957719, false, true, 778251225);
			else
				class695_sub2.method14168(class587.anInt7759 * 581945223, false, true, 1251042835);
			class695_sub2.aBool10970 = false;
		} else if (i_4_ != 0 || class640_sub1_sub2_sub1.anInt11901 * -1701434739 > 25) {
			if (i == Class679.aClass679_8623.aByte8627 && 298811127 * class587.anInt7755 != -1) {
				if (i_2_ < 0 && -1 != -161879461 * class587.anInt7736)
					class695_sub2.method14168(-161879461 * class587.anInt7736, false, true, 535480904);
				else if (i_2_ > 0 && -2062948993 * class587.anInt7737 != -1)
					class695_sub2.method14168(-2062948993 * class587.anInt7737, false, true, 2135362852);
				else
					class695_sub2.method14168(class587.anInt7755 * 298811127, false, true, 1012333486);
			} else if (i == Class679.aClass679_8620.aByte8627 && -1 != -1585256987 * class587.anInt7721) {
				if (i_2_ < 0 && class587.anInt7734 * 451214523 != -1)
					class695_sub2.method14168(class587.anInt7734 * 451214523, false, true, 2122029004);
				else if (i_2_ > 0 && -1 != 723982429 * class587.anInt7735)
					class695_sub2.method14168(723982429 * class587.anInt7735, false, true, 1434934244);
				else
					class695_sub2.method14168(class587.anInt7721 * -1585256987, false, true, 1773900346);
			} else if (i_2_ < 0 && -1 != -1462562069 * class587.anInt7754)
				class695_sub2.method14168(-1462562069 * class587.anInt7754, false, true, 175566995);
			else if (i_2_ > 0 && -1 != class587.anInt7739 * 225544113)
				class695_sub2.method14168(225544113 * class587.anInt7739, false, true, 1509550243);
			else
				class695_sub2.method14168(class587.anInt7759 * 581945223, false, true, 974904540);
			class695_sub2.aBool10970 = false;
		} else {
			if (Class679.aClass679_8623.aByte8627 == i && class587.anInt7755 * 298811127 != -1)
				class695_sub2.method14168(298811127 * class587.anInt7755, false, true, 1523632332);
			else if (Class679.aClass679_8620.aByte8627 == i && -1585256987 * class587.anInt7721 != -1)
				class695_sub2.method14168(class587.anInt7721 * -1585256987, false, true, 417832475);
			else
				class695_sub2.method14168(class587.anInt7759 * 581945223, false, true, 476357561);
			class695_sub2.aBool10970 = false;
		}
	}

	static final void method7844(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class335.method5874(class243, class665, -1764063521);
	}

	static int method7845(byte[] is, int i, int i_6_, int i_7_) {
		int i_8_ = -1;
		for (int i_9_ = i; i_9_ < i_6_; i_9_++)
			i_8_ = i_8_ >>> 8 ^ (RSByteBuffer.anIntArray10690[(i_8_ ^ is[i_9_]) & 0xff]);
		i_8_ ^= 0xffffffff;
		return i_8_;
	}

	static final void method7846(Class665 class665, int i) {
		int i_10_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class527_Sub8_Sub12 class527_sub8_sub12 = Class387.method6441((byte) -103);
		if (null != class527_sub8_sub12) {
			boolean bool = class527_sub8_sub12.method18302(i_10_ >> 14 & 0x3fff, i_10_ & 0x3fff, Class666.anIntArray8556, 1312560541);
			if (bool) {
				class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = Class666.anIntArray8556[1];
				class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = Class666.anIntArray8556[2];
			} else {
				class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
				class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			}
		} else {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		}
	}
}
