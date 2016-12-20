/* Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class37 implements Interface30 {
	public Interface32 method170(Class289 class289, int i) {
		if (Class289.aClass289_3221 == class289)
			return client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i];
		if (class289 == Class289.aClass289_3220) {
			Class527_Sub26 class527_sub26 = (Class527_Sub26) client.aClass14_10989.method709((long) i);
			if (null != class527_sub26)
				return (Interface32) class527_sub26.anObject10522;
		}
		return null;
	}

	public Interface32 method173(Class289 class289, int i, int i_0_) {
		if (Class289.aClass289_3221 == class289)
			return client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i];
		if (class289 == Class289.aClass289_3220) {
			Class527_Sub26 class527_sub26 = (Class527_Sub26) client.aClass14_10989.method709((long) i);
			if (null != class527_sub26)
				return (Interface32) class527_sub26.anObject10522;
		}
		return null;
	}

	public Interface32 method172(Class289 class289, int i) {
		if (Class289.aClass289_3221 == class289)
			return client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i];
		if (class289 == Class289.aClass289_3220) {
			Class527_Sub26 class527_sub26 = (Class527_Sub26) client.aClass14_10989.method709((long) i);
			if (null != class527_sub26)
				return (Interface32) class527_sub26.anObject10522;
		}
		return null;
	}

	Class37() {
		/* empty */
	}

	public Interface32 method171(Class289 class289, int i) {
		if (Class289.aClass289_3221 == class289)
			return client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i];
		if (class289 == Class289.aClass289_3220) {
			Class527_Sub26 class527_sub26 = (Class527_Sub26) client.aClass14_10989.method709((long) i);
			if (null != class527_sub26)
				return (Interface32) class527_sub26.anObject10522;
		}
		return null;
	}

	public static Class289 method1143(int i, int i_1_) {
		if (i == Class289.aClass289_3221.anInt3222 * -1696939565)
			return Class289.aClass289_3221;
		if (i == -1696939565 * Class289.aClass289_3220.anInt3222)
			return Class289.aClass289_3220;
		return null;
	}

	public static void method1144(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		Class585.aLinkedList7706.addLast(new Class568(i, i_2_, i_3_ - i, i_4_ - i_2_));
	}

	static final void method1145(Class665 class665, short i) {
		boolean bool = false;
		if (client.aBool11271) {
			try {
				Object object = (Class411.aClass411_4361.method6578((new Object[] { Integer.valueOf(1220660925 * Class335.anInt3642), Boolean.valueOf((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte12190) == 1), Integer.valueOf(class665.anIntArray8525[((class665.anInt8526 -= 102380841) * 1769813785)]) }), 1013594190));
				if (null != object)
					bool = ((Boolean) object).booleanValue();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = bool ? 1 : 0;
	}

	static final void method1146(Class665 class665, int i) {
		int i_6_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub20_10606.method14289(i_6_, 1751532746);
	}

	static final void method1147(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub11_10585.method16948(2121115959);
	}

	static final void method1148(Class665 class665, int i) {
		if (-1786224855 * client.anInt11118 >= 5 && -1786224855 * client.anInt11118 <= 9)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1786224855 * client.anInt11118;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}
}
