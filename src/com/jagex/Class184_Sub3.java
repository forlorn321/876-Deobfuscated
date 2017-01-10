/* Class184_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class184_Sub3 extends FontRenderer {
	int[] anIntArray9718;
	byte[][] aByteArrayArray9719;
	Class167_Sub1 aClass167_Sub1_9720;
	int[] anIntArray9721;
	int[] anIntArray9722;
	int[] anIntArray9723;

	void method8987(byte[] is, int[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		for (int i_7_ = -i_4_; i_7_ < 0; i_7_++) {
			for (int i_8_ = -i_3_; i_8_ < 0; i_8_++) {
				int i_9_ = is[i_1_++] & 0xff;
				if (0 != i_9_) {
					int i_10_ = ((((i & 0xff00ff) * i_9_ & ~0xff00ff) + ((i & 0xff00) * i_9_ & 0xff0000)) >> 8);
					i_9_ = 256 - i_9_;
					int i_11_ = is_0_[i_2_];
					is_0_[i_2_++] = i_10_ + ((((i_11_ & 0xff00ff) * i_9_ & ~0xff00ff) + (i_9_ * (i_11_ & 0xff00) & 0xff0000)) >> 8);
				} else
					i_2_++;
			}
			i_2_ += i_5_;
			i_1_ += i_6_;
		}
	}

	void method2753(char c, int i, int i_12_, int i_13_, boolean bool) {
		if (null != aClass167_Sub1_9720.anIntArray8996) {
			i += anIntArray9723[c];
			i_12_ += anIntArray9718[c];
			int i_14_ = anIntArray9722[c];
			int i_15_ = anIntArray9721[c];
			int i_16_ = -570111553 * aClass167_Sub1_9720.anInt8997;
			int i_17_ = i + i_16_ * i_12_;
			int i_18_ = i_16_ - i_14_;
			int i_19_ = 0;
			int i_20_ = 0;
			if (i_12_ < -1593163361 * aClass167_Sub1_9720.anInt9021) {
				int i_21_ = aClass167_Sub1_9720.anInt9021 * -1593163361 - i_12_;
				i_15_ -= i_21_;
				i_12_ = aClass167_Sub1_9720.anInt9021 * -1593163361;
				i_20_ += i_21_ * i_14_;
				i_17_ += i_16_ * i_21_;
			}
			if (i_12_ + i_15_ > aClass167_Sub1_9720.anInt9003 * -148513205)
				i_15_ -= (i_15_ + i_12_ - -148513205 * aClass167_Sub1_9720.anInt9003);
			if (i < 1352816403 * aClass167_Sub1_9720.anInt9000) {
				int i_22_ = aClass167_Sub1_9720.anInt9000 * 1352816403 - i;
				i_14_ -= i_22_;
				i = aClass167_Sub1_9720.anInt9000 * 1352816403;
				i_20_ += i_22_;
				i_17_ += i_22_;
				i_19_ += i_22_;
				i_18_ += i_22_;
			}
			if (i_14_ + i > 2024498147 * aClass167_Sub1_9720.anInt9001) {
				int i_23_ = i_14_ + i - 2024498147 * aClass167_Sub1_9720.anInt9001;
				i_14_ -= i_23_;
				i_19_ += i_23_;
				i_18_ += i_23_;
			}
			if (i_14_ > 0 && i_15_ > 0)
				method8987(aByteArrayArray9719[c], aClass167_Sub1_9720.anIntArray8996, i_13_, i_20_, i_17_, i_14_, i_15_, i_18_, i_19_);
		}
	}

	void method2755(char c, int i, int i_24_, int i_25_, boolean bool) {
		if (null != aClass167_Sub1_9720.anIntArray8996) {
			i += anIntArray9723[c];
			i_24_ += anIntArray9718[c];
			int i_26_ = anIntArray9722[c];
			int i_27_ = anIntArray9721[c];
			int i_28_ = -570111553 * aClass167_Sub1_9720.anInt8997;
			int i_29_ = i + i_28_ * i_24_;
			int i_30_ = i_28_ - i_26_;
			int i_31_ = 0;
			int i_32_ = 0;
			if (i_24_ < -1593163361 * aClass167_Sub1_9720.anInt9021) {
				int i_33_ = aClass167_Sub1_9720.anInt9021 * -1593163361 - i_24_;
				i_27_ -= i_33_;
				i_24_ = aClass167_Sub1_9720.anInt9021 * -1593163361;
				i_32_ += i_33_ * i_26_;
				i_29_ += i_28_ * i_33_;
			}
			if (i_24_ + i_27_ > aClass167_Sub1_9720.anInt9003 * -148513205)
				i_27_ -= (i_27_ + i_24_ - -148513205 * aClass167_Sub1_9720.anInt9003);
			if (i < 1352816403 * aClass167_Sub1_9720.anInt9000) {
				int i_34_ = aClass167_Sub1_9720.anInt9000 * 1352816403 - i;
				i_26_ -= i_34_;
				i = aClass167_Sub1_9720.anInt9000 * 1352816403;
				i_32_ += i_34_;
				i_29_ += i_34_;
				i_31_ += i_34_;
				i_30_ += i_34_;
			}
			if (i_26_ + i > 2024498147 * aClass167_Sub1_9720.anInt9001) {
				int i_35_ = i_26_ + i - 2024498147 * aClass167_Sub1_9720.anInt9001;
				i_26_ -= i_35_;
				i_31_ += i_35_;
				i_30_ += i_35_;
			}
			if (i_26_ > 0 && i_27_ > 0)
				method8987(aByteArrayArray9719[c], aClass167_Sub1_9720.anIntArray8996, i_25_, i_32_, i_29_, i_26_, i_27_, i_30_, i_31_);
		}
	}

	Class184_Sub3(Class167_Sub1 class167_sub1, Class2 class2, Class179_Sub2[] class179_sub2s, int[] is, int[] is_36_) {
		super(class167_sub1, class2);
		aClass167_Sub1_9720 = class167_sub1;
		aClass167_Sub1_9720 = class167_sub1;
		anIntArray9722 = is;
		anIntArray9721 = is_36_;
		aByteArrayArray9719 = new byte[class179_sub2s.length][];
		anIntArray9718 = new int[class179_sub2s.length];
		anIntArray9723 = new int[class179_sub2s.length];
		for (int i = 0; i < class179_sub2s.length; i++) {
			Class179_Sub2 class179_sub2 = class179_sub2s[i];
			if (null != class179_sub2.aByteArray9821)
				aByteArrayArray9719[i] = class179_sub2.aByteArray9821;
			else {
				byte[] is_37_ = class179_sub2.aByteArray9820;
				byte[] is_38_ = aByteArrayArray9719[i] = new byte[is_37_.length];
				for (int i_39_ = 0; i_39_ < is_37_.length; i_39_++)
					is_38_[i_39_] = (byte) (is_37_[i_39_] == 0 ? 0 : -1);
			}
			anIntArray9718[i] = class179_sub2.anInt9819;
			anIntArray9723[i] = class179_sub2.anInt9815;
		}
	}

	void method2751(char c, int i, int i_40_, int i_41_, boolean bool, Class161 class161, int i_42_, int i_43_) {
		if (null != aClass167_Sub1_9720.anIntArray8996) {
			if (null == class161)
				method2755(c, i, i_40_, i_41_, bool);
			else {
				i += anIntArray9723[c];
				i_40_ += anIntArray9718[c];
				int i_44_ = anIntArray9722[c];
				int i_45_ = anIntArray9721[c];
				int i_46_ = -570111553 * aClass167_Sub1_9720.anInt8997;
				int i_47_ = i_40_ * i_46_ + i;
				int i_48_ = i_46_ - i_44_;
				int i_49_ = 0;
				int i_50_ = 0;
				if (i_40_ < -1593163361 * aClass167_Sub1_9720.anInt9021) {
					int i_51_ = -1593163361 * aClass167_Sub1_9720.anInt9021 - i_40_;
					i_45_ -= i_51_;
					i_40_ = -1593163361 * aClass167_Sub1_9720.anInt9021;
					i_50_ += i_44_ * i_51_;
					i_47_ += i_51_ * i_46_;
				}
				if (i_45_ + i_40_ > -148513205 * aClass167_Sub1_9720.anInt9003)
					i_45_ -= (i_40_ + i_45_ - -148513205 * aClass167_Sub1_9720.anInt9003);
				if (i < 1352816403 * aClass167_Sub1_9720.anInt9000) {
					int i_52_ = aClass167_Sub1_9720.anInt9000 * 1352816403 - i;
					i_44_ -= i_52_;
					i = 1352816403 * aClass167_Sub1_9720.anInt9000;
					i_50_ += i_52_;
					i_47_ += i_52_;
					i_49_ += i_52_;
					i_48_ += i_52_;
				}
				if (i_44_ + i > 2024498147 * aClass167_Sub1_9720.anInt9001) {
					int i_53_ = (i_44_ + i - aClass167_Sub1_9720.anInt9001 * 2024498147);
					i_44_ -= i_53_;
					i_49_ += i_53_;
					i_48_ += i_53_;
				}
				if (i_44_ > 0 && i_45_ > 0)
					method8988(aByteArrayArray9719[c], aClass167_Sub1_9720.anIntArray8996, i_41_, i_50_, i_47_, i_44_, i_45_, i_48_, i_49_, i, i_40_, anIntArray9722[c], class161, i_42_, i_43_);
			}
		}
	}

	void method8988(byte[] is, int[] is_54_, int i, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, Class161 class161, int i_64_, int i_65_) {
		Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
		int[] is_66_ = class161_sub2.anIntArray9444;
		int[] is_67_ = class161_sub2.anIntArray9445;
		int i_68_ = i_61_ - aClass167_Sub1_9720.anInt9000 * 1352816403;
		int i_69_ = i_62_;
		if (i_65_ > i_69_) {
			i_69_ = i_65_;
			i_56_ += aClass167_Sub1_9720.anInt8997 * -570111553 * (i_65_ - i_62_);
			i_55_ += (i_65_ - i_62_) * i_63_;
		}
		int i_70_ = (is_66_.length + i_65_ < i_58_ + i_62_ ? i_65_ + is_66_.length : i_58_ + i_62_);
		for (int i_71_ = i_69_; i_71_ < i_70_; i_71_++) {
			int i_72_ = i_64_ + is_66_[i_71_ - i_65_];
			int i_73_ = is_67_[i_71_ - i_65_];
			int i_74_ = i_57_;
			if (i_68_ > i_72_) {
				int i_75_ = i_68_ - i_72_;
				if (i_75_ >= i_73_) {
					i_55_ += i_57_ + i_60_;
					i_56_ += i_59_ + i_57_;
					continue;
				}
				i_73_ -= i_75_;
			} else {
				int i_76_ = i_72_ - i_68_;
				if (i_76_ >= i_57_) {
					i_55_ += i_60_ + i_57_;
					i_56_ += i_57_ + i_59_;
					continue;
				}
				i_55_ += i_76_;
				i_74_ -= i_76_;
				i_56_ += i_76_;
			}
			int i_77_ = 0;
			if (i_74_ < i_73_)
				i_73_ = i_74_;
			else
				i_77_ = i_74_ - i_73_;
			for (int i_78_ = -i_73_; i_78_ < 0; i_78_++) {
				int i_79_ = is[i_55_++] & 0xff;
				if (0 != i_79_) {
					int i_80_ = (((i_79_ * (i & 0xff00ff) & ~0xff00ff) + (i_79_ * (i & 0xff00) & 0xff0000)) >> 8);
					i_79_ = 256 - i_79_;
					int i_81_ = is_54_[i_56_];
					is_54_[i_56_++] = i_80_ + ((((i_81_ & 0xff00) * i_79_ & 0xff0000) + ((i_81_ & 0xff00ff) * i_79_ & ~0xff00ff)) >> 8);
				} else
					i_56_++;
			}
			i_55_ += i_77_ + i_60_;
			i_56_ += i_77_ + i_59_;
		}
	}

	Class184_Sub3(Class167_Sub1 class167_sub1, Class2 class2, Class179_Sub1[] class179_sub1s, int[] is, int[] is_82_) {
		super(class167_sub1, class2);
		aClass167_Sub1_9720 = class167_sub1;
		aClass167_Sub1_9720 = class167_sub1;
		anIntArray9722 = is;
		anIntArray9721 = is_82_;
		aByteArrayArray9719 = new byte[class179_sub1s.length][];
		anIntArray9718 = new int[class179_sub1s.length];
		anIntArray9723 = new int[class179_sub1s.length];
		for (int i = 0; i < class179_sub1s.length; i++) {
			Class179_Sub1 class179_sub1 = class179_sub1s[i];
			int[] is_83_ = class179_sub1.method2643(false);
			byte[] is_84_ = aByteArrayArray9719[i] = new byte[is_83_.length];
			for (int i_85_ = 0; i_85_ < is_83_.length; i_85_++)
				is_84_[i_85_] = (byte) (is_83_[i_85_] >> 24 & 0xff);
			anIntArray9718[i] = class179_sub1.method2637();
			anIntArray9723[i] = class179_sub1.method2635();
		}
	}

	void method2762(char c, int i, int i_86_, int i_87_, boolean bool) {
		if (null != aClass167_Sub1_9720.anIntArray8996) {
			i += anIntArray9723[c];
			i_86_ += anIntArray9718[c];
			int i_88_ = anIntArray9722[c];
			int i_89_ = anIntArray9721[c];
			int i_90_ = -570111553 * aClass167_Sub1_9720.anInt8997;
			int i_91_ = i + i_90_ * i_86_;
			int i_92_ = i_90_ - i_88_;
			int i_93_ = 0;
			int i_94_ = 0;
			if (i_86_ < -1593163361 * aClass167_Sub1_9720.anInt9021) {
				int i_95_ = aClass167_Sub1_9720.anInt9021 * -1593163361 - i_86_;
				i_89_ -= i_95_;
				i_86_ = aClass167_Sub1_9720.anInt9021 * -1593163361;
				i_94_ += i_95_ * i_88_;
				i_91_ += i_90_ * i_95_;
			}
			if (i_86_ + i_89_ > aClass167_Sub1_9720.anInt9003 * -148513205)
				i_89_ -= (i_89_ + i_86_ - -148513205 * aClass167_Sub1_9720.anInt9003);
			if (i < 1352816403 * aClass167_Sub1_9720.anInt9000) {
				int i_96_ = aClass167_Sub1_9720.anInt9000 * 1352816403 - i;
				i_88_ -= i_96_;
				i = aClass167_Sub1_9720.anInt9000 * 1352816403;
				i_94_ += i_96_;
				i_91_ += i_96_;
				i_93_ += i_96_;
				i_92_ += i_96_;
			}
			if (i_88_ + i > 2024498147 * aClass167_Sub1_9720.anInt9001) {
				int i_97_ = i_88_ + i - 2024498147 * aClass167_Sub1_9720.anInt9001;
				i_88_ -= i_97_;
				i_93_ += i_97_;
				i_92_ += i_97_;
			}
			if (i_88_ > 0 && i_89_ > 0)
				method8987(aByteArrayArray9719[c], aClass167_Sub1_9720.anIntArray8996, i_87_, i_94_, i_91_, i_88_, i_89_, i_92_, i_93_);
		}
	}

	void method2749(char c, int i, int i_98_, int i_99_, boolean bool, Class161 class161, int i_100_, int i_101_) {
		if (null != aClass167_Sub1_9720.anIntArray8996) {
			if (null == class161)
				method2755(c, i, i_98_, i_99_, bool);
			else {
				i += anIntArray9723[c];
				i_98_ += anIntArray9718[c];
				int i_102_ = anIntArray9722[c];
				int i_103_ = anIntArray9721[c];
				int i_104_ = -570111553 * aClass167_Sub1_9720.anInt8997;
				int i_105_ = i_98_ * i_104_ + i;
				int i_106_ = i_104_ - i_102_;
				int i_107_ = 0;
				int i_108_ = 0;
				if (i_98_ < -1593163361 * aClass167_Sub1_9720.anInt9021) {
					int i_109_ = -1593163361 * aClass167_Sub1_9720.anInt9021 - i_98_;
					i_103_ -= i_109_;
					i_98_ = -1593163361 * aClass167_Sub1_9720.anInt9021;
					i_108_ += i_102_ * i_109_;
					i_105_ += i_109_ * i_104_;
				}
				if (i_103_ + i_98_ > -148513205 * aClass167_Sub1_9720.anInt9003)
					i_103_ -= (i_98_ + i_103_ - -148513205 * aClass167_Sub1_9720.anInt9003);
				if (i < 1352816403 * aClass167_Sub1_9720.anInt9000) {
					int i_110_ = aClass167_Sub1_9720.anInt9000 * 1352816403 - i;
					i_102_ -= i_110_;
					i = 1352816403 * aClass167_Sub1_9720.anInt9000;
					i_108_ += i_110_;
					i_105_ += i_110_;
					i_107_ += i_110_;
					i_106_ += i_110_;
				}
				if (i_102_ + i > 2024498147 * aClass167_Sub1_9720.anInt9001) {
					int i_111_ = (i_102_ + i - aClass167_Sub1_9720.anInt9001 * 2024498147);
					i_102_ -= i_111_;
					i_107_ += i_111_;
					i_106_ += i_111_;
				}
				if (i_102_ > 0 && i_103_ > 0)
					method8988(aByteArrayArray9719[c], aClass167_Sub1_9720.anIntArray8996, i_99_, i_108_, i_105_, i_102_, i_103_, i_106_, i_107_, i, i_98_, anIntArray9722[c], class161, i_100_, i_101_);
			}
		}
	}

	void method2756(char c, int i, int i_112_, int i_113_, boolean bool, Class161 class161, int i_114_, int i_115_) {
		if (null != aClass167_Sub1_9720.anIntArray8996) {
			if (null == class161)
				method2755(c, i, i_112_, i_113_, bool);
			else {
				i += anIntArray9723[c];
				i_112_ += anIntArray9718[c];
				int i_116_ = anIntArray9722[c];
				int i_117_ = anIntArray9721[c];
				int i_118_ = -570111553 * aClass167_Sub1_9720.anInt8997;
				int i_119_ = i_112_ * i_118_ + i;
				int i_120_ = i_118_ - i_116_;
				int i_121_ = 0;
				int i_122_ = 0;
				if (i_112_ < -1593163361 * aClass167_Sub1_9720.anInt9021) {
					int i_123_ = -1593163361 * aClass167_Sub1_9720.anInt9021 - i_112_;
					i_117_ -= i_123_;
					i_112_ = -1593163361 * aClass167_Sub1_9720.anInt9021;
					i_122_ += i_116_ * i_123_;
					i_119_ += i_123_ * i_118_;
				}
				if (i_117_ + i_112_ > -148513205 * aClass167_Sub1_9720.anInt9003)
					i_117_ -= (i_112_ + i_117_ - -148513205 * aClass167_Sub1_9720.anInt9003);
				if (i < 1352816403 * aClass167_Sub1_9720.anInt9000) {
					int i_124_ = aClass167_Sub1_9720.anInt9000 * 1352816403 - i;
					i_116_ -= i_124_;
					i = 1352816403 * aClass167_Sub1_9720.anInt9000;
					i_122_ += i_124_;
					i_119_ += i_124_;
					i_121_ += i_124_;
					i_120_ += i_124_;
				}
				if (i_116_ + i > 2024498147 * aClass167_Sub1_9720.anInt9001) {
					int i_125_ = (i_116_ + i - aClass167_Sub1_9720.anInt9001 * 2024498147);
					i_116_ -= i_125_;
					i_121_ += i_125_;
					i_120_ += i_125_;
				}
				if (i_116_ > 0 && i_117_ > 0)
					method8988(aByteArrayArray9719[c], aClass167_Sub1_9720.anIntArray8996, i_113_, i_122_, i_119_, i_116_, i_117_, i_120_, i_121_, i, i_112_, anIntArray9722[c], class161, i_114_, i_115_);
			}
		}
	}

	void method2757(char c, int i, int i_126_, int i_127_, boolean bool, Class161 class161, int i_128_, int i_129_) {
		if (null != aClass167_Sub1_9720.anIntArray8996) {
			if (null == class161)
				method2755(c, i, i_126_, i_127_, bool);
			else {
				i += anIntArray9723[c];
				i_126_ += anIntArray9718[c];
				int i_130_ = anIntArray9722[c];
				int i_131_ = anIntArray9721[c];
				int i_132_ = -570111553 * aClass167_Sub1_9720.anInt8997;
				int i_133_ = i_126_ * i_132_ + i;
				int i_134_ = i_132_ - i_130_;
				int i_135_ = 0;
				int i_136_ = 0;
				if (i_126_ < -1593163361 * aClass167_Sub1_9720.anInt9021) {
					int i_137_ = -1593163361 * aClass167_Sub1_9720.anInt9021 - i_126_;
					i_131_ -= i_137_;
					i_126_ = -1593163361 * aClass167_Sub1_9720.anInt9021;
					i_136_ += i_130_ * i_137_;
					i_133_ += i_137_ * i_132_;
				}
				if (i_131_ + i_126_ > -148513205 * aClass167_Sub1_9720.anInt9003)
					i_131_ -= (i_126_ + i_131_ - -148513205 * aClass167_Sub1_9720.anInt9003);
				if (i < 1352816403 * aClass167_Sub1_9720.anInt9000) {
					int i_138_ = aClass167_Sub1_9720.anInt9000 * 1352816403 - i;
					i_130_ -= i_138_;
					i = 1352816403 * aClass167_Sub1_9720.anInt9000;
					i_136_ += i_138_;
					i_133_ += i_138_;
					i_135_ += i_138_;
					i_134_ += i_138_;
				}
				if (i_130_ + i > 2024498147 * aClass167_Sub1_9720.anInt9001) {
					int i_139_ = (i_130_ + i - aClass167_Sub1_9720.anInt9001 * 2024498147);
					i_130_ -= i_139_;
					i_135_ += i_139_;
					i_134_ += i_139_;
				}
				if (i_130_ > 0 && i_131_ > 0)
					method8988(aByteArrayArray9719[c], aClass167_Sub1_9720.anIntArray8996, i_127_, i_136_, i_133_, i_130_, i_131_, i_134_, i_135_, i, i_126_, anIntArray9722[c], class161, i_128_, i_129_);
			}
		}
	}

	void method2752(char c, int i, int i_140_, int i_141_, boolean bool, Class161 class161, int i_142_, int i_143_) {
		if (null != aClass167_Sub1_9720.anIntArray8996) {
			if (null == class161)
				method2755(c, i, i_140_, i_141_, bool);
			else {
				i += anIntArray9723[c];
				i_140_ += anIntArray9718[c];
				int i_144_ = anIntArray9722[c];
				int i_145_ = anIntArray9721[c];
				int i_146_ = -570111553 * aClass167_Sub1_9720.anInt8997;
				int i_147_ = i_140_ * i_146_ + i;
				int i_148_ = i_146_ - i_144_;
				int i_149_ = 0;
				int i_150_ = 0;
				if (i_140_ < -1593163361 * aClass167_Sub1_9720.anInt9021) {
					int i_151_ = -1593163361 * aClass167_Sub1_9720.anInt9021 - i_140_;
					i_145_ -= i_151_;
					i_140_ = -1593163361 * aClass167_Sub1_9720.anInt9021;
					i_150_ += i_144_ * i_151_;
					i_147_ += i_151_ * i_146_;
				}
				if (i_145_ + i_140_ > -148513205 * aClass167_Sub1_9720.anInt9003)
					i_145_ -= (i_140_ + i_145_ - -148513205 * aClass167_Sub1_9720.anInt9003);
				if (i < 1352816403 * aClass167_Sub1_9720.anInt9000) {
					int i_152_ = aClass167_Sub1_9720.anInt9000 * 1352816403 - i;
					i_144_ -= i_152_;
					i = 1352816403 * aClass167_Sub1_9720.anInt9000;
					i_150_ += i_152_;
					i_147_ += i_152_;
					i_149_ += i_152_;
					i_148_ += i_152_;
				}
				if (i_144_ + i > 2024498147 * aClass167_Sub1_9720.anInt9001) {
					int i_153_ = (i_144_ + i - aClass167_Sub1_9720.anInt9001 * 2024498147);
					i_144_ -= i_153_;
					i_149_ += i_153_;
					i_148_ += i_153_;
				}
				if (i_144_ > 0 && i_145_ > 0)
					method8988(aByteArrayArray9719[c], aClass167_Sub1_9720.anIntArray8996, i_141_, i_150_, i_147_, i_144_, i_145_, i_148_, i_149_, i, i_140_, anIntArray9722[c], class161, i_142_, i_143_);
			}
		}
	}

	void method8989(byte[] is, int[] is_154_, int i, int i_155_, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_, int i_161_, int i_162_, int i_163_, Class161 class161, int i_164_, int i_165_) {
		Class161_Sub2 class161_sub2 = (Class161_Sub2) class161;
		int[] is_166_ = class161_sub2.anIntArray9444;
		int[] is_167_ = class161_sub2.anIntArray9445;
		int i_168_ = i_161_ - aClass167_Sub1_9720.anInt9000 * 1352816403;
		int i_169_ = i_162_;
		if (i_165_ > i_169_) {
			i_169_ = i_165_;
			i_156_ += aClass167_Sub1_9720.anInt8997 * -570111553 * (i_165_ - i_162_);
			i_155_ += (i_165_ - i_162_) * i_163_;
		}
		int i_170_ = (is_166_.length + i_165_ < i_158_ + i_162_ ? i_165_ + is_166_.length : i_158_ + i_162_);
		for (int i_171_ = i_169_; i_171_ < i_170_; i_171_++) {
			int i_172_ = i_164_ + is_166_[i_171_ - i_165_];
			int i_173_ = is_167_[i_171_ - i_165_];
			int i_174_ = i_157_;
			if (i_168_ > i_172_) {
				int i_175_ = i_168_ - i_172_;
				if (i_175_ >= i_173_) {
					i_155_ += i_157_ + i_160_;
					i_156_ += i_159_ + i_157_;
					continue;
				}
				i_173_ -= i_175_;
			} else {
				int i_176_ = i_172_ - i_168_;
				if (i_176_ >= i_157_) {
					i_155_ += i_160_ + i_157_;
					i_156_ += i_157_ + i_159_;
					continue;
				}
				i_155_ += i_176_;
				i_174_ -= i_176_;
				i_156_ += i_176_;
			}
			int i_177_ = 0;
			if (i_174_ < i_173_)
				i_173_ = i_174_;
			else
				i_177_ = i_174_ - i_173_;
			for (int i_178_ = -i_173_; i_178_ < 0; i_178_++) {
				int i_179_ = is[i_155_++] & 0xff;
				if (0 != i_179_) {
					int i_180_ = (((i_179_ * (i & 0xff00ff) & ~0xff00ff) + (i_179_ * (i & 0xff00) & 0xff0000)) >> 8);
					i_179_ = 256 - i_179_;
					int i_181_ = is_154_[i_156_];
					is_154_[i_156_++] = i_180_ + ((((i_181_ & 0xff00) * i_179_ & 0xff0000) + ((i_181_ & 0xff00ff) * i_179_ & ~0xff00ff)) >> 8);
				} else
					i_156_++;
			}
			i_155_ += i_177_ + i_160_;
			i_156_ += i_177_ + i_159_;
		}
	}

	static final void method8990(byte i, int i_182_) {
		byte[][][] is = client.aClass515_11066.method6314((byte) -26);
		if (is == null) {
			is = (new byte[4][client.aClass515_11066.method6321((byte) 19)][client.aClass515_11066.method6243(177401017)]);
			client.aClass515_11066.method6246(is, -1106949802);
		}
		for (int i_183_ = 0; i_183_ < 4; i_183_++) {
			for (int i_184_ = 0; i_184_ < client.aClass515_11066.method6321((byte) 26); i_184_++) {
				for (int i_185_ = 0; i_185_ < client.aClass515_11066.method6243(177401017); i_185_++)
					is[i_183_][i_184_][i_185_] = i;
			}
		}
	}

	static Class299[] method8991(int i) {
		return (new Class299[] { Class299.aClass299_3350, Class299.aClass299_3353, Class299.aClass299_3351 });
	}
}
