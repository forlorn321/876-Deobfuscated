/* Class147_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class147_Sub1 extends Class147 {
	Class180_Sub1 aClass180_Sub1_8876;
	int anInt8877;
	int anInt8878;
	int anInt8879;
	int anInt8880;
	static int anInt8881;
	int anInt8882;
	int[] anIntArray8883;
	static final int anInt8884 = 4;
	static int anInt8885;
	static int anInt8886;
	static int anInt8887;
	static int anInt8888;
	static final int anInt8889 = 8;
	static int anInt8890;
	static int anInt8891;
	static int anInt8892;
	static int anInt8893;
	static int anInt8894;
	int anInt8895;
	static final int anInt8896 = 12;
	static int anInt8897;
	static int anInt8898;
	static int anInt8899;
	static int anInt8900;
	static int anInt8901;
	static int anInt8902;
	static int anInt8903;
	static int anInt8904 = 0;
	static int anInt8905 = 0;
	static int anInt8906 = 0;
	static int anInt8907 = 0;
	static int anInt8908 = 0;
	static int anInt8909;
	static int anInt8910;
	static int anInt8911;

	void method2457(float f, float f_0_, float f_1_, float f_2_, float f_3_, float f_4_, int i, int i_5_, int i_6_, int i_7_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		if (method14431(f, f_0_, f_1_, f_2_, f_3_, f_4_)) {
			anInt8894 = i_5_;
			if (i != 1) {
				anInt8904 = i_5_ >>> 24;
				anInt8905 = 256 - anInt8904;
				if (i == 0) {
					anInt8906 = (i_5_ & 0xff0000) >> 16;
					anInt8907 = (i_5_ & 0xff00) >> 8;
					anInt8908 = i_5_ & 0xff;
				} else if (i == 2) {
					anInt8901 = i_5_ >>> 24;
					anInt8910 = 256 - anInt8901;
					int i_8_ = (i_5_ & 0xff00ff) * anInt8910 & ~0xff00ff;
					int i_9_ = (i_5_ & 0xff00) * anInt8910 & 0xff0000;
					anInt8911 = (i_8_ | i_9_) >>> 8;
				}
			}
			method14425(i, i_6_);
		}
	}

	public void method2405(int i, int i_10_, int i_11_, int i_12_) {
		anInt8879 = i;
		anInt8895 = i_10_;
		anInt8878 = i_11_;
		anInt8882 = i_12_;
	}

	public void method2482(int[] is) {
		is[0] = anInt8879;
		is[1] = anInt8895;
		is[2] = anInt8878;
		is[3] = anInt8882;
	}

	public int method2407() {
		return anInt8877;
	}

	public int method40() {
		return anInt8879 + anInt8877 + anInt8878;
	}

	public int method42() {
		return anInt8879 + anInt8877 + anInt8878;
	}

	public int method2410() {
		return anInt8895 + anInt8880 + anInt8882;
	}

	Class147_Sub1(Class180_Sub1 class180_sub1, int i, int i_13_) {
		aClass180_Sub1_8876 = class180_sub1;
		anInt8877 = i;
		anInt8880 = i_13_;
	}

	public abstract void method2416(int i, int i_14_, int i_15_, int i_16_, int i_17_);

	public abstract void method2465(int i, int i_18_, Class142 class142, int i_19_, int i_20_);

	abstract void method14425(int i, int i_21_);

	public abstract void method2434(int i, int i_22_, int i_23_, int i_24_, int[] is, int i_25_, int i_26_);

	public void method2422(int i, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		if (anIntArray8883 == null)
			anIntArray8883 = new int[4];
		aClass180_Sub1_8876.method3135(anIntArray8883);
		aClass180_Sub1_8876.method3138((aClass180_Sub1_8876.anInt9383 * 1605202751), (aClass180_Sub1_8876.anInt9392 * -456655989), i + i_28_, i_27_ + i_29_);
		int i_33_ = method42();
		int i_34_ = method2410();
		int i_35_ = (i_28_ + i_33_ - 1) / i_33_;
		int i_36_ = (i_29_ + i_34_ - 1) / i_34_;
		for (int i_37_ = 0; i_37_ < i_36_; i_37_++) {
			int i_38_ = i_37_ * i_34_;
			for (int i_39_ = 0; i_39_ < i_35_; i_39_++)
				method2416(i + i_39_ * i_33_, i_27_ + i_38_, i_30_, i_31_, i_32_);
		}
		aClass180_Sub1_8876.method3132(anIntArray8883[0], anIntArray8883[1], anIntArray8883[2], anIntArray8883[3]);
	}

	public void method2478(int i, int i_40_, int i_41_, int i_42_) {
		anInt8879 = i;
		anInt8895 = i_40_;
		anInt8878 = i_41_;
		anInt8882 = i_42_;
	}

	void method2430(float f, float f_43_, float f_44_, float f_45_, float f_46_, float f_47_, int i, int i_48_, int i_49_, int i_50_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		if (method14431(f, f_43_, f_44_, f_45_, f_46_, f_47_)) {
			anInt8894 = i_48_;
			if (i != 1) {
				anInt8904 = i_48_ >>> 24;
				anInt8905 = 256 - anInt8904;
				if (i == 0) {
					anInt8906 = (i_48_ & 0xff0000) >> 16;
					anInt8907 = (i_48_ & 0xff00) >> 8;
					anInt8908 = i_48_ & 0xff;
				} else if (i == 2) {
					anInt8901 = i_48_ >>> 24;
					anInt8910 = 256 - anInt8901;
					int i_51_ = (i_48_ & 0xff00ff) * anInt8910 & ~0xff00ff;
					int i_52_ = (i_48_ & 0xff00) * anInt8910 & 0xff0000;
					anInt8911 = (i_51_ | i_52_) >>> 8;
				}
			}
			method14425(i, i_49_);
		}
	}

	void method2408(float f, float f_53_, float f_54_, float f_55_, float f_56_, float f_57_, int i, int i_58_, int i_59_, int i_60_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		if (method14431(f, f_53_, f_54_, f_55_, f_56_, f_57_)) {
			anInt8894 = i_58_;
			if (i != 1) {
				anInt8904 = i_58_ >>> 24;
				anInt8905 = 256 - anInt8904;
				if (i == 0) {
					anInt8906 = (i_58_ & 0xff0000) >> 16;
					anInt8907 = (i_58_ & 0xff00) >> 8;
					anInt8908 = i_58_ & 0xff;
				} else if (i == 2) {
					anInt8901 = i_58_ >>> 24;
					anInt8910 = 256 - anInt8901;
					int i_61_ = (i_58_ & 0xff00ff) * anInt8910 & ~0xff00ff;
					int i_62_ = (i_58_ & 0xff00) * anInt8910 & 0xff0000;
					anInt8911 = (i_61_ | i_62_) >>> 8;
				}
			}
			method14425(i, i_59_);
		}
	}

	public void method2446(int[] is) {
		is[0] = anInt8879;
		is[1] = anInt8895;
		is[2] = anInt8878;
		is[3] = anInt8882;
	}

	abstract void method14426(int[] is, int[] is_63_, int i, int i_64_);

	abstract void method2420(int i, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_);

	void method2432(float f, float f_72_, float f_73_, float f_74_, float f_75_, float f_76_, int i, Class142 class142, int i_77_, int i_78_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		if (method14431(f, f_72_, f_73_, f_74_, f_75_, f_76_)) {
			Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
			method14426(class142_sub1.anIntArray9002, class142_sub1.anIntArray9003, anInt8887 - i_77_, -i_78_ - (anInt8903 - anInt8891));
		}
	}

	public abstract void method2433(int i, int i_79_, int i_80_, int i_81_, int[] is, int i_82_, int i_83_);

	abstract void method2472(int i, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_);

	public abstract void method2438(int i, int i_91_, Class142 class142, int i_92_, int i_93_);

	abstract void method2439(int i, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_);

	public int method2452() {
		return anInt8895 + anInt8880 + anInt8882;
	}

	abstract void method14427(boolean bool, boolean bool_101_, boolean bool_102_, int i, int i_103_, float f, int i_104_, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_, boolean bool_110_);

	abstract void method14428(int i, int i_111_);

	abstract void method14429(int[] is, int[] is_112_, int i, int i_113_);

	public int method44() {
		return anInt8879 + anInt8877 + anInt8878;
	}

	public void method2417(int i, int i_114_, int i_115_, int i_116_) {
		anInt8879 = i;
		anInt8895 = i_114_;
		anInt8878 = i_115_;
		anInt8882 = i_116_;
	}

	static {
		anInt8901 = 0;
		anInt8910 = 0;
		anInt8911 = 0;
	}

	public void method2447(int[] is) {
		is[0] = anInt8879;
		is[1] = anInt8895;
		is[2] = anInt8878;
		is[3] = anInt8882;
	}

	public int method2448() {
		return anInt8877;
	}

	public int method2460() {
		return anInt8877;
	}

	public int method41() {
		return anInt8879 + anInt8877 + anInt8878;
	}

	abstract void method14430(boolean bool, boolean bool_117_, boolean bool_118_, int i, int i_119_, float f, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_, boolean bool_126_);

	public int method43() {
		return anInt8879 + anInt8877 + anInt8878;
	}

	boolean method14431(float f, float f_127_, float f_128_, float f_129_, float f_130_, float f_131_) {
		int i = anInt8879 + anInt8877 + anInt8878;
		int i_132_ = anInt8895 + anInt8880 + anInt8882;
		if (i != anInt8877 || i_132_ != anInt8880) {
			float f_133_ = (f_128_ - f) / (float) i;
			float f_134_ = (f_129_ - f_127_) / (float) i;
			float f_135_ = (f_130_ - f) / (float) i_132_;
			float f_136_ = (f_131_ - f_127_) / (float) i_132_;
			float f_137_ = f_135_ * (float) anInt8895;
			float f_138_ = f_136_ * (float) anInt8895;
			float f_139_ = f_133_ * (float) anInt8879;
			float f_140_ = f_134_ * (float) anInt8879;
			float f_141_ = -f_133_ * (float) anInt8878;
			float f_142_ = -f_134_ * (float) anInt8878;
			float f_143_ = -f_135_ * (float) anInt8882;
			float f_144_ = -f_136_ * (float) anInt8882;
			f += f_139_ + f_137_;
			f_127_ += f_140_ + f_138_;
			f_128_ += f_141_ + f_137_;
			f_129_ += f_142_ + f_138_;
			f_130_ += f_139_ + f_143_;
			f_131_ += f_140_ + f_144_;
		}
		float f_145_ = f_130_ + (f_128_ - f);
		float f_146_ = f_129_ + (f_131_ - f_127_);
		float f_147_;
		float f_148_;
		if (f < f_128_) {
			f_147_ = f;
			f_148_ = f_128_;
		} else {
			f_147_ = f_128_;
			f_148_ = f;
		}
		if (f_130_ < f_147_)
			f_147_ = f_130_;
		if (f_145_ < f_147_)
			f_147_ = f_145_;
		if (f_130_ > f_148_)
			f_148_ = f_130_;
		if (f_145_ > f_148_)
			f_148_ = f_145_;
		float f_149_;
		float f_150_;
		if (f_127_ < f_129_) {
			f_149_ = f_127_;
			f_150_ = f_129_;
		} else {
			f_149_ = f_129_;
			f_150_ = f_127_;
		}
		if (f_131_ < f_149_)
			f_149_ = f_131_;
		if (f_146_ < f_149_)
			f_149_ = f_146_;
		if (f_131_ > f_150_)
			f_150_ = f_131_;
		if (f_146_ > f_150_)
			f_150_ = f_146_;
		if (f_147_ < (float) (aClass180_Sub1_8876.anInt9383 * 1605202751))
			f_147_ = (float) (aClass180_Sub1_8876.anInt9383 * 1605202751);
		if (f_148_ > (float) (aClass180_Sub1_8876.anInt9391 * 2014358275))
			f_148_ = (float) (aClass180_Sub1_8876.anInt9391 * 2014358275);
		if (f_149_ < (float) (aClass180_Sub1_8876.anInt9392 * -456655989))
			f_149_ = (float) (aClass180_Sub1_8876.anInt9392 * -456655989);
		if (f_150_ > (float) (aClass180_Sub1_8876.anInt9393 * -383695469))
			f_150_ = (float) (aClass180_Sub1_8876.anInt9393 * -383695469);
		f_148_ = f_147_ - f_148_;
		if (f_148_ >= 0.0F)
			return false;
		f_150_ = f_149_ - f_150_;
		if (f_150_ >= 0.0F)
			return false;
		anInt8886 = aClass180_Sub1_8876.anInt9387 * -1173855569;
		anInt8892 = (int) ((float) ((int) f_149_ * anInt8886) + f_147_);
		float f_151_ = ((f_128_ - f) * (f_131_ - f_127_) - (f_129_ - f_127_) * (f_130_ - f));
		float f_152_ = ((f_130_ - f) * (f_129_ - f_127_) - (f_131_ - f_127_) * (f_128_ - f));
		anInt8893 = (int) ((f_131_ - f_127_) * 4096.0F * (float) anInt8877 / f_151_);
		anInt8909 = (int) ((f_129_ - f_127_) * 4096.0F * (float) anInt8880 / f_152_);
		anInt8881 = (int) ((f_130_ - f) * 4096.0F * (float) anInt8877 / f_152_);
		anInt8885 = (int) ((f_128_ - f) * 4096.0F * (float) anInt8880 / f_151_);
		anInt8897 = (int) (f_147_ * 16.0F + 8.0F - (f + f_128_ + f_130_ + f_145_) / 4.0F * 16.0F);
		anInt8898 = (int) (f_149_ * 16.0F + 8.0F - (f_127_ + f_129_ + f_131_ + f_146_) / 4.0F * 16.0F);
		anInt8899 = (anInt8877 >> 1 << 12) + (anInt8898 * anInt8881 >> 4);
		anInt8900 = (anInt8880 >> 1 << 12) + (anInt8898 * anInt8885 >> 4);
		anInt8890 = anInt8897 * anInt8893 >> 4;
		anInt8902 = anInt8897 * anInt8909 >> 4;
		anInt8887 = (int) f_147_;
		anInt8888 = (int) f_148_;
		anInt8891 = (int) f_149_;
		anInt8903 = (int) f_150_;
		return true;
	}

	public int method2431() {
		return anInt8895 + anInt8880 + anInt8882;
	}

	public abstract void method2444(int i, int i_153_, int i_154_, int i_155_, int[] is, int i_156_, int i_157_);

	public abstract void method2453(int i, int i_158_, int i_159_, int i_160_, int i_161_);

	public void method2409(int i, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_, int i_167_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		if (anIntArray8883 == null)
			anIntArray8883 = new int[4];
		aClass180_Sub1_8876.method3135(anIntArray8883);
		aClass180_Sub1_8876.method3138((aClass180_Sub1_8876.anInt9383 * 1605202751), (aClass180_Sub1_8876.anInt9392 * -456655989), i + i_163_, i_162_ + i_164_);
		int i_168_ = method42();
		int i_169_ = method2410();
		int i_170_ = (i_163_ + i_168_ - 1) / i_168_;
		int i_171_ = (i_164_ + i_169_ - 1) / i_169_;
		for (int i_172_ = 0; i_172_ < i_171_; i_172_++) {
			int i_173_ = i_172_ * i_169_;
			for (int i_174_ = 0; i_174_ < i_170_; i_174_++)
				method2416(i + i_174_ * i_168_, i_162_ + i_173_, i_165_, i_166_, i_167_);
		}
		aClass180_Sub1_8876.method3132(anIntArray8883[0], anIntArray8883[1], anIntArray8883[2], anIntArray8883[3]);
	}

	public void method2455(int i, int i_175_, int i_176_, int i_177_, int i_178_, int i_179_, int i_180_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		if (anIntArray8883 == null)
			anIntArray8883 = new int[4];
		aClass180_Sub1_8876.method3135(anIntArray8883);
		aClass180_Sub1_8876.method3138((aClass180_Sub1_8876.anInt9383 * 1605202751), (aClass180_Sub1_8876.anInt9392 * -456655989), i + i_176_, i_175_ + i_177_);
		int i_181_ = method42();
		int i_182_ = method2410();
		int i_183_ = (i_176_ + i_181_ - 1) / i_181_;
		int i_184_ = (i_177_ + i_182_ - 1) / i_182_;
		for (int i_185_ = 0; i_185_ < i_184_; i_185_++) {
			int i_186_ = i_185_ * i_182_;
			for (int i_187_ = 0; i_187_ < i_183_; i_187_++)
				method2416(i + i_187_ * i_181_, i_175_ + i_186_, i_178_, i_179_, i_180_);
		}
		aClass180_Sub1_8876.method3132(anIntArray8883[0], anIntArray8883[1], anIntArray8883[2], anIntArray8883[3]);
	}

	public void method2456(int i, int i_188_, int i_189_, int i_190_, int i_191_, int i_192_, int i_193_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		if (anIntArray8883 == null)
			anIntArray8883 = new int[4];
		aClass180_Sub1_8876.method3135(anIntArray8883);
		aClass180_Sub1_8876.method3138((aClass180_Sub1_8876.anInt9383 * 1605202751), (aClass180_Sub1_8876.anInt9392 * -456655989), i + i_189_, i_188_ + i_190_);
		int i_194_ = method42();
		int i_195_ = method2410();
		int i_196_ = (i_189_ + i_194_ - 1) / i_194_;
		int i_197_ = (i_190_ + i_195_ - 1) / i_195_;
		for (int i_198_ = 0; i_198_ < i_197_; i_198_++) {
			int i_199_ = i_198_ * i_195_;
			for (int i_200_ = 0; i_200_ < i_196_; i_200_++)
				method2416(i + i_200_ * i_194_, i_188_ + i_199_, i_191_, i_192_, i_193_);
		}
		aClass180_Sub1_8876.method3132(anIntArray8883[0], anIntArray8883[1], anIntArray8883[2], anIntArray8883[3]);
	}

	boolean method14432(float f, float f_201_, float f_202_, float f_203_, float f_204_, float f_205_) {
		int i = anInt8879 + anInt8877 + anInt8878;
		int i_206_ = anInt8895 + anInt8880 + anInt8882;
		if (i != anInt8877 || i_206_ != anInt8880) {
			float f_207_ = (f_202_ - f) / (float) i;
			float f_208_ = (f_203_ - f_201_) / (float) i;
			float f_209_ = (f_204_ - f) / (float) i_206_;
			float f_210_ = (f_205_ - f_201_) / (float) i_206_;
			float f_211_ = f_209_ * (float) anInt8895;
			float f_212_ = f_210_ * (float) anInt8895;
			float f_213_ = f_207_ * (float) anInt8879;
			float f_214_ = f_208_ * (float) anInt8879;
			float f_215_ = -f_207_ * (float) anInt8878;
			float f_216_ = -f_208_ * (float) anInt8878;
			float f_217_ = -f_209_ * (float) anInt8882;
			float f_218_ = -f_210_ * (float) anInt8882;
			f += f_213_ + f_211_;
			f_201_ += f_214_ + f_212_;
			f_202_ += f_215_ + f_211_;
			f_203_ += f_216_ + f_212_;
			f_204_ += f_213_ + f_217_;
			f_205_ += f_214_ + f_218_;
		}
		float f_219_ = f_204_ + (f_202_ - f);
		float f_220_ = f_203_ + (f_205_ - f_201_);
		float f_221_;
		float f_222_;
		if (f < f_202_) {
			f_221_ = f;
			f_222_ = f_202_;
		} else {
			f_221_ = f_202_;
			f_222_ = f;
		}
		if (f_204_ < f_221_)
			f_221_ = f_204_;
		if (f_219_ < f_221_)
			f_221_ = f_219_;
		if (f_204_ > f_222_)
			f_222_ = f_204_;
		if (f_219_ > f_222_)
			f_222_ = f_219_;
		float f_223_;
		float f_224_;
		if (f_201_ < f_203_) {
			f_223_ = f_201_;
			f_224_ = f_203_;
		} else {
			f_223_ = f_203_;
			f_224_ = f_201_;
		}
		if (f_205_ < f_223_)
			f_223_ = f_205_;
		if (f_220_ < f_223_)
			f_223_ = f_220_;
		if (f_205_ > f_224_)
			f_224_ = f_205_;
		if (f_220_ > f_224_)
			f_224_ = f_220_;
		if (f_221_ < (float) (aClass180_Sub1_8876.anInt9383 * 1605202751))
			f_221_ = (float) (aClass180_Sub1_8876.anInt9383 * 1605202751);
		if (f_222_ > (float) (aClass180_Sub1_8876.anInt9391 * 2014358275))
			f_222_ = (float) (aClass180_Sub1_8876.anInt9391 * 2014358275);
		if (f_223_ < (float) (aClass180_Sub1_8876.anInt9392 * -456655989))
			f_223_ = (float) (aClass180_Sub1_8876.anInt9392 * -456655989);
		if (f_224_ > (float) (aClass180_Sub1_8876.anInt9393 * -383695469))
			f_224_ = (float) (aClass180_Sub1_8876.anInt9393 * -383695469);
		f_222_ = f_221_ - f_222_;
		if (f_222_ >= 0.0F)
			return false;
		f_224_ = f_223_ - f_224_;
		if (f_224_ >= 0.0F)
			return false;
		anInt8886 = aClass180_Sub1_8876.anInt9387 * -1173855569;
		anInt8892 = (int) ((float) ((int) f_223_ * anInt8886) + f_221_);
		float f_225_ = ((f_202_ - f) * (f_205_ - f_201_) - (f_203_ - f_201_) * (f_204_ - f));
		float f_226_ = ((f_204_ - f) * (f_203_ - f_201_) - (f_205_ - f_201_) * (f_202_ - f));
		anInt8893 = (int) ((f_205_ - f_201_) * 4096.0F * (float) anInt8877 / f_225_);
		anInt8909 = (int) ((f_203_ - f_201_) * 4096.0F * (float) anInt8880 / f_226_);
		anInt8881 = (int) ((f_204_ - f) * 4096.0F * (float) anInt8877 / f_226_);
		anInt8885 = (int) ((f_202_ - f) * 4096.0F * (float) anInt8880 / f_225_);
		anInt8897 = (int) (f_221_ * 16.0F + 8.0F - (f + f_202_ + f_204_ + f_219_) / 4.0F * 16.0F);
		anInt8898 = (int) (f_223_ * 16.0F + 8.0F - (f_201_ + f_203_ + f_205_ + f_220_) / 4.0F * 16.0F);
		anInt8899 = (anInt8877 >> 1 << 12) + (anInt8898 * anInt8881 >> 4);
		anInt8900 = (anInt8880 >> 1 << 12) + (anInt8898 * anInt8885 >> 4);
		anInt8890 = anInt8897 * anInt8893 >> 4;
		anInt8902 = anInt8897 * anInt8909 >> 4;
		anInt8887 = (int) f_221_;
		anInt8888 = (int) f_222_;
		anInt8891 = (int) f_223_;
		anInt8903 = (int) f_224_;
		return true;
	}

	boolean method14433(float f, float f_227_, float f_228_, float f_229_, float f_230_, float f_231_) {
		int i = anInt8879 + anInt8877 + anInt8878;
		int i_232_ = anInt8895 + anInt8880 + anInt8882;
		if (i != anInt8877 || i_232_ != anInt8880) {
			float f_233_ = (f_228_ - f) / (float) i;
			float f_234_ = (f_229_ - f_227_) / (float) i;
			float f_235_ = (f_230_ - f) / (float) i_232_;
			float f_236_ = (f_231_ - f_227_) / (float) i_232_;
			float f_237_ = f_235_ * (float) anInt8895;
			float f_238_ = f_236_ * (float) anInt8895;
			float f_239_ = f_233_ * (float) anInt8879;
			float f_240_ = f_234_ * (float) anInt8879;
			float f_241_ = -f_233_ * (float) anInt8878;
			float f_242_ = -f_234_ * (float) anInt8878;
			float f_243_ = -f_235_ * (float) anInt8882;
			float f_244_ = -f_236_ * (float) anInt8882;
			f += f_239_ + f_237_;
			f_227_ += f_240_ + f_238_;
			f_228_ += f_241_ + f_237_;
			f_229_ += f_242_ + f_238_;
			f_230_ += f_239_ + f_243_;
			f_231_ += f_240_ + f_244_;
		}
		float f_245_ = f_230_ + (f_228_ - f);
		float f_246_ = f_229_ + (f_231_ - f_227_);
		float f_247_;
		float f_248_;
		if (f < f_228_) {
			f_247_ = f;
			f_248_ = f_228_;
		} else {
			f_247_ = f_228_;
			f_248_ = f;
		}
		if (f_230_ < f_247_)
			f_247_ = f_230_;
		if (f_245_ < f_247_)
			f_247_ = f_245_;
		if (f_230_ > f_248_)
			f_248_ = f_230_;
		if (f_245_ > f_248_)
			f_248_ = f_245_;
		float f_249_;
		float f_250_;
		if (f_227_ < f_229_) {
			f_249_ = f_227_;
			f_250_ = f_229_;
		} else {
			f_249_ = f_229_;
			f_250_ = f_227_;
		}
		if (f_231_ < f_249_)
			f_249_ = f_231_;
		if (f_246_ < f_249_)
			f_249_ = f_246_;
		if (f_231_ > f_250_)
			f_250_ = f_231_;
		if (f_246_ > f_250_)
			f_250_ = f_246_;
		if (f_247_ < (float) (aClass180_Sub1_8876.anInt9383 * 1605202751))
			f_247_ = (float) (aClass180_Sub1_8876.anInt9383 * 1605202751);
		if (f_248_ > (float) (aClass180_Sub1_8876.anInt9391 * 2014358275))
			f_248_ = (float) (aClass180_Sub1_8876.anInt9391 * 2014358275);
		if (f_249_ < (float) (aClass180_Sub1_8876.anInt9392 * -456655989))
			f_249_ = (float) (aClass180_Sub1_8876.anInt9392 * -456655989);
		if (f_250_ > (float) (aClass180_Sub1_8876.anInt9393 * -383695469))
			f_250_ = (float) (aClass180_Sub1_8876.anInt9393 * -383695469);
		f_248_ = f_247_ - f_248_;
		if (f_248_ >= 0.0F)
			return false;
		f_250_ = f_249_ - f_250_;
		if (f_250_ >= 0.0F)
			return false;
		anInt8886 = aClass180_Sub1_8876.anInt9387 * -1173855569;
		anInt8892 = (int) ((float) ((int) f_249_ * anInt8886) + f_247_);
		float f_251_ = ((f_228_ - f) * (f_231_ - f_227_) - (f_229_ - f_227_) * (f_230_ - f));
		float f_252_ = ((f_230_ - f) * (f_229_ - f_227_) - (f_231_ - f_227_) * (f_228_ - f));
		anInt8893 = (int) ((f_231_ - f_227_) * 4096.0F * (float) anInt8877 / f_251_);
		anInt8909 = (int) ((f_229_ - f_227_) * 4096.0F * (float) anInt8880 / f_252_);
		anInt8881 = (int) ((f_230_ - f) * 4096.0F * (float) anInt8877 / f_252_);
		anInt8885 = (int) ((f_228_ - f) * 4096.0F * (float) anInt8880 / f_251_);
		anInt8897 = (int) (f_247_ * 16.0F + 8.0F - (f + f_228_ + f_230_ + f_245_) / 4.0F * 16.0F);
		anInt8898 = (int) (f_249_ * 16.0F + 8.0F - (f_227_ + f_229_ + f_231_ + f_246_) / 4.0F * 16.0F);
		anInt8899 = (anInt8877 >> 1 << 12) + (anInt8898 * anInt8881 >> 4);
		anInt8900 = (anInt8880 >> 1 << 12) + (anInt8898 * anInt8885 >> 4);
		anInt8890 = anInt8897 * anInt8893 >> 4;
		anInt8902 = anInt8897 * anInt8909 >> 4;
		anInt8887 = (int) f_247_;
		anInt8888 = (int) f_248_;
		anInt8891 = (int) f_249_;
		anInt8903 = (int) f_250_;
		return true;
	}

	public abstract void method2459(int i, int i_253_, int i_254_, int i_255_, int[] is, int i_256_, int i_257_);

	public int method2424() {
		return anInt8880;
	}

	void method2449(float f, float f_258_, float f_259_, float f_260_, float f_261_, float f_262_, int i, Class142 class142, int i_263_, int i_264_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		if (method14431(f, f_258_, f_259_, f_260_, f_261_, f_262_)) {
			Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
			method14426(class142_sub1.anIntArray9002, class142_sub1.anIntArray9003, anInt8887 - i_263_, -i_264_ - (anInt8903 - anInt8891));
		}
	}

	public int method2414() {
		return anInt8880;
	}

	public int method2461() {
		return anInt8880;
	}
}
