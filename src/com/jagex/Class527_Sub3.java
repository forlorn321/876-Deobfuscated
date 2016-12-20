/* Class527_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub3 extends Class527 {
	public static final int anInt10366 = 1;
	int[] anIntArray10367;
	public static final int anInt10368 = 2;
	int[] anIntArray10369;
	public static final int anInt10370 = 5;
	int[][] anIntArrayArray10371;
	public static final int anInt10372 = 7;
	public static final int anInt10373 = 8;
	boolean[] aBoolArray10374;
	public static final int anInt10375 = 10;
	public static final int anInt10376 = 3;
	int anInt10377;
	static final int anInt10378 = 6;
	public static final int anInt10379 = 9;
	int anInt10380;
	public static final int anInt10381 = 0;

	Class527_Sub3(int i, byte[] is) {
		anInt10380 = -937866479 * i;
		RSByteBuffer class527_sub38 = new RSByteBuffer(is);
		anInt10377 = class527_sub38.readUnsignedShort() * 228853673;
		anIntArray10367 = new int[-823161703 * anInt10377];
		anIntArrayArray10371 = new int[anInt10377 * -823161703][];
		aBoolArray10374 = new boolean[anInt10377 * -823161703];
		anIntArray10369 = new int[anInt10377 * -823161703];
		for (int i_0_ = 0; i_0_ < anInt10377 * -823161703; i_0_++) {
			anIntArray10367[i_0_] = class527_sub38.readUnsignedByte();
			if (6 == anIntArray10367[i_0_])
				anIntArray10367[i_0_] = 2;
		}
		for (int i_1_ = 0; i_1_ < anInt10377 * -823161703; i_1_++)
			aBoolArray10374[i_1_] = class527_sub38.readUnsignedByte() == 1;
		for (int i_2_ = 0; i_2_ < -823161703 * anInt10377; i_2_++)
			anIntArray10369[i_2_] = class527_sub38.readUnsignedShort();
		for (int i_3_ = 0; i_3_ < -823161703 * anInt10377; i_3_++)
			anIntArrayArray10371[i_3_] = new int[class527_sub38.readUnsignedSmart((byte) -83)];
		for (int i_4_ = 0; i_4_ < anInt10377 * -823161703; i_4_++) {
			for (int i_5_ = 0; i_5_ < anIntArrayArray10371[i_4_].length; i_5_++)
				anIntArrayArray10371[i_4_][i_5_] = class527_sub38.readUnsignedSmart((byte) -31);
		}
	}

	public static final void method16047(int i) {
		Class170.aClass517_1880.method8625((byte) -45);
		for (int i_6_ = 0; i_6_ < 32; i_6_++)
			Class515.aLongArray7017[i_6_] = 0L;
		for (int i_7_ = 0; i_7_ < 32; i_7_++)
			Class515.aLongArray7013[i_7_] = 0L;
		Class190.anInt2128 = 0;
	}
}
