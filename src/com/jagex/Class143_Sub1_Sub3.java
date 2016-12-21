/* Class143_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class143_Sub1_Sub3 extends Class143_Sub1 {
	int[] anIntArray11393;
	byte[] aByteArray11394;

	public void method1754(int i, int i_0_, Class161 class161, int i_1_, int i_2_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			i += anInt8977;
			i_0_ += anInt8947;
			int i_3_ = 0;
			int i_4_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			int i_5_ = anInt8945;
			int i_6_ = anInt8950;
			int i_7_ = i_4_ - i_5_;
			int i_8_ = 0;
			int i_9_ = i + i_0_ * i_4_;
			if (i_0_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_10_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_0_;
				i_6_ -= i_10_;
				i_0_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_3_ += i_10_ * i_5_;
				i_9_ += i_10_ * i_4_;
			}
			if (i_0_ + i_6_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_6_ -= (i_0_ + i_6_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_11_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_5_ -= i_11_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_3_ += i_11_;
				i_9_ += i_11_;
				i_8_ += i_11_;
				i_7_ += i_11_;
			}
			if (i + i_5_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_12_ = i + i_5_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_5_ -= i_12_;
				i_8_ += i_12_;
				i_7_ += i_12_;
			}
			if (i_5_ > 0 && i_6_ > 0) {
				Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
				int[] is_13_ = class161_sub2.anIntArray9444;
				int[] is_14_ = class161_sub2.anIntArray9445;
				int i_15_ = i_0_;
				if (i_2_ > i_15_) {
					i_15_ = i_2_;
					i_9_ += (i_2_ - i_0_) * i_4_;
					i_3_ += (i_2_ - i_0_) * anInt8945;
				}
				int i_16_ = (i_2_ + is_13_.length < i_0_ + i_6_ ? i_2_ + is_13_.length : i_0_ + i_6_);
				for (int i_17_ = i_15_; i_17_ < i_16_; i_17_++) {
					int i_18_ = is_13_[i_17_ - i_2_] + i_1_;
					int i_19_ = is_14_[i_17_ - i_2_];
					int i_20_ = i_5_;
					if (i > i_18_) {
						int i_21_ = i - i_18_;
						if (i_21_ >= i_19_) {
							i_3_ += i_5_ + i_8_;
							i_9_ += i_5_ + i_7_;
							continue;
						}
						i_19_ -= i_21_;
					} else {
						int i_22_ = i_18_ - i;
						if (i_22_ >= i_5_) {
							i_3_ += i_5_ + i_8_;
							i_9_ += i_5_ + i_7_;
							continue;
						}
						i_3_ += i_22_;
						i_20_ -= i_22_;
						i_9_ += i_22_;
					}
					int i_23_ = 0;
					if (i_20_ < i_19_)
						i_19_ = i_20_;
					else
						i_23_ = i_20_ - i_19_;
					for (int i_24_ = -i_19_; i_24_ < 0; i_24_++) {
						int i_25_ = aByteArray11394[i_3_++];
						if (i_25_ != 0)
							is[i_9_++] = anIntArray11393[i_25_ & 0xff];
						else
							i_9_++;
					}
					i_3_ += i_23_ + i_8_;
					i_9_ += i_23_ + i_7_;
				}
			}
		}
	}

	public void method1783(int i, int i_26_, int i_27_, int i_28_, int[] is, int i_29_, int i_30_) {
		throw new IllegalStateException();
	}

	public void method1721(int i, int i_31_, int i_32_, int i_33_, int i_34_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			int i_35_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			i += anInt8977;
			i_31_ += anInt8947;
			int i_36_ = i_31_ * i_35_ + i;
			int i_37_ = 0;
			int i_38_ = anInt8950;
			int i_39_ = anInt8945;
			int i_40_ = i_35_ - i_39_;
			int i_41_ = 0;
			if (i_31_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_42_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_31_;
				i_38_ -= i_42_;
				i_31_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_37_ += i_42_ * i_39_;
				i_36_ += i_42_ * i_35_;
			}
			if (i_31_ + i_38_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_38_ -= (i_31_ + i_38_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_43_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_39_ -= i_43_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_37_ += i_43_;
				i_36_ += i_43_;
				i_41_ += i_43_;
				i_40_ += i_43_;
			}
			if (i + i_39_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_44_ = i + i_39_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_39_ -= i_44_;
				i_41_ += i_44_;
				i_40_ += i_44_;
			}
			if (i_39_ > 0 && i_38_ > 0) {
				if (i_34_ == 0) {
					if (i_32_ == 1) {
						for (int i_45_ = -i_38_; i_45_ < 0; i_45_++) {
							int i_46_ = i_36_ + i_39_ - 3;
							while (i_36_ < i_46_) {
								is[i_36_++] = (anIntArray11393[aByteArray11394[i_37_++] & 0xff]);
								is[i_36_++] = (anIntArray11393[aByteArray11394[i_37_++] & 0xff]);
								is[i_36_++] = (anIntArray11393[aByteArray11394[i_37_++] & 0xff]);
								is[i_36_++] = (anIntArray11393[aByteArray11394[i_37_++] & 0xff]);
							}
							i_46_ += 3;
							while (i_36_ < i_46_)
								is[i_36_++] = (anIntArray11393[aByteArray11394[i_37_++] & 0xff]);
							i_36_ += i_40_;
							i_37_ += i_41_;
						}
					} else if (i_32_ == 0) {
						int i_47_ = (i_33_ & 0xff0000) >> 16;
						int i_48_ = (i_33_ & 0xff00) >> 8;
						int i_49_ = i_33_ & 0xff;
						for (int i_50_ = -i_38_; i_50_ < 0; i_50_++) {
							for (int i_51_ = -i_39_; i_51_ < 0; i_51_++) {
								int i_52_ = (anIntArray11393[aByteArray11394[i_37_++] & 0xff]);
								int i_53_ = (i_52_ & 0xff0000) * i_47_ & ~0xffffff;
								int i_54_ = (i_52_ & 0xff00) * i_48_ & 0xff0000;
								int i_55_ = (i_52_ & 0xff) * i_49_ & 0xff00;
								is[i_36_++] = (i_53_ | i_54_ | i_55_) >>> 8;
							}
							i_36_ += i_40_;
							i_37_ += i_41_;
						}
					} else if (i_32_ == 3) {
						for (int i_56_ = -i_38_; i_56_ < 0; i_56_++) {
							for (int i_57_ = -i_39_; i_57_ < 0; i_57_++) {
								int i_58_ = (anIntArray11393[aByteArray11394[i_37_++] & 0xff]);
								int i_59_ = i_58_ + i_33_;
								int i_60_ = (i_58_ & 0xff00ff) + (i_33_ & 0xff00ff);
								int i_61_ = ((i_60_ & 0x1000100) + (i_59_ - i_60_ & 0x10000));
								is[i_36_++] = i_59_ - i_61_ | i_61_ - (i_61_ >>> 8);
							}
							i_36_ += i_40_;
							i_37_ += i_41_;
						}
					} else if (i_32_ == 2) {
						int i_62_ = i_33_ >>> 24;
						int i_63_ = 256 - i_62_;
						int i_64_ = (i_33_ & 0xff00ff) * i_63_ & ~0xff00ff;
						int i_65_ = (i_33_ & 0xff00) * i_63_ & 0xff0000;
						i_33_ = (i_64_ | i_65_) >>> 8;
						for (int i_66_ = -i_38_; i_66_ < 0; i_66_++) {
							for (int i_67_ = -i_39_; i_67_ < 0; i_67_++) {
								int i_68_ = (anIntArray11393[aByteArray11394[i_37_++] & 0xff]);
								i_64_ = (i_68_ & 0xff00ff) * i_62_ & ~0xff00ff;
								i_65_ = (i_68_ & 0xff00) * i_62_ & 0xff0000;
								is[i_36_++] = ((i_64_ | i_65_) >>> 8) + i_33_;
							}
							i_36_ += i_40_;
							i_37_ += i_41_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_34_ == 1) {
					if (i_32_ == 1) {
						for (int i_69_ = -i_38_; i_69_ < 0; i_69_++) {
							for (int i_70_ = -i_39_; i_70_ < 0; i_70_++) {
								int i_71_ = aByteArray11394[i_37_++];
								if (i_71_ != 0) {
									int i_72_ = (anIntArray11393[i_71_ & 0xff] | ~0xffffff);
									int i_73_ = 255;
									int i_74_ = 0;
									int i_75_ = is[i_36_];
									is[i_36_++] = (((((i_72_ & 0xff00ff) * i_73_ + (i_75_ & 0xff00ff) * i_74_) & ~0xff00ff) >> 8) + (((((i_72_ & ~0xff00ff) >>> 8) * i_73_) + (((i_75_ & ~0xff00ff) >>> 8) * i_74_)) & ~0xff00ff));
								} else
									i_36_++;
							}
							i_36_ += i_40_;
							i_37_ += i_41_;
						}
					} else if (i_32_ == 0) {
						if ((i_33_ & 0xffffff) == 16777215) {
							int i_76_ = i_33_ >>> 24;
							int i_77_ = 256 - i_76_;
							for (int i_78_ = -i_38_; i_78_ < 0; i_78_++) {
								for (int i_79_ = -i_39_; i_79_ < 0; i_79_++) {
									int i_80_ = aByteArray11394[i_37_++];
									if (i_80_ != 0) {
										int i_81_ = anIntArray11393[i_80_ & 0xff];
										int i_82_ = is[i_36_];
										is[i_36_++] = ((((i_81_ & 0xff00ff) * i_76_ + (i_82_ & 0xff00ff) * i_77_) & ~0xff00ff) + (((i_81_ & 0xff00) * i_76_ + (i_82_ & 0xff00) * i_77_) & 0xff0000)) >> 8;
									} else
										i_36_++;
								}
								i_36_ += i_40_;
								i_37_ += i_41_;
							}
						} else {
							int i_83_ = (i_33_ & 0xff0000) >> 16;
							int i_84_ = (i_33_ & 0xff00) >> 8;
							int i_85_ = i_33_ & 0xff;
							int i_86_ = i_33_ >>> 24;
							int i_87_ = 256 - i_86_;
							for (int i_88_ = -i_38_; i_88_ < 0; i_88_++) {
								for (int i_89_ = -i_39_; i_89_ < 0; i_89_++) {
									int i_90_ = aByteArray11394[i_37_++];
									if (i_90_ != 0) {
										int i_91_ = anIntArray11393[i_90_ & 0xff];
										if (i_86_ != 255) {
											int i_92_ = ((i_91_ & 0xff0000) * i_83_ & ~0xffffff);
											int i_93_ = ((i_91_ & 0xff00) * i_84_ & 0xff0000);
											int i_94_ = ((i_91_ & 0xff) * i_85_ & 0xff00);
											i_91_ = ((i_92_ | i_93_ | i_94_) >>> 8);
											int i_95_ = is[i_36_];
											is[i_36_++] = ((((i_91_ & 0xff00ff) * i_86_ + ((i_95_ & 0xff00ff) * i_87_)) & ~0xff00ff) + (((i_91_ & 0xff00) * i_86_ + ((i_95_ & 0xff00) * i_87_)) & 0xff0000)) >> 8;
										} else {
											int i_96_ = ((i_91_ & 0xff0000) * i_83_ & ~0xffffff);
											int i_97_ = ((i_91_ & 0xff00) * i_84_ & 0xff0000);
											int i_98_ = ((i_91_ & 0xff) * i_85_ & 0xff00);
											is[i_36_++] = (i_96_ | i_97_ | i_98_) >>> 8;
										}
									} else
										i_36_++;
								}
								i_36_ += i_40_;
								i_37_ += i_41_;
							}
						}
					} else if (i_32_ == 3) {
						int i_99_ = i_33_ >>> 24;
						int i_100_ = 256 - i_99_;
						for (int i_101_ = -i_38_; i_101_ < 0; i_101_++) {
							for (int i_102_ = -i_39_; i_102_ < 0; i_102_++) {
								byte i_103_ = aByteArray11394[i_37_++];
								int i_104_ = i_103_ > 0 ? anIntArray11393[i_103_] : 0;
								int i_105_ = i_104_ + i_33_;
								int i_106_ = (i_104_ & 0xff00ff) + (i_33_ & 0xff00ff);
								int i_107_ = ((i_106_ & 0x1000100) + (i_105_ - i_106_ & 0x10000));
								i_107_ = i_105_ - i_107_ | i_107_ - (i_107_ >>> 8);
								if (i_104_ == 0 && i_99_ != 255) {
									i_104_ = i_107_;
									i_107_ = is[i_36_];
									i_107_ = ((((i_104_ & 0xff00ff) * i_99_ + (i_107_ & 0xff00ff) * i_100_) & ~0xff00ff) + (((i_104_ & 0xff00) * i_99_ + (i_107_ & 0xff00) * i_100_) & 0xff0000)) >> 8;
								}
								is[i_36_++] = i_107_;
							}
							i_36_ += i_40_;
							i_37_ += i_41_;
						}
					} else if (i_32_ == 2) {
						int i_108_ = i_33_ >>> 24;
						int i_109_ = 256 - i_108_;
						int i_110_ = (i_33_ & 0xff00ff) * i_109_ & ~0xff00ff;
						int i_111_ = (i_33_ & 0xff00) * i_109_ & 0xff0000;
						i_33_ = (i_110_ | i_111_) >>> 8;
						for (int i_112_ = -i_38_; i_112_ < 0; i_112_++) {
							for (int i_113_ = -i_39_; i_113_ < 0; i_113_++) {
								int i_114_ = aByteArray11394[i_37_++];
								if (i_114_ != 0) {
									int i_115_ = anIntArray11393[i_114_ & 0xff];
									i_110_ = ((i_115_ & 0xff00ff) * i_108_ & ~0xff00ff);
									i_111_ = ((i_115_ & 0xff00) * i_108_ & 0xff0000);
									is[i_36_++] = ((i_110_ | i_111_) >>> 8) + i_33_;
								} else
									i_36_++;
							}
							i_36_ += i_40_;
							i_37_ += i_41_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_34_ == 2) {
					if (i_32_ == 1) {
						for (int i_116_ = -i_38_; i_116_ < 0; i_116_++) {
							for (int i_117_ = -i_39_; i_117_ < 0; i_117_++) {
								int i_118_ = aByteArray11394[i_37_++];
								if (i_118_ != 0) {
									int i_119_ = anIntArray11393[i_118_ & 0xff];
									int i_120_ = is[i_36_];
									int i_121_ = i_119_ + i_120_;
									int i_122_ = ((i_119_ & 0xff00ff) + (i_120_ & 0xff00ff));
									i_120_ = ((i_122_ & 0x1000100) + (i_121_ - i_122_ & 0x10000));
									is[i_36_++] = i_121_ - i_120_ | i_120_ - (i_120_ >>> 8);
								} else
									i_36_++;
							}
							i_36_ += i_40_;
							i_37_ += i_41_;
						}
					} else if (i_32_ == 0) {
						int i_123_ = (i_33_ & 0xff0000) >> 16;
						int i_124_ = (i_33_ & 0xff00) >> 8;
						int i_125_ = i_33_ & 0xff;
						for (int i_126_ = -i_38_; i_126_ < 0; i_126_++) {
							for (int i_127_ = -i_39_; i_127_ < 0; i_127_++) {
								int i_128_ = aByteArray11394[i_37_++];
								if (i_128_ != 0) {
									int i_129_ = anIntArray11393[i_128_ & 0xff];
									int i_130_ = ((i_129_ & 0xff0000) * i_123_ & ~0xffffff);
									int i_131_ = ((i_129_ & 0xff00) * i_124_ & 0xff0000);
									int i_132_ = (i_129_ & 0xff) * i_125_ & 0xff00;
									i_129_ = (i_130_ | i_131_ | i_132_) >>> 8;
									int i_133_ = is[i_36_];
									int i_134_ = i_129_ + i_133_;
									int i_135_ = ((i_129_ & 0xff00ff) + (i_133_ & 0xff00ff));
									i_133_ = ((i_135_ & 0x1000100) + (i_134_ - i_135_ & 0x10000));
									is[i_36_++] = i_134_ - i_133_ | i_133_ - (i_133_ >>> 8);
								} else
									i_36_++;
							}
							i_36_ += i_40_;
							i_37_ += i_41_;
						}
					} else if (i_32_ == 3) {
						for (int i_136_ = -i_38_; i_136_ < 0; i_136_++) {
							for (int i_137_ = -i_39_; i_137_ < 0; i_137_++) {
								byte i_138_ = aByteArray11394[i_37_++];
								int i_139_ = i_138_ > 0 ? anIntArray11393[i_138_] : 0;
								int i_140_ = i_139_ + i_33_;
								int i_141_ = (i_139_ & 0xff00ff) + (i_33_ & 0xff00ff);
								int i_142_ = ((i_141_ & 0x1000100) + (i_140_ - i_141_ & 0x10000));
								i_139_ = i_140_ - i_142_ | i_142_ - (i_142_ >>> 8);
								i_142_ = is[i_36_];
								i_140_ = i_139_ + i_142_;
								i_141_ = (i_139_ & 0xff00ff) + (i_142_ & 0xff00ff);
								i_142_ = (i_141_ & 0x1000100) + (i_140_ - i_141_ & 0x10000);
								is[i_36_++] = i_140_ - i_142_ | i_142_ - (i_142_ >>> 8);
							}
							i_36_ += i_40_;
							i_37_ += i_41_;
						}
					} else if (i_32_ == 2) {
						int i_143_ = i_33_ >>> 24;
						int i_144_ = 256 - i_143_;
						int i_145_ = (i_33_ & 0xff00ff) * i_144_ & ~0xff00ff;
						int i_146_ = (i_33_ & 0xff00) * i_144_ & 0xff0000;
						i_33_ = (i_145_ | i_146_) >>> 8;
						for (int i_147_ = -i_38_; i_147_ < 0; i_147_++) {
							for (int i_148_ = -i_39_; i_148_ < 0; i_148_++) {
								int i_149_ = aByteArray11394[i_37_++];
								if (i_149_ != 0) {
									int i_150_ = anIntArray11393[i_149_ & 0xff];
									i_145_ = ((i_150_ & 0xff00ff) * i_143_ & ~0xff00ff);
									i_146_ = ((i_150_ & 0xff00) * i_143_ & 0xff0000);
									i_150_ = ((i_145_ | i_146_) >>> 8) + i_33_;
									int i_151_ = is[i_36_];
									int i_152_ = i_150_ + i_151_;
									int i_153_ = ((i_150_ & 0xff00ff) + (i_151_ & 0xff00ff));
									i_151_ = ((i_153_ & 0x1000100) + (i_152_ - i_153_ & 0x10000));
									is[i_36_++] = i_152_ - i_151_ | i_151_ - (i_151_ >>> 8);
								} else
									i_36_++;
							}
							i_36_ += i_40_;
							i_37_ += i_41_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method1726(int i, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_) {
		throw new IllegalStateException();
	}

	Class143_Sub1_Sub3(Class167_Sub1 class167_sub1, byte[] is, int[] is_159_, int i, int i_160_) {
		super(class167_sub1, i, i_160_);
		aByteArray11394 = is;
		anIntArray11393 = is_159_;
	}

	public Interface22 method1782() {
		throw new IllegalStateException();
	}

	public void method1729(int i, int i_161_, int i_162_, int i_163_, int i_164_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			int i_165_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			i += anInt8977;
			i_161_ += anInt8947;
			int i_166_ = i_161_ * i_165_ + i;
			int i_167_ = 0;
			int i_168_ = anInt8950;
			int i_169_ = anInt8945;
			int i_170_ = i_165_ - i_169_;
			int i_171_ = 0;
			if (i_161_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_172_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_161_;
				i_168_ -= i_172_;
				i_161_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_167_ += i_172_ * i_169_;
				i_166_ += i_172_ * i_165_;
			}
			if (i_161_ + i_168_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_168_ -= (i_161_ + i_168_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_173_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_169_ -= i_173_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_167_ += i_173_;
				i_166_ += i_173_;
				i_171_ += i_173_;
				i_170_ += i_173_;
			}
			if (i + i_169_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_174_ = i + i_169_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_169_ -= i_174_;
				i_171_ += i_174_;
				i_170_ += i_174_;
			}
			if (i_169_ > 0 && i_168_ > 0) {
				if (i_164_ == 0) {
					if (i_162_ == 1) {
						for (int i_175_ = -i_168_; i_175_ < 0; i_175_++) {
							int i_176_ = i_166_ + i_169_ - 3;
							while (i_166_ < i_176_) {
								is[i_166_++] = (anIntArray11393[aByteArray11394[i_167_++] & 0xff]);
								is[i_166_++] = (anIntArray11393[aByteArray11394[i_167_++] & 0xff]);
								is[i_166_++] = (anIntArray11393[aByteArray11394[i_167_++] & 0xff]);
								is[i_166_++] = (anIntArray11393[aByteArray11394[i_167_++] & 0xff]);
							}
							i_176_ += 3;
							while (i_166_ < i_176_)
								is[i_166_++] = (anIntArray11393[aByteArray11394[i_167_++] & 0xff]);
							i_166_ += i_170_;
							i_167_ += i_171_;
						}
					} else if (i_162_ == 0) {
						int i_177_ = (i_163_ & 0xff0000) >> 16;
						int i_178_ = (i_163_ & 0xff00) >> 8;
						int i_179_ = i_163_ & 0xff;
						for (int i_180_ = -i_168_; i_180_ < 0; i_180_++) {
							for (int i_181_ = -i_169_; i_181_ < 0; i_181_++) {
								int i_182_ = (anIntArray11393[aByteArray11394[i_167_++] & 0xff]);
								int i_183_ = (i_182_ & 0xff0000) * i_177_ & ~0xffffff;
								int i_184_ = (i_182_ & 0xff00) * i_178_ & 0xff0000;
								int i_185_ = (i_182_ & 0xff) * i_179_ & 0xff00;
								is[i_166_++] = (i_183_ | i_184_ | i_185_) >>> 8;
							}
							i_166_ += i_170_;
							i_167_ += i_171_;
						}
					} else if (i_162_ == 3) {
						for (int i_186_ = -i_168_; i_186_ < 0; i_186_++) {
							for (int i_187_ = -i_169_; i_187_ < 0; i_187_++) {
								int i_188_ = (anIntArray11393[aByteArray11394[i_167_++] & 0xff]);
								int i_189_ = i_188_ + i_163_;
								int i_190_ = ((i_188_ & 0xff00ff) + (i_163_ & 0xff00ff));
								int i_191_ = ((i_190_ & 0x1000100) + (i_189_ - i_190_ & 0x10000));
								is[i_166_++] = i_189_ - i_191_ | i_191_ - (i_191_ >>> 8);
							}
							i_166_ += i_170_;
							i_167_ += i_171_;
						}
					} else if (i_162_ == 2) {
						int i_192_ = i_163_ >>> 24;
						int i_193_ = 256 - i_192_;
						int i_194_ = (i_163_ & 0xff00ff) * i_193_ & ~0xff00ff;
						int i_195_ = (i_163_ & 0xff00) * i_193_ & 0xff0000;
						i_163_ = (i_194_ | i_195_) >>> 8;
						for (int i_196_ = -i_168_; i_196_ < 0; i_196_++) {
							for (int i_197_ = -i_169_; i_197_ < 0; i_197_++) {
								int i_198_ = (anIntArray11393[aByteArray11394[i_167_++] & 0xff]);
								i_194_ = (i_198_ & 0xff00ff) * i_192_ & ~0xff00ff;
								i_195_ = (i_198_ & 0xff00) * i_192_ & 0xff0000;
								is[i_166_++] = ((i_194_ | i_195_) >>> 8) + i_163_;
							}
							i_166_ += i_170_;
							i_167_ += i_171_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_164_ == 1) {
					if (i_162_ == 1) {
						for (int i_199_ = -i_168_; i_199_ < 0; i_199_++) {
							for (int i_200_ = -i_169_; i_200_ < 0; i_200_++) {
								int i_201_ = aByteArray11394[i_167_++];
								if (i_201_ != 0) {
									int i_202_ = (anIntArray11393[i_201_ & 0xff] | ~0xffffff);
									int i_203_ = 255;
									int i_204_ = 0;
									int i_205_ = is[i_166_];
									is[i_166_++] = (((((i_202_ & 0xff00ff) * i_203_ + (i_205_ & 0xff00ff) * i_204_) & ~0xff00ff) >> 8) + (((((i_202_ & ~0xff00ff) >>> 8) * i_203_) + (((i_205_ & ~0xff00ff) >>> 8) * i_204_)) & ~0xff00ff));
								} else
									i_166_++;
							}
							i_166_ += i_170_;
							i_167_ += i_171_;
						}
					} else if (i_162_ == 0) {
						if ((i_163_ & 0xffffff) == 16777215) {
							int i_206_ = i_163_ >>> 24;
							int i_207_ = 256 - i_206_;
							for (int i_208_ = -i_168_; i_208_ < 0; i_208_++) {
								for (int i_209_ = -i_169_; i_209_ < 0; i_209_++) {
									int i_210_ = aByteArray11394[i_167_++];
									if (i_210_ != 0) {
										int i_211_ = anIntArray11393[i_210_ & 0xff];
										int i_212_ = is[i_166_];
										is[i_166_++] = ((((i_211_ & 0xff00ff) * i_206_ + ((i_212_ & 0xff00ff) * i_207_)) & ~0xff00ff) + (((i_211_ & 0xff00) * i_206_ + ((i_212_ & 0xff00) * i_207_)) & 0xff0000)) >> 8;
									} else
										i_166_++;
								}
								i_166_ += i_170_;
								i_167_ += i_171_;
							}
						} else {
							int i_213_ = (i_163_ & 0xff0000) >> 16;
							int i_214_ = (i_163_ & 0xff00) >> 8;
							int i_215_ = i_163_ & 0xff;
							int i_216_ = i_163_ >>> 24;
							int i_217_ = 256 - i_216_;
							for (int i_218_ = -i_168_; i_218_ < 0; i_218_++) {
								for (int i_219_ = -i_169_; i_219_ < 0; i_219_++) {
									int i_220_ = aByteArray11394[i_167_++];
									if (i_220_ != 0) {
										int i_221_ = anIntArray11393[i_220_ & 0xff];
										if (i_216_ != 255) {
											int i_222_ = ((i_221_ & 0xff0000) * i_213_ & ~0xffffff);
											int i_223_ = ((i_221_ & 0xff00) * i_214_ & 0xff0000);
											int i_224_ = ((i_221_ & 0xff) * i_215_ & 0xff00);
											i_221_ = (i_222_ | i_223_ | i_224_) >>> 8;
											int i_225_ = is[i_166_];
											is[i_166_++] = (((((i_221_ & 0xff00ff) * i_216_) + ((i_225_ & 0xff00ff) * i_217_)) & ~0xff00ff) + ((((i_221_ & 0xff00) * i_216_) + ((i_225_ & 0xff00) * i_217_)) & 0xff0000)) >> 8;
										} else {
											int i_226_ = ((i_221_ & 0xff0000) * i_213_ & ~0xffffff);
											int i_227_ = ((i_221_ & 0xff00) * i_214_ & 0xff0000);
											int i_228_ = ((i_221_ & 0xff) * i_215_ & 0xff00);
											is[i_166_++] = (i_226_ | i_227_ | i_228_) >>> 8;
										}
									} else
										i_166_++;
								}
								i_166_ += i_170_;
								i_167_ += i_171_;
							}
						}
					} else if (i_162_ == 3) {
						int i_229_ = i_163_ >>> 24;
						int i_230_ = 256 - i_229_;
						for (int i_231_ = -i_168_; i_231_ < 0; i_231_++) {
							for (int i_232_ = -i_169_; i_232_ < 0; i_232_++) {
								byte i_233_ = aByteArray11394[i_167_++];
								int i_234_ = i_233_ > 0 ? anIntArray11393[i_233_] : 0;
								int i_235_ = i_234_ + i_163_;
								int i_236_ = ((i_234_ & 0xff00ff) + (i_163_ & 0xff00ff));
								int i_237_ = ((i_236_ & 0x1000100) + (i_235_ - i_236_ & 0x10000));
								i_237_ = i_235_ - i_237_ | i_237_ - (i_237_ >>> 8);
								if (i_234_ == 0 && i_229_ != 255) {
									i_234_ = i_237_;
									i_237_ = is[i_166_];
									i_237_ = ((((i_234_ & 0xff00ff) * i_229_ + (i_237_ & 0xff00ff) * i_230_) & ~0xff00ff) + (((i_234_ & 0xff00) * i_229_ + (i_237_ & 0xff00) * i_230_) & 0xff0000)) >> 8;
								}
								is[i_166_++] = i_237_;
							}
							i_166_ += i_170_;
							i_167_ += i_171_;
						}
					} else if (i_162_ == 2) {
						int i_238_ = i_163_ >>> 24;
						int i_239_ = 256 - i_238_;
						int i_240_ = (i_163_ & 0xff00ff) * i_239_ & ~0xff00ff;
						int i_241_ = (i_163_ & 0xff00) * i_239_ & 0xff0000;
						i_163_ = (i_240_ | i_241_) >>> 8;
						for (int i_242_ = -i_168_; i_242_ < 0; i_242_++) {
							for (int i_243_ = -i_169_; i_243_ < 0; i_243_++) {
								int i_244_ = aByteArray11394[i_167_++];
								if (i_244_ != 0) {
									int i_245_ = anIntArray11393[i_244_ & 0xff];
									i_240_ = ((i_245_ & 0xff00ff) * i_238_ & ~0xff00ff);
									i_241_ = ((i_245_ & 0xff00) * i_238_ & 0xff0000);
									is[i_166_++] = ((i_240_ | i_241_) >>> 8) + i_163_;
								} else
									i_166_++;
							}
							i_166_ += i_170_;
							i_167_ += i_171_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_164_ == 2) {
					if (i_162_ == 1) {
						for (int i_246_ = -i_168_; i_246_ < 0; i_246_++) {
							for (int i_247_ = -i_169_; i_247_ < 0; i_247_++) {
								int i_248_ = aByteArray11394[i_167_++];
								if (i_248_ != 0) {
									int i_249_ = anIntArray11393[i_248_ & 0xff];
									int i_250_ = is[i_166_];
									int i_251_ = i_249_ + i_250_;
									int i_252_ = ((i_249_ & 0xff00ff) + (i_250_ & 0xff00ff));
									i_250_ = ((i_252_ & 0x1000100) + (i_251_ - i_252_ & 0x10000));
									is[i_166_++] = i_251_ - i_250_ | i_250_ - (i_250_ >>> 8);
								} else
									i_166_++;
							}
							i_166_ += i_170_;
							i_167_ += i_171_;
						}
					} else if (i_162_ == 0) {
						int i_253_ = (i_163_ & 0xff0000) >> 16;
						int i_254_ = (i_163_ & 0xff00) >> 8;
						int i_255_ = i_163_ & 0xff;
						for (int i_256_ = -i_168_; i_256_ < 0; i_256_++) {
							for (int i_257_ = -i_169_; i_257_ < 0; i_257_++) {
								int i_258_ = aByteArray11394[i_167_++];
								if (i_258_ != 0) {
									int i_259_ = anIntArray11393[i_258_ & 0xff];
									int i_260_ = ((i_259_ & 0xff0000) * i_253_ & ~0xffffff);
									int i_261_ = ((i_259_ & 0xff00) * i_254_ & 0xff0000);
									int i_262_ = (i_259_ & 0xff) * i_255_ & 0xff00;
									i_259_ = (i_260_ | i_261_ | i_262_) >>> 8;
									int i_263_ = is[i_166_];
									int i_264_ = i_259_ + i_263_;
									int i_265_ = ((i_259_ & 0xff00ff) + (i_263_ & 0xff00ff));
									i_263_ = ((i_265_ & 0x1000100) + (i_264_ - i_265_ & 0x10000));
									is[i_166_++] = i_264_ - i_263_ | i_263_ - (i_263_ >>> 8);
								} else
									i_166_++;
							}
							i_166_ += i_170_;
							i_167_ += i_171_;
						}
					} else if (i_162_ == 3) {
						for (int i_266_ = -i_168_; i_266_ < 0; i_266_++) {
							for (int i_267_ = -i_169_; i_267_ < 0; i_267_++) {
								byte i_268_ = aByteArray11394[i_167_++];
								int i_269_ = i_268_ > 0 ? anIntArray11393[i_268_] : 0;
								int i_270_ = i_269_ + i_163_;
								int i_271_ = ((i_269_ & 0xff00ff) + (i_163_ & 0xff00ff));
								int i_272_ = ((i_271_ & 0x1000100) + (i_270_ - i_271_ & 0x10000));
								i_269_ = i_270_ - i_272_ | i_272_ - (i_272_ >>> 8);
								i_272_ = is[i_166_];
								i_270_ = i_269_ + i_272_;
								i_271_ = (i_269_ & 0xff00ff) + (i_272_ & 0xff00ff);
								i_272_ = (i_271_ & 0x1000100) + (i_270_ - i_271_ & 0x10000);
								is[i_166_++] = i_270_ - i_272_ | i_272_ - (i_272_ >>> 8);
							}
							i_166_ += i_170_;
							i_167_ += i_171_;
						}
					} else if (i_162_ == 2) {
						int i_273_ = i_163_ >>> 24;
						int i_274_ = 256 - i_273_;
						int i_275_ = (i_163_ & 0xff00ff) * i_274_ & ~0xff00ff;
						int i_276_ = (i_163_ & 0xff00) * i_274_ & 0xff0000;
						i_163_ = (i_275_ | i_276_) >>> 8;
						for (int i_277_ = -i_168_; i_277_ < 0; i_277_++) {
							for (int i_278_ = -i_169_; i_278_ < 0; i_278_++) {
								int i_279_ = aByteArray11394[i_167_++];
								if (i_279_ != 0) {
									int i_280_ = anIntArray11393[i_279_ & 0xff];
									i_275_ = ((i_280_ & 0xff00ff) * i_273_ & ~0xff00ff);
									i_276_ = ((i_280_ & 0xff00) * i_273_ & 0xff0000);
									i_280_ = ((i_275_ | i_276_) >>> 8) + i_163_;
									int i_281_ = is[i_166_];
									int i_282_ = i_280_ + i_281_;
									int i_283_ = ((i_280_ & 0xff00ff) + (i_281_ & 0xff00ff));
									i_281_ = ((i_283_ & 0x1000100) + (i_282_ - i_283_ & 0x10000));
									is[i_166_++] = i_282_ - i_281_ | i_281_ - (i_281_ >>> 8);
								} else
									i_166_++;
							}
							i_166_ += i_170_;
							i_167_ += i_171_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method1730(int i, int i_284_, Class161 class161, int i_285_, int i_286_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			i += anInt8977;
			i_284_ += anInt8947;
			int i_287_ = 0;
			int i_288_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			int i_289_ = anInt8945;
			int i_290_ = anInt8950;
			int i_291_ = i_288_ - i_289_;
			int i_292_ = 0;
			int i_293_ = i + i_284_ * i_288_;
			if (i_284_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_294_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_284_;
				i_290_ -= i_294_;
				i_284_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_287_ += i_294_ * i_289_;
				i_293_ += i_294_ * i_288_;
			}
			if (i_284_ + i_290_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_290_ -= (i_284_ + i_290_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_295_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_289_ -= i_295_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_287_ += i_295_;
				i_293_ += i_295_;
				i_292_ += i_295_;
				i_291_ += i_295_;
			}
			if (i + i_289_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_296_ = i + i_289_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_289_ -= i_296_;
				i_292_ += i_296_;
				i_291_ += i_296_;
			}
			if (i_289_ > 0 && i_290_ > 0) {
				Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
				int[] is_297_ = class161_sub2.anIntArray9444;
				int[] is_298_ = class161_sub2.anIntArray9445;
				int i_299_ = i_284_;
				if (i_286_ > i_299_) {
					i_299_ = i_286_;
					i_293_ += (i_286_ - i_284_) * i_288_;
					i_287_ += (i_286_ - i_284_) * anInt8945;
				}
				int i_300_ = (i_286_ + is_297_.length < i_284_ + i_290_ ? i_286_ + is_297_.length : i_284_ + i_290_);
				for (int i_301_ = i_299_; i_301_ < i_300_; i_301_++) {
					int i_302_ = is_297_[i_301_ - i_286_] + i_285_;
					int i_303_ = is_298_[i_301_ - i_286_];
					int i_304_ = i_289_;
					if (i > i_302_) {
						int i_305_ = i - i_302_;
						if (i_305_ >= i_303_) {
							i_287_ += i_289_ + i_292_;
							i_293_ += i_289_ + i_291_;
							continue;
						}
						i_303_ -= i_305_;
					} else {
						int i_306_ = i_302_ - i;
						if (i_306_ >= i_289_) {
							i_287_ += i_289_ + i_292_;
							i_293_ += i_289_ + i_291_;
							continue;
						}
						i_287_ += i_306_;
						i_304_ -= i_306_;
						i_293_ += i_306_;
					}
					int i_307_ = 0;
					if (i_304_ < i_303_)
						i_303_ = i_304_;
					else
						i_307_ = i_304_ - i_303_;
					for (int i_308_ = -i_303_; i_308_ < 0; i_308_++) {
						int i_309_ = aByteArray11394[i_287_++];
						if (i_309_ != 0)
							is[i_293_++] = anIntArray11393[i_309_ & 0xff];
						else
							i_293_++;
					}
					i_287_ += i_307_ + i_292_;
					i_293_ += i_307_ + i_291_;
				}
			}
		}
	}

	void method8430(boolean bool, boolean bool_310_, boolean bool_311_, int i, int i_312_, float f, int i_313_, int i_314_, int i_315_, int i_316_, int i_317_, int i_318_, boolean bool_319_) {
		if (i_313_ > 0 && i_314_ > 0 && (bool || bool_310_)) {
			int i_320_ = 0;
			int i_321_ = 0;
			int i_322_ = anInt8977 + anInt8945 + anInt8948;
			int i_323_ = anInt8947 + anInt8950 + anInt8952;
			int i_324_ = (i_322_ << 16) / i_313_;
			int i_325_ = (i_323_ << 16) / i_314_;
			if (anInt8977 > 0) {
				int i_326_ = ((anInt8977 << 16) + i_324_ - 1) / i_324_;
				i += i_326_;
				i_320_ += i_326_ * i_324_ - (anInt8977 << 16);
			}
			if (anInt8947 > 0) {
				int i_327_ = ((anInt8947 << 16) + i_325_ - 1) / i_325_;
				i_312_ += i_327_;
				i_321_ += i_327_ * i_325_ - (anInt8947 << 16);
			}
			if (anInt8945 < i_322_)
				i_313_ = ((anInt8945 << 16) - i_320_ + i_324_ - 1) / i_324_;
			if (anInt8950 < i_323_)
				i_314_ = ((anInt8950 << 16) - i_321_ + i_325_ - 1) / i_325_;
			int i_328_ = i + i_312_ * (aClass167_Sub1_8946.anInt8997 * -570111553);
			int i_329_ = aClass167_Sub1_8946.anInt8997 * -570111553 - i_313_;
			if (i_312_ + i_314_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_314_ -= (i_312_ + i_314_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i_312_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_330_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_312_;
				i_314_ -= i_330_;
				i_328_ += i_330_ * (aClass167_Sub1_8946.anInt8997 * -570111553);
				i_321_ += i_325_ * i_330_;
			}
			if (i + i_313_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_331_ = i + i_313_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_313_ -= i_331_;
				i_329_ += i_331_;
			}
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_332_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_313_ -= i_332_;
				i_328_ += i_332_;
				i_320_ += i_324_ * i_332_;
				i_329_ += i_332_;
			}
			float[] fs = aClass167_Sub1_8946.aFloatArray8999;
			int[] is = aClass167_Sub1_8946.anIntArray8996;
			if (i_317_ == 0) {
				if (i_315_ == 1) {
					int i_333_ = i_320_;
					for (int i_334_ = -i_314_; i_334_ < 0; i_334_++) {
						int i_335_ = (i_321_ >> 16) * anInt8945;
						for (int i_336_ = -i_313_; i_336_ < 0; i_336_++) {
							if (!bool_310_ || f < fs[i_328_]) {
								if (bool)
									is[i_328_] = (anIntArray11393[((aByteArray11394[(i_320_ >> 16) + i_335_]) & 0xff)]);
								if (bool_310_ && bool_319_)
									fs[i_328_] = f;
							}
							i_320_ += i_324_;
							i_328_++;
						}
						i_321_ += i_325_;
						i_320_ = i_333_;
						i_328_ += i_329_;
					}
				} else if (i_315_ == 0) {
					int i_337_ = (i_316_ & 0xff0000) >> 16;
					int i_338_ = (i_316_ & 0xff00) >> 8;
					int i_339_ = i_316_ & 0xff;
					int i_340_ = i_320_;
					for (int i_341_ = -i_314_; i_341_ < 0; i_341_++) {
						int i_342_ = (i_321_ >> 16) * anInt8945;
						for (int i_343_ = -i_313_; i_343_ < 0; i_343_++) {
							if (!bool_310_ || f < fs[i_328_]) {
								if (bool) {
									int i_344_ = (anIntArray11393[((aByteArray11394[(i_320_ >> 16) + i_342_]) & 0xff)]);
									int i_345_ = ((i_344_ & 0xff0000) * i_337_ & ~0xffffff);
									int i_346_ = ((i_344_ & 0xff00) * i_338_ & 0xff0000);
									int i_347_ = (i_344_ & 0xff) * i_339_ & 0xff00;
									is[i_328_] = (i_345_ | i_346_ | i_347_) >>> 8;
								}
								if (bool_310_ && bool_319_)
									fs[i_328_] = f;
							}
							i_320_ += i_324_;
							i_328_++;
						}
						i_321_ += i_325_;
						i_320_ = i_340_;
						i_328_ += i_329_;
					}
				} else if (i_315_ == 3) {
					int i_348_ = i_320_;
					for (int i_349_ = -i_314_; i_349_ < 0; i_349_++) {
						int i_350_ = (i_321_ >> 16) * anInt8945;
						for (int i_351_ = -i_313_; i_351_ < 0; i_351_++) {
							if (!bool_310_ || f < fs[i_328_]) {
								if (bool) {
									byte i_352_ = (aByteArray11394[(i_320_ >> 16) + i_350_]);
									int i_353_ = (i_352_ > 0 ? anIntArray11393[i_352_] : 0);
									int i_354_ = i_353_ + i_316_;
									int i_355_ = ((i_353_ & 0xff00ff) + (i_316_ & 0xff00ff));
									int i_356_ = ((i_355_ & 0x1000100) + (i_354_ - i_355_ & 0x10000));
									is[i_328_] = i_354_ - i_356_ | i_356_ - (i_356_ >>> 8);
								}
								if (bool_310_ && bool_319_)
									fs[i_328_] = f;
							}
							i_320_ += i_324_;
							i_328_++;
						}
						i_321_ += i_325_;
						i_320_ = i_348_;
						i_328_ += i_329_;
					}
				} else if (i_315_ == 2) {
					int i_357_ = i_316_ >>> 24;
					int i_358_ = 256 - i_357_;
					int i_359_ = (i_316_ & 0xff00ff) * i_358_ & ~0xff00ff;
					int i_360_ = (i_316_ & 0xff00) * i_358_ & 0xff0000;
					i_316_ = (i_359_ | i_360_) >>> 8;
					int i_361_ = i_320_;
					for (int i_362_ = -i_314_; i_362_ < 0; i_362_++) {
						int i_363_ = (i_321_ >> 16) * anInt8945;
						for (int i_364_ = -i_313_; i_364_ < 0; i_364_++) {
							if (!bool_310_ || f < fs[i_328_]) {
								if (bool) {
									int i_365_ = (anIntArray11393[((aByteArray11394[(i_320_ >> 16) + i_363_]) & 0xff)]);
									i_359_ = ((i_365_ & 0xff00ff) * i_357_ & ~0xff00ff);
									i_360_ = ((i_365_ & 0xff00) * i_357_ & 0xff0000);
									is[i_328_] = ((i_359_ | i_360_) >>> 8) + i_316_;
								}
								if (bool_310_ && bool_319_)
									fs[i_328_] = f;
							}
							i_320_ += i_324_;
							i_328_++;
						}
						i_321_ += i_325_;
						i_320_ = i_361_;
						i_328_ += i_329_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_317_ == 1) {
				if (i_315_ == 1) {
					int i_366_ = i_320_;
					for (int i_367_ = -i_314_; i_367_ < 0; i_367_++) {
						int i_368_ = (i_321_ >> 16) * anInt8945;
						for (int i_369_ = -i_313_; i_369_ < 0; i_369_++) {
							if (!bool_310_ || f < fs[i_328_]) {
								int i_370_ = aByteArray11394[(i_320_ >> 16) + i_368_];
								if (i_370_ != 0) {
									if (bool)
										is[i_328_] = anIntArray11393[i_370_ & 0xff];
									if (bool_310_ && bool_319_)
										fs[i_328_] = f;
								}
							}
							i_320_ += i_324_;
							i_328_++;
						}
						i_321_ += i_325_;
						i_320_ = i_366_;
						i_328_ += i_329_;
					}
				} else if (i_315_ == 0) {
					int i_371_ = i_320_;
					if ((i_316_ & 0xffffff) == 16777215) {
						int i_372_ = i_316_ >>> 24;
						int i_373_ = 256 - i_372_;
						for (int i_374_ = -i_314_; i_374_ < 0; i_374_++) {
							int i_375_ = (i_321_ >> 16) * anInt8945;
							for (int i_376_ = -i_313_; i_376_ < 0; i_376_++) {
								if (!bool_310_ || f < fs[i_328_]) {
									int i_377_ = (aByteArray11394[(i_320_ >> 16) + i_375_]);
									if (i_377_ != 0) {
										if (bool) {
											int i_378_ = (anIntArray11393[i_377_ & 0xff]);
											int i_379_ = is[i_328_];
											is[i_328_] = (((((i_378_ & 0xff00ff) * i_372_) + ((i_379_ & 0xff00ff) * i_373_)) & ~0xff00ff) + ((((i_378_ & 0xff00) * i_372_) + ((i_379_ & 0xff00) * i_373_)) & 0xff0000)) >> 8;
										}
										if (bool_310_ && bool_319_)
											fs[i_328_] = f;
									}
								}
								i_320_ += i_324_;
								i_328_++;
							}
							i_321_ += i_325_;
							i_320_ = i_371_;
							i_328_ += i_329_;
						}
					} else {
						int i_380_ = (i_316_ & 0xff0000) >> 16;
						int i_381_ = (i_316_ & 0xff00) >> 8;
						int i_382_ = i_316_ & 0xff;
						int i_383_ = i_316_ >>> 24;
						int i_384_ = 256 - i_383_;
						for (int i_385_ = -i_314_; i_385_ < 0; i_385_++) {
							int i_386_ = (i_321_ >> 16) * anInt8945;
							for (int i_387_ = -i_313_; i_387_ < 0; i_387_++) {
								if (!bool_310_ || f < fs[i_328_]) {
									int i_388_ = (aByteArray11394[(i_320_ >> 16) + i_386_]);
									if (i_388_ != 0) {
										int i_389_ = anIntArray11393[i_388_ & 0xff];
										if (i_383_ != 255) {
											if (bool) {
												int i_390_ = (((i_389_ & 0xff0000) * i_380_) & ~0xffffff);
												int i_391_ = (((i_389_ & 0xff00) * i_381_) & 0xff0000);
												int i_392_ = ((i_389_ & 0xff) * i_382_ & 0xff00);
												i_389_ = (i_390_ | i_391_ | i_392_) >>> 8;
												int i_393_ = is[i_328_];
												is[i_328_] = (((((i_389_ & 0xff00ff) * i_383_) + ((i_393_ & 0xff00ff) * i_384_)) & ~0xff00ff) + ((((i_389_ & 0xff00) * i_383_) + ((i_393_ & 0xff00) * i_384_)) & 0xff0000)) >> 8;
											}
											if (bool_310_ && bool_319_)
												fs[i_328_] = f;
										} else {
											if (bool) {
												int i_394_ = (((i_389_ & 0xff0000) * i_380_) & ~0xffffff);
												int i_395_ = (((i_389_ & 0xff00) * i_381_) & 0xff0000);
												int i_396_ = ((i_389_ & 0xff) * i_382_ & 0xff00);
												is[i_328_] = (i_394_ | i_395_ | i_396_) >>> 8;
											}
											if (bool_310_ && bool_319_)
												fs[i_328_] = f;
										}
									}
								}
								i_320_ += i_324_;
								i_328_++;
							}
							i_321_ += i_325_;
							i_320_ = i_371_;
							i_328_ += i_329_;
						}
					}
				} else if (i_315_ == 3) {
					int i_397_ = i_320_;
					int i_398_ = i_316_ >>> 24;
					int i_399_ = 256 - i_398_;
					for (int i_400_ = -i_314_; i_400_ < 0; i_400_++) {
						int i_401_ = (i_321_ >> 16) * anInt8945;
						for (int i_402_ = -i_313_; i_402_ < 0; i_402_++) {
							if (!bool_310_ || f < fs[i_328_]) {
								if (bool) {
									byte i_403_ = (aByteArray11394[(i_320_ >> 16) + i_401_]);
									int i_404_ = (i_403_ > 0 ? anIntArray11393[i_403_] : 0);
									int i_405_ = i_404_ + i_316_;
									int i_406_ = ((i_404_ & 0xff00ff) + (i_316_ & 0xff00ff));
									int i_407_ = ((i_406_ & 0x1000100) + (i_405_ - i_406_ & 0x10000));
									i_407_ = i_405_ - i_407_ | i_407_ - (i_407_ >>> 8);
									if (i_404_ == 0 && i_398_ != 255) {
										i_404_ = i_407_;
										i_407_ = is[i_328_];
										i_407_ = ((((i_404_ & 0xff00ff) * i_398_ + ((i_407_ & 0xff00ff) * i_399_)) & ~0xff00ff) + (((i_404_ & 0xff00) * i_398_ + ((i_407_ & 0xff00) * i_399_)) & 0xff0000)) >> 8;
									}
									is[i_328_] = i_407_;
								}
								if (bool_310_ && bool_319_)
									fs[i_328_] = f;
							}
							i_320_ += i_324_;
							i_328_++;
						}
						i_321_ += i_325_;
						i_320_ = i_397_;
						i_328_ += i_329_;
					}
				} else if (i_315_ == 2) {
					int i_408_ = i_316_ >>> 24;
					int i_409_ = 256 - i_408_;
					int i_410_ = (i_316_ & 0xff00ff) * i_409_ & ~0xff00ff;
					int i_411_ = (i_316_ & 0xff00) * i_409_ & 0xff0000;
					i_316_ = (i_410_ | i_411_) >>> 8;
					int i_412_ = i_320_;
					for (int i_413_ = -i_314_; i_413_ < 0; i_413_++) {
						int i_414_ = (i_321_ >> 16) * anInt8945;
						for (int i_415_ = -i_313_; i_415_ < 0; i_415_++) {
							if (!bool_310_ || f < fs[i_328_]) {
								int i_416_ = aByteArray11394[(i_320_ >> 16) + i_414_];
								if (i_416_ != 0) {
									if (bool) {
										int i_417_ = anIntArray11393[i_416_ & 0xff];
										i_410_ = ((i_417_ & 0xff00ff) * i_408_ & ~0xff00ff);
										i_411_ = ((i_417_ & 0xff00) * i_408_ & 0xff0000);
										is[i_328_] = (((i_410_ | i_411_) >>> 8) + i_316_);
									}
									if (bool_310_ && bool_319_)
										fs[i_328_] = f;
								}
							}
							i_320_ += i_324_;
							i_328_++;
						}
						i_321_ += i_325_;
						i_320_ = i_412_;
						i_328_ += i_329_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_317_ == 2) {
				if (i_315_ == 1) {
					int i_418_ = i_320_;
					for (int i_419_ = -i_314_; i_419_ < 0; i_419_++) {
						int i_420_ = (i_321_ >> 16) * anInt8945;
						for (int i_421_ = -i_313_; i_421_ < 0; i_421_++) {
							if (!bool_310_ || f < fs[i_328_]) {
								int i_422_ = aByteArray11394[(i_320_ >> 16) + i_420_];
								if (i_422_ != 0) {
									if (bool) {
										int i_423_ = anIntArray11393[i_422_ & 0xff];
										int i_424_ = is[i_328_];
										int i_425_ = i_423_ + i_424_;
										int i_426_ = ((i_423_ & 0xff00ff) + (i_424_ & 0xff00ff));
										i_424_ = ((i_426_ & 0x1000100) + (i_425_ - i_426_ & 0x10000));
										is[i_328_] = (i_425_ - i_424_ | i_424_ - (i_424_ >>> 8));
									}
									if (bool_310_ && bool_319_)
										fs[i_328_] = f;
								}
							}
							i_320_ += i_324_;
							i_328_++;
						}
						i_321_ += i_325_;
						i_320_ = i_418_;
						i_328_ += i_329_;
					}
				} else if (i_315_ == 0) {
					int i_427_ = i_320_;
					int i_428_ = (i_316_ & 0xff0000) >> 16;
					int i_429_ = (i_316_ & 0xff00) >> 8;
					int i_430_ = i_316_ & 0xff;
					for (int i_431_ = -i_314_; i_431_ < 0; i_431_++) {
						int i_432_ = (i_321_ >> 16) * anInt8945;
						for (int i_433_ = -i_313_; i_433_ < 0; i_433_++) {
							if (!bool_310_ || f < fs[i_328_]) {
								int i_434_ = aByteArray11394[(i_320_ >> 16) + i_432_];
								if (i_434_ != 0) {
									if (bool) {
										int i_435_ = anIntArray11393[i_434_ & 0xff];
										int i_436_ = ((i_435_ & 0xff0000) * i_428_ & ~0xffffff);
										int i_437_ = ((i_435_ & 0xff00) * i_429_ & 0xff0000);
										int i_438_ = ((i_435_ & 0xff) * i_430_ & 0xff00);
										i_435_ = (i_436_ | i_437_ | i_438_) >>> 8;
										int i_439_ = is[i_328_];
										int i_440_ = i_435_ + i_439_;
										int i_441_ = ((i_435_ & 0xff00ff) + (i_439_ & 0xff00ff));
										i_439_ = ((i_441_ & 0x1000100) + (i_440_ - i_441_ & 0x10000));
										is[i_328_] = (i_440_ - i_439_ | i_439_ - (i_439_ >>> 8));
									}
									if (bool_310_ && bool_319_)
										fs[i_328_] = f;
								}
							}
							i_320_ += i_324_;
							i_328_++;
						}
						i_321_ += i_325_;
						i_320_ = i_427_;
						i_328_ += i_329_;
					}
				} else if (i_315_ == 3) {
					int i_442_ = i_320_;
					for (int i_443_ = -i_314_; i_443_ < 0; i_443_++) {
						int i_444_ = (i_321_ >> 16) * anInt8945;
						for (int i_445_ = -i_313_; i_445_ < 0; i_445_++) {
							if (!bool_310_ || f < fs[i_328_]) {
								if (bool) {
									byte i_446_ = (aByteArray11394[(i_320_ >> 16) + i_444_]);
									int i_447_ = (i_446_ > 0 ? anIntArray11393[i_446_] : 0);
									int i_448_ = i_447_ + i_316_;
									int i_449_ = ((i_447_ & 0xff00ff) + (i_316_ & 0xff00ff));
									int i_450_ = ((i_449_ & 0x1000100) + (i_448_ - i_449_ & 0x10000));
									i_447_ = i_448_ - i_450_ | i_450_ - (i_450_ >>> 8);
									i_450_ = is[i_328_];
									i_448_ = i_447_ + i_450_;
									i_449_ = (i_447_ & 0xff00ff) + (i_450_ & 0xff00ff);
									i_450_ = ((i_449_ & 0x1000100) + (i_448_ - i_449_ & 0x10000));
									is[i_328_] = i_448_ - i_450_ | i_450_ - (i_450_ >>> 8);
								}
								if (bool_310_ && bool_319_)
									fs[i_328_] = f;
							}
							i_320_ += i_324_;
							i_328_++;
						}
						i_321_ += i_325_;
						i_320_ = i_442_;
						i_328_ += i_329_;
					}
				} else if (i_315_ == 2) {
					int i_451_ = i_316_ >>> 24;
					int i_452_ = 256 - i_451_;
					int i_453_ = (i_316_ & 0xff00ff) * i_452_ & ~0xff00ff;
					int i_454_ = (i_316_ & 0xff00) * i_452_ & 0xff0000;
					i_316_ = (i_453_ | i_454_) >>> 8;
					int i_455_ = i_320_;
					for (int i_456_ = -i_314_; i_456_ < 0; i_456_++) {
						int i_457_ = (i_321_ >> 16) * anInt8945;
						for (int i_458_ = -i_313_; i_458_ < 0; i_458_++) {
							if (!bool_310_ || f < fs[i_328_]) {
								int i_459_ = aByteArray11394[(i_320_ >> 16) + i_457_];
								if (i_459_ != 0) {
									if (bool) {
										int i_460_ = anIntArray11393[i_459_ & 0xff];
										i_453_ = ((i_460_ & 0xff00ff) * i_451_ & ~0xff00ff);
										i_454_ = ((i_460_ & 0xff00) * i_451_ & 0xff0000);
										i_460_ = (((i_453_ | i_454_) >>> 8) + i_316_);
										int i_461_ = is[i_328_];
										int i_462_ = i_460_ + i_461_;
										int i_463_ = ((i_460_ & 0xff00ff) + (i_461_ & 0xff00ff));
										i_461_ = ((i_463_ & 0x1000100) + (i_462_ - i_463_ & 0x10000));
										is[i_328_] = (i_462_ - i_461_ | i_461_ - (i_461_ >>> 8));
									}
									if (bool_310_ && bool_319_)
										fs[i_328_] = f;
								}
							}
							i_320_ += i_324_;
							i_328_++;
						}
						i_321_ += i_325_;
						i_320_ = i_455_;
						i_328_ += i_329_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method1732(int i, int i_464_, int i_465_, int i_466_, int i_467_, int i_468_, int i_469_, int i_470_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		if (i_465_ > 0 && i_466_ > 0) {
			int[] is = aClass167_Sub1_8946.anIntArray8996;
			if (is != null) {
				int i_471_ = 0;
				int i_472_ = 0;
				int i_473_ = aClass167_Sub1_8946.anInt8997 * -570111553;
				int i_474_ = anInt8977 + anInt8945 + anInt8948;
				int i_475_ = anInt8947 + anInt8950 + anInt8952;
				int i_476_ = (i_474_ << 16) / i_465_;
				int i_477_ = (i_475_ << 16) / i_466_;
				if (anInt8977 > 0) {
					int i_478_ = ((anInt8977 << 16) + i_476_ - 1) / i_476_;
					i += i_478_;
					i_471_ += i_478_ * i_476_ - (anInt8977 << 16);
				}
				if (anInt8947 > 0) {
					int i_479_ = ((anInt8947 << 16) + i_477_ - 1) / i_477_;
					i_464_ += i_479_;
					i_472_ += i_479_ * i_477_ - (anInt8947 << 16);
				}
				if (anInt8945 < i_474_)
					i_465_ = ((anInt8945 << 16) - i_471_ + i_476_ - 1) / i_476_;
				if (anInt8950 < i_475_)
					i_466_ = ((anInt8950 << 16) - i_472_ + i_477_ - 1) / i_477_;
				int i_480_ = i + i_464_ * i_473_;
				int i_481_ = i_473_ - i_465_;
				if (i_464_ + i_466_ > aClass167_Sub1_8946.anInt9003 * -148513205)
					i_466_ -= (i_464_ + i_466_ - aClass167_Sub1_8946.anInt9003 * -148513205);
				if (i_464_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
					int i_482_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_464_;
					i_466_ -= i_482_;
					i_480_ += i_482_ * i_473_;
					i_472_ += i_477_ * i_482_;
				}
				if (i + i_465_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
					int i_483_ = (i + i_465_ - aClass167_Sub1_8946.anInt9001 * 2024498147);
					i_465_ -= i_483_;
					i_481_ += i_483_;
				}
				if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
					int i_484_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
					i_465_ -= i_484_;
					i_480_ += i_484_;
					i_471_ += i_476_ * i_484_;
					i_481_ += i_484_;
				}
				if (i_469_ == 0) {
					if (i_467_ == 1) {
						int i_485_ = i_471_;
						for (int i_486_ = -i_466_; i_486_ < 0; i_486_++) {
							int i_487_ = (i_472_ >> 16) * anInt8945;
							for (int i_488_ = -i_465_; i_488_ < 0; i_488_++) {
								is[i_480_++] = (anIntArray11393[(aByteArray11394[(i_471_ >> 16) + i_487_]) & 0xff]);
								i_471_ += i_476_;
							}
							i_472_ += i_477_;
							i_471_ = i_485_;
							i_480_ += i_481_;
						}
					} else if (i_467_ == 0) {
						int i_489_ = (i_468_ & 0xff0000) >> 16;
						int i_490_ = (i_468_ & 0xff00) >> 8;
						int i_491_ = i_468_ & 0xff;
						int i_492_ = i_471_;
						for (int i_493_ = -i_466_; i_493_ < 0; i_493_++) {
							int i_494_ = (i_472_ >> 16) * anInt8945;
							for (int i_495_ = -i_465_; i_495_ < 0; i_495_++) {
								int i_496_ = (anIntArray11393[(aByteArray11394[(i_471_ >> 16) + i_494_]) & 0xff]);
								int i_497_ = (i_496_ & 0xff0000) * i_489_ & ~0xffffff;
								int i_498_ = (i_496_ & 0xff00) * i_490_ & 0xff0000;
								int i_499_ = (i_496_ & 0xff) * i_491_ & 0xff00;
								is[i_480_++] = (i_497_ | i_498_ | i_499_) >>> 8;
								i_471_ += i_476_;
							}
							i_472_ += i_477_;
							i_471_ = i_492_;
							i_480_ += i_481_;
						}
					} else if (i_467_ == 3) {
						int i_500_ = i_471_;
						for (int i_501_ = -i_466_; i_501_ < 0; i_501_++) {
							int i_502_ = (i_472_ >> 16) * anInt8945;
							for (int i_503_ = -i_465_; i_503_ < 0; i_503_++) {
								byte i_504_ = aByteArray11394[(i_471_ >> 16) + i_502_];
								int i_505_ = i_504_ > 0 ? anIntArray11393[i_504_] : 0;
								int i_506_ = i_505_ + i_468_;
								int i_507_ = ((i_505_ & 0xff00ff) + (i_468_ & 0xff00ff));
								int i_508_ = ((i_507_ & 0x1000100) + (i_506_ - i_507_ & 0x10000));
								is[i_480_++] = i_506_ - i_508_ | i_508_ - (i_508_ >>> 8);
								i_471_ += i_476_;
							}
							i_472_ += i_477_;
							i_471_ = i_500_;
							i_480_ += i_481_;
						}
					} else if (i_467_ == 2) {
						int i_509_ = i_468_ >>> 24;
						int i_510_ = 256 - i_509_;
						int i_511_ = (i_468_ & 0xff00ff) * i_510_ & ~0xff00ff;
						int i_512_ = (i_468_ & 0xff00) * i_510_ & 0xff0000;
						i_468_ = (i_511_ | i_512_) >>> 8;
						int i_513_ = i_471_;
						for (int i_514_ = -i_466_; i_514_ < 0; i_514_++) {
							int i_515_ = (i_472_ >> 16) * anInt8945;
							for (int i_516_ = -i_465_; i_516_ < 0; i_516_++) {
								int i_517_ = (anIntArray11393[(aByteArray11394[(i_471_ >> 16) + i_515_]) & 0xff]);
								i_511_ = (i_517_ & 0xff00ff) * i_509_ & ~0xff00ff;
								i_512_ = (i_517_ & 0xff00) * i_509_ & 0xff0000;
								is[i_480_++] = ((i_511_ | i_512_) >>> 8) + i_468_;
								i_471_ += i_476_;
							}
							i_472_ += i_477_;
							i_471_ = i_513_;
							i_480_ += i_481_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_469_ == 1) {
					if (i_467_ == 1) {
						int i_518_ = i_471_;
						for (int i_519_ = -i_466_; i_519_ < 0; i_519_++) {
							int i_520_ = (i_472_ >> 16) * anInt8945;
							for (int i_521_ = -i_465_; i_521_ < 0; i_521_++) {
								int i_522_ = aByteArray11394[(i_471_ >> 16) + i_520_];
								if (i_522_ != 0)
									is[i_480_++] = anIntArray11393[i_522_ & 0xff];
								else
									i_480_++;
								i_471_ += i_476_;
							}
							i_472_ += i_477_;
							i_471_ = i_518_;
							i_480_ += i_481_;
						}
					} else if (i_467_ == 0) {
						int i_523_ = i_471_;
						if ((i_468_ & 0xffffff) == 16777215) {
							int i_524_ = i_468_ >>> 24;
							int i_525_ = 256 - i_524_;
							for (int i_526_ = -i_466_; i_526_ < 0; i_526_++) {
								int i_527_ = (i_472_ >> 16) * anInt8945;
								for (int i_528_ = -i_465_; i_528_ < 0; i_528_++) {
									int i_529_ = (aByteArray11394[(i_471_ >> 16) + i_527_]);
									if (i_529_ != 0) {
										int i_530_ = anIntArray11393[i_529_ & 0xff];
										int i_531_ = is[i_480_];
										is[i_480_++] = ((((i_530_ & 0xff00ff) * i_524_ + ((i_531_ & 0xff00ff) * i_525_)) & ~0xff00ff) + (((i_530_ & 0xff00) * i_524_ + ((i_531_ & 0xff00) * i_525_)) & 0xff0000)) >> 8;
									} else
										i_480_++;
									i_471_ += i_476_;
								}
								i_472_ += i_477_;
								i_471_ = i_523_;
								i_480_ += i_481_;
							}
						} else {
							int i_532_ = (i_468_ & 0xff0000) >> 16;
							int i_533_ = (i_468_ & 0xff00) >> 8;
							int i_534_ = i_468_ & 0xff;
							int i_535_ = i_468_ >>> 24;
							int i_536_ = 256 - i_535_;
							for (int i_537_ = -i_466_; i_537_ < 0; i_537_++) {
								int i_538_ = (i_472_ >> 16) * anInt8945;
								for (int i_539_ = -i_465_; i_539_ < 0; i_539_++) {
									int i_540_ = (aByteArray11394[(i_471_ >> 16) + i_538_]);
									if (i_540_ != 0) {
										int i_541_ = anIntArray11393[i_540_ & 0xff];
										if (i_535_ != 255) {
											int i_542_ = ((i_541_ & 0xff0000) * i_532_ & ~0xffffff);
											int i_543_ = ((i_541_ & 0xff00) * i_533_ & 0xff0000);
											int i_544_ = ((i_541_ & 0xff) * i_534_ & 0xff00);
											i_541_ = (i_542_ | i_543_ | i_544_) >>> 8;
											int i_545_ = is[i_480_];
											is[i_480_++] = (((((i_541_ & 0xff00ff) * i_535_) + ((i_545_ & 0xff00ff) * i_536_)) & ~0xff00ff) + ((((i_541_ & 0xff00) * i_535_) + ((i_545_ & 0xff00) * i_536_)) & 0xff0000)) >> 8;
										} else {
											int i_546_ = ((i_541_ & 0xff0000) * i_532_ & ~0xffffff);
											int i_547_ = ((i_541_ & 0xff00) * i_533_ & 0xff0000);
											int i_548_ = ((i_541_ & 0xff) * i_534_ & 0xff00);
											is[i_480_++] = (i_546_ | i_547_ | i_548_) >>> 8;
										}
									} else
										i_480_++;
									i_471_ += i_476_;
								}
								i_472_ += i_477_;
								i_471_ = i_523_;
								i_480_ += i_481_;
							}
						}
					} else if (i_467_ == 3) {
						int i_549_ = i_471_;
						int i_550_ = i_468_ >>> 24;
						int i_551_ = 256 - i_550_;
						for (int i_552_ = -i_466_; i_552_ < 0; i_552_++) {
							int i_553_ = (i_472_ >> 16) * anInt8945;
							for (int i_554_ = -i_465_; i_554_ < 0; i_554_++) {
								byte i_555_ = aByteArray11394[(i_471_ >> 16) + i_553_];
								int i_556_ = i_555_ > 0 ? anIntArray11393[i_555_] : 0;
								int i_557_ = i_556_ + i_468_;
								int i_558_ = ((i_556_ & 0xff00ff) + (i_468_ & 0xff00ff));
								int i_559_ = ((i_558_ & 0x1000100) + (i_557_ - i_558_ & 0x10000));
								i_559_ = i_557_ - i_559_ | i_559_ - (i_559_ >>> 8);
								if (i_556_ == 0 && i_550_ != 255) {
									i_556_ = i_559_;
									i_559_ = is[i_480_];
									i_559_ = ((((i_556_ & 0xff00ff) * i_550_ + (i_559_ & 0xff00ff) * i_551_) & ~0xff00ff) + (((i_556_ & 0xff00) * i_550_ + (i_559_ & 0xff00) * i_551_) & 0xff0000)) >> 8;
								}
								is[i_480_++] = i_559_;
								i_471_ += i_476_;
							}
							i_472_ += i_477_;
							i_471_ = i_549_;
							i_480_ += i_481_;
						}
					} else if (i_467_ == 2) {
						int i_560_ = i_468_ >>> 24;
						int i_561_ = 256 - i_560_;
						int i_562_ = (i_468_ & 0xff00ff) * i_561_ & ~0xff00ff;
						int i_563_ = (i_468_ & 0xff00) * i_561_ & 0xff0000;
						i_468_ = (i_562_ | i_563_) >>> 8;
						int i_564_ = i_471_;
						for (int i_565_ = -i_466_; i_565_ < 0; i_565_++) {
							int i_566_ = (i_472_ >> 16) * anInt8945;
							for (int i_567_ = -i_465_; i_567_ < 0; i_567_++) {
								int i_568_ = aByteArray11394[(i_471_ >> 16) + i_566_];
								if (i_568_ != 0) {
									int i_569_ = anIntArray11393[i_568_ & 0xff];
									i_562_ = ((i_569_ & 0xff00ff) * i_560_ & ~0xff00ff);
									i_563_ = ((i_569_ & 0xff00) * i_560_ & 0xff0000);
									is[i_480_++] = ((i_562_ | i_563_) >>> 8) + i_468_;
								} else
									i_480_++;
								i_471_ += i_476_;
							}
							i_472_ += i_477_;
							i_471_ = i_564_;
							i_480_ += i_481_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_469_ == 2) {
					if (i_467_ == 1) {
						int i_570_ = i_471_;
						for (int i_571_ = -i_466_; i_571_ < 0; i_571_++) {
							int i_572_ = (i_472_ >> 16) * anInt8945;
							for (int i_573_ = -i_465_; i_573_ < 0; i_573_++) {
								int i_574_ = aByteArray11394[(i_471_ >> 16) + i_572_];
								if (i_574_ != 0) {
									int i_575_ = anIntArray11393[i_574_ & 0xff];
									int i_576_ = is[i_480_];
									int i_577_ = i_575_ + i_576_;
									int i_578_ = ((i_575_ & 0xff00ff) + (i_576_ & 0xff00ff));
									i_576_ = ((i_578_ & 0x1000100) + (i_577_ - i_578_ & 0x10000));
									is[i_480_++] = i_577_ - i_576_ | i_576_ - (i_576_ >>> 8);
								} else
									i_480_++;
								i_471_ += i_476_;
							}
							i_472_ += i_477_;
							i_471_ = i_570_;
							i_480_ += i_481_;
						}
					} else if (i_467_ == 0) {
						int i_579_ = i_471_;
						int i_580_ = (i_468_ & 0xff0000) >> 16;
						int i_581_ = (i_468_ & 0xff00) >> 8;
						int i_582_ = i_468_ & 0xff;
						for (int i_583_ = -i_466_; i_583_ < 0; i_583_++) {
							int i_584_ = (i_472_ >> 16) * anInt8945;
							for (int i_585_ = -i_465_; i_585_ < 0; i_585_++) {
								int i_586_ = aByteArray11394[(i_471_ >> 16) + i_584_];
								if (i_586_ != 0) {
									int i_587_ = anIntArray11393[i_586_ & 0xff];
									int i_588_ = ((i_587_ & 0xff0000) * i_580_ & ~0xffffff);
									int i_589_ = ((i_587_ & 0xff00) * i_581_ & 0xff0000);
									int i_590_ = (i_587_ & 0xff) * i_582_ & 0xff00;
									i_587_ = (i_588_ | i_589_ | i_590_) >>> 8;
									int i_591_ = is[i_480_];
									int i_592_ = i_587_ + i_591_;
									int i_593_ = ((i_587_ & 0xff00ff) + (i_591_ & 0xff00ff));
									i_591_ = ((i_593_ & 0x1000100) + (i_592_ - i_593_ & 0x10000));
									is[i_480_++] = i_592_ - i_591_ | i_591_ - (i_591_ >>> 8);
								} else
									i_480_++;
								i_471_ += i_476_;
							}
							i_472_ += i_477_;
							i_471_ = i_579_;
							i_480_ += i_481_;
						}
					} else if (i_467_ == 3) {
						int i_594_ = i_471_;
						for (int i_595_ = -i_466_; i_595_ < 0; i_595_++) {
							int i_596_ = (i_472_ >> 16) * anInt8945;
							for (int i_597_ = -i_465_; i_597_ < 0; i_597_++) {
								byte i_598_ = aByteArray11394[(i_471_ >> 16) + i_596_];
								int i_599_ = i_598_ > 0 ? anIntArray11393[i_598_] : 0;
								int i_600_ = i_599_ + i_468_;
								int i_601_ = ((i_599_ & 0xff00ff) + (i_468_ & 0xff00ff));
								int i_602_ = ((i_601_ & 0x1000100) + (i_600_ - i_601_ & 0x10000));
								i_599_ = i_600_ - i_602_ | i_602_ - (i_602_ >>> 8);
								i_602_ = is[i_480_];
								i_600_ = i_599_ + i_602_;
								i_601_ = (i_599_ & 0xff00ff) + (i_602_ & 0xff00ff);
								i_602_ = (i_601_ & 0x1000100) + (i_600_ - i_601_ & 0x10000);
								is[i_480_++] = i_600_ - i_602_ | i_602_ - (i_602_ >>> 8);
								i_471_ += i_476_;
							}
							i_472_ += i_477_;
							i_471_ = i_594_;
							i_480_ += i_481_;
						}
					} else if (i_467_ == 2) {
						int i_603_ = i_468_ >>> 24;
						int i_604_ = 256 - i_603_;
						int i_605_ = (i_468_ & 0xff00ff) * i_604_ & ~0xff00ff;
						int i_606_ = (i_468_ & 0xff00) * i_604_ & 0xff0000;
						i_468_ = (i_605_ | i_606_) >>> 8;
						int i_607_ = i_471_;
						for (int i_608_ = -i_466_; i_608_ < 0; i_608_++) {
							int i_609_ = (i_472_ >> 16) * anInt8945;
							for (int i_610_ = -i_465_; i_610_ < 0; i_610_++) {
								int i_611_ = aByteArray11394[(i_471_ >> 16) + i_609_];
								if (i_611_ != 0) {
									int i_612_ = anIntArray11393[i_611_ & 0xff];
									i_605_ = ((i_612_ & 0xff00ff) * i_603_ & ~0xff00ff);
									i_606_ = ((i_612_ & 0xff00) * i_603_ & 0xff0000);
									i_612_ = ((i_605_ | i_606_) >>> 8) + i_468_;
									int i_613_ = is[i_480_];
									int i_614_ = i_612_ + i_613_;
									int i_615_ = ((i_612_ & 0xff00ff) + (i_613_ & 0xff00ff));
									i_613_ = ((i_615_ & 0x1000100) + (i_614_ - i_615_ & 0x10000));
									is[i_480_++] = i_614_ - i_613_ | i_613_ - (i_613_ >>> 8);
								} else
									i_480_++;
								i_471_ += i_476_;
							}
							i_472_ += i_477_;
							i_471_ = i_607_;
							i_480_ += i_481_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method8437(int i, int i_616_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_617_ = anInt8957;
					while (i_617_ < 0) {
						int i_618_ = anInt8959;
						int i_619_ = anInt8966;
						int i_620_ = anInt8967;
						int i_621_ = anInt8955;
						if (i_619_ >= 0 && i_620_ >= 0 && i_619_ - (anInt8945 << 12) < 0 && i_620_ - (anInt8950 << 12) < 0) {
							for (/**/; i_621_ < 0; i_621_++) {
								int i_622_ = ((i_620_ >> 12) * anInt8945 + (i_619_ >> 12));
								int i_623_ = i_618_++;
								if (i_616_ == 0) {
									if (i == 1)
										is[i_623_] = (anIntArray11393[(aByteArray11394[i_622_] & 0xff)]);
									else if (i == 0) {
										int i_624_ = (anIntArray11393[(aByteArray11394[i_622_] & 0xff)]);
										int i_625_ = ((i_624_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_626_ = ((i_624_ & 0xff00) * anInt8974 & 0xff0000);
										int i_627_ = ((i_624_ & 0xff) * anInt8975 & 0xff00);
										is[i_623_] = (i_625_ | i_626_ | i_627_) >>> 8;
									} else if (i == 3) {
										int i_628_ = (anIntArray11393[(aByteArray11394[i_622_] & 0xff)]);
										int i_629_ = anInt8944;
										int i_630_ = i_628_ + i_629_;
										int i_631_ = ((i_628_ & 0xff00ff) + (i_629_ & 0xff00ff));
										int i_632_ = ((i_631_ & 0x1000100) + (i_630_ - i_631_ & 0x10000));
										is[i_623_] = (i_630_ - i_632_ | i_632_ - (i_632_ >>> 8));
									} else if (i == 2) {
										int i_633_ = (anIntArray11393[(aByteArray11394[i_622_] & 0xff)]);
										int i_634_ = ((i_633_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_635_ = ((i_633_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_623_] = (((i_634_ | i_635_) >>> 8) + anInt8978);
									} else
										throw new IllegalArgumentException();
								} else if (i_616_ == 1) {
									if (i == 1) {
										int i_636_ = aByteArray11394[i_622_];
										if (i_636_ != 0)
											is[i_623_] = (anIntArray11393[i_636_ & 0xff]);
									} else if (i == 0) {
										int i_637_ = aByteArray11394[i_622_];
										if (i_637_ != 0) {
											int i_638_ = (anIntArray11393[i_637_ & 0xff]);
											if ((anInt8944 & 0xffffff) == 16777215) {
												int i_639_ = anInt8944 >>> 24;
												int i_640_ = 256 - i_639_;
												int i_641_ = is[i_623_];
												is[i_623_] = (((((i_638_ & 0xff00ff) * i_639_) + ((i_641_ & 0xff00ff) * i_640_)) & ~0xff00ff) + ((((i_638_ & 0xff00) * i_639_) + ((i_641_ & 0xff00) * i_640_)) & 0xff0000)) >> 8;
											} else if (anInt8965 != 255) {
												int i_642_ = (((i_638_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_643_ = (((i_638_ & 0xff00) * anInt8974) & 0xff0000);
												int i_644_ = (((i_638_ & 0xff) * anInt8975) & 0xff00);
												i_638_ = (i_642_ | i_643_ | i_644_) >>> 8;
												int i_645_ = is[i_623_];
												is[i_623_] = (((((i_638_ & 0xff00ff) * anInt8965) + ((i_645_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_638_ & 0xff00) * anInt8965) + ((i_645_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
											} else {
												int i_646_ = (((i_638_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_647_ = (((i_638_ & 0xff00) * anInt8974) & 0xff0000);
												int i_648_ = (((i_638_ & 0xff) * anInt8975) & 0xff00);
												is[i_623_] = (i_646_ | i_647_ | i_648_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_649_ = aByteArray11394[i_622_];
										int i_650_ = (i_649_ > 0 ? anIntArray11393[i_649_] : 0);
										int i_651_ = anInt8944;
										int i_652_ = i_650_ + i_651_;
										int i_653_ = ((i_650_ & 0xff00ff) + (i_651_ & 0xff00ff));
										int i_654_ = ((i_653_ & 0x1000100) + (i_652_ - i_653_ & 0x10000));
										i_654_ = (i_652_ - i_654_ | i_654_ - (i_654_ >>> 8));
										if (i_650_ == 0 && anInt8965 != 255) {
											i_650_ = i_654_;
											i_654_ = is[i_623_];
											i_654_ = (((((i_650_ & 0xff00ff) * anInt8965) + ((i_654_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_650_ & 0xff00) * anInt8965) + ((i_654_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_623_] = i_654_;
									} else if (i == 2) {
										int i_655_ = aByteArray11394[i_622_];
										if (i_655_ != 0) {
											int i_656_ = (anIntArray11393[i_655_ & 0xff]);
											int i_657_ = (((i_656_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_658_ = (((i_656_ & 0xff00) * anInt8965) & 0xff0000);
											is[i_623_++] = ((i_657_ | i_658_) >>> 8) + anInt8978;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_616_ == 2) {
									if (i == 1) {
										int i_659_ = aByteArray11394[i_622_];
										if (i_659_ != 0) {
											int i_660_ = (anIntArray11393[i_659_ & 0xff]);
											int i_661_ = is[i_623_];
											int i_662_ = i_660_ + i_661_;
											int i_663_ = ((i_660_ & 0xff00ff) + (i_661_ & 0xff00ff));
											i_661_ = ((i_663_ & 0x1000100) + (i_662_ - i_663_ & 0x10000));
											is[i_623_] = (i_662_ - i_661_ | i_661_ - (i_661_ >>> 8));
										}
									} else if (i == 0) {
										int i_664_ = aByteArray11394[i_622_];
										if (i_664_ != 0) {
											int i_665_ = (anIntArray11393[i_664_ & 0xff]);
											int i_666_ = (((i_665_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_667_ = (((i_665_ & 0xff00) * anInt8974) & 0xff0000);
											int i_668_ = ((i_665_ & 0xff) * anInt8975 & 0xff00);
											i_665_ = (i_666_ | i_667_ | i_668_) >>> 8;
											int i_669_ = is[i_623_];
											int i_670_ = i_665_ + i_669_;
											int i_671_ = ((i_665_ & 0xff00ff) + (i_669_ & 0xff00ff));
											i_669_ = ((i_671_ & 0x1000100) + (i_670_ - i_671_ & 0x10000));
											is[i_623_] = (i_670_ - i_669_ | i_669_ - (i_669_ >>> 8));
										}
									} else if (i == 3) {
										byte i_672_ = aByteArray11394[i_622_];
										int i_673_ = (i_672_ > 0 ? anIntArray11393[i_672_] : 0);
										int i_674_ = anInt8944;
										int i_675_ = i_673_ + i_674_;
										int i_676_ = ((i_673_ & 0xff00ff) + (i_674_ & 0xff00ff));
										int i_677_ = ((i_676_ & 0x1000100) + (i_675_ - i_676_ & 0x10000));
										i_677_ = (i_675_ - i_677_ | i_677_ - (i_677_ >>> 8));
										if (i_673_ == 0 && anInt8965 != 255) {
											i_673_ = i_677_;
											i_677_ = is[i_623_];
											i_677_ = (((((i_673_ & 0xff00ff) * anInt8965) + ((i_677_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_673_ & 0xff00) * anInt8965) + ((i_677_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_623_] = i_677_;
									} else if (i == 2) {
										int i_678_ = aByteArray11394[i_622_];
										if (i_678_ != 0) {
											int i_679_ = (anIntArray11393[i_678_ & 0xff]);
											int i_680_ = (((i_679_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_681_ = (((i_679_ & 0xff00) * anInt8965) & 0xff0000);
											i_679_ = (((i_680_ | i_681_) >>> 8) + anInt8978);
											int i_682_ = is[i_623_];
											int i_683_ = i_679_ + i_682_;
											int i_684_ = ((i_679_ & 0xff00ff) + (i_682_ & 0xff00ff));
											i_682_ = ((i_684_ & 0x1000100) + (i_683_ - i_684_ & 0x10000));
											is[i_623_] = (i_683_ - i_682_ | i_682_ - (i_682_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_617_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_685_ = anInt8957;
					while (i_685_ < 0) {
						int i_686_ = anInt8959;
						int i_687_ = anInt8966;
						int i_688_ = anInt8967 + anInt8969;
						int i_689_ = anInt8955;
						if (i_687_ >= 0 && i_687_ - (anInt8945 << 12) < 0) {
							int i_690_;
							if ((i_690_ = i_688_ - (anInt8950 << 12)) >= 0) {
								i_690_ = (anInt8962 - i_690_) / anInt8962;
								i_689_ += i_690_;
								i_688_ += anInt8962 * i_690_;
								i_686_ += i_690_;
							}
							if ((i_690_ = (i_688_ - anInt8962) / anInt8962) > i_689_)
								i_689_ = i_690_;
							for (/**/; i_689_ < 0; i_689_++) {
								int i_691_ = ((i_688_ >> 12) * anInt8945 + (i_687_ >> 12));
								int i_692_ = i_686_++;
								if (i_616_ == 0) {
									if (i == 1)
										is[i_692_] = (anIntArray11393[(aByteArray11394[i_691_] & 0xff)]);
									else if (i == 0) {
										int i_693_ = (anIntArray11393[(aByteArray11394[i_691_] & 0xff)]);
										int i_694_ = ((i_693_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_695_ = ((i_693_ & 0xff00) * anInt8974 & 0xff0000);
										int i_696_ = ((i_693_ & 0xff) * anInt8975 & 0xff00);
										is[i_692_] = (i_694_ | i_695_ | i_696_) >>> 8;
									} else if (i == 3) {
										int i_697_ = (anIntArray11393[(aByteArray11394[i_691_] & 0xff)]);
										int i_698_ = anInt8944;
										int i_699_ = i_697_ + i_698_;
										int i_700_ = ((i_697_ & 0xff00ff) + (i_698_ & 0xff00ff));
										int i_701_ = ((i_700_ & 0x1000100) + (i_699_ - i_700_ & 0x10000));
										is[i_692_] = (i_699_ - i_701_ | i_701_ - (i_701_ >>> 8));
									} else if (i == 2) {
										int i_702_ = (anIntArray11393[(aByteArray11394[i_691_] & 0xff)]);
										int i_703_ = ((i_702_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_704_ = ((i_702_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_692_] = (((i_703_ | i_704_) >>> 8) + anInt8978);
									} else
										throw new IllegalArgumentException();
								} else if (i_616_ == 1) {
									if (i == 1) {
										int i_705_ = aByteArray11394[i_691_];
										if (i_705_ != 0)
											is[i_692_] = (anIntArray11393[i_705_ & 0xff]);
									} else if (i == 0) {
										int i_706_ = aByteArray11394[i_691_];
										if (i_706_ != 0) {
											int i_707_ = (anIntArray11393[i_706_ & 0xff]);
											if ((anInt8944 & 0xffffff) == 16777215) {
												int i_708_ = anInt8944 >>> 24;
												int i_709_ = 256 - i_708_;
												int i_710_ = is[i_692_];
												is[i_692_] = (((((i_707_ & 0xff00ff) * i_708_) + ((i_710_ & 0xff00ff) * i_709_)) & ~0xff00ff) + ((((i_707_ & 0xff00) * i_708_) + ((i_710_ & 0xff00) * i_709_)) & 0xff0000)) >> 8;
											} else if (anInt8965 != 255) {
												int i_711_ = (((i_707_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_712_ = (((i_707_ & 0xff00) * anInt8974) & 0xff0000);
												int i_713_ = (((i_707_ & 0xff) * anInt8975) & 0xff00);
												i_707_ = (i_711_ | i_712_ | i_713_) >>> 8;
												int i_714_ = is[i_692_];
												is[i_692_] = (((((i_707_ & 0xff00ff) * anInt8965) + ((i_714_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_707_ & 0xff00) * anInt8965) + ((i_714_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
											} else {
												int i_715_ = (((i_707_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_716_ = (((i_707_ & 0xff00) * anInt8974) & 0xff0000);
												int i_717_ = (((i_707_ & 0xff) * anInt8975) & 0xff00);
												is[i_692_] = (i_715_ | i_716_ | i_717_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_718_ = aByteArray11394[i_691_];
										int i_719_ = (i_718_ > 0 ? anIntArray11393[i_718_] : 0);
										int i_720_ = anInt8944;
										int i_721_ = i_719_ + i_720_;
										int i_722_ = ((i_719_ & 0xff00ff) + (i_720_ & 0xff00ff));
										int i_723_ = ((i_722_ & 0x1000100) + (i_721_ - i_722_ & 0x10000));
										i_723_ = (i_721_ - i_723_ | i_723_ - (i_723_ >>> 8));
										if (i_719_ == 0 && anInt8965 != 255) {
											i_719_ = i_723_;
											i_723_ = is[i_692_];
											i_723_ = (((((i_719_ & 0xff00ff) * anInt8965) + ((i_723_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_719_ & 0xff00) * anInt8965) + ((i_723_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_692_] = i_723_;
									} else if (i == 2) {
										int i_724_ = aByteArray11394[i_691_];
										if (i_724_ != 0) {
											int i_725_ = (anIntArray11393[i_724_ & 0xff]);
											int i_726_ = (((i_725_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_727_ = (((i_725_ & 0xff00) * anInt8965) & 0xff0000);
											is[i_692_++] = ((i_726_ | i_727_) >>> 8) + anInt8978;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_616_ == 2) {
									if (i == 1) {
										int i_728_ = aByteArray11394[i_691_];
										if (i_728_ != 0) {
											int i_729_ = (anIntArray11393[i_728_ & 0xff]);
											int i_730_ = is[i_692_];
											int i_731_ = i_729_ + i_730_;
											int i_732_ = ((i_729_ & 0xff00ff) + (i_730_ & 0xff00ff));
											i_730_ = ((i_732_ & 0x1000100) + (i_731_ - i_732_ & 0x10000));
											is[i_692_] = (i_731_ - i_730_ | i_730_ - (i_730_ >>> 8));
										}
									} else if (i == 0) {
										int i_733_ = aByteArray11394[i_691_];
										if (i_733_ != 0) {
											int i_734_ = (anIntArray11393[i_733_ & 0xff]);
											int i_735_ = (((i_734_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_736_ = (((i_734_ & 0xff00) * anInt8974) & 0xff0000);
											int i_737_ = ((i_734_ & 0xff) * anInt8975 & 0xff00);
											i_734_ = (i_735_ | i_736_ | i_737_) >>> 8;
											int i_738_ = is[i_692_];
											int i_739_ = i_734_ + i_738_;
											int i_740_ = ((i_734_ & 0xff00ff) + (i_738_ & 0xff00ff));
											i_738_ = ((i_740_ & 0x1000100) + (i_739_ - i_740_ & 0x10000));
											is[i_692_] = (i_739_ - i_738_ | i_738_ - (i_738_ >>> 8));
										}
									} else if (i == 3) {
										byte i_741_ = aByteArray11394[i_691_];
										int i_742_ = (i_741_ > 0 ? anIntArray11393[i_741_] : 0);
										int i_743_ = anInt8944;
										int i_744_ = i_742_ + i_743_;
										int i_745_ = ((i_742_ & 0xff00ff) + (i_743_ & 0xff00ff));
										int i_746_ = ((i_745_ & 0x1000100) + (i_744_ - i_745_ & 0x10000));
										i_746_ = (i_744_ - i_746_ | i_746_ - (i_746_ >>> 8));
										if (i_742_ == 0 && anInt8965 != 255) {
											i_742_ = i_746_;
											i_746_ = is[i_692_];
											i_746_ = (((((i_742_ & 0xff00ff) * anInt8965) + ((i_746_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_742_ & 0xff00) * anInt8965) + ((i_746_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_692_] = i_746_;
									} else if (i == 2) {
										int i_747_ = aByteArray11394[i_691_];
										if (i_747_ != 0) {
											int i_748_ = (anIntArray11393[i_747_ & 0xff]);
											int i_749_ = (((i_748_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_750_ = (((i_748_ & 0xff00) * anInt8965) & 0xff0000);
											i_748_ = (((i_749_ | i_750_) >>> 8) + anInt8978);
											int i_751_ = is[i_692_];
											int i_752_ = i_748_ + i_751_;
											int i_753_ = ((i_748_ & 0xff00ff) + (i_751_ & 0xff00ff));
											i_751_ = ((i_753_ & 0x1000100) + (i_752_ - i_753_ & 0x10000));
											is[i_692_] = (i_752_ - i_751_ | i_751_ - (i_751_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_688_ += anInt8962;
							}
						}
						i_685_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_754_ = anInt8957;
					while (i_754_ < 0) {
						int i_755_ = anInt8959;
						int i_756_ = anInt8966;
						int i_757_ = anInt8967 + anInt8969;
						int i_758_ = anInt8955;
						if (i_756_ >= 0 && i_756_ - (anInt8945 << 12) < 0) {
							if (i_757_ < 0) {
								int i_759_ = (anInt8962 - 1 - i_757_) / anInt8962;
								i_758_ += i_759_;
								i_757_ += anInt8962 * i_759_;
								i_755_ += i_759_;
							}
							int i_760_;
							if ((i_760_ = (1 + i_757_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_758_)
								i_758_ = i_760_;
							for (/**/; i_758_ < 0; i_758_++) {
								int i_761_ = ((i_757_ >> 12) * anInt8945 + (i_756_ >> 12));
								int i_762_ = i_755_++;
								if (i_616_ == 0) {
									if (i == 1)
										is[i_762_] = (anIntArray11393[(aByteArray11394[i_761_] & 0xff)]);
									else if (i == 0) {
										int i_763_ = (anIntArray11393[(aByteArray11394[i_761_] & 0xff)]);
										int i_764_ = ((i_763_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_765_ = ((i_763_ & 0xff00) * anInt8974 & 0xff0000);
										int i_766_ = ((i_763_ & 0xff) * anInt8975 & 0xff00);
										is[i_762_] = (i_764_ | i_765_ | i_766_) >>> 8;
									} else if (i == 3) {
										int i_767_ = (anIntArray11393[(aByteArray11394[i_761_] & 0xff)]);
										int i_768_ = anInt8944;
										int i_769_ = i_767_ + i_768_;
										int i_770_ = ((i_767_ & 0xff00ff) + (i_768_ & 0xff00ff));
										int i_771_ = ((i_770_ & 0x1000100) + (i_769_ - i_770_ & 0x10000));
										is[i_762_] = (i_769_ - i_771_ | i_771_ - (i_771_ >>> 8));
									} else if (i == 2) {
										int i_772_ = (anIntArray11393[(aByteArray11394[i_761_] & 0xff)]);
										int i_773_ = ((i_772_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_774_ = ((i_772_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_762_] = (((i_773_ | i_774_) >>> 8) + anInt8978);
									} else
										throw new IllegalArgumentException();
								} else if (i_616_ == 1) {
									if (i == 1) {
										int i_775_ = aByteArray11394[i_761_];
										if (i_775_ != 0)
											is[i_762_] = (anIntArray11393[i_775_ & 0xff]);
									} else if (i == 0) {
										int i_776_ = aByteArray11394[i_761_];
										if (i_776_ != 0) {
											int i_777_ = (anIntArray11393[i_776_ & 0xff]);
											if ((anInt8944 & 0xffffff) == 16777215) {
												int i_778_ = anInt8944 >>> 24;
												int i_779_ = 256 - i_778_;
												int i_780_ = is[i_762_];
												is[i_762_] = (((((i_777_ & 0xff00ff) * i_778_) + ((i_780_ & 0xff00ff) * i_779_)) & ~0xff00ff) + ((((i_777_ & 0xff00) * i_778_) + ((i_780_ & 0xff00) * i_779_)) & 0xff0000)) >> 8;
											} else if (anInt8965 != 255) {
												int i_781_ = (((i_777_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_782_ = (((i_777_ & 0xff00) * anInt8974) & 0xff0000);
												int i_783_ = (((i_777_ & 0xff) * anInt8975) & 0xff00);
												i_777_ = (i_781_ | i_782_ | i_783_) >>> 8;
												int i_784_ = is[i_762_];
												is[i_762_] = (((((i_777_ & 0xff00ff) * anInt8965) + ((i_784_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_777_ & 0xff00) * anInt8965) + ((i_784_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
											} else {
												int i_785_ = (((i_777_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_786_ = (((i_777_ & 0xff00) * anInt8974) & 0xff0000);
												int i_787_ = (((i_777_ & 0xff) * anInt8975) & 0xff00);
												is[i_762_] = (i_785_ | i_786_ | i_787_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_788_ = aByteArray11394[i_761_];
										int i_789_ = (i_788_ > 0 ? anIntArray11393[i_788_] : 0);
										int i_790_ = anInt8944;
										int i_791_ = i_789_ + i_790_;
										int i_792_ = ((i_789_ & 0xff00ff) + (i_790_ & 0xff00ff));
										int i_793_ = ((i_792_ & 0x1000100) + (i_791_ - i_792_ & 0x10000));
										i_793_ = (i_791_ - i_793_ | i_793_ - (i_793_ >>> 8));
										if (i_789_ == 0 && anInt8965 != 255) {
											i_789_ = i_793_;
											i_793_ = is[i_762_];
											i_793_ = (((((i_789_ & 0xff00ff) * anInt8965) + ((i_793_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_789_ & 0xff00) * anInt8965) + ((i_793_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_762_] = i_793_;
									} else if (i == 2) {
										int i_794_ = aByteArray11394[i_761_];
										if (i_794_ != 0) {
											int i_795_ = (anIntArray11393[i_794_ & 0xff]);
											int i_796_ = (((i_795_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_797_ = (((i_795_ & 0xff00) * anInt8965) & 0xff0000);
											is[i_762_++] = ((i_796_ | i_797_) >>> 8) + anInt8978;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_616_ == 2) {
									if (i == 1) {
										int i_798_ = aByteArray11394[i_761_];
										if (i_798_ != 0) {
											int i_799_ = (anIntArray11393[i_798_ & 0xff]);
											int i_800_ = is[i_762_];
											int i_801_ = i_799_ + i_800_;
											int i_802_ = ((i_799_ & 0xff00ff) + (i_800_ & 0xff00ff));
											i_800_ = ((i_802_ & 0x1000100) + (i_801_ - i_802_ & 0x10000));
											is[i_762_] = (i_801_ - i_800_ | i_800_ - (i_800_ >>> 8));
										}
									} else if (i == 0) {
										int i_803_ = aByteArray11394[i_761_];
										if (i_803_ != 0) {
											int i_804_ = (anIntArray11393[i_803_ & 0xff]);
											int i_805_ = (((i_804_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_806_ = (((i_804_ & 0xff00) * anInt8974) & 0xff0000);
											int i_807_ = ((i_804_ & 0xff) * anInt8975 & 0xff00);
											i_804_ = (i_805_ | i_806_ | i_807_) >>> 8;
											int i_808_ = is[i_762_];
											int i_809_ = i_804_ + i_808_;
											int i_810_ = ((i_804_ & 0xff00ff) + (i_808_ & 0xff00ff));
											i_808_ = ((i_810_ & 0x1000100) + (i_809_ - i_810_ & 0x10000));
											is[i_762_] = (i_809_ - i_808_ | i_808_ - (i_808_ >>> 8));
										}
									} else if (i == 3) {
										byte i_811_ = aByteArray11394[i_761_];
										int i_812_ = (i_811_ > 0 ? anIntArray11393[i_811_] : 0);
										int i_813_ = anInt8944;
										int i_814_ = i_812_ + i_813_;
										int i_815_ = ((i_812_ & 0xff00ff) + (i_813_ & 0xff00ff));
										int i_816_ = ((i_815_ & 0x1000100) + (i_814_ - i_815_ & 0x10000));
										i_816_ = (i_814_ - i_816_ | i_816_ - (i_816_ >>> 8));
										if (i_812_ == 0 && anInt8965 != 255) {
											i_812_ = i_816_;
											i_816_ = is[i_762_];
											i_816_ = (((((i_812_ & 0xff00ff) * anInt8965) + ((i_816_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_812_ & 0xff00) * anInt8965) + ((i_816_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_762_] = i_816_;
									} else if (i == 2) {
										int i_817_ = aByteArray11394[i_761_];
										if (i_817_ != 0) {
											int i_818_ = (anIntArray11393[i_817_ & 0xff]);
											int i_819_ = (((i_818_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_820_ = (((i_818_ & 0xff00) * anInt8965) & 0xff0000);
											i_818_ = (((i_819_ | i_820_) >>> 8) + anInt8978);
											int i_821_ = is[i_762_];
											int i_822_ = i_818_ + i_821_;
											int i_823_ = ((i_818_ & 0xff00ff) + (i_821_ & 0xff00ff));
											i_821_ = ((i_823_ & 0x1000100) + (i_822_ - i_823_ & 0x10000));
											is[i_762_] = (i_822_ - i_821_ | i_821_ - (i_821_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_757_ += anInt8962;
							}
						}
						i_754_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_824_ = anInt8957;
					while (i_824_ < 0) {
						int i_825_ = anInt8959;
						int i_826_ = anInt8966 + anInt8968;
						int i_827_ = anInt8967;
						int i_828_ = anInt8955;
						if (i_827_ >= 0 && i_827_ - (anInt8950 << 12) < 0) {
							int i_829_;
							if ((i_829_ = i_826_ - (anInt8945 << 12)) >= 0) {
								i_829_ = (anInt8960 - i_829_) / anInt8960;
								i_828_ += i_829_;
								i_826_ += anInt8960 * i_829_;
								i_825_ += i_829_;
							}
							if ((i_829_ = (i_826_ - anInt8960) / anInt8960) > i_828_)
								i_828_ = i_829_;
							for (/**/; i_828_ < 0; i_828_++) {
								int i_830_ = ((i_827_ >> 12) * anInt8945 + (i_826_ >> 12));
								int i_831_ = i_825_++;
								if (i_616_ == 0) {
									if (i == 1)
										is[i_831_] = (anIntArray11393[(aByteArray11394[i_830_] & 0xff)]);
									else if (i == 0) {
										int i_832_ = (anIntArray11393[(aByteArray11394[i_830_] & 0xff)]);
										int i_833_ = ((i_832_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_834_ = ((i_832_ & 0xff00) * anInt8974 & 0xff0000);
										int i_835_ = ((i_832_ & 0xff) * anInt8975 & 0xff00);
										is[i_831_] = (i_833_ | i_834_ | i_835_) >>> 8;
									} else if (i == 3) {
										int i_836_ = (anIntArray11393[(aByteArray11394[i_830_] & 0xff)]);
										int i_837_ = anInt8944;
										int i_838_ = i_836_ + i_837_;
										int i_839_ = ((i_836_ & 0xff00ff) + (i_837_ & 0xff00ff));
										int i_840_ = ((i_839_ & 0x1000100) + (i_838_ - i_839_ & 0x10000));
										is[i_831_] = (i_838_ - i_840_ | i_840_ - (i_840_ >>> 8));
									} else if (i == 2) {
										int i_841_ = (anIntArray11393[(aByteArray11394[i_830_] & 0xff)]);
										int i_842_ = ((i_841_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_843_ = ((i_841_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_831_] = (((i_842_ | i_843_) >>> 8) + anInt8978);
									} else
										throw new IllegalArgumentException();
								} else if (i_616_ == 1) {
									if (i == 1) {
										int i_844_ = aByteArray11394[i_830_];
										if (i_844_ != 0)
											is[i_831_] = (anIntArray11393[i_844_ & 0xff]);
									} else if (i == 0) {
										int i_845_ = aByteArray11394[i_830_];
										if (i_845_ != 0) {
											int i_846_ = (anIntArray11393[i_845_ & 0xff]);
											if ((anInt8944 & 0xffffff) == 16777215) {
												int i_847_ = anInt8944 >>> 24;
												int i_848_ = 256 - i_847_;
												int i_849_ = is[i_831_];
												is[i_831_] = (((((i_846_ & 0xff00ff) * i_847_) + ((i_849_ & 0xff00ff) * i_848_)) & ~0xff00ff) + ((((i_846_ & 0xff00) * i_847_) + ((i_849_ & 0xff00) * i_848_)) & 0xff0000)) >> 8;
											} else if (anInt8965 != 255) {
												int i_850_ = (((i_846_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_851_ = (((i_846_ & 0xff00) * anInt8974) & 0xff0000);
												int i_852_ = (((i_846_ & 0xff) * anInt8975) & 0xff00);
												i_846_ = (i_850_ | i_851_ | i_852_) >>> 8;
												int i_853_ = is[i_831_];
												is[i_831_] = (((((i_846_ & 0xff00ff) * anInt8965) + ((i_853_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_846_ & 0xff00) * anInt8965) + ((i_853_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
											} else {
												int i_854_ = (((i_846_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_855_ = (((i_846_ & 0xff00) * anInt8974) & 0xff0000);
												int i_856_ = (((i_846_ & 0xff) * anInt8975) & 0xff00);
												is[i_831_] = (i_854_ | i_855_ | i_856_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_857_ = aByteArray11394[i_830_];
										int i_858_ = (i_857_ > 0 ? anIntArray11393[i_857_] : 0);
										int i_859_ = anInt8944;
										int i_860_ = i_858_ + i_859_;
										int i_861_ = ((i_858_ & 0xff00ff) + (i_859_ & 0xff00ff));
										int i_862_ = ((i_861_ & 0x1000100) + (i_860_ - i_861_ & 0x10000));
										i_862_ = (i_860_ - i_862_ | i_862_ - (i_862_ >>> 8));
										if (i_858_ == 0 && anInt8965 != 255) {
											i_858_ = i_862_;
											i_862_ = is[i_831_];
											i_862_ = (((((i_858_ & 0xff00ff) * anInt8965) + ((i_862_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_858_ & 0xff00) * anInt8965) + ((i_862_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_831_] = i_862_;
									} else if (i == 2) {
										int i_863_ = aByteArray11394[i_830_];
										if (i_863_ != 0) {
											int i_864_ = (anIntArray11393[i_863_ & 0xff]);
											int i_865_ = (((i_864_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_866_ = (((i_864_ & 0xff00) * anInt8965) & 0xff0000);
											is[i_831_++] = ((i_865_ | i_866_) >>> 8) + anInt8978;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_616_ == 2) {
									if (i == 1) {
										int i_867_ = aByteArray11394[i_830_];
										if (i_867_ != 0) {
											int i_868_ = (anIntArray11393[i_867_ & 0xff]);
											int i_869_ = is[i_831_];
											int i_870_ = i_868_ + i_869_;
											int i_871_ = ((i_868_ & 0xff00ff) + (i_869_ & 0xff00ff));
											i_869_ = ((i_871_ & 0x1000100) + (i_870_ - i_871_ & 0x10000));
											is[i_831_] = (i_870_ - i_869_ | i_869_ - (i_869_ >>> 8));
										}
									} else if (i == 0) {
										int i_872_ = aByteArray11394[i_830_];
										if (i_872_ != 0) {
											int i_873_ = (anIntArray11393[i_872_ & 0xff]);
											int i_874_ = (((i_873_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_875_ = (((i_873_ & 0xff00) * anInt8974) & 0xff0000);
											int i_876_ = ((i_873_ & 0xff) * anInt8975 & 0xff00);
											i_873_ = (i_874_ | i_875_ | i_876_) >>> 8;
											int i_877_ = is[i_831_];
											int i_878_ = i_873_ + i_877_;
											int i_879_ = ((i_873_ & 0xff00ff) + (i_877_ & 0xff00ff));
											i_877_ = ((i_879_ & 0x1000100) + (i_878_ - i_879_ & 0x10000));
											is[i_831_] = (i_878_ - i_877_ | i_877_ - (i_877_ >>> 8));
										}
									} else if (i == 3) {
										byte i_880_ = aByteArray11394[i_830_];
										int i_881_ = (i_880_ > 0 ? anIntArray11393[i_880_] : 0);
										int i_882_ = anInt8944;
										int i_883_ = i_881_ + i_882_;
										int i_884_ = ((i_881_ & 0xff00ff) + (i_882_ & 0xff00ff));
										int i_885_ = ((i_884_ & 0x1000100) + (i_883_ - i_884_ & 0x10000));
										i_885_ = (i_883_ - i_885_ | i_885_ - (i_885_ >>> 8));
										if (i_881_ == 0 && anInt8965 != 255) {
											i_881_ = i_885_;
											i_885_ = is[i_831_];
											i_885_ = (((((i_881_ & 0xff00ff) * anInt8965) + ((i_885_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_881_ & 0xff00) * anInt8965) + ((i_885_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_831_] = i_885_;
									} else if (i == 2) {
										int i_886_ = aByteArray11394[i_830_];
										if (i_886_ != 0) {
											int i_887_ = (anIntArray11393[i_886_ & 0xff]);
											int i_888_ = (((i_887_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_889_ = (((i_887_ & 0xff00) * anInt8965) & 0xff0000);
											i_887_ = (((i_888_ | i_889_) >>> 8) + anInt8978);
											int i_890_ = is[i_831_];
											int i_891_ = i_887_ + i_890_;
											int i_892_ = ((i_887_ & 0xff00ff) + (i_890_ & 0xff00ff));
											i_890_ = ((i_892_ & 0x1000100) + (i_891_ - i_892_ & 0x10000));
											is[i_831_] = (i_891_ - i_890_ | i_890_ - (i_890_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_826_ += anInt8960;
							}
						}
						i_824_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_893_ = anInt8957;
					while (i_893_ < 0) {
						int i_894_ = anInt8959;
						int i_895_ = anInt8966 + anInt8968;
						int i_896_ = anInt8967 + anInt8969;
						int i_897_ = anInt8955;
						int i_898_;
						if ((i_898_ = i_895_ - (anInt8945 << 12)) >= 0) {
							i_898_ = (anInt8960 - i_898_) / anInt8960;
							i_897_ += i_898_;
							i_895_ += anInt8960 * i_898_;
							i_896_ += anInt8962 * i_898_;
							i_894_ += i_898_;
						}
						if ((i_898_ = (i_895_ - anInt8960) / anInt8960) > i_897_)
							i_897_ = i_898_;
						if ((i_898_ = i_896_ - (anInt8950 << 12)) >= 0) {
							i_898_ = (anInt8962 - i_898_) / anInt8962;
							i_897_ += i_898_;
							i_895_ += anInt8960 * i_898_;
							i_896_ += anInt8962 * i_898_;
							i_894_ += i_898_;
						}
						if ((i_898_ = (i_896_ - anInt8962) / anInt8962) > i_897_)
							i_897_ = i_898_;
						for (/**/; i_897_ < 0; i_897_++) {
							int i_899_ = (i_896_ >> 12) * anInt8945 + (i_895_ >> 12);
							int i_900_ = i_894_++;
							if (i_616_ == 0) {
								if (i == 1)
									is[i_900_] = (anIntArray11393[aByteArray11394[i_899_] & 0xff]);
								else if (i == 0) {
									int i_901_ = (anIntArray11393[aByteArray11394[i_899_] & 0xff]);
									int i_902_ = ((i_901_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_903_ = ((i_901_ & 0xff00) * anInt8974 & 0xff0000);
									int i_904_ = (i_901_ & 0xff) * anInt8975 & 0xff00;
									is[i_900_] = (i_902_ | i_903_ | i_904_) >>> 8;
								} else if (i == 3) {
									int i_905_ = (anIntArray11393[aByteArray11394[i_899_] & 0xff]);
									int i_906_ = anInt8944;
									int i_907_ = i_905_ + i_906_;
									int i_908_ = ((i_905_ & 0xff00ff) + (i_906_ & 0xff00ff));
									int i_909_ = ((i_908_ & 0x1000100) + (i_907_ - i_908_ & 0x10000));
									is[i_900_] = i_907_ - i_909_ | i_909_ - (i_909_ >>> 8);
								} else if (i == 2) {
									int i_910_ = (anIntArray11393[aByteArray11394[i_899_] & 0xff]);
									int i_911_ = ((i_910_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_912_ = ((i_910_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_900_] = (((i_911_ | i_912_) >>> 8) + anInt8978);
								} else
									throw new IllegalArgumentException();
							} else if (i_616_ == 1) {
								if (i == 1) {
									int i_913_ = aByteArray11394[i_899_];
									if (i_913_ != 0)
										is[i_900_] = anIntArray11393[i_913_ & 0xff];
								} else if (i == 0) {
									int i_914_ = aByteArray11394[i_899_];
									if (i_914_ != 0) {
										int i_915_ = anIntArray11393[i_914_ & 0xff];
										if ((anInt8944 & 0xffffff) == 16777215) {
											int i_916_ = anInt8944 >>> 24;
											int i_917_ = 256 - i_916_;
											int i_918_ = is[i_900_];
											is[i_900_] = (((((i_915_ & 0xff00ff) * i_916_) + ((i_918_ & 0xff00ff) * i_917_)) & ~0xff00ff) + ((((i_915_ & 0xff00) * i_916_) + ((i_918_ & 0xff00) * i_917_)) & 0xff0000)) >> 8;
										} else if (anInt8965 != 255) {
											int i_919_ = (((i_915_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_920_ = (((i_915_ & 0xff00) * anInt8974) & 0xff0000);
											int i_921_ = ((i_915_ & 0xff) * anInt8975 & 0xff00);
											i_915_ = (i_919_ | i_920_ | i_921_) >>> 8;
											int i_922_ = is[i_900_];
											is[i_900_] = (((((i_915_ & 0xff00ff) * anInt8965) + ((i_922_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_915_ & 0xff00) * anInt8965) + ((i_922_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										} else {
											int i_923_ = (((i_915_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_924_ = (((i_915_ & 0xff00) * anInt8974) & 0xff0000);
											int i_925_ = ((i_915_ & 0xff) * anInt8975 & 0xff00);
											is[i_900_] = (i_923_ | i_924_ | i_925_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_926_ = aByteArray11394[i_899_];
									int i_927_ = (i_926_ > 0 ? anIntArray11393[i_926_] : 0);
									int i_928_ = anInt8944;
									int i_929_ = i_927_ + i_928_;
									int i_930_ = ((i_927_ & 0xff00ff) + (i_928_ & 0xff00ff));
									int i_931_ = ((i_930_ & 0x1000100) + (i_929_ - i_930_ & 0x10000));
									i_931_ = i_929_ - i_931_ | i_931_ - (i_931_ >>> 8);
									if (i_927_ == 0 && anInt8965 != 255) {
										i_927_ = i_931_;
										i_931_ = is[i_900_];
										i_931_ = (((((i_927_ & 0xff00ff) * anInt8965) + ((i_931_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_927_ & 0xff00) * anInt8965) + ((i_931_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_900_] = i_931_;
								} else if (i == 2) {
									int i_932_ = aByteArray11394[i_899_];
									if (i_932_ != 0) {
										int i_933_ = anIntArray11393[i_932_ & 0xff];
										int i_934_ = ((i_933_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_935_ = ((i_933_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_900_++] = ((i_934_ | i_935_) >>> 8) + anInt8978;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_616_ == 2) {
								if (i == 1) {
									int i_936_ = aByteArray11394[i_899_];
									if (i_936_ != 0) {
										int i_937_ = anIntArray11393[i_936_ & 0xff];
										int i_938_ = is[i_900_];
										int i_939_ = i_937_ + i_938_;
										int i_940_ = ((i_937_ & 0xff00ff) + (i_938_ & 0xff00ff));
										i_938_ = ((i_940_ & 0x1000100) + (i_939_ - i_940_ & 0x10000));
										is[i_900_] = (i_939_ - i_938_ | i_938_ - (i_938_ >>> 8));
									}
								} else if (i == 0) {
									int i_941_ = aByteArray11394[i_899_];
									if (i_941_ != 0) {
										int i_942_ = anIntArray11393[i_941_ & 0xff];
										int i_943_ = ((i_942_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_944_ = ((i_942_ & 0xff00) * anInt8974 & 0xff0000);
										int i_945_ = ((i_942_ & 0xff) * anInt8975 & 0xff00);
										i_942_ = (i_943_ | i_944_ | i_945_) >>> 8;
										int i_946_ = is[i_900_];
										int i_947_ = i_942_ + i_946_;
										int i_948_ = ((i_942_ & 0xff00ff) + (i_946_ & 0xff00ff));
										i_946_ = ((i_948_ & 0x1000100) + (i_947_ - i_948_ & 0x10000));
										is[i_900_] = (i_947_ - i_946_ | i_946_ - (i_946_ >>> 8));
									}
								} else if (i == 3) {
									byte i_949_ = aByteArray11394[i_899_];
									int i_950_ = (i_949_ > 0 ? anIntArray11393[i_949_] : 0);
									int i_951_ = anInt8944;
									int i_952_ = i_950_ + i_951_;
									int i_953_ = ((i_950_ & 0xff00ff) + (i_951_ & 0xff00ff));
									int i_954_ = ((i_953_ & 0x1000100) + (i_952_ - i_953_ & 0x10000));
									i_954_ = i_952_ - i_954_ | i_954_ - (i_954_ >>> 8);
									if (i_950_ == 0 && anInt8965 != 255) {
										i_950_ = i_954_;
										i_954_ = is[i_900_];
										i_954_ = (((((i_950_ & 0xff00ff) * anInt8965) + ((i_954_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_950_ & 0xff00) * anInt8965) + ((i_954_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_900_] = i_954_;
								} else if (i == 2) {
									int i_955_ = aByteArray11394[i_899_];
									if (i_955_ != 0) {
										int i_956_ = anIntArray11393[i_955_ & 0xff];
										int i_957_ = ((i_956_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_958_ = ((i_956_ & 0xff00) * anInt8965 & 0xff0000);
										i_956_ = (((i_957_ | i_958_) >>> 8) + anInt8978);
										int i_959_ = is[i_900_];
										int i_960_ = i_956_ + i_959_;
										int i_961_ = ((i_956_ & 0xff00ff) + (i_959_ & 0xff00ff));
										i_959_ = ((i_961_ & 0x1000100) + (i_960_ - i_961_ & 0x10000));
										is[i_900_] = (i_960_ - i_959_ | i_959_ - (i_959_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_895_ += anInt8960;
							i_896_ += anInt8962;
						}
						i_893_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_962_ = anInt8957;
					while (i_962_ < 0) {
						int i_963_ = anInt8959;
						int i_964_ = anInt8966 + anInt8968;
						int i_965_ = anInt8967 + anInt8969;
						int i_966_ = anInt8955;
						int i_967_;
						if ((i_967_ = i_964_ - (anInt8945 << 12)) >= 0) {
							i_967_ = (anInt8960 - i_967_) / anInt8960;
							i_966_ += i_967_;
							i_964_ += anInt8960 * i_967_;
							i_965_ += anInt8962 * i_967_;
							i_963_ += i_967_;
						}
						if ((i_967_ = (i_964_ - anInt8960) / anInt8960) > i_966_)
							i_966_ = i_967_;
						if (i_965_ < 0) {
							i_967_ = (anInt8962 - 1 - i_965_) / anInt8962;
							i_966_ += i_967_;
							i_964_ += anInt8960 * i_967_;
							i_965_ += anInt8962 * i_967_;
							i_963_ += i_967_;
						}
						if ((i_967_ = (1 + i_965_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_966_)
							i_966_ = i_967_;
						for (/**/; i_966_ < 0; i_966_++) {
							int i_968_ = (i_965_ >> 12) * anInt8945 + (i_964_ >> 12);
							int i_969_ = i_963_++;
							if (i_616_ == 0) {
								if (i == 1)
									is[i_969_] = (anIntArray11393[aByteArray11394[i_968_] & 0xff]);
								else if (i == 0) {
									int i_970_ = (anIntArray11393[aByteArray11394[i_968_] & 0xff]);
									int i_971_ = ((i_970_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_972_ = ((i_970_ & 0xff00) * anInt8974 & 0xff0000);
									int i_973_ = (i_970_ & 0xff) * anInt8975 & 0xff00;
									is[i_969_] = (i_971_ | i_972_ | i_973_) >>> 8;
								} else if (i == 3) {
									int i_974_ = (anIntArray11393[aByteArray11394[i_968_] & 0xff]);
									int i_975_ = anInt8944;
									int i_976_ = i_974_ + i_975_;
									int i_977_ = ((i_974_ & 0xff00ff) + (i_975_ & 0xff00ff));
									int i_978_ = ((i_977_ & 0x1000100) + (i_976_ - i_977_ & 0x10000));
									is[i_969_] = i_976_ - i_978_ | i_978_ - (i_978_ >>> 8);
								} else if (i == 2) {
									int i_979_ = (anIntArray11393[aByteArray11394[i_968_] & 0xff]);
									int i_980_ = ((i_979_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_981_ = ((i_979_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_969_] = (((i_980_ | i_981_) >>> 8) + anInt8978);
								} else
									throw new IllegalArgumentException();
							} else if (i_616_ == 1) {
								if (i == 1) {
									int i_982_ = aByteArray11394[i_968_];
									if (i_982_ != 0)
										is[i_969_] = anIntArray11393[i_982_ & 0xff];
								} else if (i == 0) {
									int i_983_ = aByteArray11394[i_968_];
									if (i_983_ != 0) {
										int i_984_ = anIntArray11393[i_983_ & 0xff];
										if ((anInt8944 & 0xffffff) == 16777215) {
											int i_985_ = anInt8944 >>> 24;
											int i_986_ = 256 - i_985_;
											int i_987_ = is[i_969_];
											is[i_969_] = (((((i_984_ & 0xff00ff) * i_985_) + ((i_987_ & 0xff00ff) * i_986_)) & ~0xff00ff) + ((((i_984_ & 0xff00) * i_985_) + ((i_987_ & 0xff00) * i_986_)) & 0xff0000)) >> 8;
										} else if (anInt8965 != 255) {
											int i_988_ = (((i_984_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_989_ = (((i_984_ & 0xff00) * anInt8974) & 0xff0000);
											int i_990_ = ((i_984_ & 0xff) * anInt8975 & 0xff00);
											i_984_ = (i_988_ | i_989_ | i_990_) >>> 8;
											int i_991_ = is[i_969_];
											is[i_969_] = (((((i_984_ & 0xff00ff) * anInt8965) + ((i_991_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_984_ & 0xff00) * anInt8965) + ((i_991_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										} else {
											int i_992_ = (((i_984_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_993_ = (((i_984_ & 0xff00) * anInt8974) & 0xff0000);
											int i_994_ = ((i_984_ & 0xff) * anInt8975 & 0xff00);
											is[i_969_] = (i_992_ | i_993_ | i_994_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_995_ = aByteArray11394[i_968_];
									int i_996_ = (i_995_ > 0 ? anIntArray11393[i_995_] : 0);
									int i_997_ = anInt8944;
									int i_998_ = i_996_ + i_997_;
									int i_999_ = ((i_996_ & 0xff00ff) + (i_997_ & 0xff00ff));
									int i_1000_ = ((i_999_ & 0x1000100) + (i_998_ - i_999_ & 0x10000));
									i_1000_ = i_998_ - i_1000_ | i_1000_ - (i_1000_ >>> 8);
									if (i_996_ == 0 && anInt8965 != 255) {
										i_996_ = i_1000_;
										i_1000_ = is[i_969_];
										i_1000_ = (((((i_996_ & 0xff00ff) * anInt8965) + ((i_1000_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_996_ & 0xff00) * anInt8965) + ((i_1000_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_969_] = i_1000_;
								} else if (i == 2) {
									int i_1001_ = aByteArray11394[i_968_];
									if (i_1001_ != 0) {
										int i_1002_ = anIntArray11393[i_1001_ & 0xff];
										int i_1003_ = ((i_1002_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_1004_ = ((i_1002_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_969_++] = ((i_1003_ | i_1004_) >>> 8) + anInt8978;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_616_ == 2) {
								if (i == 1) {
									int i_1005_ = aByteArray11394[i_968_];
									if (i_1005_ != 0) {
										int i_1006_ = anIntArray11393[i_1005_ & 0xff];
										int i_1007_ = is[i_969_];
										int i_1008_ = i_1006_ + i_1007_;
										int i_1009_ = ((i_1006_ & 0xff00ff) + (i_1007_ & 0xff00ff));
										i_1007_ = ((i_1009_ & 0x1000100) + (i_1008_ - i_1009_ & 0x10000));
										is[i_969_] = (i_1008_ - i_1007_ | i_1007_ - (i_1007_ >>> 8));
									}
								} else if (i == 0) {
									int i_1010_ = aByteArray11394[i_968_];
									if (i_1010_ != 0) {
										int i_1011_ = anIntArray11393[i_1010_ & 0xff];
										int i_1012_ = ((i_1011_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_1013_ = ((i_1011_ & 0xff00) * anInt8974 & 0xff0000);
										int i_1014_ = ((i_1011_ & 0xff) * anInt8975 & 0xff00);
										i_1011_ = (i_1012_ | i_1013_ | i_1014_) >>> 8;
										int i_1015_ = is[i_969_];
										int i_1016_ = i_1011_ + i_1015_;
										int i_1017_ = ((i_1011_ & 0xff00ff) + (i_1015_ & 0xff00ff));
										i_1015_ = ((i_1017_ & 0x1000100) + (i_1016_ - i_1017_ & 0x10000));
										is[i_969_] = (i_1016_ - i_1015_ | i_1015_ - (i_1015_ >>> 8));
									}
								} else if (i == 3) {
									byte i_1018_ = aByteArray11394[i_968_];
									int i_1019_ = (i_1018_ > 0 ? anIntArray11393[i_1018_] : 0);
									int i_1020_ = anInt8944;
									int i_1021_ = i_1019_ + i_1020_;
									int i_1022_ = ((i_1019_ & 0xff00ff) + (i_1020_ & 0xff00ff));
									int i_1023_ = ((i_1022_ & 0x1000100) + (i_1021_ - i_1022_ & 0x10000));
									i_1023_ = (i_1021_ - i_1023_ | i_1023_ - (i_1023_ >>> 8));
									if (i_1019_ == 0 && anInt8965 != 255) {
										i_1019_ = i_1023_;
										i_1023_ = is[i_969_];
										i_1023_ = (((((i_1019_ & 0xff00ff) * anInt8965) + ((i_1023_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_1019_ & 0xff00) * anInt8965) + ((i_1023_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_969_] = i_1023_;
								} else if (i == 2) {
									int i_1024_ = aByteArray11394[i_968_];
									if (i_1024_ != 0) {
										int i_1025_ = anIntArray11393[i_1024_ & 0xff];
										int i_1026_ = ((i_1025_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_1027_ = ((i_1025_ & 0xff00) * anInt8965 & 0xff0000);
										i_1025_ = (((i_1026_ | i_1027_) >>> 8) + anInt8978);
										int i_1028_ = is[i_969_];
										int i_1029_ = i_1025_ + i_1028_;
										int i_1030_ = ((i_1025_ & 0xff00ff) + (i_1028_ & 0xff00ff));
										i_1028_ = ((i_1030_ & 0x1000100) + (i_1029_ - i_1030_ & 0x10000));
										is[i_969_] = (i_1029_ - i_1028_ | i_1028_ - (i_1028_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_964_ += anInt8960;
							i_965_ += anInt8962;
						}
						i_962_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_1031_ = anInt8957;
				while (i_1031_ < 0) {
					int i_1032_ = anInt8959;
					int i_1033_ = anInt8966 + anInt8968;
					int i_1034_ = anInt8967;
					int i_1035_ = anInt8955;
					if (i_1034_ >= 0 && i_1034_ - (anInt8950 << 12) < 0) {
						if (i_1033_ < 0) {
							int i_1036_ = (anInt8960 - 1 - i_1033_) / anInt8960;
							i_1035_ += i_1036_;
							i_1033_ += anInt8960 * i_1036_;
							i_1032_ += i_1036_;
						}
						int i_1037_;
						if ((i_1037_ = (1 + i_1033_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_1035_)
							i_1035_ = i_1037_;
						for (/**/; i_1035_ < 0; i_1035_++) {
							int i_1038_ = ((i_1034_ >> 12) * anInt8945 + (i_1033_ >> 12));
							int i_1039_ = i_1032_++;
							if (i_616_ == 0) {
								if (i == 1)
									is[i_1039_] = (anIntArray11393[aByteArray11394[i_1038_] & 0xff]);
								else if (i == 0) {
									int i_1040_ = (anIntArray11393[aByteArray11394[i_1038_] & 0xff]);
									int i_1041_ = ((i_1040_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_1042_ = ((i_1040_ & 0xff00) * anInt8974 & 0xff0000);
									int i_1043_ = ((i_1040_ & 0xff) * anInt8975 & 0xff00);
									is[i_1039_] = (i_1041_ | i_1042_ | i_1043_) >>> 8;
								} else if (i == 3) {
									int i_1044_ = (anIntArray11393[aByteArray11394[i_1038_] & 0xff]);
									int i_1045_ = anInt8944;
									int i_1046_ = i_1044_ + i_1045_;
									int i_1047_ = ((i_1044_ & 0xff00ff) + (i_1045_ & 0xff00ff));
									int i_1048_ = ((i_1047_ & 0x1000100) + (i_1046_ - i_1047_ & 0x10000));
									is[i_1039_] = (i_1046_ - i_1048_ | i_1048_ - (i_1048_ >>> 8));
								} else if (i == 2) {
									int i_1049_ = (anIntArray11393[aByteArray11394[i_1038_] & 0xff]);
									int i_1050_ = ((i_1049_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_1051_ = ((i_1049_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_1039_] = (((i_1050_ | i_1051_) >>> 8) + anInt8978);
								} else
									throw new IllegalArgumentException();
							} else if (i_616_ == 1) {
								if (i == 1) {
									int i_1052_ = aByteArray11394[i_1038_];
									if (i_1052_ != 0)
										is[i_1039_] = anIntArray11393[i_1052_ & 0xff];
								} else if (i == 0) {
									int i_1053_ = aByteArray11394[i_1038_];
									if (i_1053_ != 0) {
										int i_1054_ = anIntArray11393[i_1053_ & 0xff];
										if ((anInt8944 & 0xffffff) == 16777215) {
											int i_1055_ = anInt8944 >>> 24;
											int i_1056_ = 256 - i_1055_;
											int i_1057_ = is[i_1039_];
											is[i_1039_] = (((((i_1054_ & 0xff00ff) * i_1055_) + ((i_1057_ & 0xff00ff) * i_1056_)) & ~0xff00ff) + ((((i_1054_ & 0xff00) * i_1055_) + ((i_1057_ & 0xff00) * i_1056_)) & 0xff0000)) >> 8;
										} else if (anInt8965 != 255) {
											int i_1058_ = (((i_1054_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_1059_ = (((i_1054_ & 0xff00) * anInt8974) & 0xff0000);
											int i_1060_ = ((i_1054_ & 0xff) * anInt8975 & 0xff00);
											i_1054_ = (i_1058_ | i_1059_ | i_1060_) >>> 8;
											int i_1061_ = is[i_1039_];
											is[i_1039_] = (((((i_1054_ & 0xff00ff) * anInt8965) + ((i_1061_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_1054_ & 0xff00) * anInt8965) + ((i_1061_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										} else {
											int i_1062_ = (((i_1054_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_1063_ = (((i_1054_ & 0xff00) * anInt8974) & 0xff0000);
											int i_1064_ = ((i_1054_ & 0xff) * anInt8975 & 0xff00);
											is[i_1039_] = (i_1062_ | i_1063_ | i_1064_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_1065_ = aByteArray11394[i_1038_];
									int i_1066_ = (i_1065_ > 0 ? anIntArray11393[i_1065_] : 0);
									int i_1067_ = anInt8944;
									int i_1068_ = i_1066_ + i_1067_;
									int i_1069_ = ((i_1066_ & 0xff00ff) + (i_1067_ & 0xff00ff));
									int i_1070_ = ((i_1069_ & 0x1000100) + (i_1068_ - i_1069_ & 0x10000));
									i_1070_ = (i_1068_ - i_1070_ | i_1070_ - (i_1070_ >>> 8));
									if (i_1066_ == 0 && anInt8965 != 255) {
										i_1066_ = i_1070_;
										i_1070_ = is[i_1039_];
										i_1070_ = (((((i_1066_ & 0xff00ff) * anInt8965) + ((i_1070_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_1066_ & 0xff00) * anInt8965) + ((i_1070_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_1039_] = i_1070_;
								} else if (i == 2) {
									int i_1071_ = aByteArray11394[i_1038_];
									if (i_1071_ != 0) {
										int i_1072_ = anIntArray11393[i_1071_ & 0xff];
										int i_1073_ = ((i_1072_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_1074_ = ((i_1072_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_1039_++] = ((i_1073_ | i_1074_) >>> 8) + anInt8978;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_616_ == 2) {
								if (i == 1) {
									int i_1075_ = aByteArray11394[i_1038_];
									if (i_1075_ != 0) {
										int i_1076_ = anIntArray11393[i_1075_ & 0xff];
										int i_1077_ = is[i_1039_];
										int i_1078_ = i_1076_ + i_1077_;
										int i_1079_ = ((i_1076_ & 0xff00ff) + (i_1077_ & 0xff00ff));
										i_1077_ = ((i_1079_ & 0x1000100) + (i_1078_ - i_1079_ & 0x10000));
										is[i_1039_] = (i_1078_ - i_1077_ | i_1077_ - (i_1077_ >>> 8));
									}
								} else if (i == 0) {
									int i_1080_ = aByteArray11394[i_1038_];
									if (i_1080_ != 0) {
										int i_1081_ = anIntArray11393[i_1080_ & 0xff];
										int i_1082_ = ((i_1081_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_1083_ = ((i_1081_ & 0xff00) * anInt8974 & 0xff0000);
										int i_1084_ = ((i_1081_ & 0xff) * anInt8975 & 0xff00);
										i_1081_ = (i_1082_ | i_1083_ | i_1084_) >>> 8;
										int i_1085_ = is[i_1039_];
										int i_1086_ = i_1081_ + i_1085_;
										int i_1087_ = ((i_1081_ & 0xff00ff) + (i_1085_ & 0xff00ff));
										i_1085_ = ((i_1087_ & 0x1000100) + (i_1086_ - i_1087_ & 0x10000));
										is[i_1039_] = (i_1086_ - i_1085_ | i_1085_ - (i_1085_ >>> 8));
									}
								} else if (i == 3) {
									byte i_1088_ = aByteArray11394[i_1038_];
									int i_1089_ = (i_1088_ > 0 ? anIntArray11393[i_1088_] : 0);
									int i_1090_ = anInt8944;
									int i_1091_ = i_1089_ + i_1090_;
									int i_1092_ = ((i_1089_ & 0xff00ff) + (i_1090_ & 0xff00ff));
									int i_1093_ = ((i_1092_ & 0x1000100) + (i_1091_ - i_1092_ & 0x10000));
									i_1093_ = (i_1091_ - i_1093_ | i_1093_ - (i_1093_ >>> 8));
									if (i_1089_ == 0 && anInt8965 != 255) {
										i_1089_ = i_1093_;
										i_1093_ = is[i_1039_];
										i_1093_ = (((((i_1089_ & 0xff00ff) * anInt8965) + ((i_1093_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_1089_ & 0xff00) * anInt8965) + ((i_1093_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_1039_] = i_1093_;
								} else if (i == 2) {
									int i_1094_ = aByteArray11394[i_1038_];
									if (i_1094_ != 0) {
										int i_1095_ = anIntArray11393[i_1094_ & 0xff];
										int i_1096_ = ((i_1095_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_1097_ = ((i_1095_ & 0xff00) * anInt8965 & 0xff0000);
										i_1095_ = (((i_1096_ | i_1097_) >>> 8) + anInt8978);
										int i_1098_ = is[i_1039_];
										int i_1099_ = i_1095_ + i_1098_;
										int i_1100_ = ((i_1095_ & 0xff00ff) + (i_1098_ & 0xff00ff));
										i_1098_ = ((i_1100_ & 0x1000100) + (i_1099_ - i_1100_ & 0x10000));
										is[i_1039_] = (i_1099_ - i_1098_ | i_1098_ - (i_1098_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_1033_ += anInt8960;
						}
					}
					i_1031_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				for (int i_1101_ = anInt8957; i_1101_ < 0; i_1101_++) {
					int i_1102_ = anInt8959;
					int i_1103_ = anInt8966 + anInt8968;
					int i_1104_ = anInt8967 + anInt8969;
					int i_1105_ = anInt8955;
					if (i_1103_ < 0) {
						int i_1106_ = (anInt8960 - 1 - i_1103_) / anInt8960;
						i_1105_ += i_1106_;
						i_1103_ += anInt8960 * i_1106_;
						i_1104_ += anInt8962 * i_1106_;
						i_1102_ += i_1106_;
					}
					int i_1107_;
					if ((i_1107_ = (1 + i_1103_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_1105_)
						i_1105_ = i_1107_;
					if ((i_1107_ = i_1104_ - (anInt8950 << 12)) >= 0) {
						i_1107_ = (anInt8962 - i_1107_) / anInt8962;
						i_1105_ += i_1107_;
						i_1103_ += anInt8960 * i_1107_;
						i_1104_ += anInt8962 * i_1107_;
						i_1102_ += i_1107_;
					}
					if ((i_1107_ = (i_1104_ - anInt8962) / anInt8962) > i_1105_)
						i_1105_ = i_1107_;
					for (/**/; i_1105_ < 0; i_1105_++) {
						int i_1108_ = (i_1104_ >> 12) * anInt8945 + (i_1103_ >> 12);
						int i_1109_ = i_1102_++;
						if (i_616_ == 0) {
							if (i == 1)
								is[i_1109_] = (anIntArray11393[aByteArray11394[i_1108_] & 0xff]);
							else if (i == 0) {
								int i_1110_ = (anIntArray11393[aByteArray11394[i_1108_] & 0xff]);
								int i_1111_ = ((i_1110_ & 0xff0000) * anInt8973 & ~0xffffff);
								int i_1112_ = ((i_1110_ & 0xff00) * anInt8974 & 0xff0000);
								int i_1113_ = (i_1110_ & 0xff) * anInt8975 & 0xff00;
								is[i_1109_] = (i_1111_ | i_1112_ | i_1113_) >>> 8;
							} else if (i == 3) {
								int i_1114_ = (anIntArray11393[aByteArray11394[i_1108_] & 0xff]);
								int i_1115_ = anInt8944;
								int i_1116_ = i_1114_ + i_1115_;
								int i_1117_ = ((i_1114_ & 0xff00ff) + (i_1115_ & 0xff00ff));
								int i_1118_ = ((i_1117_ & 0x1000100) + (i_1116_ - i_1117_ & 0x10000));
								is[i_1109_] = i_1116_ - i_1118_ | i_1118_ - (i_1118_ >>> 8);
							} else if (i == 2) {
								int i_1119_ = (anIntArray11393[aByteArray11394[i_1108_] & 0xff]);
								int i_1120_ = ((i_1119_ & 0xff00ff) * anInt8965 & ~0xff00ff);
								int i_1121_ = ((i_1119_ & 0xff00) * anInt8965 & 0xff0000);
								is[i_1109_] = ((i_1120_ | i_1121_) >>> 8) + anInt8978;
							} else
								throw new IllegalArgumentException();
						} else if (i_616_ == 1) {
							if (i == 1) {
								int i_1122_ = aByteArray11394[i_1108_];
								if (i_1122_ != 0)
									is[i_1109_] = anIntArray11393[i_1122_ & 0xff];
							} else if (i == 0) {
								int i_1123_ = aByteArray11394[i_1108_];
								if (i_1123_ != 0) {
									int i_1124_ = anIntArray11393[i_1123_ & 0xff];
									if ((anInt8944 & 0xffffff) == 16777215) {
										int i_1125_ = anInt8944 >>> 24;
										int i_1126_ = 256 - i_1125_;
										int i_1127_ = is[i_1109_];
										is[i_1109_] = ((((i_1124_ & 0xff00ff) * i_1125_ + ((i_1127_ & 0xff00ff) * i_1126_)) & ~0xff00ff) + (((i_1124_ & 0xff00) * i_1125_ + ((i_1127_ & 0xff00) * i_1126_)) & 0xff0000)) >> 8;
									} else if (anInt8965 != 255) {
										int i_1128_ = ((i_1124_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_1129_ = ((i_1124_ & 0xff00) * anInt8974 & 0xff0000);
										int i_1130_ = ((i_1124_ & 0xff) * anInt8975 & 0xff00);
										i_1124_ = (i_1128_ | i_1129_ | i_1130_) >>> 8;
										int i_1131_ = is[i_1109_];
										is[i_1109_] = (((((i_1124_ & 0xff00ff) * anInt8965) + ((i_1131_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_1124_ & 0xff00) * anInt8965) + ((i_1131_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									} else {
										int i_1132_ = ((i_1124_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_1133_ = ((i_1124_ & 0xff00) * anInt8974 & 0xff0000);
										int i_1134_ = ((i_1124_ & 0xff) * anInt8975 & 0xff00);
										is[i_1109_] = (i_1132_ | i_1133_ | i_1134_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_1135_ = aByteArray11394[i_1108_];
								int i_1136_ = (i_1135_ > 0 ? anIntArray11393[i_1135_] : 0);
								int i_1137_ = anInt8944;
								int i_1138_ = i_1136_ + i_1137_;
								int i_1139_ = ((i_1136_ & 0xff00ff) + (i_1137_ & 0xff00ff));
								int i_1140_ = ((i_1139_ & 0x1000100) + (i_1138_ - i_1139_ & 0x10000));
								i_1140_ = i_1138_ - i_1140_ | i_1140_ - (i_1140_ >>> 8);
								if (i_1136_ == 0 && anInt8965 != 255) {
									i_1136_ = i_1140_;
									i_1140_ = is[i_1109_];
									i_1140_ = ((((i_1136_ & 0xff00ff) * anInt8965 + ((i_1140_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + (((i_1136_ & 0xff00) * anInt8965 + ((i_1140_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
								}
								is[i_1109_] = i_1140_;
							} else if (i == 2) {
								int i_1141_ = aByteArray11394[i_1108_];
								if (i_1141_ != 0) {
									int i_1142_ = anIntArray11393[i_1141_ & 0xff];
									int i_1143_ = ((i_1142_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_1144_ = ((i_1142_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_1109_++] = ((i_1143_ | i_1144_) >>> 8) + anInt8978;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_616_ == 2) {
							if (i == 1) {
								int i_1145_ = aByteArray11394[i_1108_];
								if (i_1145_ != 0) {
									int i_1146_ = anIntArray11393[i_1145_ & 0xff];
									int i_1147_ = is[i_1109_];
									int i_1148_ = i_1146_ + i_1147_;
									int i_1149_ = ((i_1146_ & 0xff00ff) + (i_1147_ & 0xff00ff));
									i_1147_ = ((i_1149_ & 0x1000100) + (i_1148_ - i_1149_ & 0x10000));
									is[i_1109_] = (i_1148_ - i_1147_ | i_1147_ - (i_1147_ >>> 8));
								}
							} else if (i == 0) {
								int i_1150_ = aByteArray11394[i_1108_];
								if (i_1150_ != 0) {
									int i_1151_ = anIntArray11393[i_1150_ & 0xff];
									int i_1152_ = ((i_1151_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_1153_ = ((i_1151_ & 0xff00) * anInt8974 & 0xff0000);
									int i_1154_ = ((i_1151_ & 0xff) * anInt8975 & 0xff00);
									i_1151_ = (i_1152_ | i_1153_ | i_1154_) >>> 8;
									int i_1155_ = is[i_1109_];
									int i_1156_ = i_1151_ + i_1155_;
									int i_1157_ = ((i_1151_ & 0xff00ff) + (i_1155_ & 0xff00ff));
									i_1155_ = ((i_1157_ & 0x1000100) + (i_1156_ - i_1157_ & 0x10000));
									is[i_1109_] = (i_1156_ - i_1155_ | i_1155_ - (i_1155_ >>> 8));
								}
							} else if (i == 3) {
								byte i_1158_ = aByteArray11394[i_1108_];
								int i_1159_ = (i_1158_ > 0 ? anIntArray11393[i_1158_] : 0);
								int i_1160_ = anInt8944;
								int i_1161_ = i_1159_ + i_1160_;
								int i_1162_ = ((i_1159_ & 0xff00ff) + (i_1160_ & 0xff00ff));
								int i_1163_ = ((i_1162_ & 0x1000100) + (i_1161_ - i_1162_ & 0x10000));
								i_1163_ = i_1161_ - i_1163_ | i_1163_ - (i_1163_ >>> 8);
								if (i_1159_ == 0 && anInt8965 != 255) {
									i_1159_ = i_1163_;
									i_1163_ = is[i_1109_];
									i_1163_ = ((((i_1159_ & 0xff00ff) * anInt8965 + ((i_1163_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + (((i_1159_ & 0xff00) * anInt8965 + ((i_1163_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
								}
								is[i_1109_] = i_1163_;
							} else if (i == 2) {
								int i_1164_ = aByteArray11394[i_1108_];
								if (i_1164_ != 0) {
									int i_1165_ = anIntArray11393[i_1164_ & 0xff];
									int i_1166_ = ((i_1165_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_1167_ = ((i_1165_ & 0xff00) * anInt8965 & 0xff0000);
									i_1165_ = (((i_1166_ | i_1167_) >>> 8) + anInt8978);
									int i_1168_ = is[i_1109_];
									int i_1169_ = i_1165_ + i_1168_;
									int i_1170_ = ((i_1165_ & 0xff00ff) + (i_1168_ & 0xff00ff));
									i_1168_ = ((i_1170_ & 0x1000100) + (i_1169_ - i_1170_ & 0x10000));
									is[i_1109_] = (i_1169_ - i_1168_ | i_1168_ - (i_1168_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_1103_ += anInt8960;
						i_1104_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				for (int i_1171_ = anInt8957; i_1171_ < 0; i_1171_++) {
					int i_1172_ = anInt8959;
					int i_1173_ = anInt8966 + anInt8968;
					int i_1174_ = anInt8967 + anInt8969;
					int i_1175_ = anInt8955;
					if (i_1173_ < 0) {
						int i_1176_ = (anInt8960 - 1 - i_1173_) / anInt8960;
						i_1175_ += i_1176_;
						i_1173_ += anInt8960 * i_1176_;
						i_1174_ += anInt8962 * i_1176_;
						i_1172_ += i_1176_;
					}
					int i_1177_;
					if ((i_1177_ = (1 + i_1173_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_1175_)
						i_1175_ = i_1177_;
					if (i_1174_ < 0) {
						i_1177_ = (anInt8962 - 1 - i_1174_) / anInt8962;
						i_1175_ += i_1177_;
						i_1173_ += anInt8960 * i_1177_;
						i_1174_ += anInt8962 * i_1177_;
						i_1172_ += i_1177_;
					}
					if ((i_1177_ = (1 + i_1174_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_1175_)
						i_1175_ = i_1177_;
					for (/**/; i_1175_ < 0; i_1175_++) {
						int i_1178_ = (i_1174_ >> 12) * anInt8945 + (i_1173_ >> 12);
						int i_1179_ = i_1172_++;
						if (i_616_ == 0) {
							if (i == 1)
								is[i_1179_] = (anIntArray11393[aByteArray11394[i_1178_] & 0xff]);
							else if (i == 0) {
								int i_1180_ = (anIntArray11393[aByteArray11394[i_1178_] & 0xff]);
								int i_1181_ = ((i_1180_ & 0xff0000) * anInt8973 & ~0xffffff);
								int i_1182_ = ((i_1180_ & 0xff00) * anInt8974 & 0xff0000);
								int i_1183_ = (i_1180_ & 0xff) * anInt8975 & 0xff00;
								is[i_1179_] = (i_1181_ | i_1182_ | i_1183_) >>> 8;
							} else if (i == 3) {
								int i_1184_ = (anIntArray11393[aByteArray11394[i_1178_] & 0xff]);
								int i_1185_ = anInt8944;
								int i_1186_ = i_1184_ + i_1185_;
								int i_1187_ = ((i_1184_ & 0xff00ff) + (i_1185_ & 0xff00ff));
								int i_1188_ = ((i_1187_ & 0x1000100) + (i_1186_ - i_1187_ & 0x10000));
								is[i_1179_] = i_1186_ - i_1188_ | i_1188_ - (i_1188_ >>> 8);
							} else if (i == 2) {
								int i_1189_ = (anIntArray11393[aByteArray11394[i_1178_] & 0xff]);
								int i_1190_ = ((i_1189_ & 0xff00ff) * anInt8965 & ~0xff00ff);
								int i_1191_ = ((i_1189_ & 0xff00) * anInt8965 & 0xff0000);
								is[i_1179_] = ((i_1190_ | i_1191_) >>> 8) + anInt8978;
							} else
								throw new IllegalArgumentException();
						} else if (i_616_ == 1) {
							if (i == 1) {
								int i_1192_ = aByteArray11394[i_1178_];
								if (i_1192_ != 0)
									is[i_1179_] = anIntArray11393[i_1192_ & 0xff];
							} else if (i == 0) {
								int i_1193_ = aByteArray11394[i_1178_];
								if (i_1193_ != 0) {
									int i_1194_ = anIntArray11393[i_1193_ & 0xff];
									if ((anInt8944 & 0xffffff) == 16777215) {
										int i_1195_ = anInt8944 >>> 24;
										int i_1196_ = 256 - i_1195_;
										int i_1197_ = is[i_1179_];
										is[i_1179_] = ((((i_1194_ & 0xff00ff) * i_1195_ + ((i_1197_ & 0xff00ff) * i_1196_)) & ~0xff00ff) + (((i_1194_ & 0xff00) * i_1195_ + ((i_1197_ & 0xff00) * i_1196_)) & 0xff0000)) >> 8;
									} else if (anInt8965 != 255) {
										int i_1198_ = ((i_1194_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_1199_ = ((i_1194_ & 0xff00) * anInt8974 & 0xff0000);
										int i_1200_ = ((i_1194_ & 0xff) * anInt8975 & 0xff00);
										i_1194_ = (i_1198_ | i_1199_ | i_1200_) >>> 8;
										int i_1201_ = is[i_1179_];
										is[i_1179_] = (((((i_1194_ & 0xff00ff) * anInt8965) + ((i_1201_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_1194_ & 0xff00) * anInt8965) + ((i_1201_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									} else {
										int i_1202_ = ((i_1194_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_1203_ = ((i_1194_ & 0xff00) * anInt8974 & 0xff0000);
										int i_1204_ = ((i_1194_ & 0xff) * anInt8975 & 0xff00);
										is[i_1179_] = (i_1202_ | i_1203_ | i_1204_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_1205_ = aByteArray11394[i_1178_];
								int i_1206_ = (i_1205_ > 0 ? anIntArray11393[i_1205_] : 0);
								int i_1207_ = anInt8944;
								int i_1208_ = i_1206_ + i_1207_;
								int i_1209_ = ((i_1206_ & 0xff00ff) + (i_1207_ & 0xff00ff));
								int i_1210_ = ((i_1209_ & 0x1000100) + (i_1208_ - i_1209_ & 0x10000));
								i_1210_ = i_1208_ - i_1210_ | i_1210_ - (i_1210_ >>> 8);
								if (i_1206_ == 0 && anInt8965 != 255) {
									i_1206_ = i_1210_;
									i_1210_ = is[i_1179_];
									i_1210_ = ((((i_1206_ & 0xff00ff) * anInt8965 + ((i_1210_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + (((i_1206_ & 0xff00) * anInt8965 + ((i_1210_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
								}
								is[i_1179_] = i_1210_;
							} else if (i == 2) {
								int i_1211_ = aByteArray11394[i_1178_];
								if (i_1211_ != 0) {
									int i_1212_ = anIntArray11393[i_1211_ & 0xff];
									int i_1213_ = ((i_1212_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_1214_ = ((i_1212_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_1179_++] = ((i_1213_ | i_1214_) >>> 8) + anInt8978;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_616_ == 2) {
							if (i == 1) {
								int i_1215_ = aByteArray11394[i_1178_];
								if (i_1215_ != 0) {
									int i_1216_ = anIntArray11393[i_1215_ & 0xff];
									int i_1217_ = is[i_1179_];
									int i_1218_ = i_1216_ + i_1217_;
									int i_1219_ = ((i_1216_ & 0xff00ff) + (i_1217_ & 0xff00ff));
									i_1217_ = ((i_1219_ & 0x1000100) + (i_1218_ - i_1219_ & 0x10000));
									is[i_1179_] = (i_1218_ - i_1217_ | i_1217_ - (i_1217_ >>> 8));
								}
							} else if (i == 0) {
								int i_1220_ = aByteArray11394[i_1178_];
								if (i_1220_ != 0) {
									int i_1221_ = anIntArray11393[i_1220_ & 0xff];
									int i_1222_ = ((i_1221_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_1223_ = ((i_1221_ & 0xff00) * anInt8974 & 0xff0000);
									int i_1224_ = ((i_1221_ & 0xff) * anInt8975 & 0xff00);
									i_1221_ = (i_1222_ | i_1223_ | i_1224_) >>> 8;
									int i_1225_ = is[i_1179_];
									int i_1226_ = i_1221_ + i_1225_;
									int i_1227_ = ((i_1221_ & 0xff00ff) + (i_1225_ & 0xff00ff));
									i_1225_ = ((i_1227_ & 0x1000100) + (i_1226_ - i_1227_ & 0x10000));
									is[i_1179_] = (i_1226_ - i_1225_ | i_1225_ - (i_1225_ >>> 8));
								}
							} else if (i == 3) {
								byte i_1228_ = aByteArray11394[i_1178_];
								int i_1229_ = (i_1228_ > 0 ? anIntArray11393[i_1228_] : 0);
								int i_1230_ = anInt8944;
								int i_1231_ = i_1229_ + i_1230_;
								int i_1232_ = ((i_1229_ & 0xff00ff) + (i_1230_ & 0xff00ff));
								int i_1233_ = ((i_1232_ & 0x1000100) + (i_1231_ - i_1232_ & 0x10000));
								i_1233_ = i_1231_ - i_1233_ | i_1233_ - (i_1233_ >>> 8);
								if (i_1229_ == 0 && anInt8965 != 255) {
									i_1229_ = i_1233_;
									i_1233_ = is[i_1179_];
									i_1233_ = ((((i_1229_ & 0xff00ff) * anInt8965 + ((i_1233_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + (((i_1229_ & 0xff00) * anInt8965 + ((i_1233_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
								}
								is[i_1179_] = i_1233_;
							} else if (i == 2) {
								int i_1234_ = aByteArray11394[i_1178_];
								if (i_1234_ != 0) {
									int i_1235_ = anIntArray11393[i_1234_ & 0xff];
									int i_1236_ = ((i_1235_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_1237_ = ((i_1235_ & 0xff00) * anInt8965 & 0xff0000);
									i_1235_ = (((i_1236_ | i_1237_) >>> 8) + anInt8978);
									int i_1238_ = is[i_1179_];
									int i_1239_ = i_1235_ + i_1238_;
									int i_1240_ = ((i_1235_ & 0xff00ff) + (i_1238_ & 0xff00ff));
									i_1238_ = ((i_1240_ & 0x1000100) + (i_1239_ - i_1240_ & 0x10000));
									is[i_1179_] = (i_1239_ - i_1238_ | i_1238_ - (i_1238_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_1173_ += anInt8960;
						i_1174_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	public void method1761(int i, int i_1241_, int i_1242_, int i_1243_, int[] is, int[] is_1244_, int i_1245_, int i_1246_) {
		throw new IllegalStateException();
	}

	public void method1743(int i, int i_1247_, int i_1248_, int i_1249_, int[] is, int i_1250_, int i_1251_) {
		throw new IllegalStateException();
	}

	public void method1757(int i, int i_1252_, int i_1253_, int i_1254_, int[] is, int i_1255_, int i_1256_) {
		throw new IllegalStateException();
	}

	void method8429(boolean bool, boolean bool_1257_, boolean bool_1258_, int i, int i_1259_, float f, int i_1260_, int i_1261_, int i_1262_, int i_1263_, int i_1264_, int i_1265_, boolean bool_1266_) {
		if (i_1260_ > 0 && i_1261_ > 0 && (bool || bool_1257_)) {
			int i_1267_ = 0;
			int i_1268_ = 0;
			int i_1269_ = anInt8977 + anInt8945 + anInt8948;
			int i_1270_ = anInt8947 + anInt8950 + anInt8952;
			int i_1271_ = (i_1269_ << 16) / i_1260_;
			int i_1272_ = (i_1270_ << 16) / i_1261_;
			if (anInt8977 > 0) {
				int i_1273_ = ((anInt8977 << 16) + i_1271_ - 1) / i_1271_;
				i += i_1273_;
				i_1267_ += i_1273_ * i_1271_ - (anInt8977 << 16);
			}
			if (anInt8947 > 0) {
				int i_1274_ = ((anInt8947 << 16) + i_1272_ - 1) / i_1272_;
				i_1259_ += i_1274_;
				i_1268_ += i_1274_ * i_1272_ - (anInt8947 << 16);
			}
			if (anInt8945 < i_1269_)
				i_1260_ = ((anInt8945 << 16) - i_1267_ + i_1271_ - 1) / i_1271_;
			if (anInt8950 < i_1270_)
				i_1261_ = ((anInt8950 << 16) - i_1268_ + i_1272_ - 1) / i_1272_;
			int i_1275_ = i + i_1259_ * (aClass167_Sub1_8946.anInt8997 * -570111553);
			int i_1276_ = aClass167_Sub1_8946.anInt8997 * -570111553 - i_1260_;
			if (i_1259_ + i_1261_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_1261_ -= (i_1259_ + i_1261_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i_1259_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_1277_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_1259_;
				i_1261_ -= i_1277_;
				i_1275_ += i_1277_ * (aClass167_Sub1_8946.anInt8997 * -570111553);
				i_1268_ += i_1272_ * i_1277_;
			}
			if (i + i_1260_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_1278_ = i + i_1260_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_1260_ -= i_1278_;
				i_1276_ += i_1278_;
			}
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_1279_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_1260_ -= i_1279_;
				i_1275_ += i_1279_;
				i_1267_ += i_1271_ * i_1279_;
				i_1276_ += i_1279_;
			}
			float[] fs = aClass167_Sub1_8946.aFloatArray8999;
			int[] is = aClass167_Sub1_8946.anIntArray8996;
			if (i_1264_ == 0) {
				if (i_1262_ == 1) {
					int i_1280_ = i_1267_;
					for (int i_1281_ = -i_1261_; i_1281_ < 0; i_1281_++) {
						int i_1282_ = (i_1268_ >> 16) * anInt8945;
						for (int i_1283_ = -i_1260_; i_1283_ < 0; i_1283_++) {
							if (!bool_1257_ || f < fs[i_1275_]) {
								if (bool)
									is[i_1275_] = (anIntArray11393[((aByteArray11394[(i_1267_ >> 16) + i_1282_]) & 0xff)]);
								if (bool_1257_ && bool_1266_)
									fs[i_1275_] = f;
							}
							i_1267_ += i_1271_;
							i_1275_++;
						}
						i_1268_ += i_1272_;
						i_1267_ = i_1280_;
						i_1275_ += i_1276_;
					}
				} else if (i_1262_ == 0) {
					int i_1284_ = (i_1263_ & 0xff0000) >> 16;
					int i_1285_ = (i_1263_ & 0xff00) >> 8;
					int i_1286_ = i_1263_ & 0xff;
					int i_1287_ = i_1267_;
					for (int i_1288_ = -i_1261_; i_1288_ < 0; i_1288_++) {
						int i_1289_ = (i_1268_ >> 16) * anInt8945;
						for (int i_1290_ = -i_1260_; i_1290_ < 0; i_1290_++) {
							if (!bool_1257_ || f < fs[i_1275_]) {
								if (bool) {
									int i_1291_ = (anIntArray11393[((aByteArray11394[(i_1267_ >> 16) + i_1289_]) & 0xff)]);
									int i_1292_ = ((i_1291_ & 0xff0000) * i_1284_ & ~0xffffff);
									int i_1293_ = ((i_1291_ & 0xff00) * i_1285_ & 0xff0000);
									int i_1294_ = (i_1291_ & 0xff) * i_1286_ & 0xff00;
									is[i_1275_] = (i_1292_ | i_1293_ | i_1294_) >>> 8;
								}
								if (bool_1257_ && bool_1266_)
									fs[i_1275_] = f;
							}
							i_1267_ += i_1271_;
							i_1275_++;
						}
						i_1268_ += i_1272_;
						i_1267_ = i_1287_;
						i_1275_ += i_1276_;
					}
				} else if (i_1262_ == 3) {
					int i_1295_ = i_1267_;
					for (int i_1296_ = -i_1261_; i_1296_ < 0; i_1296_++) {
						int i_1297_ = (i_1268_ >> 16) * anInt8945;
						for (int i_1298_ = -i_1260_; i_1298_ < 0; i_1298_++) {
							if (!bool_1257_ || f < fs[i_1275_]) {
								if (bool) {
									byte i_1299_ = (aByteArray11394[(i_1267_ >> 16) + i_1297_]);
									int i_1300_ = (i_1299_ > 0 ? anIntArray11393[i_1299_] : 0);
									int i_1301_ = i_1300_ + i_1263_;
									int i_1302_ = ((i_1300_ & 0xff00ff) + (i_1263_ & 0xff00ff));
									int i_1303_ = ((i_1302_ & 0x1000100) + (i_1301_ - i_1302_ & 0x10000));
									is[i_1275_] = (i_1301_ - i_1303_ | i_1303_ - (i_1303_ >>> 8));
								}
								if (bool_1257_ && bool_1266_)
									fs[i_1275_] = f;
							}
							i_1267_ += i_1271_;
							i_1275_++;
						}
						i_1268_ += i_1272_;
						i_1267_ = i_1295_;
						i_1275_ += i_1276_;
					}
				} else if (i_1262_ == 2) {
					int i_1304_ = i_1263_ >>> 24;
					int i_1305_ = 256 - i_1304_;
					int i_1306_ = (i_1263_ & 0xff00ff) * i_1305_ & ~0xff00ff;
					int i_1307_ = (i_1263_ & 0xff00) * i_1305_ & 0xff0000;
					i_1263_ = (i_1306_ | i_1307_) >>> 8;
					int i_1308_ = i_1267_;
					for (int i_1309_ = -i_1261_; i_1309_ < 0; i_1309_++) {
						int i_1310_ = (i_1268_ >> 16) * anInt8945;
						for (int i_1311_ = -i_1260_; i_1311_ < 0; i_1311_++) {
							if (!bool_1257_ || f < fs[i_1275_]) {
								if (bool) {
									int i_1312_ = (anIntArray11393[((aByteArray11394[(i_1267_ >> 16) + i_1310_]) & 0xff)]);
									i_1306_ = ((i_1312_ & 0xff00ff) * i_1304_ & ~0xff00ff);
									i_1307_ = ((i_1312_ & 0xff00) * i_1304_ & 0xff0000);
									is[i_1275_] = (((i_1306_ | i_1307_) >>> 8) + i_1263_);
								}
								if (bool_1257_ && bool_1266_)
									fs[i_1275_] = f;
							}
							i_1267_ += i_1271_;
							i_1275_++;
						}
						i_1268_ += i_1272_;
						i_1267_ = i_1308_;
						i_1275_ += i_1276_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1264_ == 1) {
				if (i_1262_ == 1) {
					int i_1313_ = i_1267_;
					for (int i_1314_ = -i_1261_; i_1314_ < 0; i_1314_++) {
						int i_1315_ = (i_1268_ >> 16) * anInt8945;
						for (int i_1316_ = -i_1260_; i_1316_ < 0; i_1316_++) {
							if (!bool_1257_ || f < fs[i_1275_]) {
								int i_1317_ = (aByteArray11394[(i_1267_ >> 16) + i_1315_]);
								if (i_1317_ != 0) {
									if (bool)
										is[i_1275_] = anIntArray11393[i_1317_ & 0xff];
									if (bool_1257_ && bool_1266_)
										fs[i_1275_] = f;
								}
							}
							i_1267_ += i_1271_;
							i_1275_++;
						}
						i_1268_ += i_1272_;
						i_1267_ = i_1313_;
						i_1275_ += i_1276_;
					}
				} else if (i_1262_ == 0) {
					int i_1318_ = i_1267_;
					if ((i_1263_ & 0xffffff) == 16777215) {
						int i_1319_ = i_1263_ >>> 24;
						int i_1320_ = 256 - i_1319_;
						for (int i_1321_ = -i_1261_; i_1321_ < 0; i_1321_++) {
							int i_1322_ = (i_1268_ >> 16) * anInt8945;
							for (int i_1323_ = -i_1260_; i_1323_ < 0; i_1323_++) {
								if (!bool_1257_ || f < fs[i_1275_]) {
									int i_1324_ = (aByteArray11394[(i_1267_ >> 16) + i_1322_]);
									if (i_1324_ != 0) {
										if (bool) {
											int i_1325_ = (anIntArray11393[i_1324_ & 0xff]);
											int i_1326_ = is[i_1275_];
											is[i_1275_] = (((((i_1325_ & 0xff00ff) * i_1319_) + ((i_1326_ & 0xff00ff) * i_1320_)) & ~0xff00ff) + ((((i_1325_ & 0xff00) * i_1319_) + ((i_1326_ & 0xff00) * i_1320_)) & 0xff0000)) >> 8;
										}
										if (bool_1257_ && bool_1266_)
											fs[i_1275_] = f;
									}
								}
								i_1267_ += i_1271_;
								i_1275_++;
							}
							i_1268_ += i_1272_;
							i_1267_ = i_1318_;
							i_1275_ += i_1276_;
						}
					} else {
						int i_1327_ = (i_1263_ & 0xff0000) >> 16;
						int i_1328_ = (i_1263_ & 0xff00) >> 8;
						int i_1329_ = i_1263_ & 0xff;
						int i_1330_ = i_1263_ >>> 24;
						int i_1331_ = 256 - i_1330_;
						for (int i_1332_ = -i_1261_; i_1332_ < 0; i_1332_++) {
							int i_1333_ = (i_1268_ >> 16) * anInt8945;
							for (int i_1334_ = -i_1260_; i_1334_ < 0; i_1334_++) {
								if (!bool_1257_ || f < fs[i_1275_]) {
									int i_1335_ = (aByteArray11394[(i_1267_ >> 16) + i_1333_]);
									if (i_1335_ != 0) {
										int i_1336_ = anIntArray11393[i_1335_ & 0xff];
										if (i_1330_ != 255) {
											if (bool) {
												int i_1337_ = (((i_1336_ & 0xff0000) * i_1327_) & ~0xffffff);
												int i_1338_ = (((i_1336_ & 0xff00) * i_1328_) & 0xff0000);
												int i_1339_ = (((i_1336_ & 0xff) * i_1329_) & 0xff00);
												i_1336_ = (i_1337_ | i_1338_ | i_1339_) >>> 8;
												int i_1340_ = is[i_1275_];
												is[i_1275_] = (((((i_1336_ & 0xff00ff) * i_1330_) + ((i_1340_ & 0xff00ff) * i_1331_)) & ~0xff00ff) + ((((i_1336_ & 0xff00) * i_1330_) + ((i_1340_ & 0xff00) * i_1331_)) & 0xff0000)) >> 8;
											}
											if (bool_1257_ && bool_1266_)
												fs[i_1275_] = f;
										} else {
											if (bool) {
												int i_1341_ = (((i_1336_ & 0xff0000) * i_1327_) & ~0xffffff);
												int i_1342_ = (((i_1336_ & 0xff00) * i_1328_) & 0xff0000);
												int i_1343_ = (((i_1336_ & 0xff) * i_1329_) & 0xff00);
												is[i_1275_] = (i_1341_ | i_1342_ | i_1343_) >>> 8;
											}
											if (bool_1257_ && bool_1266_)
												fs[i_1275_] = f;
										}
									}
								}
								i_1267_ += i_1271_;
								i_1275_++;
							}
							i_1268_ += i_1272_;
							i_1267_ = i_1318_;
							i_1275_ += i_1276_;
						}
					}
				} else if (i_1262_ == 3) {
					int i_1344_ = i_1267_;
					int i_1345_ = i_1263_ >>> 24;
					int i_1346_ = 256 - i_1345_;
					for (int i_1347_ = -i_1261_; i_1347_ < 0; i_1347_++) {
						int i_1348_ = (i_1268_ >> 16) * anInt8945;
						for (int i_1349_ = -i_1260_; i_1349_ < 0; i_1349_++) {
							if (!bool_1257_ || f < fs[i_1275_]) {
								if (bool) {
									byte i_1350_ = (aByteArray11394[(i_1267_ >> 16) + i_1348_]);
									int i_1351_ = (i_1350_ > 0 ? anIntArray11393[i_1350_] : 0);
									int i_1352_ = i_1351_ + i_1263_;
									int i_1353_ = ((i_1351_ & 0xff00ff) + (i_1263_ & 0xff00ff));
									int i_1354_ = ((i_1353_ & 0x1000100) + (i_1352_ - i_1353_ & 0x10000));
									i_1354_ = (i_1352_ - i_1354_ | i_1354_ - (i_1354_ >>> 8));
									if (i_1351_ == 0 && i_1345_ != 255) {
										i_1351_ = i_1354_;
										i_1354_ = is[i_1275_];
										i_1354_ = ((((i_1351_ & 0xff00ff) * i_1345_ + ((i_1354_ & 0xff00ff) * i_1346_)) & ~0xff00ff) + (((i_1351_ & 0xff00) * i_1345_ + ((i_1354_ & 0xff00) * i_1346_)) & 0xff0000)) >> 8;
									}
									is[i_1275_] = i_1354_;
								}
								if (bool_1257_ && bool_1266_)
									fs[i_1275_] = f;
							}
							i_1267_ += i_1271_;
							i_1275_++;
						}
						i_1268_ += i_1272_;
						i_1267_ = i_1344_;
						i_1275_ += i_1276_;
					}
				} else if (i_1262_ == 2) {
					int i_1355_ = i_1263_ >>> 24;
					int i_1356_ = 256 - i_1355_;
					int i_1357_ = (i_1263_ & 0xff00ff) * i_1356_ & ~0xff00ff;
					int i_1358_ = (i_1263_ & 0xff00) * i_1356_ & 0xff0000;
					i_1263_ = (i_1357_ | i_1358_) >>> 8;
					int i_1359_ = i_1267_;
					for (int i_1360_ = -i_1261_; i_1360_ < 0; i_1360_++) {
						int i_1361_ = (i_1268_ >> 16) * anInt8945;
						for (int i_1362_ = -i_1260_; i_1362_ < 0; i_1362_++) {
							if (!bool_1257_ || f < fs[i_1275_]) {
								int i_1363_ = (aByteArray11394[(i_1267_ >> 16) + i_1361_]);
								if (i_1363_ != 0) {
									if (bool) {
										int i_1364_ = anIntArray11393[i_1363_ & 0xff];
										i_1357_ = ((i_1364_ & 0xff00ff) * i_1355_ & ~0xff00ff);
										i_1358_ = ((i_1364_ & 0xff00) * i_1355_ & 0xff0000);
										is[i_1275_] = ((i_1357_ | i_1358_) >>> 8) + i_1263_;
									}
									if (bool_1257_ && bool_1266_)
										fs[i_1275_] = f;
								}
							}
							i_1267_ += i_1271_;
							i_1275_++;
						}
						i_1268_ += i_1272_;
						i_1267_ = i_1359_;
						i_1275_ += i_1276_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1264_ == 2) {
				if (i_1262_ == 1) {
					int i_1365_ = i_1267_;
					for (int i_1366_ = -i_1261_; i_1366_ < 0; i_1366_++) {
						int i_1367_ = (i_1268_ >> 16) * anInt8945;
						for (int i_1368_ = -i_1260_; i_1368_ < 0; i_1368_++) {
							if (!bool_1257_ || f < fs[i_1275_]) {
								int i_1369_ = (aByteArray11394[(i_1267_ >> 16) + i_1367_]);
								if (i_1369_ != 0) {
									if (bool) {
										int i_1370_ = anIntArray11393[i_1369_ & 0xff];
										int i_1371_ = is[i_1275_];
										int i_1372_ = i_1370_ + i_1371_;
										int i_1373_ = ((i_1370_ & 0xff00ff) + (i_1371_ & 0xff00ff));
										i_1371_ = ((i_1373_ & 0x1000100) + (i_1372_ - i_1373_ & 0x10000));
										is[i_1275_] = (i_1372_ - i_1371_ | i_1371_ - (i_1371_ >>> 8));
									}
									if (bool_1257_ && bool_1266_)
										fs[i_1275_] = f;
								}
							}
							i_1267_ += i_1271_;
							i_1275_++;
						}
						i_1268_ += i_1272_;
						i_1267_ = i_1365_;
						i_1275_ += i_1276_;
					}
				} else if (i_1262_ == 0) {
					int i_1374_ = i_1267_;
					int i_1375_ = (i_1263_ & 0xff0000) >> 16;
					int i_1376_ = (i_1263_ & 0xff00) >> 8;
					int i_1377_ = i_1263_ & 0xff;
					for (int i_1378_ = -i_1261_; i_1378_ < 0; i_1378_++) {
						int i_1379_ = (i_1268_ >> 16) * anInt8945;
						for (int i_1380_ = -i_1260_; i_1380_ < 0; i_1380_++) {
							if (!bool_1257_ || f < fs[i_1275_]) {
								int i_1381_ = (aByteArray11394[(i_1267_ >> 16) + i_1379_]);
								if (i_1381_ != 0) {
									if (bool) {
										int i_1382_ = anIntArray11393[i_1381_ & 0xff];
										int i_1383_ = ((i_1382_ & 0xff0000) * i_1375_ & ~0xffffff);
										int i_1384_ = ((i_1382_ & 0xff00) * i_1376_ & 0xff0000);
										int i_1385_ = ((i_1382_ & 0xff) * i_1377_ & 0xff00);
										i_1382_ = (i_1383_ | i_1384_ | i_1385_) >>> 8;
										int i_1386_ = is[i_1275_];
										int i_1387_ = i_1382_ + i_1386_;
										int i_1388_ = ((i_1382_ & 0xff00ff) + (i_1386_ & 0xff00ff));
										i_1386_ = ((i_1388_ & 0x1000100) + (i_1387_ - i_1388_ & 0x10000));
										is[i_1275_] = (i_1387_ - i_1386_ | i_1386_ - (i_1386_ >>> 8));
									}
									if (bool_1257_ && bool_1266_)
										fs[i_1275_] = f;
								}
							}
							i_1267_ += i_1271_;
							i_1275_++;
						}
						i_1268_ += i_1272_;
						i_1267_ = i_1374_;
						i_1275_ += i_1276_;
					}
				} else if (i_1262_ == 3) {
					int i_1389_ = i_1267_;
					for (int i_1390_ = -i_1261_; i_1390_ < 0; i_1390_++) {
						int i_1391_ = (i_1268_ >> 16) * anInt8945;
						for (int i_1392_ = -i_1260_; i_1392_ < 0; i_1392_++) {
							if (!bool_1257_ || f < fs[i_1275_]) {
								if (bool) {
									byte i_1393_ = (aByteArray11394[(i_1267_ >> 16) + i_1391_]);
									int i_1394_ = (i_1393_ > 0 ? anIntArray11393[i_1393_] : 0);
									int i_1395_ = i_1394_ + i_1263_;
									int i_1396_ = ((i_1394_ & 0xff00ff) + (i_1263_ & 0xff00ff));
									int i_1397_ = ((i_1396_ & 0x1000100) + (i_1395_ - i_1396_ & 0x10000));
									i_1394_ = (i_1395_ - i_1397_ | i_1397_ - (i_1397_ >>> 8));
									i_1397_ = is[i_1275_];
									i_1395_ = i_1394_ + i_1397_;
									i_1396_ = (i_1394_ & 0xff00ff) + (i_1397_ & 0xff00ff);
									i_1397_ = ((i_1396_ & 0x1000100) + (i_1395_ - i_1396_ & 0x10000));
									is[i_1275_] = (i_1395_ - i_1397_ | i_1397_ - (i_1397_ >>> 8));
								}
								if (bool_1257_ && bool_1266_)
									fs[i_1275_] = f;
							}
							i_1267_ += i_1271_;
							i_1275_++;
						}
						i_1268_ += i_1272_;
						i_1267_ = i_1389_;
						i_1275_ += i_1276_;
					}
				} else if (i_1262_ == 2) {
					int i_1398_ = i_1263_ >>> 24;
					int i_1399_ = 256 - i_1398_;
					int i_1400_ = (i_1263_ & 0xff00ff) * i_1399_ & ~0xff00ff;
					int i_1401_ = (i_1263_ & 0xff00) * i_1399_ & 0xff0000;
					i_1263_ = (i_1400_ | i_1401_) >>> 8;
					int i_1402_ = i_1267_;
					for (int i_1403_ = -i_1261_; i_1403_ < 0; i_1403_++) {
						int i_1404_ = (i_1268_ >> 16) * anInt8945;
						for (int i_1405_ = -i_1260_; i_1405_ < 0; i_1405_++) {
							if (!bool_1257_ || f < fs[i_1275_]) {
								int i_1406_ = (aByteArray11394[(i_1267_ >> 16) + i_1404_]);
								if (i_1406_ != 0) {
									if (bool) {
										int i_1407_ = anIntArray11393[i_1406_ & 0xff];
										i_1400_ = ((i_1407_ & 0xff00ff) * i_1398_ & ~0xff00ff);
										i_1401_ = ((i_1407_ & 0xff00) * i_1398_ & 0xff0000);
										i_1407_ = (((i_1400_ | i_1401_) >>> 8) + i_1263_);
										int i_1408_ = is[i_1275_];
										int i_1409_ = i_1407_ + i_1408_;
										int i_1410_ = ((i_1407_ & 0xff00ff) + (i_1408_ & 0xff00ff));
										i_1408_ = ((i_1410_ & 0x1000100) + (i_1409_ - i_1410_ & 0x10000));
										is[i_1275_] = (i_1409_ - i_1408_ | i_1408_ - (i_1408_ >>> 8));
									}
									if (bool_1257_ && bool_1266_)
										fs[i_1275_] = f;
								}
							}
							i_1267_ += i_1271_;
							i_1275_++;
						}
						i_1268_ += i_1272_;
						i_1267_ = i_1402_;
						i_1275_ += i_1276_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method1746(int i, int i_1411_, int i_1412_, int i_1413_, int[] is, int[] is_1414_, int i_1415_, int i_1416_) {
		throw new IllegalStateException();
	}

	public void method1747(int i, int i_1417_, int i_1418_, int i_1419_, int[] is, int[] is_1420_, int i_1421_, int i_1422_) {
		throw new IllegalStateException();
	}

	public void method1748(int i, int i_1423_, int i_1424_, int i_1425_, int i_1426_, int i_1427_) {
		throw new IllegalStateException();
	}

	public void method1745(int i, int i_1428_, int i_1429_, int i_1430_, int[] is, int i_1431_, int i_1432_) {
		throw new IllegalStateException();
	}

	public void method1755(int i, int i_1433_, int i_1434_, int i_1435_, int i_1436_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			int i_1437_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			i += anInt8977;
			i_1433_ += anInt8947;
			int i_1438_ = i_1433_ * i_1437_ + i;
			int i_1439_ = 0;
			int i_1440_ = anInt8950;
			int i_1441_ = anInt8945;
			int i_1442_ = i_1437_ - i_1441_;
			int i_1443_ = 0;
			if (i_1433_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_1444_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_1433_;
				i_1440_ -= i_1444_;
				i_1433_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_1439_ += i_1444_ * i_1441_;
				i_1438_ += i_1444_ * i_1437_;
			}
			if (i_1433_ + i_1440_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_1440_ -= (i_1433_ + i_1440_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_1445_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_1441_ -= i_1445_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_1439_ += i_1445_;
				i_1438_ += i_1445_;
				i_1443_ += i_1445_;
				i_1442_ += i_1445_;
			}
			if (i + i_1441_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_1446_ = i + i_1441_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_1441_ -= i_1446_;
				i_1443_ += i_1446_;
				i_1442_ += i_1446_;
			}
			if (i_1441_ > 0 && i_1440_ > 0) {
				if (i_1436_ == 0) {
					if (i_1434_ == 1) {
						for (int i_1447_ = -i_1440_; i_1447_ < 0; i_1447_++) {
							int i_1448_ = i_1438_ + i_1441_ - 3;
							while (i_1438_ < i_1448_) {
								is[i_1438_++] = (anIntArray11393[aByteArray11394[i_1439_++] & 0xff]);
								is[i_1438_++] = (anIntArray11393[aByteArray11394[i_1439_++] & 0xff]);
								is[i_1438_++] = (anIntArray11393[aByteArray11394[i_1439_++] & 0xff]);
								is[i_1438_++] = (anIntArray11393[aByteArray11394[i_1439_++] & 0xff]);
							}
							i_1448_ += 3;
							while (i_1438_ < i_1448_)
								is[i_1438_++] = (anIntArray11393[aByteArray11394[i_1439_++] & 0xff]);
							i_1438_ += i_1442_;
							i_1439_ += i_1443_;
						}
					} else if (i_1434_ == 0) {
						int i_1449_ = (i_1435_ & 0xff0000) >> 16;
						int i_1450_ = (i_1435_ & 0xff00) >> 8;
						int i_1451_ = i_1435_ & 0xff;
						for (int i_1452_ = -i_1440_; i_1452_ < 0; i_1452_++) {
							for (int i_1453_ = -i_1441_; i_1453_ < 0; i_1453_++) {
								int i_1454_ = (anIntArray11393[aByteArray11394[i_1439_++] & 0xff]);
								int i_1455_ = ((i_1454_ & 0xff0000) * i_1449_ & ~0xffffff);
								int i_1456_ = (i_1454_ & 0xff00) * i_1450_ & 0xff0000;
								int i_1457_ = (i_1454_ & 0xff) * i_1451_ & 0xff00;
								is[i_1438_++] = (i_1455_ | i_1456_ | i_1457_) >>> 8;
							}
							i_1438_ += i_1442_;
							i_1439_ += i_1443_;
						}
					} else if (i_1434_ == 3) {
						for (int i_1458_ = -i_1440_; i_1458_ < 0; i_1458_++) {
							for (int i_1459_ = -i_1441_; i_1459_ < 0; i_1459_++) {
								int i_1460_ = (anIntArray11393[aByteArray11394[i_1439_++] & 0xff]);
								int i_1461_ = i_1460_ + i_1435_;
								int i_1462_ = ((i_1460_ & 0xff00ff) + (i_1435_ & 0xff00ff));
								int i_1463_ = ((i_1462_ & 0x1000100) + (i_1461_ - i_1462_ & 0x10000));
								is[i_1438_++] = i_1461_ - i_1463_ | i_1463_ - (i_1463_ >>> 8);
							}
							i_1438_ += i_1442_;
							i_1439_ += i_1443_;
						}
					} else if (i_1434_ == 2) {
						int i_1464_ = i_1435_ >>> 24;
						int i_1465_ = 256 - i_1464_;
						int i_1466_ = (i_1435_ & 0xff00ff) * i_1465_ & ~0xff00ff;
						int i_1467_ = (i_1435_ & 0xff00) * i_1465_ & 0xff0000;
						i_1435_ = (i_1466_ | i_1467_) >>> 8;
						for (int i_1468_ = -i_1440_; i_1468_ < 0; i_1468_++) {
							for (int i_1469_ = -i_1441_; i_1469_ < 0; i_1469_++) {
								int i_1470_ = (anIntArray11393[aByteArray11394[i_1439_++] & 0xff]);
								i_1466_ = ((i_1470_ & 0xff00ff) * i_1464_ & ~0xff00ff);
								i_1467_ = (i_1470_ & 0xff00) * i_1464_ & 0xff0000;
								is[i_1438_++] = ((i_1466_ | i_1467_) >>> 8) + i_1435_;
							}
							i_1438_ += i_1442_;
							i_1439_ += i_1443_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1436_ == 1) {
					if (i_1434_ == 1) {
						for (int i_1471_ = -i_1440_; i_1471_ < 0; i_1471_++) {
							for (int i_1472_ = -i_1441_; i_1472_ < 0; i_1472_++) {
								int i_1473_ = aByteArray11394[i_1439_++];
								if (i_1473_ != 0) {
									int i_1474_ = (anIntArray11393[i_1473_ & 0xff] | ~0xffffff);
									int i_1475_ = 255;
									int i_1476_ = 0;
									int i_1477_ = is[i_1438_];
									is[i_1438_++] = (((((i_1474_ & 0xff00ff) * i_1475_ + (i_1477_ & 0xff00ff) * i_1476_) & ~0xff00ff) >> 8) + (((((i_1474_ & ~0xff00ff) >>> 8) * i_1475_) + (((i_1477_ & ~0xff00ff) >>> 8) * i_1476_)) & ~0xff00ff));
								} else
									i_1438_++;
							}
							i_1438_ += i_1442_;
							i_1439_ += i_1443_;
						}
					} else if (i_1434_ == 0) {
						if ((i_1435_ & 0xffffff) == 16777215) {
							int i_1478_ = i_1435_ >>> 24;
							int i_1479_ = 256 - i_1478_;
							for (int i_1480_ = -i_1440_; i_1480_ < 0; i_1480_++) {
								for (int i_1481_ = -i_1441_; i_1481_ < 0; i_1481_++) {
									int i_1482_ = aByteArray11394[i_1439_++];
									if (i_1482_ != 0) {
										int i_1483_ = anIntArray11393[i_1482_ & 0xff];
										int i_1484_ = is[i_1438_];
										is[i_1438_++] = ((((i_1483_ & 0xff00ff) * i_1478_ + ((i_1484_ & 0xff00ff) * i_1479_)) & ~0xff00ff) + (((i_1483_ & 0xff00) * i_1478_ + ((i_1484_ & 0xff00) * i_1479_)) & 0xff0000)) >> 8;
									} else
										i_1438_++;
								}
								i_1438_ += i_1442_;
								i_1439_ += i_1443_;
							}
						} else {
							int i_1485_ = (i_1435_ & 0xff0000) >> 16;
							int i_1486_ = (i_1435_ & 0xff00) >> 8;
							int i_1487_ = i_1435_ & 0xff;
							int i_1488_ = i_1435_ >>> 24;
							int i_1489_ = 256 - i_1488_;
							for (int i_1490_ = -i_1440_; i_1490_ < 0; i_1490_++) {
								for (int i_1491_ = -i_1441_; i_1491_ < 0; i_1491_++) {
									int i_1492_ = aByteArray11394[i_1439_++];
									if (i_1492_ != 0) {
										int i_1493_ = anIntArray11393[i_1492_ & 0xff];
										if (i_1488_ != 255) {
											int i_1494_ = (((i_1493_ & 0xff0000) * i_1485_) & ~0xffffff);
											int i_1495_ = ((i_1493_ & 0xff00) * i_1486_ & 0xff0000);
											int i_1496_ = ((i_1493_ & 0xff) * i_1487_ & 0xff00);
											i_1493_ = (i_1494_ | i_1495_ | i_1496_) >>> 8;
											int i_1497_ = is[i_1438_];
											is[i_1438_++] = (((((i_1493_ & 0xff00ff) * i_1488_) + ((i_1497_ & 0xff00ff) * i_1489_)) & ~0xff00ff) + ((((i_1493_ & 0xff00) * i_1488_) + ((i_1497_ & 0xff00) * i_1489_)) & 0xff0000)) >> 8;
										} else {
											int i_1498_ = (((i_1493_ & 0xff0000) * i_1485_) & ~0xffffff);
											int i_1499_ = ((i_1493_ & 0xff00) * i_1486_ & 0xff0000);
											int i_1500_ = ((i_1493_ & 0xff) * i_1487_ & 0xff00);
											is[i_1438_++] = (i_1498_ | i_1499_ | i_1500_) >>> 8;
										}
									} else
										i_1438_++;
								}
								i_1438_ += i_1442_;
								i_1439_ += i_1443_;
							}
						}
					} else if (i_1434_ == 3) {
						int i_1501_ = i_1435_ >>> 24;
						int i_1502_ = 256 - i_1501_;
						for (int i_1503_ = -i_1440_; i_1503_ < 0; i_1503_++) {
							for (int i_1504_ = -i_1441_; i_1504_ < 0; i_1504_++) {
								byte i_1505_ = aByteArray11394[i_1439_++];
								int i_1506_ = (i_1505_ > 0 ? anIntArray11393[i_1505_] : 0);
								int i_1507_ = i_1506_ + i_1435_;
								int i_1508_ = ((i_1506_ & 0xff00ff) + (i_1435_ & 0xff00ff));
								int i_1509_ = ((i_1508_ & 0x1000100) + (i_1507_ - i_1508_ & 0x10000));
								i_1509_ = i_1507_ - i_1509_ | i_1509_ - (i_1509_ >>> 8);
								if (i_1506_ == 0 && i_1501_ != 255) {
									i_1506_ = i_1509_;
									i_1509_ = is[i_1438_];
									i_1509_ = ((((i_1506_ & 0xff00ff) * i_1501_ + (i_1509_ & 0xff00ff) * i_1502_) & ~0xff00ff) + (((i_1506_ & 0xff00) * i_1501_ + (i_1509_ & 0xff00) * i_1502_) & 0xff0000)) >> 8;
								}
								is[i_1438_++] = i_1509_;
							}
							i_1438_ += i_1442_;
							i_1439_ += i_1443_;
						}
					} else if (i_1434_ == 2) {
						int i_1510_ = i_1435_ >>> 24;
						int i_1511_ = 256 - i_1510_;
						int i_1512_ = (i_1435_ & 0xff00ff) * i_1511_ & ~0xff00ff;
						int i_1513_ = (i_1435_ & 0xff00) * i_1511_ & 0xff0000;
						i_1435_ = (i_1512_ | i_1513_) >>> 8;
						for (int i_1514_ = -i_1440_; i_1514_ < 0; i_1514_++) {
							for (int i_1515_ = -i_1441_; i_1515_ < 0; i_1515_++) {
								int i_1516_ = aByteArray11394[i_1439_++];
								if (i_1516_ != 0) {
									int i_1517_ = anIntArray11393[i_1516_ & 0xff];
									i_1512_ = ((i_1517_ & 0xff00ff) * i_1510_ & ~0xff00ff);
									i_1513_ = ((i_1517_ & 0xff00) * i_1510_ & 0xff0000);
									is[i_1438_++] = ((i_1512_ | i_1513_) >>> 8) + i_1435_;
								} else
									i_1438_++;
							}
							i_1438_ += i_1442_;
							i_1439_ += i_1443_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1436_ == 2) {
					if (i_1434_ == 1) {
						for (int i_1518_ = -i_1440_; i_1518_ < 0; i_1518_++) {
							for (int i_1519_ = -i_1441_; i_1519_ < 0; i_1519_++) {
								int i_1520_ = aByteArray11394[i_1439_++];
								if (i_1520_ != 0) {
									int i_1521_ = anIntArray11393[i_1520_ & 0xff];
									int i_1522_ = is[i_1438_];
									int i_1523_ = i_1521_ + i_1522_;
									int i_1524_ = ((i_1521_ & 0xff00ff) + (i_1522_ & 0xff00ff));
									i_1522_ = ((i_1524_ & 0x1000100) + (i_1523_ - i_1524_ & 0x10000));
									is[i_1438_++] = (i_1523_ - i_1522_ | i_1522_ - (i_1522_ >>> 8));
								} else
									i_1438_++;
							}
							i_1438_ += i_1442_;
							i_1439_ += i_1443_;
						}
					} else if (i_1434_ == 0) {
						int i_1525_ = (i_1435_ & 0xff0000) >> 16;
						int i_1526_ = (i_1435_ & 0xff00) >> 8;
						int i_1527_ = i_1435_ & 0xff;
						for (int i_1528_ = -i_1440_; i_1528_ < 0; i_1528_++) {
							for (int i_1529_ = -i_1441_; i_1529_ < 0; i_1529_++) {
								int i_1530_ = aByteArray11394[i_1439_++];
								if (i_1530_ != 0) {
									int i_1531_ = anIntArray11393[i_1530_ & 0xff];
									int i_1532_ = ((i_1531_ & 0xff0000) * i_1525_ & ~0xffffff);
									int i_1533_ = ((i_1531_ & 0xff00) * i_1526_ & 0xff0000);
									int i_1534_ = (i_1531_ & 0xff) * i_1527_ & 0xff00;
									i_1531_ = (i_1532_ | i_1533_ | i_1534_) >>> 8;
									int i_1535_ = is[i_1438_];
									int i_1536_ = i_1531_ + i_1535_;
									int i_1537_ = ((i_1531_ & 0xff00ff) + (i_1535_ & 0xff00ff));
									i_1535_ = ((i_1537_ & 0x1000100) + (i_1536_ - i_1537_ & 0x10000));
									is[i_1438_++] = (i_1536_ - i_1535_ | i_1535_ - (i_1535_ >>> 8));
								} else
									i_1438_++;
							}
							i_1438_ += i_1442_;
							i_1439_ += i_1443_;
						}
					} else if (i_1434_ == 3) {
						for (int i_1538_ = -i_1440_; i_1538_ < 0; i_1538_++) {
							for (int i_1539_ = -i_1441_; i_1539_ < 0; i_1539_++) {
								byte i_1540_ = aByteArray11394[i_1439_++];
								int i_1541_ = (i_1540_ > 0 ? anIntArray11393[i_1540_] : 0);
								int i_1542_ = i_1541_ + i_1435_;
								int i_1543_ = ((i_1541_ & 0xff00ff) + (i_1435_ & 0xff00ff));
								int i_1544_ = ((i_1543_ & 0x1000100) + (i_1542_ - i_1543_ & 0x10000));
								i_1541_ = i_1542_ - i_1544_ | i_1544_ - (i_1544_ >>> 8);
								i_1544_ = is[i_1438_];
								i_1542_ = i_1541_ + i_1544_;
								i_1543_ = (i_1541_ & 0xff00ff) + (i_1544_ & 0xff00ff);
								i_1544_ = ((i_1543_ & 0x1000100) + (i_1542_ - i_1543_ & 0x10000));
								is[i_1438_++] = i_1542_ - i_1544_ | i_1544_ - (i_1544_ >>> 8);
							}
							i_1438_ += i_1442_;
							i_1439_ += i_1443_;
						}
					} else if (i_1434_ == 2) {
						int i_1545_ = i_1435_ >>> 24;
						int i_1546_ = 256 - i_1545_;
						int i_1547_ = (i_1435_ & 0xff00ff) * i_1546_ & ~0xff00ff;
						int i_1548_ = (i_1435_ & 0xff00) * i_1546_ & 0xff0000;
						i_1435_ = (i_1547_ | i_1548_) >>> 8;
						for (int i_1549_ = -i_1440_; i_1549_ < 0; i_1549_++) {
							for (int i_1550_ = -i_1441_; i_1550_ < 0; i_1550_++) {
								int i_1551_ = aByteArray11394[i_1439_++];
								if (i_1551_ != 0) {
									int i_1552_ = anIntArray11393[i_1551_ & 0xff];
									i_1547_ = ((i_1552_ & 0xff00ff) * i_1545_ & ~0xff00ff);
									i_1548_ = ((i_1552_ & 0xff00) * i_1545_ & 0xff0000);
									i_1552_ = (((i_1547_ | i_1548_) >>> 8) + i_1435_);
									int i_1553_ = is[i_1438_];
									int i_1554_ = i_1552_ + i_1553_;
									int i_1555_ = ((i_1552_ & 0xff00ff) + (i_1553_ & 0xff00ff));
									i_1553_ = ((i_1555_ & 0x1000100) + (i_1554_ - i_1555_ & 0x10000));
									is[i_1438_++] = (i_1554_ - i_1553_ | i_1553_ - (i_1553_ >>> 8));
								} else
									i_1438_++;
							}
							i_1438_ += i_1442_;
							i_1439_ += i_1443_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method1751(int i, int i_1556_, int i_1557_) {
		throw new IllegalStateException();
	}

	public Interface22 method1779() {
		throw new IllegalStateException();
	}

	public Interface22 method1784() {
		throw new IllegalStateException();
	}

	public Interface22 method1722() {
		throw new IllegalStateException();
	}

	public void method1763(int i, int i_1558_, int i_1559_, int i_1560_, int i_1561_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			int i_1562_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			i += anInt8977;
			i_1558_ += anInt8947;
			int i_1563_ = i_1558_ * i_1562_ + i;
			int i_1564_ = 0;
			int i_1565_ = anInt8950;
			int i_1566_ = anInt8945;
			int i_1567_ = i_1562_ - i_1566_;
			int i_1568_ = 0;
			if (i_1558_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_1569_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_1558_;
				i_1565_ -= i_1569_;
				i_1558_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_1564_ += i_1569_ * i_1566_;
				i_1563_ += i_1569_ * i_1562_;
			}
			if (i_1558_ + i_1565_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_1565_ -= (i_1558_ + i_1565_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_1570_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_1566_ -= i_1570_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_1564_ += i_1570_;
				i_1563_ += i_1570_;
				i_1568_ += i_1570_;
				i_1567_ += i_1570_;
			}
			if (i + i_1566_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_1571_ = i + i_1566_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_1566_ -= i_1571_;
				i_1568_ += i_1571_;
				i_1567_ += i_1571_;
			}
			if (i_1566_ > 0 && i_1565_ > 0) {
				if (i_1561_ == 0) {
					if (i_1559_ == 1) {
						for (int i_1572_ = -i_1565_; i_1572_ < 0; i_1572_++) {
							int i_1573_ = i_1563_ + i_1566_ - 3;
							while (i_1563_ < i_1573_) {
								is[i_1563_++] = (anIntArray11393[aByteArray11394[i_1564_++] & 0xff]);
								is[i_1563_++] = (anIntArray11393[aByteArray11394[i_1564_++] & 0xff]);
								is[i_1563_++] = (anIntArray11393[aByteArray11394[i_1564_++] & 0xff]);
								is[i_1563_++] = (anIntArray11393[aByteArray11394[i_1564_++] & 0xff]);
							}
							i_1573_ += 3;
							while (i_1563_ < i_1573_)
								is[i_1563_++] = (anIntArray11393[aByteArray11394[i_1564_++] & 0xff]);
							i_1563_ += i_1567_;
							i_1564_ += i_1568_;
						}
					} else if (i_1559_ == 0) {
						int i_1574_ = (i_1560_ & 0xff0000) >> 16;
						int i_1575_ = (i_1560_ & 0xff00) >> 8;
						int i_1576_ = i_1560_ & 0xff;
						for (int i_1577_ = -i_1565_; i_1577_ < 0; i_1577_++) {
							for (int i_1578_ = -i_1566_; i_1578_ < 0; i_1578_++) {
								int i_1579_ = (anIntArray11393[aByteArray11394[i_1564_++] & 0xff]);
								int i_1580_ = ((i_1579_ & 0xff0000) * i_1574_ & ~0xffffff);
								int i_1581_ = (i_1579_ & 0xff00) * i_1575_ & 0xff0000;
								int i_1582_ = (i_1579_ & 0xff) * i_1576_ & 0xff00;
								is[i_1563_++] = (i_1580_ | i_1581_ | i_1582_) >>> 8;
							}
							i_1563_ += i_1567_;
							i_1564_ += i_1568_;
						}
					} else if (i_1559_ == 3) {
						for (int i_1583_ = -i_1565_; i_1583_ < 0; i_1583_++) {
							for (int i_1584_ = -i_1566_; i_1584_ < 0; i_1584_++) {
								int i_1585_ = (anIntArray11393[aByteArray11394[i_1564_++] & 0xff]);
								int i_1586_ = i_1585_ + i_1560_;
								int i_1587_ = ((i_1585_ & 0xff00ff) + (i_1560_ & 0xff00ff));
								int i_1588_ = ((i_1587_ & 0x1000100) + (i_1586_ - i_1587_ & 0x10000));
								is[i_1563_++] = i_1586_ - i_1588_ | i_1588_ - (i_1588_ >>> 8);
							}
							i_1563_ += i_1567_;
							i_1564_ += i_1568_;
						}
					} else if (i_1559_ == 2) {
						int i_1589_ = i_1560_ >>> 24;
						int i_1590_ = 256 - i_1589_;
						int i_1591_ = (i_1560_ & 0xff00ff) * i_1590_ & ~0xff00ff;
						int i_1592_ = (i_1560_ & 0xff00) * i_1590_ & 0xff0000;
						i_1560_ = (i_1591_ | i_1592_) >>> 8;
						for (int i_1593_ = -i_1565_; i_1593_ < 0; i_1593_++) {
							for (int i_1594_ = -i_1566_; i_1594_ < 0; i_1594_++) {
								int i_1595_ = (anIntArray11393[aByteArray11394[i_1564_++] & 0xff]);
								i_1591_ = ((i_1595_ & 0xff00ff) * i_1589_ & ~0xff00ff);
								i_1592_ = (i_1595_ & 0xff00) * i_1589_ & 0xff0000;
								is[i_1563_++] = ((i_1591_ | i_1592_) >>> 8) + i_1560_;
							}
							i_1563_ += i_1567_;
							i_1564_ += i_1568_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1561_ == 1) {
					if (i_1559_ == 1) {
						for (int i_1596_ = -i_1565_; i_1596_ < 0; i_1596_++) {
							for (int i_1597_ = -i_1566_; i_1597_ < 0; i_1597_++) {
								int i_1598_ = aByteArray11394[i_1564_++];
								if (i_1598_ != 0) {
									int i_1599_ = (anIntArray11393[i_1598_ & 0xff] | ~0xffffff);
									int i_1600_ = 255;
									int i_1601_ = 0;
									int i_1602_ = is[i_1563_];
									is[i_1563_++] = (((((i_1599_ & 0xff00ff) * i_1600_ + (i_1602_ & 0xff00ff) * i_1601_) & ~0xff00ff) >> 8) + (((((i_1599_ & ~0xff00ff) >>> 8) * i_1600_) + (((i_1602_ & ~0xff00ff) >>> 8) * i_1601_)) & ~0xff00ff));
								} else
									i_1563_++;
							}
							i_1563_ += i_1567_;
							i_1564_ += i_1568_;
						}
					} else if (i_1559_ == 0) {
						if ((i_1560_ & 0xffffff) == 16777215) {
							int i_1603_ = i_1560_ >>> 24;
							int i_1604_ = 256 - i_1603_;
							for (int i_1605_ = -i_1565_; i_1605_ < 0; i_1605_++) {
								for (int i_1606_ = -i_1566_; i_1606_ < 0; i_1606_++) {
									int i_1607_ = aByteArray11394[i_1564_++];
									if (i_1607_ != 0) {
										int i_1608_ = anIntArray11393[i_1607_ & 0xff];
										int i_1609_ = is[i_1563_];
										is[i_1563_++] = ((((i_1608_ & 0xff00ff) * i_1603_ + ((i_1609_ & 0xff00ff) * i_1604_)) & ~0xff00ff) + (((i_1608_ & 0xff00) * i_1603_ + ((i_1609_ & 0xff00) * i_1604_)) & 0xff0000)) >> 8;
									} else
										i_1563_++;
								}
								i_1563_ += i_1567_;
								i_1564_ += i_1568_;
							}
						} else {
							int i_1610_ = (i_1560_ & 0xff0000) >> 16;
							int i_1611_ = (i_1560_ & 0xff00) >> 8;
							int i_1612_ = i_1560_ & 0xff;
							int i_1613_ = i_1560_ >>> 24;
							int i_1614_ = 256 - i_1613_;
							for (int i_1615_ = -i_1565_; i_1615_ < 0; i_1615_++) {
								for (int i_1616_ = -i_1566_; i_1616_ < 0; i_1616_++) {
									int i_1617_ = aByteArray11394[i_1564_++];
									if (i_1617_ != 0) {
										int i_1618_ = anIntArray11393[i_1617_ & 0xff];
										if (i_1613_ != 255) {
											int i_1619_ = (((i_1618_ & 0xff0000) * i_1610_) & ~0xffffff);
											int i_1620_ = ((i_1618_ & 0xff00) * i_1611_ & 0xff0000);
											int i_1621_ = ((i_1618_ & 0xff) * i_1612_ & 0xff00);
											i_1618_ = (i_1619_ | i_1620_ | i_1621_) >>> 8;
											int i_1622_ = is[i_1563_];
											is[i_1563_++] = (((((i_1618_ & 0xff00ff) * i_1613_) + ((i_1622_ & 0xff00ff) * i_1614_)) & ~0xff00ff) + ((((i_1618_ & 0xff00) * i_1613_) + ((i_1622_ & 0xff00) * i_1614_)) & 0xff0000)) >> 8;
										} else {
											int i_1623_ = (((i_1618_ & 0xff0000) * i_1610_) & ~0xffffff);
											int i_1624_ = ((i_1618_ & 0xff00) * i_1611_ & 0xff0000);
											int i_1625_ = ((i_1618_ & 0xff) * i_1612_ & 0xff00);
											is[i_1563_++] = (i_1623_ | i_1624_ | i_1625_) >>> 8;
										}
									} else
										i_1563_++;
								}
								i_1563_ += i_1567_;
								i_1564_ += i_1568_;
							}
						}
					} else if (i_1559_ == 3) {
						int i_1626_ = i_1560_ >>> 24;
						int i_1627_ = 256 - i_1626_;
						for (int i_1628_ = -i_1565_; i_1628_ < 0; i_1628_++) {
							for (int i_1629_ = -i_1566_; i_1629_ < 0; i_1629_++) {
								byte i_1630_ = aByteArray11394[i_1564_++];
								int i_1631_ = (i_1630_ > 0 ? anIntArray11393[i_1630_] : 0);
								int i_1632_ = i_1631_ + i_1560_;
								int i_1633_ = ((i_1631_ & 0xff00ff) + (i_1560_ & 0xff00ff));
								int i_1634_ = ((i_1633_ & 0x1000100) + (i_1632_ - i_1633_ & 0x10000));
								i_1634_ = i_1632_ - i_1634_ | i_1634_ - (i_1634_ >>> 8);
								if (i_1631_ == 0 && i_1626_ != 255) {
									i_1631_ = i_1634_;
									i_1634_ = is[i_1563_];
									i_1634_ = ((((i_1631_ & 0xff00ff) * i_1626_ + (i_1634_ & 0xff00ff) * i_1627_) & ~0xff00ff) + (((i_1631_ & 0xff00) * i_1626_ + (i_1634_ & 0xff00) * i_1627_) & 0xff0000)) >> 8;
								}
								is[i_1563_++] = i_1634_;
							}
							i_1563_ += i_1567_;
							i_1564_ += i_1568_;
						}
					} else if (i_1559_ == 2) {
						int i_1635_ = i_1560_ >>> 24;
						int i_1636_ = 256 - i_1635_;
						int i_1637_ = (i_1560_ & 0xff00ff) * i_1636_ & ~0xff00ff;
						int i_1638_ = (i_1560_ & 0xff00) * i_1636_ & 0xff0000;
						i_1560_ = (i_1637_ | i_1638_) >>> 8;
						for (int i_1639_ = -i_1565_; i_1639_ < 0; i_1639_++) {
							for (int i_1640_ = -i_1566_; i_1640_ < 0; i_1640_++) {
								int i_1641_ = aByteArray11394[i_1564_++];
								if (i_1641_ != 0) {
									int i_1642_ = anIntArray11393[i_1641_ & 0xff];
									i_1637_ = ((i_1642_ & 0xff00ff) * i_1635_ & ~0xff00ff);
									i_1638_ = ((i_1642_ & 0xff00) * i_1635_ & 0xff0000);
									is[i_1563_++] = ((i_1637_ | i_1638_) >>> 8) + i_1560_;
								} else
									i_1563_++;
							}
							i_1563_ += i_1567_;
							i_1564_ += i_1568_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1561_ == 2) {
					if (i_1559_ == 1) {
						for (int i_1643_ = -i_1565_; i_1643_ < 0; i_1643_++) {
							for (int i_1644_ = -i_1566_; i_1644_ < 0; i_1644_++) {
								int i_1645_ = aByteArray11394[i_1564_++];
								if (i_1645_ != 0) {
									int i_1646_ = anIntArray11393[i_1645_ & 0xff];
									int i_1647_ = is[i_1563_];
									int i_1648_ = i_1646_ + i_1647_;
									int i_1649_ = ((i_1646_ & 0xff00ff) + (i_1647_ & 0xff00ff));
									i_1647_ = ((i_1649_ & 0x1000100) + (i_1648_ - i_1649_ & 0x10000));
									is[i_1563_++] = (i_1648_ - i_1647_ | i_1647_ - (i_1647_ >>> 8));
								} else
									i_1563_++;
							}
							i_1563_ += i_1567_;
							i_1564_ += i_1568_;
						}
					} else if (i_1559_ == 0) {
						int i_1650_ = (i_1560_ & 0xff0000) >> 16;
						int i_1651_ = (i_1560_ & 0xff00) >> 8;
						int i_1652_ = i_1560_ & 0xff;
						for (int i_1653_ = -i_1565_; i_1653_ < 0; i_1653_++) {
							for (int i_1654_ = -i_1566_; i_1654_ < 0; i_1654_++) {
								int i_1655_ = aByteArray11394[i_1564_++];
								if (i_1655_ != 0) {
									int i_1656_ = anIntArray11393[i_1655_ & 0xff];
									int i_1657_ = ((i_1656_ & 0xff0000) * i_1650_ & ~0xffffff);
									int i_1658_ = ((i_1656_ & 0xff00) * i_1651_ & 0xff0000);
									int i_1659_ = (i_1656_ & 0xff) * i_1652_ & 0xff00;
									i_1656_ = (i_1657_ | i_1658_ | i_1659_) >>> 8;
									int i_1660_ = is[i_1563_];
									int i_1661_ = i_1656_ + i_1660_;
									int i_1662_ = ((i_1656_ & 0xff00ff) + (i_1660_ & 0xff00ff));
									i_1660_ = ((i_1662_ & 0x1000100) + (i_1661_ - i_1662_ & 0x10000));
									is[i_1563_++] = (i_1661_ - i_1660_ | i_1660_ - (i_1660_ >>> 8));
								} else
									i_1563_++;
							}
							i_1563_ += i_1567_;
							i_1564_ += i_1568_;
						}
					} else if (i_1559_ == 3) {
						for (int i_1663_ = -i_1565_; i_1663_ < 0; i_1663_++) {
							for (int i_1664_ = -i_1566_; i_1664_ < 0; i_1664_++) {
								byte i_1665_ = aByteArray11394[i_1564_++];
								int i_1666_ = (i_1665_ > 0 ? anIntArray11393[i_1665_] : 0);
								int i_1667_ = i_1666_ + i_1560_;
								int i_1668_ = ((i_1666_ & 0xff00ff) + (i_1560_ & 0xff00ff));
								int i_1669_ = ((i_1668_ & 0x1000100) + (i_1667_ - i_1668_ & 0x10000));
								i_1666_ = i_1667_ - i_1669_ | i_1669_ - (i_1669_ >>> 8);
								i_1669_ = is[i_1563_];
								i_1667_ = i_1666_ + i_1669_;
								i_1668_ = (i_1666_ & 0xff00ff) + (i_1669_ & 0xff00ff);
								i_1669_ = ((i_1668_ & 0x1000100) + (i_1667_ - i_1668_ & 0x10000));
								is[i_1563_++] = i_1667_ - i_1669_ | i_1669_ - (i_1669_ >>> 8);
							}
							i_1563_ += i_1567_;
							i_1564_ += i_1568_;
						}
					} else if (i_1559_ == 2) {
						int i_1670_ = i_1560_ >>> 24;
						int i_1671_ = 256 - i_1670_;
						int i_1672_ = (i_1560_ & 0xff00ff) * i_1671_ & ~0xff00ff;
						int i_1673_ = (i_1560_ & 0xff00) * i_1671_ & 0xff0000;
						i_1560_ = (i_1672_ | i_1673_) >>> 8;
						for (int i_1674_ = -i_1565_; i_1674_ < 0; i_1674_++) {
							for (int i_1675_ = -i_1566_; i_1675_ < 0; i_1675_++) {
								int i_1676_ = aByteArray11394[i_1564_++];
								if (i_1676_ != 0) {
									int i_1677_ = anIntArray11393[i_1676_ & 0xff];
									i_1672_ = ((i_1677_ & 0xff00ff) * i_1670_ & ~0xff00ff);
									i_1673_ = ((i_1677_ & 0xff00) * i_1670_ & 0xff0000);
									i_1677_ = (((i_1672_ | i_1673_) >>> 8) + i_1560_);
									int i_1678_ = is[i_1563_];
									int i_1679_ = i_1677_ + i_1678_;
									int i_1680_ = ((i_1677_ & 0xff00ff) + (i_1678_ & 0xff00ff));
									i_1678_ = ((i_1680_ & 0x1000100) + (i_1679_ - i_1680_ & 0x10000));
									is[i_1563_++] = (i_1679_ - i_1678_ | i_1678_ - (i_1678_ >>> 8));
								} else
									i_1563_++;
							}
							i_1563_ += i_1567_;
							i_1564_ += i_1568_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method1760(int i, int i_1681_, Class161 class161, int i_1682_, int i_1683_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			i += anInt8977;
			i_1681_ += anInt8947;
			int i_1684_ = 0;
			int i_1685_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			int i_1686_ = anInt8945;
			int i_1687_ = anInt8950;
			int i_1688_ = i_1685_ - i_1686_;
			int i_1689_ = 0;
			int i_1690_ = i + i_1681_ * i_1685_;
			if (i_1681_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_1691_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_1681_;
				i_1687_ -= i_1691_;
				i_1681_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_1684_ += i_1691_ * i_1686_;
				i_1690_ += i_1691_ * i_1685_;
			}
			if (i_1681_ + i_1687_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_1687_ -= (i_1681_ + i_1687_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_1692_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_1686_ -= i_1692_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_1684_ += i_1692_;
				i_1690_ += i_1692_;
				i_1689_ += i_1692_;
				i_1688_ += i_1692_;
			}
			if (i + i_1686_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_1693_ = i + i_1686_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_1686_ -= i_1693_;
				i_1689_ += i_1693_;
				i_1688_ += i_1693_;
			}
			if (i_1686_ > 0 && i_1687_ > 0) {
				Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
				int[] is_1694_ = class161_sub2.anIntArray9444;
				int[] is_1695_ = class161_sub2.anIntArray9445;
				int i_1696_ = i_1681_;
				if (i_1683_ > i_1696_) {
					i_1696_ = i_1683_;
					i_1690_ += (i_1683_ - i_1681_) * i_1685_;
					i_1684_ += (i_1683_ - i_1681_) * anInt8945;
				}
				int i_1697_ = (i_1683_ + is_1694_.length < i_1681_ + i_1687_ ? i_1683_ + is_1694_.length : i_1681_ + i_1687_);
				for (int i_1698_ = i_1696_; i_1698_ < i_1697_; i_1698_++) {
					int i_1699_ = is_1694_[i_1698_ - i_1683_] + i_1682_;
					int i_1700_ = is_1695_[i_1698_ - i_1683_];
					int i_1701_ = i_1686_;
					if (i > i_1699_) {
						int i_1702_ = i - i_1699_;
						if (i_1702_ >= i_1700_) {
							i_1684_ += i_1686_ + i_1689_;
							i_1690_ += i_1686_ + i_1688_;
							continue;
						}
						i_1700_ -= i_1702_;
					} else {
						int i_1703_ = i_1699_ - i;
						if (i_1703_ >= i_1686_) {
							i_1684_ += i_1686_ + i_1689_;
							i_1690_ += i_1686_ + i_1688_;
							continue;
						}
						i_1684_ += i_1703_;
						i_1701_ -= i_1703_;
						i_1690_ += i_1703_;
					}
					int i_1704_ = 0;
					if (i_1701_ < i_1700_)
						i_1700_ = i_1701_;
					else
						i_1704_ = i_1701_ - i_1700_;
					for (int i_1705_ = -i_1700_; i_1705_ < 0; i_1705_++) {
						int i_1706_ = aByteArray11394[i_1684_++];
						if (i_1706_ != 0)
							is[i_1690_++] = anIntArray11393[i_1706_ & 0xff];
						else
							i_1690_++;
					}
					i_1684_ += i_1704_ + i_1689_;
					i_1690_ += i_1704_ + i_1688_;
				}
			}
		}
	}

	public void method1727(int i, int i_1707_, int i_1708_) {
		throw new IllegalStateException();
	}

	public void method1750(int i, int i_1709_, int i_1710_) {
		throw new IllegalStateException();
	}

	void method1758(int i, int i_1711_, int i_1712_, int i_1713_, int i_1714_, int i_1715_, int i_1716_, int i_1717_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		if (i_1712_ > 0 && i_1713_ > 0) {
			int[] is = aClass167_Sub1_8946.anIntArray8996;
			if (is != null) {
				int i_1718_ = 0;
				int i_1719_ = 0;
				int i_1720_ = aClass167_Sub1_8946.anInt8997 * -570111553;
				int i_1721_ = anInt8977 + anInt8945 + anInt8948;
				int i_1722_ = anInt8947 + anInt8950 + anInt8952;
				int i_1723_ = (i_1721_ << 16) / i_1712_;
				int i_1724_ = (i_1722_ << 16) / i_1713_;
				if (anInt8977 > 0) {
					int i_1725_ = ((anInt8977 << 16) + i_1723_ - 1) / i_1723_;
					i += i_1725_;
					i_1718_ += i_1725_ * i_1723_ - (anInt8977 << 16);
				}
				if (anInt8947 > 0) {
					int i_1726_ = ((anInt8947 << 16) + i_1724_ - 1) / i_1724_;
					i_1711_ += i_1726_;
					i_1719_ += i_1726_ * i_1724_ - (anInt8947 << 16);
				}
				if (anInt8945 < i_1721_)
					i_1712_ = (((anInt8945 << 16) - i_1718_ + i_1723_ - 1) / i_1723_);
				if (anInt8950 < i_1722_)
					i_1713_ = (((anInt8950 << 16) - i_1719_ + i_1724_ - 1) / i_1724_);
				int i_1727_ = i + i_1711_ * i_1720_;
				int i_1728_ = i_1720_ - i_1712_;
				if (i_1711_ + i_1713_ > aClass167_Sub1_8946.anInt9003 * -148513205)
					i_1713_ -= (i_1711_ + i_1713_ - aClass167_Sub1_8946.anInt9003 * -148513205);
				if (i_1711_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
					int i_1729_ = (aClass167_Sub1_8946.anInt9021 * -1593163361 - i_1711_);
					i_1713_ -= i_1729_;
					i_1727_ += i_1729_ * i_1720_;
					i_1719_ += i_1724_ * i_1729_;
				}
				if (i + i_1712_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
					int i_1730_ = (i + i_1712_ - aClass167_Sub1_8946.anInt9001 * 2024498147);
					i_1712_ -= i_1730_;
					i_1728_ += i_1730_;
				}
				if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
					int i_1731_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
					i_1712_ -= i_1731_;
					i_1727_ += i_1731_;
					i_1718_ += i_1723_ * i_1731_;
					i_1728_ += i_1731_;
				}
				if (i_1716_ == 0) {
					if (i_1714_ == 1) {
						int i_1732_ = i_1718_;
						for (int i_1733_ = -i_1713_; i_1733_ < 0; i_1733_++) {
							int i_1734_ = (i_1719_ >> 16) * anInt8945;
							for (int i_1735_ = -i_1712_; i_1735_ < 0; i_1735_++) {
								is[i_1727_++] = (anIntArray11393[(aByteArray11394[(i_1718_ >> 16) + i_1734_]) & 0xff]);
								i_1718_ += i_1723_;
							}
							i_1719_ += i_1724_;
							i_1718_ = i_1732_;
							i_1727_ += i_1728_;
						}
					} else if (i_1714_ == 0) {
						int i_1736_ = (i_1715_ & 0xff0000) >> 16;
						int i_1737_ = (i_1715_ & 0xff00) >> 8;
						int i_1738_ = i_1715_ & 0xff;
						int i_1739_ = i_1718_;
						for (int i_1740_ = -i_1713_; i_1740_ < 0; i_1740_++) {
							int i_1741_ = (i_1719_ >> 16) * anInt8945;
							for (int i_1742_ = -i_1712_; i_1742_ < 0; i_1742_++) {
								int i_1743_ = (anIntArray11393[(aByteArray11394[(i_1718_ >> 16) + i_1741_]) & 0xff]);
								int i_1744_ = ((i_1743_ & 0xff0000) * i_1736_ & ~0xffffff);
								int i_1745_ = (i_1743_ & 0xff00) * i_1737_ & 0xff0000;
								int i_1746_ = (i_1743_ & 0xff) * i_1738_ & 0xff00;
								is[i_1727_++] = (i_1744_ | i_1745_ | i_1746_) >>> 8;
								i_1718_ += i_1723_;
							}
							i_1719_ += i_1724_;
							i_1718_ = i_1739_;
							i_1727_ += i_1728_;
						}
					} else if (i_1714_ == 3) {
						int i_1747_ = i_1718_;
						for (int i_1748_ = -i_1713_; i_1748_ < 0; i_1748_++) {
							int i_1749_ = (i_1719_ >> 16) * anInt8945;
							for (int i_1750_ = -i_1712_; i_1750_ < 0; i_1750_++) {
								byte i_1751_ = (aByteArray11394[(i_1718_ >> 16) + i_1749_]);
								int i_1752_ = (i_1751_ > 0 ? anIntArray11393[i_1751_] : 0);
								int i_1753_ = i_1752_ + i_1715_;
								int i_1754_ = ((i_1752_ & 0xff00ff) + (i_1715_ & 0xff00ff));
								int i_1755_ = ((i_1754_ & 0x1000100) + (i_1753_ - i_1754_ & 0x10000));
								is[i_1727_++] = i_1753_ - i_1755_ | i_1755_ - (i_1755_ >>> 8);
								i_1718_ += i_1723_;
							}
							i_1719_ += i_1724_;
							i_1718_ = i_1747_;
							i_1727_ += i_1728_;
						}
					} else if (i_1714_ == 2) {
						int i_1756_ = i_1715_ >>> 24;
						int i_1757_ = 256 - i_1756_;
						int i_1758_ = (i_1715_ & 0xff00ff) * i_1757_ & ~0xff00ff;
						int i_1759_ = (i_1715_ & 0xff00) * i_1757_ & 0xff0000;
						i_1715_ = (i_1758_ | i_1759_) >>> 8;
						int i_1760_ = i_1718_;
						for (int i_1761_ = -i_1713_; i_1761_ < 0; i_1761_++) {
							int i_1762_ = (i_1719_ >> 16) * anInt8945;
							for (int i_1763_ = -i_1712_; i_1763_ < 0; i_1763_++) {
								int i_1764_ = (anIntArray11393[(aByteArray11394[(i_1718_ >> 16) + i_1762_]) & 0xff]);
								i_1758_ = ((i_1764_ & 0xff00ff) * i_1756_ & ~0xff00ff);
								i_1759_ = (i_1764_ & 0xff00) * i_1756_ & 0xff0000;
								is[i_1727_++] = ((i_1758_ | i_1759_) >>> 8) + i_1715_;
								i_1718_ += i_1723_;
							}
							i_1719_ += i_1724_;
							i_1718_ = i_1760_;
							i_1727_ += i_1728_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1716_ == 1) {
					if (i_1714_ == 1) {
						int i_1765_ = i_1718_;
						for (int i_1766_ = -i_1713_; i_1766_ < 0; i_1766_++) {
							int i_1767_ = (i_1719_ >> 16) * anInt8945;
							for (int i_1768_ = -i_1712_; i_1768_ < 0; i_1768_++) {
								int i_1769_ = (aByteArray11394[(i_1718_ >> 16) + i_1767_]);
								if (i_1769_ != 0)
									is[i_1727_++] = anIntArray11393[i_1769_ & 0xff];
								else
									i_1727_++;
								i_1718_ += i_1723_;
							}
							i_1719_ += i_1724_;
							i_1718_ = i_1765_;
							i_1727_ += i_1728_;
						}
					} else if (i_1714_ == 0) {
						int i_1770_ = i_1718_;
						if ((i_1715_ & 0xffffff) == 16777215) {
							int i_1771_ = i_1715_ >>> 24;
							int i_1772_ = 256 - i_1771_;
							for (int i_1773_ = -i_1713_; i_1773_ < 0; i_1773_++) {
								int i_1774_ = (i_1719_ >> 16) * anInt8945;
								for (int i_1775_ = -i_1712_; i_1775_ < 0; i_1775_++) {
									int i_1776_ = (aByteArray11394[(i_1718_ >> 16) + i_1774_]);
									if (i_1776_ != 0) {
										int i_1777_ = anIntArray11393[i_1776_ & 0xff];
										int i_1778_ = is[i_1727_];
										is[i_1727_++] = ((((i_1777_ & 0xff00ff) * i_1771_ + ((i_1778_ & 0xff00ff) * i_1772_)) & ~0xff00ff) + (((i_1777_ & 0xff00) * i_1771_ + ((i_1778_ & 0xff00) * i_1772_)) & 0xff0000)) >> 8;
									} else
										i_1727_++;
									i_1718_ += i_1723_;
								}
								i_1719_ += i_1724_;
								i_1718_ = i_1770_;
								i_1727_ += i_1728_;
							}
						} else {
							int i_1779_ = (i_1715_ & 0xff0000) >> 16;
							int i_1780_ = (i_1715_ & 0xff00) >> 8;
							int i_1781_ = i_1715_ & 0xff;
							int i_1782_ = i_1715_ >>> 24;
							int i_1783_ = 256 - i_1782_;
							for (int i_1784_ = -i_1713_; i_1784_ < 0; i_1784_++) {
								int i_1785_ = (i_1719_ >> 16) * anInt8945;
								for (int i_1786_ = -i_1712_; i_1786_ < 0; i_1786_++) {
									int i_1787_ = (aByteArray11394[(i_1718_ >> 16) + i_1785_]);
									if (i_1787_ != 0) {
										int i_1788_ = anIntArray11393[i_1787_ & 0xff];
										if (i_1782_ != 255) {
											int i_1789_ = (((i_1788_ & 0xff0000) * i_1779_) & ~0xffffff);
											int i_1790_ = ((i_1788_ & 0xff00) * i_1780_ & 0xff0000);
											int i_1791_ = ((i_1788_ & 0xff) * i_1781_ & 0xff00);
											i_1788_ = (i_1789_ | i_1790_ | i_1791_) >>> 8;
											int i_1792_ = is[i_1727_];
											is[i_1727_++] = (((((i_1788_ & 0xff00ff) * i_1782_) + ((i_1792_ & 0xff00ff) * i_1783_)) & ~0xff00ff) + ((((i_1788_ & 0xff00) * i_1782_) + ((i_1792_ & 0xff00) * i_1783_)) & 0xff0000)) >> 8;
										} else {
											int i_1793_ = (((i_1788_ & 0xff0000) * i_1779_) & ~0xffffff);
											int i_1794_ = ((i_1788_ & 0xff00) * i_1780_ & 0xff0000);
											int i_1795_ = ((i_1788_ & 0xff) * i_1781_ & 0xff00);
											is[i_1727_++] = (i_1793_ | i_1794_ | i_1795_) >>> 8;
										}
									} else
										i_1727_++;
									i_1718_ += i_1723_;
								}
								i_1719_ += i_1724_;
								i_1718_ = i_1770_;
								i_1727_ += i_1728_;
							}
						}
					} else if (i_1714_ == 3) {
						int i_1796_ = i_1718_;
						int i_1797_ = i_1715_ >>> 24;
						int i_1798_ = 256 - i_1797_;
						for (int i_1799_ = -i_1713_; i_1799_ < 0; i_1799_++) {
							int i_1800_ = (i_1719_ >> 16) * anInt8945;
							for (int i_1801_ = -i_1712_; i_1801_ < 0; i_1801_++) {
								byte i_1802_ = (aByteArray11394[(i_1718_ >> 16) + i_1800_]);
								int i_1803_ = (i_1802_ > 0 ? anIntArray11393[i_1802_] : 0);
								int i_1804_ = i_1803_ + i_1715_;
								int i_1805_ = ((i_1803_ & 0xff00ff) + (i_1715_ & 0xff00ff));
								int i_1806_ = ((i_1805_ & 0x1000100) + (i_1804_ - i_1805_ & 0x10000));
								i_1806_ = i_1804_ - i_1806_ | i_1806_ - (i_1806_ >>> 8);
								if (i_1803_ == 0 && i_1797_ != 255) {
									i_1803_ = i_1806_;
									i_1806_ = is[i_1727_];
									i_1806_ = ((((i_1803_ & 0xff00ff) * i_1797_ + (i_1806_ & 0xff00ff) * i_1798_) & ~0xff00ff) + (((i_1803_ & 0xff00) * i_1797_ + (i_1806_ & 0xff00) * i_1798_) & 0xff0000)) >> 8;
								}
								is[i_1727_++] = i_1806_;
								i_1718_ += i_1723_;
							}
							i_1719_ += i_1724_;
							i_1718_ = i_1796_;
							i_1727_ += i_1728_;
						}
					} else if (i_1714_ == 2) {
						int i_1807_ = i_1715_ >>> 24;
						int i_1808_ = 256 - i_1807_;
						int i_1809_ = (i_1715_ & 0xff00ff) * i_1808_ & ~0xff00ff;
						int i_1810_ = (i_1715_ & 0xff00) * i_1808_ & 0xff0000;
						i_1715_ = (i_1809_ | i_1810_) >>> 8;
						int i_1811_ = i_1718_;
						for (int i_1812_ = -i_1713_; i_1812_ < 0; i_1812_++) {
							int i_1813_ = (i_1719_ >> 16) * anInt8945;
							for (int i_1814_ = -i_1712_; i_1814_ < 0; i_1814_++) {
								int i_1815_ = (aByteArray11394[(i_1718_ >> 16) + i_1813_]);
								if (i_1815_ != 0) {
									int i_1816_ = anIntArray11393[i_1815_ & 0xff];
									i_1809_ = ((i_1816_ & 0xff00ff) * i_1807_ & ~0xff00ff);
									i_1810_ = ((i_1816_ & 0xff00) * i_1807_ & 0xff0000);
									is[i_1727_++] = ((i_1809_ | i_1810_) >>> 8) + i_1715_;
								} else
									i_1727_++;
								i_1718_ += i_1723_;
							}
							i_1719_ += i_1724_;
							i_1718_ = i_1811_;
							i_1727_ += i_1728_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1716_ == 2) {
					if (i_1714_ == 1) {
						int i_1817_ = i_1718_;
						for (int i_1818_ = -i_1713_; i_1818_ < 0; i_1818_++) {
							int i_1819_ = (i_1719_ >> 16) * anInt8945;
							for (int i_1820_ = -i_1712_; i_1820_ < 0; i_1820_++) {
								int i_1821_ = (aByteArray11394[(i_1718_ >> 16) + i_1819_]);
								if (i_1821_ != 0) {
									int i_1822_ = anIntArray11393[i_1821_ & 0xff];
									int i_1823_ = is[i_1727_];
									int i_1824_ = i_1822_ + i_1823_;
									int i_1825_ = ((i_1822_ & 0xff00ff) + (i_1823_ & 0xff00ff));
									i_1823_ = ((i_1825_ & 0x1000100) + (i_1824_ - i_1825_ & 0x10000));
									is[i_1727_++] = (i_1824_ - i_1823_ | i_1823_ - (i_1823_ >>> 8));
								} else
									i_1727_++;
								i_1718_ += i_1723_;
							}
							i_1719_ += i_1724_;
							i_1718_ = i_1817_;
							i_1727_ += i_1728_;
						}
					} else if (i_1714_ == 0) {
						int i_1826_ = i_1718_;
						int i_1827_ = (i_1715_ & 0xff0000) >> 16;
						int i_1828_ = (i_1715_ & 0xff00) >> 8;
						int i_1829_ = i_1715_ & 0xff;
						for (int i_1830_ = -i_1713_; i_1830_ < 0; i_1830_++) {
							int i_1831_ = (i_1719_ >> 16) * anInt8945;
							for (int i_1832_ = -i_1712_; i_1832_ < 0; i_1832_++) {
								int i_1833_ = (aByteArray11394[(i_1718_ >> 16) + i_1831_]);
								if (i_1833_ != 0) {
									int i_1834_ = anIntArray11393[i_1833_ & 0xff];
									int i_1835_ = ((i_1834_ & 0xff0000) * i_1827_ & ~0xffffff);
									int i_1836_ = ((i_1834_ & 0xff00) * i_1828_ & 0xff0000);
									int i_1837_ = (i_1834_ & 0xff) * i_1829_ & 0xff00;
									i_1834_ = (i_1835_ | i_1836_ | i_1837_) >>> 8;
									int i_1838_ = is[i_1727_];
									int i_1839_ = i_1834_ + i_1838_;
									int i_1840_ = ((i_1834_ & 0xff00ff) + (i_1838_ & 0xff00ff));
									i_1838_ = ((i_1840_ & 0x1000100) + (i_1839_ - i_1840_ & 0x10000));
									is[i_1727_++] = (i_1839_ - i_1838_ | i_1838_ - (i_1838_ >>> 8));
								} else
									i_1727_++;
								i_1718_ += i_1723_;
							}
							i_1719_ += i_1724_;
							i_1718_ = i_1826_;
							i_1727_ += i_1728_;
						}
					} else if (i_1714_ == 3) {
						int i_1841_ = i_1718_;
						for (int i_1842_ = -i_1713_; i_1842_ < 0; i_1842_++) {
							int i_1843_ = (i_1719_ >> 16) * anInt8945;
							for (int i_1844_ = -i_1712_; i_1844_ < 0; i_1844_++) {
								byte i_1845_ = (aByteArray11394[(i_1718_ >> 16) + i_1843_]);
								int i_1846_ = (i_1845_ > 0 ? anIntArray11393[i_1845_] : 0);
								int i_1847_ = i_1846_ + i_1715_;
								int i_1848_ = ((i_1846_ & 0xff00ff) + (i_1715_ & 0xff00ff));
								int i_1849_ = ((i_1848_ & 0x1000100) + (i_1847_ - i_1848_ & 0x10000));
								i_1846_ = i_1847_ - i_1849_ | i_1849_ - (i_1849_ >>> 8);
								i_1849_ = is[i_1727_];
								i_1847_ = i_1846_ + i_1849_;
								i_1848_ = (i_1846_ & 0xff00ff) + (i_1849_ & 0xff00ff);
								i_1849_ = ((i_1848_ & 0x1000100) + (i_1847_ - i_1848_ & 0x10000));
								is[i_1727_++] = i_1847_ - i_1849_ | i_1849_ - (i_1849_ >>> 8);
								i_1718_ += i_1723_;
							}
							i_1719_ += i_1724_;
							i_1718_ = i_1841_;
							i_1727_ += i_1728_;
						}
					} else if (i_1714_ == 2) {
						int i_1850_ = i_1715_ >>> 24;
						int i_1851_ = 256 - i_1850_;
						int i_1852_ = (i_1715_ & 0xff00ff) * i_1851_ & ~0xff00ff;
						int i_1853_ = (i_1715_ & 0xff00) * i_1851_ & 0xff0000;
						i_1715_ = (i_1852_ | i_1853_) >>> 8;
						int i_1854_ = i_1718_;
						for (int i_1855_ = -i_1713_; i_1855_ < 0; i_1855_++) {
							int i_1856_ = (i_1719_ >> 16) * anInt8945;
							for (int i_1857_ = -i_1712_; i_1857_ < 0; i_1857_++) {
								int i_1858_ = (aByteArray11394[(i_1718_ >> 16) + i_1856_]);
								if (i_1858_ != 0) {
									int i_1859_ = anIntArray11393[i_1858_ & 0xff];
									i_1852_ = ((i_1859_ & 0xff00ff) * i_1850_ & ~0xff00ff);
									i_1853_ = ((i_1859_ & 0xff00) * i_1850_ & 0xff0000);
									i_1859_ = (((i_1852_ | i_1853_) >>> 8) + i_1715_);
									int i_1860_ = is[i_1727_];
									int i_1861_ = i_1859_ + i_1860_;
									int i_1862_ = ((i_1859_ & 0xff00ff) + (i_1860_ & 0xff00ff));
									i_1860_ = ((i_1862_ & 0x1000100) + (i_1861_ - i_1862_ & 0x10000));
									is[i_1727_++] = (i_1861_ - i_1860_ | i_1860_ - (i_1860_ >>> 8));
								} else
									i_1727_++;
								i_1718_ += i_1723_;
							}
							i_1719_ += i_1724_;
							i_1718_ = i_1854_;
							i_1727_ += i_1728_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method1749(int i, int i_1863_, int i_1864_, int i_1865_, int i_1866_, int i_1867_, int i_1868_, int i_1869_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		if (i_1864_ > 0 && i_1865_ > 0) {
			int[] is = aClass167_Sub1_8946.anIntArray8996;
			if (is != null) {
				int i_1870_ = 0;
				int i_1871_ = 0;
				int i_1872_ = aClass167_Sub1_8946.anInt8997 * -570111553;
				int i_1873_ = anInt8977 + anInt8945 + anInt8948;
				int i_1874_ = anInt8947 + anInt8950 + anInt8952;
				int i_1875_ = (i_1873_ << 16) / i_1864_;
				int i_1876_ = (i_1874_ << 16) / i_1865_;
				if (anInt8977 > 0) {
					int i_1877_ = ((anInt8977 << 16) + i_1875_ - 1) / i_1875_;
					i += i_1877_;
					i_1870_ += i_1877_ * i_1875_ - (anInt8977 << 16);
				}
				if (anInt8947 > 0) {
					int i_1878_ = ((anInt8947 << 16) + i_1876_ - 1) / i_1876_;
					i_1863_ += i_1878_;
					i_1871_ += i_1878_ * i_1876_ - (anInt8947 << 16);
				}
				if (anInt8945 < i_1873_)
					i_1864_ = (((anInt8945 << 16) - i_1870_ + i_1875_ - 1) / i_1875_);
				if (anInt8950 < i_1874_)
					i_1865_ = (((anInt8950 << 16) - i_1871_ + i_1876_ - 1) / i_1876_);
				int i_1879_ = i + i_1863_ * i_1872_;
				int i_1880_ = i_1872_ - i_1864_;
				if (i_1863_ + i_1865_ > aClass167_Sub1_8946.anInt9003 * -148513205)
					i_1865_ -= (i_1863_ + i_1865_ - aClass167_Sub1_8946.anInt9003 * -148513205);
				if (i_1863_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
					int i_1881_ = (aClass167_Sub1_8946.anInt9021 * -1593163361 - i_1863_);
					i_1865_ -= i_1881_;
					i_1879_ += i_1881_ * i_1872_;
					i_1871_ += i_1876_ * i_1881_;
				}
				if (i + i_1864_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
					int i_1882_ = (i + i_1864_ - aClass167_Sub1_8946.anInt9001 * 2024498147);
					i_1864_ -= i_1882_;
					i_1880_ += i_1882_;
				}
				if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
					int i_1883_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
					i_1864_ -= i_1883_;
					i_1879_ += i_1883_;
					i_1870_ += i_1875_ * i_1883_;
					i_1880_ += i_1883_;
				}
				if (i_1868_ == 0) {
					if (i_1866_ == 1) {
						int i_1884_ = i_1870_;
						for (int i_1885_ = -i_1865_; i_1885_ < 0; i_1885_++) {
							int i_1886_ = (i_1871_ >> 16) * anInt8945;
							for (int i_1887_ = -i_1864_; i_1887_ < 0; i_1887_++) {
								is[i_1879_++] = (anIntArray11393[(aByteArray11394[(i_1870_ >> 16) + i_1886_]) & 0xff]);
								i_1870_ += i_1875_;
							}
							i_1871_ += i_1876_;
							i_1870_ = i_1884_;
							i_1879_ += i_1880_;
						}
					} else if (i_1866_ == 0) {
						int i_1888_ = (i_1867_ & 0xff0000) >> 16;
						int i_1889_ = (i_1867_ & 0xff00) >> 8;
						int i_1890_ = i_1867_ & 0xff;
						int i_1891_ = i_1870_;
						for (int i_1892_ = -i_1865_; i_1892_ < 0; i_1892_++) {
							int i_1893_ = (i_1871_ >> 16) * anInt8945;
							for (int i_1894_ = -i_1864_; i_1894_ < 0; i_1894_++) {
								int i_1895_ = (anIntArray11393[(aByteArray11394[(i_1870_ >> 16) + i_1893_]) & 0xff]);
								int i_1896_ = ((i_1895_ & 0xff0000) * i_1888_ & ~0xffffff);
								int i_1897_ = (i_1895_ & 0xff00) * i_1889_ & 0xff0000;
								int i_1898_ = (i_1895_ & 0xff) * i_1890_ & 0xff00;
								is[i_1879_++] = (i_1896_ | i_1897_ | i_1898_) >>> 8;
								i_1870_ += i_1875_;
							}
							i_1871_ += i_1876_;
							i_1870_ = i_1891_;
							i_1879_ += i_1880_;
						}
					} else if (i_1866_ == 3) {
						int i_1899_ = i_1870_;
						for (int i_1900_ = -i_1865_; i_1900_ < 0; i_1900_++) {
							int i_1901_ = (i_1871_ >> 16) * anInt8945;
							for (int i_1902_ = -i_1864_; i_1902_ < 0; i_1902_++) {
								byte i_1903_ = (aByteArray11394[(i_1870_ >> 16) + i_1901_]);
								int i_1904_ = (i_1903_ > 0 ? anIntArray11393[i_1903_] : 0);
								int i_1905_ = i_1904_ + i_1867_;
								int i_1906_ = ((i_1904_ & 0xff00ff) + (i_1867_ & 0xff00ff));
								int i_1907_ = ((i_1906_ & 0x1000100) + (i_1905_ - i_1906_ & 0x10000));
								is[i_1879_++] = i_1905_ - i_1907_ | i_1907_ - (i_1907_ >>> 8);
								i_1870_ += i_1875_;
							}
							i_1871_ += i_1876_;
							i_1870_ = i_1899_;
							i_1879_ += i_1880_;
						}
					} else if (i_1866_ == 2) {
						int i_1908_ = i_1867_ >>> 24;
						int i_1909_ = 256 - i_1908_;
						int i_1910_ = (i_1867_ & 0xff00ff) * i_1909_ & ~0xff00ff;
						int i_1911_ = (i_1867_ & 0xff00) * i_1909_ & 0xff0000;
						i_1867_ = (i_1910_ | i_1911_) >>> 8;
						int i_1912_ = i_1870_;
						for (int i_1913_ = -i_1865_; i_1913_ < 0; i_1913_++) {
							int i_1914_ = (i_1871_ >> 16) * anInt8945;
							for (int i_1915_ = -i_1864_; i_1915_ < 0; i_1915_++) {
								int i_1916_ = (anIntArray11393[(aByteArray11394[(i_1870_ >> 16) + i_1914_]) & 0xff]);
								i_1910_ = ((i_1916_ & 0xff00ff) * i_1908_ & ~0xff00ff);
								i_1911_ = (i_1916_ & 0xff00) * i_1908_ & 0xff0000;
								is[i_1879_++] = ((i_1910_ | i_1911_) >>> 8) + i_1867_;
								i_1870_ += i_1875_;
							}
							i_1871_ += i_1876_;
							i_1870_ = i_1912_;
							i_1879_ += i_1880_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1868_ == 1) {
					if (i_1866_ == 1) {
						int i_1917_ = i_1870_;
						for (int i_1918_ = -i_1865_; i_1918_ < 0; i_1918_++) {
							int i_1919_ = (i_1871_ >> 16) * anInt8945;
							for (int i_1920_ = -i_1864_; i_1920_ < 0; i_1920_++) {
								int i_1921_ = (aByteArray11394[(i_1870_ >> 16) + i_1919_]);
								if (i_1921_ != 0)
									is[i_1879_++] = anIntArray11393[i_1921_ & 0xff];
								else
									i_1879_++;
								i_1870_ += i_1875_;
							}
							i_1871_ += i_1876_;
							i_1870_ = i_1917_;
							i_1879_ += i_1880_;
						}
					} else if (i_1866_ == 0) {
						int i_1922_ = i_1870_;
						if ((i_1867_ & 0xffffff) == 16777215) {
							int i_1923_ = i_1867_ >>> 24;
							int i_1924_ = 256 - i_1923_;
							for (int i_1925_ = -i_1865_; i_1925_ < 0; i_1925_++) {
								int i_1926_ = (i_1871_ >> 16) * anInt8945;
								for (int i_1927_ = -i_1864_; i_1927_ < 0; i_1927_++) {
									int i_1928_ = (aByteArray11394[(i_1870_ >> 16) + i_1926_]);
									if (i_1928_ != 0) {
										int i_1929_ = anIntArray11393[i_1928_ & 0xff];
										int i_1930_ = is[i_1879_];
										is[i_1879_++] = ((((i_1929_ & 0xff00ff) * i_1923_ + ((i_1930_ & 0xff00ff) * i_1924_)) & ~0xff00ff) + (((i_1929_ & 0xff00) * i_1923_ + ((i_1930_ & 0xff00) * i_1924_)) & 0xff0000)) >> 8;
									} else
										i_1879_++;
									i_1870_ += i_1875_;
								}
								i_1871_ += i_1876_;
								i_1870_ = i_1922_;
								i_1879_ += i_1880_;
							}
						} else {
							int i_1931_ = (i_1867_ & 0xff0000) >> 16;
							int i_1932_ = (i_1867_ & 0xff00) >> 8;
							int i_1933_ = i_1867_ & 0xff;
							int i_1934_ = i_1867_ >>> 24;
							int i_1935_ = 256 - i_1934_;
							for (int i_1936_ = -i_1865_; i_1936_ < 0; i_1936_++) {
								int i_1937_ = (i_1871_ >> 16) * anInt8945;
								for (int i_1938_ = -i_1864_; i_1938_ < 0; i_1938_++) {
									int i_1939_ = (aByteArray11394[(i_1870_ >> 16) + i_1937_]);
									if (i_1939_ != 0) {
										int i_1940_ = anIntArray11393[i_1939_ & 0xff];
										if (i_1934_ != 255) {
											int i_1941_ = (((i_1940_ & 0xff0000) * i_1931_) & ~0xffffff);
											int i_1942_ = ((i_1940_ & 0xff00) * i_1932_ & 0xff0000);
											int i_1943_ = ((i_1940_ & 0xff) * i_1933_ & 0xff00);
											i_1940_ = (i_1941_ | i_1942_ | i_1943_) >>> 8;
											int i_1944_ = is[i_1879_];
											is[i_1879_++] = (((((i_1940_ & 0xff00ff) * i_1934_) + ((i_1944_ & 0xff00ff) * i_1935_)) & ~0xff00ff) + ((((i_1940_ & 0xff00) * i_1934_) + ((i_1944_ & 0xff00) * i_1935_)) & 0xff0000)) >> 8;
										} else {
											int i_1945_ = (((i_1940_ & 0xff0000) * i_1931_) & ~0xffffff);
											int i_1946_ = ((i_1940_ & 0xff00) * i_1932_ & 0xff0000);
											int i_1947_ = ((i_1940_ & 0xff) * i_1933_ & 0xff00);
											is[i_1879_++] = (i_1945_ | i_1946_ | i_1947_) >>> 8;
										}
									} else
										i_1879_++;
									i_1870_ += i_1875_;
								}
								i_1871_ += i_1876_;
								i_1870_ = i_1922_;
								i_1879_ += i_1880_;
							}
						}
					} else if (i_1866_ == 3) {
						int i_1948_ = i_1870_;
						int i_1949_ = i_1867_ >>> 24;
						int i_1950_ = 256 - i_1949_;
						for (int i_1951_ = -i_1865_; i_1951_ < 0; i_1951_++) {
							int i_1952_ = (i_1871_ >> 16) * anInt8945;
							for (int i_1953_ = -i_1864_; i_1953_ < 0; i_1953_++) {
								byte i_1954_ = (aByteArray11394[(i_1870_ >> 16) + i_1952_]);
								int i_1955_ = (i_1954_ > 0 ? anIntArray11393[i_1954_] : 0);
								int i_1956_ = i_1955_ + i_1867_;
								int i_1957_ = ((i_1955_ & 0xff00ff) + (i_1867_ & 0xff00ff));
								int i_1958_ = ((i_1957_ & 0x1000100) + (i_1956_ - i_1957_ & 0x10000));
								i_1958_ = i_1956_ - i_1958_ | i_1958_ - (i_1958_ >>> 8);
								if (i_1955_ == 0 && i_1949_ != 255) {
									i_1955_ = i_1958_;
									i_1958_ = is[i_1879_];
									i_1958_ = ((((i_1955_ & 0xff00ff) * i_1949_ + (i_1958_ & 0xff00ff) * i_1950_) & ~0xff00ff) + (((i_1955_ & 0xff00) * i_1949_ + (i_1958_ & 0xff00) * i_1950_) & 0xff0000)) >> 8;
								}
								is[i_1879_++] = i_1958_;
								i_1870_ += i_1875_;
							}
							i_1871_ += i_1876_;
							i_1870_ = i_1948_;
							i_1879_ += i_1880_;
						}
					} else if (i_1866_ == 2) {
						int i_1959_ = i_1867_ >>> 24;
						int i_1960_ = 256 - i_1959_;
						int i_1961_ = (i_1867_ & 0xff00ff) * i_1960_ & ~0xff00ff;
						int i_1962_ = (i_1867_ & 0xff00) * i_1960_ & 0xff0000;
						i_1867_ = (i_1961_ | i_1962_) >>> 8;
						int i_1963_ = i_1870_;
						for (int i_1964_ = -i_1865_; i_1964_ < 0; i_1964_++) {
							int i_1965_ = (i_1871_ >> 16) * anInt8945;
							for (int i_1966_ = -i_1864_; i_1966_ < 0; i_1966_++) {
								int i_1967_ = (aByteArray11394[(i_1870_ >> 16) + i_1965_]);
								if (i_1967_ != 0) {
									int i_1968_ = anIntArray11393[i_1967_ & 0xff];
									i_1961_ = ((i_1968_ & 0xff00ff) * i_1959_ & ~0xff00ff);
									i_1962_ = ((i_1968_ & 0xff00) * i_1959_ & 0xff0000);
									is[i_1879_++] = ((i_1961_ | i_1962_) >>> 8) + i_1867_;
								} else
									i_1879_++;
								i_1870_ += i_1875_;
							}
							i_1871_ += i_1876_;
							i_1870_ = i_1963_;
							i_1879_ += i_1880_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1868_ == 2) {
					if (i_1866_ == 1) {
						int i_1969_ = i_1870_;
						for (int i_1970_ = -i_1865_; i_1970_ < 0; i_1970_++) {
							int i_1971_ = (i_1871_ >> 16) * anInt8945;
							for (int i_1972_ = -i_1864_; i_1972_ < 0; i_1972_++) {
								int i_1973_ = (aByteArray11394[(i_1870_ >> 16) + i_1971_]);
								if (i_1973_ != 0) {
									int i_1974_ = anIntArray11393[i_1973_ & 0xff];
									int i_1975_ = is[i_1879_];
									int i_1976_ = i_1974_ + i_1975_;
									int i_1977_ = ((i_1974_ & 0xff00ff) + (i_1975_ & 0xff00ff));
									i_1975_ = ((i_1977_ & 0x1000100) + (i_1976_ - i_1977_ & 0x10000));
									is[i_1879_++] = (i_1976_ - i_1975_ | i_1975_ - (i_1975_ >>> 8));
								} else
									i_1879_++;
								i_1870_ += i_1875_;
							}
							i_1871_ += i_1876_;
							i_1870_ = i_1969_;
							i_1879_ += i_1880_;
						}
					} else if (i_1866_ == 0) {
						int i_1978_ = i_1870_;
						int i_1979_ = (i_1867_ & 0xff0000) >> 16;
						int i_1980_ = (i_1867_ & 0xff00) >> 8;
						int i_1981_ = i_1867_ & 0xff;
						for (int i_1982_ = -i_1865_; i_1982_ < 0; i_1982_++) {
							int i_1983_ = (i_1871_ >> 16) * anInt8945;
							for (int i_1984_ = -i_1864_; i_1984_ < 0; i_1984_++) {
								int i_1985_ = (aByteArray11394[(i_1870_ >> 16) + i_1983_]);
								if (i_1985_ != 0) {
									int i_1986_ = anIntArray11393[i_1985_ & 0xff];
									int i_1987_ = ((i_1986_ & 0xff0000) * i_1979_ & ~0xffffff);
									int i_1988_ = ((i_1986_ & 0xff00) * i_1980_ & 0xff0000);
									int i_1989_ = (i_1986_ & 0xff) * i_1981_ & 0xff00;
									i_1986_ = (i_1987_ | i_1988_ | i_1989_) >>> 8;
									int i_1990_ = is[i_1879_];
									int i_1991_ = i_1986_ + i_1990_;
									int i_1992_ = ((i_1986_ & 0xff00ff) + (i_1990_ & 0xff00ff));
									i_1990_ = ((i_1992_ & 0x1000100) + (i_1991_ - i_1992_ & 0x10000));
									is[i_1879_++] = (i_1991_ - i_1990_ | i_1990_ - (i_1990_ >>> 8));
								} else
									i_1879_++;
								i_1870_ += i_1875_;
							}
							i_1871_ += i_1876_;
							i_1870_ = i_1978_;
							i_1879_ += i_1880_;
						}
					} else if (i_1866_ == 3) {
						int i_1993_ = i_1870_;
						for (int i_1994_ = -i_1865_; i_1994_ < 0; i_1994_++) {
							int i_1995_ = (i_1871_ >> 16) * anInt8945;
							for (int i_1996_ = -i_1864_; i_1996_ < 0; i_1996_++) {
								byte i_1997_ = (aByteArray11394[(i_1870_ >> 16) + i_1995_]);
								int i_1998_ = (i_1997_ > 0 ? anIntArray11393[i_1997_] : 0);
								int i_1999_ = i_1998_ + i_1867_;
								int i_2000_ = ((i_1998_ & 0xff00ff) + (i_1867_ & 0xff00ff));
								int i_2001_ = ((i_2000_ & 0x1000100) + (i_1999_ - i_2000_ & 0x10000));
								i_1998_ = i_1999_ - i_2001_ | i_2001_ - (i_2001_ >>> 8);
								i_2001_ = is[i_1879_];
								i_1999_ = i_1998_ + i_2001_;
								i_2000_ = (i_1998_ & 0xff00ff) + (i_2001_ & 0xff00ff);
								i_2001_ = ((i_2000_ & 0x1000100) + (i_1999_ - i_2000_ & 0x10000));
								is[i_1879_++] = i_1999_ - i_2001_ | i_2001_ - (i_2001_ >>> 8);
								i_1870_ += i_1875_;
							}
							i_1871_ += i_1876_;
							i_1870_ = i_1993_;
							i_1879_ += i_1880_;
						}
					} else if (i_1866_ == 2) {
						int i_2002_ = i_1867_ >>> 24;
						int i_2003_ = 256 - i_2002_;
						int i_2004_ = (i_1867_ & 0xff00ff) * i_2003_ & ~0xff00ff;
						int i_2005_ = (i_1867_ & 0xff00) * i_2003_ & 0xff0000;
						i_1867_ = (i_2004_ | i_2005_) >>> 8;
						int i_2006_ = i_1870_;
						for (int i_2007_ = -i_1865_; i_2007_ < 0; i_2007_++) {
							int i_2008_ = (i_1871_ >> 16) * anInt8945;
							for (int i_2009_ = -i_1864_; i_2009_ < 0; i_2009_++) {
								int i_2010_ = (aByteArray11394[(i_1870_ >> 16) + i_2008_]);
								if (i_2010_ != 0) {
									int i_2011_ = anIntArray11393[i_2010_ & 0xff];
									i_2004_ = ((i_2011_ & 0xff00ff) * i_2002_ & ~0xff00ff);
									i_2005_ = ((i_2011_ & 0xff00) * i_2002_ & 0xff0000);
									i_2011_ = (((i_2004_ | i_2005_) >>> 8) + i_1867_);
									int i_2012_ = is[i_1879_];
									int i_2013_ = i_2011_ + i_2012_;
									int i_2014_ = ((i_2011_ & 0xff00ff) + (i_2012_ & 0xff00ff));
									i_2012_ = ((i_2014_ & 0x1000100) + (i_2013_ - i_2014_ & 0x10000));
									is[i_1879_++] = (i_2013_ - i_2012_ | i_2012_ - (i_2012_ >>> 8));
								} else
									i_1879_++;
								i_1870_ += i_1875_;
							}
							i_1871_ += i_1876_;
							i_1870_ = i_2006_;
							i_1879_ += i_1880_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method8435(int[] is, int[] is_2015_, int i, int i_2016_) {
		int[] is_2017_ = aClass167_Sub1_8946.anIntArray8996;
		if (is_2017_ != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_2018_ = anInt8957;
					while (i_2018_ < 0) {
						int i_2019_ = i_2018_ + i_2016_;
						if (i_2019_ >= 0) {
							if (i_2019_ >= is.length)
								break;
							int i_2020_ = anInt8959;
							int i_2021_ = anInt8966;
							int i_2022_ = anInt8967;
							int i_2023_ = anInt8955;
							if (i_2021_ >= 0 && i_2022_ >= 0 && i_2021_ - (anInt8945 << 12) < 0 && i_2022_ - (anInt8950 << 12) < 0) {
								int i_2024_ = is[i_2019_] - i;
								int i_2025_ = -is_2015_[i_2019_];
								int i_2026_ = i_2024_ - (i_2020_ - anInt8959);
								if (i_2026_ > 0) {
									i_2020_ += i_2026_;
									i_2023_ += i_2026_;
									i_2021_ += anInt8960 * i_2026_;
									i_2022_ += anInt8962 * i_2026_;
								} else
									i_2025_ -= i_2026_;
								if (i_2023_ < i_2025_)
									i_2023_ = i_2025_;
								for (/**/; i_2023_ < 0; i_2023_++) {
									int i_2027_ = (aByteArray11394[((i_2022_ >> 12) * anInt8945 + (i_2021_ >> 12))]);
									if (i_2027_ != 0)
										is_2017_[i_2020_++] = anIntArray11393[i_2027_ & 0xff];
									else
										i_2020_++;
								}
							}
						}
						i_2018_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_2028_ = anInt8957;
					while (i_2028_ < 0) {
						int i_2029_ = i_2028_ + i_2016_;
						if (i_2029_ >= 0) {
							if (i_2029_ >= is.length)
								break;
							int i_2030_ = anInt8959;
							int i_2031_ = anInt8966;
							int i_2032_ = anInt8967 + anInt8969;
							int i_2033_ = anInt8955;
							if (i_2031_ >= 0 && i_2031_ - (anInt8945 << 12) < 0) {
								int i_2034_;
								if ((i_2034_ = i_2032_ - (anInt8950 << 12)) >= 0) {
									i_2034_ = (anInt8962 - i_2034_) / anInt8962;
									i_2033_ += i_2034_;
									i_2032_ += anInt8962 * i_2034_;
									i_2030_ += i_2034_;
								}
								if ((i_2034_ = (i_2032_ - anInt8962) / anInt8962) > i_2033_)
									i_2033_ = i_2034_;
								int i_2035_ = is[i_2029_] - i;
								int i_2036_ = -is_2015_[i_2029_];
								int i_2037_ = i_2035_ - (i_2030_ - anInt8959);
								if (i_2037_ > 0) {
									i_2030_ += i_2037_;
									i_2033_ += i_2037_;
									i_2031_ += anInt8960 * i_2037_;
									i_2032_ += anInt8962 * i_2037_;
								} else
									i_2036_ -= i_2037_;
								if (i_2033_ < i_2036_)
									i_2033_ = i_2036_;
								for (/**/; i_2033_ < 0; i_2033_++) {
									int i_2038_ = (aByteArray11394[((i_2032_ >> 12) * anInt8945 + (i_2031_ >> 12))]);
									if (i_2038_ != 0)
										is_2017_[i_2030_++] = anIntArray11393[i_2038_ & 0xff];
									else
										i_2030_++;
									i_2032_ += anInt8962;
								}
							}
						}
						i_2028_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_2039_ = anInt8957;
					while (i_2039_ < 0) {
						int i_2040_ = i_2039_ + i_2016_;
						if (i_2040_ >= 0) {
							if (i_2040_ >= is.length)
								break;
							int i_2041_ = anInt8959;
							int i_2042_ = anInt8966;
							int i_2043_ = anInt8967 + anInt8969;
							int i_2044_ = anInt8955;
							if (i_2042_ >= 0 && i_2042_ - (anInt8945 << 12) < 0) {
								if (i_2043_ < 0) {
									int i_2045_ = ((anInt8962 - 1 - i_2043_) / anInt8962);
									i_2044_ += i_2045_;
									i_2043_ += anInt8962 * i_2045_;
									i_2041_ += i_2045_;
								}
								int i_2046_;
								if ((i_2046_ = (1 + i_2043_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_2044_)
									i_2044_ = i_2046_;
								int i_2047_ = is[i_2040_] - i;
								int i_2048_ = -is_2015_[i_2040_];
								int i_2049_ = i_2047_ - (i_2041_ - anInt8959);
								if (i_2049_ > 0) {
									i_2041_ += i_2049_;
									i_2044_ += i_2049_;
									i_2042_ += anInt8960 * i_2049_;
									i_2043_ += anInt8962 * i_2049_;
								} else
									i_2048_ -= i_2049_;
								if (i_2044_ < i_2048_)
									i_2044_ = i_2048_;
								for (/**/; i_2044_ < 0; i_2044_++) {
									int i_2050_ = (aByteArray11394[((i_2043_ >> 12) * anInt8945 + (i_2042_ >> 12))]);
									if (i_2050_ != 0)
										is_2017_[i_2041_++] = anIntArray11393[i_2050_ & 0xff];
									else
										i_2041_++;
									i_2043_ += anInt8962;
								}
							}
						}
						i_2039_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_2051_ = anInt8957;
					while (i_2051_ < 0) {
						int i_2052_ = i_2051_ + i_2016_;
						if (i_2052_ >= 0) {
							if (i_2052_ >= is.length)
								break;
							int i_2053_ = anInt8959;
							int i_2054_ = anInt8966 + anInt8968;
							int i_2055_ = anInt8967;
							int i_2056_ = anInt8955;
							if (i_2055_ >= 0 && i_2055_ - (anInt8950 << 12) < 0) {
								int i_2057_;
								if ((i_2057_ = i_2054_ - (anInt8945 << 12)) >= 0) {
									i_2057_ = (anInt8960 - i_2057_) / anInt8960;
									i_2056_ += i_2057_;
									i_2054_ += anInt8960 * i_2057_;
									i_2053_ += i_2057_;
								}
								if ((i_2057_ = (i_2054_ - anInt8960) / anInt8960) > i_2056_)
									i_2056_ = i_2057_;
								int i_2058_ = is[i_2052_] - i;
								int i_2059_ = -is_2015_[i_2052_];
								int i_2060_ = i_2058_ - (i_2053_ - anInt8959);
								if (i_2060_ > 0) {
									i_2053_ += i_2060_;
									i_2056_ += i_2060_;
									i_2054_ += anInt8960 * i_2060_;
									i_2055_ += anInt8962 * i_2060_;
								} else
									i_2059_ -= i_2060_;
								if (i_2056_ < i_2059_)
									i_2056_ = i_2059_;
								for (/**/; i_2056_ < 0; i_2056_++) {
									int i_2061_ = (aByteArray11394[((i_2055_ >> 12) * anInt8945 + (i_2054_ >> 12))]);
									if (i_2061_ != 0)
										is_2017_[i_2053_++] = anIntArray11393[i_2061_ & 0xff];
									else
										i_2053_++;
									i_2054_ += anInt8960;
								}
							}
						}
						i_2051_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_2062_ = anInt8957;
					while (i_2062_ < 0) {
						int i_2063_ = i_2062_ + i_2016_;
						if (i_2063_ >= 0) {
							if (i_2063_ >= is.length)
								break;
							int i_2064_ = anInt8959;
							int i_2065_ = anInt8966 + anInt8968;
							int i_2066_ = anInt8967 + anInt8969;
							int i_2067_ = anInt8955;
							int i_2068_;
							if ((i_2068_ = i_2065_ - (anInt8945 << 12)) >= 0) {
								i_2068_ = (anInt8960 - i_2068_) / anInt8960;
								i_2067_ += i_2068_;
								i_2065_ += anInt8960 * i_2068_;
								i_2066_ += anInt8962 * i_2068_;
								i_2064_ += i_2068_;
							}
							if ((i_2068_ = (i_2065_ - anInt8960) / anInt8960) > i_2067_)
								i_2067_ = i_2068_;
							if ((i_2068_ = i_2066_ - (anInt8950 << 12)) >= 0) {
								i_2068_ = (anInt8962 - i_2068_) / anInt8962;
								i_2067_ += i_2068_;
								i_2065_ += anInt8960 * i_2068_;
								i_2066_ += anInt8962 * i_2068_;
								i_2064_ += i_2068_;
							}
							if ((i_2068_ = (i_2066_ - anInt8962) / anInt8962) > i_2067_)
								i_2067_ = i_2068_;
							int i_2069_ = is[i_2063_] - i;
							int i_2070_ = -is_2015_[i_2063_];
							int i_2071_ = i_2069_ - (i_2064_ - anInt8959);
							if (i_2071_ > 0) {
								i_2064_ += i_2071_;
								i_2067_ += i_2071_;
								i_2065_ += anInt8960 * i_2071_;
								i_2066_ += anInt8962 * i_2071_;
							} else
								i_2070_ -= i_2071_;
							if (i_2067_ < i_2070_)
								i_2067_ = i_2070_;
							for (/**/; i_2067_ < 0; i_2067_++) {
								int i_2072_ = (aByteArray11394[((i_2066_ >> 12) * anInt8945 + (i_2065_ >> 12))]);
								if (i_2072_ != 0)
									is_2017_[i_2064_++] = anIntArray11393[i_2072_ & 0xff];
								else
									i_2064_++;
								i_2065_ += anInt8960;
								i_2066_ += anInt8962;
							}
						}
						i_2062_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_2073_ = anInt8957;
					while (i_2073_ < 0) {
						int i_2074_ = i_2073_ + i_2016_;
						if (i_2074_ >= 0) {
							if (i_2074_ >= is.length)
								break;
							int i_2075_ = anInt8959;
							int i_2076_ = anInt8966 + anInt8968;
							int i_2077_ = anInt8967 + anInt8969;
							int i_2078_ = anInt8955;
							int i_2079_;
							if ((i_2079_ = i_2076_ - (anInt8945 << 12)) >= 0) {
								i_2079_ = (anInt8960 - i_2079_) / anInt8960;
								i_2078_ += i_2079_;
								i_2076_ += anInt8960 * i_2079_;
								i_2077_ += anInt8962 * i_2079_;
								i_2075_ += i_2079_;
							}
							if ((i_2079_ = (i_2076_ - anInt8960) / anInt8960) > i_2078_)
								i_2078_ = i_2079_;
							if (i_2077_ < 0) {
								i_2079_ = (anInt8962 - 1 - i_2077_) / anInt8962;
								i_2078_ += i_2079_;
								i_2076_ += anInt8960 * i_2079_;
								i_2077_ += anInt8962 * i_2079_;
								i_2075_ += i_2079_;
							}
							if ((i_2079_ = (1 + i_2077_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_2078_)
								i_2078_ = i_2079_;
							int i_2080_ = is[i_2074_] - i;
							int i_2081_ = -is_2015_[i_2074_];
							int i_2082_ = i_2080_ - (i_2075_ - anInt8959);
							if (i_2082_ > 0) {
								i_2075_ += i_2082_;
								i_2078_ += i_2082_;
								i_2076_ += anInt8960 * i_2082_;
								i_2077_ += anInt8962 * i_2082_;
							} else
								i_2081_ -= i_2082_;
							if (i_2078_ < i_2081_)
								i_2078_ = i_2081_;
							for (/**/; i_2078_ < 0; i_2078_++) {
								int i_2083_ = (aByteArray11394[((i_2077_ >> 12) * anInt8945 + (i_2076_ >> 12))]);
								if (i_2083_ != 0)
									is_2017_[i_2075_++] = anIntArray11393[i_2083_ & 0xff];
								else
									i_2075_++;
								i_2076_ += anInt8960;
								i_2077_ += anInt8962;
							}
						}
						i_2073_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_2084_ = anInt8957;
				while (i_2084_ < 0) {
					int i_2085_ = i_2084_ + i_2016_;
					if (i_2085_ >= 0) {
						if (i_2085_ >= is.length)
							break;
						int i_2086_ = anInt8959;
						int i_2087_ = anInt8966 + anInt8968;
						int i_2088_ = anInt8967;
						int i_2089_ = anInt8955;
						if (i_2088_ >= 0 && i_2088_ - (anInt8950 << 12) < 0) {
							if (i_2087_ < 0) {
								int i_2090_ = (anInt8960 - 1 - i_2087_) / anInt8960;
								i_2089_ += i_2090_;
								i_2087_ += anInt8960 * i_2090_;
								i_2086_ += i_2090_;
							}
							int i_2091_;
							if ((i_2091_ = (1 + i_2087_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_2089_)
								i_2089_ = i_2091_;
							int i_2092_ = is[i_2085_] - i;
							int i_2093_ = -is_2015_[i_2085_];
							int i_2094_ = i_2092_ - (i_2086_ - anInt8959);
							if (i_2094_ > 0) {
								i_2086_ += i_2094_;
								i_2089_ += i_2094_;
								i_2087_ += anInt8960 * i_2094_;
								i_2088_ += anInt8962 * i_2094_;
							} else
								i_2093_ -= i_2094_;
							if (i_2089_ < i_2093_)
								i_2089_ = i_2093_;
							for (/**/; i_2089_ < 0; i_2089_++) {
								int i_2095_ = (aByteArray11394[((i_2088_ >> 12) * anInt8945 + (i_2087_ >> 12))]);
								if (i_2095_ != 0)
									is_2017_[i_2086_++] = anIntArray11393[i_2095_ & 0xff];
								else
									i_2086_++;
								i_2087_ += anInt8960;
							}
						}
					}
					i_2084_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				int i_2096_ = anInt8957;
				while (i_2096_ < 0) {
					int i_2097_ = i_2096_ + i_2016_;
					if (i_2097_ >= 0) {
						if (i_2097_ >= is.length)
							break;
						int i_2098_ = anInt8959;
						int i_2099_ = anInt8966 + anInt8968;
						int i_2100_ = anInt8967 + anInt8969;
						int i_2101_ = anInt8955;
						if (i_2099_ < 0) {
							int i_2102_ = (anInt8960 - 1 - i_2099_) / anInt8960;
							i_2101_ += i_2102_;
							i_2099_ += anInt8960 * i_2102_;
							i_2100_ += anInt8962 * i_2102_;
							i_2098_ += i_2102_;
						}
						int i_2103_;
						if ((i_2103_ = (1 + i_2099_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_2101_)
							i_2101_ = i_2103_;
						if ((i_2103_ = i_2100_ - (anInt8950 << 12)) >= 0) {
							i_2103_ = (anInt8962 - i_2103_) / anInt8962;
							i_2101_ += i_2103_;
							i_2099_ += anInt8960 * i_2103_;
							i_2100_ += anInt8962 * i_2103_;
							i_2098_ += i_2103_;
						}
						if ((i_2103_ = (i_2100_ - anInt8962) / anInt8962) > i_2101_)
							i_2101_ = i_2103_;
						int i_2104_ = is[i_2097_] - i;
						int i_2105_ = -is_2015_[i_2097_];
						int i_2106_ = i_2104_ - (i_2098_ - anInt8959);
						if (i_2106_ > 0) {
							i_2098_ += i_2106_;
							i_2101_ += i_2106_;
							i_2099_ += anInt8960 * i_2106_;
							i_2100_ += anInt8962 * i_2106_;
						} else
							i_2105_ -= i_2106_;
						if (i_2101_ < i_2105_)
							i_2101_ = i_2105_;
						for (/**/; i_2101_ < 0; i_2101_++) {
							int i_2107_ = (aByteArray11394[(i_2100_ >> 12) * anInt8945 + (i_2099_ >> 12)]);
							if (i_2107_ != 0)
								is_2017_[i_2098_++] = anIntArray11393[i_2107_ & 0xff];
							else
								i_2098_++;
							i_2099_ += anInt8960;
							i_2100_ += anInt8962;
						}
					}
					i_2096_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				int i_2108_ = anInt8957;
				while (i_2108_ < 0) {
					int i_2109_ = i_2108_ + i_2016_;
					if (i_2109_ >= 0) {
						if (i_2109_ >= is.length)
							break;
						int i_2110_ = anInt8959;
						int i_2111_ = anInt8966 + anInt8968;
						int i_2112_ = anInt8967 + anInt8969;
						int i_2113_ = anInt8955;
						if (i_2111_ < 0) {
							int i_2114_ = (anInt8960 - 1 - i_2111_) / anInt8960;
							i_2113_ += i_2114_;
							i_2111_ += anInt8960 * i_2114_;
							i_2112_ += anInt8962 * i_2114_;
							i_2110_ += i_2114_;
						}
						int i_2115_;
						if ((i_2115_ = (1 + i_2111_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_2113_)
							i_2113_ = i_2115_;
						if (i_2112_ < 0) {
							i_2115_ = (anInt8962 - 1 - i_2112_) / anInt8962;
							i_2113_ += i_2115_;
							i_2111_ += anInt8960 * i_2115_;
							i_2112_ += anInt8962 * i_2115_;
							i_2110_ += i_2115_;
						}
						if ((i_2115_ = (1 + i_2112_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_2113_)
							i_2113_ = i_2115_;
						int i_2116_ = is[i_2109_] - i;
						int i_2117_ = -is_2015_[i_2109_];
						int i_2118_ = i_2116_ - (i_2110_ - anInt8959);
						if (i_2118_ > 0) {
							i_2110_ += i_2118_;
							i_2113_ += i_2118_;
							i_2111_ += anInt8960 * i_2118_;
							i_2112_ += anInt8962 * i_2118_;
						} else
							i_2117_ -= i_2118_;
						if (i_2113_ < i_2117_)
							i_2113_ = i_2117_;
						for (/**/; i_2113_ < 0; i_2113_++) {
							int i_2119_ = (aByteArray11394[(i_2112_ >> 12) * anInt8945 + (i_2111_ >> 12)]);
							if (i_2119_ != 0)
								is_2017_[i_2110_++] = anIntArray11393[i_2119_ & 0xff];
							else
								i_2110_++;
							i_2111_ += anInt8960;
							i_2112_ += anInt8962;
						}
					}
					i_2108_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	void method8433(int i, int i_2120_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_2121_ = anInt8957;
					while (i_2121_ < 0) {
						int i_2122_ = anInt8959;
						int i_2123_ = anInt8966;
						int i_2124_ = anInt8967;
						int i_2125_ = anInt8955;
						if (i_2123_ >= 0 && i_2124_ >= 0 && i_2123_ - (anInt8945 << 12) < 0 && i_2124_ - (anInt8950 << 12) < 0) {
							for (/**/; i_2125_ < 0; i_2125_++) {
								int i_2126_ = ((i_2124_ >> 12) * anInt8945 + (i_2123_ >> 12));
								int i_2127_ = i_2122_++;
								if (i_2120_ == 0) {
									if (i == 1)
										is[i_2127_] = (anIntArray11393[(aByteArray11394[i_2126_] & 0xff)]);
									else if (i == 0) {
										int i_2128_ = (anIntArray11393[(aByteArray11394[i_2126_] & 0xff)]);
										int i_2129_ = ((i_2128_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_2130_ = ((i_2128_ & 0xff00) * anInt8974 & 0xff0000);
										int i_2131_ = ((i_2128_ & 0xff) * anInt8975 & 0xff00);
										is[i_2127_] = (i_2129_ | i_2130_ | i_2131_) >>> 8;
									} else if (i == 3) {
										int i_2132_ = (anIntArray11393[(aByteArray11394[i_2126_] & 0xff)]);
										int i_2133_ = anInt8944;
										int i_2134_ = i_2132_ + i_2133_;
										int i_2135_ = ((i_2132_ & 0xff00ff) + (i_2133_ & 0xff00ff));
										int i_2136_ = ((i_2135_ & 0x1000100) + (i_2134_ - i_2135_ & 0x10000));
										is[i_2127_] = (i_2134_ - i_2136_ | i_2136_ - (i_2136_ >>> 8));
									} else if (i == 2) {
										int i_2137_ = (anIntArray11393[(aByteArray11394[i_2126_] & 0xff)]);
										int i_2138_ = ((i_2137_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_2139_ = ((i_2137_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_2127_] = ((i_2138_ | i_2139_) >>> 8) + anInt8978;
									} else
										throw new IllegalArgumentException();
								} else if (i_2120_ == 1) {
									if (i == 1) {
										int i_2140_ = aByteArray11394[i_2126_];
										if (i_2140_ != 0)
											is[i_2127_] = (anIntArray11393[i_2140_ & 0xff]);
									} else if (i == 0) {
										int i_2141_ = aByteArray11394[i_2126_];
										if (i_2141_ != 0) {
											int i_2142_ = (anIntArray11393[i_2141_ & 0xff]);
											if ((anInt8944 & 0xffffff) == 16777215) {
												int i_2143_ = anInt8944 >>> 24;
												int i_2144_ = 256 - i_2143_;
												int i_2145_ = is[i_2127_];
												is[i_2127_] = (((((i_2142_ & 0xff00ff) * i_2143_) + ((i_2145_ & 0xff00ff) * i_2144_)) & ~0xff00ff) + ((((i_2142_ & 0xff00) * i_2143_) + ((i_2145_ & 0xff00) * i_2144_)) & 0xff0000)) >> 8;
											} else if (anInt8965 != 255) {
												int i_2146_ = (((i_2142_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_2147_ = (((i_2142_ & 0xff00) * anInt8974) & 0xff0000);
												int i_2148_ = (((i_2142_ & 0xff) * anInt8975) & 0xff00);
												i_2142_ = (i_2146_ | i_2147_ | i_2148_) >>> 8;
												int i_2149_ = is[i_2127_];
												is[i_2127_] = (((((i_2142_ & 0xff00ff) * anInt8965) + ((i_2149_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2142_ & 0xff00) * anInt8965) + ((i_2149_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
											} else {
												int i_2150_ = (((i_2142_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_2151_ = (((i_2142_ & 0xff00) * anInt8974) & 0xff0000);
												int i_2152_ = (((i_2142_ & 0xff) * anInt8975) & 0xff00);
												is[i_2127_] = (i_2150_ | i_2151_ | i_2152_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_2153_ = aByteArray11394[i_2126_];
										int i_2154_ = (i_2153_ > 0 ? anIntArray11393[i_2153_] : 0);
										int i_2155_ = anInt8944;
										int i_2156_ = i_2154_ + i_2155_;
										int i_2157_ = ((i_2154_ & 0xff00ff) + (i_2155_ & 0xff00ff));
										int i_2158_ = ((i_2157_ & 0x1000100) + (i_2156_ - i_2157_ & 0x10000));
										i_2158_ = (i_2156_ - i_2158_ | i_2158_ - (i_2158_ >>> 8));
										if (i_2154_ == 0 && anInt8965 != 255) {
											i_2154_ = i_2158_;
											i_2158_ = is[i_2127_];
											i_2158_ = (((((i_2154_ & 0xff00ff) * anInt8965) + ((i_2158_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2154_ & 0xff00) * anInt8965) + ((i_2158_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_2127_] = i_2158_;
									} else if (i == 2) {
										int i_2159_ = aByteArray11394[i_2126_];
										if (i_2159_ != 0) {
											int i_2160_ = (anIntArray11393[i_2159_ & 0xff]);
											int i_2161_ = (((i_2160_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_2162_ = (((i_2160_ & 0xff00) * anInt8965) & 0xff0000);
											is[i_2127_++] = (((i_2161_ | i_2162_) >>> 8) + anInt8978);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2120_ == 2) {
									if (i == 1) {
										int i_2163_ = aByteArray11394[i_2126_];
										if (i_2163_ != 0) {
											int i_2164_ = (anIntArray11393[i_2163_ & 0xff]);
											int i_2165_ = is[i_2127_];
											int i_2166_ = i_2164_ + i_2165_;
											int i_2167_ = ((i_2164_ & 0xff00ff) + (i_2165_ & 0xff00ff));
											i_2165_ = ((i_2167_ & 0x1000100) + (i_2166_ - i_2167_ & 0x10000));
											is[i_2127_] = (i_2166_ - i_2165_ | i_2165_ - (i_2165_ >>> 8));
										}
									} else if (i == 0) {
										int i_2168_ = aByteArray11394[i_2126_];
										if (i_2168_ != 0) {
											int i_2169_ = (anIntArray11393[i_2168_ & 0xff]);
											int i_2170_ = (((i_2169_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_2171_ = (((i_2169_ & 0xff00) * anInt8974) & 0xff0000);
											int i_2172_ = ((i_2169_ & 0xff) * anInt8975 & 0xff00);
											i_2169_ = (i_2170_ | i_2171_ | i_2172_) >>> 8;
											int i_2173_ = is[i_2127_];
											int i_2174_ = i_2169_ + i_2173_;
											int i_2175_ = ((i_2169_ & 0xff00ff) + (i_2173_ & 0xff00ff));
											i_2173_ = ((i_2175_ & 0x1000100) + (i_2174_ - i_2175_ & 0x10000));
											is[i_2127_] = (i_2174_ - i_2173_ | i_2173_ - (i_2173_ >>> 8));
										}
									} else if (i == 3) {
										byte i_2176_ = aByteArray11394[i_2126_];
										int i_2177_ = (i_2176_ > 0 ? anIntArray11393[i_2176_] : 0);
										int i_2178_ = anInt8944;
										int i_2179_ = i_2177_ + i_2178_;
										int i_2180_ = ((i_2177_ & 0xff00ff) + (i_2178_ & 0xff00ff));
										int i_2181_ = ((i_2180_ & 0x1000100) + (i_2179_ - i_2180_ & 0x10000));
										i_2181_ = (i_2179_ - i_2181_ | i_2181_ - (i_2181_ >>> 8));
										if (i_2177_ == 0 && anInt8965 != 255) {
											i_2177_ = i_2181_;
											i_2181_ = is[i_2127_];
											i_2181_ = (((((i_2177_ & 0xff00ff) * anInt8965) + ((i_2181_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2177_ & 0xff00) * anInt8965) + ((i_2181_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_2127_] = i_2181_;
									} else if (i == 2) {
										int i_2182_ = aByteArray11394[i_2126_];
										if (i_2182_ != 0) {
											int i_2183_ = (anIntArray11393[i_2182_ & 0xff]);
											int i_2184_ = (((i_2183_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_2185_ = (((i_2183_ & 0xff00) * anInt8965) & 0xff0000);
											i_2183_ = ((i_2184_ | i_2185_) >>> 8) + anInt8978;
											int i_2186_ = is[i_2127_];
											int i_2187_ = i_2183_ + i_2186_;
											int i_2188_ = ((i_2183_ & 0xff00ff) + (i_2186_ & 0xff00ff));
											i_2186_ = ((i_2188_ & 0x1000100) + (i_2187_ - i_2188_ & 0x10000));
											is[i_2127_] = (i_2187_ - i_2186_ | i_2186_ - (i_2186_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_2121_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_2189_ = anInt8957;
					while (i_2189_ < 0) {
						int i_2190_ = anInt8959;
						int i_2191_ = anInt8966;
						int i_2192_ = anInt8967 + anInt8969;
						int i_2193_ = anInt8955;
						if (i_2191_ >= 0 && i_2191_ - (anInt8945 << 12) < 0) {
							int i_2194_;
							if ((i_2194_ = i_2192_ - (anInt8950 << 12)) >= 0) {
								i_2194_ = (anInt8962 - i_2194_) / anInt8962;
								i_2193_ += i_2194_;
								i_2192_ += anInt8962 * i_2194_;
								i_2190_ += i_2194_;
							}
							if ((i_2194_ = (i_2192_ - anInt8962) / anInt8962) > i_2193_)
								i_2193_ = i_2194_;
							for (/**/; i_2193_ < 0; i_2193_++) {
								int i_2195_ = ((i_2192_ >> 12) * anInt8945 + (i_2191_ >> 12));
								int i_2196_ = i_2190_++;
								if (i_2120_ == 0) {
									if (i == 1)
										is[i_2196_] = (anIntArray11393[(aByteArray11394[i_2195_] & 0xff)]);
									else if (i == 0) {
										int i_2197_ = (anIntArray11393[(aByteArray11394[i_2195_] & 0xff)]);
										int i_2198_ = ((i_2197_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_2199_ = ((i_2197_ & 0xff00) * anInt8974 & 0xff0000);
										int i_2200_ = ((i_2197_ & 0xff) * anInt8975 & 0xff00);
										is[i_2196_] = (i_2198_ | i_2199_ | i_2200_) >>> 8;
									} else if (i == 3) {
										int i_2201_ = (anIntArray11393[(aByteArray11394[i_2195_] & 0xff)]);
										int i_2202_ = anInt8944;
										int i_2203_ = i_2201_ + i_2202_;
										int i_2204_ = ((i_2201_ & 0xff00ff) + (i_2202_ & 0xff00ff));
										int i_2205_ = ((i_2204_ & 0x1000100) + (i_2203_ - i_2204_ & 0x10000));
										is[i_2196_] = (i_2203_ - i_2205_ | i_2205_ - (i_2205_ >>> 8));
									} else if (i == 2) {
										int i_2206_ = (anIntArray11393[(aByteArray11394[i_2195_] & 0xff)]);
										int i_2207_ = ((i_2206_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_2208_ = ((i_2206_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_2196_] = ((i_2207_ | i_2208_) >>> 8) + anInt8978;
									} else
										throw new IllegalArgumentException();
								} else if (i_2120_ == 1) {
									if (i == 1) {
										int i_2209_ = aByteArray11394[i_2195_];
										if (i_2209_ != 0)
											is[i_2196_] = (anIntArray11393[i_2209_ & 0xff]);
									} else if (i == 0) {
										int i_2210_ = aByteArray11394[i_2195_];
										if (i_2210_ != 0) {
											int i_2211_ = (anIntArray11393[i_2210_ & 0xff]);
											if ((anInt8944 & 0xffffff) == 16777215) {
												int i_2212_ = anInt8944 >>> 24;
												int i_2213_ = 256 - i_2212_;
												int i_2214_ = is[i_2196_];
												is[i_2196_] = (((((i_2211_ & 0xff00ff) * i_2212_) + ((i_2214_ & 0xff00ff) * i_2213_)) & ~0xff00ff) + ((((i_2211_ & 0xff00) * i_2212_) + ((i_2214_ & 0xff00) * i_2213_)) & 0xff0000)) >> 8;
											} else if (anInt8965 != 255) {
												int i_2215_ = (((i_2211_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_2216_ = (((i_2211_ & 0xff00) * anInt8974) & 0xff0000);
												int i_2217_ = (((i_2211_ & 0xff) * anInt8975) & 0xff00);
												i_2211_ = (i_2215_ | i_2216_ | i_2217_) >>> 8;
												int i_2218_ = is[i_2196_];
												is[i_2196_] = (((((i_2211_ & 0xff00ff) * anInt8965) + ((i_2218_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2211_ & 0xff00) * anInt8965) + ((i_2218_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
											} else {
												int i_2219_ = (((i_2211_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_2220_ = (((i_2211_ & 0xff00) * anInt8974) & 0xff0000);
												int i_2221_ = (((i_2211_ & 0xff) * anInt8975) & 0xff00);
												is[i_2196_] = (i_2219_ | i_2220_ | i_2221_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_2222_ = aByteArray11394[i_2195_];
										int i_2223_ = (i_2222_ > 0 ? anIntArray11393[i_2222_] : 0);
										int i_2224_ = anInt8944;
										int i_2225_ = i_2223_ + i_2224_;
										int i_2226_ = ((i_2223_ & 0xff00ff) + (i_2224_ & 0xff00ff));
										int i_2227_ = ((i_2226_ & 0x1000100) + (i_2225_ - i_2226_ & 0x10000));
										i_2227_ = (i_2225_ - i_2227_ | i_2227_ - (i_2227_ >>> 8));
										if (i_2223_ == 0 && anInt8965 != 255) {
											i_2223_ = i_2227_;
											i_2227_ = is[i_2196_];
											i_2227_ = (((((i_2223_ & 0xff00ff) * anInt8965) + ((i_2227_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2223_ & 0xff00) * anInt8965) + ((i_2227_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_2196_] = i_2227_;
									} else if (i == 2) {
										int i_2228_ = aByteArray11394[i_2195_];
										if (i_2228_ != 0) {
											int i_2229_ = (anIntArray11393[i_2228_ & 0xff]);
											int i_2230_ = (((i_2229_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_2231_ = (((i_2229_ & 0xff00) * anInt8965) & 0xff0000);
											is[i_2196_++] = (((i_2230_ | i_2231_) >>> 8) + anInt8978);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2120_ == 2) {
									if (i == 1) {
										int i_2232_ = aByteArray11394[i_2195_];
										if (i_2232_ != 0) {
											int i_2233_ = (anIntArray11393[i_2232_ & 0xff]);
											int i_2234_ = is[i_2196_];
											int i_2235_ = i_2233_ + i_2234_;
											int i_2236_ = ((i_2233_ & 0xff00ff) + (i_2234_ & 0xff00ff));
											i_2234_ = ((i_2236_ & 0x1000100) + (i_2235_ - i_2236_ & 0x10000));
											is[i_2196_] = (i_2235_ - i_2234_ | i_2234_ - (i_2234_ >>> 8));
										}
									} else if (i == 0) {
										int i_2237_ = aByteArray11394[i_2195_];
										if (i_2237_ != 0) {
											int i_2238_ = (anIntArray11393[i_2237_ & 0xff]);
											int i_2239_ = (((i_2238_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_2240_ = (((i_2238_ & 0xff00) * anInt8974) & 0xff0000);
											int i_2241_ = ((i_2238_ & 0xff) * anInt8975 & 0xff00);
											i_2238_ = (i_2239_ | i_2240_ | i_2241_) >>> 8;
											int i_2242_ = is[i_2196_];
											int i_2243_ = i_2238_ + i_2242_;
											int i_2244_ = ((i_2238_ & 0xff00ff) + (i_2242_ & 0xff00ff));
											i_2242_ = ((i_2244_ & 0x1000100) + (i_2243_ - i_2244_ & 0x10000));
											is[i_2196_] = (i_2243_ - i_2242_ | i_2242_ - (i_2242_ >>> 8));
										}
									} else if (i == 3) {
										byte i_2245_ = aByteArray11394[i_2195_];
										int i_2246_ = (i_2245_ > 0 ? anIntArray11393[i_2245_] : 0);
										int i_2247_ = anInt8944;
										int i_2248_ = i_2246_ + i_2247_;
										int i_2249_ = ((i_2246_ & 0xff00ff) + (i_2247_ & 0xff00ff));
										int i_2250_ = ((i_2249_ & 0x1000100) + (i_2248_ - i_2249_ & 0x10000));
										i_2250_ = (i_2248_ - i_2250_ | i_2250_ - (i_2250_ >>> 8));
										if (i_2246_ == 0 && anInt8965 != 255) {
											i_2246_ = i_2250_;
											i_2250_ = is[i_2196_];
											i_2250_ = (((((i_2246_ & 0xff00ff) * anInt8965) + ((i_2250_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2246_ & 0xff00) * anInt8965) + ((i_2250_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_2196_] = i_2250_;
									} else if (i == 2) {
										int i_2251_ = aByteArray11394[i_2195_];
										if (i_2251_ != 0) {
											int i_2252_ = (anIntArray11393[i_2251_ & 0xff]);
											int i_2253_ = (((i_2252_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_2254_ = (((i_2252_ & 0xff00) * anInt8965) & 0xff0000);
											i_2252_ = ((i_2253_ | i_2254_) >>> 8) + anInt8978;
											int i_2255_ = is[i_2196_];
											int i_2256_ = i_2252_ + i_2255_;
											int i_2257_ = ((i_2252_ & 0xff00ff) + (i_2255_ & 0xff00ff));
											i_2255_ = ((i_2257_ & 0x1000100) + (i_2256_ - i_2257_ & 0x10000));
											is[i_2196_] = (i_2256_ - i_2255_ | i_2255_ - (i_2255_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_2192_ += anInt8962;
							}
						}
						i_2189_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_2258_ = anInt8957;
					while (i_2258_ < 0) {
						int i_2259_ = anInt8959;
						int i_2260_ = anInt8966;
						int i_2261_ = anInt8967 + anInt8969;
						int i_2262_ = anInt8955;
						if (i_2260_ >= 0 && i_2260_ - (anInt8945 << 12) < 0) {
							if (i_2261_ < 0) {
								int i_2263_ = (anInt8962 - 1 - i_2261_) / anInt8962;
								i_2262_ += i_2263_;
								i_2261_ += anInt8962 * i_2263_;
								i_2259_ += i_2263_;
							}
							int i_2264_;
							if ((i_2264_ = (1 + i_2261_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_2262_)
								i_2262_ = i_2264_;
							for (/**/; i_2262_ < 0; i_2262_++) {
								int i_2265_ = ((i_2261_ >> 12) * anInt8945 + (i_2260_ >> 12));
								int i_2266_ = i_2259_++;
								if (i_2120_ == 0) {
									if (i == 1)
										is[i_2266_] = (anIntArray11393[(aByteArray11394[i_2265_] & 0xff)]);
									else if (i == 0) {
										int i_2267_ = (anIntArray11393[(aByteArray11394[i_2265_] & 0xff)]);
										int i_2268_ = ((i_2267_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_2269_ = ((i_2267_ & 0xff00) * anInt8974 & 0xff0000);
										int i_2270_ = ((i_2267_ & 0xff) * anInt8975 & 0xff00);
										is[i_2266_] = (i_2268_ | i_2269_ | i_2270_) >>> 8;
									} else if (i == 3) {
										int i_2271_ = (anIntArray11393[(aByteArray11394[i_2265_] & 0xff)]);
										int i_2272_ = anInt8944;
										int i_2273_ = i_2271_ + i_2272_;
										int i_2274_ = ((i_2271_ & 0xff00ff) + (i_2272_ & 0xff00ff));
										int i_2275_ = ((i_2274_ & 0x1000100) + (i_2273_ - i_2274_ & 0x10000));
										is[i_2266_] = (i_2273_ - i_2275_ | i_2275_ - (i_2275_ >>> 8));
									} else if (i == 2) {
										int i_2276_ = (anIntArray11393[(aByteArray11394[i_2265_] & 0xff)]);
										int i_2277_ = ((i_2276_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_2278_ = ((i_2276_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_2266_] = ((i_2277_ | i_2278_) >>> 8) + anInt8978;
									} else
										throw new IllegalArgumentException();
								} else if (i_2120_ == 1) {
									if (i == 1) {
										int i_2279_ = aByteArray11394[i_2265_];
										if (i_2279_ != 0)
											is[i_2266_] = (anIntArray11393[i_2279_ & 0xff]);
									} else if (i == 0) {
										int i_2280_ = aByteArray11394[i_2265_];
										if (i_2280_ != 0) {
											int i_2281_ = (anIntArray11393[i_2280_ & 0xff]);
											if ((anInt8944 & 0xffffff) == 16777215) {
												int i_2282_ = anInt8944 >>> 24;
												int i_2283_ = 256 - i_2282_;
												int i_2284_ = is[i_2266_];
												is[i_2266_] = (((((i_2281_ & 0xff00ff) * i_2282_) + ((i_2284_ & 0xff00ff) * i_2283_)) & ~0xff00ff) + ((((i_2281_ & 0xff00) * i_2282_) + ((i_2284_ & 0xff00) * i_2283_)) & 0xff0000)) >> 8;
											} else if (anInt8965 != 255) {
												int i_2285_ = (((i_2281_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_2286_ = (((i_2281_ & 0xff00) * anInt8974) & 0xff0000);
												int i_2287_ = (((i_2281_ & 0xff) * anInt8975) & 0xff00);
												i_2281_ = (i_2285_ | i_2286_ | i_2287_) >>> 8;
												int i_2288_ = is[i_2266_];
												is[i_2266_] = (((((i_2281_ & 0xff00ff) * anInt8965) + ((i_2288_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2281_ & 0xff00) * anInt8965) + ((i_2288_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
											} else {
												int i_2289_ = (((i_2281_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_2290_ = (((i_2281_ & 0xff00) * anInt8974) & 0xff0000);
												int i_2291_ = (((i_2281_ & 0xff) * anInt8975) & 0xff00);
												is[i_2266_] = (i_2289_ | i_2290_ | i_2291_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_2292_ = aByteArray11394[i_2265_];
										int i_2293_ = (i_2292_ > 0 ? anIntArray11393[i_2292_] : 0);
										int i_2294_ = anInt8944;
										int i_2295_ = i_2293_ + i_2294_;
										int i_2296_ = ((i_2293_ & 0xff00ff) + (i_2294_ & 0xff00ff));
										int i_2297_ = ((i_2296_ & 0x1000100) + (i_2295_ - i_2296_ & 0x10000));
										i_2297_ = (i_2295_ - i_2297_ | i_2297_ - (i_2297_ >>> 8));
										if (i_2293_ == 0 && anInt8965 != 255) {
											i_2293_ = i_2297_;
											i_2297_ = is[i_2266_];
											i_2297_ = (((((i_2293_ & 0xff00ff) * anInt8965) + ((i_2297_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2293_ & 0xff00) * anInt8965) + ((i_2297_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_2266_] = i_2297_;
									} else if (i == 2) {
										int i_2298_ = aByteArray11394[i_2265_];
										if (i_2298_ != 0) {
											int i_2299_ = (anIntArray11393[i_2298_ & 0xff]);
											int i_2300_ = (((i_2299_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_2301_ = (((i_2299_ & 0xff00) * anInt8965) & 0xff0000);
											is[i_2266_++] = (((i_2300_ | i_2301_) >>> 8) + anInt8978);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2120_ == 2) {
									if (i == 1) {
										int i_2302_ = aByteArray11394[i_2265_];
										if (i_2302_ != 0) {
											int i_2303_ = (anIntArray11393[i_2302_ & 0xff]);
											int i_2304_ = is[i_2266_];
											int i_2305_ = i_2303_ + i_2304_;
											int i_2306_ = ((i_2303_ & 0xff00ff) + (i_2304_ & 0xff00ff));
											i_2304_ = ((i_2306_ & 0x1000100) + (i_2305_ - i_2306_ & 0x10000));
											is[i_2266_] = (i_2305_ - i_2304_ | i_2304_ - (i_2304_ >>> 8));
										}
									} else if (i == 0) {
										int i_2307_ = aByteArray11394[i_2265_];
										if (i_2307_ != 0) {
											int i_2308_ = (anIntArray11393[i_2307_ & 0xff]);
											int i_2309_ = (((i_2308_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_2310_ = (((i_2308_ & 0xff00) * anInt8974) & 0xff0000);
											int i_2311_ = ((i_2308_ & 0xff) * anInt8975 & 0xff00);
											i_2308_ = (i_2309_ | i_2310_ | i_2311_) >>> 8;
											int i_2312_ = is[i_2266_];
											int i_2313_ = i_2308_ + i_2312_;
											int i_2314_ = ((i_2308_ & 0xff00ff) + (i_2312_ & 0xff00ff));
											i_2312_ = ((i_2314_ & 0x1000100) + (i_2313_ - i_2314_ & 0x10000));
											is[i_2266_] = (i_2313_ - i_2312_ | i_2312_ - (i_2312_ >>> 8));
										}
									} else if (i == 3) {
										byte i_2315_ = aByteArray11394[i_2265_];
										int i_2316_ = (i_2315_ > 0 ? anIntArray11393[i_2315_] : 0);
										int i_2317_ = anInt8944;
										int i_2318_ = i_2316_ + i_2317_;
										int i_2319_ = ((i_2316_ & 0xff00ff) + (i_2317_ & 0xff00ff));
										int i_2320_ = ((i_2319_ & 0x1000100) + (i_2318_ - i_2319_ & 0x10000));
										i_2320_ = (i_2318_ - i_2320_ | i_2320_ - (i_2320_ >>> 8));
										if (i_2316_ == 0 && anInt8965 != 255) {
											i_2316_ = i_2320_;
											i_2320_ = is[i_2266_];
											i_2320_ = (((((i_2316_ & 0xff00ff) * anInt8965) + ((i_2320_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2316_ & 0xff00) * anInt8965) + ((i_2320_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_2266_] = i_2320_;
									} else if (i == 2) {
										int i_2321_ = aByteArray11394[i_2265_];
										if (i_2321_ != 0) {
											int i_2322_ = (anIntArray11393[i_2321_ & 0xff]);
											int i_2323_ = (((i_2322_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_2324_ = (((i_2322_ & 0xff00) * anInt8965) & 0xff0000);
											i_2322_ = ((i_2323_ | i_2324_) >>> 8) + anInt8978;
											int i_2325_ = is[i_2266_];
											int i_2326_ = i_2322_ + i_2325_;
											int i_2327_ = ((i_2322_ & 0xff00ff) + (i_2325_ & 0xff00ff));
											i_2325_ = ((i_2327_ & 0x1000100) + (i_2326_ - i_2327_ & 0x10000));
											is[i_2266_] = (i_2326_ - i_2325_ | i_2325_ - (i_2325_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_2261_ += anInt8962;
							}
						}
						i_2258_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_2328_ = anInt8957;
					while (i_2328_ < 0) {
						int i_2329_ = anInt8959;
						int i_2330_ = anInt8966 + anInt8968;
						int i_2331_ = anInt8967;
						int i_2332_ = anInt8955;
						if (i_2331_ >= 0 && i_2331_ - (anInt8950 << 12) < 0) {
							int i_2333_;
							if ((i_2333_ = i_2330_ - (anInt8945 << 12)) >= 0) {
								i_2333_ = (anInt8960 - i_2333_) / anInt8960;
								i_2332_ += i_2333_;
								i_2330_ += anInt8960 * i_2333_;
								i_2329_ += i_2333_;
							}
							if ((i_2333_ = (i_2330_ - anInt8960) / anInt8960) > i_2332_)
								i_2332_ = i_2333_;
							for (/**/; i_2332_ < 0; i_2332_++) {
								int i_2334_ = ((i_2331_ >> 12) * anInt8945 + (i_2330_ >> 12));
								int i_2335_ = i_2329_++;
								if (i_2120_ == 0) {
									if (i == 1)
										is[i_2335_] = (anIntArray11393[(aByteArray11394[i_2334_] & 0xff)]);
									else if (i == 0) {
										int i_2336_ = (anIntArray11393[(aByteArray11394[i_2334_] & 0xff)]);
										int i_2337_ = ((i_2336_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_2338_ = ((i_2336_ & 0xff00) * anInt8974 & 0xff0000);
										int i_2339_ = ((i_2336_ & 0xff) * anInt8975 & 0xff00);
										is[i_2335_] = (i_2337_ | i_2338_ | i_2339_) >>> 8;
									} else if (i == 3) {
										int i_2340_ = (anIntArray11393[(aByteArray11394[i_2334_] & 0xff)]);
										int i_2341_ = anInt8944;
										int i_2342_ = i_2340_ + i_2341_;
										int i_2343_ = ((i_2340_ & 0xff00ff) + (i_2341_ & 0xff00ff));
										int i_2344_ = ((i_2343_ & 0x1000100) + (i_2342_ - i_2343_ & 0x10000));
										is[i_2335_] = (i_2342_ - i_2344_ | i_2344_ - (i_2344_ >>> 8));
									} else if (i == 2) {
										int i_2345_ = (anIntArray11393[(aByteArray11394[i_2334_] & 0xff)]);
										int i_2346_ = ((i_2345_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_2347_ = ((i_2345_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_2335_] = ((i_2346_ | i_2347_) >>> 8) + anInt8978;
									} else
										throw new IllegalArgumentException();
								} else if (i_2120_ == 1) {
									if (i == 1) {
										int i_2348_ = aByteArray11394[i_2334_];
										if (i_2348_ != 0)
											is[i_2335_] = (anIntArray11393[i_2348_ & 0xff]);
									} else if (i == 0) {
										int i_2349_ = aByteArray11394[i_2334_];
										if (i_2349_ != 0) {
											int i_2350_ = (anIntArray11393[i_2349_ & 0xff]);
											if ((anInt8944 & 0xffffff) == 16777215) {
												int i_2351_ = anInt8944 >>> 24;
												int i_2352_ = 256 - i_2351_;
												int i_2353_ = is[i_2335_];
												is[i_2335_] = (((((i_2350_ & 0xff00ff) * i_2351_) + ((i_2353_ & 0xff00ff) * i_2352_)) & ~0xff00ff) + ((((i_2350_ & 0xff00) * i_2351_) + ((i_2353_ & 0xff00) * i_2352_)) & 0xff0000)) >> 8;
											} else if (anInt8965 != 255) {
												int i_2354_ = (((i_2350_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_2355_ = (((i_2350_ & 0xff00) * anInt8974) & 0xff0000);
												int i_2356_ = (((i_2350_ & 0xff) * anInt8975) & 0xff00);
												i_2350_ = (i_2354_ | i_2355_ | i_2356_) >>> 8;
												int i_2357_ = is[i_2335_];
												is[i_2335_] = (((((i_2350_ & 0xff00ff) * anInt8965) + ((i_2357_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2350_ & 0xff00) * anInt8965) + ((i_2357_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
											} else {
												int i_2358_ = (((i_2350_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_2359_ = (((i_2350_ & 0xff00) * anInt8974) & 0xff0000);
												int i_2360_ = (((i_2350_ & 0xff) * anInt8975) & 0xff00);
												is[i_2335_] = (i_2358_ | i_2359_ | i_2360_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_2361_ = aByteArray11394[i_2334_];
										int i_2362_ = (i_2361_ > 0 ? anIntArray11393[i_2361_] : 0);
										int i_2363_ = anInt8944;
										int i_2364_ = i_2362_ + i_2363_;
										int i_2365_ = ((i_2362_ & 0xff00ff) + (i_2363_ & 0xff00ff));
										int i_2366_ = ((i_2365_ & 0x1000100) + (i_2364_ - i_2365_ & 0x10000));
										i_2366_ = (i_2364_ - i_2366_ | i_2366_ - (i_2366_ >>> 8));
										if (i_2362_ == 0 && anInt8965 != 255) {
											i_2362_ = i_2366_;
											i_2366_ = is[i_2335_];
											i_2366_ = (((((i_2362_ & 0xff00ff) * anInt8965) + ((i_2366_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2362_ & 0xff00) * anInt8965) + ((i_2366_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_2335_] = i_2366_;
									} else if (i == 2) {
										int i_2367_ = aByteArray11394[i_2334_];
										if (i_2367_ != 0) {
											int i_2368_ = (anIntArray11393[i_2367_ & 0xff]);
											int i_2369_ = (((i_2368_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_2370_ = (((i_2368_ & 0xff00) * anInt8965) & 0xff0000);
											is[i_2335_++] = (((i_2369_ | i_2370_) >>> 8) + anInt8978);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2120_ == 2) {
									if (i == 1) {
										int i_2371_ = aByteArray11394[i_2334_];
										if (i_2371_ != 0) {
											int i_2372_ = (anIntArray11393[i_2371_ & 0xff]);
											int i_2373_ = is[i_2335_];
											int i_2374_ = i_2372_ + i_2373_;
											int i_2375_ = ((i_2372_ & 0xff00ff) + (i_2373_ & 0xff00ff));
											i_2373_ = ((i_2375_ & 0x1000100) + (i_2374_ - i_2375_ & 0x10000));
											is[i_2335_] = (i_2374_ - i_2373_ | i_2373_ - (i_2373_ >>> 8));
										}
									} else if (i == 0) {
										int i_2376_ = aByteArray11394[i_2334_];
										if (i_2376_ != 0) {
											int i_2377_ = (anIntArray11393[i_2376_ & 0xff]);
											int i_2378_ = (((i_2377_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_2379_ = (((i_2377_ & 0xff00) * anInt8974) & 0xff0000);
											int i_2380_ = ((i_2377_ & 0xff) * anInt8975 & 0xff00);
											i_2377_ = (i_2378_ | i_2379_ | i_2380_) >>> 8;
											int i_2381_ = is[i_2335_];
											int i_2382_ = i_2377_ + i_2381_;
											int i_2383_ = ((i_2377_ & 0xff00ff) + (i_2381_ & 0xff00ff));
											i_2381_ = ((i_2383_ & 0x1000100) + (i_2382_ - i_2383_ & 0x10000));
											is[i_2335_] = (i_2382_ - i_2381_ | i_2381_ - (i_2381_ >>> 8));
										}
									} else if (i == 3) {
										byte i_2384_ = aByteArray11394[i_2334_];
										int i_2385_ = (i_2384_ > 0 ? anIntArray11393[i_2384_] : 0);
										int i_2386_ = anInt8944;
										int i_2387_ = i_2385_ + i_2386_;
										int i_2388_ = ((i_2385_ & 0xff00ff) + (i_2386_ & 0xff00ff));
										int i_2389_ = ((i_2388_ & 0x1000100) + (i_2387_ - i_2388_ & 0x10000));
										i_2389_ = (i_2387_ - i_2389_ | i_2389_ - (i_2389_ >>> 8));
										if (i_2385_ == 0 && anInt8965 != 255) {
											i_2385_ = i_2389_;
											i_2389_ = is[i_2335_];
											i_2389_ = (((((i_2385_ & 0xff00ff) * anInt8965) + ((i_2389_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2385_ & 0xff00) * anInt8965) + ((i_2389_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_2335_] = i_2389_;
									} else if (i == 2) {
										int i_2390_ = aByteArray11394[i_2334_];
										if (i_2390_ != 0) {
											int i_2391_ = (anIntArray11393[i_2390_ & 0xff]);
											int i_2392_ = (((i_2391_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_2393_ = (((i_2391_ & 0xff00) * anInt8965) & 0xff0000);
											i_2391_ = ((i_2392_ | i_2393_) >>> 8) + anInt8978;
											int i_2394_ = is[i_2335_];
											int i_2395_ = i_2391_ + i_2394_;
											int i_2396_ = ((i_2391_ & 0xff00ff) + (i_2394_ & 0xff00ff));
											i_2394_ = ((i_2396_ & 0x1000100) + (i_2395_ - i_2396_ & 0x10000));
											is[i_2335_] = (i_2395_ - i_2394_ | i_2394_ - (i_2394_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_2330_ += anInt8960;
							}
						}
						i_2328_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_2397_ = anInt8957;
					while (i_2397_ < 0) {
						int i_2398_ = anInt8959;
						int i_2399_ = anInt8966 + anInt8968;
						int i_2400_ = anInt8967 + anInt8969;
						int i_2401_ = anInt8955;
						int i_2402_;
						if ((i_2402_ = i_2399_ - (anInt8945 << 12)) >= 0) {
							i_2402_ = (anInt8960 - i_2402_) / anInt8960;
							i_2401_ += i_2402_;
							i_2399_ += anInt8960 * i_2402_;
							i_2400_ += anInt8962 * i_2402_;
							i_2398_ += i_2402_;
						}
						if ((i_2402_ = (i_2399_ - anInt8960) / anInt8960) > i_2401_)
							i_2401_ = i_2402_;
						if ((i_2402_ = i_2400_ - (anInt8950 << 12)) >= 0) {
							i_2402_ = (anInt8962 - i_2402_) / anInt8962;
							i_2401_ += i_2402_;
							i_2399_ += anInt8960 * i_2402_;
							i_2400_ += anInt8962 * i_2402_;
							i_2398_ += i_2402_;
						}
						if ((i_2402_ = (i_2400_ - anInt8962) / anInt8962) > i_2401_)
							i_2401_ = i_2402_;
						for (/**/; i_2401_ < 0; i_2401_++) {
							int i_2403_ = ((i_2400_ >> 12) * anInt8945 + (i_2399_ >> 12));
							int i_2404_ = i_2398_++;
							if (i_2120_ == 0) {
								if (i == 1)
									is[i_2404_] = (anIntArray11393[aByteArray11394[i_2403_] & 0xff]);
								else if (i == 0) {
									int i_2405_ = (anIntArray11393[aByteArray11394[i_2403_] & 0xff]);
									int i_2406_ = ((i_2405_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_2407_ = ((i_2405_ & 0xff00) * anInt8974 & 0xff0000);
									int i_2408_ = ((i_2405_ & 0xff) * anInt8975 & 0xff00);
									is[i_2404_] = (i_2406_ | i_2407_ | i_2408_) >>> 8;
								} else if (i == 3) {
									int i_2409_ = (anIntArray11393[aByteArray11394[i_2403_] & 0xff]);
									int i_2410_ = anInt8944;
									int i_2411_ = i_2409_ + i_2410_;
									int i_2412_ = ((i_2409_ & 0xff00ff) + (i_2410_ & 0xff00ff));
									int i_2413_ = ((i_2412_ & 0x1000100) + (i_2411_ - i_2412_ & 0x10000));
									is[i_2404_] = (i_2411_ - i_2413_ | i_2413_ - (i_2413_ >>> 8));
								} else if (i == 2) {
									int i_2414_ = (anIntArray11393[aByteArray11394[i_2403_] & 0xff]);
									int i_2415_ = ((i_2414_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_2416_ = ((i_2414_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_2404_] = (((i_2415_ | i_2416_) >>> 8) + anInt8978);
								} else
									throw new IllegalArgumentException();
							} else if (i_2120_ == 1) {
								if (i == 1) {
									int i_2417_ = aByteArray11394[i_2403_];
									if (i_2417_ != 0)
										is[i_2404_] = anIntArray11393[i_2417_ & 0xff];
								} else if (i == 0) {
									int i_2418_ = aByteArray11394[i_2403_];
									if (i_2418_ != 0) {
										int i_2419_ = anIntArray11393[i_2418_ & 0xff];
										if ((anInt8944 & 0xffffff) == 16777215) {
											int i_2420_ = anInt8944 >>> 24;
											int i_2421_ = 256 - i_2420_;
											int i_2422_ = is[i_2404_];
											is[i_2404_] = (((((i_2419_ & 0xff00ff) * i_2420_) + ((i_2422_ & 0xff00ff) * i_2421_)) & ~0xff00ff) + ((((i_2419_ & 0xff00) * i_2420_) + ((i_2422_ & 0xff00) * i_2421_)) & 0xff0000)) >> 8;
										} else if (anInt8965 != 255) {
											int i_2423_ = (((i_2419_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_2424_ = (((i_2419_ & 0xff00) * anInt8974) & 0xff0000);
											int i_2425_ = ((i_2419_ & 0xff) * anInt8975 & 0xff00);
											i_2419_ = (i_2423_ | i_2424_ | i_2425_) >>> 8;
											int i_2426_ = is[i_2404_];
											is[i_2404_] = (((((i_2419_ & 0xff00ff) * anInt8965) + ((i_2426_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2419_ & 0xff00) * anInt8965) + ((i_2426_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										} else {
											int i_2427_ = (((i_2419_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_2428_ = (((i_2419_ & 0xff00) * anInt8974) & 0xff0000);
											int i_2429_ = ((i_2419_ & 0xff) * anInt8975 & 0xff00);
											is[i_2404_] = (i_2427_ | i_2428_ | i_2429_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_2430_ = aByteArray11394[i_2403_];
									int i_2431_ = (i_2430_ > 0 ? anIntArray11393[i_2430_] : 0);
									int i_2432_ = anInt8944;
									int i_2433_ = i_2431_ + i_2432_;
									int i_2434_ = ((i_2431_ & 0xff00ff) + (i_2432_ & 0xff00ff));
									int i_2435_ = ((i_2434_ & 0x1000100) + (i_2433_ - i_2434_ & 0x10000));
									i_2435_ = (i_2433_ - i_2435_ | i_2435_ - (i_2435_ >>> 8));
									if (i_2431_ == 0 && anInt8965 != 255) {
										i_2431_ = i_2435_;
										i_2435_ = is[i_2404_];
										i_2435_ = (((((i_2431_ & 0xff00ff) * anInt8965) + ((i_2435_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2431_ & 0xff00) * anInt8965) + ((i_2435_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_2404_] = i_2435_;
								} else if (i == 2) {
									int i_2436_ = aByteArray11394[i_2403_];
									if (i_2436_ != 0) {
										int i_2437_ = anIntArray11393[i_2436_ & 0xff];
										int i_2438_ = ((i_2437_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_2439_ = ((i_2437_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_2404_++] = ((i_2438_ | i_2439_) >>> 8) + anInt8978;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2120_ == 2) {
								if (i == 1) {
									int i_2440_ = aByteArray11394[i_2403_];
									if (i_2440_ != 0) {
										int i_2441_ = anIntArray11393[i_2440_ & 0xff];
										int i_2442_ = is[i_2404_];
										int i_2443_ = i_2441_ + i_2442_;
										int i_2444_ = ((i_2441_ & 0xff00ff) + (i_2442_ & 0xff00ff));
										i_2442_ = ((i_2444_ & 0x1000100) + (i_2443_ - i_2444_ & 0x10000));
										is[i_2404_] = (i_2443_ - i_2442_ | i_2442_ - (i_2442_ >>> 8));
									}
								} else if (i == 0) {
									int i_2445_ = aByteArray11394[i_2403_];
									if (i_2445_ != 0) {
										int i_2446_ = anIntArray11393[i_2445_ & 0xff];
										int i_2447_ = ((i_2446_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_2448_ = ((i_2446_ & 0xff00) * anInt8974 & 0xff0000);
										int i_2449_ = ((i_2446_ & 0xff) * anInt8975 & 0xff00);
										i_2446_ = (i_2447_ | i_2448_ | i_2449_) >>> 8;
										int i_2450_ = is[i_2404_];
										int i_2451_ = i_2446_ + i_2450_;
										int i_2452_ = ((i_2446_ & 0xff00ff) + (i_2450_ & 0xff00ff));
										i_2450_ = ((i_2452_ & 0x1000100) + (i_2451_ - i_2452_ & 0x10000));
										is[i_2404_] = (i_2451_ - i_2450_ | i_2450_ - (i_2450_ >>> 8));
									}
								} else if (i == 3) {
									byte i_2453_ = aByteArray11394[i_2403_];
									int i_2454_ = (i_2453_ > 0 ? anIntArray11393[i_2453_] : 0);
									int i_2455_ = anInt8944;
									int i_2456_ = i_2454_ + i_2455_;
									int i_2457_ = ((i_2454_ & 0xff00ff) + (i_2455_ & 0xff00ff));
									int i_2458_ = ((i_2457_ & 0x1000100) + (i_2456_ - i_2457_ & 0x10000));
									i_2458_ = (i_2456_ - i_2458_ | i_2458_ - (i_2458_ >>> 8));
									if (i_2454_ == 0 && anInt8965 != 255) {
										i_2454_ = i_2458_;
										i_2458_ = is[i_2404_];
										i_2458_ = (((((i_2454_ & 0xff00ff) * anInt8965) + ((i_2458_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2454_ & 0xff00) * anInt8965) + ((i_2458_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_2404_] = i_2458_;
								} else if (i == 2) {
									int i_2459_ = aByteArray11394[i_2403_];
									if (i_2459_ != 0) {
										int i_2460_ = anIntArray11393[i_2459_ & 0xff];
										int i_2461_ = ((i_2460_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_2462_ = ((i_2460_ & 0xff00) * anInt8965 & 0xff0000);
										i_2460_ = (((i_2461_ | i_2462_) >>> 8) + anInt8978);
										int i_2463_ = is[i_2404_];
										int i_2464_ = i_2460_ + i_2463_;
										int i_2465_ = ((i_2460_ & 0xff00ff) + (i_2463_ & 0xff00ff));
										i_2463_ = ((i_2465_ & 0x1000100) + (i_2464_ - i_2465_ & 0x10000));
										is[i_2404_] = (i_2464_ - i_2463_ | i_2463_ - (i_2463_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_2399_ += anInt8960;
							i_2400_ += anInt8962;
						}
						i_2397_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_2466_ = anInt8957;
					while (i_2466_ < 0) {
						int i_2467_ = anInt8959;
						int i_2468_ = anInt8966 + anInt8968;
						int i_2469_ = anInt8967 + anInt8969;
						int i_2470_ = anInt8955;
						int i_2471_;
						if ((i_2471_ = i_2468_ - (anInt8945 << 12)) >= 0) {
							i_2471_ = (anInt8960 - i_2471_) / anInt8960;
							i_2470_ += i_2471_;
							i_2468_ += anInt8960 * i_2471_;
							i_2469_ += anInt8962 * i_2471_;
							i_2467_ += i_2471_;
						}
						if ((i_2471_ = (i_2468_ - anInt8960) / anInt8960) > i_2470_)
							i_2470_ = i_2471_;
						if (i_2469_ < 0) {
							i_2471_ = (anInt8962 - 1 - i_2469_) / anInt8962;
							i_2470_ += i_2471_;
							i_2468_ += anInt8960 * i_2471_;
							i_2469_ += anInt8962 * i_2471_;
							i_2467_ += i_2471_;
						}
						if ((i_2471_ = (1 + i_2469_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_2470_)
							i_2470_ = i_2471_;
						for (/**/; i_2470_ < 0; i_2470_++) {
							int i_2472_ = ((i_2469_ >> 12) * anInt8945 + (i_2468_ >> 12));
							int i_2473_ = i_2467_++;
							if (i_2120_ == 0) {
								if (i == 1)
									is[i_2473_] = (anIntArray11393[aByteArray11394[i_2472_] & 0xff]);
								else if (i == 0) {
									int i_2474_ = (anIntArray11393[aByteArray11394[i_2472_] & 0xff]);
									int i_2475_ = ((i_2474_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_2476_ = ((i_2474_ & 0xff00) * anInt8974 & 0xff0000);
									int i_2477_ = ((i_2474_ & 0xff) * anInt8975 & 0xff00);
									is[i_2473_] = (i_2475_ | i_2476_ | i_2477_) >>> 8;
								} else if (i == 3) {
									int i_2478_ = (anIntArray11393[aByteArray11394[i_2472_] & 0xff]);
									int i_2479_ = anInt8944;
									int i_2480_ = i_2478_ + i_2479_;
									int i_2481_ = ((i_2478_ & 0xff00ff) + (i_2479_ & 0xff00ff));
									int i_2482_ = ((i_2481_ & 0x1000100) + (i_2480_ - i_2481_ & 0x10000));
									is[i_2473_] = (i_2480_ - i_2482_ | i_2482_ - (i_2482_ >>> 8));
								} else if (i == 2) {
									int i_2483_ = (anIntArray11393[aByteArray11394[i_2472_] & 0xff]);
									int i_2484_ = ((i_2483_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_2485_ = ((i_2483_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_2473_] = (((i_2484_ | i_2485_) >>> 8) + anInt8978);
								} else
									throw new IllegalArgumentException();
							} else if (i_2120_ == 1) {
								if (i == 1) {
									int i_2486_ = aByteArray11394[i_2472_];
									if (i_2486_ != 0)
										is[i_2473_] = anIntArray11393[i_2486_ & 0xff];
								} else if (i == 0) {
									int i_2487_ = aByteArray11394[i_2472_];
									if (i_2487_ != 0) {
										int i_2488_ = anIntArray11393[i_2487_ & 0xff];
										if ((anInt8944 & 0xffffff) == 16777215) {
											int i_2489_ = anInt8944 >>> 24;
											int i_2490_ = 256 - i_2489_;
											int i_2491_ = is[i_2473_];
											is[i_2473_] = (((((i_2488_ & 0xff00ff) * i_2489_) + ((i_2491_ & 0xff00ff) * i_2490_)) & ~0xff00ff) + ((((i_2488_ & 0xff00) * i_2489_) + ((i_2491_ & 0xff00) * i_2490_)) & 0xff0000)) >> 8;
										} else if (anInt8965 != 255) {
											int i_2492_ = (((i_2488_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_2493_ = (((i_2488_ & 0xff00) * anInt8974) & 0xff0000);
											int i_2494_ = ((i_2488_ & 0xff) * anInt8975 & 0xff00);
											i_2488_ = (i_2492_ | i_2493_ | i_2494_) >>> 8;
											int i_2495_ = is[i_2473_];
											is[i_2473_] = (((((i_2488_ & 0xff00ff) * anInt8965) + ((i_2495_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2488_ & 0xff00) * anInt8965) + ((i_2495_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										} else {
											int i_2496_ = (((i_2488_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_2497_ = (((i_2488_ & 0xff00) * anInt8974) & 0xff0000);
											int i_2498_ = ((i_2488_ & 0xff) * anInt8975 & 0xff00);
											is[i_2473_] = (i_2496_ | i_2497_ | i_2498_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_2499_ = aByteArray11394[i_2472_];
									int i_2500_ = (i_2499_ > 0 ? anIntArray11393[i_2499_] : 0);
									int i_2501_ = anInt8944;
									int i_2502_ = i_2500_ + i_2501_;
									int i_2503_ = ((i_2500_ & 0xff00ff) + (i_2501_ & 0xff00ff));
									int i_2504_ = ((i_2503_ & 0x1000100) + (i_2502_ - i_2503_ & 0x10000));
									i_2504_ = (i_2502_ - i_2504_ | i_2504_ - (i_2504_ >>> 8));
									if (i_2500_ == 0 && anInt8965 != 255) {
										i_2500_ = i_2504_;
										i_2504_ = is[i_2473_];
										i_2504_ = (((((i_2500_ & 0xff00ff) * anInt8965) + ((i_2504_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2500_ & 0xff00) * anInt8965) + ((i_2504_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_2473_] = i_2504_;
								} else if (i == 2) {
									int i_2505_ = aByteArray11394[i_2472_];
									if (i_2505_ != 0) {
										int i_2506_ = anIntArray11393[i_2505_ & 0xff];
										int i_2507_ = ((i_2506_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_2508_ = ((i_2506_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_2473_++] = ((i_2507_ | i_2508_) >>> 8) + anInt8978;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2120_ == 2) {
								if (i == 1) {
									int i_2509_ = aByteArray11394[i_2472_];
									if (i_2509_ != 0) {
										int i_2510_ = anIntArray11393[i_2509_ & 0xff];
										int i_2511_ = is[i_2473_];
										int i_2512_ = i_2510_ + i_2511_;
										int i_2513_ = ((i_2510_ & 0xff00ff) + (i_2511_ & 0xff00ff));
										i_2511_ = ((i_2513_ & 0x1000100) + (i_2512_ - i_2513_ & 0x10000));
										is[i_2473_] = (i_2512_ - i_2511_ | i_2511_ - (i_2511_ >>> 8));
									}
								} else if (i == 0) {
									int i_2514_ = aByteArray11394[i_2472_];
									if (i_2514_ != 0) {
										int i_2515_ = anIntArray11393[i_2514_ & 0xff];
										int i_2516_ = ((i_2515_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_2517_ = ((i_2515_ & 0xff00) * anInt8974 & 0xff0000);
										int i_2518_ = ((i_2515_ & 0xff) * anInt8975 & 0xff00);
										i_2515_ = (i_2516_ | i_2517_ | i_2518_) >>> 8;
										int i_2519_ = is[i_2473_];
										int i_2520_ = i_2515_ + i_2519_;
										int i_2521_ = ((i_2515_ & 0xff00ff) + (i_2519_ & 0xff00ff));
										i_2519_ = ((i_2521_ & 0x1000100) + (i_2520_ - i_2521_ & 0x10000));
										is[i_2473_] = (i_2520_ - i_2519_ | i_2519_ - (i_2519_ >>> 8));
									}
								} else if (i == 3) {
									byte i_2522_ = aByteArray11394[i_2472_];
									int i_2523_ = (i_2522_ > 0 ? anIntArray11393[i_2522_] : 0);
									int i_2524_ = anInt8944;
									int i_2525_ = i_2523_ + i_2524_;
									int i_2526_ = ((i_2523_ & 0xff00ff) + (i_2524_ & 0xff00ff));
									int i_2527_ = ((i_2526_ & 0x1000100) + (i_2525_ - i_2526_ & 0x10000));
									i_2527_ = (i_2525_ - i_2527_ | i_2527_ - (i_2527_ >>> 8));
									if (i_2523_ == 0 && anInt8965 != 255) {
										i_2523_ = i_2527_;
										i_2527_ = is[i_2473_];
										i_2527_ = (((((i_2523_ & 0xff00ff) * anInt8965) + ((i_2527_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2523_ & 0xff00) * anInt8965) + ((i_2527_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_2473_] = i_2527_;
								} else if (i == 2) {
									int i_2528_ = aByteArray11394[i_2472_];
									if (i_2528_ != 0) {
										int i_2529_ = anIntArray11393[i_2528_ & 0xff];
										int i_2530_ = ((i_2529_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_2531_ = ((i_2529_ & 0xff00) * anInt8965 & 0xff0000);
										i_2529_ = (((i_2530_ | i_2531_) >>> 8) + anInt8978);
										int i_2532_ = is[i_2473_];
										int i_2533_ = i_2529_ + i_2532_;
										int i_2534_ = ((i_2529_ & 0xff00ff) + (i_2532_ & 0xff00ff));
										i_2532_ = ((i_2534_ & 0x1000100) + (i_2533_ - i_2534_ & 0x10000));
										is[i_2473_] = (i_2533_ - i_2532_ | i_2532_ - (i_2532_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_2468_ += anInt8960;
							i_2469_ += anInt8962;
						}
						i_2466_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_2535_ = anInt8957;
				while (i_2535_ < 0) {
					int i_2536_ = anInt8959;
					int i_2537_ = anInt8966 + anInt8968;
					int i_2538_ = anInt8967;
					int i_2539_ = anInt8955;
					if (i_2538_ >= 0 && i_2538_ - (anInt8950 << 12) < 0) {
						if (i_2537_ < 0) {
							int i_2540_ = (anInt8960 - 1 - i_2537_) / anInt8960;
							i_2539_ += i_2540_;
							i_2537_ += anInt8960 * i_2540_;
							i_2536_ += i_2540_;
						}
						int i_2541_;
						if ((i_2541_ = (1 + i_2537_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_2539_)
							i_2539_ = i_2541_;
						for (/**/; i_2539_ < 0; i_2539_++) {
							int i_2542_ = ((i_2538_ >> 12) * anInt8945 + (i_2537_ >> 12));
							int i_2543_ = i_2536_++;
							if (i_2120_ == 0) {
								if (i == 1)
									is[i_2543_] = (anIntArray11393[aByteArray11394[i_2542_] & 0xff]);
								else if (i == 0) {
									int i_2544_ = (anIntArray11393[aByteArray11394[i_2542_] & 0xff]);
									int i_2545_ = ((i_2544_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_2546_ = ((i_2544_ & 0xff00) * anInt8974 & 0xff0000);
									int i_2547_ = ((i_2544_ & 0xff) * anInt8975 & 0xff00);
									is[i_2543_] = (i_2545_ | i_2546_ | i_2547_) >>> 8;
								} else if (i == 3) {
									int i_2548_ = (anIntArray11393[aByteArray11394[i_2542_] & 0xff]);
									int i_2549_ = anInt8944;
									int i_2550_ = i_2548_ + i_2549_;
									int i_2551_ = ((i_2548_ & 0xff00ff) + (i_2549_ & 0xff00ff));
									int i_2552_ = ((i_2551_ & 0x1000100) + (i_2550_ - i_2551_ & 0x10000));
									is[i_2543_] = (i_2550_ - i_2552_ | i_2552_ - (i_2552_ >>> 8));
								} else if (i == 2) {
									int i_2553_ = (anIntArray11393[aByteArray11394[i_2542_] & 0xff]);
									int i_2554_ = ((i_2553_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_2555_ = ((i_2553_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_2543_] = (((i_2554_ | i_2555_) >>> 8) + anInt8978);
								} else
									throw new IllegalArgumentException();
							} else if (i_2120_ == 1) {
								if (i == 1) {
									int i_2556_ = aByteArray11394[i_2542_];
									if (i_2556_ != 0)
										is[i_2543_] = anIntArray11393[i_2556_ & 0xff];
								} else if (i == 0) {
									int i_2557_ = aByteArray11394[i_2542_];
									if (i_2557_ != 0) {
										int i_2558_ = anIntArray11393[i_2557_ & 0xff];
										if ((anInt8944 & 0xffffff) == 16777215) {
											int i_2559_ = anInt8944 >>> 24;
											int i_2560_ = 256 - i_2559_;
											int i_2561_ = is[i_2543_];
											is[i_2543_] = (((((i_2558_ & 0xff00ff) * i_2559_) + ((i_2561_ & 0xff00ff) * i_2560_)) & ~0xff00ff) + ((((i_2558_ & 0xff00) * i_2559_) + ((i_2561_ & 0xff00) * i_2560_)) & 0xff0000)) >> 8;
										} else if (anInt8965 != 255) {
											int i_2562_ = (((i_2558_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_2563_ = (((i_2558_ & 0xff00) * anInt8974) & 0xff0000);
											int i_2564_ = ((i_2558_ & 0xff) * anInt8975 & 0xff00);
											i_2558_ = (i_2562_ | i_2563_ | i_2564_) >>> 8;
											int i_2565_ = is[i_2543_];
											is[i_2543_] = (((((i_2558_ & 0xff00ff) * anInt8965) + ((i_2565_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2558_ & 0xff00) * anInt8965) + ((i_2565_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										} else {
											int i_2566_ = (((i_2558_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_2567_ = (((i_2558_ & 0xff00) * anInt8974) & 0xff0000);
											int i_2568_ = ((i_2558_ & 0xff) * anInt8975 & 0xff00);
											is[i_2543_] = (i_2566_ | i_2567_ | i_2568_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_2569_ = aByteArray11394[i_2542_];
									int i_2570_ = (i_2569_ > 0 ? anIntArray11393[i_2569_] : 0);
									int i_2571_ = anInt8944;
									int i_2572_ = i_2570_ + i_2571_;
									int i_2573_ = ((i_2570_ & 0xff00ff) + (i_2571_ & 0xff00ff));
									int i_2574_ = ((i_2573_ & 0x1000100) + (i_2572_ - i_2573_ & 0x10000));
									i_2574_ = (i_2572_ - i_2574_ | i_2574_ - (i_2574_ >>> 8));
									if (i_2570_ == 0 && anInt8965 != 255) {
										i_2570_ = i_2574_;
										i_2574_ = is[i_2543_];
										i_2574_ = (((((i_2570_ & 0xff00ff) * anInt8965) + ((i_2574_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2570_ & 0xff00) * anInt8965) + ((i_2574_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_2543_] = i_2574_;
								} else if (i == 2) {
									int i_2575_ = aByteArray11394[i_2542_];
									if (i_2575_ != 0) {
										int i_2576_ = anIntArray11393[i_2575_ & 0xff];
										int i_2577_ = ((i_2576_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_2578_ = ((i_2576_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_2543_++] = ((i_2577_ | i_2578_) >>> 8) + anInt8978;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2120_ == 2) {
								if (i == 1) {
									int i_2579_ = aByteArray11394[i_2542_];
									if (i_2579_ != 0) {
										int i_2580_ = anIntArray11393[i_2579_ & 0xff];
										int i_2581_ = is[i_2543_];
										int i_2582_ = i_2580_ + i_2581_;
										int i_2583_ = ((i_2580_ & 0xff00ff) + (i_2581_ & 0xff00ff));
										i_2581_ = ((i_2583_ & 0x1000100) + (i_2582_ - i_2583_ & 0x10000));
										is[i_2543_] = (i_2582_ - i_2581_ | i_2581_ - (i_2581_ >>> 8));
									}
								} else if (i == 0) {
									int i_2584_ = aByteArray11394[i_2542_];
									if (i_2584_ != 0) {
										int i_2585_ = anIntArray11393[i_2584_ & 0xff];
										int i_2586_ = ((i_2585_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_2587_ = ((i_2585_ & 0xff00) * anInt8974 & 0xff0000);
										int i_2588_ = ((i_2585_ & 0xff) * anInt8975 & 0xff00);
										i_2585_ = (i_2586_ | i_2587_ | i_2588_) >>> 8;
										int i_2589_ = is[i_2543_];
										int i_2590_ = i_2585_ + i_2589_;
										int i_2591_ = ((i_2585_ & 0xff00ff) + (i_2589_ & 0xff00ff));
										i_2589_ = ((i_2591_ & 0x1000100) + (i_2590_ - i_2591_ & 0x10000));
										is[i_2543_] = (i_2590_ - i_2589_ | i_2589_ - (i_2589_ >>> 8));
									}
								} else if (i == 3) {
									byte i_2592_ = aByteArray11394[i_2542_];
									int i_2593_ = (i_2592_ > 0 ? anIntArray11393[i_2592_] : 0);
									int i_2594_ = anInt8944;
									int i_2595_ = i_2593_ + i_2594_;
									int i_2596_ = ((i_2593_ & 0xff00ff) + (i_2594_ & 0xff00ff));
									int i_2597_ = ((i_2596_ & 0x1000100) + (i_2595_ - i_2596_ & 0x10000));
									i_2597_ = (i_2595_ - i_2597_ | i_2597_ - (i_2597_ >>> 8));
									if (i_2593_ == 0 && anInt8965 != 255) {
										i_2593_ = i_2597_;
										i_2597_ = is[i_2543_];
										i_2597_ = (((((i_2593_ & 0xff00ff) * anInt8965) + ((i_2597_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2593_ & 0xff00) * anInt8965) + ((i_2597_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_2543_] = i_2597_;
								} else if (i == 2) {
									int i_2598_ = aByteArray11394[i_2542_];
									if (i_2598_ != 0) {
										int i_2599_ = anIntArray11393[i_2598_ & 0xff];
										int i_2600_ = ((i_2599_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_2601_ = ((i_2599_ & 0xff00) * anInt8965 & 0xff0000);
										i_2599_ = (((i_2600_ | i_2601_) >>> 8) + anInt8978);
										int i_2602_ = is[i_2543_];
										int i_2603_ = i_2599_ + i_2602_;
										int i_2604_ = ((i_2599_ & 0xff00ff) + (i_2602_ & 0xff00ff));
										i_2602_ = ((i_2604_ & 0x1000100) + (i_2603_ - i_2604_ & 0x10000));
										is[i_2543_] = (i_2603_ - i_2602_ | i_2602_ - (i_2602_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_2537_ += anInt8960;
						}
					}
					i_2535_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				for (int i_2605_ = anInt8957; i_2605_ < 0; i_2605_++) {
					int i_2606_ = anInt8959;
					int i_2607_ = anInt8966 + anInt8968;
					int i_2608_ = anInt8967 + anInt8969;
					int i_2609_ = anInt8955;
					if (i_2607_ < 0) {
						int i_2610_ = (anInt8960 - 1 - i_2607_) / anInt8960;
						i_2609_ += i_2610_;
						i_2607_ += anInt8960 * i_2610_;
						i_2608_ += anInt8962 * i_2610_;
						i_2606_ += i_2610_;
					}
					int i_2611_;
					if ((i_2611_ = (1 + i_2607_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_2609_)
						i_2609_ = i_2611_;
					if ((i_2611_ = i_2608_ - (anInt8950 << 12)) >= 0) {
						i_2611_ = (anInt8962 - i_2611_) / anInt8962;
						i_2609_ += i_2611_;
						i_2607_ += anInt8960 * i_2611_;
						i_2608_ += anInt8962 * i_2611_;
						i_2606_ += i_2611_;
					}
					if ((i_2611_ = (i_2608_ - anInt8962) / anInt8962) > i_2609_)
						i_2609_ = i_2611_;
					for (/**/; i_2609_ < 0; i_2609_++) {
						int i_2612_ = (i_2608_ >> 12) * anInt8945 + (i_2607_ >> 12);
						int i_2613_ = i_2606_++;
						if (i_2120_ == 0) {
							if (i == 1)
								is[i_2613_] = (anIntArray11393[aByteArray11394[i_2612_] & 0xff]);
							else if (i == 0) {
								int i_2614_ = (anIntArray11393[aByteArray11394[i_2612_] & 0xff]);
								int i_2615_ = ((i_2614_ & 0xff0000) * anInt8973 & ~0xffffff);
								int i_2616_ = ((i_2614_ & 0xff00) * anInt8974 & 0xff0000);
								int i_2617_ = (i_2614_ & 0xff) * anInt8975 & 0xff00;
								is[i_2613_] = (i_2615_ | i_2616_ | i_2617_) >>> 8;
							} else if (i == 3) {
								int i_2618_ = (anIntArray11393[aByteArray11394[i_2612_] & 0xff]);
								int i_2619_ = anInt8944;
								int i_2620_ = i_2618_ + i_2619_;
								int i_2621_ = ((i_2618_ & 0xff00ff) + (i_2619_ & 0xff00ff));
								int i_2622_ = ((i_2621_ & 0x1000100) + (i_2620_ - i_2621_ & 0x10000));
								is[i_2613_] = i_2620_ - i_2622_ | i_2622_ - (i_2622_ >>> 8);
							} else if (i == 2) {
								int i_2623_ = (anIntArray11393[aByteArray11394[i_2612_] & 0xff]);
								int i_2624_ = ((i_2623_ & 0xff00ff) * anInt8965 & ~0xff00ff);
								int i_2625_ = ((i_2623_ & 0xff00) * anInt8965 & 0xff0000);
								is[i_2613_] = ((i_2624_ | i_2625_) >>> 8) + anInt8978;
							} else
								throw new IllegalArgumentException();
						} else if (i_2120_ == 1) {
							if (i == 1) {
								int i_2626_ = aByteArray11394[i_2612_];
								if (i_2626_ != 0)
									is[i_2613_] = anIntArray11393[i_2626_ & 0xff];
							} else if (i == 0) {
								int i_2627_ = aByteArray11394[i_2612_];
								if (i_2627_ != 0) {
									int i_2628_ = anIntArray11393[i_2627_ & 0xff];
									if ((anInt8944 & 0xffffff) == 16777215) {
										int i_2629_ = anInt8944 >>> 24;
										int i_2630_ = 256 - i_2629_;
										int i_2631_ = is[i_2613_];
										is[i_2613_] = ((((i_2628_ & 0xff00ff) * i_2629_ + ((i_2631_ & 0xff00ff) * i_2630_)) & ~0xff00ff) + (((i_2628_ & 0xff00) * i_2629_ + ((i_2631_ & 0xff00) * i_2630_)) & 0xff0000)) >> 8;
									} else if (anInt8965 != 255) {
										int i_2632_ = ((i_2628_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_2633_ = ((i_2628_ & 0xff00) * anInt8974 & 0xff0000);
										int i_2634_ = ((i_2628_ & 0xff) * anInt8975 & 0xff00);
										i_2628_ = (i_2632_ | i_2633_ | i_2634_) >>> 8;
										int i_2635_ = is[i_2613_];
										is[i_2613_] = (((((i_2628_ & 0xff00ff) * anInt8965) + ((i_2635_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2628_ & 0xff00) * anInt8965) + ((i_2635_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									} else {
										int i_2636_ = ((i_2628_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_2637_ = ((i_2628_ & 0xff00) * anInt8974 & 0xff0000);
										int i_2638_ = ((i_2628_ & 0xff) * anInt8975 & 0xff00);
										is[i_2613_] = (i_2636_ | i_2637_ | i_2638_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_2639_ = aByteArray11394[i_2612_];
								int i_2640_ = (i_2639_ > 0 ? anIntArray11393[i_2639_] : 0);
								int i_2641_ = anInt8944;
								int i_2642_ = i_2640_ + i_2641_;
								int i_2643_ = ((i_2640_ & 0xff00ff) + (i_2641_ & 0xff00ff));
								int i_2644_ = ((i_2643_ & 0x1000100) + (i_2642_ - i_2643_ & 0x10000));
								i_2644_ = i_2642_ - i_2644_ | i_2644_ - (i_2644_ >>> 8);
								if (i_2640_ == 0 && anInt8965 != 255) {
									i_2640_ = i_2644_;
									i_2644_ = is[i_2613_];
									i_2644_ = ((((i_2640_ & 0xff00ff) * anInt8965 + ((i_2644_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + (((i_2640_ & 0xff00) * anInt8965 + ((i_2644_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
								}
								is[i_2613_] = i_2644_;
							} else if (i == 2) {
								int i_2645_ = aByteArray11394[i_2612_];
								if (i_2645_ != 0) {
									int i_2646_ = anIntArray11393[i_2645_ & 0xff];
									int i_2647_ = ((i_2646_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_2648_ = ((i_2646_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_2613_++] = ((i_2647_ | i_2648_) >>> 8) + anInt8978;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_2120_ == 2) {
							if (i == 1) {
								int i_2649_ = aByteArray11394[i_2612_];
								if (i_2649_ != 0) {
									int i_2650_ = anIntArray11393[i_2649_ & 0xff];
									int i_2651_ = is[i_2613_];
									int i_2652_ = i_2650_ + i_2651_;
									int i_2653_ = ((i_2650_ & 0xff00ff) + (i_2651_ & 0xff00ff));
									i_2651_ = ((i_2653_ & 0x1000100) + (i_2652_ - i_2653_ & 0x10000));
									is[i_2613_] = (i_2652_ - i_2651_ | i_2651_ - (i_2651_ >>> 8));
								}
							} else if (i == 0) {
								int i_2654_ = aByteArray11394[i_2612_];
								if (i_2654_ != 0) {
									int i_2655_ = anIntArray11393[i_2654_ & 0xff];
									int i_2656_ = ((i_2655_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_2657_ = ((i_2655_ & 0xff00) * anInt8974 & 0xff0000);
									int i_2658_ = ((i_2655_ & 0xff) * anInt8975 & 0xff00);
									i_2655_ = (i_2656_ | i_2657_ | i_2658_) >>> 8;
									int i_2659_ = is[i_2613_];
									int i_2660_ = i_2655_ + i_2659_;
									int i_2661_ = ((i_2655_ & 0xff00ff) + (i_2659_ & 0xff00ff));
									i_2659_ = ((i_2661_ & 0x1000100) + (i_2660_ - i_2661_ & 0x10000));
									is[i_2613_] = (i_2660_ - i_2659_ | i_2659_ - (i_2659_ >>> 8));
								}
							} else if (i == 3) {
								byte i_2662_ = aByteArray11394[i_2612_];
								int i_2663_ = (i_2662_ > 0 ? anIntArray11393[i_2662_] : 0);
								int i_2664_ = anInt8944;
								int i_2665_ = i_2663_ + i_2664_;
								int i_2666_ = ((i_2663_ & 0xff00ff) + (i_2664_ & 0xff00ff));
								int i_2667_ = ((i_2666_ & 0x1000100) + (i_2665_ - i_2666_ & 0x10000));
								i_2667_ = i_2665_ - i_2667_ | i_2667_ - (i_2667_ >>> 8);
								if (i_2663_ == 0 && anInt8965 != 255) {
									i_2663_ = i_2667_;
									i_2667_ = is[i_2613_];
									i_2667_ = ((((i_2663_ & 0xff00ff) * anInt8965 + ((i_2667_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + (((i_2663_ & 0xff00) * anInt8965 + ((i_2667_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
								}
								is[i_2613_] = i_2667_;
							} else if (i == 2) {
								int i_2668_ = aByteArray11394[i_2612_];
								if (i_2668_ != 0) {
									int i_2669_ = anIntArray11393[i_2668_ & 0xff];
									int i_2670_ = ((i_2669_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_2671_ = ((i_2669_ & 0xff00) * anInt8965 & 0xff0000);
									i_2669_ = (((i_2670_ | i_2671_) >>> 8) + anInt8978);
									int i_2672_ = is[i_2613_];
									int i_2673_ = i_2669_ + i_2672_;
									int i_2674_ = ((i_2669_ & 0xff00ff) + (i_2672_ & 0xff00ff));
									i_2672_ = ((i_2674_ & 0x1000100) + (i_2673_ - i_2674_ & 0x10000));
									is[i_2613_] = (i_2673_ - i_2672_ | i_2672_ - (i_2672_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_2607_ += anInt8960;
						i_2608_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				for (int i_2675_ = anInt8957; i_2675_ < 0; i_2675_++) {
					int i_2676_ = anInt8959;
					int i_2677_ = anInt8966 + anInt8968;
					int i_2678_ = anInt8967 + anInt8969;
					int i_2679_ = anInt8955;
					if (i_2677_ < 0) {
						int i_2680_ = (anInt8960 - 1 - i_2677_) / anInt8960;
						i_2679_ += i_2680_;
						i_2677_ += anInt8960 * i_2680_;
						i_2678_ += anInt8962 * i_2680_;
						i_2676_ += i_2680_;
					}
					int i_2681_;
					if ((i_2681_ = (1 + i_2677_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_2679_)
						i_2679_ = i_2681_;
					if (i_2678_ < 0) {
						i_2681_ = (anInt8962 - 1 - i_2678_) / anInt8962;
						i_2679_ += i_2681_;
						i_2677_ += anInt8960 * i_2681_;
						i_2678_ += anInt8962 * i_2681_;
						i_2676_ += i_2681_;
					}
					if ((i_2681_ = (1 + i_2678_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_2679_)
						i_2679_ = i_2681_;
					for (/**/; i_2679_ < 0; i_2679_++) {
						int i_2682_ = (i_2678_ >> 12) * anInt8945 + (i_2677_ >> 12);
						int i_2683_ = i_2676_++;
						if (i_2120_ == 0) {
							if (i == 1)
								is[i_2683_] = (anIntArray11393[aByteArray11394[i_2682_] & 0xff]);
							else if (i == 0) {
								int i_2684_ = (anIntArray11393[aByteArray11394[i_2682_] & 0xff]);
								int i_2685_ = ((i_2684_ & 0xff0000) * anInt8973 & ~0xffffff);
								int i_2686_ = ((i_2684_ & 0xff00) * anInt8974 & 0xff0000);
								int i_2687_ = (i_2684_ & 0xff) * anInt8975 & 0xff00;
								is[i_2683_] = (i_2685_ | i_2686_ | i_2687_) >>> 8;
							} else if (i == 3) {
								int i_2688_ = (anIntArray11393[aByteArray11394[i_2682_] & 0xff]);
								int i_2689_ = anInt8944;
								int i_2690_ = i_2688_ + i_2689_;
								int i_2691_ = ((i_2688_ & 0xff00ff) + (i_2689_ & 0xff00ff));
								int i_2692_ = ((i_2691_ & 0x1000100) + (i_2690_ - i_2691_ & 0x10000));
								is[i_2683_] = i_2690_ - i_2692_ | i_2692_ - (i_2692_ >>> 8);
							} else if (i == 2) {
								int i_2693_ = (anIntArray11393[aByteArray11394[i_2682_] & 0xff]);
								int i_2694_ = ((i_2693_ & 0xff00ff) * anInt8965 & ~0xff00ff);
								int i_2695_ = ((i_2693_ & 0xff00) * anInt8965 & 0xff0000);
								is[i_2683_] = ((i_2694_ | i_2695_) >>> 8) + anInt8978;
							} else
								throw new IllegalArgumentException();
						} else if (i_2120_ == 1) {
							if (i == 1) {
								int i_2696_ = aByteArray11394[i_2682_];
								if (i_2696_ != 0)
									is[i_2683_] = anIntArray11393[i_2696_ & 0xff];
							} else if (i == 0) {
								int i_2697_ = aByteArray11394[i_2682_];
								if (i_2697_ != 0) {
									int i_2698_ = anIntArray11393[i_2697_ & 0xff];
									if ((anInt8944 & 0xffffff) == 16777215) {
										int i_2699_ = anInt8944 >>> 24;
										int i_2700_ = 256 - i_2699_;
										int i_2701_ = is[i_2683_];
										is[i_2683_] = ((((i_2698_ & 0xff00ff) * i_2699_ + ((i_2701_ & 0xff00ff) * i_2700_)) & ~0xff00ff) + (((i_2698_ & 0xff00) * i_2699_ + ((i_2701_ & 0xff00) * i_2700_)) & 0xff0000)) >> 8;
									} else if (anInt8965 != 255) {
										int i_2702_ = ((i_2698_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_2703_ = ((i_2698_ & 0xff00) * anInt8974 & 0xff0000);
										int i_2704_ = ((i_2698_ & 0xff) * anInt8975 & 0xff00);
										i_2698_ = (i_2702_ | i_2703_ | i_2704_) >>> 8;
										int i_2705_ = is[i_2683_];
										is[i_2683_] = (((((i_2698_ & 0xff00ff) * anInt8965) + ((i_2705_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2698_ & 0xff00) * anInt8965) + ((i_2705_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									} else {
										int i_2706_ = ((i_2698_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_2707_ = ((i_2698_ & 0xff00) * anInt8974 & 0xff0000);
										int i_2708_ = ((i_2698_ & 0xff) * anInt8975 & 0xff00);
										is[i_2683_] = (i_2706_ | i_2707_ | i_2708_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_2709_ = aByteArray11394[i_2682_];
								int i_2710_ = (i_2709_ > 0 ? anIntArray11393[i_2709_] : 0);
								int i_2711_ = anInt8944;
								int i_2712_ = i_2710_ + i_2711_;
								int i_2713_ = ((i_2710_ & 0xff00ff) + (i_2711_ & 0xff00ff));
								int i_2714_ = ((i_2713_ & 0x1000100) + (i_2712_ - i_2713_ & 0x10000));
								i_2714_ = i_2712_ - i_2714_ | i_2714_ - (i_2714_ >>> 8);
								if (i_2710_ == 0 && anInt8965 != 255) {
									i_2710_ = i_2714_;
									i_2714_ = is[i_2683_];
									i_2714_ = ((((i_2710_ & 0xff00ff) * anInt8965 + ((i_2714_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + (((i_2710_ & 0xff00) * anInt8965 + ((i_2714_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
								}
								is[i_2683_] = i_2714_;
							} else if (i == 2) {
								int i_2715_ = aByteArray11394[i_2682_];
								if (i_2715_ != 0) {
									int i_2716_ = anIntArray11393[i_2715_ & 0xff];
									int i_2717_ = ((i_2716_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_2718_ = ((i_2716_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_2683_++] = ((i_2717_ | i_2718_) >>> 8) + anInt8978;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_2120_ == 2) {
							if (i == 1) {
								int i_2719_ = aByteArray11394[i_2682_];
								if (i_2719_ != 0) {
									int i_2720_ = anIntArray11393[i_2719_ & 0xff];
									int i_2721_ = is[i_2683_];
									int i_2722_ = i_2720_ + i_2721_;
									int i_2723_ = ((i_2720_ & 0xff00ff) + (i_2721_ & 0xff00ff));
									i_2721_ = ((i_2723_ & 0x1000100) + (i_2722_ - i_2723_ & 0x10000));
									is[i_2683_] = (i_2722_ - i_2721_ | i_2721_ - (i_2721_ >>> 8));
								}
							} else if (i == 0) {
								int i_2724_ = aByteArray11394[i_2682_];
								if (i_2724_ != 0) {
									int i_2725_ = anIntArray11393[i_2724_ & 0xff];
									int i_2726_ = ((i_2725_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_2727_ = ((i_2725_ & 0xff00) * anInt8974 & 0xff0000);
									int i_2728_ = ((i_2725_ & 0xff) * anInt8975 & 0xff00);
									i_2725_ = (i_2726_ | i_2727_ | i_2728_) >>> 8;
									int i_2729_ = is[i_2683_];
									int i_2730_ = i_2725_ + i_2729_;
									int i_2731_ = ((i_2725_ & 0xff00ff) + (i_2729_ & 0xff00ff));
									i_2729_ = ((i_2731_ & 0x1000100) + (i_2730_ - i_2731_ & 0x10000));
									is[i_2683_] = (i_2730_ - i_2729_ | i_2729_ - (i_2729_ >>> 8));
								}
							} else if (i == 3) {
								byte i_2732_ = aByteArray11394[i_2682_];
								int i_2733_ = (i_2732_ > 0 ? anIntArray11393[i_2732_] : 0);
								int i_2734_ = anInt8944;
								int i_2735_ = i_2733_ + i_2734_;
								int i_2736_ = ((i_2733_ & 0xff00ff) + (i_2734_ & 0xff00ff));
								int i_2737_ = ((i_2736_ & 0x1000100) + (i_2735_ - i_2736_ & 0x10000));
								i_2737_ = i_2735_ - i_2737_ | i_2737_ - (i_2737_ >>> 8);
								if (i_2733_ == 0 && anInt8965 != 255) {
									i_2733_ = i_2737_;
									i_2737_ = is[i_2683_];
									i_2737_ = ((((i_2733_ & 0xff00ff) * anInt8965 + ((i_2737_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + (((i_2733_ & 0xff00) * anInt8965 + ((i_2737_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
								}
								is[i_2683_] = i_2737_;
							} else if (i == 2) {
								int i_2738_ = aByteArray11394[i_2682_];
								if (i_2738_ != 0) {
									int i_2739_ = anIntArray11393[i_2738_ & 0xff];
									int i_2740_ = ((i_2739_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_2741_ = ((i_2739_ & 0xff00) * anInt8965 & 0xff0000);
									i_2739_ = (((i_2740_ | i_2741_) >>> 8) + anInt8978);
									int i_2742_ = is[i_2683_];
									int i_2743_ = i_2739_ + i_2742_;
									int i_2744_ = ((i_2739_ & 0xff00ff) + (i_2742_ & 0xff00ff));
									i_2742_ = ((i_2744_ & 0x1000100) + (i_2743_ - i_2744_ & 0x10000));
									is[i_2683_] = (i_2743_ - i_2742_ | i_2742_ - (i_2742_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_2677_ += anInt8960;
						i_2678_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	public void method1742(int i, int i_2745_, int i_2746_) {
		throw new IllegalStateException();
	}

	void method8438(int i, int i_2747_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_2748_ = anInt8957;
					while (i_2748_ < 0) {
						int i_2749_ = anInt8959;
						int i_2750_ = anInt8966;
						int i_2751_ = anInt8967;
						int i_2752_ = anInt8955;
						if (i_2750_ >= 0 && i_2751_ >= 0 && i_2750_ - (anInt8945 << 12) < 0 && i_2751_ - (anInt8950 << 12) < 0) {
							for (/**/; i_2752_ < 0; i_2752_++) {
								int i_2753_ = ((i_2751_ >> 12) * anInt8945 + (i_2750_ >> 12));
								int i_2754_ = i_2749_++;
								if (i_2747_ == 0) {
									if (i == 1)
										is[i_2754_] = (anIntArray11393[(aByteArray11394[i_2753_] & 0xff)]);
									else if (i == 0) {
										int i_2755_ = (anIntArray11393[(aByteArray11394[i_2753_] & 0xff)]);
										int i_2756_ = ((i_2755_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_2757_ = ((i_2755_ & 0xff00) * anInt8974 & 0xff0000);
										int i_2758_ = ((i_2755_ & 0xff) * anInt8975 & 0xff00);
										is[i_2754_] = (i_2756_ | i_2757_ | i_2758_) >>> 8;
									} else if (i == 3) {
										int i_2759_ = (anIntArray11393[(aByteArray11394[i_2753_] & 0xff)]);
										int i_2760_ = anInt8944;
										int i_2761_ = i_2759_ + i_2760_;
										int i_2762_ = ((i_2759_ & 0xff00ff) + (i_2760_ & 0xff00ff));
										int i_2763_ = ((i_2762_ & 0x1000100) + (i_2761_ - i_2762_ & 0x10000));
										is[i_2754_] = (i_2761_ - i_2763_ | i_2763_ - (i_2763_ >>> 8));
									} else if (i == 2) {
										int i_2764_ = (anIntArray11393[(aByteArray11394[i_2753_] & 0xff)]);
										int i_2765_ = ((i_2764_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_2766_ = ((i_2764_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_2754_] = ((i_2765_ | i_2766_) >>> 8) + anInt8978;
									} else
										throw new IllegalArgumentException();
								} else if (i_2747_ == 1) {
									if (i == 1) {
										int i_2767_ = aByteArray11394[i_2753_];
										if (i_2767_ != 0)
											is[i_2754_] = (anIntArray11393[i_2767_ & 0xff]);
									} else if (i == 0) {
										int i_2768_ = aByteArray11394[i_2753_];
										if (i_2768_ != 0) {
											int i_2769_ = (anIntArray11393[i_2768_ & 0xff]);
											if ((anInt8944 & 0xffffff) == 16777215) {
												int i_2770_ = anInt8944 >>> 24;
												int i_2771_ = 256 - i_2770_;
												int i_2772_ = is[i_2754_];
												is[i_2754_] = (((((i_2769_ & 0xff00ff) * i_2770_) + ((i_2772_ & 0xff00ff) * i_2771_)) & ~0xff00ff) + ((((i_2769_ & 0xff00) * i_2770_) + ((i_2772_ & 0xff00) * i_2771_)) & 0xff0000)) >> 8;
											} else if (anInt8965 != 255) {
												int i_2773_ = (((i_2769_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_2774_ = (((i_2769_ & 0xff00) * anInt8974) & 0xff0000);
												int i_2775_ = (((i_2769_ & 0xff) * anInt8975) & 0xff00);
												i_2769_ = (i_2773_ | i_2774_ | i_2775_) >>> 8;
												int i_2776_ = is[i_2754_];
												is[i_2754_] = (((((i_2769_ & 0xff00ff) * anInt8965) + ((i_2776_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2769_ & 0xff00) * anInt8965) + ((i_2776_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
											} else {
												int i_2777_ = (((i_2769_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_2778_ = (((i_2769_ & 0xff00) * anInt8974) & 0xff0000);
												int i_2779_ = (((i_2769_ & 0xff) * anInt8975) & 0xff00);
												is[i_2754_] = (i_2777_ | i_2778_ | i_2779_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_2780_ = aByteArray11394[i_2753_];
										int i_2781_ = (i_2780_ > 0 ? anIntArray11393[i_2780_] : 0);
										int i_2782_ = anInt8944;
										int i_2783_ = i_2781_ + i_2782_;
										int i_2784_ = ((i_2781_ & 0xff00ff) + (i_2782_ & 0xff00ff));
										int i_2785_ = ((i_2784_ & 0x1000100) + (i_2783_ - i_2784_ & 0x10000));
										i_2785_ = (i_2783_ - i_2785_ | i_2785_ - (i_2785_ >>> 8));
										if (i_2781_ == 0 && anInt8965 != 255) {
											i_2781_ = i_2785_;
											i_2785_ = is[i_2754_];
											i_2785_ = (((((i_2781_ & 0xff00ff) * anInt8965) + ((i_2785_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2781_ & 0xff00) * anInt8965) + ((i_2785_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_2754_] = i_2785_;
									} else if (i == 2) {
										int i_2786_ = aByteArray11394[i_2753_];
										if (i_2786_ != 0) {
											int i_2787_ = (anIntArray11393[i_2786_ & 0xff]);
											int i_2788_ = (((i_2787_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_2789_ = (((i_2787_ & 0xff00) * anInt8965) & 0xff0000);
											is[i_2754_++] = (((i_2788_ | i_2789_) >>> 8) + anInt8978);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2747_ == 2) {
									if (i == 1) {
										int i_2790_ = aByteArray11394[i_2753_];
										if (i_2790_ != 0) {
											int i_2791_ = (anIntArray11393[i_2790_ & 0xff]);
											int i_2792_ = is[i_2754_];
											int i_2793_ = i_2791_ + i_2792_;
											int i_2794_ = ((i_2791_ & 0xff00ff) + (i_2792_ & 0xff00ff));
											i_2792_ = ((i_2794_ & 0x1000100) + (i_2793_ - i_2794_ & 0x10000));
											is[i_2754_] = (i_2793_ - i_2792_ | i_2792_ - (i_2792_ >>> 8));
										}
									} else if (i == 0) {
										int i_2795_ = aByteArray11394[i_2753_];
										if (i_2795_ != 0) {
											int i_2796_ = (anIntArray11393[i_2795_ & 0xff]);
											int i_2797_ = (((i_2796_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_2798_ = (((i_2796_ & 0xff00) * anInt8974) & 0xff0000);
											int i_2799_ = ((i_2796_ & 0xff) * anInt8975 & 0xff00);
											i_2796_ = (i_2797_ | i_2798_ | i_2799_) >>> 8;
											int i_2800_ = is[i_2754_];
											int i_2801_ = i_2796_ + i_2800_;
											int i_2802_ = ((i_2796_ & 0xff00ff) + (i_2800_ & 0xff00ff));
											i_2800_ = ((i_2802_ & 0x1000100) + (i_2801_ - i_2802_ & 0x10000));
											is[i_2754_] = (i_2801_ - i_2800_ | i_2800_ - (i_2800_ >>> 8));
										}
									} else if (i == 3) {
										byte i_2803_ = aByteArray11394[i_2753_];
										int i_2804_ = (i_2803_ > 0 ? anIntArray11393[i_2803_] : 0);
										int i_2805_ = anInt8944;
										int i_2806_ = i_2804_ + i_2805_;
										int i_2807_ = ((i_2804_ & 0xff00ff) + (i_2805_ & 0xff00ff));
										int i_2808_ = ((i_2807_ & 0x1000100) + (i_2806_ - i_2807_ & 0x10000));
										i_2808_ = (i_2806_ - i_2808_ | i_2808_ - (i_2808_ >>> 8));
										if (i_2804_ == 0 && anInt8965 != 255) {
											i_2804_ = i_2808_;
											i_2808_ = is[i_2754_];
											i_2808_ = (((((i_2804_ & 0xff00ff) * anInt8965) + ((i_2808_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2804_ & 0xff00) * anInt8965) + ((i_2808_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_2754_] = i_2808_;
									} else if (i == 2) {
										int i_2809_ = aByteArray11394[i_2753_];
										if (i_2809_ != 0) {
											int i_2810_ = (anIntArray11393[i_2809_ & 0xff]);
											int i_2811_ = (((i_2810_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_2812_ = (((i_2810_ & 0xff00) * anInt8965) & 0xff0000);
											i_2810_ = ((i_2811_ | i_2812_) >>> 8) + anInt8978;
											int i_2813_ = is[i_2754_];
											int i_2814_ = i_2810_ + i_2813_;
											int i_2815_ = ((i_2810_ & 0xff00ff) + (i_2813_ & 0xff00ff));
											i_2813_ = ((i_2815_ & 0x1000100) + (i_2814_ - i_2815_ & 0x10000));
											is[i_2754_] = (i_2814_ - i_2813_ | i_2813_ - (i_2813_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_2748_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_2816_ = anInt8957;
					while (i_2816_ < 0) {
						int i_2817_ = anInt8959;
						int i_2818_ = anInt8966;
						int i_2819_ = anInt8967 + anInt8969;
						int i_2820_ = anInt8955;
						if (i_2818_ >= 0 && i_2818_ - (anInt8945 << 12) < 0) {
							int i_2821_;
							if ((i_2821_ = i_2819_ - (anInt8950 << 12)) >= 0) {
								i_2821_ = (anInt8962 - i_2821_) / anInt8962;
								i_2820_ += i_2821_;
								i_2819_ += anInt8962 * i_2821_;
								i_2817_ += i_2821_;
							}
							if ((i_2821_ = (i_2819_ - anInt8962) / anInt8962) > i_2820_)
								i_2820_ = i_2821_;
							for (/**/; i_2820_ < 0; i_2820_++) {
								int i_2822_ = ((i_2819_ >> 12) * anInt8945 + (i_2818_ >> 12));
								int i_2823_ = i_2817_++;
								if (i_2747_ == 0) {
									if (i == 1)
										is[i_2823_] = (anIntArray11393[(aByteArray11394[i_2822_] & 0xff)]);
									else if (i == 0) {
										int i_2824_ = (anIntArray11393[(aByteArray11394[i_2822_] & 0xff)]);
										int i_2825_ = ((i_2824_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_2826_ = ((i_2824_ & 0xff00) * anInt8974 & 0xff0000);
										int i_2827_ = ((i_2824_ & 0xff) * anInt8975 & 0xff00);
										is[i_2823_] = (i_2825_ | i_2826_ | i_2827_) >>> 8;
									} else if (i == 3) {
										int i_2828_ = (anIntArray11393[(aByteArray11394[i_2822_] & 0xff)]);
										int i_2829_ = anInt8944;
										int i_2830_ = i_2828_ + i_2829_;
										int i_2831_ = ((i_2828_ & 0xff00ff) + (i_2829_ & 0xff00ff));
										int i_2832_ = ((i_2831_ & 0x1000100) + (i_2830_ - i_2831_ & 0x10000));
										is[i_2823_] = (i_2830_ - i_2832_ | i_2832_ - (i_2832_ >>> 8));
									} else if (i == 2) {
										int i_2833_ = (anIntArray11393[(aByteArray11394[i_2822_] & 0xff)]);
										int i_2834_ = ((i_2833_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_2835_ = ((i_2833_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_2823_] = ((i_2834_ | i_2835_) >>> 8) + anInt8978;
									} else
										throw new IllegalArgumentException();
								} else if (i_2747_ == 1) {
									if (i == 1) {
										int i_2836_ = aByteArray11394[i_2822_];
										if (i_2836_ != 0)
											is[i_2823_] = (anIntArray11393[i_2836_ & 0xff]);
									} else if (i == 0) {
										int i_2837_ = aByteArray11394[i_2822_];
										if (i_2837_ != 0) {
											int i_2838_ = (anIntArray11393[i_2837_ & 0xff]);
											if ((anInt8944 & 0xffffff) == 16777215) {
												int i_2839_ = anInt8944 >>> 24;
												int i_2840_ = 256 - i_2839_;
												int i_2841_ = is[i_2823_];
												is[i_2823_] = (((((i_2838_ & 0xff00ff) * i_2839_) + ((i_2841_ & 0xff00ff) * i_2840_)) & ~0xff00ff) + ((((i_2838_ & 0xff00) * i_2839_) + ((i_2841_ & 0xff00) * i_2840_)) & 0xff0000)) >> 8;
											} else if (anInt8965 != 255) {
												int i_2842_ = (((i_2838_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_2843_ = (((i_2838_ & 0xff00) * anInt8974) & 0xff0000);
												int i_2844_ = (((i_2838_ & 0xff) * anInt8975) & 0xff00);
												i_2838_ = (i_2842_ | i_2843_ | i_2844_) >>> 8;
												int i_2845_ = is[i_2823_];
												is[i_2823_] = (((((i_2838_ & 0xff00ff) * anInt8965) + ((i_2845_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2838_ & 0xff00) * anInt8965) + ((i_2845_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
											} else {
												int i_2846_ = (((i_2838_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_2847_ = (((i_2838_ & 0xff00) * anInt8974) & 0xff0000);
												int i_2848_ = (((i_2838_ & 0xff) * anInt8975) & 0xff00);
												is[i_2823_] = (i_2846_ | i_2847_ | i_2848_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_2849_ = aByteArray11394[i_2822_];
										int i_2850_ = (i_2849_ > 0 ? anIntArray11393[i_2849_] : 0);
										int i_2851_ = anInt8944;
										int i_2852_ = i_2850_ + i_2851_;
										int i_2853_ = ((i_2850_ & 0xff00ff) + (i_2851_ & 0xff00ff));
										int i_2854_ = ((i_2853_ & 0x1000100) + (i_2852_ - i_2853_ & 0x10000));
										i_2854_ = (i_2852_ - i_2854_ | i_2854_ - (i_2854_ >>> 8));
										if (i_2850_ == 0 && anInt8965 != 255) {
											i_2850_ = i_2854_;
											i_2854_ = is[i_2823_];
											i_2854_ = (((((i_2850_ & 0xff00ff) * anInt8965) + ((i_2854_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2850_ & 0xff00) * anInt8965) + ((i_2854_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_2823_] = i_2854_;
									} else if (i == 2) {
										int i_2855_ = aByteArray11394[i_2822_];
										if (i_2855_ != 0) {
											int i_2856_ = (anIntArray11393[i_2855_ & 0xff]);
											int i_2857_ = (((i_2856_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_2858_ = (((i_2856_ & 0xff00) * anInt8965) & 0xff0000);
											is[i_2823_++] = (((i_2857_ | i_2858_) >>> 8) + anInt8978);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2747_ == 2) {
									if (i == 1) {
										int i_2859_ = aByteArray11394[i_2822_];
										if (i_2859_ != 0) {
											int i_2860_ = (anIntArray11393[i_2859_ & 0xff]);
											int i_2861_ = is[i_2823_];
											int i_2862_ = i_2860_ + i_2861_;
											int i_2863_ = ((i_2860_ & 0xff00ff) + (i_2861_ & 0xff00ff));
											i_2861_ = ((i_2863_ & 0x1000100) + (i_2862_ - i_2863_ & 0x10000));
											is[i_2823_] = (i_2862_ - i_2861_ | i_2861_ - (i_2861_ >>> 8));
										}
									} else if (i == 0) {
										int i_2864_ = aByteArray11394[i_2822_];
										if (i_2864_ != 0) {
											int i_2865_ = (anIntArray11393[i_2864_ & 0xff]);
											int i_2866_ = (((i_2865_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_2867_ = (((i_2865_ & 0xff00) * anInt8974) & 0xff0000);
											int i_2868_ = ((i_2865_ & 0xff) * anInt8975 & 0xff00);
											i_2865_ = (i_2866_ | i_2867_ | i_2868_) >>> 8;
											int i_2869_ = is[i_2823_];
											int i_2870_ = i_2865_ + i_2869_;
											int i_2871_ = ((i_2865_ & 0xff00ff) + (i_2869_ & 0xff00ff));
											i_2869_ = ((i_2871_ & 0x1000100) + (i_2870_ - i_2871_ & 0x10000));
											is[i_2823_] = (i_2870_ - i_2869_ | i_2869_ - (i_2869_ >>> 8));
										}
									} else if (i == 3) {
										byte i_2872_ = aByteArray11394[i_2822_];
										int i_2873_ = (i_2872_ > 0 ? anIntArray11393[i_2872_] : 0);
										int i_2874_ = anInt8944;
										int i_2875_ = i_2873_ + i_2874_;
										int i_2876_ = ((i_2873_ & 0xff00ff) + (i_2874_ & 0xff00ff));
										int i_2877_ = ((i_2876_ & 0x1000100) + (i_2875_ - i_2876_ & 0x10000));
										i_2877_ = (i_2875_ - i_2877_ | i_2877_ - (i_2877_ >>> 8));
										if (i_2873_ == 0 && anInt8965 != 255) {
											i_2873_ = i_2877_;
											i_2877_ = is[i_2823_];
											i_2877_ = (((((i_2873_ & 0xff00ff) * anInt8965) + ((i_2877_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2873_ & 0xff00) * anInt8965) + ((i_2877_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_2823_] = i_2877_;
									} else if (i == 2) {
										int i_2878_ = aByteArray11394[i_2822_];
										if (i_2878_ != 0) {
											int i_2879_ = (anIntArray11393[i_2878_ & 0xff]);
											int i_2880_ = (((i_2879_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_2881_ = (((i_2879_ & 0xff00) * anInt8965) & 0xff0000);
											i_2879_ = ((i_2880_ | i_2881_) >>> 8) + anInt8978;
											int i_2882_ = is[i_2823_];
											int i_2883_ = i_2879_ + i_2882_;
											int i_2884_ = ((i_2879_ & 0xff00ff) + (i_2882_ & 0xff00ff));
											i_2882_ = ((i_2884_ & 0x1000100) + (i_2883_ - i_2884_ & 0x10000));
											is[i_2823_] = (i_2883_ - i_2882_ | i_2882_ - (i_2882_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_2819_ += anInt8962;
							}
						}
						i_2816_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_2885_ = anInt8957;
					while (i_2885_ < 0) {
						int i_2886_ = anInt8959;
						int i_2887_ = anInt8966;
						int i_2888_ = anInt8967 + anInt8969;
						int i_2889_ = anInt8955;
						if (i_2887_ >= 0 && i_2887_ - (anInt8945 << 12) < 0) {
							if (i_2888_ < 0) {
								int i_2890_ = (anInt8962 - 1 - i_2888_) / anInt8962;
								i_2889_ += i_2890_;
								i_2888_ += anInt8962 * i_2890_;
								i_2886_ += i_2890_;
							}
							int i_2891_;
							if ((i_2891_ = (1 + i_2888_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_2889_)
								i_2889_ = i_2891_;
							for (/**/; i_2889_ < 0; i_2889_++) {
								int i_2892_ = ((i_2888_ >> 12) * anInt8945 + (i_2887_ >> 12));
								int i_2893_ = i_2886_++;
								if (i_2747_ == 0) {
									if (i == 1)
										is[i_2893_] = (anIntArray11393[(aByteArray11394[i_2892_] & 0xff)]);
									else if (i == 0) {
										int i_2894_ = (anIntArray11393[(aByteArray11394[i_2892_] & 0xff)]);
										int i_2895_ = ((i_2894_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_2896_ = ((i_2894_ & 0xff00) * anInt8974 & 0xff0000);
										int i_2897_ = ((i_2894_ & 0xff) * anInt8975 & 0xff00);
										is[i_2893_] = (i_2895_ | i_2896_ | i_2897_) >>> 8;
									} else if (i == 3) {
										int i_2898_ = (anIntArray11393[(aByteArray11394[i_2892_] & 0xff)]);
										int i_2899_ = anInt8944;
										int i_2900_ = i_2898_ + i_2899_;
										int i_2901_ = ((i_2898_ & 0xff00ff) + (i_2899_ & 0xff00ff));
										int i_2902_ = ((i_2901_ & 0x1000100) + (i_2900_ - i_2901_ & 0x10000));
										is[i_2893_] = (i_2900_ - i_2902_ | i_2902_ - (i_2902_ >>> 8));
									} else if (i == 2) {
										int i_2903_ = (anIntArray11393[(aByteArray11394[i_2892_] & 0xff)]);
										int i_2904_ = ((i_2903_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_2905_ = ((i_2903_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_2893_] = ((i_2904_ | i_2905_) >>> 8) + anInt8978;
									} else
										throw new IllegalArgumentException();
								} else if (i_2747_ == 1) {
									if (i == 1) {
										int i_2906_ = aByteArray11394[i_2892_];
										if (i_2906_ != 0)
											is[i_2893_] = (anIntArray11393[i_2906_ & 0xff]);
									} else if (i == 0) {
										int i_2907_ = aByteArray11394[i_2892_];
										if (i_2907_ != 0) {
											int i_2908_ = (anIntArray11393[i_2907_ & 0xff]);
											if ((anInt8944 & 0xffffff) == 16777215) {
												int i_2909_ = anInt8944 >>> 24;
												int i_2910_ = 256 - i_2909_;
												int i_2911_ = is[i_2893_];
												is[i_2893_] = (((((i_2908_ & 0xff00ff) * i_2909_) + ((i_2911_ & 0xff00ff) * i_2910_)) & ~0xff00ff) + ((((i_2908_ & 0xff00) * i_2909_) + ((i_2911_ & 0xff00) * i_2910_)) & 0xff0000)) >> 8;
											} else if (anInt8965 != 255) {
												int i_2912_ = (((i_2908_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_2913_ = (((i_2908_ & 0xff00) * anInt8974) & 0xff0000);
												int i_2914_ = (((i_2908_ & 0xff) * anInt8975) & 0xff00);
												i_2908_ = (i_2912_ | i_2913_ | i_2914_) >>> 8;
												int i_2915_ = is[i_2893_];
												is[i_2893_] = (((((i_2908_ & 0xff00ff) * anInt8965) + ((i_2915_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2908_ & 0xff00) * anInt8965) + ((i_2915_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
											} else {
												int i_2916_ = (((i_2908_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_2917_ = (((i_2908_ & 0xff00) * anInt8974) & 0xff0000);
												int i_2918_ = (((i_2908_ & 0xff) * anInt8975) & 0xff00);
												is[i_2893_] = (i_2916_ | i_2917_ | i_2918_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_2919_ = aByteArray11394[i_2892_];
										int i_2920_ = (i_2919_ > 0 ? anIntArray11393[i_2919_] : 0);
										int i_2921_ = anInt8944;
										int i_2922_ = i_2920_ + i_2921_;
										int i_2923_ = ((i_2920_ & 0xff00ff) + (i_2921_ & 0xff00ff));
										int i_2924_ = ((i_2923_ & 0x1000100) + (i_2922_ - i_2923_ & 0x10000));
										i_2924_ = (i_2922_ - i_2924_ | i_2924_ - (i_2924_ >>> 8));
										if (i_2920_ == 0 && anInt8965 != 255) {
											i_2920_ = i_2924_;
											i_2924_ = is[i_2893_];
											i_2924_ = (((((i_2920_ & 0xff00ff) * anInt8965) + ((i_2924_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2920_ & 0xff00) * anInt8965) + ((i_2924_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_2893_] = i_2924_;
									} else if (i == 2) {
										int i_2925_ = aByteArray11394[i_2892_];
										if (i_2925_ != 0) {
											int i_2926_ = (anIntArray11393[i_2925_ & 0xff]);
											int i_2927_ = (((i_2926_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_2928_ = (((i_2926_ & 0xff00) * anInt8965) & 0xff0000);
											is[i_2893_++] = (((i_2927_ | i_2928_) >>> 8) + anInt8978);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2747_ == 2) {
									if (i == 1) {
										int i_2929_ = aByteArray11394[i_2892_];
										if (i_2929_ != 0) {
											int i_2930_ = (anIntArray11393[i_2929_ & 0xff]);
											int i_2931_ = is[i_2893_];
											int i_2932_ = i_2930_ + i_2931_;
											int i_2933_ = ((i_2930_ & 0xff00ff) + (i_2931_ & 0xff00ff));
											i_2931_ = ((i_2933_ & 0x1000100) + (i_2932_ - i_2933_ & 0x10000));
											is[i_2893_] = (i_2932_ - i_2931_ | i_2931_ - (i_2931_ >>> 8));
										}
									} else if (i == 0) {
										int i_2934_ = aByteArray11394[i_2892_];
										if (i_2934_ != 0) {
											int i_2935_ = (anIntArray11393[i_2934_ & 0xff]);
											int i_2936_ = (((i_2935_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_2937_ = (((i_2935_ & 0xff00) * anInt8974) & 0xff0000);
											int i_2938_ = ((i_2935_ & 0xff) * anInt8975 & 0xff00);
											i_2935_ = (i_2936_ | i_2937_ | i_2938_) >>> 8;
											int i_2939_ = is[i_2893_];
											int i_2940_ = i_2935_ + i_2939_;
											int i_2941_ = ((i_2935_ & 0xff00ff) + (i_2939_ & 0xff00ff));
											i_2939_ = ((i_2941_ & 0x1000100) + (i_2940_ - i_2941_ & 0x10000));
											is[i_2893_] = (i_2940_ - i_2939_ | i_2939_ - (i_2939_ >>> 8));
										}
									} else if (i == 3) {
										byte i_2942_ = aByteArray11394[i_2892_];
										int i_2943_ = (i_2942_ > 0 ? anIntArray11393[i_2942_] : 0);
										int i_2944_ = anInt8944;
										int i_2945_ = i_2943_ + i_2944_;
										int i_2946_ = ((i_2943_ & 0xff00ff) + (i_2944_ & 0xff00ff));
										int i_2947_ = ((i_2946_ & 0x1000100) + (i_2945_ - i_2946_ & 0x10000));
										i_2947_ = (i_2945_ - i_2947_ | i_2947_ - (i_2947_ >>> 8));
										if (i_2943_ == 0 && anInt8965 != 255) {
											i_2943_ = i_2947_;
											i_2947_ = is[i_2893_];
											i_2947_ = (((((i_2943_ & 0xff00ff) * anInt8965) + ((i_2947_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2943_ & 0xff00) * anInt8965) + ((i_2947_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_2893_] = i_2947_;
									} else if (i == 2) {
										int i_2948_ = aByteArray11394[i_2892_];
										if (i_2948_ != 0) {
											int i_2949_ = (anIntArray11393[i_2948_ & 0xff]);
											int i_2950_ = (((i_2949_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_2951_ = (((i_2949_ & 0xff00) * anInt8965) & 0xff0000);
											i_2949_ = ((i_2950_ | i_2951_) >>> 8) + anInt8978;
											int i_2952_ = is[i_2893_];
											int i_2953_ = i_2949_ + i_2952_;
											int i_2954_ = ((i_2949_ & 0xff00ff) + (i_2952_ & 0xff00ff));
											i_2952_ = ((i_2954_ & 0x1000100) + (i_2953_ - i_2954_ & 0x10000));
											is[i_2893_] = (i_2953_ - i_2952_ | i_2952_ - (i_2952_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_2888_ += anInt8962;
							}
						}
						i_2885_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_2955_ = anInt8957;
					while (i_2955_ < 0) {
						int i_2956_ = anInt8959;
						int i_2957_ = anInt8966 + anInt8968;
						int i_2958_ = anInt8967;
						int i_2959_ = anInt8955;
						if (i_2958_ >= 0 && i_2958_ - (anInt8950 << 12) < 0) {
							int i_2960_;
							if ((i_2960_ = i_2957_ - (anInt8945 << 12)) >= 0) {
								i_2960_ = (anInt8960 - i_2960_) / anInt8960;
								i_2959_ += i_2960_;
								i_2957_ += anInt8960 * i_2960_;
								i_2956_ += i_2960_;
							}
							if ((i_2960_ = (i_2957_ - anInt8960) / anInt8960) > i_2959_)
								i_2959_ = i_2960_;
							for (/**/; i_2959_ < 0; i_2959_++) {
								int i_2961_ = ((i_2958_ >> 12) * anInt8945 + (i_2957_ >> 12));
								int i_2962_ = i_2956_++;
								if (i_2747_ == 0) {
									if (i == 1)
										is[i_2962_] = (anIntArray11393[(aByteArray11394[i_2961_] & 0xff)]);
									else if (i == 0) {
										int i_2963_ = (anIntArray11393[(aByteArray11394[i_2961_] & 0xff)]);
										int i_2964_ = ((i_2963_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_2965_ = ((i_2963_ & 0xff00) * anInt8974 & 0xff0000);
										int i_2966_ = ((i_2963_ & 0xff) * anInt8975 & 0xff00);
										is[i_2962_] = (i_2964_ | i_2965_ | i_2966_) >>> 8;
									} else if (i == 3) {
										int i_2967_ = (anIntArray11393[(aByteArray11394[i_2961_] & 0xff)]);
										int i_2968_ = anInt8944;
										int i_2969_ = i_2967_ + i_2968_;
										int i_2970_ = ((i_2967_ & 0xff00ff) + (i_2968_ & 0xff00ff));
										int i_2971_ = ((i_2970_ & 0x1000100) + (i_2969_ - i_2970_ & 0x10000));
										is[i_2962_] = (i_2969_ - i_2971_ | i_2971_ - (i_2971_ >>> 8));
									} else if (i == 2) {
										int i_2972_ = (anIntArray11393[(aByteArray11394[i_2961_] & 0xff)]);
										int i_2973_ = ((i_2972_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_2974_ = ((i_2972_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_2962_] = ((i_2973_ | i_2974_) >>> 8) + anInt8978;
									} else
										throw new IllegalArgumentException();
								} else if (i_2747_ == 1) {
									if (i == 1) {
										int i_2975_ = aByteArray11394[i_2961_];
										if (i_2975_ != 0)
											is[i_2962_] = (anIntArray11393[i_2975_ & 0xff]);
									} else if (i == 0) {
										int i_2976_ = aByteArray11394[i_2961_];
										if (i_2976_ != 0) {
											int i_2977_ = (anIntArray11393[i_2976_ & 0xff]);
											if ((anInt8944 & 0xffffff) == 16777215) {
												int i_2978_ = anInt8944 >>> 24;
												int i_2979_ = 256 - i_2978_;
												int i_2980_ = is[i_2962_];
												is[i_2962_] = (((((i_2977_ & 0xff00ff) * i_2978_) + ((i_2980_ & 0xff00ff) * i_2979_)) & ~0xff00ff) + ((((i_2977_ & 0xff00) * i_2978_) + ((i_2980_ & 0xff00) * i_2979_)) & 0xff0000)) >> 8;
											} else if (anInt8965 != 255) {
												int i_2981_ = (((i_2977_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_2982_ = (((i_2977_ & 0xff00) * anInt8974) & 0xff0000);
												int i_2983_ = (((i_2977_ & 0xff) * anInt8975) & 0xff00);
												i_2977_ = (i_2981_ | i_2982_ | i_2983_) >>> 8;
												int i_2984_ = is[i_2962_];
												is[i_2962_] = (((((i_2977_ & 0xff00ff) * anInt8965) + ((i_2984_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2977_ & 0xff00) * anInt8965) + ((i_2984_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
											} else {
												int i_2985_ = (((i_2977_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_2986_ = (((i_2977_ & 0xff00) * anInt8974) & 0xff0000);
												int i_2987_ = (((i_2977_ & 0xff) * anInt8975) & 0xff00);
												is[i_2962_] = (i_2985_ | i_2986_ | i_2987_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_2988_ = aByteArray11394[i_2961_];
										int i_2989_ = (i_2988_ > 0 ? anIntArray11393[i_2988_] : 0);
										int i_2990_ = anInt8944;
										int i_2991_ = i_2989_ + i_2990_;
										int i_2992_ = ((i_2989_ & 0xff00ff) + (i_2990_ & 0xff00ff));
										int i_2993_ = ((i_2992_ & 0x1000100) + (i_2991_ - i_2992_ & 0x10000));
										i_2993_ = (i_2991_ - i_2993_ | i_2993_ - (i_2993_ >>> 8));
										if (i_2989_ == 0 && anInt8965 != 255) {
											i_2989_ = i_2993_;
											i_2993_ = is[i_2962_];
											i_2993_ = (((((i_2989_ & 0xff00ff) * anInt8965) + ((i_2993_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_2989_ & 0xff00) * anInt8965) + ((i_2993_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_2962_] = i_2993_;
									} else if (i == 2) {
										int i_2994_ = aByteArray11394[i_2961_];
										if (i_2994_ != 0) {
											int i_2995_ = (anIntArray11393[i_2994_ & 0xff]);
											int i_2996_ = (((i_2995_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_2997_ = (((i_2995_ & 0xff00) * anInt8965) & 0xff0000);
											is[i_2962_++] = (((i_2996_ | i_2997_) >>> 8) + anInt8978);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2747_ == 2) {
									if (i == 1) {
										int i_2998_ = aByteArray11394[i_2961_];
										if (i_2998_ != 0) {
											int i_2999_ = (anIntArray11393[i_2998_ & 0xff]);
											int i_3000_ = is[i_2962_];
											int i_3001_ = i_2999_ + i_3000_;
											int i_3002_ = ((i_2999_ & 0xff00ff) + (i_3000_ & 0xff00ff));
											i_3000_ = ((i_3002_ & 0x1000100) + (i_3001_ - i_3002_ & 0x10000));
											is[i_2962_] = (i_3001_ - i_3000_ | i_3000_ - (i_3000_ >>> 8));
										}
									} else if (i == 0) {
										int i_3003_ = aByteArray11394[i_2961_];
										if (i_3003_ != 0) {
											int i_3004_ = (anIntArray11393[i_3003_ & 0xff]);
											int i_3005_ = (((i_3004_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_3006_ = (((i_3004_ & 0xff00) * anInt8974) & 0xff0000);
											int i_3007_ = ((i_3004_ & 0xff) * anInt8975 & 0xff00);
											i_3004_ = (i_3005_ | i_3006_ | i_3007_) >>> 8;
											int i_3008_ = is[i_2962_];
											int i_3009_ = i_3004_ + i_3008_;
											int i_3010_ = ((i_3004_ & 0xff00ff) + (i_3008_ & 0xff00ff));
											i_3008_ = ((i_3010_ & 0x1000100) + (i_3009_ - i_3010_ & 0x10000));
											is[i_2962_] = (i_3009_ - i_3008_ | i_3008_ - (i_3008_ >>> 8));
										}
									} else if (i == 3) {
										byte i_3011_ = aByteArray11394[i_2961_];
										int i_3012_ = (i_3011_ > 0 ? anIntArray11393[i_3011_] : 0);
										int i_3013_ = anInt8944;
										int i_3014_ = i_3012_ + i_3013_;
										int i_3015_ = ((i_3012_ & 0xff00ff) + (i_3013_ & 0xff00ff));
										int i_3016_ = ((i_3015_ & 0x1000100) + (i_3014_ - i_3015_ & 0x10000));
										i_3016_ = (i_3014_ - i_3016_ | i_3016_ - (i_3016_ >>> 8));
										if (i_3012_ == 0 && anInt8965 != 255) {
											i_3012_ = i_3016_;
											i_3016_ = is[i_2962_];
											i_3016_ = (((((i_3012_ & 0xff00ff) * anInt8965) + ((i_3016_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3012_ & 0xff00) * anInt8965) + ((i_3016_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_2962_] = i_3016_;
									} else if (i == 2) {
										int i_3017_ = aByteArray11394[i_2961_];
										if (i_3017_ != 0) {
											int i_3018_ = (anIntArray11393[i_3017_ & 0xff]);
											int i_3019_ = (((i_3018_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_3020_ = (((i_3018_ & 0xff00) * anInt8965) & 0xff0000);
											i_3018_ = ((i_3019_ | i_3020_) >>> 8) + anInt8978;
											int i_3021_ = is[i_2962_];
											int i_3022_ = i_3018_ + i_3021_;
											int i_3023_ = ((i_3018_ & 0xff00ff) + (i_3021_ & 0xff00ff));
											i_3021_ = ((i_3023_ & 0x1000100) + (i_3022_ - i_3023_ & 0x10000));
											is[i_2962_] = (i_3022_ - i_3021_ | i_3021_ - (i_3021_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_2957_ += anInt8960;
							}
						}
						i_2955_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_3024_ = anInt8957;
					while (i_3024_ < 0) {
						int i_3025_ = anInt8959;
						int i_3026_ = anInt8966 + anInt8968;
						int i_3027_ = anInt8967 + anInt8969;
						int i_3028_ = anInt8955;
						int i_3029_;
						if ((i_3029_ = i_3026_ - (anInt8945 << 12)) >= 0) {
							i_3029_ = (anInt8960 - i_3029_) / anInt8960;
							i_3028_ += i_3029_;
							i_3026_ += anInt8960 * i_3029_;
							i_3027_ += anInt8962 * i_3029_;
							i_3025_ += i_3029_;
						}
						if ((i_3029_ = (i_3026_ - anInt8960) / anInt8960) > i_3028_)
							i_3028_ = i_3029_;
						if ((i_3029_ = i_3027_ - (anInt8950 << 12)) >= 0) {
							i_3029_ = (anInt8962 - i_3029_) / anInt8962;
							i_3028_ += i_3029_;
							i_3026_ += anInt8960 * i_3029_;
							i_3027_ += anInt8962 * i_3029_;
							i_3025_ += i_3029_;
						}
						if ((i_3029_ = (i_3027_ - anInt8962) / anInt8962) > i_3028_)
							i_3028_ = i_3029_;
						for (/**/; i_3028_ < 0; i_3028_++) {
							int i_3030_ = ((i_3027_ >> 12) * anInt8945 + (i_3026_ >> 12));
							int i_3031_ = i_3025_++;
							if (i_2747_ == 0) {
								if (i == 1)
									is[i_3031_] = (anIntArray11393[aByteArray11394[i_3030_] & 0xff]);
								else if (i == 0) {
									int i_3032_ = (anIntArray11393[aByteArray11394[i_3030_] & 0xff]);
									int i_3033_ = ((i_3032_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_3034_ = ((i_3032_ & 0xff00) * anInt8974 & 0xff0000);
									int i_3035_ = ((i_3032_ & 0xff) * anInt8975 & 0xff00);
									is[i_3031_] = (i_3033_ | i_3034_ | i_3035_) >>> 8;
								} else if (i == 3) {
									int i_3036_ = (anIntArray11393[aByteArray11394[i_3030_] & 0xff]);
									int i_3037_ = anInt8944;
									int i_3038_ = i_3036_ + i_3037_;
									int i_3039_ = ((i_3036_ & 0xff00ff) + (i_3037_ & 0xff00ff));
									int i_3040_ = ((i_3039_ & 0x1000100) + (i_3038_ - i_3039_ & 0x10000));
									is[i_3031_] = (i_3038_ - i_3040_ | i_3040_ - (i_3040_ >>> 8));
								} else if (i == 2) {
									int i_3041_ = (anIntArray11393[aByteArray11394[i_3030_] & 0xff]);
									int i_3042_ = ((i_3041_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_3043_ = ((i_3041_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_3031_] = (((i_3042_ | i_3043_) >>> 8) + anInt8978);
								} else
									throw new IllegalArgumentException();
							} else if (i_2747_ == 1) {
								if (i == 1) {
									int i_3044_ = aByteArray11394[i_3030_];
									if (i_3044_ != 0)
										is[i_3031_] = anIntArray11393[i_3044_ & 0xff];
								} else if (i == 0) {
									int i_3045_ = aByteArray11394[i_3030_];
									if (i_3045_ != 0) {
										int i_3046_ = anIntArray11393[i_3045_ & 0xff];
										if ((anInt8944 & 0xffffff) == 16777215) {
											int i_3047_ = anInt8944 >>> 24;
											int i_3048_ = 256 - i_3047_;
											int i_3049_ = is[i_3031_];
											is[i_3031_] = (((((i_3046_ & 0xff00ff) * i_3047_) + ((i_3049_ & 0xff00ff) * i_3048_)) & ~0xff00ff) + ((((i_3046_ & 0xff00) * i_3047_) + ((i_3049_ & 0xff00) * i_3048_)) & 0xff0000)) >> 8;
										} else if (anInt8965 != 255) {
											int i_3050_ = (((i_3046_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_3051_ = (((i_3046_ & 0xff00) * anInt8974) & 0xff0000);
											int i_3052_ = ((i_3046_ & 0xff) * anInt8975 & 0xff00);
											i_3046_ = (i_3050_ | i_3051_ | i_3052_) >>> 8;
											int i_3053_ = is[i_3031_];
											is[i_3031_] = (((((i_3046_ & 0xff00ff) * anInt8965) + ((i_3053_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3046_ & 0xff00) * anInt8965) + ((i_3053_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										} else {
											int i_3054_ = (((i_3046_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_3055_ = (((i_3046_ & 0xff00) * anInt8974) & 0xff0000);
											int i_3056_ = ((i_3046_ & 0xff) * anInt8975 & 0xff00);
											is[i_3031_] = (i_3054_ | i_3055_ | i_3056_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_3057_ = aByteArray11394[i_3030_];
									int i_3058_ = (i_3057_ > 0 ? anIntArray11393[i_3057_] : 0);
									int i_3059_ = anInt8944;
									int i_3060_ = i_3058_ + i_3059_;
									int i_3061_ = ((i_3058_ & 0xff00ff) + (i_3059_ & 0xff00ff));
									int i_3062_ = ((i_3061_ & 0x1000100) + (i_3060_ - i_3061_ & 0x10000));
									i_3062_ = (i_3060_ - i_3062_ | i_3062_ - (i_3062_ >>> 8));
									if (i_3058_ == 0 && anInt8965 != 255) {
										i_3058_ = i_3062_;
										i_3062_ = is[i_3031_];
										i_3062_ = (((((i_3058_ & 0xff00ff) * anInt8965) + ((i_3062_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3058_ & 0xff00) * anInt8965) + ((i_3062_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_3031_] = i_3062_;
								} else if (i == 2) {
									int i_3063_ = aByteArray11394[i_3030_];
									if (i_3063_ != 0) {
										int i_3064_ = anIntArray11393[i_3063_ & 0xff];
										int i_3065_ = ((i_3064_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_3066_ = ((i_3064_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_3031_++] = ((i_3065_ | i_3066_) >>> 8) + anInt8978;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2747_ == 2) {
								if (i == 1) {
									int i_3067_ = aByteArray11394[i_3030_];
									if (i_3067_ != 0) {
										int i_3068_ = anIntArray11393[i_3067_ & 0xff];
										int i_3069_ = is[i_3031_];
										int i_3070_ = i_3068_ + i_3069_;
										int i_3071_ = ((i_3068_ & 0xff00ff) + (i_3069_ & 0xff00ff));
										i_3069_ = ((i_3071_ & 0x1000100) + (i_3070_ - i_3071_ & 0x10000));
										is[i_3031_] = (i_3070_ - i_3069_ | i_3069_ - (i_3069_ >>> 8));
									}
								} else if (i == 0) {
									int i_3072_ = aByteArray11394[i_3030_];
									if (i_3072_ != 0) {
										int i_3073_ = anIntArray11393[i_3072_ & 0xff];
										int i_3074_ = ((i_3073_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_3075_ = ((i_3073_ & 0xff00) * anInt8974 & 0xff0000);
										int i_3076_ = ((i_3073_ & 0xff) * anInt8975 & 0xff00);
										i_3073_ = (i_3074_ | i_3075_ | i_3076_) >>> 8;
										int i_3077_ = is[i_3031_];
										int i_3078_ = i_3073_ + i_3077_;
										int i_3079_ = ((i_3073_ & 0xff00ff) + (i_3077_ & 0xff00ff));
										i_3077_ = ((i_3079_ & 0x1000100) + (i_3078_ - i_3079_ & 0x10000));
										is[i_3031_] = (i_3078_ - i_3077_ | i_3077_ - (i_3077_ >>> 8));
									}
								} else if (i == 3) {
									byte i_3080_ = aByteArray11394[i_3030_];
									int i_3081_ = (i_3080_ > 0 ? anIntArray11393[i_3080_] : 0);
									int i_3082_ = anInt8944;
									int i_3083_ = i_3081_ + i_3082_;
									int i_3084_ = ((i_3081_ & 0xff00ff) + (i_3082_ & 0xff00ff));
									int i_3085_ = ((i_3084_ & 0x1000100) + (i_3083_ - i_3084_ & 0x10000));
									i_3085_ = (i_3083_ - i_3085_ | i_3085_ - (i_3085_ >>> 8));
									if (i_3081_ == 0 && anInt8965 != 255) {
										i_3081_ = i_3085_;
										i_3085_ = is[i_3031_];
										i_3085_ = (((((i_3081_ & 0xff00ff) * anInt8965) + ((i_3085_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3081_ & 0xff00) * anInt8965) + ((i_3085_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_3031_] = i_3085_;
								} else if (i == 2) {
									int i_3086_ = aByteArray11394[i_3030_];
									if (i_3086_ != 0) {
										int i_3087_ = anIntArray11393[i_3086_ & 0xff];
										int i_3088_ = ((i_3087_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_3089_ = ((i_3087_ & 0xff00) * anInt8965 & 0xff0000);
										i_3087_ = (((i_3088_ | i_3089_) >>> 8) + anInt8978);
										int i_3090_ = is[i_3031_];
										int i_3091_ = i_3087_ + i_3090_;
										int i_3092_ = ((i_3087_ & 0xff00ff) + (i_3090_ & 0xff00ff));
										i_3090_ = ((i_3092_ & 0x1000100) + (i_3091_ - i_3092_ & 0x10000));
										is[i_3031_] = (i_3091_ - i_3090_ | i_3090_ - (i_3090_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_3026_ += anInt8960;
							i_3027_ += anInt8962;
						}
						i_3024_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_3093_ = anInt8957;
					while (i_3093_ < 0) {
						int i_3094_ = anInt8959;
						int i_3095_ = anInt8966 + anInt8968;
						int i_3096_ = anInt8967 + anInt8969;
						int i_3097_ = anInt8955;
						int i_3098_;
						if ((i_3098_ = i_3095_ - (anInt8945 << 12)) >= 0) {
							i_3098_ = (anInt8960 - i_3098_) / anInt8960;
							i_3097_ += i_3098_;
							i_3095_ += anInt8960 * i_3098_;
							i_3096_ += anInt8962 * i_3098_;
							i_3094_ += i_3098_;
						}
						if ((i_3098_ = (i_3095_ - anInt8960) / anInt8960) > i_3097_)
							i_3097_ = i_3098_;
						if (i_3096_ < 0) {
							i_3098_ = (anInt8962 - 1 - i_3096_) / anInt8962;
							i_3097_ += i_3098_;
							i_3095_ += anInt8960 * i_3098_;
							i_3096_ += anInt8962 * i_3098_;
							i_3094_ += i_3098_;
						}
						if ((i_3098_ = (1 + i_3096_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_3097_)
							i_3097_ = i_3098_;
						for (/**/; i_3097_ < 0; i_3097_++) {
							int i_3099_ = ((i_3096_ >> 12) * anInt8945 + (i_3095_ >> 12));
							int i_3100_ = i_3094_++;
							if (i_2747_ == 0) {
								if (i == 1)
									is[i_3100_] = (anIntArray11393[aByteArray11394[i_3099_] & 0xff]);
								else if (i == 0) {
									int i_3101_ = (anIntArray11393[aByteArray11394[i_3099_] & 0xff]);
									int i_3102_ = ((i_3101_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_3103_ = ((i_3101_ & 0xff00) * anInt8974 & 0xff0000);
									int i_3104_ = ((i_3101_ & 0xff) * anInt8975 & 0xff00);
									is[i_3100_] = (i_3102_ | i_3103_ | i_3104_) >>> 8;
								} else if (i == 3) {
									int i_3105_ = (anIntArray11393[aByteArray11394[i_3099_] & 0xff]);
									int i_3106_ = anInt8944;
									int i_3107_ = i_3105_ + i_3106_;
									int i_3108_ = ((i_3105_ & 0xff00ff) + (i_3106_ & 0xff00ff));
									int i_3109_ = ((i_3108_ & 0x1000100) + (i_3107_ - i_3108_ & 0x10000));
									is[i_3100_] = (i_3107_ - i_3109_ | i_3109_ - (i_3109_ >>> 8));
								} else if (i == 2) {
									int i_3110_ = (anIntArray11393[aByteArray11394[i_3099_] & 0xff]);
									int i_3111_ = ((i_3110_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_3112_ = ((i_3110_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_3100_] = (((i_3111_ | i_3112_) >>> 8) + anInt8978);
								} else
									throw new IllegalArgumentException();
							} else if (i_2747_ == 1) {
								if (i == 1) {
									int i_3113_ = aByteArray11394[i_3099_];
									if (i_3113_ != 0)
										is[i_3100_] = anIntArray11393[i_3113_ & 0xff];
								} else if (i == 0) {
									int i_3114_ = aByteArray11394[i_3099_];
									if (i_3114_ != 0) {
										int i_3115_ = anIntArray11393[i_3114_ & 0xff];
										if ((anInt8944 & 0xffffff) == 16777215) {
											int i_3116_ = anInt8944 >>> 24;
											int i_3117_ = 256 - i_3116_;
											int i_3118_ = is[i_3100_];
											is[i_3100_] = (((((i_3115_ & 0xff00ff) * i_3116_) + ((i_3118_ & 0xff00ff) * i_3117_)) & ~0xff00ff) + ((((i_3115_ & 0xff00) * i_3116_) + ((i_3118_ & 0xff00) * i_3117_)) & 0xff0000)) >> 8;
										} else if (anInt8965 != 255) {
											int i_3119_ = (((i_3115_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_3120_ = (((i_3115_ & 0xff00) * anInt8974) & 0xff0000);
											int i_3121_ = ((i_3115_ & 0xff) * anInt8975 & 0xff00);
											i_3115_ = (i_3119_ | i_3120_ | i_3121_) >>> 8;
											int i_3122_ = is[i_3100_];
											is[i_3100_] = (((((i_3115_ & 0xff00ff) * anInt8965) + ((i_3122_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3115_ & 0xff00) * anInt8965) + ((i_3122_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										} else {
											int i_3123_ = (((i_3115_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_3124_ = (((i_3115_ & 0xff00) * anInt8974) & 0xff0000);
											int i_3125_ = ((i_3115_ & 0xff) * anInt8975 & 0xff00);
											is[i_3100_] = (i_3123_ | i_3124_ | i_3125_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_3126_ = aByteArray11394[i_3099_];
									int i_3127_ = (i_3126_ > 0 ? anIntArray11393[i_3126_] : 0);
									int i_3128_ = anInt8944;
									int i_3129_ = i_3127_ + i_3128_;
									int i_3130_ = ((i_3127_ & 0xff00ff) + (i_3128_ & 0xff00ff));
									int i_3131_ = ((i_3130_ & 0x1000100) + (i_3129_ - i_3130_ & 0x10000));
									i_3131_ = (i_3129_ - i_3131_ | i_3131_ - (i_3131_ >>> 8));
									if (i_3127_ == 0 && anInt8965 != 255) {
										i_3127_ = i_3131_;
										i_3131_ = is[i_3100_];
										i_3131_ = (((((i_3127_ & 0xff00ff) * anInt8965) + ((i_3131_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3127_ & 0xff00) * anInt8965) + ((i_3131_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_3100_] = i_3131_;
								} else if (i == 2) {
									int i_3132_ = aByteArray11394[i_3099_];
									if (i_3132_ != 0) {
										int i_3133_ = anIntArray11393[i_3132_ & 0xff];
										int i_3134_ = ((i_3133_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_3135_ = ((i_3133_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_3100_++] = ((i_3134_ | i_3135_) >>> 8) + anInt8978;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2747_ == 2) {
								if (i == 1) {
									int i_3136_ = aByteArray11394[i_3099_];
									if (i_3136_ != 0) {
										int i_3137_ = anIntArray11393[i_3136_ & 0xff];
										int i_3138_ = is[i_3100_];
										int i_3139_ = i_3137_ + i_3138_;
										int i_3140_ = ((i_3137_ & 0xff00ff) + (i_3138_ & 0xff00ff));
										i_3138_ = ((i_3140_ & 0x1000100) + (i_3139_ - i_3140_ & 0x10000));
										is[i_3100_] = (i_3139_ - i_3138_ | i_3138_ - (i_3138_ >>> 8));
									}
								} else if (i == 0) {
									int i_3141_ = aByteArray11394[i_3099_];
									if (i_3141_ != 0) {
										int i_3142_ = anIntArray11393[i_3141_ & 0xff];
										int i_3143_ = ((i_3142_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_3144_ = ((i_3142_ & 0xff00) * anInt8974 & 0xff0000);
										int i_3145_ = ((i_3142_ & 0xff) * anInt8975 & 0xff00);
										i_3142_ = (i_3143_ | i_3144_ | i_3145_) >>> 8;
										int i_3146_ = is[i_3100_];
										int i_3147_ = i_3142_ + i_3146_;
										int i_3148_ = ((i_3142_ & 0xff00ff) + (i_3146_ & 0xff00ff));
										i_3146_ = ((i_3148_ & 0x1000100) + (i_3147_ - i_3148_ & 0x10000));
										is[i_3100_] = (i_3147_ - i_3146_ | i_3146_ - (i_3146_ >>> 8));
									}
								} else if (i == 3) {
									byte i_3149_ = aByteArray11394[i_3099_];
									int i_3150_ = (i_3149_ > 0 ? anIntArray11393[i_3149_] : 0);
									int i_3151_ = anInt8944;
									int i_3152_ = i_3150_ + i_3151_;
									int i_3153_ = ((i_3150_ & 0xff00ff) + (i_3151_ & 0xff00ff));
									int i_3154_ = ((i_3153_ & 0x1000100) + (i_3152_ - i_3153_ & 0x10000));
									i_3154_ = (i_3152_ - i_3154_ | i_3154_ - (i_3154_ >>> 8));
									if (i_3150_ == 0 && anInt8965 != 255) {
										i_3150_ = i_3154_;
										i_3154_ = is[i_3100_];
										i_3154_ = (((((i_3150_ & 0xff00ff) * anInt8965) + ((i_3154_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3150_ & 0xff00) * anInt8965) + ((i_3154_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_3100_] = i_3154_;
								} else if (i == 2) {
									int i_3155_ = aByteArray11394[i_3099_];
									if (i_3155_ != 0) {
										int i_3156_ = anIntArray11393[i_3155_ & 0xff];
										int i_3157_ = ((i_3156_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_3158_ = ((i_3156_ & 0xff00) * anInt8965 & 0xff0000);
										i_3156_ = (((i_3157_ | i_3158_) >>> 8) + anInt8978);
										int i_3159_ = is[i_3100_];
										int i_3160_ = i_3156_ + i_3159_;
										int i_3161_ = ((i_3156_ & 0xff00ff) + (i_3159_ & 0xff00ff));
										i_3159_ = ((i_3161_ & 0x1000100) + (i_3160_ - i_3161_ & 0x10000));
										is[i_3100_] = (i_3160_ - i_3159_ | i_3159_ - (i_3159_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_3095_ += anInt8960;
							i_3096_ += anInt8962;
						}
						i_3093_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_3162_ = anInt8957;
				while (i_3162_ < 0) {
					int i_3163_ = anInt8959;
					int i_3164_ = anInt8966 + anInt8968;
					int i_3165_ = anInt8967;
					int i_3166_ = anInt8955;
					if (i_3165_ >= 0 && i_3165_ - (anInt8950 << 12) < 0) {
						if (i_3164_ < 0) {
							int i_3167_ = (anInt8960 - 1 - i_3164_) / anInt8960;
							i_3166_ += i_3167_;
							i_3164_ += anInt8960 * i_3167_;
							i_3163_ += i_3167_;
						}
						int i_3168_;
						if ((i_3168_ = (1 + i_3164_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_3166_)
							i_3166_ = i_3168_;
						for (/**/; i_3166_ < 0; i_3166_++) {
							int i_3169_ = ((i_3165_ >> 12) * anInt8945 + (i_3164_ >> 12));
							int i_3170_ = i_3163_++;
							if (i_2747_ == 0) {
								if (i == 1)
									is[i_3170_] = (anIntArray11393[aByteArray11394[i_3169_] & 0xff]);
								else if (i == 0) {
									int i_3171_ = (anIntArray11393[aByteArray11394[i_3169_] & 0xff]);
									int i_3172_ = ((i_3171_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_3173_ = ((i_3171_ & 0xff00) * anInt8974 & 0xff0000);
									int i_3174_ = ((i_3171_ & 0xff) * anInt8975 & 0xff00);
									is[i_3170_] = (i_3172_ | i_3173_ | i_3174_) >>> 8;
								} else if (i == 3) {
									int i_3175_ = (anIntArray11393[aByteArray11394[i_3169_] & 0xff]);
									int i_3176_ = anInt8944;
									int i_3177_ = i_3175_ + i_3176_;
									int i_3178_ = ((i_3175_ & 0xff00ff) + (i_3176_ & 0xff00ff));
									int i_3179_ = ((i_3178_ & 0x1000100) + (i_3177_ - i_3178_ & 0x10000));
									is[i_3170_] = (i_3177_ - i_3179_ | i_3179_ - (i_3179_ >>> 8));
								} else if (i == 2) {
									int i_3180_ = (anIntArray11393[aByteArray11394[i_3169_] & 0xff]);
									int i_3181_ = ((i_3180_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_3182_ = ((i_3180_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_3170_] = (((i_3181_ | i_3182_) >>> 8) + anInt8978);
								} else
									throw new IllegalArgumentException();
							} else if (i_2747_ == 1) {
								if (i == 1) {
									int i_3183_ = aByteArray11394[i_3169_];
									if (i_3183_ != 0)
										is[i_3170_] = anIntArray11393[i_3183_ & 0xff];
								} else if (i == 0) {
									int i_3184_ = aByteArray11394[i_3169_];
									if (i_3184_ != 0) {
										int i_3185_ = anIntArray11393[i_3184_ & 0xff];
										if ((anInt8944 & 0xffffff) == 16777215) {
											int i_3186_ = anInt8944 >>> 24;
											int i_3187_ = 256 - i_3186_;
											int i_3188_ = is[i_3170_];
											is[i_3170_] = (((((i_3185_ & 0xff00ff) * i_3186_) + ((i_3188_ & 0xff00ff) * i_3187_)) & ~0xff00ff) + ((((i_3185_ & 0xff00) * i_3186_) + ((i_3188_ & 0xff00) * i_3187_)) & 0xff0000)) >> 8;
										} else if (anInt8965 != 255) {
											int i_3189_ = (((i_3185_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_3190_ = (((i_3185_ & 0xff00) * anInt8974) & 0xff0000);
											int i_3191_ = ((i_3185_ & 0xff) * anInt8975 & 0xff00);
											i_3185_ = (i_3189_ | i_3190_ | i_3191_) >>> 8;
											int i_3192_ = is[i_3170_];
											is[i_3170_] = (((((i_3185_ & 0xff00ff) * anInt8965) + ((i_3192_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3185_ & 0xff00) * anInt8965) + ((i_3192_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										} else {
											int i_3193_ = (((i_3185_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_3194_ = (((i_3185_ & 0xff00) * anInt8974) & 0xff0000);
											int i_3195_ = ((i_3185_ & 0xff) * anInt8975 & 0xff00);
											is[i_3170_] = (i_3193_ | i_3194_ | i_3195_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_3196_ = aByteArray11394[i_3169_];
									int i_3197_ = (i_3196_ > 0 ? anIntArray11393[i_3196_] : 0);
									int i_3198_ = anInt8944;
									int i_3199_ = i_3197_ + i_3198_;
									int i_3200_ = ((i_3197_ & 0xff00ff) + (i_3198_ & 0xff00ff));
									int i_3201_ = ((i_3200_ & 0x1000100) + (i_3199_ - i_3200_ & 0x10000));
									i_3201_ = (i_3199_ - i_3201_ | i_3201_ - (i_3201_ >>> 8));
									if (i_3197_ == 0 && anInt8965 != 255) {
										i_3197_ = i_3201_;
										i_3201_ = is[i_3170_];
										i_3201_ = (((((i_3197_ & 0xff00ff) * anInt8965) + ((i_3201_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3197_ & 0xff00) * anInt8965) + ((i_3201_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_3170_] = i_3201_;
								} else if (i == 2) {
									int i_3202_ = aByteArray11394[i_3169_];
									if (i_3202_ != 0) {
										int i_3203_ = anIntArray11393[i_3202_ & 0xff];
										int i_3204_ = ((i_3203_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_3205_ = ((i_3203_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_3170_++] = ((i_3204_ | i_3205_) >>> 8) + anInt8978;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2747_ == 2) {
								if (i == 1) {
									int i_3206_ = aByteArray11394[i_3169_];
									if (i_3206_ != 0) {
										int i_3207_ = anIntArray11393[i_3206_ & 0xff];
										int i_3208_ = is[i_3170_];
										int i_3209_ = i_3207_ + i_3208_;
										int i_3210_ = ((i_3207_ & 0xff00ff) + (i_3208_ & 0xff00ff));
										i_3208_ = ((i_3210_ & 0x1000100) + (i_3209_ - i_3210_ & 0x10000));
										is[i_3170_] = (i_3209_ - i_3208_ | i_3208_ - (i_3208_ >>> 8));
									}
								} else if (i == 0) {
									int i_3211_ = aByteArray11394[i_3169_];
									if (i_3211_ != 0) {
										int i_3212_ = anIntArray11393[i_3211_ & 0xff];
										int i_3213_ = ((i_3212_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_3214_ = ((i_3212_ & 0xff00) * anInt8974 & 0xff0000);
										int i_3215_ = ((i_3212_ & 0xff) * anInt8975 & 0xff00);
										i_3212_ = (i_3213_ | i_3214_ | i_3215_) >>> 8;
										int i_3216_ = is[i_3170_];
										int i_3217_ = i_3212_ + i_3216_;
										int i_3218_ = ((i_3212_ & 0xff00ff) + (i_3216_ & 0xff00ff));
										i_3216_ = ((i_3218_ & 0x1000100) + (i_3217_ - i_3218_ & 0x10000));
										is[i_3170_] = (i_3217_ - i_3216_ | i_3216_ - (i_3216_ >>> 8));
									}
								} else if (i == 3) {
									byte i_3219_ = aByteArray11394[i_3169_];
									int i_3220_ = (i_3219_ > 0 ? anIntArray11393[i_3219_] : 0);
									int i_3221_ = anInt8944;
									int i_3222_ = i_3220_ + i_3221_;
									int i_3223_ = ((i_3220_ & 0xff00ff) + (i_3221_ & 0xff00ff));
									int i_3224_ = ((i_3223_ & 0x1000100) + (i_3222_ - i_3223_ & 0x10000));
									i_3224_ = (i_3222_ - i_3224_ | i_3224_ - (i_3224_ >>> 8));
									if (i_3220_ == 0 && anInt8965 != 255) {
										i_3220_ = i_3224_;
										i_3224_ = is[i_3170_];
										i_3224_ = (((((i_3220_ & 0xff00ff) * anInt8965) + ((i_3224_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3220_ & 0xff00) * anInt8965) + ((i_3224_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_3170_] = i_3224_;
								} else if (i == 2) {
									int i_3225_ = aByteArray11394[i_3169_];
									if (i_3225_ != 0) {
										int i_3226_ = anIntArray11393[i_3225_ & 0xff];
										int i_3227_ = ((i_3226_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_3228_ = ((i_3226_ & 0xff00) * anInt8965 & 0xff0000);
										i_3226_ = (((i_3227_ | i_3228_) >>> 8) + anInt8978);
										int i_3229_ = is[i_3170_];
										int i_3230_ = i_3226_ + i_3229_;
										int i_3231_ = ((i_3226_ & 0xff00ff) + (i_3229_ & 0xff00ff));
										i_3229_ = ((i_3231_ & 0x1000100) + (i_3230_ - i_3231_ & 0x10000));
										is[i_3170_] = (i_3230_ - i_3229_ | i_3229_ - (i_3229_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_3164_ += anInt8960;
						}
					}
					i_3162_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				for (int i_3232_ = anInt8957; i_3232_ < 0; i_3232_++) {
					int i_3233_ = anInt8959;
					int i_3234_ = anInt8966 + anInt8968;
					int i_3235_ = anInt8967 + anInt8969;
					int i_3236_ = anInt8955;
					if (i_3234_ < 0) {
						int i_3237_ = (anInt8960 - 1 - i_3234_) / anInt8960;
						i_3236_ += i_3237_;
						i_3234_ += anInt8960 * i_3237_;
						i_3235_ += anInt8962 * i_3237_;
						i_3233_ += i_3237_;
					}
					int i_3238_;
					if ((i_3238_ = (1 + i_3234_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_3236_)
						i_3236_ = i_3238_;
					if ((i_3238_ = i_3235_ - (anInt8950 << 12)) >= 0) {
						i_3238_ = (anInt8962 - i_3238_) / anInt8962;
						i_3236_ += i_3238_;
						i_3234_ += anInt8960 * i_3238_;
						i_3235_ += anInt8962 * i_3238_;
						i_3233_ += i_3238_;
					}
					if ((i_3238_ = (i_3235_ - anInt8962) / anInt8962) > i_3236_)
						i_3236_ = i_3238_;
					for (/**/; i_3236_ < 0; i_3236_++) {
						int i_3239_ = (i_3235_ >> 12) * anInt8945 + (i_3234_ >> 12);
						int i_3240_ = i_3233_++;
						if (i_2747_ == 0) {
							if (i == 1)
								is[i_3240_] = (anIntArray11393[aByteArray11394[i_3239_] & 0xff]);
							else if (i == 0) {
								int i_3241_ = (anIntArray11393[aByteArray11394[i_3239_] & 0xff]);
								int i_3242_ = ((i_3241_ & 0xff0000) * anInt8973 & ~0xffffff);
								int i_3243_ = ((i_3241_ & 0xff00) * anInt8974 & 0xff0000);
								int i_3244_ = (i_3241_ & 0xff) * anInt8975 & 0xff00;
								is[i_3240_] = (i_3242_ | i_3243_ | i_3244_) >>> 8;
							} else if (i == 3) {
								int i_3245_ = (anIntArray11393[aByteArray11394[i_3239_] & 0xff]);
								int i_3246_ = anInt8944;
								int i_3247_ = i_3245_ + i_3246_;
								int i_3248_ = ((i_3245_ & 0xff00ff) + (i_3246_ & 0xff00ff));
								int i_3249_ = ((i_3248_ & 0x1000100) + (i_3247_ - i_3248_ & 0x10000));
								is[i_3240_] = i_3247_ - i_3249_ | i_3249_ - (i_3249_ >>> 8);
							} else if (i == 2) {
								int i_3250_ = (anIntArray11393[aByteArray11394[i_3239_] & 0xff]);
								int i_3251_ = ((i_3250_ & 0xff00ff) * anInt8965 & ~0xff00ff);
								int i_3252_ = ((i_3250_ & 0xff00) * anInt8965 & 0xff0000);
								is[i_3240_] = ((i_3251_ | i_3252_) >>> 8) + anInt8978;
							} else
								throw new IllegalArgumentException();
						} else if (i_2747_ == 1) {
							if (i == 1) {
								int i_3253_ = aByteArray11394[i_3239_];
								if (i_3253_ != 0)
									is[i_3240_] = anIntArray11393[i_3253_ & 0xff];
							} else if (i == 0) {
								int i_3254_ = aByteArray11394[i_3239_];
								if (i_3254_ != 0) {
									int i_3255_ = anIntArray11393[i_3254_ & 0xff];
									if ((anInt8944 & 0xffffff) == 16777215) {
										int i_3256_ = anInt8944 >>> 24;
										int i_3257_ = 256 - i_3256_;
										int i_3258_ = is[i_3240_];
										is[i_3240_] = ((((i_3255_ & 0xff00ff) * i_3256_ + ((i_3258_ & 0xff00ff) * i_3257_)) & ~0xff00ff) + (((i_3255_ & 0xff00) * i_3256_ + ((i_3258_ & 0xff00) * i_3257_)) & 0xff0000)) >> 8;
									} else if (anInt8965 != 255) {
										int i_3259_ = ((i_3255_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_3260_ = ((i_3255_ & 0xff00) * anInt8974 & 0xff0000);
										int i_3261_ = ((i_3255_ & 0xff) * anInt8975 & 0xff00);
										i_3255_ = (i_3259_ | i_3260_ | i_3261_) >>> 8;
										int i_3262_ = is[i_3240_];
										is[i_3240_] = (((((i_3255_ & 0xff00ff) * anInt8965) + ((i_3262_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3255_ & 0xff00) * anInt8965) + ((i_3262_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									} else {
										int i_3263_ = ((i_3255_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_3264_ = ((i_3255_ & 0xff00) * anInt8974 & 0xff0000);
										int i_3265_ = ((i_3255_ & 0xff) * anInt8975 & 0xff00);
										is[i_3240_] = (i_3263_ | i_3264_ | i_3265_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_3266_ = aByteArray11394[i_3239_];
								int i_3267_ = (i_3266_ > 0 ? anIntArray11393[i_3266_] : 0);
								int i_3268_ = anInt8944;
								int i_3269_ = i_3267_ + i_3268_;
								int i_3270_ = ((i_3267_ & 0xff00ff) + (i_3268_ & 0xff00ff));
								int i_3271_ = ((i_3270_ & 0x1000100) + (i_3269_ - i_3270_ & 0x10000));
								i_3271_ = i_3269_ - i_3271_ | i_3271_ - (i_3271_ >>> 8);
								if (i_3267_ == 0 && anInt8965 != 255) {
									i_3267_ = i_3271_;
									i_3271_ = is[i_3240_];
									i_3271_ = ((((i_3267_ & 0xff00ff) * anInt8965 + ((i_3271_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + (((i_3267_ & 0xff00) * anInt8965 + ((i_3271_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
								}
								is[i_3240_] = i_3271_;
							} else if (i == 2) {
								int i_3272_ = aByteArray11394[i_3239_];
								if (i_3272_ != 0) {
									int i_3273_ = anIntArray11393[i_3272_ & 0xff];
									int i_3274_ = ((i_3273_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_3275_ = ((i_3273_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_3240_++] = ((i_3274_ | i_3275_) >>> 8) + anInt8978;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_2747_ == 2) {
							if (i == 1) {
								int i_3276_ = aByteArray11394[i_3239_];
								if (i_3276_ != 0) {
									int i_3277_ = anIntArray11393[i_3276_ & 0xff];
									int i_3278_ = is[i_3240_];
									int i_3279_ = i_3277_ + i_3278_;
									int i_3280_ = ((i_3277_ & 0xff00ff) + (i_3278_ & 0xff00ff));
									i_3278_ = ((i_3280_ & 0x1000100) + (i_3279_ - i_3280_ & 0x10000));
									is[i_3240_] = (i_3279_ - i_3278_ | i_3278_ - (i_3278_ >>> 8));
								}
							} else if (i == 0) {
								int i_3281_ = aByteArray11394[i_3239_];
								if (i_3281_ != 0) {
									int i_3282_ = anIntArray11393[i_3281_ & 0xff];
									int i_3283_ = ((i_3282_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_3284_ = ((i_3282_ & 0xff00) * anInt8974 & 0xff0000);
									int i_3285_ = ((i_3282_ & 0xff) * anInt8975 & 0xff00);
									i_3282_ = (i_3283_ | i_3284_ | i_3285_) >>> 8;
									int i_3286_ = is[i_3240_];
									int i_3287_ = i_3282_ + i_3286_;
									int i_3288_ = ((i_3282_ & 0xff00ff) + (i_3286_ & 0xff00ff));
									i_3286_ = ((i_3288_ & 0x1000100) + (i_3287_ - i_3288_ & 0x10000));
									is[i_3240_] = (i_3287_ - i_3286_ | i_3286_ - (i_3286_ >>> 8));
								}
							} else if (i == 3) {
								byte i_3289_ = aByteArray11394[i_3239_];
								int i_3290_ = (i_3289_ > 0 ? anIntArray11393[i_3289_] : 0);
								int i_3291_ = anInt8944;
								int i_3292_ = i_3290_ + i_3291_;
								int i_3293_ = ((i_3290_ & 0xff00ff) + (i_3291_ & 0xff00ff));
								int i_3294_ = ((i_3293_ & 0x1000100) + (i_3292_ - i_3293_ & 0x10000));
								i_3294_ = i_3292_ - i_3294_ | i_3294_ - (i_3294_ >>> 8);
								if (i_3290_ == 0 && anInt8965 != 255) {
									i_3290_ = i_3294_;
									i_3294_ = is[i_3240_];
									i_3294_ = ((((i_3290_ & 0xff00ff) * anInt8965 + ((i_3294_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + (((i_3290_ & 0xff00) * anInt8965 + ((i_3294_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
								}
								is[i_3240_] = i_3294_;
							} else if (i == 2) {
								int i_3295_ = aByteArray11394[i_3239_];
								if (i_3295_ != 0) {
									int i_3296_ = anIntArray11393[i_3295_ & 0xff];
									int i_3297_ = ((i_3296_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_3298_ = ((i_3296_ & 0xff00) * anInt8965 & 0xff0000);
									i_3296_ = (((i_3297_ | i_3298_) >>> 8) + anInt8978);
									int i_3299_ = is[i_3240_];
									int i_3300_ = i_3296_ + i_3299_;
									int i_3301_ = ((i_3296_ & 0xff00ff) + (i_3299_ & 0xff00ff));
									i_3299_ = ((i_3301_ & 0x1000100) + (i_3300_ - i_3301_ & 0x10000));
									is[i_3240_] = (i_3300_ - i_3299_ | i_3299_ - (i_3299_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_3234_ += anInt8960;
						i_3235_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				for (int i_3302_ = anInt8957; i_3302_ < 0; i_3302_++) {
					int i_3303_ = anInt8959;
					int i_3304_ = anInt8966 + anInt8968;
					int i_3305_ = anInt8967 + anInt8969;
					int i_3306_ = anInt8955;
					if (i_3304_ < 0) {
						int i_3307_ = (anInt8960 - 1 - i_3304_) / anInt8960;
						i_3306_ += i_3307_;
						i_3304_ += anInt8960 * i_3307_;
						i_3305_ += anInt8962 * i_3307_;
						i_3303_ += i_3307_;
					}
					int i_3308_;
					if ((i_3308_ = (1 + i_3304_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_3306_)
						i_3306_ = i_3308_;
					if (i_3305_ < 0) {
						i_3308_ = (anInt8962 - 1 - i_3305_) / anInt8962;
						i_3306_ += i_3308_;
						i_3304_ += anInt8960 * i_3308_;
						i_3305_ += anInt8962 * i_3308_;
						i_3303_ += i_3308_;
					}
					if ((i_3308_ = (1 + i_3305_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_3306_)
						i_3306_ = i_3308_;
					for (/**/; i_3306_ < 0; i_3306_++) {
						int i_3309_ = (i_3305_ >> 12) * anInt8945 + (i_3304_ >> 12);
						int i_3310_ = i_3303_++;
						if (i_2747_ == 0) {
							if (i == 1)
								is[i_3310_] = (anIntArray11393[aByteArray11394[i_3309_] & 0xff]);
							else if (i == 0) {
								int i_3311_ = (anIntArray11393[aByteArray11394[i_3309_] & 0xff]);
								int i_3312_ = ((i_3311_ & 0xff0000) * anInt8973 & ~0xffffff);
								int i_3313_ = ((i_3311_ & 0xff00) * anInt8974 & 0xff0000);
								int i_3314_ = (i_3311_ & 0xff) * anInt8975 & 0xff00;
								is[i_3310_] = (i_3312_ | i_3313_ | i_3314_) >>> 8;
							} else if (i == 3) {
								int i_3315_ = (anIntArray11393[aByteArray11394[i_3309_] & 0xff]);
								int i_3316_ = anInt8944;
								int i_3317_ = i_3315_ + i_3316_;
								int i_3318_ = ((i_3315_ & 0xff00ff) + (i_3316_ & 0xff00ff));
								int i_3319_ = ((i_3318_ & 0x1000100) + (i_3317_ - i_3318_ & 0x10000));
								is[i_3310_] = i_3317_ - i_3319_ | i_3319_ - (i_3319_ >>> 8);
							} else if (i == 2) {
								int i_3320_ = (anIntArray11393[aByteArray11394[i_3309_] & 0xff]);
								int i_3321_ = ((i_3320_ & 0xff00ff) * anInt8965 & ~0xff00ff);
								int i_3322_ = ((i_3320_ & 0xff00) * anInt8965 & 0xff0000);
								is[i_3310_] = ((i_3321_ | i_3322_) >>> 8) + anInt8978;
							} else
								throw new IllegalArgumentException();
						} else if (i_2747_ == 1) {
							if (i == 1) {
								int i_3323_ = aByteArray11394[i_3309_];
								if (i_3323_ != 0)
									is[i_3310_] = anIntArray11393[i_3323_ & 0xff];
							} else if (i == 0) {
								int i_3324_ = aByteArray11394[i_3309_];
								if (i_3324_ != 0) {
									int i_3325_ = anIntArray11393[i_3324_ & 0xff];
									if ((anInt8944 & 0xffffff) == 16777215) {
										int i_3326_ = anInt8944 >>> 24;
										int i_3327_ = 256 - i_3326_;
										int i_3328_ = is[i_3310_];
										is[i_3310_] = ((((i_3325_ & 0xff00ff) * i_3326_ + ((i_3328_ & 0xff00ff) * i_3327_)) & ~0xff00ff) + (((i_3325_ & 0xff00) * i_3326_ + ((i_3328_ & 0xff00) * i_3327_)) & 0xff0000)) >> 8;
									} else if (anInt8965 != 255) {
										int i_3329_ = ((i_3325_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_3330_ = ((i_3325_ & 0xff00) * anInt8974 & 0xff0000);
										int i_3331_ = ((i_3325_ & 0xff) * anInt8975 & 0xff00);
										i_3325_ = (i_3329_ | i_3330_ | i_3331_) >>> 8;
										int i_3332_ = is[i_3310_];
										is[i_3310_] = (((((i_3325_ & 0xff00ff) * anInt8965) + ((i_3332_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3325_ & 0xff00) * anInt8965) + ((i_3332_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									} else {
										int i_3333_ = ((i_3325_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_3334_ = ((i_3325_ & 0xff00) * anInt8974 & 0xff0000);
										int i_3335_ = ((i_3325_ & 0xff) * anInt8975 & 0xff00);
										is[i_3310_] = (i_3333_ | i_3334_ | i_3335_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_3336_ = aByteArray11394[i_3309_];
								int i_3337_ = (i_3336_ > 0 ? anIntArray11393[i_3336_] : 0);
								int i_3338_ = anInt8944;
								int i_3339_ = i_3337_ + i_3338_;
								int i_3340_ = ((i_3337_ & 0xff00ff) + (i_3338_ & 0xff00ff));
								int i_3341_ = ((i_3340_ & 0x1000100) + (i_3339_ - i_3340_ & 0x10000));
								i_3341_ = i_3339_ - i_3341_ | i_3341_ - (i_3341_ >>> 8);
								if (i_3337_ == 0 && anInt8965 != 255) {
									i_3337_ = i_3341_;
									i_3341_ = is[i_3310_];
									i_3341_ = ((((i_3337_ & 0xff00ff) * anInt8965 + ((i_3341_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + (((i_3337_ & 0xff00) * anInt8965 + ((i_3341_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
								}
								is[i_3310_] = i_3341_;
							} else if (i == 2) {
								int i_3342_ = aByteArray11394[i_3309_];
								if (i_3342_ != 0) {
									int i_3343_ = anIntArray11393[i_3342_ & 0xff];
									int i_3344_ = ((i_3343_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_3345_ = ((i_3343_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_3310_++] = ((i_3344_ | i_3345_) >>> 8) + anInt8978;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_2747_ == 2) {
							if (i == 1) {
								int i_3346_ = aByteArray11394[i_3309_];
								if (i_3346_ != 0) {
									int i_3347_ = anIntArray11393[i_3346_ & 0xff];
									int i_3348_ = is[i_3310_];
									int i_3349_ = i_3347_ + i_3348_;
									int i_3350_ = ((i_3347_ & 0xff00ff) + (i_3348_ & 0xff00ff));
									i_3348_ = ((i_3350_ & 0x1000100) + (i_3349_ - i_3350_ & 0x10000));
									is[i_3310_] = (i_3349_ - i_3348_ | i_3348_ - (i_3348_ >>> 8));
								}
							} else if (i == 0) {
								int i_3351_ = aByteArray11394[i_3309_];
								if (i_3351_ != 0) {
									int i_3352_ = anIntArray11393[i_3351_ & 0xff];
									int i_3353_ = ((i_3352_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_3354_ = ((i_3352_ & 0xff00) * anInt8974 & 0xff0000);
									int i_3355_ = ((i_3352_ & 0xff) * anInt8975 & 0xff00);
									i_3352_ = (i_3353_ | i_3354_ | i_3355_) >>> 8;
									int i_3356_ = is[i_3310_];
									int i_3357_ = i_3352_ + i_3356_;
									int i_3358_ = ((i_3352_ & 0xff00ff) + (i_3356_ & 0xff00ff));
									i_3356_ = ((i_3358_ & 0x1000100) + (i_3357_ - i_3358_ & 0x10000));
									is[i_3310_] = (i_3357_ - i_3356_ | i_3356_ - (i_3356_ >>> 8));
								}
							} else if (i == 3) {
								byte i_3359_ = aByteArray11394[i_3309_];
								int i_3360_ = (i_3359_ > 0 ? anIntArray11393[i_3359_] : 0);
								int i_3361_ = anInt8944;
								int i_3362_ = i_3360_ + i_3361_;
								int i_3363_ = ((i_3360_ & 0xff00ff) + (i_3361_ & 0xff00ff));
								int i_3364_ = ((i_3363_ & 0x1000100) + (i_3362_ - i_3363_ & 0x10000));
								i_3364_ = i_3362_ - i_3364_ | i_3364_ - (i_3364_ >>> 8);
								if (i_3360_ == 0 && anInt8965 != 255) {
									i_3360_ = i_3364_;
									i_3364_ = is[i_3310_];
									i_3364_ = ((((i_3360_ & 0xff00ff) * anInt8965 + ((i_3364_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + (((i_3360_ & 0xff00) * anInt8965 + ((i_3364_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
								}
								is[i_3310_] = i_3364_;
							} else if (i == 2) {
								int i_3365_ = aByteArray11394[i_3309_];
								if (i_3365_ != 0) {
									int i_3366_ = anIntArray11393[i_3365_ & 0xff];
									int i_3367_ = ((i_3366_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_3368_ = ((i_3366_ & 0xff00) * anInt8965 & 0xff0000);
									i_3366_ = (((i_3367_ | i_3368_) >>> 8) + anInt8978);
									int i_3369_ = is[i_3310_];
									int i_3370_ = i_3366_ + i_3369_;
									int i_3371_ = ((i_3366_ & 0xff00ff) + (i_3369_ & 0xff00ff));
									i_3369_ = ((i_3371_ & 0x1000100) + (i_3370_ - i_3371_ & 0x10000));
									is[i_3310_] = (i_3370_ - i_3369_ | i_3369_ - (i_3369_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_3304_ += anInt8960;
						i_3305_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	void method8434(int i, int i_3372_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_3373_ = anInt8957;
					while (i_3373_ < 0) {
						int i_3374_ = anInt8959;
						int i_3375_ = anInt8966;
						int i_3376_ = anInt8967;
						int i_3377_ = anInt8955;
						if (i_3375_ >= 0 && i_3376_ >= 0 && i_3375_ - (anInt8945 << 12) < 0 && i_3376_ - (anInt8950 << 12) < 0) {
							for (/**/; i_3377_ < 0; i_3377_++) {
								int i_3378_ = ((i_3376_ >> 12) * anInt8945 + (i_3375_ >> 12));
								int i_3379_ = i_3374_++;
								if (i_3372_ == 0) {
									if (i == 1)
										is[i_3379_] = (anIntArray11393[(aByteArray11394[i_3378_] & 0xff)]);
									else if (i == 0) {
										int i_3380_ = (anIntArray11393[(aByteArray11394[i_3378_] & 0xff)]);
										int i_3381_ = ((i_3380_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_3382_ = ((i_3380_ & 0xff00) * anInt8974 & 0xff0000);
										int i_3383_ = ((i_3380_ & 0xff) * anInt8975 & 0xff00);
										is[i_3379_] = (i_3381_ | i_3382_ | i_3383_) >>> 8;
									} else if (i == 3) {
										int i_3384_ = (anIntArray11393[(aByteArray11394[i_3378_] & 0xff)]);
										int i_3385_ = anInt8944;
										int i_3386_ = i_3384_ + i_3385_;
										int i_3387_ = ((i_3384_ & 0xff00ff) + (i_3385_ & 0xff00ff));
										int i_3388_ = ((i_3387_ & 0x1000100) + (i_3386_ - i_3387_ & 0x10000));
										is[i_3379_] = (i_3386_ - i_3388_ | i_3388_ - (i_3388_ >>> 8));
									} else if (i == 2) {
										int i_3389_ = (anIntArray11393[(aByteArray11394[i_3378_] & 0xff)]);
										int i_3390_ = ((i_3389_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_3391_ = ((i_3389_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_3379_] = ((i_3390_ | i_3391_) >>> 8) + anInt8978;
									} else
										throw new IllegalArgumentException();
								} else if (i_3372_ == 1) {
									if (i == 1) {
										int i_3392_ = aByteArray11394[i_3378_];
										if (i_3392_ != 0)
											is[i_3379_] = (anIntArray11393[i_3392_ & 0xff]);
									} else if (i == 0) {
										int i_3393_ = aByteArray11394[i_3378_];
										if (i_3393_ != 0) {
											int i_3394_ = (anIntArray11393[i_3393_ & 0xff]);
											if ((anInt8944 & 0xffffff) == 16777215) {
												int i_3395_ = anInt8944 >>> 24;
												int i_3396_ = 256 - i_3395_;
												int i_3397_ = is[i_3379_];
												is[i_3379_] = (((((i_3394_ & 0xff00ff) * i_3395_) + ((i_3397_ & 0xff00ff) * i_3396_)) & ~0xff00ff) + ((((i_3394_ & 0xff00) * i_3395_) + ((i_3397_ & 0xff00) * i_3396_)) & 0xff0000)) >> 8;
											} else if (anInt8965 != 255) {
												int i_3398_ = (((i_3394_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_3399_ = (((i_3394_ & 0xff00) * anInt8974) & 0xff0000);
												int i_3400_ = (((i_3394_ & 0xff) * anInt8975) & 0xff00);
												i_3394_ = (i_3398_ | i_3399_ | i_3400_) >>> 8;
												int i_3401_ = is[i_3379_];
												is[i_3379_] = (((((i_3394_ & 0xff00ff) * anInt8965) + ((i_3401_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3394_ & 0xff00) * anInt8965) + ((i_3401_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
											} else {
												int i_3402_ = (((i_3394_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_3403_ = (((i_3394_ & 0xff00) * anInt8974) & 0xff0000);
												int i_3404_ = (((i_3394_ & 0xff) * anInt8975) & 0xff00);
												is[i_3379_] = (i_3402_ | i_3403_ | i_3404_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_3405_ = aByteArray11394[i_3378_];
										int i_3406_ = (i_3405_ > 0 ? anIntArray11393[i_3405_] : 0);
										int i_3407_ = anInt8944;
										int i_3408_ = i_3406_ + i_3407_;
										int i_3409_ = ((i_3406_ & 0xff00ff) + (i_3407_ & 0xff00ff));
										int i_3410_ = ((i_3409_ & 0x1000100) + (i_3408_ - i_3409_ & 0x10000));
										i_3410_ = (i_3408_ - i_3410_ | i_3410_ - (i_3410_ >>> 8));
										if (i_3406_ == 0 && anInt8965 != 255) {
											i_3406_ = i_3410_;
											i_3410_ = is[i_3379_];
											i_3410_ = (((((i_3406_ & 0xff00ff) * anInt8965) + ((i_3410_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3406_ & 0xff00) * anInt8965) + ((i_3410_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_3379_] = i_3410_;
									} else if (i == 2) {
										int i_3411_ = aByteArray11394[i_3378_];
										if (i_3411_ != 0) {
											int i_3412_ = (anIntArray11393[i_3411_ & 0xff]);
											int i_3413_ = (((i_3412_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_3414_ = (((i_3412_ & 0xff00) * anInt8965) & 0xff0000);
											is[i_3379_++] = (((i_3413_ | i_3414_) >>> 8) + anInt8978);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_3372_ == 2) {
									if (i == 1) {
										int i_3415_ = aByteArray11394[i_3378_];
										if (i_3415_ != 0) {
											int i_3416_ = (anIntArray11393[i_3415_ & 0xff]);
											int i_3417_ = is[i_3379_];
											int i_3418_ = i_3416_ + i_3417_;
											int i_3419_ = ((i_3416_ & 0xff00ff) + (i_3417_ & 0xff00ff));
											i_3417_ = ((i_3419_ & 0x1000100) + (i_3418_ - i_3419_ & 0x10000));
											is[i_3379_] = (i_3418_ - i_3417_ | i_3417_ - (i_3417_ >>> 8));
										}
									} else if (i == 0) {
										int i_3420_ = aByteArray11394[i_3378_];
										if (i_3420_ != 0) {
											int i_3421_ = (anIntArray11393[i_3420_ & 0xff]);
											int i_3422_ = (((i_3421_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_3423_ = (((i_3421_ & 0xff00) * anInt8974) & 0xff0000);
											int i_3424_ = ((i_3421_ & 0xff) * anInt8975 & 0xff00);
											i_3421_ = (i_3422_ | i_3423_ | i_3424_) >>> 8;
											int i_3425_ = is[i_3379_];
											int i_3426_ = i_3421_ + i_3425_;
											int i_3427_ = ((i_3421_ & 0xff00ff) + (i_3425_ & 0xff00ff));
											i_3425_ = ((i_3427_ & 0x1000100) + (i_3426_ - i_3427_ & 0x10000));
											is[i_3379_] = (i_3426_ - i_3425_ | i_3425_ - (i_3425_ >>> 8));
										}
									} else if (i == 3) {
										byte i_3428_ = aByteArray11394[i_3378_];
										int i_3429_ = (i_3428_ > 0 ? anIntArray11393[i_3428_] : 0);
										int i_3430_ = anInt8944;
										int i_3431_ = i_3429_ + i_3430_;
										int i_3432_ = ((i_3429_ & 0xff00ff) + (i_3430_ & 0xff00ff));
										int i_3433_ = ((i_3432_ & 0x1000100) + (i_3431_ - i_3432_ & 0x10000));
										i_3433_ = (i_3431_ - i_3433_ | i_3433_ - (i_3433_ >>> 8));
										if (i_3429_ == 0 && anInt8965 != 255) {
											i_3429_ = i_3433_;
											i_3433_ = is[i_3379_];
											i_3433_ = (((((i_3429_ & 0xff00ff) * anInt8965) + ((i_3433_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3429_ & 0xff00) * anInt8965) + ((i_3433_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_3379_] = i_3433_;
									} else if (i == 2) {
										int i_3434_ = aByteArray11394[i_3378_];
										if (i_3434_ != 0) {
											int i_3435_ = (anIntArray11393[i_3434_ & 0xff]);
											int i_3436_ = (((i_3435_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_3437_ = (((i_3435_ & 0xff00) * anInt8965) & 0xff0000);
											i_3435_ = ((i_3436_ | i_3437_) >>> 8) + anInt8978;
											int i_3438_ = is[i_3379_];
											int i_3439_ = i_3435_ + i_3438_;
											int i_3440_ = ((i_3435_ & 0xff00ff) + (i_3438_ & 0xff00ff));
											i_3438_ = ((i_3440_ & 0x1000100) + (i_3439_ - i_3440_ & 0x10000));
											is[i_3379_] = (i_3439_ - i_3438_ | i_3438_ - (i_3438_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_3373_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_3441_ = anInt8957;
					while (i_3441_ < 0) {
						int i_3442_ = anInt8959;
						int i_3443_ = anInt8966;
						int i_3444_ = anInt8967 + anInt8969;
						int i_3445_ = anInt8955;
						if (i_3443_ >= 0 && i_3443_ - (anInt8945 << 12) < 0) {
							int i_3446_;
							if ((i_3446_ = i_3444_ - (anInt8950 << 12)) >= 0) {
								i_3446_ = (anInt8962 - i_3446_) / anInt8962;
								i_3445_ += i_3446_;
								i_3444_ += anInt8962 * i_3446_;
								i_3442_ += i_3446_;
							}
							if ((i_3446_ = (i_3444_ - anInt8962) / anInt8962) > i_3445_)
								i_3445_ = i_3446_;
							for (/**/; i_3445_ < 0; i_3445_++) {
								int i_3447_ = ((i_3444_ >> 12) * anInt8945 + (i_3443_ >> 12));
								int i_3448_ = i_3442_++;
								if (i_3372_ == 0) {
									if (i == 1)
										is[i_3448_] = (anIntArray11393[(aByteArray11394[i_3447_] & 0xff)]);
									else if (i == 0) {
										int i_3449_ = (anIntArray11393[(aByteArray11394[i_3447_] & 0xff)]);
										int i_3450_ = ((i_3449_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_3451_ = ((i_3449_ & 0xff00) * anInt8974 & 0xff0000);
										int i_3452_ = ((i_3449_ & 0xff) * anInt8975 & 0xff00);
										is[i_3448_] = (i_3450_ | i_3451_ | i_3452_) >>> 8;
									} else if (i == 3) {
										int i_3453_ = (anIntArray11393[(aByteArray11394[i_3447_] & 0xff)]);
										int i_3454_ = anInt8944;
										int i_3455_ = i_3453_ + i_3454_;
										int i_3456_ = ((i_3453_ & 0xff00ff) + (i_3454_ & 0xff00ff));
										int i_3457_ = ((i_3456_ & 0x1000100) + (i_3455_ - i_3456_ & 0x10000));
										is[i_3448_] = (i_3455_ - i_3457_ | i_3457_ - (i_3457_ >>> 8));
									} else if (i == 2) {
										int i_3458_ = (anIntArray11393[(aByteArray11394[i_3447_] & 0xff)]);
										int i_3459_ = ((i_3458_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_3460_ = ((i_3458_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_3448_] = ((i_3459_ | i_3460_) >>> 8) + anInt8978;
									} else
										throw new IllegalArgumentException();
								} else if (i_3372_ == 1) {
									if (i == 1) {
										int i_3461_ = aByteArray11394[i_3447_];
										if (i_3461_ != 0)
											is[i_3448_] = (anIntArray11393[i_3461_ & 0xff]);
									} else if (i == 0) {
										int i_3462_ = aByteArray11394[i_3447_];
										if (i_3462_ != 0) {
											int i_3463_ = (anIntArray11393[i_3462_ & 0xff]);
											if ((anInt8944 & 0xffffff) == 16777215) {
												int i_3464_ = anInt8944 >>> 24;
												int i_3465_ = 256 - i_3464_;
												int i_3466_ = is[i_3448_];
												is[i_3448_] = (((((i_3463_ & 0xff00ff) * i_3464_) + ((i_3466_ & 0xff00ff) * i_3465_)) & ~0xff00ff) + ((((i_3463_ & 0xff00) * i_3464_) + ((i_3466_ & 0xff00) * i_3465_)) & 0xff0000)) >> 8;
											} else if (anInt8965 != 255) {
												int i_3467_ = (((i_3463_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_3468_ = (((i_3463_ & 0xff00) * anInt8974) & 0xff0000);
												int i_3469_ = (((i_3463_ & 0xff) * anInt8975) & 0xff00);
												i_3463_ = (i_3467_ | i_3468_ | i_3469_) >>> 8;
												int i_3470_ = is[i_3448_];
												is[i_3448_] = (((((i_3463_ & 0xff00ff) * anInt8965) + ((i_3470_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3463_ & 0xff00) * anInt8965) + ((i_3470_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
											} else {
												int i_3471_ = (((i_3463_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_3472_ = (((i_3463_ & 0xff00) * anInt8974) & 0xff0000);
												int i_3473_ = (((i_3463_ & 0xff) * anInt8975) & 0xff00);
												is[i_3448_] = (i_3471_ | i_3472_ | i_3473_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_3474_ = aByteArray11394[i_3447_];
										int i_3475_ = (i_3474_ > 0 ? anIntArray11393[i_3474_] : 0);
										int i_3476_ = anInt8944;
										int i_3477_ = i_3475_ + i_3476_;
										int i_3478_ = ((i_3475_ & 0xff00ff) + (i_3476_ & 0xff00ff));
										int i_3479_ = ((i_3478_ & 0x1000100) + (i_3477_ - i_3478_ & 0x10000));
										i_3479_ = (i_3477_ - i_3479_ | i_3479_ - (i_3479_ >>> 8));
										if (i_3475_ == 0 && anInt8965 != 255) {
											i_3475_ = i_3479_;
											i_3479_ = is[i_3448_];
											i_3479_ = (((((i_3475_ & 0xff00ff) * anInt8965) + ((i_3479_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3475_ & 0xff00) * anInt8965) + ((i_3479_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_3448_] = i_3479_;
									} else if (i == 2) {
										int i_3480_ = aByteArray11394[i_3447_];
										if (i_3480_ != 0) {
											int i_3481_ = (anIntArray11393[i_3480_ & 0xff]);
											int i_3482_ = (((i_3481_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_3483_ = (((i_3481_ & 0xff00) * anInt8965) & 0xff0000);
											is[i_3448_++] = (((i_3482_ | i_3483_) >>> 8) + anInt8978);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_3372_ == 2) {
									if (i == 1) {
										int i_3484_ = aByteArray11394[i_3447_];
										if (i_3484_ != 0) {
											int i_3485_ = (anIntArray11393[i_3484_ & 0xff]);
											int i_3486_ = is[i_3448_];
											int i_3487_ = i_3485_ + i_3486_;
											int i_3488_ = ((i_3485_ & 0xff00ff) + (i_3486_ & 0xff00ff));
											i_3486_ = ((i_3488_ & 0x1000100) + (i_3487_ - i_3488_ & 0x10000));
											is[i_3448_] = (i_3487_ - i_3486_ | i_3486_ - (i_3486_ >>> 8));
										}
									} else if (i == 0) {
										int i_3489_ = aByteArray11394[i_3447_];
										if (i_3489_ != 0) {
											int i_3490_ = (anIntArray11393[i_3489_ & 0xff]);
											int i_3491_ = (((i_3490_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_3492_ = (((i_3490_ & 0xff00) * anInt8974) & 0xff0000);
											int i_3493_ = ((i_3490_ & 0xff) * anInt8975 & 0xff00);
											i_3490_ = (i_3491_ | i_3492_ | i_3493_) >>> 8;
											int i_3494_ = is[i_3448_];
											int i_3495_ = i_3490_ + i_3494_;
											int i_3496_ = ((i_3490_ & 0xff00ff) + (i_3494_ & 0xff00ff));
											i_3494_ = ((i_3496_ & 0x1000100) + (i_3495_ - i_3496_ & 0x10000));
											is[i_3448_] = (i_3495_ - i_3494_ | i_3494_ - (i_3494_ >>> 8));
										}
									} else if (i == 3) {
										byte i_3497_ = aByteArray11394[i_3447_];
										int i_3498_ = (i_3497_ > 0 ? anIntArray11393[i_3497_] : 0);
										int i_3499_ = anInt8944;
										int i_3500_ = i_3498_ + i_3499_;
										int i_3501_ = ((i_3498_ & 0xff00ff) + (i_3499_ & 0xff00ff));
										int i_3502_ = ((i_3501_ & 0x1000100) + (i_3500_ - i_3501_ & 0x10000));
										i_3502_ = (i_3500_ - i_3502_ | i_3502_ - (i_3502_ >>> 8));
										if (i_3498_ == 0 && anInt8965 != 255) {
											i_3498_ = i_3502_;
											i_3502_ = is[i_3448_];
											i_3502_ = (((((i_3498_ & 0xff00ff) * anInt8965) + ((i_3502_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3498_ & 0xff00) * anInt8965) + ((i_3502_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_3448_] = i_3502_;
									} else if (i == 2) {
										int i_3503_ = aByteArray11394[i_3447_];
										if (i_3503_ != 0) {
											int i_3504_ = (anIntArray11393[i_3503_ & 0xff]);
											int i_3505_ = (((i_3504_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_3506_ = (((i_3504_ & 0xff00) * anInt8965) & 0xff0000);
											i_3504_ = ((i_3505_ | i_3506_) >>> 8) + anInt8978;
											int i_3507_ = is[i_3448_];
											int i_3508_ = i_3504_ + i_3507_;
											int i_3509_ = ((i_3504_ & 0xff00ff) + (i_3507_ & 0xff00ff));
											i_3507_ = ((i_3509_ & 0x1000100) + (i_3508_ - i_3509_ & 0x10000));
											is[i_3448_] = (i_3508_ - i_3507_ | i_3507_ - (i_3507_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_3444_ += anInt8962;
							}
						}
						i_3441_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_3510_ = anInt8957;
					while (i_3510_ < 0) {
						int i_3511_ = anInt8959;
						int i_3512_ = anInt8966;
						int i_3513_ = anInt8967 + anInt8969;
						int i_3514_ = anInt8955;
						if (i_3512_ >= 0 && i_3512_ - (anInt8945 << 12) < 0) {
							if (i_3513_ < 0) {
								int i_3515_ = (anInt8962 - 1 - i_3513_) / anInt8962;
								i_3514_ += i_3515_;
								i_3513_ += anInt8962 * i_3515_;
								i_3511_ += i_3515_;
							}
							int i_3516_;
							if ((i_3516_ = (1 + i_3513_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_3514_)
								i_3514_ = i_3516_;
							for (/**/; i_3514_ < 0; i_3514_++) {
								int i_3517_ = ((i_3513_ >> 12) * anInt8945 + (i_3512_ >> 12));
								int i_3518_ = i_3511_++;
								if (i_3372_ == 0) {
									if (i == 1)
										is[i_3518_] = (anIntArray11393[(aByteArray11394[i_3517_] & 0xff)]);
									else if (i == 0) {
										int i_3519_ = (anIntArray11393[(aByteArray11394[i_3517_] & 0xff)]);
										int i_3520_ = ((i_3519_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_3521_ = ((i_3519_ & 0xff00) * anInt8974 & 0xff0000);
										int i_3522_ = ((i_3519_ & 0xff) * anInt8975 & 0xff00);
										is[i_3518_] = (i_3520_ | i_3521_ | i_3522_) >>> 8;
									} else if (i == 3) {
										int i_3523_ = (anIntArray11393[(aByteArray11394[i_3517_] & 0xff)]);
										int i_3524_ = anInt8944;
										int i_3525_ = i_3523_ + i_3524_;
										int i_3526_ = ((i_3523_ & 0xff00ff) + (i_3524_ & 0xff00ff));
										int i_3527_ = ((i_3526_ & 0x1000100) + (i_3525_ - i_3526_ & 0x10000));
										is[i_3518_] = (i_3525_ - i_3527_ | i_3527_ - (i_3527_ >>> 8));
									} else if (i == 2) {
										int i_3528_ = (anIntArray11393[(aByteArray11394[i_3517_] & 0xff)]);
										int i_3529_ = ((i_3528_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_3530_ = ((i_3528_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_3518_] = ((i_3529_ | i_3530_) >>> 8) + anInt8978;
									} else
										throw new IllegalArgumentException();
								} else if (i_3372_ == 1) {
									if (i == 1) {
										int i_3531_ = aByteArray11394[i_3517_];
										if (i_3531_ != 0)
											is[i_3518_] = (anIntArray11393[i_3531_ & 0xff]);
									} else if (i == 0) {
										int i_3532_ = aByteArray11394[i_3517_];
										if (i_3532_ != 0) {
											int i_3533_ = (anIntArray11393[i_3532_ & 0xff]);
											if ((anInt8944 & 0xffffff) == 16777215) {
												int i_3534_ = anInt8944 >>> 24;
												int i_3535_ = 256 - i_3534_;
												int i_3536_ = is[i_3518_];
												is[i_3518_] = (((((i_3533_ & 0xff00ff) * i_3534_) + ((i_3536_ & 0xff00ff) * i_3535_)) & ~0xff00ff) + ((((i_3533_ & 0xff00) * i_3534_) + ((i_3536_ & 0xff00) * i_3535_)) & 0xff0000)) >> 8;
											} else if (anInt8965 != 255) {
												int i_3537_ = (((i_3533_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_3538_ = (((i_3533_ & 0xff00) * anInt8974) & 0xff0000);
												int i_3539_ = (((i_3533_ & 0xff) * anInt8975) & 0xff00);
												i_3533_ = (i_3537_ | i_3538_ | i_3539_) >>> 8;
												int i_3540_ = is[i_3518_];
												is[i_3518_] = (((((i_3533_ & 0xff00ff) * anInt8965) + ((i_3540_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3533_ & 0xff00) * anInt8965) + ((i_3540_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
											} else {
												int i_3541_ = (((i_3533_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_3542_ = (((i_3533_ & 0xff00) * anInt8974) & 0xff0000);
												int i_3543_ = (((i_3533_ & 0xff) * anInt8975) & 0xff00);
												is[i_3518_] = (i_3541_ | i_3542_ | i_3543_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_3544_ = aByteArray11394[i_3517_];
										int i_3545_ = (i_3544_ > 0 ? anIntArray11393[i_3544_] : 0);
										int i_3546_ = anInt8944;
										int i_3547_ = i_3545_ + i_3546_;
										int i_3548_ = ((i_3545_ & 0xff00ff) + (i_3546_ & 0xff00ff));
										int i_3549_ = ((i_3548_ & 0x1000100) + (i_3547_ - i_3548_ & 0x10000));
										i_3549_ = (i_3547_ - i_3549_ | i_3549_ - (i_3549_ >>> 8));
										if (i_3545_ == 0 && anInt8965 != 255) {
											i_3545_ = i_3549_;
											i_3549_ = is[i_3518_];
											i_3549_ = (((((i_3545_ & 0xff00ff) * anInt8965) + ((i_3549_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3545_ & 0xff00) * anInt8965) + ((i_3549_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_3518_] = i_3549_;
									} else if (i == 2) {
										int i_3550_ = aByteArray11394[i_3517_];
										if (i_3550_ != 0) {
											int i_3551_ = (anIntArray11393[i_3550_ & 0xff]);
											int i_3552_ = (((i_3551_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_3553_ = (((i_3551_ & 0xff00) * anInt8965) & 0xff0000);
											is[i_3518_++] = (((i_3552_ | i_3553_) >>> 8) + anInt8978);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_3372_ == 2) {
									if (i == 1) {
										int i_3554_ = aByteArray11394[i_3517_];
										if (i_3554_ != 0) {
											int i_3555_ = (anIntArray11393[i_3554_ & 0xff]);
											int i_3556_ = is[i_3518_];
											int i_3557_ = i_3555_ + i_3556_;
											int i_3558_ = ((i_3555_ & 0xff00ff) + (i_3556_ & 0xff00ff));
											i_3556_ = ((i_3558_ & 0x1000100) + (i_3557_ - i_3558_ & 0x10000));
											is[i_3518_] = (i_3557_ - i_3556_ | i_3556_ - (i_3556_ >>> 8));
										}
									} else if (i == 0) {
										int i_3559_ = aByteArray11394[i_3517_];
										if (i_3559_ != 0) {
											int i_3560_ = (anIntArray11393[i_3559_ & 0xff]);
											int i_3561_ = (((i_3560_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_3562_ = (((i_3560_ & 0xff00) * anInt8974) & 0xff0000);
											int i_3563_ = ((i_3560_ & 0xff) * anInt8975 & 0xff00);
											i_3560_ = (i_3561_ | i_3562_ | i_3563_) >>> 8;
											int i_3564_ = is[i_3518_];
											int i_3565_ = i_3560_ + i_3564_;
											int i_3566_ = ((i_3560_ & 0xff00ff) + (i_3564_ & 0xff00ff));
											i_3564_ = ((i_3566_ & 0x1000100) + (i_3565_ - i_3566_ & 0x10000));
											is[i_3518_] = (i_3565_ - i_3564_ | i_3564_ - (i_3564_ >>> 8));
										}
									} else if (i == 3) {
										byte i_3567_ = aByteArray11394[i_3517_];
										int i_3568_ = (i_3567_ > 0 ? anIntArray11393[i_3567_] : 0);
										int i_3569_ = anInt8944;
										int i_3570_ = i_3568_ + i_3569_;
										int i_3571_ = ((i_3568_ & 0xff00ff) + (i_3569_ & 0xff00ff));
										int i_3572_ = ((i_3571_ & 0x1000100) + (i_3570_ - i_3571_ & 0x10000));
										i_3572_ = (i_3570_ - i_3572_ | i_3572_ - (i_3572_ >>> 8));
										if (i_3568_ == 0 && anInt8965 != 255) {
											i_3568_ = i_3572_;
											i_3572_ = is[i_3518_];
											i_3572_ = (((((i_3568_ & 0xff00ff) * anInt8965) + ((i_3572_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3568_ & 0xff00) * anInt8965) + ((i_3572_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_3518_] = i_3572_;
									} else if (i == 2) {
										int i_3573_ = aByteArray11394[i_3517_];
										if (i_3573_ != 0) {
											int i_3574_ = (anIntArray11393[i_3573_ & 0xff]);
											int i_3575_ = (((i_3574_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_3576_ = (((i_3574_ & 0xff00) * anInt8965) & 0xff0000);
											i_3574_ = ((i_3575_ | i_3576_) >>> 8) + anInt8978;
											int i_3577_ = is[i_3518_];
											int i_3578_ = i_3574_ + i_3577_;
											int i_3579_ = ((i_3574_ & 0xff00ff) + (i_3577_ & 0xff00ff));
											i_3577_ = ((i_3579_ & 0x1000100) + (i_3578_ - i_3579_ & 0x10000));
											is[i_3518_] = (i_3578_ - i_3577_ | i_3577_ - (i_3577_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_3513_ += anInt8962;
							}
						}
						i_3510_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_3580_ = anInt8957;
					while (i_3580_ < 0) {
						int i_3581_ = anInt8959;
						int i_3582_ = anInt8966 + anInt8968;
						int i_3583_ = anInt8967;
						int i_3584_ = anInt8955;
						if (i_3583_ >= 0 && i_3583_ - (anInt8950 << 12) < 0) {
							int i_3585_;
							if ((i_3585_ = i_3582_ - (anInt8945 << 12)) >= 0) {
								i_3585_ = (anInt8960 - i_3585_) / anInt8960;
								i_3584_ += i_3585_;
								i_3582_ += anInt8960 * i_3585_;
								i_3581_ += i_3585_;
							}
							if ((i_3585_ = (i_3582_ - anInt8960) / anInt8960) > i_3584_)
								i_3584_ = i_3585_;
							for (/**/; i_3584_ < 0; i_3584_++) {
								int i_3586_ = ((i_3583_ >> 12) * anInt8945 + (i_3582_ >> 12));
								int i_3587_ = i_3581_++;
								if (i_3372_ == 0) {
									if (i == 1)
										is[i_3587_] = (anIntArray11393[(aByteArray11394[i_3586_] & 0xff)]);
									else if (i == 0) {
										int i_3588_ = (anIntArray11393[(aByteArray11394[i_3586_] & 0xff)]);
										int i_3589_ = ((i_3588_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_3590_ = ((i_3588_ & 0xff00) * anInt8974 & 0xff0000);
										int i_3591_ = ((i_3588_ & 0xff) * anInt8975 & 0xff00);
										is[i_3587_] = (i_3589_ | i_3590_ | i_3591_) >>> 8;
									} else if (i == 3) {
										int i_3592_ = (anIntArray11393[(aByteArray11394[i_3586_] & 0xff)]);
										int i_3593_ = anInt8944;
										int i_3594_ = i_3592_ + i_3593_;
										int i_3595_ = ((i_3592_ & 0xff00ff) + (i_3593_ & 0xff00ff));
										int i_3596_ = ((i_3595_ & 0x1000100) + (i_3594_ - i_3595_ & 0x10000));
										is[i_3587_] = (i_3594_ - i_3596_ | i_3596_ - (i_3596_ >>> 8));
									} else if (i == 2) {
										int i_3597_ = (anIntArray11393[(aByteArray11394[i_3586_] & 0xff)]);
										int i_3598_ = ((i_3597_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_3599_ = ((i_3597_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_3587_] = ((i_3598_ | i_3599_) >>> 8) + anInt8978;
									} else
										throw new IllegalArgumentException();
								} else if (i_3372_ == 1) {
									if (i == 1) {
										int i_3600_ = aByteArray11394[i_3586_];
										if (i_3600_ != 0)
											is[i_3587_] = (anIntArray11393[i_3600_ & 0xff]);
									} else if (i == 0) {
										int i_3601_ = aByteArray11394[i_3586_];
										if (i_3601_ != 0) {
											int i_3602_ = (anIntArray11393[i_3601_ & 0xff]);
											if ((anInt8944 & 0xffffff) == 16777215) {
												int i_3603_ = anInt8944 >>> 24;
												int i_3604_ = 256 - i_3603_;
												int i_3605_ = is[i_3587_];
												is[i_3587_] = (((((i_3602_ & 0xff00ff) * i_3603_) + ((i_3605_ & 0xff00ff) * i_3604_)) & ~0xff00ff) + ((((i_3602_ & 0xff00) * i_3603_) + ((i_3605_ & 0xff00) * i_3604_)) & 0xff0000)) >> 8;
											} else if (anInt8965 != 255) {
												int i_3606_ = (((i_3602_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_3607_ = (((i_3602_ & 0xff00) * anInt8974) & 0xff0000);
												int i_3608_ = (((i_3602_ & 0xff) * anInt8975) & 0xff00);
												i_3602_ = (i_3606_ | i_3607_ | i_3608_) >>> 8;
												int i_3609_ = is[i_3587_];
												is[i_3587_] = (((((i_3602_ & 0xff00ff) * anInt8965) + ((i_3609_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3602_ & 0xff00) * anInt8965) + ((i_3609_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
											} else {
												int i_3610_ = (((i_3602_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_3611_ = (((i_3602_ & 0xff00) * anInt8974) & 0xff0000);
												int i_3612_ = (((i_3602_ & 0xff) * anInt8975) & 0xff00);
												is[i_3587_] = (i_3610_ | i_3611_ | i_3612_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_3613_ = aByteArray11394[i_3586_];
										int i_3614_ = (i_3613_ > 0 ? anIntArray11393[i_3613_] : 0);
										int i_3615_ = anInt8944;
										int i_3616_ = i_3614_ + i_3615_;
										int i_3617_ = ((i_3614_ & 0xff00ff) + (i_3615_ & 0xff00ff));
										int i_3618_ = ((i_3617_ & 0x1000100) + (i_3616_ - i_3617_ & 0x10000));
										i_3618_ = (i_3616_ - i_3618_ | i_3618_ - (i_3618_ >>> 8));
										if (i_3614_ == 0 && anInt8965 != 255) {
											i_3614_ = i_3618_;
											i_3618_ = is[i_3587_];
											i_3618_ = (((((i_3614_ & 0xff00ff) * anInt8965) + ((i_3618_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3614_ & 0xff00) * anInt8965) + ((i_3618_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_3587_] = i_3618_;
									} else if (i == 2) {
										int i_3619_ = aByteArray11394[i_3586_];
										if (i_3619_ != 0) {
											int i_3620_ = (anIntArray11393[i_3619_ & 0xff]);
											int i_3621_ = (((i_3620_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_3622_ = (((i_3620_ & 0xff00) * anInt8965) & 0xff0000);
											is[i_3587_++] = (((i_3621_ | i_3622_) >>> 8) + anInt8978);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_3372_ == 2) {
									if (i == 1) {
										int i_3623_ = aByteArray11394[i_3586_];
										if (i_3623_ != 0) {
											int i_3624_ = (anIntArray11393[i_3623_ & 0xff]);
											int i_3625_ = is[i_3587_];
											int i_3626_ = i_3624_ + i_3625_;
											int i_3627_ = ((i_3624_ & 0xff00ff) + (i_3625_ & 0xff00ff));
											i_3625_ = ((i_3627_ & 0x1000100) + (i_3626_ - i_3627_ & 0x10000));
											is[i_3587_] = (i_3626_ - i_3625_ | i_3625_ - (i_3625_ >>> 8));
										}
									} else if (i == 0) {
										int i_3628_ = aByteArray11394[i_3586_];
										if (i_3628_ != 0) {
											int i_3629_ = (anIntArray11393[i_3628_ & 0xff]);
											int i_3630_ = (((i_3629_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_3631_ = (((i_3629_ & 0xff00) * anInt8974) & 0xff0000);
											int i_3632_ = ((i_3629_ & 0xff) * anInt8975 & 0xff00);
											i_3629_ = (i_3630_ | i_3631_ | i_3632_) >>> 8;
											int i_3633_ = is[i_3587_];
											int i_3634_ = i_3629_ + i_3633_;
											int i_3635_ = ((i_3629_ & 0xff00ff) + (i_3633_ & 0xff00ff));
											i_3633_ = ((i_3635_ & 0x1000100) + (i_3634_ - i_3635_ & 0x10000));
											is[i_3587_] = (i_3634_ - i_3633_ | i_3633_ - (i_3633_ >>> 8));
										}
									} else if (i == 3) {
										byte i_3636_ = aByteArray11394[i_3586_];
										int i_3637_ = (i_3636_ > 0 ? anIntArray11393[i_3636_] : 0);
										int i_3638_ = anInt8944;
										int i_3639_ = i_3637_ + i_3638_;
										int i_3640_ = ((i_3637_ & 0xff00ff) + (i_3638_ & 0xff00ff));
										int i_3641_ = ((i_3640_ & 0x1000100) + (i_3639_ - i_3640_ & 0x10000));
										i_3641_ = (i_3639_ - i_3641_ | i_3641_ - (i_3641_ >>> 8));
										if (i_3637_ == 0 && anInt8965 != 255) {
											i_3637_ = i_3641_;
											i_3641_ = is[i_3587_];
											i_3641_ = (((((i_3637_ & 0xff00ff) * anInt8965) + ((i_3641_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3637_ & 0xff00) * anInt8965) + ((i_3641_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_3587_] = i_3641_;
									} else if (i == 2) {
										int i_3642_ = aByteArray11394[i_3586_];
										if (i_3642_ != 0) {
											int i_3643_ = (anIntArray11393[i_3642_ & 0xff]);
											int i_3644_ = (((i_3643_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_3645_ = (((i_3643_ & 0xff00) * anInt8965) & 0xff0000);
											i_3643_ = ((i_3644_ | i_3645_) >>> 8) + anInt8978;
											int i_3646_ = is[i_3587_];
											int i_3647_ = i_3643_ + i_3646_;
											int i_3648_ = ((i_3643_ & 0xff00ff) + (i_3646_ & 0xff00ff));
											i_3646_ = ((i_3648_ & 0x1000100) + (i_3647_ - i_3648_ & 0x10000));
											is[i_3587_] = (i_3647_ - i_3646_ | i_3646_ - (i_3646_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_3582_ += anInt8960;
							}
						}
						i_3580_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_3649_ = anInt8957;
					while (i_3649_ < 0) {
						int i_3650_ = anInt8959;
						int i_3651_ = anInt8966 + anInt8968;
						int i_3652_ = anInt8967 + anInt8969;
						int i_3653_ = anInt8955;
						int i_3654_;
						if ((i_3654_ = i_3651_ - (anInt8945 << 12)) >= 0) {
							i_3654_ = (anInt8960 - i_3654_) / anInt8960;
							i_3653_ += i_3654_;
							i_3651_ += anInt8960 * i_3654_;
							i_3652_ += anInt8962 * i_3654_;
							i_3650_ += i_3654_;
						}
						if ((i_3654_ = (i_3651_ - anInt8960) / anInt8960) > i_3653_)
							i_3653_ = i_3654_;
						if ((i_3654_ = i_3652_ - (anInt8950 << 12)) >= 0) {
							i_3654_ = (anInt8962 - i_3654_) / anInt8962;
							i_3653_ += i_3654_;
							i_3651_ += anInt8960 * i_3654_;
							i_3652_ += anInt8962 * i_3654_;
							i_3650_ += i_3654_;
						}
						if ((i_3654_ = (i_3652_ - anInt8962) / anInt8962) > i_3653_)
							i_3653_ = i_3654_;
						for (/**/; i_3653_ < 0; i_3653_++) {
							int i_3655_ = ((i_3652_ >> 12) * anInt8945 + (i_3651_ >> 12));
							int i_3656_ = i_3650_++;
							if (i_3372_ == 0) {
								if (i == 1)
									is[i_3656_] = (anIntArray11393[aByteArray11394[i_3655_] & 0xff]);
								else if (i == 0) {
									int i_3657_ = (anIntArray11393[aByteArray11394[i_3655_] & 0xff]);
									int i_3658_ = ((i_3657_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_3659_ = ((i_3657_ & 0xff00) * anInt8974 & 0xff0000);
									int i_3660_ = ((i_3657_ & 0xff) * anInt8975 & 0xff00);
									is[i_3656_] = (i_3658_ | i_3659_ | i_3660_) >>> 8;
								} else if (i == 3) {
									int i_3661_ = (anIntArray11393[aByteArray11394[i_3655_] & 0xff]);
									int i_3662_ = anInt8944;
									int i_3663_ = i_3661_ + i_3662_;
									int i_3664_ = ((i_3661_ & 0xff00ff) + (i_3662_ & 0xff00ff));
									int i_3665_ = ((i_3664_ & 0x1000100) + (i_3663_ - i_3664_ & 0x10000));
									is[i_3656_] = (i_3663_ - i_3665_ | i_3665_ - (i_3665_ >>> 8));
								} else if (i == 2) {
									int i_3666_ = (anIntArray11393[aByteArray11394[i_3655_] & 0xff]);
									int i_3667_ = ((i_3666_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_3668_ = ((i_3666_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_3656_] = (((i_3667_ | i_3668_) >>> 8) + anInt8978);
								} else
									throw new IllegalArgumentException();
							} else if (i_3372_ == 1) {
								if (i == 1) {
									int i_3669_ = aByteArray11394[i_3655_];
									if (i_3669_ != 0)
										is[i_3656_] = anIntArray11393[i_3669_ & 0xff];
								} else if (i == 0) {
									int i_3670_ = aByteArray11394[i_3655_];
									if (i_3670_ != 0) {
										int i_3671_ = anIntArray11393[i_3670_ & 0xff];
										if ((anInt8944 & 0xffffff) == 16777215) {
											int i_3672_ = anInt8944 >>> 24;
											int i_3673_ = 256 - i_3672_;
											int i_3674_ = is[i_3656_];
											is[i_3656_] = (((((i_3671_ & 0xff00ff) * i_3672_) + ((i_3674_ & 0xff00ff) * i_3673_)) & ~0xff00ff) + ((((i_3671_ & 0xff00) * i_3672_) + ((i_3674_ & 0xff00) * i_3673_)) & 0xff0000)) >> 8;
										} else if (anInt8965 != 255) {
											int i_3675_ = (((i_3671_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_3676_ = (((i_3671_ & 0xff00) * anInt8974) & 0xff0000);
											int i_3677_ = ((i_3671_ & 0xff) * anInt8975 & 0xff00);
											i_3671_ = (i_3675_ | i_3676_ | i_3677_) >>> 8;
											int i_3678_ = is[i_3656_];
											is[i_3656_] = (((((i_3671_ & 0xff00ff) * anInt8965) + ((i_3678_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3671_ & 0xff00) * anInt8965) + ((i_3678_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										} else {
											int i_3679_ = (((i_3671_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_3680_ = (((i_3671_ & 0xff00) * anInt8974) & 0xff0000);
											int i_3681_ = ((i_3671_ & 0xff) * anInt8975 & 0xff00);
											is[i_3656_] = (i_3679_ | i_3680_ | i_3681_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_3682_ = aByteArray11394[i_3655_];
									int i_3683_ = (i_3682_ > 0 ? anIntArray11393[i_3682_] : 0);
									int i_3684_ = anInt8944;
									int i_3685_ = i_3683_ + i_3684_;
									int i_3686_ = ((i_3683_ & 0xff00ff) + (i_3684_ & 0xff00ff));
									int i_3687_ = ((i_3686_ & 0x1000100) + (i_3685_ - i_3686_ & 0x10000));
									i_3687_ = (i_3685_ - i_3687_ | i_3687_ - (i_3687_ >>> 8));
									if (i_3683_ == 0 && anInt8965 != 255) {
										i_3683_ = i_3687_;
										i_3687_ = is[i_3656_];
										i_3687_ = (((((i_3683_ & 0xff00ff) * anInt8965) + ((i_3687_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3683_ & 0xff00) * anInt8965) + ((i_3687_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_3656_] = i_3687_;
								} else if (i == 2) {
									int i_3688_ = aByteArray11394[i_3655_];
									if (i_3688_ != 0) {
										int i_3689_ = anIntArray11393[i_3688_ & 0xff];
										int i_3690_ = ((i_3689_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_3691_ = ((i_3689_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_3656_++] = ((i_3690_ | i_3691_) >>> 8) + anInt8978;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_3372_ == 2) {
								if (i == 1) {
									int i_3692_ = aByteArray11394[i_3655_];
									if (i_3692_ != 0) {
										int i_3693_ = anIntArray11393[i_3692_ & 0xff];
										int i_3694_ = is[i_3656_];
										int i_3695_ = i_3693_ + i_3694_;
										int i_3696_ = ((i_3693_ & 0xff00ff) + (i_3694_ & 0xff00ff));
										i_3694_ = ((i_3696_ & 0x1000100) + (i_3695_ - i_3696_ & 0x10000));
										is[i_3656_] = (i_3695_ - i_3694_ | i_3694_ - (i_3694_ >>> 8));
									}
								} else if (i == 0) {
									int i_3697_ = aByteArray11394[i_3655_];
									if (i_3697_ != 0) {
										int i_3698_ = anIntArray11393[i_3697_ & 0xff];
										int i_3699_ = ((i_3698_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_3700_ = ((i_3698_ & 0xff00) * anInt8974 & 0xff0000);
										int i_3701_ = ((i_3698_ & 0xff) * anInt8975 & 0xff00);
										i_3698_ = (i_3699_ | i_3700_ | i_3701_) >>> 8;
										int i_3702_ = is[i_3656_];
										int i_3703_ = i_3698_ + i_3702_;
										int i_3704_ = ((i_3698_ & 0xff00ff) + (i_3702_ & 0xff00ff));
										i_3702_ = ((i_3704_ & 0x1000100) + (i_3703_ - i_3704_ & 0x10000));
										is[i_3656_] = (i_3703_ - i_3702_ | i_3702_ - (i_3702_ >>> 8));
									}
								} else if (i == 3) {
									byte i_3705_ = aByteArray11394[i_3655_];
									int i_3706_ = (i_3705_ > 0 ? anIntArray11393[i_3705_] : 0);
									int i_3707_ = anInt8944;
									int i_3708_ = i_3706_ + i_3707_;
									int i_3709_ = ((i_3706_ & 0xff00ff) + (i_3707_ & 0xff00ff));
									int i_3710_ = ((i_3709_ & 0x1000100) + (i_3708_ - i_3709_ & 0x10000));
									i_3710_ = (i_3708_ - i_3710_ | i_3710_ - (i_3710_ >>> 8));
									if (i_3706_ == 0 && anInt8965 != 255) {
										i_3706_ = i_3710_;
										i_3710_ = is[i_3656_];
										i_3710_ = (((((i_3706_ & 0xff00ff) * anInt8965) + ((i_3710_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3706_ & 0xff00) * anInt8965) + ((i_3710_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_3656_] = i_3710_;
								} else if (i == 2) {
									int i_3711_ = aByteArray11394[i_3655_];
									if (i_3711_ != 0) {
										int i_3712_ = anIntArray11393[i_3711_ & 0xff];
										int i_3713_ = ((i_3712_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_3714_ = ((i_3712_ & 0xff00) * anInt8965 & 0xff0000);
										i_3712_ = (((i_3713_ | i_3714_) >>> 8) + anInt8978);
										int i_3715_ = is[i_3656_];
										int i_3716_ = i_3712_ + i_3715_;
										int i_3717_ = ((i_3712_ & 0xff00ff) + (i_3715_ & 0xff00ff));
										i_3715_ = ((i_3717_ & 0x1000100) + (i_3716_ - i_3717_ & 0x10000));
										is[i_3656_] = (i_3716_ - i_3715_ | i_3715_ - (i_3715_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_3651_ += anInt8960;
							i_3652_ += anInt8962;
						}
						i_3649_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_3718_ = anInt8957;
					while (i_3718_ < 0) {
						int i_3719_ = anInt8959;
						int i_3720_ = anInt8966 + anInt8968;
						int i_3721_ = anInt8967 + anInt8969;
						int i_3722_ = anInt8955;
						int i_3723_;
						if ((i_3723_ = i_3720_ - (anInt8945 << 12)) >= 0) {
							i_3723_ = (anInt8960 - i_3723_) / anInt8960;
							i_3722_ += i_3723_;
							i_3720_ += anInt8960 * i_3723_;
							i_3721_ += anInt8962 * i_3723_;
							i_3719_ += i_3723_;
						}
						if ((i_3723_ = (i_3720_ - anInt8960) / anInt8960) > i_3722_)
							i_3722_ = i_3723_;
						if (i_3721_ < 0) {
							i_3723_ = (anInt8962 - 1 - i_3721_) / anInt8962;
							i_3722_ += i_3723_;
							i_3720_ += anInt8960 * i_3723_;
							i_3721_ += anInt8962 * i_3723_;
							i_3719_ += i_3723_;
						}
						if ((i_3723_ = (1 + i_3721_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_3722_)
							i_3722_ = i_3723_;
						for (/**/; i_3722_ < 0; i_3722_++) {
							int i_3724_ = ((i_3721_ >> 12) * anInt8945 + (i_3720_ >> 12));
							int i_3725_ = i_3719_++;
							if (i_3372_ == 0) {
								if (i == 1)
									is[i_3725_] = (anIntArray11393[aByteArray11394[i_3724_] & 0xff]);
								else if (i == 0) {
									int i_3726_ = (anIntArray11393[aByteArray11394[i_3724_] & 0xff]);
									int i_3727_ = ((i_3726_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_3728_ = ((i_3726_ & 0xff00) * anInt8974 & 0xff0000);
									int i_3729_ = ((i_3726_ & 0xff) * anInt8975 & 0xff00);
									is[i_3725_] = (i_3727_ | i_3728_ | i_3729_) >>> 8;
								} else if (i == 3) {
									int i_3730_ = (anIntArray11393[aByteArray11394[i_3724_] & 0xff]);
									int i_3731_ = anInt8944;
									int i_3732_ = i_3730_ + i_3731_;
									int i_3733_ = ((i_3730_ & 0xff00ff) + (i_3731_ & 0xff00ff));
									int i_3734_ = ((i_3733_ & 0x1000100) + (i_3732_ - i_3733_ & 0x10000));
									is[i_3725_] = (i_3732_ - i_3734_ | i_3734_ - (i_3734_ >>> 8));
								} else if (i == 2) {
									int i_3735_ = (anIntArray11393[aByteArray11394[i_3724_] & 0xff]);
									int i_3736_ = ((i_3735_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_3737_ = ((i_3735_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_3725_] = (((i_3736_ | i_3737_) >>> 8) + anInt8978);
								} else
									throw new IllegalArgumentException();
							} else if (i_3372_ == 1) {
								if (i == 1) {
									int i_3738_ = aByteArray11394[i_3724_];
									if (i_3738_ != 0)
										is[i_3725_] = anIntArray11393[i_3738_ & 0xff];
								} else if (i == 0) {
									int i_3739_ = aByteArray11394[i_3724_];
									if (i_3739_ != 0) {
										int i_3740_ = anIntArray11393[i_3739_ & 0xff];
										if ((anInt8944 & 0xffffff) == 16777215) {
											int i_3741_ = anInt8944 >>> 24;
											int i_3742_ = 256 - i_3741_;
											int i_3743_ = is[i_3725_];
											is[i_3725_] = (((((i_3740_ & 0xff00ff) * i_3741_) + ((i_3743_ & 0xff00ff) * i_3742_)) & ~0xff00ff) + ((((i_3740_ & 0xff00) * i_3741_) + ((i_3743_ & 0xff00) * i_3742_)) & 0xff0000)) >> 8;
										} else if (anInt8965 != 255) {
											int i_3744_ = (((i_3740_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_3745_ = (((i_3740_ & 0xff00) * anInt8974) & 0xff0000);
											int i_3746_ = ((i_3740_ & 0xff) * anInt8975 & 0xff00);
											i_3740_ = (i_3744_ | i_3745_ | i_3746_) >>> 8;
											int i_3747_ = is[i_3725_];
											is[i_3725_] = (((((i_3740_ & 0xff00ff) * anInt8965) + ((i_3747_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3740_ & 0xff00) * anInt8965) + ((i_3747_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										} else {
											int i_3748_ = (((i_3740_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_3749_ = (((i_3740_ & 0xff00) * anInt8974) & 0xff0000);
											int i_3750_ = ((i_3740_ & 0xff) * anInt8975 & 0xff00);
											is[i_3725_] = (i_3748_ | i_3749_ | i_3750_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_3751_ = aByteArray11394[i_3724_];
									int i_3752_ = (i_3751_ > 0 ? anIntArray11393[i_3751_] : 0);
									int i_3753_ = anInt8944;
									int i_3754_ = i_3752_ + i_3753_;
									int i_3755_ = ((i_3752_ & 0xff00ff) + (i_3753_ & 0xff00ff));
									int i_3756_ = ((i_3755_ & 0x1000100) + (i_3754_ - i_3755_ & 0x10000));
									i_3756_ = (i_3754_ - i_3756_ | i_3756_ - (i_3756_ >>> 8));
									if (i_3752_ == 0 && anInt8965 != 255) {
										i_3752_ = i_3756_;
										i_3756_ = is[i_3725_];
										i_3756_ = (((((i_3752_ & 0xff00ff) * anInt8965) + ((i_3756_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3752_ & 0xff00) * anInt8965) + ((i_3756_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_3725_] = i_3756_;
								} else if (i == 2) {
									int i_3757_ = aByteArray11394[i_3724_];
									if (i_3757_ != 0) {
										int i_3758_ = anIntArray11393[i_3757_ & 0xff];
										int i_3759_ = ((i_3758_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_3760_ = ((i_3758_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_3725_++] = ((i_3759_ | i_3760_) >>> 8) + anInt8978;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_3372_ == 2) {
								if (i == 1) {
									int i_3761_ = aByteArray11394[i_3724_];
									if (i_3761_ != 0) {
										int i_3762_ = anIntArray11393[i_3761_ & 0xff];
										int i_3763_ = is[i_3725_];
										int i_3764_ = i_3762_ + i_3763_;
										int i_3765_ = ((i_3762_ & 0xff00ff) + (i_3763_ & 0xff00ff));
										i_3763_ = ((i_3765_ & 0x1000100) + (i_3764_ - i_3765_ & 0x10000));
										is[i_3725_] = (i_3764_ - i_3763_ | i_3763_ - (i_3763_ >>> 8));
									}
								} else if (i == 0) {
									int i_3766_ = aByteArray11394[i_3724_];
									if (i_3766_ != 0) {
										int i_3767_ = anIntArray11393[i_3766_ & 0xff];
										int i_3768_ = ((i_3767_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_3769_ = ((i_3767_ & 0xff00) * anInt8974 & 0xff0000);
										int i_3770_ = ((i_3767_ & 0xff) * anInt8975 & 0xff00);
										i_3767_ = (i_3768_ | i_3769_ | i_3770_) >>> 8;
										int i_3771_ = is[i_3725_];
										int i_3772_ = i_3767_ + i_3771_;
										int i_3773_ = ((i_3767_ & 0xff00ff) + (i_3771_ & 0xff00ff));
										i_3771_ = ((i_3773_ & 0x1000100) + (i_3772_ - i_3773_ & 0x10000));
										is[i_3725_] = (i_3772_ - i_3771_ | i_3771_ - (i_3771_ >>> 8));
									}
								} else if (i == 3) {
									byte i_3774_ = aByteArray11394[i_3724_];
									int i_3775_ = (i_3774_ > 0 ? anIntArray11393[i_3774_] : 0);
									int i_3776_ = anInt8944;
									int i_3777_ = i_3775_ + i_3776_;
									int i_3778_ = ((i_3775_ & 0xff00ff) + (i_3776_ & 0xff00ff));
									int i_3779_ = ((i_3778_ & 0x1000100) + (i_3777_ - i_3778_ & 0x10000));
									i_3779_ = (i_3777_ - i_3779_ | i_3779_ - (i_3779_ >>> 8));
									if (i_3775_ == 0 && anInt8965 != 255) {
										i_3775_ = i_3779_;
										i_3779_ = is[i_3725_];
										i_3779_ = (((((i_3775_ & 0xff00ff) * anInt8965) + ((i_3779_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3775_ & 0xff00) * anInt8965) + ((i_3779_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_3725_] = i_3779_;
								} else if (i == 2) {
									int i_3780_ = aByteArray11394[i_3724_];
									if (i_3780_ != 0) {
										int i_3781_ = anIntArray11393[i_3780_ & 0xff];
										int i_3782_ = ((i_3781_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_3783_ = ((i_3781_ & 0xff00) * anInt8965 & 0xff0000);
										i_3781_ = (((i_3782_ | i_3783_) >>> 8) + anInt8978);
										int i_3784_ = is[i_3725_];
										int i_3785_ = i_3781_ + i_3784_;
										int i_3786_ = ((i_3781_ & 0xff00ff) + (i_3784_ & 0xff00ff));
										i_3784_ = ((i_3786_ & 0x1000100) + (i_3785_ - i_3786_ & 0x10000));
										is[i_3725_] = (i_3785_ - i_3784_ | i_3784_ - (i_3784_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_3720_ += anInt8960;
							i_3721_ += anInt8962;
						}
						i_3718_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_3787_ = anInt8957;
				while (i_3787_ < 0) {
					int i_3788_ = anInt8959;
					int i_3789_ = anInt8966 + anInt8968;
					int i_3790_ = anInt8967;
					int i_3791_ = anInt8955;
					if (i_3790_ >= 0 && i_3790_ - (anInt8950 << 12) < 0) {
						if (i_3789_ < 0) {
							int i_3792_ = (anInt8960 - 1 - i_3789_) / anInt8960;
							i_3791_ += i_3792_;
							i_3789_ += anInt8960 * i_3792_;
							i_3788_ += i_3792_;
						}
						int i_3793_;
						if ((i_3793_ = (1 + i_3789_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_3791_)
							i_3791_ = i_3793_;
						for (/**/; i_3791_ < 0; i_3791_++) {
							int i_3794_ = ((i_3790_ >> 12) * anInt8945 + (i_3789_ >> 12));
							int i_3795_ = i_3788_++;
							if (i_3372_ == 0) {
								if (i == 1)
									is[i_3795_] = (anIntArray11393[aByteArray11394[i_3794_] & 0xff]);
								else if (i == 0) {
									int i_3796_ = (anIntArray11393[aByteArray11394[i_3794_] & 0xff]);
									int i_3797_ = ((i_3796_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_3798_ = ((i_3796_ & 0xff00) * anInt8974 & 0xff0000);
									int i_3799_ = ((i_3796_ & 0xff) * anInt8975 & 0xff00);
									is[i_3795_] = (i_3797_ | i_3798_ | i_3799_) >>> 8;
								} else if (i == 3) {
									int i_3800_ = (anIntArray11393[aByteArray11394[i_3794_] & 0xff]);
									int i_3801_ = anInt8944;
									int i_3802_ = i_3800_ + i_3801_;
									int i_3803_ = ((i_3800_ & 0xff00ff) + (i_3801_ & 0xff00ff));
									int i_3804_ = ((i_3803_ & 0x1000100) + (i_3802_ - i_3803_ & 0x10000));
									is[i_3795_] = (i_3802_ - i_3804_ | i_3804_ - (i_3804_ >>> 8));
								} else if (i == 2) {
									int i_3805_ = (anIntArray11393[aByteArray11394[i_3794_] & 0xff]);
									int i_3806_ = ((i_3805_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_3807_ = ((i_3805_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_3795_] = (((i_3806_ | i_3807_) >>> 8) + anInt8978);
								} else
									throw new IllegalArgumentException();
							} else if (i_3372_ == 1) {
								if (i == 1) {
									int i_3808_ = aByteArray11394[i_3794_];
									if (i_3808_ != 0)
										is[i_3795_] = anIntArray11393[i_3808_ & 0xff];
								} else if (i == 0) {
									int i_3809_ = aByteArray11394[i_3794_];
									if (i_3809_ != 0) {
										int i_3810_ = anIntArray11393[i_3809_ & 0xff];
										if ((anInt8944 & 0xffffff) == 16777215) {
											int i_3811_ = anInt8944 >>> 24;
											int i_3812_ = 256 - i_3811_;
											int i_3813_ = is[i_3795_];
											is[i_3795_] = (((((i_3810_ & 0xff00ff) * i_3811_) + ((i_3813_ & 0xff00ff) * i_3812_)) & ~0xff00ff) + ((((i_3810_ & 0xff00) * i_3811_) + ((i_3813_ & 0xff00) * i_3812_)) & 0xff0000)) >> 8;
										} else if (anInt8965 != 255) {
											int i_3814_ = (((i_3810_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_3815_ = (((i_3810_ & 0xff00) * anInt8974) & 0xff0000);
											int i_3816_ = ((i_3810_ & 0xff) * anInt8975 & 0xff00);
											i_3810_ = (i_3814_ | i_3815_ | i_3816_) >>> 8;
											int i_3817_ = is[i_3795_];
											is[i_3795_] = (((((i_3810_ & 0xff00ff) * anInt8965) + ((i_3817_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3810_ & 0xff00) * anInt8965) + ((i_3817_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										} else {
											int i_3818_ = (((i_3810_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_3819_ = (((i_3810_ & 0xff00) * anInt8974) & 0xff0000);
											int i_3820_ = ((i_3810_ & 0xff) * anInt8975 & 0xff00);
											is[i_3795_] = (i_3818_ | i_3819_ | i_3820_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_3821_ = aByteArray11394[i_3794_];
									int i_3822_ = (i_3821_ > 0 ? anIntArray11393[i_3821_] : 0);
									int i_3823_ = anInt8944;
									int i_3824_ = i_3822_ + i_3823_;
									int i_3825_ = ((i_3822_ & 0xff00ff) + (i_3823_ & 0xff00ff));
									int i_3826_ = ((i_3825_ & 0x1000100) + (i_3824_ - i_3825_ & 0x10000));
									i_3826_ = (i_3824_ - i_3826_ | i_3826_ - (i_3826_ >>> 8));
									if (i_3822_ == 0 && anInt8965 != 255) {
										i_3822_ = i_3826_;
										i_3826_ = is[i_3795_];
										i_3826_ = (((((i_3822_ & 0xff00ff) * anInt8965) + ((i_3826_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3822_ & 0xff00) * anInt8965) + ((i_3826_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_3795_] = i_3826_;
								} else if (i == 2) {
									int i_3827_ = aByteArray11394[i_3794_];
									if (i_3827_ != 0) {
										int i_3828_ = anIntArray11393[i_3827_ & 0xff];
										int i_3829_ = ((i_3828_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_3830_ = ((i_3828_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_3795_++] = ((i_3829_ | i_3830_) >>> 8) + anInt8978;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_3372_ == 2) {
								if (i == 1) {
									int i_3831_ = aByteArray11394[i_3794_];
									if (i_3831_ != 0) {
										int i_3832_ = anIntArray11393[i_3831_ & 0xff];
										int i_3833_ = is[i_3795_];
										int i_3834_ = i_3832_ + i_3833_;
										int i_3835_ = ((i_3832_ & 0xff00ff) + (i_3833_ & 0xff00ff));
										i_3833_ = ((i_3835_ & 0x1000100) + (i_3834_ - i_3835_ & 0x10000));
										is[i_3795_] = (i_3834_ - i_3833_ | i_3833_ - (i_3833_ >>> 8));
									}
								} else if (i == 0) {
									int i_3836_ = aByteArray11394[i_3794_];
									if (i_3836_ != 0) {
										int i_3837_ = anIntArray11393[i_3836_ & 0xff];
										int i_3838_ = ((i_3837_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_3839_ = ((i_3837_ & 0xff00) * anInt8974 & 0xff0000);
										int i_3840_ = ((i_3837_ & 0xff) * anInt8975 & 0xff00);
										i_3837_ = (i_3838_ | i_3839_ | i_3840_) >>> 8;
										int i_3841_ = is[i_3795_];
										int i_3842_ = i_3837_ + i_3841_;
										int i_3843_ = ((i_3837_ & 0xff00ff) + (i_3841_ & 0xff00ff));
										i_3841_ = ((i_3843_ & 0x1000100) + (i_3842_ - i_3843_ & 0x10000));
										is[i_3795_] = (i_3842_ - i_3841_ | i_3841_ - (i_3841_ >>> 8));
									}
								} else if (i == 3) {
									byte i_3844_ = aByteArray11394[i_3794_];
									int i_3845_ = (i_3844_ > 0 ? anIntArray11393[i_3844_] : 0);
									int i_3846_ = anInt8944;
									int i_3847_ = i_3845_ + i_3846_;
									int i_3848_ = ((i_3845_ & 0xff00ff) + (i_3846_ & 0xff00ff));
									int i_3849_ = ((i_3848_ & 0x1000100) + (i_3847_ - i_3848_ & 0x10000));
									i_3849_ = (i_3847_ - i_3849_ | i_3849_ - (i_3849_ >>> 8));
									if (i_3845_ == 0 && anInt8965 != 255) {
										i_3845_ = i_3849_;
										i_3849_ = is[i_3795_];
										i_3849_ = (((((i_3845_ & 0xff00ff) * anInt8965) + ((i_3849_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3845_ & 0xff00) * anInt8965) + ((i_3849_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_3795_] = i_3849_;
								} else if (i == 2) {
									int i_3850_ = aByteArray11394[i_3794_];
									if (i_3850_ != 0) {
										int i_3851_ = anIntArray11393[i_3850_ & 0xff];
										int i_3852_ = ((i_3851_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_3853_ = ((i_3851_ & 0xff00) * anInt8965 & 0xff0000);
										i_3851_ = (((i_3852_ | i_3853_) >>> 8) + anInt8978);
										int i_3854_ = is[i_3795_];
										int i_3855_ = i_3851_ + i_3854_;
										int i_3856_ = ((i_3851_ & 0xff00ff) + (i_3854_ & 0xff00ff));
										i_3854_ = ((i_3856_ & 0x1000100) + (i_3855_ - i_3856_ & 0x10000));
										is[i_3795_] = (i_3855_ - i_3854_ | i_3854_ - (i_3854_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_3789_ += anInt8960;
						}
					}
					i_3787_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				for (int i_3857_ = anInt8957; i_3857_ < 0; i_3857_++) {
					int i_3858_ = anInt8959;
					int i_3859_ = anInt8966 + anInt8968;
					int i_3860_ = anInt8967 + anInt8969;
					int i_3861_ = anInt8955;
					if (i_3859_ < 0) {
						int i_3862_ = (anInt8960 - 1 - i_3859_) / anInt8960;
						i_3861_ += i_3862_;
						i_3859_ += anInt8960 * i_3862_;
						i_3860_ += anInt8962 * i_3862_;
						i_3858_ += i_3862_;
					}
					int i_3863_;
					if ((i_3863_ = (1 + i_3859_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_3861_)
						i_3861_ = i_3863_;
					if ((i_3863_ = i_3860_ - (anInt8950 << 12)) >= 0) {
						i_3863_ = (anInt8962 - i_3863_) / anInt8962;
						i_3861_ += i_3863_;
						i_3859_ += anInt8960 * i_3863_;
						i_3860_ += anInt8962 * i_3863_;
						i_3858_ += i_3863_;
					}
					if ((i_3863_ = (i_3860_ - anInt8962) / anInt8962) > i_3861_)
						i_3861_ = i_3863_;
					for (/**/; i_3861_ < 0; i_3861_++) {
						int i_3864_ = (i_3860_ >> 12) * anInt8945 + (i_3859_ >> 12);
						int i_3865_ = i_3858_++;
						if (i_3372_ == 0) {
							if (i == 1)
								is[i_3865_] = (anIntArray11393[aByteArray11394[i_3864_] & 0xff]);
							else if (i == 0) {
								int i_3866_ = (anIntArray11393[aByteArray11394[i_3864_] & 0xff]);
								int i_3867_ = ((i_3866_ & 0xff0000) * anInt8973 & ~0xffffff);
								int i_3868_ = ((i_3866_ & 0xff00) * anInt8974 & 0xff0000);
								int i_3869_ = (i_3866_ & 0xff) * anInt8975 & 0xff00;
								is[i_3865_] = (i_3867_ | i_3868_ | i_3869_) >>> 8;
							} else if (i == 3) {
								int i_3870_ = (anIntArray11393[aByteArray11394[i_3864_] & 0xff]);
								int i_3871_ = anInt8944;
								int i_3872_ = i_3870_ + i_3871_;
								int i_3873_ = ((i_3870_ & 0xff00ff) + (i_3871_ & 0xff00ff));
								int i_3874_ = ((i_3873_ & 0x1000100) + (i_3872_ - i_3873_ & 0x10000));
								is[i_3865_] = i_3872_ - i_3874_ | i_3874_ - (i_3874_ >>> 8);
							} else if (i == 2) {
								int i_3875_ = (anIntArray11393[aByteArray11394[i_3864_] & 0xff]);
								int i_3876_ = ((i_3875_ & 0xff00ff) * anInt8965 & ~0xff00ff);
								int i_3877_ = ((i_3875_ & 0xff00) * anInt8965 & 0xff0000);
								is[i_3865_] = ((i_3876_ | i_3877_) >>> 8) + anInt8978;
							} else
								throw new IllegalArgumentException();
						} else if (i_3372_ == 1) {
							if (i == 1) {
								int i_3878_ = aByteArray11394[i_3864_];
								if (i_3878_ != 0)
									is[i_3865_] = anIntArray11393[i_3878_ & 0xff];
							} else if (i == 0) {
								int i_3879_ = aByteArray11394[i_3864_];
								if (i_3879_ != 0) {
									int i_3880_ = anIntArray11393[i_3879_ & 0xff];
									if ((anInt8944 & 0xffffff) == 16777215) {
										int i_3881_ = anInt8944 >>> 24;
										int i_3882_ = 256 - i_3881_;
										int i_3883_ = is[i_3865_];
										is[i_3865_] = ((((i_3880_ & 0xff00ff) * i_3881_ + ((i_3883_ & 0xff00ff) * i_3882_)) & ~0xff00ff) + (((i_3880_ & 0xff00) * i_3881_ + ((i_3883_ & 0xff00) * i_3882_)) & 0xff0000)) >> 8;
									} else if (anInt8965 != 255) {
										int i_3884_ = ((i_3880_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_3885_ = ((i_3880_ & 0xff00) * anInt8974 & 0xff0000);
										int i_3886_ = ((i_3880_ & 0xff) * anInt8975 & 0xff00);
										i_3880_ = (i_3884_ | i_3885_ | i_3886_) >>> 8;
										int i_3887_ = is[i_3865_];
										is[i_3865_] = (((((i_3880_ & 0xff00ff) * anInt8965) + ((i_3887_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3880_ & 0xff00) * anInt8965) + ((i_3887_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									} else {
										int i_3888_ = ((i_3880_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_3889_ = ((i_3880_ & 0xff00) * anInt8974 & 0xff0000);
										int i_3890_ = ((i_3880_ & 0xff) * anInt8975 & 0xff00);
										is[i_3865_] = (i_3888_ | i_3889_ | i_3890_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_3891_ = aByteArray11394[i_3864_];
								int i_3892_ = (i_3891_ > 0 ? anIntArray11393[i_3891_] : 0);
								int i_3893_ = anInt8944;
								int i_3894_ = i_3892_ + i_3893_;
								int i_3895_ = ((i_3892_ & 0xff00ff) + (i_3893_ & 0xff00ff));
								int i_3896_ = ((i_3895_ & 0x1000100) + (i_3894_ - i_3895_ & 0x10000));
								i_3896_ = i_3894_ - i_3896_ | i_3896_ - (i_3896_ >>> 8);
								if (i_3892_ == 0 && anInt8965 != 255) {
									i_3892_ = i_3896_;
									i_3896_ = is[i_3865_];
									i_3896_ = ((((i_3892_ & 0xff00ff) * anInt8965 + ((i_3896_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + (((i_3892_ & 0xff00) * anInt8965 + ((i_3896_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
								}
								is[i_3865_] = i_3896_;
							} else if (i == 2) {
								int i_3897_ = aByteArray11394[i_3864_];
								if (i_3897_ != 0) {
									int i_3898_ = anIntArray11393[i_3897_ & 0xff];
									int i_3899_ = ((i_3898_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_3900_ = ((i_3898_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_3865_++] = ((i_3899_ | i_3900_) >>> 8) + anInt8978;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_3372_ == 2) {
							if (i == 1) {
								int i_3901_ = aByteArray11394[i_3864_];
								if (i_3901_ != 0) {
									int i_3902_ = anIntArray11393[i_3901_ & 0xff];
									int i_3903_ = is[i_3865_];
									int i_3904_ = i_3902_ + i_3903_;
									int i_3905_ = ((i_3902_ & 0xff00ff) + (i_3903_ & 0xff00ff));
									i_3903_ = ((i_3905_ & 0x1000100) + (i_3904_ - i_3905_ & 0x10000));
									is[i_3865_] = (i_3904_ - i_3903_ | i_3903_ - (i_3903_ >>> 8));
								}
							} else if (i == 0) {
								int i_3906_ = aByteArray11394[i_3864_];
								if (i_3906_ != 0) {
									int i_3907_ = anIntArray11393[i_3906_ & 0xff];
									int i_3908_ = ((i_3907_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_3909_ = ((i_3907_ & 0xff00) * anInt8974 & 0xff0000);
									int i_3910_ = ((i_3907_ & 0xff) * anInt8975 & 0xff00);
									i_3907_ = (i_3908_ | i_3909_ | i_3910_) >>> 8;
									int i_3911_ = is[i_3865_];
									int i_3912_ = i_3907_ + i_3911_;
									int i_3913_ = ((i_3907_ & 0xff00ff) + (i_3911_ & 0xff00ff));
									i_3911_ = ((i_3913_ & 0x1000100) + (i_3912_ - i_3913_ & 0x10000));
									is[i_3865_] = (i_3912_ - i_3911_ | i_3911_ - (i_3911_ >>> 8));
								}
							} else if (i == 3) {
								byte i_3914_ = aByteArray11394[i_3864_];
								int i_3915_ = (i_3914_ > 0 ? anIntArray11393[i_3914_] : 0);
								int i_3916_ = anInt8944;
								int i_3917_ = i_3915_ + i_3916_;
								int i_3918_ = ((i_3915_ & 0xff00ff) + (i_3916_ & 0xff00ff));
								int i_3919_ = ((i_3918_ & 0x1000100) + (i_3917_ - i_3918_ & 0x10000));
								i_3919_ = i_3917_ - i_3919_ | i_3919_ - (i_3919_ >>> 8);
								if (i_3915_ == 0 && anInt8965 != 255) {
									i_3915_ = i_3919_;
									i_3919_ = is[i_3865_];
									i_3919_ = ((((i_3915_ & 0xff00ff) * anInt8965 + ((i_3919_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + (((i_3915_ & 0xff00) * anInt8965 + ((i_3919_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
								}
								is[i_3865_] = i_3919_;
							} else if (i == 2) {
								int i_3920_ = aByteArray11394[i_3864_];
								if (i_3920_ != 0) {
									int i_3921_ = anIntArray11393[i_3920_ & 0xff];
									int i_3922_ = ((i_3921_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_3923_ = ((i_3921_ & 0xff00) * anInt8965 & 0xff0000);
									i_3921_ = (((i_3922_ | i_3923_) >>> 8) + anInt8978);
									int i_3924_ = is[i_3865_];
									int i_3925_ = i_3921_ + i_3924_;
									int i_3926_ = ((i_3921_ & 0xff00ff) + (i_3924_ & 0xff00ff));
									i_3924_ = ((i_3926_ & 0x1000100) + (i_3925_ - i_3926_ & 0x10000));
									is[i_3865_] = (i_3925_ - i_3924_ | i_3924_ - (i_3924_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_3859_ += anInt8960;
						i_3860_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				for (int i_3927_ = anInt8957; i_3927_ < 0; i_3927_++) {
					int i_3928_ = anInt8959;
					int i_3929_ = anInt8966 + anInt8968;
					int i_3930_ = anInt8967 + anInt8969;
					int i_3931_ = anInt8955;
					if (i_3929_ < 0) {
						int i_3932_ = (anInt8960 - 1 - i_3929_) / anInt8960;
						i_3931_ += i_3932_;
						i_3929_ += anInt8960 * i_3932_;
						i_3930_ += anInt8962 * i_3932_;
						i_3928_ += i_3932_;
					}
					int i_3933_;
					if ((i_3933_ = (1 + i_3929_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_3931_)
						i_3931_ = i_3933_;
					if (i_3930_ < 0) {
						i_3933_ = (anInt8962 - 1 - i_3930_) / anInt8962;
						i_3931_ += i_3933_;
						i_3929_ += anInt8960 * i_3933_;
						i_3930_ += anInt8962 * i_3933_;
						i_3928_ += i_3933_;
					}
					if ((i_3933_ = (1 + i_3930_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_3931_)
						i_3931_ = i_3933_;
					for (/**/; i_3931_ < 0; i_3931_++) {
						int i_3934_ = (i_3930_ >> 12) * anInt8945 + (i_3929_ >> 12);
						int i_3935_ = i_3928_++;
						if (i_3372_ == 0) {
							if (i == 1)
								is[i_3935_] = (anIntArray11393[aByteArray11394[i_3934_] & 0xff]);
							else if (i == 0) {
								int i_3936_ = (anIntArray11393[aByteArray11394[i_3934_] & 0xff]);
								int i_3937_ = ((i_3936_ & 0xff0000) * anInt8973 & ~0xffffff);
								int i_3938_ = ((i_3936_ & 0xff00) * anInt8974 & 0xff0000);
								int i_3939_ = (i_3936_ & 0xff) * anInt8975 & 0xff00;
								is[i_3935_] = (i_3937_ | i_3938_ | i_3939_) >>> 8;
							} else if (i == 3) {
								int i_3940_ = (anIntArray11393[aByteArray11394[i_3934_] & 0xff]);
								int i_3941_ = anInt8944;
								int i_3942_ = i_3940_ + i_3941_;
								int i_3943_ = ((i_3940_ & 0xff00ff) + (i_3941_ & 0xff00ff));
								int i_3944_ = ((i_3943_ & 0x1000100) + (i_3942_ - i_3943_ & 0x10000));
								is[i_3935_] = i_3942_ - i_3944_ | i_3944_ - (i_3944_ >>> 8);
							} else if (i == 2) {
								int i_3945_ = (anIntArray11393[aByteArray11394[i_3934_] & 0xff]);
								int i_3946_ = ((i_3945_ & 0xff00ff) * anInt8965 & ~0xff00ff);
								int i_3947_ = ((i_3945_ & 0xff00) * anInt8965 & 0xff0000);
								is[i_3935_] = ((i_3946_ | i_3947_) >>> 8) + anInt8978;
							} else
								throw new IllegalArgumentException();
						} else if (i_3372_ == 1) {
							if (i == 1) {
								int i_3948_ = aByteArray11394[i_3934_];
								if (i_3948_ != 0)
									is[i_3935_] = anIntArray11393[i_3948_ & 0xff];
							} else if (i == 0) {
								int i_3949_ = aByteArray11394[i_3934_];
								if (i_3949_ != 0) {
									int i_3950_ = anIntArray11393[i_3949_ & 0xff];
									if ((anInt8944 & 0xffffff) == 16777215) {
										int i_3951_ = anInt8944 >>> 24;
										int i_3952_ = 256 - i_3951_;
										int i_3953_ = is[i_3935_];
										is[i_3935_] = ((((i_3950_ & 0xff00ff) * i_3951_ + ((i_3953_ & 0xff00ff) * i_3952_)) & ~0xff00ff) + (((i_3950_ & 0xff00) * i_3951_ + ((i_3953_ & 0xff00) * i_3952_)) & 0xff0000)) >> 8;
									} else if (anInt8965 != 255) {
										int i_3954_ = ((i_3950_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_3955_ = ((i_3950_ & 0xff00) * anInt8974 & 0xff0000);
										int i_3956_ = ((i_3950_ & 0xff) * anInt8975 & 0xff00);
										i_3950_ = (i_3954_ | i_3955_ | i_3956_) >>> 8;
										int i_3957_ = is[i_3935_];
										is[i_3935_] = (((((i_3950_ & 0xff00ff) * anInt8965) + ((i_3957_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_3950_ & 0xff00) * anInt8965) + ((i_3957_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									} else {
										int i_3958_ = ((i_3950_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_3959_ = ((i_3950_ & 0xff00) * anInt8974 & 0xff0000);
										int i_3960_ = ((i_3950_ & 0xff) * anInt8975 & 0xff00);
										is[i_3935_] = (i_3958_ | i_3959_ | i_3960_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_3961_ = aByteArray11394[i_3934_];
								int i_3962_ = (i_3961_ > 0 ? anIntArray11393[i_3961_] : 0);
								int i_3963_ = anInt8944;
								int i_3964_ = i_3962_ + i_3963_;
								int i_3965_ = ((i_3962_ & 0xff00ff) + (i_3963_ & 0xff00ff));
								int i_3966_ = ((i_3965_ & 0x1000100) + (i_3964_ - i_3965_ & 0x10000));
								i_3966_ = i_3964_ - i_3966_ | i_3966_ - (i_3966_ >>> 8);
								if (i_3962_ == 0 && anInt8965 != 255) {
									i_3962_ = i_3966_;
									i_3966_ = is[i_3935_];
									i_3966_ = ((((i_3962_ & 0xff00ff) * anInt8965 + ((i_3966_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + (((i_3962_ & 0xff00) * anInt8965 + ((i_3966_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
								}
								is[i_3935_] = i_3966_;
							} else if (i == 2) {
								int i_3967_ = aByteArray11394[i_3934_];
								if (i_3967_ != 0) {
									int i_3968_ = anIntArray11393[i_3967_ & 0xff];
									int i_3969_ = ((i_3968_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_3970_ = ((i_3968_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_3935_++] = ((i_3969_ | i_3970_) >>> 8) + anInt8978;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_3372_ == 2) {
							if (i == 1) {
								int i_3971_ = aByteArray11394[i_3934_];
								if (i_3971_ != 0) {
									int i_3972_ = anIntArray11393[i_3971_ & 0xff];
									int i_3973_ = is[i_3935_];
									int i_3974_ = i_3972_ + i_3973_;
									int i_3975_ = ((i_3972_ & 0xff00ff) + (i_3973_ & 0xff00ff));
									i_3973_ = ((i_3975_ & 0x1000100) + (i_3974_ - i_3975_ & 0x10000));
									is[i_3935_] = (i_3974_ - i_3973_ | i_3973_ - (i_3973_ >>> 8));
								}
							} else if (i == 0) {
								int i_3976_ = aByteArray11394[i_3934_];
								if (i_3976_ != 0) {
									int i_3977_ = anIntArray11393[i_3976_ & 0xff];
									int i_3978_ = ((i_3977_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_3979_ = ((i_3977_ & 0xff00) * anInt8974 & 0xff0000);
									int i_3980_ = ((i_3977_ & 0xff) * anInt8975 & 0xff00);
									i_3977_ = (i_3978_ | i_3979_ | i_3980_) >>> 8;
									int i_3981_ = is[i_3935_];
									int i_3982_ = i_3977_ + i_3981_;
									int i_3983_ = ((i_3977_ & 0xff00ff) + (i_3981_ & 0xff00ff));
									i_3981_ = ((i_3983_ & 0x1000100) + (i_3982_ - i_3983_ & 0x10000));
									is[i_3935_] = (i_3982_ - i_3981_ | i_3981_ - (i_3981_ >>> 8));
								}
							} else if (i == 3) {
								byte i_3984_ = aByteArray11394[i_3934_];
								int i_3985_ = (i_3984_ > 0 ? anIntArray11393[i_3984_] : 0);
								int i_3986_ = anInt8944;
								int i_3987_ = i_3985_ + i_3986_;
								int i_3988_ = ((i_3985_ & 0xff00ff) + (i_3986_ & 0xff00ff));
								int i_3989_ = ((i_3988_ & 0x1000100) + (i_3987_ - i_3988_ & 0x10000));
								i_3989_ = i_3987_ - i_3989_ | i_3989_ - (i_3989_ >>> 8);
								if (i_3985_ == 0 && anInt8965 != 255) {
									i_3985_ = i_3989_;
									i_3989_ = is[i_3935_];
									i_3989_ = ((((i_3985_ & 0xff00ff) * anInt8965 + ((i_3989_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + (((i_3985_ & 0xff00) * anInt8965 + ((i_3989_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
								}
								is[i_3935_] = i_3989_;
							} else if (i == 2) {
								int i_3990_ = aByteArray11394[i_3934_];
								if (i_3990_ != 0) {
									int i_3991_ = anIntArray11393[i_3990_ & 0xff];
									int i_3992_ = ((i_3991_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_3993_ = ((i_3991_ & 0xff00) * anInt8965 & 0xff0000);
									i_3991_ = (((i_3992_ | i_3993_) >>> 8) + anInt8978);
									int i_3994_ = is[i_3935_];
									int i_3995_ = i_3991_ + i_3994_;
									int i_3996_ = ((i_3991_ & 0xff00ff) + (i_3994_ & 0xff00ff));
									i_3994_ = ((i_3996_ & 0x1000100) + (i_3995_ - i_3996_ & 0x10000));
									is[i_3935_] = (i_3995_ - i_3994_ | i_3994_ - (i_3994_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_3929_ += anInt8960;
						i_3930_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	public void method1762(int i, int i_3997_, Class161 class161, int i_3998_, int i_3999_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			i += anInt8977;
			i_3997_ += anInt8947;
			int i_4000_ = 0;
			int i_4001_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			int i_4002_ = anInt8945;
			int i_4003_ = anInt8950;
			int i_4004_ = i_4001_ - i_4002_;
			int i_4005_ = 0;
			int i_4006_ = i + i_3997_ * i_4001_;
			if (i_3997_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_4007_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_3997_;
				i_4003_ -= i_4007_;
				i_3997_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_4000_ += i_4007_ * i_4002_;
				i_4006_ += i_4007_ * i_4001_;
			}
			if (i_3997_ + i_4003_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_4003_ -= (i_3997_ + i_4003_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_4008_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_4002_ -= i_4008_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_4000_ += i_4008_;
				i_4006_ += i_4008_;
				i_4005_ += i_4008_;
				i_4004_ += i_4008_;
			}
			if (i + i_4002_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_4009_ = i + i_4002_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_4002_ -= i_4009_;
				i_4005_ += i_4009_;
				i_4004_ += i_4009_;
			}
			if (i_4002_ > 0 && i_4003_ > 0) {
				Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
				int[] is_4010_ = class161_sub2.anIntArray9444;
				int[] is_4011_ = class161_sub2.anIntArray9445;
				int i_4012_ = i_3997_;
				if (i_3999_ > i_4012_) {
					i_4012_ = i_3999_;
					i_4006_ += (i_3999_ - i_3997_) * i_4001_;
					i_4000_ += (i_3999_ - i_3997_) * anInt8945;
				}
				int i_4013_ = (i_3999_ + is_4010_.length < i_3997_ + i_4003_ ? i_3999_ + is_4010_.length : i_3997_ + i_4003_);
				for (int i_4014_ = i_4012_; i_4014_ < i_4013_; i_4014_++) {
					int i_4015_ = is_4010_[i_4014_ - i_3999_] + i_3998_;
					int i_4016_ = is_4011_[i_4014_ - i_3999_];
					int i_4017_ = i_4002_;
					if (i > i_4015_) {
						int i_4018_ = i - i_4015_;
						if (i_4018_ >= i_4016_) {
							i_4000_ += i_4002_ + i_4005_;
							i_4006_ += i_4002_ + i_4004_;
							continue;
						}
						i_4016_ -= i_4018_;
					} else {
						int i_4019_ = i_4015_ - i;
						if (i_4019_ >= i_4002_) {
							i_4000_ += i_4002_ + i_4005_;
							i_4006_ += i_4002_ + i_4004_;
							continue;
						}
						i_4000_ += i_4019_;
						i_4017_ -= i_4019_;
						i_4006_ += i_4019_;
					}
					int i_4020_ = 0;
					if (i_4017_ < i_4016_)
						i_4016_ = i_4017_;
					else
						i_4020_ = i_4017_ - i_4016_;
					for (int i_4021_ = -i_4016_; i_4021_ < 0; i_4021_++) {
						int i_4022_ = aByteArray11394[i_4000_++];
						if (i_4022_ != 0)
							is[i_4006_++] = anIntArray11393[i_4022_ & 0xff];
						else
							i_4006_++;
					}
					i_4000_ += i_4020_ + i_4005_;
					i_4006_ += i_4020_ + i_4004_;
				}
			}
		}
	}

	public void method1788(int i, int i_4023_, Class161 class161, int i_4024_, int i_4025_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			i += anInt8977;
			i_4023_ += anInt8947;
			int i_4026_ = 0;
			int i_4027_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			int i_4028_ = anInt8945;
			int i_4029_ = anInt8950;
			int i_4030_ = i_4027_ - i_4028_;
			int i_4031_ = 0;
			int i_4032_ = i + i_4023_ * i_4027_;
			if (i_4023_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_4033_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_4023_;
				i_4029_ -= i_4033_;
				i_4023_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_4026_ += i_4033_ * i_4028_;
				i_4032_ += i_4033_ * i_4027_;
			}
			if (i_4023_ + i_4029_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_4029_ -= (i_4023_ + i_4029_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_4034_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_4028_ -= i_4034_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_4026_ += i_4034_;
				i_4032_ += i_4034_;
				i_4031_ += i_4034_;
				i_4030_ += i_4034_;
			}
			if (i + i_4028_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_4035_ = i + i_4028_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_4028_ -= i_4035_;
				i_4031_ += i_4035_;
				i_4030_ += i_4035_;
			}
			if (i_4028_ > 0 && i_4029_ > 0) {
				Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
				int[] is_4036_ = class161_sub2.anIntArray9444;
				int[] is_4037_ = class161_sub2.anIntArray9445;
				int i_4038_ = i_4023_;
				if (i_4025_ > i_4038_) {
					i_4038_ = i_4025_;
					i_4032_ += (i_4025_ - i_4023_) * i_4027_;
					i_4026_ += (i_4025_ - i_4023_) * anInt8945;
				}
				int i_4039_ = (i_4025_ + is_4036_.length < i_4023_ + i_4029_ ? i_4025_ + is_4036_.length : i_4023_ + i_4029_);
				for (int i_4040_ = i_4038_; i_4040_ < i_4039_; i_4040_++) {
					int i_4041_ = is_4036_[i_4040_ - i_4025_] + i_4024_;
					int i_4042_ = is_4037_[i_4040_ - i_4025_];
					int i_4043_ = i_4028_;
					if (i > i_4041_) {
						int i_4044_ = i - i_4041_;
						if (i_4044_ >= i_4042_) {
							i_4026_ += i_4028_ + i_4031_;
							i_4032_ += i_4028_ + i_4030_;
							continue;
						}
						i_4042_ -= i_4044_;
					} else {
						int i_4045_ = i_4041_ - i;
						if (i_4045_ >= i_4028_) {
							i_4026_ += i_4028_ + i_4031_;
							i_4032_ += i_4028_ + i_4030_;
							continue;
						}
						i_4026_ += i_4045_;
						i_4043_ -= i_4045_;
						i_4032_ += i_4045_;
					}
					int i_4046_ = 0;
					if (i_4043_ < i_4042_)
						i_4042_ = i_4043_;
					else
						i_4046_ = i_4043_ - i_4042_;
					for (int i_4047_ = -i_4042_; i_4047_ < 0; i_4047_++) {
						int i_4048_ = aByteArray11394[i_4026_++];
						if (i_4048_ != 0)
							is[i_4032_++] = anIntArray11393[i_4048_ & 0xff];
						else
							i_4032_++;
					}
					i_4026_ += i_4046_ + i_4031_;
					i_4032_ += i_4046_ + i_4030_;
				}
			}
		}
	}

	void method8439(int i, int i_4049_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_4050_ = anInt8957;
					while (i_4050_ < 0) {
						int i_4051_ = anInt8959;
						int i_4052_ = anInt8966;
						int i_4053_ = anInt8967;
						int i_4054_ = anInt8955;
						if (i_4052_ >= 0 && i_4053_ >= 0 && i_4052_ - (anInt8945 << 12) < 0 && i_4053_ - (anInt8950 << 12) < 0) {
							for (/**/; i_4054_ < 0; i_4054_++) {
								int i_4055_ = ((i_4053_ >> 12) * anInt8945 + (i_4052_ >> 12));
								int i_4056_ = i_4051_++;
								if (i_4049_ == 0) {
									if (i == 1)
										is[i_4056_] = (anIntArray11393[(aByteArray11394[i_4055_] & 0xff)]);
									else if (i == 0) {
										int i_4057_ = (anIntArray11393[(aByteArray11394[i_4055_] & 0xff)]);
										int i_4058_ = ((i_4057_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_4059_ = ((i_4057_ & 0xff00) * anInt8974 & 0xff0000);
										int i_4060_ = ((i_4057_ & 0xff) * anInt8975 & 0xff00);
										is[i_4056_] = (i_4058_ | i_4059_ | i_4060_) >>> 8;
									} else if (i == 3) {
										int i_4061_ = (anIntArray11393[(aByteArray11394[i_4055_] & 0xff)]);
										int i_4062_ = anInt8944;
										int i_4063_ = i_4061_ + i_4062_;
										int i_4064_ = ((i_4061_ & 0xff00ff) + (i_4062_ & 0xff00ff));
										int i_4065_ = ((i_4064_ & 0x1000100) + (i_4063_ - i_4064_ & 0x10000));
										is[i_4056_] = (i_4063_ - i_4065_ | i_4065_ - (i_4065_ >>> 8));
									} else if (i == 2) {
										int i_4066_ = (anIntArray11393[(aByteArray11394[i_4055_] & 0xff)]);
										int i_4067_ = ((i_4066_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_4068_ = ((i_4066_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_4056_] = ((i_4067_ | i_4068_) >>> 8) + anInt8978;
									} else
										throw new IllegalArgumentException();
								} else if (i_4049_ == 1) {
									if (i == 1) {
										int i_4069_ = aByteArray11394[i_4055_];
										if (i_4069_ != 0)
											is[i_4056_] = (anIntArray11393[i_4069_ & 0xff]);
									} else if (i == 0) {
										int i_4070_ = aByteArray11394[i_4055_];
										if (i_4070_ != 0) {
											int i_4071_ = (anIntArray11393[i_4070_ & 0xff]);
											if ((anInt8944 & 0xffffff) == 16777215) {
												int i_4072_ = anInt8944 >>> 24;
												int i_4073_ = 256 - i_4072_;
												int i_4074_ = is[i_4056_];
												is[i_4056_] = (((((i_4071_ & 0xff00ff) * i_4072_) + ((i_4074_ & 0xff00ff) * i_4073_)) & ~0xff00ff) + ((((i_4071_ & 0xff00) * i_4072_) + ((i_4074_ & 0xff00) * i_4073_)) & 0xff0000)) >> 8;
											} else if (anInt8965 != 255) {
												int i_4075_ = (((i_4071_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_4076_ = (((i_4071_ & 0xff00) * anInt8974) & 0xff0000);
												int i_4077_ = (((i_4071_ & 0xff) * anInt8975) & 0xff00);
												i_4071_ = (i_4075_ | i_4076_ | i_4077_) >>> 8;
												int i_4078_ = is[i_4056_];
												is[i_4056_] = (((((i_4071_ & 0xff00ff) * anInt8965) + ((i_4078_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4071_ & 0xff00) * anInt8965) + ((i_4078_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
											} else {
												int i_4079_ = (((i_4071_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_4080_ = (((i_4071_ & 0xff00) * anInt8974) & 0xff0000);
												int i_4081_ = (((i_4071_ & 0xff) * anInt8975) & 0xff00);
												is[i_4056_] = (i_4079_ | i_4080_ | i_4081_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_4082_ = aByteArray11394[i_4055_];
										int i_4083_ = (i_4082_ > 0 ? anIntArray11393[i_4082_] : 0);
										int i_4084_ = anInt8944;
										int i_4085_ = i_4083_ + i_4084_;
										int i_4086_ = ((i_4083_ & 0xff00ff) + (i_4084_ & 0xff00ff));
										int i_4087_ = ((i_4086_ & 0x1000100) + (i_4085_ - i_4086_ & 0x10000));
										i_4087_ = (i_4085_ - i_4087_ | i_4087_ - (i_4087_ >>> 8));
										if (i_4083_ == 0 && anInt8965 != 255) {
											i_4083_ = i_4087_;
											i_4087_ = is[i_4056_];
											i_4087_ = (((((i_4083_ & 0xff00ff) * anInt8965) + ((i_4087_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4083_ & 0xff00) * anInt8965) + ((i_4087_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_4056_] = i_4087_;
									} else if (i == 2) {
										int i_4088_ = aByteArray11394[i_4055_];
										if (i_4088_ != 0) {
											int i_4089_ = (anIntArray11393[i_4088_ & 0xff]);
											int i_4090_ = (((i_4089_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_4091_ = (((i_4089_ & 0xff00) * anInt8965) & 0xff0000);
											is[i_4056_++] = (((i_4090_ | i_4091_) >>> 8) + anInt8978);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_4049_ == 2) {
									if (i == 1) {
										int i_4092_ = aByteArray11394[i_4055_];
										if (i_4092_ != 0) {
											int i_4093_ = (anIntArray11393[i_4092_ & 0xff]);
											int i_4094_ = is[i_4056_];
											int i_4095_ = i_4093_ + i_4094_;
											int i_4096_ = ((i_4093_ & 0xff00ff) + (i_4094_ & 0xff00ff));
											i_4094_ = ((i_4096_ & 0x1000100) + (i_4095_ - i_4096_ & 0x10000));
											is[i_4056_] = (i_4095_ - i_4094_ | i_4094_ - (i_4094_ >>> 8));
										}
									} else if (i == 0) {
										int i_4097_ = aByteArray11394[i_4055_];
										if (i_4097_ != 0) {
											int i_4098_ = (anIntArray11393[i_4097_ & 0xff]);
											int i_4099_ = (((i_4098_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_4100_ = (((i_4098_ & 0xff00) * anInt8974) & 0xff0000);
											int i_4101_ = ((i_4098_ & 0xff) * anInt8975 & 0xff00);
											i_4098_ = (i_4099_ | i_4100_ | i_4101_) >>> 8;
											int i_4102_ = is[i_4056_];
											int i_4103_ = i_4098_ + i_4102_;
											int i_4104_ = ((i_4098_ & 0xff00ff) + (i_4102_ & 0xff00ff));
											i_4102_ = ((i_4104_ & 0x1000100) + (i_4103_ - i_4104_ & 0x10000));
											is[i_4056_] = (i_4103_ - i_4102_ | i_4102_ - (i_4102_ >>> 8));
										}
									} else if (i == 3) {
										byte i_4105_ = aByteArray11394[i_4055_];
										int i_4106_ = (i_4105_ > 0 ? anIntArray11393[i_4105_] : 0);
										int i_4107_ = anInt8944;
										int i_4108_ = i_4106_ + i_4107_;
										int i_4109_ = ((i_4106_ & 0xff00ff) + (i_4107_ & 0xff00ff));
										int i_4110_ = ((i_4109_ & 0x1000100) + (i_4108_ - i_4109_ & 0x10000));
										i_4110_ = (i_4108_ - i_4110_ | i_4110_ - (i_4110_ >>> 8));
										if (i_4106_ == 0 && anInt8965 != 255) {
											i_4106_ = i_4110_;
											i_4110_ = is[i_4056_];
											i_4110_ = (((((i_4106_ & 0xff00ff) * anInt8965) + ((i_4110_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4106_ & 0xff00) * anInt8965) + ((i_4110_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_4056_] = i_4110_;
									} else if (i == 2) {
										int i_4111_ = aByteArray11394[i_4055_];
										if (i_4111_ != 0) {
											int i_4112_ = (anIntArray11393[i_4111_ & 0xff]);
											int i_4113_ = (((i_4112_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_4114_ = (((i_4112_ & 0xff00) * anInt8965) & 0xff0000);
											i_4112_ = ((i_4113_ | i_4114_) >>> 8) + anInt8978;
											int i_4115_ = is[i_4056_];
											int i_4116_ = i_4112_ + i_4115_;
											int i_4117_ = ((i_4112_ & 0xff00ff) + (i_4115_ & 0xff00ff));
											i_4115_ = ((i_4117_ & 0x1000100) + (i_4116_ - i_4117_ & 0x10000));
											is[i_4056_] = (i_4116_ - i_4115_ | i_4115_ - (i_4115_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_4050_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_4118_ = anInt8957;
					while (i_4118_ < 0) {
						int i_4119_ = anInt8959;
						int i_4120_ = anInt8966;
						int i_4121_ = anInt8967 + anInt8969;
						int i_4122_ = anInt8955;
						if (i_4120_ >= 0 && i_4120_ - (anInt8945 << 12) < 0) {
							int i_4123_;
							if ((i_4123_ = i_4121_ - (anInt8950 << 12)) >= 0) {
								i_4123_ = (anInt8962 - i_4123_) / anInt8962;
								i_4122_ += i_4123_;
								i_4121_ += anInt8962 * i_4123_;
								i_4119_ += i_4123_;
							}
							if ((i_4123_ = (i_4121_ - anInt8962) / anInt8962) > i_4122_)
								i_4122_ = i_4123_;
							for (/**/; i_4122_ < 0; i_4122_++) {
								int i_4124_ = ((i_4121_ >> 12) * anInt8945 + (i_4120_ >> 12));
								int i_4125_ = i_4119_++;
								if (i_4049_ == 0) {
									if (i == 1)
										is[i_4125_] = (anIntArray11393[(aByteArray11394[i_4124_] & 0xff)]);
									else if (i == 0) {
										int i_4126_ = (anIntArray11393[(aByteArray11394[i_4124_] & 0xff)]);
										int i_4127_ = ((i_4126_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_4128_ = ((i_4126_ & 0xff00) * anInt8974 & 0xff0000);
										int i_4129_ = ((i_4126_ & 0xff) * anInt8975 & 0xff00);
										is[i_4125_] = (i_4127_ | i_4128_ | i_4129_) >>> 8;
									} else if (i == 3) {
										int i_4130_ = (anIntArray11393[(aByteArray11394[i_4124_] & 0xff)]);
										int i_4131_ = anInt8944;
										int i_4132_ = i_4130_ + i_4131_;
										int i_4133_ = ((i_4130_ & 0xff00ff) + (i_4131_ & 0xff00ff));
										int i_4134_ = ((i_4133_ & 0x1000100) + (i_4132_ - i_4133_ & 0x10000));
										is[i_4125_] = (i_4132_ - i_4134_ | i_4134_ - (i_4134_ >>> 8));
									} else if (i == 2) {
										int i_4135_ = (anIntArray11393[(aByteArray11394[i_4124_] & 0xff)]);
										int i_4136_ = ((i_4135_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_4137_ = ((i_4135_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_4125_] = ((i_4136_ | i_4137_) >>> 8) + anInt8978;
									} else
										throw new IllegalArgumentException();
								} else if (i_4049_ == 1) {
									if (i == 1) {
										int i_4138_ = aByteArray11394[i_4124_];
										if (i_4138_ != 0)
											is[i_4125_] = (anIntArray11393[i_4138_ & 0xff]);
									} else if (i == 0) {
										int i_4139_ = aByteArray11394[i_4124_];
										if (i_4139_ != 0) {
											int i_4140_ = (anIntArray11393[i_4139_ & 0xff]);
											if ((anInt8944 & 0xffffff) == 16777215) {
												int i_4141_ = anInt8944 >>> 24;
												int i_4142_ = 256 - i_4141_;
												int i_4143_ = is[i_4125_];
												is[i_4125_] = (((((i_4140_ & 0xff00ff) * i_4141_) + ((i_4143_ & 0xff00ff) * i_4142_)) & ~0xff00ff) + ((((i_4140_ & 0xff00) * i_4141_) + ((i_4143_ & 0xff00) * i_4142_)) & 0xff0000)) >> 8;
											} else if (anInt8965 != 255) {
												int i_4144_ = (((i_4140_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_4145_ = (((i_4140_ & 0xff00) * anInt8974) & 0xff0000);
												int i_4146_ = (((i_4140_ & 0xff) * anInt8975) & 0xff00);
												i_4140_ = (i_4144_ | i_4145_ | i_4146_) >>> 8;
												int i_4147_ = is[i_4125_];
												is[i_4125_] = (((((i_4140_ & 0xff00ff) * anInt8965) + ((i_4147_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4140_ & 0xff00) * anInt8965) + ((i_4147_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
											} else {
												int i_4148_ = (((i_4140_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_4149_ = (((i_4140_ & 0xff00) * anInt8974) & 0xff0000);
												int i_4150_ = (((i_4140_ & 0xff) * anInt8975) & 0xff00);
												is[i_4125_] = (i_4148_ | i_4149_ | i_4150_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_4151_ = aByteArray11394[i_4124_];
										int i_4152_ = (i_4151_ > 0 ? anIntArray11393[i_4151_] : 0);
										int i_4153_ = anInt8944;
										int i_4154_ = i_4152_ + i_4153_;
										int i_4155_ = ((i_4152_ & 0xff00ff) + (i_4153_ & 0xff00ff));
										int i_4156_ = ((i_4155_ & 0x1000100) + (i_4154_ - i_4155_ & 0x10000));
										i_4156_ = (i_4154_ - i_4156_ | i_4156_ - (i_4156_ >>> 8));
										if (i_4152_ == 0 && anInt8965 != 255) {
											i_4152_ = i_4156_;
											i_4156_ = is[i_4125_];
											i_4156_ = (((((i_4152_ & 0xff00ff) * anInt8965) + ((i_4156_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4152_ & 0xff00) * anInt8965) + ((i_4156_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_4125_] = i_4156_;
									} else if (i == 2) {
										int i_4157_ = aByteArray11394[i_4124_];
										if (i_4157_ != 0) {
											int i_4158_ = (anIntArray11393[i_4157_ & 0xff]);
											int i_4159_ = (((i_4158_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_4160_ = (((i_4158_ & 0xff00) * anInt8965) & 0xff0000);
											is[i_4125_++] = (((i_4159_ | i_4160_) >>> 8) + anInt8978);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_4049_ == 2) {
									if (i == 1) {
										int i_4161_ = aByteArray11394[i_4124_];
										if (i_4161_ != 0) {
											int i_4162_ = (anIntArray11393[i_4161_ & 0xff]);
											int i_4163_ = is[i_4125_];
											int i_4164_ = i_4162_ + i_4163_;
											int i_4165_ = ((i_4162_ & 0xff00ff) + (i_4163_ & 0xff00ff));
											i_4163_ = ((i_4165_ & 0x1000100) + (i_4164_ - i_4165_ & 0x10000));
											is[i_4125_] = (i_4164_ - i_4163_ | i_4163_ - (i_4163_ >>> 8));
										}
									} else if (i == 0) {
										int i_4166_ = aByteArray11394[i_4124_];
										if (i_4166_ != 0) {
											int i_4167_ = (anIntArray11393[i_4166_ & 0xff]);
											int i_4168_ = (((i_4167_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_4169_ = (((i_4167_ & 0xff00) * anInt8974) & 0xff0000);
											int i_4170_ = ((i_4167_ & 0xff) * anInt8975 & 0xff00);
											i_4167_ = (i_4168_ | i_4169_ | i_4170_) >>> 8;
											int i_4171_ = is[i_4125_];
											int i_4172_ = i_4167_ + i_4171_;
											int i_4173_ = ((i_4167_ & 0xff00ff) + (i_4171_ & 0xff00ff));
											i_4171_ = ((i_4173_ & 0x1000100) + (i_4172_ - i_4173_ & 0x10000));
											is[i_4125_] = (i_4172_ - i_4171_ | i_4171_ - (i_4171_ >>> 8));
										}
									} else if (i == 3) {
										byte i_4174_ = aByteArray11394[i_4124_];
										int i_4175_ = (i_4174_ > 0 ? anIntArray11393[i_4174_] : 0);
										int i_4176_ = anInt8944;
										int i_4177_ = i_4175_ + i_4176_;
										int i_4178_ = ((i_4175_ & 0xff00ff) + (i_4176_ & 0xff00ff));
										int i_4179_ = ((i_4178_ & 0x1000100) + (i_4177_ - i_4178_ & 0x10000));
										i_4179_ = (i_4177_ - i_4179_ | i_4179_ - (i_4179_ >>> 8));
										if (i_4175_ == 0 && anInt8965 != 255) {
											i_4175_ = i_4179_;
											i_4179_ = is[i_4125_];
											i_4179_ = (((((i_4175_ & 0xff00ff) * anInt8965) + ((i_4179_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4175_ & 0xff00) * anInt8965) + ((i_4179_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_4125_] = i_4179_;
									} else if (i == 2) {
										int i_4180_ = aByteArray11394[i_4124_];
										if (i_4180_ != 0) {
											int i_4181_ = (anIntArray11393[i_4180_ & 0xff]);
											int i_4182_ = (((i_4181_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_4183_ = (((i_4181_ & 0xff00) * anInt8965) & 0xff0000);
											i_4181_ = ((i_4182_ | i_4183_) >>> 8) + anInt8978;
											int i_4184_ = is[i_4125_];
											int i_4185_ = i_4181_ + i_4184_;
											int i_4186_ = ((i_4181_ & 0xff00ff) + (i_4184_ & 0xff00ff));
											i_4184_ = ((i_4186_ & 0x1000100) + (i_4185_ - i_4186_ & 0x10000));
											is[i_4125_] = (i_4185_ - i_4184_ | i_4184_ - (i_4184_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_4121_ += anInt8962;
							}
						}
						i_4118_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_4187_ = anInt8957;
					while (i_4187_ < 0) {
						int i_4188_ = anInt8959;
						int i_4189_ = anInt8966;
						int i_4190_ = anInt8967 + anInt8969;
						int i_4191_ = anInt8955;
						if (i_4189_ >= 0 && i_4189_ - (anInt8945 << 12) < 0) {
							if (i_4190_ < 0) {
								int i_4192_ = (anInt8962 - 1 - i_4190_) / anInt8962;
								i_4191_ += i_4192_;
								i_4190_ += anInt8962 * i_4192_;
								i_4188_ += i_4192_;
							}
							int i_4193_;
							if ((i_4193_ = (1 + i_4190_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_4191_)
								i_4191_ = i_4193_;
							for (/**/; i_4191_ < 0; i_4191_++) {
								int i_4194_ = ((i_4190_ >> 12) * anInt8945 + (i_4189_ >> 12));
								int i_4195_ = i_4188_++;
								if (i_4049_ == 0) {
									if (i == 1)
										is[i_4195_] = (anIntArray11393[(aByteArray11394[i_4194_] & 0xff)]);
									else if (i == 0) {
										int i_4196_ = (anIntArray11393[(aByteArray11394[i_4194_] & 0xff)]);
										int i_4197_ = ((i_4196_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_4198_ = ((i_4196_ & 0xff00) * anInt8974 & 0xff0000);
										int i_4199_ = ((i_4196_ & 0xff) * anInt8975 & 0xff00);
										is[i_4195_] = (i_4197_ | i_4198_ | i_4199_) >>> 8;
									} else if (i == 3) {
										int i_4200_ = (anIntArray11393[(aByteArray11394[i_4194_] & 0xff)]);
										int i_4201_ = anInt8944;
										int i_4202_ = i_4200_ + i_4201_;
										int i_4203_ = ((i_4200_ & 0xff00ff) + (i_4201_ & 0xff00ff));
										int i_4204_ = ((i_4203_ & 0x1000100) + (i_4202_ - i_4203_ & 0x10000));
										is[i_4195_] = (i_4202_ - i_4204_ | i_4204_ - (i_4204_ >>> 8));
									} else if (i == 2) {
										int i_4205_ = (anIntArray11393[(aByteArray11394[i_4194_] & 0xff)]);
										int i_4206_ = ((i_4205_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_4207_ = ((i_4205_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_4195_] = ((i_4206_ | i_4207_) >>> 8) + anInt8978;
									} else
										throw new IllegalArgumentException();
								} else if (i_4049_ == 1) {
									if (i == 1) {
										int i_4208_ = aByteArray11394[i_4194_];
										if (i_4208_ != 0)
											is[i_4195_] = (anIntArray11393[i_4208_ & 0xff]);
									} else if (i == 0) {
										int i_4209_ = aByteArray11394[i_4194_];
										if (i_4209_ != 0) {
											int i_4210_ = (anIntArray11393[i_4209_ & 0xff]);
											if ((anInt8944 & 0xffffff) == 16777215) {
												int i_4211_ = anInt8944 >>> 24;
												int i_4212_ = 256 - i_4211_;
												int i_4213_ = is[i_4195_];
												is[i_4195_] = (((((i_4210_ & 0xff00ff) * i_4211_) + ((i_4213_ & 0xff00ff) * i_4212_)) & ~0xff00ff) + ((((i_4210_ & 0xff00) * i_4211_) + ((i_4213_ & 0xff00) * i_4212_)) & 0xff0000)) >> 8;
											} else if (anInt8965 != 255) {
												int i_4214_ = (((i_4210_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_4215_ = (((i_4210_ & 0xff00) * anInt8974) & 0xff0000);
												int i_4216_ = (((i_4210_ & 0xff) * anInt8975) & 0xff00);
												i_4210_ = (i_4214_ | i_4215_ | i_4216_) >>> 8;
												int i_4217_ = is[i_4195_];
												is[i_4195_] = (((((i_4210_ & 0xff00ff) * anInt8965) + ((i_4217_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4210_ & 0xff00) * anInt8965) + ((i_4217_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
											} else {
												int i_4218_ = (((i_4210_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_4219_ = (((i_4210_ & 0xff00) * anInt8974) & 0xff0000);
												int i_4220_ = (((i_4210_ & 0xff) * anInt8975) & 0xff00);
												is[i_4195_] = (i_4218_ | i_4219_ | i_4220_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_4221_ = aByteArray11394[i_4194_];
										int i_4222_ = (i_4221_ > 0 ? anIntArray11393[i_4221_] : 0);
										int i_4223_ = anInt8944;
										int i_4224_ = i_4222_ + i_4223_;
										int i_4225_ = ((i_4222_ & 0xff00ff) + (i_4223_ & 0xff00ff));
										int i_4226_ = ((i_4225_ & 0x1000100) + (i_4224_ - i_4225_ & 0x10000));
										i_4226_ = (i_4224_ - i_4226_ | i_4226_ - (i_4226_ >>> 8));
										if (i_4222_ == 0 && anInt8965 != 255) {
											i_4222_ = i_4226_;
											i_4226_ = is[i_4195_];
											i_4226_ = (((((i_4222_ & 0xff00ff) * anInt8965) + ((i_4226_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4222_ & 0xff00) * anInt8965) + ((i_4226_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_4195_] = i_4226_;
									} else if (i == 2) {
										int i_4227_ = aByteArray11394[i_4194_];
										if (i_4227_ != 0) {
											int i_4228_ = (anIntArray11393[i_4227_ & 0xff]);
											int i_4229_ = (((i_4228_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_4230_ = (((i_4228_ & 0xff00) * anInt8965) & 0xff0000);
											is[i_4195_++] = (((i_4229_ | i_4230_) >>> 8) + anInt8978);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_4049_ == 2) {
									if (i == 1) {
										int i_4231_ = aByteArray11394[i_4194_];
										if (i_4231_ != 0) {
											int i_4232_ = (anIntArray11393[i_4231_ & 0xff]);
											int i_4233_ = is[i_4195_];
											int i_4234_ = i_4232_ + i_4233_;
											int i_4235_ = ((i_4232_ & 0xff00ff) + (i_4233_ & 0xff00ff));
											i_4233_ = ((i_4235_ & 0x1000100) + (i_4234_ - i_4235_ & 0x10000));
											is[i_4195_] = (i_4234_ - i_4233_ | i_4233_ - (i_4233_ >>> 8));
										}
									} else if (i == 0) {
										int i_4236_ = aByteArray11394[i_4194_];
										if (i_4236_ != 0) {
											int i_4237_ = (anIntArray11393[i_4236_ & 0xff]);
											int i_4238_ = (((i_4237_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_4239_ = (((i_4237_ & 0xff00) * anInt8974) & 0xff0000);
											int i_4240_ = ((i_4237_ & 0xff) * anInt8975 & 0xff00);
											i_4237_ = (i_4238_ | i_4239_ | i_4240_) >>> 8;
											int i_4241_ = is[i_4195_];
											int i_4242_ = i_4237_ + i_4241_;
											int i_4243_ = ((i_4237_ & 0xff00ff) + (i_4241_ & 0xff00ff));
											i_4241_ = ((i_4243_ & 0x1000100) + (i_4242_ - i_4243_ & 0x10000));
											is[i_4195_] = (i_4242_ - i_4241_ | i_4241_ - (i_4241_ >>> 8));
										}
									} else if (i == 3) {
										byte i_4244_ = aByteArray11394[i_4194_];
										int i_4245_ = (i_4244_ > 0 ? anIntArray11393[i_4244_] : 0);
										int i_4246_ = anInt8944;
										int i_4247_ = i_4245_ + i_4246_;
										int i_4248_ = ((i_4245_ & 0xff00ff) + (i_4246_ & 0xff00ff));
										int i_4249_ = ((i_4248_ & 0x1000100) + (i_4247_ - i_4248_ & 0x10000));
										i_4249_ = (i_4247_ - i_4249_ | i_4249_ - (i_4249_ >>> 8));
										if (i_4245_ == 0 && anInt8965 != 255) {
											i_4245_ = i_4249_;
											i_4249_ = is[i_4195_];
											i_4249_ = (((((i_4245_ & 0xff00ff) * anInt8965) + ((i_4249_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4245_ & 0xff00) * anInt8965) + ((i_4249_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_4195_] = i_4249_;
									} else if (i == 2) {
										int i_4250_ = aByteArray11394[i_4194_];
										if (i_4250_ != 0) {
											int i_4251_ = (anIntArray11393[i_4250_ & 0xff]);
											int i_4252_ = (((i_4251_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_4253_ = (((i_4251_ & 0xff00) * anInt8965) & 0xff0000);
											i_4251_ = ((i_4252_ | i_4253_) >>> 8) + anInt8978;
											int i_4254_ = is[i_4195_];
											int i_4255_ = i_4251_ + i_4254_;
											int i_4256_ = ((i_4251_ & 0xff00ff) + (i_4254_ & 0xff00ff));
											i_4254_ = ((i_4256_ & 0x1000100) + (i_4255_ - i_4256_ & 0x10000));
											is[i_4195_] = (i_4255_ - i_4254_ | i_4254_ - (i_4254_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_4190_ += anInt8962;
							}
						}
						i_4187_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_4257_ = anInt8957;
					while (i_4257_ < 0) {
						int i_4258_ = anInt8959;
						int i_4259_ = anInt8966 + anInt8968;
						int i_4260_ = anInt8967;
						int i_4261_ = anInt8955;
						if (i_4260_ >= 0 && i_4260_ - (anInt8950 << 12) < 0) {
							int i_4262_;
							if ((i_4262_ = i_4259_ - (anInt8945 << 12)) >= 0) {
								i_4262_ = (anInt8960 - i_4262_) / anInt8960;
								i_4261_ += i_4262_;
								i_4259_ += anInt8960 * i_4262_;
								i_4258_ += i_4262_;
							}
							if ((i_4262_ = (i_4259_ - anInt8960) / anInt8960) > i_4261_)
								i_4261_ = i_4262_;
							for (/**/; i_4261_ < 0; i_4261_++) {
								int i_4263_ = ((i_4260_ >> 12) * anInt8945 + (i_4259_ >> 12));
								int i_4264_ = i_4258_++;
								if (i_4049_ == 0) {
									if (i == 1)
										is[i_4264_] = (anIntArray11393[(aByteArray11394[i_4263_] & 0xff)]);
									else if (i == 0) {
										int i_4265_ = (anIntArray11393[(aByteArray11394[i_4263_] & 0xff)]);
										int i_4266_ = ((i_4265_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_4267_ = ((i_4265_ & 0xff00) * anInt8974 & 0xff0000);
										int i_4268_ = ((i_4265_ & 0xff) * anInt8975 & 0xff00);
										is[i_4264_] = (i_4266_ | i_4267_ | i_4268_) >>> 8;
									} else if (i == 3) {
										int i_4269_ = (anIntArray11393[(aByteArray11394[i_4263_] & 0xff)]);
										int i_4270_ = anInt8944;
										int i_4271_ = i_4269_ + i_4270_;
										int i_4272_ = ((i_4269_ & 0xff00ff) + (i_4270_ & 0xff00ff));
										int i_4273_ = ((i_4272_ & 0x1000100) + (i_4271_ - i_4272_ & 0x10000));
										is[i_4264_] = (i_4271_ - i_4273_ | i_4273_ - (i_4273_ >>> 8));
									} else if (i == 2) {
										int i_4274_ = (anIntArray11393[(aByteArray11394[i_4263_] & 0xff)]);
										int i_4275_ = ((i_4274_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_4276_ = ((i_4274_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_4264_] = ((i_4275_ | i_4276_) >>> 8) + anInt8978;
									} else
										throw new IllegalArgumentException();
								} else if (i_4049_ == 1) {
									if (i == 1) {
										int i_4277_ = aByteArray11394[i_4263_];
										if (i_4277_ != 0)
											is[i_4264_] = (anIntArray11393[i_4277_ & 0xff]);
									} else if (i == 0) {
										int i_4278_ = aByteArray11394[i_4263_];
										if (i_4278_ != 0) {
											int i_4279_ = (anIntArray11393[i_4278_ & 0xff]);
											if ((anInt8944 & 0xffffff) == 16777215) {
												int i_4280_ = anInt8944 >>> 24;
												int i_4281_ = 256 - i_4280_;
												int i_4282_ = is[i_4264_];
												is[i_4264_] = (((((i_4279_ & 0xff00ff) * i_4280_) + ((i_4282_ & 0xff00ff) * i_4281_)) & ~0xff00ff) + ((((i_4279_ & 0xff00) * i_4280_) + ((i_4282_ & 0xff00) * i_4281_)) & 0xff0000)) >> 8;
											} else if (anInt8965 != 255) {
												int i_4283_ = (((i_4279_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_4284_ = (((i_4279_ & 0xff00) * anInt8974) & 0xff0000);
												int i_4285_ = (((i_4279_ & 0xff) * anInt8975) & 0xff00);
												i_4279_ = (i_4283_ | i_4284_ | i_4285_) >>> 8;
												int i_4286_ = is[i_4264_];
												is[i_4264_] = (((((i_4279_ & 0xff00ff) * anInt8965) + ((i_4286_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4279_ & 0xff00) * anInt8965) + ((i_4286_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
											} else {
												int i_4287_ = (((i_4279_ & 0xff0000) * anInt8973) & ~0xffffff);
												int i_4288_ = (((i_4279_ & 0xff00) * anInt8974) & 0xff0000);
												int i_4289_ = (((i_4279_ & 0xff) * anInt8975) & 0xff00);
												is[i_4264_] = (i_4287_ | i_4288_ | i_4289_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_4290_ = aByteArray11394[i_4263_];
										int i_4291_ = (i_4290_ > 0 ? anIntArray11393[i_4290_] : 0);
										int i_4292_ = anInt8944;
										int i_4293_ = i_4291_ + i_4292_;
										int i_4294_ = ((i_4291_ & 0xff00ff) + (i_4292_ & 0xff00ff));
										int i_4295_ = ((i_4294_ & 0x1000100) + (i_4293_ - i_4294_ & 0x10000));
										i_4295_ = (i_4293_ - i_4295_ | i_4295_ - (i_4295_ >>> 8));
										if (i_4291_ == 0 && anInt8965 != 255) {
											i_4291_ = i_4295_;
											i_4295_ = is[i_4264_];
											i_4295_ = (((((i_4291_ & 0xff00ff) * anInt8965) + ((i_4295_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4291_ & 0xff00) * anInt8965) + ((i_4295_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_4264_] = i_4295_;
									} else if (i == 2) {
										int i_4296_ = aByteArray11394[i_4263_];
										if (i_4296_ != 0) {
											int i_4297_ = (anIntArray11393[i_4296_ & 0xff]);
											int i_4298_ = (((i_4297_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_4299_ = (((i_4297_ & 0xff00) * anInt8965) & 0xff0000);
											is[i_4264_++] = (((i_4298_ | i_4299_) >>> 8) + anInt8978);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_4049_ == 2) {
									if (i == 1) {
										int i_4300_ = aByteArray11394[i_4263_];
										if (i_4300_ != 0) {
											int i_4301_ = (anIntArray11393[i_4300_ & 0xff]);
											int i_4302_ = is[i_4264_];
											int i_4303_ = i_4301_ + i_4302_;
											int i_4304_ = ((i_4301_ & 0xff00ff) + (i_4302_ & 0xff00ff));
											i_4302_ = ((i_4304_ & 0x1000100) + (i_4303_ - i_4304_ & 0x10000));
											is[i_4264_] = (i_4303_ - i_4302_ | i_4302_ - (i_4302_ >>> 8));
										}
									} else if (i == 0) {
										int i_4305_ = aByteArray11394[i_4263_];
										if (i_4305_ != 0) {
											int i_4306_ = (anIntArray11393[i_4305_ & 0xff]);
											int i_4307_ = (((i_4306_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_4308_ = (((i_4306_ & 0xff00) * anInt8974) & 0xff0000);
											int i_4309_ = ((i_4306_ & 0xff) * anInt8975 & 0xff00);
											i_4306_ = (i_4307_ | i_4308_ | i_4309_) >>> 8;
											int i_4310_ = is[i_4264_];
											int i_4311_ = i_4306_ + i_4310_;
											int i_4312_ = ((i_4306_ & 0xff00ff) + (i_4310_ & 0xff00ff));
											i_4310_ = ((i_4312_ & 0x1000100) + (i_4311_ - i_4312_ & 0x10000));
											is[i_4264_] = (i_4311_ - i_4310_ | i_4310_ - (i_4310_ >>> 8));
										}
									} else if (i == 3) {
										byte i_4313_ = aByteArray11394[i_4263_];
										int i_4314_ = (i_4313_ > 0 ? anIntArray11393[i_4313_] : 0);
										int i_4315_ = anInt8944;
										int i_4316_ = i_4314_ + i_4315_;
										int i_4317_ = ((i_4314_ & 0xff00ff) + (i_4315_ & 0xff00ff));
										int i_4318_ = ((i_4317_ & 0x1000100) + (i_4316_ - i_4317_ & 0x10000));
										i_4318_ = (i_4316_ - i_4318_ | i_4318_ - (i_4318_ >>> 8));
										if (i_4314_ == 0 && anInt8965 != 255) {
											i_4314_ = i_4318_;
											i_4318_ = is[i_4264_];
											i_4318_ = (((((i_4314_ & 0xff00ff) * anInt8965) + ((i_4318_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4314_ & 0xff00) * anInt8965) + ((i_4318_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										}
										is[i_4264_] = i_4318_;
									} else if (i == 2) {
										int i_4319_ = aByteArray11394[i_4263_];
										if (i_4319_ != 0) {
											int i_4320_ = (anIntArray11393[i_4319_ & 0xff]);
											int i_4321_ = (((i_4320_ & 0xff00ff) * anInt8965) & ~0xff00ff);
											int i_4322_ = (((i_4320_ & 0xff00) * anInt8965) & 0xff0000);
											i_4320_ = ((i_4321_ | i_4322_) >>> 8) + anInt8978;
											int i_4323_ = is[i_4264_];
											int i_4324_ = i_4320_ + i_4323_;
											int i_4325_ = ((i_4320_ & 0xff00ff) + (i_4323_ & 0xff00ff));
											i_4323_ = ((i_4325_ & 0x1000100) + (i_4324_ - i_4325_ & 0x10000));
											is[i_4264_] = (i_4324_ - i_4323_ | i_4323_ - (i_4323_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_4259_ += anInt8960;
							}
						}
						i_4257_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_4326_ = anInt8957;
					while (i_4326_ < 0) {
						int i_4327_ = anInt8959;
						int i_4328_ = anInt8966 + anInt8968;
						int i_4329_ = anInt8967 + anInt8969;
						int i_4330_ = anInt8955;
						int i_4331_;
						if ((i_4331_ = i_4328_ - (anInt8945 << 12)) >= 0) {
							i_4331_ = (anInt8960 - i_4331_) / anInt8960;
							i_4330_ += i_4331_;
							i_4328_ += anInt8960 * i_4331_;
							i_4329_ += anInt8962 * i_4331_;
							i_4327_ += i_4331_;
						}
						if ((i_4331_ = (i_4328_ - anInt8960) / anInt8960) > i_4330_)
							i_4330_ = i_4331_;
						if ((i_4331_ = i_4329_ - (anInt8950 << 12)) >= 0) {
							i_4331_ = (anInt8962 - i_4331_) / anInt8962;
							i_4330_ += i_4331_;
							i_4328_ += anInt8960 * i_4331_;
							i_4329_ += anInt8962 * i_4331_;
							i_4327_ += i_4331_;
						}
						if ((i_4331_ = (i_4329_ - anInt8962) / anInt8962) > i_4330_)
							i_4330_ = i_4331_;
						for (/**/; i_4330_ < 0; i_4330_++) {
							int i_4332_ = ((i_4329_ >> 12) * anInt8945 + (i_4328_ >> 12));
							int i_4333_ = i_4327_++;
							if (i_4049_ == 0) {
								if (i == 1)
									is[i_4333_] = (anIntArray11393[aByteArray11394[i_4332_] & 0xff]);
								else if (i == 0) {
									int i_4334_ = (anIntArray11393[aByteArray11394[i_4332_] & 0xff]);
									int i_4335_ = ((i_4334_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_4336_ = ((i_4334_ & 0xff00) * anInt8974 & 0xff0000);
									int i_4337_ = ((i_4334_ & 0xff) * anInt8975 & 0xff00);
									is[i_4333_] = (i_4335_ | i_4336_ | i_4337_) >>> 8;
								} else if (i == 3) {
									int i_4338_ = (anIntArray11393[aByteArray11394[i_4332_] & 0xff]);
									int i_4339_ = anInt8944;
									int i_4340_ = i_4338_ + i_4339_;
									int i_4341_ = ((i_4338_ & 0xff00ff) + (i_4339_ & 0xff00ff));
									int i_4342_ = ((i_4341_ & 0x1000100) + (i_4340_ - i_4341_ & 0x10000));
									is[i_4333_] = (i_4340_ - i_4342_ | i_4342_ - (i_4342_ >>> 8));
								} else if (i == 2) {
									int i_4343_ = (anIntArray11393[aByteArray11394[i_4332_] & 0xff]);
									int i_4344_ = ((i_4343_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_4345_ = ((i_4343_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_4333_] = (((i_4344_ | i_4345_) >>> 8) + anInt8978);
								} else
									throw new IllegalArgumentException();
							} else if (i_4049_ == 1) {
								if (i == 1) {
									int i_4346_ = aByteArray11394[i_4332_];
									if (i_4346_ != 0)
										is[i_4333_] = anIntArray11393[i_4346_ & 0xff];
								} else if (i == 0) {
									int i_4347_ = aByteArray11394[i_4332_];
									if (i_4347_ != 0) {
										int i_4348_ = anIntArray11393[i_4347_ & 0xff];
										if ((anInt8944 & 0xffffff) == 16777215) {
											int i_4349_ = anInt8944 >>> 24;
											int i_4350_ = 256 - i_4349_;
											int i_4351_ = is[i_4333_];
											is[i_4333_] = (((((i_4348_ & 0xff00ff) * i_4349_) + ((i_4351_ & 0xff00ff) * i_4350_)) & ~0xff00ff) + ((((i_4348_ & 0xff00) * i_4349_) + ((i_4351_ & 0xff00) * i_4350_)) & 0xff0000)) >> 8;
										} else if (anInt8965 != 255) {
											int i_4352_ = (((i_4348_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_4353_ = (((i_4348_ & 0xff00) * anInt8974) & 0xff0000);
											int i_4354_ = ((i_4348_ & 0xff) * anInt8975 & 0xff00);
											i_4348_ = (i_4352_ | i_4353_ | i_4354_) >>> 8;
											int i_4355_ = is[i_4333_];
											is[i_4333_] = (((((i_4348_ & 0xff00ff) * anInt8965) + ((i_4355_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4348_ & 0xff00) * anInt8965) + ((i_4355_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										} else {
											int i_4356_ = (((i_4348_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_4357_ = (((i_4348_ & 0xff00) * anInt8974) & 0xff0000);
											int i_4358_ = ((i_4348_ & 0xff) * anInt8975 & 0xff00);
											is[i_4333_] = (i_4356_ | i_4357_ | i_4358_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_4359_ = aByteArray11394[i_4332_];
									int i_4360_ = (i_4359_ > 0 ? anIntArray11393[i_4359_] : 0);
									int i_4361_ = anInt8944;
									int i_4362_ = i_4360_ + i_4361_;
									int i_4363_ = ((i_4360_ & 0xff00ff) + (i_4361_ & 0xff00ff));
									int i_4364_ = ((i_4363_ & 0x1000100) + (i_4362_ - i_4363_ & 0x10000));
									i_4364_ = (i_4362_ - i_4364_ | i_4364_ - (i_4364_ >>> 8));
									if (i_4360_ == 0 && anInt8965 != 255) {
										i_4360_ = i_4364_;
										i_4364_ = is[i_4333_];
										i_4364_ = (((((i_4360_ & 0xff00ff) * anInt8965) + ((i_4364_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4360_ & 0xff00) * anInt8965) + ((i_4364_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_4333_] = i_4364_;
								} else if (i == 2) {
									int i_4365_ = aByteArray11394[i_4332_];
									if (i_4365_ != 0) {
										int i_4366_ = anIntArray11393[i_4365_ & 0xff];
										int i_4367_ = ((i_4366_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_4368_ = ((i_4366_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_4333_++] = ((i_4367_ | i_4368_) >>> 8) + anInt8978;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_4049_ == 2) {
								if (i == 1) {
									int i_4369_ = aByteArray11394[i_4332_];
									if (i_4369_ != 0) {
										int i_4370_ = anIntArray11393[i_4369_ & 0xff];
										int i_4371_ = is[i_4333_];
										int i_4372_ = i_4370_ + i_4371_;
										int i_4373_ = ((i_4370_ & 0xff00ff) + (i_4371_ & 0xff00ff));
										i_4371_ = ((i_4373_ & 0x1000100) + (i_4372_ - i_4373_ & 0x10000));
										is[i_4333_] = (i_4372_ - i_4371_ | i_4371_ - (i_4371_ >>> 8));
									}
								} else if (i == 0) {
									int i_4374_ = aByteArray11394[i_4332_];
									if (i_4374_ != 0) {
										int i_4375_ = anIntArray11393[i_4374_ & 0xff];
										int i_4376_ = ((i_4375_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_4377_ = ((i_4375_ & 0xff00) * anInt8974 & 0xff0000);
										int i_4378_ = ((i_4375_ & 0xff) * anInt8975 & 0xff00);
										i_4375_ = (i_4376_ | i_4377_ | i_4378_) >>> 8;
										int i_4379_ = is[i_4333_];
										int i_4380_ = i_4375_ + i_4379_;
										int i_4381_ = ((i_4375_ & 0xff00ff) + (i_4379_ & 0xff00ff));
										i_4379_ = ((i_4381_ & 0x1000100) + (i_4380_ - i_4381_ & 0x10000));
										is[i_4333_] = (i_4380_ - i_4379_ | i_4379_ - (i_4379_ >>> 8));
									}
								} else if (i == 3) {
									byte i_4382_ = aByteArray11394[i_4332_];
									int i_4383_ = (i_4382_ > 0 ? anIntArray11393[i_4382_] : 0);
									int i_4384_ = anInt8944;
									int i_4385_ = i_4383_ + i_4384_;
									int i_4386_ = ((i_4383_ & 0xff00ff) + (i_4384_ & 0xff00ff));
									int i_4387_ = ((i_4386_ & 0x1000100) + (i_4385_ - i_4386_ & 0x10000));
									i_4387_ = (i_4385_ - i_4387_ | i_4387_ - (i_4387_ >>> 8));
									if (i_4383_ == 0 && anInt8965 != 255) {
										i_4383_ = i_4387_;
										i_4387_ = is[i_4333_];
										i_4387_ = (((((i_4383_ & 0xff00ff) * anInt8965) + ((i_4387_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4383_ & 0xff00) * anInt8965) + ((i_4387_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_4333_] = i_4387_;
								} else if (i == 2) {
									int i_4388_ = aByteArray11394[i_4332_];
									if (i_4388_ != 0) {
										int i_4389_ = anIntArray11393[i_4388_ & 0xff];
										int i_4390_ = ((i_4389_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_4391_ = ((i_4389_ & 0xff00) * anInt8965 & 0xff0000);
										i_4389_ = (((i_4390_ | i_4391_) >>> 8) + anInt8978);
										int i_4392_ = is[i_4333_];
										int i_4393_ = i_4389_ + i_4392_;
										int i_4394_ = ((i_4389_ & 0xff00ff) + (i_4392_ & 0xff00ff));
										i_4392_ = ((i_4394_ & 0x1000100) + (i_4393_ - i_4394_ & 0x10000));
										is[i_4333_] = (i_4393_ - i_4392_ | i_4392_ - (i_4392_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_4328_ += anInt8960;
							i_4329_ += anInt8962;
						}
						i_4326_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_4395_ = anInt8957;
					while (i_4395_ < 0) {
						int i_4396_ = anInt8959;
						int i_4397_ = anInt8966 + anInt8968;
						int i_4398_ = anInt8967 + anInt8969;
						int i_4399_ = anInt8955;
						int i_4400_;
						if ((i_4400_ = i_4397_ - (anInt8945 << 12)) >= 0) {
							i_4400_ = (anInt8960 - i_4400_) / anInt8960;
							i_4399_ += i_4400_;
							i_4397_ += anInt8960 * i_4400_;
							i_4398_ += anInt8962 * i_4400_;
							i_4396_ += i_4400_;
						}
						if ((i_4400_ = (i_4397_ - anInt8960) / anInt8960) > i_4399_)
							i_4399_ = i_4400_;
						if (i_4398_ < 0) {
							i_4400_ = (anInt8962 - 1 - i_4398_) / anInt8962;
							i_4399_ += i_4400_;
							i_4397_ += anInt8960 * i_4400_;
							i_4398_ += anInt8962 * i_4400_;
							i_4396_ += i_4400_;
						}
						if ((i_4400_ = (1 + i_4398_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_4399_)
							i_4399_ = i_4400_;
						for (/**/; i_4399_ < 0; i_4399_++) {
							int i_4401_ = ((i_4398_ >> 12) * anInt8945 + (i_4397_ >> 12));
							int i_4402_ = i_4396_++;
							if (i_4049_ == 0) {
								if (i == 1)
									is[i_4402_] = (anIntArray11393[aByteArray11394[i_4401_] & 0xff]);
								else if (i == 0) {
									int i_4403_ = (anIntArray11393[aByteArray11394[i_4401_] & 0xff]);
									int i_4404_ = ((i_4403_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_4405_ = ((i_4403_ & 0xff00) * anInt8974 & 0xff0000);
									int i_4406_ = ((i_4403_ & 0xff) * anInt8975 & 0xff00);
									is[i_4402_] = (i_4404_ | i_4405_ | i_4406_) >>> 8;
								} else if (i == 3) {
									int i_4407_ = (anIntArray11393[aByteArray11394[i_4401_] & 0xff]);
									int i_4408_ = anInt8944;
									int i_4409_ = i_4407_ + i_4408_;
									int i_4410_ = ((i_4407_ & 0xff00ff) + (i_4408_ & 0xff00ff));
									int i_4411_ = ((i_4410_ & 0x1000100) + (i_4409_ - i_4410_ & 0x10000));
									is[i_4402_] = (i_4409_ - i_4411_ | i_4411_ - (i_4411_ >>> 8));
								} else if (i == 2) {
									int i_4412_ = (anIntArray11393[aByteArray11394[i_4401_] & 0xff]);
									int i_4413_ = ((i_4412_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_4414_ = ((i_4412_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_4402_] = (((i_4413_ | i_4414_) >>> 8) + anInt8978);
								} else
									throw new IllegalArgumentException();
							} else if (i_4049_ == 1) {
								if (i == 1) {
									int i_4415_ = aByteArray11394[i_4401_];
									if (i_4415_ != 0)
										is[i_4402_] = anIntArray11393[i_4415_ & 0xff];
								} else if (i == 0) {
									int i_4416_ = aByteArray11394[i_4401_];
									if (i_4416_ != 0) {
										int i_4417_ = anIntArray11393[i_4416_ & 0xff];
										if ((anInt8944 & 0xffffff) == 16777215) {
											int i_4418_ = anInt8944 >>> 24;
											int i_4419_ = 256 - i_4418_;
											int i_4420_ = is[i_4402_];
											is[i_4402_] = (((((i_4417_ & 0xff00ff) * i_4418_) + ((i_4420_ & 0xff00ff) * i_4419_)) & ~0xff00ff) + ((((i_4417_ & 0xff00) * i_4418_) + ((i_4420_ & 0xff00) * i_4419_)) & 0xff0000)) >> 8;
										} else if (anInt8965 != 255) {
											int i_4421_ = (((i_4417_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_4422_ = (((i_4417_ & 0xff00) * anInt8974) & 0xff0000);
											int i_4423_ = ((i_4417_ & 0xff) * anInt8975 & 0xff00);
											i_4417_ = (i_4421_ | i_4422_ | i_4423_) >>> 8;
											int i_4424_ = is[i_4402_];
											is[i_4402_] = (((((i_4417_ & 0xff00ff) * anInt8965) + ((i_4424_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4417_ & 0xff00) * anInt8965) + ((i_4424_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										} else {
											int i_4425_ = (((i_4417_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_4426_ = (((i_4417_ & 0xff00) * anInt8974) & 0xff0000);
											int i_4427_ = ((i_4417_ & 0xff) * anInt8975 & 0xff00);
											is[i_4402_] = (i_4425_ | i_4426_ | i_4427_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_4428_ = aByteArray11394[i_4401_];
									int i_4429_ = (i_4428_ > 0 ? anIntArray11393[i_4428_] : 0);
									int i_4430_ = anInt8944;
									int i_4431_ = i_4429_ + i_4430_;
									int i_4432_ = ((i_4429_ & 0xff00ff) + (i_4430_ & 0xff00ff));
									int i_4433_ = ((i_4432_ & 0x1000100) + (i_4431_ - i_4432_ & 0x10000));
									i_4433_ = (i_4431_ - i_4433_ | i_4433_ - (i_4433_ >>> 8));
									if (i_4429_ == 0 && anInt8965 != 255) {
										i_4429_ = i_4433_;
										i_4433_ = is[i_4402_];
										i_4433_ = (((((i_4429_ & 0xff00ff) * anInt8965) + ((i_4433_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4429_ & 0xff00) * anInt8965) + ((i_4433_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_4402_] = i_4433_;
								} else if (i == 2) {
									int i_4434_ = aByteArray11394[i_4401_];
									if (i_4434_ != 0) {
										int i_4435_ = anIntArray11393[i_4434_ & 0xff];
										int i_4436_ = ((i_4435_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_4437_ = ((i_4435_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_4402_++] = ((i_4436_ | i_4437_) >>> 8) + anInt8978;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_4049_ == 2) {
								if (i == 1) {
									int i_4438_ = aByteArray11394[i_4401_];
									if (i_4438_ != 0) {
										int i_4439_ = anIntArray11393[i_4438_ & 0xff];
										int i_4440_ = is[i_4402_];
										int i_4441_ = i_4439_ + i_4440_;
										int i_4442_ = ((i_4439_ & 0xff00ff) + (i_4440_ & 0xff00ff));
										i_4440_ = ((i_4442_ & 0x1000100) + (i_4441_ - i_4442_ & 0x10000));
										is[i_4402_] = (i_4441_ - i_4440_ | i_4440_ - (i_4440_ >>> 8));
									}
								} else if (i == 0) {
									int i_4443_ = aByteArray11394[i_4401_];
									if (i_4443_ != 0) {
										int i_4444_ = anIntArray11393[i_4443_ & 0xff];
										int i_4445_ = ((i_4444_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_4446_ = ((i_4444_ & 0xff00) * anInt8974 & 0xff0000);
										int i_4447_ = ((i_4444_ & 0xff) * anInt8975 & 0xff00);
										i_4444_ = (i_4445_ | i_4446_ | i_4447_) >>> 8;
										int i_4448_ = is[i_4402_];
										int i_4449_ = i_4444_ + i_4448_;
										int i_4450_ = ((i_4444_ & 0xff00ff) + (i_4448_ & 0xff00ff));
										i_4448_ = ((i_4450_ & 0x1000100) + (i_4449_ - i_4450_ & 0x10000));
										is[i_4402_] = (i_4449_ - i_4448_ | i_4448_ - (i_4448_ >>> 8));
									}
								} else if (i == 3) {
									byte i_4451_ = aByteArray11394[i_4401_];
									int i_4452_ = (i_4451_ > 0 ? anIntArray11393[i_4451_] : 0);
									int i_4453_ = anInt8944;
									int i_4454_ = i_4452_ + i_4453_;
									int i_4455_ = ((i_4452_ & 0xff00ff) + (i_4453_ & 0xff00ff));
									int i_4456_ = ((i_4455_ & 0x1000100) + (i_4454_ - i_4455_ & 0x10000));
									i_4456_ = (i_4454_ - i_4456_ | i_4456_ - (i_4456_ >>> 8));
									if (i_4452_ == 0 && anInt8965 != 255) {
										i_4452_ = i_4456_;
										i_4456_ = is[i_4402_];
										i_4456_ = (((((i_4452_ & 0xff00ff) * anInt8965) + ((i_4456_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4452_ & 0xff00) * anInt8965) + ((i_4456_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_4402_] = i_4456_;
								} else if (i == 2) {
									int i_4457_ = aByteArray11394[i_4401_];
									if (i_4457_ != 0) {
										int i_4458_ = anIntArray11393[i_4457_ & 0xff];
										int i_4459_ = ((i_4458_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_4460_ = ((i_4458_ & 0xff00) * anInt8965 & 0xff0000);
										i_4458_ = (((i_4459_ | i_4460_) >>> 8) + anInt8978);
										int i_4461_ = is[i_4402_];
										int i_4462_ = i_4458_ + i_4461_;
										int i_4463_ = ((i_4458_ & 0xff00ff) + (i_4461_ & 0xff00ff));
										i_4461_ = ((i_4463_ & 0x1000100) + (i_4462_ - i_4463_ & 0x10000));
										is[i_4402_] = (i_4462_ - i_4461_ | i_4461_ - (i_4461_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_4397_ += anInt8960;
							i_4398_ += anInt8962;
						}
						i_4395_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_4464_ = anInt8957;
				while (i_4464_ < 0) {
					int i_4465_ = anInt8959;
					int i_4466_ = anInt8966 + anInt8968;
					int i_4467_ = anInt8967;
					int i_4468_ = anInt8955;
					if (i_4467_ >= 0 && i_4467_ - (anInt8950 << 12) < 0) {
						if (i_4466_ < 0) {
							int i_4469_ = (anInt8960 - 1 - i_4466_) / anInt8960;
							i_4468_ += i_4469_;
							i_4466_ += anInt8960 * i_4469_;
							i_4465_ += i_4469_;
						}
						int i_4470_;
						if ((i_4470_ = (1 + i_4466_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_4468_)
							i_4468_ = i_4470_;
						for (/**/; i_4468_ < 0; i_4468_++) {
							int i_4471_ = ((i_4467_ >> 12) * anInt8945 + (i_4466_ >> 12));
							int i_4472_ = i_4465_++;
							if (i_4049_ == 0) {
								if (i == 1)
									is[i_4472_] = (anIntArray11393[aByteArray11394[i_4471_] & 0xff]);
								else if (i == 0) {
									int i_4473_ = (anIntArray11393[aByteArray11394[i_4471_] & 0xff]);
									int i_4474_ = ((i_4473_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_4475_ = ((i_4473_ & 0xff00) * anInt8974 & 0xff0000);
									int i_4476_ = ((i_4473_ & 0xff) * anInt8975 & 0xff00);
									is[i_4472_] = (i_4474_ | i_4475_ | i_4476_) >>> 8;
								} else if (i == 3) {
									int i_4477_ = (anIntArray11393[aByteArray11394[i_4471_] & 0xff]);
									int i_4478_ = anInt8944;
									int i_4479_ = i_4477_ + i_4478_;
									int i_4480_ = ((i_4477_ & 0xff00ff) + (i_4478_ & 0xff00ff));
									int i_4481_ = ((i_4480_ & 0x1000100) + (i_4479_ - i_4480_ & 0x10000));
									is[i_4472_] = (i_4479_ - i_4481_ | i_4481_ - (i_4481_ >>> 8));
								} else if (i == 2) {
									int i_4482_ = (anIntArray11393[aByteArray11394[i_4471_] & 0xff]);
									int i_4483_ = ((i_4482_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_4484_ = ((i_4482_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_4472_] = (((i_4483_ | i_4484_) >>> 8) + anInt8978);
								} else
									throw new IllegalArgumentException();
							} else if (i_4049_ == 1) {
								if (i == 1) {
									int i_4485_ = aByteArray11394[i_4471_];
									if (i_4485_ != 0)
										is[i_4472_] = anIntArray11393[i_4485_ & 0xff];
								} else if (i == 0) {
									int i_4486_ = aByteArray11394[i_4471_];
									if (i_4486_ != 0) {
										int i_4487_ = anIntArray11393[i_4486_ & 0xff];
										if ((anInt8944 & 0xffffff) == 16777215) {
											int i_4488_ = anInt8944 >>> 24;
											int i_4489_ = 256 - i_4488_;
											int i_4490_ = is[i_4472_];
											is[i_4472_] = (((((i_4487_ & 0xff00ff) * i_4488_) + ((i_4490_ & 0xff00ff) * i_4489_)) & ~0xff00ff) + ((((i_4487_ & 0xff00) * i_4488_) + ((i_4490_ & 0xff00) * i_4489_)) & 0xff0000)) >> 8;
										} else if (anInt8965 != 255) {
											int i_4491_ = (((i_4487_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_4492_ = (((i_4487_ & 0xff00) * anInt8974) & 0xff0000);
											int i_4493_ = ((i_4487_ & 0xff) * anInt8975 & 0xff00);
											i_4487_ = (i_4491_ | i_4492_ | i_4493_) >>> 8;
											int i_4494_ = is[i_4472_];
											is[i_4472_] = (((((i_4487_ & 0xff00ff) * anInt8965) + ((i_4494_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4487_ & 0xff00) * anInt8965) + ((i_4494_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
										} else {
											int i_4495_ = (((i_4487_ & 0xff0000) * anInt8973) & ~0xffffff);
											int i_4496_ = (((i_4487_ & 0xff00) * anInt8974) & 0xff0000);
											int i_4497_ = ((i_4487_ & 0xff) * anInt8975 & 0xff00);
											is[i_4472_] = (i_4495_ | i_4496_ | i_4497_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_4498_ = aByteArray11394[i_4471_];
									int i_4499_ = (i_4498_ > 0 ? anIntArray11393[i_4498_] : 0);
									int i_4500_ = anInt8944;
									int i_4501_ = i_4499_ + i_4500_;
									int i_4502_ = ((i_4499_ & 0xff00ff) + (i_4500_ & 0xff00ff));
									int i_4503_ = ((i_4502_ & 0x1000100) + (i_4501_ - i_4502_ & 0x10000));
									i_4503_ = (i_4501_ - i_4503_ | i_4503_ - (i_4503_ >>> 8));
									if (i_4499_ == 0 && anInt8965 != 255) {
										i_4499_ = i_4503_;
										i_4503_ = is[i_4472_];
										i_4503_ = (((((i_4499_ & 0xff00ff) * anInt8965) + ((i_4503_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4499_ & 0xff00) * anInt8965) + ((i_4503_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_4472_] = i_4503_;
								} else if (i == 2) {
									int i_4504_ = aByteArray11394[i_4471_];
									if (i_4504_ != 0) {
										int i_4505_ = anIntArray11393[i_4504_ & 0xff];
										int i_4506_ = ((i_4505_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_4507_ = ((i_4505_ & 0xff00) * anInt8965 & 0xff0000);
										is[i_4472_++] = ((i_4506_ | i_4507_) >>> 8) + anInt8978;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_4049_ == 2) {
								if (i == 1) {
									int i_4508_ = aByteArray11394[i_4471_];
									if (i_4508_ != 0) {
										int i_4509_ = anIntArray11393[i_4508_ & 0xff];
										int i_4510_ = is[i_4472_];
										int i_4511_ = i_4509_ + i_4510_;
										int i_4512_ = ((i_4509_ & 0xff00ff) + (i_4510_ & 0xff00ff));
										i_4510_ = ((i_4512_ & 0x1000100) + (i_4511_ - i_4512_ & 0x10000));
										is[i_4472_] = (i_4511_ - i_4510_ | i_4510_ - (i_4510_ >>> 8));
									}
								} else if (i == 0) {
									int i_4513_ = aByteArray11394[i_4471_];
									if (i_4513_ != 0) {
										int i_4514_ = anIntArray11393[i_4513_ & 0xff];
										int i_4515_ = ((i_4514_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_4516_ = ((i_4514_ & 0xff00) * anInt8974 & 0xff0000);
										int i_4517_ = ((i_4514_ & 0xff) * anInt8975 & 0xff00);
										i_4514_ = (i_4515_ | i_4516_ | i_4517_) >>> 8;
										int i_4518_ = is[i_4472_];
										int i_4519_ = i_4514_ + i_4518_;
										int i_4520_ = ((i_4514_ & 0xff00ff) + (i_4518_ & 0xff00ff));
										i_4518_ = ((i_4520_ & 0x1000100) + (i_4519_ - i_4520_ & 0x10000));
										is[i_4472_] = (i_4519_ - i_4518_ | i_4518_ - (i_4518_ >>> 8));
									}
								} else if (i == 3) {
									byte i_4521_ = aByteArray11394[i_4471_];
									int i_4522_ = (i_4521_ > 0 ? anIntArray11393[i_4521_] : 0);
									int i_4523_ = anInt8944;
									int i_4524_ = i_4522_ + i_4523_;
									int i_4525_ = ((i_4522_ & 0xff00ff) + (i_4523_ & 0xff00ff));
									int i_4526_ = ((i_4525_ & 0x1000100) + (i_4524_ - i_4525_ & 0x10000));
									i_4526_ = (i_4524_ - i_4526_ | i_4526_ - (i_4526_ >>> 8));
									if (i_4522_ == 0 && anInt8965 != 255) {
										i_4522_ = i_4526_;
										i_4526_ = is[i_4472_];
										i_4526_ = (((((i_4522_ & 0xff00ff) * anInt8965) + ((i_4526_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4522_ & 0xff00) * anInt8965) + ((i_4526_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									}
									is[i_4472_] = i_4526_;
								} else if (i == 2) {
									int i_4527_ = aByteArray11394[i_4471_];
									if (i_4527_ != 0) {
										int i_4528_ = anIntArray11393[i_4527_ & 0xff];
										int i_4529_ = ((i_4528_ & 0xff00ff) * anInt8965 & ~0xff00ff);
										int i_4530_ = ((i_4528_ & 0xff00) * anInt8965 & 0xff0000);
										i_4528_ = (((i_4529_ | i_4530_) >>> 8) + anInt8978);
										int i_4531_ = is[i_4472_];
										int i_4532_ = i_4528_ + i_4531_;
										int i_4533_ = ((i_4528_ & 0xff00ff) + (i_4531_ & 0xff00ff));
										i_4531_ = ((i_4533_ & 0x1000100) + (i_4532_ - i_4533_ & 0x10000));
										is[i_4472_] = (i_4532_ - i_4531_ | i_4531_ - (i_4531_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_4466_ += anInt8960;
						}
					}
					i_4464_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				for (int i_4534_ = anInt8957; i_4534_ < 0; i_4534_++) {
					int i_4535_ = anInt8959;
					int i_4536_ = anInt8966 + anInt8968;
					int i_4537_ = anInt8967 + anInt8969;
					int i_4538_ = anInt8955;
					if (i_4536_ < 0) {
						int i_4539_ = (anInt8960 - 1 - i_4536_) / anInt8960;
						i_4538_ += i_4539_;
						i_4536_ += anInt8960 * i_4539_;
						i_4537_ += anInt8962 * i_4539_;
						i_4535_ += i_4539_;
					}
					int i_4540_;
					if ((i_4540_ = (1 + i_4536_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_4538_)
						i_4538_ = i_4540_;
					if ((i_4540_ = i_4537_ - (anInt8950 << 12)) >= 0) {
						i_4540_ = (anInt8962 - i_4540_) / anInt8962;
						i_4538_ += i_4540_;
						i_4536_ += anInt8960 * i_4540_;
						i_4537_ += anInt8962 * i_4540_;
						i_4535_ += i_4540_;
					}
					if ((i_4540_ = (i_4537_ - anInt8962) / anInt8962) > i_4538_)
						i_4538_ = i_4540_;
					for (/**/; i_4538_ < 0; i_4538_++) {
						int i_4541_ = (i_4537_ >> 12) * anInt8945 + (i_4536_ >> 12);
						int i_4542_ = i_4535_++;
						if (i_4049_ == 0) {
							if (i == 1)
								is[i_4542_] = (anIntArray11393[aByteArray11394[i_4541_] & 0xff]);
							else if (i == 0) {
								int i_4543_ = (anIntArray11393[aByteArray11394[i_4541_] & 0xff]);
								int i_4544_ = ((i_4543_ & 0xff0000) * anInt8973 & ~0xffffff);
								int i_4545_ = ((i_4543_ & 0xff00) * anInt8974 & 0xff0000);
								int i_4546_ = (i_4543_ & 0xff) * anInt8975 & 0xff00;
								is[i_4542_] = (i_4544_ | i_4545_ | i_4546_) >>> 8;
							} else if (i == 3) {
								int i_4547_ = (anIntArray11393[aByteArray11394[i_4541_] & 0xff]);
								int i_4548_ = anInt8944;
								int i_4549_ = i_4547_ + i_4548_;
								int i_4550_ = ((i_4547_ & 0xff00ff) + (i_4548_ & 0xff00ff));
								int i_4551_ = ((i_4550_ & 0x1000100) + (i_4549_ - i_4550_ & 0x10000));
								is[i_4542_] = i_4549_ - i_4551_ | i_4551_ - (i_4551_ >>> 8);
							} else if (i == 2) {
								int i_4552_ = (anIntArray11393[aByteArray11394[i_4541_] & 0xff]);
								int i_4553_ = ((i_4552_ & 0xff00ff) * anInt8965 & ~0xff00ff);
								int i_4554_ = ((i_4552_ & 0xff00) * anInt8965 & 0xff0000);
								is[i_4542_] = ((i_4553_ | i_4554_) >>> 8) + anInt8978;
							} else
								throw new IllegalArgumentException();
						} else if (i_4049_ == 1) {
							if (i == 1) {
								int i_4555_ = aByteArray11394[i_4541_];
								if (i_4555_ != 0)
									is[i_4542_] = anIntArray11393[i_4555_ & 0xff];
							} else if (i == 0) {
								int i_4556_ = aByteArray11394[i_4541_];
								if (i_4556_ != 0) {
									int i_4557_ = anIntArray11393[i_4556_ & 0xff];
									if ((anInt8944 & 0xffffff) == 16777215) {
										int i_4558_ = anInt8944 >>> 24;
										int i_4559_ = 256 - i_4558_;
										int i_4560_ = is[i_4542_];
										is[i_4542_] = ((((i_4557_ & 0xff00ff) * i_4558_ + ((i_4560_ & 0xff00ff) * i_4559_)) & ~0xff00ff) + (((i_4557_ & 0xff00) * i_4558_ + ((i_4560_ & 0xff00) * i_4559_)) & 0xff0000)) >> 8;
									} else if (anInt8965 != 255) {
										int i_4561_ = ((i_4557_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_4562_ = ((i_4557_ & 0xff00) * anInt8974 & 0xff0000);
										int i_4563_ = ((i_4557_ & 0xff) * anInt8975 & 0xff00);
										i_4557_ = (i_4561_ | i_4562_ | i_4563_) >>> 8;
										int i_4564_ = is[i_4542_];
										is[i_4542_] = (((((i_4557_ & 0xff00ff) * anInt8965) + ((i_4564_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4557_ & 0xff00) * anInt8965) + ((i_4564_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									} else {
										int i_4565_ = ((i_4557_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_4566_ = ((i_4557_ & 0xff00) * anInt8974 & 0xff0000);
										int i_4567_ = ((i_4557_ & 0xff) * anInt8975 & 0xff00);
										is[i_4542_] = (i_4565_ | i_4566_ | i_4567_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_4568_ = aByteArray11394[i_4541_];
								int i_4569_ = (i_4568_ > 0 ? anIntArray11393[i_4568_] : 0);
								int i_4570_ = anInt8944;
								int i_4571_ = i_4569_ + i_4570_;
								int i_4572_ = ((i_4569_ & 0xff00ff) + (i_4570_ & 0xff00ff));
								int i_4573_ = ((i_4572_ & 0x1000100) + (i_4571_ - i_4572_ & 0x10000));
								i_4573_ = i_4571_ - i_4573_ | i_4573_ - (i_4573_ >>> 8);
								if (i_4569_ == 0 && anInt8965 != 255) {
									i_4569_ = i_4573_;
									i_4573_ = is[i_4542_];
									i_4573_ = ((((i_4569_ & 0xff00ff) * anInt8965 + ((i_4573_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + (((i_4569_ & 0xff00) * anInt8965 + ((i_4573_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
								}
								is[i_4542_] = i_4573_;
							} else if (i == 2) {
								int i_4574_ = aByteArray11394[i_4541_];
								if (i_4574_ != 0) {
									int i_4575_ = anIntArray11393[i_4574_ & 0xff];
									int i_4576_ = ((i_4575_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_4577_ = ((i_4575_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_4542_++] = ((i_4576_ | i_4577_) >>> 8) + anInt8978;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_4049_ == 2) {
							if (i == 1) {
								int i_4578_ = aByteArray11394[i_4541_];
								if (i_4578_ != 0) {
									int i_4579_ = anIntArray11393[i_4578_ & 0xff];
									int i_4580_ = is[i_4542_];
									int i_4581_ = i_4579_ + i_4580_;
									int i_4582_ = ((i_4579_ & 0xff00ff) + (i_4580_ & 0xff00ff));
									i_4580_ = ((i_4582_ & 0x1000100) + (i_4581_ - i_4582_ & 0x10000));
									is[i_4542_] = (i_4581_ - i_4580_ | i_4580_ - (i_4580_ >>> 8));
								}
							} else if (i == 0) {
								int i_4583_ = aByteArray11394[i_4541_];
								if (i_4583_ != 0) {
									int i_4584_ = anIntArray11393[i_4583_ & 0xff];
									int i_4585_ = ((i_4584_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_4586_ = ((i_4584_ & 0xff00) * anInt8974 & 0xff0000);
									int i_4587_ = ((i_4584_ & 0xff) * anInt8975 & 0xff00);
									i_4584_ = (i_4585_ | i_4586_ | i_4587_) >>> 8;
									int i_4588_ = is[i_4542_];
									int i_4589_ = i_4584_ + i_4588_;
									int i_4590_ = ((i_4584_ & 0xff00ff) + (i_4588_ & 0xff00ff));
									i_4588_ = ((i_4590_ & 0x1000100) + (i_4589_ - i_4590_ & 0x10000));
									is[i_4542_] = (i_4589_ - i_4588_ | i_4588_ - (i_4588_ >>> 8));
								}
							} else if (i == 3) {
								byte i_4591_ = aByteArray11394[i_4541_];
								int i_4592_ = (i_4591_ > 0 ? anIntArray11393[i_4591_] : 0);
								int i_4593_ = anInt8944;
								int i_4594_ = i_4592_ + i_4593_;
								int i_4595_ = ((i_4592_ & 0xff00ff) + (i_4593_ & 0xff00ff));
								int i_4596_ = ((i_4595_ & 0x1000100) + (i_4594_ - i_4595_ & 0x10000));
								i_4596_ = i_4594_ - i_4596_ | i_4596_ - (i_4596_ >>> 8);
								if (i_4592_ == 0 && anInt8965 != 255) {
									i_4592_ = i_4596_;
									i_4596_ = is[i_4542_];
									i_4596_ = ((((i_4592_ & 0xff00ff) * anInt8965 + ((i_4596_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + (((i_4592_ & 0xff00) * anInt8965 + ((i_4596_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
								}
								is[i_4542_] = i_4596_;
							} else if (i == 2) {
								int i_4597_ = aByteArray11394[i_4541_];
								if (i_4597_ != 0) {
									int i_4598_ = anIntArray11393[i_4597_ & 0xff];
									int i_4599_ = ((i_4598_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_4600_ = ((i_4598_ & 0xff00) * anInt8965 & 0xff0000);
									i_4598_ = (((i_4599_ | i_4600_) >>> 8) + anInt8978);
									int i_4601_ = is[i_4542_];
									int i_4602_ = i_4598_ + i_4601_;
									int i_4603_ = ((i_4598_ & 0xff00ff) + (i_4601_ & 0xff00ff));
									i_4601_ = ((i_4603_ & 0x1000100) + (i_4602_ - i_4603_ & 0x10000));
									is[i_4542_] = (i_4602_ - i_4601_ | i_4601_ - (i_4601_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_4536_ += anInt8960;
						i_4537_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				for (int i_4604_ = anInt8957; i_4604_ < 0; i_4604_++) {
					int i_4605_ = anInt8959;
					int i_4606_ = anInt8966 + anInt8968;
					int i_4607_ = anInt8967 + anInt8969;
					int i_4608_ = anInt8955;
					if (i_4606_ < 0) {
						int i_4609_ = (anInt8960 - 1 - i_4606_) / anInt8960;
						i_4608_ += i_4609_;
						i_4606_ += anInt8960 * i_4609_;
						i_4607_ += anInt8962 * i_4609_;
						i_4605_ += i_4609_;
					}
					int i_4610_;
					if ((i_4610_ = (1 + i_4606_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_4608_)
						i_4608_ = i_4610_;
					if (i_4607_ < 0) {
						i_4610_ = (anInt8962 - 1 - i_4607_) / anInt8962;
						i_4608_ += i_4610_;
						i_4606_ += anInt8960 * i_4610_;
						i_4607_ += anInt8962 * i_4610_;
						i_4605_ += i_4610_;
					}
					if ((i_4610_ = (1 + i_4607_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_4608_)
						i_4608_ = i_4610_;
					for (/**/; i_4608_ < 0; i_4608_++) {
						int i_4611_ = (i_4607_ >> 12) * anInt8945 + (i_4606_ >> 12);
						int i_4612_ = i_4605_++;
						if (i_4049_ == 0) {
							if (i == 1)
								is[i_4612_] = (anIntArray11393[aByteArray11394[i_4611_] & 0xff]);
							else if (i == 0) {
								int i_4613_ = (anIntArray11393[aByteArray11394[i_4611_] & 0xff]);
								int i_4614_ = ((i_4613_ & 0xff0000) * anInt8973 & ~0xffffff);
								int i_4615_ = ((i_4613_ & 0xff00) * anInt8974 & 0xff0000);
								int i_4616_ = (i_4613_ & 0xff) * anInt8975 & 0xff00;
								is[i_4612_] = (i_4614_ | i_4615_ | i_4616_) >>> 8;
							} else if (i == 3) {
								int i_4617_ = (anIntArray11393[aByteArray11394[i_4611_] & 0xff]);
								int i_4618_ = anInt8944;
								int i_4619_ = i_4617_ + i_4618_;
								int i_4620_ = ((i_4617_ & 0xff00ff) + (i_4618_ & 0xff00ff));
								int i_4621_ = ((i_4620_ & 0x1000100) + (i_4619_ - i_4620_ & 0x10000));
								is[i_4612_] = i_4619_ - i_4621_ | i_4621_ - (i_4621_ >>> 8);
							} else if (i == 2) {
								int i_4622_ = (anIntArray11393[aByteArray11394[i_4611_] & 0xff]);
								int i_4623_ = ((i_4622_ & 0xff00ff) * anInt8965 & ~0xff00ff);
								int i_4624_ = ((i_4622_ & 0xff00) * anInt8965 & 0xff0000);
								is[i_4612_] = ((i_4623_ | i_4624_) >>> 8) + anInt8978;
							} else
								throw new IllegalArgumentException();
						} else if (i_4049_ == 1) {
							if (i == 1) {
								int i_4625_ = aByteArray11394[i_4611_];
								if (i_4625_ != 0)
									is[i_4612_] = anIntArray11393[i_4625_ & 0xff];
							} else if (i == 0) {
								int i_4626_ = aByteArray11394[i_4611_];
								if (i_4626_ != 0) {
									int i_4627_ = anIntArray11393[i_4626_ & 0xff];
									if ((anInt8944 & 0xffffff) == 16777215) {
										int i_4628_ = anInt8944 >>> 24;
										int i_4629_ = 256 - i_4628_;
										int i_4630_ = is[i_4612_];
										is[i_4612_] = ((((i_4627_ & 0xff00ff) * i_4628_ + ((i_4630_ & 0xff00ff) * i_4629_)) & ~0xff00ff) + (((i_4627_ & 0xff00) * i_4628_ + ((i_4630_ & 0xff00) * i_4629_)) & 0xff0000)) >> 8;
									} else if (anInt8965 != 255) {
										int i_4631_ = ((i_4627_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_4632_ = ((i_4627_ & 0xff00) * anInt8974 & 0xff0000);
										int i_4633_ = ((i_4627_ & 0xff) * anInt8975 & 0xff00);
										i_4627_ = (i_4631_ | i_4632_ | i_4633_) >>> 8;
										int i_4634_ = is[i_4612_];
										is[i_4612_] = (((((i_4627_ & 0xff00ff) * anInt8965) + ((i_4634_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + ((((i_4627_ & 0xff00) * anInt8965) + ((i_4634_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
									} else {
										int i_4635_ = ((i_4627_ & 0xff0000) * anInt8973 & ~0xffffff);
										int i_4636_ = ((i_4627_ & 0xff00) * anInt8974 & 0xff0000);
										int i_4637_ = ((i_4627_ & 0xff) * anInt8975 & 0xff00);
										is[i_4612_] = (i_4635_ | i_4636_ | i_4637_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_4638_ = aByteArray11394[i_4611_];
								int i_4639_ = (i_4638_ > 0 ? anIntArray11393[i_4638_] : 0);
								int i_4640_ = anInt8944;
								int i_4641_ = i_4639_ + i_4640_;
								int i_4642_ = ((i_4639_ & 0xff00ff) + (i_4640_ & 0xff00ff));
								int i_4643_ = ((i_4642_ & 0x1000100) + (i_4641_ - i_4642_ & 0x10000));
								i_4643_ = i_4641_ - i_4643_ | i_4643_ - (i_4643_ >>> 8);
								if (i_4639_ == 0 && anInt8965 != 255) {
									i_4639_ = i_4643_;
									i_4643_ = is[i_4612_];
									i_4643_ = ((((i_4639_ & 0xff00ff) * anInt8965 + ((i_4643_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + (((i_4639_ & 0xff00) * anInt8965 + ((i_4643_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
								}
								is[i_4612_] = i_4643_;
							} else if (i == 2) {
								int i_4644_ = aByteArray11394[i_4611_];
								if (i_4644_ != 0) {
									int i_4645_ = anIntArray11393[i_4644_ & 0xff];
									int i_4646_ = ((i_4645_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_4647_ = ((i_4645_ & 0xff00) * anInt8965 & 0xff0000);
									is[i_4612_++] = ((i_4646_ | i_4647_) >>> 8) + anInt8978;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_4049_ == 2) {
							if (i == 1) {
								int i_4648_ = aByteArray11394[i_4611_];
								if (i_4648_ != 0) {
									int i_4649_ = anIntArray11393[i_4648_ & 0xff];
									int i_4650_ = is[i_4612_];
									int i_4651_ = i_4649_ + i_4650_;
									int i_4652_ = ((i_4649_ & 0xff00ff) + (i_4650_ & 0xff00ff));
									i_4650_ = ((i_4652_ & 0x1000100) + (i_4651_ - i_4652_ & 0x10000));
									is[i_4612_] = (i_4651_ - i_4650_ | i_4650_ - (i_4650_ >>> 8));
								}
							} else if (i == 0) {
								int i_4653_ = aByteArray11394[i_4611_];
								if (i_4653_ != 0) {
									int i_4654_ = anIntArray11393[i_4653_ & 0xff];
									int i_4655_ = ((i_4654_ & 0xff0000) * anInt8973 & ~0xffffff);
									int i_4656_ = ((i_4654_ & 0xff00) * anInt8974 & 0xff0000);
									int i_4657_ = ((i_4654_ & 0xff) * anInt8975 & 0xff00);
									i_4654_ = (i_4655_ | i_4656_ | i_4657_) >>> 8;
									int i_4658_ = is[i_4612_];
									int i_4659_ = i_4654_ + i_4658_;
									int i_4660_ = ((i_4654_ & 0xff00ff) + (i_4658_ & 0xff00ff));
									i_4658_ = ((i_4660_ & 0x1000100) + (i_4659_ - i_4660_ & 0x10000));
									is[i_4612_] = (i_4659_ - i_4658_ | i_4658_ - (i_4658_ >>> 8));
								}
							} else if (i == 3) {
								byte i_4661_ = aByteArray11394[i_4611_];
								int i_4662_ = (i_4661_ > 0 ? anIntArray11393[i_4661_] : 0);
								int i_4663_ = anInt8944;
								int i_4664_ = i_4662_ + i_4663_;
								int i_4665_ = ((i_4662_ & 0xff00ff) + (i_4663_ & 0xff00ff));
								int i_4666_ = ((i_4665_ & 0x1000100) + (i_4664_ - i_4665_ & 0x10000));
								i_4666_ = i_4664_ - i_4666_ | i_4666_ - (i_4666_ >>> 8);
								if (i_4662_ == 0 && anInt8965 != 255) {
									i_4662_ = i_4666_;
									i_4666_ = is[i_4612_];
									i_4666_ = ((((i_4662_ & 0xff00ff) * anInt8965 + ((i_4666_ & 0xff00ff) * anInt8972)) & ~0xff00ff) + (((i_4662_ & 0xff00) * anInt8965 + ((i_4666_ & 0xff00) * anInt8972)) & 0xff0000)) >> 8;
								}
								is[i_4612_] = i_4666_;
							} else if (i == 2) {
								int i_4667_ = aByteArray11394[i_4611_];
								if (i_4667_ != 0) {
									int i_4668_ = anIntArray11393[i_4667_ & 0xff];
									int i_4669_ = ((i_4668_ & 0xff00ff) * anInt8965 & ~0xff00ff);
									int i_4670_ = ((i_4668_ & 0xff00) * anInt8965 & 0xff0000);
									i_4668_ = (((i_4669_ | i_4670_) >>> 8) + anInt8978);
									int i_4671_ = is[i_4612_];
									int i_4672_ = i_4668_ + i_4671_;
									int i_4673_ = ((i_4668_ & 0xff00ff) + (i_4671_ & 0xff00ff));
									i_4671_ = ((i_4673_ & 0x1000100) + (i_4672_ - i_4673_ & 0x10000));
									is[i_4612_] = (i_4672_ - i_4671_ | i_4671_ - (i_4671_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_4606_ += anInt8960;
						i_4607_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	public void method1737(int i, int i_4674_, Class161 class161, int i_4675_, int i_4676_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			i += anInt8977;
			i_4674_ += anInt8947;
			int i_4677_ = 0;
			int i_4678_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			int i_4679_ = anInt8945;
			int i_4680_ = anInt8950;
			int i_4681_ = i_4678_ - i_4679_;
			int i_4682_ = 0;
			int i_4683_ = i + i_4674_ * i_4678_;
			if (i_4674_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_4684_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_4674_;
				i_4680_ -= i_4684_;
				i_4674_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_4677_ += i_4684_ * i_4679_;
				i_4683_ += i_4684_ * i_4678_;
			}
			if (i_4674_ + i_4680_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_4680_ -= (i_4674_ + i_4680_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_4685_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_4679_ -= i_4685_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_4677_ += i_4685_;
				i_4683_ += i_4685_;
				i_4682_ += i_4685_;
				i_4681_ += i_4685_;
			}
			if (i + i_4679_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_4686_ = i + i_4679_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_4679_ -= i_4686_;
				i_4682_ += i_4686_;
				i_4681_ += i_4686_;
			}
			if (i_4679_ > 0 && i_4680_ > 0) {
				Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
				int[] is_4687_ = class161_sub2.anIntArray9444;
				int[] is_4688_ = class161_sub2.anIntArray9445;
				int i_4689_ = i_4674_;
				if (i_4676_ > i_4689_) {
					i_4689_ = i_4676_;
					i_4683_ += (i_4676_ - i_4674_) * i_4678_;
					i_4677_ += (i_4676_ - i_4674_) * anInt8945;
				}
				int i_4690_ = (i_4676_ + is_4687_.length < i_4674_ + i_4680_ ? i_4676_ + is_4687_.length : i_4674_ + i_4680_);
				for (int i_4691_ = i_4689_; i_4691_ < i_4690_; i_4691_++) {
					int i_4692_ = is_4687_[i_4691_ - i_4676_] + i_4675_;
					int i_4693_ = is_4688_[i_4691_ - i_4676_];
					int i_4694_ = i_4679_;
					if (i > i_4692_) {
						int i_4695_ = i - i_4692_;
						if (i_4695_ >= i_4693_) {
							i_4677_ += i_4679_ + i_4682_;
							i_4683_ += i_4679_ + i_4681_;
							continue;
						}
						i_4693_ -= i_4695_;
					} else {
						int i_4696_ = i_4692_ - i;
						if (i_4696_ >= i_4679_) {
							i_4677_ += i_4679_ + i_4682_;
							i_4683_ += i_4679_ + i_4681_;
							continue;
						}
						i_4677_ += i_4696_;
						i_4694_ -= i_4696_;
						i_4683_ += i_4696_;
					}
					int i_4697_ = 0;
					if (i_4694_ < i_4693_)
						i_4693_ = i_4694_;
					else
						i_4697_ = i_4694_ - i_4693_;
					for (int i_4698_ = -i_4693_; i_4698_ < 0; i_4698_++) {
						int i_4699_ = aByteArray11394[i_4677_++];
						if (i_4699_ != 0)
							is[i_4683_++] = anIntArray11393[i_4699_ & 0xff];
						else
							i_4683_++;
					}
					i_4677_ += i_4697_ + i_4682_;
					i_4683_ += i_4697_ + i_4681_;
				}
			}
		}
	}

	public void method1756(int i, int i_4700_, int i_4701_, int i_4702_, int i_4703_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			int i_4704_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			i += anInt8977;
			i_4700_ += anInt8947;
			int i_4705_ = i_4700_ * i_4704_ + i;
			int i_4706_ = 0;
			int i_4707_ = anInt8950;
			int i_4708_ = anInt8945;
			int i_4709_ = i_4704_ - i_4708_;
			int i_4710_ = 0;
			if (i_4700_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_4711_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_4700_;
				i_4707_ -= i_4711_;
				i_4700_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_4706_ += i_4711_ * i_4708_;
				i_4705_ += i_4711_ * i_4704_;
			}
			if (i_4700_ + i_4707_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_4707_ -= (i_4700_ + i_4707_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_4712_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_4708_ -= i_4712_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_4706_ += i_4712_;
				i_4705_ += i_4712_;
				i_4710_ += i_4712_;
				i_4709_ += i_4712_;
			}
			if (i + i_4708_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_4713_ = i + i_4708_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_4708_ -= i_4713_;
				i_4710_ += i_4713_;
				i_4709_ += i_4713_;
			}
			if (i_4708_ > 0 && i_4707_ > 0) {
				if (i_4703_ == 0) {
					if (i_4701_ == 1) {
						for (int i_4714_ = -i_4707_; i_4714_ < 0; i_4714_++) {
							int i_4715_ = i_4705_ + i_4708_ - 3;
							while (i_4705_ < i_4715_) {
								is[i_4705_++] = (anIntArray11393[aByteArray11394[i_4706_++] & 0xff]);
								is[i_4705_++] = (anIntArray11393[aByteArray11394[i_4706_++] & 0xff]);
								is[i_4705_++] = (anIntArray11393[aByteArray11394[i_4706_++] & 0xff]);
								is[i_4705_++] = (anIntArray11393[aByteArray11394[i_4706_++] & 0xff]);
							}
							i_4715_ += 3;
							while (i_4705_ < i_4715_)
								is[i_4705_++] = (anIntArray11393[aByteArray11394[i_4706_++] & 0xff]);
							i_4705_ += i_4709_;
							i_4706_ += i_4710_;
						}
					} else if (i_4701_ == 0) {
						int i_4716_ = (i_4702_ & 0xff0000) >> 16;
						int i_4717_ = (i_4702_ & 0xff00) >> 8;
						int i_4718_ = i_4702_ & 0xff;
						for (int i_4719_ = -i_4707_; i_4719_ < 0; i_4719_++) {
							for (int i_4720_ = -i_4708_; i_4720_ < 0; i_4720_++) {
								int i_4721_ = (anIntArray11393[aByteArray11394[i_4706_++] & 0xff]);
								int i_4722_ = ((i_4721_ & 0xff0000) * i_4716_ & ~0xffffff);
								int i_4723_ = (i_4721_ & 0xff00) * i_4717_ & 0xff0000;
								int i_4724_ = (i_4721_ & 0xff) * i_4718_ & 0xff00;
								is[i_4705_++] = (i_4722_ | i_4723_ | i_4724_) >>> 8;
							}
							i_4705_ += i_4709_;
							i_4706_ += i_4710_;
						}
					} else if (i_4701_ == 3) {
						for (int i_4725_ = -i_4707_; i_4725_ < 0; i_4725_++) {
							for (int i_4726_ = -i_4708_; i_4726_ < 0; i_4726_++) {
								int i_4727_ = (anIntArray11393[aByteArray11394[i_4706_++] & 0xff]);
								int i_4728_ = i_4727_ + i_4702_;
								int i_4729_ = ((i_4727_ & 0xff00ff) + (i_4702_ & 0xff00ff));
								int i_4730_ = ((i_4729_ & 0x1000100) + (i_4728_ - i_4729_ & 0x10000));
								is[i_4705_++] = i_4728_ - i_4730_ | i_4730_ - (i_4730_ >>> 8);
							}
							i_4705_ += i_4709_;
							i_4706_ += i_4710_;
						}
					} else if (i_4701_ == 2) {
						int i_4731_ = i_4702_ >>> 24;
						int i_4732_ = 256 - i_4731_;
						int i_4733_ = (i_4702_ & 0xff00ff) * i_4732_ & ~0xff00ff;
						int i_4734_ = (i_4702_ & 0xff00) * i_4732_ & 0xff0000;
						i_4702_ = (i_4733_ | i_4734_) >>> 8;
						for (int i_4735_ = -i_4707_; i_4735_ < 0; i_4735_++) {
							for (int i_4736_ = -i_4708_; i_4736_ < 0; i_4736_++) {
								int i_4737_ = (anIntArray11393[aByteArray11394[i_4706_++] & 0xff]);
								i_4733_ = ((i_4737_ & 0xff00ff) * i_4731_ & ~0xff00ff);
								i_4734_ = (i_4737_ & 0xff00) * i_4731_ & 0xff0000;
								is[i_4705_++] = ((i_4733_ | i_4734_) >>> 8) + i_4702_;
							}
							i_4705_ += i_4709_;
							i_4706_ += i_4710_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_4703_ == 1) {
					if (i_4701_ == 1) {
						for (int i_4738_ = -i_4707_; i_4738_ < 0; i_4738_++) {
							for (int i_4739_ = -i_4708_; i_4739_ < 0; i_4739_++) {
								int i_4740_ = aByteArray11394[i_4706_++];
								if (i_4740_ != 0) {
									int i_4741_ = (anIntArray11393[i_4740_ & 0xff] | ~0xffffff);
									int i_4742_ = 255;
									int i_4743_ = 0;
									int i_4744_ = is[i_4705_];
									is[i_4705_++] = (((((i_4741_ & 0xff00ff) * i_4742_ + (i_4744_ & 0xff00ff) * i_4743_) & ~0xff00ff) >> 8) + (((((i_4741_ & ~0xff00ff) >>> 8) * i_4742_) + (((i_4744_ & ~0xff00ff) >>> 8) * i_4743_)) & ~0xff00ff));
								} else
									i_4705_++;
							}
							i_4705_ += i_4709_;
							i_4706_ += i_4710_;
						}
					} else if (i_4701_ == 0) {
						if ((i_4702_ & 0xffffff) == 16777215) {
							int i_4745_ = i_4702_ >>> 24;
							int i_4746_ = 256 - i_4745_;
							for (int i_4747_ = -i_4707_; i_4747_ < 0; i_4747_++) {
								for (int i_4748_ = -i_4708_; i_4748_ < 0; i_4748_++) {
									int i_4749_ = aByteArray11394[i_4706_++];
									if (i_4749_ != 0) {
										int i_4750_ = anIntArray11393[i_4749_ & 0xff];
										int i_4751_ = is[i_4705_];
										is[i_4705_++] = ((((i_4750_ & 0xff00ff) * i_4745_ + ((i_4751_ & 0xff00ff) * i_4746_)) & ~0xff00ff) + (((i_4750_ & 0xff00) * i_4745_ + ((i_4751_ & 0xff00) * i_4746_)) & 0xff0000)) >> 8;
									} else
										i_4705_++;
								}
								i_4705_ += i_4709_;
								i_4706_ += i_4710_;
							}
						} else {
							int i_4752_ = (i_4702_ & 0xff0000) >> 16;
							int i_4753_ = (i_4702_ & 0xff00) >> 8;
							int i_4754_ = i_4702_ & 0xff;
							int i_4755_ = i_4702_ >>> 24;
							int i_4756_ = 256 - i_4755_;
							for (int i_4757_ = -i_4707_; i_4757_ < 0; i_4757_++) {
								for (int i_4758_ = -i_4708_; i_4758_ < 0; i_4758_++) {
									int i_4759_ = aByteArray11394[i_4706_++];
									if (i_4759_ != 0) {
										int i_4760_ = anIntArray11393[i_4759_ & 0xff];
										if (i_4755_ != 255) {
											int i_4761_ = (((i_4760_ & 0xff0000) * i_4752_) & ~0xffffff);
											int i_4762_ = ((i_4760_ & 0xff00) * i_4753_ & 0xff0000);
											int i_4763_ = ((i_4760_ & 0xff) * i_4754_ & 0xff00);
											i_4760_ = (i_4761_ | i_4762_ | i_4763_) >>> 8;
											int i_4764_ = is[i_4705_];
											is[i_4705_++] = (((((i_4760_ & 0xff00ff) * i_4755_) + ((i_4764_ & 0xff00ff) * i_4756_)) & ~0xff00ff) + ((((i_4760_ & 0xff00) * i_4755_) + ((i_4764_ & 0xff00) * i_4756_)) & 0xff0000)) >> 8;
										} else {
											int i_4765_ = (((i_4760_ & 0xff0000) * i_4752_) & ~0xffffff);
											int i_4766_ = ((i_4760_ & 0xff00) * i_4753_ & 0xff0000);
											int i_4767_ = ((i_4760_ & 0xff) * i_4754_ & 0xff00);
											is[i_4705_++] = (i_4765_ | i_4766_ | i_4767_) >>> 8;
										}
									} else
										i_4705_++;
								}
								i_4705_ += i_4709_;
								i_4706_ += i_4710_;
							}
						}
					} else if (i_4701_ == 3) {
						int i_4768_ = i_4702_ >>> 24;
						int i_4769_ = 256 - i_4768_;
						for (int i_4770_ = -i_4707_; i_4770_ < 0; i_4770_++) {
							for (int i_4771_ = -i_4708_; i_4771_ < 0; i_4771_++) {
								byte i_4772_ = aByteArray11394[i_4706_++];
								int i_4773_ = (i_4772_ > 0 ? anIntArray11393[i_4772_] : 0);
								int i_4774_ = i_4773_ + i_4702_;
								int i_4775_ = ((i_4773_ & 0xff00ff) + (i_4702_ & 0xff00ff));
								int i_4776_ = ((i_4775_ & 0x1000100) + (i_4774_ - i_4775_ & 0x10000));
								i_4776_ = i_4774_ - i_4776_ | i_4776_ - (i_4776_ >>> 8);
								if (i_4773_ == 0 && i_4768_ != 255) {
									i_4773_ = i_4776_;
									i_4776_ = is[i_4705_];
									i_4776_ = ((((i_4773_ & 0xff00ff) * i_4768_ + (i_4776_ & 0xff00ff) * i_4769_) & ~0xff00ff) + (((i_4773_ & 0xff00) * i_4768_ + (i_4776_ & 0xff00) * i_4769_) & 0xff0000)) >> 8;
								}
								is[i_4705_++] = i_4776_;
							}
							i_4705_ += i_4709_;
							i_4706_ += i_4710_;
						}
					} else if (i_4701_ == 2) {
						int i_4777_ = i_4702_ >>> 24;
						int i_4778_ = 256 - i_4777_;
						int i_4779_ = (i_4702_ & 0xff00ff) * i_4778_ & ~0xff00ff;
						int i_4780_ = (i_4702_ & 0xff00) * i_4778_ & 0xff0000;
						i_4702_ = (i_4779_ | i_4780_) >>> 8;
						for (int i_4781_ = -i_4707_; i_4781_ < 0; i_4781_++) {
							for (int i_4782_ = -i_4708_; i_4782_ < 0; i_4782_++) {
								int i_4783_ = aByteArray11394[i_4706_++];
								if (i_4783_ != 0) {
									int i_4784_ = anIntArray11393[i_4783_ & 0xff];
									i_4779_ = ((i_4784_ & 0xff00ff) * i_4777_ & ~0xff00ff);
									i_4780_ = ((i_4784_ & 0xff00) * i_4777_ & 0xff0000);
									is[i_4705_++] = ((i_4779_ | i_4780_) >>> 8) + i_4702_;
								} else
									i_4705_++;
							}
							i_4705_ += i_4709_;
							i_4706_ += i_4710_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_4703_ == 2) {
					if (i_4701_ == 1) {
						for (int i_4785_ = -i_4707_; i_4785_ < 0; i_4785_++) {
							for (int i_4786_ = -i_4708_; i_4786_ < 0; i_4786_++) {
								int i_4787_ = aByteArray11394[i_4706_++];
								if (i_4787_ != 0) {
									int i_4788_ = anIntArray11393[i_4787_ & 0xff];
									int i_4789_ = is[i_4705_];
									int i_4790_ = i_4788_ + i_4789_;
									int i_4791_ = ((i_4788_ & 0xff00ff) + (i_4789_ & 0xff00ff));
									i_4789_ = ((i_4791_ & 0x1000100) + (i_4790_ - i_4791_ & 0x10000));
									is[i_4705_++] = (i_4790_ - i_4789_ | i_4789_ - (i_4789_ >>> 8));
								} else
									i_4705_++;
							}
							i_4705_ += i_4709_;
							i_4706_ += i_4710_;
						}
					} else if (i_4701_ == 0) {
						int i_4792_ = (i_4702_ & 0xff0000) >> 16;
						int i_4793_ = (i_4702_ & 0xff00) >> 8;
						int i_4794_ = i_4702_ & 0xff;
						for (int i_4795_ = -i_4707_; i_4795_ < 0; i_4795_++) {
							for (int i_4796_ = -i_4708_; i_4796_ < 0; i_4796_++) {
								int i_4797_ = aByteArray11394[i_4706_++];
								if (i_4797_ != 0) {
									int i_4798_ = anIntArray11393[i_4797_ & 0xff];
									int i_4799_ = ((i_4798_ & 0xff0000) * i_4792_ & ~0xffffff);
									int i_4800_ = ((i_4798_ & 0xff00) * i_4793_ & 0xff0000);
									int i_4801_ = (i_4798_ & 0xff) * i_4794_ & 0xff00;
									i_4798_ = (i_4799_ | i_4800_ | i_4801_) >>> 8;
									int i_4802_ = is[i_4705_];
									int i_4803_ = i_4798_ + i_4802_;
									int i_4804_ = ((i_4798_ & 0xff00ff) + (i_4802_ & 0xff00ff));
									i_4802_ = ((i_4804_ & 0x1000100) + (i_4803_ - i_4804_ & 0x10000));
									is[i_4705_++] = (i_4803_ - i_4802_ | i_4802_ - (i_4802_ >>> 8));
								} else
									i_4705_++;
							}
							i_4705_ += i_4709_;
							i_4706_ += i_4710_;
						}
					} else if (i_4701_ == 3) {
						for (int i_4805_ = -i_4707_; i_4805_ < 0; i_4805_++) {
							for (int i_4806_ = -i_4708_; i_4806_ < 0; i_4806_++) {
								byte i_4807_ = aByteArray11394[i_4706_++];
								int i_4808_ = (i_4807_ > 0 ? anIntArray11393[i_4807_] : 0);
								int i_4809_ = i_4808_ + i_4702_;
								int i_4810_ = ((i_4808_ & 0xff00ff) + (i_4702_ & 0xff00ff));
								int i_4811_ = ((i_4810_ & 0x1000100) + (i_4809_ - i_4810_ & 0x10000));
								i_4808_ = i_4809_ - i_4811_ | i_4811_ - (i_4811_ >>> 8);
								i_4811_ = is[i_4705_];
								i_4809_ = i_4808_ + i_4811_;
								i_4810_ = (i_4808_ & 0xff00ff) + (i_4811_ & 0xff00ff);
								i_4811_ = ((i_4810_ & 0x1000100) + (i_4809_ - i_4810_ & 0x10000));
								is[i_4705_++] = i_4809_ - i_4811_ | i_4811_ - (i_4811_ >>> 8);
							}
							i_4705_ += i_4709_;
							i_4706_ += i_4710_;
						}
					} else if (i_4701_ == 2) {
						int i_4812_ = i_4702_ >>> 24;
						int i_4813_ = 256 - i_4812_;
						int i_4814_ = (i_4702_ & 0xff00ff) * i_4813_ & ~0xff00ff;
						int i_4815_ = (i_4702_ & 0xff00) * i_4813_ & 0xff0000;
						i_4702_ = (i_4814_ | i_4815_) >>> 8;
						for (int i_4816_ = -i_4707_; i_4816_ < 0; i_4816_++) {
							for (int i_4817_ = -i_4708_; i_4817_ < 0; i_4817_++) {
								int i_4818_ = aByteArray11394[i_4706_++];
								if (i_4818_ != 0) {
									int i_4819_ = anIntArray11393[i_4818_ & 0xff];
									i_4814_ = ((i_4819_ & 0xff00ff) * i_4812_ & ~0xff00ff);
									i_4815_ = ((i_4819_ & 0xff00) * i_4812_ & 0xff0000);
									i_4819_ = (((i_4814_ | i_4815_) >>> 8) + i_4702_);
									int i_4820_ = is[i_4705_];
									int i_4821_ = i_4819_ + i_4820_;
									int i_4822_ = ((i_4819_ & 0xff00ff) + (i_4820_ & 0xff00ff));
									i_4820_ = ((i_4822_ & 0x1000100) + (i_4821_ - i_4822_ & 0x10000));
									is[i_4705_++] = (i_4821_ - i_4820_ | i_4820_ - (i_4820_ >>> 8));
								} else
									i_4705_++;
							}
							i_4705_ += i_4709_;
							i_4706_ += i_4710_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method8436(int[] is, int[] is_4823_, int i, int i_4824_) {
		int[] is_4825_ = aClass167_Sub1_8946.anIntArray8996;
		if (is_4825_ != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_4826_ = anInt8957;
					while (i_4826_ < 0) {
						int i_4827_ = i_4826_ + i_4824_;
						if (i_4827_ >= 0) {
							if (i_4827_ >= is.length)
								break;
							int i_4828_ = anInt8959;
							int i_4829_ = anInt8966;
							int i_4830_ = anInt8967;
							int i_4831_ = anInt8955;
							if (i_4829_ >= 0 && i_4830_ >= 0 && i_4829_ - (anInt8945 << 12) < 0 && i_4830_ - (anInt8950 << 12) < 0) {
								int i_4832_ = is[i_4827_] - i;
								int i_4833_ = -is_4823_[i_4827_];
								int i_4834_ = i_4832_ - (i_4828_ - anInt8959);
								if (i_4834_ > 0) {
									i_4828_ += i_4834_;
									i_4831_ += i_4834_;
									i_4829_ += anInt8960 * i_4834_;
									i_4830_ += anInt8962 * i_4834_;
								} else
									i_4833_ -= i_4834_;
								if (i_4831_ < i_4833_)
									i_4831_ = i_4833_;
								for (/**/; i_4831_ < 0; i_4831_++) {
									int i_4835_ = (aByteArray11394[((i_4830_ >> 12) * anInt8945 + (i_4829_ >> 12))]);
									if (i_4835_ != 0)
										is_4825_[i_4828_++] = anIntArray11393[i_4835_ & 0xff];
									else
										i_4828_++;
								}
							}
						}
						i_4826_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_4836_ = anInt8957;
					while (i_4836_ < 0) {
						int i_4837_ = i_4836_ + i_4824_;
						if (i_4837_ >= 0) {
							if (i_4837_ >= is.length)
								break;
							int i_4838_ = anInt8959;
							int i_4839_ = anInt8966;
							int i_4840_ = anInt8967 + anInt8969;
							int i_4841_ = anInt8955;
							if (i_4839_ >= 0 && i_4839_ - (anInt8945 << 12) < 0) {
								int i_4842_;
								if ((i_4842_ = i_4840_ - (anInt8950 << 12)) >= 0) {
									i_4842_ = (anInt8962 - i_4842_) / anInt8962;
									i_4841_ += i_4842_;
									i_4840_ += anInt8962 * i_4842_;
									i_4838_ += i_4842_;
								}
								if ((i_4842_ = (i_4840_ - anInt8962) / anInt8962) > i_4841_)
									i_4841_ = i_4842_;
								int i_4843_ = is[i_4837_] - i;
								int i_4844_ = -is_4823_[i_4837_];
								int i_4845_ = i_4843_ - (i_4838_ - anInt8959);
								if (i_4845_ > 0) {
									i_4838_ += i_4845_;
									i_4841_ += i_4845_;
									i_4839_ += anInt8960 * i_4845_;
									i_4840_ += anInt8962 * i_4845_;
								} else
									i_4844_ -= i_4845_;
								if (i_4841_ < i_4844_)
									i_4841_ = i_4844_;
								for (/**/; i_4841_ < 0; i_4841_++) {
									int i_4846_ = (aByteArray11394[((i_4840_ >> 12) * anInt8945 + (i_4839_ >> 12))]);
									if (i_4846_ != 0)
										is_4825_[i_4838_++] = anIntArray11393[i_4846_ & 0xff];
									else
										i_4838_++;
									i_4840_ += anInt8962;
								}
							}
						}
						i_4836_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_4847_ = anInt8957;
					while (i_4847_ < 0) {
						int i_4848_ = i_4847_ + i_4824_;
						if (i_4848_ >= 0) {
							if (i_4848_ >= is.length)
								break;
							int i_4849_ = anInt8959;
							int i_4850_ = anInt8966;
							int i_4851_ = anInt8967 + anInt8969;
							int i_4852_ = anInt8955;
							if (i_4850_ >= 0 && i_4850_ - (anInt8945 << 12) < 0) {
								if (i_4851_ < 0) {
									int i_4853_ = ((anInt8962 - 1 - i_4851_) / anInt8962);
									i_4852_ += i_4853_;
									i_4851_ += anInt8962 * i_4853_;
									i_4849_ += i_4853_;
								}
								int i_4854_;
								if ((i_4854_ = (1 + i_4851_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_4852_)
									i_4852_ = i_4854_;
								int i_4855_ = is[i_4848_] - i;
								int i_4856_ = -is_4823_[i_4848_];
								int i_4857_ = i_4855_ - (i_4849_ - anInt8959);
								if (i_4857_ > 0) {
									i_4849_ += i_4857_;
									i_4852_ += i_4857_;
									i_4850_ += anInt8960 * i_4857_;
									i_4851_ += anInt8962 * i_4857_;
								} else
									i_4856_ -= i_4857_;
								if (i_4852_ < i_4856_)
									i_4852_ = i_4856_;
								for (/**/; i_4852_ < 0; i_4852_++) {
									int i_4858_ = (aByteArray11394[((i_4851_ >> 12) * anInt8945 + (i_4850_ >> 12))]);
									if (i_4858_ != 0)
										is_4825_[i_4849_++] = anIntArray11393[i_4858_ & 0xff];
									else
										i_4849_++;
									i_4851_ += anInt8962;
								}
							}
						}
						i_4847_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_4859_ = anInt8957;
					while (i_4859_ < 0) {
						int i_4860_ = i_4859_ + i_4824_;
						if (i_4860_ >= 0) {
							if (i_4860_ >= is.length)
								break;
							int i_4861_ = anInt8959;
							int i_4862_ = anInt8966 + anInt8968;
							int i_4863_ = anInt8967;
							int i_4864_ = anInt8955;
							if (i_4863_ >= 0 && i_4863_ - (anInt8950 << 12) < 0) {
								int i_4865_;
								if ((i_4865_ = i_4862_ - (anInt8945 << 12)) >= 0) {
									i_4865_ = (anInt8960 - i_4865_) / anInt8960;
									i_4864_ += i_4865_;
									i_4862_ += anInt8960 * i_4865_;
									i_4861_ += i_4865_;
								}
								if ((i_4865_ = (i_4862_ - anInt8960) / anInt8960) > i_4864_)
									i_4864_ = i_4865_;
								int i_4866_ = is[i_4860_] - i;
								int i_4867_ = -is_4823_[i_4860_];
								int i_4868_ = i_4866_ - (i_4861_ - anInt8959);
								if (i_4868_ > 0) {
									i_4861_ += i_4868_;
									i_4864_ += i_4868_;
									i_4862_ += anInt8960 * i_4868_;
									i_4863_ += anInt8962 * i_4868_;
								} else
									i_4867_ -= i_4868_;
								if (i_4864_ < i_4867_)
									i_4864_ = i_4867_;
								for (/**/; i_4864_ < 0; i_4864_++) {
									int i_4869_ = (aByteArray11394[((i_4863_ >> 12) * anInt8945 + (i_4862_ >> 12))]);
									if (i_4869_ != 0)
										is_4825_[i_4861_++] = anIntArray11393[i_4869_ & 0xff];
									else
										i_4861_++;
									i_4862_ += anInt8960;
								}
							}
						}
						i_4859_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_4870_ = anInt8957;
					while (i_4870_ < 0) {
						int i_4871_ = i_4870_ + i_4824_;
						if (i_4871_ >= 0) {
							if (i_4871_ >= is.length)
								break;
							int i_4872_ = anInt8959;
							int i_4873_ = anInt8966 + anInt8968;
							int i_4874_ = anInt8967 + anInt8969;
							int i_4875_ = anInt8955;
							int i_4876_;
							if ((i_4876_ = i_4873_ - (anInt8945 << 12)) >= 0) {
								i_4876_ = (anInt8960 - i_4876_) / anInt8960;
								i_4875_ += i_4876_;
								i_4873_ += anInt8960 * i_4876_;
								i_4874_ += anInt8962 * i_4876_;
								i_4872_ += i_4876_;
							}
							if ((i_4876_ = (i_4873_ - anInt8960) / anInt8960) > i_4875_)
								i_4875_ = i_4876_;
							if ((i_4876_ = i_4874_ - (anInt8950 << 12)) >= 0) {
								i_4876_ = (anInt8962 - i_4876_) / anInt8962;
								i_4875_ += i_4876_;
								i_4873_ += anInt8960 * i_4876_;
								i_4874_ += anInt8962 * i_4876_;
								i_4872_ += i_4876_;
							}
							if ((i_4876_ = (i_4874_ - anInt8962) / anInt8962) > i_4875_)
								i_4875_ = i_4876_;
							int i_4877_ = is[i_4871_] - i;
							int i_4878_ = -is_4823_[i_4871_];
							int i_4879_ = i_4877_ - (i_4872_ - anInt8959);
							if (i_4879_ > 0) {
								i_4872_ += i_4879_;
								i_4875_ += i_4879_;
								i_4873_ += anInt8960 * i_4879_;
								i_4874_ += anInt8962 * i_4879_;
							} else
								i_4878_ -= i_4879_;
							if (i_4875_ < i_4878_)
								i_4875_ = i_4878_;
							for (/**/; i_4875_ < 0; i_4875_++) {
								int i_4880_ = (aByteArray11394[((i_4874_ >> 12) * anInt8945 + (i_4873_ >> 12))]);
								if (i_4880_ != 0)
									is_4825_[i_4872_++] = anIntArray11393[i_4880_ & 0xff];
								else
									i_4872_++;
								i_4873_ += anInt8960;
								i_4874_ += anInt8962;
							}
						}
						i_4870_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_4881_ = anInt8957;
					while (i_4881_ < 0) {
						int i_4882_ = i_4881_ + i_4824_;
						if (i_4882_ >= 0) {
							if (i_4882_ >= is.length)
								break;
							int i_4883_ = anInt8959;
							int i_4884_ = anInt8966 + anInt8968;
							int i_4885_ = anInt8967 + anInt8969;
							int i_4886_ = anInt8955;
							int i_4887_;
							if ((i_4887_ = i_4884_ - (anInt8945 << 12)) >= 0) {
								i_4887_ = (anInt8960 - i_4887_) / anInt8960;
								i_4886_ += i_4887_;
								i_4884_ += anInt8960 * i_4887_;
								i_4885_ += anInt8962 * i_4887_;
								i_4883_ += i_4887_;
							}
							if ((i_4887_ = (i_4884_ - anInt8960) / anInt8960) > i_4886_)
								i_4886_ = i_4887_;
							if (i_4885_ < 0) {
								i_4887_ = (anInt8962 - 1 - i_4885_) / anInt8962;
								i_4886_ += i_4887_;
								i_4884_ += anInt8960 * i_4887_;
								i_4885_ += anInt8962 * i_4887_;
								i_4883_ += i_4887_;
							}
							if ((i_4887_ = (1 + i_4885_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_4886_)
								i_4886_ = i_4887_;
							int i_4888_ = is[i_4882_] - i;
							int i_4889_ = -is_4823_[i_4882_];
							int i_4890_ = i_4888_ - (i_4883_ - anInt8959);
							if (i_4890_ > 0) {
								i_4883_ += i_4890_;
								i_4886_ += i_4890_;
								i_4884_ += anInt8960 * i_4890_;
								i_4885_ += anInt8962 * i_4890_;
							} else
								i_4889_ -= i_4890_;
							if (i_4886_ < i_4889_)
								i_4886_ = i_4889_;
							for (/**/; i_4886_ < 0; i_4886_++) {
								int i_4891_ = (aByteArray11394[((i_4885_ >> 12) * anInt8945 + (i_4884_ >> 12))]);
								if (i_4891_ != 0)
									is_4825_[i_4883_++] = anIntArray11393[i_4891_ & 0xff];
								else
									i_4883_++;
								i_4884_ += anInt8960;
								i_4885_ += anInt8962;
							}
						}
						i_4881_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_4892_ = anInt8957;
				while (i_4892_ < 0) {
					int i_4893_ = i_4892_ + i_4824_;
					if (i_4893_ >= 0) {
						if (i_4893_ >= is.length)
							break;
						int i_4894_ = anInt8959;
						int i_4895_ = anInt8966 + anInt8968;
						int i_4896_ = anInt8967;
						int i_4897_ = anInt8955;
						if (i_4896_ >= 0 && i_4896_ - (anInt8950 << 12) < 0) {
							if (i_4895_ < 0) {
								int i_4898_ = (anInt8960 - 1 - i_4895_) / anInt8960;
								i_4897_ += i_4898_;
								i_4895_ += anInt8960 * i_4898_;
								i_4894_ += i_4898_;
							}
							int i_4899_;
							if ((i_4899_ = (1 + i_4895_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_4897_)
								i_4897_ = i_4899_;
							int i_4900_ = is[i_4893_] - i;
							int i_4901_ = -is_4823_[i_4893_];
							int i_4902_ = i_4900_ - (i_4894_ - anInt8959);
							if (i_4902_ > 0) {
								i_4894_ += i_4902_;
								i_4897_ += i_4902_;
								i_4895_ += anInt8960 * i_4902_;
								i_4896_ += anInt8962 * i_4902_;
							} else
								i_4901_ -= i_4902_;
							if (i_4897_ < i_4901_)
								i_4897_ = i_4901_;
							for (/**/; i_4897_ < 0; i_4897_++) {
								int i_4903_ = (aByteArray11394[((i_4896_ >> 12) * anInt8945 + (i_4895_ >> 12))]);
								if (i_4903_ != 0)
									is_4825_[i_4894_++] = anIntArray11393[i_4903_ & 0xff];
								else
									i_4894_++;
								i_4895_ += anInt8960;
							}
						}
					}
					i_4892_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				int i_4904_ = anInt8957;
				while (i_4904_ < 0) {
					int i_4905_ = i_4904_ + i_4824_;
					if (i_4905_ >= 0) {
						if (i_4905_ >= is.length)
							break;
						int i_4906_ = anInt8959;
						int i_4907_ = anInt8966 + anInt8968;
						int i_4908_ = anInt8967 + anInt8969;
						int i_4909_ = anInt8955;
						if (i_4907_ < 0) {
							int i_4910_ = (anInt8960 - 1 - i_4907_) / anInt8960;
							i_4909_ += i_4910_;
							i_4907_ += anInt8960 * i_4910_;
							i_4908_ += anInt8962 * i_4910_;
							i_4906_ += i_4910_;
						}
						int i_4911_;
						if ((i_4911_ = (1 + i_4907_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_4909_)
							i_4909_ = i_4911_;
						if ((i_4911_ = i_4908_ - (anInt8950 << 12)) >= 0) {
							i_4911_ = (anInt8962 - i_4911_) / anInt8962;
							i_4909_ += i_4911_;
							i_4907_ += anInt8960 * i_4911_;
							i_4908_ += anInt8962 * i_4911_;
							i_4906_ += i_4911_;
						}
						if ((i_4911_ = (i_4908_ - anInt8962) / anInt8962) > i_4909_)
							i_4909_ = i_4911_;
						int i_4912_ = is[i_4905_] - i;
						int i_4913_ = -is_4823_[i_4905_];
						int i_4914_ = i_4912_ - (i_4906_ - anInt8959);
						if (i_4914_ > 0) {
							i_4906_ += i_4914_;
							i_4909_ += i_4914_;
							i_4907_ += anInt8960 * i_4914_;
							i_4908_ += anInt8962 * i_4914_;
						} else
							i_4913_ -= i_4914_;
						if (i_4909_ < i_4913_)
							i_4909_ = i_4913_;
						for (/**/; i_4909_ < 0; i_4909_++) {
							int i_4915_ = (aByteArray11394[(i_4908_ >> 12) * anInt8945 + (i_4907_ >> 12)]);
							if (i_4915_ != 0)
								is_4825_[i_4906_++] = anIntArray11393[i_4915_ & 0xff];
							else
								i_4906_++;
							i_4907_ += anInt8960;
							i_4908_ += anInt8962;
						}
					}
					i_4904_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				int i_4916_ = anInt8957;
				while (i_4916_ < 0) {
					int i_4917_ = i_4916_ + i_4824_;
					if (i_4917_ >= 0) {
						if (i_4917_ >= is.length)
							break;
						int i_4918_ = anInt8959;
						int i_4919_ = anInt8966 + anInt8968;
						int i_4920_ = anInt8967 + anInt8969;
						int i_4921_ = anInt8955;
						if (i_4919_ < 0) {
							int i_4922_ = (anInt8960 - 1 - i_4919_) / anInt8960;
							i_4921_ += i_4922_;
							i_4919_ += anInt8960 * i_4922_;
							i_4920_ += anInt8962 * i_4922_;
							i_4918_ += i_4922_;
						}
						int i_4923_;
						if ((i_4923_ = (1 + i_4919_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_4921_)
							i_4921_ = i_4923_;
						if (i_4920_ < 0) {
							i_4923_ = (anInt8962 - 1 - i_4920_) / anInt8962;
							i_4921_ += i_4923_;
							i_4919_ += anInt8960 * i_4923_;
							i_4920_ += anInt8962 * i_4923_;
							i_4918_ += i_4923_;
						}
						if ((i_4923_ = (1 + i_4920_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_4921_)
							i_4921_ = i_4923_;
						int i_4924_ = is[i_4917_] - i;
						int i_4925_ = -is_4823_[i_4917_];
						int i_4926_ = i_4924_ - (i_4918_ - anInt8959);
						if (i_4926_ > 0) {
							i_4918_ += i_4926_;
							i_4921_ += i_4926_;
							i_4919_ += anInt8960 * i_4926_;
							i_4920_ += anInt8962 * i_4926_;
						} else
							i_4925_ -= i_4926_;
						if (i_4921_ < i_4925_)
							i_4921_ = i_4925_;
						for (/**/; i_4921_ < 0; i_4921_++) {
							int i_4927_ = (aByteArray11394[(i_4920_ >> 12) * anInt8945 + (i_4919_ >> 12)]);
							if (i_4927_ != 0)
								is_4825_[i_4918_++] = anIntArray11393[i_4927_ & 0xff];
							else
								i_4918_++;
							i_4919_ += anInt8960;
							i_4920_ += anInt8962;
						}
					}
					i_4916_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	void method8432(int[] is, int[] is_4928_, int i, int i_4929_) {
		int[] is_4930_ = aClass167_Sub1_8946.anIntArray8996;
		if (is_4930_ != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_4931_ = anInt8957;
					while (i_4931_ < 0) {
						int i_4932_ = i_4931_ + i_4929_;
						if (i_4932_ >= 0) {
							if (i_4932_ >= is.length)
								break;
							int i_4933_ = anInt8959;
							int i_4934_ = anInt8966;
							int i_4935_ = anInt8967;
							int i_4936_ = anInt8955;
							if (i_4934_ >= 0 && i_4935_ >= 0 && i_4934_ - (anInt8945 << 12) < 0 && i_4935_ - (anInt8950 << 12) < 0) {
								int i_4937_ = is[i_4932_] - i;
								int i_4938_ = -is_4928_[i_4932_];
								int i_4939_ = i_4937_ - (i_4933_ - anInt8959);
								if (i_4939_ > 0) {
									i_4933_ += i_4939_;
									i_4936_ += i_4939_;
									i_4934_ += anInt8960 * i_4939_;
									i_4935_ += anInt8962 * i_4939_;
								} else
									i_4938_ -= i_4939_;
								if (i_4936_ < i_4938_)
									i_4936_ = i_4938_;
								for (/**/; i_4936_ < 0; i_4936_++) {
									int i_4940_ = (aByteArray11394[((i_4935_ >> 12) * anInt8945 + (i_4934_ >> 12))]);
									if (i_4940_ != 0)
										is_4930_[i_4933_++] = anIntArray11393[i_4940_ & 0xff];
									else
										i_4933_++;
								}
							}
						}
						i_4931_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_4941_ = anInt8957;
					while (i_4941_ < 0) {
						int i_4942_ = i_4941_ + i_4929_;
						if (i_4942_ >= 0) {
							if (i_4942_ >= is.length)
								break;
							int i_4943_ = anInt8959;
							int i_4944_ = anInt8966;
							int i_4945_ = anInt8967 + anInt8969;
							int i_4946_ = anInt8955;
							if (i_4944_ >= 0 && i_4944_ - (anInt8945 << 12) < 0) {
								int i_4947_;
								if ((i_4947_ = i_4945_ - (anInt8950 << 12)) >= 0) {
									i_4947_ = (anInt8962 - i_4947_) / anInt8962;
									i_4946_ += i_4947_;
									i_4945_ += anInt8962 * i_4947_;
									i_4943_ += i_4947_;
								}
								if ((i_4947_ = (i_4945_ - anInt8962) / anInt8962) > i_4946_)
									i_4946_ = i_4947_;
								int i_4948_ = is[i_4942_] - i;
								int i_4949_ = -is_4928_[i_4942_];
								int i_4950_ = i_4948_ - (i_4943_ - anInt8959);
								if (i_4950_ > 0) {
									i_4943_ += i_4950_;
									i_4946_ += i_4950_;
									i_4944_ += anInt8960 * i_4950_;
									i_4945_ += anInt8962 * i_4950_;
								} else
									i_4949_ -= i_4950_;
								if (i_4946_ < i_4949_)
									i_4946_ = i_4949_;
								for (/**/; i_4946_ < 0; i_4946_++) {
									int i_4951_ = (aByteArray11394[((i_4945_ >> 12) * anInt8945 + (i_4944_ >> 12))]);
									if (i_4951_ != 0)
										is_4930_[i_4943_++] = anIntArray11393[i_4951_ & 0xff];
									else
										i_4943_++;
									i_4945_ += anInt8962;
								}
							}
						}
						i_4941_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_4952_ = anInt8957;
					while (i_4952_ < 0) {
						int i_4953_ = i_4952_ + i_4929_;
						if (i_4953_ >= 0) {
							if (i_4953_ >= is.length)
								break;
							int i_4954_ = anInt8959;
							int i_4955_ = anInt8966;
							int i_4956_ = anInt8967 + anInt8969;
							int i_4957_ = anInt8955;
							if (i_4955_ >= 0 && i_4955_ - (anInt8945 << 12) < 0) {
								if (i_4956_ < 0) {
									int i_4958_ = ((anInt8962 - 1 - i_4956_) / anInt8962);
									i_4957_ += i_4958_;
									i_4956_ += anInt8962 * i_4958_;
									i_4954_ += i_4958_;
								}
								int i_4959_;
								if ((i_4959_ = (1 + i_4956_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_4957_)
									i_4957_ = i_4959_;
								int i_4960_ = is[i_4953_] - i;
								int i_4961_ = -is_4928_[i_4953_];
								int i_4962_ = i_4960_ - (i_4954_ - anInt8959);
								if (i_4962_ > 0) {
									i_4954_ += i_4962_;
									i_4957_ += i_4962_;
									i_4955_ += anInt8960 * i_4962_;
									i_4956_ += anInt8962 * i_4962_;
								} else
									i_4961_ -= i_4962_;
								if (i_4957_ < i_4961_)
									i_4957_ = i_4961_;
								for (/**/; i_4957_ < 0; i_4957_++) {
									int i_4963_ = (aByteArray11394[((i_4956_ >> 12) * anInt8945 + (i_4955_ >> 12))]);
									if (i_4963_ != 0)
										is_4930_[i_4954_++] = anIntArray11393[i_4963_ & 0xff];
									else
										i_4954_++;
									i_4956_ += anInt8962;
								}
							}
						}
						i_4952_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_4964_ = anInt8957;
					while (i_4964_ < 0) {
						int i_4965_ = i_4964_ + i_4929_;
						if (i_4965_ >= 0) {
							if (i_4965_ >= is.length)
								break;
							int i_4966_ = anInt8959;
							int i_4967_ = anInt8966 + anInt8968;
							int i_4968_ = anInt8967;
							int i_4969_ = anInt8955;
							if (i_4968_ >= 0 && i_4968_ - (anInt8950 << 12) < 0) {
								int i_4970_;
								if ((i_4970_ = i_4967_ - (anInt8945 << 12)) >= 0) {
									i_4970_ = (anInt8960 - i_4970_) / anInt8960;
									i_4969_ += i_4970_;
									i_4967_ += anInt8960 * i_4970_;
									i_4966_ += i_4970_;
								}
								if ((i_4970_ = (i_4967_ - anInt8960) / anInt8960) > i_4969_)
									i_4969_ = i_4970_;
								int i_4971_ = is[i_4965_] - i;
								int i_4972_ = -is_4928_[i_4965_];
								int i_4973_ = i_4971_ - (i_4966_ - anInt8959);
								if (i_4973_ > 0) {
									i_4966_ += i_4973_;
									i_4969_ += i_4973_;
									i_4967_ += anInt8960 * i_4973_;
									i_4968_ += anInt8962 * i_4973_;
								} else
									i_4972_ -= i_4973_;
								if (i_4969_ < i_4972_)
									i_4969_ = i_4972_;
								for (/**/; i_4969_ < 0; i_4969_++) {
									int i_4974_ = (aByteArray11394[((i_4968_ >> 12) * anInt8945 + (i_4967_ >> 12))]);
									if (i_4974_ != 0)
										is_4930_[i_4966_++] = anIntArray11393[i_4974_ & 0xff];
									else
										i_4966_++;
									i_4967_ += anInt8960;
								}
							}
						}
						i_4964_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_4975_ = anInt8957;
					while (i_4975_ < 0) {
						int i_4976_ = i_4975_ + i_4929_;
						if (i_4976_ >= 0) {
							if (i_4976_ >= is.length)
								break;
							int i_4977_ = anInt8959;
							int i_4978_ = anInt8966 + anInt8968;
							int i_4979_ = anInt8967 + anInt8969;
							int i_4980_ = anInt8955;
							int i_4981_;
							if ((i_4981_ = i_4978_ - (anInt8945 << 12)) >= 0) {
								i_4981_ = (anInt8960 - i_4981_) / anInt8960;
								i_4980_ += i_4981_;
								i_4978_ += anInt8960 * i_4981_;
								i_4979_ += anInt8962 * i_4981_;
								i_4977_ += i_4981_;
							}
							if ((i_4981_ = (i_4978_ - anInt8960) / anInt8960) > i_4980_)
								i_4980_ = i_4981_;
							if ((i_4981_ = i_4979_ - (anInt8950 << 12)) >= 0) {
								i_4981_ = (anInt8962 - i_4981_) / anInt8962;
								i_4980_ += i_4981_;
								i_4978_ += anInt8960 * i_4981_;
								i_4979_ += anInt8962 * i_4981_;
								i_4977_ += i_4981_;
							}
							if ((i_4981_ = (i_4979_ - anInt8962) / anInt8962) > i_4980_)
								i_4980_ = i_4981_;
							int i_4982_ = is[i_4976_] - i;
							int i_4983_ = -is_4928_[i_4976_];
							int i_4984_ = i_4982_ - (i_4977_ - anInt8959);
							if (i_4984_ > 0) {
								i_4977_ += i_4984_;
								i_4980_ += i_4984_;
								i_4978_ += anInt8960 * i_4984_;
								i_4979_ += anInt8962 * i_4984_;
							} else
								i_4983_ -= i_4984_;
							if (i_4980_ < i_4983_)
								i_4980_ = i_4983_;
							for (/**/; i_4980_ < 0; i_4980_++) {
								int i_4985_ = (aByteArray11394[((i_4979_ >> 12) * anInt8945 + (i_4978_ >> 12))]);
								if (i_4985_ != 0)
									is_4930_[i_4977_++] = anIntArray11393[i_4985_ & 0xff];
								else
									i_4977_++;
								i_4978_ += anInt8960;
								i_4979_ += anInt8962;
							}
						}
						i_4975_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_4986_ = anInt8957;
					while (i_4986_ < 0) {
						int i_4987_ = i_4986_ + i_4929_;
						if (i_4987_ >= 0) {
							if (i_4987_ >= is.length)
								break;
							int i_4988_ = anInt8959;
							int i_4989_ = anInt8966 + anInt8968;
							int i_4990_ = anInt8967 + anInt8969;
							int i_4991_ = anInt8955;
							int i_4992_;
							if ((i_4992_ = i_4989_ - (anInt8945 << 12)) >= 0) {
								i_4992_ = (anInt8960 - i_4992_) / anInt8960;
								i_4991_ += i_4992_;
								i_4989_ += anInt8960 * i_4992_;
								i_4990_ += anInt8962 * i_4992_;
								i_4988_ += i_4992_;
							}
							if ((i_4992_ = (i_4989_ - anInt8960) / anInt8960) > i_4991_)
								i_4991_ = i_4992_;
							if (i_4990_ < 0) {
								i_4992_ = (anInt8962 - 1 - i_4990_) / anInt8962;
								i_4991_ += i_4992_;
								i_4989_ += anInt8960 * i_4992_;
								i_4990_ += anInt8962 * i_4992_;
								i_4988_ += i_4992_;
							}
							if ((i_4992_ = (1 + i_4990_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_4991_)
								i_4991_ = i_4992_;
							int i_4993_ = is[i_4987_] - i;
							int i_4994_ = -is_4928_[i_4987_];
							int i_4995_ = i_4993_ - (i_4988_ - anInt8959);
							if (i_4995_ > 0) {
								i_4988_ += i_4995_;
								i_4991_ += i_4995_;
								i_4989_ += anInt8960 * i_4995_;
								i_4990_ += anInt8962 * i_4995_;
							} else
								i_4994_ -= i_4995_;
							if (i_4991_ < i_4994_)
								i_4991_ = i_4994_;
							for (/**/; i_4991_ < 0; i_4991_++) {
								int i_4996_ = (aByteArray11394[((i_4990_ >> 12) * anInt8945 + (i_4989_ >> 12))]);
								if (i_4996_ != 0)
									is_4930_[i_4988_++] = anIntArray11393[i_4996_ & 0xff];
								else
									i_4988_++;
								i_4989_ += anInt8960;
								i_4990_ += anInt8962;
							}
						}
						i_4986_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_4997_ = anInt8957;
				while (i_4997_ < 0) {
					int i_4998_ = i_4997_ + i_4929_;
					if (i_4998_ >= 0) {
						if (i_4998_ >= is.length)
							break;
						int i_4999_ = anInt8959;
						int i_5000_ = anInt8966 + anInt8968;
						int i_5001_ = anInt8967;
						int i_5002_ = anInt8955;
						if (i_5001_ >= 0 && i_5001_ - (anInt8950 << 12) < 0) {
							if (i_5000_ < 0) {
								int i_5003_ = (anInt8960 - 1 - i_5000_) / anInt8960;
								i_5002_ += i_5003_;
								i_5000_ += anInt8960 * i_5003_;
								i_4999_ += i_5003_;
							}
							int i_5004_;
							if ((i_5004_ = (1 + i_5000_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_5002_)
								i_5002_ = i_5004_;
							int i_5005_ = is[i_4998_] - i;
							int i_5006_ = -is_4928_[i_4998_];
							int i_5007_ = i_5005_ - (i_4999_ - anInt8959);
							if (i_5007_ > 0) {
								i_4999_ += i_5007_;
								i_5002_ += i_5007_;
								i_5000_ += anInt8960 * i_5007_;
								i_5001_ += anInt8962 * i_5007_;
							} else
								i_5006_ -= i_5007_;
							if (i_5002_ < i_5006_)
								i_5002_ = i_5006_;
							for (/**/; i_5002_ < 0; i_5002_++) {
								int i_5008_ = (aByteArray11394[((i_5001_ >> 12) * anInt8945 + (i_5000_ >> 12))]);
								if (i_5008_ != 0)
									is_4930_[i_4999_++] = anIntArray11393[i_5008_ & 0xff];
								else
									i_4999_++;
								i_5000_ += anInt8960;
							}
						}
					}
					i_4997_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				int i_5009_ = anInt8957;
				while (i_5009_ < 0) {
					int i_5010_ = i_5009_ + i_4929_;
					if (i_5010_ >= 0) {
						if (i_5010_ >= is.length)
							break;
						int i_5011_ = anInt8959;
						int i_5012_ = anInt8966 + anInt8968;
						int i_5013_ = anInt8967 + anInt8969;
						int i_5014_ = anInt8955;
						if (i_5012_ < 0) {
							int i_5015_ = (anInt8960 - 1 - i_5012_) / anInt8960;
							i_5014_ += i_5015_;
							i_5012_ += anInt8960 * i_5015_;
							i_5013_ += anInt8962 * i_5015_;
							i_5011_ += i_5015_;
						}
						int i_5016_;
						if ((i_5016_ = (1 + i_5012_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_5014_)
							i_5014_ = i_5016_;
						if ((i_5016_ = i_5013_ - (anInt8950 << 12)) >= 0) {
							i_5016_ = (anInt8962 - i_5016_) / anInt8962;
							i_5014_ += i_5016_;
							i_5012_ += anInt8960 * i_5016_;
							i_5013_ += anInt8962 * i_5016_;
							i_5011_ += i_5016_;
						}
						if ((i_5016_ = (i_5013_ - anInt8962) / anInt8962) > i_5014_)
							i_5014_ = i_5016_;
						int i_5017_ = is[i_5010_] - i;
						int i_5018_ = -is_4928_[i_5010_];
						int i_5019_ = i_5017_ - (i_5011_ - anInt8959);
						if (i_5019_ > 0) {
							i_5011_ += i_5019_;
							i_5014_ += i_5019_;
							i_5012_ += anInt8960 * i_5019_;
							i_5013_ += anInt8962 * i_5019_;
						} else
							i_5018_ -= i_5019_;
						if (i_5014_ < i_5018_)
							i_5014_ = i_5018_;
						for (/**/; i_5014_ < 0; i_5014_++) {
							int i_5020_ = (aByteArray11394[(i_5013_ >> 12) * anInt8945 + (i_5012_ >> 12)]);
							if (i_5020_ != 0)
								is_4930_[i_5011_++] = anIntArray11393[i_5020_ & 0xff];
							else
								i_5011_++;
							i_5012_ += anInt8960;
							i_5013_ += anInt8962;
						}
					}
					i_5009_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				int i_5021_ = anInt8957;
				while (i_5021_ < 0) {
					int i_5022_ = i_5021_ + i_4929_;
					if (i_5022_ >= 0) {
						if (i_5022_ >= is.length)
							break;
						int i_5023_ = anInt8959;
						int i_5024_ = anInt8966 + anInt8968;
						int i_5025_ = anInt8967 + anInt8969;
						int i_5026_ = anInt8955;
						if (i_5024_ < 0) {
							int i_5027_ = (anInt8960 - 1 - i_5024_) / anInt8960;
							i_5026_ += i_5027_;
							i_5024_ += anInt8960 * i_5027_;
							i_5025_ += anInt8962 * i_5027_;
							i_5023_ += i_5027_;
						}
						int i_5028_;
						if ((i_5028_ = (1 + i_5024_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_5026_)
							i_5026_ = i_5028_;
						if (i_5025_ < 0) {
							i_5028_ = (anInt8962 - 1 - i_5025_) / anInt8962;
							i_5026_ += i_5028_;
							i_5024_ += anInt8960 * i_5028_;
							i_5025_ += anInt8962 * i_5028_;
							i_5023_ += i_5028_;
						}
						if ((i_5028_ = (1 + i_5025_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_5026_)
							i_5026_ = i_5028_;
						int i_5029_ = is[i_5022_] - i;
						int i_5030_ = -is_4928_[i_5022_];
						int i_5031_ = i_5029_ - (i_5023_ - anInt8959);
						if (i_5031_ > 0) {
							i_5023_ += i_5031_;
							i_5026_ += i_5031_;
							i_5024_ += anInt8960 * i_5031_;
							i_5025_ += anInt8962 * i_5031_;
						} else
							i_5030_ -= i_5031_;
						if (i_5026_ < i_5030_)
							i_5026_ = i_5030_;
						for (/**/; i_5026_ < 0; i_5026_++) {
							int i_5032_ = (aByteArray11394[(i_5025_ >> 12) * anInt8945 + (i_5024_ >> 12)]);
							if (i_5032_ != 0)
								is_4930_[i_5023_++] = anIntArray11393[i_5032_ & 0xff];
							else
								i_5023_++;
							i_5024_ += anInt8960;
							i_5025_ += anInt8962;
						}
					}
					i_5021_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	public void method1764(int i, int i_5033_, Class161 class161, int i_5034_, int i_5035_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			i += anInt8977;
			i_5033_ += anInt8947;
			int i_5036_ = 0;
			int i_5037_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			int i_5038_ = anInt8945;
			int i_5039_ = anInt8950;
			int i_5040_ = i_5037_ - i_5038_;
			int i_5041_ = 0;
			int i_5042_ = i + i_5033_ * i_5037_;
			if (i_5033_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_5043_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_5033_;
				i_5039_ -= i_5043_;
				i_5033_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_5036_ += i_5043_ * i_5038_;
				i_5042_ += i_5043_ * i_5037_;
			}
			if (i_5033_ + i_5039_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_5039_ -= (i_5033_ + i_5039_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_5044_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_5038_ -= i_5044_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_5036_ += i_5044_;
				i_5042_ += i_5044_;
				i_5041_ += i_5044_;
				i_5040_ += i_5044_;
			}
			if (i + i_5038_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_5045_ = i + i_5038_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_5038_ -= i_5045_;
				i_5041_ += i_5045_;
				i_5040_ += i_5045_;
			}
			if (i_5038_ > 0 && i_5039_ > 0) {
				Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
				int[] is_5046_ = class161_sub2.anIntArray9444;
				int[] is_5047_ = class161_sub2.anIntArray9445;
				int i_5048_ = i_5033_;
				if (i_5035_ > i_5048_) {
					i_5048_ = i_5035_;
					i_5042_ += (i_5035_ - i_5033_) * i_5037_;
					i_5036_ += (i_5035_ - i_5033_) * anInt8945;
				}
				int i_5049_ = (i_5035_ + is_5046_.length < i_5033_ + i_5039_ ? i_5035_ + is_5046_.length : i_5033_ + i_5039_);
				for (int i_5050_ = i_5048_; i_5050_ < i_5049_; i_5050_++) {
					int i_5051_ = is_5046_[i_5050_ - i_5035_] + i_5034_;
					int i_5052_ = is_5047_[i_5050_ - i_5035_];
					int i_5053_ = i_5038_;
					if (i > i_5051_) {
						int i_5054_ = i - i_5051_;
						if (i_5054_ >= i_5052_) {
							i_5036_ += i_5038_ + i_5041_;
							i_5042_ += i_5038_ + i_5040_;
							continue;
						}
						i_5052_ -= i_5054_;
					} else {
						int i_5055_ = i_5051_ - i;
						if (i_5055_ >= i_5038_) {
							i_5036_ += i_5038_ + i_5041_;
							i_5042_ += i_5038_ + i_5040_;
							continue;
						}
						i_5036_ += i_5055_;
						i_5053_ -= i_5055_;
						i_5042_ += i_5055_;
					}
					int i_5056_ = 0;
					if (i_5053_ < i_5052_)
						i_5052_ = i_5053_;
					else
						i_5056_ = i_5053_ - i_5052_;
					for (int i_5057_ = -i_5052_; i_5057_ < 0; i_5057_++) {
						int i_5058_ = aByteArray11394[i_5036_++];
						if (i_5058_ != 0)
							is[i_5042_++] = anIntArray11393[i_5058_ & 0xff];
						else
							i_5042_++;
					}
					i_5036_ += i_5056_ + i_5041_;
					i_5042_ += i_5056_ + i_5040_;
				}
			}
		}
	}
}
