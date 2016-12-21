/* Class690 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class690 implements Interface75 {
	public static Class690 aClass690_8693 = new Class690(-2);
	public static Class690 aClass690_8694 = new Class690(-3);
	static Class690 aClass690_8695;
	public static Class690 aClass690_8696;
	int anInt8697;
	public static Class690 aClass690_8698 = new Class690(2);
	public static int anInt8699;

	public int method78() {
		return anInt8697 * 1301211035;
	}

	static {
		aClass690_8696 = new Class690(3);
		aClass690_8695 = new Class690(4);
	}

	public int method73() {
		return anInt8697 * 1301211035;
	}

	public int method12() {
		return anInt8697 * 1301211035;
	}

	Class690(int i) {
		anInt8697 = 1924146835 * i;
	}

	static void method8184(Class167 class167, int i, int i_0_, Class251 class251, int i_1_, byte i_2_) {
		for (int i_3_ = 7; i_3_ >= 0; i_3_--) {
			for (int i_4_ = 127; i_4_ >= 0; i_4_--) {
				int i_5_ = (i_1_ & 0x3f) << 10 | (i_3_ & 0x7) << 7 | i_4_ & 0x7f;
				Class38.method845(false, true, 84200204);
				int i_6_ = Class639.anIntArray8308[i_5_];
				Class613.method7316(false, true, (short) 192);
				class167.method2063((i_4_ * (-1606950689 * class251.anInt2573) >> 7) + i, i_0_ + (class251.anInt2574 * 223822141 * (7 - i_3_) >> 3), 1 + (-1606950689 * class251.anInt2573 >> 7), (223822141 * class251.anInt2574 >> 3) + 1, ~0xffffff | i_6_, 0);
			}
		}
	}

	static final void method8185(int i, int i_7_, int i_8_, boolean bool, int i_9_) {
		if (Class644.method7794(i, null, 1236501925))
			Class564.method6874((Class463.aClass234Array5227[i].aClass251Array2378), -1, i_7_, i_8_, bool, -1094073228);
	}

	public static void method8186(short i) {
		if (IcmpService_Sub1.anIcmpService_Sub1_10855 != null) {
			try {
				IcmpService_Sub1.anIcmpService_Sub1_10855.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
			IcmpService_Sub1.anIcmpService_Sub1_10855 = null;
		}
	}

	static void method8187(int i, byte i_10_) {
		for (Class536_Sub18_Sub9 class536_sub18_sub9 = ((Class536_Sub18_Sub9) Class70.aClass708_755.method8308(1867269829)); null != class536_sub18_sub9; class536_sub18_sub9 = ((Class536_Sub18_Sub9) Class70.aClass708_755.method8311(2120984988))) {
			if (Class374.method4777((-517484763 * class536_sub18_sub9.anInt11718), (byte) -18) && i == -712698209 * class536_sub18_sub9.anInt11708 >> 16)
				Class520.method6347(class536_sub18_sub9, 1953311640);
		}
	}
}
