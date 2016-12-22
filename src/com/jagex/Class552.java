/* Class552 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class552 {
	static int anInt7413 = 0;
	public Class552 aClass552_7414;
	public Class649_Sub1_Sub5 aClass649_Sub1_Sub5_7415;
	public static int anInt7416;

	void method6687(int i) {
		if (-221177953 * anInt7413 < 500) {
			aClass649_Sub1_Sub5_7415 = null;
			aClass552_7414 = Class80.aClass552_857;
			Class80.aClass552_857 = this;
			anInt7413 += 2057192543;
		}
	}

	Class552() {
		/* empty */
	}

	void method6688() {
		if (-221177953 * anInt7413 < 500) {
			aClass649_Sub1_Sub5_7415 = null;
			aClass552_7414 = Class80.aClass552_857;
			Class80.aClass552_857 = this;
			anInt7413 += 2057192543;
		}
	}

	static final void method6689(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Exception_Sub3.method10516(class251, class234, class668, (byte) -18);
	}

	static final void method6690(Class668 class668, int i) {
		Class603_Sub1 class603_sub1 = Class68.method1088((byte) 4);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (class603_sub1 == null ? 0 : -1176655995 * class603_sub1.worldFlags);
	}

	static final void method6691(Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		int i_0_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_1_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		if (i_1_ == -1)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class39.aClass450_490.method5424(i_0_, 1513059586).method10753((char) i_1_, -1243085437);
	}

	static void method6692(int i) {
		for (int i_2_ = 0; i_2_ < 106; i_2_++)
			client.aBoolArray11240[i_2_] = true;
	}

	static boolean method6693(int i, int i_3_, int i_4_, int i_5_) {
		Class553 class553 = client.aClass515_11066.method6249(687206617);
		boolean bool = true;
		Interface59 interface59 = (Interface59) class553.method6716(i, i_3_, i_4_, -342954341);
		if (null != interface59)
			bool &= Class64.method1057(interface59, (byte) -5);
		interface59 = (Interface59) class553.method6736(i, i_3_, i_4_, client.anInterface64_11113, (byte) -119);
		if (interface59 != null)
			bool &= Class64.method1057(interface59, (byte) -9);
		interface59 = (Interface59) class553.method6726(i, i_3_, i_4_, 1672121015);
		if (interface59 != null)
			bool &= Class64.method1057(interface59, (byte) -109);
		return bool;
	}
}
