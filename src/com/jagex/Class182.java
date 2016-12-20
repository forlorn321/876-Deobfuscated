/* Class182 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class182 {
	public Class710 aClass710_2094 = new Class710();
	public static final int anInt2095 = 8191;

	static final void method3553(Class665 class665, int i) {
		class665.anInt8526 -= 409523364;
		int i_0_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_1_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		int i_2_ = class665.anIntArray8525[2 + class665.anInt8526 * 1769813785];
		int i_3_ = class665.anIntArray8525[3 + 1769813785 * class665.anInt8526];
		Class57 class57 = ((Class57) Class664.aClass24_Sub15_8519.method81(i_2_, -1925432081));
		if (class57.aClass462_714.method87() != i_0_ || class57.aClass462_718.method87() != i_1_)
			throw new RuntimeException(new StringBuilder().append(i_2_).append(" ").append(i_3_).toString());
		if (i_1_ == Class462.aClass462_5131.method87())
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class57.method1336(i_3_, -1646959771);
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class57.method1335(i_3_, (byte) -6);
	}
}
