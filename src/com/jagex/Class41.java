/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class41 implements Interface76 {
	public static Class41 aClass41_440;
	int anInt441;
	static Class41 aClass41_442;
	public static Class41 aClass41_443;
	public static Class41 aClass41_444;
	static Class41 aClass41_445;
	static Class41 aClass41_446;
	static Class41 aClass41_447;
	static Class41 aClass41_448;
	static Class41 aClass41_449;
	public static Class41 aClass41_450;
	public static Class41 aClass41_451;
	public static Class41 aClass41_452;
	public static Class41 aClass41_453;
	static Class41 aClass41_454 = new Class41(0);

	Class41(int i) {
		anInt441 = 1832563723 * i;
	}

	public int method87() {
		return anInt441 * -1569507421;
	}

	static {
		aClass41_449 = new Class41(1);
		aClass41_442 = new Class41(2);
		aClass41_443 = new Class41(3);
		aClass41_444 = new Class41(4);
		aClass41_445 = new Class41(5);
		aClass41_446 = new Class41(6);
		aClass41_447 = new Class41(7);
		aClass41_451 = new Class41(8);
		aClass41_440 = new Class41(9);
		aClass41_450 = new Class41(10);
		aClass41_448 = new Class41(11);
		aClass41_452 = new Class41(12);
		aClass41_453 = new Class41(13);
	}

	public int method42() {
		return anInt441 * -1569507421;
	}

	public int method91() {
		return anInt441 * -1569507421;
	}

	static final void method1170(Class243 class243, Class240 class240, Class665 class665, int i) {
		class243.anInt2662 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) * 624628889;
		Class430.method6876(class243, (byte) 104);
	}

	static void method1171(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_0_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_1_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		Class80 class80 = ((Class80) Class679.aClass24_Sub21_8628.method81(i_1_, -1557566061));
		if (class80.method1566(1312800765)) {
			String string = class80.aString806;
			if (-1 == i_0_)
				class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = string;
			else
				class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = ((Class259) Class590.aClass62_Sub1_7793.method81(i_0_, -990471935)).method4756(i_1_, string, (byte) -29);
		} else {
			int i_2_ = class80.anInt804 * 780718929;
			if (-1 == i_0_)
				class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = i_2_;
			else
				class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = ((Class259) Class590.aClass62_Sub1_7793.method81(i_0_, 894856730)).method4761(i_1_, i_2_, -1507358568);
		}
	}
}
