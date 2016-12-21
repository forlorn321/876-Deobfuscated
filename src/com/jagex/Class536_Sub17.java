/* Class536_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub17 extends Class536 {
	int[] anIntArray10490;
	int anInt10491;
	public static final int anInt10492 = 0;
	int anInt10493;
	public static final int anInt10494 = 3;
	static final int anInt10495 = 6;
	public static final int anInt10496 = 7;
	public static final int anInt10497 = 8;
	public static final int anInt10498 = 9;
	public static final int anInt10499 = 10;
	public static final int anInt10500 = 1;
	public static final int anInt10501 = 5;
	public static final int anInt10502 = 2;
	int[][] anIntArrayArray10503;
	boolean[] aBoolArray10504;
	int[] anIntArray10505;

	Class536_Sub17(int i, byte[] is) {
		anInt10493 = i * -1882608485;
		RSByteBuffer class536_sub33 = new RSByteBuffer(is);
		anInt10491 = class536_sub33.readUnsignedShort((short) -329) * 1627729007;
		anIntArray10505 = new int[-138825073 * anInt10491];
		anIntArrayArray10503 = new int[-138825073 * anInt10491][];
		aBoolArray10504 = new boolean[anInt10491 * -138825073];
		anIntArray10490 = new int[anInt10491 * -138825073];
		for (int i_0_ = 0; i_0_ < anInt10491 * -138825073; i_0_++) {
			anIntArray10505[i_0_] = class536_sub33.readUnsignedByte(-945857428);
			if (6 == anIntArray10505[i_0_])
				anIntArray10505[i_0_] = 2;
		}
		for (int i_1_ = 0; i_1_ < anInt10491 * -138825073; i_1_++)
			aBoolArray10504[i_1_] = class536_sub33.readUnsignedByte(1961985859) == 1;
		for (int i_2_ = 0; i_2_ < anInt10491 * -138825073; i_2_++)
			anIntArray10490[i_2_] = class536_sub33.readUnsignedShort((short) -2951);
		for (int i_3_ = 0; i_3_ < anInt10491 * -138825073; i_3_++)
			anIntArrayArray10503[i_3_] = new int[class536_sub33.method9690(-646910072)];
		for (int i_4_ = 0; i_4_ < -138825073 * anInt10491; i_4_++) {
			for (int i_5_ = 0; i_5_ < anIntArrayArray10503[i_4_].length; i_5_++)
				anIntArrayArray10503[i_4_][i_5_] = class536_sub33.method9690(-384819865);
		}
	}

	static final void method9520(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_6_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		float f = Class447.method5400(class668.anIntArray8541[1867269829 * class668.anInt8542 + 1]);
		Class536_Sub18_Sub18 class536_sub18_sub18 = Class683.aClass301_Sub1_8651.method4046(i_6_, 563046651);
		if (null == class536_sub18_sub18)
			throw new RuntimeException("");
		if (!(class536_sub18_sub18 instanceof Class536_Sub18_Sub18_Sub2))
			throw new RuntimeException("");
		((Class536_Sub18_Sub18_Sub2) class536_sub18_sub18).method11019(f, (byte) 13);
	}
}
