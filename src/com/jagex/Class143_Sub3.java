/* Class143_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class143_Sub3 extends Class143 {
	boolean aBool9334;
	boolean aBool9335;
	Interface22 anInterface22_9336;
	Interface36 anInterface36_9337;
	int anInt9338;
	Class167_Sub3 aClass167_Sub3_9339;
	int anInt9340;
	int anInt9341;
	int anInt9342;
	int anInt9343;
	int anInt9344;
	boolean aBool9345 = false;
	boolean aBool9346;
	boolean aBool9347;

	void method1732(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		if (aClass167_Sub3_9339.method8726() != Class347.aClass347_3689) {
			if (aBool9345) {
				i_1_ = i_1_ * anInt9338 / method12();
				i_2_ = i_2_ * anInt9344 / method1785();
				i += anInt9341 * i_1_ / anInt9338;
				i_0_ += anInt9340 * i_2_ / anInt9344;
			}
			aClass167_Sub3_9339.aClass358_9563.method4695((float) i, (float) i_0_, (float) (i + i_1_), (float) (i_0_ + i_2_), anInterface36_9337.method219(0.0F), anInterface36_9337.method220(0.0F), anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), anInterface36_9337, i_4_);
		} else {
			aClass167_Sub3_9339.method8943();
			aClass167_Sub3_9339.method8763(i_5_);
			Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
			class328.anInterface36_3589 = anInterface36_9337;
			class328.method4304(i_3_, i_4_);
			if (aBool9345) {
				i_1_ = i_1_ * anInt9338 / method12();
				i_2_ = i_2_ * anInt9344 / method1785();
				i += anInt9341 * i_1_ / anInt9338;
				i_0_ += anInt9340 * i_2_ / anInt9344;
			}
			float f = (float) aClass167_Sub3_9339.method2278((byte) -88).method2725();
			float f_7_ = (float) aClass167_Sub3_9339.method2278((byte) 32).method2726();
			class328.aClass443_3591.method5344((float) i_1_ * 2.0F / f, (float) i_2_ * 2.0F / f_7_, 1.0F, 1.0F);
			class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
			class328.aClass443_3591.aFloatArray4878[13] = (((float) i_0_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_7_) - 1.0F;
			class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
			class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
			class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
			class328.anInt3588 = 0;
			class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
			class328.method4306();
		}
	}

	Class143_Sub3(Class167_Sub3 class167_sub3, int i, int i_8_, int[] is, int i_9_, int i_10_) {
		anInt9340 = 0;
		anInt9341 = 0;
		anInt9342 = 0;
		anInt9343 = 0;
		aClass167_Sub3_9339 = class167_sub3;
		anInt9338 = i;
		anInt9344 = i_8_;
		anInterface22_9336 = null;
		anInterface36_9337 = class167_sub3.method8776(i, i_8_, false, is, i_9_, i_10_);
		anInterface36_9337.method222(true, true);
		aBool9334 = anInterface36_9337.method1() != i;
		aBool9347 = anInterface36_9337.method78() != i_8_;
		aBool9346 = !aBool9334 && anInterface36_9337.method221();
		aBool9335 = !aBool9347 && anInterface36_9337.method221();
	}

	Class143_Sub3(Class167_Sub3 class167_sub3, Interface36 interface36) {
		this(class167_sub3, interface36, interface36.method1(), interface36.method78());
	}

	public void method1781(int i, int i_11_, int i_12_, int i_13_) {
		anInt9341 = i;
		anInt9340 = i_11_;
		anInt9343 = i_12_;
		anInt9342 = i_13_;
		aBool9345 = (anInt9341 != 0 || anInt9340 != 0 || anInt9343 != 0 || anInt9342 != 0);
	}

	public void method1726(int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_) {
		anInterface36_9337.method231(i, i_14_, i_15_, i_16_, i_17_, i_18_);
	}

	public void method1756(int i, int i_19_, int i_20_, int i_21_, int i_22_) {
		if (aClass167_Sub3_9339.method8726() != Class347.aClass347_3689) {
			i += anInt9341;
			i_19_ += anInt9340;
			aClass167_Sub3_9339.aClass358_9563.method4695((float) i, (float) i_19_, (float) (i + anInt9338), (float) (i_19_ + anInt9344), 0.0F, 0.0F, anInterface36_9337.method261(), anInterface36_9337.method244(), anInterface36_9337, i_21_);
		} else {
			aClass167_Sub3_9339.method8943();
			aClass167_Sub3_9339.method8763(i_22_);
			Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
			class328.anInterface36_3589 = anInterface36_9337;
			class328.method4304(i_20_, i_21_);
			i += anInt9341;
			i_19_ += anInt9340;
			float f = (float) aClass167_Sub3_9339.method2278((byte) -56).method2725();
			float f_23_ = (float) aClass167_Sub3_9339.method2278((byte) -9).method2726();
			class328.aClass443_3591.method5344((float) anInt9338 * 2.0F / f, ((float) anInt9344 * 2.0F / f_23_), 1.0F, 1.0F);
			class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
			class328.aClass443_3591.aFloatArray4878[13] = (((float) i_19_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_23_) - 1.0F;
			class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
			class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
			class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
			class328.anInt3588 = 0;
			class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
			class328.method4306();
		}
	}

	public void method1734(int i, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_) {
		if (aClass167_Sub3_9339.method8726() != Class347.aClass347_3689) {
			int i_30_ = i_24_ + i_26_;
			int i_31_ = i + i_25_;
			int i_32_ = method12();
			int i_33_ = method1785();
			int i_34_ = i_24_ + anInt9340;
			for (int i_35_ = i_34_ + anInt9344; i_35_ <= i_30_; i_35_ += i_33_) {
				int i_36_ = i + anInt9341;
				for (int i_37_ = i_36_ + anInt9338; i_37_ <= i_31_; i_37_ += i_32_) {
					aClass167_Sub3_9339.aClass358_9563.method4695((float) i_36_, (float) i_34_, (float) (i_36_ + anInt9338), (float) (i_34_ + anInt9344), 0.0F, 0.0F, anInterface36_9337.method261(), anInterface36_9337.method244(), anInterface36_9337, i_28_);
					i_36_ += i_32_;
				}
				if (i_36_ < i_31_) {
					int i_38_ = i_31_ - i_36_;
					aClass167_Sub3_9339.aClass358_9563.method4695((float) i_36_, (float) i_34_, (float) (i_36_ + i_38_), (float) (i_34_ + anInt9344), 0.0F, 0.0F, ((float) i_38_ / (float) anInt9338 * anInterface36_9337.method261()), anInterface36_9337.method244(), anInterface36_9337, i_28_);
				}
				i_34_ += i_33_;
			}
			if (i_34_ < i_30_) {
				int i_39_ = i_30_ - i_34_;
				float f = ((float) i_39_ / (float) anInt9344 * anInterface36_9337.method244());
				int i_40_ = i + anInt9341;
				for (int i_41_ = i_40_ + anInt9338; i_41_ <= i_31_; i_41_ += i_32_) {
					aClass167_Sub3_9339.aClass358_9563.method4695((float) i_40_, (float) i_34_, (float) (i_40_ + anInt9338), (float) (i_34_ + i_39_), 0.0F, 0.0F, anInterface36_9337.method261(), f, anInterface36_9337, i_28_);
					i_40_ += i_32_;
				}
				if (i_40_ < i_31_) {
					int i_42_ = i_31_ - i_40_;
					aClass167_Sub3_9339.aClass358_9563.method4695((float) i_40_, (float) i_34_, (float) (i_40_ + i_42_), (float) (i_34_ + i_39_), 0.0F, 0.0F, ((float) i_42_ / (float) anInt9338 * anInterface36_9337.method261()), f, anInterface36_9337, i_28_);
				}
			}
		} else {
			aClass167_Sub3_9339.method8943();
			aClass167_Sub3_9339.method8763(i_29_);
			Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
			class328.anInterface36_3589 = anInterface36_9337;
			class328.method4304(i_27_, i_28_);
			float f = (float) aClass167_Sub3_9339.method2278((byte) -45).method2725();
			float f_43_ = (float) aClass167_Sub3_9339.method2278((byte) -2).method2726();
			class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
			class328.anInt3588 = 0;
			class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
			boolean bool = aBool9335 && anInt9340 == 0 && anInt9342 == 0;
			boolean bool_44_ = aBool9346 && anInt9341 == 0 && anInt9343 == 0;
			if (bool_44_ & bool) {
				class328.aClass443_3591.method5344((float) i_25_ * 2.0F / f, ((float) i_26_ * 2.0F / f_43_), 1.0F, 1.0F);
				class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
				class328.aClass443_3591.aFloatArray4878[13] = (((float) i_24_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_43_) - 1.0F;
				class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
				class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_25_), anInterface36_9337.method220((float) i_26_), 1.0F, 1.0F);
				class328.method4306();
			} else if (bool_44_) {
				int i_45_ = i_24_ + i_26_;
				int i_46_ = method1785();
				class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_25_), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
				int i_47_ = i_24_ + anInt9340;
				for (int i_48_ = i_47_ + anInt9344; i_48_ <= i_45_; i_48_ += i_46_) {
					class328.aClass443_3591.method5344(((float) i_25_ * 2.0F / f), ((float) anInt9344 * 2.0F / f_43_), 1.0F, 1.0F);
					class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[13] = (((float) i_47_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_43_) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
					class328.method4306();
					i_47_ += i_46_;
				}
				if (i_47_ < i_45_) {
					int i_49_ = i_45_ - i_47_;
					class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_25_), anInterface36_9337.method220((float) i_49_), 1.0F, 1.0F);
					class328.aClass443_3591.method5344(((float) i_25_ * 2.0F / f), ((float) i_49_ * 2.0F / f_43_), 1.0F, 1.0F);
					class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[13] = (((float) i_47_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_43_) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
					class328.method4306();
				}
			} else if (bool) {
				int i_50_ = i + i_25_;
				int i_51_ = method12();
				class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) i_26_), 1.0F, 1.0F);
				int i_52_ = i + anInt9341;
				for (int i_53_ = i_52_ + anInt9338; i_53_ <= i_50_; i_53_ += i_51_) {
					class328.aClass443_3591.method5344(((float) anInt9338 * 2.0F / f), ((float) i_26_ * 2.0F / f_43_), 1.0F, 1.0F);
					class328.aClass443_3591.aFloatArray4878[12] = (((float) i_52_ + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[13] = (((float) i_24_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_43_) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
					class328.method4306();
					i_52_ += i_51_;
				}
				if (i_52_ < i_50_) {
					int i_54_ = i_50_ - i_52_;
					class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_54_), anInterface36_9337.method220((float) i_26_), 1.0F, 1.0F);
					class328.aClass443_3591.method5344(((float) i_54_ * 2.0F / f), ((float) i_26_ * 2.0F / f_43_), 1.0F, 1.0F);
					class328.aClass443_3591.aFloatArray4878[12] = (((float) i_52_ + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[13] = (((float) i_24_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_43_) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
					class328.method4306();
				}
			} else {
				int i_55_ = i_24_ + i_26_;
				int i_56_ = i + i_25_;
				int i_57_ = method12();
				int i_58_ = method1785();
				int i_59_ = i_24_ + anInt9340;
				for (int i_60_ = i_59_ + anInt9344; i_60_ <= i_55_; i_60_ += i_58_) {
					class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
					int i_61_ = i + anInt9341;
					for (int i_62_ = i_61_ + anInt9338; i_62_ <= i_56_; i_62_ += i_57_) {
						class328.aClass443_3591.method5344(((float) anInt9338 * 2.0F / f), ((float) anInt9344 * 2.0F / f_43_), 1.0F, 1.0F);
						class328.aClass443_3591.aFloatArray4878[12] = (((float) i_61_ + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
						class328.aClass443_3591.aFloatArray4878[13] = (((float) i_59_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_43_) - 1.0F;
						class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
						class328.method4306();
						i_61_ += i_57_;
					}
					if (i_61_ < i_56_) {
						int i_63_ = i_56_ - i_61_;
						class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_63_), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
						class328.aClass443_3591.method5344(((float) i_63_ * 2.0F / f), ((float) anInt9344 * 2.0F / f_43_), 1.0F, 1.0F);
						class328.aClass443_3591.aFloatArray4878[12] = (((float) i_61_ + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
						class328.aClass443_3591.aFloatArray4878[13] = (((float) i_59_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_43_) - 1.0F;
						class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
						class328.method4306();
					}
					i_59_ += i_58_;
				}
				if (i_59_ < i_55_) {
					int i_64_ = i_55_ - i_59_;
					class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) i_64_), 1.0F, 1.0F);
					int i_65_ = i + anInt9341;
					for (int i_66_ = i_65_ + anInt9338; i_66_ <= i_56_; i_66_ += i_57_) {
						class328.aClass443_3591.method5344(((float) anInt9338 * 2.0F / f), ((float) i_64_ * 2.0F / f_43_), 1.0F, 1.0F);
						class328.aClass443_3591.aFloatArray4878[12] = (((float) i_65_ + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
						class328.aClass443_3591.aFloatArray4878[13] = (((float) i_59_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_43_) - 1.0F;
						class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
						class328.method4306();
						i_65_ += i_57_;
					}
					if (i_65_ < i_56_) {
						int i_67_ = i_56_ - i_65_;
						class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_67_), anInterface36_9337.method220((float) i_64_), 1.0F, 1.0F);
						class328.aClass443_3591.method5344(((float) i_67_ * 2.0F / f), ((float) i_64_ * 2.0F / f_43_), 1.0F, 1.0F);
						class328.aClass443_3591.aFloatArray4878[12] = (((float) i_65_ + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
						class328.aClass443_3591.aFloatArray4878[13] = (((float) i_59_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_43_) - 1.0F;
						class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
						class328.method4306();
					}
				}
			}
		}
	}

	public void method1719(int[] is) {
		is[0] = anInt9341;
		is[1] = anInt9340;
		is[2] = anInt9343;
		is[3] = anInt9342;
	}

	public int method1720() {
		return anInt9338;
	}

	void method1725(float f, float f_68_, float f_69_, float f_70_, float f_71_, float f_72_, int i, Class161 class161, int i_73_, int i_74_) {
		aClass167_Sub3_9339.method8943();
		Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
		class328.anInterface36_3589 = anInterface36_9337;
		class328.method4304(1, -1);
		float f_75_ = (float) aClass167_Sub3_9339.method2278((byte) -1).method2725();
		float f_76_ = (float) aClass167_Sub3_9339.method2278((byte) 28).method2726();
		class328.aClass443_3591.method5338();
		if (aBool9345) {
			float f_77_ = (float) anInt9338 / (float) method12();
			float f_78_ = (float) anInt9344 / (float) method1785();
			class328.aClass443_3591.aFloatArray4878[0] = (f_69_ - f) * f_77_;
			class328.aClass443_3591.aFloatArray4878[1] = (f_70_ - f_68_) * f_77_;
			class328.aClass443_3591.aFloatArray4878[4] = (f_71_ - f) * f_78_;
			class328.aClass443_3591.aFloatArray4878[5] = (f_72_ - f_68_) * f_78_;
			class328.aClass443_3591.aFloatArray4878[12] = ((f + (float) anInt9341) * f_77_ + aClass167_Sub3_9339.method8725());
			class328.aClass443_3591.aFloatArray4878[13] = ((f_68_ + (float) anInt9340) * f_78_ + aClass167_Sub3_9339.method8725());
		} else {
			class328.aClass443_3591.aFloatArray4878[0] = f_69_ - f;
			class328.aClass443_3591.aFloatArray4878[1] = f_70_ - f_68_;
			class328.aClass443_3591.aFloatArray4878[4] = f_71_ - f;
			class328.aClass443_3591.aFloatArray4878[5] = f_72_ - f_68_;
			class328.aClass443_3591.aFloatArray4878[12] = f + aClass167_Sub3_9339.method8725();
			class328.aClass443_3591.aFloatArray4878[13] = f_68_ + aClass167_Sub3_9339.method8725();
		}
		Class443 class443 = aClass167_Sub3_9339.aClass443_9570;
		class443.method5338();
		class443.aFloatArray4878[0] = 2.0F / f_75_;
		class443.aFloatArray4878[5] = 2.0F / f_76_;
		class443.aFloatArray4878[12] = -1.0F;
		class443.aFloatArray4878[13] = -1.0F;
		class443.aFloatArray4878[14] = -1.0F;
		class328.aClass443_3591.method5390(class443);
		class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
		class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
		class328.anInt3588 = 0;
		class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
		Interface36 interface36 = ((Class161_Sub1) class161).anInterface36_9385;
		class328.anInterface36_3593 = interface36;
		class328.aClass443_3595.method5338();
		class328.aClass443_3595.aFloatArray4878[0] = (f_69_ - f) * interface36.method219(1.0F);
		class328.aClass443_3595.aFloatArray4878[1] = (f_70_ - f_68_) * interface36.method219(1.0F);
		class328.aClass443_3595.aFloatArray4878[4] = (f_71_ - f) * interface36.method220(1.0F);
		class328.aClass443_3595.aFloatArray4878[5] = (f_72_ - f_68_) * interface36.method220(1.0F);
		class328.aClass443_3595.aFloatArray4878[12] = (f - (float) i_73_) * interface36.method219(1.0F);
		class328.aClass443_3595.aFloatArray4878[13] = (f_68_ - (float) i_74_) * interface36.method220(1.0F);
		class328.method4307();
	}

	public int method1752() {
		return anInt9344;
	}

	public int method1785() {
		return anInt9344 + anInt9340 + anInt9342;
	}

	public Interface22 method1782() {
		return anInterface22_9336;
	}

	public void method1783(int i, int i_79_, int i_80_, int i_81_, int[] is, int i_82_, int i_83_) {
		anInterface36_9337.method223(i, i_79_, i_80_, i_81_, is, i_82_, i_83_);
	}

	public void method1761(int i, int i_84_, int i_85_, int i_86_, int[] is, int[] is_87_, int i_88_, int i_89_) {
		anInterface36_9337.method226(i, i_84_, i_85_, i_86_, is, is_87_, i_88_);
	}

	public void method1729(int i, int i_90_, int i_91_, int i_92_, int i_93_) {
		if (aClass167_Sub3_9339.method8726() != Class347.aClass347_3689) {
			i += anInt9341;
			i_90_ += anInt9340;
			aClass167_Sub3_9339.aClass358_9563.method4695((float) i, (float) i_90_, (float) (i + anInt9338), (float) (i_90_ + anInt9344), 0.0F, 0.0F, anInterface36_9337.method261(), anInterface36_9337.method244(), anInterface36_9337, i_92_);
		} else {
			aClass167_Sub3_9339.method8943();
			aClass167_Sub3_9339.method8763(i_93_);
			Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
			class328.anInterface36_3589 = anInterface36_9337;
			class328.method4304(i_91_, i_92_);
			i += anInt9341;
			i_90_ += anInt9340;
			float f = (float) aClass167_Sub3_9339.method2278((byte) 51).method2725();
			float f_94_ = (float) aClass167_Sub3_9339.method2278((byte) 16).method2726();
			class328.aClass443_3591.method5344((float) anInt9338 * 2.0F / f, ((float) anInt9344 * 2.0F / f_94_), 1.0F, 1.0F);
			class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
			class328.aClass443_3591.aFloatArray4878[13] = (((float) i_90_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_94_) - 1.0F;
			class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
			class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
			class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
			class328.anInt3588 = 0;
			class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
			class328.method4306();
		}
	}

	public void method1766(int[] is) {
		is[0] = anInt9341;
		is[1] = anInt9340;
		is[2] = anInt9343;
		is[3] = anInt9342;
	}

	public void method1718(int i, int i_95_, int i_96_, int i_97_) {
		anInt9341 = i;
		anInt9340 = i_95_;
		anInt9343 = i_96_;
		anInt9342 = i_97_;
		aBool9345 = (anInt9341 != 0 || anInt9340 != 0 || anInt9343 != 0 || anInt9342 != 0);
	}

	public int method11() {
		return anInt9338 + anInt9341 + anInt9343;
	}

	void method1740(float f, float f_98_, float f_99_, float f_100_, float f_101_, float f_102_, int i, int i_103_, int i_104_, int i_105_) {
		if (aClass167_Sub3_9339.method8726() != Class347.aClass347_3689)
			aClass167_Sub3_9339.aClass358_9563.method4697(f, f_98_, f_99_, f_100_, f_101_, f_102_, f_99_ + f_101_ - f, f_100_ + f_102_ - f_98_, 0.0F, 0.0F, anInterface36_9337.method261(), 0.0F, 0.0F, anInterface36_9337.method244(), anInterface36_9337.method261(), anInterface36_9337.method244(), anInterface36_9337, i_103_);
		else {
			aClass167_Sub3_9339.method8943();
			aClass167_Sub3_9339.method8763(i_104_);
			if (aBool9345) {
				float f_106_ = (float) method12();
				float f_107_ = (float) method1785();
				float f_108_ = (f_99_ - f) / f_106_;
				float f_109_ = (f_100_ - f_98_) / f_106_;
				float f_110_ = (f_101_ - f) / f_107_;
				float f_111_ = (f_102_ - f_98_) / f_107_;
				float f_112_ = f_110_ * (float) anInt9340;
				float f_113_ = f_111_ * (float) anInt9340;
				float f_114_ = f_108_ * (float) anInt9341;
				float f_115_ = f_109_ * (float) anInt9341;
				float f_116_ = -f_108_ * (float) anInt9343;
				float f_117_ = -f_109_ * (float) anInt9343;
				float f_118_ = -f_110_ * (float) anInt9342;
				float f_119_ = -f_111_ * (float) anInt9342;
				f = f + f_114_ + f_112_;
				f_98_ = f_98_ + f_115_ + f_113_;
				f_99_ = f_99_ + f_116_ + f_112_;
				f_100_ = f_100_ + f_117_ + f_113_;
				f_101_ = f_101_ + f_114_ + f_118_;
				f_102_ = f_102_ + f_115_ + f_119_;
			}
			Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
			class328.anInterface36_3589 = anInterface36_9337;
			class328.method4304(i, i_103_);
			float f_120_ = (float) aClass167_Sub3_9339.method2278((byte) 49).method2725();
			float f_121_ = (float) aClass167_Sub3_9339.method2278((byte) -91).method2726();
			class328.aClass443_3591.method5338();
			class328.aClass443_3591.aFloatArray4878[0] = (f_99_ - f) * 2.0F / f_120_;
			class328.aClass443_3591.aFloatArray4878[1] = (f_100_ - f_98_) * 2.0F / f_121_;
			class328.aClass443_3591.aFloatArray4878[4] = (f_101_ - f) * 2.0F / f_120_;
			class328.aClass443_3591.aFloatArray4878[5] = (f_102_ - f_98_) * 2.0F / f_121_;
			class328.aClass443_3591.aFloatArray4878[12] = ((f + aClass167_Sub3_9339.method8725()) * 2.0F / f_120_ - 1.0F);
			class328.aClass443_3591.aFloatArray4878[13] = ((f_98_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_121_ - 1.0F);
			class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
			class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
			class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
			class328.anInt3588 = 0;
			class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
			class328.method4306();
		}
	}

	public Interface22 method1779() {
		return anInterface22_9336;
	}

	public void method1743(int i, int i_122_, int i_123_, int i_124_, int[] is, int i_125_, int i_126_) {
		anInterface36_9337.method223(i, i_122_, i_123_, i_124_, is, i_125_, i_126_);
	}

	public void method1757(int i, int i_127_, int i_128_, int i_129_, int[] is, int i_130_, int i_131_) {
		anInterface36_9337.method223(i, i_127_, i_128_, i_129_, is, i_130_, i_131_);
	}

	public void method1745(int i, int i_132_, int i_133_, int i_134_, int[] is, int i_135_, int i_136_) {
		anInterface36_9337.method223(i, i_132_, i_133_, i_134_, is, i_135_, i_136_);
	}

	public void method1746(int i, int i_137_, int i_138_, int i_139_, int[] is, int[] is_140_, int i_141_, int i_142_) {
		anInterface36_9337.method226(i, i_137_, i_138_, i_139_, is, is_140_, i_141_);
	}

	public void method1747(int i, int i_143_, int i_144_, int i_145_, int[] is, int[] is_146_, int i_147_, int i_148_) {
		anInterface36_9337.method226(i, i_143_, i_144_, i_145_, is, is_146_, i_147_);
	}

	public int method1753() {
		return anInt9338;
	}

	public void method1788(int i, int i_149_, Class161 class161, int i_150_, int i_151_) {
		aClass167_Sub3_9339.method8943();
		Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
		class328.anInterface36_3589 = anInterface36_9337;
		class328.method4304(1, -1);
		i += anInt9341;
		i_149_ += anInt9340;
		float f = (float) aClass167_Sub3_9339.method2278((byte) 11).method2725();
		float f_152_ = (float) aClass167_Sub3_9339.method2278((byte) 70).method2726();
		class328.aClass443_3591.method5344((float) anInt9338 * 2.0F / f, (float) anInt9344 * 2.0F / f_152_, 1.0F, 1.0F);
		class328.aClass443_3591.aFloatArray4878[12] = ((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F;
		class328.aClass443_3591.aFloatArray4878[13] = (((float) i_149_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_152_) - 1.0F;
		class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
		class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
		class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
		class328.anInt3588 = 0;
		class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
		Interface36 interface36 = ((Class161_Sub1) class161).anInterface36_9385;
		class328.anInterface36_3593 = interface36;
		class328.aClass443_3595.method5344(interface36.method219((float) anInt9338), interface36.method220((float) anInt9344), 1.0F, 1.0F);
		class328.aClass443_3595.aFloatArray4878[12] = interface36.method219((float) (i - i_150_));
		class328.aClass443_3595.aFloatArray4878[13] = interface36.method220((float) (i_149_ - i_151_));
		class328.method4307();
	}

	public void method1727(int i, int i_153_, int i_154_) {
		int[] is = aClass167_Sub3_9339.method2078(i, i_153_, anInt9338, anInt9344);
		int[] is_155_ = new int[anInt9338 * anInt9344];
		anInterface36_9337.method243(0, 0, anInt9338, anInt9344, is_155_, 0);
		if (i_154_ == 0) {
			for (int i_156_ = 0; i_156_ < anInt9344; i_156_++) {
				int i_157_ = i_156_ * anInt9338;
				for (int i_158_ = 0; i_158_ < anInt9338; i_158_++)
					is_155_[i_157_ + i_158_] = (is_155_[i_157_ + i_158_] & 0xffffff | is[i_157_ + i_158_] << 8 & ~0xffffff);
			}
		} else if (i_154_ == 1) {
			for (int i_159_ = 0; i_159_ < anInt9344; i_159_++) {
				int i_160_ = i_159_ * anInt9338;
				for (int i_161_ = 0; i_161_ < anInt9338; i_161_++)
					is_155_[i_160_ + i_161_] = (is_155_[i_160_ + i_161_] & 0xffffff | is[i_160_ + i_161_] << 16 & ~0xffffff);
			}
		} else if (i_154_ == 2) {
			for (int i_162_ = 0; i_162_ < anInt9344; i_162_++) {
				int i_163_ = i_162_ * anInt9338;
				for (int i_164_ = 0; i_164_ < anInt9338; i_164_++)
					is_155_[i_163_ + i_164_] = (is_155_[i_163_ + i_164_] & 0xffffff | is[i_163_ + i_164_] << 24 & ~0xffffff);
			}
		} else if (i_154_ == 3) {
			for (int i_165_ = 0; i_165_ < anInt9344; i_165_++) {
				int i_166_ = i_165_ * anInt9338;
				for (int i_167_ = 0; i_167_ < anInt9338; i_167_++)
					is_155_[i_166_ + i_167_] = (is_155_[i_166_ + i_167_] & 0xffffff | (is[i_166_ + i_167_] != 0 ? -16777216 : 0));
			}
		}
		method1783(0, 0, anInt9338, anInt9344, is_155_, 0, anInt9338);
	}

	public void method1751(int i, int i_168_, int i_169_) {
		int[] is = aClass167_Sub3_9339.method2078(i, i_168_, anInt9338, anInt9344);
		int[] is_170_ = new int[anInt9338 * anInt9344];
		anInterface36_9337.method243(0, 0, anInt9338, anInt9344, is_170_, 0);
		if (i_169_ == 0) {
			for (int i_171_ = 0; i_171_ < anInt9344; i_171_++) {
				int i_172_ = i_171_ * anInt9338;
				for (int i_173_ = 0; i_173_ < anInt9338; i_173_++)
					is_170_[i_172_ + i_173_] = (is_170_[i_172_ + i_173_] & 0xffffff | is[i_172_ + i_173_] << 8 & ~0xffffff);
			}
		} else if (i_169_ == 1) {
			for (int i_174_ = 0; i_174_ < anInt9344; i_174_++) {
				int i_175_ = i_174_ * anInt9338;
				for (int i_176_ = 0; i_176_ < anInt9338; i_176_++)
					is_170_[i_175_ + i_176_] = (is_170_[i_175_ + i_176_] & 0xffffff | is[i_175_ + i_176_] << 16 & ~0xffffff);
			}
		} else if (i_169_ == 2) {
			for (int i_177_ = 0; i_177_ < anInt9344; i_177_++) {
				int i_178_ = i_177_ * anInt9338;
				for (int i_179_ = 0; i_179_ < anInt9338; i_179_++)
					is_170_[i_178_ + i_179_] = (is_170_[i_178_ + i_179_] & 0xffffff | is[i_178_ + i_179_] << 24 & ~0xffffff);
			}
		} else if (i_169_ == 3) {
			for (int i_180_ = 0; i_180_ < anInt9344; i_180_++) {
				int i_181_ = i_180_ * anInt9338;
				for (int i_182_ = 0; i_182_ < anInt9338; i_182_++)
					is_170_[i_181_ + i_182_] = (is_170_[i_181_ + i_182_] & 0xffffff | (is[i_181_ + i_182_] != 0 ? -16777216 : 0));
			}
		}
		method1783(0, 0, anInt9338, anInt9344, is_170_, 0, anInt9338);
	}

	public int method1770() {
		return anInt9344 + anInt9340 + anInt9342;
	}

	Class143_Sub3(Class167_Sub3 class167_sub3, int i, int i_183_, boolean bool, boolean bool_184_) {
		anInt9340 = 0;
		anInt9341 = 0;
		anInt9342 = 0;
		anInt9343 = 0;
		aClass167_Sub3_9339 = class167_sub3;
		anInt9338 = i;
		anInt9344 = i_183_;
		if (bool_184_) {
			Interface44 interface44 = class167_sub3.method8779((bool ? Class155.aClass155_1722 : Class155.aClass155_1724), Class171.aClass171_1905, i, i_183_);
			anInterface22_9336 = interface44.method331(0);
			anInterface36_9337 = interface44;
		} else {
			anInterface36_9337 = class167_sub3.method8774((bool ? Class155.aClass155_1722 : Class155.aClass155_1724), Class171.aClass171_1905, i, i_183_);
			anInterface22_9336 = null;
		}
		anInterface36_9337.method222(true, true);
		aBool9334 = anInterface36_9337.method1() != i;
		aBool9347 = anInterface36_9337.method78() != i_183_;
		aBool9346 = !aBool9334 && anInterface36_9337.method221();
		aBool9335 = !aBool9347 && anInterface36_9337.method221();
	}

	public Interface22 method1722() {
		return anInterface22_9336;
	}

	public void method1763(int i, int i_185_, int i_186_, int i_187_, int i_188_) {
		if (aClass167_Sub3_9339.method8726() != Class347.aClass347_3689) {
			i += anInt9341;
			i_185_ += anInt9340;
			aClass167_Sub3_9339.aClass358_9563.method4695((float) i, (float) i_185_, (float) (i + anInt9338), (float) (i_185_ + anInt9344), 0.0F, 0.0F, anInterface36_9337.method261(), anInterface36_9337.method244(), anInterface36_9337, i_187_);
		} else {
			aClass167_Sub3_9339.method8943();
			aClass167_Sub3_9339.method8763(i_188_);
			Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
			class328.anInterface36_3589 = anInterface36_9337;
			class328.method4304(i_186_, i_187_);
			i += anInt9341;
			i_185_ += anInt9340;
			float f = (float) aClass167_Sub3_9339.method2278((byte) 119).method2725();
			float f_189_ = (float) aClass167_Sub3_9339.method2278((byte) -30).method2726();
			class328.aClass443_3591.method5344((float) anInt9338 * 2.0F / f, ((float) anInt9344 * 2.0F / f_189_), 1.0F, 1.0F);
			class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
			class328.aClass443_3591.aFloatArray4878[13] = (((float) i_185_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_189_) - 1.0F;
			class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
			class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
			class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
			class328.anInt3588 = 0;
			class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
			class328.method4306();
		}
	}

	public void method1755(int i, int i_190_, int i_191_, int i_192_, int i_193_) {
		if (aClass167_Sub3_9339.method8726() != Class347.aClass347_3689) {
			i += anInt9341;
			i_190_ += anInt9340;
			aClass167_Sub3_9339.aClass358_9563.method4695((float) i, (float) i_190_, (float) (i + anInt9338), (float) (i_190_ + anInt9344), 0.0F, 0.0F, anInterface36_9337.method261(), anInterface36_9337.method244(), anInterface36_9337, i_192_);
		} else {
			aClass167_Sub3_9339.method8943();
			aClass167_Sub3_9339.method8763(i_193_);
			Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
			class328.anInterface36_3589 = anInterface36_9337;
			class328.method4304(i_191_, i_192_);
			i += anInt9341;
			i_190_ += anInt9340;
			float f = (float) aClass167_Sub3_9339.method2278((byte) -94).method2725();
			float f_194_ = (float) aClass167_Sub3_9339.method2278((byte) 8).method2726();
			class328.aClass443_3591.method5344((float) anInt9338 * 2.0F / f, ((float) anInt9344 * 2.0F / f_194_), 1.0F, 1.0F);
			class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
			class328.aClass443_3591.aFloatArray4878[13] = (((float) i_190_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_194_) - 1.0F;
			class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
			class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
			class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
			class328.anInt3588 = 0;
			class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
			class328.method4306();
		}
	}

	Class143_Sub3(Class167_Sub3 class167_sub3, Interface36 interface36, int i, int i_195_) {
		anInt9340 = 0;
		anInt9341 = 0;
		anInt9342 = 0;
		anInt9343 = 0;
		aClass167_Sub3_9339 = class167_sub3;
		anInt9338 = i;
		anInt9344 = i_195_;
		anInterface36_9337 = interface36;
		anInterface22_9336 = null;
		aBool9334 = anInterface36_9337.method1() != i;
		aBool9347 = anInterface36_9337.method78() != i_195_;
		aBool9346 = !aBool9334 && anInterface36_9337.method221();
		aBool9335 = !aBool9347 && anInterface36_9337.method221();
	}

	public void method1721(int i, int i_196_, int i_197_, int i_198_, int i_199_) {
		if (aClass167_Sub3_9339.method8726() != Class347.aClass347_3689) {
			i += anInt9341;
			i_196_ += anInt9340;
			aClass167_Sub3_9339.aClass358_9563.method4695((float) i, (float) i_196_, (float) (i + anInt9338), (float) (i_196_ + anInt9344), 0.0F, 0.0F, anInterface36_9337.method261(), anInterface36_9337.method244(), anInterface36_9337, i_198_);
		} else {
			aClass167_Sub3_9339.method8943();
			aClass167_Sub3_9339.method8763(i_199_);
			Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
			class328.anInterface36_3589 = anInterface36_9337;
			class328.method4304(i_197_, i_198_);
			i += anInt9341;
			i_196_ += anInt9340;
			float f = (float) aClass167_Sub3_9339.method2278((byte) 24).method2725();
			float f_200_ = (float) aClass167_Sub3_9339.method2278((byte) 31).method2726();
			class328.aClass443_3591.method5344((float) anInt9338 * 2.0F / f, ((float) anInt9344 * 2.0F / f_200_), 1.0F, 1.0F);
			class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
			class328.aClass443_3591.aFloatArray4878[13] = (((float) i_196_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_200_) - 1.0F;
			class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
			class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
			class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
			class328.anInt3588 = 0;
			class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
			class328.method4306();
		}
	}

	void method1758(int i, int i_201_, int i_202_, int i_203_, int i_204_, int i_205_, int i_206_, int i_207_) {
		if (aClass167_Sub3_9339.method8726() != Class347.aClass347_3689) {
			if (aBool9345) {
				i_202_ = i_202_ * anInt9338 / method12();
				i_203_ = i_203_ * anInt9344 / method1785();
				i += anInt9341 * i_202_ / anInt9338;
				i_201_ += anInt9340 * i_203_ / anInt9344;
			}
			aClass167_Sub3_9339.aClass358_9563.method4695((float) i, (float) i_201_, (float) (i + i_202_), (float) (i_201_ + i_203_), anInterface36_9337.method219(0.0F), anInterface36_9337.method220(0.0F), anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), anInterface36_9337, i_205_);
		} else {
			aClass167_Sub3_9339.method8943();
			aClass167_Sub3_9339.method8763(i_206_);
			Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
			class328.anInterface36_3589 = anInterface36_9337;
			class328.method4304(i_204_, i_205_);
			if (aBool9345) {
				i_202_ = i_202_ * anInt9338 / method12();
				i_203_ = i_203_ * anInt9344 / method1785();
				i += anInt9341 * i_202_ / anInt9338;
				i_201_ += anInt9340 * i_203_ / anInt9344;
			}
			float f = (float) aClass167_Sub3_9339.method2278((byte) -58).method2725();
			float f_208_ = (float) aClass167_Sub3_9339.method2278((byte) -1).method2726();
			class328.aClass443_3591.method5344((float) i_202_ * 2.0F / f, (float) i_203_ * 2.0F / f_208_, 1.0F, 1.0F);
			class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
			class328.aClass443_3591.aFloatArray4878[13] = (((float) i_201_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_208_) - 1.0F;
			class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
			class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
			class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
			class328.anInt3588 = 0;
			class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
			class328.method4306();
		}
	}

	void method1749(int i, int i_209_, int i_210_, int i_211_, int i_212_, int i_213_, int i_214_, int i_215_) {
		if (aClass167_Sub3_9339.method8726() != Class347.aClass347_3689) {
			if (aBool9345) {
				i_210_ = i_210_ * anInt9338 / method12();
				i_211_ = i_211_ * anInt9344 / method1785();
				i += anInt9341 * i_210_ / anInt9338;
				i_209_ += anInt9340 * i_211_ / anInt9344;
			}
			aClass167_Sub3_9339.aClass358_9563.method4695((float) i, (float) i_209_, (float) (i + i_210_), (float) (i_209_ + i_211_), anInterface36_9337.method219(0.0F), anInterface36_9337.method220(0.0F), anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), anInterface36_9337, i_213_);
		} else {
			aClass167_Sub3_9339.method8943();
			aClass167_Sub3_9339.method8763(i_214_);
			Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
			class328.anInterface36_3589 = anInterface36_9337;
			class328.method4304(i_212_, i_213_);
			if (aBool9345) {
				i_210_ = i_210_ * anInt9338 / method12();
				i_211_ = i_211_ * anInt9344 / method1785();
				i += anInt9341 * i_210_ / anInt9338;
				i_209_ += anInt9340 * i_211_ / anInt9344;
			}
			float f = (float) aClass167_Sub3_9339.method2278((byte) -3).method2725();
			float f_216_ = (float) aClass167_Sub3_9339.method2278((byte) -18).method2726();
			class328.aClass443_3591.method5344((float) i_210_ * 2.0F / f, (float) i_211_ * 2.0F / f_216_, 1.0F, 1.0F);
			class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
			class328.aClass443_3591.aFloatArray4878[13] = (((float) i_209_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_216_) - 1.0F;
			class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
			class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
			class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
			class328.anInt3588 = 0;
			class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
			class328.method4306();
		}
	}

	public void method1750(int i, int i_217_, int i_218_) {
		int[] is = aClass167_Sub3_9339.method2078(i, i_217_, anInt9338, anInt9344);
		int[] is_219_ = new int[anInt9338 * anInt9344];
		anInterface36_9337.method243(0, 0, anInt9338, anInt9344, is_219_, 0);
		if (i_218_ == 0) {
			for (int i_220_ = 0; i_220_ < anInt9344; i_220_++) {
				int i_221_ = i_220_ * anInt9338;
				for (int i_222_ = 0; i_222_ < anInt9338; i_222_++)
					is_219_[i_221_ + i_222_] = (is_219_[i_221_ + i_222_] & 0xffffff | is[i_221_ + i_222_] << 8 & ~0xffffff);
			}
		} else if (i_218_ == 1) {
			for (int i_223_ = 0; i_223_ < anInt9344; i_223_++) {
				int i_224_ = i_223_ * anInt9338;
				for (int i_225_ = 0; i_225_ < anInt9338; i_225_++)
					is_219_[i_224_ + i_225_] = (is_219_[i_224_ + i_225_] & 0xffffff | is[i_224_ + i_225_] << 16 & ~0xffffff);
			}
		} else if (i_218_ == 2) {
			for (int i_226_ = 0; i_226_ < anInt9344; i_226_++) {
				int i_227_ = i_226_ * anInt9338;
				for (int i_228_ = 0; i_228_ < anInt9338; i_228_++)
					is_219_[i_227_ + i_228_] = (is_219_[i_227_ + i_228_] & 0xffffff | is[i_227_ + i_228_] << 24 & ~0xffffff);
			}
		} else if (i_218_ == 3) {
			for (int i_229_ = 0; i_229_ < anInt9344; i_229_++) {
				int i_230_ = i_229_ * anInt9338;
				for (int i_231_ = 0; i_231_ < anInt9338; i_231_++)
					is_219_[i_230_ + i_231_] = (is_219_[i_230_ + i_231_] & 0xffffff | (is[i_230_ + i_231_] != 0 ? -16777216 : 0));
			}
		}
		method1783(0, 0, anInt9338, anInt9344, is_219_, 0, anInt9338);
	}

	public void method1737(int i, int i_232_, Class161 class161, int i_233_, int i_234_) {
		aClass167_Sub3_9339.method8943();
		Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
		class328.anInterface36_3589 = anInterface36_9337;
		class328.method4304(1, -1);
		i += anInt9341;
		i_232_ += anInt9340;
		float f = (float) aClass167_Sub3_9339.method2278((byte) 79).method2725();
		float f_235_ = (float) aClass167_Sub3_9339.method2278((byte) -77).method2726();
		class328.aClass443_3591.method5344((float) anInt9338 * 2.0F / f, (float) anInt9344 * 2.0F / f_235_, 1.0F, 1.0F);
		class328.aClass443_3591.aFloatArray4878[12] = ((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F;
		class328.aClass443_3591.aFloatArray4878[13] = (((float) i_232_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_235_) - 1.0F;
		class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
		class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
		class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
		class328.anInt3588 = 0;
		class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
		Interface36 interface36 = ((Class161_Sub1) class161).anInterface36_9385;
		class328.anInterface36_3593 = interface36;
		class328.aClass443_3595.method5344(interface36.method219((float) anInt9338), interface36.method220((float) anInt9344), 1.0F, 1.0F);
		class328.aClass443_3595.aFloatArray4878[12] = interface36.method219((float) (i - i_233_));
		class328.aClass443_3595.aFloatArray4878[13] = interface36.method220((float) (i_232_ - i_234_));
		class328.method4307();
	}

	public void method1760(int i, int i_236_, Class161 class161, int i_237_, int i_238_) {
		aClass167_Sub3_9339.method8943();
		Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
		class328.anInterface36_3589 = anInterface36_9337;
		class328.method4304(1, -1);
		i += anInt9341;
		i_236_ += anInt9340;
		float f = (float) aClass167_Sub3_9339.method2278((byte) -32).method2725();
		float f_239_ = (float) aClass167_Sub3_9339.method2278((byte) -57).method2726();
		class328.aClass443_3591.method5344((float) anInt9338 * 2.0F / f, (float) anInt9344 * 2.0F / f_239_, 1.0F, 1.0F);
		class328.aClass443_3591.aFloatArray4878[12] = ((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F;
		class328.aClass443_3591.aFloatArray4878[13] = (((float) i_236_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_239_) - 1.0F;
		class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
		class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
		class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
		class328.anInt3588 = 0;
		class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
		Interface36 interface36 = ((Class161_Sub1) class161).anInterface36_9385;
		class328.anInterface36_3593 = interface36;
		class328.aClass443_3595.method5344(interface36.method219((float) anInt9338), interface36.method220((float) anInt9344), 1.0F, 1.0F);
		class328.aClass443_3595.aFloatArray4878[12] = interface36.method219((float) (i - i_237_));
		class328.aClass443_3595.aFloatArray4878[13] = interface36.method220((float) (i_236_ - i_238_));
		class328.method4307();
	}

	public void method1762(int i, int i_240_, Class161 class161, int i_241_, int i_242_) {
		aClass167_Sub3_9339.method8943();
		Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
		class328.anInterface36_3589 = anInterface36_9337;
		class328.method4304(1, -1);
		i += anInt9341;
		i_240_ += anInt9340;
		float f = (float) aClass167_Sub3_9339.method2278((byte) 45).method2725();
		float f_243_ = (float) aClass167_Sub3_9339.method2278((byte) 10).method2726();
		class328.aClass443_3591.method5344((float) anInt9338 * 2.0F / f, (float) anInt9344 * 2.0F / f_243_, 1.0F, 1.0F);
		class328.aClass443_3591.aFloatArray4878[12] = ((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F;
		class328.aClass443_3591.aFloatArray4878[13] = (((float) i_240_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_243_) - 1.0F;
		class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
		class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
		class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
		class328.anInt3588 = 0;
		class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
		Interface36 interface36 = ((Class161_Sub1) class161).anInterface36_9385;
		class328.anInterface36_3593 = interface36;
		class328.aClass443_3595.method5344(interface36.method219((float) anInt9338), interface36.method220((float) anInt9344), 1.0F, 1.0F);
		class328.aClass443_3595.aFloatArray4878[12] = interface36.method219((float) (i - i_241_));
		class328.aClass443_3595.aFloatArray4878[13] = interface36.method220((float) (i_240_ - i_242_));
		class328.method4307();
	}

	public void method1730(int i, int i_244_, Class161 class161, int i_245_, int i_246_) {
		aClass167_Sub3_9339.method8943();
		Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
		class328.anInterface36_3589 = anInterface36_9337;
		class328.method4304(1, -1);
		i += anInt9341;
		i_244_ += anInt9340;
		float f = (float) aClass167_Sub3_9339.method2278((byte) 42).method2725();
		float f_247_ = (float) aClass167_Sub3_9339.method2278((byte) -44).method2726();
		class328.aClass443_3591.method5344((float) anInt9338 * 2.0F / f, (float) anInt9344 * 2.0F / f_247_, 1.0F, 1.0F);
		class328.aClass443_3591.aFloatArray4878[12] = ((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F;
		class328.aClass443_3591.aFloatArray4878[13] = (((float) i_244_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_247_) - 1.0F;
		class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
		class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
		class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
		class328.anInt3588 = 0;
		class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
		Interface36 interface36 = ((Class161_Sub1) class161).anInterface36_9385;
		class328.anInterface36_3593 = interface36;
		class328.aClass443_3595.method5344(interface36.method219((float) anInt9338), interface36.method220((float) anInt9344), 1.0F, 1.0F);
		class328.aClass443_3595.aFloatArray4878[12] = interface36.method219((float) (i - i_245_));
		class328.aClass443_3595.aFloatArray4878[13] = interface36.method220((float) (i_244_ - i_246_));
		class328.method4307();
	}

	public void method1764(int i, int i_248_, Class161 class161, int i_249_, int i_250_) {
		aClass167_Sub3_9339.method8943();
		Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
		class328.anInterface36_3589 = anInterface36_9337;
		class328.method4304(1, -1);
		i += anInt9341;
		i_248_ += anInt9340;
		float f = (float) aClass167_Sub3_9339.method2278((byte) 73).method2725();
		float f_251_ = (float) aClass167_Sub3_9339.method2278((byte) 47).method2726();
		class328.aClass443_3591.method5344((float) anInt9338 * 2.0F / f, (float) anInt9344 * 2.0F / f_251_, 1.0F, 1.0F);
		class328.aClass443_3591.aFloatArray4878[12] = ((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F;
		class328.aClass443_3591.aFloatArray4878[13] = (((float) i_248_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_251_) - 1.0F;
		class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
		class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
		class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
		class328.anInt3588 = 0;
		class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
		Interface36 interface36 = ((Class161_Sub1) class161).anInterface36_9385;
		class328.anInterface36_3593 = interface36;
		class328.aClass443_3595.method5344(interface36.method219((float) anInt9338), interface36.method220((float) anInt9344), 1.0F, 1.0F);
		class328.aClass443_3595.aFloatArray4878[12] = interface36.method219((float) (i - i_249_));
		class328.aClass443_3595.aFloatArray4878[13] = interface36.method220((float) (i_248_ - i_250_));
		class328.method4307();
	}

	public Interface22 method1784() {
		return anInterface22_9336;
	}

	public void method1773(int i, int i_252_, int i_253_, int i_254_, int i_255_, int i_256_, int i_257_) {
		if (aClass167_Sub3_9339.method8726() != Class347.aClass347_3689) {
			int i_258_ = i_252_ + i_254_;
			int i_259_ = i + i_253_;
			int i_260_ = method12();
			int i_261_ = method1785();
			int i_262_ = i_252_ + anInt9340;
			for (int i_263_ = i_262_ + anInt9344; i_263_ <= i_258_; i_263_ += i_261_) {
				int i_264_ = i + anInt9341;
				for (int i_265_ = i_264_ + anInt9338; i_265_ <= i_259_; i_265_ += i_260_) {
					aClass167_Sub3_9339.aClass358_9563.method4695((float) i_264_, (float) i_262_, (float) (i_264_ + anInt9338), (float) (i_262_ + anInt9344), 0.0F, 0.0F, anInterface36_9337.method261(), anInterface36_9337.method244(), anInterface36_9337, i_256_);
					i_264_ += i_260_;
				}
				if (i_264_ < i_259_) {
					int i_266_ = i_259_ - i_264_;
					aClass167_Sub3_9339.aClass358_9563.method4695((float) i_264_, (float) i_262_, (float) (i_264_ + i_266_), (float) (i_262_ + anInt9344), 0.0F, 0.0F, ((float) i_266_ / (float) anInt9338 * anInterface36_9337.method261()), anInterface36_9337.method244(), anInterface36_9337, i_256_);
				}
				i_262_ += i_261_;
			}
			if (i_262_ < i_258_) {
				int i_267_ = i_258_ - i_262_;
				float f = ((float) i_267_ / (float) anInt9344 * anInterface36_9337.method244());
				int i_268_ = i + anInt9341;
				for (int i_269_ = i_268_ + anInt9338; i_269_ <= i_259_; i_269_ += i_260_) {
					aClass167_Sub3_9339.aClass358_9563.method4695((float) i_268_, (float) i_262_, (float) (i_268_ + anInt9338), (float) (i_262_ + i_267_), 0.0F, 0.0F, anInterface36_9337.method261(), f, anInterface36_9337, i_256_);
					i_268_ += i_260_;
				}
				if (i_268_ < i_259_) {
					int i_270_ = i_259_ - i_268_;
					aClass167_Sub3_9339.aClass358_9563.method4695((float) i_268_, (float) i_262_, (float) (i_268_ + i_270_), (float) (i_262_ + i_267_), 0.0F, 0.0F, ((float) i_270_ / (float) anInt9338 * anInterface36_9337.method261()), f, anInterface36_9337, i_256_);
				}
			}
		} else {
			aClass167_Sub3_9339.method8943();
			aClass167_Sub3_9339.method8763(i_257_);
			Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
			class328.anInterface36_3589 = anInterface36_9337;
			class328.method4304(i_255_, i_256_);
			float f = (float) aClass167_Sub3_9339.method2278((byte) 56).method2725();
			float f_271_ = (float) aClass167_Sub3_9339.method2278((byte) -72).method2726();
			class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
			class328.anInt3588 = 0;
			class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
			boolean bool = aBool9335 && anInt9340 == 0 && anInt9342 == 0;
			boolean bool_272_ = aBool9346 && anInt9341 == 0 && anInt9343 == 0;
			if (bool_272_ & bool) {
				class328.aClass443_3591.method5344((float) i_253_ * 2.0F / f, ((float) i_254_ * 2.0F / f_271_), 1.0F, 1.0F);
				class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
				class328.aClass443_3591.aFloatArray4878[13] = (((float) i_252_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_271_) - 1.0F;
				class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
				class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_253_), anInterface36_9337.method220((float) i_254_), 1.0F, 1.0F);
				class328.method4306();
			} else if (bool_272_) {
				int i_273_ = i_252_ + i_254_;
				int i_274_ = method1785();
				class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_253_), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
				int i_275_ = i_252_ + anInt9340;
				for (int i_276_ = i_275_ + anInt9344; i_276_ <= i_273_; i_276_ += i_274_) {
					class328.aClass443_3591.method5344(((float) i_253_ * 2.0F / f), ((float) anInt9344 * 2.0F / f_271_), 1.0F, 1.0F);
					class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[13] = (((float) i_275_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_271_) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
					class328.method4306();
					i_275_ += i_274_;
				}
				if (i_275_ < i_273_) {
					int i_277_ = i_273_ - i_275_;
					class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_253_), anInterface36_9337.method220((float) i_277_), 1.0F, 1.0F);
					class328.aClass443_3591.method5344(((float) i_253_ * 2.0F / f), ((float) i_277_ * 2.0F / f_271_), 1.0F, 1.0F);
					class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[13] = (((float) i_275_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_271_) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
					class328.method4306();
				}
			} else if (bool) {
				int i_278_ = i + i_253_;
				int i_279_ = method12();
				class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) i_254_), 1.0F, 1.0F);
				int i_280_ = i + anInt9341;
				for (int i_281_ = i_280_ + anInt9338; i_281_ <= i_278_; i_281_ += i_279_) {
					class328.aClass443_3591.method5344(((float) anInt9338 * 2.0F / f), ((float) i_254_ * 2.0F / f_271_), 1.0F, 1.0F);
					class328.aClass443_3591.aFloatArray4878[12] = (((float) i_280_ + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[13] = (((float) i_252_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_271_) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
					class328.method4306();
					i_280_ += i_279_;
				}
				if (i_280_ < i_278_) {
					int i_282_ = i_278_ - i_280_;
					class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_282_), anInterface36_9337.method220((float) i_254_), 1.0F, 1.0F);
					class328.aClass443_3591.method5344(((float) i_282_ * 2.0F / f), ((float) i_254_ * 2.0F / f_271_), 1.0F, 1.0F);
					class328.aClass443_3591.aFloatArray4878[12] = (((float) i_280_ + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[13] = (((float) i_252_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_271_) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
					class328.method4306();
				}
			} else {
				int i_283_ = i_252_ + i_254_;
				int i_284_ = i + i_253_;
				int i_285_ = method12();
				int i_286_ = method1785();
				int i_287_ = i_252_ + anInt9340;
				for (int i_288_ = i_287_ + anInt9344; i_288_ <= i_283_; i_288_ += i_286_) {
					class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
					int i_289_ = i + anInt9341;
					for (int i_290_ = i_289_ + anInt9338; i_290_ <= i_284_; i_290_ += i_285_) {
						class328.aClass443_3591.method5344(((float) anInt9338 * 2.0F / f), ((float) anInt9344 * 2.0F / f_271_), 1.0F, 1.0F);
						class328.aClass443_3591.aFloatArray4878[12] = (((float) i_289_ + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
						class328.aClass443_3591.aFloatArray4878[13] = (((float) i_287_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_271_) - 1.0F;
						class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
						class328.method4306();
						i_289_ += i_285_;
					}
					if (i_289_ < i_284_) {
						int i_291_ = i_284_ - i_289_;
						class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_291_), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
						class328.aClass443_3591.method5344(((float) i_291_ * 2.0F / f), ((float) anInt9344 * 2.0F / f_271_), 1.0F, 1.0F);
						class328.aClass443_3591.aFloatArray4878[12] = (((float) i_289_ + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
						class328.aClass443_3591.aFloatArray4878[13] = (((float) i_287_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_271_) - 1.0F;
						class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
						class328.method4306();
					}
					i_287_ += i_286_;
				}
				if (i_287_ < i_283_) {
					int i_292_ = i_283_ - i_287_;
					class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) i_292_), 1.0F, 1.0F);
					int i_293_ = i + anInt9341;
					for (int i_294_ = i_293_ + anInt9338; i_294_ <= i_284_; i_294_ += i_285_) {
						class328.aClass443_3591.method5344(((float) anInt9338 * 2.0F / f), ((float) i_292_ * 2.0F / f_271_), 1.0F, 1.0F);
						class328.aClass443_3591.aFloatArray4878[12] = (((float) i_293_ + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
						class328.aClass443_3591.aFloatArray4878[13] = (((float) i_287_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_271_) - 1.0F;
						class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
						class328.method4306();
						i_293_ += i_285_;
					}
					if (i_293_ < i_284_) {
						int i_295_ = i_284_ - i_293_;
						class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_295_), anInterface36_9337.method220((float) i_292_), 1.0F, 1.0F);
						class328.aClass443_3591.method5344(((float) i_295_ * 2.0F / f), ((float) i_292_ * 2.0F / f_271_), 1.0F, 1.0F);
						class328.aClass443_3591.aFloatArray4878[12] = (((float) i_293_ + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
						class328.aClass443_3591.aFloatArray4878[13] = (((float) i_287_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_271_) - 1.0F;
						class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
						class328.method4306();
					}
				}
			}
		}
	}

	public void method1754(int i, int i_296_, Class161 class161, int i_297_, int i_298_) {
		aClass167_Sub3_9339.method8943();
		Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
		class328.anInterface36_3589 = anInterface36_9337;
		class328.method4304(1, -1);
		i += anInt9341;
		i_296_ += anInt9340;
		float f = (float) aClass167_Sub3_9339.method2278((byte) -95).method2725();
		float f_299_ = (float) aClass167_Sub3_9339.method2278((byte) 3).method2726();
		class328.aClass443_3591.method5344((float) anInt9338 * 2.0F / f, (float) anInt9344 * 2.0F / f_299_, 1.0F, 1.0F);
		class328.aClass443_3591.aFloatArray4878[12] = ((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F;
		class328.aClass443_3591.aFloatArray4878[13] = (((float) i_296_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_299_) - 1.0F;
		class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
		class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
		class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
		class328.anInt3588 = 0;
		class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
		Interface36 interface36 = ((Class161_Sub1) class161).anInterface36_9385;
		class328.anInterface36_3593 = interface36;
		class328.aClass443_3595.method5344(interface36.method219((float) anInt9338), interface36.method220((float) anInt9344), 1.0F, 1.0F);
		class328.aClass443_3595.aFloatArray4878[12] = interface36.method219((float) (i - i_297_));
		class328.aClass443_3595.aFloatArray4878[13] = interface36.method220((float) (i_296_ - i_298_));
		class328.method4307();
	}

	public void method1768(int[] is) {
		is[0] = anInt9341;
		is[1] = anInt9340;
		is[2] = anInt9343;
		is[3] = anInt9342;
	}

	public void method1748(int i, int i_300_, int i_301_, int i_302_, int i_303_, int i_304_) {
		anInterface36_9337.method231(i, i_300_, i_301_, i_302_, i_303_, i_304_);
	}

	public int method12() {
		return anInt9338 + anInt9341 + anInt9343;
	}

	public int method1769() {
		return anInt9344;
	}

	public int method1767() {
		return anInt9338;
	}

	public void method1774(int i, int i_305_, int i_306_, int i_307_, int i_308_, int i_309_, int i_310_) {
		if (aClass167_Sub3_9339.method8726() != Class347.aClass347_3689) {
			int i_311_ = i_305_ + i_307_;
			int i_312_ = i + i_306_;
			int i_313_ = method12();
			int i_314_ = method1785();
			int i_315_ = i_305_ + anInt9340;
			for (int i_316_ = i_315_ + anInt9344; i_316_ <= i_311_; i_316_ += i_314_) {
				int i_317_ = i + anInt9341;
				for (int i_318_ = i_317_ + anInt9338; i_318_ <= i_312_; i_318_ += i_313_) {
					aClass167_Sub3_9339.aClass358_9563.method4695((float) i_317_, (float) i_315_, (float) (i_317_ + anInt9338), (float) (i_315_ + anInt9344), 0.0F, 0.0F, anInterface36_9337.method261(), anInterface36_9337.method244(), anInterface36_9337, i_309_);
					i_317_ += i_313_;
				}
				if (i_317_ < i_312_) {
					int i_319_ = i_312_ - i_317_;
					aClass167_Sub3_9339.aClass358_9563.method4695((float) i_317_, (float) i_315_, (float) (i_317_ + i_319_), (float) (i_315_ + anInt9344), 0.0F, 0.0F, ((float) i_319_ / (float) anInt9338 * anInterface36_9337.method261()), anInterface36_9337.method244(), anInterface36_9337, i_309_);
				}
				i_315_ += i_314_;
			}
			if (i_315_ < i_311_) {
				int i_320_ = i_311_ - i_315_;
				float f = ((float) i_320_ / (float) anInt9344 * anInterface36_9337.method244());
				int i_321_ = i + anInt9341;
				for (int i_322_ = i_321_ + anInt9338; i_322_ <= i_312_; i_322_ += i_313_) {
					aClass167_Sub3_9339.aClass358_9563.method4695((float) i_321_, (float) i_315_, (float) (i_321_ + anInt9338), (float) (i_315_ + i_320_), 0.0F, 0.0F, anInterface36_9337.method261(), f, anInterface36_9337, i_309_);
					i_321_ += i_313_;
				}
				if (i_321_ < i_312_) {
					int i_323_ = i_312_ - i_321_;
					aClass167_Sub3_9339.aClass358_9563.method4695((float) i_321_, (float) i_315_, (float) (i_321_ + i_323_), (float) (i_315_ + i_320_), 0.0F, 0.0F, ((float) i_323_ / (float) anInt9338 * anInterface36_9337.method261()), f, anInterface36_9337, i_309_);
				}
			}
		} else {
			aClass167_Sub3_9339.method8943();
			aClass167_Sub3_9339.method8763(i_310_);
			Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
			class328.anInterface36_3589 = anInterface36_9337;
			class328.method4304(i_308_, i_309_);
			float f = (float) aClass167_Sub3_9339.method2278((byte) -18).method2725();
			float f_324_ = (float) aClass167_Sub3_9339.method2278((byte) 20).method2726();
			class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
			class328.anInt3588 = 0;
			class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
			boolean bool = aBool9335 && anInt9340 == 0 && anInt9342 == 0;
			boolean bool_325_ = aBool9346 && anInt9341 == 0 && anInt9343 == 0;
			if (bool_325_ & bool) {
				class328.aClass443_3591.method5344((float) i_306_ * 2.0F / f, ((float) i_307_ * 2.0F / f_324_), 1.0F, 1.0F);
				class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
				class328.aClass443_3591.aFloatArray4878[13] = (((float) i_305_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_324_) - 1.0F;
				class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
				class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_306_), anInterface36_9337.method220((float) i_307_), 1.0F, 1.0F);
				class328.method4306();
			} else if (bool_325_) {
				int i_326_ = i_305_ + i_307_;
				int i_327_ = method1785();
				class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_306_), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
				int i_328_ = i_305_ + anInt9340;
				for (int i_329_ = i_328_ + anInt9344; i_329_ <= i_326_; i_329_ += i_327_) {
					class328.aClass443_3591.method5344(((float) i_306_ * 2.0F / f), ((float) anInt9344 * 2.0F / f_324_), 1.0F, 1.0F);
					class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[13] = (((float) i_328_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_324_) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
					class328.method4306();
					i_328_ += i_327_;
				}
				if (i_328_ < i_326_) {
					int i_330_ = i_326_ - i_328_;
					class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_306_), anInterface36_9337.method220((float) i_330_), 1.0F, 1.0F);
					class328.aClass443_3591.method5344(((float) i_306_ * 2.0F / f), ((float) i_330_ * 2.0F / f_324_), 1.0F, 1.0F);
					class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[13] = (((float) i_328_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_324_) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
					class328.method4306();
				}
			} else if (bool) {
				int i_331_ = i + i_306_;
				int i_332_ = method12();
				class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) i_307_), 1.0F, 1.0F);
				int i_333_ = i + anInt9341;
				for (int i_334_ = i_333_ + anInt9338; i_334_ <= i_331_; i_334_ += i_332_) {
					class328.aClass443_3591.method5344(((float) anInt9338 * 2.0F / f), ((float) i_307_ * 2.0F / f_324_), 1.0F, 1.0F);
					class328.aClass443_3591.aFloatArray4878[12] = (((float) i_333_ + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[13] = (((float) i_305_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_324_) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
					class328.method4306();
					i_333_ += i_332_;
				}
				if (i_333_ < i_331_) {
					int i_335_ = i_331_ - i_333_;
					class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_335_), anInterface36_9337.method220((float) i_307_), 1.0F, 1.0F);
					class328.aClass443_3591.method5344(((float) i_335_ * 2.0F / f), ((float) i_307_ * 2.0F / f_324_), 1.0F, 1.0F);
					class328.aClass443_3591.aFloatArray4878[12] = (((float) i_333_ + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[13] = (((float) i_305_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_324_) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
					class328.method4306();
				}
			} else {
				int i_336_ = i_305_ + i_307_;
				int i_337_ = i + i_306_;
				int i_338_ = method12();
				int i_339_ = method1785();
				int i_340_ = i_305_ + anInt9340;
				for (int i_341_ = i_340_ + anInt9344; i_341_ <= i_336_; i_341_ += i_339_) {
					class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
					int i_342_ = i + anInt9341;
					for (int i_343_ = i_342_ + anInt9338; i_343_ <= i_337_; i_343_ += i_338_) {
						class328.aClass443_3591.method5344(((float) anInt9338 * 2.0F / f), ((float) anInt9344 * 2.0F / f_324_), 1.0F, 1.0F);
						class328.aClass443_3591.aFloatArray4878[12] = (((float) i_342_ + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
						class328.aClass443_3591.aFloatArray4878[13] = (((float) i_340_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_324_) - 1.0F;
						class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
						class328.method4306();
						i_342_ += i_338_;
					}
					if (i_342_ < i_337_) {
						int i_344_ = i_337_ - i_342_;
						class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_344_), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
						class328.aClass443_3591.method5344(((float) i_344_ * 2.0F / f), ((float) anInt9344 * 2.0F / f_324_), 1.0F, 1.0F);
						class328.aClass443_3591.aFloatArray4878[12] = (((float) i_342_ + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
						class328.aClass443_3591.aFloatArray4878[13] = (((float) i_340_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_324_) - 1.0F;
						class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
						class328.method4306();
					}
					i_340_ += i_339_;
				}
				if (i_340_ < i_336_) {
					int i_345_ = i_336_ - i_340_;
					class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) i_345_), 1.0F, 1.0F);
					int i_346_ = i + anInt9341;
					for (int i_347_ = i_346_ + anInt9338; i_347_ <= i_337_; i_347_ += i_338_) {
						class328.aClass443_3591.method5344(((float) anInt9338 * 2.0F / f), ((float) i_345_ * 2.0F / f_324_), 1.0F, 1.0F);
						class328.aClass443_3591.aFloatArray4878[12] = (((float) i_346_ + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
						class328.aClass443_3591.aFloatArray4878[13] = (((float) i_340_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_324_) - 1.0F;
						class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
						class328.method4306();
						i_346_ += i_338_;
					}
					if (i_346_ < i_337_) {
						int i_348_ = i_337_ - i_346_;
						class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_348_), anInterface36_9337.method220((float) i_345_), 1.0F, 1.0F);
						class328.aClass443_3591.method5344(((float) i_348_ * 2.0F / f), ((float) i_345_ * 2.0F / f_324_), 1.0F, 1.0F);
						class328.aClass443_3591.aFloatArray4878[12] = (((float) i_346_ + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
						class328.aClass443_3591.aFloatArray4878[13] = (((float) i_340_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_324_) - 1.0F;
						class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
						class328.method4306();
					}
				}
			}
		}
	}

	public void method1759(int i, int i_349_, int i_350_, int i_351_, int i_352_, int i_353_, int i_354_) {
		if (aClass167_Sub3_9339.method8726() != Class347.aClass347_3689) {
			int i_355_ = i_349_ + i_351_;
			int i_356_ = i + i_350_;
			int i_357_ = method12();
			int i_358_ = method1785();
			int i_359_ = i_349_ + anInt9340;
			for (int i_360_ = i_359_ + anInt9344; i_360_ <= i_355_; i_360_ += i_358_) {
				int i_361_ = i + anInt9341;
				for (int i_362_ = i_361_ + anInt9338; i_362_ <= i_356_; i_362_ += i_357_) {
					aClass167_Sub3_9339.aClass358_9563.method4695((float) i_361_, (float) i_359_, (float) (i_361_ + anInt9338), (float) (i_359_ + anInt9344), 0.0F, 0.0F, anInterface36_9337.method261(), anInterface36_9337.method244(), anInterface36_9337, i_353_);
					i_361_ += i_357_;
				}
				if (i_361_ < i_356_) {
					int i_363_ = i_356_ - i_361_;
					aClass167_Sub3_9339.aClass358_9563.method4695((float) i_361_, (float) i_359_, (float) (i_361_ + i_363_), (float) (i_359_ + anInt9344), 0.0F, 0.0F, ((float) i_363_ / (float) anInt9338 * anInterface36_9337.method261()), anInterface36_9337.method244(), anInterface36_9337, i_353_);
				}
				i_359_ += i_358_;
			}
			if (i_359_ < i_355_) {
				int i_364_ = i_355_ - i_359_;
				float f = ((float) i_364_ / (float) anInt9344 * anInterface36_9337.method244());
				int i_365_ = i + anInt9341;
				for (int i_366_ = i_365_ + anInt9338; i_366_ <= i_356_; i_366_ += i_357_) {
					aClass167_Sub3_9339.aClass358_9563.method4695((float) i_365_, (float) i_359_, (float) (i_365_ + anInt9338), (float) (i_359_ + i_364_), 0.0F, 0.0F, anInterface36_9337.method261(), f, anInterface36_9337, i_353_);
					i_365_ += i_357_;
				}
				if (i_365_ < i_356_) {
					int i_367_ = i_356_ - i_365_;
					aClass167_Sub3_9339.aClass358_9563.method4695((float) i_365_, (float) i_359_, (float) (i_365_ + i_367_), (float) (i_359_ + i_364_), 0.0F, 0.0F, ((float) i_367_ / (float) anInt9338 * anInterface36_9337.method261()), f, anInterface36_9337, i_353_);
				}
			}
		} else {
			aClass167_Sub3_9339.method8943();
			aClass167_Sub3_9339.method8763(i_354_);
			Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
			class328.anInterface36_3589 = anInterface36_9337;
			class328.method4304(i_352_, i_353_);
			float f = (float) aClass167_Sub3_9339.method2278((byte) -3).method2725();
			float f_368_ = (float) aClass167_Sub3_9339.method2278((byte) 59).method2726();
			class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
			class328.anInt3588 = 0;
			class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
			boolean bool = aBool9335 && anInt9340 == 0 && anInt9342 == 0;
			boolean bool_369_ = aBool9346 && anInt9341 == 0 && anInt9343 == 0;
			if (bool_369_ & bool) {
				class328.aClass443_3591.method5344((float) i_350_ * 2.0F / f, ((float) i_351_ * 2.0F / f_368_), 1.0F, 1.0F);
				class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
				class328.aClass443_3591.aFloatArray4878[13] = (((float) i_349_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_368_) - 1.0F;
				class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
				class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_350_), anInterface36_9337.method220((float) i_351_), 1.0F, 1.0F);
				class328.method4306();
			} else if (bool_369_) {
				int i_370_ = i_349_ + i_351_;
				int i_371_ = method1785();
				class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_350_), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
				int i_372_ = i_349_ + anInt9340;
				for (int i_373_ = i_372_ + anInt9344; i_373_ <= i_370_; i_373_ += i_371_) {
					class328.aClass443_3591.method5344(((float) i_350_ * 2.0F / f), ((float) anInt9344 * 2.0F / f_368_), 1.0F, 1.0F);
					class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[13] = (((float) i_372_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_368_) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
					class328.method4306();
					i_372_ += i_371_;
				}
				if (i_372_ < i_370_) {
					int i_374_ = i_370_ - i_372_;
					class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_350_), anInterface36_9337.method220((float) i_374_), 1.0F, 1.0F);
					class328.aClass443_3591.method5344(((float) i_350_ * 2.0F / f), ((float) i_374_ * 2.0F / f_368_), 1.0F, 1.0F);
					class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[13] = (((float) i_372_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_368_) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
					class328.method4306();
				}
			} else if (bool) {
				int i_375_ = i + i_350_;
				int i_376_ = method12();
				class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) i_351_), 1.0F, 1.0F);
				int i_377_ = i + anInt9341;
				for (int i_378_ = i_377_ + anInt9338; i_378_ <= i_375_; i_378_ += i_376_) {
					class328.aClass443_3591.method5344(((float) anInt9338 * 2.0F / f), ((float) i_351_ * 2.0F / f_368_), 1.0F, 1.0F);
					class328.aClass443_3591.aFloatArray4878[12] = (((float) i_377_ + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[13] = (((float) i_349_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_368_) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
					class328.method4306();
					i_377_ += i_376_;
				}
				if (i_377_ < i_375_) {
					int i_379_ = i_375_ - i_377_;
					class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_379_), anInterface36_9337.method220((float) i_351_), 1.0F, 1.0F);
					class328.aClass443_3591.method5344(((float) i_379_ * 2.0F / f), ((float) i_351_ * 2.0F / f_368_), 1.0F, 1.0F);
					class328.aClass443_3591.aFloatArray4878[12] = (((float) i_377_ + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[13] = (((float) i_349_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_368_) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
					class328.method4306();
				}
			} else {
				int i_380_ = i_349_ + i_351_;
				int i_381_ = i + i_350_;
				int i_382_ = method12();
				int i_383_ = method1785();
				int i_384_ = i_349_ + anInt9340;
				for (int i_385_ = i_384_ + anInt9344; i_385_ <= i_380_; i_385_ += i_383_) {
					class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
					int i_386_ = i + anInt9341;
					for (int i_387_ = i_386_ + anInt9338; i_387_ <= i_381_; i_387_ += i_382_) {
						class328.aClass443_3591.method5344(((float) anInt9338 * 2.0F / f), ((float) anInt9344 * 2.0F / f_368_), 1.0F, 1.0F);
						class328.aClass443_3591.aFloatArray4878[12] = (((float) i_386_ + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
						class328.aClass443_3591.aFloatArray4878[13] = (((float) i_384_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_368_) - 1.0F;
						class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
						class328.method4306();
						i_386_ += i_382_;
					}
					if (i_386_ < i_381_) {
						int i_388_ = i_381_ - i_386_;
						class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_388_), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
						class328.aClass443_3591.method5344(((float) i_388_ * 2.0F / f), ((float) anInt9344 * 2.0F / f_368_), 1.0F, 1.0F);
						class328.aClass443_3591.aFloatArray4878[12] = (((float) i_386_ + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
						class328.aClass443_3591.aFloatArray4878[13] = (((float) i_384_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_368_) - 1.0F;
						class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
						class328.method4306();
					}
					i_384_ += i_383_;
				}
				if (i_384_ < i_380_) {
					int i_389_ = i_380_ - i_384_;
					class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) i_389_), 1.0F, 1.0F);
					int i_390_ = i + anInt9341;
					for (int i_391_ = i_390_ + anInt9338; i_391_ <= i_381_; i_391_ += i_382_) {
						class328.aClass443_3591.method5344(((float) anInt9338 * 2.0F / f), ((float) i_389_ * 2.0F / f_368_), 1.0F, 1.0F);
						class328.aClass443_3591.aFloatArray4878[12] = (((float) i_390_ + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
						class328.aClass443_3591.aFloatArray4878[13] = (((float) i_384_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_368_) - 1.0F;
						class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
						class328.method4306();
						i_390_ += i_382_;
					}
					if (i_390_ < i_381_) {
						int i_392_ = i_381_ - i_390_;
						class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_392_), anInterface36_9337.method220((float) i_389_), 1.0F, 1.0F);
						class328.aClass443_3591.method5344(((float) i_392_ * 2.0F / f), ((float) i_389_ * 2.0F / f_368_), 1.0F, 1.0F);
						class328.aClass443_3591.aFloatArray4878[12] = (((float) i_390_ + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
						class328.aClass443_3591.aFloatArray4878[13] = (((float) i_384_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_368_) - 1.0F;
						class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
						class328.method4306();
					}
				}
			}
		}
	}

	public void method1772(int i, int i_393_, int i_394_, int i_395_, int i_396_, int i_397_, int i_398_) {
		if (aClass167_Sub3_9339.method8726() != Class347.aClass347_3689) {
			int i_399_ = i_393_ + i_395_;
			int i_400_ = i + i_394_;
			int i_401_ = method12();
			int i_402_ = method1785();
			int i_403_ = i_393_ + anInt9340;
			for (int i_404_ = i_403_ + anInt9344; i_404_ <= i_399_; i_404_ += i_402_) {
				int i_405_ = i + anInt9341;
				for (int i_406_ = i_405_ + anInt9338; i_406_ <= i_400_; i_406_ += i_401_) {
					aClass167_Sub3_9339.aClass358_9563.method4695((float) i_405_, (float) i_403_, (float) (i_405_ + anInt9338), (float) (i_403_ + anInt9344), 0.0F, 0.0F, anInterface36_9337.method261(), anInterface36_9337.method244(), anInterface36_9337, i_397_);
					i_405_ += i_401_;
				}
				if (i_405_ < i_400_) {
					int i_407_ = i_400_ - i_405_;
					aClass167_Sub3_9339.aClass358_9563.method4695((float) i_405_, (float) i_403_, (float) (i_405_ + i_407_), (float) (i_403_ + anInt9344), 0.0F, 0.0F, ((float) i_407_ / (float) anInt9338 * anInterface36_9337.method261()), anInterface36_9337.method244(), anInterface36_9337, i_397_);
				}
				i_403_ += i_402_;
			}
			if (i_403_ < i_399_) {
				int i_408_ = i_399_ - i_403_;
				float f = ((float) i_408_ / (float) anInt9344 * anInterface36_9337.method244());
				int i_409_ = i + anInt9341;
				for (int i_410_ = i_409_ + anInt9338; i_410_ <= i_400_; i_410_ += i_401_) {
					aClass167_Sub3_9339.aClass358_9563.method4695((float) i_409_, (float) i_403_, (float) (i_409_ + anInt9338), (float) (i_403_ + i_408_), 0.0F, 0.0F, anInterface36_9337.method261(), f, anInterface36_9337, i_397_);
					i_409_ += i_401_;
				}
				if (i_409_ < i_400_) {
					int i_411_ = i_400_ - i_409_;
					aClass167_Sub3_9339.aClass358_9563.method4695((float) i_409_, (float) i_403_, (float) (i_409_ + i_411_), (float) (i_403_ + i_408_), 0.0F, 0.0F, ((float) i_411_ / (float) anInt9338 * anInterface36_9337.method261()), f, anInterface36_9337, i_397_);
				}
			}
		} else {
			aClass167_Sub3_9339.method8943();
			aClass167_Sub3_9339.method8763(i_398_);
			Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
			class328.anInterface36_3589 = anInterface36_9337;
			class328.method4304(i_396_, i_397_);
			float f = (float) aClass167_Sub3_9339.method2278((byte) 68).method2725();
			float f_412_ = (float) aClass167_Sub3_9339.method2278((byte) 53).method2726();
			class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
			class328.anInt3588 = 0;
			class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
			boolean bool = aBool9335 && anInt9340 == 0 && anInt9342 == 0;
			boolean bool_413_ = aBool9346 && anInt9341 == 0 && anInt9343 == 0;
			if (bool_413_ & bool) {
				class328.aClass443_3591.method5344((float) i_394_ * 2.0F / f, ((float) i_395_ * 2.0F / f_412_), 1.0F, 1.0F);
				class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
				class328.aClass443_3591.aFloatArray4878[13] = (((float) i_393_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_412_) - 1.0F;
				class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
				class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_394_), anInterface36_9337.method220((float) i_395_), 1.0F, 1.0F);
				class328.method4306();
			} else if (bool_413_) {
				int i_414_ = i_393_ + i_395_;
				int i_415_ = method1785();
				class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_394_), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
				int i_416_ = i_393_ + anInt9340;
				for (int i_417_ = i_416_ + anInt9344; i_417_ <= i_414_; i_417_ += i_415_) {
					class328.aClass443_3591.method5344(((float) i_394_ * 2.0F / f), ((float) anInt9344 * 2.0F / f_412_), 1.0F, 1.0F);
					class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[13] = (((float) i_416_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_412_) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
					class328.method4306();
					i_416_ += i_415_;
				}
				if (i_416_ < i_414_) {
					int i_418_ = i_414_ - i_416_;
					class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_394_), anInterface36_9337.method220((float) i_418_), 1.0F, 1.0F);
					class328.aClass443_3591.method5344(((float) i_394_ * 2.0F / f), ((float) i_418_ * 2.0F / f_412_), 1.0F, 1.0F);
					class328.aClass443_3591.aFloatArray4878[12] = (((float) i + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[13] = (((float) i_416_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_412_) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
					class328.method4306();
				}
			} else if (bool) {
				int i_419_ = i + i_394_;
				int i_420_ = method12();
				class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) i_395_), 1.0F, 1.0F);
				int i_421_ = i + anInt9341;
				for (int i_422_ = i_421_ + anInt9338; i_422_ <= i_419_; i_422_ += i_420_) {
					class328.aClass443_3591.method5344(((float) anInt9338 * 2.0F / f), ((float) i_395_ * 2.0F / f_412_), 1.0F, 1.0F);
					class328.aClass443_3591.aFloatArray4878[12] = (((float) i_421_ + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[13] = (((float) i_393_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_412_) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
					class328.method4306();
					i_421_ += i_420_;
				}
				if (i_421_ < i_419_) {
					int i_423_ = i_419_ - i_421_;
					class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_423_), anInterface36_9337.method220((float) i_395_), 1.0F, 1.0F);
					class328.aClass443_3591.method5344(((float) i_423_ * 2.0F / f), ((float) i_395_ * 2.0F / f_412_), 1.0F, 1.0F);
					class328.aClass443_3591.aFloatArray4878[12] = (((float) i_421_ + aClass167_Sub3_9339.method8725()) * 2.0F / f) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[13] = (((float) i_393_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_412_) - 1.0F;
					class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
					class328.method4306();
				}
			} else {
				int i_424_ = i_393_ + i_395_;
				int i_425_ = i + i_394_;
				int i_426_ = method12();
				int i_427_ = method1785();
				int i_428_ = i_393_ + anInt9340;
				for (int i_429_ = i_428_ + anInt9344; i_429_ <= i_424_; i_429_ += i_427_) {
					class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
					int i_430_ = i + anInt9341;
					for (int i_431_ = i_430_ + anInt9338; i_431_ <= i_425_; i_431_ += i_426_) {
						class328.aClass443_3591.method5344(((float) anInt9338 * 2.0F / f), ((float) anInt9344 * 2.0F / f_412_), 1.0F, 1.0F);
						class328.aClass443_3591.aFloatArray4878[12] = (((float) i_430_ + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
						class328.aClass443_3591.aFloatArray4878[13] = (((float) i_428_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_412_) - 1.0F;
						class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
						class328.method4306();
						i_430_ += i_426_;
					}
					if (i_430_ < i_425_) {
						int i_432_ = i_425_ - i_430_;
						class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_432_), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
						class328.aClass443_3591.method5344(((float) i_432_ * 2.0F / f), ((float) anInt9344 * 2.0F / f_412_), 1.0F, 1.0F);
						class328.aClass443_3591.aFloatArray4878[12] = (((float) i_430_ + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
						class328.aClass443_3591.aFloatArray4878[13] = (((float) i_428_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_412_) - 1.0F;
						class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
						class328.method4306();
					}
					i_428_ += i_427_;
				}
				if (i_428_ < i_424_) {
					int i_433_ = i_424_ - i_428_;
					class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) i_433_), 1.0F, 1.0F);
					int i_434_ = i + anInt9341;
					for (int i_435_ = i_434_ + anInt9338; i_435_ <= i_425_; i_435_ += i_426_) {
						class328.aClass443_3591.method5344(((float) anInt9338 * 2.0F / f), ((float) i_433_ * 2.0F / f_412_), 1.0F, 1.0F);
						class328.aClass443_3591.aFloatArray4878[12] = (((float) i_434_ + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
						class328.aClass443_3591.aFloatArray4878[13] = (((float) i_428_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_412_) - 1.0F;
						class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
						class328.method4306();
						i_434_ += i_426_;
					}
					if (i_434_ < i_425_) {
						int i_436_ = i_425_ - i_434_;
						class328.aClass443_3592.method5344(anInterface36_9337.method219((float) i_436_), anInterface36_9337.method220((float) i_433_), 1.0F, 1.0F);
						class328.aClass443_3591.method5344(((float) i_436_ * 2.0F / f), ((float) i_433_ * 2.0F / f_412_), 1.0F, 1.0F);
						class328.aClass443_3591.aFloatArray4878[12] = (((float) i_434_ + aClass167_Sub3_9339.method8725()) * 2.0F / f - 1.0F);
						class328.aClass443_3591.aFloatArray4878[13] = (((float) i_428_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_412_) - 1.0F;
						class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
						class328.method4306();
					}
				}
			}
		}
	}

	public void method1765(int i, int i_437_, int i_438_, int i_439_) {
		anInt9341 = i;
		anInt9340 = i_437_;
		anInt9343 = i_438_;
		anInt9342 = i_439_;
		aBool9345 = (anInt9341 != 0 || anInt9340 != 0 || anInt9343 != 0 || anInt9342 != 0);
	}

	public void method1742(int i, int i_440_, int i_441_) {
		int[] is = aClass167_Sub3_9339.method2078(i, i_440_, anInt9338, anInt9344);
		int[] is_442_ = new int[anInt9338 * anInt9344];
		anInterface36_9337.method243(0, 0, anInt9338, anInt9344, is_442_, 0);
		if (i_441_ == 0) {
			for (int i_443_ = 0; i_443_ < anInt9344; i_443_++) {
				int i_444_ = i_443_ * anInt9338;
				for (int i_445_ = 0; i_445_ < anInt9338; i_445_++)
					is_442_[i_444_ + i_445_] = (is_442_[i_444_ + i_445_] & 0xffffff | is[i_444_ + i_445_] << 8 & ~0xffffff);
			}
		} else if (i_441_ == 1) {
			for (int i_446_ = 0; i_446_ < anInt9344; i_446_++) {
				int i_447_ = i_446_ * anInt9338;
				for (int i_448_ = 0; i_448_ < anInt9338; i_448_++)
					is_442_[i_447_ + i_448_] = (is_442_[i_447_ + i_448_] & 0xffffff | is[i_447_ + i_448_] << 16 & ~0xffffff);
			}
		} else if (i_441_ == 2) {
			for (int i_449_ = 0; i_449_ < anInt9344; i_449_++) {
				int i_450_ = i_449_ * anInt9338;
				for (int i_451_ = 0; i_451_ < anInt9338; i_451_++)
					is_442_[i_450_ + i_451_] = (is_442_[i_450_ + i_451_] & 0xffffff | is[i_450_ + i_451_] << 24 & ~0xffffff);
			}
		} else if (i_441_ == 3) {
			for (int i_452_ = 0; i_452_ < anInt9344; i_452_++) {
				int i_453_ = i_452_ * anInt9338;
				for (int i_454_ = 0; i_454_ < anInt9338; i_454_++)
					is_442_[i_453_ + i_454_] = (is_442_[i_453_ + i_454_] & 0xffffff | (is[i_453_ + i_454_] != 0 ? -16777216 : 0));
			}
		}
		method1783(0, 0, anInt9338, anInt9344, is_442_, 0, anInt9338);
	}

	void method1775(float f, float f_455_, float f_456_, float f_457_, float f_458_, float f_459_, int i, int i_460_, int i_461_, int i_462_) {
		if (aClass167_Sub3_9339.method8726() != Class347.aClass347_3689)
			aClass167_Sub3_9339.aClass358_9563.method4697(f, f_455_, f_456_, f_457_, f_458_, f_459_, f_456_ + f_458_ - f, f_457_ + f_459_ - f_455_, 0.0F, 0.0F, anInterface36_9337.method261(), 0.0F, 0.0F, anInterface36_9337.method244(), anInterface36_9337.method261(), anInterface36_9337.method244(), anInterface36_9337, i_460_);
		else {
			aClass167_Sub3_9339.method8943();
			aClass167_Sub3_9339.method8763(i_461_);
			if (aBool9345) {
				float f_463_ = (float) method12();
				float f_464_ = (float) method1785();
				float f_465_ = (f_456_ - f) / f_463_;
				float f_466_ = (f_457_ - f_455_) / f_463_;
				float f_467_ = (f_458_ - f) / f_464_;
				float f_468_ = (f_459_ - f_455_) / f_464_;
				float f_469_ = f_467_ * (float) anInt9340;
				float f_470_ = f_468_ * (float) anInt9340;
				float f_471_ = f_465_ * (float) anInt9341;
				float f_472_ = f_466_ * (float) anInt9341;
				float f_473_ = -f_465_ * (float) anInt9343;
				float f_474_ = -f_466_ * (float) anInt9343;
				float f_475_ = -f_467_ * (float) anInt9342;
				float f_476_ = -f_468_ * (float) anInt9342;
				f = f + f_471_ + f_469_;
				f_455_ = f_455_ + f_472_ + f_470_;
				f_456_ = f_456_ + f_473_ + f_469_;
				f_457_ = f_457_ + f_474_ + f_470_;
				f_458_ = f_458_ + f_471_ + f_475_;
				f_459_ = f_459_ + f_472_ + f_476_;
			}
			Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
			class328.anInterface36_3589 = anInterface36_9337;
			class328.method4304(i, i_460_);
			float f_477_ = (float) aClass167_Sub3_9339.method2278((byte) 9).method2725();
			float f_478_ = (float) aClass167_Sub3_9339.method2278((byte) 36).method2726();
			class328.aClass443_3591.method5338();
			class328.aClass443_3591.aFloatArray4878[0] = (f_456_ - f) * 2.0F / f_477_;
			class328.aClass443_3591.aFloatArray4878[1] = (f_457_ - f_455_) * 2.0F / f_478_;
			class328.aClass443_3591.aFloatArray4878[4] = (f_458_ - f) * 2.0F / f_477_;
			class328.aClass443_3591.aFloatArray4878[5] = (f_459_ - f_455_) * 2.0F / f_478_;
			class328.aClass443_3591.aFloatArray4878[12] = ((f + aClass167_Sub3_9339.method8725()) * 2.0F / f_477_ - 1.0F);
			class328.aClass443_3591.aFloatArray4878[13] = ((f_455_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_478_ - 1.0F);
			class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
			class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
			class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
			class328.anInt3588 = 0;
			class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
			class328.method4306();
		}
	}

	void method1776(float f, float f_479_, float f_480_, float f_481_, float f_482_, float f_483_, int i, int i_484_, int i_485_, int i_486_) {
		if (aClass167_Sub3_9339.method8726() != Class347.aClass347_3689)
			aClass167_Sub3_9339.aClass358_9563.method4697(f, f_479_, f_480_, f_481_, f_482_, f_483_, f_480_ + f_482_ - f, f_481_ + f_483_ - f_479_, 0.0F, 0.0F, anInterface36_9337.method261(), 0.0F, 0.0F, anInterface36_9337.method244(), anInterface36_9337.method261(), anInterface36_9337.method244(), anInterface36_9337, i_484_);
		else {
			aClass167_Sub3_9339.method8943();
			aClass167_Sub3_9339.method8763(i_485_);
			if (aBool9345) {
				float f_487_ = (float) method12();
				float f_488_ = (float) method1785();
				float f_489_ = (f_480_ - f) / f_487_;
				float f_490_ = (f_481_ - f_479_) / f_487_;
				float f_491_ = (f_482_ - f) / f_488_;
				float f_492_ = (f_483_ - f_479_) / f_488_;
				float f_493_ = f_491_ * (float) anInt9340;
				float f_494_ = f_492_ * (float) anInt9340;
				float f_495_ = f_489_ * (float) anInt9341;
				float f_496_ = f_490_ * (float) anInt9341;
				float f_497_ = -f_489_ * (float) anInt9343;
				float f_498_ = -f_490_ * (float) anInt9343;
				float f_499_ = -f_491_ * (float) anInt9342;
				float f_500_ = -f_492_ * (float) anInt9342;
				f = f + f_495_ + f_493_;
				f_479_ = f_479_ + f_496_ + f_494_;
				f_480_ = f_480_ + f_497_ + f_493_;
				f_481_ = f_481_ + f_498_ + f_494_;
				f_482_ = f_482_ + f_495_ + f_499_;
				f_483_ = f_483_ + f_496_ + f_500_;
			}
			Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
			class328.anInterface36_3589 = anInterface36_9337;
			class328.method4304(i, i_484_);
			float f_501_ = (float) aClass167_Sub3_9339.method2278((byte) -91).method2725();
			float f_502_ = (float) aClass167_Sub3_9339.method2278((byte) -43).method2726();
			class328.aClass443_3591.method5338();
			class328.aClass443_3591.aFloatArray4878[0] = (f_480_ - f) * 2.0F / f_501_;
			class328.aClass443_3591.aFloatArray4878[1] = (f_481_ - f_479_) * 2.0F / f_502_;
			class328.aClass443_3591.aFloatArray4878[4] = (f_482_ - f) * 2.0F / f_501_;
			class328.aClass443_3591.aFloatArray4878[5] = (f_483_ - f_479_) * 2.0F / f_502_;
			class328.aClass443_3591.aFloatArray4878[12] = ((f + aClass167_Sub3_9339.method8725()) * 2.0F / f_501_ - 1.0F);
			class328.aClass443_3591.aFloatArray4878[13] = ((f_479_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_502_ - 1.0F);
			class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
			class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
			class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
			class328.anInt3588 = 0;
			class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
			class328.method4306();
		}
	}

	void method1787(float f, float f_503_, float f_504_, float f_505_, float f_506_, float f_507_, int i, int i_508_, int i_509_, int i_510_) {
		if (aClass167_Sub3_9339.method8726() != Class347.aClass347_3689)
			aClass167_Sub3_9339.aClass358_9563.method4697(f, f_503_, f_504_, f_505_, f_506_, f_507_, f_504_ + f_506_ - f, f_505_ + f_507_ - f_503_, 0.0F, 0.0F, anInterface36_9337.method261(), 0.0F, 0.0F, anInterface36_9337.method244(), anInterface36_9337.method261(), anInterface36_9337.method244(), anInterface36_9337, i_508_);
		else {
			aClass167_Sub3_9339.method8943();
			aClass167_Sub3_9339.method8763(i_509_);
			if (aBool9345) {
				float f_511_ = (float) method12();
				float f_512_ = (float) method1785();
				float f_513_ = (f_504_ - f) / f_511_;
				float f_514_ = (f_505_ - f_503_) / f_511_;
				float f_515_ = (f_506_ - f) / f_512_;
				float f_516_ = (f_507_ - f_503_) / f_512_;
				float f_517_ = f_515_ * (float) anInt9340;
				float f_518_ = f_516_ * (float) anInt9340;
				float f_519_ = f_513_ * (float) anInt9341;
				float f_520_ = f_514_ * (float) anInt9341;
				float f_521_ = -f_513_ * (float) anInt9343;
				float f_522_ = -f_514_ * (float) anInt9343;
				float f_523_ = -f_515_ * (float) anInt9342;
				float f_524_ = -f_516_ * (float) anInt9342;
				f = f + f_519_ + f_517_;
				f_503_ = f_503_ + f_520_ + f_518_;
				f_504_ = f_504_ + f_521_ + f_517_;
				f_505_ = f_505_ + f_522_ + f_518_;
				f_506_ = f_506_ + f_519_ + f_523_;
				f_507_ = f_507_ + f_520_ + f_524_;
			}
			Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
			class328.anInterface36_3589 = anInterface36_9337;
			class328.method4304(i, i_508_);
			float f_525_ = (float) aClass167_Sub3_9339.method2278((byte) -13).method2725();
			float f_526_ = (float) aClass167_Sub3_9339.method2278((byte) 32).method2726();
			class328.aClass443_3591.method5338();
			class328.aClass443_3591.aFloatArray4878[0] = (f_504_ - f) * 2.0F / f_525_;
			class328.aClass443_3591.aFloatArray4878[1] = (f_505_ - f_503_) * 2.0F / f_526_;
			class328.aClass443_3591.aFloatArray4878[4] = (f_506_ - f) * 2.0F / f_525_;
			class328.aClass443_3591.aFloatArray4878[5] = (f_507_ - f_503_) * 2.0F / f_526_;
			class328.aClass443_3591.aFloatArray4878[12] = ((f + aClass167_Sub3_9339.method8725()) * 2.0F / f_525_ - 1.0F);
			class328.aClass443_3591.aFloatArray4878[13] = ((f_503_ + aClass167_Sub3_9339.method8725()) * 2.0F / f_526_ - 1.0F);
			class328.aClass443_3591.aFloatArray4878[14] = -1.0F;
			class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
			class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
			class328.anInt3588 = 0;
			class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
			class328.method4306();
		}
	}

	void method1778(float f, float f_527_, float f_528_, float f_529_, float f_530_, float f_531_, int i, Class161 class161, int i_532_, int i_533_) {
		aClass167_Sub3_9339.method8943();
		Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
		class328.anInterface36_3589 = anInterface36_9337;
		class328.method4304(1, -1);
		float f_534_ = (float) aClass167_Sub3_9339.method2278((byte) 29).method2725();
		float f_535_ = (float) aClass167_Sub3_9339.method2278((byte) -33).method2726();
		class328.aClass443_3591.method5338();
		if (aBool9345) {
			float f_536_ = (float) anInt9338 / (float) method12();
			float f_537_ = (float) anInt9344 / (float) method1785();
			class328.aClass443_3591.aFloatArray4878[0] = (f_528_ - f) * f_536_;
			class328.aClass443_3591.aFloatArray4878[1] = (f_529_ - f_527_) * f_536_;
			class328.aClass443_3591.aFloatArray4878[4] = (f_530_ - f) * f_537_;
			class328.aClass443_3591.aFloatArray4878[5] = (f_531_ - f_527_) * f_537_;
			class328.aClass443_3591.aFloatArray4878[12] = ((f + (float) anInt9341) * f_536_ + aClass167_Sub3_9339.method8725());
			class328.aClass443_3591.aFloatArray4878[13] = ((f_527_ + (float) anInt9340) * f_537_ + aClass167_Sub3_9339.method8725());
		} else {
			class328.aClass443_3591.aFloatArray4878[0] = f_528_ - f;
			class328.aClass443_3591.aFloatArray4878[1] = f_529_ - f_527_;
			class328.aClass443_3591.aFloatArray4878[4] = f_530_ - f;
			class328.aClass443_3591.aFloatArray4878[5] = f_531_ - f_527_;
			class328.aClass443_3591.aFloatArray4878[12] = f + aClass167_Sub3_9339.method8725();
			class328.aClass443_3591.aFloatArray4878[13] = f_527_ + aClass167_Sub3_9339.method8725();
		}
		Class443 class443 = aClass167_Sub3_9339.aClass443_9570;
		class443.method5338();
		class443.aFloatArray4878[0] = 2.0F / f_534_;
		class443.aFloatArray4878[5] = 2.0F / f_535_;
		class443.aFloatArray4878[12] = -1.0F;
		class443.aFloatArray4878[13] = -1.0F;
		class443.aFloatArray4878[14] = -1.0F;
		class328.aClass443_3591.method5390(class443);
		class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
		class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
		class328.anInt3588 = 0;
		class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
		Interface36 interface36 = ((Class161_Sub1) class161).anInterface36_9385;
		class328.anInterface36_3593 = interface36;
		class328.aClass443_3595.method5338();
		class328.aClass443_3595.aFloatArray4878[0] = (f_528_ - f) * interface36.method219(1.0F);
		class328.aClass443_3595.aFloatArray4878[1] = (f_529_ - f_527_) * interface36.method219(1.0F);
		class328.aClass443_3595.aFloatArray4878[4] = (f_530_ - f) * interface36.method220(1.0F);
		class328.aClass443_3595.aFloatArray4878[5] = (f_531_ - f_527_) * interface36.method220(1.0F);
		class328.aClass443_3595.aFloatArray4878[12] = (f - (float) i_532_) * interface36.method219(1.0F);
		class328.aClass443_3595.aFloatArray4878[13] = (f_527_ - (float) i_533_) * interface36.method220(1.0F);
		class328.method4307();
	}

	void method1777(float f, float f_538_, float f_539_, float f_540_, float f_541_, float f_542_, int i, Class161 class161, int i_543_, int i_544_) {
		aClass167_Sub3_9339.method8943();
		Class328 class328 = aClass167_Sub3_9339.aClass328_9709;
		class328.anInterface36_3589 = anInterface36_9337;
		class328.method4304(1, -1);
		float f_545_ = (float) aClass167_Sub3_9339.method2278((byte) -116).method2725();
		float f_546_ = (float) aClass167_Sub3_9339.method2278((byte) 12).method2726();
		class328.aClass443_3591.method5338();
		if (aBool9345) {
			float f_547_ = (float) anInt9338 / (float) method12();
			float f_548_ = (float) anInt9344 / (float) method1785();
			class328.aClass443_3591.aFloatArray4878[0] = (f_539_ - f) * f_547_;
			class328.aClass443_3591.aFloatArray4878[1] = (f_540_ - f_538_) * f_547_;
			class328.aClass443_3591.aFloatArray4878[4] = (f_541_ - f) * f_548_;
			class328.aClass443_3591.aFloatArray4878[5] = (f_542_ - f_538_) * f_548_;
			class328.aClass443_3591.aFloatArray4878[12] = ((f + (float) anInt9341) * f_547_ + aClass167_Sub3_9339.method8725());
			class328.aClass443_3591.aFloatArray4878[13] = ((f_538_ + (float) anInt9340) * f_548_ + aClass167_Sub3_9339.method8725());
		} else {
			class328.aClass443_3591.aFloatArray4878[0] = f_539_ - f;
			class328.aClass443_3591.aFloatArray4878[1] = f_540_ - f_538_;
			class328.aClass443_3591.aFloatArray4878[4] = f_541_ - f;
			class328.aClass443_3591.aFloatArray4878[5] = f_542_ - f_538_;
			class328.aClass443_3591.aFloatArray4878[12] = f + aClass167_Sub3_9339.method8725();
			class328.aClass443_3591.aFloatArray4878[13] = f_538_ + aClass167_Sub3_9339.method8725();
		}
		Class443 class443 = aClass167_Sub3_9339.aClass443_9570;
		class443.method5338();
		class443.aFloatArray4878[0] = 2.0F / f_545_;
		class443.aFloatArray4878[5] = 2.0F / f_546_;
		class443.aFloatArray4878[12] = -1.0F;
		class443.aFloatArray4878[13] = -1.0F;
		class443.aFloatArray4878[14] = -1.0F;
		class328.aClass443_3591.method5390(class443);
		class328.aClass443_3592.method5344(anInterface36_9337.method219((float) anInt9338), anInterface36_9337.method220((float) anInt9344), 1.0F, 1.0F);
		class328.anInterface38_3594 = aClass167_Sub3_9339.anInterface38_9612;
		class328.anInt3588 = 0;
		class328.aClass343_3596 = aClass167_Sub3_9339.aClass343_9576;
		Interface36 interface36 = ((Class161_Sub1) class161).anInterface36_9385;
		class328.anInterface36_3593 = interface36;
		class328.aClass443_3595.method5338();
		class328.aClass443_3595.aFloatArray4878[0] = (f_539_ - f) * interface36.method219(1.0F);
		class328.aClass443_3595.aFloatArray4878[1] = (f_540_ - f_538_) * interface36.method219(1.0F);
		class328.aClass443_3595.aFloatArray4878[4] = (f_541_ - f) * interface36.method220(1.0F);
		class328.aClass443_3595.aFloatArray4878[5] = (f_542_ - f_538_) * interface36.method220(1.0F);
		class328.aClass443_3595.aFloatArray4878[12] = (f - (float) i_543_) * interface36.method219(1.0F);
		class328.aClass443_3595.aFloatArray4878[13] = (f_538_ - (float) i_544_) * interface36.method220(1.0F);
		class328.method4307();
	}
}
