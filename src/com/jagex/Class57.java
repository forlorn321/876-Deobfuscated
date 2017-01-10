/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

public class Class57 {
	static final int anInt609 = 127;
	static final int anInt610 = 7;

	Class57() throws Throwable {
		throw new Error();
	}

	public static int method965(int i) {
		return Class536_Sub42.aTwitchTV10811.GetLoginState();
	}

	public static void method966(int i, int i_0_) {
		Class98_Sub1_Sub1.anInt11323 = i * 1812291805;
		synchronized (PlayerAppearance.aClass199_8082) {
			PlayerAppearance.aClass199_8082.method2884((byte) -11);
		}
		synchronized (PlayerAppearance.aClass199_8081) {
			PlayerAppearance.aClass199_8081.method2884((byte) -94);
		}
	}

	static final void method967(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class63.aClass226_717.method3220((byte) 91).size();
	}

	static final void method968(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	public static Class401[] method969(int i) {
		return (new Class401[] { Class401.aClass401_4166, Class401.aClass401_4172, Class401.aClass401_4156, Class401.aClass401_4174, Class401.aClass401_4187, Class401.aClass401_4181, Class401.aClass401_4184, Class401.aClass401_4165, Class401.aClass401_4170, Class401.aClass401_4159, Class401.aClass401_4146, Class401.aClass401_4154, Class401.aClass401_4177, Class401.aClass401_4183, Class401.aClass401_4148, Class401.aClass401_4151, Class401.aClass401_4161, Class401.aClass401_4153,
				Class401.aClass401_4147, Class401.aClass401_4155, Class401.aClass401_4160, Class401.aClass401_4158, Class401.aClass401_4189, Class401.aClass401_4180, Class401.aClass401_4173, Class401.aClass401_4176, Class401.aClass401_4188, Class401.aClass401_4152, Class401.aClass401_4149, Class401.aClass401_4169, Class401.aClass401_4157, Class401.aClass401_4175, Class401.aClass401_4162, Class401.aClass401_4179, Class401.aClass401_4144, Class401.aClass401_4142, Class401.aClass401_4186,
				Class401.aClass401_4167, Class401.aClass401_4178, Class401.aClass401_4143, Class401.aClass401_4150, Class401.aClass401_4185, Class401.aClass401_4141, Class401.aClass401_4168, Class401.aClass401_4140, Class401.aClass401_4182, Class401.aClass401_4139, Class401.aClass401_4164, Class401.aClass401_4163, Class401.aClass401_4145, Class401.aClass401_4138, Class401.aClass401_4171 });
	}

	static void method970(Class570 class570, int i, int i_1_, Class668 class668, int i_2_) {
		Class536_Sub18_Sub16 class536_sub18_sub16 = Class221.method3108(class570, i, i_1_, (byte) -96);
		if (null == class536_sub18_sub16)
			Class573.method6939((short) -2330);
		else {
			class668.anIntArray8550 = new int[class536_sub18_sub16.anInt11795 * 520600665];
			class668.anObjectArray8561 = new Object[1265663029 * class536_sub18_sub16.anInt11799];
			if (Class570.aClass570_7607 == class536_sub18_sub16.aClass570_11800 || (Class570.aClass570_7625 == class536_sub18_sub16.aClass570_11800) || (class536_sub18_sub16.aClass570_11800 == Class570.aClass570_7613)) {
				class668.anIntArray8550[0] = i;
				class668.anIntArray8550[1] = Class329.aClass550_3601.method6656(-2092928830);
				class668.anIntArray8550[2] = Class329.aClass550_3601.method6657(-2114485255);
			} else if ((class536_sub18_sub16.aClass570_11800 == Class570.aClass570_7611) || (class536_sub18_sub16.aClass570_11800 == Class570.aClass570_7608) || (class536_sub18_sub16.aClass570_11800 == Class570.aClass570_7609) || (Class570.aClass570_7621 == class536_sub18_sub16.aClass570_11800) || (Class570.aClass570_7612 == class536_sub18_sub16.aClass570_11800))
				class668.anIntArray8550[0] = i;
			else if (class536_sub18_sub16.aClass570_11800 == Class570.aClass570_7620)
				class668.anIntArray8550[0] = -1580497937 * class668.anInt8560;
			Class198.method2876(class536_sub18_sub16, 500000, class668, 1244548583);
		}
	}

	public static GraphicalRenderer method971(Canvas canvas, Class174 class174, Interface24 interface24, Interface47 interface47, Interface48 interface48, Interface46 interface46, int i, int i_3_, int i_4_) {
		return new Class167_Sub1(canvas, class174, interface24, interface47, interface48, interface46, i, i_3_);
	}

	static final void method972(RSBitBuffer class536_sub33_sub2, byte i) {
		class536_sub33_sub2.initBitAccess();
		int i_5_ = client.anInt11156 * -1791435655;
		Player class649_sub1_sub5_sub1_sub2 = (Class565.MY_PLAYER = client.PLAYER_LIST[i_5_] = new Player(client.aClass515_11066.method6249(512040507)));
		class649_sub1_sub5_sub1_sub2.anInt11889 = 675537735 * i_5_;
		int i_6_ = class536_sub33_sub2.readBits(30);
		byte i_7_ = (byte) (i_6_ >> 28);
		int i_8_ = i_6_ >> 14 & 0x3fff;
		int i_9_ = i_6_ & 0x3fff;
		Class598 class598 = client.aClass515_11066.method6255(-1473271711);
		class649_sub1_sub5_sub1_sub2.screenX[0] = i_8_ - class598.anInt7839 * 1858049507;
		class649_sub1_sub5_sub1_sub2.screenY[0] = i_9_ - class598.anInt7840 * 1479112045;
		class649_sub1_sub5_sub1_sub2.method7842((float) ((class649_sub1_sub5_sub1_sub2.screenX[0] << 9) + (class649_sub1_sub5_sub1_sub2.method10874() << 8)), (class649_sub1_sub5_sub1_sub2.method7838().aClass436_4823.aFloat4852), (float) ((class649_sub1_sub5_sub1_sub2.screenY[0] << 9) + (class649_sub1_sub5_sub1_sub2.method10874() << 8)));
		Class320.anInt3539 = (class649_sub1_sub5_sub1_sub2.aByte10839 = class649_sub1_sub5_sub1_sub2.aByte10840 = i_7_) * 1995486621;
		if (client.aClass515_11066.method6251(24421713).method5466(class649_sub1_sub5_sub1_sub2.screenX[0], class649_sub1_sub5_sub1_sub2.screenY[0], (byte) -113))
			class649_sub1_sub5_sub1_sub2.aByte10840++;
		if (null != Class95.playerRenderData[i_5_])
			class649_sub1_sub5_sub1_sub2.decodePlayerAppearance((Class95.playerRenderData[i_5_]));
		if (Class95.iconData[i_5_] != null)
			class649_sub1_sub5_sub1_sub2.decodeIcons((Class95.iconData[i_5_]));
		Class95.PLAYERLIST_SIZE = 0;
		Class95.PLAYERLIST_INDICES[((Class95.PLAYERLIST_SIZE += 1948535215) * -1482773169 - 1)] = i_5_;
		Class95.aByteArray1152[i_5_] = (byte) 0;
		Class95.anInt1158 = 0;
		for (int i_10_ = 1; i_10_ < 2048; i_10_++) {
			if (i_5_ != i_10_) {
				int i_11_ = class536_sub33_sub2.readBits(18);
				int i_12_ = i_11_ >> 16 & 0x3;
				int i_13_ = i_11_ >> 8 & 0xff;
				int i_14_ = i_11_ & 0xff;
				Class43 class43 = Class95.aClass43Array1162[i_10_] = new Class43();
				class43.anInt514 = ((i_13_ << 14) + (i_12_ << 28) + i_14_) * 246702179;
				class43.anInt511 = 0;
				class43.anInt512 = 661209069;
				class43.aClass210_513 = Class210.aClass210_2258;
				class43.aBool510 = false;
				Class95.anIntArray1159[(Class95.anInt1158 += 190489201) * -745742703 - 1] = i_10_;
				Class95.aByteArray1152[i_10_] = (byte) 0;
			}
		}
		class536_sub33_sub2.finishBitAccess(-1711507975);
		Class290 class290 = Class683.aClass301_Sub1_8651.method4054(799891420);
		if (Class290.aClass290_3220 == class290) {
			Class333_Sub2 class333_sub2 = ((Class333_Sub2) Class683.aClass301_Sub1_8651.method4051(826143221));
			class333_sub2.method9168((byte) -100);
		}
		Class300 class300 = Class683.aClass301_Sub1_8651.method4062(774160713);
		if (class300 == Class300.aClass300_3360) {
			Class706_Sub2 class706_sub2 = ((Class706_Sub2) Class683.aClass301_Sub1_8651.method4052(-810172525));
			class706_sub2.method10258(1933099762);
		}
	}
}
