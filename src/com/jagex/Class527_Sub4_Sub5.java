/* Class527_Sub4_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub4_Sub5 extends Class527_Sub4 {
	int anInt11708;
	byte aByte11709;
	int anInt11710;
	String aString11711;
	Class338 this$0;

	void method16049(RSByteBuffer class527_sub38, byte i) {
		anInt11708 = class527_sub38.readUnsignedShort() * 1063124075;
		aByte11709 = class527_sub38.readByte();
		anInt11710 = class527_sub38.readUnsignedShort() * 468525919;
		class527_sub38.method16612((byte) 1);
		aString11711 = class527_sub38.readString(1365228370);
	}

	void method16050(RSByteBuffer class527_sub38) {
		anInt11708 = class527_sub38.readUnsignedShort() * 1063124075;
		aByte11709 = class527_sub38.readByte();
		anInt11710 = class527_sub38.readUnsignedShort() * 468525919;
		class527_sub38.method16612((byte) 1);
		aString11711 = class527_sub38.readString(1807391731);
	}

	void method16048(Class527_Sub21 class527_sub21, byte i) {
		Class345 class345 = class527_sub21.aClass345Array10485[anInt11708 * 2079379523];
		class345.aByte3699 = aByte11709;
		class345.anInt3698 = anInt11710 * 723435887;
		class345.aString3697 = aString11711;
	}

	void method16051(Class527_Sub21 class527_sub21) {
		Class345 class345 = class527_sub21.aClass345Array10485[anInt11708 * 2079379523];
		class345.aByte3699 = aByte11709;
		class345.anInt3698 = anInt11710 * 723435887;
		class345.aString3697 = aString11711;
	}

	Class527_Sub4_Sub5(Class338 class338) {
		this$0 = class338;
		anInt11708 = -1063124075;
	}
}
