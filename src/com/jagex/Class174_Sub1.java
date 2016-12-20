/* Class174_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.ping.Ping;

public class Class174_Sub1 extends Class174 {
	int[] anIntArray9105;
	int[] anIntArray9106;
	Class180_Sub1 aClass180_Sub1_9107;
	byte[][] aByteArrayArray9108;
	int[] anIntArray9109;
	int[] anIntArray9110;
	static int anInt9111;
	static int anInt9112;

	void method14583(byte[] is, int[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		for (int i_7_ = -i_4_; i_7_ < 0; i_7_++) {
			for (int i_8_ = -i_3_; i_8_ < 0; i_8_++) {
				int i_9_ = is[i_1_++] & 0xff;
				if (0 != i_9_) {
					int i_10_ = ((((i & 0xff00ff) * i_9_ & ~0xff00ff) + ((i & 0xff00) * i_9_ & 0xff0000)) >> 8);
					i_9_ = 256 - i_9_;
					int i_11_ = is_0_[i_2_];
					is_0_[i_2_++] = i_10_ + (((i_9_ * (i_11_ & 0xff00ff) & ~0xff00ff) + (i_9_ * (i_11_ & 0xff00) & 0xff0000)) >> 8);
				} else
					i_2_++;
			}
			i_2_ += i_5_;
			i_1_ += i_6_;
		}
	}

	Class174_Sub1(Class180_Sub1 class180_sub1, Class22 class22, Class185_Sub1[] class185_sub1s, int[] is, int[] is_12_) {
		super(class180_sub1, class22);
		aClass180_Sub1_9107 = class180_sub1;
		aClass180_Sub1_9107 = class180_sub1;
		anIntArray9106 = is;
		anIntArray9105 = is_12_;
		aByteArrayArray9108 = new byte[class185_sub1s.length][];
		anIntArray9109 = new int[class185_sub1s.length];
		anIntArray9110 = new int[class185_sub1s.length];
		for (int i = 0; i < class185_sub1s.length; i++) {
			Class185_Sub1 class185_sub1 = class185_sub1s[i];
			int[] is_13_ = class185_sub1.method3584(false);
			byte[] is_14_ = aByteArrayArray9108[i] = new byte[is_13_.length];
			for (int i_15_ = 0; i_15_ < is_13_.length; i_15_++)
				is_14_[i_15_] = (byte) (is_13_[i_15_] >> 24 & 0xff);
			anIntArray9109[i] = class185_sub1.method3611();
			anIntArray9110[i] = class185_sub1.method3634();
		}
	}

	void method2758(char c, int i, int i_16_, int i_17_, boolean bool) {
		if (aClass180_Sub1_9107.anIntArray9386 != null) {
			i += anIntArray9110[c];
			i_16_ += anIntArray9109[c];
			int i_18_ = anIntArray9106[c];
			int i_19_ = anIntArray9105[c];
			int i_20_ = aClass180_Sub1_9107.anInt9387 * -1173855569;
			int i_21_ = i + i_20_ * i_16_;
			int i_22_ = i_20_ - i_18_;
			int i_23_ = 0;
			int i_24_ = 0;
			if (i_16_ < aClass180_Sub1_9107.anInt9392 * -456655989) {
				int i_25_ = aClass180_Sub1_9107.anInt9392 * -456655989 - i_16_;
				i_19_ -= i_25_;
				i_16_ = aClass180_Sub1_9107.anInt9392 * -456655989;
				i_24_ += i_18_ * i_25_;
				i_21_ += i_25_ * i_20_;
			}
			if (i_16_ + i_19_ > aClass180_Sub1_9107.anInt9393 * -383695469)
				i_19_ -= (i_16_ + i_19_ - -383695469 * aClass180_Sub1_9107.anInt9393);
			if (i < 1605202751 * aClass180_Sub1_9107.anInt9383) {
				int i_26_ = aClass180_Sub1_9107.anInt9383 * 1605202751 - i;
				i_18_ -= i_26_;
				i = 1605202751 * aClass180_Sub1_9107.anInt9383;
				i_24_ += i_26_;
				i_21_ += i_26_;
				i_23_ += i_26_;
				i_22_ += i_26_;
			}
			if (i_18_ + i > 2014358275 * aClass180_Sub1_9107.anInt9391) {
				int i_27_ = i_18_ + i - 2014358275 * aClass180_Sub1_9107.anInt9391;
				i_18_ -= i_27_;
				i_23_ += i_27_;
				i_22_ += i_27_;
			}
			if (i_18_ > 0 && i_19_ > 0)
				method14584(aByteArrayArray9108[c], aClass180_Sub1_9107.anIntArray9386, i_17_, i_24_, i_21_, i_18_, i_19_, i_22_, i_23_);
		}
	}

	void method14584(byte[] is, int[] is_28_, int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_) {
		for (int i_35_ = -i_32_; i_35_ < 0; i_35_++) {
			for (int i_36_ = -i_31_; i_36_ < 0; i_36_++) {
				int i_37_ = is[i_29_++] & 0xff;
				if (0 != i_37_) {
					int i_38_ = ((((i & 0xff00ff) * i_37_ & ~0xff00ff) + ((i & 0xff00) * i_37_ & 0xff0000)) >> 8);
					i_37_ = 256 - i_37_;
					int i_39_ = is_28_[i_30_];
					is_28_[i_30_++] = i_38_ + (((i_37_ * (i_39_ & 0xff00ff) & ~0xff00ff) + (i_37_ * (i_39_ & 0xff00) & 0xff0000)) >> 8);
				} else
					i_30_++;
			}
			i_30_ += i_33_;
			i_29_ += i_34_;
		}
	}

	Class174_Sub1(Class180_Sub1 class180_sub1, Class22 class22, Class185_Sub2[] class185_sub2s, int[] is, int[] is_40_) {
		super(class180_sub1, class22);
		aClass180_Sub1_9107 = class180_sub1;
		aClass180_Sub1_9107 = class180_sub1;
		anIntArray9106 = is;
		anIntArray9105 = is_40_;
		aByteArrayArray9108 = new byte[class185_sub2s.length][];
		anIntArray9109 = new int[class185_sub2s.length];
		anIntArray9110 = new int[class185_sub2s.length];
		for (int i = 0; i < class185_sub2s.length; i++) {
			Class185_Sub2 class185_sub2 = class185_sub2s[i];
			if (class185_sub2.aByteArray9379 != null)
				aByteArrayArray9108[i] = class185_sub2.aByteArray9379;
			else {
				byte[] is_41_ = class185_sub2.aByteArray9371;
				byte[] is_42_ = aByteArrayArray9108[i] = new byte[is_41_.length];
				for (int i_43_ = 0; i_43_ < is_41_.length; i_43_++)
					is_42_[i_43_] = (byte) (is_41_[i_43_] == 0 ? 0 : -1);
			}
			anIntArray9109[i] = class185_sub2.anInt9378;
			anIntArray9110[i] = class185_sub2.anInt9375;
		}
	}

	void method2759(char c, int i, int i_44_, int i_45_, boolean bool, Class142 class142, int i_46_, int i_47_) {
		if (null != aClass180_Sub1_9107.anIntArray9386) {
			if (null == class142)
				method2758(c, i, i_44_, i_45_, bool);
			else {
				i += anIntArray9110[c];
				i_44_ += anIntArray9109[c];
				int i_48_ = anIntArray9106[c];
				int i_49_ = anIntArray9105[c];
				int i_50_ = aClass180_Sub1_9107.anInt9387 * -1173855569;
				int i_51_ = i + i_50_ * i_44_;
				int i_52_ = i_50_ - i_48_;
				int i_53_ = 0;
				int i_54_ = 0;
				if (i_44_ < -456655989 * aClass180_Sub1_9107.anInt9392) {
					int i_55_ = -456655989 * aClass180_Sub1_9107.anInt9392 - i_44_;
					i_49_ -= i_55_;
					i_44_ = aClass180_Sub1_9107.anInt9392 * -456655989;
					i_54_ += i_48_ * i_55_;
					i_51_ += i_55_ * i_50_;
				}
				if (i_44_ + i_49_ > -383695469 * aClass180_Sub1_9107.anInt9393)
					i_49_ -= (i_44_ + i_49_ - aClass180_Sub1_9107.anInt9393 * -383695469);
				if (i < 1605202751 * aClass180_Sub1_9107.anInt9383) {
					int i_56_ = 1605202751 * aClass180_Sub1_9107.anInt9383 - i;
					i_48_ -= i_56_;
					i = 1605202751 * aClass180_Sub1_9107.anInt9383;
					i_54_ += i_56_;
					i_51_ += i_56_;
					i_53_ += i_56_;
					i_52_ += i_56_;
				}
				if (i + i_48_ > 2014358275 * aClass180_Sub1_9107.anInt9391) {
					int i_57_ = (i + i_48_ - aClass180_Sub1_9107.anInt9391 * 2014358275);
					i_48_ -= i_57_;
					i_53_ += i_57_;
					i_52_ += i_57_;
				}
				if (i_48_ > 0 && i_49_ > 0)
					method14589(aByteArrayArray9108[c], aClass180_Sub1_9107.anIntArray9386, i_45_, i_54_, i_51_, i_48_, i_49_, i_52_, i_53_, i, i_44_, anIntArray9106[c], class142, i_46_, i_47_);
			}
		}
	}

	void method2760(char c, int i, int i_58_, int i_59_, boolean bool) {
		if (aClass180_Sub1_9107.anIntArray9386 != null) {
			i += anIntArray9110[c];
			i_58_ += anIntArray9109[c];
			int i_60_ = anIntArray9106[c];
			int i_61_ = anIntArray9105[c];
			int i_62_ = aClass180_Sub1_9107.anInt9387 * -1173855569;
			int i_63_ = i + i_62_ * i_58_;
			int i_64_ = i_62_ - i_60_;
			int i_65_ = 0;
			int i_66_ = 0;
			if (i_58_ < aClass180_Sub1_9107.anInt9392 * -456655989) {
				int i_67_ = aClass180_Sub1_9107.anInt9392 * -456655989 - i_58_;
				i_61_ -= i_67_;
				i_58_ = aClass180_Sub1_9107.anInt9392 * -456655989;
				i_66_ += i_60_ * i_67_;
				i_63_ += i_67_ * i_62_;
			}
			if (i_58_ + i_61_ > aClass180_Sub1_9107.anInt9393 * -383695469)
				i_61_ -= (i_58_ + i_61_ - -383695469 * aClass180_Sub1_9107.anInt9393);
			if (i < 1605202751 * aClass180_Sub1_9107.anInt9383) {
				int i_68_ = aClass180_Sub1_9107.anInt9383 * 1605202751 - i;
				i_60_ -= i_68_;
				i = 1605202751 * aClass180_Sub1_9107.anInt9383;
				i_66_ += i_68_;
				i_63_ += i_68_;
				i_65_ += i_68_;
				i_64_ += i_68_;
			}
			if (i_60_ + i > 2014358275 * aClass180_Sub1_9107.anInt9391) {
				int i_69_ = i_60_ + i - 2014358275 * aClass180_Sub1_9107.anInt9391;
				i_60_ -= i_69_;
				i_65_ += i_69_;
				i_64_ += i_69_;
			}
			if (i_60_ > 0 && i_61_ > 0)
				method14584(aByteArrayArray9108[c], aClass180_Sub1_9107.anIntArray9386, i_59_, i_66_, i_63_, i_60_, i_61_, i_64_, i_65_);
		}
	}

	void method2761(char c, int i, int i_70_, int i_71_, boolean bool) {
		if (aClass180_Sub1_9107.anIntArray9386 != null) {
			i += anIntArray9110[c];
			i_70_ += anIntArray9109[c];
			int i_72_ = anIntArray9106[c];
			int i_73_ = anIntArray9105[c];
			int i_74_ = aClass180_Sub1_9107.anInt9387 * -1173855569;
			int i_75_ = i + i_74_ * i_70_;
			int i_76_ = i_74_ - i_72_;
			int i_77_ = 0;
			int i_78_ = 0;
			if (i_70_ < aClass180_Sub1_9107.anInt9392 * -456655989) {
				int i_79_ = aClass180_Sub1_9107.anInt9392 * -456655989 - i_70_;
				i_73_ -= i_79_;
				i_70_ = aClass180_Sub1_9107.anInt9392 * -456655989;
				i_78_ += i_72_ * i_79_;
				i_75_ += i_79_ * i_74_;
			}
			if (i_70_ + i_73_ > aClass180_Sub1_9107.anInt9393 * -383695469)
				i_73_ -= (i_70_ + i_73_ - -383695469 * aClass180_Sub1_9107.anInt9393);
			if (i < 1605202751 * aClass180_Sub1_9107.anInt9383) {
				int i_80_ = aClass180_Sub1_9107.anInt9383 * 1605202751 - i;
				i_72_ -= i_80_;
				i = 1605202751 * aClass180_Sub1_9107.anInt9383;
				i_78_ += i_80_;
				i_75_ += i_80_;
				i_77_ += i_80_;
				i_76_ += i_80_;
			}
			if (i_72_ + i > 2014358275 * aClass180_Sub1_9107.anInt9391) {
				int i_81_ = i_72_ + i - 2014358275 * aClass180_Sub1_9107.anInt9391;
				i_72_ -= i_81_;
				i_77_ += i_81_;
				i_76_ += i_81_;
			}
			if (i_72_ > 0 && i_73_ > 0)
				method14584(aByteArrayArray9108[c], aClass180_Sub1_9107.anIntArray9386, i_71_, i_78_, i_75_, i_72_, i_73_, i_76_, i_77_);
		}
	}

	void method14585(byte[] is, int[] is_82_, int i, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_) {
		for (int i_89_ = -i_86_; i_89_ < 0; i_89_++) {
			for (int i_90_ = -i_85_; i_90_ < 0; i_90_++) {
				int i_91_ = is[i_83_++] & 0xff;
				if (0 != i_91_) {
					int i_92_ = ((((i & 0xff00ff) * i_91_ & ~0xff00ff) + ((i & 0xff00) * i_91_ & 0xff0000)) >> 8);
					i_91_ = 256 - i_91_;
					int i_93_ = is_82_[i_84_];
					is_82_[i_84_++] = i_92_ + (((i_91_ * (i_93_ & 0xff00ff) & ~0xff00ff) + (i_91_ * (i_93_ & 0xff00) & 0xff0000)) >> 8);
				} else
					i_84_++;
			}
			i_84_ += i_87_;
			i_83_ += i_88_;
		}
	}

	void method14586(byte[] is, int[] is_94_, int i, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_, Class142 class142, int i_104_, int i_105_) {
		Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
		int[] is_106_ = class142_sub1.anIntArray9002;
		int[] is_107_ = class142_sub1.anIntArray9003;
		int i_108_ = i_101_ - 1605202751 * aClass180_Sub1_9107.anInt9383;
		int i_109_ = i_102_;
		if (i_105_ > i_109_) {
			i_109_ = i_105_;
			i_96_ += -1173855569 * aClass180_Sub1_9107.anInt9387 * (i_105_ - i_102_);
			i_95_ += i_103_ * (i_105_ - i_102_);
		}
		int i_110_ = (is_106_.length + i_105_ < i_98_ + i_102_ ? is_106_.length + i_105_ : i_98_ + i_102_);
		for (int i_111_ = i_109_; i_111_ < i_110_; i_111_++) {
			int i_112_ = is_106_[i_111_ - i_105_] + i_104_;
			int i_113_ = is_107_[i_111_ - i_105_];
			int i_114_ = i_97_;
			if (i_108_ > i_112_) {
				int i_115_ = i_108_ - i_112_;
				if (i_115_ >= i_113_) {
					i_95_ += i_97_ + i_100_;
					i_96_ += i_97_ + i_99_;
					continue;
				}
				i_113_ -= i_115_;
			} else {
				int i_116_ = i_112_ - i_108_;
				if (i_116_ >= i_97_) {
					i_95_ += i_97_ + i_100_;
					i_96_ += i_99_ + i_97_;
					continue;
				}
				i_95_ += i_116_;
				i_114_ -= i_116_;
				i_96_ += i_116_;
			}
			int i_117_ = 0;
			if (i_114_ < i_113_)
				i_113_ = i_114_;
			else
				i_117_ = i_114_ - i_113_;
			for (int i_118_ = -i_113_; i_118_ < 0; i_118_++) {
				int i_119_ = is[i_95_++] & 0xff;
				if (0 != i_119_) {
					int i_120_ = ((((i & 0xff00ff) * i_119_ & ~0xff00ff) + ((i & 0xff00) * i_119_ & 0xff0000)) >> 8);
					i_119_ = 256 - i_119_;
					int i_121_ = is_94_[i_96_];
					is_94_[i_96_++] = (((i_119_ * (i_121_ & 0xff00ff) & ~0xff00ff) + (i_119_ * (i_121_ & 0xff00) & 0xff0000)) >> 8) + i_120_;
				} else
					i_96_++;
			}
			i_95_ += i_100_ + i_117_;
			i_96_ += i_99_ + i_117_;
		}
	}

	void method14587(byte[] is, int[] is_122_, int i, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_) {
		for (int i_129_ = -i_126_; i_129_ < 0; i_129_++) {
			for (int i_130_ = -i_125_; i_130_ < 0; i_130_++) {
				int i_131_ = is[i_123_++] & 0xff;
				if (0 != i_131_) {
					int i_132_ = ((((i & 0xff00ff) * i_131_ & ~0xff00ff) + ((i & 0xff00) * i_131_ & 0xff0000)) >> 8);
					i_131_ = 256 - i_131_;
					int i_133_ = is_122_[i_124_];
					is_122_[i_124_++] = i_132_ + (((i_131_ * (i_133_ & 0xff00ff) & ~0xff00ff) + (i_131_ * (i_133_ & 0xff00) & 0xff0000)) >> 8);
				} else
					i_124_++;
			}
			i_124_ += i_127_;
			i_123_ += i_128_;
		}
	}

	void method2763(char c, int i, int i_134_, int i_135_, boolean bool, Class142 class142, int i_136_, int i_137_) {
		if (null != aClass180_Sub1_9107.anIntArray9386) {
			if (null == class142)
				method2758(c, i, i_134_, i_135_, bool);
			else {
				i += anIntArray9110[c];
				i_134_ += anIntArray9109[c];
				int i_138_ = anIntArray9106[c];
				int i_139_ = anIntArray9105[c];
				int i_140_ = aClass180_Sub1_9107.anInt9387 * -1173855569;
				int i_141_ = i + i_140_ * i_134_;
				int i_142_ = i_140_ - i_138_;
				int i_143_ = 0;
				int i_144_ = 0;
				if (i_134_ < -456655989 * aClass180_Sub1_9107.anInt9392) {
					int i_145_ = -456655989 * aClass180_Sub1_9107.anInt9392 - i_134_;
					i_139_ -= i_145_;
					i_134_ = aClass180_Sub1_9107.anInt9392 * -456655989;
					i_144_ += i_138_ * i_145_;
					i_141_ += i_145_ * i_140_;
				}
				if (i_134_ + i_139_ > -383695469 * aClass180_Sub1_9107.anInt9393)
					i_139_ -= (i_134_ + i_139_ - aClass180_Sub1_9107.anInt9393 * -383695469);
				if (i < 1605202751 * aClass180_Sub1_9107.anInt9383) {
					int i_146_ = 1605202751 * aClass180_Sub1_9107.anInt9383 - i;
					i_138_ -= i_146_;
					i = 1605202751 * aClass180_Sub1_9107.anInt9383;
					i_144_ += i_146_;
					i_141_ += i_146_;
					i_143_ += i_146_;
					i_142_ += i_146_;
				}
				if (i + i_138_ > 2014358275 * aClass180_Sub1_9107.anInt9391) {
					int i_147_ = (i + i_138_ - aClass180_Sub1_9107.anInt9391 * 2014358275);
					i_138_ -= i_147_;
					i_143_ += i_147_;
					i_142_ += i_147_;
				}
				if (i_138_ > 0 && i_139_ > 0)
					method14589(aByteArrayArray9108[c], aClass180_Sub1_9107.anIntArray9386, i_135_, i_144_, i_141_, i_138_, i_139_, i_142_, i_143_, i, i_134_, anIntArray9106[c], class142, i_136_, i_137_);
			}
		}
	}

	void method14588(byte[] is, int[] is_148_, int i, int i_149_, int i_150_, int i_151_, int i_152_, int i_153_, int i_154_) {
		for (int i_155_ = -i_152_; i_155_ < 0; i_155_++) {
			for (int i_156_ = -i_151_; i_156_ < 0; i_156_++) {
				int i_157_ = is[i_149_++] & 0xff;
				if (0 != i_157_) {
					int i_158_ = ((((i & 0xff00ff) * i_157_ & ~0xff00ff) + ((i & 0xff00) * i_157_ & 0xff0000)) >> 8);
					i_157_ = 256 - i_157_;
					int i_159_ = is_148_[i_150_];
					is_148_[i_150_++] = i_158_ + (((i_157_ * (i_159_ & 0xff00ff) & ~0xff00ff) + (i_157_ * (i_159_ & 0xff00) & 0xff0000)) >> 8);
				} else
					i_150_++;
			}
			i_150_ += i_153_;
			i_149_ += i_154_;
		}
	}

	void method14589(byte[] is, int[] is_160_, int i, int i_161_, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_, int i_167_, int i_168_, int i_169_, Class142 class142, int i_170_, int i_171_) {
		Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
		int[] is_172_ = class142_sub1.anIntArray9002;
		int[] is_173_ = class142_sub1.anIntArray9003;
		int i_174_ = i_167_ - 1605202751 * aClass180_Sub1_9107.anInt9383;
		int i_175_ = i_168_;
		if (i_171_ > i_175_) {
			i_175_ = i_171_;
			i_162_ += -1173855569 * aClass180_Sub1_9107.anInt9387 * (i_171_ - i_168_);
			i_161_ += i_169_ * (i_171_ - i_168_);
		}
		int i_176_ = (is_172_.length + i_171_ < i_164_ + i_168_ ? is_172_.length + i_171_ : i_164_ + i_168_);
		for (int i_177_ = i_175_; i_177_ < i_176_; i_177_++) {
			int i_178_ = is_172_[i_177_ - i_171_] + i_170_;
			int i_179_ = is_173_[i_177_ - i_171_];
			int i_180_ = i_163_;
			if (i_174_ > i_178_) {
				int i_181_ = i_174_ - i_178_;
				if (i_181_ >= i_179_) {
					i_161_ += i_163_ + i_166_;
					i_162_ += i_163_ + i_165_;
					continue;
				}
				i_179_ -= i_181_;
			} else {
				int i_182_ = i_178_ - i_174_;
				if (i_182_ >= i_163_) {
					i_161_ += i_163_ + i_166_;
					i_162_ += i_165_ + i_163_;
					continue;
				}
				i_161_ += i_182_;
				i_180_ -= i_182_;
				i_162_ += i_182_;
			}
			int i_183_ = 0;
			if (i_180_ < i_179_)
				i_179_ = i_180_;
			else
				i_183_ = i_180_ - i_179_;
			for (int i_184_ = -i_179_; i_184_ < 0; i_184_++) {
				int i_185_ = is[i_161_++] & 0xff;
				if (0 != i_185_) {
					int i_186_ = ((((i & 0xff00ff) * i_185_ & ~0xff00ff) + ((i & 0xff00) * i_185_ & 0xff0000)) >> 8);
					i_185_ = 256 - i_185_;
					int i_187_ = is_160_[i_162_];
					is_160_[i_162_++] = (((i_185_ * (i_187_ & 0xff00ff) & ~0xff00ff) + (i_185_ * (i_187_ & 0xff00) & 0xff0000)) >> 8) + i_186_;
				} else
					i_162_++;
			}
			i_161_ += i_166_ + i_183_;
			i_162_ += i_165_ + i_183_;
		}
	}

	void method2762(char c, int i, int i_188_, int i_189_, boolean bool, Class142 class142, int i_190_, int i_191_) {
		if (null != aClass180_Sub1_9107.anIntArray9386) {
			if (null == class142)
				method2758(c, i, i_188_, i_189_, bool);
			else {
				i += anIntArray9110[c];
				i_188_ += anIntArray9109[c];
				int i_192_ = anIntArray9106[c];
				int i_193_ = anIntArray9105[c];
				int i_194_ = aClass180_Sub1_9107.anInt9387 * -1173855569;
				int i_195_ = i + i_194_ * i_188_;
				int i_196_ = i_194_ - i_192_;
				int i_197_ = 0;
				int i_198_ = 0;
				if (i_188_ < -456655989 * aClass180_Sub1_9107.anInt9392) {
					int i_199_ = -456655989 * aClass180_Sub1_9107.anInt9392 - i_188_;
					i_193_ -= i_199_;
					i_188_ = aClass180_Sub1_9107.anInt9392 * -456655989;
					i_198_ += i_192_ * i_199_;
					i_195_ += i_199_ * i_194_;
				}
				if (i_188_ + i_193_ > -383695469 * aClass180_Sub1_9107.anInt9393)
					i_193_ -= (i_188_ + i_193_ - aClass180_Sub1_9107.anInt9393 * -383695469);
				if (i < 1605202751 * aClass180_Sub1_9107.anInt9383) {
					int i_200_ = 1605202751 * aClass180_Sub1_9107.anInt9383 - i;
					i_192_ -= i_200_;
					i = 1605202751 * aClass180_Sub1_9107.anInt9383;
					i_198_ += i_200_;
					i_195_ += i_200_;
					i_197_ += i_200_;
					i_196_ += i_200_;
				}
				if (i + i_192_ > 2014358275 * aClass180_Sub1_9107.anInt9391) {
					int i_201_ = (i + i_192_ - aClass180_Sub1_9107.anInt9391 * 2014358275);
					i_192_ -= i_201_;
					i_197_ += i_201_;
					i_196_ += i_201_;
				}
				if (i_192_ > 0 && i_193_ > 0)
					method14589(aByteArrayArray9108[c], aClass180_Sub1_9107.anIntArray9386, i_189_, i_198_, i_195_, i_192_, i_193_, i_196_, i_197_, i, i_188_, anIntArray9106[c], class142, i_190_, i_191_);
			}
		}
	}

	public static void method14590(int[] is, float[] fs, float[] fs_202_, int i) {
		Class328.method5804(is, fs, fs_202_, 0, is.length - 1, 1492438668);
	}

	static final void method14591(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	public static void method14592(boolean bool, int i) {
		Class529_Sub1.aBool10786 = bool;
	}

	public static int method14593(int i) {
		if (0 == -728202161 * Class444.anInt4924) {
			Class46.aClass46_467.method1230(new Class443("jaclib"), 1806165838);
			if (Class46.aClass46_467.method1219(-2000702816).method45((byte) 84) != 100)
				return 1;
			if (!((Class443) Class46.aClass46_467.method1219(1415001243)).method7238((byte) 14) && !Class39.method1156((byte) 0)) {
				try {
					Class678.aclient8619.method8512(-565188992);
					Class55.method1315(986720326);
					Ping.init();
				} catch (Exception_Sub2 exception_sub2) {
					Class637.method10570(Class71.aClass71_782, exception_sub2.aString11351, (exception_sub2.anInt11350 * 1805693481), exception_sub2.getCause(), 1788238461);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			Class444.anInt4924 = -1701834065;
		}
		if (-728202161 * Class444.anInt4924 == 1) {
			Class444.aClass46Array4923 = Class46.method1222((byte) 101);
			Class46.aClass46_487.method1230(new Class447(Class616.aClass459_8091), -894439464);
			Class46.aClass46_466.method1230(new Class443("jaggl"), 1822704851);
			Class443 class443 = new Class443("jagdx");
			if (!Class234.aString2373.startsWith("win"))
				class443.method7239((byte) 1);
			Class46.aClass46_469.method1230(class443, -1729816724);
			Class46.aClass46_470.method1230(new Class443("sw3d"), -806545631);
			Class46.aClass46_471.method1230(new Class443("hw3d"), -580786816);
			Class46.aClass46_472.method1230(new Class447(Class478.aClass459_5395), -1484188387);
			Class46.aClass46_489.method1230(new Class447(InputStream_Sub1.aClass459_10985), 1575635161);
			Class46.aClass46_494.method1230(new Class447(Class411.aClass459_4370), -1539908192);
			Class46.aClass46_475.method1230(new Class447(Class636.aClass459_8304), 1755309497);
			Class46.aClass46_473.method1230(new Class447(Class102.aClass459_1237), 18571722);
			Class46.aClass46_477.method1230(new Class447(Class527_Sub1.aClass459_10336), 1823658158);
			Class46.aClass46_476.method1230(new Class447(Class508.aClass459_6924), 1502258251);
			Class46.aClass46_479.method1230(new Class447(Class217.aClass459_2283), 2133927526);
			Class46.aClass46_484.method1230(new Class447(Class24.aClass459_234), 1813716414);
			Class46.aClass46_486.method1230(new Class447(Class675.aClass459_8591), -35237770);
			Class46.aClass46_483.method1230(new Class447(Class388.aClass459_3990), -1360456209);
			Class46.aClass46_478.method1230(new Class447(Class467.aClass459_5319), -1099446473);
			Class46.aClass46_468.method1230(new Class447(Class456_Sub1.aClass459_10324), -1342946767);
			Class46.aClass46_485.method1230(new Class447(Class684.aClass459_8654), -621141877);
			Class46.aClass46_482.method1230(new Class447(Class87.aClass459_827), -1630078804);
			Class46.aClass46_481.method1230(new Class430(Class31.aClass459_266, "huffman"), -736740431);
			Class46.aClass46_488.method1230(new Class447(Class216.aClass459_2280), 1874544809);
			Class46.aClass46_480.method1230(new Class447(Class293_Sub1.aClass459_10041), -662480361);
			Class46.aClass46_490.method1230(new Class447(Class272.aClass459_3136), 2137475053);
			Class46.aClass46_491.method1230(new Class429((Class596.aClass459_7845), 0), -954731226);
			for (int i_203_ = 0; i_203_ < Class444.aClass46Array4923.length; i_203_++) {
				if (Class444.aClass46Array4923[i_203_].method1219(1603837421) == null)
					throw new RuntimeException();
			}
			int i_204_ = 0;
			Class46[] class46s = Class444.aClass46Array4923;
			for (int i_205_ = 0; i_205_ < class46s.length; i_205_++) {
				Class46 class46 = class46s[i_205_];
				int i_206_ = class46.method1220((short) -26300);
				int i_207_ = class46.method1219(1134239323).method45((byte) 38);
				i_204_ += i_207_ * i_206_ / 100;
			}
			Class444.anInt4925 = 323760781 * i_204_;
			Class444.anInt4924 = 891299166;
		}
		if (Class444.aClass46Array4923 == null)
			return 100;
		int i_208_ = 0;
		int i_209_ = 0;
		boolean bool = true;
		Class46[] class46s = Class444.aClass46Array4923;
		for (int i_210_ = 0; i_210_ < class46s.length; i_210_++) {
			Class46 class46 = class46s[i_210_];
			int i_211_ = class46.method1220((short) 11979);
			int i_212_ = class46.method1219(722571332).method45((byte) 109);
			if (i_212_ < 100)
				bool = false;
			i_208_ += i_211_;
			i_209_ += i_211_ * i_212_ / 100;
		}
		if (bool)
			Class444.aClass46Array4923 = null;
		i_209_ -= Class444.anInt4925 * 1340596293;
		i_208_ -= Class444.anInt4925 * 1340596293;
		int i_213_ = i_208_ > 0 ? 100 * i_209_ / i_208_ : 100;
		if (!bool && i_213_ > 99)
			i_213_ = 99;
		return i_213_;
	}

	static final void method14594(Class665 class665, int i) {
		int i_214_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_214_, 1243573205);
		Class240 class240 = Class183.aClass240Array2100[i_214_ >> 16];
		Class269.method5053(class243, class240, class665, (byte) 64);
	}

	static String method14595(RSByteBuffer class527_sub38, int i, int i_215_) {
		String string;
		try {
			int i_216_ = class527_sub38.readUnsignedSmart((byte) -49);
			if (i_216_ > i)
				i_216_ = i;
			byte[] is = new byte[i_216_];
			class527_sub38.anInt10689 += (Class263.aClass279_2867.method5169(class527_sub38.buffer, -441238943 * class527_sub38.anInt10689, is, 0, i_216_, -2033657253)) * 1474750881;
			String string_217_ = Class539.method9000(is, 0, i_216_, -2015478295);
			string = string_217_;
		} catch (Exception exception) {
			return "Cabbage";
		}
		return string;
	}
}
