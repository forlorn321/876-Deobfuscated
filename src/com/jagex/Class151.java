/* Class151 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Comparator;
import java.util.Date;

class Class151 implements Comparator {
	Class360_Sub2 this$0;
	static int anInt1711;
	public static boolean aBool1712;
	static int anInt1713;

	public boolean method1845(Object object) {
		return super.equals(object);
	}

	public int method1846(Object object, Object object_0_) {
		return method1850((Class492) object, (Class492) object_0_, 1867269829);
	}

	public int compare(Object object, Object object_1_) {
		return method1850((Class492) object, (Class492) object_1_, 1867269829);
	}

	public boolean equals(Object object) {
		return super.equals(object);
	}

	public int method1847(Object object, Object object_2_) {
		return method1850((Class492) object, (Class492) object_2_, 1867269829);
	}

	public int method1848(Object object, Object object_3_) {
		return method1850((Class492) object, (Class492) object_3_, 1867269829);
	}

	public boolean method1849(Object object) {
		return super.equals(object);
	}

	int method1850(Class492 class492, Class492 class492_4_, int i) {
		float f = class492.method5899((byte) -16);
		float f_5_ = class492_4_.method5899((byte) 99);
		if (f_5_ > f)
			return 1;
		if (f_5_ < f)
			return -1;
		return 0;
	}

	public int method1851(Object object, Object object_6_) {
		return method1850((Class492) object, (Class492) object_6_, 1867269829);
	}

	Class151(Class360_Sub2 class360_sub2) {
		this$0 = class360_sub2;
	}

	static final void method1852(InterfaceDefinitions class251, Class668 class668, int i) {
		int i_7_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		int i_8_ = ((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) - 1);
		int i_9_ = i_8_;
		if (6 != 1939619399 * class251.anInt2601 && 1939619399 * class251.anInt2601 != 2)
			throw new RuntimeException("");
		Class296 class296 = ((Class296) Class172.aClass34_Sub7_1922.method70(-2011124813 * class251.anInt2602, (byte) -36));
		if (null == class251.aClass304_2583)
			class251.aClass304_2583 = new Class304(class296, class251.anInt2601 * 1939619399 == 6);
		class251.aClass304_2583.aLong3434 = Class584.method7047(-960212750) * 1195640203384682761L;
		if (class296.aByteArray3307 != null) {
			if (i_8_ < 0 || i_8_ >= class296.aByteArray3307.length)
				throw new RuntimeException("");
			i_9_ = class296.aByteArray3307[i_8_];
		}
		if (null == class296.aShortArray3278 || i_9_ < 0 || i_9_ >= class296.aShortArray3278.length)
			throw new RuntimeException("");
		class251.aClass304_2583.aShortArray3438[i_9_] = (short) i_7_;
		Class668.method8011(class251, 263642117);
	}

	static void method1853(long l) {
		Class81.aCalendar860.setTime(new Date(l));
	}
}
