/* Class536_Sub22_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub22_Sub2 extends Class536_Sub22 {
	int anInt11620;
	int anInt11621;
	int anInt11622;
	int anInt11623;
	Class344 this$0;

	void method9578(RSByteBuffer class536_sub33, int i) {
		anInt11623 = class536_sub33.readUnsignedShort() * 901195655;
		anInt11620 = class536_sub33.readInt() * 885483315;
		anInt11622 = class536_sub33.readUnsignedByte(1540130326) * 585623837;
		anInt11621 = class536_sub33.readUnsignedByte(1272254172) * 918309631;
	}

	void method9577(RSByteBuffer class536_sub33) {
		anInt11623 = class536_sub33.readUnsignedShort() * 901195655;
		anInt11620 = class536_sub33.readInt() * 885483315;
		anInt11622 = class536_sub33.readUnsignedByte(905061026) * 585623837;
		anInt11621 = class536_sub33.readUnsignedByte(1401459331) * 918309631;
	}

	void method9581(Class350 class350, int i) {
		class350.method4610(anInt11623 * -710808009, anInt11620 * -801707013, -2119163595 * anInt11622, anInt11621 * -1739934465, 1036324886);
	}

	void method9580(Class350 class350) {
		class350.method4610(anInt11623 * -710808009, anInt11620 * -801707013, -2119163595 * anInt11622, anInt11621 * -1739934465, 1370765324);
	}

	void method9579(RSByteBuffer class536_sub33) {
		anInt11623 = class536_sub33.readUnsignedShort() * 901195655;
		anInt11620 = class536_sub33.readInt() * 885483315;
		anInt11622 = class536_sub33.readUnsignedByte(-362114349) * 585623837;
		anInt11621 = class536_sub33.readUnsignedByte(-704977641) * 918309631;
	}

	Class536_Sub22_Sub2(Class344 class344) {
		this$0 = class344;
		anInt11623 = -901195655;
	}
}
