/* Class536_Sub24_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub24_Sub2 extends Class536_Sub24 {
	String aString11633;
	byte aByte11634;
	int anInt11635;
	Class353 this$0;

	void method9589(Class536_Sub15 class536_sub15) {
		Class349 class349 = new Class349();
		class349.aString3695 = aString11633;
		class349.anInt3697 = anInt11635 * -1069994167;
		class349.aByte3696 = aByte11634;
		class536_sub15.method9503(class349, (byte) 1);
	}

	Class536_Sub24_Sub2(Class353 class353) {
		this$0 = class353;
		aString11633 = null;
	}

	void method9584(Class536_Sub15 class536_sub15, int i) {
		Class349 class349 = new Class349();
		class349.aString3695 = aString11633;
		class349.anInt3697 = anInt11635 * -1069994167;
		class349.aByte3696 = aByte11634;
		class536_sub15.method9503(class349, (byte) 1);
	}

	void method9586(RSByteBuffer class536_sub33) {
		if (class536_sub33.readUnsignedByte(603503296) != 255) {
			class536_sub33.off -= 516175515;
			class536_sub33.method9711(702869087);
		}
		aString11633 = class536_sub33.method9713(16509697);
		anInt11635 = class536_sub33.readUnsignedShort() * -1078125309;
		aByte11634 = class536_sub33.readByte();
		class536_sub33.method9711(702869087);
	}

	void method9588(RSByteBuffer class536_sub33) {
		if (class536_sub33.readUnsignedByte(-1457622728) != 255) {
			class536_sub33.off -= 516175515;
			class536_sub33.method9711(702869087);
		}
		aString11633 = class536_sub33.method9713(16509697);
		anInt11635 = class536_sub33.readUnsignedShort() * -1078125309;
		aByte11634 = class536_sub33.readByte();
		class536_sub33.method9711(702869087);
	}

	void method9587(Class536_Sub15 class536_sub15) {
		Class349 class349 = new Class349();
		class349.aString3695 = aString11633;
		class349.anInt3697 = anInt11635 * -1069994167;
		class349.aByte3696 = aByte11634;
		class536_sub15.method9503(class349, (byte) 1);
	}

	void method9590(Class536_Sub15 class536_sub15) {
		Class349 class349 = new Class349();
		class349.aString3695 = aString11633;
		class349.anInt3697 = anInt11635 * -1069994167;
		class349.aByte3696 = aByte11634;
		class536_sub15.method9503(class349, (byte) 1);
	}

	void method9585(RSByteBuffer class536_sub33, int i) {
		if (class536_sub33.readUnsignedByte(227639597) != 255) {
			class536_sub33.off -= 516175515;
			class536_sub33.method9711(702869087);
		}
		aString11633 = class536_sub33.method9713(16509697);
		anInt11635 = class536_sub33.readUnsignedShort() * -1078125309;
		aByte11634 = class536_sub33.readByte();
		class536_sub33.method9711(702869087);
	}
}
