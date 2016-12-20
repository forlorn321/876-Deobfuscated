/* Class527_Sub24_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub24_Sub4 extends Class527_Sub24 {
	int anInt11635;
	String aString11636;
	long aLong11637;
	Class352 this$0;

	void method16249(Class346 class346) {
		class346.method6102(5305970944462232569L * aLong11637, aString11636, -469833531 * anInt11635, -990921226);
	}

	Class527_Sub24_Sub4(Class352 class352) {
		this$0 = class352;
		aLong11637 = 8468830092018665911L;
		aString11636 = null;
		anInt11635 = 0;
	}

	void method16247(RSByteBuffer class527_sub38) {
		if (class527_sub38.readUnsignedByte() != 255) {
			class527_sub38.anInt10689 -= 1474750881;
			aLong11637 = class527_sub38.method16612((byte) 1) * -8468830092018665911L;
		}
		aString11636 = class527_sub38.method16456((byte) 27);
		anInt11635 = class527_sub38.readUnsignedShort() * 673994253;
	}

	void method16246(RSByteBuffer class527_sub38) {
		if (class527_sub38.readUnsignedByte() != 255) {
			class527_sub38.anInt10689 -= 1474750881;
			aLong11637 = class527_sub38.method16612((byte) 1) * -8468830092018665911L;
		}
		aString11636 = class527_sub38.method16456((byte) 19);
		anInt11635 = class527_sub38.readUnsignedShort() * 673994253;
	}

	void method16248(RSByteBuffer class527_sub38, byte i) {
		if (class527_sub38.readUnsignedByte() != 255) {
			class527_sub38.anInt10689 -= 1474750881;
			aLong11637 = class527_sub38.method16612((byte) 1) * -8468830092018665911L;
		}
		aString11636 = class527_sub38.method16456((byte) 12);
		anInt11635 = class527_sub38.readUnsignedShort() * 673994253;
	}

	void method16245(Class346 class346) {
		class346.method6102(5305970944462232569L * aLong11637, aString11636, -469833531 * anInt11635, -311041326);
	}

	void method16244(Class346 class346, int i) {
		class346.method6102(5305970944462232569L * aLong11637, aString11636, -469833531 * anInt11635, -1911718773);
	}
}
