/* Class101 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class101 {
	Class427 aClass427_1188;
	Runnable aRunnable1189;
	Class176_Sub2[] aClass176_Sub2Array1190;
	boolean aBool1191;
	float aFloat1192 = 0.85F;
	float aFloat1193 = 1.0F - aFloat1192;
	int anInt1194 = 0;
	int anInt1195 = 0;
	boolean aBool1196 = false;
	Class119 aClass119_1197;
	int anInt1198;
	float aFloat1199;
	int[] anIntArray1200;
	Class432 aClass432_1201;
	float[] aFloatArray1202;
	Class432 aClass432_1203;
	Class427 aClass427_1204;
	int anInt1205 = 0;
	static final float aFloat1206 = 255.0F;
	float[] aFloatArray1207;
	float[] aFloatArray1208;
	Class180_Sub1 aClass180_Sub1_1209;
	float[] aFloatArray1210;
	int[] anIntArray1211;
	Class427 aClass427_1212;
	float[] aFloatArray1213;
	int[] anIntArray1214;
	int[] anIntArray1215;
	int[] anIntArray1216;
	int[] anIntArray1217;
	float aFloat1218;
	float aFloat1219;
	float aFloat1220;
	float aFloat1221;
	float aFloat1222;
	float aFloat1223;
	int anInt1224;
	float[] aFloatArray1225;
	Class176_Sub2[] aClass176_Sub2Array1226;
	boolean aBool1227;
	float[] aFloatArray1228;
	float[] aFloatArray1229;
	float[] aFloatArray1230;
	float[] aFloatArray1231;
	int[] anIntArray1232;
	float[] aFloatArray1233;

	Class101(Class180_Sub1 class180_sub1) {
		anInt1198 = 0;
		aBool1227 = true;
		aClass427_1212 = new Class427();
		aClass432_1201 = new Class432();
		aClass432_1203 = new Class432();
		aClass427_1188 = new Class427();
		aClass427_1204 = new Class427();
		anIntArray1232 = new int[Class176_Sub2.anInt9166];
		aFloatArray1207 = new float[Class176_Sub2.anInt9166];
		aFloatArray1208 = new float[Class176_Sub2.anInt9166];
		aFloatArray1213 = new float[Class176_Sub2.anInt9166];
		aFloatArray1210 = new float[Class176_Sub2.anInt9166];
		anIntArray1211 = new int[8];
		anIntArray1217 = new int[8];
		anIntArray1200 = new int[8];
		anIntArray1214 = new int[10000];
		anIntArray1215 = new int[10000];
		aFloat1221 = 1.0F;
		aFloat1222 = 0.0F;
		aFloat1223 = 1.0F;
		aFloatArray1225 = new float[2];
		aClass176_Sub2Array1226 = new Class176_Sub2[8];
		aClass176_Sub2Array1190 = new Class176_Sub2[8];
		aFloatArray1228 = new float[64];
		aFloatArray1229 = new float[64];
		aFloatArray1230 = new float[64];
		aFloatArray1231 = new float[64];
		aFloatArray1202 = new float[64];
		aFloatArray1233 = new float[3];
		aClass180_Sub1_1209 = class180_sub1;
		aClass119_1197 = new Class119(class180_sub1, this);
		for (int i = 0; i < 8; i++) {
			aClass176_Sub2Array1226[i] = new Class176_Sub2(aClass180_Sub1_1209);
			aClass176_Sub2Array1190[i] = new Class176_Sub2(aClass180_Sub1_1209);
		}
		anIntArray1216 = new int[Class176_Sub2.anInt9206];
		for (int i = 0; i < Class176_Sub2.anInt9206; i++)
			anIntArray1216[i] = -1;
	}

	void method1777(byte i) {
		aClass119_1197 = new Class119(aClass180_Sub1_1209, this);
	}

	void method1778(Runnable runnable, int i) {
		aRunnable1189 = runnable;
	}

	void method1779() {
		aClass119_1197 = new Class119(aClass180_Sub1_1209, this);
	}

	void method1780() {
		aClass119_1197 = new Class119(aClass180_Sub1_1209, this);
	}

	void method1781() {
		aClass119_1197 = new Class119(aClass180_Sub1_1209, this);
	}

	void method1782(Runnable runnable) {
		aRunnable1189 = runnable;
	}

	void method1783(Runnable runnable) {
		aRunnable1189 = runnable;
	}

	void method1784(Runnable runnable) {
		aRunnable1189 = runnable;
	}

	void method1785(Runnable runnable) {
		aRunnable1189 = runnable;
	}

	static void method1786(byte i) {
		Class702.anIntArray8817 = Class208_Sub16.method15628(2048, 35, 8, 8, 4, 0.4F, true, (short) 2048);
	}

	static final void method1787(Class243 class243, Class240 class240, Class665 class665, int i) {
		class243.aBool2610 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) == 1;
	}

	static final void method1788(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_0_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_1_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (1787760327 * client.aClass492ArrayArray11272[i_1_][i_0_].anInt5489);
	}

	static final void method1789(Class665 class665, short i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -899375681 * client.anInt11070;
	}

	static final void method1790(Class665 class665, int i) {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_2_, -639046044);
		Class240 class240 = Class183.aClass240Array2100[i_2_ >> 16];
		Class32.method943(class243, class240, class665, (byte) 2);
	}

	public static void method1791(int i, short i_3_) {
		if (client.anInt11048 * -1927019389 == 11) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4476, client.aClass109_11066.aClass2_1367, (byte) 19);
			class527_sub15.buffer.writeByte(i, -1206057939);
			client.aClass109_11066.method1969(class527_sub15, (byte) 1);
		}
	}
}
