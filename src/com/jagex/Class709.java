/* Class709 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class709 implements Interface75 {
	public static Class709 aClass709_8827;
	public static Class709 aClass709_8828;
	static Class709 aClass709_8829 = new Class709(-1);
	static Class709 aClass709_8830;
	public static Class709 aClass709_8831;
	public static Class709 aClass709_8832;
	static Class709 aClass709_8833;
	static Class709 aClass709_8834;
	static Class709 aClass709_8835;
	static Class709 aClass709_8836;
	int anInt8837;

	public int method73() {
		return anInt8837 * -20409015;
	}

	Class709(int i) {
		anInt8837 = i * -1936954119;
	}

	static {
		aClass709_8828 = new Class709(-2);
		aClass709_8827 = new Class709(-3);
		aClass709_8830 = new Class709(-4);
		aClass709_8831 = new Class709(-5);
		aClass709_8832 = new Class709(2);
		aClass709_8833 = new Class709(3);
		aClass709_8834 = new Class709(7);
		aClass709_8836 = new Class709(9);
		aClass709_8835 = new Class709(37);
	}

	public int method12() {
		return anInt8837 * -20409015;
	}

	public int method78() {
		return anInt8837 * -20409015;
	}

	static final void method8342(Class668 class668, short i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (-1484801557 * client.anInt11289 == 2 && i_0_ < 142551095 * client.anInt11288)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.aClass31Array11291[i_0_].aBool275 ? 1 : 0;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	public static boolean method8343(int i, int i_1_) {
		for (Class536_Sub18_Sub9 class536_sub18_sub9 = ((Class536_Sub18_Sub9) Class70.aClass708_755.method8308(1867269829)); null != class536_sub18_sub9; class536_sub18_sub9 = ((Class536_Sub18_Sub9) Class70.aClass708_755.method8311(2107188540))) {
			if (Class465.method5668((-517484763 * class536_sub18_sub9.anInt11718), (byte) -86) && (class536_sub18_sub9.aLong11711 * 9092992429781309163L == (long) i))
				return true;
		}
		return false;
	}

	public static void method8344(int i, String string, boolean bool, byte i_2_) {
		if (Class224.method3210(-865506670)) {
			if (1234839363 * Class61.anInt648 != i)
				Class61.aLong649 = 4822916419102841261L;
			Class61.anInt648 = i * 1375018347;
			Class61.aString681 = string;
			Class61.aBool682 = bool;
			Class673.method8026(3, -1798113843);
		}
	}

	static void method8345(InterfaceDefinitions class251, int i) {
		if (client.aBool11188) {
			if (null != class251.onOptHook) {
				InterfaceDefinitions class251_3_ = Class527.method6429(1625551467 * Class663.anInt8515, -1059472497 * client.anInt11183, (byte) -93);
				if (null != class251_3_) {
					Class536_Sub42 class536_sub42 = new Class536_Sub42();
					class536_sub42.aClass251_10804 = class251;
					class536_sub42.aClass251_10806 = class251_3_;
					class536_sub42.anObjectArray10802 = class251.onOptHook;
					Class618.method7388(class536_sub42, -1540734620);
				}
			}
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4501, client.aClass106_11322.aClass15_1258, 2126697068);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(class251.anInt2546 * -809980533, -1778059594);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeShort128(-1484799213 * class251.anInt2711, (byte) 0);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeIntLE(Class663.anInt8515 * 1625551467, 2135103946);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeLEShort(-1059472497 * client.anInt11183, -1411037171);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeIntV1(class251.anInt2559 * -1591767037, -2042237362);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeLEShort(client.anInt11184 * -678599443, -1411037171);
			client.aClass106_11322.method1409(class536_sub23, 727408397);
		}
	}
}
