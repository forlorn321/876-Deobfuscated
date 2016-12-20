/* Class326_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class326_Sub2 extends Class326 {
	static final int anInt10075 = 12;
	static final int anInt10076 = 0;
	static final int anInt10077 = 1;
	static final int anInt10078 = 2;
	static final int anInt10079 = 12;
	static final int anInt10080 = 11;
	static final int anInt10081 = 5;
	static final int anInt10082 = 6;
	static final int anInt10083 = 7;
	static final int anInt10084 = 8;
	static final int anInt10085 = 9;
	static final int anInt10086 = 10;
	Class265[] aClass265Array10087;
	static final int anInt10088 = 17;
	static final int anInt10089 = 13;
	static final int anInt10090 = 19;
	static final int anInt10091 = 15;
	static final int anInt10092 = 16;
	Class261 aClass261_10093;
	static final int anInt10094 = 0;
	static final int anInt10095 = 1;
	static final int anInt10096 = 2;
	static final int anInt10097 = 7;
	static final int anInt10098 = 14;
	static final int anInt10099 = 3;
	static final int anInt10100 = 18;
	static final int anInt10101 = 4;
	Class427 aClass427_10102 = new Class427();
	static final int anInt10103 = 17;
	int[][] anIntArrayArray10104;
	int[] anIntArray10105;

	public void method5769(int i) {
		aClass261_10093.method4810(aClass265Array10087[7 + i]);
		anIntArray10105 = anIntArrayArray10104[aClass261_10093.method4925((byte) -48)];
		aClass261_10093.method4875();
		aClass261_10093.method4816(anIntArray10105[6], aClass442_3592.aFloat4918, aClass442_3592.aFloat4915, aClass442_3592.aFloat4919, (byte) -107);
		aClass261_10093.method4825(anIntArray10105[16], aFloat3585, aFloat3586, 0.0F, 0.0F, (short) 255);
		method15772(i, -1657356873);
	}

	boolean method15771(int i) throws Exception_Sub5 {
		aClass261_10093 = aClass180_Sub2_3578.method14894("Model");
		Class527_Sub18_Sub1 class527_sub18_sub1 = aClass261_10093.method4881("DiffuseSampler", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_0_ = aClass261_10093.method4881("EnvironmentSampler", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_1_ = aClass261_10093.method4881("PointLightsPosAndRadiusInv", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_2_ = aClass261_10093.method4881("PointLightsDiffuseColour", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_3_ = aClass261_10093.method4881("WVPMatrix", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_4_ = aClass261_10093.method4881("TexCoordMatrix", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_5_ = aClass261_10093.method4881("HeightFogPlane", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_6_ = aClass261_10093.method4881("HeightFogColour", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_7_ = aClass261_10093.method4881("DistanceFogPlane", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_8_ = aClass261_10093.method4881("DistanceFogColour", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_9_ = aClass261_10093.method4881("SunDir", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_10_ = aClass261_10093.method4881("SunColour", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_11_ = aClass261_10093.method4881("AntiSunColour", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_12_ = aClass261_10093.method4881("AmbientColour", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_13_ = aClass261_10093.method4881("EyePos", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_14_ = aClass261_10093.method4881("SpecularExponent", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_15_ = aClass261_10093.method4881("WorldMatrix", -1803846915);
		aClass265Array10087[0] = aClass261_10093.method4805("Unlit", -1733553076);
		aClass265Array10087[1] = aClass261_10093.method4805("Unlit_IgnoreAlpha", -1733553076);
		aClass265Array10087[17] = aClass261_10093.method4805("UnderwaterGround", -1733553076);
		aClass265Array10087[18] = aClass261_10093.method4805("UnderwaterGroundSpecular", -1733553076);
		for (int i_16_ = 0; i_16_ <= 4; i_16_++) {
			aClass265Array10087[2 + i_16_] = aClass261_10093.method4805(new StringBuilder().append("Standard_").append(i_16_).append("PointLights").toString(), -1733553076);
			aClass265Array10087[7 + i_16_] = aClass261_10093.method4805(new StringBuilder().append("Specular_").append(i_16_).append("PointLights").toString(), -1733553076);
			aClass265Array10087[12 + i_16_] = aClass261_10093.method4805(new StringBuilder().append("EnvironmentalMapping_").append(i_16_).append("PointLights").toString(), -1733553076);
		}
		for (int i_17_ = 0; i_17_ < 19; i_17_++) {
			int i_18_ = aClass261_10093.method4808(aClass265Array10087[i_17_], (byte) 13);
			anIntArrayArray10104[i_17_][2] = class527_sub18_sub1.method18146(i_18_);
			anIntArrayArray10104[i_17_][3] = class527_sub18_sub1_0_.method18146(i_18_);
			anIntArrayArray10104[i_17_][1] = class527_sub18_sub1_1_.method18146(i_18_);
			anIntArrayArray10104[i_17_][0] = class527_sub18_sub1_2_.method18146(i_18_);
			anIntArrayArray10104[i_17_][4] = class527_sub18_sub1_3_.method18146(i_18_);
			anIntArrayArray10104[i_17_][5] = class527_sub18_sub1_4_.method18146(i_18_);
			anIntArrayArray10104[i_17_][7] = class527_sub18_sub1_5_.method18146(i_18_);
			anIntArrayArray10104[i_17_][8] = class527_sub18_sub1_6_.method18146(i_18_);
			anIntArrayArray10104[i_17_][9] = class527_sub18_sub1_7_.method18146(i_18_);
			anIntArrayArray10104[i_17_][10] = class527_sub18_sub1_8_.method18146(i_18_);
			anIntArrayArray10104[i_17_][11] = class527_sub18_sub1_9_.method18146(i_18_);
			anIntArrayArray10104[i_17_][12] = class527_sub18_sub1_10_.method18146(i_18_);
			anIntArrayArray10104[i_17_][13] = class527_sub18_sub1_11_.method18146(i_18_);
			anIntArrayArray10104[i_17_][14] = class527_sub18_sub1_12_.method18146(i_18_);
			anIntArrayArray10104[i_17_][6] = class527_sub18_sub1_13_.method18146(i_18_);
			anIntArrayArray10104[i_17_][15] = class527_sub18_sub1_15_.method18146(i_18_);
			anIntArrayArray10104[i_17_][16] = class527_sub18_sub1_14_.method18146(i_18_);
		}
		aClass261_10093.method4810(aClass265Array10087[2]);
		return true;
	}

	public void method5765(Class427 class427) {
		aClass427_10102.method6750(class427);
		aClass427_10102.method6751(aClass180_Sub2_3578.aClass427_9474);
	}

	public void method5757(boolean bool) {
		if (bool)
			aClass261_10093.method4810(aClass265Array10087[1]);
		else
			aClass261_10093.method4810(aClass265Array10087[0]);
		anIntArray10105 = anIntArrayArray10104[aClass261_10093.method4925((byte) -36)];
		aClass261_10093.method4875();
		aClass261_10093.method4831(anIntArray10105[2], 0, anInterface38_3595, (byte) 2);
		aClass261_10093.method4830(anIntArray10105[4], aClass427_10102, -2124089969);
		aClass261_10093.method4829(anIntArray10105[5], aClass427_3583, -69808742);
		aClass261_10093.method4825(anIntArray10105[7], aClass441_3587.aFloat4913, aClass441_3587.aFloat4911, aClass441_3587.aFloat4912, aClass441_3587.aFloat4910, (short) 255);
		aClass261_10093.method4816(anIntArray10105[8], aClass442_3588.aFloat4918, aClass442_3588.aFloat4915, aClass442_3588.aFloat4919, (byte) -126);
		aClass261_10093.method4825(anIntArray10105[9], aClass441_3589.aFloat4913, aClass441_3589.aFloat4911, aClass441_3589.aFloat4912, aClass441_3589.aFloat4910, (short) 255);
		aClass261_10093.method4816(anIntArray10105[10], aClass442_3581.aFloat4918, aClass442_3581.aFloat4915, aClass442_3581.aFloat4919, (byte) -20);
		aClass180_Sub2_3578.method15010(Class364.aClass364_3861, anInt3598, anInt3597, anInt3584, anInt3599);
	}

	public void method5766(int i) {
		aClass261_10093.method4810(aClass265Array10087[i + 2]);
		anIntArray10105 = anIntArrayArray10104[aClass261_10093.method4925((byte) -106)];
		aClass261_10093.method4875();
		method15772(i, 623860674);
	}

	public void method5763(boolean bool) {
		if (bool)
			aClass261_10093.method4810(aClass265Array10087[1]);
		else
			aClass261_10093.method4810(aClass265Array10087[0]);
		anIntArray10105 = anIntArrayArray10104[aClass261_10093.method4925((byte) -78)];
		aClass261_10093.method4875();
		aClass261_10093.method4831(anIntArray10105[2], 0, anInterface38_3595, (byte) 2);
		aClass261_10093.method4830(anIntArray10105[4], aClass427_10102, -610978002);
		aClass261_10093.method4829(anIntArray10105[5], aClass427_3583, -1964686551);
		aClass261_10093.method4825(anIntArray10105[7], aClass441_3587.aFloat4913, aClass441_3587.aFloat4911, aClass441_3587.aFloat4912, aClass441_3587.aFloat4910, (short) 255);
		aClass261_10093.method4816(anIntArray10105[8], aClass442_3588.aFloat4918, aClass442_3588.aFloat4915, aClass442_3588.aFloat4919, (byte) -35);
		aClass261_10093.method4825(anIntArray10105[9], aClass441_3589.aFloat4913, aClass441_3589.aFloat4911, aClass441_3589.aFloat4912, aClass441_3589.aFloat4910, (short) 255);
		aClass261_10093.method4816(anIntArray10105[10], aClass442_3581.aFloat4918, aClass442_3581.aFloat4915, aClass442_3581.aFloat4919, (byte) -8);
		aClass180_Sub2_3578.method15010(Class364.aClass364_3861, anInt3598, anInt3597, anInt3584, anInt3599);
	}

	void method15772(int i, int i_19_) {
		aClass261_10093.method4831(anIntArray10105[2], 0, anInterface38_3595, (byte) 2);
		aClass261_10093.method4830(anIntArray10105[4], aClass427_10102, 391872678);
		aClass261_10093.method4829(anIntArray10105[5], aClass427_3583, -1679219819);
		aClass261_10093.method4825(anIntArray10105[7], aClass441_3587.aFloat4913, aClass441_3587.aFloat4911, aClass441_3587.aFloat4912, aClass441_3587.aFloat4910, (short) 255);
		aClass261_10093.method4816(anIntArray10105[8], aClass442_3588.aFloat4918, aClass442_3588.aFloat4915, aClass442_3588.aFloat4919, (byte) -128);
		aClass261_10093.method4825(anIntArray10105[9], aClass441_3589.aFloat4913, aClass441_3589.aFloat4911, aClass441_3589.aFloat4912, aClass441_3589.aFloat4910, (short) 255);
		aClass261_10093.method4816(anIntArray10105[10], aClass442_3581.aFloat4918, aClass442_3581.aFloat4915, aClass442_3581.aFloat4919, (byte) -73);
		aClass261_10093.method4826(anIntArray10105[11], aClass442_3591, -182986135);
		aClass261_10093.method4826(anIntArray10105[12], aClass442_3590, -182986135);
		aClass261_10093.method4826(anIntArray10105[13], aClass442_3593, -182986135);
		aClass261_10093.method4826(anIntArray10105[14], aClass442_3594, -182986135);
		if (i > 0) {
			aClass261_10093.method4834(anIntArray10105[1], aFloatArray3580, i * 4, 1121992718);
			aClass261_10093.method4834(anIntArray10105[0], aFloatArray3579, 4 * i, 956467462);
		}
		aClass180_Sub2_3578.method15010(Class364.aClass364_3861, anInt3598, anInt3597, anInt3584, anInt3599);
	}

	public void method5758(int i) {
		aClass261_10093.method4810(aClass265Array10087[i + 2]);
		anIntArray10105 = anIntArrayArray10104[aClass261_10093.method4925((byte) -60)];
		aClass261_10093.method4875();
		method15772(i, 735389724);
	}

	public void method5762() {
		aClass261_10093.method4810(aClass265Array10087[18]);
		anIntArray10105 = anIntArrayArray10104[aClass261_10093.method4925((byte) -82)];
		aClass261_10093.method4875();
		aClass261_10093.method4816(anIntArray10105[6], aClass442_3592.aFloat4918, aClass442_3592.aFloat4915, aClass442_3592.aFloat4919, (byte) -97);
		aClass261_10093.method4825(anIntArray10105[16], aFloat3585, aFloat3586, 0.0F, 0.0F, (short) 255);
		method15772(0, 1334993972);
	}

	public Class326_Sub2(Class180_Sub2 class180_sub2) throws Exception_Sub5 {
		super(class180_sub2);
		aClass265Array10087 = new Class265[19];
		anIntArrayArray10104 = new int[19][17];
		method15771(-845772076);
	}

	public void method5770(Class427 class427) {
		aClass427_10102.method6750(class427);
		aClass427_10102.method6751(aClass180_Sub2_3578.aClass427_9474);
	}

	public void method5764(boolean bool) {
		if (bool)
			aClass261_10093.method4810(aClass265Array10087[1]);
		else
			aClass261_10093.method4810(aClass265Array10087[0]);
		anIntArray10105 = anIntArrayArray10104[aClass261_10093.method4925((byte) -65)];
		aClass261_10093.method4875();
		aClass261_10093.method4831(anIntArray10105[2], 0, anInterface38_3595, (byte) 2);
		aClass261_10093.method4830(anIntArray10105[4], aClass427_10102, 1416848415);
		aClass261_10093.method4829(anIntArray10105[5], aClass427_3583, -335548114);
		aClass261_10093.method4825(anIntArray10105[7], aClass441_3587.aFloat4913, aClass441_3587.aFloat4911, aClass441_3587.aFloat4912, aClass441_3587.aFloat4910, (short) 255);
		aClass261_10093.method4816(anIntArray10105[8], aClass442_3588.aFloat4918, aClass442_3588.aFloat4915, aClass442_3588.aFloat4919, (byte) -113);
		aClass261_10093.method4825(anIntArray10105[9], aClass441_3589.aFloat4913, aClass441_3589.aFloat4911, aClass441_3589.aFloat4912, aClass441_3589.aFloat4910, (short) 255);
		aClass261_10093.method4816(anIntArray10105[10], aClass442_3581.aFloat4918, aClass442_3581.aFloat4915, aClass442_3581.aFloat4919, (byte) -118);
		aClass180_Sub2_3578.method15010(Class364.aClass364_3861, anInt3598, anInt3597, anInt3584, anInt3599);
	}

	public void method5777(boolean bool) {
		if (bool)
			aClass261_10093.method4810(aClass265Array10087[1]);
		else
			aClass261_10093.method4810(aClass265Array10087[0]);
		anIntArray10105 = anIntArrayArray10104[aClass261_10093.method4925((byte) -46)];
		aClass261_10093.method4875();
		aClass261_10093.method4831(anIntArray10105[2], 0, anInterface38_3595, (byte) 2);
		aClass261_10093.method4830(anIntArray10105[4], aClass427_10102, -2112213629);
		aClass261_10093.method4829(anIntArray10105[5], aClass427_3583, -1874462698);
		aClass261_10093.method4825(anIntArray10105[7], aClass441_3587.aFloat4913, aClass441_3587.aFloat4911, aClass441_3587.aFloat4912, aClass441_3587.aFloat4910, (short) 255);
		aClass261_10093.method4816(anIntArray10105[8], aClass442_3588.aFloat4918, aClass442_3588.aFloat4915, aClass442_3588.aFloat4919, (byte) -67);
		aClass261_10093.method4825(anIntArray10105[9], aClass441_3589.aFloat4913, aClass441_3589.aFloat4911, aClass441_3589.aFloat4912, aClass441_3589.aFloat4910, (short) 255);
		aClass261_10093.method4816(anIntArray10105[10], aClass442_3581.aFloat4918, aClass442_3581.aFloat4915, aClass442_3581.aFloat4919, (byte) -113);
		aClass180_Sub2_3578.method15010(Class364.aClass364_3861, anInt3598, anInt3597, anInt3584, anInt3599);
	}

	public void method5760(int i) {
		aClass261_10093.method4810(aClass265Array10087[i + 12]);
		anIntArray10105 = anIntArrayArray10104[aClass261_10093.method4925((byte) -100)];
		aClass261_10093.method4875();
		aClass261_10093.method4923(anIntArray10105[15], aClass427_3577, (byte) -72);
		aClass261_10093.method4816(anIntArray10105[6], aClass442_3592.aFloat4918, aClass442_3592.aFloat4915, aClass442_3592.aFloat4919, (byte) -23);
		aClass261_10093.method4831(anIntArray10105[3], 1, anInterface39_3582, (byte) 2);
		method15772(i, -1911755788);
	}

	public void method5768(int i) {
		aClass261_10093.method4810(aClass265Array10087[i + 2]);
		anIntArray10105 = anIntArrayArray10104[aClass261_10093.method4925((byte) -51)];
		aClass261_10093.method4875();
		method15772(i, 1110332221);
	}

	public void method5767(int i) {
		aClass261_10093.method4810(aClass265Array10087[7 + i]);
		anIntArray10105 = anIntArrayArray10104[aClass261_10093.method4925((byte) -52)];
		aClass261_10093.method4875();
		aClass261_10093.method4816(anIntArray10105[6], aClass442_3592.aFloat4918, aClass442_3592.aFloat4915, aClass442_3592.aFloat4919, (byte) -48);
		aClass261_10093.method4825(anIntArray10105[16], aFloat3585, aFloat3586, 0.0F, 0.0F, (short) 255);
		method15772(i, 460242371);
	}

	public void method5756(int i) {
		aClass261_10093.method4810(aClass265Array10087[7 + i]);
		anIntArray10105 = anIntArrayArray10104[aClass261_10093.method4925((byte) -108)];
		aClass261_10093.method4875();
		aClass261_10093.method4816(anIntArray10105[6], aClass442_3592.aFloat4918, aClass442_3592.aFloat4915, aClass442_3592.aFloat4919, (byte) -65);
		aClass261_10093.method4825(anIntArray10105[16], aFloat3585, aFloat3586, 0.0F, 0.0F, (short) 255);
		method15772(i, -2019855609);
	}

	void method15773(int i) {
		aClass261_10093.method4831(anIntArray10105[2], 0, anInterface38_3595, (byte) 2);
		aClass261_10093.method4830(anIntArray10105[4], aClass427_10102, -1762454285);
		aClass261_10093.method4829(anIntArray10105[5], aClass427_3583, -256540156);
		aClass261_10093.method4825(anIntArray10105[7], aClass441_3587.aFloat4913, aClass441_3587.aFloat4911, aClass441_3587.aFloat4912, aClass441_3587.aFloat4910, (short) 255);
		aClass261_10093.method4816(anIntArray10105[8], aClass442_3588.aFloat4918, aClass442_3588.aFloat4915, aClass442_3588.aFloat4919, (byte) -104);
		aClass261_10093.method4825(anIntArray10105[9], aClass441_3589.aFloat4913, aClass441_3589.aFloat4911, aClass441_3589.aFloat4912, aClass441_3589.aFloat4910, (short) 255);
		aClass261_10093.method4816(anIntArray10105[10], aClass442_3581.aFloat4918, aClass442_3581.aFloat4915, aClass442_3581.aFloat4919, (byte) -2);
		aClass261_10093.method4826(anIntArray10105[11], aClass442_3591, -182986135);
		aClass261_10093.method4826(anIntArray10105[12], aClass442_3590, -182986135);
		aClass261_10093.method4826(anIntArray10105[13], aClass442_3593, -182986135);
		aClass261_10093.method4826(anIntArray10105[14], aClass442_3594, -182986135);
		if (i > 0) {
			aClass261_10093.method4834(anIntArray10105[1], aFloatArray3580, i * 4, 1361346055);
			aClass261_10093.method4834(anIntArray10105[0], aFloatArray3579, 4 * i, -648312687);
		}
		aClass180_Sub2_3578.method15010(Class364.aClass364_3861, anInt3598, anInt3597, anInt3584, anInt3599);
	}

	public void method5759(int i) {
		aClass261_10093.method4810(aClass265Array10087[i + 12]);
		anIntArray10105 = anIntArrayArray10104[aClass261_10093.method4925((byte) -49)];
		aClass261_10093.method4875();
		aClass261_10093.method4923(anIntArray10105[15], aClass427_3577, (byte) -49);
		aClass261_10093.method4816(anIntArray10105[6], aClass442_3592.aFloat4918, aClass442_3592.aFloat4915, aClass442_3592.aFloat4919, (byte) -122);
		aClass261_10093.method4831(anIntArray10105[3], 1, anInterface39_3582, (byte) 2);
		method15772(i, 1497149090);
	}

	public void method5771() {
		aClass261_10093.method4810(aClass265Array10087[17]);
		anIntArray10105 = anIntArrayArray10104[aClass261_10093.method4925((byte) -6)];
		aClass261_10093.method4875();
		method15772(0, -1691934554);
	}

	public void method5761() {
		aClass261_10093.method4810(aClass265Array10087[18]);
		anIntArray10105 = anIntArrayArray10104[aClass261_10093.method4925((byte) -55)];
		aClass261_10093.method4875();
		aClass261_10093.method4816(anIntArray10105[6], aClass442_3592.aFloat4918, aClass442_3592.aFloat4915, aClass442_3592.aFloat4919, (byte) -99);
		aClass261_10093.method4825(anIntArray10105[16], aFloat3585, aFloat3586, 0.0F, 0.0F, (short) 255);
		method15772(0, -899006875);
	}

	public void method5772() {
		aClass261_10093.method4810(aClass265Array10087[17]);
		anIntArray10105 = anIntArrayArray10104[aClass261_10093.method4925((byte) -110)];
		aClass261_10093.method4875();
		method15772(0, 1611761426);
	}

	public void method5774() {
		aClass261_10093.method4810(aClass265Array10087[18]);
		anIntArray10105 = anIntArrayArray10104[aClass261_10093.method4925((byte) -45)];
		aClass261_10093.method4875();
		aClass261_10093.method4816(anIntArray10105[6], aClass442_3592.aFloat4918, aClass442_3592.aFloat4915, aClass442_3592.aFloat4919, (byte) -112);
		aClass261_10093.method4825(anIntArray10105[16], aFloat3585, aFloat3586, 0.0F, 0.0F, (short) 255);
		method15772(0, -1221241972);
	}

	public void method5754(int i) {
		aClass261_10093.method4810(aClass265Array10087[7 + i]);
		anIntArray10105 = anIntArrayArray10104[aClass261_10093.method4925((byte) -60)];
		aClass261_10093.method4875();
		aClass261_10093.method4816(anIntArray10105[6], aClass442_3592.aFloat4918, aClass442_3592.aFloat4915, aClass442_3592.aFloat4919, (byte) -69);
		aClass261_10093.method4825(anIntArray10105[16], aFloat3585, aFloat3586, 0.0F, 0.0F, (short) 255);
		method15772(i, 769477548);
	}

	void method15774(int i) {
		aClass261_10093.method4831(anIntArray10105[2], 0, anInterface38_3595, (byte) 2);
		aClass261_10093.method4830(anIntArray10105[4], aClass427_10102, -1381608081);
		aClass261_10093.method4829(anIntArray10105[5], aClass427_3583, 195649158);
		aClass261_10093.method4825(anIntArray10105[7], aClass441_3587.aFloat4913, aClass441_3587.aFloat4911, aClass441_3587.aFloat4912, aClass441_3587.aFloat4910, (short) 255);
		aClass261_10093.method4816(anIntArray10105[8], aClass442_3588.aFloat4918, aClass442_3588.aFloat4915, aClass442_3588.aFloat4919, (byte) -78);
		aClass261_10093.method4825(anIntArray10105[9], aClass441_3589.aFloat4913, aClass441_3589.aFloat4911, aClass441_3589.aFloat4912, aClass441_3589.aFloat4910, (short) 255);
		aClass261_10093.method4816(anIntArray10105[10], aClass442_3581.aFloat4918, aClass442_3581.aFloat4915, aClass442_3581.aFloat4919, (byte) -70);
		aClass261_10093.method4826(anIntArray10105[11], aClass442_3591, -182986135);
		aClass261_10093.method4826(anIntArray10105[12], aClass442_3590, -182986135);
		aClass261_10093.method4826(anIntArray10105[13], aClass442_3593, -182986135);
		aClass261_10093.method4826(anIntArray10105[14], aClass442_3594, -182986135);
		if (i > 0) {
			aClass261_10093.method4834(anIntArray10105[1], aFloatArray3580, i * 4, 1648479881);
			aClass261_10093.method4834(anIntArray10105[0], aFloatArray3579, 4 * i, 1221143976);
		}
		aClass180_Sub2_3578.method15010(Class364.aClass364_3861, anInt3598, anInt3597, anInt3584, anInt3599);
	}

	public void method5773() {
		aClass261_10093.method4810(aClass265Array10087[18]);
		anIntArray10105 = anIntArrayArray10104[aClass261_10093.method4925((byte) -58)];
		aClass261_10093.method4875();
		aClass261_10093.method4816(anIntArray10105[6], aClass442_3592.aFloat4918, aClass442_3592.aFloat4915, aClass442_3592.aFloat4919, (byte) -8);
		aClass261_10093.method4825(anIntArray10105[16], aFloat3585, aFloat3586, 0.0F, 0.0F, (short) 255);
		method15772(0, 1928368113);
	}
}
