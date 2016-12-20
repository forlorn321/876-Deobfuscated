/* Class412_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class412_Sub2_Sub1 extends Class412_Sub2 {
	byte[] aByteArray11402;

	void method15864(int i, byte i_0_) {
		int i_1_ = i * 2;
		i_0_ = (byte) (127 + ((i_0_ & 0xff) >> 1));
		aByteArray11402[i_1_++] = i_0_;
		aByteArray11402[i_1_] = i_0_;
	}

	byte[] method17984(int i, int i_2_, int i_3_) {
		aByteArray11402 = new byte[i * i_2_ * i_3_ * 2];
		method6603(i, i_2_, i_3_);
		return aByteArray11402;
	}

	void method15863(int i, byte i_4_) {
		int i_5_ = i * 2;
		i_4_ = (byte) (127 + ((i_4_ & 0xff) >> 1));
		aByteArray11402[i_5_++] = i_4_;
		aByteArray11402[i_5_] = i_4_;
	}

	byte[] method17985(int i, int i_6_, int i_7_) {
		aByteArray11402 = new byte[i * i_6_ * i_7_ * 2];
		method6603(i, i_6_, i_7_);
		return aByteArray11402;
	}

	Class412_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	void method15862(int i, byte i_8_) {
		int i_9_ = i * 2;
		i_8_ = (byte) (127 + ((i_8_ & 0xff) >> 1));
		aByteArray11402[i_9_++] = i_8_;
		aByteArray11402[i_9_] = i_8_;
	}
}
