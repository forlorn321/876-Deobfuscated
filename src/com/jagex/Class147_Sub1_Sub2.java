/* Class147_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class147_Sub1_Sub2 extends Class147_Sub1 {
	int[] anIntArray11380;

	public void method2440(int i, int i_0_, int i_1_) {
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is == null)
			throw new IllegalStateException("");
		if (i_1_ == 0) {
			for (int i_2_ = 0; i_2_ < anInt8880; i_2_++) {
				int i_3_ = i_2_ * anInt8877;
				int i_4_ = ((i_0_ + i_2_) * (aClass180_Sub1_8876.anInt9387 * -1173855569) + i);
				for (int i_5_ = 0; i_5_ < anInt8877; i_5_++)
					anIntArray11380[i_3_ + i_5_] = (anIntArray11380[i_3_ + i_5_] & 0xffffff | is[i_4_ + i_5_] << 8 & ~0xffffff);
			}
		} else if (i_1_ == 1) {
			for (int i_6_ = 0; i_6_ < anInt8880; i_6_++) {
				int i_7_ = i_6_ * anInt8877;
				int i_8_ = ((i_0_ + i_6_) * (aClass180_Sub1_8876.anInt9387 * -1173855569) + i);
				for (int i_9_ = 0; i_9_ < anInt8877; i_9_++)
					anIntArray11380[i_7_ + i_9_] = (anIntArray11380[i_7_ + i_9_] & 0xffffff | is[i_8_ + i_9_] << 16 & ~0xffffff);
			}
		} else if (i_1_ == 2) {
			for (int i_10_ = 0; i_10_ < anInt8880; i_10_++) {
				int i_11_ = i_10_ * anInt8877;
				int i_12_ = ((i_0_ + i_10_) * (aClass180_Sub1_8876.anInt9387 * -1173855569) + i);
				for (int i_13_ = 0; i_13_ < anInt8877; i_13_++)
					anIntArray11380[i_11_ + i_13_] = (anIntArray11380[i_11_ + i_13_] & 0xffffff | is[i_12_ + i_13_] << 24 & ~0xffffff);
			}
		} else if (i_1_ == 3) {
			for (int i_14_ = 0; i_14_ < anInt8880; i_14_++) {
				int i_15_ = i_14_ * anInt8877;
				int i_16_ = ((i_0_ + i_14_) * (aClass180_Sub1_8876.anInt9387 * -1173855569) + i);
				for (int i_17_ = 0; i_17_ < anInt8877; i_17_++)
					anIntArray11380[i_15_ + i_17_] = (anIntArray11380[i_15_ + i_17_] & 0xffffff | (is[i_16_ + i_17_] != 0 ? -16777216 : 0));
			}
		}
	}

	Class147_Sub1_Sub2(Class180_Sub1 class180_sub1, int[] is, int i, int i_18_, int i_19_, int i_20_, boolean bool) {
		super(class180_sub1, i_19_, i_20_);
		if (bool)
			anIntArray11380 = new int[i_19_ * i_20_];
		else
			anIntArray11380 = is;
		i_18_ -= anInt8877;
		int i_21_ = 0;
		for (int i_22_ = 0; i_22_ < i_20_; i_22_++) {
			for (int i_23_ = 0; i_23_ < i_19_; i_23_++)
				anIntArray11380[i_21_++] = is[i++];
			i += i_18_;
		}
	}

	Class147_Sub1_Sub2(Class180_Sub1 class180_sub1, int[] is, int i, int i_24_) {
		super(class180_sub1, i, i_24_);
		anIntArray11380 = is;
	}

	public void method2459(int i, int i_25_, int i_26_, int i_27_, int[] is, int i_28_, int i_29_) {
		i_29_ -= i_26_;
		for (int i_30_ = 0; i_30_ < i_27_; i_30_++) {
			int i_31_ = (i_25_ + i_30_) * i_26_ + i;
			for (int i_32_ = 0; i_32_ < i_26_; i_32_++)
				anIntArray11380[i_31_ + i_32_] = is[i_28_++];
			i_28_ += i_29_;
		}
	}

	void method17955(int i, int i_33_, int i_34_, int i_35_, int[] is, int i_36_, int i_37_) {
		i_37_ -= i_34_;
		for (int i_38_ = 0; i_38_ < i_35_; i_38_++) {
			int i_39_ = (i_33_ + i_38_) * i_34_ + i;
			for (int i_40_ = 0; i_40_ < i_34_; i_40_++)
				is[i_36_++] = anIntArray11380[i_39_ + i_40_];
			i_36_ += i_37_;
		}
	}

	public void method2412(int i, int i_41_, int i_42_, int i_43_, int[] is, int[] is_44_, int i_45_, int i_46_) {
		method17955(i, i_41_, i_42_, i_43_, is, i_45_, i_46_);
	}

	public void method2445(int i, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_) {
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is == null)
			throw new IllegalStateException("");
		for (int i_52_ = 0; i_52_ < i_49_; i_52_++) {
			int i_53_ = (i_47_ + i_52_) * i_48_ + i;
			int i_54_ = (i_51_ + i_52_) * i_48_ + i_50_;
			for (int i_55_ = 0; i_55_ < i_48_; i_55_++)
				anIntArray11380[i_53_ + i_55_] = is[i_54_ + i_55_] & 0xffffff;
		}
	}

	void method17956(int i, int i_56_, int[] is, int i_57_, int i_58_) {
		if (i_58_ == 0) {
			if (i_57_ == 1)
				is[i_56_] = anIntArray11380[i];
			else if (i_57_ == 0) {
				int i_59_ = anIntArray11380[i++];
				int i_60_ = (i_59_ & 0xff0000) * anInt8906 & ~0xffffff;
				int i_61_ = (i_59_ & 0xff00) * anInt8907 & 0xff0000;
				int i_62_ = (i_59_ & 0xff) * anInt8908 & 0xff00;
				is[i_56_] = (i_60_ | i_61_ | i_62_) >>> 8;
			} else if (i_57_ == 3) {
				int i_63_ = anIntArray11380[i++];
				int i_64_ = anInt8894;
				int i_65_ = i_63_ + i_64_;
				int i_66_ = (i_63_ & 0xff00ff) + (i_64_ & 0xff00ff);
				int i_67_ = (i_66_ & 0x1000100) + (i_65_ - i_66_ & 0x10000);
				is[i_56_] = i_65_ - i_67_ | i_67_ - (i_67_ >>> 8);
			} else if (i_57_ == 2) {
				int i_68_ = anIntArray11380[i];
				int i_69_ = (i_68_ & 0xff00ff) * anInt8904 & ~0xff00ff;
				int i_70_ = (i_68_ & 0xff00) * anInt8904 & 0xff0000;
				is[i_56_] = ((i_69_ | i_70_) >>> 8) + anInt8911;
			} else
				throw new IllegalArgumentException();
		} else if (i_58_ == 1) {
			if (i_57_ == 1) {
				int i_71_ = anIntArray11380[i];
				int i_72_ = i_71_ >>> 24;
				int i_73_ = 256 - i_72_;
				int i_74_ = is[i_56_];
				is[i_56_] = (((i_71_ & 0xff00ff) * i_72_ + (i_74_ & 0xff00ff) * i_73_ & ~0xff00ff) + ((i_71_ & 0xff00) * i_72_ + (i_74_ & 0xff00) * i_73_ & 0xff0000)) >> 8;
			} else if (i_57_ == 0) {
				int i_75_ = anIntArray11380[i];
				int i_76_ = (i_75_ >>> 24) * anInt8904 >> 8;
				int i_77_ = 256 - i_76_;
				if ((anInt8894 & 0xffffff) == 16777215) {
					int i_78_ = is[i_56_];
					is[i_56_] = ((((i_75_ & 0xff00ff) * i_76_ + (i_78_ & 0xff00ff) * i_77_) & ~0xff00ff) + (((i_75_ & 0xff00) * i_76_ + (i_78_ & 0xff00) * i_77_) & 0xff0000)) >> 8;
				} else if (i_76_ != 255) {
					int i_79_ = (i_75_ & 0xff0000) * anInt8906 & ~0xffffff;
					int i_80_ = (i_75_ & 0xff00) * anInt8907 & 0xff0000;
					int i_81_ = (i_75_ & 0xff) * anInt8908 & 0xff00;
					i_75_ = (i_79_ | i_80_ | i_81_) >>> 8;
					int i_82_ = is[i_56_];
					is[i_56_] = ((((i_75_ & 0xff00ff) * i_76_ + (i_82_ & 0xff00ff) * i_77_) & ~0xff00ff) + (((i_75_ & 0xff00) * i_76_ + (i_82_ & 0xff00) * i_77_) & 0xff0000)) >> 8;
				} else {
					int i_83_ = (i_75_ & 0xff0000) * anInt8906 & ~0xffffff;
					int i_84_ = (i_75_ & 0xff00) * anInt8907 & 0xff0000;
					int i_85_ = (i_75_ & 0xff) * anInt8908 & 0xff00;
					is[i_56_] = (i_83_ | i_84_ | i_85_) >>> 8;
				}
			} else if (i_57_ == 3) {
				int i_86_ = anIntArray11380[i];
				int i_87_ = anInt8894;
				int i_88_ = i_86_ + i_87_;
				int i_89_ = (i_86_ & 0xff00ff) + (i_87_ & 0xff00ff);
				int i_90_ = (i_89_ & 0x1000100) + (i_88_ - i_89_ & 0x10000);
				i_90_ = i_88_ - i_90_ | i_90_ - (i_90_ >>> 8);
				int i_91_ = (i_86_ >>> 24) * anInt8904 >> 8;
				int i_92_ = 256 - i_91_;
				if (i_91_ != 255) {
					i_86_ = i_90_;
					i_90_ = is[i_56_];
					i_90_ = ((((i_86_ & 0xff00ff) * i_91_ + (i_90_ & 0xff00ff) * i_92_) & ~0xff00ff) + (((i_86_ & 0xff00) * i_91_ + (i_90_ & 0xff00) * i_92_) & 0xff0000)) >> 8;
				}
				is[i_56_] = i_90_;
			} else if (i_57_ == 2) {
				int i_93_ = anIntArray11380[i];
				int i_94_ = i_93_ >>> 24;
				int i_95_ = 256 - i_94_;
				int i_96_ = (i_93_ & 0xff00ff) * anInt8904 & ~0xff00ff;
				int i_97_ = (i_93_ & 0xff00) * anInt8904 & 0xff0000;
				i_93_ = ((i_96_ | i_97_) >>> 8) + anInt8911;
				int i_98_ = is[i_56_];
				is[i_56_] = (((i_93_ & 0xff00ff) * i_94_ + (i_98_ & 0xff00ff) * i_95_ & ~0xff00ff) + ((i_93_ & 0xff00) * i_94_ + (i_98_ & 0xff00) * i_95_ & 0xff0000)) >> 8;
			} else
				throw new IllegalArgumentException();
		} else if (i_58_ == 2) {
			if (i_57_ == 1) {
				int i_99_ = anIntArray11380[i];
				int i_100_ = is[i_56_];
				int i_101_ = i_99_ + i_100_;
				int i_102_ = (i_99_ & 0xff00ff) + (i_100_ & 0xff00ff);
				i_100_ = (i_102_ & 0x1000100) + (i_101_ - i_102_ & 0x10000);
				is[i_56_] = i_101_ - i_100_ | i_100_ - (i_100_ >>> 8);
			} else if (i_57_ == 0) {
				int i_103_ = anIntArray11380[i];
				int i_104_ = (i_103_ & 0xff0000) * anInt8906 & ~0xffffff;
				int i_105_ = (i_103_ & 0xff00) * anInt8907 & 0xff0000;
				int i_106_ = (i_103_ & 0xff) * anInt8908 & 0xff00;
				i_103_ = (i_104_ | i_105_ | i_106_) >>> 8;
				int i_107_ = is[i_56_];
				int i_108_ = i_103_ + i_107_;
				int i_109_ = (i_103_ & 0xff00ff) + (i_107_ & 0xff00ff);
				i_107_ = (i_109_ & 0x1000100) + (i_108_ - i_109_ & 0x10000);
				is[i_56_] = i_108_ - i_107_ | i_107_ - (i_107_ >>> 8);
			} else if (i_57_ == 3) {
				int i_110_ = anIntArray11380[i];
				int i_111_ = anInt8894;
				int i_112_ = i_110_ + i_111_;
				int i_113_ = (i_110_ & 0xff00ff) + (i_111_ & 0xff00ff);
				int i_114_ = (i_113_ & 0x1000100) + (i_112_ - i_113_ & 0x10000);
				i_110_ = i_112_ - i_114_ | i_114_ - (i_114_ >>> 8);
				i_114_ = is[i_56_];
				i_112_ = i_110_ + i_114_;
				i_113_ = (i_110_ & 0xff00ff) + (i_114_ & 0xff00ff);
				i_114_ = (i_113_ & 0x1000100) + (i_112_ - i_113_ & 0x10000);
				is[i_56_] = i_112_ - i_114_ | i_114_ - (i_114_ >>> 8);
			} else if (i_57_ == 2) {
				int i_115_ = anIntArray11380[i];
				int i_116_ = (i_115_ & 0xff00ff) * anInt8904 & ~0xff00ff;
				int i_117_ = (i_115_ & 0xff00) * anInt8904 & 0xff0000;
				i_115_ = ((i_116_ | i_117_) >>> 8) + anInt8911;
				int i_118_ = is[i_56_];
				int i_119_ = i_115_ + i_118_;
				int i_120_ = (i_115_ & 0xff00ff) + (i_118_ & 0xff00ff);
				i_118_ = (i_120_ & 0x1000100) + (i_119_ - i_120_ & 0x10000);
				is[i_56_] = i_119_ - i_118_ | i_118_ - (i_118_ >>> 8);
			}
		} else
			throw new IllegalArgumentException();
	}

	public Interface21 method2454() {
		return new Class98(anInt8877, anInt8880, anIntArray11380);
	}

	public void method2438(int i, int i_121_, Class142 class142, int i_122_, int i_123_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is != null) {
			i += anInt8879;
			i_121_ += anInt8895;
			int i_124_ = 0;
			int i_125_ = aClass180_Sub1_8876.anInt9387 * -1173855569;
			int i_126_ = anInt8877;
			int i_127_ = anInt8880;
			int i_128_ = i_125_ - i_126_;
			int i_129_ = 0;
			int i_130_ = i + i_121_ * i_125_;
			if (i_121_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
				int i_131_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_121_;
				i_127_ -= i_131_;
				i_121_ = aClass180_Sub1_8876.anInt9392 * -456655989;
				i_124_ += i_131_ * i_126_;
				i_130_ += i_131_ * i_125_;
			}
			if (i_121_ + i_127_ > aClass180_Sub1_8876.anInt9393 * -383695469)
				i_127_ -= (i_121_ + i_127_ - aClass180_Sub1_8876.anInt9393 * -383695469);
			if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
				int i_132_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
				i_126_ -= i_132_;
				i = aClass180_Sub1_8876.anInt9383 * 1605202751;
				i_124_ += i_132_;
				i_130_ += i_132_;
				i_129_ += i_132_;
				i_128_ += i_132_;
			}
			if (i + i_126_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
				int i_133_ = i + i_126_ - aClass180_Sub1_8876.anInt9391 * 2014358275;
				i_126_ -= i_133_;
				i_129_ += i_133_;
				i_128_ += i_133_;
			}
			if (i_126_ > 0 && i_127_ > 0) {
				Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
				int[] is_134_ = class142_sub1.anIntArray9002;
				int[] is_135_ = class142_sub1.anIntArray9003;
				int i_136_ = i_121_;
				if (i_123_ > i_136_) {
					i_136_ = i_123_;
					i_130_ += (i_123_ - i_121_) * i_125_;
					i_124_ += (i_123_ - i_121_) * anInt8877;
				}
				int i_137_ = (i_123_ + is_134_.length < i_121_ + i_127_ ? i_123_ + is_134_.length : i_121_ + i_127_);
				for (int i_138_ = i_136_; i_138_ < i_137_; i_138_++) {
					int i_139_ = is_134_[i_138_ - i_123_] + i_122_;
					int i_140_ = is_135_[i_138_ - i_123_];
					int i_141_ = i_126_;
					if (i > i_139_) {
						int i_142_ = i - i_139_;
						if (i_142_ >= i_140_) {
							i_124_ += i_126_ + i_129_;
							i_130_ += i_126_ + i_128_;
							continue;
						}
						i_140_ -= i_142_;
					} else {
						int i_143_ = i_139_ - i;
						if (i_143_ >= i_126_) {
							i_124_ += i_126_ + i_129_;
							i_130_ += i_126_ + i_128_;
							continue;
						}
						i_124_ += i_143_;
						i_141_ -= i_143_;
						i_130_ += i_143_;
					}
					int i_144_ = 0;
					if (i_141_ < i_140_)
						i_140_ = i_141_;
					else
						i_144_ = i_141_ - i_140_;
					for (int i_145_ = -i_140_; i_145_ < 0; i_145_++) {
						int i_146_ = anIntArray11380[i_124_++];
						int i_147_ = i_146_ >>> 24;
						int i_148_ = 256 - i_147_;
						int i_149_ = is[i_130_];
						is[i_130_++] = ((((i_146_ & 0xff00ff) * i_147_ + (i_149_ & 0xff00ff) * i_148_) & ~0xff00ff) + (((i_146_ & 0xff00) * i_147_ + (i_149_ & 0xff00) * i_148_) & 0xff0000)) >> 8;
					}
					i_124_ += i_144_ + i_129_;
					i_130_ += i_144_ + i_128_;
				}
			}
		}
	}

	Class147_Sub1_Sub2(Class180_Sub1 class180_sub1, int i, int i_150_) {
		super(class180_sub1, i, i_150_);
		anIntArray11380 = new int[i * i_150_];
	}

	void method14425(int i, int i_151_) {
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is != null) {
			if (anInt8893 == 0) {
				if (anInt8909 == 0) {
					int i_152_ = anInt8903;
					while (i_152_ < 0) {
						int i_153_ = anInt8892;
						int i_154_ = anInt8899;
						int i_155_ = anInt8900;
						int i_156_ = anInt8888;
						if (i_154_ >= 0 && i_155_ >= 0 && i_154_ - (anInt8877 << 12) < 0 && i_155_ - (anInt8880 << 12) < 0) {
							for (/**/; i_156_ < 0; i_156_++)
								method17961(((i_155_ >> 12) * anInt8877 + (i_154_ >> 12)), i_153_++, is, i, i_151_);
						}
						i_152_++;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_157_ = anInt8903;
					while (i_157_ < 0) {
						int i_158_ = anInt8892;
						int i_159_ = anInt8899;
						int i_160_ = anInt8900 + anInt8902;
						int i_161_ = anInt8888;
						if (i_159_ >= 0 && i_159_ - (anInt8877 << 12) < 0) {
							int i_162_;
							if ((i_162_ = i_160_ - (anInt8880 << 12)) >= 0) {
								i_162_ = (anInt8909 - i_162_) / anInt8909;
								i_161_ += i_162_;
								i_160_ += anInt8909 * i_162_;
								i_158_ += i_162_;
							}
							if ((i_162_ = (i_160_ - anInt8909) / anInt8909) > i_161_)
								i_161_ = i_162_;
							for (/**/; i_161_ < 0; i_161_++) {
								method17961(((i_160_ >> 12) * anInt8877 + (i_159_ >> 12)), i_158_++, is, i, i_151_);
								i_160_ += anInt8909;
							}
						}
						i_157_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				} else {
					int i_163_ = anInt8903;
					while (i_163_ < 0) {
						int i_164_ = anInt8892;
						int i_165_ = anInt8899;
						int i_166_ = anInt8900 + anInt8902;
						int i_167_ = anInt8888;
						if (i_165_ >= 0 && i_165_ - (anInt8877 << 12) < 0) {
							if (i_166_ < 0) {
								int i_168_ = (anInt8909 - 1 - i_166_) / anInt8909;
								i_167_ += i_168_;
								i_166_ += anInt8909 * i_168_;
								i_164_ += i_168_;
							}
							int i_169_;
							if ((i_169_ = (1 + i_166_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_167_)
								i_167_ = i_169_;
							for (/**/; i_167_ < 0; i_167_++) {
								method17961(((i_166_ >> 12) * anInt8877 + (i_165_ >> 12)), i_164_++, is, i, i_151_);
								i_166_ += anInt8909;
							}
						}
						i_163_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8893 < 0) {
				if (anInt8909 == 0) {
					int i_170_ = anInt8903;
					while (i_170_ < 0) {
						int i_171_ = anInt8892;
						int i_172_ = anInt8899 + anInt8890;
						int i_173_ = anInt8900;
						int i_174_ = anInt8888;
						if (i_173_ >= 0 && i_173_ - (anInt8880 << 12) < 0) {
							int i_175_;
							if ((i_175_ = i_172_ - (anInt8877 << 12)) >= 0) {
								i_175_ = (anInt8893 - i_175_) / anInt8893;
								i_174_ += i_175_;
								i_172_ += anInt8893 * i_175_;
								i_171_ += i_175_;
							}
							if ((i_175_ = (i_172_ - anInt8893) / anInt8893) > i_174_)
								i_174_ = i_175_;
							for (/**/; i_174_ < 0; i_174_++) {
								method17961(((i_173_ >> 12) * anInt8877 + (i_172_ >> 12)), i_171_++, is, i, i_151_);
								i_172_ += anInt8893;
							}
						}
						i_170_++;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_176_ = anInt8903;
					while (i_176_ < 0) {
						int i_177_ = anInt8892;
						int i_178_ = anInt8899 + anInt8890;
						int i_179_ = anInt8900 + anInt8902;
						int i_180_ = anInt8888;
						int i_181_;
						if ((i_181_ = i_178_ - (anInt8877 << 12)) >= 0) {
							i_181_ = (anInt8893 - i_181_) / anInt8893;
							i_180_ += i_181_;
							i_178_ += anInt8893 * i_181_;
							i_179_ += anInt8909 * i_181_;
							i_177_ += i_181_;
						}
						if ((i_181_ = (i_178_ - anInt8893) / anInt8893) > i_180_)
							i_180_ = i_181_;
						if ((i_181_ = i_179_ - (anInt8880 << 12)) >= 0) {
							i_181_ = (anInt8909 - i_181_) / anInt8909;
							i_180_ += i_181_;
							i_178_ += anInt8893 * i_181_;
							i_179_ += anInt8909 * i_181_;
							i_177_ += i_181_;
						}
						if ((i_181_ = (i_179_ - anInt8909) / anInt8909) > i_180_)
							i_180_ = i_181_;
						for (/**/; i_180_ < 0; i_180_++) {
							method17961((i_179_ >> 12) * anInt8877 + (i_178_ >> 12), i_177_++, is, i, i_151_);
							i_178_ += anInt8893;
							i_179_ += anInt8909;
						}
						i_176_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else {
					int i_182_ = anInt8903;
					while (i_182_ < 0) {
						int i_183_ = anInt8892;
						int i_184_ = anInt8899 + anInt8890;
						int i_185_ = anInt8900 + anInt8902;
						int i_186_ = anInt8888;
						int i_187_;
						if ((i_187_ = i_184_ - (anInt8877 << 12)) >= 0) {
							i_187_ = (anInt8893 - i_187_) / anInt8893;
							i_186_ += i_187_;
							i_184_ += anInt8893 * i_187_;
							i_185_ += anInt8909 * i_187_;
							i_183_ += i_187_;
						}
						if ((i_187_ = (i_184_ - anInt8893) / anInt8893) > i_186_)
							i_186_ = i_187_;
						if (i_185_ < 0) {
							i_187_ = (anInt8909 - 1 - i_185_) / anInt8909;
							i_186_ += i_187_;
							i_184_ += anInt8893 * i_187_;
							i_185_ += anInt8909 * i_187_;
							i_183_ += i_187_;
						}
						if ((i_187_ = (1 + i_185_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_186_)
							i_186_ = i_187_;
						for (/**/; i_186_ < 0; i_186_++) {
							method17961((i_185_ >> 12) * anInt8877 + (i_184_ >> 12), i_183_++, is, i, i_151_);
							i_184_ += anInt8893;
							i_185_ += anInt8909;
						}
						i_182_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8909 == 0) {
				int i_188_ = anInt8903;
				while (i_188_ < 0) {
					int i_189_ = anInt8892;
					int i_190_ = anInt8899 + anInt8890;
					int i_191_ = anInt8900;
					int i_192_ = anInt8888;
					if (i_191_ >= 0 && i_191_ - (anInt8880 << 12) < 0) {
						if (i_190_ < 0) {
							int i_193_ = (anInt8893 - 1 - i_190_) / anInt8893;
							i_192_ += i_193_;
							i_190_ += anInt8893 * i_193_;
							i_189_ += i_193_;
						}
						int i_194_;
						if ((i_194_ = (1 + i_190_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_192_)
							i_192_ = i_194_;
						for (/**/; i_192_ < 0; i_192_++) {
							method17961((i_191_ >> 12) * anInt8877 + (i_190_ >> 12), i_189_++, is, i, i_151_);
							i_190_ += anInt8893;
						}
					}
					i_188_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else if (anInt8909 < 0) {
				for (int i_195_ = anInt8903; i_195_ < 0; i_195_++) {
					int i_196_ = anInt8892;
					int i_197_ = anInt8899 + anInt8890;
					int i_198_ = anInt8900 + anInt8902;
					int i_199_ = anInt8888;
					if (i_197_ < 0) {
						int i_200_ = (anInt8893 - 1 - i_197_) / anInt8893;
						i_199_ += i_200_;
						i_197_ += anInt8893 * i_200_;
						i_198_ += anInt8909 * i_200_;
						i_196_ += i_200_;
					}
					int i_201_;
					if ((i_201_ = ((1 + i_197_ - (anInt8877 << 12) - anInt8893) / anInt8893)) > i_199_)
						i_199_ = i_201_;
					if ((i_201_ = i_198_ - (anInt8880 << 12)) >= 0) {
						i_201_ = (anInt8909 - i_201_) / anInt8909;
						i_199_ += i_201_;
						i_197_ += anInt8893 * i_201_;
						i_198_ += anInt8909 * i_201_;
						i_196_ += i_201_;
					}
					if ((i_201_ = (i_198_ - anInt8909) / anInt8909) > i_199_)
						i_199_ = i_201_;
					for (/**/; i_199_ < 0; i_199_++) {
						method17961((i_198_ >> 12) * anInt8877 + (i_197_ >> 12), i_196_++, is, i, i_151_);
						i_197_ += anInt8893;
						i_198_ += anInt8909;
					}
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else {
				for (int i_202_ = anInt8903; i_202_ < 0; i_202_++) {
					int i_203_ = anInt8892;
					int i_204_ = anInt8899 + anInt8890;
					int i_205_ = anInt8900 + anInt8902;
					int i_206_ = anInt8888;
					if (i_204_ < 0) {
						int i_207_ = (anInt8893 - 1 - i_204_) / anInt8893;
						i_206_ += i_207_;
						i_204_ += anInt8893 * i_207_;
						i_205_ += anInt8909 * i_207_;
						i_203_ += i_207_;
					}
					int i_208_;
					if ((i_208_ = ((1 + i_204_ - (anInt8877 << 12) - anInt8893) / anInt8893)) > i_206_)
						i_206_ = i_208_;
					if (i_205_ < 0) {
						i_208_ = (anInt8909 - 1 - i_205_) / anInt8909;
						i_206_ += i_208_;
						i_204_ += anInt8893 * i_208_;
						i_205_ += anInt8909 * i_208_;
						i_203_ += i_208_;
					}
					if ((i_208_ = ((1 + i_205_ - (anInt8880 << 12) - anInt8909) / anInt8909)) > i_206_)
						i_206_ = i_208_;
					for (/**/; i_206_ < 0; i_206_++) {
						method17961((i_205_ >> 12) * anInt8877 + (i_204_ >> 12), i_203_++, is, i, i_151_);
						i_204_ += anInt8893;
						i_205_ += anInt8909;
					}
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			}
		}
	}

	void method14430(boolean bool, boolean bool_209_, boolean bool_210_, int i, int i_211_, float f, int i_212_, int i_213_, int i_214_, int i_215_, int i_216_, int i_217_, boolean bool_218_) {
		if (i_212_ > 0 && i_213_ > 0 && (bool || bool_209_)) {
			int i_219_ = 0;
			int i_220_ = 0;
			int i_221_ = anInt8879 + anInt8877 + anInt8878;
			int i_222_ = anInt8895 + anInt8880 + anInt8882;
			int i_223_ = (i_221_ << 16) / i_212_;
			int i_224_ = (i_222_ << 16) / i_213_;
			if (anInt8879 > 0) {
				int i_225_ = ((anInt8879 << 16) + i_223_ - 1) / i_223_;
				i += i_225_;
				i_219_ += i_225_ * i_223_ - (anInt8879 << 16);
			}
			if (anInt8895 > 0) {
				int i_226_ = ((anInt8895 << 16) + i_224_ - 1) / i_224_;
				i_211_ += i_226_;
				i_220_ += i_226_ * i_224_ - (anInt8895 << 16);
			}
			if (anInt8877 < i_221_)
				i_212_ = ((anInt8877 << 16) - i_219_ + i_223_ - 1) / i_223_;
			if (anInt8880 < i_222_)
				i_213_ = ((anInt8880 << 16) - i_220_ + i_224_ - 1) / i_224_;
			int i_227_ = i + i_211_ * (aClass180_Sub1_8876.anInt9387 * -1173855569);
			int i_228_ = aClass180_Sub1_8876.anInt9387 * -1173855569 - i_212_;
			if (i_211_ + i_213_ > aClass180_Sub1_8876.anInt9393 * -383695469)
				i_213_ -= (i_211_ + i_213_ - aClass180_Sub1_8876.anInt9393 * -383695469);
			if (i_211_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
				int i_229_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_211_;
				i_213_ -= i_229_;
				i_227_ += i_229_ * (aClass180_Sub1_8876.anInt9387 * -1173855569);
				i_220_ += i_224_ * i_229_;
			}
			if (i + i_212_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
				int i_230_ = i + i_212_ - aClass180_Sub1_8876.anInt9391 * 2014358275;
				i_212_ -= i_230_;
				i_228_ += i_230_;
			}
			if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
				int i_231_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
				i_212_ -= i_231_;
				i_227_ += i_231_;
				i_219_ += i_223_ * i_231_;
				i_228_ += i_231_;
			}
			float[] fs = aClass180_Sub1_8876.aFloatArray9389;
			int[] is = aClass180_Sub1_8876.anIntArray9386;
			if (i_216_ == 0) {
				if (i_214_ == 1) {
					int i_232_ = i_219_;
					for (int i_233_ = -i_213_; i_233_ < 0; i_233_++) {
						int i_234_ = (i_220_ >> 16) * anInt8877;
						for (int i_235_ = -i_212_; i_235_ < 0; i_235_++) {
							if (!bool_209_ || f < fs[i_227_]) {
								if (bool)
									is[i_227_] = (anIntArray11380[(i_219_ >> 16) + i_234_]);
								if (bool_209_ && bool_218_)
									fs[i_227_] = f;
							}
							i_219_ += i_223_;
							i_227_++;
						}
						i_220_ += i_224_;
						i_219_ = i_232_;
						i_227_ += i_228_;
					}
				} else if (i_214_ == 0) {
					int i_236_ = (i_215_ & 0xff0000) >> 16;
					int i_237_ = (i_215_ & 0xff00) >> 8;
					int i_238_ = i_215_ & 0xff;
					int i_239_ = i_219_;
					for (int i_240_ = -i_213_; i_240_ < 0; i_240_++) {
						int i_241_ = (i_220_ >> 16) * anInt8877;
						for (int i_242_ = -i_212_; i_242_ < 0; i_242_++) {
							if (!bool_209_ || f < fs[i_227_]) {
								if (bool) {
									int i_243_ = (anIntArray11380[(i_219_ >> 16) + i_241_]);
									int i_244_ = ((i_243_ & 0xff0000) * i_236_ & ~0xffffff);
									int i_245_ = ((i_243_ & 0xff00) * i_237_ & 0xff0000);
									int i_246_ = (i_243_ & 0xff) * i_238_ & 0xff00;
									is[i_227_] = (i_244_ | i_245_ | i_246_) >>> 8;
								}
								if (bool_209_ && bool_218_)
									fs[i_227_] = f;
							}
							i_219_ += i_223_;
							i_227_++;
						}
						i_220_ += i_224_;
						i_219_ = i_239_;
						i_227_ += i_228_;
					}
				} else if (i_214_ == 3) {
					int i_247_ = i_219_;
					for (int i_248_ = -i_213_; i_248_ < 0; i_248_++) {
						int i_249_ = (i_220_ >> 16) * anInt8877;
						for (int i_250_ = -i_212_; i_250_ < 0; i_250_++) {
							if (!bool_209_ || f < fs[i_227_]) {
								if (bool) {
									int i_251_ = (anIntArray11380[(i_219_ >> 16) + i_249_]);
									int i_252_ = i_251_ + i_215_;
									int i_253_ = ((i_251_ & 0xff00ff) + (i_215_ & 0xff00ff));
									int i_254_ = ((i_253_ & 0x1000100) + (i_252_ - i_253_ & 0x10000));
									is[i_227_] = i_252_ - i_254_ | i_254_ - (i_254_ >>> 8);
								}
								if (bool_209_ && bool_218_)
									fs[i_227_] = f;
							}
							i_219_ += i_223_;
							i_227_++;
						}
						i_220_ += i_224_;
						i_219_ = i_247_;
						i_227_ += i_228_;
					}
				} else if (i_214_ == 2) {
					int i_255_ = i_215_ >>> 24;
					int i_256_ = 256 - i_255_;
					int i_257_ = (i_215_ & 0xff00ff) * i_256_ & ~0xff00ff;
					int i_258_ = (i_215_ & 0xff00) * i_256_ & 0xff0000;
					i_215_ = (i_257_ | i_258_) >>> 8;
					int i_259_ = i_219_;
					for (int i_260_ = -i_213_; i_260_ < 0; i_260_++) {
						int i_261_ = (i_220_ >> 16) * anInt8877;
						for (int i_262_ = -i_212_; i_262_ < 0; i_262_++) {
							if (!bool_209_ || f < fs[i_227_]) {
								if (bool) {
									int i_263_ = (anIntArray11380[(i_219_ >> 16) + i_261_]);
									i_257_ = ((i_263_ & 0xff00ff) * i_255_ & ~0xff00ff);
									i_258_ = ((i_263_ & 0xff00) * i_255_ & 0xff0000);
									is[i_227_] = ((i_257_ | i_258_) >>> 8) + i_215_;
								}
								if (bool_209_ && bool_218_)
									fs[i_227_] = f;
							}
							i_219_ += i_223_;
							i_227_++;
						}
						i_220_ += i_224_;
						i_219_ = i_259_;
						i_227_ += i_228_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_216_ == 1) {
				if (i_214_ == 1) {
					int i_264_ = i_219_;
					for (int i_265_ = -i_213_; i_265_ < 0; i_265_++) {
						int i_266_ = (i_220_ >> 16) * anInt8877;
						for (int i_267_ = -i_212_; i_267_ < 0; i_267_++) {
							if (!bool_209_ || f < fs[i_227_]) {
								if (bool) {
									int i_268_ = (anIntArray11380[(i_219_ >> 16) + i_266_]);
									int i_269_ = i_268_ >>> 24;
									int i_270_ = 256 - i_269_;
									int i_271_ = is[i_227_];
									is[i_227_] = (((((i_268_ & 0xff00ff) * i_269_ + (i_271_ & 0xff00ff) * i_270_) & ~0xff00ff) >> 8) + (((((i_268_ & ~0xff00ff) >>> 8) * i_269_) + (((i_271_ & ~0xff00ff) >>> 8) * i_270_)) & ~0xff00ff));
								}
								if (bool_209_ && bool_218_)
									fs[i_227_] = f;
							}
							i_219_ += i_223_;
							i_227_++;
						}
						i_220_ += i_224_;
						i_219_ = i_264_;
						i_227_ += i_228_;
					}
				} else if (i_214_ == 0) {
					int i_272_ = i_219_;
					if ((i_215_ & 0xffffff) == 16777215) {
						for (int i_273_ = -i_213_; i_273_ < 0; i_273_++) {
							int i_274_ = (i_220_ >> 16) * anInt8877;
							for (int i_275_ = -i_212_; i_275_ < 0; i_275_++) {
								if (!bool_209_ || f < fs[i_227_]) {
									if (bool) {
										int i_276_ = (anIntArray11380[(i_219_ >> 16) + i_274_]);
										int i_277_ = ((i_276_ >>> 24) * (i_215_ >>> 24) >> 8);
										int i_278_ = 256 - i_277_;
										int i_279_ = is[i_227_];
										is[i_227_] = ((((i_276_ & 0xff00ff) * i_277_ + ((i_279_ & 0xff00ff) * i_278_)) & ~0xff00ff) + (((i_276_ & 0xff00) * i_277_ + ((i_279_ & 0xff00) * i_278_)) & 0xff0000)) >> 8;
									}
									if (bool_209_ && bool_218_)
										fs[i_227_] = f;
								}
								i_219_ += i_223_;
								i_227_++;
							}
							i_220_ += i_224_;
							i_219_ = i_272_;
							i_227_ += i_228_;
						}
					} else {
						int i_280_ = (i_215_ & 0xff0000) >> 16;
						int i_281_ = (i_215_ & 0xff00) >> 8;
						int i_282_ = i_215_ & 0xff;
						for (int i_283_ = -i_213_; i_283_ < 0; i_283_++) {
							int i_284_ = (i_220_ >> 16) * anInt8877;
							for (int i_285_ = -i_212_; i_285_ < 0; i_285_++) {
								if (!bool_209_ || f < fs[i_227_]) {
									int i_286_ = (anIntArray11380[(i_219_ >> 16) + i_284_]);
									int i_287_ = ((i_286_ >>> 24) * (i_215_ >>> 24) >> 8);
									int i_288_ = 256 - i_287_;
									if (i_287_ != 255) {
										if (bool) {
											int i_289_ = ((i_286_ & 0xff0000) * i_280_ & ~0xffffff);
											int i_290_ = ((i_286_ & 0xff00) * i_281_ & 0xff0000);
											int i_291_ = ((i_286_ & 0xff) * i_282_ & 0xff00);
											i_286_ = (i_289_ | i_290_ | i_291_) >>> 8;
											int i_292_ = is[i_227_];
											is[i_227_] = (((((i_286_ & 0xff00ff) * i_287_) + ((i_292_ & 0xff00ff) * i_288_)) & ~0xff00ff) + ((((i_286_ & 0xff00) * i_287_) + ((i_292_ & 0xff00) * i_288_)) & 0xff0000)) >> 8;
											if (bool_210_) {
												int i_293_ = (i_292_ >>> 24) + i_287_;
												if (i_293_ > 255)
													i_293_ = 255;
												is[i_227_] |= i_293_ << 24;
											}
										}
										if (bool_209_ && bool_218_)
											fs[i_227_] = f;
									} else {
										if (bool) {
											int i_294_ = ((i_286_ & 0xff0000) * i_280_ & ~0xffffff);
											int i_295_ = ((i_286_ & 0xff00) * i_281_ & 0xff0000);
											int i_296_ = ((i_286_ & 0xff) * i_282_ & 0xff00);
											is[i_227_] = (i_294_ | i_295_ | i_296_) >>> 8;
										}
										if (bool_209_ && bool_218_)
											fs[i_227_] = f;
									}
								}
								i_219_ += i_223_;
								i_227_++;
							}
							i_220_ += i_224_;
							i_219_ = i_272_;
							i_227_ += i_228_;
						}
					}
				} else if (i_214_ == 3) {
					int i_297_ = i_219_;
					for (int i_298_ = -i_213_; i_298_ < 0; i_298_++) {
						int i_299_ = (i_220_ >> 16) * anInt8877;
						for (int i_300_ = -i_212_; i_300_ < 0; i_300_++) {
							if (!bool_209_ || f < fs[i_227_]) {
								if (bool) {
									int i_301_ = (anIntArray11380[(i_219_ >> 16) + i_299_]);
									int i_302_ = i_301_ + i_215_;
									int i_303_ = ((i_301_ & 0xff00ff) + (i_215_ & 0xff00ff));
									int i_304_ = ((i_303_ & 0x1000100) + (i_302_ - i_303_ & 0x10000));
									i_304_ = i_302_ - i_304_ | i_304_ - (i_304_ >>> 8);
									int i_305_ = ((i_304_ >>> 24) * (i_215_ >>> 24) >> 8);
									int i_306_ = 256 - i_305_;
									if (i_305_ != 255) {
										i_301_ = i_304_;
										i_304_ = is[i_227_];
										i_304_ = ((((i_301_ & 0xff00ff) * i_305_ + ((i_304_ & 0xff00ff) * i_306_)) & ~0xff00ff) + (((i_301_ & 0xff00) * i_305_ + ((i_304_ & 0xff00) * i_306_)) & 0xff0000)) >> 8;
									}
									is[i_227_] = i_304_;
								}
								if (bool_209_ && bool_218_)
									fs[i_227_] = f;
							}
							i_219_ += i_223_;
							i_227_++;
						}
						i_220_ += i_224_;
						i_219_ = i_297_;
						i_227_ += i_228_;
					}
				} else if (i_214_ == 2) {
					int i_307_ = i_215_ >>> 24;
					int i_308_ = 256 - i_307_;
					int i_309_ = (i_215_ & 0xff00ff) * i_308_ & ~0xff00ff;
					int i_310_ = (i_215_ & 0xff00) * i_308_ & 0xff0000;
					i_215_ = (i_309_ | i_310_) >>> 8;
					int i_311_ = i_219_;
					for (int i_312_ = -i_213_; i_312_ < 0; i_312_++) {
						int i_313_ = (i_220_ >> 16) * anInt8877;
						for (int i_314_ = -i_212_; i_314_ < 0; i_314_++) {
							if (!bool_209_ || f < fs[i_227_]) {
								if (bool) {
									int i_315_ = (anIntArray11380[(i_219_ >> 16) + i_313_]);
									int i_316_ = i_315_ >>> 24;
									int i_317_ = 256 - i_316_;
									i_309_ = ((i_315_ & 0xff00ff) * i_307_ & ~0xff00ff);
									i_310_ = ((i_315_ & 0xff00) * i_307_ & 0xff0000);
									i_315_ = ((i_309_ | i_310_) >>> 8) + i_215_;
									int i_318_ = is[i_227_];
									is[i_227_] = ((((i_315_ & 0xff00ff) * i_316_ + (i_318_ & 0xff00ff) * i_317_) & ~0xff00ff) + (((i_315_ & 0xff00) * i_316_ + (i_318_ & 0xff00) * i_317_) & 0xff0000)) >> 8;
								}
								if (bool_209_ && bool_218_)
									fs[i_227_] = f;
							}
							i_219_ += i_223_;
							i_227_++;
						}
						i_220_ += i_224_;
						i_219_ = i_311_;
						i_227_ += i_228_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_216_ == 2) {
				if (i_214_ == 1) {
					int i_319_ = i_219_;
					for (int i_320_ = -i_213_; i_320_ < 0; i_320_++) {
						int i_321_ = (i_220_ >> 16) * anInt8877;
						for (int i_322_ = -i_212_; i_322_ < 0; i_322_++) {
							if (!bool_209_ || f < fs[i_227_]) {
								int i_323_ = anIntArray11380[(i_219_ >> 16) + i_321_];
								if (i_323_ != 0) {
									if (bool) {
										int i_324_ = is[i_227_];
										int i_325_ = i_323_ + i_324_;
										int i_326_ = ((i_323_ & 0xff00ff) + (i_324_ & 0xff00ff));
										i_324_ = ((i_326_ & 0x1000100) + (i_325_ - i_326_ & 0x10000));
										is[i_227_] = (i_325_ - i_324_ | i_324_ - (i_324_ >>> 8));
									}
									if (bool_209_ && bool_218_)
										fs[i_227_] = f;
								}
							}
							i_219_ += i_223_;
							i_227_++;
						}
						i_220_ += i_224_;
						i_219_ = i_319_;
						i_227_ += i_228_;
					}
				} else if (i_214_ == 0) {
					int i_327_ = i_219_;
					int i_328_ = (i_215_ & 0xff0000) >> 16;
					int i_329_ = (i_215_ & 0xff00) >> 8;
					int i_330_ = i_215_ & 0xff;
					for (int i_331_ = -i_213_; i_331_ < 0; i_331_++) {
						int i_332_ = (i_220_ >> 16) * anInt8877;
						for (int i_333_ = -i_212_; i_333_ < 0; i_333_++) {
							if (!bool_209_ || f < fs[i_227_]) {
								int i_334_ = anIntArray11380[(i_219_ >> 16) + i_332_];
								if (i_334_ != 0) {
									if (bool) {
										int i_335_ = ((i_334_ & 0xff0000) * i_328_ & ~0xffffff);
										int i_336_ = ((i_334_ & 0xff00) * i_329_ & 0xff0000);
										int i_337_ = ((i_334_ & 0xff) * i_330_ & 0xff00);
										i_334_ = (i_335_ | i_336_ | i_337_) >>> 8;
										int i_338_ = is[i_227_];
										int i_339_ = i_334_ + i_338_;
										int i_340_ = ((i_334_ & 0xff00ff) + (i_338_ & 0xff00ff));
										i_338_ = ((i_340_ & 0x1000100) + (i_339_ - i_340_ & 0x10000));
										is[i_227_] = (i_339_ - i_338_ | i_338_ - (i_338_ >>> 8));
									}
									if (bool_209_ && bool_218_)
										fs[i_227_] = f;
								}
							}
							i_219_ += i_223_;
							i_227_++;
						}
						i_220_ += i_224_;
						i_219_ = i_327_;
						i_227_ += i_228_;
					}
				} else if (i_214_ == 3) {
					int i_341_ = i_219_;
					for (int i_342_ = -i_213_; i_342_ < 0; i_342_++) {
						int i_343_ = (i_220_ >> 16) * anInt8877;
						for (int i_344_ = -i_212_; i_344_ < 0; i_344_++) {
							if (!bool_209_ || f < fs[i_227_]) {
								if (bool) {
									int i_345_ = (anIntArray11380[(i_219_ >> 16) + i_343_]);
									int i_346_ = i_345_ + i_215_;
									int i_347_ = ((i_345_ & 0xff00ff) + (i_215_ & 0xff00ff));
									int i_348_ = ((i_347_ & 0x1000100) + (i_346_ - i_347_ & 0x10000));
									i_345_ = i_346_ - i_348_ | i_348_ - (i_348_ >>> 8);
									i_348_ = is[i_227_];
									i_346_ = i_345_ + i_348_;
									i_347_ = (i_345_ & 0xff00ff) + (i_348_ & 0xff00ff);
									i_348_ = ((i_347_ & 0x1000100) + (i_346_ - i_347_ & 0x10000));
									is[i_227_] = i_346_ - i_348_ | i_348_ - (i_348_ >>> 8);
								}
								if (bool_209_ && bool_218_)
									fs[i_227_] = f;
							}
							i_219_ += i_223_;
							i_227_++;
						}
						i_220_ += i_224_;
						i_219_ = i_341_;
						i_227_ += i_228_;
					}
				} else if (i_214_ == 2) {
					int i_349_ = i_215_ >>> 24;
					int i_350_ = 256 - i_349_;
					int i_351_ = (i_215_ & 0xff00ff) * i_350_ & ~0xff00ff;
					int i_352_ = (i_215_ & 0xff00) * i_350_ & 0xff0000;
					i_215_ = (i_351_ | i_352_) >>> 8;
					int i_353_ = i_219_;
					for (int i_354_ = -i_213_; i_354_ < 0; i_354_++) {
						int i_355_ = (i_220_ >> 16) * anInt8877;
						for (int i_356_ = -i_212_; i_356_ < 0; i_356_++) {
							if (!bool_209_ || f < fs[i_227_]) {
								int i_357_ = anIntArray11380[(i_219_ >> 16) + i_355_];
								if (i_357_ != 0) {
									if (bool) {
										i_351_ = ((i_357_ & 0xff00ff) * i_349_ & ~0xff00ff);
										i_352_ = ((i_357_ & 0xff00) * i_349_ & 0xff0000);
										i_357_ = (((i_351_ | i_352_) >>> 8) + i_215_);
										int i_358_ = is[i_227_];
										int i_359_ = i_357_ + i_358_;
										int i_360_ = ((i_357_ & 0xff00ff) + (i_358_ & 0xff00ff));
										i_358_ = ((i_360_ & 0x1000100) + (i_359_ - i_360_ & 0x10000));
										is[i_227_] = (i_359_ - i_358_ | i_358_ - (i_358_ >>> 8));
									}
									if (bool_209_ && bool_218_)
										fs[i_227_] = f;
								}
							}
							i_219_ += i_223_;
							i_227_++;
						}
						i_220_ += i_224_;
						i_219_ = i_353_;
						i_227_ += i_228_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method2453(int i, int i_361_, int i_362_, int i_363_, int i_364_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is != null) {
			int i_365_ = aClass180_Sub1_8876.anInt9387 * -1173855569;
			i += anInt8879;
			i_361_ += anInt8895;
			int i_366_ = i_361_ * i_365_ + i;
			int i_367_ = 0;
			int i_368_ = anInt8880;
			int i_369_ = anInt8877;
			int i_370_ = i_365_ - i_369_;
			int i_371_ = 0;
			if (i_361_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
				int i_372_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_361_;
				i_368_ -= i_372_;
				i_361_ = aClass180_Sub1_8876.anInt9392 * -456655989;
				i_367_ += i_372_ * i_369_;
				i_366_ += i_372_ * i_365_;
			}
			if (i_361_ + i_368_ > aClass180_Sub1_8876.anInt9393 * -383695469)
				i_368_ -= (i_361_ + i_368_ - aClass180_Sub1_8876.anInt9393 * -383695469);
			if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
				int i_373_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
				i_369_ -= i_373_;
				i = aClass180_Sub1_8876.anInt9383 * 1605202751;
				i_367_ += i_373_;
				i_366_ += i_373_;
				i_371_ += i_373_;
				i_370_ += i_373_;
			}
			if (i + i_369_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
				int i_374_ = i + i_369_ - aClass180_Sub1_8876.anInt9391 * 2014358275;
				i_369_ -= i_374_;
				i_371_ += i_374_;
				i_370_ += i_374_;
			}
			if (i_369_ > 0 && i_368_ > 0) {
				if (i_364_ == 0) {
					if (i_362_ == 1) {
						for (int i_375_ = -i_368_; i_375_ < 0; i_375_++) {
							int i_376_ = i_366_ + i_369_ - 3;
							while (i_366_ < i_376_) {
								is[i_366_++] = anIntArray11380[i_367_++];
								is[i_366_++] = anIntArray11380[i_367_++];
								is[i_366_++] = anIntArray11380[i_367_++];
								is[i_366_++] = anIntArray11380[i_367_++];
							}
							i_376_ += 3;
							while (i_366_ < i_376_)
								is[i_366_++] = anIntArray11380[i_367_++];
							i_366_ += i_370_;
							i_367_ += i_371_;
						}
					} else if (i_362_ == 0) {
						int i_377_ = (i_363_ & 0xff0000) >> 16;
						int i_378_ = (i_363_ & 0xff00) >> 8;
						int i_379_ = i_363_ & 0xff;
						for (int i_380_ = -i_368_; i_380_ < 0; i_380_++) {
							for (int i_381_ = -i_369_; i_381_ < 0; i_381_++) {
								int i_382_ = anIntArray11380[i_367_++];
								int i_383_ = (i_382_ & 0xff0000) * i_377_ & ~0xffffff;
								int i_384_ = (i_382_ & 0xff00) * i_378_ & 0xff0000;
								int i_385_ = (i_382_ & 0xff) * i_379_ & 0xff00;
								is[i_366_++] = (i_383_ | i_384_ | i_385_) >>> 8;
							}
							i_366_ += i_370_;
							i_367_ += i_371_;
						}
					} else if (i_362_ == 3) {
						for (int i_386_ = -i_368_; i_386_ < 0; i_386_++) {
							for (int i_387_ = -i_369_; i_387_ < 0; i_387_++) {
								int i_388_ = anIntArray11380[i_367_++];
								int i_389_ = i_388_ + i_363_;
								int i_390_ = ((i_388_ & 0xff00ff) + (i_363_ & 0xff00ff));
								int i_391_ = ((i_390_ & 0x1000100) + (i_389_ - i_390_ & 0x10000));
								is[i_366_++] = i_389_ - i_391_ | i_391_ - (i_391_ >>> 8);
							}
							i_366_ += i_370_;
							i_367_ += i_371_;
						}
					} else if (i_362_ == 2) {
						int i_392_ = i_363_ >>> 24;
						int i_393_ = 256 - i_392_;
						int i_394_ = (i_363_ & 0xff00ff) * i_393_ & ~0xff00ff;
						int i_395_ = (i_363_ & 0xff00) * i_393_ & 0xff0000;
						i_363_ = (i_394_ | i_395_) >>> 8;
						for (int i_396_ = -i_368_; i_396_ < 0; i_396_++) {
							for (int i_397_ = -i_369_; i_397_ < 0; i_397_++) {
								int i_398_ = anIntArray11380[i_367_++];
								i_394_ = (i_398_ & 0xff00ff) * i_392_ & ~0xff00ff;
								i_395_ = (i_398_ & 0xff00) * i_392_ & 0xff0000;
								is[i_366_++] = ((i_394_ | i_395_) >>> 8) + i_363_;
							}
							i_366_ += i_370_;
							i_367_ += i_371_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_364_ == 1) {
					if (i_362_ == 1) {
						for (int i_399_ = -i_368_; i_399_ < 0; i_399_++) {
							for (int i_400_ = -i_369_; i_400_ < 0; i_400_++) {
								int i_401_ = anIntArray11380[i_367_++];
								int i_402_ = i_401_ >>> 24;
								int i_403_ = 256 - i_402_;
								int i_404_ = is[i_366_];
								is[i_366_++] = (((((i_401_ & 0xff00ff) * i_402_ + (i_404_ & 0xff00ff) * i_403_) & ~0xff00ff) >> 8) + (((((i_401_ & ~0xff00ff) >>> 8) * i_402_) + (((i_404_ & ~0xff00ff) >>> 8) * i_403_)) & ~0xff00ff));
							}
							i_366_ += i_370_;
							i_367_ += i_371_;
						}
					} else if (i_362_ == 0) {
						if ((i_363_ & 0xffffff) == 16777215) {
							for (int i_405_ = -i_368_; i_405_ < 0; i_405_++) {
								for (int i_406_ = -i_369_; i_406_ < 0; i_406_++) {
									int i_407_ = anIntArray11380[i_367_++];
									int i_408_ = ((i_407_ >>> 24) * (i_363_ >>> 24) >> 8);
									int i_409_ = 256 - i_408_;
									int i_410_ = is[i_366_];
									is[i_366_++] = ((((i_407_ & 0xff00ff) * i_408_ + (i_410_ & 0xff00ff) * i_409_) & ~0xff00ff) + (((i_407_ & 0xff00) * i_408_ + (i_410_ & 0xff00) * i_409_) & 0xff0000)) >> 8;
								}
								i_366_ += i_370_;
								i_367_ += i_371_;
							}
						} else {
							int i_411_ = (i_363_ & 0xff0000) >> 16;
							int i_412_ = (i_363_ & 0xff00) >> 8;
							int i_413_ = i_363_ & 0xff;
							for (int i_414_ = -i_368_; i_414_ < 0; i_414_++) {
								for (int i_415_ = -i_369_; i_415_ < 0; i_415_++) {
									int i_416_ = anIntArray11380[i_367_++];
									int i_417_ = ((i_416_ >>> 24) * (i_363_ >>> 24) >> 8);
									int i_418_ = 256 - i_417_;
									if (i_417_ != 255) {
										int i_419_ = ((i_416_ & 0xff0000) * i_411_ & ~0xffffff);
										int i_420_ = ((i_416_ & 0xff00) * i_412_ & 0xff0000);
										int i_421_ = ((i_416_ & 0xff) * i_413_ & 0xff00);
										i_416_ = (i_419_ | i_420_ | i_421_) >>> 8;
										int i_422_ = is[i_366_];
										is[i_366_++] = ((((i_416_ & 0xff00ff) * i_417_ + ((i_422_ & 0xff00ff) * i_418_)) & ~0xff00ff) + (((i_416_ & 0xff00) * i_417_ + ((i_422_ & 0xff00) * i_418_)) & 0xff0000)) >> 8;
									} else {
										int i_423_ = ((i_416_ & 0xff0000) * i_411_ & ~0xffffff);
										int i_424_ = ((i_416_ & 0xff00) * i_412_ & 0xff0000);
										int i_425_ = ((i_416_ & 0xff) * i_413_ & 0xff00);
										is[i_366_++] = (i_423_ | i_424_ | i_425_) >>> 8;
									}
								}
								i_366_ += i_370_;
								i_367_ += i_371_;
							}
						}
					} else if (i_362_ == 3) {
						for (int i_426_ = -i_368_; i_426_ < 0; i_426_++) {
							for (int i_427_ = -i_369_; i_427_ < 0; i_427_++) {
								int i_428_ = anIntArray11380[i_367_++];
								int i_429_ = i_428_ + i_363_;
								int i_430_ = ((i_428_ & 0xff00ff) + (i_363_ & 0xff00ff));
								int i_431_ = ((i_430_ & 0x1000100) + (i_429_ - i_430_ & 0x10000));
								i_431_ = i_429_ - i_431_ | i_431_ - (i_431_ >>> 8);
								int i_432_ = (i_431_ >>> 24) * (i_363_ >>> 24) >> 8;
								int i_433_ = 256 - i_432_;
								if (i_432_ != 255) {
									i_428_ = i_431_;
									i_431_ = is[i_366_];
									i_431_ = ((((i_428_ & 0xff00ff) * i_432_ + (i_431_ & 0xff00ff) * i_433_) & ~0xff00ff) + (((i_428_ & 0xff00) * i_432_ + (i_431_ & 0xff00) * i_433_) & 0xff0000)) >> 8;
								}
								is[i_366_++] = i_431_;
							}
							i_366_ += i_370_;
							i_367_ += i_371_;
						}
					} else if (i_362_ == 2) {
						int i_434_ = i_363_ >>> 24;
						int i_435_ = 256 - i_434_;
						int i_436_ = (i_363_ & 0xff00ff) * i_435_ & ~0xff00ff;
						int i_437_ = (i_363_ & 0xff00) * i_435_ & 0xff0000;
						i_363_ = (i_436_ | i_437_) >>> 8;
						for (int i_438_ = -i_368_; i_438_ < 0; i_438_++) {
							for (int i_439_ = -i_369_; i_439_ < 0; i_439_++) {
								int i_440_ = anIntArray11380[i_367_++];
								int i_441_ = i_440_ >>> 24;
								int i_442_ = 256 - i_441_;
								i_436_ = (i_440_ & 0xff00ff) * i_434_ & ~0xff00ff;
								i_437_ = (i_440_ & 0xff00) * i_434_ & 0xff0000;
								i_440_ = ((i_436_ | i_437_) >>> 8) + i_363_;
								int i_443_ = is[i_366_];
								is[i_366_++] = ((((i_440_ & 0xff00ff) * i_441_ + (i_443_ & 0xff00ff) * i_442_) & ~0xff00ff) + (((i_440_ & 0xff00) * i_441_ + (i_443_ & 0xff00) * i_442_) & 0xff0000)) >> 8;
							}
							i_366_ += i_370_;
							i_367_ += i_371_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_364_ == 2) {
					if (i_362_ == 1) {
						for (int i_444_ = -i_368_; i_444_ < 0; i_444_++) {
							for (int i_445_ = -i_369_; i_445_ < 0; i_445_++) {
								int i_446_ = anIntArray11380[i_367_++];
								if (i_446_ != 0) {
									int i_447_ = is[i_366_];
									int i_448_ = i_446_ + i_447_;
									int i_449_ = ((i_446_ & 0xff00ff) + (i_447_ & 0xff00ff));
									i_447_ = ((i_449_ & 0x1000100) + (i_448_ - i_449_ & 0x10000));
									is[i_366_++] = i_448_ - i_447_ | i_447_ - (i_447_ >>> 8);
								} else
									i_366_++;
							}
							i_366_ += i_370_;
							i_367_ += i_371_;
						}
					} else if (i_362_ == 0) {
						int i_450_ = (i_363_ & 0xff0000) >> 16;
						int i_451_ = (i_363_ & 0xff00) >> 8;
						int i_452_ = i_363_ & 0xff;
						for (int i_453_ = -i_368_; i_453_ < 0; i_453_++) {
							for (int i_454_ = -i_369_; i_454_ < 0; i_454_++) {
								int i_455_ = anIntArray11380[i_367_++];
								if (i_455_ != 0) {
									int i_456_ = ((i_455_ & 0xff0000) * i_450_ & ~0xffffff);
									int i_457_ = ((i_455_ & 0xff00) * i_451_ & 0xff0000);
									int i_458_ = (i_455_ & 0xff) * i_452_ & 0xff00;
									i_455_ = (i_456_ | i_457_ | i_458_) >>> 8;
									int i_459_ = is[i_366_];
									int i_460_ = i_455_ + i_459_;
									int i_461_ = ((i_455_ & 0xff00ff) + (i_459_ & 0xff00ff));
									i_459_ = ((i_461_ & 0x1000100) + (i_460_ - i_461_ & 0x10000));
									is[i_366_++] = i_460_ - i_459_ | i_459_ - (i_459_ >>> 8);
								} else
									i_366_++;
							}
							i_366_ += i_370_;
							i_367_ += i_371_;
						}
					} else if (i_362_ == 3) {
						for (int i_462_ = -i_368_; i_462_ < 0; i_462_++) {
							for (int i_463_ = -i_369_; i_463_ < 0; i_463_++) {
								int i_464_ = anIntArray11380[i_367_++];
								int i_465_ = i_464_ + i_363_;
								int i_466_ = ((i_464_ & 0xff00ff) + (i_363_ & 0xff00ff));
								int i_467_ = ((i_466_ & 0x1000100) + (i_465_ - i_466_ & 0x10000));
								i_464_ = i_465_ - i_467_ | i_467_ - (i_467_ >>> 8);
								i_467_ = is[i_366_];
								i_465_ = i_464_ + i_467_;
								i_466_ = (i_464_ & 0xff00ff) + (i_467_ & 0xff00ff);
								i_467_ = (i_466_ & 0x1000100) + (i_465_ - i_466_ & 0x10000);
								is[i_366_++] = i_465_ - i_467_ | i_467_ - (i_467_ >>> 8);
							}
							i_366_ += i_370_;
							i_367_ += i_371_;
						}
					} else if (i_362_ == 2) {
						int i_468_ = i_363_ >>> 24;
						int i_469_ = 256 - i_468_;
						int i_470_ = (i_363_ & 0xff00ff) * i_469_ & ~0xff00ff;
						int i_471_ = (i_363_ & 0xff00) * i_469_ & 0xff0000;
						i_363_ = (i_470_ | i_471_) >>> 8;
						for (int i_472_ = -i_368_; i_472_ < 0; i_472_++) {
							for (int i_473_ = -i_369_; i_473_ < 0; i_473_++) {
								int i_474_ = anIntArray11380[i_367_++];
								if (i_474_ != 0) {
									i_470_ = ((i_474_ & 0xff00ff) * i_468_ & ~0xff00ff);
									i_471_ = ((i_474_ & 0xff00) * i_468_ & 0xff0000);
									i_474_ = ((i_470_ | i_471_) >>> 8) + i_363_;
									int i_475_ = is[i_366_];
									int i_476_ = i_474_ + i_475_;
									int i_477_ = ((i_474_ & 0xff00ff) + (i_475_ & 0xff00ff));
									i_475_ = ((i_477_ & 0x1000100) + (i_476_ - i_477_ & 0x10000));
									is[i_366_++] = i_476_ - i_475_ | i_475_ - (i_475_ >>> 8);
								} else
									i_366_++;
							}
							i_366_ += i_370_;
							i_367_ += i_371_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2435(int i, int i_478_, int i_479_, int i_480_, int i_481_, int i_482_) {
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is == null)
			throw new IllegalStateException("");
		for (int i_483_ = 0; i_483_ < i_480_; i_483_++) {
			int i_484_ = (i_478_ + i_483_) * i_479_ + i;
			int i_485_ = (i_482_ + i_483_) * i_479_ + i_481_;
			for (int i_486_ = 0; i_486_ < i_479_; i_486_++)
				anIntArray11380[i_484_ + i_486_] = is[i_485_ + i_486_] & 0xffffff;
		}
	}

	public void method2465(int i, int i_487_, Class142 class142, int i_488_, int i_489_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is != null) {
			i += anInt8879;
			i_487_ += anInt8895;
			int i_490_ = 0;
			int i_491_ = aClass180_Sub1_8876.anInt9387 * -1173855569;
			int i_492_ = anInt8877;
			int i_493_ = anInt8880;
			int i_494_ = i_491_ - i_492_;
			int i_495_ = 0;
			int i_496_ = i + i_487_ * i_491_;
			if (i_487_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
				int i_497_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_487_;
				i_493_ -= i_497_;
				i_487_ = aClass180_Sub1_8876.anInt9392 * -456655989;
				i_490_ += i_497_ * i_492_;
				i_496_ += i_497_ * i_491_;
			}
			if (i_487_ + i_493_ > aClass180_Sub1_8876.anInt9393 * -383695469)
				i_493_ -= (i_487_ + i_493_ - aClass180_Sub1_8876.anInt9393 * -383695469);
			if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
				int i_498_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
				i_492_ -= i_498_;
				i = aClass180_Sub1_8876.anInt9383 * 1605202751;
				i_490_ += i_498_;
				i_496_ += i_498_;
				i_495_ += i_498_;
				i_494_ += i_498_;
			}
			if (i + i_492_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
				int i_499_ = i + i_492_ - aClass180_Sub1_8876.anInt9391 * 2014358275;
				i_492_ -= i_499_;
				i_495_ += i_499_;
				i_494_ += i_499_;
			}
			if (i_492_ > 0 && i_493_ > 0) {
				Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
				int[] is_500_ = class142_sub1.anIntArray9002;
				int[] is_501_ = class142_sub1.anIntArray9003;
				int i_502_ = i_487_;
				if (i_489_ > i_502_) {
					i_502_ = i_489_;
					i_496_ += (i_489_ - i_487_) * i_491_;
					i_490_ += (i_489_ - i_487_) * anInt8877;
				}
				int i_503_ = (i_489_ + is_500_.length < i_487_ + i_493_ ? i_489_ + is_500_.length : i_487_ + i_493_);
				for (int i_504_ = i_502_; i_504_ < i_503_; i_504_++) {
					int i_505_ = is_500_[i_504_ - i_489_] + i_488_;
					int i_506_ = is_501_[i_504_ - i_489_];
					int i_507_ = i_492_;
					if (i > i_505_) {
						int i_508_ = i - i_505_;
						if (i_508_ >= i_506_) {
							i_490_ += i_492_ + i_495_;
							i_496_ += i_492_ + i_494_;
							continue;
						}
						i_506_ -= i_508_;
					} else {
						int i_509_ = i_505_ - i;
						if (i_509_ >= i_492_) {
							i_490_ += i_492_ + i_495_;
							i_496_ += i_492_ + i_494_;
							continue;
						}
						i_490_ += i_509_;
						i_507_ -= i_509_;
						i_496_ += i_509_;
					}
					int i_510_ = 0;
					if (i_507_ < i_506_)
						i_506_ = i_507_;
					else
						i_510_ = i_507_ - i_506_;
					for (int i_511_ = -i_506_; i_511_ < 0; i_511_++) {
						int i_512_ = anIntArray11380[i_490_++];
						int i_513_ = i_512_ >>> 24;
						int i_514_ = 256 - i_513_;
						int i_515_ = is[i_496_];
						is[i_496_++] = ((((i_512_ & 0xff00ff) * i_513_ + (i_515_ & 0xff00ff) * i_514_) & ~0xff00ff) + (((i_512_ & 0xff00) * i_513_ + (i_515_ & 0xff00) * i_514_) & 0xff0000)) >> 8;
					}
					i_490_ += i_510_ + i_495_;
					i_496_ += i_510_ + i_494_;
				}
			}
		}
	}

	public void method2434(int i, int i_516_, int i_517_, int i_518_, int[] is, int i_519_, int i_520_) {
		i_520_ -= i_517_;
		for (int i_521_ = 0; i_521_ < i_518_; i_521_++) {
			int i_522_ = (i_516_ + i_521_) * i_517_ + i;
			for (int i_523_ = 0; i_523_ < i_517_; i_523_++)
				anIntArray11380[i_522_ + i_523_] = is[i_519_++];
			i_519_ += i_520_;
		}
	}

	public void method2433(int i, int i_524_, int i_525_, int i_526_, int[] is, int i_527_, int i_528_) {
		i_528_ -= i_525_;
		for (int i_529_ = 0; i_529_ < i_526_; i_529_++) {
			int i_530_ = (i_524_ + i_529_) * i_525_ + i;
			for (int i_531_ = 0; i_531_ < i_525_; i_531_++)
				anIntArray11380[i_530_ + i_531_] = is[i_527_++];
			i_527_ += i_528_;
		}
	}

	void method2420(int i, int i_532_, int i_533_, int i_534_, int i_535_, int i_536_, int i_537_, int i_538_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		if (i_533_ > 0 && i_534_ > 0) {
			int[] is = aClass180_Sub1_8876.anIntArray9386;
			if (is != null) {
				int i_539_ = 0;
				int i_540_ = 0;
				int i_541_ = aClass180_Sub1_8876.anInt9387 * -1173855569;
				int i_542_ = anInt8879 + anInt8877 + anInt8878;
				int i_543_ = anInt8895 + anInt8880 + anInt8882;
				int i_544_ = (i_542_ << 16) / i_533_;
				int i_545_ = (i_543_ << 16) / i_534_;
				if (anInt8879 > 0) {
					int i_546_ = ((anInt8879 << 16) + i_544_ - 1) / i_544_;
					i += i_546_;
					i_539_ += i_546_ * i_544_ - (anInt8879 << 16);
				}
				if (anInt8895 > 0) {
					int i_547_ = ((anInt8895 << 16) + i_545_ - 1) / i_545_;
					i_532_ += i_547_;
					i_540_ += i_547_ * i_545_ - (anInt8895 << 16);
				}
				if (anInt8877 < i_542_)
					i_533_ = ((anInt8877 << 16) - i_539_ + i_544_ - 1) / i_544_;
				if (anInt8880 < i_543_)
					i_534_ = ((anInt8880 << 16) - i_540_ + i_545_ - 1) / i_545_;
				int i_548_ = i + i_532_ * i_541_;
				int i_549_ = i_541_ - i_533_;
				if (i_532_ + i_534_ > aClass180_Sub1_8876.anInt9393 * -383695469)
					i_534_ -= (i_532_ + i_534_ - aClass180_Sub1_8876.anInt9393 * -383695469);
				if (i_532_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
					int i_550_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_532_;
					i_534_ -= i_550_;
					i_548_ += i_550_ * i_541_;
					i_540_ += i_545_ * i_550_;
				}
				if (i + i_533_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
					int i_551_ = (i + i_533_ - aClass180_Sub1_8876.anInt9391 * 2014358275);
					i_533_ -= i_551_;
					i_549_ += i_551_;
				}
				if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
					int i_552_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
					i_533_ -= i_552_;
					i_548_ += i_552_;
					i_539_ += i_544_ * i_552_;
					i_549_ += i_552_;
				}
				if (i_537_ == 0) {
					if (i_535_ == 1) {
						int i_553_ = i_539_;
						for (int i_554_ = -i_534_; i_554_ < 0; i_554_++) {
							int i_555_ = (i_540_ >> 16) * anInt8877;
							for (int i_556_ = -i_533_; i_556_ < 0; i_556_++) {
								is[i_548_++] = anIntArray11380[(i_539_ >> 16) + i_555_];
								i_539_ += i_544_;
							}
							i_540_ += i_545_;
							i_539_ = i_553_;
							i_548_ += i_549_;
						}
					} else if (i_535_ == 0) {
						int i_557_ = (i_536_ & 0xff0000) >> 16;
						int i_558_ = (i_536_ & 0xff00) >> 8;
						int i_559_ = i_536_ & 0xff;
						int i_560_ = i_539_;
						for (int i_561_ = -i_534_; i_561_ < 0; i_561_++) {
							int i_562_ = (i_540_ >> 16) * anInt8877;
							for (int i_563_ = -i_533_; i_563_ < 0; i_563_++) {
								int i_564_ = anIntArray11380[(i_539_ >> 16) + i_562_];
								int i_565_ = (i_564_ & 0xff0000) * i_557_ & ~0xffffff;
								int i_566_ = (i_564_ & 0xff00) * i_558_ & 0xff0000;
								int i_567_ = (i_564_ & 0xff) * i_559_ & 0xff00;
								is[i_548_++] = (i_565_ | i_566_ | i_567_) >>> 8;
								i_539_ += i_544_;
							}
							i_540_ += i_545_;
							i_539_ = i_560_;
							i_548_ += i_549_;
						}
					} else if (i_535_ == 3) {
						int i_568_ = i_539_;
						for (int i_569_ = -i_534_; i_569_ < 0; i_569_++) {
							int i_570_ = (i_540_ >> 16) * anInt8877;
							for (int i_571_ = -i_533_; i_571_ < 0; i_571_++) {
								int i_572_ = anIntArray11380[(i_539_ >> 16) + i_570_];
								int i_573_ = i_572_ + i_536_;
								int i_574_ = ((i_572_ & 0xff00ff) + (i_536_ & 0xff00ff));
								int i_575_ = ((i_574_ & 0x1000100) + (i_573_ - i_574_ & 0x10000));
								is[i_548_++] = i_573_ - i_575_ | i_575_ - (i_575_ >>> 8);
								i_539_ += i_544_;
							}
							i_540_ += i_545_;
							i_539_ = i_568_;
							i_548_ += i_549_;
						}
					} else if (i_535_ == 2) {
						int i_576_ = i_536_ >>> 24;
						int i_577_ = 256 - i_576_;
						int i_578_ = (i_536_ & 0xff00ff) * i_577_ & ~0xff00ff;
						int i_579_ = (i_536_ & 0xff00) * i_577_ & 0xff0000;
						i_536_ = (i_578_ | i_579_) >>> 8;
						int i_580_ = i_539_;
						for (int i_581_ = -i_534_; i_581_ < 0; i_581_++) {
							int i_582_ = (i_540_ >> 16) * anInt8877;
							for (int i_583_ = -i_533_; i_583_ < 0; i_583_++) {
								int i_584_ = anIntArray11380[(i_539_ >> 16) + i_582_];
								i_578_ = (i_584_ & 0xff00ff) * i_576_ & ~0xff00ff;
								i_579_ = (i_584_ & 0xff00) * i_576_ & 0xff0000;
								is[i_548_++] = ((i_578_ | i_579_) >>> 8) + i_536_;
								i_539_ += i_544_;
							}
							i_540_ += i_545_;
							i_539_ = i_580_;
							i_548_ += i_549_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_537_ == 1) {
					if (i_535_ == 1) {
						int i_585_ = i_539_;
						for (int i_586_ = -i_534_; i_586_ < 0; i_586_++) {
							int i_587_ = (i_540_ >> 16) * anInt8877;
							for (int i_588_ = -i_533_; i_588_ < 0; i_588_++) {
								int i_589_ = anIntArray11380[(i_539_ >> 16) + i_587_];
								int i_590_ = i_589_ >>> 24;
								int i_591_ = 256 - i_590_;
								int i_592_ = is[i_548_];
								is[i_548_++] = (((((i_589_ & 0xff00ff) * i_590_ + (i_592_ & 0xff00ff) * i_591_) & ~0xff00ff) >> 8) + (((((i_589_ & ~0xff00ff) >>> 8) * i_590_) + (((i_592_ & ~0xff00ff) >>> 8) * i_591_)) & ~0xff00ff));
								i_539_ += i_544_;
							}
							i_540_ += i_545_;
							i_539_ = i_585_;
							i_548_ += i_549_;
						}
					} else if (i_535_ == 0) {
						int i_593_ = i_539_;
						if ((i_536_ & 0xffffff) == 16777215) {
							for (int i_594_ = -i_534_; i_594_ < 0; i_594_++) {
								int i_595_ = (i_540_ >> 16) * anInt8877;
								for (int i_596_ = -i_533_; i_596_ < 0; i_596_++) {
									int i_597_ = (anIntArray11380[(i_539_ >> 16) + i_595_]);
									int i_598_ = ((i_597_ >>> 24) * (i_536_ >>> 24) >> 8);
									int i_599_ = 256 - i_598_;
									int i_600_ = is[i_548_];
									is[i_548_++] = ((((i_597_ & 0xff00ff) * i_598_ + (i_600_ & 0xff00ff) * i_599_) & ~0xff00ff) + (((i_597_ & 0xff00) * i_598_ + (i_600_ & 0xff00) * i_599_) & 0xff0000)) >> 8;
									i_539_ += i_544_;
								}
								i_540_ += i_545_;
								i_539_ = i_593_;
								i_548_ += i_549_;
							}
						} else {
							int i_601_ = (i_536_ & 0xff0000) >> 16;
							int i_602_ = (i_536_ & 0xff00) >> 8;
							int i_603_ = i_536_ & 0xff;
							for (int i_604_ = -i_534_; i_604_ < 0; i_604_++) {
								int i_605_ = (i_540_ >> 16) * anInt8877;
								for (int i_606_ = -i_533_; i_606_ < 0; i_606_++) {
									int i_607_ = (anIntArray11380[(i_539_ >> 16) + i_605_]);
									int i_608_ = ((i_607_ >>> 24) * (i_536_ >>> 24) >> 8);
									int i_609_ = 256 - i_608_;
									if (i_608_ != 255) {
										int i_610_ = ((i_607_ & 0xff0000) * i_601_ & ~0xffffff);
										int i_611_ = ((i_607_ & 0xff00) * i_602_ & 0xff0000);
										int i_612_ = ((i_607_ & 0xff) * i_603_ & 0xff00);
										i_607_ = (i_610_ | i_611_ | i_612_) >>> 8;
										int i_613_ = is[i_548_];
										is[i_548_++] = ((((i_607_ & 0xff00ff) * i_608_ + ((i_613_ & 0xff00ff) * i_609_)) & ~0xff00ff) + (((i_607_ & 0xff00) * i_608_ + ((i_613_ & 0xff00) * i_609_)) & 0xff0000)) >> 8;
									} else {
										int i_614_ = ((i_607_ & 0xff0000) * i_601_ & ~0xffffff);
										int i_615_ = ((i_607_ & 0xff00) * i_602_ & 0xff0000);
										int i_616_ = ((i_607_ & 0xff) * i_603_ & 0xff00);
										is[i_548_++] = (i_614_ | i_615_ | i_616_) >>> 8;
									}
									i_539_ += i_544_;
								}
								i_540_ += i_545_;
								i_539_ = i_593_;
								i_548_ += i_549_;
							}
						}
					} else if (i_535_ == 3) {
						int i_617_ = i_539_;
						for (int i_618_ = -i_534_; i_618_ < 0; i_618_++) {
							int i_619_ = (i_540_ >> 16) * anInt8877;
							for (int i_620_ = -i_533_; i_620_ < 0; i_620_++) {
								int i_621_ = anIntArray11380[(i_539_ >> 16) + i_619_];
								int i_622_ = i_621_ + i_536_;
								int i_623_ = ((i_621_ & 0xff00ff) + (i_536_ & 0xff00ff));
								int i_624_ = ((i_623_ & 0x1000100) + (i_622_ - i_623_ & 0x10000));
								i_624_ = i_622_ - i_624_ | i_624_ - (i_624_ >>> 8);
								int i_625_ = (i_624_ >>> 24) * (i_536_ >>> 24) >> 8;
								int i_626_ = 256 - i_625_;
								if (i_625_ != 255) {
									i_621_ = i_624_;
									i_624_ = is[i_548_];
									i_624_ = ((((i_621_ & 0xff00ff) * i_625_ + (i_624_ & 0xff00ff) * i_626_) & ~0xff00ff) + (((i_621_ & 0xff00) * i_625_ + (i_624_ & 0xff00) * i_626_) & 0xff0000)) >> 8;
								}
								is[i_548_++] = i_624_;
								i_539_ += i_544_;
							}
							i_540_ += i_545_;
							i_539_ = i_617_;
							i_548_ += i_549_;
						}
					} else if (i_535_ == 2) {
						int i_627_ = i_536_ >>> 24;
						int i_628_ = 256 - i_627_;
						int i_629_ = (i_536_ & 0xff00ff) * i_628_ & ~0xff00ff;
						int i_630_ = (i_536_ & 0xff00) * i_628_ & 0xff0000;
						i_536_ = (i_629_ | i_630_) >>> 8;
						int i_631_ = i_539_;
						for (int i_632_ = -i_534_; i_632_ < 0; i_632_++) {
							int i_633_ = (i_540_ >> 16) * anInt8877;
							for (int i_634_ = -i_533_; i_634_ < 0; i_634_++) {
								int i_635_ = anIntArray11380[(i_539_ >> 16) + i_633_];
								int i_636_ = i_635_ >>> 24;
								int i_637_ = 256 - i_636_;
								i_629_ = (i_635_ & 0xff00ff) * i_627_ & ~0xff00ff;
								i_630_ = (i_635_ & 0xff00) * i_627_ & 0xff0000;
								i_635_ = ((i_629_ | i_630_) >>> 8) + i_536_;
								int i_638_ = is[i_548_];
								is[i_548_++] = ((((i_635_ & 0xff00ff) * i_636_ + (i_638_ & 0xff00ff) * i_637_) & ~0xff00ff) + (((i_635_ & 0xff00) * i_636_ + (i_638_ & 0xff00) * i_637_) & 0xff0000)) >> 8;
								i_539_ += i_544_;
							}
							i_540_ += i_545_;
							i_539_ = i_631_;
							i_548_ += i_549_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_537_ == 2) {
					if (i_535_ == 1) {
						int i_639_ = i_539_;
						for (int i_640_ = -i_534_; i_640_ < 0; i_640_++) {
							int i_641_ = (i_540_ >> 16) * anInt8877;
							for (int i_642_ = -i_533_; i_642_ < 0; i_642_++) {
								int i_643_ = anIntArray11380[(i_539_ >> 16) + i_641_];
								if (i_643_ != 0) {
									int i_644_ = is[i_548_];
									int i_645_ = i_643_ + i_644_;
									int i_646_ = ((i_643_ & 0xff00ff) + (i_644_ & 0xff00ff));
									i_644_ = ((i_646_ & 0x1000100) + (i_645_ - i_646_ & 0x10000));
									is[i_548_++] = i_645_ - i_644_ | i_644_ - (i_644_ >>> 8);
								} else
									i_548_++;
								i_539_ += i_544_;
							}
							i_540_ += i_545_;
							i_539_ = i_639_;
							i_548_ += i_549_;
						}
					} else if (i_535_ == 0) {
						int i_647_ = i_539_;
						int i_648_ = (i_536_ & 0xff0000) >> 16;
						int i_649_ = (i_536_ & 0xff00) >> 8;
						int i_650_ = i_536_ & 0xff;
						for (int i_651_ = -i_534_; i_651_ < 0; i_651_++) {
							int i_652_ = (i_540_ >> 16) * anInt8877;
							for (int i_653_ = -i_533_; i_653_ < 0; i_653_++) {
								int i_654_ = anIntArray11380[(i_539_ >> 16) + i_652_];
								if (i_654_ != 0) {
									int i_655_ = ((i_654_ & 0xff0000) * i_648_ & ~0xffffff);
									int i_656_ = ((i_654_ & 0xff00) * i_649_ & 0xff0000);
									int i_657_ = (i_654_ & 0xff) * i_650_ & 0xff00;
									i_654_ = (i_655_ | i_656_ | i_657_) >>> 8;
									int i_658_ = is[i_548_];
									int i_659_ = i_654_ + i_658_;
									int i_660_ = ((i_654_ & 0xff00ff) + (i_658_ & 0xff00ff));
									i_658_ = ((i_660_ & 0x1000100) + (i_659_ - i_660_ & 0x10000));
									is[i_548_++] = i_659_ - i_658_ | i_658_ - (i_658_ >>> 8);
								} else
									i_548_++;
								i_539_ += i_544_;
							}
							i_540_ += i_545_;
							i_539_ = i_647_;
							i_548_ += i_549_;
						}
					} else if (i_535_ == 3) {
						int i_661_ = i_539_;
						for (int i_662_ = -i_534_; i_662_ < 0; i_662_++) {
							int i_663_ = (i_540_ >> 16) * anInt8877;
							for (int i_664_ = -i_533_; i_664_ < 0; i_664_++) {
								int i_665_ = anIntArray11380[(i_539_ >> 16) + i_663_];
								int i_666_ = i_665_ + i_536_;
								int i_667_ = ((i_665_ & 0xff00ff) + (i_536_ & 0xff00ff));
								int i_668_ = ((i_667_ & 0x1000100) + (i_666_ - i_667_ & 0x10000));
								i_665_ = i_666_ - i_668_ | i_668_ - (i_668_ >>> 8);
								i_668_ = is[i_548_];
								i_666_ = i_665_ + i_668_;
								i_667_ = (i_665_ & 0xff00ff) + (i_668_ & 0xff00ff);
								i_668_ = (i_667_ & 0x1000100) + (i_666_ - i_667_ & 0x10000);
								is[i_548_++] = i_666_ - i_668_ | i_668_ - (i_668_ >>> 8);
								i_539_ += i_544_;
							}
							i_540_ += i_545_;
							i_539_ = i_661_;
							i_548_ += i_549_;
						}
					} else if (i_535_ == 2) {
						int i_669_ = i_536_ >>> 24;
						int i_670_ = 256 - i_669_;
						int i_671_ = (i_536_ & 0xff00ff) * i_670_ & ~0xff00ff;
						int i_672_ = (i_536_ & 0xff00) * i_670_ & 0xff0000;
						i_536_ = (i_671_ | i_672_) >>> 8;
						int i_673_ = i_539_;
						for (int i_674_ = -i_534_; i_674_ < 0; i_674_++) {
							int i_675_ = (i_540_ >> 16) * anInt8877;
							for (int i_676_ = -i_533_; i_676_ < 0; i_676_++) {
								int i_677_ = anIntArray11380[(i_539_ >> 16) + i_675_];
								if (i_677_ != 0) {
									i_671_ = ((i_677_ & 0xff00ff) * i_669_ & ~0xff00ff);
									i_672_ = ((i_677_ & 0xff00) * i_669_ & 0xff0000);
									i_677_ = ((i_671_ | i_672_) >>> 8) + i_536_;
									int i_678_ = is[i_548_];
									int i_679_ = i_677_ + i_678_;
									int i_680_ = ((i_677_ & 0xff00ff) + (i_678_ & 0xff00ff));
									i_678_ = ((i_680_ & 0x1000100) + (i_679_ - i_680_ & 0x10000));
									is[i_548_++] = i_679_ - i_678_ | i_678_ - (i_678_ >>> 8);
								} else
									i_548_++;
								i_539_ += i_544_;
							}
							i_540_ += i_545_;
							i_539_ = i_673_;
							i_548_ += i_549_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2416(int i, int i_681_, int i_682_, int i_683_, int i_684_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is != null) {
			int i_685_ = aClass180_Sub1_8876.anInt9387 * -1173855569;
			i += anInt8879;
			i_681_ += anInt8895;
			int i_686_ = i_681_ * i_685_ + i;
			int i_687_ = 0;
			int i_688_ = anInt8880;
			int i_689_ = anInt8877;
			int i_690_ = i_685_ - i_689_;
			int i_691_ = 0;
			if (i_681_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
				int i_692_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_681_;
				i_688_ -= i_692_;
				i_681_ = aClass180_Sub1_8876.anInt9392 * -456655989;
				i_687_ += i_692_ * i_689_;
				i_686_ += i_692_ * i_685_;
			}
			if (i_681_ + i_688_ > aClass180_Sub1_8876.anInt9393 * -383695469)
				i_688_ -= (i_681_ + i_688_ - aClass180_Sub1_8876.anInt9393 * -383695469);
			if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
				int i_693_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
				i_689_ -= i_693_;
				i = aClass180_Sub1_8876.anInt9383 * 1605202751;
				i_687_ += i_693_;
				i_686_ += i_693_;
				i_691_ += i_693_;
				i_690_ += i_693_;
			}
			if (i + i_689_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
				int i_694_ = i + i_689_ - aClass180_Sub1_8876.anInt9391 * 2014358275;
				i_689_ -= i_694_;
				i_691_ += i_694_;
				i_690_ += i_694_;
			}
			if (i_689_ > 0 && i_688_ > 0) {
				if (i_684_ == 0) {
					if (i_682_ == 1) {
						for (int i_695_ = -i_688_; i_695_ < 0; i_695_++) {
							int i_696_ = i_686_ + i_689_ - 3;
							while (i_686_ < i_696_) {
								is[i_686_++] = anIntArray11380[i_687_++];
								is[i_686_++] = anIntArray11380[i_687_++];
								is[i_686_++] = anIntArray11380[i_687_++];
								is[i_686_++] = anIntArray11380[i_687_++];
							}
							i_696_ += 3;
							while (i_686_ < i_696_)
								is[i_686_++] = anIntArray11380[i_687_++];
							i_686_ += i_690_;
							i_687_ += i_691_;
						}
					} else if (i_682_ == 0) {
						int i_697_ = (i_683_ & 0xff0000) >> 16;
						int i_698_ = (i_683_ & 0xff00) >> 8;
						int i_699_ = i_683_ & 0xff;
						for (int i_700_ = -i_688_; i_700_ < 0; i_700_++) {
							for (int i_701_ = -i_689_; i_701_ < 0; i_701_++) {
								int i_702_ = anIntArray11380[i_687_++];
								int i_703_ = (i_702_ & 0xff0000) * i_697_ & ~0xffffff;
								int i_704_ = (i_702_ & 0xff00) * i_698_ & 0xff0000;
								int i_705_ = (i_702_ & 0xff) * i_699_ & 0xff00;
								is[i_686_++] = (i_703_ | i_704_ | i_705_) >>> 8;
							}
							i_686_ += i_690_;
							i_687_ += i_691_;
						}
					} else if (i_682_ == 3) {
						for (int i_706_ = -i_688_; i_706_ < 0; i_706_++) {
							for (int i_707_ = -i_689_; i_707_ < 0; i_707_++) {
								int i_708_ = anIntArray11380[i_687_++];
								int i_709_ = i_708_ + i_683_;
								int i_710_ = ((i_708_ & 0xff00ff) + (i_683_ & 0xff00ff));
								int i_711_ = ((i_710_ & 0x1000100) + (i_709_ - i_710_ & 0x10000));
								is[i_686_++] = i_709_ - i_711_ | i_711_ - (i_711_ >>> 8);
							}
							i_686_ += i_690_;
							i_687_ += i_691_;
						}
					} else if (i_682_ == 2) {
						int i_712_ = i_683_ >>> 24;
						int i_713_ = 256 - i_712_;
						int i_714_ = (i_683_ & 0xff00ff) * i_713_ & ~0xff00ff;
						int i_715_ = (i_683_ & 0xff00) * i_713_ & 0xff0000;
						i_683_ = (i_714_ | i_715_) >>> 8;
						for (int i_716_ = -i_688_; i_716_ < 0; i_716_++) {
							for (int i_717_ = -i_689_; i_717_ < 0; i_717_++) {
								int i_718_ = anIntArray11380[i_687_++];
								i_714_ = (i_718_ & 0xff00ff) * i_712_ & ~0xff00ff;
								i_715_ = (i_718_ & 0xff00) * i_712_ & 0xff0000;
								is[i_686_++] = ((i_714_ | i_715_) >>> 8) + i_683_;
							}
							i_686_ += i_690_;
							i_687_ += i_691_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_684_ == 1) {
					if (i_682_ == 1) {
						for (int i_719_ = -i_688_; i_719_ < 0; i_719_++) {
							for (int i_720_ = -i_689_; i_720_ < 0; i_720_++) {
								int i_721_ = anIntArray11380[i_687_++];
								int i_722_ = i_721_ >>> 24;
								int i_723_ = 256 - i_722_;
								int i_724_ = is[i_686_];
								is[i_686_++] = (((((i_721_ & 0xff00ff) * i_722_ + (i_724_ & 0xff00ff) * i_723_) & ~0xff00ff) >> 8) + (((((i_721_ & ~0xff00ff) >>> 8) * i_722_) + (((i_724_ & ~0xff00ff) >>> 8) * i_723_)) & ~0xff00ff));
							}
							i_686_ += i_690_;
							i_687_ += i_691_;
						}
					} else if (i_682_ == 0) {
						if ((i_683_ & 0xffffff) == 16777215) {
							for (int i_725_ = -i_688_; i_725_ < 0; i_725_++) {
								for (int i_726_ = -i_689_; i_726_ < 0; i_726_++) {
									int i_727_ = anIntArray11380[i_687_++];
									int i_728_ = ((i_727_ >>> 24) * (i_683_ >>> 24) >> 8);
									int i_729_ = 256 - i_728_;
									int i_730_ = is[i_686_];
									is[i_686_++] = ((((i_727_ & 0xff00ff) * i_728_ + (i_730_ & 0xff00ff) * i_729_) & ~0xff00ff) + (((i_727_ & 0xff00) * i_728_ + (i_730_ & 0xff00) * i_729_) & 0xff0000)) >> 8;
								}
								i_686_ += i_690_;
								i_687_ += i_691_;
							}
						} else {
							int i_731_ = (i_683_ & 0xff0000) >> 16;
							int i_732_ = (i_683_ & 0xff00) >> 8;
							int i_733_ = i_683_ & 0xff;
							for (int i_734_ = -i_688_; i_734_ < 0; i_734_++) {
								for (int i_735_ = -i_689_; i_735_ < 0; i_735_++) {
									int i_736_ = anIntArray11380[i_687_++];
									int i_737_ = ((i_736_ >>> 24) * (i_683_ >>> 24) >> 8);
									int i_738_ = 256 - i_737_;
									if (i_737_ != 255) {
										int i_739_ = ((i_736_ & 0xff0000) * i_731_ & ~0xffffff);
										int i_740_ = ((i_736_ & 0xff00) * i_732_ & 0xff0000);
										int i_741_ = ((i_736_ & 0xff) * i_733_ & 0xff00);
										i_736_ = (i_739_ | i_740_ | i_741_) >>> 8;
										int i_742_ = is[i_686_];
										is[i_686_++] = ((((i_736_ & 0xff00ff) * i_737_ + ((i_742_ & 0xff00ff) * i_738_)) & ~0xff00ff) + (((i_736_ & 0xff00) * i_737_ + ((i_742_ & 0xff00) * i_738_)) & 0xff0000)) >> 8;
									} else {
										int i_743_ = ((i_736_ & 0xff0000) * i_731_ & ~0xffffff);
										int i_744_ = ((i_736_ & 0xff00) * i_732_ & 0xff0000);
										int i_745_ = ((i_736_ & 0xff) * i_733_ & 0xff00);
										is[i_686_++] = (i_743_ | i_744_ | i_745_) >>> 8;
									}
								}
								i_686_ += i_690_;
								i_687_ += i_691_;
							}
						}
					} else if (i_682_ == 3) {
						for (int i_746_ = -i_688_; i_746_ < 0; i_746_++) {
							for (int i_747_ = -i_689_; i_747_ < 0; i_747_++) {
								int i_748_ = anIntArray11380[i_687_++];
								int i_749_ = i_748_ + i_683_;
								int i_750_ = ((i_748_ & 0xff00ff) + (i_683_ & 0xff00ff));
								int i_751_ = ((i_750_ & 0x1000100) + (i_749_ - i_750_ & 0x10000));
								i_751_ = i_749_ - i_751_ | i_751_ - (i_751_ >>> 8);
								int i_752_ = (i_751_ >>> 24) * (i_683_ >>> 24) >> 8;
								int i_753_ = 256 - i_752_;
								if (i_752_ != 255) {
									i_748_ = i_751_;
									i_751_ = is[i_686_];
									i_751_ = ((((i_748_ & 0xff00ff) * i_752_ + (i_751_ & 0xff00ff) * i_753_) & ~0xff00ff) + (((i_748_ & 0xff00) * i_752_ + (i_751_ & 0xff00) * i_753_) & 0xff0000)) >> 8;
								}
								is[i_686_++] = i_751_;
							}
							i_686_ += i_690_;
							i_687_ += i_691_;
						}
					} else if (i_682_ == 2) {
						int i_754_ = i_683_ >>> 24;
						int i_755_ = 256 - i_754_;
						int i_756_ = (i_683_ & 0xff00ff) * i_755_ & ~0xff00ff;
						int i_757_ = (i_683_ & 0xff00) * i_755_ & 0xff0000;
						i_683_ = (i_756_ | i_757_) >>> 8;
						for (int i_758_ = -i_688_; i_758_ < 0; i_758_++) {
							for (int i_759_ = -i_689_; i_759_ < 0; i_759_++) {
								int i_760_ = anIntArray11380[i_687_++];
								int i_761_ = i_760_ >>> 24;
								int i_762_ = 256 - i_761_;
								i_756_ = (i_760_ & 0xff00ff) * i_754_ & ~0xff00ff;
								i_757_ = (i_760_ & 0xff00) * i_754_ & 0xff0000;
								i_760_ = ((i_756_ | i_757_) >>> 8) + i_683_;
								int i_763_ = is[i_686_];
								is[i_686_++] = ((((i_760_ & 0xff00ff) * i_761_ + (i_763_ & 0xff00ff) * i_762_) & ~0xff00ff) + (((i_760_ & 0xff00) * i_761_ + (i_763_ & 0xff00) * i_762_) & 0xff0000)) >> 8;
							}
							i_686_ += i_690_;
							i_687_ += i_691_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_684_ == 2) {
					if (i_682_ == 1) {
						for (int i_764_ = -i_688_; i_764_ < 0; i_764_++) {
							for (int i_765_ = -i_689_; i_765_ < 0; i_765_++) {
								int i_766_ = anIntArray11380[i_687_++];
								if (i_766_ != 0) {
									int i_767_ = is[i_686_];
									int i_768_ = i_766_ + i_767_;
									int i_769_ = ((i_766_ & 0xff00ff) + (i_767_ & 0xff00ff));
									i_767_ = ((i_769_ & 0x1000100) + (i_768_ - i_769_ & 0x10000));
									is[i_686_++] = i_768_ - i_767_ | i_767_ - (i_767_ >>> 8);
								} else
									i_686_++;
							}
							i_686_ += i_690_;
							i_687_ += i_691_;
						}
					} else if (i_682_ == 0) {
						int i_770_ = (i_683_ & 0xff0000) >> 16;
						int i_771_ = (i_683_ & 0xff00) >> 8;
						int i_772_ = i_683_ & 0xff;
						for (int i_773_ = -i_688_; i_773_ < 0; i_773_++) {
							for (int i_774_ = -i_689_; i_774_ < 0; i_774_++) {
								int i_775_ = anIntArray11380[i_687_++];
								if (i_775_ != 0) {
									int i_776_ = ((i_775_ & 0xff0000) * i_770_ & ~0xffffff);
									int i_777_ = ((i_775_ & 0xff00) * i_771_ & 0xff0000);
									int i_778_ = (i_775_ & 0xff) * i_772_ & 0xff00;
									i_775_ = (i_776_ | i_777_ | i_778_) >>> 8;
									int i_779_ = is[i_686_];
									int i_780_ = i_775_ + i_779_;
									int i_781_ = ((i_775_ & 0xff00ff) + (i_779_ & 0xff00ff));
									i_779_ = ((i_781_ & 0x1000100) + (i_780_ - i_781_ & 0x10000));
									is[i_686_++] = i_780_ - i_779_ | i_779_ - (i_779_ >>> 8);
								} else
									i_686_++;
							}
							i_686_ += i_690_;
							i_687_ += i_691_;
						}
					} else if (i_682_ == 3) {
						for (int i_782_ = -i_688_; i_782_ < 0; i_782_++) {
							for (int i_783_ = -i_689_; i_783_ < 0; i_783_++) {
								int i_784_ = anIntArray11380[i_687_++];
								int i_785_ = i_784_ + i_683_;
								int i_786_ = ((i_784_ & 0xff00ff) + (i_683_ & 0xff00ff));
								int i_787_ = ((i_786_ & 0x1000100) + (i_785_ - i_786_ & 0x10000));
								i_784_ = i_785_ - i_787_ | i_787_ - (i_787_ >>> 8);
								i_787_ = is[i_686_];
								i_785_ = i_784_ + i_787_;
								i_786_ = (i_784_ & 0xff00ff) + (i_787_ & 0xff00ff);
								i_787_ = (i_786_ & 0x1000100) + (i_785_ - i_786_ & 0x10000);
								is[i_686_++] = i_785_ - i_787_ | i_787_ - (i_787_ >>> 8);
							}
							i_686_ += i_690_;
							i_687_ += i_691_;
						}
					} else if (i_682_ == 2) {
						int i_788_ = i_683_ >>> 24;
						int i_789_ = 256 - i_788_;
						int i_790_ = (i_683_ & 0xff00ff) * i_789_ & ~0xff00ff;
						int i_791_ = (i_683_ & 0xff00) * i_789_ & 0xff0000;
						i_683_ = (i_790_ | i_791_) >>> 8;
						for (int i_792_ = -i_688_; i_792_ < 0; i_792_++) {
							for (int i_793_ = -i_689_; i_793_ < 0; i_793_++) {
								int i_794_ = anIntArray11380[i_687_++];
								if (i_794_ != 0) {
									i_790_ = ((i_794_ & 0xff00ff) * i_788_ & ~0xff00ff);
									i_791_ = ((i_794_ & 0xff00) * i_788_ & 0xff0000);
									i_794_ = ((i_790_ | i_791_) >>> 8) + i_683_;
									int i_795_ = is[i_686_];
									int i_796_ = i_794_ + i_795_;
									int i_797_ = ((i_794_ & 0xff00ff) + (i_795_ & 0xff00ff));
									i_795_ = ((i_797_ & 0x1000100) + (i_796_ - i_797_ & 0x10000));
									is[i_686_++] = i_796_ - i_795_ | i_795_ - (i_795_ >>> 8);
								} else
									i_686_++;
							}
							i_686_ += i_690_;
							i_687_ += i_691_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2436(int i, int i_798_, int i_799_) {
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is == null)
			throw new IllegalStateException("");
		if (i_799_ == 0) {
			for (int i_800_ = 0; i_800_ < anInt8880; i_800_++) {
				int i_801_ = i_800_ * anInt8877;
				int i_802_ = (i_798_ + i_800_) * (aClass180_Sub1_8876.anInt9387 * -1173855569) + i;
				for (int i_803_ = 0; i_803_ < anInt8877; i_803_++)
					anIntArray11380[i_801_ + i_803_] = (anIntArray11380[i_801_ + i_803_] & 0xffffff | is[i_802_ + i_803_] << 8 & ~0xffffff);
			}
		} else if (i_799_ == 1) {
			for (int i_804_ = 0; i_804_ < anInt8880; i_804_++) {
				int i_805_ = i_804_ * anInt8877;
				int i_806_ = (i_798_ + i_804_) * (aClass180_Sub1_8876.anInt9387 * -1173855569) + i;
				for (int i_807_ = 0; i_807_ < anInt8877; i_807_++)
					anIntArray11380[i_805_ + i_807_] = (anIntArray11380[i_805_ + i_807_] & 0xffffff | is[i_806_ + i_807_] << 16 & ~0xffffff);
			}
		} else if (i_799_ == 2) {
			for (int i_808_ = 0; i_808_ < anInt8880; i_808_++) {
				int i_809_ = i_808_ * anInt8877;
				int i_810_ = (i_798_ + i_808_) * (aClass180_Sub1_8876.anInt9387 * -1173855569) + i;
				for (int i_811_ = 0; i_811_ < anInt8877; i_811_++)
					anIntArray11380[i_809_ + i_811_] = (anIntArray11380[i_809_ + i_811_] & 0xffffff | is[i_810_ + i_811_] << 24 & ~0xffffff);
			}
		} else if (i_799_ == 3) {
			for (int i_812_ = 0; i_812_ < anInt8880; i_812_++) {
				int i_813_ = i_812_ * anInt8877;
				int i_814_ = (i_798_ + i_812_) * (aClass180_Sub1_8876.anInt9387 * -1173855569) + i;
				for (int i_815_ = 0; i_815_ < anInt8877; i_815_++)
					anIntArray11380[i_813_ + i_815_] = (anIntArray11380[i_813_ + i_815_] & 0xffffff | (is[i_814_ + i_815_] != 0 ? -16777216 : 0));
			}
		}
	}

	public void method2486(int i, int i_816_, int i_817_) {
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is == null)
			throw new IllegalStateException("");
		if (i_817_ == 0) {
			for (int i_818_ = 0; i_818_ < anInt8880; i_818_++) {
				int i_819_ = i_818_ * anInt8877;
				int i_820_ = (i_816_ + i_818_) * (aClass180_Sub1_8876.anInt9387 * -1173855569) + i;
				for (int i_821_ = 0; i_821_ < anInt8877; i_821_++)
					anIntArray11380[i_819_ + i_821_] = (anIntArray11380[i_819_ + i_821_] & 0xffffff | is[i_820_ + i_821_] << 8 & ~0xffffff);
			}
		} else if (i_817_ == 1) {
			for (int i_822_ = 0; i_822_ < anInt8880; i_822_++) {
				int i_823_ = i_822_ * anInt8877;
				int i_824_ = (i_816_ + i_822_) * (aClass180_Sub1_8876.anInt9387 * -1173855569) + i;
				for (int i_825_ = 0; i_825_ < anInt8877; i_825_++)
					anIntArray11380[i_823_ + i_825_] = (anIntArray11380[i_823_ + i_825_] & 0xffffff | is[i_824_ + i_825_] << 16 & ~0xffffff);
			}
		} else if (i_817_ == 2) {
			for (int i_826_ = 0; i_826_ < anInt8880; i_826_++) {
				int i_827_ = i_826_ * anInt8877;
				int i_828_ = (i_816_ + i_826_) * (aClass180_Sub1_8876.anInt9387 * -1173855569) + i;
				for (int i_829_ = 0; i_829_ < anInt8877; i_829_++)
					anIntArray11380[i_827_ + i_829_] = (anIntArray11380[i_827_ + i_829_] & 0xffffff | is[i_828_ + i_829_] << 24 & ~0xffffff);
			}
		} else if (i_817_ == 3) {
			for (int i_830_ = 0; i_830_ < anInt8880; i_830_++) {
				int i_831_ = i_830_ * anInt8877;
				int i_832_ = (i_816_ + i_830_) * (aClass180_Sub1_8876.anInt9387 * -1173855569) + i;
				for (int i_833_ = 0; i_833_ < anInt8877; i_833_++)
					anIntArray11380[i_831_ + i_833_] = (anIntArray11380[i_831_ + i_833_] & 0xffffff | (is[i_832_ + i_833_] != 0 ? -16777216 : 0));
			}
		}
	}

	public void method2444(int i, int i_834_, int i_835_, int i_836_, int[] is, int i_837_, int i_838_) {
		i_838_ -= i_835_;
		for (int i_839_ = 0; i_839_ < i_836_; i_839_++) {
			int i_840_ = (i_834_ + i_839_) * i_835_ + i;
			for (int i_841_ = 0; i_841_ < i_835_; i_841_++)
				anIntArray11380[i_840_ + i_841_] = is[i_837_++];
			i_837_ += i_838_;
		}
	}

	void method2439(int i, int i_842_, int i_843_, int i_844_, int i_845_, int i_846_, int i_847_, int i_848_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		if (i_843_ > 0 && i_844_ > 0) {
			int[] is = aClass180_Sub1_8876.anIntArray9386;
			if (is != null) {
				int i_849_ = 0;
				int i_850_ = 0;
				int i_851_ = aClass180_Sub1_8876.anInt9387 * -1173855569;
				int i_852_ = anInt8879 + anInt8877 + anInt8878;
				int i_853_ = anInt8895 + anInt8880 + anInt8882;
				int i_854_ = (i_852_ << 16) / i_843_;
				int i_855_ = (i_853_ << 16) / i_844_;
				if (anInt8879 > 0) {
					int i_856_ = ((anInt8879 << 16) + i_854_ - 1) / i_854_;
					i += i_856_;
					i_849_ += i_856_ * i_854_ - (anInt8879 << 16);
				}
				if (anInt8895 > 0) {
					int i_857_ = ((anInt8895 << 16) + i_855_ - 1) / i_855_;
					i_842_ += i_857_;
					i_850_ += i_857_ * i_855_ - (anInt8895 << 16);
				}
				if (anInt8877 < i_852_)
					i_843_ = ((anInt8877 << 16) - i_849_ + i_854_ - 1) / i_854_;
				if (anInt8880 < i_853_)
					i_844_ = ((anInt8880 << 16) - i_850_ + i_855_ - 1) / i_855_;
				int i_858_ = i + i_842_ * i_851_;
				int i_859_ = i_851_ - i_843_;
				if (i_842_ + i_844_ > aClass180_Sub1_8876.anInt9393 * -383695469)
					i_844_ -= (i_842_ + i_844_ - aClass180_Sub1_8876.anInt9393 * -383695469);
				if (i_842_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
					int i_860_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_842_;
					i_844_ -= i_860_;
					i_858_ += i_860_ * i_851_;
					i_850_ += i_855_ * i_860_;
				}
				if (i + i_843_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
					int i_861_ = (i + i_843_ - aClass180_Sub1_8876.anInt9391 * 2014358275);
					i_843_ -= i_861_;
					i_859_ += i_861_;
				}
				if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
					int i_862_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
					i_843_ -= i_862_;
					i_858_ += i_862_;
					i_849_ += i_854_ * i_862_;
					i_859_ += i_862_;
				}
				if (i_847_ == 0) {
					if (i_845_ == 1) {
						int i_863_ = i_849_;
						for (int i_864_ = -i_844_; i_864_ < 0; i_864_++) {
							int i_865_ = (i_850_ >> 16) * anInt8877;
							for (int i_866_ = -i_843_; i_866_ < 0; i_866_++) {
								is[i_858_++] = anIntArray11380[(i_849_ >> 16) + i_865_];
								i_849_ += i_854_;
							}
							i_850_ += i_855_;
							i_849_ = i_863_;
							i_858_ += i_859_;
						}
					} else if (i_845_ == 0) {
						int i_867_ = (i_846_ & 0xff0000) >> 16;
						int i_868_ = (i_846_ & 0xff00) >> 8;
						int i_869_ = i_846_ & 0xff;
						int i_870_ = i_849_;
						for (int i_871_ = -i_844_; i_871_ < 0; i_871_++) {
							int i_872_ = (i_850_ >> 16) * anInt8877;
							for (int i_873_ = -i_843_; i_873_ < 0; i_873_++) {
								int i_874_ = anIntArray11380[(i_849_ >> 16) + i_872_];
								int i_875_ = (i_874_ & 0xff0000) * i_867_ & ~0xffffff;
								int i_876_ = (i_874_ & 0xff00) * i_868_ & 0xff0000;
								int i_877_ = (i_874_ & 0xff) * i_869_ & 0xff00;
								is[i_858_++] = (i_875_ | i_876_ | i_877_) >>> 8;
								i_849_ += i_854_;
							}
							i_850_ += i_855_;
							i_849_ = i_870_;
							i_858_ += i_859_;
						}
					} else if (i_845_ == 3) {
						int i_878_ = i_849_;
						for (int i_879_ = -i_844_; i_879_ < 0; i_879_++) {
							int i_880_ = (i_850_ >> 16) * anInt8877;
							for (int i_881_ = -i_843_; i_881_ < 0; i_881_++) {
								int i_882_ = anIntArray11380[(i_849_ >> 16) + i_880_];
								int i_883_ = i_882_ + i_846_;
								int i_884_ = ((i_882_ & 0xff00ff) + (i_846_ & 0xff00ff));
								int i_885_ = ((i_884_ & 0x1000100) + (i_883_ - i_884_ & 0x10000));
								is[i_858_++] = i_883_ - i_885_ | i_885_ - (i_885_ >>> 8);
								i_849_ += i_854_;
							}
							i_850_ += i_855_;
							i_849_ = i_878_;
							i_858_ += i_859_;
						}
					} else if (i_845_ == 2) {
						int i_886_ = i_846_ >>> 24;
						int i_887_ = 256 - i_886_;
						int i_888_ = (i_846_ & 0xff00ff) * i_887_ & ~0xff00ff;
						int i_889_ = (i_846_ & 0xff00) * i_887_ & 0xff0000;
						i_846_ = (i_888_ | i_889_) >>> 8;
						int i_890_ = i_849_;
						for (int i_891_ = -i_844_; i_891_ < 0; i_891_++) {
							int i_892_ = (i_850_ >> 16) * anInt8877;
							for (int i_893_ = -i_843_; i_893_ < 0; i_893_++) {
								int i_894_ = anIntArray11380[(i_849_ >> 16) + i_892_];
								i_888_ = (i_894_ & 0xff00ff) * i_886_ & ~0xff00ff;
								i_889_ = (i_894_ & 0xff00) * i_886_ & 0xff0000;
								is[i_858_++] = ((i_888_ | i_889_) >>> 8) + i_846_;
								i_849_ += i_854_;
							}
							i_850_ += i_855_;
							i_849_ = i_890_;
							i_858_ += i_859_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_847_ == 1) {
					if (i_845_ == 1) {
						int i_895_ = i_849_;
						for (int i_896_ = -i_844_; i_896_ < 0; i_896_++) {
							int i_897_ = (i_850_ >> 16) * anInt8877;
							for (int i_898_ = -i_843_; i_898_ < 0; i_898_++) {
								int i_899_ = anIntArray11380[(i_849_ >> 16) + i_897_];
								int i_900_ = i_899_ >>> 24;
								int i_901_ = 256 - i_900_;
								int i_902_ = is[i_858_];
								is[i_858_++] = (((((i_899_ & 0xff00ff) * i_900_ + (i_902_ & 0xff00ff) * i_901_) & ~0xff00ff) >> 8) + (((((i_899_ & ~0xff00ff) >>> 8) * i_900_) + (((i_902_ & ~0xff00ff) >>> 8) * i_901_)) & ~0xff00ff));
								i_849_ += i_854_;
							}
							i_850_ += i_855_;
							i_849_ = i_895_;
							i_858_ += i_859_;
						}
					} else if (i_845_ == 0) {
						int i_903_ = i_849_;
						if ((i_846_ & 0xffffff) == 16777215) {
							for (int i_904_ = -i_844_; i_904_ < 0; i_904_++) {
								int i_905_ = (i_850_ >> 16) * anInt8877;
								for (int i_906_ = -i_843_; i_906_ < 0; i_906_++) {
									int i_907_ = (anIntArray11380[(i_849_ >> 16) + i_905_]);
									int i_908_ = ((i_907_ >>> 24) * (i_846_ >>> 24) >> 8);
									int i_909_ = 256 - i_908_;
									int i_910_ = is[i_858_];
									is[i_858_++] = ((((i_907_ & 0xff00ff) * i_908_ + (i_910_ & 0xff00ff) * i_909_) & ~0xff00ff) + (((i_907_ & 0xff00) * i_908_ + (i_910_ & 0xff00) * i_909_) & 0xff0000)) >> 8;
									i_849_ += i_854_;
								}
								i_850_ += i_855_;
								i_849_ = i_903_;
								i_858_ += i_859_;
							}
						} else {
							int i_911_ = (i_846_ & 0xff0000) >> 16;
							int i_912_ = (i_846_ & 0xff00) >> 8;
							int i_913_ = i_846_ & 0xff;
							for (int i_914_ = -i_844_; i_914_ < 0; i_914_++) {
								int i_915_ = (i_850_ >> 16) * anInt8877;
								for (int i_916_ = -i_843_; i_916_ < 0; i_916_++) {
									int i_917_ = (anIntArray11380[(i_849_ >> 16) + i_915_]);
									int i_918_ = ((i_917_ >>> 24) * (i_846_ >>> 24) >> 8);
									int i_919_ = 256 - i_918_;
									if (i_918_ != 255) {
										int i_920_ = ((i_917_ & 0xff0000) * i_911_ & ~0xffffff);
										int i_921_ = ((i_917_ & 0xff00) * i_912_ & 0xff0000);
										int i_922_ = ((i_917_ & 0xff) * i_913_ & 0xff00);
										i_917_ = (i_920_ | i_921_ | i_922_) >>> 8;
										int i_923_ = is[i_858_];
										is[i_858_++] = ((((i_917_ & 0xff00ff) * i_918_ + ((i_923_ & 0xff00ff) * i_919_)) & ~0xff00ff) + (((i_917_ & 0xff00) * i_918_ + ((i_923_ & 0xff00) * i_919_)) & 0xff0000)) >> 8;
									} else {
										int i_924_ = ((i_917_ & 0xff0000) * i_911_ & ~0xffffff);
										int i_925_ = ((i_917_ & 0xff00) * i_912_ & 0xff0000);
										int i_926_ = ((i_917_ & 0xff) * i_913_ & 0xff00);
										is[i_858_++] = (i_924_ | i_925_ | i_926_) >>> 8;
									}
									i_849_ += i_854_;
								}
								i_850_ += i_855_;
								i_849_ = i_903_;
								i_858_ += i_859_;
							}
						}
					} else if (i_845_ == 3) {
						int i_927_ = i_849_;
						for (int i_928_ = -i_844_; i_928_ < 0; i_928_++) {
							int i_929_ = (i_850_ >> 16) * anInt8877;
							for (int i_930_ = -i_843_; i_930_ < 0; i_930_++) {
								int i_931_ = anIntArray11380[(i_849_ >> 16) + i_929_];
								int i_932_ = i_931_ + i_846_;
								int i_933_ = ((i_931_ & 0xff00ff) + (i_846_ & 0xff00ff));
								int i_934_ = ((i_933_ & 0x1000100) + (i_932_ - i_933_ & 0x10000));
								i_934_ = i_932_ - i_934_ | i_934_ - (i_934_ >>> 8);
								int i_935_ = (i_934_ >>> 24) * (i_846_ >>> 24) >> 8;
								int i_936_ = 256 - i_935_;
								if (i_935_ != 255) {
									i_931_ = i_934_;
									i_934_ = is[i_858_];
									i_934_ = ((((i_931_ & 0xff00ff) * i_935_ + (i_934_ & 0xff00ff) * i_936_) & ~0xff00ff) + (((i_931_ & 0xff00) * i_935_ + (i_934_ & 0xff00) * i_936_) & 0xff0000)) >> 8;
								}
								is[i_858_++] = i_934_;
								i_849_ += i_854_;
							}
							i_850_ += i_855_;
							i_849_ = i_927_;
							i_858_ += i_859_;
						}
					} else if (i_845_ == 2) {
						int i_937_ = i_846_ >>> 24;
						int i_938_ = 256 - i_937_;
						int i_939_ = (i_846_ & 0xff00ff) * i_938_ & ~0xff00ff;
						int i_940_ = (i_846_ & 0xff00) * i_938_ & 0xff0000;
						i_846_ = (i_939_ | i_940_) >>> 8;
						int i_941_ = i_849_;
						for (int i_942_ = -i_844_; i_942_ < 0; i_942_++) {
							int i_943_ = (i_850_ >> 16) * anInt8877;
							for (int i_944_ = -i_843_; i_944_ < 0; i_944_++) {
								int i_945_ = anIntArray11380[(i_849_ >> 16) + i_943_];
								int i_946_ = i_945_ >>> 24;
								int i_947_ = 256 - i_946_;
								i_939_ = (i_945_ & 0xff00ff) * i_937_ & ~0xff00ff;
								i_940_ = (i_945_ & 0xff00) * i_937_ & 0xff0000;
								i_945_ = ((i_939_ | i_940_) >>> 8) + i_846_;
								int i_948_ = is[i_858_];
								is[i_858_++] = ((((i_945_ & 0xff00ff) * i_946_ + (i_948_ & 0xff00ff) * i_947_) & ~0xff00ff) + (((i_945_ & 0xff00) * i_946_ + (i_948_ & 0xff00) * i_947_) & 0xff0000)) >> 8;
								i_849_ += i_854_;
							}
							i_850_ += i_855_;
							i_849_ = i_941_;
							i_858_ += i_859_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_847_ == 2) {
					if (i_845_ == 1) {
						int i_949_ = i_849_;
						for (int i_950_ = -i_844_; i_950_ < 0; i_950_++) {
							int i_951_ = (i_850_ >> 16) * anInt8877;
							for (int i_952_ = -i_843_; i_952_ < 0; i_952_++) {
								int i_953_ = anIntArray11380[(i_849_ >> 16) + i_951_];
								if (i_953_ != 0) {
									int i_954_ = is[i_858_];
									int i_955_ = i_953_ + i_954_;
									int i_956_ = ((i_953_ & 0xff00ff) + (i_954_ & 0xff00ff));
									i_954_ = ((i_956_ & 0x1000100) + (i_955_ - i_956_ & 0x10000));
									is[i_858_++] = i_955_ - i_954_ | i_954_ - (i_954_ >>> 8);
								} else
									i_858_++;
								i_849_ += i_854_;
							}
							i_850_ += i_855_;
							i_849_ = i_949_;
							i_858_ += i_859_;
						}
					} else if (i_845_ == 0) {
						int i_957_ = i_849_;
						int i_958_ = (i_846_ & 0xff0000) >> 16;
						int i_959_ = (i_846_ & 0xff00) >> 8;
						int i_960_ = i_846_ & 0xff;
						for (int i_961_ = -i_844_; i_961_ < 0; i_961_++) {
							int i_962_ = (i_850_ >> 16) * anInt8877;
							for (int i_963_ = -i_843_; i_963_ < 0; i_963_++) {
								int i_964_ = anIntArray11380[(i_849_ >> 16) + i_962_];
								if (i_964_ != 0) {
									int i_965_ = ((i_964_ & 0xff0000) * i_958_ & ~0xffffff);
									int i_966_ = ((i_964_ & 0xff00) * i_959_ & 0xff0000);
									int i_967_ = (i_964_ & 0xff) * i_960_ & 0xff00;
									i_964_ = (i_965_ | i_966_ | i_967_) >>> 8;
									int i_968_ = is[i_858_];
									int i_969_ = i_964_ + i_968_;
									int i_970_ = ((i_964_ & 0xff00ff) + (i_968_ & 0xff00ff));
									i_968_ = ((i_970_ & 0x1000100) + (i_969_ - i_970_ & 0x10000));
									is[i_858_++] = i_969_ - i_968_ | i_968_ - (i_968_ >>> 8);
								} else
									i_858_++;
								i_849_ += i_854_;
							}
							i_850_ += i_855_;
							i_849_ = i_957_;
							i_858_ += i_859_;
						}
					} else if (i_845_ == 3) {
						int i_971_ = i_849_;
						for (int i_972_ = -i_844_; i_972_ < 0; i_972_++) {
							int i_973_ = (i_850_ >> 16) * anInt8877;
							for (int i_974_ = -i_843_; i_974_ < 0; i_974_++) {
								int i_975_ = anIntArray11380[(i_849_ >> 16) + i_973_];
								int i_976_ = i_975_ + i_846_;
								int i_977_ = ((i_975_ & 0xff00ff) + (i_846_ & 0xff00ff));
								int i_978_ = ((i_977_ & 0x1000100) + (i_976_ - i_977_ & 0x10000));
								i_975_ = i_976_ - i_978_ | i_978_ - (i_978_ >>> 8);
								i_978_ = is[i_858_];
								i_976_ = i_975_ + i_978_;
								i_977_ = (i_975_ & 0xff00ff) + (i_978_ & 0xff00ff);
								i_978_ = (i_977_ & 0x1000100) + (i_976_ - i_977_ & 0x10000);
								is[i_858_++] = i_976_ - i_978_ | i_978_ - (i_978_ >>> 8);
								i_849_ += i_854_;
							}
							i_850_ += i_855_;
							i_849_ = i_971_;
							i_858_ += i_859_;
						}
					} else if (i_845_ == 2) {
						int i_979_ = i_846_ >>> 24;
						int i_980_ = 256 - i_979_;
						int i_981_ = (i_846_ & 0xff00ff) * i_980_ & ~0xff00ff;
						int i_982_ = (i_846_ & 0xff00) * i_980_ & 0xff0000;
						i_846_ = (i_981_ | i_982_) >>> 8;
						int i_983_ = i_849_;
						for (int i_984_ = -i_844_; i_984_ < 0; i_984_++) {
							int i_985_ = (i_850_ >> 16) * anInt8877;
							for (int i_986_ = -i_843_; i_986_ < 0; i_986_++) {
								int i_987_ = anIntArray11380[(i_849_ >> 16) + i_985_];
								if (i_987_ != 0) {
									i_981_ = ((i_987_ & 0xff00ff) * i_979_ & ~0xff00ff);
									i_982_ = ((i_987_ & 0xff00) * i_979_ & 0xff0000);
									i_987_ = ((i_981_ | i_982_) >>> 8) + i_846_;
									int i_988_ = is[i_858_];
									int i_989_ = i_987_ + i_988_;
									int i_990_ = ((i_987_ & 0xff00ff) + (i_988_ & 0xff00ff));
									i_988_ = ((i_990_ & 0x1000100) + (i_989_ - i_990_ & 0x10000));
									is[i_858_++] = i_989_ - i_988_ | i_988_ - (i_988_ >>> 8);
								} else
									i_858_++;
								i_849_ += i_854_;
							}
							i_850_ += i_855_;
							i_849_ = i_983_;
							i_858_ += i_859_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method2472(int i, int i_991_, int i_992_, int i_993_, int i_994_, int i_995_, int i_996_, int i_997_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		if (i_992_ > 0 && i_993_ > 0) {
			int[] is = aClass180_Sub1_8876.anIntArray9386;
			if (is != null) {
				int i_998_ = 0;
				int i_999_ = 0;
				int i_1000_ = aClass180_Sub1_8876.anInt9387 * -1173855569;
				int i_1001_ = anInt8879 + anInt8877 + anInt8878;
				int i_1002_ = anInt8895 + anInt8880 + anInt8882;
				int i_1003_ = (i_1001_ << 16) / i_992_;
				int i_1004_ = (i_1002_ << 16) / i_993_;
				if (anInt8879 > 0) {
					int i_1005_ = ((anInt8879 << 16) + i_1003_ - 1) / i_1003_;
					i += i_1005_;
					i_998_ += i_1005_ * i_1003_ - (anInt8879 << 16);
				}
				if (anInt8895 > 0) {
					int i_1006_ = ((anInt8895 << 16) + i_1004_ - 1) / i_1004_;
					i_991_ += i_1006_;
					i_999_ += i_1006_ * i_1004_ - (anInt8895 << 16);
				}
				if (anInt8877 < i_1001_)
					i_992_ = ((anInt8877 << 16) - i_998_ + i_1003_ - 1) / i_1003_;
				if (anInt8880 < i_1002_)
					i_993_ = ((anInt8880 << 16) - i_999_ + i_1004_ - 1) / i_1004_;
				int i_1007_ = i + i_991_ * i_1000_;
				int i_1008_ = i_1000_ - i_992_;
				if (i_991_ + i_993_ > aClass180_Sub1_8876.anInt9393 * -383695469)
					i_993_ -= (i_991_ + i_993_ - aClass180_Sub1_8876.anInt9393 * -383695469);
				if (i_991_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
					int i_1009_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_991_;
					i_993_ -= i_1009_;
					i_1007_ += i_1009_ * i_1000_;
					i_999_ += i_1004_ * i_1009_;
				}
				if (i + i_992_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
					int i_1010_ = (i + i_992_ - aClass180_Sub1_8876.anInt9391 * 2014358275);
					i_992_ -= i_1010_;
					i_1008_ += i_1010_;
				}
				if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
					int i_1011_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
					i_992_ -= i_1011_;
					i_1007_ += i_1011_;
					i_998_ += i_1003_ * i_1011_;
					i_1008_ += i_1011_;
				}
				if (i_996_ == 0) {
					if (i_994_ == 1) {
						int i_1012_ = i_998_;
						for (int i_1013_ = -i_993_; i_1013_ < 0; i_1013_++) {
							int i_1014_ = (i_999_ >> 16) * anInt8877;
							for (int i_1015_ = -i_992_; i_1015_ < 0; i_1015_++) {
								is[i_1007_++] = (anIntArray11380[(i_998_ >> 16) + i_1014_]);
								i_998_ += i_1003_;
							}
							i_999_ += i_1004_;
							i_998_ = i_1012_;
							i_1007_ += i_1008_;
						}
					} else if (i_994_ == 0) {
						int i_1016_ = (i_995_ & 0xff0000) >> 16;
						int i_1017_ = (i_995_ & 0xff00) >> 8;
						int i_1018_ = i_995_ & 0xff;
						int i_1019_ = i_998_;
						for (int i_1020_ = -i_993_; i_1020_ < 0; i_1020_++) {
							int i_1021_ = (i_999_ >> 16) * anInt8877;
							for (int i_1022_ = -i_992_; i_1022_ < 0; i_1022_++) {
								int i_1023_ = (anIntArray11380[(i_998_ >> 16) + i_1021_]);
								int i_1024_ = ((i_1023_ & 0xff0000) * i_1016_ & ~0xffffff);
								int i_1025_ = (i_1023_ & 0xff00) * i_1017_ & 0xff0000;
								int i_1026_ = (i_1023_ & 0xff) * i_1018_ & 0xff00;
								is[i_1007_++] = (i_1024_ | i_1025_ | i_1026_) >>> 8;
								i_998_ += i_1003_;
							}
							i_999_ += i_1004_;
							i_998_ = i_1019_;
							i_1007_ += i_1008_;
						}
					} else if (i_994_ == 3) {
						int i_1027_ = i_998_;
						for (int i_1028_ = -i_993_; i_1028_ < 0; i_1028_++) {
							int i_1029_ = (i_999_ >> 16) * anInt8877;
							for (int i_1030_ = -i_992_; i_1030_ < 0; i_1030_++) {
								int i_1031_ = (anIntArray11380[(i_998_ >> 16) + i_1029_]);
								int i_1032_ = i_1031_ + i_995_;
								int i_1033_ = ((i_1031_ & 0xff00ff) + (i_995_ & 0xff00ff));
								int i_1034_ = ((i_1033_ & 0x1000100) + (i_1032_ - i_1033_ & 0x10000));
								is[i_1007_++] = i_1032_ - i_1034_ | i_1034_ - (i_1034_ >>> 8);
								i_998_ += i_1003_;
							}
							i_999_ += i_1004_;
							i_998_ = i_1027_;
							i_1007_ += i_1008_;
						}
					} else if (i_994_ == 2) {
						int i_1035_ = i_995_ >>> 24;
						int i_1036_ = 256 - i_1035_;
						int i_1037_ = (i_995_ & 0xff00ff) * i_1036_ & ~0xff00ff;
						int i_1038_ = (i_995_ & 0xff00) * i_1036_ & 0xff0000;
						i_995_ = (i_1037_ | i_1038_) >>> 8;
						int i_1039_ = i_998_;
						for (int i_1040_ = -i_993_; i_1040_ < 0; i_1040_++) {
							int i_1041_ = (i_999_ >> 16) * anInt8877;
							for (int i_1042_ = -i_992_; i_1042_ < 0; i_1042_++) {
								int i_1043_ = (anIntArray11380[(i_998_ >> 16) + i_1041_]);
								i_1037_ = ((i_1043_ & 0xff00ff) * i_1035_ & ~0xff00ff);
								i_1038_ = (i_1043_ & 0xff00) * i_1035_ & 0xff0000;
								is[i_1007_++] = ((i_1037_ | i_1038_) >>> 8) + i_995_;
								i_998_ += i_1003_;
							}
							i_999_ += i_1004_;
							i_998_ = i_1039_;
							i_1007_ += i_1008_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_996_ == 1) {
					if (i_994_ == 1) {
						int i_1044_ = i_998_;
						for (int i_1045_ = -i_993_; i_1045_ < 0; i_1045_++) {
							int i_1046_ = (i_999_ >> 16) * anInt8877;
							for (int i_1047_ = -i_992_; i_1047_ < 0; i_1047_++) {
								int i_1048_ = (anIntArray11380[(i_998_ >> 16) + i_1046_]);
								int i_1049_ = i_1048_ >>> 24;
								int i_1050_ = 256 - i_1049_;
								int i_1051_ = is[i_1007_];
								is[i_1007_++] = (((((i_1048_ & 0xff00ff) * i_1049_ + (i_1051_ & 0xff00ff) * i_1050_) & ~0xff00ff) >> 8) + (((((i_1048_ & ~0xff00ff) >>> 8) * i_1049_) + (((i_1051_ & ~0xff00ff) >>> 8) * i_1050_)) & ~0xff00ff));
								i_998_ += i_1003_;
							}
							i_999_ += i_1004_;
							i_998_ = i_1044_;
							i_1007_ += i_1008_;
						}
					} else if (i_994_ == 0) {
						int i_1052_ = i_998_;
						if ((i_995_ & 0xffffff) == 16777215) {
							for (int i_1053_ = -i_993_; i_1053_ < 0; i_1053_++) {
								int i_1054_ = (i_999_ >> 16) * anInt8877;
								for (int i_1055_ = -i_992_; i_1055_ < 0; i_1055_++) {
									int i_1056_ = (anIntArray11380[(i_998_ >> 16) + i_1054_]);
									int i_1057_ = ((i_1056_ >>> 24) * (i_995_ >>> 24) >> 8);
									int i_1058_ = 256 - i_1057_;
									int i_1059_ = is[i_1007_];
									is[i_1007_++] = ((((i_1056_ & 0xff00ff) * i_1057_ + (i_1059_ & 0xff00ff) * i_1058_) & ~0xff00ff) + (((i_1056_ & 0xff00) * i_1057_ + (i_1059_ & 0xff00) * i_1058_) & 0xff0000)) >> 8;
									i_998_ += i_1003_;
								}
								i_999_ += i_1004_;
								i_998_ = i_1052_;
								i_1007_ += i_1008_;
							}
						} else {
							int i_1060_ = (i_995_ & 0xff0000) >> 16;
							int i_1061_ = (i_995_ & 0xff00) >> 8;
							int i_1062_ = i_995_ & 0xff;
							for (int i_1063_ = -i_993_; i_1063_ < 0; i_1063_++) {
								int i_1064_ = (i_999_ >> 16) * anInt8877;
								for (int i_1065_ = -i_992_; i_1065_ < 0; i_1065_++) {
									int i_1066_ = (anIntArray11380[(i_998_ >> 16) + i_1064_]);
									int i_1067_ = ((i_1066_ >>> 24) * (i_995_ >>> 24) >> 8);
									int i_1068_ = 256 - i_1067_;
									if (i_1067_ != 255) {
										int i_1069_ = ((i_1066_ & 0xff0000) * i_1060_ & ~0xffffff);
										int i_1070_ = ((i_1066_ & 0xff00) * i_1061_ & 0xff0000);
										int i_1071_ = ((i_1066_ & 0xff) * i_1062_ & 0xff00);
										i_1066_ = (i_1069_ | i_1070_ | i_1071_) >>> 8;
										int i_1072_ = is[i_1007_];
										is[i_1007_++] = ((((i_1066_ & 0xff00ff) * i_1067_ + ((i_1072_ & 0xff00ff) * i_1068_)) & ~0xff00ff) + (((i_1066_ & 0xff00) * i_1067_ + ((i_1072_ & 0xff00) * i_1068_)) & 0xff0000)) >> 8;
									} else {
										int i_1073_ = ((i_1066_ & 0xff0000) * i_1060_ & ~0xffffff);
										int i_1074_ = ((i_1066_ & 0xff00) * i_1061_ & 0xff0000);
										int i_1075_ = ((i_1066_ & 0xff) * i_1062_ & 0xff00);
										is[i_1007_++] = (i_1073_ | i_1074_ | i_1075_) >>> 8;
									}
									i_998_ += i_1003_;
								}
								i_999_ += i_1004_;
								i_998_ = i_1052_;
								i_1007_ += i_1008_;
							}
						}
					} else if (i_994_ == 3) {
						int i_1076_ = i_998_;
						for (int i_1077_ = -i_993_; i_1077_ < 0; i_1077_++) {
							int i_1078_ = (i_999_ >> 16) * anInt8877;
							for (int i_1079_ = -i_992_; i_1079_ < 0; i_1079_++) {
								int i_1080_ = (anIntArray11380[(i_998_ >> 16) + i_1078_]);
								int i_1081_ = i_1080_ + i_995_;
								int i_1082_ = ((i_1080_ & 0xff00ff) + (i_995_ & 0xff00ff));
								int i_1083_ = ((i_1082_ & 0x1000100) + (i_1081_ - i_1082_ & 0x10000));
								i_1083_ = i_1081_ - i_1083_ | i_1083_ - (i_1083_ >>> 8);
								int i_1084_ = (i_1083_ >>> 24) * (i_995_ >>> 24) >> 8;
								int i_1085_ = 256 - i_1084_;
								if (i_1084_ != 255) {
									i_1080_ = i_1083_;
									i_1083_ = is[i_1007_];
									i_1083_ = ((((i_1080_ & 0xff00ff) * i_1084_ + (i_1083_ & 0xff00ff) * i_1085_) & ~0xff00ff) + (((i_1080_ & 0xff00) * i_1084_ + (i_1083_ & 0xff00) * i_1085_) & 0xff0000)) >> 8;
								}
								is[i_1007_++] = i_1083_;
								i_998_ += i_1003_;
							}
							i_999_ += i_1004_;
							i_998_ = i_1076_;
							i_1007_ += i_1008_;
						}
					} else if (i_994_ == 2) {
						int i_1086_ = i_995_ >>> 24;
						int i_1087_ = 256 - i_1086_;
						int i_1088_ = (i_995_ & 0xff00ff) * i_1087_ & ~0xff00ff;
						int i_1089_ = (i_995_ & 0xff00) * i_1087_ & 0xff0000;
						i_995_ = (i_1088_ | i_1089_) >>> 8;
						int i_1090_ = i_998_;
						for (int i_1091_ = -i_993_; i_1091_ < 0; i_1091_++) {
							int i_1092_ = (i_999_ >> 16) * anInt8877;
							for (int i_1093_ = -i_992_; i_1093_ < 0; i_1093_++) {
								int i_1094_ = (anIntArray11380[(i_998_ >> 16) + i_1092_]);
								int i_1095_ = i_1094_ >>> 24;
								int i_1096_ = 256 - i_1095_;
								i_1088_ = ((i_1094_ & 0xff00ff) * i_1086_ & ~0xff00ff);
								i_1089_ = (i_1094_ & 0xff00) * i_1086_ & 0xff0000;
								i_1094_ = ((i_1088_ | i_1089_) >>> 8) + i_995_;
								int i_1097_ = is[i_1007_];
								is[i_1007_++] = ((((i_1094_ & 0xff00ff) * i_1095_ + (i_1097_ & 0xff00ff) * i_1096_) & ~0xff00ff) + (((i_1094_ & 0xff00) * i_1095_ + (i_1097_ & 0xff00) * i_1096_) & 0xff0000)) >> 8;
								i_998_ += i_1003_;
							}
							i_999_ += i_1004_;
							i_998_ = i_1090_;
							i_1007_ += i_1008_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_996_ == 2) {
					if (i_994_ == 1) {
						int i_1098_ = i_998_;
						for (int i_1099_ = -i_993_; i_1099_ < 0; i_1099_++) {
							int i_1100_ = (i_999_ >> 16) * anInt8877;
							for (int i_1101_ = -i_992_; i_1101_ < 0; i_1101_++) {
								int i_1102_ = (anIntArray11380[(i_998_ >> 16) + i_1100_]);
								if (i_1102_ != 0) {
									int i_1103_ = is[i_1007_];
									int i_1104_ = i_1102_ + i_1103_;
									int i_1105_ = ((i_1102_ & 0xff00ff) + (i_1103_ & 0xff00ff));
									i_1103_ = ((i_1105_ & 0x1000100) + (i_1104_ - i_1105_ & 0x10000));
									is[i_1007_++] = (i_1104_ - i_1103_ | i_1103_ - (i_1103_ >>> 8));
								} else
									i_1007_++;
								i_998_ += i_1003_;
							}
							i_999_ += i_1004_;
							i_998_ = i_1098_;
							i_1007_ += i_1008_;
						}
					} else if (i_994_ == 0) {
						int i_1106_ = i_998_;
						int i_1107_ = (i_995_ & 0xff0000) >> 16;
						int i_1108_ = (i_995_ & 0xff00) >> 8;
						int i_1109_ = i_995_ & 0xff;
						for (int i_1110_ = -i_993_; i_1110_ < 0; i_1110_++) {
							int i_1111_ = (i_999_ >> 16) * anInt8877;
							for (int i_1112_ = -i_992_; i_1112_ < 0; i_1112_++) {
								int i_1113_ = (anIntArray11380[(i_998_ >> 16) + i_1111_]);
								if (i_1113_ != 0) {
									int i_1114_ = ((i_1113_ & 0xff0000) * i_1107_ & ~0xffffff);
									int i_1115_ = ((i_1113_ & 0xff00) * i_1108_ & 0xff0000);
									int i_1116_ = (i_1113_ & 0xff) * i_1109_ & 0xff00;
									i_1113_ = (i_1114_ | i_1115_ | i_1116_) >>> 8;
									int i_1117_ = is[i_1007_];
									int i_1118_ = i_1113_ + i_1117_;
									int i_1119_ = ((i_1113_ & 0xff00ff) + (i_1117_ & 0xff00ff));
									i_1117_ = ((i_1119_ & 0x1000100) + (i_1118_ - i_1119_ & 0x10000));
									is[i_1007_++] = (i_1118_ - i_1117_ | i_1117_ - (i_1117_ >>> 8));
								} else
									i_1007_++;
								i_998_ += i_1003_;
							}
							i_999_ += i_1004_;
							i_998_ = i_1106_;
							i_1007_ += i_1008_;
						}
					} else if (i_994_ == 3) {
						int i_1120_ = i_998_;
						for (int i_1121_ = -i_993_; i_1121_ < 0; i_1121_++) {
							int i_1122_ = (i_999_ >> 16) * anInt8877;
							for (int i_1123_ = -i_992_; i_1123_ < 0; i_1123_++) {
								int i_1124_ = (anIntArray11380[(i_998_ >> 16) + i_1122_]);
								int i_1125_ = i_1124_ + i_995_;
								int i_1126_ = ((i_1124_ & 0xff00ff) + (i_995_ & 0xff00ff));
								int i_1127_ = ((i_1126_ & 0x1000100) + (i_1125_ - i_1126_ & 0x10000));
								i_1124_ = i_1125_ - i_1127_ | i_1127_ - (i_1127_ >>> 8);
								i_1127_ = is[i_1007_];
								i_1125_ = i_1124_ + i_1127_;
								i_1126_ = (i_1124_ & 0xff00ff) + (i_1127_ & 0xff00ff);
								i_1127_ = ((i_1126_ & 0x1000100) + (i_1125_ - i_1126_ & 0x10000));
								is[i_1007_++] = i_1125_ - i_1127_ | i_1127_ - (i_1127_ >>> 8);
								i_998_ += i_1003_;
							}
							i_999_ += i_1004_;
							i_998_ = i_1120_;
							i_1007_ += i_1008_;
						}
					} else if (i_994_ == 2) {
						int i_1128_ = i_995_ >>> 24;
						int i_1129_ = 256 - i_1128_;
						int i_1130_ = (i_995_ & 0xff00ff) * i_1129_ & ~0xff00ff;
						int i_1131_ = (i_995_ & 0xff00) * i_1129_ & 0xff0000;
						i_995_ = (i_1130_ | i_1131_) >>> 8;
						int i_1132_ = i_998_;
						for (int i_1133_ = -i_993_; i_1133_ < 0; i_1133_++) {
							int i_1134_ = (i_999_ >> 16) * anInt8877;
							for (int i_1135_ = -i_992_; i_1135_ < 0; i_1135_++) {
								int i_1136_ = (anIntArray11380[(i_998_ >> 16) + i_1134_]);
								if (i_1136_ != 0) {
									i_1130_ = ((i_1136_ & 0xff00ff) * i_1128_ & ~0xff00ff);
									i_1131_ = ((i_1136_ & 0xff00) * i_1128_ & 0xff0000);
									i_1136_ = ((i_1130_ | i_1131_) >>> 8) + i_995_;
									int i_1137_ = is[i_1007_];
									int i_1138_ = i_1136_ + i_1137_;
									int i_1139_ = ((i_1136_ & 0xff00ff) + (i_1137_ & 0xff00ff));
									i_1137_ = ((i_1139_ & 0x1000100) + (i_1138_ - i_1139_ & 0x10000));
									is[i_1007_++] = (i_1138_ - i_1137_ | i_1137_ - (i_1137_ >>> 8));
								} else
									i_1007_++;
								i_998_ += i_1003_;
							}
							i_999_ += i_1004_;
							i_998_ = i_1132_;
							i_1007_ += i_1008_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method14427(boolean bool, boolean bool_1140_, boolean bool_1141_, int i, int i_1142_, float f, int i_1143_, int i_1144_, int i_1145_, int i_1146_, int i_1147_, int i_1148_, boolean bool_1149_) {
		if (i_1143_ > 0 && i_1144_ > 0 && (bool || bool_1140_)) {
			int i_1150_ = 0;
			int i_1151_ = 0;
			int i_1152_ = anInt8879 + anInt8877 + anInt8878;
			int i_1153_ = anInt8895 + anInt8880 + anInt8882;
			int i_1154_ = (i_1152_ << 16) / i_1143_;
			int i_1155_ = (i_1153_ << 16) / i_1144_;
			if (anInt8879 > 0) {
				int i_1156_ = ((anInt8879 << 16) + i_1154_ - 1) / i_1154_;
				i += i_1156_;
				i_1150_ += i_1156_ * i_1154_ - (anInt8879 << 16);
			}
			if (anInt8895 > 0) {
				int i_1157_ = ((anInt8895 << 16) + i_1155_ - 1) / i_1155_;
				i_1142_ += i_1157_;
				i_1151_ += i_1157_ * i_1155_ - (anInt8895 << 16);
			}
			if (anInt8877 < i_1152_)
				i_1143_ = ((anInt8877 << 16) - i_1150_ + i_1154_ - 1) / i_1154_;
			if (anInt8880 < i_1153_)
				i_1144_ = ((anInt8880 << 16) - i_1151_ + i_1155_ - 1) / i_1155_;
			int i_1158_ = i + i_1142_ * (aClass180_Sub1_8876.anInt9387 * -1173855569);
			int i_1159_ = aClass180_Sub1_8876.anInt9387 * -1173855569 - i_1143_;
			if (i_1142_ + i_1144_ > aClass180_Sub1_8876.anInt9393 * -383695469)
				i_1144_ -= (i_1142_ + i_1144_ - aClass180_Sub1_8876.anInt9393 * -383695469);
			if (i_1142_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
				int i_1160_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_1142_;
				i_1144_ -= i_1160_;
				i_1158_ += i_1160_ * (aClass180_Sub1_8876.anInt9387 * -1173855569);
				i_1151_ += i_1155_ * i_1160_;
			}
			if (i + i_1143_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
				int i_1161_ = i + i_1143_ - aClass180_Sub1_8876.anInt9391 * 2014358275;
				i_1143_ -= i_1161_;
				i_1159_ += i_1161_;
			}
			if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
				int i_1162_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
				i_1143_ -= i_1162_;
				i_1158_ += i_1162_;
				i_1150_ += i_1154_ * i_1162_;
				i_1159_ += i_1162_;
			}
			float[] fs = aClass180_Sub1_8876.aFloatArray9389;
			int[] is = aClass180_Sub1_8876.anIntArray9386;
			if (i_1147_ == 0) {
				if (i_1145_ == 1) {
					int i_1163_ = i_1150_;
					for (int i_1164_ = -i_1144_; i_1164_ < 0; i_1164_++) {
						int i_1165_ = (i_1151_ >> 16) * anInt8877;
						for (int i_1166_ = -i_1143_; i_1166_ < 0; i_1166_++) {
							if (!bool_1140_ || f < fs[i_1158_]) {
								if (bool)
									is[i_1158_] = (anIntArray11380[(i_1150_ >> 16) + i_1165_]);
								if (bool_1140_ && bool_1149_)
									fs[i_1158_] = f;
							}
							i_1150_ += i_1154_;
							i_1158_++;
						}
						i_1151_ += i_1155_;
						i_1150_ = i_1163_;
						i_1158_ += i_1159_;
					}
				} else if (i_1145_ == 0) {
					int i_1167_ = (i_1146_ & 0xff0000) >> 16;
					int i_1168_ = (i_1146_ & 0xff00) >> 8;
					int i_1169_ = i_1146_ & 0xff;
					int i_1170_ = i_1150_;
					for (int i_1171_ = -i_1144_; i_1171_ < 0; i_1171_++) {
						int i_1172_ = (i_1151_ >> 16) * anInt8877;
						for (int i_1173_ = -i_1143_; i_1173_ < 0; i_1173_++) {
							if (!bool_1140_ || f < fs[i_1158_]) {
								if (bool) {
									int i_1174_ = (anIntArray11380[(i_1150_ >> 16) + i_1172_]);
									int i_1175_ = ((i_1174_ & 0xff0000) * i_1167_ & ~0xffffff);
									int i_1176_ = ((i_1174_ & 0xff00) * i_1168_ & 0xff0000);
									int i_1177_ = (i_1174_ & 0xff) * i_1169_ & 0xff00;
									is[i_1158_] = (i_1175_ | i_1176_ | i_1177_) >>> 8;
								}
								if (bool_1140_ && bool_1149_)
									fs[i_1158_] = f;
							}
							i_1150_ += i_1154_;
							i_1158_++;
						}
						i_1151_ += i_1155_;
						i_1150_ = i_1170_;
						i_1158_ += i_1159_;
					}
				} else if (i_1145_ == 3) {
					int i_1178_ = i_1150_;
					for (int i_1179_ = -i_1144_; i_1179_ < 0; i_1179_++) {
						int i_1180_ = (i_1151_ >> 16) * anInt8877;
						for (int i_1181_ = -i_1143_; i_1181_ < 0; i_1181_++) {
							if (!bool_1140_ || f < fs[i_1158_]) {
								if (bool) {
									int i_1182_ = (anIntArray11380[(i_1150_ >> 16) + i_1180_]);
									int i_1183_ = i_1182_ + i_1146_;
									int i_1184_ = ((i_1182_ & 0xff00ff) + (i_1146_ & 0xff00ff));
									int i_1185_ = ((i_1184_ & 0x1000100) + (i_1183_ - i_1184_ & 0x10000));
									is[i_1158_] = (i_1183_ - i_1185_ | i_1185_ - (i_1185_ >>> 8));
								}
								if (bool_1140_ && bool_1149_)
									fs[i_1158_] = f;
							}
							i_1150_ += i_1154_;
							i_1158_++;
						}
						i_1151_ += i_1155_;
						i_1150_ = i_1178_;
						i_1158_ += i_1159_;
					}
				} else if (i_1145_ == 2) {
					int i_1186_ = i_1146_ >>> 24;
					int i_1187_ = 256 - i_1186_;
					int i_1188_ = (i_1146_ & 0xff00ff) * i_1187_ & ~0xff00ff;
					int i_1189_ = (i_1146_ & 0xff00) * i_1187_ & 0xff0000;
					i_1146_ = (i_1188_ | i_1189_) >>> 8;
					int i_1190_ = i_1150_;
					for (int i_1191_ = -i_1144_; i_1191_ < 0; i_1191_++) {
						int i_1192_ = (i_1151_ >> 16) * anInt8877;
						for (int i_1193_ = -i_1143_; i_1193_ < 0; i_1193_++) {
							if (!bool_1140_ || f < fs[i_1158_]) {
								if (bool) {
									int i_1194_ = (anIntArray11380[(i_1150_ >> 16) + i_1192_]);
									i_1188_ = ((i_1194_ & 0xff00ff) * i_1186_ & ~0xff00ff);
									i_1189_ = ((i_1194_ & 0xff00) * i_1186_ & 0xff0000);
									is[i_1158_] = (((i_1188_ | i_1189_) >>> 8) + i_1146_);
								}
								if (bool_1140_ && bool_1149_)
									fs[i_1158_] = f;
							}
							i_1150_ += i_1154_;
							i_1158_++;
						}
						i_1151_ += i_1155_;
						i_1150_ = i_1190_;
						i_1158_ += i_1159_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1147_ == 1) {
				if (i_1145_ == 1) {
					int i_1195_ = i_1150_;
					for (int i_1196_ = -i_1144_; i_1196_ < 0; i_1196_++) {
						int i_1197_ = (i_1151_ >> 16) * anInt8877;
						for (int i_1198_ = -i_1143_; i_1198_ < 0; i_1198_++) {
							if (!bool_1140_ || f < fs[i_1158_]) {
								if (bool) {
									int i_1199_ = (anIntArray11380[(i_1150_ >> 16) + i_1197_]);
									int i_1200_ = i_1199_ >>> 24;
									int i_1201_ = 256 - i_1200_;
									int i_1202_ = is[i_1158_];
									is[i_1158_] = (((((i_1199_ & 0xff00ff) * i_1200_ + (i_1202_ & 0xff00ff) * i_1201_) & ~0xff00ff) >> 8) + (((((i_1199_ & ~0xff00ff) >>> 8) * i_1200_) + (((i_1202_ & ~0xff00ff) >>> 8) * i_1201_)) & ~0xff00ff));
								}
								if (bool_1140_ && bool_1149_)
									fs[i_1158_] = f;
							}
							i_1150_ += i_1154_;
							i_1158_++;
						}
						i_1151_ += i_1155_;
						i_1150_ = i_1195_;
						i_1158_ += i_1159_;
					}
				} else if (i_1145_ == 0) {
					int i_1203_ = i_1150_;
					if ((i_1146_ & 0xffffff) == 16777215) {
						for (int i_1204_ = -i_1144_; i_1204_ < 0; i_1204_++) {
							int i_1205_ = (i_1151_ >> 16) * anInt8877;
							for (int i_1206_ = -i_1143_; i_1206_ < 0; i_1206_++) {
								if (!bool_1140_ || f < fs[i_1158_]) {
									if (bool) {
										int i_1207_ = (anIntArray11380[(i_1150_ >> 16) + i_1205_]);
										int i_1208_ = ((i_1207_ >>> 24) * (i_1146_ >>> 24) >> 8);
										int i_1209_ = 256 - i_1208_;
										int i_1210_ = is[i_1158_];
										is[i_1158_] = ((((i_1207_ & 0xff00ff) * i_1208_ + ((i_1210_ & 0xff00ff) * i_1209_)) & ~0xff00ff) + (((i_1207_ & 0xff00) * i_1208_ + ((i_1210_ & 0xff00) * i_1209_)) & 0xff0000)) >> 8;
									}
									if (bool_1140_ && bool_1149_)
										fs[i_1158_] = f;
								}
								i_1150_ += i_1154_;
								i_1158_++;
							}
							i_1151_ += i_1155_;
							i_1150_ = i_1203_;
							i_1158_ += i_1159_;
						}
					} else {
						int i_1211_ = (i_1146_ & 0xff0000) >> 16;
						int i_1212_ = (i_1146_ & 0xff00) >> 8;
						int i_1213_ = i_1146_ & 0xff;
						for (int i_1214_ = -i_1144_; i_1214_ < 0; i_1214_++) {
							int i_1215_ = (i_1151_ >> 16) * anInt8877;
							for (int i_1216_ = -i_1143_; i_1216_ < 0; i_1216_++) {
								if (!bool_1140_ || f < fs[i_1158_]) {
									int i_1217_ = (anIntArray11380[(i_1150_ >> 16) + i_1215_]);
									int i_1218_ = ((i_1217_ >>> 24) * (i_1146_ >>> 24) >> 8);
									int i_1219_ = 256 - i_1218_;
									if (i_1218_ != 255) {
										if (bool) {
											int i_1220_ = (((i_1217_ & 0xff0000) * i_1211_) & ~0xffffff);
											int i_1221_ = ((i_1217_ & 0xff00) * i_1212_ & 0xff0000);
											int i_1222_ = ((i_1217_ & 0xff) * i_1213_ & 0xff00);
											i_1217_ = (i_1220_ | i_1221_ | i_1222_) >>> 8;
											int i_1223_ = is[i_1158_];
											is[i_1158_] = (((((i_1217_ & 0xff00ff) * i_1218_) + ((i_1223_ & 0xff00ff) * i_1219_)) & ~0xff00ff) + ((((i_1217_ & 0xff00) * i_1218_) + ((i_1223_ & 0xff00) * i_1219_)) & 0xff0000)) >> 8;
											if (bool_1141_) {
												int i_1224_ = ((i_1223_ >>> 24) + i_1218_);
												if (i_1224_ > 255)
													i_1224_ = 255;
												is[i_1158_] |= i_1224_ << 24;
											}
										}
										if (bool_1140_ && bool_1149_)
											fs[i_1158_] = f;
									} else {
										if (bool) {
											int i_1225_ = (((i_1217_ & 0xff0000) * i_1211_) & ~0xffffff);
											int i_1226_ = ((i_1217_ & 0xff00) * i_1212_ & 0xff0000);
											int i_1227_ = ((i_1217_ & 0xff) * i_1213_ & 0xff00);
											is[i_1158_] = (i_1225_ | i_1226_ | i_1227_) >>> 8;
										}
										if (bool_1140_ && bool_1149_)
											fs[i_1158_] = f;
									}
								}
								i_1150_ += i_1154_;
								i_1158_++;
							}
							i_1151_ += i_1155_;
							i_1150_ = i_1203_;
							i_1158_ += i_1159_;
						}
					}
				} else if (i_1145_ == 3) {
					int i_1228_ = i_1150_;
					for (int i_1229_ = -i_1144_; i_1229_ < 0; i_1229_++) {
						int i_1230_ = (i_1151_ >> 16) * anInt8877;
						for (int i_1231_ = -i_1143_; i_1231_ < 0; i_1231_++) {
							if (!bool_1140_ || f < fs[i_1158_]) {
								if (bool) {
									int i_1232_ = (anIntArray11380[(i_1150_ >> 16) + i_1230_]);
									int i_1233_ = i_1232_ + i_1146_;
									int i_1234_ = ((i_1232_ & 0xff00ff) + (i_1146_ & 0xff00ff));
									int i_1235_ = ((i_1234_ & 0x1000100) + (i_1233_ - i_1234_ & 0x10000));
									i_1235_ = (i_1233_ - i_1235_ | i_1235_ - (i_1235_ >>> 8));
									int i_1236_ = ((i_1235_ >>> 24) * (i_1146_ >>> 24) >> 8);
									int i_1237_ = 256 - i_1236_;
									if (i_1236_ != 255) {
										i_1232_ = i_1235_;
										i_1235_ = is[i_1158_];
										i_1235_ = ((((i_1232_ & 0xff00ff) * i_1236_ + ((i_1235_ & 0xff00ff) * i_1237_)) & ~0xff00ff) + (((i_1232_ & 0xff00) * i_1236_ + ((i_1235_ & 0xff00) * i_1237_)) & 0xff0000)) >> 8;
									}
									is[i_1158_] = i_1235_;
								}
								if (bool_1140_ && bool_1149_)
									fs[i_1158_] = f;
							}
							i_1150_ += i_1154_;
							i_1158_++;
						}
						i_1151_ += i_1155_;
						i_1150_ = i_1228_;
						i_1158_ += i_1159_;
					}
				} else if (i_1145_ == 2) {
					int i_1238_ = i_1146_ >>> 24;
					int i_1239_ = 256 - i_1238_;
					int i_1240_ = (i_1146_ & 0xff00ff) * i_1239_ & ~0xff00ff;
					int i_1241_ = (i_1146_ & 0xff00) * i_1239_ & 0xff0000;
					i_1146_ = (i_1240_ | i_1241_) >>> 8;
					int i_1242_ = i_1150_;
					for (int i_1243_ = -i_1144_; i_1243_ < 0; i_1243_++) {
						int i_1244_ = (i_1151_ >> 16) * anInt8877;
						for (int i_1245_ = -i_1143_; i_1245_ < 0; i_1245_++) {
							if (!bool_1140_ || f < fs[i_1158_]) {
								if (bool) {
									int i_1246_ = (anIntArray11380[(i_1150_ >> 16) + i_1244_]);
									int i_1247_ = i_1246_ >>> 24;
									int i_1248_ = 256 - i_1247_;
									i_1240_ = ((i_1246_ & 0xff00ff) * i_1238_ & ~0xff00ff);
									i_1241_ = ((i_1246_ & 0xff00) * i_1238_ & 0xff0000);
									i_1246_ = (((i_1240_ | i_1241_) >>> 8) + i_1146_);
									int i_1249_ = is[i_1158_];
									is[i_1158_] = ((((i_1246_ & 0xff00ff) * i_1247_ + (i_1249_ & 0xff00ff) * i_1248_) & ~0xff00ff) + (((i_1246_ & 0xff00) * i_1247_ + (i_1249_ & 0xff00) * i_1248_) & 0xff0000)) >> 8;
								}
								if (bool_1140_ && bool_1149_)
									fs[i_1158_] = f;
							}
							i_1150_ += i_1154_;
							i_1158_++;
						}
						i_1151_ += i_1155_;
						i_1150_ = i_1242_;
						i_1158_ += i_1159_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1147_ == 2) {
				if (i_1145_ == 1) {
					int i_1250_ = i_1150_;
					for (int i_1251_ = -i_1144_; i_1251_ < 0; i_1251_++) {
						int i_1252_ = (i_1151_ >> 16) * anInt8877;
						for (int i_1253_ = -i_1143_; i_1253_ < 0; i_1253_++) {
							if (!bool_1140_ || f < fs[i_1158_]) {
								int i_1254_ = (anIntArray11380[(i_1150_ >> 16) + i_1252_]);
								if (i_1254_ != 0) {
									if (bool) {
										int i_1255_ = is[i_1158_];
										int i_1256_ = i_1254_ + i_1255_;
										int i_1257_ = ((i_1254_ & 0xff00ff) + (i_1255_ & 0xff00ff));
										i_1255_ = ((i_1257_ & 0x1000100) + (i_1256_ - i_1257_ & 0x10000));
										is[i_1158_] = (i_1256_ - i_1255_ | i_1255_ - (i_1255_ >>> 8));
									}
									if (bool_1140_ && bool_1149_)
										fs[i_1158_] = f;
								}
							}
							i_1150_ += i_1154_;
							i_1158_++;
						}
						i_1151_ += i_1155_;
						i_1150_ = i_1250_;
						i_1158_ += i_1159_;
					}
				} else if (i_1145_ == 0) {
					int i_1258_ = i_1150_;
					int i_1259_ = (i_1146_ & 0xff0000) >> 16;
					int i_1260_ = (i_1146_ & 0xff00) >> 8;
					int i_1261_ = i_1146_ & 0xff;
					for (int i_1262_ = -i_1144_; i_1262_ < 0; i_1262_++) {
						int i_1263_ = (i_1151_ >> 16) * anInt8877;
						for (int i_1264_ = -i_1143_; i_1264_ < 0; i_1264_++) {
							if (!bool_1140_ || f < fs[i_1158_]) {
								int i_1265_ = (anIntArray11380[(i_1150_ >> 16) + i_1263_]);
								if (i_1265_ != 0) {
									if (bool) {
										int i_1266_ = ((i_1265_ & 0xff0000) * i_1259_ & ~0xffffff);
										int i_1267_ = ((i_1265_ & 0xff00) * i_1260_ & 0xff0000);
										int i_1268_ = ((i_1265_ & 0xff) * i_1261_ & 0xff00);
										i_1265_ = (i_1266_ | i_1267_ | i_1268_) >>> 8;
										int i_1269_ = is[i_1158_];
										int i_1270_ = i_1265_ + i_1269_;
										int i_1271_ = ((i_1265_ & 0xff00ff) + (i_1269_ & 0xff00ff));
										i_1269_ = ((i_1271_ & 0x1000100) + (i_1270_ - i_1271_ & 0x10000));
										is[i_1158_] = (i_1270_ - i_1269_ | i_1269_ - (i_1269_ >>> 8));
									}
									if (bool_1140_ && bool_1149_)
										fs[i_1158_] = f;
								}
							}
							i_1150_ += i_1154_;
							i_1158_++;
						}
						i_1151_ += i_1155_;
						i_1150_ = i_1258_;
						i_1158_ += i_1159_;
					}
				} else if (i_1145_ == 3) {
					int i_1272_ = i_1150_;
					for (int i_1273_ = -i_1144_; i_1273_ < 0; i_1273_++) {
						int i_1274_ = (i_1151_ >> 16) * anInt8877;
						for (int i_1275_ = -i_1143_; i_1275_ < 0; i_1275_++) {
							if (!bool_1140_ || f < fs[i_1158_]) {
								if (bool) {
									int i_1276_ = (anIntArray11380[(i_1150_ >> 16) + i_1274_]);
									int i_1277_ = i_1276_ + i_1146_;
									int i_1278_ = ((i_1276_ & 0xff00ff) + (i_1146_ & 0xff00ff));
									int i_1279_ = ((i_1278_ & 0x1000100) + (i_1277_ - i_1278_ & 0x10000));
									i_1276_ = (i_1277_ - i_1279_ | i_1279_ - (i_1279_ >>> 8));
									i_1279_ = is[i_1158_];
									i_1277_ = i_1276_ + i_1279_;
									i_1278_ = (i_1276_ & 0xff00ff) + (i_1279_ & 0xff00ff);
									i_1279_ = ((i_1278_ & 0x1000100) + (i_1277_ - i_1278_ & 0x10000));
									is[i_1158_] = (i_1277_ - i_1279_ | i_1279_ - (i_1279_ >>> 8));
								}
								if (bool_1140_ && bool_1149_)
									fs[i_1158_] = f;
							}
							i_1150_ += i_1154_;
							i_1158_++;
						}
						i_1151_ += i_1155_;
						i_1150_ = i_1272_;
						i_1158_ += i_1159_;
					}
				} else if (i_1145_ == 2) {
					int i_1280_ = i_1146_ >>> 24;
					int i_1281_ = 256 - i_1280_;
					int i_1282_ = (i_1146_ & 0xff00ff) * i_1281_ & ~0xff00ff;
					int i_1283_ = (i_1146_ & 0xff00) * i_1281_ & 0xff0000;
					i_1146_ = (i_1282_ | i_1283_) >>> 8;
					int i_1284_ = i_1150_;
					for (int i_1285_ = -i_1144_; i_1285_ < 0; i_1285_++) {
						int i_1286_ = (i_1151_ >> 16) * anInt8877;
						for (int i_1287_ = -i_1143_; i_1287_ < 0; i_1287_++) {
							if (!bool_1140_ || f < fs[i_1158_]) {
								int i_1288_ = (anIntArray11380[(i_1150_ >> 16) + i_1286_]);
								if (i_1288_ != 0) {
									if (bool) {
										i_1282_ = ((i_1288_ & 0xff00ff) * i_1280_ & ~0xff00ff);
										i_1283_ = ((i_1288_ & 0xff00) * i_1280_ & 0xff0000);
										i_1288_ = (((i_1282_ | i_1283_) >>> 8) + i_1146_);
										int i_1289_ = is[i_1158_];
										int i_1290_ = i_1288_ + i_1289_;
										int i_1291_ = ((i_1288_ & 0xff00ff) + (i_1289_ & 0xff00ff));
										i_1289_ = ((i_1291_ & 0x1000100) + (i_1290_ - i_1291_ & 0x10000));
										is[i_1158_] = (i_1290_ - i_1289_ | i_1289_ - (i_1289_ >>> 8));
									}
									if (bool_1140_ && bool_1149_)
										fs[i_1158_] = f;
								}
							}
							i_1150_ += i_1154_;
							i_1158_++;
						}
						i_1151_ += i_1155_;
						i_1150_ = i_1284_;
						i_1158_ += i_1159_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method14428(int i, int i_1292_) {
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is != null) {
			if (anInt8893 == 0) {
				if (anInt8909 == 0) {
					int i_1293_ = anInt8903;
					while (i_1293_ < 0) {
						int i_1294_ = anInt8892;
						int i_1295_ = anInt8899;
						int i_1296_ = anInt8900;
						int i_1297_ = anInt8888;
						if (i_1295_ >= 0 && i_1296_ >= 0 && i_1295_ - (anInt8877 << 12) < 0 && i_1296_ - (anInt8880 << 12) < 0) {
							for (/**/; i_1297_ < 0; i_1297_++)
								method17961(((i_1296_ >> 12) * anInt8877 + (i_1295_ >> 12)), i_1294_++, is, i, i_1292_);
						}
						i_1293_++;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_1298_ = anInt8903;
					while (i_1298_ < 0) {
						int i_1299_ = anInt8892;
						int i_1300_ = anInt8899;
						int i_1301_ = anInt8900 + anInt8902;
						int i_1302_ = anInt8888;
						if (i_1300_ >= 0 && i_1300_ - (anInt8877 << 12) < 0) {
							int i_1303_;
							if ((i_1303_ = i_1301_ - (anInt8880 << 12)) >= 0) {
								i_1303_ = (anInt8909 - i_1303_) / anInt8909;
								i_1302_ += i_1303_;
								i_1301_ += anInt8909 * i_1303_;
								i_1299_ += i_1303_;
							}
							if ((i_1303_ = (i_1301_ - anInt8909) / anInt8909) > i_1302_)
								i_1302_ = i_1303_;
							for (/**/; i_1302_ < 0; i_1302_++) {
								method17961(((i_1301_ >> 12) * anInt8877 + (i_1300_ >> 12)), i_1299_++, is, i, i_1292_);
								i_1301_ += anInt8909;
							}
						}
						i_1298_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				} else {
					int i_1304_ = anInt8903;
					while (i_1304_ < 0) {
						int i_1305_ = anInt8892;
						int i_1306_ = anInt8899;
						int i_1307_ = anInt8900 + anInt8902;
						int i_1308_ = anInt8888;
						if (i_1306_ >= 0 && i_1306_ - (anInt8877 << 12) < 0) {
							if (i_1307_ < 0) {
								int i_1309_ = (anInt8909 - 1 - i_1307_) / anInt8909;
								i_1308_ += i_1309_;
								i_1307_ += anInt8909 * i_1309_;
								i_1305_ += i_1309_;
							}
							int i_1310_;
							if ((i_1310_ = (1 + i_1307_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_1308_)
								i_1308_ = i_1310_;
							for (/**/; i_1308_ < 0; i_1308_++) {
								method17961(((i_1307_ >> 12) * anInt8877 + (i_1306_ >> 12)), i_1305_++, is, i, i_1292_);
								i_1307_ += anInt8909;
							}
						}
						i_1304_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8893 < 0) {
				if (anInt8909 == 0) {
					int i_1311_ = anInt8903;
					while (i_1311_ < 0) {
						int i_1312_ = anInt8892;
						int i_1313_ = anInt8899 + anInt8890;
						int i_1314_ = anInt8900;
						int i_1315_ = anInt8888;
						if (i_1314_ >= 0 && i_1314_ - (anInt8880 << 12) < 0) {
							int i_1316_;
							if ((i_1316_ = i_1313_ - (anInt8877 << 12)) >= 0) {
								i_1316_ = (anInt8893 - i_1316_) / anInt8893;
								i_1315_ += i_1316_;
								i_1313_ += anInt8893 * i_1316_;
								i_1312_ += i_1316_;
							}
							if ((i_1316_ = (i_1313_ - anInt8893) / anInt8893) > i_1315_)
								i_1315_ = i_1316_;
							for (/**/; i_1315_ < 0; i_1315_++) {
								method17961(((i_1314_ >> 12) * anInt8877 + (i_1313_ >> 12)), i_1312_++, is, i, i_1292_);
								i_1313_ += anInt8893;
							}
						}
						i_1311_++;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_1317_ = anInt8903;
					while (i_1317_ < 0) {
						int i_1318_ = anInt8892;
						int i_1319_ = anInt8899 + anInt8890;
						int i_1320_ = anInt8900 + anInt8902;
						int i_1321_ = anInt8888;
						int i_1322_;
						if ((i_1322_ = i_1319_ - (anInt8877 << 12)) >= 0) {
							i_1322_ = (anInt8893 - i_1322_) / anInt8893;
							i_1321_ += i_1322_;
							i_1319_ += anInt8893 * i_1322_;
							i_1320_ += anInt8909 * i_1322_;
							i_1318_ += i_1322_;
						}
						if ((i_1322_ = (i_1319_ - anInt8893) / anInt8893) > i_1321_)
							i_1321_ = i_1322_;
						if ((i_1322_ = i_1320_ - (anInt8880 << 12)) >= 0) {
							i_1322_ = (anInt8909 - i_1322_) / anInt8909;
							i_1321_ += i_1322_;
							i_1319_ += anInt8893 * i_1322_;
							i_1320_ += anInt8909 * i_1322_;
							i_1318_ += i_1322_;
						}
						if ((i_1322_ = (i_1320_ - anInt8909) / anInt8909) > i_1321_)
							i_1321_ = i_1322_;
						for (/**/; i_1321_ < 0; i_1321_++) {
							method17961((i_1320_ >> 12) * anInt8877 + (i_1319_ >> 12), i_1318_++, is, i, i_1292_);
							i_1319_ += anInt8893;
							i_1320_ += anInt8909;
						}
						i_1317_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else {
					int i_1323_ = anInt8903;
					while (i_1323_ < 0) {
						int i_1324_ = anInt8892;
						int i_1325_ = anInt8899 + anInt8890;
						int i_1326_ = anInt8900 + anInt8902;
						int i_1327_ = anInt8888;
						int i_1328_;
						if ((i_1328_ = i_1325_ - (anInt8877 << 12)) >= 0) {
							i_1328_ = (anInt8893 - i_1328_) / anInt8893;
							i_1327_ += i_1328_;
							i_1325_ += anInt8893 * i_1328_;
							i_1326_ += anInt8909 * i_1328_;
							i_1324_ += i_1328_;
						}
						if ((i_1328_ = (i_1325_ - anInt8893) / anInt8893) > i_1327_)
							i_1327_ = i_1328_;
						if (i_1326_ < 0) {
							i_1328_ = (anInt8909 - 1 - i_1326_) / anInt8909;
							i_1327_ += i_1328_;
							i_1325_ += anInt8893 * i_1328_;
							i_1326_ += anInt8909 * i_1328_;
							i_1324_ += i_1328_;
						}
						if ((i_1328_ = (1 + i_1326_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_1327_)
							i_1327_ = i_1328_;
						for (/**/; i_1327_ < 0; i_1327_++) {
							method17961((i_1326_ >> 12) * anInt8877 + (i_1325_ >> 12), i_1324_++, is, i, i_1292_);
							i_1325_ += anInt8893;
							i_1326_ += anInt8909;
						}
						i_1323_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8909 == 0) {
				int i_1329_ = anInt8903;
				while (i_1329_ < 0) {
					int i_1330_ = anInt8892;
					int i_1331_ = anInt8899 + anInt8890;
					int i_1332_ = anInt8900;
					int i_1333_ = anInt8888;
					if (i_1332_ >= 0 && i_1332_ - (anInt8880 << 12) < 0) {
						if (i_1331_ < 0) {
							int i_1334_ = (anInt8893 - 1 - i_1331_) / anInt8893;
							i_1333_ += i_1334_;
							i_1331_ += anInt8893 * i_1334_;
							i_1330_ += i_1334_;
						}
						int i_1335_;
						if ((i_1335_ = (1 + i_1331_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_1333_)
							i_1333_ = i_1335_;
						for (/**/; i_1333_ < 0; i_1333_++) {
							method17961((i_1332_ >> 12) * anInt8877 + (i_1331_ >> 12), i_1330_++, is, i, i_1292_);
							i_1331_ += anInt8893;
						}
					}
					i_1329_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else if (anInt8909 < 0) {
				for (int i_1336_ = anInt8903; i_1336_ < 0; i_1336_++) {
					int i_1337_ = anInt8892;
					int i_1338_ = anInt8899 + anInt8890;
					int i_1339_ = anInt8900 + anInt8902;
					int i_1340_ = anInt8888;
					if (i_1338_ < 0) {
						int i_1341_ = (anInt8893 - 1 - i_1338_) / anInt8893;
						i_1340_ += i_1341_;
						i_1338_ += anInt8893 * i_1341_;
						i_1339_ += anInt8909 * i_1341_;
						i_1337_ += i_1341_;
					}
					int i_1342_;
					if ((i_1342_ = (1 + i_1338_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_1340_)
						i_1340_ = i_1342_;
					if ((i_1342_ = i_1339_ - (anInt8880 << 12)) >= 0) {
						i_1342_ = (anInt8909 - i_1342_) / anInt8909;
						i_1340_ += i_1342_;
						i_1338_ += anInt8893 * i_1342_;
						i_1339_ += anInt8909 * i_1342_;
						i_1337_ += i_1342_;
					}
					if ((i_1342_ = (i_1339_ - anInt8909) / anInt8909) > i_1340_)
						i_1340_ = i_1342_;
					for (/**/; i_1340_ < 0; i_1340_++) {
						method17961((i_1339_ >> 12) * anInt8877 + (i_1338_ >> 12), i_1337_++, is, i, i_1292_);
						i_1338_ += anInt8893;
						i_1339_ += anInt8909;
					}
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else {
				for (int i_1343_ = anInt8903; i_1343_ < 0; i_1343_++) {
					int i_1344_ = anInt8892;
					int i_1345_ = anInt8899 + anInt8890;
					int i_1346_ = anInt8900 + anInt8902;
					int i_1347_ = anInt8888;
					if (i_1345_ < 0) {
						int i_1348_ = (anInt8893 - 1 - i_1345_) / anInt8893;
						i_1347_ += i_1348_;
						i_1345_ += anInt8893 * i_1348_;
						i_1346_ += anInt8909 * i_1348_;
						i_1344_ += i_1348_;
					}
					int i_1349_;
					if ((i_1349_ = (1 + i_1345_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_1347_)
						i_1347_ = i_1349_;
					if (i_1346_ < 0) {
						i_1349_ = (anInt8909 - 1 - i_1346_) / anInt8909;
						i_1347_ += i_1349_;
						i_1345_ += anInt8893 * i_1349_;
						i_1346_ += anInt8909 * i_1349_;
						i_1344_ += i_1349_;
					}
					if ((i_1349_ = (1 + i_1346_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_1347_)
						i_1347_ = i_1349_;
					for (/**/; i_1347_ < 0; i_1347_++) {
						method17961((i_1346_ >> 12) * anInt8877 + (i_1345_ >> 12), i_1344_++, is, i, i_1292_);
						i_1345_ += anInt8893;
						i_1346_ += anInt8909;
					}
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			}
		}
	}

	void method14429(int[] is, int[] is_1350_, int i, int i_1351_) {
		int[] is_1352_ = aClass180_Sub1_8876.anIntArray9386;
		if (is_1352_ != null) {
			if (anInt8893 == 0) {
				if (anInt8909 == 0) {
					int i_1353_ = anInt8903;
					while (i_1353_ < 0) {
						int i_1354_ = i_1353_ + i_1351_;
						if (i_1354_ >= 0) {
							if (i_1354_ >= is.length)
								break;
							int i_1355_ = anInt8892;
							int i_1356_ = anInt8899;
							int i_1357_ = anInt8900;
							int i_1358_ = anInt8888;
							if (i_1356_ >= 0 && i_1357_ >= 0 && i_1356_ - (anInt8877 << 12) < 0 && i_1357_ - (anInt8880 << 12) < 0) {
								int i_1359_ = is[i_1354_] - i;
								int i_1360_ = -is_1350_[i_1354_];
								int i_1361_ = i_1359_ - (i_1355_ - anInt8892);
								if (i_1361_ > 0) {
									i_1355_ += i_1361_;
									i_1358_ += i_1361_;
									i_1356_ += anInt8893 * i_1361_;
									i_1357_ += anInt8909 * i_1361_;
								} else
									i_1360_ -= i_1361_;
								if (i_1358_ < i_1360_)
									i_1358_ = i_1360_;
								for (/**/; i_1358_ < 0; i_1358_++) {
									int i_1362_ = (anIntArray11380[((i_1357_ >> 12) * anInt8877 + (i_1356_ >> 12))]);
									int i_1363_ = i_1362_ >>> 24;
									int i_1364_ = 256 - i_1363_;
									int i_1365_ = is_1352_[i_1355_];
									is_1352_[i_1355_++] = ((((i_1362_ & 0xff00ff) * i_1363_ + (i_1365_ & 0xff00ff) * i_1364_) & ~0xff00ff) + (((i_1362_ & 0xff00) * i_1363_ + (i_1365_ & 0xff00) * i_1364_) & 0xff0000)) >> 8;
								}
							}
						}
						i_1353_++;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_1366_ = anInt8903;
					while (i_1366_ < 0) {
						int i_1367_ = i_1366_ + i_1351_;
						if (i_1367_ >= 0) {
							if (i_1367_ >= is.length)
								break;
							int i_1368_ = anInt8892;
							int i_1369_ = anInt8899;
							int i_1370_ = anInt8900 + anInt8902;
							int i_1371_ = anInt8888;
							if (i_1369_ >= 0 && i_1369_ - (anInt8877 << 12) < 0) {
								int i_1372_;
								if ((i_1372_ = i_1370_ - (anInt8880 << 12)) >= 0) {
									i_1372_ = (anInt8909 - i_1372_) / anInt8909;
									i_1371_ += i_1372_;
									i_1370_ += anInt8909 * i_1372_;
									i_1368_ += i_1372_;
								}
								if ((i_1372_ = (i_1370_ - anInt8909) / anInt8909) > i_1371_)
									i_1371_ = i_1372_;
								int i_1373_ = is[i_1367_] - i;
								int i_1374_ = -is_1350_[i_1367_];
								int i_1375_ = i_1373_ - (i_1368_ - anInt8892);
								if (i_1375_ > 0) {
									i_1368_ += i_1375_;
									i_1371_ += i_1375_;
									i_1369_ += anInt8893 * i_1375_;
									i_1370_ += anInt8909 * i_1375_;
								} else
									i_1374_ -= i_1375_;
								if (i_1371_ < i_1374_)
									i_1371_ = i_1374_;
								for (/**/; i_1371_ < 0; i_1371_++) {
									int i_1376_ = (anIntArray11380[((i_1370_ >> 12) * anInt8877 + (i_1369_ >> 12))]);
									int i_1377_ = i_1376_ >>> 24;
									int i_1378_ = 256 - i_1377_;
									int i_1379_ = is_1352_[i_1368_];
									is_1352_[i_1368_++] = ((((i_1376_ & 0xff00ff) * i_1377_ + (i_1379_ & 0xff00ff) * i_1378_) & ~0xff00ff) + (((i_1376_ & 0xff00) * i_1377_ + (i_1379_ & 0xff00) * i_1378_) & 0xff0000)) >> 8;
									i_1370_ += anInt8909;
								}
							}
						}
						i_1366_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				} else {
					int i_1380_ = anInt8903;
					while (i_1380_ < 0) {
						int i_1381_ = i_1380_ + i_1351_;
						if (i_1381_ >= 0) {
							if (i_1381_ >= is.length)
								break;
							int i_1382_ = anInt8892;
							int i_1383_ = anInt8899;
							int i_1384_ = anInt8900 + anInt8902;
							int i_1385_ = anInt8888;
							if (i_1383_ >= 0 && i_1383_ - (anInt8877 << 12) < 0) {
								if (i_1384_ < 0) {
									int i_1386_ = ((anInt8909 - 1 - i_1384_) / anInt8909);
									i_1385_ += i_1386_;
									i_1384_ += anInt8909 * i_1386_;
									i_1382_ += i_1386_;
								}
								int i_1387_;
								if ((i_1387_ = (1 + i_1384_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_1385_)
									i_1385_ = i_1387_;
								int i_1388_ = is[i_1381_] - i;
								int i_1389_ = -is_1350_[i_1381_];
								int i_1390_ = i_1388_ - (i_1382_ - anInt8892);
								if (i_1390_ > 0) {
									i_1382_ += i_1390_;
									i_1385_ += i_1390_;
									i_1383_ += anInt8893 * i_1390_;
									i_1384_ += anInt8909 * i_1390_;
								} else
									i_1389_ -= i_1390_;
								if (i_1385_ < i_1389_)
									i_1385_ = i_1389_;
								for (/**/; i_1385_ < 0; i_1385_++) {
									int i_1391_ = (anIntArray11380[((i_1384_ >> 12) * anInt8877 + (i_1383_ >> 12))]);
									int i_1392_ = i_1391_ >>> 24;
									int i_1393_ = 256 - i_1392_;
									int i_1394_ = is_1352_[i_1382_];
									is_1352_[i_1382_++] = ((((i_1391_ & 0xff00ff) * i_1392_ + (i_1394_ & 0xff00ff) * i_1393_) & ~0xff00ff) + (((i_1391_ & 0xff00) * i_1392_ + (i_1394_ & 0xff00) * i_1393_) & 0xff0000)) >> 8;
									i_1384_ += anInt8909;
								}
							}
						}
						i_1380_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8893 < 0) {
				if (anInt8909 == 0) {
					int i_1395_ = anInt8903;
					while (i_1395_ < 0) {
						int i_1396_ = i_1395_ + i_1351_;
						if (i_1396_ >= 0) {
							if (i_1396_ >= is.length)
								break;
							int i_1397_ = anInt8892;
							int i_1398_ = anInt8899 + anInt8890;
							int i_1399_ = anInt8900;
							int i_1400_ = anInt8888;
							if (i_1399_ >= 0 && i_1399_ - (anInt8880 << 12) < 0) {
								int i_1401_;
								if ((i_1401_ = i_1398_ - (anInt8877 << 12)) >= 0) {
									i_1401_ = (anInt8893 - i_1401_) / anInt8893;
									i_1400_ += i_1401_;
									i_1398_ += anInt8893 * i_1401_;
									i_1397_ += i_1401_;
								}
								if ((i_1401_ = (i_1398_ - anInt8893) / anInt8893) > i_1400_)
									i_1400_ = i_1401_;
								int i_1402_ = is[i_1396_] - i;
								int i_1403_ = -is_1350_[i_1396_];
								int i_1404_ = i_1402_ - (i_1397_ - anInt8892);
								if (i_1404_ > 0) {
									i_1397_ += i_1404_;
									i_1400_ += i_1404_;
									i_1398_ += anInt8893 * i_1404_;
									i_1399_ += anInt8909 * i_1404_;
								} else
									i_1403_ -= i_1404_;
								if (i_1400_ < i_1403_)
									i_1400_ = i_1403_;
								for (/**/; i_1400_ < 0; i_1400_++) {
									int i_1405_ = (anIntArray11380[((i_1399_ >> 12) * anInt8877 + (i_1398_ >> 12))]);
									int i_1406_ = i_1405_ >>> 24;
									int i_1407_ = 256 - i_1406_;
									int i_1408_ = is_1352_[i_1397_];
									is_1352_[i_1397_++] = ((((i_1405_ & 0xff00ff) * i_1406_ + (i_1408_ & 0xff00ff) * i_1407_) & ~0xff00ff) + (((i_1405_ & 0xff00) * i_1406_ + (i_1408_ & 0xff00) * i_1407_) & 0xff0000)) >> 8;
									i_1398_ += anInt8893;
								}
							}
						}
						i_1395_++;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_1409_ = anInt8903;
					while (i_1409_ < 0) {
						int i_1410_ = i_1409_ + i_1351_;
						if (i_1410_ >= 0) {
							if (i_1410_ >= is.length)
								break;
							int i_1411_ = anInt8892;
							int i_1412_ = anInt8899 + anInt8890;
							int i_1413_ = anInt8900 + anInt8902;
							int i_1414_ = anInt8888;
							int i_1415_;
							if ((i_1415_ = i_1412_ - (anInt8877 << 12)) >= 0) {
								i_1415_ = (anInt8893 - i_1415_) / anInt8893;
								i_1414_ += i_1415_;
								i_1412_ += anInt8893 * i_1415_;
								i_1413_ += anInt8909 * i_1415_;
								i_1411_ += i_1415_;
							}
							if ((i_1415_ = (i_1412_ - anInt8893) / anInt8893) > i_1414_)
								i_1414_ = i_1415_;
							if ((i_1415_ = i_1413_ - (anInt8880 << 12)) >= 0) {
								i_1415_ = (anInt8909 - i_1415_) / anInt8909;
								i_1414_ += i_1415_;
								i_1412_ += anInt8893 * i_1415_;
								i_1413_ += anInt8909 * i_1415_;
								i_1411_ += i_1415_;
							}
							if ((i_1415_ = (i_1413_ - anInt8909) / anInt8909) > i_1414_)
								i_1414_ = i_1415_;
							int i_1416_ = is[i_1410_] - i;
							int i_1417_ = -is_1350_[i_1410_];
							int i_1418_ = i_1416_ - (i_1411_ - anInt8892);
							if (i_1418_ > 0) {
								i_1411_ += i_1418_;
								i_1414_ += i_1418_;
								i_1412_ += anInt8893 * i_1418_;
								i_1413_ += anInt8909 * i_1418_;
							} else
								i_1417_ -= i_1418_;
							if (i_1414_ < i_1417_)
								i_1414_ = i_1417_;
							for (/**/; i_1414_ < 0; i_1414_++) {
								int i_1419_ = (anIntArray11380[((i_1413_ >> 12) * anInt8877 + (i_1412_ >> 12))]);
								int i_1420_ = i_1419_ >>> 24;
								int i_1421_ = 256 - i_1420_;
								int i_1422_ = is_1352_[i_1411_];
								is_1352_[i_1411_++] = ((((i_1419_ & 0xff00ff) * i_1420_ + (i_1422_ & 0xff00ff) * i_1421_) & ~0xff00ff) + (((i_1419_ & 0xff00) * i_1420_ + (i_1422_ & 0xff00) * i_1421_) & 0xff0000)) >> 8;
								i_1412_ += anInt8893;
								i_1413_ += anInt8909;
							}
						}
						i_1409_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else {
					int i_1423_ = anInt8903;
					while (i_1423_ < 0) {
						int i_1424_ = i_1423_ + i_1351_;
						if (i_1424_ >= 0) {
							if (i_1424_ >= is.length)
								break;
							int i_1425_ = anInt8892;
							int i_1426_ = anInt8899 + anInt8890;
							int i_1427_ = anInt8900 + anInt8902;
							int i_1428_ = anInt8888;
							int i_1429_;
							if ((i_1429_ = i_1426_ - (anInt8877 << 12)) >= 0) {
								i_1429_ = (anInt8893 - i_1429_) / anInt8893;
								i_1428_ += i_1429_;
								i_1426_ += anInt8893 * i_1429_;
								i_1427_ += anInt8909 * i_1429_;
								i_1425_ += i_1429_;
							}
							if ((i_1429_ = (i_1426_ - anInt8893) / anInt8893) > i_1428_)
								i_1428_ = i_1429_;
							if (i_1427_ < 0) {
								i_1429_ = (anInt8909 - 1 - i_1427_) / anInt8909;
								i_1428_ += i_1429_;
								i_1426_ += anInt8893 * i_1429_;
								i_1427_ += anInt8909 * i_1429_;
								i_1425_ += i_1429_;
							}
							if ((i_1429_ = (1 + i_1427_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_1428_)
								i_1428_ = i_1429_;
							int i_1430_ = is[i_1424_] - i;
							int i_1431_ = -is_1350_[i_1424_];
							int i_1432_ = i_1430_ - (i_1425_ - anInt8892);
							if (i_1432_ > 0) {
								i_1425_ += i_1432_;
								i_1428_ += i_1432_;
								i_1426_ += anInt8893 * i_1432_;
								i_1427_ += anInt8909 * i_1432_;
							} else
								i_1431_ -= i_1432_;
							if (i_1428_ < i_1431_)
								i_1428_ = i_1431_;
							for (/**/; i_1428_ < 0; i_1428_++) {
								int i_1433_ = (anIntArray11380[((i_1427_ >> 12) * anInt8877 + (i_1426_ >> 12))]);
								int i_1434_ = i_1433_ >>> 24;
								int i_1435_ = 256 - i_1434_;
								int i_1436_ = is_1352_[i_1425_];
								is_1352_[i_1425_++] = ((((i_1433_ & 0xff00ff) * i_1434_ + (i_1436_ & 0xff00ff) * i_1435_) & ~0xff00ff) + (((i_1433_ & 0xff00) * i_1434_ + (i_1436_ & 0xff00) * i_1435_) & 0xff0000)) >> 8;
								i_1426_ += anInt8893;
								i_1427_ += anInt8909;
							}
						}
						i_1423_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8909 == 0) {
				int i_1437_ = anInt8903;
				while (i_1437_ < 0) {
					int i_1438_ = i_1437_ + i_1351_;
					if (i_1438_ >= 0) {
						if (i_1438_ >= is.length)
							break;
						int i_1439_ = anInt8892;
						int i_1440_ = anInt8899 + anInt8890;
						int i_1441_ = anInt8900;
						int i_1442_ = anInt8888;
						if (i_1441_ >= 0 && i_1441_ - (anInt8880 << 12) < 0) {
							if (i_1440_ < 0) {
								int i_1443_ = (anInt8893 - 1 - i_1440_) / anInt8893;
								i_1442_ += i_1443_;
								i_1440_ += anInt8893 * i_1443_;
								i_1439_ += i_1443_;
							}
							int i_1444_;
							if ((i_1444_ = (1 + i_1440_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_1442_)
								i_1442_ = i_1444_;
							int i_1445_ = is[i_1438_] - i;
							int i_1446_ = -is_1350_[i_1438_];
							int i_1447_ = i_1445_ - (i_1439_ - anInt8892);
							if (i_1447_ > 0) {
								i_1439_ += i_1447_;
								i_1442_ += i_1447_;
								i_1440_ += anInt8893 * i_1447_;
								i_1441_ += anInt8909 * i_1447_;
							} else
								i_1446_ -= i_1447_;
							if (i_1442_ < i_1446_)
								i_1442_ = i_1446_;
							for (/**/; i_1442_ < 0; i_1442_++) {
								int i_1448_ = (anIntArray11380[((i_1441_ >> 12) * anInt8877 + (i_1440_ >> 12))]);
								int i_1449_ = i_1448_ >>> 24;
								int i_1450_ = 256 - i_1449_;
								int i_1451_ = is_1352_[i_1439_];
								is_1352_[i_1439_++] = ((((i_1448_ & 0xff00ff) * i_1449_ + (i_1451_ & 0xff00ff) * i_1450_) & ~0xff00ff) + (((i_1448_ & 0xff00) * i_1449_ + (i_1451_ & 0xff00) * i_1450_) & 0xff0000)) >> 8;
								i_1440_ += anInt8893;
							}
						}
					}
					i_1437_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else if (anInt8909 < 0) {
				int i_1452_ = anInt8903;
				while (i_1452_ < 0) {
					int i_1453_ = i_1452_ + i_1351_;
					if (i_1453_ >= 0) {
						if (i_1453_ >= is.length)
							break;
						int i_1454_ = anInt8892;
						int i_1455_ = anInt8899 + anInt8890;
						int i_1456_ = anInt8900 + anInt8902;
						int i_1457_ = anInt8888;
						if (i_1455_ < 0) {
							int i_1458_ = (anInt8893 - 1 - i_1455_) / anInt8893;
							i_1457_ += i_1458_;
							i_1455_ += anInt8893 * i_1458_;
							i_1456_ += anInt8909 * i_1458_;
							i_1454_ += i_1458_;
						}
						int i_1459_;
						if ((i_1459_ = (1 + i_1455_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_1457_)
							i_1457_ = i_1459_;
						if ((i_1459_ = i_1456_ - (anInt8880 << 12)) >= 0) {
							i_1459_ = (anInt8909 - i_1459_) / anInt8909;
							i_1457_ += i_1459_;
							i_1455_ += anInt8893 * i_1459_;
							i_1456_ += anInt8909 * i_1459_;
							i_1454_ += i_1459_;
						}
						if ((i_1459_ = (i_1456_ - anInt8909) / anInt8909) > i_1457_)
							i_1457_ = i_1459_;
						int i_1460_ = is[i_1453_] - i;
						int i_1461_ = -is_1350_[i_1453_];
						int i_1462_ = i_1460_ - (i_1454_ - anInt8892);
						if (i_1462_ > 0) {
							i_1454_ += i_1462_;
							i_1457_ += i_1462_;
							i_1455_ += anInt8893 * i_1462_;
							i_1456_ += anInt8909 * i_1462_;
						} else
							i_1461_ -= i_1462_;
						if (i_1457_ < i_1461_)
							i_1457_ = i_1461_;
						for (/**/; i_1457_ < 0; i_1457_++) {
							int i_1463_ = (anIntArray11380[(i_1456_ >> 12) * anInt8877 + (i_1455_ >> 12)]);
							int i_1464_ = i_1463_ >>> 24;
							int i_1465_ = 256 - i_1464_;
							int i_1466_ = is_1352_[i_1454_];
							is_1352_[i_1454_++] = ((((i_1463_ & 0xff00ff) * i_1464_ + (i_1466_ & 0xff00ff) * i_1465_) & ~0xff00ff) + (((i_1463_ & 0xff00) * i_1464_ + (i_1466_ & 0xff00) * i_1465_) & 0xff0000)) >> 8;
							i_1455_ += anInt8893;
							i_1456_ += anInt8909;
						}
					}
					i_1452_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else {
				int i_1467_ = anInt8903;
				while (i_1467_ < 0) {
					int i_1468_ = i_1467_ + i_1351_;
					if (i_1468_ >= 0) {
						if (i_1468_ >= is.length)
							break;
						int i_1469_ = anInt8892;
						int i_1470_ = anInt8899 + anInt8890;
						int i_1471_ = anInt8900 + anInt8902;
						int i_1472_ = anInt8888;
						if (i_1470_ < 0) {
							int i_1473_ = (anInt8893 - 1 - i_1470_) / anInt8893;
							i_1472_ += i_1473_;
							i_1470_ += anInt8893 * i_1473_;
							i_1471_ += anInt8909 * i_1473_;
							i_1469_ += i_1473_;
						}
						int i_1474_;
						if ((i_1474_ = (1 + i_1470_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_1472_)
							i_1472_ = i_1474_;
						if (i_1471_ < 0) {
							i_1474_ = (anInt8909 - 1 - i_1471_) / anInt8909;
							i_1472_ += i_1474_;
							i_1470_ += anInt8893 * i_1474_;
							i_1471_ += anInt8909 * i_1474_;
							i_1469_ += i_1474_;
						}
						if ((i_1474_ = (1 + i_1471_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_1472_)
							i_1472_ = i_1474_;
						int i_1475_ = is[i_1468_] - i;
						int i_1476_ = -is_1350_[i_1468_];
						int i_1477_ = i_1475_ - (i_1469_ - anInt8892);
						if (i_1477_ > 0) {
							i_1469_ += i_1477_;
							i_1472_ += i_1477_;
							i_1470_ += anInt8893 * i_1477_;
							i_1471_ += anInt8909 * i_1477_;
						} else
							i_1476_ -= i_1477_;
						if (i_1472_ < i_1476_)
							i_1472_ = i_1476_;
						for (/**/; i_1472_ < 0; i_1472_++) {
							int i_1478_ = (anIntArray11380[(i_1471_ >> 12) * anInt8877 + (i_1470_ >> 12)]);
							int i_1479_ = i_1478_ >>> 24;
							int i_1480_ = 256 - i_1479_;
							int i_1481_ = is_1352_[i_1469_];
							is_1352_[i_1469_++] = ((((i_1478_ & 0xff00ff) * i_1479_ + (i_1481_ & 0xff00ff) * i_1480_) & ~0xff00ff) + (((i_1478_ & 0xff00) * i_1479_ + (i_1481_ & 0xff00) * i_1480_) & 0xff0000)) >> 8;
							i_1470_ += anInt8893;
							i_1471_ += anInt8909;
						}
					}
					i_1467_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			}
		}
	}

	void method17957(int i, int i_1482_, int i_1483_, int i_1484_, int[] is, int i_1485_, int i_1486_) {
		i_1486_ -= i_1483_;
		for (int i_1487_ = 0; i_1487_ < i_1484_; i_1487_++) {
			int i_1488_ = (i_1482_ + i_1487_) * i_1483_ + i;
			for (int i_1489_ = 0; i_1489_ < i_1483_; i_1489_++)
				is[i_1485_++] = anIntArray11380[i_1488_ + i_1489_];
			i_1485_ += i_1486_;
		}
	}

	void method17958(int i, int i_1490_, int i_1491_, int i_1492_, int[] is, int i_1493_, int i_1494_) {
		i_1494_ -= i_1491_;
		for (int i_1495_ = 0; i_1495_ < i_1492_; i_1495_++) {
			int i_1496_ = (i_1490_ + i_1495_) * i_1491_ + i;
			for (int i_1497_ = 0; i_1497_ < i_1491_; i_1497_++)
				is[i_1493_++] = anIntArray11380[i_1496_ + i_1497_];
			i_1493_ += i_1494_;
		}
	}

	public void method2441(int i, int i_1498_, int i_1499_, int i_1500_, int[] is, int[] is_1501_, int i_1502_, int i_1503_) {
		method17955(i, i_1498_, i_1499_, i_1500_, is, i_1502_, i_1503_);
	}

	public Interface21 method2462() {
		return new Class98(anInt8877, anInt8880, anIntArray11380);
	}

	public Interface21 method2443() {
		return new Class98(anInt8877, anInt8880, anIntArray11380);
	}

	void method17959(int i, int i_1504_, int[] is, int i_1505_, int i_1506_) {
		if (i_1506_ == 0) {
			if (i_1505_ == 1)
				is[i_1504_] = anIntArray11380[i];
			else if (i_1505_ == 0) {
				int i_1507_ = anIntArray11380[i++];
				int i_1508_ = (i_1507_ & 0xff0000) * anInt8906 & ~0xffffff;
				int i_1509_ = (i_1507_ & 0xff00) * anInt8907 & 0xff0000;
				int i_1510_ = (i_1507_ & 0xff) * anInt8908 & 0xff00;
				is[i_1504_] = (i_1508_ | i_1509_ | i_1510_) >>> 8;
			} else if (i_1505_ == 3) {
				int i_1511_ = anIntArray11380[i++];
				int i_1512_ = anInt8894;
				int i_1513_ = i_1511_ + i_1512_;
				int i_1514_ = (i_1511_ & 0xff00ff) + (i_1512_ & 0xff00ff);
				int i_1515_ = (i_1514_ & 0x1000100) + (i_1513_ - i_1514_ & 0x10000);
				is[i_1504_] = i_1513_ - i_1515_ | i_1515_ - (i_1515_ >>> 8);
			} else if (i_1505_ == 2) {
				int i_1516_ = anIntArray11380[i];
				int i_1517_ = (i_1516_ & 0xff00ff) * anInt8904 & ~0xff00ff;
				int i_1518_ = (i_1516_ & 0xff00) * anInt8904 & 0xff0000;
				is[i_1504_] = ((i_1517_ | i_1518_) >>> 8) + anInt8911;
			} else
				throw new IllegalArgumentException();
		} else if (i_1506_ == 1) {
			if (i_1505_ == 1) {
				int i_1519_ = anIntArray11380[i];
				int i_1520_ = i_1519_ >>> 24;
				int i_1521_ = 256 - i_1520_;
				int i_1522_ = is[i_1504_];
				is[i_1504_] = ((((i_1519_ & 0xff00ff) * i_1520_ + (i_1522_ & 0xff00ff) * i_1521_) & ~0xff00ff) + (((i_1519_ & 0xff00) * i_1520_ + (i_1522_ & 0xff00) * i_1521_) & 0xff0000)) >> 8;
			} else if (i_1505_ == 0) {
				int i_1523_ = anIntArray11380[i];
				int i_1524_ = (i_1523_ >>> 24) * anInt8904 >> 8;
				int i_1525_ = 256 - i_1524_;
				if ((anInt8894 & 0xffffff) == 16777215) {
					int i_1526_ = is[i_1504_];
					is[i_1504_] = ((((i_1523_ & 0xff00ff) * i_1524_ + (i_1526_ & 0xff00ff) * i_1525_) & ~0xff00ff) + (((i_1523_ & 0xff00) * i_1524_ + (i_1526_ & 0xff00) * i_1525_) & 0xff0000)) >> 8;
				} else if (i_1524_ != 255) {
					int i_1527_ = (i_1523_ & 0xff0000) * anInt8906 & ~0xffffff;
					int i_1528_ = (i_1523_ & 0xff00) * anInt8907 & 0xff0000;
					int i_1529_ = (i_1523_ & 0xff) * anInt8908 & 0xff00;
					i_1523_ = (i_1527_ | i_1528_ | i_1529_) >>> 8;
					int i_1530_ = is[i_1504_];
					is[i_1504_] = ((((i_1523_ & 0xff00ff) * i_1524_ + (i_1530_ & 0xff00ff) * i_1525_) & ~0xff00ff) + (((i_1523_ & 0xff00) * i_1524_ + (i_1530_ & 0xff00) * i_1525_) & 0xff0000)) >> 8;
				} else {
					int i_1531_ = (i_1523_ & 0xff0000) * anInt8906 & ~0xffffff;
					int i_1532_ = (i_1523_ & 0xff00) * anInt8907 & 0xff0000;
					int i_1533_ = (i_1523_ & 0xff) * anInt8908 & 0xff00;
					is[i_1504_] = (i_1531_ | i_1532_ | i_1533_) >>> 8;
				}
			} else if (i_1505_ == 3) {
				int i_1534_ = anIntArray11380[i];
				int i_1535_ = anInt8894;
				int i_1536_ = i_1534_ + i_1535_;
				int i_1537_ = (i_1534_ & 0xff00ff) + (i_1535_ & 0xff00ff);
				int i_1538_ = (i_1537_ & 0x1000100) + (i_1536_ - i_1537_ & 0x10000);
				i_1538_ = i_1536_ - i_1538_ | i_1538_ - (i_1538_ >>> 8);
				int i_1539_ = (i_1534_ >>> 24) * anInt8904 >> 8;
				int i_1540_ = 256 - i_1539_;
				if (i_1539_ != 255) {
					i_1534_ = i_1538_;
					i_1538_ = is[i_1504_];
					i_1538_ = ((((i_1534_ & 0xff00ff) * i_1539_ + (i_1538_ & 0xff00ff) * i_1540_) & ~0xff00ff) + (((i_1534_ & 0xff00) * i_1539_ + (i_1538_ & 0xff00) * i_1540_) & 0xff0000)) >> 8;
				}
				is[i_1504_] = i_1538_;
			} else if (i_1505_ == 2) {
				int i_1541_ = anIntArray11380[i];
				int i_1542_ = i_1541_ >>> 24;
				int i_1543_ = 256 - i_1542_;
				int i_1544_ = (i_1541_ & 0xff00ff) * anInt8904 & ~0xff00ff;
				int i_1545_ = (i_1541_ & 0xff00) * anInt8904 & 0xff0000;
				i_1541_ = ((i_1544_ | i_1545_) >>> 8) + anInt8911;
				int i_1546_ = is[i_1504_];
				is[i_1504_] = ((((i_1541_ & 0xff00ff) * i_1542_ + (i_1546_ & 0xff00ff) * i_1543_) & ~0xff00ff) + (((i_1541_ & 0xff00) * i_1542_ + (i_1546_ & 0xff00) * i_1543_) & 0xff0000)) >> 8;
			} else
				throw new IllegalArgumentException();
		} else if (i_1506_ == 2) {
			if (i_1505_ == 1) {
				int i_1547_ = anIntArray11380[i];
				int i_1548_ = is[i_1504_];
				int i_1549_ = i_1547_ + i_1548_;
				int i_1550_ = (i_1547_ & 0xff00ff) + (i_1548_ & 0xff00ff);
				i_1548_ = (i_1550_ & 0x1000100) + (i_1549_ - i_1550_ & 0x10000);
				is[i_1504_] = i_1549_ - i_1548_ | i_1548_ - (i_1548_ >>> 8);
			} else if (i_1505_ == 0) {
				int i_1551_ = anIntArray11380[i];
				int i_1552_ = (i_1551_ & 0xff0000) * anInt8906 & ~0xffffff;
				int i_1553_ = (i_1551_ & 0xff00) * anInt8907 & 0xff0000;
				int i_1554_ = (i_1551_ & 0xff) * anInt8908 & 0xff00;
				i_1551_ = (i_1552_ | i_1553_ | i_1554_) >>> 8;
				int i_1555_ = is[i_1504_];
				int i_1556_ = i_1551_ + i_1555_;
				int i_1557_ = (i_1551_ & 0xff00ff) + (i_1555_ & 0xff00ff);
				i_1555_ = (i_1557_ & 0x1000100) + (i_1556_ - i_1557_ & 0x10000);
				is[i_1504_] = i_1556_ - i_1555_ | i_1555_ - (i_1555_ >>> 8);
			} else if (i_1505_ == 3) {
				int i_1558_ = anIntArray11380[i];
				int i_1559_ = anInt8894;
				int i_1560_ = i_1558_ + i_1559_;
				int i_1561_ = (i_1558_ & 0xff00ff) + (i_1559_ & 0xff00ff);
				int i_1562_ = (i_1561_ & 0x1000100) + (i_1560_ - i_1561_ & 0x10000);
				i_1558_ = i_1560_ - i_1562_ | i_1562_ - (i_1562_ >>> 8);
				i_1562_ = is[i_1504_];
				i_1560_ = i_1558_ + i_1562_;
				i_1561_ = (i_1558_ & 0xff00ff) + (i_1562_ & 0xff00ff);
				i_1562_ = (i_1561_ & 0x1000100) + (i_1560_ - i_1561_ & 0x10000);
				is[i_1504_] = i_1560_ - i_1562_ | i_1562_ - (i_1562_ >>> 8);
			} else if (i_1505_ == 2) {
				int i_1563_ = anIntArray11380[i];
				int i_1564_ = (i_1563_ & 0xff00ff) * anInt8904 & ~0xff00ff;
				int i_1565_ = (i_1563_ & 0xff00) * anInt8904 & 0xff0000;
				i_1563_ = ((i_1564_ | i_1565_) >>> 8) + anInt8911;
				int i_1566_ = is[i_1504_];
				int i_1567_ = i_1563_ + i_1566_;
				int i_1568_ = (i_1563_ & 0xff00ff) + (i_1566_ & 0xff00ff);
				i_1566_ = (i_1568_ & 0x1000100) + (i_1567_ - i_1568_ & 0x10000);
				is[i_1504_] = i_1567_ - i_1566_ | i_1566_ - (i_1566_ >>> 8);
			}
		} else
			throw new IllegalArgumentException();
	}

	void method14426(int[] is, int[] is_1569_, int i, int i_1570_) {
		int[] is_1571_ = aClass180_Sub1_8876.anIntArray9386;
		if (is_1571_ != null) {
			if (anInt8893 == 0) {
				if (anInt8909 == 0) {
					int i_1572_ = anInt8903;
					while (i_1572_ < 0) {
						int i_1573_ = i_1572_ + i_1570_;
						if (i_1573_ >= 0) {
							if (i_1573_ >= is.length)
								break;
							int i_1574_ = anInt8892;
							int i_1575_ = anInt8899;
							int i_1576_ = anInt8900;
							int i_1577_ = anInt8888;
							if (i_1575_ >= 0 && i_1576_ >= 0 && i_1575_ - (anInt8877 << 12) < 0 && i_1576_ - (anInt8880 << 12) < 0) {
								int i_1578_ = is[i_1573_] - i;
								int i_1579_ = -is_1569_[i_1573_];
								int i_1580_ = i_1578_ - (i_1574_ - anInt8892);
								if (i_1580_ > 0) {
									i_1574_ += i_1580_;
									i_1577_ += i_1580_;
									i_1575_ += anInt8893 * i_1580_;
									i_1576_ += anInt8909 * i_1580_;
								} else
									i_1579_ -= i_1580_;
								if (i_1577_ < i_1579_)
									i_1577_ = i_1579_;
								for (/**/; i_1577_ < 0; i_1577_++) {
									int i_1581_ = (anIntArray11380[((i_1576_ >> 12) * anInt8877 + (i_1575_ >> 12))]);
									int i_1582_ = i_1581_ >>> 24;
									int i_1583_ = 256 - i_1582_;
									int i_1584_ = is_1571_[i_1574_];
									is_1571_[i_1574_++] = ((((i_1581_ & 0xff00ff) * i_1582_ + (i_1584_ & 0xff00ff) * i_1583_) & ~0xff00ff) + (((i_1581_ & 0xff00) * i_1582_ + (i_1584_ & 0xff00) * i_1583_) & 0xff0000)) >> 8;
								}
							}
						}
						i_1572_++;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_1585_ = anInt8903;
					while (i_1585_ < 0) {
						int i_1586_ = i_1585_ + i_1570_;
						if (i_1586_ >= 0) {
							if (i_1586_ >= is.length)
								break;
							int i_1587_ = anInt8892;
							int i_1588_ = anInt8899;
							int i_1589_ = anInt8900 + anInt8902;
							int i_1590_ = anInt8888;
							if (i_1588_ >= 0 && i_1588_ - (anInt8877 << 12) < 0) {
								int i_1591_;
								if ((i_1591_ = i_1589_ - (anInt8880 << 12)) >= 0) {
									i_1591_ = (anInt8909 - i_1591_) / anInt8909;
									i_1590_ += i_1591_;
									i_1589_ += anInt8909 * i_1591_;
									i_1587_ += i_1591_;
								}
								if ((i_1591_ = (i_1589_ - anInt8909) / anInt8909) > i_1590_)
									i_1590_ = i_1591_;
								int i_1592_ = is[i_1586_] - i;
								int i_1593_ = -is_1569_[i_1586_];
								int i_1594_ = i_1592_ - (i_1587_ - anInt8892);
								if (i_1594_ > 0) {
									i_1587_ += i_1594_;
									i_1590_ += i_1594_;
									i_1588_ += anInt8893 * i_1594_;
									i_1589_ += anInt8909 * i_1594_;
								} else
									i_1593_ -= i_1594_;
								if (i_1590_ < i_1593_)
									i_1590_ = i_1593_;
								for (/**/; i_1590_ < 0; i_1590_++) {
									int i_1595_ = (anIntArray11380[((i_1589_ >> 12) * anInt8877 + (i_1588_ >> 12))]);
									int i_1596_ = i_1595_ >>> 24;
									int i_1597_ = 256 - i_1596_;
									int i_1598_ = is_1571_[i_1587_];
									is_1571_[i_1587_++] = ((((i_1595_ & 0xff00ff) * i_1596_ + (i_1598_ & 0xff00ff) * i_1597_) & ~0xff00ff) + (((i_1595_ & 0xff00) * i_1596_ + (i_1598_ & 0xff00) * i_1597_) & 0xff0000)) >> 8;
									i_1589_ += anInt8909;
								}
							}
						}
						i_1585_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				} else {
					int i_1599_ = anInt8903;
					while (i_1599_ < 0) {
						int i_1600_ = i_1599_ + i_1570_;
						if (i_1600_ >= 0) {
							if (i_1600_ >= is.length)
								break;
							int i_1601_ = anInt8892;
							int i_1602_ = anInt8899;
							int i_1603_ = anInt8900 + anInt8902;
							int i_1604_ = anInt8888;
							if (i_1602_ >= 0 && i_1602_ - (anInt8877 << 12) < 0) {
								if (i_1603_ < 0) {
									int i_1605_ = ((anInt8909 - 1 - i_1603_) / anInt8909);
									i_1604_ += i_1605_;
									i_1603_ += anInt8909 * i_1605_;
									i_1601_ += i_1605_;
								}
								int i_1606_;
								if ((i_1606_ = (1 + i_1603_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_1604_)
									i_1604_ = i_1606_;
								int i_1607_ = is[i_1600_] - i;
								int i_1608_ = -is_1569_[i_1600_];
								int i_1609_ = i_1607_ - (i_1601_ - anInt8892);
								if (i_1609_ > 0) {
									i_1601_ += i_1609_;
									i_1604_ += i_1609_;
									i_1602_ += anInt8893 * i_1609_;
									i_1603_ += anInt8909 * i_1609_;
								} else
									i_1608_ -= i_1609_;
								if (i_1604_ < i_1608_)
									i_1604_ = i_1608_;
								for (/**/; i_1604_ < 0; i_1604_++) {
									int i_1610_ = (anIntArray11380[((i_1603_ >> 12) * anInt8877 + (i_1602_ >> 12))]);
									int i_1611_ = i_1610_ >>> 24;
									int i_1612_ = 256 - i_1611_;
									int i_1613_ = is_1571_[i_1601_];
									is_1571_[i_1601_++] = ((((i_1610_ & 0xff00ff) * i_1611_ + (i_1613_ & 0xff00ff) * i_1612_) & ~0xff00ff) + (((i_1610_ & 0xff00) * i_1611_ + (i_1613_ & 0xff00) * i_1612_) & 0xff0000)) >> 8;
									i_1603_ += anInt8909;
								}
							}
						}
						i_1599_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8893 < 0) {
				if (anInt8909 == 0) {
					int i_1614_ = anInt8903;
					while (i_1614_ < 0) {
						int i_1615_ = i_1614_ + i_1570_;
						if (i_1615_ >= 0) {
							if (i_1615_ >= is.length)
								break;
							int i_1616_ = anInt8892;
							int i_1617_ = anInt8899 + anInt8890;
							int i_1618_ = anInt8900;
							int i_1619_ = anInt8888;
							if (i_1618_ >= 0 && i_1618_ - (anInt8880 << 12) < 0) {
								int i_1620_;
								if ((i_1620_ = i_1617_ - (anInt8877 << 12)) >= 0) {
									i_1620_ = (anInt8893 - i_1620_) / anInt8893;
									i_1619_ += i_1620_;
									i_1617_ += anInt8893 * i_1620_;
									i_1616_ += i_1620_;
								}
								if ((i_1620_ = (i_1617_ - anInt8893) / anInt8893) > i_1619_)
									i_1619_ = i_1620_;
								int i_1621_ = is[i_1615_] - i;
								int i_1622_ = -is_1569_[i_1615_];
								int i_1623_ = i_1621_ - (i_1616_ - anInt8892);
								if (i_1623_ > 0) {
									i_1616_ += i_1623_;
									i_1619_ += i_1623_;
									i_1617_ += anInt8893 * i_1623_;
									i_1618_ += anInt8909 * i_1623_;
								} else
									i_1622_ -= i_1623_;
								if (i_1619_ < i_1622_)
									i_1619_ = i_1622_;
								for (/**/; i_1619_ < 0; i_1619_++) {
									int i_1624_ = (anIntArray11380[((i_1618_ >> 12) * anInt8877 + (i_1617_ >> 12))]);
									int i_1625_ = i_1624_ >>> 24;
									int i_1626_ = 256 - i_1625_;
									int i_1627_ = is_1571_[i_1616_];
									is_1571_[i_1616_++] = ((((i_1624_ & 0xff00ff) * i_1625_ + (i_1627_ & 0xff00ff) * i_1626_) & ~0xff00ff) + (((i_1624_ & 0xff00) * i_1625_ + (i_1627_ & 0xff00) * i_1626_) & 0xff0000)) >> 8;
									i_1617_ += anInt8893;
								}
							}
						}
						i_1614_++;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_1628_ = anInt8903;
					while (i_1628_ < 0) {
						int i_1629_ = i_1628_ + i_1570_;
						if (i_1629_ >= 0) {
							if (i_1629_ >= is.length)
								break;
							int i_1630_ = anInt8892;
							int i_1631_ = anInt8899 + anInt8890;
							int i_1632_ = anInt8900 + anInt8902;
							int i_1633_ = anInt8888;
							int i_1634_;
							if ((i_1634_ = i_1631_ - (anInt8877 << 12)) >= 0) {
								i_1634_ = (anInt8893 - i_1634_) / anInt8893;
								i_1633_ += i_1634_;
								i_1631_ += anInt8893 * i_1634_;
								i_1632_ += anInt8909 * i_1634_;
								i_1630_ += i_1634_;
							}
							if ((i_1634_ = (i_1631_ - anInt8893) / anInt8893) > i_1633_)
								i_1633_ = i_1634_;
							if ((i_1634_ = i_1632_ - (anInt8880 << 12)) >= 0) {
								i_1634_ = (anInt8909 - i_1634_) / anInt8909;
								i_1633_ += i_1634_;
								i_1631_ += anInt8893 * i_1634_;
								i_1632_ += anInt8909 * i_1634_;
								i_1630_ += i_1634_;
							}
							if ((i_1634_ = (i_1632_ - anInt8909) / anInt8909) > i_1633_)
								i_1633_ = i_1634_;
							int i_1635_ = is[i_1629_] - i;
							int i_1636_ = -is_1569_[i_1629_];
							int i_1637_ = i_1635_ - (i_1630_ - anInt8892);
							if (i_1637_ > 0) {
								i_1630_ += i_1637_;
								i_1633_ += i_1637_;
								i_1631_ += anInt8893 * i_1637_;
								i_1632_ += anInt8909 * i_1637_;
							} else
								i_1636_ -= i_1637_;
							if (i_1633_ < i_1636_)
								i_1633_ = i_1636_;
							for (/**/; i_1633_ < 0; i_1633_++) {
								int i_1638_ = (anIntArray11380[((i_1632_ >> 12) * anInt8877 + (i_1631_ >> 12))]);
								int i_1639_ = i_1638_ >>> 24;
								int i_1640_ = 256 - i_1639_;
								int i_1641_ = is_1571_[i_1630_];
								is_1571_[i_1630_++] = ((((i_1638_ & 0xff00ff) * i_1639_ + (i_1641_ & 0xff00ff) * i_1640_) & ~0xff00ff) + (((i_1638_ & 0xff00) * i_1639_ + (i_1641_ & 0xff00) * i_1640_) & 0xff0000)) >> 8;
								i_1631_ += anInt8893;
								i_1632_ += anInt8909;
							}
						}
						i_1628_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else {
					int i_1642_ = anInt8903;
					while (i_1642_ < 0) {
						int i_1643_ = i_1642_ + i_1570_;
						if (i_1643_ >= 0) {
							if (i_1643_ >= is.length)
								break;
							int i_1644_ = anInt8892;
							int i_1645_ = anInt8899 + anInt8890;
							int i_1646_ = anInt8900 + anInt8902;
							int i_1647_ = anInt8888;
							int i_1648_;
							if ((i_1648_ = i_1645_ - (anInt8877 << 12)) >= 0) {
								i_1648_ = (anInt8893 - i_1648_) / anInt8893;
								i_1647_ += i_1648_;
								i_1645_ += anInt8893 * i_1648_;
								i_1646_ += anInt8909 * i_1648_;
								i_1644_ += i_1648_;
							}
							if ((i_1648_ = (i_1645_ - anInt8893) / anInt8893) > i_1647_)
								i_1647_ = i_1648_;
							if (i_1646_ < 0) {
								i_1648_ = (anInt8909 - 1 - i_1646_) / anInt8909;
								i_1647_ += i_1648_;
								i_1645_ += anInt8893 * i_1648_;
								i_1646_ += anInt8909 * i_1648_;
								i_1644_ += i_1648_;
							}
							if ((i_1648_ = (1 + i_1646_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_1647_)
								i_1647_ = i_1648_;
							int i_1649_ = is[i_1643_] - i;
							int i_1650_ = -is_1569_[i_1643_];
							int i_1651_ = i_1649_ - (i_1644_ - anInt8892);
							if (i_1651_ > 0) {
								i_1644_ += i_1651_;
								i_1647_ += i_1651_;
								i_1645_ += anInt8893 * i_1651_;
								i_1646_ += anInt8909 * i_1651_;
							} else
								i_1650_ -= i_1651_;
							if (i_1647_ < i_1650_)
								i_1647_ = i_1650_;
							for (/**/; i_1647_ < 0; i_1647_++) {
								int i_1652_ = (anIntArray11380[((i_1646_ >> 12) * anInt8877 + (i_1645_ >> 12))]);
								int i_1653_ = i_1652_ >>> 24;
								int i_1654_ = 256 - i_1653_;
								int i_1655_ = is_1571_[i_1644_];
								is_1571_[i_1644_++] = ((((i_1652_ & 0xff00ff) * i_1653_ + (i_1655_ & 0xff00ff) * i_1654_) & ~0xff00ff) + (((i_1652_ & 0xff00) * i_1653_ + (i_1655_ & 0xff00) * i_1654_) & 0xff0000)) >> 8;
								i_1645_ += anInt8893;
								i_1646_ += anInt8909;
							}
						}
						i_1642_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8909 == 0) {
				int i_1656_ = anInt8903;
				while (i_1656_ < 0) {
					int i_1657_ = i_1656_ + i_1570_;
					if (i_1657_ >= 0) {
						if (i_1657_ >= is.length)
							break;
						int i_1658_ = anInt8892;
						int i_1659_ = anInt8899 + anInt8890;
						int i_1660_ = anInt8900;
						int i_1661_ = anInt8888;
						if (i_1660_ >= 0 && i_1660_ - (anInt8880 << 12) < 0) {
							if (i_1659_ < 0) {
								int i_1662_ = (anInt8893 - 1 - i_1659_) / anInt8893;
								i_1661_ += i_1662_;
								i_1659_ += anInt8893 * i_1662_;
								i_1658_ += i_1662_;
							}
							int i_1663_;
							if ((i_1663_ = (1 + i_1659_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_1661_)
								i_1661_ = i_1663_;
							int i_1664_ = is[i_1657_] - i;
							int i_1665_ = -is_1569_[i_1657_];
							int i_1666_ = i_1664_ - (i_1658_ - anInt8892);
							if (i_1666_ > 0) {
								i_1658_ += i_1666_;
								i_1661_ += i_1666_;
								i_1659_ += anInt8893 * i_1666_;
								i_1660_ += anInt8909 * i_1666_;
							} else
								i_1665_ -= i_1666_;
							if (i_1661_ < i_1665_)
								i_1661_ = i_1665_;
							for (/**/; i_1661_ < 0; i_1661_++) {
								int i_1667_ = (anIntArray11380[((i_1660_ >> 12) * anInt8877 + (i_1659_ >> 12))]);
								int i_1668_ = i_1667_ >>> 24;
								int i_1669_ = 256 - i_1668_;
								int i_1670_ = is_1571_[i_1658_];
								is_1571_[i_1658_++] = ((((i_1667_ & 0xff00ff) * i_1668_ + (i_1670_ & 0xff00ff) * i_1669_) & ~0xff00ff) + (((i_1667_ & 0xff00) * i_1668_ + (i_1670_ & 0xff00) * i_1669_) & 0xff0000)) >> 8;
								i_1659_ += anInt8893;
							}
						}
					}
					i_1656_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else if (anInt8909 < 0) {
				int i_1671_ = anInt8903;
				while (i_1671_ < 0) {
					int i_1672_ = i_1671_ + i_1570_;
					if (i_1672_ >= 0) {
						if (i_1672_ >= is.length)
							break;
						int i_1673_ = anInt8892;
						int i_1674_ = anInt8899 + anInt8890;
						int i_1675_ = anInt8900 + anInt8902;
						int i_1676_ = anInt8888;
						if (i_1674_ < 0) {
							int i_1677_ = (anInt8893 - 1 - i_1674_) / anInt8893;
							i_1676_ += i_1677_;
							i_1674_ += anInt8893 * i_1677_;
							i_1675_ += anInt8909 * i_1677_;
							i_1673_ += i_1677_;
						}
						int i_1678_;
						if ((i_1678_ = (1 + i_1674_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_1676_)
							i_1676_ = i_1678_;
						if ((i_1678_ = i_1675_ - (anInt8880 << 12)) >= 0) {
							i_1678_ = (anInt8909 - i_1678_) / anInt8909;
							i_1676_ += i_1678_;
							i_1674_ += anInt8893 * i_1678_;
							i_1675_ += anInt8909 * i_1678_;
							i_1673_ += i_1678_;
						}
						if ((i_1678_ = (i_1675_ - anInt8909) / anInt8909) > i_1676_)
							i_1676_ = i_1678_;
						int i_1679_ = is[i_1672_] - i;
						int i_1680_ = -is_1569_[i_1672_];
						int i_1681_ = i_1679_ - (i_1673_ - anInt8892);
						if (i_1681_ > 0) {
							i_1673_ += i_1681_;
							i_1676_ += i_1681_;
							i_1674_ += anInt8893 * i_1681_;
							i_1675_ += anInt8909 * i_1681_;
						} else
							i_1680_ -= i_1681_;
						if (i_1676_ < i_1680_)
							i_1676_ = i_1680_;
						for (/**/; i_1676_ < 0; i_1676_++) {
							int i_1682_ = (anIntArray11380[(i_1675_ >> 12) * anInt8877 + (i_1674_ >> 12)]);
							int i_1683_ = i_1682_ >>> 24;
							int i_1684_ = 256 - i_1683_;
							int i_1685_ = is_1571_[i_1673_];
							is_1571_[i_1673_++] = ((((i_1682_ & 0xff00ff) * i_1683_ + (i_1685_ & 0xff00ff) * i_1684_) & ~0xff00ff) + (((i_1682_ & 0xff00) * i_1683_ + (i_1685_ & 0xff00) * i_1684_) & 0xff0000)) >> 8;
							i_1674_ += anInt8893;
							i_1675_ += anInt8909;
						}
					}
					i_1671_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else {
				int i_1686_ = anInt8903;
				while (i_1686_ < 0) {
					int i_1687_ = i_1686_ + i_1570_;
					if (i_1687_ >= 0) {
						if (i_1687_ >= is.length)
							break;
						int i_1688_ = anInt8892;
						int i_1689_ = anInt8899 + anInt8890;
						int i_1690_ = anInt8900 + anInt8902;
						int i_1691_ = anInt8888;
						if (i_1689_ < 0) {
							int i_1692_ = (anInt8893 - 1 - i_1689_) / anInt8893;
							i_1691_ += i_1692_;
							i_1689_ += anInt8893 * i_1692_;
							i_1690_ += anInt8909 * i_1692_;
							i_1688_ += i_1692_;
						}
						int i_1693_;
						if ((i_1693_ = (1 + i_1689_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_1691_)
							i_1691_ = i_1693_;
						if (i_1690_ < 0) {
							i_1693_ = (anInt8909 - 1 - i_1690_) / anInt8909;
							i_1691_ += i_1693_;
							i_1689_ += anInt8893 * i_1693_;
							i_1690_ += anInt8909 * i_1693_;
							i_1688_ += i_1693_;
						}
						if ((i_1693_ = (1 + i_1690_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_1691_)
							i_1691_ = i_1693_;
						int i_1694_ = is[i_1687_] - i;
						int i_1695_ = -is_1569_[i_1687_];
						int i_1696_ = i_1694_ - (i_1688_ - anInt8892);
						if (i_1696_ > 0) {
							i_1688_ += i_1696_;
							i_1691_ += i_1696_;
							i_1689_ += anInt8893 * i_1696_;
							i_1690_ += anInt8909 * i_1696_;
						} else
							i_1695_ -= i_1696_;
						if (i_1691_ < i_1695_)
							i_1691_ = i_1695_;
						for (/**/; i_1691_ < 0; i_1691_++) {
							int i_1697_ = (anIntArray11380[(i_1690_ >> 12) * anInt8877 + (i_1689_ >> 12)]);
							int i_1698_ = i_1697_ >>> 24;
							int i_1699_ = 256 - i_1698_;
							int i_1700_ = is_1571_[i_1688_];
							is_1571_[i_1688_++] = ((((i_1697_ & 0xff00ff) * i_1698_ + (i_1700_ & 0xff00ff) * i_1699_) & ~0xff00ff) + (((i_1697_ & 0xff00) * i_1698_ + (i_1700_ & 0xff00) * i_1699_) & 0xff0000)) >> 8;
							i_1689_ += anInt8893;
							i_1690_ += anInt8909;
						}
					}
					i_1686_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			}
		}
	}

	void method17960(int i, int i_1701_, int[] is, int i_1702_, int i_1703_) {
		if (i_1703_ == 0) {
			if (i_1702_ == 1)
				is[i_1701_] = anIntArray11380[i];
			else if (i_1702_ == 0) {
				int i_1704_ = anIntArray11380[i++];
				int i_1705_ = (i_1704_ & 0xff0000) * anInt8906 & ~0xffffff;
				int i_1706_ = (i_1704_ & 0xff00) * anInt8907 & 0xff0000;
				int i_1707_ = (i_1704_ & 0xff) * anInt8908 & 0xff00;
				is[i_1701_] = (i_1705_ | i_1706_ | i_1707_) >>> 8;
			} else if (i_1702_ == 3) {
				int i_1708_ = anIntArray11380[i++];
				int i_1709_ = anInt8894;
				int i_1710_ = i_1708_ + i_1709_;
				int i_1711_ = (i_1708_ & 0xff00ff) + (i_1709_ & 0xff00ff);
				int i_1712_ = (i_1711_ & 0x1000100) + (i_1710_ - i_1711_ & 0x10000);
				is[i_1701_] = i_1710_ - i_1712_ | i_1712_ - (i_1712_ >>> 8);
			} else if (i_1702_ == 2) {
				int i_1713_ = anIntArray11380[i];
				int i_1714_ = (i_1713_ & 0xff00ff) * anInt8904 & ~0xff00ff;
				int i_1715_ = (i_1713_ & 0xff00) * anInt8904 & 0xff0000;
				is[i_1701_] = ((i_1714_ | i_1715_) >>> 8) + anInt8911;
			} else
				throw new IllegalArgumentException();
		} else if (i_1703_ == 1) {
			if (i_1702_ == 1) {
				int i_1716_ = anIntArray11380[i];
				int i_1717_ = i_1716_ >>> 24;
				int i_1718_ = 256 - i_1717_;
				int i_1719_ = is[i_1701_];
				is[i_1701_] = ((((i_1716_ & 0xff00ff) * i_1717_ + (i_1719_ & 0xff00ff) * i_1718_) & ~0xff00ff) + (((i_1716_ & 0xff00) * i_1717_ + (i_1719_ & 0xff00) * i_1718_) & 0xff0000)) >> 8;
			} else if (i_1702_ == 0) {
				int i_1720_ = anIntArray11380[i];
				int i_1721_ = (i_1720_ >>> 24) * anInt8904 >> 8;
				int i_1722_ = 256 - i_1721_;
				if ((anInt8894 & 0xffffff) == 16777215) {
					int i_1723_ = is[i_1701_];
					is[i_1701_] = ((((i_1720_ & 0xff00ff) * i_1721_ + (i_1723_ & 0xff00ff) * i_1722_) & ~0xff00ff) + (((i_1720_ & 0xff00) * i_1721_ + (i_1723_ & 0xff00) * i_1722_) & 0xff0000)) >> 8;
				} else if (i_1721_ != 255) {
					int i_1724_ = (i_1720_ & 0xff0000) * anInt8906 & ~0xffffff;
					int i_1725_ = (i_1720_ & 0xff00) * anInt8907 & 0xff0000;
					int i_1726_ = (i_1720_ & 0xff) * anInt8908 & 0xff00;
					i_1720_ = (i_1724_ | i_1725_ | i_1726_) >>> 8;
					int i_1727_ = is[i_1701_];
					is[i_1701_] = ((((i_1720_ & 0xff00ff) * i_1721_ + (i_1727_ & 0xff00ff) * i_1722_) & ~0xff00ff) + (((i_1720_ & 0xff00) * i_1721_ + (i_1727_ & 0xff00) * i_1722_) & 0xff0000)) >> 8;
				} else {
					int i_1728_ = (i_1720_ & 0xff0000) * anInt8906 & ~0xffffff;
					int i_1729_ = (i_1720_ & 0xff00) * anInt8907 & 0xff0000;
					int i_1730_ = (i_1720_ & 0xff) * anInt8908 & 0xff00;
					is[i_1701_] = (i_1728_ | i_1729_ | i_1730_) >>> 8;
				}
			} else if (i_1702_ == 3) {
				int i_1731_ = anIntArray11380[i];
				int i_1732_ = anInt8894;
				int i_1733_ = i_1731_ + i_1732_;
				int i_1734_ = (i_1731_ & 0xff00ff) + (i_1732_ & 0xff00ff);
				int i_1735_ = (i_1734_ & 0x1000100) + (i_1733_ - i_1734_ & 0x10000);
				i_1735_ = i_1733_ - i_1735_ | i_1735_ - (i_1735_ >>> 8);
				int i_1736_ = (i_1731_ >>> 24) * anInt8904 >> 8;
				int i_1737_ = 256 - i_1736_;
				if (i_1736_ != 255) {
					i_1731_ = i_1735_;
					i_1735_ = is[i_1701_];
					i_1735_ = ((((i_1731_ & 0xff00ff) * i_1736_ + (i_1735_ & 0xff00ff) * i_1737_) & ~0xff00ff) + (((i_1731_ & 0xff00) * i_1736_ + (i_1735_ & 0xff00) * i_1737_) & 0xff0000)) >> 8;
				}
				is[i_1701_] = i_1735_;
			} else if (i_1702_ == 2) {
				int i_1738_ = anIntArray11380[i];
				int i_1739_ = i_1738_ >>> 24;
				int i_1740_ = 256 - i_1739_;
				int i_1741_ = (i_1738_ & 0xff00ff) * anInt8904 & ~0xff00ff;
				int i_1742_ = (i_1738_ & 0xff00) * anInt8904 & 0xff0000;
				i_1738_ = ((i_1741_ | i_1742_) >>> 8) + anInt8911;
				int i_1743_ = is[i_1701_];
				is[i_1701_] = ((((i_1738_ & 0xff00ff) * i_1739_ + (i_1743_ & 0xff00ff) * i_1740_) & ~0xff00ff) + (((i_1738_ & 0xff00) * i_1739_ + (i_1743_ & 0xff00) * i_1740_) & 0xff0000)) >> 8;
			} else
				throw new IllegalArgumentException();
		} else if (i_1703_ == 2) {
			if (i_1702_ == 1) {
				int i_1744_ = anIntArray11380[i];
				int i_1745_ = is[i_1701_];
				int i_1746_ = i_1744_ + i_1745_;
				int i_1747_ = (i_1744_ & 0xff00ff) + (i_1745_ & 0xff00ff);
				i_1745_ = (i_1747_ & 0x1000100) + (i_1746_ - i_1747_ & 0x10000);
				is[i_1701_] = i_1746_ - i_1745_ | i_1745_ - (i_1745_ >>> 8);
			} else if (i_1702_ == 0) {
				int i_1748_ = anIntArray11380[i];
				int i_1749_ = (i_1748_ & 0xff0000) * anInt8906 & ~0xffffff;
				int i_1750_ = (i_1748_ & 0xff00) * anInt8907 & 0xff0000;
				int i_1751_ = (i_1748_ & 0xff) * anInt8908 & 0xff00;
				i_1748_ = (i_1749_ | i_1750_ | i_1751_) >>> 8;
				int i_1752_ = is[i_1701_];
				int i_1753_ = i_1748_ + i_1752_;
				int i_1754_ = (i_1748_ & 0xff00ff) + (i_1752_ & 0xff00ff);
				i_1752_ = (i_1754_ & 0x1000100) + (i_1753_ - i_1754_ & 0x10000);
				is[i_1701_] = i_1753_ - i_1752_ | i_1752_ - (i_1752_ >>> 8);
			} else if (i_1702_ == 3) {
				int i_1755_ = anIntArray11380[i];
				int i_1756_ = anInt8894;
				int i_1757_ = i_1755_ + i_1756_;
				int i_1758_ = (i_1755_ & 0xff00ff) + (i_1756_ & 0xff00ff);
				int i_1759_ = (i_1758_ & 0x1000100) + (i_1757_ - i_1758_ & 0x10000);
				i_1755_ = i_1757_ - i_1759_ | i_1759_ - (i_1759_ >>> 8);
				i_1759_ = is[i_1701_];
				i_1757_ = i_1755_ + i_1759_;
				i_1758_ = (i_1755_ & 0xff00ff) + (i_1759_ & 0xff00ff);
				i_1759_ = (i_1758_ & 0x1000100) + (i_1757_ - i_1758_ & 0x10000);
				is[i_1701_] = i_1757_ - i_1759_ | i_1759_ - (i_1759_ >>> 8);
			} else if (i_1702_ == 2) {
				int i_1760_ = anIntArray11380[i];
				int i_1761_ = (i_1760_ & 0xff00ff) * anInt8904 & ~0xff00ff;
				int i_1762_ = (i_1760_ & 0xff00) * anInt8904 & 0xff0000;
				i_1760_ = ((i_1761_ | i_1762_) >>> 8) + anInt8911;
				int i_1763_ = is[i_1701_];
				int i_1764_ = i_1760_ + i_1763_;
				int i_1765_ = (i_1760_ & 0xff00ff) + (i_1763_ & 0xff00ff);
				i_1763_ = (i_1765_ & 0x1000100) + (i_1764_ - i_1765_ & 0x10000);
				is[i_1701_] = i_1764_ - i_1763_ | i_1763_ - (i_1763_ >>> 8);
			}
		} else
			throw new IllegalArgumentException();
	}

	void method17961(int i, int i_1766_, int[] is, int i_1767_, int i_1768_) {
		if (i_1768_ == 0) {
			if (i_1767_ == 1)
				is[i_1766_] = anIntArray11380[i];
			else if (i_1767_ == 0) {
				int i_1769_ = anIntArray11380[i++];
				int i_1770_ = (i_1769_ & 0xff0000) * anInt8906 & ~0xffffff;
				int i_1771_ = (i_1769_ & 0xff00) * anInt8907 & 0xff0000;
				int i_1772_ = (i_1769_ & 0xff) * anInt8908 & 0xff00;
				is[i_1766_] = (i_1770_ | i_1771_ | i_1772_) >>> 8;
			} else if (i_1767_ == 3) {
				int i_1773_ = anIntArray11380[i++];
				int i_1774_ = anInt8894;
				int i_1775_ = i_1773_ + i_1774_;
				int i_1776_ = (i_1773_ & 0xff00ff) + (i_1774_ & 0xff00ff);
				int i_1777_ = (i_1776_ & 0x1000100) + (i_1775_ - i_1776_ & 0x10000);
				is[i_1766_] = i_1775_ - i_1777_ | i_1777_ - (i_1777_ >>> 8);
			} else if (i_1767_ == 2) {
				int i_1778_ = anIntArray11380[i];
				int i_1779_ = (i_1778_ & 0xff00ff) * anInt8904 & ~0xff00ff;
				int i_1780_ = (i_1778_ & 0xff00) * anInt8904 & 0xff0000;
				is[i_1766_] = ((i_1779_ | i_1780_) >>> 8) + anInt8911;
			} else
				throw new IllegalArgumentException();
		} else if (i_1768_ == 1) {
			if (i_1767_ == 1) {
				int i_1781_ = anIntArray11380[i];
				int i_1782_ = i_1781_ >>> 24;
				int i_1783_ = 256 - i_1782_;
				int i_1784_ = is[i_1766_];
				is[i_1766_] = ((((i_1781_ & 0xff00ff) * i_1782_ + (i_1784_ & 0xff00ff) * i_1783_) & ~0xff00ff) + (((i_1781_ & 0xff00) * i_1782_ + (i_1784_ & 0xff00) * i_1783_) & 0xff0000)) >> 8;
			} else if (i_1767_ == 0) {
				int i_1785_ = anIntArray11380[i];
				int i_1786_ = (i_1785_ >>> 24) * anInt8904 >> 8;
				int i_1787_ = 256 - i_1786_;
				if ((anInt8894 & 0xffffff) == 16777215) {
					int i_1788_ = is[i_1766_];
					is[i_1766_] = ((((i_1785_ & 0xff00ff) * i_1786_ + (i_1788_ & 0xff00ff) * i_1787_) & ~0xff00ff) + (((i_1785_ & 0xff00) * i_1786_ + (i_1788_ & 0xff00) * i_1787_) & 0xff0000)) >> 8;
				} else if (i_1786_ != 255) {
					int i_1789_ = (i_1785_ & 0xff0000) * anInt8906 & ~0xffffff;
					int i_1790_ = (i_1785_ & 0xff00) * anInt8907 & 0xff0000;
					int i_1791_ = (i_1785_ & 0xff) * anInt8908 & 0xff00;
					i_1785_ = (i_1789_ | i_1790_ | i_1791_) >>> 8;
					int i_1792_ = is[i_1766_];
					is[i_1766_] = ((((i_1785_ & 0xff00ff) * i_1786_ + (i_1792_ & 0xff00ff) * i_1787_) & ~0xff00ff) + (((i_1785_ & 0xff00) * i_1786_ + (i_1792_ & 0xff00) * i_1787_) & 0xff0000)) >> 8;
				} else {
					int i_1793_ = (i_1785_ & 0xff0000) * anInt8906 & ~0xffffff;
					int i_1794_ = (i_1785_ & 0xff00) * anInt8907 & 0xff0000;
					int i_1795_ = (i_1785_ & 0xff) * anInt8908 & 0xff00;
					is[i_1766_] = (i_1793_ | i_1794_ | i_1795_) >>> 8;
				}
			} else if (i_1767_ == 3) {
				int i_1796_ = anIntArray11380[i];
				int i_1797_ = anInt8894;
				int i_1798_ = i_1796_ + i_1797_;
				int i_1799_ = (i_1796_ & 0xff00ff) + (i_1797_ & 0xff00ff);
				int i_1800_ = (i_1799_ & 0x1000100) + (i_1798_ - i_1799_ & 0x10000);
				i_1800_ = i_1798_ - i_1800_ | i_1800_ - (i_1800_ >>> 8);
				int i_1801_ = (i_1796_ >>> 24) * anInt8904 >> 8;
				int i_1802_ = 256 - i_1801_;
				if (i_1801_ != 255) {
					i_1796_ = i_1800_;
					i_1800_ = is[i_1766_];
					i_1800_ = ((((i_1796_ & 0xff00ff) * i_1801_ + (i_1800_ & 0xff00ff) * i_1802_) & ~0xff00ff) + (((i_1796_ & 0xff00) * i_1801_ + (i_1800_ & 0xff00) * i_1802_) & 0xff0000)) >> 8;
				}
				is[i_1766_] = i_1800_;
			} else if (i_1767_ == 2) {
				int i_1803_ = anIntArray11380[i];
				int i_1804_ = i_1803_ >>> 24;
				int i_1805_ = 256 - i_1804_;
				int i_1806_ = (i_1803_ & 0xff00ff) * anInt8904 & ~0xff00ff;
				int i_1807_ = (i_1803_ & 0xff00) * anInt8904 & 0xff0000;
				i_1803_ = ((i_1806_ | i_1807_) >>> 8) + anInt8911;
				int i_1808_ = is[i_1766_];
				is[i_1766_] = ((((i_1803_ & 0xff00ff) * i_1804_ + (i_1808_ & 0xff00ff) * i_1805_) & ~0xff00ff) + (((i_1803_ & 0xff00) * i_1804_ + (i_1808_ & 0xff00) * i_1805_) & 0xff0000)) >> 8;
			} else
				throw new IllegalArgumentException();
		} else if (i_1768_ == 2) {
			if (i_1767_ == 1) {
				int i_1809_ = anIntArray11380[i];
				int i_1810_ = is[i_1766_];
				int i_1811_ = i_1809_ + i_1810_;
				int i_1812_ = (i_1809_ & 0xff00ff) + (i_1810_ & 0xff00ff);
				i_1810_ = (i_1812_ & 0x1000100) + (i_1811_ - i_1812_ & 0x10000);
				is[i_1766_] = i_1811_ - i_1810_ | i_1810_ - (i_1810_ >>> 8);
			} else if (i_1767_ == 0) {
				int i_1813_ = anIntArray11380[i];
				int i_1814_ = (i_1813_ & 0xff0000) * anInt8906 & ~0xffffff;
				int i_1815_ = (i_1813_ & 0xff00) * anInt8907 & 0xff0000;
				int i_1816_ = (i_1813_ & 0xff) * anInt8908 & 0xff00;
				i_1813_ = (i_1814_ | i_1815_ | i_1816_) >>> 8;
				int i_1817_ = is[i_1766_];
				int i_1818_ = i_1813_ + i_1817_;
				int i_1819_ = (i_1813_ & 0xff00ff) + (i_1817_ & 0xff00ff);
				i_1817_ = (i_1819_ & 0x1000100) + (i_1818_ - i_1819_ & 0x10000);
				is[i_1766_] = i_1818_ - i_1817_ | i_1817_ - (i_1817_ >>> 8);
			} else if (i_1767_ == 3) {
				int i_1820_ = anIntArray11380[i];
				int i_1821_ = anInt8894;
				int i_1822_ = i_1820_ + i_1821_;
				int i_1823_ = (i_1820_ & 0xff00ff) + (i_1821_ & 0xff00ff);
				int i_1824_ = (i_1823_ & 0x1000100) + (i_1822_ - i_1823_ & 0x10000);
				i_1820_ = i_1822_ - i_1824_ | i_1824_ - (i_1824_ >>> 8);
				i_1824_ = is[i_1766_];
				i_1822_ = i_1820_ + i_1824_;
				i_1823_ = (i_1820_ & 0xff00ff) + (i_1824_ & 0xff00ff);
				i_1824_ = (i_1823_ & 0x1000100) + (i_1822_ - i_1823_ & 0x10000);
				is[i_1766_] = i_1822_ - i_1824_ | i_1824_ - (i_1824_ >>> 8);
			} else if (i_1767_ == 2) {
				int i_1825_ = anIntArray11380[i];
				int i_1826_ = (i_1825_ & 0xff00ff) * anInt8904 & ~0xff00ff;
				int i_1827_ = (i_1825_ & 0xff00) * anInt8904 & 0xff0000;
				i_1825_ = ((i_1826_ | i_1827_) >>> 8) + anInt8911;
				int i_1828_ = is[i_1766_];
				int i_1829_ = i_1825_ + i_1828_;
				int i_1830_ = (i_1825_ & 0xff00ff) + (i_1828_ & 0xff00ff);
				i_1828_ = (i_1830_ & 0x1000100) + (i_1829_ - i_1830_ & 0x10000);
				is[i_1766_] = i_1829_ - i_1828_ | i_1828_ - (i_1828_ >>> 8);
			}
		} else
			throw new IllegalArgumentException();
	}
}
