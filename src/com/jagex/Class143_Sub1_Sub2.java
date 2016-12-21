/* Class143_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class143_Sub1_Sub2 extends Class143_Sub1 {
	int[] anIntArray11347;

	public void method1743(int i, int i_0_, int i_1_, int i_2_, int[] is, int i_3_, int i_4_) {
		i_4_ -= i_1_;
		for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
			int i_6_ = (i_0_ + i_5_) * i_1_ + i;
			for (int i_7_ = 0; i_7_ < i_1_; i_7_++)
				anIntArray11347[i_6_ + i_7_] = is[i_3_++];
			i_3_ += i_4_;
		}
	}

	public void method1756(int i, int i_8_, int i_9_, int i_10_, int i_11_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			int i_12_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			i += anInt8977;
			i_8_ += anInt8947;
			int i_13_ = i_8_ * i_12_ + i;
			int i_14_ = 0;
			int i_15_ = anInt8950;
			int i_16_ = anInt8945;
			int i_17_ = i_12_ - i_16_;
			int i_18_ = 0;
			if (i_8_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_19_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_8_;
				i_15_ -= i_19_;
				i_8_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_14_ += i_19_ * i_16_;
				i_13_ += i_19_ * i_12_;
			}
			if (i_8_ + i_15_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_15_ -= (i_8_ + i_15_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_20_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_16_ -= i_20_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_14_ += i_20_;
				i_13_ += i_20_;
				i_18_ += i_20_;
				i_17_ += i_20_;
			}
			if (i + i_16_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_21_ = i + i_16_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_16_ -= i_21_;
				i_18_ += i_21_;
				i_17_ += i_21_;
			}
			if (i_16_ > 0 && i_15_ > 0) {
				if (i_11_ == 0) {
					if (i_9_ == 1) {
						for (int i_22_ = -i_15_; i_22_ < 0; i_22_++) {
							int i_23_ = i_13_ + i_16_ - 3;
							while (i_13_ < i_23_) {
								is[i_13_++] = anIntArray11347[i_14_++];
								is[i_13_++] = anIntArray11347[i_14_++];
								is[i_13_++] = anIntArray11347[i_14_++];
								is[i_13_++] = anIntArray11347[i_14_++];
							}
							i_23_ += 3;
							while (i_13_ < i_23_)
								is[i_13_++] = anIntArray11347[i_14_++];
							i_13_ += i_17_;
							i_14_ += i_18_;
						}
					} else if (i_9_ == 0) {
						int i_24_ = (i_10_ & 0xff0000) >> 16;
						int i_25_ = (i_10_ & 0xff00) >> 8;
						int i_26_ = i_10_ & 0xff;
						for (int i_27_ = -i_15_; i_27_ < 0; i_27_++) {
							for (int i_28_ = -i_16_; i_28_ < 0; i_28_++) {
								int i_29_ = anIntArray11347[i_14_++];
								int i_30_ = (i_29_ & 0xff0000) * i_24_ & ~0xffffff;
								int i_31_ = (i_29_ & 0xff00) * i_25_ & 0xff0000;
								int i_32_ = (i_29_ & 0xff) * i_26_ & 0xff00;
								is[i_13_++] = (i_30_ | i_31_ | i_32_) >>> 8;
							}
							i_13_ += i_17_;
							i_14_ += i_18_;
						}
					} else if (i_9_ == 3) {
						for (int i_33_ = -i_15_; i_33_ < 0; i_33_++) {
							for (int i_34_ = -i_16_; i_34_ < 0; i_34_++) {
								int i_35_ = anIntArray11347[i_14_++];
								int i_36_ = i_35_ + i_10_;
								int i_37_ = (i_35_ & 0xff00ff) + (i_10_ & 0xff00ff);
								int i_38_ = ((i_37_ & 0x1000100) + (i_36_ - i_37_ & 0x10000));
								is[i_13_++] = i_36_ - i_38_ | i_38_ - (i_38_ >>> 8);
							}
							i_13_ += i_17_;
							i_14_ += i_18_;
						}
					} else if (i_9_ == 2) {
						int i_39_ = i_10_ >>> 24;
						int i_40_ = 256 - i_39_;
						int i_41_ = (i_10_ & 0xff00ff) * i_40_ & ~0xff00ff;
						int i_42_ = (i_10_ & 0xff00) * i_40_ & 0xff0000;
						i_10_ = (i_41_ | i_42_) >>> 8;
						for (int i_43_ = -i_15_; i_43_ < 0; i_43_++) {
							for (int i_44_ = -i_16_; i_44_ < 0; i_44_++) {
								int i_45_ = anIntArray11347[i_14_++];
								i_41_ = (i_45_ & 0xff00ff) * i_39_ & ~0xff00ff;
								i_42_ = (i_45_ & 0xff00) * i_39_ & 0xff0000;
								is[i_13_++] = ((i_41_ | i_42_) >>> 8) + i_10_;
							}
							i_13_ += i_17_;
							i_14_ += i_18_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_11_ == 1) {
					if (i_9_ == 1) {
						for (int i_46_ = -i_15_; i_46_ < 0; i_46_++) {
							int i_47_ = i_13_ + i_16_ - 3;
							while (i_13_ < i_47_) {
								int i_48_ = anIntArray11347[i_14_++];
								if (i_48_ != 0)
									is[i_13_++] = i_48_;
								else
									i_13_++;
								i_48_ = anIntArray11347[i_14_++];
								if (i_48_ != 0)
									is[i_13_++] = i_48_;
								else
									i_13_++;
								i_48_ = anIntArray11347[i_14_++];
								if (i_48_ != 0)
									is[i_13_++] = i_48_;
								else
									i_13_++;
								i_48_ = anIntArray11347[i_14_++];
								if (i_48_ != 0)
									is[i_13_++] = i_48_;
								else
									i_13_++;
							}
							i_47_ += 3;
							while (i_13_ < i_47_) {
								int i_49_ = anIntArray11347[i_14_++];
								if (i_49_ != 0)
									is[i_13_++] = i_49_;
								else
									i_13_++;
							}
							i_13_ += i_17_;
							i_14_ += i_18_;
						}
					} else if (i_9_ == 0) {
						if ((i_10_ & 0xffffff) == 16777215) {
							int i_50_ = i_10_ >>> 24;
							int i_51_ = 256 - i_50_;
							for (int i_52_ = -i_15_; i_52_ < 0; i_52_++) {
								for (int i_53_ = -i_16_; i_53_ < 0; i_53_++) {
									int i_54_ = anIntArray11347[i_14_++];
									if (i_54_ != 0) {
										int i_55_ = is[i_13_];
										is[i_13_++] = ((((i_54_ & 0xff00ff) * i_50_ + (i_55_ & 0xff00ff) * i_51_) & ~0xff00ff) + (((i_54_ & 0xff00) * i_50_ + (i_55_ & 0xff00) * i_51_) & 0xff0000)) >> 8;
									} else
										i_13_++;
								}
								i_13_ += i_17_;
								i_14_ += i_18_;
							}
						} else {
							int i_56_ = (i_10_ & 0xff0000) >> 16;
							int i_57_ = (i_10_ & 0xff00) >> 8;
							int i_58_ = i_10_ & 0xff;
							int i_59_ = i_10_ >>> 24;
							int i_60_ = 256 - i_59_;
							for (int i_61_ = -i_15_; i_61_ < 0; i_61_++) {
								for (int i_62_ = -i_16_; i_62_ < 0; i_62_++) {
									int i_63_ = anIntArray11347[i_14_++];
									if (i_63_ != 0) {
										if (i_59_ != 255) {
											int i_64_ = ((i_63_ & 0xff0000) * i_56_ & ~0xffffff);
											int i_65_ = ((i_63_ & 0xff00) * i_57_ & 0xff0000);
											int i_66_ = ((i_63_ & 0xff) * i_58_ & 0xff00);
											i_63_ = ((i_64_ | i_65_ | i_66_) >>> 8);
											int i_67_ = is[i_13_];
											is[i_13_++] = ((((i_63_ & 0xff00ff) * i_59_ + ((i_67_ & 0xff00ff) * i_60_)) & ~0xff00ff) + (((i_63_ & 0xff00) * i_59_ + ((i_67_ & 0xff00) * i_60_)) & 0xff0000)) >> 8;
										} else {
											int i_68_ = ((i_63_ & 0xff0000) * i_56_ & ~0xffffff);
											int i_69_ = ((i_63_ & 0xff00) * i_57_ & 0xff0000);
											int i_70_ = ((i_63_ & 0xff) * i_58_ & 0xff00);
											is[i_13_++] = (i_68_ | i_69_ | i_70_) >>> 8;
										}
									} else
										i_13_++;
								}
								i_13_ += i_17_;
								i_14_ += i_18_;
							}
						}
					} else if (i_9_ == 3) {
						int i_71_ = i_10_ >>> 24;
						int i_72_ = 256 - i_71_;
						for (int i_73_ = -i_15_; i_73_ < 0; i_73_++) {
							for (int i_74_ = -i_16_; i_74_ < 0; i_74_++) {
								int i_75_ = anIntArray11347[i_14_++];
								int i_76_ = i_75_ + i_10_;
								int i_77_ = (i_75_ & 0xff00ff) + (i_10_ & 0xff00ff);
								int i_78_ = ((i_77_ & 0x1000100) + (i_76_ - i_77_ & 0x10000));
								i_78_ = i_76_ - i_78_ | i_78_ - (i_78_ >>> 8);
								if (i_75_ == 0 && i_71_ != 255) {
									i_75_ = i_78_;
									i_78_ = is[i_13_];
									i_78_ = ((((i_75_ & 0xff00ff) * i_71_ + (i_78_ & 0xff00ff) * i_72_) & ~0xff00ff) + (((i_75_ & 0xff00) * i_71_ + (i_78_ & 0xff00) * i_72_) & 0xff0000)) >> 8;
								}
								is[i_13_++] = i_78_;
							}
							i_13_ += i_17_;
							i_14_ += i_18_;
						}
					} else if (i_9_ == 2) {
						int i_79_ = i_10_ >>> 24;
						int i_80_ = 256 - i_79_;
						int i_81_ = (i_10_ & 0xff00ff) * i_80_ & ~0xff00ff;
						int i_82_ = (i_10_ & 0xff00) * i_80_ & 0xff0000;
						i_10_ = (i_81_ | i_82_) >>> 8;
						for (int i_83_ = -i_15_; i_83_ < 0; i_83_++) {
							for (int i_84_ = -i_16_; i_84_ < 0; i_84_++) {
								int i_85_ = anIntArray11347[i_14_++];
								if (i_85_ != 0) {
									i_81_ = ((i_85_ & 0xff00ff) * i_79_ & ~0xff00ff);
									i_82_ = (i_85_ & 0xff00) * i_79_ & 0xff0000;
									is[i_13_++] = ((i_81_ | i_82_) >>> 8) + i_10_;
								} else
									i_13_++;
							}
							i_13_ += i_17_;
							i_14_ += i_18_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_11_ == 2) {
					if (i_9_ == 1) {
						for (int i_86_ = -i_15_; i_86_ < 0; i_86_++) {
							for (int i_87_ = -i_16_; i_87_ < 0; i_87_++) {
								int i_88_ = anIntArray11347[i_14_++];
								if (i_88_ != 0) {
									int i_89_ = is[i_13_];
									int i_90_ = i_88_ + i_89_;
									int i_91_ = ((i_88_ & 0xff00ff) + (i_89_ & 0xff00ff));
									i_89_ = (i_91_ & 0x1000100) + (i_90_ - i_91_ & 0x10000);
									is[i_13_++] = i_90_ - i_89_ | i_89_ - (i_89_ >>> 8);
								} else
									i_13_++;
							}
							i_13_ += i_17_;
							i_14_ += i_18_;
						}
					} else if (i_9_ == 0) {
						int i_92_ = (i_10_ & 0xff0000) >> 16;
						int i_93_ = (i_10_ & 0xff00) >> 8;
						int i_94_ = i_10_ & 0xff;
						for (int i_95_ = -i_15_; i_95_ < 0; i_95_++) {
							for (int i_96_ = -i_16_; i_96_ < 0; i_96_++) {
								int i_97_ = anIntArray11347[i_14_++];
								if (i_97_ != 0) {
									int i_98_ = ((i_97_ & 0xff0000) * i_92_ & ~0xffffff);
									int i_99_ = (i_97_ & 0xff00) * i_93_ & 0xff0000;
									int i_100_ = (i_97_ & 0xff) * i_94_ & 0xff00;
									i_97_ = (i_98_ | i_99_ | i_100_) >>> 8;
									int i_101_ = is[i_13_];
									int i_102_ = i_97_ + i_101_;
									int i_103_ = ((i_97_ & 0xff00ff) + (i_101_ & 0xff00ff));
									i_101_ = ((i_103_ & 0x1000100) + (i_102_ - i_103_ & 0x10000));
									is[i_13_++] = i_102_ - i_101_ | i_101_ - (i_101_ >>> 8);
								} else
									i_13_++;
							}
							i_13_ += i_17_;
							i_14_ += i_18_;
						}
					} else if (i_9_ == 3) {
						for (int i_104_ = -i_15_; i_104_ < 0; i_104_++) {
							for (int i_105_ = -i_16_; i_105_ < 0; i_105_++) {
								int i_106_ = anIntArray11347[i_14_++];
								int i_107_ = i_106_ + i_10_;
								int i_108_ = (i_106_ & 0xff00ff) + (i_10_ & 0xff00ff);
								int i_109_ = ((i_108_ & 0x1000100) + (i_107_ - i_108_ & 0x10000));
								i_106_ = i_107_ - i_109_ | i_109_ - (i_109_ >>> 8);
								i_109_ = is[i_13_];
								i_107_ = i_106_ + i_109_;
								i_108_ = (i_106_ & 0xff00ff) + (i_109_ & 0xff00ff);
								i_109_ = (i_108_ & 0x1000100) + (i_107_ - i_108_ & 0x10000);
								is[i_13_++] = i_107_ - i_109_ | i_109_ - (i_109_ >>> 8);
							}
							i_13_ += i_17_;
							i_14_ += i_18_;
						}
					} else if (i_9_ == 2) {
						int i_110_ = i_10_ >>> 24;
						int i_111_ = 256 - i_110_;
						int i_112_ = (i_10_ & 0xff00ff) * i_111_ & ~0xff00ff;
						int i_113_ = (i_10_ & 0xff00) * i_111_ & 0xff0000;
						i_10_ = (i_112_ | i_113_) >>> 8;
						for (int i_114_ = -i_15_; i_114_ < 0; i_114_++) {
							for (int i_115_ = -i_16_; i_115_ < 0; i_115_++) {
								int i_116_ = anIntArray11347[i_14_++];
								if (i_116_ != 0) {
									i_112_ = ((i_116_ & 0xff00ff) * i_110_ & ~0xff00ff);
									i_113_ = ((i_116_ & 0xff00) * i_110_ & 0xff0000);
									i_116_ = ((i_112_ | i_113_) >>> 8) + i_10_;
									int i_117_ = is[i_13_];
									int i_118_ = i_116_ + i_117_;
									int i_119_ = ((i_116_ & 0xff00ff) + (i_117_ & 0xff00ff));
									i_117_ = ((i_119_ & 0x1000100) + (i_118_ - i_119_ & 0x10000));
									is[i_13_++] = i_118_ - i_117_ | i_117_ - (i_117_ >>> 8);
								} else
									i_13_++;
							}
							i_13_ += i_17_;
							i_14_ += i_18_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method1748(int i, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is == null)
			throw new IllegalStateException("");
		for (int i_125_ = 0; i_125_ < i_122_; i_125_++) {
			int i_126_ = (i_120_ + i_125_) * anInt8945 + i;
			int i_127_ = ((i_124_ + i_125_) * (aClass167_Sub1_8946.anInt8997 * -570111553) + i_123_);
			for (int i_128_ = 0; i_128_ < i_121_; i_128_++)
				anIntArray11347[i_126_ + i_128_] = is[i_127_ + i_128_];
		}
	}

	public void method1783(int i, int i_129_, int i_130_, int i_131_, int[] is, int i_132_, int i_133_) {
		i_133_ -= i_130_;
		for (int i_134_ = 0; i_134_ < i_131_; i_134_++) {
			int i_135_ = (i_129_ + i_134_) * i_130_ + i;
			for (int i_136_ = 0; i_136_ < i_130_; i_136_++)
				anIntArray11347[i_135_ + i_136_] = is[i_132_++];
			i_132_ += i_133_;
		}
	}

	void method10513(int i, int i_137_, int i_138_, int i_139_, int[] is, int i_140_, int i_141_) {
		i_141_ -= i_138_;
		for (int i_142_ = 0; i_142_ < i_139_; i_142_++) {
			int i_143_ = (i_137_ + i_142_) * i_138_ + i;
			for (int i_144_ = 0; i_144_ < i_138_; i_144_++)
				is[i_140_++] = anIntArray11347[i_143_ + i_144_];
			i_140_ += i_141_;
		}
	}

	public void method1761(int i, int i_145_, int i_146_, int i_147_, int[] is, int[] is_148_, int i_149_, int i_150_) {
		method10513(i, i_145_, i_146_, i_147_, is, i_149_, i_150_);
	}

	Class143_Sub1_Sub2(Class167_Sub1 class167_sub1, int i, int i_151_) {
		super(class167_sub1, i, i_151_);
		anIntArray11347 = new int[i * i_151_];
	}

	void method1758(int i, int i_152_, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		if (i_153_ > 0 && i_154_ > 0) {
			int[] is = aClass167_Sub1_8946.anIntArray8996;
			if (is != null) {
				int i_159_ = 0;
				int i_160_ = 0;
				int i_161_ = aClass167_Sub1_8946.anInt8997 * -570111553;
				int i_162_ = anInt8977 + anInt8945 + anInt8948;
				int i_163_ = anInt8947 + anInt8950 + anInt8952;
				int i_164_ = (i_162_ << 16) / i_153_;
				int i_165_ = (i_163_ << 16) / i_154_;
				if (anInt8977 > 0) {
					int i_166_ = ((anInt8977 << 16) + i_164_ - 1) / i_164_;
					i += i_166_;
					i_159_ += i_166_ * i_164_ - (anInt8977 << 16);
				}
				if (anInt8947 > 0) {
					int i_167_ = ((anInt8947 << 16) + i_165_ - 1) / i_165_;
					i_152_ += i_167_;
					i_160_ += i_167_ * i_165_ - (anInt8947 << 16);
				}
				if (anInt8945 < i_162_)
					i_153_ = ((anInt8945 << 16) - i_159_ + i_164_ - 1) / i_164_;
				if (anInt8950 < i_163_)
					i_154_ = ((anInt8950 << 16) - i_160_ + i_165_ - 1) / i_165_;
				int i_168_ = i + i_152_ * i_161_;
				int i_169_ = i_161_ - i_153_;
				if (i_152_ + i_154_ > aClass167_Sub1_8946.anInt9003 * -148513205)
					i_154_ -= (i_152_ + i_154_ - aClass167_Sub1_8946.anInt9003 * -148513205);
				if (i_152_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
					int i_170_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_152_;
					i_154_ -= i_170_;
					i_168_ += i_170_ * i_161_;
					i_160_ += i_165_ * i_170_;
				}
				if (i + i_153_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
					int i_171_ = (i + i_153_ - aClass167_Sub1_8946.anInt9001 * 2024498147);
					i_153_ -= i_171_;
					i_169_ += i_171_;
				}
				if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
					int i_172_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
					i_153_ -= i_172_;
					i_168_ += i_172_;
					i_159_ += i_164_ * i_172_;
					i_169_ += i_172_;
				}
				if (i_157_ == 0) {
					if (i_155_ == 1) {
						int i_173_ = i_159_;
						for (int i_174_ = -i_154_; i_174_ < 0; i_174_++) {
							int i_175_ = (i_160_ >> 16) * anInt8945;
							for (int i_176_ = -i_153_; i_176_ < 0; i_176_++) {
								is[i_168_++] = anIntArray11347[(i_159_ >> 16) + i_175_];
								i_159_ += i_164_;
							}
							i_160_ += i_165_;
							i_159_ = i_173_;
							i_168_ += i_169_;
						}
					} else if (i_155_ == 0) {
						int i_177_ = (i_156_ & 0xff0000) >> 16;
						int i_178_ = (i_156_ & 0xff00) >> 8;
						int i_179_ = i_156_ & 0xff;
						int i_180_ = i_159_;
						for (int i_181_ = -i_154_; i_181_ < 0; i_181_++) {
							int i_182_ = (i_160_ >> 16) * anInt8945;
							for (int i_183_ = -i_153_; i_183_ < 0; i_183_++) {
								int i_184_ = anIntArray11347[(i_159_ >> 16) + i_182_];
								int i_185_ = (i_184_ & 0xff0000) * i_177_ & ~0xffffff;
								int i_186_ = (i_184_ & 0xff00) * i_178_ & 0xff0000;
								int i_187_ = (i_184_ & 0xff) * i_179_ & 0xff00;
								is[i_168_++] = (i_185_ | i_186_ | i_187_) >>> 8;
								i_159_ += i_164_;
							}
							i_160_ += i_165_;
							i_159_ = i_180_;
							i_168_ += i_169_;
						}
					} else if (i_155_ == 3) {
						int i_188_ = i_159_;
						for (int i_189_ = -i_154_; i_189_ < 0; i_189_++) {
							int i_190_ = (i_160_ >> 16) * anInt8945;
							for (int i_191_ = -i_153_; i_191_ < 0; i_191_++) {
								int i_192_ = anIntArray11347[(i_159_ >> 16) + i_190_];
								int i_193_ = i_192_ + i_156_;
								int i_194_ = ((i_192_ & 0xff00ff) + (i_156_ & 0xff00ff));
								int i_195_ = ((i_194_ & 0x1000100) + (i_193_ - i_194_ & 0x10000));
								is[i_168_++] = i_193_ - i_195_ | i_195_ - (i_195_ >>> 8);
								i_159_ += i_164_;
							}
							i_160_ += i_165_;
							i_159_ = i_188_;
							i_168_ += i_169_;
						}
					} else if (i_155_ == 2) {
						int i_196_ = i_156_ >>> 24;
						int i_197_ = 256 - i_196_;
						int i_198_ = (i_156_ & 0xff00ff) * i_197_ & ~0xff00ff;
						int i_199_ = (i_156_ & 0xff00) * i_197_ & 0xff0000;
						i_156_ = (i_198_ | i_199_) >>> 8;
						int i_200_ = i_159_;
						for (int i_201_ = -i_154_; i_201_ < 0; i_201_++) {
							int i_202_ = (i_160_ >> 16) * anInt8945;
							for (int i_203_ = -i_153_; i_203_ < 0; i_203_++) {
								int i_204_ = anIntArray11347[(i_159_ >> 16) + i_202_];
								i_198_ = (i_204_ & 0xff00ff) * i_196_ & ~0xff00ff;
								i_199_ = (i_204_ & 0xff00) * i_196_ & 0xff0000;
								is[i_168_++] = ((i_198_ | i_199_) >>> 8) + i_156_;
								i_159_ += i_164_;
							}
							i_160_ += i_165_;
							i_159_ = i_200_;
							i_168_ += i_169_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_157_ == 1) {
					if (i_155_ == 1) {
						int i_205_ = i_159_;
						for (int i_206_ = -i_154_; i_206_ < 0; i_206_++) {
							int i_207_ = (i_160_ >> 16) * anInt8945;
							for (int i_208_ = -i_153_; i_208_ < 0; i_208_++) {
								int i_209_ = anIntArray11347[(i_159_ >> 16) + i_207_];
								if (i_209_ != 0)
									is[i_168_++] = i_209_;
								else
									i_168_++;
								i_159_ += i_164_;
							}
							i_160_ += i_165_;
							i_159_ = i_205_;
							i_168_ += i_169_;
						}
					} else if (i_155_ == 0) {
						int i_210_ = i_159_;
						if ((i_156_ & 0xffffff) == 16777215) {
							int i_211_ = i_156_ >>> 24;
							int i_212_ = 256 - i_211_;
							for (int i_213_ = -i_154_; i_213_ < 0; i_213_++) {
								int i_214_ = (i_160_ >> 16) * anInt8945;
								for (int i_215_ = -i_153_; i_215_ < 0; i_215_++) {
									int i_216_ = (anIntArray11347[(i_159_ >> 16) + i_214_]);
									if (i_216_ != 0) {
										int i_217_ = is[i_168_];
										is[i_168_++] = ((((i_216_ & 0xff00ff) * i_211_ + ((i_217_ & 0xff00ff) * i_212_)) & ~0xff00ff) + (((i_216_ & 0xff00) * i_211_ + ((i_217_ & 0xff00) * i_212_)) & 0xff0000)) >> 8;
									} else
										i_168_++;
									i_159_ += i_164_;
								}
								i_160_ += i_165_;
								i_159_ = i_210_;
								i_168_ += i_169_;
							}
						} else {
							int i_218_ = (i_156_ & 0xff0000) >> 16;
							int i_219_ = (i_156_ & 0xff00) >> 8;
							int i_220_ = i_156_ & 0xff;
							int i_221_ = i_156_ >>> 24;
							int i_222_ = 256 - i_221_;
							for (int i_223_ = -i_154_; i_223_ < 0; i_223_++) {
								int i_224_ = (i_160_ >> 16) * anInt8945;
								for (int i_225_ = -i_153_; i_225_ < 0; i_225_++) {
									int i_226_ = (anIntArray11347[(i_159_ >> 16) + i_224_]);
									if (i_226_ != 0) {
										if (i_221_ != 255) {
											int i_227_ = ((i_226_ & 0xff0000) * i_218_ & ~0xffffff);
											int i_228_ = ((i_226_ & 0xff00) * i_219_ & 0xff0000);
											int i_229_ = ((i_226_ & 0xff) * i_220_ & 0xff00);
											i_226_ = (i_227_ | i_228_ | i_229_) >>> 8;
											int i_230_ = is[i_168_];
											is[i_168_++] = (((((i_226_ & 0xff00ff) * i_221_) + ((i_230_ & 0xff00ff) * i_222_)) & ~0xff00ff) + ((((i_226_ & 0xff00) * i_221_) + ((i_230_ & 0xff00) * i_222_)) & 0xff0000)) >> 8;
										} else {
											int i_231_ = ((i_226_ & 0xff0000) * i_218_ & ~0xffffff);
											int i_232_ = ((i_226_ & 0xff00) * i_219_ & 0xff0000);
											int i_233_ = ((i_226_ & 0xff) * i_220_ & 0xff00);
											is[i_168_++] = (i_231_ | i_232_ | i_233_) >>> 8;
										}
									} else
										i_168_++;
									i_159_ += i_164_;
								}
								i_160_ += i_165_;
								i_159_ = i_210_;
								i_168_ += i_169_;
							}
						}
					} else if (i_155_ == 3) {
						int i_234_ = i_159_;
						int i_235_ = i_156_ >>> 24;
						int i_236_ = 256 - i_235_;
						for (int i_237_ = -i_154_; i_237_ < 0; i_237_++) {
							int i_238_ = (i_160_ >> 16) * anInt8945;
							for (int i_239_ = -i_153_; i_239_ < 0; i_239_++) {
								int i_240_ = anIntArray11347[(i_159_ >> 16) + i_238_];
								int i_241_ = i_240_ + i_156_;
								int i_242_ = ((i_240_ & 0xff00ff) + (i_156_ & 0xff00ff));
								int i_243_ = ((i_242_ & 0x1000100) + (i_241_ - i_242_ & 0x10000));
								i_243_ = i_241_ - i_243_ | i_243_ - (i_243_ >>> 8);
								if (i_240_ == 0 && i_235_ != 255) {
									i_240_ = i_243_;
									i_243_ = is[i_168_];
									i_243_ = ((((i_240_ & 0xff00ff) * i_235_ + (i_243_ & 0xff00ff) * i_236_) & ~0xff00ff) + (((i_240_ & 0xff00) * i_235_ + (i_243_ & 0xff00) * i_236_) & 0xff0000)) >> 8;
								}
								is[i_168_++] = i_243_;
								i_159_ += i_164_;
							}
							i_160_ += i_165_;
							i_159_ = i_234_;
							i_168_ += i_169_;
						}
					} else if (i_155_ == 2) {
						int i_244_ = i_156_ >>> 24;
						int i_245_ = 256 - i_244_;
						int i_246_ = (i_156_ & 0xff00ff) * i_245_ & ~0xff00ff;
						int i_247_ = (i_156_ & 0xff00) * i_245_ & 0xff0000;
						i_156_ = (i_246_ | i_247_) >>> 8;
						int i_248_ = i_159_;
						for (int i_249_ = -i_154_; i_249_ < 0; i_249_++) {
							int i_250_ = (i_160_ >> 16) * anInt8945;
							for (int i_251_ = -i_153_; i_251_ < 0; i_251_++) {
								int i_252_ = anIntArray11347[(i_159_ >> 16) + i_250_];
								if (i_252_ != 0) {
									i_246_ = ((i_252_ & 0xff00ff) * i_244_ & ~0xff00ff);
									i_247_ = ((i_252_ & 0xff00) * i_244_ & 0xff0000);
									is[i_168_++] = ((i_246_ | i_247_) >>> 8) + i_156_;
								} else
									i_168_++;
								i_159_ += i_164_;
							}
							i_160_ += i_165_;
							i_159_ = i_248_;
							i_168_ += i_169_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_157_ == 2) {
					if (i_155_ == 1) {
						int i_253_ = i_159_;
						for (int i_254_ = -i_154_; i_254_ < 0; i_254_++) {
							int i_255_ = (i_160_ >> 16) * anInt8945;
							for (int i_256_ = -i_153_; i_256_ < 0; i_256_++) {
								int i_257_ = anIntArray11347[(i_159_ >> 16) + i_255_];
								if (i_257_ != 0) {
									int i_258_ = is[i_168_];
									int i_259_ = i_257_ + i_258_;
									int i_260_ = ((i_257_ & 0xff00ff) + (i_258_ & 0xff00ff));
									i_258_ = ((i_260_ & 0x1000100) + (i_259_ - i_260_ & 0x10000));
									is[i_168_++] = i_259_ - i_258_ | i_258_ - (i_258_ >>> 8);
								} else
									i_168_++;
								i_159_ += i_164_;
							}
							i_160_ += i_165_;
							i_159_ = i_253_;
							i_168_ += i_169_;
						}
					} else if (i_155_ == 0) {
						int i_261_ = i_159_;
						int i_262_ = (i_156_ & 0xff0000) >> 16;
						int i_263_ = (i_156_ & 0xff00) >> 8;
						int i_264_ = i_156_ & 0xff;
						for (int i_265_ = -i_154_; i_265_ < 0; i_265_++) {
							int i_266_ = (i_160_ >> 16) * anInt8945;
							for (int i_267_ = -i_153_; i_267_ < 0; i_267_++) {
								int i_268_ = anIntArray11347[(i_159_ >> 16) + i_266_];
								if (i_268_ != 0) {
									int i_269_ = ((i_268_ & 0xff0000) * i_262_ & ~0xffffff);
									int i_270_ = ((i_268_ & 0xff00) * i_263_ & 0xff0000);
									int i_271_ = (i_268_ & 0xff) * i_264_ & 0xff00;
									i_268_ = (i_269_ | i_270_ | i_271_) >>> 8;
									int i_272_ = is[i_168_];
									int i_273_ = i_268_ + i_272_;
									int i_274_ = ((i_268_ & 0xff00ff) + (i_272_ & 0xff00ff));
									i_272_ = ((i_274_ & 0x1000100) + (i_273_ - i_274_ & 0x10000));
									is[i_168_++] = i_273_ - i_272_ | i_272_ - (i_272_ >>> 8);
								} else
									i_168_++;
								i_159_ += i_164_;
							}
							i_160_ += i_165_;
							i_159_ = i_261_;
							i_168_ += i_169_;
						}
					} else if (i_155_ == 3) {
						int i_275_ = i_159_;
						for (int i_276_ = -i_154_; i_276_ < 0; i_276_++) {
							int i_277_ = (i_160_ >> 16) * anInt8945;
							for (int i_278_ = -i_153_; i_278_ < 0; i_278_++) {
								int i_279_ = anIntArray11347[(i_159_ >> 16) + i_277_];
								int i_280_ = i_279_ + i_156_;
								int i_281_ = ((i_279_ & 0xff00ff) + (i_156_ & 0xff00ff));
								int i_282_ = ((i_281_ & 0x1000100) + (i_280_ - i_281_ & 0x10000));
								i_279_ = i_280_ - i_282_ | i_282_ - (i_282_ >>> 8);
								i_282_ = is[i_168_];
								i_280_ = i_279_ + i_282_;
								i_281_ = (i_279_ & 0xff00ff) + (i_282_ & 0xff00ff);
								i_282_ = (i_281_ & 0x1000100) + (i_280_ - i_281_ & 0x10000);
								is[i_168_++] = i_280_ - i_282_ | i_282_ - (i_282_ >>> 8);
								i_159_ += i_164_;
							}
							i_160_ += i_165_;
							i_159_ = i_275_;
							i_168_ += i_169_;
						}
					} else if (i_155_ == 2) {
						int i_283_ = i_156_ >>> 24;
						int i_284_ = 256 - i_283_;
						int i_285_ = (i_156_ & 0xff00ff) * i_284_ & ~0xff00ff;
						int i_286_ = (i_156_ & 0xff00) * i_284_ & 0xff0000;
						i_156_ = (i_285_ | i_286_) >>> 8;
						int i_287_ = i_159_;
						for (int i_288_ = -i_154_; i_288_ < 0; i_288_++) {
							int i_289_ = (i_160_ >> 16) * anInt8945;
							for (int i_290_ = -i_153_; i_290_ < 0; i_290_++) {
								int i_291_ = anIntArray11347[(i_159_ >> 16) + i_289_];
								if (i_291_ != 0) {
									i_285_ = ((i_291_ & 0xff00ff) * i_283_ & ~0xff00ff);
									i_286_ = ((i_291_ & 0xff00) * i_283_ & 0xff0000);
									i_291_ = ((i_285_ | i_286_) >>> 8) + i_156_;
									int i_292_ = is[i_168_];
									int i_293_ = i_291_ + i_292_;
									int i_294_ = ((i_291_ & 0xff00ff) + (i_292_ & 0xff00ff));
									i_292_ = ((i_294_ & 0x1000100) + (i_293_ - i_294_ & 0x10000));
									is[i_168_++] = i_293_ - i_292_ | i_292_ - (i_292_ >>> 8);
								} else
									i_168_++;
								i_159_ += i_164_;
							}
							i_160_ += i_165_;
							i_159_ = i_287_;
							i_168_ += i_169_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	Class143_Sub1_Sub2(Class167_Sub1 class167_sub1, int[] is, int i, int i_295_) {
		super(class167_sub1, i, i_295_);
		anIntArray11347 = is;
	}

	void method8439(int i, int i_296_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_297_ = anInt8957;
					while (i_297_ < 0) {
						int i_298_ = anInt8959;
						int i_299_ = anInt8966;
						int i_300_ = anInt8967;
						int i_301_ = anInt8955;
						if (i_299_ >= 0 && i_300_ >= 0 && i_299_ - (anInt8945 << 12) < 0 && i_300_ - (anInt8950 << 12) < 0) {
							for (/**/; i_301_ < 0; i_301_++)
								method10515(((i_300_ >> 12) * anInt8945 + (i_299_ >> 12)), i_298_++, is, i, i_296_);
						}
						i_297_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_302_ = anInt8957;
					while (i_302_ < 0) {
						int i_303_ = anInt8959;
						int i_304_ = anInt8966;
						int i_305_ = anInt8967 + anInt8969;
						int i_306_ = anInt8955;
						if (i_304_ >= 0 && i_304_ - (anInt8945 << 12) < 0) {
							int i_307_;
							if ((i_307_ = i_305_ - (anInt8950 << 12)) >= 0) {
								i_307_ = (anInt8962 - i_307_) / anInt8962;
								i_306_ += i_307_;
								i_305_ += anInt8962 * i_307_;
								i_303_ += i_307_;
							}
							if ((i_307_ = (i_305_ - anInt8962) / anInt8962) > i_306_)
								i_306_ = i_307_;
							for (/**/; i_306_ < 0; i_306_++) {
								method10515(((i_305_ >> 12) * anInt8945 + (i_304_ >> 12)), i_303_++, is, i, i_296_);
								i_305_ += anInt8962;
							}
						}
						i_302_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_308_ = anInt8957;
					while (i_308_ < 0) {
						int i_309_ = anInt8959;
						int i_310_ = anInt8966;
						int i_311_ = anInt8967 + anInt8969;
						int i_312_ = anInt8955;
						if (i_310_ >= 0 && i_310_ - (anInt8945 << 12) < 0) {
							if (i_311_ < 0) {
								int i_313_ = (anInt8962 - 1 - i_311_) / anInt8962;
								i_312_ += i_313_;
								i_311_ += anInt8962 * i_313_;
								i_309_ += i_313_;
							}
							int i_314_;
							if ((i_314_ = (1 + i_311_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_312_)
								i_312_ = i_314_;
							for (/**/; i_312_ < 0; i_312_++) {
								method10515(((i_311_ >> 12) * anInt8945 + (i_310_ >> 12)), i_309_++, is, i, i_296_);
								i_311_ += anInt8962;
							}
						}
						i_308_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_315_ = anInt8957;
					while (i_315_ < 0) {
						int i_316_ = anInt8959;
						int i_317_ = anInt8966 + anInt8968;
						int i_318_ = anInt8967;
						int i_319_ = anInt8955;
						if (i_318_ >= 0 && i_318_ - (anInt8950 << 12) < 0) {
							int i_320_;
							if ((i_320_ = i_317_ - (anInt8945 << 12)) >= 0) {
								i_320_ = (anInt8960 - i_320_) / anInt8960;
								i_319_ += i_320_;
								i_317_ += anInt8960 * i_320_;
								i_316_ += i_320_;
							}
							if ((i_320_ = (i_317_ - anInt8960) / anInt8960) > i_319_)
								i_319_ = i_320_;
							for (/**/; i_319_ < 0; i_319_++) {
								method10515(((i_318_ >> 12) * anInt8945 + (i_317_ >> 12)), i_316_++, is, i, i_296_);
								i_317_ += anInt8960;
							}
						}
						i_315_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_321_ = anInt8957;
					while (i_321_ < 0) {
						int i_322_ = anInt8959;
						int i_323_ = anInt8966 + anInt8968;
						int i_324_ = anInt8967 + anInt8969;
						int i_325_ = anInt8955;
						int i_326_;
						if ((i_326_ = i_323_ - (anInt8945 << 12)) >= 0) {
							i_326_ = (anInt8960 - i_326_) / anInt8960;
							i_325_ += i_326_;
							i_323_ += anInt8960 * i_326_;
							i_324_ += anInt8962 * i_326_;
							i_322_ += i_326_;
						}
						if ((i_326_ = (i_323_ - anInt8960) / anInt8960) > i_325_)
							i_325_ = i_326_;
						if ((i_326_ = i_324_ - (anInt8950 << 12)) >= 0) {
							i_326_ = (anInt8962 - i_326_) / anInt8962;
							i_325_ += i_326_;
							i_323_ += anInt8960 * i_326_;
							i_324_ += anInt8962 * i_326_;
							i_322_ += i_326_;
						}
						if ((i_326_ = (i_324_ - anInt8962) / anInt8962) > i_325_)
							i_325_ = i_326_;
						for (/**/; i_325_ < 0; i_325_++) {
							method10515((i_324_ >> 12) * anInt8945 + (i_323_ >> 12), i_322_++, is, i, i_296_);
							i_323_ += anInt8960;
							i_324_ += anInt8962;
						}
						i_321_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_327_ = anInt8957;
					while (i_327_ < 0) {
						int i_328_ = anInt8959;
						int i_329_ = anInt8966 + anInt8968;
						int i_330_ = anInt8967 + anInt8969;
						int i_331_ = anInt8955;
						int i_332_;
						if ((i_332_ = i_329_ - (anInt8945 << 12)) >= 0) {
							i_332_ = (anInt8960 - i_332_) / anInt8960;
							i_331_ += i_332_;
							i_329_ += anInt8960 * i_332_;
							i_330_ += anInt8962 * i_332_;
							i_328_ += i_332_;
						}
						if ((i_332_ = (i_329_ - anInt8960) / anInt8960) > i_331_)
							i_331_ = i_332_;
						if (i_330_ < 0) {
							i_332_ = (anInt8962 - 1 - i_330_) / anInt8962;
							i_331_ += i_332_;
							i_329_ += anInt8960 * i_332_;
							i_330_ += anInt8962 * i_332_;
							i_328_ += i_332_;
						}
						if ((i_332_ = (1 + i_330_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_331_)
							i_331_ = i_332_;
						for (/**/; i_331_ < 0; i_331_++) {
							method10515((i_330_ >> 12) * anInt8945 + (i_329_ >> 12), i_328_++, is, i, i_296_);
							i_329_ += anInt8960;
							i_330_ += anInt8962;
						}
						i_327_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_333_ = anInt8957;
				while (i_333_ < 0) {
					int i_334_ = anInt8959;
					int i_335_ = anInt8966 + anInt8968;
					int i_336_ = anInt8967;
					int i_337_ = anInt8955;
					if (i_336_ >= 0 && i_336_ - (anInt8950 << 12) < 0) {
						if (i_335_ < 0) {
							int i_338_ = (anInt8960 - 1 - i_335_) / anInt8960;
							i_337_ += i_338_;
							i_335_ += anInt8960 * i_338_;
							i_334_ += i_338_;
						}
						int i_339_;
						if ((i_339_ = (1 + i_335_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_337_)
							i_337_ = i_339_;
						for (/**/; i_337_ < 0; i_337_++) {
							method10515((i_336_ >> 12) * anInt8945 + (i_335_ >> 12), i_334_++, is, i, i_296_);
							i_335_ += anInt8960;
						}
					}
					i_333_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				for (int i_340_ = anInt8957; i_340_ < 0; i_340_++) {
					int i_341_ = anInt8959;
					int i_342_ = anInt8966 + anInt8968;
					int i_343_ = anInt8967 + anInt8969;
					int i_344_ = anInt8955;
					if (i_342_ < 0) {
						int i_345_ = (anInt8960 - 1 - i_342_) / anInt8960;
						i_344_ += i_345_;
						i_342_ += anInt8960 * i_345_;
						i_343_ += anInt8962 * i_345_;
						i_341_ += i_345_;
					}
					int i_346_;
					if ((i_346_ = ((1 + i_342_ - (anInt8945 << 12) - anInt8960) / anInt8960)) > i_344_)
						i_344_ = i_346_;
					if ((i_346_ = i_343_ - (anInt8950 << 12)) >= 0) {
						i_346_ = (anInt8962 - i_346_) / anInt8962;
						i_344_ += i_346_;
						i_342_ += anInt8960 * i_346_;
						i_343_ += anInt8962 * i_346_;
						i_341_ += i_346_;
					}
					if ((i_346_ = (i_343_ - anInt8962) / anInt8962) > i_344_)
						i_344_ = i_346_;
					for (/**/; i_344_ < 0; i_344_++) {
						method10515((i_343_ >> 12) * anInt8945 + (i_342_ >> 12), i_341_++, is, i, i_296_);
						i_342_ += anInt8960;
						i_343_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				for (int i_347_ = anInt8957; i_347_ < 0; i_347_++) {
					int i_348_ = anInt8959;
					int i_349_ = anInt8966 + anInt8968;
					int i_350_ = anInt8967 + anInt8969;
					int i_351_ = anInt8955;
					if (i_349_ < 0) {
						int i_352_ = (anInt8960 - 1 - i_349_) / anInt8960;
						i_351_ += i_352_;
						i_349_ += anInt8960 * i_352_;
						i_350_ += anInt8962 * i_352_;
						i_348_ += i_352_;
					}
					int i_353_;
					if ((i_353_ = ((1 + i_349_ - (anInt8945 << 12) - anInt8960) / anInt8960)) > i_351_)
						i_351_ = i_353_;
					if (i_350_ < 0) {
						i_353_ = (anInt8962 - 1 - i_350_) / anInt8962;
						i_351_ += i_353_;
						i_349_ += anInt8960 * i_353_;
						i_350_ += anInt8962 * i_353_;
						i_348_ += i_353_;
					}
					if ((i_353_ = ((1 + i_350_ - (anInt8950 << 12) - anInt8962) / anInt8962)) > i_351_)
						i_351_ = i_353_;
					for (/**/; i_351_ < 0; i_351_++) {
						method10515((i_350_ >> 12) * anInt8945 + (i_349_ >> 12), i_348_++, is, i, i_296_);
						i_349_ += anInt8960;
						i_350_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	public void method1730(int i, int i_354_, Class161 class161, int i_355_, int i_356_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			i += anInt8977;
			i_354_ += anInt8947;
			int i_357_ = 0;
			int i_358_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			int i_359_ = anInt8945;
			int i_360_ = anInt8950;
			int i_361_ = i_358_ - i_359_;
			int i_362_ = 0;
			int i_363_ = i + i_354_ * i_358_;
			if (i_354_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_364_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_354_;
				i_360_ -= i_364_;
				i_354_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_357_ += i_364_ * i_359_;
				i_363_ += i_364_ * i_358_;
			}
			if (i_354_ + i_360_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_360_ -= (i_354_ + i_360_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_365_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_359_ -= i_365_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_357_ += i_365_;
				i_363_ += i_365_;
				i_362_ += i_365_;
				i_361_ += i_365_;
			}
			if (i + i_359_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_366_ = i + i_359_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_359_ -= i_366_;
				i_362_ += i_366_;
				i_361_ += i_366_;
			}
			if (i_359_ > 0 && i_360_ > 0) {
				Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
				int[] is_367_ = class161_sub2.anIntArray9444;
				int[] is_368_ = class161_sub2.anIntArray9445;
				int i_369_ = i_354_;
				if (i_356_ > i_369_) {
					i_369_ = i_356_;
					i_363_ += (i_356_ - i_354_) * i_358_;
					i_357_ += (i_356_ - i_354_) * anInt8945;
				}
				int i_370_ = (i_356_ + is_367_.length < i_354_ + i_360_ ? i_356_ + is_367_.length : i_354_ + i_360_);
				for (int i_371_ = i_369_; i_371_ < i_370_; i_371_++) {
					int i_372_ = is_367_[i_371_ - i_356_] + i_355_;
					int i_373_ = is_368_[i_371_ - i_356_];
					int i_374_ = i_359_;
					if (i > i_372_) {
						int i_375_ = i - i_372_;
						if (i_375_ >= i_373_) {
							i_357_ += i_359_ + i_362_;
							i_363_ += i_359_ + i_361_;
							continue;
						}
						i_373_ -= i_375_;
					} else {
						int i_376_ = i_372_ - i;
						if (i_376_ >= i_359_) {
							i_357_ += i_359_ + i_362_;
							i_363_ += i_359_ + i_361_;
							continue;
						}
						i_357_ += i_376_;
						i_374_ -= i_376_;
						i_363_ += i_376_;
					}
					int i_377_ = 0;
					if (i_374_ < i_373_)
						i_373_ = i_374_;
					else
						i_377_ = i_374_ - i_373_;
					for (int i_378_ = -i_373_; i_378_ < 0; i_378_++) {
						int i_379_ = anIntArray11347[i_357_++];
						if (i_379_ != 0)
							is[i_363_++] = i_379_;
						else
							i_363_++;
					}
					i_357_ += i_377_ + i_362_;
					i_363_ += i_377_ + i_361_;
				}
			}
		}
	}

	public void method1746(int i, int i_380_, int i_381_, int i_382_, int[] is, int[] is_383_, int i_384_, int i_385_) {
		method10513(i, i_380_, i_381_, i_382_, is, i_384_, i_385_);
	}

	void method8430(boolean bool, boolean bool_386_, boolean bool_387_, int i, int i_388_, float f, int i_389_, int i_390_, int i_391_, int i_392_, int i_393_, int i_394_, boolean bool_395_) {
		if (i_389_ > 0 && i_390_ > 0 && (bool || bool_386_)) {
			int i_396_ = 0;
			int i_397_ = 0;
			int i_398_ = anInt8977 + anInt8945 + anInt8948;
			int i_399_ = anInt8947 + anInt8950 + anInt8952;
			int i_400_ = (i_398_ << 16) / i_389_;
			int i_401_ = (i_399_ << 16) / i_390_;
			if (anInt8977 > 0) {
				int i_402_ = ((anInt8977 << 16) + i_400_ - 1) / i_400_;
				i += i_402_;
				i_396_ += i_402_ * i_400_ - (anInt8977 << 16);
			}
			if (anInt8947 > 0) {
				int i_403_ = ((anInt8947 << 16) + i_401_ - 1) / i_401_;
				i_388_ += i_403_;
				i_397_ += i_403_ * i_401_ - (anInt8947 << 16);
			}
			if (anInt8945 < i_398_)
				i_389_ = ((anInt8945 << 16) - i_396_ + i_400_ - 1) / i_400_;
			if (anInt8950 < i_399_)
				i_390_ = ((anInt8950 << 16) - i_397_ + i_401_ - 1) / i_401_;
			int i_404_ = i + i_388_ * (aClass167_Sub1_8946.anInt8997 * -570111553);
			int i_405_ = aClass167_Sub1_8946.anInt8997 * -570111553 - i_389_;
			if (i_388_ + i_390_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_390_ -= (i_388_ + i_390_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i_388_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_406_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_388_;
				i_390_ -= i_406_;
				i_404_ += i_406_ * (aClass167_Sub1_8946.anInt8997 * -570111553);
				i_397_ += i_401_ * i_406_;
			}
			if (i + i_389_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_407_ = i + i_389_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_389_ -= i_407_;
				i_405_ += i_407_;
			}
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_408_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_389_ -= i_408_;
				i_404_ += i_408_;
				i_396_ += i_400_ * i_408_;
				i_405_ += i_408_;
			}
			float[] fs = aClass167_Sub1_8946.aFloatArray8999;
			int[] is = aClass167_Sub1_8946.anIntArray8996;
			if (i_393_ == 0) {
				if (i_391_ == 1) {
					int i_409_ = i_396_;
					for (int i_410_ = -i_390_; i_410_ < 0; i_410_++) {
						int i_411_ = (i_397_ >> 16) * anInt8945;
						for (int i_412_ = -i_389_; i_412_ < 0; i_412_++) {
							if (!bool_386_ || f < fs[i_404_]) {
								if (bool)
									is[i_404_] = (anIntArray11347[(i_396_ >> 16) + i_411_]);
								if (bool_386_ && bool_395_)
									fs[i_404_] = f;
							}
							i_396_ += i_400_;
							i_404_++;
						}
						i_397_ += i_401_;
						i_396_ = i_409_;
						i_404_ += i_405_;
					}
				} else if (i_391_ == 0) {
					int i_413_ = (i_392_ & 0xff0000) >> 16;
					int i_414_ = (i_392_ & 0xff00) >> 8;
					int i_415_ = i_392_ & 0xff;
					int i_416_ = i_396_;
					for (int i_417_ = -i_390_; i_417_ < 0; i_417_++) {
						int i_418_ = (i_397_ >> 16) * anInt8945;
						for (int i_419_ = -i_389_; i_419_ < 0; i_419_++) {
							if (!bool_386_ || f < fs[i_404_]) {
								if (bool) {
									int i_420_ = (anIntArray11347[(i_396_ >> 16) + i_418_]);
									int i_421_ = ((i_420_ & 0xff0000) * i_413_ & ~0xffffff);
									int i_422_ = ((i_420_ & 0xff00) * i_414_ & 0xff0000);
									int i_423_ = (i_420_ & 0xff) * i_415_ & 0xff00;
									is[i_404_] = (i_421_ | i_422_ | i_423_) >>> 8;
								}
								if (bool_386_ && bool_395_)
									fs[i_404_] = f;
							}
							i_396_ += i_400_;
							i_404_++;
						}
						i_397_ += i_401_;
						i_396_ = i_416_;
						i_404_ += i_405_;
					}
				} else if (i_391_ == 3) {
					int i_424_ = i_396_;
					for (int i_425_ = -i_390_; i_425_ < 0; i_425_++) {
						int i_426_ = (i_397_ >> 16) * anInt8945;
						for (int i_427_ = -i_389_; i_427_ < 0; i_427_++) {
							if (!bool_386_ || f < fs[i_404_]) {
								if (bool) {
									int i_428_ = (anIntArray11347[(i_396_ >> 16) + i_426_]);
									int i_429_ = i_428_ + i_392_;
									int i_430_ = ((i_428_ & 0xff00ff) + (i_392_ & 0xff00ff));
									int i_431_ = ((i_430_ & 0x1000100) + (i_429_ - i_430_ & 0x10000));
									is[i_404_] = i_429_ - i_431_ | i_431_ - (i_431_ >>> 8);
								}
								if (bool_386_ && bool_395_)
									fs[i_404_] = f;
							}
							i_396_ += i_400_;
							i_404_++;
						}
						i_397_ += i_401_;
						i_396_ = i_424_;
						i_404_ += i_405_;
					}
				} else if (i_391_ == 2) {
					int i_432_ = i_392_ >>> 24;
					int i_433_ = 256 - i_432_;
					int i_434_ = (i_392_ & 0xff00ff) * i_433_ & ~0xff00ff;
					int i_435_ = (i_392_ & 0xff00) * i_433_ & 0xff0000;
					i_392_ = (i_434_ | i_435_) >>> 8;
					int i_436_ = i_396_;
					for (int i_437_ = -i_390_; i_437_ < 0; i_437_++) {
						int i_438_ = (i_397_ >> 16) * anInt8945;
						for (int i_439_ = -i_389_; i_439_ < 0; i_439_++) {
							if (!bool_386_ || f < fs[i_404_]) {
								if (bool) {
									int i_440_ = (anIntArray11347[(i_396_ >> 16) + i_438_]);
									i_434_ = ((i_440_ & 0xff00ff) * i_432_ & ~0xff00ff);
									i_435_ = ((i_440_ & 0xff00) * i_432_ & 0xff0000);
									is[i_404_] = ((i_434_ | i_435_) >>> 8) + i_392_;
								}
								if (bool_386_ && bool_395_)
									fs[i_404_] = f;
							}
							i_396_ += i_400_;
							i_404_++;
						}
						i_397_ += i_401_;
						i_396_ = i_436_;
						i_404_ += i_405_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_393_ == 1) {
				if (i_391_ == 1) {
					int i_441_ = i_396_;
					for (int i_442_ = -i_390_; i_442_ < 0; i_442_++) {
						int i_443_ = (i_397_ >> 16) * anInt8945;
						for (int i_444_ = -i_389_; i_444_ < 0; i_444_++) {
							if (!bool_386_ || f < fs[i_404_]) {
								int i_445_ = anIntArray11347[(i_396_ >> 16) + i_443_];
								if (i_445_ != 0) {
									if (bool)
										is[i_404_] = i_445_;
									if (bool_386_ && bool_395_)
										fs[i_404_] = f;
								}
							}
							i_396_ += i_400_;
							i_404_++;
						}
						i_397_ += i_401_;
						i_396_ = i_441_;
						i_404_ += i_405_;
					}
				} else if (i_391_ == 0) {
					int i_446_ = i_396_;
					if ((i_392_ & 0xffffff) == 16777215) {
						int i_447_ = i_392_ >>> 24;
						int i_448_ = 256 - i_447_;
						for (int i_449_ = -i_390_; i_449_ < 0; i_449_++) {
							int i_450_ = (i_397_ >> 16) * anInt8945;
							for (int i_451_ = -i_389_; i_451_ < 0; i_451_++) {
								if (!bool_386_ || f < fs[i_404_]) {
									int i_452_ = (anIntArray11347[(i_396_ >> 16) + i_450_]);
									if (i_452_ != 0) {
										if (bool) {
											int i_453_ = is[i_404_];
											is[i_404_] = (((((i_452_ & 0xff00ff) * i_447_) + ((i_453_ & 0xff00ff) * i_448_)) & ~0xff00ff) + ((((i_452_ & 0xff00) * i_447_) + ((i_453_ & 0xff00) * i_448_)) & 0xff0000)) >> 8;
										}
										if (bool_386_ && bool_395_)
											fs[i_404_] = f;
									}
								}
								i_396_ += i_400_;
								i_404_++;
							}
							i_397_ += i_401_;
							i_396_ = i_446_;
							i_404_ += i_405_;
						}
					} else {
						int i_454_ = (i_392_ & 0xff0000) >> 16;
						int i_455_ = (i_392_ & 0xff00) >> 8;
						int i_456_ = i_392_ & 0xff;
						int i_457_ = i_392_ >>> 24;
						int i_458_ = 256 - i_457_;
						for (int i_459_ = -i_390_; i_459_ < 0; i_459_++) {
							int i_460_ = (i_397_ >> 16) * anInt8945;
							for (int i_461_ = -i_389_; i_461_ < 0; i_461_++) {
								if (!bool_386_ || f < fs[i_404_]) {
									int i_462_ = (anIntArray11347[(i_396_ >> 16) + i_460_]);
									if (i_462_ != 0) {
										if (i_457_ != 255) {
											if (bool) {
												int i_463_ = (((i_462_ & 0xff0000) * i_454_) & ~0xffffff);
												int i_464_ = (((i_462_ & 0xff00) * i_455_) & 0xff0000);
												int i_465_ = ((i_462_ & 0xff) * i_456_ & 0xff00);
												i_462_ = (i_463_ | i_464_ | i_465_) >>> 8;
												int i_466_ = is[i_404_];
												is[i_404_] = (((((i_462_ & 0xff00ff) * i_457_) + ((i_466_ & 0xff00ff) * i_458_)) & ~0xff00ff) + ((((i_462_ & 0xff00) * i_457_) + ((i_466_ & 0xff00) * i_458_)) & 0xff0000)) >> 8;
											}
											if (bool_386_ && bool_395_)
												fs[i_404_] = f;
										} else {
											if (bool) {
												int i_467_ = (((i_462_ & 0xff0000) * i_454_) & ~0xffffff);
												int i_468_ = (((i_462_ & 0xff00) * i_455_) & 0xff0000);
												int i_469_ = ((i_462_ & 0xff) * i_456_ & 0xff00);
												is[i_404_] = (i_467_ | i_468_ | i_469_) >>> 8;
											}
											if (bool_386_ && bool_395_)
												fs[i_404_] = f;
										}
									}
								}
								i_396_ += i_400_;
								i_404_++;
							}
							i_397_ += i_401_;
							i_396_ = i_446_;
							i_404_ += i_405_;
						}
					}
				} else if (i_391_ == 3) {
					int i_470_ = i_396_;
					int i_471_ = i_392_ >>> 24;
					int i_472_ = 256 - i_471_;
					for (int i_473_ = -i_390_; i_473_ < 0; i_473_++) {
						int i_474_ = (i_397_ >> 16) * anInt8945;
						for (int i_475_ = -i_389_; i_475_ < 0; i_475_++) {
							if (!bool_386_ || f < fs[i_404_]) {
								if (bool) {
									int i_476_ = (anIntArray11347[(i_396_ >> 16) + i_474_]);
									int i_477_ = i_476_ + i_392_;
									int i_478_ = ((i_476_ & 0xff00ff) + (i_392_ & 0xff00ff));
									int i_479_ = ((i_478_ & 0x1000100) + (i_477_ - i_478_ & 0x10000));
									i_479_ = i_477_ - i_479_ | i_479_ - (i_479_ >>> 8);
									if (i_476_ == 0 && i_471_ != 255) {
										i_476_ = i_479_;
										i_479_ = is[i_404_];
										i_479_ = ((((i_476_ & 0xff00ff) * i_471_ + ((i_479_ & 0xff00ff) * i_472_)) & ~0xff00ff) + (((i_476_ & 0xff00) * i_471_ + ((i_479_ & 0xff00) * i_472_)) & 0xff0000)) >> 8;
									}
									is[i_404_] = i_479_;
								}
								if (bool_386_ && bool_395_)
									fs[i_404_] = f;
							}
							i_396_ += i_400_;
							i_404_++;
						}
						i_397_ += i_401_;
						i_396_ = i_470_;
						i_404_ += i_405_;
					}
				} else if (i_391_ == 2) {
					int i_480_ = i_392_ >>> 24;
					int i_481_ = 256 - i_480_;
					int i_482_ = (i_392_ & 0xff00ff) * i_481_ & ~0xff00ff;
					int i_483_ = (i_392_ & 0xff00) * i_481_ & 0xff0000;
					i_392_ = (i_482_ | i_483_) >>> 8;
					int i_484_ = i_396_;
					for (int i_485_ = -i_390_; i_485_ < 0; i_485_++) {
						int i_486_ = (i_397_ >> 16) * anInt8945;
						for (int i_487_ = -i_389_; i_487_ < 0; i_487_++) {
							if (!bool_386_ || f < fs[i_404_]) {
								int i_488_ = anIntArray11347[(i_396_ >> 16) + i_486_];
								if (i_488_ != 0) {
									if (bool) {
										i_482_ = ((i_488_ & 0xff00ff) * i_480_ & ~0xff00ff);
										i_483_ = ((i_488_ & 0xff00) * i_480_ & 0xff0000);
										is[i_404_] = (((i_482_ | i_483_) >>> 8) + i_392_);
									}
									if (bool_386_ && bool_395_)
										fs[i_404_] = f;
								}
							}
							i_396_ += i_400_;
							i_404_++;
						}
						i_397_ += i_401_;
						i_396_ = i_484_;
						i_404_ += i_405_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_393_ == 2) {
				if (i_391_ == 1) {
					int i_489_ = i_396_;
					for (int i_490_ = -i_390_; i_490_ < 0; i_490_++) {
						int i_491_ = (i_397_ >> 16) * anInt8945;
						for (int i_492_ = -i_389_; i_492_ < 0; i_492_++) {
							if (!bool_386_ || f < fs[i_404_]) {
								int i_493_ = anIntArray11347[(i_396_ >> 16) + i_491_];
								if (i_493_ != 0) {
									if (bool) {
										int i_494_ = is[i_404_];
										int i_495_ = i_493_ + i_494_;
										int i_496_ = ((i_493_ & 0xff00ff) + (i_494_ & 0xff00ff));
										i_494_ = ((i_496_ & 0x1000100) + (i_495_ - i_496_ & 0x10000));
										is[i_404_] = (i_495_ - i_494_ | i_494_ - (i_494_ >>> 8));
									}
									if (bool_386_ && bool_395_)
										fs[i_404_] = f;
								}
							}
							i_396_ += i_400_;
							i_404_++;
						}
						i_397_ += i_401_;
						i_396_ = i_489_;
						i_404_ += i_405_;
					}
				} else if (i_391_ == 0) {
					int i_497_ = i_396_;
					int i_498_ = (i_392_ & 0xff0000) >> 16;
					int i_499_ = (i_392_ & 0xff00) >> 8;
					int i_500_ = i_392_ & 0xff;
					for (int i_501_ = -i_390_; i_501_ < 0; i_501_++) {
						int i_502_ = (i_397_ >> 16) * anInt8945;
						for (int i_503_ = -i_389_; i_503_ < 0; i_503_++) {
							if (!bool_386_ || f < fs[i_404_]) {
								int i_504_ = anIntArray11347[(i_396_ >> 16) + i_502_];
								if (i_504_ != 0) {
									if (bool) {
										int i_505_ = ((i_504_ & 0xff0000) * i_498_ & ~0xffffff);
										int i_506_ = ((i_504_ & 0xff00) * i_499_ & 0xff0000);
										int i_507_ = ((i_504_ & 0xff) * i_500_ & 0xff00);
										i_504_ = (i_505_ | i_506_ | i_507_) >>> 8;
										int i_508_ = is[i_404_];
										int i_509_ = i_504_ + i_508_;
										int i_510_ = ((i_504_ & 0xff00ff) + (i_508_ & 0xff00ff));
										i_508_ = ((i_510_ & 0x1000100) + (i_509_ - i_510_ & 0x10000));
										is[i_404_] = (i_509_ - i_508_ | i_508_ - (i_508_ >>> 8));
									}
									if (bool_386_ && bool_395_)
										fs[i_404_] = f;
								}
							}
							i_396_ += i_400_;
							i_404_++;
						}
						i_397_ += i_401_;
						i_396_ = i_497_;
						i_404_ += i_405_;
					}
				} else if (i_391_ == 3) {
					int i_511_ = i_396_;
					for (int i_512_ = -i_390_; i_512_ < 0; i_512_++) {
						int i_513_ = (i_397_ >> 16) * anInt8945;
						for (int i_514_ = -i_389_; i_514_ < 0; i_514_++) {
							if (!bool_386_ || f < fs[i_404_]) {
								if (bool) {
									int i_515_ = (anIntArray11347[(i_396_ >> 16) + i_513_]);
									int i_516_ = i_515_ + i_392_;
									int i_517_ = ((i_515_ & 0xff00ff) + (i_392_ & 0xff00ff));
									int i_518_ = ((i_517_ & 0x1000100) + (i_516_ - i_517_ & 0x10000));
									i_515_ = i_516_ - i_518_ | i_518_ - (i_518_ >>> 8);
									i_518_ = is[i_404_];
									i_516_ = i_515_ + i_518_;
									i_517_ = (i_515_ & 0xff00ff) + (i_518_ & 0xff00ff);
									i_518_ = ((i_517_ & 0x1000100) + (i_516_ - i_517_ & 0x10000));
									is[i_404_] = i_516_ - i_518_ | i_518_ - (i_518_ >>> 8);
								}
								if (bool_386_ && bool_395_)
									fs[i_404_] = f;
							}
							i_396_ += i_400_;
							i_404_++;
						}
						i_397_ += i_401_;
						i_396_ = i_511_;
						i_404_ += i_405_;
					}
				} else if (i_391_ == 2) {
					int i_519_ = i_392_ >>> 24;
					int i_520_ = 256 - i_519_;
					int i_521_ = (i_392_ & 0xff00ff) * i_520_ & ~0xff00ff;
					int i_522_ = (i_392_ & 0xff00) * i_520_ & 0xff0000;
					i_392_ = (i_521_ | i_522_) >>> 8;
					int i_523_ = i_396_;
					for (int i_524_ = -i_390_; i_524_ < 0; i_524_++) {
						int i_525_ = (i_397_ >> 16) * anInt8945;
						for (int i_526_ = -i_389_; i_526_ < 0; i_526_++) {
							if (!bool_386_ || f < fs[i_404_]) {
								int i_527_ = anIntArray11347[(i_396_ >> 16) + i_525_];
								if (i_527_ != 0) {
									if (bool) {
										i_521_ = ((i_527_ & 0xff00ff) * i_519_ & ~0xff00ff);
										i_522_ = ((i_527_ & 0xff00) * i_519_ & 0xff0000);
										i_527_ = (((i_521_ | i_522_) >>> 8) + i_392_);
										int i_528_ = is[i_404_];
										int i_529_ = i_527_ + i_528_;
										int i_530_ = ((i_527_ & 0xff00ff) + (i_528_ & 0xff00ff));
										i_528_ = ((i_530_ & 0x1000100) + (i_529_ - i_530_ & 0x10000));
										is[i_404_] = (i_529_ - i_528_ | i_528_ - (i_528_ >>> 8));
									}
									if (bool_386_ && bool_395_)
										fs[i_404_] = f;
								}
							}
							i_396_ += i_400_;
							i_404_++;
						}
						i_397_ += i_401_;
						i_396_ = i_523_;
						i_404_ += i_405_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method8432(int[] is, int[] is_531_, int i, int i_532_) {
		int[] is_533_ = aClass167_Sub1_8946.anIntArray8996;
		if (is_533_ != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_534_ = anInt8957;
					while (i_534_ < 0) {
						int i_535_ = i_534_ + i_532_;
						if (i_535_ >= 0) {
							if (i_535_ >= is.length)
								break;
							int i_536_ = anInt8959;
							int i_537_ = anInt8966;
							int i_538_ = anInt8967;
							int i_539_ = anInt8955;
							if (i_537_ >= 0 && i_538_ >= 0 && i_537_ - (anInt8945 << 12) < 0 && i_538_ - (anInt8950 << 12) < 0) {
								int i_540_ = is[i_535_] - i;
								int i_541_ = -is_531_[i_535_];
								int i_542_ = i_540_ - (i_536_ - anInt8959);
								if (i_542_ > 0) {
									i_536_ += i_542_;
									i_539_ += i_542_;
									i_537_ += anInt8960 * i_542_;
									i_538_ += anInt8962 * i_542_;
								} else
									i_541_ -= i_542_;
								if (i_539_ < i_541_)
									i_539_ = i_541_;
								for (/**/; i_539_ < 0; i_539_++) {
									int i_543_ = (anIntArray11347[((i_538_ >> 12) * anInt8945 + (i_537_ >> 12))]);
									if (i_543_ != 0)
										is_533_[i_536_++] = i_543_;
									else
										i_536_++;
								}
							}
						}
						i_534_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_544_ = anInt8957;
					while (i_544_ < 0) {
						int i_545_ = i_544_ + i_532_;
						if (i_545_ >= 0) {
							if (i_545_ >= is.length)
								break;
							int i_546_ = anInt8959;
							int i_547_ = anInt8966;
							int i_548_ = anInt8967 + anInt8969;
							int i_549_ = anInt8955;
							if (i_547_ >= 0 && i_547_ - (anInt8945 << 12) < 0) {
								int i_550_;
								if ((i_550_ = i_548_ - (anInt8950 << 12)) >= 0) {
									i_550_ = (anInt8962 - i_550_) / anInt8962;
									i_549_ += i_550_;
									i_548_ += anInt8962 * i_550_;
									i_546_ += i_550_;
								}
								if ((i_550_ = (i_548_ - anInt8962) / anInt8962) > i_549_)
									i_549_ = i_550_;
								int i_551_ = is[i_545_] - i;
								int i_552_ = -is_531_[i_545_];
								int i_553_ = i_551_ - (i_546_ - anInt8959);
								if (i_553_ > 0) {
									i_546_ += i_553_;
									i_549_ += i_553_;
									i_547_ += anInt8960 * i_553_;
									i_548_ += anInt8962 * i_553_;
								} else
									i_552_ -= i_553_;
								if (i_549_ < i_552_)
									i_549_ = i_552_;
								for (/**/; i_549_ < 0; i_549_++) {
									int i_554_ = (anIntArray11347[((i_548_ >> 12) * anInt8945 + (i_547_ >> 12))]);
									if (i_554_ != 0)
										is_533_[i_546_++] = i_554_;
									else
										i_546_++;
									i_548_ += anInt8962;
								}
							}
						}
						i_544_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_555_ = anInt8957;
					while (i_555_ < 0) {
						int i_556_ = i_555_ + i_532_;
						if (i_556_ >= 0) {
							if (i_556_ >= is.length)
								break;
							int i_557_ = anInt8959;
							int i_558_ = anInt8966;
							int i_559_ = anInt8967 + anInt8969;
							int i_560_ = anInt8955;
							if (i_558_ >= 0 && i_558_ - (anInt8945 << 12) < 0) {
								if (i_559_ < 0) {
									int i_561_ = (anInt8962 - 1 - i_559_) / anInt8962;
									i_560_ += i_561_;
									i_559_ += anInt8962 * i_561_;
									i_557_ += i_561_;
								}
								int i_562_;
								if ((i_562_ = (1 + i_559_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_560_)
									i_560_ = i_562_;
								int i_563_ = is[i_556_] - i;
								int i_564_ = -is_531_[i_556_];
								int i_565_ = i_563_ - (i_557_ - anInt8959);
								if (i_565_ > 0) {
									i_557_ += i_565_;
									i_560_ += i_565_;
									i_558_ += anInt8960 * i_565_;
									i_559_ += anInt8962 * i_565_;
								} else
									i_564_ -= i_565_;
								if (i_560_ < i_564_)
									i_560_ = i_564_;
								for (/**/; i_560_ < 0; i_560_++) {
									int i_566_ = (anIntArray11347[((i_559_ >> 12) * anInt8945 + (i_558_ >> 12))]);
									if (i_566_ != 0)
										is_533_[i_557_++] = i_566_;
									else
										i_557_++;
									i_559_ += anInt8962;
								}
							}
						}
						i_555_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_567_ = anInt8957;
					while (i_567_ < 0) {
						int i_568_ = i_567_ + i_532_;
						if (i_568_ >= 0) {
							if (i_568_ >= is.length)
								break;
							int i_569_ = anInt8959;
							int i_570_ = anInt8966 + anInt8968;
							int i_571_ = anInt8967;
							int i_572_ = anInt8955;
							if (i_571_ >= 0 && i_571_ - (anInt8950 << 12) < 0) {
								int i_573_;
								if ((i_573_ = i_570_ - (anInt8945 << 12)) >= 0) {
									i_573_ = (anInt8960 - i_573_) / anInt8960;
									i_572_ += i_573_;
									i_570_ += anInt8960 * i_573_;
									i_569_ += i_573_;
								}
								if ((i_573_ = (i_570_ - anInt8960) / anInt8960) > i_572_)
									i_572_ = i_573_;
								int i_574_ = is[i_568_] - i;
								int i_575_ = -is_531_[i_568_];
								int i_576_ = i_574_ - (i_569_ - anInt8959);
								if (i_576_ > 0) {
									i_569_ += i_576_;
									i_572_ += i_576_;
									i_570_ += anInt8960 * i_576_;
									i_571_ += anInt8962 * i_576_;
								} else
									i_575_ -= i_576_;
								if (i_572_ < i_575_)
									i_572_ = i_575_;
								for (/**/; i_572_ < 0; i_572_++) {
									int i_577_ = (anIntArray11347[((i_571_ >> 12) * anInt8945 + (i_570_ >> 12))]);
									if (i_577_ != 0)
										is_533_[i_569_++] = i_577_;
									else
										i_569_++;
									i_570_ += anInt8960;
								}
							}
						}
						i_567_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_578_ = anInt8957;
					while (i_578_ < 0) {
						int i_579_ = i_578_ + i_532_;
						if (i_579_ >= 0) {
							if (i_579_ >= is.length)
								break;
							int i_580_ = anInt8959;
							int i_581_ = anInt8966 + anInt8968;
							int i_582_ = anInt8967 + anInt8969;
							int i_583_ = anInt8955;
							int i_584_;
							if ((i_584_ = i_581_ - (anInt8945 << 12)) >= 0) {
								i_584_ = (anInt8960 - i_584_) / anInt8960;
								i_583_ += i_584_;
								i_581_ += anInt8960 * i_584_;
								i_582_ += anInt8962 * i_584_;
								i_580_ += i_584_;
							}
							if ((i_584_ = (i_581_ - anInt8960) / anInt8960) > i_583_)
								i_583_ = i_584_;
							if ((i_584_ = i_582_ - (anInt8950 << 12)) >= 0) {
								i_584_ = (anInt8962 - i_584_) / anInt8962;
								i_583_ += i_584_;
								i_581_ += anInt8960 * i_584_;
								i_582_ += anInt8962 * i_584_;
								i_580_ += i_584_;
							}
							if ((i_584_ = (i_582_ - anInt8962) / anInt8962) > i_583_)
								i_583_ = i_584_;
							int i_585_ = is[i_579_] - i;
							int i_586_ = -is_531_[i_579_];
							int i_587_ = i_585_ - (i_580_ - anInt8959);
							if (i_587_ > 0) {
								i_580_ += i_587_;
								i_583_ += i_587_;
								i_581_ += anInt8960 * i_587_;
								i_582_ += anInt8962 * i_587_;
							} else
								i_586_ -= i_587_;
							if (i_583_ < i_586_)
								i_583_ = i_586_;
							for (/**/; i_583_ < 0; i_583_++) {
								int i_588_ = (anIntArray11347[(i_582_ >> 12) * anInt8945 + (i_581_ >> 12)]);
								if (i_588_ != 0)
									is_533_[i_580_++] = i_588_;
								else
									i_580_++;
								i_581_ += anInt8960;
								i_582_ += anInt8962;
							}
						}
						i_578_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_589_ = anInt8957;
					while (i_589_ < 0) {
						int i_590_ = i_589_ + i_532_;
						if (i_590_ >= 0) {
							if (i_590_ >= is.length)
								break;
							int i_591_ = anInt8959;
							int i_592_ = anInt8966 + anInt8968;
							int i_593_ = anInt8967 + anInt8969;
							int i_594_ = anInt8955;
							int i_595_;
							if ((i_595_ = i_592_ - (anInt8945 << 12)) >= 0) {
								i_595_ = (anInt8960 - i_595_) / anInt8960;
								i_594_ += i_595_;
								i_592_ += anInt8960 * i_595_;
								i_593_ += anInt8962 * i_595_;
								i_591_ += i_595_;
							}
							if ((i_595_ = (i_592_ - anInt8960) / anInt8960) > i_594_)
								i_594_ = i_595_;
							if (i_593_ < 0) {
								i_595_ = (anInt8962 - 1 - i_593_) / anInt8962;
								i_594_ += i_595_;
								i_592_ += anInt8960 * i_595_;
								i_593_ += anInt8962 * i_595_;
								i_591_ += i_595_;
							}
							if ((i_595_ = (1 + i_593_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_594_)
								i_594_ = i_595_;
							int i_596_ = is[i_590_] - i;
							int i_597_ = -is_531_[i_590_];
							int i_598_ = i_596_ - (i_591_ - anInt8959);
							if (i_598_ > 0) {
								i_591_ += i_598_;
								i_594_ += i_598_;
								i_592_ += anInt8960 * i_598_;
								i_593_ += anInt8962 * i_598_;
							} else
								i_597_ -= i_598_;
							if (i_594_ < i_597_)
								i_594_ = i_597_;
							for (/**/; i_594_ < 0; i_594_++) {
								int i_599_ = (anIntArray11347[(i_593_ >> 12) * anInt8945 + (i_592_ >> 12)]);
								if (i_599_ != 0)
									is_533_[i_591_++] = i_599_;
								else
									i_591_++;
								i_592_ += anInt8960;
								i_593_ += anInt8962;
							}
						}
						i_589_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_600_ = anInt8957;
				while (i_600_ < 0) {
					int i_601_ = i_600_ + i_532_;
					if (i_601_ >= 0) {
						if (i_601_ >= is.length)
							break;
						int i_602_ = anInt8959;
						int i_603_ = anInt8966 + anInt8968;
						int i_604_ = anInt8967;
						int i_605_ = anInt8955;
						if (i_604_ >= 0 && i_604_ - (anInt8950 << 12) < 0) {
							if (i_603_ < 0) {
								int i_606_ = (anInt8960 - 1 - i_603_) / anInt8960;
								i_605_ += i_606_;
								i_603_ += anInt8960 * i_606_;
								i_602_ += i_606_;
							}
							int i_607_;
							if ((i_607_ = (1 + i_603_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_605_)
								i_605_ = i_607_;
							int i_608_ = is[i_601_] - i;
							int i_609_ = -is_531_[i_601_];
							int i_610_ = i_608_ - (i_602_ - anInt8959);
							if (i_610_ > 0) {
								i_602_ += i_610_;
								i_605_ += i_610_;
								i_603_ += anInt8960 * i_610_;
								i_604_ += anInt8962 * i_610_;
							} else
								i_609_ -= i_610_;
							if (i_605_ < i_609_)
								i_605_ = i_609_;
							for (/**/; i_605_ < 0; i_605_++) {
								int i_611_ = (anIntArray11347[(i_604_ >> 12) * anInt8945 + (i_603_ >> 12)]);
								if (i_611_ != 0)
									is_533_[i_602_++] = i_611_;
								else
									i_602_++;
								i_603_ += anInt8960;
							}
						}
					}
					i_600_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				int i_612_ = anInt8957;
				while (i_612_ < 0) {
					int i_613_ = i_612_ + i_532_;
					if (i_613_ >= 0) {
						if (i_613_ >= is.length)
							break;
						int i_614_ = anInt8959;
						int i_615_ = anInt8966 + anInt8968;
						int i_616_ = anInt8967 + anInt8969;
						int i_617_ = anInt8955;
						if (i_615_ < 0) {
							int i_618_ = (anInt8960 - 1 - i_615_) / anInt8960;
							i_617_ += i_618_;
							i_615_ += anInt8960 * i_618_;
							i_616_ += anInt8962 * i_618_;
							i_614_ += i_618_;
						}
						int i_619_;
						if ((i_619_ = (1 + i_615_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_617_)
							i_617_ = i_619_;
						if ((i_619_ = i_616_ - (anInt8950 << 12)) >= 0) {
							i_619_ = (anInt8962 - i_619_) / anInt8962;
							i_617_ += i_619_;
							i_615_ += anInt8960 * i_619_;
							i_616_ += anInt8962 * i_619_;
							i_614_ += i_619_;
						}
						if ((i_619_ = (i_616_ - anInt8962) / anInt8962) > i_617_)
							i_617_ = i_619_;
						int i_620_ = is[i_613_] - i;
						int i_621_ = -is_531_[i_613_];
						int i_622_ = i_620_ - (i_614_ - anInt8959);
						if (i_622_ > 0) {
							i_614_ += i_622_;
							i_617_ += i_622_;
							i_615_ += anInt8960 * i_622_;
							i_616_ += anInt8962 * i_622_;
						} else
							i_621_ -= i_622_;
						if (i_617_ < i_621_)
							i_617_ = i_621_;
						for (/**/; i_617_ < 0; i_617_++) {
							int i_623_ = (anIntArray11347[(i_616_ >> 12) * anInt8945 + (i_615_ >> 12)]);
							if (i_623_ != 0)
								is_533_[i_614_++] = i_623_;
							else
								i_614_++;
							i_615_ += anInt8960;
							i_616_ += anInt8962;
						}
					}
					i_612_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				int i_624_ = anInt8957;
				while (i_624_ < 0) {
					int i_625_ = i_624_ + i_532_;
					if (i_625_ >= 0) {
						if (i_625_ >= is.length)
							break;
						int i_626_ = anInt8959;
						int i_627_ = anInt8966 + anInt8968;
						int i_628_ = anInt8967 + anInt8969;
						int i_629_ = anInt8955;
						if (i_627_ < 0) {
							int i_630_ = (anInt8960 - 1 - i_627_) / anInt8960;
							i_629_ += i_630_;
							i_627_ += anInt8960 * i_630_;
							i_628_ += anInt8962 * i_630_;
							i_626_ += i_630_;
						}
						int i_631_;
						if ((i_631_ = (1 + i_627_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_629_)
							i_629_ = i_631_;
						if (i_628_ < 0) {
							i_631_ = (anInt8962 - 1 - i_628_) / anInt8962;
							i_629_ += i_631_;
							i_627_ += anInt8960 * i_631_;
							i_628_ += anInt8962 * i_631_;
							i_626_ += i_631_;
						}
						if ((i_631_ = (1 + i_628_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_629_)
							i_629_ = i_631_;
						int i_632_ = is[i_625_] - i;
						int i_633_ = -is_531_[i_625_];
						int i_634_ = i_632_ - (i_626_ - anInt8959);
						if (i_634_ > 0) {
							i_626_ += i_634_;
							i_629_ += i_634_;
							i_627_ += anInt8960 * i_634_;
							i_628_ += anInt8962 * i_634_;
						} else
							i_633_ -= i_634_;
						if (i_629_ < i_633_)
							i_629_ = i_633_;
						for (/**/; i_629_ < 0; i_629_++) {
							int i_635_ = (anIntArray11347[(i_628_ >> 12) * anInt8945 + (i_627_ >> 12)]);
							if (i_635_ != 0)
								is_533_[i_626_++] = i_635_;
							else
								i_626_++;
							i_627_ += anInt8960;
							i_628_ += anInt8962;
						}
					}
					i_624_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	void method8433(int i, int i_636_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_637_ = anInt8957;
					while (i_637_ < 0) {
						int i_638_ = anInt8959;
						int i_639_ = anInt8966;
						int i_640_ = anInt8967;
						int i_641_ = anInt8955;
						if (i_639_ >= 0 && i_640_ >= 0 && i_639_ - (anInt8945 << 12) < 0 && i_640_ - (anInt8950 << 12) < 0) {
							for (/**/; i_641_ < 0; i_641_++)
								method10515(((i_640_ >> 12) * anInt8945 + (i_639_ >> 12)), i_638_++, is, i, i_636_);
						}
						i_637_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_642_ = anInt8957;
					while (i_642_ < 0) {
						int i_643_ = anInt8959;
						int i_644_ = anInt8966;
						int i_645_ = anInt8967 + anInt8969;
						int i_646_ = anInt8955;
						if (i_644_ >= 0 && i_644_ - (anInt8945 << 12) < 0) {
							int i_647_;
							if ((i_647_ = i_645_ - (anInt8950 << 12)) >= 0) {
								i_647_ = (anInt8962 - i_647_) / anInt8962;
								i_646_ += i_647_;
								i_645_ += anInt8962 * i_647_;
								i_643_ += i_647_;
							}
							if ((i_647_ = (i_645_ - anInt8962) / anInt8962) > i_646_)
								i_646_ = i_647_;
							for (/**/; i_646_ < 0; i_646_++) {
								method10515(((i_645_ >> 12) * anInt8945 + (i_644_ >> 12)), i_643_++, is, i, i_636_);
								i_645_ += anInt8962;
							}
						}
						i_642_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_648_ = anInt8957;
					while (i_648_ < 0) {
						int i_649_ = anInt8959;
						int i_650_ = anInt8966;
						int i_651_ = anInt8967 + anInt8969;
						int i_652_ = anInt8955;
						if (i_650_ >= 0 && i_650_ - (anInt8945 << 12) < 0) {
							if (i_651_ < 0) {
								int i_653_ = (anInt8962 - 1 - i_651_) / anInt8962;
								i_652_ += i_653_;
								i_651_ += anInt8962 * i_653_;
								i_649_ += i_653_;
							}
							int i_654_;
							if ((i_654_ = (1 + i_651_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_652_)
								i_652_ = i_654_;
							for (/**/; i_652_ < 0; i_652_++) {
								method10515(((i_651_ >> 12) * anInt8945 + (i_650_ >> 12)), i_649_++, is, i, i_636_);
								i_651_ += anInt8962;
							}
						}
						i_648_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_655_ = anInt8957;
					while (i_655_ < 0) {
						int i_656_ = anInt8959;
						int i_657_ = anInt8966 + anInt8968;
						int i_658_ = anInt8967;
						int i_659_ = anInt8955;
						if (i_658_ >= 0 && i_658_ - (anInt8950 << 12) < 0) {
							int i_660_;
							if ((i_660_ = i_657_ - (anInt8945 << 12)) >= 0) {
								i_660_ = (anInt8960 - i_660_) / anInt8960;
								i_659_ += i_660_;
								i_657_ += anInt8960 * i_660_;
								i_656_ += i_660_;
							}
							if ((i_660_ = (i_657_ - anInt8960) / anInt8960) > i_659_)
								i_659_ = i_660_;
							for (/**/; i_659_ < 0; i_659_++) {
								method10515(((i_658_ >> 12) * anInt8945 + (i_657_ >> 12)), i_656_++, is, i, i_636_);
								i_657_ += anInt8960;
							}
						}
						i_655_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_661_ = anInt8957;
					while (i_661_ < 0) {
						int i_662_ = anInt8959;
						int i_663_ = anInt8966 + anInt8968;
						int i_664_ = anInt8967 + anInt8969;
						int i_665_ = anInt8955;
						int i_666_;
						if ((i_666_ = i_663_ - (anInt8945 << 12)) >= 0) {
							i_666_ = (anInt8960 - i_666_) / anInt8960;
							i_665_ += i_666_;
							i_663_ += anInt8960 * i_666_;
							i_664_ += anInt8962 * i_666_;
							i_662_ += i_666_;
						}
						if ((i_666_ = (i_663_ - anInt8960) / anInt8960) > i_665_)
							i_665_ = i_666_;
						if ((i_666_ = i_664_ - (anInt8950 << 12)) >= 0) {
							i_666_ = (anInt8962 - i_666_) / anInt8962;
							i_665_ += i_666_;
							i_663_ += anInt8960 * i_666_;
							i_664_ += anInt8962 * i_666_;
							i_662_ += i_666_;
						}
						if ((i_666_ = (i_664_ - anInt8962) / anInt8962) > i_665_)
							i_665_ = i_666_;
						for (/**/; i_665_ < 0; i_665_++) {
							method10515((i_664_ >> 12) * anInt8945 + (i_663_ >> 12), i_662_++, is, i, i_636_);
							i_663_ += anInt8960;
							i_664_ += anInt8962;
						}
						i_661_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_667_ = anInt8957;
					while (i_667_ < 0) {
						int i_668_ = anInt8959;
						int i_669_ = anInt8966 + anInt8968;
						int i_670_ = anInt8967 + anInt8969;
						int i_671_ = anInt8955;
						int i_672_;
						if ((i_672_ = i_669_ - (anInt8945 << 12)) >= 0) {
							i_672_ = (anInt8960 - i_672_) / anInt8960;
							i_671_ += i_672_;
							i_669_ += anInt8960 * i_672_;
							i_670_ += anInt8962 * i_672_;
							i_668_ += i_672_;
						}
						if ((i_672_ = (i_669_ - anInt8960) / anInt8960) > i_671_)
							i_671_ = i_672_;
						if (i_670_ < 0) {
							i_672_ = (anInt8962 - 1 - i_670_) / anInt8962;
							i_671_ += i_672_;
							i_669_ += anInt8960 * i_672_;
							i_670_ += anInt8962 * i_672_;
							i_668_ += i_672_;
						}
						if ((i_672_ = (1 + i_670_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_671_)
							i_671_ = i_672_;
						for (/**/; i_671_ < 0; i_671_++) {
							method10515((i_670_ >> 12) * anInt8945 + (i_669_ >> 12), i_668_++, is, i, i_636_);
							i_669_ += anInt8960;
							i_670_ += anInt8962;
						}
						i_667_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_673_ = anInt8957;
				while (i_673_ < 0) {
					int i_674_ = anInt8959;
					int i_675_ = anInt8966 + anInt8968;
					int i_676_ = anInt8967;
					int i_677_ = anInt8955;
					if (i_676_ >= 0 && i_676_ - (anInt8950 << 12) < 0) {
						if (i_675_ < 0) {
							int i_678_ = (anInt8960 - 1 - i_675_) / anInt8960;
							i_677_ += i_678_;
							i_675_ += anInt8960 * i_678_;
							i_674_ += i_678_;
						}
						int i_679_;
						if ((i_679_ = (1 + i_675_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_677_)
							i_677_ = i_679_;
						for (/**/; i_677_ < 0; i_677_++) {
							method10515((i_676_ >> 12) * anInt8945 + (i_675_ >> 12), i_674_++, is, i, i_636_);
							i_675_ += anInt8960;
						}
					}
					i_673_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				for (int i_680_ = anInt8957; i_680_ < 0; i_680_++) {
					int i_681_ = anInt8959;
					int i_682_ = anInt8966 + anInt8968;
					int i_683_ = anInt8967 + anInt8969;
					int i_684_ = anInt8955;
					if (i_682_ < 0) {
						int i_685_ = (anInt8960 - 1 - i_682_) / anInt8960;
						i_684_ += i_685_;
						i_682_ += anInt8960 * i_685_;
						i_683_ += anInt8962 * i_685_;
						i_681_ += i_685_;
					}
					int i_686_;
					if ((i_686_ = ((1 + i_682_ - (anInt8945 << 12) - anInt8960) / anInt8960)) > i_684_)
						i_684_ = i_686_;
					if ((i_686_ = i_683_ - (anInt8950 << 12)) >= 0) {
						i_686_ = (anInt8962 - i_686_) / anInt8962;
						i_684_ += i_686_;
						i_682_ += anInt8960 * i_686_;
						i_683_ += anInt8962 * i_686_;
						i_681_ += i_686_;
					}
					if ((i_686_ = (i_683_ - anInt8962) / anInt8962) > i_684_)
						i_684_ = i_686_;
					for (/**/; i_684_ < 0; i_684_++) {
						method10515((i_683_ >> 12) * anInt8945 + (i_682_ >> 12), i_681_++, is, i, i_636_);
						i_682_ += anInt8960;
						i_683_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				for (int i_687_ = anInt8957; i_687_ < 0; i_687_++) {
					int i_688_ = anInt8959;
					int i_689_ = anInt8966 + anInt8968;
					int i_690_ = anInt8967 + anInt8969;
					int i_691_ = anInt8955;
					if (i_689_ < 0) {
						int i_692_ = (anInt8960 - 1 - i_689_) / anInt8960;
						i_691_ += i_692_;
						i_689_ += anInt8960 * i_692_;
						i_690_ += anInt8962 * i_692_;
						i_688_ += i_692_;
					}
					int i_693_;
					if ((i_693_ = ((1 + i_689_ - (anInt8945 << 12) - anInt8960) / anInt8960)) > i_691_)
						i_691_ = i_693_;
					if (i_690_ < 0) {
						i_693_ = (anInt8962 - 1 - i_690_) / anInt8962;
						i_691_ += i_693_;
						i_689_ += anInt8960 * i_693_;
						i_690_ += anInt8962 * i_693_;
						i_688_ += i_693_;
					}
					if ((i_693_ = ((1 + i_690_ - (anInt8950 << 12) - anInt8962) / anInt8962)) > i_691_)
						i_691_ = i_693_;
					for (/**/; i_691_ < 0; i_691_++) {
						method10515((i_690_ >> 12) * anInt8945 + (i_689_ >> 12), i_688_++, is, i, i_636_);
						i_689_ += anInt8960;
						i_690_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	Class143_Sub1_Sub2(Class167_Sub1 class167_sub1, int[] is, int i, int i_694_, int i_695_, int i_696_, boolean bool) {
		super(class167_sub1, i_695_, i_696_);
		if (bool)
			anIntArray11347 = new int[i_695_ * i_696_];
		else
			anIntArray11347 = is;
		i_694_ -= anInt8945;
		int i_697_ = 0;
		for (int i_698_ = 0; i_698_ < i_696_; i_698_++) {
			for (int i_699_ = 0; i_699_ < i_695_; i_699_++) {
				int i_700_ = is[i++];
				if (i_700_ >>> 24 == 255)
					anIntArray11347[i_697_++] = (i_700_ & 0xffffff) == 0 ? -16777215 : i_700_;
				else
					anIntArray11347[i_697_++] = 0;
			}
			i += i_694_;
		}
	}

	public void method1757(int i, int i_701_, int i_702_, int i_703_, int[] is, int i_704_, int i_705_) {
		i_705_ -= i_702_;
		for (int i_706_ = 0; i_706_ < i_703_; i_706_++) {
			int i_707_ = (i_701_ + i_706_) * i_702_ + i;
			for (int i_708_ = 0; i_708_ < i_702_; i_708_++)
				anIntArray11347[i_707_ + i_708_] = is[i_704_++];
			i_704_ += i_705_;
		}
	}

	public void method1745(int i, int i_709_, int i_710_, int i_711_, int[] is, int i_712_, int i_713_) {
		i_713_ -= i_710_;
		for (int i_714_ = 0; i_714_ < i_711_; i_714_++) {
			int i_715_ = (i_709_ + i_714_) * i_710_ + i;
			for (int i_716_ = 0; i_716_ < i_710_; i_716_++)
				anIntArray11347[i_715_ + i_716_] = is[i_712_++];
			i_712_ += i_713_;
		}
	}

	void method10514(int i, int i_717_, int i_718_, int i_719_, int[] is, int i_720_, int i_721_) {
		i_721_ -= i_718_;
		for (int i_722_ = 0; i_722_ < i_719_; i_722_++) {
			int i_723_ = (i_717_ + i_722_) * i_718_ + i;
			for (int i_724_ = 0; i_724_ < i_718_; i_724_++)
				is[i_720_++] = anIntArray11347[i_723_ + i_724_];
			i_720_ += i_721_;
		}
	}

	public void method1727(int i, int i_725_, int i_726_) {
		throw new IllegalStateException("");
	}

	void method8437(int i, int i_727_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_728_ = anInt8957;
					while (i_728_ < 0) {
						int i_729_ = anInt8959;
						int i_730_ = anInt8966;
						int i_731_ = anInt8967;
						int i_732_ = anInt8955;
						if (i_730_ >= 0 && i_731_ >= 0 && i_730_ - (anInt8945 << 12) < 0 && i_731_ - (anInt8950 << 12) < 0) {
							for (/**/; i_732_ < 0; i_732_++)
								method10515(((i_731_ >> 12) * anInt8945 + (i_730_ >> 12)), i_729_++, is, i, i_727_);
						}
						i_728_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_733_ = anInt8957;
					while (i_733_ < 0) {
						int i_734_ = anInt8959;
						int i_735_ = anInt8966;
						int i_736_ = anInt8967 + anInt8969;
						int i_737_ = anInt8955;
						if (i_735_ >= 0 && i_735_ - (anInt8945 << 12) < 0) {
							int i_738_;
							if ((i_738_ = i_736_ - (anInt8950 << 12)) >= 0) {
								i_738_ = (anInt8962 - i_738_) / anInt8962;
								i_737_ += i_738_;
								i_736_ += anInt8962 * i_738_;
								i_734_ += i_738_;
							}
							if ((i_738_ = (i_736_ - anInt8962) / anInt8962) > i_737_)
								i_737_ = i_738_;
							for (/**/; i_737_ < 0; i_737_++) {
								method10515(((i_736_ >> 12) * anInt8945 + (i_735_ >> 12)), i_734_++, is, i, i_727_);
								i_736_ += anInt8962;
							}
						}
						i_733_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_739_ = anInt8957;
					while (i_739_ < 0) {
						int i_740_ = anInt8959;
						int i_741_ = anInt8966;
						int i_742_ = anInt8967 + anInt8969;
						int i_743_ = anInt8955;
						if (i_741_ >= 0 && i_741_ - (anInt8945 << 12) < 0) {
							if (i_742_ < 0) {
								int i_744_ = (anInt8962 - 1 - i_742_) / anInt8962;
								i_743_ += i_744_;
								i_742_ += anInt8962 * i_744_;
								i_740_ += i_744_;
							}
							int i_745_;
							if ((i_745_ = (1 + i_742_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_743_)
								i_743_ = i_745_;
							for (/**/; i_743_ < 0; i_743_++) {
								method10515(((i_742_ >> 12) * anInt8945 + (i_741_ >> 12)), i_740_++, is, i, i_727_);
								i_742_ += anInt8962;
							}
						}
						i_739_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_746_ = anInt8957;
					while (i_746_ < 0) {
						int i_747_ = anInt8959;
						int i_748_ = anInt8966 + anInt8968;
						int i_749_ = anInt8967;
						int i_750_ = anInt8955;
						if (i_749_ >= 0 && i_749_ - (anInt8950 << 12) < 0) {
							int i_751_;
							if ((i_751_ = i_748_ - (anInt8945 << 12)) >= 0) {
								i_751_ = (anInt8960 - i_751_) / anInt8960;
								i_750_ += i_751_;
								i_748_ += anInt8960 * i_751_;
								i_747_ += i_751_;
							}
							if ((i_751_ = (i_748_ - anInt8960) / anInt8960) > i_750_)
								i_750_ = i_751_;
							for (/**/; i_750_ < 0; i_750_++) {
								method10515(((i_749_ >> 12) * anInt8945 + (i_748_ >> 12)), i_747_++, is, i, i_727_);
								i_748_ += anInt8960;
							}
						}
						i_746_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_752_ = anInt8957;
					while (i_752_ < 0) {
						int i_753_ = anInt8959;
						int i_754_ = anInt8966 + anInt8968;
						int i_755_ = anInt8967 + anInt8969;
						int i_756_ = anInt8955;
						int i_757_;
						if ((i_757_ = i_754_ - (anInt8945 << 12)) >= 0) {
							i_757_ = (anInt8960 - i_757_) / anInt8960;
							i_756_ += i_757_;
							i_754_ += anInt8960 * i_757_;
							i_755_ += anInt8962 * i_757_;
							i_753_ += i_757_;
						}
						if ((i_757_ = (i_754_ - anInt8960) / anInt8960) > i_756_)
							i_756_ = i_757_;
						if ((i_757_ = i_755_ - (anInt8950 << 12)) >= 0) {
							i_757_ = (anInt8962 - i_757_) / anInt8962;
							i_756_ += i_757_;
							i_754_ += anInt8960 * i_757_;
							i_755_ += anInt8962 * i_757_;
							i_753_ += i_757_;
						}
						if ((i_757_ = (i_755_ - anInt8962) / anInt8962) > i_756_)
							i_756_ = i_757_;
						for (/**/; i_756_ < 0; i_756_++) {
							method10515((i_755_ >> 12) * anInt8945 + (i_754_ >> 12), i_753_++, is, i, i_727_);
							i_754_ += anInt8960;
							i_755_ += anInt8962;
						}
						i_752_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_758_ = anInt8957;
					while (i_758_ < 0) {
						int i_759_ = anInt8959;
						int i_760_ = anInt8966 + anInt8968;
						int i_761_ = anInt8967 + anInt8969;
						int i_762_ = anInt8955;
						int i_763_;
						if ((i_763_ = i_760_ - (anInt8945 << 12)) >= 0) {
							i_763_ = (anInt8960 - i_763_) / anInt8960;
							i_762_ += i_763_;
							i_760_ += anInt8960 * i_763_;
							i_761_ += anInt8962 * i_763_;
							i_759_ += i_763_;
						}
						if ((i_763_ = (i_760_ - anInt8960) / anInt8960) > i_762_)
							i_762_ = i_763_;
						if (i_761_ < 0) {
							i_763_ = (anInt8962 - 1 - i_761_) / anInt8962;
							i_762_ += i_763_;
							i_760_ += anInt8960 * i_763_;
							i_761_ += anInt8962 * i_763_;
							i_759_ += i_763_;
						}
						if ((i_763_ = (1 + i_761_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_762_)
							i_762_ = i_763_;
						for (/**/; i_762_ < 0; i_762_++) {
							method10515((i_761_ >> 12) * anInt8945 + (i_760_ >> 12), i_759_++, is, i, i_727_);
							i_760_ += anInt8960;
							i_761_ += anInt8962;
						}
						i_758_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_764_ = anInt8957;
				while (i_764_ < 0) {
					int i_765_ = anInt8959;
					int i_766_ = anInt8966 + anInt8968;
					int i_767_ = anInt8967;
					int i_768_ = anInt8955;
					if (i_767_ >= 0 && i_767_ - (anInt8950 << 12) < 0) {
						if (i_766_ < 0) {
							int i_769_ = (anInt8960 - 1 - i_766_) / anInt8960;
							i_768_ += i_769_;
							i_766_ += anInt8960 * i_769_;
							i_765_ += i_769_;
						}
						int i_770_;
						if ((i_770_ = (1 + i_766_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_768_)
							i_768_ = i_770_;
						for (/**/; i_768_ < 0; i_768_++) {
							method10515((i_767_ >> 12) * anInt8945 + (i_766_ >> 12), i_765_++, is, i, i_727_);
							i_766_ += anInt8960;
						}
					}
					i_764_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				for (int i_771_ = anInt8957; i_771_ < 0; i_771_++) {
					int i_772_ = anInt8959;
					int i_773_ = anInt8966 + anInt8968;
					int i_774_ = anInt8967 + anInt8969;
					int i_775_ = anInt8955;
					if (i_773_ < 0) {
						int i_776_ = (anInt8960 - 1 - i_773_) / anInt8960;
						i_775_ += i_776_;
						i_773_ += anInt8960 * i_776_;
						i_774_ += anInt8962 * i_776_;
						i_772_ += i_776_;
					}
					int i_777_;
					if ((i_777_ = ((1 + i_773_ - (anInt8945 << 12) - anInt8960) / anInt8960)) > i_775_)
						i_775_ = i_777_;
					if ((i_777_ = i_774_ - (anInt8950 << 12)) >= 0) {
						i_777_ = (anInt8962 - i_777_) / anInt8962;
						i_775_ += i_777_;
						i_773_ += anInt8960 * i_777_;
						i_774_ += anInt8962 * i_777_;
						i_772_ += i_777_;
					}
					if ((i_777_ = (i_774_ - anInt8962) / anInt8962) > i_775_)
						i_775_ = i_777_;
					for (/**/; i_775_ < 0; i_775_++) {
						method10515((i_774_ >> 12) * anInt8945 + (i_773_ >> 12), i_772_++, is, i, i_727_);
						i_773_ += anInt8960;
						i_774_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				for (int i_778_ = anInt8957; i_778_ < 0; i_778_++) {
					int i_779_ = anInt8959;
					int i_780_ = anInt8966 + anInt8968;
					int i_781_ = anInt8967 + anInt8969;
					int i_782_ = anInt8955;
					if (i_780_ < 0) {
						int i_783_ = (anInt8960 - 1 - i_780_) / anInt8960;
						i_782_ += i_783_;
						i_780_ += anInt8960 * i_783_;
						i_781_ += anInt8962 * i_783_;
						i_779_ += i_783_;
					}
					int i_784_;
					if ((i_784_ = ((1 + i_780_ - (anInt8945 << 12) - anInt8960) / anInt8960)) > i_782_)
						i_782_ = i_784_;
					if (i_781_ < 0) {
						i_784_ = (anInt8962 - 1 - i_781_) / anInt8962;
						i_782_ += i_784_;
						i_780_ += anInt8960 * i_784_;
						i_781_ += anInt8962 * i_784_;
						i_779_ += i_784_;
					}
					if ((i_784_ = ((1 + i_781_ - (anInt8950 << 12) - anInt8962) / anInt8962)) > i_782_)
						i_782_ = i_784_;
					for (/**/; i_782_ < 0; i_782_++) {
						method10515((i_781_ >> 12) * anInt8945 + (i_780_ >> 12), i_779_++, is, i, i_727_);
						i_780_ += anInt8960;
						i_781_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	public void method1747(int i, int i_785_, int i_786_, int i_787_, int[] is, int[] is_788_, int i_789_, int i_790_) {
		method10513(i, i_785_, i_786_, i_787_, is, i_789_, i_790_);
	}

	public void method1764(int i, int i_791_, Class161 class161, int i_792_, int i_793_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			i += anInt8977;
			i_791_ += anInt8947;
			int i_794_ = 0;
			int i_795_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			int i_796_ = anInt8945;
			int i_797_ = anInt8950;
			int i_798_ = i_795_ - i_796_;
			int i_799_ = 0;
			int i_800_ = i + i_791_ * i_795_;
			if (i_791_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_801_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_791_;
				i_797_ -= i_801_;
				i_791_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_794_ += i_801_ * i_796_;
				i_800_ += i_801_ * i_795_;
			}
			if (i_791_ + i_797_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_797_ -= (i_791_ + i_797_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_802_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_796_ -= i_802_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_794_ += i_802_;
				i_800_ += i_802_;
				i_799_ += i_802_;
				i_798_ += i_802_;
			}
			if (i + i_796_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_803_ = i + i_796_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_796_ -= i_803_;
				i_799_ += i_803_;
				i_798_ += i_803_;
			}
			if (i_796_ > 0 && i_797_ > 0) {
				Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
				int[] is_804_ = class161_sub2.anIntArray9444;
				int[] is_805_ = class161_sub2.anIntArray9445;
				int i_806_ = i_791_;
				if (i_793_ > i_806_) {
					i_806_ = i_793_;
					i_800_ += (i_793_ - i_791_) * i_795_;
					i_794_ += (i_793_ - i_791_) * anInt8945;
				}
				int i_807_ = (i_793_ + is_804_.length < i_791_ + i_797_ ? i_793_ + is_804_.length : i_791_ + i_797_);
				for (int i_808_ = i_806_; i_808_ < i_807_; i_808_++) {
					int i_809_ = is_804_[i_808_ - i_793_] + i_792_;
					int i_810_ = is_805_[i_808_ - i_793_];
					int i_811_ = i_796_;
					if (i > i_809_) {
						int i_812_ = i - i_809_;
						if (i_812_ >= i_810_) {
							i_794_ += i_796_ + i_799_;
							i_800_ += i_796_ + i_798_;
							continue;
						}
						i_810_ -= i_812_;
					} else {
						int i_813_ = i_809_ - i;
						if (i_813_ >= i_796_) {
							i_794_ += i_796_ + i_799_;
							i_800_ += i_796_ + i_798_;
							continue;
						}
						i_794_ += i_813_;
						i_811_ -= i_813_;
						i_800_ += i_813_;
					}
					int i_814_ = 0;
					if (i_811_ < i_810_)
						i_810_ = i_811_;
					else
						i_814_ = i_811_ - i_810_;
					for (int i_815_ = -i_810_; i_815_ < 0; i_815_++) {
						int i_816_ = anIntArray11347[i_794_++];
						if (i_816_ != 0)
							is[i_800_++] = i_816_;
						else
							i_800_++;
					}
					i_794_ += i_814_ + i_799_;
					i_800_ += i_814_ + i_798_;
				}
			}
		}
	}

	public void method1742(int i, int i_817_, int i_818_) {
		throw new IllegalStateException("");
	}

	public void method1750(int i, int i_819_, int i_820_) {
		throw new IllegalStateException("");
	}

	public Interface22 method1779() {
		return new Class104(anInt8945, anInt8950, anIntArray11347);
	}

	public Interface22 method1784() {
		return new Class104(anInt8945, anInt8950, anIntArray11347);
	}

	public Interface22 method1722() {
		return new Class104(anInt8945, anInt8950, anIntArray11347);
	}

	public void method1763(int i, int i_821_, int i_822_, int i_823_, int i_824_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			int i_825_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			i += anInt8977;
			i_821_ += anInt8947;
			int i_826_ = i_821_ * i_825_ + i;
			int i_827_ = 0;
			int i_828_ = anInt8950;
			int i_829_ = anInt8945;
			int i_830_ = i_825_ - i_829_;
			int i_831_ = 0;
			if (i_821_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_832_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_821_;
				i_828_ -= i_832_;
				i_821_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_827_ += i_832_ * i_829_;
				i_826_ += i_832_ * i_825_;
			}
			if (i_821_ + i_828_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_828_ -= (i_821_ + i_828_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_833_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_829_ -= i_833_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_827_ += i_833_;
				i_826_ += i_833_;
				i_831_ += i_833_;
				i_830_ += i_833_;
			}
			if (i + i_829_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_834_ = i + i_829_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_829_ -= i_834_;
				i_831_ += i_834_;
				i_830_ += i_834_;
			}
			if (i_829_ > 0 && i_828_ > 0) {
				if (i_824_ == 0) {
					if (i_822_ == 1) {
						for (int i_835_ = -i_828_; i_835_ < 0; i_835_++) {
							int i_836_ = i_826_ + i_829_ - 3;
							while (i_826_ < i_836_) {
								is[i_826_++] = anIntArray11347[i_827_++];
								is[i_826_++] = anIntArray11347[i_827_++];
								is[i_826_++] = anIntArray11347[i_827_++];
								is[i_826_++] = anIntArray11347[i_827_++];
							}
							i_836_ += 3;
							while (i_826_ < i_836_)
								is[i_826_++] = anIntArray11347[i_827_++];
							i_826_ += i_830_;
							i_827_ += i_831_;
						}
					} else if (i_822_ == 0) {
						int i_837_ = (i_823_ & 0xff0000) >> 16;
						int i_838_ = (i_823_ & 0xff00) >> 8;
						int i_839_ = i_823_ & 0xff;
						for (int i_840_ = -i_828_; i_840_ < 0; i_840_++) {
							for (int i_841_ = -i_829_; i_841_ < 0; i_841_++) {
								int i_842_ = anIntArray11347[i_827_++];
								int i_843_ = (i_842_ & 0xff0000) * i_837_ & ~0xffffff;
								int i_844_ = (i_842_ & 0xff00) * i_838_ & 0xff0000;
								int i_845_ = (i_842_ & 0xff) * i_839_ & 0xff00;
								is[i_826_++] = (i_843_ | i_844_ | i_845_) >>> 8;
							}
							i_826_ += i_830_;
							i_827_ += i_831_;
						}
					} else if (i_822_ == 3) {
						for (int i_846_ = -i_828_; i_846_ < 0; i_846_++) {
							for (int i_847_ = -i_829_; i_847_ < 0; i_847_++) {
								int i_848_ = anIntArray11347[i_827_++];
								int i_849_ = i_848_ + i_823_;
								int i_850_ = ((i_848_ & 0xff00ff) + (i_823_ & 0xff00ff));
								int i_851_ = ((i_850_ & 0x1000100) + (i_849_ - i_850_ & 0x10000));
								is[i_826_++] = i_849_ - i_851_ | i_851_ - (i_851_ >>> 8);
							}
							i_826_ += i_830_;
							i_827_ += i_831_;
						}
					} else if (i_822_ == 2) {
						int i_852_ = i_823_ >>> 24;
						int i_853_ = 256 - i_852_;
						int i_854_ = (i_823_ & 0xff00ff) * i_853_ & ~0xff00ff;
						int i_855_ = (i_823_ & 0xff00) * i_853_ & 0xff0000;
						i_823_ = (i_854_ | i_855_) >>> 8;
						for (int i_856_ = -i_828_; i_856_ < 0; i_856_++) {
							for (int i_857_ = -i_829_; i_857_ < 0; i_857_++) {
								int i_858_ = anIntArray11347[i_827_++];
								i_854_ = (i_858_ & 0xff00ff) * i_852_ & ~0xff00ff;
								i_855_ = (i_858_ & 0xff00) * i_852_ & 0xff0000;
								is[i_826_++] = ((i_854_ | i_855_) >>> 8) + i_823_;
							}
							i_826_ += i_830_;
							i_827_ += i_831_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_824_ == 1) {
					if (i_822_ == 1) {
						for (int i_859_ = -i_828_; i_859_ < 0; i_859_++) {
							int i_860_ = i_826_ + i_829_ - 3;
							while (i_826_ < i_860_) {
								int i_861_ = anIntArray11347[i_827_++];
								if (i_861_ != 0)
									is[i_826_++] = i_861_;
								else
									i_826_++;
								i_861_ = anIntArray11347[i_827_++];
								if (i_861_ != 0)
									is[i_826_++] = i_861_;
								else
									i_826_++;
								i_861_ = anIntArray11347[i_827_++];
								if (i_861_ != 0)
									is[i_826_++] = i_861_;
								else
									i_826_++;
								i_861_ = anIntArray11347[i_827_++];
								if (i_861_ != 0)
									is[i_826_++] = i_861_;
								else
									i_826_++;
							}
							i_860_ += 3;
							while (i_826_ < i_860_) {
								int i_862_ = anIntArray11347[i_827_++];
								if (i_862_ != 0)
									is[i_826_++] = i_862_;
								else
									i_826_++;
							}
							i_826_ += i_830_;
							i_827_ += i_831_;
						}
					} else if (i_822_ == 0) {
						if ((i_823_ & 0xffffff) == 16777215) {
							int i_863_ = i_823_ >>> 24;
							int i_864_ = 256 - i_863_;
							for (int i_865_ = -i_828_; i_865_ < 0; i_865_++) {
								for (int i_866_ = -i_829_; i_866_ < 0; i_866_++) {
									int i_867_ = anIntArray11347[i_827_++];
									if (i_867_ != 0) {
										int i_868_ = is[i_826_];
										is[i_826_++] = ((((i_867_ & 0xff00ff) * i_863_ + ((i_868_ & 0xff00ff) * i_864_)) & ~0xff00ff) + (((i_867_ & 0xff00) * i_863_ + ((i_868_ & 0xff00) * i_864_)) & 0xff0000)) >> 8;
									} else
										i_826_++;
								}
								i_826_ += i_830_;
								i_827_ += i_831_;
							}
						} else {
							int i_869_ = (i_823_ & 0xff0000) >> 16;
							int i_870_ = (i_823_ & 0xff00) >> 8;
							int i_871_ = i_823_ & 0xff;
							int i_872_ = i_823_ >>> 24;
							int i_873_ = 256 - i_872_;
							for (int i_874_ = -i_828_; i_874_ < 0; i_874_++) {
								for (int i_875_ = -i_829_; i_875_ < 0; i_875_++) {
									int i_876_ = anIntArray11347[i_827_++];
									if (i_876_ != 0) {
										if (i_872_ != 255) {
											int i_877_ = ((i_876_ & 0xff0000) * i_869_ & ~0xffffff);
											int i_878_ = ((i_876_ & 0xff00) * i_870_ & 0xff0000);
											int i_879_ = ((i_876_ & 0xff) * i_871_ & 0xff00);
											i_876_ = (i_877_ | i_878_ | i_879_) >>> 8;
											int i_880_ = is[i_826_];
											is[i_826_++] = (((((i_876_ & 0xff00ff) * i_872_) + ((i_880_ & 0xff00ff) * i_873_)) & ~0xff00ff) + ((((i_876_ & 0xff00) * i_872_) + ((i_880_ & 0xff00) * i_873_)) & 0xff0000)) >> 8;
										} else {
											int i_881_ = ((i_876_ & 0xff0000) * i_869_ & ~0xffffff);
											int i_882_ = ((i_876_ & 0xff00) * i_870_ & 0xff0000);
											int i_883_ = ((i_876_ & 0xff) * i_871_ & 0xff00);
											is[i_826_++] = (i_881_ | i_882_ | i_883_) >>> 8;
										}
									} else
										i_826_++;
								}
								i_826_ += i_830_;
								i_827_ += i_831_;
							}
						}
					} else if (i_822_ == 3) {
						int i_884_ = i_823_ >>> 24;
						int i_885_ = 256 - i_884_;
						for (int i_886_ = -i_828_; i_886_ < 0; i_886_++) {
							for (int i_887_ = -i_829_; i_887_ < 0; i_887_++) {
								int i_888_ = anIntArray11347[i_827_++];
								int i_889_ = i_888_ + i_823_;
								int i_890_ = ((i_888_ & 0xff00ff) + (i_823_ & 0xff00ff));
								int i_891_ = ((i_890_ & 0x1000100) + (i_889_ - i_890_ & 0x10000));
								i_891_ = i_889_ - i_891_ | i_891_ - (i_891_ >>> 8);
								if (i_888_ == 0 && i_884_ != 255) {
									i_888_ = i_891_;
									i_891_ = is[i_826_];
									i_891_ = ((((i_888_ & 0xff00ff) * i_884_ + (i_891_ & 0xff00ff) * i_885_) & ~0xff00ff) + (((i_888_ & 0xff00) * i_884_ + (i_891_ & 0xff00) * i_885_) & 0xff0000)) >> 8;
								}
								is[i_826_++] = i_891_;
							}
							i_826_ += i_830_;
							i_827_ += i_831_;
						}
					} else if (i_822_ == 2) {
						int i_892_ = i_823_ >>> 24;
						int i_893_ = 256 - i_892_;
						int i_894_ = (i_823_ & 0xff00ff) * i_893_ & ~0xff00ff;
						int i_895_ = (i_823_ & 0xff00) * i_893_ & 0xff0000;
						i_823_ = (i_894_ | i_895_) >>> 8;
						for (int i_896_ = -i_828_; i_896_ < 0; i_896_++) {
							for (int i_897_ = -i_829_; i_897_ < 0; i_897_++) {
								int i_898_ = anIntArray11347[i_827_++];
								if (i_898_ != 0) {
									i_894_ = ((i_898_ & 0xff00ff) * i_892_ & ~0xff00ff);
									i_895_ = ((i_898_ & 0xff00) * i_892_ & 0xff0000);
									is[i_826_++] = ((i_894_ | i_895_) >>> 8) + i_823_;
								} else
									i_826_++;
							}
							i_826_ += i_830_;
							i_827_ += i_831_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_824_ == 2) {
					if (i_822_ == 1) {
						for (int i_899_ = -i_828_; i_899_ < 0; i_899_++) {
							for (int i_900_ = -i_829_; i_900_ < 0; i_900_++) {
								int i_901_ = anIntArray11347[i_827_++];
								if (i_901_ != 0) {
									int i_902_ = is[i_826_];
									int i_903_ = i_901_ + i_902_;
									int i_904_ = ((i_901_ & 0xff00ff) + (i_902_ & 0xff00ff));
									i_902_ = ((i_904_ & 0x1000100) + (i_903_ - i_904_ & 0x10000));
									is[i_826_++] = i_903_ - i_902_ | i_902_ - (i_902_ >>> 8);
								} else
									i_826_++;
							}
							i_826_ += i_830_;
							i_827_ += i_831_;
						}
					} else if (i_822_ == 0) {
						int i_905_ = (i_823_ & 0xff0000) >> 16;
						int i_906_ = (i_823_ & 0xff00) >> 8;
						int i_907_ = i_823_ & 0xff;
						for (int i_908_ = -i_828_; i_908_ < 0; i_908_++) {
							for (int i_909_ = -i_829_; i_909_ < 0; i_909_++) {
								int i_910_ = anIntArray11347[i_827_++];
								if (i_910_ != 0) {
									int i_911_ = ((i_910_ & 0xff0000) * i_905_ & ~0xffffff);
									int i_912_ = ((i_910_ & 0xff00) * i_906_ & 0xff0000);
									int i_913_ = (i_910_ & 0xff) * i_907_ & 0xff00;
									i_910_ = (i_911_ | i_912_ | i_913_) >>> 8;
									int i_914_ = is[i_826_];
									int i_915_ = i_910_ + i_914_;
									int i_916_ = ((i_910_ & 0xff00ff) + (i_914_ & 0xff00ff));
									i_914_ = ((i_916_ & 0x1000100) + (i_915_ - i_916_ & 0x10000));
									is[i_826_++] = i_915_ - i_914_ | i_914_ - (i_914_ >>> 8);
								} else
									i_826_++;
							}
							i_826_ += i_830_;
							i_827_ += i_831_;
						}
					} else if (i_822_ == 3) {
						for (int i_917_ = -i_828_; i_917_ < 0; i_917_++) {
							for (int i_918_ = -i_829_; i_918_ < 0; i_918_++) {
								int i_919_ = anIntArray11347[i_827_++];
								int i_920_ = i_919_ + i_823_;
								int i_921_ = ((i_919_ & 0xff00ff) + (i_823_ & 0xff00ff));
								int i_922_ = ((i_921_ & 0x1000100) + (i_920_ - i_921_ & 0x10000));
								i_919_ = i_920_ - i_922_ | i_922_ - (i_922_ >>> 8);
								i_922_ = is[i_826_];
								i_920_ = i_919_ + i_922_;
								i_921_ = (i_919_ & 0xff00ff) + (i_922_ & 0xff00ff);
								i_922_ = (i_921_ & 0x1000100) + (i_920_ - i_921_ & 0x10000);
								is[i_826_++] = i_920_ - i_922_ | i_922_ - (i_922_ >>> 8);
							}
							i_826_ += i_830_;
							i_827_ += i_831_;
						}
					} else if (i_822_ == 2) {
						int i_923_ = i_823_ >>> 24;
						int i_924_ = 256 - i_923_;
						int i_925_ = (i_823_ & 0xff00ff) * i_924_ & ~0xff00ff;
						int i_926_ = (i_823_ & 0xff00) * i_924_ & 0xff0000;
						i_823_ = (i_925_ | i_926_) >>> 8;
						for (int i_927_ = -i_828_; i_927_ < 0; i_927_++) {
							for (int i_928_ = -i_829_; i_928_ < 0; i_928_++) {
								int i_929_ = anIntArray11347[i_827_++];
								if (i_929_ != 0) {
									i_925_ = ((i_929_ & 0xff00ff) * i_923_ & ~0xff00ff);
									i_926_ = ((i_929_ & 0xff00) * i_923_ & 0xff0000);
									i_929_ = ((i_925_ | i_926_) >>> 8) + i_823_;
									int i_930_ = is[i_826_];
									int i_931_ = i_929_ + i_930_;
									int i_932_ = ((i_929_ & 0xff00ff) + (i_930_ & 0xff00ff));
									i_930_ = ((i_932_ & 0x1000100) + (i_931_ - i_932_ & 0x10000));
									is[i_826_++] = i_931_ - i_930_ | i_930_ - (i_930_ >>> 8);
								} else
									i_826_++;
							}
							i_826_ += i_830_;
							i_827_ += i_831_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method1755(int i, int i_933_, int i_934_, int i_935_, int i_936_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			int i_937_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			i += anInt8977;
			i_933_ += anInt8947;
			int i_938_ = i_933_ * i_937_ + i;
			int i_939_ = 0;
			int i_940_ = anInt8950;
			int i_941_ = anInt8945;
			int i_942_ = i_937_ - i_941_;
			int i_943_ = 0;
			if (i_933_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_944_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_933_;
				i_940_ -= i_944_;
				i_933_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_939_ += i_944_ * i_941_;
				i_938_ += i_944_ * i_937_;
			}
			if (i_933_ + i_940_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_940_ -= (i_933_ + i_940_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_945_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_941_ -= i_945_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_939_ += i_945_;
				i_938_ += i_945_;
				i_943_ += i_945_;
				i_942_ += i_945_;
			}
			if (i + i_941_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_946_ = i + i_941_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_941_ -= i_946_;
				i_943_ += i_946_;
				i_942_ += i_946_;
			}
			if (i_941_ > 0 && i_940_ > 0) {
				if (i_936_ == 0) {
					if (i_934_ == 1) {
						for (int i_947_ = -i_940_; i_947_ < 0; i_947_++) {
							int i_948_ = i_938_ + i_941_ - 3;
							while (i_938_ < i_948_) {
								is[i_938_++] = anIntArray11347[i_939_++];
								is[i_938_++] = anIntArray11347[i_939_++];
								is[i_938_++] = anIntArray11347[i_939_++];
								is[i_938_++] = anIntArray11347[i_939_++];
							}
							i_948_ += 3;
							while (i_938_ < i_948_)
								is[i_938_++] = anIntArray11347[i_939_++];
							i_938_ += i_942_;
							i_939_ += i_943_;
						}
					} else if (i_934_ == 0) {
						int i_949_ = (i_935_ & 0xff0000) >> 16;
						int i_950_ = (i_935_ & 0xff00) >> 8;
						int i_951_ = i_935_ & 0xff;
						for (int i_952_ = -i_940_; i_952_ < 0; i_952_++) {
							for (int i_953_ = -i_941_; i_953_ < 0; i_953_++) {
								int i_954_ = anIntArray11347[i_939_++];
								int i_955_ = (i_954_ & 0xff0000) * i_949_ & ~0xffffff;
								int i_956_ = (i_954_ & 0xff00) * i_950_ & 0xff0000;
								int i_957_ = (i_954_ & 0xff) * i_951_ & 0xff00;
								is[i_938_++] = (i_955_ | i_956_ | i_957_) >>> 8;
							}
							i_938_ += i_942_;
							i_939_ += i_943_;
						}
					} else if (i_934_ == 3) {
						for (int i_958_ = -i_940_; i_958_ < 0; i_958_++) {
							for (int i_959_ = -i_941_; i_959_ < 0; i_959_++) {
								int i_960_ = anIntArray11347[i_939_++];
								int i_961_ = i_960_ + i_935_;
								int i_962_ = ((i_960_ & 0xff00ff) + (i_935_ & 0xff00ff));
								int i_963_ = ((i_962_ & 0x1000100) + (i_961_ - i_962_ & 0x10000));
								is[i_938_++] = i_961_ - i_963_ | i_963_ - (i_963_ >>> 8);
							}
							i_938_ += i_942_;
							i_939_ += i_943_;
						}
					} else if (i_934_ == 2) {
						int i_964_ = i_935_ >>> 24;
						int i_965_ = 256 - i_964_;
						int i_966_ = (i_935_ & 0xff00ff) * i_965_ & ~0xff00ff;
						int i_967_ = (i_935_ & 0xff00) * i_965_ & 0xff0000;
						i_935_ = (i_966_ | i_967_) >>> 8;
						for (int i_968_ = -i_940_; i_968_ < 0; i_968_++) {
							for (int i_969_ = -i_941_; i_969_ < 0; i_969_++) {
								int i_970_ = anIntArray11347[i_939_++];
								i_966_ = (i_970_ & 0xff00ff) * i_964_ & ~0xff00ff;
								i_967_ = (i_970_ & 0xff00) * i_964_ & 0xff0000;
								is[i_938_++] = ((i_966_ | i_967_) >>> 8) + i_935_;
							}
							i_938_ += i_942_;
							i_939_ += i_943_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_936_ == 1) {
					if (i_934_ == 1) {
						for (int i_971_ = -i_940_; i_971_ < 0; i_971_++) {
							int i_972_ = i_938_ + i_941_ - 3;
							while (i_938_ < i_972_) {
								int i_973_ = anIntArray11347[i_939_++];
								if (i_973_ != 0)
									is[i_938_++] = i_973_;
								else
									i_938_++;
								i_973_ = anIntArray11347[i_939_++];
								if (i_973_ != 0)
									is[i_938_++] = i_973_;
								else
									i_938_++;
								i_973_ = anIntArray11347[i_939_++];
								if (i_973_ != 0)
									is[i_938_++] = i_973_;
								else
									i_938_++;
								i_973_ = anIntArray11347[i_939_++];
								if (i_973_ != 0)
									is[i_938_++] = i_973_;
								else
									i_938_++;
							}
							i_972_ += 3;
							while (i_938_ < i_972_) {
								int i_974_ = anIntArray11347[i_939_++];
								if (i_974_ != 0)
									is[i_938_++] = i_974_;
								else
									i_938_++;
							}
							i_938_ += i_942_;
							i_939_ += i_943_;
						}
					} else if (i_934_ == 0) {
						if ((i_935_ & 0xffffff) == 16777215) {
							int i_975_ = i_935_ >>> 24;
							int i_976_ = 256 - i_975_;
							for (int i_977_ = -i_940_; i_977_ < 0; i_977_++) {
								for (int i_978_ = -i_941_; i_978_ < 0; i_978_++) {
									int i_979_ = anIntArray11347[i_939_++];
									if (i_979_ != 0) {
										int i_980_ = is[i_938_];
										is[i_938_++] = ((((i_979_ & 0xff00ff) * i_975_ + ((i_980_ & 0xff00ff) * i_976_)) & ~0xff00ff) + (((i_979_ & 0xff00) * i_975_ + ((i_980_ & 0xff00) * i_976_)) & 0xff0000)) >> 8;
									} else
										i_938_++;
								}
								i_938_ += i_942_;
								i_939_ += i_943_;
							}
						} else {
							int i_981_ = (i_935_ & 0xff0000) >> 16;
							int i_982_ = (i_935_ & 0xff00) >> 8;
							int i_983_ = i_935_ & 0xff;
							int i_984_ = i_935_ >>> 24;
							int i_985_ = 256 - i_984_;
							for (int i_986_ = -i_940_; i_986_ < 0; i_986_++) {
								for (int i_987_ = -i_941_; i_987_ < 0; i_987_++) {
									int i_988_ = anIntArray11347[i_939_++];
									if (i_988_ != 0) {
										if (i_984_ != 255) {
											int i_989_ = ((i_988_ & 0xff0000) * i_981_ & ~0xffffff);
											int i_990_ = ((i_988_ & 0xff00) * i_982_ & 0xff0000);
											int i_991_ = ((i_988_ & 0xff) * i_983_ & 0xff00);
											i_988_ = (i_989_ | i_990_ | i_991_) >>> 8;
											int i_992_ = is[i_938_];
											is[i_938_++] = (((((i_988_ & 0xff00ff) * i_984_) + ((i_992_ & 0xff00ff) * i_985_)) & ~0xff00ff) + ((((i_988_ & 0xff00) * i_984_) + ((i_992_ & 0xff00) * i_985_)) & 0xff0000)) >> 8;
										} else {
											int i_993_ = ((i_988_ & 0xff0000) * i_981_ & ~0xffffff);
											int i_994_ = ((i_988_ & 0xff00) * i_982_ & 0xff0000);
											int i_995_ = ((i_988_ & 0xff) * i_983_ & 0xff00);
											is[i_938_++] = (i_993_ | i_994_ | i_995_) >>> 8;
										}
									} else
										i_938_++;
								}
								i_938_ += i_942_;
								i_939_ += i_943_;
							}
						}
					} else if (i_934_ == 3) {
						int i_996_ = i_935_ >>> 24;
						int i_997_ = 256 - i_996_;
						for (int i_998_ = -i_940_; i_998_ < 0; i_998_++) {
							for (int i_999_ = -i_941_; i_999_ < 0; i_999_++) {
								int i_1000_ = anIntArray11347[i_939_++];
								int i_1001_ = i_1000_ + i_935_;
								int i_1002_ = ((i_1000_ & 0xff00ff) + (i_935_ & 0xff00ff));
								int i_1003_ = ((i_1002_ & 0x1000100) + (i_1001_ - i_1002_ & 0x10000));
								i_1003_ = i_1001_ - i_1003_ | i_1003_ - (i_1003_ >>> 8);
								if (i_1000_ == 0 && i_996_ != 255) {
									i_1000_ = i_1003_;
									i_1003_ = is[i_938_];
									i_1003_ = ((((i_1000_ & 0xff00ff) * i_996_ + (i_1003_ & 0xff00ff) * i_997_) & ~0xff00ff) + (((i_1000_ & 0xff00) * i_996_ + (i_1003_ & 0xff00) * i_997_) & 0xff0000)) >> 8;
								}
								is[i_938_++] = i_1003_;
							}
							i_938_ += i_942_;
							i_939_ += i_943_;
						}
					} else if (i_934_ == 2) {
						int i_1004_ = i_935_ >>> 24;
						int i_1005_ = 256 - i_1004_;
						int i_1006_ = (i_935_ & 0xff00ff) * i_1005_ & ~0xff00ff;
						int i_1007_ = (i_935_ & 0xff00) * i_1005_ & 0xff0000;
						i_935_ = (i_1006_ | i_1007_) >>> 8;
						for (int i_1008_ = -i_940_; i_1008_ < 0; i_1008_++) {
							for (int i_1009_ = -i_941_; i_1009_ < 0; i_1009_++) {
								int i_1010_ = anIntArray11347[i_939_++];
								if (i_1010_ != 0) {
									i_1006_ = ((i_1010_ & 0xff00ff) * i_1004_ & ~0xff00ff);
									i_1007_ = ((i_1010_ & 0xff00) * i_1004_ & 0xff0000);
									is[i_938_++] = ((i_1006_ | i_1007_) >>> 8) + i_935_;
								} else
									i_938_++;
							}
							i_938_ += i_942_;
							i_939_ += i_943_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_936_ == 2) {
					if (i_934_ == 1) {
						for (int i_1011_ = -i_940_; i_1011_ < 0; i_1011_++) {
							for (int i_1012_ = -i_941_; i_1012_ < 0; i_1012_++) {
								int i_1013_ = anIntArray11347[i_939_++];
								if (i_1013_ != 0) {
									int i_1014_ = is[i_938_];
									int i_1015_ = i_1013_ + i_1014_;
									int i_1016_ = ((i_1013_ & 0xff00ff) + (i_1014_ & 0xff00ff));
									i_1014_ = ((i_1016_ & 0x1000100) + (i_1015_ - i_1016_ & 0x10000));
									is[i_938_++] = (i_1015_ - i_1014_ | i_1014_ - (i_1014_ >>> 8));
								} else
									i_938_++;
							}
							i_938_ += i_942_;
							i_939_ += i_943_;
						}
					} else if (i_934_ == 0) {
						int i_1017_ = (i_935_ & 0xff0000) >> 16;
						int i_1018_ = (i_935_ & 0xff00) >> 8;
						int i_1019_ = i_935_ & 0xff;
						for (int i_1020_ = -i_940_; i_1020_ < 0; i_1020_++) {
							for (int i_1021_ = -i_941_; i_1021_ < 0; i_1021_++) {
								int i_1022_ = anIntArray11347[i_939_++];
								if (i_1022_ != 0) {
									int i_1023_ = ((i_1022_ & 0xff0000) * i_1017_ & ~0xffffff);
									int i_1024_ = ((i_1022_ & 0xff00) * i_1018_ & 0xff0000);
									int i_1025_ = (i_1022_ & 0xff) * i_1019_ & 0xff00;
									i_1022_ = (i_1023_ | i_1024_ | i_1025_) >>> 8;
									int i_1026_ = is[i_938_];
									int i_1027_ = i_1022_ + i_1026_;
									int i_1028_ = ((i_1022_ & 0xff00ff) + (i_1026_ & 0xff00ff));
									i_1026_ = ((i_1028_ & 0x1000100) + (i_1027_ - i_1028_ & 0x10000));
									is[i_938_++] = (i_1027_ - i_1026_ | i_1026_ - (i_1026_ >>> 8));
								} else
									i_938_++;
							}
							i_938_ += i_942_;
							i_939_ += i_943_;
						}
					} else if (i_934_ == 3) {
						for (int i_1029_ = -i_940_; i_1029_ < 0; i_1029_++) {
							for (int i_1030_ = -i_941_; i_1030_ < 0; i_1030_++) {
								int i_1031_ = anIntArray11347[i_939_++];
								int i_1032_ = i_1031_ + i_935_;
								int i_1033_ = ((i_1031_ & 0xff00ff) + (i_935_ & 0xff00ff));
								int i_1034_ = ((i_1033_ & 0x1000100) + (i_1032_ - i_1033_ & 0x10000));
								i_1031_ = i_1032_ - i_1034_ | i_1034_ - (i_1034_ >>> 8);
								i_1034_ = is[i_938_];
								i_1032_ = i_1031_ + i_1034_;
								i_1033_ = (i_1031_ & 0xff00ff) + (i_1034_ & 0xff00ff);
								i_1034_ = ((i_1033_ & 0x1000100) + (i_1032_ - i_1033_ & 0x10000));
								is[i_938_++] = i_1032_ - i_1034_ | i_1034_ - (i_1034_ >>> 8);
							}
							i_938_ += i_942_;
							i_939_ += i_943_;
						}
					} else if (i_934_ == 2) {
						int i_1035_ = i_935_ >>> 24;
						int i_1036_ = 256 - i_1035_;
						int i_1037_ = (i_935_ & 0xff00ff) * i_1036_ & ~0xff00ff;
						int i_1038_ = (i_935_ & 0xff00) * i_1036_ & 0xff0000;
						i_935_ = (i_1037_ | i_1038_) >>> 8;
						for (int i_1039_ = -i_940_; i_1039_ < 0; i_1039_++) {
							for (int i_1040_ = -i_941_; i_1040_ < 0; i_1040_++) {
								int i_1041_ = anIntArray11347[i_939_++];
								if (i_1041_ != 0) {
									i_1037_ = ((i_1041_ & 0xff00ff) * i_1035_ & ~0xff00ff);
									i_1038_ = ((i_1041_ & 0xff00) * i_1035_ & 0xff0000);
									i_1041_ = ((i_1037_ | i_1038_) >>> 8) + i_935_;
									int i_1042_ = is[i_938_];
									int i_1043_ = i_1041_ + i_1042_;
									int i_1044_ = ((i_1041_ & 0xff00ff) + (i_1042_ & 0xff00ff));
									i_1042_ = ((i_1044_ & 0x1000100) + (i_1043_ - i_1044_ & 0x10000));
									is[i_938_++] = (i_1043_ - i_1042_ | i_1042_ - (i_1042_ >>> 8));
								} else
									i_938_++;
							}
							i_938_ += i_942_;
							i_939_ += i_943_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method1729(int i, int i_1045_, int i_1046_, int i_1047_, int i_1048_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			int i_1049_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			i += anInt8977;
			i_1045_ += anInt8947;
			int i_1050_ = i_1045_ * i_1049_ + i;
			int i_1051_ = 0;
			int i_1052_ = anInt8950;
			int i_1053_ = anInt8945;
			int i_1054_ = i_1049_ - i_1053_;
			int i_1055_ = 0;
			if (i_1045_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_1056_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_1045_;
				i_1052_ -= i_1056_;
				i_1045_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_1051_ += i_1056_ * i_1053_;
				i_1050_ += i_1056_ * i_1049_;
			}
			if (i_1045_ + i_1052_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_1052_ -= (i_1045_ + i_1052_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_1057_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_1053_ -= i_1057_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_1051_ += i_1057_;
				i_1050_ += i_1057_;
				i_1055_ += i_1057_;
				i_1054_ += i_1057_;
			}
			if (i + i_1053_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_1058_ = i + i_1053_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_1053_ -= i_1058_;
				i_1055_ += i_1058_;
				i_1054_ += i_1058_;
			}
			if (i_1053_ > 0 && i_1052_ > 0) {
				if (i_1048_ == 0) {
					if (i_1046_ == 1) {
						for (int i_1059_ = -i_1052_; i_1059_ < 0; i_1059_++) {
							int i_1060_ = i_1050_ + i_1053_ - 3;
							while (i_1050_ < i_1060_) {
								is[i_1050_++] = anIntArray11347[i_1051_++];
								is[i_1050_++] = anIntArray11347[i_1051_++];
								is[i_1050_++] = anIntArray11347[i_1051_++];
								is[i_1050_++] = anIntArray11347[i_1051_++];
							}
							i_1060_ += 3;
							while (i_1050_ < i_1060_)
								is[i_1050_++] = anIntArray11347[i_1051_++];
							i_1050_ += i_1054_;
							i_1051_ += i_1055_;
						}
					} else if (i_1046_ == 0) {
						int i_1061_ = (i_1047_ & 0xff0000) >> 16;
						int i_1062_ = (i_1047_ & 0xff00) >> 8;
						int i_1063_ = i_1047_ & 0xff;
						for (int i_1064_ = -i_1052_; i_1064_ < 0; i_1064_++) {
							for (int i_1065_ = -i_1053_; i_1065_ < 0; i_1065_++) {
								int i_1066_ = anIntArray11347[i_1051_++];
								int i_1067_ = ((i_1066_ & 0xff0000) * i_1061_ & ~0xffffff);
								int i_1068_ = (i_1066_ & 0xff00) * i_1062_ & 0xff0000;
								int i_1069_ = (i_1066_ & 0xff) * i_1063_ & 0xff00;
								is[i_1050_++] = (i_1067_ | i_1068_ | i_1069_) >>> 8;
							}
							i_1050_ += i_1054_;
							i_1051_ += i_1055_;
						}
					} else if (i_1046_ == 3) {
						for (int i_1070_ = -i_1052_; i_1070_ < 0; i_1070_++) {
							for (int i_1071_ = -i_1053_; i_1071_ < 0; i_1071_++) {
								int i_1072_ = anIntArray11347[i_1051_++];
								int i_1073_ = i_1072_ + i_1047_;
								int i_1074_ = ((i_1072_ & 0xff00ff) + (i_1047_ & 0xff00ff));
								int i_1075_ = ((i_1074_ & 0x1000100) + (i_1073_ - i_1074_ & 0x10000));
								is[i_1050_++] = i_1073_ - i_1075_ | i_1075_ - (i_1075_ >>> 8);
							}
							i_1050_ += i_1054_;
							i_1051_ += i_1055_;
						}
					} else if (i_1046_ == 2) {
						int i_1076_ = i_1047_ >>> 24;
						int i_1077_ = 256 - i_1076_;
						int i_1078_ = (i_1047_ & 0xff00ff) * i_1077_ & ~0xff00ff;
						int i_1079_ = (i_1047_ & 0xff00) * i_1077_ & 0xff0000;
						i_1047_ = (i_1078_ | i_1079_) >>> 8;
						for (int i_1080_ = -i_1052_; i_1080_ < 0; i_1080_++) {
							for (int i_1081_ = -i_1053_; i_1081_ < 0; i_1081_++) {
								int i_1082_ = anIntArray11347[i_1051_++];
								i_1078_ = ((i_1082_ & 0xff00ff) * i_1076_ & ~0xff00ff);
								i_1079_ = (i_1082_ & 0xff00) * i_1076_ & 0xff0000;
								is[i_1050_++] = ((i_1078_ | i_1079_) >>> 8) + i_1047_;
							}
							i_1050_ += i_1054_;
							i_1051_ += i_1055_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1048_ == 1) {
					if (i_1046_ == 1) {
						for (int i_1083_ = -i_1052_; i_1083_ < 0; i_1083_++) {
							int i_1084_ = i_1050_ + i_1053_ - 3;
							while (i_1050_ < i_1084_) {
								int i_1085_ = anIntArray11347[i_1051_++];
								if (i_1085_ != 0)
									is[i_1050_++] = i_1085_;
								else
									i_1050_++;
								i_1085_ = anIntArray11347[i_1051_++];
								if (i_1085_ != 0)
									is[i_1050_++] = i_1085_;
								else
									i_1050_++;
								i_1085_ = anIntArray11347[i_1051_++];
								if (i_1085_ != 0)
									is[i_1050_++] = i_1085_;
								else
									i_1050_++;
								i_1085_ = anIntArray11347[i_1051_++];
								if (i_1085_ != 0)
									is[i_1050_++] = i_1085_;
								else
									i_1050_++;
							}
							i_1084_ += 3;
							while (i_1050_ < i_1084_) {
								int i_1086_ = anIntArray11347[i_1051_++];
								if (i_1086_ != 0)
									is[i_1050_++] = i_1086_;
								else
									i_1050_++;
							}
							i_1050_ += i_1054_;
							i_1051_ += i_1055_;
						}
					} else if (i_1046_ == 0) {
						if ((i_1047_ & 0xffffff) == 16777215) {
							int i_1087_ = i_1047_ >>> 24;
							int i_1088_ = 256 - i_1087_;
							for (int i_1089_ = -i_1052_; i_1089_ < 0; i_1089_++) {
								for (int i_1090_ = -i_1053_; i_1090_ < 0; i_1090_++) {
									int i_1091_ = anIntArray11347[i_1051_++];
									if (i_1091_ != 0) {
										int i_1092_ = is[i_1050_];
										is[i_1050_++] = ((((i_1091_ & 0xff00ff) * i_1087_ + ((i_1092_ & 0xff00ff) * i_1088_)) & ~0xff00ff) + (((i_1091_ & 0xff00) * i_1087_ + ((i_1092_ & 0xff00) * i_1088_)) & 0xff0000)) >> 8;
									} else
										i_1050_++;
								}
								i_1050_ += i_1054_;
								i_1051_ += i_1055_;
							}
						} else {
							int i_1093_ = (i_1047_ & 0xff0000) >> 16;
							int i_1094_ = (i_1047_ & 0xff00) >> 8;
							int i_1095_ = i_1047_ & 0xff;
							int i_1096_ = i_1047_ >>> 24;
							int i_1097_ = 256 - i_1096_;
							for (int i_1098_ = -i_1052_; i_1098_ < 0; i_1098_++) {
								for (int i_1099_ = -i_1053_; i_1099_ < 0; i_1099_++) {
									int i_1100_ = anIntArray11347[i_1051_++];
									if (i_1100_ != 0) {
										if (i_1096_ != 255) {
											int i_1101_ = (((i_1100_ & 0xff0000) * i_1093_) & ~0xffffff);
											int i_1102_ = ((i_1100_ & 0xff00) * i_1094_ & 0xff0000);
											int i_1103_ = ((i_1100_ & 0xff) * i_1095_ & 0xff00);
											i_1100_ = (i_1101_ | i_1102_ | i_1103_) >>> 8;
											int i_1104_ = is[i_1050_];
											is[i_1050_++] = (((((i_1100_ & 0xff00ff) * i_1096_) + ((i_1104_ & 0xff00ff) * i_1097_)) & ~0xff00ff) + ((((i_1100_ & 0xff00) * i_1096_) + ((i_1104_ & 0xff00) * i_1097_)) & 0xff0000)) >> 8;
										} else {
											int i_1105_ = (((i_1100_ & 0xff0000) * i_1093_) & ~0xffffff);
											int i_1106_ = ((i_1100_ & 0xff00) * i_1094_ & 0xff0000);
											int i_1107_ = ((i_1100_ & 0xff) * i_1095_ & 0xff00);
											is[i_1050_++] = (i_1105_ | i_1106_ | i_1107_) >>> 8;
										}
									} else
										i_1050_++;
								}
								i_1050_ += i_1054_;
								i_1051_ += i_1055_;
							}
						}
					} else if (i_1046_ == 3) {
						int i_1108_ = i_1047_ >>> 24;
						int i_1109_ = 256 - i_1108_;
						for (int i_1110_ = -i_1052_; i_1110_ < 0; i_1110_++) {
							for (int i_1111_ = -i_1053_; i_1111_ < 0; i_1111_++) {
								int i_1112_ = anIntArray11347[i_1051_++];
								int i_1113_ = i_1112_ + i_1047_;
								int i_1114_ = ((i_1112_ & 0xff00ff) + (i_1047_ & 0xff00ff));
								int i_1115_ = ((i_1114_ & 0x1000100) + (i_1113_ - i_1114_ & 0x10000));
								i_1115_ = i_1113_ - i_1115_ | i_1115_ - (i_1115_ >>> 8);
								if (i_1112_ == 0 && i_1108_ != 255) {
									i_1112_ = i_1115_;
									i_1115_ = is[i_1050_];
									i_1115_ = ((((i_1112_ & 0xff00ff) * i_1108_ + (i_1115_ & 0xff00ff) * i_1109_) & ~0xff00ff) + (((i_1112_ & 0xff00) * i_1108_ + (i_1115_ & 0xff00) * i_1109_) & 0xff0000)) >> 8;
								}
								is[i_1050_++] = i_1115_;
							}
							i_1050_ += i_1054_;
							i_1051_ += i_1055_;
						}
					} else if (i_1046_ == 2) {
						int i_1116_ = i_1047_ >>> 24;
						int i_1117_ = 256 - i_1116_;
						int i_1118_ = (i_1047_ & 0xff00ff) * i_1117_ & ~0xff00ff;
						int i_1119_ = (i_1047_ & 0xff00) * i_1117_ & 0xff0000;
						i_1047_ = (i_1118_ | i_1119_) >>> 8;
						for (int i_1120_ = -i_1052_; i_1120_ < 0; i_1120_++) {
							for (int i_1121_ = -i_1053_; i_1121_ < 0; i_1121_++) {
								int i_1122_ = anIntArray11347[i_1051_++];
								if (i_1122_ != 0) {
									i_1118_ = ((i_1122_ & 0xff00ff) * i_1116_ & ~0xff00ff);
									i_1119_ = ((i_1122_ & 0xff00) * i_1116_ & 0xff0000);
									is[i_1050_++] = ((i_1118_ | i_1119_) >>> 8) + i_1047_;
								} else
									i_1050_++;
							}
							i_1050_ += i_1054_;
							i_1051_ += i_1055_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1048_ == 2) {
					if (i_1046_ == 1) {
						for (int i_1123_ = -i_1052_; i_1123_ < 0; i_1123_++) {
							for (int i_1124_ = -i_1053_; i_1124_ < 0; i_1124_++) {
								int i_1125_ = anIntArray11347[i_1051_++];
								if (i_1125_ != 0) {
									int i_1126_ = is[i_1050_];
									int i_1127_ = i_1125_ + i_1126_;
									int i_1128_ = ((i_1125_ & 0xff00ff) + (i_1126_ & 0xff00ff));
									i_1126_ = ((i_1128_ & 0x1000100) + (i_1127_ - i_1128_ & 0x10000));
									is[i_1050_++] = (i_1127_ - i_1126_ | i_1126_ - (i_1126_ >>> 8));
								} else
									i_1050_++;
							}
							i_1050_ += i_1054_;
							i_1051_ += i_1055_;
						}
					} else if (i_1046_ == 0) {
						int i_1129_ = (i_1047_ & 0xff0000) >> 16;
						int i_1130_ = (i_1047_ & 0xff00) >> 8;
						int i_1131_ = i_1047_ & 0xff;
						for (int i_1132_ = -i_1052_; i_1132_ < 0; i_1132_++) {
							for (int i_1133_ = -i_1053_; i_1133_ < 0; i_1133_++) {
								int i_1134_ = anIntArray11347[i_1051_++];
								if (i_1134_ != 0) {
									int i_1135_ = ((i_1134_ & 0xff0000) * i_1129_ & ~0xffffff);
									int i_1136_ = ((i_1134_ & 0xff00) * i_1130_ & 0xff0000);
									int i_1137_ = (i_1134_ & 0xff) * i_1131_ & 0xff00;
									i_1134_ = (i_1135_ | i_1136_ | i_1137_) >>> 8;
									int i_1138_ = is[i_1050_];
									int i_1139_ = i_1134_ + i_1138_;
									int i_1140_ = ((i_1134_ & 0xff00ff) + (i_1138_ & 0xff00ff));
									i_1138_ = ((i_1140_ & 0x1000100) + (i_1139_ - i_1140_ & 0x10000));
									is[i_1050_++] = (i_1139_ - i_1138_ | i_1138_ - (i_1138_ >>> 8));
								} else
									i_1050_++;
							}
							i_1050_ += i_1054_;
							i_1051_ += i_1055_;
						}
					} else if (i_1046_ == 3) {
						for (int i_1141_ = -i_1052_; i_1141_ < 0; i_1141_++) {
							for (int i_1142_ = -i_1053_; i_1142_ < 0; i_1142_++) {
								int i_1143_ = anIntArray11347[i_1051_++];
								int i_1144_ = i_1143_ + i_1047_;
								int i_1145_ = ((i_1143_ & 0xff00ff) + (i_1047_ & 0xff00ff));
								int i_1146_ = ((i_1145_ & 0x1000100) + (i_1144_ - i_1145_ & 0x10000));
								i_1143_ = i_1144_ - i_1146_ | i_1146_ - (i_1146_ >>> 8);
								i_1146_ = is[i_1050_];
								i_1144_ = i_1143_ + i_1146_;
								i_1145_ = (i_1143_ & 0xff00ff) + (i_1146_ & 0xff00ff);
								i_1146_ = ((i_1145_ & 0x1000100) + (i_1144_ - i_1145_ & 0x10000));
								is[i_1050_++] = i_1144_ - i_1146_ | i_1146_ - (i_1146_ >>> 8);
							}
							i_1050_ += i_1054_;
							i_1051_ += i_1055_;
						}
					} else if (i_1046_ == 2) {
						int i_1147_ = i_1047_ >>> 24;
						int i_1148_ = 256 - i_1147_;
						int i_1149_ = (i_1047_ & 0xff00ff) * i_1148_ & ~0xff00ff;
						int i_1150_ = (i_1047_ & 0xff00) * i_1148_ & 0xff0000;
						i_1047_ = (i_1149_ | i_1150_) >>> 8;
						for (int i_1151_ = -i_1052_; i_1151_ < 0; i_1151_++) {
							for (int i_1152_ = -i_1053_; i_1152_ < 0; i_1152_++) {
								int i_1153_ = anIntArray11347[i_1051_++];
								if (i_1153_ != 0) {
									i_1149_ = ((i_1153_ & 0xff00ff) * i_1147_ & ~0xff00ff);
									i_1150_ = ((i_1153_ & 0xff00) * i_1147_ & 0xff0000);
									i_1153_ = (((i_1149_ | i_1150_) >>> 8) + i_1047_);
									int i_1154_ = is[i_1050_];
									int i_1155_ = i_1153_ + i_1154_;
									int i_1156_ = ((i_1153_ & 0xff00ff) + (i_1154_ & 0xff00ff));
									i_1154_ = ((i_1156_ & 0x1000100) + (i_1155_ - i_1156_ & 0x10000));
									is[i_1050_++] = (i_1155_ - i_1154_ | i_1154_ - (i_1154_ >>> 8));
								} else
									i_1050_++;
							}
							i_1050_ += i_1054_;
							i_1051_ += i_1055_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method1721(int i, int i_1157_, int i_1158_, int i_1159_, int i_1160_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			int i_1161_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			i += anInt8977;
			i_1157_ += anInt8947;
			int i_1162_ = i_1157_ * i_1161_ + i;
			int i_1163_ = 0;
			int i_1164_ = anInt8950;
			int i_1165_ = anInt8945;
			int i_1166_ = i_1161_ - i_1165_;
			int i_1167_ = 0;
			if (i_1157_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_1168_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_1157_;
				i_1164_ -= i_1168_;
				i_1157_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_1163_ += i_1168_ * i_1165_;
				i_1162_ += i_1168_ * i_1161_;
			}
			if (i_1157_ + i_1164_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_1164_ -= (i_1157_ + i_1164_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_1169_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_1165_ -= i_1169_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_1163_ += i_1169_;
				i_1162_ += i_1169_;
				i_1167_ += i_1169_;
				i_1166_ += i_1169_;
			}
			if (i + i_1165_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_1170_ = i + i_1165_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_1165_ -= i_1170_;
				i_1167_ += i_1170_;
				i_1166_ += i_1170_;
			}
			if (i_1165_ > 0 && i_1164_ > 0) {
				if (i_1160_ == 0) {
					if (i_1158_ == 1) {
						for (int i_1171_ = -i_1164_; i_1171_ < 0; i_1171_++) {
							int i_1172_ = i_1162_ + i_1165_ - 3;
							while (i_1162_ < i_1172_) {
								is[i_1162_++] = anIntArray11347[i_1163_++];
								is[i_1162_++] = anIntArray11347[i_1163_++];
								is[i_1162_++] = anIntArray11347[i_1163_++];
								is[i_1162_++] = anIntArray11347[i_1163_++];
							}
							i_1172_ += 3;
							while (i_1162_ < i_1172_)
								is[i_1162_++] = anIntArray11347[i_1163_++];
							i_1162_ += i_1166_;
							i_1163_ += i_1167_;
						}
					} else if (i_1158_ == 0) {
						int i_1173_ = (i_1159_ & 0xff0000) >> 16;
						int i_1174_ = (i_1159_ & 0xff00) >> 8;
						int i_1175_ = i_1159_ & 0xff;
						for (int i_1176_ = -i_1164_; i_1176_ < 0; i_1176_++) {
							for (int i_1177_ = -i_1165_; i_1177_ < 0; i_1177_++) {
								int i_1178_ = anIntArray11347[i_1163_++];
								int i_1179_ = ((i_1178_ & 0xff0000) * i_1173_ & ~0xffffff);
								int i_1180_ = (i_1178_ & 0xff00) * i_1174_ & 0xff0000;
								int i_1181_ = (i_1178_ & 0xff) * i_1175_ & 0xff00;
								is[i_1162_++] = (i_1179_ | i_1180_ | i_1181_) >>> 8;
							}
							i_1162_ += i_1166_;
							i_1163_ += i_1167_;
						}
					} else if (i_1158_ == 3) {
						for (int i_1182_ = -i_1164_; i_1182_ < 0; i_1182_++) {
							for (int i_1183_ = -i_1165_; i_1183_ < 0; i_1183_++) {
								int i_1184_ = anIntArray11347[i_1163_++];
								int i_1185_ = i_1184_ + i_1159_;
								int i_1186_ = ((i_1184_ & 0xff00ff) + (i_1159_ & 0xff00ff));
								int i_1187_ = ((i_1186_ & 0x1000100) + (i_1185_ - i_1186_ & 0x10000));
								is[i_1162_++] = i_1185_ - i_1187_ | i_1187_ - (i_1187_ >>> 8);
							}
							i_1162_ += i_1166_;
							i_1163_ += i_1167_;
						}
					} else if (i_1158_ == 2) {
						int i_1188_ = i_1159_ >>> 24;
						int i_1189_ = 256 - i_1188_;
						int i_1190_ = (i_1159_ & 0xff00ff) * i_1189_ & ~0xff00ff;
						int i_1191_ = (i_1159_ & 0xff00) * i_1189_ & 0xff0000;
						i_1159_ = (i_1190_ | i_1191_) >>> 8;
						for (int i_1192_ = -i_1164_; i_1192_ < 0; i_1192_++) {
							for (int i_1193_ = -i_1165_; i_1193_ < 0; i_1193_++) {
								int i_1194_ = anIntArray11347[i_1163_++];
								i_1190_ = ((i_1194_ & 0xff00ff) * i_1188_ & ~0xff00ff);
								i_1191_ = (i_1194_ & 0xff00) * i_1188_ & 0xff0000;
								is[i_1162_++] = ((i_1190_ | i_1191_) >>> 8) + i_1159_;
							}
							i_1162_ += i_1166_;
							i_1163_ += i_1167_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1160_ == 1) {
					if (i_1158_ == 1) {
						for (int i_1195_ = -i_1164_; i_1195_ < 0; i_1195_++) {
							int i_1196_ = i_1162_ + i_1165_ - 3;
							while (i_1162_ < i_1196_) {
								int i_1197_ = anIntArray11347[i_1163_++];
								if (i_1197_ != 0)
									is[i_1162_++] = i_1197_;
								else
									i_1162_++;
								i_1197_ = anIntArray11347[i_1163_++];
								if (i_1197_ != 0)
									is[i_1162_++] = i_1197_;
								else
									i_1162_++;
								i_1197_ = anIntArray11347[i_1163_++];
								if (i_1197_ != 0)
									is[i_1162_++] = i_1197_;
								else
									i_1162_++;
								i_1197_ = anIntArray11347[i_1163_++];
								if (i_1197_ != 0)
									is[i_1162_++] = i_1197_;
								else
									i_1162_++;
							}
							i_1196_ += 3;
							while (i_1162_ < i_1196_) {
								int i_1198_ = anIntArray11347[i_1163_++];
								if (i_1198_ != 0)
									is[i_1162_++] = i_1198_;
								else
									i_1162_++;
							}
							i_1162_ += i_1166_;
							i_1163_ += i_1167_;
						}
					} else if (i_1158_ == 0) {
						if ((i_1159_ & 0xffffff) == 16777215) {
							int i_1199_ = i_1159_ >>> 24;
							int i_1200_ = 256 - i_1199_;
							for (int i_1201_ = -i_1164_; i_1201_ < 0; i_1201_++) {
								for (int i_1202_ = -i_1165_; i_1202_ < 0; i_1202_++) {
									int i_1203_ = anIntArray11347[i_1163_++];
									if (i_1203_ != 0) {
										int i_1204_ = is[i_1162_];
										is[i_1162_++] = ((((i_1203_ & 0xff00ff) * i_1199_ + ((i_1204_ & 0xff00ff) * i_1200_)) & ~0xff00ff) + (((i_1203_ & 0xff00) * i_1199_ + ((i_1204_ & 0xff00) * i_1200_)) & 0xff0000)) >> 8;
									} else
										i_1162_++;
								}
								i_1162_ += i_1166_;
								i_1163_ += i_1167_;
							}
						} else {
							int i_1205_ = (i_1159_ & 0xff0000) >> 16;
							int i_1206_ = (i_1159_ & 0xff00) >> 8;
							int i_1207_ = i_1159_ & 0xff;
							int i_1208_ = i_1159_ >>> 24;
							int i_1209_ = 256 - i_1208_;
							for (int i_1210_ = -i_1164_; i_1210_ < 0; i_1210_++) {
								for (int i_1211_ = -i_1165_; i_1211_ < 0; i_1211_++) {
									int i_1212_ = anIntArray11347[i_1163_++];
									if (i_1212_ != 0) {
										if (i_1208_ != 255) {
											int i_1213_ = (((i_1212_ & 0xff0000) * i_1205_) & ~0xffffff);
											int i_1214_ = ((i_1212_ & 0xff00) * i_1206_ & 0xff0000);
											int i_1215_ = ((i_1212_ & 0xff) * i_1207_ & 0xff00);
											i_1212_ = (i_1213_ | i_1214_ | i_1215_) >>> 8;
											int i_1216_ = is[i_1162_];
											is[i_1162_++] = (((((i_1212_ & 0xff00ff) * i_1208_) + ((i_1216_ & 0xff00ff) * i_1209_)) & ~0xff00ff) + ((((i_1212_ & 0xff00) * i_1208_) + ((i_1216_ & 0xff00) * i_1209_)) & 0xff0000)) >> 8;
										} else {
											int i_1217_ = (((i_1212_ & 0xff0000) * i_1205_) & ~0xffffff);
											int i_1218_ = ((i_1212_ & 0xff00) * i_1206_ & 0xff0000);
											int i_1219_ = ((i_1212_ & 0xff) * i_1207_ & 0xff00);
											is[i_1162_++] = (i_1217_ | i_1218_ | i_1219_) >>> 8;
										}
									} else
										i_1162_++;
								}
								i_1162_ += i_1166_;
								i_1163_ += i_1167_;
							}
						}
					} else if (i_1158_ == 3) {
						int i_1220_ = i_1159_ >>> 24;
						int i_1221_ = 256 - i_1220_;
						for (int i_1222_ = -i_1164_; i_1222_ < 0; i_1222_++) {
							for (int i_1223_ = -i_1165_; i_1223_ < 0; i_1223_++) {
								int i_1224_ = anIntArray11347[i_1163_++];
								int i_1225_ = i_1224_ + i_1159_;
								int i_1226_ = ((i_1224_ & 0xff00ff) + (i_1159_ & 0xff00ff));
								int i_1227_ = ((i_1226_ & 0x1000100) + (i_1225_ - i_1226_ & 0x10000));
								i_1227_ = i_1225_ - i_1227_ | i_1227_ - (i_1227_ >>> 8);
								if (i_1224_ == 0 && i_1220_ != 255) {
									i_1224_ = i_1227_;
									i_1227_ = is[i_1162_];
									i_1227_ = ((((i_1224_ & 0xff00ff) * i_1220_ + (i_1227_ & 0xff00ff) * i_1221_) & ~0xff00ff) + (((i_1224_ & 0xff00) * i_1220_ + (i_1227_ & 0xff00) * i_1221_) & 0xff0000)) >> 8;
								}
								is[i_1162_++] = i_1227_;
							}
							i_1162_ += i_1166_;
							i_1163_ += i_1167_;
						}
					} else if (i_1158_ == 2) {
						int i_1228_ = i_1159_ >>> 24;
						int i_1229_ = 256 - i_1228_;
						int i_1230_ = (i_1159_ & 0xff00ff) * i_1229_ & ~0xff00ff;
						int i_1231_ = (i_1159_ & 0xff00) * i_1229_ & 0xff0000;
						i_1159_ = (i_1230_ | i_1231_) >>> 8;
						for (int i_1232_ = -i_1164_; i_1232_ < 0; i_1232_++) {
							for (int i_1233_ = -i_1165_; i_1233_ < 0; i_1233_++) {
								int i_1234_ = anIntArray11347[i_1163_++];
								if (i_1234_ != 0) {
									i_1230_ = ((i_1234_ & 0xff00ff) * i_1228_ & ~0xff00ff);
									i_1231_ = ((i_1234_ & 0xff00) * i_1228_ & 0xff0000);
									is[i_1162_++] = ((i_1230_ | i_1231_) >>> 8) + i_1159_;
								} else
									i_1162_++;
							}
							i_1162_ += i_1166_;
							i_1163_ += i_1167_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1160_ == 2) {
					if (i_1158_ == 1) {
						for (int i_1235_ = -i_1164_; i_1235_ < 0; i_1235_++) {
							for (int i_1236_ = -i_1165_; i_1236_ < 0; i_1236_++) {
								int i_1237_ = anIntArray11347[i_1163_++];
								if (i_1237_ != 0) {
									int i_1238_ = is[i_1162_];
									int i_1239_ = i_1237_ + i_1238_;
									int i_1240_ = ((i_1237_ & 0xff00ff) + (i_1238_ & 0xff00ff));
									i_1238_ = ((i_1240_ & 0x1000100) + (i_1239_ - i_1240_ & 0x10000));
									is[i_1162_++] = (i_1239_ - i_1238_ | i_1238_ - (i_1238_ >>> 8));
								} else
									i_1162_++;
							}
							i_1162_ += i_1166_;
							i_1163_ += i_1167_;
						}
					} else if (i_1158_ == 0) {
						int i_1241_ = (i_1159_ & 0xff0000) >> 16;
						int i_1242_ = (i_1159_ & 0xff00) >> 8;
						int i_1243_ = i_1159_ & 0xff;
						for (int i_1244_ = -i_1164_; i_1244_ < 0; i_1244_++) {
							for (int i_1245_ = -i_1165_; i_1245_ < 0; i_1245_++) {
								int i_1246_ = anIntArray11347[i_1163_++];
								if (i_1246_ != 0) {
									int i_1247_ = ((i_1246_ & 0xff0000) * i_1241_ & ~0xffffff);
									int i_1248_ = ((i_1246_ & 0xff00) * i_1242_ & 0xff0000);
									int i_1249_ = (i_1246_ & 0xff) * i_1243_ & 0xff00;
									i_1246_ = (i_1247_ | i_1248_ | i_1249_) >>> 8;
									int i_1250_ = is[i_1162_];
									int i_1251_ = i_1246_ + i_1250_;
									int i_1252_ = ((i_1246_ & 0xff00ff) + (i_1250_ & 0xff00ff));
									i_1250_ = ((i_1252_ & 0x1000100) + (i_1251_ - i_1252_ & 0x10000));
									is[i_1162_++] = (i_1251_ - i_1250_ | i_1250_ - (i_1250_ >>> 8));
								} else
									i_1162_++;
							}
							i_1162_ += i_1166_;
							i_1163_ += i_1167_;
						}
					} else if (i_1158_ == 3) {
						for (int i_1253_ = -i_1164_; i_1253_ < 0; i_1253_++) {
							for (int i_1254_ = -i_1165_; i_1254_ < 0; i_1254_++) {
								int i_1255_ = anIntArray11347[i_1163_++];
								int i_1256_ = i_1255_ + i_1159_;
								int i_1257_ = ((i_1255_ & 0xff00ff) + (i_1159_ & 0xff00ff));
								int i_1258_ = ((i_1257_ & 0x1000100) + (i_1256_ - i_1257_ & 0x10000));
								i_1255_ = i_1256_ - i_1258_ | i_1258_ - (i_1258_ >>> 8);
								i_1258_ = is[i_1162_];
								i_1256_ = i_1255_ + i_1258_;
								i_1257_ = (i_1255_ & 0xff00ff) + (i_1258_ & 0xff00ff);
								i_1258_ = ((i_1257_ & 0x1000100) + (i_1256_ - i_1257_ & 0x10000));
								is[i_1162_++] = i_1256_ - i_1258_ | i_1258_ - (i_1258_ >>> 8);
							}
							i_1162_ += i_1166_;
							i_1163_ += i_1167_;
						}
					} else if (i_1158_ == 2) {
						int i_1259_ = i_1159_ >>> 24;
						int i_1260_ = 256 - i_1259_;
						int i_1261_ = (i_1159_ & 0xff00ff) * i_1260_ & ~0xff00ff;
						int i_1262_ = (i_1159_ & 0xff00) * i_1260_ & 0xff0000;
						i_1159_ = (i_1261_ | i_1262_) >>> 8;
						for (int i_1263_ = -i_1164_; i_1263_ < 0; i_1263_++) {
							for (int i_1264_ = -i_1165_; i_1264_ < 0; i_1264_++) {
								int i_1265_ = anIntArray11347[i_1163_++];
								if (i_1265_ != 0) {
									i_1261_ = ((i_1265_ & 0xff00ff) * i_1259_ & ~0xff00ff);
									i_1262_ = ((i_1265_ & 0xff00) * i_1259_ & 0xff0000);
									i_1265_ = (((i_1261_ | i_1262_) >>> 8) + i_1159_);
									int i_1266_ = is[i_1162_];
									int i_1267_ = i_1265_ + i_1266_;
									int i_1268_ = ((i_1265_ & 0xff00ff) + (i_1266_ & 0xff00ff));
									i_1266_ = ((i_1268_ & 0x1000100) + (i_1267_ - i_1268_ & 0x10000));
									is[i_1162_++] = (i_1267_ - i_1266_ | i_1266_ - (i_1266_ >>> 8));
								} else
									i_1162_++;
							}
							i_1162_ += i_1166_;
							i_1163_ += i_1167_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public Interface22 method1782() {
		return new Class104(anInt8945, anInt8950, anIntArray11347);
	}

	void method1749(int i, int i_1269_, int i_1270_, int i_1271_, int i_1272_, int i_1273_, int i_1274_, int i_1275_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		if (i_1270_ > 0 && i_1271_ > 0) {
			int[] is = aClass167_Sub1_8946.anIntArray8996;
			if (is != null) {
				int i_1276_ = 0;
				int i_1277_ = 0;
				int i_1278_ = aClass167_Sub1_8946.anInt8997 * -570111553;
				int i_1279_ = anInt8977 + anInt8945 + anInt8948;
				int i_1280_ = anInt8947 + anInt8950 + anInt8952;
				int i_1281_ = (i_1279_ << 16) / i_1270_;
				int i_1282_ = (i_1280_ << 16) / i_1271_;
				if (anInt8977 > 0) {
					int i_1283_ = ((anInt8977 << 16) + i_1281_ - 1) / i_1281_;
					i += i_1283_;
					i_1276_ += i_1283_ * i_1281_ - (anInt8977 << 16);
				}
				if (anInt8947 > 0) {
					int i_1284_ = ((anInt8947 << 16) + i_1282_ - 1) / i_1282_;
					i_1269_ += i_1284_;
					i_1277_ += i_1284_ * i_1282_ - (anInt8947 << 16);
				}
				if (anInt8945 < i_1279_)
					i_1270_ = (((anInt8945 << 16) - i_1276_ + i_1281_ - 1) / i_1281_);
				if (anInt8950 < i_1280_)
					i_1271_ = (((anInt8950 << 16) - i_1277_ + i_1282_ - 1) / i_1282_);
				int i_1285_ = i + i_1269_ * i_1278_;
				int i_1286_ = i_1278_ - i_1270_;
				if (i_1269_ + i_1271_ > aClass167_Sub1_8946.anInt9003 * -148513205)
					i_1271_ -= (i_1269_ + i_1271_ - aClass167_Sub1_8946.anInt9003 * -148513205);
				if (i_1269_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
					int i_1287_ = (aClass167_Sub1_8946.anInt9021 * -1593163361 - i_1269_);
					i_1271_ -= i_1287_;
					i_1285_ += i_1287_ * i_1278_;
					i_1277_ += i_1282_ * i_1287_;
				}
				if (i + i_1270_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
					int i_1288_ = (i + i_1270_ - aClass167_Sub1_8946.anInt9001 * 2024498147);
					i_1270_ -= i_1288_;
					i_1286_ += i_1288_;
				}
				if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
					int i_1289_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
					i_1270_ -= i_1289_;
					i_1285_ += i_1289_;
					i_1276_ += i_1281_ * i_1289_;
					i_1286_ += i_1289_;
				}
				if (i_1274_ == 0) {
					if (i_1272_ == 1) {
						int i_1290_ = i_1276_;
						for (int i_1291_ = -i_1271_; i_1291_ < 0; i_1291_++) {
							int i_1292_ = (i_1277_ >> 16) * anInt8945;
							for (int i_1293_ = -i_1270_; i_1293_ < 0; i_1293_++) {
								is[i_1285_++] = (anIntArray11347[(i_1276_ >> 16) + i_1292_]);
								i_1276_ += i_1281_;
							}
							i_1277_ += i_1282_;
							i_1276_ = i_1290_;
							i_1285_ += i_1286_;
						}
					} else if (i_1272_ == 0) {
						int i_1294_ = (i_1273_ & 0xff0000) >> 16;
						int i_1295_ = (i_1273_ & 0xff00) >> 8;
						int i_1296_ = i_1273_ & 0xff;
						int i_1297_ = i_1276_;
						for (int i_1298_ = -i_1271_; i_1298_ < 0; i_1298_++) {
							int i_1299_ = (i_1277_ >> 16) * anInt8945;
							for (int i_1300_ = -i_1270_; i_1300_ < 0; i_1300_++) {
								int i_1301_ = (anIntArray11347[(i_1276_ >> 16) + i_1299_]);
								int i_1302_ = ((i_1301_ & 0xff0000) * i_1294_ & ~0xffffff);
								int i_1303_ = (i_1301_ & 0xff00) * i_1295_ & 0xff0000;
								int i_1304_ = (i_1301_ & 0xff) * i_1296_ & 0xff00;
								is[i_1285_++] = (i_1302_ | i_1303_ | i_1304_) >>> 8;
								i_1276_ += i_1281_;
							}
							i_1277_ += i_1282_;
							i_1276_ = i_1297_;
							i_1285_ += i_1286_;
						}
					} else if (i_1272_ == 3) {
						int i_1305_ = i_1276_;
						for (int i_1306_ = -i_1271_; i_1306_ < 0; i_1306_++) {
							int i_1307_ = (i_1277_ >> 16) * anInt8945;
							for (int i_1308_ = -i_1270_; i_1308_ < 0; i_1308_++) {
								int i_1309_ = (anIntArray11347[(i_1276_ >> 16) + i_1307_]);
								int i_1310_ = i_1309_ + i_1273_;
								int i_1311_ = ((i_1309_ & 0xff00ff) + (i_1273_ & 0xff00ff));
								int i_1312_ = ((i_1311_ & 0x1000100) + (i_1310_ - i_1311_ & 0x10000));
								is[i_1285_++] = i_1310_ - i_1312_ | i_1312_ - (i_1312_ >>> 8);
								i_1276_ += i_1281_;
							}
							i_1277_ += i_1282_;
							i_1276_ = i_1305_;
							i_1285_ += i_1286_;
						}
					} else if (i_1272_ == 2) {
						int i_1313_ = i_1273_ >>> 24;
						int i_1314_ = 256 - i_1313_;
						int i_1315_ = (i_1273_ & 0xff00ff) * i_1314_ & ~0xff00ff;
						int i_1316_ = (i_1273_ & 0xff00) * i_1314_ & 0xff0000;
						i_1273_ = (i_1315_ | i_1316_) >>> 8;
						int i_1317_ = i_1276_;
						for (int i_1318_ = -i_1271_; i_1318_ < 0; i_1318_++) {
							int i_1319_ = (i_1277_ >> 16) * anInt8945;
							for (int i_1320_ = -i_1270_; i_1320_ < 0; i_1320_++) {
								int i_1321_ = (anIntArray11347[(i_1276_ >> 16) + i_1319_]);
								i_1315_ = ((i_1321_ & 0xff00ff) * i_1313_ & ~0xff00ff);
								i_1316_ = (i_1321_ & 0xff00) * i_1313_ & 0xff0000;
								is[i_1285_++] = ((i_1315_ | i_1316_) >>> 8) + i_1273_;
								i_1276_ += i_1281_;
							}
							i_1277_ += i_1282_;
							i_1276_ = i_1317_;
							i_1285_ += i_1286_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1274_ == 1) {
					if (i_1272_ == 1) {
						int i_1322_ = i_1276_;
						for (int i_1323_ = -i_1271_; i_1323_ < 0; i_1323_++) {
							int i_1324_ = (i_1277_ >> 16) * anInt8945;
							for (int i_1325_ = -i_1270_; i_1325_ < 0; i_1325_++) {
								int i_1326_ = (anIntArray11347[(i_1276_ >> 16) + i_1324_]);
								if (i_1326_ != 0)
									is[i_1285_++] = i_1326_;
								else
									i_1285_++;
								i_1276_ += i_1281_;
							}
							i_1277_ += i_1282_;
							i_1276_ = i_1322_;
							i_1285_ += i_1286_;
						}
					} else if (i_1272_ == 0) {
						int i_1327_ = i_1276_;
						if ((i_1273_ & 0xffffff) == 16777215) {
							int i_1328_ = i_1273_ >>> 24;
							int i_1329_ = 256 - i_1328_;
							for (int i_1330_ = -i_1271_; i_1330_ < 0; i_1330_++) {
								int i_1331_ = (i_1277_ >> 16) * anInt8945;
								for (int i_1332_ = -i_1270_; i_1332_ < 0; i_1332_++) {
									int i_1333_ = (anIntArray11347[(i_1276_ >> 16) + i_1331_]);
									if (i_1333_ != 0) {
										int i_1334_ = is[i_1285_];
										is[i_1285_++] = ((((i_1333_ & 0xff00ff) * i_1328_ + ((i_1334_ & 0xff00ff) * i_1329_)) & ~0xff00ff) + (((i_1333_ & 0xff00) * i_1328_ + ((i_1334_ & 0xff00) * i_1329_)) & 0xff0000)) >> 8;
									} else
										i_1285_++;
									i_1276_ += i_1281_;
								}
								i_1277_ += i_1282_;
								i_1276_ = i_1327_;
								i_1285_ += i_1286_;
							}
						} else {
							int i_1335_ = (i_1273_ & 0xff0000) >> 16;
							int i_1336_ = (i_1273_ & 0xff00) >> 8;
							int i_1337_ = i_1273_ & 0xff;
							int i_1338_ = i_1273_ >>> 24;
							int i_1339_ = 256 - i_1338_;
							for (int i_1340_ = -i_1271_; i_1340_ < 0; i_1340_++) {
								int i_1341_ = (i_1277_ >> 16) * anInt8945;
								for (int i_1342_ = -i_1270_; i_1342_ < 0; i_1342_++) {
									int i_1343_ = (anIntArray11347[(i_1276_ >> 16) + i_1341_]);
									if (i_1343_ != 0) {
										if (i_1338_ != 255) {
											int i_1344_ = (((i_1343_ & 0xff0000) * i_1335_) & ~0xffffff);
											int i_1345_ = ((i_1343_ & 0xff00) * i_1336_ & 0xff0000);
											int i_1346_ = ((i_1343_ & 0xff) * i_1337_ & 0xff00);
											i_1343_ = (i_1344_ | i_1345_ | i_1346_) >>> 8;
											int i_1347_ = is[i_1285_];
											is[i_1285_++] = (((((i_1343_ & 0xff00ff) * i_1338_) + ((i_1347_ & 0xff00ff) * i_1339_)) & ~0xff00ff) + ((((i_1343_ & 0xff00) * i_1338_) + ((i_1347_ & 0xff00) * i_1339_)) & 0xff0000)) >> 8;
										} else {
											int i_1348_ = (((i_1343_ & 0xff0000) * i_1335_) & ~0xffffff);
											int i_1349_ = ((i_1343_ & 0xff00) * i_1336_ & 0xff0000);
											int i_1350_ = ((i_1343_ & 0xff) * i_1337_ & 0xff00);
											is[i_1285_++] = (i_1348_ | i_1349_ | i_1350_) >>> 8;
										}
									} else
										i_1285_++;
									i_1276_ += i_1281_;
								}
								i_1277_ += i_1282_;
								i_1276_ = i_1327_;
								i_1285_ += i_1286_;
							}
						}
					} else if (i_1272_ == 3) {
						int i_1351_ = i_1276_;
						int i_1352_ = i_1273_ >>> 24;
						int i_1353_ = 256 - i_1352_;
						for (int i_1354_ = -i_1271_; i_1354_ < 0; i_1354_++) {
							int i_1355_ = (i_1277_ >> 16) * anInt8945;
							for (int i_1356_ = -i_1270_; i_1356_ < 0; i_1356_++) {
								int i_1357_ = (anIntArray11347[(i_1276_ >> 16) + i_1355_]);
								int i_1358_ = i_1357_ + i_1273_;
								int i_1359_ = ((i_1357_ & 0xff00ff) + (i_1273_ & 0xff00ff));
								int i_1360_ = ((i_1359_ & 0x1000100) + (i_1358_ - i_1359_ & 0x10000));
								i_1360_ = i_1358_ - i_1360_ | i_1360_ - (i_1360_ >>> 8);
								if (i_1357_ == 0 && i_1352_ != 255) {
									i_1357_ = i_1360_;
									i_1360_ = is[i_1285_];
									i_1360_ = ((((i_1357_ & 0xff00ff) * i_1352_ + (i_1360_ & 0xff00ff) * i_1353_) & ~0xff00ff) + (((i_1357_ & 0xff00) * i_1352_ + (i_1360_ & 0xff00) * i_1353_) & 0xff0000)) >> 8;
								}
								is[i_1285_++] = i_1360_;
								i_1276_ += i_1281_;
							}
							i_1277_ += i_1282_;
							i_1276_ = i_1351_;
							i_1285_ += i_1286_;
						}
					} else if (i_1272_ == 2) {
						int i_1361_ = i_1273_ >>> 24;
						int i_1362_ = 256 - i_1361_;
						int i_1363_ = (i_1273_ & 0xff00ff) * i_1362_ & ~0xff00ff;
						int i_1364_ = (i_1273_ & 0xff00) * i_1362_ & 0xff0000;
						i_1273_ = (i_1363_ | i_1364_) >>> 8;
						int i_1365_ = i_1276_;
						for (int i_1366_ = -i_1271_; i_1366_ < 0; i_1366_++) {
							int i_1367_ = (i_1277_ >> 16) * anInt8945;
							for (int i_1368_ = -i_1270_; i_1368_ < 0; i_1368_++) {
								int i_1369_ = (anIntArray11347[(i_1276_ >> 16) + i_1367_]);
								if (i_1369_ != 0) {
									i_1363_ = ((i_1369_ & 0xff00ff) * i_1361_ & ~0xff00ff);
									i_1364_ = ((i_1369_ & 0xff00) * i_1361_ & 0xff0000);
									is[i_1285_++] = ((i_1363_ | i_1364_) >>> 8) + i_1273_;
								} else
									i_1285_++;
								i_1276_ += i_1281_;
							}
							i_1277_ += i_1282_;
							i_1276_ = i_1365_;
							i_1285_ += i_1286_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1274_ == 2) {
					if (i_1272_ == 1) {
						int i_1370_ = i_1276_;
						for (int i_1371_ = -i_1271_; i_1371_ < 0; i_1371_++) {
							int i_1372_ = (i_1277_ >> 16) * anInt8945;
							for (int i_1373_ = -i_1270_; i_1373_ < 0; i_1373_++) {
								int i_1374_ = (anIntArray11347[(i_1276_ >> 16) + i_1372_]);
								if (i_1374_ != 0) {
									int i_1375_ = is[i_1285_];
									int i_1376_ = i_1374_ + i_1375_;
									int i_1377_ = ((i_1374_ & 0xff00ff) + (i_1375_ & 0xff00ff));
									i_1375_ = ((i_1377_ & 0x1000100) + (i_1376_ - i_1377_ & 0x10000));
									is[i_1285_++] = (i_1376_ - i_1375_ | i_1375_ - (i_1375_ >>> 8));
								} else
									i_1285_++;
								i_1276_ += i_1281_;
							}
							i_1277_ += i_1282_;
							i_1276_ = i_1370_;
							i_1285_ += i_1286_;
						}
					} else if (i_1272_ == 0) {
						int i_1378_ = i_1276_;
						int i_1379_ = (i_1273_ & 0xff0000) >> 16;
						int i_1380_ = (i_1273_ & 0xff00) >> 8;
						int i_1381_ = i_1273_ & 0xff;
						for (int i_1382_ = -i_1271_; i_1382_ < 0; i_1382_++) {
							int i_1383_ = (i_1277_ >> 16) * anInt8945;
							for (int i_1384_ = -i_1270_; i_1384_ < 0; i_1384_++) {
								int i_1385_ = (anIntArray11347[(i_1276_ >> 16) + i_1383_]);
								if (i_1385_ != 0) {
									int i_1386_ = ((i_1385_ & 0xff0000) * i_1379_ & ~0xffffff);
									int i_1387_ = ((i_1385_ & 0xff00) * i_1380_ & 0xff0000);
									int i_1388_ = (i_1385_ & 0xff) * i_1381_ & 0xff00;
									i_1385_ = (i_1386_ | i_1387_ | i_1388_) >>> 8;
									int i_1389_ = is[i_1285_];
									int i_1390_ = i_1385_ + i_1389_;
									int i_1391_ = ((i_1385_ & 0xff00ff) + (i_1389_ & 0xff00ff));
									i_1389_ = ((i_1391_ & 0x1000100) + (i_1390_ - i_1391_ & 0x10000));
									is[i_1285_++] = (i_1390_ - i_1389_ | i_1389_ - (i_1389_ >>> 8));
								} else
									i_1285_++;
								i_1276_ += i_1281_;
							}
							i_1277_ += i_1282_;
							i_1276_ = i_1378_;
							i_1285_ += i_1286_;
						}
					} else if (i_1272_ == 3) {
						int i_1392_ = i_1276_;
						for (int i_1393_ = -i_1271_; i_1393_ < 0; i_1393_++) {
							int i_1394_ = (i_1277_ >> 16) * anInt8945;
							for (int i_1395_ = -i_1270_; i_1395_ < 0; i_1395_++) {
								int i_1396_ = (anIntArray11347[(i_1276_ >> 16) + i_1394_]);
								int i_1397_ = i_1396_ + i_1273_;
								int i_1398_ = ((i_1396_ & 0xff00ff) + (i_1273_ & 0xff00ff));
								int i_1399_ = ((i_1398_ & 0x1000100) + (i_1397_ - i_1398_ & 0x10000));
								i_1396_ = i_1397_ - i_1399_ | i_1399_ - (i_1399_ >>> 8);
								i_1399_ = is[i_1285_];
								i_1397_ = i_1396_ + i_1399_;
								i_1398_ = (i_1396_ & 0xff00ff) + (i_1399_ & 0xff00ff);
								i_1399_ = ((i_1398_ & 0x1000100) + (i_1397_ - i_1398_ & 0x10000));
								is[i_1285_++] = i_1397_ - i_1399_ | i_1399_ - (i_1399_ >>> 8);
								i_1276_ += i_1281_;
							}
							i_1277_ += i_1282_;
							i_1276_ = i_1392_;
							i_1285_ += i_1286_;
						}
					} else if (i_1272_ == 2) {
						int i_1400_ = i_1273_ >>> 24;
						int i_1401_ = 256 - i_1400_;
						int i_1402_ = (i_1273_ & 0xff00ff) * i_1401_ & ~0xff00ff;
						int i_1403_ = (i_1273_ & 0xff00) * i_1401_ & 0xff0000;
						i_1273_ = (i_1402_ | i_1403_) >>> 8;
						int i_1404_ = i_1276_;
						for (int i_1405_ = -i_1271_; i_1405_ < 0; i_1405_++) {
							int i_1406_ = (i_1277_ >> 16) * anInt8945;
							for (int i_1407_ = -i_1270_; i_1407_ < 0; i_1407_++) {
								int i_1408_ = (anIntArray11347[(i_1276_ >> 16) + i_1406_]);
								if (i_1408_ != 0) {
									i_1402_ = ((i_1408_ & 0xff00ff) * i_1400_ & ~0xff00ff);
									i_1403_ = ((i_1408_ & 0xff00) * i_1400_ & 0xff0000);
									i_1408_ = (((i_1402_ | i_1403_) >>> 8) + i_1273_);
									int i_1409_ = is[i_1285_];
									int i_1410_ = i_1408_ + i_1409_;
									int i_1411_ = ((i_1408_ & 0xff00ff) + (i_1409_ & 0xff00ff));
									i_1409_ = ((i_1411_ & 0x1000100) + (i_1410_ - i_1411_ & 0x10000));
									is[i_1285_++] = (i_1410_ - i_1409_ | i_1409_ - (i_1409_ >>> 8));
								} else
									i_1285_++;
								i_1276_ += i_1281_;
							}
							i_1277_ += i_1282_;
							i_1276_ = i_1404_;
							i_1285_ += i_1286_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method8429(boolean bool, boolean bool_1412_, boolean bool_1413_, int i, int i_1414_, float f, int i_1415_, int i_1416_, int i_1417_, int i_1418_, int i_1419_, int i_1420_, boolean bool_1421_) {
		if (i_1415_ > 0 && i_1416_ > 0 && (bool || bool_1412_)) {
			int i_1422_ = 0;
			int i_1423_ = 0;
			int i_1424_ = anInt8977 + anInt8945 + anInt8948;
			int i_1425_ = anInt8947 + anInt8950 + anInt8952;
			int i_1426_ = (i_1424_ << 16) / i_1415_;
			int i_1427_ = (i_1425_ << 16) / i_1416_;
			if (anInt8977 > 0) {
				int i_1428_ = ((anInt8977 << 16) + i_1426_ - 1) / i_1426_;
				i += i_1428_;
				i_1422_ += i_1428_ * i_1426_ - (anInt8977 << 16);
			}
			if (anInt8947 > 0) {
				int i_1429_ = ((anInt8947 << 16) + i_1427_ - 1) / i_1427_;
				i_1414_ += i_1429_;
				i_1423_ += i_1429_ * i_1427_ - (anInt8947 << 16);
			}
			if (anInt8945 < i_1424_)
				i_1415_ = ((anInt8945 << 16) - i_1422_ + i_1426_ - 1) / i_1426_;
			if (anInt8950 < i_1425_)
				i_1416_ = ((anInt8950 << 16) - i_1423_ + i_1427_ - 1) / i_1427_;
			int i_1430_ = i + i_1414_ * (aClass167_Sub1_8946.anInt8997 * -570111553);
			int i_1431_ = aClass167_Sub1_8946.anInt8997 * -570111553 - i_1415_;
			if (i_1414_ + i_1416_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_1416_ -= (i_1414_ + i_1416_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i_1414_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_1432_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_1414_;
				i_1416_ -= i_1432_;
				i_1430_ += i_1432_ * (aClass167_Sub1_8946.anInt8997 * -570111553);
				i_1423_ += i_1427_ * i_1432_;
			}
			if (i + i_1415_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_1433_ = i + i_1415_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_1415_ -= i_1433_;
				i_1431_ += i_1433_;
			}
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_1434_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_1415_ -= i_1434_;
				i_1430_ += i_1434_;
				i_1422_ += i_1426_ * i_1434_;
				i_1431_ += i_1434_;
			}
			float[] fs = aClass167_Sub1_8946.aFloatArray8999;
			int[] is = aClass167_Sub1_8946.anIntArray8996;
			if (i_1419_ == 0) {
				if (i_1417_ == 1) {
					int i_1435_ = i_1422_;
					for (int i_1436_ = -i_1416_; i_1436_ < 0; i_1436_++) {
						int i_1437_ = (i_1423_ >> 16) * anInt8945;
						for (int i_1438_ = -i_1415_; i_1438_ < 0; i_1438_++) {
							if (!bool_1412_ || f < fs[i_1430_]) {
								if (bool)
									is[i_1430_] = (anIntArray11347[(i_1422_ >> 16) + i_1437_]);
								if (bool_1412_ && bool_1421_)
									fs[i_1430_] = f;
							}
							i_1422_ += i_1426_;
							i_1430_++;
						}
						i_1423_ += i_1427_;
						i_1422_ = i_1435_;
						i_1430_ += i_1431_;
					}
				} else if (i_1417_ == 0) {
					int i_1439_ = (i_1418_ & 0xff0000) >> 16;
					int i_1440_ = (i_1418_ & 0xff00) >> 8;
					int i_1441_ = i_1418_ & 0xff;
					int i_1442_ = i_1422_;
					for (int i_1443_ = -i_1416_; i_1443_ < 0; i_1443_++) {
						int i_1444_ = (i_1423_ >> 16) * anInt8945;
						for (int i_1445_ = -i_1415_; i_1445_ < 0; i_1445_++) {
							if (!bool_1412_ || f < fs[i_1430_]) {
								if (bool) {
									int i_1446_ = (anIntArray11347[(i_1422_ >> 16) + i_1444_]);
									int i_1447_ = ((i_1446_ & 0xff0000) * i_1439_ & ~0xffffff);
									int i_1448_ = ((i_1446_ & 0xff00) * i_1440_ & 0xff0000);
									int i_1449_ = (i_1446_ & 0xff) * i_1441_ & 0xff00;
									is[i_1430_] = (i_1447_ | i_1448_ | i_1449_) >>> 8;
								}
								if (bool_1412_ && bool_1421_)
									fs[i_1430_] = f;
							}
							i_1422_ += i_1426_;
							i_1430_++;
						}
						i_1423_ += i_1427_;
						i_1422_ = i_1442_;
						i_1430_ += i_1431_;
					}
				} else if (i_1417_ == 3) {
					int i_1450_ = i_1422_;
					for (int i_1451_ = -i_1416_; i_1451_ < 0; i_1451_++) {
						int i_1452_ = (i_1423_ >> 16) * anInt8945;
						for (int i_1453_ = -i_1415_; i_1453_ < 0; i_1453_++) {
							if (!bool_1412_ || f < fs[i_1430_]) {
								if (bool) {
									int i_1454_ = (anIntArray11347[(i_1422_ >> 16) + i_1452_]);
									int i_1455_ = i_1454_ + i_1418_;
									int i_1456_ = ((i_1454_ & 0xff00ff) + (i_1418_ & 0xff00ff));
									int i_1457_ = ((i_1456_ & 0x1000100) + (i_1455_ - i_1456_ & 0x10000));
									is[i_1430_] = (i_1455_ - i_1457_ | i_1457_ - (i_1457_ >>> 8));
								}
								if (bool_1412_ && bool_1421_)
									fs[i_1430_] = f;
							}
							i_1422_ += i_1426_;
							i_1430_++;
						}
						i_1423_ += i_1427_;
						i_1422_ = i_1450_;
						i_1430_ += i_1431_;
					}
				} else if (i_1417_ == 2) {
					int i_1458_ = i_1418_ >>> 24;
					int i_1459_ = 256 - i_1458_;
					int i_1460_ = (i_1418_ & 0xff00ff) * i_1459_ & ~0xff00ff;
					int i_1461_ = (i_1418_ & 0xff00) * i_1459_ & 0xff0000;
					i_1418_ = (i_1460_ | i_1461_) >>> 8;
					int i_1462_ = i_1422_;
					for (int i_1463_ = -i_1416_; i_1463_ < 0; i_1463_++) {
						int i_1464_ = (i_1423_ >> 16) * anInt8945;
						for (int i_1465_ = -i_1415_; i_1465_ < 0; i_1465_++) {
							if (!bool_1412_ || f < fs[i_1430_]) {
								if (bool) {
									int i_1466_ = (anIntArray11347[(i_1422_ >> 16) + i_1464_]);
									i_1460_ = ((i_1466_ & 0xff00ff) * i_1458_ & ~0xff00ff);
									i_1461_ = ((i_1466_ & 0xff00) * i_1458_ & 0xff0000);
									is[i_1430_] = (((i_1460_ | i_1461_) >>> 8) + i_1418_);
								}
								if (bool_1412_ && bool_1421_)
									fs[i_1430_] = f;
							}
							i_1422_ += i_1426_;
							i_1430_++;
						}
						i_1423_ += i_1427_;
						i_1422_ = i_1462_;
						i_1430_ += i_1431_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1419_ == 1) {
				if (i_1417_ == 1) {
					int i_1467_ = i_1422_;
					for (int i_1468_ = -i_1416_; i_1468_ < 0; i_1468_++) {
						int i_1469_ = (i_1423_ >> 16) * anInt8945;
						for (int i_1470_ = -i_1415_; i_1470_ < 0; i_1470_++) {
							if (!bool_1412_ || f < fs[i_1430_]) {
								int i_1471_ = (anIntArray11347[(i_1422_ >> 16) + i_1469_]);
								if (i_1471_ != 0) {
									if (bool)
										is[i_1430_] = i_1471_;
									if (bool_1412_ && bool_1421_)
										fs[i_1430_] = f;
								}
							}
							i_1422_ += i_1426_;
							i_1430_++;
						}
						i_1423_ += i_1427_;
						i_1422_ = i_1467_;
						i_1430_ += i_1431_;
					}
				} else if (i_1417_ == 0) {
					int i_1472_ = i_1422_;
					if ((i_1418_ & 0xffffff) == 16777215) {
						int i_1473_ = i_1418_ >>> 24;
						int i_1474_ = 256 - i_1473_;
						for (int i_1475_ = -i_1416_; i_1475_ < 0; i_1475_++) {
							int i_1476_ = (i_1423_ >> 16) * anInt8945;
							for (int i_1477_ = -i_1415_; i_1477_ < 0; i_1477_++) {
								if (!bool_1412_ || f < fs[i_1430_]) {
									int i_1478_ = (anIntArray11347[(i_1422_ >> 16) + i_1476_]);
									if (i_1478_ != 0) {
										if (bool) {
											int i_1479_ = is[i_1430_];
											is[i_1430_] = (((((i_1478_ & 0xff00ff) * i_1473_) + ((i_1479_ & 0xff00ff) * i_1474_)) & ~0xff00ff) + ((((i_1478_ & 0xff00) * i_1473_) + ((i_1479_ & 0xff00) * i_1474_)) & 0xff0000)) >> 8;
										}
										if (bool_1412_ && bool_1421_)
											fs[i_1430_] = f;
									}
								}
								i_1422_ += i_1426_;
								i_1430_++;
							}
							i_1423_ += i_1427_;
							i_1422_ = i_1472_;
							i_1430_ += i_1431_;
						}
					} else {
						int i_1480_ = (i_1418_ & 0xff0000) >> 16;
						int i_1481_ = (i_1418_ & 0xff00) >> 8;
						int i_1482_ = i_1418_ & 0xff;
						int i_1483_ = i_1418_ >>> 24;
						int i_1484_ = 256 - i_1483_;
						for (int i_1485_ = -i_1416_; i_1485_ < 0; i_1485_++) {
							int i_1486_ = (i_1423_ >> 16) * anInt8945;
							for (int i_1487_ = -i_1415_; i_1487_ < 0; i_1487_++) {
								if (!bool_1412_ || f < fs[i_1430_]) {
									int i_1488_ = (anIntArray11347[(i_1422_ >> 16) + i_1486_]);
									if (i_1488_ != 0) {
										if (i_1483_ != 255) {
											if (bool) {
												int i_1489_ = (((i_1488_ & 0xff0000) * i_1480_) & ~0xffffff);
												int i_1490_ = (((i_1488_ & 0xff00) * i_1481_) & 0xff0000);
												int i_1491_ = (((i_1488_ & 0xff) * i_1482_) & 0xff00);
												i_1488_ = (i_1489_ | i_1490_ | i_1491_) >>> 8;
												int i_1492_ = is[i_1430_];
												is[i_1430_] = (((((i_1488_ & 0xff00ff) * i_1483_) + ((i_1492_ & 0xff00ff) * i_1484_)) & ~0xff00ff) + ((((i_1488_ & 0xff00) * i_1483_) + ((i_1492_ & 0xff00) * i_1484_)) & 0xff0000)) >> 8;
											}
											if (bool_1412_ && bool_1421_)
												fs[i_1430_] = f;
										} else {
											if (bool) {
												int i_1493_ = (((i_1488_ & 0xff0000) * i_1480_) & ~0xffffff);
												int i_1494_ = (((i_1488_ & 0xff00) * i_1481_) & 0xff0000);
												int i_1495_ = (((i_1488_ & 0xff) * i_1482_) & 0xff00);
												is[i_1430_] = (i_1493_ | i_1494_ | i_1495_) >>> 8;
											}
											if (bool_1412_ && bool_1421_)
												fs[i_1430_] = f;
										}
									}
								}
								i_1422_ += i_1426_;
								i_1430_++;
							}
							i_1423_ += i_1427_;
							i_1422_ = i_1472_;
							i_1430_ += i_1431_;
						}
					}
				} else if (i_1417_ == 3) {
					int i_1496_ = i_1422_;
					int i_1497_ = i_1418_ >>> 24;
					int i_1498_ = 256 - i_1497_;
					for (int i_1499_ = -i_1416_; i_1499_ < 0; i_1499_++) {
						int i_1500_ = (i_1423_ >> 16) * anInt8945;
						for (int i_1501_ = -i_1415_; i_1501_ < 0; i_1501_++) {
							if (!bool_1412_ || f < fs[i_1430_]) {
								if (bool) {
									int i_1502_ = (anIntArray11347[(i_1422_ >> 16) + i_1500_]);
									int i_1503_ = i_1502_ + i_1418_;
									int i_1504_ = ((i_1502_ & 0xff00ff) + (i_1418_ & 0xff00ff));
									int i_1505_ = ((i_1504_ & 0x1000100) + (i_1503_ - i_1504_ & 0x10000));
									i_1505_ = (i_1503_ - i_1505_ | i_1505_ - (i_1505_ >>> 8));
									if (i_1502_ == 0 && i_1497_ != 255) {
										i_1502_ = i_1505_;
										i_1505_ = is[i_1430_];
										i_1505_ = ((((i_1502_ & 0xff00ff) * i_1497_ + ((i_1505_ & 0xff00ff) * i_1498_)) & ~0xff00ff) + (((i_1502_ & 0xff00) * i_1497_ + ((i_1505_ & 0xff00) * i_1498_)) & 0xff0000)) >> 8;
									}
									is[i_1430_] = i_1505_;
								}
								if (bool_1412_ && bool_1421_)
									fs[i_1430_] = f;
							}
							i_1422_ += i_1426_;
							i_1430_++;
						}
						i_1423_ += i_1427_;
						i_1422_ = i_1496_;
						i_1430_ += i_1431_;
					}
				} else if (i_1417_ == 2) {
					int i_1506_ = i_1418_ >>> 24;
					int i_1507_ = 256 - i_1506_;
					int i_1508_ = (i_1418_ & 0xff00ff) * i_1507_ & ~0xff00ff;
					int i_1509_ = (i_1418_ & 0xff00) * i_1507_ & 0xff0000;
					i_1418_ = (i_1508_ | i_1509_) >>> 8;
					int i_1510_ = i_1422_;
					for (int i_1511_ = -i_1416_; i_1511_ < 0; i_1511_++) {
						int i_1512_ = (i_1423_ >> 16) * anInt8945;
						for (int i_1513_ = -i_1415_; i_1513_ < 0; i_1513_++) {
							if (!bool_1412_ || f < fs[i_1430_]) {
								int i_1514_ = (anIntArray11347[(i_1422_ >> 16) + i_1512_]);
								if (i_1514_ != 0) {
									if (bool) {
										i_1508_ = ((i_1514_ & 0xff00ff) * i_1506_ & ~0xff00ff);
										i_1509_ = ((i_1514_ & 0xff00) * i_1506_ & 0xff0000);
										is[i_1430_] = ((i_1508_ | i_1509_) >>> 8) + i_1418_;
									}
									if (bool_1412_ && bool_1421_)
										fs[i_1430_] = f;
								}
							}
							i_1422_ += i_1426_;
							i_1430_++;
						}
						i_1423_ += i_1427_;
						i_1422_ = i_1510_;
						i_1430_ += i_1431_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1419_ == 2) {
				if (i_1417_ == 1) {
					int i_1515_ = i_1422_;
					for (int i_1516_ = -i_1416_; i_1516_ < 0; i_1516_++) {
						int i_1517_ = (i_1423_ >> 16) * anInt8945;
						for (int i_1518_ = -i_1415_; i_1518_ < 0; i_1518_++) {
							if (!bool_1412_ || f < fs[i_1430_]) {
								int i_1519_ = (anIntArray11347[(i_1422_ >> 16) + i_1517_]);
								if (i_1519_ != 0) {
									if (bool) {
										int i_1520_ = is[i_1430_];
										int i_1521_ = i_1519_ + i_1520_;
										int i_1522_ = ((i_1519_ & 0xff00ff) + (i_1520_ & 0xff00ff));
										i_1520_ = ((i_1522_ & 0x1000100) + (i_1521_ - i_1522_ & 0x10000));
										is[i_1430_] = (i_1521_ - i_1520_ | i_1520_ - (i_1520_ >>> 8));
									}
									if (bool_1412_ && bool_1421_)
										fs[i_1430_] = f;
								}
							}
							i_1422_ += i_1426_;
							i_1430_++;
						}
						i_1423_ += i_1427_;
						i_1422_ = i_1515_;
						i_1430_ += i_1431_;
					}
				} else if (i_1417_ == 0) {
					int i_1523_ = i_1422_;
					int i_1524_ = (i_1418_ & 0xff0000) >> 16;
					int i_1525_ = (i_1418_ & 0xff00) >> 8;
					int i_1526_ = i_1418_ & 0xff;
					for (int i_1527_ = -i_1416_; i_1527_ < 0; i_1527_++) {
						int i_1528_ = (i_1423_ >> 16) * anInt8945;
						for (int i_1529_ = -i_1415_; i_1529_ < 0; i_1529_++) {
							if (!bool_1412_ || f < fs[i_1430_]) {
								int i_1530_ = (anIntArray11347[(i_1422_ >> 16) + i_1528_]);
								if (i_1530_ != 0) {
									if (bool) {
										int i_1531_ = ((i_1530_ & 0xff0000) * i_1524_ & ~0xffffff);
										int i_1532_ = ((i_1530_ & 0xff00) * i_1525_ & 0xff0000);
										int i_1533_ = ((i_1530_ & 0xff) * i_1526_ & 0xff00);
										i_1530_ = (i_1531_ | i_1532_ | i_1533_) >>> 8;
										int i_1534_ = is[i_1430_];
										int i_1535_ = i_1530_ + i_1534_;
										int i_1536_ = ((i_1530_ & 0xff00ff) + (i_1534_ & 0xff00ff));
										i_1534_ = ((i_1536_ & 0x1000100) + (i_1535_ - i_1536_ & 0x10000));
										is[i_1430_] = (i_1535_ - i_1534_ | i_1534_ - (i_1534_ >>> 8));
									}
									if (bool_1412_ && bool_1421_)
										fs[i_1430_] = f;
								}
							}
							i_1422_ += i_1426_;
							i_1430_++;
						}
						i_1423_ += i_1427_;
						i_1422_ = i_1523_;
						i_1430_ += i_1431_;
					}
				} else if (i_1417_ == 3) {
					int i_1537_ = i_1422_;
					for (int i_1538_ = -i_1416_; i_1538_ < 0; i_1538_++) {
						int i_1539_ = (i_1423_ >> 16) * anInt8945;
						for (int i_1540_ = -i_1415_; i_1540_ < 0; i_1540_++) {
							if (!bool_1412_ || f < fs[i_1430_]) {
								if (bool) {
									int i_1541_ = (anIntArray11347[(i_1422_ >> 16) + i_1539_]);
									int i_1542_ = i_1541_ + i_1418_;
									int i_1543_ = ((i_1541_ & 0xff00ff) + (i_1418_ & 0xff00ff));
									int i_1544_ = ((i_1543_ & 0x1000100) + (i_1542_ - i_1543_ & 0x10000));
									i_1541_ = (i_1542_ - i_1544_ | i_1544_ - (i_1544_ >>> 8));
									i_1544_ = is[i_1430_];
									i_1542_ = i_1541_ + i_1544_;
									i_1543_ = (i_1541_ & 0xff00ff) + (i_1544_ & 0xff00ff);
									i_1544_ = ((i_1543_ & 0x1000100) + (i_1542_ - i_1543_ & 0x10000));
									is[i_1430_] = (i_1542_ - i_1544_ | i_1544_ - (i_1544_ >>> 8));
								}
								if (bool_1412_ && bool_1421_)
									fs[i_1430_] = f;
							}
							i_1422_ += i_1426_;
							i_1430_++;
						}
						i_1423_ += i_1427_;
						i_1422_ = i_1537_;
						i_1430_ += i_1431_;
					}
				} else if (i_1417_ == 2) {
					int i_1545_ = i_1418_ >>> 24;
					int i_1546_ = 256 - i_1545_;
					int i_1547_ = (i_1418_ & 0xff00ff) * i_1546_ & ~0xff00ff;
					int i_1548_ = (i_1418_ & 0xff00) * i_1546_ & 0xff0000;
					i_1418_ = (i_1547_ | i_1548_) >>> 8;
					int i_1549_ = i_1422_;
					for (int i_1550_ = -i_1416_; i_1550_ < 0; i_1550_++) {
						int i_1551_ = (i_1423_ >> 16) * anInt8945;
						for (int i_1552_ = -i_1415_; i_1552_ < 0; i_1552_++) {
							if (!bool_1412_ || f < fs[i_1430_]) {
								int i_1553_ = (anIntArray11347[(i_1422_ >> 16) + i_1551_]);
								if (i_1553_ != 0) {
									if (bool) {
										i_1547_ = ((i_1553_ & 0xff00ff) * i_1545_ & ~0xff00ff);
										i_1548_ = ((i_1553_ & 0xff00) * i_1545_ & 0xff0000);
										i_1553_ = (((i_1547_ | i_1548_) >>> 8) + i_1418_);
										int i_1554_ = is[i_1430_];
										int i_1555_ = i_1553_ + i_1554_;
										int i_1556_ = ((i_1553_ & 0xff00ff) + (i_1554_ & 0xff00ff));
										i_1554_ = ((i_1556_ & 0x1000100) + (i_1555_ - i_1556_ & 0x10000));
										is[i_1430_] = (i_1555_ - i_1554_ | i_1554_ - (i_1554_ >>> 8));
									}
									if (bool_1412_ && bool_1421_)
										fs[i_1430_] = f;
								}
							}
							i_1422_ += i_1426_;
							i_1430_++;
						}
						i_1423_ += i_1427_;
						i_1422_ = i_1549_;
						i_1430_ += i_1431_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method1726(int i, int i_1557_, int i_1558_, int i_1559_, int i_1560_, int i_1561_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is == null)
			throw new IllegalStateException("");
		for (int i_1562_ = 0; i_1562_ < i_1559_; i_1562_++) {
			int i_1563_ = (i_1557_ + i_1562_) * anInt8945 + i;
			int i_1564_ = ((i_1561_ + i_1562_) * (aClass167_Sub1_8946.anInt8997 * -570111553) + i_1560_);
			for (int i_1565_ = 0; i_1565_ < i_1558_; i_1565_++)
				anIntArray11347[i_1563_ + i_1565_] = is[i_1564_ + i_1565_];
		}
	}

	void method1732(int i, int i_1566_, int i_1567_, int i_1568_, int i_1569_, int i_1570_, int i_1571_, int i_1572_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		if (i_1567_ > 0 && i_1568_ > 0) {
			int[] is = aClass167_Sub1_8946.anIntArray8996;
			if (is != null) {
				int i_1573_ = 0;
				int i_1574_ = 0;
				int i_1575_ = aClass167_Sub1_8946.anInt8997 * -570111553;
				int i_1576_ = anInt8977 + anInt8945 + anInt8948;
				int i_1577_ = anInt8947 + anInt8950 + anInt8952;
				int i_1578_ = (i_1576_ << 16) / i_1567_;
				int i_1579_ = (i_1577_ << 16) / i_1568_;
				if (anInt8977 > 0) {
					int i_1580_ = ((anInt8977 << 16) + i_1578_ - 1) / i_1578_;
					i += i_1580_;
					i_1573_ += i_1580_ * i_1578_ - (anInt8977 << 16);
				}
				if (anInt8947 > 0) {
					int i_1581_ = ((anInt8947 << 16) + i_1579_ - 1) / i_1579_;
					i_1566_ += i_1581_;
					i_1574_ += i_1581_ * i_1579_ - (anInt8947 << 16);
				}
				if (anInt8945 < i_1576_)
					i_1567_ = (((anInt8945 << 16) - i_1573_ + i_1578_ - 1) / i_1578_);
				if (anInt8950 < i_1577_)
					i_1568_ = (((anInt8950 << 16) - i_1574_ + i_1579_ - 1) / i_1579_);
				int i_1582_ = i + i_1566_ * i_1575_;
				int i_1583_ = i_1575_ - i_1567_;
				if (i_1566_ + i_1568_ > aClass167_Sub1_8946.anInt9003 * -148513205)
					i_1568_ -= (i_1566_ + i_1568_ - aClass167_Sub1_8946.anInt9003 * -148513205);
				if (i_1566_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
					int i_1584_ = (aClass167_Sub1_8946.anInt9021 * -1593163361 - i_1566_);
					i_1568_ -= i_1584_;
					i_1582_ += i_1584_ * i_1575_;
					i_1574_ += i_1579_ * i_1584_;
				}
				if (i + i_1567_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
					int i_1585_ = (i + i_1567_ - aClass167_Sub1_8946.anInt9001 * 2024498147);
					i_1567_ -= i_1585_;
					i_1583_ += i_1585_;
				}
				if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
					int i_1586_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
					i_1567_ -= i_1586_;
					i_1582_ += i_1586_;
					i_1573_ += i_1578_ * i_1586_;
					i_1583_ += i_1586_;
				}
				if (i_1571_ == 0) {
					if (i_1569_ == 1) {
						int i_1587_ = i_1573_;
						for (int i_1588_ = -i_1568_; i_1588_ < 0; i_1588_++) {
							int i_1589_ = (i_1574_ >> 16) * anInt8945;
							for (int i_1590_ = -i_1567_; i_1590_ < 0; i_1590_++) {
								is[i_1582_++] = (anIntArray11347[(i_1573_ >> 16) + i_1589_]);
								i_1573_ += i_1578_;
							}
							i_1574_ += i_1579_;
							i_1573_ = i_1587_;
							i_1582_ += i_1583_;
						}
					} else if (i_1569_ == 0) {
						int i_1591_ = (i_1570_ & 0xff0000) >> 16;
						int i_1592_ = (i_1570_ & 0xff00) >> 8;
						int i_1593_ = i_1570_ & 0xff;
						int i_1594_ = i_1573_;
						for (int i_1595_ = -i_1568_; i_1595_ < 0; i_1595_++) {
							int i_1596_ = (i_1574_ >> 16) * anInt8945;
							for (int i_1597_ = -i_1567_; i_1597_ < 0; i_1597_++) {
								int i_1598_ = (anIntArray11347[(i_1573_ >> 16) + i_1596_]);
								int i_1599_ = ((i_1598_ & 0xff0000) * i_1591_ & ~0xffffff);
								int i_1600_ = (i_1598_ & 0xff00) * i_1592_ & 0xff0000;
								int i_1601_ = (i_1598_ & 0xff) * i_1593_ & 0xff00;
								is[i_1582_++] = (i_1599_ | i_1600_ | i_1601_) >>> 8;
								i_1573_ += i_1578_;
							}
							i_1574_ += i_1579_;
							i_1573_ = i_1594_;
							i_1582_ += i_1583_;
						}
					} else if (i_1569_ == 3) {
						int i_1602_ = i_1573_;
						for (int i_1603_ = -i_1568_; i_1603_ < 0; i_1603_++) {
							int i_1604_ = (i_1574_ >> 16) * anInt8945;
							for (int i_1605_ = -i_1567_; i_1605_ < 0; i_1605_++) {
								int i_1606_ = (anIntArray11347[(i_1573_ >> 16) + i_1604_]);
								int i_1607_ = i_1606_ + i_1570_;
								int i_1608_ = ((i_1606_ & 0xff00ff) + (i_1570_ & 0xff00ff));
								int i_1609_ = ((i_1608_ & 0x1000100) + (i_1607_ - i_1608_ & 0x10000));
								is[i_1582_++] = i_1607_ - i_1609_ | i_1609_ - (i_1609_ >>> 8);
								i_1573_ += i_1578_;
							}
							i_1574_ += i_1579_;
							i_1573_ = i_1602_;
							i_1582_ += i_1583_;
						}
					} else if (i_1569_ == 2) {
						int i_1610_ = i_1570_ >>> 24;
						int i_1611_ = 256 - i_1610_;
						int i_1612_ = (i_1570_ & 0xff00ff) * i_1611_ & ~0xff00ff;
						int i_1613_ = (i_1570_ & 0xff00) * i_1611_ & 0xff0000;
						i_1570_ = (i_1612_ | i_1613_) >>> 8;
						int i_1614_ = i_1573_;
						for (int i_1615_ = -i_1568_; i_1615_ < 0; i_1615_++) {
							int i_1616_ = (i_1574_ >> 16) * anInt8945;
							for (int i_1617_ = -i_1567_; i_1617_ < 0; i_1617_++) {
								int i_1618_ = (anIntArray11347[(i_1573_ >> 16) + i_1616_]);
								i_1612_ = ((i_1618_ & 0xff00ff) * i_1610_ & ~0xff00ff);
								i_1613_ = (i_1618_ & 0xff00) * i_1610_ & 0xff0000;
								is[i_1582_++] = ((i_1612_ | i_1613_) >>> 8) + i_1570_;
								i_1573_ += i_1578_;
							}
							i_1574_ += i_1579_;
							i_1573_ = i_1614_;
							i_1582_ += i_1583_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1571_ == 1) {
					if (i_1569_ == 1) {
						int i_1619_ = i_1573_;
						for (int i_1620_ = -i_1568_; i_1620_ < 0; i_1620_++) {
							int i_1621_ = (i_1574_ >> 16) * anInt8945;
							for (int i_1622_ = -i_1567_; i_1622_ < 0; i_1622_++) {
								int i_1623_ = (anIntArray11347[(i_1573_ >> 16) + i_1621_]);
								if (i_1623_ != 0)
									is[i_1582_++] = i_1623_;
								else
									i_1582_++;
								i_1573_ += i_1578_;
							}
							i_1574_ += i_1579_;
							i_1573_ = i_1619_;
							i_1582_ += i_1583_;
						}
					} else if (i_1569_ == 0) {
						int i_1624_ = i_1573_;
						if ((i_1570_ & 0xffffff) == 16777215) {
							int i_1625_ = i_1570_ >>> 24;
							int i_1626_ = 256 - i_1625_;
							for (int i_1627_ = -i_1568_; i_1627_ < 0; i_1627_++) {
								int i_1628_ = (i_1574_ >> 16) * anInt8945;
								for (int i_1629_ = -i_1567_; i_1629_ < 0; i_1629_++) {
									int i_1630_ = (anIntArray11347[(i_1573_ >> 16) + i_1628_]);
									if (i_1630_ != 0) {
										int i_1631_ = is[i_1582_];
										is[i_1582_++] = ((((i_1630_ & 0xff00ff) * i_1625_ + ((i_1631_ & 0xff00ff) * i_1626_)) & ~0xff00ff) + (((i_1630_ & 0xff00) * i_1625_ + ((i_1631_ & 0xff00) * i_1626_)) & 0xff0000)) >> 8;
									} else
										i_1582_++;
									i_1573_ += i_1578_;
								}
								i_1574_ += i_1579_;
								i_1573_ = i_1624_;
								i_1582_ += i_1583_;
							}
						} else {
							int i_1632_ = (i_1570_ & 0xff0000) >> 16;
							int i_1633_ = (i_1570_ & 0xff00) >> 8;
							int i_1634_ = i_1570_ & 0xff;
							int i_1635_ = i_1570_ >>> 24;
							int i_1636_ = 256 - i_1635_;
							for (int i_1637_ = -i_1568_; i_1637_ < 0; i_1637_++) {
								int i_1638_ = (i_1574_ >> 16) * anInt8945;
								for (int i_1639_ = -i_1567_; i_1639_ < 0; i_1639_++) {
									int i_1640_ = (anIntArray11347[(i_1573_ >> 16) + i_1638_]);
									if (i_1640_ != 0) {
										if (i_1635_ != 255) {
											int i_1641_ = (((i_1640_ & 0xff0000) * i_1632_) & ~0xffffff);
											int i_1642_ = ((i_1640_ & 0xff00) * i_1633_ & 0xff0000);
											int i_1643_ = ((i_1640_ & 0xff) * i_1634_ & 0xff00);
											i_1640_ = (i_1641_ | i_1642_ | i_1643_) >>> 8;
											int i_1644_ = is[i_1582_];
											is[i_1582_++] = (((((i_1640_ & 0xff00ff) * i_1635_) + ((i_1644_ & 0xff00ff) * i_1636_)) & ~0xff00ff) + ((((i_1640_ & 0xff00) * i_1635_) + ((i_1644_ & 0xff00) * i_1636_)) & 0xff0000)) >> 8;
										} else {
											int i_1645_ = (((i_1640_ & 0xff0000) * i_1632_) & ~0xffffff);
											int i_1646_ = ((i_1640_ & 0xff00) * i_1633_ & 0xff0000);
											int i_1647_ = ((i_1640_ & 0xff) * i_1634_ & 0xff00);
											is[i_1582_++] = (i_1645_ | i_1646_ | i_1647_) >>> 8;
										}
									} else
										i_1582_++;
									i_1573_ += i_1578_;
								}
								i_1574_ += i_1579_;
								i_1573_ = i_1624_;
								i_1582_ += i_1583_;
							}
						}
					} else if (i_1569_ == 3) {
						int i_1648_ = i_1573_;
						int i_1649_ = i_1570_ >>> 24;
						int i_1650_ = 256 - i_1649_;
						for (int i_1651_ = -i_1568_; i_1651_ < 0; i_1651_++) {
							int i_1652_ = (i_1574_ >> 16) * anInt8945;
							for (int i_1653_ = -i_1567_; i_1653_ < 0; i_1653_++) {
								int i_1654_ = (anIntArray11347[(i_1573_ >> 16) + i_1652_]);
								int i_1655_ = i_1654_ + i_1570_;
								int i_1656_ = ((i_1654_ & 0xff00ff) + (i_1570_ & 0xff00ff));
								int i_1657_ = ((i_1656_ & 0x1000100) + (i_1655_ - i_1656_ & 0x10000));
								i_1657_ = i_1655_ - i_1657_ | i_1657_ - (i_1657_ >>> 8);
								if (i_1654_ == 0 && i_1649_ != 255) {
									i_1654_ = i_1657_;
									i_1657_ = is[i_1582_];
									i_1657_ = ((((i_1654_ & 0xff00ff) * i_1649_ + (i_1657_ & 0xff00ff) * i_1650_) & ~0xff00ff) + (((i_1654_ & 0xff00) * i_1649_ + (i_1657_ & 0xff00) * i_1650_) & 0xff0000)) >> 8;
								}
								is[i_1582_++] = i_1657_;
								i_1573_ += i_1578_;
							}
							i_1574_ += i_1579_;
							i_1573_ = i_1648_;
							i_1582_ += i_1583_;
						}
					} else if (i_1569_ == 2) {
						int i_1658_ = i_1570_ >>> 24;
						int i_1659_ = 256 - i_1658_;
						int i_1660_ = (i_1570_ & 0xff00ff) * i_1659_ & ~0xff00ff;
						int i_1661_ = (i_1570_ & 0xff00) * i_1659_ & 0xff0000;
						i_1570_ = (i_1660_ | i_1661_) >>> 8;
						int i_1662_ = i_1573_;
						for (int i_1663_ = -i_1568_; i_1663_ < 0; i_1663_++) {
							int i_1664_ = (i_1574_ >> 16) * anInt8945;
							for (int i_1665_ = -i_1567_; i_1665_ < 0; i_1665_++) {
								int i_1666_ = (anIntArray11347[(i_1573_ >> 16) + i_1664_]);
								if (i_1666_ != 0) {
									i_1660_ = ((i_1666_ & 0xff00ff) * i_1658_ & ~0xff00ff);
									i_1661_ = ((i_1666_ & 0xff00) * i_1658_ & 0xff0000);
									is[i_1582_++] = ((i_1660_ | i_1661_) >>> 8) + i_1570_;
								} else
									i_1582_++;
								i_1573_ += i_1578_;
							}
							i_1574_ += i_1579_;
							i_1573_ = i_1662_;
							i_1582_ += i_1583_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1571_ == 2) {
					if (i_1569_ == 1) {
						int i_1667_ = i_1573_;
						for (int i_1668_ = -i_1568_; i_1668_ < 0; i_1668_++) {
							int i_1669_ = (i_1574_ >> 16) * anInt8945;
							for (int i_1670_ = -i_1567_; i_1670_ < 0; i_1670_++) {
								int i_1671_ = (anIntArray11347[(i_1573_ >> 16) + i_1669_]);
								if (i_1671_ != 0) {
									int i_1672_ = is[i_1582_];
									int i_1673_ = i_1671_ + i_1672_;
									int i_1674_ = ((i_1671_ & 0xff00ff) + (i_1672_ & 0xff00ff));
									i_1672_ = ((i_1674_ & 0x1000100) + (i_1673_ - i_1674_ & 0x10000));
									is[i_1582_++] = (i_1673_ - i_1672_ | i_1672_ - (i_1672_ >>> 8));
								} else
									i_1582_++;
								i_1573_ += i_1578_;
							}
							i_1574_ += i_1579_;
							i_1573_ = i_1667_;
							i_1582_ += i_1583_;
						}
					} else if (i_1569_ == 0) {
						int i_1675_ = i_1573_;
						int i_1676_ = (i_1570_ & 0xff0000) >> 16;
						int i_1677_ = (i_1570_ & 0xff00) >> 8;
						int i_1678_ = i_1570_ & 0xff;
						for (int i_1679_ = -i_1568_; i_1679_ < 0; i_1679_++) {
							int i_1680_ = (i_1574_ >> 16) * anInt8945;
							for (int i_1681_ = -i_1567_; i_1681_ < 0; i_1681_++) {
								int i_1682_ = (anIntArray11347[(i_1573_ >> 16) + i_1680_]);
								if (i_1682_ != 0) {
									int i_1683_ = ((i_1682_ & 0xff0000) * i_1676_ & ~0xffffff);
									int i_1684_ = ((i_1682_ & 0xff00) * i_1677_ & 0xff0000);
									int i_1685_ = (i_1682_ & 0xff) * i_1678_ & 0xff00;
									i_1682_ = (i_1683_ | i_1684_ | i_1685_) >>> 8;
									int i_1686_ = is[i_1582_];
									int i_1687_ = i_1682_ + i_1686_;
									int i_1688_ = ((i_1682_ & 0xff00ff) + (i_1686_ & 0xff00ff));
									i_1686_ = ((i_1688_ & 0x1000100) + (i_1687_ - i_1688_ & 0x10000));
									is[i_1582_++] = (i_1687_ - i_1686_ | i_1686_ - (i_1686_ >>> 8));
								} else
									i_1582_++;
								i_1573_ += i_1578_;
							}
							i_1574_ += i_1579_;
							i_1573_ = i_1675_;
							i_1582_ += i_1583_;
						}
					} else if (i_1569_ == 3) {
						int i_1689_ = i_1573_;
						for (int i_1690_ = -i_1568_; i_1690_ < 0; i_1690_++) {
							int i_1691_ = (i_1574_ >> 16) * anInt8945;
							for (int i_1692_ = -i_1567_; i_1692_ < 0; i_1692_++) {
								int i_1693_ = (anIntArray11347[(i_1573_ >> 16) + i_1691_]);
								int i_1694_ = i_1693_ + i_1570_;
								int i_1695_ = ((i_1693_ & 0xff00ff) + (i_1570_ & 0xff00ff));
								int i_1696_ = ((i_1695_ & 0x1000100) + (i_1694_ - i_1695_ & 0x10000));
								i_1693_ = i_1694_ - i_1696_ | i_1696_ - (i_1696_ >>> 8);
								i_1696_ = is[i_1582_];
								i_1694_ = i_1693_ + i_1696_;
								i_1695_ = (i_1693_ & 0xff00ff) + (i_1696_ & 0xff00ff);
								i_1696_ = ((i_1695_ & 0x1000100) + (i_1694_ - i_1695_ & 0x10000));
								is[i_1582_++] = i_1694_ - i_1696_ | i_1696_ - (i_1696_ >>> 8);
								i_1573_ += i_1578_;
							}
							i_1574_ += i_1579_;
							i_1573_ = i_1689_;
							i_1582_ += i_1583_;
						}
					} else if (i_1569_ == 2) {
						int i_1697_ = i_1570_ >>> 24;
						int i_1698_ = 256 - i_1697_;
						int i_1699_ = (i_1570_ & 0xff00ff) * i_1698_ & ~0xff00ff;
						int i_1700_ = (i_1570_ & 0xff00) * i_1698_ & 0xff0000;
						i_1570_ = (i_1699_ | i_1700_) >>> 8;
						int i_1701_ = i_1573_;
						for (int i_1702_ = -i_1568_; i_1702_ < 0; i_1702_++) {
							int i_1703_ = (i_1574_ >> 16) * anInt8945;
							for (int i_1704_ = -i_1567_; i_1704_ < 0; i_1704_++) {
								int i_1705_ = (anIntArray11347[(i_1573_ >> 16) + i_1703_]);
								if (i_1705_ != 0) {
									i_1699_ = ((i_1705_ & 0xff00ff) * i_1697_ & ~0xff00ff);
									i_1700_ = ((i_1705_ & 0xff00) * i_1697_ & 0xff0000);
									i_1705_ = (((i_1699_ | i_1700_) >>> 8) + i_1570_);
									int i_1706_ = is[i_1582_];
									int i_1707_ = i_1705_ + i_1706_;
									int i_1708_ = ((i_1705_ & 0xff00ff) + (i_1706_ & 0xff00ff));
									i_1706_ = ((i_1708_ & 0x1000100) + (i_1707_ - i_1708_ & 0x10000));
									is[i_1582_++] = (i_1707_ - i_1706_ | i_1706_ - (i_1706_ >>> 8));
								} else
									i_1582_++;
								i_1573_ += i_1578_;
							}
							i_1574_ += i_1579_;
							i_1573_ = i_1701_;
							i_1582_ += i_1583_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method8438(int i, int i_1709_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_1710_ = anInt8957;
					while (i_1710_ < 0) {
						int i_1711_ = anInt8959;
						int i_1712_ = anInt8966;
						int i_1713_ = anInt8967;
						int i_1714_ = anInt8955;
						if (i_1712_ >= 0 && i_1713_ >= 0 && i_1712_ - (anInt8945 << 12) < 0 && i_1713_ - (anInt8950 << 12) < 0) {
							for (/**/; i_1714_ < 0; i_1714_++)
								method10515(((i_1713_ >> 12) * anInt8945 + (i_1712_ >> 12)), i_1711_++, is, i, i_1709_);
						}
						i_1710_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_1715_ = anInt8957;
					while (i_1715_ < 0) {
						int i_1716_ = anInt8959;
						int i_1717_ = anInt8966;
						int i_1718_ = anInt8967 + anInt8969;
						int i_1719_ = anInt8955;
						if (i_1717_ >= 0 && i_1717_ - (anInt8945 << 12) < 0) {
							int i_1720_;
							if ((i_1720_ = i_1718_ - (anInt8950 << 12)) >= 0) {
								i_1720_ = (anInt8962 - i_1720_) / anInt8962;
								i_1719_ += i_1720_;
								i_1718_ += anInt8962 * i_1720_;
								i_1716_ += i_1720_;
							}
							if ((i_1720_ = (i_1718_ - anInt8962) / anInt8962) > i_1719_)
								i_1719_ = i_1720_;
							for (/**/; i_1719_ < 0; i_1719_++) {
								method10515(((i_1718_ >> 12) * anInt8945 + (i_1717_ >> 12)), i_1716_++, is, i, i_1709_);
								i_1718_ += anInt8962;
							}
						}
						i_1715_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_1721_ = anInt8957;
					while (i_1721_ < 0) {
						int i_1722_ = anInt8959;
						int i_1723_ = anInt8966;
						int i_1724_ = anInt8967 + anInt8969;
						int i_1725_ = anInt8955;
						if (i_1723_ >= 0 && i_1723_ - (anInt8945 << 12) < 0) {
							if (i_1724_ < 0) {
								int i_1726_ = (anInt8962 - 1 - i_1724_) / anInt8962;
								i_1725_ += i_1726_;
								i_1724_ += anInt8962 * i_1726_;
								i_1722_ += i_1726_;
							}
							int i_1727_;
							if ((i_1727_ = (1 + i_1724_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_1725_)
								i_1725_ = i_1727_;
							for (/**/; i_1725_ < 0; i_1725_++) {
								method10515(((i_1724_ >> 12) * anInt8945 + (i_1723_ >> 12)), i_1722_++, is, i, i_1709_);
								i_1724_ += anInt8962;
							}
						}
						i_1721_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_1728_ = anInt8957;
					while (i_1728_ < 0) {
						int i_1729_ = anInt8959;
						int i_1730_ = anInt8966 + anInt8968;
						int i_1731_ = anInt8967;
						int i_1732_ = anInt8955;
						if (i_1731_ >= 0 && i_1731_ - (anInt8950 << 12) < 0) {
							int i_1733_;
							if ((i_1733_ = i_1730_ - (anInt8945 << 12)) >= 0) {
								i_1733_ = (anInt8960 - i_1733_) / anInt8960;
								i_1732_ += i_1733_;
								i_1730_ += anInt8960 * i_1733_;
								i_1729_ += i_1733_;
							}
							if ((i_1733_ = (i_1730_ - anInt8960) / anInt8960) > i_1732_)
								i_1732_ = i_1733_;
							for (/**/; i_1732_ < 0; i_1732_++) {
								method10515(((i_1731_ >> 12) * anInt8945 + (i_1730_ >> 12)), i_1729_++, is, i, i_1709_);
								i_1730_ += anInt8960;
							}
						}
						i_1728_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_1734_ = anInt8957;
					while (i_1734_ < 0) {
						int i_1735_ = anInt8959;
						int i_1736_ = anInt8966 + anInt8968;
						int i_1737_ = anInt8967 + anInt8969;
						int i_1738_ = anInt8955;
						int i_1739_;
						if ((i_1739_ = i_1736_ - (anInt8945 << 12)) >= 0) {
							i_1739_ = (anInt8960 - i_1739_) / anInt8960;
							i_1738_ += i_1739_;
							i_1736_ += anInt8960 * i_1739_;
							i_1737_ += anInt8962 * i_1739_;
							i_1735_ += i_1739_;
						}
						if ((i_1739_ = (i_1736_ - anInt8960) / anInt8960) > i_1738_)
							i_1738_ = i_1739_;
						if ((i_1739_ = i_1737_ - (anInt8950 << 12)) >= 0) {
							i_1739_ = (anInt8962 - i_1739_) / anInt8962;
							i_1738_ += i_1739_;
							i_1736_ += anInt8960 * i_1739_;
							i_1737_ += anInt8962 * i_1739_;
							i_1735_ += i_1739_;
						}
						if ((i_1739_ = (i_1737_ - anInt8962) / anInt8962) > i_1738_)
							i_1738_ = i_1739_;
						for (/**/; i_1738_ < 0; i_1738_++) {
							method10515((i_1737_ >> 12) * anInt8945 + (i_1736_ >> 12), i_1735_++, is, i, i_1709_);
							i_1736_ += anInt8960;
							i_1737_ += anInt8962;
						}
						i_1734_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_1740_ = anInt8957;
					while (i_1740_ < 0) {
						int i_1741_ = anInt8959;
						int i_1742_ = anInt8966 + anInt8968;
						int i_1743_ = anInt8967 + anInt8969;
						int i_1744_ = anInt8955;
						int i_1745_;
						if ((i_1745_ = i_1742_ - (anInt8945 << 12)) >= 0) {
							i_1745_ = (anInt8960 - i_1745_) / anInt8960;
							i_1744_ += i_1745_;
							i_1742_ += anInt8960 * i_1745_;
							i_1743_ += anInt8962 * i_1745_;
							i_1741_ += i_1745_;
						}
						if ((i_1745_ = (i_1742_ - anInt8960) / anInt8960) > i_1744_)
							i_1744_ = i_1745_;
						if (i_1743_ < 0) {
							i_1745_ = (anInt8962 - 1 - i_1743_) / anInt8962;
							i_1744_ += i_1745_;
							i_1742_ += anInt8960 * i_1745_;
							i_1743_ += anInt8962 * i_1745_;
							i_1741_ += i_1745_;
						}
						if ((i_1745_ = (1 + i_1743_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_1744_)
							i_1744_ = i_1745_;
						for (/**/; i_1744_ < 0; i_1744_++) {
							method10515((i_1743_ >> 12) * anInt8945 + (i_1742_ >> 12), i_1741_++, is, i, i_1709_);
							i_1742_ += anInt8960;
							i_1743_ += anInt8962;
						}
						i_1740_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_1746_ = anInt8957;
				while (i_1746_ < 0) {
					int i_1747_ = anInt8959;
					int i_1748_ = anInt8966 + anInt8968;
					int i_1749_ = anInt8967;
					int i_1750_ = anInt8955;
					if (i_1749_ >= 0 && i_1749_ - (anInt8950 << 12) < 0) {
						if (i_1748_ < 0) {
							int i_1751_ = (anInt8960 - 1 - i_1748_) / anInt8960;
							i_1750_ += i_1751_;
							i_1748_ += anInt8960 * i_1751_;
							i_1747_ += i_1751_;
						}
						int i_1752_;
						if ((i_1752_ = (1 + i_1748_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_1750_)
							i_1750_ = i_1752_;
						for (/**/; i_1750_ < 0; i_1750_++) {
							method10515((i_1749_ >> 12) * anInt8945 + (i_1748_ >> 12), i_1747_++, is, i, i_1709_);
							i_1748_ += anInt8960;
						}
					}
					i_1746_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				for (int i_1753_ = anInt8957; i_1753_ < 0; i_1753_++) {
					int i_1754_ = anInt8959;
					int i_1755_ = anInt8966 + anInt8968;
					int i_1756_ = anInt8967 + anInt8969;
					int i_1757_ = anInt8955;
					if (i_1755_ < 0) {
						int i_1758_ = (anInt8960 - 1 - i_1755_) / anInt8960;
						i_1757_ += i_1758_;
						i_1755_ += anInt8960 * i_1758_;
						i_1756_ += anInt8962 * i_1758_;
						i_1754_ += i_1758_;
					}
					int i_1759_;
					if ((i_1759_ = (1 + i_1755_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_1757_)
						i_1757_ = i_1759_;
					if ((i_1759_ = i_1756_ - (anInt8950 << 12)) >= 0) {
						i_1759_ = (anInt8962 - i_1759_) / anInt8962;
						i_1757_ += i_1759_;
						i_1755_ += anInt8960 * i_1759_;
						i_1756_ += anInt8962 * i_1759_;
						i_1754_ += i_1759_;
					}
					if ((i_1759_ = (i_1756_ - anInt8962) / anInt8962) > i_1757_)
						i_1757_ = i_1759_;
					for (/**/; i_1757_ < 0; i_1757_++) {
						method10515((i_1756_ >> 12) * anInt8945 + (i_1755_ >> 12), i_1754_++, is, i, i_1709_);
						i_1755_ += anInt8960;
						i_1756_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				for (int i_1760_ = anInt8957; i_1760_ < 0; i_1760_++) {
					int i_1761_ = anInt8959;
					int i_1762_ = anInt8966 + anInt8968;
					int i_1763_ = anInt8967 + anInt8969;
					int i_1764_ = anInt8955;
					if (i_1762_ < 0) {
						int i_1765_ = (anInt8960 - 1 - i_1762_) / anInt8960;
						i_1764_ += i_1765_;
						i_1762_ += anInt8960 * i_1765_;
						i_1763_ += anInt8962 * i_1765_;
						i_1761_ += i_1765_;
					}
					int i_1766_;
					if ((i_1766_ = (1 + i_1762_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_1764_)
						i_1764_ = i_1766_;
					if (i_1763_ < 0) {
						i_1766_ = (anInt8962 - 1 - i_1763_) / anInt8962;
						i_1764_ += i_1766_;
						i_1762_ += anInt8960 * i_1766_;
						i_1763_ += anInt8962 * i_1766_;
						i_1761_ += i_1766_;
					}
					if ((i_1766_ = (1 + i_1763_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_1764_)
						i_1764_ = i_1766_;
					for (/**/; i_1764_ < 0; i_1764_++) {
						method10515((i_1763_ >> 12) * anInt8945 + (i_1762_ >> 12), i_1761_++, is, i, i_1709_);
						i_1762_ += anInt8960;
						i_1763_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	void method8434(int i, int i_1767_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_1768_ = anInt8957;
					while (i_1768_ < 0) {
						int i_1769_ = anInt8959;
						int i_1770_ = anInt8966;
						int i_1771_ = anInt8967;
						int i_1772_ = anInt8955;
						if (i_1770_ >= 0 && i_1771_ >= 0 && i_1770_ - (anInt8945 << 12) < 0 && i_1771_ - (anInt8950 << 12) < 0) {
							for (/**/; i_1772_ < 0; i_1772_++)
								method10515(((i_1771_ >> 12) * anInt8945 + (i_1770_ >> 12)), i_1769_++, is, i, i_1767_);
						}
						i_1768_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_1773_ = anInt8957;
					while (i_1773_ < 0) {
						int i_1774_ = anInt8959;
						int i_1775_ = anInt8966;
						int i_1776_ = anInt8967 + anInt8969;
						int i_1777_ = anInt8955;
						if (i_1775_ >= 0 && i_1775_ - (anInt8945 << 12) < 0) {
							int i_1778_;
							if ((i_1778_ = i_1776_ - (anInt8950 << 12)) >= 0) {
								i_1778_ = (anInt8962 - i_1778_) / anInt8962;
								i_1777_ += i_1778_;
								i_1776_ += anInt8962 * i_1778_;
								i_1774_ += i_1778_;
							}
							if ((i_1778_ = (i_1776_ - anInt8962) / anInt8962) > i_1777_)
								i_1777_ = i_1778_;
							for (/**/; i_1777_ < 0; i_1777_++) {
								method10515(((i_1776_ >> 12) * anInt8945 + (i_1775_ >> 12)), i_1774_++, is, i, i_1767_);
								i_1776_ += anInt8962;
							}
						}
						i_1773_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_1779_ = anInt8957;
					while (i_1779_ < 0) {
						int i_1780_ = anInt8959;
						int i_1781_ = anInt8966;
						int i_1782_ = anInt8967 + anInt8969;
						int i_1783_ = anInt8955;
						if (i_1781_ >= 0 && i_1781_ - (anInt8945 << 12) < 0) {
							if (i_1782_ < 0) {
								int i_1784_ = (anInt8962 - 1 - i_1782_) / anInt8962;
								i_1783_ += i_1784_;
								i_1782_ += anInt8962 * i_1784_;
								i_1780_ += i_1784_;
							}
							int i_1785_;
							if ((i_1785_ = (1 + i_1782_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_1783_)
								i_1783_ = i_1785_;
							for (/**/; i_1783_ < 0; i_1783_++) {
								method10515(((i_1782_ >> 12) * anInt8945 + (i_1781_ >> 12)), i_1780_++, is, i, i_1767_);
								i_1782_ += anInt8962;
							}
						}
						i_1779_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_1786_ = anInt8957;
					while (i_1786_ < 0) {
						int i_1787_ = anInt8959;
						int i_1788_ = anInt8966 + anInt8968;
						int i_1789_ = anInt8967;
						int i_1790_ = anInt8955;
						if (i_1789_ >= 0 && i_1789_ - (anInt8950 << 12) < 0) {
							int i_1791_;
							if ((i_1791_ = i_1788_ - (anInt8945 << 12)) >= 0) {
								i_1791_ = (anInt8960 - i_1791_) / anInt8960;
								i_1790_ += i_1791_;
								i_1788_ += anInt8960 * i_1791_;
								i_1787_ += i_1791_;
							}
							if ((i_1791_ = (i_1788_ - anInt8960) / anInt8960) > i_1790_)
								i_1790_ = i_1791_;
							for (/**/; i_1790_ < 0; i_1790_++) {
								method10515(((i_1789_ >> 12) * anInt8945 + (i_1788_ >> 12)), i_1787_++, is, i, i_1767_);
								i_1788_ += anInt8960;
							}
						}
						i_1786_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_1792_ = anInt8957;
					while (i_1792_ < 0) {
						int i_1793_ = anInt8959;
						int i_1794_ = anInt8966 + anInt8968;
						int i_1795_ = anInt8967 + anInt8969;
						int i_1796_ = anInt8955;
						int i_1797_;
						if ((i_1797_ = i_1794_ - (anInt8945 << 12)) >= 0) {
							i_1797_ = (anInt8960 - i_1797_) / anInt8960;
							i_1796_ += i_1797_;
							i_1794_ += anInt8960 * i_1797_;
							i_1795_ += anInt8962 * i_1797_;
							i_1793_ += i_1797_;
						}
						if ((i_1797_ = (i_1794_ - anInt8960) / anInt8960) > i_1796_)
							i_1796_ = i_1797_;
						if ((i_1797_ = i_1795_ - (anInt8950 << 12)) >= 0) {
							i_1797_ = (anInt8962 - i_1797_) / anInt8962;
							i_1796_ += i_1797_;
							i_1794_ += anInt8960 * i_1797_;
							i_1795_ += anInt8962 * i_1797_;
							i_1793_ += i_1797_;
						}
						if ((i_1797_ = (i_1795_ - anInt8962) / anInt8962) > i_1796_)
							i_1796_ = i_1797_;
						for (/**/; i_1796_ < 0; i_1796_++) {
							method10515((i_1795_ >> 12) * anInt8945 + (i_1794_ >> 12), i_1793_++, is, i, i_1767_);
							i_1794_ += anInt8960;
							i_1795_ += anInt8962;
						}
						i_1792_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_1798_ = anInt8957;
					while (i_1798_ < 0) {
						int i_1799_ = anInt8959;
						int i_1800_ = anInt8966 + anInt8968;
						int i_1801_ = anInt8967 + anInt8969;
						int i_1802_ = anInt8955;
						int i_1803_;
						if ((i_1803_ = i_1800_ - (anInt8945 << 12)) >= 0) {
							i_1803_ = (anInt8960 - i_1803_) / anInt8960;
							i_1802_ += i_1803_;
							i_1800_ += anInt8960 * i_1803_;
							i_1801_ += anInt8962 * i_1803_;
							i_1799_ += i_1803_;
						}
						if ((i_1803_ = (i_1800_ - anInt8960) / anInt8960) > i_1802_)
							i_1802_ = i_1803_;
						if (i_1801_ < 0) {
							i_1803_ = (anInt8962 - 1 - i_1801_) / anInt8962;
							i_1802_ += i_1803_;
							i_1800_ += anInt8960 * i_1803_;
							i_1801_ += anInt8962 * i_1803_;
							i_1799_ += i_1803_;
						}
						if ((i_1803_ = (1 + i_1801_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_1802_)
							i_1802_ = i_1803_;
						for (/**/; i_1802_ < 0; i_1802_++) {
							method10515((i_1801_ >> 12) * anInt8945 + (i_1800_ >> 12), i_1799_++, is, i, i_1767_);
							i_1800_ += anInt8960;
							i_1801_ += anInt8962;
						}
						i_1798_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_1804_ = anInt8957;
				while (i_1804_ < 0) {
					int i_1805_ = anInt8959;
					int i_1806_ = anInt8966 + anInt8968;
					int i_1807_ = anInt8967;
					int i_1808_ = anInt8955;
					if (i_1807_ >= 0 && i_1807_ - (anInt8950 << 12) < 0) {
						if (i_1806_ < 0) {
							int i_1809_ = (anInt8960 - 1 - i_1806_) / anInt8960;
							i_1808_ += i_1809_;
							i_1806_ += anInt8960 * i_1809_;
							i_1805_ += i_1809_;
						}
						int i_1810_;
						if ((i_1810_ = (1 + i_1806_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_1808_)
							i_1808_ = i_1810_;
						for (/**/; i_1808_ < 0; i_1808_++) {
							method10515((i_1807_ >> 12) * anInt8945 + (i_1806_ >> 12), i_1805_++, is, i, i_1767_);
							i_1806_ += anInt8960;
						}
					}
					i_1804_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				for (int i_1811_ = anInt8957; i_1811_ < 0; i_1811_++) {
					int i_1812_ = anInt8959;
					int i_1813_ = anInt8966 + anInt8968;
					int i_1814_ = anInt8967 + anInt8969;
					int i_1815_ = anInt8955;
					if (i_1813_ < 0) {
						int i_1816_ = (anInt8960 - 1 - i_1813_) / anInt8960;
						i_1815_ += i_1816_;
						i_1813_ += anInt8960 * i_1816_;
						i_1814_ += anInt8962 * i_1816_;
						i_1812_ += i_1816_;
					}
					int i_1817_;
					if ((i_1817_ = (1 + i_1813_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_1815_)
						i_1815_ = i_1817_;
					if ((i_1817_ = i_1814_ - (anInt8950 << 12)) >= 0) {
						i_1817_ = (anInt8962 - i_1817_) / anInt8962;
						i_1815_ += i_1817_;
						i_1813_ += anInt8960 * i_1817_;
						i_1814_ += anInt8962 * i_1817_;
						i_1812_ += i_1817_;
					}
					if ((i_1817_ = (i_1814_ - anInt8962) / anInt8962) > i_1815_)
						i_1815_ = i_1817_;
					for (/**/; i_1815_ < 0; i_1815_++) {
						method10515((i_1814_ >> 12) * anInt8945 + (i_1813_ >> 12), i_1812_++, is, i, i_1767_);
						i_1813_ += anInt8960;
						i_1814_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				for (int i_1818_ = anInt8957; i_1818_ < 0; i_1818_++) {
					int i_1819_ = anInt8959;
					int i_1820_ = anInt8966 + anInt8968;
					int i_1821_ = anInt8967 + anInt8969;
					int i_1822_ = anInt8955;
					if (i_1820_ < 0) {
						int i_1823_ = (anInt8960 - 1 - i_1820_) / anInt8960;
						i_1822_ += i_1823_;
						i_1820_ += anInt8960 * i_1823_;
						i_1821_ += anInt8962 * i_1823_;
						i_1819_ += i_1823_;
					}
					int i_1824_;
					if ((i_1824_ = (1 + i_1820_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_1822_)
						i_1822_ = i_1824_;
					if (i_1821_ < 0) {
						i_1824_ = (anInt8962 - 1 - i_1821_) / anInt8962;
						i_1822_ += i_1824_;
						i_1820_ += anInt8960 * i_1824_;
						i_1821_ += anInt8962 * i_1824_;
						i_1819_ += i_1824_;
					}
					if ((i_1824_ = (1 + i_1821_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_1822_)
						i_1822_ = i_1824_;
					for (/**/; i_1822_ < 0; i_1822_++) {
						method10515((i_1821_ >> 12) * anInt8945 + (i_1820_ >> 12), i_1819_++, is, i, i_1767_);
						i_1820_ += anInt8960;
						i_1821_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	void method8435(int[] is, int[] is_1825_, int i, int i_1826_) {
		int[] is_1827_ = aClass167_Sub1_8946.anIntArray8996;
		if (is_1827_ != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_1828_ = anInt8957;
					while (i_1828_ < 0) {
						int i_1829_ = i_1828_ + i_1826_;
						if (i_1829_ >= 0) {
							if (i_1829_ >= is.length)
								break;
							int i_1830_ = anInt8959;
							int i_1831_ = anInt8966;
							int i_1832_ = anInt8967;
							int i_1833_ = anInt8955;
							if (i_1831_ >= 0 && i_1832_ >= 0 && i_1831_ - (anInt8945 << 12) < 0 && i_1832_ - (anInt8950 << 12) < 0) {
								int i_1834_ = is[i_1829_] - i;
								int i_1835_ = -is_1825_[i_1829_];
								int i_1836_ = i_1834_ - (i_1830_ - anInt8959);
								if (i_1836_ > 0) {
									i_1830_ += i_1836_;
									i_1833_ += i_1836_;
									i_1831_ += anInt8960 * i_1836_;
									i_1832_ += anInt8962 * i_1836_;
								} else
									i_1835_ -= i_1836_;
								if (i_1833_ < i_1835_)
									i_1833_ = i_1835_;
								for (/**/; i_1833_ < 0; i_1833_++) {
									int i_1837_ = (anIntArray11347[((i_1832_ >> 12) * anInt8945 + (i_1831_ >> 12))]);
									if (i_1837_ != 0)
										is_1827_[i_1830_++] = i_1837_;
									else
										i_1830_++;
								}
							}
						}
						i_1828_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_1838_ = anInt8957;
					while (i_1838_ < 0) {
						int i_1839_ = i_1838_ + i_1826_;
						if (i_1839_ >= 0) {
							if (i_1839_ >= is.length)
								break;
							int i_1840_ = anInt8959;
							int i_1841_ = anInt8966;
							int i_1842_ = anInt8967 + anInt8969;
							int i_1843_ = anInt8955;
							if (i_1841_ >= 0 && i_1841_ - (anInt8945 << 12) < 0) {
								int i_1844_;
								if ((i_1844_ = i_1842_ - (anInt8950 << 12)) >= 0) {
									i_1844_ = (anInt8962 - i_1844_) / anInt8962;
									i_1843_ += i_1844_;
									i_1842_ += anInt8962 * i_1844_;
									i_1840_ += i_1844_;
								}
								if ((i_1844_ = (i_1842_ - anInt8962) / anInt8962) > i_1843_)
									i_1843_ = i_1844_;
								int i_1845_ = is[i_1839_] - i;
								int i_1846_ = -is_1825_[i_1839_];
								int i_1847_ = i_1845_ - (i_1840_ - anInt8959);
								if (i_1847_ > 0) {
									i_1840_ += i_1847_;
									i_1843_ += i_1847_;
									i_1841_ += anInt8960 * i_1847_;
									i_1842_ += anInt8962 * i_1847_;
								} else
									i_1846_ -= i_1847_;
								if (i_1843_ < i_1846_)
									i_1843_ = i_1846_;
								for (/**/; i_1843_ < 0; i_1843_++) {
									int i_1848_ = (anIntArray11347[((i_1842_ >> 12) * anInt8945 + (i_1841_ >> 12))]);
									if (i_1848_ != 0)
										is_1827_[i_1840_++] = i_1848_;
									else
										i_1840_++;
									i_1842_ += anInt8962;
								}
							}
						}
						i_1838_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_1849_ = anInt8957;
					while (i_1849_ < 0) {
						int i_1850_ = i_1849_ + i_1826_;
						if (i_1850_ >= 0) {
							if (i_1850_ >= is.length)
								break;
							int i_1851_ = anInt8959;
							int i_1852_ = anInt8966;
							int i_1853_ = anInt8967 + anInt8969;
							int i_1854_ = anInt8955;
							if (i_1852_ >= 0 && i_1852_ - (anInt8945 << 12) < 0) {
								if (i_1853_ < 0) {
									int i_1855_ = ((anInt8962 - 1 - i_1853_) / anInt8962);
									i_1854_ += i_1855_;
									i_1853_ += anInt8962 * i_1855_;
									i_1851_ += i_1855_;
								}
								int i_1856_;
								if ((i_1856_ = (1 + i_1853_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_1854_)
									i_1854_ = i_1856_;
								int i_1857_ = is[i_1850_] - i;
								int i_1858_ = -is_1825_[i_1850_];
								int i_1859_ = i_1857_ - (i_1851_ - anInt8959);
								if (i_1859_ > 0) {
									i_1851_ += i_1859_;
									i_1854_ += i_1859_;
									i_1852_ += anInt8960 * i_1859_;
									i_1853_ += anInt8962 * i_1859_;
								} else
									i_1858_ -= i_1859_;
								if (i_1854_ < i_1858_)
									i_1854_ = i_1858_;
								for (/**/; i_1854_ < 0; i_1854_++) {
									int i_1860_ = (anIntArray11347[((i_1853_ >> 12) * anInt8945 + (i_1852_ >> 12))]);
									if (i_1860_ != 0)
										is_1827_[i_1851_++] = i_1860_;
									else
										i_1851_++;
									i_1853_ += anInt8962;
								}
							}
						}
						i_1849_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_1861_ = anInt8957;
					while (i_1861_ < 0) {
						int i_1862_ = i_1861_ + i_1826_;
						if (i_1862_ >= 0) {
							if (i_1862_ >= is.length)
								break;
							int i_1863_ = anInt8959;
							int i_1864_ = anInt8966 + anInt8968;
							int i_1865_ = anInt8967;
							int i_1866_ = anInt8955;
							if (i_1865_ >= 0 && i_1865_ - (anInt8950 << 12) < 0) {
								int i_1867_;
								if ((i_1867_ = i_1864_ - (anInt8945 << 12)) >= 0) {
									i_1867_ = (anInt8960 - i_1867_) / anInt8960;
									i_1866_ += i_1867_;
									i_1864_ += anInt8960 * i_1867_;
									i_1863_ += i_1867_;
								}
								if ((i_1867_ = (i_1864_ - anInt8960) / anInt8960) > i_1866_)
									i_1866_ = i_1867_;
								int i_1868_ = is[i_1862_] - i;
								int i_1869_ = -is_1825_[i_1862_];
								int i_1870_ = i_1868_ - (i_1863_ - anInt8959);
								if (i_1870_ > 0) {
									i_1863_ += i_1870_;
									i_1866_ += i_1870_;
									i_1864_ += anInt8960 * i_1870_;
									i_1865_ += anInt8962 * i_1870_;
								} else
									i_1869_ -= i_1870_;
								if (i_1866_ < i_1869_)
									i_1866_ = i_1869_;
								for (/**/; i_1866_ < 0; i_1866_++) {
									int i_1871_ = (anIntArray11347[((i_1865_ >> 12) * anInt8945 + (i_1864_ >> 12))]);
									if (i_1871_ != 0)
										is_1827_[i_1863_++] = i_1871_;
									else
										i_1863_++;
									i_1864_ += anInt8960;
								}
							}
						}
						i_1861_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_1872_ = anInt8957;
					while (i_1872_ < 0) {
						int i_1873_ = i_1872_ + i_1826_;
						if (i_1873_ >= 0) {
							if (i_1873_ >= is.length)
								break;
							int i_1874_ = anInt8959;
							int i_1875_ = anInt8966 + anInt8968;
							int i_1876_ = anInt8967 + anInt8969;
							int i_1877_ = anInt8955;
							int i_1878_;
							if ((i_1878_ = i_1875_ - (anInt8945 << 12)) >= 0) {
								i_1878_ = (anInt8960 - i_1878_) / anInt8960;
								i_1877_ += i_1878_;
								i_1875_ += anInt8960 * i_1878_;
								i_1876_ += anInt8962 * i_1878_;
								i_1874_ += i_1878_;
							}
							if ((i_1878_ = (i_1875_ - anInt8960) / anInt8960) > i_1877_)
								i_1877_ = i_1878_;
							if ((i_1878_ = i_1876_ - (anInt8950 << 12)) >= 0) {
								i_1878_ = (anInt8962 - i_1878_) / anInt8962;
								i_1877_ += i_1878_;
								i_1875_ += anInt8960 * i_1878_;
								i_1876_ += anInt8962 * i_1878_;
								i_1874_ += i_1878_;
							}
							if ((i_1878_ = (i_1876_ - anInt8962) / anInt8962) > i_1877_)
								i_1877_ = i_1878_;
							int i_1879_ = is[i_1873_] - i;
							int i_1880_ = -is_1825_[i_1873_];
							int i_1881_ = i_1879_ - (i_1874_ - anInt8959);
							if (i_1881_ > 0) {
								i_1874_ += i_1881_;
								i_1877_ += i_1881_;
								i_1875_ += anInt8960 * i_1881_;
								i_1876_ += anInt8962 * i_1881_;
							} else
								i_1880_ -= i_1881_;
							if (i_1877_ < i_1880_)
								i_1877_ = i_1880_;
							for (/**/; i_1877_ < 0; i_1877_++) {
								int i_1882_ = (anIntArray11347[((i_1876_ >> 12) * anInt8945 + (i_1875_ >> 12))]);
								if (i_1882_ != 0)
									is_1827_[i_1874_++] = i_1882_;
								else
									i_1874_++;
								i_1875_ += anInt8960;
								i_1876_ += anInt8962;
							}
						}
						i_1872_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_1883_ = anInt8957;
					while (i_1883_ < 0) {
						int i_1884_ = i_1883_ + i_1826_;
						if (i_1884_ >= 0) {
							if (i_1884_ >= is.length)
								break;
							int i_1885_ = anInt8959;
							int i_1886_ = anInt8966 + anInt8968;
							int i_1887_ = anInt8967 + anInt8969;
							int i_1888_ = anInt8955;
							int i_1889_;
							if ((i_1889_ = i_1886_ - (anInt8945 << 12)) >= 0) {
								i_1889_ = (anInt8960 - i_1889_) / anInt8960;
								i_1888_ += i_1889_;
								i_1886_ += anInt8960 * i_1889_;
								i_1887_ += anInt8962 * i_1889_;
								i_1885_ += i_1889_;
							}
							if ((i_1889_ = (i_1886_ - anInt8960) / anInt8960) > i_1888_)
								i_1888_ = i_1889_;
							if (i_1887_ < 0) {
								i_1889_ = (anInt8962 - 1 - i_1887_) / anInt8962;
								i_1888_ += i_1889_;
								i_1886_ += anInt8960 * i_1889_;
								i_1887_ += anInt8962 * i_1889_;
								i_1885_ += i_1889_;
							}
							if ((i_1889_ = (1 + i_1887_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_1888_)
								i_1888_ = i_1889_;
							int i_1890_ = is[i_1884_] - i;
							int i_1891_ = -is_1825_[i_1884_];
							int i_1892_ = i_1890_ - (i_1885_ - anInt8959);
							if (i_1892_ > 0) {
								i_1885_ += i_1892_;
								i_1888_ += i_1892_;
								i_1886_ += anInt8960 * i_1892_;
								i_1887_ += anInt8962 * i_1892_;
							} else
								i_1891_ -= i_1892_;
							if (i_1888_ < i_1891_)
								i_1888_ = i_1891_;
							for (/**/; i_1888_ < 0; i_1888_++) {
								int i_1893_ = (anIntArray11347[((i_1887_ >> 12) * anInt8945 + (i_1886_ >> 12))]);
								if (i_1893_ != 0)
									is_1827_[i_1885_++] = i_1893_;
								else
									i_1885_++;
								i_1886_ += anInt8960;
								i_1887_ += anInt8962;
							}
						}
						i_1883_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_1894_ = anInt8957;
				while (i_1894_ < 0) {
					int i_1895_ = i_1894_ + i_1826_;
					if (i_1895_ >= 0) {
						if (i_1895_ >= is.length)
							break;
						int i_1896_ = anInt8959;
						int i_1897_ = anInt8966 + anInt8968;
						int i_1898_ = anInt8967;
						int i_1899_ = anInt8955;
						if (i_1898_ >= 0 && i_1898_ - (anInt8950 << 12) < 0) {
							if (i_1897_ < 0) {
								int i_1900_ = (anInt8960 - 1 - i_1897_) / anInt8960;
								i_1899_ += i_1900_;
								i_1897_ += anInt8960 * i_1900_;
								i_1896_ += i_1900_;
							}
							int i_1901_;
							if ((i_1901_ = (1 + i_1897_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_1899_)
								i_1899_ = i_1901_;
							int i_1902_ = is[i_1895_] - i;
							int i_1903_ = -is_1825_[i_1895_];
							int i_1904_ = i_1902_ - (i_1896_ - anInt8959);
							if (i_1904_ > 0) {
								i_1896_ += i_1904_;
								i_1899_ += i_1904_;
								i_1897_ += anInt8960 * i_1904_;
								i_1898_ += anInt8962 * i_1904_;
							} else
								i_1903_ -= i_1904_;
							if (i_1899_ < i_1903_)
								i_1899_ = i_1903_;
							for (/**/; i_1899_ < 0; i_1899_++) {
								int i_1905_ = (anIntArray11347[((i_1898_ >> 12) * anInt8945 + (i_1897_ >> 12))]);
								if (i_1905_ != 0)
									is_1827_[i_1896_++] = i_1905_;
								else
									i_1896_++;
								i_1897_ += anInt8960;
							}
						}
					}
					i_1894_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				int i_1906_ = anInt8957;
				while (i_1906_ < 0) {
					int i_1907_ = i_1906_ + i_1826_;
					if (i_1907_ >= 0) {
						if (i_1907_ >= is.length)
							break;
						int i_1908_ = anInt8959;
						int i_1909_ = anInt8966 + anInt8968;
						int i_1910_ = anInt8967 + anInt8969;
						int i_1911_ = anInt8955;
						if (i_1909_ < 0) {
							int i_1912_ = (anInt8960 - 1 - i_1909_) / anInt8960;
							i_1911_ += i_1912_;
							i_1909_ += anInt8960 * i_1912_;
							i_1910_ += anInt8962 * i_1912_;
							i_1908_ += i_1912_;
						}
						int i_1913_;
						if ((i_1913_ = (1 + i_1909_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_1911_)
							i_1911_ = i_1913_;
						if ((i_1913_ = i_1910_ - (anInt8950 << 12)) >= 0) {
							i_1913_ = (anInt8962 - i_1913_) / anInt8962;
							i_1911_ += i_1913_;
							i_1909_ += anInt8960 * i_1913_;
							i_1910_ += anInt8962 * i_1913_;
							i_1908_ += i_1913_;
						}
						if ((i_1913_ = (i_1910_ - anInt8962) / anInt8962) > i_1911_)
							i_1911_ = i_1913_;
						int i_1914_ = is[i_1907_] - i;
						int i_1915_ = -is_1825_[i_1907_];
						int i_1916_ = i_1914_ - (i_1908_ - anInt8959);
						if (i_1916_ > 0) {
							i_1908_ += i_1916_;
							i_1911_ += i_1916_;
							i_1909_ += anInt8960 * i_1916_;
							i_1910_ += anInt8962 * i_1916_;
						} else
							i_1915_ -= i_1916_;
						if (i_1911_ < i_1915_)
							i_1911_ = i_1915_;
						for (/**/; i_1911_ < 0; i_1911_++) {
							int i_1917_ = (anIntArray11347[(i_1910_ >> 12) * anInt8945 + (i_1909_ >> 12)]);
							if (i_1917_ != 0)
								is_1827_[i_1908_++] = i_1917_;
							else
								i_1908_++;
							i_1909_ += anInt8960;
							i_1910_ += anInt8962;
						}
					}
					i_1906_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				int i_1918_ = anInt8957;
				while (i_1918_ < 0) {
					int i_1919_ = i_1918_ + i_1826_;
					if (i_1919_ >= 0) {
						if (i_1919_ >= is.length)
							break;
						int i_1920_ = anInt8959;
						int i_1921_ = anInt8966 + anInt8968;
						int i_1922_ = anInt8967 + anInt8969;
						int i_1923_ = anInt8955;
						if (i_1921_ < 0) {
							int i_1924_ = (anInt8960 - 1 - i_1921_) / anInt8960;
							i_1923_ += i_1924_;
							i_1921_ += anInt8960 * i_1924_;
							i_1922_ += anInt8962 * i_1924_;
							i_1920_ += i_1924_;
						}
						int i_1925_;
						if ((i_1925_ = (1 + i_1921_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_1923_)
							i_1923_ = i_1925_;
						if (i_1922_ < 0) {
							i_1925_ = (anInt8962 - 1 - i_1922_) / anInt8962;
							i_1923_ += i_1925_;
							i_1921_ += anInt8960 * i_1925_;
							i_1922_ += anInt8962 * i_1925_;
							i_1920_ += i_1925_;
						}
						if ((i_1925_ = (1 + i_1922_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_1923_)
							i_1923_ = i_1925_;
						int i_1926_ = is[i_1919_] - i;
						int i_1927_ = -is_1825_[i_1919_];
						int i_1928_ = i_1926_ - (i_1920_ - anInt8959);
						if (i_1928_ > 0) {
							i_1920_ += i_1928_;
							i_1923_ += i_1928_;
							i_1921_ += anInt8960 * i_1928_;
							i_1922_ += anInt8962 * i_1928_;
						} else
							i_1927_ -= i_1928_;
						if (i_1923_ < i_1927_)
							i_1923_ = i_1927_;
						for (/**/; i_1923_ < 0; i_1923_++) {
							int i_1929_ = (anIntArray11347[(i_1922_ >> 12) * anInt8945 + (i_1921_ >> 12)]);
							if (i_1929_ != 0)
								is_1827_[i_1920_++] = i_1929_;
							else
								i_1920_++;
							i_1921_ += anInt8960;
							i_1922_ += anInt8962;
						}
					}
					i_1918_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	void method8436(int[] is, int[] is_1930_, int i, int i_1931_) {
		int[] is_1932_ = aClass167_Sub1_8946.anIntArray8996;
		if (is_1932_ != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_1933_ = anInt8957;
					while (i_1933_ < 0) {
						int i_1934_ = i_1933_ + i_1931_;
						if (i_1934_ >= 0) {
							if (i_1934_ >= is.length)
								break;
							int i_1935_ = anInt8959;
							int i_1936_ = anInt8966;
							int i_1937_ = anInt8967;
							int i_1938_ = anInt8955;
							if (i_1936_ >= 0 && i_1937_ >= 0 && i_1936_ - (anInt8945 << 12) < 0 && i_1937_ - (anInt8950 << 12) < 0) {
								int i_1939_ = is[i_1934_] - i;
								int i_1940_ = -is_1930_[i_1934_];
								int i_1941_ = i_1939_ - (i_1935_ - anInt8959);
								if (i_1941_ > 0) {
									i_1935_ += i_1941_;
									i_1938_ += i_1941_;
									i_1936_ += anInt8960 * i_1941_;
									i_1937_ += anInt8962 * i_1941_;
								} else
									i_1940_ -= i_1941_;
								if (i_1938_ < i_1940_)
									i_1938_ = i_1940_;
								for (/**/; i_1938_ < 0; i_1938_++) {
									int i_1942_ = (anIntArray11347[((i_1937_ >> 12) * anInt8945 + (i_1936_ >> 12))]);
									if (i_1942_ != 0)
										is_1932_[i_1935_++] = i_1942_;
									else
										i_1935_++;
								}
							}
						}
						i_1933_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_1943_ = anInt8957;
					while (i_1943_ < 0) {
						int i_1944_ = i_1943_ + i_1931_;
						if (i_1944_ >= 0) {
							if (i_1944_ >= is.length)
								break;
							int i_1945_ = anInt8959;
							int i_1946_ = anInt8966;
							int i_1947_ = anInt8967 + anInt8969;
							int i_1948_ = anInt8955;
							if (i_1946_ >= 0 && i_1946_ - (anInt8945 << 12) < 0) {
								int i_1949_;
								if ((i_1949_ = i_1947_ - (anInt8950 << 12)) >= 0) {
									i_1949_ = (anInt8962 - i_1949_) / anInt8962;
									i_1948_ += i_1949_;
									i_1947_ += anInt8962 * i_1949_;
									i_1945_ += i_1949_;
								}
								if ((i_1949_ = (i_1947_ - anInt8962) / anInt8962) > i_1948_)
									i_1948_ = i_1949_;
								int i_1950_ = is[i_1944_] - i;
								int i_1951_ = -is_1930_[i_1944_];
								int i_1952_ = i_1950_ - (i_1945_ - anInt8959);
								if (i_1952_ > 0) {
									i_1945_ += i_1952_;
									i_1948_ += i_1952_;
									i_1946_ += anInt8960 * i_1952_;
									i_1947_ += anInt8962 * i_1952_;
								} else
									i_1951_ -= i_1952_;
								if (i_1948_ < i_1951_)
									i_1948_ = i_1951_;
								for (/**/; i_1948_ < 0; i_1948_++) {
									int i_1953_ = (anIntArray11347[((i_1947_ >> 12) * anInt8945 + (i_1946_ >> 12))]);
									if (i_1953_ != 0)
										is_1932_[i_1945_++] = i_1953_;
									else
										i_1945_++;
									i_1947_ += anInt8962;
								}
							}
						}
						i_1943_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_1954_ = anInt8957;
					while (i_1954_ < 0) {
						int i_1955_ = i_1954_ + i_1931_;
						if (i_1955_ >= 0) {
							if (i_1955_ >= is.length)
								break;
							int i_1956_ = anInt8959;
							int i_1957_ = anInt8966;
							int i_1958_ = anInt8967 + anInt8969;
							int i_1959_ = anInt8955;
							if (i_1957_ >= 0 && i_1957_ - (anInt8945 << 12) < 0) {
								if (i_1958_ < 0) {
									int i_1960_ = ((anInt8962 - 1 - i_1958_) / anInt8962);
									i_1959_ += i_1960_;
									i_1958_ += anInt8962 * i_1960_;
									i_1956_ += i_1960_;
								}
								int i_1961_;
								if ((i_1961_ = (1 + i_1958_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_1959_)
									i_1959_ = i_1961_;
								int i_1962_ = is[i_1955_] - i;
								int i_1963_ = -is_1930_[i_1955_];
								int i_1964_ = i_1962_ - (i_1956_ - anInt8959);
								if (i_1964_ > 0) {
									i_1956_ += i_1964_;
									i_1959_ += i_1964_;
									i_1957_ += anInt8960 * i_1964_;
									i_1958_ += anInt8962 * i_1964_;
								} else
									i_1963_ -= i_1964_;
								if (i_1959_ < i_1963_)
									i_1959_ = i_1963_;
								for (/**/; i_1959_ < 0; i_1959_++) {
									int i_1965_ = (anIntArray11347[((i_1958_ >> 12) * anInt8945 + (i_1957_ >> 12))]);
									if (i_1965_ != 0)
										is_1932_[i_1956_++] = i_1965_;
									else
										i_1956_++;
									i_1958_ += anInt8962;
								}
							}
						}
						i_1954_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_1966_ = anInt8957;
					while (i_1966_ < 0) {
						int i_1967_ = i_1966_ + i_1931_;
						if (i_1967_ >= 0) {
							if (i_1967_ >= is.length)
								break;
							int i_1968_ = anInt8959;
							int i_1969_ = anInt8966 + anInt8968;
							int i_1970_ = anInt8967;
							int i_1971_ = anInt8955;
							if (i_1970_ >= 0 && i_1970_ - (anInt8950 << 12) < 0) {
								int i_1972_;
								if ((i_1972_ = i_1969_ - (anInt8945 << 12)) >= 0) {
									i_1972_ = (anInt8960 - i_1972_) / anInt8960;
									i_1971_ += i_1972_;
									i_1969_ += anInt8960 * i_1972_;
									i_1968_ += i_1972_;
								}
								if ((i_1972_ = (i_1969_ - anInt8960) / anInt8960) > i_1971_)
									i_1971_ = i_1972_;
								int i_1973_ = is[i_1967_] - i;
								int i_1974_ = -is_1930_[i_1967_];
								int i_1975_ = i_1973_ - (i_1968_ - anInt8959);
								if (i_1975_ > 0) {
									i_1968_ += i_1975_;
									i_1971_ += i_1975_;
									i_1969_ += anInt8960 * i_1975_;
									i_1970_ += anInt8962 * i_1975_;
								} else
									i_1974_ -= i_1975_;
								if (i_1971_ < i_1974_)
									i_1971_ = i_1974_;
								for (/**/; i_1971_ < 0; i_1971_++) {
									int i_1976_ = (anIntArray11347[((i_1970_ >> 12) * anInt8945 + (i_1969_ >> 12))]);
									if (i_1976_ != 0)
										is_1932_[i_1968_++] = i_1976_;
									else
										i_1968_++;
									i_1969_ += anInt8960;
								}
							}
						}
						i_1966_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_1977_ = anInt8957;
					while (i_1977_ < 0) {
						int i_1978_ = i_1977_ + i_1931_;
						if (i_1978_ >= 0) {
							if (i_1978_ >= is.length)
								break;
							int i_1979_ = anInt8959;
							int i_1980_ = anInt8966 + anInt8968;
							int i_1981_ = anInt8967 + anInt8969;
							int i_1982_ = anInt8955;
							int i_1983_;
							if ((i_1983_ = i_1980_ - (anInt8945 << 12)) >= 0) {
								i_1983_ = (anInt8960 - i_1983_) / anInt8960;
								i_1982_ += i_1983_;
								i_1980_ += anInt8960 * i_1983_;
								i_1981_ += anInt8962 * i_1983_;
								i_1979_ += i_1983_;
							}
							if ((i_1983_ = (i_1980_ - anInt8960) / anInt8960) > i_1982_)
								i_1982_ = i_1983_;
							if ((i_1983_ = i_1981_ - (anInt8950 << 12)) >= 0) {
								i_1983_ = (anInt8962 - i_1983_) / anInt8962;
								i_1982_ += i_1983_;
								i_1980_ += anInt8960 * i_1983_;
								i_1981_ += anInt8962 * i_1983_;
								i_1979_ += i_1983_;
							}
							if ((i_1983_ = (i_1981_ - anInt8962) / anInt8962) > i_1982_)
								i_1982_ = i_1983_;
							int i_1984_ = is[i_1978_] - i;
							int i_1985_ = -is_1930_[i_1978_];
							int i_1986_ = i_1984_ - (i_1979_ - anInt8959);
							if (i_1986_ > 0) {
								i_1979_ += i_1986_;
								i_1982_ += i_1986_;
								i_1980_ += anInt8960 * i_1986_;
								i_1981_ += anInt8962 * i_1986_;
							} else
								i_1985_ -= i_1986_;
							if (i_1982_ < i_1985_)
								i_1982_ = i_1985_;
							for (/**/; i_1982_ < 0; i_1982_++) {
								int i_1987_ = (anIntArray11347[((i_1981_ >> 12) * anInt8945 + (i_1980_ >> 12))]);
								if (i_1987_ != 0)
									is_1932_[i_1979_++] = i_1987_;
								else
									i_1979_++;
								i_1980_ += anInt8960;
								i_1981_ += anInt8962;
							}
						}
						i_1977_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_1988_ = anInt8957;
					while (i_1988_ < 0) {
						int i_1989_ = i_1988_ + i_1931_;
						if (i_1989_ >= 0) {
							if (i_1989_ >= is.length)
								break;
							int i_1990_ = anInt8959;
							int i_1991_ = anInt8966 + anInt8968;
							int i_1992_ = anInt8967 + anInt8969;
							int i_1993_ = anInt8955;
							int i_1994_;
							if ((i_1994_ = i_1991_ - (anInt8945 << 12)) >= 0) {
								i_1994_ = (anInt8960 - i_1994_) / anInt8960;
								i_1993_ += i_1994_;
								i_1991_ += anInt8960 * i_1994_;
								i_1992_ += anInt8962 * i_1994_;
								i_1990_ += i_1994_;
							}
							if ((i_1994_ = (i_1991_ - anInt8960) / anInt8960) > i_1993_)
								i_1993_ = i_1994_;
							if (i_1992_ < 0) {
								i_1994_ = (anInt8962 - 1 - i_1992_) / anInt8962;
								i_1993_ += i_1994_;
								i_1991_ += anInt8960 * i_1994_;
								i_1992_ += anInt8962 * i_1994_;
								i_1990_ += i_1994_;
							}
							if ((i_1994_ = (1 + i_1992_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_1993_)
								i_1993_ = i_1994_;
							int i_1995_ = is[i_1989_] - i;
							int i_1996_ = -is_1930_[i_1989_];
							int i_1997_ = i_1995_ - (i_1990_ - anInt8959);
							if (i_1997_ > 0) {
								i_1990_ += i_1997_;
								i_1993_ += i_1997_;
								i_1991_ += anInt8960 * i_1997_;
								i_1992_ += anInt8962 * i_1997_;
							} else
								i_1996_ -= i_1997_;
							if (i_1993_ < i_1996_)
								i_1993_ = i_1996_;
							for (/**/; i_1993_ < 0; i_1993_++) {
								int i_1998_ = (anIntArray11347[((i_1992_ >> 12) * anInt8945 + (i_1991_ >> 12))]);
								if (i_1998_ != 0)
									is_1932_[i_1990_++] = i_1998_;
								else
									i_1990_++;
								i_1991_ += anInt8960;
								i_1992_ += anInt8962;
							}
						}
						i_1988_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_1999_ = anInt8957;
				while (i_1999_ < 0) {
					int i_2000_ = i_1999_ + i_1931_;
					if (i_2000_ >= 0) {
						if (i_2000_ >= is.length)
							break;
						int i_2001_ = anInt8959;
						int i_2002_ = anInt8966 + anInt8968;
						int i_2003_ = anInt8967;
						int i_2004_ = anInt8955;
						if (i_2003_ >= 0 && i_2003_ - (anInt8950 << 12) < 0) {
							if (i_2002_ < 0) {
								int i_2005_ = (anInt8960 - 1 - i_2002_) / anInt8960;
								i_2004_ += i_2005_;
								i_2002_ += anInt8960 * i_2005_;
								i_2001_ += i_2005_;
							}
							int i_2006_;
							if ((i_2006_ = (1 + i_2002_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_2004_)
								i_2004_ = i_2006_;
							int i_2007_ = is[i_2000_] - i;
							int i_2008_ = -is_1930_[i_2000_];
							int i_2009_ = i_2007_ - (i_2001_ - anInt8959);
							if (i_2009_ > 0) {
								i_2001_ += i_2009_;
								i_2004_ += i_2009_;
								i_2002_ += anInt8960 * i_2009_;
								i_2003_ += anInt8962 * i_2009_;
							} else
								i_2008_ -= i_2009_;
							if (i_2004_ < i_2008_)
								i_2004_ = i_2008_;
							for (/**/; i_2004_ < 0; i_2004_++) {
								int i_2010_ = (anIntArray11347[((i_2003_ >> 12) * anInt8945 + (i_2002_ >> 12))]);
								if (i_2010_ != 0)
									is_1932_[i_2001_++] = i_2010_;
								else
									i_2001_++;
								i_2002_ += anInt8960;
							}
						}
					}
					i_1999_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				int i_2011_ = anInt8957;
				while (i_2011_ < 0) {
					int i_2012_ = i_2011_ + i_1931_;
					if (i_2012_ >= 0) {
						if (i_2012_ >= is.length)
							break;
						int i_2013_ = anInt8959;
						int i_2014_ = anInt8966 + anInt8968;
						int i_2015_ = anInt8967 + anInt8969;
						int i_2016_ = anInt8955;
						if (i_2014_ < 0) {
							int i_2017_ = (anInt8960 - 1 - i_2014_) / anInt8960;
							i_2016_ += i_2017_;
							i_2014_ += anInt8960 * i_2017_;
							i_2015_ += anInt8962 * i_2017_;
							i_2013_ += i_2017_;
						}
						int i_2018_;
						if ((i_2018_ = (1 + i_2014_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_2016_)
							i_2016_ = i_2018_;
						if ((i_2018_ = i_2015_ - (anInt8950 << 12)) >= 0) {
							i_2018_ = (anInt8962 - i_2018_) / anInt8962;
							i_2016_ += i_2018_;
							i_2014_ += anInt8960 * i_2018_;
							i_2015_ += anInt8962 * i_2018_;
							i_2013_ += i_2018_;
						}
						if ((i_2018_ = (i_2015_ - anInt8962) / anInt8962) > i_2016_)
							i_2016_ = i_2018_;
						int i_2019_ = is[i_2012_] - i;
						int i_2020_ = -is_1930_[i_2012_];
						int i_2021_ = i_2019_ - (i_2013_ - anInt8959);
						if (i_2021_ > 0) {
							i_2013_ += i_2021_;
							i_2016_ += i_2021_;
							i_2014_ += anInt8960 * i_2021_;
							i_2015_ += anInt8962 * i_2021_;
						} else
							i_2020_ -= i_2021_;
						if (i_2016_ < i_2020_)
							i_2016_ = i_2020_;
						for (/**/; i_2016_ < 0; i_2016_++) {
							int i_2022_ = (anIntArray11347[(i_2015_ >> 12) * anInt8945 + (i_2014_ >> 12)]);
							if (i_2022_ != 0)
								is_1932_[i_2013_++] = i_2022_;
							else
								i_2013_++;
							i_2014_ += anInt8960;
							i_2015_ += anInt8962;
						}
					}
					i_2011_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				int i_2023_ = anInt8957;
				while (i_2023_ < 0) {
					int i_2024_ = i_2023_ + i_1931_;
					if (i_2024_ >= 0) {
						if (i_2024_ >= is.length)
							break;
						int i_2025_ = anInt8959;
						int i_2026_ = anInt8966 + anInt8968;
						int i_2027_ = anInt8967 + anInt8969;
						int i_2028_ = anInt8955;
						if (i_2026_ < 0) {
							int i_2029_ = (anInt8960 - 1 - i_2026_) / anInt8960;
							i_2028_ += i_2029_;
							i_2026_ += anInt8960 * i_2029_;
							i_2027_ += anInt8962 * i_2029_;
							i_2025_ += i_2029_;
						}
						int i_2030_;
						if ((i_2030_ = (1 + i_2026_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_2028_)
							i_2028_ = i_2030_;
						if (i_2027_ < 0) {
							i_2030_ = (anInt8962 - 1 - i_2027_) / anInt8962;
							i_2028_ += i_2030_;
							i_2026_ += anInt8960 * i_2030_;
							i_2027_ += anInt8962 * i_2030_;
							i_2025_ += i_2030_;
						}
						if ((i_2030_ = (1 + i_2027_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_2028_)
							i_2028_ = i_2030_;
						int i_2031_ = is[i_2024_] - i;
						int i_2032_ = -is_1930_[i_2024_];
						int i_2033_ = i_2031_ - (i_2025_ - anInt8959);
						if (i_2033_ > 0) {
							i_2025_ += i_2033_;
							i_2028_ += i_2033_;
							i_2026_ += anInt8960 * i_2033_;
							i_2027_ += anInt8962 * i_2033_;
						} else
							i_2032_ -= i_2033_;
						if (i_2028_ < i_2032_)
							i_2028_ = i_2032_;
						for (/**/; i_2028_ < 0; i_2028_++) {
							int i_2034_ = (anIntArray11347[(i_2027_ >> 12) * anInt8945 + (i_2026_ >> 12)]);
							if (i_2034_ != 0)
								is_1932_[i_2025_++] = i_2034_;
							else
								i_2025_++;
							i_2026_ += anInt8960;
							i_2027_ += anInt8962;
						}
					}
					i_2023_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	public void method1788(int i, int i_2035_, Class161 class161, int i_2036_, int i_2037_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			i += anInt8977;
			i_2035_ += anInt8947;
			int i_2038_ = 0;
			int i_2039_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			int i_2040_ = anInt8945;
			int i_2041_ = anInt8950;
			int i_2042_ = i_2039_ - i_2040_;
			int i_2043_ = 0;
			int i_2044_ = i + i_2035_ * i_2039_;
			if (i_2035_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_2045_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_2035_;
				i_2041_ -= i_2045_;
				i_2035_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_2038_ += i_2045_ * i_2040_;
				i_2044_ += i_2045_ * i_2039_;
			}
			if (i_2035_ + i_2041_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_2041_ -= (i_2035_ + i_2041_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_2046_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_2040_ -= i_2046_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_2038_ += i_2046_;
				i_2044_ += i_2046_;
				i_2043_ += i_2046_;
				i_2042_ += i_2046_;
			}
			if (i + i_2040_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_2047_ = i + i_2040_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_2040_ -= i_2047_;
				i_2043_ += i_2047_;
				i_2042_ += i_2047_;
			}
			if (i_2040_ > 0 && i_2041_ > 0) {
				Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
				int[] is_2048_ = class161_sub2.anIntArray9444;
				int[] is_2049_ = class161_sub2.anIntArray9445;
				int i_2050_ = i_2035_;
				if (i_2037_ > i_2050_) {
					i_2050_ = i_2037_;
					i_2044_ += (i_2037_ - i_2035_) * i_2039_;
					i_2038_ += (i_2037_ - i_2035_) * anInt8945;
				}
				int i_2051_ = (i_2037_ + is_2048_.length < i_2035_ + i_2041_ ? i_2037_ + is_2048_.length : i_2035_ + i_2041_);
				for (int i_2052_ = i_2050_; i_2052_ < i_2051_; i_2052_++) {
					int i_2053_ = is_2048_[i_2052_ - i_2037_] + i_2036_;
					int i_2054_ = is_2049_[i_2052_ - i_2037_];
					int i_2055_ = i_2040_;
					if (i > i_2053_) {
						int i_2056_ = i - i_2053_;
						if (i_2056_ >= i_2054_) {
							i_2038_ += i_2040_ + i_2043_;
							i_2044_ += i_2040_ + i_2042_;
							continue;
						}
						i_2054_ -= i_2056_;
					} else {
						int i_2057_ = i_2053_ - i;
						if (i_2057_ >= i_2040_) {
							i_2038_ += i_2040_ + i_2043_;
							i_2044_ += i_2040_ + i_2042_;
							continue;
						}
						i_2038_ += i_2057_;
						i_2055_ -= i_2057_;
						i_2044_ += i_2057_;
					}
					int i_2058_ = 0;
					if (i_2055_ < i_2054_)
						i_2054_ = i_2055_;
					else
						i_2058_ = i_2055_ - i_2054_;
					for (int i_2059_ = -i_2054_; i_2059_ < 0; i_2059_++) {
						int i_2060_ = anIntArray11347[i_2038_++];
						if (i_2060_ != 0)
							is[i_2044_++] = i_2060_;
						else
							i_2044_++;
					}
					i_2038_ += i_2058_ + i_2043_;
					i_2044_ += i_2058_ + i_2042_;
				}
			}
		}
	}

	public void method1760(int i, int i_2061_, Class161 class161, int i_2062_, int i_2063_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			i += anInt8977;
			i_2061_ += anInt8947;
			int i_2064_ = 0;
			int i_2065_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			int i_2066_ = anInt8945;
			int i_2067_ = anInt8950;
			int i_2068_ = i_2065_ - i_2066_;
			int i_2069_ = 0;
			int i_2070_ = i + i_2061_ * i_2065_;
			if (i_2061_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_2071_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_2061_;
				i_2067_ -= i_2071_;
				i_2061_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_2064_ += i_2071_ * i_2066_;
				i_2070_ += i_2071_ * i_2065_;
			}
			if (i_2061_ + i_2067_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_2067_ -= (i_2061_ + i_2067_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_2072_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_2066_ -= i_2072_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_2064_ += i_2072_;
				i_2070_ += i_2072_;
				i_2069_ += i_2072_;
				i_2068_ += i_2072_;
			}
			if (i + i_2066_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_2073_ = i + i_2066_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_2066_ -= i_2073_;
				i_2069_ += i_2073_;
				i_2068_ += i_2073_;
			}
			if (i_2066_ > 0 && i_2067_ > 0) {
				Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
				int[] is_2074_ = class161_sub2.anIntArray9444;
				int[] is_2075_ = class161_sub2.anIntArray9445;
				int i_2076_ = i_2061_;
				if (i_2063_ > i_2076_) {
					i_2076_ = i_2063_;
					i_2070_ += (i_2063_ - i_2061_) * i_2065_;
					i_2064_ += (i_2063_ - i_2061_) * anInt8945;
				}
				int i_2077_ = (i_2063_ + is_2074_.length < i_2061_ + i_2067_ ? i_2063_ + is_2074_.length : i_2061_ + i_2067_);
				for (int i_2078_ = i_2076_; i_2078_ < i_2077_; i_2078_++) {
					int i_2079_ = is_2074_[i_2078_ - i_2063_] + i_2062_;
					int i_2080_ = is_2075_[i_2078_ - i_2063_];
					int i_2081_ = i_2066_;
					if (i > i_2079_) {
						int i_2082_ = i - i_2079_;
						if (i_2082_ >= i_2080_) {
							i_2064_ += i_2066_ + i_2069_;
							i_2070_ += i_2066_ + i_2068_;
							continue;
						}
						i_2080_ -= i_2082_;
					} else {
						int i_2083_ = i_2079_ - i;
						if (i_2083_ >= i_2066_) {
							i_2064_ += i_2066_ + i_2069_;
							i_2070_ += i_2066_ + i_2068_;
							continue;
						}
						i_2064_ += i_2083_;
						i_2081_ -= i_2083_;
						i_2070_ += i_2083_;
					}
					int i_2084_ = 0;
					if (i_2081_ < i_2080_)
						i_2080_ = i_2081_;
					else
						i_2084_ = i_2081_ - i_2080_;
					for (int i_2085_ = -i_2080_; i_2085_ < 0; i_2085_++) {
						int i_2086_ = anIntArray11347[i_2064_++];
						if (i_2086_ != 0)
							is[i_2070_++] = i_2086_;
						else
							i_2070_++;
					}
					i_2064_ += i_2084_ + i_2069_;
					i_2070_ += i_2084_ + i_2068_;
				}
			}
		}
	}

	public void method1737(int i, int i_2087_, Class161 class161, int i_2088_, int i_2089_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			i += anInt8977;
			i_2087_ += anInt8947;
			int i_2090_ = 0;
			int i_2091_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			int i_2092_ = anInt8945;
			int i_2093_ = anInt8950;
			int i_2094_ = i_2091_ - i_2092_;
			int i_2095_ = 0;
			int i_2096_ = i + i_2087_ * i_2091_;
			if (i_2087_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_2097_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_2087_;
				i_2093_ -= i_2097_;
				i_2087_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_2090_ += i_2097_ * i_2092_;
				i_2096_ += i_2097_ * i_2091_;
			}
			if (i_2087_ + i_2093_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_2093_ -= (i_2087_ + i_2093_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_2098_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_2092_ -= i_2098_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_2090_ += i_2098_;
				i_2096_ += i_2098_;
				i_2095_ += i_2098_;
				i_2094_ += i_2098_;
			}
			if (i + i_2092_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_2099_ = i + i_2092_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_2092_ -= i_2099_;
				i_2095_ += i_2099_;
				i_2094_ += i_2099_;
			}
			if (i_2092_ > 0 && i_2093_ > 0) {
				Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
				int[] is_2100_ = class161_sub2.anIntArray9444;
				int[] is_2101_ = class161_sub2.anIntArray9445;
				int i_2102_ = i_2087_;
				if (i_2089_ > i_2102_) {
					i_2102_ = i_2089_;
					i_2096_ += (i_2089_ - i_2087_) * i_2091_;
					i_2090_ += (i_2089_ - i_2087_) * anInt8945;
				}
				int i_2103_ = (i_2089_ + is_2100_.length < i_2087_ + i_2093_ ? i_2089_ + is_2100_.length : i_2087_ + i_2093_);
				for (int i_2104_ = i_2102_; i_2104_ < i_2103_; i_2104_++) {
					int i_2105_ = is_2100_[i_2104_ - i_2089_] + i_2088_;
					int i_2106_ = is_2101_[i_2104_ - i_2089_];
					int i_2107_ = i_2092_;
					if (i > i_2105_) {
						int i_2108_ = i - i_2105_;
						if (i_2108_ >= i_2106_) {
							i_2090_ += i_2092_ + i_2095_;
							i_2096_ += i_2092_ + i_2094_;
							continue;
						}
						i_2106_ -= i_2108_;
					} else {
						int i_2109_ = i_2105_ - i;
						if (i_2109_ >= i_2092_) {
							i_2090_ += i_2092_ + i_2095_;
							i_2096_ += i_2092_ + i_2094_;
							continue;
						}
						i_2090_ += i_2109_;
						i_2107_ -= i_2109_;
						i_2096_ += i_2109_;
					}
					int i_2110_ = 0;
					if (i_2107_ < i_2106_)
						i_2106_ = i_2107_;
					else
						i_2110_ = i_2107_ - i_2106_;
					for (int i_2111_ = -i_2106_; i_2111_ < 0; i_2111_++) {
						int i_2112_ = anIntArray11347[i_2090_++];
						if (i_2112_ != 0)
							is[i_2096_++] = i_2112_;
						else
							i_2096_++;
					}
					i_2090_ += i_2110_ + i_2095_;
					i_2096_ += i_2110_ + i_2094_;
				}
			}
		}
	}

	public void method1754(int i, int i_2113_, Class161 class161, int i_2114_, int i_2115_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			i += anInt8977;
			i_2113_ += anInt8947;
			int i_2116_ = 0;
			int i_2117_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			int i_2118_ = anInt8945;
			int i_2119_ = anInt8950;
			int i_2120_ = i_2117_ - i_2118_;
			int i_2121_ = 0;
			int i_2122_ = i + i_2113_ * i_2117_;
			if (i_2113_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_2123_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_2113_;
				i_2119_ -= i_2123_;
				i_2113_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_2116_ += i_2123_ * i_2118_;
				i_2122_ += i_2123_ * i_2117_;
			}
			if (i_2113_ + i_2119_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_2119_ -= (i_2113_ + i_2119_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_2124_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_2118_ -= i_2124_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_2116_ += i_2124_;
				i_2122_ += i_2124_;
				i_2121_ += i_2124_;
				i_2120_ += i_2124_;
			}
			if (i + i_2118_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_2125_ = i + i_2118_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_2118_ -= i_2125_;
				i_2121_ += i_2125_;
				i_2120_ += i_2125_;
			}
			if (i_2118_ > 0 && i_2119_ > 0) {
				Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
				int[] is_2126_ = class161_sub2.anIntArray9444;
				int[] is_2127_ = class161_sub2.anIntArray9445;
				int i_2128_ = i_2113_;
				if (i_2115_ > i_2128_) {
					i_2128_ = i_2115_;
					i_2122_ += (i_2115_ - i_2113_) * i_2117_;
					i_2116_ += (i_2115_ - i_2113_) * anInt8945;
				}
				int i_2129_ = (i_2115_ + is_2126_.length < i_2113_ + i_2119_ ? i_2115_ + is_2126_.length : i_2113_ + i_2119_);
				for (int i_2130_ = i_2128_; i_2130_ < i_2129_; i_2130_++) {
					int i_2131_ = is_2126_[i_2130_ - i_2115_] + i_2114_;
					int i_2132_ = is_2127_[i_2130_ - i_2115_];
					int i_2133_ = i_2118_;
					if (i > i_2131_) {
						int i_2134_ = i - i_2131_;
						if (i_2134_ >= i_2132_) {
							i_2116_ += i_2118_ + i_2121_;
							i_2122_ += i_2118_ + i_2120_;
							continue;
						}
						i_2132_ -= i_2134_;
					} else {
						int i_2135_ = i_2131_ - i;
						if (i_2135_ >= i_2118_) {
							i_2116_ += i_2118_ + i_2121_;
							i_2122_ += i_2118_ + i_2120_;
							continue;
						}
						i_2116_ += i_2135_;
						i_2133_ -= i_2135_;
						i_2122_ += i_2135_;
					}
					int i_2136_ = 0;
					if (i_2133_ < i_2132_)
						i_2132_ = i_2133_;
					else
						i_2136_ = i_2133_ - i_2132_;
					for (int i_2137_ = -i_2132_; i_2137_ < 0; i_2137_++) {
						int i_2138_ = anIntArray11347[i_2116_++];
						if (i_2138_ != 0)
							is[i_2122_++] = i_2138_;
						else
							i_2122_++;
					}
					i_2116_ += i_2136_ + i_2121_;
					i_2122_ += i_2136_ + i_2120_;
				}
			}
		}
	}

	public void method1762(int i, int i_2139_, Class161 class161, int i_2140_, int i_2141_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			i += anInt8977;
			i_2139_ += anInt8947;
			int i_2142_ = 0;
			int i_2143_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			int i_2144_ = anInt8945;
			int i_2145_ = anInt8950;
			int i_2146_ = i_2143_ - i_2144_;
			int i_2147_ = 0;
			int i_2148_ = i + i_2139_ * i_2143_;
			if (i_2139_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_2149_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_2139_;
				i_2145_ -= i_2149_;
				i_2139_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_2142_ += i_2149_ * i_2144_;
				i_2148_ += i_2149_ * i_2143_;
			}
			if (i_2139_ + i_2145_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_2145_ -= (i_2139_ + i_2145_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_2150_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_2144_ -= i_2150_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_2142_ += i_2150_;
				i_2148_ += i_2150_;
				i_2147_ += i_2150_;
				i_2146_ += i_2150_;
			}
			if (i + i_2144_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_2151_ = i + i_2144_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_2144_ -= i_2151_;
				i_2147_ += i_2151_;
				i_2146_ += i_2151_;
			}
			if (i_2144_ > 0 && i_2145_ > 0) {
				Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
				int[] is_2152_ = class161_sub2.anIntArray9444;
				int[] is_2153_ = class161_sub2.anIntArray9445;
				int i_2154_ = i_2139_;
				if (i_2141_ > i_2154_) {
					i_2154_ = i_2141_;
					i_2148_ += (i_2141_ - i_2139_) * i_2143_;
					i_2142_ += (i_2141_ - i_2139_) * anInt8945;
				}
				int i_2155_ = (i_2141_ + is_2152_.length < i_2139_ + i_2145_ ? i_2141_ + is_2152_.length : i_2139_ + i_2145_);
				for (int i_2156_ = i_2154_; i_2156_ < i_2155_; i_2156_++) {
					int i_2157_ = is_2152_[i_2156_ - i_2141_] + i_2140_;
					int i_2158_ = is_2153_[i_2156_ - i_2141_];
					int i_2159_ = i_2144_;
					if (i > i_2157_) {
						int i_2160_ = i - i_2157_;
						if (i_2160_ >= i_2158_) {
							i_2142_ += i_2144_ + i_2147_;
							i_2148_ += i_2144_ + i_2146_;
							continue;
						}
						i_2158_ -= i_2160_;
					} else {
						int i_2161_ = i_2157_ - i;
						if (i_2161_ >= i_2144_) {
							i_2142_ += i_2144_ + i_2147_;
							i_2148_ += i_2144_ + i_2146_;
							continue;
						}
						i_2142_ += i_2161_;
						i_2159_ -= i_2161_;
						i_2148_ += i_2161_;
					}
					int i_2162_ = 0;
					if (i_2159_ < i_2158_)
						i_2158_ = i_2159_;
					else
						i_2162_ = i_2159_ - i_2158_;
					for (int i_2163_ = -i_2158_; i_2163_ < 0; i_2163_++) {
						int i_2164_ = anIntArray11347[i_2142_++];
						if (i_2164_ != 0)
							is[i_2148_++] = i_2164_;
						else
							i_2148_++;
					}
					i_2142_ += i_2162_ + i_2147_;
					i_2148_ += i_2162_ + i_2146_;
				}
			}
		}
	}

	void method10515(int i, int i_2165_, int[] is, int i_2166_, int i_2167_) {
		if (i_2167_ == 0) {
			if (i_2166_ == 1)
				is[i_2165_] = anIntArray11347[i];
			else if (i_2166_ == 0) {
				int i_2168_ = anIntArray11347[i++];
				int i_2169_ = (i_2168_ & 0xff0000) * anInt8973 & ~0xffffff;
				int i_2170_ = (i_2168_ & 0xff00) * anInt8974 & 0xff0000;
				int i_2171_ = (i_2168_ & 0xff) * anInt8975 & 0xff00;
				is[i_2165_] = (i_2169_ | i_2170_ | i_2171_) >>> 8;
			} else if (i_2166_ == 3) {
				int i_2172_ = anIntArray11347[i++];
				int i_2173_ = anInt8944;
				int i_2174_ = i_2172_ + i_2173_;
				int i_2175_ = (i_2172_ & 0xff00ff) + (i_2173_ & 0xff00ff);
				int i_2176_ = (i_2175_ & 0x1000100) + (i_2174_ - i_2175_ & 0x10000);
				is[i_2165_] = i_2174_ - i_2176_ | i_2176_ - (i_2176_ >>> 8);
			} else if (i_2166_ == 2) {
				int i_2177_ = anIntArray11347[i];
				int i_2178_ = (i_2177_ & 0xff00ff) * anInt8965 & ~0xff00ff;
				int i_2179_ = (i_2177_ & 0xff00) * anInt8965 & 0xff0000;
				is[i_2165_] = ((i_2178_ | i_2179_) >>> 8) + anInt8978;
			} else
				throw new IllegalArgumentException();
		} else if (i_2167_ == 1) {
			if (i_2166_ == 1) {
				int i_2180_ = anIntArray11347[i];
				if (i_2180_ != 0)
					is[i_2165_] = i_2180_;
			} else if (i_2166_ == 0) {
				int i_2181_ = anIntArray11347[i];
				if (i_2181_ != 0) {
					if ((anInt8944 & 0xffffff) == 16777215) {
						int i_2182_ = anInt8944 >>> 24;
						int i_2183_ = 256 - i_2182_;
						int i_2184_ = is[i_2165_];
						is[i_2165_] = ((((i_2181_ & 0xff00ff) * i_2182_ + (i_2184_ & 0xff00ff) * i_2183_) & ~0xff00ff) + (((i_2181_ & 0xff00) * i_2182_ + (i_2184_ & 0xff00) * i_2183_) & 0xff0000)) >> 8;
					} else if (anInt8965 != 255) {
						int i_2185_ = (i_2181_ & 0xff0000) * anInt8973 & ~0xffffff;
						int i_2186_ = (i_2181_ & 0xff00) * anInt8974 & 0xff0000;
						int i_2187_ = (i_2181_ & 0xff) * anInt8975 & 0xff00;
						i_2181_ = (i_2185_ | i_2186_ | i_2187_) >>> 8;
						int i_2188_ = is[i_2165_];
						is[i_2165_] = ((((i_2181_ & 0xff00ff) * anInt8965 + (i_2188_ & 0xff00ff) * anInt8972) & ~0xff00ff) + (((i_2181_ & 0xff00) * anInt8965 + (i_2188_ & 0xff00) * anInt8972) & 0xff0000)) >> 8;
					} else {
						int i_2189_ = (i_2181_ & 0xff0000) * anInt8973 & ~0xffffff;
						int i_2190_ = (i_2181_ & 0xff00) * anInt8974 & 0xff0000;
						int i_2191_ = (i_2181_ & 0xff) * anInt8975 & 0xff00;
						is[i_2165_] = (i_2189_ | i_2190_ | i_2191_) >>> 8;
					}
				}
			} else if (i_2166_ == 3) {
				int i_2192_ = anIntArray11347[i];
				int i_2193_ = anInt8944;
				int i_2194_ = i_2192_ + i_2193_;
				int i_2195_ = (i_2192_ & 0xff00ff) + (i_2193_ & 0xff00ff);
				int i_2196_ = (i_2195_ & 0x1000100) + (i_2194_ - i_2195_ & 0x10000);
				i_2196_ = i_2194_ - i_2196_ | i_2196_ - (i_2196_ >>> 8);
				if (i_2192_ == 0 && anInt8965 != 255) {
					i_2192_ = i_2196_;
					i_2196_ = is[i_2165_];
					i_2196_ = ((((i_2192_ & 0xff00ff) * anInt8965 + (i_2196_ & 0xff00ff) * anInt8972) & ~0xff00ff) + (((i_2192_ & 0xff00) * anInt8965 + (i_2196_ & 0xff00) * anInt8972) & 0xff0000)) >> 8;
				}
				is[i_2165_] = i_2196_;
			} else if (i_2166_ == 2) {
				int i_2197_ = anIntArray11347[i];
				if (i_2197_ != 0) {
					int i_2198_ = (i_2197_ & 0xff00ff) * anInt8965 & ~0xff00ff;
					int i_2199_ = (i_2197_ & 0xff00) * anInt8965 & 0xff0000;
					is[i_2165_++] = ((i_2198_ | i_2199_) >>> 8) + anInt8978;
				}
			} else
				throw new IllegalArgumentException();
		} else if (i_2167_ == 2) {
			if (i_2166_ == 1) {
				int i_2200_ = anIntArray11347[i];
				if (i_2200_ != 0) {
					int i_2201_ = is[i_2165_];
					int i_2202_ = i_2200_ + i_2201_;
					int i_2203_ = (i_2200_ & 0xff00ff) + (i_2201_ & 0xff00ff);
					i_2201_ = (i_2203_ & 0x1000100) + (i_2202_ - i_2203_ & 0x10000);
					is[i_2165_] = i_2202_ - i_2201_ | i_2201_ - (i_2201_ >>> 8);
				}
			} else if (i_2166_ == 0) {
				int i_2204_ = anIntArray11347[i];
				if (i_2204_ != 0) {
					int i_2205_ = (i_2204_ & 0xff0000) * anInt8973 & ~0xffffff;
					int i_2206_ = (i_2204_ & 0xff00) * anInt8974 & 0xff0000;
					int i_2207_ = (i_2204_ & 0xff) * anInt8975 & 0xff00;
					i_2204_ = (i_2205_ | i_2206_ | i_2207_) >>> 8;
					int i_2208_ = is[i_2165_];
					int i_2209_ = i_2204_ + i_2208_;
					int i_2210_ = (i_2204_ & 0xff00ff) + (i_2208_ & 0xff00ff);
					i_2208_ = (i_2210_ & 0x1000100) + (i_2209_ - i_2210_ & 0x10000);
					is[i_2165_] = i_2209_ - i_2208_ | i_2208_ - (i_2208_ >>> 8);
				}
			} else if (i_2166_ == 3) {
				int i_2211_ = anIntArray11347[i];
				int i_2212_ = anInt8944;
				int i_2213_ = i_2211_ + i_2212_;
				int i_2214_ = (i_2211_ & 0xff00ff) + (i_2212_ & 0xff00ff);
				int i_2215_ = (i_2214_ & 0x1000100) + (i_2213_ - i_2214_ & 0x10000);
				i_2211_ = i_2213_ - i_2215_ | i_2215_ - (i_2215_ >>> 8);
				i_2215_ = is[i_2165_];
				i_2213_ = i_2211_ + i_2215_;
				i_2214_ = (i_2211_ & 0xff00ff) + (i_2215_ & 0xff00ff);
				i_2215_ = (i_2214_ & 0x1000100) + (i_2213_ - i_2214_ & 0x10000);
				is[i_2165_] = i_2213_ - i_2215_ | i_2215_ - (i_2215_ >>> 8);
			} else if (i_2166_ == 2) {
				int i_2216_ = anIntArray11347[i];
				if (i_2216_ != 0) {
					int i_2217_ = (i_2216_ & 0xff00ff) * anInt8965 & ~0xff00ff;
					int i_2218_ = (i_2216_ & 0xff00) * anInt8965 & 0xff0000;
					i_2216_ = ((i_2217_ | i_2218_) >>> 8) + anInt8978;
					int i_2219_ = is[i_2165_];
					int i_2220_ = i_2216_ + i_2219_;
					int i_2221_ = (i_2216_ & 0xff00ff) + (i_2219_ & 0xff00ff);
					i_2219_ = (i_2221_ & 0x1000100) + (i_2220_ - i_2221_ & 0x10000);
					is[i_2165_] = i_2220_ - i_2219_ | i_2219_ - (i_2219_ >>> 8);
				}
			}
		} else
			throw new IllegalArgumentException();
	}

	public void method1751(int i, int i_2222_, int i_2223_) {
		throw new IllegalStateException("");
	}
}
