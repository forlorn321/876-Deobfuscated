/* Class493_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class493_Sub3 extends Class493 implements Interface44 {
	int anInt10254;
	float aFloat10255;
	int anInt10256;
	float aFloat10257;

	public float method255(float f) {
		return f / (float) anInt10254;
	}

	Class493_Sub3(Class167_Sub3_Sub1 class167_sub3_sub1, Class155 class155, int i, int i_0_, boolean bool, byte[] is, int i_1_, int i_2_) {
		super(class167_sub3_sub1, 3553, class155, Class171.aClass171_1905, i * i_0_, bool);
		if (!aClass167_Sub3_Sub1_5525.aBool11440) {
			anInt10256 = Class528.method6434(i, -114497503);
			anInt10254 = Class528.method6434(i_0_, -1712920601);
			aFloat10257 = (float) i / (float) anInt10256;
			aFloat10255 = (float) i_0_ / (float) anInt10254;
			if (i != anInt10256 || i_0_ != anInt10254) {
				is = aClass167_Sub3_Sub1_5525.method2216(i, i_0_, anInt10256, anInt10254, is, i_1_, i_2_, (class155.anInt1732 * -2037186451), 1466618366);
				i_1_ = 0;
				i_2_ = anInt10256;
			}
		} else {
			anInt10256 = i;
			anInt10254 = i_0_;
			aFloat10257 = 1.0F;
			aFloat10255 = 1.0F;
		}
		aClass167_Sub3_Sub1_5525.method8781(this);
		OpenGL.glPixelStorei(3317, 1);
		if (!bool || i_2_ != 0 || i_1_ != 0) {
			OpenGL.glPixelStorei(3314, i_2_);
			if (aClass155_5533 == Class155.aClass155_1731)
				OpenGL.glCompressedTexImage2Dub(anInt5531, 0, 33777, i, i_0_, 0, i * i_0_ / 2, is, i_1_);
			else if (aClass155_5533 == Class155.aClass155_1730)
				OpenGL.glCompressedTexImage2Dub(anInt5531, 0, 33779, i, i_0_, 0, i * i_0_, is, i_1_);
			else
				OpenGL.glTexImage2Dub(anInt5531, 0, Class167_Sub3_Sub1.method10567(aClass155_5533, aClass171_5537), i, i_0_, 0, Class167_Sub3_Sub1.method10566(aClass155_5533), 5121, is, i_1_);
			OpenGL.glPixelStorei(3314, 0);
		} else
			method5980(anInt5531, i, i_0_, is);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method226(int i, int i_3_, int i_4_, int i_5_, int[] is, int[] is_6_, int i_7_) {
		int[] is_8_ = is_6_ == null ? new int[anInt10256 * anInt10254] : is_6_;
		aClass167_Sub3_Sub1_5525.method8781(this);
		OpenGL.glGetTexImagei(anInt5531, 0, 32993, 5121, is_8_, 0);
		for (int i_9_ = 0; i_9_ < i_5_; i_9_++)
			System.arraycopy(is_8_, i_9_ * anInt10256, is, i_7_ + i_9_ * i_4_, i_4_);
	}

	Class493_Sub3(Class167_Sub3_Sub1 class167_sub3_sub1, Class155 class155, int i, int i_10_, boolean bool, float[] fs, int i_11_, int i_12_) {
		super(class167_sub3_sub1, 3553, class155, Class171.aClass171_1903, i * i_10_, bool);
		if (!aClass167_Sub3_Sub1_5525.aBool11440) {
			anInt10256 = Class528.method6434(i, -1925085422);
			anInt10254 = Class528.method6434(i_10_, -1477903408);
			aFloat10257 = (float) i / (float) anInt10256;
			aFloat10255 = (float) i_10_ / (float) anInt10254;
			if (i != anInt10256 || i_10_ != anInt10254) {
				fs = aClass167_Sub3_Sub1_5525.method2177(i, i_10_, anInt10256, anInt10254, fs, i_11_, i_12_, (class155.anInt1732 * -2037186451), -1633966849);
				i_11_ = 0;
				i_12_ = anInt10256;
			}
		} else {
			anInt10256 = i;
			anInt10254 = i_10_;
			aFloat10257 = 1.0F;
			aFloat10255 = 1.0F;
		}
		aClass167_Sub3_Sub1_5525.method8781(this);
		if (!bool || i_12_ != 0 || i_11_ != 0) {
			OpenGL.glPixelStorei(3314, i_12_);
			OpenGL.glTexImage2Df(anInt5531, 0, Class167_Sub3_Sub1.method10567(aClass155_5533, aClass171_5537), i, i_10_, 0, Class167_Sub3_Sub1.method10566(aClass155_5533), 5126, fs, i_11_ * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else
			method5976(anInt5531, i, i_10_, fs);
	}

	public void method224(int i, int i_13_, int i_14_, int i_15_, byte[] is, Class155 class155, int i_16_, int i_17_) {
		aClass167_Sub3_Sub1_5525.method8781(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_17_);
		OpenGL.glTexSubImage2Dub(anInt5531, 0, i, i_13_, i_14_, i_15_, Class167_Sub3_Sub1.method10566(class155), 5121, is, i_16_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public int method78() {
		return anInt10254;
	}

	public float method219(float f) {
		return f / (float) anInt10256;
	}

	public float method220(float f) {
		return f / (float) anInt10254;
	}

	public void method131() {
		super.method131();
	}

	public float method244() {
		return aFloat10255;
	}

	public boolean method221() {
		return true;
	}

	public void method222(boolean bool, boolean bool_18_) {
		aClass167_Sub3_Sub1_5525.method8781(this);
		OpenGL.glTexParameteri(anInt5531, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(anInt5531, 10243, bool_18_ ? 10497 : 33071);
	}

	public void method223(int i, int i_19_, int i_20_, int i_21_, int[] is, int i_22_, int i_23_) {
		aClass167_Sub3_Sub1_5525.method8781(this);
		OpenGL.glPixelStorei(3314, i_23_);
		OpenGL.glTexSubImage2Di(anInt5531, 0, i, i_19_, i_20_, i_21_, 32993, aClass167_Sub3_Sub1_5525.anInt11454, is, i_22_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public float method250() {
		return aFloat10255;
	}

	public int method234() {
		return anInt10254;
	}

	public int method1() {
		return anInt10256;
	}

	public void method231(int i, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_) {
		aClass167_Sub3_Sub1_5525.method8781(this);
		Class183 class183 = aClass167_Sub3_Sub1_5525.method2278((byte) 64);
		if (class183 != null) {
			int i_29_ = class183.method2726() - (i_28_ + i_26_);
			int i_30_ = Class167_Sub3_Sub1.method10567(aClass155_5533, aClass171_5537);
			OpenGL.glCopyTexImage2D(anInt5531, 0, i_30_, i_27_, i_29_, i_25_, i_26_, 0);
		}
	}

	public Interface22 method330(int i) {
		return new Class491(this, i);
	}

	public boolean method230() {
		return super.method230();
	}

	public void method275() {
		super.method275();
	}

	public void method274(Class342 class342) {
		super.method274(class342);
	}

	public void method240(int i, int i_31_, int i_32_, int i_33_, int[] is, int i_34_, int i_35_) {
		aClass167_Sub3_Sub1_5525.method8781(this);
		OpenGL.glPixelStorei(3314, i_35_);
		OpenGL.glTexSubImage2Di(anInt5531, 0, i, i_31_, i_32_, i_33_, 32993, aClass167_Sub3_Sub1_5525.anInt11454, is, i_34_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public float method227(float f) {
		return f / (float) anInt10256;
	}

	public void method129() {
		super.method131();
	}

	public int method262() {
		return anInt10256;
	}

	public void method251(int i, int i_36_, int i_37_, int i_38_, int[] is, int[] is_39_, int i_40_) {
		int[] is_41_ = is_39_ == null ? new int[anInt10256 * anInt10254] : is_39_;
		aClass167_Sub3_Sub1_5525.method8781(this);
		OpenGL.glGetTexImagei(anInt5531, 0, 32993, 5121, is_41_, 0);
		for (int i_42_ = 0; i_42_ < i_38_; i_42_++)
			System.arraycopy(is_41_, i_42_ * anInt10256, is, i_40_ + i_42_ * i_37_, i_37_);
	}

	public int method228() {
		return anInt10254;
	}

	public void method247(int i, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_) {
		aClass167_Sub3_Sub1_5525.method8781(this);
		Class183 class183 = aClass167_Sub3_Sub1_5525.method2278((byte) -21);
		if (class183 != null) {
			int i_48_ = class183.method2726() - (i_47_ + i_45_);
			int i_49_ = Class167_Sub3_Sub1.method10567(aClass155_5533, aClass171_5537);
			OpenGL.glCopyTexImage2D(anInt5531, 0, i_49_, i_46_, i_48_, i_44_, i_45_, 0);
		}
	}

	public float method235(float f) {
		return f / (float) anInt10256;
	}

	public float method261() {
		return aFloat10257;
	}

	public void method218(int i, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_) {
		aClass167_Sub3_Sub1_5525.method8781(this);
		Class183 class183 = aClass167_Sub3_Sub1_5525.method2278((byte) -7);
		if (class183 != null) {
			int i_55_ = class183.method2726() - (i_54_ + i_52_);
			int i_56_ = Class167_Sub3_Sub1.method10567(aClass155_5533, aClass171_5537);
			OpenGL.glCopyTexImage2D(anInt5531, 0, i_56_, i_53_, i_55_, i_51_, i_52_, 0);
		}
	}

	public boolean method238() {
		return true;
	}

	public void method239(boolean bool, boolean bool_57_) {
		aClass167_Sub3_Sub1_5525.method8781(this);
		OpenGL.glTexParameteri(anInt5531, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(anInt5531, 10243, bool_57_ ? 10497 : 33071);
	}

	public void method241(int i, int i_58_, int i_59_, int i_60_, byte[] is, Class155 class155, int i_61_, int i_62_) {
		aClass167_Sub3_Sub1_5525.method8781(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_62_);
		OpenGL.glTexSubImage2Dub(anInt5531, 0, i, i_58_, i_59_, i_60_, Class167_Sub3_Sub1.method10566(class155), 5121, is, i_61_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method248(int i, int i_63_, int i_64_, int i_65_, int[] is, int i_66_) {
		method226(i, i_63_, i_64_, i_65_, is, null, i_66_);
	}

	public void method242(int i, int i_67_, int i_68_, int i_69_, int[] is, int[] is_70_, int i_71_) {
		int[] is_72_ = is_70_ == null ? new int[anInt10256 * anInt10254] : is_70_;
		aClass167_Sub3_Sub1_5525.method8781(this);
		OpenGL.glGetTexImagei(anInt5531, 0, 32993, 5121, is_72_, 0);
		for (int i_73_ = 0; i_73_ < i_69_; i_73_++)
			System.arraycopy(is_72_, i_73_ * anInt10256, is, i_71_ + i_73_ * i_68_, i_68_);
	}

	public void method253(int i, int i_74_, int i_75_, int i_76_, int[] is, int[] is_77_, int i_78_) {
		int[] is_79_ = is_77_ == null ? new int[anInt10256 * anInt10254] : is_77_;
		aClass167_Sub3_Sub1_5525.method8781(this);
		OpenGL.glGetTexImagei(anInt5531, 0, 32993, 5121, is_79_, 0);
		for (int i_80_ = 0; i_80_ < i_76_; i_80_++)
			System.arraycopy(is_79_, i_80_ * anInt10256, is, i_78_ + i_80_ * i_75_, i_75_);
	}

	Class493_Sub3(Class167_Sub3_Sub1 class167_sub3_sub1, int i, int i_81_, boolean bool, int[] is, int i_82_, int i_83_) {
		super(class167_sub3_sub1, 3553, Class155.aClass155_1722, Class171.aClass171_1905, i * i_81_, bool);
		if (!aClass167_Sub3_Sub1_5525.aBool11440) {
			anInt10256 = Class528.method6434(i, -1324160573);
			anInt10254 = Class528.method6434(i_81_, -1062520560);
			aFloat10257 = (float) i / (float) anInt10256;
			aFloat10255 = (float) i_81_ / (float) anInt10254;
			if (i != anInt10256 || i_81_ != anInt10254) {
				is = aClass167_Sub3_Sub1_5525.method2182(i, i_81_, anInt10256, anInt10254, is, i_82_, i_83_, (byte) 100);
				i_82_ = 0;
				i_83_ = anInt10256;
			}
		} else {
			anInt10256 = i;
			anInt10254 = i_81_;
			aFloat10257 = 1.0F;
			aFloat10255 = 1.0F;
		}
		aClass167_Sub3_Sub1_5525.method8781(this);
		if (!bool || i_83_ != 0 || i_82_ != 0) {
			OpenGL.glPixelStorei(3314, i_83_);
			OpenGL.glTexImage2Di(anInt5531, 0, 6408, anInt10256, anInt10254, 0, 32993, aClass167_Sub3_Sub1_5525.anInt11454, is, i_82_ * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else
			method5975(anInt5531, i, i_81_, is);
	}

	public void method245(int i, int i_84_, int i_85_, int i_86_, int[] is, int[] is_87_, int i_88_) {
		int[] is_89_ = is_87_ == null ? new int[anInt10256 * anInt10254] : is_87_;
		aClass167_Sub3_Sub1_5525.method8781(this);
		OpenGL.glGetTexImagei(anInt5531, 0, 32993, 5121, is_89_, 0);
		for (int i_90_ = 0; i_90_ < i_86_; i_90_++)
			System.arraycopy(is_89_, i_90_ * anInt10256, is, i_88_ + i_90_ * i_85_, i_85_);
	}

	public void method229(int i, int i_91_, int i_92_, int i_93_, int[] is, int[] is_94_, int i_95_) {
		int[] is_96_ = is_94_ == null ? new int[anInt10256 * anInt10254] : is_94_;
		aClass167_Sub3_Sub1_5525.method8781(this);
		OpenGL.glGetTexImagei(anInt5531, 0, 32993, 5121, is_96_, 0);
		for (int i_97_ = 0; i_97_ < i_93_; i_97_++)
			System.arraycopy(is_96_, i_97_ * anInt10256, is, i_95_ + i_97_ * i_92_, i_92_);
	}

	public Interface22 method331(int i) {
		return new Class491(this, i);
	}

	public int method232() {
		return anInt10254;
	}

	public float method249() {
		return aFloat10255;
	}

	Class493_Sub3(Class167_Sub3_Sub1 class167_sub3_sub1, Class155 class155, Class171 class171, int i, int i_98_) {
		super(class167_sub3_sub1, 3553, class155, class171, i * i_98_, false);
		if (!aClass167_Sub3_Sub1_5525.aBool11440) {
			anInt10256 = Class528.method6434(i, -1725517939);
			anInt10254 = Class528.method6434(i_98_, -1409522449);
			aFloat10257 = (float) i / (float) anInt10256;
			aFloat10255 = (float) i_98_ / (float) anInt10254;
		} else {
			anInt10256 = i;
			anInt10254 = i_98_;
			aFloat10257 = 1.0F;
			aFloat10255 = 1.0F;
		}
		aClass167_Sub3_Sub1_5525.method8781(this);
		OpenGL.glTexImage2Dub(anInt5531, 0, Class167_Sub3_Sub1.method10567(aClass155_5533, aClass171_5537), i, i_98_, 0, Class167_Sub3_Sub1.method10566(aClass155_5533), Class167_Sub3_Sub1.method10565(aClass171_5537), null, 0);
	}

	public float method225() {
		return aFloat10255;
	}

	public boolean method252() {
		return super.method230();
	}

	public boolean method236() {
		return super.method230();
	}

	public void method130() {
		super.method131();
	}

	public boolean method254() {
		return super.method230();
	}

	public void method257(int i, int i_99_, int i_100_, int i_101_, int[] is, int i_102_, int i_103_) {
		aClass167_Sub3_Sub1_5525.method8781(this);
		OpenGL.glPixelStorei(3314, i_103_);
		OpenGL.glTexSubImage2Di(anInt5531, 0, i, i_99_, i_100_, i_101_, 32993, aClass167_Sub3_Sub1_5525.anInt11454, is, i_102_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method278(Class342 class342) {
		super.method274(class342);
	}

	public void method279(Class342 class342) {
		super.method274(class342);
	}

	public void method277() {
		super.method275();
	}

	public void method259(int i, int i_104_, int i_105_, int i_106_, int[] is, int i_107_, int i_108_) {
		aClass167_Sub3_Sub1_5525.method8781(this);
		OpenGL.glPixelStorei(3314, i_108_);
		OpenGL.glTexSubImage2Di(anInt5531, 0, i, i_104_, i_105_, i_106_, 32993, aClass167_Sub3_Sub1_5525.anInt11454, is, i_107_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public float method256(float f) {
		return f / (float) anInt10254;
	}

	public void method258(int i, int i_109_, int i_110_, int i_111_, int[] is, int i_112_, int i_113_) {
		aClass167_Sub3_Sub1_5525.method8781(this);
		OpenGL.glPixelStorei(3314, i_113_);
		OpenGL.glTexSubImage2Di(anInt5531, 0, i, i_109_, i_110_, i_111_, 32993, aClass167_Sub3_Sub1_5525.anInt11454, is, i_112_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public boolean method237() {
		return true;
	}

	public void method243(int i, int i_114_, int i_115_, int i_116_, int[] is, int i_117_) {
		method226(i, i_114_, i_115_, i_116_, is, null, i_117_);
	}

	public void method276() {
		super.method275();
	}

	public float method260() {
		return aFloat10257;
	}

	public float method246() {
		return aFloat10257;
	}

	public float method233() {
		return aFloat10257;
	}
}
