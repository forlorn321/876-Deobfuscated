/* Class311 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class311 {
	short[] aShortArray3491;
	int anInt3492;

	public int method5637(Class325 class325, byte i) throws IOException {
		int i_0_ = 1;
		int i_1_ = 0;
		for (int i_2_ = 0; i_2_ < -1185144313 * anInt3492; i_2_++) {
			int i_3_ = class325.method5735(aShortArray3491, i_0_, 218415778);
			i_0_ <<= 1;
			i_0_ += i_3_;
			i_1_ |= i_3_ << i_2_;
		}
		return i_1_;
	}

	public void method5638(byte i) {
		Class225.method4192(aShortArray3491, -1081934689);
	}

	public int method5639(Class325 class325, byte i) throws IOException {
		int i_4_ = 1;
		for (int i_5_ = anInt3492 * -1185144313; 0 != i_5_; i_5_--)
			i_4_ = (i_4_ << 1) + class325.method5735(aShortArray3491, i_4_, 1916765137);
		return i_4_ - (1 << -1185144313 * anInt3492);
	}

	public void method5640() {
		Class225.method4192(aShortArray3491, 54855634);
	}

	public Class311(int i) {
		anInt3492 = -636507209 * i;
		aShortArray3491 = new short[1 << i];
	}

	public void method5641() {
		Class225.method4192(aShortArray3491, -238466478);
	}

	public void method5642() {
		Class225.method4192(aShortArray3491, 1931540783);
	}

	public int method5643(Class325 class325) throws IOException {
		int i = 1;
		for (int i_6_ = anInt3492 * -1185144313; 0 != i_6_; i_6_--)
			i = (i << 1) + class325.method5735(aShortArray3491, i, 157324593);
		return i - (1 << -1185144313 * anInt3492);
	}

	public int method5644(Class325 class325) throws IOException {
		int i = 1;
		int i_7_ = 0;
		for (int i_8_ = 0; i_8_ < -1185144313 * anInt3492; i_8_++) {
			int i_9_ = class325.method5735(aShortArray3491, i, 707527538);
			i <<= 1;
			i += i_9_;
			i_7_ |= i_9_ << i_8_;
		}
		return i_7_;
	}

	public static int method5645(short[] is, int i, Class325 class325, int i_10_) throws IOException {
		int i_11_ = 1;
		int i_12_ = 0;
		for (int i_13_ = 0; i_13_ < i_10_; i_13_++) {
			int i_14_ = class325.method5735(is, i + i_11_, 1895973313);
			i_11_ <<= 1;
			i_11_ += i_14_;
			i_12_ |= i_14_ << i_13_;
		}
		return i_12_;
	}

	public static int method5646(short[] is, int i, Class325 class325, int i_15_) throws IOException {
		int i_16_ = 1;
		int i_17_ = 0;
		for (int i_18_ = 0; i_18_ < i_15_; i_18_++) {
			int i_19_ = class325.method5735(is, i + i_16_, 905283535);
			i_16_ <<= 1;
			i_16_ += i_19_;
			i_17_ |= i_19_ << i_18_;
		}
		return i_17_;
	}

	static final void method5647(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class621.method10230(class243, class240, class665, (byte) 80);
	}

	static final void method5648(Class243 class243, Class240 class240, Class665 class665, int i) {
		class243.anInt2502 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) * -656986053;
	}

	static final void method5649(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}
}
