/* Class140 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class140 {
	int anInt1651 = 0;
	int anInt1652;
	int anInt1653 = 0;
	Class167_Sub2 aClass167_Sub2_1654;
	Class131 aClass131_1655;
	Class128[] aClass128Array1656;
	Class128_Sub7 aClass128_Sub7_1657;

	boolean method1701(int i) {
		return aClass128Array1656[i].method1652();
	}

	boolean method1702(int i) {
		return aClass128Array1656[i].method1652();
	}

	void method1703(int i, int i_0_, int i_1_, boolean bool, boolean bool_2_) {
		bool_2_ &= aClass167_Sub2_1654.method8583();
		if (!bool_2_ && (i == 4 || i == 8 || i == 9)) {
			if (i == 4)
				i_1_ = i_0_;
			i = 2;
		}
		if (i != 0 && bool)
			i |= ~0x7fffffff;
		if (anInt1652 != i) {
			if (anInt1652 != 0)
				aClass128Array1656[anInt1652 & 0x7fffffff].method1654();
			if (i != 0) {
				aClass128Array1656[i & 0x7fffffff].method1653(bool);
				aClass128Array1656[i & 0x7fffffff].method1673(bool);
				aClass128Array1656[i & 0x7fffffff].method1656(i_0_, i_1_);
			}
			anInt1652 = i;
			anInt1651 = i_0_;
			anInt1653 = i_1_;
		} else if (anInt1652 != 0) {
			aClass128Array1656[anInt1652 & 0x7fffffff].method1673(bool);
			if (anInt1651 != i_0_ || anInt1653 != i_1_) {
				aClass128Array1656[anInt1652 & 0x7fffffff].method1656(i_0_, i_1_);
				anInt1651 = i_0_;
				anInt1653 = i_1_;
			}
		}
	}

	boolean method1704(Class124 class124, int i) {
		if (anInt1652 == 0)
			return false;
		aClass128Array1656[anInt1652 & 0x7fffffff].method1674(class124, i);
		return true;
	}

	boolean method1705(int i) {
		return aClass128Array1656[i].method1652();
	}

	Class140(Class167_Sub2 class167_sub2) {
		anInt1652 = 0;
		aClass167_Sub2_1654 = class167_sub2;
		aClass131_1655 = new Class131(class167_sub2);
		aClass128Array1656 = new Class128[16];
		aClass128Array1656[1] = new Class128_Sub1(class167_sub2);
		aClass128Array1656[2] = new Class128_Sub4(class167_sub2, aClass131_1655);
		aClass128Array1656[4] = new Class128_Sub6(class167_sub2, aClass131_1655);
		aClass128Array1656[5] = new Class128_Sub3(class167_sub2, aClass131_1655);
		aClass128Array1656[6] = new Class128_Sub9(class167_sub2);
		aClass128Array1656[7] = new Class128_Sub2(class167_sub2);
		aClass128Array1656[3] = aClass128_Sub7_1657 = new Class128_Sub7(class167_sub2);
		aClass128Array1656[8] = new Class128_Sub8(class167_sub2, aClass131_1655);
		aClass128Array1656[9] = new Class128_Sub5(class167_sub2, aClass131_1655);
		if (!aClass128Array1656[8].method1652())
			aClass128Array1656[8] = aClass128Array1656[4];
		if (!aClass128Array1656[9].method1652())
			aClass128Array1656[9] = aClass128Array1656[8];
	}
}
