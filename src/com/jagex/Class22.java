/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class22 {
	Class22() throws Throwable {
		throw new Error();
	}

	static final void method713(Class668 class668, int i) {
		class668.anInt8542 -= 61855783;
		int i_0_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_1_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		int i_2_ = class668.anIntArray8541[2 + class668.anInt8542 * 1867269829];
		int i_3_ = Class501.method6035(i_1_, (byte) 43);
		int i_4_ = Class603_Sub1.method9622(i_1_, (byte) -81);
		Class14 class14 = (Class14) Class228.aClass34_2360.method70(i_0_, (byte) 23);
		Class92 class92 = (Class92) Class205_Sub17.aClass34_9949.method70(i_3_, (byte) 76);
		Class453[] class453s = class92.aClass453ArrayArray885[i_4_];
		Object[] objects = class14.method624(i_4_, -487790507);
		if (null == objects && class92.anObjectArrayArray886 != null)
			objects = class92.anObjectArrayArray886[i_4_];
		if (null == objects) {
			for (int i_5_ = 0; i_5_ < class453s.length; i_5_++) {
				Class453 class453 = class453s[i_5_];
				if (class453 == Class453.aClass453_5084)
					class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
				else if (Class453.aClass453_5008 == class453 || Class453.aClass453_4955 == class453)
					class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
				else
					class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
			}
		} else {
			int i_6_ = objects.length / class453s.length;
			if (i_2_ < 0 || i_2_ >= i_6_)
				throw new RuntimeException();
			for (int i_7_ = 0; i_7_ < class453s.length; i_7_++) {
				int i_8_ = class453s.length * i_2_ + i_7_;
				if (class453s[i_7_] == Class453.aClass453_5084)
					class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = objects[i_8_];
				else
					class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ((Integer) objects[i_8_]).intValue();
			}
		}
	}

	static final void method714(Class668 class668, byte i) {
		class668.anIntArray8541[1867269829 * class668.anInt8542 - 1] = (class668.aClass350_8563.method4602(1425280780)[class668.anIntArray8541[1867269829 * class668.anInt8542 - 1]]);
	}

	static final void method715(Class668 class668, int i) {
		int i_9_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_9_);
		Class234 class234 = Class463.aClass234Array5227[i_9_ >> 16];
		Class99.method1326(class251, class234, class668, -213856354);
	}

	static void method716(GraphicalRenderer class167, int i) {
		if (Class70.aClass443_777 != null) {
			class167.method2390(Class70.aClass443_777);
			class167.method2099(Class70.aClass433_779);
			class167.method2369(1116561127 * Class70.anInt791, Class70.anInt774 * 90202433, (Class70.anInt775 * 1506631003 + 1116561127 * Class70.anInt791), (90202433 * Class70.anInt774 + 325129509 * Class70.anInt772));
			class167.method2048(1116561127 * Class70.anInt791, 90202433 * Class70.anInt774, Class70.anInt775 * 1506631003, 325129509 * Class70.anInt772);
		}
	}
}
