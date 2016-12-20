/* Class208_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;

public class Class208_Sub10 extends Class208 {
	int[] anIntArray9919;
	int anInt9920;
	int anInt9921;
	int anInt9922;
	public static Class296_Sub1 aClass296_Sub1_9923;

	Class208_Sub10(RSByteBuffer class527_sub38) {
		super(class527_sub38);
		anInt9920 = class527_sub38.readUnsignedShort() * 1934121851;
		anIntArray9919 = new int[4];
		anInt9921 = class527_sub38.method16466(-2078741742) * -1964976583;
		Arrays.fill(anIntArray9919, 0, anIntArray9919.length, -1994639351 * anInt9921);
		anInt9922 = class527_sub38.readInt() * 546276883;
	}

	public void method3846(int i) {
		Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1 = Class466.aClass196Array5314[anInt9920 * 409029555].method3717(2051654926);
		if (anInt9922 * -671402981 == 0)
			Class524.method8717(class640_sub1_sub2_sub1, anIntArray9919, 0, false, -397006101);
		else
			Class71.method1492(class640_sub1_sub2_sub1, new int[] { anInt9921 * -1994639351 }, new int[] { 0 }, new int[] { anInt9922 * -671402981 }, 2072183645);
	}

	boolean method3847(byte i) {
		Class198 class198 = ((Class198) Class321.aClass24_Sub10_3551.method81(anInt9921 * -1994639351, -441556801));
		return class198.method3732((byte) -20);
	}

	public void method3848() {
		Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1 = Class466.aClass196Array5314[anInt9920 * 409029555].method3717(367042847);
		if (anInt9922 * -671402981 == 0)
			Class524.method8717(class640_sub1_sub2_sub1, anIntArray9919, 0, false, -397006101);
		else
			Class71.method1492(class640_sub1_sub2_sub1, new int[] { anInt9921 * -1994639351 }, new int[] { 0 }, new int[] { anInt9922 * -671402981 }, -1116838183);
	}

	public void method3851() {
		Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1 = Class466.aClass196Array5314[anInt9920 * 409029555].method3717(828360196);
		if (anInt9922 * -671402981 == 0)
			Class524.method8717(class640_sub1_sub2_sub1, anIntArray9919, 0, false, -397006101);
		else
			Class71.method1492(class640_sub1_sub2_sub1, new int[] { anInt9921 * -1994639351 }, new int[] { 0 }, new int[] { anInt9922 * -671402981 }, 1527692884);
	}

	boolean method3845() {
		Class198 class198 = ((Class198) Class321.aClass24_Sub10_3551.method81(anInt9921 * -1994639351, -1720219437));
		return class198.method3732((byte) 60);
	}

	boolean method3849() {
		Class198 class198 = ((Class198) Class321.aClass24_Sub10_3551.method81(anInt9921 * -1994639351, 863085732));
		return class198.method3732((byte) 69);
	}

	static final void method15614(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class302.method5574(class243, class240, class665, (short) -11798);
	}

	static final void method15615(Class665 class665, byte i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, 1373062773);
		if (class243.aString2614 == null)
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
		else
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class243.aString2614;
	}
}
