/* Class317 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class317 {
	short[] aShortArray3507;
	int anInt3508;

	public void method4219() {
		Class263.method3666(aShortArray3507, (byte) -44);
	}

	public int method4220(Class332 class332, byte i) throws IOException {
		int i_0_ = 1;
		for (int i_1_ = 2125239673 * anInt3508; i_1_ != 0; i_1_--)
			i_0_ = (i_0_ << 1) + class332.method4333(aShortArray3507, i_0_, -1614557497);
		return i_0_ - (1 << anInt3508 * 2125239673);
	}

	public int method4221(Class332 class332, int i) throws IOException {
		int i_2_ = 1;
		int i_3_ = 0;
		for (int i_4_ = 0; i_4_ < anInt3508 * 2125239673; i_4_++) {
			int i_5_ = class332.method4333(aShortArray3507, i_2_, 14333154);
			i_2_ <<= 1;
			i_2_ += i_5_;
			i_3_ |= i_5_ << i_4_;
		}
		return i_3_;
	}

	public void method4222() {
		Class263.method3666(aShortArray3507, (byte) -89);
	}

	public void method4223() {
		Class263.method3666(aShortArray3507, (byte) -75);
	}

	public void method4224() {
		Class263.method3666(aShortArray3507, (byte) -118);
	}

	public void method4225(int i) {
		Class263.method3666(aShortArray3507, (byte) -62);
	}

	public Class317(int i) {
		anInt3508 = 1795081417 * i;
		aShortArray3507 = new short[1 << i];
	}

	static final void method4226(Class668 class668, byte i) {
		int i_6_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (int) (Math.random() * (double) i_6_);
	}

	public static int method4227(int i, int i_7_, boolean bool, int i_8_) {
		int i_9_ = 0;
		Class536_Sub1 class536_sub1 = Class659.method7970(i, bool, -1542351763);
		if (class536_sub1 == null)
			return 0;
		for (int i_10_ = 0; i_10_ < class536_sub1.anIntArray10304.length; i_10_++) {
			if (class536_sub1.anIntArray10304[i_10_] >= 0 && (((ItemDecoder) Class111.aClass34_Sub13_1391.method70((class536_sub1.anIntArray10304[i_10_]), (byte) -53)).anInt18 * -1423460053) == i_7_)
				i_9_ += Class200.method2915(i, i_10_, bool, (byte) 51);
		}
		return i_9_;
	}

	static void method4228(Class443 class443, boolean bool, float f, float f_11_, float f_12_, float f_13_, int i, int i_14_, int i_15_) {
		int i_16_ = client.aClass515_11066.method6248(-1808152990);
		int i_17_ = client.aClass515_11066.method6247(-1661109781);
		class443.method5350(f, f_11_, f_12_, f_13_, (float) i_17_, (float) i_16_, (float) i, (float) i_14_);
	}
}
