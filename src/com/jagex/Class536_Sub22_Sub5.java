/* Class536_Sub22_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub22_Sub5 extends Class536_Sub22 {
	Class344 this$0;
	long aLong11642;
	int anInt11643;
	String aString11644;
	static int[] anIntArray11645;

	void method9579(RSByteBuffer class536_sub33) {
		if (class536_sub33.readUnsignedByte() != 255) {
			class536_sub33.off -= 516175515;
			aLong11642 = class536_sub33.readLong(702869087) * 8417995427124404013L;
		}
		aString11644 = class536_sub33.method9713(16509697);
		anInt11643 = class536_sub33.readUnsignedShort() * -1381220747;
	}

	Class536_Sub22_Sub5(Class344 class344) {
		this$0 = class344;
		aLong11642 = -8417995427124404013L;
		aString11644 = null;
		anInt11643 = 0;
	}

	void method9581(ClanSettings class350, int i) {
		class350.method4622(aLong11642 * 2268804058876594341L, aString11644, anInt11643 * 1058873821, 480900602);
	}

	void method9580(ClanSettings class350) {
		class350.method4622(aLong11642 * 2268804058876594341L, aString11644, anInt11643 * 1058873821, -1318011527);
	}

	void method9577(RSByteBuffer class536_sub33) {
		if (class536_sub33.readUnsignedByte() != 255) {
			class536_sub33.off -= 516175515;
			aLong11642 = class536_sub33.readLong(702869087) * 8417995427124404013L;
		}
		aString11644 = class536_sub33.method9713(16509697);
		anInt11643 = class536_sub33.readUnsignedShort() * -1381220747;
	}

	void method9578(RSByteBuffer class536_sub33, int i) {
		if (class536_sub33.readUnsignedByte() != 255) {
			class536_sub33.off -= 516175515;
			aLong11642 = class536_sub33.readLong(702869087) * 8417995427124404013L;
		}
		aString11644 = class536_sub33.method9713(16509697);
		anInt11643 = class536_sub33.readUnsignedShort() * -1381220747;
	}
}
