/* Class247 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;

public abstract class Class247 implements Interface6 {
	Class461 aClass461_2476;
	Class199 aClass199_2477;

	Class247(Class461 class461, int i) {
		aClass461_2476 = class461;
		aClass199_2477 = new Class199(i);
	}

	public static Class143 method3419(Class461 class461, int i, int i_0_) {
		Class143 class143 = (Class143) Class291.aClass199_3230.method2886((long) i);
		if (null == class143) {
			if (Class310.aBool3466)
				class143 = Class677.aClass167_8609.method2082(Class181.method2717(class461, i), true);
			else
				class143 = Huffman.method3771(class461.method5595(i, -1242322216), (byte) 12);
			Class291.aClass199_3230.method2881(class143, (long) i);
		}
		return class143;
	}

	static final void method3420(Class668 class668, int i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_1_);
		Class234 class234 = Class463.aClass234Array5227[i_1_ >> 16];
		Class34_Sub20.method10364(class251, class234, class668, -199754697);
	}

	static final void method3421(Class668 class668, byte i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_2_);
		Class262.method3640(class251, class668, (byte) 9);
	}

	static final void method3422(Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		int i_3_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_4_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (i_3_ == 99)
			Class214.sendPanelBoxMessage(string);
		else if (98 == i_3_)
			Class298.method4013(string, -2086717899);
		else
			Class635.method7564(i_3_, i_4_, "", "", "", string, null, -1538266173);
	}

	static final void method3423(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		long l = (long) class668.anIntArray8541[1867269829 * class668.anInt8542];
		long l_5_ = (long) (class668.anIntArray8541[1 + 1867269829 * class668.anInt8542]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (int) (l + l_5_ * l / 100L);
	}

	public static Class536_Sub30 method3424(int i, int i_6_, int i_7_, int i_8_, int i_9_) {
		synchronized (Class536_Sub30.aClass536_Sub30Array10566) {
			if (Class497.anInt5553 * 1483220115 == 0) {
				Class536_Sub30 class536_sub30 = new Class536_Sub30(i, i_6_, i_7_, i_8_);
				return class536_sub30;
			}
			Class536_Sub30.aClass536_Sub30Array10566[(Class497.anInt5553 -= -330131045) * 1483220115].method9627(i, i_6_, i_7_, i_8_, 1472892954);
			Class536_Sub30 class536_sub30 = (Class536_Sub30.aClass536_Sub30Array10566[1483220115 * Class497.anInt5553]);
			return class536_sub30;
		}
	}

	static void method3425(File file, byte i) {
		Class502.aFile6850 = file;
		if (!Class502.aFile6850.exists())
			throw new RuntimeException("");
		Class502.aBool6851 = true;
	}

	static final void method3426(Class668 class668, int i) {
		int i_10_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_10_);
		Class234 class234 = Class463.aClass234Array5227[i_10_ >> 16];
		Class562.method6865(class251, class234, class668, -1273765071);
	}
}
