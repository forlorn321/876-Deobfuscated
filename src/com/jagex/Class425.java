/* Class425 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class425 {
	public float aFloat4793;
	static int anInt4794;
	static int anInt4795;
	public float aFloat4796;
	static Class425[] aClass425Array4797 = new Class425[0];
	public float aFloat4798;
	public float aFloat4799;

	public void method5080() {
		synchronized (aClass425Array4797) {
			if (anInt4795 < anInt4794 - 1)
				aClass425Array4797[anInt4795++] = this;
		}
	}

	public static Class425 method5081() {
		synchronized (aClass425Array4797) {
			if (anInt4795 == 0) {
				Class425 class425 = new Class425();
				return class425;
			}
			aClass425Array4797[--anInt4795].method5089();
			Class425 class425 = aClass425Array4797[anInt4795];
			return class425;
		}
	}

	static Class425 method5082(float f, float f_0_, float f_1_, float f_2_) {
		synchronized (aClass425Array4797) {
			if (anInt4795 == 0) {
				Class425 class425 = new Class425(f, f_0_, f_1_, f_2_);
				return class425;
			}
			aClass425Array4797[--anInt4795].method5086(f, f_0_, f_1_, f_2_);
			Class425 class425 = aClass425Array4797[anInt4795];
			return class425;
		}
	}

	final void method5083() {
		aFloat4798 = 0.0F;
		aFloat4793 = 0.0F;
		aFloat4796 = 0.0F;
		aFloat4799 = 1.0F;
	}

	public Class425() {
		method5089();
	}

	static final float method5084(Class425 class425) {
		return (float) Math.sqrt((double) method5095(class425, class425));
	}

	public Class425(Class425 class425_3_) {
		method5087(class425_3_);
	}

	public Class425(float f, float f_4_, float f_5_) {
		method5088(f, f_4_, f_5_);
	}

	public void method5085(RSByteBuffer class536_sub33) {
		aFloat4796 = class536_sub33.method9712(-454499401);
		aFloat4793 = class536_sub33.method9712(-1700523527);
		aFloat4798 = class536_sub33.method9712(-1372898173);
		aFloat4799 = class536_sub33.method9712(1462236104);
	}

	void method5086(float f, float f_6_, float f_7_, float f_8_) {
		aFloat4796 = f;
		aFloat4793 = f_6_;
		aFloat4798 = f_7_;
		aFloat4799 = f_8_;
	}

	public void method5087(Class425 class425_9_) {
		aFloat4796 = class425_9_.aFloat4796;
		aFloat4793 = class425_9_.aFloat4793;
		aFloat4798 = class425_9_.aFloat4798;
		aFloat4799 = class425_9_.aFloat4799;
	}

	public void method5088(float f, float f_10_, float f_11_) {
		method5090(0.0F, 1.0F, 0.0F, f);
		Class425 class425_12_ = method5081();
		class425_12_.method5090(1.0F, 0.0F, 0.0F, f_10_);
		method5096(class425_12_);
		class425_12_.method5090(0.0F, 0.0F, 1.0F, f_11_);
		method5096(class425_12_);
		class425_12_.method5080();
	}

	final void method5089() {
		aFloat4798 = 0.0F;
		aFloat4793 = 0.0F;
		aFloat4796 = 0.0F;
		aFloat4799 = 1.0F;
	}

	public void method5090(float f, float f_13_, float f_14_, float f_15_) {
		float f_16_ = (float) Math.sin((double) (f_15_ * 0.5F));
		float f_17_ = (float) Math.cos((double) (f_15_ * 0.5F));
		aFloat4796 = f * f_16_;
		aFloat4793 = f_13_ * f_16_;
		aFloat4798 = f_14_ * f_16_;
		aFloat4799 = f_17_;
	}

	public final void method5091() {
		aFloat4796 = -aFloat4796;
		aFloat4793 = -aFloat4793;
		aFloat4798 = -aFloat4798;
	}

	public final void method5092() {
		float f = 1.0F / method5084(this);
		aFloat4796 *= f;
		aFloat4793 *= f;
		aFloat4798 *= f;
		aFloat4799 *= f;
	}

	public final void method5093() {
		float f = 1.0F / method5084(this);
		aFloat4796 *= f;
		aFloat4793 *= f;
		aFloat4798 *= f;
		aFloat4799 *= f;
	}

	final float method5094(Class425 class425_18_) {
		return (aFloat4796 * class425_18_.aFloat4796 + aFloat4793 * class425_18_.aFloat4793 + aFloat4798 * class425_18_.aFloat4798 + aFloat4799 * class425_18_.aFloat4799);
	}

	static final float method5095(Class425 class425, Class425 class425_19_) {
		return class425.method5094(class425_19_);
	}

	public final void method5096(Class425 class425_20_) {
		method5086((class425_20_.aFloat4799 * aFloat4796 + class425_20_.aFloat4796 * aFloat4799 + class425_20_.aFloat4793 * aFloat4798 - class425_20_.aFloat4798 * aFloat4793), (class425_20_.aFloat4799 * aFloat4793 - class425_20_.aFloat4796 * aFloat4798 + class425_20_.aFloat4793 * aFloat4799 + class425_20_.aFloat4798 * aFloat4796), (class425_20_.aFloat4799 * aFloat4798 + class425_20_.aFloat4796 * aFloat4793 - class425_20_.aFloat4793 * aFloat4796 + class425_20_.aFloat4798 * aFloat4799),
				(class425_20_.aFloat4799 * aFloat4799 - class425_20_.aFloat4796 * aFloat4796 - class425_20_.aFloat4793 * aFloat4793 - class425_20_.aFloat4798 * aFloat4798));
	}

	static final Class425 method5097(Class425 class425, Class425 class425_21_) {
		Class425 class425_22_ = method5121(class425);
		class425_22_.method5096(class425_21_);
		return class425_22_;
	}

	final void method5098(float f) {
		aFloat4796 *= f;
		aFloat4793 *= f;
		aFloat4798 *= f;
		aFloat4799 *= f;
	}

	static final Class425 method5099(Class425 class425, float f) {
		Class425 class425_23_ = method5121(class425);
		class425_23_.method5098(f);
		return class425_23_;
	}

	final void method5100() {
		aFloat4798 = 0.0F;
		aFloat4793 = 0.0F;
		aFloat4796 = 0.0F;
		aFloat4799 = 1.0F;
	}

	public String toString() {
		return new StringBuilder().append(aFloat4796).append(",").append(aFloat4793).append(",").append(aFloat4798).append(",").append(aFloat4799).toString();
	}

	static {
		new Class425();
	}

	public String method5101() {
		return new StringBuilder().append(aFloat4796).append(",").append(aFloat4793).append(",").append(aFloat4798).append(",").append(aFloat4799).toString();
	}

	public String method5102() {
		return new StringBuilder().append(aFloat4796).append(",").append(aFloat4793).append(",").append(aFloat4798).append(",").append(aFloat4799).toString();
	}

	public String method5103() {
		return new StringBuilder().append(aFloat4796).append(",").append(aFloat4793).append(",").append(aFloat4798).append(",").append(aFloat4799).toString();
	}

	public static void method5104(int i) {
		anInt4794 = i;
		aClass425Array4797 = new Class425[i];
		anInt4795 = 0;
	}

	public static void method5105(int i) {
		anInt4794 = i;
		aClass425Array4797 = new Class425[i];
		anInt4795 = 0;
	}

	public static void method5106(int i) {
		anInt4794 = i;
		aClass425Array4797 = new Class425[i];
		anInt4795 = 0;
	}

	public void method5107() {
		synchronized (aClass425Array4797) {
			if (anInt4795 < anInt4794 - 1)
				aClass425Array4797[anInt4795++] = this;
		}
	}

	final void method5108() {
		aFloat4796 = -aFloat4796;
		aFloat4793 = -aFloat4793;
		aFloat4798 = -aFloat4798;
		aFloat4799 = -aFloat4799;
	}

	public Class425(float f, float f_24_, float f_25_, float f_26_) {
		method5086(f, f_24_, f_25_, f_26_);
	}

	public static void method5109(int i) {
		anInt4794 = i;
		aClass425Array4797 = new Class425[i];
		anInt4795 = 0;
	}

	public void method5110(float f, float f_27_, float f_28_, float f_29_) {
		float f_30_ = (float) Math.sin((double) (f_29_ * 0.5F));
		float f_31_ = (float) Math.cos((double) (f_29_ * 0.5F));
		aFloat4796 = f * f_30_;
		aFloat4793 = f_27_ * f_30_;
		aFloat4798 = f_28_ * f_30_;
		aFloat4799 = f_31_;
	}

	final void method5111(Class425 class425_32_) {
		aFloat4796 += class425_32_.aFloat4796;
		aFloat4793 += class425_32_.aFloat4793;
		aFloat4798 += class425_32_.aFloat4798;
		aFloat4799 += class425_32_.aFloat4799;
	}

	final void method5112() {
		aFloat4798 = 0.0F;
		aFloat4793 = 0.0F;
		aFloat4796 = 0.0F;
		aFloat4799 = 1.0F;
	}

	public void method5113() {
		synchronized (aClass425Array4797) {
			if (anInt4795 < anInt4794 - 1)
				aClass425Array4797[anInt4795++] = this;
		}
	}

	public final void method5114() {
		aFloat4796 = -aFloat4796;
		aFloat4793 = -aFloat4793;
		aFloat4798 = -aFloat4798;
	}

	public void method5115(Class436 class436, float f) {
		method5090(class436.aFloat4850, class436.aFloat4852, class436.aFloat4853, f);
	}

	public final void method5116() {
		float f = 1.0F / method5084(this);
		aFloat4796 *= f;
		aFloat4793 *= f;
		aFloat4798 *= f;
		aFloat4799 *= f;
	}

	public final void method5117(Class425 class425_33_, float f) {
		if (method5094(class425_33_) < 0.0F)
			method5108();
		method5098(1.0F - f);
		Class425 class425_34_ = method5099(class425_33_, f);
		method5111(class425_34_);
		class425_34_.method5080();
		method5092();
	}

	final void method5118(float f) {
		aFloat4796 *= f;
		aFloat4793 *= f;
		aFloat4798 *= f;
		aFloat4799 *= f;
	}

	final void method5119() {
		aFloat4796 = -aFloat4796;
		aFloat4793 = -aFloat4793;
		aFloat4798 = -aFloat4798;
		aFloat4799 = -aFloat4799;
	}

	public static final Class425 method5120(Class425 class425) {
		Class425 class425_35_ = method5121(class425);
		class425_35_.method5091();
		return class425_35_;
	}

	public static Class425 method5121(Class425 class425) {
		synchronized (aClass425Array4797) {
			if (anInt4795 == 0) {
				Class425 class425_36_ = new Class425(class425);
				return class425_36_;
			}
			aClass425Array4797[--anInt4795].method5087(class425);
			Class425 class425_37_ = aClass425Array4797[anInt4795];
			return class425_37_;
		}
	}
}
