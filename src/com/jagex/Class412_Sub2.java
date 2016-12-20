/* Class412_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class412_Sub2 extends Class412 {
	int anInt10215;
	byte[] aByteArray10216;
	int anInt10217;
	int[] anIntArray10218 = new int[anInt4372];

	void method6604() {
		anInt10215 = Math.abs(anInt10215);
		if (anInt10215 >= 4096)
			anInt10215 = 4095;
		method15863(anInt10217++, (byte) (anInt10215 >> 4));
		anInt10215 = 0;
	}

	void method6622() {
		anInt10217 = 0;
		anInt10215 = 0;
	}

	void method6614() {
		anInt10215 = Math.abs(anInt10215);
		if (anInt10215 >= 4096)
			anInt10215 = 4095;
		method15863(anInt10217++, (byte) (anInt10215 >> 4));
		anInt10215 = 0;
	}

	void method15862(int i, byte i_0_) {
		aByteArray10216[anInt10217++] = (byte) (127 + ((i_0_ & 0xff) >> 1));
	}

	void method15863(int i, byte i_1_) {
		aByteArray10216[anInt10217++] = (byte) (127 + ((i_1_ & 0xff) >> 1));
	}

	void method15864(int i, byte i_2_) {
		aByteArray10216[anInt10217++] = (byte) (127 + ((i_2_ & 0xff) >> 1));
	}

	void method6605() {
		anInt10215 = Math.abs(anInt10215);
		if (anInt10215 >= 4096)
			anInt10215 = 4095;
		method15863(anInt10217++, (byte) (anInt10215 >> 4));
		anInt10215 = 0;
	}

	void method6613() {
		anInt10217 = 0;
		anInt10215 = 0;
	}

	void method6606(int i, int i_3_) {
		anInt10215 += i_3_ * anIntArray10218[i] >> 12;
	}

	Class412_Sub2(int i, int i_4_, int i_5_, int i_6_, int i_7_, float f) {
		super(i, i_4_, i_5_, i_6_, i_7_);
		for (int i_8_ = 0; i_8_ < anInt4372; i_8_++)
			anIntArray10218[i_8_] = (short) (int) (Math.pow((double) f, (double) i_8_) * 4096.0);
	}

	void method6615() {
		anInt10215 = Math.abs(anInt10215);
		if (anInt10215 >= 4096)
			anInt10215 = 4095;
		method15863(anInt10217++, (byte) (anInt10215 >> 4));
		anInt10215 = 0;
	}

	void method6616(int i, int i_9_) {
		anInt10215 += i_9_ * anIntArray10218[i] >> 12;
	}
}
