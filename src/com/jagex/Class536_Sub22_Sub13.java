/* Class536_Sub22_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub22_Sub13 extends Class536_Sub22 {
	int anInt11699;
	String aString11700;
	Class344 this$0;

	void method9577(RSByteBuffer class536_sub33) {
		anInt11699 = class536_sub33.readInt() * 526379135;
		aString11700 = class536_sub33.readString();
	}

	void method9578(RSByteBuffer class536_sub33, int i) {
		anInt11699 = class536_sub33.readInt() * 526379135;
		aString11700 = class536_sub33.readString();
	}

	Class536_Sub22_Sub13(Class344 class344) {
		this$0 = class344;
	}

	void method9581(ClanSettings class350, int i) {
		class350.method4631(anInt11699 * 542627711, aString11700, (byte) -57);
	}

	void method9580(ClanSettings class350) {
		class350.method4631(anInt11699 * 542627711, aString11700, (byte) -119);
	}

	void method9579(RSByteBuffer class536_sub33) {
		anInt11699 = class536_sub33.readInt() * 526379135;
		aString11700 = class536_sub33.readString();
	}
}
