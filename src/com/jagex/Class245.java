/* Class245 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class245 {
	static final String aString2465 = "#";

	Class245() throws Throwable {
		throw new Error();
	}

	static final void method3412(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_0_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_1_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class597.method7140(i_0_, i_1_, true, 648285582);
	}

	static OutgoingPacketContainer method3413(int i, int i_2_, int i_3_, int i_4_) {
		OutgoingPacketContainer class536_sub23 = null;
		if (0 == i_3_)
			class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.WALKING_PACKET, client.aClass106_11322.aClass15_1258, 970716290);
		if (1 == i_3_)
			class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.MINI_WALKING_PACKET, client.aClass106_11322.aClass15_1258, 1885004815);
		Class598 class598 = client.aClass515_11066.method6255(-1252219861);
		class536_sub23.stream.writeByte128(Class569.method6925(-1608490852) ? 1 : 0);
		class536_sub23.stream.writeShort128(i_2_ + class598.anInt7840 * 1479112045, (byte) 0);
		class536_sub23.stream.writeLEShort(i + class598.anInt7839 * 1858049507, -1411037171);
		Class101.anInt1205 = -1245738949 * i;
		Class101.anInt1194 = i_2_ * 1934813789;
		Class101.aBool1206 = false;
		Class171.method2430((byte) 5);
		return class536_sub23;
	}

	static void method3414(Class668 class668, Class499 class499, Exception exception, String string, byte i) {
		StringBuilder stringbuilder = new StringBuilder(30);
		stringbuilder.append(new StringBuilder().append(string).append(" ").toString()).append(class668.aClass536_Sub18_Sub16_8547.aLong7133 * -6909195213925454795L).append(" ");
		for (int i_5_ = class668.anInt8552 * 2100083885 - 1; i_5_ >= 0; i_5_--)
			stringbuilder.append("").append((class668.aClass646Array8540[i_5_].aClass536_Sub18_Sub16_8355.aLong7133) * -6909195213925454795L).append(" ");
		stringbuilder.append("").append(Integer.valueOf(1771926685 * class499.anInt5608));
		Class81.method1165(stringbuilder.toString(), exception, (byte) -28);
	}
}
