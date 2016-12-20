/* Class147_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class147_Sub1_Sub1 extends Class147_Sub1 {
	int[] anIntArray11352;

	public void method2434(int i, int i_0_, int i_1_, int i_2_, int[] is, int i_3_, int i_4_) {
		i_4_ -= i_1_;
		for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
			int i_6_ = (i_0_ + i_5_) * i_1_ + i;
			for (int i_7_ = 0; i_7_ < i_1_; i_7_++)
				anIntArray11352[i_6_ + i_7_] = is[i_3_++];
			i_3_ += i_4_;
		}
	}

	Class147_Sub1_Sub1(Class180_Sub1 class180_sub1, int[] is, int i, int i_8_, int i_9_, int i_10_, boolean bool) {
		super(class180_sub1, i_9_, i_10_);
		if (bool)
			anIntArray11352 = new int[i_9_ * i_10_];
		else
			anIntArray11352 = is;
		i_8_ -= anInt8877;
		int i_11_ = 0;
		for (int i_12_ = 0; i_12_ < i_10_; i_12_++) {
			for (int i_13_ = 0; i_13_ < i_9_; i_13_++) {
				int i_14_ = is[i++];
				if (i_14_ >>> 24 == 255)
					anIntArray11352[i_11_++] = (i_14_ & 0xffffff) == 0 ? -16777215 : i_14_;
				else
					anIntArray11352[i_11_++] = 0;
			}
			i += i_8_;
		}
	}

	void method17918(int i, int i_15_, int[] is, int i_16_, int i_17_) {
		if (i_17_ == 0) {
			if (i_16_ == 1)
				is[i_15_] = anIntArray11352[i];
			else if (i_16_ == 0) {
				int i_18_ = anIntArray11352[i++];
				int i_19_ = (i_18_ & 0xff0000) * anInt8906 & ~0xffffff;
				int i_20_ = (i_18_ & 0xff00) * anInt8907 & 0xff0000;
				int i_21_ = (i_18_ & 0xff) * anInt8908 & 0xff00;
				is[i_15_] = (i_19_ | i_20_ | i_21_) >>> 8;
			} else if (i_16_ == 3) {
				int i_22_ = anIntArray11352[i++];
				int i_23_ = anInt8894;
				int i_24_ = i_22_ + i_23_;
				int i_25_ = (i_22_ & 0xff00ff) + (i_23_ & 0xff00ff);
				int i_26_ = (i_25_ & 0x1000100) + (i_24_ - i_25_ & 0x10000);
				is[i_15_] = i_24_ - i_26_ | i_26_ - (i_26_ >>> 8);
			} else if (i_16_ == 2) {
				int i_27_ = anIntArray11352[i];
				int i_28_ = (i_27_ & 0xff00ff) * anInt8904 & ~0xff00ff;
				int i_29_ = (i_27_ & 0xff00) * anInt8904 & 0xff0000;
				is[i_15_] = ((i_28_ | i_29_) >>> 8) + anInt8911;
			} else
				throw new IllegalArgumentException();
		} else if (i_17_ == 1) {
			if (i_16_ == 1) {
				int i_30_ = anIntArray11352[i];
				if (i_30_ != 0)
					is[i_15_] = i_30_;
			} else if (i_16_ == 0) {
				int i_31_ = anIntArray11352[i];
				if (i_31_ != 0) {
					if ((anInt8894 & 0xffffff) == 16777215) {
						int i_32_ = anInt8894 >>> 24;
						int i_33_ = 256 - i_32_;
						int i_34_ = is[i_15_];
						is[i_15_] = ((((i_31_ & 0xff00ff) * i_32_ + (i_34_ & 0xff00ff) * i_33_) & ~0xff00ff) + (((i_31_ & 0xff00) * i_32_ + (i_34_ & 0xff00) * i_33_) & 0xff0000)) >> 8;
					} else if (anInt8904 != 255) {
						int i_35_ = (i_31_ & 0xff0000) * anInt8906 & ~0xffffff;
						int i_36_ = (i_31_ & 0xff00) * anInt8907 & 0xff0000;
						int i_37_ = (i_31_ & 0xff) * anInt8908 & 0xff00;
						i_31_ = (i_35_ | i_36_ | i_37_) >>> 8;
						int i_38_ = is[i_15_];
						is[i_15_] = ((((i_31_ & 0xff00ff) * anInt8904 + (i_38_ & 0xff00ff) * anInt8905) & ~0xff00ff) + (((i_31_ & 0xff00) * anInt8904 + (i_38_ & 0xff00) * anInt8905) & 0xff0000)) >> 8;
					} else {
						int i_39_ = (i_31_ & 0xff0000) * anInt8906 & ~0xffffff;
						int i_40_ = (i_31_ & 0xff00) * anInt8907 & 0xff0000;
						int i_41_ = (i_31_ & 0xff) * anInt8908 & 0xff00;
						is[i_15_] = (i_39_ | i_40_ | i_41_) >>> 8;
					}
				}
			} else if (i_16_ == 3) {
				int i_42_ = anIntArray11352[i];
				int i_43_ = anInt8894;
				int i_44_ = i_42_ + i_43_;
				int i_45_ = (i_42_ & 0xff00ff) + (i_43_ & 0xff00ff);
				int i_46_ = (i_45_ & 0x1000100) + (i_44_ - i_45_ & 0x10000);
				i_46_ = i_44_ - i_46_ | i_46_ - (i_46_ >>> 8);
				if (i_42_ == 0 && anInt8904 != 255) {
					i_42_ = i_46_;
					i_46_ = is[i_15_];
					i_46_ = ((((i_42_ & 0xff00ff) * anInt8904 + (i_46_ & 0xff00ff) * anInt8905) & ~0xff00ff) + (((i_42_ & 0xff00) * anInt8904 + (i_46_ & 0xff00) * anInt8905) & 0xff0000)) >> 8;
				}
				is[i_15_] = i_46_;
			} else if (i_16_ == 2) {
				int i_47_ = anIntArray11352[i];
				if (i_47_ != 0) {
					int i_48_ = (i_47_ & 0xff00ff) * anInt8904 & ~0xff00ff;
					int i_49_ = (i_47_ & 0xff00) * anInt8904 & 0xff0000;
					is[i_15_++] = ((i_48_ | i_49_) >>> 8) + anInt8911;
				}
			} else
				throw new IllegalArgumentException();
		} else if (i_17_ == 2) {
			if (i_16_ == 1) {
				int i_50_ = anIntArray11352[i];
				if (i_50_ != 0) {
					int i_51_ = is[i_15_];
					int i_52_ = i_50_ + i_51_;
					int i_53_ = (i_50_ & 0xff00ff) + (i_51_ & 0xff00ff);
					i_51_ = (i_53_ & 0x1000100) + (i_52_ - i_53_ & 0x10000);
					is[i_15_] = i_52_ - i_51_ | i_51_ - (i_51_ >>> 8);
				}
			} else if (i_16_ == 0) {
				int i_54_ = anIntArray11352[i];
				if (i_54_ != 0) {
					int i_55_ = (i_54_ & 0xff0000) * anInt8906 & ~0xffffff;
					int i_56_ = (i_54_ & 0xff00) * anInt8907 & 0xff0000;
					int i_57_ = (i_54_ & 0xff) * anInt8908 & 0xff00;
					i_54_ = (i_55_ | i_56_ | i_57_) >>> 8;
					int i_58_ = is[i_15_];
					int i_59_ = i_54_ + i_58_;
					int i_60_ = (i_54_ & 0xff00ff) + (i_58_ & 0xff00ff);
					i_58_ = (i_60_ & 0x1000100) + (i_59_ - i_60_ & 0x10000);
					is[i_15_] = i_59_ - i_58_ | i_58_ - (i_58_ >>> 8);
				}
			} else if (i_16_ == 3) {
				int i_61_ = anIntArray11352[i];
				int i_62_ = anInt8894;
				int i_63_ = i_61_ + i_62_;
				int i_64_ = (i_61_ & 0xff00ff) + (i_62_ & 0xff00ff);
				int i_65_ = (i_64_ & 0x1000100) + (i_63_ - i_64_ & 0x10000);
				i_61_ = i_63_ - i_65_ | i_65_ - (i_65_ >>> 8);
				i_65_ = is[i_15_];
				i_63_ = i_61_ + i_65_;
				i_64_ = (i_61_ & 0xff00ff) + (i_65_ & 0xff00ff);
				i_65_ = (i_64_ & 0x1000100) + (i_63_ - i_64_ & 0x10000);
				is[i_15_] = i_63_ - i_65_ | i_65_ - (i_65_ >>> 8);
			} else if (i_16_ == 2) {
				int i_66_ = anIntArray11352[i];
				if (i_66_ != 0) {
					int i_67_ = (i_66_ & 0xff00ff) * anInt8904 & ~0xff00ff;
					int i_68_ = (i_66_ & 0xff00) * anInt8904 & 0xff0000;
					i_66_ = ((i_67_ | i_68_) >>> 8) + anInt8911;
					int i_69_ = is[i_15_];
					int i_70_ = i_66_ + i_69_;
					int i_71_ = (i_66_ & 0xff00ff) + (i_69_ & 0xff00ff);
					i_69_ = (i_71_ & 0x1000100) + (i_70_ - i_71_ & 0x10000);
					is[i_15_] = i_70_ - i_69_ | i_69_ - (i_69_ >>> 8);
				}
			}
		} else
			throw new IllegalArgumentException();
	}

	public void method2459(int i, int i_72_, int i_73_, int i_74_, int[] is, int i_75_, int i_76_) {
		i_76_ -= i_73_;
		for (int i_77_ = 0; i_77_ < i_74_; i_77_++) {
			int i_78_ = (i_72_ + i_77_) * i_73_ + i;
			for (int i_79_ = 0; i_79_ < i_73_; i_79_++)
				anIntArray11352[i_78_ + i_79_] = is[i_75_++];
			i_75_ += i_76_;
		}
	}

	void method17919(int i, int i_80_, int i_81_, int i_82_, int[] is, int i_83_, int i_84_) {
		i_84_ -= i_81_;
		for (int i_85_ = 0; i_85_ < i_82_; i_85_++) {
			int i_86_ = (i_80_ + i_85_) * i_81_ + i;
			for (int i_87_ = 0; i_87_ < i_81_; i_87_++)
				is[i_83_++] = anIntArray11352[i_86_ + i_87_];
			i_83_ += i_84_;
		}
	}

	public void method2412(int i, int i_88_, int i_89_, int i_90_, int[] is, int[] is_91_, int i_92_, int i_93_) {
		method17919(i, i_88_, i_89_, i_90_, is, i_92_, i_93_);
	}

	public void method2445(int i, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_) {
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is == null)
			throw new IllegalStateException("");
		for (int i_99_ = 0; i_99_ < i_96_; i_99_++) {
			int i_100_ = (i_94_ + i_99_) * anInt8877 + i;
			int i_101_ = ((i_98_ + i_99_) * (aClass180_Sub1_8876.anInt9387 * -1173855569) + i_97_);
			for (int i_102_ = 0; i_102_ < i_95_; i_102_++)
				anIntArray11352[i_100_ + i_102_] = is[i_101_ + i_102_];
		}
	}

	public void method2440(int i, int i_103_, int i_104_) {
		throw new IllegalStateException("");
	}

	public Interface21 method2462() {
		return new Class98(anInt8877, anInt8880, anIntArray11352);
	}

	public void method2416(int i, int i_105_, int i_106_, int i_107_, int i_108_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is != null) {
			int i_109_ = aClass180_Sub1_8876.anInt9387 * -1173855569;
			i += anInt8879;
			i_105_ += anInt8895;
			int i_110_ = i_105_ * i_109_ + i;
			int i_111_ = 0;
			int i_112_ = anInt8880;
			int i_113_ = anInt8877;
			int i_114_ = i_109_ - i_113_;
			int i_115_ = 0;
			if (i_105_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
				int i_116_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_105_;
				i_112_ -= i_116_;
				i_105_ = aClass180_Sub1_8876.anInt9392 * -456655989;
				i_111_ += i_116_ * i_113_;
				i_110_ += i_116_ * i_109_;
			}
			if (i_105_ + i_112_ > aClass180_Sub1_8876.anInt9393 * -383695469)
				i_112_ -= (i_105_ + i_112_ - aClass180_Sub1_8876.anInt9393 * -383695469);
			if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
				int i_117_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
				i_113_ -= i_117_;
				i = aClass180_Sub1_8876.anInt9383 * 1605202751;
				i_111_ += i_117_;
				i_110_ += i_117_;
				i_115_ += i_117_;
				i_114_ += i_117_;
			}
			if (i + i_113_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
				int i_118_ = i + i_113_ - aClass180_Sub1_8876.anInt9391 * 2014358275;
				i_113_ -= i_118_;
				i_115_ += i_118_;
				i_114_ += i_118_;
			}
			if (i_113_ > 0 && i_112_ > 0) {
				if (i_108_ == 0) {
					if (i_106_ == 1) {
						for (int i_119_ = -i_112_; i_119_ < 0; i_119_++) {
							int i_120_ = i_110_ + i_113_ - 3;
							while (i_110_ < i_120_) {
								is[i_110_++] = anIntArray11352[i_111_++];
								is[i_110_++] = anIntArray11352[i_111_++];
								is[i_110_++] = anIntArray11352[i_111_++];
								is[i_110_++] = anIntArray11352[i_111_++];
							}
							i_120_ += 3;
							while (i_110_ < i_120_)
								is[i_110_++] = anIntArray11352[i_111_++];
							i_110_ += i_114_;
							i_111_ += i_115_;
						}
					} else if (i_106_ == 0) {
						int i_121_ = (i_107_ & 0xff0000) >> 16;
						int i_122_ = (i_107_ & 0xff00) >> 8;
						int i_123_ = i_107_ & 0xff;
						for (int i_124_ = -i_112_; i_124_ < 0; i_124_++) {
							for (int i_125_ = -i_113_; i_125_ < 0; i_125_++) {
								int i_126_ = anIntArray11352[i_111_++];
								int i_127_ = (i_126_ & 0xff0000) * i_121_ & ~0xffffff;
								int i_128_ = (i_126_ & 0xff00) * i_122_ & 0xff0000;
								int i_129_ = (i_126_ & 0xff) * i_123_ & 0xff00;
								is[i_110_++] = (i_127_ | i_128_ | i_129_) >>> 8;
							}
							i_110_ += i_114_;
							i_111_ += i_115_;
						}
					} else if (i_106_ == 3) {
						for (int i_130_ = -i_112_; i_130_ < 0; i_130_++) {
							for (int i_131_ = -i_113_; i_131_ < 0; i_131_++) {
								int i_132_ = anIntArray11352[i_111_++];
								int i_133_ = i_132_ + i_107_;
								int i_134_ = ((i_132_ & 0xff00ff) + (i_107_ & 0xff00ff));
								int i_135_ = ((i_134_ & 0x1000100) + (i_133_ - i_134_ & 0x10000));
								is[i_110_++] = i_133_ - i_135_ | i_135_ - (i_135_ >>> 8);
							}
							i_110_ += i_114_;
							i_111_ += i_115_;
						}
					} else if (i_106_ == 2) {
						int i_136_ = i_107_ >>> 24;
						int i_137_ = 256 - i_136_;
						int i_138_ = (i_107_ & 0xff00ff) * i_137_ & ~0xff00ff;
						int i_139_ = (i_107_ & 0xff00) * i_137_ & 0xff0000;
						i_107_ = (i_138_ | i_139_) >>> 8;
						for (int i_140_ = -i_112_; i_140_ < 0; i_140_++) {
							for (int i_141_ = -i_113_; i_141_ < 0; i_141_++) {
								int i_142_ = anIntArray11352[i_111_++];
								i_138_ = (i_142_ & 0xff00ff) * i_136_ & ~0xff00ff;
								i_139_ = (i_142_ & 0xff00) * i_136_ & 0xff0000;
								is[i_110_++] = ((i_138_ | i_139_) >>> 8) + i_107_;
							}
							i_110_ += i_114_;
							i_111_ += i_115_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_108_ == 1) {
					if (i_106_ == 1) {
						for (int i_143_ = -i_112_; i_143_ < 0; i_143_++) {
							int i_144_ = i_110_ + i_113_ - 3;
							while (i_110_ < i_144_) {
								int i_145_ = anIntArray11352[i_111_++];
								if (i_145_ != 0)
									is[i_110_++] = i_145_;
								else
									i_110_++;
								i_145_ = anIntArray11352[i_111_++];
								if (i_145_ != 0)
									is[i_110_++] = i_145_;
								else
									i_110_++;
								i_145_ = anIntArray11352[i_111_++];
								if (i_145_ != 0)
									is[i_110_++] = i_145_;
								else
									i_110_++;
								i_145_ = anIntArray11352[i_111_++];
								if (i_145_ != 0)
									is[i_110_++] = i_145_;
								else
									i_110_++;
							}
							i_144_ += 3;
							while (i_110_ < i_144_) {
								int i_146_ = anIntArray11352[i_111_++];
								if (i_146_ != 0)
									is[i_110_++] = i_146_;
								else
									i_110_++;
							}
							i_110_ += i_114_;
							i_111_ += i_115_;
						}
					} else if (i_106_ == 0) {
						if ((i_107_ & 0xffffff) == 16777215) {
							int i_147_ = i_107_ >>> 24;
							int i_148_ = 256 - i_147_;
							for (int i_149_ = -i_112_; i_149_ < 0; i_149_++) {
								for (int i_150_ = -i_113_; i_150_ < 0; i_150_++) {
									int i_151_ = anIntArray11352[i_111_++];
									if (i_151_ != 0) {
										int i_152_ = is[i_110_];
										is[i_110_++] = ((((i_151_ & 0xff00ff) * i_147_ + ((i_152_ & 0xff00ff) * i_148_)) & ~0xff00ff) + (((i_151_ & 0xff00) * i_147_ + ((i_152_ & 0xff00) * i_148_)) & 0xff0000)) >> 8;
									} else
										i_110_++;
								}
								i_110_ += i_114_;
								i_111_ += i_115_;
							}
						} else {
							int i_153_ = (i_107_ & 0xff0000) >> 16;
							int i_154_ = (i_107_ & 0xff00) >> 8;
							int i_155_ = i_107_ & 0xff;
							int i_156_ = i_107_ >>> 24;
							int i_157_ = 256 - i_156_;
							for (int i_158_ = -i_112_; i_158_ < 0; i_158_++) {
								for (int i_159_ = -i_113_; i_159_ < 0; i_159_++) {
									int i_160_ = anIntArray11352[i_111_++];
									if (i_160_ != 0) {
										if (i_156_ != 255) {
											int i_161_ = ((i_160_ & 0xff0000) * i_153_ & ~0xffffff);
											int i_162_ = ((i_160_ & 0xff00) * i_154_ & 0xff0000);
											int i_163_ = ((i_160_ & 0xff) * i_155_ & 0xff00);
											i_160_ = (i_161_ | i_162_ | i_163_) >>> 8;
											int i_164_ = is[i_110_];
											is[i_110_++] = (((((i_160_ & 0xff00ff) * i_156_) + ((i_164_ & 0xff00ff) * i_157_)) & ~0xff00ff) + ((((i_160_ & 0xff00) * i_156_) + ((i_164_ & 0xff00) * i_157_)) & 0xff0000)) >> 8;
										} else {
											int i_165_ = ((i_160_ & 0xff0000) * i_153_ & ~0xffffff);
											int i_166_ = ((i_160_ & 0xff00) * i_154_ & 0xff0000);
											int i_167_ = ((i_160_ & 0xff) * i_155_ & 0xff00);
											is[i_110_++] = (i_165_ | i_166_ | i_167_) >>> 8;
										}
									} else
										i_110_++;
								}
								i_110_ += i_114_;
								i_111_ += i_115_;
							}
						}
					} else if (i_106_ == 3) {
						int i_168_ = i_107_ >>> 24;
						int i_169_ = 256 - i_168_;
						for (int i_170_ = -i_112_; i_170_ < 0; i_170_++) {
							for (int i_171_ = -i_113_; i_171_ < 0; i_171_++) {
								int i_172_ = anIntArray11352[i_111_++];
								int i_173_ = i_172_ + i_107_;
								int i_174_ = ((i_172_ & 0xff00ff) + (i_107_ & 0xff00ff));
								int i_175_ = ((i_174_ & 0x1000100) + (i_173_ - i_174_ & 0x10000));
								i_175_ = i_173_ - i_175_ | i_175_ - (i_175_ >>> 8);
								if (i_172_ == 0 && i_168_ != 255) {
									i_172_ = i_175_;
									i_175_ = is[i_110_];
									i_175_ = ((((i_172_ & 0xff00ff) * i_168_ + (i_175_ & 0xff00ff) * i_169_) & ~0xff00ff) + (((i_172_ & 0xff00) * i_168_ + (i_175_ & 0xff00) * i_169_) & 0xff0000)) >> 8;
								}
								is[i_110_++] = i_175_;
							}
							i_110_ += i_114_;
							i_111_ += i_115_;
						}
					} else if (i_106_ == 2) {
						int i_176_ = i_107_ >>> 24;
						int i_177_ = 256 - i_176_;
						int i_178_ = (i_107_ & 0xff00ff) * i_177_ & ~0xff00ff;
						int i_179_ = (i_107_ & 0xff00) * i_177_ & 0xff0000;
						i_107_ = (i_178_ | i_179_) >>> 8;
						for (int i_180_ = -i_112_; i_180_ < 0; i_180_++) {
							for (int i_181_ = -i_113_; i_181_ < 0; i_181_++) {
								int i_182_ = anIntArray11352[i_111_++];
								if (i_182_ != 0) {
									i_178_ = ((i_182_ & 0xff00ff) * i_176_ & ~0xff00ff);
									i_179_ = ((i_182_ & 0xff00) * i_176_ & 0xff0000);
									is[i_110_++] = ((i_178_ | i_179_) >>> 8) + i_107_;
								} else
									i_110_++;
							}
							i_110_ += i_114_;
							i_111_ += i_115_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_108_ == 2) {
					if (i_106_ == 1) {
						for (int i_183_ = -i_112_; i_183_ < 0; i_183_++) {
							for (int i_184_ = -i_113_; i_184_ < 0; i_184_++) {
								int i_185_ = anIntArray11352[i_111_++];
								if (i_185_ != 0) {
									int i_186_ = is[i_110_];
									int i_187_ = i_185_ + i_186_;
									int i_188_ = ((i_185_ & 0xff00ff) + (i_186_ & 0xff00ff));
									i_186_ = ((i_188_ & 0x1000100) + (i_187_ - i_188_ & 0x10000));
									is[i_110_++] = i_187_ - i_186_ | i_186_ - (i_186_ >>> 8);
								} else
									i_110_++;
							}
							i_110_ += i_114_;
							i_111_ += i_115_;
						}
					} else if (i_106_ == 0) {
						int i_189_ = (i_107_ & 0xff0000) >> 16;
						int i_190_ = (i_107_ & 0xff00) >> 8;
						int i_191_ = i_107_ & 0xff;
						for (int i_192_ = -i_112_; i_192_ < 0; i_192_++) {
							for (int i_193_ = -i_113_; i_193_ < 0; i_193_++) {
								int i_194_ = anIntArray11352[i_111_++];
								if (i_194_ != 0) {
									int i_195_ = ((i_194_ & 0xff0000) * i_189_ & ~0xffffff);
									int i_196_ = ((i_194_ & 0xff00) * i_190_ & 0xff0000);
									int i_197_ = (i_194_ & 0xff) * i_191_ & 0xff00;
									i_194_ = (i_195_ | i_196_ | i_197_) >>> 8;
									int i_198_ = is[i_110_];
									int i_199_ = i_194_ + i_198_;
									int i_200_ = ((i_194_ & 0xff00ff) + (i_198_ & 0xff00ff));
									i_198_ = ((i_200_ & 0x1000100) + (i_199_ - i_200_ & 0x10000));
									is[i_110_++] = i_199_ - i_198_ | i_198_ - (i_198_ >>> 8);
								} else
									i_110_++;
							}
							i_110_ += i_114_;
							i_111_ += i_115_;
						}
					} else if (i_106_ == 3) {
						for (int i_201_ = -i_112_; i_201_ < 0; i_201_++) {
							for (int i_202_ = -i_113_; i_202_ < 0; i_202_++) {
								int i_203_ = anIntArray11352[i_111_++];
								int i_204_ = i_203_ + i_107_;
								int i_205_ = ((i_203_ & 0xff00ff) + (i_107_ & 0xff00ff));
								int i_206_ = ((i_205_ & 0x1000100) + (i_204_ - i_205_ & 0x10000));
								i_203_ = i_204_ - i_206_ | i_206_ - (i_206_ >>> 8);
								i_206_ = is[i_110_];
								i_204_ = i_203_ + i_206_;
								i_205_ = (i_203_ & 0xff00ff) + (i_206_ & 0xff00ff);
								i_206_ = (i_205_ & 0x1000100) + (i_204_ - i_205_ & 0x10000);
								is[i_110_++] = i_204_ - i_206_ | i_206_ - (i_206_ >>> 8);
							}
							i_110_ += i_114_;
							i_111_ += i_115_;
						}
					} else if (i_106_ == 2) {
						int i_207_ = i_107_ >>> 24;
						int i_208_ = 256 - i_207_;
						int i_209_ = (i_107_ & 0xff00ff) * i_208_ & ~0xff00ff;
						int i_210_ = (i_107_ & 0xff00) * i_208_ & 0xff0000;
						i_107_ = (i_209_ | i_210_) >>> 8;
						for (int i_211_ = -i_112_; i_211_ < 0; i_211_++) {
							for (int i_212_ = -i_113_; i_212_ < 0; i_212_++) {
								int i_213_ = anIntArray11352[i_111_++];
								if (i_213_ != 0) {
									i_209_ = ((i_213_ & 0xff00ff) * i_207_ & ~0xff00ff);
									i_210_ = ((i_213_ & 0xff00) * i_207_ & 0xff0000);
									i_213_ = ((i_209_ | i_210_) >>> 8) + i_107_;
									int i_214_ = is[i_110_];
									int i_215_ = i_213_ + i_214_;
									int i_216_ = ((i_213_ & 0xff00ff) + (i_214_ & 0xff00ff));
									i_214_ = ((i_216_ & 0x1000100) + (i_215_ - i_216_ & 0x10000));
									is[i_110_++] = i_215_ - i_214_ | i_214_ - (i_214_ >>> 8);
								} else
									i_110_++;
							}
							i_110_ += i_114_;
							i_111_ += i_115_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2486(int i, int i_217_, int i_218_) {
		throw new IllegalStateException("");
	}

	public void method2438(int i, int i_219_, Class142 class142, int i_220_, int i_221_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is != null) {
			i += anInt8879;
			i_219_ += anInt8895;
			int i_222_ = 0;
			int i_223_ = aClass180_Sub1_8876.anInt9387 * -1173855569;
			int i_224_ = anInt8877;
			int i_225_ = anInt8880;
			int i_226_ = i_223_ - i_224_;
			int i_227_ = 0;
			int i_228_ = i + i_219_ * i_223_;
			if (i_219_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
				int i_229_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_219_;
				i_225_ -= i_229_;
				i_219_ = aClass180_Sub1_8876.anInt9392 * -456655989;
				i_222_ += i_229_ * i_224_;
				i_228_ += i_229_ * i_223_;
			}
			if (i_219_ + i_225_ > aClass180_Sub1_8876.anInt9393 * -383695469)
				i_225_ -= (i_219_ + i_225_ - aClass180_Sub1_8876.anInt9393 * -383695469);
			if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
				int i_230_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
				i_224_ -= i_230_;
				i = aClass180_Sub1_8876.anInt9383 * 1605202751;
				i_222_ += i_230_;
				i_228_ += i_230_;
				i_227_ += i_230_;
				i_226_ += i_230_;
			}
			if (i + i_224_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
				int i_231_ = i + i_224_ - aClass180_Sub1_8876.anInt9391 * 2014358275;
				i_224_ -= i_231_;
				i_227_ += i_231_;
				i_226_ += i_231_;
			}
			if (i_224_ > 0 && i_225_ > 0) {
				Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
				int[] is_232_ = class142_sub1.anIntArray9002;
				int[] is_233_ = class142_sub1.anIntArray9003;
				int i_234_ = i_219_;
				if (i_221_ > i_234_) {
					i_234_ = i_221_;
					i_228_ += (i_221_ - i_219_) * i_223_;
					i_222_ += (i_221_ - i_219_) * anInt8877;
				}
				int i_235_ = (i_221_ + is_232_.length < i_219_ + i_225_ ? i_221_ + is_232_.length : i_219_ + i_225_);
				for (int i_236_ = i_234_; i_236_ < i_235_; i_236_++) {
					int i_237_ = is_232_[i_236_ - i_221_] + i_220_;
					int i_238_ = is_233_[i_236_ - i_221_];
					int i_239_ = i_224_;
					if (i > i_237_) {
						int i_240_ = i - i_237_;
						if (i_240_ >= i_238_) {
							i_222_ += i_224_ + i_227_;
							i_228_ += i_224_ + i_226_;
							continue;
						}
						i_238_ -= i_240_;
					} else {
						int i_241_ = i_237_ - i;
						if (i_241_ >= i_224_) {
							i_222_ += i_224_ + i_227_;
							i_228_ += i_224_ + i_226_;
							continue;
						}
						i_222_ += i_241_;
						i_239_ -= i_241_;
						i_228_ += i_241_;
					}
					int i_242_ = 0;
					if (i_239_ < i_238_)
						i_238_ = i_239_;
					else
						i_242_ = i_239_ - i_238_;
					for (int i_243_ = -i_238_; i_243_ < 0; i_243_++) {
						int i_244_ = anIntArray11352[i_222_++];
						if (i_244_ != 0)
							is[i_228_++] = i_244_;
						else
							i_228_++;
					}
					i_222_ += i_242_ + i_227_;
					i_228_ += i_242_ + i_226_;
				}
			}
		}
	}

	void method14430(boolean bool, boolean bool_245_, boolean bool_246_, int i, int i_247_, float f, int i_248_, int i_249_, int i_250_, int i_251_, int i_252_, int i_253_, boolean bool_254_) {
		if (i_248_ > 0 && i_249_ > 0 && (bool || bool_245_)) {
			int i_255_ = 0;
			int i_256_ = 0;
			int i_257_ = anInt8879 + anInt8877 + anInt8878;
			int i_258_ = anInt8895 + anInt8880 + anInt8882;
			int i_259_ = (i_257_ << 16) / i_248_;
			int i_260_ = (i_258_ << 16) / i_249_;
			if (anInt8879 > 0) {
				int i_261_ = ((anInt8879 << 16) + i_259_ - 1) / i_259_;
				i += i_261_;
				i_255_ += i_261_ * i_259_ - (anInt8879 << 16);
			}
			if (anInt8895 > 0) {
				int i_262_ = ((anInt8895 << 16) + i_260_ - 1) / i_260_;
				i_247_ += i_262_;
				i_256_ += i_262_ * i_260_ - (anInt8895 << 16);
			}
			if (anInt8877 < i_257_)
				i_248_ = ((anInt8877 << 16) - i_255_ + i_259_ - 1) / i_259_;
			if (anInt8880 < i_258_)
				i_249_ = ((anInt8880 << 16) - i_256_ + i_260_ - 1) / i_260_;
			int i_263_ = i + i_247_ * (aClass180_Sub1_8876.anInt9387 * -1173855569);
			int i_264_ = aClass180_Sub1_8876.anInt9387 * -1173855569 - i_248_;
			if (i_247_ + i_249_ > aClass180_Sub1_8876.anInt9393 * -383695469)
				i_249_ -= (i_247_ + i_249_ - aClass180_Sub1_8876.anInt9393 * -383695469);
			if (i_247_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
				int i_265_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_247_;
				i_249_ -= i_265_;
				i_263_ += i_265_ * (aClass180_Sub1_8876.anInt9387 * -1173855569);
				i_256_ += i_260_ * i_265_;
			}
			if (i + i_248_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
				int i_266_ = i + i_248_ - aClass180_Sub1_8876.anInt9391 * 2014358275;
				i_248_ -= i_266_;
				i_264_ += i_266_;
			}
			if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
				int i_267_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
				i_248_ -= i_267_;
				i_263_ += i_267_;
				i_255_ += i_259_ * i_267_;
				i_264_ += i_267_;
			}
			float[] fs = aClass180_Sub1_8876.aFloatArray9389;
			int[] is = aClass180_Sub1_8876.anIntArray9386;
			if (i_252_ == 0) {
				if (i_250_ == 1) {
					int i_268_ = i_255_;
					for (int i_269_ = -i_249_; i_269_ < 0; i_269_++) {
						int i_270_ = (i_256_ >> 16) * anInt8877;
						for (int i_271_ = -i_248_; i_271_ < 0; i_271_++) {
							if (!bool_245_ || f < fs[i_263_]) {
								if (bool)
									is[i_263_] = (anIntArray11352[(i_255_ >> 16) + i_270_]);
								if (bool_245_ && bool_254_)
									fs[i_263_] = f;
							}
							i_255_ += i_259_;
							i_263_++;
						}
						i_256_ += i_260_;
						i_255_ = i_268_;
						i_263_ += i_264_;
					}
				} else if (i_250_ == 0) {
					int i_272_ = (i_251_ & 0xff0000) >> 16;
					int i_273_ = (i_251_ & 0xff00) >> 8;
					int i_274_ = i_251_ & 0xff;
					int i_275_ = i_255_;
					for (int i_276_ = -i_249_; i_276_ < 0; i_276_++) {
						int i_277_ = (i_256_ >> 16) * anInt8877;
						for (int i_278_ = -i_248_; i_278_ < 0; i_278_++) {
							if (!bool_245_ || f < fs[i_263_]) {
								if (bool) {
									int i_279_ = (anIntArray11352[(i_255_ >> 16) + i_277_]);
									int i_280_ = ((i_279_ & 0xff0000) * i_272_ & ~0xffffff);
									int i_281_ = ((i_279_ & 0xff00) * i_273_ & 0xff0000);
									int i_282_ = (i_279_ & 0xff) * i_274_ & 0xff00;
									is[i_263_] = (i_280_ | i_281_ | i_282_) >>> 8;
								}
								if (bool_245_ && bool_254_)
									fs[i_263_] = f;
							}
							i_255_ += i_259_;
							i_263_++;
						}
						i_256_ += i_260_;
						i_255_ = i_275_;
						i_263_ += i_264_;
					}
				} else if (i_250_ == 3) {
					int i_283_ = i_255_;
					for (int i_284_ = -i_249_; i_284_ < 0; i_284_++) {
						int i_285_ = (i_256_ >> 16) * anInt8877;
						for (int i_286_ = -i_248_; i_286_ < 0; i_286_++) {
							if (!bool_245_ || f < fs[i_263_]) {
								if (bool) {
									int i_287_ = (anIntArray11352[(i_255_ >> 16) + i_285_]);
									int i_288_ = i_287_ + i_251_;
									int i_289_ = ((i_287_ & 0xff00ff) + (i_251_ & 0xff00ff));
									int i_290_ = ((i_289_ & 0x1000100) + (i_288_ - i_289_ & 0x10000));
									is[i_263_] = i_288_ - i_290_ | i_290_ - (i_290_ >>> 8);
								}
								if (bool_245_ && bool_254_)
									fs[i_263_] = f;
							}
							i_255_ += i_259_;
							i_263_++;
						}
						i_256_ += i_260_;
						i_255_ = i_283_;
						i_263_ += i_264_;
					}
				} else if (i_250_ == 2) {
					int i_291_ = i_251_ >>> 24;
					int i_292_ = 256 - i_291_;
					int i_293_ = (i_251_ & 0xff00ff) * i_292_ & ~0xff00ff;
					int i_294_ = (i_251_ & 0xff00) * i_292_ & 0xff0000;
					i_251_ = (i_293_ | i_294_) >>> 8;
					int i_295_ = i_255_;
					for (int i_296_ = -i_249_; i_296_ < 0; i_296_++) {
						int i_297_ = (i_256_ >> 16) * anInt8877;
						for (int i_298_ = -i_248_; i_298_ < 0; i_298_++) {
							if (!bool_245_ || f < fs[i_263_]) {
								if (bool) {
									int i_299_ = (anIntArray11352[(i_255_ >> 16) + i_297_]);
									i_293_ = ((i_299_ & 0xff00ff) * i_291_ & ~0xff00ff);
									i_294_ = ((i_299_ & 0xff00) * i_291_ & 0xff0000);
									is[i_263_] = ((i_293_ | i_294_) >>> 8) + i_251_;
								}
								if (bool_245_ && bool_254_)
									fs[i_263_] = f;
							}
							i_255_ += i_259_;
							i_263_++;
						}
						i_256_ += i_260_;
						i_255_ = i_295_;
						i_263_ += i_264_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_252_ == 1) {
				if (i_250_ == 1) {
					int i_300_ = i_255_;
					for (int i_301_ = -i_249_; i_301_ < 0; i_301_++) {
						int i_302_ = (i_256_ >> 16) * anInt8877;
						for (int i_303_ = -i_248_; i_303_ < 0; i_303_++) {
							if (!bool_245_ || f < fs[i_263_]) {
								int i_304_ = anIntArray11352[(i_255_ >> 16) + i_302_];
								if (i_304_ != 0) {
									if (bool)
										is[i_263_] = i_304_;
									if (bool_245_ && bool_254_)
										fs[i_263_] = f;
								}
							}
							i_255_ += i_259_;
							i_263_++;
						}
						i_256_ += i_260_;
						i_255_ = i_300_;
						i_263_ += i_264_;
					}
				} else if (i_250_ == 0) {
					int i_305_ = i_255_;
					if ((i_251_ & 0xffffff) == 16777215) {
						int i_306_ = i_251_ >>> 24;
						int i_307_ = 256 - i_306_;
						for (int i_308_ = -i_249_; i_308_ < 0; i_308_++) {
							int i_309_ = (i_256_ >> 16) * anInt8877;
							for (int i_310_ = -i_248_; i_310_ < 0; i_310_++) {
								if (!bool_245_ || f < fs[i_263_]) {
									int i_311_ = (anIntArray11352[(i_255_ >> 16) + i_309_]);
									if (i_311_ != 0) {
										if (bool) {
											int i_312_ = is[i_263_];
											is[i_263_] = (((((i_311_ & 0xff00ff) * i_306_) + ((i_312_ & 0xff00ff) * i_307_)) & ~0xff00ff) + ((((i_311_ & 0xff00) * i_306_) + ((i_312_ & 0xff00) * i_307_)) & 0xff0000)) >> 8;
										}
										if (bool_245_ && bool_254_)
											fs[i_263_] = f;
									}
								}
								i_255_ += i_259_;
								i_263_++;
							}
							i_256_ += i_260_;
							i_255_ = i_305_;
							i_263_ += i_264_;
						}
					} else {
						int i_313_ = (i_251_ & 0xff0000) >> 16;
						int i_314_ = (i_251_ & 0xff00) >> 8;
						int i_315_ = i_251_ & 0xff;
						int i_316_ = i_251_ >>> 24;
						int i_317_ = 256 - i_316_;
						for (int i_318_ = -i_249_; i_318_ < 0; i_318_++) {
							int i_319_ = (i_256_ >> 16) * anInt8877;
							for (int i_320_ = -i_248_; i_320_ < 0; i_320_++) {
								if (!bool_245_ || f < fs[i_263_]) {
									int i_321_ = (anIntArray11352[(i_255_ >> 16) + i_319_]);
									if (i_321_ != 0) {
										if (i_316_ != 255) {
											if (bool) {
												int i_322_ = (((i_321_ & 0xff0000) * i_313_) & ~0xffffff);
												int i_323_ = (((i_321_ & 0xff00) * i_314_) & 0xff0000);
												int i_324_ = ((i_321_ & 0xff) * i_315_ & 0xff00);
												i_321_ = (i_322_ | i_323_ | i_324_) >>> 8;
												int i_325_ = is[i_263_];
												is[i_263_] = (((((i_321_ & 0xff00ff) * i_316_) + ((i_325_ & 0xff00ff) * i_317_)) & ~0xff00ff) + ((((i_321_ & 0xff00) * i_316_) + ((i_325_ & 0xff00) * i_317_)) & 0xff0000)) >> 8;
											}
											if (bool_245_ && bool_254_)
												fs[i_263_] = f;
										} else {
											if (bool) {
												int i_326_ = (((i_321_ & 0xff0000) * i_313_) & ~0xffffff);
												int i_327_ = (((i_321_ & 0xff00) * i_314_) & 0xff0000);
												int i_328_ = ((i_321_ & 0xff) * i_315_ & 0xff00);
												is[i_263_] = (i_326_ | i_327_ | i_328_) >>> 8;
											}
											if (bool_245_ && bool_254_)
												fs[i_263_] = f;
										}
									}
								}
								i_255_ += i_259_;
								i_263_++;
							}
							i_256_ += i_260_;
							i_255_ = i_305_;
							i_263_ += i_264_;
						}
					}
				} else if (i_250_ == 3) {
					int i_329_ = i_255_;
					int i_330_ = i_251_ >>> 24;
					int i_331_ = 256 - i_330_;
					for (int i_332_ = -i_249_; i_332_ < 0; i_332_++) {
						int i_333_ = (i_256_ >> 16) * anInt8877;
						for (int i_334_ = -i_248_; i_334_ < 0; i_334_++) {
							if (!bool_245_ || f < fs[i_263_]) {
								if (bool) {
									int i_335_ = (anIntArray11352[(i_255_ >> 16) + i_333_]);
									int i_336_ = i_335_ + i_251_;
									int i_337_ = ((i_335_ & 0xff00ff) + (i_251_ & 0xff00ff));
									int i_338_ = ((i_337_ & 0x1000100) + (i_336_ - i_337_ & 0x10000));
									i_338_ = i_336_ - i_338_ | i_338_ - (i_338_ >>> 8);
									if (i_335_ == 0 && i_330_ != 255) {
										i_335_ = i_338_;
										i_338_ = is[i_263_];
										i_338_ = ((((i_335_ & 0xff00ff) * i_330_ + ((i_338_ & 0xff00ff) * i_331_)) & ~0xff00ff) + (((i_335_ & 0xff00) * i_330_ + ((i_338_ & 0xff00) * i_331_)) & 0xff0000)) >> 8;
									}
									is[i_263_] = i_338_;
								}
								if (bool_245_ && bool_254_)
									fs[i_263_] = f;
							}
							i_255_ += i_259_;
							i_263_++;
						}
						i_256_ += i_260_;
						i_255_ = i_329_;
						i_263_ += i_264_;
					}
				} else if (i_250_ == 2) {
					int i_339_ = i_251_ >>> 24;
					int i_340_ = 256 - i_339_;
					int i_341_ = (i_251_ & 0xff00ff) * i_340_ & ~0xff00ff;
					int i_342_ = (i_251_ & 0xff00) * i_340_ & 0xff0000;
					i_251_ = (i_341_ | i_342_) >>> 8;
					int i_343_ = i_255_;
					for (int i_344_ = -i_249_; i_344_ < 0; i_344_++) {
						int i_345_ = (i_256_ >> 16) * anInt8877;
						for (int i_346_ = -i_248_; i_346_ < 0; i_346_++) {
							if (!bool_245_ || f < fs[i_263_]) {
								int i_347_ = anIntArray11352[(i_255_ >> 16) + i_345_];
								if (i_347_ != 0) {
									if (bool) {
										i_341_ = ((i_347_ & 0xff00ff) * i_339_ & ~0xff00ff);
										i_342_ = ((i_347_ & 0xff00) * i_339_ & 0xff0000);
										is[i_263_] = (((i_341_ | i_342_) >>> 8) + i_251_);
									}
									if (bool_245_ && bool_254_)
										fs[i_263_] = f;
								}
							}
							i_255_ += i_259_;
							i_263_++;
						}
						i_256_ += i_260_;
						i_255_ = i_343_;
						i_263_ += i_264_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_252_ == 2) {
				if (i_250_ == 1) {
					int i_348_ = i_255_;
					for (int i_349_ = -i_249_; i_349_ < 0; i_349_++) {
						int i_350_ = (i_256_ >> 16) * anInt8877;
						for (int i_351_ = -i_248_; i_351_ < 0; i_351_++) {
							if (!bool_245_ || f < fs[i_263_]) {
								int i_352_ = anIntArray11352[(i_255_ >> 16) + i_350_];
								if (i_352_ != 0) {
									if (bool) {
										int i_353_ = is[i_263_];
										int i_354_ = i_352_ + i_353_;
										int i_355_ = ((i_352_ & 0xff00ff) + (i_353_ & 0xff00ff));
										i_353_ = ((i_355_ & 0x1000100) + (i_354_ - i_355_ & 0x10000));
										is[i_263_] = (i_354_ - i_353_ | i_353_ - (i_353_ >>> 8));
									}
									if (bool_245_ && bool_254_)
										fs[i_263_] = f;
								}
							}
							i_255_ += i_259_;
							i_263_++;
						}
						i_256_ += i_260_;
						i_255_ = i_348_;
						i_263_ += i_264_;
					}
				} else if (i_250_ == 0) {
					int i_356_ = i_255_;
					int i_357_ = (i_251_ & 0xff0000) >> 16;
					int i_358_ = (i_251_ & 0xff00) >> 8;
					int i_359_ = i_251_ & 0xff;
					for (int i_360_ = -i_249_; i_360_ < 0; i_360_++) {
						int i_361_ = (i_256_ >> 16) * anInt8877;
						for (int i_362_ = -i_248_; i_362_ < 0; i_362_++) {
							if (!bool_245_ || f < fs[i_263_]) {
								int i_363_ = anIntArray11352[(i_255_ >> 16) + i_361_];
								if (i_363_ != 0) {
									if (bool) {
										int i_364_ = ((i_363_ & 0xff0000) * i_357_ & ~0xffffff);
										int i_365_ = ((i_363_ & 0xff00) * i_358_ & 0xff0000);
										int i_366_ = ((i_363_ & 0xff) * i_359_ & 0xff00);
										i_363_ = (i_364_ | i_365_ | i_366_) >>> 8;
										int i_367_ = is[i_263_];
										int i_368_ = i_363_ + i_367_;
										int i_369_ = ((i_363_ & 0xff00ff) + (i_367_ & 0xff00ff));
										i_367_ = ((i_369_ & 0x1000100) + (i_368_ - i_369_ & 0x10000));
										is[i_263_] = (i_368_ - i_367_ | i_367_ - (i_367_ >>> 8));
									}
									if (bool_245_ && bool_254_)
										fs[i_263_] = f;
								}
							}
							i_255_ += i_259_;
							i_263_++;
						}
						i_256_ += i_260_;
						i_255_ = i_356_;
						i_263_ += i_264_;
					}
				} else if (i_250_ == 3) {
					int i_370_ = i_255_;
					for (int i_371_ = -i_249_; i_371_ < 0; i_371_++) {
						int i_372_ = (i_256_ >> 16) * anInt8877;
						for (int i_373_ = -i_248_; i_373_ < 0; i_373_++) {
							if (!bool_245_ || f < fs[i_263_]) {
								if (bool) {
									int i_374_ = (anIntArray11352[(i_255_ >> 16) + i_372_]);
									int i_375_ = i_374_ + i_251_;
									int i_376_ = ((i_374_ & 0xff00ff) + (i_251_ & 0xff00ff));
									int i_377_ = ((i_376_ & 0x1000100) + (i_375_ - i_376_ & 0x10000));
									i_374_ = i_375_ - i_377_ | i_377_ - (i_377_ >>> 8);
									i_377_ = is[i_263_];
									i_375_ = i_374_ + i_377_;
									i_376_ = (i_374_ & 0xff00ff) + (i_377_ & 0xff00ff);
									i_377_ = ((i_376_ & 0x1000100) + (i_375_ - i_376_ & 0x10000));
									is[i_263_] = i_375_ - i_377_ | i_377_ - (i_377_ >>> 8);
								}
								if (bool_245_ && bool_254_)
									fs[i_263_] = f;
							}
							i_255_ += i_259_;
							i_263_++;
						}
						i_256_ += i_260_;
						i_255_ = i_370_;
						i_263_ += i_264_;
					}
				} else if (i_250_ == 2) {
					int i_378_ = i_251_ >>> 24;
					int i_379_ = 256 - i_378_;
					int i_380_ = (i_251_ & 0xff00ff) * i_379_ & ~0xff00ff;
					int i_381_ = (i_251_ & 0xff00) * i_379_ & 0xff0000;
					i_251_ = (i_380_ | i_381_) >>> 8;
					int i_382_ = i_255_;
					for (int i_383_ = -i_249_; i_383_ < 0; i_383_++) {
						int i_384_ = (i_256_ >> 16) * anInt8877;
						for (int i_385_ = -i_248_; i_385_ < 0; i_385_++) {
							if (!bool_245_ || f < fs[i_263_]) {
								int i_386_ = anIntArray11352[(i_255_ >> 16) + i_384_];
								if (i_386_ != 0) {
									if (bool) {
										i_380_ = ((i_386_ & 0xff00ff) * i_378_ & ~0xff00ff);
										i_381_ = ((i_386_ & 0xff00) * i_378_ & 0xff0000);
										i_386_ = (((i_380_ | i_381_) >>> 8) + i_251_);
										int i_387_ = is[i_263_];
										int i_388_ = i_386_ + i_387_;
										int i_389_ = ((i_386_ & 0xff00ff) + (i_387_ & 0xff00ff));
										i_387_ = ((i_389_ & 0x1000100) + (i_388_ - i_389_ & 0x10000));
										is[i_263_] = (i_388_ - i_387_ | i_387_ - (i_387_ >>> 8));
									}
									if (bool_245_ && bool_254_)
										fs[i_263_] = f;
								}
							}
							i_255_ += i_259_;
							i_263_++;
						}
						i_256_ += i_260_;
						i_255_ = i_382_;
						i_263_ += i_264_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method2439(int i, int i_390_, int i_391_, int i_392_, int i_393_, int i_394_, int i_395_, int i_396_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		if (i_391_ > 0 && i_392_ > 0) {
			int[] is = aClass180_Sub1_8876.anIntArray9386;
			if (is != null) {
				int i_397_ = 0;
				int i_398_ = 0;
				int i_399_ = aClass180_Sub1_8876.anInt9387 * -1173855569;
				int i_400_ = anInt8879 + anInt8877 + anInt8878;
				int i_401_ = anInt8895 + anInt8880 + anInt8882;
				int i_402_ = (i_400_ << 16) / i_391_;
				int i_403_ = (i_401_ << 16) / i_392_;
				if (anInt8879 > 0) {
					int i_404_ = ((anInt8879 << 16) + i_402_ - 1) / i_402_;
					i += i_404_;
					i_397_ += i_404_ * i_402_ - (anInt8879 << 16);
				}
				if (anInt8895 > 0) {
					int i_405_ = ((anInt8895 << 16) + i_403_ - 1) / i_403_;
					i_390_ += i_405_;
					i_398_ += i_405_ * i_403_ - (anInt8895 << 16);
				}
				if (anInt8877 < i_400_)
					i_391_ = ((anInt8877 << 16) - i_397_ + i_402_ - 1) / i_402_;
				if (anInt8880 < i_401_)
					i_392_ = ((anInt8880 << 16) - i_398_ + i_403_ - 1) / i_403_;
				int i_406_ = i + i_390_ * i_399_;
				int i_407_ = i_399_ - i_391_;
				if (i_390_ + i_392_ > aClass180_Sub1_8876.anInt9393 * -383695469)
					i_392_ -= (i_390_ + i_392_ - aClass180_Sub1_8876.anInt9393 * -383695469);
				if (i_390_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
					int i_408_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_390_;
					i_392_ -= i_408_;
					i_406_ += i_408_ * i_399_;
					i_398_ += i_403_ * i_408_;
				}
				if (i + i_391_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
					int i_409_ = (i + i_391_ - aClass180_Sub1_8876.anInt9391 * 2014358275);
					i_391_ -= i_409_;
					i_407_ += i_409_;
				}
				if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
					int i_410_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
					i_391_ -= i_410_;
					i_406_ += i_410_;
					i_397_ += i_402_ * i_410_;
					i_407_ += i_410_;
				}
				if (i_395_ == 0) {
					if (i_393_ == 1) {
						int i_411_ = i_397_;
						for (int i_412_ = -i_392_; i_412_ < 0; i_412_++) {
							int i_413_ = (i_398_ >> 16) * anInt8877;
							for (int i_414_ = -i_391_; i_414_ < 0; i_414_++) {
								is[i_406_++] = anIntArray11352[(i_397_ >> 16) + i_413_];
								i_397_ += i_402_;
							}
							i_398_ += i_403_;
							i_397_ = i_411_;
							i_406_ += i_407_;
						}
					} else if (i_393_ == 0) {
						int i_415_ = (i_394_ & 0xff0000) >> 16;
						int i_416_ = (i_394_ & 0xff00) >> 8;
						int i_417_ = i_394_ & 0xff;
						int i_418_ = i_397_;
						for (int i_419_ = -i_392_; i_419_ < 0; i_419_++) {
							int i_420_ = (i_398_ >> 16) * anInt8877;
							for (int i_421_ = -i_391_; i_421_ < 0; i_421_++) {
								int i_422_ = anIntArray11352[(i_397_ >> 16) + i_420_];
								int i_423_ = (i_422_ & 0xff0000) * i_415_ & ~0xffffff;
								int i_424_ = (i_422_ & 0xff00) * i_416_ & 0xff0000;
								int i_425_ = (i_422_ & 0xff) * i_417_ & 0xff00;
								is[i_406_++] = (i_423_ | i_424_ | i_425_) >>> 8;
								i_397_ += i_402_;
							}
							i_398_ += i_403_;
							i_397_ = i_418_;
							i_406_ += i_407_;
						}
					} else if (i_393_ == 3) {
						int i_426_ = i_397_;
						for (int i_427_ = -i_392_; i_427_ < 0; i_427_++) {
							int i_428_ = (i_398_ >> 16) * anInt8877;
							for (int i_429_ = -i_391_; i_429_ < 0; i_429_++) {
								int i_430_ = anIntArray11352[(i_397_ >> 16) + i_428_];
								int i_431_ = i_430_ + i_394_;
								int i_432_ = ((i_430_ & 0xff00ff) + (i_394_ & 0xff00ff));
								int i_433_ = ((i_432_ & 0x1000100) + (i_431_ - i_432_ & 0x10000));
								is[i_406_++] = i_431_ - i_433_ | i_433_ - (i_433_ >>> 8);
								i_397_ += i_402_;
							}
							i_398_ += i_403_;
							i_397_ = i_426_;
							i_406_ += i_407_;
						}
					} else if (i_393_ == 2) {
						int i_434_ = i_394_ >>> 24;
						int i_435_ = 256 - i_434_;
						int i_436_ = (i_394_ & 0xff00ff) * i_435_ & ~0xff00ff;
						int i_437_ = (i_394_ & 0xff00) * i_435_ & 0xff0000;
						i_394_ = (i_436_ | i_437_) >>> 8;
						int i_438_ = i_397_;
						for (int i_439_ = -i_392_; i_439_ < 0; i_439_++) {
							int i_440_ = (i_398_ >> 16) * anInt8877;
							for (int i_441_ = -i_391_; i_441_ < 0; i_441_++) {
								int i_442_ = anIntArray11352[(i_397_ >> 16) + i_440_];
								i_436_ = (i_442_ & 0xff00ff) * i_434_ & ~0xff00ff;
								i_437_ = (i_442_ & 0xff00) * i_434_ & 0xff0000;
								is[i_406_++] = ((i_436_ | i_437_) >>> 8) + i_394_;
								i_397_ += i_402_;
							}
							i_398_ += i_403_;
							i_397_ = i_438_;
							i_406_ += i_407_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_395_ == 1) {
					if (i_393_ == 1) {
						int i_443_ = i_397_;
						for (int i_444_ = -i_392_; i_444_ < 0; i_444_++) {
							int i_445_ = (i_398_ >> 16) * anInt8877;
							for (int i_446_ = -i_391_; i_446_ < 0; i_446_++) {
								int i_447_ = anIntArray11352[(i_397_ >> 16) + i_445_];
								if (i_447_ != 0)
									is[i_406_++] = i_447_;
								else
									i_406_++;
								i_397_ += i_402_;
							}
							i_398_ += i_403_;
							i_397_ = i_443_;
							i_406_ += i_407_;
						}
					} else if (i_393_ == 0) {
						int i_448_ = i_397_;
						if ((i_394_ & 0xffffff) == 16777215) {
							int i_449_ = i_394_ >>> 24;
							int i_450_ = 256 - i_449_;
							for (int i_451_ = -i_392_; i_451_ < 0; i_451_++) {
								int i_452_ = (i_398_ >> 16) * anInt8877;
								for (int i_453_ = -i_391_; i_453_ < 0; i_453_++) {
									int i_454_ = (anIntArray11352[(i_397_ >> 16) + i_452_]);
									if (i_454_ != 0) {
										int i_455_ = is[i_406_];
										is[i_406_++] = ((((i_454_ & 0xff00ff) * i_449_ + ((i_455_ & 0xff00ff) * i_450_)) & ~0xff00ff) + (((i_454_ & 0xff00) * i_449_ + ((i_455_ & 0xff00) * i_450_)) & 0xff0000)) >> 8;
									} else
										i_406_++;
									i_397_ += i_402_;
								}
								i_398_ += i_403_;
								i_397_ = i_448_;
								i_406_ += i_407_;
							}
						} else {
							int i_456_ = (i_394_ & 0xff0000) >> 16;
							int i_457_ = (i_394_ & 0xff00) >> 8;
							int i_458_ = i_394_ & 0xff;
							int i_459_ = i_394_ >>> 24;
							int i_460_ = 256 - i_459_;
							for (int i_461_ = -i_392_; i_461_ < 0; i_461_++) {
								int i_462_ = (i_398_ >> 16) * anInt8877;
								for (int i_463_ = -i_391_; i_463_ < 0; i_463_++) {
									int i_464_ = (anIntArray11352[(i_397_ >> 16) + i_462_]);
									if (i_464_ != 0) {
										if (i_459_ != 255) {
											int i_465_ = ((i_464_ & 0xff0000) * i_456_ & ~0xffffff);
											int i_466_ = ((i_464_ & 0xff00) * i_457_ & 0xff0000);
											int i_467_ = ((i_464_ & 0xff) * i_458_ & 0xff00);
											i_464_ = (i_465_ | i_466_ | i_467_) >>> 8;
											int i_468_ = is[i_406_];
											is[i_406_++] = (((((i_464_ & 0xff00ff) * i_459_) + ((i_468_ & 0xff00ff) * i_460_)) & ~0xff00ff) + ((((i_464_ & 0xff00) * i_459_) + ((i_468_ & 0xff00) * i_460_)) & 0xff0000)) >> 8;
										} else {
											int i_469_ = ((i_464_ & 0xff0000) * i_456_ & ~0xffffff);
											int i_470_ = ((i_464_ & 0xff00) * i_457_ & 0xff0000);
											int i_471_ = ((i_464_ & 0xff) * i_458_ & 0xff00);
											is[i_406_++] = (i_469_ | i_470_ | i_471_) >>> 8;
										}
									} else
										i_406_++;
									i_397_ += i_402_;
								}
								i_398_ += i_403_;
								i_397_ = i_448_;
								i_406_ += i_407_;
							}
						}
					} else if (i_393_ == 3) {
						int i_472_ = i_397_;
						int i_473_ = i_394_ >>> 24;
						int i_474_ = 256 - i_473_;
						for (int i_475_ = -i_392_; i_475_ < 0; i_475_++) {
							int i_476_ = (i_398_ >> 16) * anInt8877;
							for (int i_477_ = -i_391_; i_477_ < 0; i_477_++) {
								int i_478_ = anIntArray11352[(i_397_ >> 16) + i_476_];
								int i_479_ = i_478_ + i_394_;
								int i_480_ = ((i_478_ & 0xff00ff) + (i_394_ & 0xff00ff));
								int i_481_ = ((i_480_ & 0x1000100) + (i_479_ - i_480_ & 0x10000));
								i_481_ = i_479_ - i_481_ | i_481_ - (i_481_ >>> 8);
								if (i_478_ == 0 && i_473_ != 255) {
									i_478_ = i_481_;
									i_481_ = is[i_406_];
									i_481_ = ((((i_478_ & 0xff00ff) * i_473_ + (i_481_ & 0xff00ff) * i_474_) & ~0xff00ff) + (((i_478_ & 0xff00) * i_473_ + (i_481_ & 0xff00) * i_474_) & 0xff0000)) >> 8;
								}
								is[i_406_++] = i_481_;
								i_397_ += i_402_;
							}
							i_398_ += i_403_;
							i_397_ = i_472_;
							i_406_ += i_407_;
						}
					} else if (i_393_ == 2) {
						int i_482_ = i_394_ >>> 24;
						int i_483_ = 256 - i_482_;
						int i_484_ = (i_394_ & 0xff00ff) * i_483_ & ~0xff00ff;
						int i_485_ = (i_394_ & 0xff00) * i_483_ & 0xff0000;
						i_394_ = (i_484_ | i_485_) >>> 8;
						int i_486_ = i_397_;
						for (int i_487_ = -i_392_; i_487_ < 0; i_487_++) {
							int i_488_ = (i_398_ >> 16) * anInt8877;
							for (int i_489_ = -i_391_; i_489_ < 0; i_489_++) {
								int i_490_ = anIntArray11352[(i_397_ >> 16) + i_488_];
								if (i_490_ != 0) {
									i_484_ = ((i_490_ & 0xff00ff) * i_482_ & ~0xff00ff);
									i_485_ = ((i_490_ & 0xff00) * i_482_ & 0xff0000);
									is[i_406_++] = ((i_484_ | i_485_) >>> 8) + i_394_;
								} else
									i_406_++;
								i_397_ += i_402_;
							}
							i_398_ += i_403_;
							i_397_ = i_486_;
							i_406_ += i_407_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_395_ == 2) {
					if (i_393_ == 1) {
						int i_491_ = i_397_;
						for (int i_492_ = -i_392_; i_492_ < 0; i_492_++) {
							int i_493_ = (i_398_ >> 16) * anInt8877;
							for (int i_494_ = -i_391_; i_494_ < 0; i_494_++) {
								int i_495_ = anIntArray11352[(i_397_ >> 16) + i_493_];
								if (i_495_ != 0) {
									int i_496_ = is[i_406_];
									int i_497_ = i_495_ + i_496_;
									int i_498_ = ((i_495_ & 0xff00ff) + (i_496_ & 0xff00ff));
									i_496_ = ((i_498_ & 0x1000100) + (i_497_ - i_498_ & 0x10000));
									is[i_406_++] = i_497_ - i_496_ | i_496_ - (i_496_ >>> 8);
								} else
									i_406_++;
								i_397_ += i_402_;
							}
							i_398_ += i_403_;
							i_397_ = i_491_;
							i_406_ += i_407_;
						}
					} else if (i_393_ == 0) {
						int i_499_ = i_397_;
						int i_500_ = (i_394_ & 0xff0000) >> 16;
						int i_501_ = (i_394_ & 0xff00) >> 8;
						int i_502_ = i_394_ & 0xff;
						for (int i_503_ = -i_392_; i_503_ < 0; i_503_++) {
							int i_504_ = (i_398_ >> 16) * anInt8877;
							for (int i_505_ = -i_391_; i_505_ < 0; i_505_++) {
								int i_506_ = anIntArray11352[(i_397_ >> 16) + i_504_];
								if (i_506_ != 0) {
									int i_507_ = ((i_506_ & 0xff0000) * i_500_ & ~0xffffff);
									int i_508_ = ((i_506_ & 0xff00) * i_501_ & 0xff0000);
									int i_509_ = (i_506_ & 0xff) * i_502_ & 0xff00;
									i_506_ = (i_507_ | i_508_ | i_509_) >>> 8;
									int i_510_ = is[i_406_];
									int i_511_ = i_506_ + i_510_;
									int i_512_ = ((i_506_ & 0xff00ff) + (i_510_ & 0xff00ff));
									i_510_ = ((i_512_ & 0x1000100) + (i_511_ - i_512_ & 0x10000));
									is[i_406_++] = i_511_ - i_510_ | i_510_ - (i_510_ >>> 8);
								} else
									i_406_++;
								i_397_ += i_402_;
							}
							i_398_ += i_403_;
							i_397_ = i_499_;
							i_406_ += i_407_;
						}
					} else if (i_393_ == 3) {
						int i_513_ = i_397_;
						for (int i_514_ = -i_392_; i_514_ < 0; i_514_++) {
							int i_515_ = (i_398_ >> 16) * anInt8877;
							for (int i_516_ = -i_391_; i_516_ < 0; i_516_++) {
								int i_517_ = anIntArray11352[(i_397_ >> 16) + i_515_];
								int i_518_ = i_517_ + i_394_;
								int i_519_ = ((i_517_ & 0xff00ff) + (i_394_ & 0xff00ff));
								int i_520_ = ((i_519_ & 0x1000100) + (i_518_ - i_519_ & 0x10000));
								i_517_ = i_518_ - i_520_ | i_520_ - (i_520_ >>> 8);
								i_520_ = is[i_406_];
								i_518_ = i_517_ + i_520_;
								i_519_ = (i_517_ & 0xff00ff) + (i_520_ & 0xff00ff);
								i_520_ = (i_519_ & 0x1000100) + (i_518_ - i_519_ & 0x10000);
								is[i_406_++] = i_518_ - i_520_ | i_520_ - (i_520_ >>> 8);
								i_397_ += i_402_;
							}
							i_398_ += i_403_;
							i_397_ = i_513_;
							i_406_ += i_407_;
						}
					} else if (i_393_ == 2) {
						int i_521_ = i_394_ >>> 24;
						int i_522_ = 256 - i_521_;
						int i_523_ = (i_394_ & 0xff00ff) * i_522_ & ~0xff00ff;
						int i_524_ = (i_394_ & 0xff00) * i_522_ & 0xff0000;
						i_394_ = (i_523_ | i_524_) >>> 8;
						int i_525_ = i_397_;
						for (int i_526_ = -i_392_; i_526_ < 0; i_526_++) {
							int i_527_ = (i_398_ >> 16) * anInt8877;
							for (int i_528_ = -i_391_; i_528_ < 0; i_528_++) {
								int i_529_ = anIntArray11352[(i_397_ >> 16) + i_527_];
								if (i_529_ != 0) {
									i_523_ = ((i_529_ & 0xff00ff) * i_521_ & ~0xff00ff);
									i_524_ = ((i_529_ & 0xff00) * i_521_ & 0xff0000);
									i_529_ = ((i_523_ | i_524_) >>> 8) + i_394_;
									int i_530_ = is[i_406_];
									int i_531_ = i_529_ + i_530_;
									int i_532_ = ((i_529_ & 0xff00ff) + (i_530_ & 0xff00ff));
									i_530_ = ((i_532_ & 0x1000100) + (i_531_ - i_532_ & 0x10000));
									is[i_406_++] = i_531_ - i_530_ | i_530_ - (i_530_ >>> 8);
								} else
									i_406_++;
								i_397_ += i_402_;
							}
							i_398_ += i_403_;
							i_397_ = i_525_;
							i_406_ += i_407_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method14426(int[] is, int[] is_533_, int i, int i_534_) {
		int[] is_535_ = aClass180_Sub1_8876.anIntArray9386;
		if (is_535_ != null) {
			if (anInt8893 == 0) {
				if (anInt8909 == 0) {
					int i_536_ = anInt8903;
					while (i_536_ < 0) {
						int i_537_ = i_536_ + i_534_;
						if (i_537_ >= 0) {
							if (i_537_ >= is.length)
								break;
							int i_538_ = anInt8892;
							int i_539_ = anInt8899;
							int i_540_ = anInt8900;
							int i_541_ = anInt8888;
							if (i_539_ >= 0 && i_540_ >= 0 && i_539_ - (anInt8877 << 12) < 0 && i_540_ - (anInt8880 << 12) < 0) {
								int i_542_ = is[i_537_] - i;
								int i_543_ = -is_533_[i_537_];
								int i_544_ = i_542_ - (i_538_ - anInt8892);
								if (i_544_ > 0) {
									i_538_ += i_544_;
									i_541_ += i_544_;
									i_539_ += anInt8893 * i_544_;
									i_540_ += anInt8909 * i_544_;
								} else
									i_543_ -= i_544_;
								if (i_541_ < i_543_)
									i_541_ = i_543_;
								for (/**/; i_541_ < 0; i_541_++) {
									int i_545_ = (anIntArray11352[((i_540_ >> 12) * anInt8877 + (i_539_ >> 12))]);
									if (i_545_ != 0)
										is_535_[i_538_++] = i_545_;
									else
										i_538_++;
								}
							}
						}
						i_536_++;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_546_ = anInt8903;
					while (i_546_ < 0) {
						int i_547_ = i_546_ + i_534_;
						if (i_547_ >= 0) {
							if (i_547_ >= is.length)
								break;
							int i_548_ = anInt8892;
							int i_549_ = anInt8899;
							int i_550_ = anInt8900 + anInt8902;
							int i_551_ = anInt8888;
							if (i_549_ >= 0 && i_549_ - (anInt8877 << 12) < 0) {
								int i_552_;
								if ((i_552_ = i_550_ - (anInt8880 << 12)) >= 0) {
									i_552_ = (anInt8909 - i_552_) / anInt8909;
									i_551_ += i_552_;
									i_550_ += anInt8909 * i_552_;
									i_548_ += i_552_;
								}
								if ((i_552_ = (i_550_ - anInt8909) / anInt8909) > i_551_)
									i_551_ = i_552_;
								int i_553_ = is[i_547_] - i;
								int i_554_ = -is_533_[i_547_];
								int i_555_ = i_553_ - (i_548_ - anInt8892);
								if (i_555_ > 0) {
									i_548_ += i_555_;
									i_551_ += i_555_;
									i_549_ += anInt8893 * i_555_;
									i_550_ += anInt8909 * i_555_;
								} else
									i_554_ -= i_555_;
								if (i_551_ < i_554_)
									i_551_ = i_554_;
								for (/**/; i_551_ < 0; i_551_++) {
									int i_556_ = (anIntArray11352[((i_550_ >> 12) * anInt8877 + (i_549_ >> 12))]);
									if (i_556_ != 0)
										is_535_[i_548_++] = i_556_;
									else
										i_548_++;
									i_550_ += anInt8909;
								}
							}
						}
						i_546_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				} else {
					int i_557_ = anInt8903;
					while (i_557_ < 0) {
						int i_558_ = i_557_ + i_534_;
						if (i_558_ >= 0) {
							if (i_558_ >= is.length)
								break;
							int i_559_ = anInt8892;
							int i_560_ = anInt8899;
							int i_561_ = anInt8900 + anInt8902;
							int i_562_ = anInt8888;
							if (i_560_ >= 0 && i_560_ - (anInt8877 << 12) < 0) {
								if (i_561_ < 0) {
									int i_563_ = (anInt8909 - 1 - i_561_) / anInt8909;
									i_562_ += i_563_;
									i_561_ += anInt8909 * i_563_;
									i_559_ += i_563_;
								}
								int i_564_;
								if ((i_564_ = (1 + i_561_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_562_)
									i_562_ = i_564_;
								int i_565_ = is[i_558_] - i;
								int i_566_ = -is_533_[i_558_];
								int i_567_ = i_565_ - (i_559_ - anInt8892);
								if (i_567_ > 0) {
									i_559_ += i_567_;
									i_562_ += i_567_;
									i_560_ += anInt8893 * i_567_;
									i_561_ += anInt8909 * i_567_;
								} else
									i_566_ -= i_567_;
								if (i_562_ < i_566_)
									i_562_ = i_566_;
								for (/**/; i_562_ < 0; i_562_++) {
									int i_568_ = (anIntArray11352[((i_561_ >> 12) * anInt8877 + (i_560_ >> 12))]);
									if (i_568_ != 0)
										is_535_[i_559_++] = i_568_;
									else
										i_559_++;
									i_561_ += anInt8909;
								}
							}
						}
						i_557_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8893 < 0) {
				if (anInt8909 == 0) {
					int i_569_ = anInt8903;
					while (i_569_ < 0) {
						int i_570_ = i_569_ + i_534_;
						if (i_570_ >= 0) {
							if (i_570_ >= is.length)
								break;
							int i_571_ = anInt8892;
							int i_572_ = anInt8899 + anInt8890;
							int i_573_ = anInt8900;
							int i_574_ = anInt8888;
							if (i_573_ >= 0 && i_573_ - (anInt8880 << 12) < 0) {
								int i_575_;
								if ((i_575_ = i_572_ - (anInt8877 << 12)) >= 0) {
									i_575_ = (anInt8893 - i_575_) / anInt8893;
									i_574_ += i_575_;
									i_572_ += anInt8893 * i_575_;
									i_571_ += i_575_;
								}
								if ((i_575_ = (i_572_ - anInt8893) / anInt8893) > i_574_)
									i_574_ = i_575_;
								int i_576_ = is[i_570_] - i;
								int i_577_ = -is_533_[i_570_];
								int i_578_ = i_576_ - (i_571_ - anInt8892);
								if (i_578_ > 0) {
									i_571_ += i_578_;
									i_574_ += i_578_;
									i_572_ += anInt8893 * i_578_;
									i_573_ += anInt8909 * i_578_;
								} else
									i_577_ -= i_578_;
								if (i_574_ < i_577_)
									i_574_ = i_577_;
								for (/**/; i_574_ < 0; i_574_++) {
									int i_579_ = (anIntArray11352[((i_573_ >> 12) * anInt8877 + (i_572_ >> 12))]);
									if (i_579_ != 0)
										is_535_[i_571_++] = i_579_;
									else
										i_571_++;
									i_572_ += anInt8893;
								}
							}
						}
						i_569_++;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_580_ = anInt8903;
					while (i_580_ < 0) {
						int i_581_ = i_580_ + i_534_;
						if (i_581_ >= 0) {
							if (i_581_ >= is.length)
								break;
							int i_582_ = anInt8892;
							int i_583_ = anInt8899 + anInt8890;
							int i_584_ = anInt8900 + anInt8902;
							int i_585_ = anInt8888;
							int i_586_;
							if ((i_586_ = i_583_ - (anInt8877 << 12)) >= 0) {
								i_586_ = (anInt8893 - i_586_) / anInt8893;
								i_585_ += i_586_;
								i_583_ += anInt8893 * i_586_;
								i_584_ += anInt8909 * i_586_;
								i_582_ += i_586_;
							}
							if ((i_586_ = (i_583_ - anInt8893) / anInt8893) > i_585_)
								i_585_ = i_586_;
							if ((i_586_ = i_584_ - (anInt8880 << 12)) >= 0) {
								i_586_ = (anInt8909 - i_586_) / anInt8909;
								i_585_ += i_586_;
								i_583_ += anInt8893 * i_586_;
								i_584_ += anInt8909 * i_586_;
								i_582_ += i_586_;
							}
							if ((i_586_ = (i_584_ - anInt8909) / anInt8909) > i_585_)
								i_585_ = i_586_;
							int i_587_ = is[i_581_] - i;
							int i_588_ = -is_533_[i_581_];
							int i_589_ = i_587_ - (i_582_ - anInt8892);
							if (i_589_ > 0) {
								i_582_ += i_589_;
								i_585_ += i_589_;
								i_583_ += anInt8893 * i_589_;
								i_584_ += anInt8909 * i_589_;
							} else
								i_588_ -= i_589_;
							if (i_585_ < i_588_)
								i_585_ = i_588_;
							for (/**/; i_585_ < 0; i_585_++) {
								int i_590_ = (anIntArray11352[(i_584_ >> 12) * anInt8877 + (i_583_ >> 12)]);
								if (i_590_ != 0)
									is_535_[i_582_++] = i_590_;
								else
									i_582_++;
								i_583_ += anInt8893;
								i_584_ += anInt8909;
							}
						}
						i_580_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else {
					int i_591_ = anInt8903;
					while (i_591_ < 0) {
						int i_592_ = i_591_ + i_534_;
						if (i_592_ >= 0) {
							if (i_592_ >= is.length)
								break;
							int i_593_ = anInt8892;
							int i_594_ = anInt8899 + anInt8890;
							int i_595_ = anInt8900 + anInt8902;
							int i_596_ = anInt8888;
							int i_597_;
							if ((i_597_ = i_594_ - (anInt8877 << 12)) >= 0) {
								i_597_ = (anInt8893 - i_597_) / anInt8893;
								i_596_ += i_597_;
								i_594_ += anInt8893 * i_597_;
								i_595_ += anInt8909 * i_597_;
								i_593_ += i_597_;
							}
							if ((i_597_ = (i_594_ - anInt8893) / anInt8893) > i_596_)
								i_596_ = i_597_;
							if (i_595_ < 0) {
								i_597_ = (anInt8909 - 1 - i_595_) / anInt8909;
								i_596_ += i_597_;
								i_594_ += anInt8893 * i_597_;
								i_595_ += anInt8909 * i_597_;
								i_593_ += i_597_;
							}
							if ((i_597_ = (1 + i_595_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_596_)
								i_596_ = i_597_;
							int i_598_ = is[i_592_] - i;
							int i_599_ = -is_533_[i_592_];
							int i_600_ = i_598_ - (i_593_ - anInt8892);
							if (i_600_ > 0) {
								i_593_ += i_600_;
								i_596_ += i_600_;
								i_594_ += anInt8893 * i_600_;
								i_595_ += anInt8909 * i_600_;
							} else
								i_599_ -= i_600_;
							if (i_596_ < i_599_)
								i_596_ = i_599_;
							for (/**/; i_596_ < 0; i_596_++) {
								int i_601_ = (anIntArray11352[(i_595_ >> 12) * anInt8877 + (i_594_ >> 12)]);
								if (i_601_ != 0)
									is_535_[i_593_++] = i_601_;
								else
									i_593_++;
								i_594_ += anInt8893;
								i_595_ += anInt8909;
							}
						}
						i_591_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8909 == 0) {
				int i_602_ = anInt8903;
				while (i_602_ < 0) {
					int i_603_ = i_602_ + i_534_;
					if (i_603_ >= 0) {
						if (i_603_ >= is.length)
							break;
						int i_604_ = anInt8892;
						int i_605_ = anInt8899 + anInt8890;
						int i_606_ = anInt8900;
						int i_607_ = anInt8888;
						if (i_606_ >= 0 && i_606_ - (anInt8880 << 12) < 0) {
							if (i_605_ < 0) {
								int i_608_ = (anInt8893 - 1 - i_605_) / anInt8893;
								i_607_ += i_608_;
								i_605_ += anInt8893 * i_608_;
								i_604_ += i_608_;
							}
							int i_609_;
							if ((i_609_ = (1 + i_605_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_607_)
								i_607_ = i_609_;
							int i_610_ = is[i_603_] - i;
							int i_611_ = -is_533_[i_603_];
							int i_612_ = i_610_ - (i_604_ - anInt8892);
							if (i_612_ > 0) {
								i_604_ += i_612_;
								i_607_ += i_612_;
								i_605_ += anInt8893 * i_612_;
								i_606_ += anInt8909 * i_612_;
							} else
								i_611_ -= i_612_;
							if (i_607_ < i_611_)
								i_607_ = i_611_;
							for (/**/; i_607_ < 0; i_607_++) {
								int i_613_ = (anIntArray11352[(i_606_ >> 12) * anInt8877 + (i_605_ >> 12)]);
								if (i_613_ != 0)
									is_535_[i_604_++] = i_613_;
								else
									i_604_++;
								i_605_ += anInt8893;
							}
						}
					}
					i_602_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else if (anInt8909 < 0) {
				int i_614_ = anInt8903;
				while (i_614_ < 0) {
					int i_615_ = i_614_ + i_534_;
					if (i_615_ >= 0) {
						if (i_615_ >= is.length)
							break;
						int i_616_ = anInt8892;
						int i_617_ = anInt8899 + anInt8890;
						int i_618_ = anInt8900 + anInt8902;
						int i_619_ = anInt8888;
						if (i_617_ < 0) {
							int i_620_ = (anInt8893 - 1 - i_617_) / anInt8893;
							i_619_ += i_620_;
							i_617_ += anInt8893 * i_620_;
							i_618_ += anInt8909 * i_620_;
							i_616_ += i_620_;
						}
						int i_621_;
						if ((i_621_ = (1 + i_617_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_619_)
							i_619_ = i_621_;
						if ((i_621_ = i_618_ - (anInt8880 << 12)) >= 0) {
							i_621_ = (anInt8909 - i_621_) / anInt8909;
							i_619_ += i_621_;
							i_617_ += anInt8893 * i_621_;
							i_618_ += anInt8909 * i_621_;
							i_616_ += i_621_;
						}
						if ((i_621_ = (i_618_ - anInt8909) / anInt8909) > i_619_)
							i_619_ = i_621_;
						int i_622_ = is[i_615_] - i;
						int i_623_ = -is_533_[i_615_];
						int i_624_ = i_622_ - (i_616_ - anInt8892);
						if (i_624_ > 0) {
							i_616_ += i_624_;
							i_619_ += i_624_;
							i_617_ += anInt8893 * i_624_;
							i_618_ += anInt8909 * i_624_;
						} else
							i_623_ -= i_624_;
						if (i_619_ < i_623_)
							i_619_ = i_623_;
						for (/**/; i_619_ < 0; i_619_++) {
							int i_625_ = (anIntArray11352[(i_618_ >> 12) * anInt8877 + (i_617_ >> 12)]);
							if (i_625_ != 0)
								is_535_[i_616_++] = i_625_;
							else
								i_616_++;
							i_617_ += anInt8893;
							i_618_ += anInt8909;
						}
					}
					i_614_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else {
				int i_626_ = anInt8903;
				while (i_626_ < 0) {
					int i_627_ = i_626_ + i_534_;
					if (i_627_ >= 0) {
						if (i_627_ >= is.length)
							break;
						int i_628_ = anInt8892;
						int i_629_ = anInt8899 + anInt8890;
						int i_630_ = anInt8900 + anInt8902;
						int i_631_ = anInt8888;
						if (i_629_ < 0) {
							int i_632_ = (anInt8893 - 1 - i_629_) / anInt8893;
							i_631_ += i_632_;
							i_629_ += anInt8893 * i_632_;
							i_630_ += anInt8909 * i_632_;
							i_628_ += i_632_;
						}
						int i_633_;
						if ((i_633_ = (1 + i_629_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_631_)
							i_631_ = i_633_;
						if (i_630_ < 0) {
							i_633_ = (anInt8909 - 1 - i_630_) / anInt8909;
							i_631_ += i_633_;
							i_629_ += anInt8893 * i_633_;
							i_630_ += anInt8909 * i_633_;
							i_628_ += i_633_;
						}
						if ((i_633_ = (1 + i_630_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_631_)
							i_631_ = i_633_;
						int i_634_ = is[i_627_] - i;
						int i_635_ = -is_533_[i_627_];
						int i_636_ = i_634_ - (i_628_ - anInt8892);
						if (i_636_ > 0) {
							i_628_ += i_636_;
							i_631_ += i_636_;
							i_629_ += anInt8893 * i_636_;
							i_630_ += anInt8909 * i_636_;
						} else
							i_635_ -= i_636_;
						if (i_631_ < i_635_)
							i_631_ = i_635_;
						for (/**/; i_631_ < 0; i_631_++) {
							int i_637_ = (anIntArray11352[(i_630_ >> 12) * anInt8877 + (i_629_ >> 12)]);
							if (i_637_ != 0)
								is_535_[i_628_++] = i_637_;
							else
								i_628_++;
							i_629_ += anInt8893;
							i_630_ += anInt8909;
						}
					}
					i_626_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			}
		}
	}

	void method17920(int i, int i_638_, int[] is, int i_639_, int i_640_) {
		if (i_640_ == 0) {
			if (i_639_ == 1)
				is[i_638_] = anIntArray11352[i];
			else if (i_639_ == 0) {
				int i_641_ = anIntArray11352[i++];
				int i_642_ = (i_641_ & 0xff0000) * anInt8906 & ~0xffffff;
				int i_643_ = (i_641_ & 0xff00) * anInt8907 & 0xff0000;
				int i_644_ = (i_641_ & 0xff) * anInt8908 & 0xff00;
				is[i_638_] = (i_642_ | i_643_ | i_644_) >>> 8;
			} else if (i_639_ == 3) {
				int i_645_ = anIntArray11352[i++];
				int i_646_ = anInt8894;
				int i_647_ = i_645_ + i_646_;
				int i_648_ = (i_645_ & 0xff00ff) + (i_646_ & 0xff00ff);
				int i_649_ = (i_648_ & 0x1000100) + (i_647_ - i_648_ & 0x10000);
				is[i_638_] = i_647_ - i_649_ | i_649_ - (i_649_ >>> 8);
			} else if (i_639_ == 2) {
				int i_650_ = anIntArray11352[i];
				int i_651_ = (i_650_ & 0xff00ff) * anInt8904 & ~0xff00ff;
				int i_652_ = (i_650_ & 0xff00) * anInt8904 & 0xff0000;
				is[i_638_] = ((i_651_ | i_652_) >>> 8) + anInt8911;
			} else
				throw new IllegalArgumentException();
		} else if (i_640_ == 1) {
			if (i_639_ == 1) {
				int i_653_ = anIntArray11352[i];
				if (i_653_ != 0)
					is[i_638_] = i_653_;
			} else if (i_639_ == 0) {
				int i_654_ = anIntArray11352[i];
				if (i_654_ != 0) {
					if ((anInt8894 & 0xffffff) == 16777215) {
						int i_655_ = anInt8894 >>> 24;
						int i_656_ = 256 - i_655_;
						int i_657_ = is[i_638_];
						is[i_638_] = ((((i_654_ & 0xff00ff) * i_655_ + (i_657_ & 0xff00ff) * i_656_) & ~0xff00ff) + (((i_654_ & 0xff00) * i_655_ + (i_657_ & 0xff00) * i_656_) & 0xff0000)) >> 8;
					} else if (anInt8904 != 255) {
						int i_658_ = (i_654_ & 0xff0000) * anInt8906 & ~0xffffff;
						int i_659_ = (i_654_ & 0xff00) * anInt8907 & 0xff0000;
						int i_660_ = (i_654_ & 0xff) * anInt8908 & 0xff00;
						i_654_ = (i_658_ | i_659_ | i_660_) >>> 8;
						int i_661_ = is[i_638_];
						is[i_638_] = ((((i_654_ & 0xff00ff) * anInt8904 + (i_661_ & 0xff00ff) * anInt8905) & ~0xff00ff) + (((i_654_ & 0xff00) * anInt8904 + (i_661_ & 0xff00) * anInt8905) & 0xff0000)) >> 8;
					} else {
						int i_662_ = (i_654_ & 0xff0000) * anInt8906 & ~0xffffff;
						int i_663_ = (i_654_ & 0xff00) * anInt8907 & 0xff0000;
						int i_664_ = (i_654_ & 0xff) * anInt8908 & 0xff00;
						is[i_638_] = (i_662_ | i_663_ | i_664_) >>> 8;
					}
				}
			} else if (i_639_ == 3) {
				int i_665_ = anIntArray11352[i];
				int i_666_ = anInt8894;
				int i_667_ = i_665_ + i_666_;
				int i_668_ = (i_665_ & 0xff00ff) + (i_666_ & 0xff00ff);
				int i_669_ = (i_668_ & 0x1000100) + (i_667_ - i_668_ & 0x10000);
				i_669_ = i_667_ - i_669_ | i_669_ - (i_669_ >>> 8);
				if (i_665_ == 0 && anInt8904 != 255) {
					i_665_ = i_669_;
					i_669_ = is[i_638_];
					i_669_ = ((((i_665_ & 0xff00ff) * anInt8904 + (i_669_ & 0xff00ff) * anInt8905) & ~0xff00ff) + (((i_665_ & 0xff00) * anInt8904 + (i_669_ & 0xff00) * anInt8905) & 0xff0000)) >> 8;
				}
				is[i_638_] = i_669_;
			} else if (i_639_ == 2) {
				int i_670_ = anIntArray11352[i];
				if (i_670_ != 0) {
					int i_671_ = (i_670_ & 0xff00ff) * anInt8904 & ~0xff00ff;
					int i_672_ = (i_670_ & 0xff00) * anInt8904 & 0xff0000;
					is[i_638_++] = ((i_671_ | i_672_) >>> 8) + anInt8911;
				}
			} else
				throw new IllegalArgumentException();
		} else if (i_640_ == 2) {
			if (i_639_ == 1) {
				int i_673_ = anIntArray11352[i];
				if (i_673_ != 0) {
					int i_674_ = is[i_638_];
					int i_675_ = i_673_ + i_674_;
					int i_676_ = (i_673_ & 0xff00ff) + (i_674_ & 0xff00ff);
					i_674_ = (i_676_ & 0x1000100) + (i_675_ - i_676_ & 0x10000);
					is[i_638_] = i_675_ - i_674_ | i_674_ - (i_674_ >>> 8);
				}
			} else if (i_639_ == 0) {
				int i_677_ = anIntArray11352[i];
				if (i_677_ != 0) {
					int i_678_ = (i_677_ & 0xff0000) * anInt8906 & ~0xffffff;
					int i_679_ = (i_677_ & 0xff00) * anInt8907 & 0xff0000;
					int i_680_ = (i_677_ & 0xff) * anInt8908 & 0xff00;
					i_677_ = (i_678_ | i_679_ | i_680_) >>> 8;
					int i_681_ = is[i_638_];
					int i_682_ = i_677_ + i_681_;
					int i_683_ = (i_677_ & 0xff00ff) + (i_681_ & 0xff00ff);
					i_681_ = (i_683_ & 0x1000100) + (i_682_ - i_683_ & 0x10000);
					is[i_638_] = i_682_ - i_681_ | i_681_ - (i_681_ >>> 8);
				}
			} else if (i_639_ == 3) {
				int i_684_ = anIntArray11352[i];
				int i_685_ = anInt8894;
				int i_686_ = i_684_ + i_685_;
				int i_687_ = (i_684_ & 0xff00ff) + (i_685_ & 0xff00ff);
				int i_688_ = (i_687_ & 0x1000100) + (i_686_ - i_687_ & 0x10000);
				i_684_ = i_686_ - i_688_ | i_688_ - (i_688_ >>> 8);
				i_688_ = is[i_638_];
				i_686_ = i_684_ + i_688_;
				i_687_ = (i_684_ & 0xff00ff) + (i_688_ & 0xff00ff);
				i_688_ = (i_687_ & 0x1000100) + (i_686_ - i_687_ & 0x10000);
				is[i_638_] = i_686_ - i_688_ | i_688_ - (i_688_ >>> 8);
			} else if (i_639_ == 2) {
				int i_689_ = anIntArray11352[i];
				if (i_689_ != 0) {
					int i_690_ = (i_689_ & 0xff00ff) * anInt8904 & ~0xff00ff;
					int i_691_ = (i_689_ & 0xff00) * anInt8904 & 0xff0000;
					i_689_ = ((i_690_ | i_691_) >>> 8) + anInt8911;
					int i_692_ = is[i_638_];
					int i_693_ = i_689_ + i_692_;
					int i_694_ = (i_689_ & 0xff00ff) + (i_692_ & 0xff00ff);
					i_692_ = (i_694_ & 0x1000100) + (i_693_ - i_694_ & 0x10000);
					is[i_638_] = i_693_ - i_692_ | i_692_ - (i_692_ >>> 8);
				}
			}
		} else
			throw new IllegalArgumentException();
	}

	public void method2444(int i, int i_695_, int i_696_, int i_697_, int[] is, int i_698_, int i_699_) {
		i_699_ -= i_696_;
		for (int i_700_ = 0; i_700_ < i_697_; i_700_++) {
			int i_701_ = (i_695_ + i_700_) * i_696_ + i;
			for (int i_702_ = 0; i_702_ < i_696_; i_702_++)
				anIntArray11352[i_701_ + i_702_] = is[i_698_++];
			i_698_ += i_699_;
		}
	}

	public void method2433(int i, int i_703_, int i_704_, int i_705_, int[] is, int i_706_, int i_707_) {
		i_707_ -= i_704_;
		for (int i_708_ = 0; i_708_ < i_705_; i_708_++) {
			int i_709_ = (i_703_ + i_708_) * i_704_ + i;
			for (int i_710_ = 0; i_710_ < i_704_; i_710_++)
				anIntArray11352[i_709_ + i_710_] = is[i_706_++];
			i_706_ += i_707_;
		}
	}

	Class147_Sub1_Sub1(Class180_Sub1 class180_sub1, int[] is, int i, int i_711_) {
		super(class180_sub1, i, i_711_);
		anIntArray11352 = is;
	}

	void method17921(int i, int i_712_, int i_713_, int i_714_, int[] is, int i_715_, int i_716_) {
		i_716_ -= i_713_;
		for (int i_717_ = 0; i_717_ < i_714_; i_717_++) {
			int i_718_ = (i_712_ + i_717_) * i_713_ + i;
			for (int i_719_ = 0; i_719_ < i_713_; i_719_++)
				is[i_715_++] = anIntArray11352[i_718_ + i_719_];
			i_715_ += i_716_;
		}
	}

	void method17922(int i, int i_720_, int i_721_, int i_722_, int[] is, int i_723_, int i_724_) {
		i_724_ -= i_721_;
		for (int i_725_ = 0; i_725_ < i_722_; i_725_++) {
			int i_726_ = (i_720_ + i_725_) * i_721_ + i;
			for (int i_727_ = 0; i_727_ < i_721_; i_727_++)
				is[i_723_++] = anIntArray11352[i_726_ + i_727_];
			i_723_ += i_724_;
		}
	}

	void method14425(int i, int i_728_) {
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is != null) {
			if (anInt8893 == 0) {
				if (anInt8909 == 0) {
					int i_729_ = anInt8903;
					while (i_729_ < 0) {
						int i_730_ = anInt8892;
						int i_731_ = anInt8899;
						int i_732_ = anInt8900;
						int i_733_ = anInt8888;
						if (i_731_ >= 0 && i_732_ >= 0 && i_731_ - (anInt8877 << 12) < 0 && i_732_ - (anInt8880 << 12) < 0) {
							for (/**/; i_733_ < 0; i_733_++)
								method17920(((i_732_ >> 12) * anInt8877 + (i_731_ >> 12)), i_730_++, is, i, i_728_);
						}
						i_729_++;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_734_ = anInt8903;
					while (i_734_ < 0) {
						int i_735_ = anInt8892;
						int i_736_ = anInt8899;
						int i_737_ = anInt8900 + anInt8902;
						int i_738_ = anInt8888;
						if (i_736_ >= 0 && i_736_ - (anInt8877 << 12) < 0) {
							int i_739_;
							if ((i_739_ = i_737_ - (anInt8880 << 12)) >= 0) {
								i_739_ = (anInt8909 - i_739_) / anInt8909;
								i_738_ += i_739_;
								i_737_ += anInt8909 * i_739_;
								i_735_ += i_739_;
							}
							if ((i_739_ = (i_737_ - anInt8909) / anInt8909) > i_738_)
								i_738_ = i_739_;
							for (/**/; i_738_ < 0; i_738_++) {
								method17920(((i_737_ >> 12) * anInt8877 + (i_736_ >> 12)), i_735_++, is, i, i_728_);
								i_737_ += anInt8909;
							}
						}
						i_734_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				} else {
					int i_740_ = anInt8903;
					while (i_740_ < 0) {
						int i_741_ = anInt8892;
						int i_742_ = anInt8899;
						int i_743_ = anInt8900 + anInt8902;
						int i_744_ = anInt8888;
						if (i_742_ >= 0 && i_742_ - (anInt8877 << 12) < 0) {
							if (i_743_ < 0) {
								int i_745_ = (anInt8909 - 1 - i_743_) / anInt8909;
								i_744_ += i_745_;
								i_743_ += anInt8909 * i_745_;
								i_741_ += i_745_;
							}
							int i_746_;
							if ((i_746_ = (1 + i_743_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_744_)
								i_744_ = i_746_;
							for (/**/; i_744_ < 0; i_744_++) {
								method17920(((i_743_ >> 12) * anInt8877 + (i_742_ >> 12)), i_741_++, is, i, i_728_);
								i_743_ += anInt8909;
							}
						}
						i_740_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8893 < 0) {
				if (anInt8909 == 0) {
					int i_747_ = anInt8903;
					while (i_747_ < 0) {
						int i_748_ = anInt8892;
						int i_749_ = anInt8899 + anInt8890;
						int i_750_ = anInt8900;
						int i_751_ = anInt8888;
						if (i_750_ >= 0 && i_750_ - (anInt8880 << 12) < 0) {
							int i_752_;
							if ((i_752_ = i_749_ - (anInt8877 << 12)) >= 0) {
								i_752_ = (anInt8893 - i_752_) / anInt8893;
								i_751_ += i_752_;
								i_749_ += anInt8893 * i_752_;
								i_748_ += i_752_;
							}
							if ((i_752_ = (i_749_ - anInt8893) / anInt8893) > i_751_)
								i_751_ = i_752_;
							for (/**/; i_751_ < 0; i_751_++) {
								method17920(((i_750_ >> 12) * anInt8877 + (i_749_ >> 12)), i_748_++, is, i, i_728_);
								i_749_ += anInt8893;
							}
						}
						i_747_++;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_753_ = anInt8903;
					while (i_753_ < 0) {
						int i_754_ = anInt8892;
						int i_755_ = anInt8899 + anInt8890;
						int i_756_ = anInt8900 + anInt8902;
						int i_757_ = anInt8888;
						int i_758_;
						if ((i_758_ = i_755_ - (anInt8877 << 12)) >= 0) {
							i_758_ = (anInt8893 - i_758_) / anInt8893;
							i_757_ += i_758_;
							i_755_ += anInt8893 * i_758_;
							i_756_ += anInt8909 * i_758_;
							i_754_ += i_758_;
						}
						if ((i_758_ = (i_755_ - anInt8893) / anInt8893) > i_757_)
							i_757_ = i_758_;
						if ((i_758_ = i_756_ - (anInt8880 << 12)) >= 0) {
							i_758_ = (anInt8909 - i_758_) / anInt8909;
							i_757_ += i_758_;
							i_755_ += anInt8893 * i_758_;
							i_756_ += anInt8909 * i_758_;
							i_754_ += i_758_;
						}
						if ((i_758_ = (i_756_ - anInt8909) / anInt8909) > i_757_)
							i_757_ = i_758_;
						for (/**/; i_757_ < 0; i_757_++) {
							method17920((i_756_ >> 12) * anInt8877 + (i_755_ >> 12), i_754_++, is, i, i_728_);
							i_755_ += anInt8893;
							i_756_ += anInt8909;
						}
						i_753_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else {
					int i_759_ = anInt8903;
					while (i_759_ < 0) {
						int i_760_ = anInt8892;
						int i_761_ = anInt8899 + anInt8890;
						int i_762_ = anInt8900 + anInt8902;
						int i_763_ = anInt8888;
						int i_764_;
						if ((i_764_ = i_761_ - (anInt8877 << 12)) >= 0) {
							i_764_ = (anInt8893 - i_764_) / anInt8893;
							i_763_ += i_764_;
							i_761_ += anInt8893 * i_764_;
							i_762_ += anInt8909 * i_764_;
							i_760_ += i_764_;
						}
						if ((i_764_ = (i_761_ - anInt8893) / anInt8893) > i_763_)
							i_763_ = i_764_;
						if (i_762_ < 0) {
							i_764_ = (anInt8909 - 1 - i_762_) / anInt8909;
							i_763_ += i_764_;
							i_761_ += anInt8893 * i_764_;
							i_762_ += anInt8909 * i_764_;
							i_760_ += i_764_;
						}
						if ((i_764_ = (1 + i_762_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_763_)
							i_763_ = i_764_;
						for (/**/; i_763_ < 0; i_763_++) {
							method17920((i_762_ >> 12) * anInt8877 + (i_761_ >> 12), i_760_++, is, i, i_728_);
							i_761_ += anInt8893;
							i_762_ += anInt8909;
						}
						i_759_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8909 == 0) {
				int i_765_ = anInt8903;
				while (i_765_ < 0) {
					int i_766_ = anInt8892;
					int i_767_ = anInt8899 + anInt8890;
					int i_768_ = anInt8900;
					int i_769_ = anInt8888;
					if (i_768_ >= 0 && i_768_ - (anInt8880 << 12) < 0) {
						if (i_767_ < 0) {
							int i_770_ = (anInt8893 - 1 - i_767_) / anInt8893;
							i_769_ += i_770_;
							i_767_ += anInt8893 * i_770_;
							i_766_ += i_770_;
						}
						int i_771_;
						if ((i_771_ = (1 + i_767_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_769_)
							i_769_ = i_771_;
						for (/**/; i_769_ < 0; i_769_++) {
							method17920((i_768_ >> 12) * anInt8877 + (i_767_ >> 12), i_766_++, is, i, i_728_);
							i_767_ += anInt8893;
						}
					}
					i_765_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else if (anInt8909 < 0) {
				for (int i_772_ = anInt8903; i_772_ < 0; i_772_++) {
					int i_773_ = anInt8892;
					int i_774_ = anInt8899 + anInt8890;
					int i_775_ = anInt8900 + anInt8902;
					int i_776_ = anInt8888;
					if (i_774_ < 0) {
						int i_777_ = (anInt8893 - 1 - i_774_) / anInt8893;
						i_776_ += i_777_;
						i_774_ += anInt8893 * i_777_;
						i_775_ += anInt8909 * i_777_;
						i_773_ += i_777_;
					}
					int i_778_;
					if ((i_778_ = ((1 + i_774_ - (anInt8877 << 12) - anInt8893) / anInt8893)) > i_776_)
						i_776_ = i_778_;
					if ((i_778_ = i_775_ - (anInt8880 << 12)) >= 0) {
						i_778_ = (anInt8909 - i_778_) / anInt8909;
						i_776_ += i_778_;
						i_774_ += anInt8893 * i_778_;
						i_775_ += anInt8909 * i_778_;
						i_773_ += i_778_;
					}
					if ((i_778_ = (i_775_ - anInt8909) / anInt8909) > i_776_)
						i_776_ = i_778_;
					for (/**/; i_776_ < 0; i_776_++) {
						method17920((i_775_ >> 12) * anInt8877 + (i_774_ >> 12), i_773_++, is, i, i_728_);
						i_774_ += anInt8893;
						i_775_ += anInt8909;
					}
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else {
				for (int i_779_ = anInt8903; i_779_ < 0; i_779_++) {
					int i_780_ = anInt8892;
					int i_781_ = anInt8899 + anInt8890;
					int i_782_ = anInt8900 + anInt8902;
					int i_783_ = anInt8888;
					if (i_781_ < 0) {
						int i_784_ = (anInt8893 - 1 - i_781_) / anInt8893;
						i_783_ += i_784_;
						i_781_ += anInt8893 * i_784_;
						i_782_ += anInt8909 * i_784_;
						i_780_ += i_784_;
					}
					int i_785_;
					if ((i_785_ = ((1 + i_781_ - (anInt8877 << 12) - anInt8893) / anInt8893)) > i_783_)
						i_783_ = i_785_;
					if (i_782_ < 0) {
						i_785_ = (anInt8909 - 1 - i_782_) / anInt8909;
						i_783_ += i_785_;
						i_781_ += anInt8893 * i_785_;
						i_782_ += anInt8909 * i_785_;
						i_780_ += i_785_;
					}
					if ((i_785_ = ((1 + i_782_ - (anInt8880 << 12) - anInt8909) / anInt8909)) > i_783_)
						i_783_ = i_785_;
					for (/**/; i_783_ < 0; i_783_++) {
						method17920((i_782_ >> 12) * anInt8877 + (i_781_ >> 12), i_780_++, is, i, i_728_);
						i_781_ += anInt8893;
						i_782_ += anInt8909;
					}
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			}
		}
	}

	void method14427(boolean bool, boolean bool_786_, boolean bool_787_, int i, int i_788_, float f, int i_789_, int i_790_, int i_791_, int i_792_, int i_793_, int i_794_, boolean bool_795_) {
		if (i_789_ > 0 && i_790_ > 0 && (bool || bool_786_)) {
			int i_796_ = 0;
			int i_797_ = 0;
			int i_798_ = anInt8879 + anInt8877 + anInt8878;
			int i_799_ = anInt8895 + anInt8880 + anInt8882;
			int i_800_ = (i_798_ << 16) / i_789_;
			int i_801_ = (i_799_ << 16) / i_790_;
			if (anInt8879 > 0) {
				int i_802_ = ((anInt8879 << 16) + i_800_ - 1) / i_800_;
				i += i_802_;
				i_796_ += i_802_ * i_800_ - (anInt8879 << 16);
			}
			if (anInt8895 > 0) {
				int i_803_ = ((anInt8895 << 16) + i_801_ - 1) / i_801_;
				i_788_ += i_803_;
				i_797_ += i_803_ * i_801_ - (anInt8895 << 16);
			}
			if (anInt8877 < i_798_)
				i_789_ = ((anInt8877 << 16) - i_796_ + i_800_ - 1) / i_800_;
			if (anInt8880 < i_799_)
				i_790_ = ((anInt8880 << 16) - i_797_ + i_801_ - 1) / i_801_;
			int i_804_ = i + i_788_ * (aClass180_Sub1_8876.anInt9387 * -1173855569);
			int i_805_ = aClass180_Sub1_8876.anInt9387 * -1173855569 - i_789_;
			if (i_788_ + i_790_ > aClass180_Sub1_8876.anInt9393 * -383695469)
				i_790_ -= (i_788_ + i_790_ - aClass180_Sub1_8876.anInt9393 * -383695469);
			if (i_788_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
				int i_806_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_788_;
				i_790_ -= i_806_;
				i_804_ += i_806_ * (aClass180_Sub1_8876.anInt9387 * -1173855569);
				i_797_ += i_801_ * i_806_;
			}
			if (i + i_789_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
				int i_807_ = i + i_789_ - aClass180_Sub1_8876.anInt9391 * 2014358275;
				i_789_ -= i_807_;
				i_805_ += i_807_;
			}
			if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
				int i_808_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
				i_789_ -= i_808_;
				i_804_ += i_808_;
				i_796_ += i_800_ * i_808_;
				i_805_ += i_808_;
			}
			float[] fs = aClass180_Sub1_8876.aFloatArray9389;
			int[] is = aClass180_Sub1_8876.anIntArray9386;
			if (i_793_ == 0) {
				if (i_791_ == 1) {
					int i_809_ = i_796_;
					for (int i_810_ = -i_790_; i_810_ < 0; i_810_++) {
						int i_811_ = (i_797_ >> 16) * anInt8877;
						for (int i_812_ = -i_789_; i_812_ < 0; i_812_++) {
							if (!bool_786_ || f < fs[i_804_]) {
								if (bool)
									is[i_804_] = (anIntArray11352[(i_796_ >> 16) + i_811_]);
								if (bool_786_ && bool_795_)
									fs[i_804_] = f;
							}
							i_796_ += i_800_;
							i_804_++;
						}
						i_797_ += i_801_;
						i_796_ = i_809_;
						i_804_ += i_805_;
					}
				} else if (i_791_ == 0) {
					int i_813_ = (i_792_ & 0xff0000) >> 16;
					int i_814_ = (i_792_ & 0xff00) >> 8;
					int i_815_ = i_792_ & 0xff;
					int i_816_ = i_796_;
					for (int i_817_ = -i_790_; i_817_ < 0; i_817_++) {
						int i_818_ = (i_797_ >> 16) * anInt8877;
						for (int i_819_ = -i_789_; i_819_ < 0; i_819_++) {
							if (!bool_786_ || f < fs[i_804_]) {
								if (bool) {
									int i_820_ = (anIntArray11352[(i_796_ >> 16) + i_818_]);
									int i_821_ = ((i_820_ & 0xff0000) * i_813_ & ~0xffffff);
									int i_822_ = ((i_820_ & 0xff00) * i_814_ & 0xff0000);
									int i_823_ = (i_820_ & 0xff) * i_815_ & 0xff00;
									is[i_804_] = (i_821_ | i_822_ | i_823_) >>> 8;
								}
								if (bool_786_ && bool_795_)
									fs[i_804_] = f;
							}
							i_796_ += i_800_;
							i_804_++;
						}
						i_797_ += i_801_;
						i_796_ = i_816_;
						i_804_ += i_805_;
					}
				} else if (i_791_ == 3) {
					int i_824_ = i_796_;
					for (int i_825_ = -i_790_; i_825_ < 0; i_825_++) {
						int i_826_ = (i_797_ >> 16) * anInt8877;
						for (int i_827_ = -i_789_; i_827_ < 0; i_827_++) {
							if (!bool_786_ || f < fs[i_804_]) {
								if (bool) {
									int i_828_ = (anIntArray11352[(i_796_ >> 16) + i_826_]);
									int i_829_ = i_828_ + i_792_;
									int i_830_ = ((i_828_ & 0xff00ff) + (i_792_ & 0xff00ff));
									int i_831_ = ((i_830_ & 0x1000100) + (i_829_ - i_830_ & 0x10000));
									is[i_804_] = i_829_ - i_831_ | i_831_ - (i_831_ >>> 8);
								}
								if (bool_786_ && bool_795_)
									fs[i_804_] = f;
							}
							i_796_ += i_800_;
							i_804_++;
						}
						i_797_ += i_801_;
						i_796_ = i_824_;
						i_804_ += i_805_;
					}
				} else if (i_791_ == 2) {
					int i_832_ = i_792_ >>> 24;
					int i_833_ = 256 - i_832_;
					int i_834_ = (i_792_ & 0xff00ff) * i_833_ & ~0xff00ff;
					int i_835_ = (i_792_ & 0xff00) * i_833_ & 0xff0000;
					i_792_ = (i_834_ | i_835_) >>> 8;
					int i_836_ = i_796_;
					for (int i_837_ = -i_790_; i_837_ < 0; i_837_++) {
						int i_838_ = (i_797_ >> 16) * anInt8877;
						for (int i_839_ = -i_789_; i_839_ < 0; i_839_++) {
							if (!bool_786_ || f < fs[i_804_]) {
								if (bool) {
									int i_840_ = (anIntArray11352[(i_796_ >> 16) + i_838_]);
									i_834_ = ((i_840_ & 0xff00ff) * i_832_ & ~0xff00ff);
									i_835_ = ((i_840_ & 0xff00) * i_832_ & 0xff0000);
									is[i_804_] = ((i_834_ | i_835_) >>> 8) + i_792_;
								}
								if (bool_786_ && bool_795_)
									fs[i_804_] = f;
							}
							i_796_ += i_800_;
							i_804_++;
						}
						i_797_ += i_801_;
						i_796_ = i_836_;
						i_804_ += i_805_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_793_ == 1) {
				if (i_791_ == 1) {
					int i_841_ = i_796_;
					for (int i_842_ = -i_790_; i_842_ < 0; i_842_++) {
						int i_843_ = (i_797_ >> 16) * anInt8877;
						for (int i_844_ = -i_789_; i_844_ < 0; i_844_++) {
							if (!bool_786_ || f < fs[i_804_]) {
								int i_845_ = anIntArray11352[(i_796_ >> 16) + i_843_];
								if (i_845_ != 0) {
									if (bool)
										is[i_804_] = i_845_;
									if (bool_786_ && bool_795_)
										fs[i_804_] = f;
								}
							}
							i_796_ += i_800_;
							i_804_++;
						}
						i_797_ += i_801_;
						i_796_ = i_841_;
						i_804_ += i_805_;
					}
				} else if (i_791_ == 0) {
					int i_846_ = i_796_;
					if ((i_792_ & 0xffffff) == 16777215) {
						int i_847_ = i_792_ >>> 24;
						int i_848_ = 256 - i_847_;
						for (int i_849_ = -i_790_; i_849_ < 0; i_849_++) {
							int i_850_ = (i_797_ >> 16) * anInt8877;
							for (int i_851_ = -i_789_; i_851_ < 0; i_851_++) {
								if (!bool_786_ || f < fs[i_804_]) {
									int i_852_ = (anIntArray11352[(i_796_ >> 16) + i_850_]);
									if (i_852_ != 0) {
										if (bool) {
											int i_853_ = is[i_804_];
											is[i_804_] = (((((i_852_ & 0xff00ff) * i_847_) + ((i_853_ & 0xff00ff) * i_848_)) & ~0xff00ff) + ((((i_852_ & 0xff00) * i_847_) + ((i_853_ & 0xff00) * i_848_)) & 0xff0000)) >> 8;
										}
										if (bool_786_ && bool_795_)
											fs[i_804_] = f;
									}
								}
								i_796_ += i_800_;
								i_804_++;
							}
							i_797_ += i_801_;
							i_796_ = i_846_;
							i_804_ += i_805_;
						}
					} else {
						int i_854_ = (i_792_ & 0xff0000) >> 16;
						int i_855_ = (i_792_ & 0xff00) >> 8;
						int i_856_ = i_792_ & 0xff;
						int i_857_ = i_792_ >>> 24;
						int i_858_ = 256 - i_857_;
						for (int i_859_ = -i_790_; i_859_ < 0; i_859_++) {
							int i_860_ = (i_797_ >> 16) * anInt8877;
							for (int i_861_ = -i_789_; i_861_ < 0; i_861_++) {
								if (!bool_786_ || f < fs[i_804_]) {
									int i_862_ = (anIntArray11352[(i_796_ >> 16) + i_860_]);
									if (i_862_ != 0) {
										if (i_857_ != 255) {
											if (bool) {
												int i_863_ = (((i_862_ & 0xff0000) * i_854_) & ~0xffffff);
												int i_864_ = (((i_862_ & 0xff00) * i_855_) & 0xff0000);
												int i_865_ = ((i_862_ & 0xff) * i_856_ & 0xff00);
												i_862_ = (i_863_ | i_864_ | i_865_) >>> 8;
												int i_866_ = is[i_804_];
												is[i_804_] = (((((i_862_ & 0xff00ff) * i_857_) + ((i_866_ & 0xff00ff) * i_858_)) & ~0xff00ff) + ((((i_862_ & 0xff00) * i_857_) + ((i_866_ & 0xff00) * i_858_)) & 0xff0000)) >> 8;
											}
											if (bool_786_ && bool_795_)
												fs[i_804_] = f;
										} else {
											if (bool) {
												int i_867_ = (((i_862_ & 0xff0000) * i_854_) & ~0xffffff);
												int i_868_ = (((i_862_ & 0xff00) * i_855_) & 0xff0000);
												int i_869_ = ((i_862_ & 0xff) * i_856_ & 0xff00);
												is[i_804_] = (i_867_ | i_868_ | i_869_) >>> 8;
											}
											if (bool_786_ && bool_795_)
												fs[i_804_] = f;
										}
									}
								}
								i_796_ += i_800_;
								i_804_++;
							}
							i_797_ += i_801_;
							i_796_ = i_846_;
							i_804_ += i_805_;
						}
					}
				} else if (i_791_ == 3) {
					int i_870_ = i_796_;
					int i_871_ = i_792_ >>> 24;
					int i_872_ = 256 - i_871_;
					for (int i_873_ = -i_790_; i_873_ < 0; i_873_++) {
						int i_874_ = (i_797_ >> 16) * anInt8877;
						for (int i_875_ = -i_789_; i_875_ < 0; i_875_++) {
							if (!bool_786_ || f < fs[i_804_]) {
								if (bool) {
									int i_876_ = (anIntArray11352[(i_796_ >> 16) + i_874_]);
									int i_877_ = i_876_ + i_792_;
									int i_878_ = ((i_876_ & 0xff00ff) + (i_792_ & 0xff00ff));
									int i_879_ = ((i_878_ & 0x1000100) + (i_877_ - i_878_ & 0x10000));
									i_879_ = i_877_ - i_879_ | i_879_ - (i_879_ >>> 8);
									if (i_876_ == 0 && i_871_ != 255) {
										i_876_ = i_879_;
										i_879_ = is[i_804_];
										i_879_ = ((((i_876_ & 0xff00ff) * i_871_ + ((i_879_ & 0xff00ff) * i_872_)) & ~0xff00ff) + (((i_876_ & 0xff00) * i_871_ + ((i_879_ & 0xff00) * i_872_)) & 0xff0000)) >> 8;
									}
									is[i_804_] = i_879_;
								}
								if (bool_786_ && bool_795_)
									fs[i_804_] = f;
							}
							i_796_ += i_800_;
							i_804_++;
						}
						i_797_ += i_801_;
						i_796_ = i_870_;
						i_804_ += i_805_;
					}
				} else if (i_791_ == 2) {
					int i_880_ = i_792_ >>> 24;
					int i_881_ = 256 - i_880_;
					int i_882_ = (i_792_ & 0xff00ff) * i_881_ & ~0xff00ff;
					int i_883_ = (i_792_ & 0xff00) * i_881_ & 0xff0000;
					i_792_ = (i_882_ | i_883_) >>> 8;
					int i_884_ = i_796_;
					for (int i_885_ = -i_790_; i_885_ < 0; i_885_++) {
						int i_886_ = (i_797_ >> 16) * anInt8877;
						for (int i_887_ = -i_789_; i_887_ < 0; i_887_++) {
							if (!bool_786_ || f < fs[i_804_]) {
								int i_888_ = anIntArray11352[(i_796_ >> 16) + i_886_];
								if (i_888_ != 0) {
									if (bool) {
										i_882_ = ((i_888_ & 0xff00ff) * i_880_ & ~0xff00ff);
										i_883_ = ((i_888_ & 0xff00) * i_880_ & 0xff0000);
										is[i_804_] = (((i_882_ | i_883_) >>> 8) + i_792_);
									}
									if (bool_786_ && bool_795_)
										fs[i_804_] = f;
								}
							}
							i_796_ += i_800_;
							i_804_++;
						}
						i_797_ += i_801_;
						i_796_ = i_884_;
						i_804_ += i_805_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_793_ == 2) {
				if (i_791_ == 1) {
					int i_889_ = i_796_;
					for (int i_890_ = -i_790_; i_890_ < 0; i_890_++) {
						int i_891_ = (i_797_ >> 16) * anInt8877;
						for (int i_892_ = -i_789_; i_892_ < 0; i_892_++) {
							if (!bool_786_ || f < fs[i_804_]) {
								int i_893_ = anIntArray11352[(i_796_ >> 16) + i_891_];
								if (i_893_ != 0) {
									if (bool) {
										int i_894_ = is[i_804_];
										int i_895_ = i_893_ + i_894_;
										int i_896_ = ((i_893_ & 0xff00ff) + (i_894_ & 0xff00ff));
										i_894_ = ((i_896_ & 0x1000100) + (i_895_ - i_896_ & 0x10000));
										is[i_804_] = (i_895_ - i_894_ | i_894_ - (i_894_ >>> 8));
									}
									if (bool_786_ && bool_795_)
										fs[i_804_] = f;
								}
							}
							i_796_ += i_800_;
							i_804_++;
						}
						i_797_ += i_801_;
						i_796_ = i_889_;
						i_804_ += i_805_;
					}
				} else if (i_791_ == 0) {
					int i_897_ = i_796_;
					int i_898_ = (i_792_ & 0xff0000) >> 16;
					int i_899_ = (i_792_ & 0xff00) >> 8;
					int i_900_ = i_792_ & 0xff;
					for (int i_901_ = -i_790_; i_901_ < 0; i_901_++) {
						int i_902_ = (i_797_ >> 16) * anInt8877;
						for (int i_903_ = -i_789_; i_903_ < 0; i_903_++) {
							if (!bool_786_ || f < fs[i_804_]) {
								int i_904_ = anIntArray11352[(i_796_ >> 16) + i_902_];
								if (i_904_ != 0) {
									if (bool) {
										int i_905_ = ((i_904_ & 0xff0000) * i_898_ & ~0xffffff);
										int i_906_ = ((i_904_ & 0xff00) * i_899_ & 0xff0000);
										int i_907_ = ((i_904_ & 0xff) * i_900_ & 0xff00);
										i_904_ = (i_905_ | i_906_ | i_907_) >>> 8;
										int i_908_ = is[i_804_];
										int i_909_ = i_904_ + i_908_;
										int i_910_ = ((i_904_ & 0xff00ff) + (i_908_ & 0xff00ff));
										i_908_ = ((i_910_ & 0x1000100) + (i_909_ - i_910_ & 0x10000));
										is[i_804_] = (i_909_ - i_908_ | i_908_ - (i_908_ >>> 8));
									}
									if (bool_786_ && bool_795_)
										fs[i_804_] = f;
								}
							}
							i_796_ += i_800_;
							i_804_++;
						}
						i_797_ += i_801_;
						i_796_ = i_897_;
						i_804_ += i_805_;
					}
				} else if (i_791_ == 3) {
					int i_911_ = i_796_;
					for (int i_912_ = -i_790_; i_912_ < 0; i_912_++) {
						int i_913_ = (i_797_ >> 16) * anInt8877;
						for (int i_914_ = -i_789_; i_914_ < 0; i_914_++) {
							if (!bool_786_ || f < fs[i_804_]) {
								if (bool) {
									int i_915_ = (anIntArray11352[(i_796_ >> 16) + i_913_]);
									int i_916_ = i_915_ + i_792_;
									int i_917_ = ((i_915_ & 0xff00ff) + (i_792_ & 0xff00ff));
									int i_918_ = ((i_917_ & 0x1000100) + (i_916_ - i_917_ & 0x10000));
									i_915_ = i_916_ - i_918_ | i_918_ - (i_918_ >>> 8);
									i_918_ = is[i_804_];
									i_916_ = i_915_ + i_918_;
									i_917_ = (i_915_ & 0xff00ff) + (i_918_ & 0xff00ff);
									i_918_ = ((i_917_ & 0x1000100) + (i_916_ - i_917_ & 0x10000));
									is[i_804_] = i_916_ - i_918_ | i_918_ - (i_918_ >>> 8);
								}
								if (bool_786_ && bool_795_)
									fs[i_804_] = f;
							}
							i_796_ += i_800_;
							i_804_++;
						}
						i_797_ += i_801_;
						i_796_ = i_911_;
						i_804_ += i_805_;
					}
				} else if (i_791_ == 2) {
					int i_919_ = i_792_ >>> 24;
					int i_920_ = 256 - i_919_;
					int i_921_ = (i_792_ & 0xff00ff) * i_920_ & ~0xff00ff;
					int i_922_ = (i_792_ & 0xff00) * i_920_ & 0xff0000;
					i_792_ = (i_921_ | i_922_) >>> 8;
					int i_923_ = i_796_;
					for (int i_924_ = -i_790_; i_924_ < 0; i_924_++) {
						int i_925_ = (i_797_ >> 16) * anInt8877;
						for (int i_926_ = -i_789_; i_926_ < 0; i_926_++) {
							if (!bool_786_ || f < fs[i_804_]) {
								int i_927_ = anIntArray11352[(i_796_ >> 16) + i_925_];
								if (i_927_ != 0) {
									if (bool) {
										i_921_ = ((i_927_ & 0xff00ff) * i_919_ & ~0xff00ff);
										i_922_ = ((i_927_ & 0xff00) * i_919_ & 0xff0000);
										i_927_ = (((i_921_ | i_922_) >>> 8) + i_792_);
										int i_928_ = is[i_804_];
										int i_929_ = i_927_ + i_928_;
										int i_930_ = ((i_927_ & 0xff00ff) + (i_928_ & 0xff00ff));
										i_928_ = ((i_930_ & 0x1000100) + (i_929_ - i_930_ & 0x10000));
										is[i_804_] = (i_929_ - i_928_ | i_928_ - (i_928_ >>> 8));
									}
									if (bool_786_ && bool_795_)
										fs[i_804_] = f;
								}
							}
							i_796_ += i_800_;
							i_804_++;
						}
						i_797_ += i_801_;
						i_796_ = i_923_;
						i_804_ += i_805_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method2435(int i, int i_931_, int i_932_, int i_933_, int i_934_, int i_935_) {
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is == null)
			throw new IllegalStateException("");
		for (int i_936_ = 0; i_936_ < i_933_; i_936_++) {
			int i_937_ = (i_931_ + i_936_) * anInt8877 + i;
			int i_938_ = ((i_935_ + i_936_) * (aClass180_Sub1_8876.anInt9387 * -1173855569) + i_934_);
			for (int i_939_ = 0; i_939_ < i_932_; i_939_++)
				anIntArray11352[i_937_ + i_939_] = is[i_938_ + i_939_];
		}
	}

	public void method2436(int i, int i_940_, int i_941_) {
		throw new IllegalStateException("");
	}

	public void method2453(int i, int i_942_, int i_943_, int i_944_, int i_945_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is != null) {
			int i_946_ = aClass180_Sub1_8876.anInt9387 * -1173855569;
			i += anInt8879;
			i_942_ += anInt8895;
			int i_947_ = i_942_ * i_946_ + i;
			int i_948_ = 0;
			int i_949_ = anInt8880;
			int i_950_ = anInt8877;
			int i_951_ = i_946_ - i_950_;
			int i_952_ = 0;
			if (i_942_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
				int i_953_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_942_;
				i_949_ -= i_953_;
				i_942_ = aClass180_Sub1_8876.anInt9392 * -456655989;
				i_948_ += i_953_ * i_950_;
				i_947_ += i_953_ * i_946_;
			}
			if (i_942_ + i_949_ > aClass180_Sub1_8876.anInt9393 * -383695469)
				i_949_ -= (i_942_ + i_949_ - aClass180_Sub1_8876.anInt9393 * -383695469);
			if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
				int i_954_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
				i_950_ -= i_954_;
				i = aClass180_Sub1_8876.anInt9383 * 1605202751;
				i_948_ += i_954_;
				i_947_ += i_954_;
				i_952_ += i_954_;
				i_951_ += i_954_;
			}
			if (i + i_950_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
				int i_955_ = i + i_950_ - aClass180_Sub1_8876.anInt9391 * 2014358275;
				i_950_ -= i_955_;
				i_952_ += i_955_;
				i_951_ += i_955_;
			}
			if (i_950_ > 0 && i_949_ > 0) {
				if (i_945_ == 0) {
					if (i_943_ == 1) {
						for (int i_956_ = -i_949_; i_956_ < 0; i_956_++) {
							int i_957_ = i_947_ + i_950_ - 3;
							while (i_947_ < i_957_) {
								is[i_947_++] = anIntArray11352[i_948_++];
								is[i_947_++] = anIntArray11352[i_948_++];
								is[i_947_++] = anIntArray11352[i_948_++];
								is[i_947_++] = anIntArray11352[i_948_++];
							}
							i_957_ += 3;
							while (i_947_ < i_957_)
								is[i_947_++] = anIntArray11352[i_948_++];
							i_947_ += i_951_;
							i_948_ += i_952_;
						}
					} else if (i_943_ == 0) {
						int i_958_ = (i_944_ & 0xff0000) >> 16;
						int i_959_ = (i_944_ & 0xff00) >> 8;
						int i_960_ = i_944_ & 0xff;
						for (int i_961_ = -i_949_; i_961_ < 0; i_961_++) {
							for (int i_962_ = -i_950_; i_962_ < 0; i_962_++) {
								int i_963_ = anIntArray11352[i_948_++];
								int i_964_ = (i_963_ & 0xff0000) * i_958_ & ~0xffffff;
								int i_965_ = (i_963_ & 0xff00) * i_959_ & 0xff0000;
								int i_966_ = (i_963_ & 0xff) * i_960_ & 0xff00;
								is[i_947_++] = (i_964_ | i_965_ | i_966_) >>> 8;
							}
							i_947_ += i_951_;
							i_948_ += i_952_;
						}
					} else if (i_943_ == 3) {
						for (int i_967_ = -i_949_; i_967_ < 0; i_967_++) {
							for (int i_968_ = -i_950_; i_968_ < 0; i_968_++) {
								int i_969_ = anIntArray11352[i_948_++];
								int i_970_ = i_969_ + i_944_;
								int i_971_ = ((i_969_ & 0xff00ff) + (i_944_ & 0xff00ff));
								int i_972_ = ((i_971_ & 0x1000100) + (i_970_ - i_971_ & 0x10000));
								is[i_947_++] = i_970_ - i_972_ | i_972_ - (i_972_ >>> 8);
							}
							i_947_ += i_951_;
							i_948_ += i_952_;
						}
					} else if (i_943_ == 2) {
						int i_973_ = i_944_ >>> 24;
						int i_974_ = 256 - i_973_;
						int i_975_ = (i_944_ & 0xff00ff) * i_974_ & ~0xff00ff;
						int i_976_ = (i_944_ & 0xff00) * i_974_ & 0xff0000;
						i_944_ = (i_975_ | i_976_) >>> 8;
						for (int i_977_ = -i_949_; i_977_ < 0; i_977_++) {
							for (int i_978_ = -i_950_; i_978_ < 0; i_978_++) {
								int i_979_ = anIntArray11352[i_948_++];
								i_975_ = (i_979_ & 0xff00ff) * i_973_ & ~0xff00ff;
								i_976_ = (i_979_ & 0xff00) * i_973_ & 0xff0000;
								is[i_947_++] = ((i_975_ | i_976_) >>> 8) + i_944_;
							}
							i_947_ += i_951_;
							i_948_ += i_952_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_945_ == 1) {
					if (i_943_ == 1) {
						for (int i_980_ = -i_949_; i_980_ < 0; i_980_++) {
							int i_981_ = i_947_ + i_950_ - 3;
							while (i_947_ < i_981_) {
								int i_982_ = anIntArray11352[i_948_++];
								if (i_982_ != 0)
									is[i_947_++] = i_982_;
								else
									i_947_++;
								i_982_ = anIntArray11352[i_948_++];
								if (i_982_ != 0)
									is[i_947_++] = i_982_;
								else
									i_947_++;
								i_982_ = anIntArray11352[i_948_++];
								if (i_982_ != 0)
									is[i_947_++] = i_982_;
								else
									i_947_++;
								i_982_ = anIntArray11352[i_948_++];
								if (i_982_ != 0)
									is[i_947_++] = i_982_;
								else
									i_947_++;
							}
							i_981_ += 3;
							while (i_947_ < i_981_) {
								int i_983_ = anIntArray11352[i_948_++];
								if (i_983_ != 0)
									is[i_947_++] = i_983_;
								else
									i_947_++;
							}
							i_947_ += i_951_;
							i_948_ += i_952_;
						}
					} else if (i_943_ == 0) {
						if ((i_944_ & 0xffffff) == 16777215) {
							int i_984_ = i_944_ >>> 24;
							int i_985_ = 256 - i_984_;
							for (int i_986_ = -i_949_; i_986_ < 0; i_986_++) {
								for (int i_987_ = -i_950_; i_987_ < 0; i_987_++) {
									int i_988_ = anIntArray11352[i_948_++];
									if (i_988_ != 0) {
										int i_989_ = is[i_947_];
										is[i_947_++] = ((((i_988_ & 0xff00ff) * i_984_ + ((i_989_ & 0xff00ff) * i_985_)) & ~0xff00ff) + (((i_988_ & 0xff00) * i_984_ + ((i_989_ & 0xff00) * i_985_)) & 0xff0000)) >> 8;
									} else
										i_947_++;
								}
								i_947_ += i_951_;
								i_948_ += i_952_;
							}
						} else {
							int i_990_ = (i_944_ & 0xff0000) >> 16;
							int i_991_ = (i_944_ & 0xff00) >> 8;
							int i_992_ = i_944_ & 0xff;
							int i_993_ = i_944_ >>> 24;
							int i_994_ = 256 - i_993_;
							for (int i_995_ = -i_949_; i_995_ < 0; i_995_++) {
								for (int i_996_ = -i_950_; i_996_ < 0; i_996_++) {
									int i_997_ = anIntArray11352[i_948_++];
									if (i_997_ != 0) {
										if (i_993_ != 255) {
											int i_998_ = ((i_997_ & 0xff0000) * i_990_ & ~0xffffff);
											int i_999_ = ((i_997_ & 0xff00) * i_991_ & 0xff0000);
											int i_1000_ = ((i_997_ & 0xff) * i_992_ & 0xff00);
											i_997_ = (i_998_ | i_999_ | i_1000_) >>> 8;
											int i_1001_ = is[i_947_];
											is[i_947_++] = (((((i_997_ & 0xff00ff) * i_993_) + ((i_1001_ & 0xff00ff) * i_994_)) & ~0xff00ff) + ((((i_997_ & 0xff00) * i_993_) + ((i_1001_ & 0xff00) * i_994_)) & 0xff0000)) >> 8;
										} else {
											int i_1002_ = ((i_997_ & 0xff0000) * i_990_ & ~0xffffff);
											int i_1003_ = ((i_997_ & 0xff00) * i_991_ & 0xff0000);
											int i_1004_ = ((i_997_ & 0xff) * i_992_ & 0xff00);
											is[i_947_++] = (i_1002_ | i_1003_ | i_1004_) >>> 8;
										}
									} else
										i_947_++;
								}
								i_947_ += i_951_;
								i_948_ += i_952_;
							}
						}
					} else if (i_943_ == 3) {
						int i_1005_ = i_944_ >>> 24;
						int i_1006_ = 256 - i_1005_;
						for (int i_1007_ = -i_949_; i_1007_ < 0; i_1007_++) {
							for (int i_1008_ = -i_950_; i_1008_ < 0; i_1008_++) {
								int i_1009_ = anIntArray11352[i_948_++];
								int i_1010_ = i_1009_ + i_944_;
								int i_1011_ = ((i_1009_ & 0xff00ff) + (i_944_ & 0xff00ff));
								int i_1012_ = ((i_1011_ & 0x1000100) + (i_1010_ - i_1011_ & 0x10000));
								i_1012_ = i_1010_ - i_1012_ | i_1012_ - (i_1012_ >>> 8);
								if (i_1009_ == 0 && i_1005_ != 255) {
									i_1009_ = i_1012_;
									i_1012_ = is[i_947_];
									i_1012_ = ((((i_1009_ & 0xff00ff) * i_1005_ + (i_1012_ & 0xff00ff) * i_1006_) & ~0xff00ff) + (((i_1009_ & 0xff00) * i_1005_ + (i_1012_ & 0xff00) * i_1006_) & 0xff0000)) >> 8;
								}
								is[i_947_++] = i_1012_;
							}
							i_947_ += i_951_;
							i_948_ += i_952_;
						}
					} else if (i_943_ == 2) {
						int i_1013_ = i_944_ >>> 24;
						int i_1014_ = 256 - i_1013_;
						int i_1015_ = (i_944_ & 0xff00ff) * i_1014_ & ~0xff00ff;
						int i_1016_ = (i_944_ & 0xff00) * i_1014_ & 0xff0000;
						i_944_ = (i_1015_ | i_1016_) >>> 8;
						for (int i_1017_ = -i_949_; i_1017_ < 0; i_1017_++) {
							for (int i_1018_ = -i_950_; i_1018_ < 0; i_1018_++) {
								int i_1019_ = anIntArray11352[i_948_++];
								if (i_1019_ != 0) {
									i_1015_ = ((i_1019_ & 0xff00ff) * i_1013_ & ~0xff00ff);
									i_1016_ = ((i_1019_ & 0xff00) * i_1013_ & 0xff0000);
									is[i_947_++] = ((i_1015_ | i_1016_) >>> 8) + i_944_;
								} else
									i_947_++;
							}
							i_947_ += i_951_;
							i_948_ += i_952_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_945_ == 2) {
					if (i_943_ == 1) {
						for (int i_1020_ = -i_949_; i_1020_ < 0; i_1020_++) {
							for (int i_1021_ = -i_950_; i_1021_ < 0; i_1021_++) {
								int i_1022_ = anIntArray11352[i_948_++];
								if (i_1022_ != 0) {
									int i_1023_ = is[i_947_];
									int i_1024_ = i_1022_ + i_1023_;
									int i_1025_ = ((i_1022_ & 0xff00ff) + (i_1023_ & 0xff00ff));
									i_1023_ = ((i_1025_ & 0x1000100) + (i_1024_ - i_1025_ & 0x10000));
									is[i_947_++] = (i_1024_ - i_1023_ | i_1023_ - (i_1023_ >>> 8));
								} else
									i_947_++;
							}
							i_947_ += i_951_;
							i_948_ += i_952_;
						}
					} else if (i_943_ == 0) {
						int i_1026_ = (i_944_ & 0xff0000) >> 16;
						int i_1027_ = (i_944_ & 0xff00) >> 8;
						int i_1028_ = i_944_ & 0xff;
						for (int i_1029_ = -i_949_; i_1029_ < 0; i_1029_++) {
							for (int i_1030_ = -i_950_; i_1030_ < 0; i_1030_++) {
								int i_1031_ = anIntArray11352[i_948_++];
								if (i_1031_ != 0) {
									int i_1032_ = ((i_1031_ & 0xff0000) * i_1026_ & ~0xffffff);
									int i_1033_ = ((i_1031_ & 0xff00) * i_1027_ & 0xff0000);
									int i_1034_ = (i_1031_ & 0xff) * i_1028_ & 0xff00;
									i_1031_ = (i_1032_ | i_1033_ | i_1034_) >>> 8;
									int i_1035_ = is[i_947_];
									int i_1036_ = i_1031_ + i_1035_;
									int i_1037_ = ((i_1031_ & 0xff00ff) + (i_1035_ & 0xff00ff));
									i_1035_ = ((i_1037_ & 0x1000100) + (i_1036_ - i_1037_ & 0x10000));
									is[i_947_++] = (i_1036_ - i_1035_ | i_1035_ - (i_1035_ >>> 8));
								} else
									i_947_++;
							}
							i_947_ += i_951_;
							i_948_ += i_952_;
						}
					} else if (i_943_ == 3) {
						for (int i_1038_ = -i_949_; i_1038_ < 0; i_1038_++) {
							for (int i_1039_ = -i_950_; i_1039_ < 0; i_1039_++) {
								int i_1040_ = anIntArray11352[i_948_++];
								int i_1041_ = i_1040_ + i_944_;
								int i_1042_ = ((i_1040_ & 0xff00ff) + (i_944_ & 0xff00ff));
								int i_1043_ = ((i_1042_ & 0x1000100) + (i_1041_ - i_1042_ & 0x10000));
								i_1040_ = i_1041_ - i_1043_ | i_1043_ - (i_1043_ >>> 8);
								i_1043_ = is[i_947_];
								i_1041_ = i_1040_ + i_1043_;
								i_1042_ = (i_1040_ & 0xff00ff) + (i_1043_ & 0xff00ff);
								i_1043_ = ((i_1042_ & 0x1000100) + (i_1041_ - i_1042_ & 0x10000));
								is[i_947_++] = i_1041_ - i_1043_ | i_1043_ - (i_1043_ >>> 8);
							}
							i_947_ += i_951_;
							i_948_ += i_952_;
						}
					} else if (i_943_ == 2) {
						int i_1044_ = i_944_ >>> 24;
						int i_1045_ = 256 - i_1044_;
						int i_1046_ = (i_944_ & 0xff00ff) * i_1045_ & ~0xff00ff;
						int i_1047_ = (i_944_ & 0xff00) * i_1045_ & 0xff0000;
						i_944_ = (i_1046_ | i_1047_) >>> 8;
						for (int i_1048_ = -i_949_; i_1048_ < 0; i_1048_++) {
							for (int i_1049_ = -i_950_; i_1049_ < 0; i_1049_++) {
								int i_1050_ = anIntArray11352[i_948_++];
								if (i_1050_ != 0) {
									i_1046_ = ((i_1050_ & 0xff00ff) * i_1044_ & ~0xff00ff);
									i_1047_ = ((i_1050_ & 0xff00) * i_1044_ & 0xff0000);
									i_1050_ = ((i_1046_ | i_1047_) >>> 8) + i_944_;
									int i_1051_ = is[i_947_];
									int i_1052_ = i_1050_ + i_1051_;
									int i_1053_ = ((i_1050_ & 0xff00ff) + (i_1051_ & 0xff00ff));
									i_1051_ = ((i_1053_ & 0x1000100) + (i_1052_ - i_1053_ & 0x10000));
									is[i_947_++] = (i_1052_ - i_1051_ | i_1051_ - (i_1051_ >>> 8));
								} else
									i_947_++;
							}
							i_947_ += i_951_;
							i_948_ += i_952_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	Class147_Sub1_Sub1(Class180_Sub1 class180_sub1, int i, int i_1054_) {
		super(class180_sub1, i, i_1054_);
		anIntArray11352 = new int[i * i_1054_];
	}

	void method2420(int i, int i_1055_, int i_1056_, int i_1057_, int i_1058_, int i_1059_, int i_1060_, int i_1061_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		if (i_1056_ > 0 && i_1057_ > 0) {
			int[] is = aClass180_Sub1_8876.anIntArray9386;
			if (is != null) {
				int i_1062_ = 0;
				int i_1063_ = 0;
				int i_1064_ = aClass180_Sub1_8876.anInt9387 * -1173855569;
				int i_1065_ = anInt8879 + anInt8877 + anInt8878;
				int i_1066_ = anInt8895 + anInt8880 + anInt8882;
				int i_1067_ = (i_1065_ << 16) / i_1056_;
				int i_1068_ = (i_1066_ << 16) / i_1057_;
				if (anInt8879 > 0) {
					int i_1069_ = ((anInt8879 << 16) + i_1067_ - 1) / i_1067_;
					i += i_1069_;
					i_1062_ += i_1069_ * i_1067_ - (anInt8879 << 16);
				}
				if (anInt8895 > 0) {
					int i_1070_ = ((anInt8895 << 16) + i_1068_ - 1) / i_1068_;
					i_1055_ += i_1070_;
					i_1063_ += i_1070_ * i_1068_ - (anInt8895 << 16);
				}
				if (anInt8877 < i_1065_)
					i_1056_ = (((anInt8877 << 16) - i_1062_ + i_1067_ - 1) / i_1067_);
				if (anInt8880 < i_1066_)
					i_1057_ = (((anInt8880 << 16) - i_1063_ + i_1068_ - 1) / i_1068_);
				int i_1071_ = i + i_1055_ * i_1064_;
				int i_1072_ = i_1064_ - i_1056_;
				if (i_1055_ + i_1057_ > aClass180_Sub1_8876.anInt9393 * -383695469)
					i_1057_ -= (i_1055_ + i_1057_ - aClass180_Sub1_8876.anInt9393 * -383695469);
				if (i_1055_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
					int i_1073_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_1055_;
					i_1057_ -= i_1073_;
					i_1071_ += i_1073_ * i_1064_;
					i_1063_ += i_1068_ * i_1073_;
				}
				if (i + i_1056_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
					int i_1074_ = (i + i_1056_ - aClass180_Sub1_8876.anInt9391 * 2014358275);
					i_1056_ -= i_1074_;
					i_1072_ += i_1074_;
				}
				if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
					int i_1075_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
					i_1056_ -= i_1075_;
					i_1071_ += i_1075_;
					i_1062_ += i_1067_ * i_1075_;
					i_1072_ += i_1075_;
				}
				if (i_1060_ == 0) {
					if (i_1058_ == 1) {
						int i_1076_ = i_1062_;
						for (int i_1077_ = -i_1057_; i_1077_ < 0; i_1077_++) {
							int i_1078_ = (i_1063_ >> 16) * anInt8877;
							for (int i_1079_ = -i_1056_; i_1079_ < 0; i_1079_++) {
								is[i_1071_++] = (anIntArray11352[(i_1062_ >> 16) + i_1078_]);
								i_1062_ += i_1067_;
							}
							i_1063_ += i_1068_;
							i_1062_ = i_1076_;
							i_1071_ += i_1072_;
						}
					} else if (i_1058_ == 0) {
						int i_1080_ = (i_1059_ & 0xff0000) >> 16;
						int i_1081_ = (i_1059_ & 0xff00) >> 8;
						int i_1082_ = i_1059_ & 0xff;
						int i_1083_ = i_1062_;
						for (int i_1084_ = -i_1057_; i_1084_ < 0; i_1084_++) {
							int i_1085_ = (i_1063_ >> 16) * anInt8877;
							for (int i_1086_ = -i_1056_; i_1086_ < 0; i_1086_++) {
								int i_1087_ = (anIntArray11352[(i_1062_ >> 16) + i_1085_]);
								int i_1088_ = ((i_1087_ & 0xff0000) * i_1080_ & ~0xffffff);
								int i_1089_ = (i_1087_ & 0xff00) * i_1081_ & 0xff0000;
								int i_1090_ = (i_1087_ & 0xff) * i_1082_ & 0xff00;
								is[i_1071_++] = (i_1088_ | i_1089_ | i_1090_) >>> 8;
								i_1062_ += i_1067_;
							}
							i_1063_ += i_1068_;
							i_1062_ = i_1083_;
							i_1071_ += i_1072_;
						}
					} else if (i_1058_ == 3) {
						int i_1091_ = i_1062_;
						for (int i_1092_ = -i_1057_; i_1092_ < 0; i_1092_++) {
							int i_1093_ = (i_1063_ >> 16) * anInt8877;
							for (int i_1094_ = -i_1056_; i_1094_ < 0; i_1094_++) {
								int i_1095_ = (anIntArray11352[(i_1062_ >> 16) + i_1093_]);
								int i_1096_ = i_1095_ + i_1059_;
								int i_1097_ = ((i_1095_ & 0xff00ff) + (i_1059_ & 0xff00ff));
								int i_1098_ = ((i_1097_ & 0x1000100) + (i_1096_ - i_1097_ & 0x10000));
								is[i_1071_++] = i_1096_ - i_1098_ | i_1098_ - (i_1098_ >>> 8);
								i_1062_ += i_1067_;
							}
							i_1063_ += i_1068_;
							i_1062_ = i_1091_;
							i_1071_ += i_1072_;
						}
					} else if (i_1058_ == 2) {
						int i_1099_ = i_1059_ >>> 24;
						int i_1100_ = 256 - i_1099_;
						int i_1101_ = (i_1059_ & 0xff00ff) * i_1100_ & ~0xff00ff;
						int i_1102_ = (i_1059_ & 0xff00) * i_1100_ & 0xff0000;
						i_1059_ = (i_1101_ | i_1102_) >>> 8;
						int i_1103_ = i_1062_;
						for (int i_1104_ = -i_1057_; i_1104_ < 0; i_1104_++) {
							int i_1105_ = (i_1063_ >> 16) * anInt8877;
							for (int i_1106_ = -i_1056_; i_1106_ < 0; i_1106_++) {
								int i_1107_ = (anIntArray11352[(i_1062_ >> 16) + i_1105_]);
								i_1101_ = ((i_1107_ & 0xff00ff) * i_1099_ & ~0xff00ff);
								i_1102_ = (i_1107_ & 0xff00) * i_1099_ & 0xff0000;
								is[i_1071_++] = ((i_1101_ | i_1102_) >>> 8) + i_1059_;
								i_1062_ += i_1067_;
							}
							i_1063_ += i_1068_;
							i_1062_ = i_1103_;
							i_1071_ += i_1072_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1060_ == 1) {
					if (i_1058_ == 1) {
						int i_1108_ = i_1062_;
						for (int i_1109_ = -i_1057_; i_1109_ < 0; i_1109_++) {
							int i_1110_ = (i_1063_ >> 16) * anInt8877;
							for (int i_1111_ = -i_1056_; i_1111_ < 0; i_1111_++) {
								int i_1112_ = (anIntArray11352[(i_1062_ >> 16) + i_1110_]);
								if (i_1112_ != 0)
									is[i_1071_++] = i_1112_;
								else
									i_1071_++;
								i_1062_ += i_1067_;
							}
							i_1063_ += i_1068_;
							i_1062_ = i_1108_;
							i_1071_ += i_1072_;
						}
					} else if (i_1058_ == 0) {
						int i_1113_ = i_1062_;
						if ((i_1059_ & 0xffffff) == 16777215) {
							int i_1114_ = i_1059_ >>> 24;
							int i_1115_ = 256 - i_1114_;
							for (int i_1116_ = -i_1057_; i_1116_ < 0; i_1116_++) {
								int i_1117_ = (i_1063_ >> 16) * anInt8877;
								for (int i_1118_ = -i_1056_; i_1118_ < 0; i_1118_++) {
									int i_1119_ = (anIntArray11352[(i_1062_ >> 16) + i_1117_]);
									if (i_1119_ != 0) {
										int i_1120_ = is[i_1071_];
										is[i_1071_++] = ((((i_1119_ & 0xff00ff) * i_1114_ + ((i_1120_ & 0xff00ff) * i_1115_)) & ~0xff00ff) + (((i_1119_ & 0xff00) * i_1114_ + ((i_1120_ & 0xff00) * i_1115_)) & 0xff0000)) >> 8;
									} else
										i_1071_++;
									i_1062_ += i_1067_;
								}
								i_1063_ += i_1068_;
								i_1062_ = i_1113_;
								i_1071_ += i_1072_;
							}
						} else {
							int i_1121_ = (i_1059_ & 0xff0000) >> 16;
							int i_1122_ = (i_1059_ & 0xff00) >> 8;
							int i_1123_ = i_1059_ & 0xff;
							int i_1124_ = i_1059_ >>> 24;
							int i_1125_ = 256 - i_1124_;
							for (int i_1126_ = -i_1057_; i_1126_ < 0; i_1126_++) {
								int i_1127_ = (i_1063_ >> 16) * anInt8877;
								for (int i_1128_ = -i_1056_; i_1128_ < 0; i_1128_++) {
									int i_1129_ = (anIntArray11352[(i_1062_ >> 16) + i_1127_]);
									if (i_1129_ != 0) {
										if (i_1124_ != 255) {
											int i_1130_ = (((i_1129_ & 0xff0000) * i_1121_) & ~0xffffff);
											int i_1131_ = ((i_1129_ & 0xff00) * i_1122_ & 0xff0000);
											int i_1132_ = ((i_1129_ & 0xff) * i_1123_ & 0xff00);
											i_1129_ = (i_1130_ | i_1131_ | i_1132_) >>> 8;
											int i_1133_ = is[i_1071_];
											is[i_1071_++] = (((((i_1129_ & 0xff00ff) * i_1124_) + ((i_1133_ & 0xff00ff) * i_1125_)) & ~0xff00ff) + ((((i_1129_ & 0xff00) * i_1124_) + ((i_1133_ & 0xff00) * i_1125_)) & 0xff0000)) >> 8;
										} else {
											int i_1134_ = (((i_1129_ & 0xff0000) * i_1121_) & ~0xffffff);
											int i_1135_ = ((i_1129_ & 0xff00) * i_1122_ & 0xff0000);
											int i_1136_ = ((i_1129_ & 0xff) * i_1123_ & 0xff00);
											is[i_1071_++] = (i_1134_ | i_1135_ | i_1136_) >>> 8;
										}
									} else
										i_1071_++;
									i_1062_ += i_1067_;
								}
								i_1063_ += i_1068_;
								i_1062_ = i_1113_;
								i_1071_ += i_1072_;
							}
						}
					} else if (i_1058_ == 3) {
						int i_1137_ = i_1062_;
						int i_1138_ = i_1059_ >>> 24;
						int i_1139_ = 256 - i_1138_;
						for (int i_1140_ = -i_1057_; i_1140_ < 0; i_1140_++) {
							int i_1141_ = (i_1063_ >> 16) * anInt8877;
							for (int i_1142_ = -i_1056_; i_1142_ < 0; i_1142_++) {
								int i_1143_ = (anIntArray11352[(i_1062_ >> 16) + i_1141_]);
								int i_1144_ = i_1143_ + i_1059_;
								int i_1145_ = ((i_1143_ & 0xff00ff) + (i_1059_ & 0xff00ff));
								int i_1146_ = ((i_1145_ & 0x1000100) + (i_1144_ - i_1145_ & 0x10000));
								i_1146_ = i_1144_ - i_1146_ | i_1146_ - (i_1146_ >>> 8);
								if (i_1143_ == 0 && i_1138_ != 255) {
									i_1143_ = i_1146_;
									i_1146_ = is[i_1071_];
									i_1146_ = ((((i_1143_ & 0xff00ff) * i_1138_ + (i_1146_ & 0xff00ff) * i_1139_) & ~0xff00ff) + (((i_1143_ & 0xff00) * i_1138_ + (i_1146_ & 0xff00) * i_1139_) & 0xff0000)) >> 8;
								}
								is[i_1071_++] = i_1146_;
								i_1062_ += i_1067_;
							}
							i_1063_ += i_1068_;
							i_1062_ = i_1137_;
							i_1071_ += i_1072_;
						}
					} else if (i_1058_ == 2) {
						int i_1147_ = i_1059_ >>> 24;
						int i_1148_ = 256 - i_1147_;
						int i_1149_ = (i_1059_ & 0xff00ff) * i_1148_ & ~0xff00ff;
						int i_1150_ = (i_1059_ & 0xff00) * i_1148_ & 0xff0000;
						i_1059_ = (i_1149_ | i_1150_) >>> 8;
						int i_1151_ = i_1062_;
						for (int i_1152_ = -i_1057_; i_1152_ < 0; i_1152_++) {
							int i_1153_ = (i_1063_ >> 16) * anInt8877;
							for (int i_1154_ = -i_1056_; i_1154_ < 0; i_1154_++) {
								int i_1155_ = (anIntArray11352[(i_1062_ >> 16) + i_1153_]);
								if (i_1155_ != 0) {
									i_1149_ = ((i_1155_ & 0xff00ff) * i_1147_ & ~0xff00ff);
									i_1150_ = ((i_1155_ & 0xff00) * i_1147_ & 0xff0000);
									is[i_1071_++] = ((i_1149_ | i_1150_) >>> 8) + i_1059_;
								} else
									i_1071_++;
								i_1062_ += i_1067_;
							}
							i_1063_ += i_1068_;
							i_1062_ = i_1151_;
							i_1071_ += i_1072_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1060_ == 2) {
					if (i_1058_ == 1) {
						int i_1156_ = i_1062_;
						for (int i_1157_ = -i_1057_; i_1157_ < 0; i_1157_++) {
							int i_1158_ = (i_1063_ >> 16) * anInt8877;
							for (int i_1159_ = -i_1056_; i_1159_ < 0; i_1159_++) {
								int i_1160_ = (anIntArray11352[(i_1062_ >> 16) + i_1158_]);
								if (i_1160_ != 0) {
									int i_1161_ = is[i_1071_];
									int i_1162_ = i_1160_ + i_1161_;
									int i_1163_ = ((i_1160_ & 0xff00ff) + (i_1161_ & 0xff00ff));
									i_1161_ = ((i_1163_ & 0x1000100) + (i_1162_ - i_1163_ & 0x10000));
									is[i_1071_++] = (i_1162_ - i_1161_ | i_1161_ - (i_1161_ >>> 8));
								} else
									i_1071_++;
								i_1062_ += i_1067_;
							}
							i_1063_ += i_1068_;
							i_1062_ = i_1156_;
							i_1071_ += i_1072_;
						}
					} else if (i_1058_ == 0) {
						int i_1164_ = i_1062_;
						int i_1165_ = (i_1059_ & 0xff0000) >> 16;
						int i_1166_ = (i_1059_ & 0xff00) >> 8;
						int i_1167_ = i_1059_ & 0xff;
						for (int i_1168_ = -i_1057_; i_1168_ < 0; i_1168_++) {
							int i_1169_ = (i_1063_ >> 16) * anInt8877;
							for (int i_1170_ = -i_1056_; i_1170_ < 0; i_1170_++) {
								int i_1171_ = (anIntArray11352[(i_1062_ >> 16) + i_1169_]);
								if (i_1171_ != 0) {
									int i_1172_ = ((i_1171_ & 0xff0000) * i_1165_ & ~0xffffff);
									int i_1173_ = ((i_1171_ & 0xff00) * i_1166_ & 0xff0000);
									int i_1174_ = (i_1171_ & 0xff) * i_1167_ & 0xff00;
									i_1171_ = (i_1172_ | i_1173_ | i_1174_) >>> 8;
									int i_1175_ = is[i_1071_];
									int i_1176_ = i_1171_ + i_1175_;
									int i_1177_ = ((i_1171_ & 0xff00ff) + (i_1175_ & 0xff00ff));
									i_1175_ = ((i_1177_ & 0x1000100) + (i_1176_ - i_1177_ & 0x10000));
									is[i_1071_++] = (i_1176_ - i_1175_ | i_1175_ - (i_1175_ >>> 8));
								} else
									i_1071_++;
								i_1062_ += i_1067_;
							}
							i_1063_ += i_1068_;
							i_1062_ = i_1164_;
							i_1071_ += i_1072_;
						}
					} else if (i_1058_ == 3) {
						int i_1178_ = i_1062_;
						for (int i_1179_ = -i_1057_; i_1179_ < 0; i_1179_++) {
							int i_1180_ = (i_1063_ >> 16) * anInt8877;
							for (int i_1181_ = -i_1056_; i_1181_ < 0; i_1181_++) {
								int i_1182_ = (anIntArray11352[(i_1062_ >> 16) + i_1180_]);
								int i_1183_ = i_1182_ + i_1059_;
								int i_1184_ = ((i_1182_ & 0xff00ff) + (i_1059_ & 0xff00ff));
								int i_1185_ = ((i_1184_ & 0x1000100) + (i_1183_ - i_1184_ & 0x10000));
								i_1182_ = i_1183_ - i_1185_ | i_1185_ - (i_1185_ >>> 8);
								i_1185_ = is[i_1071_];
								i_1183_ = i_1182_ + i_1185_;
								i_1184_ = (i_1182_ & 0xff00ff) + (i_1185_ & 0xff00ff);
								i_1185_ = ((i_1184_ & 0x1000100) + (i_1183_ - i_1184_ & 0x10000));
								is[i_1071_++] = i_1183_ - i_1185_ | i_1185_ - (i_1185_ >>> 8);
								i_1062_ += i_1067_;
							}
							i_1063_ += i_1068_;
							i_1062_ = i_1178_;
							i_1071_ += i_1072_;
						}
					} else if (i_1058_ == 2) {
						int i_1186_ = i_1059_ >>> 24;
						int i_1187_ = 256 - i_1186_;
						int i_1188_ = (i_1059_ & 0xff00ff) * i_1187_ & ~0xff00ff;
						int i_1189_ = (i_1059_ & 0xff00) * i_1187_ & 0xff0000;
						i_1059_ = (i_1188_ | i_1189_) >>> 8;
						int i_1190_ = i_1062_;
						for (int i_1191_ = -i_1057_; i_1191_ < 0; i_1191_++) {
							int i_1192_ = (i_1063_ >> 16) * anInt8877;
							for (int i_1193_ = -i_1056_; i_1193_ < 0; i_1193_++) {
								int i_1194_ = (anIntArray11352[(i_1062_ >> 16) + i_1192_]);
								if (i_1194_ != 0) {
									i_1188_ = ((i_1194_ & 0xff00ff) * i_1186_ & ~0xff00ff);
									i_1189_ = ((i_1194_ & 0xff00) * i_1186_ & 0xff0000);
									i_1194_ = (((i_1188_ | i_1189_) >>> 8) + i_1059_);
									int i_1195_ = is[i_1071_];
									int i_1196_ = i_1194_ + i_1195_;
									int i_1197_ = ((i_1194_ & 0xff00ff) + (i_1195_ & 0xff00ff));
									i_1195_ = ((i_1197_ & 0x1000100) + (i_1196_ - i_1197_ & 0x10000));
									is[i_1071_++] = (i_1196_ - i_1195_ | i_1195_ - (i_1195_ >>> 8));
								} else
									i_1071_++;
								i_1062_ += i_1067_;
							}
							i_1063_ += i_1068_;
							i_1062_ = i_1190_;
							i_1071_ += i_1072_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method2472(int i, int i_1198_, int i_1199_, int i_1200_, int i_1201_, int i_1202_, int i_1203_, int i_1204_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		if (i_1199_ > 0 && i_1200_ > 0) {
			int[] is = aClass180_Sub1_8876.anIntArray9386;
			if (is != null) {
				int i_1205_ = 0;
				int i_1206_ = 0;
				int i_1207_ = aClass180_Sub1_8876.anInt9387 * -1173855569;
				int i_1208_ = anInt8879 + anInt8877 + anInt8878;
				int i_1209_ = anInt8895 + anInt8880 + anInt8882;
				int i_1210_ = (i_1208_ << 16) / i_1199_;
				int i_1211_ = (i_1209_ << 16) / i_1200_;
				if (anInt8879 > 0) {
					int i_1212_ = ((anInt8879 << 16) + i_1210_ - 1) / i_1210_;
					i += i_1212_;
					i_1205_ += i_1212_ * i_1210_ - (anInt8879 << 16);
				}
				if (anInt8895 > 0) {
					int i_1213_ = ((anInt8895 << 16) + i_1211_ - 1) / i_1211_;
					i_1198_ += i_1213_;
					i_1206_ += i_1213_ * i_1211_ - (anInt8895 << 16);
				}
				if (anInt8877 < i_1208_)
					i_1199_ = (((anInt8877 << 16) - i_1205_ + i_1210_ - 1) / i_1210_);
				if (anInt8880 < i_1209_)
					i_1200_ = (((anInt8880 << 16) - i_1206_ + i_1211_ - 1) / i_1211_);
				int i_1214_ = i + i_1198_ * i_1207_;
				int i_1215_ = i_1207_ - i_1199_;
				if (i_1198_ + i_1200_ > aClass180_Sub1_8876.anInt9393 * -383695469)
					i_1200_ -= (i_1198_ + i_1200_ - aClass180_Sub1_8876.anInt9393 * -383695469);
				if (i_1198_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
					int i_1216_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_1198_;
					i_1200_ -= i_1216_;
					i_1214_ += i_1216_ * i_1207_;
					i_1206_ += i_1211_ * i_1216_;
				}
				if (i + i_1199_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
					int i_1217_ = (i + i_1199_ - aClass180_Sub1_8876.anInt9391 * 2014358275);
					i_1199_ -= i_1217_;
					i_1215_ += i_1217_;
				}
				if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
					int i_1218_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
					i_1199_ -= i_1218_;
					i_1214_ += i_1218_;
					i_1205_ += i_1210_ * i_1218_;
					i_1215_ += i_1218_;
				}
				if (i_1203_ == 0) {
					if (i_1201_ == 1) {
						int i_1219_ = i_1205_;
						for (int i_1220_ = -i_1200_; i_1220_ < 0; i_1220_++) {
							int i_1221_ = (i_1206_ >> 16) * anInt8877;
							for (int i_1222_ = -i_1199_; i_1222_ < 0; i_1222_++) {
								is[i_1214_++] = (anIntArray11352[(i_1205_ >> 16) + i_1221_]);
								i_1205_ += i_1210_;
							}
							i_1206_ += i_1211_;
							i_1205_ = i_1219_;
							i_1214_ += i_1215_;
						}
					} else if (i_1201_ == 0) {
						int i_1223_ = (i_1202_ & 0xff0000) >> 16;
						int i_1224_ = (i_1202_ & 0xff00) >> 8;
						int i_1225_ = i_1202_ & 0xff;
						int i_1226_ = i_1205_;
						for (int i_1227_ = -i_1200_; i_1227_ < 0; i_1227_++) {
							int i_1228_ = (i_1206_ >> 16) * anInt8877;
							for (int i_1229_ = -i_1199_; i_1229_ < 0; i_1229_++) {
								int i_1230_ = (anIntArray11352[(i_1205_ >> 16) + i_1228_]);
								int i_1231_ = ((i_1230_ & 0xff0000) * i_1223_ & ~0xffffff);
								int i_1232_ = (i_1230_ & 0xff00) * i_1224_ & 0xff0000;
								int i_1233_ = (i_1230_ & 0xff) * i_1225_ & 0xff00;
								is[i_1214_++] = (i_1231_ | i_1232_ | i_1233_) >>> 8;
								i_1205_ += i_1210_;
							}
							i_1206_ += i_1211_;
							i_1205_ = i_1226_;
							i_1214_ += i_1215_;
						}
					} else if (i_1201_ == 3) {
						int i_1234_ = i_1205_;
						for (int i_1235_ = -i_1200_; i_1235_ < 0; i_1235_++) {
							int i_1236_ = (i_1206_ >> 16) * anInt8877;
							for (int i_1237_ = -i_1199_; i_1237_ < 0; i_1237_++) {
								int i_1238_ = (anIntArray11352[(i_1205_ >> 16) + i_1236_]);
								int i_1239_ = i_1238_ + i_1202_;
								int i_1240_ = ((i_1238_ & 0xff00ff) + (i_1202_ & 0xff00ff));
								int i_1241_ = ((i_1240_ & 0x1000100) + (i_1239_ - i_1240_ & 0x10000));
								is[i_1214_++] = i_1239_ - i_1241_ | i_1241_ - (i_1241_ >>> 8);
								i_1205_ += i_1210_;
							}
							i_1206_ += i_1211_;
							i_1205_ = i_1234_;
							i_1214_ += i_1215_;
						}
					} else if (i_1201_ == 2) {
						int i_1242_ = i_1202_ >>> 24;
						int i_1243_ = 256 - i_1242_;
						int i_1244_ = (i_1202_ & 0xff00ff) * i_1243_ & ~0xff00ff;
						int i_1245_ = (i_1202_ & 0xff00) * i_1243_ & 0xff0000;
						i_1202_ = (i_1244_ | i_1245_) >>> 8;
						int i_1246_ = i_1205_;
						for (int i_1247_ = -i_1200_; i_1247_ < 0; i_1247_++) {
							int i_1248_ = (i_1206_ >> 16) * anInt8877;
							for (int i_1249_ = -i_1199_; i_1249_ < 0; i_1249_++) {
								int i_1250_ = (anIntArray11352[(i_1205_ >> 16) + i_1248_]);
								i_1244_ = ((i_1250_ & 0xff00ff) * i_1242_ & ~0xff00ff);
								i_1245_ = (i_1250_ & 0xff00) * i_1242_ & 0xff0000;
								is[i_1214_++] = ((i_1244_ | i_1245_) >>> 8) + i_1202_;
								i_1205_ += i_1210_;
							}
							i_1206_ += i_1211_;
							i_1205_ = i_1246_;
							i_1214_ += i_1215_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1203_ == 1) {
					if (i_1201_ == 1) {
						int i_1251_ = i_1205_;
						for (int i_1252_ = -i_1200_; i_1252_ < 0; i_1252_++) {
							int i_1253_ = (i_1206_ >> 16) * anInt8877;
							for (int i_1254_ = -i_1199_; i_1254_ < 0; i_1254_++) {
								int i_1255_ = (anIntArray11352[(i_1205_ >> 16) + i_1253_]);
								if (i_1255_ != 0)
									is[i_1214_++] = i_1255_;
								else
									i_1214_++;
								i_1205_ += i_1210_;
							}
							i_1206_ += i_1211_;
							i_1205_ = i_1251_;
							i_1214_ += i_1215_;
						}
					} else if (i_1201_ == 0) {
						int i_1256_ = i_1205_;
						if ((i_1202_ & 0xffffff) == 16777215) {
							int i_1257_ = i_1202_ >>> 24;
							int i_1258_ = 256 - i_1257_;
							for (int i_1259_ = -i_1200_; i_1259_ < 0; i_1259_++) {
								int i_1260_ = (i_1206_ >> 16) * anInt8877;
								for (int i_1261_ = -i_1199_; i_1261_ < 0; i_1261_++) {
									int i_1262_ = (anIntArray11352[(i_1205_ >> 16) + i_1260_]);
									if (i_1262_ != 0) {
										int i_1263_ = is[i_1214_];
										is[i_1214_++] = ((((i_1262_ & 0xff00ff) * i_1257_ + ((i_1263_ & 0xff00ff) * i_1258_)) & ~0xff00ff) + (((i_1262_ & 0xff00) * i_1257_ + ((i_1263_ & 0xff00) * i_1258_)) & 0xff0000)) >> 8;
									} else
										i_1214_++;
									i_1205_ += i_1210_;
								}
								i_1206_ += i_1211_;
								i_1205_ = i_1256_;
								i_1214_ += i_1215_;
							}
						} else {
							int i_1264_ = (i_1202_ & 0xff0000) >> 16;
							int i_1265_ = (i_1202_ & 0xff00) >> 8;
							int i_1266_ = i_1202_ & 0xff;
							int i_1267_ = i_1202_ >>> 24;
							int i_1268_ = 256 - i_1267_;
							for (int i_1269_ = -i_1200_; i_1269_ < 0; i_1269_++) {
								int i_1270_ = (i_1206_ >> 16) * anInt8877;
								for (int i_1271_ = -i_1199_; i_1271_ < 0; i_1271_++) {
									int i_1272_ = (anIntArray11352[(i_1205_ >> 16) + i_1270_]);
									if (i_1272_ != 0) {
										if (i_1267_ != 255) {
											int i_1273_ = (((i_1272_ & 0xff0000) * i_1264_) & ~0xffffff);
											int i_1274_ = ((i_1272_ & 0xff00) * i_1265_ & 0xff0000);
											int i_1275_ = ((i_1272_ & 0xff) * i_1266_ & 0xff00);
											i_1272_ = (i_1273_ | i_1274_ | i_1275_) >>> 8;
											int i_1276_ = is[i_1214_];
											is[i_1214_++] = (((((i_1272_ & 0xff00ff) * i_1267_) + ((i_1276_ & 0xff00ff) * i_1268_)) & ~0xff00ff) + ((((i_1272_ & 0xff00) * i_1267_) + ((i_1276_ & 0xff00) * i_1268_)) & 0xff0000)) >> 8;
										} else {
											int i_1277_ = (((i_1272_ & 0xff0000) * i_1264_) & ~0xffffff);
											int i_1278_ = ((i_1272_ & 0xff00) * i_1265_ & 0xff0000);
											int i_1279_ = ((i_1272_ & 0xff) * i_1266_ & 0xff00);
											is[i_1214_++] = (i_1277_ | i_1278_ | i_1279_) >>> 8;
										}
									} else
										i_1214_++;
									i_1205_ += i_1210_;
								}
								i_1206_ += i_1211_;
								i_1205_ = i_1256_;
								i_1214_ += i_1215_;
							}
						}
					} else if (i_1201_ == 3) {
						int i_1280_ = i_1205_;
						int i_1281_ = i_1202_ >>> 24;
						int i_1282_ = 256 - i_1281_;
						for (int i_1283_ = -i_1200_; i_1283_ < 0; i_1283_++) {
							int i_1284_ = (i_1206_ >> 16) * anInt8877;
							for (int i_1285_ = -i_1199_; i_1285_ < 0; i_1285_++) {
								int i_1286_ = (anIntArray11352[(i_1205_ >> 16) + i_1284_]);
								int i_1287_ = i_1286_ + i_1202_;
								int i_1288_ = ((i_1286_ & 0xff00ff) + (i_1202_ & 0xff00ff));
								int i_1289_ = ((i_1288_ & 0x1000100) + (i_1287_ - i_1288_ & 0x10000));
								i_1289_ = i_1287_ - i_1289_ | i_1289_ - (i_1289_ >>> 8);
								if (i_1286_ == 0 && i_1281_ != 255) {
									i_1286_ = i_1289_;
									i_1289_ = is[i_1214_];
									i_1289_ = ((((i_1286_ & 0xff00ff) * i_1281_ + (i_1289_ & 0xff00ff) * i_1282_) & ~0xff00ff) + (((i_1286_ & 0xff00) * i_1281_ + (i_1289_ & 0xff00) * i_1282_) & 0xff0000)) >> 8;
								}
								is[i_1214_++] = i_1289_;
								i_1205_ += i_1210_;
							}
							i_1206_ += i_1211_;
							i_1205_ = i_1280_;
							i_1214_ += i_1215_;
						}
					} else if (i_1201_ == 2) {
						int i_1290_ = i_1202_ >>> 24;
						int i_1291_ = 256 - i_1290_;
						int i_1292_ = (i_1202_ & 0xff00ff) * i_1291_ & ~0xff00ff;
						int i_1293_ = (i_1202_ & 0xff00) * i_1291_ & 0xff0000;
						i_1202_ = (i_1292_ | i_1293_) >>> 8;
						int i_1294_ = i_1205_;
						for (int i_1295_ = -i_1200_; i_1295_ < 0; i_1295_++) {
							int i_1296_ = (i_1206_ >> 16) * anInt8877;
							for (int i_1297_ = -i_1199_; i_1297_ < 0; i_1297_++) {
								int i_1298_ = (anIntArray11352[(i_1205_ >> 16) + i_1296_]);
								if (i_1298_ != 0) {
									i_1292_ = ((i_1298_ & 0xff00ff) * i_1290_ & ~0xff00ff);
									i_1293_ = ((i_1298_ & 0xff00) * i_1290_ & 0xff0000);
									is[i_1214_++] = ((i_1292_ | i_1293_) >>> 8) + i_1202_;
								} else
									i_1214_++;
								i_1205_ += i_1210_;
							}
							i_1206_ += i_1211_;
							i_1205_ = i_1294_;
							i_1214_ += i_1215_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1203_ == 2) {
					if (i_1201_ == 1) {
						int i_1299_ = i_1205_;
						for (int i_1300_ = -i_1200_; i_1300_ < 0; i_1300_++) {
							int i_1301_ = (i_1206_ >> 16) * anInt8877;
							for (int i_1302_ = -i_1199_; i_1302_ < 0; i_1302_++) {
								int i_1303_ = (anIntArray11352[(i_1205_ >> 16) + i_1301_]);
								if (i_1303_ != 0) {
									int i_1304_ = is[i_1214_];
									int i_1305_ = i_1303_ + i_1304_;
									int i_1306_ = ((i_1303_ & 0xff00ff) + (i_1304_ & 0xff00ff));
									i_1304_ = ((i_1306_ & 0x1000100) + (i_1305_ - i_1306_ & 0x10000));
									is[i_1214_++] = (i_1305_ - i_1304_ | i_1304_ - (i_1304_ >>> 8));
								} else
									i_1214_++;
								i_1205_ += i_1210_;
							}
							i_1206_ += i_1211_;
							i_1205_ = i_1299_;
							i_1214_ += i_1215_;
						}
					} else if (i_1201_ == 0) {
						int i_1307_ = i_1205_;
						int i_1308_ = (i_1202_ & 0xff0000) >> 16;
						int i_1309_ = (i_1202_ & 0xff00) >> 8;
						int i_1310_ = i_1202_ & 0xff;
						for (int i_1311_ = -i_1200_; i_1311_ < 0; i_1311_++) {
							int i_1312_ = (i_1206_ >> 16) * anInt8877;
							for (int i_1313_ = -i_1199_; i_1313_ < 0; i_1313_++) {
								int i_1314_ = (anIntArray11352[(i_1205_ >> 16) + i_1312_]);
								if (i_1314_ != 0) {
									int i_1315_ = ((i_1314_ & 0xff0000) * i_1308_ & ~0xffffff);
									int i_1316_ = ((i_1314_ & 0xff00) * i_1309_ & 0xff0000);
									int i_1317_ = (i_1314_ & 0xff) * i_1310_ & 0xff00;
									i_1314_ = (i_1315_ | i_1316_ | i_1317_) >>> 8;
									int i_1318_ = is[i_1214_];
									int i_1319_ = i_1314_ + i_1318_;
									int i_1320_ = ((i_1314_ & 0xff00ff) + (i_1318_ & 0xff00ff));
									i_1318_ = ((i_1320_ & 0x1000100) + (i_1319_ - i_1320_ & 0x10000));
									is[i_1214_++] = (i_1319_ - i_1318_ | i_1318_ - (i_1318_ >>> 8));
								} else
									i_1214_++;
								i_1205_ += i_1210_;
							}
							i_1206_ += i_1211_;
							i_1205_ = i_1307_;
							i_1214_ += i_1215_;
						}
					} else if (i_1201_ == 3) {
						int i_1321_ = i_1205_;
						for (int i_1322_ = -i_1200_; i_1322_ < 0; i_1322_++) {
							int i_1323_ = (i_1206_ >> 16) * anInt8877;
							for (int i_1324_ = -i_1199_; i_1324_ < 0; i_1324_++) {
								int i_1325_ = (anIntArray11352[(i_1205_ >> 16) + i_1323_]);
								int i_1326_ = i_1325_ + i_1202_;
								int i_1327_ = ((i_1325_ & 0xff00ff) + (i_1202_ & 0xff00ff));
								int i_1328_ = ((i_1327_ & 0x1000100) + (i_1326_ - i_1327_ & 0x10000));
								i_1325_ = i_1326_ - i_1328_ | i_1328_ - (i_1328_ >>> 8);
								i_1328_ = is[i_1214_];
								i_1326_ = i_1325_ + i_1328_;
								i_1327_ = (i_1325_ & 0xff00ff) + (i_1328_ & 0xff00ff);
								i_1328_ = ((i_1327_ & 0x1000100) + (i_1326_ - i_1327_ & 0x10000));
								is[i_1214_++] = i_1326_ - i_1328_ | i_1328_ - (i_1328_ >>> 8);
								i_1205_ += i_1210_;
							}
							i_1206_ += i_1211_;
							i_1205_ = i_1321_;
							i_1214_ += i_1215_;
						}
					} else if (i_1201_ == 2) {
						int i_1329_ = i_1202_ >>> 24;
						int i_1330_ = 256 - i_1329_;
						int i_1331_ = (i_1202_ & 0xff00ff) * i_1330_ & ~0xff00ff;
						int i_1332_ = (i_1202_ & 0xff00) * i_1330_ & 0xff0000;
						i_1202_ = (i_1331_ | i_1332_) >>> 8;
						int i_1333_ = i_1205_;
						for (int i_1334_ = -i_1200_; i_1334_ < 0; i_1334_++) {
							int i_1335_ = (i_1206_ >> 16) * anInt8877;
							for (int i_1336_ = -i_1199_; i_1336_ < 0; i_1336_++) {
								int i_1337_ = (anIntArray11352[(i_1205_ >> 16) + i_1335_]);
								if (i_1337_ != 0) {
									i_1331_ = ((i_1337_ & 0xff00ff) * i_1329_ & ~0xff00ff);
									i_1332_ = ((i_1337_ & 0xff00) * i_1329_ & 0xff0000);
									i_1337_ = (((i_1331_ | i_1332_) >>> 8) + i_1202_);
									int i_1338_ = is[i_1214_];
									int i_1339_ = i_1337_ + i_1338_;
									int i_1340_ = ((i_1337_ & 0xff00ff) + (i_1338_ & 0xff00ff));
									i_1338_ = ((i_1340_ & 0x1000100) + (i_1339_ - i_1340_ & 0x10000));
									is[i_1214_++] = (i_1339_ - i_1338_ | i_1338_ - (i_1338_ >>> 8));
								} else
									i_1214_++;
								i_1205_ += i_1210_;
							}
							i_1206_ += i_1211_;
							i_1205_ = i_1333_;
							i_1214_ += i_1215_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method17923(int i, int i_1341_, int i_1342_, int i_1343_, int[] is, int i_1344_, int i_1345_) {
		i_1345_ -= i_1342_;
		for (int i_1346_ = 0; i_1346_ < i_1343_; i_1346_++) {
			int i_1347_ = (i_1341_ + i_1346_) * i_1342_ + i;
			for (int i_1348_ = 0; i_1348_ < i_1342_; i_1348_++)
				is[i_1344_++] = anIntArray11352[i_1347_ + i_1348_];
			i_1344_ += i_1345_;
		}
	}

	void method14428(int i, int i_1349_) {
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is != null) {
			if (anInt8893 == 0) {
				if (anInt8909 == 0) {
					int i_1350_ = anInt8903;
					while (i_1350_ < 0) {
						int i_1351_ = anInt8892;
						int i_1352_ = anInt8899;
						int i_1353_ = anInt8900;
						int i_1354_ = anInt8888;
						if (i_1352_ >= 0 && i_1353_ >= 0 && i_1352_ - (anInt8877 << 12) < 0 && i_1353_ - (anInt8880 << 12) < 0) {
							for (/**/; i_1354_ < 0; i_1354_++)
								method17920(((i_1353_ >> 12) * anInt8877 + (i_1352_ >> 12)), i_1351_++, is, i, i_1349_);
						}
						i_1350_++;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_1355_ = anInt8903;
					while (i_1355_ < 0) {
						int i_1356_ = anInt8892;
						int i_1357_ = anInt8899;
						int i_1358_ = anInt8900 + anInt8902;
						int i_1359_ = anInt8888;
						if (i_1357_ >= 0 && i_1357_ - (anInt8877 << 12) < 0) {
							int i_1360_;
							if ((i_1360_ = i_1358_ - (anInt8880 << 12)) >= 0) {
								i_1360_ = (anInt8909 - i_1360_) / anInt8909;
								i_1359_ += i_1360_;
								i_1358_ += anInt8909 * i_1360_;
								i_1356_ += i_1360_;
							}
							if ((i_1360_ = (i_1358_ - anInt8909) / anInt8909) > i_1359_)
								i_1359_ = i_1360_;
							for (/**/; i_1359_ < 0; i_1359_++) {
								method17920(((i_1358_ >> 12) * anInt8877 + (i_1357_ >> 12)), i_1356_++, is, i, i_1349_);
								i_1358_ += anInt8909;
							}
						}
						i_1355_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				} else {
					int i_1361_ = anInt8903;
					while (i_1361_ < 0) {
						int i_1362_ = anInt8892;
						int i_1363_ = anInt8899;
						int i_1364_ = anInt8900 + anInt8902;
						int i_1365_ = anInt8888;
						if (i_1363_ >= 0 && i_1363_ - (anInt8877 << 12) < 0) {
							if (i_1364_ < 0) {
								int i_1366_ = (anInt8909 - 1 - i_1364_) / anInt8909;
								i_1365_ += i_1366_;
								i_1364_ += anInt8909 * i_1366_;
								i_1362_ += i_1366_;
							}
							int i_1367_;
							if ((i_1367_ = (1 + i_1364_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_1365_)
								i_1365_ = i_1367_;
							for (/**/; i_1365_ < 0; i_1365_++) {
								method17920(((i_1364_ >> 12) * anInt8877 + (i_1363_ >> 12)), i_1362_++, is, i, i_1349_);
								i_1364_ += anInt8909;
							}
						}
						i_1361_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8893 < 0) {
				if (anInt8909 == 0) {
					int i_1368_ = anInt8903;
					while (i_1368_ < 0) {
						int i_1369_ = anInt8892;
						int i_1370_ = anInt8899 + anInt8890;
						int i_1371_ = anInt8900;
						int i_1372_ = anInt8888;
						if (i_1371_ >= 0 && i_1371_ - (anInt8880 << 12) < 0) {
							int i_1373_;
							if ((i_1373_ = i_1370_ - (anInt8877 << 12)) >= 0) {
								i_1373_ = (anInt8893 - i_1373_) / anInt8893;
								i_1372_ += i_1373_;
								i_1370_ += anInt8893 * i_1373_;
								i_1369_ += i_1373_;
							}
							if ((i_1373_ = (i_1370_ - anInt8893) / anInt8893) > i_1372_)
								i_1372_ = i_1373_;
							for (/**/; i_1372_ < 0; i_1372_++) {
								method17920(((i_1371_ >> 12) * anInt8877 + (i_1370_ >> 12)), i_1369_++, is, i, i_1349_);
								i_1370_ += anInt8893;
							}
						}
						i_1368_++;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_1374_ = anInt8903;
					while (i_1374_ < 0) {
						int i_1375_ = anInt8892;
						int i_1376_ = anInt8899 + anInt8890;
						int i_1377_ = anInt8900 + anInt8902;
						int i_1378_ = anInt8888;
						int i_1379_;
						if ((i_1379_ = i_1376_ - (anInt8877 << 12)) >= 0) {
							i_1379_ = (anInt8893 - i_1379_) / anInt8893;
							i_1378_ += i_1379_;
							i_1376_ += anInt8893 * i_1379_;
							i_1377_ += anInt8909 * i_1379_;
							i_1375_ += i_1379_;
						}
						if ((i_1379_ = (i_1376_ - anInt8893) / anInt8893) > i_1378_)
							i_1378_ = i_1379_;
						if ((i_1379_ = i_1377_ - (anInt8880 << 12)) >= 0) {
							i_1379_ = (anInt8909 - i_1379_) / anInt8909;
							i_1378_ += i_1379_;
							i_1376_ += anInt8893 * i_1379_;
							i_1377_ += anInt8909 * i_1379_;
							i_1375_ += i_1379_;
						}
						if ((i_1379_ = (i_1377_ - anInt8909) / anInt8909) > i_1378_)
							i_1378_ = i_1379_;
						for (/**/; i_1378_ < 0; i_1378_++) {
							method17920((i_1377_ >> 12) * anInt8877 + (i_1376_ >> 12), i_1375_++, is, i, i_1349_);
							i_1376_ += anInt8893;
							i_1377_ += anInt8909;
						}
						i_1374_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else {
					int i_1380_ = anInt8903;
					while (i_1380_ < 0) {
						int i_1381_ = anInt8892;
						int i_1382_ = anInt8899 + anInt8890;
						int i_1383_ = anInt8900 + anInt8902;
						int i_1384_ = anInt8888;
						int i_1385_;
						if ((i_1385_ = i_1382_ - (anInt8877 << 12)) >= 0) {
							i_1385_ = (anInt8893 - i_1385_) / anInt8893;
							i_1384_ += i_1385_;
							i_1382_ += anInt8893 * i_1385_;
							i_1383_ += anInt8909 * i_1385_;
							i_1381_ += i_1385_;
						}
						if ((i_1385_ = (i_1382_ - anInt8893) / anInt8893) > i_1384_)
							i_1384_ = i_1385_;
						if (i_1383_ < 0) {
							i_1385_ = (anInt8909 - 1 - i_1383_) / anInt8909;
							i_1384_ += i_1385_;
							i_1382_ += anInt8893 * i_1385_;
							i_1383_ += anInt8909 * i_1385_;
							i_1381_ += i_1385_;
						}
						if ((i_1385_ = (1 + i_1383_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_1384_)
							i_1384_ = i_1385_;
						for (/**/; i_1384_ < 0; i_1384_++) {
							method17920((i_1383_ >> 12) * anInt8877 + (i_1382_ >> 12), i_1381_++, is, i, i_1349_);
							i_1382_ += anInt8893;
							i_1383_ += anInt8909;
						}
						i_1380_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8909 == 0) {
				int i_1386_ = anInt8903;
				while (i_1386_ < 0) {
					int i_1387_ = anInt8892;
					int i_1388_ = anInt8899 + anInt8890;
					int i_1389_ = anInt8900;
					int i_1390_ = anInt8888;
					if (i_1389_ >= 0 && i_1389_ - (anInt8880 << 12) < 0) {
						if (i_1388_ < 0) {
							int i_1391_ = (anInt8893 - 1 - i_1388_) / anInt8893;
							i_1390_ += i_1391_;
							i_1388_ += anInt8893 * i_1391_;
							i_1387_ += i_1391_;
						}
						int i_1392_;
						if ((i_1392_ = (1 + i_1388_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_1390_)
							i_1390_ = i_1392_;
						for (/**/; i_1390_ < 0; i_1390_++) {
							method17920((i_1389_ >> 12) * anInt8877 + (i_1388_ >> 12), i_1387_++, is, i, i_1349_);
							i_1388_ += anInt8893;
						}
					}
					i_1386_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else if (anInt8909 < 0) {
				for (int i_1393_ = anInt8903; i_1393_ < 0; i_1393_++) {
					int i_1394_ = anInt8892;
					int i_1395_ = anInt8899 + anInt8890;
					int i_1396_ = anInt8900 + anInt8902;
					int i_1397_ = anInt8888;
					if (i_1395_ < 0) {
						int i_1398_ = (anInt8893 - 1 - i_1395_) / anInt8893;
						i_1397_ += i_1398_;
						i_1395_ += anInt8893 * i_1398_;
						i_1396_ += anInt8909 * i_1398_;
						i_1394_ += i_1398_;
					}
					int i_1399_;
					if ((i_1399_ = (1 + i_1395_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_1397_)
						i_1397_ = i_1399_;
					if ((i_1399_ = i_1396_ - (anInt8880 << 12)) >= 0) {
						i_1399_ = (anInt8909 - i_1399_) / anInt8909;
						i_1397_ += i_1399_;
						i_1395_ += anInt8893 * i_1399_;
						i_1396_ += anInt8909 * i_1399_;
						i_1394_ += i_1399_;
					}
					if ((i_1399_ = (i_1396_ - anInt8909) / anInt8909) > i_1397_)
						i_1397_ = i_1399_;
					for (/**/; i_1397_ < 0; i_1397_++) {
						method17920((i_1396_ >> 12) * anInt8877 + (i_1395_ >> 12), i_1394_++, is, i, i_1349_);
						i_1395_ += anInt8893;
						i_1396_ += anInt8909;
					}
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else {
				for (int i_1400_ = anInt8903; i_1400_ < 0; i_1400_++) {
					int i_1401_ = anInt8892;
					int i_1402_ = anInt8899 + anInt8890;
					int i_1403_ = anInt8900 + anInt8902;
					int i_1404_ = anInt8888;
					if (i_1402_ < 0) {
						int i_1405_ = (anInt8893 - 1 - i_1402_) / anInt8893;
						i_1404_ += i_1405_;
						i_1402_ += anInt8893 * i_1405_;
						i_1403_ += anInt8909 * i_1405_;
						i_1401_ += i_1405_;
					}
					int i_1406_;
					if ((i_1406_ = (1 + i_1402_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_1404_)
						i_1404_ = i_1406_;
					if (i_1403_ < 0) {
						i_1406_ = (anInt8909 - 1 - i_1403_) / anInt8909;
						i_1404_ += i_1406_;
						i_1402_ += anInt8893 * i_1406_;
						i_1403_ += anInt8909 * i_1406_;
						i_1401_ += i_1406_;
					}
					if ((i_1406_ = (1 + i_1403_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_1404_)
						i_1404_ = i_1406_;
					for (/**/; i_1404_ < 0; i_1404_++) {
						method17920((i_1403_ >> 12) * anInt8877 + (i_1402_ >> 12), i_1401_++, is, i, i_1349_);
						i_1402_ += anInt8893;
						i_1403_ += anInt8909;
					}
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			}
		}
	}

	void method14429(int[] is, int[] is_1407_, int i, int i_1408_) {
		int[] is_1409_ = aClass180_Sub1_8876.anIntArray9386;
		if (is_1409_ != null) {
			if (anInt8893 == 0) {
				if (anInt8909 == 0) {
					int i_1410_ = anInt8903;
					while (i_1410_ < 0) {
						int i_1411_ = i_1410_ + i_1408_;
						if (i_1411_ >= 0) {
							if (i_1411_ >= is.length)
								break;
							int i_1412_ = anInt8892;
							int i_1413_ = anInt8899;
							int i_1414_ = anInt8900;
							int i_1415_ = anInt8888;
							if (i_1413_ >= 0 && i_1414_ >= 0 && i_1413_ - (anInt8877 << 12) < 0 && i_1414_ - (anInt8880 << 12) < 0) {
								int i_1416_ = is[i_1411_] - i;
								int i_1417_ = -is_1407_[i_1411_];
								int i_1418_ = i_1416_ - (i_1412_ - anInt8892);
								if (i_1418_ > 0) {
									i_1412_ += i_1418_;
									i_1415_ += i_1418_;
									i_1413_ += anInt8893 * i_1418_;
									i_1414_ += anInt8909 * i_1418_;
								} else
									i_1417_ -= i_1418_;
								if (i_1415_ < i_1417_)
									i_1415_ = i_1417_;
								for (/**/; i_1415_ < 0; i_1415_++) {
									int i_1419_ = (anIntArray11352[((i_1414_ >> 12) * anInt8877 + (i_1413_ >> 12))]);
									if (i_1419_ != 0)
										is_1409_[i_1412_++] = i_1419_;
									else
										i_1412_++;
								}
							}
						}
						i_1410_++;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_1420_ = anInt8903;
					while (i_1420_ < 0) {
						int i_1421_ = i_1420_ + i_1408_;
						if (i_1421_ >= 0) {
							if (i_1421_ >= is.length)
								break;
							int i_1422_ = anInt8892;
							int i_1423_ = anInt8899;
							int i_1424_ = anInt8900 + anInt8902;
							int i_1425_ = anInt8888;
							if (i_1423_ >= 0 && i_1423_ - (anInt8877 << 12) < 0) {
								int i_1426_;
								if ((i_1426_ = i_1424_ - (anInt8880 << 12)) >= 0) {
									i_1426_ = (anInt8909 - i_1426_) / anInt8909;
									i_1425_ += i_1426_;
									i_1424_ += anInt8909 * i_1426_;
									i_1422_ += i_1426_;
								}
								if ((i_1426_ = (i_1424_ - anInt8909) / anInt8909) > i_1425_)
									i_1425_ = i_1426_;
								int i_1427_ = is[i_1421_] - i;
								int i_1428_ = -is_1407_[i_1421_];
								int i_1429_ = i_1427_ - (i_1422_ - anInt8892);
								if (i_1429_ > 0) {
									i_1422_ += i_1429_;
									i_1425_ += i_1429_;
									i_1423_ += anInt8893 * i_1429_;
									i_1424_ += anInt8909 * i_1429_;
								} else
									i_1428_ -= i_1429_;
								if (i_1425_ < i_1428_)
									i_1425_ = i_1428_;
								for (/**/; i_1425_ < 0; i_1425_++) {
									int i_1430_ = (anIntArray11352[((i_1424_ >> 12) * anInt8877 + (i_1423_ >> 12))]);
									if (i_1430_ != 0)
										is_1409_[i_1422_++] = i_1430_;
									else
										i_1422_++;
									i_1424_ += anInt8909;
								}
							}
						}
						i_1420_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				} else {
					int i_1431_ = anInt8903;
					while (i_1431_ < 0) {
						int i_1432_ = i_1431_ + i_1408_;
						if (i_1432_ >= 0) {
							if (i_1432_ >= is.length)
								break;
							int i_1433_ = anInt8892;
							int i_1434_ = anInt8899;
							int i_1435_ = anInt8900 + anInt8902;
							int i_1436_ = anInt8888;
							if (i_1434_ >= 0 && i_1434_ - (anInt8877 << 12) < 0) {
								if (i_1435_ < 0) {
									int i_1437_ = ((anInt8909 - 1 - i_1435_) / anInt8909);
									i_1436_ += i_1437_;
									i_1435_ += anInt8909 * i_1437_;
									i_1433_ += i_1437_;
								}
								int i_1438_;
								if ((i_1438_ = (1 + i_1435_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_1436_)
									i_1436_ = i_1438_;
								int i_1439_ = is[i_1432_] - i;
								int i_1440_ = -is_1407_[i_1432_];
								int i_1441_ = i_1439_ - (i_1433_ - anInt8892);
								if (i_1441_ > 0) {
									i_1433_ += i_1441_;
									i_1436_ += i_1441_;
									i_1434_ += anInt8893 * i_1441_;
									i_1435_ += anInt8909 * i_1441_;
								} else
									i_1440_ -= i_1441_;
								if (i_1436_ < i_1440_)
									i_1436_ = i_1440_;
								for (/**/; i_1436_ < 0; i_1436_++) {
									int i_1442_ = (anIntArray11352[((i_1435_ >> 12) * anInt8877 + (i_1434_ >> 12))]);
									if (i_1442_ != 0)
										is_1409_[i_1433_++] = i_1442_;
									else
										i_1433_++;
									i_1435_ += anInt8909;
								}
							}
						}
						i_1431_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8893 < 0) {
				if (anInt8909 == 0) {
					int i_1443_ = anInt8903;
					while (i_1443_ < 0) {
						int i_1444_ = i_1443_ + i_1408_;
						if (i_1444_ >= 0) {
							if (i_1444_ >= is.length)
								break;
							int i_1445_ = anInt8892;
							int i_1446_ = anInt8899 + anInt8890;
							int i_1447_ = anInt8900;
							int i_1448_ = anInt8888;
							if (i_1447_ >= 0 && i_1447_ - (anInt8880 << 12) < 0) {
								int i_1449_;
								if ((i_1449_ = i_1446_ - (anInt8877 << 12)) >= 0) {
									i_1449_ = (anInt8893 - i_1449_) / anInt8893;
									i_1448_ += i_1449_;
									i_1446_ += anInt8893 * i_1449_;
									i_1445_ += i_1449_;
								}
								if ((i_1449_ = (i_1446_ - anInt8893) / anInt8893) > i_1448_)
									i_1448_ = i_1449_;
								int i_1450_ = is[i_1444_] - i;
								int i_1451_ = -is_1407_[i_1444_];
								int i_1452_ = i_1450_ - (i_1445_ - anInt8892);
								if (i_1452_ > 0) {
									i_1445_ += i_1452_;
									i_1448_ += i_1452_;
									i_1446_ += anInt8893 * i_1452_;
									i_1447_ += anInt8909 * i_1452_;
								} else
									i_1451_ -= i_1452_;
								if (i_1448_ < i_1451_)
									i_1448_ = i_1451_;
								for (/**/; i_1448_ < 0; i_1448_++) {
									int i_1453_ = (anIntArray11352[((i_1447_ >> 12) * anInt8877 + (i_1446_ >> 12))]);
									if (i_1453_ != 0)
										is_1409_[i_1445_++] = i_1453_;
									else
										i_1445_++;
									i_1446_ += anInt8893;
								}
							}
						}
						i_1443_++;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_1454_ = anInt8903;
					while (i_1454_ < 0) {
						int i_1455_ = i_1454_ + i_1408_;
						if (i_1455_ >= 0) {
							if (i_1455_ >= is.length)
								break;
							int i_1456_ = anInt8892;
							int i_1457_ = anInt8899 + anInt8890;
							int i_1458_ = anInt8900 + anInt8902;
							int i_1459_ = anInt8888;
							int i_1460_;
							if ((i_1460_ = i_1457_ - (anInt8877 << 12)) >= 0) {
								i_1460_ = (anInt8893 - i_1460_) / anInt8893;
								i_1459_ += i_1460_;
								i_1457_ += anInt8893 * i_1460_;
								i_1458_ += anInt8909 * i_1460_;
								i_1456_ += i_1460_;
							}
							if ((i_1460_ = (i_1457_ - anInt8893) / anInt8893) > i_1459_)
								i_1459_ = i_1460_;
							if ((i_1460_ = i_1458_ - (anInt8880 << 12)) >= 0) {
								i_1460_ = (anInt8909 - i_1460_) / anInt8909;
								i_1459_ += i_1460_;
								i_1457_ += anInt8893 * i_1460_;
								i_1458_ += anInt8909 * i_1460_;
								i_1456_ += i_1460_;
							}
							if ((i_1460_ = (i_1458_ - anInt8909) / anInt8909) > i_1459_)
								i_1459_ = i_1460_;
							int i_1461_ = is[i_1455_] - i;
							int i_1462_ = -is_1407_[i_1455_];
							int i_1463_ = i_1461_ - (i_1456_ - anInt8892);
							if (i_1463_ > 0) {
								i_1456_ += i_1463_;
								i_1459_ += i_1463_;
								i_1457_ += anInt8893 * i_1463_;
								i_1458_ += anInt8909 * i_1463_;
							} else
								i_1462_ -= i_1463_;
							if (i_1459_ < i_1462_)
								i_1459_ = i_1462_;
							for (/**/; i_1459_ < 0; i_1459_++) {
								int i_1464_ = (anIntArray11352[((i_1458_ >> 12) * anInt8877 + (i_1457_ >> 12))]);
								if (i_1464_ != 0)
									is_1409_[i_1456_++] = i_1464_;
								else
									i_1456_++;
								i_1457_ += anInt8893;
								i_1458_ += anInt8909;
							}
						}
						i_1454_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else {
					int i_1465_ = anInt8903;
					while (i_1465_ < 0) {
						int i_1466_ = i_1465_ + i_1408_;
						if (i_1466_ >= 0) {
							if (i_1466_ >= is.length)
								break;
							int i_1467_ = anInt8892;
							int i_1468_ = anInt8899 + anInt8890;
							int i_1469_ = anInt8900 + anInt8902;
							int i_1470_ = anInt8888;
							int i_1471_;
							if ((i_1471_ = i_1468_ - (anInt8877 << 12)) >= 0) {
								i_1471_ = (anInt8893 - i_1471_) / anInt8893;
								i_1470_ += i_1471_;
								i_1468_ += anInt8893 * i_1471_;
								i_1469_ += anInt8909 * i_1471_;
								i_1467_ += i_1471_;
							}
							if ((i_1471_ = (i_1468_ - anInt8893) / anInt8893) > i_1470_)
								i_1470_ = i_1471_;
							if (i_1469_ < 0) {
								i_1471_ = (anInt8909 - 1 - i_1469_) / anInt8909;
								i_1470_ += i_1471_;
								i_1468_ += anInt8893 * i_1471_;
								i_1469_ += anInt8909 * i_1471_;
								i_1467_ += i_1471_;
							}
							if ((i_1471_ = (1 + i_1469_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_1470_)
								i_1470_ = i_1471_;
							int i_1472_ = is[i_1466_] - i;
							int i_1473_ = -is_1407_[i_1466_];
							int i_1474_ = i_1472_ - (i_1467_ - anInt8892);
							if (i_1474_ > 0) {
								i_1467_ += i_1474_;
								i_1470_ += i_1474_;
								i_1468_ += anInt8893 * i_1474_;
								i_1469_ += anInt8909 * i_1474_;
							} else
								i_1473_ -= i_1474_;
							if (i_1470_ < i_1473_)
								i_1470_ = i_1473_;
							for (/**/; i_1470_ < 0; i_1470_++) {
								int i_1475_ = (anIntArray11352[((i_1469_ >> 12) * anInt8877 + (i_1468_ >> 12))]);
								if (i_1475_ != 0)
									is_1409_[i_1467_++] = i_1475_;
								else
									i_1467_++;
								i_1468_ += anInt8893;
								i_1469_ += anInt8909;
							}
						}
						i_1465_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8909 == 0) {
				int i_1476_ = anInt8903;
				while (i_1476_ < 0) {
					int i_1477_ = i_1476_ + i_1408_;
					if (i_1477_ >= 0) {
						if (i_1477_ >= is.length)
							break;
						int i_1478_ = anInt8892;
						int i_1479_ = anInt8899 + anInt8890;
						int i_1480_ = anInt8900;
						int i_1481_ = anInt8888;
						if (i_1480_ >= 0 && i_1480_ - (anInt8880 << 12) < 0) {
							if (i_1479_ < 0) {
								int i_1482_ = (anInt8893 - 1 - i_1479_) / anInt8893;
								i_1481_ += i_1482_;
								i_1479_ += anInt8893 * i_1482_;
								i_1478_ += i_1482_;
							}
							int i_1483_;
							if ((i_1483_ = (1 + i_1479_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_1481_)
								i_1481_ = i_1483_;
							int i_1484_ = is[i_1477_] - i;
							int i_1485_ = -is_1407_[i_1477_];
							int i_1486_ = i_1484_ - (i_1478_ - anInt8892);
							if (i_1486_ > 0) {
								i_1478_ += i_1486_;
								i_1481_ += i_1486_;
								i_1479_ += anInt8893 * i_1486_;
								i_1480_ += anInt8909 * i_1486_;
							} else
								i_1485_ -= i_1486_;
							if (i_1481_ < i_1485_)
								i_1481_ = i_1485_;
							for (/**/; i_1481_ < 0; i_1481_++) {
								int i_1487_ = (anIntArray11352[((i_1480_ >> 12) * anInt8877 + (i_1479_ >> 12))]);
								if (i_1487_ != 0)
									is_1409_[i_1478_++] = i_1487_;
								else
									i_1478_++;
								i_1479_ += anInt8893;
							}
						}
					}
					i_1476_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else if (anInt8909 < 0) {
				int i_1488_ = anInt8903;
				while (i_1488_ < 0) {
					int i_1489_ = i_1488_ + i_1408_;
					if (i_1489_ >= 0) {
						if (i_1489_ >= is.length)
							break;
						int i_1490_ = anInt8892;
						int i_1491_ = anInt8899 + anInt8890;
						int i_1492_ = anInt8900 + anInt8902;
						int i_1493_ = anInt8888;
						if (i_1491_ < 0) {
							int i_1494_ = (anInt8893 - 1 - i_1491_) / anInt8893;
							i_1493_ += i_1494_;
							i_1491_ += anInt8893 * i_1494_;
							i_1492_ += anInt8909 * i_1494_;
							i_1490_ += i_1494_;
						}
						int i_1495_;
						if ((i_1495_ = (1 + i_1491_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_1493_)
							i_1493_ = i_1495_;
						if ((i_1495_ = i_1492_ - (anInt8880 << 12)) >= 0) {
							i_1495_ = (anInt8909 - i_1495_) / anInt8909;
							i_1493_ += i_1495_;
							i_1491_ += anInt8893 * i_1495_;
							i_1492_ += anInt8909 * i_1495_;
							i_1490_ += i_1495_;
						}
						if ((i_1495_ = (i_1492_ - anInt8909) / anInt8909) > i_1493_)
							i_1493_ = i_1495_;
						int i_1496_ = is[i_1489_] - i;
						int i_1497_ = -is_1407_[i_1489_];
						int i_1498_ = i_1496_ - (i_1490_ - anInt8892);
						if (i_1498_ > 0) {
							i_1490_ += i_1498_;
							i_1493_ += i_1498_;
							i_1491_ += anInt8893 * i_1498_;
							i_1492_ += anInt8909 * i_1498_;
						} else
							i_1497_ -= i_1498_;
						if (i_1493_ < i_1497_)
							i_1493_ = i_1497_;
						for (/**/; i_1493_ < 0; i_1493_++) {
							int i_1499_ = (anIntArray11352[(i_1492_ >> 12) * anInt8877 + (i_1491_ >> 12)]);
							if (i_1499_ != 0)
								is_1409_[i_1490_++] = i_1499_;
							else
								i_1490_++;
							i_1491_ += anInt8893;
							i_1492_ += anInt8909;
						}
					}
					i_1488_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else {
				int i_1500_ = anInt8903;
				while (i_1500_ < 0) {
					int i_1501_ = i_1500_ + i_1408_;
					if (i_1501_ >= 0) {
						if (i_1501_ >= is.length)
							break;
						int i_1502_ = anInt8892;
						int i_1503_ = anInt8899 + anInt8890;
						int i_1504_ = anInt8900 + anInt8902;
						int i_1505_ = anInt8888;
						if (i_1503_ < 0) {
							int i_1506_ = (anInt8893 - 1 - i_1503_) / anInt8893;
							i_1505_ += i_1506_;
							i_1503_ += anInt8893 * i_1506_;
							i_1504_ += anInt8909 * i_1506_;
							i_1502_ += i_1506_;
						}
						int i_1507_;
						if ((i_1507_ = (1 + i_1503_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_1505_)
							i_1505_ = i_1507_;
						if (i_1504_ < 0) {
							i_1507_ = (anInt8909 - 1 - i_1504_) / anInt8909;
							i_1505_ += i_1507_;
							i_1503_ += anInt8893 * i_1507_;
							i_1504_ += anInt8909 * i_1507_;
							i_1502_ += i_1507_;
						}
						if ((i_1507_ = (1 + i_1504_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_1505_)
							i_1505_ = i_1507_;
						int i_1508_ = is[i_1501_] - i;
						int i_1509_ = -is_1407_[i_1501_];
						int i_1510_ = i_1508_ - (i_1502_ - anInt8892);
						if (i_1510_ > 0) {
							i_1502_ += i_1510_;
							i_1505_ += i_1510_;
							i_1503_ += anInt8893 * i_1510_;
							i_1504_ += anInt8909 * i_1510_;
						} else
							i_1509_ -= i_1510_;
						if (i_1505_ < i_1509_)
							i_1505_ = i_1509_;
						for (/**/; i_1505_ < 0; i_1505_++) {
							int i_1511_ = (anIntArray11352[(i_1504_ >> 12) * anInt8877 + (i_1503_ >> 12)]);
							if (i_1511_ != 0)
								is_1409_[i_1502_++] = i_1511_;
							else
								i_1502_++;
							i_1503_ += anInt8893;
							i_1504_ += anInt8909;
						}
					}
					i_1500_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			}
		}
	}

	void method17924(int i, int i_1512_, int[] is, int i_1513_, int i_1514_) {
		if (i_1514_ == 0) {
			if (i_1513_ == 1)
				is[i_1512_] = anIntArray11352[i];
			else if (i_1513_ == 0) {
				int i_1515_ = anIntArray11352[i++];
				int i_1516_ = (i_1515_ & 0xff0000) * anInt8906 & ~0xffffff;
				int i_1517_ = (i_1515_ & 0xff00) * anInt8907 & 0xff0000;
				int i_1518_ = (i_1515_ & 0xff) * anInt8908 & 0xff00;
				is[i_1512_] = (i_1516_ | i_1517_ | i_1518_) >>> 8;
			} else if (i_1513_ == 3) {
				int i_1519_ = anIntArray11352[i++];
				int i_1520_ = anInt8894;
				int i_1521_ = i_1519_ + i_1520_;
				int i_1522_ = (i_1519_ & 0xff00ff) + (i_1520_ & 0xff00ff);
				int i_1523_ = (i_1522_ & 0x1000100) + (i_1521_ - i_1522_ & 0x10000);
				is[i_1512_] = i_1521_ - i_1523_ | i_1523_ - (i_1523_ >>> 8);
			} else if (i_1513_ == 2) {
				int i_1524_ = anIntArray11352[i];
				int i_1525_ = (i_1524_ & 0xff00ff) * anInt8904 & ~0xff00ff;
				int i_1526_ = (i_1524_ & 0xff00) * anInt8904 & 0xff0000;
				is[i_1512_] = ((i_1525_ | i_1526_) >>> 8) + anInt8911;
			} else
				throw new IllegalArgumentException();
		} else if (i_1514_ == 1) {
			if (i_1513_ == 1) {
				int i_1527_ = anIntArray11352[i];
				if (i_1527_ != 0)
					is[i_1512_] = i_1527_;
			} else if (i_1513_ == 0) {
				int i_1528_ = anIntArray11352[i];
				if (i_1528_ != 0) {
					if ((anInt8894 & 0xffffff) == 16777215) {
						int i_1529_ = anInt8894 >>> 24;
						int i_1530_ = 256 - i_1529_;
						int i_1531_ = is[i_1512_];
						is[i_1512_] = ((((i_1528_ & 0xff00ff) * i_1529_ + (i_1531_ & 0xff00ff) * i_1530_) & ~0xff00ff) + (((i_1528_ & 0xff00) * i_1529_ + (i_1531_ & 0xff00) * i_1530_) & 0xff0000)) >> 8;
					} else if (anInt8904 != 255) {
						int i_1532_ = (i_1528_ & 0xff0000) * anInt8906 & ~0xffffff;
						int i_1533_ = (i_1528_ & 0xff00) * anInt8907 & 0xff0000;
						int i_1534_ = (i_1528_ & 0xff) * anInt8908 & 0xff00;
						i_1528_ = (i_1532_ | i_1533_ | i_1534_) >>> 8;
						int i_1535_ = is[i_1512_];
						is[i_1512_] = ((((i_1528_ & 0xff00ff) * anInt8904 + (i_1535_ & 0xff00ff) * anInt8905) & ~0xff00ff) + (((i_1528_ & 0xff00) * anInt8904 + (i_1535_ & 0xff00) * anInt8905) & 0xff0000)) >> 8;
					} else {
						int i_1536_ = (i_1528_ & 0xff0000) * anInt8906 & ~0xffffff;
						int i_1537_ = (i_1528_ & 0xff00) * anInt8907 & 0xff0000;
						int i_1538_ = (i_1528_ & 0xff) * anInt8908 & 0xff00;
						is[i_1512_] = (i_1536_ | i_1537_ | i_1538_) >>> 8;
					}
				}
			} else if (i_1513_ == 3) {
				int i_1539_ = anIntArray11352[i];
				int i_1540_ = anInt8894;
				int i_1541_ = i_1539_ + i_1540_;
				int i_1542_ = (i_1539_ & 0xff00ff) + (i_1540_ & 0xff00ff);
				int i_1543_ = (i_1542_ & 0x1000100) + (i_1541_ - i_1542_ & 0x10000);
				i_1543_ = i_1541_ - i_1543_ | i_1543_ - (i_1543_ >>> 8);
				if (i_1539_ == 0 && anInt8904 != 255) {
					i_1539_ = i_1543_;
					i_1543_ = is[i_1512_];
					i_1543_ = ((((i_1539_ & 0xff00ff) * anInt8904 + (i_1543_ & 0xff00ff) * anInt8905) & ~0xff00ff) + (((i_1539_ & 0xff00) * anInt8904 + (i_1543_ & 0xff00) * anInt8905) & 0xff0000)) >> 8;
				}
				is[i_1512_] = i_1543_;
			} else if (i_1513_ == 2) {
				int i_1544_ = anIntArray11352[i];
				if (i_1544_ != 0) {
					int i_1545_ = (i_1544_ & 0xff00ff) * anInt8904 & ~0xff00ff;
					int i_1546_ = (i_1544_ & 0xff00) * anInt8904 & 0xff0000;
					is[i_1512_++] = ((i_1545_ | i_1546_) >>> 8) + anInt8911;
				}
			} else
				throw new IllegalArgumentException();
		} else if (i_1514_ == 2) {
			if (i_1513_ == 1) {
				int i_1547_ = anIntArray11352[i];
				if (i_1547_ != 0) {
					int i_1548_ = is[i_1512_];
					int i_1549_ = i_1547_ + i_1548_;
					int i_1550_ = (i_1547_ & 0xff00ff) + (i_1548_ & 0xff00ff);
					i_1548_ = (i_1550_ & 0x1000100) + (i_1549_ - i_1550_ & 0x10000);
					is[i_1512_] = i_1549_ - i_1548_ | i_1548_ - (i_1548_ >>> 8);
				}
			} else if (i_1513_ == 0) {
				int i_1551_ = anIntArray11352[i];
				if (i_1551_ != 0) {
					int i_1552_ = (i_1551_ & 0xff0000) * anInt8906 & ~0xffffff;
					int i_1553_ = (i_1551_ & 0xff00) * anInt8907 & 0xff0000;
					int i_1554_ = (i_1551_ & 0xff) * anInt8908 & 0xff00;
					i_1551_ = (i_1552_ | i_1553_ | i_1554_) >>> 8;
					int i_1555_ = is[i_1512_];
					int i_1556_ = i_1551_ + i_1555_;
					int i_1557_ = (i_1551_ & 0xff00ff) + (i_1555_ & 0xff00ff);
					i_1555_ = (i_1557_ & 0x1000100) + (i_1556_ - i_1557_ & 0x10000);
					is[i_1512_] = i_1556_ - i_1555_ | i_1555_ - (i_1555_ >>> 8);
				}
			} else if (i_1513_ == 3) {
				int i_1558_ = anIntArray11352[i];
				int i_1559_ = anInt8894;
				int i_1560_ = i_1558_ + i_1559_;
				int i_1561_ = (i_1558_ & 0xff00ff) + (i_1559_ & 0xff00ff);
				int i_1562_ = (i_1561_ & 0x1000100) + (i_1560_ - i_1561_ & 0x10000);
				i_1558_ = i_1560_ - i_1562_ | i_1562_ - (i_1562_ >>> 8);
				i_1562_ = is[i_1512_];
				i_1560_ = i_1558_ + i_1562_;
				i_1561_ = (i_1558_ & 0xff00ff) + (i_1562_ & 0xff00ff);
				i_1562_ = (i_1561_ & 0x1000100) + (i_1560_ - i_1561_ & 0x10000);
				is[i_1512_] = i_1560_ - i_1562_ | i_1562_ - (i_1562_ >>> 8);
			} else if (i_1513_ == 2) {
				int i_1563_ = anIntArray11352[i];
				if (i_1563_ != 0) {
					int i_1564_ = (i_1563_ & 0xff00ff) * anInt8904 & ~0xff00ff;
					int i_1565_ = (i_1563_ & 0xff00) * anInt8904 & 0xff0000;
					i_1563_ = ((i_1564_ | i_1565_) >>> 8) + anInt8911;
					int i_1566_ = is[i_1512_];
					int i_1567_ = i_1563_ + i_1566_;
					int i_1568_ = (i_1563_ & 0xff00ff) + (i_1566_ & 0xff00ff);
					i_1566_ = (i_1568_ & 0x1000100) + (i_1567_ - i_1568_ & 0x10000);
					is[i_1512_] = i_1567_ - i_1566_ | i_1566_ - (i_1566_ >>> 8);
				}
			}
		} else
			throw new IllegalArgumentException();
	}

	public void method2465(int i, int i_1569_, Class142 class142, int i_1570_, int i_1571_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is != null) {
			i += anInt8879;
			i_1569_ += anInt8895;
			int i_1572_ = 0;
			int i_1573_ = aClass180_Sub1_8876.anInt9387 * -1173855569;
			int i_1574_ = anInt8877;
			int i_1575_ = anInt8880;
			int i_1576_ = i_1573_ - i_1574_;
			int i_1577_ = 0;
			int i_1578_ = i + i_1569_ * i_1573_;
			if (i_1569_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
				int i_1579_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_1569_;
				i_1575_ -= i_1579_;
				i_1569_ = aClass180_Sub1_8876.anInt9392 * -456655989;
				i_1572_ += i_1579_ * i_1574_;
				i_1578_ += i_1579_ * i_1573_;
			}
			if (i_1569_ + i_1575_ > aClass180_Sub1_8876.anInt9393 * -383695469)
				i_1575_ -= (i_1569_ + i_1575_ - aClass180_Sub1_8876.anInt9393 * -383695469);
			if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
				int i_1580_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
				i_1574_ -= i_1580_;
				i = aClass180_Sub1_8876.anInt9383 * 1605202751;
				i_1572_ += i_1580_;
				i_1578_ += i_1580_;
				i_1577_ += i_1580_;
				i_1576_ += i_1580_;
			}
			if (i + i_1574_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
				int i_1581_ = i + i_1574_ - aClass180_Sub1_8876.anInt9391 * 2014358275;
				i_1574_ -= i_1581_;
				i_1577_ += i_1581_;
				i_1576_ += i_1581_;
			}
			if (i_1574_ > 0 && i_1575_ > 0) {
				Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
				int[] is_1582_ = class142_sub1.anIntArray9002;
				int[] is_1583_ = class142_sub1.anIntArray9003;
				int i_1584_ = i_1569_;
				if (i_1571_ > i_1584_) {
					i_1584_ = i_1571_;
					i_1578_ += (i_1571_ - i_1569_) * i_1573_;
					i_1572_ += (i_1571_ - i_1569_) * anInt8877;
				}
				int i_1585_ = (i_1571_ + is_1582_.length < i_1569_ + i_1575_ ? i_1571_ + is_1582_.length : i_1569_ + i_1575_);
				for (int i_1586_ = i_1584_; i_1586_ < i_1585_; i_1586_++) {
					int i_1587_ = is_1582_[i_1586_ - i_1571_] + i_1570_;
					int i_1588_ = is_1583_[i_1586_ - i_1571_];
					int i_1589_ = i_1574_;
					if (i > i_1587_) {
						int i_1590_ = i - i_1587_;
						if (i_1590_ >= i_1588_) {
							i_1572_ += i_1574_ + i_1577_;
							i_1578_ += i_1574_ + i_1576_;
							continue;
						}
						i_1588_ -= i_1590_;
					} else {
						int i_1591_ = i_1587_ - i;
						if (i_1591_ >= i_1574_) {
							i_1572_ += i_1574_ + i_1577_;
							i_1578_ += i_1574_ + i_1576_;
							continue;
						}
						i_1572_ += i_1591_;
						i_1589_ -= i_1591_;
						i_1578_ += i_1591_;
					}
					int i_1592_ = 0;
					if (i_1589_ < i_1588_)
						i_1588_ = i_1589_;
					else
						i_1592_ = i_1589_ - i_1588_;
					for (int i_1593_ = -i_1588_; i_1593_ < 0; i_1593_++) {
						int i_1594_ = anIntArray11352[i_1572_++];
						if (i_1594_ != 0)
							is[i_1578_++] = i_1594_;
						else
							i_1578_++;
					}
					i_1572_ += i_1592_ + i_1577_;
					i_1578_ += i_1592_ + i_1576_;
				}
			}
		}
	}

	void method17925(int i, int i_1595_, int[] is, int i_1596_, int i_1597_) {
		if (i_1597_ == 0) {
			if (i_1596_ == 1)
				is[i_1595_] = anIntArray11352[i];
			else if (i_1596_ == 0) {
				int i_1598_ = anIntArray11352[i++];
				int i_1599_ = (i_1598_ & 0xff0000) * anInt8906 & ~0xffffff;
				int i_1600_ = (i_1598_ & 0xff00) * anInt8907 & 0xff0000;
				int i_1601_ = (i_1598_ & 0xff) * anInt8908 & 0xff00;
				is[i_1595_] = (i_1599_ | i_1600_ | i_1601_) >>> 8;
			} else if (i_1596_ == 3) {
				int i_1602_ = anIntArray11352[i++];
				int i_1603_ = anInt8894;
				int i_1604_ = i_1602_ + i_1603_;
				int i_1605_ = (i_1602_ & 0xff00ff) + (i_1603_ & 0xff00ff);
				int i_1606_ = (i_1605_ & 0x1000100) + (i_1604_ - i_1605_ & 0x10000);
				is[i_1595_] = i_1604_ - i_1606_ | i_1606_ - (i_1606_ >>> 8);
			} else if (i_1596_ == 2) {
				int i_1607_ = anIntArray11352[i];
				int i_1608_ = (i_1607_ & 0xff00ff) * anInt8904 & ~0xff00ff;
				int i_1609_ = (i_1607_ & 0xff00) * anInt8904 & 0xff0000;
				is[i_1595_] = ((i_1608_ | i_1609_) >>> 8) + anInt8911;
			} else
				throw new IllegalArgumentException();
		} else if (i_1597_ == 1) {
			if (i_1596_ == 1) {
				int i_1610_ = anIntArray11352[i];
				if (i_1610_ != 0)
					is[i_1595_] = i_1610_;
			} else if (i_1596_ == 0) {
				int i_1611_ = anIntArray11352[i];
				if (i_1611_ != 0) {
					if ((anInt8894 & 0xffffff) == 16777215) {
						int i_1612_ = anInt8894 >>> 24;
						int i_1613_ = 256 - i_1612_;
						int i_1614_ = is[i_1595_];
						is[i_1595_] = ((((i_1611_ & 0xff00ff) * i_1612_ + (i_1614_ & 0xff00ff) * i_1613_) & ~0xff00ff) + (((i_1611_ & 0xff00) * i_1612_ + (i_1614_ & 0xff00) * i_1613_) & 0xff0000)) >> 8;
					} else if (anInt8904 != 255) {
						int i_1615_ = (i_1611_ & 0xff0000) * anInt8906 & ~0xffffff;
						int i_1616_ = (i_1611_ & 0xff00) * anInt8907 & 0xff0000;
						int i_1617_ = (i_1611_ & 0xff) * anInt8908 & 0xff00;
						i_1611_ = (i_1615_ | i_1616_ | i_1617_) >>> 8;
						int i_1618_ = is[i_1595_];
						is[i_1595_] = ((((i_1611_ & 0xff00ff) * anInt8904 + (i_1618_ & 0xff00ff) * anInt8905) & ~0xff00ff) + (((i_1611_ & 0xff00) * anInt8904 + (i_1618_ & 0xff00) * anInt8905) & 0xff0000)) >> 8;
					} else {
						int i_1619_ = (i_1611_ & 0xff0000) * anInt8906 & ~0xffffff;
						int i_1620_ = (i_1611_ & 0xff00) * anInt8907 & 0xff0000;
						int i_1621_ = (i_1611_ & 0xff) * anInt8908 & 0xff00;
						is[i_1595_] = (i_1619_ | i_1620_ | i_1621_) >>> 8;
					}
				}
			} else if (i_1596_ == 3) {
				int i_1622_ = anIntArray11352[i];
				int i_1623_ = anInt8894;
				int i_1624_ = i_1622_ + i_1623_;
				int i_1625_ = (i_1622_ & 0xff00ff) + (i_1623_ & 0xff00ff);
				int i_1626_ = (i_1625_ & 0x1000100) + (i_1624_ - i_1625_ & 0x10000);
				i_1626_ = i_1624_ - i_1626_ | i_1626_ - (i_1626_ >>> 8);
				if (i_1622_ == 0 && anInt8904 != 255) {
					i_1622_ = i_1626_;
					i_1626_ = is[i_1595_];
					i_1626_ = ((((i_1622_ & 0xff00ff) * anInt8904 + (i_1626_ & 0xff00ff) * anInt8905) & ~0xff00ff) + (((i_1622_ & 0xff00) * anInt8904 + (i_1626_ & 0xff00) * anInt8905) & 0xff0000)) >> 8;
				}
				is[i_1595_] = i_1626_;
			} else if (i_1596_ == 2) {
				int i_1627_ = anIntArray11352[i];
				if (i_1627_ != 0) {
					int i_1628_ = (i_1627_ & 0xff00ff) * anInt8904 & ~0xff00ff;
					int i_1629_ = (i_1627_ & 0xff00) * anInt8904 & 0xff0000;
					is[i_1595_++] = ((i_1628_ | i_1629_) >>> 8) + anInt8911;
				}
			} else
				throw new IllegalArgumentException();
		} else if (i_1597_ == 2) {
			if (i_1596_ == 1) {
				int i_1630_ = anIntArray11352[i];
				if (i_1630_ != 0) {
					int i_1631_ = is[i_1595_];
					int i_1632_ = i_1630_ + i_1631_;
					int i_1633_ = (i_1630_ & 0xff00ff) + (i_1631_ & 0xff00ff);
					i_1631_ = (i_1633_ & 0x1000100) + (i_1632_ - i_1633_ & 0x10000);
					is[i_1595_] = i_1632_ - i_1631_ | i_1631_ - (i_1631_ >>> 8);
				}
			} else if (i_1596_ == 0) {
				int i_1634_ = anIntArray11352[i];
				if (i_1634_ != 0) {
					int i_1635_ = (i_1634_ & 0xff0000) * anInt8906 & ~0xffffff;
					int i_1636_ = (i_1634_ & 0xff00) * anInt8907 & 0xff0000;
					int i_1637_ = (i_1634_ & 0xff) * anInt8908 & 0xff00;
					i_1634_ = (i_1635_ | i_1636_ | i_1637_) >>> 8;
					int i_1638_ = is[i_1595_];
					int i_1639_ = i_1634_ + i_1638_;
					int i_1640_ = (i_1634_ & 0xff00ff) + (i_1638_ & 0xff00ff);
					i_1638_ = (i_1640_ & 0x1000100) + (i_1639_ - i_1640_ & 0x10000);
					is[i_1595_] = i_1639_ - i_1638_ | i_1638_ - (i_1638_ >>> 8);
				}
			} else if (i_1596_ == 3) {
				int i_1641_ = anIntArray11352[i];
				int i_1642_ = anInt8894;
				int i_1643_ = i_1641_ + i_1642_;
				int i_1644_ = (i_1641_ & 0xff00ff) + (i_1642_ & 0xff00ff);
				int i_1645_ = (i_1644_ & 0x1000100) + (i_1643_ - i_1644_ & 0x10000);
				i_1641_ = i_1643_ - i_1645_ | i_1645_ - (i_1645_ >>> 8);
				i_1645_ = is[i_1595_];
				i_1643_ = i_1641_ + i_1645_;
				i_1644_ = (i_1641_ & 0xff00ff) + (i_1645_ & 0xff00ff);
				i_1645_ = (i_1644_ & 0x1000100) + (i_1643_ - i_1644_ & 0x10000);
				is[i_1595_] = i_1643_ - i_1645_ | i_1645_ - (i_1645_ >>> 8);
			} else if (i_1596_ == 2) {
				int i_1646_ = anIntArray11352[i];
				if (i_1646_ != 0) {
					int i_1647_ = (i_1646_ & 0xff00ff) * anInt8904 & ~0xff00ff;
					int i_1648_ = (i_1646_ & 0xff00) * anInt8904 & 0xff0000;
					i_1646_ = ((i_1647_ | i_1648_) >>> 8) + anInt8911;
					int i_1649_ = is[i_1595_];
					int i_1650_ = i_1646_ + i_1649_;
					int i_1651_ = (i_1646_ & 0xff00ff) + (i_1649_ & 0xff00ff);
					i_1649_ = (i_1651_ & 0x1000100) + (i_1650_ - i_1651_ & 0x10000);
					is[i_1595_] = i_1650_ - i_1649_ | i_1649_ - (i_1649_ >>> 8);
				}
			}
		} else
			throw new IllegalArgumentException();
	}

	void method17926(int i, int i_1652_, int[] is, int i_1653_, int i_1654_) {
		if (i_1654_ == 0) {
			if (i_1653_ == 1)
				is[i_1652_] = anIntArray11352[i];
			else if (i_1653_ == 0) {
				int i_1655_ = anIntArray11352[i++];
				int i_1656_ = (i_1655_ & 0xff0000) * anInt8906 & ~0xffffff;
				int i_1657_ = (i_1655_ & 0xff00) * anInt8907 & 0xff0000;
				int i_1658_ = (i_1655_ & 0xff) * anInt8908 & 0xff00;
				is[i_1652_] = (i_1656_ | i_1657_ | i_1658_) >>> 8;
			} else if (i_1653_ == 3) {
				int i_1659_ = anIntArray11352[i++];
				int i_1660_ = anInt8894;
				int i_1661_ = i_1659_ + i_1660_;
				int i_1662_ = (i_1659_ & 0xff00ff) + (i_1660_ & 0xff00ff);
				int i_1663_ = (i_1662_ & 0x1000100) + (i_1661_ - i_1662_ & 0x10000);
				is[i_1652_] = i_1661_ - i_1663_ | i_1663_ - (i_1663_ >>> 8);
			} else if (i_1653_ == 2) {
				int i_1664_ = anIntArray11352[i];
				int i_1665_ = (i_1664_ & 0xff00ff) * anInt8904 & ~0xff00ff;
				int i_1666_ = (i_1664_ & 0xff00) * anInt8904 & 0xff0000;
				is[i_1652_] = ((i_1665_ | i_1666_) >>> 8) + anInt8911;
			} else
				throw new IllegalArgumentException();
		} else if (i_1654_ == 1) {
			if (i_1653_ == 1) {
				int i_1667_ = anIntArray11352[i];
				if (i_1667_ != 0)
					is[i_1652_] = i_1667_;
			} else if (i_1653_ == 0) {
				int i_1668_ = anIntArray11352[i];
				if (i_1668_ != 0) {
					if ((anInt8894 & 0xffffff) == 16777215) {
						int i_1669_ = anInt8894 >>> 24;
						int i_1670_ = 256 - i_1669_;
						int i_1671_ = is[i_1652_];
						is[i_1652_] = ((((i_1668_ & 0xff00ff) * i_1669_ + (i_1671_ & 0xff00ff) * i_1670_) & ~0xff00ff) + (((i_1668_ & 0xff00) * i_1669_ + (i_1671_ & 0xff00) * i_1670_) & 0xff0000)) >> 8;
					} else if (anInt8904 != 255) {
						int i_1672_ = (i_1668_ & 0xff0000) * anInt8906 & ~0xffffff;
						int i_1673_ = (i_1668_ & 0xff00) * anInt8907 & 0xff0000;
						int i_1674_ = (i_1668_ & 0xff) * anInt8908 & 0xff00;
						i_1668_ = (i_1672_ | i_1673_ | i_1674_) >>> 8;
						int i_1675_ = is[i_1652_];
						is[i_1652_] = ((((i_1668_ & 0xff00ff) * anInt8904 + (i_1675_ & 0xff00ff) * anInt8905) & ~0xff00ff) + (((i_1668_ & 0xff00) * anInt8904 + (i_1675_ & 0xff00) * anInt8905) & 0xff0000)) >> 8;
					} else {
						int i_1676_ = (i_1668_ & 0xff0000) * anInt8906 & ~0xffffff;
						int i_1677_ = (i_1668_ & 0xff00) * anInt8907 & 0xff0000;
						int i_1678_ = (i_1668_ & 0xff) * anInt8908 & 0xff00;
						is[i_1652_] = (i_1676_ | i_1677_ | i_1678_) >>> 8;
					}
				}
			} else if (i_1653_ == 3) {
				int i_1679_ = anIntArray11352[i];
				int i_1680_ = anInt8894;
				int i_1681_ = i_1679_ + i_1680_;
				int i_1682_ = (i_1679_ & 0xff00ff) + (i_1680_ & 0xff00ff);
				int i_1683_ = (i_1682_ & 0x1000100) + (i_1681_ - i_1682_ & 0x10000);
				i_1683_ = i_1681_ - i_1683_ | i_1683_ - (i_1683_ >>> 8);
				if (i_1679_ == 0 && anInt8904 != 255) {
					i_1679_ = i_1683_;
					i_1683_ = is[i_1652_];
					i_1683_ = ((((i_1679_ & 0xff00ff) * anInt8904 + (i_1683_ & 0xff00ff) * anInt8905) & ~0xff00ff) + (((i_1679_ & 0xff00) * anInt8904 + (i_1683_ & 0xff00) * anInt8905) & 0xff0000)) >> 8;
				}
				is[i_1652_] = i_1683_;
			} else if (i_1653_ == 2) {
				int i_1684_ = anIntArray11352[i];
				if (i_1684_ != 0) {
					int i_1685_ = (i_1684_ & 0xff00ff) * anInt8904 & ~0xff00ff;
					int i_1686_ = (i_1684_ & 0xff00) * anInt8904 & 0xff0000;
					is[i_1652_++] = ((i_1685_ | i_1686_) >>> 8) + anInt8911;
				}
			} else
				throw new IllegalArgumentException();
		} else if (i_1654_ == 2) {
			if (i_1653_ == 1) {
				int i_1687_ = anIntArray11352[i];
				if (i_1687_ != 0) {
					int i_1688_ = is[i_1652_];
					int i_1689_ = i_1687_ + i_1688_;
					int i_1690_ = (i_1687_ & 0xff00ff) + (i_1688_ & 0xff00ff);
					i_1688_ = (i_1690_ & 0x1000100) + (i_1689_ - i_1690_ & 0x10000);
					is[i_1652_] = i_1689_ - i_1688_ | i_1688_ - (i_1688_ >>> 8);
				}
			} else if (i_1653_ == 0) {
				int i_1691_ = anIntArray11352[i];
				if (i_1691_ != 0) {
					int i_1692_ = (i_1691_ & 0xff0000) * anInt8906 & ~0xffffff;
					int i_1693_ = (i_1691_ & 0xff00) * anInt8907 & 0xff0000;
					int i_1694_ = (i_1691_ & 0xff) * anInt8908 & 0xff00;
					i_1691_ = (i_1692_ | i_1693_ | i_1694_) >>> 8;
					int i_1695_ = is[i_1652_];
					int i_1696_ = i_1691_ + i_1695_;
					int i_1697_ = (i_1691_ & 0xff00ff) + (i_1695_ & 0xff00ff);
					i_1695_ = (i_1697_ & 0x1000100) + (i_1696_ - i_1697_ & 0x10000);
					is[i_1652_] = i_1696_ - i_1695_ | i_1695_ - (i_1695_ >>> 8);
				}
			} else if (i_1653_ == 3) {
				int i_1698_ = anIntArray11352[i];
				int i_1699_ = anInt8894;
				int i_1700_ = i_1698_ + i_1699_;
				int i_1701_ = (i_1698_ & 0xff00ff) + (i_1699_ & 0xff00ff);
				int i_1702_ = (i_1701_ & 0x1000100) + (i_1700_ - i_1701_ & 0x10000);
				i_1698_ = i_1700_ - i_1702_ | i_1702_ - (i_1702_ >>> 8);
				i_1702_ = is[i_1652_];
				i_1700_ = i_1698_ + i_1702_;
				i_1701_ = (i_1698_ & 0xff00ff) + (i_1702_ & 0xff00ff);
				i_1702_ = (i_1701_ & 0x1000100) + (i_1700_ - i_1701_ & 0x10000);
				is[i_1652_] = i_1700_ - i_1702_ | i_1702_ - (i_1702_ >>> 8);
			} else if (i_1653_ == 2) {
				int i_1703_ = anIntArray11352[i];
				if (i_1703_ != 0) {
					int i_1704_ = (i_1703_ & 0xff00ff) * anInt8904 & ~0xff00ff;
					int i_1705_ = (i_1703_ & 0xff00) * anInt8904 & 0xff0000;
					i_1703_ = ((i_1704_ | i_1705_) >>> 8) + anInt8911;
					int i_1706_ = is[i_1652_];
					int i_1707_ = i_1703_ + i_1706_;
					int i_1708_ = (i_1703_ & 0xff00ff) + (i_1706_ & 0xff00ff);
					i_1706_ = (i_1708_ & 0x1000100) + (i_1707_ - i_1708_ & 0x10000);
					is[i_1652_] = i_1707_ - i_1706_ | i_1706_ - (i_1706_ >>> 8);
				}
			}
		} else
			throw new IllegalArgumentException();
	}

	public void method2441(int i, int i_1709_, int i_1710_, int i_1711_, int[] is, int[] is_1712_, int i_1713_, int i_1714_) {
		method17919(i, i_1709_, i_1710_, i_1711_, is, i_1713_, i_1714_);
	}

	public Interface21 method2454() {
		return new Class98(anInt8877, anInt8880, anIntArray11352);
	}

	public Interface21 method2443() {
		return new Class98(anInt8877, anInt8880, anIntArray11352);
	}

	void method17927(int i, int i_1715_, int i_1716_, int i_1717_, int[] is, int i_1718_, int i_1719_) {
		i_1719_ -= i_1716_;
		for (int i_1720_ = 0; i_1720_ < i_1717_; i_1720_++) {
			int i_1721_ = (i_1715_ + i_1720_) * i_1716_ + i;
			for (int i_1722_ = 0; i_1722_ < i_1716_; i_1722_++)
				is[i_1718_++] = anIntArray11352[i_1721_ + i_1722_];
			i_1718_ += i_1719_;
		}
	}
}
