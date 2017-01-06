/* Class637_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class637_Sub2 extends Class637 {
	void method7636(RSByteBuffer class536_sub33, Class536_Sub31 class536_sub31) {
		/* empty */
	}

	Class637_Sub2() {
		/* empty */
	}

	Class536_Sub31 method10053(int i) {
		return (Class536_Sub31) client.aClass708_11250.method8308(1867269829);
	}

	OutgoingPacketContainer method7633(int i) {
		return Class213.createOutgoingPacket(OutgoingPacket.aClass414_4518, client.aClass106_11322.aClass15_1258, 2078130653);
	}

	void method7627(RSByteBuffer class536_sub33, Class536_Sub31 class536_sub31, int i) {
		/* empty */
	}

	void method7624(int i) {
		Class536_Sub31 class536_sub31 = method10053(1504464657);
		if (null != class536_sub31) {
			int i_0_ = method7628(class536_sub31, 32767, 147631947);
			int i_1_ = class536_sub31.method9643((byte) 1);
			if (i_1_ < 0)
				i_1_ = 0;
			else if (i_1_ > 65535)
				i_1_ = 65535;
			int i_2_ = class536_sub31.method9647(-1805233001);
			if (i_2_ < 0)
				i_2_ = 0;
			else if (i_2_ > 65535)
				i_2_ = 65535;
			int i_3_ = 0;
			if (class536_sub31.method9642(-1129106861) == 2)
				i_3_ = 1;
			OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.CLICK_1, client.aClass106_11322.aClass15_1258, 2100294889);
			class536_sub23.stream.writeShort128(i_0_ | i_3_ << 15, (byte) 0);
			class536_sub23.stream.writeInt(i_2_ | i_1_ << 16);
			client.aClass106_11322.writePacket(class536_sub23, 1211692006);
		}
	}

	void method7631() {
		Class536_Sub31 class536_sub31 = method10053(-216293303);
		if (null != class536_sub31) {
			int i = method7628(class536_sub31, 32767, 2055872504);
			int i_4_ = class536_sub31.method9643((byte) 1);
			if (i_4_ < 0)
				i_4_ = 0;
			else if (i_4_ > 65535)
				i_4_ = 65535;
			int i_5_ = class536_sub31.method9647(-1617659182);
			if (i_5_ < 0)
				i_5_ = 0;
			else if (i_5_ > 65535)
				i_5_ = 65535;
			int i_6_ = 0;
			if (class536_sub31.method9642(-1819138016) == 2)
				i_6_ = 1;
			OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.CLICK_1, client.aClass106_11322.aClass15_1258, 1808927441);
			class536_sub23.stream.writeShort128(i | i_6_ << 15, (byte) 0);
			class536_sub23.stream.writeInt(i_5_ | i_4_ << 16);
			client.aClass106_11322.writePacket(class536_sub23, 793689737);
		}
	}

	OutgoingPacketContainer method7634() {
		return Class213.createOutgoingPacket(OutgoingPacket.aClass414_4518, client.aClass106_11322.aClass15_1258, 1965549508);
	}

	int method7635() {
		return 0;
	}

	int method7629(int i) {
		return 0;
	}

	boolean method7639() {
		return (method10053(293108570) != null || (aLong8298 * 1257646413264406655L < Class249.method3450(1787229010) - 2000L));
	}

	boolean method7632(byte i) {
		return (method10053(-287235976) != null || (aLong8298 * 1257646413264406655L < Class249.method3450(1844458916) - 2000L));
	}

	static final void method10054(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_7_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_8_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		int i_9_ = client.aClass485ArrayArray11266[i_8_][i_7_].method5851(-1944026266);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_9_ == 1 ? 1 : 0;
	}
}
