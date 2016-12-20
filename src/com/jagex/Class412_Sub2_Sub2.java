/* Class412_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class412_Sub2_Sub2 extends Class412_Sub2 {
	byte[] aByteArray11512;

	byte[] method18049(int i, int i_0_, int i_1_) {
		aByteArray11512 = new byte[i * i_0_ * i_1_ * 2];
		method6603(i, i_0_, i_1_);
		return aByteArray11512;
	}

	byte[] method18050(int i, int i_2_, int i_3_) {
		aByteArray11512 = new byte[i * i_2_ * i_3_ * 2];
		method6603(i, i_2_, i_3_);
		return aByteArray11512;
	}

	void method15863(int i, byte i_4_) {
		int i_5_ = i * 2;
		i_4_ = (byte) (127 + ((i_4_ & 0xff) >> 1));
		aByteArray11512[i_5_++] = i_4_;
		aByteArray11512[i_5_] = i_4_;
	}

	byte[] method18051(int i, int i_6_, int i_7_) {
		aByteArray11512 = new byte[i * i_6_ * i_7_ * 2];
		method6603(i, i_6_, i_7_);
		return aByteArray11512;
	}

	void method15862(int i, byte i_8_) {
		int i_9_ = i * 2;
		i_8_ = (byte) (127 + ((i_8_ & 0xff) >> 1));
		aByteArray11512[i_9_++] = i_8_;
		aByteArray11512[i_9_] = i_8_;
	}

	Class412_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	void method15864(int i, byte i_10_) {
		int i_11_ = i * 2;
		i_10_ = (byte) (127 + ((i_10_ & 0xff) >> 1));
		aByteArray11512[i_11_++] = i_10_;
		aByteArray11512[i_11_] = i_10_;
	}
}
