/* Class434 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class434 {
	float aFloat4871;
	Class442[] aClass442Array4872 = new Class442[4];
	float[] aFloatArray4873;

	Class434() {
		for (int i = 0; i < 4; i++)
			aClass442Array4872[i] = new Class442();
		method6972();
	}

	float method6967() {
		if (aFloat4871 == -1.0F)
			method6973();
		return aFloat4871;
	}

	void method6968(int i, Class442 class442) {
		aClass442Array4872[i].method7146(class442);
		method6972();
	}

	Class442 method6969(int i) {
		return aClass442Array4872[i];
	}

	double[] method6970(float f) {
		double[] ds = new double[3];
		float f_0_ = f * f;
		float f_1_ = f_0_ * f;
		double d = (double) (3.0F * (aClass442Array4872[1].aFloat4918 - aClass442Array4872[0].aFloat4918));
		double d_2_ = ((double) (3.0F * (aClass442Array4872[2].aFloat4918 - aClass442Array4872[1].aFloat4918)) - d);
		double d_3_ = ((double) (aClass442Array4872[3].aFloat4918 - aClass442Array4872[0].aFloat4918) - d - d_2_);
		ds[0] = (d_3_ * (double) f_1_ + d_2_ * (double) f_0_ + d * (double) f + (double) aClass442Array4872[0].aFloat4918);
		d = (double) (3.0F * (aClass442Array4872[1].aFloat4915 - aClass442Array4872[0].aFloat4915));
		d_2_ = (double) (3.0F * (aClass442Array4872[2].aFloat4915 - aClass442Array4872[1].aFloat4915)) - d;
		d_3_ = (double) (aClass442Array4872[3].aFloat4915 - aClass442Array4872[0].aFloat4915) - d - d_2_;
		ds[1] = (d_3_ * (double) f_1_ + d_2_ * (double) f_0_ + d * (double) f + (double) aClass442Array4872[0].aFloat4915);
		d = (double) (3.0F * (aClass442Array4872[1].aFloat4919 - aClass442Array4872[0].aFloat4919));
		d_2_ = (double) (3.0F * (aClass442Array4872[2].aFloat4919 - aClass442Array4872[1].aFloat4919)) - d;
		d_3_ = (double) (aClass442Array4872[3].aFloat4919 - aClass442Array4872[0].aFloat4919) - d - d_2_;
		ds[2] = (d_3_ * (double) f_1_ + d_2_ * (double) f_0_ + d * (double) f + (double) aClass442Array4872[0].aFloat4919);
		return ds;
	}

	float method6971(float f) {
		if (aFloat4871 == -1.0F)
			method6973();
		if (f <= 0.0F)
			return 0.0F;
		if (f >= aFloat4871)
			return 1.0F;
		float f_4_ = 0.0F;
		float f_5_ = aFloatArray4873[0];
		for (int i = 1; i < aFloatArray4873.length; i++) {
			if (f < f_5_) {
				float f_6_ = (f - f_4_) / (f_5_ - f_4_);
				float f_7_ = (float) (i - 1) / (float) aFloatArray4873.length;
				float f_8_ = (float) i / (float) aFloatArray4873.length;
				return f_7_ + (f_8_ - f_7_) * f_6_;
			}
			f_4_ = f_5_;
			f_5_ += aFloatArray4873[i];
		}
		float f_9_ = (f - f_4_) / (f_5_ - f_4_);
		float f_10_ = ((float) (aFloatArray4873.length - 1) / (float) aFloatArray4873.length);
		return f_10_ + (1.0F - f_10_) * f_9_;
	}

	void method6972() {
		aFloat4871 = -1.0F;
		aFloatArray4873 = null;
	}

	void method6973() {
		int i = 20;
		double[] ds = method6970(0.0F);
		float f = 0.0F;
		Class442 class442 = Class442.method7137();
		for (int i_11_ = 1; i_11_ <= i; i_11_++) {
			double[] ds_12_ = method6970((float) i_11_ / (float) i);
			class442.aFloat4918 = (float) (ds_12_[0] - ds[0]);
			class442.aFloat4915 = (float) (ds_12_[1] - ds[1]);
			class442.aFloat4919 = (float) (ds_12_[2] - ds[2]);
			f += class442.method7160();
			ds = ds_12_;
		}
		int i_13_ = (int) (f / 20.0F);
		if (i_13_ < i)
			i_13_ = i;
		aFloatArray4873 = new float[i_13_];
		ds = method6970(0.0F);
		float f_14_ = 0.0F;
		for (int i_15_ = 1; i_15_ <= i_13_; i_15_++) {
			double[] ds_16_ = method6970((float) i_15_ / (float) i_13_);
			class442.aFloat4918 = (float) (ds_16_[0] - ds[0]);
			class442.aFloat4915 = (float) (ds_16_[1] - ds[1]);
			class442.aFloat4919 = (float) (ds_16_[2] - ds[2]);
			float f_17_ = class442.method7160();
			f_14_ += f_17_;
			aFloatArray4873[i_15_ - 1] = f_17_;
			ds = ds_16_;
		}
		aFloat4871 = f_14_;
	}

	void method6974() {
		aFloat4871 = -1.0F;
		aFloatArray4873 = null;
	}

	void method6975() {
		aFloat4871 = -1.0F;
		aFloatArray4873 = null;
	}

	void method6976() {
		aFloat4871 = -1.0F;
		aFloatArray4873 = null;
	}

	void method6977(int i, Class442 class442) {
		aClass442Array4872[i].method7146(class442);
		method6972();
	}

	void method6978(int i, Class442 class442) {
		aClass442Array4872[i].method7146(class442);
		method6972();
	}

	Class442 method6979(int i) {
		return aClass442Array4872[i];
	}

	double[] method6980(float f) {
		double[] ds = new double[3];
		float f_18_ = f * f;
		float f_19_ = f_18_ * f;
		double d = (double) (3.0F * (aClass442Array4872[1].aFloat4918 - aClass442Array4872[0].aFloat4918));
		double d_20_ = ((double) (3.0F * (aClass442Array4872[2].aFloat4918 - aClass442Array4872[1].aFloat4918)) - d);
		double d_21_ = ((double) (aClass442Array4872[3].aFloat4918 - aClass442Array4872[0].aFloat4918) - d - d_20_);
		ds[0] = (d_21_ * (double) f_19_ + d_20_ * (double) f_18_ + d * (double) f + (double) aClass442Array4872[0].aFloat4918);
		d = (double) (3.0F * (aClass442Array4872[1].aFloat4915 - aClass442Array4872[0].aFloat4915));
		d_20_ = (double) (3.0F * (aClass442Array4872[2].aFloat4915 - aClass442Array4872[1].aFloat4915)) - d;
		d_21_ = (double) (aClass442Array4872[3].aFloat4915 - aClass442Array4872[0].aFloat4915) - d - d_20_;
		ds[1] = (d_21_ * (double) f_19_ + d_20_ * (double) f_18_ + d * (double) f + (double) aClass442Array4872[0].aFloat4915);
		d = (double) (3.0F * (aClass442Array4872[1].aFloat4919 - aClass442Array4872[0].aFloat4919));
		d_20_ = (double) (3.0F * (aClass442Array4872[2].aFloat4919 - aClass442Array4872[1].aFloat4919)) - d;
		d_21_ = (double) (aClass442Array4872[3].aFloat4919 - aClass442Array4872[0].aFloat4919) - d - d_20_;
		ds[2] = (d_21_ * (double) f_19_ + d_20_ * (double) f_18_ + d * (double) f + (double) aClass442Array4872[0].aFloat4919);
		return ds;
	}

	float method6981() {
		if (aFloat4871 == -1.0F)
			method6973();
		return aFloat4871;
	}

	float method6982() {
		if (aFloat4871 == -1.0F)
			method6973();
		return aFloat4871;
	}

	float method6983(float f) {
		if (aFloat4871 == -1.0F)
			method6973();
		if (f <= 0.0F)
			return 0.0F;
		if (f >= aFloat4871)
			return 1.0F;
		float f_22_ = 0.0F;
		float f_23_ = aFloatArray4873[0];
		for (int i = 1; i < aFloatArray4873.length; i++) {
			if (f < f_23_) {
				float f_24_ = (f - f_22_) / (f_23_ - f_22_);
				float f_25_ = (float) (i - 1) / (float) aFloatArray4873.length;
				float f_26_ = (float) i / (float) aFloatArray4873.length;
				return f_25_ + (f_26_ - f_25_) * f_24_;
			}
			f_22_ = f_23_;
			f_23_ += aFloatArray4873[i];
		}
		float f_27_ = (f - f_22_) / (f_23_ - f_22_);
		float f_28_ = ((float) (aFloatArray4873.length - 1) / (float) aFloatArray4873.length);
		return f_28_ + (1.0F - f_28_) * f_27_;
	}

	void method6984() {
		int i = 20;
		double[] ds = method6970(0.0F);
		float f = 0.0F;
		Class442 class442 = Class442.method7137();
		for (int i_29_ = 1; i_29_ <= i; i_29_++) {
			double[] ds_30_ = method6970((float) i_29_ / (float) i);
			class442.aFloat4918 = (float) (ds_30_[0] - ds[0]);
			class442.aFloat4915 = (float) (ds_30_[1] - ds[1]);
			class442.aFloat4919 = (float) (ds_30_[2] - ds[2]);
			f += class442.method7160();
			ds = ds_30_;
		}
		int i_31_ = (int) (f / 20.0F);
		if (i_31_ < i)
			i_31_ = i;
		aFloatArray4873 = new float[i_31_];
		ds = method6970(0.0F);
		float f_32_ = 0.0F;
		for (int i_33_ = 1; i_33_ <= i_31_; i_33_++) {
			double[] ds_34_ = method6970((float) i_33_ / (float) i_31_);
			class442.aFloat4918 = (float) (ds_34_[0] - ds[0]);
			class442.aFloat4915 = (float) (ds_34_[1] - ds[1]);
			class442.aFloat4919 = (float) (ds_34_[2] - ds[2]);
			float f_35_ = class442.method7160();
			f_32_ += f_35_;
			aFloatArray4873[i_33_ - 1] = f_35_;
			ds = ds_34_;
		}
		aFloat4871 = f_32_;
	}
}
