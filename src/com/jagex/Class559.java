/* Class559 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class559 {
	int anInt7528;
	int anInt7529;
	int anInt7530;
	int anInt7531;
	int anInt7532;
	int anInt7533;
	int anInt7534;
	int anInt7535;
	int anInt7536;
	int anInt7537;

	Class559(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		anInt7530 = i;
		anInt7533 = i_0_;
		anInt7529 = i_1_;
		anInt7532 = i_2_ * i_2_;
		anInt7528 = anInt7530 + i_3_;
		anInt7531 = anInt7530 + i_4_;
		anInt7534 = anInt7533 + i_5_;
		anInt7535 = anInt7533 + i_6_;
		anInt7536 = anInt7529 + i_7_;
		anInt7537 = anInt7529 + i_8_;
	}

	void method6819(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
		anInt7530 = i;
		anInt7533 = i_9_;
		anInt7529 = i_10_;
		anInt7532 = i_11_ * i_11_;
		anInt7528 = anInt7530 + i_12_;
		anInt7531 = anInt7530 + i_13_;
		anInt7534 = anInt7533 + i_14_;
		anInt7535 = anInt7533 + i_15_;
		anInt7536 = anInt7529 + i_16_;
		anInt7537 = anInt7529 + i_17_;
	}

	public boolean method6820(int i, int i_18_, int i_19_) {
		if (i < anInt7528 || i > anInt7531)
			return false;
		if (i_18_ < anInt7534 || i_18_ > anInt7535)
			return false;
		if (i_19_ < anInt7536 || i_19_ > anInt7537)
			return false;
		int i_20_ = i - anInt7530;
		int i_21_ = i_19_ - anInt7529;
		return i_20_ * i_20_ + i_21_ * i_21_ < anInt7532;
	}

	public boolean method6821(int i, int i_22_, int i_23_) {
		if (i < anInt7528 || i > anInt7531)
			return false;
		if (i_22_ < anInt7534 || i_22_ > anInt7535)
			return false;
		if (i_23_ < anInt7536 || i_23_ > anInt7537)
			return false;
		int i_24_ = i - anInt7530;
		int i_25_ = i_23_ - anInt7529;
		return i_24_ * i_24_ + i_25_ * i_25_ < anInt7532;
	}
}
