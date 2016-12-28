/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class12 {
	static final int anInt146 = 8;
	static final int anInt147 = 4;
	static final int anInt148 = 2;
	public int[] anIntArray149 = new int[3];
	static final int anInt150 = 2;
	static final int anInt151 = 1;
	public int[] anIntArray152 = new int[3];
	public int[] anIntArray153 = new int[2];
	public int[] anIntArray154 = new int[2];
	public short[] aShortArray155;
	public short[] aShortArray156;

	Class12(ItemDefinitions class1) {
		anIntArray149[0] = class1.maleEquip1 * -64038767;
		anIntArray149[1] = 661594531 * class1.maleEquip2;
		anIntArray149[2] = 1280785913 * class1.maleEquipModelId3;
		anIntArray152[0] = -324829393 * class1.femaleEquip1;
		anIntArray152[1] = class1.femaleEquip2 * -490119801;
		anIntArray152[2] = 835049345 * class1.femaleEquipModelId3;
		anIntArray153[0] = class1.anInt57 * -1724009923;
		anIntArray153[1] = class1.anInt58 * -869646663;
		anIntArray154[0] = class1.anInt59 * 1399733061;
		anIntArray154[1] = class1.anInt82 * 1550687287;
		if (class1.modifiedModelColors != null) {
			aShortArray155 = new short[class1.modifiedModelColors.length];
			System.arraycopy(class1.modifiedModelColors, 0, aShortArray155, 0, aShortArray155.length);
		}
		if (null != class1.modifiedTextureColors) {
			aShortArray156 = new short[class1.modifiedTextureColors.length];
			System.arraycopy(class1.modifiedTextureColors, 0, aShortArray156, 0, aShortArray156.length);
		}
	}

	static final void method621(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_0_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		boolean bool = 1 == (class668.anIntArray8541[1 + 1867269829 * class668.anInt8542]);
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = Class536_Sub8.method9409(i_0_, bool, -907896907);
	}
}
