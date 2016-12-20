/* Class174_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class174_Sub3 extends Class174 {
	int[] anIntArray9154;
	byte[][] aByteArrayArray9155;
	int[] anIntArray9156;
	Class180_Sub1 aClass180_Sub1_9157;
	int[] anIntArray9158;
	int[] anIntArray9159;
	int[] anIntArray9160;

	void method14618(byte[] is, int[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, Class142 class142, int i_10_, int i_11_) {
		Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
		int[] is_12_ = class142_sub1.anIntArray9002;
		int[] is_13_ = class142_sub1.anIntArray9003;
		int i_14_ = i_7_ - aClass180_Sub1_9157.anInt9383 * 1605202751;
		int i_15_ = i_8_;
		if (i_11_ > i_15_) {
			i_15_ = i_11_;
			i_2_ += aClass180_Sub1_9157.anInt9387 * -1173855569 * (i_11_ - i_8_);
			i_1_ += i_9_ * (i_11_ - i_8_);
		}
		int i_16_ = (is_12_.length + i_11_ < i_4_ + i_8_ ? is_12_.length + i_11_ : i_4_ + i_8_);
		for (int i_17_ = i_15_; i_17_ < i_16_; i_17_++) {
			int i_18_ = i_10_ + is_12_[i_17_ - i_11_];
			int i_19_ = is_13_[i_17_ - i_11_];
			int i_20_ = i_3_;
			if (i_14_ > i_18_) {
				int i_21_ = i_14_ - i_18_;
				if (i_21_ >= i_19_) {
					i_1_ += i_6_ + i_3_;
					i_2_ += i_5_ + i_3_;
					continue;
				}
				i_19_ -= i_21_;
			} else {
				int i_22_ = i_18_ - i_14_;
				if (i_22_ >= i_3_) {
					i_1_ += i_3_ + i_6_;
					i_2_ += i_3_ + i_5_;
					continue;
				}
				i_1_ += i_22_;
				i_20_ -= i_22_;
				i_2_ += i_22_;
			}
			int i_23_ = 0;
			if (i_20_ < i_19_)
				i_19_ = i_20_;
			else
				i_23_ = i_20_ - i_19_;
			for (int i_24_ = -i_19_; i_24_ < 0; i_24_++) {
				if (is[i_1_++] != 0)
					is_0_[i_2_++] = i;
				else
					i_2_++;
			}
			i_1_ += i_1_ + i_23_;
			i_2_ += i_5_ + i_23_;
		}
	}

	void method2758(char c, int i, int i_25_, int i_26_, boolean bool) {
		if (null != aClass180_Sub1_9157.anIntArray9386) {
			i += anIntArray9160[c];
			i_25_ += anIntArray9159[c];
			int i_27_ = anIntArray9154[c];
			int i_28_ = anIntArray9158[c];
			int i_29_ = -1173855569 * aClass180_Sub1_9157.anInt9387;
			int i_30_ = i + i_29_ * i_25_;
			int i_31_ = i_29_ - i_27_;
			int i_32_ = 0;
			int i_33_ = 0;
			if (i_25_ < aClass180_Sub1_9157.anInt9392 * -456655989) {
				int i_34_ = aClass180_Sub1_9157.anInt9392 * -456655989 - i_25_;
				i_28_ -= i_34_;
				i_25_ = -456655989 * aClass180_Sub1_9157.anInt9392;
				i_33_ += i_34_ * i_27_;
				i_30_ += i_34_ * i_29_;
			}
			if (i_25_ + i_28_ > -383695469 * aClass180_Sub1_9157.anInt9393)
				i_28_ -= (i_28_ + i_25_ - -383695469 * aClass180_Sub1_9157.anInt9393);
			if (i < 1605202751 * aClass180_Sub1_9157.anInt9383) {
				int i_35_ = 1605202751 * aClass180_Sub1_9157.anInt9383 - i;
				i_27_ -= i_35_;
				i = 1605202751 * aClass180_Sub1_9157.anInt9383;
				i_33_ += i_35_;
				i_30_ += i_35_;
				i_32_ += i_35_;
				i_31_ += i_35_;
			}
			if (i + i_27_ > aClass180_Sub1_9157.anInt9391 * 2014358275) {
				int i_36_ = i + i_27_ - 2014358275 * aClass180_Sub1_9157.anInt9391;
				i_27_ -= i_36_;
				i_32_ += i_36_;
				i_31_ += i_36_;
			}
			if (i_27_ > 0 && i_28_ > 0) {
				if (bool)
					method14620(aByteArrayArray9155[c], aClass180_Sub1_9157.anIntArray9386, i_26_, i_33_, i_30_, i_27_, i_28_, i_31_, i_32_);
				else
					method14622(aByteArrayArray9155[c], aClass180_Sub1_9157.anIntArray9386, anIntArray9156, i_33_, i_30_, i_27_, i_28_, i_31_, i_32_);
			}
		}
	}

	void method14619(byte[] is, int[] is_37_, int i, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, Class142 class142, int i_47_, int i_48_) {
		Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
		int[] is_49_ = class142_sub1.anIntArray9002;
		int[] is_50_ = class142_sub1.anIntArray9003;
		int i_51_ = i_44_ - aClass180_Sub1_9157.anInt9383 * 1605202751;
		int i_52_ = i_45_;
		if (i_48_ > i_52_) {
			i_52_ = i_48_;
			i_39_ += aClass180_Sub1_9157.anInt9387 * -1173855569 * (i_48_ - i_45_);
			i_38_ += i_46_ * (i_48_ - i_45_);
		}
		int i_53_ = (is_49_.length + i_48_ < i_41_ + i_45_ ? is_49_.length + i_48_ : i_41_ + i_45_);
		for (int i_54_ = i_52_; i_54_ < i_53_; i_54_++) {
			int i_55_ = i_47_ + is_49_[i_54_ - i_48_];
			int i_56_ = is_50_[i_54_ - i_48_];
			int i_57_ = i_40_;
			if (i_51_ > i_55_) {
				int i_58_ = i_51_ - i_55_;
				if (i_58_ >= i_56_) {
					i_38_ += i_43_ + i_40_;
					i_39_ += i_42_ + i_40_;
					continue;
				}
				i_56_ -= i_58_;
			} else {
				int i_59_ = i_55_ - i_51_;
				if (i_59_ >= i_40_) {
					i_38_ += i_40_ + i_43_;
					i_39_ += i_40_ + i_42_;
					continue;
				}
				i_38_ += i_59_;
				i_57_ -= i_59_;
				i_39_ += i_59_;
			}
			int i_60_ = 0;
			if (i_57_ < i_56_)
				i_56_ = i_57_;
			else
				i_60_ = i_57_ - i_56_;
			for (int i_61_ = -i_56_; i_61_ < 0; i_61_++) {
				if (is[i_38_++] != 0)
					is_37_[i_39_++] = i;
				else
					i_39_++;
			}
			i_38_ += i_38_ + i_60_;
			i_39_ += i_42_ + i_60_;
		}
	}

	void method14620(byte[] is, int[] is_62_, int i, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_) {
		int i_69_ = -(i_65_ >> 2);
		i_65_ = -(i_65_ & 0x3);
		for (int i_70_ = -i_66_; i_70_ < 0; i_70_++) {
			for (int i_71_ = i_69_; i_71_ < 0; i_71_++) {
				if (is[i_63_++] != 0)
					is_62_[i_64_++] = i;
				else
					i_64_++;
				if (is[i_63_++] != 0)
					is_62_[i_64_++] = i;
				else
					i_64_++;
				if (is[i_63_++] != 0)
					is_62_[i_64_++] = i;
				else
					i_64_++;
				if (is[i_63_++] != 0)
					is_62_[i_64_++] = i;
				else
					i_64_++;
			}
			for (int i_72_ = i_65_; i_72_ < 0; i_72_++) {
				if (is[i_63_++] != 0)
					is_62_[i_64_++] = i;
				else
					i_64_++;
			}
			i_64_ += i_67_;
			i_63_ += i_68_;
		}
	}

	void method2759(char c, int i, int i_73_, int i_74_, boolean bool, Class142 class142, int i_75_, int i_76_) {
		if (null != aClass180_Sub1_9157.anIntArray9386) {
			if (null == class142)
				method2758(c, i, i_73_, i_74_, bool);
			else {
				i += anIntArray9160[c];
				i_73_ += anIntArray9159[c];
				int i_77_ = anIntArray9154[c];
				int i_78_ = anIntArray9158[c];
				int i_79_ = -1173855569 * aClass180_Sub1_9157.anInt9387;
				int i_80_ = i + i_73_ * i_79_;
				int i_81_ = i_79_ - i_77_;
				int i_82_ = 0;
				int i_83_ = 0;
				if (i_73_ < -456655989 * aClass180_Sub1_9157.anInt9392) {
					int i_84_ = aClass180_Sub1_9157.anInt9392 * -456655989 - i_73_;
					i_78_ -= i_84_;
					i_73_ = -456655989 * aClass180_Sub1_9157.anInt9392;
					i_83_ += i_84_ * i_77_;
					i_80_ += i_84_ * i_79_;
				}
				if (i_78_ + i_73_ > -383695469 * aClass180_Sub1_9157.anInt9393)
					i_78_ -= (i_73_ + i_78_ - -383695469 * aClass180_Sub1_9157.anInt9393);
				if (i < aClass180_Sub1_9157.anInt9383 * 1605202751) {
					int i_85_ = aClass180_Sub1_9157.anInt9383 * 1605202751 - i;
					i_77_ -= i_85_;
					i = 1605202751 * aClass180_Sub1_9157.anInt9383;
					i_83_ += i_85_;
					i_80_ += i_85_;
					i_82_ += i_85_;
					i_81_ += i_85_;
				}
				if (i + i_77_ > 2014358275 * aClass180_Sub1_9157.anInt9391) {
					int i_86_ = (i_77_ + i - aClass180_Sub1_9157.anInt9391 * 2014358275);
					i_77_ -= i_86_;
					i_82_ += i_86_;
					i_81_ += i_86_;
				}
				if (i_77_ > 0 && i_78_ > 0) {
					if (bool)
						method14619(aByteArrayArray9155[c], aClass180_Sub1_9157.anIntArray9386, i_74_, i_83_, i_80_, i_77_, i_78_, i_81_, i_82_, i, i_73_, anIntArray9154[c], class142, i_75_, i_76_);
					else
						method14621(aByteArrayArray9155[c], aClass180_Sub1_9157.anIntArray9386, anIntArray9156, i_74_, i_83_, i_80_, i_77_, i_78_, i_81_, i_82_, i, i_73_, anIntArray9154[c], class142, i_75_, i_76_);
				}
			}
		}
	}

	void method14621(byte[] is, int[] is_87_, int[] is_88_, int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_, Class142 class142, int i_98_, int i_99_) {
		Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
		int[] is_100_ = class142_sub1.anIntArray9002;
		int[] is_101_ = class142_sub1.anIntArray9003;
		int i_102_ = i_95_ - 1605202751 * aClass180_Sub1_9157.anInt9383;
		int i_103_ = i_96_;
		if (i_99_ > i_103_) {
			i_103_ = i_99_;
			i_90_ += (i_99_ - i_96_) * (aClass180_Sub1_9157.anInt9387 * -1173855569);
			i_89_ += (i_99_ - i_96_) * i_97_;
		}
		int i_104_ = (is_100_.length + i_99_ < i_92_ + i_96_ ? i_99_ + is_100_.length : i_96_ + i_92_);
		boolean bool = false;
		for (int i_105_ = i_103_; i_105_ < i_104_; i_105_++) {
			int i_106_ = i_98_ + is_100_[i_105_ - i_99_];
			int i_107_ = is_101_[i_105_ - i_99_];
			int i_108_ = i_91_;
			if (i_102_ > i_106_) {
				int i_109_ = i_102_ - i_106_;
				if (i_109_ >= i_107_) {
					i_89_ += i_94_ + i_91_;
					i_90_ += i_93_ + i_91_;
					continue;
				}
				i_107_ -= i_109_;
			} else {
				int i_110_ = i_106_ - i_102_;
				if (i_110_ >= i_91_) {
					i_89_ += i_94_ + i_91_;
					i_90_ += i_93_ + i_91_;
					continue;
				}
				i_89_ += i_110_;
				i_108_ -= i_110_;
				i_90_ += i_110_;
			}
			int i_111_ = 0;
			if (i_108_ < i_107_)
				i_107_ = i_108_;
			else
				i_111_ = i_108_ - i_107_;
			for (int i_112_ = -i_107_; i_112_ < 0; i_112_++) {
				int i_113_;
				if ((i_113_ = is[i_89_++]) != 0)
					is_87_[i_90_++] = is_88_[i_113_ & 0xff];
				else
					i_90_++;
			}
			i_89_ += i_111_ + i_94_;
			i_90_ += i_93_ + i_111_;
		}
	}

	Class174_Sub3(Class180_Sub1 class180_sub1, Class22 class22, Class185_Sub2[] class185_sub2s, int[] is, int[] is_114_) {
		super(class180_sub1, class22);
		aClass180_Sub1_9157 = class180_sub1;
		aClass180_Sub1_9157 = class180_sub1;
		anIntArray9154 = is;
		anIntArray9158 = is_114_;
		aByteArrayArray9155 = new byte[class185_sub2s.length][];
		anIntArray9159 = new int[class185_sub2s.length];
		anIntArray9160 = new int[class185_sub2s.length];
		for (int i = 0; i < class185_sub2s.length; i++) {
			aByteArrayArray9155[i] = class185_sub2s[i].aByteArray9371;
			anIntArray9159[i] = class185_sub2s[i].anInt9378;
			anIntArray9160[i] = class185_sub2s[i].anInt9375;
		}
		anIntArray9156 = class185_sub2s[0].anIntArray9377;
	}

	void method2760(char c, int i, int i_115_, int i_116_, boolean bool) {
		if (null != aClass180_Sub1_9157.anIntArray9386) {
			i += anIntArray9160[c];
			i_115_ += anIntArray9159[c];
			int i_117_ = anIntArray9154[c];
			int i_118_ = anIntArray9158[c];
			int i_119_ = -1173855569 * aClass180_Sub1_9157.anInt9387;
			int i_120_ = i + i_119_ * i_115_;
			int i_121_ = i_119_ - i_117_;
			int i_122_ = 0;
			int i_123_ = 0;
			if (i_115_ < aClass180_Sub1_9157.anInt9392 * -456655989) {
				int i_124_ = aClass180_Sub1_9157.anInt9392 * -456655989 - i_115_;
				i_118_ -= i_124_;
				i_115_ = -456655989 * aClass180_Sub1_9157.anInt9392;
				i_123_ += i_124_ * i_117_;
				i_120_ += i_124_ * i_119_;
			}
			if (i_115_ + i_118_ > -383695469 * aClass180_Sub1_9157.anInt9393)
				i_118_ -= (i_118_ + i_115_ - -383695469 * aClass180_Sub1_9157.anInt9393);
			if (i < 1605202751 * aClass180_Sub1_9157.anInt9383) {
				int i_125_ = 1605202751 * aClass180_Sub1_9157.anInt9383 - i;
				i_117_ -= i_125_;
				i = 1605202751 * aClass180_Sub1_9157.anInt9383;
				i_123_ += i_125_;
				i_120_ += i_125_;
				i_122_ += i_125_;
				i_121_ += i_125_;
			}
			if (i + i_117_ > aClass180_Sub1_9157.anInt9391 * 2014358275) {
				int i_126_ = i + i_117_ - 2014358275 * aClass180_Sub1_9157.anInt9391;
				i_117_ -= i_126_;
				i_122_ += i_126_;
				i_121_ += i_126_;
			}
			if (i_117_ > 0 && i_118_ > 0) {
				if (bool)
					method14620(aByteArrayArray9155[c], aClass180_Sub1_9157.anIntArray9386, i_116_, i_123_, i_120_, i_117_, i_118_, i_121_, i_122_);
				else
					method14622(aByteArrayArray9155[c], aClass180_Sub1_9157.anIntArray9386, anIntArray9156, i_123_, i_120_, i_117_, i_118_, i_121_, i_122_);
			}
		}
	}

	void method2761(char c, int i, int i_127_, int i_128_, boolean bool) {
		if (null != aClass180_Sub1_9157.anIntArray9386) {
			i += anIntArray9160[c];
			i_127_ += anIntArray9159[c];
			int i_129_ = anIntArray9154[c];
			int i_130_ = anIntArray9158[c];
			int i_131_ = -1173855569 * aClass180_Sub1_9157.anInt9387;
			int i_132_ = i + i_131_ * i_127_;
			int i_133_ = i_131_ - i_129_;
			int i_134_ = 0;
			int i_135_ = 0;
			if (i_127_ < aClass180_Sub1_9157.anInt9392 * -456655989) {
				int i_136_ = aClass180_Sub1_9157.anInt9392 * -456655989 - i_127_;
				i_130_ -= i_136_;
				i_127_ = -456655989 * aClass180_Sub1_9157.anInt9392;
				i_135_ += i_136_ * i_129_;
				i_132_ += i_136_ * i_131_;
			}
			if (i_127_ + i_130_ > -383695469 * aClass180_Sub1_9157.anInt9393)
				i_130_ -= (i_130_ + i_127_ - -383695469 * aClass180_Sub1_9157.anInt9393);
			if (i < 1605202751 * aClass180_Sub1_9157.anInt9383) {
				int i_137_ = 1605202751 * aClass180_Sub1_9157.anInt9383 - i;
				i_129_ -= i_137_;
				i = 1605202751 * aClass180_Sub1_9157.anInt9383;
				i_135_ += i_137_;
				i_132_ += i_137_;
				i_134_ += i_137_;
				i_133_ += i_137_;
			}
			if (i + i_129_ > aClass180_Sub1_9157.anInt9391 * 2014358275) {
				int i_138_ = i + i_129_ - 2014358275 * aClass180_Sub1_9157.anInt9391;
				i_129_ -= i_138_;
				i_134_ += i_138_;
				i_133_ += i_138_;
			}
			if (i_129_ > 0 && i_130_ > 0) {
				if (bool)
					method14620(aByteArrayArray9155[c], aClass180_Sub1_9157.anIntArray9386, i_128_, i_135_, i_132_, i_129_, i_130_, i_133_, i_134_);
				else
					method14622(aByteArrayArray9155[c], aClass180_Sub1_9157.anIntArray9386, anIntArray9156, i_135_, i_132_, i_129_, i_130_, i_133_, i_134_);
			}
		}
	}

	void method14622(byte[] is, int[] is_139_, int[] is_140_, int i, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_) {
		int i_146_ = -(i_142_ >> 2);
		i_142_ = -(i_142_ & 0x3);
		boolean bool = false;
		for (int i_147_ = -i_143_; i_147_ < 0; i_147_++) {
			for (int i_148_ = i_146_; i_148_ < 0; i_148_++) {
				int i_149_;
				if ((i_149_ = is[i++]) != 0)
					is_139_[i_141_++] = is_140_[i_149_ & 0xff];
				else
					i_141_++;
				if ((i_149_ = is[i++]) != 0)
					is_139_[i_141_++] = is_140_[i_149_ & 0xff];
				else
					i_141_++;
				if ((i_149_ = is[i++]) != 0)
					is_139_[i_141_++] = is_140_[i_149_ & 0xff];
				else
					i_141_++;
				if ((i_149_ = is[i++]) != 0)
					is_139_[i_141_++] = is_140_[i_149_ & 0xff];
				else
					i_141_++;
			}
			for (int i_150_ = i_142_; i_150_ < 0; i_150_++) {
				int i_151_;
				if ((i_151_ = is[i++]) != 0)
					is_139_[i_141_++] = is_140_[i_151_ & 0xff];
				else
					i_141_++;
			}
			i_141_ += i_144_;
			i += i_145_;
		}
	}

	void method2763(char c, int i, int i_152_, int i_153_, boolean bool, Class142 class142, int i_154_, int i_155_) {
		if (null != aClass180_Sub1_9157.anIntArray9386) {
			if (null == class142)
				method2758(c, i, i_152_, i_153_, bool);
			else {
				i += anIntArray9160[c];
				i_152_ += anIntArray9159[c];
				int i_156_ = anIntArray9154[c];
				int i_157_ = anIntArray9158[c];
				int i_158_ = -1173855569 * aClass180_Sub1_9157.anInt9387;
				int i_159_ = i + i_152_ * i_158_;
				int i_160_ = i_158_ - i_156_;
				int i_161_ = 0;
				int i_162_ = 0;
				if (i_152_ < -456655989 * aClass180_Sub1_9157.anInt9392) {
					int i_163_ = aClass180_Sub1_9157.anInt9392 * -456655989 - i_152_;
					i_157_ -= i_163_;
					i_152_ = -456655989 * aClass180_Sub1_9157.anInt9392;
					i_162_ += i_163_ * i_156_;
					i_159_ += i_163_ * i_158_;
				}
				if (i_157_ + i_152_ > -383695469 * aClass180_Sub1_9157.anInt9393)
					i_157_ -= (i_152_ + i_157_ - -383695469 * aClass180_Sub1_9157.anInt9393);
				if (i < aClass180_Sub1_9157.anInt9383 * 1605202751) {
					int i_164_ = aClass180_Sub1_9157.anInt9383 * 1605202751 - i;
					i_156_ -= i_164_;
					i = 1605202751 * aClass180_Sub1_9157.anInt9383;
					i_162_ += i_164_;
					i_159_ += i_164_;
					i_161_ += i_164_;
					i_160_ += i_164_;
				}
				if (i + i_156_ > 2014358275 * aClass180_Sub1_9157.anInt9391) {
					int i_165_ = (i_156_ + i - aClass180_Sub1_9157.anInt9391 * 2014358275);
					i_156_ -= i_165_;
					i_161_ += i_165_;
					i_160_ += i_165_;
				}
				if (i_156_ > 0 && i_157_ > 0) {
					if (bool)
						method14619(aByteArrayArray9155[c], aClass180_Sub1_9157.anIntArray9386, i_153_, i_162_, i_159_, i_156_, i_157_, i_160_, i_161_, i, i_152_, anIntArray9154[c], class142, i_154_, i_155_);
					else
						method14621(aByteArrayArray9155[c], aClass180_Sub1_9157.anIntArray9386, anIntArray9156, i_153_, i_162_, i_159_, i_156_, i_157_, i_160_, i_161_, i, i_152_, anIntArray9154[c], class142, i_154_, i_155_);
				}
			}
		}
	}

	void method14623(byte[] is, int[] is_166_, int i, int i_167_, int i_168_, int i_169_, int i_170_, int i_171_, int i_172_) {
		int i_173_ = -(i_169_ >> 2);
		i_169_ = -(i_169_ & 0x3);
		for (int i_174_ = -i_170_; i_174_ < 0; i_174_++) {
			for (int i_175_ = i_173_; i_175_ < 0; i_175_++) {
				if (is[i_167_++] != 0)
					is_166_[i_168_++] = i;
				else
					i_168_++;
				if (is[i_167_++] != 0)
					is_166_[i_168_++] = i;
				else
					i_168_++;
				if (is[i_167_++] != 0)
					is_166_[i_168_++] = i;
				else
					i_168_++;
				if (is[i_167_++] != 0)
					is_166_[i_168_++] = i;
				else
					i_168_++;
			}
			for (int i_176_ = i_169_; i_176_ < 0; i_176_++) {
				if (is[i_167_++] != 0)
					is_166_[i_168_++] = i;
				else
					i_168_++;
			}
			i_168_ += i_171_;
			i_167_ += i_172_;
		}
	}

	void method14624(byte[] is, int[] is_177_, int i, int i_178_, int i_179_, int i_180_, int i_181_, int i_182_, int i_183_) {
		int i_184_ = -(i_180_ >> 2);
		i_180_ = -(i_180_ & 0x3);
		for (int i_185_ = -i_181_; i_185_ < 0; i_185_++) {
			for (int i_186_ = i_184_; i_186_ < 0; i_186_++) {
				if (is[i_178_++] != 0)
					is_177_[i_179_++] = i;
				else
					i_179_++;
				if (is[i_178_++] != 0)
					is_177_[i_179_++] = i;
				else
					i_179_++;
				if (is[i_178_++] != 0)
					is_177_[i_179_++] = i;
				else
					i_179_++;
				if (is[i_178_++] != 0)
					is_177_[i_179_++] = i;
				else
					i_179_++;
			}
			for (int i_187_ = i_180_; i_187_ < 0; i_187_++) {
				if (is[i_178_++] != 0)
					is_177_[i_179_++] = i;
				else
					i_179_++;
			}
			i_179_ += i_182_;
			i_178_ += i_183_;
		}
	}

	void method14625(byte[] is, int[] is_188_, int i, int i_189_, int i_190_, int i_191_, int i_192_, int i_193_, int i_194_, int i_195_, int i_196_, int i_197_, Class142 class142, int i_198_, int i_199_) {
		Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
		int[] is_200_ = class142_sub1.anIntArray9002;
		int[] is_201_ = class142_sub1.anIntArray9003;
		int i_202_ = i_195_ - aClass180_Sub1_9157.anInt9383 * 1605202751;
		int i_203_ = i_196_;
		if (i_199_ > i_203_) {
			i_203_ = i_199_;
			i_190_ += aClass180_Sub1_9157.anInt9387 * -1173855569 * (i_199_ - i_196_);
			i_189_ += i_197_ * (i_199_ - i_196_);
		}
		int i_204_ = (is_200_.length + i_199_ < i_192_ + i_196_ ? is_200_.length + i_199_ : i_192_ + i_196_);
		for (int i_205_ = i_203_; i_205_ < i_204_; i_205_++) {
			int i_206_ = i_198_ + is_200_[i_205_ - i_199_];
			int i_207_ = is_201_[i_205_ - i_199_];
			int i_208_ = i_191_;
			if (i_202_ > i_206_) {
				int i_209_ = i_202_ - i_206_;
				if (i_209_ >= i_207_) {
					i_189_ += i_194_ + i_191_;
					i_190_ += i_193_ + i_191_;
					continue;
				}
				i_207_ -= i_209_;
			} else {
				int i_210_ = i_206_ - i_202_;
				if (i_210_ >= i_191_) {
					i_189_ += i_191_ + i_194_;
					i_190_ += i_191_ + i_193_;
					continue;
				}
				i_189_ += i_210_;
				i_208_ -= i_210_;
				i_190_ += i_210_;
			}
			int i_211_ = 0;
			if (i_208_ < i_207_)
				i_207_ = i_208_;
			else
				i_211_ = i_208_ - i_207_;
			for (int i_212_ = -i_207_; i_212_ < 0; i_212_++) {
				if (is[i_189_++] != 0)
					is_188_[i_190_++] = i;
				else
					i_190_++;
			}
			i_189_ += i_189_ + i_211_;
			i_190_ += i_193_ + i_211_;
		}
	}

	void method14626(byte[] is, int[] is_213_, int[] is_214_, int i, int i_215_, int i_216_, int i_217_, int i_218_, int i_219_) {
		int i_220_ = -(i_216_ >> 2);
		i_216_ = -(i_216_ & 0x3);
		boolean bool = false;
		for (int i_221_ = -i_217_; i_221_ < 0; i_221_++) {
			for (int i_222_ = i_220_; i_222_ < 0; i_222_++) {
				int i_223_;
				if ((i_223_ = is[i++]) != 0)
					is_213_[i_215_++] = is_214_[i_223_ & 0xff];
				else
					i_215_++;
				if ((i_223_ = is[i++]) != 0)
					is_213_[i_215_++] = is_214_[i_223_ & 0xff];
				else
					i_215_++;
				if ((i_223_ = is[i++]) != 0)
					is_213_[i_215_++] = is_214_[i_223_ & 0xff];
				else
					i_215_++;
				if ((i_223_ = is[i++]) != 0)
					is_213_[i_215_++] = is_214_[i_223_ & 0xff];
				else
					i_215_++;
			}
			for (int i_224_ = i_216_; i_224_ < 0; i_224_++) {
				int i_225_;
				if ((i_225_ = is[i++]) != 0)
					is_213_[i_215_++] = is_214_[i_225_ & 0xff];
				else
					i_215_++;
			}
			i_215_ += i_218_;
			i += i_219_;
		}
	}

	void method2762(char c, int i, int i_226_, int i_227_, boolean bool, Class142 class142, int i_228_, int i_229_) {
		if (null != aClass180_Sub1_9157.anIntArray9386) {
			if (null == class142)
				method2758(c, i, i_226_, i_227_, bool);
			else {
				i += anIntArray9160[c];
				i_226_ += anIntArray9159[c];
				int i_230_ = anIntArray9154[c];
				int i_231_ = anIntArray9158[c];
				int i_232_ = -1173855569 * aClass180_Sub1_9157.anInt9387;
				int i_233_ = i + i_226_ * i_232_;
				int i_234_ = i_232_ - i_230_;
				int i_235_ = 0;
				int i_236_ = 0;
				if (i_226_ < -456655989 * aClass180_Sub1_9157.anInt9392) {
					int i_237_ = aClass180_Sub1_9157.anInt9392 * -456655989 - i_226_;
					i_231_ -= i_237_;
					i_226_ = -456655989 * aClass180_Sub1_9157.anInt9392;
					i_236_ += i_237_ * i_230_;
					i_233_ += i_237_ * i_232_;
				}
				if (i_231_ + i_226_ > -383695469 * aClass180_Sub1_9157.anInt9393)
					i_231_ -= (i_226_ + i_231_ - -383695469 * aClass180_Sub1_9157.anInt9393);
				if (i < aClass180_Sub1_9157.anInt9383 * 1605202751) {
					int i_238_ = aClass180_Sub1_9157.anInt9383 * 1605202751 - i;
					i_230_ -= i_238_;
					i = 1605202751 * aClass180_Sub1_9157.anInt9383;
					i_236_ += i_238_;
					i_233_ += i_238_;
					i_235_ += i_238_;
					i_234_ += i_238_;
				}
				if (i + i_230_ > 2014358275 * aClass180_Sub1_9157.anInt9391) {
					int i_239_ = (i_230_ + i - aClass180_Sub1_9157.anInt9391 * 2014358275);
					i_230_ -= i_239_;
					i_235_ += i_239_;
					i_234_ += i_239_;
				}
				if (i_230_ > 0 && i_231_ > 0) {
					if (bool)
						method14619(aByteArrayArray9155[c], aClass180_Sub1_9157.anIntArray9386, i_227_, i_236_, i_233_, i_230_, i_231_, i_234_, i_235_, i, i_226_, anIntArray9154[c], class142, i_228_, i_229_);
					else
						method14621(aByteArrayArray9155[c], aClass180_Sub1_9157.anIntArray9386, anIntArray9156, i_227_, i_236_, i_233_, i_230_, i_231_, i_234_, i_235_, i, i_226_, anIntArray9154[c], class142, i_228_, i_229_);
				}
			}
		}
	}

	void method14627(byte[] is, int[] is_240_, int[] is_241_, int i, int i_242_, int i_243_, int i_244_, int i_245_, int i_246_, int i_247_, int i_248_, int i_249_, int i_250_, Class142 class142, int i_251_, int i_252_) {
		Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
		int[] is_253_ = class142_sub1.anIntArray9002;
		int[] is_254_ = class142_sub1.anIntArray9003;
		int i_255_ = i_248_ - 1605202751 * aClass180_Sub1_9157.anInt9383;
		int i_256_ = i_249_;
		if (i_252_ > i_256_) {
			i_256_ = i_252_;
			i_243_ += (i_252_ - i_249_) * (aClass180_Sub1_9157.anInt9387 * -1173855569);
			i_242_ += (i_252_ - i_249_) * i_250_;
		}
		int i_257_ = (is_253_.length + i_252_ < i_245_ + i_249_ ? i_252_ + is_253_.length : i_249_ + i_245_);
		boolean bool = false;
		for (int i_258_ = i_256_; i_258_ < i_257_; i_258_++) {
			int i_259_ = i_251_ + is_253_[i_258_ - i_252_];
			int i_260_ = is_254_[i_258_ - i_252_];
			int i_261_ = i_244_;
			if (i_255_ > i_259_) {
				int i_262_ = i_255_ - i_259_;
				if (i_262_ >= i_260_) {
					i_242_ += i_247_ + i_244_;
					i_243_ += i_246_ + i_244_;
					continue;
				}
				i_260_ -= i_262_;
			} else {
				int i_263_ = i_259_ - i_255_;
				if (i_263_ >= i_244_) {
					i_242_ += i_247_ + i_244_;
					i_243_ += i_246_ + i_244_;
					continue;
				}
				i_242_ += i_263_;
				i_261_ -= i_263_;
				i_243_ += i_263_;
			}
			int i_264_ = 0;
			if (i_261_ < i_260_)
				i_260_ = i_261_;
			else
				i_264_ = i_261_ - i_260_;
			for (int i_265_ = -i_260_; i_265_ < 0; i_265_++) {
				int i_266_;
				if ((i_266_ = is[i_242_++]) != 0)
					is_240_[i_243_++] = is_241_[i_266_ & 0xff];
				else
					i_243_++;
			}
			i_242_ += i_264_ + i_247_;
			i_243_ += i_246_ + i_264_;
		}
	}

	void method14628(byte[] is, int[] is_267_, int i, int i_268_, int i_269_, int i_270_, int i_271_, int i_272_, int i_273_) {
		int i_274_ = -(i_270_ >> 2);
		i_270_ = -(i_270_ & 0x3);
		for (int i_275_ = -i_271_; i_275_ < 0; i_275_++) {
			for (int i_276_ = i_274_; i_276_ < 0; i_276_++) {
				if (is[i_268_++] != 0)
					is_267_[i_269_++] = i;
				else
					i_269_++;
				if (is[i_268_++] != 0)
					is_267_[i_269_++] = i;
				else
					i_269_++;
				if (is[i_268_++] != 0)
					is_267_[i_269_++] = i;
				else
					i_269_++;
				if (is[i_268_++] != 0)
					is_267_[i_269_++] = i;
				else
					i_269_++;
			}
			for (int i_277_ = i_270_; i_277_ < 0; i_277_++) {
				if (is[i_268_++] != 0)
					is_267_[i_269_++] = i;
				else
					i_269_++;
			}
			i_269_ += i_272_;
			i_268_ += i_273_;
		}
	}

	static final void method14629(Class665 class665, int i) {
		class665.anInt8526 -= 307142523;
		int i_278_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_279_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		int i_280_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 2];
		long l = Class205.method3831(0, 0, 12, i_278_, i_279_, i_280_, 1349932309);
		int i_281_ = Class220.method4068(l);
		if (i_280_ < 1970)
			i_281_--;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_281_;
	}
}
