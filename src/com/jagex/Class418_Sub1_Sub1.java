/* Class418_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class418_Sub1_Sub1 extends Class418_Sub1 {
	byte[] aByteArray11489;

	void method9311(int i, byte i_0_) {
		int i_1_ = i * 2;
		int i_2_ = i_0_ & 0xff;
		aByteArray11489[i_1_++] = (byte) (3 * i_2_ >> 5);
		aByteArray11489[i_1_] = (byte) (3 * i_2_ >> 5);
	}

	byte[] method10577(int i, int i_3_, int i_4_) {
		aByteArray11489 = new byte[i * i_3_ * i_4_ * 2];
		method5039(i, i_3_, i_4_);
		return aByteArray11489;
	}

	byte[] method10578(int i, int i_5_, int i_6_) {
		aByteArray11489 = new byte[i * i_5_ * i_6_ * 2];
		method5039(i, i_5_, i_6_);
		return aByteArray11489;
	}

	Class418_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	byte[] method10579(int i, int i_7_, int i_8_) {
		aByteArray11489 = new byte[i * i_7_ * i_8_ * 2];
		method5039(i, i_7_, i_8_);
		return aByteArray11489;
	}

	byte[] method10580(int i, int i_9_, int i_10_) {
		aByteArray11489 = new byte[i * i_9_ * i_10_ * 2];
		method5039(i, i_9_, i_10_);
		return aByteArray11489;
	}

	void method9312(int i, byte i_11_) {
		int i_12_ = i * 2;
		int i_13_ = i_11_ & 0xff;
		aByteArray11489[i_12_++] = (byte) (3 * i_13_ >> 5);
		aByteArray11489[i_12_] = (byte) (3 * i_13_ >> 5);
	}
}
