/* Class447 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class447 {
	public static final int anInt4904 = 12288;
	public static final int anInt4905 = 16383;
	public static int[] anIntArray4906 = new int[16384];
	public static final int anInt4907 = 14;
	public static final int anInt4908 = 4096;
	public static final double aDouble4909 = 2607.5945876176133;
	public static final int anInt4910 = 14;
	public static final int anInt4911 = 1024;
	public static final int anInt4912 = 2048;
	public static final int anInt4913 = 16384;
	public static final int anInt4914 = 6144;
	public static final int anInt4915 = 8192;
	public static final int anInt4916 = 10240;
	public static final int anInt4917 = 16383;
	public static final int anInt4918 = 14336;
	public static final int anInt4919 = 16384;
	public static final int anInt4920 = 16384;
	public static int[] anIntArray4921 = new int[16384];

	Class447() throws Throwable {
		throw new Error();
	}

	public static float method5400(int i) {
		i &= 0x3fff;
		return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
	}

	public static float method5401(int i) {
		i &= 0x3fff;
		return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
	}

	static {
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			anIntArray4906[i] = (int) (16384.0 * Math.sin((double) i * d));
			anIntArray4921[i] = (int) (16384.0 * Math.cos((double) i * d));
		}
	}
}
