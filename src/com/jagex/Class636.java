/* Class636 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

class Class636 implements Iterator {
	int anInt8303;
	Class95_Sub1_Sub2 this$0;
	public static Class459 aClass459_8304;

	public void method10559() {
		throw new UnsupportedOperationException();
	}

	public boolean hasNext() {
		return 550539547 * anInt8303 < this$0.method77(87658128);
	}

	public Object method10560() {
		int i = (anInt8303 += 2134794515) * 550539547 - 1;
		Class160_Sub2 class160_sub2 = (Class160_Sub2) this$0.aClass205_11336.method3787((long) i);
		if (class160_sub2 != null)
			return class160_sub2;
		return this$0.method17885(i, (byte) 5);
	}

	public Object method10561() {
		int i = (anInt8303 += 2134794515) * 550539547 - 1;
		Class160_Sub2 class160_sub2 = (Class160_Sub2) this$0.aClass205_11336.method3787((long) i);
		if (class160_sub2 != null)
			return class160_sub2;
		return this$0.method17885(i, (byte) 47);
	}

	public boolean method10562() {
		return 550539547 * anInt8303 < this$0.method77(1883477526);
	}

	Class636(Class95_Sub1_Sub2 class95_sub1_sub2) {
		this$0 = class95_sub1_sub2;
	}

	public Object next() {
		int i = (anInt8303 += 2134794515) * 550539547 - 1;
		Class160_Sub2 class160_sub2 = (Class160_Sub2) this$0.aClass205_11336.method3787((long) i);
		if (class160_sub2 != null)
			return class160_sub2;
		return this$0.method17885(i, (byte) -35);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	static final void method10563(Class665 class665, int i) {
		class665.anInt8526 -= 511904205;
		int i_0_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_1_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		int i_2_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 2];
		int i_3_ = class665.anIntArray8525[3 + class665.anInt8526 * 1769813785];
		int i_4_ = class665.anIntArray8525[4 + class665.anInt8526 * 1769813785];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_0_ + (i_4_ - i_2_) * (i_1_ - i_0_) / (i_3_ - i_2_);
	}

	static final void method10564(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_5_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_6_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		if (i_5_ > 700 || i_6_ > 700)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 256;
		double d = ((Math.random() * (double) (i_6_ + i_5_) - (double) i_5_ + 800.0) / 100.0);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (int) (Math.pow(2.0, d) + 0.5);
	}

	static final void method10565(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class529.anInt7137 + Class529_Sub1.anInt10783 * -502443805;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 1891819005 * Class635.anInt8302 + Class529.anInt7138;
	}

	static final void method10566(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aShort11153;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aShort11282;
	}
}
