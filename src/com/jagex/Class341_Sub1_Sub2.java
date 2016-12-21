/* Class341_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class341_Sub1_Sub2 extends Class341_Sub1 {
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_11502;
	float aFloat11503;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_11504;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_11505;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_11506;
	public Class443 aClass443_11507 = new Class443();
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_11508;
	public Class443 aClass443_11509 = new Class443();
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_11510;
	boolean aBool11511;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_11512;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_11513;
	public Class436 aClass436_11514 = new Class436();
	Class427 aClass427_11515 = new Class427();
	Class427 aClass427_11516 = new Class427();
	public Class427 aClass427_11517;
	public int anInt11518;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_11519;
	Class357 aClass357_11520;
	public int anInt11521;
	public Class436 aClass436_11522;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_11523;
	public Class427 aClass427_11524;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_11525;
	public Class436 aClass436_11526;
	public int anInt11527;
	public int anInt11528;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_11529;
	public int anInt11530;
	Class427 aClass427_11531 = new Class427();
	boolean aBool11532;
	Class285 aClass285_11533;

	public Class341_Sub1_Sub2(Class167_Sub3 class167_sub3, Class357 class357, boolean bool) throws Exception_Sub7 {
		super(class167_sub3);
		aClass427_11517 = new Class427();
		aClass436_11522 = new Class436();
		aClass427_11524 = new Class427();
		aClass436_11526 = new Class436();
		aFloat11503 = 0.0F;
		new Class443();
		aClass357_11520 = class357;
		aBool11532 = bool;
		if (class167_sub3.method8900() && class167_sub3.method8710())
			aBool11511 = method9290("EnvMappedWater");
		else
			aBool11511 = false;
	}

	boolean method9276() throws Exception_Sub7 {
		if (!aClass357_11520.method4686())
			return false;
		aClass536_Sub8_Sub1_11504 = aClass286_10199.method3866("NormalSampler", (byte) 0);
		aClass536_Sub8_Sub1_11505 = aClass286_10199.method3866("EnvMapSampler", (byte) 0);
		aClass536_Sub8_Sub1_11502 = aClass286_10199.method3866("WVPMatrix", (byte) 0);
		aClass536_Sub8_Sub1_11508 = aClass286_10199.method3866("TexCoordMatrix", (byte) 0);
		aClass536_Sub8_Sub1_11510 = aClass286_10199.method3866("EyePosAndTime", (byte) 0);
		aClass536_Sub8_Sub1_11519 = aClass286_10199.method3866("SunDirectionAndExponent", (byte) 0);
		aClass536_Sub8_Sub1_11529 = aClass286_10199.method3866("SunColourAndWaveExponent", (byte) 0);
		aClass536_Sub8_Sub1_11512 = (aClass286_10199.method3866("WaveIntensityAndBreakWaterDepthAndOffset", (byte) 0));
		aClass536_Sub8_Sub1_11506 = aClass286_10199.method3866("HeightFogPlane", (byte) 0);
		aClass536_Sub8_Sub1_11513 = aClass286_10199.method3866("HeightFogColour", (byte) 0);
		aClass536_Sub8_Sub1_11523 = aClass286_10199.method3866("DistanceFogPlane", (byte) 0);
		aClass536_Sub8_Sub1_11525 = aClass286_10199.method3866("DistanceFogColour", (byte) 0);
		aClass285_11533 = aClass286_10199.method3855((aBool11532 ? "EnvMappedSea" : "EnvMappedWater"), (byte) -32);
		aClass286_10199.method3850(aClass285_11533);
		return true;
	}

	public boolean method10591(int i) {
		return aBool11511;
	}

	public void method10592(int i) {
		method10593(-589310327);
		aClass286_10199.method3850(aClass285_11533);
		aClass286_10199.method3843();
		aClass286_10199.method3896(aClass536_Sub8_Sub1_11504, 0, aClass357_11520.anInterface34_3808, -948976061);
		aClass286_10199.method3896(aClass536_Sub8_Sub1_11505, 1, aClass167_Sub3_3661.method8739(), -948976061);
		aClass286_10199.method3860(aClass536_Sub8_Sub1_11502, aClass443_11507, (byte) 110);
		aClass286_10199.method3874(aClass536_Sub8_Sub1_11508, aClass443_11509, -1200628599);
		int i_0_ = 1 << (anInt11518 * -182597285 & 0x3);
		aClass286_10199.method3856(aClass536_Sub8_Sub1_11510, aClass436_11514.aFloat4850, aClass436_11514.aFloat4852, aClass436_11514.aFloat4853, (float) (aClass167_Sub3_3661.anInt9685 * i_0_ % 40000) / 40000.0F, 538718616);
		aClass286_10199.method3857(aClass536_Sub8_Sub1_11519, aClass427_11515, (byte) -118);
		aClass286_10199.method3857(aClass536_Sub8_Sub1_11529, aClass427_11516, (byte) -85);
		aClass286_10199.method3857(aClass536_Sub8_Sub1_11512, aClass427_11531, (byte) -108);
		aClass286_10199.method3857(aClass536_Sub8_Sub1_11506, aClass427_11517, (byte) -36);
		aClass286_10199.method3892(aClass536_Sub8_Sub1_11513, aClass436_11522, (byte) 16);
		aClass286_10199.method3857(aClass536_Sub8_Sub1_11523, aClass427_11524, (byte) -60);
		aClass286_10199.method3892(aClass536_Sub8_Sub1_11525, aClass436_11526, (byte) 3);
		aClass167_Sub3_3661.method8817(Class377.aClass377_3917, -931554773 * anInt11527, anInt11528 * 1527458387, -389332535 * anInt11521, anInt11530 * -1177068667);
	}

	void method9296(boolean bool) {
		float f = 1.0F + ((1.0F - Math.abs(aClass167_Sub3_3661.aFloatArray9542[1])) * 2.0F);
		float f_1_ = aClass167_Sub3_3661.aFloat9573;
		aClass167_Sub3_3661.aFloat9573 *= f;
		super.method9296(bool);
		aClass167_Sub3_3661.aFloat9573 = f_1_;
	}

	void method9295(Class443 class443) {
		Class443 class443_2_ = new Class443();
		class443_2_.method5344(aFloat11503, aFloat11503, 1.0F, 1.0F);
		class443_2_.method5383(class443, class443_2_);
		super.method9295(class443_2_);
	}

	void method10593(int i) {
		aFloat11503 = 2.4414062E-4F;
		int i_3_ = 256;
		float f = 0.3F;
		float f_4_ = 0.4F;
		float f_5_ = 0.1F;
		int i_6_ = 5;
		aClass443_11509.method5344(aFloat11503, aFloat11503, aFloat11503, aFloat11503);
		aClass427_11515.method5131(-aClass167_Sub3_3661.aFloatArray9542[0], -aClass167_Sub3_3661.aFloatArray9542[1], -aClass167_Sub3_3661.aFloatArray9542[2], 32.0F);
		aClass427_11516.method5131(aClass167_Sub3_3661.aFloat9678, aClass167_Sub3_3661.aFloat9649, aClass167_Sub3_3661.aFloat9701, (float) i_6_);
		aClass427_11531.method5131(f_5_, f_4_, (float) i_3_, f);
	}

	boolean method9283() throws Exception_Sub7 {
		if (!aClass357_11520.method4686())
			return false;
		aClass536_Sub8_Sub1_11504 = aClass286_10199.method3866("NormalSampler", (byte) 0);
		aClass536_Sub8_Sub1_11505 = aClass286_10199.method3866("EnvMapSampler", (byte) 0);
		aClass536_Sub8_Sub1_11502 = aClass286_10199.method3866("WVPMatrix", (byte) 0);
		aClass536_Sub8_Sub1_11508 = aClass286_10199.method3866("TexCoordMatrix", (byte) 0);
		aClass536_Sub8_Sub1_11510 = aClass286_10199.method3866("EyePosAndTime", (byte) 0);
		aClass536_Sub8_Sub1_11519 = aClass286_10199.method3866("SunDirectionAndExponent", (byte) 0);
		aClass536_Sub8_Sub1_11529 = aClass286_10199.method3866("SunColourAndWaveExponent", (byte) 0);
		aClass536_Sub8_Sub1_11512 = (aClass286_10199.method3866("WaveIntensityAndBreakWaterDepthAndOffset", (byte) 0));
		aClass536_Sub8_Sub1_11506 = aClass286_10199.method3866("HeightFogPlane", (byte) 0);
		aClass536_Sub8_Sub1_11513 = aClass286_10199.method3866("HeightFogColour", (byte) 0);
		aClass536_Sub8_Sub1_11523 = aClass286_10199.method3866("DistanceFogPlane", (byte) 0);
		aClass536_Sub8_Sub1_11525 = aClass286_10199.method3866("DistanceFogColour", (byte) 0);
		aClass285_11533 = aClass286_10199.method3855((aBool11532 ? "EnvMappedSea" : "EnvMappedWater"), (byte) 87);
		aClass286_10199.method3850(aClass285_11533);
		return true;
	}

	public void method10594() {
		method10593(1965505289);
		aClass286_10199.method3850(aClass285_11533);
		aClass286_10199.method3843();
		aClass286_10199.method3896(aClass536_Sub8_Sub1_11504, 0, aClass357_11520.anInterface34_3808, -948976061);
		aClass286_10199.method3896(aClass536_Sub8_Sub1_11505, 1, aClass167_Sub3_3661.method8739(), -948976061);
		aClass286_10199.method3860(aClass536_Sub8_Sub1_11502, aClass443_11507, (byte) 17);
		aClass286_10199.method3874(aClass536_Sub8_Sub1_11508, aClass443_11509, -126985271);
		int i = 1 << (anInt11518 * -182597285 & 0x3);
		aClass286_10199.method3856(aClass536_Sub8_Sub1_11510, aClass436_11514.aFloat4850, aClass436_11514.aFloat4852, aClass436_11514.aFloat4853, (float) (aClass167_Sub3_3661.anInt9685 * i % 40000) / 40000.0F, 538718616);
		aClass286_10199.method3857(aClass536_Sub8_Sub1_11519, aClass427_11515, (byte) -128);
		aClass286_10199.method3857(aClass536_Sub8_Sub1_11529, aClass427_11516, (byte) -121);
		aClass286_10199.method3857(aClass536_Sub8_Sub1_11512, aClass427_11531, (byte) -118);
		aClass286_10199.method3857(aClass536_Sub8_Sub1_11506, aClass427_11517, (byte) -91);
		aClass286_10199.method3892(aClass536_Sub8_Sub1_11513, aClass436_11522, (byte) 50);
		aClass286_10199.method3857(aClass536_Sub8_Sub1_11523, aClass427_11524, (byte) -60);
		aClass286_10199.method3892(aClass536_Sub8_Sub1_11525, aClass436_11526, (byte) 41);
		aClass167_Sub3_3661.method8817(Class377.aClass377_3917, -931554773 * anInt11527, anInt11528 * 1527458387, -389332535 * anInt11521, anInt11530 * -1177068667);
	}

	void method9286(Class443 class443) {
		Class443 class443_7_ = new Class443();
		class443_7_.method5344(aFloat11503, aFloat11503, 1.0F, 1.0F);
		class443_7_.method5383(class443, class443_7_);
		super.method9295(class443_7_);
	}

	void method9285(Class443 class443) {
		Class443 class443_8_ = new Class443();
		class443_8_.method5344(aFloat11503, aFloat11503, 1.0F, 1.0F);
		class443_8_.method5383(class443, class443_8_);
		super.method9295(class443_8_);
	}

	public boolean method10595() {
		return aBool11511;
	}

	void method10596() {
		aFloat11503 = 2.4414062E-4F;
		int i = 256;
		float f = 0.3F;
		float f_9_ = 0.4F;
		float f_10_ = 0.1F;
		int i_11_ = 5;
		aClass443_11509.method5344(aFloat11503, aFloat11503, aFloat11503, aFloat11503);
		aClass427_11515.method5131(-aClass167_Sub3_3661.aFloatArray9542[0], -aClass167_Sub3_3661.aFloatArray9542[1], -aClass167_Sub3_3661.aFloatArray9542[2], 32.0F);
		aClass427_11516.method5131(aClass167_Sub3_3661.aFloat9678, aClass167_Sub3_3661.aFloat9649, aClass167_Sub3_3661.aFloat9701, (float) i_11_);
		aClass427_11531.method5131(f_10_, f_9_, (float) i, f);
	}

	void method9291(boolean bool) {
		float f = 1.0F + ((1.0F - Math.abs(aClass167_Sub3_3661.aFloatArray9542[1])) * 2.0F);
		float f_12_ = aClass167_Sub3_3661.aFloat9573;
		aClass167_Sub3_3661.aFloat9573 *= f;
		super.method9296(bool);
		aClass167_Sub3_3661.aFloat9573 = f_12_;
	}

	void method10597() {
		aFloat11503 = 2.4414062E-4F;
		int i = 256;
		float f = 0.3F;
		float f_13_ = 0.4F;
		float f_14_ = 0.1F;
		int i_15_ = 5;
		aClass443_11509.method5344(aFloat11503, aFloat11503, aFloat11503, aFloat11503);
		aClass427_11515.method5131(-aClass167_Sub3_3661.aFloatArray9542[0], -aClass167_Sub3_3661.aFloatArray9542[1], -aClass167_Sub3_3661.aFloatArray9542[2], 32.0F);
		aClass427_11516.method5131(aClass167_Sub3_3661.aFloat9678, aClass167_Sub3_3661.aFloat9649, aClass167_Sub3_3661.aFloat9701, (float) i_15_);
		aClass427_11531.method5131(f_14_, f_13_, (float) i, f);
	}

	void method10598() {
		aFloat11503 = 2.4414062E-4F;
		int i = 256;
		float f = 0.3F;
		float f_16_ = 0.4F;
		float f_17_ = 0.1F;
		int i_18_ = 5;
		aClass443_11509.method5344(aFloat11503, aFloat11503, aFloat11503, aFloat11503);
		aClass427_11515.method5131(-aClass167_Sub3_3661.aFloatArray9542[0], -aClass167_Sub3_3661.aFloatArray9542[1], -aClass167_Sub3_3661.aFloatArray9542[2], 32.0F);
		aClass427_11516.method5131(aClass167_Sub3_3661.aFloat9678, aClass167_Sub3_3661.aFloat9649, aClass167_Sub3_3661.aFloat9701, (float) i_18_);
		aClass427_11531.method5131(f_17_, f_16_, (float) i, f);
	}

	static final void method10599(Class668 class668, int i) {
		if (-523673047 * client.anInt11118 >= 5 && -523673047 * client.anInt11118 <= 9)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.anInt11118 * -523673047;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}
}
