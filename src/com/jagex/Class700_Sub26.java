/* Class700_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class700_Sub26 extends Class700 {
	public static final int anInt10901 = 1;
	public static final int anInt10902 = 0;
	static final int anInt10903 = 2;

	public Class700_Sub26(int i, Class527_Sub31 class527_sub31) {
		super(i, class527_sub31);
	}

	public Class700_Sub26(Class527_Sub31 class527_sub31) {
		super(class527_sub31);
	}

	public void method17185(int i) {
		if (aClass527_Sub31_8784.method16333(1934043256) == Class678.aClass678_8611)
			anInt8785 = -760848326;
		if (anInt8785 * -420933067 < 0 || anInt8785 * -420933067 > 2)
			anInt8785 = method14279((byte) -2) * -380424163;
	}

	int method14279(byte i) {
		return 1;
	}

	int method14289(int i, int i_0_) {
		return 1;
	}

	int method14285(int i) {
		return 1;
	}

	public int method17186(byte i) {
		return anInt8785 * -420933067;
	}

	int method14286(int i) {
		return 1;
	}

	void method14281(int i) {
		anInt8785 = i * -380424163;
	}

	void method14287(int i) {
		anInt8785 = i * -380424163;
	}

	public int method17187() {
		return anInt8785 * -420933067;
	}

	int method14288() {
		return 1;
	}

	public void method17188() {
		if (aClass527_Sub31_8784.method16333(663056895) == Class678.aClass678_8611)
			anInt8785 = -760848326;
		if (anInt8785 * -420933067 < 0 || anInt8785 * -420933067 > 2)
			anInt8785 = method14279((byte) 36) * -380424163;
	}

	void method14284(int i, int i_1_) {
		anInt8785 = i * -380424163;
	}

	public int method17189() {
		return anInt8785 * -420933067;
	}

	public void method17190() {
		if (aClass527_Sub31_8784.method16333(-1745512415) == Class678.aClass678_8611)
			anInt8785 = -760848326;
		if (anInt8785 * -420933067 < 0 || anInt8785 * -420933067 > 2)
			anInt8785 = method14279((byte) 4) * -380424163;
	}

	public int method17191() {
		return anInt8785 * -420933067;
	}

	public static Class240 method17192(int i, int[] is, Class240 class240, boolean bool, int i_2_) {
		if (!Class254.aClass459_2807.method7552(i, (byte) 87))
			return null;
		int i_3_ = Class254.aClass459_2807.method7504(i, 1097089386);
		Class243[] class243s;
		if (i_3_ == 0)
			class243s = new Class243[0];
		else if (null == class240)
			class243s = new Class243[i_3_];
		else
			class243s = class240.aClass243Array2392;
		if (null == class240)
			class240 = new Class240(bool, class243s);
		else {
			class240.aClass243Array2392 = class243s;
			class240.aBool2394 = bool;
		}
		for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
			if (class240.aClass243Array2392[i_4_] == null) {
				byte[] is_5_ = Class254.aClass459_2807.method7553(i, i_4_, is, 1324155207);
				if (null != is_5_) {
					Class243 class243 = class240.aClass243Array2392[i_4_] = new Class243();
					class243.anInt2504 = ((i << 16) + i_4_) * -1008660837;
					class243.method4512(new RSByteBuffer(is_5_), (byte) 0);
				}
			}
		}
		return class240;
	}
}
