/* Class272 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class272 {
	int anInt2888;
	int anInt2889;
	String aString2890;

	Class272(String string, int i, int i_0_) {
		aString2890 = string;
		anInt2889 = i * 855782467;
		anInt2888 = 1546905075 * i_0_;
	}

	static String method3719(String string, int i) {
		if (Class497.aString5550.startsWith("win"))
			return new StringBuilder().append(string).append(".dll").toString();
		if (Class497.aString5550.startsWith("linux"))
			return new StringBuilder().append("lib").append(string).append(".so").toString();
		if (Class497.aString5550.startsWith("mac"))
			return new StringBuilder().append("lib").append(string).append(".dylib").toString();
		return null;
	}

	static final void method3720(Class668 class668, byte i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_1_);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class251.anInt2606 * -1027484909;
	}

	static final void method3721(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.anInt10987 * 1051867059;
	}

	static final void method3722(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_2_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		boolean bool = 1 == (class668.anIntArray8541[1 + 1867269829 * class668.anInt8542]);
		if (null != Class542_Sub1.aClass4_10720) {
			Class536 class536 = Class542_Sub1.aClass4_10720.method556((long) i_2_);
			if (class536 != null && !bool)
				class536.method6484();
			else if (class536 == null && bool) {
				class536 = new Class536();
				Class542_Sub1.aClass4_10720.method560(class536, (long) i_2_);
			}
		}
	}

	static String method3723(long l, int i, int i_3_) {
		Class164.method1972(l);
		int i_4_ = Class81.aCalendar859.get(5);
		int i_5_ = Class81.aCalendar859.get(2) + 1;
		int i_6_ = Class81.aCalendar859.get(1);
		return new StringBuilder().append(Integer.toString(i_4_ / 10)).append(i_4_ % 10).append("/").append(i_5_ / 10).append(i_5_ % 10).append("/").append(i_6_ % 100 / 10).append(i_6_ % 10).toString();
	}

	static final void method3724(Class668 class668, int i) {
		int i_7_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_7_);
		Class254.method3538(class251, class668, 278560769);
	}
}
