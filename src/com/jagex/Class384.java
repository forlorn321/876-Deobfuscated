/* Class384 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class384 {
	static Class384 aClass384_3947 = new Class384();
	static Class384 aClass384_3948 = new Class384();
	static Class384 aClass384_3949 = new Class384();

	public int method6413(int i, int i_0_, int i_1_) {
		int i_2_ = (-471480167 * Class611.anInt8009 > i_0_ ? Class611.anInt8009 * -471480167 : i_0_);
		if (this == aClass384_3947)
			return 0;
		if (this == aClass384_3949)
			return i_2_ - i;
		if (aClass384_3948 == this)
			return (i_2_ - i) / 2;
		return 0;
	}

	public static Class384[] method6414() {
		return (new Class384[] { aClass384_3947, aClass384_3948, aClass384_3949 });
	}

	public static Class384[] method6415() {
		return (new Class384[] { aClass384_3947, aClass384_3948, aClass384_3949 });
	}

	public static Class384[] method6416() {
		return (new Class384[] { aClass384_3947, aClass384_3948, aClass384_3949 });
	}

	Class384() {
		/* empty */
	}

	public int method6417(int i, int i_3_) {
		int i_4_ = (-471480167 * Class611.anInt8009 > i_3_ ? Class611.anInt8009 * -471480167 : i_3_);
		if (this == aClass384_3947)
			return 0;
		if (this == aClass384_3949)
			return i_4_ - i;
		if (aClass384_3948 == this)
			return (i_4_ - i) / 2;
		return 0;
	}

	static final void method6418(Class665 class665, short i) {
		int i_5_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Exception_Sub3.aClass51_11362.method1277(i_5_, 1401753823).method18405((byte) -21);
	}

	static final void method6419(Class665 class665, short i) {
		Class509.method8420((byte) 13);
	}

	static final void method6420(Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		Class512.method8489(string, (byte) 83);
	}

	public static void method6421(Class243[] class243s, int i, int i_6_, int i_7_, boolean bool, short i_8_) {
		for (int i_9_ = 0; i_9_ < class243s.length; i_9_++) {
			Class243 class243 = class243s[i_9_];
			if (null != class243 && i == -1774688479 * class243.anInt2536) {
				Class68.method1476(class243, i_6_, i_7_, bool, 964737479);
				Class208_Sub12.method15621(class243, i_6_, i_7_, -824146293);
				if (class243.anInt2523 * 32398549 > (1620847621 * class243.anInt2525 - class243.anInt2511 * -1054537975))
					class243.anInt2523 = (class243.anInt2525 * -1432262031 - class243.anInt2511 * 1497910117);
				if (class243.anInt2523 * 32398549 < 0)
					class243.anInt2523 = 0;
				if (114452147 * class243.anInt2524 > (class243.anInt2526 * 1847049763 - -1386504031 * class243.anInt2514))
					class243.anInt2524 = (-391544111 * class243.anInt2526 - class243.anInt2514 * -872290981);
				if (class243.anInt2524 * 114452147 < 0)
					class243.anInt2524 = 0;
				if (0 == -270144907 * class243.anInt2501)
					Class296_Sub1.method15695(class243s, class243, bool, -1510279953);
			}
		}
	}

	static void method6422(Class180 class180, int i) {
		if (!Class35.aBool365)
			Class474.method7756(class180, -1772586820);
		else
			Class527_Sub28.method16285(class180, 1865744352);
	}

	static void method6423(int i) {
		if (Class39.aClass180_431 != null) {
			Class39.aClass180_431.method3081((byte) 7);
			Class39.aClass180_431 = null;
			Class488.aClass174_5472 = null;
		}
	}

	static final void method6424(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -2046174135 * client.anInt11035;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 1582447073 * client.anInt10995;
	}
}
