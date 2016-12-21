/* Class418_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class418_Sub2 extends Class418 {
	int[] anIntArray10258 = new int[anInt4560];
	int anInt10259;
	int anInt10260;
	byte[] aByteArray10261;

	void method5060(int i, int i_0_) {
		anInt10260 += i_0_ * anIntArray10258[i] >> 12;
	}

	void method5041() {
		anInt10259 = 0;
		anInt10260 = 0;
	}

	void method5055() {
		anInt10260 = Math.abs(anInt10260);
		if (anInt10260 >= 4096)
			anInt10260 = 4095;
		method9314(anInt10259++, (byte) (anInt10260 >> 4));
		anInt10260 = 0;
	}

	void method5048() {
		anInt10259 = 0;
		anInt10260 = 0;
	}

	Class418_Sub2(int i, int i_1_, int i_2_, int i_3_, int i_4_, float f) {
		super(i, i_1_, i_2_, i_3_, i_4_);
		for (int i_5_ = 0; i_5_ < anInt4560; i_5_++)
			anIntArray10258[i_5_] = (short) (int) (Math.pow((double) f, (double) i_5_) * 4096.0);
	}

	void method9313(int i, byte i_6_) {
		aByteArray10261[anInt10259++] = (byte) (127 + ((i_6_ & 0xff) >> 1));
	}

	void method5051() {
		anInt10260 = Math.abs(anInt10260);
		if (anInt10260 >= 4096)
			anInt10260 = 4095;
		method9314(anInt10259++, (byte) (anInt10260 >> 4));
		anInt10260 = 0;
	}

	void method5049() {
		anInt10259 = 0;
		anInt10260 = 0;
	}

	void method5046() {
		anInt10259 = 0;
		anInt10260 = 0;
	}

	void method5052() {
		anInt10260 = Math.abs(anInt10260);
		if (anInt10260 >= 4096)
			anInt10260 = 4095;
		method9314(anInt10259++, (byte) (anInt10260 >> 4));
		anInt10260 = 0;
	}

	void method5043(int i, int i_7_) {
		anInt10260 += i_7_ * anIntArray10258[i] >> 12;
	}

	void method5058(int i, int i_8_) {
		anInt10260 += i_8_ * anIntArray10258[i] >> 12;
	}

	void method5059(int i, int i_9_) {
		anInt10260 += i_9_ * anIntArray10258[i] >> 12;
	}

	void method9314(int i, byte i_10_) {
		aByteArray10261[anInt10259++] = (byte) (127 + ((i_10_ & 0xff) >> 1));
	}
}
