/* Class536_Sub22_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub22_Sub12 extends Class536_Sub22 {
	Class344 this$0;
	String aString11698;

	void method9579(RSByteBuffer class536_sub33) {
		aString11698 = class536_sub33.readString();
		class536_sub33.readInt();
	}

	void method9577(RSByteBuffer class536_sub33) {
		aString11698 = class536_sub33.readString();
		class536_sub33.readInt();
	}

	void method9581(ClanSettings class350, int i) {
		class350.name = aString11698;
	}

	void method9580(ClanSettings class350) {
		class350.name = aString11698;
	}

	void method9578(RSByteBuffer class536_sub33, int i) {
		aString11698 = class536_sub33.readString();
		class536_sub33.readInt();
	}

	Class536_Sub22_Sub12(Class344 class344) {
		this$0 = class344;
	}
}
