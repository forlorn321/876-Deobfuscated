/* Class208_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class208_Sub18 extends Class208 {
	int anInt9949;
	int anInt9950;
	int anInt9951;
	int anInt9952;
	int anInt9953;

	Class208_Sub18(RSByteBuffer class527_sub38) {
		super(class527_sub38);
		anInt9952 = class527_sub38.readUnsignedShort() * 599132967;
		int i = class527_sub38.readInt();
		anInt9950 = 1641714817 * (i >>> 16);
		anInt9951 = (i & 0xffff) * -205706681;
		anInt9949 = class527_sub38.readUnsignedByte() * 1507590651;
		anInt9953 = class527_sub38.readSmartVariant(983912765) * 2062684597;
	}

	public void method3851() {
		Class466.aClass196Array5314[anInt9952 * 251180183].method3714(anInt9950 * 1730784129, anInt9951 * -1407754377, 82501939 * anInt9949, anInt9953 * 1025840285, 1911784367);
	}

	public void method3848() {
		Class466.aClass196Array5314[anInt9952 * 251180183].method3714(anInt9950 * 1730784129, anInt9951 * -1407754377, 82501939 * anInt9949, anInt9953 * 1025840285, -149456042);
	}

	public void method3846(int i) {
		Class466.aClass196Array5314[anInt9952 * 251180183].method3714(anInt9950 * 1730784129, anInt9951 * -1407754377, 82501939 * anInt9949, anInt9953 * 1025840285, -1400995381);
	}

	public static int method15632(String string, byte i) {
		return string.length() + 1;
	}
}
