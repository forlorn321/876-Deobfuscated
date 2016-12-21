/* Class536_Sub22_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub22_Sub3 extends Class536_Sub22 {
	byte aByte11636;
	byte aByte11637;
	boolean aBool11638;
	byte aByte11639;
	byte aByte11640;
	Class344 this$0;

	void method9579(RSByteBuffer class536_sub33) {
		aBool11638 = class536_sub33.readUnsignedByte() == 1;
		aByte11636 = class536_sub33.readByte();
		aByte11637 = class536_sub33.readByte();
		aByte11639 = class536_sub33.readByte();
		aByte11640 = class536_sub33.readByte();
	}

	void method9578(RSByteBuffer class536_sub33, int i) {
		aBool11638 = class536_sub33.readUnsignedByte() == 1;
		aByte11636 = class536_sub33.readByte();
		aByte11637 = class536_sub33.readByte();
		aByte11639 = class536_sub33.readByte();
		aByte11640 = class536_sub33.readByte();
	}

	void method9577(RSByteBuffer class536_sub33) {
		aBool11638 = class536_sub33.readUnsignedByte() == 1;
		aByte11636 = class536_sub33.readByte();
		aByte11637 = class536_sub33.readByte();
		aByte11639 = class536_sub33.readByte();
		aByte11640 = class536_sub33.readByte();
	}

	Class536_Sub22_Sub3(Class344 class344) {
		this$0 = class344;
	}

	void method9581(Class350 class350, int i) {
		class350.aBool3724 = aBool11638;
		class350.aByte3706 = aByte11636;
		class350.aByte3698 = aByte11637;
		class350.aByte3708 = aByte11639;
		class350.aByte3704 = aByte11640;
	}

	void method9580(Class350 class350) {
		class350.aBool3724 = aBool11638;
		class350.aByte3706 = aByte11636;
		class350.aByte3698 = aByte11637;
		class350.aByte3708 = aByte11639;
		class350.aByte3704 = aByte11640;
	}
}
