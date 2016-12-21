/* Class418_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class418_Sub2_Sub2 extends Class418_Sub2 {
	byte[] aByteArray11615;

	void method9314(int i, byte i_0_) {
		int i_1_ = i * 2;
		i_0_ = (byte) (127 + ((i_0_ & 0xff) >> 1));
		aByteArray11615[i_1_++] = i_0_;
		aByteArray11615[i_1_] = i_0_;
	}

	void method9313(int i, byte i_2_) {
		int i_3_ = i * 2;
		i_2_ = (byte) (127 + ((i_2_ & 0xff) >> 1));
		aByteArray11615[i_3_++] = i_2_;
		aByteArray11615[i_3_] = i_2_;
	}

	byte[] method10638(int i, int i_4_, int i_5_) {
		aByteArray11615 = new byte[i * i_4_ * i_5_ * 2];
		method5039(i, i_4_, i_5_);
		return aByteArray11615;
	}

	byte[] method10639(int i, int i_6_, int i_7_) {
		aByteArray11615 = new byte[i * i_6_ * i_7_ * 2];
		method5039(i, i_6_, i_7_);
		return aByteArray11615;
	}

	Class418_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}
}
