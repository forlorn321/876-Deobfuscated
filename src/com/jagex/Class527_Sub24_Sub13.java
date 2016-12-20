/* Class527_Sub24_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub24_Sub13 extends Class527_Sub24 {
	boolean aBool11718;
	int anInt11719;
	Class352 this$0;

	Class527_Sub24_Sub13(Class352 class352) {
		this$0 = class352;
		anInt11719 = 1976101033;
	}

	void method16247(RSByteBuffer class527_sub38) {
		anInt11719 = class527_sub38.readUnsignedShort() * -1976101033;
		aBool11718 = class527_sub38.readUnsignedByte() == 1;
	}

	void method16248(RSByteBuffer class527_sub38, byte i) {
		anInt11719 = class527_sub38.readUnsignedShort() * -1976101033;
		aBool11718 = class527_sub38.readUnsignedByte() == 1;
	}

	void method16246(RSByteBuffer class527_sub38) {
		anInt11719 = class527_sub38.readUnsignedShort() * -1976101033;
		aBool11718 = class527_sub38.readUnsignedByte() == 1;
	}

	void method16244(Class346 class346, int i) {
		class346.method6108(anInt11719 * -765344665, aBool11718, 1367910394);
	}

	void method16245(Class346 class346) {
		class346.method6108(anInt11719 * -765344665, aBool11718, -816592118);
	}

	void method16249(Class346 class346) {
		class346.method6108(anInt11719 * -765344665, aBool11718, -2075876184);
	}
}
