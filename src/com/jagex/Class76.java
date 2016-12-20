/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class76 {
	protected static int anInt796;

	Class76() throws Throwable {
		throw new Error();
	}

	public static int method1531(int i) {
		return i >>> 8;
	}

	public static Object[] method1532(RSByteBuffer class527_sub38, Class462[] class462s) {
		int i = class527_sub38.readUnsignedSmart((byte) -24);
		Object[] objects = new Object[i * class462s.length];
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			for (int i_1_ = 0; i_1_ < class462s.length; i_1_++) {
				int i_2_ = class462s.length * i_0_ + i_1_;
				objects[i_2_] = class462s[i_1_].aClass475_5283.method7759(class527_sub38, 2051678619);
			}
		}
		return objects;
	}

	public static int method1533(int i) {
		return i & 0xff;
	}

	public static int method1534(int i) {
		return i >>> 8;
	}

	public static Object[] method1535(RSByteBuffer class527_sub38, Class462[] class462s) {
		int i = class527_sub38.readUnsignedSmart((byte) -17);
		Object[] objects = new Object[i * class462s.length];
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			for (int i_4_ = 0; i_4_ < class462s.length; i_4_++) {
				int i_5_ = class462s.length * i_3_ + i_4_;
				objects[i_5_] = class462s[i_4_].aClass475_5283.method7759(class527_sub38, 2027749313);
			}
		}
		return objects;
	}

	public static Object[] method1536(RSByteBuffer class527_sub38, Class462[] class462s) {
		int i = class527_sub38.readUnsignedSmart((byte) -11);
		Object[] objects = new Object[i * class462s.length];
		for (int i_6_ = 0; i_6_ < i; i_6_++) {
			for (int i_7_ = 0; i_7_ < class462s.length; i_7_++) {
				int i_8_ = class462s.length * i_6_ + i_7_;
				objects[i_8_] = class462s[i_7_].aClass475_5283.method7759(class527_sub38, 2029817212);
			}
		}
		return objects;
	}

	static final void method1537(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class30.anInt265 * -349191067 == 2 ? 1 : 0;
	}

	static final void method1538(Class665 class665, int i) {
		if (Class618.aClass527_Sub21_8111 != null) {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1;
			class665.aClass527_Sub21_8537 = Class618.aClass527_Sub21_8111;
		} else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}
}
