/* Class184_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class184_Sub6 extends FontRenderer {
	int[] anIntArray9927;
	byte[][] aByteArrayArray9928;
	int[] anIntArray9929;
	Class167_Sub1 aClass167_Sub1_9930;
	int[] anIntArray9931;
	int[] anIntArray9932;
	static int anInt9933;
	static int anInt9934;

	void method9077(byte[] is, int[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		int i_7_ = -(i_3_ >> 2);
		i_3_ = -(i_3_ & 0x3);
		for (int i_8_ = -i_4_; i_8_ < 0; i_8_++) {
			for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
				if (is[i_1_++] != 0)
					is_0_[i_2_++] = i;
				else
					i_2_++;
				if (is[i_1_++] != 0)
					is_0_[i_2_++] = i;
				else
					i_2_++;
				if (is[i_1_++] != 0)
					is_0_[i_2_++] = i;
				else
					i_2_++;
				if (is[i_1_++] != 0)
					is_0_[i_2_++] = i;
				else
					i_2_++;
			}
			for (int i_10_ = i_3_; i_10_ < 0; i_10_++) {
				if (is[i_1_++] != 0)
					is_0_[i_2_++] = i;
				else
					i_2_++;
			}
			i_2_ += i_5_;
			i_1_ += i_6_;
		}
	}

	void method9078(byte[] is, int[] is_11_, int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, Class161 class161, int i_21_, int i_22_) {
		Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
		int[] is_23_ = class161_sub2.anIntArray9444;
		int[] is_24_ = class161_sub2.anIntArray9445;
		int i_25_ = i_19_;
		if (i_22_ > i_25_) {
			i_25_ = i_22_;
			i_13_ += aClass167_Sub1_9930.anInt8997 * -570111553 * (i_22_ - i_19_);
			i_12_ += i_20_ * (i_22_ - i_19_);
		}
		int i_26_ = (is_23_.length + i_22_ < i_15_ + i_19_ ? i_22_ + is_23_.length : i_15_ + i_19_);
		for (int i_27_ = i_25_; i_27_ < i_26_; i_27_++) {
			int i_28_ = i_21_ + is_23_[i_27_ - i_22_];
			int i_29_ = is_24_[i_27_ - i_22_];
			int i_30_ = i_14_;
			if (i_18_ > i_28_) {
				int i_31_ = i_18_ - i_28_;
				if (i_31_ >= i_29_) {
					i_12_ += i_17_ + i_14_;
					i_13_ += i_14_ + i_16_;
					continue;
				}
				i_29_ -= i_31_;
			} else {
				int i_32_ = i_28_ - i_18_;
				if (i_32_ >= i_14_) {
					i_12_ += i_14_ + i_17_;
					i_13_ += i_14_ + i_16_;
					continue;
				}
				i_12_ += i_32_;
				i_30_ -= i_32_;
				i_13_ += i_32_;
			}
			int i_33_ = 0;
			if (i_30_ < i_29_)
				i_29_ = i_30_;
			else
				i_33_ = i_30_ - i_29_;
			for (int i_34_ = 0; i_34_ < i_29_; i_34_++) {
				if (is[i_12_++] != 0)
					is_11_[i_13_++] = i;
				else
					i_13_++;
			}
			i_12_ += i_33_ + i_17_;
			i_13_ += i_33_ + i_16_;
		}
	}

	void method2755(char c, int i, int i_35_, int i_36_, boolean bool) {
		if (null != aClass167_Sub1_9930.anIntArray8996) {
			i += anIntArray9932[c];
			i_35_ += anIntArray9931[c];
			int i_37_ = anIntArray9929[c];
			int i_38_ = anIntArray9927[c];
			int i_39_ = aClass167_Sub1_9930.anInt8997 * -570111553;
			int i_40_ = i_35_ * i_39_ + i;
			int i_41_ = i_39_ - i_37_;
			int i_42_ = 0;
			int i_43_ = 0;
			if (i_35_ < aClass167_Sub1_9930.anInt9021 * -1593163361) {
				int i_44_ = aClass167_Sub1_9930.anInt9021 * -1593163361 - i_35_;
				i_38_ -= i_44_;
				i_35_ = -1593163361 * aClass167_Sub1_9930.anInt9021;
				i_43_ += i_44_ * i_37_;
				i_40_ += i_39_ * i_44_;
			}
			if (i_38_ + i_35_ > aClass167_Sub1_9930.anInt9003 * -148513205)
				i_38_ -= (i_38_ + i_35_ - -148513205 * aClass167_Sub1_9930.anInt9003);
			if (i < aClass167_Sub1_9930.anInt9000 * 1352816403) {
				int i_45_ = 1352816403 * aClass167_Sub1_9930.anInt9000 - i;
				i_37_ -= i_45_;
				i = 1352816403 * aClass167_Sub1_9930.anInt9000;
				i_43_ += i_45_;
				i_40_ += i_45_;
				i_42_ += i_45_;
				i_41_ += i_45_;
			}
			if (i_37_ + i > 2024498147 * aClass167_Sub1_9930.anInt9001) {
				int i_46_ = i + i_37_ - 2024498147 * aClass167_Sub1_9930.anInt9001;
				i_37_ -= i_46_;
				i_42_ += i_46_;
				i_41_ += i_46_;
			}
			if (i_37_ > 0 && i_38_ > 0) {
				if (-16777216 == (i_36_ & ~0xffffff))
					method9077(aByteArrayArray9928[c], aClass167_Sub1_9930.anIntArray8996, i_36_, i_43_, i_40_, i_37_, i_38_, i_41_, i_42_);
				else if (0 != (i_36_ & ~0xffffff))
					method9080(aByteArrayArray9928[c], aClass167_Sub1_9930.anIntArray8996, i_36_, i_43_, i_40_, i_37_, i_38_, i_41_, i_42_);
			}
		}
	}

	Class184_Sub6(Class167_Sub1 class167_sub1, Class2 class2, Class179_Sub2[] class179_sub2s, int[] is, int[] is_47_) {
		super(class167_sub1, class2);
		aClass167_Sub1_9930 = class167_sub1;
		anIntArray9929 = is;
		anIntArray9927 = is_47_;
		aByteArrayArray9928 = new byte[class179_sub2s.length][];
		anIntArray9931 = new int[class179_sub2s.length];
		anIntArray9932 = new int[class179_sub2s.length];
		for (int i = 0; i < class179_sub2s.length; i++) {
			aByteArrayArray9928[i] = class179_sub2s[i].aByteArray9820;
			anIntArray9931[i] = class179_sub2s[i].anInt9819;
			anIntArray9932[i] = class179_sub2s[i].anInt9815;
		}
	}

	Class184_Sub6(Class167_Sub1 class167_sub1, Class2 class2, Class179_Sub1[] class179_sub1s, int[] is, int[] is_48_) {
		super(class167_sub1, class2);
		aClass167_Sub1_9930 = class167_sub1;
		anIntArray9929 = is;
		anIntArray9927 = is_48_;
		aByteArrayArray9928 = new byte[class179_sub1s.length][];
		anIntArray9931 = new int[class179_sub1s.length];
		anIntArray9932 = new int[class179_sub1s.length];
		for (int i = 0; i < class179_sub1s.length; i++) {
			int[] is_49_ = class179_sub1s[i].method2643(false);
			byte[] is_50_ = aByteArrayArray9928[i] = new byte[is_49_.length];
			for (int i_51_ = 0; i_51_ < is_49_.length; i_51_++) {
				int i_52_ = is_49_[i_51_];
				byte i_53_ = (byte) ((4 * (i_52_ >> 8 & 0xff) + 3 * (i_52_ >> 16 & 0xff) + (i_52_ & 0xff)) >> 3);
				is_50_[i_51_] = i_53_;
			}
			anIntArray9931[i] = class179_sub1s[i].method2637();
			anIntArray9932[i] = class179_sub1s[i].method2635();
		}
	}

	void method9079(byte[] is, int[] is_54_, int i, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, Class161 class161, int i_64_, int i_65_) {
		Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
		int[] is_66_ = class161_sub2.anIntArray9444;
		int[] is_67_ = class161_sub2.anIntArray9445;
		int i_68_ = i_61_ - aClass167_Sub1_9930.anInt9000 * 1352816403;
		int i_69_ = i_62_;
		if (i_65_ > i_69_) {
			i_69_ = i_65_;
			i_56_ += (i_65_ - i_62_) * (-570111553 * aClass167_Sub1_9930.anInt8997);
			i_55_ += i_63_ * (i_65_ - i_62_);
		}
		int i_70_ = (i_65_ + is_66_.length < i_62_ + i_58_ ? i_65_ + is_66_.length : i_58_ + i_62_);
		int i_71_ = i >>> 24;
		int i_72_ = 255 - i_71_;
		for (int i_73_ = i_69_; i_73_ < i_70_; i_73_++) {
			int i_74_ = i_64_ + is_66_[i_73_ - i_65_];
			int i_75_ = is_67_[i_73_ - i_65_];
			int i_76_ = i_57_;
			if (i_68_ > i_74_) {
				int i_77_ = i_68_ - i_74_;
				if (i_77_ >= i_75_) {
					i_55_ += i_60_ + i_57_;
					i_56_ += i_57_ + i_59_;
					continue;
				}
				i_75_ -= i_77_;
			} else {
				int i_78_ = i_74_ - i_68_;
				if (i_78_ >= i_57_) {
					i_55_ += i_57_ + i_60_;
					i_56_ += i_57_ + i_59_;
					continue;
				}
				i_55_ += i_78_;
				i_76_ -= i_78_;
				i_56_ += i_78_;
			}
			int i_79_ = 0;
			if (i_76_ < i_75_)
				i_75_ = i_76_;
			else
				i_79_ = i_76_ - i_75_;
			for (int i_80_ = -i_75_; i_80_ < 0; i_80_++) {
				if (is[i_55_++] != 0) {
					int i_81_ = (((i_71_ * (i & 0xff00ff) & ~0xff00ff) + (i_71_ * (i & 0xff00) & 0xff0000)) >> 8);
					int i_82_ = is_54_[i_56_];
					is_54_[i_56_++] = (((i_72_ * (i_82_ & 0xff00ff) & ~0xff00ff) + ((i_82_ & 0xff00) * i_72_ & 0xff0000)) >> 8) + i_81_;
				} else
					i_56_++;
			}
			i_55_ += i_60_ + i_79_;
			i_56_ += i_59_ + i_79_;
		}
	}

	void method9080(byte[] is, int[] is_83_, int i, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, int i_89_) {
		int i_90_ = i >>> 24;
		int i_91_ = 255 - i_90_;
		for (int i_92_ = -i_87_; i_92_ < 0; i_92_++) {
			for (int i_93_ = -i_86_; i_93_ < 0; i_93_++) {
				if (is[i_84_++] != 0) {
					int i_94_ = (((i_90_ * (i & 0xff00) & 0xff0000) + ((i & 0xff00ff) * i_90_ & ~0xff00ff)) >> 8);
					int i_95_ = is_83_[i_85_];
					is_83_[i_85_++] = i_94_ + (((i_91_ * (i_95_ & 0xff00) & 0xff0000) + (i_91_ * (i_95_ & 0xff00ff) & ~0xff00ff)) >> 8);
				} else
					i_85_++;
			}
			i_85_ += i_88_;
			i_84_ += i_89_;
		}
	}

	void method2753(char c, int i, int i_96_, int i_97_, boolean bool) {
		if (null != aClass167_Sub1_9930.anIntArray8996) {
			i += anIntArray9932[c];
			i_96_ += anIntArray9931[c];
			int i_98_ = anIntArray9929[c];
			int i_99_ = anIntArray9927[c];
			int i_100_ = aClass167_Sub1_9930.anInt8997 * -570111553;
			int i_101_ = i_96_ * i_100_ + i;
			int i_102_ = i_100_ - i_98_;
			int i_103_ = 0;
			int i_104_ = 0;
			if (i_96_ < aClass167_Sub1_9930.anInt9021 * -1593163361) {
				int i_105_ = aClass167_Sub1_9930.anInt9021 * -1593163361 - i_96_;
				i_99_ -= i_105_;
				i_96_ = -1593163361 * aClass167_Sub1_9930.anInt9021;
				i_104_ += i_105_ * i_98_;
				i_101_ += i_100_ * i_105_;
			}
			if (i_99_ + i_96_ > aClass167_Sub1_9930.anInt9003 * -148513205)
				i_99_ -= (i_99_ + i_96_ - -148513205 * aClass167_Sub1_9930.anInt9003);
			if (i < aClass167_Sub1_9930.anInt9000 * 1352816403) {
				int i_106_ = 1352816403 * aClass167_Sub1_9930.anInt9000 - i;
				i_98_ -= i_106_;
				i = 1352816403 * aClass167_Sub1_9930.anInt9000;
				i_104_ += i_106_;
				i_101_ += i_106_;
				i_103_ += i_106_;
				i_102_ += i_106_;
			}
			if (i_98_ + i > 2024498147 * aClass167_Sub1_9930.anInt9001) {
				int i_107_ = i + i_98_ - 2024498147 * aClass167_Sub1_9930.anInt9001;
				i_98_ -= i_107_;
				i_103_ += i_107_;
				i_102_ += i_107_;
			}
			if (i_98_ > 0 && i_99_ > 0) {
				if (-16777216 == (i_97_ & ~0xffffff))
					method9077(aByteArrayArray9928[c], aClass167_Sub1_9930.anIntArray8996, i_97_, i_104_, i_101_, i_98_, i_99_, i_102_, i_103_);
				else if (0 != (i_97_ & ~0xffffff))
					method9080(aByteArrayArray9928[c], aClass167_Sub1_9930.anIntArray8996, i_97_, i_104_, i_101_, i_98_, i_99_, i_102_, i_103_);
			}
		}
	}

	void method2749(char c, int i, int i_108_, int i_109_, boolean bool, Class161 class161, int i_110_, int i_111_) {
		if (null != aClass167_Sub1_9930.anIntArray8996) {
			if (null == class161)
				method2755(c, i, i_108_, i_109_, bool);
			else {
				i += anIntArray9932[c];
				i_108_ += anIntArray9931[c];
				int i_112_ = anIntArray9929[c];
				int i_113_ = anIntArray9927[c];
				int i_114_ = -570111553 * aClass167_Sub1_9930.anInt8997;
				int i_115_ = i + i_114_ * i_108_;
				int i_116_ = i_114_ - i_112_;
				int i_117_ = 0;
				int i_118_ = 0;
				if (i_108_ < -1593163361 * aClass167_Sub1_9930.anInt9021) {
					int i_119_ = aClass167_Sub1_9930.anInt9021 * -1593163361 - i_108_;
					i_113_ -= i_119_;
					i_108_ = -1593163361 * aClass167_Sub1_9930.anInt9021;
					i_118_ += i_112_ * i_119_;
					i_115_ += i_114_ * i_119_;
				}
				if (i_108_ + i_113_ > -148513205 * aClass167_Sub1_9930.anInt9003)
					i_113_ -= (i_108_ + i_113_ - -148513205 * aClass167_Sub1_9930.anInt9003);
				if (i < aClass167_Sub1_9930.anInt9000 * 1352816403) {
					int i_120_ = aClass167_Sub1_9930.anInt9000 * 1352816403 - i;
					i_112_ -= i_120_;
					i = aClass167_Sub1_9930.anInt9000 * 1352816403;
					i_118_ += i_120_;
					i_115_ += i_120_;
					i_117_ += i_120_;
					i_116_ += i_120_;
				}
				if (i_112_ + i > aClass167_Sub1_9930.anInt9001 * 2024498147) {
					int i_121_ = (i_112_ + i - 2024498147 * aClass167_Sub1_9930.anInt9001);
					i_112_ -= i_121_;
					i_117_ += i_121_;
					i_116_ += i_121_;
				}
				if (i_112_ > 0 && i_113_ > 0) {
					if ((i_109_ & ~0xffffff) == -16777216)
						method9078(aByteArrayArray9928[c], aClass167_Sub1_9930.anIntArray8996, i_109_, i_118_, i_115_, i_112_, i_113_, i_116_, i_117_, i, i_108_, anIntArray9929[c], class161, i_110_, i_111_);
					else
						method9079(aByteArrayArray9928[c], aClass167_Sub1_9930.anIntArray8996, i_109_, i_118_, i_115_, i_112_, i_113_, i_116_, i_117_, i, i_108_, anIntArray9929[c], class161, i_110_, i_111_);
				}
			}
		}
	}

	void method2752(char c, int i, int i_122_, int i_123_, boolean bool, Class161 class161, int i_124_, int i_125_) {
		if (null != aClass167_Sub1_9930.anIntArray8996) {
			if (null == class161)
				method2755(c, i, i_122_, i_123_, bool);
			else {
				i += anIntArray9932[c];
				i_122_ += anIntArray9931[c];
				int i_126_ = anIntArray9929[c];
				int i_127_ = anIntArray9927[c];
				int i_128_ = -570111553 * aClass167_Sub1_9930.anInt8997;
				int i_129_ = i + i_128_ * i_122_;
				int i_130_ = i_128_ - i_126_;
				int i_131_ = 0;
				int i_132_ = 0;
				if (i_122_ < -1593163361 * aClass167_Sub1_9930.anInt9021) {
					int i_133_ = aClass167_Sub1_9930.anInt9021 * -1593163361 - i_122_;
					i_127_ -= i_133_;
					i_122_ = -1593163361 * aClass167_Sub1_9930.anInt9021;
					i_132_ += i_126_ * i_133_;
					i_129_ += i_128_ * i_133_;
				}
				if (i_122_ + i_127_ > -148513205 * aClass167_Sub1_9930.anInt9003)
					i_127_ -= (i_122_ + i_127_ - -148513205 * aClass167_Sub1_9930.anInt9003);
				if (i < aClass167_Sub1_9930.anInt9000 * 1352816403) {
					int i_134_ = aClass167_Sub1_9930.anInt9000 * 1352816403 - i;
					i_126_ -= i_134_;
					i = aClass167_Sub1_9930.anInt9000 * 1352816403;
					i_132_ += i_134_;
					i_129_ += i_134_;
					i_131_ += i_134_;
					i_130_ += i_134_;
				}
				if (i_126_ + i > aClass167_Sub1_9930.anInt9001 * 2024498147) {
					int i_135_ = (i_126_ + i - 2024498147 * aClass167_Sub1_9930.anInt9001);
					i_126_ -= i_135_;
					i_131_ += i_135_;
					i_130_ += i_135_;
				}
				if (i_126_ > 0 && i_127_ > 0) {
					if ((i_123_ & ~0xffffff) == -16777216)
						method9078(aByteArrayArray9928[c], aClass167_Sub1_9930.anIntArray8996, i_123_, i_132_, i_129_, i_126_, i_127_, i_130_, i_131_, i, i_122_, anIntArray9929[c], class161, i_124_, i_125_);
					else
						method9079(aByteArrayArray9928[c], aClass167_Sub1_9930.anIntArray8996, i_123_, i_132_, i_129_, i_126_, i_127_, i_130_, i_131_, i, i_122_, anIntArray9929[c], class161, i_124_, i_125_);
				}
			}
		}
	}

	void method2751(char c, int i, int i_136_, int i_137_, boolean bool, Class161 class161, int i_138_, int i_139_) {
		if (null != aClass167_Sub1_9930.anIntArray8996) {
			if (null == class161)
				method2755(c, i, i_136_, i_137_, bool);
			else {
				i += anIntArray9932[c];
				i_136_ += anIntArray9931[c];
				int i_140_ = anIntArray9929[c];
				int i_141_ = anIntArray9927[c];
				int i_142_ = -570111553 * aClass167_Sub1_9930.anInt8997;
				int i_143_ = i + i_142_ * i_136_;
				int i_144_ = i_142_ - i_140_;
				int i_145_ = 0;
				int i_146_ = 0;
				if (i_136_ < -1593163361 * aClass167_Sub1_9930.anInt9021) {
					int i_147_ = aClass167_Sub1_9930.anInt9021 * -1593163361 - i_136_;
					i_141_ -= i_147_;
					i_136_ = -1593163361 * aClass167_Sub1_9930.anInt9021;
					i_146_ += i_140_ * i_147_;
					i_143_ += i_142_ * i_147_;
				}
				if (i_136_ + i_141_ > -148513205 * aClass167_Sub1_9930.anInt9003)
					i_141_ -= (i_136_ + i_141_ - -148513205 * aClass167_Sub1_9930.anInt9003);
				if (i < aClass167_Sub1_9930.anInt9000 * 1352816403) {
					int i_148_ = aClass167_Sub1_9930.anInt9000 * 1352816403 - i;
					i_140_ -= i_148_;
					i = aClass167_Sub1_9930.anInt9000 * 1352816403;
					i_146_ += i_148_;
					i_143_ += i_148_;
					i_145_ += i_148_;
					i_144_ += i_148_;
				}
				if (i_140_ + i > aClass167_Sub1_9930.anInt9001 * 2024498147) {
					int i_149_ = (i_140_ + i - 2024498147 * aClass167_Sub1_9930.anInt9001);
					i_140_ -= i_149_;
					i_145_ += i_149_;
					i_144_ += i_149_;
				}
				if (i_140_ > 0 && i_141_ > 0) {
					if ((i_137_ & ~0xffffff) == -16777216)
						method9078(aByteArrayArray9928[c], aClass167_Sub1_9930.anIntArray8996, i_137_, i_146_, i_143_, i_140_, i_141_, i_144_, i_145_, i, i_136_, anIntArray9929[c], class161, i_138_, i_139_);
					else
						method9079(aByteArrayArray9928[c], aClass167_Sub1_9930.anIntArray8996, i_137_, i_146_, i_143_, i_140_, i_141_, i_144_, i_145_, i, i_136_, anIntArray9929[c], class161, i_138_, i_139_);
				}
			}
		}
	}

	void method2757(char c, int i, int i_150_, int i_151_, boolean bool, Class161 class161, int i_152_, int i_153_) {
		if (null != aClass167_Sub1_9930.anIntArray8996) {
			if (null == class161)
				method2755(c, i, i_150_, i_151_, bool);
			else {
				i += anIntArray9932[c];
				i_150_ += anIntArray9931[c];
				int i_154_ = anIntArray9929[c];
				int i_155_ = anIntArray9927[c];
				int i_156_ = -570111553 * aClass167_Sub1_9930.anInt8997;
				int i_157_ = i + i_156_ * i_150_;
				int i_158_ = i_156_ - i_154_;
				int i_159_ = 0;
				int i_160_ = 0;
				if (i_150_ < -1593163361 * aClass167_Sub1_9930.anInt9021) {
					int i_161_ = aClass167_Sub1_9930.anInt9021 * -1593163361 - i_150_;
					i_155_ -= i_161_;
					i_150_ = -1593163361 * aClass167_Sub1_9930.anInt9021;
					i_160_ += i_154_ * i_161_;
					i_157_ += i_156_ * i_161_;
				}
				if (i_150_ + i_155_ > -148513205 * aClass167_Sub1_9930.anInt9003)
					i_155_ -= (i_150_ + i_155_ - -148513205 * aClass167_Sub1_9930.anInt9003);
				if (i < aClass167_Sub1_9930.anInt9000 * 1352816403) {
					int i_162_ = aClass167_Sub1_9930.anInt9000 * 1352816403 - i;
					i_154_ -= i_162_;
					i = aClass167_Sub1_9930.anInt9000 * 1352816403;
					i_160_ += i_162_;
					i_157_ += i_162_;
					i_159_ += i_162_;
					i_158_ += i_162_;
				}
				if (i_154_ + i > aClass167_Sub1_9930.anInt9001 * 2024498147) {
					int i_163_ = (i_154_ + i - 2024498147 * aClass167_Sub1_9930.anInt9001);
					i_154_ -= i_163_;
					i_159_ += i_163_;
					i_158_ += i_163_;
				}
				if (i_154_ > 0 && i_155_ > 0) {
					if ((i_151_ & ~0xffffff) == -16777216)
						method9078(aByteArrayArray9928[c], aClass167_Sub1_9930.anIntArray8996, i_151_, i_160_, i_157_, i_154_, i_155_, i_158_, i_159_, i, i_150_, anIntArray9929[c], class161, i_152_, i_153_);
					else
						method9079(aByteArrayArray9928[c], aClass167_Sub1_9930.anIntArray8996, i_151_, i_160_, i_157_, i_154_, i_155_, i_158_, i_159_, i, i_150_, anIntArray9929[c], class161, i_152_, i_153_);
				}
			}
		}
	}

	void method2756(char c, int i, int i_164_, int i_165_, boolean bool, Class161 class161, int i_166_, int i_167_) {
		if (null != aClass167_Sub1_9930.anIntArray8996) {
			if (null == class161)
				method2755(c, i, i_164_, i_165_, bool);
			else {
				i += anIntArray9932[c];
				i_164_ += anIntArray9931[c];
				int i_168_ = anIntArray9929[c];
				int i_169_ = anIntArray9927[c];
				int i_170_ = -570111553 * aClass167_Sub1_9930.anInt8997;
				int i_171_ = i + i_170_ * i_164_;
				int i_172_ = i_170_ - i_168_;
				int i_173_ = 0;
				int i_174_ = 0;
				if (i_164_ < -1593163361 * aClass167_Sub1_9930.anInt9021) {
					int i_175_ = aClass167_Sub1_9930.anInt9021 * -1593163361 - i_164_;
					i_169_ -= i_175_;
					i_164_ = -1593163361 * aClass167_Sub1_9930.anInt9021;
					i_174_ += i_168_ * i_175_;
					i_171_ += i_170_ * i_175_;
				}
				if (i_164_ + i_169_ > -148513205 * aClass167_Sub1_9930.anInt9003)
					i_169_ -= (i_164_ + i_169_ - -148513205 * aClass167_Sub1_9930.anInt9003);
				if (i < aClass167_Sub1_9930.anInt9000 * 1352816403) {
					int i_176_ = aClass167_Sub1_9930.anInt9000 * 1352816403 - i;
					i_168_ -= i_176_;
					i = aClass167_Sub1_9930.anInt9000 * 1352816403;
					i_174_ += i_176_;
					i_171_ += i_176_;
					i_173_ += i_176_;
					i_172_ += i_176_;
				}
				if (i_168_ + i > aClass167_Sub1_9930.anInt9001 * 2024498147) {
					int i_177_ = (i_168_ + i - 2024498147 * aClass167_Sub1_9930.anInt9001);
					i_168_ -= i_177_;
					i_173_ += i_177_;
					i_172_ += i_177_;
				}
				if (i_168_ > 0 && i_169_ > 0) {
					if ((i_165_ & ~0xffffff) == -16777216)
						method9078(aByteArrayArray9928[c], aClass167_Sub1_9930.anIntArray8996, i_165_, i_174_, i_171_, i_168_, i_169_, i_172_, i_173_, i, i_164_, anIntArray9929[c], class161, i_166_, i_167_);
					else
						method9079(aByteArrayArray9928[c], aClass167_Sub1_9930.anIntArray8996, i_165_, i_174_, i_171_, i_168_, i_169_, i_172_, i_173_, i, i_164_, anIntArray9929[c], class161, i_166_, i_167_);
				}
			}
		}
	}

	void method2762(char c, int i, int i_178_, int i_179_, boolean bool) {
		if (null != aClass167_Sub1_9930.anIntArray8996) {
			i += anIntArray9932[c];
			i_178_ += anIntArray9931[c];
			int i_180_ = anIntArray9929[c];
			int i_181_ = anIntArray9927[c];
			int i_182_ = aClass167_Sub1_9930.anInt8997 * -570111553;
			int i_183_ = i_178_ * i_182_ + i;
			int i_184_ = i_182_ - i_180_;
			int i_185_ = 0;
			int i_186_ = 0;
			if (i_178_ < aClass167_Sub1_9930.anInt9021 * -1593163361) {
				int i_187_ = aClass167_Sub1_9930.anInt9021 * -1593163361 - i_178_;
				i_181_ -= i_187_;
				i_178_ = -1593163361 * aClass167_Sub1_9930.anInt9021;
				i_186_ += i_187_ * i_180_;
				i_183_ += i_182_ * i_187_;
			}
			if (i_181_ + i_178_ > aClass167_Sub1_9930.anInt9003 * -148513205)
				i_181_ -= (i_181_ + i_178_ - -148513205 * aClass167_Sub1_9930.anInt9003);
			if (i < aClass167_Sub1_9930.anInt9000 * 1352816403) {
				int i_188_ = 1352816403 * aClass167_Sub1_9930.anInt9000 - i;
				i_180_ -= i_188_;
				i = 1352816403 * aClass167_Sub1_9930.anInt9000;
				i_186_ += i_188_;
				i_183_ += i_188_;
				i_185_ += i_188_;
				i_184_ += i_188_;
			}
			if (i_180_ + i > 2024498147 * aClass167_Sub1_9930.anInt9001) {
				int i_189_ = i + i_180_ - 2024498147 * aClass167_Sub1_9930.anInt9001;
				i_180_ -= i_189_;
				i_185_ += i_189_;
				i_184_ += i_189_;
			}
			if (i_180_ > 0 && i_181_ > 0) {
				if (-16777216 == (i_179_ & ~0xffffff))
					method9077(aByteArrayArray9928[c], aClass167_Sub1_9930.anIntArray8996, i_179_, i_186_, i_183_, i_180_, i_181_, i_184_, i_185_);
				else if (0 != (i_179_ & ~0xffffff))
					method9080(aByteArrayArray9928[c], aClass167_Sub1_9930.anIntArray8996, i_179_, i_186_, i_183_, i_180_, i_181_, i_184_, i_185_);
			}
		}
	}

	static final void method9081(Class668 class668, int i) throws Exception_Sub3 {
		Class683.aClass301_Sub1_8651.method4056(((float) (class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)]) / 1000.0F), -664213701);
	}

	static boolean method9082(Class248 class248, int i) {
		if (class248 == null)
			return false;
		if (class248.anIntArray2506 != null) {
			class248 = class248.method3435(Class542_Sub1.anInterface20_7169, Class542_Sub1.anInterface18_7163, -1467200991);
			if (class248 == null)
				return false;
		}
		if (!class248.aBool2492)
			return false;
		if (!class248.method3429(Class542_Sub1.anInterface20_7169, Class542_Sub1.anInterface18_7163, 1363299433))
			return false;
		if (Class542_Sub1.aClass4_10720.method556((long) (class248.anInt2480 * -1938063183)) != null)
			return false;
		if (Class542_Sub1.aClass4_10699.method556((long) (2086350461 * class248.anInt2508)) != null)
			return false;
		if (null != class248.aString2483) {
			if (0 == class248.anInt2486 * 1093270539 && Class542_Sub1.aBool10714)
				return false;
			if (class248.anInt2486 * 1093270539 == 1 && Class542_Sub1.aBool10722)
				return false;
			if (2 == 1093270539 * class248.anInt2486 && Class542_Sub1.aBool10724)
				return false;
		}
		return true;
	}

	static final void method9083(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.textureSetting.method9883(1527274134) ? 1 : 0;
	}

	public static Class709[] method9084(int i) {
		return (new Class709[] { Class709.aClass709_8829, Class709.aClass709_8827, Class709.aClass709_8835, Class709.aClass709_8834, Class709.aClass709_8832, Class709.aClass709_8833, Class709.aClass709_8836, Class709.aClass709_8831, Class709.aClass709_8828, Class709.aClass709_8830 });
	}
}
