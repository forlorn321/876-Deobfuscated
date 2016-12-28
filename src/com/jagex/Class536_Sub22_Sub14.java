/* Class536_Sub22_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub22_Sub14 extends Class536_Sub22 {
	String aString11701;
	long aLong11702;
	Class344 this$0;

	void method9577(RSByteBuffer class536_sub33) {
		if (class536_sub33.readUnsignedByte() != 255) {
			class536_sub33.off -= 516175515;
			aLong11702 = class536_sub33.readLong() * 6999452287882596215L;
		}
		aString11701 = class536_sub33.method9713(16509697);
	}

	void method9578(RSByteBuffer class536_sub33, int i) {
		if (class536_sub33.readUnsignedByte() != 255) {
			class536_sub33.off -= 516175515;
			aLong11702 = class536_sub33.readLong() * 6999452287882596215L;
		}
		aString11701 = class536_sub33.method9713(16509697);
	}

	Class536_Sub22_Sub14(Class344 class344) {
		this$0 = class344;
		aLong11702 = -6999452287882596215L;
		aString11701 = null;
	}

	void method9580(ClanSettings class350) {
		class350.method4605(aLong11702 * -8272249061848253881L, aString11701, (byte) 100);
	}

	void method9579(RSByteBuffer class536_sub33) {
		if (class536_sub33.readUnsignedByte() != 255) {
			class536_sub33.off -= 516175515;
			aLong11702 = class536_sub33.readLong() * 6999452287882596215L;
		}
		aString11701 = class536_sub33.method9713(16509697);
	}

	void method9581(ClanSettings class350, int i) {
		class350.method4605(aLong11702 * -8272249061848253881L, aString11701, (byte) -51);
	}
}
