/* Class97 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class97 {
	float aFloat1168;
	int anInt1169;
	float aFloat1170;
	int anInt1171;
	int anInt1172;
	int anInt1173;
	int anInt1174;
	int anInt1175;
	int anInt1176;
	float aFloat1177 = 1.0F;
	int anInt1178;
	static boolean aBool1179;

	Class97 method1314(byte i) {
		return new Class97(270850877 * anInt1169, aFloat1177, aFloat1170, -1899202937 * anInt1171, -2046871431 * anInt1172, 887041115 * anInt1173);
	}

	Class97(int i) {
		aFloat1170 = 1.0F;
		anInt1169 = i * -2116922347;
	}

	void method1315(Class97 class97_0_, int i) {
		aFloat1177 = class97_0_.aFloat1177;
		aFloat1170 = class97_0_.aFloat1170;
		anInt1171 = class97_0_.anInt1171 * 1;
		anInt1172 = class97_0_.anInt1172 * 1;
		anInt1169 = class97_0_.anInt1169 * 1;
		anInt1173 = 1 * class97_0_.anInt1173;
	}

	Class97(int i, float f, float f_1_, int i_2_, int i_3_, int i_4_) {
		aFloat1170 = 1.0F;
		anInt1169 = i * -2116922347;
		aFloat1177 = f;
		aFloat1170 = f_1_;
		anInt1171 = 492990263 * i_2_;
		anInt1172 = -1495682615 * i_3_;
		anInt1173 = i_4_ * -1017502765;
	}

	static void method1316(Class563 class563, int i) {
		class563.aClass649_Sub1_7582 = null;
		synchronized (Class563.aStack7580) {
			if (Class563.aStack7580.size() < 200)
				Class563.aStack7580.push(class563);
		}
	}

	static final void method1317(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1;
	}

	public static boolean method1318(char c, int i) {
		return c >= '0' && c <= '9';
	}

	public static int method1319(int i, int i_5_, byte i_6_) {
		int i_7_ = i_5_ >>> 24;
		int i_8_ = 255 - i_7_;
		i_5_ = ((i_5_ & 0xff00ff) * i_7_ & ~0xff00ff | i_7_ * (i_5_ & 0xff00) & 0xff0000) >>> 8;
		return i_5_ + ((i_8_ * (i & 0xff00ff) & ~0xff00ff | i_8_ * (i & 0xff00) & 0xff0000) >>> 8);
	}

	public static final void method1320(boolean bool, int i, int i_9_) {
		Clan class536_sub15 = (bool ? Class646.aClass536_Sub15_8361 : Class66.aClass536_Sub15_724);
		if (null != class536_sub15 && i >= 0 && i < class536_sub15.anInt10482 * 1494047173) {
			ClanMember class349 = class536_sub15.members[i];
			if (class349.rank == -1) {
				String string = class349.username;
				Class106 class106 = Class536_Sub41.method9871(2077853800);
				OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4468, class106.aClass15_1258, 1687531729);
				class536_sub23.stream.writeByte(3 + Class555.method6802(string, -2044328457));
				class536_sub23.stream.writeByte(bool ? 1 : 0);
				class536_sub23.stream.writeShort(i, -1778059594);
				class536_sub23.stream.writeString(string);
				class106.writePacket(class536_sub23, 333386895);
			}
		}
	}

	static int method1321(int i, int i_10_, int i_11_) {
		if (i == ObjShapes.aClass606_7874.anInt7878 * -723459231 || -723459231 * ObjShapes.aClass606_7876.anInt7878 == i)
			return Class649_Sub1_Sub3_Sub2.anIntArray12027[i_10_ & 0x3];
		return Class649_Sub1_Sub3_Sub2.anIntArray12031[i_10_ & 0x3];
	}
}
