/* Class428 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class428 {
	public static final int anInt4809 = 2048;
	public static final int anInt4810 = 16383;
	public static final int anInt4811 = 12288;
	public static final double aDouble4812 = 2607.5945876176133;
	public static final int anInt4813 = 16384;
	public static final int anInt4814 = 16383;
	public static final int anInt4815 = 14;
	public static final int anInt4816 = 1024;
	public static final int anInt4817 = 16384;
	public static final int anInt4818 = 4096;
	public static int[] anIntArray4819;
	public static final int anInt4820 = 8192;
	public static final int anInt4821 = 10240;
	public static final int anInt4822 = 6144;
	public static final int anInt4823 = 14336;
	public static final int anInt4824 = 16384;
	public static int[] anIntArray4825 = new int[16384];
	public static final int anInt4826 = 14;

	public static float method6860(int i) {
		i &= 0x3fff;
		return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
	}

	public static float method6861(int i) {
		i &= 0x3fff;
		return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
	}

	static {
		anIntArray4819 = new int[16384];
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			anIntArray4825[i] = (int) (16384.0 * Math.sin((double) i * d));
			anIntArray4819[i] = (int) (16384.0 * Math.cos((double) i * d));
		}
	}

	public static float method6862(int i) {
		i &= 0x3fff;
		return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
	}

	Class428() throws Throwable {
		throw new Error();
	}

	public static float method6863(int i) {
		i &= 0x3fff;
		return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
	}

	public static float method6864(int i) {
		i &= 0x3fff;
		return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
	}

	public static float method6865(int i) {
		i &= 0x3fff;
		return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
	}
}
