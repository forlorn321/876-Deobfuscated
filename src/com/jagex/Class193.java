/* Class193 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class193 {
	static int anInt2178;
	static Class190[] aClass190Array2179;
	public static Class189[] aClass189Array2180;
	public static Class708 aClass708_2181 = new Class708();
	static Class204[] aClass204Array2182;
	public static Class205[] aClass205Array2183;
	static int anInt2184;
	static int anInt2185;
	static int anInt2186;
	public static Class4 aClass4_2187 = new Class4(32);
	static boolean aBool2188;
	static int anInt2189;
	static Class202[] aClass202Array2190;
	public static Interface18 anInterface18_2191;

	public static void method2844() {
		aClass4_2187.method561(-2117553523);
		aClass708_2181.method8304(454036827);
		aClass202Array2190 = null;
		aClass189Array2180 = null;
		aClass190Array2179 = null;
		aClass204Array2182 = null;
		aClass205Array2183 = null;
		anInt2185 = 1391756075;
		anInt2186 = 0;
		anInt2178 = 0;
		Class707.aClass194_8823 = null;
		anInt2184 = -1606204967;
		anInt2189 = 359085763;
		if (aBool2188) {
			client.aShort11255 = Class103.aShort1232;
			client.aShort11282 = Class98.aShort1181;
			client.aShort11279 = Class199.aShort2222;
			client.aShort11280 = Class466.aShort5324;
			aBool2188 = false;
		}
	}

	static {
		anInt2185 = 1391756075;
		anInt2186 = 0;
		anInt2178 = 0;
		aBool2188 = false;
		anInt2189 = 359085763;
		anInt2184 = -1606204967;
		anInterface18_2191 = new Class203();
	}

	public static boolean method2845(int i) {
		if (anInt2184 * 518181271 != i || Class707.aClass194_8823 == null) {
			Class521_Sub4.method9368(1651367805);
			Class707.aClass194_8823 = Class194.aClass194_2192;
			anInt2184 = i * 1606204967;
		}
		if (Class707.aClass194_8823 == Class194.aClass194_2192) {
			byte[] is = Class98_Sub1_Sub1.aClass461_11326.method5595(i, -1116291800);
			if (null == is)
				return false;
			RSByteBuffer class536_sub33 = new RSByteBuffer(is);
			Class273.method3725(class536_sub33, (byte) -19);
			int i_0_ = class536_sub33.readUnsignedByte(497238078);
			for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
				aClass708_2181.method8335(new Class536_Sub27(class536_sub33), 455245122);
			int i_2_ = class536_sub33.readUnsignedSmart(71942457);
			aClass202Array2190 = new Class202[i_2_];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
				aClass202Array2190[i_3_] = new Class202(class536_sub33);
			int i_4_ = class536_sub33.readUnsignedSmart(1455946584);
			aClass189Array2180 = new Class189[i_4_];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
				aClass189Array2180[i_5_] = new Class189(class536_sub33, i_5_);
			int i_6_ = class536_sub33.readUnsignedSmart(1659149457);
			aClass190Array2179 = new Class190[i_6_];
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
				aClass190Array2179[i_7_] = new Class190(class536_sub33);
			int i_8_ = class536_sub33.readUnsignedSmart(1747228922);
			aClass204Array2182 = new Class204[i_8_];
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
				aClass204Array2182[i_9_] = new Class204(class536_sub33);
			int i_10_ = class536_sub33.readUnsignedSmart(1201716453);
			aClass205Array2183 = new Class205[i_10_];
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
				aClass205Array2183[i_11_] = Class40.method872(class536_sub33, 709064757);
			Class707.aClass194_8823 = Class194.aClass194_2193;
		}
		if (Class194.aClass194_2193 == Class707.aClass194_8823) {
			boolean bool = true;
			Class189[] class189s = aClass189Array2180;
			for (int i_12_ = 0; i_12_ < class189s.length; i_12_++) {
				Class189 class189 = class189s[i_12_];
				if (!class189.method2806(-493072887))
					bool = false;
			}
			Class205[] class205s = aClass205Array2183;
			for (int i_13_ = 0; i_13_ < class205s.length; i_13_++) {
				Class205 class205 = class205s[i_13_];
				if (!class205.method2939(1108670337))
					bool = false;
			}
			Class190[] class190s = aClass190Array2179;
			for (int i_14_ = 0; i_14_ < class190s.length; i_14_++) {
				Class190 class190 = class190s[i_14_];
				if (!class190.method2819(123064854))
					bool = false;
			}
			if (!bool)
				return false;
			Class707.aClass194_8823 = Class194.aClass194_2194;
		}
		return true;
	}

	Class193() throws Throwable {
		throw new Error();
	}

	static void method2846(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte(-581362223);
			switch (i) {
			case 255:
				return;
			case 0:
				anInt2186 = class536_sub33.readUnsignedShort((short) -16894) * 1035695039;
				anInt2178 = class536_sub33.readUnsignedShort((short) 11869) * -727646765;
			}
		}
	}

	static void method2847(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte(-9312273);
			switch (i) {
			case 255:
				return;
			case 0:
				anInt2186 = class536_sub33.readUnsignedShort((short) -10261) * 1035695039;
				anInt2178 = class536_sub33.readUnsignedShort((short) -13388) * -727646765;
			}
		}
	}

	public static void method2848(boolean bool) {
		if (client.anInt11074 * 1542697723 != 2 && 3 != 1542697723 * client.anInt11074) {
			if (!bool) {
				if (aClass205Array2183 != null) {
					Class205[] class205s = aClass205Array2183;
					for (int i = 0; i < class205s.length; i++) {
						Class205 class205 = class205s[i];
						class205.method2941((byte) -48);
					}
				}
				if (-1 != anInt2189 * 1092703765)
					Class184_Sub2.aClass211_9442.method3010(anInt2189 * 1092703765, 255, -1207635283);
			}
			client.anInt11074 = -277540762;
			Class392_Sub1.aClass536_Sub33_10107 = null;
			client.aBool11159 = false;
			if (anInt2184 * 518181271 > 0)
				Class170.method2421(Class570.aClass570_7626, anInt2184 * 518181271, -1, 1770222240);
			Class521_Sub4.method9368(845520479);
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4425, client.aClass106_11322.aClass15_1258, 1954661498);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(bool ? 1 : 0, 465637339);
			client.aClass106_11322.method1409(class536_sub23, 925036261);
		}
	}

	public static void method2849(boolean bool) {
		if (client.anInt11074 * 1542697723 != 2 && 3 != 1542697723 * client.anInt11074) {
			if (!bool) {
				if (aClass205Array2183 != null) {
					Class205[] class205s = aClass205Array2183;
					for (int i = 0; i < class205s.length; i++) {
						Class205 class205 = class205s[i];
						class205.method2941((byte) -104);
					}
				}
				if (-1 != anInt2189 * 1092703765)
					Class184_Sub2.aClass211_9442.method3010(anInt2189 * 1092703765, 255, 1781594000);
			}
			client.anInt11074 = -277540762;
			Class392_Sub1.aClass536_Sub33_10107 = null;
			client.aBool11159 = false;
			if (anInt2184 * 518181271 > 0)
				Class170.method2421(Class570.aClass570_7626, anInt2184 * 518181271, -1, -355945942);
			Class521_Sub4.method9368(721494766);
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4425, client.aClass106_11322.aClass15_1258, 1558865093);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(bool ? 1 : 0, 465637339);
			client.aClass106_11322.method1409(class536_sub23, 1209277432);
		}
	}

	static final void method2850(Class668 class668, short i) {
		int i_15_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_15_, -689214737);
		int i_16_ = -1;
		int i_17_ = -1;
		Class244 class244 = class251.method3478(Class677.aClass167_8609, 862187860);
		if (class244 != null) {
			i_16_ = class244.anInt2464 * -598030877;
			i_17_ = class244.anInt2460 * -313075149;
		}
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_16_;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_17_;
	}

	static final void method2851(Class668 class668, int i) {
		int i_18_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_18_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_18_ >> 16];
		Class648.method7829(class251, class234, class668, -1285360642);
	}

	static void method2852(int i, int i_19_, int i_20_, int i_21_, int i_22_) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(17, (long) i_19_ << 32 | (long) i);
		class536_sub18_sub5.method10659(1743986225);
		class536_sub18_sub5.anInt11675 = 1577826219 * i_20_;
		class536_sub18_sub5.anInt11659 = 824043525 * i_21_;
	}
}
