/* Class470 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class470 {
	public static final int anInt5352 = 2;
	static final int anInt5353 = 2;
	public byte[][][] aByteArrayArrayArray5354;
	static final int anInt5355 = 2;
	public static final int anInt5356 = 8;
	static final int anInt5357 = 16;
	public static final int anInt5358 = 4;
	public static String aString5359;

	public void method7700() {
		for (int i = 0; i < aByteArrayArrayArray5354.length; i++) {
			for (int i_0_ = 0; i_0_ < aByteArrayArrayArray5354[0].length; i_0_++) {
				for (int i_1_ = 0; i_1_ < aByteArrayArrayArray5354[0][0].length; i_1_++)
					aByteArrayArrayArray5354[i][i_0_][i_1_] = (byte) 0;
			}
		}
	}

	public boolean method7701(int i, int i_2_, int i_3_, int i_4_) {
		if ((aByteArrayArrayArray5354[0][i_3_][i_4_] & 0x2) != 0)
			return true;
		if ((aByteArrayArrayArray5354[i_2_][i_3_][i_4_] & 0x10) != 0)
			return false;
		if (method7705(i_2_, i_3_, i_4_, 1691328265) == i)
			return true;
		return false;
	}

	public boolean method7702(int i, int i_5_, int i_6_) {
		if (i < 0 || i_5_ < 0 || i >= aByteArrayArrayArray5354[3].length || i_5_ >= aByteArrayArrayArray5354[3][i].length)
			return false;
		return 0 != (aByteArrayArrayArray5354[3][i][i_5_] & 0x2);
	}

	public void method7703() {
		for (int i = 0; i < aByteArrayArrayArray5354.length; i++) {
			for (int i_7_ = 0; i_7_ < aByteArrayArrayArray5354[0].length; i_7_++) {
				for (int i_8_ = 0; i_8_ < aByteArrayArrayArray5354[0][0].length; i_8_++)
					aByteArrayArrayArray5354[i][i_7_][i_8_] = (byte) 0;
			}
		}
	}

	public boolean method7704(int i, int i_9_, int i_10_, int i_11_, int i_12_) {
		if ((aByteArrayArrayArray5354[0][i_10_][i_11_] & 0x2) != 0)
			return true;
		if ((aByteArrayArrayArray5354[i_9_][i_10_][i_11_] & 0x10) != 0)
			return false;
		if (method7705(i_9_, i_10_, i_11_, 284094896) == i)
			return true;
		return false;
	}

	int method7705(int i, int i_13_, int i_14_, int i_15_) {
		if (0 != (aByteArrayArrayArray5354[i][i_13_][i_14_] & 0x8))
			return 0;
		if (i > 0 && (aByteArrayArrayArray5354[1][i_13_][i_14_] & 0x2) != 0)
			return i - 1;
		return i;
	}

	public boolean method7706(int i, int i_16_, short i_17_) {
		if (i < 0 || i_16_ < 0 || i >= aByteArrayArrayArray5354[1].length || i_16_ >= aByteArrayArrayArray5354[1][i].length)
			return false;
		if (0 != (aByteArrayArrayArray5354[1][i][i_16_] & 0x2))
			return true;
		return false;
	}

	public void method7707() {
		for (int i = 0; i < aByteArrayArrayArray5354.length; i++) {
			for (int i_18_ = 0; i_18_ < aByteArrayArrayArray5354[0].length; i_18_++) {
				for (int i_19_ = 0; i_19_ < aByteArrayArrayArray5354[0][0].length; i_19_++)
					aByteArrayArrayArray5354[i][i_18_][i_19_] = (byte) 0;
			}
		}
	}

	public boolean method7708(int i, int i_20_) {
		if (i < 0 || i_20_ < 0 || i >= aByteArrayArrayArray5354[1].length || i_20_ >= aByteArrayArrayArray5354[1][i].length)
			return false;
		if (0 != (aByteArrayArrayArray5354[1][i][i_20_] & 0x2))
			return true;
		return false;
	}

	public void method7709(int i) {
		for (int i_21_ = 0; i_21_ < aByteArrayArrayArray5354.length; i_21_++) {
			for (int i_22_ = 0; i_22_ < aByteArrayArrayArray5354[0].length; i_22_++) {
				for (int i_23_ = 0; i_23_ < aByteArrayArrayArray5354[0][0].length; i_23_++)
					aByteArrayArrayArray5354[i_21_][i_22_][i_23_] = (byte) 0;
			}
		}
	}

	public boolean method7710(int i, int i_24_, int i_25_, int i_26_) {
		if ((aByteArrayArrayArray5354[0][i_25_][i_26_] & 0x2) != 0)
			return true;
		if ((aByteArrayArrayArray5354[i_24_][i_25_][i_26_] & 0x10) != 0)
			return false;
		if (method7705(i_24_, i_25_, i_26_, -513744817) == i)
			return true;
		return false;
	}

	public Class470(int i, int i_27_, int i_28_) {
		aByteArrayArrayArray5354 = new byte[i][i_27_][i_28_];
	}

	int method7711(int i, int i_29_, int i_30_) {
		if (0 != (aByteArrayArrayArray5354[i][i_29_][i_30_] & 0x8))
			return 0;
		if (i > 0 && (aByteArrayArrayArray5354[1][i_29_][i_30_] & 0x2) != 0)
			return i - 1;
		return i;
	}

	static final void method7712(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class243.anInt2553 * 1228419355;
	}

	static final void method7713(Class665 class665, int i) {
		Class391.method6480(1035125979);
	}

	static final void method7714(Class665 class665, short i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class703.aClass219_8825.method4062(297322107).method87();
	}

	static final void method7715(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
	}

	static final void method7716(Class665 class665, int i) {
		if (null != client.aString11270)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = Class695_Sub3.anInt10976 * -2075991457;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}
}
