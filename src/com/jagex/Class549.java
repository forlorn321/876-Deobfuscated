/* Class549 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class549 {
	int anInt7276;
	int anInt7277;
	int anInt7278;
	int anInt7279;
	int anInt7280;
	int anInt7281;
	int anInt7282;
	int anInt7283;
	int anInt7284;
	int anInt7285;

	void method9095(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		anInt7276 = i;
		anInt7277 = i_0_;
		anInt7278 = i_1_;
		anInt7281 = i_2_ * i_2_;
		anInt7280 = anInt7276 + i_3_;
		anInt7284 = anInt7276 + i_4_;
		anInt7282 = anInt7277 + i_5_;
		anInt7283 = anInt7277 + i_6_;
		anInt7279 = anInt7278 + i_7_;
		anInt7285 = anInt7278 + i_8_;
	}

	public boolean method9096(int i, int i_9_, int i_10_) {
		if (i < anInt7280 || i > anInt7284)
			return false;
		if (i_9_ < anInt7282 || i_9_ > anInt7283)
			return false;
		if (i_10_ < anInt7279 || i_10_ > anInt7285)
			return false;
		int i_11_ = i - anInt7276;
		int i_12_ = i_10_ - anInt7278;
		return i_11_ * i_11_ + i_12_ * i_12_ < anInt7281;
	}

	public boolean method9097(int i, int i_13_, int i_14_) {
		if (i < anInt7280 || i > anInt7284)
			return false;
		if (i_13_ < anInt7282 || i_13_ > anInt7283)
			return false;
		if (i_14_ < anInt7279 || i_14_ > anInt7285)
			return false;
		int i_15_ = i - anInt7276;
		int i_16_ = i_14_ - anInt7278;
		return i_15_ * i_15_ + i_16_ * i_16_ < anInt7281;
	}

	public boolean method9098(int i, int i_17_, int i_18_) {
		if (i < anInt7280 || i > anInt7284)
			return false;
		if (i_17_ < anInt7282 || i_17_ > anInt7283)
			return false;
		if (i_18_ < anInt7279 || i_18_ > anInt7285)
			return false;
		int i_19_ = i - anInt7276;
		int i_20_ = i_18_ - anInt7278;
		return i_19_ * i_19_ + i_20_ * i_20_ < anInt7281;
	}

	Class549(int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_) {
		anInt7276 = i;
		anInt7277 = i_21_;
		anInt7278 = i_22_;
		anInt7281 = i_23_ * i_23_;
		anInt7280 = anInt7276 + i_24_;
		anInt7284 = anInt7276 + i_25_;
		anInt7282 = anInt7277 + i_26_;
		anInt7283 = anInt7277 + i_27_;
		anInt7279 = anInt7278 + i_28_;
		anInt7285 = anInt7278 + i_29_;
	}
}
