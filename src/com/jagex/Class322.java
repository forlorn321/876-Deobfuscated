/* Class322 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class322 {
	Class461 aClass461_3544;
	Class461 aClass461_3545;
	Class323 aClass323_3546;

	public Interface33 method4248(Interface49 interface49, byte i) {
		if (interface49 == null)
			return null;
		Class390 class390 = interface49.method343((byte) -63);
		if (Class390.aClass390_4056 == class390)
			return new Class335((Class384) interface49);
		if (Class390.aClass390_4052 == class390)
			return new Class326(method4249(-714050479), (Class387) interface49);
		if (class390 == Class390.aClass390_4053)
			return new Class330(aClass461_3544, (Class398) interface49);
		if (class390 == Class390.aClass390_4050)
			return new Class330_Sub1(aClass461_3544, (Class398_Sub1) interface49);
		if (class390 == Class390.aClass390_4049)
			return new Class319_Sub3(aClass461_3544, aClass461_3545, (Class392_Sub1) interface49);
		if (Class390.aClass390_4059 == class390)
			return new Class319_Sub2(aClass461_3544, aClass461_3545, (Class392_Sub2) interface49);
		if (Class390.aClass390_4051 == class390)
			return new Class319_Sub1(aClass461_3544, aClass461_3545, (Class392_Sub3) interface49);
		if (Class390.aClass390_4054 == class390)
			return new Class329(aClass461_3544, aClass461_3545, (Class386) interface49);
		if (Class390.aClass390_4048 == class390)
			return new Class321(aClass461_3544, (Class388) interface49);
		if (Class390.aClass390_4057 == class390)
			return new Class319_Sub1_Sub1(aClass461_3544, aClass461_3545, (Class392_Sub3_Sub1) interface49);
		if (class390 == Class390.aClass390_4058)
			return new Class320(aClass461_3544, aClass461_3545, (Class394) interface49);
		return null;
	}

	public Class322(Class461 class461, Class461 class461_0_) {
		aClass461_3544 = class461;
		aClass461_3545 = class461_0_;
	}

	Class323 method4249(int i) {
		if (null == aClass323_3546)
			aClass323_3546 = new Class323();
		return aClass323_3546;
	}

	static void method4250(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class677.method8051((byte) -72);
	}

	static final void method4251(Class668 class668, byte i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Character.toLowerCase((char) i_1_);
	}

	static final void method4252(Class668 class668, int i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = Class63.aClass226_717.method3227(i_2_, -781094290).method3113((byte) -84);
	}
}
