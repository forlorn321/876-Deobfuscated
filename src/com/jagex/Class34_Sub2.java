/* Class34_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class34_Sub2 extends Class34 {
	public Class34_Sub2(Class670 class670, Class664 class664, Class461 class461, Class461 class461_0_) {
		super(class670, class664, class461, Class648.aClass648_8380, 64, new Class312(class461_0_));
	}

	static final int method10303(int i, int i_1_, int i_2_, int i_3_) {
		if (i_1_ == i)
			return i;
		int i_4_ = 128 - i_2_;
		int i_5_ = i_4_ * (i & 0x7f) + (i_1_ & 0x7f) * i_2_ >> 7;
		int i_6_ = i_4_ * (i & 0x380) + (i_1_ & 0x380) * i_2_ >> 7;
		int i_7_ = (i & 0xfc00) * i_4_ + i_2_ * (i_1_ & 0xfc00) >> 7;
		return i_7_ & 0xfc00 | i_6_ & 0x380 | i_5_ & 0x7f;
	}
}
