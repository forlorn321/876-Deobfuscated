/* Class536_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub37 extends Class536 {
	int anInt10635;
	Class393 aClass393_10636;
	float aFloat10637;
	int anInt10638;
	float aFloat10639;
	int anInt10640;
	Class156 aClass156_10641;
	static float[] aFloatArray10642 = new float[3];

	void method9819(int i) {
		anInt10640 = aClass156_10641.anInt1734 * 1916371897;
		anInt10638 = 1311205727 * aClass156_10641.anInt1737;
		anInt10635 = aClass156_10641.anInt1739 * -941013675;
		if (null != aClass156_10641.aClass443_1740)
			aClass156_10641.aClass443_1740.method5348((float) (aClass393_10636.anInt4085 * 255434317), (float) (-1979287149 * aClass393_10636.anInt4086), (float) (23474543 * aClass393_10636.anInt4073), aFloatArray10642);
		aFloat10637 = aFloatArray10642[0];
		aFloat10639 = aFloatArray10642[2];
	}

	Class536_Sub37(Class156 class156, Class627 class627) {
		aClass156_10641 = class156;
		aClass393_10636 = aClass156_10641.method1882(Class532.anInterface46_7121, -964929238);
		method9819(-2106340981);
	}

	static boolean method9820(int i, int i_0_) {
		return i == 16 || i == 0 || 8 == i || i == 9;
	}
}
