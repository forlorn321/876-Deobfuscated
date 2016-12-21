/* Class131 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class131 {
	static final int anInt1590 = 16;
	static final int anInt1591 = 128;
	Class124_Sub2 aClass124_Sub2_1592;
	static final int anInt1593 = 4000;
	boolean aBool1594;
	Class124_Sub1[] aClass124_Sub1Array1595 = null;
	Class124_Sub2 aClass124_Sub2_1596 = null;
	Class124_Sub1[] aClass124_Sub1Array1597 = null;
	Class124_Sub2 aClass124_Sub2_1598 = null;
	static Object anObject1599;
	static final int anInt1600 = 128;
	static Object anObject1601;
	static Object anObject1602;

	Class131(Class167_Sub2 class167_sub2) {
		aClass124_Sub2_1592 = null;
		aBool1594 = class167_sub2.aBool9230;
		method1680(class167_sub2);
		if (!aBool1594) {
			aClass124_Sub1Array1595 = new Class124_Sub1[16];
			for (int i = 0; i < 16; i++) {
				byte[] is = Class449.method5422(anObject1599, i * 32768, 32768, 1160160753);
				aClass124_Sub1Array1595[i] = new Class124_Sub1(class167_sub2, 3553, Class155.aClass155_1725, Class171.aClass171_1905, 128, 128, true, is, Class155.aClass155_1725, false);
			}
			aClass124_Sub1Array1597 = new Class124_Sub1[16];
			for (int i = 0; i < 16; i++) {
				byte[] is = Class449.method5422(anObject1601, i * 32768, 32768, -1612596135);
				aClass124_Sub1Array1597[i] = new Class124_Sub1(class167_sub2, 3553, Class155.aClass155_1725, Class171.aClass171_1905, 128, 128, true, is, Class155.aClass155_1725, false);
			}
		} else {
			byte[] is = Class51.method931(anObject1599, false, -38167134);
			aClass124_Sub2_1596 = new Class124_Sub2(class167_sub2, Class155.aClass155_1725, Class171.aClass171_1905, 128, 128, 16, is, Class155.aClass155_1725);
			is = Class51.method931(anObject1601, false, -474229418);
			aClass124_Sub2_1598 = new Class124_Sub2(class167_sub2, Class155.aClass155_1725, Class171.aClass171_1905, 128, 128, 16, is, Class155.aClass155_1725);
			Class146 class146 = class167_sub2.aClass146_9175;
			if (class146.method1803()) {
				is = Class51.method931(anObject1602, false, -459618483);
				aClass124_Sub2_1592 = new Class124_Sub2(class167_sub2, Class155.aClass155_1722, Class171.aClass171_1905, 128, 128, 16);
				Class124_Sub2 class124_sub2 = new Class124_Sub2(class167_sub2, Class155.aClass155_1721, Class171.aClass171_1905, 128, 128, 16, is, Class155.aClass155_1721);
				if (!class146.method1807(aClass124_Sub2_1592, class124_sub2, 2.0F)) {
					aClass124_Sub2_1592.method1625();
					aClass124_Sub2_1592 = null;
				} else
					aClass124_Sub2_1592.method1611();
				class124_sub2.method1625();
			}
		}
	}

	static void method1680(Class167_Sub2 class167_sub2) {
		if (anObject1599 == null) {
			Class418_Sub1_Sub1 class418_sub1_sub1 = new Class418_Sub1_Sub1();
			byte[] is = class418_sub1_sub1.method10577(128, 128, 16);
			anObject1599 = Class676.method8038(is, false, (byte) 80);
		}
		if (anObject1601 == null) {
			Class418_Sub2_Sub2 class418_sub2_sub2 = new Class418_Sub2_Sub2();
			byte[] is = class418_sub2_sub2.method10638(128, 128, 16);
			anObject1601 = Class676.method8038(is, false, (byte) 102);
		}
		Class146 class146 = class167_sub2.aClass146_9175;
		if (class146.method1803() && anObject1602 == null) {
			byte[] is = Class525.method6411(128, 128, 16, 8, new Class539_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject1602 = Class676.method8038(is, false, (byte) 97);
		}
	}

	static void method1681(Class167_Sub2 class167_sub2) {
		if (anObject1599 == null) {
			Class418_Sub1_Sub1 class418_sub1_sub1 = new Class418_Sub1_Sub1();
			byte[] is = class418_sub1_sub1.method10577(128, 128, 16);
			anObject1599 = Class676.method8038(is, false, (byte) 29);
		}
		if (anObject1601 == null) {
			Class418_Sub2_Sub2 class418_sub2_sub2 = new Class418_Sub2_Sub2();
			byte[] is = class418_sub2_sub2.method10638(128, 128, 16);
			anObject1601 = Class676.method8038(is, false, (byte) 96);
		}
		Class146 class146 = class167_sub2.aClass146_9175;
		if (class146.method1803() && anObject1602 == null) {
			byte[] is = Class525.method6411(128, 128, 16, 8, new Class539_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject1602 = Class676.method8038(is, false, (byte) 31);
		}
	}

	static void method1682(Class167_Sub2 class167_sub2) {
		if (anObject1599 == null) {
			Class418_Sub1_Sub1 class418_sub1_sub1 = new Class418_Sub1_Sub1();
			byte[] is = class418_sub1_sub1.method10577(128, 128, 16);
			anObject1599 = Class676.method8038(is, false, (byte) 68);
		}
		if (anObject1601 == null) {
			Class418_Sub2_Sub2 class418_sub2_sub2 = new Class418_Sub2_Sub2();
			byte[] is = class418_sub2_sub2.method10638(128, 128, 16);
			anObject1601 = Class676.method8038(is, false, (byte) 19);
		}
		Class146 class146 = class167_sub2.aClass146_9175;
		if (class146.method1803() && anObject1602 == null) {
			byte[] is = Class525.method6411(128, 128, 16, 8, new Class539_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject1602 = Class676.method8038(is, false, (byte) 95);
		}
	}
}
