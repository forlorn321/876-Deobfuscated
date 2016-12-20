/* Class360 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class360 {
	float aFloat3833;
	Class360 aClass360_3834;
	Interface42 anInterface42_3835;
	float aFloat3836;
	float aFloat3837;
	float aFloat3838;
	long aLong3839;
	long aLong3840;

	public float method6304() {
		float f = 1.0F;
		for (Class360 class360_0_ = this; class360_0_ != null; class360_0_ = class360_0_.method6306((short) -10785))
			f *= class360_0_.method6305(713500836);
		return f;
	}

	float method6305(int i) {
		return aFloat3836;
	}

	public Class360 method6306(short i) {
		return aClass360_3834;
	}

	public float method6307(int i) {
		float f = 1.0F;
		for (Class360 class360_1_ = this; class360_1_ != null; class360_1_ = class360_1_.method6306((short) -24194))
			f *= class360_1_.method6305(1072390568);
		return f;
	}

	public float method6308(byte i) {
		float f = aFloat3833;
		for (Class360 class360_2_ = aClass360_3834; class360_2_ != null; class360_2_ = class360_2_.method6306((short) -32002))
			f *= class360_2_.method6310(-1669551820);
		f = Math.min(Math.max(f, 0.0F), 1.0F);
		return f;
	}

	Class360(int i, float f, Object object, Class375 class375, Interface42 interface42, Class360 class360_3_) {
		aClass360_3834 = class360_3_;
		anInterface42_3835 = interface42;
		aFloat3833 = 1.0F;
		aFloat3836 = f;
		aFloat3837 = -1.0F;
		aFloat3838 = -1.0F;
		aLong3839 = -3752867996560921109L;
		aLong3840 = 2995833543813945721L;
	}

	public void method6309(float f, int i) {
		if (null == anInterface42_3835) {
			aFloat3838 = f;
			aFloat3837 = aFloat3833;
			aLong3839 = Class234.method4347(-1408626088) * 3752867996560921109L;
			aLong3840 = aLong3839 * 6320039990915754283L + -4435449202041746244L;
		}
	}

	public float method6310(int i) {
		return aFloat3833;
	}

	public float method6311() {
		float f = aFloat3833;
		for (Class360 class360_4_ = aClass360_3834; class360_4_ != null; class360_4_ = class360_4_.method6306((short) -22784))
			f *= class360_4_.method6310(-2048369163);
		f = Math.min(Math.max(f, 0.0F), 1.0F);
		return f;
	}

	void method6312(int i) {
		if (null != anInterface42_3835) {
			float f = anInterface42_3835.method278(2012273857);
			if (aFloat3833 != f && aFloat3838 < 0.0F) {
				aFloat3837 = aFloat3833;
				aFloat3838 = f;
				aLong3839 = Class234.method4347(-1408626088) * 3752867996560921109L;
				aLong3840 = aLong3839 * 6320039990915754283L + -4435449202041746244L;
			}
		}
		if (aFloat3838 >= 0.0F) {
			long l = Class234.method4347(-1408626088);
			if (l > aLong3840 * 4655843925018984247L) {
				aFloat3833 = aFloat3838;
				aFloat3838 = -1.0F;
			} else {
				float f = aFloat3838 - aFloat3837;
				long l_5_ = (4655843925018984247L * aLong3840 - -1667287845434020547L * aLong3839);
				float f_6_ = f / (float) l_5_;
				aFloat3833 = aFloat3837 + f_6_ * (float) (l - (-1667287845434020547L * aLong3839));
				if (aFloat3833 == aFloat3838)
					aFloat3838 = -1.0F;
			}
		}
		aFloat3833 = Math.min(1.0F, Math.max(aFloat3833, 0.0F));
	}

	public float method6313() {
		return aFloat3833;
	}

	public float method6314() {
		float f = 1.0F;
		for (Class360 class360_7_ = this; class360_7_ != null; class360_7_ = class360_7_.method6306((short) -23277))
			f *= class360_7_.method6305(461753861);
		return f;
	}

	float method6315() {
		return aFloat3836;
	}

	public float method6316() {
		float f = aFloat3833;
		for (Class360 class360_8_ = aClass360_3834; class360_8_ != null; class360_8_ = class360_8_.method6306((short) -30106))
			f *= class360_8_.method6310(-1668897677);
		f = Math.min(Math.max(f, 0.0F), 1.0F);
		return f;
	}

	public float method6317() {
		float f = aFloat3833;
		for (Class360 class360_9_ = aClass360_3834; class360_9_ != null; class360_9_ = class360_9_.method6306((short) -27340))
			f *= class360_9_.method6310(-1912648144);
		f = Math.min(Math.max(f, 0.0F), 1.0F);
		return f;
	}

	public float method6318() {
		return aFloat3833;
	}

	public float method6319() {
		return aFloat3833;
	}

	float method6320() {
		return aFloat3836;
	}

	public void method6321(float f) {
		if (null == anInterface42_3835) {
			aFloat3838 = f;
			aFloat3837 = aFloat3833;
			aLong3839 = Class234.method4347(-1408626088) * 3752867996560921109L;
			aLong3840 = aLong3839 * 6320039990915754283L + -4435449202041746244L;
		}
	}

	public void method6322(float f) {
		if (null == anInterface42_3835) {
			aFloat3838 = f;
			aFloat3837 = aFloat3833;
			aLong3839 = Class234.method4347(-1408626088) * 3752867996560921109L;
			aLong3840 = aLong3839 * 6320039990915754283L + -4435449202041746244L;
		}
	}

	public void method6323(float f) {
		if (null == anInterface42_3835) {
			aFloat3838 = f;
			aFloat3837 = aFloat3833;
			aLong3839 = Class234.method4347(-1408626088) * 3752867996560921109L;
			aLong3840 = aLong3839 * 6320039990915754283L + -4435449202041746244L;
		}
	}

	public Class360 method6324() {
		return aClass360_3834;
	}

	public Class360 method6325() {
		return aClass360_3834;
	}

	public static int method6326(CharSequence charsequence, byte i) {
		return Class217.method3972(charsequence, 10, true, -1398855642);
	}

	static void method6327(Class243 class243, int i, int i_10_, byte i_11_) {
		Class35.aClass243_332 = class243;
		Class35.anInt356 = -772813249 * i;
		Class35.anInt371 = i_10_ * -1919014937;
	}
}
