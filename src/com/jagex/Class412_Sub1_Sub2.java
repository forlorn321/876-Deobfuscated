/* Class412_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class412_Sub1_Sub2 extends Class412_Sub1 {
	byte[] aByteArray11568;

	byte[] method18072(int i, int i_0_, int i_1_) {
		aByteArray11568 = new byte[i * i_0_ * i_1_ * 2];
		method6603(i, i_0_, i_1_);
		return aByteArray11568;
	}

	byte[] method18073(int i, int i_2_, int i_3_) {
		aByteArray11568 = new byte[i * i_2_ * i_3_ * 2];
		method6603(i, i_2_, i_3_);
		return aByteArray11568;
	}

	void method15798(int i, byte i_4_) {
		int i_5_ = i * 2;
		int i_6_ = i_4_ & 0xff;
		aByteArray11568[i_5_++] = (byte) (3 * i_6_ >> 5);
		aByteArray11568[i_5_] = (byte) (3 * i_6_ >> 5);
	}

	byte[] method18074(int i, int i_7_, int i_8_) {
		aByteArray11568 = new byte[i * i_7_ * i_8_ * 2];
		method6603(i, i_7_, i_8_);
		return aByteArray11568;
	}

	Class412_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	byte[] method18075(int i, int i_9_, int i_10_) {
		aByteArray11568 = new byte[i * i_9_ * i_10_ * 2];
		method6603(i, i_9_, i_10_);
		return aByteArray11568;
	}

	void method15799(int i, byte i_11_) {
		int i_12_ = i * 2;
		int i_13_ = i_11_ & 0xff;
		aByteArray11568[i_12_++] = (byte) (3 * i_13_ >> 5);
		aByteArray11568[i_12_] = (byte) (3 * i_13_ >> 5);
	}

	void method15800(int i, byte i_14_) {
		int i_15_ = i * 2;
		int i_16_ = i_14_ & 0xff;
		aByteArray11568[i_15_++] = (byte) (3 * i_16_ >> 5);
		aByteArray11568[i_15_] = (byte) (3 * i_16_ >> 5);
	}
}
