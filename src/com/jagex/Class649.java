/* Class649 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class649 {
	static Class358 aClass358_8371 = null;

	public static void method10840(Class653 class653) {
		if (Class378.aClass378_3927 == class653.aClass378_8385)
			aClass358_8371 = new Class358_Sub1(class653);
		else if (class653.aClass378_8385 == Class378.aClass378_3926)
			aClass358_8371 = new Class358_Sub2(class653);
		else
			throw new RuntimeException();
	}

	Class649() throws Throwable {
		throw new Error();
	}

	public static void method10841(Class653 class653) {
		if (Class378.aClass378_3927 == class653.aClass378_8385)
			aClass358_8371 = new Class358_Sub1(class653);
		else if (class653.aClass378_8385 == Class378.aClass378_3926)
			aClass358_8371 = new Class358_Sub2(class653);
		else
			throw new RuntimeException();
	}

	public static void method10842() {
		if (null != aClass358_8371) {
			aClass358_8371.method6280(2092813916);
			aClass358_8371 = null;
		}
	}

	public static void method10843(int i, int i_0_, float f, Interface42 interface42) {
		if (aClass358_8371 != null)
			aClass358_8371.method6287(-1191315232).method6381(i, i_0_, f, interface42, (byte) -46);
	}

	public static void method10844() {
		if (null != aClass358_8371) {
			aClass358_8371.method6280(-2093588612);
			aClass358_8371 = null;
		}
	}

	public static void method10845() {
		if (null != aClass358_8371)
			aClass358_8371.method6272((byte) 99);
	}

	public static boolean method10846(int i, int i_1_) {
		if (aClass358_8371 == null || aClass358_8371.method6287(606669841) == null)
			return false;
		if (i_1_ == i)
			return true;
		Class360 class360 = aClass358_8371.method6287(-1909649948).method6379(i, -2121635425);
		Class360 class360_2_ = aClass358_8371.method6287(-1876390948).method6379(i_1_, 361233289);
		Class360 class360_3_ = class360;
		while_107_: do {
			do {
				if (null == class360_3_)
					break while_107_;
				class360_3_ = class360_3_.method6306((short) -26781);
				if (class360_2_ == class360_3_)
					return true;
			} while (class360_3_ != class360);
			return false;
		} while (false);
		class360_3_ = class360_2_;
		while_108_: do {
			do {
				if (null == class360_3_)
					break while_108_;
				class360_3_ = class360_3_.method6306((short) -15737);
				if (class360_3_ == class360)
					return true;
			} while (class360_2_ != class360_3_);
			return false;
		} while (false);
		return false;
	}

	public static void method10847(int i, int i_4_, float f, Interface42 interface42) {
		if (aClass358_8371 != null)
			aClass358_8371.method6287(887592047).method6381(i, i_4_, f, interface42, (byte) -88);
	}

	public static Class360 method10848(int i) {
		if (null != aClass358_8371)
			return aClass358_8371.method6287(-1702714029).method6379(i, -2104143542);
		return null;
	}

	public static Class360 method10849(int i) {
		if (null != aClass358_8371)
			return aClass358_8371.method6287(624294314).method6379(i, -616271267);
		return null;
	}

	public static void method10850() {
		if (null != aClass358_8371) {
			aClass358_8371.method6280(587758357);
			aClass358_8371 = null;
		}
	}

	static final void method10851(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		int i_5_ = -1;
		int i_6_ = -1;
		Class248 class248 = class243.method4524(Class402.aClass180_4150, 708326095);
		if (null != class248) {
			i_5_ = 2146202801 * class248.anInt2726;
			i_6_ = class248.anInt2729 * 718383107;
		}
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_5_;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_6_;
	}

	static final void method10852(Class665 class665, byte i) {
		int i_7_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class9 class9 = ((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_7_, 2025817682));
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 1388854815 * class9.anInt134;
	}

	static final void method10853(Class665 class665, short i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		Class631.method10469(string, 870227483);
	}
}
