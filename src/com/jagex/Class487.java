/* Class487 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class487 implements Interface11 {
	public static short[][][] aShortArrayArrayArray5470;

	public Object method75(RSByteBuffer class527_sub38, byte i) {
		return new Class527_Sub36(class527_sub38);
	}

	public Object method74(RSByteBuffer class527_sub38) {
		return new Class527_Sub36(class527_sub38);
	}

	static final void method7965(Class665 class665, byte i) throws Exception_Sub6 {
		class665.anInt8526 -= 409523364;
		int i_0_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_1_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		int i_2_ = class665.anIntArray8525[2 + 1769813785 * class665.anInt8526];
		int i_3_ = class665.anIntArray8525[3 + 1769813785 * class665.anInt8526];
		Class442 class442 = Class442.method7166((float) i_0_, (float) i_1_, (float) i_2_);
		if (-1.0F == class442.aFloat4918)
			class442.aFloat4918 = Float.POSITIVE_INFINITY;
		if (-1.0F == class442.aFloat4915)
			class442.aFloat4915 = Float.POSITIVE_INFINITY;
		if (-1.0F == class442.aFloat4919)
			class442.aFloat4919 = Float.POSITIVE_INFINITY;
		Class208_Sub10.aClass296_Sub1_9923.method5353(class442, (byte) 30);
		Class208_Sub10.aClass296_Sub1_9923.method5350((float) i_3_ / 1000.0F, 1473684115);
		class442.method7141();
	}

	static String method7966(int i, Class671 class671, Class615 class615, int i_4_) {
		if (i < 100000)
			return new StringBuilder().append(Class234.method4350(class615.anInt8061 * -1823030115, 1039582870)).append(i).append(Class9.aString151).toString();
		if (i < 10000000)
			return new StringBuilder().append(Class234.method4350(847490433 * class615.anInt8069, -343715896)).append(i / 1000).append(Class53.aClass53_560.method1290(class671, (byte) -128)).append(Class9.aString151).toString();
		return new StringBuilder().append(Class234.method4350(-2000793193 * class615.anInt8065, 255105196)).append(i / 1000000).append(Class53.aClass53_669.method1290(class671, (byte) -26)).append(Class9.aString151).toString();
	}
}
