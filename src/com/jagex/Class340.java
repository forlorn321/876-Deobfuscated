/* Class340 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class340 {
	Class199 aClass199_3658 = new Class199(10485760, 256);
	Interface24 anInterface24_3659;
	Class167_Sub3 aClass167_Sub3_3660;

	Class340(Class167_Sub3 class167_sub3, Interface24 interface24) {
		aClass167_Sub3_3660 = class167_sub3;
		anInterface24_3659 = interface24;
	}

	void method4451() {
		aClass199_3658.method2883(5, -1558243897);
	}

	Interface36 method4452(Class164 class164, int i) {
		long l = (long) (i << 16 | class164.anInt1801 * -398625547);
		Interface36 interface36 = (Interface36) aClass199_3658.method2886(l);
		if (interface36 != null)
			return interface36;
		if (!method4453(class164, i))
			return null;
		if (i == -1)
			i = class164.anInt1815 * -1174323635;
		Interface36 interface36_0_;
		if (!class164.aBool1804 || !aClass167_Sub3_3660.method2124()) {
			int[] is;
			if (class164.aClass595_1805 != Class595.aClass595_7820 || !Class16_Sub1.method10359(class164.aByte1797, 1662636228))
				is = anInterface24_3659.method134(Class599.aClass599_7843, (class164.anInt1801 * -398625547), 0.7F, i, i, false, -2006193931);
			else
				is = anInterface24_3659.method133(Class599.aClass599_7843, (class164.anInt1801 * -398625547), 0.7F, i, i, true, -1804844223);
			if (is == null)
				return null;
			interface36_0_ = aClass167_Sub3_3660.method8771(i, i, true, is);
		} else {
			float[] fs = anInterface24_3659.method148(Class599.aClass599_7843, class164.anInt1801 * -398625547, 0.7F, i, i, false, (byte) -51);
			interface36_0_ = aClass167_Sub3_3660.method8773(Class155.aClass155_1722, i, i, true, fs);
		}
		interface36_0_.method222(class164.aByte1807 == 1, class164.aByte1787 == 1);
		aClass199_3658.method2882(interface36_0_, l, i * i, (byte) 47);
		return interface36_0_;
	}

	boolean method4453(Class164 class164, int i) {
		if (i == -1)
			i = class164.anInt1815 * -1174323635;
		if (!class164.aBool1804 || !aClass167_Sub3_3660.method2124()) {
			if (class164.aClass595_1805 != Class595.aClass595_7820 || !Class16_Sub1.method10359(class164.aByte1797, 884558418))
				return anInterface24_3659.method137(Class599.aClass599_7843, (class164.anInt1801 * -398625547), Class594.aClass594_7815, 0.7F, i, i, false, 2143956846);
			return anInterface24_3659.method137(Class599.aClass599_7843, (class164.anInt1801 * -398625547), Class594.aClass594_7814, 0.7F, i, i, true, 2094165895);
		}
		return anInterface24_3659.method137(Class599.aClass599_7843, class164.anInt1801 * -398625547, Class594.aClass594_7813, 0.7F, i, i, false, 2081500806);
	}

	void method4454() {
		aClass199_3658.method2883(5, -1133484551);
	}

	void method4455() {
		aClass199_3658.method2884((byte) -50);
	}

	Interface36 method4456(Class164 class164) {
		return method4452(class164, class164.anInt1815 * -1174323635);
	}

	void method4457() {
		aClass199_3658.method2883(5, -1240154926);
	}

	void method4458() {
		aClass199_3658.method2884((byte) -117);
	}

	void method4459() {
		aClass199_3658.method2884((byte) -24);
	}
}
