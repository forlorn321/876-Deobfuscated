/* Class147_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class147_Sub2 extends Class147 {
	int anInt9004;
	Class180_Sub2 aClass180_Sub2_9005;
	Interface21 anInterface21_9006;
	int anInt9007;
	int anInt9008;
	int anInt9009;
	int anInt9010;
	boolean aBool9011;
	Interface38 anInterface38_9012;
	int anInt9013;
	boolean aBool9014;
	boolean aBool9015 = false;
	boolean aBool9016;
	boolean aBool9017;

	public Interface21 method2462() {
		return anInterface21_9006;
	}

	Class147_Sub2(Class180_Sub2 class180_sub2, int i, int i_0_, int[] is, int i_1_, int i_2_) {
		anInt9004 = 0;
		anInt9010 = 0;
		anInt9009 = 0;
		anInt9013 = 0;
		aClass180_Sub2_9005 = class180_sub2;
		anInt9007 = i;
		anInt9008 = i_0_;
		anInterface21_9006 = null;
		anInterface38_9012 = class180_sub2.method14967(i, i_0_, false, is, i_1_, i_2_);
		anInterface38_9012.method226(true, true);
		aBool9014 = anInterface38_9012.method1() != i;
		aBool9011 = anInterface38_9012.method87() != i_0_;
		aBool9016 = !aBool9014 && anInterface38_9012.method207();
		aBool9017 = !aBool9011 && anInterface38_9012.method207();
	}

	void method2449(float f, float f_3_, float f_4_, float f_5_, float f_6_, float f_7_, int i, Class142 class142, int i_8_, int i_9_) {
		aClass180_Sub2_9005.method14942();
		Class334 class334 = aClass180_Sub2_9005.aClass334_9508;
		class334.anInterface38_3630 = anInterface38_9012;
		class334.method5851(1, -1);
		float f_10_ = (float) aClass180_Sub2_9005.method3285(671003364).method2728();
		float f_11_ = (float) aClass180_Sub2_9005.method3285(751804340).method2729();
		class334.aClass427_3633.method6742();
		if (aBool9015) {
			float f_12_ = (float) anInt9007 / (float) method42();
			float f_13_ = (float) anInt9008 / (float) method2410();
			class334.aClass427_3633.aFloatArray4807[0] = (f_4_ - f) * f_12_;
			class334.aClass427_3633.aFloatArray4807[1] = (f_5_ - f_3_) * f_12_;
			class334.aClass427_3633.aFloatArray4807[4] = (f_6_ - f) * f_13_;
			class334.aClass427_3633.aFloatArray4807[5] = (f_7_ - f_3_) * f_13_;
			class334.aClass427_3633.aFloatArray4807[12] = ((f + (float) anInt9010) * f_12_ + aClass180_Sub2_9005.method14911());
			class334.aClass427_3633.aFloatArray4807[13] = ((f_3_ + (float) anInt9004) * f_13_ + aClass180_Sub2_9005.method14911());
		} else {
			class334.aClass427_3633.aFloatArray4807[0] = f_4_ - f;
			class334.aClass427_3633.aFloatArray4807[1] = f_5_ - f_3_;
			class334.aClass427_3633.aFloatArray4807[4] = f_6_ - f;
			class334.aClass427_3633.aFloatArray4807[5] = f_7_ - f_3_;
			class334.aClass427_3633.aFloatArray4807[12] = f + aClass180_Sub2_9005.method14911();
			class334.aClass427_3633.aFloatArray4807[13] = f_3_ + aClass180_Sub2_9005.method14911();
		}
		Class427 class427 = aClass180_Sub2_9005.aClass427_9435;
		class427.method6742();
		class427.aFloatArray4807[0] = 2.0F / f_10_;
		class427.aFloatArray4807[5] = 2.0F / f_11_;
		class427.aFloatArray4807[12] = -1.0F;
		class427.aFloatArray4807[13] = -1.0F;
		class427.aFloatArray4807[14] = -1.0F;
		class334.aClass427_3633.method6751(class427);
		class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
		class334.anInterface37_3636 = aClass180_Sub2_9005.anInterface37_9501;
		class334.anInt3637 = 0;
		class334.aClass355_3634 = aClass180_Sub2_9005.aClass355_9529;
		Interface38 interface38 = ((Class142_Sub2) class142).anInterface38_9018;
		class334.anInterface38_3638 = interface38;
		class334.aClass427_3635.method6742();
		class334.aClass427_3635.aFloatArray4807[0] = (f_4_ - f) * interface38.method224(1.0F);
		class334.aClass427_3635.aFloatArray4807[1] = (f_5_ - f_3_) * interface38.method224(1.0F);
		class334.aClass427_3635.aFloatArray4807[4] = (f_6_ - f) * interface38.method264(1.0F);
		class334.aClass427_3635.aFloatArray4807[5] = (f_7_ - f_3_) * interface38.method264(1.0F);
		class334.aClass427_3635.aFloatArray4807[12] = (f - (float) i_8_) * interface38.method224(1.0F);
		class334.aClass427_3635.aFloatArray4807[13] = (f_3_ - (float) i_9_) * interface38.method264(1.0F);
		class334.method5853();
	}

	Class147_Sub2(Class180_Sub2 class180_sub2, Interface38 interface38, int i, int i_14_) {
		anInt9004 = 0;
		anInt9010 = 0;
		anInt9009 = 0;
		anInt9013 = 0;
		aClass180_Sub2_9005 = class180_sub2;
		anInt9007 = i;
		anInt9008 = i_14_;
		anInterface38_9012 = interface38;
		anInterface21_9006 = null;
		aBool9014 = anInterface38_9012.method1() != i;
		aBool9011 = anInterface38_9012.method87() != i_14_;
		aBool9016 = !aBool9014 && anInterface38_9012.method207();
		aBool9017 = !aBool9011 && anInterface38_9012.method207();
	}

	public void method2445(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
		anInterface38_9012.method231(i, i_15_, i_16_, i_17_, i_18_, i_19_);
	}

	public void method2486(int i, int i_20_, int i_21_) {
		int[] is = aClass180_Sub2_9005.method3113(i, i_20_, anInt9007, anInt9008);
		int[] is_22_ = new int[anInt9007 * anInt9008];
		anInterface38_9012.method229(0, 0, anInt9007, anInt9008, is_22_, 0);
		if (i_21_ == 0) {
			for (int i_23_ = 0; i_23_ < anInt9008; i_23_++) {
				int i_24_ = i_23_ * anInt9007;
				for (int i_25_ = 0; i_25_ < anInt9007; i_25_++)
					is_22_[i_24_ + i_25_] = (is_22_[i_24_ + i_25_] & 0xffffff | is[i_24_ + i_25_] << 8 & ~0xffffff);
			}
		} else if (i_21_ == 1) {
			for (int i_26_ = 0; i_26_ < anInt9008; i_26_++) {
				int i_27_ = i_26_ * anInt9007;
				for (int i_28_ = 0; i_28_ < anInt9007; i_28_++)
					is_22_[i_27_ + i_28_] = (is_22_[i_27_ + i_28_] & 0xffffff | is[i_27_ + i_28_] << 16 & ~0xffffff);
			}
		} else if (i_21_ == 2) {
			for (int i_29_ = 0; i_29_ < anInt9008; i_29_++) {
				int i_30_ = i_29_ * anInt9007;
				for (int i_31_ = 0; i_31_ < anInt9007; i_31_++)
					is_22_[i_30_ + i_31_] = (is_22_[i_30_ + i_31_] & 0xffffff | is[i_30_ + i_31_] << 24 & ~0xffffff);
			}
		} else if (i_21_ == 3) {
			for (int i_32_ = 0; i_32_ < anInt9008; i_32_++) {
				int i_33_ = i_32_ * anInt9007;
				for (int i_34_ = 0; i_34_ < anInt9007; i_34_++)
					is_22_[i_33_ + i_34_] = (is_22_[i_33_ + i_34_] & 0xffffff | (is[i_33_ + i_34_] != 0 ? -16777216 : 0));
			}
		}
		method2459(0, 0, anInt9007, anInt9008, is_22_, 0, anInt9007);
	}

	public void method2405(int i, int i_35_, int i_36_, int i_37_) {
		anInt9010 = i;
		anInt9004 = i_35_;
		anInt9013 = i_36_;
		anInt9009 = i_37_;
		aBool9015 = (anInt9010 != 0 || anInt9004 != 0 || anInt9013 != 0 || anInt9009 != 0);
	}

	void method2430(float f, float f_38_, float f_39_, float f_40_, float f_41_, float f_42_, int i, int i_43_, int i_44_, int i_45_) {
		if (aClass180_Sub2_9005.method14912() != Class342.aClass342_3690)
			aClass180_Sub2_9005.aClass365_9538.method6339(f, f_38_, f_39_, f_40_, f_41_, f_42_, f_39_ + f_41_ - f, f_40_ + f_42_ - f_38_, 0.0F, 0.0F, anInterface38_9012.method233(), 0.0F, 0.0F, anInterface38_9012.method222(), anInterface38_9012.method233(), anInterface38_9012.method222(), anInterface38_9012, i_43_);
		else {
			aClass180_Sub2_9005.method14942();
			aClass180_Sub2_9005.method15238(i_44_);
			if (aBool9015) {
				float f_46_ = (float) method42();
				float f_47_ = (float) method2410();
				float f_48_ = (f_39_ - f) / f_46_;
				float f_49_ = (f_40_ - f_38_) / f_46_;
				float f_50_ = (f_41_ - f) / f_47_;
				float f_51_ = (f_42_ - f_38_) / f_47_;
				float f_52_ = f_50_ * (float) anInt9004;
				float f_53_ = f_51_ * (float) anInt9004;
				float f_54_ = f_48_ * (float) anInt9010;
				float f_55_ = f_49_ * (float) anInt9010;
				float f_56_ = -f_48_ * (float) anInt9013;
				float f_57_ = -f_49_ * (float) anInt9013;
				float f_58_ = -f_50_ * (float) anInt9009;
				float f_59_ = -f_51_ * (float) anInt9009;
				f = f + f_54_ + f_52_;
				f_38_ = f_38_ + f_55_ + f_53_;
				f_39_ = f_39_ + f_56_ + f_52_;
				f_40_ = f_40_ + f_57_ + f_53_;
				f_41_ = f_41_ + f_54_ + f_58_;
				f_42_ = f_42_ + f_55_ + f_59_;
			}
			Class334 class334 = aClass180_Sub2_9005.aClass334_9508;
			class334.anInterface38_3630 = anInterface38_9012;
			class334.method5851(i, i_43_);
			float f_60_ = (float) aClass180_Sub2_9005.method3285(1564202614).method2728();
			float f_61_ = (float) aClass180_Sub2_9005.method3285(1526671185).method2729();
			class334.aClass427_3633.method6742();
			class334.aClass427_3633.aFloatArray4807[0] = (f_39_ - f) * 2.0F / f_60_;
			class334.aClass427_3633.aFloatArray4807[1] = (f_40_ - f_38_) * 2.0F / f_61_;
			class334.aClass427_3633.aFloatArray4807[4] = (f_41_ - f) * 2.0F / f_60_;
			class334.aClass427_3633.aFloatArray4807[5] = (f_42_ - f_38_) * 2.0F / f_61_;
			class334.aClass427_3633.aFloatArray4807[12] = ((f + aClass180_Sub2_9005.method14911()) * 2.0F / f_60_ - 1.0F);
			class334.aClass427_3633.aFloatArray4807[13] = ((f_38_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_61_ - 1.0F);
			class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
			class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
			class334.anInterface37_3636 = aClass180_Sub2_9005.anInterface37_9501;
			class334.anInt3637 = 0;
			class334.aClass355_3634 = aClass180_Sub2_9005.aClass355_9529;
			class334.method5856();
		}
	}

	public int method2407() {
		return anInt9007;
	}

	public int method42() {
		return anInt9007 + anInt9010 + anInt9013;
	}

	public void method2478(int i, int i_62_, int i_63_, int i_64_) {
		anInt9010 = i;
		anInt9004 = i_62_;
		anInt9013 = i_63_;
		anInt9009 = i_64_;
		aBool9015 = (anInt9010 != 0 || anInt9004 != 0 || anInt9013 != 0 || anInt9009 != 0);
	}

	public int method2410() {
		return anInt9008 + anInt9004 + anInt9009;
	}

	void method2408(float f, float f_65_, float f_66_, float f_67_, float f_68_, float f_69_, int i, int i_70_, int i_71_, int i_72_) {
		if (aClass180_Sub2_9005.method14912() != Class342.aClass342_3690)
			aClass180_Sub2_9005.aClass365_9538.method6339(f, f_65_, f_66_, f_67_, f_68_, f_69_, f_66_ + f_68_ - f, f_67_ + f_69_ - f_65_, 0.0F, 0.0F, anInterface38_9012.method233(), 0.0F, 0.0F, anInterface38_9012.method222(), anInterface38_9012.method233(), anInterface38_9012.method222(), anInterface38_9012, i_70_);
		else {
			aClass180_Sub2_9005.method14942();
			aClass180_Sub2_9005.method15238(i_71_);
			if (aBool9015) {
				float f_73_ = (float) method42();
				float f_74_ = (float) method2410();
				float f_75_ = (f_66_ - f) / f_73_;
				float f_76_ = (f_67_ - f_65_) / f_73_;
				float f_77_ = (f_68_ - f) / f_74_;
				float f_78_ = (f_69_ - f_65_) / f_74_;
				float f_79_ = f_77_ * (float) anInt9004;
				float f_80_ = f_78_ * (float) anInt9004;
				float f_81_ = f_75_ * (float) anInt9010;
				float f_82_ = f_76_ * (float) anInt9010;
				float f_83_ = -f_75_ * (float) anInt9013;
				float f_84_ = -f_76_ * (float) anInt9013;
				float f_85_ = -f_77_ * (float) anInt9009;
				float f_86_ = -f_78_ * (float) anInt9009;
				f = f + f_81_ + f_79_;
				f_65_ = f_65_ + f_82_ + f_80_;
				f_66_ = f_66_ + f_83_ + f_79_;
				f_67_ = f_67_ + f_84_ + f_80_;
				f_68_ = f_68_ + f_81_ + f_85_;
				f_69_ = f_69_ + f_82_ + f_86_;
			}
			Class334 class334 = aClass180_Sub2_9005.aClass334_9508;
			class334.anInterface38_3630 = anInterface38_9012;
			class334.method5851(i, i_70_);
			float f_87_ = (float) aClass180_Sub2_9005.method3285(1762959384).method2728();
			float f_88_ = (float) aClass180_Sub2_9005.method3285(623383432).method2729();
			class334.aClass427_3633.method6742();
			class334.aClass427_3633.aFloatArray4807[0] = (f_66_ - f) * 2.0F / f_87_;
			class334.aClass427_3633.aFloatArray4807[1] = (f_67_ - f_65_) * 2.0F / f_88_;
			class334.aClass427_3633.aFloatArray4807[4] = (f_68_ - f) * 2.0F / f_87_;
			class334.aClass427_3633.aFloatArray4807[5] = (f_69_ - f_65_) * 2.0F / f_88_;
			class334.aClass427_3633.aFloatArray4807[12] = ((f + aClass180_Sub2_9005.method14911()) * 2.0F / f_87_ - 1.0F);
			class334.aClass427_3633.aFloatArray4807[13] = ((f_65_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_88_ - 1.0F);
			class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
			class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
			class334.anInterface37_3636 = aClass180_Sub2_9005.anInterface37_9501;
			class334.anInt3637 = 0;
			class334.aClass355_3634 = aClass180_Sub2_9005.aClass355_9529;
			class334.method5856();
		}
	}

	public void method2459(int i, int i_89_, int i_90_, int i_91_, int[] is, int i_92_, int i_93_) {
		anInterface38_9012.method227(i, i_89_, i_90_, i_91_, is, i_92_, i_93_);
	}

	public void method2455(int i, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_) {
		if (aClass180_Sub2_9005.method14912() != Class342.aClass342_3690) {
			int i_100_ = i_94_ + i_96_;
			int i_101_ = i + i_95_;
			int i_102_ = method42();
			int i_103_ = method2410();
			int i_104_ = i_94_ + anInt9004;
			for (int i_105_ = i_104_ + anInt9008; i_105_ <= i_100_; i_105_ += i_103_) {
				int i_106_ = i + anInt9010;
				for (int i_107_ = i_106_ + anInt9007; i_107_ <= i_101_; i_107_ += i_102_) {
					aClass180_Sub2_9005.aClass365_9538.method6336((float) i_106_, (float) i_104_, (float) (i_106_ + anInt9007), (float) (i_104_ + anInt9008), 0.0F, 0.0F, anInterface38_9012.method233(), anInterface38_9012.method222(), anInterface38_9012, i_98_);
					i_106_ += i_102_;
				}
				if (i_106_ < i_101_) {
					int i_108_ = i_101_ - i_106_;
					aClass180_Sub2_9005.aClass365_9538.method6336((float) i_106_, (float) i_104_, (float) (i_106_ + i_108_), (float) (i_104_ + anInt9008), 0.0F, 0.0F, ((float) i_108_ / (float) anInt9007 * anInterface38_9012.method233()), anInterface38_9012.method222(), anInterface38_9012, i_98_);
				}
				i_104_ += i_103_;
			}
			if (i_104_ < i_100_) {
				int i_109_ = i_100_ - i_104_;
				float f = ((float) i_109_ / (float) anInt9008 * anInterface38_9012.method222());
				int i_110_ = i + anInt9010;
				for (int i_111_ = i_110_ + anInt9007; i_111_ <= i_101_; i_111_ += i_102_) {
					aClass180_Sub2_9005.aClass365_9538.method6336((float) i_110_, (float) i_104_, (float) (i_110_ + anInt9007), (float) (i_104_ + i_109_), 0.0F, 0.0F, anInterface38_9012.method233(), f, anInterface38_9012, i_98_);
					i_110_ += i_102_;
				}
				if (i_110_ < i_101_) {
					int i_112_ = i_101_ - i_110_;
					aClass180_Sub2_9005.aClass365_9538.method6336((float) i_110_, (float) i_104_, (float) (i_110_ + i_112_), (float) (i_104_ + i_109_), 0.0F, 0.0F, ((float) i_112_ / (float) anInt9007 * anInterface38_9012.method233()), f, anInterface38_9012, i_98_);
				}
			}
		} else {
			aClass180_Sub2_9005.method14942();
			aClass180_Sub2_9005.method15238(i_99_);
			Class334 class334 = aClass180_Sub2_9005.aClass334_9508;
			class334.anInterface38_3630 = anInterface38_9012;
			class334.method5851(i_97_, i_98_);
			float f = (float) aClass180_Sub2_9005.method3285(458430754).method2728();
			float f_113_ = (float) aClass180_Sub2_9005.method3285(1500304638).method2729();
			class334.anInterface37_3636 = aClass180_Sub2_9005.anInterface37_9501;
			class334.anInt3637 = 0;
			class334.aClass355_3634 = aClass180_Sub2_9005.aClass355_9529;
			boolean bool = aBool9017 && anInt9004 == 0 && anInt9009 == 0;
			boolean bool_114_ = aBool9016 && anInt9010 == 0 && anInt9013 == 0;
			if (bool_114_ & bool) {
				class334.aClass427_3633.method6815((float) i_95_ * 2.0F / f, ((float) i_96_ * 2.0F / f_113_), 1.0F, 1.0F);
				class334.aClass427_3633.aFloatArray4807[12] = (((float) i + aClass180_Sub2_9005.method14911()) * 2.0F / f) - 1.0F;
				class334.aClass427_3633.aFloatArray4807[13] = (((float) i_94_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_113_) - 1.0F;
				class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
				class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_95_), anInterface38_9012.method264((float) i_96_), 1.0F, 1.0F);
				class334.method5856();
			} else if (bool_114_) {
				int i_115_ = i_94_ + i_96_;
				int i_116_ = method2410();
				class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_95_), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
				int i_117_ = i_94_ + anInt9004;
				for (int i_118_ = i_117_ + anInt9008; i_118_ <= i_115_; i_118_ += i_116_) {
					class334.aClass427_3633.method6815(((float) i_95_ * 2.0F / f), ((float) anInt9008 * 2.0F / f_113_), 1.0F, 1.0F);
					class334.aClass427_3633.aFloatArray4807[12] = (((float) i + aClass180_Sub2_9005.method14911()) * 2.0F / f) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[13] = (((float) i_117_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_113_) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
					class334.method5856();
					i_117_ += i_116_;
				}
				if (i_117_ < i_115_) {
					int i_119_ = i_115_ - i_117_;
					class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_95_), anInterface38_9012.method264((float) i_119_), 1.0F, 1.0F);
					class334.aClass427_3633.method6815(((float) i_95_ * 2.0F / f), ((float) i_119_ * 2.0F / f_113_), 1.0F, 1.0F);
					class334.aClass427_3633.aFloatArray4807[12] = (((float) i + aClass180_Sub2_9005.method14911()) * 2.0F / f) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[13] = (((float) i_117_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_113_) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
					class334.method5856();
				}
			} else if (bool) {
				int i_120_ = i + i_95_;
				int i_121_ = method42();
				class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) i_96_), 1.0F, 1.0F);
				int i_122_ = i + anInt9010;
				for (int i_123_ = i_122_ + anInt9007; i_123_ <= i_120_; i_123_ += i_121_) {
					class334.aClass427_3633.method6815(((float) anInt9007 * 2.0F / f), ((float) i_96_ * 2.0F / f_113_), 1.0F, 1.0F);
					class334.aClass427_3633.aFloatArray4807[12] = (((float) i_122_ + aClass180_Sub2_9005.method14911()) * 2.0F / f) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[13] = (((float) i_94_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_113_) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
					class334.method5856();
					i_122_ += i_121_;
				}
				if (i_122_ < i_120_) {
					int i_124_ = i_120_ - i_122_;
					class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_124_), anInterface38_9012.method264((float) i_96_), 1.0F, 1.0F);
					class334.aClass427_3633.method6815(((float) i_124_ * 2.0F / f), ((float) i_96_ * 2.0F / f_113_), 1.0F, 1.0F);
					class334.aClass427_3633.aFloatArray4807[12] = (((float) i_122_ + aClass180_Sub2_9005.method14911()) * 2.0F / f) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[13] = (((float) i_94_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_113_) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
					class334.method5856();
				}
			} else {
				int i_125_ = i_94_ + i_96_;
				int i_126_ = i + i_95_;
				int i_127_ = method42();
				int i_128_ = method2410();
				int i_129_ = i_94_ + anInt9004;
				for (int i_130_ = i_129_ + anInt9008; i_130_ <= i_125_; i_130_ += i_128_) {
					class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
					int i_131_ = i + anInt9010;
					for (int i_132_ = i_131_ + anInt9007; i_132_ <= i_126_; i_132_ += i_127_) {
						class334.aClass427_3633.method6815(((float) anInt9007 * 2.0F / f), ((float) anInt9008 * 2.0F / f_113_), 1.0F, 1.0F);
						class334.aClass427_3633.aFloatArray4807[12] = (((float) i_131_ + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
						class334.aClass427_3633.aFloatArray4807[13] = (((float) i_129_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_113_) - 1.0F;
						class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
						class334.method5856();
						i_131_ += i_127_;
					}
					if (i_131_ < i_126_) {
						int i_133_ = i_126_ - i_131_;
						class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_133_), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
						class334.aClass427_3633.method6815(((float) i_133_ * 2.0F / f), ((float) anInt9008 * 2.0F / f_113_), 1.0F, 1.0F);
						class334.aClass427_3633.aFloatArray4807[12] = (((float) i_131_ + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
						class334.aClass427_3633.aFloatArray4807[13] = (((float) i_129_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_113_) - 1.0F;
						class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
						class334.method5856();
					}
					i_129_ += i_128_;
				}
				if (i_129_ < i_125_) {
					int i_134_ = i_125_ - i_129_;
					class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) i_134_), 1.0F, 1.0F);
					int i_135_ = i + anInt9010;
					for (int i_136_ = i_135_ + anInt9007; i_136_ <= i_126_; i_136_ += i_127_) {
						class334.aClass427_3633.method6815(((float) anInt9007 * 2.0F / f), ((float) i_134_ * 2.0F / f_113_), 1.0F, 1.0F);
						class334.aClass427_3633.aFloatArray4807[12] = (((float) i_135_ + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
						class334.aClass427_3633.aFloatArray4807[13] = (((float) i_129_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_113_) - 1.0F;
						class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
						class334.method5856();
						i_135_ += i_127_;
					}
					if (i_135_ < i_126_) {
						int i_137_ = i_126_ - i_135_;
						class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_137_), anInterface38_9012.method264((float) i_134_), 1.0F, 1.0F);
						class334.aClass427_3633.method6815(((float) i_137_ * 2.0F / f), ((float) i_134_ * 2.0F / f_113_), 1.0F, 1.0F);
						class334.aClass427_3633.aFloatArray4807[12] = (((float) i_135_ + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
						class334.aClass427_3633.aFloatArray4807[13] = (((float) i_129_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_113_) - 1.0F;
						class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
						class334.method5856();
					}
				}
			}
		}
	}

	public void method2416(int i, int i_138_, int i_139_, int i_140_, int i_141_) {
		if (aClass180_Sub2_9005.method14912() != Class342.aClass342_3690) {
			i += anInt9010;
			i_138_ += anInt9004;
			aClass180_Sub2_9005.aClass365_9538.method6336((float) i, (float) i_138_, (float) (i + anInt9007), (float) (i_138_ + anInt9008), 0.0F, 0.0F, anInterface38_9012.method233(), anInterface38_9012.method222(), anInterface38_9012, i_140_);
		} else {
			aClass180_Sub2_9005.method14942();
			aClass180_Sub2_9005.method15238(i_141_);
			Class334 class334 = aClass180_Sub2_9005.aClass334_9508;
			class334.anInterface38_3630 = anInterface38_9012;
			class334.method5851(i_139_, i_140_);
			i += anInt9010;
			i_138_ += anInt9004;
			float f = (float) aClass180_Sub2_9005.method3285(645725998).method2728();
			float f_142_ = (float) aClass180_Sub2_9005.method3285(589330176).method2729();
			class334.aClass427_3633.method6815((float) anInt9007 * 2.0F / f, ((float) anInt9008 * 2.0F / f_142_), 1.0F, 1.0F);
			class334.aClass427_3633.aFloatArray4807[12] = (((float) i + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
			class334.aClass427_3633.aFloatArray4807[13] = (((float) i_138_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_142_) - 1.0F;
			class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
			class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
			class334.anInterface37_3636 = aClass180_Sub2_9005.anInterface37_9501;
			class334.anInt3637 = 0;
			class334.aClass355_3634 = aClass180_Sub2_9005.aClass355_9529;
			class334.method5856();
		}
	}

	Class147_Sub2(Class180_Sub2 class180_sub2, Interface38 interface38) {
		this(class180_sub2, interface38, interface38.method1(), interface38.method87());
	}

	void method2420(int i, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_, int i_148_, int i_149_) {
		if (aClass180_Sub2_9005.method14912() != Class342.aClass342_3690) {
			if (aBool9015) {
				i_144_ = i_144_ * anInt9007 / method42();
				i_145_ = i_145_ * anInt9008 / method2410();
				i += anInt9010 * i_144_ / anInt9007;
				i_143_ += anInt9004 * i_145_ / anInt9008;
			}
			aClass180_Sub2_9005.aClass365_9538.method6336((float) i, (float) i_143_, (float) (i + i_144_), (float) (i_143_ + i_145_), anInterface38_9012.method224(0.0F), anInterface38_9012.method264(0.0F), anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) anInt9008), anInterface38_9012, i_147_);
		} else {
			aClass180_Sub2_9005.method14942();
			aClass180_Sub2_9005.method15238(i_148_);
			Class334 class334 = aClass180_Sub2_9005.aClass334_9508;
			class334.anInterface38_3630 = anInterface38_9012;
			class334.method5851(i_146_, i_147_);
			if (aBool9015) {
				i_144_ = i_144_ * anInt9007 / method42();
				i_145_ = i_145_ * anInt9008 / method2410();
				i += anInt9010 * i_144_ / anInt9007;
				i_143_ += anInt9004 * i_145_ / anInt9008;
			}
			float f = (float) aClass180_Sub2_9005.method3285(1734922948).method2728();
			float f_150_ = (float) aClass180_Sub2_9005.method3285(507996525).method2729();
			class334.aClass427_3633.method6815((float) i_144_ * 2.0F / f, (float) i_145_ * 2.0F / f_150_, 1.0F, 1.0F);
			class334.aClass427_3633.aFloatArray4807[12] = (((float) i + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
			class334.aClass427_3633.aFloatArray4807[13] = (((float) i_143_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_150_) - 1.0F;
			class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
			class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
			class334.anInterface37_3636 = aClass180_Sub2_9005.anInterface37_9501;
			class334.anInt3637 = 0;
			class334.aClass355_3634 = aClass180_Sub2_9005.aClass355_9529;
			class334.method5856();
		}
	}

	public int method41() {
		return anInt9007 + anInt9010 + anInt9013;
	}

	public int method2424() {
		return anInt9008;
	}

	void method2432(float f, float f_151_, float f_152_, float f_153_, float f_154_, float f_155_, int i, Class142 class142, int i_156_, int i_157_) {
		aClass180_Sub2_9005.method14942();
		Class334 class334 = aClass180_Sub2_9005.aClass334_9508;
		class334.anInterface38_3630 = anInterface38_9012;
		class334.method5851(1, -1);
		float f_158_ = (float) aClass180_Sub2_9005.method3285(1853332110).method2728();
		float f_159_ = (float) aClass180_Sub2_9005.method3285(678248025).method2729();
		class334.aClass427_3633.method6742();
		if (aBool9015) {
			float f_160_ = (float) anInt9007 / (float) method42();
			float f_161_ = (float) anInt9008 / (float) method2410();
			class334.aClass427_3633.aFloatArray4807[0] = (f_152_ - f) * f_160_;
			class334.aClass427_3633.aFloatArray4807[1] = (f_153_ - f_151_) * f_160_;
			class334.aClass427_3633.aFloatArray4807[4] = (f_154_ - f) * f_161_;
			class334.aClass427_3633.aFloatArray4807[5] = (f_155_ - f_151_) * f_161_;
			class334.aClass427_3633.aFloatArray4807[12] = ((f + (float) anInt9010) * f_160_ + aClass180_Sub2_9005.method14911());
			class334.aClass427_3633.aFloatArray4807[13] = ((f_151_ + (float) anInt9004) * f_161_ + aClass180_Sub2_9005.method14911());
		} else {
			class334.aClass427_3633.aFloatArray4807[0] = f_152_ - f;
			class334.aClass427_3633.aFloatArray4807[1] = f_153_ - f_151_;
			class334.aClass427_3633.aFloatArray4807[4] = f_154_ - f;
			class334.aClass427_3633.aFloatArray4807[5] = f_155_ - f_151_;
			class334.aClass427_3633.aFloatArray4807[12] = f + aClass180_Sub2_9005.method14911();
			class334.aClass427_3633.aFloatArray4807[13] = f_151_ + aClass180_Sub2_9005.method14911();
		}
		Class427 class427 = aClass180_Sub2_9005.aClass427_9435;
		class427.method6742();
		class427.aFloatArray4807[0] = 2.0F / f_158_;
		class427.aFloatArray4807[5] = 2.0F / f_159_;
		class427.aFloatArray4807[12] = -1.0F;
		class427.aFloatArray4807[13] = -1.0F;
		class427.aFloatArray4807[14] = -1.0F;
		class334.aClass427_3633.method6751(class427);
		class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
		class334.anInterface37_3636 = aClass180_Sub2_9005.anInterface37_9501;
		class334.anInt3637 = 0;
		class334.aClass355_3634 = aClass180_Sub2_9005.aClass355_9529;
		Interface38 interface38 = ((Class142_Sub2) class142).anInterface38_9018;
		class334.anInterface38_3638 = interface38;
		class334.aClass427_3635.method6742();
		class334.aClass427_3635.aFloatArray4807[0] = (f_152_ - f) * interface38.method224(1.0F);
		class334.aClass427_3635.aFloatArray4807[1] = (f_153_ - f_151_) * interface38.method224(1.0F);
		class334.aClass427_3635.aFloatArray4807[4] = (f_154_ - f) * interface38.method264(1.0F);
		class334.aClass427_3635.aFloatArray4807[5] = (f_155_ - f_151_) * interface38.method264(1.0F);
		class334.aClass427_3635.aFloatArray4807[12] = (f - (float) i_156_) * interface38.method224(1.0F);
		class334.aClass427_3635.aFloatArray4807[13] = (f_151_ - (float) i_157_) * interface38.method264(1.0F);
		class334.method5853();
	}

	public void method2444(int i, int i_162_, int i_163_, int i_164_, int[] is, int i_165_, int i_166_) {
		anInterface38_9012.method227(i, i_162_, i_163_, i_164_, is, i_165_, i_166_);
	}

	public void method2465(int i, int i_167_, Class142 class142, int i_168_, int i_169_) {
		aClass180_Sub2_9005.method14942();
		Class334 class334 = aClass180_Sub2_9005.aClass334_9508;
		class334.anInterface38_3630 = anInterface38_9012;
		class334.method5851(1, -1);
		i += anInt9010;
		i_167_ += anInt9004;
		float f = (float) aClass180_Sub2_9005.method3285(1019684890).method2728();
		float f_170_ = (float) aClass180_Sub2_9005.method3285(703009977).method2729();
		class334.aClass427_3633.method6815((float) anInt9007 * 2.0F / f, (float) anInt9008 * 2.0F / f_170_, 1.0F, 1.0F);
		class334.aClass427_3633.aFloatArray4807[12] = (((float) i + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
		class334.aClass427_3633.aFloatArray4807[13] = (((float) i_167_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_170_) - 1.0F;
		class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
		class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
		class334.anInterface37_3636 = aClass180_Sub2_9005.anInterface37_9501;
		class334.anInt3637 = 0;
		class334.aClass355_3634 = aClass180_Sub2_9005.aClass355_9529;
		Interface38 interface38 = ((Class142_Sub2) class142).anInterface38_9018;
		class334.anInterface38_3638 = interface38;
		class334.aClass427_3635.method6815(interface38.method224((float) anInt9007), interface38.method264((float) anInt9008), 1.0F, 1.0F);
		class334.aClass427_3635.aFloatArray4807[12] = interface38.method224((float) (i - i_168_));
		class334.aClass427_3635.aFloatArray4807[13] = interface38.method264((float) (i_167_ - i_169_));
		class334.method5853();
	}

	public void method2434(int i, int i_171_, int i_172_, int i_173_, int[] is, int i_174_, int i_175_) {
		anInterface38_9012.method227(i, i_171_, i_172_, i_173_, is, i_174_, i_175_);
	}

	public Interface21 method2454() {
		return anInterface21_9006;
	}

	public void method2482(int[] is) {
		is[0] = anInt9010;
		is[1] = anInt9004;
		is[2] = anInt9013;
		is[3] = anInt9009;
	}

	public void method2440(int i, int i_176_, int i_177_) {
		int[] is = aClass180_Sub2_9005.method3113(i, i_176_, anInt9007, anInt9008);
		int[] is_178_ = new int[anInt9007 * anInt9008];
		anInterface38_9012.method229(0, 0, anInt9007, anInt9008, is_178_, 0);
		if (i_177_ == 0) {
			for (int i_179_ = 0; i_179_ < anInt9008; i_179_++) {
				int i_180_ = i_179_ * anInt9007;
				for (int i_181_ = 0; i_181_ < anInt9007; i_181_++)
					is_178_[i_180_ + i_181_] = (is_178_[i_180_ + i_181_] & 0xffffff | is[i_180_ + i_181_] << 8 & ~0xffffff);
			}
		} else if (i_177_ == 1) {
			for (int i_182_ = 0; i_182_ < anInt9008; i_182_++) {
				int i_183_ = i_182_ * anInt9007;
				for (int i_184_ = 0; i_184_ < anInt9007; i_184_++)
					is_178_[i_183_ + i_184_] = (is_178_[i_183_ + i_184_] & 0xffffff | is[i_183_ + i_184_] << 16 & ~0xffffff);
			}
		} else if (i_177_ == 2) {
			for (int i_185_ = 0; i_185_ < anInt9008; i_185_++) {
				int i_186_ = i_185_ * anInt9007;
				for (int i_187_ = 0; i_187_ < anInt9007; i_187_++)
					is_178_[i_186_ + i_187_] = (is_178_[i_186_ + i_187_] & 0xffffff | is[i_186_ + i_187_] << 24 & ~0xffffff);
			}
		} else if (i_177_ == 3) {
			for (int i_188_ = 0; i_188_ < anInt9008; i_188_++) {
				int i_189_ = i_188_ * anInt9007;
				for (int i_190_ = 0; i_190_ < anInt9007; i_190_++)
					is_178_[i_189_ + i_190_] = (is_178_[i_189_ + i_190_] & 0xffffff | (is[i_189_ + i_190_] != 0 ? -16777216 : 0));
			}
		}
		method2459(0, 0, anInt9007, anInt9008, is_178_, 0, anInt9007);
	}

	public void method2438(int i, int i_191_, Class142 class142, int i_192_, int i_193_) {
		aClass180_Sub2_9005.method14942();
		Class334 class334 = aClass180_Sub2_9005.aClass334_9508;
		class334.anInterface38_3630 = anInterface38_9012;
		class334.method5851(1, -1);
		i += anInt9010;
		i_191_ += anInt9004;
		float f = (float) aClass180_Sub2_9005.method3285(1623086532).method2728();
		float f_194_ = (float) aClass180_Sub2_9005.method3285(860736233).method2729();
		class334.aClass427_3633.method6815((float) anInt9007 * 2.0F / f, (float) anInt9008 * 2.0F / f_194_, 1.0F, 1.0F);
		class334.aClass427_3633.aFloatArray4807[12] = (((float) i + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
		class334.aClass427_3633.aFloatArray4807[13] = (((float) i_191_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_194_) - 1.0F;
		class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
		class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
		class334.anInterface37_3636 = aClass180_Sub2_9005.anInterface37_9501;
		class334.anInt3637 = 0;
		class334.aClass355_3634 = aClass180_Sub2_9005.aClass355_9529;
		Interface38 interface38 = ((Class142_Sub2) class142).anInterface38_9018;
		class334.anInterface38_3638 = interface38;
		class334.aClass427_3635.method6815(interface38.method224((float) anInt9007), interface38.method264((float) anInt9008), 1.0F, 1.0F);
		class334.aClass427_3635.aFloatArray4807[12] = interface38.method224((float) (i - i_192_));
		class334.aClass427_3635.aFloatArray4807[13] = interface38.method264((float) (i_191_ - i_193_));
		class334.method5853();
	}

	void method2439(int i, int i_195_, int i_196_, int i_197_, int i_198_, int i_199_, int i_200_, int i_201_) {
		if (aClass180_Sub2_9005.method14912() != Class342.aClass342_3690) {
			if (aBool9015) {
				i_196_ = i_196_ * anInt9007 / method42();
				i_197_ = i_197_ * anInt9008 / method2410();
				i += anInt9010 * i_196_ / anInt9007;
				i_195_ += anInt9004 * i_197_ / anInt9008;
			}
			aClass180_Sub2_9005.aClass365_9538.method6336((float) i, (float) i_195_, (float) (i + i_196_), (float) (i_195_ + i_197_), anInterface38_9012.method224(0.0F), anInterface38_9012.method264(0.0F), anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) anInt9008), anInterface38_9012, i_199_);
		} else {
			aClass180_Sub2_9005.method14942();
			aClass180_Sub2_9005.method15238(i_200_);
			Class334 class334 = aClass180_Sub2_9005.aClass334_9508;
			class334.anInterface38_3630 = anInterface38_9012;
			class334.method5851(i_198_, i_199_);
			if (aBool9015) {
				i_196_ = i_196_ * anInt9007 / method42();
				i_197_ = i_197_ * anInt9008 / method2410();
				i += anInt9010 * i_196_ / anInt9007;
				i_195_ += anInt9004 * i_197_ / anInt9008;
			}
			float f = (float) aClass180_Sub2_9005.method3285(464560714).method2728();
			float f_202_ = (float) aClass180_Sub2_9005.method3285(1528787677).method2729();
			class334.aClass427_3633.method6815((float) i_196_ * 2.0F / f, (float) i_197_ * 2.0F / f_202_, 1.0F, 1.0F);
			class334.aClass427_3633.aFloatArray4807[12] = (((float) i + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
			class334.aClass427_3633.aFloatArray4807[13] = (((float) i_195_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_202_) - 1.0F;
			class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
			class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
			class334.anInterface37_3636 = aClass180_Sub2_9005.anInterface37_9501;
			class334.anInt3637 = 0;
			class334.aClass355_3634 = aClass180_Sub2_9005.aClass355_9529;
			class334.method5856();
		}
	}

	void method2472(int i, int i_203_, int i_204_, int i_205_, int i_206_, int i_207_, int i_208_, int i_209_) {
		if (aClass180_Sub2_9005.method14912() != Class342.aClass342_3690) {
			if (aBool9015) {
				i_204_ = i_204_ * anInt9007 / method42();
				i_205_ = i_205_ * anInt9008 / method2410();
				i += anInt9010 * i_204_ / anInt9007;
				i_203_ += anInt9004 * i_205_ / anInt9008;
			}
			aClass180_Sub2_9005.aClass365_9538.method6336((float) i, (float) i_203_, (float) (i + i_204_), (float) (i_203_ + i_205_), anInterface38_9012.method224(0.0F), anInterface38_9012.method264(0.0F), anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) anInt9008), anInterface38_9012, i_207_);
		} else {
			aClass180_Sub2_9005.method14942();
			aClass180_Sub2_9005.method15238(i_208_);
			Class334 class334 = aClass180_Sub2_9005.aClass334_9508;
			class334.anInterface38_3630 = anInterface38_9012;
			class334.method5851(i_206_, i_207_);
			if (aBool9015) {
				i_204_ = i_204_ * anInt9007 / method42();
				i_205_ = i_205_ * anInt9008 / method2410();
				i += anInt9010 * i_204_ / anInt9007;
				i_203_ += anInt9004 * i_205_ / anInt9008;
			}
			float f = (float) aClass180_Sub2_9005.method3285(1196069077).method2728();
			float f_210_ = (float) aClass180_Sub2_9005.method3285(1560818715).method2729();
			class334.aClass427_3633.method6815((float) i_204_ * 2.0F / f, (float) i_205_ * 2.0F / f_210_, 1.0F, 1.0F);
			class334.aClass427_3633.aFloatArray4807[12] = (((float) i + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
			class334.aClass427_3633.aFloatArray4807[13] = (((float) i_203_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_210_) - 1.0F;
			class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
			class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
			class334.anInterface37_3636 = aClass180_Sub2_9005.anInterface37_9501;
			class334.anInt3637 = 0;
			class334.aClass355_3634 = aClass180_Sub2_9005.aClass355_9529;
			class334.method5856();
		}
	}

	public void method2441(int i, int i_211_, int i_212_, int i_213_, int[] is, int[] is_214_, int i_215_, int i_216_) {
		anInterface38_9012.method230(i, i_211_, i_212_, i_213_, is, is_214_, i_215_);
	}

	public void method2422(int i, int i_217_, int i_218_, int i_219_, int i_220_, int i_221_, int i_222_) {
		if (aClass180_Sub2_9005.method14912() != Class342.aClass342_3690) {
			int i_223_ = i_217_ + i_219_;
			int i_224_ = i + i_218_;
			int i_225_ = method42();
			int i_226_ = method2410();
			int i_227_ = i_217_ + anInt9004;
			for (int i_228_ = i_227_ + anInt9008; i_228_ <= i_223_; i_228_ += i_226_) {
				int i_229_ = i + anInt9010;
				for (int i_230_ = i_229_ + anInt9007; i_230_ <= i_224_; i_230_ += i_225_) {
					aClass180_Sub2_9005.aClass365_9538.method6336((float) i_229_, (float) i_227_, (float) (i_229_ + anInt9007), (float) (i_227_ + anInt9008), 0.0F, 0.0F, anInterface38_9012.method233(), anInterface38_9012.method222(), anInterface38_9012, i_221_);
					i_229_ += i_225_;
				}
				if (i_229_ < i_224_) {
					int i_231_ = i_224_ - i_229_;
					aClass180_Sub2_9005.aClass365_9538.method6336((float) i_229_, (float) i_227_, (float) (i_229_ + i_231_), (float) (i_227_ + anInt9008), 0.0F, 0.0F, ((float) i_231_ / (float) anInt9007 * anInterface38_9012.method233()), anInterface38_9012.method222(), anInterface38_9012, i_221_);
				}
				i_227_ += i_226_;
			}
			if (i_227_ < i_223_) {
				int i_232_ = i_223_ - i_227_;
				float f = ((float) i_232_ / (float) anInt9008 * anInterface38_9012.method222());
				int i_233_ = i + anInt9010;
				for (int i_234_ = i_233_ + anInt9007; i_234_ <= i_224_; i_234_ += i_225_) {
					aClass180_Sub2_9005.aClass365_9538.method6336((float) i_233_, (float) i_227_, (float) (i_233_ + anInt9007), (float) (i_227_ + i_232_), 0.0F, 0.0F, anInterface38_9012.method233(), f, anInterface38_9012, i_221_);
					i_233_ += i_225_;
				}
				if (i_233_ < i_224_) {
					int i_235_ = i_224_ - i_233_;
					aClass180_Sub2_9005.aClass365_9538.method6336((float) i_233_, (float) i_227_, (float) (i_233_ + i_235_), (float) (i_227_ + i_232_), 0.0F, 0.0F, ((float) i_235_ / (float) anInt9007 * anInterface38_9012.method233()), f, anInterface38_9012, i_221_);
				}
			}
		} else {
			aClass180_Sub2_9005.method14942();
			aClass180_Sub2_9005.method15238(i_222_);
			Class334 class334 = aClass180_Sub2_9005.aClass334_9508;
			class334.anInterface38_3630 = anInterface38_9012;
			class334.method5851(i_220_, i_221_);
			float f = (float) aClass180_Sub2_9005.method3285(521170288).method2728();
			float f_236_ = (float) aClass180_Sub2_9005.method3285(1293815552).method2729();
			class334.anInterface37_3636 = aClass180_Sub2_9005.anInterface37_9501;
			class334.anInt3637 = 0;
			class334.aClass355_3634 = aClass180_Sub2_9005.aClass355_9529;
			boolean bool = aBool9017 && anInt9004 == 0 && anInt9009 == 0;
			boolean bool_237_ = aBool9016 && anInt9010 == 0 && anInt9013 == 0;
			if (bool_237_ & bool) {
				class334.aClass427_3633.method6815((float) i_218_ * 2.0F / f, ((float) i_219_ * 2.0F / f_236_), 1.0F, 1.0F);
				class334.aClass427_3633.aFloatArray4807[12] = (((float) i + aClass180_Sub2_9005.method14911()) * 2.0F / f) - 1.0F;
				class334.aClass427_3633.aFloatArray4807[13] = (((float) i_217_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_236_) - 1.0F;
				class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
				class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_218_), anInterface38_9012.method264((float) i_219_), 1.0F, 1.0F);
				class334.method5856();
			} else if (bool_237_) {
				int i_238_ = i_217_ + i_219_;
				int i_239_ = method2410();
				class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_218_), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
				int i_240_ = i_217_ + anInt9004;
				for (int i_241_ = i_240_ + anInt9008; i_241_ <= i_238_; i_241_ += i_239_) {
					class334.aClass427_3633.method6815(((float) i_218_ * 2.0F / f), ((float) anInt9008 * 2.0F / f_236_), 1.0F, 1.0F);
					class334.aClass427_3633.aFloatArray4807[12] = (((float) i + aClass180_Sub2_9005.method14911()) * 2.0F / f) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[13] = (((float) i_240_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_236_) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
					class334.method5856();
					i_240_ += i_239_;
				}
				if (i_240_ < i_238_) {
					int i_242_ = i_238_ - i_240_;
					class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_218_), anInterface38_9012.method264((float) i_242_), 1.0F, 1.0F);
					class334.aClass427_3633.method6815(((float) i_218_ * 2.0F / f), ((float) i_242_ * 2.0F / f_236_), 1.0F, 1.0F);
					class334.aClass427_3633.aFloatArray4807[12] = (((float) i + aClass180_Sub2_9005.method14911()) * 2.0F / f) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[13] = (((float) i_240_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_236_) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
					class334.method5856();
				}
			} else if (bool) {
				int i_243_ = i + i_218_;
				int i_244_ = method42();
				class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) i_219_), 1.0F, 1.0F);
				int i_245_ = i + anInt9010;
				for (int i_246_ = i_245_ + anInt9007; i_246_ <= i_243_; i_246_ += i_244_) {
					class334.aClass427_3633.method6815(((float) anInt9007 * 2.0F / f), ((float) i_219_ * 2.0F / f_236_), 1.0F, 1.0F);
					class334.aClass427_3633.aFloatArray4807[12] = (((float) i_245_ + aClass180_Sub2_9005.method14911()) * 2.0F / f) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[13] = (((float) i_217_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_236_) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
					class334.method5856();
					i_245_ += i_244_;
				}
				if (i_245_ < i_243_) {
					int i_247_ = i_243_ - i_245_;
					class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_247_), anInterface38_9012.method264((float) i_219_), 1.0F, 1.0F);
					class334.aClass427_3633.method6815(((float) i_247_ * 2.0F / f), ((float) i_219_ * 2.0F / f_236_), 1.0F, 1.0F);
					class334.aClass427_3633.aFloatArray4807[12] = (((float) i_245_ + aClass180_Sub2_9005.method14911()) * 2.0F / f) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[13] = (((float) i_217_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_236_) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
					class334.method5856();
				}
			} else {
				int i_248_ = i_217_ + i_219_;
				int i_249_ = i + i_218_;
				int i_250_ = method42();
				int i_251_ = method2410();
				int i_252_ = i_217_ + anInt9004;
				for (int i_253_ = i_252_ + anInt9008; i_253_ <= i_248_; i_253_ += i_251_) {
					class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
					int i_254_ = i + anInt9010;
					for (int i_255_ = i_254_ + anInt9007; i_255_ <= i_249_; i_255_ += i_250_) {
						class334.aClass427_3633.method6815(((float) anInt9007 * 2.0F / f), ((float) anInt9008 * 2.0F / f_236_), 1.0F, 1.0F);
						class334.aClass427_3633.aFloatArray4807[12] = (((float) i_254_ + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
						class334.aClass427_3633.aFloatArray4807[13] = (((float) i_252_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_236_) - 1.0F;
						class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
						class334.method5856();
						i_254_ += i_250_;
					}
					if (i_254_ < i_249_) {
						int i_256_ = i_249_ - i_254_;
						class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_256_), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
						class334.aClass427_3633.method6815(((float) i_256_ * 2.0F / f), ((float) anInt9008 * 2.0F / f_236_), 1.0F, 1.0F);
						class334.aClass427_3633.aFloatArray4807[12] = (((float) i_254_ + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
						class334.aClass427_3633.aFloatArray4807[13] = (((float) i_252_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_236_) - 1.0F;
						class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
						class334.method5856();
					}
					i_252_ += i_251_;
				}
				if (i_252_ < i_248_) {
					int i_257_ = i_248_ - i_252_;
					class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) i_257_), 1.0F, 1.0F);
					int i_258_ = i + anInt9010;
					for (int i_259_ = i_258_ + anInt9007; i_259_ <= i_249_; i_259_ += i_250_) {
						class334.aClass427_3633.method6815(((float) anInt9007 * 2.0F / f), ((float) i_257_ * 2.0F / f_236_), 1.0F, 1.0F);
						class334.aClass427_3633.aFloatArray4807[12] = (((float) i_258_ + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
						class334.aClass427_3633.aFloatArray4807[13] = (((float) i_252_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_236_) - 1.0F;
						class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
						class334.method5856();
						i_258_ += i_250_;
					}
					if (i_258_ < i_249_) {
						int i_260_ = i_249_ - i_258_;
						class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_260_), anInterface38_9012.method264((float) i_257_), 1.0F, 1.0F);
						class334.aClass427_3633.method6815(((float) i_260_ * 2.0F / f), ((float) i_257_ * 2.0F / f_236_), 1.0F, 1.0F);
						class334.aClass427_3633.aFloatArray4807[12] = (((float) i_258_ + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
						class334.aClass427_3633.aFloatArray4807[13] = (((float) i_252_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_236_) - 1.0F;
						class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
						class334.method5856();
					}
				}
			}
		}
	}

	public void method2412(int i, int i_261_, int i_262_, int i_263_, int[] is, int[] is_264_, int i_265_, int i_266_) {
		anInterface38_9012.method230(i, i_261_, i_262_, i_263_, is, is_264_, i_265_);
	}

	public Interface21 method2443() {
		return anInterface21_9006;
	}

	public void method2417(int i, int i_267_, int i_268_, int i_269_) {
		anInt9010 = i;
		anInt9004 = i_267_;
		anInt9013 = i_268_;
		anInt9009 = i_269_;
		aBool9015 = (anInt9010 != 0 || anInt9004 != 0 || anInt9013 != 0 || anInt9009 != 0);
	}

	public void method2446(int[] is) {
		is[0] = anInt9010;
		is[1] = anInt9004;
		is[2] = anInt9013;
		is[3] = anInt9009;
	}

	public void method2447(int[] is) {
		is[0] = anInt9010;
		is[1] = anInt9004;
		is[2] = anInt9013;
		is[3] = anInt9009;
	}

	public int method2448() {
		return anInt9007;
	}

	public void method2409(int i, int i_270_, int i_271_, int i_272_, int i_273_, int i_274_, int i_275_) {
		if (aClass180_Sub2_9005.method14912() != Class342.aClass342_3690) {
			int i_276_ = i_270_ + i_272_;
			int i_277_ = i + i_271_;
			int i_278_ = method42();
			int i_279_ = method2410();
			int i_280_ = i_270_ + anInt9004;
			for (int i_281_ = i_280_ + anInt9008; i_281_ <= i_276_; i_281_ += i_279_) {
				int i_282_ = i + anInt9010;
				for (int i_283_ = i_282_ + anInt9007; i_283_ <= i_277_; i_283_ += i_278_) {
					aClass180_Sub2_9005.aClass365_9538.method6336((float) i_282_, (float) i_280_, (float) (i_282_ + anInt9007), (float) (i_280_ + anInt9008), 0.0F, 0.0F, anInterface38_9012.method233(), anInterface38_9012.method222(), anInterface38_9012, i_274_);
					i_282_ += i_278_;
				}
				if (i_282_ < i_277_) {
					int i_284_ = i_277_ - i_282_;
					aClass180_Sub2_9005.aClass365_9538.method6336((float) i_282_, (float) i_280_, (float) (i_282_ + i_284_), (float) (i_280_ + anInt9008), 0.0F, 0.0F, ((float) i_284_ / (float) anInt9007 * anInterface38_9012.method233()), anInterface38_9012.method222(), anInterface38_9012, i_274_);
				}
				i_280_ += i_279_;
			}
			if (i_280_ < i_276_) {
				int i_285_ = i_276_ - i_280_;
				float f = ((float) i_285_ / (float) anInt9008 * anInterface38_9012.method222());
				int i_286_ = i + anInt9010;
				for (int i_287_ = i_286_ + anInt9007; i_287_ <= i_277_; i_287_ += i_278_) {
					aClass180_Sub2_9005.aClass365_9538.method6336((float) i_286_, (float) i_280_, (float) (i_286_ + anInt9007), (float) (i_280_ + i_285_), 0.0F, 0.0F, anInterface38_9012.method233(), f, anInterface38_9012, i_274_);
					i_286_ += i_278_;
				}
				if (i_286_ < i_277_) {
					int i_288_ = i_277_ - i_286_;
					aClass180_Sub2_9005.aClass365_9538.method6336((float) i_286_, (float) i_280_, (float) (i_286_ + i_288_), (float) (i_280_ + i_285_), 0.0F, 0.0F, ((float) i_288_ / (float) anInt9007 * anInterface38_9012.method233()), f, anInterface38_9012, i_274_);
				}
			}
		} else {
			aClass180_Sub2_9005.method14942();
			aClass180_Sub2_9005.method15238(i_275_);
			Class334 class334 = aClass180_Sub2_9005.aClass334_9508;
			class334.anInterface38_3630 = anInterface38_9012;
			class334.method5851(i_273_, i_274_);
			float f = (float) aClass180_Sub2_9005.method3285(379163184).method2728();
			float f_289_ = (float) aClass180_Sub2_9005.method3285(854821009).method2729();
			class334.anInterface37_3636 = aClass180_Sub2_9005.anInterface37_9501;
			class334.anInt3637 = 0;
			class334.aClass355_3634 = aClass180_Sub2_9005.aClass355_9529;
			boolean bool = aBool9017 && anInt9004 == 0 && anInt9009 == 0;
			boolean bool_290_ = aBool9016 && anInt9010 == 0 && anInt9013 == 0;
			if (bool_290_ & bool) {
				class334.aClass427_3633.method6815((float) i_271_ * 2.0F / f, ((float) i_272_ * 2.0F / f_289_), 1.0F, 1.0F);
				class334.aClass427_3633.aFloatArray4807[12] = (((float) i + aClass180_Sub2_9005.method14911()) * 2.0F / f) - 1.0F;
				class334.aClass427_3633.aFloatArray4807[13] = (((float) i_270_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_289_) - 1.0F;
				class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
				class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_271_), anInterface38_9012.method264((float) i_272_), 1.0F, 1.0F);
				class334.method5856();
			} else if (bool_290_) {
				int i_291_ = i_270_ + i_272_;
				int i_292_ = method2410();
				class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_271_), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
				int i_293_ = i_270_ + anInt9004;
				for (int i_294_ = i_293_ + anInt9008; i_294_ <= i_291_; i_294_ += i_292_) {
					class334.aClass427_3633.method6815(((float) i_271_ * 2.0F / f), ((float) anInt9008 * 2.0F / f_289_), 1.0F, 1.0F);
					class334.aClass427_3633.aFloatArray4807[12] = (((float) i + aClass180_Sub2_9005.method14911()) * 2.0F / f) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[13] = (((float) i_293_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_289_) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
					class334.method5856();
					i_293_ += i_292_;
				}
				if (i_293_ < i_291_) {
					int i_295_ = i_291_ - i_293_;
					class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_271_), anInterface38_9012.method264((float) i_295_), 1.0F, 1.0F);
					class334.aClass427_3633.method6815(((float) i_271_ * 2.0F / f), ((float) i_295_ * 2.0F / f_289_), 1.0F, 1.0F);
					class334.aClass427_3633.aFloatArray4807[12] = (((float) i + aClass180_Sub2_9005.method14911()) * 2.0F / f) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[13] = (((float) i_293_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_289_) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
					class334.method5856();
				}
			} else if (bool) {
				int i_296_ = i + i_271_;
				int i_297_ = method42();
				class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) i_272_), 1.0F, 1.0F);
				int i_298_ = i + anInt9010;
				for (int i_299_ = i_298_ + anInt9007; i_299_ <= i_296_; i_299_ += i_297_) {
					class334.aClass427_3633.method6815(((float) anInt9007 * 2.0F / f), ((float) i_272_ * 2.0F / f_289_), 1.0F, 1.0F);
					class334.aClass427_3633.aFloatArray4807[12] = (((float) i_298_ + aClass180_Sub2_9005.method14911()) * 2.0F / f) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[13] = (((float) i_270_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_289_) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
					class334.method5856();
					i_298_ += i_297_;
				}
				if (i_298_ < i_296_) {
					int i_300_ = i_296_ - i_298_;
					class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_300_), anInterface38_9012.method264((float) i_272_), 1.0F, 1.0F);
					class334.aClass427_3633.method6815(((float) i_300_ * 2.0F / f), ((float) i_272_ * 2.0F / f_289_), 1.0F, 1.0F);
					class334.aClass427_3633.aFloatArray4807[12] = (((float) i_298_ + aClass180_Sub2_9005.method14911()) * 2.0F / f) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[13] = (((float) i_270_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_289_) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
					class334.method5856();
				}
			} else {
				int i_301_ = i_270_ + i_272_;
				int i_302_ = i + i_271_;
				int i_303_ = method42();
				int i_304_ = method2410();
				int i_305_ = i_270_ + anInt9004;
				for (int i_306_ = i_305_ + anInt9008; i_306_ <= i_301_; i_306_ += i_304_) {
					class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
					int i_307_ = i + anInt9010;
					for (int i_308_ = i_307_ + anInt9007; i_308_ <= i_302_; i_308_ += i_303_) {
						class334.aClass427_3633.method6815(((float) anInt9007 * 2.0F / f), ((float) anInt9008 * 2.0F / f_289_), 1.0F, 1.0F);
						class334.aClass427_3633.aFloatArray4807[12] = (((float) i_307_ + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
						class334.aClass427_3633.aFloatArray4807[13] = (((float) i_305_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_289_) - 1.0F;
						class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
						class334.method5856();
						i_307_ += i_303_;
					}
					if (i_307_ < i_302_) {
						int i_309_ = i_302_ - i_307_;
						class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_309_), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
						class334.aClass427_3633.method6815(((float) i_309_ * 2.0F / f), ((float) anInt9008 * 2.0F / f_289_), 1.0F, 1.0F);
						class334.aClass427_3633.aFloatArray4807[12] = (((float) i_307_ + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
						class334.aClass427_3633.aFloatArray4807[13] = (((float) i_305_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_289_) - 1.0F;
						class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
						class334.method5856();
					}
					i_305_ += i_304_;
				}
				if (i_305_ < i_301_) {
					int i_310_ = i_301_ - i_305_;
					class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) i_310_), 1.0F, 1.0F);
					int i_311_ = i + anInt9010;
					for (int i_312_ = i_311_ + anInt9007; i_312_ <= i_302_; i_312_ += i_303_) {
						class334.aClass427_3633.method6815(((float) anInt9007 * 2.0F / f), ((float) i_310_ * 2.0F / f_289_), 1.0F, 1.0F);
						class334.aClass427_3633.aFloatArray4807[12] = (((float) i_311_ + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
						class334.aClass427_3633.aFloatArray4807[13] = (((float) i_305_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_289_) - 1.0F;
						class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
						class334.method5856();
						i_311_ += i_303_;
					}
					if (i_311_ < i_302_) {
						int i_313_ = i_302_ - i_311_;
						class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_313_), anInterface38_9012.method264((float) i_310_), 1.0F, 1.0F);
						class334.aClass427_3633.method6815(((float) i_313_ * 2.0F / f), ((float) i_310_ * 2.0F / f_289_), 1.0F, 1.0F);
						class334.aClass427_3633.aFloatArray4807[12] = (((float) i_311_ + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
						class334.aClass427_3633.aFloatArray4807[13] = (((float) i_305_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_289_) - 1.0F;
						class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
						class334.method5856();
					}
				}
			}
		}
	}

	void method2457(float f, float f_314_, float f_315_, float f_316_, float f_317_, float f_318_, int i, int i_319_, int i_320_, int i_321_) {
		if (aClass180_Sub2_9005.method14912() != Class342.aClass342_3690)
			aClass180_Sub2_9005.aClass365_9538.method6339(f, f_314_, f_315_, f_316_, f_317_, f_318_, f_315_ + f_317_ - f, f_316_ + f_318_ - f_314_, 0.0F, 0.0F, anInterface38_9012.method233(), 0.0F, 0.0F, anInterface38_9012.method222(), anInterface38_9012.method233(), anInterface38_9012.method222(), anInterface38_9012, i_319_);
		else {
			aClass180_Sub2_9005.method14942();
			aClass180_Sub2_9005.method15238(i_320_);
			if (aBool9015) {
				float f_322_ = (float) method42();
				float f_323_ = (float) method2410();
				float f_324_ = (f_315_ - f) / f_322_;
				float f_325_ = (f_316_ - f_314_) / f_322_;
				float f_326_ = (f_317_ - f) / f_323_;
				float f_327_ = (f_318_ - f_314_) / f_323_;
				float f_328_ = f_326_ * (float) anInt9004;
				float f_329_ = f_327_ * (float) anInt9004;
				float f_330_ = f_324_ * (float) anInt9010;
				float f_331_ = f_325_ * (float) anInt9010;
				float f_332_ = -f_324_ * (float) anInt9013;
				float f_333_ = -f_325_ * (float) anInt9013;
				float f_334_ = -f_326_ * (float) anInt9009;
				float f_335_ = -f_327_ * (float) anInt9009;
				f = f + f_330_ + f_328_;
				f_314_ = f_314_ + f_331_ + f_329_;
				f_315_ = f_315_ + f_332_ + f_328_;
				f_316_ = f_316_ + f_333_ + f_329_;
				f_317_ = f_317_ + f_330_ + f_334_;
				f_318_ = f_318_ + f_331_ + f_335_;
			}
			Class334 class334 = aClass180_Sub2_9005.aClass334_9508;
			class334.anInterface38_3630 = anInterface38_9012;
			class334.method5851(i, i_319_);
			float f_336_ = (float) aClass180_Sub2_9005.method3285(431495803).method2728();
			float f_337_ = (float) aClass180_Sub2_9005.method3285(347000445).method2729();
			class334.aClass427_3633.method6742();
			class334.aClass427_3633.aFloatArray4807[0] = (f_315_ - f) * 2.0F / f_336_;
			class334.aClass427_3633.aFloatArray4807[1] = (f_316_ - f_314_) * 2.0F / f_337_;
			class334.aClass427_3633.aFloatArray4807[4] = (f_317_ - f) * 2.0F / f_336_;
			class334.aClass427_3633.aFloatArray4807[5] = (f_318_ - f_314_) * 2.0F / f_337_;
			class334.aClass427_3633.aFloatArray4807[12] = ((f + aClass180_Sub2_9005.method14911()) * 2.0F / f_336_ - 1.0F);
			class334.aClass427_3633.aFloatArray4807[13] = ((f_314_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_337_ - 1.0F);
			class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
			class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
			class334.anInterface37_3636 = aClass180_Sub2_9005.anInterface37_9501;
			class334.anInt3637 = 0;
			class334.aClass355_3634 = aClass180_Sub2_9005.aClass355_9529;
			class334.method5856();
		}
	}

	public int method40() {
		return anInt9007 + anInt9010 + anInt9013;
	}

	public int method43() {
		return anInt9007 + anInt9010 + anInt9013;
	}

	public int method44() {
		return anInt9007 + anInt9010 + anInt9013;
	}

	public int method2431() {
		return anInt9008 + anInt9004 + anInt9009;
	}

	public void method2435(int i, int i_338_, int i_339_, int i_340_, int i_341_, int i_342_) {
		anInterface38_9012.method231(i, i_338_, i_339_, i_340_, i_341_, i_342_);
	}

	public void method2453(int i, int i_343_, int i_344_, int i_345_, int i_346_) {
		if (aClass180_Sub2_9005.method14912() != Class342.aClass342_3690) {
			i += anInt9010;
			i_343_ += anInt9004;
			aClass180_Sub2_9005.aClass365_9538.method6336((float) i, (float) i_343_, (float) (i + anInt9007), (float) (i_343_ + anInt9008), 0.0F, 0.0F, anInterface38_9012.method233(), anInterface38_9012.method222(), anInterface38_9012, i_345_);
		} else {
			aClass180_Sub2_9005.method14942();
			aClass180_Sub2_9005.method15238(i_346_);
			Class334 class334 = aClass180_Sub2_9005.aClass334_9508;
			class334.anInterface38_3630 = anInterface38_9012;
			class334.method5851(i_344_, i_345_);
			i += anInt9010;
			i_343_ += anInt9004;
			float f = (float) aClass180_Sub2_9005.method3285(1560654146).method2728();
			float f_347_ = (float) aClass180_Sub2_9005.method3285(773775793).method2729();
			class334.aClass427_3633.method6815((float) anInt9007 * 2.0F / f, ((float) anInt9008 * 2.0F / f_347_), 1.0F, 1.0F);
			class334.aClass427_3633.aFloatArray4807[12] = (((float) i + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
			class334.aClass427_3633.aFloatArray4807[13] = (((float) i_343_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_347_) - 1.0F;
			class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
			class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
			class334.anInterface37_3636 = aClass180_Sub2_9005.anInterface37_9501;
			class334.anInt3637 = 0;
			class334.aClass355_3634 = aClass180_Sub2_9005.aClass355_9529;
			class334.method5856();
		}
	}

	public int method2452() {
		return anInt9008 + anInt9004 + anInt9009;
	}

	public void method2436(int i, int i_348_, int i_349_) {
		int[] is = aClass180_Sub2_9005.method3113(i, i_348_, anInt9007, anInt9008);
		int[] is_350_ = new int[anInt9007 * anInt9008];
		anInterface38_9012.method229(0, 0, anInt9007, anInt9008, is_350_, 0);
		if (i_349_ == 0) {
			for (int i_351_ = 0; i_351_ < anInt9008; i_351_++) {
				int i_352_ = i_351_ * anInt9007;
				for (int i_353_ = 0; i_353_ < anInt9007; i_353_++)
					is_350_[i_352_ + i_353_] = (is_350_[i_352_ + i_353_] & 0xffffff | is[i_352_ + i_353_] << 8 & ~0xffffff);
			}
		} else if (i_349_ == 1) {
			for (int i_354_ = 0; i_354_ < anInt9008; i_354_++) {
				int i_355_ = i_354_ * anInt9007;
				for (int i_356_ = 0; i_356_ < anInt9007; i_356_++)
					is_350_[i_355_ + i_356_] = (is_350_[i_355_ + i_356_] & 0xffffff | is[i_355_ + i_356_] << 16 & ~0xffffff);
			}
		} else if (i_349_ == 2) {
			for (int i_357_ = 0; i_357_ < anInt9008; i_357_++) {
				int i_358_ = i_357_ * anInt9007;
				for (int i_359_ = 0; i_359_ < anInt9007; i_359_++)
					is_350_[i_358_ + i_359_] = (is_350_[i_358_ + i_359_] & 0xffffff | is[i_358_ + i_359_] << 24 & ~0xffffff);
			}
		} else if (i_349_ == 3) {
			for (int i_360_ = 0; i_360_ < anInt9008; i_360_++) {
				int i_361_ = i_360_ * anInt9007;
				for (int i_362_ = 0; i_362_ < anInt9007; i_362_++)
					is_350_[i_361_ + i_362_] = (is_350_[i_361_ + i_362_] & 0xffffff | (is[i_361_ + i_362_] != 0 ? -16777216 : 0));
			}
		}
		method2459(0, 0, anInt9007, anInt9008, is_350_, 0, anInt9007);
	}

	public void method2456(int i, int i_363_, int i_364_, int i_365_, int i_366_, int i_367_, int i_368_) {
		if (aClass180_Sub2_9005.method14912() != Class342.aClass342_3690) {
			int i_369_ = i_363_ + i_365_;
			int i_370_ = i + i_364_;
			int i_371_ = method42();
			int i_372_ = method2410();
			int i_373_ = i_363_ + anInt9004;
			for (int i_374_ = i_373_ + anInt9008; i_374_ <= i_369_; i_374_ += i_372_) {
				int i_375_ = i + anInt9010;
				for (int i_376_ = i_375_ + anInt9007; i_376_ <= i_370_; i_376_ += i_371_) {
					aClass180_Sub2_9005.aClass365_9538.method6336((float) i_375_, (float) i_373_, (float) (i_375_ + anInt9007), (float) (i_373_ + anInt9008), 0.0F, 0.0F, anInterface38_9012.method233(), anInterface38_9012.method222(), anInterface38_9012, i_367_);
					i_375_ += i_371_;
				}
				if (i_375_ < i_370_) {
					int i_377_ = i_370_ - i_375_;
					aClass180_Sub2_9005.aClass365_9538.method6336((float) i_375_, (float) i_373_, (float) (i_375_ + i_377_), (float) (i_373_ + anInt9008), 0.0F, 0.0F, ((float) i_377_ / (float) anInt9007 * anInterface38_9012.method233()), anInterface38_9012.method222(), anInterface38_9012, i_367_);
				}
				i_373_ += i_372_;
			}
			if (i_373_ < i_369_) {
				int i_378_ = i_369_ - i_373_;
				float f = ((float) i_378_ / (float) anInt9008 * anInterface38_9012.method222());
				int i_379_ = i + anInt9010;
				for (int i_380_ = i_379_ + anInt9007; i_380_ <= i_370_; i_380_ += i_371_) {
					aClass180_Sub2_9005.aClass365_9538.method6336((float) i_379_, (float) i_373_, (float) (i_379_ + anInt9007), (float) (i_373_ + i_378_), 0.0F, 0.0F, anInterface38_9012.method233(), f, anInterface38_9012, i_367_);
					i_379_ += i_371_;
				}
				if (i_379_ < i_370_) {
					int i_381_ = i_370_ - i_379_;
					aClass180_Sub2_9005.aClass365_9538.method6336((float) i_379_, (float) i_373_, (float) (i_379_ + i_381_), (float) (i_373_ + i_378_), 0.0F, 0.0F, ((float) i_381_ / (float) anInt9007 * anInterface38_9012.method233()), f, anInterface38_9012, i_367_);
				}
			}
		} else {
			aClass180_Sub2_9005.method14942();
			aClass180_Sub2_9005.method15238(i_368_);
			Class334 class334 = aClass180_Sub2_9005.aClass334_9508;
			class334.anInterface38_3630 = anInterface38_9012;
			class334.method5851(i_366_, i_367_);
			float f = (float) aClass180_Sub2_9005.method3285(794491873).method2728();
			float f_382_ = (float) aClass180_Sub2_9005.method3285(1168966670).method2729();
			class334.anInterface37_3636 = aClass180_Sub2_9005.anInterface37_9501;
			class334.anInt3637 = 0;
			class334.aClass355_3634 = aClass180_Sub2_9005.aClass355_9529;
			boolean bool = aBool9017 && anInt9004 == 0 && anInt9009 == 0;
			boolean bool_383_ = aBool9016 && anInt9010 == 0 && anInt9013 == 0;
			if (bool_383_ & bool) {
				class334.aClass427_3633.method6815((float) i_364_ * 2.0F / f, ((float) i_365_ * 2.0F / f_382_), 1.0F, 1.0F);
				class334.aClass427_3633.aFloatArray4807[12] = (((float) i + aClass180_Sub2_9005.method14911()) * 2.0F / f) - 1.0F;
				class334.aClass427_3633.aFloatArray4807[13] = (((float) i_363_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_382_) - 1.0F;
				class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
				class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_364_), anInterface38_9012.method264((float) i_365_), 1.0F, 1.0F);
				class334.method5856();
			} else if (bool_383_) {
				int i_384_ = i_363_ + i_365_;
				int i_385_ = method2410();
				class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_364_), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
				int i_386_ = i_363_ + anInt9004;
				for (int i_387_ = i_386_ + anInt9008; i_387_ <= i_384_; i_387_ += i_385_) {
					class334.aClass427_3633.method6815(((float) i_364_ * 2.0F / f), ((float) anInt9008 * 2.0F / f_382_), 1.0F, 1.0F);
					class334.aClass427_3633.aFloatArray4807[12] = (((float) i + aClass180_Sub2_9005.method14911()) * 2.0F / f) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[13] = (((float) i_386_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_382_) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
					class334.method5856();
					i_386_ += i_385_;
				}
				if (i_386_ < i_384_) {
					int i_388_ = i_384_ - i_386_;
					class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_364_), anInterface38_9012.method264((float) i_388_), 1.0F, 1.0F);
					class334.aClass427_3633.method6815(((float) i_364_ * 2.0F / f), ((float) i_388_ * 2.0F / f_382_), 1.0F, 1.0F);
					class334.aClass427_3633.aFloatArray4807[12] = (((float) i + aClass180_Sub2_9005.method14911()) * 2.0F / f) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[13] = (((float) i_386_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_382_) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
					class334.method5856();
				}
			} else if (bool) {
				int i_389_ = i + i_364_;
				int i_390_ = method42();
				class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) i_365_), 1.0F, 1.0F);
				int i_391_ = i + anInt9010;
				for (int i_392_ = i_391_ + anInt9007; i_392_ <= i_389_; i_392_ += i_390_) {
					class334.aClass427_3633.method6815(((float) anInt9007 * 2.0F / f), ((float) i_365_ * 2.0F / f_382_), 1.0F, 1.0F);
					class334.aClass427_3633.aFloatArray4807[12] = (((float) i_391_ + aClass180_Sub2_9005.method14911()) * 2.0F / f) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[13] = (((float) i_363_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_382_) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
					class334.method5856();
					i_391_ += i_390_;
				}
				if (i_391_ < i_389_) {
					int i_393_ = i_389_ - i_391_;
					class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_393_), anInterface38_9012.method264((float) i_365_), 1.0F, 1.0F);
					class334.aClass427_3633.method6815(((float) i_393_ * 2.0F / f), ((float) i_365_ * 2.0F / f_382_), 1.0F, 1.0F);
					class334.aClass427_3633.aFloatArray4807[12] = (((float) i_391_ + aClass180_Sub2_9005.method14911()) * 2.0F / f) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[13] = (((float) i_363_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_382_) - 1.0F;
					class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
					class334.method5856();
				}
			} else {
				int i_394_ = i_363_ + i_365_;
				int i_395_ = i + i_364_;
				int i_396_ = method42();
				int i_397_ = method2410();
				int i_398_ = i_363_ + anInt9004;
				for (int i_399_ = i_398_ + anInt9008; i_399_ <= i_394_; i_399_ += i_397_) {
					class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
					int i_400_ = i + anInt9010;
					for (int i_401_ = i_400_ + anInt9007; i_401_ <= i_395_; i_401_ += i_396_) {
						class334.aClass427_3633.method6815(((float) anInt9007 * 2.0F / f), ((float) anInt9008 * 2.0F / f_382_), 1.0F, 1.0F);
						class334.aClass427_3633.aFloatArray4807[12] = (((float) i_400_ + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
						class334.aClass427_3633.aFloatArray4807[13] = (((float) i_398_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_382_) - 1.0F;
						class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
						class334.method5856();
						i_400_ += i_396_;
					}
					if (i_400_ < i_395_) {
						int i_402_ = i_395_ - i_400_;
						class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_402_), anInterface38_9012.method264((float) anInt9008), 1.0F, 1.0F);
						class334.aClass427_3633.method6815(((float) i_402_ * 2.0F / f), ((float) anInt9008 * 2.0F / f_382_), 1.0F, 1.0F);
						class334.aClass427_3633.aFloatArray4807[12] = (((float) i_400_ + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
						class334.aClass427_3633.aFloatArray4807[13] = (((float) i_398_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_382_) - 1.0F;
						class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
						class334.method5856();
					}
					i_398_ += i_397_;
				}
				if (i_398_ < i_394_) {
					int i_403_ = i_394_ - i_398_;
					class334.aClass427_3631.method6815(anInterface38_9012.method224((float) anInt9007), anInterface38_9012.method264((float) i_403_), 1.0F, 1.0F);
					int i_404_ = i + anInt9010;
					for (int i_405_ = i_404_ + anInt9007; i_405_ <= i_395_; i_405_ += i_396_) {
						class334.aClass427_3633.method6815(((float) anInt9007 * 2.0F / f), ((float) i_403_ * 2.0F / f_382_), 1.0F, 1.0F);
						class334.aClass427_3633.aFloatArray4807[12] = (((float) i_404_ + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
						class334.aClass427_3633.aFloatArray4807[13] = (((float) i_398_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_382_) - 1.0F;
						class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
						class334.method5856();
						i_404_ += i_396_;
					}
					if (i_404_ < i_395_) {
						int i_406_ = i_395_ - i_404_;
						class334.aClass427_3631.method6815(anInterface38_9012.method224((float) i_406_), anInterface38_9012.method264((float) i_403_), 1.0F, 1.0F);
						class334.aClass427_3633.method6815(((float) i_406_ * 2.0F / f), ((float) i_403_ * 2.0F / f_382_), 1.0F, 1.0F);
						class334.aClass427_3633.aFloatArray4807[12] = (((float) i_404_ + aClass180_Sub2_9005.method14911()) * 2.0F / f - 1.0F);
						class334.aClass427_3633.aFloatArray4807[13] = (((float) i_398_ + aClass180_Sub2_9005.method14911()) * 2.0F / f_382_) - 1.0F;
						class334.aClass427_3633.aFloatArray4807[14] = -1.0F;
						class334.method5856();
					}
				}
			}
		}
	}

	Class147_Sub2(Class180_Sub2 class180_sub2, int i, int i_407_, boolean bool, boolean bool_408_) {
		anInt9004 = 0;
		anInt9010 = 0;
		anInt9009 = 0;
		anInt9013 = 0;
		aClass180_Sub2_9005 = class180_sub2;
		anInt9007 = i;
		anInt9008 = i_407_;
		if (bool_408_) {
			Interface40 interface40 = class180_sub2.method15027((bool ? Class157.aClass157_1723 : Class157.aClass157_1728), Class184.aClass184_2104, i, i_407_);
			anInterface21_9006 = interface40.method269(0);
			anInterface38_9012 = interface40;
		} else {
			anInterface38_9012 = class180_sub2.method14964((bool ? Class157.aClass157_1723 : Class157.aClass157_1728), Class184.aClass184_2104, i, i_407_);
			anInterface21_9006 = null;
		}
		anInterface38_9012.method226(true, true);
		aBool9014 = anInterface38_9012.method1() != i;
		aBool9011 = anInterface38_9012.method87() != i_407_;
		aBool9016 = !aBool9014 && anInterface38_9012.method207();
		aBool9017 = !aBool9011 && anInterface38_9012.method207();
	}

	public int method2460() {
		return anInt9007;
	}

	public void method2433(int i, int i_409_, int i_410_, int i_411_, int[] is, int i_412_, int i_413_) {
		anInterface38_9012.method227(i, i_409_, i_410_, i_411_, is, i_412_, i_413_);
	}

	public int method2414() {
		return anInt9008;
	}

	public int method2461() {
		return anInt9008;
	}
}
