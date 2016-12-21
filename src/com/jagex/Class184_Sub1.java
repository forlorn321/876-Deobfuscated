/* Class184_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class184_Sub1 extends Class184 {
	byte[][] aByteArrayArray9386;
	Class167_Sub1 aClass167_Sub1_9387;
	int[] anIntArray9388;
	int[] anIntArray9389;
	int[] anIntArray9390;
	int[] anIntArray9391;
	int[] anIntArray9392;

	void method8639(byte[] is, int[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
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

	void method2755(char c, int i, int i_11_, int i_12_, boolean bool) {
		if (null != aClass167_Sub1_9387.anIntArray8996) {
			i += anIntArray9392[c];
			i_11_ += anIntArray9391[c];
			int i_13_ = anIntArray9389[c];
			int i_14_ = anIntArray9390[c];
			int i_15_ = -570111553 * aClass167_Sub1_9387.anInt8997;
			int i_16_ = i_15_ * i_11_ + i;
			int i_17_ = i_15_ - i_13_;
			int i_18_ = 0;
			int i_19_ = 0;
			if (i_11_ < -1593163361 * aClass167_Sub1_9387.anInt9021) {
				int i_20_ = -1593163361 * aClass167_Sub1_9387.anInt9021 - i_11_;
				i_14_ -= i_20_;
				i_11_ = -1593163361 * aClass167_Sub1_9387.anInt9021;
				i_19_ += i_13_ * i_20_;
				i_16_ += i_15_ * i_20_;
			}
			if (i_11_ + i_14_ > -148513205 * aClass167_Sub1_9387.anInt9003)
				i_14_ -= (i_14_ + i_11_ - aClass167_Sub1_9387.anInt9003 * -148513205);
			if (i < 1352816403 * aClass167_Sub1_9387.anInt9000) {
				int i_21_ = 1352816403 * aClass167_Sub1_9387.anInt9000 - i;
				i_13_ -= i_21_;
				i = aClass167_Sub1_9387.anInt9000 * 1352816403;
				i_19_ += i_21_;
				i_16_ += i_21_;
				i_18_ += i_21_;
				i_17_ += i_21_;
			}
			if (i_13_ + i > aClass167_Sub1_9387.anInt9001 * 2024498147) {
				int i_22_ = i_13_ + i - 2024498147 * aClass167_Sub1_9387.anInt9001;
				i_13_ -= i_22_;
				i_18_ += i_22_;
				i_17_ += i_22_;
			}
			if (i_13_ > 0 && i_14_ > 0) {
				if (bool)
					method8639(aByteArrayArray9386[c], aClass167_Sub1_9387.anIntArray8996, i_12_, i_19_, i_16_, i_13_, i_14_, i_17_, i_18_);
				else
					method8640(aByteArrayArray9386[c], aClass167_Sub1_9387.anIntArray8996, anIntArray9388, i_19_, i_16_, i_13_, i_14_, i_17_, i_18_);
			}
		}
	}

	void method8640(byte[] is, int[] is_23_, int[] is_24_, int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_) {
		int i_30_ = -(i_26_ >> 2);
		i_26_ = -(i_26_ & 0x3);
		boolean bool = false;
		for (int i_31_ = -i_27_; i_31_ < 0; i_31_++) {
			for (int i_32_ = i_30_; i_32_ < 0; i_32_++) {
				int i_33_;
				if ((i_33_ = is[i++]) != 0)
					is_23_[i_25_++] = is_24_[i_33_ & 0xff];
				else
					i_25_++;
				if ((i_33_ = is[i++]) != 0)
					is_23_[i_25_++] = is_24_[i_33_ & 0xff];
				else
					i_25_++;
				if ((i_33_ = is[i++]) != 0)
					is_23_[i_25_++] = is_24_[i_33_ & 0xff];
				else
					i_25_++;
				if ((i_33_ = is[i++]) != 0)
					is_23_[i_25_++] = is_24_[i_33_ & 0xff];
				else
					i_25_++;
			}
			for (int i_34_ = i_26_; i_34_ < 0; i_34_++) {
				int i_35_;
				if ((i_35_ = is[i++]) != 0)
					is_23_[i_25_++] = is_24_[i_35_ & 0xff];
				else
					i_25_++;
			}
			i_25_ += i_28_;
			i += i_29_;
		}
	}

	void method2751(char c, int i, int i_36_, int i_37_, boolean bool, Class161 class161, int i_38_, int i_39_) {
		if (null != aClass167_Sub1_9387.anIntArray8996) {
			if (null == class161)
				method2755(c, i, i_36_, i_37_, bool);
			else {
				i += anIntArray9392[c];
				i_36_ += anIntArray9391[c];
				int i_40_ = anIntArray9389[c];
				int i_41_ = anIntArray9390[c];
				int i_42_ = -570111553 * aClass167_Sub1_9387.anInt8997;
				int i_43_ = i_42_ * i_36_ + i;
				int i_44_ = i_42_ - i_40_;
				int i_45_ = 0;
				int i_46_ = 0;
				if (i_36_ < -1593163361 * aClass167_Sub1_9387.anInt9021) {
					int i_47_ = aClass167_Sub1_9387.anInt9021 * -1593163361 - i_36_;
					i_41_ -= i_47_;
					i_36_ = -1593163361 * aClass167_Sub1_9387.anInt9021;
					i_46_ += i_40_ * i_47_;
					i_43_ += i_42_ * i_47_;
				}
				if (i_36_ + i_41_ > aClass167_Sub1_9387.anInt9003 * -148513205)
					i_41_ -= (i_41_ + i_36_ - aClass167_Sub1_9387.anInt9003 * -148513205);
				if (i < 1352816403 * aClass167_Sub1_9387.anInt9000) {
					int i_48_ = aClass167_Sub1_9387.anInt9000 * 1352816403 - i;
					i_40_ -= i_48_;
					i = 1352816403 * aClass167_Sub1_9387.anInt9000;
					i_46_ += i_48_;
					i_43_ += i_48_;
					i_45_ += i_48_;
					i_44_ += i_48_;
				}
				if (i + i_40_ > aClass167_Sub1_9387.anInt9001 * 2024498147) {
					int i_49_ = (i + i_40_ - aClass167_Sub1_9387.anInt9001 * 2024498147);
					i_40_ -= i_49_;
					i_45_ += i_49_;
					i_44_ += i_49_;
				}
				if (i_40_ > 0 && i_41_ > 0) {
					if (bool)
						method8642(aByteArrayArray9386[c], aClass167_Sub1_9387.anIntArray8996, i_37_, i_46_, i_43_, i_40_, i_41_, i_44_, i_45_, i, i_36_, anIntArray9389[c], class161, i_38_, i_39_);
					else
						method8641(aByteArrayArray9386[c], aClass167_Sub1_9387.anIntArray8996, anIntArray9388, i_37_, i_46_, i_43_, i_40_, i_41_, i_44_, i_45_, i, i_36_, anIntArray9389[c], class161, i_38_, i_39_);
				}
			}
		}
	}

	void method8641(byte[] is, int[] is_50_, int[] is_51_, int i, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, Class161 class161, int i_61_, int i_62_) {
		Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
		int[] is_63_ = class161_sub2.anIntArray9444;
		int[] is_64_ = class161_sub2.anIntArray9445;
		int i_65_ = i_58_ - aClass167_Sub1_9387.anInt9000 * 1352816403;
		int i_66_ = i_59_;
		if (i_62_ > i_66_) {
			i_66_ = i_62_;
			i_53_ += (i_62_ - i_59_) * (-570111553 * aClass167_Sub1_9387.anInt8997);
			i_52_ += (i_62_ - i_59_) * i_60_;
		}
		int i_67_ = (i_62_ + is_63_.length < i_59_ + i_55_ ? i_62_ + is_63_.length : i_59_ + i_55_);
		boolean bool = false;
		for (int i_68_ = i_66_; i_68_ < i_67_; i_68_++) {
			int i_69_ = is_63_[i_68_ - i_62_] + i_61_;
			int i_70_ = is_64_[i_68_ - i_62_];
			int i_71_ = i_54_;
			if (i_65_ > i_69_) {
				int i_72_ = i_65_ - i_69_;
				if (i_72_ >= i_70_) {
					i_52_ += i_54_ + i_57_;
					i_53_ += i_54_ + i_56_;
					continue;
				}
				i_70_ -= i_72_;
			} else {
				int i_73_ = i_69_ - i_65_;
				if (i_73_ >= i_54_) {
					i_52_ += i_54_ + i_57_;
					i_53_ += i_56_ + i_54_;
					continue;
				}
				i_52_ += i_73_;
				i_71_ -= i_73_;
				i_53_ += i_73_;
			}
			int i_74_ = 0;
			if (i_71_ < i_70_)
				i_70_ = i_71_;
			else
				i_74_ = i_71_ - i_70_;
			for (int i_75_ = -i_70_; i_75_ < 0; i_75_++) {
				int i_76_;
				if ((i_76_ = is[i_52_++]) != 0)
					is_50_[i_53_++] = is_51_[i_76_ & 0xff];
				else
					i_53_++;
			}
			i_52_ += i_74_ + i_57_;
			i_53_ += i_74_ + i_56_;
		}
	}

	void method2753(char c, int i, int i_77_, int i_78_, boolean bool) {
		if (null != aClass167_Sub1_9387.anIntArray8996) {
			i += anIntArray9392[c];
			i_77_ += anIntArray9391[c];
			int i_79_ = anIntArray9389[c];
			int i_80_ = anIntArray9390[c];
			int i_81_ = -570111553 * aClass167_Sub1_9387.anInt8997;
			int i_82_ = i_81_ * i_77_ + i;
			int i_83_ = i_81_ - i_79_;
			int i_84_ = 0;
			int i_85_ = 0;
			if (i_77_ < -1593163361 * aClass167_Sub1_9387.anInt9021) {
				int i_86_ = -1593163361 * aClass167_Sub1_9387.anInt9021 - i_77_;
				i_80_ -= i_86_;
				i_77_ = -1593163361 * aClass167_Sub1_9387.anInt9021;
				i_85_ += i_79_ * i_86_;
				i_82_ += i_81_ * i_86_;
			}
			if (i_77_ + i_80_ > -148513205 * aClass167_Sub1_9387.anInt9003)
				i_80_ -= (i_80_ + i_77_ - aClass167_Sub1_9387.anInt9003 * -148513205);
			if (i < 1352816403 * aClass167_Sub1_9387.anInt9000) {
				int i_87_ = 1352816403 * aClass167_Sub1_9387.anInt9000 - i;
				i_79_ -= i_87_;
				i = aClass167_Sub1_9387.anInt9000 * 1352816403;
				i_85_ += i_87_;
				i_82_ += i_87_;
				i_84_ += i_87_;
				i_83_ += i_87_;
			}
			if (i_79_ + i > aClass167_Sub1_9387.anInt9001 * 2024498147) {
				int i_88_ = i_79_ + i - 2024498147 * aClass167_Sub1_9387.anInt9001;
				i_79_ -= i_88_;
				i_84_ += i_88_;
				i_83_ += i_88_;
			}
			if (i_79_ > 0 && i_80_ > 0) {
				if (bool)
					method8639(aByteArrayArray9386[c], aClass167_Sub1_9387.anIntArray8996, i_78_, i_85_, i_82_, i_79_, i_80_, i_83_, i_84_);
				else
					method8640(aByteArrayArray9386[c], aClass167_Sub1_9387.anIntArray8996, anIntArray9388, i_85_, i_82_, i_79_, i_80_, i_83_, i_84_);
			}
		}
	}

	void method2762(char c, int i, int i_89_, int i_90_, boolean bool) {
		if (null != aClass167_Sub1_9387.anIntArray8996) {
			i += anIntArray9392[c];
			i_89_ += anIntArray9391[c];
			int i_91_ = anIntArray9389[c];
			int i_92_ = anIntArray9390[c];
			int i_93_ = -570111553 * aClass167_Sub1_9387.anInt8997;
			int i_94_ = i_93_ * i_89_ + i;
			int i_95_ = i_93_ - i_91_;
			int i_96_ = 0;
			int i_97_ = 0;
			if (i_89_ < -1593163361 * aClass167_Sub1_9387.anInt9021) {
				int i_98_ = -1593163361 * aClass167_Sub1_9387.anInt9021 - i_89_;
				i_92_ -= i_98_;
				i_89_ = -1593163361 * aClass167_Sub1_9387.anInt9021;
				i_97_ += i_91_ * i_98_;
				i_94_ += i_93_ * i_98_;
			}
			if (i_89_ + i_92_ > -148513205 * aClass167_Sub1_9387.anInt9003)
				i_92_ -= (i_92_ + i_89_ - aClass167_Sub1_9387.anInt9003 * -148513205);
			if (i < 1352816403 * aClass167_Sub1_9387.anInt9000) {
				int i_99_ = 1352816403 * aClass167_Sub1_9387.anInt9000 - i;
				i_91_ -= i_99_;
				i = aClass167_Sub1_9387.anInt9000 * 1352816403;
				i_97_ += i_99_;
				i_94_ += i_99_;
				i_96_ += i_99_;
				i_95_ += i_99_;
			}
			if (i_91_ + i > aClass167_Sub1_9387.anInt9001 * 2024498147) {
				int i_100_ = i_91_ + i - 2024498147 * aClass167_Sub1_9387.anInt9001;
				i_91_ -= i_100_;
				i_96_ += i_100_;
				i_95_ += i_100_;
			}
			if (i_91_ > 0 && i_92_ > 0) {
				if (bool)
					method8639(aByteArrayArray9386[c], aClass167_Sub1_9387.anIntArray8996, i_90_, i_97_, i_94_, i_91_, i_92_, i_95_, i_96_);
				else
					method8640(aByteArrayArray9386[c], aClass167_Sub1_9387.anIntArray8996, anIntArray9388, i_97_, i_94_, i_91_, i_92_, i_95_, i_96_);
			}
		}
	}

	void method2749(char c, int i, int i_101_, int i_102_, boolean bool, Class161 class161, int i_103_, int i_104_) {
		if (null != aClass167_Sub1_9387.anIntArray8996) {
			if (null == class161)
				method2755(c, i, i_101_, i_102_, bool);
			else {
				i += anIntArray9392[c];
				i_101_ += anIntArray9391[c];
				int i_105_ = anIntArray9389[c];
				int i_106_ = anIntArray9390[c];
				int i_107_ = -570111553 * aClass167_Sub1_9387.anInt8997;
				int i_108_ = i_107_ * i_101_ + i;
				int i_109_ = i_107_ - i_105_;
				int i_110_ = 0;
				int i_111_ = 0;
				if (i_101_ < -1593163361 * aClass167_Sub1_9387.anInt9021) {
					int i_112_ = aClass167_Sub1_9387.anInt9021 * -1593163361 - i_101_;
					i_106_ -= i_112_;
					i_101_ = -1593163361 * aClass167_Sub1_9387.anInt9021;
					i_111_ += i_105_ * i_112_;
					i_108_ += i_107_ * i_112_;
				}
				if (i_101_ + i_106_ > aClass167_Sub1_9387.anInt9003 * -148513205)
					i_106_ -= (i_106_ + i_101_ - aClass167_Sub1_9387.anInt9003 * -148513205);
				if (i < 1352816403 * aClass167_Sub1_9387.anInt9000) {
					int i_113_ = aClass167_Sub1_9387.anInt9000 * 1352816403 - i;
					i_105_ -= i_113_;
					i = 1352816403 * aClass167_Sub1_9387.anInt9000;
					i_111_ += i_113_;
					i_108_ += i_113_;
					i_110_ += i_113_;
					i_109_ += i_113_;
				}
				if (i + i_105_ > aClass167_Sub1_9387.anInt9001 * 2024498147) {
					int i_114_ = (i + i_105_ - aClass167_Sub1_9387.anInt9001 * 2024498147);
					i_105_ -= i_114_;
					i_110_ += i_114_;
					i_109_ += i_114_;
				}
				if (i_105_ > 0 && i_106_ > 0) {
					if (bool)
						method8642(aByteArrayArray9386[c], aClass167_Sub1_9387.anIntArray8996, i_102_, i_111_, i_108_, i_105_, i_106_, i_109_, i_110_, i, i_101_, anIntArray9389[c], class161, i_103_, i_104_);
					else
						method8641(aByteArrayArray9386[c], aClass167_Sub1_9387.anIntArray8996, anIntArray9388, i_102_, i_111_, i_108_, i_105_, i_106_, i_109_, i_110_, i, i_101_, anIntArray9389[c], class161, i_103_, i_104_);
				}
			}
		}
	}

	void method2756(char c, int i, int i_115_, int i_116_, boolean bool, Class161 class161, int i_117_, int i_118_) {
		if (null != aClass167_Sub1_9387.anIntArray8996) {
			if (null == class161)
				method2755(c, i, i_115_, i_116_, bool);
			else {
				i += anIntArray9392[c];
				i_115_ += anIntArray9391[c];
				int i_119_ = anIntArray9389[c];
				int i_120_ = anIntArray9390[c];
				int i_121_ = -570111553 * aClass167_Sub1_9387.anInt8997;
				int i_122_ = i_121_ * i_115_ + i;
				int i_123_ = i_121_ - i_119_;
				int i_124_ = 0;
				int i_125_ = 0;
				if (i_115_ < -1593163361 * aClass167_Sub1_9387.anInt9021) {
					int i_126_ = aClass167_Sub1_9387.anInt9021 * -1593163361 - i_115_;
					i_120_ -= i_126_;
					i_115_ = -1593163361 * aClass167_Sub1_9387.anInt9021;
					i_125_ += i_119_ * i_126_;
					i_122_ += i_121_ * i_126_;
				}
				if (i_115_ + i_120_ > aClass167_Sub1_9387.anInt9003 * -148513205)
					i_120_ -= (i_120_ + i_115_ - aClass167_Sub1_9387.anInt9003 * -148513205);
				if (i < 1352816403 * aClass167_Sub1_9387.anInt9000) {
					int i_127_ = aClass167_Sub1_9387.anInt9000 * 1352816403 - i;
					i_119_ -= i_127_;
					i = 1352816403 * aClass167_Sub1_9387.anInt9000;
					i_125_ += i_127_;
					i_122_ += i_127_;
					i_124_ += i_127_;
					i_123_ += i_127_;
				}
				if (i + i_119_ > aClass167_Sub1_9387.anInt9001 * 2024498147) {
					int i_128_ = (i + i_119_ - aClass167_Sub1_9387.anInt9001 * 2024498147);
					i_119_ -= i_128_;
					i_124_ += i_128_;
					i_123_ += i_128_;
				}
				if (i_119_ > 0 && i_120_ > 0) {
					if (bool)
						method8642(aByteArrayArray9386[c], aClass167_Sub1_9387.anIntArray8996, i_116_, i_125_, i_122_, i_119_, i_120_, i_123_, i_124_, i, i_115_, anIntArray9389[c], class161, i_117_, i_118_);
					else
						method8641(aByteArrayArray9386[c], aClass167_Sub1_9387.anIntArray8996, anIntArray9388, i_116_, i_125_, i_122_, i_119_, i_120_, i_123_, i_124_, i, i_115_, anIntArray9389[c], class161, i_117_, i_118_);
				}
			}
		}
	}

	void method2757(char c, int i, int i_129_, int i_130_, boolean bool, Class161 class161, int i_131_, int i_132_) {
		if (null != aClass167_Sub1_9387.anIntArray8996) {
			if (null == class161)
				method2755(c, i, i_129_, i_130_, bool);
			else {
				i += anIntArray9392[c];
				i_129_ += anIntArray9391[c];
				int i_133_ = anIntArray9389[c];
				int i_134_ = anIntArray9390[c];
				int i_135_ = -570111553 * aClass167_Sub1_9387.anInt8997;
				int i_136_ = i_135_ * i_129_ + i;
				int i_137_ = i_135_ - i_133_;
				int i_138_ = 0;
				int i_139_ = 0;
				if (i_129_ < -1593163361 * aClass167_Sub1_9387.anInt9021) {
					int i_140_ = aClass167_Sub1_9387.anInt9021 * -1593163361 - i_129_;
					i_134_ -= i_140_;
					i_129_ = -1593163361 * aClass167_Sub1_9387.anInt9021;
					i_139_ += i_133_ * i_140_;
					i_136_ += i_135_ * i_140_;
				}
				if (i_129_ + i_134_ > aClass167_Sub1_9387.anInt9003 * -148513205)
					i_134_ -= (i_134_ + i_129_ - aClass167_Sub1_9387.anInt9003 * -148513205);
				if (i < 1352816403 * aClass167_Sub1_9387.anInt9000) {
					int i_141_ = aClass167_Sub1_9387.anInt9000 * 1352816403 - i;
					i_133_ -= i_141_;
					i = 1352816403 * aClass167_Sub1_9387.anInt9000;
					i_139_ += i_141_;
					i_136_ += i_141_;
					i_138_ += i_141_;
					i_137_ += i_141_;
				}
				if (i + i_133_ > aClass167_Sub1_9387.anInt9001 * 2024498147) {
					int i_142_ = (i + i_133_ - aClass167_Sub1_9387.anInt9001 * 2024498147);
					i_133_ -= i_142_;
					i_138_ += i_142_;
					i_137_ += i_142_;
				}
				if (i_133_ > 0 && i_134_ > 0) {
					if (bool)
						method8642(aByteArrayArray9386[c], aClass167_Sub1_9387.anIntArray8996, i_130_, i_139_, i_136_, i_133_, i_134_, i_137_, i_138_, i, i_129_, anIntArray9389[c], class161, i_131_, i_132_);
					else
						method8641(aByteArrayArray9386[c], aClass167_Sub1_9387.anIntArray8996, anIntArray9388, i_130_, i_139_, i_136_, i_133_, i_134_, i_137_, i_138_, i, i_129_, anIntArray9389[c], class161, i_131_, i_132_);
				}
			}
		}
	}

	void method8642(byte[] is, int[] is_143_, int i, int i_144_, int i_145_, int i_146_, int i_147_, int i_148_, int i_149_, int i_150_, int i_151_, int i_152_, Class161 class161, int i_153_, int i_154_) {
		Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
		int[] is_155_ = class161_sub2.anIntArray9444;
		int[] is_156_ = class161_sub2.anIntArray9445;
		int i_157_ = i_150_ - 1352816403 * aClass167_Sub1_9387.anInt9000;
		int i_158_ = i_151_;
		if (i_154_ > i_158_) {
			i_158_ = i_154_;
			i_145_ += (i_154_ - i_151_) * (aClass167_Sub1_9387.anInt8997 * -570111553);
			i_144_ += (i_154_ - i_151_) * i_152_;
		}
		int i_159_ = (is_155_.length + i_154_ < i_147_ + i_151_ ? i_154_ + is_155_.length : i_147_ + i_151_);
		for (int i_160_ = i_158_; i_160_ < i_159_; i_160_++) {
			int i_161_ = is_155_[i_160_ - i_154_] + i_153_;
			int i_162_ = is_156_[i_160_ - i_154_];
			int i_163_ = i_146_;
			if (i_157_ > i_161_) {
				int i_164_ = i_157_ - i_161_;
				if (i_164_ >= i_162_) {
					i_144_ += i_146_ + i_149_;
					i_145_ += i_148_ + i_146_;
					continue;
				}
				i_162_ -= i_164_;
			} else {
				int i_165_ = i_161_ - i_157_;
				if (i_165_ >= i_146_) {
					i_144_ += i_146_ + i_149_;
					i_145_ += i_146_ + i_148_;
					continue;
				}
				i_144_ += i_165_;
				i_163_ -= i_165_;
				i_145_ += i_165_;
			}
			int i_166_ = 0;
			if (i_163_ < i_162_)
				i_162_ = i_163_;
			else
				i_166_ = i_163_ - i_162_;
			for (int i_167_ = -i_162_; i_167_ < 0; i_167_++) {
				if (is[i_144_++] != 0)
					is_143_[i_145_++] = i;
				else
					i_145_++;
			}
			i_144_ += i_166_ + i_144_;
			i_145_ += i_148_ + i_166_;
		}
	}

	Class184_Sub1(Class167_Sub1 class167_sub1, Class2 class2, Class179_Sub2[] class179_sub2s, int[] is, int[] is_168_) {
		super(class167_sub1, class2);
		aClass167_Sub1_9387 = class167_sub1;
		aClass167_Sub1_9387 = class167_sub1;
		anIntArray9389 = is;
		anIntArray9390 = is_168_;
		aByteArrayArray9386 = new byte[class179_sub2s.length][];
		anIntArray9391 = new int[class179_sub2s.length];
		anIntArray9392 = new int[class179_sub2s.length];
		for (int i = 0; i < class179_sub2s.length; i++) {
			aByteArrayArray9386[i] = class179_sub2s[i].aByteArray9820;
			anIntArray9391[i] = class179_sub2s[i].anInt9819;
			anIntArray9392[i] = class179_sub2s[i].anInt9815;
		}
		anIntArray9388 = class179_sub2s[0].anIntArray9813;
	}

	void method2752(char c, int i, int i_169_, int i_170_, boolean bool, Class161 class161, int i_171_, int i_172_) {
		if (null != aClass167_Sub1_9387.anIntArray8996) {
			if (null == class161)
				method2755(c, i, i_169_, i_170_, bool);
			else {
				i += anIntArray9392[c];
				i_169_ += anIntArray9391[c];
				int i_173_ = anIntArray9389[c];
				int i_174_ = anIntArray9390[c];
				int i_175_ = -570111553 * aClass167_Sub1_9387.anInt8997;
				int i_176_ = i_175_ * i_169_ + i;
				int i_177_ = i_175_ - i_173_;
				int i_178_ = 0;
				int i_179_ = 0;
				if (i_169_ < -1593163361 * aClass167_Sub1_9387.anInt9021) {
					int i_180_ = aClass167_Sub1_9387.anInt9021 * -1593163361 - i_169_;
					i_174_ -= i_180_;
					i_169_ = -1593163361 * aClass167_Sub1_9387.anInt9021;
					i_179_ += i_173_ * i_180_;
					i_176_ += i_175_ * i_180_;
				}
				if (i_169_ + i_174_ > aClass167_Sub1_9387.anInt9003 * -148513205)
					i_174_ -= (i_174_ + i_169_ - aClass167_Sub1_9387.anInt9003 * -148513205);
				if (i < 1352816403 * aClass167_Sub1_9387.anInt9000) {
					int i_181_ = aClass167_Sub1_9387.anInt9000 * 1352816403 - i;
					i_173_ -= i_181_;
					i = 1352816403 * aClass167_Sub1_9387.anInt9000;
					i_179_ += i_181_;
					i_176_ += i_181_;
					i_178_ += i_181_;
					i_177_ += i_181_;
				}
				if (i + i_173_ > aClass167_Sub1_9387.anInt9001 * 2024498147) {
					int i_182_ = (i + i_173_ - aClass167_Sub1_9387.anInt9001 * 2024498147);
					i_173_ -= i_182_;
					i_178_ += i_182_;
					i_177_ += i_182_;
				}
				if (i_173_ > 0 && i_174_ > 0) {
					if (bool)
						method8642(aByteArrayArray9386[c], aClass167_Sub1_9387.anIntArray8996, i_170_, i_179_, i_176_, i_173_, i_174_, i_177_, i_178_, i, i_169_, anIntArray9389[c], class161, i_171_, i_172_);
					else
						method8641(aByteArrayArray9386[c], aClass167_Sub1_9387.anIntArray8996, anIntArray9388, i_170_, i_179_, i_176_, i_173_, i_174_, i_177_, i_178_, i, i_169_, anIntArray9389[c], class161, i_171_, i_172_);
				}
			}
		}
	}

	public static int method8643(int i, int i_183_, boolean bool, boolean bool_184_, byte i_185_) {
		Class536_Sub1 class536_sub1 = Class659.method7970(i, bool_184_, -1978374848);
		if (class536_sub1 == null)
			return 0;
		int i_186_ = 0;
		for (int i_187_ = 0; i_187_ < class536_sub1.anIntArray10304.length; i_187_++) {
			if (class536_sub1.anIntArray10304[i_187_] >= 0 && (class536_sub1.anIntArray10304[i_187_] < Class111.aClass34_Sub13_1391.anInt290 * 2103424577)) {
				Class1 class1 = ((Class1) Class111.aClass34_Sub13_1391.method70((class536_sub1.anIntArray10304[i_187_]), (byte) 15));
				int i_188_ = class1.method510(i_183_, (((Class73) Class207.aClass34_Sub22_2244.method70(i_183_, (byte) 64)).anInt803) * 1566477951, (byte) 115);
				if (bool)
					i_186_ += class536_sub1.anIntArray10300[i_187_] * i_188_;
				else
					i_186_ += i_188_;
			}
		}
		return i_186_;
	}

	static final void method8644(Class649_Sub1 class649_sub1, Class668 class668, int i) {
		boolean bool = false;
		int i_189_ = 0;
		int i_190_ = 0;
		int i_191_ = 0;
		int i_192_ = 0;
		if (class649_sub1.aClass178Array10842 != null) {
			for (int i_193_ = 0; i_193_ < class649_sub1.aClass178Array10842.length; i_193_++) {
				Class178 class178 = class649_sub1.aClass178Array10842[i_193_];
				if (class178.aBool1945) {
					int i_194_;
					int i_195_;
					if (class178.anInt1943 < class178.anInt1941) {
						i_194_ = class178.anInt1943 - class178.anInt1940;
						i_195_ = class178.anInt1941 + class178.anInt1940;
					} else {
						i_194_ = class178.anInt1941 - class178.anInt1940;
						i_195_ = class178.anInt1943 + class178.anInt1940;
					}
					int i_196_;
					int i_197_;
					if (class178.anInt1944 < class178.anInt1942) {
						i_196_ = class178.anInt1944 - class178.anInt1940;
						i_197_ = class178.anInt1942 + class178.anInt1940;
					} else {
						i_196_ = class178.anInt1942 - class178.anInt1940;
						i_197_ = class178.anInt1940 + class178.anInt1944;
					}
					if (!bool || i_194_ < i_189_)
						i_189_ = i_194_;
					if (!bool || i_196_ < i_190_)
						i_190_ = i_196_;
					if (!bool || i_195_ > i_191_)
						i_191_ = i_195_;
					if (!bool || i_197_ > i_192_)
						i_192_ = i_197_;
					bool = true;
				}
			}
		}
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = bool ? 1 : 0;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_189_;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_190_;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_191_;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_192_;
	}

	static final void method8645(Class668 class668, int i) {
		class668.anInt8542 -= 61855783;
		int i_198_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_199_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		int i_200_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 2];
		Class264.method3678(i_198_, -689214737);
		SubIncomingPacket.method4967(Class463.aClass234Array5227[i_198_ >>> 16], i_198_ & 0xffff, i_199_, i_200_, class668.aBool8548, class668, (byte) 1);
	}
}
