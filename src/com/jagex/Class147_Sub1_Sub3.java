/* Class147_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class147_Sub1_Sub3 extends Class147_Sub1 {
	byte[] aByteArray11392;
	int[] anIntArray11393;

	public void method2453(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is != null) {
			int i_4_ = aClass180_Sub1_8876.anInt9387 * -1173855569;
			i += anInt8879;
			i_0_ += anInt8895;
			int i_5_ = i_0_ * i_4_ + i;
			int i_6_ = 0;
			int i_7_ = anInt8880;
			int i_8_ = anInt8877;
			int i_9_ = i_4_ - i_8_;
			int i_10_ = 0;
			if (i_0_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
				int i_11_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_0_;
				i_7_ -= i_11_;
				i_0_ = aClass180_Sub1_8876.anInt9392 * -456655989;
				i_6_ += i_11_ * i_8_;
				i_5_ += i_11_ * i_4_;
			}
			if (i_0_ + i_7_ > aClass180_Sub1_8876.anInt9393 * -383695469)
				i_7_ -= (i_0_ + i_7_ - aClass180_Sub1_8876.anInt9393 * -383695469);
			if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
				int i_12_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
				i_8_ -= i_12_;
				i = aClass180_Sub1_8876.anInt9383 * 1605202751;
				i_6_ += i_12_;
				i_5_ += i_12_;
				i_10_ += i_12_;
				i_9_ += i_12_;
			}
			if (i + i_8_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
				int i_13_ = i + i_8_ - aClass180_Sub1_8876.anInt9391 * 2014358275;
				i_8_ -= i_13_;
				i_10_ += i_13_;
				i_9_ += i_13_;
			}
			if (i_8_ > 0 && i_7_ > 0) {
				if (i_3_ == 0) {
					if (i_1_ == 1) {
						for (int i_14_ = -i_7_; i_14_ < 0; i_14_++) {
							int i_15_ = i_5_ + i_8_ - 3;
							while (i_5_ < i_15_) {
								is[i_5_++] = (anIntArray11393[aByteArray11392[i_6_++] & 0xff]);
								is[i_5_++] = (anIntArray11393[aByteArray11392[i_6_++] & 0xff]);
								is[i_5_++] = (anIntArray11393[aByteArray11392[i_6_++] & 0xff]);
								is[i_5_++] = (anIntArray11393[aByteArray11392[i_6_++] & 0xff]);
							}
							i_15_ += 3;
							while (i_5_ < i_15_)
								is[i_5_++] = (anIntArray11393[aByteArray11392[i_6_++] & 0xff]);
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else if (i_1_ == 0) {
						int i_16_ = (i_2_ & 0xff0000) >> 16;
						int i_17_ = (i_2_ & 0xff00) >> 8;
						int i_18_ = i_2_ & 0xff;
						for (int i_19_ = -i_7_; i_19_ < 0; i_19_++) {
							for (int i_20_ = -i_8_; i_20_ < 0; i_20_++) {
								int i_21_ = (anIntArray11393[aByteArray11392[i_6_++] & 0xff]);
								int i_22_ = (i_21_ & 0xff0000) * i_16_ & ~0xffffff;
								int i_23_ = (i_21_ & 0xff00) * i_17_ & 0xff0000;
								int i_24_ = (i_21_ & 0xff) * i_18_ & 0xff00;
								is[i_5_++] = (i_22_ | i_23_ | i_24_) >>> 8;
							}
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else if (i_1_ == 3) {
						for (int i_25_ = -i_7_; i_25_ < 0; i_25_++) {
							for (int i_26_ = -i_8_; i_26_ < 0; i_26_++) {
								int i_27_ = (anIntArray11393[aByteArray11392[i_6_++] & 0xff]);
								int i_28_ = i_27_ + i_2_;
								int i_29_ = (i_27_ & 0xff00ff) + (i_2_ & 0xff00ff);
								int i_30_ = ((i_29_ & 0x1000100) + (i_28_ - i_29_ & 0x10000));
								is[i_5_++] = i_28_ - i_30_ | i_30_ - (i_30_ >>> 8);
							}
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else if (i_1_ == 2) {
						int i_31_ = i_2_ >>> 24;
						int i_32_ = 256 - i_31_;
						int i_33_ = (i_2_ & 0xff00ff) * i_32_ & ~0xff00ff;
						int i_34_ = (i_2_ & 0xff00) * i_32_ & 0xff0000;
						i_2_ = (i_33_ | i_34_) >>> 8;
						for (int i_35_ = -i_7_; i_35_ < 0; i_35_++) {
							for (int i_36_ = -i_8_; i_36_ < 0; i_36_++) {
								int i_37_ = (anIntArray11393[aByteArray11392[i_6_++] & 0xff]);
								i_33_ = (i_37_ & 0xff00ff) * i_31_ & ~0xff00ff;
								i_34_ = (i_37_ & 0xff00) * i_31_ & 0xff0000;
								is[i_5_++] = ((i_33_ | i_34_) >>> 8) + i_2_;
							}
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_3_ == 1) {
					if (i_1_ == 1) {
						for (int i_38_ = -i_7_; i_38_ < 0; i_38_++) {
							for (int i_39_ = -i_8_; i_39_ < 0; i_39_++) {
								int i_40_ = aByteArray11392[i_6_++];
								if (i_40_ != 0) {
									int i_41_ = (anIntArray11393[i_40_ & 0xff] | ~0xffffff);
									int i_42_ = 255;
									int i_43_ = 0;
									int i_44_ = is[i_5_];
									is[i_5_++] = (((((i_41_ & 0xff00ff) * i_42_ + (i_44_ & 0xff00ff) * i_43_) & ~0xff00ff) >> 8) + (((((i_41_ & ~0xff00ff) >>> 8) * i_42_) + (((i_44_ & ~0xff00ff) >>> 8) * i_43_)) & ~0xff00ff));
								} else
									i_5_++;
							}
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else if (i_1_ == 0) {
						if ((i_2_ & 0xffffff) == 16777215) {
							int i_45_ = i_2_ >>> 24;
							int i_46_ = 256 - i_45_;
							for (int i_47_ = -i_7_; i_47_ < 0; i_47_++) {
								for (int i_48_ = -i_8_; i_48_ < 0; i_48_++) {
									int i_49_ = aByteArray11392[i_6_++];
									if (i_49_ != 0) {
										int i_50_ = anIntArray11393[i_49_ & 0xff];
										int i_51_ = is[i_5_];
										is[i_5_++] = ((((i_50_ & 0xff00ff) * i_45_ + (i_51_ & 0xff00ff) * i_46_) & ~0xff00ff) + (((i_50_ & 0xff00) * i_45_ + (i_51_ & 0xff00) * i_46_) & 0xff0000)) >> 8;
									} else
										i_5_++;
								}
								i_5_ += i_9_;
								i_6_ += i_10_;
							}
						} else {
							int i_52_ = (i_2_ & 0xff0000) >> 16;
							int i_53_ = (i_2_ & 0xff00) >> 8;
							int i_54_ = i_2_ & 0xff;
							int i_55_ = i_2_ >>> 24;
							int i_56_ = 256 - i_55_;
							for (int i_57_ = -i_7_; i_57_ < 0; i_57_++) {
								for (int i_58_ = -i_8_; i_58_ < 0; i_58_++) {
									int i_59_ = aByteArray11392[i_6_++];
									if (i_59_ != 0) {
										int i_60_ = anIntArray11393[i_59_ & 0xff];
										if (i_55_ != 255) {
											int i_61_ = ((i_60_ & 0xff0000) * i_52_ & ~0xffffff);
											int i_62_ = ((i_60_ & 0xff00) * i_53_ & 0xff0000);
											int i_63_ = ((i_60_ & 0xff) * i_54_ & 0xff00);
											i_60_ = ((i_61_ | i_62_ | i_63_) >>> 8);
											int i_64_ = is[i_5_];
											is[i_5_++] = ((((i_60_ & 0xff00ff) * i_55_ + ((i_64_ & 0xff00ff) * i_56_)) & ~0xff00ff) + (((i_60_ & 0xff00) * i_55_ + ((i_64_ & 0xff00) * i_56_)) & 0xff0000)) >> 8;
										} else {
											int i_65_ = ((i_60_ & 0xff0000) * i_52_ & ~0xffffff);
											int i_66_ = ((i_60_ & 0xff00) * i_53_ & 0xff0000);
											int i_67_ = ((i_60_ & 0xff) * i_54_ & 0xff00);
											is[i_5_++] = (i_65_ | i_66_ | i_67_) >>> 8;
										}
									} else
										i_5_++;
								}
								i_5_ += i_9_;
								i_6_ += i_10_;
							}
						}
					} else if (i_1_ == 3) {
						int i_68_ = i_2_ >>> 24;
						int i_69_ = 256 - i_68_;
						for (int i_70_ = -i_7_; i_70_ < 0; i_70_++) {
							for (int i_71_ = -i_8_; i_71_ < 0; i_71_++) {
								byte i_72_ = aByteArray11392[i_6_++];
								int i_73_ = i_72_ > 0 ? anIntArray11393[i_72_] : 0;
								int i_74_ = i_73_ + i_2_;
								int i_75_ = (i_73_ & 0xff00ff) + (i_2_ & 0xff00ff);
								int i_76_ = ((i_75_ & 0x1000100) + (i_74_ - i_75_ & 0x10000));
								i_76_ = i_74_ - i_76_ | i_76_ - (i_76_ >>> 8);
								if (i_73_ == 0 && i_68_ != 255) {
									i_73_ = i_76_;
									i_76_ = is[i_5_];
									i_76_ = ((((i_73_ & 0xff00ff) * i_68_ + (i_76_ & 0xff00ff) * i_69_) & ~0xff00ff) + (((i_73_ & 0xff00) * i_68_ + (i_76_ & 0xff00) * i_69_) & 0xff0000)) >> 8;
								}
								is[i_5_++] = i_76_;
							}
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else if (i_1_ == 2) {
						int i_77_ = i_2_ >>> 24;
						int i_78_ = 256 - i_77_;
						int i_79_ = (i_2_ & 0xff00ff) * i_78_ & ~0xff00ff;
						int i_80_ = (i_2_ & 0xff00) * i_78_ & 0xff0000;
						i_2_ = (i_79_ | i_80_) >>> 8;
						for (int i_81_ = -i_7_; i_81_ < 0; i_81_++) {
							for (int i_82_ = -i_8_; i_82_ < 0; i_82_++) {
								int i_83_ = aByteArray11392[i_6_++];
								if (i_83_ != 0) {
									int i_84_ = anIntArray11393[i_83_ & 0xff];
									i_79_ = ((i_84_ & 0xff00ff) * i_77_ & ~0xff00ff);
									i_80_ = (i_84_ & 0xff00) * i_77_ & 0xff0000;
									is[i_5_++] = ((i_79_ | i_80_) >>> 8) + i_2_;
								} else
									i_5_++;
							}
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_3_ == 2) {
					if (i_1_ == 1) {
						for (int i_85_ = -i_7_; i_85_ < 0; i_85_++) {
							for (int i_86_ = -i_8_; i_86_ < 0; i_86_++) {
								int i_87_ = aByteArray11392[i_6_++];
								if (i_87_ != 0) {
									int i_88_ = anIntArray11393[i_87_ & 0xff];
									int i_89_ = is[i_5_];
									int i_90_ = i_88_ + i_89_;
									int i_91_ = ((i_88_ & 0xff00ff) + (i_89_ & 0xff00ff));
									i_89_ = (i_91_ & 0x1000100) + (i_90_ - i_91_ & 0x10000);
									is[i_5_++] = i_90_ - i_89_ | i_89_ - (i_89_ >>> 8);
								} else
									i_5_++;
							}
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else if (i_1_ == 0) {
						int i_92_ = (i_2_ & 0xff0000) >> 16;
						int i_93_ = (i_2_ & 0xff00) >> 8;
						int i_94_ = i_2_ & 0xff;
						for (int i_95_ = -i_7_; i_95_ < 0; i_95_++) {
							for (int i_96_ = -i_8_; i_96_ < 0; i_96_++) {
								int i_97_ = aByteArray11392[i_6_++];
								if (i_97_ != 0) {
									int i_98_ = anIntArray11393[i_97_ & 0xff];
									int i_99_ = ((i_98_ & 0xff0000) * i_92_ & ~0xffffff);
									int i_100_ = (i_98_ & 0xff00) * i_93_ & 0xff0000;
									int i_101_ = (i_98_ & 0xff) * i_94_ & 0xff00;
									i_98_ = (i_99_ | i_100_ | i_101_) >>> 8;
									int i_102_ = is[i_5_];
									int i_103_ = i_98_ + i_102_;
									int i_104_ = ((i_98_ & 0xff00ff) + (i_102_ & 0xff00ff));
									i_102_ = ((i_104_ & 0x1000100) + (i_103_ - i_104_ & 0x10000));
									is[i_5_++] = i_103_ - i_102_ | i_102_ - (i_102_ >>> 8);
								} else
									i_5_++;
							}
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else if (i_1_ == 3) {
						for (int i_105_ = -i_7_; i_105_ < 0; i_105_++) {
							for (int i_106_ = -i_8_; i_106_ < 0; i_106_++) {
								byte i_107_ = aByteArray11392[i_6_++];
								int i_108_ = i_107_ > 0 ? anIntArray11393[i_107_] : 0;
								int i_109_ = i_108_ + i_2_;
								int i_110_ = (i_108_ & 0xff00ff) + (i_2_ & 0xff00ff);
								int i_111_ = ((i_110_ & 0x1000100) + (i_109_ - i_110_ & 0x10000));
								i_108_ = i_109_ - i_111_ | i_111_ - (i_111_ >>> 8);
								i_111_ = is[i_5_];
								i_109_ = i_108_ + i_111_;
								i_110_ = (i_108_ & 0xff00ff) + (i_111_ & 0xff00ff);
								i_111_ = (i_110_ & 0x1000100) + (i_109_ - i_110_ & 0x10000);
								is[i_5_++] = i_109_ - i_111_ | i_111_ - (i_111_ >>> 8);
							}
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else if (i_1_ == 2) {
						int i_112_ = i_2_ >>> 24;
						int i_113_ = 256 - i_112_;
						int i_114_ = (i_2_ & 0xff00ff) * i_113_ & ~0xff00ff;
						int i_115_ = (i_2_ & 0xff00) * i_113_ & 0xff0000;
						i_2_ = (i_114_ | i_115_) >>> 8;
						for (int i_116_ = -i_7_; i_116_ < 0; i_116_++) {
							for (int i_117_ = -i_8_; i_117_ < 0; i_117_++) {
								int i_118_ = aByteArray11392[i_6_++];
								if (i_118_ != 0) {
									int i_119_ = anIntArray11393[i_118_ & 0xff];
									i_114_ = ((i_119_ & 0xff00ff) * i_112_ & ~0xff00ff);
									i_115_ = ((i_119_ & 0xff00) * i_112_ & 0xff0000);
									i_119_ = ((i_114_ | i_115_) >>> 8) + i_2_;
									int i_120_ = is[i_5_];
									int i_121_ = i_119_ + i_120_;
									int i_122_ = ((i_119_ & 0xff00ff) + (i_120_ & 0xff00ff));
									i_120_ = ((i_122_ & 0x1000100) + (i_121_ - i_122_ & 0x10000));
									is[i_5_++] = i_121_ - i_120_ | i_120_ - (i_120_ >>> 8);
								} else
									i_5_++;
							}
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2445(int i, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_) {
		throw new IllegalStateException();
	}

	public void method2412(int i, int i_128_, int i_129_, int i_130_, int[] is, int[] is_131_, int i_132_, int i_133_) {
		throw new IllegalStateException();
	}

	void method14426(int[] is, int[] is_134_, int i, int i_135_) {
		int[] is_136_ = aClass180_Sub1_8876.anIntArray9386;
		if (is_136_ != null) {
			if (anInt8893 == 0) {
				if (anInt8909 == 0) {
					int i_137_ = anInt8903;
					while (i_137_ < 0) {
						int i_138_ = i_137_ + i_135_;
						if (i_138_ >= 0) {
							if (i_138_ >= is.length)
								break;
							int i_139_ = anInt8892;
							int i_140_ = anInt8899;
							int i_141_ = anInt8900;
							int i_142_ = anInt8888;
							if (i_140_ >= 0 && i_141_ >= 0 && i_140_ - (anInt8877 << 12) < 0 && i_141_ - (anInt8880 << 12) < 0) {
								int i_143_ = is[i_138_] - i;
								int i_144_ = -is_134_[i_138_];
								int i_145_ = i_143_ - (i_139_ - anInt8892);
								if (i_145_ > 0) {
									i_139_ += i_145_;
									i_142_ += i_145_;
									i_140_ += anInt8893 * i_145_;
									i_141_ += anInt8909 * i_145_;
								} else
									i_144_ -= i_145_;
								if (i_142_ < i_144_)
									i_142_ = i_144_;
								for (/**/; i_142_ < 0; i_142_++) {
									int i_146_ = (aByteArray11392[((i_141_ >> 12) * anInt8877 + (i_140_ >> 12))]);
									if (i_146_ != 0)
										is_136_[i_139_++] = anIntArray11393[i_146_ & 0xff];
									else
										i_139_++;
								}
							}
						}
						i_137_++;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_147_ = anInt8903;
					while (i_147_ < 0) {
						int i_148_ = i_147_ + i_135_;
						if (i_148_ >= 0) {
							if (i_148_ >= is.length)
								break;
							int i_149_ = anInt8892;
							int i_150_ = anInt8899;
							int i_151_ = anInt8900 + anInt8902;
							int i_152_ = anInt8888;
							if (i_150_ >= 0 && i_150_ - (anInt8877 << 12) < 0) {
								int i_153_;
								if ((i_153_ = i_151_ - (anInt8880 << 12)) >= 0) {
									i_153_ = (anInt8909 - i_153_) / anInt8909;
									i_152_ += i_153_;
									i_151_ += anInt8909 * i_153_;
									i_149_ += i_153_;
								}
								if ((i_153_ = (i_151_ - anInt8909) / anInt8909) > i_152_)
									i_152_ = i_153_;
								int i_154_ = is[i_148_] - i;
								int i_155_ = -is_134_[i_148_];
								int i_156_ = i_154_ - (i_149_ - anInt8892);
								if (i_156_ > 0) {
									i_149_ += i_156_;
									i_152_ += i_156_;
									i_150_ += anInt8893 * i_156_;
									i_151_ += anInt8909 * i_156_;
								} else
									i_155_ -= i_156_;
								if (i_152_ < i_155_)
									i_152_ = i_155_;
								for (/**/; i_152_ < 0; i_152_++) {
									int i_157_ = (aByteArray11392[((i_151_ >> 12) * anInt8877 + (i_150_ >> 12))]);
									if (i_157_ != 0)
										is_136_[i_149_++] = anIntArray11393[i_157_ & 0xff];
									else
										i_149_++;
									i_151_ += anInt8909;
								}
							}
						}
						i_147_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				} else {
					int i_158_ = anInt8903;
					while (i_158_ < 0) {
						int i_159_ = i_158_ + i_135_;
						if (i_159_ >= 0) {
							if (i_159_ >= is.length)
								break;
							int i_160_ = anInt8892;
							int i_161_ = anInt8899;
							int i_162_ = anInt8900 + anInt8902;
							int i_163_ = anInt8888;
							if (i_161_ >= 0 && i_161_ - (anInt8877 << 12) < 0) {
								if (i_162_ < 0) {
									int i_164_ = (anInt8909 - 1 - i_162_) / anInt8909;
									i_163_ += i_164_;
									i_162_ += anInt8909 * i_164_;
									i_160_ += i_164_;
								}
								int i_165_;
								if ((i_165_ = (1 + i_162_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_163_)
									i_163_ = i_165_;
								int i_166_ = is[i_159_] - i;
								int i_167_ = -is_134_[i_159_];
								int i_168_ = i_166_ - (i_160_ - anInt8892);
								if (i_168_ > 0) {
									i_160_ += i_168_;
									i_163_ += i_168_;
									i_161_ += anInt8893 * i_168_;
									i_162_ += anInt8909 * i_168_;
								} else
									i_167_ -= i_168_;
								if (i_163_ < i_167_)
									i_163_ = i_167_;
								for (/**/; i_163_ < 0; i_163_++) {
									int i_169_ = (aByteArray11392[((i_162_ >> 12) * anInt8877 + (i_161_ >> 12))]);
									if (i_169_ != 0)
										is_136_[i_160_++] = anIntArray11393[i_169_ & 0xff];
									else
										i_160_++;
									i_162_ += anInt8909;
								}
							}
						}
						i_158_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8893 < 0) {
				if (anInt8909 == 0) {
					int i_170_ = anInt8903;
					while (i_170_ < 0) {
						int i_171_ = i_170_ + i_135_;
						if (i_171_ >= 0) {
							if (i_171_ >= is.length)
								break;
							int i_172_ = anInt8892;
							int i_173_ = anInt8899 + anInt8890;
							int i_174_ = anInt8900;
							int i_175_ = anInt8888;
							if (i_174_ >= 0 && i_174_ - (anInt8880 << 12) < 0) {
								int i_176_;
								if ((i_176_ = i_173_ - (anInt8877 << 12)) >= 0) {
									i_176_ = (anInt8893 - i_176_) / anInt8893;
									i_175_ += i_176_;
									i_173_ += anInt8893 * i_176_;
									i_172_ += i_176_;
								}
								if ((i_176_ = (i_173_ - anInt8893) / anInt8893) > i_175_)
									i_175_ = i_176_;
								int i_177_ = is[i_171_] - i;
								int i_178_ = -is_134_[i_171_];
								int i_179_ = i_177_ - (i_172_ - anInt8892);
								if (i_179_ > 0) {
									i_172_ += i_179_;
									i_175_ += i_179_;
									i_173_ += anInt8893 * i_179_;
									i_174_ += anInt8909 * i_179_;
								} else
									i_178_ -= i_179_;
								if (i_175_ < i_178_)
									i_175_ = i_178_;
								for (/**/; i_175_ < 0; i_175_++) {
									int i_180_ = (aByteArray11392[((i_174_ >> 12) * anInt8877 + (i_173_ >> 12))]);
									if (i_180_ != 0)
										is_136_[i_172_++] = anIntArray11393[i_180_ & 0xff];
									else
										i_172_++;
									i_173_ += anInt8893;
								}
							}
						}
						i_170_++;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_181_ = anInt8903;
					while (i_181_ < 0) {
						int i_182_ = i_181_ + i_135_;
						if (i_182_ >= 0) {
							if (i_182_ >= is.length)
								break;
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
							if ((i_187_ = i_185_ - (anInt8880 << 12)) >= 0) {
								i_187_ = (anInt8909 - i_187_) / anInt8909;
								i_186_ += i_187_;
								i_184_ += anInt8893 * i_187_;
								i_185_ += anInt8909 * i_187_;
								i_183_ += i_187_;
							}
							if ((i_187_ = (i_185_ - anInt8909) / anInt8909) > i_186_)
								i_186_ = i_187_;
							int i_188_ = is[i_182_] - i;
							int i_189_ = -is_134_[i_182_];
							int i_190_ = i_188_ - (i_183_ - anInt8892);
							if (i_190_ > 0) {
								i_183_ += i_190_;
								i_186_ += i_190_;
								i_184_ += anInt8893 * i_190_;
								i_185_ += anInt8909 * i_190_;
							} else
								i_189_ -= i_190_;
							if (i_186_ < i_189_)
								i_186_ = i_189_;
							for (/**/; i_186_ < 0; i_186_++) {
								int i_191_ = (aByteArray11392[(i_185_ >> 12) * anInt8877 + (i_184_ >> 12)]);
								if (i_191_ != 0)
									is_136_[i_183_++] = anIntArray11393[i_191_ & 0xff];
								else
									i_183_++;
								i_184_ += anInt8893;
								i_185_ += anInt8909;
							}
						}
						i_181_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else {
					int i_192_ = anInt8903;
					while (i_192_ < 0) {
						int i_193_ = i_192_ + i_135_;
						if (i_193_ >= 0) {
							if (i_193_ >= is.length)
								break;
							int i_194_ = anInt8892;
							int i_195_ = anInt8899 + anInt8890;
							int i_196_ = anInt8900 + anInt8902;
							int i_197_ = anInt8888;
							int i_198_;
							if ((i_198_ = i_195_ - (anInt8877 << 12)) >= 0) {
								i_198_ = (anInt8893 - i_198_) / anInt8893;
								i_197_ += i_198_;
								i_195_ += anInt8893 * i_198_;
								i_196_ += anInt8909 * i_198_;
								i_194_ += i_198_;
							}
							if ((i_198_ = (i_195_ - anInt8893) / anInt8893) > i_197_)
								i_197_ = i_198_;
							if (i_196_ < 0) {
								i_198_ = (anInt8909 - 1 - i_196_) / anInt8909;
								i_197_ += i_198_;
								i_195_ += anInt8893 * i_198_;
								i_196_ += anInt8909 * i_198_;
								i_194_ += i_198_;
							}
							if ((i_198_ = (1 + i_196_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_197_)
								i_197_ = i_198_;
							int i_199_ = is[i_193_] - i;
							int i_200_ = -is_134_[i_193_];
							int i_201_ = i_199_ - (i_194_ - anInt8892);
							if (i_201_ > 0) {
								i_194_ += i_201_;
								i_197_ += i_201_;
								i_195_ += anInt8893 * i_201_;
								i_196_ += anInt8909 * i_201_;
							} else
								i_200_ -= i_201_;
							if (i_197_ < i_200_)
								i_197_ = i_200_;
							for (/**/; i_197_ < 0; i_197_++) {
								int i_202_ = (aByteArray11392[(i_196_ >> 12) * anInt8877 + (i_195_ >> 12)]);
								if (i_202_ != 0)
									is_136_[i_194_++] = anIntArray11393[i_202_ & 0xff];
								else
									i_194_++;
								i_195_ += anInt8893;
								i_196_ += anInt8909;
							}
						}
						i_192_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8909 == 0) {
				int i_203_ = anInt8903;
				while (i_203_ < 0) {
					int i_204_ = i_203_ + i_135_;
					if (i_204_ >= 0) {
						if (i_204_ >= is.length)
							break;
						int i_205_ = anInt8892;
						int i_206_ = anInt8899 + anInt8890;
						int i_207_ = anInt8900;
						int i_208_ = anInt8888;
						if (i_207_ >= 0 && i_207_ - (anInt8880 << 12) < 0) {
							if (i_206_ < 0) {
								int i_209_ = (anInt8893 - 1 - i_206_) / anInt8893;
								i_208_ += i_209_;
								i_206_ += anInt8893 * i_209_;
								i_205_ += i_209_;
							}
							int i_210_;
							if ((i_210_ = (1 + i_206_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_208_)
								i_208_ = i_210_;
							int i_211_ = is[i_204_] - i;
							int i_212_ = -is_134_[i_204_];
							int i_213_ = i_211_ - (i_205_ - anInt8892);
							if (i_213_ > 0) {
								i_205_ += i_213_;
								i_208_ += i_213_;
								i_206_ += anInt8893 * i_213_;
								i_207_ += anInt8909 * i_213_;
							} else
								i_212_ -= i_213_;
							if (i_208_ < i_212_)
								i_208_ = i_212_;
							for (/**/; i_208_ < 0; i_208_++) {
								int i_214_ = (aByteArray11392[(i_207_ >> 12) * anInt8877 + (i_206_ >> 12)]);
								if (i_214_ != 0)
									is_136_[i_205_++] = anIntArray11393[i_214_ & 0xff];
								else
									i_205_++;
								i_206_ += anInt8893;
							}
						}
					}
					i_203_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else if (anInt8909 < 0) {
				int i_215_ = anInt8903;
				while (i_215_ < 0) {
					int i_216_ = i_215_ + i_135_;
					if (i_216_ >= 0) {
						if (i_216_ >= is.length)
							break;
						int i_217_ = anInt8892;
						int i_218_ = anInt8899 + anInt8890;
						int i_219_ = anInt8900 + anInt8902;
						int i_220_ = anInt8888;
						if (i_218_ < 0) {
							int i_221_ = (anInt8893 - 1 - i_218_) / anInt8893;
							i_220_ += i_221_;
							i_218_ += anInt8893 * i_221_;
							i_219_ += anInt8909 * i_221_;
							i_217_ += i_221_;
						}
						int i_222_;
						if ((i_222_ = (1 + i_218_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_220_)
							i_220_ = i_222_;
						if ((i_222_ = i_219_ - (anInt8880 << 12)) >= 0) {
							i_222_ = (anInt8909 - i_222_) / anInt8909;
							i_220_ += i_222_;
							i_218_ += anInt8893 * i_222_;
							i_219_ += anInt8909 * i_222_;
							i_217_ += i_222_;
						}
						if ((i_222_ = (i_219_ - anInt8909) / anInt8909) > i_220_)
							i_220_ = i_222_;
						int i_223_ = is[i_216_] - i;
						int i_224_ = -is_134_[i_216_];
						int i_225_ = i_223_ - (i_217_ - anInt8892);
						if (i_225_ > 0) {
							i_217_ += i_225_;
							i_220_ += i_225_;
							i_218_ += anInt8893 * i_225_;
							i_219_ += anInt8909 * i_225_;
						} else
							i_224_ -= i_225_;
						if (i_220_ < i_224_)
							i_220_ = i_224_;
						for (/**/; i_220_ < 0; i_220_++) {
							int i_226_ = (aByteArray11392[(i_219_ >> 12) * anInt8877 + (i_218_ >> 12)]);
							if (i_226_ != 0)
								is_136_[i_217_++] = anIntArray11393[i_226_ & 0xff];
							else
								i_217_++;
							i_218_ += anInt8893;
							i_219_ += anInt8909;
						}
					}
					i_215_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else {
				int i_227_ = anInt8903;
				while (i_227_ < 0) {
					int i_228_ = i_227_ + i_135_;
					if (i_228_ >= 0) {
						if (i_228_ >= is.length)
							break;
						int i_229_ = anInt8892;
						int i_230_ = anInt8899 + anInt8890;
						int i_231_ = anInt8900 + anInt8902;
						int i_232_ = anInt8888;
						if (i_230_ < 0) {
							int i_233_ = (anInt8893 - 1 - i_230_) / anInt8893;
							i_232_ += i_233_;
							i_230_ += anInt8893 * i_233_;
							i_231_ += anInt8909 * i_233_;
							i_229_ += i_233_;
						}
						int i_234_;
						if ((i_234_ = (1 + i_230_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_232_)
							i_232_ = i_234_;
						if (i_231_ < 0) {
							i_234_ = (anInt8909 - 1 - i_231_) / anInt8909;
							i_232_ += i_234_;
							i_230_ += anInt8893 * i_234_;
							i_231_ += anInt8909 * i_234_;
							i_229_ += i_234_;
						}
						if ((i_234_ = (1 + i_231_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_232_)
							i_232_ = i_234_;
						int i_235_ = is[i_228_] - i;
						int i_236_ = -is_134_[i_228_];
						int i_237_ = i_235_ - (i_229_ - anInt8892);
						if (i_237_ > 0) {
							i_229_ += i_237_;
							i_232_ += i_237_;
							i_230_ += anInt8893 * i_237_;
							i_231_ += anInt8909 * i_237_;
						} else
							i_236_ -= i_237_;
						if (i_232_ < i_236_)
							i_232_ = i_236_;
						for (/**/; i_232_ < 0; i_232_++) {
							int i_238_ = (aByteArray11392[(i_231_ >> 12) * anInt8877 + (i_230_ >> 12)]);
							if (i_238_ != 0)
								is_136_[i_229_++] = anIntArray11393[i_238_ & 0xff];
							else
								i_229_++;
							i_230_ += anInt8893;
							i_231_ += anInt8909;
						}
					}
					i_227_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			}
		}
	}

	public void method2486(int i, int i_239_, int i_240_) {
		throw new IllegalStateException();
	}

	public Interface21 method2454() {
		throw new IllegalStateException();
	}

	public void method2416(int i, int i_241_, int i_242_, int i_243_, int i_244_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is != null) {
			int i_245_ = aClass180_Sub1_8876.anInt9387 * -1173855569;
			i += anInt8879;
			i_241_ += anInt8895;
			int i_246_ = i_241_ * i_245_ + i;
			int i_247_ = 0;
			int i_248_ = anInt8880;
			int i_249_ = anInt8877;
			int i_250_ = i_245_ - i_249_;
			int i_251_ = 0;
			if (i_241_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
				int i_252_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_241_;
				i_248_ -= i_252_;
				i_241_ = aClass180_Sub1_8876.anInt9392 * -456655989;
				i_247_ += i_252_ * i_249_;
				i_246_ += i_252_ * i_245_;
			}
			if (i_241_ + i_248_ > aClass180_Sub1_8876.anInt9393 * -383695469)
				i_248_ -= (i_241_ + i_248_ - aClass180_Sub1_8876.anInt9393 * -383695469);
			if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
				int i_253_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
				i_249_ -= i_253_;
				i = aClass180_Sub1_8876.anInt9383 * 1605202751;
				i_247_ += i_253_;
				i_246_ += i_253_;
				i_251_ += i_253_;
				i_250_ += i_253_;
			}
			if (i + i_249_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
				int i_254_ = i + i_249_ - aClass180_Sub1_8876.anInt9391 * 2014358275;
				i_249_ -= i_254_;
				i_251_ += i_254_;
				i_250_ += i_254_;
			}
			if (i_249_ > 0 && i_248_ > 0) {
				if (i_244_ == 0) {
					if (i_242_ == 1) {
						for (int i_255_ = -i_248_; i_255_ < 0; i_255_++) {
							int i_256_ = i_246_ + i_249_ - 3;
							while (i_246_ < i_256_) {
								is[i_246_++] = (anIntArray11393[aByteArray11392[i_247_++] & 0xff]);
								is[i_246_++] = (anIntArray11393[aByteArray11392[i_247_++] & 0xff]);
								is[i_246_++] = (anIntArray11393[aByteArray11392[i_247_++] & 0xff]);
								is[i_246_++] = (anIntArray11393[aByteArray11392[i_247_++] & 0xff]);
							}
							i_256_ += 3;
							while (i_246_ < i_256_)
								is[i_246_++] = (anIntArray11393[aByteArray11392[i_247_++] & 0xff]);
							i_246_ += i_250_;
							i_247_ += i_251_;
						}
					} else if (i_242_ == 0) {
						int i_257_ = (i_243_ & 0xff0000) >> 16;
						int i_258_ = (i_243_ & 0xff00) >> 8;
						int i_259_ = i_243_ & 0xff;
						for (int i_260_ = -i_248_; i_260_ < 0; i_260_++) {
							for (int i_261_ = -i_249_; i_261_ < 0; i_261_++) {
								int i_262_ = (anIntArray11393[aByteArray11392[i_247_++] & 0xff]);
								int i_263_ = (i_262_ & 0xff0000) * i_257_ & ~0xffffff;
								int i_264_ = (i_262_ & 0xff00) * i_258_ & 0xff0000;
								int i_265_ = (i_262_ & 0xff) * i_259_ & 0xff00;
								is[i_246_++] = (i_263_ | i_264_ | i_265_) >>> 8;
							}
							i_246_ += i_250_;
							i_247_ += i_251_;
						}
					} else if (i_242_ == 3) {
						for (int i_266_ = -i_248_; i_266_ < 0; i_266_++) {
							for (int i_267_ = -i_249_; i_267_ < 0; i_267_++) {
								int i_268_ = (anIntArray11393[aByteArray11392[i_247_++] & 0xff]);
								int i_269_ = i_268_ + i_243_;
								int i_270_ = ((i_268_ & 0xff00ff) + (i_243_ & 0xff00ff));
								int i_271_ = ((i_270_ & 0x1000100) + (i_269_ - i_270_ & 0x10000));
								is[i_246_++] = i_269_ - i_271_ | i_271_ - (i_271_ >>> 8);
							}
							i_246_ += i_250_;
							i_247_ += i_251_;
						}
					} else if (i_242_ == 2) {
						int i_272_ = i_243_ >>> 24;
						int i_273_ = 256 - i_272_;
						int i_274_ = (i_243_ & 0xff00ff) * i_273_ & ~0xff00ff;
						int i_275_ = (i_243_ & 0xff00) * i_273_ & 0xff0000;
						i_243_ = (i_274_ | i_275_) >>> 8;
						for (int i_276_ = -i_248_; i_276_ < 0; i_276_++) {
							for (int i_277_ = -i_249_; i_277_ < 0; i_277_++) {
								int i_278_ = (anIntArray11393[aByteArray11392[i_247_++] & 0xff]);
								i_274_ = (i_278_ & 0xff00ff) * i_272_ & ~0xff00ff;
								i_275_ = (i_278_ & 0xff00) * i_272_ & 0xff0000;
								is[i_246_++] = ((i_274_ | i_275_) >>> 8) + i_243_;
							}
							i_246_ += i_250_;
							i_247_ += i_251_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_244_ == 1) {
					if (i_242_ == 1) {
						for (int i_279_ = -i_248_; i_279_ < 0; i_279_++) {
							for (int i_280_ = -i_249_; i_280_ < 0; i_280_++) {
								int i_281_ = aByteArray11392[i_247_++];
								if (i_281_ != 0) {
									int i_282_ = (anIntArray11393[i_281_ & 0xff] | ~0xffffff);
									int i_283_ = 255;
									int i_284_ = 0;
									int i_285_ = is[i_246_];
									is[i_246_++] = (((((i_282_ & 0xff00ff) * i_283_ + (i_285_ & 0xff00ff) * i_284_) & ~0xff00ff) >> 8) + (((((i_282_ & ~0xff00ff) >>> 8) * i_283_) + (((i_285_ & ~0xff00ff) >>> 8) * i_284_)) & ~0xff00ff));
								} else
									i_246_++;
							}
							i_246_ += i_250_;
							i_247_ += i_251_;
						}
					} else if (i_242_ == 0) {
						if ((i_243_ & 0xffffff) == 16777215) {
							int i_286_ = i_243_ >>> 24;
							int i_287_ = 256 - i_286_;
							for (int i_288_ = -i_248_; i_288_ < 0; i_288_++) {
								for (int i_289_ = -i_249_; i_289_ < 0; i_289_++) {
									int i_290_ = aByteArray11392[i_247_++];
									if (i_290_ != 0) {
										int i_291_ = anIntArray11393[i_290_ & 0xff];
										int i_292_ = is[i_246_];
										is[i_246_++] = ((((i_291_ & 0xff00ff) * i_286_ + ((i_292_ & 0xff00ff) * i_287_)) & ~0xff00ff) + (((i_291_ & 0xff00) * i_286_ + ((i_292_ & 0xff00) * i_287_)) & 0xff0000)) >> 8;
									} else
										i_246_++;
								}
								i_246_ += i_250_;
								i_247_ += i_251_;
							}
						} else {
							int i_293_ = (i_243_ & 0xff0000) >> 16;
							int i_294_ = (i_243_ & 0xff00) >> 8;
							int i_295_ = i_243_ & 0xff;
							int i_296_ = i_243_ >>> 24;
							int i_297_ = 256 - i_296_;
							for (int i_298_ = -i_248_; i_298_ < 0; i_298_++) {
								for (int i_299_ = -i_249_; i_299_ < 0; i_299_++) {
									int i_300_ = aByteArray11392[i_247_++];
									if (i_300_ != 0) {
										int i_301_ = anIntArray11393[i_300_ & 0xff];
										if (i_296_ != 255) {
											int i_302_ = ((i_301_ & 0xff0000) * i_293_ & ~0xffffff);
											int i_303_ = ((i_301_ & 0xff00) * i_294_ & 0xff0000);
											int i_304_ = ((i_301_ & 0xff) * i_295_ & 0xff00);
											i_301_ = (i_302_ | i_303_ | i_304_) >>> 8;
											int i_305_ = is[i_246_];
											is[i_246_++] = (((((i_301_ & 0xff00ff) * i_296_) + ((i_305_ & 0xff00ff) * i_297_)) & ~0xff00ff) + ((((i_301_ & 0xff00) * i_296_) + ((i_305_ & 0xff00) * i_297_)) & 0xff0000)) >> 8;
										} else {
											int i_306_ = ((i_301_ & 0xff0000) * i_293_ & ~0xffffff);
											int i_307_ = ((i_301_ & 0xff00) * i_294_ & 0xff0000);
											int i_308_ = ((i_301_ & 0xff) * i_295_ & 0xff00);
											is[i_246_++] = (i_306_ | i_307_ | i_308_) >>> 8;
										}
									} else
										i_246_++;
								}
								i_246_ += i_250_;
								i_247_ += i_251_;
							}
						}
					} else if (i_242_ == 3) {
						int i_309_ = i_243_ >>> 24;
						int i_310_ = 256 - i_309_;
						for (int i_311_ = -i_248_; i_311_ < 0; i_311_++) {
							for (int i_312_ = -i_249_; i_312_ < 0; i_312_++) {
								byte i_313_ = aByteArray11392[i_247_++];
								int i_314_ = i_313_ > 0 ? anIntArray11393[i_313_] : 0;
								int i_315_ = i_314_ + i_243_;
								int i_316_ = ((i_314_ & 0xff00ff) + (i_243_ & 0xff00ff));
								int i_317_ = ((i_316_ & 0x1000100) + (i_315_ - i_316_ & 0x10000));
								i_317_ = i_315_ - i_317_ | i_317_ - (i_317_ >>> 8);
								if (i_314_ == 0 && i_309_ != 255) {
									i_314_ = i_317_;
									i_317_ = is[i_246_];
									i_317_ = ((((i_314_ & 0xff00ff) * i_309_ + (i_317_ & 0xff00ff) * i_310_) & ~0xff00ff) + (((i_314_ & 0xff00) * i_309_ + (i_317_ & 0xff00) * i_310_) & 0xff0000)) >> 8;
								}
								is[i_246_++] = i_317_;
							}
							i_246_ += i_250_;
							i_247_ += i_251_;
						}
					} else if (i_242_ == 2) {
						int i_318_ = i_243_ >>> 24;
						int i_319_ = 256 - i_318_;
						int i_320_ = (i_243_ & 0xff00ff) * i_319_ & ~0xff00ff;
						int i_321_ = (i_243_ & 0xff00) * i_319_ & 0xff0000;
						i_243_ = (i_320_ | i_321_) >>> 8;
						for (int i_322_ = -i_248_; i_322_ < 0; i_322_++) {
							for (int i_323_ = -i_249_; i_323_ < 0; i_323_++) {
								int i_324_ = aByteArray11392[i_247_++];
								if (i_324_ != 0) {
									int i_325_ = anIntArray11393[i_324_ & 0xff];
									i_320_ = ((i_325_ & 0xff00ff) * i_318_ & ~0xff00ff);
									i_321_ = ((i_325_ & 0xff00) * i_318_ & 0xff0000);
									is[i_246_++] = ((i_320_ | i_321_) >>> 8) + i_243_;
								} else
									i_246_++;
							}
							i_246_ += i_250_;
							i_247_ += i_251_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_244_ == 2) {
					if (i_242_ == 1) {
						for (int i_326_ = -i_248_; i_326_ < 0; i_326_++) {
							for (int i_327_ = -i_249_; i_327_ < 0; i_327_++) {
								int i_328_ = aByteArray11392[i_247_++];
								if (i_328_ != 0) {
									int i_329_ = anIntArray11393[i_328_ & 0xff];
									int i_330_ = is[i_246_];
									int i_331_ = i_329_ + i_330_;
									int i_332_ = ((i_329_ & 0xff00ff) + (i_330_ & 0xff00ff));
									i_330_ = ((i_332_ & 0x1000100) + (i_331_ - i_332_ & 0x10000));
									is[i_246_++] = i_331_ - i_330_ | i_330_ - (i_330_ >>> 8);
								} else
									i_246_++;
							}
							i_246_ += i_250_;
							i_247_ += i_251_;
						}
					} else if (i_242_ == 0) {
						int i_333_ = (i_243_ & 0xff0000) >> 16;
						int i_334_ = (i_243_ & 0xff00) >> 8;
						int i_335_ = i_243_ & 0xff;
						for (int i_336_ = -i_248_; i_336_ < 0; i_336_++) {
							for (int i_337_ = -i_249_; i_337_ < 0; i_337_++) {
								int i_338_ = aByteArray11392[i_247_++];
								if (i_338_ != 0) {
									int i_339_ = anIntArray11393[i_338_ & 0xff];
									int i_340_ = ((i_339_ & 0xff0000) * i_333_ & ~0xffffff);
									int i_341_ = ((i_339_ & 0xff00) * i_334_ & 0xff0000);
									int i_342_ = (i_339_ & 0xff) * i_335_ & 0xff00;
									i_339_ = (i_340_ | i_341_ | i_342_) >>> 8;
									int i_343_ = is[i_246_];
									int i_344_ = i_339_ + i_343_;
									int i_345_ = ((i_339_ & 0xff00ff) + (i_343_ & 0xff00ff));
									i_343_ = ((i_345_ & 0x1000100) + (i_344_ - i_345_ & 0x10000));
									is[i_246_++] = i_344_ - i_343_ | i_343_ - (i_343_ >>> 8);
								} else
									i_246_++;
							}
							i_246_ += i_250_;
							i_247_ += i_251_;
						}
					} else if (i_242_ == 3) {
						for (int i_346_ = -i_248_; i_346_ < 0; i_346_++) {
							for (int i_347_ = -i_249_; i_347_ < 0; i_347_++) {
								byte i_348_ = aByteArray11392[i_247_++];
								int i_349_ = i_348_ > 0 ? anIntArray11393[i_348_] : 0;
								int i_350_ = i_349_ + i_243_;
								int i_351_ = ((i_349_ & 0xff00ff) + (i_243_ & 0xff00ff));
								int i_352_ = ((i_351_ & 0x1000100) + (i_350_ - i_351_ & 0x10000));
								i_349_ = i_350_ - i_352_ | i_352_ - (i_352_ >>> 8);
								i_352_ = is[i_246_];
								i_350_ = i_349_ + i_352_;
								i_351_ = (i_349_ & 0xff00ff) + (i_352_ & 0xff00ff);
								i_352_ = (i_351_ & 0x1000100) + (i_350_ - i_351_ & 0x10000);
								is[i_246_++] = i_350_ - i_352_ | i_352_ - (i_352_ >>> 8);
							}
							i_246_ += i_250_;
							i_247_ += i_251_;
						}
					} else if (i_242_ == 2) {
						int i_353_ = i_243_ >>> 24;
						int i_354_ = 256 - i_353_;
						int i_355_ = (i_243_ & 0xff00ff) * i_354_ & ~0xff00ff;
						int i_356_ = (i_243_ & 0xff00) * i_354_ & 0xff0000;
						i_243_ = (i_355_ | i_356_) >>> 8;
						for (int i_357_ = -i_248_; i_357_ < 0; i_357_++) {
							for (int i_358_ = -i_249_; i_358_ < 0; i_358_++) {
								int i_359_ = aByteArray11392[i_247_++];
								if (i_359_ != 0) {
									int i_360_ = anIntArray11393[i_359_ & 0xff];
									i_355_ = ((i_360_ & 0xff00ff) * i_353_ & ~0xff00ff);
									i_356_ = ((i_360_ & 0xff00) * i_353_ & 0xff0000);
									i_360_ = ((i_355_ | i_356_) >>> 8) + i_243_;
									int i_361_ = is[i_246_];
									int i_362_ = i_360_ + i_361_;
									int i_363_ = ((i_360_ & 0xff00ff) + (i_361_ & 0xff00ff));
									i_361_ = ((i_363_ & 0x1000100) + (i_362_ - i_363_ & 0x10000));
									is[i_246_++] = i_362_ - i_361_ | i_361_ - (i_361_ >>> 8);
								} else
									i_246_++;
							}
							i_246_ += i_250_;
							i_247_ += i_251_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2465(int i, int i_364_, Class142 class142, int i_365_, int i_366_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is != null) {
			i += anInt8879;
			i_364_ += anInt8895;
			int i_367_ = 0;
			int i_368_ = aClass180_Sub1_8876.anInt9387 * -1173855569;
			int i_369_ = anInt8877;
			int i_370_ = anInt8880;
			int i_371_ = i_368_ - i_369_;
			int i_372_ = 0;
			int i_373_ = i + i_364_ * i_368_;
			if (i_364_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
				int i_374_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_364_;
				i_370_ -= i_374_;
				i_364_ = aClass180_Sub1_8876.anInt9392 * -456655989;
				i_367_ += i_374_ * i_369_;
				i_373_ += i_374_ * i_368_;
			}
			if (i_364_ + i_370_ > aClass180_Sub1_8876.anInt9393 * -383695469)
				i_370_ -= (i_364_ + i_370_ - aClass180_Sub1_8876.anInt9393 * -383695469);
			if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
				int i_375_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
				i_369_ -= i_375_;
				i = aClass180_Sub1_8876.anInt9383 * 1605202751;
				i_367_ += i_375_;
				i_373_ += i_375_;
				i_372_ += i_375_;
				i_371_ += i_375_;
			}
			if (i + i_369_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
				int i_376_ = i + i_369_ - aClass180_Sub1_8876.anInt9391 * 2014358275;
				i_369_ -= i_376_;
				i_372_ += i_376_;
				i_371_ += i_376_;
			}
			if (i_369_ > 0 && i_370_ > 0) {
				Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
				int[] is_377_ = class142_sub1.anIntArray9002;
				int[] is_378_ = class142_sub1.anIntArray9003;
				int i_379_ = i_364_;
				if (i_366_ > i_379_) {
					i_379_ = i_366_;
					i_373_ += (i_366_ - i_364_) * i_368_;
					i_367_ += (i_366_ - i_364_) * anInt8877;
				}
				int i_380_ = (i_366_ + is_377_.length < i_364_ + i_370_ ? i_366_ + is_377_.length : i_364_ + i_370_);
				for (int i_381_ = i_379_; i_381_ < i_380_; i_381_++) {
					int i_382_ = is_377_[i_381_ - i_366_] + i_365_;
					int i_383_ = is_378_[i_381_ - i_366_];
					int i_384_ = i_369_;
					if (i > i_382_) {
						int i_385_ = i - i_382_;
						if (i_385_ >= i_383_) {
							i_367_ += i_369_ + i_372_;
							i_373_ += i_369_ + i_371_;
							continue;
						}
						i_383_ -= i_385_;
					} else {
						int i_386_ = i_382_ - i;
						if (i_386_ >= i_369_) {
							i_367_ += i_369_ + i_372_;
							i_373_ += i_369_ + i_371_;
							continue;
						}
						i_367_ += i_386_;
						i_384_ -= i_386_;
						i_373_ += i_386_;
					}
					int i_387_ = 0;
					if (i_384_ < i_383_)
						i_383_ = i_384_;
					else
						i_387_ = i_384_ - i_383_;
					for (int i_388_ = -i_383_; i_388_ < 0; i_388_++) {
						int i_389_ = aByteArray11392[i_367_++];
						if (i_389_ != 0)
							is[i_373_++] = anIntArray11393[i_389_ & 0xff];
						else
							i_373_++;
					}
					i_367_ += i_387_ + i_372_;
					i_373_ += i_387_ + i_371_;
				}
			}
		}
	}

	public void method2459(int i, int i_390_, int i_391_, int i_392_, int[] is, int i_393_, int i_394_) {
		throw new IllegalStateException();
	}

	void method2420(int i, int i_395_, int i_396_, int i_397_, int i_398_, int i_399_, int i_400_, int i_401_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		if (i_396_ > 0 && i_397_ > 0) {
			int[] is = aClass180_Sub1_8876.anIntArray9386;
			if (is != null) {
				int i_402_ = 0;
				int i_403_ = 0;
				int i_404_ = aClass180_Sub1_8876.anInt9387 * -1173855569;
				int i_405_ = anInt8879 + anInt8877 + anInt8878;
				int i_406_ = anInt8895 + anInt8880 + anInt8882;
				int i_407_ = (i_405_ << 16) / i_396_;
				int i_408_ = (i_406_ << 16) / i_397_;
				if (anInt8879 > 0) {
					int i_409_ = ((anInt8879 << 16) + i_407_ - 1) / i_407_;
					i += i_409_;
					i_402_ += i_409_ * i_407_ - (anInt8879 << 16);
				}
				if (anInt8895 > 0) {
					int i_410_ = ((anInt8895 << 16) + i_408_ - 1) / i_408_;
					i_395_ += i_410_;
					i_403_ += i_410_ * i_408_ - (anInt8895 << 16);
				}
				if (anInt8877 < i_405_)
					i_396_ = ((anInt8877 << 16) - i_402_ + i_407_ - 1) / i_407_;
				if (anInt8880 < i_406_)
					i_397_ = ((anInt8880 << 16) - i_403_ + i_408_ - 1) / i_408_;
				int i_411_ = i + i_395_ * i_404_;
				int i_412_ = i_404_ - i_396_;
				if (i_395_ + i_397_ > aClass180_Sub1_8876.anInt9393 * -383695469)
					i_397_ -= (i_395_ + i_397_ - aClass180_Sub1_8876.anInt9393 * -383695469);
				if (i_395_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
					int i_413_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_395_;
					i_397_ -= i_413_;
					i_411_ += i_413_ * i_404_;
					i_403_ += i_408_ * i_413_;
				}
				if (i + i_396_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
					int i_414_ = (i + i_396_ - aClass180_Sub1_8876.anInt9391 * 2014358275);
					i_396_ -= i_414_;
					i_412_ += i_414_;
				}
				if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
					int i_415_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
					i_396_ -= i_415_;
					i_411_ += i_415_;
					i_402_ += i_407_ * i_415_;
					i_412_ += i_415_;
				}
				if (i_400_ == 0) {
					if (i_398_ == 1) {
						int i_416_ = i_402_;
						for (int i_417_ = -i_397_; i_417_ < 0; i_417_++) {
							int i_418_ = (i_403_ >> 16) * anInt8877;
							for (int i_419_ = -i_396_; i_419_ < 0; i_419_++) {
								is[i_411_++] = (anIntArray11393[(aByteArray11392[(i_402_ >> 16) + i_418_]) & 0xff]);
								i_402_ += i_407_;
							}
							i_403_ += i_408_;
							i_402_ = i_416_;
							i_411_ += i_412_;
						}
					} else if (i_398_ == 0) {
						int i_420_ = (i_399_ & 0xff0000) >> 16;
						int i_421_ = (i_399_ & 0xff00) >> 8;
						int i_422_ = i_399_ & 0xff;
						int i_423_ = i_402_;
						for (int i_424_ = -i_397_; i_424_ < 0; i_424_++) {
							int i_425_ = (i_403_ >> 16) * anInt8877;
							for (int i_426_ = -i_396_; i_426_ < 0; i_426_++) {
								int i_427_ = (anIntArray11393[(aByteArray11392[(i_402_ >> 16) + i_425_]) & 0xff]);
								int i_428_ = (i_427_ & 0xff0000) * i_420_ & ~0xffffff;
								int i_429_ = (i_427_ & 0xff00) * i_421_ & 0xff0000;
								int i_430_ = (i_427_ & 0xff) * i_422_ & 0xff00;
								is[i_411_++] = (i_428_ | i_429_ | i_430_) >>> 8;
								i_402_ += i_407_;
							}
							i_403_ += i_408_;
							i_402_ = i_423_;
							i_411_ += i_412_;
						}
					} else if (i_398_ == 3) {
						int i_431_ = i_402_;
						for (int i_432_ = -i_397_; i_432_ < 0; i_432_++) {
							int i_433_ = (i_403_ >> 16) * anInt8877;
							for (int i_434_ = -i_396_; i_434_ < 0; i_434_++) {
								byte i_435_ = aByteArray11392[(i_402_ >> 16) + i_433_];
								int i_436_ = i_435_ > 0 ? anIntArray11393[i_435_] : 0;
								int i_437_ = i_436_ + i_399_;
								int i_438_ = ((i_436_ & 0xff00ff) + (i_399_ & 0xff00ff));
								int i_439_ = ((i_438_ & 0x1000100) + (i_437_ - i_438_ & 0x10000));
								is[i_411_++] = i_437_ - i_439_ | i_439_ - (i_439_ >>> 8);
								i_402_ += i_407_;
							}
							i_403_ += i_408_;
							i_402_ = i_431_;
							i_411_ += i_412_;
						}
					} else if (i_398_ == 2) {
						int i_440_ = i_399_ >>> 24;
						int i_441_ = 256 - i_440_;
						int i_442_ = (i_399_ & 0xff00ff) * i_441_ & ~0xff00ff;
						int i_443_ = (i_399_ & 0xff00) * i_441_ & 0xff0000;
						i_399_ = (i_442_ | i_443_) >>> 8;
						int i_444_ = i_402_;
						for (int i_445_ = -i_397_; i_445_ < 0; i_445_++) {
							int i_446_ = (i_403_ >> 16) * anInt8877;
							for (int i_447_ = -i_396_; i_447_ < 0; i_447_++) {
								int i_448_ = (anIntArray11393[(aByteArray11392[(i_402_ >> 16) + i_446_]) & 0xff]);
								i_442_ = (i_448_ & 0xff00ff) * i_440_ & ~0xff00ff;
								i_443_ = (i_448_ & 0xff00) * i_440_ & 0xff0000;
								is[i_411_++] = ((i_442_ | i_443_) >>> 8) + i_399_;
								i_402_ += i_407_;
							}
							i_403_ += i_408_;
							i_402_ = i_444_;
							i_411_ += i_412_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_400_ == 1) {
					if (i_398_ == 1) {
						int i_449_ = i_402_;
						for (int i_450_ = -i_397_; i_450_ < 0; i_450_++) {
							int i_451_ = (i_403_ >> 16) * anInt8877;
							for (int i_452_ = -i_396_; i_452_ < 0; i_452_++) {
								int i_453_ = aByteArray11392[(i_402_ >> 16) + i_451_];
								if (i_453_ != 0)
									is[i_411_++] = anIntArray11393[i_453_ & 0xff];
								else
									i_411_++;
								i_402_ += i_407_;
							}
							i_403_ += i_408_;
							i_402_ = i_449_;
							i_411_ += i_412_;
						}
					} else if (i_398_ == 0) {
						int i_454_ = i_402_;
						if ((i_399_ & 0xffffff) == 16777215) {
							int i_455_ = i_399_ >>> 24;
							int i_456_ = 256 - i_455_;
							for (int i_457_ = -i_397_; i_457_ < 0; i_457_++) {
								int i_458_ = (i_403_ >> 16) * anInt8877;
								for (int i_459_ = -i_396_; i_459_ < 0; i_459_++) {
									int i_460_ = (aByteArray11392[(i_402_ >> 16) + i_458_]);
									if (i_460_ != 0) {
										int i_461_ = anIntArray11393[i_460_ & 0xff];
										int i_462_ = is[i_411_];
										is[i_411_++] = ((((i_461_ & 0xff00ff) * i_455_ + ((i_462_ & 0xff00ff) * i_456_)) & ~0xff00ff) + (((i_461_ & 0xff00) * i_455_ + ((i_462_ & 0xff00) * i_456_)) & 0xff0000)) >> 8;
									} else
										i_411_++;
									i_402_ += i_407_;
								}
								i_403_ += i_408_;
								i_402_ = i_454_;
								i_411_ += i_412_;
							}
						} else {
							int i_463_ = (i_399_ & 0xff0000) >> 16;
							int i_464_ = (i_399_ & 0xff00) >> 8;
							int i_465_ = i_399_ & 0xff;
							int i_466_ = i_399_ >>> 24;
							int i_467_ = 256 - i_466_;
							for (int i_468_ = -i_397_; i_468_ < 0; i_468_++) {
								int i_469_ = (i_403_ >> 16) * anInt8877;
								for (int i_470_ = -i_396_; i_470_ < 0; i_470_++) {
									int i_471_ = (aByteArray11392[(i_402_ >> 16) + i_469_]);
									if (i_471_ != 0) {
										int i_472_ = anIntArray11393[i_471_ & 0xff];
										if (i_466_ != 255) {
											int i_473_ = ((i_472_ & 0xff0000) * i_463_ & ~0xffffff);
											int i_474_ = ((i_472_ & 0xff00) * i_464_ & 0xff0000);
											int i_475_ = ((i_472_ & 0xff) * i_465_ & 0xff00);
											i_472_ = (i_473_ | i_474_ | i_475_) >>> 8;
											int i_476_ = is[i_411_];
											is[i_411_++] = (((((i_472_ & 0xff00ff) * i_466_) + ((i_476_ & 0xff00ff) * i_467_)) & ~0xff00ff) + ((((i_472_ & 0xff00) * i_466_) + ((i_476_ & 0xff00) * i_467_)) & 0xff0000)) >> 8;
										} else {
											int i_477_ = ((i_472_ & 0xff0000) * i_463_ & ~0xffffff);
											int i_478_ = ((i_472_ & 0xff00) * i_464_ & 0xff0000);
											int i_479_ = ((i_472_ & 0xff) * i_465_ & 0xff00);
											is[i_411_++] = (i_477_ | i_478_ | i_479_) >>> 8;
										}
									} else
										i_411_++;
									i_402_ += i_407_;
								}
								i_403_ += i_408_;
								i_402_ = i_454_;
								i_411_ += i_412_;
							}
						}
					} else if (i_398_ == 3) {
						int i_480_ = i_402_;
						int i_481_ = i_399_ >>> 24;
						int i_482_ = 256 - i_481_;
						for (int i_483_ = -i_397_; i_483_ < 0; i_483_++) {
							int i_484_ = (i_403_ >> 16) * anInt8877;
							for (int i_485_ = -i_396_; i_485_ < 0; i_485_++) {
								byte i_486_ = aByteArray11392[(i_402_ >> 16) + i_484_];
								int i_487_ = i_486_ > 0 ? anIntArray11393[i_486_] : 0;
								int i_488_ = i_487_ + i_399_;
								int i_489_ = ((i_487_ & 0xff00ff) + (i_399_ & 0xff00ff));
								int i_490_ = ((i_489_ & 0x1000100) + (i_488_ - i_489_ & 0x10000));
								i_490_ = i_488_ - i_490_ | i_490_ - (i_490_ >>> 8);
								if (i_487_ == 0 && i_481_ != 255) {
									i_487_ = i_490_;
									i_490_ = is[i_411_];
									i_490_ = ((((i_487_ & 0xff00ff) * i_481_ + (i_490_ & 0xff00ff) * i_482_) & ~0xff00ff) + (((i_487_ & 0xff00) * i_481_ + (i_490_ & 0xff00) * i_482_) & 0xff0000)) >> 8;
								}
								is[i_411_++] = i_490_;
								i_402_ += i_407_;
							}
							i_403_ += i_408_;
							i_402_ = i_480_;
							i_411_ += i_412_;
						}
					} else if (i_398_ == 2) {
						int i_491_ = i_399_ >>> 24;
						int i_492_ = 256 - i_491_;
						int i_493_ = (i_399_ & 0xff00ff) * i_492_ & ~0xff00ff;
						int i_494_ = (i_399_ & 0xff00) * i_492_ & 0xff0000;
						i_399_ = (i_493_ | i_494_) >>> 8;
						int i_495_ = i_402_;
						for (int i_496_ = -i_397_; i_496_ < 0; i_496_++) {
							int i_497_ = (i_403_ >> 16) * anInt8877;
							for (int i_498_ = -i_396_; i_498_ < 0; i_498_++) {
								int i_499_ = aByteArray11392[(i_402_ >> 16) + i_497_];
								if (i_499_ != 0) {
									int i_500_ = anIntArray11393[i_499_ & 0xff];
									i_493_ = ((i_500_ & 0xff00ff) * i_491_ & ~0xff00ff);
									i_494_ = ((i_500_ & 0xff00) * i_491_ & 0xff0000);
									is[i_411_++] = ((i_493_ | i_494_) >>> 8) + i_399_;
								} else
									i_411_++;
								i_402_ += i_407_;
							}
							i_403_ += i_408_;
							i_402_ = i_495_;
							i_411_ += i_412_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_400_ == 2) {
					if (i_398_ == 1) {
						int i_501_ = i_402_;
						for (int i_502_ = -i_397_; i_502_ < 0; i_502_++) {
							int i_503_ = (i_403_ >> 16) * anInt8877;
							for (int i_504_ = -i_396_; i_504_ < 0; i_504_++) {
								int i_505_ = aByteArray11392[(i_402_ >> 16) + i_503_];
								if (i_505_ != 0) {
									int i_506_ = anIntArray11393[i_505_ & 0xff];
									int i_507_ = is[i_411_];
									int i_508_ = i_506_ + i_507_;
									int i_509_ = ((i_506_ & 0xff00ff) + (i_507_ & 0xff00ff));
									i_507_ = ((i_509_ & 0x1000100) + (i_508_ - i_509_ & 0x10000));
									is[i_411_++] = i_508_ - i_507_ | i_507_ - (i_507_ >>> 8);
								} else
									i_411_++;
								i_402_ += i_407_;
							}
							i_403_ += i_408_;
							i_402_ = i_501_;
							i_411_ += i_412_;
						}
					} else if (i_398_ == 0) {
						int i_510_ = i_402_;
						int i_511_ = (i_399_ & 0xff0000) >> 16;
						int i_512_ = (i_399_ & 0xff00) >> 8;
						int i_513_ = i_399_ & 0xff;
						for (int i_514_ = -i_397_; i_514_ < 0; i_514_++) {
							int i_515_ = (i_403_ >> 16) * anInt8877;
							for (int i_516_ = -i_396_; i_516_ < 0; i_516_++) {
								int i_517_ = aByteArray11392[(i_402_ >> 16) + i_515_];
								if (i_517_ != 0) {
									int i_518_ = anIntArray11393[i_517_ & 0xff];
									int i_519_ = ((i_518_ & 0xff0000) * i_511_ & ~0xffffff);
									int i_520_ = ((i_518_ & 0xff00) * i_512_ & 0xff0000);
									int i_521_ = (i_518_ & 0xff) * i_513_ & 0xff00;
									i_518_ = (i_519_ | i_520_ | i_521_) >>> 8;
									int i_522_ = is[i_411_];
									int i_523_ = i_518_ + i_522_;
									int i_524_ = ((i_518_ & 0xff00ff) + (i_522_ & 0xff00ff));
									i_522_ = ((i_524_ & 0x1000100) + (i_523_ - i_524_ & 0x10000));
									is[i_411_++] = i_523_ - i_522_ | i_522_ - (i_522_ >>> 8);
								} else
									i_411_++;
								i_402_ += i_407_;
							}
							i_403_ += i_408_;
							i_402_ = i_510_;
							i_411_ += i_412_;
						}
					} else if (i_398_ == 3) {
						int i_525_ = i_402_;
						for (int i_526_ = -i_397_; i_526_ < 0; i_526_++) {
							int i_527_ = (i_403_ >> 16) * anInt8877;
							for (int i_528_ = -i_396_; i_528_ < 0; i_528_++) {
								byte i_529_ = aByteArray11392[(i_402_ >> 16) + i_527_];
								int i_530_ = i_529_ > 0 ? anIntArray11393[i_529_] : 0;
								int i_531_ = i_530_ + i_399_;
								int i_532_ = ((i_530_ & 0xff00ff) + (i_399_ & 0xff00ff));
								int i_533_ = ((i_532_ & 0x1000100) + (i_531_ - i_532_ & 0x10000));
								i_530_ = i_531_ - i_533_ | i_533_ - (i_533_ >>> 8);
								i_533_ = is[i_411_];
								i_531_ = i_530_ + i_533_;
								i_532_ = (i_530_ & 0xff00ff) + (i_533_ & 0xff00ff);
								i_533_ = (i_532_ & 0x1000100) + (i_531_ - i_532_ & 0x10000);
								is[i_411_++] = i_531_ - i_533_ | i_533_ - (i_533_ >>> 8);
								i_402_ += i_407_;
							}
							i_403_ += i_408_;
							i_402_ = i_525_;
							i_411_ += i_412_;
						}
					} else if (i_398_ == 2) {
						int i_534_ = i_399_ >>> 24;
						int i_535_ = 256 - i_534_;
						int i_536_ = (i_399_ & 0xff00ff) * i_535_ & ~0xff00ff;
						int i_537_ = (i_399_ & 0xff00) * i_535_ & 0xff0000;
						i_399_ = (i_536_ | i_537_) >>> 8;
						int i_538_ = i_402_;
						for (int i_539_ = -i_397_; i_539_ < 0; i_539_++) {
							int i_540_ = (i_403_ >> 16) * anInt8877;
							for (int i_541_ = -i_396_; i_541_ < 0; i_541_++) {
								int i_542_ = aByteArray11392[(i_402_ >> 16) + i_540_];
								if (i_542_ != 0) {
									int i_543_ = anIntArray11393[i_542_ & 0xff];
									i_536_ = ((i_543_ & 0xff00ff) * i_534_ & ~0xff00ff);
									i_537_ = ((i_543_ & 0xff00) * i_534_ & 0xff0000);
									i_543_ = ((i_536_ | i_537_) >>> 8) + i_399_;
									int i_544_ = is[i_411_];
									int i_545_ = i_543_ + i_544_;
									int i_546_ = ((i_543_ & 0xff00ff) + (i_544_ & 0xff00ff));
									i_544_ = ((i_546_ & 0x1000100) + (i_545_ - i_546_ & 0x10000));
									is[i_411_++] = i_545_ - i_544_ | i_544_ - (i_544_ >>> 8);
								} else
									i_411_++;
								i_402_ += i_407_;
							}
							i_403_ += i_408_;
							i_402_ = i_538_;
							i_411_ += i_412_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2444(int i, int i_547_, int i_548_, int i_549_, int[] is, int i_550_, int i_551_) {
		throw new IllegalStateException();
	}

	public Interface21 method2462() {
		throw new IllegalStateException();
	}

	void method2472(int i, int i_552_, int i_553_, int i_554_, int i_555_, int i_556_, int i_557_, int i_558_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		if (i_553_ > 0 && i_554_ > 0) {
			int[] is = aClass180_Sub1_8876.anIntArray9386;
			if (is != null) {
				int i_559_ = 0;
				int i_560_ = 0;
				int i_561_ = aClass180_Sub1_8876.anInt9387 * -1173855569;
				int i_562_ = anInt8879 + anInt8877 + anInt8878;
				int i_563_ = anInt8895 + anInt8880 + anInt8882;
				int i_564_ = (i_562_ << 16) / i_553_;
				int i_565_ = (i_563_ << 16) / i_554_;
				if (anInt8879 > 0) {
					int i_566_ = ((anInt8879 << 16) + i_564_ - 1) / i_564_;
					i += i_566_;
					i_559_ += i_566_ * i_564_ - (anInt8879 << 16);
				}
				if (anInt8895 > 0) {
					int i_567_ = ((anInt8895 << 16) + i_565_ - 1) / i_565_;
					i_552_ += i_567_;
					i_560_ += i_567_ * i_565_ - (anInt8895 << 16);
				}
				if (anInt8877 < i_562_)
					i_553_ = ((anInt8877 << 16) - i_559_ + i_564_ - 1) / i_564_;
				if (anInt8880 < i_563_)
					i_554_ = ((anInt8880 << 16) - i_560_ + i_565_ - 1) / i_565_;
				int i_568_ = i + i_552_ * i_561_;
				int i_569_ = i_561_ - i_553_;
				if (i_552_ + i_554_ > aClass180_Sub1_8876.anInt9393 * -383695469)
					i_554_ -= (i_552_ + i_554_ - aClass180_Sub1_8876.anInt9393 * -383695469);
				if (i_552_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
					int i_570_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_552_;
					i_554_ -= i_570_;
					i_568_ += i_570_ * i_561_;
					i_560_ += i_565_ * i_570_;
				}
				if (i + i_553_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
					int i_571_ = (i + i_553_ - aClass180_Sub1_8876.anInt9391 * 2014358275);
					i_553_ -= i_571_;
					i_569_ += i_571_;
				}
				if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
					int i_572_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
					i_553_ -= i_572_;
					i_568_ += i_572_;
					i_559_ += i_564_ * i_572_;
					i_569_ += i_572_;
				}
				if (i_557_ == 0) {
					if (i_555_ == 1) {
						int i_573_ = i_559_;
						for (int i_574_ = -i_554_; i_574_ < 0; i_574_++) {
							int i_575_ = (i_560_ >> 16) * anInt8877;
							for (int i_576_ = -i_553_; i_576_ < 0; i_576_++) {
								is[i_568_++] = (anIntArray11393[(aByteArray11392[(i_559_ >> 16) + i_575_]) & 0xff]);
								i_559_ += i_564_;
							}
							i_560_ += i_565_;
							i_559_ = i_573_;
							i_568_ += i_569_;
						}
					} else if (i_555_ == 0) {
						int i_577_ = (i_556_ & 0xff0000) >> 16;
						int i_578_ = (i_556_ & 0xff00) >> 8;
						int i_579_ = i_556_ & 0xff;
						int i_580_ = i_559_;
						for (int i_581_ = -i_554_; i_581_ < 0; i_581_++) {
							int i_582_ = (i_560_ >> 16) * anInt8877;
							for (int i_583_ = -i_553_; i_583_ < 0; i_583_++) {
								int i_584_ = (anIntArray11393[(aByteArray11392[(i_559_ >> 16) + i_582_]) & 0xff]);
								int i_585_ = (i_584_ & 0xff0000) * i_577_ & ~0xffffff;
								int i_586_ = (i_584_ & 0xff00) * i_578_ & 0xff0000;
								int i_587_ = (i_584_ & 0xff) * i_579_ & 0xff00;
								is[i_568_++] = (i_585_ | i_586_ | i_587_) >>> 8;
								i_559_ += i_564_;
							}
							i_560_ += i_565_;
							i_559_ = i_580_;
							i_568_ += i_569_;
						}
					} else if (i_555_ == 3) {
						int i_588_ = i_559_;
						for (int i_589_ = -i_554_; i_589_ < 0; i_589_++) {
							int i_590_ = (i_560_ >> 16) * anInt8877;
							for (int i_591_ = -i_553_; i_591_ < 0; i_591_++) {
								byte i_592_ = aByteArray11392[(i_559_ >> 16) + i_590_];
								int i_593_ = i_592_ > 0 ? anIntArray11393[i_592_] : 0;
								int i_594_ = i_593_ + i_556_;
								int i_595_ = ((i_593_ & 0xff00ff) + (i_556_ & 0xff00ff));
								int i_596_ = ((i_595_ & 0x1000100) + (i_594_ - i_595_ & 0x10000));
								is[i_568_++] = i_594_ - i_596_ | i_596_ - (i_596_ >>> 8);
								i_559_ += i_564_;
							}
							i_560_ += i_565_;
							i_559_ = i_588_;
							i_568_ += i_569_;
						}
					} else if (i_555_ == 2) {
						int i_597_ = i_556_ >>> 24;
						int i_598_ = 256 - i_597_;
						int i_599_ = (i_556_ & 0xff00ff) * i_598_ & ~0xff00ff;
						int i_600_ = (i_556_ & 0xff00) * i_598_ & 0xff0000;
						i_556_ = (i_599_ | i_600_) >>> 8;
						int i_601_ = i_559_;
						for (int i_602_ = -i_554_; i_602_ < 0; i_602_++) {
							int i_603_ = (i_560_ >> 16) * anInt8877;
							for (int i_604_ = -i_553_; i_604_ < 0; i_604_++) {
								int i_605_ = (anIntArray11393[(aByteArray11392[(i_559_ >> 16) + i_603_]) & 0xff]);
								i_599_ = (i_605_ & 0xff00ff) * i_597_ & ~0xff00ff;
								i_600_ = (i_605_ & 0xff00) * i_597_ & 0xff0000;
								is[i_568_++] = ((i_599_ | i_600_) >>> 8) + i_556_;
								i_559_ += i_564_;
							}
							i_560_ += i_565_;
							i_559_ = i_601_;
							i_568_ += i_569_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_557_ == 1) {
					if (i_555_ == 1) {
						int i_606_ = i_559_;
						for (int i_607_ = -i_554_; i_607_ < 0; i_607_++) {
							int i_608_ = (i_560_ >> 16) * anInt8877;
							for (int i_609_ = -i_553_; i_609_ < 0; i_609_++) {
								int i_610_ = aByteArray11392[(i_559_ >> 16) + i_608_];
								if (i_610_ != 0)
									is[i_568_++] = anIntArray11393[i_610_ & 0xff];
								else
									i_568_++;
								i_559_ += i_564_;
							}
							i_560_ += i_565_;
							i_559_ = i_606_;
							i_568_ += i_569_;
						}
					} else if (i_555_ == 0) {
						int i_611_ = i_559_;
						if ((i_556_ & 0xffffff) == 16777215) {
							int i_612_ = i_556_ >>> 24;
							int i_613_ = 256 - i_612_;
							for (int i_614_ = -i_554_; i_614_ < 0; i_614_++) {
								int i_615_ = (i_560_ >> 16) * anInt8877;
								for (int i_616_ = -i_553_; i_616_ < 0; i_616_++) {
									int i_617_ = (aByteArray11392[(i_559_ >> 16) + i_615_]);
									if (i_617_ != 0) {
										int i_618_ = anIntArray11393[i_617_ & 0xff];
										int i_619_ = is[i_568_];
										is[i_568_++] = ((((i_618_ & 0xff00ff) * i_612_ + ((i_619_ & 0xff00ff) * i_613_)) & ~0xff00ff) + (((i_618_ & 0xff00) * i_612_ + ((i_619_ & 0xff00) * i_613_)) & 0xff0000)) >> 8;
									} else
										i_568_++;
									i_559_ += i_564_;
								}
								i_560_ += i_565_;
								i_559_ = i_611_;
								i_568_ += i_569_;
							}
						} else {
							int i_620_ = (i_556_ & 0xff0000) >> 16;
							int i_621_ = (i_556_ & 0xff00) >> 8;
							int i_622_ = i_556_ & 0xff;
							int i_623_ = i_556_ >>> 24;
							int i_624_ = 256 - i_623_;
							for (int i_625_ = -i_554_; i_625_ < 0; i_625_++) {
								int i_626_ = (i_560_ >> 16) * anInt8877;
								for (int i_627_ = -i_553_; i_627_ < 0; i_627_++) {
									int i_628_ = (aByteArray11392[(i_559_ >> 16) + i_626_]);
									if (i_628_ != 0) {
										int i_629_ = anIntArray11393[i_628_ & 0xff];
										if (i_623_ != 255) {
											int i_630_ = ((i_629_ & 0xff0000) * i_620_ & ~0xffffff);
											int i_631_ = ((i_629_ & 0xff00) * i_621_ & 0xff0000);
											int i_632_ = ((i_629_ & 0xff) * i_622_ & 0xff00);
											i_629_ = (i_630_ | i_631_ | i_632_) >>> 8;
											int i_633_ = is[i_568_];
											is[i_568_++] = (((((i_629_ & 0xff00ff) * i_623_) + ((i_633_ & 0xff00ff) * i_624_)) & ~0xff00ff) + ((((i_629_ & 0xff00) * i_623_) + ((i_633_ & 0xff00) * i_624_)) & 0xff0000)) >> 8;
										} else {
											int i_634_ = ((i_629_ & 0xff0000) * i_620_ & ~0xffffff);
											int i_635_ = ((i_629_ & 0xff00) * i_621_ & 0xff0000);
											int i_636_ = ((i_629_ & 0xff) * i_622_ & 0xff00);
											is[i_568_++] = (i_634_ | i_635_ | i_636_) >>> 8;
										}
									} else
										i_568_++;
									i_559_ += i_564_;
								}
								i_560_ += i_565_;
								i_559_ = i_611_;
								i_568_ += i_569_;
							}
						}
					} else if (i_555_ == 3) {
						int i_637_ = i_559_;
						int i_638_ = i_556_ >>> 24;
						int i_639_ = 256 - i_638_;
						for (int i_640_ = -i_554_; i_640_ < 0; i_640_++) {
							int i_641_ = (i_560_ >> 16) * anInt8877;
							for (int i_642_ = -i_553_; i_642_ < 0; i_642_++) {
								byte i_643_ = aByteArray11392[(i_559_ >> 16) + i_641_];
								int i_644_ = i_643_ > 0 ? anIntArray11393[i_643_] : 0;
								int i_645_ = i_644_ + i_556_;
								int i_646_ = ((i_644_ & 0xff00ff) + (i_556_ & 0xff00ff));
								int i_647_ = ((i_646_ & 0x1000100) + (i_645_ - i_646_ & 0x10000));
								i_647_ = i_645_ - i_647_ | i_647_ - (i_647_ >>> 8);
								if (i_644_ == 0 && i_638_ != 255) {
									i_644_ = i_647_;
									i_647_ = is[i_568_];
									i_647_ = ((((i_644_ & 0xff00ff) * i_638_ + (i_647_ & 0xff00ff) * i_639_) & ~0xff00ff) + (((i_644_ & 0xff00) * i_638_ + (i_647_ & 0xff00) * i_639_) & 0xff0000)) >> 8;
								}
								is[i_568_++] = i_647_;
								i_559_ += i_564_;
							}
							i_560_ += i_565_;
							i_559_ = i_637_;
							i_568_ += i_569_;
						}
					} else if (i_555_ == 2) {
						int i_648_ = i_556_ >>> 24;
						int i_649_ = 256 - i_648_;
						int i_650_ = (i_556_ & 0xff00ff) * i_649_ & ~0xff00ff;
						int i_651_ = (i_556_ & 0xff00) * i_649_ & 0xff0000;
						i_556_ = (i_650_ | i_651_) >>> 8;
						int i_652_ = i_559_;
						for (int i_653_ = -i_554_; i_653_ < 0; i_653_++) {
							int i_654_ = (i_560_ >> 16) * anInt8877;
							for (int i_655_ = -i_553_; i_655_ < 0; i_655_++) {
								int i_656_ = aByteArray11392[(i_559_ >> 16) + i_654_];
								if (i_656_ != 0) {
									int i_657_ = anIntArray11393[i_656_ & 0xff];
									i_650_ = ((i_657_ & 0xff00ff) * i_648_ & ~0xff00ff);
									i_651_ = ((i_657_ & 0xff00) * i_648_ & 0xff0000);
									is[i_568_++] = ((i_650_ | i_651_) >>> 8) + i_556_;
								} else
									i_568_++;
								i_559_ += i_564_;
							}
							i_560_ += i_565_;
							i_559_ = i_652_;
							i_568_ += i_569_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_557_ == 2) {
					if (i_555_ == 1) {
						int i_658_ = i_559_;
						for (int i_659_ = -i_554_; i_659_ < 0; i_659_++) {
							int i_660_ = (i_560_ >> 16) * anInt8877;
							for (int i_661_ = -i_553_; i_661_ < 0; i_661_++) {
								int i_662_ = aByteArray11392[(i_559_ >> 16) + i_660_];
								if (i_662_ != 0) {
									int i_663_ = anIntArray11393[i_662_ & 0xff];
									int i_664_ = is[i_568_];
									int i_665_ = i_663_ + i_664_;
									int i_666_ = ((i_663_ & 0xff00ff) + (i_664_ & 0xff00ff));
									i_664_ = ((i_666_ & 0x1000100) + (i_665_ - i_666_ & 0x10000));
									is[i_568_++] = i_665_ - i_664_ | i_664_ - (i_664_ >>> 8);
								} else
									i_568_++;
								i_559_ += i_564_;
							}
							i_560_ += i_565_;
							i_559_ = i_658_;
							i_568_ += i_569_;
						}
					} else if (i_555_ == 0) {
						int i_667_ = i_559_;
						int i_668_ = (i_556_ & 0xff0000) >> 16;
						int i_669_ = (i_556_ & 0xff00) >> 8;
						int i_670_ = i_556_ & 0xff;
						for (int i_671_ = -i_554_; i_671_ < 0; i_671_++) {
							int i_672_ = (i_560_ >> 16) * anInt8877;
							for (int i_673_ = -i_553_; i_673_ < 0; i_673_++) {
								int i_674_ = aByteArray11392[(i_559_ >> 16) + i_672_];
								if (i_674_ != 0) {
									int i_675_ = anIntArray11393[i_674_ & 0xff];
									int i_676_ = ((i_675_ & 0xff0000) * i_668_ & ~0xffffff);
									int i_677_ = ((i_675_ & 0xff00) * i_669_ & 0xff0000);
									int i_678_ = (i_675_ & 0xff) * i_670_ & 0xff00;
									i_675_ = (i_676_ | i_677_ | i_678_) >>> 8;
									int i_679_ = is[i_568_];
									int i_680_ = i_675_ + i_679_;
									int i_681_ = ((i_675_ & 0xff00ff) + (i_679_ & 0xff00ff));
									i_679_ = ((i_681_ & 0x1000100) + (i_680_ - i_681_ & 0x10000));
									is[i_568_++] = i_680_ - i_679_ | i_679_ - (i_679_ >>> 8);
								} else
									i_568_++;
								i_559_ += i_564_;
							}
							i_560_ += i_565_;
							i_559_ = i_667_;
							i_568_ += i_569_;
						}
					} else if (i_555_ == 3) {
						int i_682_ = i_559_;
						for (int i_683_ = -i_554_; i_683_ < 0; i_683_++) {
							int i_684_ = (i_560_ >> 16) * anInt8877;
							for (int i_685_ = -i_553_; i_685_ < 0; i_685_++) {
								byte i_686_ = aByteArray11392[(i_559_ >> 16) + i_684_];
								int i_687_ = i_686_ > 0 ? anIntArray11393[i_686_] : 0;
								int i_688_ = i_687_ + i_556_;
								int i_689_ = ((i_687_ & 0xff00ff) + (i_556_ & 0xff00ff));
								int i_690_ = ((i_689_ & 0x1000100) + (i_688_ - i_689_ & 0x10000));
								i_687_ = i_688_ - i_690_ | i_690_ - (i_690_ >>> 8);
								i_690_ = is[i_568_];
								i_688_ = i_687_ + i_690_;
								i_689_ = (i_687_ & 0xff00ff) + (i_690_ & 0xff00ff);
								i_690_ = (i_689_ & 0x1000100) + (i_688_ - i_689_ & 0x10000);
								is[i_568_++] = i_688_ - i_690_ | i_690_ - (i_690_ >>> 8);
								i_559_ += i_564_;
							}
							i_560_ += i_565_;
							i_559_ = i_682_;
							i_568_ += i_569_;
						}
					} else if (i_555_ == 2) {
						int i_691_ = i_556_ >>> 24;
						int i_692_ = 256 - i_691_;
						int i_693_ = (i_556_ & 0xff00ff) * i_692_ & ~0xff00ff;
						int i_694_ = (i_556_ & 0xff00) * i_692_ & 0xff0000;
						i_556_ = (i_693_ | i_694_) >>> 8;
						int i_695_ = i_559_;
						for (int i_696_ = -i_554_; i_696_ < 0; i_696_++) {
							int i_697_ = (i_560_ >> 16) * anInt8877;
							for (int i_698_ = -i_553_; i_698_ < 0; i_698_++) {
								int i_699_ = aByteArray11392[(i_559_ >> 16) + i_697_];
								if (i_699_ != 0) {
									int i_700_ = anIntArray11393[i_699_ & 0xff];
									i_693_ = ((i_700_ & 0xff00ff) * i_691_ & ~0xff00ff);
									i_694_ = ((i_700_ & 0xff00) * i_691_ & 0xff0000);
									i_700_ = ((i_693_ | i_694_) >>> 8) + i_556_;
									int i_701_ = is[i_568_];
									int i_702_ = i_700_ + i_701_;
									int i_703_ = ((i_700_ & 0xff00ff) + (i_701_ & 0xff00ff));
									i_701_ = ((i_703_ & 0x1000100) + (i_702_ - i_703_ & 0x10000));
									is[i_568_++] = i_702_ - i_701_ | i_701_ - (i_701_ >>> 8);
								} else
									i_568_++;
								i_559_ += i_564_;
							}
							i_560_ += i_565_;
							i_559_ = i_695_;
							i_568_ += i_569_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method14430(boolean bool, boolean bool_704_, boolean bool_705_, int i, int i_706_, float f, int i_707_, int i_708_, int i_709_, int i_710_, int i_711_, int i_712_, boolean bool_713_) {
		if (i_707_ > 0 && i_708_ > 0 && (bool || bool_704_)) {
			int i_714_ = 0;
			int i_715_ = 0;
			int i_716_ = anInt8879 + anInt8877 + anInt8878;
			int i_717_ = anInt8895 + anInt8880 + anInt8882;
			int i_718_ = (i_716_ << 16) / i_707_;
			int i_719_ = (i_717_ << 16) / i_708_;
			if (anInt8879 > 0) {
				int i_720_ = ((anInt8879 << 16) + i_718_ - 1) / i_718_;
				i += i_720_;
				i_714_ += i_720_ * i_718_ - (anInt8879 << 16);
			}
			if (anInt8895 > 0) {
				int i_721_ = ((anInt8895 << 16) + i_719_ - 1) / i_719_;
				i_706_ += i_721_;
				i_715_ += i_721_ * i_719_ - (anInt8895 << 16);
			}
			if (anInt8877 < i_716_)
				i_707_ = ((anInt8877 << 16) - i_714_ + i_718_ - 1) / i_718_;
			if (anInt8880 < i_717_)
				i_708_ = ((anInt8880 << 16) - i_715_ + i_719_ - 1) / i_719_;
			int i_722_ = i + i_706_ * (aClass180_Sub1_8876.anInt9387 * -1173855569);
			int i_723_ = aClass180_Sub1_8876.anInt9387 * -1173855569 - i_707_;
			if (i_706_ + i_708_ > aClass180_Sub1_8876.anInt9393 * -383695469)
				i_708_ -= (i_706_ + i_708_ - aClass180_Sub1_8876.anInt9393 * -383695469);
			if (i_706_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
				int i_724_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_706_;
				i_708_ -= i_724_;
				i_722_ += i_724_ * (aClass180_Sub1_8876.anInt9387 * -1173855569);
				i_715_ += i_719_ * i_724_;
			}
			if (i + i_707_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
				int i_725_ = i + i_707_ - aClass180_Sub1_8876.anInt9391 * 2014358275;
				i_707_ -= i_725_;
				i_723_ += i_725_;
			}
			if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
				int i_726_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
				i_707_ -= i_726_;
				i_722_ += i_726_;
				i_714_ += i_718_ * i_726_;
				i_723_ += i_726_;
			}
			float[] fs = aClass180_Sub1_8876.aFloatArray9389;
			int[] is = aClass180_Sub1_8876.anIntArray9386;
			if (i_711_ == 0) {
				if (i_709_ == 1) {
					int i_727_ = i_714_;
					for (int i_728_ = -i_708_; i_728_ < 0; i_728_++) {
						int i_729_ = (i_715_ >> 16) * anInt8877;
						for (int i_730_ = -i_707_; i_730_ < 0; i_730_++) {
							if (!bool_704_ || f < fs[i_722_]) {
								if (bool)
									is[i_722_] = (anIntArray11393[((aByteArray11392[(i_714_ >> 16) + i_729_]) & 0xff)]);
								if (bool_704_ && bool_713_)
									fs[i_722_] = f;
							}
							i_714_ += i_718_;
							i_722_++;
						}
						i_715_ += i_719_;
						i_714_ = i_727_;
						i_722_ += i_723_;
					}
				} else if (i_709_ == 0) {
					int i_731_ = (i_710_ & 0xff0000) >> 16;
					int i_732_ = (i_710_ & 0xff00) >> 8;
					int i_733_ = i_710_ & 0xff;
					int i_734_ = i_714_;
					for (int i_735_ = -i_708_; i_735_ < 0; i_735_++) {
						int i_736_ = (i_715_ >> 16) * anInt8877;
						for (int i_737_ = -i_707_; i_737_ < 0; i_737_++) {
							if (!bool_704_ || f < fs[i_722_]) {
								if (bool) {
									int i_738_ = (anIntArray11393[((aByteArray11392[(i_714_ >> 16) + i_736_]) & 0xff)]);
									int i_739_ = ((i_738_ & 0xff0000) * i_731_ & ~0xffffff);
									int i_740_ = ((i_738_ & 0xff00) * i_732_ & 0xff0000);
									int i_741_ = (i_738_ & 0xff) * i_733_ & 0xff00;
									is[i_722_] = (i_739_ | i_740_ | i_741_) >>> 8;
								}
								if (bool_704_ && bool_713_)
									fs[i_722_] = f;
							}
							i_714_ += i_718_;
							i_722_++;
						}
						i_715_ += i_719_;
						i_714_ = i_734_;
						i_722_ += i_723_;
					}
				} else if (i_709_ == 3) {
					int i_742_ = i_714_;
					for (int i_743_ = -i_708_; i_743_ < 0; i_743_++) {
						int i_744_ = (i_715_ >> 16) * anInt8877;
						for (int i_745_ = -i_707_; i_745_ < 0; i_745_++) {
							if (!bool_704_ || f < fs[i_722_]) {
								if (bool) {
									byte i_746_ = (aByteArray11392[(i_714_ >> 16) + i_744_]);
									int i_747_ = (i_746_ > 0 ? anIntArray11393[i_746_] : 0);
									int i_748_ = i_747_ + i_710_;
									int i_749_ = ((i_747_ & 0xff00ff) + (i_710_ & 0xff00ff));
									int i_750_ = ((i_749_ & 0x1000100) + (i_748_ - i_749_ & 0x10000));
									is[i_722_] = i_748_ - i_750_ | i_750_ - (i_750_ >>> 8);
								}
								if (bool_704_ && bool_713_)
									fs[i_722_] = f;
							}
							i_714_ += i_718_;
							i_722_++;
						}
						i_715_ += i_719_;
						i_714_ = i_742_;
						i_722_ += i_723_;
					}
				} else if (i_709_ == 2) {
					int i_751_ = i_710_ >>> 24;
					int i_752_ = 256 - i_751_;
					int i_753_ = (i_710_ & 0xff00ff) * i_752_ & ~0xff00ff;
					int i_754_ = (i_710_ & 0xff00) * i_752_ & 0xff0000;
					i_710_ = (i_753_ | i_754_) >>> 8;
					int i_755_ = i_714_;
					for (int i_756_ = -i_708_; i_756_ < 0; i_756_++) {
						int i_757_ = (i_715_ >> 16) * anInt8877;
						for (int i_758_ = -i_707_; i_758_ < 0; i_758_++) {
							if (!bool_704_ || f < fs[i_722_]) {
								if (bool) {
									int i_759_ = (anIntArray11393[((aByteArray11392[(i_714_ >> 16) + i_757_]) & 0xff)]);
									i_753_ = ((i_759_ & 0xff00ff) * i_751_ & ~0xff00ff);
									i_754_ = ((i_759_ & 0xff00) * i_751_ & 0xff0000);
									is[i_722_] = ((i_753_ | i_754_) >>> 8) + i_710_;
								}
								if (bool_704_ && bool_713_)
									fs[i_722_] = f;
							}
							i_714_ += i_718_;
							i_722_++;
						}
						i_715_ += i_719_;
						i_714_ = i_755_;
						i_722_ += i_723_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_711_ == 1) {
				if (i_709_ == 1) {
					int i_760_ = i_714_;
					for (int i_761_ = -i_708_; i_761_ < 0; i_761_++) {
						int i_762_ = (i_715_ >> 16) * anInt8877;
						for (int i_763_ = -i_707_; i_763_ < 0; i_763_++) {
							if (!bool_704_ || f < fs[i_722_]) {
								int i_764_ = aByteArray11392[(i_714_ >> 16) + i_762_];
								if (i_764_ != 0) {
									if (bool)
										is[i_722_] = anIntArray11393[i_764_ & 0xff];
									if (bool_704_ && bool_713_)
										fs[i_722_] = f;
								}
							}
							i_714_ += i_718_;
							i_722_++;
						}
						i_715_ += i_719_;
						i_714_ = i_760_;
						i_722_ += i_723_;
					}
				} else if (i_709_ == 0) {
					int i_765_ = i_714_;
					if ((i_710_ & 0xffffff) == 16777215) {
						int i_766_ = i_710_ >>> 24;
						int i_767_ = 256 - i_766_;
						for (int i_768_ = -i_708_; i_768_ < 0; i_768_++) {
							int i_769_ = (i_715_ >> 16) * anInt8877;
							for (int i_770_ = -i_707_; i_770_ < 0; i_770_++) {
								if (!bool_704_ || f < fs[i_722_]) {
									int i_771_ = (aByteArray11392[(i_714_ >> 16) + i_769_]);
									if (i_771_ != 0) {
										if (bool) {
											int i_772_ = (anIntArray11393[i_771_ & 0xff]);
											int i_773_ = is[i_722_];
											is[i_722_] = (((((i_772_ & 0xff00ff) * i_766_) + ((i_773_ & 0xff00ff) * i_767_)) & ~0xff00ff) + ((((i_772_ & 0xff00) * i_766_) + ((i_773_ & 0xff00) * i_767_)) & 0xff0000)) >> 8;
										}
										if (bool_704_ && bool_713_)
											fs[i_722_] = f;
									}
								}
								i_714_ += i_718_;
								i_722_++;
							}
							i_715_ += i_719_;
							i_714_ = i_765_;
							i_722_ += i_723_;
						}
					} else {
						int i_774_ = (i_710_ & 0xff0000) >> 16;
						int i_775_ = (i_710_ & 0xff00) >> 8;
						int i_776_ = i_710_ & 0xff;
						int i_777_ = i_710_ >>> 24;
						int i_778_ = 256 - i_777_;
						for (int i_779_ = -i_708_; i_779_ < 0; i_779_++) {
							int i_780_ = (i_715_ >> 16) * anInt8877;
							for (int i_781_ = -i_707_; i_781_ < 0; i_781_++) {
								if (!bool_704_ || f < fs[i_722_]) {
									int i_782_ = (aByteArray11392[(i_714_ >> 16) + i_780_]);
									if (i_782_ != 0) {
										int i_783_ = anIntArray11393[i_782_ & 0xff];
										if (i_777_ != 255) {
											if (bool) {
												int i_784_ = (((i_783_ & 0xff0000) * i_774_) & ~0xffffff);
												int i_785_ = (((i_783_ & 0xff00) * i_775_) & 0xff0000);
												int i_786_ = ((i_783_ & 0xff) * i_776_ & 0xff00);
												i_783_ = (i_784_ | i_785_ | i_786_) >>> 8;
												int i_787_ = is[i_722_];
												is[i_722_] = (((((i_783_ & 0xff00ff) * i_777_) + ((i_787_ & 0xff00ff) * i_778_)) & ~0xff00ff) + ((((i_783_ & 0xff00) * i_777_) + ((i_787_ & 0xff00) * i_778_)) & 0xff0000)) >> 8;
											}
											if (bool_704_ && bool_713_)
												fs[i_722_] = f;
										} else {
											if (bool) {
												int i_788_ = (((i_783_ & 0xff0000) * i_774_) & ~0xffffff);
												int i_789_ = (((i_783_ & 0xff00) * i_775_) & 0xff0000);
												int i_790_ = ((i_783_ & 0xff) * i_776_ & 0xff00);
												is[i_722_] = (i_788_ | i_789_ | i_790_) >>> 8;
											}
											if (bool_704_ && bool_713_)
												fs[i_722_] = f;
										}
									}
								}
								i_714_ += i_718_;
								i_722_++;
							}
							i_715_ += i_719_;
							i_714_ = i_765_;
							i_722_ += i_723_;
						}
					}
				} else if (i_709_ == 3) {
					int i_791_ = i_714_;
					int i_792_ = i_710_ >>> 24;
					int i_793_ = 256 - i_792_;
					for (int i_794_ = -i_708_; i_794_ < 0; i_794_++) {
						int i_795_ = (i_715_ >> 16) * anInt8877;
						for (int i_796_ = -i_707_; i_796_ < 0; i_796_++) {
							if (!bool_704_ || f < fs[i_722_]) {
								if (bool) {
									byte i_797_ = (aByteArray11392[(i_714_ >> 16) + i_795_]);
									int i_798_ = (i_797_ > 0 ? anIntArray11393[i_797_] : 0);
									int i_799_ = i_798_ + i_710_;
									int i_800_ = ((i_798_ & 0xff00ff) + (i_710_ & 0xff00ff));
									int i_801_ = ((i_800_ & 0x1000100) + (i_799_ - i_800_ & 0x10000));
									i_801_ = i_799_ - i_801_ | i_801_ - (i_801_ >>> 8);
									if (i_798_ == 0 && i_792_ != 255) {
										i_798_ = i_801_;
										i_801_ = is[i_722_];
										i_801_ = ((((i_798_ & 0xff00ff) * i_792_ + ((i_801_ & 0xff00ff) * i_793_)) & ~0xff00ff) + (((i_798_ & 0xff00) * i_792_ + ((i_801_ & 0xff00) * i_793_)) & 0xff0000)) >> 8;
									}
									is[i_722_] = i_801_;
								}
								if (bool_704_ && bool_713_)
									fs[i_722_] = f;
							}
							i_714_ += i_718_;
							i_722_++;
						}
						i_715_ += i_719_;
						i_714_ = i_791_;
						i_722_ += i_723_;
					}
				} else if (i_709_ == 2) {
					int i_802_ = i_710_ >>> 24;
					int i_803_ = 256 - i_802_;
					int i_804_ = (i_710_ & 0xff00ff) * i_803_ & ~0xff00ff;
					int i_805_ = (i_710_ & 0xff00) * i_803_ & 0xff0000;
					i_710_ = (i_804_ | i_805_) >>> 8;
					int i_806_ = i_714_;
					for (int i_807_ = -i_708_; i_807_ < 0; i_807_++) {
						int i_808_ = (i_715_ >> 16) * anInt8877;
						for (int i_809_ = -i_707_; i_809_ < 0; i_809_++) {
							if (!bool_704_ || f < fs[i_722_]) {
								int i_810_ = aByteArray11392[(i_714_ >> 16) + i_808_];
								if (i_810_ != 0) {
									if (bool) {
										int i_811_ = anIntArray11393[i_810_ & 0xff];
										i_804_ = ((i_811_ & 0xff00ff) * i_802_ & ~0xff00ff);
										i_805_ = ((i_811_ & 0xff00) * i_802_ & 0xff0000);
										is[i_722_] = (((i_804_ | i_805_) >>> 8) + i_710_);
									}
									if (bool_704_ && bool_713_)
										fs[i_722_] = f;
								}
							}
							i_714_ += i_718_;
							i_722_++;
						}
						i_715_ += i_719_;
						i_714_ = i_806_;
						i_722_ += i_723_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_711_ == 2) {
				if (i_709_ == 1) {
					int i_812_ = i_714_;
					for (int i_813_ = -i_708_; i_813_ < 0; i_813_++) {
						int i_814_ = (i_715_ >> 16) * anInt8877;
						for (int i_815_ = -i_707_; i_815_ < 0; i_815_++) {
							if (!bool_704_ || f < fs[i_722_]) {
								int i_816_ = aByteArray11392[(i_714_ >> 16) + i_814_];
								if (i_816_ != 0) {
									if (bool) {
										int i_817_ = anIntArray11393[i_816_ & 0xff];
										int i_818_ = is[i_722_];
										int i_819_ = i_817_ + i_818_;
										int i_820_ = ((i_817_ & 0xff00ff) + (i_818_ & 0xff00ff));
										i_818_ = ((i_820_ & 0x1000100) + (i_819_ - i_820_ & 0x10000));
										is[i_722_] = (i_819_ - i_818_ | i_818_ - (i_818_ >>> 8));
									}
									if (bool_704_ && bool_713_)
										fs[i_722_] = f;
								}
							}
							i_714_ += i_718_;
							i_722_++;
						}
						i_715_ += i_719_;
						i_714_ = i_812_;
						i_722_ += i_723_;
					}
				} else if (i_709_ == 0) {
					int i_821_ = i_714_;
					int i_822_ = (i_710_ & 0xff0000) >> 16;
					int i_823_ = (i_710_ & 0xff00) >> 8;
					int i_824_ = i_710_ & 0xff;
					for (int i_825_ = -i_708_; i_825_ < 0; i_825_++) {
						int i_826_ = (i_715_ >> 16) * anInt8877;
						for (int i_827_ = -i_707_; i_827_ < 0; i_827_++) {
							if (!bool_704_ || f < fs[i_722_]) {
								int i_828_ = aByteArray11392[(i_714_ >> 16) + i_826_];
								if (i_828_ != 0) {
									if (bool) {
										int i_829_ = anIntArray11393[i_828_ & 0xff];
										int i_830_ = ((i_829_ & 0xff0000) * i_822_ & ~0xffffff);
										int i_831_ = ((i_829_ & 0xff00) * i_823_ & 0xff0000);
										int i_832_ = ((i_829_ & 0xff) * i_824_ & 0xff00);
										i_829_ = (i_830_ | i_831_ | i_832_) >>> 8;
										int i_833_ = is[i_722_];
										int i_834_ = i_829_ + i_833_;
										int i_835_ = ((i_829_ & 0xff00ff) + (i_833_ & 0xff00ff));
										i_833_ = ((i_835_ & 0x1000100) + (i_834_ - i_835_ & 0x10000));
										is[i_722_] = (i_834_ - i_833_ | i_833_ - (i_833_ >>> 8));
									}
									if (bool_704_ && bool_713_)
										fs[i_722_] = f;
								}
							}
							i_714_ += i_718_;
							i_722_++;
						}
						i_715_ += i_719_;
						i_714_ = i_821_;
						i_722_ += i_723_;
					}
				} else if (i_709_ == 3) {
					int i_836_ = i_714_;
					for (int i_837_ = -i_708_; i_837_ < 0; i_837_++) {
						int i_838_ = (i_715_ >> 16) * anInt8877;
						for (int i_839_ = -i_707_; i_839_ < 0; i_839_++) {
							if (!bool_704_ || f < fs[i_722_]) {
								if (bool) {
									byte i_840_ = (aByteArray11392[(i_714_ >> 16) + i_838_]);
									int i_841_ = (i_840_ > 0 ? anIntArray11393[i_840_] : 0);
									int i_842_ = i_841_ + i_710_;
									int i_843_ = ((i_841_ & 0xff00ff) + (i_710_ & 0xff00ff));
									int i_844_ = ((i_843_ & 0x1000100) + (i_842_ - i_843_ & 0x10000));
									i_841_ = i_842_ - i_844_ | i_844_ - (i_844_ >>> 8);
									i_844_ = is[i_722_];
									i_842_ = i_841_ + i_844_;
									i_843_ = (i_841_ & 0xff00ff) + (i_844_ & 0xff00ff);
									i_844_ = ((i_843_ & 0x1000100) + (i_842_ - i_843_ & 0x10000));
									is[i_722_] = i_842_ - i_844_ | i_844_ - (i_844_ >>> 8);
								}
								if (bool_704_ && bool_713_)
									fs[i_722_] = f;
							}
							i_714_ += i_718_;
							i_722_++;
						}
						i_715_ += i_719_;
						i_714_ = i_836_;
						i_722_ += i_723_;
					}
				} else if (i_709_ == 2) {
					int i_845_ = i_710_ >>> 24;
					int i_846_ = 256 - i_845_;
					int i_847_ = (i_710_ & 0xff00ff) * i_846_ & ~0xff00ff;
					int i_848_ = (i_710_ & 0xff00) * i_846_ & 0xff0000;
					i_710_ = (i_847_ | i_848_) >>> 8;
					int i_849_ = i_714_;
					for (int i_850_ = -i_708_; i_850_ < 0; i_850_++) {
						int i_851_ = (i_715_ >> 16) * anInt8877;
						for (int i_852_ = -i_707_; i_852_ < 0; i_852_++) {
							if (!bool_704_ || f < fs[i_722_]) {
								int i_853_ = aByteArray11392[(i_714_ >> 16) + i_851_];
								if (i_853_ != 0) {
									if (bool) {
										int i_854_ = anIntArray11393[i_853_ & 0xff];
										i_847_ = ((i_854_ & 0xff00ff) * i_845_ & ~0xff00ff);
										i_848_ = ((i_854_ & 0xff00) * i_845_ & 0xff0000);
										i_854_ = (((i_847_ | i_848_) >>> 8) + i_710_);
										int i_855_ = is[i_722_];
										int i_856_ = i_854_ + i_855_;
										int i_857_ = ((i_854_ & 0xff00ff) + (i_855_ & 0xff00ff));
										i_855_ = ((i_857_ & 0x1000100) + (i_856_ - i_857_ & 0x10000));
										is[i_722_] = (i_856_ - i_855_ | i_855_ - (i_855_ >>> 8));
									}
									if (bool_704_ && bool_713_)
										fs[i_722_] = f;
								}
							}
							i_714_ += i_718_;
							i_722_++;
						}
						i_715_ += i_719_;
						i_714_ = i_849_;
						i_722_ += i_723_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method2434(int i, int i_858_, int i_859_, int i_860_, int[] is, int i_861_, int i_862_) {
		throw new IllegalStateException();
	}

	void method14427(boolean bool, boolean bool_863_, boolean bool_864_, int i, int i_865_, float f, int i_866_, int i_867_, int i_868_, int i_869_, int i_870_, int i_871_, boolean bool_872_) {
		if (i_866_ > 0 && i_867_ > 0 && (bool || bool_863_)) {
			int i_873_ = 0;
			int i_874_ = 0;
			int i_875_ = anInt8879 + anInt8877 + anInt8878;
			int i_876_ = anInt8895 + anInt8880 + anInt8882;
			int i_877_ = (i_875_ << 16) / i_866_;
			int i_878_ = (i_876_ << 16) / i_867_;
			if (anInt8879 > 0) {
				int i_879_ = ((anInt8879 << 16) + i_877_ - 1) / i_877_;
				i += i_879_;
				i_873_ += i_879_ * i_877_ - (anInt8879 << 16);
			}
			if (anInt8895 > 0) {
				int i_880_ = ((anInt8895 << 16) + i_878_ - 1) / i_878_;
				i_865_ += i_880_;
				i_874_ += i_880_ * i_878_ - (anInt8895 << 16);
			}
			if (anInt8877 < i_875_)
				i_866_ = ((anInt8877 << 16) - i_873_ + i_877_ - 1) / i_877_;
			if (anInt8880 < i_876_)
				i_867_ = ((anInt8880 << 16) - i_874_ + i_878_ - 1) / i_878_;
			int i_881_ = i + i_865_ * (aClass180_Sub1_8876.anInt9387 * -1173855569);
			int i_882_ = aClass180_Sub1_8876.anInt9387 * -1173855569 - i_866_;
			if (i_865_ + i_867_ > aClass180_Sub1_8876.anInt9393 * -383695469)
				i_867_ -= (i_865_ + i_867_ - aClass180_Sub1_8876.anInt9393 * -383695469);
			if (i_865_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
				int i_883_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_865_;
				i_867_ -= i_883_;
				i_881_ += i_883_ * (aClass180_Sub1_8876.anInt9387 * -1173855569);
				i_874_ += i_878_ * i_883_;
			}
			if (i + i_866_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
				int i_884_ = i + i_866_ - aClass180_Sub1_8876.anInt9391 * 2014358275;
				i_866_ -= i_884_;
				i_882_ += i_884_;
			}
			if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
				int i_885_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
				i_866_ -= i_885_;
				i_881_ += i_885_;
				i_873_ += i_877_ * i_885_;
				i_882_ += i_885_;
			}
			float[] fs = aClass180_Sub1_8876.aFloatArray9389;
			int[] is = aClass180_Sub1_8876.anIntArray9386;
			if (i_870_ == 0) {
				if (i_868_ == 1) {
					int i_886_ = i_873_;
					for (int i_887_ = -i_867_; i_887_ < 0; i_887_++) {
						int i_888_ = (i_874_ >> 16) * anInt8877;
						for (int i_889_ = -i_866_; i_889_ < 0; i_889_++) {
							if (!bool_863_ || f < fs[i_881_]) {
								if (bool)
									is[i_881_] = (anIntArray11393[((aByteArray11392[(i_873_ >> 16) + i_888_]) & 0xff)]);
								if (bool_863_ && bool_872_)
									fs[i_881_] = f;
							}
							i_873_ += i_877_;
							i_881_++;
						}
						i_874_ += i_878_;
						i_873_ = i_886_;
						i_881_ += i_882_;
					}
				} else if (i_868_ == 0) {
					int i_890_ = (i_869_ & 0xff0000) >> 16;
					int i_891_ = (i_869_ & 0xff00) >> 8;
					int i_892_ = i_869_ & 0xff;
					int i_893_ = i_873_;
					for (int i_894_ = -i_867_; i_894_ < 0; i_894_++) {
						int i_895_ = (i_874_ >> 16) * anInt8877;
						for (int i_896_ = -i_866_; i_896_ < 0; i_896_++) {
							if (!bool_863_ || f < fs[i_881_]) {
								if (bool) {
									int i_897_ = (anIntArray11393[((aByteArray11392[(i_873_ >> 16) + i_895_]) & 0xff)]);
									int i_898_ = ((i_897_ & 0xff0000) * i_890_ & ~0xffffff);
									int i_899_ = ((i_897_ & 0xff00) * i_891_ & 0xff0000);
									int i_900_ = (i_897_ & 0xff) * i_892_ & 0xff00;
									is[i_881_] = (i_898_ | i_899_ | i_900_) >>> 8;
								}
								if (bool_863_ && bool_872_)
									fs[i_881_] = f;
							}
							i_873_ += i_877_;
							i_881_++;
						}
						i_874_ += i_878_;
						i_873_ = i_893_;
						i_881_ += i_882_;
					}
				} else if (i_868_ == 3) {
					int i_901_ = i_873_;
					for (int i_902_ = -i_867_; i_902_ < 0; i_902_++) {
						int i_903_ = (i_874_ >> 16) * anInt8877;
						for (int i_904_ = -i_866_; i_904_ < 0; i_904_++) {
							if (!bool_863_ || f < fs[i_881_]) {
								if (bool) {
									byte i_905_ = (aByteArray11392[(i_873_ >> 16) + i_903_]);
									int i_906_ = (i_905_ > 0 ? anIntArray11393[i_905_] : 0);
									int i_907_ = i_906_ + i_869_;
									int i_908_ = ((i_906_ & 0xff00ff) + (i_869_ & 0xff00ff));
									int i_909_ = ((i_908_ & 0x1000100) + (i_907_ - i_908_ & 0x10000));
									is[i_881_] = i_907_ - i_909_ | i_909_ - (i_909_ >>> 8);
								}
								if (bool_863_ && bool_872_)
									fs[i_881_] = f;
							}
							i_873_ += i_877_;
							i_881_++;
						}
						i_874_ += i_878_;
						i_873_ = i_901_;
						i_881_ += i_882_;
					}
				} else if (i_868_ == 2) {
					int i_910_ = i_869_ >>> 24;
					int i_911_ = 256 - i_910_;
					int i_912_ = (i_869_ & 0xff00ff) * i_911_ & ~0xff00ff;
					int i_913_ = (i_869_ & 0xff00) * i_911_ & 0xff0000;
					i_869_ = (i_912_ | i_913_) >>> 8;
					int i_914_ = i_873_;
					for (int i_915_ = -i_867_; i_915_ < 0; i_915_++) {
						int i_916_ = (i_874_ >> 16) * anInt8877;
						for (int i_917_ = -i_866_; i_917_ < 0; i_917_++) {
							if (!bool_863_ || f < fs[i_881_]) {
								if (bool) {
									int i_918_ = (anIntArray11393[((aByteArray11392[(i_873_ >> 16) + i_916_]) & 0xff)]);
									i_912_ = ((i_918_ & 0xff00ff) * i_910_ & ~0xff00ff);
									i_913_ = ((i_918_ & 0xff00) * i_910_ & 0xff0000);
									is[i_881_] = ((i_912_ | i_913_) >>> 8) + i_869_;
								}
								if (bool_863_ && bool_872_)
									fs[i_881_] = f;
							}
							i_873_ += i_877_;
							i_881_++;
						}
						i_874_ += i_878_;
						i_873_ = i_914_;
						i_881_ += i_882_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_870_ == 1) {
				if (i_868_ == 1) {
					int i_919_ = i_873_;
					for (int i_920_ = -i_867_; i_920_ < 0; i_920_++) {
						int i_921_ = (i_874_ >> 16) * anInt8877;
						for (int i_922_ = -i_866_; i_922_ < 0; i_922_++) {
							if (!bool_863_ || f < fs[i_881_]) {
								int i_923_ = aByteArray11392[(i_873_ >> 16) + i_921_];
								if (i_923_ != 0) {
									if (bool)
										is[i_881_] = anIntArray11393[i_923_ & 0xff];
									if (bool_863_ && bool_872_)
										fs[i_881_] = f;
								}
							}
							i_873_ += i_877_;
							i_881_++;
						}
						i_874_ += i_878_;
						i_873_ = i_919_;
						i_881_ += i_882_;
					}
				} else if (i_868_ == 0) {
					int i_924_ = i_873_;
					if ((i_869_ & 0xffffff) == 16777215) {
						int i_925_ = i_869_ >>> 24;
						int i_926_ = 256 - i_925_;
						for (int i_927_ = -i_867_; i_927_ < 0; i_927_++) {
							int i_928_ = (i_874_ >> 16) * anInt8877;
							for (int i_929_ = -i_866_; i_929_ < 0; i_929_++) {
								if (!bool_863_ || f < fs[i_881_]) {
									int i_930_ = (aByteArray11392[(i_873_ >> 16) + i_928_]);
									if (i_930_ != 0) {
										if (bool) {
											int i_931_ = (anIntArray11393[i_930_ & 0xff]);
											int i_932_ = is[i_881_];
											is[i_881_] = (((((i_931_ & 0xff00ff) * i_925_) + ((i_932_ & 0xff00ff) * i_926_)) & ~0xff00ff) + ((((i_931_ & 0xff00) * i_925_) + ((i_932_ & 0xff00) * i_926_)) & 0xff0000)) >> 8;
										}
										if (bool_863_ && bool_872_)
											fs[i_881_] = f;
									}
								}
								i_873_ += i_877_;
								i_881_++;
							}
							i_874_ += i_878_;
							i_873_ = i_924_;
							i_881_ += i_882_;
						}
					} else {
						int i_933_ = (i_869_ & 0xff0000) >> 16;
						int i_934_ = (i_869_ & 0xff00) >> 8;
						int i_935_ = i_869_ & 0xff;
						int i_936_ = i_869_ >>> 24;
						int i_937_ = 256 - i_936_;
						for (int i_938_ = -i_867_; i_938_ < 0; i_938_++) {
							int i_939_ = (i_874_ >> 16) * anInt8877;
							for (int i_940_ = -i_866_; i_940_ < 0; i_940_++) {
								if (!bool_863_ || f < fs[i_881_]) {
									int i_941_ = (aByteArray11392[(i_873_ >> 16) + i_939_]);
									if (i_941_ != 0) {
										int i_942_ = anIntArray11393[i_941_ & 0xff];
										if (i_936_ != 255) {
											if (bool) {
												int i_943_ = (((i_942_ & 0xff0000) * i_933_) & ~0xffffff);
												int i_944_ = (((i_942_ & 0xff00) * i_934_) & 0xff0000);
												int i_945_ = ((i_942_ & 0xff) * i_935_ & 0xff00);
												i_942_ = (i_943_ | i_944_ | i_945_) >>> 8;
												int i_946_ = is[i_881_];
												is[i_881_] = (((((i_942_ & 0xff00ff) * i_936_) + ((i_946_ & 0xff00ff) * i_937_)) & ~0xff00ff) + ((((i_942_ & 0xff00) * i_936_) + ((i_946_ & 0xff00) * i_937_)) & 0xff0000)) >> 8;
											}
											if (bool_863_ && bool_872_)
												fs[i_881_] = f;
										} else {
											if (bool) {
												int i_947_ = (((i_942_ & 0xff0000) * i_933_) & ~0xffffff);
												int i_948_ = (((i_942_ & 0xff00) * i_934_) & 0xff0000);
												int i_949_ = ((i_942_ & 0xff) * i_935_ & 0xff00);
												is[i_881_] = (i_947_ | i_948_ | i_949_) >>> 8;
											}
											if (bool_863_ && bool_872_)
												fs[i_881_] = f;
										}
									}
								}
								i_873_ += i_877_;
								i_881_++;
							}
							i_874_ += i_878_;
							i_873_ = i_924_;
							i_881_ += i_882_;
						}
					}
				} else if (i_868_ == 3) {
					int i_950_ = i_873_;
					int i_951_ = i_869_ >>> 24;
					int i_952_ = 256 - i_951_;
					for (int i_953_ = -i_867_; i_953_ < 0; i_953_++) {
						int i_954_ = (i_874_ >> 16) * anInt8877;
						for (int i_955_ = -i_866_; i_955_ < 0; i_955_++) {
							if (!bool_863_ || f < fs[i_881_]) {
								if (bool) {
									byte i_956_ = (aByteArray11392[(i_873_ >> 16) + i_954_]);
									int i_957_ = (i_956_ > 0 ? anIntArray11393[i_956_] : 0);
									int i_958_ = i_957_ + i_869_;
									int i_959_ = ((i_957_ & 0xff00ff) + (i_869_ & 0xff00ff));
									int i_960_ = ((i_959_ & 0x1000100) + (i_958_ - i_959_ & 0x10000));
									i_960_ = i_958_ - i_960_ | i_960_ - (i_960_ >>> 8);
									if (i_957_ == 0 && i_951_ != 255) {
										i_957_ = i_960_;
										i_960_ = is[i_881_];
										i_960_ = ((((i_957_ & 0xff00ff) * i_951_ + ((i_960_ & 0xff00ff) * i_952_)) & ~0xff00ff) + (((i_957_ & 0xff00) * i_951_ + ((i_960_ & 0xff00) * i_952_)) & 0xff0000)) >> 8;
									}
									is[i_881_] = i_960_;
								}
								if (bool_863_ && bool_872_)
									fs[i_881_] = f;
							}
							i_873_ += i_877_;
							i_881_++;
						}
						i_874_ += i_878_;
						i_873_ = i_950_;
						i_881_ += i_882_;
					}
				} else if (i_868_ == 2) {
					int i_961_ = i_869_ >>> 24;
					int i_962_ = 256 - i_961_;
					int i_963_ = (i_869_ & 0xff00ff) * i_962_ & ~0xff00ff;
					int i_964_ = (i_869_ & 0xff00) * i_962_ & 0xff0000;
					i_869_ = (i_963_ | i_964_) >>> 8;
					int i_965_ = i_873_;
					for (int i_966_ = -i_867_; i_966_ < 0; i_966_++) {
						int i_967_ = (i_874_ >> 16) * anInt8877;
						for (int i_968_ = -i_866_; i_968_ < 0; i_968_++) {
							if (!bool_863_ || f < fs[i_881_]) {
								int i_969_ = aByteArray11392[(i_873_ >> 16) + i_967_];
								if (i_969_ != 0) {
									if (bool) {
										int i_970_ = anIntArray11393[i_969_ & 0xff];
										i_963_ = ((i_970_ & 0xff00ff) * i_961_ & ~0xff00ff);
										i_964_ = ((i_970_ & 0xff00) * i_961_ & 0xff0000);
										is[i_881_] = (((i_963_ | i_964_) >>> 8) + i_869_);
									}
									if (bool_863_ && bool_872_)
										fs[i_881_] = f;
								}
							}
							i_873_ += i_877_;
							i_881_++;
						}
						i_874_ += i_878_;
						i_873_ = i_965_;
						i_881_ += i_882_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_870_ == 2) {
				if (i_868_ == 1) {
					int i_971_ = i_873_;
					for (int i_972_ = -i_867_; i_972_ < 0; i_972_++) {
						int i_973_ = (i_874_ >> 16) * anInt8877;
						for (int i_974_ = -i_866_; i_974_ < 0; i_974_++) {
							if (!bool_863_ || f < fs[i_881_]) {
								int i_975_ = aByteArray11392[(i_873_ >> 16) + i_973_];
								if (i_975_ != 0) {
									if (bool) {
										int i_976_ = anIntArray11393[i_975_ & 0xff];
										int i_977_ = is[i_881_];
										int i_978_ = i_976_ + i_977_;
										int i_979_ = ((i_976_ & 0xff00ff) + (i_977_ & 0xff00ff));
										i_977_ = ((i_979_ & 0x1000100) + (i_978_ - i_979_ & 0x10000));
										is[i_881_] = (i_978_ - i_977_ | i_977_ - (i_977_ >>> 8));
									}
									if (bool_863_ && bool_872_)
										fs[i_881_] = f;
								}
							}
							i_873_ += i_877_;
							i_881_++;
						}
						i_874_ += i_878_;
						i_873_ = i_971_;
						i_881_ += i_882_;
					}
				} else if (i_868_ == 0) {
					int i_980_ = i_873_;
					int i_981_ = (i_869_ & 0xff0000) >> 16;
					int i_982_ = (i_869_ & 0xff00) >> 8;
					int i_983_ = i_869_ & 0xff;
					for (int i_984_ = -i_867_; i_984_ < 0; i_984_++) {
						int i_985_ = (i_874_ >> 16) * anInt8877;
						for (int i_986_ = -i_866_; i_986_ < 0; i_986_++) {
							if (!bool_863_ || f < fs[i_881_]) {
								int i_987_ = aByteArray11392[(i_873_ >> 16) + i_985_];
								if (i_987_ != 0) {
									if (bool) {
										int i_988_ = anIntArray11393[i_987_ & 0xff];
										int i_989_ = ((i_988_ & 0xff0000) * i_981_ & ~0xffffff);
										int i_990_ = ((i_988_ & 0xff00) * i_982_ & 0xff0000);
										int i_991_ = ((i_988_ & 0xff) * i_983_ & 0xff00);
										i_988_ = (i_989_ | i_990_ | i_991_) >>> 8;
										int i_992_ = is[i_881_];
										int i_993_ = i_988_ + i_992_;
										int i_994_ = ((i_988_ & 0xff00ff) + (i_992_ & 0xff00ff));
										i_992_ = ((i_994_ & 0x1000100) + (i_993_ - i_994_ & 0x10000));
										is[i_881_] = (i_993_ - i_992_ | i_992_ - (i_992_ >>> 8));
									}
									if (bool_863_ && bool_872_)
										fs[i_881_] = f;
								}
							}
							i_873_ += i_877_;
							i_881_++;
						}
						i_874_ += i_878_;
						i_873_ = i_980_;
						i_881_ += i_882_;
					}
				} else if (i_868_ == 3) {
					int i_995_ = i_873_;
					for (int i_996_ = -i_867_; i_996_ < 0; i_996_++) {
						int i_997_ = (i_874_ >> 16) * anInt8877;
						for (int i_998_ = -i_866_; i_998_ < 0; i_998_++) {
							if (!bool_863_ || f < fs[i_881_]) {
								if (bool) {
									byte i_999_ = (aByteArray11392[(i_873_ >> 16) + i_997_]);
									int i_1000_ = (i_999_ > 0 ? anIntArray11393[i_999_] : 0);
									int i_1001_ = i_1000_ + i_869_;
									int i_1002_ = ((i_1000_ & 0xff00ff) + (i_869_ & 0xff00ff));
									int i_1003_ = ((i_1002_ & 0x1000100) + (i_1001_ - i_1002_ & 0x10000));
									i_1000_ = (i_1001_ - i_1003_ | i_1003_ - (i_1003_ >>> 8));
									i_1003_ = is[i_881_];
									i_1001_ = i_1000_ + i_1003_;
									i_1002_ = (i_1000_ & 0xff00ff) + (i_1003_ & 0xff00ff);
									i_1003_ = ((i_1002_ & 0x1000100) + (i_1001_ - i_1002_ & 0x10000));
									is[i_881_] = (i_1001_ - i_1003_ | i_1003_ - (i_1003_ >>> 8));
								}
								if (bool_863_ && bool_872_)
									fs[i_881_] = f;
							}
							i_873_ += i_877_;
							i_881_++;
						}
						i_874_ += i_878_;
						i_873_ = i_995_;
						i_881_ += i_882_;
					}
				} else if (i_868_ == 2) {
					int i_1004_ = i_869_ >>> 24;
					int i_1005_ = 256 - i_1004_;
					int i_1006_ = (i_869_ & 0xff00ff) * i_1005_ & ~0xff00ff;
					int i_1007_ = (i_869_ & 0xff00) * i_1005_ & 0xff0000;
					i_869_ = (i_1006_ | i_1007_) >>> 8;
					int i_1008_ = i_873_;
					for (int i_1009_ = -i_867_; i_1009_ < 0; i_1009_++) {
						int i_1010_ = (i_874_ >> 16) * anInt8877;
						for (int i_1011_ = -i_866_; i_1011_ < 0; i_1011_++) {
							if (!bool_863_ || f < fs[i_881_]) {
								int i_1012_ = (aByteArray11392[(i_873_ >> 16) + i_1010_]);
								if (i_1012_ != 0) {
									if (bool) {
										int i_1013_ = anIntArray11393[i_1012_ & 0xff];
										i_1006_ = ((i_1013_ & 0xff00ff) * i_1004_ & ~0xff00ff);
										i_1007_ = ((i_1013_ & 0xff00) * i_1004_ & 0xff0000);
										i_1013_ = (((i_1006_ | i_1007_) >>> 8) + i_869_);
										int i_1014_ = is[i_881_];
										int i_1015_ = i_1013_ + i_1014_;
										int i_1016_ = ((i_1013_ & 0xff00ff) + (i_1014_ & 0xff00ff));
										i_1014_ = ((i_1016_ & 0x1000100) + (i_1015_ - i_1016_ & 0x10000));
										is[i_881_] = (i_1015_ - i_1014_ | i_1014_ - (i_1014_ >>> 8));
									}
									if (bool_863_ && bool_872_)
										fs[i_881_] = f;
								}
							}
							i_873_ += i_877_;
							i_881_++;
						}
						i_874_ += i_878_;
						i_873_ = i_1008_;
						i_881_ += i_882_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method2436(int i, int i_1017_, int i_1018_) {
		throw new IllegalStateException();
	}

	public void method2440(int i, int i_1019_, int i_1020_) {
		throw new IllegalStateException();
	}

	Class147_Sub1_Sub3(Class180_Sub1 class180_sub1, byte[] is, int[] is_1021_, int i, int i_1022_) {
		super(class180_sub1, i, i_1022_);
		aByteArray11392 = is;
		anIntArray11393 = is_1021_;
	}

	void method2439(int i, int i_1023_, int i_1024_, int i_1025_, int i_1026_, int i_1027_, int i_1028_, int i_1029_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		if (i_1024_ > 0 && i_1025_ > 0) {
			int[] is = aClass180_Sub1_8876.anIntArray9386;
			if (is != null) {
				int i_1030_ = 0;
				int i_1031_ = 0;
				int i_1032_ = aClass180_Sub1_8876.anInt9387 * -1173855569;
				int i_1033_ = anInt8879 + anInt8877 + anInt8878;
				int i_1034_ = anInt8895 + anInt8880 + anInt8882;
				int i_1035_ = (i_1033_ << 16) / i_1024_;
				int i_1036_ = (i_1034_ << 16) / i_1025_;
				if (anInt8879 > 0) {
					int i_1037_ = ((anInt8879 << 16) + i_1035_ - 1) / i_1035_;
					i += i_1037_;
					i_1030_ += i_1037_ * i_1035_ - (anInt8879 << 16);
				}
				if (anInt8895 > 0) {
					int i_1038_ = ((anInt8895 << 16) + i_1036_ - 1) / i_1036_;
					i_1023_ += i_1038_;
					i_1031_ += i_1038_ * i_1036_ - (anInt8895 << 16);
				}
				if (anInt8877 < i_1033_)
					i_1024_ = (((anInt8877 << 16) - i_1030_ + i_1035_ - 1) / i_1035_);
				if (anInt8880 < i_1034_)
					i_1025_ = (((anInt8880 << 16) - i_1031_ + i_1036_ - 1) / i_1036_);
				int i_1039_ = i + i_1023_ * i_1032_;
				int i_1040_ = i_1032_ - i_1024_;
				if (i_1023_ + i_1025_ > aClass180_Sub1_8876.anInt9393 * -383695469)
					i_1025_ -= (i_1023_ + i_1025_ - aClass180_Sub1_8876.anInt9393 * -383695469);
				if (i_1023_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
					int i_1041_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_1023_;
					i_1025_ -= i_1041_;
					i_1039_ += i_1041_ * i_1032_;
					i_1031_ += i_1036_ * i_1041_;
				}
				if (i + i_1024_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
					int i_1042_ = (i + i_1024_ - aClass180_Sub1_8876.anInt9391 * 2014358275);
					i_1024_ -= i_1042_;
					i_1040_ += i_1042_;
				}
				if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
					int i_1043_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
					i_1024_ -= i_1043_;
					i_1039_ += i_1043_;
					i_1030_ += i_1035_ * i_1043_;
					i_1040_ += i_1043_;
				}
				if (i_1028_ == 0) {
					if (i_1026_ == 1) {
						int i_1044_ = i_1030_;
						for (int i_1045_ = -i_1025_; i_1045_ < 0; i_1045_++) {
							int i_1046_ = (i_1031_ >> 16) * anInt8877;
							for (int i_1047_ = -i_1024_; i_1047_ < 0; i_1047_++) {
								is[i_1039_++] = (anIntArray11393[(aByteArray11392[(i_1030_ >> 16) + i_1046_]) & 0xff]);
								i_1030_ += i_1035_;
							}
							i_1031_ += i_1036_;
							i_1030_ = i_1044_;
							i_1039_ += i_1040_;
						}
					} else if (i_1026_ == 0) {
						int i_1048_ = (i_1027_ & 0xff0000) >> 16;
						int i_1049_ = (i_1027_ & 0xff00) >> 8;
						int i_1050_ = i_1027_ & 0xff;
						int i_1051_ = i_1030_;
						for (int i_1052_ = -i_1025_; i_1052_ < 0; i_1052_++) {
							int i_1053_ = (i_1031_ >> 16) * anInt8877;
							for (int i_1054_ = -i_1024_; i_1054_ < 0; i_1054_++) {
								int i_1055_ = (anIntArray11393[(aByteArray11392[(i_1030_ >> 16) + i_1053_]) & 0xff]);
								int i_1056_ = ((i_1055_ & 0xff0000) * i_1048_ & ~0xffffff);
								int i_1057_ = (i_1055_ & 0xff00) * i_1049_ & 0xff0000;
								int i_1058_ = (i_1055_ & 0xff) * i_1050_ & 0xff00;
								is[i_1039_++] = (i_1056_ | i_1057_ | i_1058_) >>> 8;
								i_1030_ += i_1035_;
							}
							i_1031_ += i_1036_;
							i_1030_ = i_1051_;
							i_1039_ += i_1040_;
						}
					} else if (i_1026_ == 3) {
						int i_1059_ = i_1030_;
						for (int i_1060_ = -i_1025_; i_1060_ < 0; i_1060_++) {
							int i_1061_ = (i_1031_ >> 16) * anInt8877;
							for (int i_1062_ = -i_1024_; i_1062_ < 0; i_1062_++) {
								byte i_1063_ = (aByteArray11392[(i_1030_ >> 16) + i_1061_]);
								int i_1064_ = (i_1063_ > 0 ? anIntArray11393[i_1063_] : 0);
								int i_1065_ = i_1064_ + i_1027_;
								int i_1066_ = ((i_1064_ & 0xff00ff) + (i_1027_ & 0xff00ff));
								int i_1067_ = ((i_1066_ & 0x1000100) + (i_1065_ - i_1066_ & 0x10000));
								is[i_1039_++] = i_1065_ - i_1067_ | i_1067_ - (i_1067_ >>> 8);
								i_1030_ += i_1035_;
							}
							i_1031_ += i_1036_;
							i_1030_ = i_1059_;
							i_1039_ += i_1040_;
						}
					} else if (i_1026_ == 2) {
						int i_1068_ = i_1027_ >>> 24;
						int i_1069_ = 256 - i_1068_;
						int i_1070_ = (i_1027_ & 0xff00ff) * i_1069_ & ~0xff00ff;
						int i_1071_ = (i_1027_ & 0xff00) * i_1069_ & 0xff0000;
						i_1027_ = (i_1070_ | i_1071_) >>> 8;
						int i_1072_ = i_1030_;
						for (int i_1073_ = -i_1025_; i_1073_ < 0; i_1073_++) {
							int i_1074_ = (i_1031_ >> 16) * anInt8877;
							for (int i_1075_ = -i_1024_; i_1075_ < 0; i_1075_++) {
								int i_1076_ = (anIntArray11393[(aByteArray11392[(i_1030_ >> 16) + i_1074_]) & 0xff]);
								i_1070_ = ((i_1076_ & 0xff00ff) * i_1068_ & ~0xff00ff);
								i_1071_ = (i_1076_ & 0xff00) * i_1068_ & 0xff0000;
								is[i_1039_++] = ((i_1070_ | i_1071_) >>> 8) + i_1027_;
								i_1030_ += i_1035_;
							}
							i_1031_ += i_1036_;
							i_1030_ = i_1072_;
							i_1039_ += i_1040_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1028_ == 1) {
					if (i_1026_ == 1) {
						int i_1077_ = i_1030_;
						for (int i_1078_ = -i_1025_; i_1078_ < 0; i_1078_++) {
							int i_1079_ = (i_1031_ >> 16) * anInt8877;
							for (int i_1080_ = -i_1024_; i_1080_ < 0; i_1080_++) {
								int i_1081_ = (aByteArray11392[(i_1030_ >> 16) + i_1079_]);
								if (i_1081_ != 0)
									is[i_1039_++] = anIntArray11393[i_1081_ & 0xff];
								else
									i_1039_++;
								i_1030_ += i_1035_;
							}
							i_1031_ += i_1036_;
							i_1030_ = i_1077_;
							i_1039_ += i_1040_;
						}
					} else if (i_1026_ == 0) {
						int i_1082_ = i_1030_;
						if ((i_1027_ & 0xffffff) == 16777215) {
							int i_1083_ = i_1027_ >>> 24;
							int i_1084_ = 256 - i_1083_;
							for (int i_1085_ = -i_1025_; i_1085_ < 0; i_1085_++) {
								int i_1086_ = (i_1031_ >> 16) * anInt8877;
								for (int i_1087_ = -i_1024_; i_1087_ < 0; i_1087_++) {
									int i_1088_ = (aByteArray11392[(i_1030_ >> 16) + i_1086_]);
									if (i_1088_ != 0) {
										int i_1089_ = anIntArray11393[i_1088_ & 0xff];
										int i_1090_ = is[i_1039_];
										is[i_1039_++] = ((((i_1089_ & 0xff00ff) * i_1083_ + ((i_1090_ & 0xff00ff) * i_1084_)) & ~0xff00ff) + (((i_1089_ & 0xff00) * i_1083_ + ((i_1090_ & 0xff00) * i_1084_)) & 0xff0000)) >> 8;
									} else
										i_1039_++;
									i_1030_ += i_1035_;
								}
								i_1031_ += i_1036_;
								i_1030_ = i_1082_;
								i_1039_ += i_1040_;
							}
						} else {
							int i_1091_ = (i_1027_ & 0xff0000) >> 16;
							int i_1092_ = (i_1027_ & 0xff00) >> 8;
							int i_1093_ = i_1027_ & 0xff;
							int i_1094_ = i_1027_ >>> 24;
							int i_1095_ = 256 - i_1094_;
							for (int i_1096_ = -i_1025_; i_1096_ < 0; i_1096_++) {
								int i_1097_ = (i_1031_ >> 16) * anInt8877;
								for (int i_1098_ = -i_1024_; i_1098_ < 0; i_1098_++) {
									int i_1099_ = (aByteArray11392[(i_1030_ >> 16) + i_1097_]);
									if (i_1099_ != 0) {
										int i_1100_ = anIntArray11393[i_1099_ & 0xff];
										if (i_1094_ != 255) {
											int i_1101_ = (((i_1100_ & 0xff0000) * i_1091_) & ~0xffffff);
											int i_1102_ = ((i_1100_ & 0xff00) * i_1092_ & 0xff0000);
											int i_1103_ = ((i_1100_ & 0xff) * i_1093_ & 0xff00);
											i_1100_ = (i_1101_ | i_1102_ | i_1103_) >>> 8;
											int i_1104_ = is[i_1039_];
											is[i_1039_++] = (((((i_1100_ & 0xff00ff) * i_1094_) + ((i_1104_ & 0xff00ff) * i_1095_)) & ~0xff00ff) + ((((i_1100_ & 0xff00) * i_1094_) + ((i_1104_ & 0xff00) * i_1095_)) & 0xff0000)) >> 8;
										} else {
											int i_1105_ = (((i_1100_ & 0xff0000) * i_1091_) & ~0xffffff);
											int i_1106_ = ((i_1100_ & 0xff00) * i_1092_ & 0xff0000);
											int i_1107_ = ((i_1100_ & 0xff) * i_1093_ & 0xff00);
											is[i_1039_++] = (i_1105_ | i_1106_ | i_1107_) >>> 8;
										}
									} else
										i_1039_++;
									i_1030_ += i_1035_;
								}
								i_1031_ += i_1036_;
								i_1030_ = i_1082_;
								i_1039_ += i_1040_;
							}
						}
					} else if (i_1026_ == 3) {
						int i_1108_ = i_1030_;
						int i_1109_ = i_1027_ >>> 24;
						int i_1110_ = 256 - i_1109_;
						for (int i_1111_ = -i_1025_; i_1111_ < 0; i_1111_++) {
							int i_1112_ = (i_1031_ >> 16) * anInt8877;
							for (int i_1113_ = -i_1024_; i_1113_ < 0; i_1113_++) {
								byte i_1114_ = (aByteArray11392[(i_1030_ >> 16) + i_1112_]);
								int i_1115_ = (i_1114_ > 0 ? anIntArray11393[i_1114_] : 0);
								int i_1116_ = i_1115_ + i_1027_;
								int i_1117_ = ((i_1115_ & 0xff00ff) + (i_1027_ & 0xff00ff));
								int i_1118_ = ((i_1117_ & 0x1000100) + (i_1116_ - i_1117_ & 0x10000));
								i_1118_ = i_1116_ - i_1118_ | i_1118_ - (i_1118_ >>> 8);
								if (i_1115_ == 0 && i_1109_ != 255) {
									i_1115_ = i_1118_;
									i_1118_ = is[i_1039_];
									i_1118_ = ((((i_1115_ & 0xff00ff) * i_1109_ + (i_1118_ & 0xff00ff) * i_1110_) & ~0xff00ff) + (((i_1115_ & 0xff00) * i_1109_ + (i_1118_ & 0xff00) * i_1110_) & 0xff0000)) >> 8;
								}
								is[i_1039_++] = i_1118_;
								i_1030_ += i_1035_;
							}
							i_1031_ += i_1036_;
							i_1030_ = i_1108_;
							i_1039_ += i_1040_;
						}
					} else if (i_1026_ == 2) {
						int i_1119_ = i_1027_ >>> 24;
						int i_1120_ = 256 - i_1119_;
						int i_1121_ = (i_1027_ & 0xff00ff) * i_1120_ & ~0xff00ff;
						int i_1122_ = (i_1027_ & 0xff00) * i_1120_ & 0xff0000;
						i_1027_ = (i_1121_ | i_1122_) >>> 8;
						int i_1123_ = i_1030_;
						for (int i_1124_ = -i_1025_; i_1124_ < 0; i_1124_++) {
							int i_1125_ = (i_1031_ >> 16) * anInt8877;
							for (int i_1126_ = -i_1024_; i_1126_ < 0; i_1126_++) {
								int i_1127_ = (aByteArray11392[(i_1030_ >> 16) + i_1125_]);
								if (i_1127_ != 0) {
									int i_1128_ = anIntArray11393[i_1127_ & 0xff];
									i_1121_ = ((i_1128_ & 0xff00ff) * i_1119_ & ~0xff00ff);
									i_1122_ = ((i_1128_ & 0xff00) * i_1119_ & 0xff0000);
									is[i_1039_++] = ((i_1121_ | i_1122_) >>> 8) + i_1027_;
								} else
									i_1039_++;
								i_1030_ += i_1035_;
							}
							i_1031_ += i_1036_;
							i_1030_ = i_1123_;
							i_1039_ += i_1040_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1028_ == 2) {
					if (i_1026_ == 1) {
						int i_1129_ = i_1030_;
						for (int i_1130_ = -i_1025_; i_1130_ < 0; i_1130_++) {
							int i_1131_ = (i_1031_ >> 16) * anInt8877;
							for (int i_1132_ = -i_1024_; i_1132_ < 0; i_1132_++) {
								int i_1133_ = (aByteArray11392[(i_1030_ >> 16) + i_1131_]);
								if (i_1133_ != 0) {
									int i_1134_ = anIntArray11393[i_1133_ & 0xff];
									int i_1135_ = is[i_1039_];
									int i_1136_ = i_1134_ + i_1135_;
									int i_1137_ = ((i_1134_ & 0xff00ff) + (i_1135_ & 0xff00ff));
									i_1135_ = ((i_1137_ & 0x1000100) + (i_1136_ - i_1137_ & 0x10000));
									is[i_1039_++] = (i_1136_ - i_1135_ | i_1135_ - (i_1135_ >>> 8));
								} else
									i_1039_++;
								i_1030_ += i_1035_;
							}
							i_1031_ += i_1036_;
							i_1030_ = i_1129_;
							i_1039_ += i_1040_;
						}
					} else if (i_1026_ == 0) {
						int i_1138_ = i_1030_;
						int i_1139_ = (i_1027_ & 0xff0000) >> 16;
						int i_1140_ = (i_1027_ & 0xff00) >> 8;
						int i_1141_ = i_1027_ & 0xff;
						for (int i_1142_ = -i_1025_; i_1142_ < 0; i_1142_++) {
							int i_1143_ = (i_1031_ >> 16) * anInt8877;
							for (int i_1144_ = -i_1024_; i_1144_ < 0; i_1144_++) {
								int i_1145_ = (aByteArray11392[(i_1030_ >> 16) + i_1143_]);
								if (i_1145_ != 0) {
									int i_1146_ = anIntArray11393[i_1145_ & 0xff];
									int i_1147_ = ((i_1146_ & 0xff0000) * i_1139_ & ~0xffffff);
									int i_1148_ = ((i_1146_ & 0xff00) * i_1140_ & 0xff0000);
									int i_1149_ = (i_1146_ & 0xff) * i_1141_ & 0xff00;
									i_1146_ = (i_1147_ | i_1148_ | i_1149_) >>> 8;
									int i_1150_ = is[i_1039_];
									int i_1151_ = i_1146_ + i_1150_;
									int i_1152_ = ((i_1146_ & 0xff00ff) + (i_1150_ & 0xff00ff));
									i_1150_ = ((i_1152_ & 0x1000100) + (i_1151_ - i_1152_ & 0x10000));
									is[i_1039_++] = (i_1151_ - i_1150_ | i_1150_ - (i_1150_ >>> 8));
								} else
									i_1039_++;
								i_1030_ += i_1035_;
							}
							i_1031_ += i_1036_;
							i_1030_ = i_1138_;
							i_1039_ += i_1040_;
						}
					} else if (i_1026_ == 3) {
						int i_1153_ = i_1030_;
						for (int i_1154_ = -i_1025_; i_1154_ < 0; i_1154_++) {
							int i_1155_ = (i_1031_ >> 16) * anInt8877;
							for (int i_1156_ = -i_1024_; i_1156_ < 0; i_1156_++) {
								byte i_1157_ = (aByteArray11392[(i_1030_ >> 16) + i_1155_]);
								int i_1158_ = (i_1157_ > 0 ? anIntArray11393[i_1157_] : 0);
								int i_1159_ = i_1158_ + i_1027_;
								int i_1160_ = ((i_1158_ & 0xff00ff) + (i_1027_ & 0xff00ff));
								int i_1161_ = ((i_1160_ & 0x1000100) + (i_1159_ - i_1160_ & 0x10000));
								i_1158_ = i_1159_ - i_1161_ | i_1161_ - (i_1161_ >>> 8);
								i_1161_ = is[i_1039_];
								i_1159_ = i_1158_ + i_1161_;
								i_1160_ = (i_1158_ & 0xff00ff) + (i_1161_ & 0xff00ff);
								i_1161_ = ((i_1160_ & 0x1000100) + (i_1159_ - i_1160_ & 0x10000));
								is[i_1039_++] = i_1159_ - i_1161_ | i_1161_ - (i_1161_ >>> 8);
								i_1030_ += i_1035_;
							}
							i_1031_ += i_1036_;
							i_1030_ = i_1153_;
							i_1039_ += i_1040_;
						}
					} else if (i_1026_ == 2) {
						int i_1162_ = i_1027_ >>> 24;
						int i_1163_ = 256 - i_1162_;
						int i_1164_ = (i_1027_ & 0xff00ff) * i_1163_ & ~0xff00ff;
						int i_1165_ = (i_1027_ & 0xff00) * i_1163_ & 0xff0000;
						i_1027_ = (i_1164_ | i_1165_) >>> 8;
						int i_1166_ = i_1030_;
						for (int i_1167_ = -i_1025_; i_1167_ < 0; i_1167_++) {
							int i_1168_ = (i_1031_ >> 16) * anInt8877;
							for (int i_1169_ = -i_1024_; i_1169_ < 0; i_1169_++) {
								int i_1170_ = (aByteArray11392[(i_1030_ >> 16) + i_1168_]);
								if (i_1170_ != 0) {
									int i_1171_ = anIntArray11393[i_1170_ & 0xff];
									i_1164_ = ((i_1171_ & 0xff00ff) * i_1162_ & ~0xff00ff);
									i_1165_ = ((i_1171_ & 0xff00) * i_1162_ & 0xff0000);
									i_1171_ = (((i_1164_ | i_1165_) >>> 8) + i_1027_);
									int i_1172_ = is[i_1039_];
									int i_1173_ = i_1171_ + i_1172_;
									int i_1174_ = ((i_1171_ & 0xff00ff) + (i_1172_ & 0xff00ff));
									i_1172_ = ((i_1174_ & 0x1000100) + (i_1173_ - i_1174_ & 0x10000));
									is[i_1039_++] = (i_1173_ - i_1172_ | i_1172_ - (i_1172_ >>> 8));
								} else
									i_1039_++;
								i_1030_ += i_1035_;
							}
							i_1031_ += i_1036_;
							i_1030_ = i_1166_;
							i_1039_ += i_1040_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method14425(int i, int i_1175_) {
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is != null) {
			if (anInt8893 == 0) {
				if (anInt8909 == 0) {
					int i_1176_ = anInt8903;
					while (i_1176_ < 0) {
						int i_1177_ = anInt8892;
						int i_1178_ = anInt8899;
						int i_1179_ = anInt8900;
						int i_1180_ = anInt8888;
						if (i_1178_ >= 0 && i_1179_ >= 0 && i_1178_ - (anInt8877 << 12) < 0 && i_1179_ - (anInt8880 << 12) < 0) {
							for (/**/; i_1180_ < 0; i_1180_++) {
								int i_1181_ = ((i_1179_ >> 12) * anInt8877 + (i_1178_ >> 12));
								int i_1182_ = i_1177_++;
								if (i_1175_ == 0) {
									if (i == 1)
										is[i_1182_] = (anIntArray11393[(aByteArray11392[i_1181_] & 0xff)]);
									else if (i == 0) {
										int i_1183_ = (anIntArray11393[(aByteArray11392[i_1181_] & 0xff)]);
										int i_1184_ = ((i_1183_ & 0xff0000) * anInt8906 & ~0xffffff);
										int i_1185_ = ((i_1183_ & 0xff00) * anInt8907 & 0xff0000);
										int i_1186_ = ((i_1183_ & 0xff) * anInt8908 & 0xff00);
										is[i_1182_] = (i_1184_ | i_1185_ | i_1186_) >>> 8;
									} else if (i == 3) {
										int i_1187_ = (anIntArray11393[(aByteArray11392[i_1181_] & 0xff)]);
										int i_1188_ = anInt8894;
										int i_1189_ = i_1187_ + i_1188_;
										int i_1190_ = ((i_1187_ & 0xff00ff) + (i_1188_ & 0xff00ff));
										int i_1191_ = ((i_1190_ & 0x1000100) + (i_1189_ - i_1190_ & 0x10000));
										is[i_1182_] = (i_1189_ - i_1191_ | i_1191_ - (i_1191_ >>> 8));
									} else if (i == 2) {
										int i_1192_ = (anIntArray11393[(aByteArray11392[i_1181_] & 0xff)]);
										int i_1193_ = ((i_1192_ & 0xff00ff) * anInt8904 & ~0xff00ff);
										int i_1194_ = ((i_1192_ & 0xff00) * anInt8904 & 0xff0000);
										is[i_1182_] = ((i_1193_ | i_1194_) >>> 8) + anInt8911;
									} else
										throw new IllegalArgumentException();
								} else if (i_1175_ == 1) {
									if (i == 1) {
										int i_1195_ = aByteArray11392[i_1181_];
										if (i_1195_ != 0)
											is[i_1182_] = (anIntArray11393[i_1195_ & 0xff]);
									} else if (i == 0) {
										int i_1196_ = aByteArray11392[i_1181_];
										if (i_1196_ != 0) {
											int i_1197_ = (anIntArray11393[i_1196_ & 0xff]);
											if ((anInt8894 & 0xffffff) == 16777215) {
												int i_1198_ = anInt8894 >>> 24;
												int i_1199_ = 256 - i_1198_;
												int i_1200_ = is[i_1182_];
												is[i_1182_] = (((((i_1197_ & 0xff00ff) * i_1198_) + ((i_1200_ & 0xff00ff) * i_1199_)) & ~0xff00ff) + ((((i_1197_ & 0xff00) * i_1198_) + ((i_1200_ & 0xff00) * i_1199_)) & 0xff0000)) >> 8;
											} else if (anInt8904 != 255) {
												int i_1201_ = (((i_1197_ & 0xff0000) * anInt8906) & ~0xffffff);
												int i_1202_ = (((i_1197_ & 0xff00) * anInt8907) & 0xff0000);
												int i_1203_ = (((i_1197_ & 0xff) * anInt8908) & 0xff00);
												i_1197_ = (i_1201_ | i_1202_ | i_1203_) >>> 8;
												int i_1204_ = is[i_1182_];
												is[i_1182_] = (((((i_1197_ & 0xff00ff) * anInt8904) + ((i_1204_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1197_ & 0xff00) * anInt8904) + ((i_1204_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
											} else {
												int i_1205_ = (((i_1197_ & 0xff0000) * anInt8906) & ~0xffffff);
												int i_1206_ = (((i_1197_ & 0xff00) * anInt8907) & 0xff0000);
												int i_1207_ = (((i_1197_ & 0xff) * anInt8908) & 0xff00);
												is[i_1182_] = (i_1205_ | i_1206_ | i_1207_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_1208_ = aByteArray11392[i_1181_];
										int i_1209_ = (i_1208_ > 0 ? anIntArray11393[i_1208_] : 0);
										int i_1210_ = anInt8894;
										int i_1211_ = i_1209_ + i_1210_;
										int i_1212_ = ((i_1209_ & 0xff00ff) + (i_1210_ & 0xff00ff));
										int i_1213_ = ((i_1212_ & 0x1000100) + (i_1211_ - i_1212_ & 0x10000));
										i_1213_ = (i_1211_ - i_1213_ | i_1213_ - (i_1213_ >>> 8));
										if (i_1209_ == 0 && anInt8904 != 255) {
											i_1209_ = i_1213_;
											i_1213_ = is[i_1182_];
											i_1213_ = (((((i_1209_ & 0xff00ff) * anInt8904) + ((i_1213_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1209_ & 0xff00) * anInt8904) + ((i_1213_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
										}
										is[i_1182_] = i_1213_;
									} else if (i == 2) {
										int i_1214_ = aByteArray11392[i_1181_];
										if (i_1214_ != 0) {
											int i_1215_ = (anIntArray11393[i_1214_ & 0xff]);
											int i_1216_ = (((i_1215_ & 0xff00ff) * anInt8904) & ~0xff00ff);
											int i_1217_ = (((i_1215_ & 0xff00) * anInt8904) & 0xff0000);
											is[i_1182_++] = (((i_1216_ | i_1217_) >>> 8) + anInt8911);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1175_ == 2) {
									if (i == 1) {
										int i_1218_ = aByteArray11392[i_1181_];
										if (i_1218_ != 0) {
											int i_1219_ = (anIntArray11393[i_1218_ & 0xff]);
											int i_1220_ = is[i_1182_];
											int i_1221_ = i_1219_ + i_1220_;
											int i_1222_ = ((i_1219_ & 0xff00ff) + (i_1220_ & 0xff00ff));
											i_1220_ = ((i_1222_ & 0x1000100) + (i_1221_ - i_1222_ & 0x10000));
											is[i_1182_] = (i_1221_ - i_1220_ | i_1220_ - (i_1220_ >>> 8));
										}
									} else if (i == 0) {
										int i_1223_ = aByteArray11392[i_1181_];
										if (i_1223_ != 0) {
											int i_1224_ = (anIntArray11393[i_1223_ & 0xff]);
											int i_1225_ = (((i_1224_ & 0xff0000) * anInt8906) & ~0xffffff);
											int i_1226_ = (((i_1224_ & 0xff00) * anInt8907) & 0xff0000);
											int i_1227_ = ((i_1224_ & 0xff) * anInt8908 & 0xff00);
											i_1224_ = (i_1225_ | i_1226_ | i_1227_) >>> 8;
											int i_1228_ = is[i_1182_];
											int i_1229_ = i_1224_ + i_1228_;
											int i_1230_ = ((i_1224_ & 0xff00ff) + (i_1228_ & 0xff00ff));
											i_1228_ = ((i_1230_ & 0x1000100) + (i_1229_ - i_1230_ & 0x10000));
											is[i_1182_] = (i_1229_ - i_1228_ | i_1228_ - (i_1228_ >>> 8));
										}
									} else if (i == 3) {
										byte i_1231_ = aByteArray11392[i_1181_];
										int i_1232_ = (i_1231_ > 0 ? anIntArray11393[i_1231_] : 0);
										int i_1233_ = anInt8894;
										int i_1234_ = i_1232_ + i_1233_;
										int i_1235_ = ((i_1232_ & 0xff00ff) + (i_1233_ & 0xff00ff));
										int i_1236_ = ((i_1235_ & 0x1000100) + (i_1234_ - i_1235_ & 0x10000));
										i_1236_ = (i_1234_ - i_1236_ | i_1236_ - (i_1236_ >>> 8));
										if (i_1232_ == 0 && anInt8904 != 255) {
											i_1232_ = i_1236_;
											i_1236_ = is[i_1182_];
											i_1236_ = (((((i_1232_ & 0xff00ff) * anInt8904) + ((i_1236_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1232_ & 0xff00) * anInt8904) + ((i_1236_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
										}
										is[i_1182_] = i_1236_;
									} else if (i == 2) {
										int i_1237_ = aByteArray11392[i_1181_];
										if (i_1237_ != 0) {
											int i_1238_ = (anIntArray11393[i_1237_ & 0xff]);
											int i_1239_ = (((i_1238_ & 0xff00ff) * anInt8904) & ~0xff00ff);
											int i_1240_ = (((i_1238_ & 0xff00) * anInt8904) & 0xff0000);
											i_1238_ = ((i_1239_ | i_1240_) >>> 8) + anInt8911;
											int i_1241_ = is[i_1182_];
											int i_1242_ = i_1238_ + i_1241_;
											int i_1243_ = ((i_1238_ & 0xff00ff) + (i_1241_ & 0xff00ff));
											i_1241_ = ((i_1243_ & 0x1000100) + (i_1242_ - i_1243_ & 0x10000));
											is[i_1182_] = (i_1242_ - i_1241_ | i_1241_ - (i_1241_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_1176_++;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_1244_ = anInt8903;
					while (i_1244_ < 0) {
						int i_1245_ = anInt8892;
						int i_1246_ = anInt8899;
						int i_1247_ = anInt8900 + anInt8902;
						int i_1248_ = anInt8888;
						if (i_1246_ >= 0 && i_1246_ - (anInt8877 << 12) < 0) {
							int i_1249_;
							if ((i_1249_ = i_1247_ - (anInt8880 << 12)) >= 0) {
								i_1249_ = (anInt8909 - i_1249_) / anInt8909;
								i_1248_ += i_1249_;
								i_1247_ += anInt8909 * i_1249_;
								i_1245_ += i_1249_;
							}
							if ((i_1249_ = (i_1247_ - anInt8909) / anInt8909) > i_1248_)
								i_1248_ = i_1249_;
							for (/**/; i_1248_ < 0; i_1248_++) {
								int i_1250_ = ((i_1247_ >> 12) * anInt8877 + (i_1246_ >> 12));
								int i_1251_ = i_1245_++;
								if (i_1175_ == 0) {
									if (i == 1)
										is[i_1251_] = (anIntArray11393[(aByteArray11392[i_1250_] & 0xff)]);
									else if (i == 0) {
										int i_1252_ = (anIntArray11393[(aByteArray11392[i_1250_] & 0xff)]);
										int i_1253_ = ((i_1252_ & 0xff0000) * anInt8906 & ~0xffffff);
										int i_1254_ = ((i_1252_ & 0xff00) * anInt8907 & 0xff0000);
										int i_1255_ = ((i_1252_ & 0xff) * anInt8908 & 0xff00);
										is[i_1251_] = (i_1253_ | i_1254_ | i_1255_) >>> 8;
									} else if (i == 3) {
										int i_1256_ = (anIntArray11393[(aByteArray11392[i_1250_] & 0xff)]);
										int i_1257_ = anInt8894;
										int i_1258_ = i_1256_ + i_1257_;
										int i_1259_ = ((i_1256_ & 0xff00ff) + (i_1257_ & 0xff00ff));
										int i_1260_ = ((i_1259_ & 0x1000100) + (i_1258_ - i_1259_ & 0x10000));
										is[i_1251_] = (i_1258_ - i_1260_ | i_1260_ - (i_1260_ >>> 8));
									} else if (i == 2) {
										int i_1261_ = (anIntArray11393[(aByteArray11392[i_1250_] & 0xff)]);
										int i_1262_ = ((i_1261_ & 0xff00ff) * anInt8904 & ~0xff00ff);
										int i_1263_ = ((i_1261_ & 0xff00) * anInt8904 & 0xff0000);
										is[i_1251_] = ((i_1262_ | i_1263_) >>> 8) + anInt8911;
									} else
										throw new IllegalArgumentException();
								} else if (i_1175_ == 1) {
									if (i == 1) {
										int i_1264_ = aByteArray11392[i_1250_];
										if (i_1264_ != 0)
											is[i_1251_] = (anIntArray11393[i_1264_ & 0xff]);
									} else if (i == 0) {
										int i_1265_ = aByteArray11392[i_1250_];
										if (i_1265_ != 0) {
											int i_1266_ = (anIntArray11393[i_1265_ & 0xff]);
											if ((anInt8894 & 0xffffff) == 16777215) {
												int i_1267_ = anInt8894 >>> 24;
												int i_1268_ = 256 - i_1267_;
												int i_1269_ = is[i_1251_];
												is[i_1251_] = (((((i_1266_ & 0xff00ff) * i_1267_) + ((i_1269_ & 0xff00ff) * i_1268_)) & ~0xff00ff) + ((((i_1266_ & 0xff00) * i_1267_) + ((i_1269_ & 0xff00) * i_1268_)) & 0xff0000)) >> 8;
											} else if (anInt8904 != 255) {
												int i_1270_ = (((i_1266_ & 0xff0000) * anInt8906) & ~0xffffff);
												int i_1271_ = (((i_1266_ & 0xff00) * anInt8907) & 0xff0000);
												int i_1272_ = (((i_1266_ & 0xff) * anInt8908) & 0xff00);
												i_1266_ = (i_1270_ | i_1271_ | i_1272_) >>> 8;
												int i_1273_ = is[i_1251_];
												is[i_1251_] = (((((i_1266_ & 0xff00ff) * anInt8904) + ((i_1273_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1266_ & 0xff00) * anInt8904) + ((i_1273_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
											} else {
												int i_1274_ = (((i_1266_ & 0xff0000) * anInt8906) & ~0xffffff);
												int i_1275_ = (((i_1266_ & 0xff00) * anInt8907) & 0xff0000);
												int i_1276_ = (((i_1266_ & 0xff) * anInt8908) & 0xff00);
												is[i_1251_] = (i_1274_ | i_1275_ | i_1276_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_1277_ = aByteArray11392[i_1250_];
										int i_1278_ = (i_1277_ > 0 ? anIntArray11393[i_1277_] : 0);
										int i_1279_ = anInt8894;
										int i_1280_ = i_1278_ + i_1279_;
										int i_1281_ = ((i_1278_ & 0xff00ff) + (i_1279_ & 0xff00ff));
										int i_1282_ = ((i_1281_ & 0x1000100) + (i_1280_ - i_1281_ & 0x10000));
										i_1282_ = (i_1280_ - i_1282_ | i_1282_ - (i_1282_ >>> 8));
										if (i_1278_ == 0 && anInt8904 != 255) {
											i_1278_ = i_1282_;
											i_1282_ = is[i_1251_];
											i_1282_ = (((((i_1278_ & 0xff00ff) * anInt8904) + ((i_1282_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1278_ & 0xff00) * anInt8904) + ((i_1282_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
										}
										is[i_1251_] = i_1282_;
									} else if (i == 2) {
										int i_1283_ = aByteArray11392[i_1250_];
										if (i_1283_ != 0) {
											int i_1284_ = (anIntArray11393[i_1283_ & 0xff]);
											int i_1285_ = (((i_1284_ & 0xff00ff) * anInt8904) & ~0xff00ff);
											int i_1286_ = (((i_1284_ & 0xff00) * anInt8904) & 0xff0000);
											is[i_1251_++] = (((i_1285_ | i_1286_) >>> 8) + anInt8911);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1175_ == 2) {
									if (i == 1) {
										int i_1287_ = aByteArray11392[i_1250_];
										if (i_1287_ != 0) {
											int i_1288_ = (anIntArray11393[i_1287_ & 0xff]);
											int i_1289_ = is[i_1251_];
											int i_1290_ = i_1288_ + i_1289_;
											int i_1291_ = ((i_1288_ & 0xff00ff) + (i_1289_ & 0xff00ff));
											i_1289_ = ((i_1291_ & 0x1000100) + (i_1290_ - i_1291_ & 0x10000));
											is[i_1251_] = (i_1290_ - i_1289_ | i_1289_ - (i_1289_ >>> 8));
										}
									} else if (i == 0) {
										int i_1292_ = aByteArray11392[i_1250_];
										if (i_1292_ != 0) {
											int i_1293_ = (anIntArray11393[i_1292_ & 0xff]);
											int i_1294_ = (((i_1293_ & 0xff0000) * anInt8906) & ~0xffffff);
											int i_1295_ = (((i_1293_ & 0xff00) * anInt8907) & 0xff0000);
											int i_1296_ = ((i_1293_ & 0xff) * anInt8908 & 0xff00);
											i_1293_ = (i_1294_ | i_1295_ | i_1296_) >>> 8;
											int i_1297_ = is[i_1251_];
											int i_1298_ = i_1293_ + i_1297_;
											int i_1299_ = ((i_1293_ & 0xff00ff) + (i_1297_ & 0xff00ff));
											i_1297_ = ((i_1299_ & 0x1000100) + (i_1298_ - i_1299_ & 0x10000));
											is[i_1251_] = (i_1298_ - i_1297_ | i_1297_ - (i_1297_ >>> 8));
										}
									} else if (i == 3) {
										byte i_1300_ = aByteArray11392[i_1250_];
										int i_1301_ = (i_1300_ > 0 ? anIntArray11393[i_1300_] : 0);
										int i_1302_ = anInt8894;
										int i_1303_ = i_1301_ + i_1302_;
										int i_1304_ = ((i_1301_ & 0xff00ff) + (i_1302_ & 0xff00ff));
										int i_1305_ = ((i_1304_ & 0x1000100) + (i_1303_ - i_1304_ & 0x10000));
										i_1305_ = (i_1303_ - i_1305_ | i_1305_ - (i_1305_ >>> 8));
										if (i_1301_ == 0 && anInt8904 != 255) {
											i_1301_ = i_1305_;
											i_1305_ = is[i_1251_];
											i_1305_ = (((((i_1301_ & 0xff00ff) * anInt8904) + ((i_1305_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1301_ & 0xff00) * anInt8904) + ((i_1305_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
										}
										is[i_1251_] = i_1305_;
									} else if (i == 2) {
										int i_1306_ = aByteArray11392[i_1250_];
										if (i_1306_ != 0) {
											int i_1307_ = (anIntArray11393[i_1306_ & 0xff]);
											int i_1308_ = (((i_1307_ & 0xff00ff) * anInt8904) & ~0xff00ff);
											int i_1309_ = (((i_1307_ & 0xff00) * anInt8904) & 0xff0000);
											i_1307_ = ((i_1308_ | i_1309_) >>> 8) + anInt8911;
											int i_1310_ = is[i_1251_];
											int i_1311_ = i_1307_ + i_1310_;
											int i_1312_ = ((i_1307_ & 0xff00ff) + (i_1310_ & 0xff00ff));
											i_1310_ = ((i_1312_ & 0x1000100) + (i_1311_ - i_1312_ & 0x10000));
											is[i_1251_] = (i_1311_ - i_1310_ | i_1310_ - (i_1310_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_1247_ += anInt8909;
							}
						}
						i_1244_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				} else {
					int i_1313_ = anInt8903;
					while (i_1313_ < 0) {
						int i_1314_ = anInt8892;
						int i_1315_ = anInt8899;
						int i_1316_ = anInt8900 + anInt8902;
						int i_1317_ = anInt8888;
						if (i_1315_ >= 0 && i_1315_ - (anInt8877 << 12) < 0) {
							if (i_1316_ < 0) {
								int i_1318_ = (anInt8909 - 1 - i_1316_) / anInt8909;
								i_1317_ += i_1318_;
								i_1316_ += anInt8909 * i_1318_;
								i_1314_ += i_1318_;
							}
							int i_1319_;
							if ((i_1319_ = (1 + i_1316_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_1317_)
								i_1317_ = i_1319_;
							for (/**/; i_1317_ < 0; i_1317_++) {
								int i_1320_ = ((i_1316_ >> 12) * anInt8877 + (i_1315_ >> 12));
								int i_1321_ = i_1314_++;
								if (i_1175_ == 0) {
									if (i == 1)
										is[i_1321_] = (anIntArray11393[(aByteArray11392[i_1320_] & 0xff)]);
									else if (i == 0) {
										int i_1322_ = (anIntArray11393[(aByteArray11392[i_1320_] & 0xff)]);
										int i_1323_ = ((i_1322_ & 0xff0000) * anInt8906 & ~0xffffff);
										int i_1324_ = ((i_1322_ & 0xff00) * anInt8907 & 0xff0000);
										int i_1325_ = ((i_1322_ & 0xff) * anInt8908 & 0xff00);
										is[i_1321_] = (i_1323_ | i_1324_ | i_1325_) >>> 8;
									} else if (i == 3) {
										int i_1326_ = (anIntArray11393[(aByteArray11392[i_1320_] & 0xff)]);
										int i_1327_ = anInt8894;
										int i_1328_ = i_1326_ + i_1327_;
										int i_1329_ = ((i_1326_ & 0xff00ff) + (i_1327_ & 0xff00ff));
										int i_1330_ = ((i_1329_ & 0x1000100) + (i_1328_ - i_1329_ & 0x10000));
										is[i_1321_] = (i_1328_ - i_1330_ | i_1330_ - (i_1330_ >>> 8));
									} else if (i == 2) {
										int i_1331_ = (anIntArray11393[(aByteArray11392[i_1320_] & 0xff)]);
										int i_1332_ = ((i_1331_ & 0xff00ff) * anInt8904 & ~0xff00ff);
										int i_1333_ = ((i_1331_ & 0xff00) * anInt8904 & 0xff0000);
										is[i_1321_] = ((i_1332_ | i_1333_) >>> 8) + anInt8911;
									} else
										throw new IllegalArgumentException();
								} else if (i_1175_ == 1) {
									if (i == 1) {
										int i_1334_ = aByteArray11392[i_1320_];
										if (i_1334_ != 0)
											is[i_1321_] = (anIntArray11393[i_1334_ & 0xff]);
									} else if (i == 0) {
										int i_1335_ = aByteArray11392[i_1320_];
										if (i_1335_ != 0) {
											int i_1336_ = (anIntArray11393[i_1335_ & 0xff]);
											if ((anInt8894 & 0xffffff) == 16777215) {
												int i_1337_ = anInt8894 >>> 24;
												int i_1338_ = 256 - i_1337_;
												int i_1339_ = is[i_1321_];
												is[i_1321_] = (((((i_1336_ & 0xff00ff) * i_1337_) + ((i_1339_ & 0xff00ff) * i_1338_)) & ~0xff00ff) + ((((i_1336_ & 0xff00) * i_1337_) + ((i_1339_ & 0xff00) * i_1338_)) & 0xff0000)) >> 8;
											} else if (anInt8904 != 255) {
												int i_1340_ = (((i_1336_ & 0xff0000) * anInt8906) & ~0xffffff);
												int i_1341_ = (((i_1336_ & 0xff00) * anInt8907) & 0xff0000);
												int i_1342_ = (((i_1336_ & 0xff) * anInt8908) & 0xff00);
												i_1336_ = (i_1340_ | i_1341_ | i_1342_) >>> 8;
												int i_1343_ = is[i_1321_];
												is[i_1321_] = (((((i_1336_ & 0xff00ff) * anInt8904) + ((i_1343_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1336_ & 0xff00) * anInt8904) + ((i_1343_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
											} else {
												int i_1344_ = (((i_1336_ & 0xff0000) * anInt8906) & ~0xffffff);
												int i_1345_ = (((i_1336_ & 0xff00) * anInt8907) & 0xff0000);
												int i_1346_ = (((i_1336_ & 0xff) * anInt8908) & 0xff00);
												is[i_1321_] = (i_1344_ | i_1345_ | i_1346_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_1347_ = aByteArray11392[i_1320_];
										int i_1348_ = (i_1347_ > 0 ? anIntArray11393[i_1347_] : 0);
										int i_1349_ = anInt8894;
										int i_1350_ = i_1348_ + i_1349_;
										int i_1351_ = ((i_1348_ & 0xff00ff) + (i_1349_ & 0xff00ff));
										int i_1352_ = ((i_1351_ & 0x1000100) + (i_1350_ - i_1351_ & 0x10000));
										i_1352_ = (i_1350_ - i_1352_ | i_1352_ - (i_1352_ >>> 8));
										if (i_1348_ == 0 && anInt8904 != 255) {
											i_1348_ = i_1352_;
											i_1352_ = is[i_1321_];
											i_1352_ = (((((i_1348_ & 0xff00ff) * anInt8904) + ((i_1352_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1348_ & 0xff00) * anInt8904) + ((i_1352_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
										}
										is[i_1321_] = i_1352_;
									} else if (i == 2) {
										int i_1353_ = aByteArray11392[i_1320_];
										if (i_1353_ != 0) {
											int i_1354_ = (anIntArray11393[i_1353_ & 0xff]);
											int i_1355_ = (((i_1354_ & 0xff00ff) * anInt8904) & ~0xff00ff);
											int i_1356_ = (((i_1354_ & 0xff00) * anInt8904) & 0xff0000);
											is[i_1321_++] = (((i_1355_ | i_1356_) >>> 8) + anInt8911);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1175_ == 2) {
									if (i == 1) {
										int i_1357_ = aByteArray11392[i_1320_];
										if (i_1357_ != 0) {
											int i_1358_ = (anIntArray11393[i_1357_ & 0xff]);
											int i_1359_ = is[i_1321_];
											int i_1360_ = i_1358_ + i_1359_;
											int i_1361_ = ((i_1358_ & 0xff00ff) + (i_1359_ & 0xff00ff));
											i_1359_ = ((i_1361_ & 0x1000100) + (i_1360_ - i_1361_ & 0x10000));
											is[i_1321_] = (i_1360_ - i_1359_ | i_1359_ - (i_1359_ >>> 8));
										}
									} else if (i == 0) {
										int i_1362_ = aByteArray11392[i_1320_];
										if (i_1362_ != 0) {
											int i_1363_ = (anIntArray11393[i_1362_ & 0xff]);
											int i_1364_ = (((i_1363_ & 0xff0000) * anInt8906) & ~0xffffff);
											int i_1365_ = (((i_1363_ & 0xff00) * anInt8907) & 0xff0000);
											int i_1366_ = ((i_1363_ & 0xff) * anInt8908 & 0xff00);
											i_1363_ = (i_1364_ | i_1365_ | i_1366_) >>> 8;
											int i_1367_ = is[i_1321_];
											int i_1368_ = i_1363_ + i_1367_;
											int i_1369_ = ((i_1363_ & 0xff00ff) + (i_1367_ & 0xff00ff));
											i_1367_ = ((i_1369_ & 0x1000100) + (i_1368_ - i_1369_ & 0x10000));
											is[i_1321_] = (i_1368_ - i_1367_ | i_1367_ - (i_1367_ >>> 8));
										}
									} else if (i == 3) {
										byte i_1370_ = aByteArray11392[i_1320_];
										int i_1371_ = (i_1370_ > 0 ? anIntArray11393[i_1370_] : 0);
										int i_1372_ = anInt8894;
										int i_1373_ = i_1371_ + i_1372_;
										int i_1374_ = ((i_1371_ & 0xff00ff) + (i_1372_ & 0xff00ff));
										int i_1375_ = ((i_1374_ & 0x1000100) + (i_1373_ - i_1374_ & 0x10000));
										i_1375_ = (i_1373_ - i_1375_ | i_1375_ - (i_1375_ >>> 8));
										if (i_1371_ == 0 && anInt8904 != 255) {
											i_1371_ = i_1375_;
											i_1375_ = is[i_1321_];
											i_1375_ = (((((i_1371_ & 0xff00ff) * anInt8904) + ((i_1375_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1371_ & 0xff00) * anInt8904) + ((i_1375_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
										}
										is[i_1321_] = i_1375_;
									} else if (i == 2) {
										int i_1376_ = aByteArray11392[i_1320_];
										if (i_1376_ != 0) {
											int i_1377_ = (anIntArray11393[i_1376_ & 0xff]);
											int i_1378_ = (((i_1377_ & 0xff00ff) * anInt8904) & ~0xff00ff);
											int i_1379_ = (((i_1377_ & 0xff00) * anInt8904) & 0xff0000);
											i_1377_ = ((i_1378_ | i_1379_) >>> 8) + anInt8911;
											int i_1380_ = is[i_1321_];
											int i_1381_ = i_1377_ + i_1380_;
											int i_1382_ = ((i_1377_ & 0xff00ff) + (i_1380_ & 0xff00ff));
											i_1380_ = ((i_1382_ & 0x1000100) + (i_1381_ - i_1382_ & 0x10000));
											is[i_1321_] = (i_1381_ - i_1380_ | i_1380_ - (i_1380_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_1316_ += anInt8909;
							}
						}
						i_1313_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8893 < 0) {
				if (anInt8909 == 0) {
					int i_1383_ = anInt8903;
					while (i_1383_ < 0) {
						int i_1384_ = anInt8892;
						int i_1385_ = anInt8899 + anInt8890;
						int i_1386_ = anInt8900;
						int i_1387_ = anInt8888;
						if (i_1386_ >= 0 && i_1386_ - (anInt8880 << 12) < 0) {
							int i_1388_;
							if ((i_1388_ = i_1385_ - (anInt8877 << 12)) >= 0) {
								i_1388_ = (anInt8893 - i_1388_) / anInt8893;
								i_1387_ += i_1388_;
								i_1385_ += anInt8893 * i_1388_;
								i_1384_ += i_1388_;
							}
							if ((i_1388_ = (i_1385_ - anInt8893) / anInt8893) > i_1387_)
								i_1387_ = i_1388_;
							for (/**/; i_1387_ < 0; i_1387_++) {
								int i_1389_ = ((i_1386_ >> 12) * anInt8877 + (i_1385_ >> 12));
								int i_1390_ = i_1384_++;
								if (i_1175_ == 0) {
									if (i == 1)
										is[i_1390_] = (anIntArray11393[(aByteArray11392[i_1389_] & 0xff)]);
									else if (i == 0) {
										int i_1391_ = (anIntArray11393[(aByteArray11392[i_1389_] & 0xff)]);
										int i_1392_ = ((i_1391_ & 0xff0000) * anInt8906 & ~0xffffff);
										int i_1393_ = ((i_1391_ & 0xff00) * anInt8907 & 0xff0000);
										int i_1394_ = ((i_1391_ & 0xff) * anInt8908 & 0xff00);
										is[i_1390_] = (i_1392_ | i_1393_ | i_1394_) >>> 8;
									} else if (i == 3) {
										int i_1395_ = (anIntArray11393[(aByteArray11392[i_1389_] & 0xff)]);
										int i_1396_ = anInt8894;
										int i_1397_ = i_1395_ + i_1396_;
										int i_1398_ = ((i_1395_ & 0xff00ff) + (i_1396_ & 0xff00ff));
										int i_1399_ = ((i_1398_ & 0x1000100) + (i_1397_ - i_1398_ & 0x10000));
										is[i_1390_] = (i_1397_ - i_1399_ | i_1399_ - (i_1399_ >>> 8));
									} else if (i == 2) {
										int i_1400_ = (anIntArray11393[(aByteArray11392[i_1389_] & 0xff)]);
										int i_1401_ = ((i_1400_ & 0xff00ff) * anInt8904 & ~0xff00ff);
										int i_1402_ = ((i_1400_ & 0xff00) * anInt8904 & 0xff0000);
										is[i_1390_] = ((i_1401_ | i_1402_) >>> 8) + anInt8911;
									} else
										throw new IllegalArgumentException();
								} else if (i_1175_ == 1) {
									if (i == 1) {
										int i_1403_ = aByteArray11392[i_1389_];
										if (i_1403_ != 0)
											is[i_1390_] = (anIntArray11393[i_1403_ & 0xff]);
									} else if (i == 0) {
										int i_1404_ = aByteArray11392[i_1389_];
										if (i_1404_ != 0) {
											int i_1405_ = (anIntArray11393[i_1404_ & 0xff]);
											if ((anInt8894 & 0xffffff) == 16777215) {
												int i_1406_ = anInt8894 >>> 24;
												int i_1407_ = 256 - i_1406_;
												int i_1408_ = is[i_1390_];
												is[i_1390_] = (((((i_1405_ & 0xff00ff) * i_1406_) + ((i_1408_ & 0xff00ff) * i_1407_)) & ~0xff00ff) + ((((i_1405_ & 0xff00) * i_1406_) + ((i_1408_ & 0xff00) * i_1407_)) & 0xff0000)) >> 8;
											} else if (anInt8904 != 255) {
												int i_1409_ = (((i_1405_ & 0xff0000) * anInt8906) & ~0xffffff);
												int i_1410_ = (((i_1405_ & 0xff00) * anInt8907) & 0xff0000);
												int i_1411_ = (((i_1405_ & 0xff) * anInt8908) & 0xff00);
												i_1405_ = (i_1409_ | i_1410_ | i_1411_) >>> 8;
												int i_1412_ = is[i_1390_];
												is[i_1390_] = (((((i_1405_ & 0xff00ff) * anInt8904) + ((i_1412_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1405_ & 0xff00) * anInt8904) + ((i_1412_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
											} else {
												int i_1413_ = (((i_1405_ & 0xff0000) * anInt8906) & ~0xffffff);
												int i_1414_ = (((i_1405_ & 0xff00) * anInt8907) & 0xff0000);
												int i_1415_ = (((i_1405_ & 0xff) * anInt8908) & 0xff00);
												is[i_1390_] = (i_1413_ | i_1414_ | i_1415_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_1416_ = aByteArray11392[i_1389_];
										int i_1417_ = (i_1416_ > 0 ? anIntArray11393[i_1416_] : 0);
										int i_1418_ = anInt8894;
										int i_1419_ = i_1417_ + i_1418_;
										int i_1420_ = ((i_1417_ & 0xff00ff) + (i_1418_ & 0xff00ff));
										int i_1421_ = ((i_1420_ & 0x1000100) + (i_1419_ - i_1420_ & 0x10000));
										i_1421_ = (i_1419_ - i_1421_ | i_1421_ - (i_1421_ >>> 8));
										if (i_1417_ == 0 && anInt8904 != 255) {
											i_1417_ = i_1421_;
											i_1421_ = is[i_1390_];
											i_1421_ = (((((i_1417_ & 0xff00ff) * anInt8904) + ((i_1421_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1417_ & 0xff00) * anInt8904) + ((i_1421_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
										}
										is[i_1390_] = i_1421_;
									} else if (i == 2) {
										int i_1422_ = aByteArray11392[i_1389_];
										if (i_1422_ != 0) {
											int i_1423_ = (anIntArray11393[i_1422_ & 0xff]);
											int i_1424_ = (((i_1423_ & 0xff00ff) * anInt8904) & ~0xff00ff);
											int i_1425_ = (((i_1423_ & 0xff00) * anInt8904) & 0xff0000);
											is[i_1390_++] = (((i_1424_ | i_1425_) >>> 8) + anInt8911);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1175_ == 2) {
									if (i == 1) {
										int i_1426_ = aByteArray11392[i_1389_];
										if (i_1426_ != 0) {
											int i_1427_ = (anIntArray11393[i_1426_ & 0xff]);
											int i_1428_ = is[i_1390_];
											int i_1429_ = i_1427_ + i_1428_;
											int i_1430_ = ((i_1427_ & 0xff00ff) + (i_1428_ & 0xff00ff));
											i_1428_ = ((i_1430_ & 0x1000100) + (i_1429_ - i_1430_ & 0x10000));
											is[i_1390_] = (i_1429_ - i_1428_ | i_1428_ - (i_1428_ >>> 8));
										}
									} else if (i == 0) {
										int i_1431_ = aByteArray11392[i_1389_];
										if (i_1431_ != 0) {
											int i_1432_ = (anIntArray11393[i_1431_ & 0xff]);
											int i_1433_ = (((i_1432_ & 0xff0000) * anInt8906) & ~0xffffff);
											int i_1434_ = (((i_1432_ & 0xff00) * anInt8907) & 0xff0000);
											int i_1435_ = ((i_1432_ & 0xff) * anInt8908 & 0xff00);
											i_1432_ = (i_1433_ | i_1434_ | i_1435_) >>> 8;
											int i_1436_ = is[i_1390_];
											int i_1437_ = i_1432_ + i_1436_;
											int i_1438_ = ((i_1432_ & 0xff00ff) + (i_1436_ & 0xff00ff));
											i_1436_ = ((i_1438_ & 0x1000100) + (i_1437_ - i_1438_ & 0x10000));
											is[i_1390_] = (i_1437_ - i_1436_ | i_1436_ - (i_1436_ >>> 8));
										}
									} else if (i == 3) {
										byte i_1439_ = aByteArray11392[i_1389_];
										int i_1440_ = (i_1439_ > 0 ? anIntArray11393[i_1439_] : 0);
										int i_1441_ = anInt8894;
										int i_1442_ = i_1440_ + i_1441_;
										int i_1443_ = ((i_1440_ & 0xff00ff) + (i_1441_ & 0xff00ff));
										int i_1444_ = ((i_1443_ & 0x1000100) + (i_1442_ - i_1443_ & 0x10000));
										i_1444_ = (i_1442_ - i_1444_ | i_1444_ - (i_1444_ >>> 8));
										if (i_1440_ == 0 && anInt8904 != 255) {
											i_1440_ = i_1444_;
											i_1444_ = is[i_1390_];
											i_1444_ = (((((i_1440_ & 0xff00ff) * anInt8904) + ((i_1444_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1440_ & 0xff00) * anInt8904) + ((i_1444_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
										}
										is[i_1390_] = i_1444_;
									} else if (i == 2) {
										int i_1445_ = aByteArray11392[i_1389_];
										if (i_1445_ != 0) {
											int i_1446_ = (anIntArray11393[i_1445_ & 0xff]);
											int i_1447_ = (((i_1446_ & 0xff00ff) * anInt8904) & ~0xff00ff);
											int i_1448_ = (((i_1446_ & 0xff00) * anInt8904) & 0xff0000);
											i_1446_ = ((i_1447_ | i_1448_) >>> 8) + anInt8911;
											int i_1449_ = is[i_1390_];
											int i_1450_ = i_1446_ + i_1449_;
											int i_1451_ = ((i_1446_ & 0xff00ff) + (i_1449_ & 0xff00ff));
											i_1449_ = ((i_1451_ & 0x1000100) + (i_1450_ - i_1451_ & 0x10000));
											is[i_1390_] = (i_1450_ - i_1449_ | i_1449_ - (i_1449_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_1385_ += anInt8893;
							}
						}
						i_1383_++;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_1452_ = anInt8903;
					while (i_1452_ < 0) {
						int i_1453_ = anInt8892;
						int i_1454_ = anInt8899 + anInt8890;
						int i_1455_ = anInt8900 + anInt8902;
						int i_1456_ = anInt8888;
						int i_1457_;
						if ((i_1457_ = i_1454_ - (anInt8877 << 12)) >= 0) {
							i_1457_ = (anInt8893 - i_1457_) / anInt8893;
							i_1456_ += i_1457_;
							i_1454_ += anInt8893 * i_1457_;
							i_1455_ += anInt8909 * i_1457_;
							i_1453_ += i_1457_;
						}
						if ((i_1457_ = (i_1454_ - anInt8893) / anInt8893) > i_1456_)
							i_1456_ = i_1457_;
						if ((i_1457_ = i_1455_ - (anInt8880 << 12)) >= 0) {
							i_1457_ = (anInt8909 - i_1457_) / anInt8909;
							i_1456_ += i_1457_;
							i_1454_ += anInt8893 * i_1457_;
							i_1455_ += anInt8909 * i_1457_;
							i_1453_ += i_1457_;
						}
						if ((i_1457_ = (i_1455_ - anInt8909) / anInt8909) > i_1456_)
							i_1456_ = i_1457_;
						for (/**/; i_1456_ < 0; i_1456_++) {
							int i_1458_ = ((i_1455_ >> 12) * anInt8877 + (i_1454_ >> 12));
							int i_1459_ = i_1453_++;
							if (i_1175_ == 0) {
								if (i == 1)
									is[i_1459_] = (anIntArray11393[aByteArray11392[i_1458_] & 0xff]);
								else if (i == 0) {
									int i_1460_ = (anIntArray11393[aByteArray11392[i_1458_] & 0xff]);
									int i_1461_ = ((i_1460_ & 0xff0000) * anInt8906 & ~0xffffff);
									int i_1462_ = ((i_1460_ & 0xff00) * anInt8907 & 0xff0000);
									int i_1463_ = ((i_1460_ & 0xff) * anInt8908 & 0xff00);
									is[i_1459_] = (i_1461_ | i_1462_ | i_1463_) >>> 8;
								} else if (i == 3) {
									int i_1464_ = (anIntArray11393[aByteArray11392[i_1458_] & 0xff]);
									int i_1465_ = anInt8894;
									int i_1466_ = i_1464_ + i_1465_;
									int i_1467_ = ((i_1464_ & 0xff00ff) + (i_1465_ & 0xff00ff));
									int i_1468_ = ((i_1467_ & 0x1000100) + (i_1466_ - i_1467_ & 0x10000));
									is[i_1459_] = (i_1466_ - i_1468_ | i_1468_ - (i_1468_ >>> 8));
								} else if (i == 2) {
									int i_1469_ = (anIntArray11393[aByteArray11392[i_1458_] & 0xff]);
									int i_1470_ = ((i_1469_ & 0xff00ff) * anInt8904 & ~0xff00ff);
									int i_1471_ = ((i_1469_ & 0xff00) * anInt8904 & 0xff0000);
									is[i_1459_] = (((i_1470_ | i_1471_) >>> 8) + anInt8911);
								} else
									throw new IllegalArgumentException();
							} else if (i_1175_ == 1) {
								if (i == 1) {
									int i_1472_ = aByteArray11392[i_1458_];
									if (i_1472_ != 0)
										is[i_1459_] = anIntArray11393[i_1472_ & 0xff];
								} else if (i == 0) {
									int i_1473_ = aByteArray11392[i_1458_];
									if (i_1473_ != 0) {
										int i_1474_ = anIntArray11393[i_1473_ & 0xff];
										if ((anInt8894 & 0xffffff) == 16777215) {
											int i_1475_ = anInt8894 >>> 24;
											int i_1476_ = 256 - i_1475_;
											int i_1477_ = is[i_1459_];
											is[i_1459_] = (((((i_1474_ & 0xff00ff) * i_1475_) + ((i_1477_ & 0xff00ff) * i_1476_)) & ~0xff00ff) + ((((i_1474_ & 0xff00) * i_1475_) + ((i_1477_ & 0xff00) * i_1476_)) & 0xff0000)) >> 8;
										} else if (anInt8904 != 255) {
											int i_1478_ = (((i_1474_ & 0xff0000) * anInt8906) & ~0xffffff);
											int i_1479_ = (((i_1474_ & 0xff00) * anInt8907) & 0xff0000);
											int i_1480_ = ((i_1474_ & 0xff) * anInt8908 & 0xff00);
											i_1474_ = (i_1478_ | i_1479_ | i_1480_) >>> 8;
											int i_1481_ = is[i_1459_];
											is[i_1459_] = (((((i_1474_ & 0xff00ff) * anInt8904) + ((i_1481_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1474_ & 0xff00) * anInt8904) + ((i_1481_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
										} else {
											int i_1482_ = (((i_1474_ & 0xff0000) * anInt8906) & ~0xffffff);
											int i_1483_ = (((i_1474_ & 0xff00) * anInt8907) & 0xff0000);
											int i_1484_ = ((i_1474_ & 0xff) * anInt8908 & 0xff00);
											is[i_1459_] = (i_1482_ | i_1483_ | i_1484_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_1485_ = aByteArray11392[i_1458_];
									int i_1486_ = (i_1485_ > 0 ? anIntArray11393[i_1485_] : 0);
									int i_1487_ = anInt8894;
									int i_1488_ = i_1486_ + i_1487_;
									int i_1489_ = ((i_1486_ & 0xff00ff) + (i_1487_ & 0xff00ff));
									int i_1490_ = ((i_1489_ & 0x1000100) + (i_1488_ - i_1489_ & 0x10000));
									i_1490_ = (i_1488_ - i_1490_ | i_1490_ - (i_1490_ >>> 8));
									if (i_1486_ == 0 && anInt8904 != 255) {
										i_1486_ = i_1490_;
										i_1490_ = is[i_1459_];
										i_1490_ = (((((i_1486_ & 0xff00ff) * anInt8904) + ((i_1490_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1486_ & 0xff00) * anInt8904) + ((i_1490_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
									}
									is[i_1459_] = i_1490_;
								} else if (i == 2) {
									int i_1491_ = aByteArray11392[i_1458_];
									if (i_1491_ != 0) {
										int i_1492_ = anIntArray11393[i_1491_ & 0xff];
										int i_1493_ = ((i_1492_ & 0xff00ff) * anInt8904 & ~0xff00ff);
										int i_1494_ = ((i_1492_ & 0xff00) * anInt8904 & 0xff0000);
										is[i_1459_++] = ((i_1493_ | i_1494_) >>> 8) + anInt8911;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_1175_ == 2) {
								if (i == 1) {
									int i_1495_ = aByteArray11392[i_1458_];
									if (i_1495_ != 0) {
										int i_1496_ = anIntArray11393[i_1495_ & 0xff];
										int i_1497_ = is[i_1459_];
										int i_1498_ = i_1496_ + i_1497_;
										int i_1499_ = ((i_1496_ & 0xff00ff) + (i_1497_ & 0xff00ff));
										i_1497_ = ((i_1499_ & 0x1000100) + (i_1498_ - i_1499_ & 0x10000));
										is[i_1459_] = (i_1498_ - i_1497_ | i_1497_ - (i_1497_ >>> 8));
									}
								} else if (i == 0) {
									int i_1500_ = aByteArray11392[i_1458_];
									if (i_1500_ != 0) {
										int i_1501_ = anIntArray11393[i_1500_ & 0xff];
										int i_1502_ = ((i_1501_ & 0xff0000) * anInt8906 & ~0xffffff);
										int i_1503_ = ((i_1501_ & 0xff00) * anInt8907 & 0xff0000);
										int i_1504_ = ((i_1501_ & 0xff) * anInt8908 & 0xff00);
										i_1501_ = (i_1502_ | i_1503_ | i_1504_) >>> 8;
										int i_1505_ = is[i_1459_];
										int i_1506_ = i_1501_ + i_1505_;
										int i_1507_ = ((i_1501_ & 0xff00ff) + (i_1505_ & 0xff00ff));
										i_1505_ = ((i_1507_ & 0x1000100) + (i_1506_ - i_1507_ & 0x10000));
										is[i_1459_] = (i_1506_ - i_1505_ | i_1505_ - (i_1505_ >>> 8));
									}
								} else if (i == 3) {
									byte i_1508_ = aByteArray11392[i_1458_];
									int i_1509_ = (i_1508_ > 0 ? anIntArray11393[i_1508_] : 0);
									int i_1510_ = anInt8894;
									int i_1511_ = i_1509_ + i_1510_;
									int i_1512_ = ((i_1509_ & 0xff00ff) + (i_1510_ & 0xff00ff));
									int i_1513_ = ((i_1512_ & 0x1000100) + (i_1511_ - i_1512_ & 0x10000));
									i_1513_ = (i_1511_ - i_1513_ | i_1513_ - (i_1513_ >>> 8));
									if (i_1509_ == 0 && anInt8904 != 255) {
										i_1509_ = i_1513_;
										i_1513_ = is[i_1459_];
										i_1513_ = (((((i_1509_ & 0xff00ff) * anInt8904) + ((i_1513_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1509_ & 0xff00) * anInt8904) + ((i_1513_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
									}
									is[i_1459_] = i_1513_;
								} else if (i == 2) {
									int i_1514_ = aByteArray11392[i_1458_];
									if (i_1514_ != 0) {
										int i_1515_ = anIntArray11393[i_1514_ & 0xff];
										int i_1516_ = ((i_1515_ & 0xff00ff) * anInt8904 & ~0xff00ff);
										int i_1517_ = ((i_1515_ & 0xff00) * anInt8904 & 0xff0000);
										i_1515_ = (((i_1516_ | i_1517_) >>> 8) + anInt8911);
										int i_1518_ = is[i_1459_];
										int i_1519_ = i_1515_ + i_1518_;
										int i_1520_ = ((i_1515_ & 0xff00ff) + (i_1518_ & 0xff00ff));
										i_1518_ = ((i_1520_ & 0x1000100) + (i_1519_ - i_1520_ & 0x10000));
										is[i_1459_] = (i_1519_ - i_1518_ | i_1518_ - (i_1518_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_1454_ += anInt8893;
							i_1455_ += anInt8909;
						}
						i_1452_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else {
					int i_1521_ = anInt8903;
					while (i_1521_ < 0) {
						int i_1522_ = anInt8892;
						int i_1523_ = anInt8899 + anInt8890;
						int i_1524_ = anInt8900 + anInt8902;
						int i_1525_ = anInt8888;
						int i_1526_;
						if ((i_1526_ = i_1523_ - (anInt8877 << 12)) >= 0) {
							i_1526_ = (anInt8893 - i_1526_) / anInt8893;
							i_1525_ += i_1526_;
							i_1523_ += anInt8893 * i_1526_;
							i_1524_ += anInt8909 * i_1526_;
							i_1522_ += i_1526_;
						}
						if ((i_1526_ = (i_1523_ - anInt8893) / anInt8893) > i_1525_)
							i_1525_ = i_1526_;
						if (i_1524_ < 0) {
							i_1526_ = (anInt8909 - 1 - i_1524_) / anInt8909;
							i_1525_ += i_1526_;
							i_1523_ += anInt8893 * i_1526_;
							i_1524_ += anInt8909 * i_1526_;
							i_1522_ += i_1526_;
						}
						if ((i_1526_ = (1 + i_1524_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_1525_)
							i_1525_ = i_1526_;
						for (/**/; i_1525_ < 0; i_1525_++) {
							int i_1527_ = ((i_1524_ >> 12) * anInt8877 + (i_1523_ >> 12));
							int i_1528_ = i_1522_++;
							if (i_1175_ == 0) {
								if (i == 1)
									is[i_1528_] = (anIntArray11393[aByteArray11392[i_1527_] & 0xff]);
								else if (i == 0) {
									int i_1529_ = (anIntArray11393[aByteArray11392[i_1527_] & 0xff]);
									int i_1530_ = ((i_1529_ & 0xff0000) * anInt8906 & ~0xffffff);
									int i_1531_ = ((i_1529_ & 0xff00) * anInt8907 & 0xff0000);
									int i_1532_ = ((i_1529_ & 0xff) * anInt8908 & 0xff00);
									is[i_1528_] = (i_1530_ | i_1531_ | i_1532_) >>> 8;
								} else if (i == 3) {
									int i_1533_ = (anIntArray11393[aByteArray11392[i_1527_] & 0xff]);
									int i_1534_ = anInt8894;
									int i_1535_ = i_1533_ + i_1534_;
									int i_1536_ = ((i_1533_ & 0xff00ff) + (i_1534_ & 0xff00ff));
									int i_1537_ = ((i_1536_ & 0x1000100) + (i_1535_ - i_1536_ & 0x10000));
									is[i_1528_] = (i_1535_ - i_1537_ | i_1537_ - (i_1537_ >>> 8));
								} else if (i == 2) {
									int i_1538_ = (anIntArray11393[aByteArray11392[i_1527_] & 0xff]);
									int i_1539_ = ((i_1538_ & 0xff00ff) * anInt8904 & ~0xff00ff);
									int i_1540_ = ((i_1538_ & 0xff00) * anInt8904 & 0xff0000);
									is[i_1528_] = (((i_1539_ | i_1540_) >>> 8) + anInt8911);
								} else
									throw new IllegalArgumentException();
							} else if (i_1175_ == 1) {
								if (i == 1) {
									int i_1541_ = aByteArray11392[i_1527_];
									if (i_1541_ != 0)
										is[i_1528_] = anIntArray11393[i_1541_ & 0xff];
								} else if (i == 0) {
									int i_1542_ = aByteArray11392[i_1527_];
									if (i_1542_ != 0) {
										int i_1543_ = anIntArray11393[i_1542_ & 0xff];
										if ((anInt8894 & 0xffffff) == 16777215) {
											int i_1544_ = anInt8894 >>> 24;
											int i_1545_ = 256 - i_1544_;
											int i_1546_ = is[i_1528_];
											is[i_1528_] = (((((i_1543_ & 0xff00ff) * i_1544_) + ((i_1546_ & 0xff00ff) * i_1545_)) & ~0xff00ff) + ((((i_1543_ & 0xff00) * i_1544_) + ((i_1546_ & 0xff00) * i_1545_)) & 0xff0000)) >> 8;
										} else if (anInt8904 != 255) {
											int i_1547_ = (((i_1543_ & 0xff0000) * anInt8906) & ~0xffffff);
											int i_1548_ = (((i_1543_ & 0xff00) * anInt8907) & 0xff0000);
											int i_1549_ = ((i_1543_ & 0xff) * anInt8908 & 0xff00);
											i_1543_ = (i_1547_ | i_1548_ | i_1549_) >>> 8;
											int i_1550_ = is[i_1528_];
											is[i_1528_] = (((((i_1543_ & 0xff00ff) * anInt8904) + ((i_1550_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1543_ & 0xff00) * anInt8904) + ((i_1550_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
										} else {
											int i_1551_ = (((i_1543_ & 0xff0000) * anInt8906) & ~0xffffff);
											int i_1552_ = (((i_1543_ & 0xff00) * anInt8907) & 0xff0000);
											int i_1553_ = ((i_1543_ & 0xff) * anInt8908 & 0xff00);
											is[i_1528_] = (i_1551_ | i_1552_ | i_1553_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_1554_ = aByteArray11392[i_1527_];
									int i_1555_ = (i_1554_ > 0 ? anIntArray11393[i_1554_] : 0);
									int i_1556_ = anInt8894;
									int i_1557_ = i_1555_ + i_1556_;
									int i_1558_ = ((i_1555_ & 0xff00ff) + (i_1556_ & 0xff00ff));
									int i_1559_ = ((i_1558_ & 0x1000100) + (i_1557_ - i_1558_ & 0x10000));
									i_1559_ = (i_1557_ - i_1559_ | i_1559_ - (i_1559_ >>> 8));
									if (i_1555_ == 0 && anInt8904 != 255) {
										i_1555_ = i_1559_;
										i_1559_ = is[i_1528_];
										i_1559_ = (((((i_1555_ & 0xff00ff) * anInt8904) + ((i_1559_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1555_ & 0xff00) * anInt8904) + ((i_1559_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
									}
									is[i_1528_] = i_1559_;
								} else if (i == 2) {
									int i_1560_ = aByteArray11392[i_1527_];
									if (i_1560_ != 0) {
										int i_1561_ = anIntArray11393[i_1560_ & 0xff];
										int i_1562_ = ((i_1561_ & 0xff00ff) * anInt8904 & ~0xff00ff);
										int i_1563_ = ((i_1561_ & 0xff00) * anInt8904 & 0xff0000);
										is[i_1528_++] = ((i_1562_ | i_1563_) >>> 8) + anInt8911;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_1175_ == 2) {
								if (i == 1) {
									int i_1564_ = aByteArray11392[i_1527_];
									if (i_1564_ != 0) {
										int i_1565_ = anIntArray11393[i_1564_ & 0xff];
										int i_1566_ = is[i_1528_];
										int i_1567_ = i_1565_ + i_1566_;
										int i_1568_ = ((i_1565_ & 0xff00ff) + (i_1566_ & 0xff00ff));
										i_1566_ = ((i_1568_ & 0x1000100) + (i_1567_ - i_1568_ & 0x10000));
										is[i_1528_] = (i_1567_ - i_1566_ | i_1566_ - (i_1566_ >>> 8));
									}
								} else if (i == 0) {
									int i_1569_ = aByteArray11392[i_1527_];
									if (i_1569_ != 0) {
										int i_1570_ = anIntArray11393[i_1569_ & 0xff];
										int i_1571_ = ((i_1570_ & 0xff0000) * anInt8906 & ~0xffffff);
										int i_1572_ = ((i_1570_ & 0xff00) * anInt8907 & 0xff0000);
										int i_1573_ = ((i_1570_ & 0xff) * anInt8908 & 0xff00);
										i_1570_ = (i_1571_ | i_1572_ | i_1573_) >>> 8;
										int i_1574_ = is[i_1528_];
										int i_1575_ = i_1570_ + i_1574_;
										int i_1576_ = ((i_1570_ & 0xff00ff) + (i_1574_ & 0xff00ff));
										i_1574_ = ((i_1576_ & 0x1000100) + (i_1575_ - i_1576_ & 0x10000));
										is[i_1528_] = (i_1575_ - i_1574_ | i_1574_ - (i_1574_ >>> 8));
									}
								} else if (i == 3) {
									byte i_1577_ = aByteArray11392[i_1527_];
									int i_1578_ = (i_1577_ > 0 ? anIntArray11393[i_1577_] : 0);
									int i_1579_ = anInt8894;
									int i_1580_ = i_1578_ + i_1579_;
									int i_1581_ = ((i_1578_ & 0xff00ff) + (i_1579_ & 0xff00ff));
									int i_1582_ = ((i_1581_ & 0x1000100) + (i_1580_ - i_1581_ & 0x10000));
									i_1582_ = (i_1580_ - i_1582_ | i_1582_ - (i_1582_ >>> 8));
									if (i_1578_ == 0 && anInt8904 != 255) {
										i_1578_ = i_1582_;
										i_1582_ = is[i_1528_];
										i_1582_ = (((((i_1578_ & 0xff00ff) * anInt8904) + ((i_1582_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1578_ & 0xff00) * anInt8904) + ((i_1582_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
									}
									is[i_1528_] = i_1582_;
								} else if (i == 2) {
									int i_1583_ = aByteArray11392[i_1527_];
									if (i_1583_ != 0) {
										int i_1584_ = anIntArray11393[i_1583_ & 0xff];
										int i_1585_ = ((i_1584_ & 0xff00ff) * anInt8904 & ~0xff00ff);
										int i_1586_ = ((i_1584_ & 0xff00) * anInt8904 & 0xff0000);
										i_1584_ = (((i_1585_ | i_1586_) >>> 8) + anInt8911);
										int i_1587_ = is[i_1528_];
										int i_1588_ = i_1584_ + i_1587_;
										int i_1589_ = ((i_1584_ & 0xff00ff) + (i_1587_ & 0xff00ff));
										i_1587_ = ((i_1589_ & 0x1000100) + (i_1588_ - i_1589_ & 0x10000));
										is[i_1528_] = (i_1588_ - i_1587_ | i_1587_ - (i_1587_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_1523_ += anInt8893;
							i_1524_ += anInt8909;
						}
						i_1521_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8909 == 0) {
				int i_1590_ = anInt8903;
				while (i_1590_ < 0) {
					int i_1591_ = anInt8892;
					int i_1592_ = anInt8899 + anInt8890;
					int i_1593_ = anInt8900;
					int i_1594_ = anInt8888;
					if (i_1593_ >= 0 && i_1593_ - (anInt8880 << 12) < 0) {
						if (i_1592_ < 0) {
							int i_1595_ = (anInt8893 - 1 - i_1592_) / anInt8893;
							i_1594_ += i_1595_;
							i_1592_ += anInt8893 * i_1595_;
							i_1591_ += i_1595_;
						}
						int i_1596_;
						if ((i_1596_ = (1 + i_1592_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_1594_)
							i_1594_ = i_1596_;
						for (/**/; i_1594_ < 0; i_1594_++) {
							int i_1597_ = ((i_1593_ >> 12) * anInt8877 + (i_1592_ >> 12));
							int i_1598_ = i_1591_++;
							if (i_1175_ == 0) {
								if (i == 1)
									is[i_1598_] = (anIntArray11393[aByteArray11392[i_1597_] & 0xff]);
								else if (i == 0) {
									int i_1599_ = (anIntArray11393[aByteArray11392[i_1597_] & 0xff]);
									int i_1600_ = ((i_1599_ & 0xff0000) * anInt8906 & ~0xffffff);
									int i_1601_ = ((i_1599_ & 0xff00) * anInt8907 & 0xff0000);
									int i_1602_ = ((i_1599_ & 0xff) * anInt8908 & 0xff00);
									is[i_1598_] = (i_1600_ | i_1601_ | i_1602_) >>> 8;
								} else if (i == 3) {
									int i_1603_ = (anIntArray11393[aByteArray11392[i_1597_] & 0xff]);
									int i_1604_ = anInt8894;
									int i_1605_ = i_1603_ + i_1604_;
									int i_1606_ = ((i_1603_ & 0xff00ff) + (i_1604_ & 0xff00ff));
									int i_1607_ = ((i_1606_ & 0x1000100) + (i_1605_ - i_1606_ & 0x10000));
									is[i_1598_] = (i_1605_ - i_1607_ | i_1607_ - (i_1607_ >>> 8));
								} else if (i == 2) {
									int i_1608_ = (anIntArray11393[aByteArray11392[i_1597_] & 0xff]);
									int i_1609_ = ((i_1608_ & 0xff00ff) * anInt8904 & ~0xff00ff);
									int i_1610_ = ((i_1608_ & 0xff00) * anInt8904 & 0xff0000);
									is[i_1598_] = (((i_1609_ | i_1610_) >>> 8) + anInt8911);
								} else
									throw new IllegalArgumentException();
							} else if (i_1175_ == 1) {
								if (i == 1) {
									int i_1611_ = aByteArray11392[i_1597_];
									if (i_1611_ != 0)
										is[i_1598_] = anIntArray11393[i_1611_ & 0xff];
								} else if (i == 0) {
									int i_1612_ = aByteArray11392[i_1597_];
									if (i_1612_ != 0) {
										int i_1613_ = anIntArray11393[i_1612_ & 0xff];
										if ((anInt8894 & 0xffffff) == 16777215) {
											int i_1614_ = anInt8894 >>> 24;
											int i_1615_ = 256 - i_1614_;
											int i_1616_ = is[i_1598_];
											is[i_1598_] = (((((i_1613_ & 0xff00ff) * i_1614_) + ((i_1616_ & 0xff00ff) * i_1615_)) & ~0xff00ff) + ((((i_1613_ & 0xff00) * i_1614_) + ((i_1616_ & 0xff00) * i_1615_)) & 0xff0000)) >> 8;
										} else if (anInt8904 != 255) {
											int i_1617_ = (((i_1613_ & 0xff0000) * anInt8906) & ~0xffffff);
											int i_1618_ = (((i_1613_ & 0xff00) * anInt8907) & 0xff0000);
											int i_1619_ = ((i_1613_ & 0xff) * anInt8908 & 0xff00);
											i_1613_ = (i_1617_ | i_1618_ | i_1619_) >>> 8;
											int i_1620_ = is[i_1598_];
											is[i_1598_] = (((((i_1613_ & 0xff00ff) * anInt8904) + ((i_1620_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1613_ & 0xff00) * anInt8904) + ((i_1620_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
										} else {
											int i_1621_ = (((i_1613_ & 0xff0000) * anInt8906) & ~0xffffff);
											int i_1622_ = (((i_1613_ & 0xff00) * anInt8907) & 0xff0000);
											int i_1623_ = ((i_1613_ & 0xff) * anInt8908 & 0xff00);
											is[i_1598_] = (i_1621_ | i_1622_ | i_1623_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_1624_ = aByteArray11392[i_1597_];
									int i_1625_ = (i_1624_ > 0 ? anIntArray11393[i_1624_] : 0);
									int i_1626_ = anInt8894;
									int i_1627_ = i_1625_ + i_1626_;
									int i_1628_ = ((i_1625_ & 0xff00ff) + (i_1626_ & 0xff00ff));
									int i_1629_ = ((i_1628_ & 0x1000100) + (i_1627_ - i_1628_ & 0x10000));
									i_1629_ = (i_1627_ - i_1629_ | i_1629_ - (i_1629_ >>> 8));
									if (i_1625_ == 0 && anInt8904 != 255) {
										i_1625_ = i_1629_;
										i_1629_ = is[i_1598_];
										i_1629_ = (((((i_1625_ & 0xff00ff) * anInt8904) + ((i_1629_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1625_ & 0xff00) * anInt8904) + ((i_1629_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
									}
									is[i_1598_] = i_1629_;
								} else if (i == 2) {
									int i_1630_ = aByteArray11392[i_1597_];
									if (i_1630_ != 0) {
										int i_1631_ = anIntArray11393[i_1630_ & 0xff];
										int i_1632_ = ((i_1631_ & 0xff00ff) * anInt8904 & ~0xff00ff);
										int i_1633_ = ((i_1631_ & 0xff00) * anInt8904 & 0xff0000);
										is[i_1598_++] = ((i_1632_ | i_1633_) >>> 8) + anInt8911;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_1175_ == 2) {
								if (i == 1) {
									int i_1634_ = aByteArray11392[i_1597_];
									if (i_1634_ != 0) {
										int i_1635_ = anIntArray11393[i_1634_ & 0xff];
										int i_1636_ = is[i_1598_];
										int i_1637_ = i_1635_ + i_1636_;
										int i_1638_ = ((i_1635_ & 0xff00ff) + (i_1636_ & 0xff00ff));
										i_1636_ = ((i_1638_ & 0x1000100) + (i_1637_ - i_1638_ & 0x10000));
										is[i_1598_] = (i_1637_ - i_1636_ | i_1636_ - (i_1636_ >>> 8));
									}
								} else if (i == 0) {
									int i_1639_ = aByteArray11392[i_1597_];
									if (i_1639_ != 0) {
										int i_1640_ = anIntArray11393[i_1639_ & 0xff];
										int i_1641_ = ((i_1640_ & 0xff0000) * anInt8906 & ~0xffffff);
										int i_1642_ = ((i_1640_ & 0xff00) * anInt8907 & 0xff0000);
										int i_1643_ = ((i_1640_ & 0xff) * anInt8908 & 0xff00);
										i_1640_ = (i_1641_ | i_1642_ | i_1643_) >>> 8;
										int i_1644_ = is[i_1598_];
										int i_1645_ = i_1640_ + i_1644_;
										int i_1646_ = ((i_1640_ & 0xff00ff) + (i_1644_ & 0xff00ff));
										i_1644_ = ((i_1646_ & 0x1000100) + (i_1645_ - i_1646_ & 0x10000));
										is[i_1598_] = (i_1645_ - i_1644_ | i_1644_ - (i_1644_ >>> 8));
									}
								} else if (i == 3) {
									byte i_1647_ = aByteArray11392[i_1597_];
									int i_1648_ = (i_1647_ > 0 ? anIntArray11393[i_1647_] : 0);
									int i_1649_ = anInt8894;
									int i_1650_ = i_1648_ + i_1649_;
									int i_1651_ = ((i_1648_ & 0xff00ff) + (i_1649_ & 0xff00ff));
									int i_1652_ = ((i_1651_ & 0x1000100) + (i_1650_ - i_1651_ & 0x10000));
									i_1652_ = (i_1650_ - i_1652_ | i_1652_ - (i_1652_ >>> 8));
									if (i_1648_ == 0 && anInt8904 != 255) {
										i_1648_ = i_1652_;
										i_1652_ = is[i_1598_];
										i_1652_ = (((((i_1648_ & 0xff00ff) * anInt8904) + ((i_1652_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1648_ & 0xff00) * anInt8904) + ((i_1652_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
									}
									is[i_1598_] = i_1652_;
								} else if (i == 2) {
									int i_1653_ = aByteArray11392[i_1597_];
									if (i_1653_ != 0) {
										int i_1654_ = anIntArray11393[i_1653_ & 0xff];
										int i_1655_ = ((i_1654_ & 0xff00ff) * anInt8904 & ~0xff00ff);
										int i_1656_ = ((i_1654_ & 0xff00) * anInt8904 & 0xff0000);
										i_1654_ = (((i_1655_ | i_1656_) >>> 8) + anInt8911);
										int i_1657_ = is[i_1598_];
										int i_1658_ = i_1654_ + i_1657_;
										int i_1659_ = ((i_1654_ & 0xff00ff) + (i_1657_ & 0xff00ff));
										i_1657_ = ((i_1659_ & 0x1000100) + (i_1658_ - i_1659_ & 0x10000));
										is[i_1598_] = (i_1658_ - i_1657_ | i_1657_ - (i_1657_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_1592_ += anInt8893;
						}
					}
					i_1590_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else if (anInt8909 < 0) {
				for (int i_1660_ = anInt8903; i_1660_ < 0; i_1660_++) {
					int i_1661_ = anInt8892;
					int i_1662_ = anInt8899 + anInt8890;
					int i_1663_ = anInt8900 + anInt8902;
					int i_1664_ = anInt8888;
					if (i_1662_ < 0) {
						int i_1665_ = (anInt8893 - 1 - i_1662_) / anInt8893;
						i_1664_ += i_1665_;
						i_1662_ += anInt8893 * i_1665_;
						i_1663_ += anInt8909 * i_1665_;
						i_1661_ += i_1665_;
					}
					int i_1666_;
					if ((i_1666_ = (1 + i_1662_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_1664_)
						i_1664_ = i_1666_;
					if ((i_1666_ = i_1663_ - (anInt8880 << 12)) >= 0) {
						i_1666_ = (anInt8909 - i_1666_) / anInt8909;
						i_1664_ += i_1666_;
						i_1662_ += anInt8893 * i_1666_;
						i_1663_ += anInt8909 * i_1666_;
						i_1661_ += i_1666_;
					}
					if ((i_1666_ = (i_1663_ - anInt8909) / anInt8909) > i_1664_)
						i_1664_ = i_1666_;
					for (/**/; i_1664_ < 0; i_1664_++) {
						int i_1667_ = (i_1663_ >> 12) * anInt8877 + (i_1662_ >> 12);
						int i_1668_ = i_1661_++;
						if (i_1175_ == 0) {
							if (i == 1)
								is[i_1668_] = (anIntArray11393[aByteArray11392[i_1667_] & 0xff]);
							else if (i == 0) {
								int i_1669_ = (anIntArray11393[aByteArray11392[i_1667_] & 0xff]);
								int i_1670_ = ((i_1669_ & 0xff0000) * anInt8906 & ~0xffffff);
								int i_1671_ = ((i_1669_ & 0xff00) * anInt8907 & 0xff0000);
								int i_1672_ = (i_1669_ & 0xff) * anInt8908 & 0xff00;
								is[i_1668_] = (i_1670_ | i_1671_ | i_1672_) >>> 8;
							} else if (i == 3) {
								int i_1673_ = (anIntArray11393[aByteArray11392[i_1667_] & 0xff]);
								int i_1674_ = anInt8894;
								int i_1675_ = i_1673_ + i_1674_;
								int i_1676_ = ((i_1673_ & 0xff00ff) + (i_1674_ & 0xff00ff));
								int i_1677_ = ((i_1676_ & 0x1000100) + (i_1675_ - i_1676_ & 0x10000));
								is[i_1668_] = i_1675_ - i_1677_ | i_1677_ - (i_1677_ >>> 8);
							} else if (i == 2) {
								int i_1678_ = (anIntArray11393[aByteArray11392[i_1667_] & 0xff]);
								int i_1679_ = ((i_1678_ & 0xff00ff) * anInt8904 & ~0xff00ff);
								int i_1680_ = ((i_1678_ & 0xff00) * anInt8904 & 0xff0000);
								is[i_1668_] = ((i_1679_ | i_1680_) >>> 8) + anInt8911;
							} else
								throw new IllegalArgumentException();
						} else if (i_1175_ == 1) {
							if (i == 1) {
								int i_1681_ = aByteArray11392[i_1667_];
								if (i_1681_ != 0)
									is[i_1668_] = anIntArray11393[i_1681_ & 0xff];
							} else if (i == 0) {
								int i_1682_ = aByteArray11392[i_1667_];
								if (i_1682_ != 0) {
									int i_1683_ = anIntArray11393[i_1682_ & 0xff];
									if ((anInt8894 & 0xffffff) == 16777215) {
										int i_1684_ = anInt8894 >>> 24;
										int i_1685_ = 256 - i_1684_;
										int i_1686_ = is[i_1668_];
										is[i_1668_] = ((((i_1683_ & 0xff00ff) * i_1684_ + ((i_1686_ & 0xff00ff) * i_1685_)) & ~0xff00ff) + (((i_1683_ & 0xff00) * i_1684_ + ((i_1686_ & 0xff00) * i_1685_)) & 0xff0000)) >> 8;
									} else if (anInt8904 != 255) {
										int i_1687_ = ((i_1683_ & 0xff0000) * anInt8906 & ~0xffffff);
										int i_1688_ = ((i_1683_ & 0xff00) * anInt8907 & 0xff0000);
										int i_1689_ = ((i_1683_ & 0xff) * anInt8908 & 0xff00);
										i_1683_ = (i_1687_ | i_1688_ | i_1689_) >>> 8;
										int i_1690_ = is[i_1668_];
										is[i_1668_] = (((((i_1683_ & 0xff00ff) * anInt8904) + ((i_1690_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1683_ & 0xff00) * anInt8904) + ((i_1690_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
									} else {
										int i_1691_ = ((i_1683_ & 0xff0000) * anInt8906 & ~0xffffff);
										int i_1692_ = ((i_1683_ & 0xff00) * anInt8907 & 0xff0000);
										int i_1693_ = ((i_1683_ & 0xff) * anInt8908 & 0xff00);
										is[i_1668_] = (i_1691_ | i_1692_ | i_1693_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_1694_ = aByteArray11392[i_1667_];
								int i_1695_ = (i_1694_ > 0 ? anIntArray11393[i_1694_] : 0);
								int i_1696_ = anInt8894;
								int i_1697_ = i_1695_ + i_1696_;
								int i_1698_ = ((i_1695_ & 0xff00ff) + (i_1696_ & 0xff00ff));
								int i_1699_ = ((i_1698_ & 0x1000100) + (i_1697_ - i_1698_ & 0x10000));
								i_1699_ = i_1697_ - i_1699_ | i_1699_ - (i_1699_ >>> 8);
								if (i_1695_ == 0 && anInt8904 != 255) {
									i_1695_ = i_1699_;
									i_1699_ = is[i_1668_];
									i_1699_ = ((((i_1695_ & 0xff00ff) * anInt8904 + ((i_1699_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + (((i_1695_ & 0xff00) * anInt8904 + ((i_1699_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
								}
								is[i_1668_] = i_1699_;
							} else if (i == 2) {
								int i_1700_ = aByteArray11392[i_1667_];
								if (i_1700_ != 0) {
									int i_1701_ = anIntArray11393[i_1700_ & 0xff];
									int i_1702_ = ((i_1701_ & 0xff00ff) * anInt8904 & ~0xff00ff);
									int i_1703_ = ((i_1701_ & 0xff00) * anInt8904 & 0xff0000);
									is[i_1668_++] = ((i_1702_ | i_1703_) >>> 8) + anInt8911;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_1175_ == 2) {
							if (i == 1) {
								int i_1704_ = aByteArray11392[i_1667_];
								if (i_1704_ != 0) {
									int i_1705_ = anIntArray11393[i_1704_ & 0xff];
									int i_1706_ = is[i_1668_];
									int i_1707_ = i_1705_ + i_1706_;
									int i_1708_ = ((i_1705_ & 0xff00ff) + (i_1706_ & 0xff00ff));
									i_1706_ = ((i_1708_ & 0x1000100) + (i_1707_ - i_1708_ & 0x10000));
									is[i_1668_] = (i_1707_ - i_1706_ | i_1706_ - (i_1706_ >>> 8));
								}
							} else if (i == 0) {
								int i_1709_ = aByteArray11392[i_1667_];
								if (i_1709_ != 0) {
									int i_1710_ = anIntArray11393[i_1709_ & 0xff];
									int i_1711_ = ((i_1710_ & 0xff0000) * anInt8906 & ~0xffffff);
									int i_1712_ = ((i_1710_ & 0xff00) * anInt8907 & 0xff0000);
									int i_1713_ = ((i_1710_ & 0xff) * anInt8908 & 0xff00);
									i_1710_ = (i_1711_ | i_1712_ | i_1713_) >>> 8;
									int i_1714_ = is[i_1668_];
									int i_1715_ = i_1710_ + i_1714_;
									int i_1716_ = ((i_1710_ & 0xff00ff) + (i_1714_ & 0xff00ff));
									i_1714_ = ((i_1716_ & 0x1000100) + (i_1715_ - i_1716_ & 0x10000));
									is[i_1668_] = (i_1715_ - i_1714_ | i_1714_ - (i_1714_ >>> 8));
								}
							} else if (i == 3) {
								byte i_1717_ = aByteArray11392[i_1667_];
								int i_1718_ = (i_1717_ > 0 ? anIntArray11393[i_1717_] : 0);
								int i_1719_ = anInt8894;
								int i_1720_ = i_1718_ + i_1719_;
								int i_1721_ = ((i_1718_ & 0xff00ff) + (i_1719_ & 0xff00ff));
								int i_1722_ = ((i_1721_ & 0x1000100) + (i_1720_ - i_1721_ & 0x10000));
								i_1722_ = i_1720_ - i_1722_ | i_1722_ - (i_1722_ >>> 8);
								if (i_1718_ == 0 && anInt8904 != 255) {
									i_1718_ = i_1722_;
									i_1722_ = is[i_1668_];
									i_1722_ = ((((i_1718_ & 0xff00ff) * anInt8904 + ((i_1722_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + (((i_1718_ & 0xff00) * anInt8904 + ((i_1722_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
								}
								is[i_1668_] = i_1722_;
							} else if (i == 2) {
								int i_1723_ = aByteArray11392[i_1667_];
								if (i_1723_ != 0) {
									int i_1724_ = anIntArray11393[i_1723_ & 0xff];
									int i_1725_ = ((i_1724_ & 0xff00ff) * anInt8904 & ~0xff00ff);
									int i_1726_ = ((i_1724_ & 0xff00) * anInt8904 & 0xff0000);
									i_1724_ = (((i_1725_ | i_1726_) >>> 8) + anInt8911);
									int i_1727_ = is[i_1668_];
									int i_1728_ = i_1724_ + i_1727_;
									int i_1729_ = ((i_1724_ & 0xff00ff) + (i_1727_ & 0xff00ff));
									i_1727_ = ((i_1729_ & 0x1000100) + (i_1728_ - i_1729_ & 0x10000));
									is[i_1668_] = (i_1728_ - i_1727_ | i_1727_ - (i_1727_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_1662_ += anInt8893;
						i_1663_ += anInt8909;
					}
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else {
				for (int i_1730_ = anInt8903; i_1730_ < 0; i_1730_++) {
					int i_1731_ = anInt8892;
					int i_1732_ = anInt8899 + anInt8890;
					int i_1733_ = anInt8900 + anInt8902;
					int i_1734_ = anInt8888;
					if (i_1732_ < 0) {
						int i_1735_ = (anInt8893 - 1 - i_1732_) / anInt8893;
						i_1734_ += i_1735_;
						i_1732_ += anInt8893 * i_1735_;
						i_1733_ += anInt8909 * i_1735_;
						i_1731_ += i_1735_;
					}
					int i_1736_;
					if ((i_1736_ = (1 + i_1732_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_1734_)
						i_1734_ = i_1736_;
					if (i_1733_ < 0) {
						i_1736_ = (anInt8909 - 1 - i_1733_) / anInt8909;
						i_1734_ += i_1736_;
						i_1732_ += anInt8893 * i_1736_;
						i_1733_ += anInt8909 * i_1736_;
						i_1731_ += i_1736_;
					}
					if ((i_1736_ = (1 + i_1733_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_1734_)
						i_1734_ = i_1736_;
					for (/**/; i_1734_ < 0; i_1734_++) {
						int i_1737_ = (i_1733_ >> 12) * anInt8877 + (i_1732_ >> 12);
						int i_1738_ = i_1731_++;
						if (i_1175_ == 0) {
							if (i == 1)
								is[i_1738_] = (anIntArray11393[aByteArray11392[i_1737_] & 0xff]);
							else if (i == 0) {
								int i_1739_ = (anIntArray11393[aByteArray11392[i_1737_] & 0xff]);
								int i_1740_ = ((i_1739_ & 0xff0000) * anInt8906 & ~0xffffff);
								int i_1741_ = ((i_1739_ & 0xff00) * anInt8907 & 0xff0000);
								int i_1742_ = (i_1739_ & 0xff) * anInt8908 & 0xff00;
								is[i_1738_] = (i_1740_ | i_1741_ | i_1742_) >>> 8;
							} else if (i == 3) {
								int i_1743_ = (anIntArray11393[aByteArray11392[i_1737_] & 0xff]);
								int i_1744_ = anInt8894;
								int i_1745_ = i_1743_ + i_1744_;
								int i_1746_ = ((i_1743_ & 0xff00ff) + (i_1744_ & 0xff00ff));
								int i_1747_ = ((i_1746_ & 0x1000100) + (i_1745_ - i_1746_ & 0x10000));
								is[i_1738_] = i_1745_ - i_1747_ | i_1747_ - (i_1747_ >>> 8);
							} else if (i == 2) {
								int i_1748_ = (anIntArray11393[aByteArray11392[i_1737_] & 0xff]);
								int i_1749_ = ((i_1748_ & 0xff00ff) * anInt8904 & ~0xff00ff);
								int i_1750_ = ((i_1748_ & 0xff00) * anInt8904 & 0xff0000);
								is[i_1738_] = ((i_1749_ | i_1750_) >>> 8) + anInt8911;
							} else
								throw new IllegalArgumentException();
						} else if (i_1175_ == 1) {
							if (i == 1) {
								int i_1751_ = aByteArray11392[i_1737_];
								if (i_1751_ != 0)
									is[i_1738_] = anIntArray11393[i_1751_ & 0xff];
							} else if (i == 0) {
								int i_1752_ = aByteArray11392[i_1737_];
								if (i_1752_ != 0) {
									int i_1753_ = anIntArray11393[i_1752_ & 0xff];
									if ((anInt8894 & 0xffffff) == 16777215) {
										int i_1754_ = anInt8894 >>> 24;
										int i_1755_ = 256 - i_1754_;
										int i_1756_ = is[i_1738_];
										is[i_1738_] = ((((i_1753_ & 0xff00ff) * i_1754_ + ((i_1756_ & 0xff00ff) * i_1755_)) & ~0xff00ff) + (((i_1753_ & 0xff00) * i_1754_ + ((i_1756_ & 0xff00) * i_1755_)) & 0xff0000)) >> 8;
									} else if (anInt8904 != 255) {
										int i_1757_ = ((i_1753_ & 0xff0000) * anInt8906 & ~0xffffff);
										int i_1758_ = ((i_1753_ & 0xff00) * anInt8907 & 0xff0000);
										int i_1759_ = ((i_1753_ & 0xff) * anInt8908 & 0xff00);
										i_1753_ = (i_1757_ | i_1758_ | i_1759_) >>> 8;
										int i_1760_ = is[i_1738_];
										is[i_1738_] = (((((i_1753_ & 0xff00ff) * anInt8904) + ((i_1760_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1753_ & 0xff00) * anInt8904) + ((i_1760_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
									} else {
										int i_1761_ = ((i_1753_ & 0xff0000) * anInt8906 & ~0xffffff);
										int i_1762_ = ((i_1753_ & 0xff00) * anInt8907 & 0xff0000);
										int i_1763_ = ((i_1753_ & 0xff) * anInt8908 & 0xff00);
										is[i_1738_] = (i_1761_ | i_1762_ | i_1763_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_1764_ = aByteArray11392[i_1737_];
								int i_1765_ = (i_1764_ > 0 ? anIntArray11393[i_1764_] : 0);
								int i_1766_ = anInt8894;
								int i_1767_ = i_1765_ + i_1766_;
								int i_1768_ = ((i_1765_ & 0xff00ff) + (i_1766_ & 0xff00ff));
								int i_1769_ = ((i_1768_ & 0x1000100) + (i_1767_ - i_1768_ & 0x10000));
								i_1769_ = i_1767_ - i_1769_ | i_1769_ - (i_1769_ >>> 8);
								if (i_1765_ == 0 && anInt8904 != 255) {
									i_1765_ = i_1769_;
									i_1769_ = is[i_1738_];
									i_1769_ = ((((i_1765_ & 0xff00ff) * anInt8904 + ((i_1769_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + (((i_1765_ & 0xff00) * anInt8904 + ((i_1769_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
								}
								is[i_1738_] = i_1769_;
							} else if (i == 2) {
								int i_1770_ = aByteArray11392[i_1737_];
								if (i_1770_ != 0) {
									int i_1771_ = anIntArray11393[i_1770_ & 0xff];
									int i_1772_ = ((i_1771_ & 0xff00ff) * anInt8904 & ~0xff00ff);
									int i_1773_ = ((i_1771_ & 0xff00) * anInt8904 & 0xff0000);
									is[i_1738_++] = ((i_1772_ | i_1773_) >>> 8) + anInt8911;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_1175_ == 2) {
							if (i == 1) {
								int i_1774_ = aByteArray11392[i_1737_];
								if (i_1774_ != 0) {
									int i_1775_ = anIntArray11393[i_1774_ & 0xff];
									int i_1776_ = is[i_1738_];
									int i_1777_ = i_1775_ + i_1776_;
									int i_1778_ = ((i_1775_ & 0xff00ff) + (i_1776_ & 0xff00ff));
									i_1776_ = ((i_1778_ & 0x1000100) + (i_1777_ - i_1778_ & 0x10000));
									is[i_1738_] = (i_1777_ - i_1776_ | i_1776_ - (i_1776_ >>> 8));
								}
							} else if (i == 0) {
								int i_1779_ = aByteArray11392[i_1737_];
								if (i_1779_ != 0) {
									int i_1780_ = anIntArray11393[i_1779_ & 0xff];
									int i_1781_ = ((i_1780_ & 0xff0000) * anInt8906 & ~0xffffff);
									int i_1782_ = ((i_1780_ & 0xff00) * anInt8907 & 0xff0000);
									int i_1783_ = ((i_1780_ & 0xff) * anInt8908 & 0xff00);
									i_1780_ = (i_1781_ | i_1782_ | i_1783_) >>> 8;
									int i_1784_ = is[i_1738_];
									int i_1785_ = i_1780_ + i_1784_;
									int i_1786_ = ((i_1780_ & 0xff00ff) + (i_1784_ & 0xff00ff));
									i_1784_ = ((i_1786_ & 0x1000100) + (i_1785_ - i_1786_ & 0x10000));
									is[i_1738_] = (i_1785_ - i_1784_ | i_1784_ - (i_1784_ >>> 8));
								}
							} else if (i == 3) {
								byte i_1787_ = aByteArray11392[i_1737_];
								int i_1788_ = (i_1787_ > 0 ? anIntArray11393[i_1787_] : 0);
								int i_1789_ = anInt8894;
								int i_1790_ = i_1788_ + i_1789_;
								int i_1791_ = ((i_1788_ & 0xff00ff) + (i_1789_ & 0xff00ff));
								int i_1792_ = ((i_1791_ & 0x1000100) + (i_1790_ - i_1791_ & 0x10000));
								i_1792_ = i_1790_ - i_1792_ | i_1792_ - (i_1792_ >>> 8);
								if (i_1788_ == 0 && anInt8904 != 255) {
									i_1788_ = i_1792_;
									i_1792_ = is[i_1738_];
									i_1792_ = ((((i_1788_ & 0xff00ff) * anInt8904 + ((i_1792_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + (((i_1788_ & 0xff00) * anInt8904 + ((i_1792_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
								}
								is[i_1738_] = i_1792_;
							} else if (i == 2) {
								int i_1793_ = aByteArray11392[i_1737_];
								if (i_1793_ != 0) {
									int i_1794_ = anIntArray11393[i_1793_ & 0xff];
									int i_1795_ = ((i_1794_ & 0xff00ff) * anInt8904 & ~0xff00ff);
									int i_1796_ = ((i_1794_ & 0xff00) * anInt8904 & 0xff0000);
									i_1794_ = (((i_1795_ | i_1796_) >>> 8) + anInt8911);
									int i_1797_ = is[i_1738_];
									int i_1798_ = i_1794_ + i_1797_;
									int i_1799_ = ((i_1794_ & 0xff00ff) + (i_1797_ & 0xff00ff));
									i_1797_ = ((i_1799_ & 0x1000100) + (i_1798_ - i_1799_ & 0x10000));
									is[i_1738_] = (i_1798_ - i_1797_ | i_1797_ - (i_1797_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_1732_ += anInt8893;
						i_1733_ += anInt8909;
					}
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			}
		}
	}

	public void method2433(int i, int i_1800_, int i_1801_, int i_1802_, int[] is, int i_1803_, int i_1804_) {
		throw new IllegalStateException();
	}

	void method14428(int i, int i_1805_) {
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is != null) {
			if (anInt8893 == 0) {
				if (anInt8909 == 0) {
					int i_1806_ = anInt8903;
					while (i_1806_ < 0) {
						int i_1807_ = anInt8892;
						int i_1808_ = anInt8899;
						int i_1809_ = anInt8900;
						int i_1810_ = anInt8888;
						if (i_1808_ >= 0 && i_1809_ >= 0 && i_1808_ - (anInt8877 << 12) < 0 && i_1809_ - (anInt8880 << 12) < 0) {
							for (/**/; i_1810_ < 0; i_1810_++) {
								int i_1811_ = ((i_1809_ >> 12) * anInt8877 + (i_1808_ >> 12));
								int i_1812_ = i_1807_++;
								if (i_1805_ == 0) {
									if (i == 1)
										is[i_1812_] = (anIntArray11393[(aByteArray11392[i_1811_] & 0xff)]);
									else if (i == 0) {
										int i_1813_ = (anIntArray11393[(aByteArray11392[i_1811_] & 0xff)]);
										int i_1814_ = ((i_1813_ & 0xff0000) * anInt8906 & ~0xffffff);
										int i_1815_ = ((i_1813_ & 0xff00) * anInt8907 & 0xff0000);
										int i_1816_ = ((i_1813_ & 0xff) * anInt8908 & 0xff00);
										is[i_1812_] = (i_1814_ | i_1815_ | i_1816_) >>> 8;
									} else if (i == 3) {
										int i_1817_ = (anIntArray11393[(aByteArray11392[i_1811_] & 0xff)]);
										int i_1818_ = anInt8894;
										int i_1819_ = i_1817_ + i_1818_;
										int i_1820_ = ((i_1817_ & 0xff00ff) + (i_1818_ & 0xff00ff));
										int i_1821_ = ((i_1820_ & 0x1000100) + (i_1819_ - i_1820_ & 0x10000));
										is[i_1812_] = (i_1819_ - i_1821_ | i_1821_ - (i_1821_ >>> 8));
									} else if (i == 2) {
										int i_1822_ = (anIntArray11393[(aByteArray11392[i_1811_] & 0xff)]);
										int i_1823_ = ((i_1822_ & 0xff00ff) * anInt8904 & ~0xff00ff);
										int i_1824_ = ((i_1822_ & 0xff00) * anInt8904 & 0xff0000);
										is[i_1812_] = ((i_1823_ | i_1824_) >>> 8) + anInt8911;
									} else
										throw new IllegalArgumentException();
								} else if (i_1805_ == 1) {
									if (i == 1) {
										int i_1825_ = aByteArray11392[i_1811_];
										if (i_1825_ != 0)
											is[i_1812_] = (anIntArray11393[i_1825_ & 0xff]);
									} else if (i == 0) {
										int i_1826_ = aByteArray11392[i_1811_];
										if (i_1826_ != 0) {
											int i_1827_ = (anIntArray11393[i_1826_ & 0xff]);
											if ((anInt8894 & 0xffffff) == 16777215) {
												int i_1828_ = anInt8894 >>> 24;
												int i_1829_ = 256 - i_1828_;
												int i_1830_ = is[i_1812_];
												is[i_1812_] = (((((i_1827_ & 0xff00ff) * i_1828_) + ((i_1830_ & 0xff00ff) * i_1829_)) & ~0xff00ff) + ((((i_1827_ & 0xff00) * i_1828_) + ((i_1830_ & 0xff00) * i_1829_)) & 0xff0000)) >> 8;
											} else if (anInt8904 != 255) {
												int i_1831_ = (((i_1827_ & 0xff0000) * anInt8906) & ~0xffffff);
												int i_1832_ = (((i_1827_ & 0xff00) * anInt8907) & 0xff0000);
												int i_1833_ = (((i_1827_ & 0xff) * anInt8908) & 0xff00);
												i_1827_ = (i_1831_ | i_1832_ | i_1833_) >>> 8;
												int i_1834_ = is[i_1812_];
												is[i_1812_] = (((((i_1827_ & 0xff00ff) * anInt8904) + ((i_1834_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1827_ & 0xff00) * anInt8904) + ((i_1834_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
											} else {
												int i_1835_ = (((i_1827_ & 0xff0000) * anInt8906) & ~0xffffff);
												int i_1836_ = (((i_1827_ & 0xff00) * anInt8907) & 0xff0000);
												int i_1837_ = (((i_1827_ & 0xff) * anInt8908) & 0xff00);
												is[i_1812_] = (i_1835_ | i_1836_ | i_1837_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_1838_ = aByteArray11392[i_1811_];
										int i_1839_ = (i_1838_ > 0 ? anIntArray11393[i_1838_] : 0);
										int i_1840_ = anInt8894;
										int i_1841_ = i_1839_ + i_1840_;
										int i_1842_ = ((i_1839_ & 0xff00ff) + (i_1840_ & 0xff00ff));
										int i_1843_ = ((i_1842_ & 0x1000100) + (i_1841_ - i_1842_ & 0x10000));
										i_1843_ = (i_1841_ - i_1843_ | i_1843_ - (i_1843_ >>> 8));
										if (i_1839_ == 0 && anInt8904 != 255) {
											i_1839_ = i_1843_;
											i_1843_ = is[i_1812_];
											i_1843_ = (((((i_1839_ & 0xff00ff) * anInt8904) + ((i_1843_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1839_ & 0xff00) * anInt8904) + ((i_1843_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
										}
										is[i_1812_] = i_1843_;
									} else if (i == 2) {
										int i_1844_ = aByteArray11392[i_1811_];
										if (i_1844_ != 0) {
											int i_1845_ = (anIntArray11393[i_1844_ & 0xff]);
											int i_1846_ = (((i_1845_ & 0xff00ff) * anInt8904) & ~0xff00ff);
											int i_1847_ = (((i_1845_ & 0xff00) * anInt8904) & 0xff0000);
											is[i_1812_++] = (((i_1846_ | i_1847_) >>> 8) + anInt8911);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1805_ == 2) {
									if (i == 1) {
										int i_1848_ = aByteArray11392[i_1811_];
										if (i_1848_ != 0) {
											int i_1849_ = (anIntArray11393[i_1848_ & 0xff]);
											int i_1850_ = is[i_1812_];
											int i_1851_ = i_1849_ + i_1850_;
											int i_1852_ = ((i_1849_ & 0xff00ff) + (i_1850_ & 0xff00ff));
											i_1850_ = ((i_1852_ & 0x1000100) + (i_1851_ - i_1852_ & 0x10000));
											is[i_1812_] = (i_1851_ - i_1850_ | i_1850_ - (i_1850_ >>> 8));
										}
									} else if (i == 0) {
										int i_1853_ = aByteArray11392[i_1811_];
										if (i_1853_ != 0) {
											int i_1854_ = (anIntArray11393[i_1853_ & 0xff]);
											int i_1855_ = (((i_1854_ & 0xff0000) * anInt8906) & ~0xffffff);
											int i_1856_ = (((i_1854_ & 0xff00) * anInt8907) & 0xff0000);
											int i_1857_ = ((i_1854_ & 0xff) * anInt8908 & 0xff00);
											i_1854_ = (i_1855_ | i_1856_ | i_1857_) >>> 8;
											int i_1858_ = is[i_1812_];
											int i_1859_ = i_1854_ + i_1858_;
											int i_1860_ = ((i_1854_ & 0xff00ff) + (i_1858_ & 0xff00ff));
											i_1858_ = ((i_1860_ & 0x1000100) + (i_1859_ - i_1860_ & 0x10000));
											is[i_1812_] = (i_1859_ - i_1858_ | i_1858_ - (i_1858_ >>> 8));
										}
									} else if (i == 3) {
										byte i_1861_ = aByteArray11392[i_1811_];
										int i_1862_ = (i_1861_ > 0 ? anIntArray11393[i_1861_] : 0);
										int i_1863_ = anInt8894;
										int i_1864_ = i_1862_ + i_1863_;
										int i_1865_ = ((i_1862_ & 0xff00ff) + (i_1863_ & 0xff00ff));
										int i_1866_ = ((i_1865_ & 0x1000100) + (i_1864_ - i_1865_ & 0x10000));
										i_1866_ = (i_1864_ - i_1866_ | i_1866_ - (i_1866_ >>> 8));
										if (i_1862_ == 0 && anInt8904 != 255) {
											i_1862_ = i_1866_;
											i_1866_ = is[i_1812_];
											i_1866_ = (((((i_1862_ & 0xff00ff) * anInt8904) + ((i_1866_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1862_ & 0xff00) * anInt8904) + ((i_1866_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
										}
										is[i_1812_] = i_1866_;
									} else if (i == 2) {
										int i_1867_ = aByteArray11392[i_1811_];
										if (i_1867_ != 0) {
											int i_1868_ = (anIntArray11393[i_1867_ & 0xff]);
											int i_1869_ = (((i_1868_ & 0xff00ff) * anInt8904) & ~0xff00ff);
											int i_1870_ = (((i_1868_ & 0xff00) * anInt8904) & 0xff0000);
											i_1868_ = ((i_1869_ | i_1870_) >>> 8) + anInt8911;
											int i_1871_ = is[i_1812_];
											int i_1872_ = i_1868_ + i_1871_;
											int i_1873_ = ((i_1868_ & 0xff00ff) + (i_1871_ & 0xff00ff));
											i_1871_ = ((i_1873_ & 0x1000100) + (i_1872_ - i_1873_ & 0x10000));
											is[i_1812_] = (i_1872_ - i_1871_ | i_1871_ - (i_1871_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_1806_++;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_1874_ = anInt8903;
					while (i_1874_ < 0) {
						int i_1875_ = anInt8892;
						int i_1876_ = anInt8899;
						int i_1877_ = anInt8900 + anInt8902;
						int i_1878_ = anInt8888;
						if (i_1876_ >= 0 && i_1876_ - (anInt8877 << 12) < 0) {
							int i_1879_;
							if ((i_1879_ = i_1877_ - (anInt8880 << 12)) >= 0) {
								i_1879_ = (anInt8909 - i_1879_) / anInt8909;
								i_1878_ += i_1879_;
								i_1877_ += anInt8909 * i_1879_;
								i_1875_ += i_1879_;
							}
							if ((i_1879_ = (i_1877_ - anInt8909) / anInt8909) > i_1878_)
								i_1878_ = i_1879_;
							for (/**/; i_1878_ < 0; i_1878_++) {
								int i_1880_ = ((i_1877_ >> 12) * anInt8877 + (i_1876_ >> 12));
								int i_1881_ = i_1875_++;
								if (i_1805_ == 0) {
									if (i == 1)
										is[i_1881_] = (anIntArray11393[(aByteArray11392[i_1880_] & 0xff)]);
									else if (i == 0) {
										int i_1882_ = (anIntArray11393[(aByteArray11392[i_1880_] & 0xff)]);
										int i_1883_ = ((i_1882_ & 0xff0000) * anInt8906 & ~0xffffff);
										int i_1884_ = ((i_1882_ & 0xff00) * anInt8907 & 0xff0000);
										int i_1885_ = ((i_1882_ & 0xff) * anInt8908 & 0xff00);
										is[i_1881_] = (i_1883_ | i_1884_ | i_1885_) >>> 8;
									} else if (i == 3) {
										int i_1886_ = (anIntArray11393[(aByteArray11392[i_1880_] & 0xff)]);
										int i_1887_ = anInt8894;
										int i_1888_ = i_1886_ + i_1887_;
										int i_1889_ = ((i_1886_ & 0xff00ff) + (i_1887_ & 0xff00ff));
										int i_1890_ = ((i_1889_ & 0x1000100) + (i_1888_ - i_1889_ & 0x10000));
										is[i_1881_] = (i_1888_ - i_1890_ | i_1890_ - (i_1890_ >>> 8));
									} else if (i == 2) {
										int i_1891_ = (anIntArray11393[(aByteArray11392[i_1880_] & 0xff)]);
										int i_1892_ = ((i_1891_ & 0xff00ff) * anInt8904 & ~0xff00ff);
										int i_1893_ = ((i_1891_ & 0xff00) * anInt8904 & 0xff0000);
										is[i_1881_] = ((i_1892_ | i_1893_) >>> 8) + anInt8911;
									} else
										throw new IllegalArgumentException();
								} else if (i_1805_ == 1) {
									if (i == 1) {
										int i_1894_ = aByteArray11392[i_1880_];
										if (i_1894_ != 0)
											is[i_1881_] = (anIntArray11393[i_1894_ & 0xff]);
									} else if (i == 0) {
										int i_1895_ = aByteArray11392[i_1880_];
										if (i_1895_ != 0) {
											int i_1896_ = (anIntArray11393[i_1895_ & 0xff]);
											if ((anInt8894 & 0xffffff) == 16777215) {
												int i_1897_ = anInt8894 >>> 24;
												int i_1898_ = 256 - i_1897_;
												int i_1899_ = is[i_1881_];
												is[i_1881_] = (((((i_1896_ & 0xff00ff) * i_1897_) + ((i_1899_ & 0xff00ff) * i_1898_)) & ~0xff00ff) + ((((i_1896_ & 0xff00) * i_1897_) + ((i_1899_ & 0xff00) * i_1898_)) & 0xff0000)) >> 8;
											} else if (anInt8904 != 255) {
												int i_1900_ = (((i_1896_ & 0xff0000) * anInt8906) & ~0xffffff);
												int i_1901_ = (((i_1896_ & 0xff00) * anInt8907) & 0xff0000);
												int i_1902_ = (((i_1896_ & 0xff) * anInt8908) & 0xff00);
												i_1896_ = (i_1900_ | i_1901_ | i_1902_) >>> 8;
												int i_1903_ = is[i_1881_];
												is[i_1881_] = (((((i_1896_ & 0xff00ff) * anInt8904) + ((i_1903_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1896_ & 0xff00) * anInt8904) + ((i_1903_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
											} else {
												int i_1904_ = (((i_1896_ & 0xff0000) * anInt8906) & ~0xffffff);
												int i_1905_ = (((i_1896_ & 0xff00) * anInt8907) & 0xff0000);
												int i_1906_ = (((i_1896_ & 0xff) * anInt8908) & 0xff00);
												is[i_1881_] = (i_1904_ | i_1905_ | i_1906_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_1907_ = aByteArray11392[i_1880_];
										int i_1908_ = (i_1907_ > 0 ? anIntArray11393[i_1907_] : 0);
										int i_1909_ = anInt8894;
										int i_1910_ = i_1908_ + i_1909_;
										int i_1911_ = ((i_1908_ & 0xff00ff) + (i_1909_ & 0xff00ff));
										int i_1912_ = ((i_1911_ & 0x1000100) + (i_1910_ - i_1911_ & 0x10000));
										i_1912_ = (i_1910_ - i_1912_ | i_1912_ - (i_1912_ >>> 8));
										if (i_1908_ == 0 && anInt8904 != 255) {
											i_1908_ = i_1912_;
											i_1912_ = is[i_1881_];
											i_1912_ = (((((i_1908_ & 0xff00ff) * anInt8904) + ((i_1912_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1908_ & 0xff00) * anInt8904) + ((i_1912_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
										}
										is[i_1881_] = i_1912_;
									} else if (i == 2) {
										int i_1913_ = aByteArray11392[i_1880_];
										if (i_1913_ != 0) {
											int i_1914_ = (anIntArray11393[i_1913_ & 0xff]);
											int i_1915_ = (((i_1914_ & 0xff00ff) * anInt8904) & ~0xff00ff);
											int i_1916_ = (((i_1914_ & 0xff00) * anInt8904) & 0xff0000);
											is[i_1881_++] = (((i_1915_ | i_1916_) >>> 8) + anInt8911);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1805_ == 2) {
									if (i == 1) {
										int i_1917_ = aByteArray11392[i_1880_];
										if (i_1917_ != 0) {
											int i_1918_ = (anIntArray11393[i_1917_ & 0xff]);
											int i_1919_ = is[i_1881_];
											int i_1920_ = i_1918_ + i_1919_;
											int i_1921_ = ((i_1918_ & 0xff00ff) + (i_1919_ & 0xff00ff));
											i_1919_ = ((i_1921_ & 0x1000100) + (i_1920_ - i_1921_ & 0x10000));
											is[i_1881_] = (i_1920_ - i_1919_ | i_1919_ - (i_1919_ >>> 8));
										}
									} else if (i == 0) {
										int i_1922_ = aByteArray11392[i_1880_];
										if (i_1922_ != 0) {
											int i_1923_ = (anIntArray11393[i_1922_ & 0xff]);
											int i_1924_ = (((i_1923_ & 0xff0000) * anInt8906) & ~0xffffff);
											int i_1925_ = (((i_1923_ & 0xff00) * anInt8907) & 0xff0000);
											int i_1926_ = ((i_1923_ & 0xff) * anInt8908 & 0xff00);
											i_1923_ = (i_1924_ | i_1925_ | i_1926_) >>> 8;
											int i_1927_ = is[i_1881_];
											int i_1928_ = i_1923_ + i_1927_;
											int i_1929_ = ((i_1923_ & 0xff00ff) + (i_1927_ & 0xff00ff));
											i_1927_ = ((i_1929_ & 0x1000100) + (i_1928_ - i_1929_ & 0x10000));
											is[i_1881_] = (i_1928_ - i_1927_ | i_1927_ - (i_1927_ >>> 8));
										}
									} else if (i == 3) {
										byte i_1930_ = aByteArray11392[i_1880_];
										int i_1931_ = (i_1930_ > 0 ? anIntArray11393[i_1930_] : 0);
										int i_1932_ = anInt8894;
										int i_1933_ = i_1931_ + i_1932_;
										int i_1934_ = ((i_1931_ & 0xff00ff) + (i_1932_ & 0xff00ff));
										int i_1935_ = ((i_1934_ & 0x1000100) + (i_1933_ - i_1934_ & 0x10000));
										i_1935_ = (i_1933_ - i_1935_ | i_1935_ - (i_1935_ >>> 8));
										if (i_1931_ == 0 && anInt8904 != 255) {
											i_1931_ = i_1935_;
											i_1935_ = is[i_1881_];
											i_1935_ = (((((i_1931_ & 0xff00ff) * anInt8904) + ((i_1935_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1931_ & 0xff00) * anInt8904) + ((i_1935_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
										}
										is[i_1881_] = i_1935_;
									} else if (i == 2) {
										int i_1936_ = aByteArray11392[i_1880_];
										if (i_1936_ != 0) {
											int i_1937_ = (anIntArray11393[i_1936_ & 0xff]);
											int i_1938_ = (((i_1937_ & 0xff00ff) * anInt8904) & ~0xff00ff);
											int i_1939_ = (((i_1937_ & 0xff00) * anInt8904) & 0xff0000);
											i_1937_ = ((i_1938_ | i_1939_) >>> 8) + anInt8911;
											int i_1940_ = is[i_1881_];
											int i_1941_ = i_1937_ + i_1940_;
											int i_1942_ = ((i_1937_ & 0xff00ff) + (i_1940_ & 0xff00ff));
											i_1940_ = ((i_1942_ & 0x1000100) + (i_1941_ - i_1942_ & 0x10000));
											is[i_1881_] = (i_1941_ - i_1940_ | i_1940_ - (i_1940_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_1877_ += anInt8909;
							}
						}
						i_1874_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				} else {
					int i_1943_ = anInt8903;
					while (i_1943_ < 0) {
						int i_1944_ = anInt8892;
						int i_1945_ = anInt8899;
						int i_1946_ = anInt8900 + anInt8902;
						int i_1947_ = anInt8888;
						if (i_1945_ >= 0 && i_1945_ - (anInt8877 << 12) < 0) {
							if (i_1946_ < 0) {
								int i_1948_ = (anInt8909 - 1 - i_1946_) / anInt8909;
								i_1947_ += i_1948_;
								i_1946_ += anInt8909 * i_1948_;
								i_1944_ += i_1948_;
							}
							int i_1949_;
							if ((i_1949_ = (1 + i_1946_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_1947_)
								i_1947_ = i_1949_;
							for (/**/; i_1947_ < 0; i_1947_++) {
								int i_1950_ = ((i_1946_ >> 12) * anInt8877 + (i_1945_ >> 12));
								int i_1951_ = i_1944_++;
								if (i_1805_ == 0) {
									if (i == 1)
										is[i_1951_] = (anIntArray11393[(aByteArray11392[i_1950_] & 0xff)]);
									else if (i == 0) {
										int i_1952_ = (anIntArray11393[(aByteArray11392[i_1950_] & 0xff)]);
										int i_1953_ = ((i_1952_ & 0xff0000) * anInt8906 & ~0xffffff);
										int i_1954_ = ((i_1952_ & 0xff00) * anInt8907 & 0xff0000);
										int i_1955_ = ((i_1952_ & 0xff) * anInt8908 & 0xff00);
										is[i_1951_] = (i_1953_ | i_1954_ | i_1955_) >>> 8;
									} else if (i == 3) {
										int i_1956_ = (anIntArray11393[(aByteArray11392[i_1950_] & 0xff)]);
										int i_1957_ = anInt8894;
										int i_1958_ = i_1956_ + i_1957_;
										int i_1959_ = ((i_1956_ & 0xff00ff) + (i_1957_ & 0xff00ff));
										int i_1960_ = ((i_1959_ & 0x1000100) + (i_1958_ - i_1959_ & 0x10000));
										is[i_1951_] = (i_1958_ - i_1960_ | i_1960_ - (i_1960_ >>> 8));
									} else if (i == 2) {
										int i_1961_ = (anIntArray11393[(aByteArray11392[i_1950_] & 0xff)]);
										int i_1962_ = ((i_1961_ & 0xff00ff) * anInt8904 & ~0xff00ff);
										int i_1963_ = ((i_1961_ & 0xff00) * anInt8904 & 0xff0000);
										is[i_1951_] = ((i_1962_ | i_1963_) >>> 8) + anInt8911;
									} else
										throw new IllegalArgumentException();
								} else if (i_1805_ == 1) {
									if (i == 1) {
										int i_1964_ = aByteArray11392[i_1950_];
										if (i_1964_ != 0)
											is[i_1951_] = (anIntArray11393[i_1964_ & 0xff]);
									} else if (i == 0) {
										int i_1965_ = aByteArray11392[i_1950_];
										if (i_1965_ != 0) {
											int i_1966_ = (anIntArray11393[i_1965_ & 0xff]);
											if ((anInt8894 & 0xffffff) == 16777215) {
												int i_1967_ = anInt8894 >>> 24;
												int i_1968_ = 256 - i_1967_;
												int i_1969_ = is[i_1951_];
												is[i_1951_] = (((((i_1966_ & 0xff00ff) * i_1967_) + ((i_1969_ & 0xff00ff) * i_1968_)) & ~0xff00ff) + ((((i_1966_ & 0xff00) * i_1967_) + ((i_1969_ & 0xff00) * i_1968_)) & 0xff0000)) >> 8;
											} else if (anInt8904 != 255) {
												int i_1970_ = (((i_1966_ & 0xff0000) * anInt8906) & ~0xffffff);
												int i_1971_ = (((i_1966_ & 0xff00) * anInt8907) & 0xff0000);
												int i_1972_ = (((i_1966_ & 0xff) * anInt8908) & 0xff00);
												i_1966_ = (i_1970_ | i_1971_ | i_1972_) >>> 8;
												int i_1973_ = is[i_1951_];
												is[i_1951_] = (((((i_1966_ & 0xff00ff) * anInt8904) + ((i_1973_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1966_ & 0xff00) * anInt8904) + ((i_1973_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
											} else {
												int i_1974_ = (((i_1966_ & 0xff0000) * anInt8906) & ~0xffffff);
												int i_1975_ = (((i_1966_ & 0xff00) * anInt8907) & 0xff0000);
												int i_1976_ = (((i_1966_ & 0xff) * anInt8908) & 0xff00);
												is[i_1951_] = (i_1974_ | i_1975_ | i_1976_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_1977_ = aByteArray11392[i_1950_];
										int i_1978_ = (i_1977_ > 0 ? anIntArray11393[i_1977_] : 0);
										int i_1979_ = anInt8894;
										int i_1980_ = i_1978_ + i_1979_;
										int i_1981_ = ((i_1978_ & 0xff00ff) + (i_1979_ & 0xff00ff));
										int i_1982_ = ((i_1981_ & 0x1000100) + (i_1980_ - i_1981_ & 0x10000));
										i_1982_ = (i_1980_ - i_1982_ | i_1982_ - (i_1982_ >>> 8));
										if (i_1978_ == 0 && anInt8904 != 255) {
											i_1978_ = i_1982_;
											i_1982_ = is[i_1951_];
											i_1982_ = (((((i_1978_ & 0xff00ff) * anInt8904) + ((i_1982_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_1978_ & 0xff00) * anInt8904) + ((i_1982_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
										}
										is[i_1951_] = i_1982_;
									} else if (i == 2) {
										int i_1983_ = aByteArray11392[i_1950_];
										if (i_1983_ != 0) {
											int i_1984_ = (anIntArray11393[i_1983_ & 0xff]);
											int i_1985_ = (((i_1984_ & 0xff00ff) * anInt8904) & ~0xff00ff);
											int i_1986_ = (((i_1984_ & 0xff00) * anInt8904) & 0xff0000);
											is[i_1951_++] = (((i_1985_ | i_1986_) >>> 8) + anInt8911);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1805_ == 2) {
									if (i == 1) {
										int i_1987_ = aByteArray11392[i_1950_];
										if (i_1987_ != 0) {
											int i_1988_ = (anIntArray11393[i_1987_ & 0xff]);
											int i_1989_ = is[i_1951_];
											int i_1990_ = i_1988_ + i_1989_;
											int i_1991_ = ((i_1988_ & 0xff00ff) + (i_1989_ & 0xff00ff));
											i_1989_ = ((i_1991_ & 0x1000100) + (i_1990_ - i_1991_ & 0x10000));
											is[i_1951_] = (i_1990_ - i_1989_ | i_1989_ - (i_1989_ >>> 8));
										}
									} else if (i == 0) {
										int i_1992_ = aByteArray11392[i_1950_];
										if (i_1992_ != 0) {
											int i_1993_ = (anIntArray11393[i_1992_ & 0xff]);
											int i_1994_ = (((i_1993_ & 0xff0000) * anInt8906) & ~0xffffff);
											int i_1995_ = (((i_1993_ & 0xff00) * anInt8907) & 0xff0000);
											int i_1996_ = ((i_1993_ & 0xff) * anInt8908 & 0xff00);
											i_1993_ = (i_1994_ | i_1995_ | i_1996_) >>> 8;
											int i_1997_ = is[i_1951_];
											int i_1998_ = i_1993_ + i_1997_;
											int i_1999_ = ((i_1993_ & 0xff00ff) + (i_1997_ & 0xff00ff));
											i_1997_ = ((i_1999_ & 0x1000100) + (i_1998_ - i_1999_ & 0x10000));
											is[i_1951_] = (i_1998_ - i_1997_ | i_1997_ - (i_1997_ >>> 8));
										}
									} else if (i == 3) {
										byte i_2000_ = aByteArray11392[i_1950_];
										int i_2001_ = (i_2000_ > 0 ? anIntArray11393[i_2000_] : 0);
										int i_2002_ = anInt8894;
										int i_2003_ = i_2001_ + i_2002_;
										int i_2004_ = ((i_2001_ & 0xff00ff) + (i_2002_ & 0xff00ff));
										int i_2005_ = ((i_2004_ & 0x1000100) + (i_2003_ - i_2004_ & 0x10000));
										i_2005_ = (i_2003_ - i_2005_ | i_2005_ - (i_2005_ >>> 8));
										if (i_2001_ == 0 && anInt8904 != 255) {
											i_2001_ = i_2005_;
											i_2005_ = is[i_1951_];
											i_2005_ = (((((i_2001_ & 0xff00ff) * anInt8904) + ((i_2005_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_2001_ & 0xff00) * anInt8904) + ((i_2005_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
										}
										is[i_1951_] = i_2005_;
									} else if (i == 2) {
										int i_2006_ = aByteArray11392[i_1950_];
										if (i_2006_ != 0) {
											int i_2007_ = (anIntArray11393[i_2006_ & 0xff]);
											int i_2008_ = (((i_2007_ & 0xff00ff) * anInt8904) & ~0xff00ff);
											int i_2009_ = (((i_2007_ & 0xff00) * anInt8904) & 0xff0000);
											i_2007_ = ((i_2008_ | i_2009_) >>> 8) + anInt8911;
											int i_2010_ = is[i_1951_];
											int i_2011_ = i_2007_ + i_2010_;
											int i_2012_ = ((i_2007_ & 0xff00ff) + (i_2010_ & 0xff00ff));
											i_2010_ = ((i_2012_ & 0x1000100) + (i_2011_ - i_2012_ & 0x10000));
											is[i_1951_] = (i_2011_ - i_2010_ | i_2010_ - (i_2010_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_1946_ += anInt8909;
							}
						}
						i_1943_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8893 < 0) {
				if (anInt8909 == 0) {
					int i_2013_ = anInt8903;
					while (i_2013_ < 0) {
						int i_2014_ = anInt8892;
						int i_2015_ = anInt8899 + anInt8890;
						int i_2016_ = anInt8900;
						int i_2017_ = anInt8888;
						if (i_2016_ >= 0 && i_2016_ - (anInt8880 << 12) < 0) {
							int i_2018_;
							if ((i_2018_ = i_2015_ - (anInt8877 << 12)) >= 0) {
								i_2018_ = (anInt8893 - i_2018_) / anInt8893;
								i_2017_ += i_2018_;
								i_2015_ += anInt8893 * i_2018_;
								i_2014_ += i_2018_;
							}
							if ((i_2018_ = (i_2015_ - anInt8893) / anInt8893) > i_2017_)
								i_2017_ = i_2018_;
							for (/**/; i_2017_ < 0; i_2017_++) {
								int i_2019_ = ((i_2016_ >> 12) * anInt8877 + (i_2015_ >> 12));
								int i_2020_ = i_2014_++;
								if (i_1805_ == 0) {
									if (i == 1)
										is[i_2020_] = (anIntArray11393[(aByteArray11392[i_2019_] & 0xff)]);
									else if (i == 0) {
										int i_2021_ = (anIntArray11393[(aByteArray11392[i_2019_] & 0xff)]);
										int i_2022_ = ((i_2021_ & 0xff0000) * anInt8906 & ~0xffffff);
										int i_2023_ = ((i_2021_ & 0xff00) * anInt8907 & 0xff0000);
										int i_2024_ = ((i_2021_ & 0xff) * anInt8908 & 0xff00);
										is[i_2020_] = (i_2022_ | i_2023_ | i_2024_) >>> 8;
									} else if (i == 3) {
										int i_2025_ = (anIntArray11393[(aByteArray11392[i_2019_] & 0xff)]);
										int i_2026_ = anInt8894;
										int i_2027_ = i_2025_ + i_2026_;
										int i_2028_ = ((i_2025_ & 0xff00ff) + (i_2026_ & 0xff00ff));
										int i_2029_ = ((i_2028_ & 0x1000100) + (i_2027_ - i_2028_ & 0x10000));
										is[i_2020_] = (i_2027_ - i_2029_ | i_2029_ - (i_2029_ >>> 8));
									} else if (i == 2) {
										int i_2030_ = (anIntArray11393[(aByteArray11392[i_2019_] & 0xff)]);
										int i_2031_ = ((i_2030_ & 0xff00ff) * anInt8904 & ~0xff00ff);
										int i_2032_ = ((i_2030_ & 0xff00) * anInt8904 & 0xff0000);
										is[i_2020_] = ((i_2031_ | i_2032_) >>> 8) + anInt8911;
									} else
										throw new IllegalArgumentException();
								} else if (i_1805_ == 1) {
									if (i == 1) {
										int i_2033_ = aByteArray11392[i_2019_];
										if (i_2033_ != 0)
											is[i_2020_] = (anIntArray11393[i_2033_ & 0xff]);
									} else if (i == 0) {
										int i_2034_ = aByteArray11392[i_2019_];
										if (i_2034_ != 0) {
											int i_2035_ = (anIntArray11393[i_2034_ & 0xff]);
											if ((anInt8894 & 0xffffff) == 16777215) {
												int i_2036_ = anInt8894 >>> 24;
												int i_2037_ = 256 - i_2036_;
												int i_2038_ = is[i_2020_];
												is[i_2020_] = (((((i_2035_ & 0xff00ff) * i_2036_) + ((i_2038_ & 0xff00ff) * i_2037_)) & ~0xff00ff) + ((((i_2035_ & 0xff00) * i_2036_) + ((i_2038_ & 0xff00) * i_2037_)) & 0xff0000)) >> 8;
											} else if (anInt8904 != 255) {
												int i_2039_ = (((i_2035_ & 0xff0000) * anInt8906) & ~0xffffff);
												int i_2040_ = (((i_2035_ & 0xff00) * anInt8907) & 0xff0000);
												int i_2041_ = (((i_2035_ & 0xff) * anInt8908) & 0xff00);
												i_2035_ = (i_2039_ | i_2040_ | i_2041_) >>> 8;
												int i_2042_ = is[i_2020_];
												is[i_2020_] = (((((i_2035_ & 0xff00ff) * anInt8904) + ((i_2042_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_2035_ & 0xff00) * anInt8904) + ((i_2042_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
											} else {
												int i_2043_ = (((i_2035_ & 0xff0000) * anInt8906) & ~0xffffff);
												int i_2044_ = (((i_2035_ & 0xff00) * anInt8907) & 0xff0000);
												int i_2045_ = (((i_2035_ & 0xff) * anInt8908) & 0xff00);
												is[i_2020_] = (i_2043_ | i_2044_ | i_2045_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_2046_ = aByteArray11392[i_2019_];
										int i_2047_ = (i_2046_ > 0 ? anIntArray11393[i_2046_] : 0);
										int i_2048_ = anInt8894;
										int i_2049_ = i_2047_ + i_2048_;
										int i_2050_ = ((i_2047_ & 0xff00ff) + (i_2048_ & 0xff00ff));
										int i_2051_ = ((i_2050_ & 0x1000100) + (i_2049_ - i_2050_ & 0x10000));
										i_2051_ = (i_2049_ - i_2051_ | i_2051_ - (i_2051_ >>> 8));
										if (i_2047_ == 0 && anInt8904 != 255) {
											i_2047_ = i_2051_;
											i_2051_ = is[i_2020_];
											i_2051_ = (((((i_2047_ & 0xff00ff) * anInt8904) + ((i_2051_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_2047_ & 0xff00) * anInt8904) + ((i_2051_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
										}
										is[i_2020_] = i_2051_;
									} else if (i == 2) {
										int i_2052_ = aByteArray11392[i_2019_];
										if (i_2052_ != 0) {
											int i_2053_ = (anIntArray11393[i_2052_ & 0xff]);
											int i_2054_ = (((i_2053_ & 0xff00ff) * anInt8904) & ~0xff00ff);
											int i_2055_ = (((i_2053_ & 0xff00) * anInt8904) & 0xff0000);
											is[i_2020_++] = (((i_2054_ | i_2055_) >>> 8) + anInt8911);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1805_ == 2) {
									if (i == 1) {
										int i_2056_ = aByteArray11392[i_2019_];
										if (i_2056_ != 0) {
											int i_2057_ = (anIntArray11393[i_2056_ & 0xff]);
											int i_2058_ = is[i_2020_];
											int i_2059_ = i_2057_ + i_2058_;
											int i_2060_ = ((i_2057_ & 0xff00ff) + (i_2058_ & 0xff00ff));
											i_2058_ = ((i_2060_ & 0x1000100) + (i_2059_ - i_2060_ & 0x10000));
											is[i_2020_] = (i_2059_ - i_2058_ | i_2058_ - (i_2058_ >>> 8));
										}
									} else if (i == 0) {
										int i_2061_ = aByteArray11392[i_2019_];
										if (i_2061_ != 0) {
											int i_2062_ = (anIntArray11393[i_2061_ & 0xff]);
											int i_2063_ = (((i_2062_ & 0xff0000) * anInt8906) & ~0xffffff);
											int i_2064_ = (((i_2062_ & 0xff00) * anInt8907) & 0xff0000);
											int i_2065_ = ((i_2062_ & 0xff) * anInt8908 & 0xff00);
											i_2062_ = (i_2063_ | i_2064_ | i_2065_) >>> 8;
											int i_2066_ = is[i_2020_];
											int i_2067_ = i_2062_ + i_2066_;
											int i_2068_ = ((i_2062_ & 0xff00ff) + (i_2066_ & 0xff00ff));
											i_2066_ = ((i_2068_ & 0x1000100) + (i_2067_ - i_2068_ & 0x10000));
											is[i_2020_] = (i_2067_ - i_2066_ | i_2066_ - (i_2066_ >>> 8));
										}
									} else if (i == 3) {
										byte i_2069_ = aByteArray11392[i_2019_];
										int i_2070_ = (i_2069_ > 0 ? anIntArray11393[i_2069_] : 0);
										int i_2071_ = anInt8894;
										int i_2072_ = i_2070_ + i_2071_;
										int i_2073_ = ((i_2070_ & 0xff00ff) + (i_2071_ & 0xff00ff));
										int i_2074_ = ((i_2073_ & 0x1000100) + (i_2072_ - i_2073_ & 0x10000));
										i_2074_ = (i_2072_ - i_2074_ | i_2074_ - (i_2074_ >>> 8));
										if (i_2070_ == 0 && anInt8904 != 255) {
											i_2070_ = i_2074_;
											i_2074_ = is[i_2020_];
											i_2074_ = (((((i_2070_ & 0xff00ff) * anInt8904) + ((i_2074_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_2070_ & 0xff00) * anInt8904) + ((i_2074_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
										}
										is[i_2020_] = i_2074_;
									} else if (i == 2) {
										int i_2075_ = aByteArray11392[i_2019_];
										if (i_2075_ != 0) {
											int i_2076_ = (anIntArray11393[i_2075_ & 0xff]);
											int i_2077_ = (((i_2076_ & 0xff00ff) * anInt8904) & ~0xff00ff);
											int i_2078_ = (((i_2076_ & 0xff00) * anInt8904) & 0xff0000);
											i_2076_ = ((i_2077_ | i_2078_) >>> 8) + anInt8911;
											int i_2079_ = is[i_2020_];
											int i_2080_ = i_2076_ + i_2079_;
											int i_2081_ = ((i_2076_ & 0xff00ff) + (i_2079_ & 0xff00ff));
											i_2079_ = ((i_2081_ & 0x1000100) + (i_2080_ - i_2081_ & 0x10000));
											is[i_2020_] = (i_2080_ - i_2079_ | i_2079_ - (i_2079_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_2015_ += anInt8893;
							}
						}
						i_2013_++;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_2082_ = anInt8903;
					while (i_2082_ < 0) {
						int i_2083_ = anInt8892;
						int i_2084_ = anInt8899 + anInt8890;
						int i_2085_ = anInt8900 + anInt8902;
						int i_2086_ = anInt8888;
						int i_2087_;
						if ((i_2087_ = i_2084_ - (anInt8877 << 12)) >= 0) {
							i_2087_ = (anInt8893 - i_2087_) / anInt8893;
							i_2086_ += i_2087_;
							i_2084_ += anInt8893 * i_2087_;
							i_2085_ += anInt8909 * i_2087_;
							i_2083_ += i_2087_;
						}
						if ((i_2087_ = (i_2084_ - anInt8893) / anInt8893) > i_2086_)
							i_2086_ = i_2087_;
						if ((i_2087_ = i_2085_ - (anInt8880 << 12)) >= 0) {
							i_2087_ = (anInt8909 - i_2087_) / anInt8909;
							i_2086_ += i_2087_;
							i_2084_ += anInt8893 * i_2087_;
							i_2085_ += anInt8909 * i_2087_;
							i_2083_ += i_2087_;
						}
						if ((i_2087_ = (i_2085_ - anInt8909) / anInt8909) > i_2086_)
							i_2086_ = i_2087_;
						for (/**/; i_2086_ < 0; i_2086_++) {
							int i_2088_ = ((i_2085_ >> 12) * anInt8877 + (i_2084_ >> 12));
							int i_2089_ = i_2083_++;
							if (i_1805_ == 0) {
								if (i == 1)
									is[i_2089_] = (anIntArray11393[aByteArray11392[i_2088_] & 0xff]);
								else if (i == 0) {
									int i_2090_ = (anIntArray11393[aByteArray11392[i_2088_] & 0xff]);
									int i_2091_ = ((i_2090_ & 0xff0000) * anInt8906 & ~0xffffff);
									int i_2092_ = ((i_2090_ & 0xff00) * anInt8907 & 0xff0000);
									int i_2093_ = ((i_2090_ & 0xff) * anInt8908 & 0xff00);
									is[i_2089_] = (i_2091_ | i_2092_ | i_2093_) >>> 8;
								} else if (i == 3) {
									int i_2094_ = (anIntArray11393[aByteArray11392[i_2088_] & 0xff]);
									int i_2095_ = anInt8894;
									int i_2096_ = i_2094_ + i_2095_;
									int i_2097_ = ((i_2094_ & 0xff00ff) + (i_2095_ & 0xff00ff));
									int i_2098_ = ((i_2097_ & 0x1000100) + (i_2096_ - i_2097_ & 0x10000));
									is[i_2089_] = (i_2096_ - i_2098_ | i_2098_ - (i_2098_ >>> 8));
								} else if (i == 2) {
									int i_2099_ = (anIntArray11393[aByteArray11392[i_2088_] & 0xff]);
									int i_2100_ = ((i_2099_ & 0xff00ff) * anInt8904 & ~0xff00ff);
									int i_2101_ = ((i_2099_ & 0xff00) * anInt8904 & 0xff0000);
									is[i_2089_] = (((i_2100_ | i_2101_) >>> 8) + anInt8911);
								} else
									throw new IllegalArgumentException();
							} else if (i_1805_ == 1) {
								if (i == 1) {
									int i_2102_ = aByteArray11392[i_2088_];
									if (i_2102_ != 0)
										is[i_2089_] = anIntArray11393[i_2102_ & 0xff];
								} else if (i == 0) {
									int i_2103_ = aByteArray11392[i_2088_];
									if (i_2103_ != 0) {
										int i_2104_ = anIntArray11393[i_2103_ & 0xff];
										if ((anInt8894 & 0xffffff) == 16777215) {
											int i_2105_ = anInt8894 >>> 24;
											int i_2106_ = 256 - i_2105_;
											int i_2107_ = is[i_2089_];
											is[i_2089_] = (((((i_2104_ & 0xff00ff) * i_2105_) + ((i_2107_ & 0xff00ff) * i_2106_)) & ~0xff00ff) + ((((i_2104_ & 0xff00) * i_2105_) + ((i_2107_ & 0xff00) * i_2106_)) & 0xff0000)) >> 8;
										} else if (anInt8904 != 255) {
											int i_2108_ = (((i_2104_ & 0xff0000) * anInt8906) & ~0xffffff);
											int i_2109_ = (((i_2104_ & 0xff00) * anInt8907) & 0xff0000);
											int i_2110_ = ((i_2104_ & 0xff) * anInt8908 & 0xff00);
											i_2104_ = (i_2108_ | i_2109_ | i_2110_) >>> 8;
											int i_2111_ = is[i_2089_];
											is[i_2089_] = (((((i_2104_ & 0xff00ff) * anInt8904) + ((i_2111_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_2104_ & 0xff00) * anInt8904) + ((i_2111_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
										} else {
											int i_2112_ = (((i_2104_ & 0xff0000) * anInt8906) & ~0xffffff);
											int i_2113_ = (((i_2104_ & 0xff00) * anInt8907) & 0xff0000);
											int i_2114_ = ((i_2104_ & 0xff) * anInt8908 & 0xff00);
											is[i_2089_] = (i_2112_ | i_2113_ | i_2114_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_2115_ = aByteArray11392[i_2088_];
									int i_2116_ = (i_2115_ > 0 ? anIntArray11393[i_2115_] : 0);
									int i_2117_ = anInt8894;
									int i_2118_ = i_2116_ + i_2117_;
									int i_2119_ = ((i_2116_ & 0xff00ff) + (i_2117_ & 0xff00ff));
									int i_2120_ = ((i_2119_ & 0x1000100) + (i_2118_ - i_2119_ & 0x10000));
									i_2120_ = (i_2118_ - i_2120_ | i_2120_ - (i_2120_ >>> 8));
									if (i_2116_ == 0 && anInt8904 != 255) {
										i_2116_ = i_2120_;
										i_2120_ = is[i_2089_];
										i_2120_ = (((((i_2116_ & 0xff00ff) * anInt8904) + ((i_2120_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_2116_ & 0xff00) * anInt8904) + ((i_2120_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
									}
									is[i_2089_] = i_2120_;
								} else if (i == 2) {
									int i_2121_ = aByteArray11392[i_2088_];
									if (i_2121_ != 0) {
										int i_2122_ = anIntArray11393[i_2121_ & 0xff];
										int i_2123_ = ((i_2122_ & 0xff00ff) * anInt8904 & ~0xff00ff);
										int i_2124_ = ((i_2122_ & 0xff00) * anInt8904 & 0xff0000);
										is[i_2089_++] = ((i_2123_ | i_2124_) >>> 8) + anInt8911;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_1805_ == 2) {
								if (i == 1) {
									int i_2125_ = aByteArray11392[i_2088_];
									if (i_2125_ != 0) {
										int i_2126_ = anIntArray11393[i_2125_ & 0xff];
										int i_2127_ = is[i_2089_];
										int i_2128_ = i_2126_ + i_2127_;
										int i_2129_ = ((i_2126_ & 0xff00ff) + (i_2127_ & 0xff00ff));
										i_2127_ = ((i_2129_ & 0x1000100) + (i_2128_ - i_2129_ & 0x10000));
										is[i_2089_] = (i_2128_ - i_2127_ | i_2127_ - (i_2127_ >>> 8));
									}
								} else if (i == 0) {
									int i_2130_ = aByteArray11392[i_2088_];
									if (i_2130_ != 0) {
										int i_2131_ = anIntArray11393[i_2130_ & 0xff];
										int i_2132_ = ((i_2131_ & 0xff0000) * anInt8906 & ~0xffffff);
										int i_2133_ = ((i_2131_ & 0xff00) * anInt8907 & 0xff0000);
										int i_2134_ = ((i_2131_ & 0xff) * anInt8908 & 0xff00);
										i_2131_ = (i_2132_ | i_2133_ | i_2134_) >>> 8;
										int i_2135_ = is[i_2089_];
										int i_2136_ = i_2131_ + i_2135_;
										int i_2137_ = ((i_2131_ & 0xff00ff) + (i_2135_ & 0xff00ff));
										i_2135_ = ((i_2137_ & 0x1000100) + (i_2136_ - i_2137_ & 0x10000));
										is[i_2089_] = (i_2136_ - i_2135_ | i_2135_ - (i_2135_ >>> 8));
									}
								} else if (i == 3) {
									byte i_2138_ = aByteArray11392[i_2088_];
									int i_2139_ = (i_2138_ > 0 ? anIntArray11393[i_2138_] : 0);
									int i_2140_ = anInt8894;
									int i_2141_ = i_2139_ + i_2140_;
									int i_2142_ = ((i_2139_ & 0xff00ff) + (i_2140_ & 0xff00ff));
									int i_2143_ = ((i_2142_ & 0x1000100) + (i_2141_ - i_2142_ & 0x10000));
									i_2143_ = (i_2141_ - i_2143_ | i_2143_ - (i_2143_ >>> 8));
									if (i_2139_ == 0 && anInt8904 != 255) {
										i_2139_ = i_2143_;
										i_2143_ = is[i_2089_];
										i_2143_ = (((((i_2139_ & 0xff00ff) * anInt8904) + ((i_2143_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_2139_ & 0xff00) * anInt8904) + ((i_2143_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
									}
									is[i_2089_] = i_2143_;
								} else if (i == 2) {
									int i_2144_ = aByteArray11392[i_2088_];
									if (i_2144_ != 0) {
										int i_2145_ = anIntArray11393[i_2144_ & 0xff];
										int i_2146_ = ((i_2145_ & 0xff00ff) * anInt8904 & ~0xff00ff);
										int i_2147_ = ((i_2145_ & 0xff00) * anInt8904 & 0xff0000);
										i_2145_ = (((i_2146_ | i_2147_) >>> 8) + anInt8911);
										int i_2148_ = is[i_2089_];
										int i_2149_ = i_2145_ + i_2148_;
										int i_2150_ = ((i_2145_ & 0xff00ff) + (i_2148_ & 0xff00ff));
										i_2148_ = ((i_2150_ & 0x1000100) + (i_2149_ - i_2150_ & 0x10000));
										is[i_2089_] = (i_2149_ - i_2148_ | i_2148_ - (i_2148_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_2084_ += anInt8893;
							i_2085_ += anInt8909;
						}
						i_2082_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else {
					int i_2151_ = anInt8903;
					while (i_2151_ < 0) {
						int i_2152_ = anInt8892;
						int i_2153_ = anInt8899 + anInt8890;
						int i_2154_ = anInt8900 + anInt8902;
						int i_2155_ = anInt8888;
						int i_2156_;
						if ((i_2156_ = i_2153_ - (anInt8877 << 12)) >= 0) {
							i_2156_ = (anInt8893 - i_2156_) / anInt8893;
							i_2155_ += i_2156_;
							i_2153_ += anInt8893 * i_2156_;
							i_2154_ += anInt8909 * i_2156_;
							i_2152_ += i_2156_;
						}
						if ((i_2156_ = (i_2153_ - anInt8893) / anInt8893) > i_2155_)
							i_2155_ = i_2156_;
						if (i_2154_ < 0) {
							i_2156_ = (anInt8909 - 1 - i_2154_) / anInt8909;
							i_2155_ += i_2156_;
							i_2153_ += anInt8893 * i_2156_;
							i_2154_ += anInt8909 * i_2156_;
							i_2152_ += i_2156_;
						}
						if ((i_2156_ = (1 + i_2154_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_2155_)
							i_2155_ = i_2156_;
						for (/**/; i_2155_ < 0; i_2155_++) {
							int i_2157_ = ((i_2154_ >> 12) * anInt8877 + (i_2153_ >> 12));
							int i_2158_ = i_2152_++;
							if (i_1805_ == 0) {
								if (i == 1)
									is[i_2158_] = (anIntArray11393[aByteArray11392[i_2157_] & 0xff]);
								else if (i == 0) {
									int i_2159_ = (anIntArray11393[aByteArray11392[i_2157_] & 0xff]);
									int i_2160_ = ((i_2159_ & 0xff0000) * anInt8906 & ~0xffffff);
									int i_2161_ = ((i_2159_ & 0xff00) * anInt8907 & 0xff0000);
									int i_2162_ = ((i_2159_ & 0xff) * anInt8908 & 0xff00);
									is[i_2158_] = (i_2160_ | i_2161_ | i_2162_) >>> 8;
								} else if (i == 3) {
									int i_2163_ = (anIntArray11393[aByteArray11392[i_2157_] & 0xff]);
									int i_2164_ = anInt8894;
									int i_2165_ = i_2163_ + i_2164_;
									int i_2166_ = ((i_2163_ & 0xff00ff) + (i_2164_ & 0xff00ff));
									int i_2167_ = ((i_2166_ & 0x1000100) + (i_2165_ - i_2166_ & 0x10000));
									is[i_2158_] = (i_2165_ - i_2167_ | i_2167_ - (i_2167_ >>> 8));
								} else if (i == 2) {
									int i_2168_ = (anIntArray11393[aByteArray11392[i_2157_] & 0xff]);
									int i_2169_ = ((i_2168_ & 0xff00ff) * anInt8904 & ~0xff00ff);
									int i_2170_ = ((i_2168_ & 0xff00) * anInt8904 & 0xff0000);
									is[i_2158_] = (((i_2169_ | i_2170_) >>> 8) + anInt8911);
								} else
									throw new IllegalArgumentException();
							} else if (i_1805_ == 1) {
								if (i == 1) {
									int i_2171_ = aByteArray11392[i_2157_];
									if (i_2171_ != 0)
										is[i_2158_] = anIntArray11393[i_2171_ & 0xff];
								} else if (i == 0) {
									int i_2172_ = aByteArray11392[i_2157_];
									if (i_2172_ != 0) {
										int i_2173_ = anIntArray11393[i_2172_ & 0xff];
										if ((anInt8894 & 0xffffff) == 16777215) {
											int i_2174_ = anInt8894 >>> 24;
											int i_2175_ = 256 - i_2174_;
											int i_2176_ = is[i_2158_];
											is[i_2158_] = (((((i_2173_ & 0xff00ff) * i_2174_) + ((i_2176_ & 0xff00ff) * i_2175_)) & ~0xff00ff) + ((((i_2173_ & 0xff00) * i_2174_) + ((i_2176_ & 0xff00) * i_2175_)) & 0xff0000)) >> 8;
										} else if (anInt8904 != 255) {
											int i_2177_ = (((i_2173_ & 0xff0000) * anInt8906) & ~0xffffff);
											int i_2178_ = (((i_2173_ & 0xff00) * anInt8907) & 0xff0000);
											int i_2179_ = ((i_2173_ & 0xff) * anInt8908 & 0xff00);
											i_2173_ = (i_2177_ | i_2178_ | i_2179_) >>> 8;
											int i_2180_ = is[i_2158_];
											is[i_2158_] = (((((i_2173_ & 0xff00ff) * anInt8904) + ((i_2180_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_2173_ & 0xff00) * anInt8904) + ((i_2180_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
										} else {
											int i_2181_ = (((i_2173_ & 0xff0000) * anInt8906) & ~0xffffff);
											int i_2182_ = (((i_2173_ & 0xff00) * anInt8907) & 0xff0000);
											int i_2183_ = ((i_2173_ & 0xff) * anInt8908 & 0xff00);
											is[i_2158_] = (i_2181_ | i_2182_ | i_2183_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_2184_ = aByteArray11392[i_2157_];
									int i_2185_ = (i_2184_ > 0 ? anIntArray11393[i_2184_] : 0);
									int i_2186_ = anInt8894;
									int i_2187_ = i_2185_ + i_2186_;
									int i_2188_ = ((i_2185_ & 0xff00ff) + (i_2186_ & 0xff00ff));
									int i_2189_ = ((i_2188_ & 0x1000100) + (i_2187_ - i_2188_ & 0x10000));
									i_2189_ = (i_2187_ - i_2189_ | i_2189_ - (i_2189_ >>> 8));
									if (i_2185_ == 0 && anInt8904 != 255) {
										i_2185_ = i_2189_;
										i_2189_ = is[i_2158_];
										i_2189_ = (((((i_2185_ & 0xff00ff) * anInt8904) + ((i_2189_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_2185_ & 0xff00) * anInt8904) + ((i_2189_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
									}
									is[i_2158_] = i_2189_;
								} else if (i == 2) {
									int i_2190_ = aByteArray11392[i_2157_];
									if (i_2190_ != 0) {
										int i_2191_ = anIntArray11393[i_2190_ & 0xff];
										int i_2192_ = ((i_2191_ & 0xff00ff) * anInt8904 & ~0xff00ff);
										int i_2193_ = ((i_2191_ & 0xff00) * anInt8904 & 0xff0000);
										is[i_2158_++] = ((i_2192_ | i_2193_) >>> 8) + anInt8911;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_1805_ == 2) {
								if (i == 1) {
									int i_2194_ = aByteArray11392[i_2157_];
									if (i_2194_ != 0) {
										int i_2195_ = anIntArray11393[i_2194_ & 0xff];
										int i_2196_ = is[i_2158_];
										int i_2197_ = i_2195_ + i_2196_;
										int i_2198_ = ((i_2195_ & 0xff00ff) + (i_2196_ & 0xff00ff));
										i_2196_ = ((i_2198_ & 0x1000100) + (i_2197_ - i_2198_ & 0x10000));
										is[i_2158_] = (i_2197_ - i_2196_ | i_2196_ - (i_2196_ >>> 8));
									}
								} else if (i == 0) {
									int i_2199_ = aByteArray11392[i_2157_];
									if (i_2199_ != 0) {
										int i_2200_ = anIntArray11393[i_2199_ & 0xff];
										int i_2201_ = ((i_2200_ & 0xff0000) * anInt8906 & ~0xffffff);
										int i_2202_ = ((i_2200_ & 0xff00) * anInt8907 & 0xff0000);
										int i_2203_ = ((i_2200_ & 0xff) * anInt8908 & 0xff00);
										i_2200_ = (i_2201_ | i_2202_ | i_2203_) >>> 8;
										int i_2204_ = is[i_2158_];
										int i_2205_ = i_2200_ + i_2204_;
										int i_2206_ = ((i_2200_ & 0xff00ff) + (i_2204_ & 0xff00ff));
										i_2204_ = ((i_2206_ & 0x1000100) + (i_2205_ - i_2206_ & 0x10000));
										is[i_2158_] = (i_2205_ - i_2204_ | i_2204_ - (i_2204_ >>> 8));
									}
								} else if (i == 3) {
									byte i_2207_ = aByteArray11392[i_2157_];
									int i_2208_ = (i_2207_ > 0 ? anIntArray11393[i_2207_] : 0);
									int i_2209_ = anInt8894;
									int i_2210_ = i_2208_ + i_2209_;
									int i_2211_ = ((i_2208_ & 0xff00ff) + (i_2209_ & 0xff00ff));
									int i_2212_ = ((i_2211_ & 0x1000100) + (i_2210_ - i_2211_ & 0x10000));
									i_2212_ = (i_2210_ - i_2212_ | i_2212_ - (i_2212_ >>> 8));
									if (i_2208_ == 0 && anInt8904 != 255) {
										i_2208_ = i_2212_;
										i_2212_ = is[i_2158_];
										i_2212_ = (((((i_2208_ & 0xff00ff) * anInt8904) + ((i_2212_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_2208_ & 0xff00) * anInt8904) + ((i_2212_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
									}
									is[i_2158_] = i_2212_;
								} else if (i == 2) {
									int i_2213_ = aByteArray11392[i_2157_];
									if (i_2213_ != 0) {
										int i_2214_ = anIntArray11393[i_2213_ & 0xff];
										int i_2215_ = ((i_2214_ & 0xff00ff) * anInt8904 & ~0xff00ff);
										int i_2216_ = ((i_2214_ & 0xff00) * anInt8904 & 0xff0000);
										i_2214_ = (((i_2215_ | i_2216_) >>> 8) + anInt8911);
										int i_2217_ = is[i_2158_];
										int i_2218_ = i_2214_ + i_2217_;
										int i_2219_ = ((i_2214_ & 0xff00ff) + (i_2217_ & 0xff00ff));
										i_2217_ = ((i_2219_ & 0x1000100) + (i_2218_ - i_2219_ & 0x10000));
										is[i_2158_] = (i_2218_ - i_2217_ | i_2217_ - (i_2217_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_2153_ += anInt8893;
							i_2154_ += anInt8909;
						}
						i_2151_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8909 == 0) {
				int i_2220_ = anInt8903;
				while (i_2220_ < 0) {
					int i_2221_ = anInt8892;
					int i_2222_ = anInt8899 + anInt8890;
					int i_2223_ = anInt8900;
					int i_2224_ = anInt8888;
					if (i_2223_ >= 0 && i_2223_ - (anInt8880 << 12) < 0) {
						if (i_2222_ < 0) {
							int i_2225_ = (anInt8893 - 1 - i_2222_) / anInt8893;
							i_2224_ += i_2225_;
							i_2222_ += anInt8893 * i_2225_;
							i_2221_ += i_2225_;
						}
						int i_2226_;
						if ((i_2226_ = (1 + i_2222_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_2224_)
							i_2224_ = i_2226_;
						for (/**/; i_2224_ < 0; i_2224_++) {
							int i_2227_ = ((i_2223_ >> 12) * anInt8877 + (i_2222_ >> 12));
							int i_2228_ = i_2221_++;
							if (i_1805_ == 0) {
								if (i == 1)
									is[i_2228_] = (anIntArray11393[aByteArray11392[i_2227_] & 0xff]);
								else if (i == 0) {
									int i_2229_ = (anIntArray11393[aByteArray11392[i_2227_] & 0xff]);
									int i_2230_ = ((i_2229_ & 0xff0000) * anInt8906 & ~0xffffff);
									int i_2231_ = ((i_2229_ & 0xff00) * anInt8907 & 0xff0000);
									int i_2232_ = ((i_2229_ & 0xff) * anInt8908 & 0xff00);
									is[i_2228_] = (i_2230_ | i_2231_ | i_2232_) >>> 8;
								} else if (i == 3) {
									int i_2233_ = (anIntArray11393[aByteArray11392[i_2227_] & 0xff]);
									int i_2234_ = anInt8894;
									int i_2235_ = i_2233_ + i_2234_;
									int i_2236_ = ((i_2233_ & 0xff00ff) + (i_2234_ & 0xff00ff));
									int i_2237_ = ((i_2236_ & 0x1000100) + (i_2235_ - i_2236_ & 0x10000));
									is[i_2228_] = (i_2235_ - i_2237_ | i_2237_ - (i_2237_ >>> 8));
								} else if (i == 2) {
									int i_2238_ = (anIntArray11393[aByteArray11392[i_2227_] & 0xff]);
									int i_2239_ = ((i_2238_ & 0xff00ff) * anInt8904 & ~0xff00ff);
									int i_2240_ = ((i_2238_ & 0xff00) * anInt8904 & 0xff0000);
									is[i_2228_] = (((i_2239_ | i_2240_) >>> 8) + anInt8911);
								} else
									throw new IllegalArgumentException();
							} else if (i_1805_ == 1) {
								if (i == 1) {
									int i_2241_ = aByteArray11392[i_2227_];
									if (i_2241_ != 0)
										is[i_2228_] = anIntArray11393[i_2241_ & 0xff];
								} else if (i == 0) {
									int i_2242_ = aByteArray11392[i_2227_];
									if (i_2242_ != 0) {
										int i_2243_ = anIntArray11393[i_2242_ & 0xff];
										if ((anInt8894 & 0xffffff) == 16777215) {
											int i_2244_ = anInt8894 >>> 24;
											int i_2245_ = 256 - i_2244_;
											int i_2246_ = is[i_2228_];
											is[i_2228_] = (((((i_2243_ & 0xff00ff) * i_2244_) + ((i_2246_ & 0xff00ff) * i_2245_)) & ~0xff00ff) + ((((i_2243_ & 0xff00) * i_2244_) + ((i_2246_ & 0xff00) * i_2245_)) & 0xff0000)) >> 8;
										} else if (anInt8904 != 255) {
											int i_2247_ = (((i_2243_ & 0xff0000) * anInt8906) & ~0xffffff);
											int i_2248_ = (((i_2243_ & 0xff00) * anInt8907) & 0xff0000);
											int i_2249_ = ((i_2243_ & 0xff) * anInt8908 & 0xff00);
											i_2243_ = (i_2247_ | i_2248_ | i_2249_) >>> 8;
											int i_2250_ = is[i_2228_];
											is[i_2228_] = (((((i_2243_ & 0xff00ff) * anInt8904) + ((i_2250_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_2243_ & 0xff00) * anInt8904) + ((i_2250_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
										} else {
											int i_2251_ = (((i_2243_ & 0xff0000) * anInt8906) & ~0xffffff);
											int i_2252_ = (((i_2243_ & 0xff00) * anInt8907) & 0xff0000);
											int i_2253_ = ((i_2243_ & 0xff) * anInt8908 & 0xff00);
											is[i_2228_] = (i_2251_ | i_2252_ | i_2253_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_2254_ = aByteArray11392[i_2227_];
									int i_2255_ = (i_2254_ > 0 ? anIntArray11393[i_2254_] : 0);
									int i_2256_ = anInt8894;
									int i_2257_ = i_2255_ + i_2256_;
									int i_2258_ = ((i_2255_ & 0xff00ff) + (i_2256_ & 0xff00ff));
									int i_2259_ = ((i_2258_ & 0x1000100) + (i_2257_ - i_2258_ & 0x10000));
									i_2259_ = (i_2257_ - i_2259_ | i_2259_ - (i_2259_ >>> 8));
									if (i_2255_ == 0 && anInt8904 != 255) {
										i_2255_ = i_2259_;
										i_2259_ = is[i_2228_];
										i_2259_ = (((((i_2255_ & 0xff00ff) * anInt8904) + ((i_2259_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_2255_ & 0xff00) * anInt8904) + ((i_2259_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
									}
									is[i_2228_] = i_2259_;
								} else if (i == 2) {
									int i_2260_ = aByteArray11392[i_2227_];
									if (i_2260_ != 0) {
										int i_2261_ = anIntArray11393[i_2260_ & 0xff];
										int i_2262_ = ((i_2261_ & 0xff00ff) * anInt8904 & ~0xff00ff);
										int i_2263_ = ((i_2261_ & 0xff00) * anInt8904 & 0xff0000);
										is[i_2228_++] = ((i_2262_ | i_2263_) >>> 8) + anInt8911;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_1805_ == 2) {
								if (i == 1) {
									int i_2264_ = aByteArray11392[i_2227_];
									if (i_2264_ != 0) {
										int i_2265_ = anIntArray11393[i_2264_ & 0xff];
										int i_2266_ = is[i_2228_];
										int i_2267_ = i_2265_ + i_2266_;
										int i_2268_ = ((i_2265_ & 0xff00ff) + (i_2266_ & 0xff00ff));
										i_2266_ = ((i_2268_ & 0x1000100) + (i_2267_ - i_2268_ & 0x10000));
										is[i_2228_] = (i_2267_ - i_2266_ | i_2266_ - (i_2266_ >>> 8));
									}
								} else if (i == 0) {
									int i_2269_ = aByteArray11392[i_2227_];
									if (i_2269_ != 0) {
										int i_2270_ = anIntArray11393[i_2269_ & 0xff];
										int i_2271_ = ((i_2270_ & 0xff0000) * anInt8906 & ~0xffffff);
										int i_2272_ = ((i_2270_ & 0xff00) * anInt8907 & 0xff0000);
										int i_2273_ = ((i_2270_ & 0xff) * anInt8908 & 0xff00);
										i_2270_ = (i_2271_ | i_2272_ | i_2273_) >>> 8;
										int i_2274_ = is[i_2228_];
										int i_2275_ = i_2270_ + i_2274_;
										int i_2276_ = ((i_2270_ & 0xff00ff) + (i_2274_ & 0xff00ff));
										i_2274_ = ((i_2276_ & 0x1000100) + (i_2275_ - i_2276_ & 0x10000));
										is[i_2228_] = (i_2275_ - i_2274_ | i_2274_ - (i_2274_ >>> 8));
									}
								} else if (i == 3) {
									byte i_2277_ = aByteArray11392[i_2227_];
									int i_2278_ = (i_2277_ > 0 ? anIntArray11393[i_2277_] : 0);
									int i_2279_ = anInt8894;
									int i_2280_ = i_2278_ + i_2279_;
									int i_2281_ = ((i_2278_ & 0xff00ff) + (i_2279_ & 0xff00ff));
									int i_2282_ = ((i_2281_ & 0x1000100) + (i_2280_ - i_2281_ & 0x10000));
									i_2282_ = (i_2280_ - i_2282_ | i_2282_ - (i_2282_ >>> 8));
									if (i_2278_ == 0 && anInt8904 != 255) {
										i_2278_ = i_2282_;
										i_2282_ = is[i_2228_];
										i_2282_ = (((((i_2278_ & 0xff00ff) * anInt8904) + ((i_2282_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_2278_ & 0xff00) * anInt8904) + ((i_2282_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
									}
									is[i_2228_] = i_2282_;
								} else if (i == 2) {
									int i_2283_ = aByteArray11392[i_2227_];
									if (i_2283_ != 0) {
										int i_2284_ = anIntArray11393[i_2283_ & 0xff];
										int i_2285_ = ((i_2284_ & 0xff00ff) * anInt8904 & ~0xff00ff);
										int i_2286_ = ((i_2284_ & 0xff00) * anInt8904 & 0xff0000);
										i_2284_ = (((i_2285_ | i_2286_) >>> 8) + anInt8911);
										int i_2287_ = is[i_2228_];
										int i_2288_ = i_2284_ + i_2287_;
										int i_2289_ = ((i_2284_ & 0xff00ff) + (i_2287_ & 0xff00ff));
										i_2287_ = ((i_2289_ & 0x1000100) + (i_2288_ - i_2289_ & 0x10000));
										is[i_2228_] = (i_2288_ - i_2287_ | i_2287_ - (i_2287_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_2222_ += anInt8893;
						}
					}
					i_2220_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else if (anInt8909 < 0) {
				for (int i_2290_ = anInt8903; i_2290_ < 0; i_2290_++) {
					int i_2291_ = anInt8892;
					int i_2292_ = anInt8899 + anInt8890;
					int i_2293_ = anInt8900 + anInt8902;
					int i_2294_ = anInt8888;
					if (i_2292_ < 0) {
						int i_2295_ = (anInt8893 - 1 - i_2292_) / anInt8893;
						i_2294_ += i_2295_;
						i_2292_ += anInt8893 * i_2295_;
						i_2293_ += anInt8909 * i_2295_;
						i_2291_ += i_2295_;
					}
					int i_2296_;
					if ((i_2296_ = (1 + i_2292_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_2294_)
						i_2294_ = i_2296_;
					if ((i_2296_ = i_2293_ - (anInt8880 << 12)) >= 0) {
						i_2296_ = (anInt8909 - i_2296_) / anInt8909;
						i_2294_ += i_2296_;
						i_2292_ += anInt8893 * i_2296_;
						i_2293_ += anInt8909 * i_2296_;
						i_2291_ += i_2296_;
					}
					if ((i_2296_ = (i_2293_ - anInt8909) / anInt8909) > i_2294_)
						i_2294_ = i_2296_;
					for (/**/; i_2294_ < 0; i_2294_++) {
						int i_2297_ = (i_2293_ >> 12) * anInt8877 + (i_2292_ >> 12);
						int i_2298_ = i_2291_++;
						if (i_1805_ == 0) {
							if (i == 1)
								is[i_2298_] = (anIntArray11393[aByteArray11392[i_2297_] & 0xff]);
							else if (i == 0) {
								int i_2299_ = (anIntArray11393[aByteArray11392[i_2297_] & 0xff]);
								int i_2300_ = ((i_2299_ & 0xff0000) * anInt8906 & ~0xffffff);
								int i_2301_ = ((i_2299_ & 0xff00) * anInt8907 & 0xff0000);
								int i_2302_ = (i_2299_ & 0xff) * anInt8908 & 0xff00;
								is[i_2298_] = (i_2300_ | i_2301_ | i_2302_) >>> 8;
							} else if (i == 3) {
								int i_2303_ = (anIntArray11393[aByteArray11392[i_2297_] & 0xff]);
								int i_2304_ = anInt8894;
								int i_2305_ = i_2303_ + i_2304_;
								int i_2306_ = ((i_2303_ & 0xff00ff) + (i_2304_ & 0xff00ff));
								int i_2307_ = ((i_2306_ & 0x1000100) + (i_2305_ - i_2306_ & 0x10000));
								is[i_2298_] = i_2305_ - i_2307_ | i_2307_ - (i_2307_ >>> 8);
							} else if (i == 2) {
								int i_2308_ = (anIntArray11393[aByteArray11392[i_2297_] & 0xff]);
								int i_2309_ = ((i_2308_ & 0xff00ff) * anInt8904 & ~0xff00ff);
								int i_2310_ = ((i_2308_ & 0xff00) * anInt8904 & 0xff0000);
								is[i_2298_] = ((i_2309_ | i_2310_) >>> 8) + anInt8911;
							} else
								throw new IllegalArgumentException();
						} else if (i_1805_ == 1) {
							if (i == 1) {
								int i_2311_ = aByteArray11392[i_2297_];
								if (i_2311_ != 0)
									is[i_2298_] = anIntArray11393[i_2311_ & 0xff];
							} else if (i == 0) {
								int i_2312_ = aByteArray11392[i_2297_];
								if (i_2312_ != 0) {
									int i_2313_ = anIntArray11393[i_2312_ & 0xff];
									if ((anInt8894 & 0xffffff) == 16777215) {
										int i_2314_ = anInt8894 >>> 24;
										int i_2315_ = 256 - i_2314_;
										int i_2316_ = is[i_2298_];
										is[i_2298_] = ((((i_2313_ & 0xff00ff) * i_2314_ + ((i_2316_ & 0xff00ff) * i_2315_)) & ~0xff00ff) + (((i_2313_ & 0xff00) * i_2314_ + ((i_2316_ & 0xff00) * i_2315_)) & 0xff0000)) >> 8;
									} else if (anInt8904 != 255) {
										int i_2317_ = ((i_2313_ & 0xff0000) * anInt8906 & ~0xffffff);
										int i_2318_ = ((i_2313_ & 0xff00) * anInt8907 & 0xff0000);
										int i_2319_ = ((i_2313_ & 0xff) * anInt8908 & 0xff00);
										i_2313_ = (i_2317_ | i_2318_ | i_2319_) >>> 8;
										int i_2320_ = is[i_2298_];
										is[i_2298_] = (((((i_2313_ & 0xff00ff) * anInt8904) + ((i_2320_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_2313_ & 0xff00) * anInt8904) + ((i_2320_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
									} else {
										int i_2321_ = ((i_2313_ & 0xff0000) * anInt8906 & ~0xffffff);
										int i_2322_ = ((i_2313_ & 0xff00) * anInt8907 & 0xff0000);
										int i_2323_ = ((i_2313_ & 0xff) * anInt8908 & 0xff00);
										is[i_2298_] = (i_2321_ | i_2322_ | i_2323_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_2324_ = aByteArray11392[i_2297_];
								int i_2325_ = (i_2324_ > 0 ? anIntArray11393[i_2324_] : 0);
								int i_2326_ = anInt8894;
								int i_2327_ = i_2325_ + i_2326_;
								int i_2328_ = ((i_2325_ & 0xff00ff) + (i_2326_ & 0xff00ff));
								int i_2329_ = ((i_2328_ & 0x1000100) + (i_2327_ - i_2328_ & 0x10000));
								i_2329_ = i_2327_ - i_2329_ | i_2329_ - (i_2329_ >>> 8);
								if (i_2325_ == 0 && anInt8904 != 255) {
									i_2325_ = i_2329_;
									i_2329_ = is[i_2298_];
									i_2329_ = ((((i_2325_ & 0xff00ff) * anInt8904 + ((i_2329_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + (((i_2325_ & 0xff00) * anInt8904 + ((i_2329_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
								}
								is[i_2298_] = i_2329_;
							} else if (i == 2) {
								int i_2330_ = aByteArray11392[i_2297_];
								if (i_2330_ != 0) {
									int i_2331_ = anIntArray11393[i_2330_ & 0xff];
									int i_2332_ = ((i_2331_ & 0xff00ff) * anInt8904 & ~0xff00ff);
									int i_2333_ = ((i_2331_ & 0xff00) * anInt8904 & 0xff0000);
									is[i_2298_++] = ((i_2332_ | i_2333_) >>> 8) + anInt8911;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_1805_ == 2) {
							if (i == 1) {
								int i_2334_ = aByteArray11392[i_2297_];
								if (i_2334_ != 0) {
									int i_2335_ = anIntArray11393[i_2334_ & 0xff];
									int i_2336_ = is[i_2298_];
									int i_2337_ = i_2335_ + i_2336_;
									int i_2338_ = ((i_2335_ & 0xff00ff) + (i_2336_ & 0xff00ff));
									i_2336_ = ((i_2338_ & 0x1000100) + (i_2337_ - i_2338_ & 0x10000));
									is[i_2298_] = (i_2337_ - i_2336_ | i_2336_ - (i_2336_ >>> 8));
								}
							} else if (i == 0) {
								int i_2339_ = aByteArray11392[i_2297_];
								if (i_2339_ != 0) {
									int i_2340_ = anIntArray11393[i_2339_ & 0xff];
									int i_2341_ = ((i_2340_ & 0xff0000) * anInt8906 & ~0xffffff);
									int i_2342_ = ((i_2340_ & 0xff00) * anInt8907 & 0xff0000);
									int i_2343_ = ((i_2340_ & 0xff) * anInt8908 & 0xff00);
									i_2340_ = (i_2341_ | i_2342_ | i_2343_) >>> 8;
									int i_2344_ = is[i_2298_];
									int i_2345_ = i_2340_ + i_2344_;
									int i_2346_ = ((i_2340_ & 0xff00ff) + (i_2344_ & 0xff00ff));
									i_2344_ = ((i_2346_ & 0x1000100) + (i_2345_ - i_2346_ & 0x10000));
									is[i_2298_] = (i_2345_ - i_2344_ | i_2344_ - (i_2344_ >>> 8));
								}
							} else if (i == 3) {
								byte i_2347_ = aByteArray11392[i_2297_];
								int i_2348_ = (i_2347_ > 0 ? anIntArray11393[i_2347_] : 0);
								int i_2349_ = anInt8894;
								int i_2350_ = i_2348_ + i_2349_;
								int i_2351_ = ((i_2348_ & 0xff00ff) + (i_2349_ & 0xff00ff));
								int i_2352_ = ((i_2351_ & 0x1000100) + (i_2350_ - i_2351_ & 0x10000));
								i_2352_ = i_2350_ - i_2352_ | i_2352_ - (i_2352_ >>> 8);
								if (i_2348_ == 0 && anInt8904 != 255) {
									i_2348_ = i_2352_;
									i_2352_ = is[i_2298_];
									i_2352_ = ((((i_2348_ & 0xff00ff) * anInt8904 + ((i_2352_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + (((i_2348_ & 0xff00) * anInt8904 + ((i_2352_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
								}
								is[i_2298_] = i_2352_;
							} else if (i == 2) {
								int i_2353_ = aByteArray11392[i_2297_];
								if (i_2353_ != 0) {
									int i_2354_ = anIntArray11393[i_2353_ & 0xff];
									int i_2355_ = ((i_2354_ & 0xff00ff) * anInt8904 & ~0xff00ff);
									int i_2356_ = ((i_2354_ & 0xff00) * anInt8904 & 0xff0000);
									i_2354_ = (((i_2355_ | i_2356_) >>> 8) + anInt8911);
									int i_2357_ = is[i_2298_];
									int i_2358_ = i_2354_ + i_2357_;
									int i_2359_ = ((i_2354_ & 0xff00ff) + (i_2357_ & 0xff00ff));
									i_2357_ = ((i_2359_ & 0x1000100) + (i_2358_ - i_2359_ & 0x10000));
									is[i_2298_] = (i_2358_ - i_2357_ | i_2357_ - (i_2357_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_2292_ += anInt8893;
						i_2293_ += anInt8909;
					}
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else {
				for (int i_2360_ = anInt8903; i_2360_ < 0; i_2360_++) {
					int i_2361_ = anInt8892;
					int i_2362_ = anInt8899 + anInt8890;
					int i_2363_ = anInt8900 + anInt8902;
					int i_2364_ = anInt8888;
					if (i_2362_ < 0) {
						int i_2365_ = (anInt8893 - 1 - i_2362_) / anInt8893;
						i_2364_ += i_2365_;
						i_2362_ += anInt8893 * i_2365_;
						i_2363_ += anInt8909 * i_2365_;
						i_2361_ += i_2365_;
					}
					int i_2366_;
					if ((i_2366_ = (1 + i_2362_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_2364_)
						i_2364_ = i_2366_;
					if (i_2363_ < 0) {
						i_2366_ = (anInt8909 - 1 - i_2363_) / anInt8909;
						i_2364_ += i_2366_;
						i_2362_ += anInt8893 * i_2366_;
						i_2363_ += anInt8909 * i_2366_;
						i_2361_ += i_2366_;
					}
					if ((i_2366_ = (1 + i_2363_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_2364_)
						i_2364_ = i_2366_;
					for (/**/; i_2364_ < 0; i_2364_++) {
						int i_2367_ = (i_2363_ >> 12) * anInt8877 + (i_2362_ >> 12);
						int i_2368_ = i_2361_++;
						if (i_1805_ == 0) {
							if (i == 1)
								is[i_2368_] = (anIntArray11393[aByteArray11392[i_2367_] & 0xff]);
							else if (i == 0) {
								int i_2369_ = (anIntArray11393[aByteArray11392[i_2367_] & 0xff]);
								int i_2370_ = ((i_2369_ & 0xff0000) * anInt8906 & ~0xffffff);
								int i_2371_ = ((i_2369_ & 0xff00) * anInt8907 & 0xff0000);
								int i_2372_ = (i_2369_ & 0xff) * anInt8908 & 0xff00;
								is[i_2368_] = (i_2370_ | i_2371_ | i_2372_) >>> 8;
							} else if (i == 3) {
								int i_2373_ = (anIntArray11393[aByteArray11392[i_2367_] & 0xff]);
								int i_2374_ = anInt8894;
								int i_2375_ = i_2373_ + i_2374_;
								int i_2376_ = ((i_2373_ & 0xff00ff) + (i_2374_ & 0xff00ff));
								int i_2377_ = ((i_2376_ & 0x1000100) + (i_2375_ - i_2376_ & 0x10000));
								is[i_2368_] = i_2375_ - i_2377_ | i_2377_ - (i_2377_ >>> 8);
							} else if (i == 2) {
								int i_2378_ = (anIntArray11393[aByteArray11392[i_2367_] & 0xff]);
								int i_2379_ = ((i_2378_ & 0xff00ff) * anInt8904 & ~0xff00ff);
								int i_2380_ = ((i_2378_ & 0xff00) * anInt8904 & 0xff0000);
								is[i_2368_] = ((i_2379_ | i_2380_) >>> 8) + anInt8911;
							} else
								throw new IllegalArgumentException();
						} else if (i_1805_ == 1) {
							if (i == 1) {
								int i_2381_ = aByteArray11392[i_2367_];
								if (i_2381_ != 0)
									is[i_2368_] = anIntArray11393[i_2381_ & 0xff];
							} else if (i == 0) {
								int i_2382_ = aByteArray11392[i_2367_];
								if (i_2382_ != 0) {
									int i_2383_ = anIntArray11393[i_2382_ & 0xff];
									if ((anInt8894 & 0xffffff) == 16777215) {
										int i_2384_ = anInt8894 >>> 24;
										int i_2385_ = 256 - i_2384_;
										int i_2386_ = is[i_2368_];
										is[i_2368_] = ((((i_2383_ & 0xff00ff) * i_2384_ + ((i_2386_ & 0xff00ff) * i_2385_)) & ~0xff00ff) + (((i_2383_ & 0xff00) * i_2384_ + ((i_2386_ & 0xff00) * i_2385_)) & 0xff0000)) >> 8;
									} else if (anInt8904 != 255) {
										int i_2387_ = ((i_2383_ & 0xff0000) * anInt8906 & ~0xffffff);
										int i_2388_ = ((i_2383_ & 0xff00) * anInt8907 & 0xff0000);
										int i_2389_ = ((i_2383_ & 0xff) * anInt8908 & 0xff00);
										i_2383_ = (i_2387_ | i_2388_ | i_2389_) >>> 8;
										int i_2390_ = is[i_2368_];
										is[i_2368_] = (((((i_2383_ & 0xff00ff) * anInt8904) + ((i_2390_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + ((((i_2383_ & 0xff00) * anInt8904) + ((i_2390_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
									} else {
										int i_2391_ = ((i_2383_ & 0xff0000) * anInt8906 & ~0xffffff);
										int i_2392_ = ((i_2383_ & 0xff00) * anInt8907 & 0xff0000);
										int i_2393_ = ((i_2383_ & 0xff) * anInt8908 & 0xff00);
										is[i_2368_] = (i_2391_ | i_2392_ | i_2393_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_2394_ = aByteArray11392[i_2367_];
								int i_2395_ = (i_2394_ > 0 ? anIntArray11393[i_2394_] : 0);
								int i_2396_ = anInt8894;
								int i_2397_ = i_2395_ + i_2396_;
								int i_2398_ = ((i_2395_ & 0xff00ff) + (i_2396_ & 0xff00ff));
								int i_2399_ = ((i_2398_ & 0x1000100) + (i_2397_ - i_2398_ & 0x10000));
								i_2399_ = i_2397_ - i_2399_ | i_2399_ - (i_2399_ >>> 8);
								if (i_2395_ == 0 && anInt8904 != 255) {
									i_2395_ = i_2399_;
									i_2399_ = is[i_2368_];
									i_2399_ = ((((i_2395_ & 0xff00ff) * anInt8904 + ((i_2399_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + (((i_2395_ & 0xff00) * anInt8904 + ((i_2399_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
								}
								is[i_2368_] = i_2399_;
							} else if (i == 2) {
								int i_2400_ = aByteArray11392[i_2367_];
								if (i_2400_ != 0) {
									int i_2401_ = anIntArray11393[i_2400_ & 0xff];
									int i_2402_ = ((i_2401_ & 0xff00ff) * anInt8904 & ~0xff00ff);
									int i_2403_ = ((i_2401_ & 0xff00) * anInt8904 & 0xff0000);
									is[i_2368_++] = ((i_2402_ | i_2403_) >>> 8) + anInt8911;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_1805_ == 2) {
							if (i == 1) {
								int i_2404_ = aByteArray11392[i_2367_];
								if (i_2404_ != 0) {
									int i_2405_ = anIntArray11393[i_2404_ & 0xff];
									int i_2406_ = is[i_2368_];
									int i_2407_ = i_2405_ + i_2406_;
									int i_2408_ = ((i_2405_ & 0xff00ff) + (i_2406_ & 0xff00ff));
									i_2406_ = ((i_2408_ & 0x1000100) + (i_2407_ - i_2408_ & 0x10000));
									is[i_2368_] = (i_2407_ - i_2406_ | i_2406_ - (i_2406_ >>> 8));
								}
							} else if (i == 0) {
								int i_2409_ = aByteArray11392[i_2367_];
								if (i_2409_ != 0) {
									int i_2410_ = anIntArray11393[i_2409_ & 0xff];
									int i_2411_ = ((i_2410_ & 0xff0000) * anInt8906 & ~0xffffff);
									int i_2412_ = ((i_2410_ & 0xff00) * anInt8907 & 0xff0000);
									int i_2413_ = ((i_2410_ & 0xff) * anInt8908 & 0xff00);
									i_2410_ = (i_2411_ | i_2412_ | i_2413_) >>> 8;
									int i_2414_ = is[i_2368_];
									int i_2415_ = i_2410_ + i_2414_;
									int i_2416_ = ((i_2410_ & 0xff00ff) + (i_2414_ & 0xff00ff));
									i_2414_ = ((i_2416_ & 0x1000100) + (i_2415_ - i_2416_ & 0x10000));
									is[i_2368_] = (i_2415_ - i_2414_ | i_2414_ - (i_2414_ >>> 8));
								}
							} else if (i == 3) {
								byte i_2417_ = aByteArray11392[i_2367_];
								int i_2418_ = (i_2417_ > 0 ? anIntArray11393[i_2417_] : 0);
								int i_2419_ = anInt8894;
								int i_2420_ = i_2418_ + i_2419_;
								int i_2421_ = ((i_2418_ & 0xff00ff) + (i_2419_ & 0xff00ff));
								int i_2422_ = ((i_2421_ & 0x1000100) + (i_2420_ - i_2421_ & 0x10000));
								i_2422_ = i_2420_ - i_2422_ | i_2422_ - (i_2422_ >>> 8);
								if (i_2418_ == 0 && anInt8904 != 255) {
									i_2418_ = i_2422_;
									i_2422_ = is[i_2368_];
									i_2422_ = ((((i_2418_ & 0xff00ff) * anInt8904 + ((i_2422_ & 0xff00ff) * anInt8905)) & ~0xff00ff) + (((i_2418_ & 0xff00) * anInt8904 + ((i_2422_ & 0xff00) * anInt8905)) & 0xff0000)) >> 8;
								}
								is[i_2368_] = i_2422_;
							} else if (i == 2) {
								int i_2423_ = aByteArray11392[i_2367_];
								if (i_2423_ != 0) {
									int i_2424_ = anIntArray11393[i_2423_ & 0xff];
									int i_2425_ = ((i_2424_ & 0xff00ff) * anInt8904 & ~0xff00ff);
									int i_2426_ = ((i_2424_ & 0xff00) * anInt8904 & 0xff0000);
									i_2424_ = (((i_2425_ | i_2426_) >>> 8) + anInt8911);
									int i_2427_ = is[i_2368_];
									int i_2428_ = i_2424_ + i_2427_;
									int i_2429_ = ((i_2424_ & 0xff00ff) + (i_2427_ & 0xff00ff));
									i_2427_ = ((i_2429_ & 0x1000100) + (i_2428_ - i_2429_ & 0x10000));
									is[i_2368_] = (i_2428_ - i_2427_ | i_2427_ - (i_2427_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_2362_ += anInt8893;
						i_2363_ += anInt8909;
					}
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			}
		}
	}

	void method14429(int[] is, int[] is_2430_, int i, int i_2431_) {
		int[] is_2432_ = aClass180_Sub1_8876.anIntArray9386;
		if (is_2432_ != null) {
			if (anInt8893 == 0) {
				if (anInt8909 == 0) {
					int i_2433_ = anInt8903;
					while (i_2433_ < 0) {
						int i_2434_ = i_2433_ + i_2431_;
						if (i_2434_ >= 0) {
							if (i_2434_ >= is.length)
								break;
							int i_2435_ = anInt8892;
							int i_2436_ = anInt8899;
							int i_2437_ = anInt8900;
							int i_2438_ = anInt8888;
							if (i_2436_ >= 0 && i_2437_ >= 0 && i_2436_ - (anInt8877 << 12) < 0 && i_2437_ - (anInt8880 << 12) < 0) {
								int i_2439_ = is[i_2434_] - i;
								int i_2440_ = -is_2430_[i_2434_];
								int i_2441_ = i_2439_ - (i_2435_ - anInt8892);
								if (i_2441_ > 0) {
									i_2435_ += i_2441_;
									i_2438_ += i_2441_;
									i_2436_ += anInt8893 * i_2441_;
									i_2437_ += anInt8909 * i_2441_;
								} else
									i_2440_ -= i_2441_;
								if (i_2438_ < i_2440_)
									i_2438_ = i_2440_;
								for (/**/; i_2438_ < 0; i_2438_++) {
									int i_2442_ = (aByteArray11392[((i_2437_ >> 12) * anInt8877 + (i_2436_ >> 12))]);
									if (i_2442_ != 0)
										is_2432_[i_2435_++] = anIntArray11393[i_2442_ & 0xff];
									else
										i_2435_++;
								}
							}
						}
						i_2433_++;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_2443_ = anInt8903;
					while (i_2443_ < 0) {
						int i_2444_ = i_2443_ + i_2431_;
						if (i_2444_ >= 0) {
							if (i_2444_ >= is.length)
								break;
							int i_2445_ = anInt8892;
							int i_2446_ = anInt8899;
							int i_2447_ = anInt8900 + anInt8902;
							int i_2448_ = anInt8888;
							if (i_2446_ >= 0 && i_2446_ - (anInt8877 << 12) < 0) {
								int i_2449_;
								if ((i_2449_ = i_2447_ - (anInt8880 << 12)) >= 0) {
									i_2449_ = (anInt8909 - i_2449_) / anInt8909;
									i_2448_ += i_2449_;
									i_2447_ += anInt8909 * i_2449_;
									i_2445_ += i_2449_;
								}
								if ((i_2449_ = (i_2447_ - anInt8909) / anInt8909) > i_2448_)
									i_2448_ = i_2449_;
								int i_2450_ = is[i_2444_] - i;
								int i_2451_ = -is_2430_[i_2444_];
								int i_2452_ = i_2450_ - (i_2445_ - anInt8892);
								if (i_2452_ > 0) {
									i_2445_ += i_2452_;
									i_2448_ += i_2452_;
									i_2446_ += anInt8893 * i_2452_;
									i_2447_ += anInt8909 * i_2452_;
								} else
									i_2451_ -= i_2452_;
								if (i_2448_ < i_2451_)
									i_2448_ = i_2451_;
								for (/**/; i_2448_ < 0; i_2448_++) {
									int i_2453_ = (aByteArray11392[((i_2447_ >> 12) * anInt8877 + (i_2446_ >> 12))]);
									if (i_2453_ != 0)
										is_2432_[i_2445_++] = anIntArray11393[i_2453_ & 0xff];
									else
										i_2445_++;
									i_2447_ += anInt8909;
								}
							}
						}
						i_2443_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				} else {
					int i_2454_ = anInt8903;
					while (i_2454_ < 0) {
						int i_2455_ = i_2454_ + i_2431_;
						if (i_2455_ >= 0) {
							if (i_2455_ >= is.length)
								break;
							int i_2456_ = anInt8892;
							int i_2457_ = anInt8899;
							int i_2458_ = anInt8900 + anInt8902;
							int i_2459_ = anInt8888;
							if (i_2457_ >= 0 && i_2457_ - (anInt8877 << 12) < 0) {
								if (i_2458_ < 0) {
									int i_2460_ = ((anInt8909 - 1 - i_2458_) / anInt8909);
									i_2459_ += i_2460_;
									i_2458_ += anInt8909 * i_2460_;
									i_2456_ += i_2460_;
								}
								int i_2461_;
								if ((i_2461_ = (1 + i_2458_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_2459_)
									i_2459_ = i_2461_;
								int i_2462_ = is[i_2455_] - i;
								int i_2463_ = -is_2430_[i_2455_];
								int i_2464_ = i_2462_ - (i_2456_ - anInt8892);
								if (i_2464_ > 0) {
									i_2456_ += i_2464_;
									i_2459_ += i_2464_;
									i_2457_ += anInt8893 * i_2464_;
									i_2458_ += anInt8909 * i_2464_;
								} else
									i_2463_ -= i_2464_;
								if (i_2459_ < i_2463_)
									i_2459_ = i_2463_;
								for (/**/; i_2459_ < 0; i_2459_++) {
									int i_2465_ = (aByteArray11392[((i_2458_ >> 12) * anInt8877 + (i_2457_ >> 12))]);
									if (i_2465_ != 0)
										is_2432_[i_2456_++] = anIntArray11393[i_2465_ & 0xff];
									else
										i_2456_++;
									i_2458_ += anInt8909;
								}
							}
						}
						i_2454_++;
						anInt8899 += anInt8881;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8893 < 0) {
				if (anInt8909 == 0) {
					int i_2466_ = anInt8903;
					while (i_2466_ < 0) {
						int i_2467_ = i_2466_ + i_2431_;
						if (i_2467_ >= 0) {
							if (i_2467_ >= is.length)
								break;
							int i_2468_ = anInt8892;
							int i_2469_ = anInt8899 + anInt8890;
							int i_2470_ = anInt8900;
							int i_2471_ = anInt8888;
							if (i_2470_ >= 0 && i_2470_ - (anInt8880 << 12) < 0) {
								int i_2472_;
								if ((i_2472_ = i_2469_ - (anInt8877 << 12)) >= 0) {
									i_2472_ = (anInt8893 - i_2472_) / anInt8893;
									i_2471_ += i_2472_;
									i_2469_ += anInt8893 * i_2472_;
									i_2468_ += i_2472_;
								}
								if ((i_2472_ = (i_2469_ - anInt8893) / anInt8893) > i_2471_)
									i_2471_ = i_2472_;
								int i_2473_ = is[i_2467_] - i;
								int i_2474_ = -is_2430_[i_2467_];
								int i_2475_ = i_2473_ - (i_2468_ - anInt8892);
								if (i_2475_ > 0) {
									i_2468_ += i_2475_;
									i_2471_ += i_2475_;
									i_2469_ += anInt8893 * i_2475_;
									i_2470_ += anInt8909 * i_2475_;
								} else
									i_2474_ -= i_2475_;
								if (i_2471_ < i_2474_)
									i_2471_ = i_2474_;
								for (/**/; i_2471_ < 0; i_2471_++) {
									int i_2476_ = (aByteArray11392[((i_2470_ >> 12) * anInt8877 + (i_2469_ >> 12))]);
									if (i_2476_ != 0)
										is_2432_[i_2468_++] = anIntArray11393[i_2476_ & 0xff];
									else
										i_2468_++;
									i_2469_ += anInt8893;
								}
							}
						}
						i_2466_++;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else if (anInt8909 < 0) {
					int i_2477_ = anInt8903;
					while (i_2477_ < 0) {
						int i_2478_ = i_2477_ + i_2431_;
						if (i_2478_ >= 0) {
							if (i_2478_ >= is.length)
								break;
							int i_2479_ = anInt8892;
							int i_2480_ = anInt8899 + anInt8890;
							int i_2481_ = anInt8900 + anInt8902;
							int i_2482_ = anInt8888;
							int i_2483_;
							if ((i_2483_ = i_2480_ - (anInt8877 << 12)) >= 0) {
								i_2483_ = (anInt8893 - i_2483_) / anInt8893;
								i_2482_ += i_2483_;
								i_2480_ += anInt8893 * i_2483_;
								i_2481_ += anInt8909 * i_2483_;
								i_2479_ += i_2483_;
							}
							if ((i_2483_ = (i_2480_ - anInt8893) / anInt8893) > i_2482_)
								i_2482_ = i_2483_;
							if ((i_2483_ = i_2481_ - (anInt8880 << 12)) >= 0) {
								i_2483_ = (anInt8909 - i_2483_) / anInt8909;
								i_2482_ += i_2483_;
								i_2480_ += anInt8893 * i_2483_;
								i_2481_ += anInt8909 * i_2483_;
								i_2479_ += i_2483_;
							}
							if ((i_2483_ = (i_2481_ - anInt8909) / anInt8909) > i_2482_)
								i_2482_ = i_2483_;
							int i_2484_ = is[i_2478_] - i;
							int i_2485_ = -is_2430_[i_2478_];
							int i_2486_ = i_2484_ - (i_2479_ - anInt8892);
							if (i_2486_ > 0) {
								i_2479_ += i_2486_;
								i_2482_ += i_2486_;
								i_2480_ += anInt8893 * i_2486_;
								i_2481_ += anInt8909 * i_2486_;
							} else
								i_2485_ -= i_2486_;
							if (i_2482_ < i_2485_)
								i_2482_ = i_2485_;
							for (/**/; i_2482_ < 0; i_2482_++) {
								int i_2487_ = (aByteArray11392[((i_2481_ >> 12) * anInt8877 + (i_2480_ >> 12))]);
								if (i_2487_ != 0)
									is_2432_[i_2479_++] = anIntArray11393[i_2487_ & 0xff];
								else
									i_2479_++;
								i_2480_ += anInt8893;
								i_2481_ += anInt8909;
							}
						}
						i_2477_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				} else {
					int i_2488_ = anInt8903;
					while (i_2488_ < 0) {
						int i_2489_ = i_2488_ + i_2431_;
						if (i_2489_ >= 0) {
							if (i_2489_ >= is.length)
								break;
							int i_2490_ = anInt8892;
							int i_2491_ = anInt8899 + anInt8890;
							int i_2492_ = anInt8900 + anInt8902;
							int i_2493_ = anInt8888;
							int i_2494_;
							if ((i_2494_ = i_2491_ - (anInt8877 << 12)) >= 0) {
								i_2494_ = (anInt8893 - i_2494_) / anInt8893;
								i_2493_ += i_2494_;
								i_2491_ += anInt8893 * i_2494_;
								i_2492_ += anInt8909 * i_2494_;
								i_2490_ += i_2494_;
							}
							if ((i_2494_ = (i_2491_ - anInt8893) / anInt8893) > i_2493_)
								i_2493_ = i_2494_;
							if (i_2492_ < 0) {
								i_2494_ = (anInt8909 - 1 - i_2492_) / anInt8909;
								i_2493_ += i_2494_;
								i_2491_ += anInt8893 * i_2494_;
								i_2492_ += anInt8909 * i_2494_;
								i_2490_ += i_2494_;
							}
							if ((i_2494_ = (1 + i_2492_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_2493_)
								i_2493_ = i_2494_;
							int i_2495_ = is[i_2489_] - i;
							int i_2496_ = -is_2430_[i_2489_];
							int i_2497_ = i_2495_ - (i_2490_ - anInt8892);
							if (i_2497_ > 0) {
								i_2490_ += i_2497_;
								i_2493_ += i_2497_;
								i_2491_ += anInt8893 * i_2497_;
								i_2492_ += anInt8909 * i_2497_;
							} else
								i_2496_ -= i_2497_;
							if (i_2493_ < i_2496_)
								i_2493_ = i_2496_;
							for (/**/; i_2493_ < 0; i_2493_++) {
								int i_2498_ = (aByteArray11392[((i_2492_ >> 12) * anInt8877 + (i_2491_ >> 12))]);
								if (i_2498_ != 0)
									is_2432_[i_2490_++] = anIntArray11393[i_2498_ & 0xff];
								else
									i_2490_++;
								i_2491_ += anInt8893;
								i_2492_ += anInt8909;
							}
						}
						i_2488_++;
						anInt8899 += anInt8881;
						anInt8900 += anInt8885;
						anInt8892 += anInt8886;
					}
				}
			} else if (anInt8909 == 0) {
				int i_2499_ = anInt8903;
				while (i_2499_ < 0) {
					int i_2500_ = i_2499_ + i_2431_;
					if (i_2500_ >= 0) {
						if (i_2500_ >= is.length)
							break;
						int i_2501_ = anInt8892;
						int i_2502_ = anInt8899 + anInt8890;
						int i_2503_ = anInt8900;
						int i_2504_ = anInt8888;
						if (i_2503_ >= 0 && i_2503_ - (anInt8880 << 12) < 0) {
							if (i_2502_ < 0) {
								int i_2505_ = (anInt8893 - 1 - i_2502_) / anInt8893;
								i_2504_ += i_2505_;
								i_2502_ += anInt8893 * i_2505_;
								i_2501_ += i_2505_;
							}
							int i_2506_;
							if ((i_2506_ = (1 + i_2502_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_2504_)
								i_2504_ = i_2506_;
							int i_2507_ = is[i_2500_] - i;
							int i_2508_ = -is_2430_[i_2500_];
							int i_2509_ = i_2507_ - (i_2501_ - anInt8892);
							if (i_2509_ > 0) {
								i_2501_ += i_2509_;
								i_2504_ += i_2509_;
								i_2502_ += anInt8893 * i_2509_;
								i_2503_ += anInt8909 * i_2509_;
							} else
								i_2508_ -= i_2509_;
							if (i_2504_ < i_2508_)
								i_2504_ = i_2508_;
							for (/**/; i_2504_ < 0; i_2504_++) {
								int i_2510_ = (aByteArray11392[((i_2503_ >> 12) * anInt8877 + (i_2502_ >> 12))]);
								if (i_2510_ != 0)
									is_2432_[i_2501_++] = anIntArray11393[i_2510_ & 0xff];
								else
									i_2501_++;
								i_2502_ += anInt8893;
							}
						}
					}
					i_2499_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else if (anInt8909 < 0) {
				int i_2511_ = anInt8903;
				while (i_2511_ < 0) {
					int i_2512_ = i_2511_ + i_2431_;
					if (i_2512_ >= 0) {
						if (i_2512_ >= is.length)
							break;
						int i_2513_ = anInt8892;
						int i_2514_ = anInt8899 + anInt8890;
						int i_2515_ = anInt8900 + anInt8902;
						int i_2516_ = anInt8888;
						if (i_2514_ < 0) {
							int i_2517_ = (anInt8893 - 1 - i_2514_) / anInt8893;
							i_2516_ += i_2517_;
							i_2514_ += anInt8893 * i_2517_;
							i_2515_ += anInt8909 * i_2517_;
							i_2513_ += i_2517_;
						}
						int i_2518_;
						if ((i_2518_ = (1 + i_2514_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_2516_)
							i_2516_ = i_2518_;
						if ((i_2518_ = i_2515_ - (anInt8880 << 12)) >= 0) {
							i_2518_ = (anInt8909 - i_2518_) / anInt8909;
							i_2516_ += i_2518_;
							i_2514_ += anInt8893 * i_2518_;
							i_2515_ += anInt8909 * i_2518_;
							i_2513_ += i_2518_;
						}
						if ((i_2518_ = (i_2515_ - anInt8909) / anInt8909) > i_2516_)
							i_2516_ = i_2518_;
						int i_2519_ = is[i_2512_] - i;
						int i_2520_ = -is_2430_[i_2512_];
						int i_2521_ = i_2519_ - (i_2513_ - anInt8892);
						if (i_2521_ > 0) {
							i_2513_ += i_2521_;
							i_2516_ += i_2521_;
							i_2514_ += anInt8893 * i_2521_;
							i_2515_ += anInt8909 * i_2521_;
						} else
							i_2520_ -= i_2521_;
						if (i_2516_ < i_2520_)
							i_2516_ = i_2520_;
						for (/**/; i_2516_ < 0; i_2516_++) {
							int i_2522_ = (aByteArray11392[(i_2515_ >> 12) * anInt8877 + (i_2514_ >> 12)]);
							if (i_2522_ != 0)
								is_2432_[i_2513_++] = anIntArray11393[i_2522_ & 0xff];
							else
								i_2513_++;
							i_2514_ += anInt8893;
							i_2515_ += anInt8909;
						}
					}
					i_2511_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			} else {
				int i_2523_ = anInt8903;
				while (i_2523_ < 0) {
					int i_2524_ = i_2523_ + i_2431_;
					if (i_2524_ >= 0) {
						if (i_2524_ >= is.length)
							break;
						int i_2525_ = anInt8892;
						int i_2526_ = anInt8899 + anInt8890;
						int i_2527_ = anInt8900 + anInt8902;
						int i_2528_ = anInt8888;
						if (i_2526_ < 0) {
							int i_2529_ = (anInt8893 - 1 - i_2526_) / anInt8893;
							i_2528_ += i_2529_;
							i_2526_ += anInt8893 * i_2529_;
							i_2527_ += anInt8909 * i_2529_;
							i_2525_ += i_2529_;
						}
						int i_2530_;
						if ((i_2530_ = (1 + i_2526_ - (anInt8877 << 12) - anInt8893) / anInt8893) > i_2528_)
							i_2528_ = i_2530_;
						if (i_2527_ < 0) {
							i_2530_ = (anInt8909 - 1 - i_2527_) / anInt8909;
							i_2528_ += i_2530_;
							i_2526_ += anInt8893 * i_2530_;
							i_2527_ += anInt8909 * i_2530_;
							i_2525_ += i_2530_;
						}
						if ((i_2530_ = (1 + i_2527_ - (anInt8880 << 12) - anInt8909) / anInt8909) > i_2528_)
							i_2528_ = i_2530_;
						int i_2531_ = is[i_2524_] - i;
						int i_2532_ = -is_2430_[i_2524_];
						int i_2533_ = i_2531_ - (i_2525_ - anInt8892);
						if (i_2533_ > 0) {
							i_2525_ += i_2533_;
							i_2528_ += i_2533_;
							i_2526_ += anInt8893 * i_2533_;
							i_2527_ += anInt8909 * i_2533_;
						} else
							i_2532_ -= i_2533_;
						if (i_2528_ < i_2532_)
							i_2528_ = i_2532_;
						for (/**/; i_2528_ < 0; i_2528_++) {
							int i_2534_ = (aByteArray11392[(i_2527_ >> 12) * anInt8877 + (i_2526_ >> 12)]);
							if (i_2534_ != 0)
								is_2432_[i_2525_++] = anIntArray11393[i_2534_ & 0xff];
							else
								i_2525_++;
							i_2526_ += anInt8893;
							i_2527_ += anInt8909;
						}
					}
					i_2523_++;
					anInt8899 += anInt8881;
					anInt8900 += anInt8885;
					anInt8892 += anInt8886;
				}
			}
		}
	}

	public void method2441(int i, int i_2535_, int i_2536_, int i_2537_, int[] is, int[] is_2538_, int i_2539_, int i_2540_) {
		throw new IllegalStateException();
	}

	public void method2435(int i, int i_2541_, int i_2542_, int i_2543_, int i_2544_, int i_2545_) {
		throw new IllegalStateException();
	}

	public Interface21 method2443() {
		throw new IllegalStateException();
	}

	public void method2438(int i, int i_2546_, Class142 class142, int i_2547_, int i_2548_) {
		if (aClass180_Sub1_8876.method14859())
			throw new IllegalStateException();
		int[] is = aClass180_Sub1_8876.anIntArray9386;
		if (is != null) {
			i += anInt8879;
			i_2546_ += anInt8895;
			int i_2549_ = 0;
			int i_2550_ = aClass180_Sub1_8876.anInt9387 * -1173855569;
			int i_2551_ = anInt8877;
			int i_2552_ = anInt8880;
			int i_2553_ = i_2550_ - i_2551_;
			int i_2554_ = 0;
			int i_2555_ = i + i_2546_ * i_2550_;
			if (i_2546_ < aClass180_Sub1_8876.anInt9392 * -456655989) {
				int i_2556_ = aClass180_Sub1_8876.anInt9392 * -456655989 - i_2546_;
				i_2552_ -= i_2556_;
				i_2546_ = aClass180_Sub1_8876.anInt9392 * -456655989;
				i_2549_ += i_2556_ * i_2551_;
				i_2555_ += i_2556_ * i_2550_;
			}
			if (i_2546_ + i_2552_ > aClass180_Sub1_8876.anInt9393 * -383695469)
				i_2552_ -= (i_2546_ + i_2552_ - aClass180_Sub1_8876.anInt9393 * -383695469);
			if (i < aClass180_Sub1_8876.anInt9383 * 1605202751) {
				int i_2557_ = aClass180_Sub1_8876.anInt9383 * 1605202751 - i;
				i_2551_ -= i_2557_;
				i = aClass180_Sub1_8876.anInt9383 * 1605202751;
				i_2549_ += i_2557_;
				i_2555_ += i_2557_;
				i_2554_ += i_2557_;
				i_2553_ += i_2557_;
			}
			if (i + i_2551_ > aClass180_Sub1_8876.anInt9391 * 2014358275) {
				int i_2558_ = i + i_2551_ - aClass180_Sub1_8876.anInt9391 * 2014358275;
				i_2551_ -= i_2558_;
				i_2554_ += i_2558_;
				i_2553_ += i_2558_;
			}
			if (i_2551_ > 0 && i_2552_ > 0) {
				Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
				int[] is_2559_ = class142_sub1.anIntArray9002;
				int[] is_2560_ = class142_sub1.anIntArray9003;
				int i_2561_ = i_2546_;
				if (i_2548_ > i_2561_) {
					i_2561_ = i_2548_;
					i_2555_ += (i_2548_ - i_2546_) * i_2550_;
					i_2549_ += (i_2548_ - i_2546_) * anInt8877;
				}
				int i_2562_ = (i_2548_ + is_2559_.length < i_2546_ + i_2552_ ? i_2548_ + is_2559_.length : i_2546_ + i_2552_);
				for (int i_2563_ = i_2561_; i_2563_ < i_2562_; i_2563_++) {
					int i_2564_ = is_2559_[i_2563_ - i_2548_] + i_2547_;
					int i_2565_ = is_2560_[i_2563_ - i_2548_];
					int i_2566_ = i_2551_;
					if (i > i_2564_) {
						int i_2567_ = i - i_2564_;
						if (i_2567_ >= i_2565_) {
							i_2549_ += i_2551_ + i_2554_;
							i_2555_ += i_2551_ + i_2553_;
							continue;
						}
						i_2565_ -= i_2567_;
					} else {
						int i_2568_ = i_2564_ - i;
						if (i_2568_ >= i_2551_) {
							i_2549_ += i_2551_ + i_2554_;
							i_2555_ += i_2551_ + i_2553_;
							continue;
						}
						i_2549_ += i_2568_;
						i_2566_ -= i_2568_;
						i_2555_ += i_2568_;
					}
					int i_2569_ = 0;
					if (i_2566_ < i_2565_)
						i_2565_ = i_2566_;
					else
						i_2569_ = i_2566_ - i_2565_;
					for (int i_2570_ = -i_2565_; i_2570_ < 0; i_2570_++) {
						int i_2571_ = aByteArray11392[i_2549_++];
						if (i_2571_ != 0)
							is[i_2555_++] = anIntArray11393[i_2571_ & 0xff];
						else
							i_2555_++;
					}
					i_2549_ += i_2569_ + i_2554_;
					i_2555_ += i_2569_ + i_2553_;
				}
			}
		}
	}
}
