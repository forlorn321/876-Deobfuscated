/* Class643 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class643 {
	public static Class643 aClass643_8335;
	public static Class643 aClass643_8336;
	public static Class643 aClass643_8337;
	public static Class643 aClass643_8338;
	public static Class643 aClass643_8339;
	static Class643 aClass643_8340;
	public static Class643 aClass643_8341;
	static Class643 aClass643_8342;
	static Class643 aClass643_8343;
	static Class643 aClass643_8344;
	public int anInt8345;
	public static Class643 aClass643_8346 = new Class643(1);
	static Class643 aClass643_8347;
	static Class643 aClass643_8348;
	static Class643 aClass643_8349;
	public static Class643 aClass643_8350;

	Class643(int i) {
		anInt8345 = -97817323 * i;
	}

	static {
		aClass643_8335 = new Class643(2);
		aClass643_8337 = new Class643(4);
		aClass643_8338 = new Class643(8);
		aClass643_8339 = new Class643(16);
		aClass643_8336 = new Class643(32);
		aClass643_8341 = new Class643(64);
		aClass643_8350 = new Class643(128);
		aClass643_8343 = new Class643(256);
		aClass643_8344 = new Class643(512);
		aClass643_8340 = new Class643(1024);
		aClass643_8347 = new Class643(2048);
		aClass643_8342 = new Class643(4096);
		aClass643_8348 = new Class643(8192);
		aClass643_8349 = new Class643(16384);
	}

	static final void method7735(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		InterfaceDefinitions class251 = Class264.method3678(i_0_, -689214737);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1515601291 * class251.xan2d;
	}

	static void method7736(Class167 class167, Class612 class612, int i, int i_1_, int i_2_, int i_3_) {
		Class56 class56 = ((Class56) Class602.aClass34_Sub1_7856.method70(class612.anInt7941 * -1070948127, (byte) -99));
		if (class56.anInt604 * 1861642937 != -1) {
			if (class612.aBool7970) {
				i += -1037204843 * class612.anInt7971;
				i &= 0x3;
			} else
				i = 0;
			Class143 class143 = class56.method958(class167, i, class612.aBool7972, (short) -23240);
			if (class143 != null) {
				int i_4_ = -1981381335 * class612.anInt8002;
				int i_5_ = -90266503 * class612.anInt7980;
				if (1 == (i & 0x1)) {
					i_4_ = -90266503 * class612.anInt7980;
					i_5_ = -1981381335 * class612.anInt8002;
				}
				int i_6_ = class143.method12();
				int i_7_ = class143.method1785();
				if (class56.aBool607) {
					i_6_ = 4 * i_4_;
					i_7_ = 4 * i_5_;
				}
				if (class56.anInt605 * -2117412527 != 0)
					class143.method1731(i_1_, i_2_ - 4 * (i_5_ - 1), i_6_, i_7_, 0, (~0xffffff | class56.anInt605 * -2117412527), 1);
				else
					class143.method1724(i_1_, i_2_ - 4 * (i_5_ - 1), i_6_, i_7_);
			}
		}
	}

	static final void method7737(Class668 class668, int i) {
		int i_8_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		InterfaceDefinitions class251 = Class264.method3678(i_8_, -689214737);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 452091921 * class251.anInt2586;
	}
}
