/* Class286 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class286 {
	Class259 aClass259_3193;
	Class285[] aClass285Array3194;
	int anInt3195;
	Class259 aClass259_3196;
	String aString3197;
	int anInt3198;
	protected int anInt3199 = -404651793;
	static Interface29 anInterface29_3200 = new Class275();

	public abstract void method3843();

	public abstract void method3844();

	public abstract boolean method3845();

	public String method3846(byte i) {
		return aString3197;
	}

	abstract Class285 method3847(Class167_Sub3 class167_sub3, Class264 class264);

	public final int method3848(int i) {
		return aClass285Array3194.length;
	}

	public Class285 method3849(short i) {
		Class285[] class285s = aClass285Array3194;
		for (int i_0_ = 0; i_0_ < class285s.length; i_0_++) {
			Class285 class285 = class285s[i_0_];
			if (class285.method3785())
				return class285;
		}
		return null;
	}

	public abstract boolean method3850(Class285 class285);

	public final Class285 method3851(short i) {
		return (anInt3199 * 1605784049 >= 0 ? aClass285Array3194[anInt3199 * 1605784049] : null);
	}

	public final int method3852(int i) {
		return anInt3199 * 1605784049;
	}

	abstract Class536_Sub8_Sub1 method3853(Class265 class265);

	public final void method3854(Class536_Sub8_Sub1 class536_sub8_sub1, float f, float f_1_, int i) {
		aClass285Array3194[1605784049 * anInt3199].method3787(class536_sub8_sub1, f, f_1_);
	}

	public Class285 method3855(String string, byte i) throws Exception_Sub7_Sub2 {
		Class285[] class285s = aClass285Array3194;
		for (int i_2_ = 0; i_2_ < class285s.length; i_2_++) {
			Class285 class285 = class285s[i_2_];
			String string_3_ = class285.method3802((byte) 0);
			if (string_3_ != null && string_3_.equals(string)) {
				if (!class285.method3785())
					throw new Exception_Sub7_Sub2(string);
				return class285;
			}
		}
		throw new Exception_Sub7_Sub2(string);
	}

	public final void method3856(Class536_Sub8_Sub1 class536_sub8_sub1, float f, float f_4_, float f_5_, float f_6_, int i) {
		aClass285Array3194[1605784049 * anInt3199].method3835(class536_sub8_sub1, f, f_4_, f_5_, f_6_);
	}

	public final void method3857(Class536_Sub8_Sub1 class536_sub8_sub1, Class427 class427, byte i) {
		aClass285Array3194[anInt3199 * 1605784049].method3835(class536_sub8_sub1, class427.aFloat4813, class427.aFloat4811, class427.aFloat4814, class427.aFloat4812);
	}

	public final void method3858(Class536_Sub8_Sub1 class536_sub8_sub1, float[] fs, int i) {
		aClass285Array3194[anInt3199 * 1605784049].method3790(class536_sub8_sub1, fs, fs.length);
	}

	void method3859() {
		/* empty */
	}

	public final void method3860(Class536_Sub8_Sub1 class536_sub8_sub1, Class443 class443, byte i) {
		aClass285Array3194[1605784049 * anInt3199].method3784(class536_sub8_sub1, class443);
	}

	public final void method3861(int i, float f, float f_7_, float f_8_, int i_9_) {
		aClass285Array3194[1605784049 * anInt3199].method3830(i, f, f_7_, f_8_);
	}

	public final void method3862(int i, Class436 class436, byte i_10_) {
		aClass285Array3194[1605784049 * anInt3199].method3830(i, class436.aFloat4850, class436.aFloat4852, class436.aFloat4853);
	}

	public final void method3863(int i, Class443 class443, byte i_11_) {
		aClass285Array3194[1605784049 * anInt3199].method3797(i, class443);
	}

	public final void method3864(int i, Class443 class443, int i_12_) {
		aClass285Array3194[anInt3199 * 1605784049].method3799(i, class443);
	}

	public final void method3865(int i, int i_13_, Interface40 interface40, int i_14_) {
		aClass285Array3194[1605784049 * anInt3199].method3833(i, i_13_, interface40);
	}

	public Class536_Sub8_Sub1 method3866(String string, byte i) throws Exception_Sub7_Sub1 {
		Class536_Sub8_Sub1 class536_sub8_sub1 = ((Class536_Sub8_Sub1) aClass259_3193.method3601(string, (byte) 32));
		if (null == class536_sub8_sub1)
			throw new Exception_Sub7_Sub1(string);
		return class536_sub8_sub1;
	}

	public final int method3867() {
		return anInt3199 * 1605784049;
	}

	public Class536_Sub8_Sub1 method3868(String string, byte i) {
		return ((Class536_Sub8_Sub1) aClass259_3196.method3601(string, (byte) 98));
	}

	public int method3869(int i) {
		return anInt3198 * 185096593;
	}

	public Class536_Sub8_Sub1 method3870(int i, int i_15_) {
		return (Class536_Sub8_Sub1) aClass259_3193.method3597(i, -1536250487);
	}

	public final Class285 method3871(int i, int i_16_) {
		return aClass285Array3194[i];
	}

	public abstract boolean method3872();

	public abstract boolean method3873();

	public final void method3874(Class536_Sub8_Sub1 class536_sub8_sub1, Class443 class443, int i) {
		aClass285Array3194[anInt3199 * 1605784049].method3791(class536_sub8_sub1, class443);
	}

	abstract Class285 method3875(Class167_Sub3 class167_sub3, Class264 class264);

	public int method3876(byte i) {
		return anInt3195 * -246940659;
	}

	abstract Class285 method3877(Class167_Sub3 class167_sub3, Class264 class264);

	public final void method3878(int i, Class443 class443, int i_17_) {
		aClass285Array3194[1605784049 * anInt3199].method3798(i, class443);
	}

	public final int method3879() {
		return aClass285Array3194.length;
	}

	public final int method3880() {
		return aClass285Array3194.length;
	}

	public final int method3881() {
		return aClass285Array3194.length;
	}

	public final void method3882(Class536_Sub8_Sub1 class536_sub8_sub1, float f, float f_18_, float f_19_, int i) {
		aClass285Array3194[anInt3199 * 1605784049].method3788(class536_sub8_sub1, f, f_18_, f_19_);
	}

	public abstract boolean method3883(Class285 class285);

	public abstract boolean method3884(Class285 class285);

	abstract Class536_Sub8_Sub1 method3885(Class265 class265);

	abstract Class536_Sub8_Sub1 method3886(Class265 class265);

	public int method3887() {
		return anInt3198 * 185096593;
	}

	public final void method3888(int i, float[] fs, int i_20_, short i_21_) {
		aClass285Array3194[1605784049 * anInt3199].method3808(i, fs, i_20_);
	}

	void method3889() {
		/* empty */
	}

	public final void method3890(int i, float f, float f_22_, float f_23_, float f_24_, int i_25_) {
		aClass285Array3194[1605784049 * anInt3199].method3795(i, f, f_22_, f_23_, f_24_);
	}

	public final void method3891(Class536_Sub8_Sub1 class536_sub8_sub1, int i, int i_26_) {
		float f = (float) (i >> 16 & 0xff) / 255.0F;
		float f_27_ = (float) (i >> 8 & 0xff) / 255.0F;
		float f_28_ = (float) (i & 0xff) / 255.0F;
		float f_29_ = (float) (i >> 24 & 0xff) / 255.0F;
		method3856(class536_sub8_sub1, f, f_27_, f_28_, f_29_, 538718616);
	}

	public final void method3892(Class536_Sub8_Sub1 class536_sub8_sub1, Class436 class436, byte i) {
		aClass285Array3194[anInt3199 * 1605784049].method3788(class536_sub8_sub1, class436.aFloat4850, class436.aFloat4852, class436.aFloat4853);
	}

	public Class536_Sub8_Sub1 method3893(int i, byte i_30_) {
		return (Class536_Sub8_Sub1) aClass259_3196.method3597(i, -722105106);
	}

	public int method3894(Class285 class285, int i) {
		for (int i_31_ = 0; i_31_ < aClass285Array3194.length; i_31_++) {
			if (class285 == aClass285Array3194[i_31_])
				return i_31_;
		}
		return -1;
	}

	abstract Class285 method3895(Class167_Sub3 class167_sub3, Class264 class264);

	public final void method3896(Class536_Sub8_Sub1 class536_sub8_sub1, int i, Interface40 interface40, int i_32_) {
		aClass285Array3194[1605784049 * anInt3199].method3793(class536_sub8_sub1, i, interface40);
	}

	abstract Class285 method3897(Class167_Sub3 class167_sub3, Class264 class264);

	public int method3898() {
		return anInt3195 * -246940659;
	}

	public abstract void method3899();

	public int method3900() {
		return anInt3198 * 185096593;
	}

	public int method3901() {
		return anInt3198 * 185096593;
	}

	public final void method3902(Class536_Sub8_Sub1 class536_sub8_sub1, float f, int i) {
		aClass285Array3194[1605784049 * anInt3199].method3786(class536_sub8_sub1, f);
	}

	Class286(Class167_Sub3 class167_sub3, Class274 class274) {
		aString3197 = class274.aString3020;
		anInt3198 = 910526321 * class274.aClass265Array3019.length;
		aClass259_3193 = new Class259(anInt3198 * 185096593, anInterface29_3200);
		for (int i = 0; i < 185096593 * anInt3198; i++)
			aClass259_3193.method3600(i, class274.aClass265Array3019[i].aString2862, method3853(class274.aClass265Array3019[i]), 696951880);
		anInt3195 = class274.aClass265Array3021.length * -1220365627;
		aClass259_3196 = new Class259(anInt3195 * -246940659, anInterface29_3200);
		for (int i = 0; i < -246940659 * anInt3195; i++)
			aClass259_3196.method3600(i, class274.aClass265Array3021[i].aString2862, method3853(class274.aClass265Array3021[i]), 223769418);
		aClass285Array3194 = new Class285[class274.aClass264Array3017.length];
		for (int i = 0; i < class274.aClass264Array3017.length; i++)
			aClass285Array3194[i] = method3847(class167_sub3, class274.aClass264Array3017[i]);
	}

	void method3903() {
		/* empty */
	}

	public abstract void method3904();

	public abstract void method3905();

	public abstract void method3906();

	abstract Class285 method3907(Class167_Sub3 class167_sub3, Class264 class264);

	static Class287[] method3908(int i) {
		return (new Class287[] { Class287.aClass287_3202, Class287.aClass287_3205, Class287.aClass287_3208, Class287.aClass287_3203, Class287.aClass287_3201, Class287.aClass287_3206 });
	}

	static final void method3909(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class453.method5447(class251, class234, class668, (byte) 109);
	}

	static final int method3910(int i, byte i_33_) {
		i -= 2;
		if (i < 4)
			return i;
		return 3;
	}
}
