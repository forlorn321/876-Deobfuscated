/* Class149 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class149 {
	Class199 aClass199_1699 = new Class199(10485760, 256);
	Interface24 anInterface24_1700;
	Class167_Sub2 aClass167_Sub2_1701;

	Class149(Class167_Sub2 class167_sub2, Interface24 interface24) {
		aClass167_Sub2_1701 = class167_sub2;
		anInterface24_1700 = interface24;
	}

	Class124_Sub1 method1817(Class164 class164) {
		return method1818(class164, class164.anInt1815 * -1174323635);
	}

	Class124_Sub1 method1818(Class164 class164, int i) {
		Class124_Sub1 class124_sub1 = ((Class124_Sub1) aClass199_1699.method2886((long) (class164.anInt1801 * -398625547)));
		if (class124_sub1 != null)
			return class124_sub1;
		if (!method1819(Class599.aClass599_7843, class164, i))
			return null;
		if (i == -1)
			i = class164.anInt1815 * -1174323635;
		Class124_Sub1 class124_sub1_0_;
		if (!class164.aBool1804 || !aClass167_Sub2_1701.method2124()) {
			int[] is;
			if (class164.aClass595_1805 != Class595.aClass595_7820 || !Class16_Sub1.method10359(class164.aByte1797, -145778489))
				is = anInterface24_1700.method134(Class599.aClass599_7843, (class164.anInt1801 * -398625547), 0.7F, i, i, false, -135331954);
			else
				is = anInterface24_1700.method133(Class599.aClass599_7843, (class164.anInt1801 * -398625547), 0.7F, i, i, true, -289448188);
			class124_sub1_0_ = new Class124_Sub1(aClass167_Sub2_1701, 3553, i, i, class164.aByte1825 != 0, is, 0, 0, false);
		} else {
			float[] fs = anInterface24_1700.method148(Class599.aClass599_7843, class164.anInt1801 * -398625547, 0.7F, i, i, false, (byte) 90);
			class124_sub1_0_ = new Class124_Sub1(aClass167_Sub2_1701, 3553, Class155.aClass155_1722, Class171.aClass171_1902, i, i, class164.aByte1825 != 0, fs, Class155.aClass155_1722);
		}
		class124_sub1_0_.method8394(class164.aByte1807 == 1, class164.aByte1787 == 1);
		aClass199_1699.method2882(class124_sub1_0_, (long) (class164.anInt1801 * -398625547), i * i, (byte) 114);
		return class124_sub1_0_;
	}

	boolean method1819(Class599 class599, Class164 class164, int i) {
		if (i == -1)
			i = class164.anInt1815 * -1174323635;
		if (!class164.aBool1804 || !aClass167_Sub2_1701.method2124()) {
			if (class164.aClass595_1805 != Class595.aClass595_7820 || !Class16_Sub1.method10359(class164.aByte1797, 1752989461))
				return anInterface24_1700.method137(class599, (class164.anInt1801 * -398625547), Class594.aClass594_7815, 0.7F, i, i, false, 2022261194);
			return anInterface24_1700.method137(class599, (class164.anInt1801 * -398625547), Class594.aClass594_7814, 0.7F, i, i, true, 2024841245);
		}
		return anInterface24_1700.method137(class599, class164.anInt1801 * -398625547, Class594.aClass594_7813, 0.7F, i, i, false, 2082475701);
	}

	void method1820() {
		aClass199_1699.method2883(5, -2068221245);
	}

	void method1821() {
		aClass199_1699.method2883(5, -1985451893);
	}

	void method1822() {
		aClass199_1699.method2884((byte) -102);
	}

	void method1823() {
		aClass199_1699.method2883(5, -1384174745);
	}

	void method1824() {
		aClass199_1699.method2884((byte) -117);
	}

	void method1825() {
		aClass199_1699.method2884((byte) -39);
	}
}
