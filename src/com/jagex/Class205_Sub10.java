/* Class205_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class205_Sub10 extends Class205 {
	long aLong9888;
	int anInt9889;

	public void method2940(int i) {
		IntParam class536_sub26 = ((IntParam) Class193.aClass4_2187.method556(aLong9888 * 8989997160734938989L));
		if (null != class536_sub26)
			class536_sub26.value = -16159079 * anInt9889;
		else
			Class193.aClass4_2187.method560(new IntParam(anInt9889 * 1977459485), aLong9888 * 8989997160734938989L);
	}

	Class205_Sub10(RSByteBuffer class536_sub33, boolean bool) {
		super(class536_sub33);
		int i = class536_sub33.readUnsignedShort();
		if (bool)
			aLong9888 = -4144112053334291867L * (0x100000000L | (long) i);
		else
			aLong9888 = -4144112053334291867L * (long) i;
		anInt9889 = class536_sub33.readInt() * -658884811;
	}

	public void method2942() {
		IntParam class536_sub26 = ((IntParam) Class193.aClass4_2187.method556(aLong9888 * 8989997160734938989L));
		if (null != class536_sub26)
			class536_sub26.value = -16159079 * anInt9889;
		else
			Class193.aClass4_2187.method560(new IntParam(anInt9889 * 1977459485), aLong9888 * 8989997160734938989L);
	}

	public void method2943() {
		IntParam class536_sub26 = ((IntParam) Class193.aClass4_2187.method556(aLong9888 * 8989997160734938989L));
		if (null != class536_sub26)
			class536_sub26.value = -16159079 * anInt9889;
		else
			Class193.aClass4_2187.method560(new IntParam(anInt9889 * 1977459485), aLong9888 * 8989997160734938989L);
	}

	static final void method9065(Class668 class668, short i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class97.method1318((char) i_0_, 1146561310) ? 1 : 0;
	}

	public static float method9066(float f, float f_1_, int i) {
		double d = Math.atan2((double) f, (double) f_1_);
		if (d < 0.0)
			d = 3.141592653589793 + (3.141592653589793 + d);
		return (float) d;
	}

	static final void method9067(Class668 class668, int i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class63.aClass226_717.method3227(i_2_, -781094290).method3114(1797549252);
	}

	static final void method9068(int i) {
		for (Class536_Sub2 class536_sub2 = ((Class536_Sub2) Class536_Sub2.aClass708_10320.method8308(1867269829)); null != class536_sub2; class536_sub2 = (Class536_Sub2) Class536_Sub2.aClass708_10320.method8311(1160043249))
			Class323.method4259(class536_sub2, false, (byte) 0);
		for (Class536_Sub2 class536_sub2 = ((Class536_Sub2) Class536_Sub2.aClass708_10321.method8308(1867269829)); class536_sub2 != null; class536_sub2 = (Class536_Sub2) Class536_Sub2.aClass708_10321.method8311(1325519142))
			Class323.method4259(class536_sub2, true, (byte) 0);
	}
}
