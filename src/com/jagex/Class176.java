/* Class176 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class176 {
	protected boolean aBool1951 = false;
	static final float aFloat1952 = 3.1415927F;
	public boolean aBool1953 = true;

	public abstract void method2855(int i, int i_0_, int i_1_);

	static void method2856(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, float[] fs, int i_7_, float f, float[] fs_8_) {
		i -= i_4_;
		i_2_ -= i_5_;
		i_3_ -= i_6_;
		float f_9_ = (float) i * fs[0] + (float) i_2_ * fs[1] + (float) i_3_ * fs[2];
		float f_10_ = (float) i * fs[3] + (float) i_2_ * fs[4] + (float) i_3_ * fs[5];
		float f_11_ = (float) i * fs[6] + (float) i_2_ * fs[7] + (float) i_3_ * fs[8];
		float f_12_ = (float) Math.sqrt((double) (f_9_ * f_9_ + f_10_ * f_10_ + f_11_ * f_11_));
		float f_13_ = ((float) Math.atan2((double) f_9_, (double) f_11_) / 6.2831855F + 0.5F);
		float f_14_ = ((float) Math.asin((double) (f_10_ / f_12_)) / 3.1415927F + 0.5F + f);
		if (i_7_ == 1) {
			float f_15_ = f_13_;
			f_13_ = -f_14_;
			f_14_ = f_15_;
		} else if (i_7_ == 2) {
			f_13_ = -f_13_;
			f_14_ = -f_14_;
		} else if (i_7_ == 3) {
			float f_16_ = f_13_;
			f_13_ = f_14_;
			f_14_ = -f_16_;
		}
		fs_8_[0] = f_13_;
		fs_8_[1] = f_14_;
	}

	static void method2857(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, float[] fs, float f, int i_22_, float f_23_, float[] fs_24_) {
		i -= i_19_;
		i_17_ -= i_20_;
		i_18_ -= i_21_;
		float f_25_ = ((float) i * fs[0] + (float) i_17_ * fs[1] + (float) i_18_ * fs[2]);
		float f_26_ = ((float) i * fs[3] + (float) i_17_ * fs[4] + (float) i_18_ * fs[5]);
		float f_27_ = ((float) i * fs[6] + (float) i_17_ * fs[7] + (float) i_18_ * fs[8]);
		float f_28_ = ((float) Math.atan2((double) f_25_, (double) f_27_) / 6.2831855F + 0.5F);
		if (f != 1.0F)
			f_28_ *= f;
		float f_29_ = f_26_ + 0.5F + f_23_;
		if (i_22_ == 1) {
			float f_30_ = f_28_;
			f_28_ = -f_29_;
			f_29_ = f_30_;
		} else if (i_22_ == 2) {
			f_28_ = -f_28_;
			f_29_ = -f_29_;
		} else if (i_22_ == 3) {
			float f_31_ = f_28_;
			f_28_ = f_29_;
			f_29_ = -f_31_;
		}
		fs_24_[0] = f_28_;
		fs_24_[1] = f_29_;
	}

	static int method2858(float f, float f_32_, float f_33_) {
		float f_34_ = f < 0.0F ? -f : f;
		float f_35_ = f_32_ < 0.0F ? -f_32_ : f_32_;
		float f_36_ = f_33_ < 0.0F ? -f_33_ : f_33_;
		if (f_35_ > f_34_ && f_35_ > f_36_) {
			if (f_32_ > 0.0F)
				return 0;
			return 1;
		}
		if (f_36_ > f_34_ && f_36_ > f_35_) {
			if (f_33_ > 0.0F)
				return 2;
			return 3;
		}
		if (f > 0.0F)
			return 4;
		return 5;
	}

	static void method2859(int i, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, float[] fs, int i_43_, float f, float f_44_, float f_45_, float[] fs_46_) {
		i -= i_39_;
		i_37_ -= i_40_;
		i_38_ -= i_41_;
		float f_47_ = ((float) i * fs[0] + (float) i_37_ * fs[1] + (float) i_38_ * fs[2]);
		float f_48_ = ((float) i * fs[3] + (float) i_37_ * fs[4] + (float) i_38_ * fs[5]);
		float f_49_ = ((float) i * fs[6] + (float) i_37_ * fs[7] + (float) i_38_ * fs[8]);
		float f_50_;
		float f_51_;
		if (i_42_ == 0) {
			f_50_ = f_47_ + f + 0.5F;
			f_51_ = -f_49_ + f_45_ + 0.5F;
		} else if (i_42_ == 1) {
			f_50_ = f_47_ + f + 0.5F;
			f_51_ = f_49_ + f_45_ + 0.5F;
		} else if (i_42_ == 2) {
			f_50_ = -f_47_ + f + 0.5F;
			f_51_ = -f_48_ + f_44_ + 0.5F;
		} else if (i_42_ == 3) {
			f_50_ = f_47_ + f + 0.5F;
			f_51_ = -f_48_ + f_44_ + 0.5F;
		} else if (i_42_ == 4) {
			f_50_ = f_49_ + f_45_ + 0.5F;
			f_51_ = -f_48_ + f_44_ + 0.5F;
		} else {
			f_50_ = -f_49_ + f_45_ + 0.5F;
			f_51_ = -f_48_ + f_44_ + 0.5F;
		}
		if (i_43_ == 1) {
			float f_52_ = f_50_;
			f_50_ = -f_51_;
			f_51_ = f_52_;
		} else if (i_43_ == 2) {
			f_50_ = -f_50_;
			f_51_ = -f_51_;
		} else if (i_43_ == 3) {
			float f_53_ = f_50_;
			f_50_ = f_51_;
			f_51_ = -f_53_;
		}
		fs_46_[0] = f_50_;
		fs_46_[1] = f_51_;
	}

	Class173 method2860(Class175 class175, int[] is, int i) {
		int[] is_54_ = null;
		int[] is_55_ = null;
		int[] is_56_ = null;
		float[][] fs = null;
		if (class175.aShortArray1927 != null) {
			int i_57_ = class175.anInt1926;
			int[] is_58_ = new int[i_57_];
			int[] is_59_ = new int[i_57_];
			int[] is_60_ = new int[i_57_];
			int[] is_61_ = new int[i_57_];
			int[] is_62_ = new int[i_57_];
			int[] is_63_ = new int[i_57_];
			for (int i_64_ = 0; i_64_ < i_57_; i_64_++) {
				is_58_[i_64_] = 2147483647;
				is_59_[i_64_] = -2147483647;
				is_60_[i_64_] = 2147483647;
				is_61_[i_64_] = -2147483647;
				is_62_[i_64_] = 2147483647;
				is_63_[i_64_] = -2147483647;
			}
			for (int i_65_ = 0; i_65_ < i; i_65_++) {
				int i_66_ = is[i_65_];
				short i_67_ = class175.aShortArray1927[i_66_];
				if (i_67_ > -1 && i_67_ < 32766) {
					for (int i_68_ = 0; i_68_ < 3; i_68_++) {
						short i_69_;
						if (i_68_ == 0)
							i_69_ = class175.aShortArray1918[i_66_];
						else if (i_68_ == 1)
							i_69_ = class175.aShortArray1940[i_66_];
						else
							i_69_ = class175.aShortArray1920[i_66_];
						int i_70_ = class175.anIntArray1908[i_69_];
						int i_71_ = class175.anIntArray1909[i_69_];
						int i_72_ = class175.anIntArray1910[i_69_];
						if (i_70_ < is_58_[i_67_])
							is_58_[i_67_] = i_70_;
						if (i_70_ > is_59_[i_67_])
							is_59_[i_67_] = i_70_;
						if (i_71_ < is_60_[i_67_])
							is_60_[i_67_] = i_71_;
						if (i_71_ > is_61_[i_67_])
							is_61_[i_67_] = i_71_;
						if (i_72_ < is_62_[i_67_])
							is_62_[i_67_] = i_72_;
						if (i_72_ > is_63_[i_67_])
							is_63_[i_67_] = i_72_;
					}
				}
			}
			is_54_ = new int[i_57_];
			is_55_ = new int[i_57_];
			is_56_ = new int[i_57_];
			fs = new float[i_57_][];
			for (int i_73_ = 0; i_73_ < i_57_; i_73_++) {
				byte i_74_ = class175.aByteArray1936[i_73_];
				if (i_74_ > 0) {
					is_54_[i_73_] = (is_58_[i_73_] + is_59_[i_73_]) / 2;
					is_55_[i_73_] = (is_60_[i_73_] + is_61_[i_73_]) / 2;
					is_56_[i_73_] = (is_62_[i_73_] + is_63_[i_73_]) / 2;
					float f;
					float f_75_;
					float f_76_;
					if (i_74_ == 1) {
						int i_77_ = class175.anIntArray1930[i_73_];
						if (i_77_ == 0) {
							f = 1.0F;
							f_76_ = 1.0F;
						} else if (i_77_ > 0) {
							f = 1.0F;
							f_76_ = (float) i_77_ / 1024.0F;
						} else {
							f_76_ = 1.0F;
							f = (float) -i_77_ / 1024.0F;
						}
						f_75_ = 64.0F / (float) class175.anIntArray1941[i_73_];
					} else if (i_74_ == 2) {
						f = 64.0F / (float) class175.anIntArray1930[i_73_];
						f_75_ = 64.0F / (float) class175.anIntArray1941[i_73_];
						f_76_ = 64.0F / (float) class175.anIntArray1943[i_73_];
					} else {
						f = (float) class175.anIntArray1930[i_73_] / 1024.0F;
						f_75_ = (float) class175.anIntArray1941[i_73_] / 1024.0F;
						f_76_ = (float) class175.anIntArray1943[i_73_] / 1024.0F;
					}
					fs[i_73_] = method2892(class175.aShortArray1937[i_73_], class175.aShortArray1938[i_73_], class175.aShortArray1939[i_73_], class175.aByteArray1946[i_73_] & 0xff, f, f_75_, f_76_);
				}
			}
		}
		return new Class173(this, is_54_, is_55_, is_56_, fs);
	}

	static void method2861(int i, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, float[] fs, int i_84_, float f, float f_85_, float f_86_, float[] fs_87_) {
		i -= i_80_;
		i_78_ -= i_81_;
		i_79_ -= i_82_;
		float f_88_ = ((float) i * fs[0] + (float) i_78_ * fs[1] + (float) i_79_ * fs[2]);
		float f_89_ = ((float) i * fs[3] + (float) i_78_ * fs[4] + (float) i_79_ * fs[5]);
		float f_90_ = ((float) i * fs[6] + (float) i_78_ * fs[7] + (float) i_79_ * fs[8]);
		float f_91_;
		float f_92_;
		if (i_83_ == 0) {
			f_91_ = f_88_ + f + 0.5F;
			f_92_ = -f_90_ + f_86_ + 0.5F;
		} else if (i_83_ == 1) {
			f_91_ = f_88_ + f + 0.5F;
			f_92_ = f_90_ + f_86_ + 0.5F;
		} else if (i_83_ == 2) {
			f_91_ = -f_88_ + f + 0.5F;
			f_92_ = -f_89_ + f_85_ + 0.5F;
		} else if (i_83_ == 3) {
			f_91_ = f_88_ + f + 0.5F;
			f_92_ = -f_89_ + f_85_ + 0.5F;
		} else if (i_83_ == 4) {
			f_91_ = f_90_ + f_86_ + 0.5F;
			f_92_ = -f_89_ + f_85_ + 0.5F;
		} else {
			f_91_ = -f_90_ + f_86_ + 0.5F;
			f_92_ = -f_89_ + f_85_ + 0.5F;
		}
		if (i_84_ == 1) {
			float f_93_ = f_91_;
			f_91_ = -f_92_;
			f_92_ = f_93_;
		} else if (i_84_ == 2) {
			f_91_ = -f_91_;
			f_92_ = -f_92_;
		} else if (i_84_ == 3) {
			float f_94_ = f_91_;
			f_91_ = f_92_;
			f_92_ = -f_94_;
		}
		fs_87_[0] = f_91_;
		fs_87_[1] = f_92_;
	}

	public abstract Class176 method2862(byte i, int i_95_, boolean bool);

	public abstract void method2863();

	public abstract void method2864();

	public abstract int method2865();

	public abstract int method2866();

	public abstract void method2867(int i);

	public abstract void method2868(int i);

	public abstract void method2869(int i);

	public abstract void method2870(Class432 class432);

	public abstract void method2871(Class432 class432);

	public abstract void method2872(int i, int i_96_, int i_97_);

	public abstract void method2873(int i, int i_98_, Class161 class161, Class161 class161_99_, int i_100_, int i_101_, int i_102_);

	public abstract int method2874();

	abstract void method2875();

	public abstract void method2876(int i);

	public final void method2877(Class527_Sub8_Sub16 class527_sub8_sub16, int i, Class527_Sub8_Sub16 class527_sub8_sub16_103_, int i_104_, int i_105_, int i_106_, int i_107_, boolean bool) {
		if (i != -1) {
			method2875();
			if (!method2883())
				method2984();
			else {
				Class164 class164 = class527_sub8_sub16.aClass164Array11818[i];
				Class527_Sub3 class527_sub3 = class164.aClass527_Sub3_1817;
				Class164 class164_108_ = null;
				if (class527_sub8_sub16_103_ != null) {
					class164_108_ = class527_sub8_sub16_103_.aClass164Array11818[i_104_];
					if (class164_108_.aClass527_Sub3_1817 != class527_sub3)
						class164_108_ = null;
				}
				method2953(class527_sub3, class164, class164_108_, i_105_, i_106_, i_107_, null, false, bool, 65535, null);
				method2887();
				method2984();
			}
		}
	}

	public final void method2878(Class527_Sub8_Sub16 class527_sub8_sub16, int i, Class527_Sub8_Sub16 class527_sub8_sub16_109_, int i_110_, int i_111_, int i_112_, int i_113_, int i_114_, boolean bool, int[] is) {
		if (i != -1) {
			method2875();
			if (!method2883())
				method2984();
			else {
				Class164 class164 = class527_sub8_sub16.aClass164Array11818[i];
				Class527_Sub3 class527_sub3 = class164.aClass527_Sub3_1817;
				Class164 class164_115_ = null;
				if (class527_sub8_sub16_109_ != null) {
					class164_115_ = class527_sub8_sub16_109_.aClass164Array11818[i_110_];
					if (class164_115_.aClass527_Sub3_1817 != class527_sub3)
						class164_115_ = null;
				}
				method2953(class527_sub3, class164, class164_115_, i_111_, i_112_, i_113_, null, false, bool, i_114_, is);
				method2887();
				method2984();
			}
		}
	}

	public final void method2879(Class527_Sub8_Sub16 class527_sub8_sub16, int i, Class527_Sub8_Sub16 class527_sub8_sub16_116_, int i_117_, int i_118_, int i_119_, Class527_Sub8_Sub16 class527_sub8_sub16_120_, int i_121_, Class527_Sub8_Sub16 class527_sub8_sub16_122_, int i_123_, int i_124_, int i_125_, boolean[] bools, boolean bool) {
		if (i != -1) {
			if (bools == null || i_121_ == -1)
				method2877(class527_sub8_sub16, i, class527_sub8_sub16_116_, i_117_, i_118_, i_119_, 0, bool);
			else {
				method2875();
				if (!method2883())
					method2984();
				else {
					Class164 class164 = class527_sub8_sub16.aClass164Array11818[i];
					Class527_Sub3 class527_sub3 = class164.aClass527_Sub3_1817;
					Class164 class164_126_ = null;
					if (class527_sub8_sub16_116_ != null) {
						class164_126_ = (class527_sub8_sub16_116_.aClass164Array11818[i_117_]);
						if (class164_126_.aClass527_Sub3_1817 != class527_sub3)
							class164_126_ = null;
					}
					method2953(class527_sub3, class164, class164_126_, i_118_, i_119_, 0, bools, false, bool, 65535, null);
					Class164 class164_127_ = class527_sub8_sub16_120_.aClass164Array11818[i_121_];
					Class164 class164_128_ = null;
					if (class527_sub8_sub16_122_ != null) {
						class164_128_ = (class527_sub8_sub16_122_.aClass164Array11818[i_123_]);
						if (class164_128_.aClass527_Sub3_1817 != class527_sub3)
							class164_128_ = null;
					}
					method2884(0, new int[0], 0, 0, 0, 0, bool);
					method2953(class164_127_.aClass527_Sub3_1817, class164_127_, class164_128_, i_124_, i_125_, 0, bools, true, bool, 65535, null);
					method2887();
					method2984();
				}
			}
		}
	}

	void method2880(Class161 class161, int i, int i_129_, int i_130_, int i_131_, int i_132_, int i_133_, int i_134_) {
		boolean bool = false;
		boolean bool_135_ = false;
		boolean bool_136_ = false;
		int i_137_ = -i_131_ / 2;
		int i_138_ = -i_132_ / 2;
		int i_139_ = class161.method2619(i + i_137_, i_130_ + i_138_, 446744569);
		int i_140_ = i_131_ / 2;
		int i_141_ = -i_132_ / 2;
		int i_142_ = class161.method2619(i + i_140_, i_130_ + i_141_, -253168347);
		int i_143_ = -i_131_ / 2;
		int i_144_ = i_132_ / 2;
		int i_145_ = class161.method2619(i + i_143_, i_130_ + i_144_, 910822175);
		int i_146_ = i_131_ / 2;
		int i_147_ = i_132_ / 2;
		int i_148_ = class161.method2619(i + i_146_, i_130_ + i_147_, -1267279476);
		int i_149_ = i_139_ < i_142_ ? i_139_ : i_142_;
		int i_150_ = i_145_ < i_148_ ? i_145_ : i_148_;
		int i_151_ = i_142_ < i_148_ ? i_142_ : i_148_;
		int i_152_ = i_139_ < i_145_ ? i_139_ : i_145_;
		if (i_132_ != 0) {
			int i_153_ = ((int) (Math.atan2((double) (i_149_ - i_150_), (double) i_132_) * 2607.5945876176133) & 0x3fff);
			if (i_153_ != 0) {
				if (i_133_ != 0) {
					if (i_153_ > 8192) {
						int i_154_ = 16384 - i_133_;
						if (i_153_ < i_154_)
							i_153_ = i_154_;
					} else if (i_153_ > i_133_)
						i_153_ = i_133_;
				}
				method2868(i_153_);
			}
		}
		if (i_131_ != 0) {
			int i_155_ = ((int) (Math.atan2((double) (i_152_ - i_151_), (double) i_131_) * 2607.5945876176133) & 0x3fff);
			if (i_155_ != 0) {
				if (i_134_ != 0) {
					if (i_155_ > 8192) {
						int i_156_ = 16384 - i_134_;
						if (i_155_ < i_156_)
							i_155_ = i_156_;
					} else if (i_155_ > i_134_)
						i_155_ = i_134_;
				}
				method2869(i_155_);
			}
		}
		int i_157_ = i_139_ + i_148_;
		if (i_142_ + i_145_ < i_157_)
			i_157_ = i_142_ + i_145_;
		i_157_ = (i_157_ >> 1) - i_129_;
		if (i_157_ != 0)
			method3015(0, i_157_, 0);
	}

	public abstract void method2881(Class176 class176_158_, int i, int i_159_, int i_160_, boolean bool);

	void method2882(int i, int[] is, int i_161_, int i_162_, int i_163_, int i_164_, boolean bool, int i_165_, int[] is_166_) {
		if (i_164_ == 1) {
			if (i == 0 || i == 1) {
				int i_167_ = -i_161_;
				i_161_ = i_163_;
				i_163_ = i_167_;
			} else if (i == 3) {
				int i_168_ = i_161_;
				i_161_ = i_163_;
				i_163_ = i_168_;
			} else if (i == 2) {
				int i_169_ = i_161_;
				i_161_ = -i_163_ & 0x3fff;
				i_163_ = i_169_ & 0x3fff;
			}
		} else if (i_164_ == 2) {
			if (i == 0 || i == 1) {
				i_161_ = -i_161_;
				i_163_ = -i_163_;
			} else if (i == 2) {
				i_161_ = -i_161_ & 0x3fff;
				i_163_ = -i_163_ & 0x3fff;
			}
		} else if (i_164_ == 3) {
			if (i == 0 || i == 1) {
				int i_170_ = i_161_;
				i_161_ = -i_163_;
				i_163_ = i_170_;
			} else if (i == 3) {
				int i_171_ = i_161_;
				i_161_ = i_163_;
				i_163_ = i_171_;
			} else if (i == 2) {
				int i_172_ = i_161_;
				i_161_ = i_163_ & 0x3fff;
				i_163_ = -i_172_ & 0x3fff;
			}
		}
		if (i_165_ != 65535)
			method2885(i, is, i_161_, i_162_, i_163_, bool, i_165_, is_166_);
		else
			method2884(i, is, i_161_, i_162_, i_163_, i_164_, bool);
	}

	abstract boolean method2883();

	abstract void method2884(int i, int[] is, int i_173_, int i_174_, int i_175_, int i_176_, boolean bool);

	abstract void method2885(int i, int[] is, int i_177_, int i_178_, int i_179_, boolean bool, int i_180_, int[] is_181_);

	public abstract void method2886(int i, int i_182_, int i_183_);

	abstract void method2887();

	public abstract void method2888(Class432 class432, int i, boolean bool);

	public abstract void method2889(Class432 class432, Class169 class169, int i);

	public abstract int method2890();

	public abstract Class527_Sub8_Sub8 method2891(Class527_Sub8_Sub8 class527_sub8_sub8);

	static float[] method2892(int i, int i_184_, int i_185_, int i_186_, float f, float f_187_, float f_188_) {
		float[] fs = new float[9];
		float[] fs_189_ = new float[9];
		float f_190_ = (float) Math.cos((double) ((float) i_186_ * 0.024543693F));
		float f_191_ = (float) Math.sin((double) ((float) i_186_ * 0.024543693F));
		float f_192_ = 1.0F - f_190_;
		fs[0] = f_190_;
		fs[1] = 0.0F;
		fs[2] = f_191_;
		fs[3] = 0.0F;
		fs[4] = 1.0F;
		fs[5] = 0.0F;
		fs[6] = -f_191_;
		fs[7] = 0.0F;
		fs[8] = f_190_;
		float[] fs_193_ = new float[9];
		float f_194_ = 1.0F;
		float f_195_ = 0.0F;
		f_190_ = (float) i_184_ / 32767.0F;
		f_191_ = -(float) Math.sqrt((double) (1.0F - f_190_ * f_190_));
		f_192_ = 1.0F - f_190_;
		float f_196_ = (float) Math.sqrt((double) (i * i + i_185_ * i_185_));
		if (f_196_ == 0.0F && f_190_ == 0.0F)
			fs_189_ = fs;
		else {
			if (f_196_ != 0.0F) {
				f_194_ = (float) -i_185_ / f_196_;
				f_195_ = (float) i / f_196_;
			}
			fs_193_[0] = f_190_ + f_194_ * f_194_ * f_192_;
			fs_193_[1] = f_195_ * f_191_;
			fs_193_[2] = f_195_ * f_194_ * f_192_;
			fs_193_[3] = -f_195_ * f_191_;
			fs_193_[4] = f_190_;
			fs_193_[5] = f_194_ * f_191_;
			fs_193_[6] = f_194_ * f_195_ * f_192_;
			fs_193_[7] = -f_194_ * f_191_;
			fs_193_[8] = f_190_ + f_195_ * f_195_ * f_192_;
			fs_189_[0] = fs[0] * fs_193_[0] + fs[1] * fs_193_[3] + fs[2] * fs_193_[6];
			fs_189_[1] = fs[0] * fs_193_[1] + fs[1] * fs_193_[4] + fs[2] * fs_193_[7];
			fs_189_[2] = fs[0] * fs_193_[2] + fs[1] * fs_193_[5] + fs[2] * fs_193_[8];
			fs_189_[3] = fs[3] * fs_193_[0] + fs[4] * fs_193_[3] + fs[5] * fs_193_[6];
			fs_189_[4] = fs[3] * fs_193_[1] + fs[4] * fs_193_[4] + fs[5] * fs_193_[7];
			fs_189_[5] = fs[3] * fs_193_[2] + fs[4] * fs_193_[5] + fs[5] * fs_193_[8];
			fs_189_[6] = fs[6] * fs_193_[0] + fs[7] * fs_193_[3] + fs[8] * fs_193_[6];
			fs_189_[7] = fs[6] * fs_193_[1] + fs[7] * fs_193_[4] + fs[8] * fs_193_[7];
			fs_189_[8] = fs[6] * fs_193_[2] + fs[7] * fs_193_[5] + fs[8] * fs_193_[8];
		}
		fs_189_[0] *= f;
		fs_189_[1] *= f;
		fs_189_[2] *= f;
		fs_189_[3] *= f_187_;
		fs_189_[4] *= f_187_;
		fs_189_[5] *= f_187_;
		fs_189_[6] *= f_188_;
		fs_189_[7] *= f_188_;
		fs_189_[8] *= f_188_;
		return fs_189_;
	}

	public abstract int method2893();

	public abstract int method2894();

	public abstract void method2895();

	public abstract int method2896();

	public abstract int method2897();

	public abstract int method2898();

	public abstract Class159[] method2899();

	public abstract byte[] method2900();

	public abstract void method2901();

	public abstract int method2902();

	public abstract void method2903(int i);

	public abstract Class527_Sub8_Sub8 method2904(Class527_Sub8_Sub8 class527_sub8_sub8);

	public abstract int method2905();

	public abstract byte[] method2906();

	public abstract void method2907(short i, short i_197_);

	public abstract void method2908(byte i, byte[] is);

	public abstract void method2909(short i, short i_198_);

	abstract void method2910(int i, int i_199_, int i_200_, int i_201_);

	public abstract void method2911(int i);

	public abstract void method2912(int i, int i_202_, Class161 class161, Class161 class161_203_, int i_204_, int i_205_, int i_206_);

	public abstract boolean method2913();

	public abstract void method2914(byte i, byte[] is);

	public abstract Class167[] method2915();

	public abstract Class159[] method2916();

	abstract void method2917();

	public abstract void method2918(Class176 class176_207_, int i, int i_208_, int i_209_, boolean bool);

	public abstract int method2919();

	public abstract Class176 method2920(byte i, int i_210_, boolean bool);

	public abstract Class176 method2921(byte i, int i_211_, boolean bool);

	public abstract Class176 method2922(byte i, int i_212_, boolean bool);

	public abstract boolean method2923(int i, int i_213_, Class432 class432, boolean bool, int i_214_);

	public abstract Class176 method2924(byte i, int i_215_, boolean bool);

	public abstract void method2925(int i);

	public abstract void method2926(int i);

	abstract void method2927();

	public abstract void method2928();

	public abstract int method2929();

	public abstract void method2930(int i);

	public abstract void method2931(int i);

	public abstract int method2932();

	public abstract void method2933(int i);

	public final void method2934(Class527_Sub8_Sub16 class527_sub8_sub16, int i, Class527_Sub8_Sub16 class527_sub8_sub16_216_, int i_217_, int i_218_, int i_219_, int i_220_, int i_221_, boolean bool, int[] is) {
		if (i != -1) {
			method2875();
			if (!method2883())
				method2984();
			else {
				Class164 class164 = class527_sub8_sub16.aClass164Array11818[i];
				Class527_Sub3 class527_sub3 = class164.aClass527_Sub3_1817;
				Class164 class164_222_ = null;
				if (class527_sub8_sub16_216_ != null) {
					class164_222_ = class527_sub8_sub16_216_.aClass164Array11818[i_217_];
					if (class164_222_.aClass527_Sub3_1817 != class527_sub3)
						class164_222_ = null;
				}
				method2953(class527_sub3, class164, class164_222_, i_218_, i_219_, i_220_, null, false, bool, i_221_, is);
				method2887();
				method2984();
			}
		}
	}

	public abstract void method2935(int i);

	public abstract void method2936(short i, short i_223_);

	public abstract void method2937(int i);

	public abstract void method2938(int i);

	public abstract int method2939();

	abstract void method2940();

	public abstract void method2941(int i);

	public abstract int method2942();

	public abstract void method2943(int i, int i_224_, Class161 class161, Class161 class161_225_, int i_226_, int i_227_, int i_228_);

	public abstract void method2944(int i, int i_229_, Class161 class161, Class161 class161_230_, int i_231_, int i_232_, int i_233_);

	public abstract void method2945(int i, int i_234_, Class161 class161, Class161 class161_235_, int i_236_, int i_237_, int i_238_);

	abstract void method2946();

	abstract void method2947();

	public abstract boolean method2948(int i, int i_239_, Class432 class432, boolean bool, int i_240_);

	public abstract boolean method2949();

	Class176() {
		/* empty */
	}

	abstract void method2950();

	public abstract int method2951();

	abstract void method2952(int i, int[] is, int i_241_, int i_242_, int i_243_, int i_244_, boolean bool);

	void method2953(Class527_Sub3 class527_sub3, Class164 class164, Class164 class164_245_, int i, int i_246_, int i_247_, boolean[] bools, boolean bool, boolean bool_248_, int i_249_, int[] is) {
		if (class164_245_ == null || i == 0) {
			for (int i_250_ = 0; i_250_ < class164.anInt1828; i_250_++) {
				short i_251_ = class164.aShortArray1821[i_250_];
				if (bools == null || bools[i_251_] == bool || class527_sub3.anIntArray10367[i_251_] == 0) {
					short i_252_ = class164.aShortArray1823[i_250_];
					if (i_252_ != -1)
						method2882(0, class527_sub3.anIntArrayArray10371[i_252_], 0, 0, 0, i_247_, bool_248_, (i_249_ & class527_sub3.anIntArray10369[i_252_]), is);
					method2882(class527_sub3.anIntArray10367[i_251_], class527_sub3.anIntArrayArray10371[i_251_], class164.aShortArray1820[i_250_], class164.aShortArray1811[i_250_], class164.aShortArray1822[i_250_], i_247_, bool_248_, i_249_ & class527_sub3.anIntArray10369[i_251_], is);
				}
			}
		} else {
			int i_253_ = 0;
			int i_254_ = 0;
			for (int i_255_ = 0; i_255_ < class527_sub3.anInt10377 * -823161703; i_255_++) {
				boolean bool_256_ = false;
				if (i_253_ < class164.anInt1828 && class164.aShortArray1821[i_253_] == i_255_)
					bool_256_ = true;
				boolean bool_257_ = false;
				if (i_254_ < class164_245_.anInt1828 && class164_245_.aShortArray1821[i_254_] == i_255_)
					bool_257_ = true;
				if (bool_256_ || bool_257_) {
					if (bools != null && bools[i_255_] != bool && class527_sub3.anIntArray10367[i_255_] != 0) {
						if (bool_256_)
							i_253_++;
						if (bool_257_)
							i_254_++;
					} else {
						int i_258_ = 0;
						int i_259_ = class527_sub3.anIntArray10367[i_255_];
						if (i_259_ == 3 || i_259_ == 10)
							i_258_ = 128;
						int i_260_;
						int i_261_;
						int i_262_;
						short i_263_;
						byte i_264_;
						if (bool_256_) {
							i_260_ = class164.aShortArray1820[i_253_];
							i_261_ = class164.aShortArray1811[i_253_];
							i_262_ = class164.aShortArray1822[i_253_];
							i_263_ = class164.aShortArray1823[i_253_];
							i_264_ = class164.aByteArray1816[i_253_];
							i_253_++;
						} else {
							i_260_ = i_258_;
							i_261_ = i_258_;
							i_262_ = i_258_;
							i_263_ = (short) -1;
							i_264_ = (byte) 0;
						}
						int i_265_;
						int i_266_;
						int i_267_;
						short i_268_;
						byte i_269_;
						if (bool_257_) {
							i_265_ = class164_245_.aShortArray1820[i_254_];
							i_266_ = class164_245_.aShortArray1811[i_254_];
							i_267_ = class164_245_.aShortArray1822[i_254_];
							i_268_ = class164_245_.aShortArray1823[i_254_];
							i_269_ = class164_245_.aByteArray1816[i_254_];
							i_254_++;
						} else {
							i_265_ = i_258_;
							i_266_ = i_258_;
							i_267_ = i_258_;
							i_268_ = (short) -1;
							i_269_ = (byte) 0;
						}
						int i_270_;
						int i_271_;
						int i_272_;
						if ((i_264_ & 0x2) != 0 || (i_269_ & 0x1) != 0) {
							i_270_ = i_260_;
							i_271_ = i_261_;
							i_272_ = i_262_;
						} else if (i_259_ == 2) {
							int i_273_ = i_265_ - i_260_ & 0x3fff;
							int i_274_ = i_266_ - i_261_ & 0x3fff;
							int i_275_ = i_267_ - i_262_ & 0x3fff;
							if (i_273_ >= 8192)
								i_273_ -= 16384;
							if (i_274_ >= 8192)
								i_274_ -= 16384;
							if (i_275_ >= 8192)
								i_275_ -= 16384;
							i_270_ = i_260_ + i_273_ * i / i_246_ & 0x3fff;
							i_271_ = i_261_ + i_274_ * i / i_246_ & 0x3fff;
							i_272_ = i_262_ + i_275_ * i / i_246_ & 0x3fff;
						} else if (i_259_ == 9) {
							int i_276_ = i_265_ - i_260_ & 0x3fff;
							if (i_276_ >= 8192)
								i_276_ -= 16384;
							i_270_ = i_260_ + i_276_ * i / i_246_ & 0x3fff;
							i_272_ = 0;
							i_271_ = 0;
						} else if (i_259_ == 7) {
							int i_277_ = i_265_ - i_260_ & 0x3f;
							if (i_277_ >= 32)
								i_277_ -= 64;
							i_270_ = i_260_ + i_277_ * i / i_246_ & 0x3f;
							i_271_ = i_261_ + (i_266_ - i_261_) * i / i_246_;
							i_272_ = i_262_ + (i_267_ - i_262_) * i / i_246_;
						} else {
							i_270_ = i_260_ + (i_265_ - i_260_) * i / i_246_;
							i_271_ = i_261_ + (i_266_ - i_261_) * i / i_246_;
							i_272_ = i_262_ + (i_267_ - i_262_) * i / i_246_;
						}
						if (i_263_ != -1)
							method2882(0, (class527_sub3.anIntArrayArray10371[i_263_]), 0, 0, 0, i_247_, bool_248_, i_249_ & (class527_sub3.anIntArray10369[i_263_]), is);
						else if (i_268_ != -1)
							method2882(0, (class527_sub3.anIntArrayArray10371[i_268_]), 0, 0, 0, i_247_, bool_248_, i_249_ & (class527_sub3.anIntArray10369[i_268_]), is);
						method2882(i_259_, class527_sub3.anIntArrayArray10371[i_255_], i_270_, i_271_, i_272_, i_247_, bool_248_, (i_249_ & class527_sub3.anIntArray10369[i_255_]), is);
					}
				}
			}
		}
	}

	abstract void method2954(int i, int[] is, int i_278_, int i_279_, int i_280_, int i_281_, boolean bool);

	abstract void method2955(int i, int[] is, int i_282_, int i_283_, int i_284_, boolean bool, int i_285_, int[] is_286_);

	abstract void method2956(int i, int[] is, int i_287_, int i_288_, int i_289_, boolean bool, int i_290_, int[] is_291_);

	public abstract void method2957(Class432 class432, Class169 class169, int i);

	public abstract boolean method2958(int i, int i_292_, Class432 class432, boolean bool, int i_293_);

	public abstract void method2959(byte i, byte[] is);

	static void method2960(int i, int i_294_, int i_295_, int i_296_, int i_297_, int i_298_, float[] fs, float f, int i_299_, float f_300_, float[] fs_301_) {
		i -= i_296_;
		i_294_ -= i_297_;
		i_295_ -= i_298_;
		float f_302_ = ((float) i * fs[0] + (float) i_294_ * fs[1] + (float) i_295_ * fs[2]);
		float f_303_ = ((float) i * fs[3] + (float) i_294_ * fs[4] + (float) i_295_ * fs[5]);
		float f_304_ = ((float) i * fs[6] + (float) i_294_ * fs[7] + (float) i_295_ * fs[8]);
		float f_305_ = (((float) Math.atan2((double) f_302_, (double) f_304_) / 6.2831855F) + 0.5F);
		if (f != 1.0F)
			f_305_ *= f;
		float f_306_ = f_303_ + 0.5F + f_300_;
		if (i_299_ == 1) {
			float f_307_ = f_305_;
			f_305_ = -f_306_;
			f_306_ = f_307_;
		} else if (i_299_ == 2) {
			f_305_ = -f_305_;
			f_306_ = -f_306_;
		} else if (i_299_ == 3) {
			float f_308_ = f_305_;
			f_305_ = f_306_;
			f_306_ = -f_308_;
		}
		fs_301_[0] = f_305_;
		fs_301_[1] = f_306_;
	}

	public abstract void method2961(Class432 class432);

	void method2962(Class161 class161, int i, int i_309_, int i_310_, int i_311_, int i_312_, int i_313_, int i_314_) {
		boolean bool = false;
		boolean bool_315_ = false;
		boolean bool_316_ = false;
		int i_317_ = -i_311_ / 2;
		int i_318_ = -i_312_ / 2;
		int i_319_ = class161.method2619(i + i_317_, i_310_ + i_318_, -1983551095);
		int i_320_ = i_311_ / 2;
		int i_321_ = -i_312_ / 2;
		int i_322_ = class161.method2619(i + i_320_, i_310_ + i_321_, 398468086);
		int i_323_ = -i_311_ / 2;
		int i_324_ = i_312_ / 2;
		int i_325_ = class161.method2619(i + i_323_, i_310_ + i_324_, -111241981);
		int i_326_ = i_311_ / 2;
		int i_327_ = i_312_ / 2;
		int i_328_ = class161.method2619(i + i_326_, i_310_ + i_327_, -290948041);
		int i_329_ = i_319_ < i_322_ ? i_319_ : i_322_;
		int i_330_ = i_325_ < i_328_ ? i_325_ : i_328_;
		int i_331_ = i_322_ < i_328_ ? i_322_ : i_328_;
		int i_332_ = i_319_ < i_325_ ? i_319_ : i_325_;
		if (i_312_ != 0) {
			int i_333_ = ((int) (Math.atan2((double) (i_329_ - i_330_), (double) i_312_) * 2607.5945876176133) & 0x3fff);
			if (i_333_ != 0) {
				if (i_313_ != 0) {
					if (i_333_ > 8192) {
						int i_334_ = 16384 - i_313_;
						if (i_333_ < i_334_)
							i_333_ = i_334_;
					} else if (i_333_ > i_313_)
						i_333_ = i_313_;
				}
				method2868(i_333_);
			}
		}
		if (i_311_ != 0) {
			int i_335_ = ((int) (Math.atan2((double) (i_332_ - i_331_), (double) i_311_) * 2607.5945876176133) & 0x3fff);
			if (i_335_ != 0) {
				if (i_314_ != 0) {
					if (i_335_ > 8192) {
						int i_336_ = 16384 - i_314_;
						if (i_335_ < i_336_)
							i_335_ = i_336_;
					} else if (i_335_ > i_314_)
						i_335_ = i_314_;
				}
				method2869(i_335_);
			}
		}
		int i_337_ = i_319_ + i_328_;
		if (i_322_ + i_325_ < i_337_)
			i_337_ = i_322_ + i_325_;
		i_337_ = (i_337_ >> 1) - i_309_;
		if (i_337_ != 0)
			method3015(0, i_337_, 0);
	}

	public abstract int method2963();

	public abstract Class527_Sub8_Sub8 method2964(Class527_Sub8_Sub8 class527_sub8_sub8);

	public abstract Class527_Sub8_Sub8 method2965(Class527_Sub8_Sub8 class527_sub8_sub8);

	public abstract Class527_Sub8_Sub8 method2966(Class527_Sub8_Sub8 class527_sub8_sub8);

	public abstract void method2967();

	static float[] method2968(int i, int i_338_, int i_339_, int i_340_, float f, float f_341_, float f_342_) {
		float[] fs = new float[9];
		float[] fs_343_ = new float[9];
		float f_344_ = (float) Math.cos((double) ((float) i_340_ * 0.024543693F));
		float f_345_ = (float) Math.sin((double) ((float) i_340_ * 0.024543693F));
		float f_346_ = 1.0F - f_344_;
		fs[0] = f_344_;
		fs[1] = 0.0F;
		fs[2] = f_345_;
		fs[3] = 0.0F;
		fs[4] = 1.0F;
		fs[5] = 0.0F;
		fs[6] = -f_345_;
		fs[7] = 0.0F;
		fs[8] = f_344_;
		float[] fs_347_ = new float[9];
		float f_348_ = 1.0F;
		float f_349_ = 0.0F;
		f_344_ = (float) i_338_ / 32767.0F;
		f_345_ = -(float) Math.sqrt((double) (1.0F - f_344_ * f_344_));
		f_346_ = 1.0F - f_344_;
		float f_350_ = (float) Math.sqrt((double) (i * i + i_339_ * i_339_));
		if (f_350_ == 0.0F && f_344_ == 0.0F)
			fs_343_ = fs;
		else {
			if (f_350_ != 0.0F) {
				f_348_ = (float) -i_339_ / f_350_;
				f_349_ = (float) i / f_350_;
			}
			fs_347_[0] = f_344_ + f_348_ * f_348_ * f_346_;
			fs_347_[1] = f_349_ * f_345_;
			fs_347_[2] = f_349_ * f_348_ * f_346_;
			fs_347_[3] = -f_349_ * f_345_;
			fs_347_[4] = f_344_;
			fs_347_[5] = f_348_ * f_345_;
			fs_347_[6] = f_348_ * f_349_ * f_346_;
			fs_347_[7] = -f_348_ * f_345_;
			fs_347_[8] = f_344_ + f_349_ * f_349_ * f_346_;
			fs_343_[0] = fs[0] * fs_347_[0] + fs[1] * fs_347_[3] + fs[2] * fs_347_[6];
			fs_343_[1] = fs[0] * fs_347_[1] + fs[1] * fs_347_[4] + fs[2] * fs_347_[7];
			fs_343_[2] = fs[0] * fs_347_[2] + fs[1] * fs_347_[5] + fs[2] * fs_347_[8];
			fs_343_[3] = fs[3] * fs_347_[0] + fs[4] * fs_347_[3] + fs[5] * fs_347_[6];
			fs_343_[4] = fs[3] * fs_347_[1] + fs[4] * fs_347_[4] + fs[5] * fs_347_[7];
			fs_343_[5] = fs[3] * fs_347_[2] + fs[4] * fs_347_[5] + fs[5] * fs_347_[8];
			fs_343_[6] = fs[6] * fs_347_[0] + fs[7] * fs_347_[3] + fs[8] * fs_347_[6];
			fs_343_[7] = fs[6] * fs_347_[1] + fs[7] * fs_347_[4] + fs[8] * fs_347_[7];
			fs_343_[8] = fs[6] * fs_347_[2] + fs[7] * fs_347_[5] + fs[8] * fs_347_[8];
		}
		fs_343_[0] *= f;
		fs_343_[1] *= f;
		fs_343_[2] *= f;
		fs_343_[3] *= f_341_;
		fs_343_[4] *= f_341_;
		fs_343_[5] *= f_341_;
		fs_343_[6] *= f_342_;
		fs_343_[7] *= f_342_;
		fs_343_[8] *= f_342_;
		return fs_343_;
	}

	public abstract int method2969();

	public abstract int method2970();

	public abstract int method2971();

	public abstract int method2972();

	public abstract int method2973();

	public abstract Class167[] method2974();

	void method2975(int i, int[] is, int i_351_, int i_352_, int i_353_, int i_354_, boolean bool, int i_355_, int[] is_356_) {
		if (i_354_ == 1) {
			if (i == 0 || i == 1) {
				int i_357_ = -i_351_;
				i_351_ = i_353_;
				i_353_ = i_357_;
			} else if (i == 3) {
				int i_358_ = i_351_;
				i_351_ = i_353_;
				i_353_ = i_358_;
			} else if (i == 2) {
				int i_359_ = i_351_;
				i_351_ = -i_353_ & 0x3fff;
				i_353_ = i_359_ & 0x3fff;
			}
		} else if (i_354_ == 2) {
			if (i == 0 || i == 1) {
				i_351_ = -i_351_;
				i_353_ = -i_353_;
			} else if (i == 2) {
				i_351_ = -i_351_ & 0x3fff;
				i_353_ = -i_353_ & 0x3fff;
			}
		} else if (i_354_ == 3) {
			if (i == 0 || i == 1) {
				int i_360_ = i_351_;
				i_351_ = -i_353_;
				i_353_ = i_360_;
			} else if (i == 3) {
				int i_361_ = i_351_;
				i_351_ = i_353_;
				i_353_ = i_361_;
			} else if (i == 2) {
				int i_362_ = i_351_;
				i_351_ = i_353_ & 0x3fff;
				i_353_ = -i_362_ & 0x3fff;
			}
		}
		if (i_355_ != 65535)
			method2885(i, is, i_351_, i_352_, i_353_, bool, i_355_, is_356_);
		else
			method2884(i, is, i_351_, i_352_, i_353_, i_354_, bool);
	}

	public abstract int method2976();

	public abstract int method2977();

	public abstract int method2978();

	public abstract int method2979();

	static int method2980(float f, float f_363_, float f_364_) {
		float f_365_ = f < 0.0F ? -f : f;
		float f_366_ = f_363_ < 0.0F ? -f_363_ : f_363_;
		float f_367_ = f_364_ < 0.0F ? -f_364_ : f_364_;
		if (f_366_ > f_365_ && f_366_ > f_367_) {
			if (f_363_ > 0.0F)
				return 0;
			return 1;
		}
		if (f_367_ > f_365_ && f_367_ > f_366_) {
			if (f_364_ > 0.0F)
				return 2;
			return 3;
		}
		if (f > 0.0F)
			return 4;
		return 5;
	}

	abstract void method2981();

	public abstract int method2982();

	public abstract int method2983();

	abstract void method2984();

	public abstract int method2985();

	public abstract void method2986(int i, int i_368_, int i_369_, int i_370_);

	public abstract int method2987();

	public abstract void method2988(int i);

	public abstract int method2989();

	public abstract void method2990();

	public abstract void method2991(int i);

	static void method2992(int i, int i_371_, int i_372_, int i_373_, int i_374_, int i_375_, int i_376_, float[] fs, int i_377_, float f, float f_378_, float f_379_, float[] fs_380_) {
		i -= i_373_;
		i_371_ -= i_374_;
		i_372_ -= i_375_;
		float f_381_ = ((float) i * fs[0] + (float) i_371_ * fs[1] + (float) i_372_ * fs[2]);
		float f_382_ = ((float) i * fs[3] + (float) i_371_ * fs[4] + (float) i_372_ * fs[5]);
		float f_383_ = ((float) i * fs[6] + (float) i_371_ * fs[7] + (float) i_372_ * fs[8]);
		float f_384_;
		float f_385_;
		if (i_376_ == 0) {
			f_384_ = f_381_ + f + 0.5F;
			f_385_ = -f_383_ + f_379_ + 0.5F;
		} else if (i_376_ == 1) {
			f_384_ = f_381_ + f + 0.5F;
			f_385_ = f_383_ + f_379_ + 0.5F;
		} else if (i_376_ == 2) {
			f_384_ = -f_381_ + f + 0.5F;
			f_385_ = -f_382_ + f_378_ + 0.5F;
		} else if (i_376_ == 3) {
			f_384_ = f_381_ + f + 0.5F;
			f_385_ = -f_382_ + f_378_ + 0.5F;
		} else if (i_376_ == 4) {
			f_384_ = f_383_ + f_379_ + 0.5F;
			f_385_ = -f_382_ + f_378_ + 0.5F;
		} else {
			f_384_ = -f_383_ + f_379_ + 0.5F;
			f_385_ = -f_382_ + f_378_ + 0.5F;
		}
		if (i_377_ == 1) {
			float f_386_ = f_384_;
			f_384_ = -f_385_;
			f_385_ = f_386_;
		} else if (i_377_ == 2) {
			f_384_ = -f_384_;
			f_385_ = -f_385_;
		} else if (i_377_ == 3) {
			float f_387_ = f_384_;
			f_384_ = f_385_;
			f_385_ = -f_387_;
		}
		fs_380_[0] = f_384_;
		fs_380_[1] = f_385_;
	}

	public abstract int method2993();

	public abstract int method2994();

	public abstract int method2995();

	public abstract int method2996();

	public abstract int method2997();

	public abstract int method2998();

	public abstract byte[] method2999();

	public abstract void method3000(int i);

	public abstract byte[] method3001();

	public abstract void method3002(int i);

	public abstract void method3003(short i, short i_388_);

	public abstract void method3004(short i, short i_389_);

	public abstract void method3005(short i, short i_390_);

	public abstract void method3006(int i, int i_391_, int i_392_, int i_393_);

	public abstract void method3007(int i);

	public abstract boolean method3008();

	public abstract boolean method3009();

	public abstract boolean method3010();

	public abstract boolean method3011();

	public abstract boolean method3012();

	public abstract boolean method3013();

	public abstract boolean method3014();

	public abstract void method3015(int i, int i_394_, int i_395_);

	public abstract void method3016();

	void method3017(Class527_Sub3 class527_sub3, Class164 class164, Class164 class164_396_, int i, int i_397_, int i_398_, boolean[] bools, boolean bool, boolean bool_399_, int i_400_, int[] is) {
		if (class164_396_ == null || i == 0) {
			for (int i_401_ = 0; i_401_ < class164.anInt1828; i_401_++) {
				short i_402_ = class164.aShortArray1821[i_401_];
				if (bools == null || bools[i_402_] == bool || class527_sub3.anIntArray10367[i_402_] == 0) {
					short i_403_ = class164.aShortArray1823[i_401_];
					if (i_403_ != -1)
						method2882(0, class527_sub3.anIntArrayArray10371[i_403_], 0, 0, 0, i_398_, bool_399_, (i_400_ & class527_sub3.anIntArray10369[i_403_]), is);
					method2882(class527_sub3.anIntArray10367[i_402_], class527_sub3.anIntArrayArray10371[i_402_], class164.aShortArray1820[i_401_], class164.aShortArray1811[i_401_], class164.aShortArray1822[i_401_], i_398_, bool_399_, i_400_ & class527_sub3.anIntArray10369[i_402_], is);
				}
			}
		} else {
			int i_404_ = 0;
			int i_405_ = 0;
			for (int i_406_ = 0; i_406_ < class527_sub3.anInt10377 * -823161703; i_406_++) {
				boolean bool_407_ = false;
				if (i_404_ < class164.anInt1828 && class164.aShortArray1821[i_404_] == i_406_)
					bool_407_ = true;
				boolean bool_408_ = false;
				if (i_405_ < class164_396_.anInt1828 && class164_396_.aShortArray1821[i_405_] == i_406_)
					bool_408_ = true;
				if (bool_407_ || bool_408_) {
					if (bools != null && bools[i_406_] != bool && class527_sub3.anIntArray10367[i_406_] != 0) {
						if (bool_407_)
							i_404_++;
						if (bool_408_)
							i_405_++;
					} else {
						int i_409_ = 0;
						int i_410_ = class527_sub3.anIntArray10367[i_406_];
						if (i_410_ == 3 || i_410_ == 10)
							i_409_ = 128;
						int i_411_;
						int i_412_;
						int i_413_;
						short i_414_;
						byte i_415_;
						if (bool_407_) {
							i_411_ = class164.aShortArray1820[i_404_];
							i_412_ = class164.aShortArray1811[i_404_];
							i_413_ = class164.aShortArray1822[i_404_];
							i_414_ = class164.aShortArray1823[i_404_];
							i_415_ = class164.aByteArray1816[i_404_];
							i_404_++;
						} else {
							i_411_ = i_409_;
							i_412_ = i_409_;
							i_413_ = i_409_;
							i_414_ = (short) -1;
							i_415_ = (byte) 0;
						}
						int i_416_;
						int i_417_;
						int i_418_;
						short i_419_;
						byte i_420_;
						if (bool_408_) {
							i_416_ = class164_396_.aShortArray1820[i_405_];
							i_417_ = class164_396_.aShortArray1811[i_405_];
							i_418_ = class164_396_.aShortArray1822[i_405_];
							i_419_ = class164_396_.aShortArray1823[i_405_];
							i_420_ = class164_396_.aByteArray1816[i_405_];
							i_405_++;
						} else {
							i_416_ = i_409_;
							i_417_ = i_409_;
							i_418_ = i_409_;
							i_419_ = (short) -1;
							i_420_ = (byte) 0;
						}
						int i_421_;
						int i_422_;
						int i_423_;
						if ((i_415_ & 0x2) != 0 || (i_420_ & 0x1) != 0) {
							i_421_ = i_411_;
							i_422_ = i_412_;
							i_423_ = i_413_;
						} else if (i_410_ == 2) {
							int i_424_ = i_416_ - i_411_ & 0x3fff;
							int i_425_ = i_417_ - i_412_ & 0x3fff;
							int i_426_ = i_418_ - i_413_ & 0x3fff;
							if (i_424_ >= 8192)
								i_424_ -= 16384;
							if (i_425_ >= 8192)
								i_425_ -= 16384;
							if (i_426_ >= 8192)
								i_426_ -= 16384;
							i_421_ = i_411_ + i_424_ * i / i_397_ & 0x3fff;
							i_422_ = i_412_ + i_425_ * i / i_397_ & 0x3fff;
							i_423_ = i_413_ + i_426_ * i / i_397_ & 0x3fff;
						} else if (i_410_ == 9) {
							int i_427_ = i_416_ - i_411_ & 0x3fff;
							if (i_427_ >= 8192)
								i_427_ -= 16384;
							i_421_ = i_411_ + i_427_ * i / i_397_ & 0x3fff;
							i_423_ = 0;
							i_422_ = 0;
						} else if (i_410_ == 7) {
							int i_428_ = i_416_ - i_411_ & 0x3f;
							if (i_428_ >= 32)
								i_428_ -= 64;
							i_421_ = i_411_ + i_428_ * i / i_397_ & 0x3f;
							i_422_ = i_412_ + (i_417_ - i_412_) * i / i_397_;
							i_423_ = i_413_ + (i_418_ - i_413_) * i / i_397_;
						} else {
							i_421_ = i_411_ + (i_416_ - i_411_) * i / i_397_;
							i_422_ = i_412_ + (i_417_ - i_412_) * i / i_397_;
							i_423_ = i_413_ + (i_418_ - i_413_) * i / i_397_;
						}
						if (i_414_ != -1)
							method2882(0, (class527_sub3.anIntArrayArray10371[i_414_]), 0, 0, 0, i_398_, bool_399_, i_400_ & (class527_sub3.anIntArray10369[i_414_]), is);
						else if (i_419_ != -1)
							method2882(0, (class527_sub3.anIntArrayArray10371[i_419_]), 0, 0, 0, i_398_, bool_399_, i_400_ & (class527_sub3.anIntArray10369[i_419_]), is);
						method2882(i_410_, class527_sub3.anIntArrayArray10371[i_406_], i_421_, i_422_, i_423_, i_398_, bool_399_, (i_400_ & class527_sub3.anIntArray10369[i_406_]), is);
					}
				}
			}
		}
	}

	public abstract void method3018(int i);

	public abstract void method3019(int i);

	abstract void method3020();

	abstract boolean method3021();

	public final void method3022(Class527_Sub8_Sub16 class527_sub8_sub16, int i) {
		if (i != -1) {
			method2875();
			if (!method2883())
				method2984();
			else {
				Class164 class164 = class527_sub8_sub16.aClass164Array11818[i];
				Class527_Sub3 class527_sub3 = class164.aClass527_Sub3_1817;
				for (int i_429_ = 0; i_429_ < class164.anInt1828; i_429_++) {
					short i_430_ = class164.aShortArray1821[i_429_];
					if (class527_sub3.aBoolArray10374[i_430_]) {
						if (class164.aShortArray1823[i_429_] != -1)
							method2910(0, 0, 0, 0);
						method2910(class527_sub3.anIntArray10367[i_430_], class164.aShortArray1820[i_429_], class164.aShortArray1811[i_429_], class164.aShortArray1822[i_429_]);
					}
				}
				method2887();
				method2984();
			}
		}
	}

	public abstract int method3023();

	abstract void method3024(int i, int i_431_, int i_432_, int i_433_);

	abstract void method3025(int i, int i_434_, int i_435_, int i_436_);

	public abstract void method3026(Class432 class432, int i, boolean bool);

	public abstract void method3027(int i, int i_437_, Class161 class161, Class161 class161_438_, int i_439_, int i_440_, int i_441_);

	public abstract int method3028();

	static void method3029(int i, int i_442_, int i_443_, int i_444_, int i_445_, int i_446_, float[] fs, float f, int i_447_, float f_448_, float[] fs_449_) {
		i -= i_444_;
		i_442_ -= i_445_;
		i_443_ -= i_446_;
		float f_450_ = ((float) i * fs[0] + (float) i_442_ * fs[1] + (float) i_443_ * fs[2]);
		float f_451_ = ((float) i * fs[3] + (float) i_442_ * fs[4] + (float) i_443_ * fs[5]);
		float f_452_ = ((float) i * fs[6] + (float) i_442_ * fs[7] + (float) i_443_ * fs[8]);
		float f_453_ = (((float) Math.atan2((double) f_450_, (double) f_452_) / 6.2831855F) + 0.5F);
		if (f != 1.0F)
			f_453_ *= f;
		float f_454_ = f_451_ + 0.5F + f_448_;
		if (i_447_ == 1) {
			float f_455_ = f_453_;
			f_453_ = -f_454_;
			f_454_ = f_455_;
		} else if (i_447_ == 2) {
			f_453_ = -f_453_;
			f_454_ = -f_454_;
		} else if (i_447_ == 3) {
			float f_456_ = f_453_;
			f_453_ = f_454_;
			f_454_ = -f_456_;
		}
		fs_449_[0] = f_453_;
		fs_449_[1] = f_454_;
	}

	static void method3030(int i, int i_457_, int i_458_, int i_459_, int i_460_, int i_461_, float[] fs, int i_462_, float f, float[] fs_463_) {
		i -= i_459_;
		i_457_ -= i_460_;
		i_458_ -= i_461_;
		float f_464_ = ((float) i * fs[0] + (float) i_457_ * fs[1] + (float) i_458_ * fs[2]);
		float f_465_ = ((float) i * fs[3] + (float) i_457_ * fs[4] + (float) i_458_ * fs[5]);
		float f_466_ = ((float) i * fs[6] + (float) i_457_ * fs[7] + (float) i_458_ * fs[8]);
		float f_467_ = (float) Math.sqrt((double) (f_464_ * f_464_ + f_465_ * f_465_ + f_466_ * f_466_));
		float f_468_ = (((float) Math.atan2((double) f_464_, (double) f_466_) / 6.2831855F) + 0.5F);
		float f_469_ = ((float) Math.asin((double) (f_465_ / f_467_)) / 3.1415927F + 0.5F + f);
		if (i_462_ == 1) {
			float f_470_ = f_468_;
			f_468_ = -f_469_;
			f_469_ = f_470_;
		} else if (i_462_ == 2) {
			f_468_ = -f_468_;
			f_469_ = -f_469_;
		} else if (i_462_ == 3) {
			float f_471_ = f_468_;
			f_468_ = f_469_;
			f_469_ = -f_471_;
		}
		fs_463_[0] = f_468_;
		fs_463_[1] = f_469_;
	}

	abstract void method3031();

	static int method3032(float f, float f_472_, float f_473_) {
		float f_474_ = f < 0.0F ? -f : f;
		float f_475_ = f_472_ < 0.0F ? -f_472_ : f_472_;
		float f_476_ = f_473_ < 0.0F ? -f_473_ : f_473_;
		if (f_475_ > f_474_ && f_475_ > f_476_) {
			if (f_472_ > 0.0F)
				return 0;
			return 1;
		}
		if (f_476_ > f_474_ && f_476_ > f_475_) {
			if (f_473_ > 0.0F)
				return 2;
			return 3;
		}
		if (f > 0.0F)
			return 4;
		return 5;
	}

	static int method3033(float f, float f_477_, float f_478_) {
		float f_479_ = f < 0.0F ? -f : f;
		float f_480_ = f_477_ < 0.0F ? -f_477_ : f_477_;
		float f_481_ = f_478_ < 0.0F ? -f_478_ : f_478_;
		if (f_480_ > f_479_ && f_480_ > f_481_) {
			if (f_477_ > 0.0F)
				return 0;
			return 1;
		}
		if (f_481_ > f_479_ && f_481_ > f_480_) {
			if (f_478_ > 0.0F)
				return 2;
			return 3;
		}
		if (f > 0.0F)
			return 4;
		return 5;
	}

	abstract void method3034(int i, int[] is, int i_482_, int i_483_, int i_484_, int i_485_, boolean bool);

	public abstract boolean method3035();

	public abstract void method3036(Class176 class176_486_, int i, int i_487_, int i_488_, boolean bool);

	Class173 method3037(Class175 class175, int[] is, int i) {
		int[] is_489_ = null;
		int[] is_490_ = null;
		int[] is_491_ = null;
		float[][] fs = null;
		if (class175.aShortArray1927 != null) {
			int i_492_ = class175.anInt1926;
			int[] is_493_ = new int[i_492_];
			int[] is_494_ = new int[i_492_];
			int[] is_495_ = new int[i_492_];
			int[] is_496_ = new int[i_492_];
			int[] is_497_ = new int[i_492_];
			int[] is_498_ = new int[i_492_];
			for (int i_499_ = 0; i_499_ < i_492_; i_499_++) {
				is_493_[i_499_] = 2147483647;
				is_494_[i_499_] = -2147483647;
				is_495_[i_499_] = 2147483647;
				is_496_[i_499_] = -2147483647;
				is_497_[i_499_] = 2147483647;
				is_498_[i_499_] = -2147483647;
			}
			for (int i_500_ = 0; i_500_ < i; i_500_++) {
				int i_501_ = is[i_500_];
				short i_502_ = class175.aShortArray1927[i_501_];
				if (i_502_ > -1 && i_502_ < 32766) {
					for (int i_503_ = 0; i_503_ < 3; i_503_++) {
						short i_504_;
						if (i_503_ == 0)
							i_504_ = class175.aShortArray1918[i_501_];
						else if (i_503_ == 1)
							i_504_ = class175.aShortArray1940[i_501_];
						else
							i_504_ = class175.aShortArray1920[i_501_];
						int i_505_ = class175.anIntArray1908[i_504_];
						int i_506_ = class175.anIntArray1909[i_504_];
						int i_507_ = class175.anIntArray1910[i_504_];
						if (i_505_ < is_493_[i_502_])
							is_493_[i_502_] = i_505_;
						if (i_505_ > is_494_[i_502_])
							is_494_[i_502_] = i_505_;
						if (i_506_ < is_495_[i_502_])
							is_495_[i_502_] = i_506_;
						if (i_506_ > is_496_[i_502_])
							is_496_[i_502_] = i_506_;
						if (i_507_ < is_497_[i_502_])
							is_497_[i_502_] = i_507_;
						if (i_507_ > is_498_[i_502_])
							is_498_[i_502_] = i_507_;
					}
				}
			}
			is_489_ = new int[i_492_];
			is_490_ = new int[i_492_];
			is_491_ = new int[i_492_];
			fs = new float[i_492_][];
			for (int i_508_ = 0; i_508_ < i_492_; i_508_++) {
				byte i_509_ = class175.aByteArray1936[i_508_];
				if (i_509_ > 0) {
					is_489_[i_508_] = (is_493_[i_508_] + is_494_[i_508_]) / 2;
					is_490_[i_508_] = (is_495_[i_508_] + is_496_[i_508_]) / 2;
					is_491_[i_508_] = (is_497_[i_508_] + is_498_[i_508_]) / 2;
					float f;
					float f_510_;
					float f_511_;
					if (i_509_ == 1) {
						int i_512_ = class175.anIntArray1930[i_508_];
						if (i_512_ == 0) {
							f = 1.0F;
							f_511_ = 1.0F;
						} else if (i_512_ > 0) {
							f = 1.0F;
							f_511_ = (float) i_512_ / 1024.0F;
						} else {
							f_511_ = 1.0F;
							f = (float) -i_512_ / 1024.0F;
						}
						f_510_ = 64.0F / (float) class175.anIntArray1941[i_508_];
					} else if (i_509_ == 2) {
						f = 64.0F / (float) class175.anIntArray1930[i_508_];
						f_510_ = 64.0F / (float) class175.anIntArray1941[i_508_];
						f_511_ = 64.0F / (float) class175.anIntArray1943[i_508_];
					} else {
						f = (float) class175.anIntArray1930[i_508_] / 1024.0F;
						f_510_ = ((float) class175.anIntArray1941[i_508_] / 1024.0F);
						f_511_ = ((float) class175.anIntArray1943[i_508_] / 1024.0F);
					}
					fs[i_508_] = method2892(class175.aShortArray1937[i_508_], class175.aShortArray1938[i_508_], class175.aShortArray1939[i_508_], class175.aByteArray1946[i_508_] & 0xff, f, f_510_, f_511_);
				}
			}
		}
		return new Class173(this, is_489_, is_490_, is_491_, fs);
	}

	Class173 method3038(Class175 class175, int[] is, int i) {
		int[] is_513_ = null;
		int[] is_514_ = null;
		int[] is_515_ = null;
		float[][] fs = null;
		if (class175.aShortArray1927 != null) {
			int i_516_ = class175.anInt1926;
			int[] is_517_ = new int[i_516_];
			int[] is_518_ = new int[i_516_];
			int[] is_519_ = new int[i_516_];
			int[] is_520_ = new int[i_516_];
			int[] is_521_ = new int[i_516_];
			int[] is_522_ = new int[i_516_];
			for (int i_523_ = 0; i_523_ < i_516_; i_523_++) {
				is_517_[i_523_] = 2147483647;
				is_518_[i_523_] = -2147483647;
				is_519_[i_523_] = 2147483647;
				is_520_[i_523_] = -2147483647;
				is_521_[i_523_] = 2147483647;
				is_522_[i_523_] = -2147483647;
			}
			for (int i_524_ = 0; i_524_ < i; i_524_++) {
				int i_525_ = is[i_524_];
				short i_526_ = class175.aShortArray1927[i_525_];
				if (i_526_ > -1 && i_526_ < 32766) {
					for (int i_527_ = 0; i_527_ < 3; i_527_++) {
						short i_528_;
						if (i_527_ == 0)
							i_528_ = class175.aShortArray1918[i_525_];
						else if (i_527_ == 1)
							i_528_ = class175.aShortArray1940[i_525_];
						else
							i_528_ = class175.aShortArray1920[i_525_];
						int i_529_ = class175.anIntArray1908[i_528_];
						int i_530_ = class175.anIntArray1909[i_528_];
						int i_531_ = class175.anIntArray1910[i_528_];
						if (i_529_ < is_517_[i_526_])
							is_517_[i_526_] = i_529_;
						if (i_529_ > is_518_[i_526_])
							is_518_[i_526_] = i_529_;
						if (i_530_ < is_519_[i_526_])
							is_519_[i_526_] = i_530_;
						if (i_530_ > is_520_[i_526_])
							is_520_[i_526_] = i_530_;
						if (i_531_ < is_521_[i_526_])
							is_521_[i_526_] = i_531_;
						if (i_531_ > is_522_[i_526_])
							is_522_[i_526_] = i_531_;
					}
				}
			}
			is_513_ = new int[i_516_];
			is_514_ = new int[i_516_];
			is_515_ = new int[i_516_];
			fs = new float[i_516_][];
			for (int i_532_ = 0; i_532_ < i_516_; i_532_++) {
				byte i_533_ = class175.aByteArray1936[i_532_];
				if (i_533_ > 0) {
					is_513_[i_532_] = (is_517_[i_532_] + is_518_[i_532_]) / 2;
					is_514_[i_532_] = (is_519_[i_532_] + is_520_[i_532_]) / 2;
					is_515_[i_532_] = (is_521_[i_532_] + is_522_[i_532_]) / 2;
					float f;
					float f_534_;
					float f_535_;
					if (i_533_ == 1) {
						int i_536_ = class175.anIntArray1930[i_532_];
						if (i_536_ == 0) {
							f = 1.0F;
							f_535_ = 1.0F;
						} else if (i_536_ > 0) {
							f = 1.0F;
							f_535_ = (float) i_536_ / 1024.0F;
						} else {
							f_535_ = 1.0F;
							f = (float) -i_536_ / 1024.0F;
						}
						f_534_ = 64.0F / (float) class175.anIntArray1941[i_532_];
					} else if (i_533_ == 2) {
						f = 64.0F / (float) class175.anIntArray1930[i_532_];
						f_534_ = 64.0F / (float) class175.anIntArray1941[i_532_];
						f_535_ = 64.0F / (float) class175.anIntArray1943[i_532_];
					} else {
						f = (float) class175.anIntArray1930[i_532_] / 1024.0F;
						f_534_ = ((float) class175.anIntArray1941[i_532_] / 1024.0F);
						f_535_ = ((float) class175.anIntArray1943[i_532_] / 1024.0F);
					}
					fs[i_532_] = method2892(class175.aShortArray1937[i_532_], class175.aShortArray1938[i_532_], class175.aShortArray1939[i_532_], class175.aByteArray1946[i_532_] & 0xff, f, f_534_, f_535_);
				}
			}
		}
		return new Class173(this, is_513_, is_514_, is_515_, fs);
	}

	public abstract void method3039(int i);

	public final void method3040(Class527_Sub8_Sub16 class527_sub8_sub16, int i, Class527_Sub8_Sub16 class527_sub8_sub16_537_, int i_538_, int i_539_, int i_540_, int i_541_, int i_542_, boolean bool, int[] is) {
		if (i != -1) {
			method2875();
			if (!method2883())
				method2984();
			else {
				Class164 class164 = class527_sub8_sub16.aClass164Array11818[i];
				Class527_Sub3 class527_sub3 = class164.aClass527_Sub3_1817;
				Class164 class164_543_ = null;
				if (class527_sub8_sub16_537_ != null) {
					class164_543_ = class527_sub8_sub16_537_.aClass164Array11818[i_538_];
					if (class164_543_.aClass527_Sub3_1817 != class527_sub3)
						class164_543_ = null;
				}
				method2953(class527_sub3, class164, class164_543_, i_539_, i_540_, i_541_, null, false, bool, i_542_, is);
				method2887();
				method2984();
			}
		}
	}

	void method3041(Class161 class161, int i, int i_544_, int i_545_, int i_546_, int i_547_, int i_548_, int i_549_) {
		boolean bool = false;
		boolean bool_550_ = false;
		boolean bool_551_ = false;
		int i_552_ = -i_546_ / 2;
		int i_553_ = -i_547_ / 2;
		int i_554_ = class161.method2619(i + i_552_, i_545_ + i_553_, 834836984);
		int i_555_ = i_546_ / 2;
		int i_556_ = -i_547_ / 2;
		int i_557_ = class161.method2619(i + i_555_, i_545_ + i_556_, 1035311937);
		int i_558_ = -i_546_ / 2;
		int i_559_ = i_547_ / 2;
		int i_560_ = class161.method2619(i + i_558_, i_545_ + i_559_, -1723059671);
		int i_561_ = i_546_ / 2;
		int i_562_ = i_547_ / 2;
		int i_563_ = class161.method2619(i + i_561_, i_545_ + i_562_, 1201331137);
		int i_564_ = i_554_ < i_557_ ? i_554_ : i_557_;
		int i_565_ = i_560_ < i_563_ ? i_560_ : i_563_;
		int i_566_ = i_557_ < i_563_ ? i_557_ : i_563_;
		int i_567_ = i_554_ < i_560_ ? i_554_ : i_560_;
		if (i_547_ != 0) {
			int i_568_ = ((int) (Math.atan2((double) (i_564_ - i_565_), (double) i_547_) * 2607.5945876176133) & 0x3fff);
			if (i_568_ != 0) {
				if (i_548_ != 0) {
					if (i_568_ > 8192) {
						int i_569_ = 16384 - i_548_;
						if (i_568_ < i_569_)
							i_568_ = i_569_;
					} else if (i_568_ > i_548_)
						i_568_ = i_548_;
				}
				method2868(i_568_);
			}
		}
		if (i_546_ != 0) {
			int i_570_ = ((int) (Math.atan2((double) (i_567_ - i_566_), (double) i_546_) * 2607.5945876176133) & 0x3fff);
			if (i_570_ != 0) {
				if (i_549_ != 0) {
					if (i_570_ > 8192) {
						int i_571_ = 16384 - i_549_;
						if (i_570_ < i_571_)
							i_570_ = i_571_;
					} else if (i_570_ > i_549_)
						i_570_ = i_549_;
				}
				method2869(i_570_);
			}
		}
		int i_572_ = i_554_ + i_563_;
		if (i_557_ + i_560_ < i_572_)
			i_572_ = i_557_ + i_560_;
		i_572_ = (i_572_ >> 1) - i_544_;
		if (i_572_ != 0)
			method3015(0, i_572_, 0);
	}

	abstract boolean method3042();

	public abstract Class176 method3043(byte i, int i_573_, boolean bool);

	void method3044(Class161 class161, int i, int i_574_, int i_575_, int i_576_, int i_577_, int i_578_, int i_579_) {
		boolean bool = false;
		boolean bool_580_ = false;
		boolean bool_581_ = false;
		int i_582_ = -i_576_ / 2;
		int i_583_ = -i_577_ / 2;
		int i_584_ = class161.method2619(i + i_582_, i_575_ + i_583_, -1382105035);
		int i_585_ = i_576_ / 2;
		int i_586_ = -i_577_ / 2;
		int i_587_ = class161.method2619(i + i_585_, i_575_ + i_586_, -462610220);
		int i_588_ = -i_576_ / 2;
		int i_589_ = i_577_ / 2;
		int i_590_ = class161.method2619(i + i_588_, i_575_ + i_589_, 1455040777);
		int i_591_ = i_576_ / 2;
		int i_592_ = i_577_ / 2;
		int i_593_ = class161.method2619(i + i_591_, i_575_ + i_592_, -312792861);
		int i_594_ = i_584_ < i_587_ ? i_584_ : i_587_;
		int i_595_ = i_590_ < i_593_ ? i_590_ : i_593_;
		int i_596_ = i_587_ < i_593_ ? i_587_ : i_593_;
		int i_597_ = i_584_ < i_590_ ? i_584_ : i_590_;
		if (i_577_ != 0) {
			int i_598_ = ((int) (Math.atan2((double) (i_594_ - i_595_), (double) i_577_) * 2607.5945876176133) & 0x3fff);
			if (i_598_ != 0) {
				if (i_578_ != 0) {
					if (i_598_ > 8192) {
						int i_599_ = 16384 - i_578_;
						if (i_598_ < i_599_)
							i_598_ = i_599_;
					} else if (i_598_ > i_578_)
						i_598_ = i_578_;
				}
				method2868(i_598_);
			}
		}
		if (i_576_ != 0) {
			int i_600_ = ((int) (Math.atan2((double) (i_597_ - i_596_), (double) i_576_) * 2607.5945876176133) & 0x3fff);
			if (i_600_ != 0) {
				if (i_579_ != 0) {
					if (i_600_ > 8192) {
						int i_601_ = 16384 - i_579_;
						if (i_600_ < i_601_)
							i_600_ = i_601_;
					} else if (i_600_ > i_579_)
						i_600_ = i_579_;
				}
				method2869(i_600_);
			}
		}
		int i_602_ = i_584_ + i_593_;
		if (i_587_ + i_590_ < i_602_)
			i_602_ = i_587_ + i_590_;
		i_602_ = (i_602_ >> 1) - i_574_;
		if (i_602_ != 0)
			method3015(0, i_602_, 0);
	}

	public final void method3045(Class527_Sub8_Sub16 class527_sub8_sub16, int i, Class527_Sub8_Sub16 class527_sub8_sub16_603_, int i_604_, int i_605_, int i_606_, int i_607_, int i_608_, boolean bool, int[] is) {
		if (i != -1) {
			method2875();
			if (!method2883())
				method2984();
			else {
				Class164 class164 = class527_sub8_sub16.aClass164Array11818[i];
				Class527_Sub3 class527_sub3 = class164.aClass527_Sub3_1817;
				Class164 class164_609_ = null;
				if (class527_sub8_sub16_603_ != null) {
					class164_609_ = class527_sub8_sub16_603_.aClass164Array11818[i_604_];
					if (class164_609_.aClass527_Sub3_1817 != class527_sub3)
						class164_609_ = null;
				}
				method2953(class527_sub3, class164, class164_609_, i_605_, i_606_, i_607_, null, false, bool, i_608_, is);
				method2887();
				method2984();
			}
		}
	}

	public final void method3046(Class527_Sub8_Sub16 class527_sub8_sub16, int i, Class527_Sub8_Sub16 class527_sub8_sub16_610_, int i_611_, int i_612_, int i_613_, Class527_Sub8_Sub16 class527_sub8_sub16_614_, int i_615_, Class527_Sub8_Sub16 class527_sub8_sub16_616_, int i_617_, int i_618_, int i_619_, boolean[] bools, boolean bool) {
		if (i != -1) {
			if (bools == null || i_615_ == -1)
				method2877(class527_sub8_sub16, i, class527_sub8_sub16_610_, i_611_, i_612_, i_613_, 0, bool);
			else {
				method2875();
				if (!method2883())
					method2984();
				else {
					Class164 class164 = class527_sub8_sub16.aClass164Array11818[i];
					Class527_Sub3 class527_sub3 = class164.aClass527_Sub3_1817;
					Class164 class164_620_ = null;
					if (class527_sub8_sub16_610_ != null) {
						class164_620_ = (class527_sub8_sub16_610_.aClass164Array11818[i_611_]);
						if (class164_620_.aClass527_Sub3_1817 != class527_sub3)
							class164_620_ = null;
					}
					method2953(class527_sub3, class164, class164_620_, i_612_, i_613_, 0, bools, false, bool, 65535, null);
					Class164 class164_621_ = class527_sub8_sub16_614_.aClass164Array11818[i_615_];
					Class164 class164_622_ = null;
					if (class527_sub8_sub16_616_ != null) {
						class164_622_ = (class527_sub8_sub16_616_.aClass164Array11818[i_617_]);
						if (class164_622_.aClass527_Sub3_1817 != class527_sub3)
							class164_622_ = null;
					}
					method2884(0, new int[0], 0, 0, 0, 0, bool);
					method2953(class164_621_.aClass527_Sub3_1817, class164_621_, class164_622_, i_618_, i_619_, 0, bools, true, bool, 65535, null);
					method2887();
					method2984();
				}
			}
		}
	}

	public final void method3047(Class527_Sub8_Sub16 class527_sub8_sub16, int i, Class527_Sub8_Sub16 class527_sub8_sub16_623_, int i_624_, int i_625_, int i_626_, Class527_Sub8_Sub16 class527_sub8_sub16_627_, int i_628_, Class527_Sub8_Sub16 class527_sub8_sub16_629_, int i_630_, int i_631_, int i_632_, boolean[] bools, boolean bool) {
		if (i != -1) {
			if (bools == null || i_628_ == -1)
				method2877(class527_sub8_sub16, i, class527_sub8_sub16_623_, i_624_, i_625_, i_626_, 0, bool);
			else {
				method2875();
				if (!method2883())
					method2984();
				else {
					Class164 class164 = class527_sub8_sub16.aClass164Array11818[i];
					Class527_Sub3 class527_sub3 = class164.aClass527_Sub3_1817;
					Class164 class164_633_ = null;
					if (class527_sub8_sub16_623_ != null) {
						class164_633_ = (class527_sub8_sub16_623_.aClass164Array11818[i_624_]);
						if (class164_633_.aClass527_Sub3_1817 != class527_sub3)
							class164_633_ = null;
					}
					method2953(class527_sub3, class164, class164_633_, i_625_, i_626_, 0, bools, false, bool, 65535, null);
					Class164 class164_634_ = class527_sub8_sub16_627_.aClass164Array11818[i_628_];
					Class164 class164_635_ = null;
					if (class527_sub8_sub16_629_ != null) {
						class164_635_ = (class527_sub8_sub16_629_.aClass164Array11818[i_630_]);
						if (class164_635_.aClass527_Sub3_1817 != class527_sub3)
							class164_635_ = null;
					}
					method2884(0, new int[0], 0, 0, 0, 0, bool);
					method2953(class164_634_.aClass527_Sub3_1817, class164_634_, class164_635_, i_631_, i_632_, 0, bools, true, bool, 65535, null);
					method2887();
					method2984();
				}
			}
		}
	}

	public final void method3048(Class527_Sub8_Sub16 class527_sub8_sub16, int i) {
		if (i != -1) {
			method2875();
			if (!method2883())
				method2984();
			else {
				Class164 class164 = class527_sub8_sub16.aClass164Array11818[i];
				Class527_Sub3 class527_sub3 = class164.aClass527_Sub3_1817;
				for (int i_636_ = 0; i_636_ < class164.anInt1828; i_636_++) {
					short i_637_ = class164.aShortArray1821[i_636_];
					if (class527_sub3.aBoolArray10374[i_637_]) {
						if (class164.aShortArray1823[i_636_] != -1)
							method2910(0, 0, 0, 0);
						method2910(class527_sub3.anIntArray10367[i_637_], class164.aShortArray1820[i_636_], class164.aShortArray1811[i_636_], class164.aShortArray1822[i_636_]);
					}
				}
				method2887();
				method2984();
			}
		}
	}

	public final void method3049(Class527_Sub8_Sub16 class527_sub8_sub16, int i) {
		if (i != -1) {
			method2875();
			if (!method2883())
				method2984();
			else {
				Class164 class164 = class527_sub8_sub16.aClass164Array11818[i];
				Class527_Sub3 class527_sub3 = class164.aClass527_Sub3_1817;
				for (int i_638_ = 0; i_638_ < class164.anInt1828; i_638_++) {
					short i_639_ = class164.aShortArray1821[i_638_];
					if (class527_sub3.aBoolArray10374[i_639_]) {
						if (class164.aShortArray1823[i_638_] != -1)
							method2910(0, 0, 0, 0);
						method2910(class527_sub3.anIntArray10367[i_639_], class164.aShortArray1820[i_638_], class164.aShortArray1811[i_638_], class164.aShortArray1822[i_638_]);
					}
				}
				method2887();
				method2984();
			}
		}
	}

	public final void method3050(Class527_Sub8_Sub16 class527_sub8_sub16, int i) {
		if (i != -1) {
			method2875();
			if (!method2883())
				method2984();
			else {
				Class164 class164 = class527_sub8_sub16.aClass164Array11818[i];
				Class527_Sub3 class527_sub3 = class164.aClass527_Sub3_1817;
				for (int i_640_ = 0; i_640_ < class164.anInt1828; i_640_++) {
					short i_641_ = class164.aShortArray1821[i_640_];
					if (class527_sub3.aBoolArray10374[i_641_]) {
						if (class164.aShortArray1823[i_640_] != -1)
							method2910(0, 0, 0, 0);
						method2910(class527_sub3.anIntArray10367[i_641_], class164.aShortArray1820[i_640_], class164.aShortArray1811[i_640_], class164.aShortArray1822[i_640_]);
					}
				}
				method2887();
				method2984();
			}
		}
	}

	public abstract boolean method3051(int i, int i_642_, Class432 class432, boolean bool, int i_643_);

	Class173 method3052(Class175 class175, int[] is, int i) {
		int[] is_644_ = null;
		int[] is_645_ = null;
		int[] is_646_ = null;
		float[][] fs = null;
		if (class175.aShortArray1927 != null) {
			int i_647_ = class175.anInt1926;
			int[] is_648_ = new int[i_647_];
			int[] is_649_ = new int[i_647_];
			int[] is_650_ = new int[i_647_];
			int[] is_651_ = new int[i_647_];
			int[] is_652_ = new int[i_647_];
			int[] is_653_ = new int[i_647_];
			for (int i_654_ = 0; i_654_ < i_647_; i_654_++) {
				is_648_[i_654_] = 2147483647;
				is_649_[i_654_] = -2147483647;
				is_650_[i_654_] = 2147483647;
				is_651_[i_654_] = -2147483647;
				is_652_[i_654_] = 2147483647;
				is_653_[i_654_] = -2147483647;
			}
			for (int i_655_ = 0; i_655_ < i; i_655_++) {
				int i_656_ = is[i_655_];
				short i_657_ = class175.aShortArray1927[i_656_];
				if (i_657_ > -1 && i_657_ < 32766) {
					for (int i_658_ = 0; i_658_ < 3; i_658_++) {
						short i_659_;
						if (i_658_ == 0)
							i_659_ = class175.aShortArray1918[i_656_];
						else if (i_658_ == 1)
							i_659_ = class175.aShortArray1940[i_656_];
						else
							i_659_ = class175.aShortArray1920[i_656_];
						int i_660_ = class175.anIntArray1908[i_659_];
						int i_661_ = class175.anIntArray1909[i_659_];
						int i_662_ = class175.anIntArray1910[i_659_];
						if (i_660_ < is_648_[i_657_])
							is_648_[i_657_] = i_660_;
						if (i_660_ > is_649_[i_657_])
							is_649_[i_657_] = i_660_;
						if (i_661_ < is_650_[i_657_])
							is_650_[i_657_] = i_661_;
						if (i_661_ > is_651_[i_657_])
							is_651_[i_657_] = i_661_;
						if (i_662_ < is_652_[i_657_])
							is_652_[i_657_] = i_662_;
						if (i_662_ > is_653_[i_657_])
							is_653_[i_657_] = i_662_;
					}
				}
			}
			is_644_ = new int[i_647_];
			is_645_ = new int[i_647_];
			is_646_ = new int[i_647_];
			fs = new float[i_647_][];
			for (int i_663_ = 0; i_663_ < i_647_; i_663_++) {
				byte i_664_ = class175.aByteArray1936[i_663_];
				if (i_664_ > 0) {
					is_644_[i_663_] = (is_648_[i_663_] + is_649_[i_663_]) / 2;
					is_645_[i_663_] = (is_650_[i_663_] + is_651_[i_663_]) / 2;
					is_646_[i_663_] = (is_652_[i_663_] + is_653_[i_663_]) / 2;
					float f;
					float f_665_;
					float f_666_;
					if (i_664_ == 1) {
						int i_667_ = class175.anIntArray1930[i_663_];
						if (i_667_ == 0) {
							f = 1.0F;
							f_666_ = 1.0F;
						} else if (i_667_ > 0) {
							f = 1.0F;
							f_666_ = (float) i_667_ / 1024.0F;
						} else {
							f_666_ = 1.0F;
							f = (float) -i_667_ / 1024.0F;
						}
						f_665_ = 64.0F / (float) class175.anIntArray1941[i_663_];
					} else if (i_664_ == 2) {
						f = 64.0F / (float) class175.anIntArray1930[i_663_];
						f_665_ = 64.0F / (float) class175.anIntArray1941[i_663_];
						f_666_ = 64.0F / (float) class175.anIntArray1943[i_663_];
					} else {
						f = (float) class175.anIntArray1930[i_663_] / 1024.0F;
						f_665_ = ((float) class175.anIntArray1941[i_663_] / 1024.0F);
						f_666_ = ((float) class175.anIntArray1943[i_663_] / 1024.0F);
					}
					fs[i_663_] = method2892(class175.aShortArray1937[i_663_], class175.aShortArray1938[i_663_], class175.aShortArray1939[i_663_], class175.aByteArray1946[i_663_] & 0xff, f, f_665_, f_666_);
				}
			}
		}
		return new Class173(this, is_644_, is_645_, is_646_, fs);
	}

	public abstract int method3053();

	public abstract int method3054();

	public abstract int method3055();
}
