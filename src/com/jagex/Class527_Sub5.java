/* Class527_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub5 extends Class527 {
	public int anInt10382;
	public int anInt10383;
	public int anInt10384;
	public int anInt10385;
	public int anInt10386;
	public int anInt10387;
	public int anInt10388;
	public int anInt10389;
	public int anInt10390;

	Class527_Sub5(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readInt();
		anInt10383 = -80493695 * (i >>> 28);
		anInt10387 = -1419609631 * (i >>> 14 & 0x3fff);
		anInt10384 = (i & 0x3fff) * -1503435013;
		anInt10388 = class527_sub38.readUnsignedByte() * -701983791;
		anInt10389 = class527_sub38.readUnsignedByte() * 1331675981;
		anInt10385 = class527_sub38.readUnsignedByte() * 1311108443;
		anInt10386 = class527_sub38.readUnsignedByte() * -54851775;
		anInt10382 = class527_sub38.readUnsignedByte() * -58645397;
		anInt10390 = class527_sub38.readUnsignedByte() * 1628590017;
	}

	static void method16052(int i) {
		Class527_Sub8_Sub9.aClass14_11692.method721(-1795806947);
		Class527_Sub8_Sub9.aClass693_11681.method14054(1820764107);
		Class527_Sub8_Sub9.aClass693_11690.method14054(1334009903);
	}
}
