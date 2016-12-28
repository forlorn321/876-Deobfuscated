/* Class521_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class521_Sub4 extends Class521 {
	int anInt10323;
	int anInt10324;
	int anInt10325;
	int anInt10326;
	String aString10327;
	int anInt10328;
	int anInt10329;

	Class521_Sub4() {
		/* empty */
	}

	public static Class536_Sub41 method9365(int i) {
		if (Class542_Sub1.aClass708_7218 == null || null == Class542_Sub1.aClass693_10725)
			return null;
		for (Class536_Sub41 class536_sub41 = (Class536_Sub41) Class542_Sub1.aClass693_10725.next(); null != class536_sub41; class536_sub41 = (Class536_Sub41) Class542_Sub1.aClass693_10725.next()) {
			Class248 class248 = ((Class248) Class542_Sub1.aClass34_Sub8_7212.method70(((class536_sub41.anInt10793) * 2000440429), (byte) 46));
			if (class248 != null && class248.aBool2522 && class248.method3429(Class542_Sub1.anInterface20_7169, Class542_Sub1.anInterface18_7163, 1774297000))
				return class536_sub41;
		}
		return null;
	}

	static final void method9366(int i, int i_0_, int i_1_, int i_2_) {
		String string = new StringBuilder().append("tele ").append(i).append(Class40.aString491).append(i_0_ >> 6).append(Class40.aString491).append(i_1_ >> 6).append(Class40.aString491).append(i_0_ & 0x3f).append(Class40.aString491).append(i_1_ & 0x3f).toString();
		System.out.println(string);
		Class512.method6211(string, true, false, (byte) 66);
	}

	static final void method9367(Class668 class668, int i) {
		int i_3_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (!Class677.aClass167_8609.method2013())
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 3;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.bloomSetting.method8348(i_3_, -1102005131);
	}

	public static void method9368(int i) {
		Class193.aClass4_2187.method561(-2117553523);
		Class193.aClass708_2181.method8304(454036827);
		Class193.aClass202Array2190 = null;
		Class193.aClass189Array2180 = null;
		Class193.aClass190Array2179 = null;
		Class193.aClass204Array2182 = null;
		Class193.aClass205Array2183 = null;
		Class193.anInt2185 = 1391756075;
		Class193.anInt2186 = 0;
		Class193.anInt2178 = 0;
		Class707.aClass194_8823 = null;
		Class193.anInt2184 = -1606204967;
		Class193.anInt2189 = 359085763;
		if (Class193.aBool2188) {
			client.aShort11255 = Class103.aShort1232;
			client.aShort11282 = Class98.aShort1181;
			client.aShort11279 = Class199.aShort2222;
			client.aShort11280 = Class466.aShort5324;
			Class193.aBool2188 = false;
		}
	}

	public static Class699 method9369(byte i) {
		if (null == Class45.aClass699_522)
			return Class699.aClass699_8787;
		return Class45.aClass699_522;
	}
}
