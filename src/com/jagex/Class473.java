/* Class473 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class473 implements Comparable {
	long aLong5369;
	Object anObject5370;
	long aLong5371;
	Object anObject5372;

	public boolean method7740(Object object) {
		if (object instanceof Class473)
			return anObject5370.equals(((Class473) object).anObject5370);
		throw new IllegalArgumentException();
	}

	int method7741(Class473 class473_0_, int i) {
		if (2584112087553795213L * aLong5369 < 2584112087553795213L * class473_0_.aLong5369)
			return -1;
		if (2584112087553795213L * aLong5369 > class473_0_.aLong5369 * 2584112087553795213L)
			return 1;
		return 0;
	}

	public boolean equals(Object object) {
		if (object instanceof Class473)
			return anObject5370.equals(((Class473) object).anObject5370);
		throw new IllegalArgumentException();
	}

	public int hashCode() {
		return anObject5370.hashCode();
	}

	public boolean method7742(Object object) {
		if (object instanceof Class473)
			return anObject5370.equals(((Class473) object).anObject5370);
		throw new IllegalArgumentException();
	}

	public int method7743() {
		return anObject5370.hashCode();
	}

	public int compareTo(Object object) {
		return method7741((Class473) object, 192574015);
	}

	public int method7744() {
		return anObject5370.hashCode();
	}

	Class473(Object object, Object object_1_) {
		anObject5372 = object;
		anObject5370 = object_1_;
	}

	public int method7745() {
		return anObject5370.hashCode();
	}

	int method7746(Class473 class473_2_) {
		if (2584112087553795213L * aLong5369 < 2584112087553795213L * class473_2_.aLong5369)
			return -1;
		if (2584112087553795213L * aLong5369 > class473_2_.aLong5369 * 2584112087553795213L)
			return 1;
		return 0;
	}

	int method7747(Class473 class473_3_) {
		if (2584112087553795213L * aLong5369 < 2584112087553795213L * class473_3_.aLong5369)
			return -1;
		if (2584112087553795213L * aLong5369 > class473_3_.aLong5369 * 2584112087553795213L)
			return 1;
		return 0;
	}

	int method7748(Class473 class473_4_) {
		if (2584112087553795213L * aLong5369 < 2584112087553795213L * class473_4_.aLong5369)
			return -1;
		if (2584112087553795213L * aLong5369 > class473_4_.aLong5369 * 2584112087553795213L)
			return 1;
		return 0;
	}

	public int method7749(Object object) {
		return method7741((Class473) object, -1070446663);
	}

	public int method7750(Object object) {
		return method7741((Class473) object, 1586275072);
	}

	static final void method7751(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_5_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_6_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		if (null != Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183) {
			for (int i_7_ = 0; i_7_ < Class322.anIntArray3559.length; i_7_++) {
				if (i_5_ == Class322.anIntArray3559[i_7_]) {
					Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183.method10482(i_7_, i_6_, Class587.aClass24_Sub19_7760, (byte) 126);
					return;
				}
			}
			for (int i_8_ = 0; i_8_ < Class322.anIntArray3563.length; i_8_++) {
				if (i_5_ == Class322.anIntArray3563[i_8_]) {
					Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183.method10482(i_8_, i_6_, Class587.aClass24_Sub19_7760, (byte) 44);
					break;
				}
			}
		}
	}

	static final void method7752(Class665 class665, byte i) throws Exception_Sub6 {
		class665.anInt8526 -= 409523364;
		int i_9_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_10_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		int i_11_ = class665.anIntArray8525[2 + 1769813785 * class665.anInt8526];
		Class442 class442 = Class442.method7166((float) i_9_, (float) i_10_, (float) i_11_);
		Class208_Sub10.aClass296_Sub1_9923.method5357(class442, (byte) 2);
		class442.method7141();
	}
}
