/* Class536_Sub22_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub22_Sub9 extends Class536_Sub22 {
	byte aByte11688;
	int anInt11689;
	Class344 this$0;

	Class536_Sub22_Sub9(Class344 class344) {
		this$0 = class344;
		anInt11689 = -1833753155;
	}

	void method9578(RSByteBuffer class536_sub33, int i) {
		anInt11689 = class536_sub33.readUnsignedShort() * 1833753155;
		aByte11688 = class536_sub33.readByte();
	}

	void method9577(RSByteBuffer class536_sub33) {
		anInt11689 = class536_sub33.readUnsignedShort() * 1833753155;
		aByte11688 = class536_sub33.readByte();
	}

	void method9580(Class350 class350) {
		class350.method4607(anInt11689 * -1744911765, aByte11688, (byte) 71);
	}

	void method9581(Class350 class350, int i) {
		class350.method4607(anInt11689 * -1744911765, aByte11688, (byte) 105);
	}

	void method9579(RSByteBuffer class536_sub33) {
		anInt11689 = class536_sub33.readUnsignedShort() * 1833753155;
		aByte11688 = class536_sub33.readByte();
	}
}
