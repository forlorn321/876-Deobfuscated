/* Class707 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class707 {
	public static boolean aBool8822 = true;
	static Class194 aClass194_8823;

	Class707() throws Throwable {
		throw new Error();
	}

	public static String method8298(int i, boolean bool, byte i_0_) {
		if (!bool || i < 0)
			return Integer.toString(i);
		return Class503.method6055(i, 10, bool, -1856271570);
	}

	static final void method8299(Class668 class668, int i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.method3678(i_1_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_1_ >> 16];
		Class442.method5333(class251, class234, class668, 1530564980);
	}

	static final void method8300(Class668 class668, int i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class465_Sub1.aClass96_10352.method1298(i_2_, -1745330162);
	}

	static int method8301(int i, int i_3_, int i_4_) {
		if (Class606.aClass606_7874.anInt7878 * -723459231 == i || Class606.aClass606_7876.anInt7878 * -723459231 == i)
			return Class649_Sub1_Sub3_Sub1.anIntArray11990[i_3_ & 0x3];
		return Class649_Sub1_Sub3_Sub1.anIntArray11995[i_3_ & 0x3];
	}

	static final void method8302(Class668 class668, short i) {
		long l = Class249.method3450(1328587145);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (int) (l / 60000L);
	}
}
