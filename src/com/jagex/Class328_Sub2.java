/* Class328_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class328_Sub2 extends Class328 {
	static final int anInt9995 = 6;
	static final int anInt9996 = 0;
	Class286 aClass286_9997;
	static final int anInt9998 = 1;
	static final int anInt9999 = 3;
	static final int anInt10000 = 4;
	static final int anInt10001 = 5;
	static final int anInt10002 = 0;
	static final int anInt10003 = 7;
	static final int anInt10004 = 2;
	Class427 aClass427_10005;
	static final int anInt10006 = 2;
	static final int anInt10007 = 3;
	Class285[] aClass285Array10008 = new Class285[3];
	int[][] anIntArrayArray10009 = new int[3][7];
	int[] anIntArray10010;
	Class427 aClass427_10011 = new Class427(1.0F, 1.0F, 1.0F, 1.0F);
	static final int anInt10012 = 1;

	public void method4307() {
		aClass286_9997.method3850(aClass285Array10008[1]);
		aClass286_9997.method3843();
		anIntArray10010 = anIntArrayArray10009[aClass286_9997.method3852(592488171)];
		aClass286_9997.method3865(anIntArray10010[2], 1, anInterface36_3593, 1788878014);
		aClass286_9997.method3878(anIntArray10010[4], aClass443_3595, 650653821);
		method9147((byte) 52);
	}

	public void method4306() {
		aClass286_9997.method3850(aClass285Array10008[0]);
		aClass286_9997.method3843();
		anIntArray10010 = anIntArrayArray10009[aClass286_9997.method3852(1689509802)];
		method9147((byte) 14);
	}

	public void method4304(int i, int i_0_) {
		switch (i) {
		case 1:
			aClass427_10011.method5132(-1);
			aClass427_10005.method5132(0);
			break;
		case 0:
			aClass427_10011.method5132(i_0_);
			aClass427_10005.method5132(0);
			break;
		case 3:
			aClass427_10011.method5132(0xffffff | i_0_ & ~0xffffff);
			aClass427_10005.method5132(i_0_ & 0xffffff);
			break;
		case 4:
			aClass427_10011.method5132(-1);
			aClass427_10005.method5132(i_0_);
			aClass427_10005.method5135();
			break;
		case 2:
			aClass427_10011.method5132(i_0_);
			aClass427_10005.method5132(0);
			break;
		}
	}

	boolean method9145(int i) throws Exception_Sub7 {
		aClass286_9997 = aClass167_Sub3_3590.method8714("Sprite");
		Class536_Sub8_Sub1 class536_sub8_sub1 = aClass286_9997.method3866("WVPMatrix", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_1_ = aClass286_9997.method3866("SpriteSampler", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_2_ = aClass286_9997.method3866("MaskSampler", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_3_ = aClass286_9997.method3866("MulColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_4_ = aClass286_9997.method3866("AddColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_5_ = aClass286_9997.method3866("SpriteTexCoordMatrix", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_6_ = aClass286_9997.method3866("MaskTexCoordMatrix", (byte) 0);
		aClass285Array10008[0] = aClass286_9997.method3855("Normal", (byte) 14);
		aClass285Array10008[1] = aClass286_9997.method3855("Masked", (byte) 40);
		aClass285Array10008[2] = aClass286_9997.method3855("AlphaTex", (byte) 71);
		for (int i_7_ = 0; i_7_ < 3; i_7_++) {
			int i_8_ = aClass286_9997.method3894(aClass285Array10008[i_7_], 1546491268);
			anIntArrayArray10009[i_7_][0] = class536_sub8_sub1.method10647(i_8_);
			anIntArrayArray10009[i_7_][1] = class536_sub8_sub1_1_.method10647(i_8_);
			anIntArrayArray10009[i_7_][2] = class536_sub8_sub1_2_.method10647(i_8_);
			anIntArrayArray10009[i_7_][5] = class536_sub8_sub1_3_.method10647(i_8_);
			anIntArrayArray10009[i_7_][6] = class536_sub8_sub1_4_.method10647(i_8_);
			anIntArrayArray10009[i_7_][3] = class536_sub8_sub1_5_.method10647(i_8_);
			anIntArrayArray10009[i_7_][4] = class536_sub8_sub1_6_.method10647(i_8_);
		}
		aClass286_9997.method3850(aClass285Array10008[0]);
		return true;
	}

	public void method4309() {
		aClass286_9997.method3850(aClass285Array10008[0]);
		aClass286_9997.method3843();
		anIntArray10010 = anIntArrayArray10009[aClass286_9997.method3852(595054676)];
		method9147((byte) 76);
	}

	public void method4308() {
		aClass286_9997.method3850(aClass285Array10008[0]);
		aClass286_9997.method3843();
		anIntArray10010 = anIntArrayArray10009[aClass286_9997.method3852(1494408426)];
		method9147((byte) 48);
	}

	public void method4305() {
		aClass286_9997.method3850(aClass285Array10008[1]);
		aClass286_9997.method3843();
		anIntArray10010 = anIntArrayArray10009[aClass286_9997.method3852(1743679001)];
		aClass286_9997.method3865(anIntArray10010[2], 1, anInterface36_3593, 1933424658);
		aClass286_9997.method3878(anIntArray10010[4], aClass443_3595, -1782172347);
		method9147((byte) 55);
	}

	public void method4313() {
		aClass286_9997.method3850(aClass285Array10008[1]);
		aClass286_9997.method3843();
		anIntArray10010 = anIntArrayArray10009[aClass286_9997.method3852(613821408)];
		aClass286_9997.method3865(anIntArray10010[2], 1, anInterface36_3593, 2074353795);
		aClass286_9997.method3878(anIntArray10010[4], aClass443_3595, -1980129098);
		method9147((byte) 50);
	}

	public void method4315() {
		aClass286_9997.method3850(aClass285Array10008[0]);
		aClass286_9997.method3843();
		anIntArray10010 = anIntArrayArray10009[aClass286_9997.method3852(1404258821)];
		method9147((byte) 49);
	}

	public void method4311() {
		aClass286_9997.method3850(aClass285Array10008[0]);
		aClass286_9997.method3843();
		anIntArray10010 = anIntArrayArray10009[aClass286_9997.method3852(1252160538)];
		method9147((byte) 120);
	}

	public void method4310() {
		aClass286_9997.method3850(aClass285Array10008[1]);
		aClass286_9997.method3843();
		anIntArray10010 = anIntArrayArray10009[aClass286_9997.method3852(1129913272)];
		aClass286_9997.method3865(anIntArray10010[2], 1, anInterface36_3593, 1880664155);
		aClass286_9997.method3878(anIntArray10010[4], aClass443_3595, 1540209786);
		method9147((byte) 23);
	}

	public Class328_Sub2(Class167_Sub3 class167_sub3) throws Exception_Sub7 {
		super(class167_sub3);
		aClass427_10005 = new Class427(0.0F, 0.0F, 0.0F, 0.0F);
		method9145(-1081863552);
	}

	public void method4314() {
		aClass286_9997.method3850(aClass285Array10008[1]);
		aClass286_9997.method3843();
		anIntArray10010 = anIntArrayArray10009[aClass286_9997.method3852(2116524666)];
		aClass286_9997.method3865(anIntArray10010[2], 1, anInterface36_3593, 2009187919);
		aClass286_9997.method3878(anIntArray10010[4], aClass443_3595, -638852791);
		method9147((byte) 116);
	}

	boolean method9146() throws Exception_Sub7 {
		aClass286_9997 = aClass167_Sub3_3590.method8714("Sprite");
		Class536_Sub8_Sub1 class536_sub8_sub1 = aClass286_9997.method3866("WVPMatrix", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_9_ = aClass286_9997.method3866("SpriteSampler", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_10_ = aClass286_9997.method3866("MaskSampler", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_11_ = aClass286_9997.method3866("MulColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_12_ = aClass286_9997.method3866("AddColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_13_ = aClass286_9997.method3866("SpriteTexCoordMatrix", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_14_ = aClass286_9997.method3866("MaskTexCoordMatrix", (byte) 0);
		aClass285Array10008[0] = aClass286_9997.method3855("Normal", (byte) -77);
		aClass285Array10008[1] = aClass286_9997.method3855("Masked", (byte) -30);
		aClass285Array10008[2] = aClass286_9997.method3855("AlphaTex", (byte) -30);
		for (int i = 0; i < 3; i++) {
			int i_15_ = aClass286_9997.method3894(aClass285Array10008[i], 553694766);
			anIntArrayArray10009[i][0] = class536_sub8_sub1.method10647(i_15_);
			anIntArrayArray10009[i][1] = class536_sub8_sub1_9_.method10647(i_15_);
			anIntArrayArray10009[i][2] = class536_sub8_sub1_10_.method10647(i_15_);
			anIntArrayArray10009[i][5] = class536_sub8_sub1_11_.method10647(i_15_);
			anIntArrayArray10009[i][6] = class536_sub8_sub1_12_.method10647(i_15_);
			anIntArrayArray10009[i][3] = class536_sub8_sub1_13_.method10647(i_15_);
			anIntArrayArray10009[i][4] = class536_sub8_sub1_14_.method10647(i_15_);
		}
		aClass286_9997.method3850(aClass285Array10008[0]);
		return true;
	}

	public void method4312(int i, int i_16_) {
		switch (i) {
		case 1:
			aClass427_10011.method5132(-1);
			aClass427_10005.method5132(0);
			break;
		case 0:
			aClass427_10011.method5132(i_16_);
			aClass427_10005.method5132(0);
			break;
		case 3:
			aClass427_10011.method5132(0xffffff | i_16_ & ~0xffffff);
			aClass427_10005.method5132(i_16_ & 0xffffff);
			break;
		case 4:
			aClass427_10011.method5132(-1);
			aClass427_10005.method5132(i_16_);
			aClass427_10005.method5135();
			break;
		case 2:
			aClass427_10011.method5132(i_16_);
			aClass427_10005.method5132(0);
			break;
		}
	}

	void method9147(byte i) {
		aClass286_9997.method3865(anIntArray10010[1], 0, anInterface36_3589, 2027325235);
		aClass167_Sub3_3590.method8721(aClass443_3591);
		aClass286_9997.method3864(anIntArray10010[0], aClass443_3591, 101095657);
		aClass286_9997.method3878(anIntArray10010[3], aClass443_3592, -1172593692);
		aClass286_9997.method3890(anIntArray10010[5], aClass427_10011.aFloat4813, aClass427_10011.aFloat4811, aClass427_10011.aFloat4814, aClass427_10011.aFloat4812, -1794981079);
		aClass286_9997.method3890(anIntArray10010[6], aClass427_10005.aFloat4813, aClass427_10005.aFloat4811, aClass427_10005.aFloat4814, aClass427_10005.aFloat4812, -1814817941);
		aClass167_Sub3_3590.method8808(0, anInterface38_3594);
		aClass167_Sub3_3590.method8807(aClass343_3596);
		aClass167_Sub3_3590.method8815(Class377.aClass377_3918, anInt3588, 2);
	}

	boolean method9148() throws Exception_Sub7 {
		aClass286_9997 = aClass167_Sub3_3590.method8714("Sprite");
		Class536_Sub8_Sub1 class536_sub8_sub1 = aClass286_9997.method3866("WVPMatrix", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_17_ = aClass286_9997.method3866("SpriteSampler", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_18_ = aClass286_9997.method3866("MaskSampler", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_19_ = aClass286_9997.method3866("MulColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_20_ = aClass286_9997.method3866("AddColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_21_ = aClass286_9997.method3866("SpriteTexCoordMatrix", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_22_ = aClass286_9997.method3866("MaskTexCoordMatrix", (byte) 0);
		aClass285Array10008[0] = aClass286_9997.method3855("Normal", (byte) 60);
		aClass285Array10008[1] = aClass286_9997.method3855("Masked", (byte) 4);
		aClass285Array10008[2] = aClass286_9997.method3855("AlphaTex", (byte) 89);
		for (int i = 0; i < 3; i++) {
			int i_23_ = aClass286_9997.method3894(aClass285Array10008[i], 327648766);
			anIntArrayArray10009[i][0] = class536_sub8_sub1.method10647(i_23_);
			anIntArrayArray10009[i][1] = class536_sub8_sub1_17_.method10647(i_23_);
			anIntArrayArray10009[i][2] = class536_sub8_sub1_18_.method10647(i_23_);
			anIntArrayArray10009[i][5] = class536_sub8_sub1_19_.method10647(i_23_);
			anIntArrayArray10009[i][6] = class536_sub8_sub1_20_.method10647(i_23_);
			anIntArrayArray10009[i][3] = class536_sub8_sub1_21_.method10647(i_23_);
			anIntArrayArray10009[i][4] = class536_sub8_sub1_22_.method10647(i_23_);
		}
		aClass286_9997.method3850(aClass285Array10008[0]);
		return true;
	}

	public void method4316(int i, int i_24_) {
		switch (i) {
		case 1:
			aClass427_10011.method5132(-1);
			aClass427_10005.method5132(0);
			break;
		case 0:
			aClass427_10011.method5132(i_24_);
			aClass427_10005.method5132(0);
			break;
		case 3:
			aClass427_10011.method5132(0xffffff | i_24_ & ~0xffffff);
			aClass427_10005.method5132(i_24_ & 0xffffff);
			break;
		case 4:
			aClass427_10011.method5132(-1);
			aClass427_10005.method5132(i_24_);
			aClass427_10005.method5135();
			break;
		case 2:
			aClass427_10011.method5132(i_24_);
			aClass427_10005.method5132(0);
			break;
		}
	}

	boolean method9149() throws Exception_Sub7 {
		aClass286_9997 = aClass167_Sub3_3590.method8714("Sprite");
		Class536_Sub8_Sub1 class536_sub8_sub1 = aClass286_9997.method3866("WVPMatrix", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_25_ = aClass286_9997.method3866("SpriteSampler", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_26_ = aClass286_9997.method3866("MaskSampler", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_27_ = aClass286_9997.method3866("MulColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_28_ = aClass286_9997.method3866("AddColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_29_ = aClass286_9997.method3866("SpriteTexCoordMatrix", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_30_ = aClass286_9997.method3866("MaskTexCoordMatrix", (byte) 0);
		aClass285Array10008[0] = aClass286_9997.method3855("Normal", (byte) 6);
		aClass285Array10008[1] = aClass286_9997.method3855("Masked", (byte) -1);
		aClass285Array10008[2] = aClass286_9997.method3855("AlphaTex", (byte) 44);
		for (int i = 0; i < 3; i++) {
			int i_31_ = aClass286_9997.method3894(aClass285Array10008[i], 388446173);
			anIntArrayArray10009[i][0] = class536_sub8_sub1.method10647(i_31_);
			anIntArrayArray10009[i][1] = class536_sub8_sub1_25_.method10647(i_31_);
			anIntArrayArray10009[i][2] = class536_sub8_sub1_26_.method10647(i_31_);
			anIntArrayArray10009[i][5] = class536_sub8_sub1_27_.method10647(i_31_);
			anIntArrayArray10009[i][6] = class536_sub8_sub1_28_.method10647(i_31_);
			anIntArrayArray10009[i][3] = class536_sub8_sub1_29_.method10647(i_31_);
			anIntArrayArray10009[i][4] = class536_sub8_sub1_30_.method10647(i_31_);
		}
		aClass286_9997.method3850(aClass285Array10008[0]);
		return true;
	}

	void method9150() {
		aClass286_9997.method3865(anIntArray10010[1], 0, anInterface36_3589, 1931147305);
		aClass167_Sub3_3590.method8721(aClass443_3591);
		aClass286_9997.method3864(anIntArray10010[0], aClass443_3591, 1269648343);
		aClass286_9997.method3878(anIntArray10010[3], aClass443_3592, -1190215312);
		aClass286_9997.method3890(anIntArray10010[5], aClass427_10011.aFloat4813, aClass427_10011.aFloat4811, aClass427_10011.aFloat4814, aClass427_10011.aFloat4812, -1306593042);
		aClass286_9997.method3890(anIntArray10010[6], aClass427_10005.aFloat4813, aClass427_10005.aFloat4811, aClass427_10005.aFloat4814, aClass427_10005.aFloat4812, -1970616514);
		aClass167_Sub3_3590.method8808(0, anInterface38_3594);
		aClass167_Sub3_3590.method8807(aClass343_3596);
		aClass167_Sub3_3590.method8815(Class377.aClass377_3918, anInt3588, 2);
	}

	void method9151() {
		aClass286_9997.method3865(anIntArray10010[1], 0, anInterface36_3589, 2093973584);
		aClass167_Sub3_3590.method8721(aClass443_3591);
		aClass286_9997.method3864(anIntArray10010[0], aClass443_3591, -921731009);
		aClass286_9997.method3878(anIntArray10010[3], aClass443_3592, 65403376);
		aClass286_9997.method3890(anIntArray10010[5], aClass427_10011.aFloat4813, aClass427_10011.aFloat4811, aClass427_10011.aFloat4814, aClass427_10011.aFloat4812, -1170711148);
		aClass286_9997.method3890(anIntArray10010[6], aClass427_10005.aFloat4813, aClass427_10005.aFloat4811, aClass427_10005.aFloat4814, aClass427_10005.aFloat4812, -1214698971);
		aClass167_Sub3_3590.method8808(0, anInterface38_3594);
		aClass167_Sub3_3590.method8807(aClass343_3596);
		aClass167_Sub3_3590.method8815(Class377.aClass377_3918, anInt3588, 2);
	}

	static final void method9152(Class251 class251, Class234 class234, Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		class251.anInt2585 = 1043826313 * (class668.anIntArray8541[1867269829 * class668.anInt8542]);
		class251.anInt2586 = (-114650895 * class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1]);
		Class668.method8011(class251, 263642117);
		if (class251.anInt2728 * 1049444347 == 0)
			Class499.method6023(class234, class251, false, (byte) -125);
	}
}
