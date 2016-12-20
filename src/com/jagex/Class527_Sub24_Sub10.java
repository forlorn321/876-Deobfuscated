/* Class527_Sub24_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub24_Sub10 extends Class527_Sub24 {
	long aLong11706;
	String aString11707;
	Class352 this$0;

	void method16246(RSByteBuffer class527_sub38) {
		if (class527_sub38.readUnsignedByte() != 255) {
			class527_sub38.anInt10689 -= 1474750881;
			aLong11706 = class527_sub38.method16612((byte) 1) * -2343912327521313317L;
		}
		aString11707 = class527_sub38.method16456((byte) 118);
	}

	void method16248(RSByteBuffer class527_sub38, byte i) {
		if (class527_sub38.readUnsignedByte() != 255) {
			class527_sub38.anInt10689 -= 1474750881;
			aLong11706 = class527_sub38.method16612((byte) 1) * -2343912327521313317L;
		}
		aString11707 = class527_sub38.method16456((byte) 52);
	}

	void method16244(Class346 class346, int i) {
		class346.method6102(aLong11706 * 8400969047354365523L, aString11707, 0, -1961858924);
	}

	void method16247(RSByteBuffer class527_sub38) {
		if (class527_sub38.readUnsignedByte() != 255) {
			class527_sub38.anInt10689 -= 1474750881;
			aLong11706 = class527_sub38.method16612((byte) 1) * -2343912327521313317L;
		}
		aString11707 = class527_sub38.method16456((byte) 43);
	}

	Class527_Sub24_Sub10(Class352 class352) {
		this$0 = class352;
		aLong11706 = 2343912327521313317L;
		aString11707 = null;
	}

	void method16245(Class346 class346) {
		class346.method6102(aLong11706 * 8400969047354365523L, aString11707, 0, -186153084);
	}

	void method16249(Class346 class346) {
		class346.method6102(aLong11706 * 8400969047354365523L, aString11707, 0, -1233227110);
	}
}
