/* Class480_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class480_Sub1 extends Class480 implements Interface40 {
	int anInt10116;
	int anInt10117;
	float aFloat10118;
	float aFloat10119;

	public boolean method240() {
		return super.method260();
	}

	Class480_Sub1(Class180_Sub2_Sub1 class180_sub2_sub1, int i, int i_0_, boolean bool, int[] is, int i_1_, int i_2_) {
		super(class180_sub2_sub1, 3553, Class157.aClass157_1723, Class184.aClass184_2104, i * i_0_, bool);
		if (!aClass180_Sub2_Sub1_5416.aBool11490) {
			anInt10116 = Class186.method3652(i, -1507077959);
			anInt10117 = Class186.method3652(i_0_, -130224435);
			aFloat10118 = (float) i / (float) anInt10116;
			aFloat10119 = (float) i_0_ / (float) anInt10117;
			if (i != anInt10116 || i_0_ != anInt10117) {
				is = aClass180_Sub2_Sub1_5416.method3212(i, i_0_, anInt10116, anInt10117, is, i_1_, i_2_, (byte) 104);
				i_1_ = 0;
				i_2_ = anInt10116;
			}
		} else {
			anInt10116 = i;
			anInt10117 = i_0_;
			aFloat10118 = 1.0F;
			aFloat10119 = 1.0F;
		}
		aClass180_Sub2_Sub1_5416.method14971(this);
		if (!bool || i_2_ != 0 || i_1_ != 0) {
			OpenGL.glPixelStorei(3314, i_2_);
			OpenGL.glTexImage2Di(anInt5412, 0, 6408, anInt10116, anInt10117, 0, 32993, aClass180_Sub2_Sub1_5416.anInt11495, is, i_1_ * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else
			method7818(anInt5412, i, i_0_, is);
	}

	Class480_Sub1(Class180_Sub2_Sub1 class180_sub2_sub1, Class157 class157, int i, int i_3_, boolean bool, byte[] is, int i_4_, int i_5_) {
		super(class180_sub2_sub1, 3553, class157, Class184.aClass184_2104, i * i_3_, bool);
		if (!aClass180_Sub2_Sub1_5416.aBool11490) {
			anInt10116 = Class186.method3652(i, 517067528);
			anInt10117 = Class186.method3652(i_3_, 155256666);
			aFloat10118 = (float) i / (float) anInt10116;
			aFloat10119 = (float) i_3_ / (float) anInt10117;
			if (i != anInt10116 || i_3_ != anInt10117) {
				is = aClass180_Sub2_Sub1_5416.method3288(i, i_3_, anInt10116, anInt10117, is, i_4_, i_5_, (class157.anInt1722 * -1216378097), -1992815356);
				i_4_ = 0;
				i_5_ = anInt10116;
			}
		} else {
			anInt10116 = i;
			anInt10117 = i_3_;
			aFloat10118 = 1.0F;
			aFloat10119 = 1.0F;
		}
		aClass180_Sub2_Sub1_5416.method14971(this);
		OpenGL.glPixelStorei(3317, 1);
		if (!bool || i_5_ != 0 || i_4_ != 0) {
			OpenGL.glPixelStorei(3314, i_5_);
			if (aClass157_5413 == Class157.aClass157_1733)
				OpenGL.glCompressedTexImage2Dub(anInt5412, 0, 33777, i, i_3_, 0, i * i_3_ / 2, is, i_4_);
			else if (aClass157_5413 == Class157.aClass157_1731)
				OpenGL.glCompressedTexImage2Dub(anInt5412, 0, 33779, i, i_3_, 0, i * i_3_, is, i_4_);
			else
				OpenGL.glTexImage2Dub(anInt5412, 0, Class180_Sub2_Sub1.method18015(aClass157_5413, aClass184_5409), i, i_3_, 0, Class180_Sub2_Sub1.method18008(aClass157_5413), 5121, is, i_4_);
			OpenGL.glPixelStorei(3314, 0);
		} else
			method7803(anInt5412, i, i_3_, is);
		OpenGL.glPixelStorei(3317, 4);
	}

	Class480_Sub1(Class180_Sub2_Sub1 class180_sub2_sub1, Class157 class157, int i, int i_6_, boolean bool, float[] fs, int i_7_, int i_8_) {
		super(class180_sub2_sub1, 3553, class157, Class184.aClass184_2109, i * i_6_, bool);
		if (!aClass180_Sub2_Sub1_5416.aBool11490) {
			anInt10116 = Class186.method3652(i, 248324772);
			anInt10117 = Class186.method3652(i_6_, -975589080);
			aFloat10118 = (float) i / (float) anInt10116;
			aFloat10119 = (float) i_6_ / (float) anInt10117;
			if (i != anInt10116 || i_6_ != anInt10117) {
				fs = aClass180_Sub2_Sub1_5416.method3213(i, i_6_, anInt10116, anInt10117, fs, i_7_, i_8_, (class157.anInt1722 * -1216378097), 584269860);
				i_7_ = 0;
				i_8_ = anInt10116;
			}
		} else {
			anInt10116 = i;
			anInt10117 = i_6_;
			aFloat10118 = 1.0F;
			aFloat10119 = 1.0F;
		}
		aClass180_Sub2_Sub1_5416.method14971(this);
		if (!bool || i_8_ != 0 || i_7_ != 0) {
			OpenGL.glPixelStorei(3314, i_8_);
			OpenGL.glTexImage2Df(anInt5412, 0, Class180_Sub2_Sub1.method18015(aClass157_5413, aClass184_5409), i, i_6_, 0, Class180_Sub2_Sub1.method18008(aClass157_5413), 5126, fs, i_7_ * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else
			method7804(anInt5412, i, i_6_, fs);
	}

	public void method247(int i, int i_9_, int i_10_, int i_11_, int[] is, int i_12_, int i_13_) {
		aClass180_Sub2_Sub1_5416.method14971(this);
		OpenGL.glPixelStorei(3314, i_13_);
		OpenGL.glTexSubImage2Di(anInt5412, 0, i, i_9_, i_10_, i_11_, 32993, aClass180_Sub2_Sub1_5416.anInt11495, is, i_12_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method265(boolean bool, boolean bool_14_) {
		aClass180_Sub2_Sub1_5416.method14971(this);
		OpenGL.glTexParameteri(anInt5412, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(anInt5412, 10243, bool_14_ ? 10497 : 33071);
	}

	public float method224(float f) {
		return f / (float) anInt10116;
	}

	public float method264(float f) {
		return f / (float) anInt10117;
	}

	public float method233() {
		return aFloat10118;
	}

	public float method222() {
		return aFloat10119;
	}

	public boolean method207() {
		return true;
	}

	public void method226(boolean bool, boolean bool_15_) {
		aClass180_Sub2_Sub1_5416.method14971(this);
		OpenGL.glTexParameteri(anInt5412, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(anInt5412, 10243, bool_15_ ? 10497 : 33071);
	}

	public void method227(int i, int i_16_, int i_17_, int i_18_, int[] is, int i_19_, int i_20_) {
		aClass180_Sub2_Sub1_5416.method14971(this);
		OpenGL.glPixelStorei(3314, i_20_);
		OpenGL.glTexSubImage2Di(anInt5412, 0, i, i_16_, i_17_, i_18_, 32993, aClass180_Sub2_Sub1_5416.anInt11495, is, i_19_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method228(int i, int i_21_, int i_22_, int i_23_, byte[] is, Class157 class157, int i_24_, int i_25_) {
		aClass180_Sub2_Sub1_5416.method14971(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_25_);
		OpenGL.glTexSubImage2Dub(anInt5412, 0, i, i_21_, i_22_, i_23_, Class180_Sub2_Sub1.method18008(class157), 5121, is, i_24_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public float method259() {
		return aFloat10119;
	}

	public void method230(int i, int i_26_, int i_27_, int i_28_, int[] is, int[] is_29_, int i_30_) {
		int[] is_31_ = is_29_ == null ? new int[anInt10116 * anInt10117] : is_29_;
		aClass180_Sub2_Sub1_5416.method14971(this);
		OpenGL.glGetTexImagei(anInt5412, 0, 32993, 5121, is_31_, 0);
		for (int i_32_ = 0; i_32_ < i_28_; i_32_++)
			System.arraycopy(is_31_, i_32_ * anInt10116, is, i_30_ + i_32_ * i_27_, i_27_);
	}

	public int method238() {
		return anInt10117;
	}

	public int method237() {
		return anInt10117;
	}

	public boolean method260() {
		return super.method260();
	}

	public void method277() {
		super.method277();
	}

	public void method273(Class343 class343) {
		super.method273(class343);
	}

	public void method129() {
		super.method129();
	}

	public void method252(int i, int i_33_, int i_34_, int i_35_, byte[] is, Class157 class157, int i_36_, int i_37_) {
		aClass180_Sub2_Sub1_5416.method14971(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_37_);
		OpenGL.glTexSubImage2Dub(anInt5412, 0, i, i_33_, i_34_, i_35_, Class180_Sub2_Sub1.method18008(class157), 5121, is, i_36_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public int method235() {
		return anInt10116;
	}

	public int method72() {
		return anInt10116;
	}

	public int method62() {
		return anInt10117;
	}

	public float method243(float f) {
		return f / (float) anInt10117;
	}

	public void method229(int i, int i_38_, int i_39_, int i_40_, int[] is, int i_41_) {
		method230(i, i_38_, i_39_, i_40_, is, null, i_41_);
	}

	public int method239() {
		return anInt10117;
	}

	public int method263() {
		return anInt10117;
	}

	public int method187() {
		return anInt10117;
	}

	public void method266(int i, int i_42_, int i_43_, int i_44_, int[] is, int i_45_) {
		method230(i, i_42_, i_43_, i_44_, is, null, i_45_);
	}

	public float method242(float f) {
		return f / (float) anInt10117;
	}

	public boolean method245() {
		return true;
	}

	public boolean method244() {
		return true;
	}

	public void method234(int i, int i_46_, int i_47_, int i_48_, int[] is, int i_49_) {
		method230(i, i_46_, i_47_, i_48_, is, null, i_49_);
	}

	public boolean method246() {
		return true;
	}

	public Interface21 method269(int i) {
		return new Class484(this, i);
	}

	public void method253(int i, int i_50_, int i_51_, int i_52_, int[] is, int i_53_, int i_54_) {
		aClass180_Sub2_Sub1_5416.method14971(this);
		OpenGL.glPixelStorei(3314, i_54_);
		OpenGL.glTexSubImage2Di(anInt5412, 0, i, i_50_, i_51_, i_52_, 32993, aClass180_Sub2_Sub1_5416.anInt11495, is, i_53_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public int method1() {
		return anInt10116;
	}

	public void method249(int i, int i_55_, int i_56_, int i_57_, byte[] is, Class157 class157, int i_58_, int i_59_) {
		aClass180_Sub2_Sub1_5416.method14971(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_59_);
		OpenGL.glTexSubImage2Dub(anInt5412, 0, i, i_55_, i_56_, i_57_, Class180_Sub2_Sub1.method18008(class157), 5121, is, i_58_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method223(int i, int i_60_, int i_61_, int i_62_, byte[] is, Class157 class157, int i_63_, int i_64_) {
		aClass180_Sub2_Sub1_5416.method14971(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_64_);
		OpenGL.glTexSubImage2Dub(anInt5412, 0, i, i_60_, i_61_, i_62_, Class180_Sub2_Sub1.method18008(class157), 5121, is, i_63_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method231(int i, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_) {
		aClass180_Sub2_Sub1_5416.method14971(this);
		Class171 class171 = aClass180_Sub2_Sub1_5416.method3285(922642066);
		if (class171 != null) {
			int i_70_ = class171.method2729() - (i_69_ + i_67_);
			int i_71_ = Class180_Sub2_Sub1.method18015(aClass157_5413, aClass184_5409);
			OpenGL.glCopyTexImage2D(anInt5412, 0, i_71_, i_68_, i_70_, i_66_, i_67_, 0);
		}
	}

	public void method225(int i, int i_72_, int i_73_, int i_74_, byte[] is, Class157 class157, int i_75_, int i_76_) {
		aClass180_Sub2_Sub1_5416.method14971(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_76_);
		OpenGL.glTexSubImage2Dub(anInt5412, 0, i, i_72_, i_73_, i_74_, Class180_Sub2_Sub1.method18008(class157), 5121, is, i_75_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method254(int i, int i_77_, int i_78_, int i_79_, int[] is, int[] is_80_, int i_81_) {
		int[] is_82_ = is_80_ == null ? new int[anInt10116 * anInt10117] : is_80_;
		aClass180_Sub2_Sub1_5416.method14971(this);
		OpenGL.glGetTexImagei(anInt5412, 0, 32993, 5121, is_82_, 0);
		for (int i_83_ = 0; i_83_ < i_79_; i_83_++)
			System.arraycopy(is_82_, i_83_ * anInt10116, is, i_81_ + i_83_ * i_78_, i_78_);
	}

	public void method232(int i, int i_84_, int i_85_, int i_86_, int[] is, int[] is_87_, int i_88_) {
		int[] is_89_ = is_87_ == null ? new int[anInt10116 * anInt10117] : is_87_;
		aClass180_Sub2_Sub1_5416.method14971(this);
		OpenGL.glGetTexImagei(anInt5412, 0, 32993, 5121, is_89_, 0);
		for (int i_90_ = 0; i_90_ < i_86_; i_90_++)
			System.arraycopy(is_89_, i_90_ * anInt10116, is, i_88_ + i_90_ * i_85_, i_85_);
	}

	public void method256(int i, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_) {
		aClass180_Sub2_Sub1_5416.method14971(this);
		Class171 class171 = aClass180_Sub2_Sub1_5416.method3285(1041462436);
		if (class171 != null) {
			int i_96_ = class171.method2729() - (i_95_ + i_93_);
			int i_97_ = Class180_Sub2_Sub1.method18015(aClass157_5413, aClass184_5409);
			OpenGL.glCopyTexImage2D(anInt5412, 0, i_97_, i_94_, i_96_, i_92_, i_93_, 0);
		}
	}

	public float method257() {
		return aFloat10118;
	}

	public int method87() {
		return anInt10117;
	}

	Class480_Sub1(Class180_Sub2_Sub1 class180_sub2_sub1, Class157 class157, Class184 class184, int i, int i_98_) {
		super(class180_sub2_sub1, 3553, class157, class184, i * i_98_, false);
		if (!aClass180_Sub2_Sub1_5416.aBool11490) {
			anInt10116 = Class186.method3652(i, 1054689944);
			anInt10117 = Class186.method3652(i_98_, 1914271782);
			aFloat10118 = (float) i / (float) anInt10116;
			aFloat10119 = (float) i_98_ / (float) anInt10117;
		} else {
			anInt10116 = i;
			anInt10117 = i_98_;
			aFloat10118 = 1.0F;
			aFloat10119 = 1.0F;
		}
		aClass180_Sub2_Sub1_5416.method14971(this);
		OpenGL.glTexImage2Dub(anInt5412, 0, Class180_Sub2_Sub1.method18015(aClass157_5413, aClass184_5409), i, i_98_, 0, Class180_Sub2_Sub1.method18008(aClass157_5413), Class180_Sub2_Sub1.method18007(aClass184_5409), null, 0);
	}

	public float method241(float f) {
		return f / (float) anInt10116;
	}

	public void method130() {
		super.method129();
	}

	public Interface21 method270(int i) {
		return new Class484(this, i);
	}

	public boolean method236() {
		return super.method260();
	}

	public void method275() {
		super.method277();
	}

	public void method276() {
		super.method277();
	}

	public void method274(Class343 class343) {
		super.method273(class343);
	}

	public float method255() {
		return aFloat10119;
	}

	public Interface21 method271(int i) {
		return new Class484(this, i);
	}

	public Interface21 method272(int i) {
		return new Class484(this, i);
	}

	public void method251(int i, int i_99_, int i_100_, int i_101_, int[] is, int i_102_) {
		method230(i, i_99_, i_100_, i_101_, is, null, i_102_);
	}

	public void method250(int i, int i_103_, int i_104_, int i_105_, int[] is, int i_106_) {
		method230(i, i_103_, i_104_, i_105_, is, null, i_106_);
	}

	public void method248(int i, int i_107_, int i_108_, int i_109_, int[] is, int i_110_, int i_111_) {
		aClass180_Sub2_Sub1_5416.method14971(this);
		OpenGL.glPixelStorei(3314, i_111_);
		OpenGL.glTexSubImage2Di(anInt5412, 0, i, i_107_, i_108_, i_109_, 32993, aClass180_Sub2_Sub1_5416.anInt11495, is, i_110_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method258(int i, int i_112_, int i_113_, int i_114_, int[] is, int i_115_) {
		method230(i, i_112_, i_113_, i_114_, is, null, i_115_);
	}

	public float method262() {
		return aFloat10118;
	}

	public void method267(boolean bool, boolean bool_116_) {
		aClass180_Sub2_Sub1_5416.method14971(this);
		OpenGL.glTexParameteri(anInt5412, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(anInt5412, 10243, bool_116_ ? 10497 : 33071);
	}

	public void method268(boolean bool, boolean bool_117_) {
		aClass180_Sub2_Sub1_5416.method14971(this);
		OpenGL.glTexParameteri(anInt5412, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(anInt5412, 10243, bool_117_ ? 10497 : 33071);
	}

	public float method261() {
		return aFloat10119;
	}
}
