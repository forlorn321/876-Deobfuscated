/* Class303 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Point;

public class Class303 {
	static Class303 aClass303_3407;
	static Class303 aClass303_3408;
	static Class303 aClass303_3409;
	static Class303 aClass303_3410;
	static Class303 aClass303_3411;
	Class38 aClass38_3412;
	static Class303 aClass303_3413;
	static Class303 aClass303_3414;
	static Class303 aClass303_3415;
	static Class303 aClass303_3416 = new Class303(0, Class38.aClass38_371, 2);
	static Class303 aClass303_3417;
	static Class303 aClass303_3418;
	static Class303 aClass303_3419;
	static Class303 aClass303_3420;
	static Class303 aClass303_3421;
	static Class303 aClass303_3422;
	static Class303 aClass303_3423;
	static Class303 aClass303_3424;
	public int anInt3425;
	Class38 aClass38_3426;
	boolean aBool3427;
	static Class303 aClass303_3428;
	int anInt3429;
	boolean aBool3430;
	int anInt3431;
	public static Class461 aClass461_3432;

	Class303(int i, Class38 class38, Class38 class38_0_, int i_1_, int i_2_) {
		this(i, class38, class38_0_, i_1_, i_2_, true, false);
	}

	Class303(int i, Class38 class38, int i_3_) {
		this(i, class38, class38, i_3_, i_3_, true, false);
	}

	static {
		aClass303_3415 = new Class303(1, Class38.aClass38_371, Class38.aClass38_371, 2, 3);
		aClass303_3409 = new Class303(2, Class38.aClass38_371, 3);
		aClass303_3410 = new Class303(3, Class38.aClass38_371, Class38.aClass38_371, 3, 4);
		aClass303_3411 = new Class303(4, Class38.aClass38_371, 4);
		aClass303_3408 = new Class303(5, Class38.aClass38_371, Class38.aClass38_371, 4, 5);
		aClass303_3423 = new Class303(6, Class38.aClass38_371, Class38.aClass38_371, 5, 98, true, true);
		aClass303_3414 = new Class303(7, Class38.aClass38_371, 99);
		aClass303_3413 = new Class303(8, Class38.aClass38_371, 100);
		aClass303_3407 = new Class303(9, Class38.aClass38_407, Class38.aClass38_407, 0, 92, true, true);
		aClass303_3417 = new Class303(10, Class38.aClass38_407, Class38.aClass38_407, 92, 93);
		aClass303_3418 = new Class303(11, Class38.aClass38_407, Class38.aClass38_407, 94, 95);
		aClass303_3419 = new Class303(12, Class38.aClass38_407, Class38.aClass38_407, 96, 97);
		aClass303_3420 = new Class303(13, Class38.aClass38_407, 97);
		aClass303_3421 = new Class303(14, Class38.aClass38_407, 97);
		aClass303_3422 = new Class303(15, Class38.aClass38_407, 100);
		aClass303_3428 = new Class303(16, Class38.aClass38_407, 100);
		aClass303_3424 = new Class303(17, Class38.aClass38_407, 100);
	}

	Class303(int i, Class38 class38, Class38 class38_4_, int i_5_, int i_6_, boolean bool, boolean bool_7_) {
		anInt3425 = i * -91522527;
		aClass38_3426 = class38;
		aClass38_3412 = class38_4_;
		anInt3431 = i_5_ * 204029329;
		anInt3429 = i_6_ * -2013131057;
		aBool3430 = bool;
		aBool3427 = bool_7_;
	}

	static Class303[] method4103(byte i) {
		return (new Class303[] { aClass303_3416, aClass303_3415, aClass303_3409, aClass303_3410, aClass303_3411, aClass303_3408, aClass303_3423, aClass303_3414, aClass303_3413, aClass303_3407, aClass303_3417, aClass303_3418, aClass303_3419, aClass303_3420, aClass303_3421, aClass303_3422, aClass303_3428, aClass303_3424 });
	}

	public static void method4104(Class641 class641, int i) {
		if (Class376.aClass376_3913 == class641.aClass376_8313)
			Class653.aClass360_8489 = new Class360_Sub1(class641);
		else if (Class376.aClass376_3912 == class641.aClass376_8313)
			Class653.aClass360_8489 = new Class360_Sub2(class641);
		else
			throw new RuntimeException();
	}

	public static void method4105(int i, int i_8_, int i_9_, boolean bool, byte i_10_) {
		Class536_Sub18_Sub14 class536_sub18_sub14 = Class542_Sub1.aClass536_Sub18_Sub14_7202;
		Class542_Sub1.method6564(i);
		Class542_Sub1.aBool7220 = false;
		if (Class542_Sub1.aClass536_Sub18_Sub14_7202 != class536_sub18_sub14)
			Class465_Sub1.method9387(-931943004);
		Class542_Sub1.anInt10709 = i_8_ * -1556558237;
		Class542_Sub1.anInt10710 = i_9_ * 382996535;
		Class542_Sub1.aBool10711 = bool;
	}

	static void method4106(int i) {
		synchronized (Class659.aQueue8499) {
			Point point;
			if (Class399.aCanvas4127.isShowing())
				point = Class399.aCanvas4127.getLocationOnScreen();
			else
				point = null;
			for (;;) {
				Class536_Sub31_Sub2 class536_sub31_sub2 = (Class536_Sub31_Sub2) Class659.aQueue8499.poll();
				if (null == class536_sub31_sub2)
					break;
				if (point == null || !Class399.aCanvas4127.isShowing() || !Class67_Sub1.aBool10601)
					class536_sub31_sub2.method9641(-2116460162);
				else {
					class536_sub31_sub2.method10822(point, 223728158);
					if (!class536_sub31_sub2.method10821(1110273650) && (class536_sub31_sub2.method9647(-2034738443) < Class144.anInt1679 * -1804846931) && (class536_sub31_sub2.method9643((byte) 1) < 589116499 * Class34_Sub6.anInt10965) && class536_sub31_sub2.method9647(-2023242735) >= 0 && class536_sub31_sub2.method9643((byte) 1) >= 0) {
						int i_11_ = class536_sub31_sub2.method9642(-752068600);
						if (class536_sub31_sub2.method9642(-760716819) == -1)
							Class659.aClass637_Sub1_8503.method7640(class536_sub31_sub2, -1975375597);
						else if (Class160.method1960(i_11_, (byte) 50))
							Class659.aClass637_Sub1_8503.method9914(class536_sub31_sub2, -454158271);
					}
				}
			}
		}
	}
}
