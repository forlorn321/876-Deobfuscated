/* Class436 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class436 {
	static int anInt4848;
	static int anInt4849;
	public float aFloat4850;
	static Class436[] aClass436Array4851;
	public float aFloat4852;
	public float aFloat4853;

	public static Class436 method5238() {
		synchronized (aClass436Array4851) {
			if (anInt4849 == 0) {
				Class436 class436 = new Class436();
				return class436;
			}
			aClass436Array4851[--anInt4849].method5244();
			Class436 class436 = aClass436Array4851[anInt4849];
			return class436;
		}
	}

	public void method5239() {
		synchronized (aClass436Array4851) {
			if (anInt4849 < anInt4848 - 1)
				aClass436Array4851[anInt4849++] = this;
		}
	}

	public static Class436 method5240(Class436 class436) {
		synchronized (aClass436Array4851) {
			if (anInt4849 == 0) {
				Class436 class436_0_ = new Class436(class436);
				return class436_0_;
			}
			aClass436Array4851[--anInt4849].method5272(class436);
			Class436 class436_1_ = aClass436Array4851[anInt4849];
			return class436_1_;
		}
	}

	public static Class436 method5241(RSByteBuffer class536_sub33) {
		synchronized (aClass436Array4851) {
			if (anInt4849 == 0) {
				Class436 class436 = new Class436(class536_sub33);
				return class436;
			}
			aClass436Array4851[--anInt4849].method5242(class536_sub33);
			Class436 class436 = aClass436Array4851[anInt4849];
			return class436;
		}
	}

	public Class436() {
		/* empty */
	}

	public Class436(float f, float f_2_, float f_3_) {
		aFloat4850 = f;
		aFloat4852 = f_2_;
		aFloat4853 = f_3_;
	}

	public Class436(Class436 class436_4_) {
		aFloat4850 = class436_4_.aFloat4850;
		aFloat4852 = class436_4_.aFloat4852;
		aFloat4853 = class436_4_.aFloat4853;
	}

	Class436(RSByteBuffer class536_sub33) {
		aFloat4850 = class536_sub33.method9712(-474784871);
		aFloat4852 = class536_sub33.method9712(2061179036);
		aFloat4853 = class536_sub33.method9712(-954955835);
	}

	public void method5242(RSByteBuffer class536_sub33) {
		aFloat4850 = class536_sub33.method9712(1686288326);
		aFloat4852 = class536_sub33.method9712(-14132751);
		aFloat4853 = class536_sub33.method9712(1402615222);
	}

	public void method5243(float f, float f_5_, float f_6_) {
		aFloat4850 = f;
		aFloat4852 = f_5_;
		aFloat4853 = f_6_;
	}

	public final void method5244() {
		aFloat4853 = 0.0F;
		aFloat4852 = 0.0F;
		aFloat4850 = 0.0F;
	}

	public boolean method5245(Class436 class436_7_) {
		if (aFloat4850 != class436_7_.aFloat4850 || aFloat4852 != class436_7_.aFloat4852 || aFloat4853 != class436_7_.aFloat4853)
			return false;
		return true;
	}

	public final void method5246() {
		aFloat4850 = -aFloat4850;
		aFloat4852 = -aFloat4852;
		aFloat4853 = -aFloat4853;
	}

	public final void method5247() {
		float f = 1.0F / method5291();
		aFloat4850 *= f;
		aFloat4852 *= f;
		aFloat4853 *= f;
	}

	public final void method5248(Class436 class436_8_) {
		aFloat4850 += class436_8_.aFloat4850;
		aFloat4852 += class436_8_.aFloat4852;
		aFloat4853 += class436_8_.aFloat4853;
	}

	public final void method5249(Class436 class436_9_, float f) {
		aFloat4850 += class436_9_.aFloat4850 * f;
		aFloat4852 += class436_9_.aFloat4852 * f;
		aFloat4853 += class436_9_.aFloat4853 * f;
	}

	public static final Class436 method5250(Class436 class436, Class436 class436_10_) {
		Class436 class436_11_ = method5240(class436);
		class436_11_.method5248(class436_10_);
		return class436_11_;
	}

	public final void method5251(Class436 class436_12_) {
		aFloat4850 -= class436_12_.aFloat4850;
		aFloat4852 -= class436_12_.aFloat4852;
		aFloat4853 -= class436_12_.aFloat4853;
	}

	public static final Class436 method5252(Class436 class436, Class436 class436_13_) {
		Class436 class436_14_ = method5240(class436);
		class436_14_.method5251(class436_13_);
		return class436_14_;
	}

	public final float method5253(Class436 class436_15_) {
		return (aFloat4850 * class436_15_.aFloat4850 + aFloat4852 * class436_15_.aFloat4852 + aFloat4853 * class436_15_.aFloat4853);
	}

	public static final float method5254(Class436 class436, Class436 class436_16_) {
		return class436.method5253(class436_16_);
	}

	final void method5255(Class436 class436_17_) {
		method5243((aFloat4852 * class436_17_.aFloat4853 - aFloat4853 * class436_17_.aFloat4852), (aFloat4853 * class436_17_.aFloat4850 - aFloat4850 * class436_17_.aFloat4853), (aFloat4850 * class436_17_.aFloat4852 - aFloat4852 * class436_17_.aFloat4850));
	}

	public static final Class436 method5256(Class436 class436, Class436 class436_18_) {
		Class436 class436_19_ = method5240(class436);
		class436_19_.method5255(class436_18_);
		return class436_19_;
	}

	public static Class436 method5257(float f, float f_20_, float f_21_) {
		synchronized (aClass436Array4851) {
			if (anInt4849 == 0) {
				Class436 class436 = new Class436(f, f_20_, f_21_);
				return class436;
			}
			aClass436Array4851[--anInt4849].method5243(f, f_20_, f_21_);
			Class436 class436 = aClass436Array4851[anInt4849];
			return class436;
		}
	}

	public final void method5258() {
		if (aFloat4850 < 0.0F)
			aFloat4850 *= -1.0F;
		if (aFloat4852 < 0.0F)
			aFloat4852 *= -1.0F;
		if (aFloat4853 < 0.0F)
			aFloat4853 *= -1.0F;
	}

	public static final Class436 method5259(Class436 class436, Class436 class436_22_) {
		Class436 class436_23_ = method5240(class436);
		class436_23_.method5277(class436_22_);
		return class436_23_;
	}

	public static void method5260(int i) {
		anInt4848 = i;
		aClass436Array4851 = new Class436[i];
		anInt4849 = 0;
	}

	public static final Class436 method5261(Class436 class436, Class436 class436_24_) {
		Class436 class436_25_ = method5240(class436);
		class436_25_.method5288(class436_24_);
		return class436_25_;
	}

	public final void method5262(float f) {
		aFloat4850 /= f;
		aFloat4852 /= f;
		aFloat4853 /= f;
	}

	public final void method5263(Class425 class425) {
		Class425 class425_26_ = Class425.method5082(aFloat4850, aFloat4852, aFloat4853, 0.0F);
		Class425 class425_27_ = Class425.method5120(class425);
		Class425 class425_28_ = Class425.method5097(class425_27_, class425_26_);
		class425_28_.method5096(class425);
		method5243(class425_28_.aFloat4796, class425_28_.aFloat4793, class425_28_.aFloat4798);
		class425_26_.method5080();
		class425_27_.method5080();
		class425_28_.method5080();
	}

	public final void method5264(Class433 class433) {
		float f = aFloat4850;
		float f_29_ = aFloat4852;
		aFloat4850 = (class433.aFloat4827 * f + class433.aFloat4826 * f_29_ + class433.aFloat4834 * aFloat4853 + class433.aFloat4835);
		aFloat4852 = (class433.aFloat4828 * f + class433.aFloat4831 * f_29_ + class433.aFloat4830 * aFloat4853 + class433.aFloat4837);
		aFloat4853 = (class433.aFloat4833 * f + class433.aFloat4832 * f_29_ + class433.aFloat4829 * aFloat4853 + class433.aFloat4838);
	}

	public final void method5265(Class436 class436_30_, float f) {
		method5287(1.0F - f);
		method5248(method5281(class436_30_, f));
	}

	public String toString() {
		return new StringBuilder().append(aFloat4850).append(", ").append(aFloat4852).append(", ").append(aFloat4853).toString();
	}

	public final void method5266(Class436 class436_31_) {
		aFloat4850 += class436_31_.aFloat4850;
		aFloat4852 += class436_31_.aFloat4852;
		aFloat4853 += class436_31_.aFloat4853;
	}

	public String method5267() {
		return new StringBuilder().append(aFloat4850).append(", ").append(aFloat4852).append(", ").append(aFloat4853).toString();
	}

	public String method5268() {
		return new StringBuilder().append(aFloat4850).append(", ").append(aFloat4852).append(", ").append(aFloat4853).toString();
	}

	public String method5269() {
		return new StringBuilder().append(aFloat4850).append(", ").append(aFloat4852).append(", ").append(aFloat4853).toString();
	}

	public static void method5270(int i) {
		anInt4848 = i;
		aClass436Array4851 = new Class436[i];
		anInt4849 = 0;
	}

	public final void method5271() {
		aFloat4853 = 0.0F;
		aFloat4852 = 0.0F;
		aFloat4850 = 0.0F;
	}

	public void method5272(Class436 class436_32_) {
		method5243(class436_32_.aFloat4850, class436_32_.aFloat4852, class436_32_.aFloat4853);
	}

	public final void method5273() {
		aFloat4853 = 0.0F;
		aFloat4852 = 0.0F;
		aFloat4850 = 0.0F;
	}

	public final void method5274() {
		aFloat4853 = 0.0F;
		aFloat4852 = 0.0F;
		aFloat4850 = 0.0F;
	}

	public final void method5275() {
		aFloat4853 = 0.0F;
		aFloat4852 = 0.0F;
		aFloat4850 = 0.0F;
	}

	public final void method5276() {
		aFloat4850 = -aFloat4850;
		aFloat4852 = -aFloat4852;
		aFloat4853 = -aFloat4853;
	}

	final void method5277(Class436 class436_33_) {
		aFloat4850 *= class436_33_.aFloat4850;
		aFloat4852 *= class436_33_.aFloat4852;
		aFloat4853 *= class436_33_.aFloat4853;
	}

	public final void method5278() {
		float f = 1.0F / method5291();
		aFloat4850 *= f;
		aFloat4852 *= f;
		aFloat4853 *= f;
	}

	public final void method5279() {
		float f = 1.0F / method5291();
		aFloat4850 *= f;
		aFloat4852 *= f;
		aFloat4853 *= f;
	}

	public final void method5280() {
		aFloat4850 = -aFloat4850;
		aFloat4852 = -aFloat4852;
		aFloat4853 = -aFloat4853;
	}

	public static final Class436 method5281(Class436 class436, float f) {
		Class436 class436_34_ = method5240(class436);
		class436_34_.method5287(f);
		return class436_34_;
	}

	public final void method5282(Class433 class433) {
		float f = aFloat4850;
		float f_35_ = aFloat4852;
		aFloat4850 = (class433.aFloat4827 * f + class433.aFloat4826 * f_35_ + class433.aFloat4834 * aFloat4853);
		aFloat4852 = (class433.aFloat4828 * f + class433.aFloat4831 * f_35_ + class433.aFloat4830 * aFloat4853);
		aFloat4853 = (class433.aFloat4833 * f + class433.aFloat4832 * f_35_ + class433.aFloat4829 * aFloat4853);
	}

	static {
		new Class436(0.0F, 0.0F, 0.0F);
		aClass436Array4851 = new Class436[0];
	}

	final void method5283(Class436 class436_36_) {
		method5243((aFloat4852 * class436_36_.aFloat4853 - aFloat4853 * class436_36_.aFloat4852), (aFloat4853 * class436_36_.aFloat4850 - aFloat4850 * class436_36_.aFloat4853), (aFloat4850 * class436_36_.aFloat4852 - aFloat4852 * class436_36_.aFloat4850));
	}

	final void method5284(Class436 class436_37_) {
		method5243((aFloat4852 * class436_37_.aFloat4853 - aFloat4853 * class436_37_.aFloat4852), (aFloat4853 * class436_37_.aFloat4850 - aFloat4850 * class436_37_.aFloat4853), (aFloat4850 * class436_37_.aFloat4852 - aFloat4852 * class436_37_.aFloat4850));
	}

	public final void method5285() {
		if (aFloat4850 < 0.0F)
			aFloat4850 *= -1.0F;
		if (aFloat4852 < 0.0F)
			aFloat4852 *= -1.0F;
		if (aFloat4853 < 0.0F)
			aFloat4853 *= -1.0F;
	}

	public final void method5286() {
		if (aFloat4850 < 0.0F)
			aFloat4850 *= -1.0F;
		if (aFloat4852 < 0.0F)
			aFloat4852 *= -1.0F;
		if (aFloat4853 < 0.0F)
			aFloat4853 *= -1.0F;
	}

	public final void method5287(float f) {
		aFloat4850 *= f;
		aFloat4852 *= f;
		aFloat4853 *= f;
	}

	final void method5288(Class436 class436_38_) {
		aFloat4850 /= class436_38_.aFloat4850;
		aFloat4852 /= class436_38_.aFloat4852;
		aFloat4853 /= class436_38_.aFloat4853;
	}

	final void method5289(Class436 class436_39_) {
		method5243((aFloat4852 * class436_39_.aFloat4853 - aFloat4853 * class436_39_.aFloat4852), (aFloat4853 * class436_39_.aFloat4850 - aFloat4850 * class436_39_.aFloat4853), (aFloat4850 * class436_39_.aFloat4852 - aFloat4852 * class436_39_.aFloat4850));
	}

	public final void method5290(Class436 class436_40_) {
		aFloat4850 += class436_40_.aFloat4850;
		aFloat4852 += class436_40_.aFloat4852;
		aFloat4853 += class436_40_.aFloat4853;
	}

	public final float method5291() {
		return (float) Math.sqrt((double) (aFloat4850 * aFloat4850 + aFloat4852 * aFloat4852 + aFloat4853 * aFloat4853));
	}

	public final void method5292(float f) {
		aFloat4850 /= f;
		aFloat4852 /= f;
		aFloat4853 /= f;
	}

	public void method5293() {
		synchronized (aClass436Array4851) {
			if (anInt4849 < anInt4848 - 1)
				aClass436Array4851[anInt4849++] = this;
		}
	}

	public final void method5294() {
		aFloat4853 = 0.0F;
		aFloat4852 = 0.0F;
		aFloat4850 = 0.0F;
	}

	public final void method5295(Class436 class436_41_) {
		aFloat4850 += class436_41_.aFloat4850;
		aFloat4852 += class436_41_.aFloat4852;
		aFloat4853 += class436_41_.aFloat4853;
	}
}
