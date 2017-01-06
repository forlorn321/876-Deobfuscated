/* Class41_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Font;

public class Class41_Sub1 extends Class41 implements Interface68 {
	static Font aFont10561;

	public void method131() {
		OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4403, client.aClass106_11322.aClass15_1258, 753522960);
		class536_sub23.stream.writeIntV1(-778209537 * anInt499, -2084087695);
		class536_sub23.stream.method9753(anInt498 * 1099957461, 863964582);
		class536_sub23.stream.writeByte(anInt502 * -1291747847);
		class536_sub23.stream.writeIntLE(1124031699 * anInt506, 1941898572);
		class536_sub23.stream.writeShort128(-1213016365 * anInt500, (byte) 0);
		class536_sub23.stream.method9753(1438833961 * anInt501, 1821906987);
		int i = (aBool505 ? 2 : 0) | (aBool504 ? 1 : 0);
		class536_sub23.stream.writeByte128(i);
		class536_sub23.stream.method9729(anInt503 * -295180599, -1027873020);
		client.aClass106_11322.writePacket(class536_sub23, 652397578);
	}

	public void method206(int i) {
		OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4403, client.aClass106_11322.aClass15_1258, 847665742);
		class536_sub23.stream.writeIntV1(-778209537 * anInt499, -2057862953);
		class536_sub23.stream.method9753(anInt498 * 1099957461, -262650363);
		class536_sub23.stream.writeByte(anInt502 * -1291747847);
		class536_sub23.stream.writeIntLE(1124031699 * anInt506, 1769437720);
		class536_sub23.stream.writeShort128(-1213016365 * anInt500, (byte) 0);
		class536_sub23.stream.method9753(1438833961 * anInt501, -1059406607);
		int i_0_ = (aBool505 ? 2 : 0) | (aBool504 ? 1 : 0);
		class536_sub23.stream.writeByte128(i_0_);
		class536_sub23.stream.method9729(anInt503 * -295180599, -956649220);
		client.aClass106_11322.writePacket(class536_sub23, 665704356);
	}

	Class41_Sub1(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, boolean bool, boolean bool_6_, int i_7_) {
		super(i, i_1_, i_2_ > 65535 ? 65535 : i_2_, i_3_, i_4_ > 255 ? 255 : i_4_, i_5_, bool, bool_6_, i_7_ > 255 ? 255 : i_7_);
	}

	public void method296() {
		OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4403, client.aClass106_11322.aClass15_1258, 1653291138);
		class536_sub23.stream.writeIntV1(-778209537 * anInt499, -2025929460);
		class536_sub23.stream.method9753(anInt498 * 1099957461, 737771266);
		class536_sub23.stream.writeByte(anInt502 * -1291747847);
		class536_sub23.stream.writeIntLE(1124031699 * anInt506, 1872144563);
		class536_sub23.stream.writeShort128(-1213016365 * anInt500, (byte) 0);
		class536_sub23.stream.method9753(1438833961 * anInt501, -1540788084);
		int i = (aBool505 ? 2 : 0) | (aBool504 ? 1 : 0);
		class536_sub23.stream.writeByte128(i);
		class536_sub23.stream.method9729(anInt503 * -295180599, -1373329012);
		client.aClass106_11322.writePacket(class536_sub23, -413314193);
	}

	static final void method9624(Class668 class668, int i) {
		String string = null;
		if (Class374.aClass33_3907 != null)
			string = Class374.aClass33_3907.method793(2034544187);
		if (null == string)
			string = "";
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = string;
	}

	public static final void method9625(String string, int i, int i_8_) {
		Class106 class106 = Class536_Sub41.method9871(2077853800);
		OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4505, class106.aClass15_1258, 1423197358);
		class536_sub23.stream.writeByte(1 + Class555.method6802(string, 234499511));
		class536_sub23.stream.writeString(string);
		class536_sub23.stream.writeByte(i);
		class106.writePacket(class536_sub23, 1156195131);
	}

	static void method9626(int[] is, double d) {
		if (Class173.aDouble1925 != d) {
			for (int i = 0; i < 256; i++) {
				int i_9_ = (int) (Math.pow((double) i / 255.0, d) * 255.0);
				Class173.anIntArray1924[i] = i_9_ > 255 ? 255 : i_9_;
			}
			Class173.aDouble1925 = d;
		}
		for (int i = 0; i < is.length; i++) {
			int i_10_ = Class173.anIntArray1924[is[i] >> 16 & 0xff];
			int i_11_ = Class173.anIntArray1924[is[i] >> 8 & 0xff];
			int i_12_ = Class173.anIntArray1924[is[i] >> 0 & 0xff];
			is[i] = is[i] & ~0xffffff | i_10_ << 16 | i_11_ << 8 | i_12_;
		}
	}
}
