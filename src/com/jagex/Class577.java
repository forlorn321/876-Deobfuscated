/* Class577 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class577 implements Interface68 {
	Class63 aClass63_7688;
	static int anInt7689;

	Class577(Class63 class63) {
		aClass63_7688 = class63;
	}

	public void method206(int i) {
		OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4479, client.aClass106_11322.aClass15_1258, 1446497312);
		class536_sub23.stream.writeByte128(aClass63_7688.method78());
		client.aClass106_11322.writePacket(class536_sub23, 85807647);
	}

	public void method296() {
		OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4479, client.aClass106_11322.aClass15_1258, 1617783511);
		class536_sub23.stream.writeByte128(aClass63_7688.method78());
		client.aClass106_11322.writePacket(class536_sub23, 1987986403);
	}

	public void method131() {
		OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4479, client.aClass106_11322.aClass15_1258, 1497816809);
		class536_sub23.stream.writeByte128(aClass63_7688.method78());
		client.aClass106_11322.writePacket(class536_sub23, 1743981432);
	}

	static final void method7003(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (int) (Math.random() * (double) (i_0_ + 1));
	}

	static final void method7004(Class668 class668, int i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		ItemDecoder class1 = (ItemDecoder) Class111.aClass34_Sub13_1391.method70(i_1_, (byte) 83);
		if (class1.certTemplateId * 79208069 >= 0 && 1990739153 * class1.certId >= 0)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1990739153 * class1.certId;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_1_;
	}

	static int method7005(Class603_Sub1 class603_sub1, Class603_Sub1 class603_sub1_2_, int i, boolean bool, byte i_3_) {
		if (1 == i) {
			int i_4_ = -1880579507 * class603_sub1.online;
			int i_5_ = class603_sub1_2_.online * -1880579507;
			if (!bool) {
				if (-1 == i_4_)
					i_4_ = 2001;
				if (-1 == i_5_)
					i_5_ = 2001;
			}
			return i_4_ - i_5_;
		}
		if (i == 2)
			return Class34_Sub6.method10321(class603_sub1.method9616((byte) -19), class603_sub1_2_.method9616((byte) -15), Class459.CLIENT_PARAMS, -1675425713);
		if (3 == i) {
			if (class603_sub1.worldActivity.equals("-")) {
				if (class603_sub1_2_.worldActivity.equals("-"))
					return 0;
				return bool ? -1 : 1;
			}
			if (class603_sub1_2_.worldActivity.equals("-"))
				return bool ? 1 : -1;
			return Class34_Sub6.method10321(class603_sub1.worldActivity, class603_sub1_2_.worldActivity, Class459.CLIENT_PARAMS, -1675425713);
		}
		if (4 == i)
			return (class603_sub1.method7195(-544818663) ? class603_sub1_2_.method7195(1319778335) ? 0 : 1 : class603_sub1_2_.method7195(662320524) ? -1 : 0);
		if (i == 5)
			return (class603_sub1.method7190(-1738732489) ? class603_sub1_2_.method7190(-1754041650) ? 0 : 1 : class603_sub1_2_.method7190(-1778713432) ? -1 : 0);
		if (6 == i)
			return (class603_sub1.method7187(-1267294089) ? class603_sub1_2_.method7187(-465531321) ? 0 : 1 : class603_sub1_2_.method7187(-2097199343) ? -1 : 0);
		if (i == 7)
			return (class603_sub1.method7185((short) 1463) ? class603_sub1_2_.method7185((short) 9462) ? 0 : 1 : class603_sub1_2_.method7185((short) 2299) ? -1 : 0);
		if (8 == i) {
			int i_6_ = class603_sub1.anInt10558 * 2023817915;
			int i_7_ = class603_sub1_2_.anInt10558 * 2023817915;
			if (bool) {
				if (1000 == i_6_)
					i_6_ = -1;
				if (1000 == i_7_)
					i_7_ = -1;
			} else {
				if (i_6_ == -1)
					i_6_ = 1000;
				if (i_7_ == -1)
					i_7_ = 1000;
			}
			return i_6_ - i_7_;
		}
		return (class603_sub1.anInt10557 * -1812485199 - class603_sub1_2_.anInt10557 * -1812485199);
	}
}
