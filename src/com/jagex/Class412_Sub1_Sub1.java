/* Class412_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class412_Sub1_Sub1 extends Class412_Sub1 {
	byte[] aByteArray11552;

	Class412_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	byte[] method18063(int i, int i_0_, int i_1_) {
		aByteArray11552 = new byte[i * i_0_ * i_1_ * 2];
		method6603(i, i_0_, i_1_);
		return aByteArray11552;
	}

	void method15798(int i, byte i_2_) {
		int i_3_ = i * 2;
		int i_4_ = i_2_ & 0xff;
		aByteArray11552[i_3_++] = (byte) -1;
		aByteArray11552[i_3_] = (byte) (3 * i_4_ >> 5);
	}

	void method15799(int i, byte i_5_) {
		int i_6_ = i * 2;
		int i_7_ = i_5_ & 0xff;
		aByteArray11552[i_6_++] = (byte) -1;
		aByteArray11552[i_6_] = (byte) (3 * i_7_ >> 5);
	}

	void method15800(int i, byte i_8_) {
		int i_9_ = i * 2;
		int i_10_ = i_8_ & 0xff;
		aByteArray11552[i_9_++] = (byte) -1;
		aByteArray11552[i_9_] = (byte) (3 * i_10_ >> 5);
	}

	byte[] method18064(int i, int i_11_, int i_12_) {
		aByteArray11552 = new byte[i * i_11_ * i_12_ * 2];
		method6603(i, i_11_, i_12_);
		return aByteArray11552;
	}
}
