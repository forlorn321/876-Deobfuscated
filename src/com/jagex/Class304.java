/* Class304 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class304 {
	public int[] anIntArray3433;
	public long aLong3434;
	float[] aFloatArray3435;
	int[][] anIntArrayArray3436;
	int[][] anIntArrayArray3437;
	public short[] aShortArray3438;
	public short[] aShortArray3439;
	static int anInt3440;

	public Class304(Class296 class296, boolean bool) {
		if (bool) {
			anIntArray3433 = new int[class296.anIntArray3317.length];
			aFloatArray3435 = new float[class296.anIntArray3317.length];
			anIntArrayArray3436 = new int[class296.anIntArray3317.length][3];
			anIntArrayArray3437 = new int[class296.anIntArray3317.length][3];
			System.arraycopy(class296.anIntArray3317, 0, anIntArray3433, 0, anIntArray3433.length);
		} else {
			anIntArray3433 = new int[class296.anIntArray3274.length];
			aFloatArray3435 = new float[class296.anIntArray3274.length];
			anIntArrayArray3436 = new int[class296.anIntArray3274.length][3];
			anIntArrayArray3437 = new int[class296.anIntArray3274.length][3];
			System.arraycopy(class296.anIntArray3274, 0, anIntArray3433, 0, anIntArray3433.length);
		}
		if (class296.aShortArray3278 != null) {
			aShortArray3438 = new short[class296.aShortArray3278.length];
			System.arraycopy(class296.aShortArray3278, 0, aShortArray3438, 0, aShortArray3438.length);
		}
		if (null != class296.aShortArray3281) {
			aShortArray3439 = new short[class296.aShortArray3281.length];
			System.arraycopy(class296.aShortArray3281, 0, aShortArray3439, 0, aShortArray3439.length);
		}
	}

	public Class304(long l, int[] is, float[] fs, int[][] is_0_, int[][] is_1_, short[] is_2_, short[] is_3_) {
		aLong3434 = 1195640203384682761L * l;
		anIntArray3433 = is;
		aFloatArray3435 = fs;
		anIntArrayArray3436 = is_0_;
		anIntArrayArray3437 = is_1_;
		aShortArray3438 = is_2_;
		aShortArray3439 = is_3_;
	}
}
