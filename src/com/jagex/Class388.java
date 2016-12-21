/* Class388 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Dimension;

public class Class388 implements Interface49 {
	public int anInt4045;
	static int[] anIntArray4046;

	public Class390 method343(byte i) {
		return Class390.aClass390_4048;
	}

	public Class390 method342() {
		return Class390.aClass390_4048;
	}

	public Class390 method344() {
		return Class390.aClass390_4048;
	}

	Class388(int i) {
		anInt4045 = i * 297606387;
	}

	static final void method4848(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class399.method4911(i_0_ >> 14 & 0x3fff, i_0_ & 0x3fff, 1168065969);
	}

	static void method4849(byte[] is, byte i) {
		RSByteBuffer class536_sub33 = new RSByteBuffer(is);
		for (;;) {
			int i_1_ = class536_sub33.readUnsignedByte(-1155982523);
			if (i_1_ == 0)
				break;
			if (1 == i_1_)
				Class636.anInt8286 = class536_sub33.readUnsignedShort((short) 29412) * -730890537;
			else if (10 == i_1_)
				class536_sub33.readUnsignedShort((short) 16848);
		}
	}

	static void method4850(byte i) {
		if (Class710.aClass536_Sub40_8843.aClass710_Sub41_10784.method10248(65533) == 1)
			Class266.aClass503_2867.method6043(new Class510((Class498.aClass498_5562), null), (byte) 108);
		else {
			client.aClass515_11066.method6319(-1587051454);
			Class541.method6531(786572272);
		}
	}

	static void method4851(int i) {
		if (Class677.aClass167_8609.method2061()) {
			Class677.aClass167_8609.method2025(Class399.aCanvas4127, -660595242);
			Class49.method926((byte) 8);
			Dimension dimension = Class399.aCanvas4127.getSize();
			Class677.aClass167_8609.method2023(Class399.aCanvas4127, dimension.width, dimension.height, (byte) 1);
			Class677.aClass167_8609.method2026(Class399.aCanvas4127, -1649601467);
		} else
			Class704.method8264(Class710.aClass536_Sub40_8843.aClass710_Sub15_10767.method10071(1891654182), false, (byte) 104);
		Class552.method6692(-1471526330);
	}
}
