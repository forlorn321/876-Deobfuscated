/* Class517 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class517 {
	abstract long method8612();

	abstract long method8613();

	abstract long method8614(byte i);

	abstract long method8615(byte i);

	abstract int method8616(long l);

	public static Class517 method8617() {
		Class517_Sub1 class517_sub1;
		try {
			class517_sub1 = new Class517_Sub1();
		} catch (Throwable throwable) {
			return new Class517_Sub2();
		}
		return class517_sub1;
	}

	abstract void method8618();

	abstract long method8619();

	Class517() {
		/* empty */
	}

	abstract int method8620(long l);

	abstract int method8621(long l);

	abstract int method8622(long l);

	public static Class517 method8623() {
		Class517_Sub1 class517_sub1;
		try {
			class517_sub1 = new Class517_Sub1();
		} catch (Throwable throwable) {
			return new Class517_Sub2();
		}
		return class517_sub1;
	}

	final int method8624(long l) {
		long l_0_ = method8615((byte) 104);
		if (l_0_ > 0L)
			Class518.method8635(l_0_);
		return method8616(l);
	}

	abstract void method8625(byte i);

	final int method8626(long l) {
		long l_1_ = method8615((byte) 109);
		if (l_1_ > 0L)
			Class518.method8635(l_1_);
		return method8616(l);
	}

	final int method8627(long l) {
		long l_2_ = method8615((byte) 56);
		if (l_2_ > 0L)
			Class518.method8635(l_2_);
		return method8616(l);
	}

	final int method8628(long l) {
		long l_3_ = method8615((byte) 24);
		if (l_3_ > 0L)
			Class518.method8635(l_3_);
		return method8616(l);
	}

	static final void method8629(Class665 class665, int i) {
		int i_4_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class703.aClass219_8825.method3992(i_4_, 1843973001).method3915((byte) 8);
	}

	static final void method8630(Class665 class665, int i) {
		if (Class681.aClass554_8644.method9199(81, -273702964))
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}

	static final void method8631(Class665 class665, int i) {
		int i_5_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class9 class9 = ((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_5_, 780571728));
		int i_6_;
		if (class9.aBool148)
			i_6_ = -1658832325 * class9.anInt149;
		else if (class9.aBool122)
			i_6_ = Class271.aClass624_3128.anInt8157 * 24784665;
		else
			i_6_ = -894656341 * Class271.aClass624_3128.anInt8158;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_6_;
	}
}
