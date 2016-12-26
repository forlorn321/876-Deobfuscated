/* Class205_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;

public class Class205_Sub23 extends Class205 {
	int[] anIntArray9964;
	int anInt9965;
	int anInt9966;
	int anInt9967;

	Class205_Sub23(RSByteBuffer class536_sub33) {
		super(class536_sub33);
		anInt9967 = class536_sub33.readUnsignedShort() * 1700689393;
		anIntArray9964 = new int[4];
		anInt9965 = class536_sub33.readBigSmart((byte) 1) * 2040275723;
		Arrays.fill(anIntArray9964, 0, anIntArray9964.length, anInt9965 * 1565462691);
		anInt9966 = class536_sub33.readInt() * -1832742327;
	}

	public void method2940(int i) {
		Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1 = Class193.aClass189Array2180[anInt9967 * 170253073].method2804(-1200913763);
		if (0 == -389939207 * anInt9966)
			Class360_Sub1.method9269(class649_sub1_sub5_sub1, anIntArray9964, 0, false);
		else
			Class74.method1139(class649_sub1_sub5_sub1, new int[] { 1565462691 * anInt9965 }, new int[] { 0 }, new int[] { anInt9966 * -389939207 }, (byte) -22);
	}

	public void method2943() {
		Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1 = Class193.aClass189Array2180[anInt9967 * 170253073].method2804(2076569024);
		if (0 == -389939207 * anInt9966)
			Class360_Sub1.method9269(class649_sub1_sub5_sub1, anIntArray9964, 0, false);
		else
			Class74.method1139(class649_sub1_sub5_sub1, new int[] { 1565462691 * anInt9965 }, new int[] { 0 }, new int[] { anInt9966 * -389939207 }, (byte) -98);
	}

	public void method2942() {
		Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1 = Class193.aClass189Array2180[anInt9967 * 170253073].method2804(1981759688);
		if (0 == -389939207 * anInt9966)
			Class360_Sub1.method9269(class649_sub1_sub5_sub1, anIntArray9964, 0, false);
		else
			Class74.method1139(class649_sub1_sub5_sub1, new int[] { 1565462691 * anInt9965 }, new int[] { 0 }, new int[] { anInt9966 * -389939207 }, (byte) -10);
	}

	boolean method2939(int i) {
		Class191 class191 = ((Class191) Class45.aClass34_Sub11_529.method70(1565462691 * anInt9965, (byte) 7));
		return class191.method2836(1477042788);
	}

	boolean method2944() {
		Class191 class191 = ((Class191) Class45.aClass34_Sub11_529.method70(1565462691 * anInt9965, (byte) 3));
		return class191.method2836(1244174570);
	}

	static final int method9101(int i, int i_0_, short i_1_) {
		int i_2_ = (Class205_Sub4_Sub1.method10584(i + 45365, 91923 + i_0_, 4, 1497226406) - 128 + (Class205_Sub4_Sub1.method10584(i + 10294, i_0_ + 37821, 2, 889247187) - 128 >> 1) + (Class205_Sub4_Sub1.method10584(i, i_0_, 1, 389102382) - 128 >> 2));
		i_2_ = 35 + (int) (0.3 * (double) i_2_);
		if (i_2_ < 10)
			i_2_ = 10;
		else if (i_2_ > 60)
			i_2_ = 60;
		return i_2_;
	}

	public static void method9102(boolean bool, boolean bool_3_, int i) {
		Class575.aBool7677 = bool;
		Class575.aBool7653 = bool_3_;
	}

	static final void method9103(Class668 class668, byte i) {
		if ((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 0)
			class668.anInt8564 += -1531084683 * (class668.anIntArray8537[class668.anInt8564 * -1640738851]);
	}
}
