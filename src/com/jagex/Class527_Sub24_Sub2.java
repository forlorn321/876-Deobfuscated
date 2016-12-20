/* Class527_Sub24_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub24_Sub2 extends Class527_Sub24 {
	byte aByte11628;
	byte aByte11629;
	byte aByte11630;
	Class352 this$0;
	byte aByte11631;
	boolean aBool11632;

	void method16247(RSByteBuffer class527_sub38) {
		aBool11632 = class527_sub38.readUnsignedByte() == 1;
		aByte11628 = class527_sub38.readByte();
		aByte11630 = class527_sub38.readByte();
		aByte11629 = class527_sub38.readByte();
		aByte11631 = class527_sub38.readByte();
	}

	Class527_Sub24_Sub2(Class352 class352) {
		this$0 = class352;
	}

	void method16244(Class346 class346, int i) {
		class346.aBool3700 = aBool11632;
		class346.aByte3708 = aByte11628;
		class346.aByte3709 = aByte11630;
		class346.aByte3710 = aByte11629;
		class346.aByte3723 = aByte11631;
	}

	void method16246(RSByteBuffer class527_sub38) {
		aBool11632 = class527_sub38.readUnsignedByte() == 1;
		aByte11628 = class527_sub38.readByte();
		aByte11630 = class527_sub38.readByte();
		aByte11629 = class527_sub38.readByte();
		aByte11631 = class527_sub38.readByte();
	}

	void method16248(RSByteBuffer class527_sub38, byte i) {
		aBool11632 = class527_sub38.readUnsignedByte() == 1;
		aByte11628 = class527_sub38.readByte();
		aByte11630 = class527_sub38.readByte();
		aByte11629 = class527_sub38.readByte();
		aByte11631 = class527_sub38.readByte();
	}

	void method16245(Class346 class346) {
		class346.aBool3700 = aBool11632;
		class346.aByte3708 = aByte11628;
		class346.aByte3709 = aByte11630;
		class346.aByte3710 = aByte11629;
		class346.aByte3723 = aByte11631;
	}

	void method16249(Class346 class346) {
		class346.aBool3700 = aBool11632;
		class346.aByte3708 = aByte11628;
		class346.aByte3709 = aByte11630;
		class346.aByte3710 = aByte11629;
		class346.aByte3723 = aByte11631;
	}

	static final void method18174(Class243 class243, Class240 class240, Class665 class665, int i) {
		class243.aString2614 = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
	}
}
