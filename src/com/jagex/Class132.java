/* Class132 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class132 {
	int anInt1603;
	int anInt1604;
	int anInt1605;
	int anInt1606;
	int anInt1607;
	int anInt1608 = 128;

	void method1683(Class132 class132_0_) {
		anInt1608 = class132_0_.anInt1608;
		anInt1604 = class132_0_.anInt1604;
		anInt1606 = class132_0_.anInt1606;
		anInt1607 = class132_0_.anInt1607;
		anInt1603 = class132_0_.anInt1603;
		anInt1605 = class132_0_.anInt1605;
	}

	Class132 method1684() {
		return new Class132(anInt1603, anInt1608, anInt1604, anInt1606, anInt1607, anInt1605);
	}

	Class132(int i) {
		anInt1604 = 128;
		anInt1603 = i;
	}

	Class132(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		anInt1604 = 128;
		anInt1603 = i;
		anInt1608 = i_1_;
		anInt1604 = i_2_;
		anInt1606 = i_3_;
		anInt1607 = i_4_;
		anInt1605 = i_5_;
	}
}
