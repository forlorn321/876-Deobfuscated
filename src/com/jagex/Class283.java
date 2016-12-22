/* Class283 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.net.URL;

public class Class283 implements Interface75 {
	public static Class283 aClass283_3179;
	public int anInt3180;
	public static Class283 aClass283_3181 = new Class283(1, 0);
	static Class283 aClass283_3182;
	int anInt3183;
	static int anInt3184;

	public int method73() {
		return 1829068743 * anInt3183;
	}

	static {
		aClass283_3179 = new Class283(0, 1);
		aClass283_3182 = new Class283(2, 2);
	}

	public int method12() {
		return 1829068743 * anInt3183;
	}

	public int method78() {
		return 1829068743 * anInt3183;
	}

	Class283(int i, int i_0_) {
		anInt3180 = 1937224693 * i;
		anInt3183 = i_0_ * -760696329;
	}

	public static Interface66 method3773(RSByteBuffer class536_sub33, int i) {
		Class583 class583 = Class359.method4725(class536_sub33.readUnsignedByte(), -330294148);
		if (class583 == Class583.aClass583_7704)
			return Class518.method6331(class536_sub33, (byte) -120);
		if (Class583.aClass583_7701 == class583)
			return Class410.method4998(class536_sub33, -2133468573);
		if (Class583.aClass583_7703 == class583)
			return Class459.method5518(class536_sub33, 1879449828);
		return null;
	}

	static final void method3774(Class668 class668, short i) throws Exception_Sub3 {
		class668.anInt8542 -= 1472892954;
		int i_1_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		float f = ((float) (class668.anIntArray8541[1 + 1867269829 * class668.anInt8542]) / 1000.0F);
		Class683.aClass301_Sub1_8651.method4044(i_1_, f, -406038895);
	}

	static final void method3775(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub23_10774.method10126(1041246061);
	}

	static int prevLoginStage = -1;
	
	static final void handleLogin(int i) {
		if (0 != Class61.loginStage * -129171495 && -129171495 * Class61.loginStage != 102) {
			do {
				try {
					int i_2_;
					if (Class61.anInt668 * -799336863 == 0 && Class61.loginStage * -129171495 < 90)
						i_2_ = 500;
					else
						i_2_ = 2000;
					if (Class61.aBool647 && -129171495 * Class61.loginStage >= 67)
						i_2_ = 6000;
					if ((1382700277 * Class76_Sub1.anInt10981 == 244 && -129171495 * Class61.loginStage != 212 && 1063476305 * Class61.anInt687 != 42) || (Class76_Sub1.anInt10981 * 1382700277 == 107 && 625930941 * Class61.anInt654 != 49 && 52 != 625930941 * Class61.anInt654))
						Class61.anInt683 += -1964376739;
					if (Class61.anInt683 * 239353589 > i_2_) {
						Class586.aClass106_7710.method1418(295510457);
						if (-799336863 * Class61.anInt668 < 3) {
							if (Class76_Sub1.anInt10981 * 1382700277 == 244)
								Class23.aClass5_221.method574(-2050722165);
							else
								Class23.aClass5_230.method574(867019832);
							Class61.anInt683 = 0;
							Class61.anInt668 += -149680735;
							Class61.loginStage = -2006177950;
						} else {
							Class61.loginStage = 0;
							Class537.method6507(-5, 1280785913);
							Class314.method4203(861456321);
							break;
						}
					}
					if (prevLoginStage != Class61.loginStage * -129171495) {
						//System.out.println("Login stage: " + Class61.loginStage * -129171495);
						prevLoginStage = Class61.loginStage * -129171495;
					}
					if (Class61.loginStage * -129171495 == 18) {
						if (Class76_Sub1.anInt10981 * 1382700277 == 244)
							Class586.aClass106_7710.method1420(Class506.method6146(Class23.aClass5_221.method575((byte) 43), 40000, (byte) 97), Class23.aClass5_221.aString112, -1933050734);
						else
							Class586.aClass106_7710.method1420(Class506.method6146(Class23.aClass5_230.method575((byte) 84), 40000, (byte) 90), Class23.aClass5_230.aString112, -1933050734);
						Class586.aClass106_7710.method1407(-564736805);
						Class536_Sub23 class536_sub23 = Class458_Sub3.method9359(1880826857);
						if (Class61.aBool647) {
							class536_sub23.aClass536_Sub33_Sub2_10528.writeByte((1258126983 * Class420.aClass420_4580.anInt4571), 465637339);
							class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(0, -1778059594);
							int i_3_ = ((class536_sub23.aClass536_Sub33_Sub2_10528.off) * -810172525);
							class536_sub23.aClass536_Sub33_Sub2_10528.writeInt(876, -149241618);
							class536_sub23.aClass536_Sub33_Sub2_10528.writeInt(1, -149241618);
							if (244 == Class76_Sub1.anInt10981 * 1382700277)
								class536_sub23.aClass536_Sub33_Sub2_10528.writeByte((17 == -708374433 * client.anInt11101 ? 1 : 0), 465637339);
							RSByteBuffer stream = Class458_Sub3.method9358((byte) -10);
							Class655.method7938(stream, (long) (Class61.anInt648 * 1234839363));
							Class450.aLong4943 = (5595631816110933555L * (long) Class61.anInt648);
							stream.writeByte((1234839363 * Class61.anInt648), 465637339);
							stream.writeByte(Class459.aClass664_5178.method78(), 465637339);
							stream.writeInt((1051867059 * client.anInt10987), -149241618);
							for (int i_4_ = 0; i_4_ < 5; i_4_++)
								stream.writeInt((int) (Math.random() * 9.9999999E7), -149241618);
							stream.writeLong(client.aLong11025 * 6862939200387171825L);
							stream.writeByte((client.aClass670_11043.anInt8567) * 273023065, 465637339);
							stream.writeByte((int) (Math.random() * 9.9999999E7), 465637339);
							stream.applyRSA(Class72.LOGIN_PUBLIC_EXPONENT, Class72.LOGIN_PUBLIC_MODULUS, 1699688896);
							class536_sub23.aClass536_Sub33_Sub2_10528.method9696(stream.buffer, 0, stream.off * -810172525, (byte) 6);
							class536_sub23.aClass536_Sub33_Sub2_10528.method9698(-810172525 * (class536_sub23.aClass536_Sub33_Sub2_10528.off) - i_3_, 309253871);
						} else
							class536_sub23.aClass536_Sub33_Sub2_10528.writeByte((1258126983 * Class420.aClass420_4581.anInt4571), 465637339);
						Class586.aClass106_7710.method1409(class536_sub23, 461885639);
						Class586.aClass106_7710.method1408(-553916622);
						Class61.loginStage = -1657664224;
					}
					if (32 == -129171495 * Class61.loginStage) {
						if (!Class586.aClass106_7710.method1413((short) -11212).bitsRemaining(1, -2064942498))
							break;
						Class586.aClass106_7710.method1413((short) -6431).method6899((Class586.aClass106_7710.byteBuffer.buffer), 0, 1, 1913546577);
						Class586.aClass106_7710.byteBuffer.off = 0;
						int i_5_ = Class586.aClass106_7710.byteBuffer.readUnsignedByte();
						if (0 != i_5_) {
							Class61.loginStage = 0;
							Class648.method7827(i_5_, (short) 9328);
							Class537.method6507(i_5_, 1280785913);
							Class586.aClass106_7710.method1418(366441967);
							Class314.method4203(861456321);
							break;
						}
						Class586.aClass106_7710.byteBuffer.off = 0;
						if (Class61.aBool647)
							Class61.loginStage = 1427006069;
						else
							Class61.loginStage = -1026539102;
					}
					if (45 == -129171495 * Class61.loginStage) {
						if (!Class586.aClass106_7710.method1413((short) -5611).bitsRemaining(2, -1010061291))
							break;
						Class586.aClass106_7710.method1413((short) -3206).method6899((Class586.aClass106_7710.byteBuffer.buffer), 0, 2, 654157741);
						Class586.aClass106_7710.byteBuffer.off = 0;
						Class586.aClass106_7710.byteBuffer.off = Class586.aClass106_7710.byteBuffer.readUnsignedShort() * 516175515;
						Class61.loginStage = -546220716;
					}
					if (52 == -129171495 * Class61.loginStage) {
						if (!Class586.aClass106_7710.method1413((short) -1313).bitsRemaining(-810172525 * (Class586.aClass106_7710.byteBuffer.off), -279295679))
							break;
						Class586.aClass106_7710.method1413((short) -8465).method6899((Class586.aClass106_7710.byteBuffer.buffer), 0, -810172525 * (Class586.aClass106_7710.byteBuffer.off), 1601221752);
						Class586.aClass106_7710.byteBuffer.method9724(Class234.anIntArray2380, 130924266);
						Class586.aClass106_7710.byteBuffer.off = 0;
						String string = Class586.aClass106_7710.byteBuffer.readVersionedString((byte) 37);
						Class586.aClass106_7710.byteBuffer.off = 0;
						String string_6_ = Class412.aClass412_4391.method5005(877995250);
						Class420.method5063(string, true, string_6_, client.aBool11228, (byte) 83);
						Class61.loginStage = 1361103739;
					}
					if (67 == -129171495 * Class61.loginStage) {
						if (!Class586.aClass106_7710.method1413((short) 15438).bitsRemaining(1, -1342227871))
							break;
						Class586.aClass106_7710.method1413((short) -8911).method6899((Class586.aClass106_7710.byteBuffer.buffer), 0, 1, -686726654);
						if (1 == ((Class586.aClass106_7710.byteBuffer.buffer[0]) & 0xff))
							Class61.loginStage = 1742568630;
					}
					if (70 == Class61.loginStage * -129171495) {
						if (!Class586.aClass106_7710.method1413((short) -23141).bitsRemaining(16, -749041154))
							break;
						Class586.aClass106_7710.method1413((short) -4572).method6899((Class586.aClass106_7710.byteBuffer.buffer), 0, 16, -813454082);
						Class586.aClass106_7710.byteBuffer.off = -331126352;
						Class586.aClass106_7710.byteBuffer.method9724(Class234.anIntArray2380, 130924266);
						Class586.aClass106_7710.byteBuffer.off = 0;
						Class61.aLong649 = (Class586.aClass106_7710.byteBuffer.readLong(702869087) * -4822916419102841261L);
						Class61.aLong644 = (Class586.aClass106_7710.byteBuffer.readLong(702869087) * -6047393890855416081L);
						Class61.loginStage = -1026539102;
					}
					if (82 == -129171495 * Class61.loginStage) {
						Class586.aClass106_7710.byteBuffer.off = 0;
						Class586.aClass106_7710.method1407(-462750759);
						Class536_Sub23 class536_sub23 = Class458_Sub3.method9359(1968268194);
						Class536_Sub33_Sub2 stream = class536_sub23.aClass536_Sub33_Sub2_10528;
						if (244 == Class76_Sub1.anInt10981 * 1382700277) {
							Class420 class420;
							if (Class61.aBool647)
								class420 = Class420.aClass420_4576;
							else
								class420 = Class420.aClass420_4573;
							stream.writeByte((1258126983 * (class420.anInt4571)), 465637339);
							stream.writeShort(0, -1778059594);
							int i_7_ = stream.off * -810172525;
							int i_8_ = -810172525 * stream.off;
							if (!Class61.aBool647) {
								stream.writeInt(876, -149241618);
								stream.writeInt(1, -149241618);
								stream.writeByte((17 == client.anInt11101 * -708374433 ? 1 : 0), 465637339);
								i_8_ = (-810172525 * stream.off);
								RSByteBuffer class536_sub33 = Class583.method7027(1511560742);
								stream.method9696(class536_sub33.buffer, 0, class536_sub33.off * -810172525, (byte) 25);
								i_8_ = (stream.off * -810172525);
								stream.writeByte((Class61.aLong649 * -7692785137277514277L == -1L) ? 1 : 0, 465637339);
								if (-1L == (Class61.aLong649 * -7692785137277514277L))
									stream.writeString(Class61.aString679, 139127958);
								else
									stream.writeLong(Class61.aLong649 * -7692785137277514277L);
							}
							stream.writeByte(Class315.method4212((byte) 108), 465637339);
							stream.writeShort((Class144.anInt1679 * -1804846931), -1778059594);
							stream.writeShort(((Class34_Sub6.anInt10965) * 589116499), -1778059594);
							stream.writeByte(Class710.aClass536_Sub40_8843.aClass710_Sub27_10743.method10156(1942339354), 465637339);
							Class502.method6042(stream, (byte) 104);
							stream.writeString(client.aString10986, 525471922);
							stream.writeInt((1051867059 * (client.anInt10987)), -149241618);
							RSByteBuffer class536_sub33 = Class710.aClass536_Sub40_8843.method9852(-534711081);
							stream.writeByte(((class536_sub33.off) * -810172525), 465637339);
							stream.method9696(class536_sub33.buffer, 0, class536_sub33.off * -810172525, (byte) 21);
							client.aBool11015 = true;
							RSByteBuffer class536_sub33_9_ = (new RSByteBuffer(Class458_Sub4.aClass536_Sub38_10336.method9823(-1817170397)));
							Class458_Sub4.aClass536_Sub38_10336.method9822(class536_sub33_9_, 65536);
							stream.method9696(class536_sub33_9_.buffer, 0, class536_sub33_9_.buffer.length, (byte) 106);
							stream.writeInt((-1672186801 * (client.anInt11063)), -149241618);
							stream.writeInt((client.anInt10991 * -811133827), -149241618);
							stream.writeInt((client.anInt11017 * -599766855), -149241618);
							stream.writeInt((1015571801 * (client.anInt10993)), -149241618);
							stream.writeInt((-159434497 * (client.anInt10990)), -149241618);
							stream.writeString(Class210.aString2260, -1004072383);
							stream.writeByte((client.aString10996 == null) ? 0 : 1, 465637339);
							if (null != client.aString10996)
								stream.writeString((client.aString10996), 1432052750);
							stream.writeByte((client.aBool10984 ? 1 : 0), 465637339);
							stream.writeByte((client.aBool11000 ? 1 : 0), 465637339);
							stream.writeByte(((Class353.anInt3740 * -1598677295) & 0x1), 465637339);
							stream.writeInt((76385059 * (client.anInt11003)), -149241618);
							stream.writeString(client.aString11004, 40351210);
							stream.writeByte((null == Class23.aClass5_228 || (Class23.aClass5_228.anInt111 * 1318197187 != (Class23.aClass5_221.anInt111 * 1318197187))) ? 1 : 0, 465637339);
							stream.writeShort(((Class23.aClass5_230.anInt111) * 1318197187), -1778059594);
							Class453.method5443(stream, 516435697);
							stream.method9725(Class234.anIntArray2380, i_8_, -810172525 * stream.off, -1540510576);
							stream.method9698((stream.off * -810172525 - i_7_), 276606032);
						} else {
							Class420 class420;
							if (Class61.aBool647)
								class420 = Class420.aClass420_4576;
							else
								class420 = Class420.aClass420_4574;
							stream.writeByte((1258126983 * (class420.anInt4571)), 465637339);
							stream.writeShort(0, -1778059594);
							int i_10_ = stream.off * -810172525;
							int i_11_ = -810172525 * stream.off;
							if (!Class61.aBool647) {
								stream.writeInt(876, -149241618);
								stream.writeInt(1, -149241618);
								RSByteBuffer class536_sub33 = Class583.method7027(291730906);
								stream.method9696(class536_sub33.buffer, 0, class536_sub33.off * -810172525, (byte) 109);
								i_11_ = (-810172525 * stream.off);
								stream.writeByte((Class61.aLong649 * -7692785137277514277L == -1L) ? 1 : 0, 465637339);
								if (Class61.aLong649 * -7692785137277514277L == -1L)
									stream.writeString(Class61.aString679, 2079138510);
								else
									stream.writeLong(Class61.aLong649 * -7692785137277514277L);
							}
							stream.writeByte((273023065 * (client.aClass670_11043.anInt8567)), 465637339);
							stream.writeByte(Class459.aClass664_5178.method78(), 465637339);
							stream.writeByte(Class315.method4212((byte) 50), 465637339);
							stream.writeShort((Class144.anInt1679 * -1804846931), -1778059594);
							stream.writeShort((589116499 * (Class34_Sub6.anInt10965)), -1778059594);
							stream.writeByte(Class710.aClass536_Sub40_8843.aClass710_Sub27_10743.method10156(1441321506), 465637339);
							Class502.method6042(stream, (byte) 66);
							stream.writeString(client.aString10986, 518928268);
							RSByteBuffer class536_sub33 = Class710.aClass536_Sub40_8843.method9852(-534711081);
							stream.writeByte(((class536_sub33.off) * -810172525), 465637339);
							stream.method9696(class536_sub33.buffer, 0, -810172525 * class536_sub33.off, (byte) 83);
							RSByteBuffer class536_sub33_12_ = (new RSByteBuffer(Class458_Sub4.aClass536_Sub38_10336.method9823(-2094799820)));
							Class458_Sub4.aClass536_Sub38_10336.method9822(class536_sub33_12_, 65536);
							stream.method9696(class536_sub33_12_.buffer, 0, class536_sub33_12_.buffer.length, (byte) 15);
							stream.writeInt((-1672186801 * (client.anInt11063)), -149241618);
							stream.writeString(Class210.aString2260, -2052745682);
							stream.writeInt((client.anInt10987 * 1051867059), -149241618);
							stream.writeInt((client.anInt11003 * 76385059), -149241618);
							stream.writeString(client.aString11004, 1101063988);
							stream.writeByte(((Class353.anInt3740 * -1598677295) & 0x1), 465637339);
							Class453.method5443(stream, 657042519);
							stream.method9725(Class234.anIntArray2380, i_11_, -810172525 * stream.off, -2045710808);
							stream.method9698((-810172525 * stream.off - i_10_), 1200013464);
						}
						Class586.aClass106_7710.method1409(class536_sub23, 597023125);
						Class586.aClass106_7710.method1408(1730274143);
						Class586.aClass106_7710.aClass15_1258 = new Class15(Class234.anIntArray2380);
						for (int i_13_ = 0; i_13_ < 4; i_13_++)
							Class234.anIntArray2380[i_13_] += 50;
						Class586.aClass106_7710.aClass15_1260 = new Class15(Class234.anIntArray2380);
						new Class15(Class234.anIntArray2380);
						Class586.aClass106_7710.byteBuffer.method10782(Class586.aClass106_7710.aClass15_1260, -2019890215);
						Class234.anIntArray2380 = null;
						Class61.loginStage = -1440955158;
					}
					if (-129171495 * Class61.loginStage == 90) {
						if (!Class586.aClass106_7710.method1413((short) -5706).bitsRemaining(1, -17787116))
							break;
						Class586.aClass106_7710.method1413((short) -22741).method6899((Class586.aClass106_7710.byteBuffer.buffer), 0, 1, -488112440);
						int i_14_ = Class586.aClass106_7710.byteBuffer.readUnsignedByte();
						Class586.aClass106_7710.byteBuffer.off = 0;
						if (i_14_ == 21)
							Class61.loginStage = -362462815;
						else {
							if (i_14_ == 1) {
								Class61.loginStage = 84904406;
								Class537.method6507(i_14_, 1280785913);
								break;
							}
							if (i_14_ == 52) {
								Class434.anInt4845 = i_14_ * -1961759907;
								Class61.loginStage = -1836369138;
							} else if (2 == i_14_) {
								if (Class61.aBool672) {
									Class61.aBool672 = false;
									Class61.loginStage = -2006177950;
									break;
								}
								if (244 == 1382700277 * Class76_Sub1.anInt10981) {
									Class590.aClass147_Sub1_7791.method8403(942964895);
									Class61.loginStage = -1935222633;
								} else
									Class61.loginStage = -428365145;
							} else if (i_14_ == 15) {
								Class586.aClass106_7710.anInt1262 = -1850440366;
								Class61.loginStage = 2110084432;
							} else {
								if (i_14_ == 23 && -799336863 * Class61.anInt668 < 3) {
									Class61.anInt683 = 0;
									Class61.anInt668 += -149680735;
									Class61.loginStage = -2006177950;
									Class586.aClass106_7710.method1418(1580814611);
									break;
								}
								if (42 == i_14_) {
									Class61.loginStage = -244607244;
									Class537.method6507(i_14_, 1280785913);
									break;
								}
								if (Class76_Sub1.anInt10981 * 1382700277 == 107 && i_14_ == 49 && -708374433 * client.anInt11101 != 4) {
									if (52 != Class61.anInt654 * 625930941)
										Class537.method6507(i_14_, 1280785913);
									break;
								}
								if (Class61.aBool646 && !Class61.aBool647 && -1 != Class61.anInt648 * 1234839363 && 35 == i_14_) {
									Class61.aBool647 = true;
									Class61.anInt683 = 0;
									Class61.loginStage = -2006177950;
									Class586.aClass106_7710.method1418(267702318);
									break;
								}
								if (53 == i_14_)
									Class61.loginStage = -343460739;
								else {
									Class61.loginStage = 0;
									Class537.method6507(i_14_, 1280785913);
									Class586.aClass106_7710.method1418(261548624);
									Class314.method4203(861456321);
									break;
								}
							}
						}
					}
					if (121 == -129171495 * Class61.loginStage) {
						if (Class586.aClass106_7710.method1413((short) -9900).bitsRemaining(1, -326223239)) {
							Class586.aClass106_7710.method1413((short) 16482).method6899((Class586.aClass106_7710.byteBuffer.buffer), 0, 1, 899930747);
							int i_15_ = ((Class586.aClass106_7710.byteBuffer.buffer[0]) & 0xff);
							Class61.anInt691 = i_15_ * 978493646;
							Class61.loginStage = 0;
							Class537.method6507(21, 1280785913);
							Class586.aClass106_7710.method1418(-1952296485);
							Class314.method4203(861456321);
						}
					} else if (212 == Class61.loginStage * -129171495) {
						if (Class586.aClass106_7710.method1413((short) -25301).bitsRemaining(2, -1707478181)) {
							Class586.aClass106_7710.method1413((short) 22277).method6899((Class586.aClass106_7710.byteBuffer.buffer), 0, 2, -610021124);
							Class61.anInt694 = (((Class586.aClass106_7710.byteBuffer.buffer[1]) & 0xff) + (((Class586.aClass106_7710.byteBuffer.buffer[0]) & 0xff) << 8)) * 712892153;
							Class61.loginStage = -1440955158;
						}
					} else if (-129171495 * Class61.loginStage == 245) {
						if (Class586.aClass106_7710.method1413((short) -3724).bitsRemaining(4, -763799203)) {
							Class586.aClass106_7710.method1413((short) 9652).method6899((Class586.aClass106_7710.byteBuffer.buffer), 0, 4, 1117853473);
							Class61.anInt659 = Class586.aClass106_7710.byteBuffer.readInt() * -1676086137;
							Class586.aClass106_7710.byteBuffer.off = 0;
							Class61.loginStage = 0;
							Class537.method6507(53, 1280785913);
							Class586.aClass106_7710.method1418(697489898);
							Class314.method4203(861456321);
						}
					} else if (198 == -129171495 * Class61.loginStage) {
						if (29 == 862241013 * Class434.anInt4845) {
							if (!Class586.aClass106_7710.method1413((short) 20373).bitsRemaining(1, -1900149253))
								break;
							Class586.aClass106_7710.method1413((short) -5800).method6899((Class586.aClass106_7710.byteBuffer.buffer), 0, 1, -1497801218);
							Class61.anInt693 = ((Class586.aClass106_7710.byteBuffer.buffer[0]) & 0xff) * 258201153;
						} else if (862241013 * Class434.anInt4845 == 45) {
							if (!Class586.aClass106_7710.method1413((short) 3162).bitsRemaining(3, -817876651))
								break;
							Class586.aClass106_7710.method1413((short) 23311).method6899((Class586.aClass106_7710.byteBuffer.buffer), 0, 3, 1557781137);
							Class61.anInt693 = 258201153 * ((Class586.aClass106_7710.byteBuffer.buffer[0]) & 0xff);
							Class61.anInt651 = (((Class586.aClass106_7710.byteBuffer.buffer[2]) & 0xff) + (((Class586.aClass106_7710.byteBuffer.buffer[1]) & 0xff) << 8)) * -541470089;
						} else
							throw new IllegalStateException();
						Class61.loginStage = 0;
						Class537.method6507(Class434.anInt4845 * 862241013, 1280785913);
						Class586.aClass106_7710.method1418(2087178207);
						Class314.method4203(861456321);
						if (Class233.method3334(-708374433 * client.anInt11101, (byte) -110)) {
							Class275.method3737(true, -1626406272);
							Class61.anInt687 = Class434.anInt4845 * -638073499;
						}
					} else if (222 == Class61.loginStage * -129171495) {
						if (Class586.aClass106_7710.method1413((short) -139).bitsRemaining(2, -1143363952)) {
							Class586.aClass106_7710.method1413((short) -1854).method6899((Class586.aClass106_7710.byteBuffer.buffer), 0, 2, -534642974);
							Class586.aClass106_7710.byteBuffer.off = 0;
							Class61.anInt686 = Class586.aClass106_7710.byteBuffer.readUnsignedShort() * 1281009209;
							Class586.aClass106_7710.byteBuffer.off = 0;
							Class61.loginStage = 1629766046;
						}
					} else if (Class61.loginStage * -129171495 == 238) {
						if (Class586.aClass106_7710.method1413((short) 14187).bitsRemaining(261187593 * Class61.anInt686, -1865502158)) {
							Class586.aClass106_7710.method1413((short) -705).method6899((Class586.aClass106_7710.byteBuffer.buffer), 0, Class61.anInt686 * 261187593, -1622375509);
							Class586.aClass106_7710.byteBuffer.off = 0;
							byte[] is = new byte[1 + 261187593 * Class61.anInt686];
							Class586.aClass106_7710.byteBuffer.method10776(is, 0, Class61.anInt686 * 261187593, -399442820);
							Class586.aClass106_7710.byteBuffer.off = 0;
							RSByteBuffer class536_sub33 = new RSByteBuffer(is);
							String string = class536_sub33.readString();
							Class380.method4809(string, true, client.aBool11228, 1612663522);
							Class537.method6507(Class434.anInt4845 * 862241013, 1280785913);
							if (107 == 1382700277 * Class76_Sub1.anInt10981 && -708374433 * client.anInt11101 != 4)
								Class61.loginStage = -1440955158;
							else {
								Class61.loginStage = 0;
								Class586.aClass106_7710.method1418(210929228);
								Class314.method4203(861456321);
							}
						}
					} else {
						if (Class61.loginStage * -129171495 == 255) {
							if (!Class586.aClass106_7710.method1413((short) 18842).bitsRemaining(2, -634869061))
								break;
							Class586.aClass106_7710.method1413((short) -5627).method6899((Class586.aClass106_7710.byteBuffer.buffer), 0, 2, 324355780);
							Class586.aClass106_7710.byteBuffer.off = 0;
							Class586.aClass106_7710.anInt1262 = Class586.aClass106_7710.byteBuffer.readUnsignedShort() * 925220183;
							Class61.loginStage = -790827960;
						}
						if (264 == -129171495 * Class61.loginStage) {
							if (!Class586.aClass106_7710.method1413((short) -31393).bitsRemaining((610303591 * Class586.aClass106_7710.anInt1262), -1794641496))
								break;
							Class586.aClass106_7710.method1413((short) -19183).method6899((Class586.aClass106_7710.byteBuffer.buffer), 0, Class586.aClass106_7710.anInt1262 * 610303591, -1813942440);
							Class586.aClass106_7710.byteBuffer.off = 0;
							boolean bool = (Class586.aClass106_7710.byteBuffer.readUnsignedByte() == 1);
							while (-810172525 * (Class586.aClass106_7710.byteBuffer.off) < (610303591 * Class586.aClass106_7710.anInt1262)) {
								Class430 class430 = (Class309.aClass98_Sub1_Sub2_3465.method8388((Class586.aClass106_7710.byteBuffer), -114932957));
								Class590.aClass147_Sub1_7791.anInterface3_1696.method18(706703961 * class430.anInt4820, class430.anObject4819, (byte) -56);
							}
							if (bool) {
								Class536_Sub23 class536_sub23 = Class458_Sub3.method9359(2043701963);
								Class536_Sub33_Sub2 class536_sub33_sub2 = (class536_sub23.aClass536_Sub33_Sub2_10528);
								class536_sub33_sub2.writeByte((1258126983 * Class420.aClass420_4577.anInt4571), 465637339);
								Class586.aClass106_7710.method1409(class536_sub23, 193095407);
								Class586.aClass106_7710.method1408(2145499619);
								Class61.loginStage = -1572759818;
							} else
								Class61.loginStage = -1935222633;
						}
						if (134 == -129171495 * Class61.loginStage) {
							if (!Class586.aClass106_7710.method1413((short) -28570).bitsRemaining(1, -1138366668))
								break;
							Class586.aClass106_7710.method1413((short) -19799).method6899((Class586.aClass106_7710.byteBuffer.buffer), 0, 1, -695173613);
							int i_16_ = ((Class586.aClass106_7710.byteBuffer.buffer[0]) & 0xff);
							if (2 != i_16_) {
								if (i_16_ == 29 || 45 == i_16_) {
									Class434.anInt4845 = -1961759907 * i_16_;
									Class61.loginStage = -593120970;
								} else {
									Class61.loginStage = 0;
									Class537.method6507(i_16_, 1280785913);
									Class586.aClass106_7710.method1418(2070569813);
									Class314.method4203(861456321);
									if (Class233.method3334((-708374433 * (client.anInt11101)), (byte) -121)) {
										Class275.method3737(true, -1508839617);
										Class61.anInt687 = -1813287759 * i_16_;
									}
									break;
								}
								break;
							}
							Class61.loginStage = -428365145;
						}
						if (143 == Class61.loginStage * -129171495) {
							if (!Class586.aClass106_7710.method1413((short) 26200).bitsRemaining(1, -1804428087))
								break;
							Class586.aClass106_7710.method1413((short) 8312).method6899((Class586.aClass106_7710.byteBuffer.buffer), 0, 1, -1400001440);
							Class111.anInt1390 = -838755691 * ((Class586.aClass106_7710.byteBuffer.buffer[0]) & 0xff);
							Class61.loginStage = -461316310;
						}
						if (-129171495 * Class61.loginStage == 154) {
							Class536_Sub33_Sub2 stream = (Class586.aClass106_7710.byteBuffer);
							if (244 == 1382700277 * Class76_Sub1.anInt10981) {
								if (!Class586.aClass106_7710.method1413((short) -9347).bitsRemaining(Class111.anInt1390 * -1774886723, -575659247))
									break;
								Class586.aClass106_7710.method1413((short) 5243).method6899(stream.buffer, 0, Class111.anInt1390 * -1774886723, -2095545630);
								stream.off = 0;
								Class8.method605(stream, (byte) 49);
								client.anInt11160 = (stream.readUnsignedByte() * -1078572241);
								client.anInt11118 = stream.readUnsignedByte() * 1771788825;
								client.aBool11078 = stream.readUnsignedByte() == 1;
								client.aBool11163 = stream.readUnsignedByte() == 1;
								client.aBool11303 = stream.readUnsignedByte() == 1;
								client.aBool11166 = stream.readUnsignedByte() == 1;
								client.anInt11156 = (stream.readUnsignedShort() * 213831113);
								client.aBool11290 = stream.readUnsignedByte() == 1;
								Class75.anInt819 = stream.read24BitInteger((byte) 83) * 89794997;
								client.aBool11123 = stream.readUnsignedByte() == 1;
								Class522.aString7077 = stream.readString();
								Class292.aLong3244 = ((stream.method9707((byte) 1) - Class249.method3450(1328868475)) * 8806393363580464715L);
								client.aClass515_11066.method6280(-1073841494).method10357(client.aBool11123, -2110300175);
								Class266.aClass503_2867.method6045(-1621113628).method6280(-1073841494).method10357(client.aBool11123, -1245173619);
								Class111.aClass34_Sub13_1391.method10337(client.aBool11123, 240129457);
								Class172.aClass34_Sub7_1922.method10324(client.aBool11123, 883519894);
							} else {
								if (!Class586.aClass106_7710.method1413((short) 26284).bitsRemaining(Class111.anInt1390 * -1774886723, -1985450726))
									break;
								Class586.aClass106_7710.method1413((short) 4553).method6899(stream.buffer, 0, -1774886723 * Class111.anInt1390, -954524616);
								stream.off = 0;
								Class8.method605(stream, (byte) 64);
								client.anInt11160 = (stream.readUnsignedByte() * -1078572241);
								client.anInt11118 = stream.readUnsignedByte() * 1771788825;
								client.aBool11078 = stream.readUnsignedByte() == 1;
								Class75.anInt819 = stream.read24BitInteger((byte) 115) * 89794997;
								Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte12197 = (byte) stream.readUnsignedByte();
								client.aBool11163 = stream.readUnsignedByte() == 1;
								client.aBool11303 = stream.readUnsignedByte() == 1;
								Class471.aLong5361 = (stream.readLong(702869087) * -3451902742676028657L);
								Class292.aLong3244 = (((-1435655525908132881L * Class471.aLong5361) - Class249.method3450(2028488713) - stream.read5ByteInteger(-1975364973)) * 8806393363580464715L);
								int i_17_ = stream.readUnsignedByte();
								client.aBool11290 = 0 != (i_17_ & 0x1);
								Class598.aBool7841 = (i_17_ & 0x2) != 0;
								Class486.anInt5443 = (stream.readInt() * -1872014567);
								Class141.anInt1659 = stream.readInt() * -423557781;
								Class619.anInt8093 = (stream.readUnsignedShort() * -1512061491);
								Class690.anInt8699 = (stream.readUnsignedShort() * 1487665559);
								Class292.anInt3243 = (stream.readUnsignedShort() * 1013602285);
								Class24.anInt232 = stream.readInt() * 899842251;
								Class374.aClass33_3907 = new Class33(Class24.anInt232 * -80091933);
								new Thread(Class374.aClass33_3907).start();
								Class172.anInt1923 = (stream.readUnsignedByte() * -2143180617);
								Class66.anInt723 = (stream.readUnsignedShort() * -860628261);
								Class307.anInt3454 = (stream.readUnsignedShort() * 434166907);
								Class151.aBool1712 = stream.readUnsignedByte() == 1;
								Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aString12184 = Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aString12192 = RuntimeException_Sub1.aString12036 = stream.readVersionedString((byte) 101);
								Class646.anInt8360 = stream.readUnsignedByte() * 431261749;
								Class622.anInt8127 = stream.readInt() * 57169007;
								Class23.aClass5_228 = new Class5();
								Class23.aClass5_228.anInt111 = (stream.readUnsignedShort() * 1232605419);
								if (Class23.aClass5_228.anInt111 * 1318197187 == 65535)
									Class23.aClass5_228.anInt111 = -1232605419;
								Class23.aClass5_228.aString112 = stream.readVersionedString((byte) 106);
								int port = stream.readUnsignedShort();
								Class23.aClass5_228.anInt110 = (port * -1803928197);
								int leet = stream.readUnsignedShort();
								Class23.aClass5_228.anInt108 = (leet * -1753280203);
								if ((Class47.aClass678_578 != Class678.aClass678_8616) && ((Class678.aClass678_8612 != Class47.aClass678_578) || client.anInt11160 * 423156687 < 2) && (Class23.aClass5_221.method579(Class23.aClass5_222, (byte) 27)))
									Class706.method8297((byte) -55);
							}
							if (client.aBool11303) {
								try {
									Class25.method729(Class622.anApplet8126, "zap", 542750906);
								} catch (Throwable throwable) {
									if (client.aBool10985) {
										try {
											Class622.anApplet8126.getAppletContext().showDocument(new URL(Class622.anApplet8126.getCodeBase(), "blank.ws"), "tbi");
										} catch (Exception exception) {
											/* empty */
										}
									}
								}
							} else {
								try {
									Class25.method729(Class622.anApplet8126, "unzap", 1653752288);
								} catch (Throwable throwable) {
									/* empty */
								}
							}
							if (Class47.aClass678_578 == Class678.aClass678_8619)
								Class412.aClass412_4383.method5009((byte) 59);
							if (Class76_Sub1.anInt10981 * 1382700277 == 244)
								Class61.loginStage = -1290148422;
							else {
								Class61.loginStage = 0;
								Class537.method6507(2, 1280785913);
								Class392_Sub3.method9309(-885333363);
								Class673.method8026(0, -1798113843);
								Class586.aClass106_7710.aClass422_1261 = null;
								break;
							}
						}
						if (Class61.loginStage * -129171495 == 170) {
							if (!Class586.aClass106_7710.method1413((short) 14174).bitsRemaining(3, -349982251))
								break;
							Class586.aClass106_7710.method1413((short) 3424).method6899((Class586.aClass106_7710.byteBuffer.buffer), 0, 3, -1583915461);
							Class61.loginStage = 998640924;
						}
						if (Class61.loginStage * -129171495 == 188) {
							Class536_Sub33_Sub2 class536_sub33_sub2 = (Class586.aClass106_7710.byteBuffer);
							class536_sub33_sub2.off = 0;
							if (class536_sub33_sub2.method10784(-1060827206)) {
								if (!Class586.aClass106_7710.method1413((short) -6753).bitsRemaining(1, -1443733857))
									break;
								Class586.aClass106_7710.method1413((short) -3391).method6899(class536_sub33_sub2.buffer, 3, 1, -2057318191);
							}
							Class586.aClass106_7710.aClass422_1261 = (Class374.method4778(1774670600)[class536_sub33_sub2.method10778(694140266)]);
							Class586.aClass106_7710.anInt1262 = class536_sub33_sub2.readUnsignedShort() * 925220183;
							Class61.loginStage = -1671613313;
						}
						if (167 == -129171495 * Class61.loginStage) {
							if (Class586.aClass106_7710.method1413((short) -26444).bitsRemaining(610303591 * Class586.aClass106_7710.anInt1262, -755963604)) {
								Class586.aClass106_7710.method1413((short) 16335).method6899((Class586.aClass106_7710.byteBuffer.buffer), 0, (Class586.aClass106_7710.anInt1262 * 610303591), -1334059410);
								Class586.aClass106_7710.byteBuffer.off = 0;
								int i_18_ = (Class586.aClass106_7710.anInt1262 * 610303591);
								Class61.loginStage = 0;
								Class537.method6507(2, 1280785913);
								Class619.method7396(-2078408794);
								Class57.method972((Class586.aClass106_7710.byteBuffer), (byte) 44);
								int i_19_ = i_18_ - (-810172525 * (Class586.aClass106_7710.byteBuffer.off));
								Class536_Sub33_Sub2 class536_sub33_sub2 = new Class536_Sub33_Sub2(i_19_);
								System.arraycopy((Class586.aClass106_7710.byteBuffer.buffer), (Class586.aClass106_7710.byteBuffer.off) * -810172525, (class536_sub33_sub2.buffer), 0, i_19_);
								Class586.aClass106_7710.byteBuffer.off += i_19_ * 516175515;
								if (IncomingPacket.DYNAMIC_MAP_SCENE == Class586.aClass106_7710.aClass422_1261)
									client.aClass515_11066.method6291(new Class510(Class498.aClass498_5558, class536_sub33_sub2), (byte) 23);
								else
									client.aClass515_11066.method6291(new Class510(Class498.aClass498_5557, class536_sub33_sub2), (byte) 58);
								if (-810172525 * (Class586.aClass106_7710.byteBuffer.off) != i_18_)
									throw new RuntimeException(new StringBuilder().append(-810172525 * (Class586.aClass106_7710.byteBuffer.off)).append(" ").append(i_18_).toString());
								Class586.aClass106_7710.aClass422_1261 = null;
							}
						} else {
							if (Class61.loginStage * -129171495 != 208)
								break;
							if (610303591 * Class586.aClass106_7710.anInt1262 == -2) {
								if (!Class586.aClass106_7710.method1413((short) 25398).bitsRemaining(2, -735440629))
									break;
								Class586.aClass106_7710.method1413((short) -4516).method6899((Class586.aClass106_7710.byteBuffer.buffer), 0, 2, -2072283285);
								Class586.aClass106_7710.byteBuffer.off = 0;
								Class586.aClass106_7710.anInt1262 = (Class586.aClass106_7710.byteBuffer.readUnsignedShort() * 925220183);
							}
							if (Class586.aClass106_7710.method1413((short) 9424).bitsRemaining(610303591 * Class586.aClass106_7710.anInt1262, -1358651921)) {
								Class586.aClass106_7710.method1413((short) 15744).method6899((Class586.aClass106_7710.byteBuffer.buffer), 0, (Class586.aClass106_7710.anInt1262 * 610303591), -2141813157);
								Class586.aClass106_7710.byteBuffer.off = 0;
								int i_20_ = (610303591 * Class586.aClass106_7710.anInt1262);
								Class61.loginStage = 0;
								Class537.method6507(15, 1280785913);
								Class299.method4016(1488232985);
								Class57.method972((Class586.aClass106_7710.byteBuffer), (byte) 36);
								if (-810172525 * (Class586.aClass106_7710.byteBuffer.off) != i_20_)
									throw new RuntimeException(new StringBuilder().append((Class586.aClass106_7710.byteBuffer.off) * -810172525).append(" ").append(i_20_).toString());
								Class586.aClass106_7710.aClass422_1261 = null;
							}
						}
					}
				} catch (IOException ioexception) {
					Class586.aClass106_7710.method1418(50749850);
					if (-799336863 * Class61.anInt668 < 3) {
						if (244 == 1382700277 * Class76_Sub1.anInt10981)
							Class23.aClass5_221.method574(-589492399);
						else
							Class23.aClass5_230.method574(-1118595400);
						Class61.anInt683 = 0;
						Class61.anInt668 += -149680735;
						Class61.loginStage = -2006177950;
					} else {
						Class61.loginStage = 0;
						Class537.method6507(-4, 1280785913);
						Class314.method4203(861456321);
					}
					break;
				}
				break;
			} while (false);
		}
	}

	static final void method3777(Class668 class668, int i) {
		int i_21_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_21_, -689214737);
		Class227.method3284(class251, class668, 1786540197);
	}
}
