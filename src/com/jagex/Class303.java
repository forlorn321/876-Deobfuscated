/* Class303 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class303 {
	boolean aBool3422;
	static Class303 aClass303_3423;
	static Class303 aClass303_3424;
	int anInt3425;
	static Class303 aClass303_3426 = new Class303(0, true);
	static int anInt3427;

	public static Class303 method5579(int i) {
		if (-660298349 * aClass303_3426.anInt3425 == i)
			return aClass303_3426;
		if (i == -660298349 * aClass303_3423.anInt3425)
			return aClass303_3423;
		if (aClass303_3424.anInt3425 * -660298349 == i)
			return aClass303_3424;
		return null;
	}

	static {
		aClass303_3423 = new Class303(1, true);
		aClass303_3424 = new Class303(2, false);
	}

	public static Class303 method5580(int i) {
		if (-660298349 * aClass303_3426.anInt3425 == i)
			return aClass303_3426;
		if (i == -660298349 * aClass303_3423.anInt3425)
			return aClass303_3423;
		if (aClass303_3424.anInt3425 * -660298349 == i)
			return aClass303_3424;
		return null;
	}

	Class303(int i, boolean bool) {
		anInt3425 = 1011433627 * i;
		aBool3422 = bool;
	}

	public static Class303 method5581(int i) {
		if (-660298349 * aClass303_3426.anInt3425 == i)
			return aClass303_3426;
		if (i == -660298349 * aClass303_3423.anInt3425)
			return aClass303_3423;
		if (aClass303_3424.anInt3425 * -660298349 == i)
			return aClass303_3424;
		return null;
	}

	static final void method5582(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	static final void method5583(Class665 class665, int i) {
		if (Class208_Sub10.aClass296_Sub1_9923.method5376((byte) -89) != Class301.aClass301_3418)
			throw new RuntimeException();
		Class327_Sub2 class327_sub2 = ((Class327_Sub2) Class208_Sub10.aClass296_Sub1_9923.method5372((byte) 0));
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (int) ((double) class327_sub2.method15734((byte) -23) * 2607.5945876176133) & 0x3fff;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (int) ((double) class327_sub2.method15747(-522129280) * 2607.5945876176133) & 0x3fff;
	}

	static final void method5584(Class665 class665, byte i) {
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub24_10634, (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]), -209168263);
		Class631.method10465(897326178);
		client.aBool11020 = false;
	}

	static final void method5585(Class665 class665, byte i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, 1431312733);
		Class240 class240 = Class183.aClass240Array2100[i_0_ >> 16];
		Class383.method6410(class243, class240, class665, -405443684);
	}
}
