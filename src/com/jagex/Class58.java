/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.lang.management.GarbageCollectorMXBean;

final class Class58 implements Interface63 {
	public static Class459 aClass459_721;
	static GarbageCollectorMXBean aGarbageCollectorMXBean722;

	public boolean method410(Class640_Sub1_Sub2 class640_sub1_sub2, int i) {
		return (class640_sub1_sub2 instanceof Interface62 && ((Interface62) class640_sub1_sub2).method399(-698838929));
	}

	public boolean method411(Class640_Sub1_Sub2 class640_sub1_sub2) {
		return (class640_sub1_sub2 instanceof Interface62 && ((Interface62) class640_sub1_sub2).method399(216977924));
	}

	static final void method1366(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		Class527_Sub8_Sub1 class527_sub8_sub1 = ((Class527_Sub8_Sub1) (Class527_Sub26.aClass24_Sub20_10523.method81(class665.anIntArray8525[class665.anInt8526 * 1769813785], 1470746859)));
		int i_0_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		int i_1_ = -1;
		for (int i_2_ = 0; i_2_ < class527_sub8_sub1.anInt11333 * 631685883; i_2_++) {
			if (i_0_ == class527_sub8_sub1.anIntArray11332[i_2_]) {
				i_1_ = class527_sub8_sub1.anIntArray11334[i_2_];
				break;
			}
		}
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_1_;
	}

	static final void method1367(Class665 class665, byte i) {
		int i_3_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Exception_Sub3.aClass51_11362.method1277(i_3_, 567798632).method18406(1953969409);
	}
}
