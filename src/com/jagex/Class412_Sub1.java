/* Class412_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class412_Sub1 extends Class412 {
	int anInt10156;
	int anInt10157;
	byte[] aByteArray10158;
	int anInt10159;
	int anInt10160;
	int anInt10161;
	int anInt10162;
	int anInt10163;
	int anInt10164;

	void method6604() {
		anInt10157 = anInt10156;
		anInt10163 >>= 4;
		if (anInt10163 < 0)
			anInt10163 = 0;
		else if (anInt10163 > 255)
			anInt10163 = 255;
		method15798(anInt10160++, (byte) anInt10163);
		anInt10163 = 0;
	}

	void method6622() {
		anInt10160 = 0;
		anInt10163 = 0;
	}

	void method6606(int i, int i_0_) {
		if (i != 0) {
			anInt10164 = anInt10159 * anInt10162 >> 12;
			if (anInt10164 < 0)
				anInt10164 = 0;
			else if (anInt10164 > 4096)
				anInt10164 = 4096;
			anInt10159 = anInt10161 - (i_0_ < 0 ? -i_0_ : i_0_);
			anInt10159 = anInt10159 * anInt10159 >> 12;
			anInt10159 = anInt10159 * anInt10164 >> 12;
			anInt10163 += anInt10159 * anInt10157 >> 12;
			anInt10157 = anInt10157 * anInt10156 >> 12;
		} else {
			anInt10159 = anInt10161 - (i_0_ < 0 ? -i_0_ : i_0_);
			anInt10159 = anInt10159 * anInt10159 >> 12;
			anInt10164 = 4096;
			anInt10163 = anInt10159;
		}
	}

	void method6605() {
		anInt10157 = anInt10156;
		anInt10163 >>= 4;
		if (anInt10163 < 0)
			anInt10163 = 0;
		else if (anInt10163 > 255)
			anInt10163 = 255;
		method15798(anInt10160++, (byte) anInt10163);
		anInt10163 = 0;
	}

	void method15798(int i, byte i_1_) {
		aByteArray10158[i] = i_1_;
	}

	void method6613() {
		anInt10160 = 0;
		anInt10163 = 0;
	}

	Class412_Sub1(int i, int i_2_, int i_3_, int i_4_, int i_5_, float f, float f_6_, float f_7_) {
		super(i, i_2_, i_3_, i_4_, i_5_);
		anInt10162 = (int) (f_7_ * 4096.0F);
		anInt10161 = (int) (f_6_ * 4096.0F);
		anInt10157 = anInt10156 = (int) (Math.pow(0.5, (double) -f) * 4096.0);
	}

	void method15799(int i, byte i_8_) {
		aByteArray10158[i] = i_8_;
	}

	void method15800(int i, byte i_9_) {
		aByteArray10158[i] = i_9_;
	}

	void method6614() {
		anInt10157 = anInt10156;
		anInt10163 >>= 4;
		if (anInt10163 < 0)
			anInt10163 = 0;
		else if (anInt10163 > 255)
			anInt10163 = 255;
		method15798(anInt10160++, (byte) anInt10163);
		anInt10163 = 0;
	}

	void method6615() {
		anInt10157 = anInt10156;
		anInt10163 >>= 4;
		if (anInt10163 < 0)
			anInt10163 = 0;
		else if (anInt10163 > 255)
			anInt10163 = 255;
		method15798(anInt10160++, (byte) anInt10163);
		anInt10163 = 0;
	}

	void method6616(int i, int i_10_) {
		if (i != 0) {
			anInt10164 = anInt10159 * anInt10162 >> 12;
			if (anInt10164 < 0)
				anInt10164 = 0;
			else if (anInt10164 > 4096)
				anInt10164 = 4096;
			anInt10159 = anInt10161 - (i_10_ < 0 ? -i_10_ : i_10_);
			anInt10159 = anInt10159 * anInt10159 >> 12;
			anInt10159 = anInt10159 * anInt10164 >> 12;
			anInt10163 += anInt10159 * anInt10157 >> 12;
			anInt10157 = anInt10157 * anInt10156 >> 12;
		} else {
			anInt10159 = anInt10161 - (i_10_ < 0 ? -i_10_ : i_10_);
			anInt10159 = anInt10159 * anInt10159 >> 12;
			anInt10164 = 4096;
			anInt10163 = anInt10159;
		}
	}
}
