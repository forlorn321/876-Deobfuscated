/* Class616 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class616 {
	int anInt8052;
	int anInt8053;
	int anInt8054;
	int anInt8055;
	int anInt8056;
	int anInt8057;
	int anInt8058;
	int anInt8059;
	int anInt8060;
	int anInt8061;
	int anInt8062;
	int anInt8063;

	Class616() {
		/* empty */
	}

	boolean method7334(Class616 class616_0_, int i) {
		if (-1837432399 * class616_0_.anInt8061 == anInt8061 * -1837432399 && -725078749 * class616_0_.anInt8062 == anInt8062 * -725078749 && -1458391911 * anInt8052 == class616_0_.anInt8052 * -1458391911)
			return true;
		return false;
	}

	static final void method7335(Class668 class668, short i) {
		class668.anInt8542 -= 1472892954;
		int i_1_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_2_ = class668.anIntArray8541[1 + class668.anInt8542 * 1867269829];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_2_ + i_1_;
	}

	public static int method7336(CharSequence charsequence, int i) {
		int i_3_ = charsequence.length();
		int i_4_ = 0;
		for (int i_5_ = 0; i_5_ < i_3_; i_5_++)
			i_4_ = ((i_4_ << 5) - i_4_ + Class543.method6581(charsequence.charAt(i_5_), -5823823));
		return i_4_;
	}

	static void method7337(GraphicalRenderer class167, int i, int i_6_, IComponentDefinitions class251, byte i_7_) {
		int i_8_ = 127;
		int i_9_ = 7;
		for (int i_10_ = 63; i_10_ >= 0; i_10_--) {
			int i_11_ = (i_10_ & 0x3f) << 10 | (i_9_ & 0x7) << 7 | i_8_ & 0x7f;
			Class38.method845(false, true, 84200204);
			int i_12_ = ColourUtils.anIntArray8308[i_11_];
			Class613.method7316(false, true, (short) 192);
			class167.method2063(i, (223822141 * class251.anInt2574 * (63 - i_10_) >> 6) + i_6_, class251.anInt2573 * -1606950689, (class251.anInt2574 * 223822141 >> 6) + 1, ~0xffffff | i_12_, 0);
		}
	}

	public static void method7338(int i, byte i_13_) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(10, (long) i);
		class536_sub18_sub5.method10669(4705472);
	}
}
