/* Class527_Sub8_Sub15_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub8_Sub15_Sub1 extends Class527_Sub8_Sub15 {
	static int anInt12054;
	float aFloat12055;
	Class269 aClass269_12056;
	float aFloat12057;
	float aFloat12058;

	public void method18356(float f) {
		aFloat12057 += f * aFloat12058;
	}

	Class527_Sub8_Sub15_Sub1(int i, RSByteBuffer class527_sub38) {
		super(i);
		aClass269_12056 = Class188.method3664(class527_sub38.readUnsignedByte(), (byte) -33);
		aFloat12055 = class527_sub38.readFloat(-1394161578);
		aFloat12058 = class527_sub38.readFloat(-889186369);
	}

	public void method18353(float f, int i) {
		aFloat12057 += f * aFloat12058;
	}

	public void method18354(Class302 class302, Class432 class432, Class427 class427, int i) {
		float f = (float) Math.sin((double) aFloat12057);
		float f_0_ = aFloat12055 * f;
		if (aClass269_12056 == Class269.aClass269_3118) {
			Class302 class302_1_;
			(class302_1_ = class302).anInt3420 = ((int) ((float) (class302_1_.anInt3420 * 1314222519) + f_0_) * -2028651513);
			class432.method6896(f_0_, 0.0F, 0.0F);
		} else if (Class269.aClass269_3115 == aClass269_12056) {
			Class302 class302_2_;
			(class302_2_ = class302).anInt3419 = 184714985 * (int) (f_0_ + (float) (790147417 * class302_2_.anInt3419));
			class432.method6896(0.0F, f_0_, 0.0F);
		} else if (Class269.aClass269_3116 == aClass269_12056) {
			Class302 class302_3_;
			(class302_3_ = class302).anInt3421 = -1971897151 * (int) ((float) (class302_3_.anInt3421 * 902255425) + f_0_);
			class432.method6896(0.0F, 0.0F, f_0_);
		} else if (Class269.aClass269_3114 == aClass269_12056)
			class432.method6936(1.0F, 0.0F, 0.0F, f_0_);
		else if (Class269.aClass269_3120 == aClass269_12056)
			class432.method6936(0.0F, 1.0F, 0.0F, f_0_);
		else if (Class269.aClass269_3119 == aClass269_12056)
			class432.method6936(0.0F, 0.0F, 1.0F, f_0_);
	}

	public void method18355(RSByteBuffer class527_sub38, int i) {
		aClass269_12056 = Class188.method3664(class527_sub38.readUnsignedByte(), (byte) 40);
		aFloat12055 = class527_sub38.readFloat(-1968850663);
		aFloat12058 = class527_sub38.readFloat(-978911059);
	}

	public void method18362(float f) {
		aFloat12057 += f * aFloat12058;
	}

	public void method18359(float f) {
		aFloat12057 += f * aFloat12058;
	}

	public void method18352(Class302 class302, Class432 class432, Class427 class427) {
		float f = (float) Math.sin((double) aFloat12057);
		float f_4_ = aFloat12055 * f;
		if (aClass269_12056 == Class269.aClass269_3118) {
			Class302 class302_5_;
			(class302_5_ = class302).anInt3420 = ((int) ((float) (class302_5_.anInt3420 * 1314222519) + f_4_) * -2028651513);
			class432.method6896(f_4_, 0.0F, 0.0F);
		} else if (Class269.aClass269_3115 == aClass269_12056) {
			Class302 class302_6_;
			(class302_6_ = class302).anInt3419 = 184714985 * (int) (f_4_ + (float) (790147417 * class302_6_.anInt3419));
			class432.method6896(0.0F, f_4_, 0.0F);
		} else if (Class269.aClass269_3116 == aClass269_12056) {
			Class302 class302_7_;
			(class302_7_ = class302).anInt3421 = -1971897151 * (int) ((float) (class302_7_.anInt3421 * 902255425) + f_4_);
			class432.method6896(0.0F, 0.0F, f_4_);
		} else if (Class269.aClass269_3114 == aClass269_12056)
			class432.method6936(1.0F, 0.0F, 0.0F, f_4_);
		else if (Class269.aClass269_3120 == aClass269_12056)
			class432.method6936(0.0F, 1.0F, 0.0F, f_4_);
		else if (Class269.aClass269_3119 == aClass269_12056)
			class432.method6936(0.0F, 0.0F, 1.0F, f_4_);
	}

	public Class527_Sub8_Sub15_Sub1(int i, Class269 class269, float f, float f_8_) {
		super(i);
		aClass269_12056 = class269;
		aFloat12055 = f;
		aFloat12058 = f_8_;
	}

	public void method18358(Class302 class302, Class432 class432, Class427 class427) {
		float f = (float) Math.sin((double) aFloat12057);
		float f_9_ = aFloat12055 * f;
		if (aClass269_12056 == Class269.aClass269_3118) {
			Class302 class302_10_;
			(class302_10_ = class302).anInt3420 = ((int) ((float) (class302_10_.anInt3420 * 1314222519) + f_9_) * -2028651513);
			class432.method6896(f_9_, 0.0F, 0.0F);
		} else if (Class269.aClass269_3115 == aClass269_12056) {
			Class302 class302_11_;
			(class302_11_ = class302).anInt3419 = 184714985 * (int) (f_9_ + (float) (790147417 * class302_11_.anInt3419));
			class432.method6896(0.0F, f_9_, 0.0F);
		} else if (Class269.aClass269_3116 == aClass269_12056) {
			Class302 class302_12_;
			(class302_12_ = class302).anInt3421 = -1971897151 * (int) ((float) (class302_12_.anInt3421 * 902255425) + f_9_);
			class432.method6896(0.0F, 0.0F, f_9_);
		} else if (Class269.aClass269_3114 == aClass269_12056)
			class432.method6936(1.0F, 0.0F, 0.0F, f_9_);
		else if (Class269.aClass269_3120 == aClass269_12056)
			class432.method6936(0.0F, 1.0F, 0.0F, f_9_);
		else if (Class269.aClass269_3119 == aClass269_12056)
			class432.method6936(0.0F, 0.0F, 1.0F, f_9_);
	}

	public void method18357(RSByteBuffer class527_sub38) {
		aClass269_12056 = Class188.method3664(class527_sub38.readUnsignedByte(), (byte) -39);
		aFloat12055 = class527_sub38.readFloat(-247924138);
		aFloat12058 = class527_sub38.readFloat(-1412351081);
	}
}
