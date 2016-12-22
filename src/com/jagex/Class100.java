/* Class100 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class100 {
	static int anInt1183;
	static Class399 aClass399_1184;
	static int anInt1185;
	static Class179 aClass179_1186;
	static int anInt1187;
	static int anInt1188;
	static int anInt1189;
	static int anInt1190;
	static Class395 aClass395_1191;
	static Class179 aClass179_1192;
	static Class179 aClass179_1193;

	Class100() throws Throwable {
		throw new Error();
	}

	static boolean method1333() {
		boolean bool = true;
		if (null == aClass179_1186) {
			if (Class398.aClass461_4122.method5580(2027086611 * anInt1189, -964514165))
				aClass179_1186 = Class181.method2717(Class398.aClass461_4122, anInt1189 * 2027086611);
			else
				bool = false;
		}
		if (aClass179_1192 == null) {
			if (Class398.aClass461_4122.method5580(Class577.anInt7689 * 2021035779, -964514165))
				aClass179_1192 = Class181.method2717(Class398.aClass461_4122, 2021035779 * Class577.anInt7689);
			else
				bool = false;
		}
		if (aClass179_1193 == null) {
			if (Class398.aClass461_4122.method5580(Class576.anInt7683 * -1782676425, -964514165))
				aClass179_1193 = Class181.method2717(Class398.aClass461_4122, Class576.anInt7683 * -1782676425);
			else
				bool = false;
		}
		if (null == Class70.aClass2_793) {
			if (Class710_Sub43.aClass461_10940.method5580(1930213931 * anInt1190, -964514165))
				Class70.aClass2_793 = (Class196.aClass410_2202.method4981(client.anInterface51_11196, 1930213931 * anInt1190, 519949046));
			else
				bool = false;
		}
		if (Class24.aClass179_Sub2Array233 == null) {
			if (Class398.aClass461_4122.method5580(1930213931 * anInt1190, -964514165))
				Class24.aClass179_Sub2Array233 = ((Class179_Sub2[]) Class181.method2719(Class398.aClass461_4122, anInt1190 * 1930213931));
			else
				bool = false;
		}
		return bool;
	}

	public static int method1334(RSByteBuffer class536_sub33, String string, int i) {
		int i_0_ = -810172525 * class536_sub33.off;
		byte[] is = Class364.method4765(string, -1874135843);
		class536_sub33.method9701(is.length, 2115389956);
		class536_sub33.off += Class266.aClass282_2866.method3768(is, 0, is.length, (class536_sub33.buffer), (class536_sub33.off * -810172525), 1019413944) * 516175515;
		return class536_sub33.off * -810172525 - i_0_;
	}

	static void decodeWorldDescriptors(RSByteBuffer stream, int i) {
		int worldSize = stream.readUnsignedSmart(-490410303);
		Class94.worlds = new Class592[worldSize];
		for (int i_2_ = 0; i_2_ < worldSize; i_2_++) {
			Class94.worlds[i_2_] = new Class592();
			Class94.worlds[i_2_].flagId = stream.readUnsignedSmart(-171383916) * -1820632555;
			Class94.worlds[i_2_].countryName = stream.readVersionedString((byte) 44);
		}
		Class220.lowestWorldId = stream.readUnsignedSmart(-1699057282) * 516757439;
		Class593.highestWorldId = stream.readUnsignedSmart(1734628560) * -1155278909;
		Class593.worldCount = stream.readUnsignedSmart(838984434) * -317832355;
		Class506.aClass603_Sub1Array6890 = new Class603_Sub1[1 + (Class593.highestWorldId * 870600939 - Class220.lowestWorldId * -805119937)];
		for (int i_3_ = 0; i_3_ < -537974539 * Class593.worldCount; i_3_++) {
			int worldId = stream.readUnsignedSmart(-1409328853);
			Class603_Sub1 class603_sub1 = Class506.aClass603_Sub1Array6890[worldId] = new Class603_Sub1();
			class603_sub1.worldIndex = stream.readUnsignedByte() * 809472901;
			class603_sub1.worldFlags = stream.readInt() * -261605043;
			class603_sub1.extraString = stream.readUnsignedSmart(2070051773) * 1502072849;
			if (class603_sub1.extraString * 1844650225 != 0)
				class603_sub1.theExtraString = stream.readVersionedString((byte) 98);
			class603_sub1.anInt10557 = (worldId + Class220.lowestWorldId * -805119937) * -130957999;
			class603_sub1.worldActivity = stream.readVersionedString((byte) 77);
			class603_sub1.worldIp = stream.readVersionedString((byte) 63);
		}
		Class593.worldListChecksum = stream.readInt() * 591411205;
		Class593.aBool7806 = true;
	}

	static final void method1336(Class668 class668, byte i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		Class173.method2445(string, 1682512314);
	}

	static final void method1337(Class668 class668, int i) {
		int i_5_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class668.aClass350_8563.aBoolArray3716[i_5_] ? 1 : 0;
	}

	static final void method1338(Class668 class668, short i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 155362615 * Class246.anInt2474 == 1 ? 1 : 0;
	}

	public static void method1339(boolean bool, short i) {
		for (Class536_Sub3 class536_sub3 = ((Class536_Sub3) Class536_Sub3.aClass708_10363.method8308(1867269829)); class536_sub3 != null; class536_sub3 = (Class536_Sub3) Class536_Sub3.aClass708_10363.method8311(1000864864)) {
			if (null != class536_sub3.aClass479_10389) {
				class536_sub3.aClass479_10389.method5774(150, (byte) 32);
				Class184_Sub2.aClass211_9442.method3002(class536_sub3.aClass479_10389, -1092963117);
				class536_sub3.aClass479_10389 = null;
			}
			if (class536_sub3.aClass479_10387 != null) {
				class536_sub3.aClass479_10387.method5774(150, (byte) 32);
				Class184_Sub2.aClass211_9442.method3002(class536_sub3.aClass479_10387, -1092963117);
				class536_sub3.aClass479_10387 = null;
			}
			class536_sub3.method6484(-227110523);
		}
		if (bool) {
			for (Class536_Sub3 class536_sub3 = ((Class536_Sub3) Class536_Sub3.aClass708_10386.method8308(1867269829)); class536_sub3 != null; class536_sub3 = (Class536_Sub3) Class536_Sub3.aClass708_10386.method8311(2124277521)) {
				if (null != class536_sub3.aClass479_10389) {
					class536_sub3.aClass479_10389.method5774(150, (byte) 32);
					Class184_Sub2.aClass211_9442.method3002((class536_sub3.aClass479_10389), -1092963117);
					class536_sub3.aClass479_10389 = null;
				}
				class536_sub3.method6484(454682663);
			}
			for (Class536_Sub3 class536_sub3 = ((Class536_Sub3) Class536_Sub3.aClass4_10366.method562(-2078540391)); class536_sub3 != null; class536_sub3 = (Class536_Sub3) Class536_Sub3.aClass4_10366.method567(2044605996)) {
				if (class536_sub3.aClass479_10389 != null) {
					class536_sub3.aClass479_10389.method5774(150, (byte) 32);
					Class184_Sub2.aClass211_9442.method3002((class536_sub3.aClass479_10389), -1092963117);
					class536_sub3.aClass479_10389 = null;
				}
				class536_sub3.method6484(1621319713);
			}
		}
	}
}
