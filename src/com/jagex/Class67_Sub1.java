/* Class67_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class67_Sub1 extends Class67 implements Interface68 {
	public static boolean aBool10601;

	public void method9792(int i, int i_0_) {
		anInt744 = -1884232023 * (-736289383 * anInt744 | i);
	}

	public void method9793(int i) {
		anInt743 = -403665561 * i;
	}

	public void method9794(int i, int i_1_) {
		anInt726 = i * -1750937005;
	}

	public void method206(int i) {
		OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4512, client.aClass106_11322.aClass15_1258, 2045540073);
		class536_sub23.stream.writeShort128(-736289383 * anInt744, (byte) 0);
		class536_sub23.stream.write24BitInt(anInt741 * -2039657679, 1435073607);
		class536_sub23.stream.write24BitInt(1740372171 * anInt742, 1796457798);
		class536_sub23.stream.method9753(-1567276581 * anInt726, 1185890176);
		class536_sub23.stream.write24BitInt(1065708543 * anInt739, 2069889807);
		class536_sub23.stream.method9729(458702423 * anInt743, -1353838932);
		class536_sub23.stream.writeShort128(anInt737 * -1157754649, (byte) 0);
		class536_sub23.stream.method9754(anInt738 * 1381681467, -2141793970);
		client.aClass106_11322.writePacket(class536_sub23, 1315139892);
	}

	public void method9795(int i, int i_2_, byte i_3_) {
		if (i == 0 && i_2_ > 32767)
			i_2_ = 32767;
		else if (i_2_ > 8388607)
			i_2_ = 8388607;
		switch (i) {
		case 0:
			anInt737 = -1378745641 * i_2_;
			break;
		case 5:
			anInt741 = i_2_ * -1813107247;
			break;
		case 3:
			anInt742 = 1748937955 * i_2_;
			break;
		case 1:
			anInt739 = i_2_ * -1695902721;
			break;
		}
	}

	public void method296() {
		OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4512, client.aClass106_11322.aClass15_1258, 1507666143);
		class536_sub23.stream.writeShort128(-736289383 * anInt744, (byte) 0);
		class536_sub23.stream.write24BitInt(anInt741 * -2039657679, 1443544045);
		class536_sub23.stream.write24BitInt(1740372171 * anInt742, 934358407);
		class536_sub23.stream.method9753(-1567276581 * anInt726, 388640495);
		class536_sub23.stream.write24BitInt(1065708543 * anInt739, 1723433641);
		class536_sub23.stream.method9729(458702423 * anInt743, -1631319423);
		class536_sub23.stream.writeShort128(anInt737 * -1157754649, (byte) 0);
		class536_sub23.stream.method9754(anInt738 * 1381681467, -1800016851);
		client.aClass106_11322.writePacket(class536_sub23, -325112363);
	}

	public void method131() {
		OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4512, client.aClass106_11322.aClass15_1258, 664592060);
		class536_sub23.stream.writeShort128(-736289383 * anInt744, (byte) 0);
		class536_sub23.stream.write24BitInt(anInt741 * -2039657679, 405303182);
		class536_sub23.stream.write24BitInt(1740372171 * anInt742, 937219112);
		class536_sub23.stream.method9753(-1567276581 * anInt726, -1411592158);
		class536_sub23.stream.write24BitInt(1065708543 * anInt739, 1797865791);
		class536_sub23.stream.method9729(458702423 * anInt743, -1966702122);
		class536_sub23.stream.writeShort128(anInt737 * -1157754649, (byte) 0);
		class536_sub23.stream.method9754(anInt738 * 1381681467, 1562390540);
		client.aClass106_11322.writePacket(class536_sub23, 1747131357);
	}

	public void method9796(int i) {
		anInt726 = i * -1750937005;
	}

	public void method9797(int i, byte i_4_) {
		anInt743 = -403665561 * i;
	}

	public void method9798(int i) {
		anInt743 = -403665561 * i;
	}

	public void method9799(int i) {
		anInt743 = -403665561 * i;
	}

	public void method9800(int i) {
		anInt743 = -403665561 * i;
	}

	public void method9801(int i) {
		anInt743 = -403665561 * i;
	}

	static final void method9802(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_5_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_6_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		Class681.method8089(i_5_, new Class536_Sub36(i_6_, 3), null, true, -341605679);
	}
}
