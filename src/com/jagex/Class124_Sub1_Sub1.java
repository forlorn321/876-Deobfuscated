/* Class124_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class124_Sub1_Sub1 extends Class124_Sub1 {
	boolean aBool11360;
	int anInt11361;
	float aFloat11362;
	float aFloat11363;
	boolean aBool11364;
	int anInt11365;

	Class124_Sub1_Sub1(Class167_Sub2 class167_sub2, int i, int i_0_, int i_1_, int i_2_, int i_3_, boolean bool) {
		super(class167_sub2, i, i_0_, i_1_, i_2_, i_3_);
		anInt11361 = i_2_;
		anInt11365 = i_3_;
		if (anInt1496 == 34037) {
			aFloat11362 = (float) i_3_;
			aFloat11363 = (float) i_2_;
			aBool11364 = false;
		} else {
			aFloat11362 = 1.0F;
			aFloat11363 = 1.0F;
			aBool11364 = true;
		}
		aBool11360 = false;
	}

	static Class124_Sub1_Sub1 method10527(Class167_Sub2 class167_sub2, int i, int i_4_, boolean bool, int[] is, int i_5_, int i_6_) {
		if (class167_sub2.aBool9244 || (Class29.method777(i, (short) 16383) && Class29.method777(i_4_, (short) 16383)))
			return new Class124_Sub1_Sub1(class167_sub2, 3553, i, i_4_, bool, is, i_5_, i_6_);
		if (class167_sub2.aBool9300)
			return new Class124_Sub1_Sub1(class167_sub2, 34037, i, i_4_, bool, is, i_5_, i_6_);
		return new Class124_Sub1_Sub1(class167_sub2, i, i_4_, Class528.method6434(i, -1081767380), Class528.method6434(i_4_, -447633725), is);
	}

	static Class124_Sub1_Sub1 method10528(Class167_Sub2 class167_sub2, Class155 class155, Class171 class171, int i, int i_7_, boolean bool, byte[] is, Class155 class155_8_) {
		if (class167_sub2.aBool9244 || (Class29.method777(i, (short) 16383) && Class29.method777(i_7_, (short) 16383)))
			return new Class124_Sub1_Sub1(class167_sub2, 3553, class155, class171, i, i_7_, bool, is, class155_8_);
		if (class167_sub2.aBool9300)
			return new Class124_Sub1_Sub1(class167_sub2, 34037, class155, class171, i, i_7_, bool, is, class155_8_);
		return new Class124_Sub1_Sub1(class167_sub2, class155, class171, i, i_7_, Class528.method6434(i, -1937681698), Class528.method6434(i_7_, -639546135), is, class155_8_);
	}

	static Class124_Sub1_Sub1 method10529(Class167_Sub2 class167_sub2, int i, int i_9_, int i_10_, int i_11_) {
		if (class167_sub2.aBool9244 || (Class29.method777(i_10_, (short) 16383) && Class29.method777(i_11_, (short) 16383)))
			return new Class124_Sub1_Sub1(class167_sub2, 3553, i, i_9_, i_10_, i_11_, true);
		if (class167_sub2.aBool9300)
			return new Class124_Sub1_Sub1(class167_sub2, 34037, i, i_9_, i_10_, i_11_, true);
		return new Class124_Sub1_Sub1(class167_sub2, i, i_9_, i_10_, i_11_, Class528.method6434(i_10_, -475050517), Class528.method6434(i_11_, -1009160341), true);
	}

	Class124_Sub1_Sub1(Class167_Sub2 class167_sub2, int i, Class155 class155, Class171 class171, int i_12_, int i_13_) {
		super(class167_sub2, i, class155, class171, i_12_, i_13_);
		anInt11361 = i_12_;
		anInt11365 = i_13_;
		if (anInt1496 == 34037) {
			aFloat11362 = (float) i_13_;
			aFloat11363 = (float) i_12_;
			aBool11364 = false;
		} else {
			aFloat11362 = 1.0F;
			aFloat11363 = 1.0F;
			aBool11364 = true;
		}
		aBool11360 = false;
	}

	Class124_Sub1_Sub1(Class167_Sub2 class167_sub2, int i, int i_14_, int i_15_, boolean bool, int[] is, int i_16_, int i_17_) {
		super(class167_sub2, i, i_14_, i_15_, bool, is, i_16_, i_17_, true);
		anInt11361 = i_14_;
		anInt11365 = i_15_;
		if (anInt1496 == 34037) {
			aFloat11362 = (float) i_15_;
			aFloat11363 = (float) i_14_;
			aBool11364 = false;
		} else {
			aFloat11362 = 1.0F;
			aFloat11363 = 1.0F;
			aBool11364 = true;
		}
		aBool11360 = false;
	}

	Class124_Sub1_Sub1(Class167_Sub2 class167_sub2, int i, Class155 class155, Class171 class171, int i_18_, int i_19_, boolean bool, byte[] is, Class155 class155_20_) {
		super(class167_sub2, i, class155, class171, i_18_, i_19_, bool, is, class155_20_, true);
		anInt11361 = i_18_;
		anInt11365 = i_19_;
		if (anInt1496 == 34037) {
			aFloat11362 = (float) i_19_;
			aFloat11363 = (float) i_18_;
			aBool11364 = false;
		} else {
			aFloat11362 = 1.0F;
			aFloat11363 = 1.0F;
			aBool11364 = true;
		}
		aBool11360 = false;
	}

	Class124_Sub1_Sub1(Class167_Sub2 class167_sub2, int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, boolean bool) {
		super(class167_sub2, 3553, i, i_21_, i_24_, i_25_);
		anInt11361 = i_22_;
		anInt11365 = i_23_;
		aFloat11362 = (float) i_23_ / (float) i_25_;
		aFloat11363 = (float) i_22_ / (float) i_24_;
		aBool11364 = false;
		aBool11360 = true;
		method8394(false, false);
	}

	Class124_Sub1_Sub1(Class167_Sub2 class167_sub2, int i, int i_26_, int i_27_, int i_28_, int[] is) {
		super(class167_sub2, 3553, Class155.aClass155_1722, Class171.aClass171_1905, i_27_, i_28_);
		anInt11361 = i;
		anInt11365 = i_26_;
		method8397(0, i_28_ - i_26_, i, i_26_, is, 0, 0, true);
		aFloat11362 = (float) i_26_ / (float) i_28_;
		aFloat11363 = (float) i / (float) i_27_;
		aBool11364 = false;
		aBool11360 = true;
		method8394(false, false);
	}

	void method1621(boolean bool) {
		super.method1609(bool && !aBool11360);
	}

	static Class124_Sub1_Sub1 method10530(Class167_Sub2 class167_sub2, Class155 class155, Class171 class171, int i, int i_29_) {
		if (class167_sub2.aBool9244 || (Class29.method777(i, (short) 16383) && Class29.method777(i_29_, (short) 16383)))
			return new Class124_Sub1_Sub1(class167_sub2, 3553, class155, class171, i, i_29_);
		if (class167_sub2.aBool9300)
			return new Class124_Sub1_Sub1(class167_sub2, 34037, class155, class171, i, i_29_);
		return new Class124_Sub1_Sub1(class167_sub2, class155, class171, i, i_29_, Class528.method6434(i, -207299970), Class528.method6434(i_29_, -1190978814));
	}

	void method1609(boolean bool) {
		super.method1609(bool && !aBool11360);
	}

	Class124_Sub1_Sub1(Class167_Sub2 class167_sub2, Class155 class155, Class171 class171, int i, int i_30_, int i_31_, int i_32_) {
		super(class167_sub2, 3553, class155, class171, i_31_, i_32_);
		anInt11361 = i;
		anInt11365 = i_30_;
		aFloat11362 = (float) i_30_ / (float) i_32_;
		aFloat11363 = (float) i / (float) i_31_;
		aBool11364 = false;
		aBool11360 = true;
		method8394(false, false);
	}

	Class124_Sub1_Sub1(Class167_Sub2 class167_sub2, Class155 class155, Class171 class171, int i, int i_33_, int i_34_, int i_35_, byte[] is, Class155 class155_36_) {
		super(class167_sub2, 3553, class155, class171, i_34_, i_35_);
		anInt11361 = i;
		anInt11365 = i_33_;
		method8395(0, i_35_ - i_33_, i, i_33_, is, class155_36_, 0, 0, true);
		aFloat11362 = (float) i_33_ / (float) i_35_;
		aFloat11363 = (float) i / (float) i_34_;
		aBool11364 = false;
		aBool11360 = true;
		method8394(false, false);
	}
}
