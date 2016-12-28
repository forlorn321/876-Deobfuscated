/* Class249 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.applet.Applet;

public final class Class249 {
	static long aLong2527;
	static long aLong2528;
	public static Applet anApplet2529;

	Class249() throws Throwable {
		throw new Error();
	}

	public static final synchronized long method3450(int i) {
		long l = System.currentTimeMillis();
		if (l < aLong2527 * 2424846269048858517L)
			aLong2528 += ((2424846269048858517L * aLong2527 - l) * 7877177840033131055L);
		aLong2527 = -6175731472690877507L * l;
		return l + -2822675307988607793L * aLong2528;
	}

	public static final synchronized long method3451() {
		long l = System.currentTimeMillis();
		if (l < aLong2527 * 2424846269048858517L)
			aLong2528 += ((2424846269048858517L * aLong2527 - l) * 7877177840033131055L);
		aLong2527 = -6175731472690877507L * l;
		return l + -2822675307988607793L * aLong2528;
	}

	public static final synchronized long method3452() {
		long l = System.currentTimeMillis();
		if (l < aLong2527 * 2424846269048858517L)
			aLong2528 += ((2424846269048858517L * aLong2527 - l) * 7877177840033131055L);
		aLong2527 = -6175731472690877507L * l;
		return l + -2822675307988607793L * aLong2528;
	}

	public static final synchronized long method3453() {
		long l = System.currentTimeMillis();
		if (l < aLong2527 * 2424846269048858517L)
			aLong2528 += ((2424846269048858517L * aLong2527 - l) * 7877177840033131055L);
		aLong2527 = -6175731472690877507L * l;
		return l + -2822675307988607793L * aLong2528;
	}

	public static final int method3454(int i, int i_0_, int i_1_) {
		if (i == -2)
			return 12345678;
		if (i == -1) {
			if (i_0_ < 2)
				i_0_ = 2;
			else if (i_0_ > 126)
				i_0_ = 126;
			return i_0_;
		}
		i_0_ = i_0_ * (i & 0x7f) >> 7;
		if (i_0_ < 2)
			i_0_ = 2;
		else if (i_0_ > 126)
			i_0_ = 126;
		return (i & 0xff80) + i_0_;
	}

	static final void method3455(Class668 class668, byte i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_2_);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.getIComponentSettings(class251).method9474();
	}

	static final void method3456(Class668 class668, int i) throws Exception_Sub3 {
		class668.anInt8542 -= -1349181388;
		int i_3_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_4_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		int i_5_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 2];
		int i_6_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 3];
		Class436 class436 = Class436.method5257((float) i_3_, (float) i_4_, (float) i_5_);
		if (-1.0F == class436.aFloat4850)
			class436.aFloat4850 = Float.POSITIVE_INFINITY;
		if (-1.0F == class436.aFloat4852)
			class436.aFloat4852 = Float.POSITIVE_INFINITY;
		if (-1.0F == class436.aFloat4853)
			class436.aFloat4853 = Float.POSITIVE_INFINITY;
		Class683.aClass301_Sub1_8651.method4036(class436, 263350573);
		Class683.aClass301_Sub1_8651.method4056((float) i_6_ / 1000.0F, -1310101071);
		class436.method5239();
	}

	public static int method3457(Class678 class678, Class665 class665, int i, int i_7_) {
		if (Class678.aClass678_8619 == class678)
			return 43594;
		return 40000 + i;
	}

	static void method3458(int i) {
		Class45.aClass42_525 = Class42.aClass42_508;
		Class45.aClass709_521 = Class709.aClass709_8827;
		Exception_Sub3.aClass692_11348 = Class692.aClass692_8710;
		Class391.aClass686_4060 = Class686.aClass686_8666;
		Class4.aClass690_102 = Class690.aClass690_8693;
		Class45.aClass699_522 = Class699.aClass699_8787;
		Class45.aString528 = null;
	}
}
