/* Class107 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class107 {
	int[] anIntArray1276;
	float aFloat1277 = 0.85F;
	int[] anIntArray1278;
	boolean aBool1279;
	Class443 aClass443_1280;
	float aFloat1281 = 1.0F - aFloat1277;
	int anInt1282 = 0;
	int anInt1283 = 0;
	boolean aBool1284 = false;
	boolean aBool1285;
	Class167_Sub1 aClass167_Sub1_1286;
	int anInt1287 = 0;
	float[] aFloatArray1288;
	Class433 aClass433_1289;
	Class117 aClass117_1290;
	Class433 aClass433_1291;
	float[] aFloatArray1292;
	static final float aFloat1293 = 255.0F;
	int[] anIntArray1294;
	float[] aFloatArray1295;
	Class443 aClass443_1296;
	float[] aFloatArray1297;
	float[] aFloatArray1298;
	int[] anIntArray1299;
	int anInt1300;
	int[] anIntArray1301;
	int[] anIntArray1302;
	Class443 aClass443_1303;
	float[] aFloatArray1304;
	float aFloat1305;
	float aFloat1306;
	float aFloat1307;
	Runnable aRunnable1308;
	float aFloat1309;
	float aFloat1310;
	float aFloat1311;
	float[] aFloatArray1312;
	float[] aFloatArray1313;
	Class177_Sub3[] aClass177_Sub3Array1314;
	Class177_Sub3[] aClass177_Sub3Array1315;
	float[] aFloatArray1316;
	int anInt1317 = 0;
	float[] aFloatArray1318;
	float[] aFloatArray1319;
	float aFloat1320;
	int[] anIntArray1321;
	static String[] aStringArray1322;
	static IComponentDefinitions aClass251_1323;

	void method1431() {
		aClass117_1290 = new Class117(aClass167_Sub1_1286, this);
	}

	Class107(Class167_Sub1 class167_sub1) {
		aBool1285 = true;
		aClass443_1280 = new Class443();
		aClass433_1289 = new Class433();
		aClass433_1291 = new Class433();
		aClass443_1303 = new Class443();
		aClass443_1296 = new Class443();
		anIntArray1276 = new int[Class177_Sub3.anInt9729];
		aFloatArray1295 = new float[Class177_Sub3.anInt9729];
		aFloatArray1312 = new float[Class177_Sub3.anInt9729];
		aFloatArray1297 = new float[Class177_Sub3.anInt9729];
		aFloatArray1298 = new float[Class177_Sub3.anInt9729];
		anIntArray1299 = new int[8];
		anIntArray1294 = new int[8];
		anIntArray1301 = new int[8];
		anIntArray1302 = new int[10000];
		anIntArray1278 = new int[10000];
		aFloat1309 = 1.0F;
		aFloat1310 = 0.0F;
		aFloat1311 = 1.0F;
		aFloatArray1313 = new float[2];
		aClass177_Sub3Array1314 = new Class177_Sub3[8];
		aClass177_Sub3Array1315 = new Class177_Sub3[8];
		aFloatArray1316 = new float[64];
		aFloatArray1292 = new float[64];
		aFloatArray1318 = new float[64];
		aFloatArray1319 = new float[64];
		aFloatArray1288 = new float[64];
		aFloatArray1304 = new float[3];
		aClass167_Sub1_1286 = class167_sub1;
		aClass117_1290 = new Class117(class167_sub1, this);
		for (int i = 0; i < 8; i++) {
			aClass177_Sub3Array1314[i] = new Class177_Sub3(aClass167_Sub1_1286);
			aClass177_Sub3Array1315[i] = new Class177_Sub3(aClass167_Sub1_1286);
		}
		anIntArray1321 = new int[Class177_Sub3.anInt9730];
		for (int i = 0; i < Class177_Sub3.anInt9730; i++)
			anIntArray1321[i] = -1;
	}

	void method1432(Runnable runnable, byte i) {
		aRunnable1308 = runnable;
	}

	void method1433() {
		aClass117_1290 = new Class117(aClass167_Sub1_1286, this);
	}

	void method1434(int i) {
		aClass117_1290 = new Class117(aClass167_Sub1_1286, this);
	}

	void method1435() {
		aClass117_1290 = new Class117(aClass167_Sub1_1286, this);
	}

	static final void method1436(Class668 class668, short i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(i_0_, (byte) 39)).stackable * -1370184373) == 1 ? 1 : 0;
	}

	static final void method1437(Class668 class668, int i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(i_1_, (byte) -67)).value) * -680425497;
	}

	static final void method1438(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_2_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_3_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		if (-1 == i_2_ && -1 == i_3_)
			class251.aClass251_2553 = null;
		else
			class251.aClass251_2553 = Class527.method6429(i_2_, i_3_, (byte) 6);
	}
}
