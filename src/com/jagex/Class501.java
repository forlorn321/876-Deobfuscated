/* Class501 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class501 {
	public int anInt6845;
	public int anInt6846;
	public int anInt6847;
	public int anInt6848;

	Class501() {
		anInt6846 = (32 + (int) (Math.random() * 4.0)) * -770327825;
		anInt6848 = (3 + (int) (Math.random() * 2.0)) * -948033059;
		anInt6847 = (16 + (int) (Math.random() * 3.0)) * 1758099647;
		if (Class710.aClass536_Sub40_8843.aClass710_Sub2_10765.method9885(-171348888) == 1)
			anInt6845 = (int) (Math.random() * 6.0) * 1580166355;
		else
			anInt6845 = (int) (Math.random() * 12.0) * 1580166355;
	}

	Class501(int i, int i_0_, int i_1_, int i_2_) {
		anInt6846 = i * -770327825;
		anInt6848 = -948033059 * i_0_;
		anInt6847 = 1758099647 * i_1_;
		anInt6845 = i_2_ * 1580166355;
	}

	static final void method6031(Class668 class668, int i) {
		int i_3_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		InterfaceDefinitions class251 = Class264.method3678(i_3_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_3_ >> 16];
		Class198.method2873(class251, class234, class668, ((class668.aClass536_Sub15_8553 == Class646.aClass536_Sub15_8361) ? Class233.aClass233_2372 : Class233.aClass233_2369), (byte) -88);
	}

	static void method6032(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class592.method7117(647364780);
	}

	public static void method6033(InterfaceDefinitions class251, int i, int i_4_, int i_5_) {
		if (class251 != null) {
			if (class251.onTargetEnterHook != null) {
				Class536_Sub42 class536_sub42 = new Class536_Sub42();
				class536_sub42.aClass251_10804 = class251;
				class536_sub42.anObjectArray10802 = class251.onTargetEnterHook;
				Class618.method7388(class536_sub42, -1184053981);
			}
			client.aBool11188 = true;
			Class663.anInt8515 = class251.anInt2559 * -1249562935;
			client.anInt11183 = class251.anInt2546 * -631971771;
			Class511.anInt6931 = -437296539 * i;
			Class173_Sub1.anInt9384 = i_4_ * 1467452587;
			client.anInt11184 = class251.anInt2711 * 914671615;
			Class13.anInt161 = 336919469 * class251.anInt2626;
			client.anInt11179 = class251.anInt2580 * 131063777;
			Class668.method8011(class251, 263642117);
		}
	}

	static final void method6034(Class668 class668, int i) {
		int i_6_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class668.aClass350_8563.aStringArray3722[i_6_];
	}

	public static int method6035(int i, byte i_7_) {
		return i >>> 8;
	}
}
