/* Class176_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.memory.Stream;

import jaggl.OpenGL;

public class Class176_Sub1 extends Class176 {
	int[][] anIntArrayArray9028;
	short[] aShortArray9029;
	static final int anInt9030 = 1;
	static final int anInt9031 = 2;
	static final int anInt9032 = 4;
	static final int anInt9033 = 8;
	static final int anInt9034 = 16;
	Class180_Sub3 aClass180_Sub3_9035;
	int anInt9036;
	int anInt9037;
	byte aByte9038;
	short aShort9039;
	short aShort9040;
	Class158 aClass158_9041;
	int[][] anIntArrayArray9042;
	int anInt9043;
	static final int anInt9044 = 7;
	Class159[] aClass159Array9045;
	int[] anIntArray9046;
	int[] anIntArray9047;
	int[][] anIntArrayArray9048;
	short[] aShortArray9049;
	short[] aShortArray9050;
	int anInt9051;
	short[] aShortArray9052;
	int[] anIntArray9053;
	short aShort9054;
	short[] aShortArray9055;
	float[] aFloatArray9056;
	boolean aBool9057 = false;
	int anInt9058;
	int anInt9059;
	short[] aShortArray9060;
	byte[] aByteArray9061;
	short[] aShortArray9062;
	boolean aBool9063;
	int anInt9064;
	short[] aShortArray9065;
	Interface17 anInterface17_9066;
	short[] aShortArray9067;
	Class129 aClass129_9068;
	Class129 aClass129_9069;
	Class129 aClass129_9070;
	Class129 aClass129_9071;
	Class132 aClass132_9072;
	boolean aBool9073;
	int anInt9074;
	int anInt9075;
	short aShort9076;
	Interface15 anInterface15_9077;
	boolean aBool9078;
	int anInt9079;
	short aShort9080;
	short aShort9081;
	short aShort9082;
	static long[] aLongArray9083;
	static final int anInt9084 = 4;
	float[] aFloatArray9085;
	short aShort9086;
	int[] anIntArray9087;
	int[] anIntArray9088;
	short[] aShortArray9089;
	Class167[] aClass167Array9090;
	byte[] aByteArray9091;
	short[] aShortArray9092;
	Class150[] aClass150Array9093;
	Class130[] aClass130Array9094;
	short aShort9095;
	boolean aBool9096 = false;
	static float[] aFloatArray9097 = new float[2];
	static int[] anIntArray9098 = new int[8];
	static int[] anIntArray9099 = new int[8];
	static int[] anIntArray9100 = new int[8];
	static int anInt9101;
	static int anInt9102;
	static int anInt9103;
	static boolean aBool9104;

	public void method2863() {
		for (int i = 0; i < anInt9064; i++)
			anIntArray9047[i] = -anIntArray9047[i];
		for (int i = 0; i < anInt9059; i++)
			aShortArray9029[i] = (short) -aShortArray9029[i];
		for (int i = 0; i < anInt9058; i++) {
			short i_0_ = aShortArray9062[i];
			aShortArray9062[i] = aShortArray9050[i];
			aShortArray9050[i] = i_0_;
		}
		if (aClass129_9070 == null && aClass129_9069 != null)
			aClass129_9069.anInterface15_1547 = null;
		if (aClass129_9070 != null)
			aClass129_9070.anInterface15_1547 = null;
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		if (aClass132_9072 != null)
			aClass132_9072.anInterface17_1556 = null;
		aBool9078 = false;
	}

	public boolean method2913() {
		return aBool9096;
	}

	public int method3054() {
		if (!aBool9078)
			method14542();
		return aShort9080;
	}

	static byte[] method14536(byte[] is, int i) {
		byte[] is_1_ = new byte[i];
		System.arraycopy(is, 0, is_1_, 0, i);
		return is_1_;
	}

	static short[] method14537(short[] is, int i) {
		short[] is_2_ = new short[i];
		System.arraycopy(is, 0, is_2_, 0, i);
		return is_2_;
	}

	static float[] method14538(float[] fs, int i) {
		float[] fs_3_ = new float[i];
		System.arraycopy(fs, 0, fs_3_, 0, i);
		return fs_3_;
	}

	Class176_Sub1(Class180_Sub3 class180_sub3) {
		anInt9043 = 0;
		anInt9064 = 0;
		anInt9059 = 0;
		anInt9058 = 0;
		anInt9079 = 0;
		aBool9073 = true;
		aBool9078 = false;
		aBool9063 = false;
		aClass180_Sub3_9035 = class180_sub3;
		aClass129_9068 = new Class129(null, 5126, 3, 0);
		aClass129_9071 = new Class129(null, 5126, 2, 0);
		aClass129_9070 = new Class129(null, 5126, 3, 0);
		aClass129_9069 = new Class129(null, 5121, 4, 0);
		aClass132_9072 = new Class132();
	}

	public void method2941(int i) {
		anInt9036 = i;
		if (aClass158_9041 != null && (anInt9036 & 0x10000) == 0) {
			aShortArray9092 = aClass158_9041.aShortArray1735;
			aShortArray9052 = aClass158_9041.aShortArray1737;
			aShortArray9029 = aClass158_9041.aShortArray1736;
			aByteArray9091 = aClass158_9041.aByteArray1734;
			aClass158_9041 = null;
		}
		aBool9073 = true;
		method14571();
	}

	public void method2895() {
		if (anInt9059 > 0 && anInt9079 > 0) {
			method14548(false);
			if ((aByte9038 & 0x10) == 0 && aClass132_9072.anInterface17_1556 == null)
				method14582(false);
			method14571();
		}
	}

	public Class176 method2862(byte i, int i_4_, boolean bool) {
		boolean bool_5_ = false;
		Class176_Sub1 class176_sub1_6_;
		Class176_Sub1 class176_sub1_7_;
		if (i > 0 && i <= 8) {
			class176_sub1_7_ = aClass180_Sub3_9035.aClass176_Sub1Array9842[i - 1];
			class176_sub1_6_ = aClass180_Sub3_9035.aClass176_Sub1Array9718[i - 1];
			bool_5_ = true;
		} else
			class176_sub1_6_ = class176_sub1_7_ = new Class176_Sub1(aClass180_Sub3_9035);
		return method14539(class176_sub1_6_, class176_sub1_7_, i_4_, bool_5_, bool);
	}

	Class176 method14539(Class176_Sub1 class176_sub1_8_, Class176_Sub1 class176_sub1_9_, int i, boolean bool, boolean bool_10_) {
		class176_sub1_8_.aByte9038 = (byte) 0;
		class176_sub1_8_.anInt9036 = i;
		class176_sub1_8_.anInt9037 = anInt9037;
		class176_sub1_8_.aShort9039 = aShort9039;
		class176_sub1_8_.aShort9095 = aShort9095;
		class176_sub1_8_.anInt9043 = anInt9043;
		class176_sub1_8_.anInt9064 = anInt9064;
		class176_sub1_8_.anInt9059 = anInt9059;
		class176_sub1_8_.anInt9058 = anInt9058;
		class176_sub1_8_.anInt9079 = anInt9079;
		class176_sub1_8_.anInt9075 = anInt9075;
		if ((i & 0x100) != 0)
			class176_sub1_8_.aBool9057 = true;
		else
			class176_sub1_8_.aBool9057 = aBool9057;
		class176_sub1_8_.aBool9096 = aBool9096;
		boolean bool_11_ = Class134.method2186(i, anInt9037);
		boolean bool_12_ = Class134.method2187(i, anInt9037);
		boolean bool_13_ = Class134.method2229(i, anInt9037);
		boolean bool_14_ = bool_11_ | bool_12_ | bool_13_;
		if (bool_14_) {
			if (bool_11_) {
				if (class176_sub1_9_.anIntArray9053 == null || class176_sub1_9_.anIntArray9053.length < anInt9043)
					class176_sub1_8_.anIntArray9053 = class176_sub1_9_.anIntArray9053 = new int[anInt9043];
				else
					class176_sub1_8_.anIntArray9053 = class176_sub1_9_.anIntArray9053;
			} else
				class176_sub1_8_.anIntArray9053 = anIntArray9053;
			if (bool_12_) {
				if (class176_sub1_9_.anIntArray9046 == null || class176_sub1_9_.anIntArray9046.length < anInt9043)
					class176_sub1_8_.anIntArray9046 = class176_sub1_9_.anIntArray9046 = new int[anInt9043];
				else
					class176_sub1_8_.anIntArray9046 = class176_sub1_9_.anIntArray9046;
			} else
				class176_sub1_8_.anIntArray9046 = anIntArray9046;
			if (bool_13_) {
				if (class176_sub1_9_.anIntArray9047 == null || class176_sub1_9_.anIntArray9047.length < anInt9043)
					class176_sub1_8_.anIntArray9047 = class176_sub1_9_.anIntArray9047 = new int[anInt9043];
				else
					class176_sub1_8_.anIntArray9047 = class176_sub1_9_.anIntArray9047;
			} else
				class176_sub1_8_.anIntArray9047 = anIntArray9047;
			for (int i_15_ = 0; i_15_ < anInt9043; i_15_++) {
				if (bool_11_)
					class176_sub1_8_.anIntArray9053[i_15_] = anIntArray9053[i_15_];
				if (bool_12_)
					class176_sub1_8_.anIntArray9046[i_15_] = anIntArray9046[i_15_];
				if (bool_13_)
					class176_sub1_8_.anIntArray9047[i_15_] = anIntArray9047[i_15_];
			}
		} else {
			class176_sub1_8_.anIntArray9053 = anIntArray9053;
			class176_sub1_8_.anIntArray9046 = anIntArray9046;
			class176_sub1_8_.anIntArray9047 = anIntArray9047;
		}
		if (Class134.method2261(i, anInt9037)) {
			if (bool)
				class176_sub1_8_.aByte9038 |= 0x1;
			class176_sub1_8_.aClass129_9068 = class176_sub1_9_.aClass129_9068;
			class176_sub1_8_.aClass129_9068.aByte1544 = aClass129_9068.aByte1544;
			class176_sub1_8_.aClass129_9068.anInterface15_1547 = aClass129_9068.anInterface15_1547;
		} else if (Class134.method2215(i, anInt9037))
			class176_sub1_8_.aClass129_9068 = aClass129_9068;
		else
			class176_sub1_8_.aClass129_9068 = null;
		if (Class134.method2264(i, anInt9037)) {
			if (class176_sub1_9_.aShortArray9060 == null || class176_sub1_9_.aShortArray9060.length < anInt9058)
				class176_sub1_8_.aShortArray9060 = class176_sub1_9_.aShortArray9060 = new short[anInt9058];
			else
				class176_sub1_8_.aShortArray9060 = class176_sub1_9_.aShortArray9060;
			for (int i_16_ = 0; i_16_ < anInt9058; i_16_++)
				class176_sub1_8_.aShortArray9060[i_16_] = aShortArray9060[i_16_];
		} else
			class176_sub1_8_.aShortArray9060 = aShortArray9060;
		if (Class134.method2192(i, anInt9037)) {
			if (class176_sub1_9_.aByteArray9061 == null || class176_sub1_9_.aByteArray9061.length < anInt9058)
				class176_sub1_8_.aByteArray9061 = class176_sub1_9_.aByteArray9061 = new byte[anInt9058];
			else
				class176_sub1_8_.aByteArray9061 = class176_sub1_9_.aByteArray9061;
			for (int i_17_ = 0; i_17_ < anInt9058; i_17_++)
				class176_sub1_8_.aByteArray9061[i_17_] = aByteArray9061[i_17_];
		} else
			class176_sub1_8_.aByteArray9061 = aByteArray9061;
		if (Class134.method2260(i, anInt9037)) {
			if (bool)
				class176_sub1_8_.aByte9038 |= 0x2;
			class176_sub1_8_.aClass129_9069 = class176_sub1_9_.aClass129_9069;
			class176_sub1_8_.aClass129_9069.aByte1544 = aClass129_9069.aByte1544;
			class176_sub1_8_.aClass129_9069.anInterface15_1547 = aClass129_9069.anInterface15_1547;
		} else if (Class134.method2200(i, anInt9037))
			class176_sub1_8_.aClass129_9069 = aClass129_9069;
		else
			class176_sub1_8_.aClass129_9069 = null;
		if (Class134.method2190(i, anInt9037)) {
			if (class176_sub1_9_.aShortArray9092 == null || class176_sub1_9_.aShortArray9092.length < anInt9059) {
				int i_18_ = anInt9059;
				class176_sub1_8_.aShortArray9092 = class176_sub1_9_.aShortArray9092 = new short[i_18_];
				class176_sub1_8_.aShortArray9052 = class176_sub1_9_.aShortArray9052 = new short[i_18_];
				class176_sub1_8_.aShortArray9029 = class176_sub1_9_.aShortArray9029 = new short[i_18_];
			} else {
				class176_sub1_8_.aShortArray9092 = class176_sub1_9_.aShortArray9092;
				class176_sub1_8_.aShortArray9052 = class176_sub1_9_.aShortArray9052;
				class176_sub1_8_.aShortArray9029 = class176_sub1_9_.aShortArray9029;
			}
			if (aClass158_9041 != null) {
				if (class176_sub1_9_.aClass158_9041 == null)
					class176_sub1_9_.aClass158_9041 = new Class158();
				Class158 class158 = (class176_sub1_8_.aClass158_9041 = class176_sub1_9_.aClass158_9041);
				if (class158.aShortArray1735 == null || class158.aShortArray1735.length < anInt9059) {
					int i_19_ = anInt9059;
					class158.aShortArray1735 = new short[i_19_];
					class158.aShortArray1737 = new short[i_19_];
					class158.aShortArray1736 = new short[i_19_];
					class158.aByteArray1734 = new byte[i_19_];
				}
				for (int i_20_ = 0; i_20_ < anInt9059; i_20_++) {
					class176_sub1_8_.aShortArray9092[i_20_] = aShortArray9092[i_20_];
					class176_sub1_8_.aShortArray9052[i_20_] = aShortArray9052[i_20_];
					class176_sub1_8_.aShortArray9029[i_20_] = aShortArray9029[i_20_];
					class158.aShortArray1735[i_20_] = aClass158_9041.aShortArray1735[i_20_];
					class158.aShortArray1737[i_20_] = aClass158_9041.aShortArray1737[i_20_];
					class158.aShortArray1736[i_20_] = aClass158_9041.aShortArray1736[i_20_];
					class158.aByteArray1734[i_20_] = aClass158_9041.aByteArray1734[i_20_];
				}
			} else {
				for (int i_21_ = 0; i_21_ < anInt9059; i_21_++) {
					class176_sub1_8_.aShortArray9092[i_21_] = aShortArray9092[i_21_];
					class176_sub1_8_.aShortArray9052[i_21_] = aShortArray9052[i_21_];
					class176_sub1_8_.aShortArray9029[i_21_] = aShortArray9029[i_21_];
				}
			}
			class176_sub1_8_.aByteArray9091 = aByteArray9091;
		} else {
			class176_sub1_8_.aClass158_9041 = aClass158_9041;
			class176_sub1_8_.aShortArray9092 = aShortArray9092;
			class176_sub1_8_.aShortArray9052 = aShortArray9052;
			class176_sub1_8_.aShortArray9029 = aShortArray9029;
			class176_sub1_8_.aByteArray9091 = aByteArray9091;
		}
		if (Class134.method2243(i, anInt9037)) {
			if (bool)
				class176_sub1_8_.aByte9038 |= 0x4;
			class176_sub1_8_.aClass129_9070 = class176_sub1_9_.aClass129_9070;
			class176_sub1_8_.aClass129_9070.aByte1544 = aClass129_9070.aByte1544;
			class176_sub1_8_.aClass129_9070.anInterface15_1547 = aClass129_9070.anInterface15_1547;
		} else if (Class134.method2257(i, anInt9037))
			class176_sub1_8_.aClass129_9070 = aClass129_9070;
		else
			class176_sub1_8_.aClass129_9070 = null;
		if (Class134.method2287(i, anInt9037)) {
			if (class176_sub1_9_.aFloatArray9056 == null || class176_sub1_9_.aFloatArray9056.length < anInt9058) {
				int i_22_ = anInt9059;
				class176_sub1_8_.aFloatArray9056 = class176_sub1_9_.aFloatArray9056 = new float[i_22_];
				class176_sub1_8_.aFloatArray9085 = class176_sub1_9_.aFloatArray9085 = new float[i_22_];
			} else {
				class176_sub1_8_.aFloatArray9056 = class176_sub1_9_.aFloatArray9056;
				class176_sub1_8_.aFloatArray9085 = class176_sub1_9_.aFloatArray9085;
			}
			for (int i_23_ = 0; i_23_ < anInt9059; i_23_++) {
				class176_sub1_8_.aFloatArray9056[i_23_] = aFloatArray9056[i_23_];
				class176_sub1_8_.aFloatArray9085[i_23_] = aFloatArray9085[i_23_];
			}
		} else {
			class176_sub1_8_.aFloatArray9056 = aFloatArray9056;
			class176_sub1_8_.aFloatArray9085 = aFloatArray9085;
		}
		if (Class134.method2206(i, anInt9037)) {
			if (bool)
				class176_sub1_8_.aByte9038 |= 0x8;
			class176_sub1_8_.aClass129_9071 = class176_sub1_9_.aClass129_9071;
			class176_sub1_8_.aClass129_9071.aByte1544 = aClass129_9071.aByte1544;
			class176_sub1_8_.aClass129_9071.anInterface15_1547 = aClass129_9071.anInterface15_1547;
		} else if (Class134.method2201(i, anInt9037))
			class176_sub1_8_.aClass129_9071 = aClass129_9071;
		else
			class176_sub1_8_.aClass129_9071 = null;
		if (Class134.method2194(i, anInt9037)) {
			if (class176_sub1_9_.aShortArray9062 == null || class176_sub1_9_.aShortArray9062.length < anInt9058) {
				int i_24_ = anInt9058;
				class176_sub1_8_.aShortArray9062 = class176_sub1_9_.aShortArray9062 = new short[i_24_];
				class176_sub1_8_.aShortArray9055 = class176_sub1_9_.aShortArray9055 = new short[i_24_];
				class176_sub1_8_.aShortArray9050 = class176_sub1_9_.aShortArray9050 = new short[i_24_];
			} else {
				class176_sub1_8_.aShortArray9062 = class176_sub1_9_.aShortArray9062;
				class176_sub1_8_.aShortArray9055 = class176_sub1_9_.aShortArray9055;
				class176_sub1_8_.aShortArray9050 = class176_sub1_9_.aShortArray9050;
			}
			for (int i_25_ = 0; i_25_ < anInt9058; i_25_++) {
				class176_sub1_8_.aShortArray9062[i_25_] = aShortArray9062[i_25_];
				class176_sub1_8_.aShortArray9055[i_25_] = aShortArray9055[i_25_];
				class176_sub1_8_.aShortArray9050[i_25_] = aShortArray9050[i_25_];
			}
		} else {
			class176_sub1_8_.aShortArray9062 = aShortArray9062;
			class176_sub1_8_.aShortArray9055 = aShortArray9055;
			class176_sub1_8_.aShortArray9050 = aShortArray9050;
		}
		if (Class134.method2275(i, anInt9037)) {
			if (bool)
				class176_sub1_8_.aByte9038 |= 0x10;
			class176_sub1_8_.aClass132_9072 = class176_sub1_9_.aClass132_9072;
			class176_sub1_8_.aClass132_9072.anInterface17_1556 = aClass132_9072.anInterface17_1556;
		} else if (Class134.method2202(i, anInt9037))
			class176_sub1_8_.aClass132_9072 = aClass132_9072;
		else
			class176_sub1_8_.aClass132_9072 = null;
		if (Class134.method2251(i, anInt9037)) {
			if (class176_sub1_9_.aShortArray9065 == null || class176_sub1_9_.aShortArray9065.length < anInt9058) {
				int i_26_ = anInt9058;
				class176_sub1_8_.aShortArray9065 = class176_sub1_9_.aShortArray9065 = new short[i_26_];
			} else
				class176_sub1_8_.aShortArray9065 = class176_sub1_9_.aShortArray9065;
			for (int i_27_ = 0; i_27_ < anInt9058; i_27_++)
				class176_sub1_8_.aShortArray9065[i_27_] = aShortArray9065[i_27_];
		} else
			class176_sub1_8_.aShortArray9065 = aShortArray9065;
		if (Class134.method2209(i, anInt9037)) {
			if (class176_sub1_9_.aClass130Array9094 == null || class176_sub1_9_.aClass130Array9094.length < anInt9075) {
				int i_28_ = anInt9075;
				class176_sub1_8_.aClass130Array9094 = class176_sub1_9_.aClass130Array9094 = new Class130[i_28_];
				for (int i_29_ = 0; i_29_ < anInt9075; i_29_++)
					class176_sub1_8_.aClass130Array9094[i_29_] = aClass130Array9094[i_29_].method2176();
			} else {
				class176_sub1_8_.aClass130Array9094 = class176_sub1_9_.aClass130Array9094;
				for (int i_30_ = 0; i_30_ < anInt9075; i_30_++)
					class176_sub1_8_.aClass130Array9094[i_30_].method2177(aClass130Array9094[i_30_]);
			}
		} else
			class176_sub1_8_.aClass130Array9094 = aClass130Array9094;
		class176_sub1_8_.aClass150Array9093 = aClass150Array9093;
		if (aBool9078) {
			class176_sub1_8_.anInt9074 = anInt9074;
			class176_sub1_8_.anInt9051 = anInt9051;
			class176_sub1_8_.aShort9081 = aShort9081;
			class176_sub1_8_.aShort9082 = aShort9082;
			class176_sub1_8_.aShort9040 = aShort9040;
			class176_sub1_8_.aShort9080 = aShort9080;
			class176_sub1_8_.aShort9054 = aShort9054;
			class176_sub1_8_.aShort9076 = aShort9076;
			class176_sub1_8_.aBool9078 = true;
		} else
			class176_sub1_8_.aBool9078 = false;
		if (aBool9063) {
			class176_sub1_8_.aShort9086 = aShort9086;
			class176_sub1_8_.aBool9063 = true;
		} else
			class176_sub1_8_.aBool9063 = false;
		class176_sub1_8_.anIntArrayArray9048 = anIntArrayArray9048;
		class176_sub1_8_.anIntArrayArray9042 = anIntArrayArray9042;
		class176_sub1_8_.anIntArrayArray9028 = anIntArrayArray9028;
		class176_sub1_8_.aShortArray9089 = aShortArray9089;
		class176_sub1_8_.anIntArray9088 = anIntArray9088;
		class176_sub1_8_.aShortArray9049 = aShortArray9049;
		class176_sub1_8_.aShortArray9067 = aShortArray9067;
		class176_sub1_8_.anIntArray9087 = anIntArray9087;
		class176_sub1_8_.aClass167Array9090 = aClass167Array9090;
		class176_sub1_8_.aClass159Array9045 = aClass159Array9045;
		return class176_sub1_8_;
	}

	void method2927() {
		/* empty */
	}

	public int method2932() {
		if (!aBool9078)
			method14542();
		return aShort9082;
	}

	static final int method14540(int i, int i_31_) {
		i_31_ = i_31_ * (i & 0x7f) >> 7;
		if (i_31_ < 2)
			i_31_ = 2;
		else if (i_31_ > 126)
			i_31_ = 126;
		return (i & 0xff80) + i_31_;
	}

	void method14541() {
		if (anInt9079 != 0) {
			if (aByte9038 != 0)
				method14548(true);
			method14548(false);
			if (aClass132_9072 != null) {
				if (aClass132_9072.anInterface17_1556 == null)
					method14582((aByte9038 & 0x10) != 0);
				if (aClass132_9072.anInterface17_1556 != null) {
					aClass180_Sub3_9035.method15409(aClass129_9070 != null);
					aClass180_Sub3_9035.method15385(aClass129_9068, aClass129_9070, aClass129_9069, aClass129_9071);
					int i = anIntArray9087.length - 1;
					for (int i_32_ = 0; i_32_ < i; i_32_++) {
						int i_33_ = anIntArray9087[i_32_];
						int i_34_ = anIntArray9087[i_32_ + 1];
						int i_35_ = (aShortArray9065[i_33_] == -1 ? -1 : aShortArray9065[i_33_] & 0xffff);
						aClass180_Sub3_9035.method15398(i_35_, aClass129_9070 != null);
						aClass180_Sub3_9035.method15433((aClass132_9072.anInterface17_1556), 4, i_33_ * 3, (i_34_ - i_33_) * 3);
					}
				}
			}
			method14571();
		}
	}

	public void method2928() {
		if (anInt9059 > 0 && anInt9079 > 0) {
			method14548(false);
			if ((aByte9038 & 0x10) == 0 && aClass132_9072.anInterface17_1556 == null)
				method14582(false);
			method14571();
		}
	}

	public void method3015(int i, int i_36_, int i_37_) {
		for (int i_38_ = 0; i_38_ < anInt9064; i_38_++) {
			if (i != 0)
				anIntArray9053[i_38_] += i;
			if (i_36_ != 0)
				anIntArray9046[i_38_] += i_36_;
			if (i_37_ != 0)
				anIntArray9047[i_38_] += i_37_;
		}
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		aBool9078 = false;
	}

	public void method2864() {
		for (int i = 0; i < anInt9064; i++)
			anIntArray9047[i] = -anIntArray9047[i];
		for (int i = 0; i < anInt9059; i++)
			aShortArray9029[i] = (short) -aShortArray9029[i];
		for (int i = 0; i < anInt9058; i++) {
			short i_39_ = aShortArray9062[i];
			aShortArray9062[i] = aShortArray9050[i];
			aShortArray9050[i] = i_39_;
		}
		if (aClass129_9070 == null && aClass129_9069 != null)
			aClass129_9069.anInterface15_1547 = null;
		if (aClass129_9070 != null)
			aClass129_9070.anInterface15_1547 = null;
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		if (aClass132_9072 != null)
			aClass132_9072.anInterface17_1556 = null;
		aBool9078 = false;
	}

	public void method2872(int i, int i_40_, int i_41_) {
		for (int i_42_ = 0; i_42_ < anInt9064; i_42_++) {
			if (i != 128)
				anIntArray9053[i_42_] = anIntArray9053[i_42_] * i >> 7;
			if (i_40_ != 128)
				anIntArray9046[i_42_] = anIntArray9046[i_42_] * i_40_ >> 7;
			if (i_41_ != 128)
				anIntArray9047[i_42_] = anIntArray9047[i_42_] * i_41_ >> 7;
		}
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		aBool9078 = false;
	}

	public void method2873(int i, int i_43_, Class161 class161, Class161 class161_44_, int i_45_, int i_46_, int i_47_) {
		if (!aBool9078)
			method14542();
		int i_48_ = i_45_ + aShort9081;
		int i_49_ = i_45_ + aShort9082;
		int i_50_ = i_47_ + aShort9054;
		int i_51_ = i_47_ + aShort9076;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_48_ >= 0 && ((i_49_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1750 * 1210322533) && i_50_ >= 0 && ((i_51_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1751 * -533476177))) {
			if (i == 4 || i == 5) {
				if (class161_44_ == null || (i_48_ < 0 || ((i_49_ + class161_44_.anInt1752 * 1048375491 >> class161_44_.anInt1753 * 1252000143) >= class161_44_.anInt1750 * 1210322533) || i_50_ < 0 || ((i_51_ + class161_44_.anInt1752 * 1048375491 >> class161_44_.anInt1753 * 1252000143) >= class161_44_.anInt1751 * -533476177)))
					return;
			} else {
				i_48_ >>= class161.anInt1753 * 1252000143;
				i_49_ = (i_49_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				i_50_ >>= class161.anInt1753 * 1252000143;
				i_51_ = (i_51_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				if (class161.method2595(i_48_, i_50_, (byte) 11) == i_46_ && class161.method2595(i_49_, i_50_, (byte) 20) == i_46_ && class161.method2595(i_48_, i_51_, (byte) 72) == i_46_ && class161.method2595(i_49_, i_51_, (byte) 113) == i_46_)
					return;
			}
			if (i == 1) {
				for (int i_52_ = 0; i_52_ < anInt9064; i_52_++)
					anIntArray9046[i_52_] = (anIntArray9046[i_52_] + class161.method2619(anIntArray9053[i_52_] + i_45_, anIntArray9047[i_52_] + i_47_, 1582361761) - i_46_);
			} else if (i == 2) {
				int i_53_ = aShort9040;
				if (i_53_ == 0)
					return;
				for (int i_54_ = 0; i_54_ < anInt9064; i_54_++) {
					int i_55_ = (anIntArray9046[i_54_] << 16) / i_53_;
					if (i_55_ < i_43_)
						anIntArray9046[i_54_] = (anIntArray9046[i_54_] + (class161.method2619((anIntArray9053[i_54_] + i_45_), (anIntArray9047[i_54_] + i_47_), -599034062) - i_46_) * (i_43_ - i_55_) / i_43_);
				}
			} else if (i == 3) {
				int i_56_ = (i_43_ & 0xff) * 16;
				int i_57_ = (i_43_ >> 8 & 0xff) * 16;
				int i_58_ = (i_43_ >> 16 & 0xff) << 6;
				int i_59_ = (i_43_ >> 24 & 0xff) << 6;
				if (i_45_ - (i_56_ >> 1) < 0 || (i_45_ + (i_56_ >> 1) + class161.anInt1752 * 1048375491 >= (class161.anInt1750 * 1210322533 << class161.anInt1753 * 1252000143)) || i_47_ - (i_57_ >> 1) < 0 || (i_47_ + (i_57_ >> 1) + class161.anInt1752 * 1048375491 >= (class161.anInt1751 * -533476177 << class161.anInt1753 * 1252000143)))
					return;
				method2962(class161, i_45_, i_46_, i_47_, i_56_, i_57_, i_58_, i_59_);
			} else if (i == 4) {
				int i_60_ = aShort9080 - aShort9040;
				for (int i_61_ = 0; i_61_ < anInt9064; i_61_++)
					anIntArray9046[i_61_] = (anIntArray9046[i_61_] + (class161_44_.method2619((anIntArray9053[i_61_] + i_45_), (anIntArray9047[i_61_] + i_47_), 1052291079) - i_46_) + i_60_);
			} else if (i == 5) {
				int i_62_ = aShort9080 - aShort9040;
				for (int i_63_ = 0; i_63_ < anInt9064; i_63_++) {
					int i_64_ = anIntArray9053[i_63_] + i_45_;
					int i_65_ = anIntArray9047[i_63_] + i_47_;
					int i_66_ = class161.method2619(i_64_, i_65_, 26405027);
					int i_67_ = class161_44_.method2619(i_64_, i_65_, 531374064);
					int i_68_ = i_66_ - i_67_ - i_43_;
					anIntArray9046[i_63_] = (((anIntArray9046[i_63_] << 8) / i_62_ * i_68_ >> 8) - (i_46_ - i_66_));
				}
			}
			if (aClass129_9068 != null)
				aClass129_9068.anInterface15_1547 = null;
			aBool9078 = false;
		}
	}

	void method14542() {
		int i = 32767;
		int i_69_ = 32767;
		int i_70_ = 32767;
		int i_71_ = -32768;
		int i_72_ = -32768;
		int i_73_ = -32768;
		int i_74_ = 0;
		int i_75_ = 0;
		for (int i_76_ = 0; i_76_ < anInt9064; i_76_++) {
			int i_77_ = anIntArray9053[i_76_];
			int i_78_ = anIntArray9046[i_76_];
			int i_79_ = anIntArray9047[i_76_];
			if (i_77_ < i)
				i = i_77_;
			if (i_77_ > i_71_)
				i_71_ = i_77_;
			if (i_78_ < i_69_)
				i_69_ = i_78_;
			if (i_78_ > i_72_)
				i_72_ = i_78_;
			if (i_79_ < i_70_)
				i_70_ = i_79_;
			if (i_79_ > i_73_)
				i_73_ = i_79_;
			int i_80_ = i_77_ * i_77_ + i_79_ * i_79_;
			if (i_80_ > i_74_)
				i_74_ = i_80_;
			i_80_ = i_77_ * i_77_ + i_79_ * i_79_ + i_78_ * i_78_;
			if (i_80_ > i_75_)
				i_75_ = i_80_;
		}
		aShort9081 = (short) i;
		aShort9082 = (short) i_71_;
		aShort9040 = (short) i_69_;
		aShort9080 = (short) i_72_;
		aShort9054 = (short) i_70_;
		aShort9076 = (short) i_73_;
		anInt9051 = (int) (Math.sqrt((double) i_74_) + 0.99);
		anInt9074 = (int) (Math.sqrt((double) i_75_) + 0.99);
		aBool9078 = true;
	}

	public void method3018(int i) {
		int i_81_ = Class428.anIntArray4825[i];
		int i_82_ = Class428.anIntArray4819[i];
		for (int i_83_ = 0; i_83_ < anInt9064; i_83_++) {
			int i_84_ = ((anIntArray9046[i_83_] * i_82_ - anIntArray9047[i_83_] * i_81_) >> 14);
			anIntArray9047[i_83_] = (anIntArray9046[i_83_] * i_81_ + anIntArray9047[i_83_] * i_82_) >> 14;
			anIntArray9046[i_83_] = i_84_;
		}
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		aBool9078 = false;
	}

	void method14543() {
		if (anInt9079 != 0) {
			if (aByte9038 != 0)
				method14548(true);
			method14548(false);
			if (aClass132_9072 != null) {
				if (aClass132_9072.anInterface17_1556 == null)
					method14582((aByte9038 & 0x10) != 0);
				if (aClass132_9072.anInterface17_1556 != null) {
					aClass180_Sub3_9035.method15409(aClass129_9070 != null);
					aClass180_Sub3_9035.method15385(aClass129_9068, aClass129_9070, aClass129_9069, aClass129_9071);
					int i = anIntArray9087.length - 1;
					for (int i_85_ = 0; i_85_ < i; i_85_++) {
						int i_86_ = anIntArray9087[i_85_];
						int i_87_ = anIntArray9087[i_85_ + 1];
						int i_88_ = (aShortArray9065[i_86_] == -1 ? -1 : aShortArray9065[i_86_] & 0xffff);
						aClass180_Sub3_9035.method15398(i_88_, aClass129_9070 != null);
						aClass180_Sub3_9035.method15433((aClass132_9072.anInterface17_1556), 4, i_86_ * 3, (i_87_ - i_86_) * 3);
					}
				}
			}
			method14571();
		}
	}

	public int method2893() {
		if (!aBool9078)
			method14542();
		return anInt9074;
	}

	public Class176 method3043(byte i, int i_89_, boolean bool) {
		boolean bool_90_ = false;
		Class176_Sub1 class176_sub1_91_;
		Class176_Sub1 class176_sub1_92_;
		if (i > 0 && i <= 8) {
			class176_sub1_92_ = aClass180_Sub3_9035.aClass176_Sub1Array9842[i - 1];
			class176_sub1_91_ = aClass180_Sub3_9035.aClass176_Sub1Array9718[i - 1];
			bool_90_ = true;
		} else
			class176_sub1_91_ = class176_sub1_92_ = new Class176_Sub1(aClass180_Sub3_9035);
		return method14539(class176_sub1_91_, class176_sub1_92_, i_89_, bool_90_, bool);
	}

	public int method2939() {
		if (!aBool9078)
			method14542();
		return aShort9082;
	}

	public int method2896() {
		if (!aBool9078)
			method14542();
		return aShort9040;
	}

	public void method2907(short i, short i_93_) {
		for (int i_94_ = 0; i_94_ < anInt9058; i_94_++) {
			if (aShortArray9060[i_94_] == i)
				aShortArray9060[i_94_] = i_93_;
		}
		if (aClass150Array9093 != null) {
			for (int i_95_ = 0; i_95_ < anInt9075; i_95_++) {
				Class150 class150 = aClass150Array9093[i_95_];
				Class130 class130 = aClass130Array9094[i_95_];
				class130.anInt1553 = (class130.anInt1553 & ~0xffffff | ((Class656.anIntArray8390[aShortArray9060[class150.anInt1682] & 0xffff]) & 0xffffff));
			}
		}
		if (aClass129_9069 != null)
			aClass129_9069.anInterface15_1547 = null;
	}

	public int method2898() {
		if (!aBool9078)
			method14542();
		return aShort9054;
	}

	public byte[] method2900() {
		return aByteArray9061;
	}

	public void method2909(short i, short i_96_) {
		Class181 class181 = aClass180_Sub3_9035.aClass181_2059;
		for (int i_97_ = 0; i_97_ < anInt9058; i_97_++) {
			if (aShortArray9065[i_97_] == i)
				aShortArray9065[i_97_] = i_96_;
		}
		byte i_98_ = 0;
		byte i_99_ = 0;
		if (i != -1) {
			Class163 class163 = class181.method3544(i & 0xffff, (byte) -24);
			i_98_ = class163.aByte1808;
			i_99_ = class163.aByte1802;
		}
		byte i_100_ = 0;
		byte i_101_ = 0;
		if (i_96_ != -1) {
			Class163 class163 = class181.method3544(i_96_ & 0xffff, (byte) -122);
			i_100_ = class163.aByte1808;
			i_101_ = class163.aByte1802;
			if (class163.aByte1781 != 0 || class163.aByte1797 != 0)
				aBool9096 = true;
		}
		if (i_98_ != i_100_ | i_99_ != i_101_) {
			if (aClass150Array9093 != null) {
				for (int i_102_ = 0; i_102_ < anInt9075; i_102_++) {
					Class150 class150 = aClass150Array9093[i_102_];
					Class130 class130 = aClass130Array9094[i_102_];
					class130.anInt1553 = (class130.anInt1553 & ~0xffffff | ((Class656.anIntArray8390[aShortArray9060[class150.anInt1682] & 0xffff]) & 0xffffff));
				}
			}
			if (aClass129_9069 != null)
				aClass129_9069.anInterface15_1547 = null;
		}
	}

	public void method2881(Class176 class176, int i, int i_103_, int i_104_, boolean bool) {
		Class176_Sub1 class176_sub1_105_ = (Class176_Sub1) class176;
		if (anInt9058 != 0 && class176_sub1_105_.anInt9058 != 0) {
			int i_106_ = class176_sub1_105_.anInt9064;
			int[] is = class176_sub1_105_.anIntArray9053;
			int[] is_107_ = class176_sub1_105_.anIntArray9046;
			int[] is_108_ = class176_sub1_105_.anIntArray9047;
			short[] is_109_ = class176_sub1_105_.aShortArray9092;
			short[] is_110_ = class176_sub1_105_.aShortArray9052;
			short[] is_111_ = class176_sub1_105_.aShortArray9029;
			byte[] is_112_ = class176_sub1_105_.aByteArray9091;
			short[] is_113_;
			short[] is_114_;
			short[] is_115_;
			byte[] is_116_;
			if (aClass158_9041 != null) {
				is_113_ = aClass158_9041.aShortArray1735;
				is_114_ = aClass158_9041.aShortArray1737;
				is_115_ = aClass158_9041.aShortArray1736;
				is_116_ = aClass158_9041.aByteArray1734;
			} else {
				is_113_ = null;
				is_114_ = null;
				is_115_ = null;
				is_116_ = null;
			}
			short[] is_117_;
			short[] is_118_;
			short[] is_119_;
			byte[] is_120_;
			if (class176_sub1_105_.aClass158_9041 != null) {
				is_117_ = class176_sub1_105_.aClass158_9041.aShortArray1735;
				is_118_ = class176_sub1_105_.aClass158_9041.aShortArray1737;
				is_119_ = class176_sub1_105_.aClass158_9041.aShortArray1736;
				is_120_ = class176_sub1_105_.aClass158_9041.aByteArray1734;
			} else {
				is_117_ = null;
				is_118_ = null;
				is_119_ = null;
				is_120_ = null;
			}
			int[] is_121_ = class176_sub1_105_.anIntArray9088;
			short[] is_122_ = class176_sub1_105_.aShortArray9089;
			if (!class176_sub1_105_.aBool9078)
				class176_sub1_105_.method14542();
			int i_123_ = class176_sub1_105_.aShort9040;
			int i_124_ = class176_sub1_105_.aShort9080;
			int i_125_ = class176_sub1_105_.aShort9081;
			int i_126_ = class176_sub1_105_.aShort9082;
			int i_127_ = class176_sub1_105_.aShort9054;
			int i_128_ = class176_sub1_105_.aShort9076;
			for (int i_129_ = 0; i_129_ < anInt9064; i_129_++) {
				int i_130_ = anIntArray9046[i_129_] - i_103_;
				if (i_130_ >= i_123_ && i_130_ <= i_124_) {
					int i_131_ = anIntArray9053[i_129_] - i;
					if (i_131_ >= i_125_ && i_131_ <= i_126_) {
						int i_132_ = anIntArray9047[i_129_] - i_104_;
						if (i_132_ >= i_127_ && i_132_ <= i_128_) {
							int i_133_ = -1;
							int i_134_ = anIntArray9088[i_129_];
							int i_135_ = anIntArray9088[i_129_ + 1];
							for (int i_136_ = i_134_; (i_136_ < i_135_ && aShortArray9089[i_136_] != 0); i_136_++) {
								i_133_ = (aShortArray9089[i_136_] & 0xffff) - 1;
								if (aByteArray9091[i_133_] != 0)
									break;
							}
							if (i_133_ != -1) {
								for (int i_137_ = 0; i_137_ < i_106_; i_137_++) {
									if (i_131_ == is[i_137_] && i_132_ == is_108_[i_137_] && i_130_ == is_107_[i_137_]) {
										int i_138_ = -1;
										i_134_ = is_121_[i_137_];
										i_135_ = is_121_[i_137_ + 1];
										for (int i_139_ = i_134_; (i_139_ < i_135_ && is_122_[i_139_] != 0); i_139_++) {
											i_138_ = (is_122_[i_139_] & 0xffff) - 1;
											if (is_112_[i_138_] != 0)
												break;
										}
										if (i_138_ != -1) {
											if (is_113_ == null) {
												aClass158_9041 = new Class158();
												is_113_ = aClass158_9041.aShortArray1735 = (Class214.method3900(aShortArray9092, -2115349236));
												is_114_ = aClass158_9041.aShortArray1737 = (Class214.method3900(aShortArray9052, -1748221209));
												is_115_ = aClass158_9041.aShortArray1736 = (Class214.method3900(aShortArray9029, -2134384918));
												is_116_ = aClass158_9041.aByteArray1734 = (Class332.method5837(aByteArray9091, 838108686));
											}
											if (is_117_ == null) {
												Class158 class158 = (class176_sub1_105_.aClass158_9041 = new Class158());
												is_117_ = class158.aShortArray1735 = (Class214.method3900(is_109_, -1783425441));
												is_118_ = class158.aShortArray1737 = (Class214.method3900(is_110_, -1892758813));
												is_119_ = class158.aShortArray1736 = (Class214.method3900(is_111_, -1777947426));
												is_120_ = class158.aByteArray1734 = (Class332.method5837(is_112_, 719444914));
											}
											short i_140_ = aShortArray9092[i_133_];
											short i_141_ = aShortArray9052[i_133_];
											short i_142_ = aShortArray9029[i_133_];
											byte i_143_ = aByteArray9091[i_133_];
											i_134_ = is_121_[i_137_];
											i_135_ = is_121_[i_137_ + 1];
											for (int i_144_ = i_134_; i_144_ < i_135_; i_144_++) {
												int i_145_ = is_122_[i_144_] - 1;
												if (i_145_ == -1)
													break;
												if (is_120_[i_145_] != 0) {
													is_117_[i_145_] += i_140_;
													is_118_[i_145_] += i_141_;
													is_119_[i_145_] += i_142_;
													is_120_[i_145_] += i_143_;
												}
											}
											i_140_ = is_109_[i_138_];
											i_141_ = is_110_[i_138_];
											i_142_ = is_111_[i_138_];
											i_143_ = is_112_[i_138_];
											i_134_ = anIntArray9088[i_129_];
											i_135_ = anIntArray9088[i_129_ + 1];
											for (int i_146_ = i_134_; (i_146_ < i_135_ && (aShortArray9089[i_146_] != 0)); i_146_++) {
												int i_147_ = ((aShortArray9089[i_146_] & 0xffff) - 1);
												if (is_116_[i_147_] != 0) {
													is_113_[i_147_] += i_140_;
													is_114_[i_147_] += i_141_;
													is_115_[i_147_] += i_142_;
													is_116_[i_147_] += i_143_;
												}
											}
											if (aClass129_9070 == null && aClass129_9069 != null)
												aClass129_9069.anInterface15_1547 = null;
											if (aClass129_9070 != null)
												aClass129_9070.anInterface15_1547 = null;
											if ((class176_sub1_105_.aClass129_9070) == null && (class176_sub1_105_.aClass129_9069) != null)
												class176_sub1_105_.aClass129_9069.anInterface15_1547 = null;
											if ((class176_sub1_105_.aClass129_9070) != null)
												class176_sub1_105_.aClass129_9070.anInterface15_1547 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void method3000(int i) {
		int i_148_ = Class428.anIntArray4825[i];
		int i_149_ = Class428.anIntArray4819[i];
		for (int i_150_ = 0; i_150_ < anInt9064; i_150_++) {
			int i_151_ = ((anIntArray9046[i_150_] * i_148_ + anIntArray9053[i_150_] * i_149_) >> 14);
			anIntArray9046[i_150_] = (anIntArray9046[i_150_] * i_149_ - anIntArray9053[i_150_] * i_148_) >> 14;
			anIntArray9053[i_150_] = i_151_;
		}
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		aBool9078 = false;
	}

	public void method2903(int i) {
		aShort9095 = (short) i;
		if (aClass129_9069 != null)
			aClass129_9069.anInterface15_1547 = null;
		if (aClass129_9070 != null)
			aClass129_9070.anInterface15_1547 = null;
	}

	public void method2935(int i) {
		int i_152_ = Class428.anIntArray4825[i];
		int i_153_ = Class428.anIntArray4819[i];
		for (int i_154_ = 0; i_154_ < anInt9064; i_154_++) {
			int i_155_ = ((anIntArray9046[i_154_] * i_152_ + anIntArray9053[i_154_] * i_153_) >> 14);
			anIntArray9046[i_154_] = (anIntArray9046[i_154_] * i_153_ - anIntArray9053[i_154_] * i_152_) >> 14;
			anIntArray9053[i_154_] = i_155_;
		}
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		aBool9078 = false;
	}

	public Class176 method2922(byte i, int i_156_, boolean bool) {
		boolean bool_157_ = false;
		Class176_Sub1 class176_sub1_158_;
		Class176_Sub1 class176_sub1_159_;
		if (i > 0 && i <= 8) {
			class176_sub1_159_ = aClass180_Sub3_9035.aClass176_Sub1Array9842[i - 1];
			class176_sub1_158_ = aClass180_Sub3_9035.aClass176_Sub1Array9718[i - 1];
			bool_157_ = true;
		} else
			class176_sub1_158_ = class176_sub1_159_ = new Class176_Sub1(aClass180_Sub3_9035);
		return method14539(class176_sub1_158_, class176_sub1_159_, i_156_, bool_157_, bool);
	}

	void method14544(boolean bool) {
		if ((aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819.buffer).length < anInt9079 * 6)
			aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819 = new Class527_Sub38_Sub1((anInt9079 + 100) * 6);
		else
			aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819.anInt10689 = 0;
		Class527_Sub38_Sub1 class527_sub38_sub1 = aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819;
		if (aClass180_Sub3_9035.aBool9788) {
			for (int i = 0; i < anInt9079; i++) {
				class527_sub38_sub1.writeShort(aShortArray9062[i], 1404835786);
				class527_sub38_sub1.writeShort(aShortArray9055[i], 1404835786);
				class527_sub38_sub1.writeShort(aShortArray9050[i], 1404835786);
			}
		} else {
			for (int i = 0; i < anInt9079; i++) {
				class527_sub38_sub1.writeShortLE(aShortArray9062[i], 718055997);
				class527_sub38_sub1.writeShortLE(aShortArray9055[i], 699242133);
				class527_sub38_sub1.writeShortLE(aShortArray9050[i], -684746322);
			}
		}
		if (class527_sub38_sub1.anInt10689 * -441238943 != 0) {
			if (bool) {
				if (anInterface17_9066 == null)
					anInterface17_9066 = (aClass180_Sub3_9035.method15434(5123, class527_sub38_sub1.buffer, class527_sub38_sub1.anInt10689 * -441238943, true));
				else
					anInterface17_9066.method98(5123, (class527_sub38_sub1.buffer), (class527_sub38_sub1.anInt10689 * -441238943));
				aClass132_9072.anInterface17_1556 = anInterface17_9066;
			} else
				aClass132_9072.anInterface17_1556 = (aClass180_Sub3_9035.method15434(5123, class527_sub38_sub1.buffer, class527_sub38_sub1.anInt10689 * -441238943, false));
			if (!bool)
				aBool9073 = true;
		}
	}

	boolean method2883() {
		if (anIntArrayArray9048 == null)
			return false;
		for (int i = 0; i < anInt9043; i++) {
			anIntArray9053[i] <<= 4;
			anIntArray9046[i] <<= 4;
			anIntArray9047[i] <<= 4;
		}
		anInt9101 = 0;
		anInt9102 = 0;
		anInt9103 = 0;
		return true;
	}

	public void method2908(byte i, byte[] is) {
		if (is == null) {
			for (int i_160_ = 0; i_160_ < anInt9058; i_160_++)
				aByteArray9061[i_160_] = i;
		} else {
			for (int i_161_ = 0; i_161_ < anInt9058; i_161_++) {
				int i_162_ = 255 - ((255 - (is[i_161_] & 0xff)) * (255 - (i & 0xff)) / 255);
				aByteArray9061[i_161_] = (byte) i_162_;
			}
		}
		if (aClass129_9069 != null)
			aClass129_9069.anInterface15_1547 = null;
	}

	static byte[] method14545(byte[] is, int i) {
		byte[] is_163_ = new byte[i];
		System.arraycopy(is, 0, is_163_, 0, i);
		return is_163_;
	}

	public void method2986(int i, int i_164_, int i_165_, int i_166_) {
		for (int i_167_ = 0; i_167_ < anInt9058; i_167_++) {
			int i_168_ = aShortArray9060[i_167_] & 0xffff;
			int i_169_ = i_168_ >> 10 & 0x3f;
			int i_170_ = i_168_ >> 7 & 0x7;
			int i_171_ = i_168_ & 0x7f;
			if (i != -1)
				i_169_ += (i - i_169_) * i_166_ >> 7;
			if (i_164_ != -1)
				i_170_ += (i_164_ - i_170_) * i_166_ >> 7;
			if (i_165_ != -1)
				i_171_ += (i_165_ - i_171_) * i_166_ >> 7;
			aShortArray9060[i_167_] = (short) (i_169_ << 10 | i_170_ << 7 | i_171_);
		}
		if (aClass150Array9093 != null) {
			for (int i_172_ = 0; i_172_ < anInt9075; i_172_++) {
				Class150 class150 = aClass150Array9093[i_172_];
				Class130 class130 = aClass130Array9094[i_172_];
				class130.anInt1553 = (class130.anInt1553 & ~0xffffff | ((Class656.anIntArray8390[aShortArray9060[class150.anInt1682] & 0xffff]) & 0xffffff));
			}
		}
		if (aClass129_9069 != null)
			aClass129_9069.anInterface15_1547 = null;
	}

	public boolean method3035() {
		if (aShortArray9065 == null)
			return true;
		for (int i = 0; i < aShortArray9065.length; i++) {
			if (aShortArray9065[i] != -1) {
				Class163 class163 = aClass180_Sub3_9035.aClass181_2059.method3544(aShortArray9065[i] & 0xffff, (byte) -12);
				if (class163.aBool1761 && !aClass180_Sub3_9035.aClass155_9694.method2540(Class609.aClass609_7996, class163, -1))
					return false;
			}
		}
		return true;
	}

	public boolean method2949() {
		return aBool9057;
	}

	public void method3019(int i) {
		aShort9039 = (short) i;
		if (aClass129_9069 != null)
			aClass129_9069.anInterface15_1547 = null;
	}

	void method2875() {
		/* empty */
	}

	void method2984() {
		/* empty */
	}

	public Class167[] method2915() {
		return aClass167Array9090;
	}

	void method2885(int i, int[] is, int i_173_, int i_174_, int i_175_, boolean bool, int i_176_, int[] is_177_) {
		int i_178_ = is.length;
		if (i == 0) {
			i_173_ <<= 4;
			i_174_ <<= 4;
			i_175_ <<= 4;
			int i_179_ = 0;
			anInt9101 = 0;
			anInt9102 = 0;
			anInt9103 = 0;
			for (int i_180_ = 0; i_180_ < i_178_; i_180_++) {
				int i_181_ = is[i_180_];
				if (i_181_ < anIntArrayArray9048.length) {
					int[] is_182_ = anIntArrayArray9048[i_181_];
					for (int i_183_ = 0; i_183_ < is_182_.length; i_183_++) {
						int i_184_ = is_182_[i_183_];
						if (aShortArray9049 == null || (i_176_ & aShortArray9049[i_184_]) != 0) {
							anInt9101 += anIntArray9053[i_184_];
							anInt9102 += anIntArray9046[i_184_];
							anInt9103 += anIntArray9047[i_184_];
							i_179_++;
						}
					}
				}
			}
			if (i_179_ > 0) {
				anInt9101 = anInt9101 / i_179_ + i_173_;
				anInt9102 = anInt9102 / i_179_ + i_174_;
				anInt9103 = anInt9103 / i_179_ + i_175_;
				aBool9104 = true;
			} else {
				anInt9101 = i_173_;
				anInt9102 = i_174_;
				anInt9103 = i_175_;
			}
		} else if (i == 1) {
			if (is_177_ != null) {
				int i_185_ = ((is_177_[0] * i_173_ + is_177_[1] * i_174_ + is_177_[2] * i_175_ + 8192) >> 14);
				int i_186_ = ((is_177_[3] * i_173_ + is_177_[4] * i_174_ + is_177_[5] * i_175_ + 8192) >> 14);
				int i_187_ = ((is_177_[6] * i_173_ + is_177_[7] * i_174_ + is_177_[8] * i_175_ + 8192) >> 14);
				i_173_ = i_185_;
				i_174_ = i_186_;
				i_175_ = i_187_;
			}
			i_173_ <<= 4;
			i_174_ <<= 4;
			i_175_ <<= 4;
			for (int i_188_ = 0; i_188_ < i_178_; i_188_++) {
				int i_189_ = is[i_188_];
				if (i_189_ < anIntArrayArray9048.length) {
					int[] is_190_ = anIntArrayArray9048[i_189_];
					for (int i_191_ = 0; i_191_ < is_190_.length; i_191_++) {
						int i_192_ = is_190_[i_191_];
						if (aShortArray9049 == null || (i_176_ & aShortArray9049[i_192_]) != 0) {
							anIntArray9053[i_192_] += i_173_;
							anIntArray9046[i_192_] += i_174_;
							anIntArray9047[i_192_] += i_175_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_177_ != null) {
				int i_193_ = is_177_[9] << 4;
				int i_194_ = is_177_[10] << 4;
				int i_195_ = is_177_[11] << 4;
				int i_196_ = is_177_[12] << 4;
				int i_197_ = is_177_[13] << 4;
				int i_198_ = is_177_[14] << 4;
				if (aBool9104) {
					int i_199_ = ((is_177_[0] * anInt9101 + is_177_[3] * anInt9102 + is_177_[6] * anInt9103 + 8192) >> 14);
					int i_200_ = ((is_177_[1] * anInt9101 + is_177_[4] * anInt9102 + is_177_[7] * anInt9103 + 8192) >> 14);
					int i_201_ = ((is_177_[2] * anInt9101 + is_177_[5] * anInt9102 + is_177_[8] * anInt9103 + 8192) >> 14);
					i_199_ += i_196_;
					i_200_ += i_197_;
					i_201_ += i_198_;
					anInt9101 = i_199_;
					anInt9102 = i_200_;
					anInt9103 = i_201_;
					aBool9104 = false;
				}
				int[] is_202_ = new int[9];
				int i_203_ = Class428.anIntArray4819[i_173_];
				int i_204_ = Class428.anIntArray4825[i_173_];
				int i_205_ = Class428.anIntArray4819[i_174_];
				int i_206_ = Class428.anIntArray4825[i_174_];
				int i_207_ = Class428.anIntArray4819[i_175_];
				int i_208_ = Class428.anIntArray4825[i_175_];
				int i_209_ = i_204_ * i_207_ + 8192 >> 14;
				int i_210_ = i_204_ * i_208_ + 8192 >> 14;
				is_202_[0] = i_205_ * i_207_ + i_206_ * i_210_ + 8192 >> 14;
				is_202_[1] = -i_205_ * i_208_ + i_206_ * i_209_ + 8192 >> 14;
				is_202_[2] = i_206_ * i_203_ + 8192 >> 14;
				is_202_[3] = i_203_ * i_208_ + 8192 >> 14;
				is_202_[4] = i_203_ * i_207_ + 8192 >> 14;
				is_202_[5] = -i_204_;
				is_202_[6] = -i_206_ * i_207_ + i_205_ * i_210_ + 8192 >> 14;
				is_202_[7] = i_206_ * i_208_ + i_205_ * i_209_ + 8192 >> 14;
				is_202_[8] = i_205_ * i_203_ + 8192 >> 14;
				int i_211_ = (is_202_[0] * -anInt9101 + is_202_[1] * -anInt9102 + is_202_[2] * -anInt9103 + 8192) >> 14;
				int i_212_ = (is_202_[3] * -anInt9101 + is_202_[4] * -anInt9102 + is_202_[5] * -anInt9103 + 8192) >> 14;
				int i_213_ = (is_202_[6] * -anInt9101 + is_202_[7] * -anInt9102 + is_202_[8] * -anInt9103 + 8192) >> 14;
				int i_214_ = i_211_ + anInt9101;
				int i_215_ = i_212_ + anInt9102;
				int i_216_ = i_213_ + anInt9103;
				int[] is_217_ = new int[9];
				for (int i_218_ = 0; i_218_ < 3; i_218_++) {
					for (int i_219_ = 0; i_219_ < 3; i_219_++) {
						int i_220_ = 0;
						for (int i_221_ = 0; i_221_ < 3; i_221_++)
							i_220_ += (is_202_[i_218_ * 3 + i_221_] * is_177_[i_219_ * 3 + i_221_]);
						is_217_[i_218_ * 3 + i_219_] = i_220_ + 8192 >> 14;
					}
				}
				int i_222_ = ((is_202_[0] * i_196_ + is_202_[1] * i_197_ + is_202_[2] * i_198_ + 8192) >> 14);
				int i_223_ = ((is_202_[3] * i_196_ + is_202_[4] * i_197_ + is_202_[5] * i_198_ + 8192) >> 14);
				int i_224_ = ((is_202_[6] * i_196_ + is_202_[7] * i_197_ + is_202_[8] * i_198_ + 8192) >> 14);
				i_222_ += i_214_;
				i_223_ += i_215_;
				i_224_ += i_216_;
				int[] is_225_ = new int[9];
				for (int i_226_ = 0; i_226_ < 3; i_226_++) {
					for (int i_227_ = 0; i_227_ < 3; i_227_++) {
						int i_228_ = 0;
						for (int i_229_ = 0; i_229_ < 3; i_229_++)
							i_228_ += (is_177_[i_226_ * 3 + i_229_] * is_217_[i_227_ + i_229_ * 3]);
						is_225_[i_226_ * 3 + i_227_] = i_228_ + 8192 >> 14;
					}
				}
				int i_230_ = ((is_177_[0] * i_222_ + is_177_[1] * i_223_ + is_177_[2] * i_224_ + 8192) >> 14);
				int i_231_ = ((is_177_[3] * i_222_ + is_177_[4] * i_223_ + is_177_[5] * i_224_ + 8192) >> 14);
				int i_232_ = ((is_177_[6] * i_222_ + is_177_[7] * i_223_ + is_177_[8] * i_224_ + 8192) >> 14);
				i_230_ += i_193_;
				i_231_ += i_194_;
				i_232_ += i_195_;
				for (int i_233_ = 0; i_233_ < i_178_; i_233_++) {
					int i_234_ = is[i_233_];
					if (i_234_ < anIntArrayArray9048.length) {
						int[] is_235_ = anIntArrayArray9048[i_234_];
						for (int i_236_ = 0; i_236_ < is_235_.length; i_236_++) {
							int i_237_ = is_235_[i_236_];
							if (aShortArray9049 == null || (i_176_ & aShortArray9049[i_237_]) != 0) {
								int i_238_ = ((is_225_[0] * anIntArray9053[i_237_] + is_225_[1] * anIntArray9046[i_237_] + is_225_[2] * anIntArray9047[i_237_] + 8192) >> 14);
								int i_239_ = ((is_225_[3] * anIntArray9053[i_237_] + is_225_[4] * anIntArray9046[i_237_] + is_225_[5] * anIntArray9047[i_237_] + 8192) >> 14);
								int i_240_ = ((is_225_[6] * anIntArray9053[i_237_] + is_225_[7] * anIntArray9046[i_237_] + is_225_[8] * anIntArray9047[i_237_] + 8192) >> 14);
								i_238_ += i_230_;
								i_239_ += i_231_;
								i_240_ += i_232_;
								anIntArray9053[i_237_] = i_238_;
								anIntArray9046[i_237_] = i_239_;
								anIntArray9047[i_237_] = i_240_;
							}
						}
					}
				}
			} else {
				for (int i_241_ = 0; i_241_ < i_178_; i_241_++) {
					int i_242_ = is[i_241_];
					if (i_242_ < anIntArrayArray9048.length) {
						int[] is_243_ = anIntArrayArray9048[i_242_];
						for (int i_244_ = 0; i_244_ < is_243_.length; i_244_++) {
							int i_245_ = is_243_[i_244_];
							if (aShortArray9049 == null || (i_176_ & aShortArray9049[i_245_]) != 0) {
								anIntArray9053[i_245_] -= anInt9101;
								anIntArray9046[i_245_] -= anInt9102;
								anIntArray9047[i_245_] -= anInt9103;
								if (i_175_ != 0) {
									int i_246_ = Class428.anIntArray4825[i_175_];
									int i_247_ = Class428.anIntArray4819[i_175_];
									int i_248_ = ((anIntArray9046[i_245_] * i_246_ + anIntArray9053[i_245_] * i_247_ + 16383) >> 14);
									anIntArray9046[i_245_] = (anIntArray9046[i_245_] * i_247_ - anIntArray9053[i_245_] * i_246_ + 16383) >> 14;
									anIntArray9053[i_245_] = i_248_;
								}
								if (i_173_ != 0) {
									int i_249_ = Class428.anIntArray4825[i_173_];
									int i_250_ = Class428.anIntArray4819[i_173_];
									int i_251_ = ((anIntArray9046[i_245_] * i_250_ - anIntArray9047[i_245_] * i_249_ + 16383) >> 14);
									anIntArray9047[i_245_] = (anIntArray9046[i_245_] * i_249_ + anIntArray9047[i_245_] * i_250_ + 16383) >> 14;
									anIntArray9046[i_245_] = i_251_;
								}
								if (i_174_ != 0) {
									int i_252_ = Class428.anIntArray4825[i_174_];
									int i_253_ = Class428.anIntArray4819[i_174_];
									int i_254_ = ((anIntArray9047[i_245_] * i_252_ + anIntArray9053[i_245_] * i_253_ + 16383) >> 14);
									anIntArray9047[i_245_] = (anIntArray9047[i_245_] * i_253_ - anIntArray9053[i_245_] * i_252_ + 16383) >> 14;
									anIntArray9053[i_245_] = i_254_;
								}
								anIntArray9053[i_245_] += anInt9101;
								anIntArray9046[i_245_] += anInt9102;
								anIntArray9047[i_245_] += anInt9103;
							}
						}
					}
				}
				if (bool) {
					for (int i_255_ = 0; i_255_ < i_178_; i_255_++) {
						int i_256_ = is[i_255_];
						if (i_256_ < anIntArrayArray9048.length) {
							int[] is_257_ = anIntArrayArray9048[i_256_];
							for (int i_258_ = 0; i_258_ < is_257_.length; i_258_++) {
								int i_259_ = is_257_[i_258_];
								if (aShortArray9049 == null || ((i_176_ & aShortArray9049[i_259_]) != 0)) {
									int i_260_ = anIntArray9088[i_259_];
									int i_261_ = anIntArray9088[i_259_ + 1];
									for (int i_262_ = i_260_; (i_262_ < i_261_ && aShortArray9089[i_262_] != 0); i_262_++) {
										int i_263_ = ((aShortArray9089[i_262_] & 0xffff) - 1);
										if (i_175_ != 0) {
											int i_264_ = (Class428.anIntArray4825[i_175_]);
											int i_265_ = (Class428.anIntArray4819[i_175_]);
											int i_266_ = (((aShortArray9052[i_263_] * i_264_) + (aShortArray9092[i_263_] * i_265_) + 16383) >> 14);
											aShortArray9052[i_263_] = (short) (((aShortArray9052[i_263_]) * i_265_ - ((aShortArray9092[i_263_]) * i_264_) + 16383) >> 14);
											aShortArray9092[i_263_] = (short) i_266_;
										}
										if (i_173_ != 0) {
											int i_267_ = (Class428.anIntArray4825[i_173_]);
											int i_268_ = (Class428.anIntArray4819[i_173_]);
											int i_269_ = (((aShortArray9052[i_263_] * i_268_) - (aShortArray9029[i_263_] * i_267_) + 16383) >> 14);
											aShortArray9029[i_263_] = (short) (((aShortArray9052[i_263_]) * i_267_ + ((aShortArray9029[i_263_]) * i_268_) + 16383) >> 14);
											aShortArray9052[i_263_] = (short) i_269_;
										}
										if (i_174_ != 0) {
											int i_270_ = (Class428.anIntArray4825[i_174_]);
											int i_271_ = (Class428.anIntArray4819[i_174_]);
											int i_272_ = (((aShortArray9029[i_263_] * i_270_) + (aShortArray9092[i_263_] * i_271_) + 16383) >> 14);
											aShortArray9029[i_263_] = (short) (((aShortArray9029[i_263_]) * i_271_ - ((aShortArray9092[i_263_]) * i_270_) + 16383) >> 14);
											aShortArray9092[i_263_] = (short) i_272_;
										}
									}
								}
							}
						}
					}
					if (aClass129_9070 == null && aClass129_9069 != null)
						aClass129_9069.anInterface15_1547 = null;
					if (aClass129_9070 != null)
						aClass129_9070.anInterface15_1547 = null;
				}
			}
		} else if (i == 3) {
			if (is_177_ != null) {
				int i_273_ = is_177_[9] << 4;
				int i_274_ = is_177_[10] << 4;
				int i_275_ = is_177_[11] << 4;
				int i_276_ = is_177_[12] << 4;
				int i_277_ = is_177_[13] << 4;
				int i_278_ = is_177_[14] << 4;
				if (aBool9104) {
					int i_279_ = ((is_177_[0] * anInt9101 + is_177_[3] * anInt9102 + is_177_[6] * anInt9103 + 8192) >> 14);
					int i_280_ = ((is_177_[1] * anInt9101 + is_177_[4] * anInt9102 + is_177_[7] * anInt9103 + 8192) >> 14);
					int i_281_ = ((is_177_[2] * anInt9101 + is_177_[5] * anInt9102 + is_177_[8] * anInt9103 + 8192) >> 14);
					i_279_ += i_276_;
					i_280_ += i_277_;
					i_281_ += i_278_;
					anInt9101 = i_279_;
					anInt9102 = i_280_;
					anInt9103 = i_281_;
					aBool9104 = false;
				}
				int i_282_ = i_173_ << 15 >> 7;
				int i_283_ = i_174_ << 15 >> 7;
				int i_284_ = i_175_ << 15 >> 7;
				int i_285_ = i_282_ * -anInt9101 + 8192 >> 14;
				int i_286_ = i_283_ * -anInt9102 + 8192 >> 14;
				int i_287_ = i_284_ * -anInt9103 + 8192 >> 14;
				int i_288_ = i_285_ + anInt9101;
				int i_289_ = i_286_ + anInt9102;
				int i_290_ = i_287_ + anInt9103;
				int[] is_291_ = new int[9];
				is_291_[0] = i_282_ * is_177_[0] + 8192 >> 14;
				is_291_[1] = i_282_ * is_177_[3] + 8192 >> 14;
				is_291_[2] = i_282_ * is_177_[6] + 8192 >> 14;
				is_291_[3] = i_283_ * is_177_[1] + 8192 >> 14;
				is_291_[4] = i_283_ * is_177_[4] + 8192 >> 14;
				is_291_[5] = i_283_ * is_177_[7] + 8192 >> 14;
				is_291_[6] = i_284_ * is_177_[2] + 8192 >> 14;
				is_291_[7] = i_284_ * is_177_[5] + 8192 >> 14;
				is_291_[8] = i_284_ * is_177_[8] + 8192 >> 14;
				int i_292_ = i_282_ * i_276_ + 8192 >> 14;
				int i_293_ = i_283_ * i_277_ + 8192 >> 14;
				int i_294_ = i_284_ * i_278_ + 8192 >> 14;
				i_292_ += i_288_;
				i_293_ += i_289_;
				i_294_ += i_290_;
				int[] is_295_ = new int[9];
				for (int i_296_ = 0; i_296_ < 3; i_296_++) {
					for (int i_297_ = 0; i_297_ < 3; i_297_++) {
						int i_298_ = 0;
						for (int i_299_ = 0; i_299_ < 3; i_299_++)
							i_298_ += (is_177_[i_296_ * 3 + i_299_] * is_291_[i_297_ + i_299_ * 3]);
						is_295_[i_296_ * 3 + i_297_] = i_298_ + 8192 >> 14;
					}
				}
				int i_300_ = ((is_177_[0] * i_292_ + is_177_[1] * i_293_ + is_177_[2] * i_294_ + 8192) >> 14);
				int i_301_ = ((is_177_[3] * i_292_ + is_177_[4] * i_293_ + is_177_[5] * i_294_ + 8192) >> 14);
				int i_302_ = ((is_177_[6] * i_292_ + is_177_[7] * i_293_ + is_177_[8] * i_294_ + 8192) >> 14);
				i_300_ += i_273_;
				i_301_ += i_274_;
				i_302_ += i_275_;
				for (int i_303_ = 0; i_303_ < i_178_; i_303_++) {
					int i_304_ = is[i_303_];
					if (i_304_ < anIntArrayArray9048.length) {
						int[] is_305_ = anIntArrayArray9048[i_304_];
						for (int i_306_ = 0; i_306_ < is_305_.length; i_306_++) {
							int i_307_ = is_305_[i_306_];
							if (aShortArray9049 == null || (i_176_ & aShortArray9049[i_307_]) != 0) {
								int i_308_ = ((is_295_[0] * anIntArray9053[i_307_] + is_295_[1] * anIntArray9046[i_307_] + is_295_[2] * anIntArray9047[i_307_] + 8192) >> 14);
								int i_309_ = ((is_295_[3] * anIntArray9053[i_307_] + is_295_[4] * anIntArray9046[i_307_] + is_295_[5] * anIntArray9047[i_307_] + 8192) >> 14);
								int i_310_ = ((is_295_[6] * anIntArray9053[i_307_] + is_295_[7] * anIntArray9046[i_307_] + is_295_[8] * anIntArray9047[i_307_] + 8192) >> 14);
								i_308_ += i_300_;
								i_309_ += i_301_;
								i_310_ += i_302_;
								anIntArray9053[i_307_] = i_308_;
								anIntArray9046[i_307_] = i_309_;
								anIntArray9047[i_307_] = i_310_;
							}
						}
					}
				}
			} else {
				for (int i_311_ = 0; i_311_ < i_178_; i_311_++) {
					int i_312_ = is[i_311_];
					if (i_312_ < anIntArrayArray9048.length) {
						int[] is_313_ = anIntArrayArray9048[i_312_];
						for (int i_314_ = 0; i_314_ < is_313_.length; i_314_++) {
							int i_315_ = is_313_[i_314_];
							if (aShortArray9049 == null || (i_176_ & aShortArray9049[i_315_]) != 0) {
								anIntArray9053[i_315_] -= anInt9101;
								anIntArray9046[i_315_] -= anInt9102;
								anIntArray9047[i_315_] -= anInt9103;
								anIntArray9053[i_315_] = anIntArray9053[i_315_] * i_173_ >> 7;
								anIntArray9046[i_315_] = anIntArray9046[i_315_] * i_174_ >> 7;
								anIntArray9047[i_315_] = anIntArray9047[i_315_] * i_175_ >> 7;
								anIntArray9053[i_315_] += anInt9101;
								anIntArray9046[i_315_] += anInt9102;
								anIntArray9047[i_315_] += anInt9103;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9042 != null) {
				for (int i_316_ = 0; i_316_ < i_178_; i_316_++) {
					int i_317_ = is[i_316_];
					if (i_317_ < anIntArrayArray9042.length) {
						int[] is_318_ = anIntArrayArray9042[i_317_];
						for (int i_319_ = 0; i_319_ < is_318_.length; i_319_++) {
							int i_320_ = is_318_[i_319_];
							if (aShortArray9067 == null || (i_176_ & aShortArray9067[i_320_]) != 0) {
								int i_321_ = ((aByteArray9061[i_320_] & 0xff) + i_173_ * 8);
								if (i_321_ < 0)
									i_321_ = 0;
								else if (i_321_ > 255)
									i_321_ = 255;
								aByteArray9061[i_320_] = (byte) i_321_;
								if (aClass129_9069 != null)
									aClass129_9069.anInterface15_1547 = null;
							}
						}
					}
				}
				if (aClass150Array9093 != null) {
					for (int i_322_ = 0; i_322_ < anInt9075; i_322_++) {
						Class150 class150 = aClass150Array9093[i_322_];
						Class130 class130 = aClass130Array9094[i_322_];
						class130.anInt1553 = (class130.anInt1553 & 0xffffff | 255 - (aByteArray9061[class150.anInt1682] & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9042 != null) {
				for (int i_323_ = 0; i_323_ < i_178_; i_323_++) {
					int i_324_ = is[i_323_];
					if (i_324_ < anIntArrayArray9042.length) {
						int[] is_325_ = anIntArrayArray9042[i_324_];
						for (int i_326_ = 0; i_326_ < is_325_.length; i_326_++) {
							int i_327_ = is_325_[i_326_];
							if (aShortArray9067 == null || (i_176_ & aShortArray9067[i_327_]) != 0) {
								int i_328_ = aShortArray9060[i_327_] & 0xffff;
								int i_329_ = i_328_ >> 10 & 0x3f;
								int i_330_ = i_328_ >> 7 & 0x7;
								int i_331_ = i_328_ & 0x7f;
								i_329_ = i_329_ + i_173_ & 0x3f;
								i_330_ += i_174_ / 4;
								if (i_330_ < 0)
									i_330_ = 0;
								else if (i_330_ > 7)
									i_330_ = 7;
								i_331_ += i_175_;
								if (i_331_ < 0)
									i_331_ = 0;
								else if (i_331_ > 127)
									i_331_ = 127;
								aShortArray9060[i_327_] = (short) (i_329_ << 10 | i_330_ << 7 | i_331_);
								if (aClass129_9069 != null)
									aClass129_9069.anInterface15_1547 = null;
							}
						}
					}
				}
				if (aClass150Array9093 != null) {
					for (int i_332_ = 0; i_332_ < anInt9075; i_332_++) {
						Class150 class150 = aClass150Array9093[i_332_];
						Class130 class130 = aClass130Array9094[i_332_];
						class130.anInt1553 = (class130.anInt1553 & ~0xffffff | (Class656.anIntArray8390[(aShortArray9060[class150.anInt1682] & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9028 != null) {
				for (int i_333_ = 0; i_333_ < i_178_; i_333_++) {
					int i_334_ = is[i_333_];
					if (i_334_ < anIntArrayArray9028.length) {
						int[] is_335_ = anIntArrayArray9028[i_334_];
						for (int i_336_ = 0; i_336_ < is_335_.length; i_336_++) {
							Class130 class130 = aClass130Array9094[is_335_[i_336_]];
							class130.anInt1548 += i_173_;
							class130.anInt1552 += i_174_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9028 != null) {
				for (int i_337_ = 0; i_337_ < i_178_; i_337_++) {
					int i_338_ = is[i_337_];
					if (i_338_ < anIntArrayArray9028.length) {
						int[] is_339_ = anIntArrayArray9028[i_338_];
						for (int i_340_ = 0; i_340_ < is_339_.length; i_340_++) {
							Class130 class130 = aClass130Array9094[is_339_[i_340_]];
							class130.anInt1549 = class130.anInt1549 * i_173_ >> 7;
							class130.anInt1551 = class130.anInt1551 * i_174_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9028 != null) {
				for (int i_341_ = 0; i_341_ < i_178_; i_341_++) {
					int i_342_ = is[i_341_];
					if (i_342_ < anIntArrayArray9028.length) {
						int[] is_343_ = anIntArrayArray9028[i_342_];
						for (int i_344_ = 0; i_344_ < is_343_.length; i_344_++) {
							Class130 class130 = aClass130Array9094[is_343_[i_344_]];
							class130.anInt1550 = class130.anInt1550 + i_173_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	void method2910(int i, int i_345_, int i_346_, int i_347_) {
		if (i == 0) {
			int i_348_ = 0;
			anInt9101 = 0;
			anInt9102 = 0;
			anInt9103 = 0;
			for (int i_349_ = 0; i_349_ < anInt9064; i_349_++) {
				anInt9101 += anIntArray9053[i_349_];
				anInt9102 += anIntArray9046[i_349_];
				anInt9103 += anIntArray9047[i_349_];
				i_348_++;
			}
			if (i_348_ > 0) {
				anInt9101 = anInt9101 / i_348_ + i_345_;
				anInt9102 = anInt9102 / i_348_ + i_346_;
				anInt9103 = anInt9103 / i_348_ + i_347_;
			} else {
				anInt9101 = i_345_;
				anInt9102 = i_346_;
				anInt9103 = i_347_;
			}
		} else if (i == 1) {
			for (int i_350_ = 0; i_350_ < anInt9064; i_350_++) {
				anIntArray9053[i_350_] += i_345_;
				anIntArray9046[i_350_] += i_346_;
				anIntArray9047[i_350_] += i_347_;
			}
		} else if (i == 2) {
			for (int i_351_ = 0; i_351_ < anInt9064; i_351_++) {
				anIntArray9053[i_351_] -= anInt9101;
				anIntArray9046[i_351_] -= anInt9102;
				anIntArray9047[i_351_] -= anInt9103;
				if (i_347_ != 0) {
					int i_352_ = Class428.anIntArray4825[i_347_];
					int i_353_ = Class428.anIntArray4819[i_347_];
					int i_354_ = ((anIntArray9046[i_351_] * i_352_ + anIntArray9053[i_351_] * i_353_ + 16383) >> 14);
					anIntArray9046[i_351_] = (anIntArray9046[i_351_] * i_353_ - anIntArray9053[i_351_] * i_352_ + 16383) >> 14;
					anIntArray9053[i_351_] = i_354_;
				}
				if (i_345_ != 0) {
					int i_355_ = Class428.anIntArray4825[i_345_];
					int i_356_ = Class428.anIntArray4819[i_345_];
					int i_357_ = ((anIntArray9046[i_351_] * i_356_ - anIntArray9047[i_351_] * i_355_ + 16383) >> 14);
					anIntArray9047[i_351_] = (anIntArray9046[i_351_] * i_355_ + anIntArray9047[i_351_] * i_356_ + 16383) >> 14;
					anIntArray9046[i_351_] = i_357_;
				}
				if (i_346_ != 0) {
					int i_358_ = Class428.anIntArray4825[i_346_];
					int i_359_ = Class428.anIntArray4819[i_346_];
					int i_360_ = ((anIntArray9047[i_351_] * i_358_ + anIntArray9053[i_351_] * i_359_ + 16383) >> 14);
					anIntArray9047[i_351_] = (anIntArray9047[i_351_] * i_359_ - anIntArray9053[i_351_] * i_358_ + 16383) >> 14;
					anIntArray9053[i_351_] = i_360_;
				}
				anIntArray9053[i_351_] += anInt9101;
				anIntArray9046[i_351_] += anInt9102;
				anIntArray9047[i_351_] += anInt9103;
			}
		} else if (i == 3) {
			for (int i_361_ = 0; i_361_ < anInt9064; i_361_++) {
				anIntArray9053[i_361_] -= anInt9101;
				anIntArray9046[i_361_] -= anInt9102;
				anIntArray9047[i_361_] -= anInt9103;
				anIntArray9053[i_361_] = anIntArray9053[i_361_] * i_345_ / 128;
				anIntArray9046[i_361_] = anIntArray9046[i_361_] * i_346_ / 128;
				anIntArray9047[i_361_] = anIntArray9047[i_361_] * i_347_ / 128;
				anIntArray9053[i_361_] += anInt9101;
				anIntArray9046[i_361_] += anInt9102;
				anIntArray9047[i_361_] += anInt9103;
			}
		} else if (i == 5) {
			for (int i_362_ = 0; i_362_ < anInt9058; i_362_++) {
				int i_363_ = (aByteArray9061[i_362_] & 0xff) + i_345_ * 8;
				if (i_363_ < 0)
					i_363_ = 0;
				else if (i_363_ > 255)
					i_363_ = 255;
				aByteArray9061[i_362_] = (byte) i_363_;
			}
			if (aClass129_9069 != null)
				aClass129_9069.anInterface15_1547 = null;
			if (aClass150Array9093 != null) {
				for (int i_364_ = 0; i_364_ < anInt9075; i_364_++) {
					Class150 class150 = aClass150Array9093[i_364_];
					Class130 class130 = aClass130Array9094[i_364_];
					class130.anInt1553 = (class130.anInt1553 & 0xffffff | (255 - (aByteArray9061[class150.anInt1682] & 0xff) << 24));
				}
			}
		} else if (i == 7) {
			for (int i_365_ = 0; i_365_ < anInt9058; i_365_++) {
				int i_366_ = aShortArray9060[i_365_] & 0xffff;
				int i_367_ = i_366_ >> 10 & 0x3f;
				int i_368_ = i_366_ >> 7 & 0x7;
				int i_369_ = i_366_ & 0x7f;
				i_367_ = i_367_ + i_345_ & 0x3f;
				i_368_ += i_346_ / 4;
				if (i_368_ < 0)
					i_368_ = 0;
				else if (i_368_ > 7)
					i_368_ = 7;
				i_369_ += i_347_;
				if (i_369_ < 0)
					i_369_ = 0;
				else if (i_369_ > 127)
					i_369_ = 127;
				aShortArray9060[i_365_] = (short) (i_367_ << 10 | i_368_ << 7 | i_369_);
			}
			if (aClass129_9069 != null)
				aClass129_9069.anInterface15_1547 = null;
			if (aClass150Array9093 != null) {
				for (int i_370_ = 0; i_370_ < anInt9075; i_370_++) {
					Class150 class150 = aClass150Array9093[i_370_];
					Class130 class130 = aClass130Array9094[i_370_];
					class130.anInt1553 = (class130.anInt1553 & ~0xffffff | ((Class656.anIntArray8390[aShortArray9060[class150.anInt1682] & 0xffff]) & 0xffffff));
				}
			}
		} else if (i == 8) {
			for (int i_371_ = 0; i_371_ < anInt9075; i_371_++) {
				Class130 class130 = aClass130Array9094[i_371_];
				class130.anInt1548 += i_345_;
				class130.anInt1552 += i_346_;
			}
		} else if (i == 10) {
			for (int i_372_ = 0; i_372_ < anInt9075; i_372_++) {
				Class130 class130 = aClass130Array9094[i_372_];
				class130.anInt1549 = class130.anInt1549 * i_345_ >> 7;
				class130.anInt1551 = class130.anInt1551 * i_346_ >> 7;
			}
		} else if (i == 9) {
			for (int i_373_ = 0; i_373_ < anInt9075; i_373_++) {
				Class130 class130 = aClass130Array9094[i_373_];
				class130.anInt1550 = class130.anInt1550 + i_345_ & 0x3fff;
			}
		}
	}

	void method2884(int i, int[] is, int i_374_, int i_375_, int i_376_, int i_377_, boolean bool) {
		int i_378_ = is.length;
		if (i == 0) {
			i_374_ <<= 4;
			i_375_ <<= 4;
			i_376_ <<= 4;
			int i_379_ = 0;
			anInt9101 = 0;
			anInt9102 = 0;
			anInt9103 = 0;
			for (int i_380_ = 0; i_380_ < i_378_; i_380_++) {
				int i_381_ = is[i_380_];
				if (i_381_ < anIntArrayArray9048.length) {
					int[] is_382_ = anIntArrayArray9048[i_381_];
					for (int i_383_ = 0; i_383_ < is_382_.length; i_383_++) {
						int i_384_ = is_382_[i_383_];
						anInt9101 += anIntArray9053[i_384_];
						anInt9102 += anIntArray9046[i_384_];
						anInt9103 += anIntArray9047[i_384_];
						i_379_++;
					}
				}
			}
			if (i_379_ > 0) {
				anInt9101 = anInt9101 / i_379_ + i_374_;
				anInt9102 = anInt9102 / i_379_ + i_375_;
				anInt9103 = anInt9103 / i_379_ + i_376_;
			} else {
				anInt9101 = i_374_;
				anInt9102 = i_375_;
				anInt9103 = i_376_;
			}
		} else if (i == 1) {
			i_374_ <<= 4;
			i_375_ <<= 4;
			i_376_ <<= 4;
			for (int i_385_ = 0; i_385_ < i_378_; i_385_++) {
				int i_386_ = is[i_385_];
				if (i_386_ < anIntArrayArray9048.length) {
					int[] is_387_ = anIntArrayArray9048[i_386_];
					for (int i_388_ = 0; i_388_ < is_387_.length; i_388_++) {
						int i_389_ = is_387_[i_388_];
						anIntArray9053[i_389_] += i_374_;
						anIntArray9046[i_389_] += i_375_;
						anIntArray9047[i_389_] += i_376_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_390_ = 0; i_390_ < i_378_; i_390_++) {
				int i_391_ = is[i_390_];
				if (i_391_ < anIntArrayArray9048.length) {
					int[] is_392_ = anIntArrayArray9048[i_391_];
					if ((i_377_ & 0x1) == 0) {
						for (int i_393_ = 0; i_393_ < is_392_.length; i_393_++) {
							int i_394_ = is_392_[i_393_];
							anIntArray9053[i_394_] -= anInt9101;
							anIntArray9046[i_394_] -= anInt9102;
							anIntArray9047[i_394_] -= anInt9103;
							if (i_376_ != 0) {
								int i_395_ = Class428.anIntArray4825[i_376_];
								int i_396_ = Class428.anIntArray4819[i_376_];
								int i_397_ = (anIntArray9046[i_394_] * i_395_ + anIntArray9053[i_394_] * i_396_ + 16383) >> 14;
								anIntArray9046[i_394_] = (anIntArray9046[i_394_] * i_396_ - anIntArray9053[i_394_] * i_395_ + 16383) >> 14;
								anIntArray9053[i_394_] = i_397_;
							}
							if (i_374_ != 0) {
								int i_398_ = Class428.anIntArray4825[i_374_];
								int i_399_ = Class428.anIntArray4819[i_374_];
								int i_400_ = (anIntArray9046[i_394_] * i_399_ - anIntArray9047[i_394_] * i_398_ + 16383) >> 14;
								anIntArray9047[i_394_] = (anIntArray9046[i_394_] * i_398_ + anIntArray9047[i_394_] * i_399_ + 16383) >> 14;
								anIntArray9046[i_394_] = i_400_;
							}
							if (i_375_ != 0) {
								int i_401_ = Class428.anIntArray4825[i_375_];
								int i_402_ = Class428.anIntArray4819[i_375_];
								int i_403_ = (anIntArray9047[i_394_] * i_401_ + anIntArray9053[i_394_] * i_402_ + 16383) >> 14;
								anIntArray9047[i_394_] = (anIntArray9047[i_394_] * i_402_ - anIntArray9053[i_394_] * i_401_ + 16383) >> 14;
								anIntArray9053[i_394_] = i_403_;
							}
							anIntArray9053[i_394_] += anInt9101;
							anIntArray9046[i_394_] += anInt9102;
							anIntArray9047[i_394_] += anInt9103;
						}
					} else {
						for (int i_404_ = 0; i_404_ < is_392_.length; i_404_++) {
							int i_405_ = is_392_[i_404_];
							anIntArray9053[i_405_] -= anInt9101;
							anIntArray9046[i_405_] -= anInt9102;
							anIntArray9047[i_405_] -= anInt9103;
							if (i_374_ != 0) {
								int i_406_ = Class428.anIntArray4825[i_374_];
								int i_407_ = Class428.anIntArray4819[i_374_];
								int i_408_ = (anIntArray9046[i_405_] * i_407_ - anIntArray9047[i_405_] * i_406_ + 16383) >> 14;
								anIntArray9047[i_405_] = (anIntArray9046[i_405_] * i_406_ + anIntArray9047[i_405_] * i_407_ + 16383) >> 14;
								anIntArray9046[i_405_] = i_408_;
							}
							if (i_376_ != 0) {
								int i_409_ = Class428.anIntArray4825[i_376_];
								int i_410_ = Class428.anIntArray4819[i_376_];
								int i_411_ = (anIntArray9046[i_405_] * i_409_ + anIntArray9053[i_405_] * i_410_ + 16383) >> 14;
								anIntArray9046[i_405_] = (anIntArray9046[i_405_] * i_410_ - anIntArray9053[i_405_] * i_409_ + 16383) >> 14;
								anIntArray9053[i_405_] = i_411_;
							}
							if (i_375_ != 0) {
								int i_412_ = Class428.anIntArray4825[i_375_];
								int i_413_ = Class428.anIntArray4819[i_375_];
								int i_414_ = (anIntArray9047[i_405_] * i_412_ + anIntArray9053[i_405_] * i_413_ + 16383) >> 14;
								anIntArray9047[i_405_] = (anIntArray9047[i_405_] * i_413_ - anIntArray9053[i_405_] * i_412_ + 16383) >> 14;
								anIntArray9053[i_405_] = i_414_;
							}
							anIntArray9053[i_405_] += anInt9101;
							anIntArray9046[i_405_] += anInt9102;
							anIntArray9047[i_405_] += anInt9103;
						}
					}
				}
			}
			if (bool) {
				for (int i_415_ = 0; i_415_ < i_378_; i_415_++) {
					int i_416_ = is[i_415_];
					if (i_416_ < anIntArrayArray9048.length) {
						int[] is_417_ = anIntArrayArray9048[i_416_];
						for (int i_418_ = 0; i_418_ < is_417_.length; i_418_++) {
							int i_419_ = is_417_[i_418_];
							int i_420_ = anIntArray9088[i_419_];
							int i_421_ = anIntArray9088[i_419_ + 1];
							for (int i_422_ = i_420_; (i_422_ < i_421_ && aShortArray9089[i_422_] != 0); i_422_++) {
								int i_423_ = (aShortArray9089[i_422_] & 0xffff) - 1;
								if (i_376_ != 0) {
									int i_424_ = Class428.anIntArray4825[i_376_];
									int i_425_ = Class428.anIntArray4819[i_376_];
									int i_426_ = ((aShortArray9052[i_423_] * i_424_ + aShortArray9092[i_423_] * i_425_ + 16383) >> 14);
									aShortArray9052[i_423_] = (short) (((aShortArray9052[i_423_] * i_425_) - (aShortArray9092[i_423_] * i_424_) + 16383) >> 14);
									aShortArray9092[i_423_] = (short) i_426_;
								}
								if (i_374_ != 0) {
									int i_427_ = Class428.anIntArray4825[i_374_];
									int i_428_ = Class428.anIntArray4819[i_374_];
									int i_429_ = ((aShortArray9052[i_423_] * i_428_ - aShortArray9029[i_423_] * i_427_ + 16383) >> 14);
									aShortArray9029[i_423_] = (short) (((aShortArray9052[i_423_] * i_427_) + (aShortArray9029[i_423_] * i_428_) + 16383) >> 14);
									aShortArray9052[i_423_] = (short) i_429_;
								}
								if (i_375_ != 0) {
									int i_430_ = Class428.anIntArray4825[i_375_];
									int i_431_ = Class428.anIntArray4819[i_375_];
									int i_432_ = ((aShortArray9029[i_423_] * i_430_ + aShortArray9092[i_423_] * i_431_ + 16383) >> 14);
									aShortArray9029[i_423_] = (short) (((aShortArray9029[i_423_] * i_431_) - (aShortArray9092[i_423_] * i_430_) + 16383) >> 14);
									aShortArray9092[i_423_] = (short) i_432_;
								}
							}
						}
					}
				}
				if (aClass129_9070 == null && aClass129_9069 != null)
					aClass129_9069.anInterface15_1547 = null;
				if (aClass129_9070 != null)
					aClass129_9070.anInterface15_1547 = null;
			}
		} else if (i == 3) {
			for (int i_433_ = 0; i_433_ < i_378_; i_433_++) {
				int i_434_ = is[i_433_];
				if (i_434_ < anIntArrayArray9048.length) {
					int[] is_435_ = anIntArrayArray9048[i_434_];
					for (int i_436_ = 0; i_436_ < is_435_.length; i_436_++) {
						int i_437_ = is_435_[i_436_];
						anIntArray9053[i_437_] -= anInt9101;
						anIntArray9046[i_437_] -= anInt9102;
						anIntArray9047[i_437_] -= anInt9103;
						anIntArray9053[i_437_] = anIntArray9053[i_437_] * i_374_ >> 7;
						anIntArray9046[i_437_] = anIntArray9046[i_437_] * i_375_ >> 7;
						anIntArray9047[i_437_] = anIntArray9047[i_437_] * i_376_ >> 7;
						anIntArray9053[i_437_] += anInt9101;
						anIntArray9046[i_437_] += anInt9102;
						anIntArray9047[i_437_] += anInt9103;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9042 != null) {
				for (int i_438_ = 0; i_438_ < i_378_; i_438_++) {
					int i_439_ = is[i_438_];
					if (i_439_ < anIntArrayArray9042.length) {
						int[] is_440_ = anIntArrayArray9042[i_439_];
						for (int i_441_ = 0; i_441_ < is_440_.length; i_441_++) {
							int i_442_ = is_440_[i_441_];
							int i_443_ = (aByteArray9061[i_442_] & 0xff) + i_374_ * 8;
							if (i_443_ < 0)
								i_443_ = 0;
							else if (i_443_ > 255)
								i_443_ = 255;
							aByteArray9061[i_442_] = (byte) i_443_;
						}
						if (is_440_.length > 0 && aClass129_9069 != null)
							aClass129_9069.anInterface15_1547 = null;
					}
				}
				if (aClass150Array9093 != null) {
					for (int i_444_ = 0; i_444_ < anInt9075; i_444_++) {
						Class150 class150 = aClass150Array9093[i_444_];
						Class130 class130 = aClass130Array9094[i_444_];
						class130.anInt1553 = (class130.anInt1553 & 0xffffff | 255 - (aByteArray9061[class150.anInt1682] & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9042 != null) {
				for (int i_445_ = 0; i_445_ < i_378_; i_445_++) {
					int i_446_ = is[i_445_];
					if (i_446_ < anIntArrayArray9042.length) {
						int[] is_447_ = anIntArrayArray9042[i_446_];
						for (int i_448_ = 0; i_448_ < is_447_.length; i_448_++) {
							int i_449_ = is_447_[i_448_];
							int i_450_ = aShortArray9060[i_449_] & 0xffff;
							int i_451_ = i_450_ >> 10 & 0x3f;
							int i_452_ = i_450_ >> 7 & 0x7;
							int i_453_ = i_450_ & 0x7f;
							i_451_ = i_451_ + i_374_ & 0x3f;
							i_452_ += i_375_ / 4;
							if (i_452_ < 0)
								i_452_ = 0;
							else if (i_452_ > 7)
								i_452_ = 7;
							i_453_ += i_376_;
							if (i_453_ < 0)
								i_453_ = 0;
							else if (i_453_ > 127)
								i_453_ = 127;
							aShortArray9060[i_449_] = (short) (i_451_ << 10 | i_452_ << 7 | i_453_);
						}
						if (is_447_.length > 0 && aClass129_9069 != null)
							aClass129_9069.anInterface15_1547 = null;
					}
				}
				if (aClass150Array9093 != null) {
					for (int i_454_ = 0; i_454_ < anInt9075; i_454_++) {
						Class150 class150 = aClass150Array9093[i_454_];
						Class130 class130 = aClass130Array9094[i_454_];
						class130.anInt1553 = (class130.anInt1553 & ~0xffffff | (Class656.anIntArray8390[(aShortArray9060[class150.anInt1682] & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9028 != null) {
				for (int i_455_ = 0; i_455_ < i_378_; i_455_++) {
					int i_456_ = is[i_455_];
					if (i_456_ < anIntArrayArray9028.length) {
						int[] is_457_ = anIntArrayArray9028[i_456_];
						for (int i_458_ = 0; i_458_ < is_457_.length; i_458_++) {
							Class130 class130 = aClass130Array9094[is_457_[i_458_]];
							class130.anInt1548 += i_374_;
							class130.anInt1552 += i_375_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9028 != null) {
				for (int i_459_ = 0; i_459_ < i_378_; i_459_++) {
					int i_460_ = is[i_459_];
					if (i_460_ < anIntArrayArray9028.length) {
						int[] is_461_ = anIntArrayArray9028[i_460_];
						for (int i_462_ = 0; i_462_ < is_461_.length; i_462_++) {
							Class130 class130 = aClass130Array9094[is_461_[i_462_]];
							class130.anInt1549 = class130.anInt1549 * i_374_ >> 7;
							class130.anInt1551 = class130.anInt1551 * i_375_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9028 != null) {
				for (int i_463_ = 0; i_463_ < i_378_; i_463_++) {
					int i_464_ = is[i_463_];
					if (i_464_ < anIntArrayArray9028.length) {
						int[] is_465_ = anIntArrayArray9028[i_464_];
						for (int i_466_ = 0; i_466_ < is_465_.length; i_466_++) {
							Class130 class130 = aClass130Array9094[is_465_[i_466_]];
							class130.anInt1550 = class130.anInt1550 + i_374_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	void method2887() {
		for (int i = 0; i < anInt9043; i++) {
			anIntArray9053[i] = anIntArray9053[i] + 7 >> 4;
			anIntArray9046[i] = anIntArray9046[i] + 7 >> 4;
			anIntArray9047[i] = anIntArray9047[i] + 7 >> 4;
		}
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		aBool9078 = false;
	}

	Class176_Sub1(Class180_Sub3 class180_sub3, Class175 class175, int i, int i_467_, int i_468_, int i_469_) {
		anInt9043 = 0;
		anInt9064 = 0;
		anInt9059 = 0;
		anInt9058 = 0;
		anInt9079 = 0;
		aBool9073 = true;
		aBool9078 = false;
		aBool9063 = false;
		aClass180_Sub3_9035 = class180_sub3;
		anInt9036 = i;
		anInt9037 = i_469_;
		if (Class134.method2215(i, i_469_))
			aClass129_9068 = new Class129(null, 5126, 3, 0);
		if (Class134.method2201(i, i_469_))
			aClass129_9071 = new Class129(null, 5126, 2, 0);
		if (Class134.method2257(i, i_469_))
			aClass129_9070 = new Class129(null, 5126, 3, 0);
		if (Class134.method2200(i, i_469_))
			aClass129_9069 = new Class129(null, 5121, 4, 0);
		if (Class134.method2202(i, i_469_))
			aClass132_9072 = new Class132();
		Class181 class181 = class180_sub3.aClass181_2059;
		Interface48 interface48 = class180_sub3.anInterface48_2067;
		int[] is = new int[class175.anInt1917];
		anIntArray9088 = new int[class175.anInt1912 + 1];
		for (int i_470_ = 0; i_470_ < class175.anInt1917; i_470_++) {
			if (class175.aByteArray1928 == null || class175.aByteArray1928[i_470_] != 2) {
				if (class175.aShortArray1929 != null && class175.aShortArray1929[i_470_] != -1) {
					Class163 class163 = class181.method3544((class175.aShortArray1929[i_470_] & 0xffff), (byte) 0);
					if (((anInt9037 & 0x40) == 0 || !class163.aBool1806) && class163.aBool1782)
						continue;
				}
				is[anInt9058++] = i_470_;
				anIntArray9088[class175.aShortArray1918[i_470_]]++;
				anIntArray9088[class175.aShortArray1940[i_470_]]++;
				anIntArray9088[class175.aShortArray1920[i_470_]]++;
			}
		}
		anInt9079 = anInt9058;
		long[] ls = new long[anInt9058];
		boolean bool = (anInt9036 & 0x100) != 0;
		for (int i_471_ = 0; i_471_ < anInt9058; i_471_++) {
			int i_472_ = is[i_471_];
			Class163 class163 = null;
			int i_473_ = 0;
			int i_474_ = 0;
			int i_475_ = 0;
			int i_476_ = 0;
			if (class175.aClass183Array1947 != null) {
				boolean bool_477_ = false;
				for (int i_478_ = 0; i_478_ < class175.aClass183Array1947.length; i_478_++) {
					Class183 class183 = class175.aClass183Array1947[i_478_];
					if (i_472_ == class183.anInt2097 * -214271421) {
						Class393 class393 = interface48.method336((class183.anInt2099 * 1280345283), -454080564);
						if (class393.aBool4018)
							bool_477_ = true;
						if (class393.anInt4021 * 1521281507 != -1) {
							Class163 class163_479_ = class181.method3544((class393.anInt4021 * 1521281507), (byte) -82);
							if (class163_479_.aClass595_1784 == Class595.aClass595_7814)
								aBool9057 = true;
						}
					}
				}
				if (bool_477_) {
					ls[i_471_] = 9223372036854775807L;
					anInt9079--;
					continue;
				}
			}
			if (class175.aClass167Array1948 != null) {
				boolean bool_480_ = false;
				for (int i_481_ = 0; i_481_ < class175.aClass167Array1948.length; i_481_++) {
					Class167 class167 = class175.aClass167Array1948[i_481_];
					if (i_472_ == class167.anInt1848 * 359046121) {
						Class394 class394 = (aClass180_Sub3_9035.anInterface46_2078.method330(class167.anInt1854 * -1557661391, 1073295738));
						if (class394.aBool4098)
							bool_480_ = true;
					}
				}
				if (bool_480_) {
					ls[i_471_] = 9223372036854775807L;
					anInt9079--;
					continue;
				}
			}
			int i_482_ = -1;
			if (class175.aShortArray1929 != null) {
				i_482_ = class175.aShortArray1929[i_472_];
				if (i_482_ != -1) {
					class163 = class181.method3544(i_482_ & 0xffff, (byte) -31);
					if ((anInt9037 & 0x40) == 0 || !class163.aBool1806) {
						i_475_ = class163.aByte1801;
						i_476_ = class163.aByte1775;
						if (class163.aByte1781 != 0 || class163.aByte1797 != 0)
							aBool9096 = true;
					} else {
						i_482_ = -1;
						class163 = null;
					}
				}
			}
			boolean bool_483_ = ((class175.aByteArray1907 != null && class175.aByteArray1907[i_472_] != 0) || (class163 != null && class163.aClass595_1784 != Class595.aClass595_7816));
			if ((bool || bool_483_) && class175.aByteArray1924 != null)
				i_473_ += class175.aByteArray1924[i_472_] << 17;
			if (bool_483_)
				i_473_ += 65536;
			i_473_ += (i_475_ & 0xff) << 8;
			i_473_ += i_476_ & 0xff;
			i_474_ += (i_482_ & 0xffff) << 16;
			i_474_ += i_471_ & 0xffff;
			ls[i_471_] = ((long) i_473_ << 32) + (long) i_474_;
			aBool9057 |= bool_483_;
			Class176_Sub1 class176_sub1_484_ = this;
			class176_sub1_484_.aBool9096 = (class176_sub1_484_.aBool9096 | (class163 != null && (class163.aByte1781 != 0 || class163.aByte1797 != 0)));
		}
		Class98.method1752(ls, is, -356826538);
		anInt9043 = class175.anInt1906;
		anInt9064 = class175.anInt1912;
		anIntArray9053 = class175.anIntArray1908;
		anIntArray9046 = class175.anIntArray1909;
		anIntArray9047 = class175.anIntArray1910;
		aShortArray9049 = class175.aShortArray1913;
		Class133[] class133s = new Class133[anInt9064];
		aClass167Array9090 = class175.aClass167Array1948;
		aClass159Array9045 = class175.aClass159Array1925;
		if (class175.aClass183Array1947 != null) {
			anInt9075 = class175.aClass183Array1947.length;
			aClass150Array9093 = new Class150[anInt9075];
			aClass130Array9094 = new Class130[anInt9075];
			for (int i_485_ = 0; i_485_ < anInt9075; i_485_++) {
				Class183 class183 = class175.aClass183Array1947[i_485_];
				Class393 class393 = interface48.method336(class183.anInt2099 * 1280345283, -1947308628);
				int i_486_ = -1;
				for (int i_487_ = 0; i_487_ < anInt9058; i_487_++) {
					if (is[i_487_] == class183.anInt2097 * -214271421) {
						i_486_ = i_487_;
						break;
					}
				}
				if (i_486_ == -1)
					throw new RuntimeException();
				int i_488_ = ((Class656.anIntArray8390[(class175.aShortArray1942[class183.anInt2097 * -214271421]) & 0xffff]) & 0xffffff);
				i_488_ = i_488_ | 255 - (class175.aByteArray1907 != null ? (class175.aByteArray1907[class183.anInt2097 * -214271421]) : 0) << 24;
				aClass150Array9093[i_485_] = new Class150(i_486_, (class175.aShortArray1918[class183.anInt2097 * -214271421]), (class175.aShortArray1940[class183.anInt2097 * -214271421]), (class175.aShortArray1920[class183.anInt2097 * -214271421]), class393.anInt4020 * 1759660577, class393.anInt4025 * -1228217751, class393.anInt4021 * 1521281507, class393.anInt4023 * -142033085, class393.anInt4022 * -1198324925, class393.aBool4018, class393.aBool4024, class183.anInt2098 * -1651221637);
				aClass130Array9094[i_485_] = new Class130(i_488_);
			}
		}
		int i_489_ = anInt9058 * 3;
		aShortArray9092 = new short[i_489_];
		aShortArray9052 = new short[i_489_];
		aShortArray9029 = new short[i_489_];
		aByteArray9091 = new byte[i_489_];
		aFloatArray9056 = new float[i_489_];
		aFloatArray9085 = new float[i_489_];
		aShortArray9060 = new short[anInt9058];
		aByteArray9061 = new byte[anInt9058];
		aShortArray9062 = new short[anInt9058];
		aShortArray9055 = new short[anInt9058];
		aShortArray9050 = new short[anInt9058];
		aShortArray9065 = new short[anInt9058];
		if (class175.aShortArray1935 != null)
			aShortArray9067 = new short[anInt9058];
		aShort9039 = (short) i_467_;
		aShort9095 = (short) i_468_;
		aShortArray9089 = new short[i_489_];
		aLongArray9083 = new long[i_489_];
		int i_490_ = 0;
		for (int i_491_ = 0; i_491_ < class175.anInt1912; i_491_++) {
			int i_492_ = anIntArray9088[i_491_];
			anIntArray9088[i_491_] = i_490_;
			i_490_ += i_492_;
			class133s[i_491_] = new Class133();
		}
		anIntArray9088[class175.anInt1912] = i_490_;
		Class173 class173 = method2860(class175, is, anInt9058);
		Class127[] class127s = new Class127[class175.anInt1917];
		for (int i_493_ = 0; i_493_ < class175.anInt1917; i_493_++) {
			short i_494_ = class175.aShortArray1918[i_493_];
			short i_495_ = class175.aShortArray1940[i_493_];
			short i_496_ = class175.aShortArray1920[i_493_];
			int i_497_ = anIntArray9053[i_495_] - anIntArray9053[i_494_];
			int i_498_ = anIntArray9046[i_495_] - anIntArray9046[i_494_];
			int i_499_ = anIntArray9047[i_495_] - anIntArray9047[i_494_];
			int i_500_ = anIntArray9053[i_496_] - anIntArray9053[i_494_];
			int i_501_ = anIntArray9046[i_496_] - anIntArray9046[i_494_];
			int i_502_ = anIntArray9047[i_496_] - anIntArray9047[i_494_];
			int i_503_ = i_498_ * i_502_ - i_501_ * i_499_;
			int i_504_ = i_499_ * i_500_ - i_502_ * i_497_;
			int i_505_;
			for (i_505_ = i_497_ * i_501_ - i_500_ * i_498_; (i_503_ > 8192 || i_504_ > 8192 || i_505_ > 8192 || i_503_ < -8192 || i_504_ < -8192 || i_505_ < -8192); i_505_ >>= 1) {
				i_503_ >>= 1;
				i_504_ >>= 1;
			}
			int i_506_ = (int) Math.sqrt((double) (i_503_ * i_503_ + i_504_ * i_504_ + i_505_ * i_505_));
			if (i_506_ <= 0)
				i_506_ = 1;
			i_503_ = i_503_ * 256 / i_506_;
			i_504_ = i_504_ * 256 / i_506_;
			i_505_ = i_505_ * 256 / i_506_;
			byte i_507_ = (class175.aByteArray1928 == null ? (byte) 0 : class175.aByteArray1928[i_493_]);
			if (i_507_ == 0) {
				Class133 class133 = class133s[i_494_];
				class133.anInt1558 += i_503_;
				class133.anInt1560 += i_504_;
				class133.anInt1559 += i_505_;
				class133.anInt1557++;
				class133 = class133s[i_495_];
				class133.anInt1558 += i_503_;
				class133.anInt1560 += i_504_;
				class133.anInt1559 += i_505_;
				class133.anInt1557++;
				class133 = class133s[i_496_];
				class133.anInt1558 += i_503_;
				class133.anInt1560 += i_504_;
				class133.anInt1559 += i_505_;
				class133.anInt1557++;
			} else if (i_507_ == 1) {
				Class127 class127 = class127s[i_493_] = new Class127();
				class127.anInt1530 = i_503_;
				class127.anInt1529 = i_504_;
				class127.anInt1531 = i_505_;
			}
		}
		for (int i_508_ = 0; i_508_ < anInt9058; i_508_++) {
			int i_509_ = is[i_508_];
			int i_510_ = class175.aShortArray1942[i_509_] & 0xffff;
			int i_511_ = (class175.aByteArray1907 != null ? class175.aByteArray1907[i_509_] & 0xff : 0);
			short i_512_ = (class175.aShortArray1929 == null ? (short) -1 : class175.aShortArray1929[i_509_]);
			if (i_512_ != -1 && (anInt9037 & 0x40) != 0 && class181.method3544(i_512_, (byte) -108).aBool1806)
				i_512_ = (short) -1;
			float f = 0.0F;
			float f_513_ = 0.0F;
			float f_514_ = 0.0F;
			float f_515_ = 0.0F;
			float f_516_ = 0.0F;
			float f_517_ = 0.0F;
			long l;
			long l_518_;
			long l_519_;
			if (i_512_ != -1) {
				int i_520_ = (class175.aShortArray1927 != null ? class175.aShortArray1927[i_509_] : -1);
				if (i_520_ == 32766) {
					int i_521_ = class175.aByteArray1944[i_509_] & 0xff;
					int i_522_ = class175.aByteArray1949[i_509_] & 0xff;
					int i_523_ = class175.aByteArray1923[i_509_] & 0xff;
					i_521_ += (class175.anIntArray1911[class175.aShortArray1918[i_509_]]);
					l_519_ = (long) i_521_;
					i_522_ += (class175.anIntArray1911[class175.aShortArray1940[i_509_]]);
					l_518_ = (long) i_521_;
					i_523_ += (class175.anIntArray1911[class175.aShortArray1920[i_509_]]);
					l = (long) i_521_;
					f = class175.aFloatArray1915[i_521_];
					f_513_ = class175.aFloatArray1931[i_521_];
					f_514_ = class175.aFloatArray1915[i_522_];
					f_515_ = class175.aFloatArray1931[i_522_];
					f_516_ = class175.aFloatArray1915[i_523_];
					f_517_ = class175.aFloatArray1931[i_523_];
				} else if (i_520_ == -1) {
					f = 0.0F;
					f_513_ = 1.0F;
					l_519_ = 65535L;
					f_514_ = 1.0F;
					f_515_ = 1.0F;
					l_518_ = 131071L;
					f_516_ = 0.0F;
					f_517_ = 0.0F;
					l = 196607L;
				} else {
					i_520_ &= 0xffff;
					int i_524_ = 0;
					int i_525_ = 0;
					int i_526_ = 0;
					byte i_527_ = class175.aByteArray1936[i_520_];
					if (i_527_ == 0) {
						short i_528_ = class175.aShortArray1918[i_509_];
						short i_529_ = class175.aShortArray1940[i_509_];
						short i_530_ = class175.aShortArray1920[i_509_];
						short i_531_ = class175.aShortArray1937[i_520_];
						short i_532_ = class175.aShortArray1938[i_520_];
						short i_533_ = class175.aShortArray1939[i_520_];
						float f_534_ = (float) class175.anIntArray1908[i_531_];
						float f_535_ = (float) class175.anIntArray1909[i_531_];
						float f_536_ = (float) class175.anIntArray1910[i_531_];
						float f_537_ = (float) class175.anIntArray1908[i_532_] - f_534_;
						float f_538_ = (float) class175.anIntArray1909[i_532_] - f_535_;
						float f_539_ = (float) class175.anIntArray1910[i_532_] - f_536_;
						float f_540_ = (float) class175.anIntArray1908[i_533_] - f_534_;
						float f_541_ = (float) class175.anIntArray1909[i_533_] - f_535_;
						float f_542_ = (float) class175.anIntArray1910[i_533_] - f_536_;
						float f_543_ = (float) class175.anIntArray1908[i_528_] - f_534_;
						float f_544_ = (float) class175.anIntArray1909[i_528_] - f_535_;
						float f_545_ = (float) class175.anIntArray1910[i_528_] - f_536_;
						float f_546_ = (float) class175.anIntArray1908[i_529_] - f_534_;
						float f_547_ = (float) class175.anIntArray1909[i_529_] - f_535_;
						float f_548_ = (float) class175.anIntArray1910[i_529_] - f_536_;
						float f_549_ = (float) class175.anIntArray1908[i_530_] - f_534_;
						float f_550_ = (float) class175.anIntArray1909[i_530_] - f_535_;
						float f_551_ = (float) class175.anIntArray1910[i_530_] - f_536_;
						float f_552_ = f_538_ * f_542_ - f_539_ * f_541_;
						float f_553_ = f_539_ * f_540_ - f_537_ * f_542_;
						float f_554_ = f_537_ * f_541_ - f_538_ * f_540_;
						float f_555_ = f_541_ * f_554_ - f_542_ * f_553_;
						float f_556_ = f_542_ * f_552_ - f_540_ * f_554_;
						float f_557_ = f_540_ * f_553_ - f_541_ * f_552_;
						float f_558_ = 1.0F / (f_555_ * f_537_ + f_556_ * f_538_ + f_557_ * f_539_);
						f = (f_555_ * f_543_ + f_556_ * f_544_ + f_557_ * f_545_) * f_558_;
						f_514_ = (f_555_ * f_546_ + f_556_ * f_547_ + f_557_ * f_548_) * f_558_;
						f_516_ = (f_555_ * f_549_ + f_556_ * f_550_ + f_557_ * f_551_) * f_558_;
						f_555_ = f_538_ * f_554_ - f_539_ * f_553_;
						f_556_ = f_539_ * f_552_ - f_537_ * f_554_;
						f_557_ = f_537_ * f_553_ - f_538_ * f_552_;
						f_558_ = 1.0F / (f_555_ * f_540_ + f_556_ * f_541_ + f_557_ * f_542_);
						f_513_ = (f_555_ * f_543_ + f_556_ * f_544_ + f_557_ * f_545_) * f_558_;
						f_515_ = (f_555_ * f_546_ + f_556_ * f_547_ + f_557_ * f_548_) * f_558_;
						f_517_ = (f_555_ * f_549_ + f_556_ * f_550_ + f_557_ * f_551_) * f_558_;
					} else {
						short i_559_ = class175.aShortArray1918[i_509_];
						short i_560_ = class175.aShortArray1940[i_509_];
						short i_561_ = class175.aShortArray1920[i_509_];
						int i_562_ = class173.anIntArray1887[i_520_];
						int i_563_ = class173.anIntArray1884[i_520_];
						int i_564_ = class173.anIntArray1885[i_520_];
						float[] fs = class173.aFloatArrayArray1886[i_520_];
						byte i_565_ = class175.aByteArray1932[i_520_];
						float f_566_ = (float) class175.anIntArray1902[i_520_] / 256.0F;
						if (i_527_ == 1) {
							float f_567_ = ((float) class175.anIntArray1943[i_520_] / 1024.0F);
							method2857(class175.anIntArray1908[i_559_], class175.anIntArray1909[i_559_], class175.anIntArray1910[i_559_], i_562_, i_563_, i_564_, fs, f_567_, i_565_, f_566_, aFloatArray9097);
							f = aFloatArray9097[0];
							f_513_ = aFloatArray9097[1];
							method2857(class175.anIntArray1908[i_560_], class175.anIntArray1909[i_560_], class175.anIntArray1910[i_560_], i_562_, i_563_, i_564_, fs, f_567_, i_565_, f_566_, aFloatArray9097);
							f_514_ = aFloatArray9097[0];
							f_515_ = aFloatArray9097[1];
							method2857(class175.anIntArray1908[i_561_], class175.anIntArray1909[i_561_], class175.anIntArray1910[i_561_], i_562_, i_563_, i_564_, fs, f_567_, i_565_, f_566_, aFloatArray9097);
							f_516_ = aFloatArray9097[0];
							f_517_ = aFloatArray9097[1];
							float f_568_ = f_567_ / 2.0F;
							if ((i_565_ & 0x1) == 0) {
								if (f_514_ - f > f_568_) {
									f_514_ -= f_567_;
									i_525_ = 1;
								} else if (f - f_514_ > f_568_) {
									f_514_ += f_567_;
									i_525_ = 2;
								}
								if (f_516_ - f > f_568_) {
									f_516_ -= f_567_;
									i_526_ = 1;
								} else if (f - f_516_ > f_568_) {
									f_516_ += f_567_;
									i_526_ = 2;
								}
							} else {
								if (f_515_ - f_513_ > f_568_) {
									f_515_ -= f_567_;
									i_525_ = 1;
								} else if (f_513_ - f_515_ > f_568_) {
									f_515_ += f_567_;
									i_525_ = 2;
								}
								if (f_517_ - f_513_ > f_568_) {
									f_517_ -= f_567_;
									i_526_ = 1;
								} else if (f_513_ - f_517_ > f_568_) {
									f_517_ += f_567_;
									i_526_ = 2;
								}
							}
						} else if (i_527_ == 2) {
							float f_569_ = ((float) class175.anIntArray1950[i_520_] / 256.0F);
							float f_570_ = ((float) class175.anIntArray1945[i_520_] / 256.0F);
							int i_571_ = (class175.anIntArray1908[i_560_] - class175.anIntArray1908[i_559_]);
							int i_572_ = (class175.anIntArray1909[i_560_] - class175.anIntArray1909[i_559_]);
							int i_573_ = (class175.anIntArray1910[i_560_] - class175.anIntArray1910[i_559_]);
							int i_574_ = (class175.anIntArray1908[i_561_] - class175.anIntArray1908[i_559_]);
							int i_575_ = (class175.anIntArray1909[i_561_] - class175.anIntArray1909[i_559_]);
							int i_576_ = (class175.anIntArray1910[i_561_] - class175.anIntArray1910[i_559_]);
							int i_577_ = i_572_ * i_576_ - i_575_ * i_573_;
							int i_578_ = i_573_ * i_574_ - i_576_ * i_571_;
							int i_579_ = i_571_ * i_575_ - i_574_ * i_572_;
							float f_580_ = (64.0F / (float) class175.anIntArray1930[i_520_]);
							float f_581_ = (64.0F / (float) class175.anIntArray1941[i_520_]);
							float f_582_ = (64.0F / (float) class175.anIntArray1943[i_520_]);
							float f_583_ = (((float) i_577_ * fs[0] + (float) i_578_ * fs[1] + (float) i_579_ * fs[2]) / f_580_);
							float f_584_ = (((float) i_577_ * fs[3] + (float) i_578_ * fs[4] + (float) i_579_ * fs[5]) / f_581_);
							float f_585_ = (((float) i_577_ * fs[6] + (float) i_578_ * fs[7] + (float) i_579_ * fs[8]) / f_582_);
							i_524_ = method2858(f_583_, f_584_, f_585_);
							method2859(class175.anIntArray1908[i_559_], class175.anIntArray1909[i_559_], class175.anIntArray1910[i_559_], i_562_, i_563_, i_564_, i_524_, fs, i_565_, f_566_, f_569_, f_570_, aFloatArray9097);
							f = aFloatArray9097[0];
							f_513_ = aFloatArray9097[1];
							method2859(class175.anIntArray1908[i_560_], class175.anIntArray1909[i_560_], class175.anIntArray1910[i_560_], i_562_, i_563_, i_564_, i_524_, fs, i_565_, f_566_, f_569_, f_570_, aFloatArray9097);
							f_514_ = aFloatArray9097[0];
							f_515_ = aFloatArray9097[1];
							method2859(class175.anIntArray1908[i_561_], class175.anIntArray1909[i_561_], class175.anIntArray1910[i_561_], i_562_, i_563_, i_564_, i_524_, fs, i_565_, f_566_, f_569_, f_570_, aFloatArray9097);
							f_516_ = aFloatArray9097[0];
							f_517_ = aFloatArray9097[1];
						} else if (i_527_ == 3) {
							method2856(class175.anIntArray1908[i_559_], class175.anIntArray1909[i_559_], class175.anIntArray1910[i_559_], i_562_, i_563_, i_564_, fs, i_565_, f_566_, aFloatArray9097);
							f = aFloatArray9097[0];
							f_513_ = aFloatArray9097[1];
							method2856(class175.anIntArray1908[i_560_], class175.anIntArray1909[i_560_], class175.anIntArray1910[i_560_], i_562_, i_563_, i_564_, fs, i_565_, f_566_, aFloatArray9097);
							f_514_ = aFloatArray9097[0];
							f_515_ = aFloatArray9097[1];
							method2856(class175.anIntArray1908[i_561_], class175.anIntArray1909[i_561_], class175.anIntArray1910[i_561_], i_562_, i_563_, i_564_, fs, i_565_, f_566_, aFloatArray9097);
							f_516_ = aFloatArray9097[0];
							f_517_ = aFloatArray9097[1];
							if ((i_565_ & 0x1) == 0) {
								if (f_514_ - f > 0.5F) {
									f_514_--;
									i_525_ = 1;
								} else if (f - f_514_ > 0.5F) {
									f_514_++;
									i_525_ = 2;
								}
								if (f_516_ - f > 0.5F) {
									f_516_--;
									i_526_ = 1;
								} else if (f - f_516_ > 0.5F) {
									f_516_++;
									i_526_ = 2;
								}
							} else {
								if (f_515_ - f_513_ > 0.5F) {
									f_515_--;
									i_525_ = 1;
								} else if (f_513_ - f_515_ > 0.5F) {
									f_515_++;
									i_525_ = 2;
								}
								if (f_517_ - f_513_ > 0.5F) {
									f_517_--;
									i_526_ = 1;
								} else if (f_513_ - f_517_ > 0.5F) {
									f_517_++;
									i_526_ = 2;
								}
							}
						}
					}
					l_519_ = (long) (i_524_ << 16 | i_520_);
					l_518_ = (long) (i_525_ << 19) | l_519_;
					l = (long) (i_526_ << 19) | l_519_;
				}
			} else {
				l = 0L;
				l_518_ = 0L;
				l_519_ = 0L;
			}
			byte i_586_ = (class175.aByteArray1928 != null ? class175.aByteArray1928[i_509_] : (byte) 0);
			if (i_586_ == 0) {
				long l_587_ = (long) ((i_510_ << 8) + i_511_);
				short i_588_ = class175.aShortArray1918[i_509_];
				short i_589_ = class175.aShortArray1940[i_509_];
				short i_590_ = class175.aShortArray1920[i_509_];
				Class133 class133 = class133s[i_588_];
				aShortArray9062[i_508_] = method14562(class175, i_588_, l_587_ | l_519_ << 24, class133.anInt1558, class133.anInt1560, class133.anInt1559, class133.anInt1557, f, f_513_);
				class133 = class133s[i_589_];
				aShortArray9055[i_508_] = method14562(class175, i_589_, l_587_ | l_518_ << 24, class133.anInt1558, class133.anInt1560, class133.anInt1559, class133.anInt1557, f_514_, f_515_);
				class133 = class133s[i_590_];
				aShortArray9050[i_508_] = method14562(class175, i_590_, l_587_ | l << 24, class133.anInt1558, class133.anInt1560, class133.anInt1559, class133.anInt1557, f_516_, f_517_);
			} else if (i_586_ == 1) {
				Class127 class127 = class127s[i_509_];
				long l_591_ = (((long) (class127.anInt1530 & ~0x7fffffff) << 9) + ((long) (class127.anInt1529 + 256) << 32) + ((long) (class127.anInt1531 + 256) << 24) + (long) (i_510_ << 8) + (long) i_511_);
				aShortArray9062[i_508_] = method14562(class175, class175.aShortArray1918[i_509_], l_591_ | l_519_ << 41, class127.anInt1530, class127.anInt1529, class127.anInt1531, 0, f, f_513_);
				aShortArray9055[i_508_] = method14562(class175, class175.aShortArray1940[i_509_], l_591_ | l_519_ << 41, class127.anInt1530, class127.anInt1529, class127.anInt1531, 0, f_514_, f_515_);
				aShortArray9050[i_508_] = method14562(class175, class175.aShortArray1920[i_509_], l_591_ | l_519_ << 41, class127.anInt1530, class127.anInt1529, class127.anInt1531, 0, f_516_, f_517_);
			}
			if (class175.aByteArray1907 != null)
				aByteArray9061[i_508_] = class175.aByteArray1907[i_509_];
			if (class175.aShortArray1935 != null)
				aShortArray9067[i_508_] = class175.aShortArray1935[i_509_];
			aShortArray9060[i_508_] = class175.aShortArray1942[i_509_];
			aShortArray9065[i_508_] = i_512_;
		}
		int i_592_ = 0;
		short i_593_ = -10000;
		for (int i_594_ = 0; i_594_ < anInt9079; i_594_++) {
			short i_595_ = aShortArray9065[i_594_];
			if (i_595_ != i_593_) {
				i_592_++;
				i_593_ = i_595_;
			}
		}
		anIntArray9087 = new int[i_592_ + 1];
		i_592_ = 0;
		i_593_ = (short) -10000;
		for (int i_596_ = 0; i_596_ < anInt9079; i_596_++) {
			short i_597_ = aShortArray9065[i_596_];
			if (i_597_ != i_593_) {
				anIntArray9087[i_592_++] = i_596_;
				i_593_ = i_597_;
			}
		}
		anIntArray9087[i_592_] = anInt9079;
		aLongArray9083 = null;
		aShortArray9092 = method14550(aShortArray9092, anInt9059);
		aShortArray9052 = method14550(aShortArray9052, anInt9059);
		aShortArray9029 = method14550(aShortArray9029, anInt9059);
		aByteArray9091 = method14536(aByteArray9091, anInt9059);
		aFloatArray9056 = method14538(aFloatArray9056, anInt9059);
		aFloatArray9085 = method14538(aFloatArray9085, anInt9059);
		if (class175.anIntArray1921 != null && Class134.method2216(i, anInt9037))
			anIntArrayArray9048 = class175.method2807(false);
		if (class175.aClass183Array1947 != null && Class134.method2217(i, anInt9037))
			anIntArrayArray9028 = class175.method2809();
		if (class175.anIntArray1914 != null && Class134.method2267(i, anInt9037)) {
			int i_598_ = 0;
			int[] is_599_ = new int[256];
			for (int i_600_ = 0; i_600_ < anInt9058; i_600_++) {
				int i_601_ = class175.anIntArray1914[is[i_600_]];
				if (i_601_ >= 0) {
					is_599_[i_601_]++;
					if (i_601_ > i_598_)
						i_598_ = i_601_;
				}
			}
			anIntArrayArray9042 = new int[i_598_ + 1][];
			for (int i_602_ = 0; i_602_ <= i_598_; i_602_++) {
				anIntArrayArray9042[i_602_] = new int[is_599_[i_602_]];
				is_599_[i_602_] = 0;
			}
			for (int i_603_ = 0; i_603_ < anInt9058; i_603_++) {
				int i_604_ = class175.anIntArray1914[is[i_603_]];
				if (i_604_ >= 0)
					anIntArrayArray9042[i_604_][is_599_[i_604_]++] = i_603_;
			}
		}
	}

	public Class159[] method2916() {
		return aClass159Array9045;
	}

	public byte[] method2999() {
		return aByteArray9061;
	}

	public void method2870(Class432 class432) {
		Class427 class427 = aClass180_Sub3_9035.aClass427_9700;
		class427.method6784(class432);
		if (aClass167Array9090 != null) {
			for (int i = 0; i < aClass167Array9090.length; i++) {
				Class167 class167 = aClass167Array9090[i];
				Class167 class167_605_ = class167;
				if (class167.aClass167_1849 != null)
					class167_605_ = class167.aClass167_1849;
				class167_605_.anInt1855 = (int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) (anIntArray9053[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[4] * (float) anIntArray9046[(class167.anInt1851 * -18705907)]) + (class427.aFloatArray4807[8] * (float) (anIntArray9047[(class167.anInt1851 * -18705907)])))) * 1542395015;
				class167_605_.anInt1856 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) (anIntArray9053[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[5] * (float) (anIntArray9046[(class167.anInt1851 * -18705907)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9047[(class167.anInt1851 * -18705907)])))) * -1886500927);
				class167_605_.anInt1860 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) (anIntArray9053[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[6] * (float) (anIntArray9046[(class167.anInt1851 * -18705907)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9047[(class167.anInt1851 * -18705907)])))) * -1731268533);
				class167_605_.anInt1858 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9053[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9046[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9047[(class167.anInt1852 * -1573542389)])))) * -2034723417);
				class167_605_.anInt1859 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9053[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9046[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9047[(class167.anInt1852 * -1573542389)])))) * -481732551);
				class167_605_.anInt1862 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) anIntArray9053[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[6] * (float) (anIntArray9046[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9047[(class167.anInt1852 * -1573542389)])))) * -980787877);
				class167_605_.anInt1857 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9053[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9046[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9047[(class167.anInt1853 * -2116684303)])))) * -1482367683);
				class167_605_.anInt1850 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9053[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9046[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9047[(class167.anInt1853 * -2116684303)])))) * 1240185219);
				class167_605_.anInt1863 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) anIntArray9053[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[6] * (float) (anIntArray9046[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9047[(class167.anInt1853 * -2116684303)])))) * -857185851);
			}
		}
		if (aClass159Array9045 != null) {
			for (int i = 0; i < aClass159Array9045.length; i++) {
				Class159 class159 = aClass159Array9045[i];
				Class159 class159_606_ = class159;
				if (class159.aClass159_1739 != null)
					class159_606_ = class159.aClass159_1739;
				if (class159.aClass427_1738 != null)
					class159.aClass427_1738.method6750(class427);
				else
					class159.aClass427_1738 = new Class427(class427);
				class159_606_.anInt1744 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9053[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9046[(class159.anInt1740 * -449756941)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9047[(class159.anInt1740 * -449756941)])))) * -306739393);
				class159_606_.anInt1742 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9053[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9046[(class159.anInt1740 * -449756941)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9047[(class159.anInt1740 * -449756941)])))) * -1995176663);
				class159_606_.anInt1743 = (int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) (anIntArray9053[class159.anInt1740 * -449756941])) + (class427.aFloatArray4807[6] * (float) anIntArray9046[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[10] * (float) (anIntArray9047[(class159.anInt1740 * -449756941)])))) * 76591605;
			}
		}
	}

	public boolean method3051(int i, int i_607_, Class432 class432, boolean bool, int i_608_) {
		Class427 class427 = aClass180_Sub3_9035.aClass427_9700;
		class427.method6784(class432);
		class427.method6751(aClass180_Sub3_9035.aClass427_9722);
		boolean bool_609_ = false;
		int i_610_ = 2147483647;
		int i_611_ = -2147483648;
		int i_612_ = 2147483647;
		int i_613_ = -2147483648;
		if (!aBool9078)
			method14542();
		int i_614_ = aShort9082 - aShort9081 >> 1;
		int i_615_ = aShort9080 - aShort9040 >> 1;
		int i_616_ = aShort9076 - aShort9054 >> 1;
		int i_617_ = aShort9081 + i_614_;
		int i_618_ = aShort9040 + i_615_;
		int i_619_ = aShort9054 + i_616_;
		int i_620_ = i_617_ - (i_614_ << i_608_);
		int i_621_ = i_618_ - (i_615_ << i_608_);
		int i_622_ = i_619_ - (i_616_ << i_608_);
		int i_623_ = i_617_ + (i_614_ << i_608_);
		int i_624_ = i_618_ + (i_615_ << i_608_);
		int i_625_ = i_619_ + (i_616_ << i_608_);
		anIntArray9098[0] = i_620_;
		anIntArray9099[0] = i_621_;
		anIntArray9100[0] = i_622_;
		anIntArray9098[1] = i_623_;
		anIntArray9099[1] = i_621_;
		anIntArray9100[1] = i_622_;
		anIntArray9098[2] = i_620_;
		anIntArray9099[2] = i_624_;
		anIntArray9100[2] = i_622_;
		anIntArray9098[3] = i_623_;
		anIntArray9099[3] = i_624_;
		anIntArray9100[3] = i_622_;
		anIntArray9098[4] = i_620_;
		anIntArray9099[4] = i_621_;
		anIntArray9100[4] = i_625_;
		anIntArray9098[5] = i_623_;
		anIntArray9099[5] = i_621_;
		anIntArray9100[5] = i_625_;
		anIntArray9098[6] = i_620_;
		anIntArray9099[6] = i_624_;
		anIntArray9100[6] = i_625_;
		anIntArray9098[7] = i_623_;
		anIntArray9099[7] = i_624_;
		anIntArray9100[7] = i_625_;
		for (int i_626_ = 0; i_626_ < 8; i_626_++) {
			int i_627_ = anIntArray9098[i_626_];
			int i_628_ = anIntArray9099[i_626_];
			int i_629_ = anIntArray9100[i_626_];
			float f = (class427.aFloatArray4807[2] * (float) i_627_ + class427.aFloatArray4807[6] * (float) i_628_ + class427.aFloatArray4807[10] * (float) i_629_ + class427.aFloatArray4807[14]);
			float f_630_ = (class427.aFloatArray4807[3] * (float) i_627_ + class427.aFloatArray4807[7] * (float) i_628_ + class427.aFloatArray4807[11] * (float) i_629_ + class427.aFloatArray4807[15]);
			if (f >= -f_630_) {
				float f_631_ = (class427.aFloatArray4807[0] * (float) i_627_ + class427.aFloatArray4807[4] * (float) i_628_ + class427.aFloatArray4807[8] * (float) i_629_ + class427.aFloatArray4807[12]);
				float f_632_ = (class427.aFloatArray4807[1] * (float) i_627_ + class427.aFloatArray4807[5] * (float) i_628_ + class427.aFloatArray4807[9] * (float) i_629_ + class427.aFloatArray4807[13]);
				int i_633_ = (int) (aClass180_Sub3_9035.aFloat9743 + (aClass180_Sub3_9035.aFloat9740 * f_631_ / f_630_));
				int i_634_ = (int) (aClass180_Sub3_9035.aFloat9745 + (aClass180_Sub3_9035.aFloat9709 * f_632_ / f_630_));
				if (i_633_ < i_610_)
					i_610_ = i_633_;
				if (i_633_ > i_611_)
					i_611_ = i_633_;
				if (i_634_ < i_612_)
					i_612_ = i_634_;
				if (i_634_ > i_613_)
					i_613_ = i_634_;
				bool_609_ = true;
			}
		}
		if (bool_609_ && i > i_610_ && i < i_611_ && i_607_ > i_612_ && i_607_ < i_613_) {
			if (bool)
				return true;
			if (aClass180_Sub3_9035.anIntArray9838.length < anInt9059) {
				aClass180_Sub3_9035.anIntArray9838 = new int[anInt9059];
				aClass180_Sub3_9035.anIntArray9851 = new int[anInt9059];
			}
			int[] is = aClass180_Sub3_9035.anIntArray9838;
			int[] is_635_ = aClass180_Sub3_9035.anIntArray9851;
			for (int i_636_ = 0; i_636_ < anInt9064; i_636_++) {
				int i_637_ = anIntArray9053[i_636_];
				int i_638_ = anIntArray9046[i_636_];
				int i_639_ = anIntArray9047[i_636_];
				float f = (class427.aFloatArray4807[2] * (float) i_637_ + class427.aFloatArray4807[6] * (float) i_638_ + class427.aFloatArray4807[10] * (float) i_639_ + class427.aFloatArray4807[14]);
				float f_640_ = (class427.aFloatArray4807[3] * (float) i_637_ + class427.aFloatArray4807[7] * (float) i_638_ + class427.aFloatArray4807[11] * (float) i_639_ + class427.aFloatArray4807[15]);
				if (f >= -f_640_) {
					float f_641_ = (class427.aFloatArray4807[0] * (float) i_637_ + class427.aFloatArray4807[4] * (float) i_638_ + class427.aFloatArray4807[8] * (float) i_639_ + class427.aFloatArray4807[12]);
					float f_642_ = (class427.aFloatArray4807[1] * (float) i_637_ + class427.aFloatArray4807[5] * (float) i_638_ + class427.aFloatArray4807[9] * (float) i_639_ + class427.aFloatArray4807[13]);
					int i_643_ = anIntArray9088[i_636_];
					int i_644_ = anIntArray9088[i_636_ + 1];
					for (int i_645_ = i_643_; i_645_ < i_644_ && aShortArray9089[i_645_] != 0; i_645_++) {
						int i_646_ = (aShortArray9089[i_645_] & 0xffff) - 1;
						is[i_646_] = (int) (aClass180_Sub3_9035.aFloat9743 + (aClass180_Sub3_9035.aFloat9740 * f_641_ / f_640_));
						is_635_[i_646_] = (int) (aClass180_Sub3_9035.aFloat9745 + (aClass180_Sub3_9035.aFloat9709 * f_642_ / f_640_));
					}
				} else {
					int i_647_ = anIntArray9088[i_636_];
					int i_648_ = anIntArray9088[i_636_ + 1];
					for (int i_649_ = i_647_; i_649_ < i_648_ && aShortArray9089[i_649_] != 0; i_649_++) {
						int i_650_ = (aShortArray9089[i_649_] & 0xffff) - 1;
						is[i_650_] = -999999;
					}
				}
			}
			for (int i_651_ = 0; i_651_ < anInt9058; i_651_++) {
				if (is[aShortArray9062[i_651_] & 0xffff] != -999999 && is[aShortArray9055[i_651_] & 0xffff] != -999999 && is[aShortArray9050[i_651_] & 0xffff] != -999999 && method14580(i, i_607_, is_635_[aShortArray9062[i_651_] & 0xffff], is_635_[aShortArray9055[i_651_] & 0xffff], is_635_[aShortArray9050[i_651_] & 0xffff], is[aShortArray9062[i_651_] & 0xffff], is[aShortArray9055[i_651_] & 0xffff], is[aShortArray9050[i_651_] & 0xffff]))
					return true;
			}
		}
		return false;
	}

	public int method2894() {
		if (!aBool9078)
			method14542();
		return aShort9081;
	}

	void method2947() {
		/* empty */
	}

	void method14546(Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1) {
		if (aClass180_Sub3_9035.anIntArray9838.length < anInt9059) {
			aClass180_Sub3_9035.anIntArray9838 = new int[anInt9059];
			aClass180_Sub3_9035.anIntArray9851 = new int[anInt9059];
		}
		int[] is = aClass180_Sub3_9035.anIntArray9838;
		int[] is_652_ = aClass180_Sub3_9035.anIntArray9851;
		for (int i = 0; i < anInt9064; i++) {
			int i_653_ = (((anIntArray9053[i] - (anIntArray9046[i] * aClass180_Sub3_9035.anInt9785 >> 8)) >> aClass180_Sub3_9035.anInt9850) - class527_sub8_sub8_sub1.anInt12051);
			int i_654_ = (((anIntArray9047[i] - (anIntArray9046[i] * aClass180_Sub3_9035.anInt9786 >> 8)) >> aClass180_Sub3_9035.anInt9850) - class527_sub8_sub8_sub1.anInt12050);
			int i_655_ = anIntArray9088[i];
			int i_656_ = anIntArray9088[i + 1];
			for (int i_657_ = i_655_; i_657_ < i_656_ && aShortArray9089[i_657_] != 0; i_657_++) {
				int i_658_ = (aShortArray9089[i_657_] & 0xffff) - 1;
				is[i_658_] = i_653_;
				is_652_[i_658_] = i_654_;
			}
		}
		for (int i = 0; i < anInt9079; i++) {
			if (aByteArray9061 == null || aByteArray9061[i] <= 128) {
				int i_659_ = aShortArray9062[i] & 0xffff;
				int i_660_ = aShortArray9055[i] & 0xffff;
				int i_661_ = aShortArray9050[i] & 0xffff;
				int i_662_ = is[i_659_];
				int i_663_ = is[i_660_];
				int i_664_ = is[i_661_];
				int i_665_ = is_652_[i_659_];
				int i_666_ = is_652_[i_660_];
				int i_667_ = is_652_[i_661_];
				if (((i_662_ - i_663_) * (i_666_ - i_667_) - (i_666_ - i_665_) * (i_664_ - i_663_)) > 0)
					class527_sub8_sub8_sub1.method18707(i_665_, i_666_, i_667_, i_662_, i_663_, i_664_);
			}
		}
	}

	public int method2865() {
		if (!aBool9078)
			method14542();
		return anInt9051;
	}

	public boolean method3011() {
		return aBool9057;
	}

	void method14547(Class427 class427) {
		if (aClass150Array9093 != null) {
			Class427 class427_668_ = aClass180_Sub3_9035.aClass427_9685;
			aClass180_Sub3_9035.method15428();
			aClass180_Sub3_9035.method3182(!aBool9057);
			aClass180_Sub3_9035.method15409(false);
			aClass180_Sub3_9035.method15385(aClass180_Sub3_9035.aClass129_9844, null, null, (aClass180_Sub3_9035.aClass129_9732));
			for (int i = 0; i < anInt9075; i++) {
				Class150 class150 = aClass150Array9093[i];
				Class130 class130 = aClass130Array9094[i];
				if (!class150.aBool1690 || !aClass180_Sub3_9035.method3204()) {
					float f = ((float) (anIntArray9053[class150.anInt1688] + anIntArray9053[class150.anInt1683] + anIntArray9053[class150.anInt1684]) * 0.3333333F);
					float f_669_ = ((float) (anIntArray9046[class150.anInt1688] + anIntArray9046[class150.anInt1683] + anIntArray9046[class150.anInt1684]) * 0.3333333F);
					float f_670_ = ((float) (anIntArray9047[class150.anInt1688] + anIntArray9047[class150.anInt1683] + anIntArray9047[class150.anInt1684]) * 0.3333333F);
					float f_671_ = (class427.aFloatArray4807[0] * f + class427.aFloatArray4807[4] * f_669_ + class427.aFloatArray4807[8] * f_670_ + class427.aFloatArray4807[12]);
					float f_672_ = (class427.aFloatArray4807[1] * f + class427.aFloatArray4807[5] * f_669_ + class427.aFloatArray4807[9] * f_670_ + class427.aFloatArray4807[13]);
					float f_673_ = (class427.aFloatArray4807[2] * f + class427.aFloatArray4807[6] * f_669_ + class427.aFloatArray4807[10] * f_670_ + class427.aFloatArray4807[14]);
					float f_674_ = ((float) (1.0 / Math.sqrt((double) (f_671_ * f_671_ + f_672_ * f_672_ + f_673_ * f_673_))) * (float) class150.anInt1686);
					class427_668_.method6804(class130.anInt1550, class130.anInt1549 * class150.aShort1691 >> 7, class130.anInt1551 * class150.aShort1685 >> 7, f_671_ + (float) class130.anInt1548 - f_671_ * f_674_, f_672_ + (float) class130.anInt1552 - f_672_ * f_674_, f_673_ - f_673_ * f_674_);
					aClass180_Sub3_9035.method15570(class427_668_);
					int i_675_ = class130.anInt1553;
					OpenGL.glColor4ub((byte) (i_675_ >> 16), (byte) (i_675_ >> 8), (byte) i_675_, (byte) (i_675_ >> 24));
					aClass180_Sub3_9035.method15397(class150.aShort1687);
					aClass180_Sub3_9035.method15525(class150.aByte1689);
					aClass180_Sub3_9035.method15393(7, 0, 4);
				}
			}
			aClass180_Sub3_9035.method3182(true);
			aClass180_Sub3_9035.method15369();
		}
	}

	public void method2926(int i) {
		anInt9036 = i;
		if (aClass158_9041 != null && (anInt9036 & 0x10000) == 0) {
			aShortArray9092 = aClass158_9041.aShortArray1735;
			aShortArray9052 = aClass158_9041.aShortArray1737;
			aShortArray9029 = aClass158_9041.aShortArray1736;
			aByteArray9091 = aClass158_9041.aByteArray1734;
			aClass158_9041 = null;
		}
		aBool9073 = true;
		method14571();
	}

	void method14548(boolean bool) {
		boolean bool_676_ = (aClass129_9069 != null && aClass129_9069.anInterface15_1547 == null);
		boolean bool_677_ = (aClass129_9070 != null && aClass129_9070.anInterface15_1547 == null);
		boolean bool_678_ = (aClass129_9068 != null && aClass129_9068.anInterface15_1547 == null);
		boolean bool_679_ = (aClass129_9071 != null && aClass129_9071.anInterface15_1547 == null);
		if (bool) {
			bool_676_ = bool_676_ & (aByte9038 & 0x2) != 0;
			bool_677_ = bool_677_ & (aByte9038 & 0x4) != 0;
			bool_678_ = bool_678_ & (aByte9038 & 0x1) != 0;
			bool_679_ = bool_679_ & (aByte9038 & 0x8) != 0;
		}
		byte i = 0;
		byte i_680_ = 0;
		byte i_681_ = 0;
		byte i_682_ = 0;
		byte i_683_ = 0;
		if (bool_678_) {
			i_680_ = i;
			i += 12;
		}
		if (bool_676_) {
			i_681_ = i;
			i += 4;
		}
		if (bool_677_) {
			i_682_ = i;
			i += 12;
		}
		if (bool_679_) {
			i_683_ = i;
			i += 8;
		}
		if (i != 0) {
			if ((aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819.buffer).length < anInt9059 * i)
				aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819 = new Class527_Sub38_Sub1((anInt9059 + 100) * i);
			else
				aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819.anInt10689 = 0;
			Class527_Sub38_Sub1 class527_sub38_sub1 = aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819;
			if (bool_678_) {
				if (aClass180_Sub3_9035.aBool9788) {
					for (int i_684_ = 0; i_684_ < anInt9064; i_684_++) {
						int i_685_ = Stream.floatToRawIntBits((float) anIntArray9053[i_684_]);
						int i_686_ = Stream.floatToRawIntBits((float) anIntArray9046[i_684_]);
						int i_687_ = Stream.floatToRawIntBits((float) anIntArray9047[i_684_]);
						int i_688_ = anIntArray9088[i_684_];
						int i_689_ = anIntArray9088[i_684_ + 1];
						for (int i_690_ = i_688_; i_690_ < i_689_ && aShortArray9089[i_690_] != 0; i_690_++) {
							int i_691_ = (aShortArray9089[i_690_] & 0xffff) - 1;
							class527_sub38_sub1.anInt10689 = i_691_ * i * 1474750881;
							class527_sub38_sub1.writeInt(i_685_, 701369349);
							class527_sub38_sub1.writeInt(i_686_, -1243528030);
							class527_sub38_sub1.writeInt(i_687_, -528739716);
						}
					}
				} else {
					for (int i_692_ = 0; i_692_ < anInt9064; i_692_++) {
						int i_693_ = Stream.floatToRawIntBits((float) anIntArray9053[i_692_]);
						int i_694_ = Stream.floatToRawIntBits((float) anIntArray9046[i_692_]);
						int i_695_ = Stream.floatToRawIntBits((float) anIntArray9047[i_692_]);
						int i_696_ = anIntArray9088[i_692_];
						int i_697_ = anIntArray9088[i_692_ + 1];
						for (int i_698_ = i_696_; i_698_ < i_697_ && aShortArray9089[i_698_] != 0; i_698_++) {
							int i_699_ = (aShortArray9089[i_698_] & 0xffff) - 1;
							class527_sub38_sub1.anInt10689 = i_699_ * i * 1474750881;
							class527_sub38_sub1.writeIntLE(i_693_, (byte) 110);
							class527_sub38_sub1.writeIntLE(i_694_, (byte) 124);
							class527_sub38_sub1.writeIntLE(i_695_, (byte) 68);
						}
					}
				}
			}
			if (bool_676_) {
				if (aClass129_9070 == null) {
					short[] is;
					short[] is_700_;
					short[] is_701_;
					byte[] is_702_;
					if (aClass158_9041 != null) {
						is = aClass158_9041.aShortArray1735;
						is_700_ = aClass158_9041.aShortArray1737;
						is_701_ = aClass158_9041.aShortArray1736;
						is_702_ = aClass158_9041.aByteArray1734;
					} else {
						is = aShortArray9092;
						is_700_ = aShortArray9052;
						is_701_ = aShortArray9029;
						is_702_ = aByteArray9091;
					}
					float f = aClass180_Sub3_9035.aFloatArray9773[0];
					float f_703_ = aClass180_Sub3_9035.aFloatArray9773[1];
					float f_704_ = aClass180_Sub3_9035.aFloatArray9773[2];
					float f_705_ = aClass180_Sub3_9035.aFloat9779;
					float f_706_ = (aClass180_Sub3_9035.aFloat9780 * 768.0F / (float) aShort9095);
					float f_707_ = (aClass180_Sub3_9035.aFloat9781 * 768.0F / (float) aShort9095);
					for (int i_708_ = 0; i_708_ < anInt9058; i_708_++) {
						int i_709_ = method14549(aShortArray9060[i_708_], aShortArray9065[i_708_], aShort9039, aByteArray9061[i_708_]);
						float f_710_ = ((float) (i_709_ >>> 24) * aClass180_Sub3_9035.aFloat9795);
						float f_711_ = ((float) (i_709_ >> 16 & 0xff) * aClass180_Sub3_9035.aFloat9777);
						float f_712_ = ((float) (i_709_ >> 8 & 0xff) * aClass180_Sub3_9035.aFloat9778);
						int i_713_ = aShortArray9062[i_708_] & 0xffff;
						short i_714_ = (short) is_702_[i_713_];
						float f_715_;
						if (i_714_ == 0)
							f_715_ = ((f * (float) is[i_713_] + f_703_ * (float) is_700_[i_713_] + f_704_ * (float) is_701_[i_713_]) * 0.0026041667F);
						else
							f_715_ = ((f * (float) is[i_713_] + f_703_ * (float) is_700_[i_713_] + f_704_ * (float) is_701_[i_713_]) / (float) (i_714_ * 256));
						float f_716_ = f_705_ + f_715_ * (f_715_ < 0.0F ? f_707_ : f_706_);
						int i_717_ = (int) (f_710_ * f_716_);
						if (i_717_ < 0)
							i_717_ = 0;
						else if (i_717_ > 255)
							i_717_ = 255;
						int i_718_ = (int) (f_711_ * f_716_);
						if (i_718_ < 0)
							i_718_ = 0;
						else if (i_718_ > 255)
							i_718_ = 255;
						int i_719_ = (int) (f_712_ * f_716_);
						if (i_719_ < 0)
							i_719_ = 0;
						else if (i_719_ > 255)
							i_719_ = 255;
						class527_sub38_sub1.anInt10689 = (i_681_ + i_713_ * i) * 1474750881;
						class527_sub38_sub1.writeByte(i_717_, 1373126491);
						class527_sub38_sub1.writeByte(i_718_, 1946720298);
						class527_sub38_sub1.writeByte(i_719_, 626673329);
						class527_sub38_sub1.writeByte(255 - ((aByteArray9061[i_708_]) & 0xff), 1847948685);
						i_713_ = aShortArray9055[i_708_] & 0xffff;
						i_714_ = (short) is_702_[i_713_];
						if (i_714_ == 0)
							f_715_ = ((f * (float) is[i_713_] + f_703_ * (float) is_700_[i_713_] + f_704_ * (float) is_701_[i_713_]) * 0.0026041667F);
						else
							f_715_ = ((f * (float) is[i_713_] + f_703_ * (float) is_700_[i_713_] + f_704_ * (float) is_701_[i_713_]) / (float) (i_714_ * 256));
						f_716_ = f_705_ + f_715_ * (f_715_ < 0.0F ? f_707_ : f_706_);
						i_717_ = (int) (f_710_ * f_716_);
						if (i_717_ < 0)
							i_717_ = 0;
						else if (i_717_ > 255)
							i_717_ = 255;
						i_718_ = (int) (f_711_ * f_716_);
						if (i_718_ < 0)
							i_718_ = 0;
						else if (i_718_ > 255)
							i_718_ = 255;
						i_719_ = (int) (f_712_ * f_716_);
						if (i_719_ < 0)
							i_719_ = 0;
						else if (i_719_ > 255)
							i_719_ = 255;
						class527_sub38_sub1.anInt10689 = (i_681_ + i_713_ * i) * 1474750881;
						class527_sub38_sub1.writeByte(i_717_, 1839503691);
						class527_sub38_sub1.writeByte(i_718_, 302235119);
						class527_sub38_sub1.writeByte(i_719_, 1021225195);
						class527_sub38_sub1.writeByte(255 - ((aByteArray9061[i_708_]) & 0xff), -251615558);
						i_713_ = aShortArray9050[i_708_] & 0xffff;
						i_714_ = (short) is_702_[i_713_];
						if (i_714_ == 0)
							f_715_ = ((f * (float) is[i_713_] + f_703_ * (float) is_700_[i_713_] + f_704_ * (float) is_701_[i_713_]) * 0.0026041667F);
						else
							f_715_ = ((f * (float) is[i_713_] + f_703_ * (float) is_700_[i_713_] + f_704_ * (float) is_701_[i_713_]) / (float) (i_714_ * 256));
						f_716_ = f_705_ + f_715_ * (f_715_ < 0.0F ? f_707_ : f_706_);
						i_717_ = (int) (f_710_ * f_716_);
						if (i_717_ < 0)
							i_717_ = 0;
						else if (i_717_ > 255)
							i_717_ = 255;
						i_718_ = (int) (f_711_ * f_716_);
						if (i_718_ < 0)
							i_718_ = 0;
						else if (i_718_ > 255)
							i_718_ = 255;
						i_719_ = (int) (f_712_ * f_716_);
						if (i_719_ < 0)
							i_719_ = 0;
						else if (i_719_ > 255)
							i_719_ = 255;
						class527_sub38_sub1.anInt10689 = (i_681_ + i_713_ * i) * 1474750881;
						class527_sub38_sub1.writeByte(i_717_, 1145536535);
						class527_sub38_sub1.writeByte(i_718_, -1761689564);
						class527_sub38_sub1.writeByte(i_719_, 1547463019);
						class527_sub38_sub1.writeByte(255 - ((aByteArray9061[i_708_]) & 0xff), -1784040188);
					}
				} else {
					for (int i_720_ = 0; i_720_ < anInt9058; i_720_++) {
						int i_721_ = method14549(aShortArray9060[i_720_], aShortArray9065[i_720_], aShort9039, aByteArray9061[i_720_]);
						class527_sub38_sub1.anInt10689 = ((i_681_ + (aShortArray9062[i_720_] & 0xffff) * i) * 1474750881);
						class527_sub38_sub1.writeInt(i_721_, 976082801);
						class527_sub38_sub1.anInt10689 = ((i_681_ + (aShortArray9055[i_720_] & 0xffff) * i) * 1474750881);
						class527_sub38_sub1.writeInt(i_721_, 849091625);
						class527_sub38_sub1.anInt10689 = ((i_681_ + (aShortArray9050[i_720_] & 0xffff) * i) * 1474750881);
						class527_sub38_sub1.writeInt(i_721_, 906770123);
					}
				}
			}
			if (bool_677_) {
				short[] is;
				short[] is_722_;
				short[] is_723_;
				byte[] is_724_;
				if (aClass158_9041 != null) {
					is = aClass158_9041.aShortArray1735;
					is_722_ = aClass158_9041.aShortArray1737;
					is_723_ = aClass158_9041.aShortArray1736;
					is_724_ = aClass158_9041.aByteArray1734;
				} else {
					is = aShortArray9092;
					is_722_ = aShortArray9052;
					is_723_ = aShortArray9029;
					is_724_ = aByteArray9091;
				}
				float f = 3.0F / (float) aShort9095;
				float f_725_ = 3.0F / (float) (aShort9095 + aShort9095 / 2);
				class527_sub38_sub1.anInt10689 = i_682_ * 1474750881;
				if (aClass180_Sub3_9035.aBool9788) {
					for (int i_726_ = 0; i_726_ < anInt9059; i_726_++) {
						int i_727_ = is_724_[i_726_] & 0xff;
						if (i_727_ == 0) {
							class527_sub38_sub1.method18329((float) is[i_726_] * f_725_);
							class527_sub38_sub1.method18329((float) is_722_[i_726_] * f_725_);
							class527_sub38_sub1.method18329((float) is_723_[i_726_] * f_725_);
						} else {
							float f_728_ = f / (float) i_727_;
							class527_sub38_sub1.method18329((float) is[i_726_] * f_728_);
							class527_sub38_sub1.method18329((float) is_722_[i_726_] * f_728_);
							class527_sub38_sub1.method18329((float) is_723_[i_726_] * f_728_);
						}
						class527_sub38_sub1.anInt10689 += (i - 12) * 1474750881;
					}
				} else {
					for (int i_729_ = 0; i_729_ < anInt9059; i_729_++) {
						int i_730_ = is_724_[i_729_] & 0xff;
						if (i_730_ == 0) {
							class527_sub38_sub1.method18331((float) is[i_729_] * f_725_);
							class527_sub38_sub1.method18331((float) is_722_[i_729_] * f_725_);
							class527_sub38_sub1.method18331((float) is_723_[i_729_] * f_725_);
						} else {
							float f_731_ = f / (float) i_730_;
							class527_sub38_sub1.method18331((float) is[i_729_] * f_731_);
							class527_sub38_sub1.method18331((float) is_722_[i_729_] * f_731_);
							class527_sub38_sub1.method18331((float) is_723_[i_729_] * f_731_);
						}
						class527_sub38_sub1.anInt10689 += (i - 12) * 1474750881;
					}
				}
			}
			if (bool_679_) {
				class527_sub38_sub1.anInt10689 = i_683_ * 1474750881;
				if (aClass180_Sub3_9035.aBool9788) {
					for (int i_732_ = 0; i_732_ < anInt9059; i_732_++) {
						class527_sub38_sub1.method18329(aFloatArray9056[i_732_]);
						class527_sub38_sub1.method18329(aFloatArray9085[i_732_]);
						class527_sub38_sub1.anInt10689 += (i - 8) * 1474750881;
					}
				} else {
					for (int i_733_ = 0; i_733_ < anInt9059; i_733_++) {
						class527_sub38_sub1.method18331(aFloatArray9056[i_733_]);
						class527_sub38_sub1.method18331(aFloatArray9085[i_733_]);
						class527_sub38_sub1.anInt10689 += (i - 8) * 1474750881;
					}
				}
			}
			class527_sub38_sub1.anInt10689 = i * anInt9059 * 1474750881;
			Interface15 interface15;
			if (bool) {
				if (anInterface15_9077 == null)
					anInterface15_9077 = (aClass180_Sub3_9035.method15389(i, class527_sub38_sub1.buffer, class527_sub38_sub1.anInt10689 * -441238943, true));
				else
					anInterface15_9077.method90(i, (class527_sub38_sub1.buffer), (class527_sub38_sub1.anInt10689 * -441238943));
				interface15 = anInterface15_9077;
				aByte9038 = (byte) 0;
			} else {
				interface15 = (aClass180_Sub3_9035.method15389(i, class527_sub38_sub1.buffer, class527_sub38_sub1.anInt10689 * -441238943, false));
				aBool9073 = true;
			}
			if (bool_678_) {
				aClass129_9068.anInterface15_1547 = interface15;
				aClass129_9068.aByte1544 = i_680_;
			}
			if (bool_679_) {
				aClass129_9071.anInterface15_1547 = interface15;
				aClass129_9071.aByte1544 = i_683_;
			}
			if (bool_676_) {
				aClass129_9069.anInterface15_1547 = interface15;
				aClass129_9069.aByte1544 = i_681_;
			}
			if (bool_677_) {
				aClass129_9070.anInterface15_1547 = interface15;
				aClass129_9070.aByte1544 = i_682_;
			}
		}
	}

	int method14549(int i, short i_734_, int i_735_, byte i_736_) {
		int i_737_ = Class656.anIntArray8390[method14553(i, i_735_)];
		if (i_734_ != -1) {
			Class163 class163 = aClass180_Sub3_9035.aClass181_2059.method3544(i_734_ & 0xffff, (byte) -27);
			int i_738_ = class163.aByte1808 & 0xff;
			if (i_738_ != 0) {
				int i_739_;
				if (i_735_ < 0)
					i_739_ = 0;
				else if (i_735_ > 127)
					i_739_ = 16777215;
				else
					i_739_ = 131586 * i_735_;
				if (i_738_ == 256)
					i_737_ = i_739_;
				else {
					int i_740_ = i_738_;
					int i_741_ = 256 - i_738_;
					i_737_ = ((((i_739_ & 0xff00ff) * i_740_ + (i_737_ & 0xff00ff) * i_741_) & ~0xff00ff) + (((i_739_ & 0xff00) * i_740_ + (i_737_ & 0xff00) * i_741_) & 0xff0000)) >> 8;
				}
			}
			int i_742_ = class163.aByte1802 & 0xff;
			if (i_742_ != 0) {
				i_742_ += 256;
				int i_743_ = ((i_737_ & 0xff0000) >> 16) * i_742_;
				if (i_743_ > 65535)
					i_743_ = 65535;
				int i_744_ = ((i_737_ & 0xff00) >> 8) * i_742_;
				if (i_744_ > 65535)
					i_744_ = 65535;
				int i_745_ = (i_737_ & 0xff) * i_742_;
				if (i_745_ > 65535)
					i_745_ = 65535;
				i_737_ = (i_743_ << 8 & 0xff0000) + (i_744_ & 0xff00) + (i_745_ >> 8);
			}
		}
		return i_737_ << 8 | 255 - (i_736_ & 0xff);
	}

	public byte[] method2906() {
		return aByteArray9061;
	}

	public void method2889(Class432 class432, Class169 class169, int i) {
		if ((i & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);
		if (anInt9059 != 0) {
			Class427 class427 = aClass180_Sub3_9035.aClass427_9707;
			Class427 class427_746_ = aClass180_Sub3_9035.aClass427_9700;
			Class427 class427_747_ = aClass180_Sub3_9035.aClass427_9841;
			class427_746_.method6784(class432);
			class427_747_.method6750(class427_746_);
			class427_747_.method6751(aClass180_Sub3_9035.aClass427_9722);
			if (!aBool9078)
				method14542();
			float[] fs = aClass180_Sub3_9035.aFloatArray9742;
			class427_746_.method6773(0.0F, (float) aShort9040, 0.0F, fs);
			float f = fs[0];
			float f_748_ = fs[1];
			float f_749_ = fs[2];
			class427_746_.method6773(0.0F, (float) aShort9080, 0.0F, fs);
			float f_750_ = fs[0];
			float f_751_ = fs[1];
			float f_752_ = fs[2];
			for (int i_753_ = 0; i_753_ < 6; i_753_++) {
				float[] fs_754_ = aClass180_Sub3_9035.aFloatArrayArray9696[i_753_];
				float f_755_ = (fs_754_[0] * f + fs_754_[1] * f_748_ + fs_754_[2] * f_749_ + fs_754_[3] + (float) anInt9051);
				float f_756_ = (fs_754_[0] * f_750_ + fs_754_[1] * f_751_ + fs_754_[2] * f_752_ + fs_754_[3] + (float) anInt9051);
				if (f_755_ < 0.0F && f_756_ < 0.0F)
					return;
			}
			if (class169 != null) {
				boolean bool = false;
				boolean bool_757_ = true;
				int i_758_ = aShort9081 + aShort9082 >> 1;
				int i_759_ = aShort9054 + aShort9076 >> 1;
				int i_760_ = i_758_;
				short i_761_ = aShort9040;
				int i_762_ = i_759_;
				float f_763_ = (class427_747_.aFloatArray4807[0] * (float) i_760_ + class427_747_.aFloatArray4807[4] * (float) i_761_ + class427_747_.aFloatArray4807[8] * (float) i_762_ + class427_747_.aFloatArray4807[12]);
				float f_764_ = (class427_747_.aFloatArray4807[1] * (float) i_760_ + class427_747_.aFloatArray4807[5] * (float) i_761_ + class427_747_.aFloatArray4807[9] * (float) i_762_ + class427_747_.aFloatArray4807[13]);
				float f_765_ = (class427_747_.aFloatArray4807[2] * (float) i_760_ + class427_747_.aFloatArray4807[6] * (float) i_761_ + class427_747_.aFloatArray4807[10] * (float) i_762_ + class427_747_.aFloatArray4807[14]);
				float f_766_ = (class427_747_.aFloatArray4807[3] * (float) i_760_ + class427_747_.aFloatArray4807[7] * (float) i_761_ + class427_747_.aFloatArray4807[11] * (float) i_762_ + class427_747_.aFloatArray4807[15]);
				if (f_765_ >= -f_766_) {
					class169.anInt1872 = (int) (aClass180_Sub3_9035.aFloat9743 + (aClass180_Sub3_9035.aFloat9740 * f_763_ / f_766_));
					class169.anInt1876 = (int) (aClass180_Sub3_9035.aFloat9745 + (aClass180_Sub3_9035.aFloat9709 * f_764_ / f_766_));
				} else
					bool = true;
				i_760_ = i_758_;
				i_761_ = aShort9080;
				i_762_ = i_759_;
				float f_767_ = (class427_747_.aFloatArray4807[0] * (float) i_760_ + class427_747_.aFloatArray4807[4] * (float) i_761_ + class427_747_.aFloatArray4807[8] * (float) i_762_ + class427_747_.aFloatArray4807[12]);
				float f_768_ = (class427_747_.aFloatArray4807[1] * (float) i_760_ + class427_747_.aFloatArray4807[5] * (float) i_761_ + class427_747_.aFloatArray4807[9] * (float) i_762_ + class427_747_.aFloatArray4807[13]);
				float f_769_ = (class427_747_.aFloatArray4807[2] * (float) i_760_ + class427_747_.aFloatArray4807[6] * (float) i_761_ + class427_747_.aFloatArray4807[10] * (float) i_762_ + class427_747_.aFloatArray4807[14]);
				float f_770_ = (class427_747_.aFloatArray4807[3] * (float) i_760_ + class427_747_.aFloatArray4807[7] * (float) i_761_ + class427_747_.aFloatArray4807[11] * (float) i_762_ + class427_747_.aFloatArray4807[15]);
				if (f_769_ >= -f_770_) {
					class169.anInt1873 = (int) (aClass180_Sub3_9035.aFloat9743 + (aClass180_Sub3_9035.aFloat9740 * f_767_ / f_770_));
					class169.anInt1875 = (int) (aClass180_Sub3_9035.aFloat9745 + (aClass180_Sub3_9035.aFloat9709 * f_768_ / f_770_));
				} else
					bool = true;
				if (bool) {
					if (f_765_ < -f_766_ && f_769_ < -f_770_)
						bool_757_ = false;
					else if (f_765_ < -f_766_) {
						float f_771_ = (f_765_ + f_766_) / (f_769_ + f_770_) - 1.0F;
						float f_772_ = f_763_ + f_771_ * (f_767_ - f_763_);
						float f_773_ = f_764_ + f_771_ * (f_768_ - f_764_);
						float f_774_ = f_766_ + f_771_ * (f_770_ - f_766_);
						class169.anInt1872 = (int) (aClass180_Sub3_9035.aFloat9743 + (aClass180_Sub3_9035.aFloat9740 * f_772_ / f_774_));
						class169.anInt1876 = (int) (aClass180_Sub3_9035.aFloat9745 + (aClass180_Sub3_9035.aFloat9709 * f_773_ / f_774_));
					} else if (f_769_ < -f_770_) {
						float f_775_ = (f_769_ + f_770_) / (f_765_ + f_766_) - 1.0F;
						float f_776_ = f_767_ + f_775_ * (f_763_ - f_767_);
						float f_777_ = f_768_ + f_775_ * (f_764_ - f_768_);
						float f_778_ = f_770_ + f_775_ * (f_766_ - f_770_);
						class169.anInt1873 = (int) (aClass180_Sub3_9035.aFloat9743 + (aClass180_Sub3_9035.aFloat9740 * f_776_ / f_778_));
						class169.anInt1875 = (int) (aClass180_Sub3_9035.aFloat9745 + (aClass180_Sub3_9035.aFloat9709 * f_777_ / f_778_));
					}
				}
				if (bool_757_) {
					if (f_765_ / f_766_ > f_769_ / f_770_) {
						float f_779_ = (f_763_ + (class427.aFloatArray4807[0] * (float) anInt9051) + class427.aFloatArray4807[12]);
						float f_780_ = (f_766_ + (class427.aFloatArray4807[3] * (float) anInt9051) + class427.aFloatArray4807[15]);
						class169.anInt1877 = (int) (aClass180_Sub3_9035.aFloat9743 - (float) class169.anInt1872 + (aClass180_Sub3_9035.aFloat9740 * f_779_ / f_780_));
					} else {
						float f_781_ = (f_767_ + (class427.aFloatArray4807[0] * (float) anInt9051) + class427.aFloatArray4807[12]);
						float f_782_ = (f_770_ + (class427.aFloatArray4807[3] * (float) anInt9051) + class427.aFloatArray4807[15]);
						class169.anInt1877 = (int) (aClass180_Sub3_9035.aFloat9743 - (float) class169.anInt1873 + (aClass180_Sub3_9035.aFloat9740 * f_781_ / f_782_));
					}
					class169.aBool1874 = true;
				}
			}
			aClass180_Sub3_9035.method15396();
			aClass180_Sub3_9035.method15367(class427_746_);
			method14541();
			aClass180_Sub3_9035.method15369();
			class427_746_.method6751(aClass180_Sub3_9035.aClass427_9736);
			method14547(class427_746_);
			if ((i & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}
	}

	public void method3036(Class176 class176, int i, int i_783_, int i_784_, boolean bool) {
		Class176_Sub1 class176_sub1_785_ = (Class176_Sub1) class176;
		if (anInt9058 != 0 && class176_sub1_785_.anInt9058 != 0) {
			int i_786_ = class176_sub1_785_.anInt9064;
			int[] is = class176_sub1_785_.anIntArray9053;
			int[] is_787_ = class176_sub1_785_.anIntArray9046;
			int[] is_788_ = class176_sub1_785_.anIntArray9047;
			short[] is_789_ = class176_sub1_785_.aShortArray9092;
			short[] is_790_ = class176_sub1_785_.aShortArray9052;
			short[] is_791_ = class176_sub1_785_.aShortArray9029;
			byte[] is_792_ = class176_sub1_785_.aByteArray9091;
			short[] is_793_;
			short[] is_794_;
			short[] is_795_;
			byte[] is_796_;
			if (aClass158_9041 != null) {
				is_793_ = aClass158_9041.aShortArray1735;
				is_794_ = aClass158_9041.aShortArray1737;
				is_795_ = aClass158_9041.aShortArray1736;
				is_796_ = aClass158_9041.aByteArray1734;
			} else {
				is_793_ = null;
				is_794_ = null;
				is_795_ = null;
				is_796_ = null;
			}
			short[] is_797_;
			short[] is_798_;
			short[] is_799_;
			byte[] is_800_;
			if (class176_sub1_785_.aClass158_9041 != null) {
				is_797_ = class176_sub1_785_.aClass158_9041.aShortArray1735;
				is_798_ = class176_sub1_785_.aClass158_9041.aShortArray1737;
				is_799_ = class176_sub1_785_.aClass158_9041.aShortArray1736;
				is_800_ = class176_sub1_785_.aClass158_9041.aByteArray1734;
			} else {
				is_797_ = null;
				is_798_ = null;
				is_799_ = null;
				is_800_ = null;
			}
			int[] is_801_ = class176_sub1_785_.anIntArray9088;
			short[] is_802_ = class176_sub1_785_.aShortArray9089;
			if (!class176_sub1_785_.aBool9078)
				class176_sub1_785_.method14542();
			int i_803_ = class176_sub1_785_.aShort9040;
			int i_804_ = class176_sub1_785_.aShort9080;
			int i_805_ = class176_sub1_785_.aShort9081;
			int i_806_ = class176_sub1_785_.aShort9082;
			int i_807_ = class176_sub1_785_.aShort9054;
			int i_808_ = class176_sub1_785_.aShort9076;
			for (int i_809_ = 0; i_809_ < anInt9064; i_809_++) {
				int i_810_ = anIntArray9046[i_809_] - i_783_;
				if (i_810_ >= i_803_ && i_810_ <= i_804_) {
					int i_811_ = anIntArray9053[i_809_] - i;
					if (i_811_ >= i_805_ && i_811_ <= i_806_) {
						int i_812_ = anIntArray9047[i_809_] - i_784_;
						if (i_812_ >= i_807_ && i_812_ <= i_808_) {
							int i_813_ = -1;
							int i_814_ = anIntArray9088[i_809_];
							int i_815_ = anIntArray9088[i_809_ + 1];
							for (int i_816_ = i_814_; (i_816_ < i_815_ && aShortArray9089[i_816_] != 0); i_816_++) {
								i_813_ = (aShortArray9089[i_816_] & 0xffff) - 1;
								if (aByteArray9091[i_813_] != 0)
									break;
							}
							if (i_813_ != -1) {
								for (int i_817_ = 0; i_817_ < i_786_; i_817_++) {
									if (i_811_ == is[i_817_] && i_812_ == is_788_[i_817_] && i_810_ == is_787_[i_817_]) {
										int i_818_ = -1;
										i_814_ = is_801_[i_817_];
										i_815_ = is_801_[i_817_ + 1];
										for (int i_819_ = i_814_; (i_819_ < i_815_ && is_802_[i_819_] != 0); i_819_++) {
											i_818_ = (is_802_[i_819_] & 0xffff) - 1;
											if (is_792_[i_818_] != 0)
												break;
										}
										if (i_818_ != -1) {
											if (is_793_ == null) {
												aClass158_9041 = new Class158();
												is_793_ = aClass158_9041.aShortArray1735 = (Class214.method3900(aShortArray9092, -2035739649));
												is_794_ = aClass158_9041.aShortArray1737 = (Class214.method3900(aShortArray9052, -1922419347));
												is_795_ = aClass158_9041.aShortArray1736 = (Class214.method3900(aShortArray9029, -2037294970));
												is_796_ = aClass158_9041.aByteArray1734 = (Class332.method5837(aByteArray9091, 2047321904));
											}
											if (is_797_ == null) {
												Class158 class158 = (class176_sub1_785_.aClass158_9041 = new Class158());
												is_797_ = class158.aShortArray1735 = (Class214.method3900(is_789_, -1767530291));
												is_798_ = class158.aShortArray1737 = (Class214.method3900(is_790_, -2059265458));
												is_799_ = class158.aShortArray1736 = (Class214.method3900(is_791_, -1934190909));
												is_800_ = class158.aByteArray1734 = (Class332.method5837(is_792_, -111104645));
											}
											short i_820_ = aShortArray9092[i_813_];
											short i_821_ = aShortArray9052[i_813_];
											short i_822_ = aShortArray9029[i_813_];
											byte i_823_ = aByteArray9091[i_813_];
											i_814_ = is_801_[i_817_];
											i_815_ = is_801_[i_817_ + 1];
											for (int i_824_ = i_814_; i_824_ < i_815_; i_824_++) {
												int i_825_ = is_802_[i_824_] - 1;
												if (i_825_ == -1)
													break;
												if (is_800_[i_825_] != 0) {
													is_797_[i_825_] += i_820_;
													is_798_[i_825_] += i_821_;
													is_799_[i_825_] += i_822_;
													is_800_[i_825_] += i_823_;
												}
											}
											i_820_ = is_789_[i_818_];
											i_821_ = is_790_[i_818_];
											i_822_ = is_791_[i_818_];
											i_823_ = is_792_[i_818_];
											i_814_ = anIntArray9088[i_809_];
											i_815_ = anIntArray9088[i_809_ + 1];
											for (int i_826_ = i_814_; (i_826_ < i_815_ && (aShortArray9089[i_826_] != 0)); i_826_++) {
												int i_827_ = ((aShortArray9089[i_826_] & 0xffff) - 1);
												if (is_796_[i_827_] != 0) {
													is_793_[i_827_] += i_820_;
													is_794_[i_827_] += i_821_;
													is_795_[i_827_] += i_822_;
													is_796_[i_827_] += i_823_;
												}
											}
											if (aClass129_9070 == null && aClass129_9069 != null)
												aClass129_9069.anInterface15_1547 = null;
											if (aClass129_9070 != null)
												aClass129_9070.anInterface15_1547 = null;
											if ((class176_sub1_785_.aClass129_9070) == null && (class176_sub1_785_.aClass129_9069) != null)
												class176_sub1_785_.aClass129_9069.anInterface15_1547 = null;
											if ((class176_sub1_785_.aClass129_9070) != null)
												class176_sub1_785_.aClass129_9070.anInterface15_1547 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public Class176 method2920(byte i, int i_828_, boolean bool) {
		boolean bool_829_ = false;
		Class176_Sub1 class176_sub1_830_;
		Class176_Sub1 class176_sub1_831_;
		if (i > 0 && i <= 8) {
			class176_sub1_831_ = aClass180_Sub3_9035.aClass176_Sub1Array9842[i - 1];
			class176_sub1_830_ = aClass180_Sub3_9035.aClass176_Sub1Array9718[i - 1];
			bool_829_ = true;
		} else
			class176_sub1_830_ = class176_sub1_831_ = new Class176_Sub1(aClass180_Sub3_9035);
		return method14539(class176_sub1_830_, class176_sub1_831_, i_828_, bool_829_, bool);
	}

	public Class176 method2921(byte i, int i_832_, boolean bool) {
		boolean bool_833_ = false;
		Class176_Sub1 class176_sub1_834_;
		Class176_Sub1 class176_sub1_835_;
		if (i > 0 && i <= 8) {
			class176_sub1_835_ = aClass180_Sub3_9035.aClass176_Sub1Array9842[i - 1];
			class176_sub1_834_ = aClass180_Sub3_9035.aClass176_Sub1Array9718[i - 1];
			bool_833_ = true;
		} else
			class176_sub1_834_ = class176_sub1_835_ = new Class176_Sub1(aClass180_Sub3_9035);
		return method14539(class176_sub1_834_, class176_sub1_835_, i_832_, bool_833_, bool);
	}

	public Class176 method2924(byte i, int i_836_, boolean bool) {
		boolean bool_837_ = false;
		Class176_Sub1 class176_sub1_838_;
		Class176_Sub1 class176_sub1_839_;
		if (i > 0 && i <= 8) {
			class176_sub1_839_ = aClass180_Sub3_9035.aClass176_Sub1Array9842[i - 1];
			class176_sub1_838_ = aClass180_Sub3_9035.aClass176_Sub1Array9718[i - 1];
			bool_837_ = true;
		} else
			class176_sub1_838_ = class176_sub1_839_ = new Class176_Sub1(aClass180_Sub3_9035);
		return method14539(class176_sub1_838_, class176_sub1_839_, i_836_, bool_837_, bool);
	}

	public int method2919() {
		return aShort9095;
	}

	public void method2901() {
		if (!aBool9063) {
			if (!aBool9078)
				method14542();
			aShort9086 = aShort9040;
			aBool9063 = true;
		}
	}

	public void method2925(int i) {
		anInt9036 = i;
		if (aClass158_9041 != null && (anInt9036 & 0x10000) == 0) {
			aShortArray9092 = aClass158_9041.aShortArray1735;
			aShortArray9052 = aClass158_9041.aShortArray1737;
			aShortArray9029 = aClass158_9041.aShortArray1736;
			aByteArray9091 = aClass158_9041.aByteArray1734;
			aClass158_9041 = null;
		}
		aBool9073 = true;
		method14571();
	}

	static short[] method14550(short[] is, int i) {
		short[] is_840_ = new short[i];
		System.arraycopy(is, 0, is_840_, 0, i);
		return is_840_;
	}

	public void method2990() {
		if (anInt9059 > 0 && anInt9079 > 0) {
			method14548(false);
			if ((aByte9038 & 0x10) == 0 && aClass132_9072.anInterface17_1556 == null)
				method14582(false);
			method14571();
		}
	}

	void method2952(int i, int[] is, int i_841_, int i_842_, int i_843_, int i_844_, boolean bool) {
		int i_845_ = is.length;
		if (i == 0) {
			i_841_ <<= 4;
			i_842_ <<= 4;
			i_843_ <<= 4;
			int i_846_ = 0;
			anInt9101 = 0;
			anInt9102 = 0;
			anInt9103 = 0;
			for (int i_847_ = 0; i_847_ < i_845_; i_847_++) {
				int i_848_ = is[i_847_];
				if (i_848_ < anIntArrayArray9048.length) {
					int[] is_849_ = anIntArrayArray9048[i_848_];
					for (int i_850_ = 0; i_850_ < is_849_.length; i_850_++) {
						int i_851_ = is_849_[i_850_];
						anInt9101 += anIntArray9053[i_851_];
						anInt9102 += anIntArray9046[i_851_];
						anInt9103 += anIntArray9047[i_851_];
						i_846_++;
					}
				}
			}
			if (i_846_ > 0) {
				anInt9101 = anInt9101 / i_846_ + i_841_;
				anInt9102 = anInt9102 / i_846_ + i_842_;
				anInt9103 = anInt9103 / i_846_ + i_843_;
			} else {
				anInt9101 = i_841_;
				anInt9102 = i_842_;
				anInt9103 = i_843_;
			}
		} else if (i == 1) {
			i_841_ <<= 4;
			i_842_ <<= 4;
			i_843_ <<= 4;
			for (int i_852_ = 0; i_852_ < i_845_; i_852_++) {
				int i_853_ = is[i_852_];
				if (i_853_ < anIntArrayArray9048.length) {
					int[] is_854_ = anIntArrayArray9048[i_853_];
					for (int i_855_ = 0; i_855_ < is_854_.length; i_855_++) {
						int i_856_ = is_854_[i_855_];
						anIntArray9053[i_856_] += i_841_;
						anIntArray9046[i_856_] += i_842_;
						anIntArray9047[i_856_] += i_843_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_857_ = 0; i_857_ < i_845_; i_857_++) {
				int i_858_ = is[i_857_];
				if (i_858_ < anIntArrayArray9048.length) {
					int[] is_859_ = anIntArrayArray9048[i_858_];
					if ((i_844_ & 0x1) == 0) {
						for (int i_860_ = 0; i_860_ < is_859_.length; i_860_++) {
							int i_861_ = is_859_[i_860_];
							anIntArray9053[i_861_] -= anInt9101;
							anIntArray9046[i_861_] -= anInt9102;
							anIntArray9047[i_861_] -= anInt9103;
							if (i_843_ != 0) {
								int i_862_ = Class428.anIntArray4825[i_843_];
								int i_863_ = Class428.anIntArray4819[i_843_];
								int i_864_ = (anIntArray9046[i_861_] * i_862_ + anIntArray9053[i_861_] * i_863_ + 16383) >> 14;
								anIntArray9046[i_861_] = (anIntArray9046[i_861_] * i_863_ - anIntArray9053[i_861_] * i_862_ + 16383) >> 14;
								anIntArray9053[i_861_] = i_864_;
							}
							if (i_841_ != 0) {
								int i_865_ = Class428.anIntArray4825[i_841_];
								int i_866_ = Class428.anIntArray4819[i_841_];
								int i_867_ = (anIntArray9046[i_861_] * i_866_ - anIntArray9047[i_861_] * i_865_ + 16383) >> 14;
								anIntArray9047[i_861_] = (anIntArray9046[i_861_] * i_865_ + anIntArray9047[i_861_] * i_866_ + 16383) >> 14;
								anIntArray9046[i_861_] = i_867_;
							}
							if (i_842_ != 0) {
								int i_868_ = Class428.anIntArray4825[i_842_];
								int i_869_ = Class428.anIntArray4819[i_842_];
								int i_870_ = (anIntArray9047[i_861_] * i_868_ + anIntArray9053[i_861_] * i_869_ + 16383) >> 14;
								anIntArray9047[i_861_] = (anIntArray9047[i_861_] * i_869_ - anIntArray9053[i_861_] * i_868_ + 16383) >> 14;
								anIntArray9053[i_861_] = i_870_;
							}
							anIntArray9053[i_861_] += anInt9101;
							anIntArray9046[i_861_] += anInt9102;
							anIntArray9047[i_861_] += anInt9103;
						}
					} else {
						for (int i_871_ = 0; i_871_ < is_859_.length; i_871_++) {
							int i_872_ = is_859_[i_871_];
							anIntArray9053[i_872_] -= anInt9101;
							anIntArray9046[i_872_] -= anInt9102;
							anIntArray9047[i_872_] -= anInt9103;
							if (i_841_ != 0) {
								int i_873_ = Class428.anIntArray4825[i_841_];
								int i_874_ = Class428.anIntArray4819[i_841_];
								int i_875_ = (anIntArray9046[i_872_] * i_874_ - anIntArray9047[i_872_] * i_873_ + 16383) >> 14;
								anIntArray9047[i_872_] = (anIntArray9046[i_872_] * i_873_ + anIntArray9047[i_872_] * i_874_ + 16383) >> 14;
								anIntArray9046[i_872_] = i_875_;
							}
							if (i_843_ != 0) {
								int i_876_ = Class428.anIntArray4825[i_843_];
								int i_877_ = Class428.anIntArray4819[i_843_];
								int i_878_ = (anIntArray9046[i_872_] * i_876_ + anIntArray9053[i_872_] * i_877_ + 16383) >> 14;
								anIntArray9046[i_872_] = (anIntArray9046[i_872_] * i_877_ - anIntArray9053[i_872_] * i_876_ + 16383) >> 14;
								anIntArray9053[i_872_] = i_878_;
							}
							if (i_842_ != 0) {
								int i_879_ = Class428.anIntArray4825[i_842_];
								int i_880_ = Class428.anIntArray4819[i_842_];
								int i_881_ = (anIntArray9047[i_872_] * i_879_ + anIntArray9053[i_872_] * i_880_ + 16383) >> 14;
								anIntArray9047[i_872_] = (anIntArray9047[i_872_] * i_880_ - anIntArray9053[i_872_] * i_879_ + 16383) >> 14;
								anIntArray9053[i_872_] = i_881_;
							}
							anIntArray9053[i_872_] += anInt9101;
							anIntArray9046[i_872_] += anInt9102;
							anIntArray9047[i_872_] += anInt9103;
						}
					}
				}
			}
			if (bool) {
				for (int i_882_ = 0; i_882_ < i_845_; i_882_++) {
					int i_883_ = is[i_882_];
					if (i_883_ < anIntArrayArray9048.length) {
						int[] is_884_ = anIntArrayArray9048[i_883_];
						for (int i_885_ = 0; i_885_ < is_884_.length; i_885_++) {
							int i_886_ = is_884_[i_885_];
							int i_887_ = anIntArray9088[i_886_];
							int i_888_ = anIntArray9088[i_886_ + 1];
							for (int i_889_ = i_887_; (i_889_ < i_888_ && aShortArray9089[i_889_] != 0); i_889_++) {
								int i_890_ = (aShortArray9089[i_889_] & 0xffff) - 1;
								if (i_843_ != 0) {
									int i_891_ = Class428.anIntArray4825[i_843_];
									int i_892_ = Class428.anIntArray4819[i_843_];
									int i_893_ = ((aShortArray9052[i_890_] * i_891_ + aShortArray9092[i_890_] * i_892_ + 16383) >> 14);
									aShortArray9052[i_890_] = (short) (((aShortArray9052[i_890_] * i_892_) - (aShortArray9092[i_890_] * i_891_) + 16383) >> 14);
									aShortArray9092[i_890_] = (short) i_893_;
								}
								if (i_841_ != 0) {
									int i_894_ = Class428.anIntArray4825[i_841_];
									int i_895_ = Class428.anIntArray4819[i_841_];
									int i_896_ = ((aShortArray9052[i_890_] * i_895_ - aShortArray9029[i_890_] * i_894_ + 16383) >> 14);
									aShortArray9029[i_890_] = (short) (((aShortArray9052[i_890_] * i_894_) + (aShortArray9029[i_890_] * i_895_) + 16383) >> 14);
									aShortArray9052[i_890_] = (short) i_896_;
								}
								if (i_842_ != 0) {
									int i_897_ = Class428.anIntArray4825[i_842_];
									int i_898_ = Class428.anIntArray4819[i_842_];
									int i_899_ = ((aShortArray9029[i_890_] * i_897_ + aShortArray9092[i_890_] * i_898_ + 16383) >> 14);
									aShortArray9029[i_890_] = (short) (((aShortArray9029[i_890_] * i_898_) - (aShortArray9092[i_890_] * i_897_) + 16383) >> 14);
									aShortArray9092[i_890_] = (short) i_899_;
								}
							}
						}
					}
				}
				if (aClass129_9070 == null && aClass129_9069 != null)
					aClass129_9069.anInterface15_1547 = null;
				if (aClass129_9070 != null)
					aClass129_9070.anInterface15_1547 = null;
			}
		} else if (i == 3) {
			for (int i_900_ = 0; i_900_ < i_845_; i_900_++) {
				int i_901_ = is[i_900_];
				if (i_901_ < anIntArrayArray9048.length) {
					int[] is_902_ = anIntArrayArray9048[i_901_];
					for (int i_903_ = 0; i_903_ < is_902_.length; i_903_++) {
						int i_904_ = is_902_[i_903_];
						anIntArray9053[i_904_] -= anInt9101;
						anIntArray9046[i_904_] -= anInt9102;
						anIntArray9047[i_904_] -= anInt9103;
						anIntArray9053[i_904_] = anIntArray9053[i_904_] * i_841_ >> 7;
						anIntArray9046[i_904_] = anIntArray9046[i_904_] * i_842_ >> 7;
						anIntArray9047[i_904_] = anIntArray9047[i_904_] * i_843_ >> 7;
						anIntArray9053[i_904_] += anInt9101;
						anIntArray9046[i_904_] += anInt9102;
						anIntArray9047[i_904_] += anInt9103;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9042 != null) {
				for (int i_905_ = 0; i_905_ < i_845_; i_905_++) {
					int i_906_ = is[i_905_];
					if (i_906_ < anIntArrayArray9042.length) {
						int[] is_907_ = anIntArrayArray9042[i_906_];
						for (int i_908_ = 0; i_908_ < is_907_.length; i_908_++) {
							int i_909_ = is_907_[i_908_];
							int i_910_ = (aByteArray9061[i_909_] & 0xff) + i_841_ * 8;
							if (i_910_ < 0)
								i_910_ = 0;
							else if (i_910_ > 255)
								i_910_ = 255;
							aByteArray9061[i_909_] = (byte) i_910_;
						}
						if (is_907_.length > 0 && aClass129_9069 != null)
							aClass129_9069.anInterface15_1547 = null;
					}
				}
				if (aClass150Array9093 != null) {
					for (int i_911_ = 0; i_911_ < anInt9075; i_911_++) {
						Class150 class150 = aClass150Array9093[i_911_];
						Class130 class130 = aClass130Array9094[i_911_];
						class130.anInt1553 = (class130.anInt1553 & 0xffffff | 255 - (aByteArray9061[class150.anInt1682] & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9042 != null) {
				for (int i_912_ = 0; i_912_ < i_845_; i_912_++) {
					int i_913_ = is[i_912_];
					if (i_913_ < anIntArrayArray9042.length) {
						int[] is_914_ = anIntArrayArray9042[i_913_];
						for (int i_915_ = 0; i_915_ < is_914_.length; i_915_++) {
							int i_916_ = is_914_[i_915_];
							int i_917_ = aShortArray9060[i_916_] & 0xffff;
							int i_918_ = i_917_ >> 10 & 0x3f;
							int i_919_ = i_917_ >> 7 & 0x7;
							int i_920_ = i_917_ & 0x7f;
							i_918_ = i_918_ + i_841_ & 0x3f;
							i_919_ += i_842_ / 4;
							if (i_919_ < 0)
								i_919_ = 0;
							else if (i_919_ > 7)
								i_919_ = 7;
							i_920_ += i_843_;
							if (i_920_ < 0)
								i_920_ = 0;
							else if (i_920_ > 127)
								i_920_ = 127;
							aShortArray9060[i_916_] = (short) (i_918_ << 10 | i_919_ << 7 | i_920_);
						}
						if (is_914_.length > 0 && aClass129_9069 != null)
							aClass129_9069.anInterface15_1547 = null;
					}
				}
				if (aClass150Array9093 != null) {
					for (int i_921_ = 0; i_921_ < anInt9075; i_921_++) {
						Class150 class150 = aClass150Array9093[i_921_];
						Class130 class130 = aClass130Array9094[i_921_];
						class130.anInt1553 = (class130.anInt1553 & ~0xffffff | (Class656.anIntArray8390[(aShortArray9060[class150.anInt1682] & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9028 != null) {
				for (int i_922_ = 0; i_922_ < i_845_; i_922_++) {
					int i_923_ = is[i_922_];
					if (i_923_ < anIntArrayArray9028.length) {
						int[] is_924_ = anIntArrayArray9028[i_923_];
						for (int i_925_ = 0; i_925_ < is_924_.length; i_925_++) {
							Class130 class130 = aClass130Array9094[is_924_[i_925_]];
							class130.anInt1548 += i_841_;
							class130.anInt1552 += i_842_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9028 != null) {
				for (int i_926_ = 0; i_926_ < i_845_; i_926_++) {
					int i_927_ = is[i_926_];
					if (i_927_ < anIntArrayArray9028.length) {
						int[] is_928_ = anIntArrayArray9028[i_927_];
						for (int i_929_ = 0; i_929_ < is_928_.length; i_929_++) {
							Class130 class130 = aClass130Array9094[is_928_[i_929_]];
							class130.anInt1549 = class130.anInt1549 * i_841_ >> 7;
							class130.anInt1551 = class130.anInt1551 * i_842_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9028 != null) {
				for (int i_930_ = 0; i_930_ < i_845_; i_930_++) {
					int i_931_ = is[i_930_];
					if (i_931_ < anIntArrayArray9028.length) {
						int[] is_932_ = anIntArrayArray9028[i_931_];
						for (int i_933_ = 0; i_933_ < is_932_.length; i_933_++) {
							Class130 class130 = aClass130Array9094[is_932_[i_933_]];
							class130.anInt1550 = class130.anInt1550 + i_841_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	public void method2937(int i) {
		int i_934_ = Class428.anIntArray4825[i];
		int i_935_ = Class428.anIntArray4819[i];
		for (int i_936_ = 0; i_936_ < anInt9064; i_936_++) {
			int i_937_ = ((anIntArray9047[i_936_] * i_934_ + anIntArray9053[i_936_] * i_935_) >> 14);
			anIntArray9047[i_936_] = (anIntArray9047[i_936_] * i_935_ - anIntArray9053[i_936_] * i_934_) >> 14;
			anIntArray9053[i_936_] = i_937_;
		}
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		aBool9078 = false;
	}

	public int method2982() {
		if (!aBool9078)
			method14542();
		return aShort9054;
	}

	public void method2931(int i) {
		int i_938_ = Class428.anIntArray4825[i];
		int i_939_ = Class428.anIntArray4819[i];
		for (int i_940_ = 0; i_940_ < anInt9064; i_940_++) {
			int i_941_ = ((anIntArray9047[i_940_] * i_938_ + anIntArray9053[i_940_] * i_939_) >> 14);
			anIntArray9047[i_940_] = (anIntArray9047[i_940_] * i_939_ - anIntArray9053[i_940_] * i_938_) >> 14;
			anIntArray9053[i_940_] = i_941_;
		}
		for (int i_942_ = 0; i_942_ < anInt9059; i_942_++) {
			int i_943_ = ((aShortArray9029[i_942_] * i_938_ + aShortArray9092[i_942_] * i_939_) >> 14);
			aShortArray9029[i_942_] = (short) ((aShortArray9029[i_942_] * i_939_ - aShortArray9092[i_942_] * i_938_) >> 14);
			aShortArray9092[i_942_] = (short) i_943_;
		}
		if (aClass129_9070 == null && aClass129_9069 != null)
			aClass129_9069.anInterface15_1547 = null;
		if (aClass129_9070 != null)
			aClass129_9070.anInterface15_1547 = null;
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		aBool9078 = false;
	}

	public void method3002(int i) {
		int i_944_ = Class428.anIntArray4825[i];
		int i_945_ = Class428.anIntArray4819[i];
		for (int i_946_ = 0; i_946_ < anInt9064; i_946_++) {
			int i_947_ = ((anIntArray9047[i_946_] * i_944_ + anIntArray9053[i_946_] * i_945_) >> 14);
			anIntArray9047[i_946_] = (anIntArray9047[i_946_] * i_945_ - anIntArray9053[i_946_] * i_944_) >> 14;
			anIntArray9053[i_946_] = i_947_;
		}
		for (int i_948_ = 0; i_948_ < anInt9059; i_948_++) {
			int i_949_ = ((aShortArray9029[i_948_] * i_944_ + aShortArray9092[i_948_] * i_945_) >> 14);
			aShortArray9029[i_948_] = (short) ((aShortArray9029[i_948_] * i_945_ - aShortArray9092[i_948_] * i_944_) >> 14);
			aShortArray9092[i_948_] = (short) i_949_;
		}
		if (aClass129_9070 == null && aClass129_9069 != null)
			aClass129_9069.anInterface15_1547 = null;
		if (aClass129_9070 != null)
			aClass129_9070.anInterface15_1547 = null;
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		aBool9078 = false;
	}

	public void method2933(int i) {
		int i_950_ = Class428.anIntArray4825[i];
		int i_951_ = Class428.anIntArray4819[i];
		for (int i_952_ = 0; i_952_ < anInt9064; i_952_++) {
			int i_953_ = ((anIntArray9046[i_952_] * i_951_ - anIntArray9047[i_952_] * i_950_) >> 14);
			anIntArray9047[i_952_] = (anIntArray9046[i_952_] * i_950_ + anIntArray9047[i_952_] * i_951_) >> 14;
			anIntArray9046[i_952_] = i_953_;
		}
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		aBool9078 = false;
	}

	boolean method3021() {
		if (anIntArrayArray9048 == null)
			return false;
		for (int i = 0; i < anInt9043; i++) {
			anIntArray9053[i] <<= 4;
			anIntArray9046[i] <<= 4;
			anIntArray9047[i] <<= 4;
		}
		anInt9101 = 0;
		anInt9102 = 0;
		anInt9103 = 0;
		return true;
	}

	public boolean method3013() {
		return aBool9096;
	}

	static short[] method14551(short[] is, int i) {
		short[] is_954_ = new short[i];
		System.arraycopy(is, 0, is_954_, 0, i);
		return is_954_;
	}

	public void method2911(int i) {
		int i_955_ = Class428.anIntArray4825[i];
		int i_956_ = Class428.anIntArray4819[i];
		for (int i_957_ = 0; i_957_ < anInt9064; i_957_++) {
			int i_958_ = ((anIntArray9047[i_957_] * i_955_ + anIntArray9053[i_957_] * i_956_) >> 14);
			anIntArray9047[i_957_] = (anIntArray9047[i_957_] * i_956_ - anIntArray9053[i_957_] * i_955_) >> 14;
			anIntArray9053[i_957_] = i_958_;
		}
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		aBool9078 = false;
	}

	public void method2938(int i) {
		int i_959_ = Class428.anIntArray4825[i];
		int i_960_ = Class428.anIntArray4819[i];
		for (int i_961_ = 0; i_961_ < anInt9064; i_961_++) {
			int i_962_ = ((anIntArray9046[i_961_] * i_959_ + anIntArray9053[i_961_] * i_960_) >> 14);
			anIntArray9046[i_961_] = (anIntArray9046[i_961_] * i_960_ - anIntArray9053[i_961_] * i_959_) >> 14;
			anIntArray9053[i_961_] = i_962_;
		}
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		aBool9078 = false;
	}

	public void method2855(int i, int i_963_, int i_964_) {
		for (int i_965_ = 0; i_965_ < anInt9064; i_965_++) {
			if (i != 0)
				anIntArray9053[i_965_] += i;
			if (i_963_ != 0)
				anIntArray9046[i_965_] += i_963_;
			if (i_964_ != 0)
				anIntArray9047[i_965_] += i_964_;
		}
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		aBool9078 = false;
	}

	public void method2886(int i, int i_966_, int i_967_) {
		for (int i_968_ = 0; i_968_ < anInt9064; i_968_++) {
			if (i != 128)
				anIntArray9053[i_968_] = anIntArray9053[i_968_] * i >> 7;
			if (i_966_ != 128)
				anIntArray9046[i_968_] = anIntArray9046[i_968_] * i_966_ >> 7;
			if (i_967_ != 128)
				anIntArray9047[i_968_] = anIntArray9047[i_968_] * i_967_ >> 7;
		}
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		aBool9078 = false;
	}

	public void method3027(int i, int i_969_, Class161 class161, Class161 class161_970_, int i_971_, int i_972_, int i_973_) {
		if (!aBool9078)
			method14542();
		int i_974_ = i_971_ + aShort9081;
		int i_975_ = i_971_ + aShort9082;
		int i_976_ = i_973_ + aShort9054;
		int i_977_ = i_973_ + aShort9076;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_974_ >= 0 && ((i_975_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1750 * 1210322533) && i_976_ >= 0 && ((i_977_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1751 * -533476177))) {
			if (i == 4 || i == 5) {
				if (class161_970_ == null || (i_974_ < 0 || ((i_975_ + class161_970_.anInt1752 * 1048375491 >> class161_970_.anInt1753 * 1252000143) >= class161_970_.anInt1750 * 1210322533) || i_976_ < 0 || ((i_977_ + class161_970_.anInt1752 * 1048375491 >> class161_970_.anInt1753 * 1252000143) >= class161_970_.anInt1751 * -533476177)))
					return;
			} else {
				i_974_ >>= class161.anInt1753 * 1252000143;
				i_975_ = (i_975_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				i_976_ >>= class161.anInt1753 * 1252000143;
				i_977_ = (i_977_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				if (class161.method2595(i_974_, i_976_, (byte) 36) == i_972_ && class161.method2595(i_975_, i_976_, (byte) 8) == i_972_ && class161.method2595(i_974_, i_977_, (byte) 27) == i_972_ && (class161.method2595(i_975_, i_977_, (byte) 32) == i_972_))
					return;
			}
			if (i == 1) {
				for (int i_978_ = 0; i_978_ < anInt9064; i_978_++)
					anIntArray9046[i_978_] = (anIntArray9046[i_978_] + class161.method2619((anIntArray9053[i_978_] + i_971_), (anIntArray9047[i_978_] + i_973_), 996292377) - i_972_);
			} else if (i == 2) {
				int i_979_ = aShort9040;
				if (i_979_ == 0)
					return;
				for (int i_980_ = 0; i_980_ < anInt9064; i_980_++) {
					int i_981_ = (anIntArray9046[i_980_] << 16) / i_979_;
					if (i_981_ < i_969_)
						anIntArray9046[i_980_] = (anIntArray9046[i_980_] + (class161.method2619((anIntArray9053[i_980_] + i_971_), (anIntArray9047[i_980_] + i_973_), 272485767) - i_972_) * (i_969_ - i_981_) / i_969_);
				}
			} else if (i == 3) {
				int i_982_ = (i_969_ & 0xff) * 16;
				int i_983_ = (i_969_ >> 8 & 0xff) * 16;
				int i_984_ = (i_969_ >> 16 & 0xff) << 6;
				int i_985_ = (i_969_ >> 24 & 0xff) << 6;
				if (i_971_ - (i_982_ >> 1) < 0 || ((i_971_ + (i_982_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1750 * 1210322533 << class161.anInt1753 * 1252000143)) || i_973_ - (i_983_ >> 1) < 0 || ((i_973_ + (i_983_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1751 * -533476177 << class161.anInt1753 * 1252000143)))
					return;
				method2962(class161, i_971_, i_972_, i_973_, i_982_, i_983_, i_984_, i_985_);
			} else if (i == 4) {
				int i_986_ = aShort9080 - aShort9040;
				for (int i_987_ = 0; i_987_ < anInt9064; i_987_++)
					anIntArray9046[i_987_] = (anIntArray9046[i_987_] + (class161_970_.method2619((anIntArray9053[i_987_] + i_971_), (anIntArray9047[i_987_] + i_973_), 528752692) - i_972_) + i_986_);
			} else if (i == 5) {
				int i_988_ = aShort9080 - aShort9040;
				for (int i_989_ = 0; i_989_ < anInt9064; i_989_++) {
					int i_990_ = anIntArray9053[i_989_] + i_971_;
					int i_991_ = anIntArray9047[i_989_] + i_973_;
					int i_992_ = class161.method2619(i_990_, i_991_, -1606876225);
					int i_993_ = class161_970_.method2619(i_990_, i_991_, -1057883123);
					int i_994_ = i_992_ - i_993_ - i_969_;
					anIntArray9046[i_989_] = ((anIntArray9046[i_989_] << 8) / i_988_ * i_994_ >> 8) - (i_972_ - i_992_);
				}
			}
			if (aClass129_9068 != null)
				aClass129_9068.anInterface15_1547 = null;
			aBool9078 = false;
		}
	}

	public void method2912(int i, int i_995_, Class161 class161, Class161 class161_996_, int i_997_, int i_998_, int i_999_) {
		if (!aBool9078)
			method14542();
		int i_1000_ = i_997_ + aShort9081;
		int i_1001_ = i_997_ + aShort9082;
		int i_1002_ = i_999_ + aShort9054;
		int i_1003_ = i_999_ + aShort9076;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_1000_ >= 0 && ((i_1001_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1750 * 1210322533) && i_1002_ >= 0 && ((i_1003_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1751 * -533476177))) {
			if (i == 4 || i == 5) {
				if (class161_996_ == null || (i_1000_ < 0 || ((i_1001_ + class161_996_.anInt1752 * 1048375491 >> class161_996_.anInt1753 * 1252000143) >= class161_996_.anInt1750 * 1210322533) || i_1002_ < 0 || ((i_1003_ + class161_996_.anInt1752 * 1048375491 >> class161_996_.anInt1753 * 1252000143) >= class161_996_.anInt1751 * -533476177)))
					return;
			} else {
				i_1000_ >>= class161.anInt1753 * 1252000143;
				i_1001_ = (i_1001_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				i_1002_ >>= class161.anInt1753 * 1252000143;
				i_1003_ = (i_1003_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				if (class161.method2595(i_1000_, i_1002_, (byte) 80) == i_998_ && (class161.method2595(i_1001_, i_1002_, (byte) 73) == i_998_) && (class161.method2595(i_1000_, i_1003_, (byte) 37) == i_998_) && (class161.method2595(i_1001_, i_1003_, (byte) 70) == i_998_))
					return;
			}
			if (i == 1) {
				for (int i_1004_ = 0; i_1004_ < anInt9064; i_1004_++)
					anIntArray9046[i_1004_] = (anIntArray9046[i_1004_] + class161.method2619((anIntArray9053[i_1004_] + i_997_), (anIntArray9047[i_1004_] + i_999_), -1193548872) - i_998_);
			} else if (i == 2) {
				int i_1005_ = aShort9040;
				if (i_1005_ == 0)
					return;
				for (int i_1006_ = 0; i_1006_ < anInt9064; i_1006_++) {
					int i_1007_ = (anIntArray9046[i_1006_] << 16) / i_1005_;
					if (i_1007_ < i_995_)
						anIntArray9046[i_1006_] = (anIntArray9046[i_1006_] + (class161.method2619((anIntArray9053[i_1006_] + i_997_), (anIntArray9047[i_1006_] + i_999_), -1261911671) - i_998_) * (i_995_ - i_1007_) / i_995_);
				}
			} else if (i == 3) {
				int i_1008_ = (i_995_ & 0xff) * 16;
				int i_1009_ = (i_995_ >> 8 & 0xff) * 16;
				int i_1010_ = (i_995_ >> 16 & 0xff) << 6;
				int i_1011_ = (i_995_ >> 24 & 0xff) << 6;
				if (i_997_ - (i_1008_ >> 1) < 0 || ((i_997_ + (i_1008_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1750 * 1210322533 << class161.anInt1753 * 1252000143)) || i_999_ - (i_1009_ >> 1) < 0 || ((i_999_ + (i_1009_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1751 * -533476177 << class161.anInt1753 * 1252000143)))
					return;
				method2962(class161, i_997_, i_998_, i_999_, i_1008_, i_1009_, i_1010_, i_1011_);
			} else if (i == 4) {
				int i_1012_ = aShort9080 - aShort9040;
				for (int i_1013_ = 0; i_1013_ < anInt9064; i_1013_++)
					anIntArray9046[i_1013_] = (anIntArray9046[i_1013_] + (class161_996_.method2619((anIntArray9053[i_1013_] + i_997_), (anIntArray9047[i_1013_] + i_999_), 463872479) - i_998_) + i_1012_);
			} else if (i == 5) {
				int i_1014_ = aShort9080 - aShort9040;
				for (int i_1015_ = 0; i_1015_ < anInt9064; i_1015_++) {
					int i_1016_ = anIntArray9053[i_1015_] + i_997_;
					int i_1017_ = anIntArray9047[i_1015_] + i_999_;
					int i_1018_ = class161.method2619(i_1016_, i_1017_, -603931520);
					int i_1019_ = class161_996_.method2619(i_1016_, i_1017_, -1404953946);
					int i_1020_ = i_1018_ - i_1019_ - i_995_;
					anIntArray9046[i_1015_] = ((anIntArray9046[i_1015_] << 8) / i_1014_ * i_1020_ >> 8) - (i_998_ - i_1018_);
				}
			}
			if (aClass129_9068 != null)
				aClass129_9068.anInterface15_1547 = null;
			aBool9078 = false;
		}
	}

	public void method2943(int i, int i_1021_, Class161 class161, Class161 class161_1022_, int i_1023_, int i_1024_, int i_1025_) {
		if (!aBool9078)
			method14542();
		int i_1026_ = i_1023_ + aShort9081;
		int i_1027_ = i_1023_ + aShort9082;
		int i_1028_ = i_1025_ + aShort9054;
		int i_1029_ = i_1025_ + aShort9076;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_1026_ >= 0 && ((i_1027_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1750 * 1210322533) && i_1028_ >= 0 && ((i_1029_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1751 * -533476177))) {
			if (i == 4 || i == 5) {
				if (class161_1022_ == null || (i_1026_ < 0 || ((i_1027_ + class161_1022_.anInt1752 * 1048375491 >> class161_1022_.anInt1753 * 1252000143) >= class161_1022_.anInt1750 * 1210322533) || i_1028_ < 0 || ((i_1029_ + class161_1022_.anInt1752 * 1048375491 >> class161_1022_.anInt1753 * 1252000143) >= class161_1022_.anInt1751 * -533476177)))
					return;
			} else {
				i_1026_ >>= class161.anInt1753 * 1252000143;
				i_1027_ = (i_1027_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				i_1028_ >>= class161.anInt1753 * 1252000143;
				i_1029_ = (i_1029_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				if (class161.method2595(i_1026_, i_1028_, (byte) 99) == i_1024_ && (class161.method2595(i_1027_, i_1028_, (byte) 58) == i_1024_) && (class161.method2595(i_1026_, i_1029_, (byte) 43) == i_1024_) && (class161.method2595(i_1027_, i_1029_, (byte) 7) == i_1024_))
					return;
			}
			if (i == 1) {
				for (int i_1030_ = 0; i_1030_ < anInt9064; i_1030_++)
					anIntArray9046[i_1030_] = (anIntArray9046[i_1030_] + class161.method2619((anIntArray9053[i_1030_] + i_1023_), (anIntArray9047[i_1030_] + i_1025_), 162382793) - i_1024_);
			} else if (i == 2) {
				int i_1031_ = aShort9040;
				if (i_1031_ == 0)
					return;
				for (int i_1032_ = 0; i_1032_ < anInt9064; i_1032_++) {
					int i_1033_ = (anIntArray9046[i_1032_] << 16) / i_1031_;
					if (i_1033_ < i_1021_)
						anIntArray9046[i_1032_] = (anIntArray9046[i_1032_] + (class161.method2619((anIntArray9053[i_1032_] + i_1023_), (anIntArray9047[i_1032_] + i_1025_), 482607864) - i_1024_) * (i_1021_ - i_1033_) / i_1021_);
				}
			} else if (i == 3) {
				int i_1034_ = (i_1021_ & 0xff) * 16;
				int i_1035_ = (i_1021_ >> 8 & 0xff) * 16;
				int i_1036_ = (i_1021_ >> 16 & 0xff) << 6;
				int i_1037_ = (i_1021_ >> 24 & 0xff) << 6;
				if (i_1023_ - (i_1034_ >> 1) < 0 || ((i_1023_ + (i_1034_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1750 * 1210322533 << class161.anInt1753 * 1252000143)) || i_1025_ - (i_1035_ >> 1) < 0 || ((i_1025_ + (i_1035_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1751 * -533476177 << class161.anInt1753 * 1252000143)))
					return;
				method2962(class161, i_1023_, i_1024_, i_1025_, i_1034_, i_1035_, i_1036_, i_1037_);
			} else if (i == 4) {
				int i_1038_ = aShort9080 - aShort9040;
				for (int i_1039_ = 0; i_1039_ < anInt9064; i_1039_++)
					anIntArray9046[i_1039_] = (anIntArray9046[i_1039_] + ((class161_1022_.method2619(anIntArray9053[i_1039_] + i_1023_, anIntArray9047[i_1039_] + i_1025_, 83666241)) - i_1024_) + i_1038_);
			} else if (i == 5) {
				int i_1040_ = aShort9080 - aShort9040;
				for (int i_1041_ = 0; i_1041_ < anInt9064; i_1041_++) {
					int i_1042_ = anIntArray9053[i_1041_] + i_1023_;
					int i_1043_ = anIntArray9047[i_1041_] + i_1025_;
					int i_1044_ = class161.method2619(i_1042_, i_1043_, -1057242374);
					int i_1045_ = class161_1022_.method2619(i_1042_, i_1043_, 43098873);
					int i_1046_ = i_1044_ - i_1045_ - i_1021_;
					anIntArray9046[i_1041_] = ((anIntArray9046[i_1041_] << 8) / i_1040_ * i_1046_ >> 8) - (i_1024_ - i_1044_);
				}
			}
			if (aClass129_9068 != null)
				aClass129_9068.anInterface15_1547 = null;
			aBool9078 = false;
		}
	}

	public void method2944(int i, int i_1047_, Class161 class161, Class161 class161_1048_, int i_1049_, int i_1050_, int i_1051_) {
		if (!aBool9078)
			method14542();
		int i_1052_ = i_1049_ + aShort9081;
		int i_1053_ = i_1049_ + aShort9082;
		int i_1054_ = i_1051_ + aShort9054;
		int i_1055_ = i_1051_ + aShort9076;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_1052_ >= 0 && ((i_1053_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1750 * 1210322533) && i_1054_ >= 0 && ((i_1055_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1751 * -533476177))) {
			if (i == 4 || i == 5) {
				if (class161_1048_ == null || (i_1052_ < 0 || ((i_1053_ + class161_1048_.anInt1752 * 1048375491 >> class161_1048_.anInt1753 * 1252000143) >= class161_1048_.anInt1750 * 1210322533) || i_1054_ < 0 || ((i_1055_ + class161_1048_.anInt1752 * 1048375491 >> class161_1048_.anInt1753 * 1252000143) >= class161_1048_.anInt1751 * -533476177)))
					return;
			} else {
				i_1052_ >>= class161.anInt1753 * 1252000143;
				i_1053_ = (i_1053_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				i_1054_ >>= class161.anInt1753 * 1252000143;
				i_1055_ = (i_1055_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				if (class161.method2595(i_1052_, i_1054_, (byte) 54) == i_1050_ && (class161.method2595(i_1053_, i_1054_, (byte) 25) == i_1050_) && (class161.method2595(i_1052_, i_1055_, (byte) 107) == i_1050_) && (class161.method2595(i_1053_, i_1055_, (byte) 56) == i_1050_))
					return;
			}
			if (i == 1) {
				for (int i_1056_ = 0; i_1056_ < anInt9064; i_1056_++)
					anIntArray9046[i_1056_] = (anIntArray9046[i_1056_] + class161.method2619((anIntArray9053[i_1056_] + i_1049_), (anIntArray9047[i_1056_] + i_1051_), -885491356) - i_1050_);
			} else if (i == 2) {
				int i_1057_ = aShort9040;
				if (i_1057_ == 0)
					return;
				for (int i_1058_ = 0; i_1058_ < anInt9064; i_1058_++) {
					int i_1059_ = (anIntArray9046[i_1058_] << 16) / i_1057_;
					if (i_1059_ < i_1047_)
						anIntArray9046[i_1058_] = (anIntArray9046[i_1058_] + (class161.method2619((anIntArray9053[i_1058_] + i_1049_), (anIntArray9047[i_1058_] + i_1051_), 199638343) - i_1050_) * (i_1047_ - i_1059_) / i_1047_);
				}
			} else if (i == 3) {
				int i_1060_ = (i_1047_ & 0xff) * 16;
				int i_1061_ = (i_1047_ >> 8 & 0xff) * 16;
				int i_1062_ = (i_1047_ >> 16 & 0xff) << 6;
				int i_1063_ = (i_1047_ >> 24 & 0xff) << 6;
				if (i_1049_ - (i_1060_ >> 1) < 0 || ((i_1049_ + (i_1060_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1750 * 1210322533 << class161.anInt1753 * 1252000143)) || i_1051_ - (i_1061_ >> 1) < 0 || ((i_1051_ + (i_1061_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1751 * -533476177 << class161.anInt1753 * 1252000143)))
					return;
				method2962(class161, i_1049_, i_1050_, i_1051_, i_1060_, i_1061_, i_1062_, i_1063_);
			} else if (i == 4) {
				int i_1064_ = aShort9080 - aShort9040;
				for (int i_1065_ = 0; i_1065_ < anInt9064; i_1065_++)
					anIntArray9046[i_1065_] = (anIntArray9046[i_1065_] + (class161_1048_.method2619((anIntArray9053[i_1065_]) + i_1049_, (anIntArray9047[i_1065_]) + i_1051_, -1610222758) - i_1050_) + i_1064_);
			} else if (i == 5) {
				int i_1066_ = aShort9080 - aShort9040;
				for (int i_1067_ = 0; i_1067_ < anInt9064; i_1067_++) {
					int i_1068_ = anIntArray9053[i_1067_] + i_1049_;
					int i_1069_ = anIntArray9047[i_1067_] + i_1051_;
					int i_1070_ = class161.method2619(i_1068_, i_1069_, -1800275428);
					int i_1071_ = class161_1048_.method2619(i_1068_, i_1069_, 1220049318);
					int i_1072_ = i_1070_ - i_1071_ - i_1047_;
					anIntArray9046[i_1067_] = ((anIntArray9046[i_1067_] << 8) / i_1066_ * i_1072_ >> 8) - (i_1050_ - i_1070_);
				}
			}
			if (aClass129_9068 != null)
				aClass129_9068.anInterface15_1547 = null;
			aBool9078 = false;
		}
	}

	void method14552() {
		int i = 32767;
		int i_1073_ = 32767;
		int i_1074_ = 32767;
		int i_1075_ = -32768;
		int i_1076_ = -32768;
		int i_1077_ = -32768;
		int i_1078_ = 0;
		int i_1079_ = 0;
		for (int i_1080_ = 0; i_1080_ < anInt9064; i_1080_++) {
			int i_1081_ = anIntArray9053[i_1080_];
			int i_1082_ = anIntArray9046[i_1080_];
			int i_1083_ = anIntArray9047[i_1080_];
			if (i_1081_ < i)
				i = i_1081_;
			if (i_1081_ > i_1075_)
				i_1075_ = i_1081_;
			if (i_1082_ < i_1073_)
				i_1073_ = i_1082_;
			if (i_1082_ > i_1076_)
				i_1076_ = i_1082_;
			if (i_1083_ < i_1074_)
				i_1074_ = i_1083_;
			if (i_1083_ > i_1077_)
				i_1077_ = i_1083_;
			int i_1084_ = i_1081_ * i_1081_ + i_1083_ * i_1083_;
			if (i_1084_ > i_1078_)
				i_1078_ = i_1084_;
			i_1084_ = i_1081_ * i_1081_ + i_1083_ * i_1083_ + i_1082_ * i_1082_;
			if (i_1084_ > i_1079_)
				i_1079_ = i_1084_;
		}
		aShort9081 = (short) i;
		aShort9082 = (short) i_1075_;
		aShort9040 = (short) i_1073_;
		aShort9080 = (short) i_1076_;
		aShort9054 = (short) i_1074_;
		aShort9076 = (short) i_1077_;
		anInt9051 = (int) (Math.sqrt((double) i_1078_) + 0.99);
		anInt9074 = (int) (Math.sqrt((double) i_1079_) + 0.99);
		aBool9078 = true;
	}

	void method2946() {
		/* empty */
	}

	static final int method14553(int i, int i_1085_) {
		i_1085_ = i_1085_ * (i & 0x7f) >> 7;
		if (i_1085_ < 2)
			i_1085_ = 2;
		else if (i_1085_ > 126)
			i_1085_ = 126;
		return (i & 0xff80) + i_1085_;
	}

	boolean method3042() {
		if (anIntArrayArray9048 == null)
			return false;
		for (int i = 0; i < anInt9043; i++) {
			anIntArray9053[i] <<= 4;
			anIntArray9046[i] <<= 4;
			anIntArray9047[i] <<= 4;
		}
		anInt9101 = 0;
		anInt9102 = 0;
		anInt9103 = 0;
		return true;
	}

	void method14554() {
		if (aBool9073) {
			aBool9073 = false;
			if (aClass167Array9090 == null && aClass159Array9045 == null && aClass150Array9093 == null && !Class134.method2189(anInt9036, anInt9037)) {
				boolean bool = false;
				boolean bool_1086_ = false;
				boolean bool_1087_ = false;
				if (anIntArray9053 != null && !Class134.method2208(anInt9036, anInt9037)) {
					if (aClass129_9068 == null || aClass129_9068.anInterface15_1547 != null) {
						if (!aBool9078)
							method14542();
						bool = true;
					} else
						aBool9073 = true;
				}
				if (anIntArray9046 != null && !Class134.method2279(anInt9036, anInt9037)) {
					if (aClass129_9068 == null || aClass129_9068.anInterface15_1547 != null) {
						if (!aBool9078)
							method14542();
						bool_1086_ = true;
					} else
						aBool9073 = true;
				}
				if (anIntArray9047 != null && !Class134.method2210(anInt9036, anInt9037)) {
					if (aClass129_9068 == null || aClass129_9068.anInterface15_1547 != null) {
						if (!aBool9078)
							method14542();
						bool_1087_ = true;
					} else
						aBool9073 = true;
				}
				if (bool)
					anIntArray9053 = null;
				if (bool_1086_)
					anIntArray9046 = null;
				if (bool_1087_)
					anIntArray9047 = null;
			}
			if (aShortArray9089 != null && anIntArray9053 == null && anIntArray9046 == null && anIntArray9047 == null) {
				aShortArray9089 = null;
				anIntArray9088 = null;
			}
			if (aByteArray9091 != null && !Class134.method2211(anInt9036, anInt9037)) {
				if (aClass129_9070 != null) {
					if (aClass129_9070.anInterface15_1547 != null) {
						aShortArray9029 = null;
						aShortArray9052 = null;
						aShortArray9092 = null;
						aByteArray9091 = null;
					} else
						aBool9073 = true;
				} else if (aClass129_9069 == null || aClass129_9069.anInterface15_1547 != null) {
					aShortArray9029 = null;
					aShortArray9052 = null;
					aShortArray9092 = null;
					aByteArray9091 = null;
				} else
					aBool9073 = true;
			}
			if (aShortArray9060 != null && !Class134.method2212(anInt9036, anInt9037)) {
				if (aClass129_9069 == null || aClass129_9069.anInterface15_1547 != null)
					aShortArray9060 = null;
				else
					aBool9073 = true;
			}
			if (aByteArray9061 != null && !Class134.method2213(anInt9036, anInt9037)) {
				if (aClass129_9069 == null || aClass129_9069.anInterface15_1547 != null)
					aByteArray9061 = null;
				else
					aBool9073 = true;
			}
			if (aFloatArray9056 != null && !Class134.method2214(anInt9036, anInt9037)) {
				if (aClass129_9071 == null || aClass129_9071.anInterface15_1547 != null) {
					aFloatArray9085 = null;
					aFloatArray9056 = null;
				} else
					aBool9073 = true;
			}
			if (aShortArray9065 != null && !Class134.method2219(anInt9036, anInt9037)) {
				if (aClass129_9069 == null || aClass129_9069.anInterface15_1547 != null)
					aShortArray9065 = null;
				else
					aBool9073 = true;
			}
			if (aShortArray9062 != null && !Class134.method2218(anInt9036, anInt9037)) {
				if ((aClass132_9072 == null || aClass132_9072.anInterface17_1556 != null) && (aClass129_9069 == null || aClass129_9069.anInterface15_1547 != null)) {
					aShortArray9050 = null;
					aShortArray9055 = null;
					aShortArray9062 = null;
				} else
					aBool9073 = true;
			}
			if (anIntArrayArray9042 != null && !Class134.method2267(anInt9036, anInt9037)) {
				anIntArrayArray9042 = null;
				aShortArray9067 = null;
			}
			if (anIntArrayArray9048 != null && !Class134.method2216(anInt9036, anInt9037)) {
				anIntArrayArray9048 = null;
				aShortArray9049 = null;
			}
			if (anIntArrayArray9028 != null && !Class134.method2217(anInt9036, anInt9037))
				anIntArrayArray9028 = null;
			if (anIntArray9087 != null && (anInt9036 & 0x800) == 0 && (anInt9036 & 0x40000) == 0)
				anIntArray9087 = null;
		}
	}

	void method3031() {
		for (int i = 0; i < anInt9043; i++) {
			anIntArray9053[i] = anIntArray9053[i] + 7 >> 4;
			anIntArray9046[i] = anIntArray9046[i] + 7 >> 4;
			anIntArray9047[i] = anIntArray9047[i] + 7 >> 4;
		}
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		aBool9078 = false;
	}

	void method2950() {
		for (int i = 0; i < anInt9043; i++) {
			anIntArray9053[i] = anIntArray9053[i] + 7 >> 4;
			anIntArray9046[i] = anIntArray9046[i] + 7 >> 4;
			anIntArray9047[i] = anIntArray9047[i] + 7 >> 4;
		}
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		aBool9078 = false;
	}

	void method2940() {
		for (int i = 0; i < anInt9043; i++) {
			anIntArray9053[i] = anIntArray9053[i] + 7 >> 4;
			anIntArray9046[i] = anIntArray9046[i] + 7 >> 4;
			anIntArray9047[i] = anIntArray9047[i] + 7 >> 4;
		}
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		aBool9078 = false;
	}

	public Class527_Sub8_Sub8 method2966(Class527_Sub8_Sub8 class527_sub8_sub8) {
		if (anInt9059 == 0)
			return null;
		if (!aBool9078)
			method14542();
		int i;
		int i_1088_;
		if (aClass180_Sub3_9035.anInt9785 > 0) {
			i = (aShort9081 - (aShort9080 * aClass180_Sub3_9035.anInt9785 >> 8) >> aClass180_Sub3_9035.anInt9850);
			i_1088_ = aShort9082 - (aShort9040 * aClass180_Sub3_9035.anInt9785 >> 8) >> aClass180_Sub3_9035.anInt9850;
		} else {
			i = (aShort9081 - (aShort9040 * aClass180_Sub3_9035.anInt9785 >> 8) >> aClass180_Sub3_9035.anInt9850);
			i_1088_ = aShort9082 - (aShort9080 * aClass180_Sub3_9035.anInt9785 >> 8) >> aClass180_Sub3_9035.anInt9850;
		}
		int i_1089_;
		int i_1090_;
		if (aClass180_Sub3_9035.anInt9786 > 0) {
			i_1089_ = aShort9054 - (aShort9080 * aClass180_Sub3_9035.anInt9786 >> 8) >> aClass180_Sub3_9035.anInt9850;
			i_1090_ = aShort9076 - (aShort9040 * aClass180_Sub3_9035.anInt9786 >> 8) >> aClass180_Sub3_9035.anInt9850;
		} else {
			i_1089_ = aShort9054 - (aShort9040 * aClass180_Sub3_9035.anInt9786 >> 8) >> aClass180_Sub3_9035.anInt9850;
			i_1090_ = aShort9076 - (aShort9080 * aClass180_Sub3_9035.anInt9786 >> 8) >> aClass180_Sub3_9035.anInt9850;
		}
		int i_1091_ = i_1088_ - i + 1;
		int i_1092_ = i_1090_ - i_1089_ + 1;
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1 = (Class527_Sub8_Sub8_Sub1) class527_sub8_sub8;
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1_1093_;
		if (class527_sub8_sub8_sub1 != null && class527_sub8_sub8_sub1.method18708(i_1091_, i_1092_)) {
			class527_sub8_sub8_sub1_1093_ = class527_sub8_sub8_sub1;
			class527_sub8_sub8_sub1_1093_.method18709();
		} else
			class527_sub8_sub8_sub1_1093_ = new Class527_Sub8_Sub8_Sub1(aClass180_Sub3_9035, i_1091_, i_1092_);
		class527_sub8_sub8_sub1_1093_.method18711(i, i_1089_, i_1088_, i_1090_);
		method14546(class527_sub8_sub8_sub1_1093_);
		return class527_sub8_sub8_sub1_1093_;
	}

	void method3034(int i, int[] is, int i_1094_, int i_1095_, int i_1096_, int i_1097_, boolean bool) {
		int i_1098_ = is.length;
		if (i == 0) {
			i_1094_ <<= 4;
			i_1095_ <<= 4;
			i_1096_ <<= 4;
			int i_1099_ = 0;
			anInt9101 = 0;
			anInt9102 = 0;
			anInt9103 = 0;
			for (int i_1100_ = 0; i_1100_ < i_1098_; i_1100_++) {
				int i_1101_ = is[i_1100_];
				if (i_1101_ < anIntArrayArray9048.length) {
					int[] is_1102_ = anIntArrayArray9048[i_1101_];
					for (int i_1103_ = 0; i_1103_ < is_1102_.length; i_1103_++) {
						int i_1104_ = is_1102_[i_1103_];
						anInt9101 += anIntArray9053[i_1104_];
						anInt9102 += anIntArray9046[i_1104_];
						anInt9103 += anIntArray9047[i_1104_];
						i_1099_++;
					}
				}
			}
			if (i_1099_ > 0) {
				anInt9101 = anInt9101 / i_1099_ + i_1094_;
				anInt9102 = anInt9102 / i_1099_ + i_1095_;
				anInt9103 = anInt9103 / i_1099_ + i_1096_;
			} else {
				anInt9101 = i_1094_;
				anInt9102 = i_1095_;
				anInt9103 = i_1096_;
			}
		} else if (i == 1) {
			i_1094_ <<= 4;
			i_1095_ <<= 4;
			i_1096_ <<= 4;
			for (int i_1105_ = 0; i_1105_ < i_1098_; i_1105_++) {
				int i_1106_ = is[i_1105_];
				if (i_1106_ < anIntArrayArray9048.length) {
					int[] is_1107_ = anIntArrayArray9048[i_1106_];
					for (int i_1108_ = 0; i_1108_ < is_1107_.length; i_1108_++) {
						int i_1109_ = is_1107_[i_1108_];
						anIntArray9053[i_1109_] += i_1094_;
						anIntArray9046[i_1109_] += i_1095_;
						anIntArray9047[i_1109_] += i_1096_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1110_ = 0; i_1110_ < i_1098_; i_1110_++) {
				int i_1111_ = is[i_1110_];
				if (i_1111_ < anIntArrayArray9048.length) {
					int[] is_1112_ = anIntArrayArray9048[i_1111_];
					if ((i_1097_ & 0x1) == 0) {
						for (int i_1113_ = 0; i_1113_ < is_1112_.length; i_1113_++) {
							int i_1114_ = is_1112_[i_1113_];
							anIntArray9053[i_1114_] -= anInt9101;
							anIntArray9046[i_1114_] -= anInt9102;
							anIntArray9047[i_1114_] -= anInt9103;
							if (i_1096_ != 0) {
								int i_1115_ = Class428.anIntArray4825[i_1096_];
								int i_1116_ = Class428.anIntArray4819[i_1096_];
								int i_1117_ = ((anIntArray9046[i_1114_] * i_1115_ + anIntArray9053[i_1114_] * i_1116_ + 16383) >> 14);
								anIntArray9046[i_1114_] = (anIntArray9046[i_1114_] * i_1116_ - anIntArray9053[i_1114_] * i_1115_ + 16383) >> 14;
								anIntArray9053[i_1114_] = i_1117_;
							}
							if (i_1094_ != 0) {
								int i_1118_ = Class428.anIntArray4825[i_1094_];
								int i_1119_ = Class428.anIntArray4819[i_1094_];
								int i_1120_ = ((anIntArray9046[i_1114_] * i_1119_ - anIntArray9047[i_1114_] * i_1118_ + 16383) >> 14);
								anIntArray9047[i_1114_] = (anIntArray9046[i_1114_] * i_1118_ + anIntArray9047[i_1114_] * i_1119_ + 16383) >> 14;
								anIntArray9046[i_1114_] = i_1120_;
							}
							if (i_1095_ != 0) {
								int i_1121_ = Class428.anIntArray4825[i_1095_];
								int i_1122_ = Class428.anIntArray4819[i_1095_];
								int i_1123_ = ((anIntArray9047[i_1114_] * i_1121_ + anIntArray9053[i_1114_] * i_1122_ + 16383) >> 14);
								anIntArray9047[i_1114_] = (anIntArray9047[i_1114_] * i_1122_ - anIntArray9053[i_1114_] * i_1121_ + 16383) >> 14;
								anIntArray9053[i_1114_] = i_1123_;
							}
							anIntArray9053[i_1114_] += anInt9101;
							anIntArray9046[i_1114_] += anInt9102;
							anIntArray9047[i_1114_] += anInt9103;
						}
					} else {
						for (int i_1124_ = 0; i_1124_ < is_1112_.length; i_1124_++) {
							int i_1125_ = is_1112_[i_1124_];
							anIntArray9053[i_1125_] -= anInt9101;
							anIntArray9046[i_1125_] -= anInt9102;
							anIntArray9047[i_1125_] -= anInt9103;
							if (i_1094_ != 0) {
								int i_1126_ = Class428.anIntArray4825[i_1094_];
								int i_1127_ = Class428.anIntArray4819[i_1094_];
								int i_1128_ = ((anIntArray9046[i_1125_] * i_1127_ - anIntArray9047[i_1125_] * i_1126_ + 16383) >> 14);
								anIntArray9047[i_1125_] = (anIntArray9046[i_1125_] * i_1126_ + anIntArray9047[i_1125_] * i_1127_ + 16383) >> 14;
								anIntArray9046[i_1125_] = i_1128_;
							}
							if (i_1096_ != 0) {
								int i_1129_ = Class428.anIntArray4825[i_1096_];
								int i_1130_ = Class428.anIntArray4819[i_1096_];
								int i_1131_ = ((anIntArray9046[i_1125_] * i_1129_ + anIntArray9053[i_1125_] * i_1130_ + 16383) >> 14);
								anIntArray9046[i_1125_] = (anIntArray9046[i_1125_] * i_1130_ - anIntArray9053[i_1125_] * i_1129_ + 16383) >> 14;
								anIntArray9053[i_1125_] = i_1131_;
							}
							if (i_1095_ != 0) {
								int i_1132_ = Class428.anIntArray4825[i_1095_];
								int i_1133_ = Class428.anIntArray4819[i_1095_];
								int i_1134_ = ((anIntArray9047[i_1125_] * i_1132_ + anIntArray9053[i_1125_] * i_1133_ + 16383) >> 14);
								anIntArray9047[i_1125_] = (anIntArray9047[i_1125_] * i_1133_ - anIntArray9053[i_1125_] * i_1132_ + 16383) >> 14;
								anIntArray9053[i_1125_] = i_1134_;
							}
							anIntArray9053[i_1125_] += anInt9101;
							anIntArray9046[i_1125_] += anInt9102;
							anIntArray9047[i_1125_] += anInt9103;
						}
					}
				}
			}
			if (bool) {
				for (int i_1135_ = 0; i_1135_ < i_1098_; i_1135_++) {
					int i_1136_ = is[i_1135_];
					if (i_1136_ < anIntArrayArray9048.length) {
						int[] is_1137_ = anIntArrayArray9048[i_1136_];
						for (int i_1138_ = 0; i_1138_ < is_1137_.length; i_1138_++) {
							int i_1139_ = is_1137_[i_1138_];
							int i_1140_ = anIntArray9088[i_1139_];
							int i_1141_ = anIntArray9088[i_1139_ + 1];
							for (int i_1142_ = i_1140_; (i_1142_ < i_1141_ && aShortArray9089[i_1142_] != 0); i_1142_++) {
								int i_1143_ = (aShortArray9089[i_1142_] & 0xffff) - 1;
								if (i_1096_ != 0) {
									int i_1144_ = Class428.anIntArray4825[i_1096_];
									int i_1145_ = Class428.anIntArray4819[i_1096_];
									int i_1146_ = (aShortArray9052[i_1143_] * i_1144_ + aShortArray9092[i_1143_] * i_1145_ + 16383) >> 14;
									aShortArray9052[i_1143_] = (short) (((aShortArray9052[i_1143_] * i_1145_) - (aShortArray9092[i_1143_] * i_1144_) + 16383) >> 14);
									aShortArray9092[i_1143_] = (short) i_1146_;
								}
								if (i_1094_ != 0) {
									int i_1147_ = Class428.anIntArray4825[i_1094_];
									int i_1148_ = Class428.anIntArray4819[i_1094_];
									int i_1149_ = (aShortArray9052[i_1143_] * i_1148_ - aShortArray9029[i_1143_] * i_1147_ + 16383) >> 14;
									aShortArray9029[i_1143_] = (short) (((aShortArray9052[i_1143_] * i_1147_) + (aShortArray9029[i_1143_] * i_1148_) + 16383) >> 14);
									aShortArray9052[i_1143_] = (short) i_1149_;
								}
								if (i_1095_ != 0) {
									int i_1150_ = Class428.anIntArray4825[i_1095_];
									int i_1151_ = Class428.anIntArray4819[i_1095_];
									int i_1152_ = (aShortArray9029[i_1143_] * i_1150_ + aShortArray9092[i_1143_] * i_1151_ + 16383) >> 14;
									aShortArray9029[i_1143_] = (short) (((aShortArray9029[i_1143_] * i_1151_) - (aShortArray9092[i_1143_] * i_1150_) + 16383) >> 14);
									aShortArray9092[i_1143_] = (short) i_1152_;
								}
							}
						}
					}
				}
				if (aClass129_9070 == null && aClass129_9069 != null)
					aClass129_9069.anInterface15_1547 = null;
				if (aClass129_9070 != null)
					aClass129_9070.anInterface15_1547 = null;
			}
		} else if (i == 3) {
			for (int i_1153_ = 0; i_1153_ < i_1098_; i_1153_++) {
				int i_1154_ = is[i_1153_];
				if (i_1154_ < anIntArrayArray9048.length) {
					int[] is_1155_ = anIntArrayArray9048[i_1154_];
					for (int i_1156_ = 0; i_1156_ < is_1155_.length; i_1156_++) {
						int i_1157_ = is_1155_[i_1156_];
						anIntArray9053[i_1157_] -= anInt9101;
						anIntArray9046[i_1157_] -= anInt9102;
						anIntArray9047[i_1157_] -= anInt9103;
						anIntArray9053[i_1157_] = anIntArray9053[i_1157_] * i_1094_ >> 7;
						anIntArray9046[i_1157_] = anIntArray9046[i_1157_] * i_1095_ >> 7;
						anIntArray9047[i_1157_] = anIntArray9047[i_1157_] * i_1096_ >> 7;
						anIntArray9053[i_1157_] += anInt9101;
						anIntArray9046[i_1157_] += anInt9102;
						anIntArray9047[i_1157_] += anInt9103;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9042 != null) {
				for (int i_1158_ = 0; i_1158_ < i_1098_; i_1158_++) {
					int i_1159_ = is[i_1158_];
					if (i_1159_ < anIntArrayArray9042.length) {
						int[] is_1160_ = anIntArrayArray9042[i_1159_];
						for (int i_1161_ = 0; i_1161_ < is_1160_.length; i_1161_++) {
							int i_1162_ = is_1160_[i_1161_];
							int i_1163_ = ((aByteArray9061[i_1162_] & 0xff) + i_1094_ * 8);
							if (i_1163_ < 0)
								i_1163_ = 0;
							else if (i_1163_ > 255)
								i_1163_ = 255;
							aByteArray9061[i_1162_] = (byte) i_1163_;
						}
						if (is_1160_.length > 0 && aClass129_9069 != null)
							aClass129_9069.anInterface15_1547 = null;
					}
				}
				if (aClass150Array9093 != null) {
					for (int i_1164_ = 0; i_1164_ < anInt9075; i_1164_++) {
						Class150 class150 = aClass150Array9093[i_1164_];
						Class130 class130 = aClass130Array9094[i_1164_];
						class130.anInt1553 = (class130.anInt1553 & 0xffffff | 255 - (aByteArray9061[class150.anInt1682] & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9042 != null) {
				for (int i_1165_ = 0; i_1165_ < i_1098_; i_1165_++) {
					int i_1166_ = is[i_1165_];
					if (i_1166_ < anIntArrayArray9042.length) {
						int[] is_1167_ = anIntArrayArray9042[i_1166_];
						for (int i_1168_ = 0; i_1168_ < is_1167_.length; i_1168_++) {
							int i_1169_ = is_1167_[i_1168_];
							int i_1170_ = aShortArray9060[i_1169_] & 0xffff;
							int i_1171_ = i_1170_ >> 10 & 0x3f;
							int i_1172_ = i_1170_ >> 7 & 0x7;
							int i_1173_ = i_1170_ & 0x7f;
							i_1171_ = i_1171_ + i_1094_ & 0x3f;
							i_1172_ += i_1095_ / 4;
							if (i_1172_ < 0)
								i_1172_ = 0;
							else if (i_1172_ > 7)
								i_1172_ = 7;
							i_1173_ += i_1096_;
							if (i_1173_ < 0)
								i_1173_ = 0;
							else if (i_1173_ > 127)
								i_1173_ = 127;
							aShortArray9060[i_1169_] = (short) (i_1171_ << 10 | i_1172_ << 7 | i_1173_);
						}
						if (is_1167_.length > 0 && aClass129_9069 != null)
							aClass129_9069.anInterface15_1547 = null;
					}
				}
				if (aClass150Array9093 != null) {
					for (int i_1174_ = 0; i_1174_ < anInt9075; i_1174_++) {
						Class150 class150 = aClass150Array9093[i_1174_];
						Class130 class130 = aClass130Array9094[i_1174_];
						class130.anInt1553 = (class130.anInt1553 & ~0xffffff | (Class656.anIntArray8390[(aShortArray9060[class150.anInt1682] & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9028 != null) {
				for (int i_1175_ = 0; i_1175_ < i_1098_; i_1175_++) {
					int i_1176_ = is[i_1175_];
					if (i_1176_ < anIntArrayArray9028.length) {
						int[] is_1177_ = anIntArrayArray9028[i_1176_];
						for (int i_1178_ = 0; i_1178_ < is_1177_.length; i_1178_++) {
							Class130 class130 = aClass130Array9094[is_1177_[i_1178_]];
							class130.anInt1548 += i_1094_;
							class130.anInt1552 += i_1095_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9028 != null) {
				for (int i_1179_ = 0; i_1179_ < i_1098_; i_1179_++) {
					int i_1180_ = is[i_1179_];
					if (i_1180_ < anIntArrayArray9028.length) {
						int[] is_1181_ = anIntArrayArray9028[i_1180_];
						for (int i_1182_ = 0; i_1182_ < is_1181_.length; i_1182_++) {
							Class130 class130 = aClass130Array9094[is_1181_[i_1182_]];
							class130.anInt1549 = class130.anInt1549 * i_1094_ >> 7;
							class130.anInt1551 = class130.anInt1551 * i_1095_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9028 != null) {
				for (int i_1183_ = 0; i_1183_ < i_1098_; i_1183_++) {
					int i_1184_ = is[i_1183_];
					if (i_1184_ < anIntArrayArray9028.length) {
						int[] is_1185_ = anIntArrayArray9028[i_1184_];
						for (int i_1186_ = 0; i_1186_ < is_1185_.length; i_1186_++) {
							Class130 class130 = aClass130Array9094[is_1185_[i_1186_]];
							class130.anInt1550 = class130.anInt1550 + i_1094_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	void method2954(int i, int[] is, int i_1187_, int i_1188_, int i_1189_, int i_1190_, boolean bool) {
		int i_1191_ = is.length;
		if (i == 0) {
			i_1187_ <<= 4;
			i_1188_ <<= 4;
			i_1189_ <<= 4;
			int i_1192_ = 0;
			anInt9101 = 0;
			anInt9102 = 0;
			anInt9103 = 0;
			for (int i_1193_ = 0; i_1193_ < i_1191_; i_1193_++) {
				int i_1194_ = is[i_1193_];
				if (i_1194_ < anIntArrayArray9048.length) {
					int[] is_1195_ = anIntArrayArray9048[i_1194_];
					for (int i_1196_ = 0; i_1196_ < is_1195_.length; i_1196_++) {
						int i_1197_ = is_1195_[i_1196_];
						anInt9101 += anIntArray9053[i_1197_];
						anInt9102 += anIntArray9046[i_1197_];
						anInt9103 += anIntArray9047[i_1197_];
						i_1192_++;
					}
				}
			}
			if (i_1192_ > 0) {
				anInt9101 = anInt9101 / i_1192_ + i_1187_;
				anInt9102 = anInt9102 / i_1192_ + i_1188_;
				anInt9103 = anInt9103 / i_1192_ + i_1189_;
			} else {
				anInt9101 = i_1187_;
				anInt9102 = i_1188_;
				anInt9103 = i_1189_;
			}
		} else if (i == 1) {
			i_1187_ <<= 4;
			i_1188_ <<= 4;
			i_1189_ <<= 4;
			for (int i_1198_ = 0; i_1198_ < i_1191_; i_1198_++) {
				int i_1199_ = is[i_1198_];
				if (i_1199_ < anIntArrayArray9048.length) {
					int[] is_1200_ = anIntArrayArray9048[i_1199_];
					for (int i_1201_ = 0; i_1201_ < is_1200_.length; i_1201_++) {
						int i_1202_ = is_1200_[i_1201_];
						anIntArray9053[i_1202_] += i_1187_;
						anIntArray9046[i_1202_] += i_1188_;
						anIntArray9047[i_1202_] += i_1189_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1203_ = 0; i_1203_ < i_1191_; i_1203_++) {
				int i_1204_ = is[i_1203_];
				if (i_1204_ < anIntArrayArray9048.length) {
					int[] is_1205_ = anIntArrayArray9048[i_1204_];
					if ((i_1190_ & 0x1) == 0) {
						for (int i_1206_ = 0; i_1206_ < is_1205_.length; i_1206_++) {
							int i_1207_ = is_1205_[i_1206_];
							anIntArray9053[i_1207_] -= anInt9101;
							anIntArray9046[i_1207_] -= anInt9102;
							anIntArray9047[i_1207_] -= anInt9103;
							if (i_1189_ != 0) {
								int i_1208_ = Class428.anIntArray4825[i_1189_];
								int i_1209_ = Class428.anIntArray4819[i_1189_];
								int i_1210_ = ((anIntArray9046[i_1207_] * i_1208_ + anIntArray9053[i_1207_] * i_1209_ + 16383) >> 14);
								anIntArray9046[i_1207_] = (anIntArray9046[i_1207_] * i_1209_ - anIntArray9053[i_1207_] * i_1208_ + 16383) >> 14;
								anIntArray9053[i_1207_] = i_1210_;
							}
							if (i_1187_ != 0) {
								int i_1211_ = Class428.anIntArray4825[i_1187_];
								int i_1212_ = Class428.anIntArray4819[i_1187_];
								int i_1213_ = ((anIntArray9046[i_1207_] * i_1212_ - anIntArray9047[i_1207_] * i_1211_ + 16383) >> 14);
								anIntArray9047[i_1207_] = (anIntArray9046[i_1207_] * i_1211_ + anIntArray9047[i_1207_] * i_1212_ + 16383) >> 14;
								anIntArray9046[i_1207_] = i_1213_;
							}
							if (i_1188_ != 0) {
								int i_1214_ = Class428.anIntArray4825[i_1188_];
								int i_1215_ = Class428.anIntArray4819[i_1188_];
								int i_1216_ = ((anIntArray9047[i_1207_] * i_1214_ + anIntArray9053[i_1207_] * i_1215_ + 16383) >> 14);
								anIntArray9047[i_1207_] = (anIntArray9047[i_1207_] * i_1215_ - anIntArray9053[i_1207_] * i_1214_ + 16383) >> 14;
								anIntArray9053[i_1207_] = i_1216_;
							}
							anIntArray9053[i_1207_] += anInt9101;
							anIntArray9046[i_1207_] += anInt9102;
							anIntArray9047[i_1207_] += anInt9103;
						}
					} else {
						for (int i_1217_ = 0; i_1217_ < is_1205_.length; i_1217_++) {
							int i_1218_ = is_1205_[i_1217_];
							anIntArray9053[i_1218_] -= anInt9101;
							anIntArray9046[i_1218_] -= anInt9102;
							anIntArray9047[i_1218_] -= anInt9103;
							if (i_1187_ != 0) {
								int i_1219_ = Class428.anIntArray4825[i_1187_];
								int i_1220_ = Class428.anIntArray4819[i_1187_];
								int i_1221_ = ((anIntArray9046[i_1218_] * i_1220_ - anIntArray9047[i_1218_] * i_1219_ + 16383) >> 14);
								anIntArray9047[i_1218_] = (anIntArray9046[i_1218_] * i_1219_ + anIntArray9047[i_1218_] * i_1220_ + 16383) >> 14;
								anIntArray9046[i_1218_] = i_1221_;
							}
							if (i_1189_ != 0) {
								int i_1222_ = Class428.anIntArray4825[i_1189_];
								int i_1223_ = Class428.anIntArray4819[i_1189_];
								int i_1224_ = ((anIntArray9046[i_1218_] * i_1222_ + anIntArray9053[i_1218_] * i_1223_ + 16383) >> 14);
								anIntArray9046[i_1218_] = (anIntArray9046[i_1218_] * i_1223_ - anIntArray9053[i_1218_] * i_1222_ + 16383) >> 14;
								anIntArray9053[i_1218_] = i_1224_;
							}
							if (i_1188_ != 0) {
								int i_1225_ = Class428.anIntArray4825[i_1188_];
								int i_1226_ = Class428.anIntArray4819[i_1188_];
								int i_1227_ = ((anIntArray9047[i_1218_] * i_1225_ + anIntArray9053[i_1218_] * i_1226_ + 16383) >> 14);
								anIntArray9047[i_1218_] = (anIntArray9047[i_1218_] * i_1226_ - anIntArray9053[i_1218_] * i_1225_ + 16383) >> 14;
								anIntArray9053[i_1218_] = i_1227_;
							}
							anIntArray9053[i_1218_] += anInt9101;
							anIntArray9046[i_1218_] += anInt9102;
							anIntArray9047[i_1218_] += anInt9103;
						}
					}
				}
			}
			if (bool) {
				for (int i_1228_ = 0; i_1228_ < i_1191_; i_1228_++) {
					int i_1229_ = is[i_1228_];
					if (i_1229_ < anIntArrayArray9048.length) {
						int[] is_1230_ = anIntArrayArray9048[i_1229_];
						for (int i_1231_ = 0; i_1231_ < is_1230_.length; i_1231_++) {
							int i_1232_ = is_1230_[i_1231_];
							int i_1233_ = anIntArray9088[i_1232_];
							int i_1234_ = anIntArray9088[i_1232_ + 1];
							for (int i_1235_ = i_1233_; (i_1235_ < i_1234_ && aShortArray9089[i_1235_] != 0); i_1235_++) {
								int i_1236_ = (aShortArray9089[i_1235_] & 0xffff) - 1;
								if (i_1189_ != 0) {
									int i_1237_ = Class428.anIntArray4825[i_1189_];
									int i_1238_ = Class428.anIntArray4819[i_1189_];
									int i_1239_ = (aShortArray9052[i_1236_] * i_1237_ + aShortArray9092[i_1236_] * i_1238_ + 16383) >> 14;
									aShortArray9052[i_1236_] = (short) (((aShortArray9052[i_1236_] * i_1238_) - (aShortArray9092[i_1236_] * i_1237_) + 16383) >> 14);
									aShortArray9092[i_1236_] = (short) i_1239_;
								}
								if (i_1187_ != 0) {
									int i_1240_ = Class428.anIntArray4825[i_1187_];
									int i_1241_ = Class428.anIntArray4819[i_1187_];
									int i_1242_ = (aShortArray9052[i_1236_] * i_1241_ - aShortArray9029[i_1236_] * i_1240_ + 16383) >> 14;
									aShortArray9029[i_1236_] = (short) (((aShortArray9052[i_1236_] * i_1240_) + (aShortArray9029[i_1236_] * i_1241_) + 16383) >> 14);
									aShortArray9052[i_1236_] = (short) i_1242_;
								}
								if (i_1188_ != 0) {
									int i_1243_ = Class428.anIntArray4825[i_1188_];
									int i_1244_ = Class428.anIntArray4819[i_1188_];
									int i_1245_ = (aShortArray9029[i_1236_] * i_1243_ + aShortArray9092[i_1236_] * i_1244_ + 16383) >> 14;
									aShortArray9029[i_1236_] = (short) (((aShortArray9029[i_1236_] * i_1244_) - (aShortArray9092[i_1236_] * i_1243_) + 16383) >> 14);
									aShortArray9092[i_1236_] = (short) i_1245_;
								}
							}
						}
					}
				}
				if (aClass129_9070 == null && aClass129_9069 != null)
					aClass129_9069.anInterface15_1547 = null;
				if (aClass129_9070 != null)
					aClass129_9070.anInterface15_1547 = null;
			}
		} else if (i == 3) {
			for (int i_1246_ = 0; i_1246_ < i_1191_; i_1246_++) {
				int i_1247_ = is[i_1246_];
				if (i_1247_ < anIntArrayArray9048.length) {
					int[] is_1248_ = anIntArrayArray9048[i_1247_];
					for (int i_1249_ = 0; i_1249_ < is_1248_.length; i_1249_++) {
						int i_1250_ = is_1248_[i_1249_];
						anIntArray9053[i_1250_] -= anInt9101;
						anIntArray9046[i_1250_] -= anInt9102;
						anIntArray9047[i_1250_] -= anInt9103;
						anIntArray9053[i_1250_] = anIntArray9053[i_1250_] * i_1187_ >> 7;
						anIntArray9046[i_1250_] = anIntArray9046[i_1250_] * i_1188_ >> 7;
						anIntArray9047[i_1250_] = anIntArray9047[i_1250_] * i_1189_ >> 7;
						anIntArray9053[i_1250_] += anInt9101;
						anIntArray9046[i_1250_] += anInt9102;
						anIntArray9047[i_1250_] += anInt9103;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9042 != null) {
				for (int i_1251_ = 0; i_1251_ < i_1191_; i_1251_++) {
					int i_1252_ = is[i_1251_];
					if (i_1252_ < anIntArrayArray9042.length) {
						int[] is_1253_ = anIntArrayArray9042[i_1252_];
						for (int i_1254_ = 0; i_1254_ < is_1253_.length; i_1254_++) {
							int i_1255_ = is_1253_[i_1254_];
							int i_1256_ = ((aByteArray9061[i_1255_] & 0xff) + i_1187_ * 8);
							if (i_1256_ < 0)
								i_1256_ = 0;
							else if (i_1256_ > 255)
								i_1256_ = 255;
							aByteArray9061[i_1255_] = (byte) i_1256_;
						}
						if (is_1253_.length > 0 && aClass129_9069 != null)
							aClass129_9069.anInterface15_1547 = null;
					}
				}
				if (aClass150Array9093 != null) {
					for (int i_1257_ = 0; i_1257_ < anInt9075; i_1257_++) {
						Class150 class150 = aClass150Array9093[i_1257_];
						Class130 class130 = aClass130Array9094[i_1257_];
						class130.anInt1553 = (class130.anInt1553 & 0xffffff | 255 - (aByteArray9061[class150.anInt1682] & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9042 != null) {
				for (int i_1258_ = 0; i_1258_ < i_1191_; i_1258_++) {
					int i_1259_ = is[i_1258_];
					if (i_1259_ < anIntArrayArray9042.length) {
						int[] is_1260_ = anIntArrayArray9042[i_1259_];
						for (int i_1261_ = 0; i_1261_ < is_1260_.length; i_1261_++) {
							int i_1262_ = is_1260_[i_1261_];
							int i_1263_ = aShortArray9060[i_1262_] & 0xffff;
							int i_1264_ = i_1263_ >> 10 & 0x3f;
							int i_1265_ = i_1263_ >> 7 & 0x7;
							int i_1266_ = i_1263_ & 0x7f;
							i_1264_ = i_1264_ + i_1187_ & 0x3f;
							i_1265_ += i_1188_ / 4;
							if (i_1265_ < 0)
								i_1265_ = 0;
							else if (i_1265_ > 7)
								i_1265_ = 7;
							i_1266_ += i_1189_;
							if (i_1266_ < 0)
								i_1266_ = 0;
							else if (i_1266_ > 127)
								i_1266_ = 127;
							aShortArray9060[i_1262_] = (short) (i_1264_ << 10 | i_1265_ << 7 | i_1266_);
						}
						if (is_1260_.length > 0 && aClass129_9069 != null)
							aClass129_9069.anInterface15_1547 = null;
					}
				}
				if (aClass150Array9093 != null) {
					for (int i_1267_ = 0; i_1267_ < anInt9075; i_1267_++) {
						Class150 class150 = aClass150Array9093[i_1267_];
						Class130 class130 = aClass130Array9094[i_1267_];
						class130.anInt1553 = (class130.anInt1553 & ~0xffffff | (Class656.anIntArray8390[(aShortArray9060[class150.anInt1682] & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9028 != null) {
				for (int i_1268_ = 0; i_1268_ < i_1191_; i_1268_++) {
					int i_1269_ = is[i_1268_];
					if (i_1269_ < anIntArrayArray9028.length) {
						int[] is_1270_ = anIntArrayArray9028[i_1269_];
						for (int i_1271_ = 0; i_1271_ < is_1270_.length; i_1271_++) {
							Class130 class130 = aClass130Array9094[is_1270_[i_1271_]];
							class130.anInt1548 += i_1187_;
							class130.anInt1552 += i_1188_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9028 != null) {
				for (int i_1272_ = 0; i_1272_ < i_1191_; i_1272_++) {
					int i_1273_ = is[i_1272_];
					if (i_1273_ < anIntArrayArray9028.length) {
						int[] is_1274_ = anIntArrayArray9028[i_1273_];
						for (int i_1275_ = 0; i_1275_ < is_1274_.length; i_1275_++) {
							Class130 class130 = aClass130Array9094[is_1274_[i_1275_]];
							class130.anInt1549 = class130.anInt1549 * i_1187_ >> 7;
							class130.anInt1551 = class130.anInt1551 * i_1188_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9028 != null) {
				for (int i_1276_ = 0; i_1276_ < i_1191_; i_1276_++) {
					int i_1277_ = is[i_1276_];
					if (i_1277_ < anIntArrayArray9028.length) {
						int[] is_1278_ = anIntArrayArray9028[i_1277_];
						for (int i_1279_ = 0; i_1279_ < is_1278_.length; i_1279_++) {
							Class130 class130 = aClass130Array9094[is_1278_[i_1279_]];
							class130.anInt1550 = class130.anInt1550 + i_1187_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	void method2955(int i, int[] is, int i_1280_, int i_1281_, int i_1282_, boolean bool, int i_1283_, int[] is_1284_) {
		int i_1285_ = is.length;
		if (i == 0) {
			i_1280_ <<= 4;
			i_1281_ <<= 4;
			i_1282_ <<= 4;
			int i_1286_ = 0;
			anInt9101 = 0;
			anInt9102 = 0;
			anInt9103 = 0;
			for (int i_1287_ = 0; i_1287_ < i_1285_; i_1287_++) {
				int i_1288_ = is[i_1287_];
				if (i_1288_ < anIntArrayArray9048.length) {
					int[] is_1289_ = anIntArrayArray9048[i_1288_];
					for (int i_1290_ = 0; i_1290_ < is_1289_.length; i_1290_++) {
						int i_1291_ = is_1289_[i_1290_];
						if (aShortArray9049 == null || (i_1283_ & aShortArray9049[i_1291_]) != 0) {
							anInt9101 += anIntArray9053[i_1291_];
							anInt9102 += anIntArray9046[i_1291_];
							anInt9103 += anIntArray9047[i_1291_];
							i_1286_++;
						}
					}
				}
			}
			if (i_1286_ > 0) {
				anInt9101 = anInt9101 / i_1286_ + i_1280_;
				anInt9102 = anInt9102 / i_1286_ + i_1281_;
				anInt9103 = anInt9103 / i_1286_ + i_1282_;
				aBool9104 = true;
			} else {
				anInt9101 = i_1280_;
				anInt9102 = i_1281_;
				anInt9103 = i_1282_;
			}
		} else if (i == 1) {
			if (is_1284_ != null) {
				int i_1292_ = ((is_1284_[0] * i_1280_ + is_1284_[1] * i_1281_ + is_1284_[2] * i_1282_ + 8192) >> 14);
				int i_1293_ = ((is_1284_[3] * i_1280_ + is_1284_[4] * i_1281_ + is_1284_[5] * i_1282_ + 8192) >> 14);
				int i_1294_ = ((is_1284_[6] * i_1280_ + is_1284_[7] * i_1281_ + is_1284_[8] * i_1282_ + 8192) >> 14);
				i_1280_ = i_1292_;
				i_1281_ = i_1293_;
				i_1282_ = i_1294_;
			}
			i_1280_ <<= 4;
			i_1281_ <<= 4;
			i_1282_ <<= 4;
			for (int i_1295_ = 0; i_1295_ < i_1285_; i_1295_++) {
				int i_1296_ = is[i_1295_];
				if (i_1296_ < anIntArrayArray9048.length) {
					int[] is_1297_ = anIntArrayArray9048[i_1296_];
					for (int i_1298_ = 0; i_1298_ < is_1297_.length; i_1298_++) {
						int i_1299_ = is_1297_[i_1298_];
						if (aShortArray9049 == null || (i_1283_ & aShortArray9049[i_1299_]) != 0) {
							anIntArray9053[i_1299_] += i_1280_;
							anIntArray9046[i_1299_] += i_1281_;
							anIntArray9047[i_1299_] += i_1282_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1284_ != null) {
				int i_1300_ = is_1284_[9] << 4;
				int i_1301_ = is_1284_[10] << 4;
				int i_1302_ = is_1284_[11] << 4;
				int i_1303_ = is_1284_[12] << 4;
				int i_1304_ = is_1284_[13] << 4;
				int i_1305_ = is_1284_[14] << 4;
				if (aBool9104) {
					int i_1306_ = ((is_1284_[0] * anInt9101 + is_1284_[3] * anInt9102 + is_1284_[6] * anInt9103 + 8192) >> 14);
					int i_1307_ = ((is_1284_[1] * anInt9101 + is_1284_[4] * anInt9102 + is_1284_[7] * anInt9103 + 8192) >> 14);
					int i_1308_ = ((is_1284_[2] * anInt9101 + is_1284_[5] * anInt9102 + is_1284_[8] * anInt9103 + 8192) >> 14);
					i_1306_ += i_1303_;
					i_1307_ += i_1304_;
					i_1308_ += i_1305_;
					anInt9101 = i_1306_;
					anInt9102 = i_1307_;
					anInt9103 = i_1308_;
					aBool9104 = false;
				}
				int[] is_1309_ = new int[9];
				int i_1310_ = Class428.anIntArray4819[i_1280_];
				int i_1311_ = Class428.anIntArray4825[i_1280_];
				int i_1312_ = Class428.anIntArray4819[i_1281_];
				int i_1313_ = Class428.anIntArray4825[i_1281_];
				int i_1314_ = Class428.anIntArray4819[i_1282_];
				int i_1315_ = Class428.anIntArray4825[i_1282_];
				int i_1316_ = i_1311_ * i_1314_ + 8192 >> 14;
				int i_1317_ = i_1311_ * i_1315_ + 8192 >> 14;
				is_1309_[0] = i_1312_ * i_1314_ + i_1313_ * i_1317_ + 8192 >> 14;
				is_1309_[1] = -i_1312_ * i_1315_ + i_1313_ * i_1316_ + 8192 >> 14;
				is_1309_[2] = i_1313_ * i_1310_ + 8192 >> 14;
				is_1309_[3] = i_1310_ * i_1315_ + 8192 >> 14;
				is_1309_[4] = i_1310_ * i_1314_ + 8192 >> 14;
				is_1309_[5] = -i_1311_;
				is_1309_[6] = -i_1313_ * i_1314_ + i_1312_ * i_1317_ + 8192 >> 14;
				is_1309_[7] = i_1313_ * i_1315_ + i_1312_ * i_1316_ + 8192 >> 14;
				is_1309_[8] = i_1312_ * i_1310_ + 8192 >> 14;
				int i_1318_ = ((is_1309_[0] * -anInt9101 + is_1309_[1] * -anInt9102 + is_1309_[2] * -anInt9103 + 8192) >> 14);
				int i_1319_ = ((is_1309_[3] * -anInt9101 + is_1309_[4] * -anInt9102 + is_1309_[5] * -anInt9103 + 8192) >> 14);
				int i_1320_ = ((is_1309_[6] * -anInt9101 + is_1309_[7] * -anInt9102 + is_1309_[8] * -anInt9103 + 8192) >> 14);
				int i_1321_ = i_1318_ + anInt9101;
				int i_1322_ = i_1319_ + anInt9102;
				int i_1323_ = i_1320_ + anInt9103;
				int[] is_1324_ = new int[9];
				for (int i_1325_ = 0; i_1325_ < 3; i_1325_++) {
					for (int i_1326_ = 0; i_1326_ < 3; i_1326_++) {
						int i_1327_ = 0;
						for (int i_1328_ = 0; i_1328_ < 3; i_1328_++)
							i_1327_ += (is_1309_[i_1325_ * 3 + i_1328_] * is_1284_[i_1326_ * 3 + i_1328_]);
						is_1324_[i_1325_ * 3 + i_1326_] = i_1327_ + 8192 >> 14;
					}
				}
				int i_1329_ = ((is_1309_[0] * i_1303_ + is_1309_[1] * i_1304_ + is_1309_[2] * i_1305_ + 8192) >> 14);
				int i_1330_ = ((is_1309_[3] * i_1303_ + is_1309_[4] * i_1304_ + is_1309_[5] * i_1305_ + 8192) >> 14);
				int i_1331_ = ((is_1309_[6] * i_1303_ + is_1309_[7] * i_1304_ + is_1309_[8] * i_1305_ + 8192) >> 14);
				i_1329_ += i_1321_;
				i_1330_ += i_1322_;
				i_1331_ += i_1323_;
				int[] is_1332_ = new int[9];
				for (int i_1333_ = 0; i_1333_ < 3; i_1333_++) {
					for (int i_1334_ = 0; i_1334_ < 3; i_1334_++) {
						int i_1335_ = 0;
						for (int i_1336_ = 0; i_1336_ < 3; i_1336_++)
							i_1335_ += (is_1284_[i_1333_ * 3 + i_1336_] * is_1324_[i_1334_ + i_1336_ * 3]);
						is_1332_[i_1333_ * 3 + i_1334_] = i_1335_ + 8192 >> 14;
					}
				}
				int i_1337_ = ((is_1284_[0] * i_1329_ + is_1284_[1] * i_1330_ + is_1284_[2] * i_1331_ + 8192) >> 14);
				int i_1338_ = ((is_1284_[3] * i_1329_ + is_1284_[4] * i_1330_ + is_1284_[5] * i_1331_ + 8192) >> 14);
				int i_1339_ = ((is_1284_[6] * i_1329_ + is_1284_[7] * i_1330_ + is_1284_[8] * i_1331_ + 8192) >> 14);
				i_1337_ += i_1300_;
				i_1338_ += i_1301_;
				i_1339_ += i_1302_;
				for (int i_1340_ = 0; i_1340_ < i_1285_; i_1340_++) {
					int i_1341_ = is[i_1340_];
					if (i_1341_ < anIntArrayArray9048.length) {
						int[] is_1342_ = anIntArrayArray9048[i_1341_];
						for (int i_1343_ = 0; i_1343_ < is_1342_.length; i_1343_++) {
							int i_1344_ = is_1342_[i_1343_];
							if (aShortArray9049 == null || (i_1283_ & aShortArray9049[i_1344_]) != 0) {
								int i_1345_ = ((is_1332_[0] * anIntArray9053[i_1344_] + is_1332_[1] * anIntArray9046[i_1344_] + is_1332_[2] * anIntArray9047[i_1344_] + 8192) >> 14);
								int i_1346_ = ((is_1332_[3] * anIntArray9053[i_1344_] + is_1332_[4] * anIntArray9046[i_1344_] + is_1332_[5] * anIntArray9047[i_1344_] + 8192) >> 14);
								int i_1347_ = ((is_1332_[6] * anIntArray9053[i_1344_] + is_1332_[7] * anIntArray9046[i_1344_] + is_1332_[8] * anIntArray9047[i_1344_] + 8192) >> 14);
								i_1345_ += i_1337_;
								i_1346_ += i_1338_;
								i_1347_ += i_1339_;
								anIntArray9053[i_1344_] = i_1345_;
								anIntArray9046[i_1344_] = i_1346_;
								anIntArray9047[i_1344_] = i_1347_;
							}
						}
					}
				}
			} else {
				for (int i_1348_ = 0; i_1348_ < i_1285_; i_1348_++) {
					int i_1349_ = is[i_1348_];
					if (i_1349_ < anIntArrayArray9048.length) {
						int[] is_1350_ = anIntArrayArray9048[i_1349_];
						for (int i_1351_ = 0; i_1351_ < is_1350_.length; i_1351_++) {
							int i_1352_ = is_1350_[i_1351_];
							if (aShortArray9049 == null || (i_1283_ & aShortArray9049[i_1352_]) != 0) {
								anIntArray9053[i_1352_] -= anInt9101;
								anIntArray9046[i_1352_] -= anInt9102;
								anIntArray9047[i_1352_] -= anInt9103;
								if (i_1282_ != 0) {
									int i_1353_ = Class428.anIntArray4825[i_1282_];
									int i_1354_ = Class428.anIntArray4819[i_1282_];
									int i_1355_ = ((anIntArray9046[i_1352_] * i_1353_ + anIntArray9053[i_1352_] * i_1354_ + 16383) >> 14);
									anIntArray9046[i_1352_] = (anIntArray9046[i_1352_] * i_1354_ - anIntArray9053[i_1352_] * i_1353_ + 16383) >> 14;
									anIntArray9053[i_1352_] = i_1355_;
								}
								if (i_1280_ != 0) {
									int i_1356_ = Class428.anIntArray4825[i_1280_];
									int i_1357_ = Class428.anIntArray4819[i_1280_];
									int i_1358_ = ((anIntArray9046[i_1352_] * i_1357_ - anIntArray9047[i_1352_] * i_1356_ + 16383) >> 14);
									anIntArray9047[i_1352_] = (anIntArray9046[i_1352_] * i_1356_ + anIntArray9047[i_1352_] * i_1357_ + 16383) >> 14;
									anIntArray9046[i_1352_] = i_1358_;
								}
								if (i_1281_ != 0) {
									int i_1359_ = Class428.anIntArray4825[i_1281_];
									int i_1360_ = Class428.anIntArray4819[i_1281_];
									int i_1361_ = ((anIntArray9047[i_1352_] * i_1359_ + anIntArray9053[i_1352_] * i_1360_ + 16383) >> 14);
									anIntArray9047[i_1352_] = (anIntArray9047[i_1352_] * i_1360_ - anIntArray9053[i_1352_] * i_1359_ + 16383) >> 14;
									anIntArray9053[i_1352_] = i_1361_;
								}
								anIntArray9053[i_1352_] += anInt9101;
								anIntArray9046[i_1352_] += anInt9102;
								anIntArray9047[i_1352_] += anInt9103;
							}
						}
					}
				}
				if (bool) {
					for (int i_1362_ = 0; i_1362_ < i_1285_; i_1362_++) {
						int i_1363_ = is[i_1362_];
						if (i_1363_ < anIntArrayArray9048.length) {
							int[] is_1364_ = anIntArrayArray9048[i_1363_];
							for (int i_1365_ = 0; i_1365_ < is_1364_.length; i_1365_++) {
								int i_1366_ = is_1364_[i_1365_];
								if (aShortArray9049 == null || ((i_1283_ & aShortArray9049[i_1366_]) != 0)) {
									int i_1367_ = anIntArray9088[i_1366_];
									int i_1368_ = anIntArray9088[i_1366_ + 1];
									for (int i_1369_ = i_1367_; (i_1369_ < i_1368_ && aShortArray9089[i_1369_] != 0); i_1369_++) {
										int i_1370_ = (aShortArray9089[i_1369_] & 0xffff) - 1;
										if (i_1282_ != 0) {
											int i_1371_ = (Class428.anIntArray4825[i_1282_]);
											int i_1372_ = (Class428.anIntArray4819[i_1282_]);
											int i_1373_ = (((aShortArray9052[i_1370_] * i_1371_) + (aShortArray9092[i_1370_] * i_1372_) + 16383) >> 14);
											aShortArray9052[i_1370_] = (short) ((((aShortArray9052[i_1370_]) * i_1372_) - ((aShortArray9092[i_1370_]) * i_1371_) + 16383) >> 14);
											aShortArray9092[i_1370_] = (short) i_1373_;
										}
										if (i_1280_ != 0) {
											int i_1374_ = (Class428.anIntArray4825[i_1280_]);
											int i_1375_ = (Class428.anIntArray4819[i_1280_]);
											int i_1376_ = (((aShortArray9052[i_1370_] * i_1375_) - (aShortArray9029[i_1370_] * i_1374_) + 16383) >> 14);
											aShortArray9029[i_1370_] = (short) ((((aShortArray9052[i_1370_]) * i_1374_) + ((aShortArray9029[i_1370_]) * i_1375_) + 16383) >> 14);
											aShortArray9052[i_1370_] = (short) i_1376_;
										}
										if (i_1281_ != 0) {
											int i_1377_ = (Class428.anIntArray4825[i_1281_]);
											int i_1378_ = (Class428.anIntArray4819[i_1281_]);
											int i_1379_ = (((aShortArray9029[i_1370_] * i_1377_) + (aShortArray9092[i_1370_] * i_1378_) + 16383) >> 14);
											aShortArray9029[i_1370_] = (short) ((((aShortArray9029[i_1370_]) * i_1378_) - ((aShortArray9092[i_1370_]) * i_1377_) + 16383) >> 14);
											aShortArray9092[i_1370_] = (short) i_1379_;
										}
									}
								}
							}
						}
					}
					if (aClass129_9070 == null && aClass129_9069 != null)
						aClass129_9069.anInterface15_1547 = null;
					if (aClass129_9070 != null)
						aClass129_9070.anInterface15_1547 = null;
				}
			}
		} else if (i == 3) {
			if (is_1284_ != null) {
				int i_1380_ = is_1284_[9] << 4;
				int i_1381_ = is_1284_[10] << 4;
				int i_1382_ = is_1284_[11] << 4;
				int i_1383_ = is_1284_[12] << 4;
				int i_1384_ = is_1284_[13] << 4;
				int i_1385_ = is_1284_[14] << 4;
				if (aBool9104) {
					int i_1386_ = ((is_1284_[0] * anInt9101 + is_1284_[3] * anInt9102 + is_1284_[6] * anInt9103 + 8192) >> 14);
					int i_1387_ = ((is_1284_[1] * anInt9101 + is_1284_[4] * anInt9102 + is_1284_[7] * anInt9103 + 8192) >> 14);
					int i_1388_ = ((is_1284_[2] * anInt9101 + is_1284_[5] * anInt9102 + is_1284_[8] * anInt9103 + 8192) >> 14);
					i_1386_ += i_1383_;
					i_1387_ += i_1384_;
					i_1388_ += i_1385_;
					anInt9101 = i_1386_;
					anInt9102 = i_1387_;
					anInt9103 = i_1388_;
					aBool9104 = false;
				}
				int i_1389_ = i_1280_ << 15 >> 7;
				int i_1390_ = i_1281_ << 15 >> 7;
				int i_1391_ = i_1282_ << 15 >> 7;
				int i_1392_ = i_1389_ * -anInt9101 + 8192 >> 14;
				int i_1393_ = i_1390_ * -anInt9102 + 8192 >> 14;
				int i_1394_ = i_1391_ * -anInt9103 + 8192 >> 14;
				int i_1395_ = i_1392_ + anInt9101;
				int i_1396_ = i_1393_ + anInt9102;
				int i_1397_ = i_1394_ + anInt9103;
				int[] is_1398_ = new int[9];
				is_1398_[0] = i_1389_ * is_1284_[0] + 8192 >> 14;
				is_1398_[1] = i_1389_ * is_1284_[3] + 8192 >> 14;
				is_1398_[2] = i_1389_ * is_1284_[6] + 8192 >> 14;
				is_1398_[3] = i_1390_ * is_1284_[1] + 8192 >> 14;
				is_1398_[4] = i_1390_ * is_1284_[4] + 8192 >> 14;
				is_1398_[5] = i_1390_ * is_1284_[7] + 8192 >> 14;
				is_1398_[6] = i_1391_ * is_1284_[2] + 8192 >> 14;
				is_1398_[7] = i_1391_ * is_1284_[5] + 8192 >> 14;
				is_1398_[8] = i_1391_ * is_1284_[8] + 8192 >> 14;
				int i_1399_ = i_1389_ * i_1383_ + 8192 >> 14;
				int i_1400_ = i_1390_ * i_1384_ + 8192 >> 14;
				int i_1401_ = i_1391_ * i_1385_ + 8192 >> 14;
				i_1399_ += i_1395_;
				i_1400_ += i_1396_;
				i_1401_ += i_1397_;
				int[] is_1402_ = new int[9];
				for (int i_1403_ = 0; i_1403_ < 3; i_1403_++) {
					for (int i_1404_ = 0; i_1404_ < 3; i_1404_++) {
						int i_1405_ = 0;
						for (int i_1406_ = 0; i_1406_ < 3; i_1406_++)
							i_1405_ += (is_1284_[i_1403_ * 3 + i_1406_] * is_1398_[i_1404_ + i_1406_ * 3]);
						is_1402_[i_1403_ * 3 + i_1404_] = i_1405_ + 8192 >> 14;
					}
				}
				int i_1407_ = ((is_1284_[0] * i_1399_ + is_1284_[1] * i_1400_ + is_1284_[2] * i_1401_ + 8192) >> 14);
				int i_1408_ = ((is_1284_[3] * i_1399_ + is_1284_[4] * i_1400_ + is_1284_[5] * i_1401_ + 8192) >> 14);
				int i_1409_ = ((is_1284_[6] * i_1399_ + is_1284_[7] * i_1400_ + is_1284_[8] * i_1401_ + 8192) >> 14);
				i_1407_ += i_1380_;
				i_1408_ += i_1381_;
				i_1409_ += i_1382_;
				for (int i_1410_ = 0; i_1410_ < i_1285_; i_1410_++) {
					int i_1411_ = is[i_1410_];
					if (i_1411_ < anIntArrayArray9048.length) {
						int[] is_1412_ = anIntArrayArray9048[i_1411_];
						for (int i_1413_ = 0; i_1413_ < is_1412_.length; i_1413_++) {
							int i_1414_ = is_1412_[i_1413_];
							if (aShortArray9049 == null || (i_1283_ & aShortArray9049[i_1414_]) != 0) {
								int i_1415_ = ((is_1402_[0] * anIntArray9053[i_1414_] + is_1402_[1] * anIntArray9046[i_1414_] + is_1402_[2] * anIntArray9047[i_1414_] + 8192) >> 14);
								int i_1416_ = ((is_1402_[3] * anIntArray9053[i_1414_] + is_1402_[4] * anIntArray9046[i_1414_] + is_1402_[5] * anIntArray9047[i_1414_] + 8192) >> 14);
								int i_1417_ = ((is_1402_[6] * anIntArray9053[i_1414_] + is_1402_[7] * anIntArray9046[i_1414_] + is_1402_[8] * anIntArray9047[i_1414_] + 8192) >> 14);
								i_1415_ += i_1407_;
								i_1416_ += i_1408_;
								i_1417_ += i_1409_;
								anIntArray9053[i_1414_] = i_1415_;
								anIntArray9046[i_1414_] = i_1416_;
								anIntArray9047[i_1414_] = i_1417_;
							}
						}
					}
				}
			} else {
				for (int i_1418_ = 0; i_1418_ < i_1285_; i_1418_++) {
					int i_1419_ = is[i_1418_];
					if (i_1419_ < anIntArrayArray9048.length) {
						int[] is_1420_ = anIntArrayArray9048[i_1419_];
						for (int i_1421_ = 0; i_1421_ < is_1420_.length; i_1421_++) {
							int i_1422_ = is_1420_[i_1421_];
							if (aShortArray9049 == null || (i_1283_ & aShortArray9049[i_1422_]) != 0) {
								anIntArray9053[i_1422_] -= anInt9101;
								anIntArray9046[i_1422_] -= anInt9102;
								anIntArray9047[i_1422_] -= anInt9103;
								anIntArray9053[i_1422_] = anIntArray9053[i_1422_] * i_1280_ >> 7;
								anIntArray9046[i_1422_] = anIntArray9046[i_1422_] * i_1281_ >> 7;
								anIntArray9047[i_1422_] = anIntArray9047[i_1422_] * i_1282_ >> 7;
								anIntArray9053[i_1422_] += anInt9101;
								anIntArray9046[i_1422_] += anInt9102;
								anIntArray9047[i_1422_] += anInt9103;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9042 != null) {
				for (int i_1423_ = 0; i_1423_ < i_1285_; i_1423_++) {
					int i_1424_ = is[i_1423_];
					if (i_1424_ < anIntArrayArray9042.length) {
						int[] is_1425_ = anIntArrayArray9042[i_1424_];
						for (int i_1426_ = 0; i_1426_ < is_1425_.length; i_1426_++) {
							int i_1427_ = is_1425_[i_1426_];
							if (aShortArray9067 == null || (i_1283_ & aShortArray9067[i_1427_]) != 0) {
								int i_1428_ = ((aByteArray9061[i_1427_] & 0xff) + i_1280_ * 8);
								if (i_1428_ < 0)
									i_1428_ = 0;
								else if (i_1428_ > 255)
									i_1428_ = 255;
								aByteArray9061[i_1427_] = (byte) i_1428_;
								if (aClass129_9069 != null)
									aClass129_9069.anInterface15_1547 = null;
							}
						}
					}
				}
				if (aClass150Array9093 != null) {
					for (int i_1429_ = 0; i_1429_ < anInt9075; i_1429_++) {
						Class150 class150 = aClass150Array9093[i_1429_];
						Class130 class130 = aClass130Array9094[i_1429_];
						class130.anInt1553 = (class130.anInt1553 & 0xffffff | 255 - (aByteArray9061[class150.anInt1682] & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9042 != null) {
				for (int i_1430_ = 0; i_1430_ < i_1285_; i_1430_++) {
					int i_1431_ = is[i_1430_];
					if (i_1431_ < anIntArrayArray9042.length) {
						int[] is_1432_ = anIntArrayArray9042[i_1431_];
						for (int i_1433_ = 0; i_1433_ < is_1432_.length; i_1433_++) {
							int i_1434_ = is_1432_[i_1433_];
							if (aShortArray9067 == null || (i_1283_ & aShortArray9067[i_1434_]) != 0) {
								int i_1435_ = aShortArray9060[i_1434_] & 0xffff;
								int i_1436_ = i_1435_ >> 10 & 0x3f;
								int i_1437_ = i_1435_ >> 7 & 0x7;
								int i_1438_ = i_1435_ & 0x7f;
								i_1436_ = i_1436_ + i_1280_ & 0x3f;
								i_1437_ += i_1281_ / 4;
								if (i_1437_ < 0)
									i_1437_ = 0;
								else if (i_1437_ > 7)
									i_1437_ = 7;
								i_1438_ += i_1282_;
								if (i_1438_ < 0)
									i_1438_ = 0;
								else if (i_1438_ > 127)
									i_1438_ = 127;
								aShortArray9060[i_1434_] = (short) (i_1436_ << 10 | i_1437_ << 7 | i_1438_);
								if (aClass129_9069 != null)
									aClass129_9069.anInterface15_1547 = null;
							}
						}
					}
				}
				if (aClass150Array9093 != null) {
					for (int i_1439_ = 0; i_1439_ < anInt9075; i_1439_++) {
						Class150 class150 = aClass150Array9093[i_1439_];
						Class130 class130 = aClass130Array9094[i_1439_];
						class130.anInt1553 = (class130.anInt1553 & ~0xffffff | (Class656.anIntArray8390[(aShortArray9060[class150.anInt1682] & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9028 != null) {
				for (int i_1440_ = 0; i_1440_ < i_1285_; i_1440_++) {
					int i_1441_ = is[i_1440_];
					if (i_1441_ < anIntArrayArray9028.length) {
						int[] is_1442_ = anIntArrayArray9028[i_1441_];
						for (int i_1443_ = 0; i_1443_ < is_1442_.length; i_1443_++) {
							Class130 class130 = aClass130Array9094[is_1442_[i_1443_]];
							class130.anInt1548 += i_1280_;
							class130.anInt1552 += i_1281_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9028 != null) {
				for (int i_1444_ = 0; i_1444_ < i_1285_; i_1444_++) {
					int i_1445_ = is[i_1444_];
					if (i_1445_ < anIntArrayArray9028.length) {
						int[] is_1446_ = anIntArrayArray9028[i_1445_];
						for (int i_1447_ = 0; i_1447_ < is_1446_.length; i_1447_++) {
							Class130 class130 = aClass130Array9094[is_1446_[i_1447_]];
							class130.anInt1549 = class130.anInt1549 * i_1280_ >> 7;
							class130.anInt1551 = class130.anInt1551 * i_1281_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9028 != null) {
				for (int i_1448_ = 0; i_1448_ < i_1285_; i_1448_++) {
					int i_1449_ = is[i_1448_];
					if (i_1449_ < anIntArrayArray9028.length) {
						int[] is_1450_ = anIntArrayArray9028[i_1449_];
						for (int i_1451_ = 0; i_1451_ < is_1450_.length; i_1451_++) {
							Class130 class130 = aClass130Array9094[is_1450_[i_1451_]];
							class130.anInt1550 = class130.anInt1550 + i_1280_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	void method2956(int i, int[] is, int i_1452_, int i_1453_, int i_1454_, boolean bool, int i_1455_, int[] is_1456_) {
		int i_1457_ = is.length;
		if (i == 0) {
			i_1452_ <<= 4;
			i_1453_ <<= 4;
			i_1454_ <<= 4;
			int i_1458_ = 0;
			anInt9101 = 0;
			anInt9102 = 0;
			anInt9103 = 0;
			for (int i_1459_ = 0; i_1459_ < i_1457_; i_1459_++) {
				int i_1460_ = is[i_1459_];
				if (i_1460_ < anIntArrayArray9048.length) {
					int[] is_1461_ = anIntArrayArray9048[i_1460_];
					for (int i_1462_ = 0; i_1462_ < is_1461_.length; i_1462_++) {
						int i_1463_ = is_1461_[i_1462_];
						if (aShortArray9049 == null || (i_1455_ & aShortArray9049[i_1463_]) != 0) {
							anInt9101 += anIntArray9053[i_1463_];
							anInt9102 += anIntArray9046[i_1463_];
							anInt9103 += anIntArray9047[i_1463_];
							i_1458_++;
						}
					}
				}
			}
			if (i_1458_ > 0) {
				anInt9101 = anInt9101 / i_1458_ + i_1452_;
				anInt9102 = anInt9102 / i_1458_ + i_1453_;
				anInt9103 = anInt9103 / i_1458_ + i_1454_;
				aBool9104 = true;
			} else {
				anInt9101 = i_1452_;
				anInt9102 = i_1453_;
				anInt9103 = i_1454_;
			}
		} else if (i == 1) {
			if (is_1456_ != null) {
				int i_1464_ = ((is_1456_[0] * i_1452_ + is_1456_[1] * i_1453_ + is_1456_[2] * i_1454_ + 8192) >> 14);
				int i_1465_ = ((is_1456_[3] * i_1452_ + is_1456_[4] * i_1453_ + is_1456_[5] * i_1454_ + 8192) >> 14);
				int i_1466_ = ((is_1456_[6] * i_1452_ + is_1456_[7] * i_1453_ + is_1456_[8] * i_1454_ + 8192) >> 14);
				i_1452_ = i_1464_;
				i_1453_ = i_1465_;
				i_1454_ = i_1466_;
			}
			i_1452_ <<= 4;
			i_1453_ <<= 4;
			i_1454_ <<= 4;
			for (int i_1467_ = 0; i_1467_ < i_1457_; i_1467_++) {
				int i_1468_ = is[i_1467_];
				if (i_1468_ < anIntArrayArray9048.length) {
					int[] is_1469_ = anIntArrayArray9048[i_1468_];
					for (int i_1470_ = 0; i_1470_ < is_1469_.length; i_1470_++) {
						int i_1471_ = is_1469_[i_1470_];
						if (aShortArray9049 == null || (i_1455_ & aShortArray9049[i_1471_]) != 0) {
							anIntArray9053[i_1471_] += i_1452_;
							anIntArray9046[i_1471_] += i_1453_;
							anIntArray9047[i_1471_] += i_1454_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1456_ != null) {
				int i_1472_ = is_1456_[9] << 4;
				int i_1473_ = is_1456_[10] << 4;
				int i_1474_ = is_1456_[11] << 4;
				int i_1475_ = is_1456_[12] << 4;
				int i_1476_ = is_1456_[13] << 4;
				int i_1477_ = is_1456_[14] << 4;
				if (aBool9104) {
					int i_1478_ = ((is_1456_[0] * anInt9101 + is_1456_[3] * anInt9102 + is_1456_[6] * anInt9103 + 8192) >> 14);
					int i_1479_ = ((is_1456_[1] * anInt9101 + is_1456_[4] * anInt9102 + is_1456_[7] * anInt9103 + 8192) >> 14);
					int i_1480_ = ((is_1456_[2] * anInt9101 + is_1456_[5] * anInt9102 + is_1456_[8] * anInt9103 + 8192) >> 14);
					i_1478_ += i_1475_;
					i_1479_ += i_1476_;
					i_1480_ += i_1477_;
					anInt9101 = i_1478_;
					anInt9102 = i_1479_;
					anInt9103 = i_1480_;
					aBool9104 = false;
				}
				int[] is_1481_ = new int[9];
				int i_1482_ = Class428.anIntArray4819[i_1452_];
				int i_1483_ = Class428.anIntArray4825[i_1452_];
				int i_1484_ = Class428.anIntArray4819[i_1453_];
				int i_1485_ = Class428.anIntArray4825[i_1453_];
				int i_1486_ = Class428.anIntArray4819[i_1454_];
				int i_1487_ = Class428.anIntArray4825[i_1454_];
				int i_1488_ = i_1483_ * i_1486_ + 8192 >> 14;
				int i_1489_ = i_1483_ * i_1487_ + 8192 >> 14;
				is_1481_[0] = i_1484_ * i_1486_ + i_1485_ * i_1489_ + 8192 >> 14;
				is_1481_[1] = -i_1484_ * i_1487_ + i_1485_ * i_1488_ + 8192 >> 14;
				is_1481_[2] = i_1485_ * i_1482_ + 8192 >> 14;
				is_1481_[3] = i_1482_ * i_1487_ + 8192 >> 14;
				is_1481_[4] = i_1482_ * i_1486_ + 8192 >> 14;
				is_1481_[5] = -i_1483_;
				is_1481_[6] = -i_1485_ * i_1486_ + i_1484_ * i_1489_ + 8192 >> 14;
				is_1481_[7] = i_1485_ * i_1487_ + i_1484_ * i_1488_ + 8192 >> 14;
				is_1481_[8] = i_1484_ * i_1482_ + 8192 >> 14;
				int i_1490_ = ((is_1481_[0] * -anInt9101 + is_1481_[1] * -anInt9102 + is_1481_[2] * -anInt9103 + 8192) >> 14);
				int i_1491_ = ((is_1481_[3] * -anInt9101 + is_1481_[4] * -anInt9102 + is_1481_[5] * -anInt9103 + 8192) >> 14);
				int i_1492_ = ((is_1481_[6] * -anInt9101 + is_1481_[7] * -anInt9102 + is_1481_[8] * -anInt9103 + 8192) >> 14);
				int i_1493_ = i_1490_ + anInt9101;
				int i_1494_ = i_1491_ + anInt9102;
				int i_1495_ = i_1492_ + anInt9103;
				int[] is_1496_ = new int[9];
				for (int i_1497_ = 0; i_1497_ < 3; i_1497_++) {
					for (int i_1498_ = 0; i_1498_ < 3; i_1498_++) {
						int i_1499_ = 0;
						for (int i_1500_ = 0; i_1500_ < 3; i_1500_++)
							i_1499_ += (is_1481_[i_1497_ * 3 + i_1500_] * is_1456_[i_1498_ * 3 + i_1500_]);
						is_1496_[i_1497_ * 3 + i_1498_] = i_1499_ + 8192 >> 14;
					}
				}
				int i_1501_ = ((is_1481_[0] * i_1475_ + is_1481_[1] * i_1476_ + is_1481_[2] * i_1477_ + 8192) >> 14);
				int i_1502_ = ((is_1481_[3] * i_1475_ + is_1481_[4] * i_1476_ + is_1481_[5] * i_1477_ + 8192) >> 14);
				int i_1503_ = ((is_1481_[6] * i_1475_ + is_1481_[7] * i_1476_ + is_1481_[8] * i_1477_ + 8192) >> 14);
				i_1501_ += i_1493_;
				i_1502_ += i_1494_;
				i_1503_ += i_1495_;
				int[] is_1504_ = new int[9];
				for (int i_1505_ = 0; i_1505_ < 3; i_1505_++) {
					for (int i_1506_ = 0; i_1506_ < 3; i_1506_++) {
						int i_1507_ = 0;
						for (int i_1508_ = 0; i_1508_ < 3; i_1508_++)
							i_1507_ += (is_1456_[i_1505_ * 3 + i_1508_] * is_1496_[i_1506_ + i_1508_ * 3]);
						is_1504_[i_1505_ * 3 + i_1506_] = i_1507_ + 8192 >> 14;
					}
				}
				int i_1509_ = ((is_1456_[0] * i_1501_ + is_1456_[1] * i_1502_ + is_1456_[2] * i_1503_ + 8192) >> 14);
				int i_1510_ = ((is_1456_[3] * i_1501_ + is_1456_[4] * i_1502_ + is_1456_[5] * i_1503_ + 8192) >> 14);
				int i_1511_ = ((is_1456_[6] * i_1501_ + is_1456_[7] * i_1502_ + is_1456_[8] * i_1503_ + 8192) >> 14);
				i_1509_ += i_1472_;
				i_1510_ += i_1473_;
				i_1511_ += i_1474_;
				for (int i_1512_ = 0; i_1512_ < i_1457_; i_1512_++) {
					int i_1513_ = is[i_1512_];
					if (i_1513_ < anIntArrayArray9048.length) {
						int[] is_1514_ = anIntArrayArray9048[i_1513_];
						for (int i_1515_ = 0; i_1515_ < is_1514_.length; i_1515_++) {
							int i_1516_ = is_1514_[i_1515_];
							if (aShortArray9049 == null || (i_1455_ & aShortArray9049[i_1516_]) != 0) {
								int i_1517_ = ((is_1504_[0] * anIntArray9053[i_1516_] + is_1504_[1] * anIntArray9046[i_1516_] + is_1504_[2] * anIntArray9047[i_1516_] + 8192) >> 14);
								int i_1518_ = ((is_1504_[3] * anIntArray9053[i_1516_] + is_1504_[4] * anIntArray9046[i_1516_] + is_1504_[5] * anIntArray9047[i_1516_] + 8192) >> 14);
								int i_1519_ = ((is_1504_[6] * anIntArray9053[i_1516_] + is_1504_[7] * anIntArray9046[i_1516_] + is_1504_[8] * anIntArray9047[i_1516_] + 8192) >> 14);
								i_1517_ += i_1509_;
								i_1518_ += i_1510_;
								i_1519_ += i_1511_;
								anIntArray9053[i_1516_] = i_1517_;
								anIntArray9046[i_1516_] = i_1518_;
								anIntArray9047[i_1516_] = i_1519_;
							}
						}
					}
				}
			} else {
				for (int i_1520_ = 0; i_1520_ < i_1457_; i_1520_++) {
					int i_1521_ = is[i_1520_];
					if (i_1521_ < anIntArrayArray9048.length) {
						int[] is_1522_ = anIntArrayArray9048[i_1521_];
						for (int i_1523_ = 0; i_1523_ < is_1522_.length; i_1523_++) {
							int i_1524_ = is_1522_[i_1523_];
							if (aShortArray9049 == null || (i_1455_ & aShortArray9049[i_1524_]) != 0) {
								anIntArray9053[i_1524_] -= anInt9101;
								anIntArray9046[i_1524_] -= anInt9102;
								anIntArray9047[i_1524_] -= anInt9103;
								if (i_1454_ != 0) {
									int i_1525_ = Class428.anIntArray4825[i_1454_];
									int i_1526_ = Class428.anIntArray4819[i_1454_];
									int i_1527_ = ((anIntArray9046[i_1524_] * i_1525_ + anIntArray9053[i_1524_] * i_1526_ + 16383) >> 14);
									anIntArray9046[i_1524_] = (anIntArray9046[i_1524_] * i_1526_ - anIntArray9053[i_1524_] * i_1525_ + 16383) >> 14;
									anIntArray9053[i_1524_] = i_1527_;
								}
								if (i_1452_ != 0) {
									int i_1528_ = Class428.anIntArray4825[i_1452_];
									int i_1529_ = Class428.anIntArray4819[i_1452_];
									int i_1530_ = ((anIntArray9046[i_1524_] * i_1529_ - anIntArray9047[i_1524_] * i_1528_ + 16383) >> 14);
									anIntArray9047[i_1524_] = (anIntArray9046[i_1524_] * i_1528_ + anIntArray9047[i_1524_] * i_1529_ + 16383) >> 14;
									anIntArray9046[i_1524_] = i_1530_;
								}
								if (i_1453_ != 0) {
									int i_1531_ = Class428.anIntArray4825[i_1453_];
									int i_1532_ = Class428.anIntArray4819[i_1453_];
									int i_1533_ = ((anIntArray9047[i_1524_] * i_1531_ + anIntArray9053[i_1524_] * i_1532_ + 16383) >> 14);
									anIntArray9047[i_1524_] = (anIntArray9047[i_1524_] * i_1532_ - anIntArray9053[i_1524_] * i_1531_ + 16383) >> 14;
									anIntArray9053[i_1524_] = i_1533_;
								}
								anIntArray9053[i_1524_] += anInt9101;
								anIntArray9046[i_1524_] += anInt9102;
								anIntArray9047[i_1524_] += anInt9103;
							}
						}
					}
				}
				if (bool) {
					for (int i_1534_ = 0; i_1534_ < i_1457_; i_1534_++) {
						int i_1535_ = is[i_1534_];
						if (i_1535_ < anIntArrayArray9048.length) {
							int[] is_1536_ = anIntArrayArray9048[i_1535_];
							for (int i_1537_ = 0; i_1537_ < is_1536_.length; i_1537_++) {
								int i_1538_ = is_1536_[i_1537_];
								if (aShortArray9049 == null || ((i_1455_ & aShortArray9049[i_1538_]) != 0)) {
									int i_1539_ = anIntArray9088[i_1538_];
									int i_1540_ = anIntArray9088[i_1538_ + 1];
									for (int i_1541_ = i_1539_; (i_1541_ < i_1540_ && aShortArray9089[i_1541_] != 0); i_1541_++) {
										int i_1542_ = (aShortArray9089[i_1541_] & 0xffff) - 1;
										if (i_1454_ != 0) {
											int i_1543_ = (Class428.anIntArray4825[i_1454_]);
											int i_1544_ = (Class428.anIntArray4819[i_1454_]);
											int i_1545_ = (((aShortArray9052[i_1542_] * i_1543_) + (aShortArray9092[i_1542_] * i_1544_) + 16383) >> 14);
											aShortArray9052[i_1542_] = (short) ((((aShortArray9052[i_1542_]) * i_1544_) - ((aShortArray9092[i_1542_]) * i_1543_) + 16383) >> 14);
											aShortArray9092[i_1542_] = (short) i_1545_;
										}
										if (i_1452_ != 0) {
											int i_1546_ = (Class428.anIntArray4825[i_1452_]);
											int i_1547_ = (Class428.anIntArray4819[i_1452_]);
											int i_1548_ = (((aShortArray9052[i_1542_] * i_1547_) - (aShortArray9029[i_1542_] * i_1546_) + 16383) >> 14);
											aShortArray9029[i_1542_] = (short) ((((aShortArray9052[i_1542_]) * i_1546_) + ((aShortArray9029[i_1542_]) * i_1547_) + 16383) >> 14);
											aShortArray9052[i_1542_] = (short) i_1548_;
										}
										if (i_1453_ != 0) {
											int i_1549_ = (Class428.anIntArray4825[i_1453_]);
											int i_1550_ = (Class428.anIntArray4819[i_1453_]);
											int i_1551_ = (((aShortArray9029[i_1542_] * i_1549_) + (aShortArray9092[i_1542_] * i_1550_) + 16383) >> 14);
											aShortArray9029[i_1542_] = (short) ((((aShortArray9029[i_1542_]) * i_1550_) - ((aShortArray9092[i_1542_]) * i_1549_) + 16383) >> 14);
											aShortArray9092[i_1542_] = (short) i_1551_;
										}
									}
								}
							}
						}
					}
					if (aClass129_9070 == null && aClass129_9069 != null)
						aClass129_9069.anInterface15_1547 = null;
					if (aClass129_9070 != null)
						aClass129_9070.anInterface15_1547 = null;
				}
			}
		} else if (i == 3) {
			if (is_1456_ != null) {
				int i_1552_ = is_1456_[9] << 4;
				int i_1553_ = is_1456_[10] << 4;
				int i_1554_ = is_1456_[11] << 4;
				int i_1555_ = is_1456_[12] << 4;
				int i_1556_ = is_1456_[13] << 4;
				int i_1557_ = is_1456_[14] << 4;
				if (aBool9104) {
					int i_1558_ = ((is_1456_[0] * anInt9101 + is_1456_[3] * anInt9102 + is_1456_[6] * anInt9103 + 8192) >> 14);
					int i_1559_ = ((is_1456_[1] * anInt9101 + is_1456_[4] * anInt9102 + is_1456_[7] * anInt9103 + 8192) >> 14);
					int i_1560_ = ((is_1456_[2] * anInt9101 + is_1456_[5] * anInt9102 + is_1456_[8] * anInt9103 + 8192) >> 14);
					i_1558_ += i_1555_;
					i_1559_ += i_1556_;
					i_1560_ += i_1557_;
					anInt9101 = i_1558_;
					anInt9102 = i_1559_;
					anInt9103 = i_1560_;
					aBool9104 = false;
				}
				int i_1561_ = i_1452_ << 15 >> 7;
				int i_1562_ = i_1453_ << 15 >> 7;
				int i_1563_ = i_1454_ << 15 >> 7;
				int i_1564_ = i_1561_ * -anInt9101 + 8192 >> 14;
				int i_1565_ = i_1562_ * -anInt9102 + 8192 >> 14;
				int i_1566_ = i_1563_ * -anInt9103 + 8192 >> 14;
				int i_1567_ = i_1564_ + anInt9101;
				int i_1568_ = i_1565_ + anInt9102;
				int i_1569_ = i_1566_ + anInt9103;
				int[] is_1570_ = new int[9];
				is_1570_[0] = i_1561_ * is_1456_[0] + 8192 >> 14;
				is_1570_[1] = i_1561_ * is_1456_[3] + 8192 >> 14;
				is_1570_[2] = i_1561_ * is_1456_[6] + 8192 >> 14;
				is_1570_[3] = i_1562_ * is_1456_[1] + 8192 >> 14;
				is_1570_[4] = i_1562_ * is_1456_[4] + 8192 >> 14;
				is_1570_[5] = i_1562_ * is_1456_[7] + 8192 >> 14;
				is_1570_[6] = i_1563_ * is_1456_[2] + 8192 >> 14;
				is_1570_[7] = i_1563_ * is_1456_[5] + 8192 >> 14;
				is_1570_[8] = i_1563_ * is_1456_[8] + 8192 >> 14;
				int i_1571_ = i_1561_ * i_1555_ + 8192 >> 14;
				int i_1572_ = i_1562_ * i_1556_ + 8192 >> 14;
				int i_1573_ = i_1563_ * i_1557_ + 8192 >> 14;
				i_1571_ += i_1567_;
				i_1572_ += i_1568_;
				i_1573_ += i_1569_;
				int[] is_1574_ = new int[9];
				for (int i_1575_ = 0; i_1575_ < 3; i_1575_++) {
					for (int i_1576_ = 0; i_1576_ < 3; i_1576_++) {
						int i_1577_ = 0;
						for (int i_1578_ = 0; i_1578_ < 3; i_1578_++)
							i_1577_ += (is_1456_[i_1575_ * 3 + i_1578_] * is_1570_[i_1576_ + i_1578_ * 3]);
						is_1574_[i_1575_ * 3 + i_1576_] = i_1577_ + 8192 >> 14;
					}
				}
				int i_1579_ = ((is_1456_[0] * i_1571_ + is_1456_[1] * i_1572_ + is_1456_[2] * i_1573_ + 8192) >> 14);
				int i_1580_ = ((is_1456_[3] * i_1571_ + is_1456_[4] * i_1572_ + is_1456_[5] * i_1573_ + 8192) >> 14);
				int i_1581_ = ((is_1456_[6] * i_1571_ + is_1456_[7] * i_1572_ + is_1456_[8] * i_1573_ + 8192) >> 14);
				i_1579_ += i_1552_;
				i_1580_ += i_1553_;
				i_1581_ += i_1554_;
				for (int i_1582_ = 0; i_1582_ < i_1457_; i_1582_++) {
					int i_1583_ = is[i_1582_];
					if (i_1583_ < anIntArrayArray9048.length) {
						int[] is_1584_ = anIntArrayArray9048[i_1583_];
						for (int i_1585_ = 0; i_1585_ < is_1584_.length; i_1585_++) {
							int i_1586_ = is_1584_[i_1585_];
							if (aShortArray9049 == null || (i_1455_ & aShortArray9049[i_1586_]) != 0) {
								int i_1587_ = ((is_1574_[0] * anIntArray9053[i_1586_] + is_1574_[1] * anIntArray9046[i_1586_] + is_1574_[2] * anIntArray9047[i_1586_] + 8192) >> 14);
								int i_1588_ = ((is_1574_[3] * anIntArray9053[i_1586_] + is_1574_[4] * anIntArray9046[i_1586_] + is_1574_[5] * anIntArray9047[i_1586_] + 8192) >> 14);
								int i_1589_ = ((is_1574_[6] * anIntArray9053[i_1586_] + is_1574_[7] * anIntArray9046[i_1586_] + is_1574_[8] * anIntArray9047[i_1586_] + 8192) >> 14);
								i_1587_ += i_1579_;
								i_1588_ += i_1580_;
								i_1589_ += i_1581_;
								anIntArray9053[i_1586_] = i_1587_;
								anIntArray9046[i_1586_] = i_1588_;
								anIntArray9047[i_1586_] = i_1589_;
							}
						}
					}
				}
			} else {
				for (int i_1590_ = 0; i_1590_ < i_1457_; i_1590_++) {
					int i_1591_ = is[i_1590_];
					if (i_1591_ < anIntArrayArray9048.length) {
						int[] is_1592_ = anIntArrayArray9048[i_1591_];
						for (int i_1593_ = 0; i_1593_ < is_1592_.length; i_1593_++) {
							int i_1594_ = is_1592_[i_1593_];
							if (aShortArray9049 == null || (i_1455_ & aShortArray9049[i_1594_]) != 0) {
								anIntArray9053[i_1594_] -= anInt9101;
								anIntArray9046[i_1594_] -= anInt9102;
								anIntArray9047[i_1594_] -= anInt9103;
								anIntArray9053[i_1594_] = anIntArray9053[i_1594_] * i_1452_ >> 7;
								anIntArray9046[i_1594_] = anIntArray9046[i_1594_] * i_1453_ >> 7;
								anIntArray9047[i_1594_] = anIntArray9047[i_1594_] * i_1454_ >> 7;
								anIntArray9053[i_1594_] += anInt9101;
								anIntArray9046[i_1594_] += anInt9102;
								anIntArray9047[i_1594_] += anInt9103;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9042 != null) {
				for (int i_1595_ = 0; i_1595_ < i_1457_; i_1595_++) {
					int i_1596_ = is[i_1595_];
					if (i_1596_ < anIntArrayArray9042.length) {
						int[] is_1597_ = anIntArrayArray9042[i_1596_];
						for (int i_1598_ = 0; i_1598_ < is_1597_.length; i_1598_++) {
							int i_1599_ = is_1597_[i_1598_];
							if (aShortArray9067 == null || (i_1455_ & aShortArray9067[i_1599_]) != 0) {
								int i_1600_ = ((aByteArray9061[i_1599_] & 0xff) + i_1452_ * 8);
								if (i_1600_ < 0)
									i_1600_ = 0;
								else if (i_1600_ > 255)
									i_1600_ = 255;
								aByteArray9061[i_1599_] = (byte) i_1600_;
								if (aClass129_9069 != null)
									aClass129_9069.anInterface15_1547 = null;
							}
						}
					}
				}
				if (aClass150Array9093 != null) {
					for (int i_1601_ = 0; i_1601_ < anInt9075; i_1601_++) {
						Class150 class150 = aClass150Array9093[i_1601_];
						Class130 class130 = aClass130Array9094[i_1601_];
						class130.anInt1553 = (class130.anInt1553 & 0xffffff | 255 - (aByteArray9061[class150.anInt1682] & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9042 != null) {
				for (int i_1602_ = 0; i_1602_ < i_1457_; i_1602_++) {
					int i_1603_ = is[i_1602_];
					if (i_1603_ < anIntArrayArray9042.length) {
						int[] is_1604_ = anIntArrayArray9042[i_1603_];
						for (int i_1605_ = 0; i_1605_ < is_1604_.length; i_1605_++) {
							int i_1606_ = is_1604_[i_1605_];
							if (aShortArray9067 == null || (i_1455_ & aShortArray9067[i_1606_]) != 0) {
								int i_1607_ = aShortArray9060[i_1606_] & 0xffff;
								int i_1608_ = i_1607_ >> 10 & 0x3f;
								int i_1609_ = i_1607_ >> 7 & 0x7;
								int i_1610_ = i_1607_ & 0x7f;
								i_1608_ = i_1608_ + i_1452_ & 0x3f;
								i_1609_ += i_1453_ / 4;
								if (i_1609_ < 0)
									i_1609_ = 0;
								else if (i_1609_ > 7)
									i_1609_ = 7;
								i_1610_ += i_1454_;
								if (i_1610_ < 0)
									i_1610_ = 0;
								else if (i_1610_ > 127)
									i_1610_ = 127;
								aShortArray9060[i_1606_] = (short) (i_1608_ << 10 | i_1609_ << 7 | i_1610_);
								if (aClass129_9069 != null)
									aClass129_9069.anInterface15_1547 = null;
							}
						}
					}
				}
				if (aClass150Array9093 != null) {
					for (int i_1611_ = 0; i_1611_ < anInt9075; i_1611_++) {
						Class150 class150 = aClass150Array9093[i_1611_];
						Class130 class130 = aClass130Array9094[i_1611_];
						class130.anInt1553 = (class130.anInt1553 & ~0xffffff | (Class656.anIntArray8390[(aShortArray9060[class150.anInt1682] & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9028 != null) {
				for (int i_1612_ = 0; i_1612_ < i_1457_; i_1612_++) {
					int i_1613_ = is[i_1612_];
					if (i_1613_ < anIntArrayArray9028.length) {
						int[] is_1614_ = anIntArrayArray9028[i_1613_];
						for (int i_1615_ = 0; i_1615_ < is_1614_.length; i_1615_++) {
							Class130 class130 = aClass130Array9094[is_1614_[i_1615_]];
							class130.anInt1548 += i_1452_;
							class130.anInt1552 += i_1453_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9028 != null) {
				for (int i_1616_ = 0; i_1616_ < i_1457_; i_1616_++) {
					int i_1617_ = is[i_1616_];
					if (i_1617_ < anIntArrayArray9028.length) {
						int[] is_1618_ = anIntArrayArray9028[i_1617_];
						for (int i_1619_ = 0; i_1619_ < is_1618_.length; i_1619_++) {
							Class130 class130 = aClass130Array9094[is_1618_[i_1619_]];
							class130.anInt1549 = class130.anInt1549 * i_1452_ >> 7;
							class130.anInt1551 = class130.anInt1551 * i_1453_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9028 != null) {
				for (int i_1620_ = 0; i_1620_ < i_1457_; i_1620_++) {
					int i_1621_ = is[i_1620_];
					if (i_1621_ < anIntArrayArray9028.length) {
						int[] is_1622_ = anIntArrayArray9028[i_1621_];
						for (int i_1623_ = 0; i_1623_ < is_1622_.length; i_1623_++) {
							Class130 class130 = aClass130Array9094[is_1622_[i_1623_]];
							class130.anInt1550 = class130.anInt1550 + i_1452_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	public void method2957(Class432 class432, Class169 class169, int i) {
		if ((i & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);
		if (anInt9059 != 0) {
			Class427 class427 = aClass180_Sub3_9035.aClass427_9707;
			Class427 class427_1624_ = aClass180_Sub3_9035.aClass427_9700;
			Class427 class427_1625_ = aClass180_Sub3_9035.aClass427_9841;
			class427_1624_.method6784(class432);
			class427_1625_.method6750(class427_1624_);
			class427_1625_.method6751(aClass180_Sub3_9035.aClass427_9722);
			if (!aBool9078)
				method14542();
			float[] fs = aClass180_Sub3_9035.aFloatArray9742;
			class427_1624_.method6773(0.0F, (float) aShort9040, 0.0F, fs);
			float f = fs[0];
			float f_1626_ = fs[1];
			float f_1627_ = fs[2];
			class427_1624_.method6773(0.0F, (float) aShort9080, 0.0F, fs);
			float f_1628_ = fs[0];
			float f_1629_ = fs[1];
			float f_1630_ = fs[2];
			for (int i_1631_ = 0; i_1631_ < 6; i_1631_++) {
				float[] fs_1632_ = aClass180_Sub3_9035.aFloatArrayArray9696[i_1631_];
				float f_1633_ = (fs_1632_[0] * f + fs_1632_[1] * f_1626_ + fs_1632_[2] * f_1627_ + fs_1632_[3] + (float) anInt9051);
				float f_1634_ = (fs_1632_[0] * f_1628_ + fs_1632_[1] * f_1629_ + fs_1632_[2] * f_1630_ + fs_1632_[3] + (float) anInt9051);
				if (f_1633_ < 0.0F && f_1634_ < 0.0F)
					return;
			}
			if (class169 != null) {
				boolean bool = false;
				boolean bool_1635_ = true;
				int i_1636_ = aShort9081 + aShort9082 >> 1;
				int i_1637_ = aShort9054 + aShort9076 >> 1;
				int i_1638_ = i_1636_;
				short i_1639_ = aShort9040;
				int i_1640_ = i_1637_;
				float f_1641_ = (class427_1625_.aFloatArray4807[0] * (float) i_1638_ + class427_1625_.aFloatArray4807[4] * (float) i_1639_ + class427_1625_.aFloatArray4807[8] * (float) i_1640_ + class427_1625_.aFloatArray4807[12]);
				float f_1642_ = (class427_1625_.aFloatArray4807[1] * (float) i_1638_ + class427_1625_.aFloatArray4807[5] * (float) i_1639_ + class427_1625_.aFloatArray4807[9] * (float) i_1640_ + class427_1625_.aFloatArray4807[13]);
				float f_1643_ = (class427_1625_.aFloatArray4807[2] * (float) i_1638_ + class427_1625_.aFloatArray4807[6] * (float) i_1639_ + class427_1625_.aFloatArray4807[10] * (float) i_1640_ + class427_1625_.aFloatArray4807[14]);
				float f_1644_ = (class427_1625_.aFloatArray4807[3] * (float) i_1638_ + class427_1625_.aFloatArray4807[7] * (float) i_1639_ + class427_1625_.aFloatArray4807[11] * (float) i_1640_ + class427_1625_.aFloatArray4807[15]);
				if (f_1643_ >= -f_1644_) {
					class169.anInt1872 = (int) (aClass180_Sub3_9035.aFloat9743 + (aClass180_Sub3_9035.aFloat9740 * f_1641_ / f_1644_));
					class169.anInt1876 = (int) (aClass180_Sub3_9035.aFloat9745 + (aClass180_Sub3_9035.aFloat9709 * f_1642_ / f_1644_));
				} else
					bool = true;
				i_1638_ = i_1636_;
				i_1639_ = aShort9080;
				i_1640_ = i_1637_;
				float f_1645_ = (class427_1625_.aFloatArray4807[0] * (float) i_1638_ + class427_1625_.aFloatArray4807[4] * (float) i_1639_ + class427_1625_.aFloatArray4807[8] * (float) i_1640_ + class427_1625_.aFloatArray4807[12]);
				float f_1646_ = (class427_1625_.aFloatArray4807[1] * (float) i_1638_ + class427_1625_.aFloatArray4807[5] * (float) i_1639_ + class427_1625_.aFloatArray4807[9] * (float) i_1640_ + class427_1625_.aFloatArray4807[13]);
				float f_1647_ = (class427_1625_.aFloatArray4807[2] * (float) i_1638_ + class427_1625_.aFloatArray4807[6] * (float) i_1639_ + class427_1625_.aFloatArray4807[10] * (float) i_1640_ + class427_1625_.aFloatArray4807[14]);
				float f_1648_ = (class427_1625_.aFloatArray4807[3] * (float) i_1638_ + class427_1625_.aFloatArray4807[7] * (float) i_1639_ + class427_1625_.aFloatArray4807[11] * (float) i_1640_ + class427_1625_.aFloatArray4807[15]);
				if (f_1647_ >= -f_1648_) {
					class169.anInt1873 = (int) (aClass180_Sub3_9035.aFloat9743 + (aClass180_Sub3_9035.aFloat9740 * f_1645_ / f_1648_));
					class169.anInt1875 = (int) (aClass180_Sub3_9035.aFloat9745 + (aClass180_Sub3_9035.aFloat9709 * f_1646_ / f_1648_));
				} else
					bool = true;
				if (bool) {
					if (f_1643_ < -f_1644_ && f_1647_ < -f_1648_)
						bool_1635_ = false;
					else if (f_1643_ < -f_1644_) {
						float f_1649_ = (f_1643_ + f_1644_) / (f_1647_ + f_1648_) - 1.0F;
						float f_1650_ = f_1641_ + f_1649_ * (f_1645_ - f_1641_);
						float f_1651_ = f_1642_ + f_1649_ * (f_1646_ - f_1642_);
						float f_1652_ = f_1644_ + f_1649_ * (f_1648_ - f_1644_);
						class169.anInt1872 = (int) (aClass180_Sub3_9035.aFloat9743 + (aClass180_Sub3_9035.aFloat9740 * f_1650_ / f_1652_));
						class169.anInt1876 = (int) (aClass180_Sub3_9035.aFloat9745 + (aClass180_Sub3_9035.aFloat9709 * f_1651_ / f_1652_));
					} else if (f_1647_ < -f_1648_) {
						float f_1653_ = (f_1647_ + f_1648_) / (f_1643_ + f_1644_) - 1.0F;
						float f_1654_ = f_1645_ + f_1653_ * (f_1641_ - f_1645_);
						float f_1655_ = f_1646_ + f_1653_ * (f_1642_ - f_1646_);
						float f_1656_ = f_1648_ + f_1653_ * (f_1644_ - f_1648_);
						class169.anInt1873 = (int) (aClass180_Sub3_9035.aFloat9743 + (aClass180_Sub3_9035.aFloat9740 * f_1654_ / f_1656_));
						class169.anInt1875 = (int) (aClass180_Sub3_9035.aFloat9745 + (aClass180_Sub3_9035.aFloat9709 * f_1655_ / f_1656_));
					}
				}
				if (bool_1635_) {
					if (f_1643_ / f_1644_ > f_1647_ / f_1648_) {
						float f_1657_ = (f_1641_ + (class427.aFloatArray4807[0] * (float) anInt9051) + class427.aFloatArray4807[12]);
						float f_1658_ = (f_1644_ + (class427.aFloatArray4807[3] * (float) anInt9051) + class427.aFloatArray4807[15]);
						class169.anInt1877 = (int) (aClass180_Sub3_9035.aFloat9743 - (float) class169.anInt1872 + (aClass180_Sub3_9035.aFloat9740 * f_1657_ / f_1658_));
					} else {
						float f_1659_ = (f_1645_ + (class427.aFloatArray4807[0] * (float) anInt9051) + class427.aFloatArray4807[12]);
						float f_1660_ = (f_1648_ + (class427.aFloatArray4807[3] * (float) anInt9051) + class427.aFloatArray4807[15]);
						class169.anInt1877 = (int) (aClass180_Sub3_9035.aFloat9743 - (float) class169.anInt1873 + (aClass180_Sub3_9035.aFloat9740 * f_1659_ / f_1660_));
					}
					class169.aBool1874 = true;
				}
			}
			aClass180_Sub3_9035.method15396();
			aClass180_Sub3_9035.method15367(class427_1624_);
			method14541();
			aClass180_Sub3_9035.method15369();
			class427_1624_.method6751(aClass180_Sub3_9035.aClass427_9736);
			method14547(class427_1624_);
			if ((i & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}
	}

	void method14555(Class427 class427) {
		if (aClass150Array9093 != null) {
			Class427 class427_1661_ = aClass180_Sub3_9035.aClass427_9685;
			aClass180_Sub3_9035.method15428();
			aClass180_Sub3_9035.method3182(!aBool9057);
			aClass180_Sub3_9035.method15409(false);
			aClass180_Sub3_9035.method15385(aClass180_Sub3_9035.aClass129_9844, null, null, (aClass180_Sub3_9035.aClass129_9732));
			for (int i = 0; i < anInt9075; i++) {
				Class150 class150 = aClass150Array9093[i];
				Class130 class130 = aClass130Array9094[i];
				if (!class150.aBool1690 || !aClass180_Sub3_9035.method3204()) {
					float f = ((float) (anIntArray9053[class150.anInt1688] + anIntArray9053[class150.anInt1683] + anIntArray9053[class150.anInt1684]) * 0.3333333F);
					float f_1662_ = ((float) (anIntArray9046[class150.anInt1688] + anIntArray9046[class150.anInt1683] + anIntArray9046[class150.anInt1684]) * 0.3333333F);
					float f_1663_ = ((float) (anIntArray9047[class150.anInt1688] + anIntArray9047[class150.anInt1683] + anIntArray9047[class150.anInt1684]) * 0.3333333F);
					float f_1664_ = (class427.aFloatArray4807[0] * f + class427.aFloatArray4807[4] * f_1662_ + class427.aFloatArray4807[8] * f_1663_ + class427.aFloatArray4807[12]);
					float f_1665_ = (class427.aFloatArray4807[1] * f + class427.aFloatArray4807[5] * f_1662_ + class427.aFloatArray4807[9] * f_1663_ + class427.aFloatArray4807[13]);
					float f_1666_ = (class427.aFloatArray4807[2] * f + class427.aFloatArray4807[6] * f_1662_ + class427.aFloatArray4807[10] * f_1663_ + class427.aFloatArray4807[14]);
					float f_1667_ = ((float) (1.0 / Math.sqrt((double) (f_1664_ * f_1664_ + f_1665_ * f_1665_ + (f_1666_ * f_1666_)))) * (float) class150.anInt1686);
					class427_1661_.method6804(class130.anInt1550, class130.anInt1549 * class150.aShort1691 >> 7, class130.anInt1551 * class150.aShort1685 >> 7, (f_1664_ + (float) class130.anInt1548 - f_1664_ * f_1667_), (f_1665_ + (float) class130.anInt1552 - f_1665_ * f_1667_), f_1666_ - f_1666_ * f_1667_);
					aClass180_Sub3_9035.method15570(class427_1661_);
					int i_1668_ = class130.anInt1553;
					OpenGL.glColor4ub((byte) (i_1668_ >> 16), (byte) (i_1668_ >> 8), (byte) i_1668_, (byte) (i_1668_ >> 24));
					aClass180_Sub3_9035.method15397(class150.aShort1687);
					aClass180_Sub3_9035.method15525(class150.aByte1689);
					aClass180_Sub3_9035.method15393(7, 0, 4);
				}
			}
			aClass180_Sub3_9035.method3182(true);
			aClass180_Sub3_9035.method15369();
		}
	}

	public boolean method3009() {
		if (aShortArray9065 == null)
			return true;
		for (int i = 0; i < aShortArray9065.length; i++) {
			if (aShortArray9065[i] != -1) {
				Class163 class163 = aClass180_Sub3_9035.aClass181_2059.method3544(aShortArray9065[i] & 0xffff, (byte) -30);
				if (class163.aBool1761 && !aClass180_Sub3_9035.aClass155_9694.method2540(Class609.aClass609_7996, class163, -1))
					return false;
			}
		}
		return true;
	}

	public int method2993() {
		return aShort9039;
	}

	public void method2961(Class432 class432) {
		Class427 class427 = aClass180_Sub3_9035.aClass427_9700;
		class427.method6784(class432);
		if (aClass167Array9090 != null) {
			for (int i = 0; i < aClass167Array9090.length; i++) {
				Class167 class167 = aClass167Array9090[i];
				Class167 class167_1669_ = class167;
				if (class167.aClass167_1849 != null)
					class167_1669_ = class167.aClass167_1849;
				class167_1669_.anInt1855 = (int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) (anIntArray9053[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[4] * (float) anIntArray9046[(class167.anInt1851 * -18705907)]) + (class427.aFloatArray4807[8] * (float) (anIntArray9047[(class167.anInt1851 * -18705907)])))) * 1542395015;
				class167_1669_.anInt1856 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) (anIntArray9053[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[5] * (float) (anIntArray9046[(class167.anInt1851 * -18705907)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9047[(class167.anInt1851 * -18705907)])))) * -1886500927);
				class167_1669_.anInt1860 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) (anIntArray9053[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[6] * (float) (anIntArray9046[(class167.anInt1851 * -18705907)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9047[(class167.anInt1851 * -18705907)])))) * -1731268533);
				class167_1669_.anInt1858 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9053[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9046[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9047[(class167.anInt1852 * -1573542389)])))) * -2034723417);
				class167_1669_.anInt1859 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9053[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9046[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9047[(class167.anInt1852 * -1573542389)])))) * -481732551);
				class167_1669_.anInt1862 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) anIntArray9053[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[6] * (float) (anIntArray9046[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9047[(class167.anInt1852 * -1573542389)])))) * -980787877);
				class167_1669_.anInt1857 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9053[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9046[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9047[(class167.anInt1853 * -2116684303)])))) * -1482367683);
				class167_1669_.anInt1850 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9053[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9046[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9047[(class167.anInt1853 * -2116684303)])))) * 1240185219);
				class167_1669_.anInt1863 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) anIntArray9053[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[6] * (float) (anIntArray9046[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9047[(class167.anInt1853 * -2116684303)])))) * -857185851);
			}
		}
		if (aClass159Array9045 != null) {
			for (int i = 0; i < aClass159Array9045.length; i++) {
				Class159 class159 = aClass159Array9045[i];
				Class159 class159_1670_ = class159;
				if (class159.aClass159_1739 != null)
					class159_1670_ = class159.aClass159_1739;
				if (class159.aClass427_1738 != null)
					class159.aClass427_1738.method6750(class427);
				else
					class159.aClass427_1738 = new Class427(class427);
				class159_1670_.anInt1744 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9053[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9046[(class159.anInt1740 * -449756941)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9047[(class159.anInt1740 * -449756941)])))) * -306739393);
				class159_1670_.anInt1742 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9053[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9046[(class159.anInt1740 * -449756941)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9047[(class159.anInt1740 * -449756941)])))) * -1995176663);
				class159_1670_.anInt1743 = (int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) (anIntArray9053[class159.anInt1740 * -449756941])) + (class427.aFloatArray4807[6] * (float) anIntArray9046[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[10] * (float) (anIntArray9047[(class159.anInt1740 * -449756941)])))) * 76591605;
			}
		}
	}

	public void method2871(Class432 class432) {
		Class427 class427 = aClass180_Sub3_9035.aClass427_9700;
		class427.method6784(class432);
		if (aClass167Array9090 != null) {
			for (int i = 0; i < aClass167Array9090.length; i++) {
				Class167 class167 = aClass167Array9090[i];
				Class167 class167_1671_ = class167;
				if (class167.aClass167_1849 != null)
					class167_1671_ = class167.aClass167_1849;
				class167_1671_.anInt1855 = (int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) (anIntArray9053[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[4] * (float) anIntArray9046[(class167.anInt1851 * -18705907)]) + (class427.aFloatArray4807[8] * (float) (anIntArray9047[(class167.anInt1851 * -18705907)])))) * 1542395015;
				class167_1671_.anInt1856 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) (anIntArray9053[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[5] * (float) (anIntArray9046[(class167.anInt1851 * -18705907)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9047[(class167.anInt1851 * -18705907)])))) * -1886500927);
				class167_1671_.anInt1860 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) (anIntArray9053[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[6] * (float) (anIntArray9046[(class167.anInt1851 * -18705907)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9047[(class167.anInt1851 * -18705907)])))) * -1731268533);
				class167_1671_.anInt1858 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9053[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9046[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9047[(class167.anInt1852 * -1573542389)])))) * -2034723417);
				class167_1671_.anInt1859 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9053[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9046[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9047[(class167.anInt1852 * -1573542389)])))) * -481732551);
				class167_1671_.anInt1862 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) anIntArray9053[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[6] * (float) (anIntArray9046[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9047[(class167.anInt1852 * -1573542389)])))) * -980787877);
				class167_1671_.anInt1857 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9053[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9046[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9047[(class167.anInt1853 * -2116684303)])))) * -1482367683);
				class167_1671_.anInt1850 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9053[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9046[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9047[(class167.anInt1853 * -2116684303)])))) * 1240185219);
				class167_1671_.anInt1863 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) anIntArray9053[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[6] * (float) (anIntArray9046[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9047[(class167.anInt1853 * -2116684303)])))) * -857185851);
			}
		}
		if (aClass159Array9045 != null) {
			for (int i = 0; i < aClass159Array9045.length; i++) {
				Class159 class159 = aClass159Array9045[i];
				Class159 class159_1672_ = class159;
				if (class159.aClass159_1739 != null)
					class159_1672_ = class159.aClass159_1739;
				if (class159.aClass427_1738 != null)
					class159.aClass427_1738.method6750(class427);
				else
					class159.aClass427_1738 = new Class427(class427);
				class159_1672_.anInt1744 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9053[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9046[(class159.anInt1740 * -449756941)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9047[(class159.anInt1740 * -449756941)])))) * -306739393);
				class159_1672_.anInt1742 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9053[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9046[(class159.anInt1740 * -449756941)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9047[(class159.anInt1740 * -449756941)])))) * -1995176663);
				class159_1672_.anInt1743 = (int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) (anIntArray9053[class159.anInt1740 * -449756941])) + (class427.aFloatArray4807[6] * (float) anIntArray9046[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[10] * (float) (anIntArray9047[(class159.anInt1740 * -449756941)])))) * 76591605;
			}
		}
	}

	public Class527_Sub8_Sub8 method2904(Class527_Sub8_Sub8 class527_sub8_sub8) {
		if (anInt9059 == 0)
			return null;
		if (!aBool9078)
			method14542();
		int i;
		int i_1673_;
		if (aClass180_Sub3_9035.anInt9785 > 0) {
			i = (aShort9081 - (aShort9080 * aClass180_Sub3_9035.anInt9785 >> 8) >> aClass180_Sub3_9035.anInt9850);
			i_1673_ = aShort9082 - (aShort9040 * aClass180_Sub3_9035.anInt9785 >> 8) >> aClass180_Sub3_9035.anInt9850;
		} else {
			i = (aShort9081 - (aShort9040 * aClass180_Sub3_9035.anInt9785 >> 8) >> aClass180_Sub3_9035.anInt9850);
			i_1673_ = aShort9082 - (aShort9080 * aClass180_Sub3_9035.anInt9785 >> 8) >> aClass180_Sub3_9035.anInt9850;
		}
		int i_1674_;
		int i_1675_;
		if (aClass180_Sub3_9035.anInt9786 > 0) {
			i_1674_ = aShort9054 - (aShort9080 * aClass180_Sub3_9035.anInt9786 >> 8) >> aClass180_Sub3_9035.anInt9850;
			i_1675_ = aShort9076 - (aShort9040 * aClass180_Sub3_9035.anInt9786 >> 8) >> aClass180_Sub3_9035.anInt9850;
		} else {
			i_1674_ = aShort9054 - (aShort9040 * aClass180_Sub3_9035.anInt9786 >> 8) >> aClass180_Sub3_9035.anInt9850;
			i_1675_ = aShort9076 - (aShort9080 * aClass180_Sub3_9035.anInt9786 >> 8) >> aClass180_Sub3_9035.anInt9850;
		}
		int i_1676_ = i_1673_ - i + 1;
		int i_1677_ = i_1675_ - i_1674_ + 1;
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1 = (Class527_Sub8_Sub8_Sub1) class527_sub8_sub8;
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1_1678_;
		if (class527_sub8_sub8_sub1 != null && class527_sub8_sub8_sub1.method18708(i_1676_, i_1677_)) {
			class527_sub8_sub8_sub1_1678_ = class527_sub8_sub8_sub1;
			class527_sub8_sub8_sub1_1678_.method18709();
		} else
			class527_sub8_sub8_sub1_1678_ = new Class527_Sub8_Sub8_Sub1(aClass180_Sub3_9035, i_1676_, i_1677_);
		class527_sub8_sub8_sub1_1678_.method18711(i, i_1674_, i_1673_, i_1675_);
		method14546(class527_sub8_sub8_sub1_1678_);
		return class527_sub8_sub8_sub1_1678_;
	}

	public Class527_Sub8_Sub8 method2964(Class527_Sub8_Sub8 class527_sub8_sub8) {
		if (anInt9059 == 0)
			return null;
		if (!aBool9078)
			method14542();
		int i;
		int i_1679_;
		if (aClass180_Sub3_9035.anInt9785 > 0) {
			i = (aShort9081 - (aShort9080 * aClass180_Sub3_9035.anInt9785 >> 8) >> aClass180_Sub3_9035.anInt9850);
			i_1679_ = aShort9082 - (aShort9040 * aClass180_Sub3_9035.anInt9785 >> 8) >> aClass180_Sub3_9035.anInt9850;
		} else {
			i = (aShort9081 - (aShort9040 * aClass180_Sub3_9035.anInt9785 >> 8) >> aClass180_Sub3_9035.anInt9850);
			i_1679_ = aShort9082 - (aShort9080 * aClass180_Sub3_9035.anInt9785 >> 8) >> aClass180_Sub3_9035.anInt9850;
		}
		int i_1680_;
		int i_1681_;
		if (aClass180_Sub3_9035.anInt9786 > 0) {
			i_1680_ = aShort9054 - (aShort9080 * aClass180_Sub3_9035.anInt9786 >> 8) >> aClass180_Sub3_9035.anInt9850;
			i_1681_ = aShort9076 - (aShort9040 * aClass180_Sub3_9035.anInt9786 >> 8) >> aClass180_Sub3_9035.anInt9850;
		} else {
			i_1680_ = aShort9054 - (aShort9040 * aClass180_Sub3_9035.anInt9786 >> 8) >> aClass180_Sub3_9035.anInt9850;
			i_1681_ = aShort9076 - (aShort9080 * aClass180_Sub3_9035.anInt9786 >> 8) >> aClass180_Sub3_9035.anInt9850;
		}
		int i_1682_ = i_1679_ - i + 1;
		int i_1683_ = i_1681_ - i_1680_ + 1;
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1 = (Class527_Sub8_Sub8_Sub1) class527_sub8_sub8;
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1_1684_;
		if (class527_sub8_sub8_sub1 != null && class527_sub8_sub8_sub1.method18708(i_1682_, i_1683_)) {
			class527_sub8_sub8_sub1_1684_ = class527_sub8_sub8_sub1;
			class527_sub8_sub8_sub1_1684_.method18709();
		} else
			class527_sub8_sub8_sub1_1684_ = new Class527_Sub8_Sub8_Sub1(aClass180_Sub3_9035, i_1682_, i_1683_);
		class527_sub8_sub8_sub1_1684_.method18711(i, i_1680_, i_1679_, i_1681_);
		method14546(class527_sub8_sub8_sub1_1684_);
		return class527_sub8_sub8_sub1_1684_;
	}

	public void method2930(int i) {
		int i_1685_ = Class428.anIntArray4825[i];
		int i_1686_ = Class428.anIntArray4819[i];
		for (int i_1687_ = 0; i_1687_ < anInt9064; i_1687_++) {
			int i_1688_ = ((anIntArray9047[i_1687_] * i_1685_ + anIntArray9053[i_1687_] * i_1686_) >> 14);
			anIntArray9047[i_1687_] = (anIntArray9047[i_1687_] * i_1686_ - anIntArray9053[i_1687_] * i_1685_) >> 14;
			anIntArray9053[i_1687_] = i_1688_;
		}
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		aBool9078 = false;
	}

	public int method2897() {
		if (!aBool9078)
			method14542();
		return aShort9080;
	}

	public void method2967() {
		if (!aBool9063) {
			if (!aBool9078)
				method14542();
			aShort9086 = aShort9040;
			aBool9063 = true;
		}
	}

	public int method3028() {
		if (!aBool9078)
			method14542();
		return anInt9051;
	}

	public boolean method2948(int i, int i_1689_, Class432 class432, boolean bool, int i_1690_) {
		Class427 class427 = aClass180_Sub3_9035.aClass427_9700;
		class427.method6784(class432);
		class427.method6751(aClass180_Sub3_9035.aClass427_9722);
		boolean bool_1691_ = false;
		int i_1692_ = 2147483647;
		int i_1693_ = -2147483648;
		int i_1694_ = 2147483647;
		int i_1695_ = -2147483648;
		if (!aBool9078)
			method14542();
		int i_1696_ = aShort9082 - aShort9081 >> 1;
		int i_1697_ = aShort9080 - aShort9040 >> 1;
		int i_1698_ = aShort9076 - aShort9054 >> 1;
		int i_1699_ = aShort9081 + i_1696_;
		int i_1700_ = aShort9040 + i_1697_;
		int i_1701_ = aShort9054 + i_1698_;
		int i_1702_ = i_1699_ - (i_1696_ << i_1690_);
		int i_1703_ = i_1700_ - (i_1697_ << i_1690_);
		int i_1704_ = i_1701_ - (i_1698_ << i_1690_);
		int i_1705_ = i_1699_ + (i_1696_ << i_1690_);
		int i_1706_ = i_1700_ + (i_1697_ << i_1690_);
		int i_1707_ = i_1701_ + (i_1698_ << i_1690_);
		anIntArray9098[0] = i_1702_;
		anIntArray9099[0] = i_1703_;
		anIntArray9100[0] = i_1704_;
		anIntArray9098[1] = i_1705_;
		anIntArray9099[1] = i_1703_;
		anIntArray9100[1] = i_1704_;
		anIntArray9098[2] = i_1702_;
		anIntArray9099[2] = i_1706_;
		anIntArray9100[2] = i_1704_;
		anIntArray9098[3] = i_1705_;
		anIntArray9099[3] = i_1706_;
		anIntArray9100[3] = i_1704_;
		anIntArray9098[4] = i_1702_;
		anIntArray9099[4] = i_1703_;
		anIntArray9100[4] = i_1707_;
		anIntArray9098[5] = i_1705_;
		anIntArray9099[5] = i_1703_;
		anIntArray9100[5] = i_1707_;
		anIntArray9098[6] = i_1702_;
		anIntArray9099[6] = i_1706_;
		anIntArray9100[6] = i_1707_;
		anIntArray9098[7] = i_1705_;
		anIntArray9099[7] = i_1706_;
		anIntArray9100[7] = i_1707_;
		for (int i_1708_ = 0; i_1708_ < 8; i_1708_++) {
			int i_1709_ = anIntArray9098[i_1708_];
			int i_1710_ = anIntArray9099[i_1708_];
			int i_1711_ = anIntArray9100[i_1708_];
			float f = (class427.aFloatArray4807[2] * (float) i_1709_ + class427.aFloatArray4807[6] * (float) i_1710_ + class427.aFloatArray4807[10] * (float) i_1711_ + class427.aFloatArray4807[14]);
			float f_1712_ = (class427.aFloatArray4807[3] * (float) i_1709_ + class427.aFloatArray4807[7] * (float) i_1710_ + class427.aFloatArray4807[11] * (float) i_1711_ + class427.aFloatArray4807[15]);
			if (f >= -f_1712_) {
				float f_1713_ = (class427.aFloatArray4807[0] * (float) i_1709_ + class427.aFloatArray4807[4] * (float) i_1710_ + class427.aFloatArray4807[8] * (float) i_1711_ + class427.aFloatArray4807[12]);
				float f_1714_ = (class427.aFloatArray4807[1] * (float) i_1709_ + class427.aFloatArray4807[5] * (float) i_1710_ + class427.aFloatArray4807[9] * (float) i_1711_ + class427.aFloatArray4807[13]);
				int i_1715_ = (int) (aClass180_Sub3_9035.aFloat9743 + (aClass180_Sub3_9035.aFloat9740 * f_1713_ / f_1712_));
				int i_1716_ = (int) (aClass180_Sub3_9035.aFloat9745 + (aClass180_Sub3_9035.aFloat9709 * f_1714_ / f_1712_));
				if (i_1715_ < i_1692_)
					i_1692_ = i_1715_;
				if (i_1715_ > i_1693_)
					i_1693_ = i_1715_;
				if (i_1716_ < i_1694_)
					i_1694_ = i_1716_;
				if (i_1716_ > i_1695_)
					i_1695_ = i_1716_;
				bool_1691_ = true;
			}
		}
		if (bool_1691_ && i > i_1692_ && i < i_1693_ && i_1689_ > i_1694_ && i_1689_ < i_1695_) {
			if (bool)
				return true;
			if (aClass180_Sub3_9035.anIntArray9838.length < anInt9059) {
				aClass180_Sub3_9035.anIntArray9838 = new int[anInt9059];
				aClass180_Sub3_9035.anIntArray9851 = new int[anInt9059];
			}
			int[] is = aClass180_Sub3_9035.anIntArray9838;
			int[] is_1717_ = aClass180_Sub3_9035.anIntArray9851;
			for (int i_1718_ = 0; i_1718_ < anInt9064; i_1718_++) {
				int i_1719_ = anIntArray9053[i_1718_];
				int i_1720_ = anIntArray9046[i_1718_];
				int i_1721_ = anIntArray9047[i_1718_];
				float f = (class427.aFloatArray4807[2] * (float) i_1719_ + class427.aFloatArray4807[6] * (float) i_1720_ + class427.aFloatArray4807[10] * (float) i_1721_ + class427.aFloatArray4807[14]);
				float f_1722_ = (class427.aFloatArray4807[3] * (float) i_1719_ + class427.aFloatArray4807[7] * (float) i_1720_ + class427.aFloatArray4807[11] * (float) i_1721_ + class427.aFloatArray4807[15]);
				if (f >= -f_1722_) {
					float f_1723_ = (class427.aFloatArray4807[0] * (float) i_1719_ + class427.aFloatArray4807[4] * (float) i_1720_ + class427.aFloatArray4807[8] * (float) i_1721_ + class427.aFloatArray4807[12]);
					float f_1724_ = (class427.aFloatArray4807[1] * (float) i_1719_ + class427.aFloatArray4807[5] * (float) i_1720_ + class427.aFloatArray4807[9] * (float) i_1721_ + class427.aFloatArray4807[13]);
					int i_1725_ = anIntArray9088[i_1718_];
					int i_1726_ = anIntArray9088[i_1718_ + 1];
					for (int i_1727_ = i_1725_; i_1727_ < i_1726_ && aShortArray9089[i_1727_] != 0; i_1727_++) {
						int i_1728_ = (aShortArray9089[i_1727_] & 0xffff) - 1;
						is[i_1728_] = (int) (aClass180_Sub3_9035.aFloat9743 + (aClass180_Sub3_9035.aFloat9740 * f_1723_ / f_1722_));
						is_1717_[i_1728_] = (int) (aClass180_Sub3_9035.aFloat9745 + (aClass180_Sub3_9035.aFloat9709 * f_1724_ / f_1722_));
					}
				} else {
					int i_1729_ = anIntArray9088[i_1718_];
					int i_1730_ = anIntArray9088[i_1718_ + 1];
					for (int i_1731_ = i_1729_; i_1731_ < i_1730_ && aShortArray9089[i_1731_] != 0; i_1731_++) {
						int i_1732_ = (aShortArray9089[i_1731_] & 0xffff) - 1;
						is[i_1732_] = -999999;
					}
				}
			}
			for (int i_1733_ = 0; i_1733_ < anInt9058; i_1733_++) {
				if (is[aShortArray9062[i_1733_] & 0xffff] != -999999 && is[aShortArray9055[i_1733_] & 0xffff] != -999999 && is[aShortArray9050[i_1733_] & 0xffff] != -999999 && method14580(i, i_1689_, is_1717_[aShortArray9062[i_1733_] & 0xffff], is_1717_[aShortArray9055[i_1733_] & 0xffff], is_1717_[aShortArray9050[i_1733_] & 0xffff], is[aShortArray9062[i_1733_] & 0xffff], is[aShortArray9055[i_1733_] & 0xffff], is[aShortArray9050[i_1733_] & 0xffff]))
					return true;
			}
		}
		return false;
	}

	public int method2970() {
		if (!aBool9078)
			method14542();
		return anInt9051;
	}

	public int method2971() {
		if (!aBool9078)
			method14542();
		return anInt9051;
	}

	static byte[] method14556(byte[] is, int i) {
		byte[] is_1734_ = new byte[i];
		System.arraycopy(is, 0, is_1734_, 0, i);
		return is_1734_;
	}

	public int method2973() {
		if (!aBool9078)
			method14542();
		return anInt9074;
	}

	public int method2997() {
		if (!aBool9078)
			method14542();
		return anInt9074;
	}

	public int method2972() {
		if (!aBool9078)
			method14542();
		return anInt9074;
	}

	public int method2976() {
		if (!aBool9078)
			method14542();
		return aShort9082;
	}

	public int method2977() {
		if (!aBool9078)
			method14542();
		return aShort9082;
	}

	public int method2978() {
		if (!aBool9078)
			method14542();
		return aShort9040;
	}

	public int method2979() {
		if (!aBool9078)
			method14542();
		return aShort9040;
	}

	public int method2985() {
		if (!aBool9078)
			method14542();
		return aShort9040;
	}

	public int method2902() {
		if (!aBool9078)
			method14542();
		return aShort9054;
	}

	public int method2929() {
		return aShort9039;
	}

	public int method2983() {
		if (!aBool9078)
			method14542();
		return aShort9076;
	}

	public int method2963() {
		if (!aBool9078)
			method14542();
		return aShort9076;
	}

	public int method2989() {
		if (!aBool9063)
			method2901();
		return aShort9086;
	}

	public int method3023() {
		if (!aBool9063)
			method2901();
		return aShort9086;
	}

	public int method2987() {
		if (!aBool9063)
			method2901();
		return aShort9086;
	}

	public void method2988(int i) {
		aShort9039 = (short) i;
		if (aClass129_9069 != null)
			aClass129_9069.anInterface15_1547 = null;
	}

	public void method3039(int i) {
		aShort9039 = (short) i;
		if (aClass129_9069 != null)
			aClass129_9069.anInterface15_1547 = null;
	}

	public void method3007(int i) {
		aShort9095 = (short) i;
		if (aClass129_9069 != null)
			aClass129_9069.anInterface15_1547 = null;
		if (aClass129_9070 != null)
			aClass129_9070.anInterface15_1547 = null;
	}

	public void method2991(int i) {
		aShort9095 = (short) i;
		if (aClass129_9069 != null)
			aClass129_9069.anInterface15_1547 = null;
		if (aClass129_9070 != null)
			aClass129_9070.anInterface15_1547 = null;
	}

	public int method2942() {
		return aShort9039;
	}

	public Class527_Sub8_Sub8 method2965(Class527_Sub8_Sub8 class527_sub8_sub8) {
		if (anInt9059 == 0)
			return null;
		if (!aBool9078)
			method14542();
		int i;
		int i_1735_;
		if (aClass180_Sub3_9035.anInt9785 > 0) {
			i = (aShort9081 - (aShort9080 * aClass180_Sub3_9035.anInt9785 >> 8) >> aClass180_Sub3_9035.anInt9850);
			i_1735_ = aShort9082 - (aShort9040 * aClass180_Sub3_9035.anInt9785 >> 8) >> aClass180_Sub3_9035.anInt9850;
		} else {
			i = (aShort9081 - (aShort9040 * aClass180_Sub3_9035.anInt9785 >> 8) >> aClass180_Sub3_9035.anInt9850);
			i_1735_ = aShort9082 - (aShort9080 * aClass180_Sub3_9035.anInt9785 >> 8) >> aClass180_Sub3_9035.anInt9850;
		}
		int i_1736_;
		int i_1737_;
		if (aClass180_Sub3_9035.anInt9786 > 0) {
			i_1736_ = aShort9054 - (aShort9080 * aClass180_Sub3_9035.anInt9786 >> 8) >> aClass180_Sub3_9035.anInt9850;
			i_1737_ = aShort9076 - (aShort9040 * aClass180_Sub3_9035.anInt9786 >> 8) >> aClass180_Sub3_9035.anInt9850;
		} else {
			i_1736_ = aShort9054 - (aShort9040 * aClass180_Sub3_9035.anInt9786 >> 8) >> aClass180_Sub3_9035.anInt9850;
			i_1737_ = aShort9076 - (aShort9080 * aClass180_Sub3_9035.anInt9786 >> 8) >> aClass180_Sub3_9035.anInt9850;
		}
		int i_1738_ = i_1735_ - i + 1;
		int i_1739_ = i_1737_ - i_1736_ + 1;
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1 = (Class527_Sub8_Sub8_Sub1) class527_sub8_sub8;
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1_1740_;
		if (class527_sub8_sub8_sub1 != null && class527_sub8_sub8_sub1.method18708(i_1738_, i_1739_)) {
			class527_sub8_sub8_sub1_1740_ = class527_sub8_sub8_sub1;
			class527_sub8_sub8_sub1_1740_.method18709();
		} else
			class527_sub8_sub8_sub1_1740_ = new Class527_Sub8_Sub8_Sub1(aClass180_Sub3_9035, i_1738_, i_1739_);
		class527_sub8_sub8_sub1_1740_.method18711(i, i_1736_, i_1735_, i_1737_);
		method14546(class527_sub8_sub8_sub1_1740_);
		return class527_sub8_sub8_sub1_1740_;
	}

	public int method2994() {
		return aShort9039;
	}

	public int method2995() {
		return aShort9039;
	}

	public int method2996() {
		return aShort9095;
	}

	public boolean method2923(int i, int i_1741_, Class432 class432, boolean bool, int i_1742_) {
		Class427 class427 = aClass180_Sub3_9035.aClass427_9700;
		class427.method6784(class432);
		class427.method6751(aClass180_Sub3_9035.aClass427_9722);
		boolean bool_1743_ = false;
		int i_1744_ = 2147483647;
		int i_1745_ = -2147483648;
		int i_1746_ = 2147483647;
		int i_1747_ = -2147483648;
		if (!aBool9078)
			method14542();
		int i_1748_ = aShort9082 - aShort9081 >> 1;
		int i_1749_ = aShort9080 - aShort9040 >> 1;
		int i_1750_ = aShort9076 - aShort9054 >> 1;
		int i_1751_ = aShort9081 + i_1748_;
		int i_1752_ = aShort9040 + i_1749_;
		int i_1753_ = aShort9054 + i_1750_;
		int i_1754_ = i_1751_ - (i_1748_ << i_1742_);
		int i_1755_ = i_1752_ - (i_1749_ << i_1742_);
		int i_1756_ = i_1753_ - (i_1750_ << i_1742_);
		int i_1757_ = i_1751_ + (i_1748_ << i_1742_);
		int i_1758_ = i_1752_ + (i_1749_ << i_1742_);
		int i_1759_ = i_1753_ + (i_1750_ << i_1742_);
		anIntArray9098[0] = i_1754_;
		anIntArray9099[0] = i_1755_;
		anIntArray9100[0] = i_1756_;
		anIntArray9098[1] = i_1757_;
		anIntArray9099[1] = i_1755_;
		anIntArray9100[1] = i_1756_;
		anIntArray9098[2] = i_1754_;
		anIntArray9099[2] = i_1758_;
		anIntArray9100[2] = i_1756_;
		anIntArray9098[3] = i_1757_;
		anIntArray9099[3] = i_1758_;
		anIntArray9100[3] = i_1756_;
		anIntArray9098[4] = i_1754_;
		anIntArray9099[4] = i_1755_;
		anIntArray9100[4] = i_1759_;
		anIntArray9098[5] = i_1757_;
		anIntArray9099[5] = i_1755_;
		anIntArray9100[5] = i_1759_;
		anIntArray9098[6] = i_1754_;
		anIntArray9099[6] = i_1758_;
		anIntArray9100[6] = i_1759_;
		anIntArray9098[7] = i_1757_;
		anIntArray9099[7] = i_1758_;
		anIntArray9100[7] = i_1759_;
		for (int i_1760_ = 0; i_1760_ < 8; i_1760_++) {
			int i_1761_ = anIntArray9098[i_1760_];
			int i_1762_ = anIntArray9099[i_1760_];
			int i_1763_ = anIntArray9100[i_1760_];
			float f = (class427.aFloatArray4807[2] * (float) i_1761_ + class427.aFloatArray4807[6] * (float) i_1762_ + class427.aFloatArray4807[10] * (float) i_1763_ + class427.aFloatArray4807[14]);
			float f_1764_ = (class427.aFloatArray4807[3] * (float) i_1761_ + class427.aFloatArray4807[7] * (float) i_1762_ + class427.aFloatArray4807[11] * (float) i_1763_ + class427.aFloatArray4807[15]);
			if (f >= -f_1764_) {
				float f_1765_ = (class427.aFloatArray4807[0] * (float) i_1761_ + class427.aFloatArray4807[4] * (float) i_1762_ + class427.aFloatArray4807[8] * (float) i_1763_ + class427.aFloatArray4807[12]);
				float f_1766_ = (class427.aFloatArray4807[1] * (float) i_1761_ + class427.aFloatArray4807[5] * (float) i_1762_ + class427.aFloatArray4807[9] * (float) i_1763_ + class427.aFloatArray4807[13]);
				int i_1767_ = (int) (aClass180_Sub3_9035.aFloat9743 + (aClass180_Sub3_9035.aFloat9740 * f_1765_ / f_1764_));
				int i_1768_ = (int) (aClass180_Sub3_9035.aFloat9745 + (aClass180_Sub3_9035.aFloat9709 * f_1766_ / f_1764_));
				if (i_1767_ < i_1744_)
					i_1744_ = i_1767_;
				if (i_1767_ > i_1745_)
					i_1745_ = i_1767_;
				if (i_1768_ < i_1746_)
					i_1746_ = i_1768_;
				if (i_1768_ > i_1747_)
					i_1747_ = i_1768_;
				bool_1743_ = true;
			}
		}
		if (bool_1743_ && i > i_1744_ && i < i_1745_ && i_1741_ > i_1746_ && i_1741_ < i_1747_) {
			if (bool)
				return true;
			if (aClass180_Sub3_9035.anIntArray9838.length < anInt9059) {
				aClass180_Sub3_9035.anIntArray9838 = new int[anInt9059];
				aClass180_Sub3_9035.anIntArray9851 = new int[anInt9059];
			}
			int[] is = aClass180_Sub3_9035.anIntArray9838;
			int[] is_1769_ = aClass180_Sub3_9035.anIntArray9851;
			for (int i_1770_ = 0; i_1770_ < anInt9064; i_1770_++) {
				int i_1771_ = anIntArray9053[i_1770_];
				int i_1772_ = anIntArray9046[i_1770_];
				int i_1773_ = anIntArray9047[i_1770_];
				float f = (class427.aFloatArray4807[2] * (float) i_1771_ + class427.aFloatArray4807[6] * (float) i_1772_ + class427.aFloatArray4807[10] * (float) i_1773_ + class427.aFloatArray4807[14]);
				float f_1774_ = (class427.aFloatArray4807[3] * (float) i_1771_ + class427.aFloatArray4807[7] * (float) i_1772_ + class427.aFloatArray4807[11] * (float) i_1773_ + class427.aFloatArray4807[15]);
				if (f >= -f_1774_) {
					float f_1775_ = (class427.aFloatArray4807[0] * (float) i_1771_ + class427.aFloatArray4807[4] * (float) i_1772_ + class427.aFloatArray4807[8] * (float) i_1773_ + class427.aFloatArray4807[12]);
					float f_1776_ = (class427.aFloatArray4807[1] * (float) i_1771_ + class427.aFloatArray4807[5] * (float) i_1772_ + class427.aFloatArray4807[9] * (float) i_1773_ + class427.aFloatArray4807[13]);
					int i_1777_ = anIntArray9088[i_1770_];
					int i_1778_ = anIntArray9088[i_1770_ + 1];
					for (int i_1779_ = i_1777_; i_1779_ < i_1778_ && aShortArray9089[i_1779_] != 0; i_1779_++) {
						int i_1780_ = (aShortArray9089[i_1779_] & 0xffff) - 1;
						is[i_1780_] = (int) (aClass180_Sub3_9035.aFloat9743 + (aClass180_Sub3_9035.aFloat9740 * f_1775_ / f_1774_));
						is_1769_[i_1780_] = (int) (aClass180_Sub3_9035.aFloat9745 + (aClass180_Sub3_9035.aFloat9709 * f_1776_ / f_1774_));
					}
				} else {
					int i_1781_ = anIntArray9088[i_1770_];
					int i_1782_ = anIntArray9088[i_1770_ + 1];
					for (int i_1783_ = i_1781_; i_1783_ < i_1782_ && aShortArray9089[i_1783_] != 0; i_1783_++) {
						int i_1784_ = (aShortArray9089[i_1783_] & 0xffff) - 1;
						is[i_1784_] = -999999;
					}
				}
			}
			for (int i_1785_ = 0; i_1785_ < anInt9058; i_1785_++) {
				if (is[aShortArray9062[i_1785_] & 0xffff] != -999999 && is[aShortArray9055[i_1785_] & 0xffff] != -999999 && is[aShortArray9050[i_1785_] & 0xffff] != -999999 && method14580(i, i_1741_, is_1769_[aShortArray9062[i_1785_] & 0xffff], is_1769_[aShortArray9055[i_1785_] & 0xffff], is_1769_[aShortArray9050[i_1785_] & 0xffff], is[aShortArray9062[i_1785_] & 0xffff], is[aShortArray9055[i_1785_] & 0xffff], is[aShortArray9050[i_1785_] & 0xffff]))
					return true;
			}
		}
		return false;
	}

	public int method2998() {
		return aShort9095;
	}

	public boolean method3012() {
		return aBool9057;
	}

	public void method2868(int i) {
		int i_1786_ = Class428.anIntArray4825[i];
		int i_1787_ = Class428.anIntArray4819[i];
		for (int i_1788_ = 0; i_1788_ < anInt9064; i_1788_++) {
			int i_1789_ = ((anIntArray9046[i_1788_] * i_1787_ - anIntArray9047[i_1788_] * i_1786_) >> 14);
			anIntArray9047[i_1788_] = (anIntArray9046[i_1788_] * i_1786_ + anIntArray9047[i_1788_] * i_1787_) >> 14;
			anIntArray9046[i_1788_] = i_1789_;
		}
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		aBool9078 = false;
	}

	public byte[] method3001() {
		return aByteArray9061;
	}

	public Class527_Sub8_Sub8 method2891(Class527_Sub8_Sub8 class527_sub8_sub8) {
		if (anInt9059 == 0)
			return null;
		if (!aBool9078)
			method14542();
		int i;
		int i_1790_;
		if (aClass180_Sub3_9035.anInt9785 > 0) {
			i = (aShort9081 - (aShort9080 * aClass180_Sub3_9035.anInt9785 >> 8) >> aClass180_Sub3_9035.anInt9850);
			i_1790_ = aShort9082 - (aShort9040 * aClass180_Sub3_9035.anInt9785 >> 8) >> aClass180_Sub3_9035.anInt9850;
		} else {
			i = (aShort9081 - (aShort9040 * aClass180_Sub3_9035.anInt9785 >> 8) >> aClass180_Sub3_9035.anInt9850);
			i_1790_ = aShort9082 - (aShort9080 * aClass180_Sub3_9035.anInt9785 >> 8) >> aClass180_Sub3_9035.anInt9850;
		}
		int i_1791_;
		int i_1792_;
		if (aClass180_Sub3_9035.anInt9786 > 0) {
			i_1791_ = aShort9054 - (aShort9080 * aClass180_Sub3_9035.anInt9786 >> 8) >> aClass180_Sub3_9035.anInt9850;
			i_1792_ = aShort9076 - (aShort9040 * aClass180_Sub3_9035.anInt9786 >> 8) >> aClass180_Sub3_9035.anInt9850;
		} else {
			i_1791_ = aShort9054 - (aShort9040 * aClass180_Sub3_9035.anInt9786 >> 8) >> aClass180_Sub3_9035.anInt9850;
			i_1792_ = aShort9076 - (aShort9080 * aClass180_Sub3_9035.anInt9786 >> 8) >> aClass180_Sub3_9035.anInt9850;
		}
		int i_1793_ = i_1790_ - i + 1;
		int i_1794_ = i_1792_ - i_1791_ + 1;
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1 = (Class527_Sub8_Sub8_Sub1) class527_sub8_sub8;
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1_1795_;
		if (class527_sub8_sub8_sub1 != null && class527_sub8_sub8_sub1.method18708(i_1793_, i_1794_)) {
			class527_sub8_sub8_sub1_1795_ = class527_sub8_sub8_sub1;
			class527_sub8_sub8_sub1_1795_.method18709();
		} else
			class527_sub8_sub8_sub1_1795_ = new Class527_Sub8_Sub8_Sub1(aClass180_Sub3_9035, i_1793_, i_1794_);
		class527_sub8_sub8_sub1_1795_.method18711(i, i_1791_, i_1790_, i_1792_);
		method14546(class527_sub8_sub8_sub1_1795_);
		return class527_sub8_sub8_sub1_1795_;
	}

	public void method2959(byte i, byte[] is) {
		if (is == null) {
			for (int i_1796_ = 0; i_1796_ < anInt9058; i_1796_++)
				aByteArray9061[i_1796_] = i;
		} else {
			for (int i_1797_ = 0; i_1797_ < anInt9058; i_1797_++) {
				int i_1798_ = 255 - ((255 - (is[i_1797_] & 0xff)) * (255 - (i & 0xff)) / 255);
				aByteArray9061[i_1797_] = (byte) i_1798_;
			}
		}
		if (aClass129_9069 != null)
			aClass129_9069.anInterface15_1547 = null;
	}

	public void method3004(short i, short i_1799_) {
		Class181 class181 = aClass180_Sub3_9035.aClass181_2059;
		for (int i_1800_ = 0; i_1800_ < anInt9058; i_1800_++) {
			if (aShortArray9065[i_1800_] == i)
				aShortArray9065[i_1800_] = i_1799_;
		}
		byte i_1801_ = 0;
		byte i_1802_ = 0;
		if (i != -1) {
			Class163 class163 = class181.method3544(i & 0xffff, (byte) -91);
			i_1801_ = class163.aByte1808;
			i_1802_ = class163.aByte1802;
		}
		byte i_1803_ = 0;
		byte i_1804_ = 0;
		if (i_1799_ != -1) {
			Class163 class163 = class181.method3544(i_1799_ & 0xffff, (byte) -80);
			i_1803_ = class163.aByte1808;
			i_1804_ = class163.aByte1802;
			if (class163.aByte1781 != 0 || class163.aByte1797 != 0)
				aBool9096 = true;
		}
		if (i_1801_ != i_1803_ | i_1802_ != i_1804_) {
			if (aClass150Array9093 != null) {
				for (int i_1805_ = 0; i_1805_ < anInt9075; i_1805_++) {
					Class150 class150 = aClass150Array9093[i_1805_];
					Class130 class130 = aClass130Array9094[i_1805_];
					class130.anInt1553 = (class130.anInt1553 & ~0xffffff | ((Class656.anIntArray8390[aShortArray9060[class150.anInt1682] & 0xffff]) & 0xffffff));
				}
			}
			if (aClass129_9069 != null)
				aClass129_9069.anInterface15_1547 = null;
		}
	}

	static final int method14557(int i, int i_1806_) {
		i_1806_ = i_1806_ * (i & 0x7f) >> 7;
		if (i_1806_ < 2)
			i_1806_ = 2;
		else if (i_1806_ > 126)
			i_1806_ = 126;
		return (i & 0xff80) + i_1806_;
	}

	public void method3006(int i, int i_1807_, int i_1808_, int i_1809_) {
		for (int i_1810_ = 0; i_1810_ < anInt9058; i_1810_++) {
			int i_1811_ = aShortArray9060[i_1810_] & 0xffff;
			int i_1812_ = i_1811_ >> 10 & 0x3f;
			int i_1813_ = i_1811_ >> 7 & 0x7;
			int i_1814_ = i_1811_ & 0x7f;
			if (i != -1)
				i_1812_ += (i - i_1812_) * i_1809_ >> 7;
			if (i_1807_ != -1)
				i_1813_ += (i_1807_ - i_1813_) * i_1809_ >> 7;
			if (i_1808_ != -1)
				i_1814_ += (i_1808_ - i_1814_) * i_1809_ >> 7;
			aShortArray9060[i_1810_] = (short) (i_1812_ << 10 | i_1813_ << 7 | i_1814_);
		}
		if (aClass150Array9093 != null) {
			for (int i_1815_ = 0; i_1815_ < anInt9075; i_1815_++) {
				Class150 class150 = aClass150Array9093[i_1815_];
				Class130 class130 = aClass130Array9094[i_1815_];
				class130.anInt1553 = (class130.anInt1553 & ~0xffffff | ((Class656.anIntArray8390[aShortArray9060[class150.anInt1682] & 0xffff]) & 0xffffff));
			}
		}
		if (aClass129_9069 != null)
			aClass129_9069.anInterface15_1547 = null;
	}

	public Class167[] method2974() {
		return aClass167Array9090;
	}

	public boolean method3008() {
		if (aShortArray9065 == null)
			return true;
		for (int i = 0; i < aShortArray9065.length; i++) {
			if (aShortArray9065[i] != -1) {
				Class163 class163 = aClass180_Sub3_9035.aClass181_2059.method3544(aShortArray9065[i] & 0xffff, (byte) -7);
				if (class163.aBool1761 && !aClass180_Sub3_9035.aClass155_9694.method2540(Class609.aClass609_7996, class163, -1))
					return false;
			}
		}
		return true;
	}

	public int method2890() {
		if (!aBool9078)
			method14542();
		return aShort9076;
	}

	public boolean method3010() {
		return aBool9057;
	}

	public void method2876(int i) {
		int i_1816_ = Class428.anIntArray4825[i];
		int i_1817_ = Class428.anIntArray4819[i];
		for (int i_1818_ = 0; i_1818_ < anInt9064; i_1818_++) {
			int i_1819_ = ((anIntArray9046[i_1818_] * i_1816_ + anIntArray9053[i_1818_] * i_1817_) >> 14);
			anIntArray9046[i_1818_] = (anIntArray9046[i_1818_] * i_1817_ - anIntArray9053[i_1818_] * i_1816_) >> 14;
			anIntArray9053[i_1818_] = i_1819_;
		}
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		aBool9078 = false;
	}

	public void method2914(byte i, byte[] is) {
		if (is == null) {
			for (int i_1820_ = 0; i_1820_ < anInt9058; i_1820_++)
				aByteArray9061[i_1820_] = i;
		} else {
			for (int i_1821_ = 0; i_1821_ < anInt9058; i_1821_++) {
				int i_1822_ = 255 - ((255 - (is[i_1821_] & 0xff)) * (255 - (i & 0xff)) / 255);
				aByteArray9061[i_1821_] = (byte) i_1822_;
			}
		}
		if (aClass129_9069 != null)
			aClass129_9069.anInterface15_1547 = null;
	}

	public boolean method2958(int i, int i_1823_, Class432 class432, boolean bool, int i_1824_) {
		Class427 class427 = aClass180_Sub3_9035.aClass427_9700;
		class427.method6784(class432);
		class427.method6751(aClass180_Sub3_9035.aClass427_9722);
		boolean bool_1825_ = false;
		int i_1826_ = 2147483647;
		int i_1827_ = -2147483648;
		int i_1828_ = 2147483647;
		int i_1829_ = -2147483648;
		if (!aBool9078)
			method14542();
		int i_1830_ = aShort9082 - aShort9081 >> 1;
		int i_1831_ = aShort9080 - aShort9040 >> 1;
		int i_1832_ = aShort9076 - aShort9054 >> 1;
		int i_1833_ = aShort9081 + i_1830_;
		int i_1834_ = aShort9040 + i_1831_;
		int i_1835_ = aShort9054 + i_1832_;
		int i_1836_ = i_1833_ - (i_1830_ << i_1824_);
		int i_1837_ = i_1834_ - (i_1831_ << i_1824_);
		int i_1838_ = i_1835_ - (i_1832_ << i_1824_);
		int i_1839_ = i_1833_ + (i_1830_ << i_1824_);
		int i_1840_ = i_1834_ + (i_1831_ << i_1824_);
		int i_1841_ = i_1835_ + (i_1832_ << i_1824_);
		anIntArray9098[0] = i_1836_;
		anIntArray9099[0] = i_1837_;
		anIntArray9100[0] = i_1838_;
		anIntArray9098[1] = i_1839_;
		anIntArray9099[1] = i_1837_;
		anIntArray9100[1] = i_1838_;
		anIntArray9098[2] = i_1836_;
		anIntArray9099[2] = i_1840_;
		anIntArray9100[2] = i_1838_;
		anIntArray9098[3] = i_1839_;
		anIntArray9099[3] = i_1840_;
		anIntArray9100[3] = i_1838_;
		anIntArray9098[4] = i_1836_;
		anIntArray9099[4] = i_1837_;
		anIntArray9100[4] = i_1841_;
		anIntArray9098[5] = i_1839_;
		anIntArray9099[5] = i_1837_;
		anIntArray9100[5] = i_1841_;
		anIntArray9098[6] = i_1836_;
		anIntArray9099[6] = i_1840_;
		anIntArray9100[6] = i_1841_;
		anIntArray9098[7] = i_1839_;
		anIntArray9099[7] = i_1840_;
		anIntArray9100[7] = i_1841_;
		for (int i_1842_ = 0; i_1842_ < 8; i_1842_++) {
			int i_1843_ = anIntArray9098[i_1842_];
			int i_1844_ = anIntArray9099[i_1842_];
			int i_1845_ = anIntArray9100[i_1842_];
			float f = (class427.aFloatArray4807[2] * (float) i_1843_ + class427.aFloatArray4807[6] * (float) i_1844_ + class427.aFloatArray4807[10] * (float) i_1845_ + class427.aFloatArray4807[14]);
			float f_1846_ = (class427.aFloatArray4807[3] * (float) i_1843_ + class427.aFloatArray4807[7] * (float) i_1844_ + class427.aFloatArray4807[11] * (float) i_1845_ + class427.aFloatArray4807[15]);
			if (f >= -f_1846_) {
				float f_1847_ = (class427.aFloatArray4807[0] * (float) i_1843_ + class427.aFloatArray4807[4] * (float) i_1844_ + class427.aFloatArray4807[8] * (float) i_1845_ + class427.aFloatArray4807[12]);
				float f_1848_ = (class427.aFloatArray4807[1] * (float) i_1843_ + class427.aFloatArray4807[5] * (float) i_1844_ + class427.aFloatArray4807[9] * (float) i_1845_ + class427.aFloatArray4807[13]);
				int i_1849_ = (int) (aClass180_Sub3_9035.aFloat9743 + (aClass180_Sub3_9035.aFloat9740 * f_1847_ / f_1846_));
				int i_1850_ = (int) (aClass180_Sub3_9035.aFloat9745 + (aClass180_Sub3_9035.aFloat9709 * f_1848_ / f_1846_));
				if (i_1849_ < i_1826_)
					i_1826_ = i_1849_;
				if (i_1849_ > i_1827_)
					i_1827_ = i_1849_;
				if (i_1850_ < i_1828_)
					i_1828_ = i_1850_;
				if (i_1850_ > i_1829_)
					i_1829_ = i_1850_;
				bool_1825_ = true;
			}
		}
		if (bool_1825_ && i > i_1826_ && i < i_1827_ && i_1823_ > i_1828_ && i_1823_ < i_1829_) {
			if (bool)
				return true;
			if (aClass180_Sub3_9035.anIntArray9838.length < anInt9059) {
				aClass180_Sub3_9035.anIntArray9838 = new int[anInt9059];
				aClass180_Sub3_9035.anIntArray9851 = new int[anInt9059];
			}
			int[] is = aClass180_Sub3_9035.anIntArray9838;
			int[] is_1851_ = aClass180_Sub3_9035.anIntArray9851;
			for (int i_1852_ = 0; i_1852_ < anInt9064; i_1852_++) {
				int i_1853_ = anIntArray9053[i_1852_];
				int i_1854_ = anIntArray9046[i_1852_];
				int i_1855_ = anIntArray9047[i_1852_];
				float f = (class427.aFloatArray4807[2] * (float) i_1853_ + class427.aFloatArray4807[6] * (float) i_1854_ + class427.aFloatArray4807[10] * (float) i_1855_ + class427.aFloatArray4807[14]);
				float f_1856_ = (class427.aFloatArray4807[3] * (float) i_1853_ + class427.aFloatArray4807[7] * (float) i_1854_ + class427.aFloatArray4807[11] * (float) i_1855_ + class427.aFloatArray4807[15]);
				if (f >= -f_1856_) {
					float f_1857_ = (class427.aFloatArray4807[0] * (float) i_1853_ + class427.aFloatArray4807[4] * (float) i_1854_ + class427.aFloatArray4807[8] * (float) i_1855_ + class427.aFloatArray4807[12]);
					float f_1858_ = (class427.aFloatArray4807[1] * (float) i_1853_ + class427.aFloatArray4807[5] * (float) i_1854_ + class427.aFloatArray4807[9] * (float) i_1855_ + class427.aFloatArray4807[13]);
					int i_1859_ = anIntArray9088[i_1852_];
					int i_1860_ = anIntArray9088[i_1852_ + 1];
					for (int i_1861_ = i_1859_; i_1861_ < i_1860_ && aShortArray9089[i_1861_] != 0; i_1861_++) {
						int i_1862_ = (aShortArray9089[i_1861_] & 0xffff) - 1;
						is[i_1862_] = (int) (aClass180_Sub3_9035.aFloat9743 + (aClass180_Sub3_9035.aFloat9740 * f_1857_ / f_1856_));
						is_1851_[i_1862_] = (int) (aClass180_Sub3_9035.aFloat9745 + (aClass180_Sub3_9035.aFloat9709 * f_1858_ / f_1856_));
					}
				} else {
					int i_1863_ = anIntArray9088[i_1852_];
					int i_1864_ = anIntArray9088[i_1852_ + 1];
					for (int i_1865_ = i_1863_; i_1865_ < i_1864_ && aShortArray9089[i_1865_] != 0; i_1865_++) {
						int i_1866_ = (aShortArray9089[i_1865_] & 0xffff) - 1;
						is[i_1866_] = -999999;
					}
				}
			}
			for (int i_1867_ = 0; i_1867_ < anInt9058; i_1867_++) {
				if (is[aShortArray9062[i_1867_] & 0xffff] != -999999 && is[aShortArray9055[i_1867_] & 0xffff] != -999999 && is[aShortArray9050[i_1867_] & 0xffff] != -999999 && method14580(i, i_1823_, is_1851_[aShortArray9062[i_1867_] & 0xffff], is_1851_[aShortArray9055[i_1867_] & 0xffff], is_1851_[aShortArray9050[i_1867_] & 0xffff], is[aShortArray9062[i_1867_] & 0xffff], is[aShortArray9055[i_1867_] & 0xffff], is[aShortArray9050[i_1867_] & 0xffff]))
					return true;
			}
		}
		return false;
	}

	public boolean method3014() {
		return aBool9096;
	}

	short method14558(Class175 class175, int i, long l, int i_1868_, int i_1869_, int i_1870_, int i_1871_, float f, float f_1872_) {
		int i_1873_ = anIntArray9088[i];
		int i_1874_ = anIntArray9088[i + 1];
		int i_1875_ = 0;
		for (int i_1876_ = i_1873_; i_1876_ < i_1874_; i_1876_++) {
			if (aShortArray9089[i_1876_] == 0) {
				i_1875_ = i_1876_;
				break;
			}
			int i_1877_ = (aShortArray9089[i_1876_] & 0xffff) - 1;
			if (aLongArray9083[i_1876_] == l)
				return (short) i_1877_;
		}
		aShortArray9089[i_1875_] = (short) (anInt9059 + 1);
		aLongArray9083[i_1875_] = l;
		aShortArray9092[anInt9059] = (short) i_1868_;
		aShortArray9052[anInt9059] = (short) i_1869_;
		aShortArray9029[anInt9059] = (short) i_1870_;
		aByteArray9091[anInt9059] = (byte) i_1871_;
		aFloatArray9056[anInt9059] = f;
		aFloatArray9085[anInt9059] = f_1872_;
		return (short) anInt9059++;
	}

	short method14559(Class175 class175, int i, long l, int i_1878_, int i_1879_, int i_1880_, int i_1881_, float f, float f_1882_) {
		int i_1883_ = anIntArray9088[i];
		int i_1884_ = anIntArray9088[i + 1];
		int i_1885_ = 0;
		for (int i_1886_ = i_1883_; i_1886_ < i_1884_; i_1886_++) {
			if (aShortArray9089[i_1886_] == 0) {
				i_1885_ = i_1886_;
				break;
			}
			int i_1887_ = (aShortArray9089[i_1886_] & 0xffff) - 1;
			if (aLongArray9083[i_1886_] == l)
				return (short) i_1887_;
		}
		aShortArray9089[i_1885_] = (short) (anInt9059 + 1);
		aLongArray9083[i_1885_] = l;
		aShortArray9092[anInt9059] = (short) i_1878_;
		aShortArray9052[anInt9059] = (short) i_1879_;
		aShortArray9029[anInt9059] = (short) i_1880_;
		aByteArray9091[anInt9059] = (byte) i_1881_;
		aFloatArray9056[anInt9059] = f;
		aFloatArray9085[anInt9059] = f_1882_;
		return (short) anInt9059++;
	}

	short method14560(Class175 class175, int i, long l, int i_1888_, int i_1889_, int i_1890_, int i_1891_, float f, float f_1892_) {
		int i_1893_ = anIntArray9088[i];
		int i_1894_ = anIntArray9088[i + 1];
		int i_1895_ = 0;
		for (int i_1896_ = i_1893_; i_1896_ < i_1894_; i_1896_++) {
			if (aShortArray9089[i_1896_] == 0) {
				i_1895_ = i_1896_;
				break;
			}
			int i_1897_ = (aShortArray9089[i_1896_] & 0xffff) - 1;
			if (aLongArray9083[i_1896_] == l)
				return (short) i_1897_;
		}
		aShortArray9089[i_1895_] = (short) (anInt9059 + 1);
		aLongArray9083[i_1895_] = l;
		aShortArray9092[anInt9059] = (short) i_1888_;
		aShortArray9052[anInt9059] = (short) i_1889_;
		aShortArray9029[anInt9059] = (short) i_1890_;
		aByteArray9091[anInt9059] = (byte) i_1891_;
		aFloatArray9056[anInt9059] = f;
		aFloatArray9085[anInt9059] = f_1892_;
		return (short) anInt9059++;
	}

	static byte[] method14561(byte[] is, int i) {
		byte[] is_1898_ = new byte[i];
		System.arraycopy(is, 0, is_1898_, 0, i);
		return is_1898_;
	}

	short method14562(Class175 class175, int i, long l, int i_1899_, int i_1900_, int i_1901_, int i_1902_, float f, float f_1903_) {
		int i_1904_ = anIntArray9088[i];
		int i_1905_ = anIntArray9088[i + 1];
		int i_1906_ = 0;
		for (int i_1907_ = i_1904_; i_1907_ < i_1905_; i_1907_++) {
			if (aShortArray9089[i_1907_] == 0) {
				i_1906_ = i_1907_;
				break;
			}
			int i_1908_ = (aShortArray9089[i_1907_] & 0xffff) - 1;
			if (aLongArray9083[i_1907_] == l)
				return (short) i_1908_;
		}
		aShortArray9089[i_1906_] = (short) (anInt9059 + 1);
		aLongArray9083[i_1906_] = l;
		aShortArray9092[anInt9059] = (short) i_1899_;
		aShortArray9052[anInt9059] = (short) i_1900_;
		aShortArray9029[anInt9059] = (short) i_1901_;
		aByteArray9091[anInt9059] = (byte) i_1902_;
		aFloatArray9056[anInt9059] = f;
		aFloatArray9085[anInt9059] = f_1903_;
		return (short) anInt9059++;
	}

	public void method2888(Class432 class432, int i, boolean bool) {
		if (aShortArray9049 != null) {
			Class432 class432_1909_ = class432;
			if (bool) {
				class432_1909_ = aClass180_Sub3_9035.aClass432_9751;
				class432_1909_.method6918(class432);
			}
			float[] fs = new float[3];
			for (int i_1910_ = 0; i_1910_ < anInt9064; i_1910_++) {
				if ((i & aShortArray9049[i_1910_]) != 0) {
					class432_1909_.method6883((float) anIntArray9053[i_1910_], (float) anIntArray9046[i_1910_], (float) anIntArray9047[i_1910_], fs);
					anIntArray9053[i_1910_] = (int) fs[0];
					anIntArray9046[i_1910_] = (int) fs[1];
					anIntArray9047[i_1910_] = (int) fs[2];
				}
			}
		}
	}

	static short[] method14563(short[] is, int i) {
		short[] is_1911_ = new short[i];
		System.arraycopy(is, 0, is_1911_, 0, i);
		return is_1911_;
	}

	public void method2867(int i) {
		int i_1912_ = Class428.anIntArray4825[i];
		int i_1913_ = Class428.anIntArray4819[i];
		for (int i_1914_ = 0; i_1914_ < anInt9064; i_1914_++) {
			int i_1915_ = ((anIntArray9047[i_1914_] * i_1912_ + anIntArray9053[i_1914_] * i_1913_) >> 14);
			anIntArray9047[i_1914_] = (anIntArray9047[i_1914_] * i_1913_ - anIntArray9053[i_1914_] * i_1912_) >> 14;
			anIntArray9053[i_1914_] = i_1915_;
		}
		for (int i_1916_ = 0; i_1916_ < anInt9059; i_1916_++) {
			int i_1917_ = ((aShortArray9029[i_1916_] * i_1912_ + aShortArray9092[i_1916_] * i_1913_) >> 14);
			aShortArray9029[i_1916_] = (short) ((aShortArray9029[i_1916_] * i_1913_ - aShortArray9092[i_1916_] * i_1912_) >> 14);
			aShortArray9092[i_1916_] = (short) i_1917_;
		}
		if (aClass129_9070 == null && aClass129_9069 != null)
			aClass129_9069.anInterface15_1547 = null;
		if (aClass129_9070 != null)
			aClass129_9070.anInterface15_1547 = null;
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		aBool9078 = false;
	}

	void method3020() {
		/* empty */
	}

	static float[] method14564(float[] fs, int i) {
		float[] fs_1918_ = new float[i];
		System.arraycopy(fs, 0, fs_1918_, 0, i);
		return fs_1918_;
	}

	public int method2951() {
		return anInt9036;
	}

	Class176 method14565(Class176_Sub1 class176_sub1_1919_, Class176_Sub1 class176_sub1_1920_, int i, boolean bool, boolean bool_1921_) {
		class176_sub1_1919_.aByte9038 = (byte) 0;
		class176_sub1_1919_.anInt9036 = i;
		class176_sub1_1919_.anInt9037 = anInt9037;
		class176_sub1_1919_.aShort9039 = aShort9039;
		class176_sub1_1919_.aShort9095 = aShort9095;
		class176_sub1_1919_.anInt9043 = anInt9043;
		class176_sub1_1919_.anInt9064 = anInt9064;
		class176_sub1_1919_.anInt9059 = anInt9059;
		class176_sub1_1919_.anInt9058 = anInt9058;
		class176_sub1_1919_.anInt9079 = anInt9079;
		class176_sub1_1919_.anInt9075 = anInt9075;
		if ((i & 0x100) != 0)
			class176_sub1_1919_.aBool9057 = true;
		else
			class176_sub1_1919_.aBool9057 = aBool9057;
		class176_sub1_1919_.aBool9096 = aBool9096;
		boolean bool_1922_ = Class134.method2186(i, anInt9037);
		boolean bool_1923_ = Class134.method2187(i, anInt9037);
		boolean bool_1924_ = Class134.method2229(i, anInt9037);
		boolean bool_1925_ = bool_1922_ | bool_1923_ | bool_1924_;
		if (bool_1925_) {
			if (bool_1922_) {
				if (class176_sub1_1920_.anIntArray9053 == null || class176_sub1_1920_.anIntArray9053.length < anInt9043)
					class176_sub1_1919_.anIntArray9053 = class176_sub1_1920_.anIntArray9053 = new int[anInt9043];
				else
					class176_sub1_1919_.anIntArray9053 = class176_sub1_1920_.anIntArray9053;
			} else
				class176_sub1_1919_.anIntArray9053 = anIntArray9053;
			if (bool_1923_) {
				if (class176_sub1_1920_.anIntArray9046 == null || class176_sub1_1920_.anIntArray9046.length < anInt9043)
					class176_sub1_1919_.anIntArray9046 = class176_sub1_1920_.anIntArray9046 = new int[anInt9043];
				else
					class176_sub1_1919_.anIntArray9046 = class176_sub1_1920_.anIntArray9046;
			} else
				class176_sub1_1919_.anIntArray9046 = anIntArray9046;
			if (bool_1924_) {
				if (class176_sub1_1920_.anIntArray9047 == null || class176_sub1_1920_.anIntArray9047.length < anInt9043)
					class176_sub1_1919_.anIntArray9047 = class176_sub1_1920_.anIntArray9047 = new int[anInt9043];
				else
					class176_sub1_1919_.anIntArray9047 = class176_sub1_1920_.anIntArray9047;
			} else
				class176_sub1_1919_.anIntArray9047 = anIntArray9047;
			for (int i_1926_ = 0; i_1926_ < anInt9043; i_1926_++) {
				if (bool_1922_)
					class176_sub1_1919_.anIntArray9053[i_1926_] = anIntArray9053[i_1926_];
				if (bool_1923_)
					class176_sub1_1919_.anIntArray9046[i_1926_] = anIntArray9046[i_1926_];
				if (bool_1924_)
					class176_sub1_1919_.anIntArray9047[i_1926_] = anIntArray9047[i_1926_];
			}
		} else {
			class176_sub1_1919_.anIntArray9053 = anIntArray9053;
			class176_sub1_1919_.anIntArray9046 = anIntArray9046;
			class176_sub1_1919_.anIntArray9047 = anIntArray9047;
		}
		if (Class134.method2261(i, anInt9037)) {
			if (bool)
				class176_sub1_1919_.aByte9038 |= 0x1;
			class176_sub1_1919_.aClass129_9068 = class176_sub1_1920_.aClass129_9068;
			class176_sub1_1919_.aClass129_9068.aByte1544 = aClass129_9068.aByte1544;
			class176_sub1_1919_.aClass129_9068.anInterface15_1547 = aClass129_9068.anInterface15_1547;
		} else if (Class134.method2215(i, anInt9037))
			class176_sub1_1919_.aClass129_9068 = aClass129_9068;
		else
			class176_sub1_1919_.aClass129_9068 = null;
		if (Class134.method2264(i, anInt9037)) {
			if (class176_sub1_1920_.aShortArray9060 == null || class176_sub1_1920_.aShortArray9060.length < anInt9058)
				class176_sub1_1919_.aShortArray9060 = class176_sub1_1920_.aShortArray9060 = new short[anInt9058];
			else
				class176_sub1_1919_.aShortArray9060 = class176_sub1_1920_.aShortArray9060;
			for (int i_1927_ = 0; i_1927_ < anInt9058; i_1927_++)
				class176_sub1_1919_.aShortArray9060[i_1927_] = aShortArray9060[i_1927_];
		} else
			class176_sub1_1919_.aShortArray9060 = aShortArray9060;
		if (Class134.method2192(i, anInt9037)) {
			if (class176_sub1_1920_.aByteArray9061 == null || class176_sub1_1920_.aByteArray9061.length < anInt9058)
				class176_sub1_1919_.aByteArray9061 = class176_sub1_1920_.aByteArray9061 = new byte[anInt9058];
			else
				class176_sub1_1919_.aByteArray9061 = class176_sub1_1920_.aByteArray9061;
			for (int i_1928_ = 0; i_1928_ < anInt9058; i_1928_++)
				class176_sub1_1919_.aByteArray9061[i_1928_] = aByteArray9061[i_1928_];
		} else
			class176_sub1_1919_.aByteArray9061 = aByteArray9061;
		if (Class134.method2260(i, anInt9037)) {
			if (bool)
				class176_sub1_1919_.aByte9038 |= 0x2;
			class176_sub1_1919_.aClass129_9069 = class176_sub1_1920_.aClass129_9069;
			class176_sub1_1919_.aClass129_9069.aByte1544 = aClass129_9069.aByte1544;
			class176_sub1_1919_.aClass129_9069.anInterface15_1547 = aClass129_9069.anInterface15_1547;
		} else if (Class134.method2200(i, anInt9037))
			class176_sub1_1919_.aClass129_9069 = aClass129_9069;
		else
			class176_sub1_1919_.aClass129_9069 = null;
		if (Class134.method2190(i, anInt9037)) {
			if (class176_sub1_1920_.aShortArray9092 == null || class176_sub1_1920_.aShortArray9092.length < anInt9059) {
				int i_1929_ = anInt9059;
				class176_sub1_1919_.aShortArray9092 = class176_sub1_1920_.aShortArray9092 = new short[i_1929_];
				class176_sub1_1919_.aShortArray9052 = class176_sub1_1920_.aShortArray9052 = new short[i_1929_];
				class176_sub1_1919_.aShortArray9029 = class176_sub1_1920_.aShortArray9029 = new short[i_1929_];
			} else {
				class176_sub1_1919_.aShortArray9092 = class176_sub1_1920_.aShortArray9092;
				class176_sub1_1919_.aShortArray9052 = class176_sub1_1920_.aShortArray9052;
				class176_sub1_1919_.aShortArray9029 = class176_sub1_1920_.aShortArray9029;
			}
			if (aClass158_9041 != null) {
				if (class176_sub1_1920_.aClass158_9041 == null)
					class176_sub1_1920_.aClass158_9041 = new Class158();
				Class158 class158 = (class176_sub1_1919_.aClass158_9041 = class176_sub1_1920_.aClass158_9041);
				if (class158.aShortArray1735 == null || class158.aShortArray1735.length < anInt9059) {
					int i_1930_ = anInt9059;
					class158.aShortArray1735 = new short[i_1930_];
					class158.aShortArray1737 = new short[i_1930_];
					class158.aShortArray1736 = new short[i_1930_];
					class158.aByteArray1734 = new byte[i_1930_];
				}
				for (int i_1931_ = 0; i_1931_ < anInt9059; i_1931_++) {
					class176_sub1_1919_.aShortArray9092[i_1931_] = aShortArray9092[i_1931_];
					class176_sub1_1919_.aShortArray9052[i_1931_] = aShortArray9052[i_1931_];
					class176_sub1_1919_.aShortArray9029[i_1931_] = aShortArray9029[i_1931_];
					class158.aShortArray1735[i_1931_] = aClass158_9041.aShortArray1735[i_1931_];
					class158.aShortArray1737[i_1931_] = aClass158_9041.aShortArray1737[i_1931_];
					class158.aShortArray1736[i_1931_] = aClass158_9041.aShortArray1736[i_1931_];
					class158.aByteArray1734[i_1931_] = aClass158_9041.aByteArray1734[i_1931_];
				}
			} else {
				for (int i_1932_ = 0; i_1932_ < anInt9059; i_1932_++) {
					class176_sub1_1919_.aShortArray9092[i_1932_] = aShortArray9092[i_1932_];
					class176_sub1_1919_.aShortArray9052[i_1932_] = aShortArray9052[i_1932_];
					class176_sub1_1919_.aShortArray9029[i_1932_] = aShortArray9029[i_1932_];
				}
			}
			class176_sub1_1919_.aByteArray9091 = aByteArray9091;
		} else {
			class176_sub1_1919_.aClass158_9041 = aClass158_9041;
			class176_sub1_1919_.aShortArray9092 = aShortArray9092;
			class176_sub1_1919_.aShortArray9052 = aShortArray9052;
			class176_sub1_1919_.aShortArray9029 = aShortArray9029;
			class176_sub1_1919_.aByteArray9091 = aByteArray9091;
		}
		if (Class134.method2243(i, anInt9037)) {
			if (bool)
				class176_sub1_1919_.aByte9038 |= 0x4;
			class176_sub1_1919_.aClass129_9070 = class176_sub1_1920_.aClass129_9070;
			class176_sub1_1919_.aClass129_9070.aByte1544 = aClass129_9070.aByte1544;
			class176_sub1_1919_.aClass129_9070.anInterface15_1547 = aClass129_9070.anInterface15_1547;
		} else if (Class134.method2257(i, anInt9037))
			class176_sub1_1919_.aClass129_9070 = aClass129_9070;
		else
			class176_sub1_1919_.aClass129_9070 = null;
		if (Class134.method2287(i, anInt9037)) {
			if (class176_sub1_1920_.aFloatArray9056 == null || class176_sub1_1920_.aFloatArray9056.length < anInt9058) {
				int i_1933_ = anInt9059;
				class176_sub1_1919_.aFloatArray9056 = class176_sub1_1920_.aFloatArray9056 = new float[i_1933_];
				class176_sub1_1919_.aFloatArray9085 = class176_sub1_1920_.aFloatArray9085 = new float[i_1933_];
			} else {
				class176_sub1_1919_.aFloatArray9056 = class176_sub1_1920_.aFloatArray9056;
				class176_sub1_1919_.aFloatArray9085 = class176_sub1_1920_.aFloatArray9085;
			}
			for (int i_1934_ = 0; i_1934_ < anInt9059; i_1934_++) {
				class176_sub1_1919_.aFloatArray9056[i_1934_] = aFloatArray9056[i_1934_];
				class176_sub1_1919_.aFloatArray9085[i_1934_] = aFloatArray9085[i_1934_];
			}
		} else {
			class176_sub1_1919_.aFloatArray9056 = aFloatArray9056;
			class176_sub1_1919_.aFloatArray9085 = aFloatArray9085;
		}
		if (Class134.method2206(i, anInt9037)) {
			if (bool)
				class176_sub1_1919_.aByte9038 |= 0x8;
			class176_sub1_1919_.aClass129_9071 = class176_sub1_1920_.aClass129_9071;
			class176_sub1_1919_.aClass129_9071.aByte1544 = aClass129_9071.aByte1544;
			class176_sub1_1919_.aClass129_9071.anInterface15_1547 = aClass129_9071.anInterface15_1547;
		} else if (Class134.method2201(i, anInt9037))
			class176_sub1_1919_.aClass129_9071 = aClass129_9071;
		else
			class176_sub1_1919_.aClass129_9071 = null;
		if (Class134.method2194(i, anInt9037)) {
			if (class176_sub1_1920_.aShortArray9062 == null || class176_sub1_1920_.aShortArray9062.length < anInt9058) {
				int i_1935_ = anInt9058;
				class176_sub1_1919_.aShortArray9062 = class176_sub1_1920_.aShortArray9062 = new short[i_1935_];
				class176_sub1_1919_.aShortArray9055 = class176_sub1_1920_.aShortArray9055 = new short[i_1935_];
				class176_sub1_1919_.aShortArray9050 = class176_sub1_1920_.aShortArray9050 = new short[i_1935_];
			} else {
				class176_sub1_1919_.aShortArray9062 = class176_sub1_1920_.aShortArray9062;
				class176_sub1_1919_.aShortArray9055 = class176_sub1_1920_.aShortArray9055;
				class176_sub1_1919_.aShortArray9050 = class176_sub1_1920_.aShortArray9050;
			}
			for (int i_1936_ = 0; i_1936_ < anInt9058; i_1936_++) {
				class176_sub1_1919_.aShortArray9062[i_1936_] = aShortArray9062[i_1936_];
				class176_sub1_1919_.aShortArray9055[i_1936_] = aShortArray9055[i_1936_];
				class176_sub1_1919_.aShortArray9050[i_1936_] = aShortArray9050[i_1936_];
			}
		} else {
			class176_sub1_1919_.aShortArray9062 = aShortArray9062;
			class176_sub1_1919_.aShortArray9055 = aShortArray9055;
			class176_sub1_1919_.aShortArray9050 = aShortArray9050;
		}
		if (Class134.method2275(i, anInt9037)) {
			if (bool)
				class176_sub1_1919_.aByte9038 |= 0x10;
			class176_sub1_1919_.aClass132_9072 = class176_sub1_1920_.aClass132_9072;
			class176_sub1_1919_.aClass132_9072.anInterface17_1556 = aClass132_9072.anInterface17_1556;
		} else if (Class134.method2202(i, anInt9037))
			class176_sub1_1919_.aClass132_9072 = aClass132_9072;
		else
			class176_sub1_1919_.aClass132_9072 = null;
		if (Class134.method2251(i, anInt9037)) {
			if (class176_sub1_1920_.aShortArray9065 == null || class176_sub1_1920_.aShortArray9065.length < anInt9058) {
				int i_1937_ = anInt9058;
				class176_sub1_1919_.aShortArray9065 = class176_sub1_1920_.aShortArray9065 = new short[i_1937_];
			} else
				class176_sub1_1919_.aShortArray9065 = class176_sub1_1920_.aShortArray9065;
			for (int i_1938_ = 0; i_1938_ < anInt9058; i_1938_++)
				class176_sub1_1919_.aShortArray9065[i_1938_] = aShortArray9065[i_1938_];
		} else
			class176_sub1_1919_.aShortArray9065 = aShortArray9065;
		if (Class134.method2209(i, anInt9037)) {
			if (class176_sub1_1920_.aClass130Array9094 == null || class176_sub1_1920_.aClass130Array9094.length < anInt9075) {
				int i_1939_ = anInt9075;
				class176_sub1_1919_.aClass130Array9094 = class176_sub1_1920_.aClass130Array9094 = new Class130[i_1939_];
				for (int i_1940_ = 0; i_1940_ < anInt9075; i_1940_++)
					class176_sub1_1919_.aClass130Array9094[i_1940_] = aClass130Array9094[i_1940_].method2176();
			} else {
				class176_sub1_1919_.aClass130Array9094 = class176_sub1_1920_.aClass130Array9094;
				for (int i_1941_ = 0; i_1941_ < anInt9075; i_1941_++)
					class176_sub1_1919_.aClass130Array9094[i_1941_].method2177(aClass130Array9094[i_1941_]);
			}
		} else
			class176_sub1_1919_.aClass130Array9094 = aClass130Array9094;
		class176_sub1_1919_.aClass150Array9093 = aClass150Array9093;
		if (aBool9078) {
			class176_sub1_1919_.anInt9074 = anInt9074;
			class176_sub1_1919_.anInt9051 = anInt9051;
			class176_sub1_1919_.aShort9081 = aShort9081;
			class176_sub1_1919_.aShort9082 = aShort9082;
			class176_sub1_1919_.aShort9040 = aShort9040;
			class176_sub1_1919_.aShort9080 = aShort9080;
			class176_sub1_1919_.aShort9054 = aShort9054;
			class176_sub1_1919_.aShort9076 = aShort9076;
			class176_sub1_1919_.aBool9078 = true;
		} else
			class176_sub1_1919_.aBool9078 = false;
		if (aBool9063) {
			class176_sub1_1919_.aShort9086 = aShort9086;
			class176_sub1_1919_.aBool9063 = true;
		} else
			class176_sub1_1919_.aBool9063 = false;
		class176_sub1_1919_.anIntArrayArray9048 = anIntArrayArray9048;
		class176_sub1_1919_.anIntArrayArray9042 = anIntArrayArray9042;
		class176_sub1_1919_.anIntArrayArray9028 = anIntArrayArray9028;
		class176_sub1_1919_.aShortArray9089 = aShortArray9089;
		class176_sub1_1919_.anIntArray9088 = anIntArray9088;
		class176_sub1_1919_.aShortArray9049 = aShortArray9049;
		class176_sub1_1919_.aShortArray9067 = aShortArray9067;
		class176_sub1_1919_.anIntArray9087 = anIntArray9087;
		class176_sub1_1919_.aClass167Array9090 = aClass167Array9090;
		class176_sub1_1919_.aClass159Array9045 = aClass159Array9045;
		return class176_sub1_1919_;
	}

	Class176 method14566(Class176_Sub1 class176_sub1_1942_, Class176_Sub1 class176_sub1_1943_, int i, boolean bool, boolean bool_1944_) {
		class176_sub1_1942_.aByte9038 = (byte) 0;
		class176_sub1_1942_.anInt9036 = i;
		class176_sub1_1942_.anInt9037 = anInt9037;
		class176_sub1_1942_.aShort9039 = aShort9039;
		class176_sub1_1942_.aShort9095 = aShort9095;
		class176_sub1_1942_.anInt9043 = anInt9043;
		class176_sub1_1942_.anInt9064 = anInt9064;
		class176_sub1_1942_.anInt9059 = anInt9059;
		class176_sub1_1942_.anInt9058 = anInt9058;
		class176_sub1_1942_.anInt9079 = anInt9079;
		class176_sub1_1942_.anInt9075 = anInt9075;
		if ((i & 0x100) != 0)
			class176_sub1_1942_.aBool9057 = true;
		else
			class176_sub1_1942_.aBool9057 = aBool9057;
		class176_sub1_1942_.aBool9096 = aBool9096;
		boolean bool_1945_ = Class134.method2186(i, anInt9037);
		boolean bool_1946_ = Class134.method2187(i, anInt9037);
		boolean bool_1947_ = Class134.method2229(i, anInt9037);
		boolean bool_1948_ = bool_1945_ | bool_1946_ | bool_1947_;
		if (bool_1948_) {
			if (bool_1945_) {
				if (class176_sub1_1943_.anIntArray9053 == null || class176_sub1_1943_.anIntArray9053.length < anInt9043)
					class176_sub1_1942_.anIntArray9053 = class176_sub1_1943_.anIntArray9053 = new int[anInt9043];
				else
					class176_sub1_1942_.anIntArray9053 = class176_sub1_1943_.anIntArray9053;
			} else
				class176_sub1_1942_.anIntArray9053 = anIntArray9053;
			if (bool_1946_) {
				if (class176_sub1_1943_.anIntArray9046 == null || class176_sub1_1943_.anIntArray9046.length < anInt9043)
					class176_sub1_1942_.anIntArray9046 = class176_sub1_1943_.anIntArray9046 = new int[anInt9043];
				else
					class176_sub1_1942_.anIntArray9046 = class176_sub1_1943_.anIntArray9046;
			} else
				class176_sub1_1942_.anIntArray9046 = anIntArray9046;
			if (bool_1947_) {
				if (class176_sub1_1943_.anIntArray9047 == null || class176_sub1_1943_.anIntArray9047.length < anInt9043)
					class176_sub1_1942_.anIntArray9047 = class176_sub1_1943_.anIntArray9047 = new int[anInt9043];
				else
					class176_sub1_1942_.anIntArray9047 = class176_sub1_1943_.anIntArray9047;
			} else
				class176_sub1_1942_.anIntArray9047 = anIntArray9047;
			for (int i_1949_ = 0; i_1949_ < anInt9043; i_1949_++) {
				if (bool_1945_)
					class176_sub1_1942_.anIntArray9053[i_1949_] = anIntArray9053[i_1949_];
				if (bool_1946_)
					class176_sub1_1942_.anIntArray9046[i_1949_] = anIntArray9046[i_1949_];
				if (bool_1947_)
					class176_sub1_1942_.anIntArray9047[i_1949_] = anIntArray9047[i_1949_];
			}
		} else {
			class176_sub1_1942_.anIntArray9053 = anIntArray9053;
			class176_sub1_1942_.anIntArray9046 = anIntArray9046;
			class176_sub1_1942_.anIntArray9047 = anIntArray9047;
		}
		if (Class134.method2261(i, anInt9037)) {
			if (bool)
				class176_sub1_1942_.aByte9038 |= 0x1;
			class176_sub1_1942_.aClass129_9068 = class176_sub1_1943_.aClass129_9068;
			class176_sub1_1942_.aClass129_9068.aByte1544 = aClass129_9068.aByte1544;
			class176_sub1_1942_.aClass129_9068.anInterface15_1547 = aClass129_9068.anInterface15_1547;
		} else if (Class134.method2215(i, anInt9037))
			class176_sub1_1942_.aClass129_9068 = aClass129_9068;
		else
			class176_sub1_1942_.aClass129_9068 = null;
		if (Class134.method2264(i, anInt9037)) {
			if (class176_sub1_1943_.aShortArray9060 == null || class176_sub1_1943_.aShortArray9060.length < anInt9058)
				class176_sub1_1942_.aShortArray9060 = class176_sub1_1943_.aShortArray9060 = new short[anInt9058];
			else
				class176_sub1_1942_.aShortArray9060 = class176_sub1_1943_.aShortArray9060;
			for (int i_1950_ = 0; i_1950_ < anInt9058; i_1950_++)
				class176_sub1_1942_.aShortArray9060[i_1950_] = aShortArray9060[i_1950_];
		} else
			class176_sub1_1942_.aShortArray9060 = aShortArray9060;
		if (Class134.method2192(i, anInt9037)) {
			if (class176_sub1_1943_.aByteArray9061 == null || class176_sub1_1943_.aByteArray9061.length < anInt9058)
				class176_sub1_1942_.aByteArray9061 = class176_sub1_1943_.aByteArray9061 = new byte[anInt9058];
			else
				class176_sub1_1942_.aByteArray9061 = class176_sub1_1943_.aByteArray9061;
			for (int i_1951_ = 0; i_1951_ < anInt9058; i_1951_++)
				class176_sub1_1942_.aByteArray9061[i_1951_] = aByteArray9061[i_1951_];
		} else
			class176_sub1_1942_.aByteArray9061 = aByteArray9061;
		if (Class134.method2260(i, anInt9037)) {
			if (bool)
				class176_sub1_1942_.aByte9038 |= 0x2;
			class176_sub1_1942_.aClass129_9069 = class176_sub1_1943_.aClass129_9069;
			class176_sub1_1942_.aClass129_9069.aByte1544 = aClass129_9069.aByte1544;
			class176_sub1_1942_.aClass129_9069.anInterface15_1547 = aClass129_9069.anInterface15_1547;
		} else if (Class134.method2200(i, anInt9037))
			class176_sub1_1942_.aClass129_9069 = aClass129_9069;
		else
			class176_sub1_1942_.aClass129_9069 = null;
		if (Class134.method2190(i, anInt9037)) {
			if (class176_sub1_1943_.aShortArray9092 == null || class176_sub1_1943_.aShortArray9092.length < anInt9059) {
				int i_1952_ = anInt9059;
				class176_sub1_1942_.aShortArray9092 = class176_sub1_1943_.aShortArray9092 = new short[i_1952_];
				class176_sub1_1942_.aShortArray9052 = class176_sub1_1943_.aShortArray9052 = new short[i_1952_];
				class176_sub1_1942_.aShortArray9029 = class176_sub1_1943_.aShortArray9029 = new short[i_1952_];
			} else {
				class176_sub1_1942_.aShortArray9092 = class176_sub1_1943_.aShortArray9092;
				class176_sub1_1942_.aShortArray9052 = class176_sub1_1943_.aShortArray9052;
				class176_sub1_1942_.aShortArray9029 = class176_sub1_1943_.aShortArray9029;
			}
			if (aClass158_9041 != null) {
				if (class176_sub1_1943_.aClass158_9041 == null)
					class176_sub1_1943_.aClass158_9041 = new Class158();
				Class158 class158 = (class176_sub1_1942_.aClass158_9041 = class176_sub1_1943_.aClass158_9041);
				if (class158.aShortArray1735 == null || class158.aShortArray1735.length < anInt9059) {
					int i_1953_ = anInt9059;
					class158.aShortArray1735 = new short[i_1953_];
					class158.aShortArray1737 = new short[i_1953_];
					class158.aShortArray1736 = new short[i_1953_];
					class158.aByteArray1734 = new byte[i_1953_];
				}
				for (int i_1954_ = 0; i_1954_ < anInt9059; i_1954_++) {
					class176_sub1_1942_.aShortArray9092[i_1954_] = aShortArray9092[i_1954_];
					class176_sub1_1942_.aShortArray9052[i_1954_] = aShortArray9052[i_1954_];
					class176_sub1_1942_.aShortArray9029[i_1954_] = aShortArray9029[i_1954_];
					class158.aShortArray1735[i_1954_] = aClass158_9041.aShortArray1735[i_1954_];
					class158.aShortArray1737[i_1954_] = aClass158_9041.aShortArray1737[i_1954_];
					class158.aShortArray1736[i_1954_] = aClass158_9041.aShortArray1736[i_1954_];
					class158.aByteArray1734[i_1954_] = aClass158_9041.aByteArray1734[i_1954_];
				}
			} else {
				for (int i_1955_ = 0; i_1955_ < anInt9059; i_1955_++) {
					class176_sub1_1942_.aShortArray9092[i_1955_] = aShortArray9092[i_1955_];
					class176_sub1_1942_.aShortArray9052[i_1955_] = aShortArray9052[i_1955_];
					class176_sub1_1942_.aShortArray9029[i_1955_] = aShortArray9029[i_1955_];
				}
			}
			class176_sub1_1942_.aByteArray9091 = aByteArray9091;
		} else {
			class176_sub1_1942_.aClass158_9041 = aClass158_9041;
			class176_sub1_1942_.aShortArray9092 = aShortArray9092;
			class176_sub1_1942_.aShortArray9052 = aShortArray9052;
			class176_sub1_1942_.aShortArray9029 = aShortArray9029;
			class176_sub1_1942_.aByteArray9091 = aByteArray9091;
		}
		if (Class134.method2243(i, anInt9037)) {
			if (bool)
				class176_sub1_1942_.aByte9038 |= 0x4;
			class176_sub1_1942_.aClass129_9070 = class176_sub1_1943_.aClass129_9070;
			class176_sub1_1942_.aClass129_9070.aByte1544 = aClass129_9070.aByte1544;
			class176_sub1_1942_.aClass129_9070.anInterface15_1547 = aClass129_9070.anInterface15_1547;
		} else if (Class134.method2257(i, anInt9037))
			class176_sub1_1942_.aClass129_9070 = aClass129_9070;
		else
			class176_sub1_1942_.aClass129_9070 = null;
		if (Class134.method2287(i, anInt9037)) {
			if (class176_sub1_1943_.aFloatArray9056 == null || class176_sub1_1943_.aFloatArray9056.length < anInt9058) {
				int i_1956_ = anInt9059;
				class176_sub1_1942_.aFloatArray9056 = class176_sub1_1943_.aFloatArray9056 = new float[i_1956_];
				class176_sub1_1942_.aFloatArray9085 = class176_sub1_1943_.aFloatArray9085 = new float[i_1956_];
			} else {
				class176_sub1_1942_.aFloatArray9056 = class176_sub1_1943_.aFloatArray9056;
				class176_sub1_1942_.aFloatArray9085 = class176_sub1_1943_.aFloatArray9085;
			}
			for (int i_1957_ = 0; i_1957_ < anInt9059; i_1957_++) {
				class176_sub1_1942_.aFloatArray9056[i_1957_] = aFloatArray9056[i_1957_];
				class176_sub1_1942_.aFloatArray9085[i_1957_] = aFloatArray9085[i_1957_];
			}
		} else {
			class176_sub1_1942_.aFloatArray9056 = aFloatArray9056;
			class176_sub1_1942_.aFloatArray9085 = aFloatArray9085;
		}
		if (Class134.method2206(i, anInt9037)) {
			if (bool)
				class176_sub1_1942_.aByte9038 |= 0x8;
			class176_sub1_1942_.aClass129_9071 = class176_sub1_1943_.aClass129_9071;
			class176_sub1_1942_.aClass129_9071.aByte1544 = aClass129_9071.aByte1544;
			class176_sub1_1942_.aClass129_9071.anInterface15_1547 = aClass129_9071.anInterface15_1547;
		} else if (Class134.method2201(i, anInt9037))
			class176_sub1_1942_.aClass129_9071 = aClass129_9071;
		else
			class176_sub1_1942_.aClass129_9071 = null;
		if (Class134.method2194(i, anInt9037)) {
			if (class176_sub1_1943_.aShortArray9062 == null || class176_sub1_1943_.aShortArray9062.length < anInt9058) {
				int i_1958_ = anInt9058;
				class176_sub1_1942_.aShortArray9062 = class176_sub1_1943_.aShortArray9062 = new short[i_1958_];
				class176_sub1_1942_.aShortArray9055 = class176_sub1_1943_.aShortArray9055 = new short[i_1958_];
				class176_sub1_1942_.aShortArray9050 = class176_sub1_1943_.aShortArray9050 = new short[i_1958_];
			} else {
				class176_sub1_1942_.aShortArray9062 = class176_sub1_1943_.aShortArray9062;
				class176_sub1_1942_.aShortArray9055 = class176_sub1_1943_.aShortArray9055;
				class176_sub1_1942_.aShortArray9050 = class176_sub1_1943_.aShortArray9050;
			}
			for (int i_1959_ = 0; i_1959_ < anInt9058; i_1959_++) {
				class176_sub1_1942_.aShortArray9062[i_1959_] = aShortArray9062[i_1959_];
				class176_sub1_1942_.aShortArray9055[i_1959_] = aShortArray9055[i_1959_];
				class176_sub1_1942_.aShortArray9050[i_1959_] = aShortArray9050[i_1959_];
			}
		} else {
			class176_sub1_1942_.aShortArray9062 = aShortArray9062;
			class176_sub1_1942_.aShortArray9055 = aShortArray9055;
			class176_sub1_1942_.aShortArray9050 = aShortArray9050;
		}
		if (Class134.method2275(i, anInt9037)) {
			if (bool)
				class176_sub1_1942_.aByte9038 |= 0x10;
			class176_sub1_1942_.aClass132_9072 = class176_sub1_1943_.aClass132_9072;
			class176_sub1_1942_.aClass132_9072.anInterface17_1556 = aClass132_9072.anInterface17_1556;
		} else if (Class134.method2202(i, anInt9037))
			class176_sub1_1942_.aClass132_9072 = aClass132_9072;
		else
			class176_sub1_1942_.aClass132_9072 = null;
		if (Class134.method2251(i, anInt9037)) {
			if (class176_sub1_1943_.aShortArray9065 == null || class176_sub1_1943_.aShortArray9065.length < anInt9058) {
				int i_1960_ = anInt9058;
				class176_sub1_1942_.aShortArray9065 = class176_sub1_1943_.aShortArray9065 = new short[i_1960_];
			} else
				class176_sub1_1942_.aShortArray9065 = class176_sub1_1943_.aShortArray9065;
			for (int i_1961_ = 0; i_1961_ < anInt9058; i_1961_++)
				class176_sub1_1942_.aShortArray9065[i_1961_] = aShortArray9065[i_1961_];
		} else
			class176_sub1_1942_.aShortArray9065 = aShortArray9065;
		if (Class134.method2209(i, anInt9037)) {
			if (class176_sub1_1943_.aClass130Array9094 == null || class176_sub1_1943_.aClass130Array9094.length < anInt9075) {
				int i_1962_ = anInt9075;
				class176_sub1_1942_.aClass130Array9094 = class176_sub1_1943_.aClass130Array9094 = new Class130[i_1962_];
				for (int i_1963_ = 0; i_1963_ < anInt9075; i_1963_++)
					class176_sub1_1942_.aClass130Array9094[i_1963_] = aClass130Array9094[i_1963_].method2176();
			} else {
				class176_sub1_1942_.aClass130Array9094 = class176_sub1_1943_.aClass130Array9094;
				for (int i_1964_ = 0; i_1964_ < anInt9075; i_1964_++)
					class176_sub1_1942_.aClass130Array9094[i_1964_].method2177(aClass130Array9094[i_1964_]);
			}
		} else
			class176_sub1_1942_.aClass130Array9094 = aClass130Array9094;
		class176_sub1_1942_.aClass150Array9093 = aClass150Array9093;
		if (aBool9078) {
			class176_sub1_1942_.anInt9074 = anInt9074;
			class176_sub1_1942_.anInt9051 = anInt9051;
			class176_sub1_1942_.aShort9081 = aShort9081;
			class176_sub1_1942_.aShort9082 = aShort9082;
			class176_sub1_1942_.aShort9040 = aShort9040;
			class176_sub1_1942_.aShort9080 = aShort9080;
			class176_sub1_1942_.aShort9054 = aShort9054;
			class176_sub1_1942_.aShort9076 = aShort9076;
			class176_sub1_1942_.aBool9078 = true;
		} else
			class176_sub1_1942_.aBool9078 = false;
		if (aBool9063) {
			class176_sub1_1942_.aShort9086 = aShort9086;
			class176_sub1_1942_.aBool9063 = true;
		} else
			class176_sub1_1942_.aBool9063 = false;
		class176_sub1_1942_.anIntArrayArray9048 = anIntArrayArray9048;
		class176_sub1_1942_.anIntArrayArray9042 = anIntArrayArray9042;
		class176_sub1_1942_.anIntArrayArray9028 = anIntArrayArray9028;
		class176_sub1_1942_.aShortArray9089 = aShortArray9089;
		class176_sub1_1942_.anIntArray9088 = anIntArray9088;
		class176_sub1_1942_.aShortArray9049 = aShortArray9049;
		class176_sub1_1942_.aShortArray9067 = aShortArray9067;
		class176_sub1_1942_.anIntArray9087 = anIntArray9087;
		class176_sub1_1942_.aClass167Array9090 = aClass167Array9090;
		class176_sub1_1942_.aClass159Array9045 = aClass159Array9045;
		return class176_sub1_1942_;
	}

	Class176 method14567(Class176_Sub1 class176_sub1_1965_, Class176_Sub1 class176_sub1_1966_, int i, boolean bool, boolean bool_1967_) {
		class176_sub1_1965_.aByte9038 = (byte) 0;
		class176_sub1_1965_.anInt9036 = i;
		class176_sub1_1965_.anInt9037 = anInt9037;
		class176_sub1_1965_.aShort9039 = aShort9039;
		class176_sub1_1965_.aShort9095 = aShort9095;
		class176_sub1_1965_.anInt9043 = anInt9043;
		class176_sub1_1965_.anInt9064 = anInt9064;
		class176_sub1_1965_.anInt9059 = anInt9059;
		class176_sub1_1965_.anInt9058 = anInt9058;
		class176_sub1_1965_.anInt9079 = anInt9079;
		class176_sub1_1965_.anInt9075 = anInt9075;
		if ((i & 0x100) != 0)
			class176_sub1_1965_.aBool9057 = true;
		else
			class176_sub1_1965_.aBool9057 = aBool9057;
		class176_sub1_1965_.aBool9096 = aBool9096;
		boolean bool_1968_ = Class134.method2186(i, anInt9037);
		boolean bool_1969_ = Class134.method2187(i, anInt9037);
		boolean bool_1970_ = Class134.method2229(i, anInt9037);
		boolean bool_1971_ = bool_1968_ | bool_1969_ | bool_1970_;
		if (bool_1971_) {
			if (bool_1968_) {
				if (class176_sub1_1966_.anIntArray9053 == null || class176_sub1_1966_.anIntArray9053.length < anInt9043)
					class176_sub1_1965_.anIntArray9053 = class176_sub1_1966_.anIntArray9053 = new int[anInt9043];
				else
					class176_sub1_1965_.anIntArray9053 = class176_sub1_1966_.anIntArray9053;
			} else
				class176_sub1_1965_.anIntArray9053 = anIntArray9053;
			if (bool_1969_) {
				if (class176_sub1_1966_.anIntArray9046 == null || class176_sub1_1966_.anIntArray9046.length < anInt9043)
					class176_sub1_1965_.anIntArray9046 = class176_sub1_1966_.anIntArray9046 = new int[anInt9043];
				else
					class176_sub1_1965_.anIntArray9046 = class176_sub1_1966_.anIntArray9046;
			} else
				class176_sub1_1965_.anIntArray9046 = anIntArray9046;
			if (bool_1970_) {
				if (class176_sub1_1966_.anIntArray9047 == null || class176_sub1_1966_.anIntArray9047.length < anInt9043)
					class176_sub1_1965_.anIntArray9047 = class176_sub1_1966_.anIntArray9047 = new int[anInt9043];
				else
					class176_sub1_1965_.anIntArray9047 = class176_sub1_1966_.anIntArray9047;
			} else
				class176_sub1_1965_.anIntArray9047 = anIntArray9047;
			for (int i_1972_ = 0; i_1972_ < anInt9043; i_1972_++) {
				if (bool_1968_)
					class176_sub1_1965_.anIntArray9053[i_1972_] = anIntArray9053[i_1972_];
				if (bool_1969_)
					class176_sub1_1965_.anIntArray9046[i_1972_] = anIntArray9046[i_1972_];
				if (bool_1970_)
					class176_sub1_1965_.anIntArray9047[i_1972_] = anIntArray9047[i_1972_];
			}
		} else {
			class176_sub1_1965_.anIntArray9053 = anIntArray9053;
			class176_sub1_1965_.anIntArray9046 = anIntArray9046;
			class176_sub1_1965_.anIntArray9047 = anIntArray9047;
		}
		if (Class134.method2261(i, anInt9037)) {
			if (bool)
				class176_sub1_1965_.aByte9038 |= 0x1;
			class176_sub1_1965_.aClass129_9068 = class176_sub1_1966_.aClass129_9068;
			class176_sub1_1965_.aClass129_9068.aByte1544 = aClass129_9068.aByte1544;
			class176_sub1_1965_.aClass129_9068.anInterface15_1547 = aClass129_9068.anInterface15_1547;
		} else if (Class134.method2215(i, anInt9037))
			class176_sub1_1965_.aClass129_9068 = aClass129_9068;
		else
			class176_sub1_1965_.aClass129_9068 = null;
		if (Class134.method2264(i, anInt9037)) {
			if (class176_sub1_1966_.aShortArray9060 == null || class176_sub1_1966_.aShortArray9060.length < anInt9058)
				class176_sub1_1965_.aShortArray9060 = class176_sub1_1966_.aShortArray9060 = new short[anInt9058];
			else
				class176_sub1_1965_.aShortArray9060 = class176_sub1_1966_.aShortArray9060;
			for (int i_1973_ = 0; i_1973_ < anInt9058; i_1973_++)
				class176_sub1_1965_.aShortArray9060[i_1973_] = aShortArray9060[i_1973_];
		} else
			class176_sub1_1965_.aShortArray9060 = aShortArray9060;
		if (Class134.method2192(i, anInt9037)) {
			if (class176_sub1_1966_.aByteArray9061 == null || class176_sub1_1966_.aByteArray9061.length < anInt9058)
				class176_sub1_1965_.aByteArray9061 = class176_sub1_1966_.aByteArray9061 = new byte[anInt9058];
			else
				class176_sub1_1965_.aByteArray9061 = class176_sub1_1966_.aByteArray9061;
			for (int i_1974_ = 0; i_1974_ < anInt9058; i_1974_++)
				class176_sub1_1965_.aByteArray9061[i_1974_] = aByteArray9061[i_1974_];
		} else
			class176_sub1_1965_.aByteArray9061 = aByteArray9061;
		if (Class134.method2260(i, anInt9037)) {
			if (bool)
				class176_sub1_1965_.aByte9038 |= 0x2;
			class176_sub1_1965_.aClass129_9069 = class176_sub1_1966_.aClass129_9069;
			class176_sub1_1965_.aClass129_9069.aByte1544 = aClass129_9069.aByte1544;
			class176_sub1_1965_.aClass129_9069.anInterface15_1547 = aClass129_9069.anInterface15_1547;
		} else if (Class134.method2200(i, anInt9037))
			class176_sub1_1965_.aClass129_9069 = aClass129_9069;
		else
			class176_sub1_1965_.aClass129_9069 = null;
		if (Class134.method2190(i, anInt9037)) {
			if (class176_sub1_1966_.aShortArray9092 == null || class176_sub1_1966_.aShortArray9092.length < anInt9059) {
				int i_1975_ = anInt9059;
				class176_sub1_1965_.aShortArray9092 = class176_sub1_1966_.aShortArray9092 = new short[i_1975_];
				class176_sub1_1965_.aShortArray9052 = class176_sub1_1966_.aShortArray9052 = new short[i_1975_];
				class176_sub1_1965_.aShortArray9029 = class176_sub1_1966_.aShortArray9029 = new short[i_1975_];
			} else {
				class176_sub1_1965_.aShortArray9092 = class176_sub1_1966_.aShortArray9092;
				class176_sub1_1965_.aShortArray9052 = class176_sub1_1966_.aShortArray9052;
				class176_sub1_1965_.aShortArray9029 = class176_sub1_1966_.aShortArray9029;
			}
			if (aClass158_9041 != null) {
				if (class176_sub1_1966_.aClass158_9041 == null)
					class176_sub1_1966_.aClass158_9041 = new Class158();
				Class158 class158 = (class176_sub1_1965_.aClass158_9041 = class176_sub1_1966_.aClass158_9041);
				if (class158.aShortArray1735 == null || class158.aShortArray1735.length < anInt9059) {
					int i_1976_ = anInt9059;
					class158.aShortArray1735 = new short[i_1976_];
					class158.aShortArray1737 = new short[i_1976_];
					class158.aShortArray1736 = new short[i_1976_];
					class158.aByteArray1734 = new byte[i_1976_];
				}
				for (int i_1977_ = 0; i_1977_ < anInt9059; i_1977_++) {
					class176_sub1_1965_.aShortArray9092[i_1977_] = aShortArray9092[i_1977_];
					class176_sub1_1965_.aShortArray9052[i_1977_] = aShortArray9052[i_1977_];
					class176_sub1_1965_.aShortArray9029[i_1977_] = aShortArray9029[i_1977_];
					class158.aShortArray1735[i_1977_] = aClass158_9041.aShortArray1735[i_1977_];
					class158.aShortArray1737[i_1977_] = aClass158_9041.aShortArray1737[i_1977_];
					class158.aShortArray1736[i_1977_] = aClass158_9041.aShortArray1736[i_1977_];
					class158.aByteArray1734[i_1977_] = aClass158_9041.aByteArray1734[i_1977_];
				}
			} else {
				for (int i_1978_ = 0; i_1978_ < anInt9059; i_1978_++) {
					class176_sub1_1965_.aShortArray9092[i_1978_] = aShortArray9092[i_1978_];
					class176_sub1_1965_.aShortArray9052[i_1978_] = aShortArray9052[i_1978_];
					class176_sub1_1965_.aShortArray9029[i_1978_] = aShortArray9029[i_1978_];
				}
			}
			class176_sub1_1965_.aByteArray9091 = aByteArray9091;
		} else {
			class176_sub1_1965_.aClass158_9041 = aClass158_9041;
			class176_sub1_1965_.aShortArray9092 = aShortArray9092;
			class176_sub1_1965_.aShortArray9052 = aShortArray9052;
			class176_sub1_1965_.aShortArray9029 = aShortArray9029;
			class176_sub1_1965_.aByteArray9091 = aByteArray9091;
		}
		if (Class134.method2243(i, anInt9037)) {
			if (bool)
				class176_sub1_1965_.aByte9038 |= 0x4;
			class176_sub1_1965_.aClass129_9070 = class176_sub1_1966_.aClass129_9070;
			class176_sub1_1965_.aClass129_9070.aByte1544 = aClass129_9070.aByte1544;
			class176_sub1_1965_.aClass129_9070.anInterface15_1547 = aClass129_9070.anInterface15_1547;
		} else if (Class134.method2257(i, anInt9037))
			class176_sub1_1965_.aClass129_9070 = aClass129_9070;
		else
			class176_sub1_1965_.aClass129_9070 = null;
		if (Class134.method2287(i, anInt9037)) {
			if (class176_sub1_1966_.aFloatArray9056 == null || class176_sub1_1966_.aFloatArray9056.length < anInt9058) {
				int i_1979_ = anInt9059;
				class176_sub1_1965_.aFloatArray9056 = class176_sub1_1966_.aFloatArray9056 = new float[i_1979_];
				class176_sub1_1965_.aFloatArray9085 = class176_sub1_1966_.aFloatArray9085 = new float[i_1979_];
			} else {
				class176_sub1_1965_.aFloatArray9056 = class176_sub1_1966_.aFloatArray9056;
				class176_sub1_1965_.aFloatArray9085 = class176_sub1_1966_.aFloatArray9085;
			}
			for (int i_1980_ = 0; i_1980_ < anInt9059; i_1980_++) {
				class176_sub1_1965_.aFloatArray9056[i_1980_] = aFloatArray9056[i_1980_];
				class176_sub1_1965_.aFloatArray9085[i_1980_] = aFloatArray9085[i_1980_];
			}
		} else {
			class176_sub1_1965_.aFloatArray9056 = aFloatArray9056;
			class176_sub1_1965_.aFloatArray9085 = aFloatArray9085;
		}
		if (Class134.method2206(i, anInt9037)) {
			if (bool)
				class176_sub1_1965_.aByte9038 |= 0x8;
			class176_sub1_1965_.aClass129_9071 = class176_sub1_1966_.aClass129_9071;
			class176_sub1_1965_.aClass129_9071.aByte1544 = aClass129_9071.aByte1544;
			class176_sub1_1965_.aClass129_9071.anInterface15_1547 = aClass129_9071.anInterface15_1547;
		} else if (Class134.method2201(i, anInt9037))
			class176_sub1_1965_.aClass129_9071 = aClass129_9071;
		else
			class176_sub1_1965_.aClass129_9071 = null;
		if (Class134.method2194(i, anInt9037)) {
			if (class176_sub1_1966_.aShortArray9062 == null || class176_sub1_1966_.aShortArray9062.length < anInt9058) {
				int i_1981_ = anInt9058;
				class176_sub1_1965_.aShortArray9062 = class176_sub1_1966_.aShortArray9062 = new short[i_1981_];
				class176_sub1_1965_.aShortArray9055 = class176_sub1_1966_.aShortArray9055 = new short[i_1981_];
				class176_sub1_1965_.aShortArray9050 = class176_sub1_1966_.aShortArray9050 = new short[i_1981_];
			} else {
				class176_sub1_1965_.aShortArray9062 = class176_sub1_1966_.aShortArray9062;
				class176_sub1_1965_.aShortArray9055 = class176_sub1_1966_.aShortArray9055;
				class176_sub1_1965_.aShortArray9050 = class176_sub1_1966_.aShortArray9050;
			}
			for (int i_1982_ = 0; i_1982_ < anInt9058; i_1982_++) {
				class176_sub1_1965_.aShortArray9062[i_1982_] = aShortArray9062[i_1982_];
				class176_sub1_1965_.aShortArray9055[i_1982_] = aShortArray9055[i_1982_];
				class176_sub1_1965_.aShortArray9050[i_1982_] = aShortArray9050[i_1982_];
			}
		} else {
			class176_sub1_1965_.aShortArray9062 = aShortArray9062;
			class176_sub1_1965_.aShortArray9055 = aShortArray9055;
			class176_sub1_1965_.aShortArray9050 = aShortArray9050;
		}
		if (Class134.method2275(i, anInt9037)) {
			if (bool)
				class176_sub1_1965_.aByte9038 |= 0x10;
			class176_sub1_1965_.aClass132_9072 = class176_sub1_1966_.aClass132_9072;
			class176_sub1_1965_.aClass132_9072.anInterface17_1556 = aClass132_9072.anInterface17_1556;
		} else if (Class134.method2202(i, anInt9037))
			class176_sub1_1965_.aClass132_9072 = aClass132_9072;
		else
			class176_sub1_1965_.aClass132_9072 = null;
		if (Class134.method2251(i, anInt9037)) {
			if (class176_sub1_1966_.aShortArray9065 == null || class176_sub1_1966_.aShortArray9065.length < anInt9058) {
				int i_1983_ = anInt9058;
				class176_sub1_1965_.aShortArray9065 = class176_sub1_1966_.aShortArray9065 = new short[i_1983_];
			} else
				class176_sub1_1965_.aShortArray9065 = class176_sub1_1966_.aShortArray9065;
			for (int i_1984_ = 0; i_1984_ < anInt9058; i_1984_++)
				class176_sub1_1965_.aShortArray9065[i_1984_] = aShortArray9065[i_1984_];
		} else
			class176_sub1_1965_.aShortArray9065 = aShortArray9065;
		if (Class134.method2209(i, anInt9037)) {
			if (class176_sub1_1966_.aClass130Array9094 == null || class176_sub1_1966_.aClass130Array9094.length < anInt9075) {
				int i_1985_ = anInt9075;
				class176_sub1_1965_.aClass130Array9094 = class176_sub1_1966_.aClass130Array9094 = new Class130[i_1985_];
				for (int i_1986_ = 0; i_1986_ < anInt9075; i_1986_++)
					class176_sub1_1965_.aClass130Array9094[i_1986_] = aClass130Array9094[i_1986_].method2176();
			} else {
				class176_sub1_1965_.aClass130Array9094 = class176_sub1_1966_.aClass130Array9094;
				for (int i_1987_ = 0; i_1987_ < anInt9075; i_1987_++)
					class176_sub1_1965_.aClass130Array9094[i_1987_].method2177(aClass130Array9094[i_1987_]);
			}
		} else
			class176_sub1_1965_.aClass130Array9094 = aClass130Array9094;
		class176_sub1_1965_.aClass150Array9093 = aClass150Array9093;
		if (aBool9078) {
			class176_sub1_1965_.anInt9074 = anInt9074;
			class176_sub1_1965_.anInt9051 = anInt9051;
			class176_sub1_1965_.aShort9081 = aShort9081;
			class176_sub1_1965_.aShort9082 = aShort9082;
			class176_sub1_1965_.aShort9040 = aShort9040;
			class176_sub1_1965_.aShort9080 = aShort9080;
			class176_sub1_1965_.aShort9054 = aShort9054;
			class176_sub1_1965_.aShort9076 = aShort9076;
			class176_sub1_1965_.aBool9078 = true;
		} else
			class176_sub1_1965_.aBool9078 = false;
		if (aBool9063) {
			class176_sub1_1965_.aShort9086 = aShort9086;
			class176_sub1_1965_.aBool9063 = true;
		} else
			class176_sub1_1965_.aBool9063 = false;
		class176_sub1_1965_.anIntArrayArray9048 = anIntArrayArray9048;
		class176_sub1_1965_.anIntArrayArray9042 = anIntArrayArray9042;
		class176_sub1_1965_.anIntArrayArray9028 = anIntArrayArray9028;
		class176_sub1_1965_.aShortArray9089 = aShortArray9089;
		class176_sub1_1965_.anIntArray9088 = anIntArray9088;
		class176_sub1_1965_.aShortArray9049 = aShortArray9049;
		class176_sub1_1965_.aShortArray9067 = aShortArray9067;
		class176_sub1_1965_.anIntArray9087 = anIntArray9087;
		class176_sub1_1965_.aClass167Array9090 = aClass167Array9090;
		class176_sub1_1965_.aClass159Array9045 = aClass159Array9045;
		return class176_sub1_1965_;
	}

	public int method2874() {
		return anInt9036;
	}

	void method14568() {
		if (aBool9073) {
			aBool9073 = false;
			if (aClass167Array9090 == null && aClass159Array9045 == null && aClass150Array9093 == null && !Class134.method2189(anInt9036, anInt9037)) {
				boolean bool = false;
				boolean bool_1988_ = false;
				boolean bool_1989_ = false;
				if (anIntArray9053 != null && !Class134.method2208(anInt9036, anInt9037)) {
					if (aClass129_9068 == null || aClass129_9068.anInterface15_1547 != null) {
						if (!aBool9078)
							method14542();
						bool = true;
					} else
						aBool9073 = true;
				}
				if (anIntArray9046 != null && !Class134.method2279(anInt9036, anInt9037)) {
					if (aClass129_9068 == null || aClass129_9068.anInterface15_1547 != null) {
						if (!aBool9078)
							method14542();
						bool_1988_ = true;
					} else
						aBool9073 = true;
				}
				if (anIntArray9047 != null && !Class134.method2210(anInt9036, anInt9037)) {
					if (aClass129_9068 == null || aClass129_9068.anInterface15_1547 != null) {
						if (!aBool9078)
							method14542();
						bool_1989_ = true;
					} else
						aBool9073 = true;
				}
				if (bool)
					anIntArray9053 = null;
				if (bool_1988_)
					anIntArray9046 = null;
				if (bool_1989_)
					anIntArray9047 = null;
			}
			if (aShortArray9089 != null && anIntArray9053 == null && anIntArray9046 == null && anIntArray9047 == null) {
				aShortArray9089 = null;
				anIntArray9088 = null;
			}
			if (aByteArray9091 != null && !Class134.method2211(anInt9036, anInt9037)) {
				if (aClass129_9070 != null) {
					if (aClass129_9070.anInterface15_1547 != null) {
						aShortArray9029 = null;
						aShortArray9052 = null;
						aShortArray9092 = null;
						aByteArray9091 = null;
					} else
						aBool9073 = true;
				} else if (aClass129_9069 == null || aClass129_9069.anInterface15_1547 != null) {
					aShortArray9029 = null;
					aShortArray9052 = null;
					aShortArray9092 = null;
					aByteArray9091 = null;
				} else
					aBool9073 = true;
			}
			if (aShortArray9060 != null && !Class134.method2212(anInt9036, anInt9037)) {
				if (aClass129_9069 == null || aClass129_9069.anInterface15_1547 != null)
					aShortArray9060 = null;
				else
					aBool9073 = true;
			}
			if (aByteArray9061 != null && !Class134.method2213(anInt9036, anInt9037)) {
				if (aClass129_9069 == null || aClass129_9069.anInterface15_1547 != null)
					aByteArray9061 = null;
				else
					aBool9073 = true;
			}
			if (aFloatArray9056 != null && !Class134.method2214(anInt9036, anInt9037)) {
				if (aClass129_9071 == null || aClass129_9071.anInterface15_1547 != null) {
					aFloatArray9085 = null;
					aFloatArray9056 = null;
				} else
					aBool9073 = true;
			}
			if (aShortArray9065 != null && !Class134.method2219(anInt9036, anInt9037)) {
				if (aClass129_9069 == null || aClass129_9069.anInterface15_1547 != null)
					aShortArray9065 = null;
				else
					aBool9073 = true;
			}
			if (aShortArray9062 != null && !Class134.method2218(anInt9036, anInt9037)) {
				if ((aClass132_9072 == null || aClass132_9072.anInterface17_1556 != null) && (aClass129_9069 == null || aClass129_9069.anInterface15_1547 != null)) {
					aShortArray9050 = null;
					aShortArray9055 = null;
					aShortArray9062 = null;
				} else
					aBool9073 = true;
			}
			if (anIntArrayArray9042 != null && !Class134.method2267(anInt9036, anInt9037)) {
				anIntArrayArray9042 = null;
				aShortArray9067 = null;
			}
			if (anIntArrayArray9048 != null && !Class134.method2216(anInt9036, anInt9037)) {
				anIntArrayArray9048 = null;
				aShortArray9049 = null;
			}
			if (anIntArrayArray9028 != null && !Class134.method2217(anInt9036, anInt9037))
				anIntArrayArray9028 = null;
			if (anIntArray9087 != null && (anInt9036 & 0x800) == 0 && (anInt9036 & 0x40000) == 0)
				anIntArray9087 = null;
		}
	}

	public void method3016() {
		for (int i = 0; i < anInt9064; i++)
			anIntArray9047[i] = -anIntArray9047[i];
		for (int i = 0; i < anInt9059; i++)
			aShortArray9029[i] = (short) -aShortArray9029[i];
		for (int i = 0; i < anInt9058; i++) {
			short i_1990_ = aShortArray9062[i];
			aShortArray9062[i] = aShortArray9050[i];
			aShortArray9050[i] = i_1990_;
		}
		if (aClass129_9070 == null && aClass129_9069 != null)
			aClass129_9069.anInterface15_1547 = null;
		if (aClass129_9070 != null)
			aClass129_9070.anInterface15_1547 = null;
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		if (aClass132_9072 != null)
			aClass132_9072.anInterface17_1556 = null;
		aBool9078 = false;
	}

	public void method2918(Class176 class176, int i, int i_1991_, int i_1992_, boolean bool) {
		Class176_Sub1 class176_sub1_1993_ = (Class176_Sub1) class176;
		if (anInt9058 != 0 && class176_sub1_1993_.anInt9058 != 0) {
			int i_1994_ = class176_sub1_1993_.anInt9064;
			int[] is = class176_sub1_1993_.anIntArray9053;
			int[] is_1995_ = class176_sub1_1993_.anIntArray9046;
			int[] is_1996_ = class176_sub1_1993_.anIntArray9047;
			short[] is_1997_ = class176_sub1_1993_.aShortArray9092;
			short[] is_1998_ = class176_sub1_1993_.aShortArray9052;
			short[] is_1999_ = class176_sub1_1993_.aShortArray9029;
			byte[] is_2000_ = class176_sub1_1993_.aByteArray9091;
			short[] is_2001_;
			short[] is_2002_;
			short[] is_2003_;
			byte[] is_2004_;
			if (aClass158_9041 != null) {
				is_2001_ = aClass158_9041.aShortArray1735;
				is_2002_ = aClass158_9041.aShortArray1737;
				is_2003_ = aClass158_9041.aShortArray1736;
				is_2004_ = aClass158_9041.aByteArray1734;
			} else {
				is_2001_ = null;
				is_2002_ = null;
				is_2003_ = null;
				is_2004_ = null;
			}
			short[] is_2005_;
			short[] is_2006_;
			short[] is_2007_;
			byte[] is_2008_;
			if (class176_sub1_1993_.aClass158_9041 != null) {
				is_2005_ = class176_sub1_1993_.aClass158_9041.aShortArray1735;
				is_2006_ = class176_sub1_1993_.aClass158_9041.aShortArray1737;
				is_2007_ = class176_sub1_1993_.aClass158_9041.aShortArray1736;
				is_2008_ = class176_sub1_1993_.aClass158_9041.aByteArray1734;
			} else {
				is_2005_ = null;
				is_2006_ = null;
				is_2007_ = null;
				is_2008_ = null;
			}
			int[] is_2009_ = class176_sub1_1993_.anIntArray9088;
			short[] is_2010_ = class176_sub1_1993_.aShortArray9089;
			if (!class176_sub1_1993_.aBool9078)
				class176_sub1_1993_.method14542();
			int i_2011_ = class176_sub1_1993_.aShort9040;
			int i_2012_ = class176_sub1_1993_.aShort9080;
			int i_2013_ = class176_sub1_1993_.aShort9081;
			int i_2014_ = class176_sub1_1993_.aShort9082;
			int i_2015_ = class176_sub1_1993_.aShort9054;
			int i_2016_ = class176_sub1_1993_.aShort9076;
			for (int i_2017_ = 0; i_2017_ < anInt9064; i_2017_++) {
				int i_2018_ = anIntArray9046[i_2017_] - i_1991_;
				if (i_2018_ >= i_2011_ && i_2018_ <= i_2012_) {
					int i_2019_ = anIntArray9053[i_2017_] - i;
					if (i_2019_ >= i_2013_ && i_2019_ <= i_2014_) {
						int i_2020_ = anIntArray9047[i_2017_] - i_1992_;
						if (i_2020_ >= i_2015_ && i_2020_ <= i_2016_) {
							int i_2021_ = -1;
							int i_2022_ = anIntArray9088[i_2017_];
							int i_2023_ = anIntArray9088[i_2017_ + 1];
							for (int i_2024_ = i_2022_; (i_2024_ < i_2023_ && aShortArray9089[i_2024_] != 0); i_2024_++) {
								i_2021_ = (aShortArray9089[i_2024_] & 0xffff) - 1;
								if (aByteArray9091[i_2021_] != 0)
									break;
							}
							if (i_2021_ != -1) {
								for (int i_2025_ = 0; i_2025_ < i_1994_; i_2025_++) {
									if (i_2019_ == is[i_2025_] && i_2020_ == is_1996_[i_2025_] && i_2018_ == is_1995_[i_2025_]) {
										int i_2026_ = -1;
										i_2022_ = is_2009_[i_2025_];
										i_2023_ = is_2009_[i_2025_ + 1];
										for (int i_2027_ = i_2022_; (i_2027_ < i_2023_ && is_2010_[i_2027_] != 0); i_2027_++) {
											i_2026_ = (is_2010_[i_2027_] & 0xffff) - 1;
											if (is_2000_[i_2026_] != 0)
												break;
										}
										if (i_2026_ != -1) {
											if (is_2001_ == null) {
												aClass158_9041 = new Class158();
												is_2001_ = aClass158_9041.aShortArray1735 = (Class214.method3900(aShortArray9092, -1740606793));
												is_2002_ = aClass158_9041.aShortArray1737 = (Class214.method3900(aShortArray9052, -1993566295));
												is_2003_ = aClass158_9041.aShortArray1736 = (Class214.method3900(aShortArray9029, -1778434370));
												is_2004_ = aClass158_9041.aByteArray1734 = (Class332.method5837(aByteArray9091, -1725410220));
											}
											if (is_2005_ == null) {
												Class158 class158 = (class176_sub1_1993_.aClass158_9041 = new Class158());
												is_2005_ = class158.aShortArray1735 = (Class214.method3900(is_1997_, -1894221296));
												is_2006_ = class158.aShortArray1737 = (Class214.method3900(is_1998_, -2117003878));
												is_2007_ = class158.aShortArray1736 = (Class214.method3900(is_1999_, -2017902997));
												is_2008_ = class158.aByteArray1734 = (Class332.method5837(is_2000_, 1961784198));
											}
											short i_2028_ = aShortArray9092[i_2021_];
											short i_2029_ = aShortArray9052[i_2021_];
											short i_2030_ = aShortArray9029[i_2021_];
											byte i_2031_ = aByteArray9091[i_2021_];
											i_2022_ = is_2009_[i_2025_];
											i_2023_ = is_2009_[i_2025_ + 1];
											for (int i_2032_ = i_2022_; i_2032_ < i_2023_; i_2032_++) {
												int i_2033_ = is_2010_[i_2032_] - 1;
												if (i_2033_ == -1)
													break;
												if (is_2008_[i_2033_] != 0) {
													is_2005_[i_2033_] += i_2028_;
													is_2006_[i_2033_] += i_2029_;
													is_2007_[i_2033_] += i_2030_;
													is_2008_[i_2033_] += i_2031_;
												}
											}
											i_2028_ = is_1997_[i_2026_];
											i_2029_ = is_1998_[i_2026_];
											i_2030_ = is_1999_[i_2026_];
											i_2031_ = is_2000_[i_2026_];
											i_2022_ = anIntArray9088[i_2017_];
											i_2023_ = anIntArray9088[i_2017_ + 1];
											for (int i_2034_ = i_2022_; (i_2034_ < i_2023_ && (aShortArray9089[i_2034_] != 0)); i_2034_++) {
												int i_2035_ = (aShortArray9089[i_2034_] & 0xffff) - 1;
												if (is_2004_[i_2035_] != 0) {
													is_2001_[i_2035_] += i_2028_;
													is_2002_[i_2035_] += i_2029_;
													is_2003_[i_2035_] += i_2030_;
													is_2004_[i_2035_] += i_2031_;
												}
											}
											if (aClass129_9070 == null && aClass129_9069 != null)
												aClass129_9069.anInterface15_1547 = null;
											if (aClass129_9070 != null)
												aClass129_9070.anInterface15_1547 = null;
											if ((class176_sub1_1993_.aClass129_9070) == null && (class176_sub1_1993_.aClass129_9069) != null)
												class176_sub1_1993_.aClass129_9069.anInterface15_1547 = null;
											if ((class176_sub1_1993_.aClass129_9070) != null)
												class176_sub1_1993_.aClass129_9070.anInterface15_1547 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	void method14569() {
		int i = 32767;
		int i_2036_ = 32767;
		int i_2037_ = 32767;
		int i_2038_ = -32768;
		int i_2039_ = -32768;
		int i_2040_ = -32768;
		int i_2041_ = 0;
		int i_2042_ = 0;
		for (int i_2043_ = 0; i_2043_ < anInt9064; i_2043_++) {
			int i_2044_ = anIntArray9053[i_2043_];
			int i_2045_ = anIntArray9046[i_2043_];
			int i_2046_ = anIntArray9047[i_2043_];
			if (i_2044_ < i)
				i = i_2044_;
			if (i_2044_ > i_2038_)
				i_2038_ = i_2044_;
			if (i_2045_ < i_2036_)
				i_2036_ = i_2045_;
			if (i_2045_ > i_2039_)
				i_2039_ = i_2045_;
			if (i_2046_ < i_2037_)
				i_2037_ = i_2046_;
			if (i_2046_ > i_2040_)
				i_2040_ = i_2046_;
			int i_2047_ = i_2044_ * i_2044_ + i_2046_ * i_2046_;
			if (i_2047_ > i_2041_)
				i_2041_ = i_2047_;
			i_2047_ = i_2044_ * i_2044_ + i_2046_ * i_2046_ + i_2045_ * i_2045_;
			if (i_2047_ > i_2042_)
				i_2042_ = i_2047_;
		}
		aShort9081 = (short) i;
		aShort9082 = (short) i_2038_;
		aShort9040 = (short) i_2036_;
		aShort9080 = (short) i_2039_;
		aShort9054 = (short) i_2037_;
		aShort9076 = (short) i_2040_;
		anInt9051 = (int) (Math.sqrt((double) i_2041_) + 0.99);
		anInt9074 = (int) (Math.sqrt((double) i_2042_) + 0.99);
		aBool9078 = true;
	}

	void method14570() {
		int i = 32767;
		int i_2048_ = 32767;
		int i_2049_ = 32767;
		int i_2050_ = -32768;
		int i_2051_ = -32768;
		int i_2052_ = -32768;
		int i_2053_ = 0;
		int i_2054_ = 0;
		for (int i_2055_ = 0; i_2055_ < anInt9064; i_2055_++) {
			int i_2056_ = anIntArray9053[i_2055_];
			int i_2057_ = anIntArray9046[i_2055_];
			int i_2058_ = anIntArray9047[i_2055_];
			if (i_2056_ < i)
				i = i_2056_;
			if (i_2056_ > i_2050_)
				i_2050_ = i_2056_;
			if (i_2057_ < i_2048_)
				i_2048_ = i_2057_;
			if (i_2057_ > i_2051_)
				i_2051_ = i_2057_;
			if (i_2058_ < i_2049_)
				i_2049_ = i_2058_;
			if (i_2058_ > i_2052_)
				i_2052_ = i_2058_;
			int i_2059_ = i_2056_ * i_2056_ + i_2058_ * i_2058_;
			if (i_2059_ > i_2053_)
				i_2053_ = i_2059_;
			i_2059_ = i_2056_ * i_2056_ + i_2058_ * i_2058_ + i_2057_ * i_2057_;
			if (i_2059_ > i_2054_)
				i_2054_ = i_2059_;
		}
		aShort9081 = (short) i;
		aShort9082 = (short) i_2050_;
		aShort9040 = (short) i_2048_;
		aShort9080 = (short) i_2051_;
		aShort9054 = (short) i_2049_;
		aShort9076 = (short) i_2052_;
		anInt9051 = (int) (Math.sqrt((double) i_2053_) + 0.99);
		anInt9074 = (int) (Math.sqrt((double) i_2054_) + 0.99);
		aBool9078 = true;
	}

	void method14571() {
		if (aBool9073) {
			aBool9073 = false;
			if (aClass167Array9090 == null && aClass159Array9045 == null && aClass150Array9093 == null && !Class134.method2189(anInt9036, anInt9037)) {
				boolean bool = false;
				boolean bool_2060_ = false;
				boolean bool_2061_ = false;
				if (anIntArray9053 != null && !Class134.method2208(anInt9036, anInt9037)) {
					if (aClass129_9068 == null || aClass129_9068.anInterface15_1547 != null) {
						if (!aBool9078)
							method14542();
						bool = true;
					} else
						aBool9073 = true;
				}
				if (anIntArray9046 != null && !Class134.method2279(anInt9036, anInt9037)) {
					if (aClass129_9068 == null || aClass129_9068.anInterface15_1547 != null) {
						if (!aBool9078)
							method14542();
						bool_2060_ = true;
					} else
						aBool9073 = true;
				}
				if (anIntArray9047 != null && !Class134.method2210(anInt9036, anInt9037)) {
					if (aClass129_9068 == null || aClass129_9068.anInterface15_1547 != null) {
						if (!aBool9078)
							method14542();
						bool_2061_ = true;
					} else
						aBool9073 = true;
				}
				if (bool)
					anIntArray9053 = null;
				if (bool_2060_)
					anIntArray9046 = null;
				if (bool_2061_)
					anIntArray9047 = null;
			}
			if (aShortArray9089 != null && anIntArray9053 == null && anIntArray9046 == null && anIntArray9047 == null) {
				aShortArray9089 = null;
				anIntArray9088 = null;
			}
			if (aByteArray9091 != null && !Class134.method2211(anInt9036, anInt9037)) {
				if (aClass129_9070 != null) {
					if (aClass129_9070.anInterface15_1547 != null) {
						aShortArray9029 = null;
						aShortArray9052 = null;
						aShortArray9092 = null;
						aByteArray9091 = null;
					} else
						aBool9073 = true;
				} else if (aClass129_9069 == null || aClass129_9069.anInterface15_1547 != null) {
					aShortArray9029 = null;
					aShortArray9052 = null;
					aShortArray9092 = null;
					aByteArray9091 = null;
				} else
					aBool9073 = true;
			}
			if (aShortArray9060 != null && !Class134.method2212(anInt9036, anInt9037)) {
				if (aClass129_9069 == null || aClass129_9069.anInterface15_1547 != null)
					aShortArray9060 = null;
				else
					aBool9073 = true;
			}
			if (aByteArray9061 != null && !Class134.method2213(anInt9036, anInt9037)) {
				if (aClass129_9069 == null || aClass129_9069.anInterface15_1547 != null)
					aByteArray9061 = null;
				else
					aBool9073 = true;
			}
			if (aFloatArray9056 != null && !Class134.method2214(anInt9036, anInt9037)) {
				if (aClass129_9071 == null || aClass129_9071.anInterface15_1547 != null) {
					aFloatArray9085 = null;
					aFloatArray9056 = null;
				} else
					aBool9073 = true;
			}
			if (aShortArray9065 != null && !Class134.method2219(anInt9036, anInt9037)) {
				if (aClass129_9069 == null || aClass129_9069.anInterface15_1547 != null)
					aShortArray9065 = null;
				else
					aBool9073 = true;
			}
			if (aShortArray9062 != null && !Class134.method2218(anInt9036, anInt9037)) {
				if ((aClass132_9072 == null || aClass132_9072.anInterface17_1556 != null) && (aClass129_9069 == null || aClass129_9069.anInterface15_1547 != null)) {
					aShortArray9050 = null;
					aShortArray9055 = null;
					aShortArray9062 = null;
				} else
					aBool9073 = true;
			}
			if (anIntArrayArray9042 != null && !Class134.method2267(anInt9036, anInt9037)) {
				anIntArrayArray9042 = null;
				aShortArray9067 = null;
			}
			if (anIntArrayArray9048 != null && !Class134.method2216(anInt9036, anInt9037)) {
				anIntArrayArray9048 = null;
				aShortArray9049 = null;
			}
			if (anIntArrayArray9028 != null && !Class134.method2217(anInt9036, anInt9037))
				anIntArrayArray9028 = null;
			if (anIntArray9087 != null && (anInt9036 & 0x800) == 0 && (anInt9036 & 0x40000) == 0)
				anIntArray9087 = null;
		}
	}

	void method14572() {
		int i = 32767;
		int i_2062_ = 32767;
		int i_2063_ = 32767;
		int i_2064_ = -32768;
		int i_2065_ = -32768;
		int i_2066_ = -32768;
		int i_2067_ = 0;
		int i_2068_ = 0;
		for (int i_2069_ = 0; i_2069_ < anInt9064; i_2069_++) {
			int i_2070_ = anIntArray9053[i_2069_];
			int i_2071_ = anIntArray9046[i_2069_];
			int i_2072_ = anIntArray9047[i_2069_];
			if (i_2070_ < i)
				i = i_2070_;
			if (i_2070_ > i_2064_)
				i_2064_ = i_2070_;
			if (i_2071_ < i_2062_)
				i_2062_ = i_2071_;
			if (i_2071_ > i_2065_)
				i_2065_ = i_2071_;
			if (i_2072_ < i_2063_)
				i_2063_ = i_2072_;
			if (i_2072_ > i_2066_)
				i_2066_ = i_2072_;
			int i_2073_ = i_2070_ * i_2070_ + i_2072_ * i_2072_;
			if (i_2073_ > i_2067_)
				i_2067_ = i_2073_;
			i_2073_ = i_2070_ * i_2070_ + i_2072_ * i_2072_ + i_2071_ * i_2071_;
			if (i_2073_ > i_2068_)
				i_2068_ = i_2073_;
		}
		aShort9081 = (short) i;
		aShort9082 = (short) i_2064_;
		aShort9040 = (short) i_2062_;
		aShort9080 = (short) i_2065_;
		aShort9054 = (short) i_2063_;
		aShort9076 = (short) i_2066_;
		anInt9051 = (int) (Math.sqrt((double) i_2067_) + 0.99);
		anInt9074 = (int) (Math.sqrt((double) i_2068_) + 0.99);
		aBool9078 = true;
	}

	public void method3003(short i, short i_2074_) {
		for (int i_2075_ = 0; i_2075_ < anInt9058; i_2075_++) {
			if (aShortArray9060[i_2075_] == i)
				aShortArray9060[i_2075_] = i_2074_;
		}
		if (aClass150Array9093 != null) {
			for (int i_2076_ = 0; i_2076_ < anInt9075; i_2076_++) {
				Class150 class150 = aClass150Array9093[i_2076_];
				Class130 class130 = aClass130Array9094[i_2076_];
				class130.anInt1553 = (class130.anInt1553 & ~0xffffff | ((Class656.anIntArray8390[aShortArray9060[class150.anInt1682] & 0xffff]) & 0xffffff));
			}
		}
		if (aClass129_9069 != null)
			aClass129_9069.anInterface15_1547 = null;
	}

	public void method2936(short i, short i_2077_) {
		for (int i_2078_ = 0; i_2078_ < anInt9058; i_2078_++) {
			if (aShortArray9060[i_2078_] == i)
				aShortArray9060[i_2078_] = i_2077_;
		}
		if (aClass150Array9093 != null) {
			for (int i_2079_ = 0; i_2079_ < anInt9075; i_2079_++) {
				Class150 class150 = aClass150Array9093[i_2079_];
				Class130 class130 = aClass130Array9094[i_2079_];
				class130.anInt1553 = (class130.anInt1553 & ~0xffffff | ((Class656.anIntArray8390[aShortArray9060[class150.anInt1682] & 0xffff]) & 0xffffff));
			}
		}
		if (aClass129_9069 != null)
			aClass129_9069.anInterface15_1547 = null;
	}

	public int method2905() {
		return aShort9095;
	}

	public void method2869(int i) {
		int i_2080_ = Class428.anIntArray4825[i];
		int i_2081_ = Class428.anIntArray4819[i];
		for (int i_2082_ = 0; i_2082_ < anInt9064; i_2082_++) {
			int i_2083_ = ((anIntArray9046[i_2082_] * i_2080_ + anIntArray9053[i_2082_] * i_2081_) >> 14);
			anIntArray9046[i_2082_] = (anIntArray9046[i_2082_] * i_2081_ - anIntArray9053[i_2082_] * i_2080_) >> 14;
			anIntArray9053[i_2082_] = i_2083_;
		}
		if (aClass129_9068 != null)
			aClass129_9068.anInterface15_1547 = null;
		aBool9078 = false;
	}

	void method2981() {
		/* empty */
	}

	public int method2969() {
		if (!aBool9078)
			method14542();
		return anInt9051;
	}

	void method3024(int i, int i_2084_, int i_2085_, int i_2086_) {
		if (i == 0) {
			int i_2087_ = 0;
			anInt9101 = 0;
			anInt9102 = 0;
			anInt9103 = 0;
			for (int i_2088_ = 0; i_2088_ < anInt9064; i_2088_++) {
				anInt9101 += anIntArray9053[i_2088_];
				anInt9102 += anIntArray9046[i_2088_];
				anInt9103 += anIntArray9047[i_2088_];
				i_2087_++;
			}
			if (i_2087_ > 0) {
				anInt9101 = anInt9101 / i_2087_ + i_2084_;
				anInt9102 = anInt9102 / i_2087_ + i_2085_;
				anInt9103 = anInt9103 / i_2087_ + i_2086_;
			} else {
				anInt9101 = i_2084_;
				anInt9102 = i_2085_;
				anInt9103 = i_2086_;
			}
		} else if (i == 1) {
			for (int i_2089_ = 0; i_2089_ < anInt9064; i_2089_++) {
				anIntArray9053[i_2089_] += i_2084_;
				anIntArray9046[i_2089_] += i_2085_;
				anIntArray9047[i_2089_] += i_2086_;
			}
		} else if (i == 2) {
			for (int i_2090_ = 0; i_2090_ < anInt9064; i_2090_++) {
				anIntArray9053[i_2090_] -= anInt9101;
				anIntArray9046[i_2090_] -= anInt9102;
				anIntArray9047[i_2090_] -= anInt9103;
				if (i_2086_ != 0) {
					int i_2091_ = Class428.anIntArray4825[i_2086_];
					int i_2092_ = Class428.anIntArray4819[i_2086_];
					int i_2093_ = ((anIntArray9046[i_2090_] * i_2091_ + anIntArray9053[i_2090_] * i_2092_ + 16383) >> 14);
					anIntArray9046[i_2090_] = (anIntArray9046[i_2090_] * i_2092_ - anIntArray9053[i_2090_] * i_2091_ + 16383) >> 14;
					anIntArray9053[i_2090_] = i_2093_;
				}
				if (i_2084_ != 0) {
					int i_2094_ = Class428.anIntArray4825[i_2084_];
					int i_2095_ = Class428.anIntArray4819[i_2084_];
					int i_2096_ = ((anIntArray9046[i_2090_] * i_2095_ - anIntArray9047[i_2090_] * i_2094_ + 16383) >> 14);
					anIntArray9047[i_2090_] = (anIntArray9046[i_2090_] * i_2094_ + anIntArray9047[i_2090_] * i_2095_ + 16383) >> 14;
					anIntArray9046[i_2090_] = i_2096_;
				}
				if (i_2085_ != 0) {
					int i_2097_ = Class428.anIntArray4825[i_2085_];
					int i_2098_ = Class428.anIntArray4819[i_2085_];
					int i_2099_ = ((anIntArray9047[i_2090_] * i_2097_ + anIntArray9053[i_2090_] * i_2098_ + 16383) >> 14);
					anIntArray9047[i_2090_] = (anIntArray9047[i_2090_] * i_2098_ - anIntArray9053[i_2090_] * i_2097_ + 16383) >> 14;
					anIntArray9053[i_2090_] = i_2099_;
				}
				anIntArray9053[i_2090_] += anInt9101;
				anIntArray9046[i_2090_] += anInt9102;
				anIntArray9047[i_2090_] += anInt9103;
			}
		} else if (i == 3) {
			for (int i_2100_ = 0; i_2100_ < anInt9064; i_2100_++) {
				anIntArray9053[i_2100_] -= anInt9101;
				anIntArray9046[i_2100_] -= anInt9102;
				anIntArray9047[i_2100_] -= anInt9103;
				anIntArray9053[i_2100_] = anIntArray9053[i_2100_] * i_2084_ / 128;
				anIntArray9046[i_2100_] = anIntArray9046[i_2100_] * i_2085_ / 128;
				anIntArray9047[i_2100_] = anIntArray9047[i_2100_] * i_2086_ / 128;
				anIntArray9053[i_2100_] += anInt9101;
				anIntArray9046[i_2100_] += anInt9102;
				anIntArray9047[i_2100_] += anInt9103;
			}
		} else if (i == 5) {
			for (int i_2101_ = 0; i_2101_ < anInt9058; i_2101_++) {
				int i_2102_ = (aByteArray9061[i_2101_] & 0xff) + i_2084_ * 8;
				if (i_2102_ < 0)
					i_2102_ = 0;
				else if (i_2102_ > 255)
					i_2102_ = 255;
				aByteArray9061[i_2101_] = (byte) i_2102_;
			}
			if (aClass129_9069 != null)
				aClass129_9069.anInterface15_1547 = null;
			if (aClass150Array9093 != null) {
				for (int i_2103_ = 0; i_2103_ < anInt9075; i_2103_++) {
					Class150 class150 = aClass150Array9093[i_2103_];
					Class130 class130 = aClass130Array9094[i_2103_];
					class130.anInt1553 = (class130.anInt1553 & 0xffffff | (255 - (aByteArray9061[class150.anInt1682] & 0xff) << 24));
				}
			}
		} else if (i == 7) {
			for (int i_2104_ = 0; i_2104_ < anInt9058; i_2104_++) {
				int i_2105_ = aShortArray9060[i_2104_] & 0xffff;
				int i_2106_ = i_2105_ >> 10 & 0x3f;
				int i_2107_ = i_2105_ >> 7 & 0x7;
				int i_2108_ = i_2105_ & 0x7f;
				i_2106_ = i_2106_ + i_2084_ & 0x3f;
				i_2107_ += i_2085_ / 4;
				if (i_2107_ < 0)
					i_2107_ = 0;
				else if (i_2107_ > 7)
					i_2107_ = 7;
				i_2108_ += i_2086_;
				if (i_2108_ < 0)
					i_2108_ = 0;
				else if (i_2108_ > 127)
					i_2108_ = 127;
				aShortArray9060[i_2104_] = (short) (i_2106_ << 10 | i_2107_ << 7 | i_2108_);
			}
			if (aClass129_9069 != null)
				aClass129_9069.anInterface15_1547 = null;
			if (aClass150Array9093 != null) {
				for (int i_2109_ = 0; i_2109_ < anInt9075; i_2109_++) {
					Class150 class150 = aClass150Array9093[i_2109_];
					Class130 class130 = aClass130Array9094[i_2109_];
					class130.anInt1553 = (class130.anInt1553 & ~0xffffff | ((Class656.anIntArray8390[aShortArray9060[class150.anInt1682] & 0xffff]) & 0xffffff));
				}
			}
		} else if (i == 8) {
			for (int i_2110_ = 0; i_2110_ < anInt9075; i_2110_++) {
				Class130 class130 = aClass130Array9094[i_2110_];
				class130.anInt1548 += i_2084_;
				class130.anInt1552 += i_2085_;
			}
		} else if (i == 10) {
			for (int i_2111_ = 0; i_2111_ < anInt9075; i_2111_++) {
				Class130 class130 = aClass130Array9094[i_2111_];
				class130.anInt1549 = class130.anInt1549 * i_2084_ >> 7;
				class130.anInt1551 = class130.anInt1551 * i_2085_ >> 7;
			}
		} else if (i == 9) {
			for (int i_2112_ = 0; i_2112_ < anInt9075; i_2112_++) {
				Class130 class130 = aClass130Array9094[i_2112_];
				class130.anInt1550 = class130.anInt1550 + i_2084_ & 0x3fff;
			}
		}
	}

	public void method2945(int i, int i_2113_, Class161 class161, Class161 class161_2114_, int i_2115_, int i_2116_, int i_2117_) {
		if (!aBool9078)
			method14542();
		int i_2118_ = i_2115_ + aShort9081;
		int i_2119_ = i_2115_ + aShort9082;
		int i_2120_ = i_2117_ + aShort9054;
		int i_2121_ = i_2117_ + aShort9076;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_2118_ >= 0 && ((i_2119_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1750 * 1210322533) && i_2120_ >= 0 && ((i_2121_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1751 * -533476177))) {
			if (i == 4 || i == 5) {
				if (class161_2114_ == null || (i_2118_ < 0 || ((i_2119_ + class161_2114_.anInt1752 * 1048375491 >> class161_2114_.anInt1753 * 1252000143) >= class161_2114_.anInt1750 * 1210322533) || i_2120_ < 0 || ((i_2121_ + class161_2114_.anInt1752 * 1048375491 >> class161_2114_.anInt1753 * 1252000143) >= class161_2114_.anInt1751 * -533476177)))
					return;
			} else {
				i_2118_ >>= class161.anInt1753 * 1252000143;
				i_2119_ = (i_2119_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				i_2120_ >>= class161.anInt1753 * 1252000143;
				i_2121_ = (i_2121_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				if (class161.method2595(i_2118_, i_2120_, (byte) 73) == i_2116_ && (class161.method2595(i_2119_, i_2120_, (byte) 67) == i_2116_) && (class161.method2595(i_2118_, i_2121_, (byte) 23) == i_2116_) && (class161.method2595(i_2119_, i_2121_, (byte) 120) == i_2116_))
					return;
			}
			if (i == 1) {
				for (int i_2122_ = 0; i_2122_ < anInt9064; i_2122_++)
					anIntArray9046[i_2122_] = (anIntArray9046[i_2122_] + class161.method2619((anIntArray9053[i_2122_] + i_2115_), (anIntArray9047[i_2122_] + i_2117_), -113251142) - i_2116_);
			} else if (i == 2) {
				int i_2123_ = aShort9040;
				if (i_2123_ == 0)
					return;
				for (int i_2124_ = 0; i_2124_ < anInt9064; i_2124_++) {
					int i_2125_ = (anIntArray9046[i_2124_] << 16) / i_2123_;
					if (i_2125_ < i_2113_)
						anIntArray9046[i_2124_] = (anIntArray9046[i_2124_] + (class161.method2619((anIntArray9053[i_2124_] + i_2115_), (anIntArray9047[i_2124_] + i_2117_), -596365085) - i_2116_) * (i_2113_ - i_2125_) / i_2113_);
				}
			} else if (i == 3) {
				int i_2126_ = (i_2113_ & 0xff) * 16;
				int i_2127_ = (i_2113_ >> 8 & 0xff) * 16;
				int i_2128_ = (i_2113_ >> 16 & 0xff) << 6;
				int i_2129_ = (i_2113_ >> 24 & 0xff) << 6;
				if (i_2115_ - (i_2126_ >> 1) < 0 || ((i_2115_ + (i_2126_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1750 * 1210322533 << class161.anInt1753 * 1252000143)) || i_2117_ - (i_2127_ >> 1) < 0 || ((i_2117_ + (i_2127_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1751 * -533476177 << class161.anInt1753 * 1252000143)))
					return;
				method2962(class161, i_2115_, i_2116_, i_2117_, i_2126_, i_2127_, i_2128_, i_2129_);
			} else if (i == 4) {
				int i_2130_ = aShort9080 - aShort9040;
				for (int i_2131_ = 0; i_2131_ < anInt9064; i_2131_++)
					anIntArray9046[i_2131_] = (anIntArray9046[i_2131_] + ((class161_2114_.method2619(anIntArray9053[i_2131_] + i_2115_, anIntArray9047[i_2131_] + i_2117_, 798064916)) - i_2116_) + i_2130_);
			} else if (i == 5) {
				int i_2132_ = aShort9080 - aShort9040;
				for (int i_2133_ = 0; i_2133_ < anInt9064; i_2133_++) {
					int i_2134_ = anIntArray9053[i_2133_] + i_2115_;
					int i_2135_ = anIntArray9047[i_2133_] + i_2117_;
					int i_2136_ = class161.method2619(i_2134_, i_2135_, -1913547036);
					int i_2137_ = class161_2114_.method2619(i_2134_, i_2135_, 79698928);
					int i_2138_ = i_2136_ - i_2137_ - i_2113_;
					anIntArray9046[i_2133_] = ((anIntArray9046[i_2133_] << 8) / i_2132_ * i_2138_ >> 8) - (i_2116_ - i_2136_);
				}
			}
			if (aClass129_9068 != null)
				aClass129_9068.anInterface15_1547 = null;
			aBool9078 = false;
		}
	}

	public void method3026(Class432 class432, int i, boolean bool) {
		if (aShortArray9049 != null) {
			Class432 class432_2139_ = class432;
			if (bool) {
				class432_2139_ = aClass180_Sub3_9035.aClass432_9751;
				class432_2139_.method6918(class432);
			}
			float[] fs = new float[3];
			for (int i_2140_ = 0; i_2140_ < anInt9064; i_2140_++) {
				if ((i & aShortArray9049[i_2140_]) != 0) {
					class432_2139_.method6883((float) anIntArray9053[i_2140_], (float) anIntArray9046[i_2140_], (float) anIntArray9047[i_2140_], fs);
					anIntArray9053[i_2140_] = (int) fs[0];
					anIntArray9046[i_2140_] = (int) fs[1];
					anIntArray9047[i_2140_] = (int) fs[2];
				}
			}
		}
	}

	public Class159[] method2899() {
		return aClass159Array9045;
	}

	public void method3005(short i, short i_2141_) {
		Class181 class181 = aClass180_Sub3_9035.aClass181_2059;
		for (int i_2142_ = 0; i_2142_ < anInt9058; i_2142_++) {
			if (aShortArray9065[i_2142_] == i)
				aShortArray9065[i_2142_] = i_2141_;
		}
		byte i_2143_ = 0;
		byte i_2144_ = 0;
		if (i != -1) {
			Class163 class163 = class181.method3544(i & 0xffff, (byte) -65);
			i_2143_ = class163.aByte1808;
			i_2144_ = class163.aByte1802;
		}
		byte i_2145_ = 0;
		byte i_2146_ = 0;
		if (i_2141_ != -1) {
			Class163 class163 = class181.method3544(i_2141_ & 0xffff, (byte) -120);
			i_2145_ = class163.aByte1808;
			i_2146_ = class163.aByte1802;
			if (class163.aByte1781 != 0 || class163.aByte1797 != 0)
				aBool9096 = true;
		}
		if (i_2143_ != i_2145_ | i_2144_ != i_2146_) {
			if (aClass150Array9093 != null) {
				for (int i_2147_ = 0; i_2147_ < anInt9075; i_2147_++) {
					Class150 class150 = aClass150Array9093[i_2147_];
					Class130 class130 = aClass130Array9094[i_2147_];
					class130.anInt1553 = (class130.anInt1553 & ~0xffffff | ((Class656.anIntArray8390[aShortArray9060[class150.anInt1682] & 0xffff]) & 0xffffff));
				}
			}
			if (aClass129_9069 != null)
				aClass129_9069.anInterface15_1547 = null;
		}
	}

	void method14573(Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1) {
		if (aClass180_Sub3_9035.anIntArray9838.length < anInt9059) {
			aClass180_Sub3_9035.anIntArray9838 = new int[anInt9059];
			aClass180_Sub3_9035.anIntArray9851 = new int[anInt9059];
		}
		int[] is = aClass180_Sub3_9035.anIntArray9838;
		int[] is_2148_ = aClass180_Sub3_9035.anIntArray9851;
		for (int i = 0; i < anInt9064; i++) {
			int i_2149_ = (((anIntArray9053[i] - (anIntArray9046[i] * aClass180_Sub3_9035.anInt9785 >> 8)) >> aClass180_Sub3_9035.anInt9850) - class527_sub8_sub8_sub1.anInt12051);
			int i_2150_ = (((anIntArray9047[i] - (anIntArray9046[i] * aClass180_Sub3_9035.anInt9786 >> 8)) >> aClass180_Sub3_9035.anInt9850) - class527_sub8_sub8_sub1.anInt12050);
			int i_2151_ = anIntArray9088[i];
			int i_2152_ = anIntArray9088[i + 1];
			for (int i_2153_ = i_2151_; i_2153_ < i_2152_ && aShortArray9089[i_2153_] != 0; i_2153_++) {
				int i_2154_ = (aShortArray9089[i_2153_] & 0xffff) - 1;
				is[i_2154_] = i_2149_;
				is_2148_[i_2154_] = i_2150_;
			}
		}
		for (int i = 0; i < anInt9079; i++) {
			if (aByteArray9061 == null || aByteArray9061[i] <= 128) {
				int i_2155_ = aShortArray9062[i] & 0xffff;
				int i_2156_ = aShortArray9055[i] & 0xffff;
				int i_2157_ = aShortArray9050[i] & 0xffff;
				int i_2158_ = is[i_2155_];
				int i_2159_ = is[i_2156_];
				int i_2160_ = is[i_2157_];
				int i_2161_ = is_2148_[i_2155_];
				int i_2162_ = is_2148_[i_2156_];
				int i_2163_ = is_2148_[i_2157_];
				if (((i_2158_ - i_2159_) * (i_2162_ - i_2163_) - (i_2162_ - i_2161_) * (i_2160_ - i_2159_)) > 0)
					class527_sub8_sub8_sub1.method18707(i_2161_, i_2162_, i_2163_, i_2158_, i_2159_, i_2160_);
			}
		}
	}

	void method14574() {
		if (anInt9079 != 0) {
			if (aByte9038 != 0)
				method14548(true);
			method14548(false);
			if (aClass132_9072 != null) {
				if (aClass132_9072.anInterface17_1556 == null)
					method14582((aByte9038 & 0x10) != 0);
				if (aClass132_9072.anInterface17_1556 != null) {
					aClass180_Sub3_9035.method15409(aClass129_9070 != null);
					aClass180_Sub3_9035.method15385(aClass129_9068, aClass129_9070, aClass129_9069, aClass129_9071);
					int i = anIntArray9087.length - 1;
					for (int i_2164_ = 0; i_2164_ < i; i_2164_++) {
						int i_2165_ = anIntArray9087[i_2164_];
						int i_2166_ = anIntArray9087[i_2164_ + 1];
						int i_2167_ = (aShortArray9065[i_2165_] == -1 ? -1 : aShortArray9065[i_2165_] & 0xffff);
						aClass180_Sub3_9035.method15398(i_2167_, aClass129_9070 != null);
						aClass180_Sub3_9035.method15433((aClass132_9072.anInterface17_1556), 4, i_2165_ * 3, ((i_2166_ - i_2165_) * 3));
					}
				}
			}
			method14571();
		}
	}

	void method14575() {
		if (anInt9079 != 0) {
			if (aByte9038 != 0)
				method14548(true);
			method14548(false);
			if (aClass132_9072 != null) {
				if (aClass132_9072.anInterface17_1556 == null)
					method14582((aByte9038 & 0x10) != 0);
				if (aClass132_9072.anInterface17_1556 != null) {
					aClass180_Sub3_9035.method15409(aClass129_9070 != null);
					aClass180_Sub3_9035.method15385(aClass129_9068, aClass129_9070, aClass129_9069, aClass129_9071);
					int i = anIntArray9087.length - 1;
					for (int i_2168_ = 0; i_2168_ < i; i_2168_++) {
						int i_2169_ = anIntArray9087[i_2168_];
						int i_2170_ = anIntArray9087[i_2168_ + 1];
						int i_2171_ = (aShortArray9065[i_2169_] == -1 ? -1 : aShortArray9065[i_2169_] & 0xffff);
						aClass180_Sub3_9035.method15398(i_2171_, aClass129_9070 != null);
						aClass180_Sub3_9035.method15433((aClass132_9072.anInterface17_1556), 4, i_2169_ * 3, ((i_2170_ - i_2169_) * 3));
					}
				}
			}
			method14571();
		}
	}

	public int method2866() {
		if (!aBool9063)
			method2901();
		return aShort9086;
	}

	void method14576(Class427 class427) {
		if (aClass150Array9093 != null) {
			Class427 class427_2172_ = aClass180_Sub3_9035.aClass427_9685;
			aClass180_Sub3_9035.method15428();
			aClass180_Sub3_9035.method3182(!aBool9057);
			aClass180_Sub3_9035.method15409(false);
			aClass180_Sub3_9035.method15385(aClass180_Sub3_9035.aClass129_9844, null, null, (aClass180_Sub3_9035.aClass129_9732));
			for (int i = 0; i < anInt9075; i++) {
				Class150 class150 = aClass150Array9093[i];
				Class130 class130 = aClass130Array9094[i];
				if (!class150.aBool1690 || !aClass180_Sub3_9035.method3204()) {
					float f = ((float) (anIntArray9053[class150.anInt1688] + anIntArray9053[class150.anInt1683] + anIntArray9053[class150.anInt1684]) * 0.3333333F);
					float f_2173_ = ((float) (anIntArray9046[class150.anInt1688] + anIntArray9046[class150.anInt1683] + anIntArray9046[class150.anInt1684]) * 0.3333333F);
					float f_2174_ = ((float) (anIntArray9047[class150.anInt1688] + anIntArray9047[class150.anInt1683] + anIntArray9047[class150.anInt1684]) * 0.3333333F);
					float f_2175_ = (class427.aFloatArray4807[0] * f + class427.aFloatArray4807[4] * f_2173_ + class427.aFloatArray4807[8] * f_2174_ + class427.aFloatArray4807[12]);
					float f_2176_ = (class427.aFloatArray4807[1] * f + class427.aFloatArray4807[5] * f_2173_ + class427.aFloatArray4807[9] * f_2174_ + class427.aFloatArray4807[13]);
					float f_2177_ = (class427.aFloatArray4807[2] * f + class427.aFloatArray4807[6] * f_2173_ + class427.aFloatArray4807[10] * f_2174_ + class427.aFloatArray4807[14]);
					float f_2178_ = ((float) (1.0 / Math.sqrt((double) (f_2175_ * f_2175_ + f_2176_ * f_2176_ + (f_2177_ * f_2177_)))) * (float) class150.anInt1686);
					class427_2172_.method6804(class130.anInt1550, class130.anInt1549 * class150.aShort1691 >> 7, class130.anInt1551 * class150.aShort1685 >> 7, (f_2175_ + (float) class130.anInt1548 - f_2175_ * f_2178_), (f_2176_ + (float) class130.anInt1552 - f_2176_ * f_2178_), f_2177_ - f_2177_ * f_2178_);
					aClass180_Sub3_9035.method15570(class427_2172_);
					int i_2179_ = class130.anInt1553;
					OpenGL.glColor4ub((byte) (i_2179_ >> 16), (byte) (i_2179_ >> 8), (byte) i_2179_, (byte) (i_2179_ >> 24));
					aClass180_Sub3_9035.method15397(class150.aShort1687);
					aClass180_Sub3_9035.method15525(class150.aByte1689);
					aClass180_Sub3_9035.method15393(7, 0, 4);
				}
			}
			aClass180_Sub3_9035.method3182(true);
			aClass180_Sub3_9035.method15369();
		}
	}

	void method3025(int i, int i_2180_, int i_2181_, int i_2182_) {
		if (i == 0) {
			int i_2183_ = 0;
			anInt9101 = 0;
			anInt9102 = 0;
			anInt9103 = 0;
			for (int i_2184_ = 0; i_2184_ < anInt9064; i_2184_++) {
				anInt9101 += anIntArray9053[i_2184_];
				anInt9102 += anIntArray9046[i_2184_];
				anInt9103 += anIntArray9047[i_2184_];
				i_2183_++;
			}
			if (i_2183_ > 0) {
				anInt9101 = anInt9101 / i_2183_ + i_2180_;
				anInt9102 = anInt9102 / i_2183_ + i_2181_;
				anInt9103 = anInt9103 / i_2183_ + i_2182_;
			} else {
				anInt9101 = i_2180_;
				anInt9102 = i_2181_;
				anInt9103 = i_2182_;
			}
		} else if (i == 1) {
			for (int i_2185_ = 0; i_2185_ < anInt9064; i_2185_++) {
				anIntArray9053[i_2185_] += i_2180_;
				anIntArray9046[i_2185_] += i_2181_;
				anIntArray9047[i_2185_] += i_2182_;
			}
		} else if (i == 2) {
			for (int i_2186_ = 0; i_2186_ < anInt9064; i_2186_++) {
				anIntArray9053[i_2186_] -= anInt9101;
				anIntArray9046[i_2186_] -= anInt9102;
				anIntArray9047[i_2186_] -= anInt9103;
				if (i_2182_ != 0) {
					int i_2187_ = Class428.anIntArray4825[i_2182_];
					int i_2188_ = Class428.anIntArray4819[i_2182_];
					int i_2189_ = ((anIntArray9046[i_2186_] * i_2187_ + anIntArray9053[i_2186_] * i_2188_ + 16383) >> 14);
					anIntArray9046[i_2186_] = (anIntArray9046[i_2186_] * i_2188_ - anIntArray9053[i_2186_] * i_2187_ + 16383) >> 14;
					anIntArray9053[i_2186_] = i_2189_;
				}
				if (i_2180_ != 0) {
					int i_2190_ = Class428.anIntArray4825[i_2180_];
					int i_2191_ = Class428.anIntArray4819[i_2180_];
					int i_2192_ = ((anIntArray9046[i_2186_] * i_2191_ - anIntArray9047[i_2186_] * i_2190_ + 16383) >> 14);
					anIntArray9047[i_2186_] = (anIntArray9046[i_2186_] * i_2190_ + anIntArray9047[i_2186_] * i_2191_ + 16383) >> 14;
					anIntArray9046[i_2186_] = i_2192_;
				}
				if (i_2181_ != 0) {
					int i_2193_ = Class428.anIntArray4825[i_2181_];
					int i_2194_ = Class428.anIntArray4819[i_2181_];
					int i_2195_ = ((anIntArray9047[i_2186_] * i_2193_ + anIntArray9053[i_2186_] * i_2194_ + 16383) >> 14);
					anIntArray9047[i_2186_] = (anIntArray9047[i_2186_] * i_2194_ - anIntArray9053[i_2186_] * i_2193_ + 16383) >> 14;
					anIntArray9053[i_2186_] = i_2195_;
				}
				anIntArray9053[i_2186_] += anInt9101;
				anIntArray9046[i_2186_] += anInt9102;
				anIntArray9047[i_2186_] += anInt9103;
			}
		} else if (i == 3) {
			for (int i_2196_ = 0; i_2196_ < anInt9064; i_2196_++) {
				anIntArray9053[i_2196_] -= anInt9101;
				anIntArray9046[i_2196_] -= anInt9102;
				anIntArray9047[i_2196_] -= anInt9103;
				anIntArray9053[i_2196_] = anIntArray9053[i_2196_] * i_2180_ / 128;
				anIntArray9046[i_2196_] = anIntArray9046[i_2196_] * i_2181_ / 128;
				anIntArray9047[i_2196_] = anIntArray9047[i_2196_] * i_2182_ / 128;
				anIntArray9053[i_2196_] += anInt9101;
				anIntArray9046[i_2196_] += anInt9102;
				anIntArray9047[i_2196_] += anInt9103;
			}
		} else if (i == 5) {
			for (int i_2197_ = 0; i_2197_ < anInt9058; i_2197_++) {
				int i_2198_ = (aByteArray9061[i_2197_] & 0xff) + i_2180_ * 8;
				if (i_2198_ < 0)
					i_2198_ = 0;
				else if (i_2198_ > 255)
					i_2198_ = 255;
				aByteArray9061[i_2197_] = (byte) i_2198_;
			}
			if (aClass129_9069 != null)
				aClass129_9069.anInterface15_1547 = null;
			if (aClass150Array9093 != null) {
				for (int i_2199_ = 0; i_2199_ < anInt9075; i_2199_++) {
					Class150 class150 = aClass150Array9093[i_2199_];
					Class130 class130 = aClass130Array9094[i_2199_];
					class130.anInt1553 = (class130.anInt1553 & 0xffffff | (255 - (aByteArray9061[class150.anInt1682] & 0xff) << 24));
				}
			}
		} else if (i == 7) {
			for (int i_2200_ = 0; i_2200_ < anInt9058; i_2200_++) {
				int i_2201_ = aShortArray9060[i_2200_] & 0xffff;
				int i_2202_ = i_2201_ >> 10 & 0x3f;
				int i_2203_ = i_2201_ >> 7 & 0x7;
				int i_2204_ = i_2201_ & 0x7f;
				i_2202_ = i_2202_ + i_2180_ & 0x3f;
				i_2203_ += i_2181_ / 4;
				if (i_2203_ < 0)
					i_2203_ = 0;
				else if (i_2203_ > 7)
					i_2203_ = 7;
				i_2204_ += i_2182_;
				if (i_2204_ < 0)
					i_2204_ = 0;
				else if (i_2204_ > 127)
					i_2204_ = 127;
				aShortArray9060[i_2200_] = (short) (i_2202_ << 10 | i_2203_ << 7 | i_2204_);
			}
			if (aClass129_9069 != null)
				aClass129_9069.anInterface15_1547 = null;
			if (aClass150Array9093 != null) {
				for (int i_2205_ = 0; i_2205_ < anInt9075; i_2205_++) {
					Class150 class150 = aClass150Array9093[i_2205_];
					Class130 class130 = aClass130Array9094[i_2205_];
					class130.anInt1553 = (class130.anInt1553 & ~0xffffff | ((Class656.anIntArray8390[aShortArray9060[class150.anInt1682] & 0xffff]) & 0xffffff));
				}
			}
		} else if (i == 8) {
			for (int i_2206_ = 0; i_2206_ < anInt9075; i_2206_++) {
				Class130 class130 = aClass130Array9094[i_2206_];
				class130.anInt1548 += i_2180_;
				class130.anInt1552 += i_2181_;
			}
		} else if (i == 10) {
			for (int i_2207_ = 0; i_2207_ < anInt9075; i_2207_++) {
				Class130 class130 = aClass130Array9094[i_2207_];
				class130.anInt1549 = class130.anInt1549 * i_2180_ >> 7;
				class130.anInt1551 = class130.anInt1551 * i_2181_ >> 7;
			}
		} else if (i == 9) {
			for (int i_2208_ = 0; i_2208_ < anInt9075; i_2208_++) {
				Class130 class130 = aClass130Array9094[i_2208_];
				class130.anInt1550 = class130.anInt1550 + i_2180_ & 0x3fff;
			}
		}
	}

	void method14577(boolean bool) {
		if ((aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819.buffer).length < anInt9079 * 6)
			aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819 = new Class527_Sub38_Sub1((anInt9079 + 100) * 6);
		else
			aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819.anInt10689 = 0;
		Class527_Sub38_Sub1 class527_sub38_sub1 = aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819;
		if (aClass180_Sub3_9035.aBool9788) {
			for (int i = 0; i < anInt9079; i++) {
				class527_sub38_sub1.writeShort(aShortArray9062[i], 1404835786);
				class527_sub38_sub1.writeShort(aShortArray9055[i], 1404835786);
				class527_sub38_sub1.writeShort(aShortArray9050[i], 1404835786);
			}
		} else {
			for (int i = 0; i < anInt9079; i++) {
				class527_sub38_sub1.writeShortLE(aShortArray9062[i], 1515171048);
				class527_sub38_sub1.writeShortLE(aShortArray9055[i], 2031399117);
				class527_sub38_sub1.writeShortLE(aShortArray9050[i], -2116368046);
			}
		}
		if (class527_sub38_sub1.anInt10689 * -441238943 != 0) {
			if (bool) {
				if (anInterface17_9066 == null)
					anInterface17_9066 = (aClass180_Sub3_9035.method15434(5123, class527_sub38_sub1.buffer, class527_sub38_sub1.anInt10689 * -441238943, true));
				else
					anInterface17_9066.method98(5123, (class527_sub38_sub1.buffer), (class527_sub38_sub1.anInt10689 * -441238943));
				aClass132_9072.anInterface17_1556 = anInterface17_9066;
			} else
				aClass132_9072.anInterface17_1556 = (aClass180_Sub3_9035.method15434(5123, class527_sub38_sub1.buffer, class527_sub38_sub1.anInt10689 * -441238943, false));
			if (!bool)
				aBool9073 = true;
		}
	}

	void method14578(boolean bool) {
		if ((aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819.buffer).length < anInt9079 * 6)
			aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819 = new Class527_Sub38_Sub1((anInt9079 + 100) * 6);
		else
			aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819.anInt10689 = 0;
		Class527_Sub38_Sub1 class527_sub38_sub1 = aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819;
		if (aClass180_Sub3_9035.aBool9788) {
			for (int i = 0; i < anInt9079; i++) {
				class527_sub38_sub1.writeShort(aShortArray9062[i], 1404835786);
				class527_sub38_sub1.writeShort(aShortArray9055[i], 1404835786);
				class527_sub38_sub1.writeShort(aShortArray9050[i], 1404835786);
			}
		} else {
			for (int i = 0; i < anInt9079; i++) {
				class527_sub38_sub1.writeShortLE(aShortArray9062[i], -2113467241);
				class527_sub38_sub1.writeShortLE(aShortArray9055[i], -885159114);
				class527_sub38_sub1.writeShortLE(aShortArray9050[i], 1796070984);
			}
		}
		if (class527_sub38_sub1.anInt10689 * -441238943 != 0) {
			if (bool) {
				if (anInterface17_9066 == null)
					anInterface17_9066 = (aClass180_Sub3_9035.method15434(5123, class527_sub38_sub1.buffer, class527_sub38_sub1.anInt10689 * -441238943, true));
				else
					anInterface17_9066.method98(5123, (class527_sub38_sub1.buffer), (class527_sub38_sub1.anInt10689 * -441238943));
				aClass132_9072.anInterface17_1556 = anInterface17_9066;
			} else
				aClass132_9072.anInterface17_1556 = (aClass180_Sub3_9035.method15434(5123, class527_sub38_sub1.buffer, class527_sub38_sub1.anInt10689 * -441238943, false));
			if (!bool)
				aBool9073 = true;
		}
	}

	void method14579(boolean bool) {
		boolean bool_2209_ = (aClass129_9069 != null && aClass129_9069.anInterface15_1547 == null);
		boolean bool_2210_ = (aClass129_9070 != null && aClass129_9070.anInterface15_1547 == null);
		boolean bool_2211_ = (aClass129_9068 != null && aClass129_9068.anInterface15_1547 == null);
		boolean bool_2212_ = (aClass129_9071 != null && aClass129_9071.anInterface15_1547 == null);
		if (bool) {
			bool_2209_ = bool_2209_ & (aByte9038 & 0x2) != 0;
			bool_2210_ = bool_2210_ & (aByte9038 & 0x4) != 0;
			bool_2211_ = bool_2211_ & (aByte9038 & 0x1) != 0;
			bool_2212_ = bool_2212_ & (aByte9038 & 0x8) != 0;
		}
		byte i = 0;
		byte i_2213_ = 0;
		byte i_2214_ = 0;
		byte i_2215_ = 0;
		byte i_2216_ = 0;
		if (bool_2211_) {
			i_2213_ = i;
			i += 12;
		}
		if (bool_2209_) {
			i_2214_ = i;
			i += 4;
		}
		if (bool_2210_) {
			i_2215_ = i;
			i += 12;
		}
		if (bool_2212_) {
			i_2216_ = i;
			i += 8;
		}
		if (i != 0) {
			if ((aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819.buffer).length < anInt9059 * i)
				aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819 = new Class527_Sub38_Sub1((anInt9059 + 100) * i);
			else
				aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819.anInt10689 = 0;
			Class527_Sub38_Sub1 class527_sub38_sub1 = aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819;
			if (bool_2211_) {
				if (aClass180_Sub3_9035.aBool9788) {
					for (int i_2217_ = 0; i_2217_ < anInt9064; i_2217_++) {
						int i_2218_ = Stream.floatToRawIntBits((float) anIntArray9053[i_2217_]);
						int i_2219_ = Stream.floatToRawIntBits((float) anIntArray9046[i_2217_]);
						int i_2220_ = Stream.floatToRawIntBits((float) anIntArray9047[i_2217_]);
						int i_2221_ = anIntArray9088[i_2217_];
						int i_2222_ = anIntArray9088[i_2217_ + 1];
						for (int i_2223_ = i_2221_; (i_2223_ < i_2222_ && aShortArray9089[i_2223_] != 0); i_2223_++) {
							int i_2224_ = (aShortArray9089[i_2223_] & 0xffff) - 1;
							class527_sub38_sub1.anInt10689 = i_2224_ * i * 1474750881;
							class527_sub38_sub1.writeInt(i_2218_, 30133466);
							class527_sub38_sub1.writeInt(i_2219_, -1408196910);
							class527_sub38_sub1.writeInt(i_2220_, 1780956462);
						}
					}
				} else {
					for (int i_2225_ = 0; i_2225_ < anInt9064; i_2225_++) {
						int i_2226_ = Stream.floatToRawIntBits((float) anIntArray9053[i_2225_]);
						int i_2227_ = Stream.floatToRawIntBits((float) anIntArray9046[i_2225_]);
						int i_2228_ = Stream.floatToRawIntBits((float) anIntArray9047[i_2225_]);
						int i_2229_ = anIntArray9088[i_2225_];
						int i_2230_ = anIntArray9088[i_2225_ + 1];
						for (int i_2231_ = i_2229_; (i_2231_ < i_2230_ && aShortArray9089[i_2231_] != 0); i_2231_++) {
							int i_2232_ = (aShortArray9089[i_2231_] & 0xffff) - 1;
							class527_sub38_sub1.anInt10689 = i_2232_ * i * 1474750881;
							class527_sub38_sub1.writeIntLE(i_2226_, (byte) 102);
							class527_sub38_sub1.writeIntLE(i_2227_, (byte) 114);
							class527_sub38_sub1.writeIntLE(i_2228_, (byte) 99);
						}
					}
				}
			}
			if (bool_2209_) {
				if (aClass129_9070 == null) {
					short[] is;
					short[] is_2233_;
					short[] is_2234_;
					byte[] is_2235_;
					if (aClass158_9041 != null) {
						is = aClass158_9041.aShortArray1735;
						is_2233_ = aClass158_9041.aShortArray1737;
						is_2234_ = aClass158_9041.aShortArray1736;
						is_2235_ = aClass158_9041.aByteArray1734;
					} else {
						is = aShortArray9092;
						is_2233_ = aShortArray9052;
						is_2234_ = aShortArray9029;
						is_2235_ = aByteArray9091;
					}
					float f = aClass180_Sub3_9035.aFloatArray9773[0];
					float f_2236_ = aClass180_Sub3_9035.aFloatArray9773[1];
					float f_2237_ = aClass180_Sub3_9035.aFloatArray9773[2];
					float f_2238_ = aClass180_Sub3_9035.aFloat9779;
					float f_2239_ = (aClass180_Sub3_9035.aFloat9780 * 768.0F / (float) aShort9095);
					float f_2240_ = (aClass180_Sub3_9035.aFloat9781 * 768.0F / (float) aShort9095);
					for (int i_2241_ = 0; i_2241_ < anInt9058; i_2241_++) {
						int i_2242_ = method14549(aShortArray9060[i_2241_], aShortArray9065[i_2241_], aShort9039, aByteArray9061[i_2241_]);
						float f_2243_ = ((float) (i_2242_ >>> 24) * aClass180_Sub3_9035.aFloat9795);
						float f_2244_ = ((float) (i_2242_ >> 16 & 0xff) * aClass180_Sub3_9035.aFloat9777);
						float f_2245_ = ((float) (i_2242_ >> 8 & 0xff) * aClass180_Sub3_9035.aFloat9778);
						int i_2246_ = aShortArray9062[i_2241_] & 0xffff;
						short i_2247_ = (short) is_2235_[i_2246_];
						float f_2248_;
						if (i_2247_ == 0)
							f_2248_ = ((f * (float) is[i_2246_] + f_2236_ * (float) is_2233_[i_2246_] + f_2237_ * (float) is_2234_[i_2246_]) * 0.0026041667F);
						else
							f_2248_ = ((f * (float) is[i_2246_] + f_2236_ * (float) is_2233_[i_2246_] + f_2237_ * (float) is_2234_[i_2246_]) / (float) (i_2247_ * 256));
						float f_2249_ = f_2238_ + f_2248_ * (f_2248_ < 0.0F ? f_2240_ : f_2239_);
						int i_2250_ = (int) (f_2243_ * f_2249_);
						if (i_2250_ < 0)
							i_2250_ = 0;
						else if (i_2250_ > 255)
							i_2250_ = 255;
						int i_2251_ = (int) (f_2244_ * f_2249_);
						if (i_2251_ < 0)
							i_2251_ = 0;
						else if (i_2251_ > 255)
							i_2251_ = 255;
						int i_2252_ = (int) (f_2245_ * f_2249_);
						if (i_2252_ < 0)
							i_2252_ = 0;
						else if (i_2252_ > 255)
							i_2252_ = 255;
						class527_sub38_sub1.anInt10689 = (i_2214_ + i_2246_ * i) * 1474750881;
						class527_sub38_sub1.writeByte(i_2250_, -159335450);
						class527_sub38_sub1.writeByte(i_2251_, 266614679);
						class527_sub38_sub1.writeByte(i_2252_, -1483465665);
						class527_sub38_sub1.writeByte(255 - ((aByteArray9061[i_2241_]) & 0xff), 716565341);
						i_2246_ = aShortArray9055[i_2241_] & 0xffff;
						i_2247_ = (short) is_2235_[i_2246_];
						if (i_2247_ == 0)
							f_2248_ = ((f * (float) is[i_2246_] + f_2236_ * (float) is_2233_[i_2246_] + f_2237_ * (float) is_2234_[i_2246_]) * 0.0026041667F);
						else
							f_2248_ = ((f * (float) is[i_2246_] + f_2236_ * (float) is_2233_[i_2246_] + f_2237_ * (float) is_2234_[i_2246_]) / (float) (i_2247_ * 256));
						f_2249_ = f_2238_ + f_2248_ * (f_2248_ < 0.0F ? f_2240_ : f_2239_);
						i_2250_ = (int) (f_2243_ * f_2249_);
						if (i_2250_ < 0)
							i_2250_ = 0;
						else if (i_2250_ > 255)
							i_2250_ = 255;
						i_2251_ = (int) (f_2244_ * f_2249_);
						if (i_2251_ < 0)
							i_2251_ = 0;
						else if (i_2251_ > 255)
							i_2251_ = 255;
						i_2252_ = (int) (f_2245_ * f_2249_);
						if (i_2252_ < 0)
							i_2252_ = 0;
						else if (i_2252_ > 255)
							i_2252_ = 255;
						class527_sub38_sub1.anInt10689 = (i_2214_ + i_2246_ * i) * 1474750881;
						class527_sub38_sub1.writeByte(i_2250_, -1318485201);
						class527_sub38_sub1.writeByte(i_2251_, -1231283231);
						class527_sub38_sub1.writeByte(i_2252_, 1789286596);
						class527_sub38_sub1.writeByte(255 - ((aByteArray9061[i_2241_]) & 0xff), 2105348233);
						i_2246_ = aShortArray9050[i_2241_] & 0xffff;
						i_2247_ = (short) is_2235_[i_2246_];
						if (i_2247_ == 0)
							f_2248_ = ((f * (float) is[i_2246_] + f_2236_ * (float) is_2233_[i_2246_] + f_2237_ * (float) is_2234_[i_2246_]) * 0.0026041667F);
						else
							f_2248_ = ((f * (float) is[i_2246_] + f_2236_ * (float) is_2233_[i_2246_] + f_2237_ * (float) is_2234_[i_2246_]) / (float) (i_2247_ * 256));
						f_2249_ = f_2238_ + f_2248_ * (f_2248_ < 0.0F ? f_2240_ : f_2239_);
						i_2250_ = (int) (f_2243_ * f_2249_);
						if (i_2250_ < 0)
							i_2250_ = 0;
						else if (i_2250_ > 255)
							i_2250_ = 255;
						i_2251_ = (int) (f_2244_ * f_2249_);
						if (i_2251_ < 0)
							i_2251_ = 0;
						else if (i_2251_ > 255)
							i_2251_ = 255;
						i_2252_ = (int) (f_2245_ * f_2249_);
						if (i_2252_ < 0)
							i_2252_ = 0;
						else if (i_2252_ > 255)
							i_2252_ = 255;
						class527_sub38_sub1.anInt10689 = (i_2214_ + i_2246_ * i) * 1474750881;
						class527_sub38_sub1.writeByte(i_2250_, 1723200693);
						class527_sub38_sub1.writeByte(i_2251_, -743781012);
						class527_sub38_sub1.writeByte(i_2252_, -1720527958);
						class527_sub38_sub1.writeByte(255 - ((aByteArray9061[i_2241_]) & 0xff), 308220186);
					}
				} else {
					for (int i_2253_ = 0; i_2253_ < anInt9058; i_2253_++) {
						int i_2254_ = method14549(aShortArray9060[i_2253_], aShortArray9065[i_2253_], aShort9039, aByteArray9061[i_2253_]);
						class527_sub38_sub1.anInt10689 = ((i_2214_ + (aShortArray9062[i_2253_] & 0xffff) * i) * 1474750881);
						class527_sub38_sub1.writeInt(i_2254_, 1335713638);
						class527_sub38_sub1.anInt10689 = ((i_2214_ + (aShortArray9055[i_2253_] & 0xffff) * i) * 1474750881);
						class527_sub38_sub1.writeInt(i_2254_, -1837771099);
						class527_sub38_sub1.anInt10689 = ((i_2214_ + (aShortArray9050[i_2253_] & 0xffff) * i) * 1474750881);
						class527_sub38_sub1.writeInt(i_2254_, 1843510957);
					}
				}
			}
			if (bool_2210_) {
				short[] is;
				short[] is_2255_;
				short[] is_2256_;
				byte[] is_2257_;
				if (aClass158_9041 != null) {
					is = aClass158_9041.aShortArray1735;
					is_2255_ = aClass158_9041.aShortArray1737;
					is_2256_ = aClass158_9041.aShortArray1736;
					is_2257_ = aClass158_9041.aByteArray1734;
				} else {
					is = aShortArray9092;
					is_2255_ = aShortArray9052;
					is_2256_ = aShortArray9029;
					is_2257_ = aByteArray9091;
				}
				float f = 3.0F / (float) aShort9095;
				float f_2258_ = 3.0F / (float) (aShort9095 + aShort9095 / 2);
				class527_sub38_sub1.anInt10689 = i_2215_ * 1474750881;
				if (aClass180_Sub3_9035.aBool9788) {
					for (int i_2259_ = 0; i_2259_ < anInt9059; i_2259_++) {
						int i_2260_ = is_2257_[i_2259_] & 0xff;
						if (i_2260_ == 0) {
							class527_sub38_sub1.method18329((float) is[i_2259_] * f_2258_);
							class527_sub38_sub1.method18329((float) (is_2255_[i_2259_]) * f_2258_);
							class527_sub38_sub1.method18329((float) (is_2256_[i_2259_]) * f_2258_);
						} else {
							float f_2261_ = f / (float) i_2260_;
							class527_sub38_sub1.method18329((float) is[i_2259_] * f_2261_);
							class527_sub38_sub1.method18329((float) (is_2255_[i_2259_]) * f_2261_);
							class527_sub38_sub1.method18329((float) (is_2256_[i_2259_]) * f_2261_);
						}
						class527_sub38_sub1.anInt10689 += (i - 12) * 1474750881;
					}
				} else {
					for (int i_2262_ = 0; i_2262_ < anInt9059; i_2262_++) {
						int i_2263_ = is_2257_[i_2262_] & 0xff;
						if (i_2263_ == 0) {
							class527_sub38_sub1.method18331((float) is[i_2262_] * f_2258_);
							class527_sub38_sub1.method18331((float) (is_2255_[i_2262_]) * f_2258_);
							class527_sub38_sub1.method18331((float) (is_2256_[i_2262_]) * f_2258_);
						} else {
							float f_2264_ = f / (float) i_2263_;
							class527_sub38_sub1.method18331((float) is[i_2262_] * f_2264_);
							class527_sub38_sub1.method18331((float) (is_2255_[i_2262_]) * f_2264_);
							class527_sub38_sub1.method18331((float) (is_2256_[i_2262_]) * f_2264_);
						}
						class527_sub38_sub1.anInt10689 += (i - 12) * 1474750881;
					}
				}
			}
			if (bool_2212_) {
				class527_sub38_sub1.anInt10689 = i_2216_ * 1474750881;
				if (aClass180_Sub3_9035.aBool9788) {
					for (int i_2265_ = 0; i_2265_ < anInt9059; i_2265_++) {
						class527_sub38_sub1.method18329(aFloatArray9056[i_2265_]);
						class527_sub38_sub1.method18329(aFloatArray9085[i_2265_]);
						class527_sub38_sub1.anInt10689 += (i - 8) * 1474750881;
					}
				} else {
					for (int i_2266_ = 0; i_2266_ < anInt9059; i_2266_++) {
						class527_sub38_sub1.method18331(aFloatArray9056[i_2266_]);
						class527_sub38_sub1.method18331(aFloatArray9085[i_2266_]);
						class527_sub38_sub1.anInt10689 += (i - 8) * 1474750881;
					}
				}
			}
			class527_sub38_sub1.anInt10689 = i * anInt9059 * 1474750881;
			Interface15 interface15;
			if (bool) {
				if (anInterface15_9077 == null)
					anInterface15_9077 = (aClass180_Sub3_9035.method15389(i, class527_sub38_sub1.buffer, class527_sub38_sub1.anInt10689 * -441238943, true));
				else
					anInterface15_9077.method90(i, (class527_sub38_sub1.buffer), (class527_sub38_sub1.anInt10689 * -441238943));
				interface15 = anInterface15_9077;
				aByte9038 = (byte) 0;
			} else {
				interface15 = (aClass180_Sub3_9035.method15389(i, class527_sub38_sub1.buffer, class527_sub38_sub1.anInt10689 * -441238943, false));
				aBool9073 = true;
			}
			if (bool_2211_) {
				aClass129_9068.anInterface15_1547 = interface15;
				aClass129_9068.aByte1544 = i_2213_;
			}
			if (bool_2212_) {
				aClass129_9071.anInterface15_1547 = interface15;
				aClass129_9071.aByte1544 = i_2216_;
			}
			if (bool_2209_) {
				aClass129_9069.anInterface15_1547 = interface15;
				aClass129_9069.aByte1544 = i_2214_;
			}
			if (bool_2210_) {
				aClass129_9070.anInterface15_1547 = interface15;
				aClass129_9070.aByte1544 = i_2215_;
			}
		}
	}

	boolean method14580(int i, int i_2267_, int i_2268_, int i_2269_, int i_2270_, int i_2271_, int i_2272_, int i_2273_) {
		if (i_2267_ < i_2268_ && i_2267_ < i_2269_ && i_2267_ < i_2270_)
			return false;
		if (i_2267_ > i_2268_ && i_2267_ > i_2269_ && i_2267_ > i_2270_)
			return false;
		if (i < i_2271_ && i < i_2272_ && i < i_2273_)
			return false;
		if (i > i_2271_ && i > i_2272_ && i > i_2273_)
			return false;
		return true;
	}

	void method2917() {
		/* empty */
	}

	static final int method14581(int i, int i_2274_) {
		i_2274_ = i_2274_ * (i & 0x7f) >> 7;
		if (i_2274_ < 2)
			i_2274_ = 2;
		else if (i_2274_ > 126)
			i_2274_ = 126;
		return (i & 0xff80) + i_2274_;
	}

	public int method3053() {
		if (!aBool9078)
			method14542();
		return aShort9081;
	}

	void method14582(boolean bool) {
		if ((aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819.buffer).length < anInt9079 * 6)
			aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819 = new Class527_Sub38_Sub1((anInt9079 + 100) * 6);
		else
			aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819.anInt10689 = 0;
		Class527_Sub38_Sub1 class527_sub38_sub1 = aClass180_Sub3_9035.aClass527_Sub38_Sub1_9819;
		if (aClass180_Sub3_9035.aBool9788) {
			for (int i = 0; i < anInt9079; i++) {
				class527_sub38_sub1.writeShort(aShortArray9062[i], 1404835786);
				class527_sub38_sub1.writeShort(aShortArray9055[i], 1404835786);
				class527_sub38_sub1.writeShort(aShortArray9050[i], 1404835786);
			}
		} else {
			for (int i = 0; i < anInt9079; i++) {
				class527_sub38_sub1.writeShortLE(aShortArray9062[i], -2103511475);
				class527_sub38_sub1.writeShortLE(aShortArray9055[i], 87445369);
				class527_sub38_sub1.writeShortLE(aShortArray9050[i], 1172246132);
			}
		}
		if (class527_sub38_sub1.anInt10689 * -441238943 != 0) {
			if (bool) {
				if (anInterface17_9066 == null)
					anInterface17_9066 = (aClass180_Sub3_9035.method15434(5123, class527_sub38_sub1.buffer, class527_sub38_sub1.anInt10689 * -441238943, true));
				else
					anInterface17_9066.method98(5123, (class527_sub38_sub1.buffer), (class527_sub38_sub1.anInt10689 * -441238943));
				aClass132_9072.anInterface17_1556 = anInterface17_9066;
			} else
				aClass132_9072.anInterface17_1556 = (aClass180_Sub3_9035.method15434(5123, class527_sub38_sub1.buffer, class527_sub38_sub1.anInt10689 * -441238943, false));
			if (!bool)
				aBool9073 = true;
		}
	}

	public int method3055() {
		if (!aBool9078)
			method14542();
		return aShort9080;
	}
}
