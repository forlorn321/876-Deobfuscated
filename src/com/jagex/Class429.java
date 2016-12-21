/* Class429 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class429 {
	float aFloat4816;
	float[] aFloatArray4817;
	Class436[] aClass436Array4818 = new Class436[4];

	float method5148() {
		if (aFloat4816 == -1.0F)
			method5154();
		return aFloat4816;
	}

	void method5149() {
		aFloat4816 = -1.0F;
		aFloatArray4817 = null;
	}

	void method5150(int i, Class436 class436) {
		aClass436Array4818[i].method5272(class436);
		method5149();
	}

	Class436 method5151(int i) {
		return aClass436Array4818[i];
	}

	double[] method5152(float f) {
		double[] ds = new double[3];
		float f_0_ = f * f;
		float f_1_ = f_0_ * f;
		double d = (double) (3.0F * (aClass436Array4818[1].aFloat4850 - aClass436Array4818[0].aFloat4850));
		double d_2_ = ((double) (3.0F * (aClass436Array4818[2].aFloat4850 - aClass436Array4818[1].aFloat4850)) - d);
		double d_3_ = ((double) (aClass436Array4818[3].aFloat4850 - aClass436Array4818[0].aFloat4850) - d - d_2_);
		ds[0] = (d_3_ * (double) f_1_ + d_2_ * (double) f_0_ + d * (double) f + (double) aClass436Array4818[0].aFloat4850);
		d = (double) (3.0F * (aClass436Array4818[1].aFloat4852 - aClass436Array4818[0].aFloat4852));
		d_2_ = (double) (3.0F * (aClass436Array4818[2].aFloat4852 - aClass436Array4818[1].aFloat4852)) - d;
		d_3_ = (double) (aClass436Array4818[3].aFloat4852 - aClass436Array4818[0].aFloat4852) - d - d_2_;
		ds[1] = (d_3_ * (double) f_1_ + d_2_ * (double) f_0_ + d * (double) f + (double) aClass436Array4818[0].aFloat4852);
		d = (double) (3.0F * (aClass436Array4818[1].aFloat4853 - aClass436Array4818[0].aFloat4853));
		d_2_ = (double) (3.0F * (aClass436Array4818[2].aFloat4853 - aClass436Array4818[1].aFloat4853)) - d;
		d_3_ = (double) (aClass436Array4818[3].aFloat4853 - aClass436Array4818[0].aFloat4853) - d - d_2_;
		ds[2] = (d_3_ * (double) f_1_ + d_2_ * (double) f_0_ + d * (double) f + (double) aClass436Array4818[0].aFloat4853);
		return ds;
	}

	Class429() {
		for (int i = 0; i < 4; i++)
			aClass436Array4818[i] = new Class436();
		method5149();
	}

	float method5153(float f) {
		if (aFloat4816 == -1.0F)
			method5154();
		if (f <= 0.0F)
			return 0.0F;
		if (f >= aFloat4816)
			return 1.0F;
		float f_4_ = 0.0F;
		float f_5_ = aFloatArray4817[0];
		for (int i = 1; i < aFloatArray4817.length; i++) {
			if (f < f_5_) {
				float f_6_ = (f - f_4_) / (f_5_ - f_4_);
				float f_7_ = (float) (i - 1) / (float) aFloatArray4817.length;
				float f_8_ = (float) i / (float) aFloatArray4817.length;
				return f_7_ + (f_8_ - f_7_) * f_6_;
			}
			f_4_ = f_5_;
			f_5_ += aFloatArray4817[i];
		}
		float f_9_ = (f - f_4_) / (f_5_ - f_4_);
		float f_10_ = ((float) (aFloatArray4817.length - 1) / (float) aFloatArray4817.length);
		return f_10_ + (1.0F - f_10_) * f_9_;
	}

	void method5154() {
		int i = 20;
		double[] ds = method5152(0.0F);
		float f = 0.0F;
		Class436 class436 = Class436.method5238();
		for (int i_11_ = 1; i_11_ <= i; i_11_++) {
			double[] ds_12_ = method5152((float) i_11_ / (float) i);
			class436.aFloat4850 = (float) (ds_12_[0] - ds[0]);
			class436.aFloat4852 = (float) (ds_12_[1] - ds[1]);
			class436.aFloat4853 = (float) (ds_12_[2] - ds[2]);
			f += class436.method5291();
			ds = ds_12_;
		}
		int i_13_ = (int) (f / 20.0F);
		if (i_13_ < i)
			i_13_ = i;
		aFloatArray4817 = new float[i_13_];
		ds = method5152(0.0F);
		float f_14_ = 0.0F;
		for (int i_15_ = 1; i_15_ <= i_13_; i_15_++) {
			double[] ds_16_ = method5152((float) i_15_ / (float) i_13_);
			class436.aFloat4850 = (float) (ds_16_[0] - ds[0]);
			class436.aFloat4852 = (float) (ds_16_[1] - ds[1]);
			class436.aFloat4853 = (float) (ds_16_[2] - ds[2]);
			float f_17_ = class436.method5291();
			f_14_ += f_17_;
			aFloatArray4817[i_15_ - 1] = f_17_;
			ds = ds_16_;
		}
		aFloat4816 = f_14_;
	}

	void method5155() {
		aFloat4816 = -1.0F;
		aFloatArray4817 = null;
	}

	void method5156() {
		aFloat4816 = -1.0F;
		aFloatArray4817 = null;
	}

	float method5157() {
		if (aFloat4816 == -1.0F)
			method5154();
		return aFloat4816;
	}

	float method5158() {
		if (aFloat4816 == -1.0F)
			method5154();
		return aFloat4816;
	}

	void method5159() {
		int i = 20;
		double[] ds = method5152(0.0F);
		float f = 0.0F;
		Class436 class436 = Class436.method5238();
		for (int i_18_ = 1; i_18_ <= i; i_18_++) {
			double[] ds_19_ = method5152((float) i_18_ / (float) i);
			class436.aFloat4850 = (float) (ds_19_[0] - ds[0]);
			class436.aFloat4852 = (float) (ds_19_[1] - ds[1]);
			class436.aFloat4853 = (float) (ds_19_[2] - ds[2]);
			f += class436.method5291();
			ds = ds_19_;
		}
		int i_20_ = (int) (f / 20.0F);
		if (i_20_ < i)
			i_20_ = i;
		aFloatArray4817 = new float[i_20_];
		ds = method5152(0.0F);
		float f_21_ = 0.0F;
		for (int i_22_ = 1; i_22_ <= i_20_; i_22_++) {
			double[] ds_23_ = method5152((float) i_22_ / (float) i_20_);
			class436.aFloat4850 = (float) (ds_23_[0] - ds[0]);
			class436.aFloat4852 = (float) (ds_23_[1] - ds[1]);
			class436.aFloat4853 = (float) (ds_23_[2] - ds[2]);
			float f_24_ = class436.method5291();
			f_21_ += f_24_;
			aFloatArray4817[i_22_ - 1] = f_24_;
			ds = ds_23_;
		}
		aFloat4816 = f_21_;
	}

	void method5160() {
		int i = 20;
		double[] ds = method5152(0.0F);
		float f = 0.0F;
		Class436 class436 = Class436.method5238();
		for (int i_25_ = 1; i_25_ <= i; i_25_++) {
			double[] ds_26_ = method5152((float) i_25_ / (float) i);
			class436.aFloat4850 = (float) (ds_26_[0] - ds[0]);
			class436.aFloat4852 = (float) (ds_26_[1] - ds[1]);
			class436.aFloat4853 = (float) (ds_26_[2] - ds[2]);
			f += class436.method5291();
			ds = ds_26_;
		}
		int i_27_ = (int) (f / 20.0F);
		if (i_27_ < i)
			i_27_ = i;
		aFloatArray4817 = new float[i_27_];
		ds = method5152(0.0F);
		float f_28_ = 0.0F;
		for (int i_29_ = 1; i_29_ <= i_27_; i_29_++) {
			double[] ds_30_ = method5152((float) i_29_ / (float) i_27_);
			class436.aFloat4850 = (float) (ds_30_[0] - ds[0]);
			class436.aFloat4852 = (float) (ds_30_[1] - ds[1]);
			class436.aFloat4853 = (float) (ds_30_[2] - ds[2]);
			float f_31_ = class436.method5291();
			f_28_ += f_31_;
			aFloatArray4817[i_29_ - 1] = f_31_;
			ds = ds_30_;
		}
		aFloat4816 = f_28_;
	}
}
