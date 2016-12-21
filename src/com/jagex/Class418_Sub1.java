/* Class418_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class418_Sub1 extends Class418 {
	int anInt10232;
	byte[] aByteArray10233;
	int anInt10234;
	int anInt10235;
	int anInt10236;
	int anInt10237;
	int anInt10238;
	int anInt10239;
	int anInt10240;

	Class418_Sub1(int i, int i_0_, int i_1_, int i_2_, int i_3_, float f, float f_4_, float f_5_) {
		super(i, i_0_, i_1_, i_2_, i_3_);
		anInt10236 = (int) (f_5_ * 4096.0F);
		anInt10239 = (int) (f_4_ * 4096.0F);
		anInt10238 = anInt10240 = (int) (Math.pow(0.5, (double) -f) * 4096.0);
	}

	void method5041() {
		anInt10235 = 0;
		anInt10237 = 0;
	}

	void method5059(int i, int i_6_) {
		if (i != 0) {
			anInt10234 = anInt10232 * anInt10236 >> 12;
			if (anInt10234 < 0)
				anInt10234 = 0;
			else if (anInt10234 > 4096)
				anInt10234 = 4096;
			anInt10232 = anInt10239 - (i_6_ < 0 ? -i_6_ : i_6_);
			anInt10232 = anInt10232 * anInt10232 >> 12;
			anInt10232 = anInt10232 * anInt10234 >> 12;
			anInt10237 += anInt10232 * anInt10238 >> 12;
			anInt10238 = anInt10238 * anInt10240 >> 12;
		} else {
			anInt10232 = anInt10239 - (i_6_ < 0 ? -i_6_ : i_6_);
			anInt10232 = anInt10232 * anInt10232 >> 12;
			anInt10234 = 4096;
			anInt10237 = anInt10232;
		}
	}

	void method5055() {
		anInt10238 = anInt10240;
		anInt10237 >>= 4;
		if (anInt10237 < 0)
			anInt10237 = 0;
		else if (anInt10237 > 255)
			anInt10237 = 255;
		method9311(anInt10235++, (byte) anInt10237);
		anInt10237 = 0;
	}

	void method9311(int i, byte i_7_) {
		aByteArray10233[i] = i_7_;
	}

	void method9312(int i, byte i_8_) {
		aByteArray10233[i] = i_8_;
	}

	void method5051() {
		anInt10238 = anInt10240;
		anInt10237 >>= 4;
		if (anInt10237 < 0)
			anInt10237 = 0;
		else if (anInt10237 > 255)
			anInt10237 = 255;
		method9311(anInt10235++, (byte) anInt10237);
		anInt10237 = 0;
	}

	void method5043(int i, int i_9_) {
		if (i != 0) {
			anInt10234 = anInt10232 * anInt10236 >> 12;
			if (anInt10234 < 0)
				anInt10234 = 0;
			else if (anInt10234 > 4096)
				anInt10234 = 4096;
			anInt10232 = anInt10239 - (i_9_ < 0 ? -i_9_ : i_9_);
			anInt10232 = anInt10232 * anInt10232 >> 12;
			anInt10232 = anInt10232 * anInt10234 >> 12;
			anInt10237 += anInt10232 * anInt10238 >> 12;
			anInt10238 = anInt10238 * anInt10240 >> 12;
		} else {
			anInt10232 = anInt10239 - (i_9_ < 0 ? -i_9_ : i_9_);
			anInt10232 = anInt10232 * anInt10232 >> 12;
			anInt10234 = 4096;
			anInt10237 = anInt10232;
		}
	}

	void method5046() {
		anInt10235 = 0;
		anInt10237 = 0;
	}

	void method5049() {
		anInt10235 = 0;
		anInt10237 = 0;
	}

	void method5052() {
		anInt10238 = anInt10240;
		anInt10237 >>= 4;
		if (anInt10237 < 0)
			anInt10237 = 0;
		else if (anInt10237 > 255)
			anInt10237 = 255;
		method9311(anInt10235++, (byte) anInt10237);
		anInt10237 = 0;
	}

	void method5058(int i, int i_10_) {
		if (i != 0) {
			anInt10234 = anInt10232 * anInt10236 >> 12;
			if (anInt10234 < 0)
				anInt10234 = 0;
			else if (anInt10234 > 4096)
				anInt10234 = 4096;
			anInt10232 = anInt10239 - (i_10_ < 0 ? -i_10_ : i_10_);
			anInt10232 = anInt10232 * anInt10232 >> 12;
			anInt10232 = anInt10232 * anInt10234 >> 12;
			anInt10237 += anInt10232 * anInt10238 >> 12;
			anInt10238 = anInt10238 * anInt10240 >> 12;
		} else {
			anInt10232 = anInt10239 - (i_10_ < 0 ? -i_10_ : i_10_);
			anInt10232 = anInt10232 * anInt10232 >> 12;
			anInt10234 = 4096;
			anInt10237 = anInt10232;
		}
	}

	void method5048() {
		anInt10235 = 0;
		anInt10237 = 0;
	}

	void method5060(int i, int i_11_) {
		if (i != 0) {
			anInt10234 = anInt10232 * anInt10236 >> 12;
			if (anInt10234 < 0)
				anInt10234 = 0;
			else if (anInt10234 > 4096)
				anInt10234 = 4096;
			anInt10232 = anInt10239 - (i_11_ < 0 ? -i_11_ : i_11_);
			anInt10232 = anInt10232 * anInt10232 >> 12;
			anInt10232 = anInt10232 * anInt10234 >> 12;
			anInt10237 += anInt10232 * anInt10238 >> 12;
			anInt10238 = anInt10238 * anInt10240 >> 12;
		} else {
			anInt10232 = anInt10239 - (i_11_ < 0 ? -i_11_ : i_11_);
			anInt10232 = anInt10232 * anInt10232 >> 12;
			anInt10234 = 4096;
			anInt10237 = anInt10232;
		}
	}
}
