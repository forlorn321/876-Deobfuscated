/* Class527_Sub4_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub4_Sub3 extends Class527_Sub4 {
	static int anInt11697;
	byte aByte11698;
	int anInt11699;
	int anInt11700;
	Class338 this$0;
	String aString11701;

	void method16051(Class527_Sub21 class527_sub21) {
		Class345 class345 = class527_sub21.aClass345Array10485[anInt11699 * 1458074987];
		class345.aByte3699 = aByte11698;
		class345.anInt3698 = anInt11700 * 212721487;
		class345.aString3697 = aString11701;
	}

	void method16049(RSByteBuffer class527_sub38, byte i) {
		class527_sub38.readUnsignedByte();
		anInt11699 = class527_sub38.readUnsignedShort() * -1328017597;
		aByte11698 = class527_sub38.readByte();
		anInt11700 = class527_sub38.readUnsignedShort() * 1753006975;
		class527_sub38.method16612((byte) 1);
		aString11701 = class527_sub38.readString(1106355111);
		class527_sub38.readUnsignedByte();
	}

	void method16048(Class527_Sub21 class527_sub21, byte i) {
		Class345 class345 = class527_sub21.aClass345Array10485[anInt11699 * 1458074987];
		class345.aByte3699 = aByte11698;
		class345.anInt3698 = anInt11700 * 212721487;
		class345.aString3697 = aString11701;
	}

	void method16050(RSByteBuffer class527_sub38) {
		class527_sub38.readUnsignedByte();
		anInt11699 = class527_sub38.readUnsignedShort() * -1328017597;
		aByte11698 = class527_sub38.readByte();
		anInt11700 = class527_sub38.readUnsignedShort() * 1753006975;
		class527_sub38.method16612((byte) 1);
		aString11701 = class527_sub38.readString(762717033);
		class527_sub38.readUnsignedByte();
	}

	Class527_Sub4_Sub3(Class338 class338) {
		this$0 = class338;
		anInt11699 = 1328017597;
	}
}
