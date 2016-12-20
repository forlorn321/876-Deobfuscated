/* Class527_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub4_Sub2 extends Class527_Sub4 {
	String aString11659;
	Class338 this$0;
	byte aByte11660;
	int anInt11661;

	void method16048(Class527_Sub21 class527_sub21, byte i) {
		Class345 class345 = new Class345();
		class345.aString3697 = aString11659;
		class345.anInt3698 = -1599293261 * anInt11661;
		class345.aByte3699 = aByte11660;
		class527_sub21.method16207(class345, 414803814);
	}

	void method16049(RSByteBuffer class527_sub38, byte i) {
		if (class527_sub38.readUnsignedByte() != 255) {
			class527_sub38.anInt10689 -= 1474750881;
			class527_sub38.method16612((byte) 1);
		}
		aString11659 = class527_sub38.method16456((byte) 45);
		anInt11661 = class527_sub38.readUnsignedShort() * 443327627;
		aByte11660 = class527_sub38.readByte();
		class527_sub38.method16612((byte) 1);
	}

	Class527_Sub4_Sub2(Class338 class338) {
		this$0 = class338;
		aString11659 = null;
	}

	void method16050(RSByteBuffer class527_sub38) {
		if (class527_sub38.readUnsignedByte() != 255) {
			class527_sub38.anInt10689 -= 1474750881;
			class527_sub38.method16612((byte) 1);
		}
		aString11659 = class527_sub38.method16456((byte) 42);
		anInt11661 = class527_sub38.readUnsignedShort() * 443327627;
		aByte11660 = class527_sub38.readByte();
		class527_sub38.method16612((byte) 1);
	}

	void method16051(Class527_Sub21 class527_sub21) {
		Class345 class345 = new Class345();
		class345.aString3697 = aString11659;
		class345.anInt3698 = -1599293261 * anInt11661;
		class345.aByte3699 = aByte11660;
		class527_sub21.method16207(class345, 1897932066);
	}
}
