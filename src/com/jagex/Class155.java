/* Class155 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class155 {
	Class205 aClass205_1717 = new Class205(10485760, 256);
	Interface24 anInterface24_1718;
	Class180_Sub3 aClass180_Sub3_1719;

	void method2537() {
		aClass205_1717.method3793((byte) 25);
	}

	Class118_Sub3 method2538(Class163 class163) {
		return method2539(class163, class163.anInt1780 * 1039262975);
	}

	Class118_Sub3 method2539(Class163 class163, int i) {
		Class118_Sub3 class118_sub3 = ((Class118_Sub3) aClass205_1717.method3787((long) (class163.anInt1776 * 1303945621)));
		if (class118_sub3 != null)
			return class118_sub3;
		if (!method2540(Class609.aClass609_7996, class163, i))
			return null;
		if (i == -1)
			i = class163.anInt1780 * 1039262975;
		Class118_Sub3 class118_sub3_0_;
		if (!class163.aBool1803 || !aClass180_Sub3_1719.method3204()) {
			int[] is;
			if (class163.aClass595_1784 != Class595.aClass595_7816 || !Class306.method5607(class163.aByte1801, -1088851960))
				is = anInterface24_1718.method133(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), 0.7F, i, i, false, -1633930983);
			else
				is = anInterface24_1718.method132(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), 0.7F, i, i, true, (byte) -12);
			class118_sub3_0_ = new Class118_Sub3(aClass180_Sub3_1719, 3553, i, i, class163.aByte1804 != 0, is, 0, 0, false);
		} else {
			float[] fs = anInterface24_1718.method131(Class609.aClass609_7996, class163.anInt1776 * 1303945621, 0.7F, i, i, false, -1650587369);
			class118_sub3_0_ = new Class118_Sub3(aClass180_Sub3_1719, 3553, Class157.aClass157_1723, Class184.aClass184_2108, i, i, class163.aByte1804 != 0, fs, Class157.aClass157_1723);
		}
		class118_sub3_0_.method14450(class163.aByte1786 == 1, class163.aByte1787 == 1);
		aClass205_1717.method3813(class118_sub3_0_, (long) (class163.anInt1776 * 1303945621), i * i, 2049429942);
		return class118_sub3_0_;
	}

	boolean method2540(Class609 class609, Class163 class163, int i) {
		if (i == -1)
			i = class163.anInt1780 * 1039262975;
		if (!class163.aBool1803 || !aClass180_Sub3_1719.method3204()) {
			if (class163.aClass595_1784 != Class595.aClass595_7816 || !Class306.method5607(class163.aByte1801, -1088851960))
				return anInterface24_1718.method134(class609, (class163.anInt1776 * 1303945621), Class591.aClass591_7796, 0.7F, i, i, false, -258479197);
			return anInterface24_1718.method134(class609, (class163.anInt1776 * 1303945621), Class591.aClass591_7795, 0.7F, i, i, true, 991242688);
		}
		return anInterface24_1718.method134(class609, class163.anInt1776 * 1303945621, Class591.aClass591_7794, 0.7F, i, i, false, -1992126596);
	}

	Class118_Sub3 method2541(Class163 class163) {
		return method2539(class163, class163.anInt1780 * 1039262975);
	}

	void method2542() {
		aClass205_1717.method3793((byte) 123);
	}

	Class118_Sub3 method2543(Class163 class163) {
		return method2539(class163, class163.anInt1780 * 1039262975);
	}

	void method2544() {
		aClass205_1717.method3792(5, (byte) 39);
	}

	boolean method2545(Class609 class609, Class163 class163, int i) {
		if (i == -1)
			i = class163.anInt1780 * 1039262975;
		if (!class163.aBool1803 || !aClass180_Sub3_1719.method3204()) {
			if (class163.aClass595_1784 != Class595.aClass595_7816 || !Class306.method5607(class163.aByte1801, -1088851960))
				return anInterface24_1718.method134(class609, (class163.anInt1776 * 1303945621), Class591.aClass591_7796, 0.7F, i, i, false, 412033840);
			return anInterface24_1718.method134(class609, (class163.anInt1776 * 1303945621), Class591.aClass591_7795, 0.7F, i, i, true, -292909292);
		}
		return anInterface24_1718.method134(class609, class163.anInt1776 * 1303945621, Class591.aClass591_7794, 0.7F, i, i, false, -1848354442);
	}

	boolean method2546(Class609 class609, Class163 class163, int i) {
		if (i == -1)
			i = class163.anInt1780 * 1039262975;
		if (!class163.aBool1803 || !aClass180_Sub3_1719.method3204()) {
			if (class163.aClass595_1784 != Class595.aClass595_7816 || !Class306.method5607(class163.aByte1801, -1088851960))
				return anInterface24_1718.method134(class609, (class163.anInt1776 * 1303945621), Class591.aClass591_7796, 0.7F, i, i, false, -973679687);
			return anInterface24_1718.method134(class609, (class163.anInt1776 * 1303945621), Class591.aClass591_7795, 0.7F, i, i, true, -678420436);
		}
		return anInterface24_1718.method134(class609, class163.anInt1776 * 1303945621, Class591.aClass591_7794, 0.7F, i, i, false, -1589943674);
	}

	boolean method2547(Class609 class609, Class163 class163, int i) {
		if (i == -1)
			i = class163.anInt1780 * 1039262975;
		if (!class163.aBool1803 || !aClass180_Sub3_1719.method3204()) {
			if (class163.aClass595_1784 != Class595.aClass595_7816 || !Class306.method5607(class163.aByte1801, -1088851960))
				return anInterface24_1718.method134(class609, (class163.anInt1776 * 1303945621), Class591.aClass591_7796, 0.7F, i, i, false, -1875529574);
			return anInterface24_1718.method134(class609, (class163.anInt1776 * 1303945621), Class591.aClass591_7795, 0.7F, i, i, true, -1624074017);
		}
		return anInterface24_1718.method134(class609, class163.anInt1776 * 1303945621, Class591.aClass591_7794, 0.7F, i, i, false, -2112400211);
	}

	void method2548() {
		aClass205_1717.method3793((byte) 74);
	}

	boolean method2549(Class609 class609, Class163 class163, int i) {
		if (i == -1)
			i = class163.anInt1780 * 1039262975;
		if (!class163.aBool1803 || !aClass180_Sub3_1719.method3204()) {
			if (class163.aClass595_1784 != Class595.aClass595_7816 || !Class306.method5607(class163.aByte1801, -1088851960))
				return anInterface24_1718.method134(class609, (class163.anInt1776 * 1303945621), Class591.aClass591_7796, 0.7F, i, i, false, -1341597568);
			return anInterface24_1718.method134(class609, (class163.anInt1776 * 1303945621), Class591.aClass591_7795, 0.7F, i, i, true, -1572851732);
		}
		return anInterface24_1718.method134(class609, class163.anInt1776 * 1303945621, Class591.aClass591_7794, 0.7F, i, i, false, -1635811309);
	}

	void method2550() {
		aClass205_1717.method3792(5, (byte) 100);
	}

	void method2551() {
		aClass205_1717.method3792(5, (byte) -21);
	}

	Class155(Class180_Sub3 class180_sub3, Interface24 interface24) {
		aClass180_Sub3_1719 = class180_sub3;
		anInterface24_1718 = interface24;
	}

	void method2552() {
		aClass205_1717.method3793((byte) 31);
	}
}
