/* Class527_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class527_Sub24 extends Class527 {
	abstract void method16244(Class346 class346, int i);

	Class527_Sub24() {
		/* empty */
	}

	abstract void method16245(Class346 class346);

	abstract void method16246(RSByteBuffer class527_sub38);

	abstract void method16247(RSByteBuffer class527_sub38);

	abstract void method16248(RSByteBuffer class527_sub38, byte i);

	abstract void method16249(Class346 class346);

	static final void method16250(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (((Class640_Sub1_Sub2_Sub1_Sub1) class665.aClass640_Sub1_Sub2_Sub1_8522).aClass295_12168.anInt3345) * -596975525;
	}

	static final String method16251(String string, String string_0_, String string_1_, int i) {
		for (int i_2_ = string.indexOf(string_0_); -1 != i_2_; i_2_ = string.indexOf(string_0_, i_2_ + string_1_.length()))
			string = new StringBuilder().append(string.substring(0, i_2_)).append(string_1_).append(string.substring(i_2_ + string_0_.length())).toString();
		return string;
	}
}
