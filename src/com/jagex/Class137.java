/* Class137 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class137 {
	Class140_Sub3 aClass140_Sub3_1579;
	int anInt1580 = 0;
	Class140[] aClass140Array1581;
	int anInt1582;
	Class180_Sub3 aClass180_Sub3_1583;
	Class136 aClass136_1584;
	int anInt1585 = 0;

	Class137(Class180_Sub3 class180_sub3) {
		anInt1582 = 0;
		aClass180_Sub3_1583 = class180_sub3;
		aClass136_1584 = new Class136(class180_sub3);
		aClass140Array1581 = new Class140[16];
		aClass140Array1581[1] = new Class140_Sub8(class180_sub3);
		aClass140Array1581[2] = new Class140_Sub5(class180_sub3, aClass136_1584);
		aClass140Array1581[4] = new Class140_Sub9(class180_sub3, aClass136_1584);
		aClass140Array1581[5] = new Class140_Sub6(class180_sub3, aClass136_1584);
		aClass140Array1581[6] = new Class140_Sub1(class180_sub3);
		aClass140Array1581[7] = new Class140_Sub7(class180_sub3);
		aClass140Array1581[3] = aClass140_Sub3_1579 = new Class140_Sub3(class180_sub3);
		aClass140Array1581[8] = new Class140_Sub4(class180_sub3, aClass136_1584);
		aClass140Array1581[9] = new Class140_Sub2(class180_sub3, aClass136_1584);
		if (!aClass140Array1581[8].method2319())
			aClass140Array1581[8] = aClass140Array1581[4];
		if (!aClass140Array1581[9].method2319())
			aClass140Array1581[9] = aClass140Array1581[8];
	}

	boolean method2304(Class118 class118, int i) {
		if (anInt1582 == 0)
			return false;
		aClass140Array1581[anInt1582 & 0x7fffffff].method2320(class118, i);
		return true;
	}

	void method2305(int i, int i_0_, int i_1_, boolean bool, boolean bool_2_) {
		bool_2_ &= aClass180_Sub3_1583.method15343();
		if (!bool_2_ && (i == 4 || i == 8 || i == 9)) {
			if (i == 4)
				i_1_ = i_0_;
			i = 2;
		}
		if (i != 0 && bool)
			i |= ~0x7fffffff;
		if (anInt1582 != i) {
			if (anInt1582 != 0)
				aClass140Array1581[anInt1582 & 0x7fffffff].method2322();
			if (i != 0) {
				aClass140Array1581[i & 0x7fffffff].method2324(bool);
				aClass140Array1581[i & 0x7fffffff].method2340(bool);
				aClass140Array1581[i & 0x7fffffff].method2323(i_0_, i_1_);
			}
			anInt1582 = i;
			anInt1580 = i_0_;
			anInt1585 = i_1_;
		} else if (anInt1582 != 0) {
			aClass140Array1581[anInt1582 & 0x7fffffff].method2340(bool);
			if (anInt1580 != i_0_ || anInt1585 != i_1_) {
				aClass140Array1581[anInt1582 & 0x7fffffff].method2323(i_0_, i_1_);
				anInt1580 = i_0_;
				anInt1585 = i_1_;
			}
		}
	}

	boolean method2306(Class118 class118, int i) {
		if (anInt1582 == 0)
			return false;
		aClass140Array1581[anInt1582 & 0x7fffffff].method2320(class118, i);
		return true;
	}

	boolean method2307(int i) {
		return aClass140Array1581[i].method2319();
	}

	boolean method2308(int i) {
		return aClass140Array1581[i].method2319();
	}

	boolean method2309(int i) {
		return aClass140Array1581[i].method2319();
	}

	boolean method2310(int i) {
		return aClass140Array1581[i].method2319();
	}

	boolean method2311(int i) {
		return aClass140Array1581[i].method2319();
	}

	void method2312(int i, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
		bool_5_ &= aClass180_Sub3_1583.method15343();
		if (!bool_5_ && (i == 4 || i == 8 || i == 9)) {
			if (i == 4)
				i_4_ = i_3_;
			i = 2;
		}
		if (i != 0 && bool)
			i |= ~0x7fffffff;
		if (anInt1582 != i) {
			if (anInt1582 != 0)
				aClass140Array1581[anInt1582 & 0x7fffffff].method2322();
			if (i != 0) {
				aClass140Array1581[i & 0x7fffffff].method2324(bool);
				aClass140Array1581[i & 0x7fffffff].method2340(bool);
				aClass140Array1581[i & 0x7fffffff].method2323(i_3_, i_4_);
			}
			anInt1582 = i;
			anInt1580 = i_3_;
			anInt1585 = i_4_;
		} else if (anInt1582 != 0) {
			aClass140Array1581[anInt1582 & 0x7fffffff].method2340(bool);
			if (anInt1580 != i_3_ || anInt1585 != i_4_) {
				aClass140Array1581[anInt1582 & 0x7fffffff].method2323(i_3_, i_4_);
				anInt1580 = i_3_;
				anInt1585 = i_4_;
			}
		}
	}

	boolean method2313(int i) {
		return aClass140Array1581[i].method2319();
	}

	boolean method2314(Class118 class118, int i) {
		if (anInt1582 == 0)
			return false;
		aClass140Array1581[anInt1582 & 0x7fffffff].method2320(class118, i);
		return true;
	}

	boolean method2315(Class118 class118, int i) {
		if (anInt1582 == 0)
			return false;
		aClass140Array1581[anInt1582 & 0x7fffffff].method2320(class118, i);
		return true;
	}
}
