/* Class681 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class681 implements Interface76 {
	public static Class681 aClass681_8633;
	public static Class681 aClass681_8634;
	public static Class681 aClass681_8635;
	public static Class681 aClass681_8636;
	public int anInt8637;
	public static Class681 aClass681_8638 = new Class681(6, 0);
	public static Class681 aClass681_8639;
	public static Class681 aClass681_8640;
	public static Class681 aClass681_8641;
	int anInt8642;
	public static Class459 aClass459_8643;
	public static Class554 aClass554_8644;

	public int method91() {
		return 325637255 * anInt8642;
	}

	public int method87() {
		return 325637255 * anInt8642;
	}

	public int method42() {
		return 325637255 * anInt8642;
	}

	static {
		aClass681_8633 = new Class681(2, 1);
		aClass681_8635 = new Class681(3, 2);
		aClass681_8636 = new Class681(1, 3);
		aClass681_8641 = new Class681(5, 4);
		aClass681_8634 = new Class681(0, 5);
		aClass681_8639 = new Class681(7, 6);
		aClass681_8640 = new Class681(4, 7);
	}

	public Class681 method13906(int i) {
		switch (-538279681 * anInt8637) {
		case 3:
			return aClass681_8639;
		case 6:
			return aClass681_8641;
		case 4:
			return aClass681_8636;
		case 7:
			return aClass681_8635;
		case 5:
			return aClass681_8638;
		case 1:
			return aClass681_8640;
		case 2:
			return aClass681_8634;
		case 0:
			return aClass681_8633;
		default:
			throw new IllegalStateException();
		}
	}

	Class681(int i, int i_0_) {
		anInt8637 = -1978368257 * i;
		anInt8642 = i_0_ * -177229513;
	}

	public Class681 method13907() {
		switch (-538279681 * anInt8637) {
		case 3:
			return aClass681_8639;
		case 6:
			return aClass681_8641;
		case 4:
			return aClass681_8636;
		case 7:
			return aClass681_8635;
		case 5:
			return aClass681_8638;
		case 1:
			return aClass681_8640;
		case 2:
			return aClass681_8634;
		case 0:
			return aClass681_8633;
		default:
			throw new IllegalStateException();
		}
	}

	public static void method13908(Class653 class653, int i) {
		if (Class378.aClass378_3927 == class653.aClass378_8385)
			Class649.aClass358_8371 = new Class358_Sub1(class653);
		else if (class653.aClass378_8385 == Class378.aClass378_3926)
			Class649.aClass358_8371 = new Class358_Sub2(class653);
		else
			throw new RuntimeException();
	}
}
