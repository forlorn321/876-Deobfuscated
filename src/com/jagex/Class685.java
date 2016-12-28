/* Class685 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;

public final class Class685 {
	static int anInt8654;
	static final int anInt8655 = 5000000;
	static int anInt8656 = 0;
	static int[] anIntArray8657 = new int[3];
	public static Class199 aClass199_8658 = new Class199(4);
	static Class436[] aClass436Array8659 = new Class436[2];
	static boolean aBool8660 = false;
	static String aString8661 = null;
	static ArrayList anArrayList8662 = new ArrayList();
	static int anInt8663 = 0;
	static final int anInt8664 = 500000;
	public static int anInt8665;

	static {
		anInt8654 = 0;
	}

	Class685() throws Throwable {
		throw new Error();
	}

	static final void method8110(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_0_);
		Class234 class234 = Class463.aClass234Array5227[i_0_ >> 16];
		Class657.method7947(class251, class234, class668, -733807551);
	}

	static final void method8111(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		class251.mouseOverCursor = class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)] * 1993579121;
	}

	static final void method8112(long l) {
		int i = 289882095 * client.anInt11082;
		int i_1_ = client.anInt11236 * 182288133;
		if (-787333673 * JS5ResourceProvider.anInt5216 != i) {
			int i_2_ = i - JS5ResourceProvider.anInt5216 * -787333673;
			int i_3_ = (int) ((long) i_2_ * l / 320L);
			if (i_2_ > 0) {
				if (0 == i_3_)
					i_3_ = 1;
				else if (i_3_ > i_2_)
					i_3_ = i_2_;
			} else if (i_3_ == 0)
				i_3_ = -1;
			else if (i_3_ < i_2_)
				i_3_ = i_2_;
			JS5ResourceProvider.anInt5216 += 1085474279 * i_3_;
		}
		if (i_1_ != Class222.anInt2326 * -1817694149) {
			int i_4_ = i_1_ - Class222.anInt2326 * -1817694149;
			int i_5_ = (int) (l * (long) i_4_ / 320L);
			if (i_4_ > 0) {
				if (i_5_ == 0)
					i_5_ = 1;
				else if (i_5_ > i_4_)
					i_5_ = i_4_;
			} else if (0 == i_5_)
				i_5_ = -1;
			else if (i_5_ < i_4_)
				i_5_ = i_4_;
			Class222.anInt2326 += i_5_ * 727918835;
		}
		client.aFloat11106 += (float) l * client.aFloat11107 / 40.0F * 8.0F;
		client.aFloat11271 += (float) l * client.aFloat11269 / 40.0F * 8.0F;
		Class18.method687((byte) 104);
	}

	static final void method8113(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.aClass710_Sub20_10779.method10103((byte) -14);
	}
}
