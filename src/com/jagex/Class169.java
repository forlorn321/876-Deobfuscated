/* Class169 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class169 {
	public static final int anInt1877 = 8191;
	public static int[] anIntArray1878 = { 3, 7, 15 };
	public static final int anInt1879 = 16;
	public static final int anInt1880 = 32;
	public static final int anInt1881 = 0;
	public static final int anInt1882 = 2;
	public static final int anInt1883 = 64;
	public static final int anInt1884 = 16;
	public static int[] anIntArray1885 = { 2047, 16383, 65535 };
	public static final int anInt1886 = 1;
	public static final int anInt1887 = 0;
	public static final int anInt1888 = 1023;
	public static final int anInt1889 = 8;
	public static final int anInt1890 = 2;

	Class169() throws Throwable {
		throw new Error();
	}

	public static final int method2417(int i, int i_0_, int i_1_, int i_2_) {
		if (i_1_ > 243)
			i_0_ >>= 4;
		else if (i_1_ > 217)
			i_0_ >>= 3;
		else if (i_1_ > 192)
			i_0_ >>= 2;
		else if (i_1_ > 179)
			i_0_ >>= 1;
		return ((i & 0xff) >> 2 << 10) + (i_0_ >> 5 << 7) + (i_1_ >> 1);
	}

	static final void method2418(Class668 class668, int i) {
		int i_3_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class536_Sub18_Sub14 class536_sub18_sub14 = Class542.method6563(i_3_);
		if (class536_sub18_sub14 == null) {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
		} else {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (class536_sub18_sub14.anInt11770 * 615226225 - class536_sub18_sub14.anInt11769 * 1539255617);
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (888731475 * class536_sub18_sub14.anInt11772 - class536_sub18_sub14.anInt11771 * -1266410161);
		}
	}

	public static void method2419(int i) {
		Class690.method8186((short) 5624);
	}
}
