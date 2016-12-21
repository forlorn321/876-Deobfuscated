/* Class178 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class178 {
	public int anInt1940;
	public int anInt1941;
	public int anInt1942;
	public int anInt1943;
	public int anInt1944;
	public boolean aBool1945 = false;

	public void method2627(Class437 class437, Class443 class443, Class443 class443_0_, float f, float f_1_, float f_2_, float f_3_) {
		boolean bool = false;
		aBool1945 = true;
		int i = (int) (class437.aFloat4859 + class437.aFloat4858) >> 1;
		int i_4_ = (int) (class437.aFloat4856 + class437.aFloat4854) >> 1;
		int i_5_ = i;
		int i_6_ = (int) class437.aFloat4855;
		int i_7_ = i_4_;
		float f_8_ = (class443_0_.aFloatArray4878[0] * (float) i_5_ + class443_0_.aFloatArray4878[4] * (float) i_6_ + class443_0_.aFloatArray4878[8] * (float) i_7_ + class443_0_.aFloatArray4878[12]);
		float f_9_ = (class443_0_.aFloatArray4878[1] * (float) i_5_ + class443_0_.aFloatArray4878[5] * (float) i_6_ + class443_0_.aFloatArray4878[9] * (float) i_7_ + class443_0_.aFloatArray4878[13]);
		float f_10_ = (class443_0_.aFloatArray4878[2] * (float) i_5_ + class443_0_.aFloatArray4878[6] * (float) i_6_ + class443_0_.aFloatArray4878[10] * (float) i_7_ + class443_0_.aFloatArray4878[14]);
		float f_11_ = (class443_0_.aFloatArray4878[3] * (float) i_5_ + class443_0_.aFloatArray4878[7] * (float) i_6_ + class443_0_.aFloatArray4878[11] * (float) i_7_ + class443_0_.aFloatArray4878[15]);
		if (f_10_ >= -f_11_) {
			anInt1941 = (int) (f + f_2_ * f_8_ / f_11_);
			anInt1942 = (int) (f_1_ + f_3_ * f_9_ / f_11_);
		} else
			bool = true;
		i_5_ = i;
		i_6_ = (int) class437.aFloat4857;
		i_7_ = i_4_;
		float f_12_ = (class443_0_.aFloatArray4878[0] * (float) i_5_ + class443_0_.aFloatArray4878[4] * (float) i_6_ + class443_0_.aFloatArray4878[8] * (float) i_7_ + class443_0_.aFloatArray4878[12]);
		float f_13_ = (class443_0_.aFloatArray4878[1] * (float) i_5_ + class443_0_.aFloatArray4878[5] * (float) i_6_ + class443_0_.aFloatArray4878[9] * (float) i_7_ + class443_0_.aFloatArray4878[13]);
		float f_14_ = (class443_0_.aFloatArray4878[2] * (float) i_5_ + class443_0_.aFloatArray4878[6] * (float) i_6_ + class443_0_.aFloatArray4878[10] * (float) i_7_ + class443_0_.aFloatArray4878[14]);
		float f_15_ = (class443_0_.aFloatArray4878[3] * (float) i_5_ + class443_0_.aFloatArray4878[7] * (float) i_6_ + class443_0_.aFloatArray4878[11] * (float) i_7_ + class443_0_.aFloatArray4878[15]);
		if (f_14_ >= -f_15_) {
			anInt1943 = (int) (f + f_2_ * f_12_ / f_15_);
			anInt1944 = (int) (f_1_ + f_3_ * f_13_ / f_15_);
		} else
			bool = true;
		if (bool) {
			if (f_10_ < -f_11_ && f_14_ < -f_15_)
				aBool1945 = false;
			else if (f_10_ < -f_11_) {
				float f_16_ = (f_10_ + f_11_) / (f_14_ + f_15_) - 1.0F;
				float f_17_ = f_8_ + f_16_ * (f_12_ - f_8_);
				float f_18_ = f_9_ + f_16_ * (f_13_ - f_9_);
				float f_19_ = f_11_ + f_16_ * (f_15_ - f_11_);
				anInt1941 = (int) (f + f_2_ * f_17_ / f_19_);
				anInt1942 = (int) (f_1_ + f_3_ * f_18_ / f_19_);
			} else if (f_14_ < -f_15_) {
				float f_20_ = (f_14_ + f_15_) / (f_10_ + f_11_) - 1.0F;
				float f_21_ = f_12_ + f_20_ * (f_8_ - f_12_);
				float f_22_ = f_13_ + f_20_ * (f_9_ - f_13_);
				float f_23_ = f_15_ + f_20_ * (f_11_ - f_15_);
				anInt1943 = (int) (f + f_2_ * f_21_ / f_23_);
				anInt1944 = (int) (f_1_ + f_3_ * f_22_ / f_23_);
			}
		}
		if (aBool1945) {
			float f_24_ = ((float) Math.sqrt(Math.pow((double) (class437.aFloat4858 - class437.aFloat4859), 2.0) + Math.pow((double) (class437.aFloat4854 - (class437.aFloat4856)), 2.0)) / 2.0F);
			if (f_10_ / f_11_ > f_14_ / f_15_) {
				float f_25_ = (f_8_ + class443.aFloatArray4878[0] * f_24_ + class443.aFloatArray4878[12]);
				float f_26_ = (f_11_ + class443.aFloatArray4878[3] * f_24_ + class443.aFloatArray4878[15]);
				anInt1940 = (int) (f - (float) anInt1941 + f_2_ * f_25_ / f_26_);
			} else {
				float f_27_ = (f_12_ + class443.aFloatArray4878[0] * f_24_ + class443.aFloatArray4878[12]);
				float f_28_ = (f_15_ + class443.aFloatArray4878[3] * f_24_ + class443.aFloatArray4878[15]);
				anInt1940 = (int) (f - (float) anInt1943 + f_2_ * f_27_ / f_28_);
			}
			aBool1945 = true;
		}
	}

	public boolean method2628(int i, int i_29_) {
		if (!aBool1945)
			return false;
		int i_30_ = anInt1943 - anInt1941;
		int i_31_ = anInt1944 - anInt1942;
		int i_32_ = i_30_ * i_30_ + i_31_ * i_31_;
		int i_33_ = (i * i_30_ + i_29_ * i_31_ - (anInt1941 * i_30_ + anInt1942 * i_31_));
		if (i_33_ <= 0) {
			int i_34_ = anInt1941 - i;
			int i_35_ = anInt1942 - i_29_;
			return i_34_ * i_34_ + i_35_ * i_35_ < anInt1940 * anInt1940;
		}
		if (i_33_ > i_32_) {
			int i_36_ = anInt1943 - i;
			int i_37_ = anInt1944 - i_29_;
			return i_36_ * i_36_ + i_37_ * i_37_ < anInt1940 * anInt1940;
		}
		int i_38_ = 10;
		if (i_33_ != (i_33_ & 0x1fffff))
			i_38_ = 5;
		i_33_ = (i_33_ << i_38_) / i_32_;
		int i_39_ = anInt1941 + (i_30_ * i_33_ >> i_38_) - i;
		int i_40_ = anInt1942 + (i_31_ * i_33_ >> i_38_) - i_29_;
		return i_39_ * i_39_ + i_40_ * i_40_ < anInt1940 * anInt1940;
	}

	public boolean method2629(int i, int i_41_) {
		if (!aBool1945)
			return false;
		int i_42_ = anInt1943 - anInt1941;
		int i_43_ = anInt1944 - anInt1942;
		int i_44_ = i_42_ * i_42_ + i_43_ * i_43_;
		int i_45_ = (i * i_42_ + i_41_ * i_43_ - (anInt1941 * i_42_ + anInt1942 * i_43_));
		if (i_45_ <= 0) {
			int i_46_ = anInt1941 - i;
			int i_47_ = anInt1942 - i_41_;
			return i_46_ * i_46_ + i_47_ * i_47_ < anInt1940 * anInt1940;
		}
		if (i_45_ > i_44_) {
			int i_48_ = anInt1943 - i;
			int i_49_ = anInt1944 - i_41_;
			return i_48_ * i_48_ + i_49_ * i_49_ < anInt1940 * anInt1940;
		}
		int i_50_ = 10;
		if (i_45_ != (i_45_ & 0x1fffff))
			i_50_ = 5;
		i_45_ = (i_45_ << i_50_) / i_44_;
		int i_51_ = anInt1941 + (i_42_ * i_45_ >> i_50_) - i;
		int i_52_ = anInt1942 + (i_43_ * i_45_ >> i_50_) - i_41_;
		return i_51_ * i_51_ + i_52_ * i_52_ < anInt1940 * anInt1940;
	}
}
