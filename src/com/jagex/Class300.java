/* Class300 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Container;

public class Class300 {
	public int anInt3354;
	public static Class300 aClass300_3355 = new Class300(0, false);
	static Class300 aClass300_3356;
	public static Class300 aClass300_3357;
	static Class300 aClass300_3358;
	static Class300 aClass300_3359;
	public static Class300 aClass300_3360 = new Class300(1, false);
	static Class300 aClass300_3361;
	boolean aBool3362;

	Class300(int i, boolean bool) {
		anInt3354 = -1849740847 * i;
		aBool3362 = bool;
	}

	static {
		aClass300_3356 = new Class300(2, true);
		aClass300_3357 = new Class300(3, false);
		aClass300_3358 = new Class300(4, true);
		aClass300_3359 = new Class300(5, true);
		aClass300_3361 = new Class300(6, true);
	}

	public boolean method4020(int i) {
		return aBool3362;
	}

	public boolean method4021() {
		return aBool3362;
	}

	public static Container method4022(byte i) {
		if (Class223.aFrame2336 != null)
			return Class223.aFrame2336;
		if (null != Class145.aFrame1692)
			return Class145.aFrame1692;
		return Class622.anApplet8126;
	}

	public static int method4023(int i) {
		return 179908453 * Class575.anInt7658;
	}

	static void method4024(Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.method8361(string, 1878410046);
	}

	static final void method4025(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_0_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_1_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.aClass231_11088.method3301(i_0_, (byte) 121).method3161(i_1_, 1470631321) ? 1 : 0;
	}

	static int method4026(RSBitBuffer class536_sub33_sub2, int i) {
		int i_2_ = class536_sub33_sub2.readBits(2);
		int i_3_;
		if (i_2_ == 0)
			i_3_ = 0;
		else if (i_2_ == 1)
			i_3_ = class536_sub33_sub2.readBits(5);
		else if (i_2_ == 2)
			i_3_ = class536_sub33_sub2.readBits(8);
		else
			i_3_ = class536_sub33_sub2.readBits(11);
		return i_3_;
	}

	static final void method4027(Class251 class251, Class234 class234, Class668 class668, byte i) {
		class251.anInt2600 = class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)] * -881661827;
	}
}
