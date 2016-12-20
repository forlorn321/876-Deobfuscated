/* Class136 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class136 {
	static Object anObject1566;
	static final int anInt1567 = 128;
	static final int anInt1568 = 4000;
	static final int anInt1569 = 16;
	boolean aBool1570;
	Class118_Sub3[] aClass118_Sub3Array1571 = null;
	Class118_Sub4 aClass118_Sub4_1572 = null;
	Class118_Sub3[] aClass118_Sub3Array1573 = null;
	static Object anObject1574;
	Class118_Sub4 aClass118_Sub4_1575;
	static final int anInt1576 = 128;
	Class118_Sub4 aClass118_Sub4_1577 = null;
	static Object anObject1578;

	static void method2301(Class180_Sub3 class180_sub3) {
		if (anObject1566 == null) {
			Class412_Sub1_Sub2 class412_sub1_sub2 = new Class412_Sub1_Sub2();
			byte[] is = class412_sub1_sub2.method18072(128, 128, 16);
			anObject1566 = Class166.method2668(is, false, (short) -5635);
		}
		if (anObject1574 == null) {
			Class412_Sub2_Sub1 class412_sub2_sub1 = new Class412_Sub2_Sub1();
			byte[] is = class412_sub2_sub1.method17984(128, 128, 16);
			anObject1574 = Class166.method2668(is, false, (short) 739);
		}
		Class162 class162 = class180_sub3.aClass162_9704;
		if (class162.method2644() && anObject1578 == null) {
			byte[] is = Class533.method8935(128, 128, 16, 8, new Class538_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject1578 = Class166.method2668(is, false, (short) 6528);
		}
	}

	Class136(Class180_Sub3 class180_sub3) {
		aClass118_Sub4_1575 = null;
		aBool1570 = class180_sub3.aBool9826;
		method2303(class180_sub3);
		if (!aBool1570) {
			aClass118_Sub3Array1571 = new Class118_Sub3[16];
			for (int i = 0; i < 16; i++) {
				byte[] is = Class320.method5696(anObject1566, i * 32768, 32768, 316740117);
				aClass118_Sub3Array1571[i] = new Class118_Sub3(class180_sub3, 3553, Class157.aClass157_1726, Class184.aClass184_2104, 128, 128, true, is, Class157.aClass157_1726, false);
			}
			aClass118_Sub3Array1573 = new Class118_Sub3[16];
			for (int i = 0; i < 16; i++) {
				byte[] is = Class320.method5696(anObject1574, i * 32768, 32768, 316740117);
				aClass118_Sub3Array1573[i] = new Class118_Sub3(class180_sub3, 3553, Class157.aClass157_1726, Class184.aClass184_2104, 128, 128, true, is, Class157.aClass157_1726, false);
			}
		} else {
			byte[] is = Class537.method8985(anObject1566, false, 694352585);
			aClass118_Sub4_1572 = new Class118_Sub4(class180_sub3, Class157.aClass157_1726, Class184.aClass184_2104, 128, 128, 16, is, Class157.aClass157_1726);
			is = Class537.method8985(anObject1574, false, 696868780);
			aClass118_Sub4_1577 = new Class118_Sub4(class180_sub3, Class157.aClass157_1726, Class184.aClass184_2104, 128, 128, 16, is, Class157.aClass157_1726);
			Class162 class162 = class180_sub3.aClass162_9704;
			if (class162.method2644()) {
				is = Class537.method8985(anObject1578, false, -633727247);
				aClass118_Sub4_1575 = new Class118_Sub4(class180_sub3, Class157.aClass157_1723, Class184.aClass184_2104, 128, 128, 16);
				Class118_Sub4 class118_sub4 = new Class118_Sub4(class180_sub3, Class157.aClass157_1725, Class184.aClass184_2104, 128, 128, 16, is, Class157.aClass157_1725);
				if (!class162.method2646(aClass118_Sub4_1575, class118_sub4, 2.0F)) {
					aClass118_Sub4_1575.method2040();
					aClass118_Sub4_1575 = null;
				} else
					aClass118_Sub4_1575.method2037();
				class118_sub4.method2040();
			}
		}
	}

	static void method2302(Class180_Sub3 class180_sub3) {
		if (anObject1566 == null) {
			Class412_Sub1_Sub2 class412_sub1_sub2 = new Class412_Sub1_Sub2();
			byte[] is = class412_sub1_sub2.method18072(128, 128, 16);
			anObject1566 = Class166.method2668(is, false, (short) -3540);
		}
		if (anObject1574 == null) {
			Class412_Sub2_Sub1 class412_sub2_sub1 = new Class412_Sub2_Sub1();
			byte[] is = class412_sub2_sub1.method17984(128, 128, 16);
			anObject1574 = Class166.method2668(is, false, (short) 148);
		}
		Class162 class162 = class180_sub3.aClass162_9704;
		if (class162.method2644() && anObject1578 == null) {
			byte[] is = Class533.method8935(128, 128, 16, 8, new Class538_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject1578 = Class166.method2668(is, false, (short) 25958);
		}
	}

	static void method2303(Class180_Sub3 class180_sub3) {
		if (anObject1566 == null) {
			Class412_Sub1_Sub2 class412_sub1_sub2 = new Class412_Sub1_Sub2();
			byte[] is = class412_sub1_sub2.method18072(128, 128, 16);
			anObject1566 = Class166.method2668(is, false, (short) 8542);
		}
		if (anObject1574 == null) {
			Class412_Sub2_Sub1 class412_sub2_sub1 = new Class412_Sub2_Sub1();
			byte[] is = class412_sub2_sub1.method17984(128, 128, 16);
			anObject1574 = Class166.method2668(is, false, (short) 16110);
		}
		Class162 class162 = class180_sub3.aClass162_9704;
		if (class162.method2644() && anObject1578 == null) {
			byte[] is = Class533.method8935(128, 128, 16, 8, new Class538_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject1578 = Class166.method2668(is, false, (short) -26784);
		}
	}
}
