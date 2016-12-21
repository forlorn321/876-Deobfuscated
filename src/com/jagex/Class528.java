/* Class528 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class528 {
	Class538 this$0;

	Class528(Class538 class538) {
		this$0 = class538;
	}

	public static int method6434(int i, int i_0_) {
		i = --i | i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return i + 1;
	}

	static final void method6435(Class668 class668, int i) {
		class668.anInt8542 -= -1349181388;
		int i_1_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_2_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		int i_3_ = class668.anIntArray8541[2 + class668.anInt8542 * 1867269829];
		int i_4_ = class668.anIntArray8541[3 + class668.anInt8542 * 1867269829];
		Class598 class598 = client.aClass515_11066.method6255(-1517903172);
		Class195.method2864(((i_1_ >> 14 & 0x3fff) - class598.anInt7839 * 1858049507), (i_1_ & 0x3fff) - 1479112045 * class598.anInt7840, i_2_ << 2, i_3_, i_4_, -830720796);
		client.aBool11242 = true;
	}

	static final void method6436(int i) {
		Class654.aClass34_Sub4_8494.method810(-1873780911);
		Class279.aClass34_Sub3_3163.method810(-2112271545);
		Class205_Sub7.aClass34_Sub2_9878.method810(-1534896246);
		client.aClass515_11066.method6280(-1073841494).method810(-1487880437);
		Class172.aClass34_Sub7_1922.method810(-1249017603);
		Class111.aClass34_Sub13_1391.method810(-835666711);
		Class45.aClass34_Sub11_529.method810(-1126008798);
		Class633.aClass34_Sub15_8260.method810(-1980746363);
		Class56.aClass34_Sub14_608.method810(-1267922104);
		Class532.aClass98_Sub1_Sub1_7122.method10465(1058315784);
		Class678.aClass98_Sub1_Sub2_8625.method10495((byte) 14);
		Class536_Sub19.aClass98_Sub1_Sub2_10519.method10495((byte) 106);
		Class446.aClass98_Sub1_Sub2_4902.method10495((byte) 26);
		Class333.aClass98_Sub1_Sub2_3622.method10495((byte) 80);
		Class458_Sub2.aClass98_Sub1_Sub2_10306.method10495((byte) 113);
		Class497.aClass34_Sub16_5554.method810(-1913414733);
		Class602.aClass34_Sub1_7856.method810(-1861702371);
		Class398_Sub1.aClass34_Sub8_10110.method810(-1791171100);
		Class207.aClass34_Sub22_2244.method810(-925518635);
		Class459.aClass34_Sub9_5179.method810(-2135958968);
		Class144.aClass34_Sub12_1680.method810(-1642659639);
		Class642.aClass34_Sub20_8334.method810(-1738350633);
		Class580.aClass34_Sub19_7695.method810(-2142042903);
		Class524.aClass34_Sub10_7097.method810(-2096891201);
		Class257.aClass34_Sub5_2765.method810(-1714962146);
		Class227.method3285((byte) -100);
		Class478.method5755((byte) -12);
		Class196.aClass410_2202.method4984(911018304);
		Class173_Sub1.method8637(-790996825);
		Class237.method3353(1187983601);
		client.aClass199_11320.method2892(1214292939);
		client.aClass199_11045.method2892(267213275);
		Class685.aClass199_8658.method2892(-364350481);
		client.aClass199_11300.method2892(4925520);
		Class228.aClass34_2360.method810(-1857752706);
		Class205_Sub17.aClass34_9949.method810(-1659651788);
		client.aClass199_11048.method2892(365718642);
	}
}
