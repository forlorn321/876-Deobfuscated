/* Class118_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class118_Sub3 extends Class118 {
	int anInt8961;
	int anInt8962;

	void method14449(boolean bool, boolean bool_0_) {
		if (anInt1434 == 3553) {
			aClass180_Sub3_1432.method15401(this);
			OpenGL.glTexParameteri(anInt1434, 10242, bool ? 10497 : 33071);
			OpenGL.glTexParameteri(anInt1434, 10243, bool_0_ ? 10497 : 33071);
		}
	}

	Class118_Sub3(Class180_Sub3 class180_sub3, int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		super(class180_sub3, i, Class157.aClass157_1728, Class184.aClass184_2104, i_3_ * i_4_, false);
		anInt8961 = i_3_;
		anInt8962 = i_4_;
		aClass180_Sub3_1432.method15401(this);
		Class171 class171 = aClass180_Sub3_1432.method3285(431961253);
		if (class171 != null) {
			int i_5_ = class171.method2729() - (i_2_ + i_4_);
			int i_6_ = Class180_Sub3.method15424(aClass157_1426, aClass184_1431);
			OpenGL.glCopyTexImage2D(anInt1434, 0, i_6_, i_1_, i_5_, i_3_, i_4_, 0);
		}
		method2035(true);
	}

	Class118_Sub3(Class180_Sub3 class180_sub3, int i, int i_7_, int i_8_, boolean bool, int[] is, int i_9_, int i_10_, boolean bool_11_) {
		super(class180_sub3, i, Class157.aClass157_1723, Class184.aClass184_2104, i_7_ * i_8_, bool);
		anInt8961 = i_7_;
		anInt8962 = i_8_;
		if (bool_11_) {
			int[] is_12_ = new int[is.length];
			for (int i_13_ = 0; i_13_ < i_8_; i_13_++) {
				int i_14_ = i_13_ * i_7_;
				int i_15_ = (i_8_ - i_13_ - 1) * i_7_;
				for (int i_16_ = 0; i_16_ < i_7_; i_16_++)
					is_12_[i_14_++] = is[i_15_++];
			}
			is = is_12_;
		}
		aClass180_Sub3_1432.method15401(this);
		if (anInt1434 == 34037 || !bool || i_9_ != 0 || i_10_ != 0) {
			OpenGL.glPixelStorei(3314, i_9_);
			OpenGL.glTexImage2Di(anInt1434, 0, Class180_Sub3.method15424(aClass157_1426, aClass184_1431), anInt8961, anInt8962, 0, 32993, aClass180_Sub3_1432.anInt9835, is, i_10_ * 4);
			OpenGL.glPixelStorei(3314, 0);
			method2038(false);
		} else {
			method2043(anInt1434, Class180_Sub3.method15424(aClass157_1426, aClass184_1431), anInt8961, anInt8962, 32993, aClass180_Sub3_1432.anInt9835, is);
			method2038(true);
		}
		method2035(true);
	}

	Class118_Sub3(Class180_Sub3 class180_sub3, int i, Class157 class157, Class184 class184, int i_17_, int i_18_, boolean bool, byte[] is, Class157 class157_19_, boolean bool_20_) {
		super(class180_sub3, i, class157, class184, i_17_ * i_18_, bool);
		anInt8961 = i_17_;
		anInt8962 = i_18_;
		if (bool_20_) {
			byte[] is_21_ = new byte[is.length];
			for (int i_22_ = 0; i_22_ < i_18_; i_22_++) {
				int i_23_ = i_22_ * i_17_;
				int i_24_ = (i_18_ - i_22_ - 1) * i_17_;
				for (int i_25_ = 0; i_25_ < i_17_; i_25_++)
					is_21_[i_23_++] = is[i_24_++];
			}
			is = is_21_;
		}
		aClass180_Sub3_1432.method15401(this);
		OpenGL.glPixelStorei(3317, 1);
		if (bool && anInt1434 != 34037) {
			method2044(i, Class180_Sub3.method15424(aClass157_1426, aClass184_1431), i_17_, i_18_, class157_19_, is);
			method2038(true);
		} else {
			OpenGL.glTexImage2Dub(anInt1434, 0, Class180_Sub3.method15424(aClass157_1426, aClass184_1431), anInt8961, anInt8962, 0, Class180_Sub3.method15423(class157_19_), 5121, is, 0);
			method2038(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		method2035(true);
	}

	Class118_Sub3(Class180_Sub3 class180_sub3, int i, Class157 class157, Class184 class184, int i_26_, int i_27_, boolean bool, float[] fs, Class157 class157_28_) {
		super(class180_sub3, i, class157, class184, i_26_ * i_27_, bool);
		anInt8961 = i_26_;
		anInt8962 = i_27_;
		aClass180_Sub3_1432.method15401(this);
		if (bool && anInt1434 != 34037) {
			method2034(i, Class180_Sub3.method15424(aClass157_1426, aClass184_1431), i_26_, i_27_, class157_28_, fs);
			method2038(true);
		} else {
			OpenGL.glTexImage2Df(anInt1434, 0, Class180_Sub3.method15424(aClass157_1426, aClass184_1431), anInt8961, anInt8962, 0, Class180_Sub3.method15423(class157_28_), 5126, fs, 0);
			method2038(false);
		}
		method2035(true);
	}

	void method14450(boolean bool, boolean bool_29_) {
		if (anInt1434 == 3553) {
			aClass180_Sub3_1432.method15401(this);
			OpenGL.glTexParameteri(anInt1434, 10242, bool ? 10497 : 33071);
			OpenGL.glTexParameteri(anInt1434, 10243, bool_29_ ? 10497 : 33071);
		}
	}

	void method14451(boolean bool, boolean bool_30_) {
		if (anInt1434 == 3553) {
			aClass180_Sub3_1432.method15401(this);
			OpenGL.glTexParameteri(anInt1434, 10242, bool ? 10497 : 33071);
			OpenGL.glTexParameteri(anInt1434, 10243, bool_30_ ? 10497 : 33071);
		}
	}

	void method14452(int i, int i_31_, int i_32_, int i_33_, int[] is, int i_34_, int i_35_, boolean bool) {
		if (i_35_ == 0)
			i_35_ = i_32_;
		if (bool) {
			int[] is_36_ = new int[i_32_ * i_33_];
			for (int i_37_ = 0; i_37_ < i_33_; i_37_++) {
				int i_38_ = i_37_ * i_32_;
				int i_39_ = (i_33_ - i_37_ - 1) * i_35_ + i_34_;
				for (int i_40_ = 0; i_40_ < i_32_; i_40_++)
					is_36_[i_38_++] = is[i_39_++];
			}
			is = is_36_;
		}
		aClass180_Sub3_1432.method15401(this);
		if (i_32_ != i_35_)
			OpenGL.glPixelStorei(3314, i_35_);
		OpenGL.glTexSubImage2Di(anInt1434, 0, i, anInt8962 - i_31_ - i_33_, i_32_, i_33_, 32993, aClass180_Sub3_1432.anInt9835, is, i_34_);
		if (i_32_ != i_35_)
			OpenGL.glPixelStorei(3314, 0);
	}

	Class118_Sub3(Class180_Sub3 class180_sub3, int i, Class157 class157, Class184 class184, int i_41_, int i_42_) {
		super(class180_sub3, i, class157, class184, i_41_ * i_42_, false);
		anInt8961 = i_41_;
		anInt8962 = i_42_;
		aClass180_Sub3_1432.method15401(this);
		OpenGL.glTexImage2Dub(anInt1434, 0, Class180_Sub3.method15424(aClass157_1426, aClass184_1431), i_41_, i_42_, 0, Class180_Sub3.method15423(aClass157_1426), 5121, null, 0);
		method2035(true);
	}

	void method14453(int i, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_) {
		Class171 class171 = aClass180_Sub3_1432.method3285(800791594);
		if (class171 != null) {
			int i_48_ = class171.method2729() - (i_47_ + i_45_);
			aClass180_Sub3_1432.method15401(this);
			OpenGL.glCopyTexSubImage2D(anInt1434, 0, i, anInt8962 - (i_43_ + i_45_), i_46_, i_48_, i_44_, i_45_);
			OpenGL.glFlush();
		}
	}

	void method14454(int i, int i_49_, int i_50_, int i_51_, int[] is, int[] is_52_, int i_53_) {
		int[] is_54_ = is_52_ == null ? new int[anInt8961 * anInt8962] : is_52_;
		aClass180_Sub3_1432.method15401(this);
		OpenGL.glGetTexImagei(anInt1434, 0, 32993, 5121, is_54_, 0);
		for (int i_55_ = 0; i_55_ < i_51_; i_55_++)
			System.arraycopy(is_54_, (i_49_ + (i_51_ - 1) - i_55_) * anInt8961, is, i_53_ + i_55_ * i_50_, i_50_);
	}

	void method14455(int i, int i_56_, int i_57_, int i_58_, byte[] is, Class157 class157, int i_59_, int i_60_, boolean bool) {
		if (i_60_ == 0)
			i_60_ = i_57_;
		if (bool) {
			int i_61_ = class157.anInt1722 * -1216378097;
			int i_62_ = i_61_ * i_57_;
			int i_63_ = i_61_ * i_60_;
			byte[] is_64_ = new byte[i_62_ * i_58_];
			for (int i_65_ = 0; i_65_ < i_58_; i_65_++) {
				int i_66_ = i_65_ * i_62_;
				int i_67_ = (i_58_ - i_65_ - 1) * i_63_ + i_59_;
				for (int i_68_ = 0; i_68_ < i_62_; i_68_++)
					is_64_[i_66_++] = is[i_67_++];
			}
			is = is_64_;
		}
		aClass180_Sub3_1432.method15401(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_60_ != i_57_)
			OpenGL.glPixelStorei(3314, i_60_);
		OpenGL.glTexSubImage2Dub(anInt1434, 0, i, anInt8962 - i_56_ - i_58_, i_57_, i_58_, Class180_Sub3.method15423(class157), 5121, is, i_59_);
		if (i_60_ != i_57_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	void method14456(int i, int i_69_, int i_70_, int i_71_, int[] is, int[] is_72_, int i_73_) {
		int[] is_74_ = is_72_ == null ? new int[anInt8961 * anInt8962] : is_72_;
		aClass180_Sub3_1432.method15401(this);
		OpenGL.glGetTexImagei(anInt1434, 0, 32993, 5121, is_74_, 0);
		for (int i_75_ = 0; i_75_ < i_71_; i_75_++)
			System.arraycopy(is_74_, (i_69_ + (i_71_ - 1) - i_75_) * anInt8961, is, i_73_ + i_75_ * i_70_, i_70_);
	}

	void method14457(int i, int i_76_, int i_77_, int i_78_, int[] is, int i_79_, int i_80_, boolean bool) {
		if (i_80_ == 0)
			i_80_ = i_77_;
		if (bool) {
			int[] is_81_ = new int[i_77_ * i_78_];
			for (int i_82_ = 0; i_82_ < i_78_; i_82_++) {
				int i_83_ = i_82_ * i_77_;
				int i_84_ = (i_78_ - i_82_ - 1) * i_80_ + i_79_;
				for (int i_85_ = 0; i_85_ < i_77_; i_85_++)
					is_81_[i_83_++] = is[i_84_++];
			}
			is = is_81_;
		}
		aClass180_Sub3_1432.method15401(this);
		if (i_77_ != i_80_)
			OpenGL.glPixelStorei(3314, i_80_);
		OpenGL.glTexSubImage2Di(anInt1434, 0, i, anInt8962 - i_76_ - i_78_, i_77_, i_78_, 32993, aClass180_Sub3_1432.anInt9835, is, i_79_);
		if (i_77_ != i_80_)
			OpenGL.glPixelStorei(3314, 0);
	}

	void method14458(boolean bool, boolean bool_86_) {
		if (anInt1434 == 3553) {
			aClass180_Sub3_1432.method15401(this);
			OpenGL.glTexParameteri(anInt1434, 10242, bool ? 10497 : 33071);
			OpenGL.glTexParameteri(anInt1434, 10243, bool_86_ ? 10497 : 33071);
		}
	}

	Interface21 method14459(int i) {
		return new Class152(this, i);
	}

	void method14460(int i, int i_87_, int i_88_, int i_89_, byte[] is, Class157 class157, int i_90_, int i_91_, boolean bool) {
		if (i_91_ == 0)
			i_91_ = i_88_;
		if (bool) {
			int i_92_ = class157.anInt1722 * -1216378097;
			int i_93_ = i_92_ * i_88_;
			int i_94_ = i_92_ * i_91_;
			byte[] is_95_ = new byte[i_93_ * i_89_];
			for (int i_96_ = 0; i_96_ < i_89_; i_96_++) {
				int i_97_ = i_96_ * i_93_;
				int i_98_ = (i_89_ - i_96_ - 1) * i_94_ + i_90_;
				for (int i_99_ = 0; i_99_ < i_93_; i_99_++)
					is_95_[i_97_++] = is[i_98_++];
			}
			is = is_95_;
		}
		aClass180_Sub3_1432.method15401(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_91_ != i_88_)
			OpenGL.glPixelStorei(3314, i_91_);
		OpenGL.glTexSubImage2Dub(anInt1434, 0, i, anInt8962 - i_87_ - i_89_, i_88_, i_89_, Class180_Sub3.method15423(class157), 5121, is, i_90_);
		if (i_91_ != i_88_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	void method14461(int i, int i_100_, int i_101_, int i_102_, int[] is, int i_103_, int i_104_, boolean bool) {
		if (i_104_ == 0)
			i_104_ = i_101_;
		if (bool) {
			int[] is_105_ = new int[i_101_ * i_102_];
			for (int i_106_ = 0; i_106_ < i_102_; i_106_++) {
				int i_107_ = i_106_ * i_101_;
				int i_108_ = (i_102_ - i_106_ - 1) * i_104_ + i_103_;
				for (int i_109_ = 0; i_109_ < i_101_; i_109_++)
					is_105_[i_107_++] = is[i_108_++];
			}
			is = is_105_;
		}
		aClass180_Sub3_1432.method15401(this);
		if (i_101_ != i_104_)
			OpenGL.glPixelStorei(3314, i_104_);
		OpenGL.glTexSubImage2Di(anInt1434, 0, i, anInt8962 - i_100_ - i_102_, i_101_, i_102_, 32993, aClass180_Sub3_1432.anInt9835, is, i_103_);
		if (i_101_ != i_104_)
			OpenGL.glPixelStorei(3314, 0);
	}

	void method14462(int i, int i_110_, int i_111_, int i_112_, int[] is, int i_113_, int i_114_, boolean bool) {
		if (i_114_ == 0)
			i_114_ = i_111_;
		if (bool) {
			int[] is_115_ = new int[i_111_ * i_112_];
			for (int i_116_ = 0; i_116_ < i_112_; i_116_++) {
				int i_117_ = i_116_ * i_111_;
				int i_118_ = (i_112_ - i_116_ - 1) * i_114_ + i_113_;
				for (int i_119_ = 0; i_119_ < i_111_; i_119_++)
					is_115_[i_117_++] = is[i_118_++];
			}
			is = is_115_;
		}
		aClass180_Sub3_1432.method15401(this);
		if (i_111_ != i_114_)
			OpenGL.glPixelStorei(3314, i_114_);
		OpenGL.glTexSubImage2Di(anInt1434, 0, i, anInt8962 - i_110_ - i_112_, i_111_, i_112_, 32993, aClass180_Sub3_1432.anInt9835, is, i_113_);
		if (i_111_ != i_114_)
			OpenGL.glPixelStorei(3314, 0);
	}

	Interface23 method14463(int i) {
		return new Class152(this, i);
	}

	void method14464(int i, int i_120_, int i_121_, int i_122_, byte[] is, Class157 class157, int i_123_, int i_124_, boolean bool) {
		if (i_124_ == 0)
			i_124_ = i_121_;
		if (bool) {
			int i_125_ = class157.anInt1722 * -1216378097;
			int i_126_ = i_125_ * i_121_;
			int i_127_ = i_125_ * i_124_;
			byte[] is_128_ = new byte[i_126_ * i_122_];
			for (int i_129_ = 0; i_129_ < i_122_; i_129_++) {
				int i_130_ = i_129_ * i_126_;
				int i_131_ = (i_122_ - i_129_ - 1) * i_127_ + i_123_;
				for (int i_132_ = 0; i_132_ < i_126_; i_132_++)
					is_128_[i_130_++] = is[i_131_++];
			}
			is = is_128_;
		}
		aClass180_Sub3_1432.method15401(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_124_ != i_121_)
			OpenGL.glPixelStorei(3314, i_124_);
		OpenGL.glTexSubImage2Dub(anInt1434, 0, i, anInt8962 - i_120_ - i_122_, i_121_, i_122_, Class180_Sub3.method15423(class157), 5121, is, i_123_);
		if (i_124_ != i_121_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	void method14465(int i, int i_133_, int i_134_, int i_135_, int[] is, int[] is_136_, int i_137_) {
		int[] is_138_ = is_136_ == null ? new int[anInt8961 * anInt8962] : is_136_;
		aClass180_Sub3_1432.method15401(this);
		OpenGL.glGetTexImagei(anInt1434, 0, 32993, 5121, is_138_, 0);
		for (int i_139_ = 0; i_139_ < i_135_; i_139_++)
			System.arraycopy(is_138_, (i_133_ + (i_135_ - 1) - i_139_) * anInt8961, is, i_137_ + i_139_ * i_134_, i_134_);
	}

	void method14466(int i, int i_140_, int i_141_, int i_142_, int[] is, int[] is_143_, int i_144_) {
		int[] is_145_ = is_143_ == null ? new int[anInt8961 * anInt8962] : is_143_;
		aClass180_Sub3_1432.method15401(this);
		OpenGL.glGetTexImagei(anInt1434, 0, 32993, 5121, is_145_, 0);
		for (int i_146_ = 0; i_146_ < i_142_; i_146_++)
			System.arraycopy(is_145_, (i_140_ + (i_142_ - 1) - i_146_) * anInt8961, is, i_144_ + i_146_ * i_141_, i_141_);
	}

	void method14467(int i, int i_147_, int i_148_, int i_149_, int[] is, int[] is_150_, int i_151_) {
		int[] is_152_ = is_150_ == null ? new int[anInt8961 * anInt8962] : is_150_;
		aClass180_Sub3_1432.method15401(this);
		OpenGL.glGetTexImagei(anInt1434, 0, 32993, 5121, is_152_, 0);
		for (int i_153_ = 0; i_153_ < i_149_; i_153_++)
			System.arraycopy(is_152_, (i_147_ + (i_149_ - 1) - i_153_) * anInt8961, is, i_151_ + i_153_ * i_148_, i_148_);
	}

	void method14468(int i, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_) {
		Class171 class171 = aClass180_Sub3_1432.method3285(331955140);
		if (class171 != null) {
			int i_159_ = class171.method2729() - (i_158_ + i_156_);
			aClass180_Sub3_1432.method15401(this);
			OpenGL.glCopyTexSubImage2D(anInt1434, 0, i, anInt8962 - (i_154_ + i_156_), i_157_, i_159_, i_155_, i_156_);
			OpenGL.glFlush();
		}
	}

	void method14469(int i, int i_160_, int i_161_, int i_162_, int i_163_, int i_164_) {
		Class171 class171 = aClass180_Sub3_1432.method3285(1024498402);
		if (class171 != null) {
			int i_165_ = class171.method2729() - (i_164_ + i_162_);
			aClass180_Sub3_1432.method15401(this);
			OpenGL.glCopyTexSubImage2D(anInt1434, 0, i, anInt8962 - (i_160_ + i_162_), i_163_, i_165_, i_161_, i_162_);
			OpenGL.glFlush();
		}
	}

	void method14470(int i, int i_166_, int i_167_, int i_168_, int i_169_, int i_170_) {
		Class171 class171 = aClass180_Sub3_1432.method3285(711023465);
		if (class171 != null) {
			int i_171_ = class171.method2729() - (i_170_ + i_168_);
			aClass180_Sub3_1432.method15401(this);
			OpenGL.glCopyTexSubImage2D(anInt1434, 0, i, anInt8962 - (i_166_ + i_168_), i_169_, i_171_, i_167_, i_168_);
			OpenGL.glFlush();
		}
	}

	Interface23 method14471(int i) {
		return new Class152(this, i);
	}

	Interface21 method14472(int i) {
		return new Class152(this, i);
	}
}
