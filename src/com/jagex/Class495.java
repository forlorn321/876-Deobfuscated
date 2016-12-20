/* Class495 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class495 implements Interface11 {
	public Object method74(RSByteBuffer class527_sub38) {
		return class527_sub38.readString(2041930461);
	}

	public Object method75(RSByteBuffer class527_sub38, byte i) {
		return class527_sub38.readString(2066874874);
	}

	static final void method8124(Class665 class665, int i) {
		Class53.method1291(true, -2034576485);
		Class467.method7667(-791920877);
		client.aClass509_11072.method8361(-428559959);
		Class631.method10465(-1692165058);
		client.aBool11020 = false;
	}

	static void method8125(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		float f = ((float) Class529_Sub1.anInt7167 / (float) Class529_Sub1.anInt7131);
		int i_4_ = i_1_;
		int i_5_ = i_2_;
		if (f < 1.0F)
			i_5_ = (int) (f * (float) i_1_);
		else
			i_4_ = (int) ((float) i_2_ / f);
		i -= (i_1_ - i_4_) / 2;
		i_0_ -= (i_2_ - i_5_) / 2;
		Class529_Sub1.anInt10783 = 2049864907 * (Class529_Sub1.anInt7131 * i / i_4_);
		Class635.anInt8302 = (Class529_Sub1.anInt7167 - i_0_ * Class529_Sub1.anInt7167 / i_5_) * -1224612011;
		Class529_Sub1.anInt10779 = -1449615877;
		Class529_Sub1.anInt10772 = -1784395681;
		Class146.method2401((byte) 106);
	}
}
