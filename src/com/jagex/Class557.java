/* Class557 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class557 {
	int anInt7519;
	Class551 aClass551_7520;
	int anInt7521;
	int anInt7522;
	int anInt7523;
	int anInt7524;
	byte[] aByteArray7525;
	float aFloat7526;
	byte[] aByteArray7527;
	int anInt7528;
	Class358_Sub1 this$0;

	int method9423(int i) {
		return anInt7524 * -1320912489;
	}

	void method9424(byte[] is, int i, int i_0_, byte i_1_) {
		int i_2_ = i;
		while (i_2_ < i + i_0_) {
			aByteArray7527[anInt7523 * -1381693559] = is[i_2_];
			aByteArray7527[-1381693559 * anInt7523 + 1] = is[1 + i_2_];
			i_2_ += 2;
			anInt7523 += -952156814;
			anInt7523 = -1381693559 * anInt7523 % aByteArray7527.length * 1671405241;
			anInt7524 -= 1330326606;
		}
	}

	Class557(Class358_Sub1 class358_sub1, Class551 class551, int i, float f, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
		this$0 = class358_sub1;
		aClass551_7520 = class551;
		aByteArray7527 = new byte[i];
		aByteArray7525 = new byte[i_3_ / 8];
		anInt7524 = aByteArray7527.length * -1482320345;
		aFloat7526 = f;
		anInt7521 = -1260224875 * i_3_;
		anInt7528 = i_4_ * 1578286995;
		anInt7523 = 0;
		anInt7522 = 0;
		anInt7519 = 0;
	}

	int method9425() {
		return anInt7524 * -1320912489;
	}

	static final void method9426(Class665 class665, int i) {
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class703.aClass219_8825.method4023(-1912146485);
	}

	static final void method9427(Class665 class665, int i) {
		int i_6_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class327_Sub2.method15754(i_6_ >> 14 & 0x3fff, i_6_ & 0x3fff, -1958342125);
	}

	static final void method9428(Class665 class665, byte i) {
		Class6.method586((byte) 14);
		Class467.method7667(-791920877);
		client.aClass509_11072.method8361(-428559959);
		Class631.method10465(-1880844631);
		client.aBool11020 = false;
	}

	static boolean method9429(int i, byte i_7_) {
		return i == 57 || 58 == i || 1007 == i || i == 25 || 30 == i;
	}

	static final void method9430(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class314_Sub1.method15662(class243, class240, class665, (byte) -24);
	}

	static void method9431(int i, boolean bool, byte i_8_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(22, (long) i);
		class527_sub8_sub9.method18187(-16101499);
		class527_sub8_sub9.anInt11676 = -281159195 * (bool ? 1 : 0);
	}
}
