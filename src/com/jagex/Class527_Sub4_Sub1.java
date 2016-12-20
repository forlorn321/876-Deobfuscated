/* Class527_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub4_Sub1 extends Class527_Sub4 {
	int anInt11656;
	Class338 this$0;

	void method16051(Class527_Sub21 class527_sub21) {
		class527_sub21.method16210(-964368995 * anInt11656, 2079067378);
	}

	void method16049(RSByteBuffer class527_sub38, byte i) {
		anInt11656 = class527_sub38.readUnsignedShort() * -32257867;
		class527_sub38.readUnsignedByte();
		if (class527_sub38.readUnsignedByte() != 255) {
			class527_sub38.anInt10689 -= 1474750881;
			class527_sub38.method16612((byte) 1);
		}
	}

	void method16048(Class527_Sub21 class527_sub21, byte i) {
		class527_sub21.method16210(-964368995 * anInt11656, 1629720231);
	}

	void method16050(RSByteBuffer class527_sub38) {
		anInt11656 = class527_sub38.readUnsignedShort() * -32257867;
		class527_sub38.readUnsignedByte();
		if (class527_sub38.readUnsignedByte() != 255) {
			class527_sub38.anInt10689 -= 1474750881;
			class527_sub38.method16612((byte) 1);
		}
	}

	Class527_Sub4_Sub1(Class338 class338) {
		this$0 = class338;
		anInt11656 = 32257867;
	}

	static final void method18182(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class527_Sub8_Sub2.method17900(class243, class240, class665, 1823439732);
	}
}
