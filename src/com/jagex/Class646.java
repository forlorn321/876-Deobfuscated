/* Class646 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class646 {
	Class536_Sub18_Sub16 aClass536_Sub18_Sub16_8355;
	int anInt8356 = 367307443;
	int[] anIntArray8357;
	Object[] anObjectArray8358;
	long[] aLongArray8359;
	public static int anInt8360;
	public static Clan aClass536_Sub15_8361;

	Class646() {
		/* empty */
	}

	static final void method7807(Class668 class668, byte i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_0_);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.method10439(class251) ? 1 : 0;
	}

	static final void method7808(Class668 class668, int i) throws Exception_Sub3 {
		class668.anInt8542 -= -1349181388;
		float f = (float) class668.anIntArray8541[class668.anInt8542 * 1867269829];
		float f_1_ = (float) (class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1]);
		float f_2_ = (float) (class668.anIntArray8541[class668.anInt8542 * 1867269829 + 2]);
		float f_3_ = ((float) (class668.anIntArray8541[1867269829 * class668.anInt8542 + 3]) / 1000.0F);
		Class683.aClass301_Sub1_8651.method4042(Class436.method5257(f, f_1_, f_2_), f_3_, (byte) 15);
	}

	static Class293 method7809(int i, int i_4_) {
		if (851866579 * Class293.aClass293_3247.anInt3248 == i)
			return Class293.aClass293_3247;
		if (i == Class293.aClass293_3246.anInt3248 * 851866579)
			return Class293.aClass293_3246;
		return null;
	}

	public static RuntimeException_Sub1 method7810(Throwable throwable, String string) {
		RuntimeException_Sub1 runtimeexception_sub1;
		if (throwable instanceof RuntimeException_Sub1) {
			runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			StringBuilder stringbuilder = new StringBuilder();
			RuntimeException_Sub1 runtimeexception_sub1_5_ = runtimeexception_sub1;
			runtimeexception_sub1_5_.aString12037 = stringbuilder.append(runtimeexception_sub1_5_.aString12037).append(' ').append(string).toString();
		} else
			runtimeexception_sub1 = new RuntimeException_Sub1(throwable, string);
		return runtimeexception_sub1;
	}
}
