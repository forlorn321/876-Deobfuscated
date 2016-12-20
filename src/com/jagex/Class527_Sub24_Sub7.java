/* Class527_Sub24_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub24_Sub7 extends Class527_Sub24 {
	Class352 this$0;
	int anInt11657;
	byte aByte11658;

	void method16246(RSByteBuffer class527_sub38) {
		anInt11657 = class527_sub38.readUnsignedShort() * 1671636365;
		aByte11658 = class527_sub38.readByte();
	}

	void method16248(RSByteBuffer class527_sub38, byte i) {
		anInt11657 = class527_sub38.readUnsignedShort() * 1671636365;
		aByte11658 = class527_sub38.readByte();
	}

	void method16244(Class346 class346, int i) {
		class346.method6127(1759487301 * anInt11657, aByte11658, 95334585);
	}

	void method16245(Class346 class346) {
		class346.method6127(1759487301 * anInt11657, aByte11658, 1792458606);
	}

	void method16247(RSByteBuffer class527_sub38) {
		anInt11657 = class527_sub38.readUnsignedShort() * 1671636365;
		aByte11658 = class527_sub38.readByte();
	}

	Class527_Sub24_Sub7(Class352 class352) {
		this$0 = class352;
		anInt11657 = -1671636365;
	}

	void method16249(Class346 class346) {
		class346.method6127(1759487301 * anInt11657, aByte11658, -1356150275);
	}

	static final void method18183(Class665 class665, byte i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = ((Class228) Class703.aClass219_8825.method4059((byte) 92).get(i_0_)).method4310(-1752787798);
	}
}
