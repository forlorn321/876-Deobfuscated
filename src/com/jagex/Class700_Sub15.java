/* Class700_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class700_Sub15 extends Class700 {
	public static final int anInt10854 = 0;
	public static final int anInt10855 = 1;

	public int method16984() {
		return -420933067 * anInt8785;
	}

	public Class700_Sub15(int i, Class527_Sub31 class527_sub31) {
		super(i, class527_sub31);
	}

	public void method16985(int i) {
		if (0 != anInt8785 * -420933067 && aClass527_Sub31_8784.aClass700_Sub40_10604.method17294(-858822401) != 1)
			anInt8785 = 0;
		if (-420933067 * anInt8785 != 0 && aClass527_Sub31_8784.aClass700_Sub3_10605.method16859(1513958716) == 2)
			anInt8785 = 0;
		if (anInt8785 * -420933067 < 0 || anInt8785 * -420933067 > 1)
			anInt8785 = method14279((byte) -58) * -380424163;
	}

	public boolean method16986(int i) {
		return true;
	}

	void method14281(int i) {
		anInt8785 = i * -380424163;
	}

	public int method14289(int i, int i_0_) {
		if (0 != i && aClass527_Sub31_8784.aClass700_Sub3_10605.method16859(-557536034) == 2)
			return 3;
		if (0 == i || aClass527_Sub31_8784.aClass700_Sub40_10604.method17294(555761132) == 1)
			return 1;
		return 2;
	}

	void method14284(int i, int i_1_) {
		anInt8785 = i * -380424163;
	}

	public int method16987() {
		return -420933067 * anInt8785;
	}

	void method14287(int i) {
		anInt8785 = i * -380424163;
	}

	public int method14286(int i) {
		if (0 != i && aClass527_Sub31_8784.aClass700_Sub3_10605.method16859(-1818332162) == 2)
			return 3;
		if (0 == i || aClass527_Sub31_8784.aClass700_Sub40_10604.method17294(660383888) == 1)
			return 1;
		return 2;
	}

	public int method14285(int i) {
		if (0 != i && aClass527_Sub31_8784.aClass700_Sub3_10605.method16859(-683211123) == 2)
			return 3;
		if (0 == i || aClass527_Sub31_8784.aClass700_Sub40_10604.method17294(2002580535) == 1)
			return 1;
		return 2;
	}

	public void method16988() {
		if (0 != anInt8785 * -420933067 && aClass527_Sub31_8784.aClass700_Sub40_10604.method17294(-273603276) != 1)
			anInt8785 = 0;
		if (-420933067 * anInt8785 != 0 && aClass527_Sub31_8784.aClass700_Sub3_10605.method16859(-919219290) == 2)
			anInt8785 = 0;
		if (anInt8785 * -420933067 < 0 || anInt8785 * -420933067 > 1)
			anInt8785 = method14279((byte) -15) * -380424163;
	}

	public int method16989() {
		return -420933067 * anInt8785;
	}

	public void method16990() {
		if (0 != anInt8785 * -420933067 && aClass527_Sub31_8784.aClass700_Sub40_10604.method17294(-137840369) != 1)
			anInt8785 = 0;
		if (-420933067 * anInt8785 != 0 && aClass527_Sub31_8784.aClass700_Sub3_10605.method16859(-774940300) == 2)
			anInt8785 = 0;
		if (anInt8785 * -420933067 < 0 || anInt8785 * -420933067 > 1)
			anInt8785 = method14279((byte) 11) * -380424163;
	}

	public void method16991() {
		if (0 != anInt8785 * -420933067 && aClass527_Sub31_8784.aClass700_Sub40_10604.method17294(1476091310) != 1)
			anInt8785 = 0;
		if (-420933067 * anInt8785 != 0 && aClass527_Sub31_8784.aClass700_Sub3_10605.method16859(688474866) == 2)
			anInt8785 = 0;
		if (anInt8785 * -420933067 < 0 || anInt8785 * -420933067 > 1)
			anInt8785 = method14279((byte) -87) * -380424163;
	}

	public int method16992(int i) {
		return -420933067 * anInt8785;
	}

	public boolean method16993() {
		return true;
	}

	public boolean method16994() {
		return true;
	}

	public Class700_Sub15(Class527_Sub31 class527_sub31) {
		super(class527_sub31);
	}

	public int method16995() {
		return -420933067 * anInt8785;
	}

	int method14288() {
		return 1;
	}

	public int method16996() {
		return -420933067 * anInt8785;
	}

	public int method16997() {
		return -420933067 * anInt8785;
	}

	int method14279(byte i) {
		return 1;
	}

	public int method16998() {
		return -420933067 * anInt8785;
	}

	static final int method16999(int i, int i_2_) {
		int i_3_ = i & 0x3f;
		int i_4_ = i >> 6 & 0x3;
		if (18 == i_3_) {
			if (i_4_ == 0)
				return 1;
			if (1 == i_4_)
				return 2;
			if (2 == i_4_)
				return 4;
			if (i_4_ == 3)
				return 8;
		} else if (i_3_ == 19 || i_3_ == 21) {
			if (0 == i_4_)
				return 16;
			if (1 == i_4_)
				return 32;
			if (2 == i_4_)
				return 64;
			if (i_4_ == 3)
				return 128;
		}
		return 0;
	}
}
