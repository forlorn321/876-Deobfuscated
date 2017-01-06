/* Class578 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class578 {
	Class578() throws Throwable {
		throw new Error();
	}

	static final void method7006(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class241.method3385(class251, class668, (byte) 6);
	}

	static boolean method7007(int i, int i_0_) {
		return i == 7 || 14 == i || 10 == i || i == 6 || 5 == i;
	}

	static void method7008(IComponentDefinitions class251, IComponentDefinitions class251_1_, int i) {
		OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4414, client.aClass106_11322.aClass15_1258, 1234471396);
		class536_sub23.stream.writeShort(-1484799213 * class251.anInt2711, -1778059594);
		class536_sub23.stream.writeIntV1(-1591767037 * class251_1_.anInt2559, -2116010874);
		class536_sub23.stream.writeShort(class251_1_.anInt2546 * -809980533, -1778059594);
		class536_sub23.stream.writeIntLE(class251.anInt2559 * -1591767037, 1926010801);
		class536_sub23.stream.writeShort128(-1484799213 * class251_1_.anInt2711, (byte) 0);
		class536_sub23.stream.writeLEShort(-809980533 * class251.anInt2546, -1411037171);
		client.aClass106_11322.writePacket(class536_sub23, 1526171799);
	}
}
