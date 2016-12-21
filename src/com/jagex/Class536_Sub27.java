/* Class536_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub27 extends Class536 {
	public int anInt10534;
	public int anInt10535;
	public int anInt10536;
	public int anInt10537;
	public int anInt10538;
	public int anInt10539;
	public int anInt10540;
	public int anInt10541;
	public int anInt10542;

	Class536_Sub27(RSByteBuffer class536_sub33) {
		int i = class536_sub33.readInt();
		anInt10534 = (i >>> 28) * 2053824531;
		anInt10540 = (i >>> 14 & 0x3fff) * -341775319;
		anInt10536 = -1292521283 * (i & 0x3fff);
		anInt10542 = class536_sub33.readUnsignedByte() * -178808363;
		anInt10541 = class536_sub33.readUnsignedByte() * -835195391;
		anInt10537 = class536_sub33.readUnsignedByte() * -1320321757;
		anInt10535 = class536_sub33.readUnsignedByte() * 1504014115;
		anInt10539 = class536_sub33.readUnsignedByte() * -1530712073;
		anInt10538 = class536_sub33.readUnsignedByte() * -295840071;
	}

	static void method9594(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class523.method6405(65536) ? 1 : 0;
	}
}
