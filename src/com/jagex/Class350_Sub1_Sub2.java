/* Class350_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class350_Sub1_Sub2 extends Class350_Sub1 {
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_11520;
	Class341 aClass341_11521;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_11522;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_11523;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_11524;
	public Class441 aClass441_11525;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_11526;
	public Class427 aClass427_11527;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_11528;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_11529;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_11530;
	public int anInt11531;
	Class441 aClass441_11532;
	public Class427 aClass427_11533 = new Class427();
	Class441 aClass441_11534;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_11535;
	Class441 aClass441_11536;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_11537;
	boolean aBool11538;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_11539;
	public Class442 aClass442_11540;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_11541;
	public Class441 aClass441_11542;
	public int anInt11543;
	public Class442 aClass442_11544;
	public int anInt11545;
	public int anInt11546;
	public Class442 aClass442_11547;
	public int anInt11548;
	float aFloat11549;
	boolean aBool11550;
	Class265 aClass265_11551;

	public Class350_Sub1_Sub2(Class180_Sub2 class180_sub2, Class341 class341, boolean bool) throws Exception_Sub5 {
		super(class180_sub2);
		aClass427_11527 = new Class427();
		aClass442_11547 = new Class442();
		aClass441_11532 = new Class441();
		aClass441_11534 = new Class441();
		aClass441_11536 = new Class441();
		aClass441_11542 = new Class441();
		aClass442_11540 = new Class442();
		aClass441_11525 = new Class441();
		aClass442_11544 = new Class442();
		aFloat11549 = 0.0F;
		new Class427();
		aClass341_11521 = class341;
		aBool11550 = bool;
		if (class180_sub2.method14888() && class180_sub2.method14889())
			aBool11538 = method15828("EnvMappedWater");
		else
			aBool11538 = false;
	}

	boolean method15809() throws Exception_Sub5 {
		if (!aClass341_11521.method6081())
			return false;
		aClass527_Sub18_Sub1_11522 = aClass261_10188.method4881("NormalSampler", -1803846915);
		aClass527_Sub18_Sub1_11523 = aClass261_10188.method4881("EnvMapSampler", -1803846915);
		aClass527_Sub18_Sub1_11524 = aClass261_10188.method4881("WVPMatrix", -1803846915);
		aClass527_Sub18_Sub1_11526 = aClass261_10188.method4881("TexCoordMatrix", -1803846915);
		aClass527_Sub18_Sub1_11529 = aClass261_10188.method4881("EyePosAndTime", -1803846915);
		aClass527_Sub18_Sub1_11528 = aClass261_10188.method4881("SunDirectionAndExponent", -1803846915);
		aClass527_Sub18_Sub1_11530 = aClass261_10188.method4881("SunColourAndWaveExponent", -1803846915);
		aClass527_Sub18_Sub1_11535 = (aClass261_10188.method4881("WaveIntensityAndBreakWaterDepthAndOffset", -1803846915));
		aClass527_Sub18_Sub1_11537 = aClass261_10188.method4881("HeightFogPlane", -1803846915);
		aClass527_Sub18_Sub1_11539 = aClass261_10188.method4881("HeightFogColour", -1803846915);
		aClass527_Sub18_Sub1_11541 = aClass261_10188.method4881("DistanceFogPlane", -1803846915);
		aClass527_Sub18_Sub1_11520 = aClass261_10188.method4881("DistanceFogColour", -1803846915);
		aClass265_11551 = aClass261_10188.method4805((aBool11550 ? "EnvMappedSea" : "EnvMappedWater"), -1733553076);
		aClass261_10188.method4810(aClass265_11551);
		return true;
	}

	public boolean method18052(byte i) {
		return aBool11538;
	}

	void method15807(Class427 class427) {
		Class427 class427_0_ = new Class427();
		class427_0_.method6815(aFloat11549, aFloat11549, 1.0F, 1.0F);
		class427_0_.method6739(class427, class427_0_);
		super.method15807(class427_0_);
	}

	void method15812(boolean bool) {
		float f = 1.0F + ((1.0F - Math.abs(aClass180_Sub2_3754.aFloatArray9507[1])) * 2.0F);
		float f_1_ = aClass180_Sub2_3754.aFloat9516;
		aClass180_Sub2_3754.aFloat9516 *= f;
		super.method15812(bool);
		aClass180_Sub2_3754.aFloat9516 = f_1_;
	}

	void method18053(int i) {
		aFloat11549 = 2.4414062E-4F;
		int i_2_ = 256;
		float f = 0.3F;
		float f_3_ = 0.4F;
		float f_4_ = 0.1F;
		int i_5_ = 5;
		aClass427_11527.method6815(aFloat11549, aFloat11549, aFloat11549, aFloat11549);
		aClass441_11532.method7118(-aClass180_Sub2_3754.aFloatArray9507[0], -aClass180_Sub2_3754.aFloatArray9507[1], -aClass180_Sub2_3754.aFloatArray9507[2], 32.0F);
		aClass441_11534.method7118(aClass180_Sub2_3754.aFloat9583, aClass180_Sub2_3754.aFloat9513, aClass180_Sub2_3754.aFloat9448, (float) i_5_);
		aClass441_11536.method7118(f_4_, f_3_, (float) i_2_, f);
	}

	void method15832(boolean bool) {
		float f = 1.0F + ((1.0F - Math.abs(aClass180_Sub2_3754.aFloatArray9507[1])) * 2.0F);
		float f_6_ = aClass180_Sub2_3754.aFloat9516;
		aClass180_Sub2_3754.aFloat9516 *= f;
		super.method15812(bool);
		aClass180_Sub2_3754.aFloat9516 = f_6_;
	}

	boolean method15820() throws Exception_Sub5 {
		if (!aClass341_11521.method6081())
			return false;
		aClass527_Sub18_Sub1_11522 = aClass261_10188.method4881("NormalSampler", -1803846915);
		aClass527_Sub18_Sub1_11523 = aClass261_10188.method4881("EnvMapSampler", -1803846915);
		aClass527_Sub18_Sub1_11524 = aClass261_10188.method4881("WVPMatrix", -1803846915);
		aClass527_Sub18_Sub1_11526 = aClass261_10188.method4881("TexCoordMatrix", -1803846915);
		aClass527_Sub18_Sub1_11529 = aClass261_10188.method4881("EyePosAndTime", -1803846915);
		aClass527_Sub18_Sub1_11528 = aClass261_10188.method4881("SunDirectionAndExponent", -1803846915);
		aClass527_Sub18_Sub1_11530 = aClass261_10188.method4881("SunColourAndWaveExponent", -1803846915);
		aClass527_Sub18_Sub1_11535 = (aClass261_10188.method4881("WaveIntensityAndBreakWaterDepthAndOffset", -1803846915));
		aClass527_Sub18_Sub1_11537 = aClass261_10188.method4881("HeightFogPlane", -1803846915);
		aClass527_Sub18_Sub1_11539 = aClass261_10188.method4881("HeightFogColour", -1803846915);
		aClass527_Sub18_Sub1_11541 = aClass261_10188.method4881("DistanceFogPlane", -1803846915);
		aClass527_Sub18_Sub1_11520 = aClass261_10188.method4881("DistanceFogColour", -1803846915);
		aClass265_11551 = aClass261_10188.method4805((aBool11550 ? "EnvMappedSea" : "EnvMappedWater"), -1733553076);
		aClass261_10188.method4810(aClass265_11551);
		return true;
	}

	void method18054() {
		aFloat11549 = 2.4414062E-4F;
		int i = 256;
		float f = 0.3F;
		float f_7_ = 0.4F;
		float f_8_ = 0.1F;
		int i_9_ = 5;
		aClass427_11527.method6815(aFloat11549, aFloat11549, aFloat11549, aFloat11549);
		aClass441_11532.method7118(-aClass180_Sub2_3754.aFloatArray9507[0], -aClass180_Sub2_3754.aFloatArray9507[1], -aClass180_Sub2_3754.aFloatArray9507[2], 32.0F);
		aClass441_11534.method7118(aClass180_Sub2_3754.aFloat9583, aClass180_Sub2_3754.aFloat9513, aClass180_Sub2_3754.aFloat9448, (float) i_9_);
		aClass441_11536.method7118(f_8_, f_7_, (float) i, f);
	}

	void method15825(Class427 class427) {
		Class427 class427_10_ = new Class427();
		class427_10_.method6815(aFloat11549, aFloat11549, 1.0F, 1.0F);
		class427_10_.method6739(class427, class427_10_);
		super.method15807(class427_10_);
	}

	void method15826(Class427 class427) {
		Class427 class427_11_ = new Class427();
		class427_11_.method6815(aFloat11549, aFloat11549, 1.0F, 1.0F);
		class427_11_.method6739(class427, class427_11_);
		super.method15807(class427_11_);
	}

	void method15827(Class427 class427) {
		Class427 class427_12_ = new Class427();
		class427_12_.method6815(aFloat11549, aFloat11549, 1.0F, 1.0F);
		class427_12_.method6739(class427, class427_12_);
		super.method15807(class427_12_);
	}

	void method15831(boolean bool) {
		float f = 1.0F + ((1.0F - Math.abs(aClass180_Sub2_3754.aFloatArray9507[1])) * 2.0F);
		float f_13_ = aClass180_Sub2_3754.aFloat9516;
		aClass180_Sub2_3754.aFloat9516 *= f;
		super.method15812(bool);
		aClass180_Sub2_3754.aFloat9516 = f_13_;
	}

	boolean method15821() throws Exception_Sub5 {
		if (!aClass341_11521.method6081())
			return false;
		aClass527_Sub18_Sub1_11522 = aClass261_10188.method4881("NormalSampler", -1803846915);
		aClass527_Sub18_Sub1_11523 = aClass261_10188.method4881("EnvMapSampler", -1803846915);
		aClass527_Sub18_Sub1_11524 = aClass261_10188.method4881("WVPMatrix", -1803846915);
		aClass527_Sub18_Sub1_11526 = aClass261_10188.method4881("TexCoordMatrix", -1803846915);
		aClass527_Sub18_Sub1_11529 = aClass261_10188.method4881("EyePosAndTime", -1803846915);
		aClass527_Sub18_Sub1_11528 = aClass261_10188.method4881("SunDirectionAndExponent", -1803846915);
		aClass527_Sub18_Sub1_11530 = aClass261_10188.method4881("SunColourAndWaveExponent", -1803846915);
		aClass527_Sub18_Sub1_11535 = (aClass261_10188.method4881("WaveIntensityAndBreakWaterDepthAndOffset", -1803846915));
		aClass527_Sub18_Sub1_11537 = aClass261_10188.method4881("HeightFogPlane", -1803846915);
		aClass527_Sub18_Sub1_11539 = aClass261_10188.method4881("HeightFogColour", -1803846915);
		aClass527_Sub18_Sub1_11541 = aClass261_10188.method4881("DistanceFogPlane", -1803846915);
		aClass527_Sub18_Sub1_11520 = aClass261_10188.method4881("DistanceFogColour", -1803846915);
		aClass265_11551 = aClass261_10188.method4805((aBool11550 ? "EnvMappedSea" : "EnvMappedWater"), -1733553076);
		aClass261_10188.method4810(aClass265_11551);
		return true;
	}

	void method15817(boolean bool) {
		float f = 1.0F + ((1.0F - Math.abs(aClass180_Sub2_3754.aFloatArray9507[1])) * 2.0F);
		float f_14_ = aClass180_Sub2_3754.aFloat9516;
		aClass180_Sub2_3754.aFloat9516 *= f;
		super.method15812(bool);
		aClass180_Sub2_3754.aFloat9516 = f_14_;
	}

	public void method18055(int i) {
		method18053(-852313771);
		aClass261_10188.method4810(aClass265_11551);
		aClass261_10188.method4875();
		aClass261_10188.method4807(aClass527_Sub18_Sub1_11522, 0, aClass341_11521.anInterface35_3684, -1393028836);
		aClass261_10188.method4807(aClass527_Sub18_Sub1_11523, 1, aClass180_Sub2_3754.method14925(), -1485940994);
		aClass261_10188.method4824(aClass527_Sub18_Sub1_11524, aClass427_11533, -1974065914);
		aClass261_10188.method4821(aClass527_Sub18_Sub1_11526, aClass427_11527, 1908711447);
		int i_15_ = 1 << (anInt11543 * 704802247 & 0x3);
		aClass261_10188.method4817(aClass527_Sub18_Sub1_11529, aClass442_11547.aFloat4918, aClass442_11547.aFloat4915, aClass442_11547.aFloat4919, (float) (i_15_ * aClass180_Sub2_3754.anInt9574 % 40000) / 40000.0F, 1019383021);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11528, aClass441_11532, -1231116331);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11530, aClass441_11534, -1090480059);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11535, aClass441_11536, -1865087753);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11537, aClass441_11542, -232105934);
		aClass261_10188.method4911(aClass527_Sub18_Sub1_11539, aClass442_11540, (byte) 47);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11541, aClass441_11525, -1682775925);
		aClass261_10188.method4911(aClass527_Sub18_Sub1_11520, aClass442_11544, (byte) -37);
		aClass180_Sub2_3754.method15010(Class364.aClass364_3861, -724857183 * anInt11545, -1429117769 * anInt11546, anInt11531 * -432161757, 1817881831 * anInt11548);
	}

	public boolean method18056() {
		return aBool11538;
	}

	public boolean method18057() {
		return aBool11538;
	}

	public boolean method18058() {
		return aBool11538;
	}

	public boolean method18059() {
		return aBool11538;
	}

	public void method18060() {
		method18053(-852313771);
		aClass261_10188.method4810(aClass265_11551);
		aClass261_10188.method4875();
		aClass261_10188.method4807(aClass527_Sub18_Sub1_11522, 0, aClass341_11521.anInterface35_3684, -1797902889);
		aClass261_10188.method4807(aClass527_Sub18_Sub1_11523, 1, aClass180_Sub2_3754.method14925(), -1603922126);
		aClass261_10188.method4824(aClass527_Sub18_Sub1_11524, aClass427_11533, -1974065914);
		aClass261_10188.method4821(aClass527_Sub18_Sub1_11526, aClass427_11527, 1908711447);
		int i = 1 << (anInt11543 * 704802247 & 0x3);
		aClass261_10188.method4817(aClass527_Sub18_Sub1_11529, aClass442_11547.aFloat4918, aClass442_11547.aFloat4915, aClass442_11547.aFloat4919, (float) (i * aClass180_Sub2_3754.anInt9574 % 40000) / 40000.0F, -759422098);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11528, aClass441_11532, 202644188);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11530, aClass441_11534, -2048313772);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11535, aClass441_11536, -1288260902);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11537, aClass441_11542, -1316846896);
		aClass261_10188.method4911(aClass527_Sub18_Sub1_11539, aClass442_11540, (byte) 35);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11541, aClass441_11525, 13111192);
		aClass261_10188.method4911(aClass527_Sub18_Sub1_11520, aClass442_11544, (byte) 28);
		aClass180_Sub2_3754.method15010(Class364.aClass364_3861, -724857183 * anInt11545, -1429117769 * anInt11546, anInt11531 * -432161757, 1817881831 * anInt11548);
	}

	void method15816(boolean bool) {
		float f = 1.0F + ((1.0F - Math.abs(aClass180_Sub2_3754.aFloatArray9507[1])) * 2.0F);
		float f_16_ = aClass180_Sub2_3754.aFloat9516;
		aClass180_Sub2_3754.aFloat9516 *= f;
		super.method15812(bool);
		aClass180_Sub2_3754.aFloat9516 = f_16_;
	}

	public void method18061() {
		method18053(-852313771);
		aClass261_10188.method4810(aClass265_11551);
		aClass261_10188.method4875();
		aClass261_10188.method4807(aClass527_Sub18_Sub1_11522, 0, aClass341_11521.anInterface35_3684, -1442018541);
		aClass261_10188.method4807(aClass527_Sub18_Sub1_11523, 1, aClass180_Sub2_3754.method14925(), -2116591312);
		aClass261_10188.method4824(aClass527_Sub18_Sub1_11524, aClass427_11533, -1974065914);
		aClass261_10188.method4821(aClass527_Sub18_Sub1_11526, aClass427_11527, 1908711447);
		int i = 1 << (anInt11543 * 704802247 & 0x3);
		aClass261_10188.method4817(aClass527_Sub18_Sub1_11529, aClass442_11547.aFloat4918, aClass442_11547.aFloat4915, aClass442_11547.aFloat4919, (float) (i * aClass180_Sub2_3754.anInt9574 % 40000) / 40000.0F, 804187730);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11528, aClass441_11532, -1098140850);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11530, aClass441_11534, -1171381265);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11535, aClass441_11536, -762609456);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11537, aClass441_11542, -66928884);
		aClass261_10188.method4911(aClass527_Sub18_Sub1_11539, aClass442_11540, (byte) 20);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11541, aClass441_11525, -994804598);
		aClass261_10188.method4911(aClass527_Sub18_Sub1_11520, aClass442_11544, (byte) 37);
		aClass180_Sub2_3754.method15010(Class364.aClass364_3861, -724857183 * anInt11545, -1429117769 * anInt11546, anInt11531 * -432161757, 1817881831 * anInt11548);
	}

	public void method18062() {
		method18053(-852313771);
		aClass261_10188.method4810(aClass265_11551);
		aClass261_10188.method4875();
		aClass261_10188.method4807(aClass527_Sub18_Sub1_11522, 0, aClass341_11521.anInterface35_3684, -1532865087);
		aClass261_10188.method4807(aClass527_Sub18_Sub1_11523, 1, aClass180_Sub2_3754.method14925(), -1715657050);
		aClass261_10188.method4824(aClass527_Sub18_Sub1_11524, aClass427_11533, -1974065914);
		aClass261_10188.method4821(aClass527_Sub18_Sub1_11526, aClass427_11527, 1908711447);
		int i = 1 << (anInt11543 * 704802247 & 0x3);
		aClass261_10188.method4817(aClass527_Sub18_Sub1_11529, aClass442_11547.aFloat4918, aClass442_11547.aFloat4915, aClass442_11547.aFloat4919, (float) (i * aClass180_Sub2_3754.anInt9574 % 40000) / 40000.0F, 1589959302);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11528, aClass441_11532, -431533861);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11530, aClass441_11534, 316643151);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11535, aClass441_11536, -575227616);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11537, aClass441_11542, -387029028);
		aClass261_10188.method4911(aClass527_Sub18_Sub1_11539, aClass442_11540, (byte) -16);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11541, aClass441_11525, -1637335669);
		aClass261_10188.method4911(aClass527_Sub18_Sub1_11520, aClass442_11544, (byte) -1);
		aClass180_Sub2_3754.method15010(Class364.aClass364_3861, -724857183 * anInt11545, -1429117769 * anInt11546, anInt11531 * -432161757, 1817881831 * anInt11548);
	}
}
