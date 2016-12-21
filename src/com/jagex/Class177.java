/* Class177 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class177 {
	static final float aFloat1937 = 3.1415927F;
	protected boolean aBool1938 = false;
	public boolean aBool1939 = true;

	public abstract void method2457(int i);

	public abstract int method2458();

	public abstract Class536_Sub18_Sub7 method2459(Class536_Sub18_Sub7 class536_sub18_sub7);

	static int method2460(float f, float f_0_, float f_1_) {
		float f_2_ = f < 0.0F ? -f : f;
		float f_3_ = f_0_ < 0.0F ? -f_0_ : f_0_;
		float f_4_ = f_1_ < 0.0F ? -f_1_ : f_1_;
		if (f_3_ > f_2_ && f_3_ > f_4_) {
			if (f_0_ > 0.0F)
				return 0;
			return 1;
		}
		if (f_4_ > f_2_ && f_4_ > f_3_) {
			if (f_1_ > 0.0F)
				return 2;
			return 3;
		}
		if (f > 0.0F)
			return 4;
		return 5;
	}

	static void method2461(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, float[] fs, int i_11_, float f, float f_12_, float f_13_, float[] fs_14_) {
		i -= i_7_;
		i_5_ -= i_8_;
		i_6_ -= i_9_;
		float f_15_ = (float) i * fs[0] + (float) i_5_ * fs[1] + (float) i_6_ * fs[2];
		float f_16_ = (float) i * fs[3] + (float) i_5_ * fs[4] + (float) i_6_ * fs[5];
		float f_17_ = (float) i * fs[6] + (float) i_5_ * fs[7] + (float) i_6_ * fs[8];
		float f_18_;
		float f_19_;
		if (i_10_ == 0) {
			f_18_ = f_15_ + f + 0.5F;
			f_19_ = -f_17_ + f_13_ + 0.5F;
		} else if (i_10_ == 1) {
			f_18_ = f_15_ + f + 0.5F;
			f_19_ = f_17_ + f_13_ + 0.5F;
		} else if (i_10_ == 2) {
			f_18_ = -f_15_ + f + 0.5F;
			f_19_ = -f_16_ + f_12_ + 0.5F;
		} else if (i_10_ == 3) {
			f_18_ = f_15_ + f + 0.5F;
			f_19_ = -f_16_ + f_12_ + 0.5F;
		} else if (i_10_ == 4) {
			f_18_ = f_17_ + f_13_ + 0.5F;
			f_19_ = -f_16_ + f_12_ + 0.5F;
		} else {
			f_18_ = -f_17_ + f_13_ + 0.5F;
			f_19_ = -f_16_ + f_12_ + 0.5F;
		}
		if (i_11_ == 1) {
			float f_20_ = f_18_;
			f_18_ = -f_19_;
			f_19_ = f_20_;
		} else if (i_11_ == 2) {
			f_18_ = -f_18_;
			f_19_ = -f_19_;
		} else if (i_11_ == 3) {
			float f_21_ = f_18_;
			f_18_ = f_19_;
			f_19_ = -f_21_;
		}
		fs_14_[0] = f_18_;
		fs_14_[1] = f_19_;
	}

	public abstract byte[] method2462();

	public abstract int method2463();

	public abstract void method2464();

	public abstract void method2465(int i);

	public abstract int method2466();

	public abstract void method2467();

	public final void method2468(Class536_Sub18_Sub17 class536_sub18_sub17, int i, Class536_Sub18_Sub17 class536_sub18_sub17_22_, int i_23_, int i_24_, int i_25_, Class536_Sub18_Sub17 class536_sub18_sub17_26_, int i_27_, Class536_Sub18_Sub17 class536_sub18_sub17_28_, int i_29_, int i_30_, int i_31_, boolean[] bools, boolean bool) {
		if (i != -1) {
			if (bools == null || i_27_ == -1)
				method2479(class536_sub18_sub17, i, class536_sub18_sub17_22_, i_23_, i_24_, i_25_, 0, bool);
			else {
				method2477();
				if (!method2485())
					method2478();
				else {
					Class185 class185 = class536_sub18_sub17.aClass185Array11815[i];
					Class536_Sub17 class536_sub17 = class185.aClass536_Sub17_2118;
					Class185 class185_32_ = null;
					if (class536_sub18_sub17_22_ != null) {
						class185_32_ = (class536_sub18_sub17_22_.aClass185Array11815[i_23_]);
						if (class185_32_.aClass536_Sub17_2118 != class536_sub17)
							class185_32_ = null;
					}
					method2555(class536_sub17, class185, class185_32_, i_24_, i_25_, 0, bools, false, bool, 65535, null);
					Class185 class185_33_ = class536_sub18_sub17_26_.aClass185Array11815[i_27_];
					Class185 class185_34_ = null;
					if (class536_sub18_sub17_28_ != null) {
						class185_34_ = (class536_sub18_sub17_28_.aClass185Array11815[i_29_]);
						if (class185_34_.aClass536_Sub17_2118 != class536_sub17)
							class185_34_ = null;
					}
					method2486(0, new int[0], 0, 0, 0, 0, bool);
					method2555(class185_33_.aClass536_Sub17_2118, class185_33_, class185_34_, i_30_, i_31_, 0, bools, true, bool, 65535, null);
					method2573();
					method2478();
				}
			}
		}
	}

	public abstract void method2469(Class177 class177_35_, int i, int i_36_, int i_37_, boolean bool);

	public abstract void method2470(int i);

	public abstract int method2471();

	public abstract void method2472(int i, int i_38_, int i_39_);

	public abstract void method2473();

	public abstract void method2474(int i, int i_40_, int i_41_);

	public abstract void method2475(int i, int i_42_, Class160 class160, Class160 class160_43_, int i_44_, int i_45_, int i_46_);

	void method2476(Class160 class160, int i, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_) {
		boolean bool = false;
		boolean bool_53_ = false;
		boolean bool_54_ = false;
		int i_55_ = -i_49_ / 2;
		int i_56_ = -i_50_ / 2;
		int i_57_ = class160.method1926(i + i_55_, i_48_ + i_56_, (byte) 0);
		int i_58_ = i_49_ / 2;
		int i_59_ = -i_50_ / 2;
		int i_60_ = class160.method1926(i + i_58_, i_48_ + i_59_, (byte) 0);
		int i_61_ = -i_49_ / 2;
		int i_62_ = i_50_ / 2;
		int i_63_ = class160.method1926(i + i_61_, i_48_ + i_62_, (byte) 0);
		int i_64_ = i_49_ / 2;
		int i_65_ = i_50_ / 2;
		int i_66_ = class160.method1926(i + i_64_, i_48_ + i_65_, (byte) 0);
		int i_67_ = i_57_ < i_60_ ? i_57_ : i_60_;
		int i_68_ = i_63_ < i_66_ ? i_63_ : i_66_;
		int i_69_ = i_60_ < i_66_ ? i_60_ : i_66_;
		int i_70_ = i_57_ < i_63_ ? i_57_ : i_63_;
		if (i_50_ != 0) {
			int i_71_ = ((int) (Math.atan2((double) (i_67_ - i_68_), (double) i_50_) * 2607.5945876176133) & 0x3fff);
			if (i_71_ != 0) {
				if (i_51_ != 0) {
					if (i_71_ > 8192) {
						int i_72_ = 16384 - i_51_;
						if (i_71_ < i_72_)
							i_71_ = i_72_;
					} else if (i_71_ > i_51_)
						i_71_ = i_51_;
				}
				method2457(i_71_);
			}
		}
		if (i_49_ != 0) {
			int i_73_ = ((int) (Math.atan2((double) (i_70_ - i_69_), (double) i_49_) * 2607.5945876176133) & 0x3fff);
			if (i_73_ != 0) {
				if (i_52_ != 0) {
					if (i_73_ > 8192) {
						int i_74_ = 16384 - i_52_;
						if (i_73_ < i_74_)
							i_73_ = i_74_;
					} else if (i_73_ > i_52_)
						i_73_ = i_52_;
				}
				method2529(i_73_);
			}
		}
		int i_75_ = i_57_ + i_66_;
		if (i_60_ + i_63_ < i_75_)
			i_75_ = i_60_ + i_63_;
		i_75_ = (i_75_ >> 1) - i_47_;
		if (i_75_ != 0)
			method2472(0, i_75_, 0);
	}

	abstract void method2477();

	abstract void method2478();

	public final void method2479(Class536_Sub18_Sub17 class536_sub18_sub17, int i, Class536_Sub18_Sub17 class536_sub18_sub17_76_, int i_77_, int i_78_, int i_79_, int i_80_, boolean bool) {
		if (i != -1) {
			method2477();
			if (!method2485())
				method2478();
			else {
				Class185 class185 = class536_sub18_sub17.aClass185Array11815[i];
				Class536_Sub17 class536_sub17 = class185.aClass536_Sub17_2118;
				Class185 class185_81_ = null;
				if (class536_sub18_sub17_76_ != null) {
					class185_81_ = class536_sub18_sub17_76_.aClass185Array11815[i_77_];
					if (class185_81_.aClass536_Sub17_2118 != class536_sub17)
						class185_81_ = null;
				}
				method2555(class536_sub17, class185, class185_81_, i_78_, i_79_, i_80_, null, false, bool, 65535, null);
				method2573();
				method2478();
			}
		}
	}

	public abstract boolean method2480();

	public final void method2481(Class536_Sub18_Sub17 class536_sub18_sub17, int i, Class536_Sub18_Sub17 class536_sub18_sub17_82_, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_, boolean bool, int[] is) {
		if (i != -1) {
			method2477();
			if (!method2485())
				method2478();
			else {
				Class185 class185 = class536_sub18_sub17.aClass185Array11815[i];
				Class536_Sub17 class536_sub17 = class185.aClass536_Sub17_2118;
				Class185 class185_88_ = null;
				if (class536_sub18_sub17_82_ != null) {
					class185_88_ = class536_sub18_sub17_82_.aClass185Array11815[i_83_];
					if (class185_88_.aClass536_Sub17_2118 != class536_sub17)
						class185_88_ = null;
				}
				method2555(class536_sub17, class185, class185_88_, i_84_, i_85_, i_86_, null, false, bool, i_87_, is);
				method2573();
				method2478();
			}
		}
	}

	public final void method2482(Class536_Sub18_Sub17 class536_sub18_sub17, int i) {
		if (i != -1) {
			method2477();
			if (!method2485())
				method2478();
			else {
				Class185 class185 = class536_sub18_sub17.aClass185Array11815[i];
				Class536_Sub17 class536_sub17 = class185.aClass536_Sub17_2118;
				for (int i_89_ = 0; i_89_ < class185.anInt2113; i_89_++) {
					short i_90_ = class185.aShortArray2119[i_89_];
					if (class536_sub17.aBoolArray10504[i_90_]) {
						if (class185.aShortArray2109[i_89_] != -1)
							method2487(0, 0, 0, 0);
						method2487(class536_sub17.anIntArray10505[i_90_], class185.aShortArray2112[i_89_], class185.aShortArray2116[i_89_], class185.aShortArray2114[i_89_]);
					}
				}
				method2573();
				method2478();
			}
		}
	}

	public abstract int method2483();

	void method2484(int i, int[] is, int i_91_, int i_92_, int i_93_, int i_94_, boolean bool, int i_95_, int[] is_96_) {
		if (i_94_ == 1) {
			if (i == 0 || i == 1) {
				int i_97_ = -i_91_;
				i_91_ = i_93_;
				i_93_ = i_97_;
			} else if (i == 3) {
				int i_98_ = i_91_;
				i_91_ = i_93_;
				i_93_ = i_98_;
			} else if (i == 2) {
				int i_99_ = i_91_;
				i_91_ = -i_93_ & 0x3fff;
				i_93_ = i_99_ & 0x3fff;
			}
		} else if (i_94_ == 2) {
			if (i == 0 || i == 1) {
				i_91_ = -i_91_;
				i_93_ = -i_93_;
			} else if (i == 2) {
				i_91_ = -i_91_ & 0x3fff;
				i_93_ = -i_93_ & 0x3fff;
			}
		} else if (i_94_ == 3) {
			if (i == 0 || i == 1) {
				int i_100_ = i_91_;
				i_91_ = -i_93_;
				i_93_ = i_100_;
			} else if (i == 3) {
				int i_101_ = i_91_;
				i_91_ = i_93_;
				i_93_ = i_101_;
			} else if (i == 2) {
				int i_102_ = i_91_;
				i_91_ = i_93_ & 0x3fff;
				i_93_ = -i_102_ & 0x3fff;
			}
		}
		if (i_95_ != 65535)
			method2554(i, is, i_91_, i_92_, i_93_, bool, i_95_, is_96_);
		else
			method2486(i, is, i_91_, i_92_, i_93_, i_94_, bool);
	}

	abstract boolean method2485();

	abstract void method2486(int i, int[] is, int i_103_, int i_104_, int i_105_, int i_106_, boolean bool);

	Class177() {
		/* empty */
	}

	abstract void method2487(int i, int i_107_, int i_108_, int i_109_);

	public abstract int method2488();

	public abstract void method2489(Class433 class433, int i, boolean bool);

	public abstract void method2490(Class433 class433, Class178 class178, int i);

	public abstract void method2491(int i);

	static void method2492(int i, int i_110_, int i_111_, int i_112_, int i_113_, int i_114_, float[] fs, int i_115_, float f, float[] fs_116_) {
		i -= i_112_;
		i_110_ -= i_113_;
		i_111_ -= i_114_;
		float f_117_ = ((float) i * fs[0] + (float) i_110_ * fs[1] + (float) i_111_ * fs[2]);
		float f_118_ = ((float) i * fs[3] + (float) i_110_ * fs[4] + (float) i_111_ * fs[5]);
		float f_119_ = ((float) i * fs[6] + (float) i_110_ * fs[7] + (float) i_111_ * fs[8]);
		float f_120_ = (float) Math.sqrt((double) (f_117_ * f_117_ + f_118_ * f_118_ + f_119_ * f_119_));
		float f_121_ = (((float) Math.atan2((double) f_117_, (double) f_119_) / 6.2831855F) + 0.5F);
		float f_122_ = ((float) Math.asin((double) (f_118_ / f_120_)) / 3.1415927F + 0.5F + f);
		if (i_115_ == 1) {
			float f_123_ = f_121_;
			f_121_ = -f_122_;
			f_122_ = f_123_;
		} else if (i_115_ == 2) {
			f_121_ = -f_121_;
			f_122_ = -f_122_;
		} else if (i_115_ == 3) {
			float f_124_ = f_121_;
			f_121_ = f_122_;
			f_122_ = -f_124_;
		}
		fs_116_[0] = f_121_;
		fs_116_[1] = f_122_;
	}

	public abstract int method2493();

	Class163 method2494(Class180 class180, int[] is, int i) {
		int[] is_125_ = null;
		int[] is_126_ = null;
		int[] is_127_ = null;
		float[][] fs = null;
		if (class180.aShortArray1982 != null) {
			int i_128_ = class180.anInt1983;
			int[] is_129_ = new int[i_128_];
			int[] is_130_ = new int[i_128_];
			int[] is_131_ = new int[i_128_];
			int[] is_132_ = new int[i_128_];
			int[] is_133_ = new int[i_128_];
			int[] is_134_ = new int[i_128_];
			for (int i_135_ = 0; i_135_ < i_128_; i_135_++) {
				is_129_[i_135_] = 2147483647;
				is_130_[i_135_] = -2147483647;
				is_131_[i_135_] = 2147483647;
				is_132_[i_135_] = -2147483647;
				is_133_[i_135_] = 2147483647;
				is_134_[i_135_] = -2147483647;
			}
			for (int i_136_ = 0; i_136_ < i; i_136_++) {
				int i_137_ = is[i_136_];
				short i_138_ = class180.aShortArray1982[i_137_];
				if (i_138_ > -1 && i_138_ < 32766) {
					for (int i_139_ = 0; i_139_ < 3; i_139_++) {
						short i_140_;
						if (i_139_ == 0)
							i_140_ = class180.aShortArray1962[i_137_];
						else if (i_139_ == 1)
							i_140_ = class180.aShortArray1979[i_137_];
						else
							i_140_ = class180.aShortArray1964[i_137_];
						int i_141_ = class180.anIntArray1952[i_140_];
						int i_142_ = class180.anIntArray1981[i_140_];
						int i_143_ = class180.anIntArray1978[i_140_];
						if (i_141_ < is_129_[i_138_])
							is_129_[i_138_] = i_141_;
						if (i_141_ > is_130_[i_138_])
							is_130_[i_138_] = i_141_;
						if (i_142_ < is_131_[i_138_])
							is_131_[i_138_] = i_142_;
						if (i_142_ > is_132_[i_138_])
							is_132_[i_138_] = i_142_;
						if (i_143_ < is_133_[i_138_])
							is_133_[i_138_] = i_143_;
						if (i_143_ > is_134_[i_138_])
							is_134_[i_138_] = i_143_;
					}
				}
			}
			is_125_ = new int[i_128_];
			is_126_ = new int[i_128_];
			is_127_ = new int[i_128_];
			fs = new float[i_128_][];
			for (int i_144_ = 0; i_144_ < i_128_; i_144_++) {
				byte i_145_ = class180.aByteArray1980[i_144_];
				if (i_145_ > 0) {
					is_125_[i_144_] = (is_129_[i_144_] + is_130_[i_144_]) / 2;
					is_126_[i_144_] = (is_131_[i_144_] + is_132_[i_144_]) / 2;
					is_127_[i_144_] = (is_133_[i_144_] + is_134_[i_144_]) / 2;
					float f;
					float f_146_;
					float f_147_;
					if (i_145_ == 1) {
						int i_148_ = class180.anIntArray1950[i_144_];
						if (i_148_ == 0) {
							f = 1.0F;
							f_147_ = 1.0F;
						} else if (i_148_ > 0) {
							f = 1.0F;
							f_147_ = (float) i_148_ / 1024.0F;
						} else {
							f_147_ = 1.0F;
							f = (float) -i_148_ / 1024.0F;
						}
						f_146_ = 64.0F / (float) class180.anIntArray1985[i_144_];
					} else if (i_145_ == 2) {
						f = 64.0F / (float) class180.anIntArray1950[i_144_];
						f_146_ = 64.0F / (float) class180.anIntArray1985[i_144_];
						f_147_ = 64.0F / (float) class180.anIntArray1986[i_144_];
					} else {
						f = (float) class180.anIntArray1950[i_144_] / 1024.0F;
						f_146_ = ((float) class180.anIntArray1985[i_144_] / 1024.0F);
						f_147_ = ((float) class180.anIntArray1986[i_144_] / 1024.0F);
					}
					fs[i_144_] = method2518(class180.aShortArray1984[i_144_], class180.aShortArray1954[i_144_], class180.aShortArray1956[i_144_], class180.aByteArray1990[i_144_] & 0xff, f, f_146_, f_147_);
				}
			}
		}
		return new Class163(this, is_125_, is_126_, is_127_, fs);
	}

	public abstract void method2495(int i);

	public abstract Class177 method2496(byte i, int i_149_, boolean bool);

	public abstract int method2497();

	public abstract int method2498();

	public abstract int method2499();

	public abstract void method2500(byte i, byte[] is);

	public abstract void method2501();

	public abstract void method2502(int i);

	public abstract void method2503(int i);

	public abstract int method2504();

	public abstract int method2505();

	public abstract byte[] method2506();

	public abstract void method2507(short i, short i_150_);

	public abstract void method2508(byte i, byte[] is);

	public abstract void method2509(short i, short i_151_);

	public abstract void method2510(int i, int i_152_, int i_153_, int i_154_);

	public abstract boolean method2511();

	public abstract boolean method2512();

	public abstract void method2513(Class433 class433);

	public abstract Class172[] method2514();

	public abstract Class156[] method2515();

	public abstract void method2516(int i);

	public abstract void method2517(Class177 class177_155_, int i, int i_156_, int i_157_, boolean bool);

	static float[] method2518(int i, int i_158_, int i_159_, int i_160_, float f, float f_161_, float f_162_) {
		float[] fs = new float[9];
		float[] fs_163_ = new float[9];
		float f_164_ = (float) Math.cos((double) ((float) i_160_ * 0.024543693F));
		float f_165_ = (float) Math.sin((double) ((float) i_160_ * 0.024543693F));
		float f_166_ = 1.0F - f_164_;
		fs[0] = f_164_;
		fs[1] = 0.0F;
		fs[2] = f_165_;
		fs[3] = 0.0F;
		fs[4] = 1.0F;
		fs[5] = 0.0F;
		fs[6] = -f_165_;
		fs[7] = 0.0F;
		fs[8] = f_164_;
		float[] fs_167_ = new float[9];
		float f_168_ = 1.0F;
		float f_169_ = 0.0F;
		f_164_ = (float) i_158_ / 32767.0F;
		f_165_ = -(float) Math.sqrt((double) (1.0F - f_164_ * f_164_));
		f_166_ = 1.0F - f_164_;
		float f_170_ = (float) Math.sqrt((double) (i * i + i_159_ * i_159_));
		if (f_170_ == 0.0F && f_164_ == 0.0F)
			fs_163_ = fs;
		else {
			if (f_170_ != 0.0F) {
				f_168_ = (float) -i_159_ / f_170_;
				f_169_ = (float) i / f_170_;
			}
			fs_167_[0] = f_164_ + f_168_ * f_168_ * f_166_;
			fs_167_[1] = f_169_ * f_165_;
			fs_167_[2] = f_169_ * f_168_ * f_166_;
			fs_167_[3] = -f_169_ * f_165_;
			fs_167_[4] = f_164_;
			fs_167_[5] = f_168_ * f_165_;
			fs_167_[6] = f_168_ * f_169_ * f_166_;
			fs_167_[7] = -f_168_ * f_165_;
			fs_167_[8] = f_164_ + f_169_ * f_169_ * f_166_;
			fs_163_[0] = fs[0] * fs_167_[0] + fs[1] * fs_167_[3] + fs[2] * fs_167_[6];
			fs_163_[1] = fs[0] * fs_167_[1] + fs[1] * fs_167_[4] + fs[2] * fs_167_[7];
			fs_163_[2] = fs[0] * fs_167_[2] + fs[1] * fs_167_[5] + fs[2] * fs_167_[8];
			fs_163_[3] = fs[3] * fs_167_[0] + fs[4] * fs_167_[3] + fs[5] * fs_167_[6];
			fs_163_[4] = fs[3] * fs_167_[1] + fs[4] * fs_167_[4] + fs[5] * fs_167_[7];
			fs_163_[5] = fs[3] * fs_167_[2] + fs[4] * fs_167_[5] + fs[5] * fs_167_[8];
			fs_163_[6] = fs[6] * fs_167_[0] + fs[7] * fs_167_[3] + fs[8] * fs_167_[6];
			fs_163_[7] = fs[6] * fs_167_[1] + fs[7] * fs_167_[4] + fs[8] * fs_167_[7];
			fs_163_[8] = fs[6] * fs_167_[2] + fs[7] * fs_167_[5] + fs[8] * fs_167_[8];
		}
		fs_163_[0] *= f;
		fs_163_[1] *= f;
		fs_163_[2] *= f;
		fs_163_[3] *= f_161_;
		fs_163_[4] *= f_161_;
		fs_163_[5] *= f_161_;
		fs_163_[6] *= f_162_;
		fs_163_[7] *= f_162_;
		fs_163_[8] *= f_162_;
		return fs_163_;
	}

	public abstract void method2519();

	public abstract void method2520(Class433 class433);

	public abstract void method2521(int i);

	public abstract int method2522();

	public abstract void method2523(int i);

	public abstract void method2524(int i);

	public abstract Class536_Sub18_Sub7 method2525(Class536_Sub18_Sub7 class536_sub18_sub7);

	public abstract void method2526(int i);

	public abstract void method2527(int i);

	public abstract int method2528();

	public abstract void method2529(int i);

	public abstract void method2530(int i, int i_171_, int i_172_);

	public abstract void method2531();

	public abstract void method2532(int i, int i_173_, int i_174_);

	public abstract void method2533(int i, int i_175_, Class160 class160, Class160 class160_176_, int i_177_, int i_178_, int i_179_);

	abstract void method2534();

	abstract void method2535();

	abstract void method2536();

	abstract void method2537();

	abstract void method2538();

	abstract boolean method2539();

	abstract boolean method2540();

	public abstract void method2541(int i);

	abstract void method2542();

	abstract void method2543();

	abstract void method2544(int i, int[] is, int i_180_, int i_181_, int i_182_, int i_183_, boolean bool);

	abstract void method2545(int i, int[] is, int i_184_, int i_185_, int i_186_, boolean bool, int i_187_, int[] is_188_);

	abstract void method2546(int i, int i_189_, int i_190_, int i_191_);

	abstract void method2547(int i, int i_192_, int i_193_, int i_194_);

	abstract void method2548(int i, int i_195_, int i_196_, int i_197_);

	public abstract boolean method2549(int i, int i_198_, Class433 class433, boolean bool, int i_199_);

	public abstract void method2550(Class433 class433, Class178 class178, int i);

	public abstract void method2551(Class433 class433, Class178 class178, int i);

	public abstract void method2552(Class433 class433, Class178 class178, int i);

	public abstract void method2553(int i);

	abstract void method2554(int i, int[] is, int i_200_, int i_201_, int i_202_, boolean bool, int i_203_, int[] is_204_);

	void method2555(Class536_Sub17 class536_sub17, Class185 class185, Class185 class185_205_, int i, int i_206_, int i_207_, boolean[] bools, boolean bool, boolean bool_208_, int i_209_, int[] is) {
		if (class185_205_ == null || i == 0) {
			for (int i_210_ = 0; i_210_ < class185.anInt2113; i_210_++) {
				short i_211_ = class185.aShortArray2119[i_210_];
				if (bools == null || bools[i_211_] == bool || class536_sub17.anIntArray10505[i_211_] == 0) {
					short i_212_ = class185.aShortArray2109[i_210_];
					if (i_212_ != -1)
						method2484(0, class536_sub17.anIntArrayArray10503[i_212_], 0, 0, 0, i_207_, bool_208_, (i_209_ & class536_sub17.anIntArray10490[i_212_]), is);
					method2484(class536_sub17.anIntArray10505[i_211_], class536_sub17.anIntArrayArray10503[i_211_], class185.aShortArray2112[i_210_], class185.aShortArray2116[i_210_], class185.aShortArray2114[i_210_], i_207_, bool_208_, i_209_ & class536_sub17.anIntArray10490[i_211_], is);
				}
			}
		} else {
			int i_213_ = 0;
			int i_214_ = 0;
			for (int i_215_ = 0; i_215_ < class536_sub17.anInt10491 * -138825073; i_215_++) {
				boolean bool_216_ = false;
				if (i_213_ < class185.anInt2113 && class185.aShortArray2119[i_213_] == i_215_)
					bool_216_ = true;
				boolean bool_217_ = false;
				if (i_214_ < class185_205_.anInt2113 && class185_205_.aShortArray2119[i_214_] == i_215_)
					bool_217_ = true;
				if (bool_216_ || bool_217_) {
					if (bools != null && bools[i_215_] != bool && class536_sub17.anIntArray10505[i_215_] != 0) {
						if (bool_216_)
							i_213_++;
						if (bool_217_)
							i_214_++;
					} else {
						int i_218_ = 0;
						int i_219_ = class536_sub17.anIntArray10505[i_215_];
						if (i_219_ == 3 || i_219_ == 10)
							i_218_ = 128;
						int i_220_;
						int i_221_;
						int i_222_;
						short i_223_;
						byte i_224_;
						if (bool_216_) {
							i_220_ = class185.aShortArray2112[i_213_];
							i_221_ = class185.aShortArray2116[i_213_];
							i_222_ = class185.aShortArray2114[i_213_];
							i_223_ = class185.aShortArray2109[i_213_];
							i_224_ = class185.aByteArray2123[i_213_];
							i_213_++;
						} else {
							i_220_ = i_218_;
							i_221_ = i_218_;
							i_222_ = i_218_;
							i_223_ = (short) -1;
							i_224_ = (byte) 0;
						}
						int i_225_;
						int i_226_;
						int i_227_;
						short i_228_;
						byte i_229_;
						if (bool_217_) {
							i_225_ = class185_205_.aShortArray2112[i_214_];
							i_226_ = class185_205_.aShortArray2116[i_214_];
							i_227_ = class185_205_.aShortArray2114[i_214_];
							i_228_ = class185_205_.aShortArray2109[i_214_];
							i_229_ = class185_205_.aByteArray2123[i_214_];
							i_214_++;
						} else {
							i_225_ = i_218_;
							i_226_ = i_218_;
							i_227_ = i_218_;
							i_228_ = (short) -1;
							i_229_ = (byte) 0;
						}
						int i_230_;
						int i_231_;
						int i_232_;
						if ((i_224_ & 0x2) != 0 || (i_229_ & 0x1) != 0) {
							i_230_ = i_220_;
							i_231_ = i_221_;
							i_232_ = i_222_;
						} else if (i_219_ == 2) {
							int i_233_ = i_225_ - i_220_ & 0x3fff;
							int i_234_ = i_226_ - i_221_ & 0x3fff;
							int i_235_ = i_227_ - i_222_ & 0x3fff;
							if (i_233_ >= 8192)
								i_233_ -= 16384;
							if (i_234_ >= 8192)
								i_234_ -= 16384;
							if (i_235_ >= 8192)
								i_235_ -= 16384;
							i_230_ = i_220_ + i_233_ * i / i_206_ & 0x3fff;
							i_231_ = i_221_ + i_234_ * i / i_206_ & 0x3fff;
							i_232_ = i_222_ + i_235_ * i / i_206_ & 0x3fff;
						} else if (i_219_ == 9) {
							int i_236_ = i_225_ - i_220_ & 0x3fff;
							if (i_236_ >= 8192)
								i_236_ -= 16384;
							i_230_ = i_220_ + i_236_ * i / i_206_ & 0x3fff;
							i_232_ = 0;
							i_231_ = 0;
						} else if (i_219_ == 7) {
							int i_237_ = i_225_ - i_220_ & 0x3f;
							if (i_237_ >= 32)
								i_237_ -= 64;
							i_230_ = i_220_ + i_237_ * i / i_206_ & 0x3f;
							i_231_ = i_221_ + (i_226_ - i_221_) * i / i_206_;
							i_232_ = i_222_ + (i_227_ - i_222_) * i / i_206_;
						} else {
							i_230_ = i_220_ + (i_225_ - i_220_) * i / i_206_;
							i_231_ = i_221_ + (i_226_ - i_221_) * i / i_206_;
							i_232_ = i_222_ + (i_227_ - i_222_) * i / i_206_;
						}
						if (i_223_ != -1)
							method2484(0, (class536_sub17.anIntArrayArray10503[i_223_]), 0, 0, 0, i_207_, bool_208_, i_209_ & (class536_sub17.anIntArray10490[i_223_]), is);
						else if (i_228_ != -1)
							method2484(0, (class536_sub17.anIntArrayArray10503[i_228_]), 0, 0, 0, i_207_, bool_208_, i_209_ & (class536_sub17.anIntArray10490[i_228_]), is);
						method2484(i_219_, class536_sub17.anIntArrayArray10503[i_215_], i_230_, i_231_, i_232_, i_207_, bool_208_, (i_209_ & class536_sub17.anIntArray10490[i_215_]), is);
					}
				}
			}
		}
	}

	public abstract Class536_Sub18_Sub7 method2556(Class536_Sub18_Sub7 class536_sub18_sub7);

	public abstract Class156[] method2557();

	public abstract Class536_Sub18_Sub7 method2558(Class536_Sub18_Sub7 class536_sub18_sub7);

	public abstract int method2559();

	public abstract void method2560();

	public abstract void method2561(Class177 class177_238_, int i, int i_239_, int i_240_, boolean bool);

	public abstract int method2562();

	public abstract int method2563();

	public abstract int method2564();

	abstract boolean method2565();

	public abstract int method2566();

	public abstract boolean method2567();

	public abstract void method2568();

	public abstract int method2569();

	public abstract int method2570();

	public abstract int method2571();

	public abstract int method2572();

	abstract void method2573();

	public abstract Class536_Sub18_Sub7 method2574(Class536_Sub18_Sub7 class536_sub18_sub7);

	public abstract int method2575();

	public abstract int method2576();

	public abstract int method2577();

	public abstract int method2578();

	public abstract int method2579();

	public abstract int method2580();

	public abstract int method2581();

	public abstract int method2582();

	public abstract int method2583();

	public abstract void method2584(int i);

	public abstract void method2585(int i);

	public abstract void method2586(int i);

	public abstract void method2587(Class433 class433, int i, boolean bool);

	public abstract void method2588(int i);

	public abstract int method2589();

	public abstract void method2590(int i);

	public abstract int method2591();

	public abstract int method2592();

	public abstract int method2593();

	public abstract void method2594(short i, short i_241_);

	public abstract void method2595(short i, short i_242_);

	public abstract void method2596(short i, short i_243_);

	public abstract int method2597();

	public abstract Class172[] method2598();

	public abstract Class172[] method2599();

	public abstract Class156[] method2600();

	public abstract boolean method2601();

	public abstract boolean method2602();

	public abstract boolean method2603();

	public abstract boolean method2604();

	public abstract boolean method2605();

	public abstract boolean method2606();

	public abstract void method2607(int i);

	public abstract boolean method2608();

	public abstract boolean method2609();

	public abstract int method2610();

	public abstract int method2611();

	public abstract int method2612();

	public abstract byte[] method2613();

	public abstract void method2614(int i);

	public abstract int method2615();

	static void method2616(int i, int i_244_, int i_245_, int i_246_, int i_247_, int i_248_, float[] fs, float f, int i_249_, float f_250_, float[] fs_251_) {
		i -= i_246_;
		i_244_ -= i_247_;
		i_245_ -= i_248_;
		float f_252_ = ((float) i * fs[0] + (float) i_244_ * fs[1] + (float) i_245_ * fs[2]);
		float f_253_ = ((float) i * fs[3] + (float) i_244_ * fs[4] + (float) i_245_ * fs[5]);
		float f_254_ = ((float) i * fs[6] + (float) i_244_ * fs[7] + (float) i_245_ * fs[8]);
		float f_255_ = (((float) Math.atan2((double) f_252_, (double) f_254_) / 6.2831855F) + 0.5F);
		if (f != 1.0F)
			f_255_ *= f;
		float f_256_ = f_253_ + 0.5F + f_250_;
		if (i_249_ == 1) {
			float f_257_ = f_255_;
			f_255_ = -f_256_;
			f_256_ = f_257_;
		} else if (i_249_ == 2) {
			f_255_ = -f_255_;
			f_256_ = -f_256_;
		} else if (i_249_ == 3) {
			float f_258_ = f_255_;
			f_255_ = f_256_;
			f_256_ = -f_258_;
		}
		fs_251_[0] = f_255_;
		fs_251_[1] = f_256_;
	}

	public abstract Class177 method2617(byte i, int i_259_, boolean bool);

	public abstract Class177 method2618(byte i, int i_260_, boolean bool);

	public abstract void method2619(Class433 class433, Class178 class178, int i);

	public abstract void method2620(int i, int i_261_, int i_262_, int i_263_);

	public abstract boolean method2621();

	public abstract int method2622();

	public abstract Class177 method2623(byte i, int i_264_, boolean bool);

	public abstract void method2624(int i);

	public abstract boolean method2625(int i, int i_265_, Class433 class433, boolean bool, int i_266_);

	public abstract void method2626(int i);
}
