/* Class143_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class143_Sub1_Sub1 extends Class143_Sub1 {
	int[] anIntArray11346;

	Class143_Sub1_Sub1(Class167_Sub1 class167_sub1, int[] is, int i, int i_0_, int i_1_, int i_2_, boolean bool) {
		super(class167_sub1, i_1_, i_2_);
		if (bool)
			anIntArray11346 = new int[i_1_ * i_2_];
		else
			anIntArray11346 = is;
		i_0_ -= anInt8945;
		int i_3_ = 0;
		for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
			for (int i_5_ = 0; i_5_ < i_1_; i_5_++)
				anIntArray11346[i_3_++] = is[i++];
			i += i_0_;
		}
	}

	void method8437(int i, int i_6_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_7_ = anInt8957;
					while (i_7_ < 0) {
						int i_8_ = anInt8959;
						int i_9_ = anInt8966;
						int i_10_ = anInt8967;
						int i_11_ = anInt8955;
						if (i_9_ >= 0 && i_10_ >= 0 && i_9_ - (anInt8945 << 12) < 0 && i_10_ - (anInt8950 << 12) < 0) {
							for (/**/; i_11_ < 0; i_11_++)
								method10510(((i_10_ >> 12) * anInt8945 + (i_9_ >> 12)), i_8_++, is, i, i_6_);
						}
						i_7_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_12_ = anInt8957;
					while (i_12_ < 0) {
						int i_13_ = anInt8959;
						int i_14_ = anInt8966;
						int i_15_ = anInt8967 + anInt8969;
						int i_16_ = anInt8955;
						if (i_14_ >= 0 && i_14_ - (anInt8945 << 12) < 0) {
							int i_17_;
							if ((i_17_ = i_15_ - (anInt8950 << 12)) >= 0) {
								i_17_ = (anInt8962 - i_17_) / anInt8962;
								i_16_ += i_17_;
								i_15_ += anInt8962 * i_17_;
								i_13_ += i_17_;
							}
							if ((i_17_ = (i_15_ - anInt8962) / anInt8962) > i_16_)
								i_16_ = i_17_;
							for (/**/; i_16_ < 0; i_16_++) {
								method10510(((i_15_ >> 12) * anInt8945 + (i_14_ >> 12)), i_13_++, is, i, i_6_);
								i_15_ += anInt8962;
							}
						}
						i_12_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_18_ = anInt8957;
					while (i_18_ < 0) {
						int i_19_ = anInt8959;
						int i_20_ = anInt8966;
						int i_21_ = anInt8967 + anInt8969;
						int i_22_ = anInt8955;
						if (i_20_ >= 0 && i_20_ - (anInt8945 << 12) < 0) {
							if (i_21_ < 0) {
								int i_23_ = (anInt8962 - 1 - i_21_) / anInt8962;
								i_22_ += i_23_;
								i_21_ += anInt8962 * i_23_;
								i_19_ += i_23_;
							}
							int i_24_;
							if ((i_24_ = (1 + i_21_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_22_)
								i_22_ = i_24_;
							for (/**/; i_22_ < 0; i_22_++) {
								method10510(((i_21_ >> 12) * anInt8945 + (i_20_ >> 12)), i_19_++, is, i, i_6_);
								i_21_ += anInt8962;
							}
						}
						i_18_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_25_ = anInt8957;
					while (i_25_ < 0) {
						int i_26_ = anInt8959;
						int i_27_ = anInt8966 + anInt8968;
						int i_28_ = anInt8967;
						int i_29_ = anInt8955;
						if (i_28_ >= 0 && i_28_ - (anInt8950 << 12) < 0) {
							int i_30_;
							if ((i_30_ = i_27_ - (anInt8945 << 12)) >= 0) {
								i_30_ = (anInt8960 - i_30_) / anInt8960;
								i_29_ += i_30_;
								i_27_ += anInt8960 * i_30_;
								i_26_ += i_30_;
							}
							if ((i_30_ = (i_27_ - anInt8960) / anInt8960) > i_29_)
								i_29_ = i_30_;
							for (/**/; i_29_ < 0; i_29_++) {
								method10510(((i_28_ >> 12) * anInt8945 + (i_27_ >> 12)), i_26_++, is, i, i_6_);
								i_27_ += anInt8960;
							}
						}
						i_25_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_31_ = anInt8957;
					while (i_31_ < 0) {
						int i_32_ = anInt8959;
						int i_33_ = anInt8966 + anInt8968;
						int i_34_ = anInt8967 + anInt8969;
						int i_35_ = anInt8955;
						int i_36_;
						if ((i_36_ = i_33_ - (anInt8945 << 12)) >= 0) {
							i_36_ = (anInt8960 - i_36_) / anInt8960;
							i_35_ += i_36_;
							i_33_ += anInt8960 * i_36_;
							i_34_ += anInt8962 * i_36_;
							i_32_ += i_36_;
						}
						if ((i_36_ = (i_33_ - anInt8960) / anInt8960) > i_35_)
							i_35_ = i_36_;
						if ((i_36_ = i_34_ - (anInt8950 << 12)) >= 0) {
							i_36_ = (anInt8962 - i_36_) / anInt8962;
							i_35_ += i_36_;
							i_33_ += anInt8960 * i_36_;
							i_34_ += anInt8962 * i_36_;
							i_32_ += i_36_;
						}
						if ((i_36_ = (i_34_ - anInt8962) / anInt8962) > i_35_)
							i_35_ = i_36_;
						for (/**/; i_35_ < 0; i_35_++) {
							method10510((i_34_ >> 12) * anInt8945 + (i_33_ >> 12), i_32_++, is, i, i_6_);
							i_33_ += anInt8960;
							i_34_ += anInt8962;
						}
						i_31_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_37_ = anInt8957;
					while (i_37_ < 0) {
						int i_38_ = anInt8959;
						int i_39_ = anInt8966 + anInt8968;
						int i_40_ = anInt8967 + anInt8969;
						int i_41_ = anInt8955;
						int i_42_;
						if ((i_42_ = i_39_ - (anInt8945 << 12)) >= 0) {
							i_42_ = (anInt8960 - i_42_) / anInt8960;
							i_41_ += i_42_;
							i_39_ += anInt8960 * i_42_;
							i_40_ += anInt8962 * i_42_;
							i_38_ += i_42_;
						}
						if ((i_42_ = (i_39_ - anInt8960) / anInt8960) > i_41_)
							i_41_ = i_42_;
						if (i_40_ < 0) {
							i_42_ = (anInt8962 - 1 - i_40_) / anInt8962;
							i_41_ += i_42_;
							i_39_ += anInt8960 * i_42_;
							i_40_ += anInt8962 * i_42_;
							i_38_ += i_42_;
						}
						if ((i_42_ = (1 + i_40_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_41_)
							i_41_ = i_42_;
						for (/**/; i_41_ < 0; i_41_++) {
							method10510((i_40_ >> 12) * anInt8945 + (i_39_ >> 12), i_38_++, is, i, i_6_);
							i_39_ += anInt8960;
							i_40_ += anInt8962;
						}
						i_37_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_43_ = anInt8957;
				while (i_43_ < 0) {
					int i_44_ = anInt8959;
					int i_45_ = anInt8966 + anInt8968;
					int i_46_ = anInt8967;
					int i_47_ = anInt8955;
					if (i_46_ >= 0 && i_46_ - (anInt8950 << 12) < 0) {
						if (i_45_ < 0) {
							int i_48_ = (anInt8960 - 1 - i_45_) / anInt8960;
							i_47_ += i_48_;
							i_45_ += anInt8960 * i_48_;
							i_44_ += i_48_;
						}
						int i_49_;
						if ((i_49_ = (1 + i_45_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_47_)
							i_47_ = i_49_;
						for (/**/; i_47_ < 0; i_47_++) {
							method10510((i_46_ >> 12) * anInt8945 + (i_45_ >> 12), i_44_++, is, i, i_6_);
							i_45_ += anInt8960;
						}
					}
					i_43_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				for (int i_50_ = anInt8957; i_50_ < 0; i_50_++) {
					int i_51_ = anInt8959;
					int i_52_ = anInt8966 + anInt8968;
					int i_53_ = anInt8967 + anInt8969;
					int i_54_ = anInt8955;
					if (i_52_ < 0) {
						int i_55_ = (anInt8960 - 1 - i_52_) / anInt8960;
						i_54_ += i_55_;
						i_52_ += anInt8960 * i_55_;
						i_53_ += anInt8962 * i_55_;
						i_51_ += i_55_;
					}
					int i_56_;
					if ((i_56_ = ((1 + i_52_ - (anInt8945 << 12) - anInt8960) / anInt8960)) > i_54_)
						i_54_ = i_56_;
					if ((i_56_ = i_53_ - (anInt8950 << 12)) >= 0) {
						i_56_ = (anInt8962 - i_56_) / anInt8962;
						i_54_ += i_56_;
						i_52_ += anInt8960 * i_56_;
						i_53_ += anInt8962 * i_56_;
						i_51_ += i_56_;
					}
					if ((i_56_ = (i_53_ - anInt8962) / anInt8962) > i_54_)
						i_54_ = i_56_;
					for (/**/; i_54_ < 0; i_54_++) {
						method10510((i_53_ >> 12) * anInt8945 + (i_52_ >> 12), i_51_++, is, i, i_6_);
						i_52_ += anInt8960;
						i_53_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				for (int i_57_ = anInt8957; i_57_ < 0; i_57_++) {
					int i_58_ = anInt8959;
					int i_59_ = anInt8966 + anInt8968;
					int i_60_ = anInt8967 + anInt8969;
					int i_61_ = anInt8955;
					if (i_59_ < 0) {
						int i_62_ = (anInt8960 - 1 - i_59_) / anInt8960;
						i_61_ += i_62_;
						i_59_ += anInt8960 * i_62_;
						i_60_ += anInt8962 * i_62_;
						i_58_ += i_62_;
					}
					int i_63_;
					if ((i_63_ = ((1 + i_59_ - (anInt8945 << 12) - anInt8960) / anInt8960)) > i_61_)
						i_61_ = i_63_;
					if (i_60_ < 0) {
						i_63_ = (anInt8962 - 1 - i_60_) / anInt8962;
						i_61_ += i_63_;
						i_59_ += anInt8960 * i_63_;
						i_60_ += anInt8962 * i_63_;
						i_58_ += i_63_;
					}
					if ((i_63_ = ((1 + i_60_ - (anInt8950 << 12) - anInt8962) / anInt8962)) > i_61_)
						i_61_ = i_63_;
					for (/**/; i_61_ < 0; i_61_++) {
						method10510((i_60_ >> 12) * anInt8945 + (i_59_ >> 12), i_58_++, is, i, i_6_);
						i_59_ += anInt8960;
						i_60_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	Class143_Sub1_Sub1(Class167_Sub1 class167_sub1, int[] is, int i, int i_64_) {
		super(class167_sub1, i, i_64_);
		anIntArray11346 = is;
	}

	public void method1746(int i, int i_65_, int i_66_, int i_67_, int[] is, int[] is_68_, int i_69_, int i_70_) {
		method10511(i, i_65_, i_66_, i_67_, is, i_69_, i_70_);
	}

	public void method1750(int i, int i_71_, int i_72_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is == null)
			throw new IllegalStateException("");
		if (i_72_ == 0) {
			for (int i_73_ = 0; i_73_ < anInt8950; i_73_++) {
				int i_74_ = i_73_ * anInt8945;
				int i_75_ = ((i_71_ + i_73_) * (aClass167_Sub1_8946.anInt8997 * -570111553) + i);
				for (int i_76_ = 0; i_76_ < anInt8945; i_76_++)
					anIntArray11346[i_74_ + i_76_] = (anIntArray11346[i_74_ + i_76_] & 0xffffff | is[i_75_ + i_76_] << 8 & ~0xffffff);
			}
		} else if (i_72_ == 1) {
			for (int i_77_ = 0; i_77_ < anInt8950; i_77_++) {
				int i_78_ = i_77_ * anInt8945;
				int i_79_ = ((i_71_ + i_77_) * (aClass167_Sub1_8946.anInt8997 * -570111553) + i);
				for (int i_80_ = 0; i_80_ < anInt8945; i_80_++)
					anIntArray11346[i_78_ + i_80_] = (anIntArray11346[i_78_ + i_80_] & 0xffffff | is[i_79_ + i_80_] << 16 & ~0xffffff);
			}
		} else if (i_72_ == 2) {
			for (int i_81_ = 0; i_81_ < anInt8950; i_81_++) {
				int i_82_ = i_81_ * anInt8945;
				int i_83_ = ((i_71_ + i_81_) * (aClass167_Sub1_8946.anInt8997 * -570111553) + i);
				for (int i_84_ = 0; i_84_ < anInt8945; i_84_++)
					anIntArray11346[i_82_ + i_84_] = (anIntArray11346[i_82_ + i_84_] & 0xffffff | is[i_83_ + i_84_] << 24 & ~0xffffff);
			}
		} else if (i_72_ == 3) {
			for (int i_85_ = 0; i_85_ < anInt8950; i_85_++) {
				int i_86_ = i_85_ * anInt8945;
				int i_87_ = ((i_71_ + i_85_) * (aClass167_Sub1_8946.anInt8997 * -570111553) + i);
				for (int i_88_ = 0; i_88_ < anInt8945; i_88_++)
					anIntArray11346[i_86_ + i_88_] = (anIntArray11346[i_86_ + i_88_] & 0xffffff | (is[i_87_ + i_88_] != 0 ? -16777216 : 0));
			}
		}
	}

	public void method1761(int i, int i_89_, int i_90_, int i_91_, int[] is, int[] is_92_, int i_93_, int i_94_) {
		method10511(i, i_89_, i_90_, i_91_, is, i_93_, i_94_);
	}

	void method1749(int i, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		if (i_96_ > 0 && i_97_ > 0) {
			int[] is = aClass167_Sub1_8946.anIntArray8996;
			if (is != null) {
				int i_102_ = 0;
				int i_103_ = 0;
				int i_104_ = aClass167_Sub1_8946.anInt8997 * -570111553;
				int i_105_ = anInt8977 + anInt8945 + anInt8948;
				int i_106_ = anInt8947 + anInt8950 + anInt8952;
				int i_107_ = (i_105_ << 16) / i_96_;
				int i_108_ = (i_106_ << 16) / i_97_;
				if (anInt8977 > 0) {
					int i_109_ = ((anInt8977 << 16) + i_107_ - 1) / i_107_;
					i += i_109_;
					i_102_ += i_109_ * i_107_ - (anInt8977 << 16);
				}
				if (anInt8947 > 0) {
					int i_110_ = ((anInt8947 << 16) + i_108_ - 1) / i_108_;
					i_95_ += i_110_;
					i_103_ += i_110_ * i_108_ - (anInt8947 << 16);
				}
				if (anInt8945 < i_105_)
					i_96_ = ((anInt8945 << 16) - i_102_ + i_107_ - 1) / i_107_;
				if (anInt8950 < i_106_)
					i_97_ = ((anInt8950 << 16) - i_103_ + i_108_ - 1) / i_108_;
				int i_111_ = i + i_95_ * i_104_;
				int i_112_ = i_104_ - i_96_;
				if (i_95_ + i_97_ > aClass167_Sub1_8946.anInt9003 * -148513205)
					i_97_ -= (i_95_ + i_97_ - aClass167_Sub1_8946.anInt9003 * -148513205);
				if (i_95_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
					int i_113_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_95_;
					i_97_ -= i_113_;
					i_111_ += i_113_ * i_104_;
					i_103_ += i_108_ * i_113_;
				}
				if (i + i_96_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
					int i_114_ = (i + i_96_ - aClass167_Sub1_8946.anInt9001 * 2024498147);
					i_96_ -= i_114_;
					i_112_ += i_114_;
				}
				if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
					int i_115_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
					i_96_ -= i_115_;
					i_111_ += i_115_;
					i_102_ += i_107_ * i_115_;
					i_112_ += i_115_;
				}
				if (i_100_ == 0) {
					if (i_98_ == 1) {
						int i_116_ = i_102_;
						for (int i_117_ = -i_97_; i_117_ < 0; i_117_++) {
							int i_118_ = (i_103_ >> 16) * anInt8945;
							for (int i_119_ = -i_96_; i_119_ < 0; i_119_++) {
								is[i_111_++] = anIntArray11346[(i_102_ >> 16) + i_118_];
								i_102_ += i_107_;
							}
							i_103_ += i_108_;
							i_102_ = i_116_;
							i_111_ += i_112_;
						}
					} else if (i_98_ == 0) {
						int i_120_ = (i_99_ & 0xff0000) >> 16;
						int i_121_ = (i_99_ & 0xff00) >> 8;
						int i_122_ = i_99_ & 0xff;
						int i_123_ = i_102_;
						for (int i_124_ = -i_97_; i_124_ < 0; i_124_++) {
							int i_125_ = (i_103_ >> 16) * anInt8945;
							for (int i_126_ = -i_96_; i_126_ < 0; i_126_++) {
								int i_127_ = anIntArray11346[(i_102_ >> 16) + i_125_];
								int i_128_ = (i_127_ & 0xff0000) * i_120_ & ~0xffffff;
								int i_129_ = (i_127_ & 0xff00) * i_121_ & 0xff0000;
								int i_130_ = (i_127_ & 0xff) * i_122_ & 0xff00;
								is[i_111_++] = (i_128_ | i_129_ | i_130_) >>> 8;
								i_102_ += i_107_;
							}
							i_103_ += i_108_;
							i_102_ = i_123_;
							i_111_ += i_112_;
						}
					} else if (i_98_ == 3) {
						int i_131_ = i_102_;
						for (int i_132_ = -i_97_; i_132_ < 0; i_132_++) {
							int i_133_ = (i_103_ >> 16) * anInt8945;
							for (int i_134_ = -i_96_; i_134_ < 0; i_134_++) {
								int i_135_ = anIntArray11346[(i_102_ >> 16) + i_133_];
								int i_136_ = i_135_ + i_99_;
								int i_137_ = (i_135_ & 0xff00ff) + (i_99_ & 0xff00ff);
								int i_138_ = ((i_137_ & 0x1000100) + (i_136_ - i_137_ & 0x10000));
								is[i_111_++] = i_136_ - i_138_ | i_138_ - (i_138_ >>> 8);
								i_102_ += i_107_;
							}
							i_103_ += i_108_;
							i_102_ = i_131_;
							i_111_ += i_112_;
						}
					} else if (i_98_ == 2) {
						int i_139_ = i_99_ >>> 24;
						int i_140_ = 256 - i_139_;
						int i_141_ = (i_99_ & 0xff00ff) * i_140_ & ~0xff00ff;
						int i_142_ = (i_99_ & 0xff00) * i_140_ & 0xff0000;
						i_99_ = (i_141_ | i_142_) >>> 8;
						int i_143_ = i_102_;
						for (int i_144_ = -i_97_; i_144_ < 0; i_144_++) {
							int i_145_ = (i_103_ >> 16) * anInt8945;
							for (int i_146_ = -i_96_; i_146_ < 0; i_146_++) {
								int i_147_ = anIntArray11346[(i_102_ >> 16) + i_145_];
								i_141_ = (i_147_ & 0xff00ff) * i_139_ & ~0xff00ff;
								i_142_ = (i_147_ & 0xff00) * i_139_ & 0xff0000;
								is[i_111_++] = ((i_141_ | i_142_) >>> 8) + i_99_;
								i_102_ += i_107_;
							}
							i_103_ += i_108_;
							i_102_ = i_143_;
							i_111_ += i_112_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_100_ == 1) {
					if (i_98_ == 1) {
						int i_148_ = i_102_;
						for (int i_149_ = -i_97_; i_149_ < 0; i_149_++) {
							int i_150_ = (i_103_ >> 16) * anInt8945;
							for (int i_151_ = -i_96_; i_151_ < 0; i_151_++) {
								int i_152_ = anIntArray11346[(i_102_ >> 16) + i_150_];
								int i_153_ = i_152_ >>> 24;
								int i_154_ = 256 - i_153_;
								int i_155_ = is[i_111_];
								is[i_111_++] = (((((i_152_ & 0xff00ff) * i_153_ + (i_155_ & 0xff00ff) * i_154_) & ~0xff00ff) >> 8) + (((((i_152_ & ~0xff00ff) >>> 8) * i_153_) + (((i_155_ & ~0xff00ff) >>> 8) * i_154_)) & ~0xff00ff));
								i_102_ += i_107_;
							}
							i_103_ += i_108_;
							i_102_ = i_148_;
							i_111_ += i_112_;
						}
					} else if (i_98_ == 0) {
						int i_156_ = i_102_;
						if ((i_99_ & 0xffffff) == 16777215) {
							for (int i_157_ = -i_97_; i_157_ < 0; i_157_++) {
								int i_158_ = (i_103_ >> 16) * anInt8945;
								for (int i_159_ = -i_96_; i_159_ < 0; i_159_++) {
									int i_160_ = (anIntArray11346[(i_102_ >> 16) + i_158_]);
									int i_161_ = ((i_160_ >>> 24) * (i_99_ >>> 24) >> 8);
									int i_162_ = 256 - i_161_;
									int i_163_ = is[i_111_];
									is[i_111_++] = ((((i_160_ & 0xff00ff) * i_161_ + (i_163_ & 0xff00ff) * i_162_) & ~0xff00ff) + (((i_160_ & 0xff00) * i_161_ + (i_163_ & 0xff00) * i_162_) & 0xff0000)) >> 8;
									i_102_ += i_107_;
								}
								i_103_ += i_108_;
								i_102_ = i_156_;
								i_111_ += i_112_;
							}
						} else {
							int i_164_ = (i_99_ & 0xff0000) >> 16;
							int i_165_ = (i_99_ & 0xff00) >> 8;
							int i_166_ = i_99_ & 0xff;
							for (int i_167_ = -i_97_; i_167_ < 0; i_167_++) {
								int i_168_ = (i_103_ >> 16) * anInt8945;
								for (int i_169_ = -i_96_; i_169_ < 0; i_169_++) {
									int i_170_ = (anIntArray11346[(i_102_ >> 16) + i_168_]);
									int i_171_ = ((i_170_ >>> 24) * (i_99_ >>> 24) >> 8);
									int i_172_ = 256 - i_171_;
									if (i_171_ != 255) {
										int i_173_ = ((i_170_ & 0xff0000) * i_164_ & ~0xffffff);
										int i_174_ = ((i_170_ & 0xff00) * i_165_ & 0xff0000);
										int i_175_ = ((i_170_ & 0xff) * i_166_ & 0xff00);
										i_170_ = (i_173_ | i_174_ | i_175_) >>> 8;
										int i_176_ = is[i_111_];
										is[i_111_++] = ((((i_170_ & 0xff00ff) * i_171_ + ((i_176_ & 0xff00ff) * i_172_)) & ~0xff00ff) + (((i_170_ & 0xff00) * i_171_ + ((i_176_ & 0xff00) * i_172_)) & 0xff0000)) >> 8;
									} else {
										int i_177_ = ((i_170_ & 0xff0000) * i_164_ & ~0xffffff);
										int i_178_ = ((i_170_ & 0xff00) * i_165_ & 0xff0000);
										int i_179_ = ((i_170_ & 0xff) * i_166_ & 0xff00);
										is[i_111_++] = (i_177_ | i_178_ | i_179_) >>> 8;
									}
									i_102_ += i_107_;
								}
								i_103_ += i_108_;
								i_102_ = i_156_;
								i_111_ += i_112_;
							}
						}
					} else if (i_98_ == 3) {
						int i_180_ = i_102_;
						for (int i_181_ = -i_97_; i_181_ < 0; i_181_++) {
							int i_182_ = (i_103_ >> 16) * anInt8945;
							for (int i_183_ = -i_96_; i_183_ < 0; i_183_++) {
								int i_184_ = anIntArray11346[(i_102_ >> 16) + i_182_];
								int i_185_ = i_184_ + i_99_;
								int i_186_ = (i_184_ & 0xff00ff) + (i_99_ & 0xff00ff);
								int i_187_ = ((i_186_ & 0x1000100) + (i_185_ - i_186_ & 0x10000));
								i_187_ = i_185_ - i_187_ | i_187_ - (i_187_ >>> 8);
								int i_188_ = (i_187_ >>> 24) * (i_99_ >>> 24) >> 8;
								int i_189_ = 256 - i_188_;
								if (i_188_ != 255) {
									i_184_ = i_187_;
									i_187_ = is[i_111_];
									i_187_ = ((((i_184_ & 0xff00ff) * i_188_ + (i_187_ & 0xff00ff) * i_189_) & ~0xff00ff) + (((i_184_ & 0xff00) * i_188_ + (i_187_ & 0xff00) * i_189_) & 0xff0000)) >> 8;
								}
								is[i_111_++] = i_187_;
								i_102_ += i_107_;
							}
							i_103_ += i_108_;
							i_102_ = i_180_;
							i_111_ += i_112_;
						}
					} else if (i_98_ == 2) {
						int i_190_ = i_99_ >>> 24;
						int i_191_ = 256 - i_190_;
						int i_192_ = (i_99_ & 0xff00ff) * i_191_ & ~0xff00ff;
						int i_193_ = (i_99_ & 0xff00) * i_191_ & 0xff0000;
						i_99_ = (i_192_ | i_193_) >>> 8;
						int i_194_ = i_102_;
						for (int i_195_ = -i_97_; i_195_ < 0; i_195_++) {
							int i_196_ = (i_103_ >> 16) * anInt8945;
							for (int i_197_ = -i_96_; i_197_ < 0; i_197_++) {
								int i_198_ = anIntArray11346[(i_102_ >> 16) + i_196_];
								int i_199_ = i_198_ >>> 24;
								int i_200_ = 256 - i_199_;
								i_192_ = (i_198_ & 0xff00ff) * i_190_ & ~0xff00ff;
								i_193_ = (i_198_ & 0xff00) * i_190_ & 0xff0000;
								i_198_ = ((i_192_ | i_193_) >>> 8) + i_99_;
								int i_201_ = is[i_111_];
								is[i_111_++] = ((((i_198_ & 0xff00ff) * i_199_ + (i_201_ & 0xff00ff) * i_200_) & ~0xff00ff) + (((i_198_ & 0xff00) * i_199_ + (i_201_ & 0xff00) * i_200_) & 0xff0000)) >> 8;
								i_102_ += i_107_;
							}
							i_103_ += i_108_;
							i_102_ = i_194_;
							i_111_ += i_112_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_100_ == 2) {
					if (i_98_ == 1) {
						int i_202_ = i_102_;
						for (int i_203_ = -i_97_; i_203_ < 0; i_203_++) {
							int i_204_ = (i_103_ >> 16) * anInt8945;
							for (int i_205_ = -i_96_; i_205_ < 0; i_205_++) {
								int i_206_ = anIntArray11346[(i_102_ >> 16) + i_204_];
								if (i_206_ != 0) {
									int i_207_ = is[i_111_];
									int i_208_ = i_206_ + i_207_;
									int i_209_ = ((i_206_ & 0xff00ff) + (i_207_ & 0xff00ff));
									i_207_ = ((i_209_ & 0x1000100) + (i_208_ - i_209_ & 0x10000));
									is[i_111_++] = i_208_ - i_207_ | i_207_ - (i_207_ >>> 8);
								} else
									i_111_++;
								i_102_ += i_107_;
							}
							i_103_ += i_108_;
							i_102_ = i_202_;
							i_111_ += i_112_;
						}
					} else if (i_98_ == 0) {
						int i_210_ = i_102_;
						int i_211_ = (i_99_ & 0xff0000) >> 16;
						int i_212_ = (i_99_ & 0xff00) >> 8;
						int i_213_ = i_99_ & 0xff;
						for (int i_214_ = -i_97_; i_214_ < 0; i_214_++) {
							int i_215_ = (i_103_ >> 16) * anInt8945;
							for (int i_216_ = -i_96_; i_216_ < 0; i_216_++) {
								int i_217_ = anIntArray11346[(i_102_ >> 16) + i_215_];
								if (i_217_ != 0) {
									int i_218_ = ((i_217_ & 0xff0000) * i_211_ & ~0xffffff);
									int i_219_ = ((i_217_ & 0xff00) * i_212_ & 0xff0000);
									int i_220_ = (i_217_ & 0xff) * i_213_ & 0xff00;
									i_217_ = (i_218_ | i_219_ | i_220_) >>> 8;
									int i_221_ = is[i_111_];
									int i_222_ = i_217_ + i_221_;
									int i_223_ = ((i_217_ & 0xff00ff) + (i_221_ & 0xff00ff));
									i_221_ = ((i_223_ & 0x1000100) + (i_222_ - i_223_ & 0x10000));
									is[i_111_++] = i_222_ - i_221_ | i_221_ - (i_221_ >>> 8);
								} else
									i_111_++;
								i_102_ += i_107_;
							}
							i_103_ += i_108_;
							i_102_ = i_210_;
							i_111_ += i_112_;
						}
					} else if (i_98_ == 3) {
						int i_224_ = i_102_;
						for (int i_225_ = -i_97_; i_225_ < 0; i_225_++) {
							int i_226_ = (i_103_ >> 16) * anInt8945;
							for (int i_227_ = -i_96_; i_227_ < 0; i_227_++) {
								int i_228_ = anIntArray11346[(i_102_ >> 16) + i_226_];
								int i_229_ = i_228_ + i_99_;
								int i_230_ = (i_228_ & 0xff00ff) + (i_99_ & 0xff00ff);
								int i_231_ = ((i_230_ & 0x1000100) + (i_229_ - i_230_ & 0x10000));
								i_228_ = i_229_ - i_231_ | i_231_ - (i_231_ >>> 8);
								i_231_ = is[i_111_];
								i_229_ = i_228_ + i_231_;
								i_230_ = (i_228_ & 0xff00ff) + (i_231_ & 0xff00ff);
								i_231_ = (i_230_ & 0x1000100) + (i_229_ - i_230_ & 0x10000);
								is[i_111_++] = i_229_ - i_231_ | i_231_ - (i_231_ >>> 8);
								i_102_ += i_107_;
							}
							i_103_ += i_108_;
							i_102_ = i_224_;
							i_111_ += i_112_;
						}
					} else if (i_98_ == 2) {
						int i_232_ = i_99_ >>> 24;
						int i_233_ = 256 - i_232_;
						int i_234_ = (i_99_ & 0xff00ff) * i_233_ & ~0xff00ff;
						int i_235_ = (i_99_ & 0xff00) * i_233_ & 0xff0000;
						i_99_ = (i_234_ | i_235_) >>> 8;
						int i_236_ = i_102_;
						for (int i_237_ = -i_97_; i_237_ < 0; i_237_++) {
							int i_238_ = (i_103_ >> 16) * anInt8945;
							for (int i_239_ = -i_96_; i_239_ < 0; i_239_++) {
								int i_240_ = anIntArray11346[(i_102_ >> 16) + i_238_];
								if (i_240_ != 0) {
									i_234_ = ((i_240_ & 0xff00ff) * i_232_ & ~0xff00ff);
									i_235_ = ((i_240_ & 0xff00) * i_232_ & 0xff0000);
									i_240_ = ((i_234_ | i_235_) >>> 8) + i_99_;
									int i_241_ = is[i_111_];
									int i_242_ = i_240_ + i_241_;
									int i_243_ = ((i_240_ & 0xff00ff) + (i_241_ & 0xff00ff));
									i_241_ = ((i_243_ & 0x1000100) + (i_242_ - i_243_ & 0x10000));
									is[i_111_++] = i_242_ - i_241_ | i_241_ - (i_241_ >>> 8);
								} else
									i_111_++;
								i_102_ += i_107_;
							}
							i_103_ += i_108_;
							i_102_ = i_236_;
							i_111_ += i_112_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public Interface22 method1722() {
		return new Class104(anInt8945, anInt8950, anIntArray11346);
	}

	public Interface22 method1782() {
		return new Class104(anInt8945, anInt8950, anIntArray11346);
	}

	void method8436(int[] is, int[] is_244_, int i, int i_245_) {
		int[] is_246_ = aClass167_Sub1_8946.anIntArray8996;
		if (is_246_ != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_247_ = anInt8957;
					while (i_247_ < 0) {
						int i_248_ = i_247_ + i_245_;
						if (i_248_ >= 0) {
							if (i_248_ >= is.length)
								break;
							int i_249_ = anInt8959;
							int i_250_ = anInt8966;
							int i_251_ = anInt8967;
							int i_252_ = anInt8955;
							if (i_250_ >= 0 && i_251_ >= 0 && i_250_ - (anInt8945 << 12) < 0 && i_251_ - (anInt8950 << 12) < 0) {
								int i_253_ = is[i_248_] - i;
								int i_254_ = -is_244_[i_248_];
								int i_255_ = i_253_ - (i_249_ - anInt8959);
								if (i_255_ > 0) {
									i_249_ += i_255_;
									i_252_ += i_255_;
									i_250_ += anInt8960 * i_255_;
									i_251_ += anInt8962 * i_255_;
								} else
									i_254_ -= i_255_;
								if (i_252_ < i_254_)
									i_252_ = i_254_;
								for (/**/; i_252_ < 0; i_252_++) {
									int i_256_ = (anIntArray11346[((i_251_ >> 12) * anInt8945 + (i_250_ >> 12))]);
									int i_257_ = i_256_ >>> 24;
									int i_258_ = 256 - i_257_;
									int i_259_ = is_246_[i_249_];
									is_246_[i_249_++] = ((((i_256_ & 0xff00ff) * i_257_ + (i_259_ & 0xff00ff) * i_258_) & ~0xff00ff) + (((i_256_ & 0xff00) * i_257_ + (i_259_ & 0xff00) * i_258_) & 0xff0000)) >> 8;
								}
							}
						}
						i_247_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_260_ = anInt8957;
					while (i_260_ < 0) {
						int i_261_ = i_260_ + i_245_;
						if (i_261_ >= 0) {
							if (i_261_ >= is.length)
								break;
							int i_262_ = anInt8959;
							int i_263_ = anInt8966;
							int i_264_ = anInt8967 + anInt8969;
							int i_265_ = anInt8955;
							if (i_263_ >= 0 && i_263_ - (anInt8945 << 12) < 0) {
								int i_266_;
								if ((i_266_ = i_264_ - (anInt8950 << 12)) >= 0) {
									i_266_ = (anInt8962 - i_266_) / anInt8962;
									i_265_ += i_266_;
									i_264_ += anInt8962 * i_266_;
									i_262_ += i_266_;
								}
								if ((i_266_ = (i_264_ - anInt8962) / anInt8962) > i_265_)
									i_265_ = i_266_;
								int i_267_ = is[i_261_] - i;
								int i_268_ = -is_244_[i_261_];
								int i_269_ = i_267_ - (i_262_ - anInt8959);
								if (i_269_ > 0) {
									i_262_ += i_269_;
									i_265_ += i_269_;
									i_263_ += anInt8960 * i_269_;
									i_264_ += anInt8962 * i_269_;
								} else
									i_268_ -= i_269_;
								if (i_265_ < i_268_)
									i_265_ = i_268_;
								for (/**/; i_265_ < 0; i_265_++) {
									int i_270_ = (anIntArray11346[((i_264_ >> 12) * anInt8945 + (i_263_ >> 12))]);
									int i_271_ = i_270_ >>> 24;
									int i_272_ = 256 - i_271_;
									int i_273_ = is_246_[i_262_];
									is_246_[i_262_++] = ((((i_270_ & 0xff00ff) * i_271_ + (i_273_ & 0xff00ff) * i_272_) & ~0xff00ff) + (((i_270_ & 0xff00) * i_271_ + (i_273_ & 0xff00) * i_272_) & 0xff0000)) >> 8;
									i_264_ += anInt8962;
								}
							}
						}
						i_260_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_274_ = anInt8957;
					while (i_274_ < 0) {
						int i_275_ = i_274_ + i_245_;
						if (i_275_ >= 0) {
							if (i_275_ >= is.length)
								break;
							int i_276_ = anInt8959;
							int i_277_ = anInt8966;
							int i_278_ = anInt8967 + anInt8969;
							int i_279_ = anInt8955;
							if (i_277_ >= 0 && i_277_ - (anInt8945 << 12) < 0) {
								if (i_278_ < 0) {
									int i_280_ = (anInt8962 - 1 - i_278_) / anInt8962;
									i_279_ += i_280_;
									i_278_ += anInt8962 * i_280_;
									i_276_ += i_280_;
								}
								int i_281_;
								if ((i_281_ = (1 + i_278_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_279_)
									i_279_ = i_281_;
								int i_282_ = is[i_275_] - i;
								int i_283_ = -is_244_[i_275_];
								int i_284_ = i_282_ - (i_276_ - anInt8959);
								if (i_284_ > 0) {
									i_276_ += i_284_;
									i_279_ += i_284_;
									i_277_ += anInt8960 * i_284_;
									i_278_ += anInt8962 * i_284_;
								} else
									i_283_ -= i_284_;
								if (i_279_ < i_283_)
									i_279_ = i_283_;
								for (/**/; i_279_ < 0; i_279_++) {
									int i_285_ = (anIntArray11346[((i_278_ >> 12) * anInt8945 + (i_277_ >> 12))]);
									int i_286_ = i_285_ >>> 24;
									int i_287_ = 256 - i_286_;
									int i_288_ = is_246_[i_276_];
									is_246_[i_276_++] = ((((i_285_ & 0xff00ff) * i_286_ + (i_288_ & 0xff00ff) * i_287_) & ~0xff00ff) + (((i_285_ & 0xff00) * i_286_ + (i_288_ & 0xff00) * i_287_) & 0xff0000)) >> 8;
									i_278_ += anInt8962;
								}
							}
						}
						i_274_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_289_ = anInt8957;
					while (i_289_ < 0) {
						int i_290_ = i_289_ + i_245_;
						if (i_290_ >= 0) {
							if (i_290_ >= is.length)
								break;
							int i_291_ = anInt8959;
							int i_292_ = anInt8966 + anInt8968;
							int i_293_ = anInt8967;
							int i_294_ = anInt8955;
							if (i_293_ >= 0 && i_293_ - (anInt8950 << 12) < 0) {
								int i_295_;
								if ((i_295_ = i_292_ - (anInt8945 << 12)) >= 0) {
									i_295_ = (anInt8960 - i_295_) / anInt8960;
									i_294_ += i_295_;
									i_292_ += anInt8960 * i_295_;
									i_291_ += i_295_;
								}
								if ((i_295_ = (i_292_ - anInt8960) / anInt8960) > i_294_)
									i_294_ = i_295_;
								int i_296_ = is[i_290_] - i;
								int i_297_ = -is_244_[i_290_];
								int i_298_ = i_296_ - (i_291_ - anInt8959);
								if (i_298_ > 0) {
									i_291_ += i_298_;
									i_294_ += i_298_;
									i_292_ += anInt8960 * i_298_;
									i_293_ += anInt8962 * i_298_;
								} else
									i_297_ -= i_298_;
								if (i_294_ < i_297_)
									i_294_ = i_297_;
								for (/**/; i_294_ < 0; i_294_++) {
									int i_299_ = (anIntArray11346[((i_293_ >> 12) * anInt8945 + (i_292_ >> 12))]);
									int i_300_ = i_299_ >>> 24;
									int i_301_ = 256 - i_300_;
									int i_302_ = is_246_[i_291_];
									is_246_[i_291_++] = ((((i_299_ & 0xff00ff) * i_300_ + (i_302_ & 0xff00ff) * i_301_) & ~0xff00ff) + (((i_299_ & 0xff00) * i_300_ + (i_302_ & 0xff00) * i_301_) & 0xff0000)) >> 8;
									i_292_ += anInt8960;
								}
							}
						}
						i_289_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_303_ = anInt8957;
					while (i_303_ < 0) {
						int i_304_ = i_303_ + i_245_;
						if (i_304_ >= 0) {
							if (i_304_ >= is.length)
								break;
							int i_305_ = anInt8959;
							int i_306_ = anInt8966 + anInt8968;
							int i_307_ = anInt8967 + anInt8969;
							int i_308_ = anInt8955;
							int i_309_;
							if ((i_309_ = i_306_ - (anInt8945 << 12)) >= 0) {
								i_309_ = (anInt8960 - i_309_) / anInt8960;
								i_308_ += i_309_;
								i_306_ += anInt8960 * i_309_;
								i_307_ += anInt8962 * i_309_;
								i_305_ += i_309_;
							}
							if ((i_309_ = (i_306_ - anInt8960) / anInt8960) > i_308_)
								i_308_ = i_309_;
							if ((i_309_ = i_307_ - (anInt8950 << 12)) >= 0) {
								i_309_ = (anInt8962 - i_309_) / anInt8962;
								i_308_ += i_309_;
								i_306_ += anInt8960 * i_309_;
								i_307_ += anInt8962 * i_309_;
								i_305_ += i_309_;
							}
							if ((i_309_ = (i_307_ - anInt8962) / anInt8962) > i_308_)
								i_308_ = i_309_;
							int i_310_ = is[i_304_] - i;
							int i_311_ = -is_244_[i_304_];
							int i_312_ = i_310_ - (i_305_ - anInt8959);
							if (i_312_ > 0) {
								i_305_ += i_312_;
								i_308_ += i_312_;
								i_306_ += anInt8960 * i_312_;
								i_307_ += anInt8962 * i_312_;
							} else
								i_311_ -= i_312_;
							if (i_308_ < i_311_)
								i_308_ = i_311_;
							for (/**/; i_308_ < 0; i_308_++) {
								int i_313_ = (anIntArray11346[(i_307_ >> 12) * anInt8945 + (i_306_ >> 12)]);
								int i_314_ = i_313_ >>> 24;
								int i_315_ = 256 - i_314_;
								int i_316_ = is_246_[i_305_];
								is_246_[i_305_++] = ((((i_313_ & 0xff00ff) * i_314_ + (i_316_ & 0xff00ff) * i_315_) & ~0xff00ff) + (((i_313_ & 0xff00) * i_314_ + (i_316_ & 0xff00) * i_315_) & 0xff0000)) >> 8;
								i_306_ += anInt8960;
								i_307_ += anInt8962;
							}
						}
						i_303_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_317_ = anInt8957;
					while (i_317_ < 0) {
						int i_318_ = i_317_ + i_245_;
						if (i_318_ >= 0) {
							if (i_318_ >= is.length)
								break;
							int i_319_ = anInt8959;
							int i_320_ = anInt8966 + anInt8968;
							int i_321_ = anInt8967 + anInt8969;
							int i_322_ = anInt8955;
							int i_323_;
							if ((i_323_ = i_320_ - (anInt8945 << 12)) >= 0) {
								i_323_ = (anInt8960 - i_323_) / anInt8960;
								i_322_ += i_323_;
								i_320_ += anInt8960 * i_323_;
								i_321_ += anInt8962 * i_323_;
								i_319_ += i_323_;
							}
							if ((i_323_ = (i_320_ - anInt8960) / anInt8960) > i_322_)
								i_322_ = i_323_;
							if (i_321_ < 0) {
								i_323_ = (anInt8962 - 1 - i_321_) / anInt8962;
								i_322_ += i_323_;
								i_320_ += anInt8960 * i_323_;
								i_321_ += anInt8962 * i_323_;
								i_319_ += i_323_;
							}
							if ((i_323_ = (1 + i_321_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_322_)
								i_322_ = i_323_;
							int i_324_ = is[i_318_] - i;
							int i_325_ = -is_244_[i_318_];
							int i_326_ = i_324_ - (i_319_ - anInt8959);
							if (i_326_ > 0) {
								i_319_ += i_326_;
								i_322_ += i_326_;
								i_320_ += anInt8960 * i_326_;
								i_321_ += anInt8962 * i_326_;
							} else
								i_325_ -= i_326_;
							if (i_322_ < i_325_)
								i_322_ = i_325_;
							for (/**/; i_322_ < 0; i_322_++) {
								int i_327_ = (anIntArray11346[(i_321_ >> 12) * anInt8945 + (i_320_ >> 12)]);
								int i_328_ = i_327_ >>> 24;
								int i_329_ = 256 - i_328_;
								int i_330_ = is_246_[i_319_];
								is_246_[i_319_++] = ((((i_327_ & 0xff00ff) * i_328_ + (i_330_ & 0xff00ff) * i_329_) & ~0xff00ff) + (((i_327_ & 0xff00) * i_328_ + (i_330_ & 0xff00) * i_329_) & 0xff0000)) >> 8;
								i_320_ += anInt8960;
								i_321_ += anInt8962;
							}
						}
						i_317_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_331_ = anInt8957;
				while (i_331_ < 0) {
					int i_332_ = i_331_ + i_245_;
					if (i_332_ >= 0) {
						if (i_332_ >= is.length)
							break;
						int i_333_ = anInt8959;
						int i_334_ = anInt8966 + anInt8968;
						int i_335_ = anInt8967;
						int i_336_ = anInt8955;
						if (i_335_ >= 0 && i_335_ - (anInt8950 << 12) < 0) {
							if (i_334_ < 0) {
								int i_337_ = (anInt8960 - 1 - i_334_) / anInt8960;
								i_336_ += i_337_;
								i_334_ += anInt8960 * i_337_;
								i_333_ += i_337_;
							}
							int i_338_;
							if ((i_338_ = (1 + i_334_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_336_)
								i_336_ = i_338_;
							int i_339_ = is[i_332_] - i;
							int i_340_ = -is_244_[i_332_];
							int i_341_ = i_339_ - (i_333_ - anInt8959);
							if (i_341_ > 0) {
								i_333_ += i_341_;
								i_336_ += i_341_;
								i_334_ += anInt8960 * i_341_;
								i_335_ += anInt8962 * i_341_;
							} else
								i_340_ -= i_341_;
							if (i_336_ < i_340_)
								i_336_ = i_340_;
							for (/**/; i_336_ < 0; i_336_++) {
								int i_342_ = (anIntArray11346[(i_335_ >> 12) * anInt8945 + (i_334_ >> 12)]);
								int i_343_ = i_342_ >>> 24;
								int i_344_ = 256 - i_343_;
								int i_345_ = is_246_[i_333_];
								is_246_[i_333_++] = ((((i_342_ & 0xff00ff) * i_343_ + (i_345_ & 0xff00ff) * i_344_) & ~0xff00ff) + (((i_342_ & 0xff00) * i_343_ + (i_345_ & 0xff00) * i_344_) & 0xff0000)) >> 8;
								i_334_ += anInt8960;
							}
						}
					}
					i_331_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				int i_346_ = anInt8957;
				while (i_346_ < 0) {
					int i_347_ = i_346_ + i_245_;
					if (i_347_ >= 0) {
						if (i_347_ >= is.length)
							break;
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
						if ((i_353_ = (1 + i_349_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_351_)
							i_351_ = i_353_;
						if ((i_353_ = i_350_ - (anInt8950 << 12)) >= 0) {
							i_353_ = (anInt8962 - i_353_) / anInt8962;
							i_351_ += i_353_;
							i_349_ += anInt8960 * i_353_;
							i_350_ += anInt8962 * i_353_;
							i_348_ += i_353_;
						}
						if ((i_353_ = (i_350_ - anInt8962) / anInt8962) > i_351_)
							i_351_ = i_353_;
						int i_354_ = is[i_347_] - i;
						int i_355_ = -is_244_[i_347_];
						int i_356_ = i_354_ - (i_348_ - anInt8959);
						if (i_356_ > 0) {
							i_348_ += i_356_;
							i_351_ += i_356_;
							i_349_ += anInt8960 * i_356_;
							i_350_ += anInt8962 * i_356_;
						} else
							i_355_ -= i_356_;
						if (i_351_ < i_355_)
							i_351_ = i_355_;
						for (/**/; i_351_ < 0; i_351_++) {
							int i_357_ = (anIntArray11346[(i_350_ >> 12) * anInt8945 + (i_349_ >> 12)]);
							int i_358_ = i_357_ >>> 24;
							int i_359_ = 256 - i_358_;
							int i_360_ = is_246_[i_348_];
							is_246_[i_348_++] = ((((i_357_ & 0xff00ff) * i_358_ + (i_360_ & 0xff00ff) * i_359_) & ~0xff00ff) + (((i_357_ & 0xff00) * i_358_ + (i_360_ & 0xff00) * i_359_) & 0xff0000)) >> 8;
							i_349_ += anInt8960;
							i_350_ += anInt8962;
						}
					}
					i_346_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				int i_361_ = anInt8957;
				while (i_361_ < 0) {
					int i_362_ = i_361_ + i_245_;
					if (i_362_ >= 0) {
						if (i_362_ >= is.length)
							break;
						int i_363_ = anInt8959;
						int i_364_ = anInt8966 + anInt8968;
						int i_365_ = anInt8967 + anInt8969;
						int i_366_ = anInt8955;
						if (i_364_ < 0) {
							int i_367_ = (anInt8960 - 1 - i_364_) / anInt8960;
							i_366_ += i_367_;
							i_364_ += anInt8960 * i_367_;
							i_365_ += anInt8962 * i_367_;
							i_363_ += i_367_;
						}
						int i_368_;
						if ((i_368_ = (1 + i_364_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_366_)
							i_366_ = i_368_;
						if (i_365_ < 0) {
							i_368_ = (anInt8962 - 1 - i_365_) / anInt8962;
							i_366_ += i_368_;
							i_364_ += anInt8960 * i_368_;
							i_365_ += anInt8962 * i_368_;
							i_363_ += i_368_;
						}
						if ((i_368_ = (1 + i_365_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_366_)
							i_366_ = i_368_;
						int i_369_ = is[i_362_] - i;
						int i_370_ = -is_244_[i_362_];
						int i_371_ = i_369_ - (i_363_ - anInt8959);
						if (i_371_ > 0) {
							i_363_ += i_371_;
							i_366_ += i_371_;
							i_364_ += anInt8960 * i_371_;
							i_365_ += anInt8962 * i_371_;
						} else
							i_370_ -= i_371_;
						if (i_366_ < i_370_)
							i_366_ = i_370_;
						for (/**/; i_366_ < 0; i_366_++) {
							int i_372_ = (anIntArray11346[(i_365_ >> 12) * anInt8945 + (i_364_ >> 12)]);
							int i_373_ = i_372_ >>> 24;
							int i_374_ = 256 - i_373_;
							int i_375_ = is_246_[i_363_];
							is_246_[i_363_++] = ((((i_372_ & 0xff00ff) * i_373_ + (i_375_ & 0xff00ff) * i_374_) & ~0xff00ff) + (((i_372_ & 0xff00) * i_373_ + (i_375_ & 0xff00) * i_374_) & 0xff0000)) >> 8;
							i_364_ += anInt8960;
							i_365_ += anInt8962;
						}
					}
					i_361_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	void method8439(int i, int i_376_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_377_ = anInt8957;
					while (i_377_ < 0) {
						int i_378_ = anInt8959;
						int i_379_ = anInt8966;
						int i_380_ = anInt8967;
						int i_381_ = anInt8955;
						if (i_379_ >= 0 && i_380_ >= 0 && i_379_ - (anInt8945 << 12) < 0 && i_380_ - (anInt8950 << 12) < 0) {
							for (/**/; i_381_ < 0; i_381_++)
								method10510(((i_380_ >> 12) * anInt8945 + (i_379_ >> 12)), i_378_++, is, i, i_376_);
						}
						i_377_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_382_ = anInt8957;
					while (i_382_ < 0) {
						int i_383_ = anInt8959;
						int i_384_ = anInt8966;
						int i_385_ = anInt8967 + anInt8969;
						int i_386_ = anInt8955;
						if (i_384_ >= 0 && i_384_ - (anInt8945 << 12) < 0) {
							int i_387_;
							if ((i_387_ = i_385_ - (anInt8950 << 12)) >= 0) {
								i_387_ = (anInt8962 - i_387_) / anInt8962;
								i_386_ += i_387_;
								i_385_ += anInt8962 * i_387_;
								i_383_ += i_387_;
							}
							if ((i_387_ = (i_385_ - anInt8962) / anInt8962) > i_386_)
								i_386_ = i_387_;
							for (/**/; i_386_ < 0; i_386_++) {
								method10510(((i_385_ >> 12) * anInt8945 + (i_384_ >> 12)), i_383_++, is, i, i_376_);
								i_385_ += anInt8962;
							}
						}
						i_382_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_388_ = anInt8957;
					while (i_388_ < 0) {
						int i_389_ = anInt8959;
						int i_390_ = anInt8966;
						int i_391_ = anInt8967 + anInt8969;
						int i_392_ = anInt8955;
						if (i_390_ >= 0 && i_390_ - (anInt8945 << 12) < 0) {
							if (i_391_ < 0) {
								int i_393_ = (anInt8962 - 1 - i_391_) / anInt8962;
								i_392_ += i_393_;
								i_391_ += anInt8962 * i_393_;
								i_389_ += i_393_;
							}
							int i_394_;
							if ((i_394_ = (1 + i_391_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_392_)
								i_392_ = i_394_;
							for (/**/; i_392_ < 0; i_392_++) {
								method10510(((i_391_ >> 12) * anInt8945 + (i_390_ >> 12)), i_389_++, is, i, i_376_);
								i_391_ += anInt8962;
							}
						}
						i_388_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_395_ = anInt8957;
					while (i_395_ < 0) {
						int i_396_ = anInt8959;
						int i_397_ = anInt8966 + anInt8968;
						int i_398_ = anInt8967;
						int i_399_ = anInt8955;
						if (i_398_ >= 0 && i_398_ - (anInt8950 << 12) < 0) {
							int i_400_;
							if ((i_400_ = i_397_ - (anInt8945 << 12)) >= 0) {
								i_400_ = (anInt8960 - i_400_) / anInt8960;
								i_399_ += i_400_;
								i_397_ += anInt8960 * i_400_;
								i_396_ += i_400_;
							}
							if ((i_400_ = (i_397_ - anInt8960) / anInt8960) > i_399_)
								i_399_ = i_400_;
							for (/**/; i_399_ < 0; i_399_++) {
								method10510(((i_398_ >> 12) * anInt8945 + (i_397_ >> 12)), i_396_++, is, i, i_376_);
								i_397_ += anInt8960;
							}
						}
						i_395_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_401_ = anInt8957;
					while (i_401_ < 0) {
						int i_402_ = anInt8959;
						int i_403_ = anInt8966 + anInt8968;
						int i_404_ = anInt8967 + anInt8969;
						int i_405_ = anInt8955;
						int i_406_;
						if ((i_406_ = i_403_ - (anInt8945 << 12)) >= 0) {
							i_406_ = (anInt8960 - i_406_) / anInt8960;
							i_405_ += i_406_;
							i_403_ += anInt8960 * i_406_;
							i_404_ += anInt8962 * i_406_;
							i_402_ += i_406_;
						}
						if ((i_406_ = (i_403_ - anInt8960) / anInt8960) > i_405_)
							i_405_ = i_406_;
						if ((i_406_ = i_404_ - (anInt8950 << 12)) >= 0) {
							i_406_ = (anInt8962 - i_406_) / anInt8962;
							i_405_ += i_406_;
							i_403_ += anInt8960 * i_406_;
							i_404_ += anInt8962 * i_406_;
							i_402_ += i_406_;
						}
						if ((i_406_ = (i_404_ - anInt8962) / anInt8962) > i_405_)
							i_405_ = i_406_;
						for (/**/; i_405_ < 0; i_405_++) {
							method10510((i_404_ >> 12) * anInt8945 + (i_403_ >> 12), i_402_++, is, i, i_376_);
							i_403_ += anInt8960;
							i_404_ += anInt8962;
						}
						i_401_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_407_ = anInt8957;
					while (i_407_ < 0) {
						int i_408_ = anInt8959;
						int i_409_ = anInt8966 + anInt8968;
						int i_410_ = anInt8967 + anInt8969;
						int i_411_ = anInt8955;
						int i_412_;
						if ((i_412_ = i_409_ - (anInt8945 << 12)) >= 0) {
							i_412_ = (anInt8960 - i_412_) / anInt8960;
							i_411_ += i_412_;
							i_409_ += anInt8960 * i_412_;
							i_410_ += anInt8962 * i_412_;
							i_408_ += i_412_;
						}
						if ((i_412_ = (i_409_ - anInt8960) / anInt8960) > i_411_)
							i_411_ = i_412_;
						if (i_410_ < 0) {
							i_412_ = (anInt8962 - 1 - i_410_) / anInt8962;
							i_411_ += i_412_;
							i_409_ += anInt8960 * i_412_;
							i_410_ += anInt8962 * i_412_;
							i_408_ += i_412_;
						}
						if ((i_412_ = (1 + i_410_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_411_)
							i_411_ = i_412_;
						for (/**/; i_411_ < 0; i_411_++) {
							method10510((i_410_ >> 12) * anInt8945 + (i_409_ >> 12), i_408_++, is, i, i_376_);
							i_409_ += anInt8960;
							i_410_ += anInt8962;
						}
						i_407_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_413_ = anInt8957;
				while (i_413_ < 0) {
					int i_414_ = anInt8959;
					int i_415_ = anInt8966 + anInt8968;
					int i_416_ = anInt8967;
					int i_417_ = anInt8955;
					if (i_416_ >= 0 && i_416_ - (anInt8950 << 12) < 0) {
						if (i_415_ < 0) {
							int i_418_ = (anInt8960 - 1 - i_415_) / anInt8960;
							i_417_ += i_418_;
							i_415_ += anInt8960 * i_418_;
							i_414_ += i_418_;
						}
						int i_419_;
						if ((i_419_ = (1 + i_415_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_417_)
							i_417_ = i_419_;
						for (/**/; i_417_ < 0; i_417_++) {
							method10510((i_416_ >> 12) * anInt8945 + (i_415_ >> 12), i_414_++, is, i, i_376_);
							i_415_ += anInt8960;
						}
					}
					i_413_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				for (int i_420_ = anInt8957; i_420_ < 0; i_420_++) {
					int i_421_ = anInt8959;
					int i_422_ = anInt8966 + anInt8968;
					int i_423_ = anInt8967 + anInt8969;
					int i_424_ = anInt8955;
					if (i_422_ < 0) {
						int i_425_ = (anInt8960 - 1 - i_422_) / anInt8960;
						i_424_ += i_425_;
						i_422_ += anInt8960 * i_425_;
						i_423_ += anInt8962 * i_425_;
						i_421_ += i_425_;
					}
					int i_426_;
					if ((i_426_ = ((1 + i_422_ - (anInt8945 << 12) - anInt8960) / anInt8960)) > i_424_)
						i_424_ = i_426_;
					if ((i_426_ = i_423_ - (anInt8950 << 12)) >= 0) {
						i_426_ = (anInt8962 - i_426_) / anInt8962;
						i_424_ += i_426_;
						i_422_ += anInt8960 * i_426_;
						i_423_ += anInt8962 * i_426_;
						i_421_ += i_426_;
					}
					if ((i_426_ = (i_423_ - anInt8962) / anInt8962) > i_424_)
						i_424_ = i_426_;
					for (/**/; i_424_ < 0; i_424_++) {
						method10510((i_423_ >> 12) * anInt8945 + (i_422_ >> 12), i_421_++, is, i, i_376_);
						i_422_ += anInt8960;
						i_423_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				for (int i_427_ = anInt8957; i_427_ < 0; i_427_++) {
					int i_428_ = anInt8959;
					int i_429_ = anInt8966 + anInt8968;
					int i_430_ = anInt8967 + anInt8969;
					int i_431_ = anInt8955;
					if (i_429_ < 0) {
						int i_432_ = (anInt8960 - 1 - i_429_) / anInt8960;
						i_431_ += i_432_;
						i_429_ += anInt8960 * i_432_;
						i_430_ += anInt8962 * i_432_;
						i_428_ += i_432_;
					}
					int i_433_;
					if ((i_433_ = ((1 + i_429_ - (anInt8945 << 12) - anInt8960) / anInt8960)) > i_431_)
						i_431_ = i_433_;
					if (i_430_ < 0) {
						i_433_ = (anInt8962 - 1 - i_430_) / anInt8962;
						i_431_ += i_433_;
						i_429_ += anInt8960 * i_433_;
						i_430_ += anInt8962 * i_433_;
						i_428_ += i_433_;
					}
					if ((i_433_ = ((1 + i_430_ - (anInt8950 << 12) - anInt8962) / anInt8962)) > i_431_)
						i_431_ = i_433_;
					for (/**/; i_431_ < 0; i_431_++) {
						method10510((i_430_ >> 12) * anInt8945 + (i_429_ >> 12), i_428_++, is, i, i_376_);
						i_429_ += anInt8960;
						i_430_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	void method1732(int i, int i_434_, int i_435_, int i_436_, int i_437_, int i_438_, int i_439_, int i_440_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		if (i_435_ > 0 && i_436_ > 0) {
			int[] is = aClass167_Sub1_8946.anIntArray8996;
			if (is != null) {
				int i_441_ = 0;
				int i_442_ = 0;
				int i_443_ = aClass167_Sub1_8946.anInt8997 * -570111553;
				int i_444_ = anInt8977 + anInt8945 + anInt8948;
				int i_445_ = anInt8947 + anInt8950 + anInt8952;
				int i_446_ = (i_444_ << 16) / i_435_;
				int i_447_ = (i_445_ << 16) / i_436_;
				if (anInt8977 > 0) {
					int i_448_ = ((anInt8977 << 16) + i_446_ - 1) / i_446_;
					i += i_448_;
					i_441_ += i_448_ * i_446_ - (anInt8977 << 16);
				}
				if (anInt8947 > 0) {
					int i_449_ = ((anInt8947 << 16) + i_447_ - 1) / i_447_;
					i_434_ += i_449_;
					i_442_ += i_449_ * i_447_ - (anInt8947 << 16);
				}
				if (anInt8945 < i_444_)
					i_435_ = ((anInt8945 << 16) - i_441_ + i_446_ - 1) / i_446_;
				if (anInt8950 < i_445_)
					i_436_ = ((anInt8950 << 16) - i_442_ + i_447_ - 1) / i_447_;
				int i_450_ = i + i_434_ * i_443_;
				int i_451_ = i_443_ - i_435_;
				if (i_434_ + i_436_ > aClass167_Sub1_8946.anInt9003 * -148513205)
					i_436_ -= (i_434_ + i_436_ - aClass167_Sub1_8946.anInt9003 * -148513205);
				if (i_434_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
					int i_452_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_434_;
					i_436_ -= i_452_;
					i_450_ += i_452_ * i_443_;
					i_442_ += i_447_ * i_452_;
				}
				if (i + i_435_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
					int i_453_ = (i + i_435_ - aClass167_Sub1_8946.anInt9001 * 2024498147);
					i_435_ -= i_453_;
					i_451_ += i_453_;
				}
				if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
					int i_454_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
					i_435_ -= i_454_;
					i_450_ += i_454_;
					i_441_ += i_446_ * i_454_;
					i_451_ += i_454_;
				}
				if (i_439_ == 0) {
					if (i_437_ == 1) {
						int i_455_ = i_441_;
						for (int i_456_ = -i_436_; i_456_ < 0; i_456_++) {
							int i_457_ = (i_442_ >> 16) * anInt8945;
							for (int i_458_ = -i_435_; i_458_ < 0; i_458_++) {
								is[i_450_++] = anIntArray11346[(i_441_ >> 16) + i_457_];
								i_441_ += i_446_;
							}
							i_442_ += i_447_;
							i_441_ = i_455_;
							i_450_ += i_451_;
						}
					} else if (i_437_ == 0) {
						int i_459_ = (i_438_ & 0xff0000) >> 16;
						int i_460_ = (i_438_ & 0xff00) >> 8;
						int i_461_ = i_438_ & 0xff;
						int i_462_ = i_441_;
						for (int i_463_ = -i_436_; i_463_ < 0; i_463_++) {
							int i_464_ = (i_442_ >> 16) * anInt8945;
							for (int i_465_ = -i_435_; i_465_ < 0; i_465_++) {
								int i_466_ = anIntArray11346[(i_441_ >> 16) + i_464_];
								int i_467_ = (i_466_ & 0xff0000) * i_459_ & ~0xffffff;
								int i_468_ = (i_466_ & 0xff00) * i_460_ & 0xff0000;
								int i_469_ = (i_466_ & 0xff) * i_461_ & 0xff00;
								is[i_450_++] = (i_467_ | i_468_ | i_469_) >>> 8;
								i_441_ += i_446_;
							}
							i_442_ += i_447_;
							i_441_ = i_462_;
							i_450_ += i_451_;
						}
					} else if (i_437_ == 3) {
						int i_470_ = i_441_;
						for (int i_471_ = -i_436_; i_471_ < 0; i_471_++) {
							int i_472_ = (i_442_ >> 16) * anInt8945;
							for (int i_473_ = -i_435_; i_473_ < 0; i_473_++) {
								int i_474_ = anIntArray11346[(i_441_ >> 16) + i_472_];
								int i_475_ = i_474_ + i_438_;
								int i_476_ = ((i_474_ & 0xff00ff) + (i_438_ & 0xff00ff));
								int i_477_ = ((i_476_ & 0x1000100) + (i_475_ - i_476_ & 0x10000));
								is[i_450_++] = i_475_ - i_477_ | i_477_ - (i_477_ >>> 8);
								i_441_ += i_446_;
							}
							i_442_ += i_447_;
							i_441_ = i_470_;
							i_450_ += i_451_;
						}
					} else if (i_437_ == 2) {
						int i_478_ = i_438_ >>> 24;
						int i_479_ = 256 - i_478_;
						int i_480_ = (i_438_ & 0xff00ff) * i_479_ & ~0xff00ff;
						int i_481_ = (i_438_ & 0xff00) * i_479_ & 0xff0000;
						i_438_ = (i_480_ | i_481_) >>> 8;
						int i_482_ = i_441_;
						for (int i_483_ = -i_436_; i_483_ < 0; i_483_++) {
							int i_484_ = (i_442_ >> 16) * anInt8945;
							for (int i_485_ = -i_435_; i_485_ < 0; i_485_++) {
								int i_486_ = anIntArray11346[(i_441_ >> 16) + i_484_];
								i_480_ = (i_486_ & 0xff00ff) * i_478_ & ~0xff00ff;
								i_481_ = (i_486_ & 0xff00) * i_478_ & 0xff0000;
								is[i_450_++] = ((i_480_ | i_481_) >>> 8) + i_438_;
								i_441_ += i_446_;
							}
							i_442_ += i_447_;
							i_441_ = i_482_;
							i_450_ += i_451_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_439_ == 1) {
					if (i_437_ == 1) {
						int i_487_ = i_441_;
						for (int i_488_ = -i_436_; i_488_ < 0; i_488_++) {
							int i_489_ = (i_442_ >> 16) * anInt8945;
							for (int i_490_ = -i_435_; i_490_ < 0; i_490_++) {
								int i_491_ = anIntArray11346[(i_441_ >> 16) + i_489_];
								int i_492_ = i_491_ >>> 24;
								int i_493_ = 256 - i_492_;
								int i_494_ = is[i_450_];
								is[i_450_++] = (((((i_491_ & 0xff00ff) * i_492_ + (i_494_ & 0xff00ff) * i_493_) & ~0xff00ff) >> 8) + (((((i_491_ & ~0xff00ff) >>> 8) * i_492_) + (((i_494_ & ~0xff00ff) >>> 8) * i_493_)) & ~0xff00ff));
								i_441_ += i_446_;
							}
							i_442_ += i_447_;
							i_441_ = i_487_;
							i_450_ += i_451_;
						}
					} else if (i_437_ == 0) {
						int i_495_ = i_441_;
						if ((i_438_ & 0xffffff) == 16777215) {
							for (int i_496_ = -i_436_; i_496_ < 0; i_496_++) {
								int i_497_ = (i_442_ >> 16) * anInt8945;
								for (int i_498_ = -i_435_; i_498_ < 0; i_498_++) {
									int i_499_ = (anIntArray11346[(i_441_ >> 16) + i_497_]);
									int i_500_ = ((i_499_ >>> 24) * (i_438_ >>> 24) >> 8);
									int i_501_ = 256 - i_500_;
									int i_502_ = is[i_450_];
									is[i_450_++] = ((((i_499_ & 0xff00ff) * i_500_ + (i_502_ & 0xff00ff) * i_501_) & ~0xff00ff) + (((i_499_ & 0xff00) * i_500_ + (i_502_ & 0xff00) * i_501_) & 0xff0000)) >> 8;
									i_441_ += i_446_;
								}
								i_442_ += i_447_;
								i_441_ = i_495_;
								i_450_ += i_451_;
							}
						} else {
							int i_503_ = (i_438_ & 0xff0000) >> 16;
							int i_504_ = (i_438_ & 0xff00) >> 8;
							int i_505_ = i_438_ & 0xff;
							for (int i_506_ = -i_436_; i_506_ < 0; i_506_++) {
								int i_507_ = (i_442_ >> 16) * anInt8945;
								for (int i_508_ = -i_435_; i_508_ < 0; i_508_++) {
									int i_509_ = (anIntArray11346[(i_441_ >> 16) + i_507_]);
									int i_510_ = ((i_509_ >>> 24) * (i_438_ >>> 24) >> 8);
									int i_511_ = 256 - i_510_;
									if (i_510_ != 255) {
										int i_512_ = ((i_509_ & 0xff0000) * i_503_ & ~0xffffff);
										int i_513_ = ((i_509_ & 0xff00) * i_504_ & 0xff0000);
										int i_514_ = ((i_509_ & 0xff) * i_505_ & 0xff00);
										i_509_ = (i_512_ | i_513_ | i_514_) >>> 8;
										int i_515_ = is[i_450_];
										is[i_450_++] = ((((i_509_ & 0xff00ff) * i_510_ + ((i_515_ & 0xff00ff) * i_511_)) & ~0xff00ff) + (((i_509_ & 0xff00) * i_510_ + ((i_515_ & 0xff00) * i_511_)) & 0xff0000)) >> 8;
									} else {
										int i_516_ = ((i_509_ & 0xff0000) * i_503_ & ~0xffffff);
										int i_517_ = ((i_509_ & 0xff00) * i_504_ & 0xff0000);
										int i_518_ = ((i_509_ & 0xff) * i_505_ & 0xff00);
										is[i_450_++] = (i_516_ | i_517_ | i_518_) >>> 8;
									}
									i_441_ += i_446_;
								}
								i_442_ += i_447_;
								i_441_ = i_495_;
								i_450_ += i_451_;
							}
						}
					} else if (i_437_ == 3) {
						int i_519_ = i_441_;
						for (int i_520_ = -i_436_; i_520_ < 0; i_520_++) {
							int i_521_ = (i_442_ >> 16) * anInt8945;
							for (int i_522_ = -i_435_; i_522_ < 0; i_522_++) {
								int i_523_ = anIntArray11346[(i_441_ >> 16) + i_521_];
								int i_524_ = i_523_ + i_438_;
								int i_525_ = ((i_523_ & 0xff00ff) + (i_438_ & 0xff00ff));
								int i_526_ = ((i_525_ & 0x1000100) + (i_524_ - i_525_ & 0x10000));
								i_526_ = i_524_ - i_526_ | i_526_ - (i_526_ >>> 8);
								int i_527_ = (i_526_ >>> 24) * (i_438_ >>> 24) >> 8;
								int i_528_ = 256 - i_527_;
								if (i_527_ != 255) {
									i_523_ = i_526_;
									i_526_ = is[i_450_];
									i_526_ = ((((i_523_ & 0xff00ff) * i_527_ + (i_526_ & 0xff00ff) * i_528_) & ~0xff00ff) + (((i_523_ & 0xff00) * i_527_ + (i_526_ & 0xff00) * i_528_) & 0xff0000)) >> 8;
								}
								is[i_450_++] = i_526_;
								i_441_ += i_446_;
							}
							i_442_ += i_447_;
							i_441_ = i_519_;
							i_450_ += i_451_;
						}
					} else if (i_437_ == 2) {
						int i_529_ = i_438_ >>> 24;
						int i_530_ = 256 - i_529_;
						int i_531_ = (i_438_ & 0xff00ff) * i_530_ & ~0xff00ff;
						int i_532_ = (i_438_ & 0xff00) * i_530_ & 0xff0000;
						i_438_ = (i_531_ | i_532_) >>> 8;
						int i_533_ = i_441_;
						for (int i_534_ = -i_436_; i_534_ < 0; i_534_++) {
							int i_535_ = (i_442_ >> 16) * anInt8945;
							for (int i_536_ = -i_435_; i_536_ < 0; i_536_++) {
								int i_537_ = anIntArray11346[(i_441_ >> 16) + i_535_];
								int i_538_ = i_537_ >>> 24;
								int i_539_ = 256 - i_538_;
								i_531_ = (i_537_ & 0xff00ff) * i_529_ & ~0xff00ff;
								i_532_ = (i_537_ & 0xff00) * i_529_ & 0xff0000;
								i_537_ = ((i_531_ | i_532_) >>> 8) + i_438_;
								int i_540_ = is[i_450_];
								is[i_450_++] = ((((i_537_ & 0xff00ff) * i_538_ + (i_540_ & 0xff00ff) * i_539_) & ~0xff00ff) + (((i_537_ & 0xff00) * i_538_ + (i_540_ & 0xff00) * i_539_) & 0xff0000)) >> 8;
								i_441_ += i_446_;
							}
							i_442_ += i_447_;
							i_441_ = i_533_;
							i_450_ += i_451_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_439_ == 2) {
					if (i_437_ == 1) {
						int i_541_ = i_441_;
						for (int i_542_ = -i_436_; i_542_ < 0; i_542_++) {
							int i_543_ = (i_442_ >> 16) * anInt8945;
							for (int i_544_ = -i_435_; i_544_ < 0; i_544_++) {
								int i_545_ = anIntArray11346[(i_441_ >> 16) + i_543_];
								if (i_545_ != 0) {
									int i_546_ = is[i_450_];
									int i_547_ = i_545_ + i_546_;
									int i_548_ = ((i_545_ & 0xff00ff) + (i_546_ & 0xff00ff));
									i_546_ = ((i_548_ & 0x1000100) + (i_547_ - i_548_ & 0x10000));
									is[i_450_++] = i_547_ - i_546_ | i_546_ - (i_546_ >>> 8);
								} else
									i_450_++;
								i_441_ += i_446_;
							}
							i_442_ += i_447_;
							i_441_ = i_541_;
							i_450_ += i_451_;
						}
					} else if (i_437_ == 0) {
						int i_549_ = i_441_;
						int i_550_ = (i_438_ & 0xff0000) >> 16;
						int i_551_ = (i_438_ & 0xff00) >> 8;
						int i_552_ = i_438_ & 0xff;
						for (int i_553_ = -i_436_; i_553_ < 0; i_553_++) {
							int i_554_ = (i_442_ >> 16) * anInt8945;
							for (int i_555_ = -i_435_; i_555_ < 0; i_555_++) {
								int i_556_ = anIntArray11346[(i_441_ >> 16) + i_554_];
								if (i_556_ != 0) {
									int i_557_ = ((i_556_ & 0xff0000) * i_550_ & ~0xffffff);
									int i_558_ = ((i_556_ & 0xff00) * i_551_ & 0xff0000);
									int i_559_ = (i_556_ & 0xff) * i_552_ & 0xff00;
									i_556_ = (i_557_ | i_558_ | i_559_) >>> 8;
									int i_560_ = is[i_450_];
									int i_561_ = i_556_ + i_560_;
									int i_562_ = ((i_556_ & 0xff00ff) + (i_560_ & 0xff00ff));
									i_560_ = ((i_562_ & 0x1000100) + (i_561_ - i_562_ & 0x10000));
									is[i_450_++] = i_561_ - i_560_ | i_560_ - (i_560_ >>> 8);
								} else
									i_450_++;
								i_441_ += i_446_;
							}
							i_442_ += i_447_;
							i_441_ = i_549_;
							i_450_ += i_451_;
						}
					} else if (i_437_ == 3) {
						int i_563_ = i_441_;
						for (int i_564_ = -i_436_; i_564_ < 0; i_564_++) {
							int i_565_ = (i_442_ >> 16) * anInt8945;
							for (int i_566_ = -i_435_; i_566_ < 0; i_566_++) {
								int i_567_ = anIntArray11346[(i_441_ >> 16) + i_565_];
								int i_568_ = i_567_ + i_438_;
								int i_569_ = ((i_567_ & 0xff00ff) + (i_438_ & 0xff00ff));
								int i_570_ = ((i_569_ & 0x1000100) + (i_568_ - i_569_ & 0x10000));
								i_567_ = i_568_ - i_570_ | i_570_ - (i_570_ >>> 8);
								i_570_ = is[i_450_];
								i_568_ = i_567_ + i_570_;
								i_569_ = (i_567_ & 0xff00ff) + (i_570_ & 0xff00ff);
								i_570_ = (i_569_ & 0x1000100) + (i_568_ - i_569_ & 0x10000);
								is[i_450_++] = i_568_ - i_570_ | i_570_ - (i_570_ >>> 8);
								i_441_ += i_446_;
							}
							i_442_ += i_447_;
							i_441_ = i_563_;
							i_450_ += i_451_;
						}
					} else if (i_437_ == 2) {
						int i_571_ = i_438_ >>> 24;
						int i_572_ = 256 - i_571_;
						int i_573_ = (i_438_ & 0xff00ff) * i_572_ & ~0xff00ff;
						int i_574_ = (i_438_ & 0xff00) * i_572_ & 0xff0000;
						i_438_ = (i_573_ | i_574_) >>> 8;
						int i_575_ = i_441_;
						for (int i_576_ = -i_436_; i_576_ < 0; i_576_++) {
							int i_577_ = (i_442_ >> 16) * anInt8945;
							for (int i_578_ = -i_435_; i_578_ < 0; i_578_++) {
								int i_579_ = anIntArray11346[(i_441_ >> 16) + i_577_];
								if (i_579_ != 0) {
									i_573_ = ((i_579_ & 0xff00ff) * i_571_ & ~0xff00ff);
									i_574_ = ((i_579_ & 0xff00) * i_571_ & 0xff0000);
									i_579_ = ((i_573_ | i_574_) >>> 8) + i_438_;
									int i_580_ = is[i_450_];
									int i_581_ = i_579_ + i_580_;
									int i_582_ = ((i_579_ & 0xff00ff) + (i_580_ & 0xff00ff));
									i_580_ = ((i_582_ & 0x1000100) + (i_581_ - i_582_ & 0x10000));
									is[i_450_++] = i_581_ - i_580_ | i_580_ - (i_580_ >>> 8);
								} else
									i_450_++;
								i_441_ += i_446_;
							}
							i_442_ += i_447_;
							i_441_ = i_575_;
							i_450_ += i_451_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method8430(boolean bool, boolean bool_583_, boolean bool_584_, int i, int i_585_, float f, int i_586_, int i_587_, int i_588_, int i_589_, int i_590_, int i_591_, boolean bool_592_) {
		if (i_586_ > 0 && i_587_ > 0 && (bool || bool_583_)) {
			int i_593_ = 0;
			int i_594_ = 0;
			int i_595_ = anInt8977 + anInt8945 + anInt8948;
			int i_596_ = anInt8947 + anInt8950 + anInt8952;
			int i_597_ = (i_595_ << 16) / i_586_;
			int i_598_ = (i_596_ << 16) / i_587_;
			if (anInt8977 > 0) {
				int i_599_ = ((anInt8977 << 16) + i_597_ - 1) / i_597_;
				i += i_599_;
				i_593_ += i_599_ * i_597_ - (anInt8977 << 16);
			}
			if (anInt8947 > 0) {
				int i_600_ = ((anInt8947 << 16) + i_598_ - 1) / i_598_;
				i_585_ += i_600_;
				i_594_ += i_600_ * i_598_ - (anInt8947 << 16);
			}
			if (anInt8945 < i_595_)
				i_586_ = ((anInt8945 << 16) - i_593_ + i_597_ - 1) / i_597_;
			if (anInt8950 < i_596_)
				i_587_ = ((anInt8950 << 16) - i_594_ + i_598_ - 1) / i_598_;
			int i_601_ = i + i_585_ * (aClass167_Sub1_8946.anInt8997 * -570111553);
			int i_602_ = aClass167_Sub1_8946.anInt8997 * -570111553 - i_586_;
			if (i_585_ + i_587_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_587_ -= (i_585_ + i_587_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i_585_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_603_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_585_;
				i_587_ -= i_603_;
				i_601_ += i_603_ * (aClass167_Sub1_8946.anInt8997 * -570111553);
				i_594_ += i_598_ * i_603_;
			}
			if (i + i_586_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_604_ = i + i_586_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_586_ -= i_604_;
				i_602_ += i_604_;
			}
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_605_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_586_ -= i_605_;
				i_601_ += i_605_;
				i_593_ += i_597_ * i_605_;
				i_602_ += i_605_;
			}
			float[] fs = aClass167_Sub1_8946.aFloatArray8999;
			int[] is = aClass167_Sub1_8946.anIntArray8996;
			if (i_590_ == 0) {
				if (i_588_ == 1) {
					int i_606_ = i_593_;
					for (int i_607_ = -i_587_; i_607_ < 0; i_607_++) {
						int i_608_ = (i_594_ >> 16) * anInt8945;
						for (int i_609_ = -i_586_; i_609_ < 0; i_609_++) {
							if (!bool_583_ || f < fs[i_601_]) {
								if (bool)
									is[i_601_] = (anIntArray11346[(i_593_ >> 16) + i_608_]);
								if (bool_583_ && bool_592_)
									fs[i_601_] = f;
							}
							i_593_ += i_597_;
							i_601_++;
						}
						i_594_ += i_598_;
						i_593_ = i_606_;
						i_601_ += i_602_;
					}
				} else if (i_588_ == 0) {
					int i_610_ = (i_589_ & 0xff0000) >> 16;
					int i_611_ = (i_589_ & 0xff00) >> 8;
					int i_612_ = i_589_ & 0xff;
					int i_613_ = i_593_;
					for (int i_614_ = -i_587_; i_614_ < 0; i_614_++) {
						int i_615_ = (i_594_ >> 16) * anInt8945;
						for (int i_616_ = -i_586_; i_616_ < 0; i_616_++) {
							if (!bool_583_ || f < fs[i_601_]) {
								if (bool) {
									int i_617_ = (anIntArray11346[(i_593_ >> 16) + i_615_]);
									int i_618_ = ((i_617_ & 0xff0000) * i_610_ & ~0xffffff);
									int i_619_ = ((i_617_ & 0xff00) * i_611_ & 0xff0000);
									int i_620_ = (i_617_ & 0xff) * i_612_ & 0xff00;
									is[i_601_] = (i_618_ | i_619_ | i_620_) >>> 8;
								}
								if (bool_583_ && bool_592_)
									fs[i_601_] = f;
							}
							i_593_ += i_597_;
							i_601_++;
						}
						i_594_ += i_598_;
						i_593_ = i_613_;
						i_601_ += i_602_;
					}
				} else if (i_588_ == 3) {
					int i_621_ = i_593_;
					for (int i_622_ = -i_587_; i_622_ < 0; i_622_++) {
						int i_623_ = (i_594_ >> 16) * anInt8945;
						for (int i_624_ = -i_586_; i_624_ < 0; i_624_++) {
							if (!bool_583_ || f < fs[i_601_]) {
								if (bool) {
									int i_625_ = (anIntArray11346[(i_593_ >> 16) + i_623_]);
									int i_626_ = i_625_ + i_589_;
									int i_627_ = ((i_625_ & 0xff00ff) + (i_589_ & 0xff00ff));
									int i_628_ = ((i_627_ & 0x1000100) + (i_626_ - i_627_ & 0x10000));
									is[i_601_] = i_626_ - i_628_ | i_628_ - (i_628_ >>> 8);
								}
								if (bool_583_ && bool_592_)
									fs[i_601_] = f;
							}
							i_593_ += i_597_;
							i_601_++;
						}
						i_594_ += i_598_;
						i_593_ = i_621_;
						i_601_ += i_602_;
					}
				} else if (i_588_ == 2) {
					int i_629_ = i_589_ >>> 24;
					int i_630_ = 256 - i_629_;
					int i_631_ = (i_589_ & 0xff00ff) * i_630_ & ~0xff00ff;
					int i_632_ = (i_589_ & 0xff00) * i_630_ & 0xff0000;
					i_589_ = (i_631_ | i_632_) >>> 8;
					int i_633_ = i_593_;
					for (int i_634_ = -i_587_; i_634_ < 0; i_634_++) {
						int i_635_ = (i_594_ >> 16) * anInt8945;
						for (int i_636_ = -i_586_; i_636_ < 0; i_636_++) {
							if (!bool_583_ || f < fs[i_601_]) {
								if (bool) {
									int i_637_ = (anIntArray11346[(i_593_ >> 16) + i_635_]);
									i_631_ = ((i_637_ & 0xff00ff) * i_629_ & ~0xff00ff);
									i_632_ = ((i_637_ & 0xff00) * i_629_ & 0xff0000);
									is[i_601_] = ((i_631_ | i_632_) >>> 8) + i_589_;
								}
								if (bool_583_ && bool_592_)
									fs[i_601_] = f;
							}
							i_593_ += i_597_;
							i_601_++;
						}
						i_594_ += i_598_;
						i_593_ = i_633_;
						i_601_ += i_602_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_590_ == 1) {
				if (i_588_ == 1) {
					int i_638_ = i_593_;
					for (int i_639_ = -i_587_; i_639_ < 0; i_639_++) {
						int i_640_ = (i_594_ >> 16) * anInt8945;
						for (int i_641_ = -i_586_; i_641_ < 0; i_641_++) {
							if (!bool_583_ || f < fs[i_601_]) {
								if (bool) {
									int i_642_ = (anIntArray11346[(i_593_ >> 16) + i_640_]);
									int i_643_ = i_642_ >>> 24;
									int i_644_ = 256 - i_643_;
									int i_645_ = is[i_601_];
									is[i_601_] = (((((i_642_ & 0xff00ff) * i_643_ + (i_645_ & 0xff00ff) * i_644_) & ~0xff00ff) >> 8) + (((((i_642_ & ~0xff00ff) >>> 8) * i_643_) + (((i_645_ & ~0xff00ff) >>> 8) * i_644_)) & ~0xff00ff));
								}
								if (bool_583_ && bool_592_)
									fs[i_601_] = f;
							}
							i_593_ += i_597_;
							i_601_++;
						}
						i_594_ += i_598_;
						i_593_ = i_638_;
						i_601_ += i_602_;
					}
				} else if (i_588_ == 0) {
					int i_646_ = i_593_;
					if ((i_589_ & 0xffffff) == 16777215) {
						for (int i_647_ = -i_587_; i_647_ < 0; i_647_++) {
							int i_648_ = (i_594_ >> 16) * anInt8945;
							for (int i_649_ = -i_586_; i_649_ < 0; i_649_++) {
								if (!bool_583_ || f < fs[i_601_]) {
									if (bool) {
										int i_650_ = (anIntArray11346[(i_593_ >> 16) + i_648_]);
										int i_651_ = ((i_650_ >>> 24) * (i_589_ >>> 24) >> 8);
										int i_652_ = 256 - i_651_;
										int i_653_ = is[i_601_];
										is[i_601_] = ((((i_650_ & 0xff00ff) * i_651_ + ((i_653_ & 0xff00ff) * i_652_)) & ~0xff00ff) + (((i_650_ & 0xff00) * i_651_ + ((i_653_ & 0xff00) * i_652_)) & 0xff0000)) >> 8;
									}
									if (bool_583_ && bool_592_)
										fs[i_601_] = f;
								}
								i_593_ += i_597_;
								i_601_++;
							}
							i_594_ += i_598_;
							i_593_ = i_646_;
							i_601_ += i_602_;
						}
					} else {
						int i_654_ = (i_589_ & 0xff0000) >> 16;
						int i_655_ = (i_589_ & 0xff00) >> 8;
						int i_656_ = i_589_ & 0xff;
						for (int i_657_ = -i_587_; i_657_ < 0; i_657_++) {
							int i_658_ = (i_594_ >> 16) * anInt8945;
							for (int i_659_ = -i_586_; i_659_ < 0; i_659_++) {
								if (!bool_583_ || f < fs[i_601_]) {
									int i_660_ = (anIntArray11346[(i_593_ >> 16) + i_658_]);
									int i_661_ = ((i_660_ >>> 24) * (i_589_ >>> 24) >> 8);
									int i_662_ = 256 - i_661_;
									if (i_661_ != 255) {
										if (bool) {
											int i_663_ = ((i_660_ & 0xff0000) * i_654_ & ~0xffffff);
											int i_664_ = ((i_660_ & 0xff00) * i_655_ & 0xff0000);
											int i_665_ = ((i_660_ & 0xff) * i_656_ & 0xff00);
											i_660_ = (i_663_ | i_664_ | i_665_) >>> 8;
											int i_666_ = is[i_601_];
											is[i_601_] = (((((i_660_ & 0xff00ff) * i_661_) + ((i_666_ & 0xff00ff) * i_662_)) & ~0xff00ff) + ((((i_660_ & 0xff00) * i_661_) + ((i_666_ & 0xff00) * i_662_)) & 0xff0000)) >> 8;
											if (bool_584_) {
												int i_667_ = (i_666_ >>> 24) + i_661_;
												if (i_667_ > 255)
													i_667_ = 255;
												is[i_601_] |= i_667_ << 24;
											}
										}
										if (bool_583_ && bool_592_)
											fs[i_601_] = f;
									} else {
										if (bool) {
											int i_668_ = ((i_660_ & 0xff0000) * i_654_ & ~0xffffff);
											int i_669_ = ((i_660_ & 0xff00) * i_655_ & 0xff0000);
											int i_670_ = ((i_660_ & 0xff) * i_656_ & 0xff00);
											is[i_601_] = (i_668_ | i_669_ | i_670_) >>> 8;
										}
										if (bool_583_ && bool_592_)
											fs[i_601_] = f;
									}
								}
								i_593_ += i_597_;
								i_601_++;
							}
							i_594_ += i_598_;
							i_593_ = i_646_;
							i_601_ += i_602_;
						}
					}
				} else if (i_588_ == 3) {
					int i_671_ = i_593_;
					for (int i_672_ = -i_587_; i_672_ < 0; i_672_++) {
						int i_673_ = (i_594_ >> 16) * anInt8945;
						for (int i_674_ = -i_586_; i_674_ < 0; i_674_++) {
							if (!bool_583_ || f < fs[i_601_]) {
								if (bool) {
									int i_675_ = (anIntArray11346[(i_593_ >> 16) + i_673_]);
									int i_676_ = i_675_ + i_589_;
									int i_677_ = ((i_675_ & 0xff00ff) + (i_589_ & 0xff00ff));
									int i_678_ = ((i_677_ & 0x1000100) + (i_676_ - i_677_ & 0x10000));
									i_678_ = i_676_ - i_678_ | i_678_ - (i_678_ >>> 8);
									int i_679_ = ((i_678_ >>> 24) * (i_589_ >>> 24) >> 8);
									int i_680_ = 256 - i_679_;
									if (i_679_ != 255) {
										i_675_ = i_678_;
										i_678_ = is[i_601_];
										i_678_ = ((((i_675_ & 0xff00ff) * i_679_ + ((i_678_ & 0xff00ff) * i_680_)) & ~0xff00ff) + (((i_675_ & 0xff00) * i_679_ + ((i_678_ & 0xff00) * i_680_)) & 0xff0000)) >> 8;
									}
									is[i_601_] = i_678_;
								}
								if (bool_583_ && bool_592_)
									fs[i_601_] = f;
							}
							i_593_ += i_597_;
							i_601_++;
						}
						i_594_ += i_598_;
						i_593_ = i_671_;
						i_601_ += i_602_;
					}
				} else if (i_588_ == 2) {
					int i_681_ = i_589_ >>> 24;
					int i_682_ = 256 - i_681_;
					int i_683_ = (i_589_ & 0xff00ff) * i_682_ & ~0xff00ff;
					int i_684_ = (i_589_ & 0xff00) * i_682_ & 0xff0000;
					i_589_ = (i_683_ | i_684_) >>> 8;
					int i_685_ = i_593_;
					for (int i_686_ = -i_587_; i_686_ < 0; i_686_++) {
						int i_687_ = (i_594_ >> 16) * anInt8945;
						for (int i_688_ = -i_586_; i_688_ < 0; i_688_++) {
							if (!bool_583_ || f < fs[i_601_]) {
								if (bool) {
									int i_689_ = (anIntArray11346[(i_593_ >> 16) + i_687_]);
									int i_690_ = i_689_ >>> 24;
									int i_691_ = 256 - i_690_;
									i_683_ = ((i_689_ & 0xff00ff) * i_681_ & ~0xff00ff);
									i_684_ = ((i_689_ & 0xff00) * i_681_ & 0xff0000);
									i_689_ = ((i_683_ | i_684_) >>> 8) + i_589_;
									int i_692_ = is[i_601_];
									is[i_601_] = ((((i_689_ & 0xff00ff) * i_690_ + (i_692_ & 0xff00ff) * i_691_) & ~0xff00ff) + (((i_689_ & 0xff00) * i_690_ + (i_692_ & 0xff00) * i_691_) & 0xff0000)) >> 8;
								}
								if (bool_583_ && bool_592_)
									fs[i_601_] = f;
							}
							i_593_ += i_597_;
							i_601_++;
						}
						i_594_ += i_598_;
						i_593_ = i_685_;
						i_601_ += i_602_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_590_ == 2) {
				if (i_588_ == 1) {
					int i_693_ = i_593_;
					for (int i_694_ = -i_587_; i_694_ < 0; i_694_++) {
						int i_695_ = (i_594_ >> 16) * anInt8945;
						for (int i_696_ = -i_586_; i_696_ < 0; i_696_++) {
							if (!bool_583_ || f < fs[i_601_]) {
								int i_697_ = anIntArray11346[(i_593_ >> 16) + i_695_];
								if (i_697_ != 0) {
									if (bool) {
										int i_698_ = is[i_601_];
										int i_699_ = i_697_ + i_698_;
										int i_700_ = ((i_697_ & 0xff00ff) + (i_698_ & 0xff00ff));
										i_698_ = ((i_700_ & 0x1000100) + (i_699_ - i_700_ & 0x10000));
										is[i_601_] = (i_699_ - i_698_ | i_698_ - (i_698_ >>> 8));
									}
									if (bool_583_ && bool_592_)
										fs[i_601_] = f;
								}
							}
							i_593_ += i_597_;
							i_601_++;
						}
						i_594_ += i_598_;
						i_593_ = i_693_;
						i_601_ += i_602_;
					}
				} else if (i_588_ == 0) {
					int i_701_ = i_593_;
					int i_702_ = (i_589_ & 0xff0000) >> 16;
					int i_703_ = (i_589_ & 0xff00) >> 8;
					int i_704_ = i_589_ & 0xff;
					for (int i_705_ = -i_587_; i_705_ < 0; i_705_++) {
						int i_706_ = (i_594_ >> 16) * anInt8945;
						for (int i_707_ = -i_586_; i_707_ < 0; i_707_++) {
							if (!bool_583_ || f < fs[i_601_]) {
								int i_708_ = anIntArray11346[(i_593_ >> 16) + i_706_];
								if (i_708_ != 0) {
									if (bool) {
										int i_709_ = ((i_708_ & 0xff0000) * i_702_ & ~0xffffff);
										int i_710_ = ((i_708_ & 0xff00) * i_703_ & 0xff0000);
										int i_711_ = ((i_708_ & 0xff) * i_704_ & 0xff00);
										i_708_ = (i_709_ | i_710_ | i_711_) >>> 8;
										int i_712_ = is[i_601_];
										int i_713_ = i_708_ + i_712_;
										int i_714_ = ((i_708_ & 0xff00ff) + (i_712_ & 0xff00ff));
										i_712_ = ((i_714_ & 0x1000100) + (i_713_ - i_714_ & 0x10000));
										is[i_601_] = (i_713_ - i_712_ | i_712_ - (i_712_ >>> 8));
									}
									if (bool_583_ && bool_592_)
										fs[i_601_] = f;
								}
							}
							i_593_ += i_597_;
							i_601_++;
						}
						i_594_ += i_598_;
						i_593_ = i_701_;
						i_601_ += i_602_;
					}
				} else if (i_588_ == 3) {
					int i_715_ = i_593_;
					for (int i_716_ = -i_587_; i_716_ < 0; i_716_++) {
						int i_717_ = (i_594_ >> 16) * anInt8945;
						for (int i_718_ = -i_586_; i_718_ < 0; i_718_++) {
							if (!bool_583_ || f < fs[i_601_]) {
								if (bool) {
									int i_719_ = (anIntArray11346[(i_593_ >> 16) + i_717_]);
									int i_720_ = i_719_ + i_589_;
									int i_721_ = ((i_719_ & 0xff00ff) + (i_589_ & 0xff00ff));
									int i_722_ = ((i_721_ & 0x1000100) + (i_720_ - i_721_ & 0x10000));
									i_719_ = i_720_ - i_722_ | i_722_ - (i_722_ >>> 8);
									i_722_ = is[i_601_];
									i_720_ = i_719_ + i_722_;
									i_721_ = (i_719_ & 0xff00ff) + (i_722_ & 0xff00ff);
									i_722_ = ((i_721_ & 0x1000100) + (i_720_ - i_721_ & 0x10000));
									is[i_601_] = i_720_ - i_722_ | i_722_ - (i_722_ >>> 8);
								}
								if (bool_583_ && bool_592_)
									fs[i_601_] = f;
							}
							i_593_ += i_597_;
							i_601_++;
						}
						i_594_ += i_598_;
						i_593_ = i_715_;
						i_601_ += i_602_;
					}
				} else if (i_588_ == 2) {
					int i_723_ = i_589_ >>> 24;
					int i_724_ = 256 - i_723_;
					int i_725_ = (i_589_ & 0xff00ff) * i_724_ & ~0xff00ff;
					int i_726_ = (i_589_ & 0xff00) * i_724_ & 0xff0000;
					i_589_ = (i_725_ | i_726_) >>> 8;
					int i_727_ = i_593_;
					for (int i_728_ = -i_587_; i_728_ < 0; i_728_++) {
						int i_729_ = (i_594_ >> 16) * anInt8945;
						for (int i_730_ = -i_586_; i_730_ < 0; i_730_++) {
							if (!bool_583_ || f < fs[i_601_]) {
								int i_731_ = anIntArray11346[(i_593_ >> 16) + i_729_];
								if (i_731_ != 0) {
									if (bool) {
										i_725_ = ((i_731_ & 0xff00ff) * i_723_ & ~0xff00ff);
										i_726_ = ((i_731_ & 0xff00) * i_723_ & 0xff0000);
										i_731_ = (((i_725_ | i_726_) >>> 8) + i_589_);
										int i_732_ = is[i_601_];
										int i_733_ = i_731_ + i_732_;
										int i_734_ = ((i_731_ & 0xff00ff) + (i_732_ & 0xff00ff));
										i_732_ = ((i_734_ & 0x1000100) + (i_733_ - i_734_ & 0x10000));
										is[i_601_] = (i_733_ - i_732_ | i_732_ - (i_732_ >>> 8));
									}
									if (bool_583_ && bool_592_)
										fs[i_601_] = f;
								}
							}
							i_593_ += i_597_;
							i_601_++;
						}
						i_594_ += i_598_;
						i_593_ = i_727_;
						i_601_ += i_602_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method1788(int i, int i_735_, Class161 class161, int i_736_, int i_737_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			i += anInt8977;
			i_735_ += anInt8947;
			int i_738_ = 0;
			int i_739_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			int i_740_ = anInt8945;
			int i_741_ = anInt8950;
			int i_742_ = i_739_ - i_740_;
			int i_743_ = 0;
			int i_744_ = i + i_735_ * i_739_;
			if (i_735_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_745_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_735_;
				i_741_ -= i_745_;
				i_735_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_738_ += i_745_ * i_740_;
				i_744_ += i_745_ * i_739_;
			}
			if (i_735_ + i_741_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_741_ -= (i_735_ + i_741_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_746_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_740_ -= i_746_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_738_ += i_746_;
				i_744_ += i_746_;
				i_743_ += i_746_;
				i_742_ += i_746_;
			}
			if (i + i_740_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_747_ = i + i_740_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_740_ -= i_747_;
				i_743_ += i_747_;
				i_742_ += i_747_;
			}
			if (i_740_ > 0 && i_741_ > 0) {
				Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
				int[] is_748_ = class161_sub2.anIntArray9444;
				int[] is_749_ = class161_sub2.anIntArray9445;
				int i_750_ = i_735_;
				if (i_737_ > i_750_) {
					i_750_ = i_737_;
					i_744_ += (i_737_ - i_735_) * i_739_;
					i_738_ += (i_737_ - i_735_) * anInt8945;
				}
				int i_751_ = (i_737_ + is_748_.length < i_735_ + i_741_ ? i_737_ + is_748_.length : i_735_ + i_741_);
				for (int i_752_ = i_750_; i_752_ < i_751_; i_752_++) {
					int i_753_ = is_748_[i_752_ - i_737_] + i_736_;
					int i_754_ = is_749_[i_752_ - i_737_];
					int i_755_ = i_740_;
					if (i > i_753_) {
						int i_756_ = i - i_753_;
						if (i_756_ >= i_754_) {
							i_738_ += i_740_ + i_743_;
							i_744_ += i_740_ + i_742_;
							continue;
						}
						i_754_ -= i_756_;
					} else {
						int i_757_ = i_753_ - i;
						if (i_757_ >= i_740_) {
							i_738_ += i_740_ + i_743_;
							i_744_ += i_740_ + i_742_;
							continue;
						}
						i_738_ += i_757_;
						i_755_ -= i_757_;
						i_744_ += i_757_;
					}
					int i_758_ = 0;
					if (i_755_ < i_754_)
						i_754_ = i_755_;
					else
						i_758_ = i_755_ - i_754_;
					for (int i_759_ = -i_754_; i_759_ < 0; i_759_++) {
						int i_760_ = anIntArray11346[i_738_++];
						int i_761_ = i_760_ >>> 24;
						int i_762_ = 256 - i_761_;
						int i_763_ = is[i_744_];
						is[i_744_++] = ((((i_760_ & 0xff00ff) * i_761_ + (i_763_ & 0xff00ff) * i_762_) & ~0xff00ff) + (((i_760_ & 0xff00) * i_761_ + (i_763_ & 0xff00) * i_762_) & 0xff0000)) >> 8;
					}
					i_738_ += i_758_ + i_743_;
					i_744_ += i_758_ + i_742_;
				}
			}
		}
	}

	void method8432(int[] is, int[] is_764_, int i, int i_765_) {
		int[] is_766_ = aClass167_Sub1_8946.anIntArray8996;
		if (is_766_ != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_767_ = anInt8957;
					while (i_767_ < 0) {
						int i_768_ = i_767_ + i_765_;
						if (i_768_ >= 0) {
							if (i_768_ >= is.length)
								break;
							int i_769_ = anInt8959;
							int i_770_ = anInt8966;
							int i_771_ = anInt8967;
							int i_772_ = anInt8955;
							if (i_770_ >= 0 && i_771_ >= 0 && i_770_ - (anInt8945 << 12) < 0 && i_771_ - (anInt8950 << 12) < 0) {
								int i_773_ = is[i_768_] - i;
								int i_774_ = -is_764_[i_768_];
								int i_775_ = i_773_ - (i_769_ - anInt8959);
								if (i_775_ > 0) {
									i_769_ += i_775_;
									i_772_ += i_775_;
									i_770_ += anInt8960 * i_775_;
									i_771_ += anInt8962 * i_775_;
								} else
									i_774_ -= i_775_;
								if (i_772_ < i_774_)
									i_772_ = i_774_;
								for (/**/; i_772_ < 0; i_772_++) {
									int i_776_ = (anIntArray11346[((i_771_ >> 12) * anInt8945 + (i_770_ >> 12))]);
									int i_777_ = i_776_ >>> 24;
									int i_778_ = 256 - i_777_;
									int i_779_ = is_766_[i_769_];
									is_766_[i_769_++] = ((((i_776_ & 0xff00ff) * i_777_ + (i_779_ & 0xff00ff) * i_778_) & ~0xff00ff) + (((i_776_ & 0xff00) * i_777_ + (i_779_ & 0xff00) * i_778_) & 0xff0000)) >> 8;
								}
							}
						}
						i_767_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_780_ = anInt8957;
					while (i_780_ < 0) {
						int i_781_ = i_780_ + i_765_;
						if (i_781_ >= 0) {
							if (i_781_ >= is.length)
								break;
							int i_782_ = anInt8959;
							int i_783_ = anInt8966;
							int i_784_ = anInt8967 + anInt8969;
							int i_785_ = anInt8955;
							if (i_783_ >= 0 && i_783_ - (anInt8945 << 12) < 0) {
								int i_786_;
								if ((i_786_ = i_784_ - (anInt8950 << 12)) >= 0) {
									i_786_ = (anInt8962 - i_786_) / anInt8962;
									i_785_ += i_786_;
									i_784_ += anInt8962 * i_786_;
									i_782_ += i_786_;
								}
								if ((i_786_ = (i_784_ - anInt8962) / anInt8962) > i_785_)
									i_785_ = i_786_;
								int i_787_ = is[i_781_] - i;
								int i_788_ = -is_764_[i_781_];
								int i_789_ = i_787_ - (i_782_ - anInt8959);
								if (i_789_ > 0) {
									i_782_ += i_789_;
									i_785_ += i_789_;
									i_783_ += anInt8960 * i_789_;
									i_784_ += anInt8962 * i_789_;
								} else
									i_788_ -= i_789_;
								if (i_785_ < i_788_)
									i_785_ = i_788_;
								for (/**/; i_785_ < 0; i_785_++) {
									int i_790_ = (anIntArray11346[((i_784_ >> 12) * anInt8945 + (i_783_ >> 12))]);
									int i_791_ = i_790_ >>> 24;
									int i_792_ = 256 - i_791_;
									int i_793_ = is_766_[i_782_];
									is_766_[i_782_++] = ((((i_790_ & 0xff00ff) * i_791_ + (i_793_ & 0xff00ff) * i_792_) & ~0xff00ff) + (((i_790_ & 0xff00) * i_791_ + (i_793_ & 0xff00) * i_792_) & 0xff0000)) >> 8;
									i_784_ += anInt8962;
								}
							}
						}
						i_780_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_794_ = anInt8957;
					while (i_794_ < 0) {
						int i_795_ = i_794_ + i_765_;
						if (i_795_ >= 0) {
							if (i_795_ >= is.length)
								break;
							int i_796_ = anInt8959;
							int i_797_ = anInt8966;
							int i_798_ = anInt8967 + anInt8969;
							int i_799_ = anInt8955;
							if (i_797_ >= 0 && i_797_ - (anInt8945 << 12) < 0) {
								if (i_798_ < 0) {
									int i_800_ = (anInt8962 - 1 - i_798_) / anInt8962;
									i_799_ += i_800_;
									i_798_ += anInt8962 * i_800_;
									i_796_ += i_800_;
								}
								int i_801_;
								if ((i_801_ = (1 + i_798_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_799_)
									i_799_ = i_801_;
								int i_802_ = is[i_795_] - i;
								int i_803_ = -is_764_[i_795_];
								int i_804_ = i_802_ - (i_796_ - anInt8959);
								if (i_804_ > 0) {
									i_796_ += i_804_;
									i_799_ += i_804_;
									i_797_ += anInt8960 * i_804_;
									i_798_ += anInt8962 * i_804_;
								} else
									i_803_ -= i_804_;
								if (i_799_ < i_803_)
									i_799_ = i_803_;
								for (/**/; i_799_ < 0; i_799_++) {
									int i_805_ = (anIntArray11346[((i_798_ >> 12) * anInt8945 + (i_797_ >> 12))]);
									int i_806_ = i_805_ >>> 24;
									int i_807_ = 256 - i_806_;
									int i_808_ = is_766_[i_796_];
									is_766_[i_796_++] = ((((i_805_ & 0xff00ff) * i_806_ + (i_808_ & 0xff00ff) * i_807_) & ~0xff00ff) + (((i_805_ & 0xff00) * i_806_ + (i_808_ & 0xff00) * i_807_) & 0xff0000)) >> 8;
									i_798_ += anInt8962;
								}
							}
						}
						i_794_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_809_ = anInt8957;
					while (i_809_ < 0) {
						int i_810_ = i_809_ + i_765_;
						if (i_810_ >= 0) {
							if (i_810_ >= is.length)
								break;
							int i_811_ = anInt8959;
							int i_812_ = anInt8966 + anInt8968;
							int i_813_ = anInt8967;
							int i_814_ = anInt8955;
							if (i_813_ >= 0 && i_813_ - (anInt8950 << 12) < 0) {
								int i_815_;
								if ((i_815_ = i_812_ - (anInt8945 << 12)) >= 0) {
									i_815_ = (anInt8960 - i_815_) / anInt8960;
									i_814_ += i_815_;
									i_812_ += anInt8960 * i_815_;
									i_811_ += i_815_;
								}
								if ((i_815_ = (i_812_ - anInt8960) / anInt8960) > i_814_)
									i_814_ = i_815_;
								int i_816_ = is[i_810_] - i;
								int i_817_ = -is_764_[i_810_];
								int i_818_ = i_816_ - (i_811_ - anInt8959);
								if (i_818_ > 0) {
									i_811_ += i_818_;
									i_814_ += i_818_;
									i_812_ += anInt8960 * i_818_;
									i_813_ += anInt8962 * i_818_;
								} else
									i_817_ -= i_818_;
								if (i_814_ < i_817_)
									i_814_ = i_817_;
								for (/**/; i_814_ < 0; i_814_++) {
									int i_819_ = (anIntArray11346[((i_813_ >> 12) * anInt8945 + (i_812_ >> 12))]);
									int i_820_ = i_819_ >>> 24;
									int i_821_ = 256 - i_820_;
									int i_822_ = is_766_[i_811_];
									is_766_[i_811_++] = ((((i_819_ & 0xff00ff) * i_820_ + (i_822_ & 0xff00ff) * i_821_) & ~0xff00ff) + (((i_819_ & 0xff00) * i_820_ + (i_822_ & 0xff00) * i_821_) & 0xff0000)) >> 8;
									i_812_ += anInt8960;
								}
							}
						}
						i_809_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_823_ = anInt8957;
					while (i_823_ < 0) {
						int i_824_ = i_823_ + i_765_;
						if (i_824_ >= 0) {
							if (i_824_ >= is.length)
								break;
							int i_825_ = anInt8959;
							int i_826_ = anInt8966 + anInt8968;
							int i_827_ = anInt8967 + anInt8969;
							int i_828_ = anInt8955;
							int i_829_;
							if ((i_829_ = i_826_ - (anInt8945 << 12)) >= 0) {
								i_829_ = (anInt8960 - i_829_) / anInt8960;
								i_828_ += i_829_;
								i_826_ += anInt8960 * i_829_;
								i_827_ += anInt8962 * i_829_;
								i_825_ += i_829_;
							}
							if ((i_829_ = (i_826_ - anInt8960) / anInt8960) > i_828_)
								i_828_ = i_829_;
							if ((i_829_ = i_827_ - (anInt8950 << 12)) >= 0) {
								i_829_ = (anInt8962 - i_829_) / anInt8962;
								i_828_ += i_829_;
								i_826_ += anInt8960 * i_829_;
								i_827_ += anInt8962 * i_829_;
								i_825_ += i_829_;
							}
							if ((i_829_ = (i_827_ - anInt8962) / anInt8962) > i_828_)
								i_828_ = i_829_;
							int i_830_ = is[i_824_] - i;
							int i_831_ = -is_764_[i_824_];
							int i_832_ = i_830_ - (i_825_ - anInt8959);
							if (i_832_ > 0) {
								i_825_ += i_832_;
								i_828_ += i_832_;
								i_826_ += anInt8960 * i_832_;
								i_827_ += anInt8962 * i_832_;
							} else
								i_831_ -= i_832_;
							if (i_828_ < i_831_)
								i_828_ = i_831_;
							for (/**/; i_828_ < 0; i_828_++) {
								int i_833_ = (anIntArray11346[(i_827_ >> 12) * anInt8945 + (i_826_ >> 12)]);
								int i_834_ = i_833_ >>> 24;
								int i_835_ = 256 - i_834_;
								int i_836_ = is_766_[i_825_];
								is_766_[i_825_++] = ((((i_833_ & 0xff00ff) * i_834_ + (i_836_ & 0xff00ff) * i_835_) & ~0xff00ff) + (((i_833_ & 0xff00) * i_834_ + (i_836_ & 0xff00) * i_835_) & 0xff0000)) >> 8;
								i_826_ += anInt8960;
								i_827_ += anInt8962;
							}
						}
						i_823_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_837_ = anInt8957;
					while (i_837_ < 0) {
						int i_838_ = i_837_ + i_765_;
						if (i_838_ >= 0) {
							if (i_838_ >= is.length)
								break;
							int i_839_ = anInt8959;
							int i_840_ = anInt8966 + anInt8968;
							int i_841_ = anInt8967 + anInt8969;
							int i_842_ = anInt8955;
							int i_843_;
							if ((i_843_ = i_840_ - (anInt8945 << 12)) >= 0) {
								i_843_ = (anInt8960 - i_843_) / anInt8960;
								i_842_ += i_843_;
								i_840_ += anInt8960 * i_843_;
								i_841_ += anInt8962 * i_843_;
								i_839_ += i_843_;
							}
							if ((i_843_ = (i_840_ - anInt8960) / anInt8960) > i_842_)
								i_842_ = i_843_;
							if (i_841_ < 0) {
								i_843_ = (anInt8962 - 1 - i_841_) / anInt8962;
								i_842_ += i_843_;
								i_840_ += anInt8960 * i_843_;
								i_841_ += anInt8962 * i_843_;
								i_839_ += i_843_;
							}
							if ((i_843_ = (1 + i_841_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_842_)
								i_842_ = i_843_;
							int i_844_ = is[i_838_] - i;
							int i_845_ = -is_764_[i_838_];
							int i_846_ = i_844_ - (i_839_ - anInt8959);
							if (i_846_ > 0) {
								i_839_ += i_846_;
								i_842_ += i_846_;
								i_840_ += anInt8960 * i_846_;
								i_841_ += anInt8962 * i_846_;
							} else
								i_845_ -= i_846_;
							if (i_842_ < i_845_)
								i_842_ = i_845_;
							for (/**/; i_842_ < 0; i_842_++) {
								int i_847_ = (anIntArray11346[(i_841_ >> 12) * anInt8945 + (i_840_ >> 12)]);
								int i_848_ = i_847_ >>> 24;
								int i_849_ = 256 - i_848_;
								int i_850_ = is_766_[i_839_];
								is_766_[i_839_++] = ((((i_847_ & 0xff00ff) * i_848_ + (i_850_ & 0xff00ff) * i_849_) & ~0xff00ff) + (((i_847_ & 0xff00) * i_848_ + (i_850_ & 0xff00) * i_849_) & 0xff0000)) >> 8;
								i_840_ += anInt8960;
								i_841_ += anInt8962;
							}
						}
						i_837_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_851_ = anInt8957;
				while (i_851_ < 0) {
					int i_852_ = i_851_ + i_765_;
					if (i_852_ >= 0) {
						if (i_852_ >= is.length)
							break;
						int i_853_ = anInt8959;
						int i_854_ = anInt8966 + anInt8968;
						int i_855_ = anInt8967;
						int i_856_ = anInt8955;
						if (i_855_ >= 0 && i_855_ - (anInt8950 << 12) < 0) {
							if (i_854_ < 0) {
								int i_857_ = (anInt8960 - 1 - i_854_) / anInt8960;
								i_856_ += i_857_;
								i_854_ += anInt8960 * i_857_;
								i_853_ += i_857_;
							}
							int i_858_;
							if ((i_858_ = (1 + i_854_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_856_)
								i_856_ = i_858_;
							int i_859_ = is[i_852_] - i;
							int i_860_ = -is_764_[i_852_];
							int i_861_ = i_859_ - (i_853_ - anInt8959);
							if (i_861_ > 0) {
								i_853_ += i_861_;
								i_856_ += i_861_;
								i_854_ += anInt8960 * i_861_;
								i_855_ += anInt8962 * i_861_;
							} else
								i_860_ -= i_861_;
							if (i_856_ < i_860_)
								i_856_ = i_860_;
							for (/**/; i_856_ < 0; i_856_++) {
								int i_862_ = (anIntArray11346[(i_855_ >> 12) * anInt8945 + (i_854_ >> 12)]);
								int i_863_ = i_862_ >>> 24;
								int i_864_ = 256 - i_863_;
								int i_865_ = is_766_[i_853_];
								is_766_[i_853_++] = ((((i_862_ & 0xff00ff) * i_863_ + (i_865_ & 0xff00ff) * i_864_) & ~0xff00ff) + (((i_862_ & 0xff00) * i_863_ + (i_865_ & 0xff00) * i_864_) & 0xff0000)) >> 8;
								i_854_ += anInt8960;
							}
						}
					}
					i_851_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				int i_866_ = anInt8957;
				while (i_866_ < 0) {
					int i_867_ = i_866_ + i_765_;
					if (i_867_ >= 0) {
						if (i_867_ >= is.length)
							break;
						int i_868_ = anInt8959;
						int i_869_ = anInt8966 + anInt8968;
						int i_870_ = anInt8967 + anInt8969;
						int i_871_ = anInt8955;
						if (i_869_ < 0) {
							int i_872_ = (anInt8960 - 1 - i_869_) / anInt8960;
							i_871_ += i_872_;
							i_869_ += anInt8960 * i_872_;
							i_870_ += anInt8962 * i_872_;
							i_868_ += i_872_;
						}
						int i_873_;
						if ((i_873_ = (1 + i_869_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_871_)
							i_871_ = i_873_;
						if ((i_873_ = i_870_ - (anInt8950 << 12)) >= 0) {
							i_873_ = (anInt8962 - i_873_) / anInt8962;
							i_871_ += i_873_;
							i_869_ += anInt8960 * i_873_;
							i_870_ += anInt8962 * i_873_;
							i_868_ += i_873_;
						}
						if ((i_873_ = (i_870_ - anInt8962) / anInt8962) > i_871_)
							i_871_ = i_873_;
						int i_874_ = is[i_867_] - i;
						int i_875_ = -is_764_[i_867_];
						int i_876_ = i_874_ - (i_868_ - anInt8959);
						if (i_876_ > 0) {
							i_868_ += i_876_;
							i_871_ += i_876_;
							i_869_ += anInt8960 * i_876_;
							i_870_ += anInt8962 * i_876_;
						} else
							i_875_ -= i_876_;
						if (i_871_ < i_875_)
							i_871_ = i_875_;
						for (/**/; i_871_ < 0; i_871_++) {
							int i_877_ = (anIntArray11346[(i_870_ >> 12) * anInt8945 + (i_869_ >> 12)]);
							int i_878_ = i_877_ >>> 24;
							int i_879_ = 256 - i_878_;
							int i_880_ = is_766_[i_868_];
							is_766_[i_868_++] = ((((i_877_ & 0xff00ff) * i_878_ + (i_880_ & 0xff00ff) * i_879_) & ~0xff00ff) + (((i_877_ & 0xff00) * i_878_ + (i_880_ & 0xff00) * i_879_) & 0xff0000)) >> 8;
							i_869_ += anInt8960;
							i_870_ += anInt8962;
						}
					}
					i_866_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				int i_881_ = anInt8957;
				while (i_881_ < 0) {
					int i_882_ = i_881_ + i_765_;
					if (i_882_ >= 0) {
						if (i_882_ >= is.length)
							break;
						int i_883_ = anInt8959;
						int i_884_ = anInt8966 + anInt8968;
						int i_885_ = anInt8967 + anInt8969;
						int i_886_ = anInt8955;
						if (i_884_ < 0) {
							int i_887_ = (anInt8960 - 1 - i_884_) / anInt8960;
							i_886_ += i_887_;
							i_884_ += anInt8960 * i_887_;
							i_885_ += anInt8962 * i_887_;
							i_883_ += i_887_;
						}
						int i_888_;
						if ((i_888_ = (1 + i_884_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_886_)
							i_886_ = i_888_;
						if (i_885_ < 0) {
							i_888_ = (anInt8962 - 1 - i_885_) / anInt8962;
							i_886_ += i_888_;
							i_884_ += anInt8960 * i_888_;
							i_885_ += anInt8962 * i_888_;
							i_883_ += i_888_;
						}
						if ((i_888_ = (1 + i_885_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_886_)
							i_886_ = i_888_;
						int i_889_ = is[i_882_] - i;
						int i_890_ = -is_764_[i_882_];
						int i_891_ = i_889_ - (i_883_ - anInt8959);
						if (i_891_ > 0) {
							i_883_ += i_891_;
							i_886_ += i_891_;
							i_884_ += anInt8960 * i_891_;
							i_885_ += anInt8962 * i_891_;
						} else
							i_890_ -= i_891_;
						if (i_886_ < i_890_)
							i_886_ = i_890_;
						for (/**/; i_886_ < 0; i_886_++) {
							int i_892_ = (anIntArray11346[(i_885_ >> 12) * anInt8945 + (i_884_ >> 12)]);
							int i_893_ = i_892_ >>> 24;
							int i_894_ = 256 - i_893_;
							int i_895_ = is_766_[i_883_];
							is_766_[i_883_++] = ((((i_892_ & 0xff00ff) * i_893_ + (i_895_ & 0xff00ff) * i_894_) & ~0xff00ff) + (((i_892_ & 0xff00) * i_893_ + (i_895_ & 0xff00) * i_894_) & 0xff0000)) >> 8;
							i_884_ += anInt8960;
							i_885_ += anInt8962;
						}
					}
					i_881_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	void method10510(int i, int i_896_, int[] is, int i_897_, int i_898_) {
		if (i_898_ == 0) {
			if (i_897_ == 1)
				is[i_896_] = anIntArray11346[i];
			else if (i_897_ == 0) {
				int i_899_ = anIntArray11346[i++];
				int i_900_ = (i_899_ & 0xff0000) * anInt8973 & ~0xffffff;
				int i_901_ = (i_899_ & 0xff00) * anInt8974 & 0xff0000;
				int i_902_ = (i_899_ & 0xff) * anInt8975 & 0xff00;
				is[i_896_] = (i_900_ | i_901_ | i_902_) >>> 8;
			} else if (i_897_ == 3) {
				int i_903_ = anIntArray11346[i++];
				int i_904_ = anInt8944;
				int i_905_ = i_903_ + i_904_;
				int i_906_ = (i_903_ & 0xff00ff) + (i_904_ & 0xff00ff);
				int i_907_ = (i_906_ & 0x1000100) + (i_905_ - i_906_ & 0x10000);
				is[i_896_] = i_905_ - i_907_ | i_907_ - (i_907_ >>> 8);
			} else if (i_897_ == 2) {
				int i_908_ = anIntArray11346[i];
				int i_909_ = (i_908_ & 0xff00ff) * anInt8965 & ~0xff00ff;
				int i_910_ = (i_908_ & 0xff00) * anInt8965 & 0xff0000;
				is[i_896_] = ((i_909_ | i_910_) >>> 8) + anInt8978;
			} else
				throw new IllegalArgumentException();
		} else if (i_898_ == 1) {
			if (i_897_ == 1) {
				int i_911_ = anIntArray11346[i];
				int i_912_ = i_911_ >>> 24;
				int i_913_ = 256 - i_912_;
				int i_914_ = is[i_896_];
				is[i_896_] = ((((i_911_ & 0xff00ff) * i_912_ + (i_914_ & 0xff00ff) * i_913_) & ~0xff00ff) + (((i_911_ & 0xff00) * i_912_ + (i_914_ & 0xff00) * i_913_) & 0xff0000)) >> 8;
			} else if (i_897_ == 0) {
				int i_915_ = anIntArray11346[i];
				int i_916_ = (i_915_ >>> 24) * anInt8965 >> 8;
				int i_917_ = 256 - i_916_;
				if ((anInt8944 & 0xffffff) == 16777215) {
					int i_918_ = is[i_896_];
					is[i_896_] = ((((i_915_ & 0xff00ff) * i_916_ + (i_918_ & 0xff00ff) * i_917_) & ~0xff00ff) + (((i_915_ & 0xff00) * i_916_ + (i_918_ & 0xff00) * i_917_) & 0xff0000)) >> 8;
				} else if (i_916_ != 255) {
					int i_919_ = (i_915_ & 0xff0000) * anInt8973 & ~0xffffff;
					int i_920_ = (i_915_ & 0xff00) * anInt8974 & 0xff0000;
					int i_921_ = (i_915_ & 0xff) * anInt8975 & 0xff00;
					i_915_ = (i_919_ | i_920_ | i_921_) >>> 8;
					int i_922_ = is[i_896_];
					is[i_896_] = ((((i_915_ & 0xff00ff) * i_916_ + (i_922_ & 0xff00ff) * i_917_) & ~0xff00ff) + (((i_915_ & 0xff00) * i_916_ + (i_922_ & 0xff00) * i_917_) & 0xff0000)) >> 8;
				} else {
					int i_923_ = (i_915_ & 0xff0000) * anInt8973 & ~0xffffff;
					int i_924_ = (i_915_ & 0xff00) * anInt8974 & 0xff0000;
					int i_925_ = (i_915_ & 0xff) * anInt8975 & 0xff00;
					is[i_896_] = (i_923_ | i_924_ | i_925_) >>> 8;
				}
			} else if (i_897_ == 3) {
				int i_926_ = anIntArray11346[i];
				int i_927_ = anInt8944;
				int i_928_ = i_926_ + i_927_;
				int i_929_ = (i_926_ & 0xff00ff) + (i_927_ & 0xff00ff);
				int i_930_ = (i_929_ & 0x1000100) + (i_928_ - i_929_ & 0x10000);
				i_930_ = i_928_ - i_930_ | i_930_ - (i_930_ >>> 8);
				int i_931_ = (i_926_ >>> 24) * anInt8965 >> 8;
				int i_932_ = 256 - i_931_;
				if (i_931_ != 255) {
					i_926_ = i_930_;
					i_930_ = is[i_896_];
					i_930_ = ((((i_926_ & 0xff00ff) * i_931_ + (i_930_ & 0xff00ff) * i_932_) & ~0xff00ff) + (((i_926_ & 0xff00) * i_931_ + (i_930_ & 0xff00) * i_932_) & 0xff0000)) >> 8;
				}
				is[i_896_] = i_930_;
			} else if (i_897_ == 2) {
				int i_933_ = anIntArray11346[i];
				int i_934_ = i_933_ >>> 24;
				int i_935_ = 256 - i_934_;
				int i_936_ = (i_933_ & 0xff00ff) * anInt8965 & ~0xff00ff;
				int i_937_ = (i_933_ & 0xff00) * anInt8965 & 0xff0000;
				i_933_ = ((i_936_ | i_937_) >>> 8) + anInt8978;
				int i_938_ = is[i_896_];
				is[i_896_] = ((((i_933_ & 0xff00ff) * i_934_ + (i_938_ & 0xff00ff) * i_935_) & ~0xff00ff) + (((i_933_ & 0xff00) * i_934_ + (i_938_ & 0xff00) * i_935_) & 0xff0000)) >> 8;
			} else
				throw new IllegalArgumentException();
		} else if (i_898_ == 2) {
			if (i_897_ == 1) {
				int i_939_ = anIntArray11346[i];
				int i_940_ = is[i_896_];
				int i_941_ = i_939_ + i_940_;
				int i_942_ = (i_939_ & 0xff00ff) + (i_940_ & 0xff00ff);
				i_940_ = (i_942_ & 0x1000100) + (i_941_ - i_942_ & 0x10000);
				is[i_896_] = i_941_ - i_940_ | i_940_ - (i_940_ >>> 8);
			} else if (i_897_ == 0) {
				int i_943_ = anIntArray11346[i];
				int i_944_ = (i_943_ & 0xff0000) * anInt8973 & ~0xffffff;
				int i_945_ = (i_943_ & 0xff00) * anInt8974 & 0xff0000;
				int i_946_ = (i_943_ & 0xff) * anInt8975 & 0xff00;
				i_943_ = (i_944_ | i_945_ | i_946_) >>> 8;
				int i_947_ = is[i_896_];
				int i_948_ = i_943_ + i_947_;
				int i_949_ = (i_943_ & 0xff00ff) + (i_947_ & 0xff00ff);
				i_947_ = (i_949_ & 0x1000100) + (i_948_ - i_949_ & 0x10000);
				is[i_896_] = i_948_ - i_947_ | i_947_ - (i_947_ >>> 8);
			} else if (i_897_ == 3) {
				int i_950_ = anIntArray11346[i];
				int i_951_ = anInt8944;
				int i_952_ = i_950_ + i_951_;
				int i_953_ = (i_950_ & 0xff00ff) + (i_951_ & 0xff00ff);
				int i_954_ = (i_953_ & 0x1000100) + (i_952_ - i_953_ & 0x10000);
				i_950_ = i_952_ - i_954_ | i_954_ - (i_954_ >>> 8);
				i_954_ = is[i_896_];
				i_952_ = i_950_ + i_954_;
				i_953_ = (i_950_ & 0xff00ff) + (i_954_ & 0xff00ff);
				i_954_ = (i_953_ & 0x1000100) + (i_952_ - i_953_ & 0x10000);
				is[i_896_] = i_952_ - i_954_ | i_954_ - (i_954_ >>> 8);
			} else if (i_897_ == 2) {
				int i_955_ = anIntArray11346[i];
				int i_956_ = (i_955_ & 0xff00ff) * anInt8965 & ~0xff00ff;
				int i_957_ = (i_955_ & 0xff00) * anInt8965 & 0xff0000;
				i_955_ = ((i_956_ | i_957_) >>> 8) + anInt8978;
				int i_958_ = is[i_896_];
				int i_959_ = i_955_ + i_958_;
				int i_960_ = (i_955_ & 0xff00ff) + (i_958_ & 0xff00ff);
				i_958_ = (i_960_ & 0x1000100) + (i_959_ - i_960_ & 0x10000);
				is[i_896_] = i_959_ - i_958_ | i_958_ - (i_958_ >>> 8);
			}
		} else
			throw new IllegalArgumentException();
	}

	public Interface22 method1784() {
		return new Class104(anInt8945, anInt8950, anIntArray11346);
	}

	public void method1757(int i, int i_961_, int i_962_, int i_963_, int[] is, int i_964_, int i_965_) {
		i_965_ -= i_962_;
		for (int i_966_ = 0; i_966_ < i_963_; i_966_++) {
			int i_967_ = (i_961_ + i_966_) * i_962_ + i;
			for (int i_968_ = 0; i_968_ < i_962_; i_968_++)
				anIntArray11346[i_967_ + i_968_] = is[i_964_++];
			i_964_ += i_965_;
		}
	}

	public void method1745(int i, int i_969_, int i_970_, int i_971_, int[] is, int i_972_, int i_973_) {
		i_973_ -= i_970_;
		for (int i_974_ = 0; i_974_ < i_971_; i_974_++) {
			int i_975_ = (i_969_ + i_974_) * i_970_ + i;
			for (int i_976_ = 0; i_976_ < i_970_; i_976_++)
				anIntArray11346[i_975_ + i_976_] = is[i_972_++];
			i_972_ += i_973_;
		}
	}

	public void method1729(int i, int i_977_, int i_978_, int i_979_, int i_980_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			int i_981_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			i += anInt8977;
			i_977_ += anInt8947;
			int i_982_ = i_977_ * i_981_ + i;
			int i_983_ = 0;
			int i_984_ = anInt8950;
			int i_985_ = anInt8945;
			int i_986_ = i_981_ - i_985_;
			int i_987_ = 0;
			if (i_977_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_988_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_977_;
				i_984_ -= i_988_;
				i_977_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_983_ += i_988_ * i_985_;
				i_982_ += i_988_ * i_981_;
			}
			if (i_977_ + i_984_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_984_ -= (i_977_ + i_984_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_989_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_985_ -= i_989_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_983_ += i_989_;
				i_982_ += i_989_;
				i_987_ += i_989_;
				i_986_ += i_989_;
			}
			if (i + i_985_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_990_ = i + i_985_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_985_ -= i_990_;
				i_987_ += i_990_;
				i_986_ += i_990_;
			}
			if (i_985_ > 0 && i_984_ > 0) {
				if (i_980_ == 0) {
					if (i_978_ == 1) {
						for (int i_991_ = -i_984_; i_991_ < 0; i_991_++) {
							int i_992_ = i_982_ + i_985_ - 3;
							while (i_982_ < i_992_) {
								is[i_982_++] = anIntArray11346[i_983_++];
								is[i_982_++] = anIntArray11346[i_983_++];
								is[i_982_++] = anIntArray11346[i_983_++];
								is[i_982_++] = anIntArray11346[i_983_++];
							}
							i_992_ += 3;
							while (i_982_ < i_992_)
								is[i_982_++] = anIntArray11346[i_983_++];
							i_982_ += i_986_;
							i_983_ += i_987_;
						}
					} else if (i_978_ == 0) {
						int i_993_ = (i_979_ & 0xff0000) >> 16;
						int i_994_ = (i_979_ & 0xff00) >> 8;
						int i_995_ = i_979_ & 0xff;
						for (int i_996_ = -i_984_; i_996_ < 0; i_996_++) {
							for (int i_997_ = -i_985_; i_997_ < 0; i_997_++) {
								int i_998_ = anIntArray11346[i_983_++];
								int i_999_ = (i_998_ & 0xff0000) * i_993_ & ~0xffffff;
								int i_1000_ = (i_998_ & 0xff00) * i_994_ & 0xff0000;
								int i_1001_ = (i_998_ & 0xff) * i_995_ & 0xff00;
								is[i_982_++] = (i_999_ | i_1000_ | i_1001_) >>> 8;
							}
							i_982_ += i_986_;
							i_983_ += i_987_;
						}
					} else if (i_978_ == 3) {
						for (int i_1002_ = -i_984_; i_1002_ < 0; i_1002_++) {
							for (int i_1003_ = -i_985_; i_1003_ < 0; i_1003_++) {
								int i_1004_ = anIntArray11346[i_983_++];
								int i_1005_ = i_1004_ + i_979_;
								int i_1006_ = ((i_1004_ & 0xff00ff) + (i_979_ & 0xff00ff));
								int i_1007_ = ((i_1006_ & 0x1000100) + (i_1005_ - i_1006_ & 0x10000));
								is[i_982_++] = i_1005_ - i_1007_ | i_1007_ - (i_1007_ >>> 8);
							}
							i_982_ += i_986_;
							i_983_ += i_987_;
						}
					} else if (i_978_ == 2) {
						int i_1008_ = i_979_ >>> 24;
						int i_1009_ = 256 - i_1008_;
						int i_1010_ = (i_979_ & 0xff00ff) * i_1009_ & ~0xff00ff;
						int i_1011_ = (i_979_ & 0xff00) * i_1009_ & 0xff0000;
						i_979_ = (i_1010_ | i_1011_) >>> 8;
						for (int i_1012_ = -i_984_; i_1012_ < 0; i_1012_++) {
							for (int i_1013_ = -i_985_; i_1013_ < 0; i_1013_++) {
								int i_1014_ = anIntArray11346[i_983_++];
								i_1010_ = ((i_1014_ & 0xff00ff) * i_1008_ & ~0xff00ff);
								i_1011_ = (i_1014_ & 0xff00) * i_1008_ & 0xff0000;
								is[i_982_++] = ((i_1010_ | i_1011_) >>> 8) + i_979_;
							}
							i_982_ += i_986_;
							i_983_ += i_987_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_980_ == 1) {
					if (i_978_ == 1) {
						for (int i_1015_ = -i_984_; i_1015_ < 0; i_1015_++) {
							for (int i_1016_ = -i_985_; i_1016_ < 0; i_1016_++) {
								int i_1017_ = anIntArray11346[i_983_++];
								int i_1018_ = i_1017_ >>> 24;
								int i_1019_ = 256 - i_1018_;
								int i_1020_ = is[i_982_];
								is[i_982_++] = (((((i_1017_ & 0xff00ff) * i_1018_ + (i_1020_ & 0xff00ff) * i_1019_) & ~0xff00ff) >> 8) + (((((i_1017_ & ~0xff00ff) >>> 8) * i_1018_) + (((i_1020_ & ~0xff00ff) >>> 8) * i_1019_)) & ~0xff00ff));
							}
							i_982_ += i_986_;
							i_983_ += i_987_;
						}
					} else if (i_978_ == 0) {
						if ((i_979_ & 0xffffff) == 16777215) {
							for (int i_1021_ = -i_984_; i_1021_ < 0; i_1021_++) {
								for (int i_1022_ = -i_985_; i_1022_ < 0; i_1022_++) {
									int i_1023_ = anIntArray11346[i_983_++];
									int i_1024_ = ((i_1023_ >>> 24) * (i_979_ >>> 24) >> 8);
									int i_1025_ = 256 - i_1024_;
									int i_1026_ = is[i_982_];
									is[i_982_++] = ((((i_1023_ & 0xff00ff) * i_1024_ + (i_1026_ & 0xff00ff) * i_1025_) & ~0xff00ff) + (((i_1023_ & 0xff00) * i_1024_ + (i_1026_ & 0xff00) * i_1025_) & 0xff0000)) >> 8;
								}
								i_982_ += i_986_;
								i_983_ += i_987_;
							}
						} else {
							int i_1027_ = (i_979_ & 0xff0000) >> 16;
							int i_1028_ = (i_979_ & 0xff00) >> 8;
							int i_1029_ = i_979_ & 0xff;
							for (int i_1030_ = -i_984_; i_1030_ < 0; i_1030_++) {
								for (int i_1031_ = -i_985_; i_1031_ < 0; i_1031_++) {
									int i_1032_ = anIntArray11346[i_983_++];
									int i_1033_ = ((i_1032_ >>> 24) * (i_979_ >>> 24) >> 8);
									int i_1034_ = 256 - i_1033_;
									if (i_1033_ != 255) {
										int i_1035_ = ((i_1032_ & 0xff0000) * i_1027_ & ~0xffffff);
										int i_1036_ = ((i_1032_ & 0xff00) * i_1028_ & 0xff0000);
										int i_1037_ = ((i_1032_ & 0xff) * i_1029_ & 0xff00);
										i_1032_ = (i_1035_ | i_1036_ | i_1037_) >>> 8;
										int i_1038_ = is[i_982_];
										is[i_982_++] = ((((i_1032_ & 0xff00ff) * i_1033_ + ((i_1038_ & 0xff00ff) * i_1034_)) & ~0xff00ff) + (((i_1032_ & 0xff00) * i_1033_ + ((i_1038_ & 0xff00) * i_1034_)) & 0xff0000)) >> 8;
									} else {
										int i_1039_ = ((i_1032_ & 0xff0000) * i_1027_ & ~0xffffff);
										int i_1040_ = ((i_1032_ & 0xff00) * i_1028_ & 0xff0000);
										int i_1041_ = ((i_1032_ & 0xff) * i_1029_ & 0xff00);
										is[i_982_++] = (i_1039_ | i_1040_ | i_1041_) >>> 8;
									}
								}
								i_982_ += i_986_;
								i_983_ += i_987_;
							}
						}
					} else if (i_978_ == 3) {
						for (int i_1042_ = -i_984_; i_1042_ < 0; i_1042_++) {
							for (int i_1043_ = -i_985_; i_1043_ < 0; i_1043_++) {
								int i_1044_ = anIntArray11346[i_983_++];
								int i_1045_ = i_1044_ + i_979_;
								int i_1046_ = ((i_1044_ & 0xff00ff) + (i_979_ & 0xff00ff));
								int i_1047_ = ((i_1046_ & 0x1000100) + (i_1045_ - i_1046_ & 0x10000));
								i_1047_ = i_1045_ - i_1047_ | i_1047_ - (i_1047_ >>> 8);
								int i_1048_ = (i_1047_ >>> 24) * (i_979_ >>> 24) >> 8;
								int i_1049_ = 256 - i_1048_;
								if (i_1048_ != 255) {
									i_1044_ = i_1047_;
									i_1047_ = is[i_982_];
									i_1047_ = ((((i_1044_ & 0xff00ff) * i_1048_ + (i_1047_ & 0xff00ff) * i_1049_) & ~0xff00ff) + (((i_1044_ & 0xff00) * i_1048_ + (i_1047_ & 0xff00) * i_1049_) & 0xff0000)) >> 8;
								}
								is[i_982_++] = i_1047_;
							}
							i_982_ += i_986_;
							i_983_ += i_987_;
						}
					} else if (i_978_ == 2) {
						int i_1050_ = i_979_ >>> 24;
						int i_1051_ = 256 - i_1050_;
						int i_1052_ = (i_979_ & 0xff00ff) * i_1051_ & ~0xff00ff;
						int i_1053_ = (i_979_ & 0xff00) * i_1051_ & 0xff0000;
						i_979_ = (i_1052_ | i_1053_) >>> 8;
						for (int i_1054_ = -i_984_; i_1054_ < 0; i_1054_++) {
							for (int i_1055_ = -i_985_; i_1055_ < 0; i_1055_++) {
								int i_1056_ = anIntArray11346[i_983_++];
								int i_1057_ = i_1056_ >>> 24;
								int i_1058_ = 256 - i_1057_;
								i_1052_ = ((i_1056_ & 0xff00ff) * i_1050_ & ~0xff00ff);
								i_1053_ = (i_1056_ & 0xff00) * i_1050_ & 0xff0000;
								i_1056_ = ((i_1052_ | i_1053_) >>> 8) + i_979_;
								int i_1059_ = is[i_982_];
								is[i_982_++] = ((((i_1056_ & 0xff00ff) * i_1057_ + (i_1059_ & 0xff00ff) * i_1058_) & ~0xff00ff) + (((i_1056_ & 0xff00) * i_1057_ + (i_1059_ & 0xff00) * i_1058_) & 0xff0000)) >> 8;
							}
							i_982_ += i_986_;
							i_983_ += i_987_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_980_ == 2) {
					if (i_978_ == 1) {
						for (int i_1060_ = -i_984_; i_1060_ < 0; i_1060_++) {
							for (int i_1061_ = -i_985_; i_1061_ < 0; i_1061_++) {
								int i_1062_ = anIntArray11346[i_983_++];
								if (i_1062_ != 0) {
									int i_1063_ = is[i_982_];
									int i_1064_ = i_1062_ + i_1063_;
									int i_1065_ = ((i_1062_ & 0xff00ff) + (i_1063_ & 0xff00ff));
									i_1063_ = ((i_1065_ & 0x1000100) + (i_1064_ - i_1065_ & 0x10000));
									is[i_982_++] = (i_1064_ - i_1063_ | i_1063_ - (i_1063_ >>> 8));
								} else
									i_982_++;
							}
							i_982_ += i_986_;
							i_983_ += i_987_;
						}
					} else if (i_978_ == 0) {
						int i_1066_ = (i_979_ & 0xff0000) >> 16;
						int i_1067_ = (i_979_ & 0xff00) >> 8;
						int i_1068_ = i_979_ & 0xff;
						for (int i_1069_ = -i_984_; i_1069_ < 0; i_1069_++) {
							for (int i_1070_ = -i_985_; i_1070_ < 0; i_1070_++) {
								int i_1071_ = anIntArray11346[i_983_++];
								if (i_1071_ != 0) {
									int i_1072_ = ((i_1071_ & 0xff0000) * i_1066_ & ~0xffffff);
									int i_1073_ = ((i_1071_ & 0xff00) * i_1067_ & 0xff0000);
									int i_1074_ = (i_1071_ & 0xff) * i_1068_ & 0xff00;
									i_1071_ = (i_1072_ | i_1073_ | i_1074_) >>> 8;
									int i_1075_ = is[i_982_];
									int i_1076_ = i_1071_ + i_1075_;
									int i_1077_ = ((i_1071_ & 0xff00ff) + (i_1075_ & 0xff00ff));
									i_1075_ = ((i_1077_ & 0x1000100) + (i_1076_ - i_1077_ & 0x10000));
									is[i_982_++] = (i_1076_ - i_1075_ | i_1075_ - (i_1075_ >>> 8));
								} else
									i_982_++;
							}
							i_982_ += i_986_;
							i_983_ += i_987_;
						}
					} else if (i_978_ == 3) {
						for (int i_1078_ = -i_984_; i_1078_ < 0; i_1078_++) {
							for (int i_1079_ = -i_985_; i_1079_ < 0; i_1079_++) {
								int i_1080_ = anIntArray11346[i_983_++];
								int i_1081_ = i_1080_ + i_979_;
								int i_1082_ = ((i_1080_ & 0xff00ff) + (i_979_ & 0xff00ff));
								int i_1083_ = ((i_1082_ & 0x1000100) + (i_1081_ - i_1082_ & 0x10000));
								i_1080_ = i_1081_ - i_1083_ | i_1083_ - (i_1083_ >>> 8);
								i_1083_ = is[i_982_];
								i_1081_ = i_1080_ + i_1083_;
								i_1082_ = (i_1080_ & 0xff00ff) + (i_1083_ & 0xff00ff);
								i_1083_ = ((i_1082_ & 0x1000100) + (i_1081_ - i_1082_ & 0x10000));
								is[i_982_++] = i_1081_ - i_1083_ | i_1083_ - (i_1083_ >>> 8);
							}
							i_982_ += i_986_;
							i_983_ += i_987_;
						}
					} else if (i_978_ == 2) {
						int i_1084_ = i_979_ >>> 24;
						int i_1085_ = 256 - i_1084_;
						int i_1086_ = (i_979_ & 0xff00ff) * i_1085_ & ~0xff00ff;
						int i_1087_ = (i_979_ & 0xff00) * i_1085_ & 0xff0000;
						i_979_ = (i_1086_ | i_1087_) >>> 8;
						for (int i_1088_ = -i_984_; i_1088_ < 0; i_1088_++) {
							for (int i_1089_ = -i_985_; i_1089_ < 0; i_1089_++) {
								int i_1090_ = anIntArray11346[i_983_++];
								if (i_1090_ != 0) {
									i_1086_ = ((i_1090_ & 0xff00ff) * i_1084_ & ~0xff00ff);
									i_1087_ = ((i_1090_ & 0xff00) * i_1084_ & 0xff0000);
									i_1090_ = ((i_1086_ | i_1087_) >>> 8) + i_979_;
									int i_1091_ = is[i_982_];
									int i_1092_ = i_1090_ + i_1091_;
									int i_1093_ = ((i_1090_ & 0xff00ff) + (i_1091_ & 0xff00ff));
									i_1091_ = ((i_1093_ & 0x1000100) + (i_1092_ - i_1093_ & 0x10000));
									is[i_982_++] = (i_1092_ - i_1091_ | i_1091_ - (i_1091_ >>> 8));
								} else
									i_982_++;
							}
							i_982_ += i_986_;
							i_983_ += i_987_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method1747(int i, int i_1094_, int i_1095_, int i_1096_, int[] is, int[] is_1097_, int i_1098_, int i_1099_) {
		method10511(i, i_1094_, i_1095_, i_1096_, is, i_1098_, i_1099_);
	}

	public void method1748(int i, int i_1100_, int i_1101_, int i_1102_, int i_1103_, int i_1104_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is == null)
			throw new IllegalStateException("");
		for (int i_1105_ = 0; i_1105_ < i_1102_; i_1105_++) {
			int i_1106_ = (i_1100_ + i_1105_) * i_1101_ + i;
			int i_1107_ = (i_1104_ + i_1105_) * i_1101_ + i_1103_;
			for (int i_1108_ = 0; i_1108_ < i_1101_; i_1108_++)
				anIntArray11346[i_1106_ + i_1108_] = is[i_1107_ + i_1108_] & 0xffffff;
		}
	}

	public void method1742(int i, int i_1109_, int i_1110_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is == null)
			throw new IllegalStateException("");
		if (i_1110_ == 0) {
			for (int i_1111_ = 0; i_1111_ < anInt8950; i_1111_++) {
				int i_1112_ = i_1111_ * anInt8945;
				int i_1113_ = ((i_1109_ + i_1111_) * (aClass167_Sub1_8946.anInt8997 * -570111553) + i);
				for (int i_1114_ = 0; i_1114_ < anInt8945; i_1114_++)
					anIntArray11346[i_1112_ + i_1114_] = (anIntArray11346[i_1112_ + i_1114_] & 0xffffff | is[i_1113_ + i_1114_] << 8 & ~0xffffff);
			}
		} else if (i_1110_ == 1) {
			for (int i_1115_ = 0; i_1115_ < anInt8950; i_1115_++) {
				int i_1116_ = i_1115_ * anInt8945;
				int i_1117_ = ((i_1109_ + i_1115_) * (aClass167_Sub1_8946.anInt8997 * -570111553) + i);
				for (int i_1118_ = 0; i_1118_ < anInt8945; i_1118_++)
					anIntArray11346[i_1116_ + i_1118_] = (anIntArray11346[i_1116_ + i_1118_] & 0xffffff | is[i_1117_ + i_1118_] << 16 & ~0xffffff);
			}
		} else if (i_1110_ == 2) {
			for (int i_1119_ = 0; i_1119_ < anInt8950; i_1119_++) {
				int i_1120_ = i_1119_ * anInt8945;
				int i_1121_ = ((i_1109_ + i_1119_) * (aClass167_Sub1_8946.anInt8997 * -570111553) + i);
				for (int i_1122_ = 0; i_1122_ < anInt8945; i_1122_++)
					anIntArray11346[i_1120_ + i_1122_] = (anIntArray11346[i_1120_ + i_1122_] & 0xffffff | is[i_1121_ + i_1122_] << 24 & ~0xffffff);
			}
		} else if (i_1110_ == 3) {
			for (int i_1123_ = 0; i_1123_ < anInt8950; i_1123_++) {
				int i_1124_ = i_1123_ * anInt8945;
				int i_1125_ = ((i_1109_ + i_1123_) * (aClass167_Sub1_8946.anInt8997 * -570111553) + i);
				for (int i_1126_ = 0; i_1126_ < anInt8945; i_1126_++)
					anIntArray11346[i_1124_ + i_1126_] = (anIntArray11346[i_1124_ + i_1126_] & 0xffffff | (is[i_1125_ + i_1126_] != 0 ? -16777216 : 0));
			}
		}
	}

	public void method1783(int i, int i_1127_, int i_1128_, int i_1129_, int[] is, int i_1130_, int i_1131_) {
		i_1131_ -= i_1128_;
		for (int i_1132_ = 0; i_1132_ < i_1129_; i_1132_++) {
			int i_1133_ = (i_1127_ + i_1132_) * i_1128_ + i;
			for (int i_1134_ = 0; i_1134_ < i_1128_; i_1134_++)
				anIntArray11346[i_1133_ + i_1134_] = is[i_1130_++];
			i_1130_ += i_1131_;
		}
	}

	public void method1751(int i, int i_1135_, int i_1136_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is == null)
			throw new IllegalStateException("");
		if (i_1136_ == 0) {
			for (int i_1137_ = 0; i_1137_ < anInt8950; i_1137_++) {
				int i_1138_ = i_1137_ * anInt8945;
				int i_1139_ = ((i_1135_ + i_1137_) * (aClass167_Sub1_8946.anInt8997 * -570111553) + i);
				for (int i_1140_ = 0; i_1140_ < anInt8945; i_1140_++)
					anIntArray11346[i_1138_ + i_1140_] = (anIntArray11346[i_1138_ + i_1140_] & 0xffffff | is[i_1139_ + i_1140_] << 8 & ~0xffffff);
			}
		} else if (i_1136_ == 1) {
			for (int i_1141_ = 0; i_1141_ < anInt8950; i_1141_++) {
				int i_1142_ = i_1141_ * anInt8945;
				int i_1143_ = ((i_1135_ + i_1141_) * (aClass167_Sub1_8946.anInt8997 * -570111553) + i);
				for (int i_1144_ = 0; i_1144_ < anInt8945; i_1144_++)
					anIntArray11346[i_1142_ + i_1144_] = (anIntArray11346[i_1142_ + i_1144_] & 0xffffff | is[i_1143_ + i_1144_] << 16 & ~0xffffff);
			}
		} else if (i_1136_ == 2) {
			for (int i_1145_ = 0; i_1145_ < anInt8950; i_1145_++) {
				int i_1146_ = i_1145_ * anInt8945;
				int i_1147_ = ((i_1135_ + i_1145_) * (aClass167_Sub1_8946.anInt8997 * -570111553) + i);
				for (int i_1148_ = 0; i_1148_ < anInt8945; i_1148_++)
					anIntArray11346[i_1146_ + i_1148_] = (anIntArray11346[i_1146_ + i_1148_] & 0xffffff | is[i_1147_ + i_1148_] << 24 & ~0xffffff);
			}
		} else if (i_1136_ == 3) {
			for (int i_1149_ = 0; i_1149_ < anInt8950; i_1149_++) {
				int i_1150_ = i_1149_ * anInt8945;
				int i_1151_ = ((i_1135_ + i_1149_) * (aClass167_Sub1_8946.anInt8997 * -570111553) + i);
				for (int i_1152_ = 0; i_1152_ < anInt8945; i_1152_++)
					anIntArray11346[i_1150_ + i_1152_] = (anIntArray11346[i_1150_ + i_1152_] & 0xffffff | (is[i_1151_ + i_1152_] != 0 ? -16777216 : 0));
			}
		}
	}

	public Interface22 method1779() {
		return new Class104(anInt8945, anInt8950, anIntArray11346);
	}

	public void method1760(int i, int i_1153_, Class161 class161, int i_1154_, int i_1155_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			i += anInt8977;
			i_1153_ += anInt8947;
			int i_1156_ = 0;
			int i_1157_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			int i_1158_ = anInt8945;
			int i_1159_ = anInt8950;
			int i_1160_ = i_1157_ - i_1158_;
			int i_1161_ = 0;
			int i_1162_ = i + i_1153_ * i_1157_;
			if (i_1153_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_1163_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_1153_;
				i_1159_ -= i_1163_;
				i_1153_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_1156_ += i_1163_ * i_1158_;
				i_1162_ += i_1163_ * i_1157_;
			}
			if (i_1153_ + i_1159_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_1159_ -= (i_1153_ + i_1159_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_1164_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_1158_ -= i_1164_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_1156_ += i_1164_;
				i_1162_ += i_1164_;
				i_1161_ += i_1164_;
				i_1160_ += i_1164_;
			}
			if (i + i_1158_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_1165_ = i + i_1158_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_1158_ -= i_1165_;
				i_1161_ += i_1165_;
				i_1160_ += i_1165_;
			}
			if (i_1158_ > 0 && i_1159_ > 0) {
				Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
				int[] is_1166_ = class161_sub2.anIntArray9444;
				int[] is_1167_ = class161_sub2.anIntArray9445;
				int i_1168_ = i_1153_;
				if (i_1155_ > i_1168_) {
					i_1168_ = i_1155_;
					i_1162_ += (i_1155_ - i_1153_) * i_1157_;
					i_1156_ += (i_1155_ - i_1153_) * anInt8945;
				}
				int i_1169_ = (i_1155_ + is_1166_.length < i_1153_ + i_1159_ ? i_1155_ + is_1166_.length : i_1153_ + i_1159_);
				for (int i_1170_ = i_1168_; i_1170_ < i_1169_; i_1170_++) {
					int i_1171_ = is_1166_[i_1170_ - i_1155_] + i_1154_;
					int i_1172_ = is_1167_[i_1170_ - i_1155_];
					int i_1173_ = i_1158_;
					if (i > i_1171_) {
						int i_1174_ = i - i_1171_;
						if (i_1174_ >= i_1172_) {
							i_1156_ += i_1158_ + i_1161_;
							i_1162_ += i_1158_ + i_1160_;
							continue;
						}
						i_1172_ -= i_1174_;
					} else {
						int i_1175_ = i_1171_ - i;
						if (i_1175_ >= i_1158_) {
							i_1156_ += i_1158_ + i_1161_;
							i_1162_ += i_1158_ + i_1160_;
							continue;
						}
						i_1156_ += i_1175_;
						i_1173_ -= i_1175_;
						i_1162_ += i_1175_;
					}
					int i_1176_ = 0;
					if (i_1173_ < i_1172_)
						i_1172_ = i_1173_;
					else
						i_1176_ = i_1173_ - i_1172_;
					for (int i_1177_ = -i_1172_; i_1177_ < 0; i_1177_++) {
						int i_1178_ = anIntArray11346[i_1156_++];
						int i_1179_ = i_1178_ >>> 24;
						int i_1180_ = 256 - i_1179_;
						int i_1181_ = is[i_1162_];
						is[i_1162_++] = ((((i_1178_ & 0xff00ff) * i_1179_ + (i_1181_ & 0xff00ff) * i_1180_) & ~0xff00ff) + (((i_1178_ & 0xff00) * i_1179_ + (i_1181_ & 0xff00) * i_1180_) & 0xff0000)) >> 8;
					}
					i_1156_ += i_1176_ + i_1161_;
					i_1162_ += i_1176_ + i_1160_;
				}
			}
		}
	}

	void method10511(int i, int i_1182_, int i_1183_, int i_1184_, int[] is, int i_1185_, int i_1186_) {
		i_1186_ -= i_1183_;
		for (int i_1187_ = 0; i_1187_ < i_1184_; i_1187_++) {
			int i_1188_ = (i_1182_ + i_1187_) * i_1183_ + i;
			for (int i_1189_ = 0; i_1189_ < i_1183_; i_1189_++)
				is[i_1185_++] = anIntArray11346[i_1188_ + i_1189_];
			i_1185_ += i_1186_;
		}
	}

	public void method1763(int i, int i_1190_, int i_1191_, int i_1192_, int i_1193_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			int i_1194_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			i += anInt8977;
			i_1190_ += anInt8947;
			int i_1195_ = i_1190_ * i_1194_ + i;
			int i_1196_ = 0;
			int i_1197_ = anInt8950;
			int i_1198_ = anInt8945;
			int i_1199_ = i_1194_ - i_1198_;
			int i_1200_ = 0;
			if (i_1190_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_1201_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_1190_;
				i_1197_ -= i_1201_;
				i_1190_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_1196_ += i_1201_ * i_1198_;
				i_1195_ += i_1201_ * i_1194_;
			}
			if (i_1190_ + i_1197_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_1197_ -= (i_1190_ + i_1197_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_1202_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_1198_ -= i_1202_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_1196_ += i_1202_;
				i_1195_ += i_1202_;
				i_1200_ += i_1202_;
				i_1199_ += i_1202_;
			}
			if (i + i_1198_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_1203_ = i + i_1198_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_1198_ -= i_1203_;
				i_1200_ += i_1203_;
				i_1199_ += i_1203_;
			}
			if (i_1198_ > 0 && i_1197_ > 0) {
				if (i_1193_ == 0) {
					if (i_1191_ == 1) {
						for (int i_1204_ = -i_1197_; i_1204_ < 0; i_1204_++) {
							int i_1205_ = i_1195_ + i_1198_ - 3;
							while (i_1195_ < i_1205_) {
								is[i_1195_++] = anIntArray11346[i_1196_++];
								is[i_1195_++] = anIntArray11346[i_1196_++];
								is[i_1195_++] = anIntArray11346[i_1196_++];
								is[i_1195_++] = anIntArray11346[i_1196_++];
							}
							i_1205_ += 3;
							while (i_1195_ < i_1205_)
								is[i_1195_++] = anIntArray11346[i_1196_++];
							i_1195_ += i_1199_;
							i_1196_ += i_1200_;
						}
					} else if (i_1191_ == 0) {
						int i_1206_ = (i_1192_ & 0xff0000) >> 16;
						int i_1207_ = (i_1192_ & 0xff00) >> 8;
						int i_1208_ = i_1192_ & 0xff;
						for (int i_1209_ = -i_1197_; i_1209_ < 0; i_1209_++) {
							for (int i_1210_ = -i_1198_; i_1210_ < 0; i_1210_++) {
								int i_1211_ = anIntArray11346[i_1196_++];
								int i_1212_ = ((i_1211_ & 0xff0000) * i_1206_ & ~0xffffff);
								int i_1213_ = (i_1211_ & 0xff00) * i_1207_ & 0xff0000;
								int i_1214_ = (i_1211_ & 0xff) * i_1208_ & 0xff00;
								is[i_1195_++] = (i_1212_ | i_1213_ | i_1214_) >>> 8;
							}
							i_1195_ += i_1199_;
							i_1196_ += i_1200_;
						}
					} else if (i_1191_ == 3) {
						for (int i_1215_ = -i_1197_; i_1215_ < 0; i_1215_++) {
							for (int i_1216_ = -i_1198_; i_1216_ < 0; i_1216_++) {
								int i_1217_ = anIntArray11346[i_1196_++];
								int i_1218_ = i_1217_ + i_1192_;
								int i_1219_ = ((i_1217_ & 0xff00ff) + (i_1192_ & 0xff00ff));
								int i_1220_ = ((i_1219_ & 0x1000100) + (i_1218_ - i_1219_ & 0x10000));
								is[i_1195_++] = i_1218_ - i_1220_ | i_1220_ - (i_1220_ >>> 8);
							}
							i_1195_ += i_1199_;
							i_1196_ += i_1200_;
						}
					} else if (i_1191_ == 2) {
						int i_1221_ = i_1192_ >>> 24;
						int i_1222_ = 256 - i_1221_;
						int i_1223_ = (i_1192_ & 0xff00ff) * i_1222_ & ~0xff00ff;
						int i_1224_ = (i_1192_ & 0xff00) * i_1222_ & 0xff0000;
						i_1192_ = (i_1223_ | i_1224_) >>> 8;
						for (int i_1225_ = -i_1197_; i_1225_ < 0; i_1225_++) {
							for (int i_1226_ = -i_1198_; i_1226_ < 0; i_1226_++) {
								int i_1227_ = anIntArray11346[i_1196_++];
								i_1223_ = ((i_1227_ & 0xff00ff) * i_1221_ & ~0xff00ff);
								i_1224_ = (i_1227_ & 0xff00) * i_1221_ & 0xff0000;
								is[i_1195_++] = ((i_1223_ | i_1224_) >>> 8) + i_1192_;
							}
							i_1195_ += i_1199_;
							i_1196_ += i_1200_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1193_ == 1) {
					if (i_1191_ == 1) {
						for (int i_1228_ = -i_1197_; i_1228_ < 0; i_1228_++) {
							for (int i_1229_ = -i_1198_; i_1229_ < 0; i_1229_++) {
								int i_1230_ = anIntArray11346[i_1196_++];
								int i_1231_ = i_1230_ >>> 24;
								int i_1232_ = 256 - i_1231_;
								int i_1233_ = is[i_1195_];
								is[i_1195_++] = (((((i_1230_ & 0xff00ff) * i_1231_ + (i_1233_ & 0xff00ff) * i_1232_) & ~0xff00ff) >> 8) + (((((i_1230_ & ~0xff00ff) >>> 8) * i_1231_) + (((i_1233_ & ~0xff00ff) >>> 8) * i_1232_)) & ~0xff00ff));
							}
							i_1195_ += i_1199_;
							i_1196_ += i_1200_;
						}
					} else if (i_1191_ == 0) {
						if ((i_1192_ & 0xffffff) == 16777215) {
							for (int i_1234_ = -i_1197_; i_1234_ < 0; i_1234_++) {
								for (int i_1235_ = -i_1198_; i_1235_ < 0; i_1235_++) {
									int i_1236_ = anIntArray11346[i_1196_++];
									int i_1237_ = ((i_1236_ >>> 24) * (i_1192_ >>> 24) >> 8);
									int i_1238_ = 256 - i_1237_;
									int i_1239_ = is[i_1195_];
									is[i_1195_++] = ((((i_1236_ & 0xff00ff) * i_1237_ + (i_1239_ & 0xff00ff) * i_1238_) & ~0xff00ff) + (((i_1236_ & 0xff00) * i_1237_ + (i_1239_ & 0xff00) * i_1238_) & 0xff0000)) >> 8;
								}
								i_1195_ += i_1199_;
								i_1196_ += i_1200_;
							}
						} else {
							int i_1240_ = (i_1192_ & 0xff0000) >> 16;
							int i_1241_ = (i_1192_ & 0xff00) >> 8;
							int i_1242_ = i_1192_ & 0xff;
							for (int i_1243_ = -i_1197_; i_1243_ < 0; i_1243_++) {
								for (int i_1244_ = -i_1198_; i_1244_ < 0; i_1244_++) {
									int i_1245_ = anIntArray11346[i_1196_++];
									int i_1246_ = ((i_1245_ >>> 24) * (i_1192_ >>> 24) >> 8);
									int i_1247_ = 256 - i_1246_;
									if (i_1246_ != 255) {
										int i_1248_ = ((i_1245_ & 0xff0000) * i_1240_ & ~0xffffff);
										int i_1249_ = ((i_1245_ & 0xff00) * i_1241_ & 0xff0000);
										int i_1250_ = ((i_1245_ & 0xff) * i_1242_ & 0xff00);
										i_1245_ = (i_1248_ | i_1249_ | i_1250_) >>> 8;
										int i_1251_ = is[i_1195_];
										is[i_1195_++] = ((((i_1245_ & 0xff00ff) * i_1246_ + ((i_1251_ & 0xff00ff) * i_1247_)) & ~0xff00ff) + (((i_1245_ & 0xff00) * i_1246_ + ((i_1251_ & 0xff00) * i_1247_)) & 0xff0000)) >> 8;
									} else {
										int i_1252_ = ((i_1245_ & 0xff0000) * i_1240_ & ~0xffffff);
										int i_1253_ = ((i_1245_ & 0xff00) * i_1241_ & 0xff0000);
										int i_1254_ = ((i_1245_ & 0xff) * i_1242_ & 0xff00);
										is[i_1195_++] = (i_1252_ | i_1253_ | i_1254_) >>> 8;
									}
								}
								i_1195_ += i_1199_;
								i_1196_ += i_1200_;
							}
						}
					} else if (i_1191_ == 3) {
						for (int i_1255_ = -i_1197_; i_1255_ < 0; i_1255_++) {
							for (int i_1256_ = -i_1198_; i_1256_ < 0; i_1256_++) {
								int i_1257_ = anIntArray11346[i_1196_++];
								int i_1258_ = i_1257_ + i_1192_;
								int i_1259_ = ((i_1257_ & 0xff00ff) + (i_1192_ & 0xff00ff));
								int i_1260_ = ((i_1259_ & 0x1000100) + (i_1258_ - i_1259_ & 0x10000));
								i_1260_ = i_1258_ - i_1260_ | i_1260_ - (i_1260_ >>> 8);
								int i_1261_ = (i_1260_ >>> 24) * (i_1192_ >>> 24) >> 8;
								int i_1262_ = 256 - i_1261_;
								if (i_1261_ != 255) {
									i_1257_ = i_1260_;
									i_1260_ = is[i_1195_];
									i_1260_ = ((((i_1257_ & 0xff00ff) * i_1261_ + (i_1260_ & 0xff00ff) * i_1262_) & ~0xff00ff) + (((i_1257_ & 0xff00) * i_1261_ + (i_1260_ & 0xff00) * i_1262_) & 0xff0000)) >> 8;
								}
								is[i_1195_++] = i_1260_;
							}
							i_1195_ += i_1199_;
							i_1196_ += i_1200_;
						}
					} else if (i_1191_ == 2) {
						int i_1263_ = i_1192_ >>> 24;
						int i_1264_ = 256 - i_1263_;
						int i_1265_ = (i_1192_ & 0xff00ff) * i_1264_ & ~0xff00ff;
						int i_1266_ = (i_1192_ & 0xff00) * i_1264_ & 0xff0000;
						i_1192_ = (i_1265_ | i_1266_) >>> 8;
						for (int i_1267_ = -i_1197_; i_1267_ < 0; i_1267_++) {
							for (int i_1268_ = -i_1198_; i_1268_ < 0; i_1268_++) {
								int i_1269_ = anIntArray11346[i_1196_++];
								int i_1270_ = i_1269_ >>> 24;
								int i_1271_ = 256 - i_1270_;
								i_1265_ = ((i_1269_ & 0xff00ff) * i_1263_ & ~0xff00ff);
								i_1266_ = (i_1269_ & 0xff00) * i_1263_ & 0xff0000;
								i_1269_ = ((i_1265_ | i_1266_) >>> 8) + i_1192_;
								int i_1272_ = is[i_1195_];
								is[i_1195_++] = ((((i_1269_ & 0xff00ff) * i_1270_ + (i_1272_ & 0xff00ff) * i_1271_) & ~0xff00ff) + (((i_1269_ & 0xff00) * i_1270_ + (i_1272_ & 0xff00) * i_1271_) & 0xff0000)) >> 8;
							}
							i_1195_ += i_1199_;
							i_1196_ += i_1200_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1193_ == 2) {
					if (i_1191_ == 1) {
						for (int i_1273_ = -i_1197_; i_1273_ < 0; i_1273_++) {
							for (int i_1274_ = -i_1198_; i_1274_ < 0; i_1274_++) {
								int i_1275_ = anIntArray11346[i_1196_++];
								if (i_1275_ != 0) {
									int i_1276_ = is[i_1195_];
									int i_1277_ = i_1275_ + i_1276_;
									int i_1278_ = ((i_1275_ & 0xff00ff) + (i_1276_ & 0xff00ff));
									i_1276_ = ((i_1278_ & 0x1000100) + (i_1277_ - i_1278_ & 0x10000));
									is[i_1195_++] = (i_1277_ - i_1276_ | i_1276_ - (i_1276_ >>> 8));
								} else
									i_1195_++;
							}
							i_1195_ += i_1199_;
							i_1196_ += i_1200_;
						}
					} else if (i_1191_ == 0) {
						int i_1279_ = (i_1192_ & 0xff0000) >> 16;
						int i_1280_ = (i_1192_ & 0xff00) >> 8;
						int i_1281_ = i_1192_ & 0xff;
						for (int i_1282_ = -i_1197_; i_1282_ < 0; i_1282_++) {
							for (int i_1283_ = -i_1198_; i_1283_ < 0; i_1283_++) {
								int i_1284_ = anIntArray11346[i_1196_++];
								if (i_1284_ != 0) {
									int i_1285_ = ((i_1284_ & 0xff0000) * i_1279_ & ~0xffffff);
									int i_1286_ = ((i_1284_ & 0xff00) * i_1280_ & 0xff0000);
									int i_1287_ = (i_1284_ & 0xff) * i_1281_ & 0xff00;
									i_1284_ = (i_1285_ | i_1286_ | i_1287_) >>> 8;
									int i_1288_ = is[i_1195_];
									int i_1289_ = i_1284_ + i_1288_;
									int i_1290_ = ((i_1284_ & 0xff00ff) + (i_1288_ & 0xff00ff));
									i_1288_ = ((i_1290_ & 0x1000100) + (i_1289_ - i_1290_ & 0x10000));
									is[i_1195_++] = (i_1289_ - i_1288_ | i_1288_ - (i_1288_ >>> 8));
								} else
									i_1195_++;
							}
							i_1195_ += i_1199_;
							i_1196_ += i_1200_;
						}
					} else if (i_1191_ == 3) {
						for (int i_1291_ = -i_1197_; i_1291_ < 0; i_1291_++) {
							for (int i_1292_ = -i_1198_; i_1292_ < 0; i_1292_++) {
								int i_1293_ = anIntArray11346[i_1196_++];
								int i_1294_ = i_1293_ + i_1192_;
								int i_1295_ = ((i_1293_ & 0xff00ff) + (i_1192_ & 0xff00ff));
								int i_1296_ = ((i_1295_ & 0x1000100) + (i_1294_ - i_1295_ & 0x10000));
								i_1293_ = i_1294_ - i_1296_ | i_1296_ - (i_1296_ >>> 8);
								i_1296_ = is[i_1195_];
								i_1294_ = i_1293_ + i_1296_;
								i_1295_ = (i_1293_ & 0xff00ff) + (i_1296_ & 0xff00ff);
								i_1296_ = ((i_1295_ & 0x1000100) + (i_1294_ - i_1295_ & 0x10000));
								is[i_1195_++] = i_1294_ - i_1296_ | i_1296_ - (i_1296_ >>> 8);
							}
							i_1195_ += i_1199_;
							i_1196_ += i_1200_;
						}
					} else if (i_1191_ == 2) {
						int i_1297_ = i_1192_ >>> 24;
						int i_1298_ = 256 - i_1297_;
						int i_1299_ = (i_1192_ & 0xff00ff) * i_1298_ & ~0xff00ff;
						int i_1300_ = (i_1192_ & 0xff00) * i_1298_ & 0xff0000;
						i_1192_ = (i_1299_ | i_1300_) >>> 8;
						for (int i_1301_ = -i_1197_; i_1301_ < 0; i_1301_++) {
							for (int i_1302_ = -i_1198_; i_1302_ < 0; i_1302_++) {
								int i_1303_ = anIntArray11346[i_1196_++];
								if (i_1303_ != 0) {
									i_1299_ = ((i_1303_ & 0xff00ff) * i_1297_ & ~0xff00ff);
									i_1300_ = ((i_1303_ & 0xff00) * i_1297_ & 0xff0000);
									i_1303_ = (((i_1299_ | i_1300_) >>> 8) + i_1192_);
									int i_1304_ = is[i_1195_];
									int i_1305_ = i_1303_ + i_1304_;
									int i_1306_ = ((i_1303_ & 0xff00ff) + (i_1304_ & 0xff00ff));
									i_1304_ = ((i_1306_ & 0x1000100) + (i_1305_ - i_1306_ & 0x10000));
									is[i_1195_++] = (i_1305_ - i_1304_ | i_1304_ - (i_1304_ >>> 8));
								} else
									i_1195_++;
							}
							i_1195_ += i_1199_;
							i_1196_ += i_1200_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method1726(int i, int i_1307_, int i_1308_, int i_1309_, int i_1310_, int i_1311_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is == null)
			throw new IllegalStateException("");
		for (int i_1312_ = 0; i_1312_ < i_1309_; i_1312_++) {
			int i_1313_ = (i_1307_ + i_1312_) * i_1308_ + i;
			int i_1314_ = (i_1311_ + i_1312_) * i_1308_ + i_1310_;
			for (int i_1315_ = 0; i_1315_ < i_1308_; i_1315_++)
				anIntArray11346[i_1313_ + i_1315_] = is[i_1314_ + i_1315_] & 0xffffff;
		}
	}

	public void method1756(int i, int i_1316_, int i_1317_, int i_1318_, int i_1319_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			int i_1320_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			i += anInt8977;
			i_1316_ += anInt8947;
			int i_1321_ = i_1316_ * i_1320_ + i;
			int i_1322_ = 0;
			int i_1323_ = anInt8950;
			int i_1324_ = anInt8945;
			int i_1325_ = i_1320_ - i_1324_;
			int i_1326_ = 0;
			if (i_1316_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_1327_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_1316_;
				i_1323_ -= i_1327_;
				i_1316_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_1322_ += i_1327_ * i_1324_;
				i_1321_ += i_1327_ * i_1320_;
			}
			if (i_1316_ + i_1323_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_1323_ -= (i_1316_ + i_1323_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_1328_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_1324_ -= i_1328_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_1322_ += i_1328_;
				i_1321_ += i_1328_;
				i_1326_ += i_1328_;
				i_1325_ += i_1328_;
			}
			if (i + i_1324_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_1329_ = i + i_1324_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_1324_ -= i_1329_;
				i_1326_ += i_1329_;
				i_1325_ += i_1329_;
			}
			if (i_1324_ > 0 && i_1323_ > 0) {
				if (i_1319_ == 0) {
					if (i_1317_ == 1) {
						for (int i_1330_ = -i_1323_; i_1330_ < 0; i_1330_++) {
							int i_1331_ = i_1321_ + i_1324_ - 3;
							while (i_1321_ < i_1331_) {
								is[i_1321_++] = anIntArray11346[i_1322_++];
								is[i_1321_++] = anIntArray11346[i_1322_++];
								is[i_1321_++] = anIntArray11346[i_1322_++];
								is[i_1321_++] = anIntArray11346[i_1322_++];
							}
							i_1331_ += 3;
							while (i_1321_ < i_1331_)
								is[i_1321_++] = anIntArray11346[i_1322_++];
							i_1321_ += i_1325_;
							i_1322_ += i_1326_;
						}
					} else if (i_1317_ == 0) {
						int i_1332_ = (i_1318_ & 0xff0000) >> 16;
						int i_1333_ = (i_1318_ & 0xff00) >> 8;
						int i_1334_ = i_1318_ & 0xff;
						for (int i_1335_ = -i_1323_; i_1335_ < 0; i_1335_++) {
							for (int i_1336_ = -i_1324_; i_1336_ < 0; i_1336_++) {
								int i_1337_ = anIntArray11346[i_1322_++];
								int i_1338_ = ((i_1337_ & 0xff0000) * i_1332_ & ~0xffffff);
								int i_1339_ = (i_1337_ & 0xff00) * i_1333_ & 0xff0000;
								int i_1340_ = (i_1337_ & 0xff) * i_1334_ & 0xff00;
								is[i_1321_++] = (i_1338_ | i_1339_ | i_1340_) >>> 8;
							}
							i_1321_ += i_1325_;
							i_1322_ += i_1326_;
						}
					} else if (i_1317_ == 3) {
						for (int i_1341_ = -i_1323_; i_1341_ < 0; i_1341_++) {
							for (int i_1342_ = -i_1324_; i_1342_ < 0; i_1342_++) {
								int i_1343_ = anIntArray11346[i_1322_++];
								int i_1344_ = i_1343_ + i_1318_;
								int i_1345_ = ((i_1343_ & 0xff00ff) + (i_1318_ & 0xff00ff));
								int i_1346_ = ((i_1345_ & 0x1000100) + (i_1344_ - i_1345_ & 0x10000));
								is[i_1321_++] = i_1344_ - i_1346_ | i_1346_ - (i_1346_ >>> 8);
							}
							i_1321_ += i_1325_;
							i_1322_ += i_1326_;
						}
					} else if (i_1317_ == 2) {
						int i_1347_ = i_1318_ >>> 24;
						int i_1348_ = 256 - i_1347_;
						int i_1349_ = (i_1318_ & 0xff00ff) * i_1348_ & ~0xff00ff;
						int i_1350_ = (i_1318_ & 0xff00) * i_1348_ & 0xff0000;
						i_1318_ = (i_1349_ | i_1350_) >>> 8;
						for (int i_1351_ = -i_1323_; i_1351_ < 0; i_1351_++) {
							for (int i_1352_ = -i_1324_; i_1352_ < 0; i_1352_++) {
								int i_1353_ = anIntArray11346[i_1322_++];
								i_1349_ = ((i_1353_ & 0xff00ff) * i_1347_ & ~0xff00ff);
								i_1350_ = (i_1353_ & 0xff00) * i_1347_ & 0xff0000;
								is[i_1321_++] = ((i_1349_ | i_1350_) >>> 8) + i_1318_;
							}
							i_1321_ += i_1325_;
							i_1322_ += i_1326_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1319_ == 1) {
					if (i_1317_ == 1) {
						for (int i_1354_ = -i_1323_; i_1354_ < 0; i_1354_++) {
							for (int i_1355_ = -i_1324_; i_1355_ < 0; i_1355_++) {
								int i_1356_ = anIntArray11346[i_1322_++];
								int i_1357_ = i_1356_ >>> 24;
								int i_1358_ = 256 - i_1357_;
								int i_1359_ = is[i_1321_];
								is[i_1321_++] = (((((i_1356_ & 0xff00ff) * i_1357_ + (i_1359_ & 0xff00ff) * i_1358_) & ~0xff00ff) >> 8) + (((((i_1356_ & ~0xff00ff) >>> 8) * i_1357_) + (((i_1359_ & ~0xff00ff) >>> 8) * i_1358_)) & ~0xff00ff));
							}
							i_1321_ += i_1325_;
							i_1322_ += i_1326_;
						}
					} else if (i_1317_ == 0) {
						if ((i_1318_ & 0xffffff) == 16777215) {
							for (int i_1360_ = -i_1323_; i_1360_ < 0; i_1360_++) {
								for (int i_1361_ = -i_1324_; i_1361_ < 0; i_1361_++) {
									int i_1362_ = anIntArray11346[i_1322_++];
									int i_1363_ = ((i_1362_ >>> 24) * (i_1318_ >>> 24) >> 8);
									int i_1364_ = 256 - i_1363_;
									int i_1365_ = is[i_1321_];
									is[i_1321_++] = ((((i_1362_ & 0xff00ff) * i_1363_ + (i_1365_ & 0xff00ff) * i_1364_) & ~0xff00ff) + (((i_1362_ & 0xff00) * i_1363_ + (i_1365_ & 0xff00) * i_1364_) & 0xff0000)) >> 8;
								}
								i_1321_ += i_1325_;
								i_1322_ += i_1326_;
							}
						} else {
							int i_1366_ = (i_1318_ & 0xff0000) >> 16;
							int i_1367_ = (i_1318_ & 0xff00) >> 8;
							int i_1368_ = i_1318_ & 0xff;
							for (int i_1369_ = -i_1323_; i_1369_ < 0; i_1369_++) {
								for (int i_1370_ = -i_1324_; i_1370_ < 0; i_1370_++) {
									int i_1371_ = anIntArray11346[i_1322_++];
									int i_1372_ = ((i_1371_ >>> 24) * (i_1318_ >>> 24) >> 8);
									int i_1373_ = 256 - i_1372_;
									if (i_1372_ != 255) {
										int i_1374_ = ((i_1371_ & 0xff0000) * i_1366_ & ~0xffffff);
										int i_1375_ = ((i_1371_ & 0xff00) * i_1367_ & 0xff0000);
										int i_1376_ = ((i_1371_ & 0xff) * i_1368_ & 0xff00);
										i_1371_ = (i_1374_ | i_1375_ | i_1376_) >>> 8;
										int i_1377_ = is[i_1321_];
										is[i_1321_++] = ((((i_1371_ & 0xff00ff) * i_1372_ + ((i_1377_ & 0xff00ff) * i_1373_)) & ~0xff00ff) + (((i_1371_ & 0xff00) * i_1372_ + ((i_1377_ & 0xff00) * i_1373_)) & 0xff0000)) >> 8;
									} else {
										int i_1378_ = ((i_1371_ & 0xff0000) * i_1366_ & ~0xffffff);
										int i_1379_ = ((i_1371_ & 0xff00) * i_1367_ & 0xff0000);
										int i_1380_ = ((i_1371_ & 0xff) * i_1368_ & 0xff00);
										is[i_1321_++] = (i_1378_ | i_1379_ | i_1380_) >>> 8;
									}
								}
								i_1321_ += i_1325_;
								i_1322_ += i_1326_;
							}
						}
					} else if (i_1317_ == 3) {
						for (int i_1381_ = -i_1323_; i_1381_ < 0; i_1381_++) {
							for (int i_1382_ = -i_1324_; i_1382_ < 0; i_1382_++) {
								int i_1383_ = anIntArray11346[i_1322_++];
								int i_1384_ = i_1383_ + i_1318_;
								int i_1385_ = ((i_1383_ & 0xff00ff) + (i_1318_ & 0xff00ff));
								int i_1386_ = ((i_1385_ & 0x1000100) + (i_1384_ - i_1385_ & 0x10000));
								i_1386_ = i_1384_ - i_1386_ | i_1386_ - (i_1386_ >>> 8);
								int i_1387_ = (i_1386_ >>> 24) * (i_1318_ >>> 24) >> 8;
								int i_1388_ = 256 - i_1387_;
								if (i_1387_ != 255) {
									i_1383_ = i_1386_;
									i_1386_ = is[i_1321_];
									i_1386_ = ((((i_1383_ & 0xff00ff) * i_1387_ + (i_1386_ & 0xff00ff) * i_1388_) & ~0xff00ff) + (((i_1383_ & 0xff00) * i_1387_ + (i_1386_ & 0xff00) * i_1388_) & 0xff0000)) >> 8;
								}
								is[i_1321_++] = i_1386_;
							}
							i_1321_ += i_1325_;
							i_1322_ += i_1326_;
						}
					} else if (i_1317_ == 2) {
						int i_1389_ = i_1318_ >>> 24;
						int i_1390_ = 256 - i_1389_;
						int i_1391_ = (i_1318_ & 0xff00ff) * i_1390_ & ~0xff00ff;
						int i_1392_ = (i_1318_ & 0xff00) * i_1390_ & 0xff0000;
						i_1318_ = (i_1391_ | i_1392_) >>> 8;
						for (int i_1393_ = -i_1323_; i_1393_ < 0; i_1393_++) {
							for (int i_1394_ = -i_1324_; i_1394_ < 0; i_1394_++) {
								int i_1395_ = anIntArray11346[i_1322_++];
								int i_1396_ = i_1395_ >>> 24;
								int i_1397_ = 256 - i_1396_;
								i_1391_ = ((i_1395_ & 0xff00ff) * i_1389_ & ~0xff00ff);
								i_1392_ = (i_1395_ & 0xff00) * i_1389_ & 0xff0000;
								i_1395_ = ((i_1391_ | i_1392_) >>> 8) + i_1318_;
								int i_1398_ = is[i_1321_];
								is[i_1321_++] = ((((i_1395_ & 0xff00ff) * i_1396_ + (i_1398_ & 0xff00ff) * i_1397_) & ~0xff00ff) + (((i_1395_ & 0xff00) * i_1396_ + (i_1398_ & 0xff00) * i_1397_) & 0xff0000)) >> 8;
							}
							i_1321_ += i_1325_;
							i_1322_ += i_1326_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1319_ == 2) {
					if (i_1317_ == 1) {
						for (int i_1399_ = -i_1323_; i_1399_ < 0; i_1399_++) {
							for (int i_1400_ = -i_1324_; i_1400_ < 0; i_1400_++) {
								int i_1401_ = anIntArray11346[i_1322_++];
								if (i_1401_ != 0) {
									int i_1402_ = is[i_1321_];
									int i_1403_ = i_1401_ + i_1402_;
									int i_1404_ = ((i_1401_ & 0xff00ff) + (i_1402_ & 0xff00ff));
									i_1402_ = ((i_1404_ & 0x1000100) + (i_1403_ - i_1404_ & 0x10000));
									is[i_1321_++] = (i_1403_ - i_1402_ | i_1402_ - (i_1402_ >>> 8));
								} else
									i_1321_++;
							}
							i_1321_ += i_1325_;
							i_1322_ += i_1326_;
						}
					} else if (i_1317_ == 0) {
						int i_1405_ = (i_1318_ & 0xff0000) >> 16;
						int i_1406_ = (i_1318_ & 0xff00) >> 8;
						int i_1407_ = i_1318_ & 0xff;
						for (int i_1408_ = -i_1323_; i_1408_ < 0; i_1408_++) {
							for (int i_1409_ = -i_1324_; i_1409_ < 0; i_1409_++) {
								int i_1410_ = anIntArray11346[i_1322_++];
								if (i_1410_ != 0) {
									int i_1411_ = ((i_1410_ & 0xff0000) * i_1405_ & ~0xffffff);
									int i_1412_ = ((i_1410_ & 0xff00) * i_1406_ & 0xff0000);
									int i_1413_ = (i_1410_ & 0xff) * i_1407_ & 0xff00;
									i_1410_ = (i_1411_ | i_1412_ | i_1413_) >>> 8;
									int i_1414_ = is[i_1321_];
									int i_1415_ = i_1410_ + i_1414_;
									int i_1416_ = ((i_1410_ & 0xff00ff) + (i_1414_ & 0xff00ff));
									i_1414_ = ((i_1416_ & 0x1000100) + (i_1415_ - i_1416_ & 0x10000));
									is[i_1321_++] = (i_1415_ - i_1414_ | i_1414_ - (i_1414_ >>> 8));
								} else
									i_1321_++;
							}
							i_1321_ += i_1325_;
							i_1322_ += i_1326_;
						}
					} else if (i_1317_ == 3) {
						for (int i_1417_ = -i_1323_; i_1417_ < 0; i_1417_++) {
							for (int i_1418_ = -i_1324_; i_1418_ < 0; i_1418_++) {
								int i_1419_ = anIntArray11346[i_1322_++];
								int i_1420_ = i_1419_ + i_1318_;
								int i_1421_ = ((i_1419_ & 0xff00ff) + (i_1318_ & 0xff00ff));
								int i_1422_ = ((i_1421_ & 0x1000100) + (i_1420_ - i_1421_ & 0x10000));
								i_1419_ = i_1420_ - i_1422_ | i_1422_ - (i_1422_ >>> 8);
								i_1422_ = is[i_1321_];
								i_1420_ = i_1419_ + i_1422_;
								i_1421_ = (i_1419_ & 0xff00ff) + (i_1422_ & 0xff00ff);
								i_1422_ = ((i_1421_ & 0x1000100) + (i_1420_ - i_1421_ & 0x10000));
								is[i_1321_++] = i_1420_ - i_1422_ | i_1422_ - (i_1422_ >>> 8);
							}
							i_1321_ += i_1325_;
							i_1322_ += i_1326_;
						}
					} else if (i_1317_ == 2) {
						int i_1423_ = i_1318_ >>> 24;
						int i_1424_ = 256 - i_1423_;
						int i_1425_ = (i_1318_ & 0xff00ff) * i_1424_ & ~0xff00ff;
						int i_1426_ = (i_1318_ & 0xff00) * i_1424_ & 0xff0000;
						i_1318_ = (i_1425_ | i_1426_) >>> 8;
						for (int i_1427_ = -i_1323_; i_1427_ < 0; i_1427_++) {
							for (int i_1428_ = -i_1324_; i_1428_ < 0; i_1428_++) {
								int i_1429_ = anIntArray11346[i_1322_++];
								if (i_1429_ != 0) {
									i_1425_ = ((i_1429_ & 0xff00ff) * i_1423_ & ~0xff00ff);
									i_1426_ = ((i_1429_ & 0xff00) * i_1423_ & 0xff0000);
									i_1429_ = (((i_1425_ | i_1426_) >>> 8) + i_1318_);
									int i_1430_ = is[i_1321_];
									int i_1431_ = i_1429_ + i_1430_;
									int i_1432_ = ((i_1429_ & 0xff00ff) + (i_1430_ & 0xff00ff));
									i_1430_ = ((i_1432_ & 0x1000100) + (i_1431_ - i_1432_ & 0x10000));
									is[i_1321_++] = (i_1431_ - i_1430_ | i_1430_ - (i_1430_ >>> 8));
								} else
									i_1321_++;
							}
							i_1321_ += i_1325_;
							i_1322_ += i_1326_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method1721(int i, int i_1433_, int i_1434_, int i_1435_, int i_1436_) {
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
								is[i_1438_++] = anIntArray11346[i_1439_++];
								is[i_1438_++] = anIntArray11346[i_1439_++];
								is[i_1438_++] = anIntArray11346[i_1439_++];
								is[i_1438_++] = anIntArray11346[i_1439_++];
							}
							i_1448_ += 3;
							while (i_1438_ < i_1448_)
								is[i_1438_++] = anIntArray11346[i_1439_++];
							i_1438_ += i_1442_;
							i_1439_ += i_1443_;
						}
					} else if (i_1434_ == 0) {
						int i_1449_ = (i_1435_ & 0xff0000) >> 16;
						int i_1450_ = (i_1435_ & 0xff00) >> 8;
						int i_1451_ = i_1435_ & 0xff;
						for (int i_1452_ = -i_1440_; i_1452_ < 0; i_1452_++) {
							for (int i_1453_ = -i_1441_; i_1453_ < 0; i_1453_++) {
								int i_1454_ = anIntArray11346[i_1439_++];
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
								int i_1460_ = anIntArray11346[i_1439_++];
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
								int i_1470_ = anIntArray11346[i_1439_++];
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
								int i_1473_ = anIntArray11346[i_1439_++];
								int i_1474_ = i_1473_ >>> 24;
								int i_1475_ = 256 - i_1474_;
								int i_1476_ = is[i_1438_];
								is[i_1438_++] = (((((i_1473_ & 0xff00ff) * i_1474_ + (i_1476_ & 0xff00ff) * i_1475_) & ~0xff00ff) >> 8) + (((((i_1473_ & ~0xff00ff) >>> 8) * i_1474_) + (((i_1476_ & ~0xff00ff) >>> 8) * i_1475_)) & ~0xff00ff));
							}
							i_1438_ += i_1442_;
							i_1439_ += i_1443_;
						}
					} else if (i_1434_ == 0) {
						if ((i_1435_ & 0xffffff) == 16777215) {
							for (int i_1477_ = -i_1440_; i_1477_ < 0; i_1477_++) {
								for (int i_1478_ = -i_1441_; i_1478_ < 0; i_1478_++) {
									int i_1479_ = anIntArray11346[i_1439_++];
									int i_1480_ = ((i_1479_ >>> 24) * (i_1435_ >>> 24) >> 8);
									int i_1481_ = 256 - i_1480_;
									int i_1482_ = is[i_1438_];
									is[i_1438_++] = ((((i_1479_ & 0xff00ff) * i_1480_ + (i_1482_ & 0xff00ff) * i_1481_) & ~0xff00ff) + (((i_1479_ & 0xff00) * i_1480_ + (i_1482_ & 0xff00) * i_1481_) & 0xff0000)) >> 8;
								}
								i_1438_ += i_1442_;
								i_1439_ += i_1443_;
							}
						} else {
							int i_1483_ = (i_1435_ & 0xff0000) >> 16;
							int i_1484_ = (i_1435_ & 0xff00) >> 8;
							int i_1485_ = i_1435_ & 0xff;
							for (int i_1486_ = -i_1440_; i_1486_ < 0; i_1486_++) {
								for (int i_1487_ = -i_1441_; i_1487_ < 0; i_1487_++) {
									int i_1488_ = anIntArray11346[i_1439_++];
									int i_1489_ = ((i_1488_ >>> 24) * (i_1435_ >>> 24) >> 8);
									int i_1490_ = 256 - i_1489_;
									if (i_1489_ != 255) {
										int i_1491_ = ((i_1488_ & 0xff0000) * i_1483_ & ~0xffffff);
										int i_1492_ = ((i_1488_ & 0xff00) * i_1484_ & 0xff0000);
										int i_1493_ = ((i_1488_ & 0xff) * i_1485_ & 0xff00);
										i_1488_ = (i_1491_ | i_1492_ | i_1493_) >>> 8;
										int i_1494_ = is[i_1438_];
										is[i_1438_++] = ((((i_1488_ & 0xff00ff) * i_1489_ + ((i_1494_ & 0xff00ff) * i_1490_)) & ~0xff00ff) + (((i_1488_ & 0xff00) * i_1489_ + ((i_1494_ & 0xff00) * i_1490_)) & 0xff0000)) >> 8;
									} else {
										int i_1495_ = ((i_1488_ & 0xff0000) * i_1483_ & ~0xffffff);
										int i_1496_ = ((i_1488_ & 0xff00) * i_1484_ & 0xff0000);
										int i_1497_ = ((i_1488_ & 0xff) * i_1485_ & 0xff00);
										is[i_1438_++] = (i_1495_ | i_1496_ | i_1497_) >>> 8;
									}
								}
								i_1438_ += i_1442_;
								i_1439_ += i_1443_;
							}
						}
					} else if (i_1434_ == 3) {
						for (int i_1498_ = -i_1440_; i_1498_ < 0; i_1498_++) {
							for (int i_1499_ = -i_1441_; i_1499_ < 0; i_1499_++) {
								int i_1500_ = anIntArray11346[i_1439_++];
								int i_1501_ = i_1500_ + i_1435_;
								int i_1502_ = ((i_1500_ & 0xff00ff) + (i_1435_ & 0xff00ff));
								int i_1503_ = ((i_1502_ & 0x1000100) + (i_1501_ - i_1502_ & 0x10000));
								i_1503_ = i_1501_ - i_1503_ | i_1503_ - (i_1503_ >>> 8);
								int i_1504_ = (i_1503_ >>> 24) * (i_1435_ >>> 24) >> 8;
								int i_1505_ = 256 - i_1504_;
								if (i_1504_ != 255) {
									i_1500_ = i_1503_;
									i_1503_ = is[i_1438_];
									i_1503_ = ((((i_1500_ & 0xff00ff) * i_1504_ + (i_1503_ & 0xff00ff) * i_1505_) & ~0xff00ff) + (((i_1500_ & 0xff00) * i_1504_ + (i_1503_ & 0xff00) * i_1505_) & 0xff0000)) >> 8;
								}
								is[i_1438_++] = i_1503_;
							}
							i_1438_ += i_1442_;
							i_1439_ += i_1443_;
						}
					} else if (i_1434_ == 2) {
						int i_1506_ = i_1435_ >>> 24;
						int i_1507_ = 256 - i_1506_;
						int i_1508_ = (i_1435_ & 0xff00ff) * i_1507_ & ~0xff00ff;
						int i_1509_ = (i_1435_ & 0xff00) * i_1507_ & 0xff0000;
						i_1435_ = (i_1508_ | i_1509_) >>> 8;
						for (int i_1510_ = -i_1440_; i_1510_ < 0; i_1510_++) {
							for (int i_1511_ = -i_1441_; i_1511_ < 0; i_1511_++) {
								int i_1512_ = anIntArray11346[i_1439_++];
								int i_1513_ = i_1512_ >>> 24;
								int i_1514_ = 256 - i_1513_;
								i_1508_ = ((i_1512_ & 0xff00ff) * i_1506_ & ~0xff00ff);
								i_1509_ = (i_1512_ & 0xff00) * i_1506_ & 0xff0000;
								i_1512_ = ((i_1508_ | i_1509_) >>> 8) + i_1435_;
								int i_1515_ = is[i_1438_];
								is[i_1438_++] = ((((i_1512_ & 0xff00ff) * i_1513_ + (i_1515_ & 0xff00ff) * i_1514_) & ~0xff00ff) + (((i_1512_ & 0xff00) * i_1513_ + (i_1515_ & 0xff00) * i_1514_) & 0xff0000)) >> 8;
							}
							i_1438_ += i_1442_;
							i_1439_ += i_1443_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1436_ == 2) {
					if (i_1434_ == 1) {
						for (int i_1516_ = -i_1440_; i_1516_ < 0; i_1516_++) {
							for (int i_1517_ = -i_1441_; i_1517_ < 0; i_1517_++) {
								int i_1518_ = anIntArray11346[i_1439_++];
								if (i_1518_ != 0) {
									int i_1519_ = is[i_1438_];
									int i_1520_ = i_1518_ + i_1519_;
									int i_1521_ = ((i_1518_ & 0xff00ff) + (i_1519_ & 0xff00ff));
									i_1519_ = ((i_1521_ & 0x1000100) + (i_1520_ - i_1521_ & 0x10000));
									is[i_1438_++] = (i_1520_ - i_1519_ | i_1519_ - (i_1519_ >>> 8));
								} else
									i_1438_++;
							}
							i_1438_ += i_1442_;
							i_1439_ += i_1443_;
						}
					} else if (i_1434_ == 0) {
						int i_1522_ = (i_1435_ & 0xff0000) >> 16;
						int i_1523_ = (i_1435_ & 0xff00) >> 8;
						int i_1524_ = i_1435_ & 0xff;
						for (int i_1525_ = -i_1440_; i_1525_ < 0; i_1525_++) {
							for (int i_1526_ = -i_1441_; i_1526_ < 0; i_1526_++) {
								int i_1527_ = anIntArray11346[i_1439_++];
								if (i_1527_ != 0) {
									int i_1528_ = ((i_1527_ & 0xff0000) * i_1522_ & ~0xffffff);
									int i_1529_ = ((i_1527_ & 0xff00) * i_1523_ & 0xff0000);
									int i_1530_ = (i_1527_ & 0xff) * i_1524_ & 0xff00;
									i_1527_ = (i_1528_ | i_1529_ | i_1530_) >>> 8;
									int i_1531_ = is[i_1438_];
									int i_1532_ = i_1527_ + i_1531_;
									int i_1533_ = ((i_1527_ & 0xff00ff) + (i_1531_ & 0xff00ff));
									i_1531_ = ((i_1533_ & 0x1000100) + (i_1532_ - i_1533_ & 0x10000));
									is[i_1438_++] = (i_1532_ - i_1531_ | i_1531_ - (i_1531_ >>> 8));
								} else
									i_1438_++;
							}
							i_1438_ += i_1442_;
							i_1439_ += i_1443_;
						}
					} else if (i_1434_ == 3) {
						for (int i_1534_ = -i_1440_; i_1534_ < 0; i_1534_++) {
							for (int i_1535_ = -i_1441_; i_1535_ < 0; i_1535_++) {
								int i_1536_ = anIntArray11346[i_1439_++];
								int i_1537_ = i_1536_ + i_1435_;
								int i_1538_ = ((i_1536_ & 0xff00ff) + (i_1435_ & 0xff00ff));
								int i_1539_ = ((i_1538_ & 0x1000100) + (i_1537_ - i_1538_ & 0x10000));
								i_1536_ = i_1537_ - i_1539_ | i_1539_ - (i_1539_ >>> 8);
								i_1539_ = is[i_1438_];
								i_1537_ = i_1536_ + i_1539_;
								i_1538_ = (i_1536_ & 0xff00ff) + (i_1539_ & 0xff00ff);
								i_1539_ = ((i_1538_ & 0x1000100) + (i_1537_ - i_1538_ & 0x10000));
								is[i_1438_++] = i_1537_ - i_1539_ | i_1539_ - (i_1539_ >>> 8);
							}
							i_1438_ += i_1442_;
							i_1439_ += i_1443_;
						}
					} else if (i_1434_ == 2) {
						int i_1540_ = i_1435_ >>> 24;
						int i_1541_ = 256 - i_1540_;
						int i_1542_ = (i_1435_ & 0xff00ff) * i_1541_ & ~0xff00ff;
						int i_1543_ = (i_1435_ & 0xff00) * i_1541_ & 0xff0000;
						i_1435_ = (i_1542_ | i_1543_) >>> 8;
						for (int i_1544_ = -i_1440_; i_1544_ < 0; i_1544_++) {
							for (int i_1545_ = -i_1441_; i_1545_ < 0; i_1545_++) {
								int i_1546_ = anIntArray11346[i_1439_++];
								if (i_1546_ != 0) {
									i_1542_ = ((i_1546_ & 0xff00ff) * i_1540_ & ~0xff00ff);
									i_1543_ = ((i_1546_ & 0xff00) * i_1540_ & 0xff0000);
									i_1546_ = (((i_1542_ | i_1543_) >>> 8) + i_1435_);
									int i_1547_ = is[i_1438_];
									int i_1548_ = i_1546_ + i_1547_;
									int i_1549_ = ((i_1546_ & 0xff00ff) + (i_1547_ & 0xff00ff));
									i_1547_ = ((i_1549_ & 0x1000100) + (i_1548_ - i_1549_ & 0x10000));
									is[i_1438_++] = (i_1548_ - i_1547_ | i_1547_ - (i_1547_ >>> 8));
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

	void method1758(int i, int i_1550_, int i_1551_, int i_1552_, int i_1553_, int i_1554_, int i_1555_, int i_1556_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		if (i_1551_ > 0 && i_1552_ > 0) {
			int[] is = aClass167_Sub1_8946.anIntArray8996;
			if (is != null) {
				int i_1557_ = 0;
				int i_1558_ = 0;
				int i_1559_ = aClass167_Sub1_8946.anInt8997 * -570111553;
				int i_1560_ = anInt8977 + anInt8945 + anInt8948;
				int i_1561_ = anInt8947 + anInt8950 + anInt8952;
				int i_1562_ = (i_1560_ << 16) / i_1551_;
				int i_1563_ = (i_1561_ << 16) / i_1552_;
				if (anInt8977 > 0) {
					int i_1564_ = ((anInt8977 << 16) + i_1562_ - 1) / i_1562_;
					i += i_1564_;
					i_1557_ += i_1564_ * i_1562_ - (anInt8977 << 16);
				}
				if (anInt8947 > 0) {
					int i_1565_ = ((anInt8947 << 16) + i_1563_ - 1) / i_1563_;
					i_1550_ += i_1565_;
					i_1558_ += i_1565_ * i_1563_ - (anInt8947 << 16);
				}
				if (anInt8945 < i_1560_)
					i_1551_ = (((anInt8945 << 16) - i_1557_ + i_1562_ - 1) / i_1562_);
				if (anInt8950 < i_1561_)
					i_1552_ = (((anInt8950 << 16) - i_1558_ + i_1563_ - 1) / i_1563_);
				int i_1566_ = i + i_1550_ * i_1559_;
				int i_1567_ = i_1559_ - i_1551_;
				if (i_1550_ + i_1552_ > aClass167_Sub1_8946.anInt9003 * -148513205)
					i_1552_ -= (i_1550_ + i_1552_ - aClass167_Sub1_8946.anInt9003 * -148513205);
				if (i_1550_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
					int i_1568_ = (aClass167_Sub1_8946.anInt9021 * -1593163361 - i_1550_);
					i_1552_ -= i_1568_;
					i_1566_ += i_1568_ * i_1559_;
					i_1558_ += i_1563_ * i_1568_;
				}
				if (i + i_1551_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
					int i_1569_ = (i + i_1551_ - aClass167_Sub1_8946.anInt9001 * 2024498147);
					i_1551_ -= i_1569_;
					i_1567_ += i_1569_;
				}
				if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
					int i_1570_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
					i_1551_ -= i_1570_;
					i_1566_ += i_1570_;
					i_1557_ += i_1562_ * i_1570_;
					i_1567_ += i_1570_;
				}
				if (i_1555_ == 0) {
					if (i_1553_ == 1) {
						int i_1571_ = i_1557_;
						for (int i_1572_ = -i_1552_; i_1572_ < 0; i_1572_++) {
							int i_1573_ = (i_1558_ >> 16) * anInt8945;
							for (int i_1574_ = -i_1551_; i_1574_ < 0; i_1574_++) {
								is[i_1566_++] = (anIntArray11346[(i_1557_ >> 16) + i_1573_]);
								i_1557_ += i_1562_;
							}
							i_1558_ += i_1563_;
							i_1557_ = i_1571_;
							i_1566_ += i_1567_;
						}
					} else if (i_1553_ == 0) {
						int i_1575_ = (i_1554_ & 0xff0000) >> 16;
						int i_1576_ = (i_1554_ & 0xff00) >> 8;
						int i_1577_ = i_1554_ & 0xff;
						int i_1578_ = i_1557_;
						for (int i_1579_ = -i_1552_; i_1579_ < 0; i_1579_++) {
							int i_1580_ = (i_1558_ >> 16) * anInt8945;
							for (int i_1581_ = -i_1551_; i_1581_ < 0; i_1581_++) {
								int i_1582_ = (anIntArray11346[(i_1557_ >> 16) + i_1580_]);
								int i_1583_ = ((i_1582_ & 0xff0000) * i_1575_ & ~0xffffff);
								int i_1584_ = (i_1582_ & 0xff00) * i_1576_ & 0xff0000;
								int i_1585_ = (i_1582_ & 0xff) * i_1577_ & 0xff00;
								is[i_1566_++] = (i_1583_ | i_1584_ | i_1585_) >>> 8;
								i_1557_ += i_1562_;
							}
							i_1558_ += i_1563_;
							i_1557_ = i_1578_;
							i_1566_ += i_1567_;
						}
					} else if (i_1553_ == 3) {
						int i_1586_ = i_1557_;
						for (int i_1587_ = -i_1552_; i_1587_ < 0; i_1587_++) {
							int i_1588_ = (i_1558_ >> 16) * anInt8945;
							for (int i_1589_ = -i_1551_; i_1589_ < 0; i_1589_++) {
								int i_1590_ = (anIntArray11346[(i_1557_ >> 16) + i_1588_]);
								int i_1591_ = i_1590_ + i_1554_;
								int i_1592_ = ((i_1590_ & 0xff00ff) + (i_1554_ & 0xff00ff));
								int i_1593_ = ((i_1592_ & 0x1000100) + (i_1591_ - i_1592_ & 0x10000));
								is[i_1566_++] = i_1591_ - i_1593_ | i_1593_ - (i_1593_ >>> 8);
								i_1557_ += i_1562_;
							}
							i_1558_ += i_1563_;
							i_1557_ = i_1586_;
							i_1566_ += i_1567_;
						}
					} else if (i_1553_ == 2) {
						int i_1594_ = i_1554_ >>> 24;
						int i_1595_ = 256 - i_1594_;
						int i_1596_ = (i_1554_ & 0xff00ff) * i_1595_ & ~0xff00ff;
						int i_1597_ = (i_1554_ & 0xff00) * i_1595_ & 0xff0000;
						i_1554_ = (i_1596_ | i_1597_) >>> 8;
						int i_1598_ = i_1557_;
						for (int i_1599_ = -i_1552_; i_1599_ < 0; i_1599_++) {
							int i_1600_ = (i_1558_ >> 16) * anInt8945;
							for (int i_1601_ = -i_1551_; i_1601_ < 0; i_1601_++) {
								int i_1602_ = (anIntArray11346[(i_1557_ >> 16) + i_1600_]);
								i_1596_ = ((i_1602_ & 0xff00ff) * i_1594_ & ~0xff00ff);
								i_1597_ = (i_1602_ & 0xff00) * i_1594_ & 0xff0000;
								is[i_1566_++] = ((i_1596_ | i_1597_) >>> 8) + i_1554_;
								i_1557_ += i_1562_;
							}
							i_1558_ += i_1563_;
							i_1557_ = i_1598_;
							i_1566_ += i_1567_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1555_ == 1) {
					if (i_1553_ == 1) {
						int i_1603_ = i_1557_;
						for (int i_1604_ = -i_1552_; i_1604_ < 0; i_1604_++) {
							int i_1605_ = (i_1558_ >> 16) * anInt8945;
							for (int i_1606_ = -i_1551_; i_1606_ < 0; i_1606_++) {
								int i_1607_ = (anIntArray11346[(i_1557_ >> 16) + i_1605_]);
								int i_1608_ = i_1607_ >>> 24;
								int i_1609_ = 256 - i_1608_;
								int i_1610_ = is[i_1566_];
								is[i_1566_++] = (((((i_1607_ & 0xff00ff) * i_1608_ + (i_1610_ & 0xff00ff) * i_1609_) & ~0xff00ff) >> 8) + (((((i_1607_ & ~0xff00ff) >>> 8) * i_1608_) + (((i_1610_ & ~0xff00ff) >>> 8) * i_1609_)) & ~0xff00ff));
								i_1557_ += i_1562_;
							}
							i_1558_ += i_1563_;
							i_1557_ = i_1603_;
							i_1566_ += i_1567_;
						}
					} else if (i_1553_ == 0) {
						int i_1611_ = i_1557_;
						if ((i_1554_ & 0xffffff) == 16777215) {
							for (int i_1612_ = -i_1552_; i_1612_ < 0; i_1612_++) {
								int i_1613_ = (i_1558_ >> 16) * anInt8945;
								for (int i_1614_ = -i_1551_; i_1614_ < 0; i_1614_++) {
									int i_1615_ = (anIntArray11346[(i_1557_ >> 16) + i_1613_]);
									int i_1616_ = ((i_1615_ >>> 24) * (i_1554_ >>> 24) >> 8);
									int i_1617_ = 256 - i_1616_;
									int i_1618_ = is[i_1566_];
									is[i_1566_++] = ((((i_1615_ & 0xff00ff) * i_1616_ + (i_1618_ & 0xff00ff) * i_1617_) & ~0xff00ff) + (((i_1615_ & 0xff00) * i_1616_ + (i_1618_ & 0xff00) * i_1617_) & 0xff0000)) >> 8;
									i_1557_ += i_1562_;
								}
								i_1558_ += i_1563_;
								i_1557_ = i_1611_;
								i_1566_ += i_1567_;
							}
						} else {
							int i_1619_ = (i_1554_ & 0xff0000) >> 16;
							int i_1620_ = (i_1554_ & 0xff00) >> 8;
							int i_1621_ = i_1554_ & 0xff;
							for (int i_1622_ = -i_1552_; i_1622_ < 0; i_1622_++) {
								int i_1623_ = (i_1558_ >> 16) * anInt8945;
								for (int i_1624_ = -i_1551_; i_1624_ < 0; i_1624_++) {
									int i_1625_ = (anIntArray11346[(i_1557_ >> 16) + i_1623_]);
									int i_1626_ = ((i_1625_ >>> 24) * (i_1554_ >>> 24) >> 8);
									int i_1627_ = 256 - i_1626_;
									if (i_1626_ != 255) {
										int i_1628_ = ((i_1625_ & 0xff0000) * i_1619_ & ~0xffffff);
										int i_1629_ = ((i_1625_ & 0xff00) * i_1620_ & 0xff0000);
										int i_1630_ = ((i_1625_ & 0xff) * i_1621_ & 0xff00);
										i_1625_ = (i_1628_ | i_1629_ | i_1630_) >>> 8;
										int i_1631_ = is[i_1566_];
										is[i_1566_++] = ((((i_1625_ & 0xff00ff) * i_1626_ + ((i_1631_ & 0xff00ff) * i_1627_)) & ~0xff00ff) + (((i_1625_ & 0xff00) * i_1626_ + ((i_1631_ & 0xff00) * i_1627_)) & 0xff0000)) >> 8;
									} else {
										int i_1632_ = ((i_1625_ & 0xff0000) * i_1619_ & ~0xffffff);
										int i_1633_ = ((i_1625_ & 0xff00) * i_1620_ & 0xff0000);
										int i_1634_ = ((i_1625_ & 0xff) * i_1621_ & 0xff00);
										is[i_1566_++] = (i_1632_ | i_1633_ | i_1634_) >>> 8;
									}
									i_1557_ += i_1562_;
								}
								i_1558_ += i_1563_;
								i_1557_ = i_1611_;
								i_1566_ += i_1567_;
							}
						}
					} else if (i_1553_ == 3) {
						int i_1635_ = i_1557_;
						for (int i_1636_ = -i_1552_; i_1636_ < 0; i_1636_++) {
							int i_1637_ = (i_1558_ >> 16) * anInt8945;
							for (int i_1638_ = -i_1551_; i_1638_ < 0; i_1638_++) {
								int i_1639_ = (anIntArray11346[(i_1557_ >> 16) + i_1637_]);
								int i_1640_ = i_1639_ + i_1554_;
								int i_1641_ = ((i_1639_ & 0xff00ff) + (i_1554_ & 0xff00ff));
								int i_1642_ = ((i_1641_ & 0x1000100) + (i_1640_ - i_1641_ & 0x10000));
								i_1642_ = i_1640_ - i_1642_ | i_1642_ - (i_1642_ >>> 8);
								int i_1643_ = (i_1642_ >>> 24) * (i_1554_ >>> 24) >> 8;
								int i_1644_ = 256 - i_1643_;
								if (i_1643_ != 255) {
									i_1639_ = i_1642_;
									i_1642_ = is[i_1566_];
									i_1642_ = ((((i_1639_ & 0xff00ff) * i_1643_ + (i_1642_ & 0xff00ff) * i_1644_) & ~0xff00ff) + (((i_1639_ & 0xff00) * i_1643_ + (i_1642_ & 0xff00) * i_1644_) & 0xff0000)) >> 8;
								}
								is[i_1566_++] = i_1642_;
								i_1557_ += i_1562_;
							}
							i_1558_ += i_1563_;
							i_1557_ = i_1635_;
							i_1566_ += i_1567_;
						}
					} else if (i_1553_ == 2) {
						int i_1645_ = i_1554_ >>> 24;
						int i_1646_ = 256 - i_1645_;
						int i_1647_ = (i_1554_ & 0xff00ff) * i_1646_ & ~0xff00ff;
						int i_1648_ = (i_1554_ & 0xff00) * i_1646_ & 0xff0000;
						i_1554_ = (i_1647_ | i_1648_) >>> 8;
						int i_1649_ = i_1557_;
						for (int i_1650_ = -i_1552_; i_1650_ < 0; i_1650_++) {
							int i_1651_ = (i_1558_ >> 16) * anInt8945;
							for (int i_1652_ = -i_1551_; i_1652_ < 0; i_1652_++) {
								int i_1653_ = (anIntArray11346[(i_1557_ >> 16) + i_1651_]);
								int i_1654_ = i_1653_ >>> 24;
								int i_1655_ = 256 - i_1654_;
								i_1647_ = ((i_1653_ & 0xff00ff) * i_1645_ & ~0xff00ff);
								i_1648_ = (i_1653_ & 0xff00) * i_1645_ & 0xff0000;
								i_1653_ = ((i_1647_ | i_1648_) >>> 8) + i_1554_;
								int i_1656_ = is[i_1566_];
								is[i_1566_++] = ((((i_1653_ & 0xff00ff) * i_1654_ + (i_1656_ & 0xff00ff) * i_1655_) & ~0xff00ff) + (((i_1653_ & 0xff00) * i_1654_ + (i_1656_ & 0xff00) * i_1655_) & 0xff0000)) >> 8;
								i_1557_ += i_1562_;
							}
							i_1558_ += i_1563_;
							i_1557_ = i_1649_;
							i_1566_ += i_1567_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1555_ == 2) {
					if (i_1553_ == 1) {
						int i_1657_ = i_1557_;
						for (int i_1658_ = -i_1552_; i_1658_ < 0; i_1658_++) {
							int i_1659_ = (i_1558_ >> 16) * anInt8945;
							for (int i_1660_ = -i_1551_; i_1660_ < 0; i_1660_++) {
								int i_1661_ = (anIntArray11346[(i_1557_ >> 16) + i_1659_]);
								if (i_1661_ != 0) {
									int i_1662_ = is[i_1566_];
									int i_1663_ = i_1661_ + i_1662_;
									int i_1664_ = ((i_1661_ & 0xff00ff) + (i_1662_ & 0xff00ff));
									i_1662_ = ((i_1664_ & 0x1000100) + (i_1663_ - i_1664_ & 0x10000));
									is[i_1566_++] = (i_1663_ - i_1662_ | i_1662_ - (i_1662_ >>> 8));
								} else
									i_1566_++;
								i_1557_ += i_1562_;
							}
							i_1558_ += i_1563_;
							i_1557_ = i_1657_;
							i_1566_ += i_1567_;
						}
					} else if (i_1553_ == 0) {
						int i_1665_ = i_1557_;
						int i_1666_ = (i_1554_ & 0xff0000) >> 16;
						int i_1667_ = (i_1554_ & 0xff00) >> 8;
						int i_1668_ = i_1554_ & 0xff;
						for (int i_1669_ = -i_1552_; i_1669_ < 0; i_1669_++) {
							int i_1670_ = (i_1558_ >> 16) * anInt8945;
							for (int i_1671_ = -i_1551_; i_1671_ < 0; i_1671_++) {
								int i_1672_ = (anIntArray11346[(i_1557_ >> 16) + i_1670_]);
								if (i_1672_ != 0) {
									int i_1673_ = ((i_1672_ & 0xff0000) * i_1666_ & ~0xffffff);
									int i_1674_ = ((i_1672_ & 0xff00) * i_1667_ & 0xff0000);
									int i_1675_ = (i_1672_ & 0xff) * i_1668_ & 0xff00;
									i_1672_ = (i_1673_ | i_1674_ | i_1675_) >>> 8;
									int i_1676_ = is[i_1566_];
									int i_1677_ = i_1672_ + i_1676_;
									int i_1678_ = ((i_1672_ & 0xff00ff) + (i_1676_ & 0xff00ff));
									i_1676_ = ((i_1678_ & 0x1000100) + (i_1677_ - i_1678_ & 0x10000));
									is[i_1566_++] = (i_1677_ - i_1676_ | i_1676_ - (i_1676_ >>> 8));
								} else
									i_1566_++;
								i_1557_ += i_1562_;
							}
							i_1558_ += i_1563_;
							i_1557_ = i_1665_;
							i_1566_ += i_1567_;
						}
					} else if (i_1553_ == 3) {
						int i_1679_ = i_1557_;
						for (int i_1680_ = -i_1552_; i_1680_ < 0; i_1680_++) {
							int i_1681_ = (i_1558_ >> 16) * anInt8945;
							for (int i_1682_ = -i_1551_; i_1682_ < 0; i_1682_++) {
								int i_1683_ = (anIntArray11346[(i_1557_ >> 16) + i_1681_]);
								int i_1684_ = i_1683_ + i_1554_;
								int i_1685_ = ((i_1683_ & 0xff00ff) + (i_1554_ & 0xff00ff));
								int i_1686_ = ((i_1685_ & 0x1000100) + (i_1684_ - i_1685_ & 0x10000));
								i_1683_ = i_1684_ - i_1686_ | i_1686_ - (i_1686_ >>> 8);
								i_1686_ = is[i_1566_];
								i_1684_ = i_1683_ + i_1686_;
								i_1685_ = (i_1683_ & 0xff00ff) + (i_1686_ & 0xff00ff);
								i_1686_ = ((i_1685_ & 0x1000100) + (i_1684_ - i_1685_ & 0x10000));
								is[i_1566_++] = i_1684_ - i_1686_ | i_1686_ - (i_1686_ >>> 8);
								i_1557_ += i_1562_;
							}
							i_1558_ += i_1563_;
							i_1557_ = i_1679_;
							i_1566_ += i_1567_;
						}
					} else if (i_1553_ == 2) {
						int i_1687_ = i_1554_ >>> 24;
						int i_1688_ = 256 - i_1687_;
						int i_1689_ = (i_1554_ & 0xff00ff) * i_1688_ & ~0xff00ff;
						int i_1690_ = (i_1554_ & 0xff00) * i_1688_ & 0xff0000;
						i_1554_ = (i_1689_ | i_1690_) >>> 8;
						int i_1691_ = i_1557_;
						for (int i_1692_ = -i_1552_; i_1692_ < 0; i_1692_++) {
							int i_1693_ = (i_1558_ >> 16) * anInt8945;
							for (int i_1694_ = -i_1551_; i_1694_ < 0; i_1694_++) {
								int i_1695_ = (anIntArray11346[(i_1557_ >> 16) + i_1693_]);
								if (i_1695_ != 0) {
									i_1689_ = ((i_1695_ & 0xff00ff) * i_1687_ & ~0xff00ff);
									i_1690_ = ((i_1695_ & 0xff00) * i_1687_ & 0xff0000);
									i_1695_ = (((i_1689_ | i_1690_) >>> 8) + i_1554_);
									int i_1696_ = is[i_1566_];
									int i_1697_ = i_1695_ + i_1696_;
									int i_1698_ = ((i_1695_ & 0xff00ff) + (i_1696_ & 0xff00ff));
									i_1696_ = ((i_1698_ & 0x1000100) + (i_1697_ - i_1698_ & 0x10000));
									is[i_1566_++] = (i_1697_ - i_1696_ | i_1696_ - (i_1696_ >>> 8));
								} else
									i_1566_++;
								i_1557_ += i_1562_;
							}
							i_1558_ += i_1563_;
							i_1557_ = i_1691_;
							i_1566_ += i_1567_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method1730(int i, int i_1699_, Class161 class161, int i_1700_, int i_1701_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			i += anInt8977;
			i_1699_ += anInt8947;
			int i_1702_ = 0;
			int i_1703_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			int i_1704_ = anInt8945;
			int i_1705_ = anInt8950;
			int i_1706_ = i_1703_ - i_1704_;
			int i_1707_ = 0;
			int i_1708_ = i + i_1699_ * i_1703_;
			if (i_1699_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_1709_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_1699_;
				i_1705_ -= i_1709_;
				i_1699_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_1702_ += i_1709_ * i_1704_;
				i_1708_ += i_1709_ * i_1703_;
			}
			if (i_1699_ + i_1705_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_1705_ -= (i_1699_ + i_1705_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_1710_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_1704_ -= i_1710_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_1702_ += i_1710_;
				i_1708_ += i_1710_;
				i_1707_ += i_1710_;
				i_1706_ += i_1710_;
			}
			if (i + i_1704_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_1711_ = i + i_1704_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_1704_ -= i_1711_;
				i_1707_ += i_1711_;
				i_1706_ += i_1711_;
			}
			if (i_1704_ > 0 && i_1705_ > 0) {
				Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
				int[] is_1712_ = class161_sub2.anIntArray9444;
				int[] is_1713_ = class161_sub2.anIntArray9445;
				int i_1714_ = i_1699_;
				if (i_1701_ > i_1714_) {
					i_1714_ = i_1701_;
					i_1708_ += (i_1701_ - i_1699_) * i_1703_;
					i_1702_ += (i_1701_ - i_1699_) * anInt8945;
				}
				int i_1715_ = (i_1701_ + is_1712_.length < i_1699_ + i_1705_ ? i_1701_ + is_1712_.length : i_1699_ + i_1705_);
				for (int i_1716_ = i_1714_; i_1716_ < i_1715_; i_1716_++) {
					int i_1717_ = is_1712_[i_1716_ - i_1701_] + i_1700_;
					int i_1718_ = is_1713_[i_1716_ - i_1701_];
					int i_1719_ = i_1704_;
					if (i > i_1717_) {
						int i_1720_ = i - i_1717_;
						if (i_1720_ >= i_1718_) {
							i_1702_ += i_1704_ + i_1707_;
							i_1708_ += i_1704_ + i_1706_;
							continue;
						}
						i_1718_ -= i_1720_;
					} else {
						int i_1721_ = i_1717_ - i;
						if (i_1721_ >= i_1704_) {
							i_1702_ += i_1704_ + i_1707_;
							i_1708_ += i_1704_ + i_1706_;
							continue;
						}
						i_1702_ += i_1721_;
						i_1719_ -= i_1721_;
						i_1708_ += i_1721_;
					}
					int i_1722_ = 0;
					if (i_1719_ < i_1718_)
						i_1718_ = i_1719_;
					else
						i_1722_ = i_1719_ - i_1718_;
					for (int i_1723_ = -i_1718_; i_1723_ < 0; i_1723_++) {
						int i_1724_ = anIntArray11346[i_1702_++];
						int i_1725_ = i_1724_ >>> 24;
						int i_1726_ = 256 - i_1725_;
						int i_1727_ = is[i_1708_];
						is[i_1708_++] = ((((i_1724_ & 0xff00ff) * i_1725_ + (i_1727_ & 0xff00ff) * i_1726_) & ~0xff00ff) + (((i_1724_ & 0xff00) * i_1725_ + (i_1727_ & 0xff00) * i_1726_) & 0xff0000)) >> 8;
					}
					i_1702_ += i_1722_ + i_1707_;
					i_1708_ += i_1722_ + i_1706_;
				}
			}
		}
	}

	void method8438(int i, int i_1728_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_1729_ = anInt8957;
					while (i_1729_ < 0) {
						int i_1730_ = anInt8959;
						int i_1731_ = anInt8966;
						int i_1732_ = anInt8967;
						int i_1733_ = anInt8955;
						if (i_1731_ >= 0 && i_1732_ >= 0 && i_1731_ - (anInt8945 << 12) < 0 && i_1732_ - (anInt8950 << 12) < 0) {
							for (/**/; i_1733_ < 0; i_1733_++)
								method10510(((i_1732_ >> 12) * anInt8945 + (i_1731_ >> 12)), i_1730_++, is, i, i_1728_);
						}
						i_1729_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_1734_ = anInt8957;
					while (i_1734_ < 0) {
						int i_1735_ = anInt8959;
						int i_1736_ = anInt8966;
						int i_1737_ = anInt8967 + anInt8969;
						int i_1738_ = anInt8955;
						if (i_1736_ >= 0 && i_1736_ - (anInt8945 << 12) < 0) {
							int i_1739_;
							if ((i_1739_ = i_1737_ - (anInt8950 << 12)) >= 0) {
								i_1739_ = (anInt8962 - i_1739_) / anInt8962;
								i_1738_ += i_1739_;
								i_1737_ += anInt8962 * i_1739_;
								i_1735_ += i_1739_;
							}
							if ((i_1739_ = (i_1737_ - anInt8962) / anInt8962) > i_1738_)
								i_1738_ = i_1739_;
							for (/**/; i_1738_ < 0; i_1738_++) {
								method10510(((i_1737_ >> 12) * anInt8945 + (i_1736_ >> 12)), i_1735_++, is, i, i_1728_);
								i_1737_ += anInt8962;
							}
						}
						i_1734_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_1740_ = anInt8957;
					while (i_1740_ < 0) {
						int i_1741_ = anInt8959;
						int i_1742_ = anInt8966;
						int i_1743_ = anInt8967 + anInt8969;
						int i_1744_ = anInt8955;
						if (i_1742_ >= 0 && i_1742_ - (anInt8945 << 12) < 0) {
							if (i_1743_ < 0) {
								int i_1745_ = (anInt8962 - 1 - i_1743_) / anInt8962;
								i_1744_ += i_1745_;
								i_1743_ += anInt8962 * i_1745_;
								i_1741_ += i_1745_;
							}
							int i_1746_;
							if ((i_1746_ = (1 + i_1743_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_1744_)
								i_1744_ = i_1746_;
							for (/**/; i_1744_ < 0; i_1744_++) {
								method10510(((i_1743_ >> 12) * anInt8945 + (i_1742_ >> 12)), i_1741_++, is, i, i_1728_);
								i_1743_ += anInt8962;
							}
						}
						i_1740_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_1747_ = anInt8957;
					while (i_1747_ < 0) {
						int i_1748_ = anInt8959;
						int i_1749_ = anInt8966 + anInt8968;
						int i_1750_ = anInt8967;
						int i_1751_ = anInt8955;
						if (i_1750_ >= 0 && i_1750_ - (anInt8950 << 12) < 0) {
							int i_1752_;
							if ((i_1752_ = i_1749_ - (anInt8945 << 12)) >= 0) {
								i_1752_ = (anInt8960 - i_1752_) / anInt8960;
								i_1751_ += i_1752_;
								i_1749_ += anInt8960 * i_1752_;
								i_1748_ += i_1752_;
							}
							if ((i_1752_ = (i_1749_ - anInt8960) / anInt8960) > i_1751_)
								i_1751_ = i_1752_;
							for (/**/; i_1751_ < 0; i_1751_++) {
								method10510(((i_1750_ >> 12) * anInt8945 + (i_1749_ >> 12)), i_1748_++, is, i, i_1728_);
								i_1749_ += anInt8960;
							}
						}
						i_1747_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_1753_ = anInt8957;
					while (i_1753_ < 0) {
						int i_1754_ = anInt8959;
						int i_1755_ = anInt8966 + anInt8968;
						int i_1756_ = anInt8967 + anInt8969;
						int i_1757_ = anInt8955;
						int i_1758_;
						if ((i_1758_ = i_1755_ - (anInt8945 << 12)) >= 0) {
							i_1758_ = (anInt8960 - i_1758_) / anInt8960;
							i_1757_ += i_1758_;
							i_1755_ += anInt8960 * i_1758_;
							i_1756_ += anInt8962 * i_1758_;
							i_1754_ += i_1758_;
						}
						if ((i_1758_ = (i_1755_ - anInt8960) / anInt8960) > i_1757_)
							i_1757_ = i_1758_;
						if ((i_1758_ = i_1756_ - (anInt8950 << 12)) >= 0) {
							i_1758_ = (anInt8962 - i_1758_) / anInt8962;
							i_1757_ += i_1758_;
							i_1755_ += anInt8960 * i_1758_;
							i_1756_ += anInt8962 * i_1758_;
							i_1754_ += i_1758_;
						}
						if ((i_1758_ = (i_1756_ - anInt8962) / anInt8962) > i_1757_)
							i_1757_ = i_1758_;
						for (/**/; i_1757_ < 0; i_1757_++) {
							method10510((i_1756_ >> 12) * anInt8945 + (i_1755_ >> 12), i_1754_++, is, i, i_1728_);
							i_1755_ += anInt8960;
							i_1756_ += anInt8962;
						}
						i_1753_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_1759_ = anInt8957;
					while (i_1759_ < 0) {
						int i_1760_ = anInt8959;
						int i_1761_ = anInt8966 + anInt8968;
						int i_1762_ = anInt8967 + anInt8969;
						int i_1763_ = anInt8955;
						int i_1764_;
						if ((i_1764_ = i_1761_ - (anInt8945 << 12)) >= 0) {
							i_1764_ = (anInt8960 - i_1764_) / anInt8960;
							i_1763_ += i_1764_;
							i_1761_ += anInt8960 * i_1764_;
							i_1762_ += anInt8962 * i_1764_;
							i_1760_ += i_1764_;
						}
						if ((i_1764_ = (i_1761_ - anInt8960) / anInt8960) > i_1763_)
							i_1763_ = i_1764_;
						if (i_1762_ < 0) {
							i_1764_ = (anInt8962 - 1 - i_1762_) / anInt8962;
							i_1763_ += i_1764_;
							i_1761_ += anInt8960 * i_1764_;
							i_1762_ += anInt8962 * i_1764_;
							i_1760_ += i_1764_;
						}
						if ((i_1764_ = (1 + i_1762_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_1763_)
							i_1763_ = i_1764_;
						for (/**/; i_1763_ < 0; i_1763_++) {
							method10510((i_1762_ >> 12) * anInt8945 + (i_1761_ >> 12), i_1760_++, is, i, i_1728_);
							i_1761_ += anInt8960;
							i_1762_ += anInt8962;
						}
						i_1759_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_1765_ = anInt8957;
				while (i_1765_ < 0) {
					int i_1766_ = anInt8959;
					int i_1767_ = anInt8966 + anInt8968;
					int i_1768_ = anInt8967;
					int i_1769_ = anInt8955;
					if (i_1768_ >= 0 && i_1768_ - (anInt8950 << 12) < 0) {
						if (i_1767_ < 0) {
							int i_1770_ = (anInt8960 - 1 - i_1767_) / anInt8960;
							i_1769_ += i_1770_;
							i_1767_ += anInt8960 * i_1770_;
							i_1766_ += i_1770_;
						}
						int i_1771_;
						if ((i_1771_ = (1 + i_1767_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_1769_)
							i_1769_ = i_1771_;
						for (/**/; i_1769_ < 0; i_1769_++) {
							method10510((i_1768_ >> 12) * anInt8945 + (i_1767_ >> 12), i_1766_++, is, i, i_1728_);
							i_1767_ += anInt8960;
						}
					}
					i_1765_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				for (int i_1772_ = anInt8957; i_1772_ < 0; i_1772_++) {
					int i_1773_ = anInt8959;
					int i_1774_ = anInt8966 + anInt8968;
					int i_1775_ = anInt8967 + anInt8969;
					int i_1776_ = anInt8955;
					if (i_1774_ < 0) {
						int i_1777_ = (anInt8960 - 1 - i_1774_) / anInt8960;
						i_1776_ += i_1777_;
						i_1774_ += anInt8960 * i_1777_;
						i_1775_ += anInt8962 * i_1777_;
						i_1773_ += i_1777_;
					}
					int i_1778_;
					if ((i_1778_ = (1 + i_1774_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_1776_)
						i_1776_ = i_1778_;
					if ((i_1778_ = i_1775_ - (anInt8950 << 12)) >= 0) {
						i_1778_ = (anInt8962 - i_1778_) / anInt8962;
						i_1776_ += i_1778_;
						i_1774_ += anInt8960 * i_1778_;
						i_1775_ += anInt8962 * i_1778_;
						i_1773_ += i_1778_;
					}
					if ((i_1778_ = (i_1775_ - anInt8962) / anInt8962) > i_1776_)
						i_1776_ = i_1778_;
					for (/**/; i_1776_ < 0; i_1776_++) {
						method10510((i_1775_ >> 12) * anInt8945 + (i_1774_ >> 12), i_1773_++, is, i, i_1728_);
						i_1774_ += anInt8960;
						i_1775_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				for (int i_1779_ = anInt8957; i_1779_ < 0; i_1779_++) {
					int i_1780_ = anInt8959;
					int i_1781_ = anInt8966 + anInt8968;
					int i_1782_ = anInt8967 + anInt8969;
					int i_1783_ = anInt8955;
					if (i_1781_ < 0) {
						int i_1784_ = (anInt8960 - 1 - i_1781_) / anInt8960;
						i_1783_ += i_1784_;
						i_1781_ += anInt8960 * i_1784_;
						i_1782_ += anInt8962 * i_1784_;
						i_1780_ += i_1784_;
					}
					int i_1785_;
					if ((i_1785_ = (1 + i_1781_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_1783_)
						i_1783_ = i_1785_;
					if (i_1782_ < 0) {
						i_1785_ = (anInt8962 - 1 - i_1782_) / anInt8962;
						i_1783_ += i_1785_;
						i_1781_ += anInt8960 * i_1785_;
						i_1782_ += anInt8962 * i_1785_;
						i_1780_ += i_1785_;
					}
					if ((i_1785_ = (1 + i_1782_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_1783_)
						i_1783_ = i_1785_;
					for (/**/; i_1783_ < 0; i_1783_++) {
						method10510((i_1782_ >> 12) * anInt8945 + (i_1781_ >> 12), i_1780_++, is, i, i_1728_);
						i_1781_ += anInt8960;
						i_1782_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	void method8433(int i, int i_1786_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_1787_ = anInt8957;
					while (i_1787_ < 0) {
						int i_1788_ = anInt8959;
						int i_1789_ = anInt8966;
						int i_1790_ = anInt8967;
						int i_1791_ = anInt8955;
						if (i_1789_ >= 0 && i_1790_ >= 0 && i_1789_ - (anInt8945 << 12) < 0 && i_1790_ - (anInt8950 << 12) < 0) {
							for (/**/; i_1791_ < 0; i_1791_++)
								method10510(((i_1790_ >> 12) * anInt8945 + (i_1789_ >> 12)), i_1788_++, is, i, i_1786_);
						}
						i_1787_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_1792_ = anInt8957;
					while (i_1792_ < 0) {
						int i_1793_ = anInt8959;
						int i_1794_ = anInt8966;
						int i_1795_ = anInt8967 + anInt8969;
						int i_1796_ = anInt8955;
						if (i_1794_ >= 0 && i_1794_ - (anInt8945 << 12) < 0) {
							int i_1797_;
							if ((i_1797_ = i_1795_ - (anInt8950 << 12)) >= 0) {
								i_1797_ = (anInt8962 - i_1797_) / anInt8962;
								i_1796_ += i_1797_;
								i_1795_ += anInt8962 * i_1797_;
								i_1793_ += i_1797_;
							}
							if ((i_1797_ = (i_1795_ - anInt8962) / anInt8962) > i_1796_)
								i_1796_ = i_1797_;
							for (/**/; i_1796_ < 0; i_1796_++) {
								method10510(((i_1795_ >> 12) * anInt8945 + (i_1794_ >> 12)), i_1793_++, is, i, i_1786_);
								i_1795_ += anInt8962;
							}
						}
						i_1792_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_1798_ = anInt8957;
					while (i_1798_ < 0) {
						int i_1799_ = anInt8959;
						int i_1800_ = anInt8966;
						int i_1801_ = anInt8967 + anInt8969;
						int i_1802_ = anInt8955;
						if (i_1800_ >= 0 && i_1800_ - (anInt8945 << 12) < 0) {
							if (i_1801_ < 0) {
								int i_1803_ = (anInt8962 - 1 - i_1801_) / anInt8962;
								i_1802_ += i_1803_;
								i_1801_ += anInt8962 * i_1803_;
								i_1799_ += i_1803_;
							}
							int i_1804_;
							if ((i_1804_ = (1 + i_1801_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_1802_)
								i_1802_ = i_1804_;
							for (/**/; i_1802_ < 0; i_1802_++) {
								method10510(((i_1801_ >> 12) * anInt8945 + (i_1800_ >> 12)), i_1799_++, is, i, i_1786_);
								i_1801_ += anInt8962;
							}
						}
						i_1798_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_1805_ = anInt8957;
					while (i_1805_ < 0) {
						int i_1806_ = anInt8959;
						int i_1807_ = anInt8966 + anInt8968;
						int i_1808_ = anInt8967;
						int i_1809_ = anInt8955;
						if (i_1808_ >= 0 && i_1808_ - (anInt8950 << 12) < 0) {
							int i_1810_;
							if ((i_1810_ = i_1807_ - (anInt8945 << 12)) >= 0) {
								i_1810_ = (anInt8960 - i_1810_) / anInt8960;
								i_1809_ += i_1810_;
								i_1807_ += anInt8960 * i_1810_;
								i_1806_ += i_1810_;
							}
							if ((i_1810_ = (i_1807_ - anInt8960) / anInt8960) > i_1809_)
								i_1809_ = i_1810_;
							for (/**/; i_1809_ < 0; i_1809_++) {
								method10510(((i_1808_ >> 12) * anInt8945 + (i_1807_ >> 12)), i_1806_++, is, i, i_1786_);
								i_1807_ += anInt8960;
							}
						}
						i_1805_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_1811_ = anInt8957;
					while (i_1811_ < 0) {
						int i_1812_ = anInt8959;
						int i_1813_ = anInt8966 + anInt8968;
						int i_1814_ = anInt8967 + anInt8969;
						int i_1815_ = anInt8955;
						int i_1816_;
						if ((i_1816_ = i_1813_ - (anInt8945 << 12)) >= 0) {
							i_1816_ = (anInt8960 - i_1816_) / anInt8960;
							i_1815_ += i_1816_;
							i_1813_ += anInt8960 * i_1816_;
							i_1814_ += anInt8962 * i_1816_;
							i_1812_ += i_1816_;
						}
						if ((i_1816_ = (i_1813_ - anInt8960) / anInt8960) > i_1815_)
							i_1815_ = i_1816_;
						if ((i_1816_ = i_1814_ - (anInt8950 << 12)) >= 0) {
							i_1816_ = (anInt8962 - i_1816_) / anInt8962;
							i_1815_ += i_1816_;
							i_1813_ += anInt8960 * i_1816_;
							i_1814_ += anInt8962 * i_1816_;
							i_1812_ += i_1816_;
						}
						if ((i_1816_ = (i_1814_ - anInt8962) / anInt8962) > i_1815_)
							i_1815_ = i_1816_;
						for (/**/; i_1815_ < 0; i_1815_++) {
							method10510((i_1814_ >> 12) * anInt8945 + (i_1813_ >> 12), i_1812_++, is, i, i_1786_);
							i_1813_ += anInt8960;
							i_1814_ += anInt8962;
						}
						i_1811_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_1817_ = anInt8957;
					while (i_1817_ < 0) {
						int i_1818_ = anInt8959;
						int i_1819_ = anInt8966 + anInt8968;
						int i_1820_ = anInt8967 + anInt8969;
						int i_1821_ = anInt8955;
						int i_1822_;
						if ((i_1822_ = i_1819_ - (anInt8945 << 12)) >= 0) {
							i_1822_ = (anInt8960 - i_1822_) / anInt8960;
							i_1821_ += i_1822_;
							i_1819_ += anInt8960 * i_1822_;
							i_1820_ += anInt8962 * i_1822_;
							i_1818_ += i_1822_;
						}
						if ((i_1822_ = (i_1819_ - anInt8960) / anInt8960) > i_1821_)
							i_1821_ = i_1822_;
						if (i_1820_ < 0) {
							i_1822_ = (anInt8962 - 1 - i_1820_) / anInt8962;
							i_1821_ += i_1822_;
							i_1819_ += anInt8960 * i_1822_;
							i_1820_ += anInt8962 * i_1822_;
							i_1818_ += i_1822_;
						}
						if ((i_1822_ = (1 + i_1820_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_1821_)
							i_1821_ = i_1822_;
						for (/**/; i_1821_ < 0; i_1821_++) {
							method10510((i_1820_ >> 12) * anInt8945 + (i_1819_ >> 12), i_1818_++, is, i, i_1786_);
							i_1819_ += anInt8960;
							i_1820_ += anInt8962;
						}
						i_1817_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_1823_ = anInt8957;
				while (i_1823_ < 0) {
					int i_1824_ = anInt8959;
					int i_1825_ = anInt8966 + anInt8968;
					int i_1826_ = anInt8967;
					int i_1827_ = anInt8955;
					if (i_1826_ >= 0 && i_1826_ - (anInt8950 << 12) < 0) {
						if (i_1825_ < 0) {
							int i_1828_ = (anInt8960 - 1 - i_1825_) / anInt8960;
							i_1827_ += i_1828_;
							i_1825_ += anInt8960 * i_1828_;
							i_1824_ += i_1828_;
						}
						int i_1829_;
						if ((i_1829_ = (1 + i_1825_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_1827_)
							i_1827_ = i_1829_;
						for (/**/; i_1827_ < 0; i_1827_++) {
							method10510((i_1826_ >> 12) * anInt8945 + (i_1825_ >> 12), i_1824_++, is, i, i_1786_);
							i_1825_ += anInt8960;
						}
					}
					i_1823_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				for (int i_1830_ = anInt8957; i_1830_ < 0; i_1830_++) {
					int i_1831_ = anInt8959;
					int i_1832_ = anInt8966 + anInt8968;
					int i_1833_ = anInt8967 + anInt8969;
					int i_1834_ = anInt8955;
					if (i_1832_ < 0) {
						int i_1835_ = (anInt8960 - 1 - i_1832_) / anInt8960;
						i_1834_ += i_1835_;
						i_1832_ += anInt8960 * i_1835_;
						i_1833_ += anInt8962 * i_1835_;
						i_1831_ += i_1835_;
					}
					int i_1836_;
					if ((i_1836_ = (1 + i_1832_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_1834_)
						i_1834_ = i_1836_;
					if ((i_1836_ = i_1833_ - (anInt8950 << 12)) >= 0) {
						i_1836_ = (anInt8962 - i_1836_) / anInt8962;
						i_1834_ += i_1836_;
						i_1832_ += anInt8960 * i_1836_;
						i_1833_ += anInt8962 * i_1836_;
						i_1831_ += i_1836_;
					}
					if ((i_1836_ = (i_1833_ - anInt8962) / anInt8962) > i_1834_)
						i_1834_ = i_1836_;
					for (/**/; i_1834_ < 0; i_1834_++) {
						method10510((i_1833_ >> 12) * anInt8945 + (i_1832_ >> 12), i_1831_++, is, i, i_1786_);
						i_1832_ += anInt8960;
						i_1833_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				for (int i_1837_ = anInt8957; i_1837_ < 0; i_1837_++) {
					int i_1838_ = anInt8959;
					int i_1839_ = anInt8966 + anInt8968;
					int i_1840_ = anInt8967 + anInt8969;
					int i_1841_ = anInt8955;
					if (i_1839_ < 0) {
						int i_1842_ = (anInt8960 - 1 - i_1839_) / anInt8960;
						i_1841_ += i_1842_;
						i_1839_ += anInt8960 * i_1842_;
						i_1840_ += anInt8962 * i_1842_;
						i_1838_ += i_1842_;
					}
					int i_1843_;
					if ((i_1843_ = (1 + i_1839_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_1841_)
						i_1841_ = i_1843_;
					if (i_1840_ < 0) {
						i_1843_ = (anInt8962 - 1 - i_1840_) / anInt8962;
						i_1841_ += i_1843_;
						i_1839_ += anInt8960 * i_1843_;
						i_1840_ += anInt8962 * i_1843_;
						i_1838_ += i_1843_;
					}
					if ((i_1843_ = (1 + i_1840_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_1841_)
						i_1841_ = i_1843_;
					for (/**/; i_1841_ < 0; i_1841_++) {
						method10510((i_1840_ >> 12) * anInt8945 + (i_1839_ >> 12), i_1838_++, is, i, i_1786_);
						i_1839_ += anInt8960;
						i_1840_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	public void method1743(int i, int i_1844_, int i_1845_, int i_1846_, int[] is, int i_1847_, int i_1848_) {
		i_1848_ -= i_1845_;
		for (int i_1849_ = 0; i_1849_ < i_1846_; i_1849_++) {
			int i_1850_ = (i_1844_ + i_1849_) * i_1845_ + i;
			for (int i_1851_ = 0; i_1851_ < i_1845_; i_1851_++)
				anIntArray11346[i_1850_ + i_1851_] = is[i_1847_++];
			i_1847_ += i_1848_;
		}
	}

	public void method1755(int i, int i_1852_, int i_1853_, int i_1854_, int i_1855_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			int i_1856_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			i += anInt8977;
			i_1852_ += anInt8947;
			int i_1857_ = i_1852_ * i_1856_ + i;
			int i_1858_ = 0;
			int i_1859_ = anInt8950;
			int i_1860_ = anInt8945;
			int i_1861_ = i_1856_ - i_1860_;
			int i_1862_ = 0;
			if (i_1852_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_1863_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_1852_;
				i_1859_ -= i_1863_;
				i_1852_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_1858_ += i_1863_ * i_1860_;
				i_1857_ += i_1863_ * i_1856_;
			}
			if (i_1852_ + i_1859_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_1859_ -= (i_1852_ + i_1859_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_1864_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_1860_ -= i_1864_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_1858_ += i_1864_;
				i_1857_ += i_1864_;
				i_1862_ += i_1864_;
				i_1861_ += i_1864_;
			}
			if (i + i_1860_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_1865_ = i + i_1860_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_1860_ -= i_1865_;
				i_1862_ += i_1865_;
				i_1861_ += i_1865_;
			}
			if (i_1860_ > 0 && i_1859_ > 0) {
				if (i_1855_ == 0) {
					if (i_1853_ == 1) {
						for (int i_1866_ = -i_1859_; i_1866_ < 0; i_1866_++) {
							int i_1867_ = i_1857_ + i_1860_ - 3;
							while (i_1857_ < i_1867_) {
								is[i_1857_++] = anIntArray11346[i_1858_++];
								is[i_1857_++] = anIntArray11346[i_1858_++];
								is[i_1857_++] = anIntArray11346[i_1858_++];
								is[i_1857_++] = anIntArray11346[i_1858_++];
							}
							i_1867_ += 3;
							while (i_1857_ < i_1867_)
								is[i_1857_++] = anIntArray11346[i_1858_++];
							i_1857_ += i_1861_;
							i_1858_ += i_1862_;
						}
					} else if (i_1853_ == 0) {
						int i_1868_ = (i_1854_ & 0xff0000) >> 16;
						int i_1869_ = (i_1854_ & 0xff00) >> 8;
						int i_1870_ = i_1854_ & 0xff;
						for (int i_1871_ = -i_1859_; i_1871_ < 0; i_1871_++) {
							for (int i_1872_ = -i_1860_; i_1872_ < 0; i_1872_++) {
								int i_1873_ = anIntArray11346[i_1858_++];
								int i_1874_ = ((i_1873_ & 0xff0000) * i_1868_ & ~0xffffff);
								int i_1875_ = (i_1873_ & 0xff00) * i_1869_ & 0xff0000;
								int i_1876_ = (i_1873_ & 0xff) * i_1870_ & 0xff00;
								is[i_1857_++] = (i_1874_ | i_1875_ | i_1876_) >>> 8;
							}
							i_1857_ += i_1861_;
							i_1858_ += i_1862_;
						}
					} else if (i_1853_ == 3) {
						for (int i_1877_ = -i_1859_; i_1877_ < 0; i_1877_++) {
							for (int i_1878_ = -i_1860_; i_1878_ < 0; i_1878_++) {
								int i_1879_ = anIntArray11346[i_1858_++];
								int i_1880_ = i_1879_ + i_1854_;
								int i_1881_ = ((i_1879_ & 0xff00ff) + (i_1854_ & 0xff00ff));
								int i_1882_ = ((i_1881_ & 0x1000100) + (i_1880_ - i_1881_ & 0x10000));
								is[i_1857_++] = i_1880_ - i_1882_ | i_1882_ - (i_1882_ >>> 8);
							}
							i_1857_ += i_1861_;
							i_1858_ += i_1862_;
						}
					} else if (i_1853_ == 2) {
						int i_1883_ = i_1854_ >>> 24;
						int i_1884_ = 256 - i_1883_;
						int i_1885_ = (i_1854_ & 0xff00ff) * i_1884_ & ~0xff00ff;
						int i_1886_ = (i_1854_ & 0xff00) * i_1884_ & 0xff0000;
						i_1854_ = (i_1885_ | i_1886_) >>> 8;
						for (int i_1887_ = -i_1859_; i_1887_ < 0; i_1887_++) {
							for (int i_1888_ = -i_1860_; i_1888_ < 0; i_1888_++) {
								int i_1889_ = anIntArray11346[i_1858_++];
								i_1885_ = ((i_1889_ & 0xff00ff) * i_1883_ & ~0xff00ff);
								i_1886_ = (i_1889_ & 0xff00) * i_1883_ & 0xff0000;
								is[i_1857_++] = ((i_1885_ | i_1886_) >>> 8) + i_1854_;
							}
							i_1857_ += i_1861_;
							i_1858_ += i_1862_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1855_ == 1) {
					if (i_1853_ == 1) {
						for (int i_1890_ = -i_1859_; i_1890_ < 0; i_1890_++) {
							for (int i_1891_ = -i_1860_; i_1891_ < 0; i_1891_++) {
								int i_1892_ = anIntArray11346[i_1858_++];
								int i_1893_ = i_1892_ >>> 24;
								int i_1894_ = 256 - i_1893_;
								int i_1895_ = is[i_1857_];
								is[i_1857_++] = (((((i_1892_ & 0xff00ff) * i_1893_ + (i_1895_ & 0xff00ff) * i_1894_) & ~0xff00ff) >> 8) + (((((i_1892_ & ~0xff00ff) >>> 8) * i_1893_) + (((i_1895_ & ~0xff00ff) >>> 8) * i_1894_)) & ~0xff00ff));
							}
							i_1857_ += i_1861_;
							i_1858_ += i_1862_;
						}
					} else if (i_1853_ == 0) {
						if ((i_1854_ & 0xffffff) == 16777215) {
							for (int i_1896_ = -i_1859_; i_1896_ < 0; i_1896_++) {
								for (int i_1897_ = -i_1860_; i_1897_ < 0; i_1897_++) {
									int i_1898_ = anIntArray11346[i_1858_++];
									int i_1899_ = ((i_1898_ >>> 24) * (i_1854_ >>> 24) >> 8);
									int i_1900_ = 256 - i_1899_;
									int i_1901_ = is[i_1857_];
									is[i_1857_++] = ((((i_1898_ & 0xff00ff) * i_1899_ + (i_1901_ & 0xff00ff) * i_1900_) & ~0xff00ff) + (((i_1898_ & 0xff00) * i_1899_ + (i_1901_ & 0xff00) * i_1900_) & 0xff0000)) >> 8;
								}
								i_1857_ += i_1861_;
								i_1858_ += i_1862_;
							}
						} else {
							int i_1902_ = (i_1854_ & 0xff0000) >> 16;
							int i_1903_ = (i_1854_ & 0xff00) >> 8;
							int i_1904_ = i_1854_ & 0xff;
							for (int i_1905_ = -i_1859_; i_1905_ < 0; i_1905_++) {
								for (int i_1906_ = -i_1860_; i_1906_ < 0; i_1906_++) {
									int i_1907_ = anIntArray11346[i_1858_++];
									int i_1908_ = ((i_1907_ >>> 24) * (i_1854_ >>> 24) >> 8);
									int i_1909_ = 256 - i_1908_;
									if (i_1908_ != 255) {
										int i_1910_ = ((i_1907_ & 0xff0000) * i_1902_ & ~0xffffff);
										int i_1911_ = ((i_1907_ & 0xff00) * i_1903_ & 0xff0000);
										int i_1912_ = ((i_1907_ & 0xff) * i_1904_ & 0xff00);
										i_1907_ = (i_1910_ | i_1911_ | i_1912_) >>> 8;
										int i_1913_ = is[i_1857_];
										is[i_1857_++] = ((((i_1907_ & 0xff00ff) * i_1908_ + ((i_1913_ & 0xff00ff) * i_1909_)) & ~0xff00ff) + (((i_1907_ & 0xff00) * i_1908_ + ((i_1913_ & 0xff00) * i_1909_)) & 0xff0000)) >> 8;
									} else {
										int i_1914_ = ((i_1907_ & 0xff0000) * i_1902_ & ~0xffffff);
										int i_1915_ = ((i_1907_ & 0xff00) * i_1903_ & 0xff0000);
										int i_1916_ = ((i_1907_ & 0xff) * i_1904_ & 0xff00);
										is[i_1857_++] = (i_1914_ | i_1915_ | i_1916_) >>> 8;
									}
								}
								i_1857_ += i_1861_;
								i_1858_ += i_1862_;
							}
						}
					} else if (i_1853_ == 3) {
						for (int i_1917_ = -i_1859_; i_1917_ < 0; i_1917_++) {
							for (int i_1918_ = -i_1860_; i_1918_ < 0; i_1918_++) {
								int i_1919_ = anIntArray11346[i_1858_++];
								int i_1920_ = i_1919_ + i_1854_;
								int i_1921_ = ((i_1919_ & 0xff00ff) + (i_1854_ & 0xff00ff));
								int i_1922_ = ((i_1921_ & 0x1000100) + (i_1920_ - i_1921_ & 0x10000));
								i_1922_ = i_1920_ - i_1922_ | i_1922_ - (i_1922_ >>> 8);
								int i_1923_ = (i_1922_ >>> 24) * (i_1854_ >>> 24) >> 8;
								int i_1924_ = 256 - i_1923_;
								if (i_1923_ != 255) {
									i_1919_ = i_1922_;
									i_1922_ = is[i_1857_];
									i_1922_ = ((((i_1919_ & 0xff00ff) * i_1923_ + (i_1922_ & 0xff00ff) * i_1924_) & ~0xff00ff) + (((i_1919_ & 0xff00) * i_1923_ + (i_1922_ & 0xff00) * i_1924_) & 0xff0000)) >> 8;
								}
								is[i_1857_++] = i_1922_;
							}
							i_1857_ += i_1861_;
							i_1858_ += i_1862_;
						}
					} else if (i_1853_ == 2) {
						int i_1925_ = i_1854_ >>> 24;
						int i_1926_ = 256 - i_1925_;
						int i_1927_ = (i_1854_ & 0xff00ff) * i_1926_ & ~0xff00ff;
						int i_1928_ = (i_1854_ & 0xff00) * i_1926_ & 0xff0000;
						i_1854_ = (i_1927_ | i_1928_) >>> 8;
						for (int i_1929_ = -i_1859_; i_1929_ < 0; i_1929_++) {
							for (int i_1930_ = -i_1860_; i_1930_ < 0; i_1930_++) {
								int i_1931_ = anIntArray11346[i_1858_++];
								int i_1932_ = i_1931_ >>> 24;
								int i_1933_ = 256 - i_1932_;
								i_1927_ = ((i_1931_ & 0xff00ff) * i_1925_ & ~0xff00ff);
								i_1928_ = (i_1931_ & 0xff00) * i_1925_ & 0xff0000;
								i_1931_ = ((i_1927_ | i_1928_) >>> 8) + i_1854_;
								int i_1934_ = is[i_1857_];
								is[i_1857_++] = ((((i_1931_ & 0xff00ff) * i_1932_ + (i_1934_ & 0xff00ff) * i_1933_) & ~0xff00ff) + (((i_1931_ & 0xff00) * i_1932_ + (i_1934_ & 0xff00) * i_1933_) & 0xff0000)) >> 8;
							}
							i_1857_ += i_1861_;
							i_1858_ += i_1862_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1855_ == 2) {
					if (i_1853_ == 1) {
						for (int i_1935_ = -i_1859_; i_1935_ < 0; i_1935_++) {
							for (int i_1936_ = -i_1860_; i_1936_ < 0; i_1936_++) {
								int i_1937_ = anIntArray11346[i_1858_++];
								if (i_1937_ != 0) {
									int i_1938_ = is[i_1857_];
									int i_1939_ = i_1937_ + i_1938_;
									int i_1940_ = ((i_1937_ & 0xff00ff) + (i_1938_ & 0xff00ff));
									i_1938_ = ((i_1940_ & 0x1000100) + (i_1939_ - i_1940_ & 0x10000));
									is[i_1857_++] = (i_1939_ - i_1938_ | i_1938_ - (i_1938_ >>> 8));
								} else
									i_1857_++;
							}
							i_1857_ += i_1861_;
							i_1858_ += i_1862_;
						}
					} else if (i_1853_ == 0) {
						int i_1941_ = (i_1854_ & 0xff0000) >> 16;
						int i_1942_ = (i_1854_ & 0xff00) >> 8;
						int i_1943_ = i_1854_ & 0xff;
						for (int i_1944_ = -i_1859_; i_1944_ < 0; i_1944_++) {
							for (int i_1945_ = -i_1860_; i_1945_ < 0; i_1945_++) {
								int i_1946_ = anIntArray11346[i_1858_++];
								if (i_1946_ != 0) {
									int i_1947_ = ((i_1946_ & 0xff0000) * i_1941_ & ~0xffffff);
									int i_1948_ = ((i_1946_ & 0xff00) * i_1942_ & 0xff0000);
									int i_1949_ = (i_1946_ & 0xff) * i_1943_ & 0xff00;
									i_1946_ = (i_1947_ | i_1948_ | i_1949_) >>> 8;
									int i_1950_ = is[i_1857_];
									int i_1951_ = i_1946_ + i_1950_;
									int i_1952_ = ((i_1946_ & 0xff00ff) + (i_1950_ & 0xff00ff));
									i_1950_ = ((i_1952_ & 0x1000100) + (i_1951_ - i_1952_ & 0x10000));
									is[i_1857_++] = (i_1951_ - i_1950_ | i_1950_ - (i_1950_ >>> 8));
								} else
									i_1857_++;
							}
							i_1857_ += i_1861_;
							i_1858_ += i_1862_;
						}
					} else if (i_1853_ == 3) {
						for (int i_1953_ = -i_1859_; i_1953_ < 0; i_1953_++) {
							for (int i_1954_ = -i_1860_; i_1954_ < 0; i_1954_++) {
								int i_1955_ = anIntArray11346[i_1858_++];
								int i_1956_ = i_1955_ + i_1854_;
								int i_1957_ = ((i_1955_ & 0xff00ff) + (i_1854_ & 0xff00ff));
								int i_1958_ = ((i_1957_ & 0x1000100) + (i_1956_ - i_1957_ & 0x10000));
								i_1955_ = i_1956_ - i_1958_ | i_1958_ - (i_1958_ >>> 8);
								i_1958_ = is[i_1857_];
								i_1956_ = i_1955_ + i_1958_;
								i_1957_ = (i_1955_ & 0xff00ff) + (i_1958_ & 0xff00ff);
								i_1958_ = ((i_1957_ & 0x1000100) + (i_1956_ - i_1957_ & 0x10000));
								is[i_1857_++] = i_1956_ - i_1958_ | i_1958_ - (i_1958_ >>> 8);
							}
							i_1857_ += i_1861_;
							i_1858_ += i_1862_;
						}
					} else if (i_1853_ == 2) {
						int i_1959_ = i_1854_ >>> 24;
						int i_1960_ = 256 - i_1959_;
						int i_1961_ = (i_1854_ & 0xff00ff) * i_1960_ & ~0xff00ff;
						int i_1962_ = (i_1854_ & 0xff00) * i_1960_ & 0xff0000;
						i_1854_ = (i_1961_ | i_1962_) >>> 8;
						for (int i_1963_ = -i_1859_; i_1963_ < 0; i_1963_++) {
							for (int i_1964_ = -i_1860_; i_1964_ < 0; i_1964_++) {
								int i_1965_ = anIntArray11346[i_1858_++];
								if (i_1965_ != 0) {
									i_1961_ = ((i_1965_ & 0xff00ff) * i_1959_ & ~0xff00ff);
									i_1962_ = ((i_1965_ & 0xff00) * i_1959_ & 0xff0000);
									i_1965_ = (((i_1961_ | i_1962_) >>> 8) + i_1854_);
									int i_1966_ = is[i_1857_];
									int i_1967_ = i_1965_ + i_1966_;
									int i_1968_ = ((i_1965_ & 0xff00ff) + (i_1966_ & 0xff00ff));
									i_1966_ = ((i_1968_ & 0x1000100) + (i_1967_ - i_1968_ & 0x10000));
									is[i_1857_++] = (i_1967_ - i_1966_ | i_1966_ - (i_1966_ >>> 8));
								} else
									i_1857_++;
							}
							i_1857_ += i_1861_;
							i_1858_ += i_1862_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method8434(int i, int i_1969_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_1970_ = anInt8957;
					while (i_1970_ < 0) {
						int i_1971_ = anInt8959;
						int i_1972_ = anInt8966;
						int i_1973_ = anInt8967;
						int i_1974_ = anInt8955;
						if (i_1972_ >= 0 && i_1973_ >= 0 && i_1972_ - (anInt8945 << 12) < 0 && i_1973_ - (anInt8950 << 12) < 0) {
							for (/**/; i_1974_ < 0; i_1974_++)
								method10510(((i_1973_ >> 12) * anInt8945 + (i_1972_ >> 12)), i_1971_++, is, i, i_1969_);
						}
						i_1970_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_1975_ = anInt8957;
					while (i_1975_ < 0) {
						int i_1976_ = anInt8959;
						int i_1977_ = anInt8966;
						int i_1978_ = anInt8967 + anInt8969;
						int i_1979_ = anInt8955;
						if (i_1977_ >= 0 && i_1977_ - (anInt8945 << 12) < 0) {
							int i_1980_;
							if ((i_1980_ = i_1978_ - (anInt8950 << 12)) >= 0) {
								i_1980_ = (anInt8962 - i_1980_) / anInt8962;
								i_1979_ += i_1980_;
								i_1978_ += anInt8962 * i_1980_;
								i_1976_ += i_1980_;
							}
							if ((i_1980_ = (i_1978_ - anInt8962) / anInt8962) > i_1979_)
								i_1979_ = i_1980_;
							for (/**/; i_1979_ < 0; i_1979_++) {
								method10510(((i_1978_ >> 12) * anInt8945 + (i_1977_ >> 12)), i_1976_++, is, i, i_1969_);
								i_1978_ += anInt8962;
							}
						}
						i_1975_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_1981_ = anInt8957;
					while (i_1981_ < 0) {
						int i_1982_ = anInt8959;
						int i_1983_ = anInt8966;
						int i_1984_ = anInt8967 + anInt8969;
						int i_1985_ = anInt8955;
						if (i_1983_ >= 0 && i_1983_ - (anInt8945 << 12) < 0) {
							if (i_1984_ < 0) {
								int i_1986_ = (anInt8962 - 1 - i_1984_) / anInt8962;
								i_1985_ += i_1986_;
								i_1984_ += anInt8962 * i_1986_;
								i_1982_ += i_1986_;
							}
							int i_1987_;
							if ((i_1987_ = (1 + i_1984_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_1985_)
								i_1985_ = i_1987_;
							for (/**/; i_1985_ < 0; i_1985_++) {
								method10510(((i_1984_ >> 12) * anInt8945 + (i_1983_ >> 12)), i_1982_++, is, i, i_1969_);
								i_1984_ += anInt8962;
							}
						}
						i_1981_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_1988_ = anInt8957;
					while (i_1988_ < 0) {
						int i_1989_ = anInt8959;
						int i_1990_ = anInt8966 + anInt8968;
						int i_1991_ = anInt8967;
						int i_1992_ = anInt8955;
						if (i_1991_ >= 0 && i_1991_ - (anInt8950 << 12) < 0) {
							int i_1993_;
							if ((i_1993_ = i_1990_ - (anInt8945 << 12)) >= 0) {
								i_1993_ = (anInt8960 - i_1993_) / anInt8960;
								i_1992_ += i_1993_;
								i_1990_ += anInt8960 * i_1993_;
								i_1989_ += i_1993_;
							}
							if ((i_1993_ = (i_1990_ - anInt8960) / anInt8960) > i_1992_)
								i_1992_ = i_1993_;
							for (/**/; i_1992_ < 0; i_1992_++) {
								method10510(((i_1991_ >> 12) * anInt8945 + (i_1990_ >> 12)), i_1989_++, is, i, i_1969_);
								i_1990_ += anInt8960;
							}
						}
						i_1988_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_1994_ = anInt8957;
					while (i_1994_ < 0) {
						int i_1995_ = anInt8959;
						int i_1996_ = anInt8966 + anInt8968;
						int i_1997_ = anInt8967 + anInt8969;
						int i_1998_ = anInt8955;
						int i_1999_;
						if ((i_1999_ = i_1996_ - (anInt8945 << 12)) >= 0) {
							i_1999_ = (anInt8960 - i_1999_) / anInt8960;
							i_1998_ += i_1999_;
							i_1996_ += anInt8960 * i_1999_;
							i_1997_ += anInt8962 * i_1999_;
							i_1995_ += i_1999_;
						}
						if ((i_1999_ = (i_1996_ - anInt8960) / anInt8960) > i_1998_)
							i_1998_ = i_1999_;
						if ((i_1999_ = i_1997_ - (anInt8950 << 12)) >= 0) {
							i_1999_ = (anInt8962 - i_1999_) / anInt8962;
							i_1998_ += i_1999_;
							i_1996_ += anInt8960 * i_1999_;
							i_1997_ += anInt8962 * i_1999_;
							i_1995_ += i_1999_;
						}
						if ((i_1999_ = (i_1997_ - anInt8962) / anInt8962) > i_1998_)
							i_1998_ = i_1999_;
						for (/**/; i_1998_ < 0; i_1998_++) {
							method10510((i_1997_ >> 12) * anInt8945 + (i_1996_ >> 12), i_1995_++, is, i, i_1969_);
							i_1996_ += anInt8960;
							i_1997_ += anInt8962;
						}
						i_1994_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_2000_ = anInt8957;
					while (i_2000_ < 0) {
						int i_2001_ = anInt8959;
						int i_2002_ = anInt8966 + anInt8968;
						int i_2003_ = anInt8967 + anInt8969;
						int i_2004_ = anInt8955;
						int i_2005_;
						if ((i_2005_ = i_2002_ - (anInt8945 << 12)) >= 0) {
							i_2005_ = (anInt8960 - i_2005_) / anInt8960;
							i_2004_ += i_2005_;
							i_2002_ += anInt8960 * i_2005_;
							i_2003_ += anInt8962 * i_2005_;
							i_2001_ += i_2005_;
						}
						if ((i_2005_ = (i_2002_ - anInt8960) / anInt8960) > i_2004_)
							i_2004_ = i_2005_;
						if (i_2003_ < 0) {
							i_2005_ = (anInt8962 - 1 - i_2003_) / anInt8962;
							i_2004_ += i_2005_;
							i_2002_ += anInt8960 * i_2005_;
							i_2003_ += anInt8962 * i_2005_;
							i_2001_ += i_2005_;
						}
						if ((i_2005_ = (1 + i_2003_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_2004_)
							i_2004_ = i_2005_;
						for (/**/; i_2004_ < 0; i_2004_++) {
							method10510((i_2003_ >> 12) * anInt8945 + (i_2002_ >> 12), i_2001_++, is, i, i_1969_);
							i_2002_ += anInt8960;
							i_2003_ += anInt8962;
						}
						i_2000_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_2006_ = anInt8957;
				while (i_2006_ < 0) {
					int i_2007_ = anInt8959;
					int i_2008_ = anInt8966 + anInt8968;
					int i_2009_ = anInt8967;
					int i_2010_ = anInt8955;
					if (i_2009_ >= 0 && i_2009_ - (anInt8950 << 12) < 0) {
						if (i_2008_ < 0) {
							int i_2011_ = (anInt8960 - 1 - i_2008_) / anInt8960;
							i_2010_ += i_2011_;
							i_2008_ += anInt8960 * i_2011_;
							i_2007_ += i_2011_;
						}
						int i_2012_;
						if ((i_2012_ = (1 + i_2008_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_2010_)
							i_2010_ = i_2012_;
						for (/**/; i_2010_ < 0; i_2010_++) {
							method10510((i_2009_ >> 12) * anInt8945 + (i_2008_ >> 12), i_2007_++, is, i, i_1969_);
							i_2008_ += anInt8960;
						}
					}
					i_2006_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				for (int i_2013_ = anInt8957; i_2013_ < 0; i_2013_++) {
					int i_2014_ = anInt8959;
					int i_2015_ = anInt8966 + anInt8968;
					int i_2016_ = anInt8967 + anInt8969;
					int i_2017_ = anInt8955;
					if (i_2015_ < 0) {
						int i_2018_ = (anInt8960 - 1 - i_2015_) / anInt8960;
						i_2017_ += i_2018_;
						i_2015_ += anInt8960 * i_2018_;
						i_2016_ += anInt8962 * i_2018_;
						i_2014_ += i_2018_;
					}
					int i_2019_;
					if ((i_2019_ = (1 + i_2015_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_2017_)
						i_2017_ = i_2019_;
					if ((i_2019_ = i_2016_ - (anInt8950 << 12)) >= 0) {
						i_2019_ = (anInt8962 - i_2019_) / anInt8962;
						i_2017_ += i_2019_;
						i_2015_ += anInt8960 * i_2019_;
						i_2016_ += anInt8962 * i_2019_;
						i_2014_ += i_2019_;
					}
					if ((i_2019_ = (i_2016_ - anInt8962) / anInt8962) > i_2017_)
						i_2017_ = i_2019_;
					for (/**/; i_2017_ < 0; i_2017_++) {
						method10510((i_2016_ >> 12) * anInt8945 + (i_2015_ >> 12), i_2014_++, is, i, i_1969_);
						i_2015_ += anInt8960;
						i_2016_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				for (int i_2020_ = anInt8957; i_2020_ < 0; i_2020_++) {
					int i_2021_ = anInt8959;
					int i_2022_ = anInt8966 + anInt8968;
					int i_2023_ = anInt8967 + anInt8969;
					int i_2024_ = anInt8955;
					if (i_2022_ < 0) {
						int i_2025_ = (anInt8960 - 1 - i_2022_) / anInt8960;
						i_2024_ += i_2025_;
						i_2022_ += anInt8960 * i_2025_;
						i_2023_ += anInt8962 * i_2025_;
						i_2021_ += i_2025_;
					}
					int i_2026_;
					if ((i_2026_ = (1 + i_2022_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_2024_)
						i_2024_ = i_2026_;
					if (i_2023_ < 0) {
						i_2026_ = (anInt8962 - 1 - i_2023_) / anInt8962;
						i_2024_ += i_2026_;
						i_2022_ += anInt8960 * i_2026_;
						i_2023_ += anInt8962 * i_2026_;
						i_2021_ += i_2026_;
					}
					if ((i_2026_ = (1 + i_2023_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_2024_)
						i_2024_ = i_2026_;
					for (/**/; i_2024_ < 0; i_2024_++) {
						method10510((i_2023_ >> 12) * anInt8945 + (i_2022_ >> 12), i_2021_++, is, i, i_1969_);
						i_2022_ += anInt8960;
						i_2023_ += anInt8962;
					}
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	void method8435(int[] is, int[] is_2027_, int i, int i_2028_) {
		int[] is_2029_ = aClass167_Sub1_8946.anIntArray8996;
		if (is_2029_ != null) {
			if (anInt8960 == 0) {
				if (anInt8962 == 0) {
					int i_2030_ = anInt8957;
					while (i_2030_ < 0) {
						int i_2031_ = i_2030_ + i_2028_;
						if (i_2031_ >= 0) {
							if (i_2031_ >= is.length)
								break;
							int i_2032_ = anInt8959;
							int i_2033_ = anInt8966;
							int i_2034_ = anInt8967;
							int i_2035_ = anInt8955;
							if (i_2033_ >= 0 && i_2034_ >= 0 && i_2033_ - (anInt8945 << 12) < 0 && i_2034_ - (anInt8950 << 12) < 0) {
								int i_2036_ = is[i_2031_] - i;
								int i_2037_ = -is_2027_[i_2031_];
								int i_2038_ = i_2036_ - (i_2032_ - anInt8959);
								if (i_2038_ > 0) {
									i_2032_ += i_2038_;
									i_2035_ += i_2038_;
									i_2033_ += anInt8960 * i_2038_;
									i_2034_ += anInt8962 * i_2038_;
								} else
									i_2037_ -= i_2038_;
								if (i_2035_ < i_2037_)
									i_2035_ = i_2037_;
								for (/**/; i_2035_ < 0; i_2035_++) {
									int i_2039_ = (anIntArray11346[((i_2034_ >> 12) * anInt8945 + (i_2033_ >> 12))]);
									int i_2040_ = i_2039_ >>> 24;
									int i_2041_ = 256 - i_2040_;
									int i_2042_ = is_2029_[i_2032_];
									is_2029_[i_2032_++] = ((((i_2039_ & 0xff00ff) * i_2040_ + (i_2042_ & 0xff00ff) * i_2041_) & ~0xff00ff) + (((i_2039_ & 0xff00) * i_2040_ + (i_2042_ & 0xff00) * i_2041_) & 0xff0000)) >> 8;
								}
							}
						}
						i_2030_++;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_2043_ = anInt8957;
					while (i_2043_ < 0) {
						int i_2044_ = i_2043_ + i_2028_;
						if (i_2044_ >= 0) {
							if (i_2044_ >= is.length)
								break;
							int i_2045_ = anInt8959;
							int i_2046_ = anInt8966;
							int i_2047_ = anInt8967 + anInt8969;
							int i_2048_ = anInt8955;
							if (i_2046_ >= 0 && i_2046_ - (anInt8945 << 12) < 0) {
								int i_2049_;
								if ((i_2049_ = i_2047_ - (anInt8950 << 12)) >= 0) {
									i_2049_ = (anInt8962 - i_2049_) / anInt8962;
									i_2048_ += i_2049_;
									i_2047_ += anInt8962 * i_2049_;
									i_2045_ += i_2049_;
								}
								if ((i_2049_ = (i_2047_ - anInt8962) / anInt8962) > i_2048_)
									i_2048_ = i_2049_;
								int i_2050_ = is[i_2044_] - i;
								int i_2051_ = -is_2027_[i_2044_];
								int i_2052_ = i_2050_ - (i_2045_ - anInt8959);
								if (i_2052_ > 0) {
									i_2045_ += i_2052_;
									i_2048_ += i_2052_;
									i_2046_ += anInt8960 * i_2052_;
									i_2047_ += anInt8962 * i_2052_;
								} else
									i_2051_ -= i_2052_;
								if (i_2048_ < i_2051_)
									i_2048_ = i_2051_;
								for (/**/; i_2048_ < 0; i_2048_++) {
									int i_2053_ = (anIntArray11346[((i_2047_ >> 12) * anInt8945 + (i_2046_ >> 12))]);
									int i_2054_ = i_2053_ >>> 24;
									int i_2055_ = 256 - i_2054_;
									int i_2056_ = is_2029_[i_2045_];
									is_2029_[i_2045_++] = ((((i_2053_ & 0xff00ff) * i_2054_ + (i_2056_ & 0xff00ff) * i_2055_) & ~0xff00ff) + (((i_2053_ & 0xff00) * i_2054_ + (i_2056_ & 0xff00) * i_2055_) & 0xff0000)) >> 8;
									i_2047_ += anInt8962;
								}
							}
						}
						i_2043_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				} else {
					int i_2057_ = anInt8957;
					while (i_2057_ < 0) {
						int i_2058_ = i_2057_ + i_2028_;
						if (i_2058_ >= 0) {
							if (i_2058_ >= is.length)
								break;
							int i_2059_ = anInt8959;
							int i_2060_ = anInt8966;
							int i_2061_ = anInt8967 + anInt8969;
							int i_2062_ = anInt8955;
							if (i_2060_ >= 0 && i_2060_ - (anInt8945 << 12) < 0) {
								if (i_2061_ < 0) {
									int i_2063_ = ((anInt8962 - 1 - i_2061_) / anInt8962);
									i_2062_ += i_2063_;
									i_2061_ += anInt8962 * i_2063_;
									i_2059_ += i_2063_;
								}
								int i_2064_;
								if ((i_2064_ = (1 + i_2061_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_2062_)
									i_2062_ = i_2064_;
								int i_2065_ = is[i_2058_] - i;
								int i_2066_ = -is_2027_[i_2058_];
								int i_2067_ = i_2065_ - (i_2059_ - anInt8959);
								if (i_2067_ > 0) {
									i_2059_ += i_2067_;
									i_2062_ += i_2067_;
									i_2060_ += anInt8960 * i_2067_;
									i_2061_ += anInt8962 * i_2067_;
								} else
									i_2066_ -= i_2067_;
								if (i_2062_ < i_2066_)
									i_2062_ = i_2066_;
								for (/**/; i_2062_ < 0; i_2062_++) {
									int i_2068_ = (anIntArray11346[((i_2061_ >> 12) * anInt8945 + (i_2060_ >> 12))]);
									int i_2069_ = i_2068_ >>> 24;
									int i_2070_ = 256 - i_2069_;
									int i_2071_ = is_2029_[i_2059_];
									is_2029_[i_2059_++] = ((((i_2068_ & 0xff00ff) * i_2069_ + (i_2071_ & 0xff00ff) * i_2070_) & ~0xff00ff) + (((i_2068_ & 0xff00) * i_2069_ + (i_2071_ & 0xff00) * i_2070_) & 0xff0000)) >> 8;
									i_2061_ += anInt8962;
								}
							}
						}
						i_2057_++;
						anInt8966 += anInt8943;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8960 < 0) {
				if (anInt8962 == 0) {
					int i_2072_ = anInt8957;
					while (i_2072_ < 0) {
						int i_2073_ = i_2072_ + i_2028_;
						if (i_2073_ >= 0) {
							if (i_2073_ >= is.length)
								break;
							int i_2074_ = anInt8959;
							int i_2075_ = anInt8966 + anInt8968;
							int i_2076_ = anInt8967;
							int i_2077_ = anInt8955;
							if (i_2076_ >= 0 && i_2076_ - (anInt8950 << 12) < 0) {
								int i_2078_;
								if ((i_2078_ = i_2075_ - (anInt8945 << 12)) >= 0) {
									i_2078_ = (anInt8960 - i_2078_) / anInt8960;
									i_2077_ += i_2078_;
									i_2075_ += anInt8960 * i_2078_;
									i_2074_ += i_2078_;
								}
								if ((i_2078_ = (i_2075_ - anInt8960) / anInt8960) > i_2077_)
									i_2077_ = i_2078_;
								int i_2079_ = is[i_2073_] - i;
								int i_2080_ = -is_2027_[i_2073_];
								int i_2081_ = i_2079_ - (i_2074_ - anInt8959);
								if (i_2081_ > 0) {
									i_2074_ += i_2081_;
									i_2077_ += i_2081_;
									i_2075_ += anInt8960 * i_2081_;
									i_2076_ += anInt8962 * i_2081_;
								} else
									i_2080_ -= i_2081_;
								if (i_2077_ < i_2080_)
									i_2077_ = i_2080_;
								for (/**/; i_2077_ < 0; i_2077_++) {
									int i_2082_ = (anIntArray11346[((i_2076_ >> 12) * anInt8945 + (i_2075_ >> 12))]);
									int i_2083_ = i_2082_ >>> 24;
									int i_2084_ = 256 - i_2083_;
									int i_2085_ = is_2029_[i_2074_];
									is_2029_[i_2074_++] = ((((i_2082_ & 0xff00ff) * i_2083_ + (i_2085_ & 0xff00ff) * i_2084_) & ~0xff00ff) + (((i_2082_ & 0xff00) * i_2083_ + (i_2085_ & 0xff00) * i_2084_) & 0xff0000)) >> 8;
									i_2075_ += anInt8960;
								}
							}
						}
						i_2072_++;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else if (anInt8962 < 0) {
					int i_2086_ = anInt8957;
					while (i_2086_ < 0) {
						int i_2087_ = i_2086_ + i_2028_;
						if (i_2087_ >= 0) {
							if (i_2087_ >= is.length)
								break;
							int i_2088_ = anInt8959;
							int i_2089_ = anInt8966 + anInt8968;
							int i_2090_ = anInt8967 + anInt8969;
							int i_2091_ = anInt8955;
							int i_2092_;
							if ((i_2092_ = i_2089_ - (anInt8945 << 12)) >= 0) {
								i_2092_ = (anInt8960 - i_2092_) / anInt8960;
								i_2091_ += i_2092_;
								i_2089_ += anInt8960 * i_2092_;
								i_2090_ += anInt8962 * i_2092_;
								i_2088_ += i_2092_;
							}
							if ((i_2092_ = (i_2089_ - anInt8960) / anInt8960) > i_2091_)
								i_2091_ = i_2092_;
							if ((i_2092_ = i_2090_ - (anInt8950 << 12)) >= 0) {
								i_2092_ = (anInt8962 - i_2092_) / anInt8962;
								i_2091_ += i_2092_;
								i_2089_ += anInt8960 * i_2092_;
								i_2090_ += anInt8962 * i_2092_;
								i_2088_ += i_2092_;
							}
							if ((i_2092_ = (i_2090_ - anInt8962) / anInt8962) > i_2091_)
								i_2091_ = i_2092_;
							int i_2093_ = is[i_2087_] - i;
							int i_2094_ = -is_2027_[i_2087_];
							int i_2095_ = i_2093_ - (i_2088_ - anInt8959);
							if (i_2095_ > 0) {
								i_2088_ += i_2095_;
								i_2091_ += i_2095_;
								i_2089_ += anInt8960 * i_2095_;
								i_2090_ += anInt8962 * i_2095_;
							} else
								i_2094_ -= i_2095_;
							if (i_2091_ < i_2094_)
								i_2091_ = i_2094_;
							for (/**/; i_2091_ < 0; i_2091_++) {
								int i_2096_ = (anIntArray11346[((i_2090_ >> 12) * anInt8945 + (i_2089_ >> 12))]);
								int i_2097_ = i_2096_ >>> 24;
								int i_2098_ = 256 - i_2097_;
								int i_2099_ = is_2029_[i_2088_];
								is_2029_[i_2088_++] = ((((i_2096_ & 0xff00ff) * i_2097_ + (i_2099_ & 0xff00ff) * i_2098_) & ~0xff00ff) + (((i_2096_ & 0xff00) * i_2097_ + (i_2099_ & 0xff00) * i_2098_) & 0xff0000)) >> 8;
								i_2089_ += anInt8960;
								i_2090_ += anInt8962;
							}
						}
						i_2086_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				} else {
					int i_2100_ = anInt8957;
					while (i_2100_ < 0) {
						int i_2101_ = i_2100_ + i_2028_;
						if (i_2101_ >= 0) {
							if (i_2101_ >= is.length)
								break;
							int i_2102_ = anInt8959;
							int i_2103_ = anInt8966 + anInt8968;
							int i_2104_ = anInt8967 + anInt8969;
							int i_2105_ = anInt8955;
							int i_2106_;
							if ((i_2106_ = i_2103_ - (anInt8945 << 12)) >= 0) {
								i_2106_ = (anInt8960 - i_2106_) / anInt8960;
								i_2105_ += i_2106_;
								i_2103_ += anInt8960 * i_2106_;
								i_2104_ += anInt8962 * i_2106_;
								i_2102_ += i_2106_;
							}
							if ((i_2106_ = (i_2103_ - anInt8960) / anInt8960) > i_2105_)
								i_2105_ = i_2106_;
							if (i_2104_ < 0) {
								i_2106_ = (anInt8962 - 1 - i_2104_) / anInt8962;
								i_2105_ += i_2106_;
								i_2103_ += anInt8960 * i_2106_;
								i_2104_ += anInt8962 * i_2106_;
								i_2102_ += i_2106_;
							}
							if ((i_2106_ = (1 + i_2104_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_2105_)
								i_2105_ = i_2106_;
							int i_2107_ = is[i_2101_] - i;
							int i_2108_ = -is_2027_[i_2101_];
							int i_2109_ = i_2107_ - (i_2102_ - anInt8959);
							if (i_2109_ > 0) {
								i_2102_ += i_2109_;
								i_2105_ += i_2109_;
								i_2103_ += anInt8960 * i_2109_;
								i_2104_ += anInt8962 * i_2109_;
							} else
								i_2108_ -= i_2109_;
							if (i_2105_ < i_2108_)
								i_2105_ = i_2108_;
							for (/**/; i_2105_ < 0; i_2105_++) {
								int i_2110_ = (anIntArray11346[((i_2104_ >> 12) * anInt8945 + (i_2103_ >> 12))]);
								int i_2111_ = i_2110_ >>> 24;
								int i_2112_ = 256 - i_2111_;
								int i_2113_ = is_2029_[i_2102_];
								is_2029_[i_2102_++] = ((((i_2110_ & 0xff00ff) * i_2111_ + (i_2113_ & 0xff00ff) * i_2112_) & ~0xff00ff) + (((i_2110_ & 0xff00) * i_2111_ + (i_2113_ & 0xff00) * i_2112_) & 0xff0000)) >> 8;
								i_2103_ += anInt8960;
								i_2104_ += anInt8962;
							}
						}
						i_2100_++;
						anInt8966 += anInt8943;
						anInt8967 += anInt8963;
						anInt8959 += anInt8958;
					}
				}
			} else if (anInt8962 == 0) {
				int i_2114_ = anInt8957;
				while (i_2114_ < 0) {
					int i_2115_ = i_2114_ + i_2028_;
					if (i_2115_ >= 0) {
						if (i_2115_ >= is.length)
							break;
						int i_2116_ = anInt8959;
						int i_2117_ = anInt8966 + anInt8968;
						int i_2118_ = anInt8967;
						int i_2119_ = anInt8955;
						if (i_2118_ >= 0 && i_2118_ - (anInt8950 << 12) < 0) {
							if (i_2117_ < 0) {
								int i_2120_ = (anInt8960 - 1 - i_2117_) / anInt8960;
								i_2119_ += i_2120_;
								i_2117_ += anInt8960 * i_2120_;
								i_2116_ += i_2120_;
							}
							int i_2121_;
							if ((i_2121_ = (1 + i_2117_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_2119_)
								i_2119_ = i_2121_;
							int i_2122_ = is[i_2115_] - i;
							int i_2123_ = -is_2027_[i_2115_];
							int i_2124_ = i_2122_ - (i_2116_ - anInt8959);
							if (i_2124_ > 0) {
								i_2116_ += i_2124_;
								i_2119_ += i_2124_;
								i_2117_ += anInt8960 * i_2124_;
								i_2118_ += anInt8962 * i_2124_;
							} else
								i_2123_ -= i_2124_;
							if (i_2119_ < i_2123_)
								i_2119_ = i_2123_;
							for (/**/; i_2119_ < 0; i_2119_++) {
								int i_2125_ = (anIntArray11346[((i_2118_ >> 12) * anInt8945 + (i_2117_ >> 12))]);
								int i_2126_ = i_2125_ >>> 24;
								int i_2127_ = 256 - i_2126_;
								int i_2128_ = is_2029_[i_2116_];
								is_2029_[i_2116_++] = ((((i_2125_ & 0xff00ff) * i_2126_ + (i_2128_ & 0xff00ff) * i_2127_) & ~0xff00ff) + (((i_2125_ & 0xff00) * i_2126_ + (i_2128_ & 0xff00) * i_2127_) & 0xff0000)) >> 8;
								i_2117_ += anInt8960;
							}
						}
					}
					i_2114_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else if (anInt8962 < 0) {
				int i_2129_ = anInt8957;
				while (i_2129_ < 0) {
					int i_2130_ = i_2129_ + i_2028_;
					if (i_2130_ >= 0) {
						if (i_2130_ >= is.length)
							break;
						int i_2131_ = anInt8959;
						int i_2132_ = anInt8966 + anInt8968;
						int i_2133_ = anInt8967 + anInt8969;
						int i_2134_ = anInt8955;
						if (i_2132_ < 0) {
							int i_2135_ = (anInt8960 - 1 - i_2132_) / anInt8960;
							i_2134_ += i_2135_;
							i_2132_ += anInt8960 * i_2135_;
							i_2133_ += anInt8962 * i_2135_;
							i_2131_ += i_2135_;
						}
						int i_2136_;
						if ((i_2136_ = (1 + i_2132_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_2134_)
							i_2134_ = i_2136_;
						if ((i_2136_ = i_2133_ - (anInt8950 << 12)) >= 0) {
							i_2136_ = (anInt8962 - i_2136_) / anInt8962;
							i_2134_ += i_2136_;
							i_2132_ += anInt8960 * i_2136_;
							i_2133_ += anInt8962 * i_2136_;
							i_2131_ += i_2136_;
						}
						if ((i_2136_ = (i_2133_ - anInt8962) / anInt8962) > i_2134_)
							i_2134_ = i_2136_;
						int i_2137_ = is[i_2130_] - i;
						int i_2138_ = -is_2027_[i_2130_];
						int i_2139_ = i_2137_ - (i_2131_ - anInt8959);
						if (i_2139_ > 0) {
							i_2131_ += i_2139_;
							i_2134_ += i_2139_;
							i_2132_ += anInt8960 * i_2139_;
							i_2133_ += anInt8962 * i_2139_;
						} else
							i_2138_ -= i_2139_;
						if (i_2134_ < i_2138_)
							i_2134_ = i_2138_;
						for (/**/; i_2134_ < 0; i_2134_++) {
							int i_2140_ = (anIntArray11346[(i_2133_ >> 12) * anInt8945 + (i_2132_ >> 12)]);
							int i_2141_ = i_2140_ >>> 24;
							int i_2142_ = 256 - i_2141_;
							int i_2143_ = is_2029_[i_2131_];
							is_2029_[i_2131_++] = ((((i_2140_ & 0xff00ff) * i_2141_ + (i_2143_ & 0xff00ff) * i_2142_) & ~0xff00ff) + (((i_2140_ & 0xff00) * i_2141_ + (i_2143_ & 0xff00) * i_2142_) & 0xff0000)) >> 8;
							i_2132_ += anInt8960;
							i_2133_ += anInt8962;
						}
					}
					i_2129_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			} else {
				int i_2144_ = anInt8957;
				while (i_2144_ < 0) {
					int i_2145_ = i_2144_ + i_2028_;
					if (i_2145_ >= 0) {
						if (i_2145_ >= is.length)
							break;
						int i_2146_ = anInt8959;
						int i_2147_ = anInt8966 + anInt8968;
						int i_2148_ = anInt8967 + anInt8969;
						int i_2149_ = anInt8955;
						if (i_2147_ < 0) {
							int i_2150_ = (anInt8960 - 1 - i_2147_) / anInt8960;
							i_2149_ += i_2150_;
							i_2147_ += anInt8960 * i_2150_;
							i_2148_ += anInt8962 * i_2150_;
							i_2146_ += i_2150_;
						}
						int i_2151_;
						if ((i_2151_ = (1 + i_2147_ - (anInt8945 << 12) - anInt8960) / anInt8960) > i_2149_)
							i_2149_ = i_2151_;
						if (i_2148_ < 0) {
							i_2151_ = (anInt8962 - 1 - i_2148_) / anInt8962;
							i_2149_ += i_2151_;
							i_2147_ += anInt8960 * i_2151_;
							i_2148_ += anInt8962 * i_2151_;
							i_2146_ += i_2151_;
						}
						if ((i_2151_ = (1 + i_2148_ - (anInt8950 << 12) - anInt8962) / anInt8962) > i_2149_)
							i_2149_ = i_2151_;
						int i_2152_ = is[i_2145_] - i;
						int i_2153_ = -is_2027_[i_2145_];
						int i_2154_ = i_2152_ - (i_2146_ - anInt8959);
						if (i_2154_ > 0) {
							i_2146_ += i_2154_;
							i_2149_ += i_2154_;
							i_2147_ += anInt8960 * i_2154_;
							i_2148_ += anInt8962 * i_2154_;
						} else
							i_2153_ -= i_2154_;
						if (i_2149_ < i_2153_)
							i_2149_ = i_2153_;
						for (/**/; i_2149_ < 0; i_2149_++) {
							int i_2155_ = (anIntArray11346[(i_2148_ >> 12) * anInt8945 + (i_2147_ >> 12)]);
							int i_2156_ = i_2155_ >>> 24;
							int i_2157_ = 256 - i_2156_;
							int i_2158_ = is_2029_[i_2146_];
							is_2029_[i_2146_++] = ((((i_2155_ & 0xff00ff) * i_2156_ + (i_2158_ & 0xff00ff) * i_2157_) & ~0xff00ff) + (((i_2155_ & 0xff00) * i_2156_ + (i_2158_ & 0xff00) * i_2157_) & 0xff0000)) >> 8;
							i_2147_ += anInt8960;
							i_2148_ += anInt8962;
						}
					}
					i_2144_++;
					anInt8966 += anInt8943;
					anInt8967 += anInt8963;
					anInt8959 += anInt8958;
				}
			}
		}
	}

	void method8429(boolean bool, boolean bool_2159_, boolean bool_2160_, int i, int i_2161_, float f, int i_2162_, int i_2163_, int i_2164_, int i_2165_, int i_2166_, int i_2167_, boolean bool_2168_) {
		if (i_2162_ > 0 && i_2163_ > 0 && (bool || bool_2159_)) {
			int i_2169_ = 0;
			int i_2170_ = 0;
			int i_2171_ = anInt8977 + anInt8945 + anInt8948;
			int i_2172_ = anInt8947 + anInt8950 + anInt8952;
			int i_2173_ = (i_2171_ << 16) / i_2162_;
			int i_2174_ = (i_2172_ << 16) / i_2163_;
			if (anInt8977 > 0) {
				int i_2175_ = ((anInt8977 << 16) + i_2173_ - 1) / i_2173_;
				i += i_2175_;
				i_2169_ += i_2175_ * i_2173_ - (anInt8977 << 16);
			}
			if (anInt8947 > 0) {
				int i_2176_ = ((anInt8947 << 16) + i_2174_ - 1) / i_2174_;
				i_2161_ += i_2176_;
				i_2170_ += i_2176_ * i_2174_ - (anInt8947 << 16);
			}
			if (anInt8945 < i_2171_)
				i_2162_ = ((anInt8945 << 16) - i_2169_ + i_2173_ - 1) / i_2173_;
			if (anInt8950 < i_2172_)
				i_2163_ = ((anInt8950 << 16) - i_2170_ + i_2174_ - 1) / i_2174_;
			int i_2177_ = i + i_2161_ * (aClass167_Sub1_8946.anInt8997 * -570111553);
			int i_2178_ = aClass167_Sub1_8946.anInt8997 * -570111553 - i_2162_;
			if (i_2161_ + i_2163_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_2163_ -= (i_2161_ + i_2163_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i_2161_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_2179_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_2161_;
				i_2163_ -= i_2179_;
				i_2177_ += i_2179_ * (aClass167_Sub1_8946.anInt8997 * -570111553);
				i_2170_ += i_2174_ * i_2179_;
			}
			if (i + i_2162_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_2180_ = i + i_2162_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_2162_ -= i_2180_;
				i_2178_ += i_2180_;
			}
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_2181_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_2162_ -= i_2181_;
				i_2177_ += i_2181_;
				i_2169_ += i_2173_ * i_2181_;
				i_2178_ += i_2181_;
			}
			float[] fs = aClass167_Sub1_8946.aFloatArray8999;
			int[] is = aClass167_Sub1_8946.anIntArray8996;
			if (i_2166_ == 0) {
				if (i_2164_ == 1) {
					int i_2182_ = i_2169_;
					for (int i_2183_ = -i_2163_; i_2183_ < 0; i_2183_++) {
						int i_2184_ = (i_2170_ >> 16) * anInt8945;
						for (int i_2185_ = -i_2162_; i_2185_ < 0; i_2185_++) {
							if (!bool_2159_ || f < fs[i_2177_]) {
								if (bool)
									is[i_2177_] = (anIntArray11346[(i_2169_ >> 16) + i_2184_]);
								if (bool_2159_ && bool_2168_)
									fs[i_2177_] = f;
							}
							i_2169_ += i_2173_;
							i_2177_++;
						}
						i_2170_ += i_2174_;
						i_2169_ = i_2182_;
						i_2177_ += i_2178_;
					}
				} else if (i_2164_ == 0) {
					int i_2186_ = (i_2165_ & 0xff0000) >> 16;
					int i_2187_ = (i_2165_ & 0xff00) >> 8;
					int i_2188_ = i_2165_ & 0xff;
					int i_2189_ = i_2169_;
					for (int i_2190_ = -i_2163_; i_2190_ < 0; i_2190_++) {
						int i_2191_ = (i_2170_ >> 16) * anInt8945;
						for (int i_2192_ = -i_2162_; i_2192_ < 0; i_2192_++) {
							if (!bool_2159_ || f < fs[i_2177_]) {
								if (bool) {
									int i_2193_ = (anIntArray11346[(i_2169_ >> 16) + i_2191_]);
									int i_2194_ = ((i_2193_ & 0xff0000) * i_2186_ & ~0xffffff);
									int i_2195_ = ((i_2193_ & 0xff00) * i_2187_ & 0xff0000);
									int i_2196_ = (i_2193_ & 0xff) * i_2188_ & 0xff00;
									is[i_2177_] = (i_2194_ | i_2195_ | i_2196_) >>> 8;
								}
								if (bool_2159_ && bool_2168_)
									fs[i_2177_] = f;
							}
							i_2169_ += i_2173_;
							i_2177_++;
						}
						i_2170_ += i_2174_;
						i_2169_ = i_2189_;
						i_2177_ += i_2178_;
					}
				} else if (i_2164_ == 3) {
					int i_2197_ = i_2169_;
					for (int i_2198_ = -i_2163_; i_2198_ < 0; i_2198_++) {
						int i_2199_ = (i_2170_ >> 16) * anInt8945;
						for (int i_2200_ = -i_2162_; i_2200_ < 0; i_2200_++) {
							if (!bool_2159_ || f < fs[i_2177_]) {
								if (bool) {
									int i_2201_ = (anIntArray11346[(i_2169_ >> 16) + i_2199_]);
									int i_2202_ = i_2201_ + i_2165_;
									int i_2203_ = ((i_2201_ & 0xff00ff) + (i_2165_ & 0xff00ff));
									int i_2204_ = ((i_2203_ & 0x1000100) + (i_2202_ - i_2203_ & 0x10000));
									is[i_2177_] = (i_2202_ - i_2204_ | i_2204_ - (i_2204_ >>> 8));
								}
								if (bool_2159_ && bool_2168_)
									fs[i_2177_] = f;
							}
							i_2169_ += i_2173_;
							i_2177_++;
						}
						i_2170_ += i_2174_;
						i_2169_ = i_2197_;
						i_2177_ += i_2178_;
					}
				} else if (i_2164_ == 2) {
					int i_2205_ = i_2165_ >>> 24;
					int i_2206_ = 256 - i_2205_;
					int i_2207_ = (i_2165_ & 0xff00ff) * i_2206_ & ~0xff00ff;
					int i_2208_ = (i_2165_ & 0xff00) * i_2206_ & 0xff0000;
					i_2165_ = (i_2207_ | i_2208_) >>> 8;
					int i_2209_ = i_2169_;
					for (int i_2210_ = -i_2163_; i_2210_ < 0; i_2210_++) {
						int i_2211_ = (i_2170_ >> 16) * anInt8945;
						for (int i_2212_ = -i_2162_; i_2212_ < 0; i_2212_++) {
							if (!bool_2159_ || f < fs[i_2177_]) {
								if (bool) {
									int i_2213_ = (anIntArray11346[(i_2169_ >> 16) + i_2211_]);
									i_2207_ = ((i_2213_ & 0xff00ff) * i_2205_ & ~0xff00ff);
									i_2208_ = ((i_2213_ & 0xff00) * i_2205_ & 0xff0000);
									is[i_2177_] = (((i_2207_ | i_2208_) >>> 8) + i_2165_);
								}
								if (bool_2159_ && bool_2168_)
									fs[i_2177_] = f;
							}
							i_2169_ += i_2173_;
							i_2177_++;
						}
						i_2170_ += i_2174_;
						i_2169_ = i_2209_;
						i_2177_ += i_2178_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2166_ == 1) {
				if (i_2164_ == 1) {
					int i_2214_ = i_2169_;
					for (int i_2215_ = -i_2163_; i_2215_ < 0; i_2215_++) {
						int i_2216_ = (i_2170_ >> 16) * anInt8945;
						for (int i_2217_ = -i_2162_; i_2217_ < 0; i_2217_++) {
							if (!bool_2159_ || f < fs[i_2177_]) {
								if (bool) {
									int i_2218_ = (anIntArray11346[(i_2169_ >> 16) + i_2216_]);
									int i_2219_ = i_2218_ >>> 24;
									int i_2220_ = 256 - i_2219_;
									int i_2221_ = is[i_2177_];
									is[i_2177_] = (((((i_2218_ & 0xff00ff) * i_2219_ + (i_2221_ & 0xff00ff) * i_2220_) & ~0xff00ff) >> 8) + (((((i_2218_ & ~0xff00ff) >>> 8) * i_2219_) + (((i_2221_ & ~0xff00ff) >>> 8) * i_2220_)) & ~0xff00ff));
								}
								if (bool_2159_ && bool_2168_)
									fs[i_2177_] = f;
							}
							i_2169_ += i_2173_;
							i_2177_++;
						}
						i_2170_ += i_2174_;
						i_2169_ = i_2214_;
						i_2177_ += i_2178_;
					}
				} else if (i_2164_ == 0) {
					int i_2222_ = i_2169_;
					if ((i_2165_ & 0xffffff) == 16777215) {
						for (int i_2223_ = -i_2163_; i_2223_ < 0; i_2223_++) {
							int i_2224_ = (i_2170_ >> 16) * anInt8945;
							for (int i_2225_ = -i_2162_; i_2225_ < 0; i_2225_++) {
								if (!bool_2159_ || f < fs[i_2177_]) {
									if (bool) {
										int i_2226_ = (anIntArray11346[(i_2169_ >> 16) + i_2224_]);
										int i_2227_ = ((i_2226_ >>> 24) * (i_2165_ >>> 24) >> 8);
										int i_2228_ = 256 - i_2227_;
										int i_2229_ = is[i_2177_];
										is[i_2177_] = ((((i_2226_ & 0xff00ff) * i_2227_ + ((i_2229_ & 0xff00ff) * i_2228_)) & ~0xff00ff) + (((i_2226_ & 0xff00) * i_2227_ + ((i_2229_ & 0xff00) * i_2228_)) & 0xff0000)) >> 8;
									}
									if (bool_2159_ && bool_2168_)
										fs[i_2177_] = f;
								}
								i_2169_ += i_2173_;
								i_2177_++;
							}
							i_2170_ += i_2174_;
							i_2169_ = i_2222_;
							i_2177_ += i_2178_;
						}
					} else {
						int i_2230_ = (i_2165_ & 0xff0000) >> 16;
						int i_2231_ = (i_2165_ & 0xff00) >> 8;
						int i_2232_ = i_2165_ & 0xff;
						for (int i_2233_ = -i_2163_; i_2233_ < 0; i_2233_++) {
							int i_2234_ = (i_2170_ >> 16) * anInt8945;
							for (int i_2235_ = -i_2162_; i_2235_ < 0; i_2235_++) {
								if (!bool_2159_ || f < fs[i_2177_]) {
									int i_2236_ = (anIntArray11346[(i_2169_ >> 16) + i_2234_]);
									int i_2237_ = ((i_2236_ >>> 24) * (i_2165_ >>> 24) >> 8);
									int i_2238_ = 256 - i_2237_;
									if (i_2237_ != 255) {
										if (bool) {
											int i_2239_ = (((i_2236_ & 0xff0000) * i_2230_) & ~0xffffff);
											int i_2240_ = ((i_2236_ & 0xff00) * i_2231_ & 0xff0000);
											int i_2241_ = ((i_2236_ & 0xff) * i_2232_ & 0xff00);
											i_2236_ = (i_2239_ | i_2240_ | i_2241_) >>> 8;
											int i_2242_ = is[i_2177_];
											is[i_2177_] = (((((i_2236_ & 0xff00ff) * i_2237_) + ((i_2242_ & 0xff00ff) * i_2238_)) & ~0xff00ff) + ((((i_2236_ & 0xff00) * i_2237_) + ((i_2242_ & 0xff00) * i_2238_)) & 0xff0000)) >> 8;
											if (bool_2160_) {
												int i_2243_ = ((i_2242_ >>> 24) + i_2237_);
												if (i_2243_ > 255)
													i_2243_ = 255;
												is[i_2177_] |= i_2243_ << 24;
											}
										}
										if (bool_2159_ && bool_2168_)
											fs[i_2177_] = f;
									} else {
										if (bool) {
											int i_2244_ = (((i_2236_ & 0xff0000) * i_2230_) & ~0xffffff);
											int i_2245_ = ((i_2236_ & 0xff00) * i_2231_ & 0xff0000);
											int i_2246_ = ((i_2236_ & 0xff) * i_2232_ & 0xff00);
											is[i_2177_] = (i_2244_ | i_2245_ | i_2246_) >>> 8;
										}
										if (bool_2159_ && bool_2168_)
											fs[i_2177_] = f;
									}
								}
								i_2169_ += i_2173_;
								i_2177_++;
							}
							i_2170_ += i_2174_;
							i_2169_ = i_2222_;
							i_2177_ += i_2178_;
						}
					}
				} else if (i_2164_ == 3) {
					int i_2247_ = i_2169_;
					for (int i_2248_ = -i_2163_; i_2248_ < 0; i_2248_++) {
						int i_2249_ = (i_2170_ >> 16) * anInt8945;
						for (int i_2250_ = -i_2162_; i_2250_ < 0; i_2250_++) {
							if (!bool_2159_ || f < fs[i_2177_]) {
								if (bool) {
									int i_2251_ = (anIntArray11346[(i_2169_ >> 16) + i_2249_]);
									int i_2252_ = i_2251_ + i_2165_;
									int i_2253_ = ((i_2251_ & 0xff00ff) + (i_2165_ & 0xff00ff));
									int i_2254_ = ((i_2253_ & 0x1000100) + (i_2252_ - i_2253_ & 0x10000));
									i_2254_ = (i_2252_ - i_2254_ | i_2254_ - (i_2254_ >>> 8));
									int i_2255_ = ((i_2254_ >>> 24) * (i_2165_ >>> 24) >> 8);
									int i_2256_ = 256 - i_2255_;
									if (i_2255_ != 255) {
										i_2251_ = i_2254_;
										i_2254_ = is[i_2177_];
										i_2254_ = ((((i_2251_ & 0xff00ff) * i_2255_ + ((i_2254_ & 0xff00ff) * i_2256_)) & ~0xff00ff) + (((i_2251_ & 0xff00) * i_2255_ + ((i_2254_ & 0xff00) * i_2256_)) & 0xff0000)) >> 8;
									}
									is[i_2177_] = i_2254_;
								}
								if (bool_2159_ && bool_2168_)
									fs[i_2177_] = f;
							}
							i_2169_ += i_2173_;
							i_2177_++;
						}
						i_2170_ += i_2174_;
						i_2169_ = i_2247_;
						i_2177_ += i_2178_;
					}
				} else if (i_2164_ == 2) {
					int i_2257_ = i_2165_ >>> 24;
					int i_2258_ = 256 - i_2257_;
					int i_2259_ = (i_2165_ & 0xff00ff) * i_2258_ & ~0xff00ff;
					int i_2260_ = (i_2165_ & 0xff00) * i_2258_ & 0xff0000;
					i_2165_ = (i_2259_ | i_2260_) >>> 8;
					int i_2261_ = i_2169_;
					for (int i_2262_ = -i_2163_; i_2262_ < 0; i_2262_++) {
						int i_2263_ = (i_2170_ >> 16) * anInt8945;
						for (int i_2264_ = -i_2162_; i_2264_ < 0; i_2264_++) {
							if (!bool_2159_ || f < fs[i_2177_]) {
								if (bool) {
									int i_2265_ = (anIntArray11346[(i_2169_ >> 16) + i_2263_]);
									int i_2266_ = i_2265_ >>> 24;
									int i_2267_ = 256 - i_2266_;
									i_2259_ = ((i_2265_ & 0xff00ff) * i_2257_ & ~0xff00ff);
									i_2260_ = ((i_2265_ & 0xff00) * i_2257_ & 0xff0000);
									i_2265_ = (((i_2259_ | i_2260_) >>> 8) + i_2165_);
									int i_2268_ = is[i_2177_];
									is[i_2177_] = ((((i_2265_ & 0xff00ff) * i_2266_ + (i_2268_ & 0xff00ff) * i_2267_) & ~0xff00ff) + (((i_2265_ & 0xff00) * i_2266_ + (i_2268_ & 0xff00) * i_2267_) & 0xff0000)) >> 8;
								}
								if (bool_2159_ && bool_2168_)
									fs[i_2177_] = f;
							}
							i_2169_ += i_2173_;
							i_2177_++;
						}
						i_2170_ += i_2174_;
						i_2169_ = i_2261_;
						i_2177_ += i_2178_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2166_ == 2) {
				if (i_2164_ == 1) {
					int i_2269_ = i_2169_;
					for (int i_2270_ = -i_2163_; i_2270_ < 0; i_2270_++) {
						int i_2271_ = (i_2170_ >> 16) * anInt8945;
						for (int i_2272_ = -i_2162_; i_2272_ < 0; i_2272_++) {
							if (!bool_2159_ || f < fs[i_2177_]) {
								int i_2273_ = (anIntArray11346[(i_2169_ >> 16) + i_2271_]);
								if (i_2273_ != 0) {
									if (bool) {
										int i_2274_ = is[i_2177_];
										int i_2275_ = i_2273_ + i_2274_;
										int i_2276_ = ((i_2273_ & 0xff00ff) + (i_2274_ & 0xff00ff));
										i_2274_ = ((i_2276_ & 0x1000100) + (i_2275_ - i_2276_ & 0x10000));
										is[i_2177_] = (i_2275_ - i_2274_ | i_2274_ - (i_2274_ >>> 8));
									}
									if (bool_2159_ && bool_2168_)
										fs[i_2177_] = f;
								}
							}
							i_2169_ += i_2173_;
							i_2177_++;
						}
						i_2170_ += i_2174_;
						i_2169_ = i_2269_;
						i_2177_ += i_2178_;
					}
				} else if (i_2164_ == 0) {
					int i_2277_ = i_2169_;
					int i_2278_ = (i_2165_ & 0xff0000) >> 16;
					int i_2279_ = (i_2165_ & 0xff00) >> 8;
					int i_2280_ = i_2165_ & 0xff;
					for (int i_2281_ = -i_2163_; i_2281_ < 0; i_2281_++) {
						int i_2282_ = (i_2170_ >> 16) * anInt8945;
						for (int i_2283_ = -i_2162_; i_2283_ < 0; i_2283_++) {
							if (!bool_2159_ || f < fs[i_2177_]) {
								int i_2284_ = (anIntArray11346[(i_2169_ >> 16) + i_2282_]);
								if (i_2284_ != 0) {
									if (bool) {
										int i_2285_ = ((i_2284_ & 0xff0000) * i_2278_ & ~0xffffff);
										int i_2286_ = ((i_2284_ & 0xff00) * i_2279_ & 0xff0000);
										int i_2287_ = ((i_2284_ & 0xff) * i_2280_ & 0xff00);
										i_2284_ = (i_2285_ | i_2286_ | i_2287_) >>> 8;
										int i_2288_ = is[i_2177_];
										int i_2289_ = i_2284_ + i_2288_;
										int i_2290_ = ((i_2284_ & 0xff00ff) + (i_2288_ & 0xff00ff));
										i_2288_ = ((i_2290_ & 0x1000100) + (i_2289_ - i_2290_ & 0x10000));
										is[i_2177_] = (i_2289_ - i_2288_ | i_2288_ - (i_2288_ >>> 8));
									}
									if (bool_2159_ && bool_2168_)
										fs[i_2177_] = f;
								}
							}
							i_2169_ += i_2173_;
							i_2177_++;
						}
						i_2170_ += i_2174_;
						i_2169_ = i_2277_;
						i_2177_ += i_2178_;
					}
				} else if (i_2164_ == 3) {
					int i_2291_ = i_2169_;
					for (int i_2292_ = -i_2163_; i_2292_ < 0; i_2292_++) {
						int i_2293_ = (i_2170_ >> 16) * anInt8945;
						for (int i_2294_ = -i_2162_; i_2294_ < 0; i_2294_++) {
							if (!bool_2159_ || f < fs[i_2177_]) {
								if (bool) {
									int i_2295_ = (anIntArray11346[(i_2169_ >> 16) + i_2293_]);
									int i_2296_ = i_2295_ + i_2165_;
									int i_2297_ = ((i_2295_ & 0xff00ff) + (i_2165_ & 0xff00ff));
									int i_2298_ = ((i_2297_ & 0x1000100) + (i_2296_ - i_2297_ & 0x10000));
									i_2295_ = (i_2296_ - i_2298_ | i_2298_ - (i_2298_ >>> 8));
									i_2298_ = is[i_2177_];
									i_2296_ = i_2295_ + i_2298_;
									i_2297_ = (i_2295_ & 0xff00ff) + (i_2298_ & 0xff00ff);
									i_2298_ = ((i_2297_ & 0x1000100) + (i_2296_ - i_2297_ & 0x10000));
									is[i_2177_] = (i_2296_ - i_2298_ | i_2298_ - (i_2298_ >>> 8));
								}
								if (bool_2159_ && bool_2168_)
									fs[i_2177_] = f;
							}
							i_2169_ += i_2173_;
							i_2177_++;
						}
						i_2170_ += i_2174_;
						i_2169_ = i_2291_;
						i_2177_ += i_2178_;
					}
				} else if (i_2164_ == 2) {
					int i_2299_ = i_2165_ >>> 24;
					int i_2300_ = 256 - i_2299_;
					int i_2301_ = (i_2165_ & 0xff00ff) * i_2300_ & ~0xff00ff;
					int i_2302_ = (i_2165_ & 0xff00) * i_2300_ & 0xff0000;
					i_2165_ = (i_2301_ | i_2302_) >>> 8;
					int i_2303_ = i_2169_;
					for (int i_2304_ = -i_2163_; i_2304_ < 0; i_2304_++) {
						int i_2305_ = (i_2170_ >> 16) * anInt8945;
						for (int i_2306_ = -i_2162_; i_2306_ < 0; i_2306_++) {
							if (!bool_2159_ || f < fs[i_2177_]) {
								int i_2307_ = (anIntArray11346[(i_2169_ >> 16) + i_2305_]);
								if (i_2307_ != 0) {
									if (bool) {
										i_2301_ = ((i_2307_ & 0xff00ff) * i_2299_ & ~0xff00ff);
										i_2302_ = ((i_2307_ & 0xff00) * i_2299_ & 0xff0000);
										i_2307_ = (((i_2301_ | i_2302_) >>> 8) + i_2165_);
										int i_2308_ = is[i_2177_];
										int i_2309_ = i_2307_ + i_2308_;
										int i_2310_ = ((i_2307_ & 0xff00ff) + (i_2308_ & 0xff00ff));
										i_2308_ = ((i_2310_ & 0x1000100) + (i_2309_ - i_2310_ & 0x10000));
										is[i_2177_] = (i_2309_ - i_2308_ | i_2308_ - (i_2308_ >>> 8));
									}
									if (bool_2159_ && bool_2168_)
										fs[i_2177_] = f;
								}
							}
							i_2169_ += i_2173_;
							i_2177_++;
						}
						i_2170_ += i_2174_;
						i_2169_ = i_2303_;
						i_2177_ += i_2178_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method10512(int i, int i_2311_, int i_2312_, int i_2313_, int[] is, int i_2314_, int i_2315_) {
		i_2315_ -= i_2312_;
		for (int i_2316_ = 0; i_2316_ < i_2313_; i_2316_++) {
			int i_2317_ = (i_2311_ + i_2316_) * i_2312_ + i;
			for (int i_2318_ = 0; i_2318_ < i_2312_; i_2318_++)
				is[i_2314_++] = anIntArray11346[i_2317_ + i_2318_];
			i_2314_ += i_2315_;
		}
	}

	Class143_Sub1_Sub1(Class167_Sub1 class167_sub1, int i, int i_2319_) {
		super(class167_sub1, i, i_2319_);
		anIntArray11346 = new int[i * i_2319_];
	}

	public void method1737(int i, int i_2320_, Class161 class161, int i_2321_, int i_2322_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			i += anInt8977;
			i_2320_ += anInt8947;
			int i_2323_ = 0;
			int i_2324_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			int i_2325_ = anInt8945;
			int i_2326_ = anInt8950;
			int i_2327_ = i_2324_ - i_2325_;
			int i_2328_ = 0;
			int i_2329_ = i + i_2320_ * i_2324_;
			if (i_2320_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_2330_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_2320_;
				i_2326_ -= i_2330_;
				i_2320_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_2323_ += i_2330_ * i_2325_;
				i_2329_ += i_2330_ * i_2324_;
			}
			if (i_2320_ + i_2326_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_2326_ -= (i_2320_ + i_2326_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_2331_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_2325_ -= i_2331_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_2323_ += i_2331_;
				i_2329_ += i_2331_;
				i_2328_ += i_2331_;
				i_2327_ += i_2331_;
			}
			if (i + i_2325_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_2332_ = i + i_2325_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_2325_ -= i_2332_;
				i_2328_ += i_2332_;
				i_2327_ += i_2332_;
			}
			if (i_2325_ > 0 && i_2326_ > 0) {
				Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
				int[] is_2333_ = class161_sub2.anIntArray9444;
				int[] is_2334_ = class161_sub2.anIntArray9445;
				int i_2335_ = i_2320_;
				if (i_2322_ > i_2335_) {
					i_2335_ = i_2322_;
					i_2329_ += (i_2322_ - i_2320_) * i_2324_;
					i_2323_ += (i_2322_ - i_2320_) * anInt8945;
				}
				int i_2336_ = (i_2322_ + is_2333_.length < i_2320_ + i_2326_ ? i_2322_ + is_2333_.length : i_2320_ + i_2326_);
				for (int i_2337_ = i_2335_; i_2337_ < i_2336_; i_2337_++) {
					int i_2338_ = is_2333_[i_2337_ - i_2322_] + i_2321_;
					int i_2339_ = is_2334_[i_2337_ - i_2322_];
					int i_2340_ = i_2325_;
					if (i > i_2338_) {
						int i_2341_ = i - i_2338_;
						if (i_2341_ >= i_2339_) {
							i_2323_ += i_2325_ + i_2328_;
							i_2329_ += i_2325_ + i_2327_;
							continue;
						}
						i_2339_ -= i_2341_;
					} else {
						int i_2342_ = i_2338_ - i;
						if (i_2342_ >= i_2325_) {
							i_2323_ += i_2325_ + i_2328_;
							i_2329_ += i_2325_ + i_2327_;
							continue;
						}
						i_2323_ += i_2342_;
						i_2340_ -= i_2342_;
						i_2329_ += i_2342_;
					}
					int i_2343_ = 0;
					if (i_2340_ < i_2339_)
						i_2339_ = i_2340_;
					else
						i_2343_ = i_2340_ - i_2339_;
					for (int i_2344_ = -i_2339_; i_2344_ < 0; i_2344_++) {
						int i_2345_ = anIntArray11346[i_2323_++];
						int i_2346_ = i_2345_ >>> 24;
						int i_2347_ = 256 - i_2346_;
						int i_2348_ = is[i_2329_];
						is[i_2329_++] = ((((i_2345_ & 0xff00ff) * i_2346_ + (i_2348_ & 0xff00ff) * i_2347_) & ~0xff00ff) + (((i_2345_ & 0xff00) * i_2346_ + (i_2348_ & 0xff00) * i_2347_) & 0xff0000)) >> 8;
					}
					i_2323_ += i_2343_ + i_2328_;
					i_2329_ += i_2343_ + i_2327_;
				}
			}
		}
	}

	public void method1754(int i, int i_2349_, Class161 class161, int i_2350_, int i_2351_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			i += anInt8977;
			i_2349_ += anInt8947;
			int i_2352_ = 0;
			int i_2353_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			int i_2354_ = anInt8945;
			int i_2355_ = anInt8950;
			int i_2356_ = i_2353_ - i_2354_;
			int i_2357_ = 0;
			int i_2358_ = i + i_2349_ * i_2353_;
			if (i_2349_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_2359_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_2349_;
				i_2355_ -= i_2359_;
				i_2349_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_2352_ += i_2359_ * i_2354_;
				i_2358_ += i_2359_ * i_2353_;
			}
			if (i_2349_ + i_2355_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_2355_ -= (i_2349_ + i_2355_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_2360_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_2354_ -= i_2360_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_2352_ += i_2360_;
				i_2358_ += i_2360_;
				i_2357_ += i_2360_;
				i_2356_ += i_2360_;
			}
			if (i + i_2354_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_2361_ = i + i_2354_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_2354_ -= i_2361_;
				i_2357_ += i_2361_;
				i_2356_ += i_2361_;
			}
			if (i_2354_ > 0 && i_2355_ > 0) {
				Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
				int[] is_2362_ = class161_sub2.anIntArray9444;
				int[] is_2363_ = class161_sub2.anIntArray9445;
				int i_2364_ = i_2349_;
				if (i_2351_ > i_2364_) {
					i_2364_ = i_2351_;
					i_2358_ += (i_2351_ - i_2349_) * i_2353_;
					i_2352_ += (i_2351_ - i_2349_) * anInt8945;
				}
				int i_2365_ = (i_2351_ + is_2362_.length < i_2349_ + i_2355_ ? i_2351_ + is_2362_.length : i_2349_ + i_2355_);
				for (int i_2366_ = i_2364_; i_2366_ < i_2365_; i_2366_++) {
					int i_2367_ = is_2362_[i_2366_ - i_2351_] + i_2350_;
					int i_2368_ = is_2363_[i_2366_ - i_2351_];
					int i_2369_ = i_2354_;
					if (i > i_2367_) {
						int i_2370_ = i - i_2367_;
						if (i_2370_ >= i_2368_) {
							i_2352_ += i_2354_ + i_2357_;
							i_2358_ += i_2354_ + i_2356_;
							continue;
						}
						i_2368_ -= i_2370_;
					} else {
						int i_2371_ = i_2367_ - i;
						if (i_2371_ >= i_2354_) {
							i_2352_ += i_2354_ + i_2357_;
							i_2358_ += i_2354_ + i_2356_;
							continue;
						}
						i_2352_ += i_2371_;
						i_2369_ -= i_2371_;
						i_2358_ += i_2371_;
					}
					int i_2372_ = 0;
					if (i_2369_ < i_2368_)
						i_2368_ = i_2369_;
					else
						i_2372_ = i_2369_ - i_2368_;
					for (int i_2373_ = -i_2368_; i_2373_ < 0; i_2373_++) {
						int i_2374_ = anIntArray11346[i_2352_++];
						int i_2375_ = i_2374_ >>> 24;
						int i_2376_ = 256 - i_2375_;
						int i_2377_ = is[i_2358_];
						is[i_2358_++] = ((((i_2374_ & 0xff00ff) * i_2375_ + (i_2377_ & 0xff00ff) * i_2376_) & ~0xff00ff) + (((i_2374_ & 0xff00) * i_2375_ + (i_2377_ & 0xff00) * i_2376_) & 0xff0000)) >> 8;
					}
					i_2352_ += i_2372_ + i_2357_;
					i_2358_ += i_2372_ + i_2356_;
				}
			}
		}
	}

	public void method1762(int i, int i_2378_, Class161 class161, int i_2379_, int i_2380_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			i += anInt8977;
			i_2378_ += anInt8947;
			int i_2381_ = 0;
			int i_2382_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			int i_2383_ = anInt8945;
			int i_2384_ = anInt8950;
			int i_2385_ = i_2382_ - i_2383_;
			int i_2386_ = 0;
			int i_2387_ = i + i_2378_ * i_2382_;
			if (i_2378_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_2388_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_2378_;
				i_2384_ -= i_2388_;
				i_2378_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_2381_ += i_2388_ * i_2383_;
				i_2387_ += i_2388_ * i_2382_;
			}
			if (i_2378_ + i_2384_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_2384_ -= (i_2378_ + i_2384_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_2389_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_2383_ -= i_2389_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_2381_ += i_2389_;
				i_2387_ += i_2389_;
				i_2386_ += i_2389_;
				i_2385_ += i_2389_;
			}
			if (i + i_2383_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_2390_ = i + i_2383_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_2383_ -= i_2390_;
				i_2386_ += i_2390_;
				i_2385_ += i_2390_;
			}
			if (i_2383_ > 0 && i_2384_ > 0) {
				Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
				int[] is_2391_ = class161_sub2.anIntArray9444;
				int[] is_2392_ = class161_sub2.anIntArray9445;
				int i_2393_ = i_2378_;
				if (i_2380_ > i_2393_) {
					i_2393_ = i_2380_;
					i_2387_ += (i_2380_ - i_2378_) * i_2382_;
					i_2381_ += (i_2380_ - i_2378_) * anInt8945;
				}
				int i_2394_ = (i_2380_ + is_2391_.length < i_2378_ + i_2384_ ? i_2380_ + is_2391_.length : i_2378_ + i_2384_);
				for (int i_2395_ = i_2393_; i_2395_ < i_2394_; i_2395_++) {
					int i_2396_ = is_2391_[i_2395_ - i_2380_] + i_2379_;
					int i_2397_ = is_2392_[i_2395_ - i_2380_];
					int i_2398_ = i_2383_;
					if (i > i_2396_) {
						int i_2399_ = i - i_2396_;
						if (i_2399_ >= i_2397_) {
							i_2381_ += i_2383_ + i_2386_;
							i_2387_ += i_2383_ + i_2385_;
							continue;
						}
						i_2397_ -= i_2399_;
					} else {
						int i_2400_ = i_2396_ - i;
						if (i_2400_ >= i_2383_) {
							i_2381_ += i_2383_ + i_2386_;
							i_2387_ += i_2383_ + i_2385_;
							continue;
						}
						i_2381_ += i_2400_;
						i_2398_ -= i_2400_;
						i_2387_ += i_2400_;
					}
					int i_2401_ = 0;
					if (i_2398_ < i_2397_)
						i_2397_ = i_2398_;
					else
						i_2401_ = i_2398_ - i_2397_;
					for (int i_2402_ = -i_2397_; i_2402_ < 0; i_2402_++) {
						int i_2403_ = anIntArray11346[i_2381_++];
						int i_2404_ = i_2403_ >>> 24;
						int i_2405_ = 256 - i_2404_;
						int i_2406_ = is[i_2387_];
						is[i_2387_++] = ((((i_2403_ & 0xff00ff) * i_2404_ + (i_2406_ & 0xff00ff) * i_2405_) & ~0xff00ff) + (((i_2403_ & 0xff00) * i_2404_ + (i_2406_ & 0xff00) * i_2405_) & 0xff0000)) >> 8;
					}
					i_2381_ += i_2401_ + i_2386_;
					i_2387_ += i_2401_ + i_2385_;
				}
			}
		}
	}

	public void method1727(int i, int i_2407_, int i_2408_) {
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is == null)
			throw new IllegalStateException("");
		if (i_2408_ == 0) {
			for (int i_2409_ = 0; i_2409_ < anInt8950; i_2409_++) {
				int i_2410_ = i_2409_ * anInt8945;
				int i_2411_ = ((i_2407_ + i_2409_) * (aClass167_Sub1_8946.anInt8997 * -570111553) + i);
				for (int i_2412_ = 0; i_2412_ < anInt8945; i_2412_++)
					anIntArray11346[i_2410_ + i_2412_] = (anIntArray11346[i_2410_ + i_2412_] & 0xffffff | is[i_2411_ + i_2412_] << 8 & ~0xffffff);
			}
		} else if (i_2408_ == 1) {
			for (int i_2413_ = 0; i_2413_ < anInt8950; i_2413_++) {
				int i_2414_ = i_2413_ * anInt8945;
				int i_2415_ = ((i_2407_ + i_2413_) * (aClass167_Sub1_8946.anInt8997 * -570111553) + i);
				for (int i_2416_ = 0; i_2416_ < anInt8945; i_2416_++)
					anIntArray11346[i_2414_ + i_2416_] = (anIntArray11346[i_2414_ + i_2416_] & 0xffffff | is[i_2415_ + i_2416_] << 16 & ~0xffffff);
			}
		} else if (i_2408_ == 2) {
			for (int i_2417_ = 0; i_2417_ < anInt8950; i_2417_++) {
				int i_2418_ = i_2417_ * anInt8945;
				int i_2419_ = ((i_2407_ + i_2417_) * (aClass167_Sub1_8946.anInt8997 * -570111553) + i);
				for (int i_2420_ = 0; i_2420_ < anInt8945; i_2420_++)
					anIntArray11346[i_2418_ + i_2420_] = (anIntArray11346[i_2418_ + i_2420_] & 0xffffff | is[i_2419_ + i_2420_] << 24 & ~0xffffff);
			}
		} else if (i_2408_ == 3) {
			for (int i_2421_ = 0; i_2421_ < anInt8950; i_2421_++) {
				int i_2422_ = i_2421_ * anInt8945;
				int i_2423_ = ((i_2407_ + i_2421_) * (aClass167_Sub1_8946.anInt8997 * -570111553) + i);
				for (int i_2424_ = 0; i_2424_ < anInt8945; i_2424_++)
					anIntArray11346[i_2422_ + i_2424_] = (anIntArray11346[i_2422_ + i_2424_] & 0xffffff | (is[i_2423_ + i_2424_] != 0 ? -16777216 : 0));
			}
		}
	}

	public void method1764(int i, int i_2425_, Class161 class161, int i_2426_, int i_2427_) {
		if (aClass167_Sub1_8946.method8443())
			throw new IllegalStateException();
		int[] is = aClass167_Sub1_8946.anIntArray8996;
		if (is != null) {
			i += anInt8977;
			i_2425_ += anInt8947;
			int i_2428_ = 0;
			int i_2429_ = aClass167_Sub1_8946.anInt8997 * -570111553;
			int i_2430_ = anInt8945;
			int i_2431_ = anInt8950;
			int i_2432_ = i_2429_ - i_2430_;
			int i_2433_ = 0;
			int i_2434_ = i + i_2425_ * i_2429_;
			if (i_2425_ < aClass167_Sub1_8946.anInt9021 * -1593163361) {
				int i_2435_ = aClass167_Sub1_8946.anInt9021 * -1593163361 - i_2425_;
				i_2431_ -= i_2435_;
				i_2425_ = aClass167_Sub1_8946.anInt9021 * -1593163361;
				i_2428_ += i_2435_ * i_2430_;
				i_2434_ += i_2435_ * i_2429_;
			}
			if (i_2425_ + i_2431_ > aClass167_Sub1_8946.anInt9003 * -148513205)
				i_2431_ -= (i_2425_ + i_2431_ - aClass167_Sub1_8946.anInt9003 * -148513205);
			if (i < aClass167_Sub1_8946.anInt9000 * 1352816403) {
				int i_2436_ = aClass167_Sub1_8946.anInt9000 * 1352816403 - i;
				i_2430_ -= i_2436_;
				i = aClass167_Sub1_8946.anInt9000 * 1352816403;
				i_2428_ += i_2436_;
				i_2434_ += i_2436_;
				i_2433_ += i_2436_;
				i_2432_ += i_2436_;
			}
			if (i + i_2430_ > aClass167_Sub1_8946.anInt9001 * 2024498147) {
				int i_2437_ = i + i_2430_ - aClass167_Sub1_8946.anInt9001 * 2024498147;
				i_2430_ -= i_2437_;
				i_2433_ += i_2437_;
				i_2432_ += i_2437_;
			}
			if (i_2430_ > 0 && i_2431_ > 0) {
				Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
				int[] is_2438_ = class161_sub2.anIntArray9444;
				int[] is_2439_ = class161_sub2.anIntArray9445;
				int i_2440_ = i_2425_;
				if (i_2427_ > i_2440_) {
					i_2440_ = i_2427_;
					i_2434_ += (i_2427_ - i_2425_) * i_2429_;
					i_2428_ += (i_2427_ - i_2425_) * anInt8945;
				}
				int i_2441_ = (i_2427_ + is_2438_.length < i_2425_ + i_2431_ ? i_2427_ + is_2438_.length : i_2425_ + i_2431_);
				for (int i_2442_ = i_2440_; i_2442_ < i_2441_; i_2442_++) {
					int i_2443_ = is_2438_[i_2442_ - i_2427_] + i_2426_;
					int i_2444_ = is_2439_[i_2442_ - i_2427_];
					int i_2445_ = i_2430_;
					if (i > i_2443_) {
						int i_2446_ = i - i_2443_;
						if (i_2446_ >= i_2444_) {
							i_2428_ += i_2430_ + i_2433_;
							i_2434_ += i_2430_ + i_2432_;
							continue;
						}
						i_2444_ -= i_2446_;
					} else {
						int i_2447_ = i_2443_ - i;
						if (i_2447_ >= i_2430_) {
							i_2428_ += i_2430_ + i_2433_;
							i_2434_ += i_2430_ + i_2432_;
							continue;
						}
						i_2428_ += i_2447_;
						i_2445_ -= i_2447_;
						i_2434_ += i_2447_;
					}
					int i_2448_ = 0;
					if (i_2445_ < i_2444_)
						i_2444_ = i_2445_;
					else
						i_2448_ = i_2445_ - i_2444_;
					for (int i_2449_ = -i_2444_; i_2449_ < 0; i_2449_++) {
						int i_2450_ = anIntArray11346[i_2428_++];
						int i_2451_ = i_2450_ >>> 24;
						int i_2452_ = 256 - i_2451_;
						int i_2453_ = is[i_2434_];
						is[i_2434_++] = ((((i_2450_ & 0xff00ff) * i_2451_ + (i_2453_ & 0xff00ff) * i_2452_) & ~0xff00ff) + (((i_2450_ & 0xff00) * i_2451_ + (i_2453_ & 0xff00) * i_2452_) & 0xff0000)) >> 8;
					}
					i_2428_ += i_2448_ + i_2433_;
					i_2434_ += i_2448_ + i_2432_;
				}
			}
		}
	}
}
