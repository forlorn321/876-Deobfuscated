/* Class208_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class208_Sub23 extends Class208 {
	int anInt9968;
	int anInt9969;
	int anInt9970;
	int anInt9971;
	int anInt9972;

	public void method3848() {
		Class689.aClass186Array8689[anInt9971 * 2010426245].method3639(anInt9972 * 1380260127, anInt9969 * 850369265, anInt9970 * 376662751, -407536445 * anInt9968, -2074424510);
	}

	Class208_Sub23(RSByteBuffer class527_sub38) {
		super(class527_sub38);
		anInt9971 = class527_sub38.readUnsignedShort() * -593193651;
		int i = class527_sub38.readInt();
		anInt9969 = -1083828719 * (i >>> 16);
		anInt9970 = 1358614815 * (i & 0xffff);
		anInt9972 = class527_sub38.readUnsignedByte() * 1399268063;
		anInt9968 = class527_sub38.readUnsignedByte() * 1762399211;
	}

	public void method3846(int i) {
		Class689.aClass186Array8689[anInt9971 * 2010426245].method3639(anInt9972 * 1380260127, anInt9969 * 850369265, anInt9970 * 376662751, -407536445 * anInt9968, -825287365);
	}

	public void method3851() {
		Class689.aClass186Array8689[anInt9971 * 2010426245].method3639(anInt9972 * 1380260127, anInt9969 * 850369265, anInt9970 * 376662751, -407536445 * anInt9968, 1903432910);
	}

	public static boolean method15642(int i, int i_0_) {
		return i == 0 || i == 14 || i == 8 || 6 == i;
	}
}
