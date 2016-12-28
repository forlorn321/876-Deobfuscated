/* Class560 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Iterator;

class Class560 implements Runnable {
	Class360_Sub1 this$0;

	public void run() {
		try {
			while (!this$0.aBool10163) {
				Iterator iterator = this$0.aList10165.iterator();
				while (iterator.hasNext()) {
					Class555 class555 = (Class555) iterator.next();
					class555.method6788((byte) 2);
				}
				HashMap hashmap = this$0.method9265(-343423583);
				Iterator iterator_0_ = hashmap.keySet().iterator();
				while (iterator_0_.hasNext()) {
					Class489 class489 = (Class489) iterator_0_.next();
					if (!class489.aBool5464) {
						Class492[] class492s = (Class492[]) hashmap.get(class489);
						for (int i = 0; i < class492s.length; i++)
							class492s[i].method5912(128000);
					}
				}
				iterator_0_ = this$0.aList10165.iterator();
				while (iterator_0_.hasNext()) {
					Class555 class555 = (Class555) iterator_0_.next();
					class555.method6789(-1951871655);
				}
				Class212.method3067(6L);
			}
		} catch (Exception exception) {
			Class81.method1165(null, exception, (byte) -33);
			exception.printStackTrace();
		}
	}

	Class560(Class360_Sub1 class360_sub1) {
		this$0 = class360_sub1;
	}

	public void method6822() {
		try {
			while (!this$0.aBool10163) {
				Iterator iterator = this$0.aList10165.iterator();
				while (iterator.hasNext()) {
					Class555 class555 = (Class555) iterator.next();
					class555.method6788((byte) -85);
				}
				HashMap hashmap = this$0.method9265(-343423583);
				Iterator iterator_1_ = hashmap.keySet().iterator();
				while (iterator_1_.hasNext()) {
					Class489 class489 = (Class489) iterator_1_.next();
					if (!class489.aBool5464) {
						Class492[] class492s = (Class492[]) hashmap.get(class489);
						for (int i = 0; i < class492s.length; i++)
							class492s[i].method5912(128000);
					}
				}
				iterator_1_ = this$0.aList10165.iterator();
				while (iterator_1_.hasNext()) {
					Class555 class555 = (Class555) iterator_1_.next();
					class555.method6789(-2117140666);
				}
				Class212.method3067(6L);
			}
		} catch (Exception exception) {
			Class81.method1165(null, exception, (byte) 28);
			exception.printStackTrace();
		}
	}

	public static void method6823(byte i) {
		if (102 == Class61.loginStage * -129171495)
			Class61.loginStage = -329511650;
	}

	static final void method6824(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		class251.anInt2580 = class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)] * -979286481;
		class251.anInt2626 = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) * 323164283;
	}

	static final void method6825(Class668 class668, byte i) {
		class668.anInt8542 -= 61855783;
		int i_2_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_3_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		int i_4_ = class668.anIntArray8541[2 + 1867269829 * class668.anInt8542];
		if (i_3_ == -1)
			throw new RuntimeException();
		Class39 class39 = (Class39) Class676.aClass34_Sub6_8589.method70(i_3_, (byte) 12);
		if (class39.aClass453_483.method78() != i_2_)
			throw new RuntimeException();
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class39.method853(Integer.valueOf(i_4_), 1528532746) ? 1 : 0;
	}

	static final void method6826(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.shadowSetting.method10002((short) -3781) ? 1 : 0;
	}

	public static void method6827(int i, byte i_5_) {
		Class467.method5689(new Class585(i), -1392723968);
	}

	public static void method6828(boolean bool, byte i) {
		if (null == Class192.aClass292_2177)
			Class6.method593(560532053);
		if (bool)
			Class192.aClass292_2177.method3942(-28660163);
	}

	static final void method6829(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.idleAnimationSetting.method10109((byte) 1);
	}
}
