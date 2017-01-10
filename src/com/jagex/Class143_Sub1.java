/* Class143_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class143_Sub1 extends NativeSprite {
	static int anInt8943;
	static int anInt8944;
	int anInt8945;
	Class167_Sub1 aClass167_Sub1_8946;
	int anInt8947;
	int anInt8948;
	static int anInt8949;
	int anInt8950;
	int[] anIntArray8951;
	int anInt8952;
	static final int anInt8953 = 12;
	static final int anInt8954 = 8;
	static int anInt8955;
	static int anInt8956;
	static int anInt8957;
	static int anInt8958;
	static int anInt8959;
	static int anInt8960;
	static int anInt8961;
	static int anInt8962;
	static int anInt8963;
	static int anInt8964;
	static int anInt8965 = 0;
	static int anInt8966;
	static int anInt8967;
	static int anInt8968;
	static int anInt8969;
	static final int anInt8970 = 4;
	static int anInt8971;
	static int anInt8972 = 0;
	static int anInt8973 = 0;
	static int anInt8974 = 0;
	static int anInt8975 = 0;
	static int anInt8976 = 0;
	int anInt8977;
	static int anInt8978;

	public abstract void method1754(int i, int i_0_, Class161 class161, int i_1_, int i_2_);

	public void method1718(int i, int i_3_, int i_4_, int i_5_) {
		anInt8977 = i;
		anInt8947 = i_3_;
		anInt8948 = i_4_;
		anInt8952 = i_5_;
	}

	public abstract void method1788(int i, int i_6_, Class161 class161, int i_7_, int i_8_);

	public int method1720() {
		return anInt8945;
	}

	public int method1752() {
		return anInt8950;
	}

	public int method12() {
		return anInt8977 + anInt8945 + anInt8948;
	}

	public int method1785() {
		return anInt8947 + anInt8950 + anInt8952;
	}

	abstract void method8429(boolean bool, boolean bool_9_, boolean bool_10_, int i, int i_11_, float f, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, boolean bool_18_);

	public void method1766(int[] is) {
		is[0] = anInt8977;
		is[1] = anInt8947;
		is[2] = anInt8948;
		is[3] = anInt8952;
	}

	public abstract void method1730(int i, int i_19_, Class161 class161, int i_20_, int i_21_);

	public abstract void method1743(int i, int i_22_, int i_23_, int i_24_, int[] is, int i_25_, int i_26_);

	abstract void method8430(boolean bool, boolean bool_27_, boolean bool_28_, int i, int i_29_, float f, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, boolean bool_36_);

	public void method1734(int i, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		if (anIntArray8951 == null)
			anIntArray8951 = new int[4];
		aClass167_Sub1_8946.method2054(anIntArray8951);
		aClass167_Sub1_8946.method2196((aClass167_Sub1_8946.anInt9000 * 1352816403), (aClass167_Sub1_8946.anInt9021 * -1593163361), i + i_38_, i_37_ + i_39_);
		int i_43_ = method12();
		int i_44_ = method1785();
		int i_45_ = (i_38_ + i_43_ - 1) / i_43_;
		int i_46_ = (i_39_ + i_44_ - 1) / i_44_;
		for (int i_47_ = 0; i_47_ < i_46_; i_47_++) {
			int i_48_ = i_47_ * i_44_;
			for (int i_49_ = 0; i_49_ < i_45_; i_49_++)
				method1729(i + i_49_ * i_43_, i_37_ + i_48_, i_40_, i_41_, i_42_);
		}
		aClass167_Sub1_8946.method2369(anIntArray8951[0], anIntArray8951[1], anIntArray8951[2], anIntArray8951[3]);
	}

	boolean method8431(float f, float f_50_, float f_51_, float f_52_, float f_53_, float f_54_) {
		int i = anInt8977 + anInt8945 + anInt8948;
		int i_55_ = anInt8947 + anInt8950 + anInt8952;
		if (i != anInt8945 || i_55_ != anInt8950) {
			float f_56_ = (f_51_ - f) / (float) i;
			float f_57_ = (f_52_ - f_50_) / (float) i;
			float f_58_ = (f_53_ - f) / (float) i_55_;
			float f_59_ = (f_54_ - f_50_) / (float) i_55_;
			float f_60_ = f_58_ * (float) anInt8947;
			float f_61_ = f_59_ * (float) anInt8947;
			float f_62_ = f_56_ * (float) anInt8977;
			float f_63_ = f_57_ * (float) anInt8977;
			float f_64_ = -f_56_ * (float) anInt8948;
			float f_65_ = -f_57_ * (float) anInt8948;
			float f_66_ = -f_58_ * (float) anInt8952;
			float f_67_ = -f_59_ * (float) anInt8952;
			f += f_62_ + f_60_;
			f_50_ += f_63_ + f_61_;
			f_51_ += f_64_ + f_60_;
			f_52_ += f_65_ + f_61_;
			f_53_ += f_62_ + f_66_;
			f_54_ += f_63_ + f_67_;
		}
		float f_68_ = f_53_ + (f_51_ - f);
		float f_69_ = f_52_ + (f_54_ - f_50_);
		float f_70_;
		float f_71_;
		if (f < f_51_) {
			f_70_ = f;
			f_71_ = f_51_;
		} else {
			f_70_ = f_51_;
			f_71_ = f;
		}
		if (f_53_ < f_70_)
			f_70_ = f_53_;
		if (f_68_ < f_70_)
			f_70_ = f_68_;
		if (f_53_ > f_71_)
			f_71_ = f_53_;
		if (f_68_ > f_71_)
			f_71_ = f_68_;
		float f_72_;
		float f_73_;
		if (f_50_ < f_52_) {
			f_72_ = f_50_;
			f_73_ = f_52_;
		} else {
			f_72_ = f_52_;
			f_73_ = f_50_;
		}
		if (f_54_ < f_72_)
			f_72_ = f_54_;
		if (f_69_ < f_72_)
			f_72_ = f_69_;
		if (f_54_ > f_73_)
			f_73_ = f_54_;
		if (f_69_ > f_73_)
			f_73_ = f_69_;
		if (f_70_ < (float) (aClass167_Sub1_8946.anInt9000 * 1352816403))
			f_70_ = (float) (aClass167_Sub1_8946.anInt9000 * 1352816403);
		if (f_71_ > (float) (aClass167_Sub1_8946.anInt9001 * 2024498147))
			f_71_ = (float) (aClass167_Sub1_8946.anInt9001 * 2024498147);
		if (f_72_ < (float) (aClass167_Sub1_8946.anInt9021 * -1593163361))
			f_72_ = (float) (aClass167_Sub1_8946.anInt9021 * -1593163361);
		if (f_73_ > (float) (aClass167_Sub1_8946.anInt9003 * -148513205))
			f_73_ = (float) (aClass167_Sub1_8946.anInt9003 * -148513205);
		f_71_ = f_70_ - f_71_;
		if (f_71_ >= 0.0F)
			return false;
		f_73_ = f_72_ - f_73_;
		if (f_73_ >= 0.0F)
			return false;
		anInt8958 = aClass167_Sub1_8946.anInt8997 * -570111553;
		anInt8959 = (int) ((float) ((int) f_72_ * anInt8958) + f_70_);
		float f_74_ = (f_51_ - f) * (f_54_ - f_50_) - (f_52_ - f_50_) * (f_53_ - f);
		float f_75_ = (f_53_ - f) * (f_52_ - f_50_) - (f_54_ - f_50_) * (f_51_ - f);
		anInt8960 = (int) ((f_54_ - f_50_) * 4096.0F * (float) anInt8945 / f_74_);
		anInt8962 = (int) ((f_52_ - f_50_) * 4096.0F * (float) anInt8950 / f_75_);
		anInt8943 = (int) ((f_53_ - f) * 4096.0F * (float) anInt8945 / f_75_);
		anInt8963 = (int) ((f_51_ - f) * 4096.0F * (float) anInt8950 / f_74_);
		anInt8971 = (int) (f_70_ * 16.0F + 8.0F - (f + f_51_ + f_53_ + f_68_) / 4.0F * 16.0F);
		anInt8949 = (int) (f_72_ * 16.0F + 8.0F - (f_50_ + f_52_ + f_54_ + f_69_) / 4.0F * 16.0F);
		anInt8966 = (anInt8945 >> 1 << 12) + (anInt8949 * anInt8943 >> 4);
		anInt8967 = (anInt8950 >> 1 << 12) + (anInt8949 * anInt8963 >> 4);
		anInt8968 = anInt8971 * anInt8960 >> 4;
		anInt8969 = anInt8971 * anInt8962 >> 4;
		anInt8961 = (int) f_70_;
		anInt8955 = (int) f_71_;
		anInt8956 = (int) f_72_;
		anInt8957 = (int) f_73_;
		return true;
	}

	void method1740(float f, float f_76_, float f_77_, float f_78_, float f_79_, float f_80_, int i, int i_81_, int i_82_, int i_83_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		if (method8431(f, f_76_, f_77_, f_78_, f_79_, f_80_)) {
			anInt8944 = i_81_;
			if (i != 1) {
				anInt8965 = i_81_ >>> 24;
				anInt8972 = 256 - anInt8965;
				if (i == 0) {
					anInt8973 = (i_81_ & 0xff0000) >> 16;
					anInt8974 = (i_81_ & 0xff00) >> 8;
					anInt8975 = i_81_ & 0xff;
				} else if (i == 2) {
					anInt8976 = i_81_ >>> 24;
					anInt8964 = 256 - anInt8976;
					int i_84_ = (i_81_ & 0xff00ff) * anInt8964 & ~0xff00ff;
					int i_85_ = (i_81_ & 0xff00) * anInt8964 & 0xff0000;
					anInt8978 = (i_84_ | i_85_) >>> 8;
				}
			}
			method8437(i, i_82_);
		}
	}

	public abstract void method1756(int i, int i_86_, int i_87_, int i_88_, int i_89_);

	void method1725(float f, float f_90_, float f_91_, float f_92_, float f_93_, float f_94_, int i, Class161 class161, int i_95_, int i_96_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		if (method8431(f, f_90_, f_91_, f_92_, f_93_, f_94_)) {
			Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
			method8432(class161_sub2.anIntArray9444, class161_sub2.anIntArray9445, anInt8961 - i_95_, -i_96_ - (anInt8957 - anInt8956));
		}
	}

	public abstract void method1763(int i, int i_97_, int i_98_, int i_99_, int i_100_);

	static {
		anInt8964 = 0;
		anInt8978 = 0;
	}

	public int method1770() {
		return anInt8947 + anInt8950 + anInt8952;
	}

	public abstract void method1757(int i, int i_101_, int i_102_, int i_103_, int[] is, int i_104_, int i_105_);

	public abstract void method1745(int i, int i_106_, int i_107_, int i_108_, int[] is, int i_109_, int i_110_);

	public void method1759(int i, int i_111_, int i_112_, int i_113_, int i_114_, int i_115_, int i_116_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		if (anIntArray8951 == null)
			anIntArray8951 = new int[4];
		aClass167_Sub1_8946.method2054(anIntArray8951);
		aClass167_Sub1_8946.method2196((aClass167_Sub1_8946.anInt9000 * 1352816403), (aClass167_Sub1_8946.anInt9021 * -1593163361), i + i_112_, i_111_ + i_113_);
		int i_117_ = method12();
		int i_118_ = method1785();
		int i_119_ = (i_112_ + i_117_ - 1) / i_117_;
		int i_120_ = (i_113_ + i_118_ - 1) / i_118_;
		for (int i_121_ = 0; i_121_ < i_120_; i_121_++) {
			int i_122_ = i_121_ * i_118_;
			for (int i_123_ = 0; i_123_ < i_119_; i_123_++)
				method1729(i + i_123_ * i_117_, i_111_ + i_122_, i_114_, i_115_, i_116_);
		}
		aClass167_Sub1_8946.method2369(anIntArray8951[0], anIntArray8951[1], anIntArray8951[2], anIntArray8951[3]);
	}

	abstract void method8432(int[] is, int[] is_124_, int i, int i_125_);

	public abstract void method1783(int i, int i_126_, int i_127_, int i_128_, int[] is, int i_129_, int i_130_);

	public abstract void method1721(int i, int i_131_, int i_132_, int i_133_, int i_134_);

	abstract void method1758(int i, int i_135_, int i_136_, int i_137_, int i_138_, int i_139_, int i_140_, int i_141_);

	abstract void method1749(int i, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_, int i_148_);

	public void method1774(int i, int i_149_, int i_150_, int i_151_, int i_152_, int i_153_, int i_154_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		if (anIntArray8951 == null)
			anIntArray8951 = new int[4];
		aClass167_Sub1_8946.method2054(anIntArray8951);
		aClass167_Sub1_8946.method2196((aClass167_Sub1_8946.anInt9000 * 1352816403), (aClass167_Sub1_8946.anInt9021 * -1593163361), i + i_150_, i_149_ + i_151_);
		int i_155_ = method12();
		int i_156_ = method1785();
		int i_157_ = (i_150_ + i_155_ - 1) / i_155_;
		int i_158_ = (i_151_ + i_156_ - 1) / i_156_;
		for (int i_159_ = 0; i_159_ < i_158_; i_159_++) {
			int i_160_ = i_159_ * i_156_;
			for (int i_161_ = 0; i_161_ < i_157_; i_161_++)
				method1729(i + i_161_ * i_155_, i_149_ + i_160_, i_152_, i_153_, i_154_);
		}
		aClass167_Sub1_8946.method2369(anIntArray8951[0], anIntArray8951[1], anIntArray8951[2], anIntArray8951[3]);
	}

	abstract void method8433(int i, int i_162_);

	public abstract void method1764(int i, int i_163_, Class161 class161, int i_164_, int i_165_);

	public void method1781(int i, int i_166_, int i_167_, int i_168_) {
		anInt8977 = i;
		anInt8947 = i_166_;
		anInt8948 = i_167_;
		anInt8952 = i_168_;
	}

	abstract void method8434(int i, int i_169_);

	abstract void method8435(int[] is, int[] is_170_, int i, int i_171_);

	abstract void method8436(int[] is, int[] is_172_, int i, int i_173_);

	abstract void method1732(int i, int i_174_, int i_175_, int i_176_, int i_177_, int i_178_, int i_179_, int i_180_);

	public int method1767() {
		return anInt8945;
	}

	public void method1773(int i, int i_181_, int i_182_, int i_183_, int i_184_, int i_185_, int i_186_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		if (anIntArray8951 == null)
			anIntArray8951 = new int[4];
		aClass167_Sub1_8946.method2054(anIntArray8951);
		aClass167_Sub1_8946.method2196((aClass167_Sub1_8946.anInt9000 * 1352816403), (aClass167_Sub1_8946.anInt9021 * -1593163361), i + i_182_, i_181_ + i_183_);
		int i_187_ = method12();
		int i_188_ = method1785();
		int i_189_ = (i_182_ + i_187_ - 1) / i_187_;
		int i_190_ = (i_183_ + i_188_ - 1) / i_188_;
		for (int i_191_ = 0; i_191_ < i_190_; i_191_++) {
			int i_192_ = i_191_ * i_188_;
			for (int i_193_ = 0; i_193_ < i_189_; i_193_++)
				method1729(i + i_193_ * i_187_, i_181_ + i_192_, i_184_, i_185_, i_186_);
		}
		aClass167_Sub1_8946.method2369(anIntArray8951[0], anIntArray8951[1], anIntArray8951[2], anIntArray8951[3]);
	}

	public abstract void method1762(int i, int i_194_, Class161 class161, int i_195_, int i_196_);

	public abstract void method1755(int i, int i_197_, int i_198_, int i_199_, int i_200_);

	public abstract void method1737(int i, int i_201_, Class161 class161, int i_202_, int i_203_);

	public void method1765(int i, int i_204_, int i_205_, int i_206_) {
		anInt8977 = i;
		anInt8947 = i_204_;
		anInt8948 = i_205_;
		anInt8952 = i_206_;
	}

	public abstract void method1729(int i, int i_207_, int i_208_, int i_209_, int i_210_);

	abstract void method8437(int i, int i_211_);

	public void method1768(int[] is) {
		is[0] = anInt8977;
		is[1] = anInt8947;
		is[2] = anInt8948;
		is[3] = anInt8952;
	}

	public abstract void method1760(int i, int i_212_, Class161 class161, int i_213_, int i_214_);

	public int method1753() {
		return anInt8945;
	}

	public int method1769() {
		return anInt8950;
	}

	public int method11() {
		return anInt8977 + anInt8945 + anInt8948;
	}

	abstract void method8438(int i, int i_215_);

	abstract void method8439(int i, int i_216_);

	public void method1772(int i, int i_217_, int i_218_, int i_219_, int i_220_, int i_221_, int i_222_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		if (anIntArray8951 == null)
			anIntArray8951 = new int[4];
		aClass167_Sub1_8946.method2054(anIntArray8951);
		aClass167_Sub1_8946.method2196((aClass167_Sub1_8946.anInt9000 * 1352816403), (aClass167_Sub1_8946.anInt9021 * -1593163361), i + i_218_, i_217_ + i_219_);
		int i_223_ = method12();
		int i_224_ = method1785();
		int i_225_ = (i_218_ + i_223_ - 1) / i_223_;
		int i_226_ = (i_219_ + i_224_ - 1) / i_224_;
		for (int i_227_ = 0; i_227_ < i_226_; i_227_++) {
			int i_228_ = i_227_ * i_224_;
			for (int i_229_ = 0; i_229_ < i_225_; i_229_++)
				method1729(i + i_229_ * i_223_, i_217_ + i_228_, i_220_, i_221_, i_222_);
		}
		aClass167_Sub1_8946.method2369(anIntArray8951[0], anIntArray8951[1], anIntArray8951[2], anIntArray8951[3]);
	}

	public void method1719(int[] is) {
		is[0] = anInt8977;
		is[1] = anInt8947;
		is[2] = anInt8948;
		is[3] = anInt8952;
	}

	Class143_Sub1(Class167_Sub1 class167_sub1, int i, int i_230_) {
		aClass167_Sub1_8946 = class167_sub1;
		anInt8945 = i;
		anInt8950 = i_230_;
	}

	void method1775(float f, float f_231_, float f_232_, float f_233_, float f_234_, float f_235_, int i, int i_236_, int i_237_, int i_238_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		if (method8431(f, f_231_, f_232_, f_233_, f_234_, f_235_)) {
			anInt8944 = i_236_;
			if (i != 1) {
				anInt8965 = i_236_ >>> 24;
				anInt8972 = 256 - anInt8965;
				if (i == 0) {
					anInt8973 = (i_236_ & 0xff0000) >> 16;
					anInt8974 = (i_236_ & 0xff00) >> 8;
					anInt8975 = i_236_ & 0xff;
				} else if (i == 2) {
					anInt8976 = i_236_ >>> 24;
					anInt8964 = 256 - anInt8976;
					int i_239_ = (i_236_ & 0xff00ff) * anInt8964 & ~0xff00ff;
					int i_240_ = (i_236_ & 0xff00) * anInt8964 & 0xff0000;
					anInt8978 = (i_239_ | i_240_) >>> 8;
				}
			}
			method8437(i, i_237_);
		}
	}

	void method1776(float f, float f_241_, float f_242_, float f_243_, float f_244_, float f_245_, int i, int i_246_, int i_247_, int i_248_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		if (method8431(f, f_241_, f_242_, f_243_, f_244_, f_245_)) {
			anInt8944 = i_246_;
			if (i != 1) {
				anInt8965 = i_246_ >>> 24;
				anInt8972 = 256 - anInt8965;
				if (i == 0) {
					anInt8973 = (i_246_ & 0xff0000) >> 16;
					anInt8974 = (i_246_ & 0xff00) >> 8;
					anInt8975 = i_246_ & 0xff;
				} else if (i == 2) {
					anInt8976 = i_246_ >>> 24;
					anInt8964 = 256 - anInt8976;
					int i_249_ = (i_246_ & 0xff00ff) * anInt8964 & ~0xff00ff;
					int i_250_ = (i_246_ & 0xff00) * anInt8964 & 0xff0000;
					anInt8978 = (i_249_ | i_250_) >>> 8;
				}
			}
			method8437(i, i_247_);
		}
	}

	void method1787(float f, float f_251_, float f_252_, float f_253_, float f_254_, float f_255_, int i, int i_256_, int i_257_, int i_258_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		if (method8431(f, f_251_, f_252_, f_253_, f_254_, f_255_)) {
			anInt8944 = i_256_;
			if (i != 1) {
				anInt8965 = i_256_ >>> 24;
				anInt8972 = 256 - anInt8965;
				if (i == 0) {
					anInt8973 = (i_256_ & 0xff0000) >> 16;
					anInt8974 = (i_256_ & 0xff00) >> 8;
					anInt8975 = i_256_ & 0xff;
				} else if (i == 2) {
					anInt8976 = i_256_ >>> 24;
					anInt8964 = 256 - anInt8976;
					int i_259_ = (i_256_ & 0xff00ff) * anInt8964 & ~0xff00ff;
					int i_260_ = (i_256_ & 0xff00) * anInt8964 & 0xff0000;
					anInt8978 = (i_259_ | i_260_) >>> 8;
				}
			}
			method8437(i, i_257_);
		}
	}

	void method1778(float f, float f_261_, float f_262_, float f_263_, float f_264_, float f_265_, int i, Class161 class161, int i_266_, int i_267_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		if (method8431(f, f_261_, f_262_, f_263_, f_264_, f_265_)) {
			Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
			method8432(class161_sub2.anIntArray9444, class161_sub2.anIntArray9445, anInt8961 - i_266_, -i_267_ - (anInt8957 - anInt8956));
		}
	}

	void method1777(float f, float f_268_, float f_269_, float f_270_, float f_271_, float f_272_, int i, Class161 class161, int i_273_, int i_274_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		if (method8431(f, f_268_, f_269_, f_270_, f_271_, f_272_)) {
			Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
			method8432(class161_sub2.anIntArray9444, class161_sub2.anIntArray9445, anInt8961 - i_273_, -i_274_ - (anInt8957 - anInt8956));
		}
	}
}
