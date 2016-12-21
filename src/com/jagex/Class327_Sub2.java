/* Class327_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class327_Sub2 extends Class327 {
	Class285[] aClass285Array10069;
	static final int anInt10070 = 0;
	int[] anIntArray10071;
	static final int anInt10072 = 2;
	static final int anInt10073 = 0;
	static final int anInt10074 = 4;
	static final int anInt10075 = 5;
	static final int anInt10076 = 6;
	Class443 aClass443_10077 = new Class443();
	static final int anInt10078 = 8;
	int[][] anIntArrayArray10079;
	static final int anInt10080 = 10;
	static final int anInt10081 = 11;
	static final int anInt10082 = 16;
	static final int anInt10083 = 13;
	static final int anInt10084 = 14;
	static final int anInt10085 = 15;
	static final int anInt10086 = 17;
	static final int anInt10087 = 17;
	static final int anInt10088 = 2;
	static final int anInt10089 = 1;
	static final int anInt10090 = 1;
	static final int anInt10091 = 7;
	static final int anInt10092 = 12;
	static final int anInt10093 = 7;
	static final int anInt10094 = 18;
	static final int anInt10095 = 19;
	static final int anInt10096 = 12;
	static final int anInt10097 = 9;
	Class286 aClass286_10098;
	static final int anInt10099 = 3;

	public void method4283() {
		aClass286_10098.method3850(aClass285Array10069[17]);
		anIntArray10071 = anIntArrayArray10079[aClass286_10098.method3852(2016955457)];
		aClass286_10098.method3843();
		method9192(0, (byte) 58);
	}

	boolean method9191(int i) throws Exception_Sub7 {
		aClass286_10098 = aClass167_Sub3_3578.method8714("Model");
		Class536_Sub8_Sub1 class536_sub8_sub1 = aClass286_10098.method3866("DiffuseSampler", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_0_ = aClass286_10098.method3866("EnvironmentSampler", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_1_ = aClass286_10098.method3866("PointLightsPosAndRadiusInv", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_2_ = aClass286_10098.method3866("PointLightsDiffuseColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_3_ = aClass286_10098.method3866("WVPMatrix", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_4_ = aClass286_10098.method3866("TexCoordMatrix", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_5_ = aClass286_10098.method3866("HeightFogPlane", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_6_ = aClass286_10098.method3866("HeightFogColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_7_ = aClass286_10098.method3866("DistanceFogPlane", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_8_ = aClass286_10098.method3866("DistanceFogColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_9_ = aClass286_10098.method3866("SunDir", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_10_ = aClass286_10098.method3866("SunColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_11_ = aClass286_10098.method3866("AntiSunColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_12_ = aClass286_10098.method3866("AmbientColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_13_ = aClass286_10098.method3866("EyePos", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_14_ = aClass286_10098.method3866("SpecularExponent", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_15_ = aClass286_10098.method3866("WorldMatrix", (byte) 0);
		aClass285Array10069[0] = aClass286_10098.method3855("Unlit", (byte) -84);
		aClass285Array10069[1] = aClass286_10098.method3855("Unlit_IgnoreAlpha", (byte) -35);
		aClass285Array10069[17] = aClass286_10098.method3855("UnderwaterGround", (byte) -49);
		aClass285Array10069[18] = aClass286_10098.method3855("UnderwaterGroundSpecular", (byte) -58);
		for (int i_16_ = 0; i_16_ <= 4; i_16_++) {
			aClass285Array10069[i_16_ + 2] = aClass286_10098.method3855(new StringBuilder().append("Standard_").append(i_16_).append("PointLights").toString(), (byte) 28);
			aClass285Array10069[i_16_ + 7] = aClass286_10098.method3855(new StringBuilder().append("Specular_").append(i_16_).append("PointLights").toString(), (byte) -90);
			aClass285Array10069[i_16_ + 12] = aClass286_10098.method3855(new StringBuilder().append("EnvironmentalMapping_").append(i_16_).append("PointLights").toString(), (byte) -17);
		}
		for (int i_17_ = 0; i_17_ < 19; i_17_++) {
			int i_18_ = aClass286_10098.method3894(aClass285Array10069[i_17_], 351582691);
			anIntArrayArray10079[i_17_][2] = class536_sub8_sub1.method10647(i_18_);
			anIntArrayArray10079[i_17_][3] = class536_sub8_sub1_0_.method10647(i_18_);
			anIntArrayArray10079[i_17_][1] = class536_sub8_sub1_1_.method10647(i_18_);
			anIntArrayArray10079[i_17_][0] = class536_sub8_sub1_2_.method10647(i_18_);
			anIntArrayArray10079[i_17_][4] = class536_sub8_sub1_3_.method10647(i_18_);
			anIntArrayArray10079[i_17_][5] = class536_sub8_sub1_4_.method10647(i_18_);
			anIntArrayArray10079[i_17_][7] = class536_sub8_sub1_5_.method10647(i_18_);
			anIntArrayArray10079[i_17_][8] = class536_sub8_sub1_6_.method10647(i_18_);
			anIntArrayArray10079[i_17_][9] = class536_sub8_sub1_7_.method10647(i_18_);
			anIntArrayArray10079[i_17_][10] = class536_sub8_sub1_8_.method10647(i_18_);
			anIntArrayArray10079[i_17_][11] = class536_sub8_sub1_9_.method10647(i_18_);
			anIntArrayArray10079[i_17_][12] = class536_sub8_sub1_10_.method10647(i_18_);
			anIntArrayArray10079[i_17_][13] = class536_sub8_sub1_11_.method10647(i_18_);
			anIntArrayArray10079[i_17_][14] = class536_sub8_sub1_12_.method10647(i_18_);
			anIntArrayArray10079[i_17_][6] = class536_sub8_sub1_13_.method10647(i_18_);
			anIntArrayArray10079[i_17_][15] = class536_sub8_sub1_15_.method10647(i_18_);
			anIntArrayArray10079[i_17_][16] = class536_sub8_sub1_14_.method10647(i_18_);
		}
		aClass286_10098.method3850(aClass285Array10069[2]);
		return true;
	}

	public void method4284(Class443 class443) {
		aClass443_10077.method5339(class443);
		aClass443_10077.method5390(aClass167_Sub3_3578.aClass443_9585);
	}

	public void method4285(boolean bool) {
		if (bool)
			aClass286_10098.method3850(aClass285Array10069[1]);
		else
			aClass286_10098.method3850(aClass285Array10069[0]);
		anIntArray10071 = anIntArrayArray10079[aClass286_10098.method3852(746416140)];
		aClass286_10098.method3843();
		aClass286_10098.method3865(anIntArray10071[2], 0, anInterface36_3569, 1958750663);
		aClass286_10098.method3864(anIntArray10071[4], aClass443_10077, 1639902412);
		aClass286_10098.method3878(anIntArray10071[5], aClass443_3571, -934034639);
		aClass286_10098.method3890(anIntArray10071[7], aClass427_3575.aFloat4813, aClass427_3575.aFloat4811, aClass427_3575.aFloat4814, aClass427_3575.aFloat4812, -1468129876);
		aClass286_10098.method3861(anIntArray10071[8], aClass436_3573.aFloat4850, aClass436_3573.aFloat4852, aClass436_3573.aFloat4853, 401944140);
		aClass286_10098.method3890(anIntArray10071[9], aClass427_3577.aFloat4813, aClass427_3577.aFloat4811, aClass427_3577.aFloat4814, aClass427_3577.aFloat4812, -2096593363);
		aClass286_10098.method3861(anIntArray10071[10], aClass436_3585.aFloat4850, aClass436_3585.aFloat4852, aClass436_3585.aFloat4853, 1846281486);
		aClass167_Sub3_3578.method8817(Class377.aClass377_3917, anInt3584, anInt3574, anInt3586, anInt3587);
	}

	public void method4289() {
		aClass286_10098.method3850(aClass285Array10069[17]);
		anIntArray10071 = anIntArrayArray10079[aClass286_10098.method3852(1795277251)];
		aClass286_10098.method3843();
		method9192(0, (byte) -98);
	}

	public void method4287() {
		aClass286_10098.method3850(aClass285Array10069[18]);
		anIntArray10071 = anIntArrayArray10079[aClass286_10098.method3852(1767897020)];
		aClass286_10098.method3843();
		aClass286_10098.method3861(anIntArray10071[6], aClass436_3572.aFloat4850, aClass436_3572.aFloat4852, aClass436_3572.aFloat4853, -134319724);
		aClass286_10098.method3890(anIntArray10071[16], aFloat3576, aFloat3565, 0.0F, 0.0F, -2021724924);
		method9192(0, (byte) -74);
	}

	void method9192(int i, byte i_19_) {
		aClass286_10098.method3865(anIntArray10071[2], 0, anInterface36_3569, 2113760570);
		aClass286_10098.method3864(anIntArray10071[4], aClass443_10077, 1521187434);
		aClass286_10098.method3878(anIntArray10071[5], aClass443_3571, 1132309821);
		aClass286_10098.method3890(anIntArray10071[7], aClass427_3575.aFloat4813, aClass427_3575.aFloat4811, aClass427_3575.aFloat4814, aClass427_3575.aFloat4812, -1197156131);
		aClass286_10098.method3861(anIntArray10071[8], aClass436_3573.aFloat4850, aClass436_3573.aFloat4852, aClass436_3573.aFloat4853, 688148162);
		aClass286_10098.method3890(anIntArray10071[9], aClass427_3577.aFloat4813, aClass427_3577.aFloat4811, aClass427_3577.aFloat4814, aClass427_3577.aFloat4812, -1492792042);
		aClass286_10098.method3861(anIntArray10071[10], aClass436_3585.aFloat4850, aClass436_3585.aFloat4852, aClass436_3585.aFloat4853, 48241194);
		aClass286_10098.method3862(anIntArray10071[11], aClass436_3583, (byte) 8);
		aClass286_10098.method3862(anIntArray10071[12], aClass436_3580, (byte) 8);
		aClass286_10098.method3862(anIntArray10071[13], aClass436_3581, (byte) 8);
		aClass286_10098.method3862(anIntArray10071[14], aClass436_3566, (byte) 8);
		if (i > 0) {
			aClass286_10098.method3888(anIntArray10071[1], aFloatArray3568, 4 * i, (short) 1089);
			aClass286_10098.method3888(anIntArray10071[0], aFloatArray3567, 4 * i, (short) 1089);
		}
		aClass167_Sub3_3578.method8817(Class377.aClass377_3917, anInt3584, anInt3574, anInt3586, anInt3587);
	}

	public void method4293(int i) {
		aClass286_10098.method3850(aClass285Array10069[2 + i]);
		anIntArray10071 = anIntArrayArray10079[aClass286_10098.method3852(1574278780)];
		aClass286_10098.method3843();
		method9192(i, (byte) 33);
	}

	public void method4286(int i) {
		aClass286_10098.method3850(aClass285Array10069[7 + i]);
		anIntArray10071 = anIntArrayArray10079[aClass286_10098.method3852(2074176822)];
		aClass286_10098.method3843();
		aClass286_10098.method3861(anIntArray10071[6], aClass436_3572.aFloat4850, aClass436_3572.aFloat4852, aClass436_3572.aFloat4853, -632422971);
		aClass286_10098.method3890(anIntArray10071[16], aFloat3576, aFloat3565, 0.0F, 0.0F, -1180588178);
		method9192(i, (byte) -6);
	}

	public void method4297(int i) {
		aClass286_10098.method3850(aClass285Array10069[7 + i]);
		anIntArray10071 = anIntArrayArray10079[aClass286_10098.method3852(910344936)];
		aClass286_10098.method3843();
		aClass286_10098.method3861(anIntArray10071[6], aClass436_3572.aFloat4850, aClass436_3572.aFloat4852, aClass436_3572.aFloat4853, -337769878);
		aClass286_10098.method3890(anIntArray10071[16], aFloat3576, aFloat3565, 0.0F, 0.0F, -1755737883);
		method9192(i, (byte) 52);
	}

	public void method4294(Class443 class443) {
		aClass443_10077.method5339(class443);
		aClass443_10077.method5390(aClass167_Sub3_3578.aClass443_9585);
	}

	public void method4299(int i) {
		aClass286_10098.method3850(aClass285Array10069[12 + i]);
		anIntArray10071 = anIntArrayArray10079[aClass286_10098.method3852(1545552645)];
		aClass286_10098.method3843();
		aClass286_10098.method3863(anIntArray10071[15], aClass443_3582, (byte) 2);
		aClass286_10098.method3861(anIntArray10071[6], aClass436_3572.aFloat4850, aClass436_3572.aFloat4852, aClass436_3572.aFloat4853, 1403174324);
		aClass286_10098.method3865(anIntArray10071[3], 1, anInterface39_3570, 1884231431);
		method9192(i, (byte) 34);
	}

	public void method4282(boolean bool) {
		if (bool)
			aClass286_10098.method3850(aClass285Array10069[1]);
		else
			aClass286_10098.method3850(aClass285Array10069[0]);
		anIntArray10071 = anIntArrayArray10079[aClass286_10098.method3852(2082962174)];
		aClass286_10098.method3843();
		aClass286_10098.method3865(anIntArray10071[2], 0, anInterface36_3569, 2035262283);
		aClass286_10098.method3864(anIntArray10071[4], aClass443_10077, 1719074406);
		aClass286_10098.method3878(anIntArray10071[5], aClass443_3571, 1455015522);
		aClass286_10098.method3890(anIntArray10071[7], aClass427_3575.aFloat4813, aClass427_3575.aFloat4811, aClass427_3575.aFloat4814, aClass427_3575.aFloat4812, -1439975170);
		aClass286_10098.method3861(anIntArray10071[8], aClass436_3573.aFloat4850, aClass436_3573.aFloat4852, aClass436_3573.aFloat4853, 2138760517);
		aClass286_10098.method3890(anIntArray10071[9], aClass427_3577.aFloat4813, aClass427_3577.aFloat4811, aClass427_3577.aFloat4814, aClass427_3577.aFloat4812, -1641198651);
		aClass286_10098.method3861(anIntArray10071[10], aClass436_3585.aFloat4850, aClass436_3585.aFloat4852, aClass436_3585.aFloat4853, -538635142);
		aClass167_Sub3_3578.method8817(Class377.aClass377_3917, anInt3584, anInt3574, anInt3586, anInt3587);
	}

	public void method4288(int i) {
		aClass286_10098.method3850(aClass285Array10069[12 + i]);
		anIntArray10071 = anIntArrayArray10079[aClass286_10098.method3852(321781080)];
		aClass286_10098.method3843();
		aClass286_10098.method3863(anIntArray10071[15], aClass443_3582, (byte) -7);
		aClass286_10098.method3861(anIntArray10071[6], aClass436_3572.aFloat4850, aClass436_3572.aFloat4852, aClass436_3572.aFloat4853, 1076014297);
		aClass286_10098.method3865(anIntArray10071[3], 1, anInterface39_3570, 1937850817);
		method9192(i, (byte) -78);
	}

	public void method4291(boolean bool) {
		if (bool)
			aClass286_10098.method3850(aClass285Array10069[1]);
		else
			aClass286_10098.method3850(aClass285Array10069[0]);
		anIntArray10071 = anIntArrayArray10079[aClass286_10098.method3852(2111687006)];
		aClass286_10098.method3843();
		aClass286_10098.method3865(anIntArray10071[2], 0, anInterface36_3569, 1792957816);
		aClass286_10098.method3864(anIntArray10071[4], aClass443_10077, 1045356683);
		aClass286_10098.method3878(anIntArray10071[5], aClass443_3571, -417193120);
		aClass286_10098.method3890(anIntArray10071[7], aClass427_3575.aFloat4813, aClass427_3575.aFloat4811, aClass427_3575.aFloat4814, aClass427_3575.aFloat4812, -1879952538);
		aClass286_10098.method3861(anIntArray10071[8], aClass436_3573.aFloat4850, aClass436_3573.aFloat4852, aClass436_3573.aFloat4853, 826519877);
		aClass286_10098.method3890(anIntArray10071[9], aClass427_3577.aFloat4813, aClass427_3577.aFloat4811, aClass427_3577.aFloat4814, aClass427_3577.aFloat4812, -1185625212);
		aClass286_10098.method3861(anIntArray10071[10], aClass436_3585.aFloat4850, aClass436_3585.aFloat4852, aClass436_3585.aFloat4853, 670807874);
		aClass167_Sub3_3578.method8817(Class377.aClass377_3917, anInt3584, anInt3574, anInt3586, anInt3587);
	}

	public void method4295(int i) {
		aClass286_10098.method3850(aClass285Array10069[2 + i]);
		anIntArray10071 = anIntArrayArray10079[aClass286_10098.method3852(521134520)];
		aClass286_10098.method3843();
		method9192(i, (byte) -31);
	}

	public void method4296(int i) {
		aClass286_10098.method3850(aClass285Array10069[2 + i]);
		anIntArray10071 = anIntArrayArray10079[aClass286_10098.method3852(1102334696)];
		aClass286_10098.method3843();
		method9192(i, (byte) 37);
	}

	public void method4292(Class443 class443) {
		aClass443_10077.method5339(class443);
		aClass443_10077.method5390(aClass167_Sub3_3578.aClass443_9585);
	}

	public void method4298(int i) {
		aClass286_10098.method3850(aClass285Array10069[12 + i]);
		anIntArray10071 = anIntArrayArray10079[aClass286_10098.method3852(596229732)];
		aClass286_10098.method3843();
		aClass286_10098.method3863(anIntArray10071[15], aClass443_3582, (byte) -68);
		aClass286_10098.method3861(anIntArray10071[6], aClass436_3572.aFloat4850, aClass436_3572.aFloat4852, aClass436_3572.aFloat4853, 1278436040);
		aClass286_10098.method3865(anIntArray10071[3], 1, anInterface39_3570, 1981785101);
		method9192(i, (byte) 62);
	}

	public void method4302(boolean bool) {
		if (bool)
			aClass286_10098.method3850(aClass285Array10069[1]);
		else
			aClass286_10098.method3850(aClass285Array10069[0]);
		anIntArray10071 = anIntArrayArray10079[aClass286_10098.method3852(906657591)];
		aClass286_10098.method3843();
		aClass286_10098.method3865(anIntArray10071[2], 0, anInterface36_3569, 1939663240);
		aClass286_10098.method3864(anIntArray10071[4], aClass443_10077, -862250269);
		aClass286_10098.method3878(anIntArray10071[5], aClass443_3571, -153784445);
		aClass286_10098.method3890(anIntArray10071[7], aClass427_3575.aFloat4813, aClass427_3575.aFloat4811, aClass427_3575.aFloat4814, aClass427_3575.aFloat4812, -1838185936);
		aClass286_10098.method3861(anIntArray10071[8], aClass436_3573.aFloat4850, aClass436_3573.aFloat4852, aClass436_3573.aFloat4853, -328607888);
		aClass286_10098.method3890(anIntArray10071[9], aClass427_3577.aFloat4813, aClass427_3577.aFloat4811, aClass427_3577.aFloat4814, aClass427_3577.aFloat4812, -1285378725);
		aClass286_10098.method3861(anIntArray10071[10], aClass436_3585.aFloat4850, aClass436_3585.aFloat4852, aClass436_3585.aFloat4853, -879931399);
		aClass167_Sub3_3578.method8817(Class377.aClass377_3917, anInt3584, anInt3574, anInt3586, anInt3587);
	}

	public void method4300(int i) {
		aClass286_10098.method3850(aClass285Array10069[12 + i]);
		anIntArray10071 = anIntArrayArray10079[aClass286_10098.method3852(1019110381)];
		aClass286_10098.method3843();
		aClass286_10098.method3863(anIntArray10071[15], aClass443_3582, (byte) 4);
		aClass286_10098.method3861(anIntArray10071[6], aClass436_3572.aFloat4850, aClass436_3572.aFloat4852, aClass436_3572.aFloat4853, 1108281199);
		aClass286_10098.method3865(anIntArray10071[3], 1, anInterface39_3570, 1821803012);
		method9192(i, (byte) 9);
	}

	public void method4301() {
		aClass286_10098.method3850(aClass285Array10069[18]);
		anIntArray10071 = anIntArrayArray10079[aClass286_10098.method3852(876397209)];
		aClass286_10098.method3843();
		aClass286_10098.method3861(anIntArray10071[6], aClass436_3572.aFloat4850, aClass436_3572.aFloat4852, aClass436_3572.aFloat4853, -707517807);
		aClass286_10098.method3890(anIntArray10071[16], aFloat3576, aFloat3565, 0.0F, 0.0F, -2101716401);
		method9192(0, (byte) 102);
	}

	public Class327_Sub2(Class167_Sub3 class167_sub3) throws Exception_Sub7 {
		super(class167_sub3);
		aClass285Array10069 = new Class285[19];
		anIntArrayArray10079 = new int[19][17];
		method9191(-1893267736);
	}

	boolean method9193() throws Exception_Sub7 {
		aClass286_10098 = aClass167_Sub3_3578.method8714("Model");
		Class536_Sub8_Sub1 class536_sub8_sub1 = aClass286_10098.method3866("DiffuseSampler", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_20_ = aClass286_10098.method3866("EnvironmentSampler", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_21_ = aClass286_10098.method3866("PointLightsPosAndRadiusInv", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_22_ = aClass286_10098.method3866("PointLightsDiffuseColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_23_ = aClass286_10098.method3866("WVPMatrix", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_24_ = aClass286_10098.method3866("TexCoordMatrix", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_25_ = aClass286_10098.method3866("HeightFogPlane", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_26_ = aClass286_10098.method3866("HeightFogColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_27_ = aClass286_10098.method3866("DistanceFogPlane", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_28_ = aClass286_10098.method3866("DistanceFogColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_29_ = aClass286_10098.method3866("SunDir", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_30_ = aClass286_10098.method3866("SunColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_31_ = aClass286_10098.method3866("AntiSunColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_32_ = aClass286_10098.method3866("AmbientColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_33_ = aClass286_10098.method3866("EyePos", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_34_ = aClass286_10098.method3866("SpecularExponent", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_35_ = aClass286_10098.method3866("WorldMatrix", (byte) 0);
		aClass285Array10069[0] = aClass286_10098.method3855("Unlit", (byte) -19);
		aClass285Array10069[1] = aClass286_10098.method3855("Unlit_IgnoreAlpha", (byte) -64);
		aClass285Array10069[17] = aClass286_10098.method3855("UnderwaterGround", (byte) 16);
		aClass285Array10069[18] = aClass286_10098.method3855("UnderwaterGroundSpecular", (byte) -28);
		for (int i = 0; i <= 4; i++) {
			aClass285Array10069[i + 2] = aClass286_10098.method3855(new StringBuilder().append("Standard_").append(i).append("PointLights").toString(), (byte) -3);
			aClass285Array10069[i + 7] = aClass286_10098.method3855(new StringBuilder().append("Specular_").append(i).append("PointLights").toString(), (byte) 2);
			aClass285Array10069[i + 12] = aClass286_10098.method3855(new StringBuilder().append("EnvironmentalMapping_").append(i).append("PointLights").toString(), (byte) -13);
		}
		for (int i = 0; i < 19; i++) {
			int i_36_ = aClass286_10098.method3894(aClass285Array10069[i], -21622778);
			anIntArrayArray10079[i][2] = class536_sub8_sub1.method10647(i_36_);
			anIntArrayArray10079[i][3] = class536_sub8_sub1_20_.method10647(i_36_);
			anIntArrayArray10079[i][1] = class536_sub8_sub1_21_.method10647(i_36_);
			anIntArrayArray10079[i][0] = class536_sub8_sub1_22_.method10647(i_36_);
			anIntArrayArray10079[i][4] = class536_sub8_sub1_23_.method10647(i_36_);
			anIntArrayArray10079[i][5] = class536_sub8_sub1_24_.method10647(i_36_);
			anIntArrayArray10079[i][7] = class536_sub8_sub1_25_.method10647(i_36_);
			anIntArrayArray10079[i][8] = class536_sub8_sub1_26_.method10647(i_36_);
			anIntArrayArray10079[i][9] = class536_sub8_sub1_27_.method10647(i_36_);
			anIntArrayArray10079[i][10] = class536_sub8_sub1_28_.method10647(i_36_);
			anIntArrayArray10079[i][11] = class536_sub8_sub1_29_.method10647(i_36_);
			anIntArrayArray10079[i][12] = class536_sub8_sub1_30_.method10647(i_36_);
			anIntArrayArray10079[i][13] = class536_sub8_sub1_31_.method10647(i_36_);
			anIntArrayArray10079[i][14] = class536_sub8_sub1_32_.method10647(i_36_);
			anIntArrayArray10079[i][6] = class536_sub8_sub1_33_.method10647(i_36_);
			anIntArrayArray10079[i][15] = class536_sub8_sub1_35_.method10647(i_36_);
			anIntArrayArray10079[i][16] = class536_sub8_sub1_34_.method10647(i_36_);
		}
		aClass286_10098.method3850(aClass285Array10069[2]);
		return true;
	}

	boolean method9194() throws Exception_Sub7 {
		aClass286_10098 = aClass167_Sub3_3578.method8714("Model");
		Class536_Sub8_Sub1 class536_sub8_sub1 = aClass286_10098.method3866("DiffuseSampler", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_37_ = aClass286_10098.method3866("EnvironmentSampler", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_38_ = aClass286_10098.method3866("PointLightsPosAndRadiusInv", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_39_ = aClass286_10098.method3866("PointLightsDiffuseColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_40_ = aClass286_10098.method3866("WVPMatrix", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_41_ = aClass286_10098.method3866("TexCoordMatrix", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_42_ = aClass286_10098.method3866("HeightFogPlane", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_43_ = aClass286_10098.method3866("HeightFogColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_44_ = aClass286_10098.method3866("DistanceFogPlane", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_45_ = aClass286_10098.method3866("DistanceFogColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_46_ = aClass286_10098.method3866("SunDir", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_47_ = aClass286_10098.method3866("SunColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_48_ = aClass286_10098.method3866("AntiSunColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_49_ = aClass286_10098.method3866("AmbientColour", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_50_ = aClass286_10098.method3866("EyePos", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_51_ = aClass286_10098.method3866("SpecularExponent", (byte) 0);
		Class536_Sub8_Sub1 class536_sub8_sub1_52_ = aClass286_10098.method3866("WorldMatrix", (byte) 0);
		aClass285Array10069[0] = aClass286_10098.method3855("Unlit", (byte) -34);
		aClass285Array10069[1] = aClass286_10098.method3855("Unlit_IgnoreAlpha", (byte) -64);
		aClass285Array10069[17] = aClass286_10098.method3855("UnderwaterGround", (byte) -29);
		aClass285Array10069[18] = aClass286_10098.method3855("UnderwaterGroundSpecular", (byte) -29);
		for (int i = 0; i <= 4; i++) {
			aClass285Array10069[i + 2] = aClass286_10098.method3855(new StringBuilder().append("Standard_").append(i).append("PointLights").toString(), (byte) 45);
			aClass285Array10069[i + 7] = aClass286_10098.method3855(new StringBuilder().append("Specular_").append(i).append("PointLights").toString(), (byte) 48);
			aClass285Array10069[i + 12] = aClass286_10098.method3855(new StringBuilder().append("EnvironmentalMapping_").append(i).append("PointLights").toString(), (byte) -26);
		}
		for (int i = 0; i < 19; i++) {
			int i_53_ = aClass286_10098.method3894(aClass285Array10069[i], 572334415);
			anIntArrayArray10079[i][2] = class536_sub8_sub1.method10647(i_53_);
			anIntArrayArray10079[i][3] = class536_sub8_sub1_37_.method10647(i_53_);
			anIntArrayArray10079[i][1] = class536_sub8_sub1_38_.method10647(i_53_);
			anIntArrayArray10079[i][0] = class536_sub8_sub1_39_.method10647(i_53_);
			anIntArrayArray10079[i][4] = class536_sub8_sub1_40_.method10647(i_53_);
			anIntArrayArray10079[i][5] = class536_sub8_sub1_41_.method10647(i_53_);
			anIntArrayArray10079[i][7] = class536_sub8_sub1_42_.method10647(i_53_);
			anIntArrayArray10079[i][8] = class536_sub8_sub1_43_.method10647(i_53_);
			anIntArrayArray10079[i][9] = class536_sub8_sub1_44_.method10647(i_53_);
			anIntArrayArray10079[i][10] = class536_sub8_sub1_45_.method10647(i_53_);
			anIntArrayArray10079[i][11] = class536_sub8_sub1_46_.method10647(i_53_);
			anIntArrayArray10079[i][12] = class536_sub8_sub1_47_.method10647(i_53_);
			anIntArrayArray10079[i][13] = class536_sub8_sub1_48_.method10647(i_53_);
			anIntArrayArray10079[i][14] = class536_sub8_sub1_49_.method10647(i_53_);
			anIntArrayArray10079[i][6] = class536_sub8_sub1_50_.method10647(i_53_);
			anIntArrayArray10079[i][15] = class536_sub8_sub1_52_.method10647(i_53_);
			anIntArrayArray10079[i][16] = class536_sub8_sub1_51_.method10647(i_53_);
		}
		aClass286_10098.method3850(aClass285Array10069[2]);
		return true;
	}

	void method9195(int i) {
		aClass286_10098.method3865(anIntArray10071[2], 0, anInterface36_3569, 1785812475);
		aClass286_10098.method3864(anIntArray10071[4], aClass443_10077, -100229600);
		aClass286_10098.method3878(anIntArray10071[5], aClass443_3571, 1684563701);
		aClass286_10098.method3890(anIntArray10071[7], aClass427_3575.aFloat4813, aClass427_3575.aFloat4811, aClass427_3575.aFloat4814, aClass427_3575.aFloat4812, -1262073791);
		aClass286_10098.method3861(anIntArray10071[8], aClass436_3573.aFloat4850, aClass436_3573.aFloat4852, aClass436_3573.aFloat4853, 1891560392);
		aClass286_10098.method3890(anIntArray10071[9], aClass427_3577.aFloat4813, aClass427_3577.aFloat4811, aClass427_3577.aFloat4814, aClass427_3577.aFloat4812, -1352408641);
		aClass286_10098.method3861(anIntArray10071[10], aClass436_3585.aFloat4850, aClass436_3585.aFloat4852, aClass436_3585.aFloat4853, 553952848);
		aClass286_10098.method3862(anIntArray10071[11], aClass436_3583, (byte) 8);
		aClass286_10098.method3862(anIntArray10071[12], aClass436_3580, (byte) 8);
		aClass286_10098.method3862(anIntArray10071[13], aClass436_3581, (byte) 8);
		aClass286_10098.method3862(anIntArray10071[14], aClass436_3566, (byte) 8);
		if (i > 0) {
			aClass286_10098.method3888(anIntArray10071[1], aFloatArray3568, 4 * i, (short) 1089);
			aClass286_10098.method3888(anIntArray10071[0], aFloatArray3567, 4 * i, (short) 1089);
		}
		aClass167_Sub3_3578.method8817(Class377.aClass377_3917, anInt3584, anInt3574, anInt3586, anInt3587);
	}

	void method9196(int i) {
		aClass286_10098.method3865(anIntArray10071[2], 0, anInterface36_3569, 1933344157);
		aClass286_10098.method3864(anIntArray10071[4], aClass443_10077, 1700859919);
		aClass286_10098.method3878(anIntArray10071[5], aClass443_3571, -127900537);
		aClass286_10098.method3890(anIntArray10071[7], aClass427_3575.aFloat4813, aClass427_3575.aFloat4811, aClass427_3575.aFloat4814, aClass427_3575.aFloat4812, -1641130458);
		aClass286_10098.method3861(anIntArray10071[8], aClass436_3573.aFloat4850, aClass436_3573.aFloat4852, aClass436_3573.aFloat4853, 886944106);
		aClass286_10098.method3890(anIntArray10071[9], aClass427_3577.aFloat4813, aClass427_3577.aFloat4811, aClass427_3577.aFloat4814, aClass427_3577.aFloat4812, -1307756604);
		aClass286_10098.method3861(anIntArray10071[10], aClass436_3585.aFloat4850, aClass436_3585.aFloat4852, aClass436_3585.aFloat4853, -406250360);
		aClass286_10098.method3862(anIntArray10071[11], aClass436_3583, (byte) 8);
		aClass286_10098.method3862(anIntArray10071[12], aClass436_3580, (byte) 8);
		aClass286_10098.method3862(anIntArray10071[13], aClass436_3581, (byte) 8);
		aClass286_10098.method3862(anIntArray10071[14], aClass436_3566, (byte) 8);
		if (i > 0) {
			aClass286_10098.method3888(anIntArray10071[1], aFloatArray3568, 4 * i, (short) 1089);
			aClass286_10098.method3888(anIntArray10071[0], aFloatArray3567, 4 * i, (short) 1089);
		}
		aClass167_Sub3_3578.method8817(Class377.aClass377_3917, anInt3584, anInt3574, anInt3586, anInt3587);
	}

	void method9197(int i) {
		aClass286_10098.method3865(anIntArray10071[2], 0, anInterface36_3569, 1862427460);
		aClass286_10098.method3864(anIntArray10071[4], aClass443_10077, 1891910202);
		aClass286_10098.method3878(anIntArray10071[5], aClass443_3571, 1915218932);
		aClass286_10098.method3890(anIntArray10071[7], aClass427_3575.aFloat4813, aClass427_3575.aFloat4811, aClass427_3575.aFloat4814, aClass427_3575.aFloat4812, -1932386376);
		aClass286_10098.method3861(anIntArray10071[8], aClass436_3573.aFloat4850, aClass436_3573.aFloat4852, aClass436_3573.aFloat4853, 984002851);
		aClass286_10098.method3890(anIntArray10071[9], aClass427_3577.aFloat4813, aClass427_3577.aFloat4811, aClass427_3577.aFloat4814, aClass427_3577.aFloat4812, -1859157932);
		aClass286_10098.method3861(anIntArray10071[10], aClass436_3585.aFloat4850, aClass436_3585.aFloat4852, aClass436_3585.aFloat4853, 26468054);
		aClass286_10098.method3862(anIntArray10071[11], aClass436_3583, (byte) 8);
		aClass286_10098.method3862(anIntArray10071[12], aClass436_3580, (byte) 8);
		aClass286_10098.method3862(anIntArray10071[13], aClass436_3581, (byte) 8);
		aClass286_10098.method3862(anIntArray10071[14], aClass436_3566, (byte) 8);
		if (i > 0) {
			aClass286_10098.method3888(anIntArray10071[1], aFloatArray3568, 4 * i, (short) 1089);
			aClass286_10098.method3888(anIntArray10071[0], aFloatArray3567, 4 * i, (short) 1089);
		}
		aClass167_Sub3_3578.method8817(Class377.aClass377_3917, anInt3584, anInt3574, anInt3586, anInt3587);
	}
}
