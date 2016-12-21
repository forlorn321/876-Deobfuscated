/* Class536_Sub22_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub22_Sub8 extends Class536_Sub22 {
	int anInt11686;
	boolean aBool11687;
	Class344 this$0;

	void method9577(RSByteBuffer class536_sub33) {
		anInt11686 = class536_sub33.readUnsignedShort() * -1414803765;
		aBool11687 = class536_sub33.readUnsignedByte(577558120) == 1;
	}

	void method9578(RSByteBuffer class536_sub33, int i) {
		anInt11686 = class536_sub33.readUnsignedShort() * -1414803765;
		aBool11687 = class536_sub33.readUnsignedByte(-559865226) == 1;
	}

	void method9581(Class350 class350, int i) {
		class350.method4608(967878371 * anInt11686, aBool11687, -1411037171);
	}

	void method9580(Class350 class350) {
		class350.method4608(967878371 * anInt11686, aBool11687, -1411037171);
	}

	void method9579(RSByteBuffer class536_sub33) {
		anInt11686 = class536_sub33.readUnsignedShort() * -1414803765;
		aBool11687 = class536_sub33.readUnsignedByte(57395535) == 1;
	}

	Class536_Sub22_Sub8(Class344 class344) {
		this$0 = class344;
		anInt11686 = 1414803765;
	}

	public static int[] method10695(int i, int i_0_, int i_1_, int i_2_, int i_3_, float f, boolean bool, short i_4_) {
		int[] is = new int[i];
		Class536_Sub39_Sub1 class536_sub39_sub1 = new Class536_Sub39_Sub1();
		class536_sub39_sub1.anInt11749 = i_0_ * 623325255;
		class536_sub39_sub1.aBool11751 = bool;
		class536_sub39_sub1.anInt11747 = i_1_ * -2021742323;
		class536_sub39_sub1.anInt11748 = i_2_ * -1292247997;
		class536_sub39_sub1.anInt11738 = i_3_ * -1791185511;
		class536_sub39_sub1.anInt11750 = (int) (4096.0F * f) * -92961567;
		class536_sub39_sub1.method10745((byte) -27);
		Class28.method765(i, 1, 1946079257);
		class536_sub39_sub1.method10743(0, is, -832770990);
		return is;
	}
}
