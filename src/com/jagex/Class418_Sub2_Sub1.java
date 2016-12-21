/* Class418_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class418_Sub2_Sub1 extends Class418_Sub2 {
	byte[] aByteArray11583;

	void method9313(int i, byte i_0_) {
		int i_1_ = i * 2;
		i_0_ = (byte) (127 + ((i_0_ & 0xff) >> 1));
		aByteArray11583[i_1_++] = i_0_;
		aByteArray11583[i_1_] = i_0_;
	}

	byte[] method10627(int i, int i_2_, int i_3_) {
		aByteArray11583 = new byte[i * i_2_ * i_3_ * 2];
		method5039(i, i_2_, i_3_);
		return aByteArray11583;
	}

	void method9314(int i, byte i_4_) {
		int i_5_ = i * 2;
		i_4_ = (byte) (127 + ((i_4_ & 0xff) >> 1));
		aByteArray11583[i_5_++] = i_4_;
		aByteArray11583[i_5_] = i_4_;
	}

	Class418_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	byte[] method10628(int i, int i_6_, int i_7_) {
		aByteArray11583 = new byte[i * i_6_ * i_7_ * 2];
		method5039(i, i_6_, i_7_);
		return aByteArray11583;
	}
}
