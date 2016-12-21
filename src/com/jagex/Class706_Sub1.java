/* Class706_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class706_Sub1 extends Class706 {
	Class436 aClass436_10882;
	Class436 aClass436_10883 = new Class436(Float.NaN, Float.NaN, Float.NaN);
	Class436 aClass436_10884 = new Class436(Float.NaN, Float.NaN, Float.NaN);

	public Class436 method8290() {
		return Class436.method5240(aClass436_10884);
	}

	public void method10137(Class536_Sub30 class536_sub30, int i) {
		aClass436_10884.aFloat4850 = (float) (2135129199 * class536_sub30.anInt10568);
		aClass436_10884.aFloat4852 = (float) (class536_sub30.anInt10564 * 737759727);
		aClass436_10884.aFloat4853 = (float) (class536_sub30.anInt10567 * -1369836225);
		if (Float.isNaN(aClass436_10883.aFloat4850)) {
			aClass436_10883.method5272(aClass436_10884);
			aClass436_10882.method5244();
		}
	}

	public void method8286(float f, int i) {
		aClass301_8821.method4053(false, f, aClass436_10883, aClass301_8821.method4061(-77115883), aClass436_10884, aClass436_10882, -463896956);
	}

	public boolean method8295(byte i) {
		return !Float.isNaN(aClass436_10883.aFloat4850);
	}

	public void method8278(Class305 class305, Class433 class433, int i, int i_0_, float f, int i_1_) {
		Class436 class436 = Class436.method5240(aClass301_8821.method4055((byte) 5));
		class436.aFloat4850 -= (float) i;
		class436.aFloat4853 -= (float) i_0_;
		class436.aFloat4852 *= -1.0F;
		Class436 class436_2_ = Class436.method5240(aClass436_10883);
		class436_2_.aFloat4850 -= (float) i;
		class436_2_.aFloat4853 -= (float) i_0_;
		class436_2_.aFloat4852 *= -1.0F;
		class433.method5194((double) class436.aFloat4850, (double) class436.aFloat4852, (double) class436.aFloat4853, (double) class436_2_.aFloat4850, (double) class436_2_.aFloat4852, (double) class436_2_.aFloat4853, 0.0F, 1.0F, 0.0F);
		class436.method5239();
		class436_2_.method5239();
	}

	public Class706_Sub1(Class301 class301) {
		super(class301);
		aClass436_10882 = new Class436();
	}

	public Class436 method8293(int i) {
		return Class436.method5240(aClass436_10884);
	}

	public void method8277(RSByteBuffer class536_sub33, int i) {
		aClass436_10884.method5242(class536_sub33);
	}

	public void method8284(float f) {
		aClass301_8821.method4053(false, f, aClass436_10883, aClass301_8821.method4061(-77115883), aClass436_10884, aClass436_10882, -147066971);
	}

	public Class436 method8279(int i) {
		return Class436.method5240(aClass436_10883);
	}

	public Class436 method8291() {
		return Class436.method5240(aClass436_10884);
	}

	public boolean method8285() {
		return !Float.isNaN(aClass436_10883.aFloat4850);
	}

	public boolean method8282() {
		return !Float.isNaN(aClass436_10883.aFloat4850);
	}

	public void method8283(float f) {
		aClass301_8821.method4053(false, f, aClass436_10883, aClass301_8821.method4061(-77115883), aClass436_10884, aClass436_10882, -937722623);
	}

	public Class436 method8288() {
		return Class436.method5240(aClass436_10883);
	}

	public Class436 method8289() {
		return Class436.method5240(aClass436_10883);
	}

	public void method8287(Class305 class305, Class433 class433, int i, int i_3_, float f) {
		Class436 class436 = Class436.method5240(aClass301_8821.method4055((byte) 5));
		class436.aFloat4850 -= (float) i;
		class436.aFloat4853 -= (float) i_3_;
		class436.aFloat4852 *= -1.0F;
		Class436 class436_4_ = Class436.method5240(aClass436_10883);
		class436_4_.aFloat4850 -= (float) i;
		class436_4_.aFloat4853 -= (float) i_3_;
		class436_4_.aFloat4852 *= -1.0F;
		class433.method5194((double) class436.aFloat4850, (double) class436.aFloat4852, (double) class436.aFloat4853, (double) class436_4_.aFloat4850, (double) class436_4_.aFloat4852, (double) class436_4_.aFloat4853, 0.0F, 1.0F, 0.0F);
		class436.method5239();
		class436_4_.method5239();
	}

	public Class436 method8292() {
		return Class436.method5240(aClass436_10884);
	}

	public Class436 method8281() {
		return Class436.method5240(aClass436_10884);
	}

	public void method8294(RSByteBuffer class536_sub33) {
		aClass436_10884.method5242(class536_sub33);
	}

	public void method8280(RSByteBuffer class536_sub33) {
		aClass436_10884.method5242(class536_sub33);
	}

	static final void method10138(Class668 class668, byte i) {
		int i_5_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub4_10759.method8348(i_5_, -1102005131);
	}
}
