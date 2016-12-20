/* Class615 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class615 {
	public byte aByte8037;
	public int anInt8038 = -1214962212;
	public int anInt8039;
	public int[] anIntArray8040;
	static final int anInt8041 = 4;
	static final int anInt8042 = 4;
	public int anInt8043;
	public int anInt8044;
	static final int anInt8045 = 7;
	public int anInt8046;
	public int anInt8047;
	public int anInt8048;
	public boolean aBool8049;
	public boolean aBool8050;
	public short aShort8051;
	public int anInt8052;
	public int anInt8053;
	public short[][] aShortArrayArray8054;
	public short[][][] aShortArrayArrayArray8055;
	public short[][] aShortArrayArray8056;
	public short[][][] aShortArrayArrayArray8057;
	static final int anInt8058 = 4;
	public int anInt8059;
	public boolean aBool8060;
	public int anInt8061;
	public int anInt8062;
	public int anInt8063;
	public boolean aBool8064;
	public int anInt8065;
	public int anInt8066;
	public int anInt8067;
	public int anInt8068;
	public int anInt8069;
	public int anInt8070;
	public int anInt8071;
	public int anInt8072;
	public int anInt8073;
	public int anInt8074;
	public int anInt8075;
	public int[] anIntArray8076 = null;
	public int anInt8077;
	public int anInt8078;
	public int anInt8079;
	public int anInt8080;
	public int anInt8081;
	public int anInt8082;

	void method10184(RSByteBuffer class527_sub38, short i) {
		boolean bool = false;
		for (;;) {
			int i_0_ = class527_sub38.readUnsignedByte();
			if (0 == i_0_)
				break;
			if (1 == i_0_) {
				if (anIntArray8076 == null) {
					anInt8038 = -1214962212;
					anIntArray8076 = new int[4];
					anIntArray8040 = new int[4];
				}
				for (int i_1_ = 0; i_1_ < anIntArray8076.length; i_1_++) {
					anIntArray8076[i_1_] = class527_sub38.readShort();
					anIntArray8040[i_1_] = class527_sub38.readShort();
				}
				bool = true;
			} else if (2 == i_0_)
				anInt8047 = class527_sub38.method16466(-1940743350) * -1441936365;
			else if (i_0_ == 3) {
				anInt8038 = class527_sub38.readUnsignedByte() * 770001271;
				anIntArray8076 = new int[-66822073 * anInt8038];
				anIntArray8040 = new int[-66822073 * anInt8038];
			} else if (i_0_ == 4)
				aBool8050 = false;
			else if (i_0_ == 5)
				anInt8048 = class527_sub38.read24BitUnsignedInteger(323905244) * 320945263;
			else if (6 == i_0_)
				anInt8043 = class527_sub38.read24BitUnsignedInteger(2022833143) * -1388011407;
			else if (i_0_ == 7) {
				aShortArrayArray8054 = new short[10][4];
				aShortArrayArrayArray8055 = new short[10][4][];
				for (int i_2_ = 0; i_2_ < 10; i_2_++) {
					for (int i_3_ = 0; i_3_ < 4; i_3_++) {
						int i_4_ = class527_sub38.readUnsignedShort();
						if (65535 == i_4_)
							i_4_ = -1;
						aShortArrayArray8054[i_2_][i_3_] = (short) i_4_;
						int i_5_ = class527_sub38.readUnsignedShort();
						aShortArrayArrayArray8055[i_2_][i_3_] = new short[i_5_];
						for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
							int i_7_ = class527_sub38.readUnsignedShort();
							if (65535 == i_7_)
								i_7_ = -1;
							aShortArrayArrayArray8055[i_2_][i_3_][i_6_] = (short) i_7_;
						}
					}
				}
			} else if (8 == i_0_)
				aBool8049 = false;
			else if (i_0_ == 9)
				anInt8059 = class527_sub38.readUnsignedByte() * 1344768335;
			else if (i_0_ == 10)
				aBool8060 = false;
			else if (11 == i_0_)
				anInt8063 = class527_sub38.readUnsignedByte() * 1128763955;
			else if (12 == i_0_) {
				anInt8062 = class527_sub38.readUnsignedShort() * -515306287;
				anInt8082 = class527_sub38.readUnsignedShort() * -1153492973;
			} else if (i_0_ == 13)
				anInt8044 = class527_sub38.readUnsignedByte() * 959041017;
			else if (i_0_ == 14)
				anInt8067 = class527_sub38.readUnsignedByte() * 819172175;
			else if (i_0_ == 15)
				anInt8046 = class527_sub38.readUnsignedByte() * -306177117;
			else if (16 == i_0_)
				aBool8064 = true;
			else if (17 == i_0_)
				anInt8061 = class527_sub38.readInt() * 577626549;
			else if (i_0_ == 18)
				anInt8069 = class527_sub38.readInt() * 1337102977;
			else if (19 == i_0_)
				anInt8065 = class527_sub38.readInt() * 815349287;
			else if (i_0_ == 20) {
				aShort8051 = (short) class527_sub38.readUnsignedShort();
				aByte8037 = (byte) class527_sub38.readUnsignedByte();
			} else if (i_0_ == 21)
				anInt8053 = class527_sub38.readUnsignedByte() * 839667287;
			else if (i_0_ == 22) {
				anInt8068 = class527_sub38.method16466(-1781126825) * -2057922035;
				anInt8052 = class527_sub38.method16466(-1702660356) * 156545267;
				anInt8070 = class527_sub38.method16466(-1601505880) * -431479545;
				anInt8071 = class527_sub38.method16466(-2112902325) * 473557217;
				anInt8072 = class527_sub38.method16466(-2080940162) * 718878599;
				anInt8073 = class527_sub38.method16466(-1844965582) * -683209125;
				anInt8074 = class527_sub38.readByte() * 19533747;
				anInt8075 = class527_sub38.readByte() * -370371757;
				anInt8078 = class527_sub38.method16466(-2098229121) * 1567773247;
				anInt8077 = class527_sub38.method16466(-1836002763) * -1873961627;
				anInt8080 = class527_sub38.method16466(-2018594918) * -116262089;
				anInt8079 = class527_sub38.method16466(-1739609047) * 1947889207;
				anInt8039 = class527_sub38.method16466(-1727320370) * -1984293125;
				anInt8081 = class527_sub38.method16466(-1625134541) * 352218665;
				anInt8066 = class527_sub38.method16466(-2087492021) * 813270921;
			} else if (i_0_ == 23) {
				aShortArrayArray8056 = new short[10][4];
				aShortArrayArrayArray8057 = new short[10][4][];
				for (int i_8_ = 0; i_8_ < 10; i_8_++) {
					for (int i_9_ = 0; i_9_ < 4; i_9_++) {
						int i_10_ = class527_sub38.readUnsignedShort();
						if (65535 == i_10_)
							i_10_ = -1;
						aShortArrayArray8056[i_8_][i_9_] = (short) i_10_;
						int i_11_ = class527_sub38.readUnsignedShort();
						aShortArrayArrayArray8057[i_8_][i_9_] = new short[i_11_];
						for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
							int i_13_ = class527_sub38.readUnsignedShort();
							if (i_13_ == 65535)
								i_13_ = -1;
							aShortArrayArrayArray8057[i_8_][i_9_][i_12_] = (short) i_13_;
						}
					}
				}
			}
		}
		if (!bool) {
			if (anIntArray8076 == null) {
				anInt8038 = -1214962212;
				anIntArray8076 = new int[4];
				anIntArray8040 = new int[4];
			}
			for (int i_14_ = 0; i_14_ < anIntArray8076.length; i_14_++) {
				anIntArray8076[i_14_] = 0;
				anIntArray8040[i_14_] = i_14_ * 20;
			}
		}
	}

	public Class615(Class459 class459) {
		anIntArray8040 = null;
		anInt8067 = -1018278596;
		anInt8044 = -458803228;
		anInt8046 = -2143239819;
		anInt8047 = 1441936365;
		anInt8048 = -320945263;
		anInt8043 = 1388011407;
		aBool8050 = true;
		aShort8051 = (short) -1;
		aByte8037 = (byte) 0;
		anInt8053 = -1932617220;
		aBool8049 = true;
		anInt8059 = -1605430626;
		aBool8060 = true;
		anInt8063 = -908675431;
		anInt8062 = 515306287;
		anInt8082 = 1153492973;
		anInt8061 = 1193167616;
		anInt8069 = 827157887;
		anInt8065 = -242750336;
		anInt8068 = 2057922035;
		anInt8052 = -156545267;
		anInt8070 = 431479545;
		anInt8071 = -473557217;
		anInt8072 = -718878599;
		anInt8073 = 683209125;
		anInt8078 = -1567773247;
		anInt8077 = 1873961627;
		anInt8080 = 116262089;
		anInt8079 = -1947889207;
		anInt8039 = 1984293125;
		anInt8081 = -352218665;
		anInt8066 = -813270921;
		byte[] is = class459.method7512((1088756673 * Class632.aClass632_8267.anInt8258), 1447980132);
		method10184(new RSByteBuffer(is), (short) -8617);
	}

	static final void method10185(Class243 class243, Class240 class240, Class665 class665, int i) {
		class243.aBool2577 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) == 1;
		Class430.method6876(class243, (byte) 112);
		if (-927924265 * class243.anInt2675 == -1 && !class240.aBool2394)
			Class314_Sub2_Sub1.method17983(-254728301 * class243.anInt2504, (byte) -83);
	}

	static final void method10186(Class243 class243, Class240 class240, Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, -1416162998) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2639 = Class103.method1800(string, class665, (byte) -69);
		class243.aBool2606 = true;
	}

	static int method10187(CharSequence charsequence, char c, int i) {
		int i_15_ = 0;
		int i_16_ = charsequence.length();
		for (int i_17_ = 0; i_17_ < i_16_; i_17_++) {
			if (charsequence.charAt(i_17_) == c)
				i_15_++;
		}
		return i_15_;
	}

	public static Class699[] method10188(byte i) {
		return (new Class699[] { Class699.aClass699_8774, Class699.aClass699_8771, Class699.aClass699_8780, Class699.aClass699_8773, Class699.aClass699_8772, Class699.aClass699_8779, Class699.aClass699_8777, Class699.aClass699_8776, Class699.aClass699_8770, Class699.aClass699_8775 });
	}

	static final void method10189(Class665 class665, int i) {
		int i_18_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (i_18_ < 0 || i_18_ > 1)
			i_18_ = 0;
		Class628.method10414(1 == i_18_, 1431378414);
	}
}
