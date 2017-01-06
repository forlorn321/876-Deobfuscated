/* Class603 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class603 {
	static final int anInt7858 = 2;
	static final int anInt7859 = 4;
	static final int anInt7860 = 8;
	static final int anInt7861 = 1;
	public int worldFlags;
	int worldIndex;
	public int online;

	public boolean method7184() {
		return (worldFlags * -1176655995 & 0x1) != 0;
	}

	public boolean method7185(short i) {
		return (worldFlags * -1176655995 & 0x1) != 0;
	}

	public boolean method7186() {
		return (worldFlags * -1176655995 & 0x1) != 0;
	}

	public boolean method7187(int i) {
		return (worldFlags * -1176655995 & 0x4) != 0;
	}

	Class603() {
		/* empty */
	}

	public boolean method7188() {
		return (worldFlags * -1176655995 & 0x1) != 0;
	}

	public boolean method7189() {
		return 0 != (worldFlags * -1176655995 & 0x8);
	}

	public boolean method7190(int i) {
		return (worldFlags * -1176655995 & 0x2) != 0;
	}

	public boolean method7191() {
		return (worldFlags * -1176655995 & 0x4) != 0;
	}

	public boolean method7192() {
		return (worldFlags * -1176655995 & 0x4) != 0;
	}

	public boolean method7193() {
		return 0 != (worldFlags * -1176655995 & 0x8);
	}

	public boolean method7194() {
		return 0 != (worldFlags * -1176655995 & 0x8);
	}

	public boolean method7195(int i) {
		return 0 != (worldFlags * -1176655995 & 0x8);
	}

	public boolean method7196() {
		return 0 != (worldFlags * -1176655995 & 0x8);
	}

	static final void method7197(Class668 class668, byte i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_0_);
		Class234 class234 = Class463.aClass234Array5227[i_0_ >> 16];
		Class390.method4856(class251, class234, true, 2, class668, (byte) -119);
	}

	static final void method7198(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1959825479 * client.anInt11187;
	}

	static final void method7199(Class668 class668, short i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -632476725 * class251.zoom2d;
	}

	static void method7200(Class536_Sub18_Sub9 class536_sub18_sub9, int i, int i_1_, boolean bool, int i_2_) {
		if (class536_sub18_sub9 != null && Class70.aClass708_755.aClass536_8826 != class536_sub18_sub9) {
			int i_3_ = class536_sub18_sub9.anInt11713 * 1841718011;
			int i_4_ = -712698209 * class536_sub18_sub9.anInt11708;
			int i_5_ = class536_sub18_sub9.anInt11718 * -517484763;
			int i_6_ = (int) (9092992429781309163L * class536_sub18_sub9.aLong11711);
			long l = 9092992429781309163L * class536_sub18_sub9.aLong11711;
			if (i_5_ >= 2000)
				i_5_ -= 2000;
			Class598 class598 = client.aClass515_11066.method6255(-1657129067);
			if (i_5_ == 58) {
				IComponentDefinitions class251 = Class527.method6429(i_4_, i_3_, (byte) -48);
				if (null != class251)
					Class709.method8345(class251, -1616387282);
			}
			if (i_5_ == 23) {
				if (client.anInt11160 * 423156687 > 0 && ShadowQualitySetting.method10036(-1879487453))
					Class521_Sub4.method9366((Class565.MY_PLAYER.aByte10839), class598.anInt7839 * 1858049507 + i_3_, class598.anInt7840 * 1479112045 + i_4_, 2070080059);
				else {
					OutgoingPacketContainer class536_sub23 = Class245.method3413(i_3_, i_4_, i_6_, -1504778739);
					if (i_6_ == 1) {
						class536_sub23.stream.writeByte(-1);
						class536_sub23.stream.writeByte(-1);
						class536_sub23.stream.writeShort((int) client.aFloat11106, -1778059594);
						class536_sub23.stream.writeByte(57);
						class536_sub23.stream.writeByte(-2011409073 * client.anInt11096);
						class536_sub23.stream.writeByte(1858649483 * client.anInt11098);
						class536_sub23.stream.writeByte(89);
						Class436 class436 = (Class565.MY_PLAYER.method7837().aClass436_4823);
						class536_sub23.stream.writeShort((int) class436.aFloat4850, -1778059594);
						class536_sub23.stream.writeShort((int) class436.aFloat4853, -1778059594);
						class536_sub23.stream.writeByte(63);
					} else {
						client.anInt11134 = i * -1202273473;
						client.anInt11135 = i_1_ * -1725614879;
						client.anInt11007 = 1894937805;
						client.anInt11130 = 0;
					}
					client.aClass106_11322.writePacket(class536_sub23, 1395264835);
					Class205_Sub17.method9089(i_3_, i_4_, (byte) 8);
				}
			}
			if (59 == i_5_) {
				client.anInt11134 = -1202273473 * i;
				client.anInt11135 = i_1_ * -1725614879;
				client.anInt11007 = 1894937805;
				client.anInt11130 = 0;
				OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4449, client.aClass106_11322.aClass15_1258, 674869678);
				class536_sub23.stream.writeShort128(i_4_ + class598.anInt7840 * 1479112045, (byte) 0);
				class536_sub23.stream.writeLEShort(1858049507 * class598.anInt7839 + i_3_, -1411037171);
				class536_sub23.stream.writeIntV2(1625551467 * Class663.anInt8515, (byte) 86);
				class536_sub23.stream.writeShort128(client.anInt11184 * -678599443, (byte) 0);
				class536_sub23.stream.write128Short(-1059472497 * client.anInt11183);
				client.aClass106_11322.writePacket(class536_sub23, 1516202558);
				Class205_Sub17.method9089(i_3_, i_4_, (byte) 12);
			}
			if (25 == i_5_) {
				IComponentDefinitions class251 = Class527.method6429(i_4_, i_3_, (byte) -106);
				if (null != class251) {
					Class270.method3717(-1541208997);
					IComponentSettings class536_sub14 = client.getIComponentSettings(class251);
					Class501.method6033(class251, class536_sub14.method9474(), 501091713 * class536_sub14.interfaceHash, 619367353);
					client.aString11185 = Class554.method6785(class251, 1845942644);
					if (client.aString11185 == null)
						client.aString11185 = "Null";
					client.aString11186 = new StringBuilder().append(class251.opBase).append(Class264.method3680(16777215, -2073833307)).toString();
				}
			} else {
				if (i_5_ == 57 || 1007 == i_5_)
					Class273.method3730(i_6_, i_4_, i_3_, class536_sub18_sub9.aString11712, -2139953305);
				if (i_5_ == 30 && null == client.aClass251_11057) {
					Class465_Sub1.method9386(i_4_, i_3_, (byte) -40);
					client.aClass251_11057 = Class527.method6429(i_4_, i_3_, (byte) -100);
					if (null != client.aClass251_11057)
						Class668.method8011(client.aClass251_11057, 263642117);
				}
				if (60 == i_5_) {
					if (423156687 * client.anInt11160 > 0 && ShadowQualitySetting.method10036(-1141160283))
						Class521_Sub4.method9366((Class565.MY_PLAYER.aByte10839), i_3_ + 1858049507 * class598.anInt7839, class598.anInt7840 * 1479112045 + i_4_, 2070080059);
					else {
						client.anInt11134 = -1202273473 * i;
						client.anInt11135 = i_1_ * -1725614879;
						client.anInt11007 = 1894937805;
						client.anInt11130 = 0;
						OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4465, (client.aClass106_11322.aClass15_1258), 1537705173);
						class536_sub23.stream.writeLEShort(class598.anInt7839 * 1858049507 + i_3_, -1411037171);
						class536_sub23.stream.writeShort(1479112045 * class598.anInt7840 + i_4_, -1778059594);
						client.aClass106_11322.writePacket(class536_sub23, 116537214);
					}
				}
				if (16 == i_5_) {
					client.anInt11134 = i * -1202273473;
					client.anInt11135 = -1725614879 * i_1_;
					client.anInt11007 = -505091686;
					client.anInt11130 = 0;
					OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4487, (client.aClass106_11322.aClass15_1258), 908960968);
					class536_sub23.stream.writeShort128(-678599443 * client.anInt11184, (byte) 0);
					class536_sub23.stream.writeByte128(Class569.method6925(-1992554731) ? 1 : 0);
					class536_sub23.stream.writeIntV2(1625551467 * Class663.anInt8515, (byte) 68);
					class536_sub23.stream.writeLEShort((Class565.MY_PLAYER.anInt11889) * 1710020215, -1411037171);
					class536_sub23.stream.writeLEShort(client.anInt11183 * -1059472497, -1411037171);
					client.aClass106_11322.writePacket(class536_sub23, 1276854706);
				}
				OutgoingPacket class414 = null;
				if (9 == i_5_)
					class414 = OutgoingPacket.aClass414_4461;
				else if (10 == i_5_)
					class414 = OutgoingPacket.aClass414_4467;
				else if (i_5_ == 11)
					class414 = OutgoingPacket.aClass414_4454;
				else if (i_5_ == 12)
					class414 = OutgoingPacket.aClass414_4463;
				else if (13 == i_5_)
					class414 = OutgoingPacket.aClass414_4490;
				else if (1003 == i_5_)
					class414 = OutgoingPacket.aClass414_4405;
				if (null != class414) {
					ObjectParam class536_sub13 = ((ObjectParam) client.aClass4_11050.method556((long) i_6_));
					if (null != class536_sub13) {
						NPC class649_sub1_sub5_sub1_sub1 = ((NPC) class536_sub13.value);
						client.anInt11134 = i * -1202273473;
						client.anInt11135 = i_1_ * -1725614879;
						client.anInt11007 = -505091686;
						client.anInt11130 = 0;
						OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(class414, (client.aClass106_11322.aClass15_1258), 1512570781);
						class536_sub23.stream.method9753(Class569.method6925(-1088640839) ? 1 : 0, -950100578);
						class536_sub23.stream.writeShort(i_6_, -1778059594);
						client.aClass106_11322.writePacket(class536_sub23, 129046789);
						Class205_Sub17.method9089((class649_sub1_sub5_sub1_sub1.screenX[0]), (class649_sub1_sub5_sub1_sub1.screenY[0]), (byte) -9);
					}
				}
				OutgoingPacket outgoingPacket = null;
				if (3 == i_5_)
					outgoingPacket = OutgoingPacket.aClass414_4438;
				else if (4 == i_5_)
					outgoingPacket = OutgoingPacket.aClass414_4442;
				else if (5 == i_5_)
					outgoingPacket = OutgoingPacket.aClass414_4411;
				else if (6 == i_5_)
					outgoingPacket = OutgoingPacket.aClass414_4453;
				else if (i_5_ == 1001)
					outgoingPacket = OutgoingPacket.aClass414_4492;
				else if (1002 == i_5_)
					outgoingPacket = OutgoingPacket.aClass414_4431;
				if (outgoingPacket != null) {
					client.anInt11134 = -1202273473 * i;
					client.anInt11135 = i_1_ * -1725614879;
					client.anInt11007 = -505091686;
					client.anInt11130 = 0;
					OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(outgoingPacket, (client.aClass106_11322.aClass15_1258), 1721311610);
					class536_sub23.stream.writeByte(Class569.method6925(-949636837) ? 1 : 0);
					class536_sub23.stream.writeShort(1479112045 * class598.anInt7840 + i_4_, -1778059594);
					class536_sub23.stream.writeShort(1858049507 * class598.anInt7839 + i_3_, -1778059594);
					class536_sub23.stream.writeIntV1((int) (l >>> 32) & 0x7fffffff, -2028702058);
					client.aClass106_11322.writePacket(class536_sub23, 1104662177);
					Class205_Sub17.method9089(i_3_, i_4_, (byte) -25);
				}
				if (i_5_ == 8) {
					ObjectParam class536_sub13 = ((ObjectParam) client.aClass4_11050.method556((long) i_6_));
					if (class536_sub13 != null) {
						NPC class649_sub1_sub5_sub1_sub1 = ((NPC) class536_sub13.value);
						client.anInt11134 = -1202273473 * i;
						client.anInt11135 = -1725614879 * i_1_;
						client.anInt11007 = -505091686;
						client.anInt11130 = 0;
						OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4434, (client.aClass106_11322.aClass15_1258), 1489591833);
						class536_sub23.stream.writeByte128(Class569.method6925(-1437938896) ? 1 : 0);
						class536_sub23.stream.write128Short(i_6_);
						class536_sub23.stream.writeShort128(client.anInt11184 * -678599443, (byte) 0);
						class536_sub23.stream.writeIntV2(1625551467 * Class663.anInt8515, (byte) 33);
						class536_sub23.stream.writeShort(-1059472497 * client.anInt11183, -1778059594);
						client.aClass106_11322.writePacket(class536_sub23, 841640081);
						Class205_Sub17.method9089((class649_sub1_sub5_sub1_sub1.screenX[0]), (class649_sub1_sub5_sub1_sub1.screenY[0]), (byte) 44);
					}
				}
				OutgoingPacket class414_8_ = null;
				if (i_5_ == 18)
					class414_8_ = OutgoingPacket.aClass414_4407;
				else if (19 == i_5_)
					class414_8_ = OutgoingPacket.aClass414_4472;
				else if (20 == i_5_)
					class414_8_ = OutgoingPacket.aClass414_4428;
				else if (21 == i_5_)
					class414_8_ = OutgoingPacket.aClass414_4496;
				else if (i_5_ == 22)
					class414_8_ = OutgoingPacket.aClass414_4436;
				else if (i_5_ == 1004)
					class414_8_ = OutgoingPacket.aClass414_4519;
				if (null != class414_8_) {
					client.anInt11134 = -1202273473 * i;
					client.anInt11135 = i_1_ * -1725614879;
					client.anInt11007 = -505091686;
					client.anInt11130 = 0;
					OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(class414_8_, (client.aClass106_11322.aClass15_1258), 1486030580);
					class536_sub23.stream.writeShort(i_3_ + class598.anInt7839 * 1858049507, -1778059594);
					class536_sub23.stream.writeShort128(i_6_, (byte) 0);
					class536_sub23.stream.writeShort128(i_4_ + class598.anInt7840 * 1479112045, (byte) 0);
					class536_sub23.stream.method9753((bool ? 2 : 0) | (Class569.method6925(-494710395) ? 1 : 0), 415114420);
					client.aClass106_11322.writePacket(class536_sub23, -283017989);
					Class205_Sub17.method9089(i_3_, i_4_, (byte) 25);
				}
				OutgoingPacket class414_9_ = null;
				if (44 == i_5_)
					class414_9_ = OutgoingPacket.aClass414_4510;
				else if (i_5_ == 45)
					class414_9_ = OutgoingPacket.aClass414_4470;
				else if (i_5_ == 46)
					class414_9_ = OutgoingPacket.aClass414_4445;
				else if (47 == i_5_)
					class414_9_ = OutgoingPacket.aClass414_4495;
				else if (i_5_ == 48)
					class414_9_ = OutgoingPacket.aClass414_4416;
				else if (i_5_ == 49)
					class414_9_ = OutgoingPacket.aClass414_4469;
				else if (50 == i_5_)
					class414_9_ = OutgoingPacket.aClass414_4409;
				else if (i_5_ == 51)
					class414_9_ = OutgoingPacket.aClass414_4474;
				else if (i_5_ == 52)
					class414_9_ = OutgoingPacket.aClass414_4480;
				else if (i_5_ == 53)
					class414_9_ = OutgoingPacket.aClass414_4422;
				if (class414_9_ != null) {
					Player class649_sub1_sub5_sub1_sub2 = client.PLAYER_LIST[i_6_];
					if (class649_sub1_sub5_sub1_sub2 != null) {
						client.anInt11134 = i * -1202273473;
						client.anInt11135 = -1725614879 * i_1_;
						client.anInt11007 = -505091686;
						client.anInt11130 = 0;
						OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(class414_9_, (client.aClass106_11322.aClass15_1258), 2017519484);
						class536_sub23.stream.write128Short(i_6_);
						class536_sub23.stream.writeByte128(Class569.method6925(494587416) ? 1 : 0);
						client.aClass106_11322.writePacket(class536_sub23, 2095676703);
						Class205_Sub17.method9089((class649_sub1_sub5_sub1_sub2.screenX[0]), (class649_sub1_sub5_sub1_sub2.screenY[0]), (byte) 46);
					}
				}
				if (i_5_ == 1008 || 1009 == i_5_ || i_5_ == 1010 || i_5_ == 1011 || 1012 == i_5_)
					Class694.method8209(i_5_, i_6_, i_3_, 809542679);
				if (15 == i_5_) {
					Player class649_sub1_sub5_sub1_sub2 = client.PLAYER_LIST[i_6_];
					if (null != class649_sub1_sub5_sub1_sub2) {
						client.anInt11134 = -1202273473 * i;
						client.anInt11135 = i_1_ * -1725614879;
						client.anInt11007 = -505091686;
						client.anInt11130 = 0;
						OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4487, (client.aClass106_11322.aClass15_1258), 614885368);
						class536_sub23.stream.writeShort128(client.anInt11184 * -678599443, (byte) 0);
						class536_sub23.stream.writeByte128(Class569.method6925(715851019) ? 1 : 0);
						class536_sub23.stream.writeIntV2(1625551467 * Class663.anInt8515, (byte) 50);
						class536_sub23.stream.writeLEShort(i_6_, -1411037171);
						class536_sub23.stream.writeLEShort(client.anInt11183 * -1059472497, -1411037171);
						client.aClass106_11322.writePacket(class536_sub23, 641177125);
						Class205_Sub17.method9089((class649_sub1_sub5_sub1_sub2.screenX[0]), (class649_sub1_sub5_sub1_sub2.screenY[0]), (byte) -65);
					}
				}
				if (i_5_ == 2) {
					client.anInt11134 = -1202273473 * i;
					client.anInt11135 = -1725614879 * i_1_;
					client.anInt11007 = -505091686;
					client.anInt11130 = 0;
					OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4435, (client.aClass106_11322.aClass15_1258), 596683197);
					class536_sub23.stream.writeIntV1((int) (l >>> 32) & 0x7fffffff, -2121065672);
					class536_sub23.stream.writeShort(-1059472497 * client.anInt11183, -1778059594);
					class536_sub23.stream.writeByte128(Class569.method6925(841866199) ? 1 : 0);
					class536_sub23.stream.writeIntV1(1625551467 * Class663.anInt8515, -2063609264);
					class536_sub23.stream.writeLEShort(i_3_ + 1858049507 * class598.anInt7839, -1411037171);
					class536_sub23.stream.writeLEShort(1479112045 * class598.anInt7840 + i_4_, -1411037171);
					class536_sub23.stream.writeLEShort(client.anInt11184 * -678599443, -1411037171);
					client.aClass106_11322.writePacket(class536_sub23, 1988401717);
					Class205_Sub17.method9089(i_3_, i_4_, (byte) -75);
				}
				if (17 == i_5_) {
					client.anInt11134 = i * -1202273473;
					client.anInt11135 = -1725614879 * i_1_;
					client.anInt11007 = -505091686;
					client.anInt11130 = 0;
					OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4456, (client.aClass106_11322.aClass15_1258), 1389835391);
					class536_sub23.stream.writeLEShort(client.anInt11184 * -678599443, -1411037171);
					class536_sub23.stream.writeByte128(Class569.method6925(-191899434) ? 1 : 0);
					class536_sub23.stream.writeShort(client.anInt11183 * -1059472497, -1778059594);
					class536_sub23.stream.writeShort128(i_4_ + 1479112045 * class598.anInt7840, (byte) 0);
					class536_sub23.stream.writeShort(i_6_, -1778059594);
					class536_sub23.stream.writeIntV1(1625551467 * Class663.anInt8515, -2062185188);
					class536_sub23.stream.writeShort128(1858049507 * class598.anInt7839 + i_3_, (byte) 0);
					client.aClass106_11322.writePacket(class536_sub23, 427221142);
					Class205_Sub17.method9089(i_3_, i_4_, (byte) -21);
				}
				if (client.aBool11188)
					Class270.method3717(680818134);
				if (Class166.aClass251_1842 != null && client.anInt11009 * 1893634437 == 0)
					Class668.method8011(Class166.aClass251_1842, 263642117);
			}
		}
	}

	static final void method7201(Class668 class668, int i) {
		int i_10_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.aClass231_11088.method3301(i_10_, (byte) 90).method3153((byte) 32);
	}

	public static void method7202(String string, byte i) {
		if (client.anInt11101 * -708374433 == 11) {
			OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4517, client.aClass106_11218.aClass15_1258, 1346833796);
			class536_sub23.stream.writeByte(0);
			int i_11_ = (-810172525 * class536_sub23.stream.off);
			class536_sub23.stream.writeString(string);
			class536_sub23.stream.off += -681738691;
			class536_sub23.stream.method9725(Class45.anIntArray526, i_11_, (-810172525 * class536_sub23.stream.off), -371733927);
			class536_sub23.stream.method9699((class536_sub23.stream.off * -810172525) - i_11_, 621188094);
			client.aClass106_11218.writePacket(class536_sub23, 1112290273);
			Class45.aClass699_522 = Class699.aClass699_8785;
		}
	}
}
