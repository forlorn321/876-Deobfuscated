/* Class418_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class418_Sub1_Sub2 extends Class418_Sub1 {
	byte[] aByteArray11584;

	byte[] method10629(int i, int i_0_, int i_1_) {
		aByteArray11584 = new byte[i * i_0_ * i_1_ * 2];
		method5039(i, i_0_, i_1_);
		return aByteArray11584;
	}

	void method9311(int i, byte i_2_) {
		int i_3_ = i * 2;
		int i_4_ = i_2_ & 0xff;
		aByteArray11584[i_3_++] = (byte) -1;
		aByteArray11584[i_3_] = (byte) (3 * i_4_ >> 5);
	}

	byte[] method10630(int i, int i_5_, int i_6_) {
		aByteArray11584 = new byte[i * i_5_ * i_6_ * 2];
		method5039(i, i_5_, i_6_);
		return aByteArray11584;
	}

	byte[] method10631(int i, int i_7_, int i_8_) {
		aByteArray11584 = new byte[i * i_7_ * i_8_ * 2];
		method5039(i, i_7_, i_8_);
		return aByteArray11584;
	}

	byte[] method10632(int i, int i_9_, int i_10_) {
		aByteArray11584 = new byte[i * i_9_ * i_10_ * 2];
		method5039(i, i_9_, i_10_);
		return aByteArray11584;
	}

	Class418_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	void method9312(int i, byte i_11_) {
		int i_12_ = i * 2;
		int i_13_ = i_11_ & 0xff;
		aByteArray11584[i_12_++] = (byte) -1;
		aByteArray11584[i_12_] = (byte) (3 * i_13_ >> 5);
	}
}
