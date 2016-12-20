/* Class174_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class174_Sub4 extends Class174 {
	byte[][] aByteArrayArray9869;
	int[] anIntArray9870;
	int[] anIntArray9871;
	int[] anIntArray9872;
	Class180_Sub1 aClass180_Sub1_9873;
	int[] anIntArray9874;

	void method15593(byte[] is, int[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, Class142 class142, int i_10_, int i_11_) {
		Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
		int[] is_12_ = class142_sub1.anIntArray9002;
		int[] is_13_ = class142_sub1.anIntArray9003;
		int i_14_ = i_8_;
		if (i_11_ > i_14_) {
			i_14_ = i_11_;
			i_2_ += (i_11_ - i_8_) * (-1173855569 * aClass180_Sub1_9873.anInt9387);
			i_1_ += i_9_ * (i_11_ - i_8_);
		}
		int i_15_ = (is_12_.length + i_11_ < i_4_ + i_8_ ? is_12_.length + i_11_ : i_8_ + i_4_);
		for (int i_16_ = i_14_; i_16_ < i_15_; i_16_++) {
			int i_17_ = i_10_ + is_12_[i_16_ - i_11_];
			int i_18_ = is_13_[i_16_ - i_11_];
			int i_19_ = i_3_;
			if (i_7_ > i_17_) {
				int i_20_ = i_7_ - i_17_;
				if (i_20_ >= i_18_) {
					i_1_ += i_6_ + i_3_;
					i_2_ += i_3_ + i_5_;
					continue;
				}
				i_18_ -= i_20_;
			} else {
				int i_21_ = i_17_ - i_7_;
				if (i_21_ >= i_3_) {
					i_1_ += i_3_ + i_6_;
					i_2_ += i_3_ + i_5_;
					continue;
				}
				i_1_ += i_21_;
				i_19_ -= i_21_;
				i_2_ += i_21_;
			}
			int i_22_ = 0;
			if (i_19_ < i_18_)
				i_18_ = i_19_;
			else
				i_22_ = i_19_ - i_18_;
			for (int i_23_ = 0; i_23_ < i_18_; i_23_++) {
				if (is[i_1_++] != 0)
					is_0_[i_2_++] = i;
				else
					i_2_++;
			}
			i_1_ += i_22_ + i_6_;
			i_2_ += i_5_ + i_22_;
		}
	}

	Class174_Sub4(Class180_Sub1 class180_sub1, Class22 class22, Class185_Sub1[] class185_sub1s, int[] is, int[] is_24_) {
		super(class180_sub1, class22);
		aClass180_Sub1_9873 = class180_sub1;
		anIntArray9871 = is;
		anIntArray9872 = is_24_;
		aByteArrayArray9869 = new byte[class185_sub1s.length][];
		anIntArray9870 = new int[class185_sub1s.length];
		anIntArray9874 = new int[class185_sub1s.length];
		for (int i = 0; i < class185_sub1s.length; i++) {
			int[] is_25_ = class185_sub1s[i].method3584(false);
			byte[] is_26_ = aByteArrayArray9869[i] = new byte[is_25_.length];
			for (int i_27_ = 0; i_27_ < is_25_.length; i_27_++) {
				int i_28_ = is_25_[i_27_];
				byte i_29_ = (byte) ((i_28_ & 0xff) + ((i_28_ >> 16 & 0xff) * 3 + (i_28_ >> 8 & 0xff) * 4) >> 3);
				is_26_[i_27_] = i_29_;
			}
			anIntArray9870[i] = class185_sub1s[i].method3611();
			anIntArray9874[i] = class185_sub1s[i].method3634();
		}
	}

	void method2758(char c, int i, int i_30_, int i_31_, boolean bool) {
		if (aClass180_Sub1_9873.anIntArray9386 != null) {
			i += anIntArray9874[c];
			i_30_ += anIntArray9870[c];
			int i_32_ = anIntArray9871[c];
			int i_33_ = anIntArray9872[c];
			int i_34_ = aClass180_Sub1_9873.anInt9387 * -1173855569;
			int i_35_ = i + i_34_ * i_30_;
			int i_36_ = i_34_ - i_32_;
			int i_37_ = 0;
			int i_38_ = 0;
			if (i_30_ < -456655989 * aClass180_Sub1_9873.anInt9392) {
				int i_39_ = aClass180_Sub1_9873.anInt9392 * -456655989 - i_30_;
				i_33_ -= i_39_;
				i_30_ = aClass180_Sub1_9873.anInt9392 * -456655989;
				i_38_ += i_39_ * i_32_;
				i_35_ += i_39_ * i_34_;
			}
			if (i_33_ + i_30_ > aClass180_Sub1_9873.anInt9393 * -383695469)
				i_33_ -= (i_33_ + i_30_ - -383695469 * aClass180_Sub1_9873.anInt9393);
			if (i < aClass180_Sub1_9873.anInt9383 * 1605202751) {
				int i_40_ = aClass180_Sub1_9873.anInt9383 * 1605202751 - i;
				i_32_ -= i_40_;
				i = aClass180_Sub1_9873.anInt9383 * 1605202751;
				i_38_ += i_40_;
				i_35_ += i_40_;
				i_37_ += i_40_;
				i_36_ += i_40_;
			}
			if (i + i_32_ > aClass180_Sub1_9873.anInt9391 * 2014358275) {
				int i_41_ = i_32_ + i - aClass180_Sub1_9873.anInt9391 * 2014358275;
				i_32_ -= i_41_;
				i_37_ += i_41_;
				i_36_ += i_41_;
			}
			if (i_32_ > 0 && i_33_ > 0) {
				if ((i_31_ & ~0xffffff) == -16777216)
					method15594(aByteArrayArray9869[c], aClass180_Sub1_9873.anIntArray9386, i_31_, i_38_, i_35_, i_32_, i_33_, i_36_, i_37_);
				else if ((i_31_ & ~0xffffff) != 0)
					method15595(aByteArrayArray9869[c], aClass180_Sub1_9873.anIntArray9386, i_31_, i_38_, i_35_, i_32_, i_33_, i_36_, i_37_);
			}
		}
	}

	void method15594(byte[] is, int[] is_42_, int i, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_) {
		int i_49_ = -(i_45_ >> 2);
		i_45_ = -(i_45_ & 0x3);
		for (int i_50_ = -i_46_; i_50_ < 0; i_50_++) {
			for (int i_51_ = i_49_; i_51_ < 0; i_51_++) {
				if (is[i_43_++] != 0)
					is_42_[i_44_++] = i;
				else
					i_44_++;
				if (is[i_43_++] != 0)
					is_42_[i_44_++] = i;
				else
					i_44_++;
				if (is[i_43_++] != 0)
					is_42_[i_44_++] = i;
				else
					i_44_++;
				if (is[i_43_++] != 0)
					is_42_[i_44_++] = i;
				else
					i_44_++;
			}
			for (int i_52_ = i_45_; i_52_ < 0; i_52_++) {
				if (is[i_43_++] != 0)
					is_42_[i_44_++] = i;
				else
					i_44_++;
			}
			i_44_ += i_47_;
			i_43_ += i_48_;
		}
	}

	void method2762(char c, int i, int i_53_, int i_54_, boolean bool, Class142 class142, int i_55_, int i_56_) {
		if (null != aClass180_Sub1_9873.anIntArray9386) {
			if (class142 == null)
				method2758(c, i, i_53_, i_54_, bool);
			else {
				i += anIntArray9874[c];
				i_53_ += anIntArray9870[c];
				int i_57_ = anIntArray9871[c];
				int i_58_ = anIntArray9872[c];
				int i_59_ = -1173855569 * aClass180_Sub1_9873.anInt9387;
				int i_60_ = i + i_53_ * i_59_;
				int i_61_ = i_59_ - i_57_;
				int i_62_ = 0;
				int i_63_ = 0;
				if (i_53_ < aClass180_Sub1_9873.anInt9392 * -456655989) {
					int i_64_ = -456655989 * aClass180_Sub1_9873.anInt9392 - i_53_;
					i_58_ -= i_64_;
					i_53_ = -456655989 * aClass180_Sub1_9873.anInt9392;
					i_63_ += i_64_ * i_57_;
					i_60_ += i_64_ * i_59_;
				}
				if (i_53_ + i_58_ > aClass180_Sub1_9873.anInt9393 * -383695469)
					i_58_ -= (i_58_ + i_53_ - -383695469 * aClass180_Sub1_9873.anInt9393);
				if (i < 1605202751 * aClass180_Sub1_9873.anInt9383) {
					int i_65_ = 1605202751 * aClass180_Sub1_9873.anInt9383 - i;
					i_57_ -= i_65_;
					i = aClass180_Sub1_9873.anInt9383 * 1605202751;
					i_63_ += i_65_;
					i_60_ += i_65_;
					i_62_ += i_65_;
					i_61_ += i_65_;
				}
				if (i + i_57_ > 2014358275 * aClass180_Sub1_9873.anInt9391) {
					int i_66_ = (i + i_57_ - aClass180_Sub1_9873.anInt9391 * 2014358275);
					i_57_ -= i_66_;
					i_62_ += i_66_;
					i_61_ += i_66_;
				}
				if (i_57_ > 0 && i_58_ > 0) {
					if ((i_54_ & ~0xffffff) == -16777216)
						method15604(aByteArrayArray9869[c], aClass180_Sub1_9873.anIntArray9386, i_54_, i_63_, i_60_, i_57_, i_58_, i_61_, i_62_, i, i_53_, anIntArray9871[c], class142, i_55_, i_56_);
					else
						method15596(aByteArrayArray9869[c], aClass180_Sub1_9873.anIntArray9386, i_54_, i_63_, i_60_, i_57_, i_58_, i_61_, i_62_, i, i_53_, anIntArray9871[c], class142, i_55_, i_56_);
				}
			}
		}
	}

	void method2759(char c, int i, int i_67_, int i_68_, boolean bool, Class142 class142, int i_69_, int i_70_) {
		if (null != aClass180_Sub1_9873.anIntArray9386) {
			if (class142 == null)
				method2758(c, i, i_67_, i_68_, bool);
			else {
				i += anIntArray9874[c];
				i_67_ += anIntArray9870[c];
				int i_71_ = anIntArray9871[c];
				int i_72_ = anIntArray9872[c];
				int i_73_ = -1173855569 * aClass180_Sub1_9873.anInt9387;
				int i_74_ = i + i_67_ * i_73_;
				int i_75_ = i_73_ - i_71_;
				int i_76_ = 0;
				int i_77_ = 0;
				if (i_67_ < aClass180_Sub1_9873.anInt9392 * -456655989) {
					int i_78_ = -456655989 * aClass180_Sub1_9873.anInt9392 - i_67_;
					i_72_ -= i_78_;
					i_67_ = -456655989 * aClass180_Sub1_9873.anInt9392;
					i_77_ += i_78_ * i_71_;
					i_74_ += i_78_ * i_73_;
				}
				if (i_67_ + i_72_ > aClass180_Sub1_9873.anInt9393 * -383695469)
					i_72_ -= (i_72_ + i_67_ - -383695469 * aClass180_Sub1_9873.anInt9393);
				if (i < 1605202751 * aClass180_Sub1_9873.anInt9383) {
					int i_79_ = 1605202751 * aClass180_Sub1_9873.anInt9383 - i;
					i_71_ -= i_79_;
					i = aClass180_Sub1_9873.anInt9383 * 1605202751;
					i_77_ += i_79_;
					i_74_ += i_79_;
					i_76_ += i_79_;
					i_75_ += i_79_;
				}
				if (i + i_71_ > 2014358275 * aClass180_Sub1_9873.anInt9391) {
					int i_80_ = (i + i_71_ - aClass180_Sub1_9873.anInt9391 * 2014358275);
					i_71_ -= i_80_;
					i_76_ += i_80_;
					i_75_ += i_80_;
				}
				if (i_71_ > 0 && i_72_ > 0) {
					if ((i_68_ & ~0xffffff) == -16777216)
						method15604(aByteArrayArray9869[c], aClass180_Sub1_9873.anIntArray9386, i_68_, i_77_, i_74_, i_71_, i_72_, i_75_, i_76_, i, i_67_, anIntArray9871[c], class142, i_69_, i_70_);
					else
						method15596(aByteArrayArray9869[c], aClass180_Sub1_9873.anIntArray9386, i_68_, i_77_, i_74_, i_71_, i_72_, i_75_, i_76_, i, i_67_, anIntArray9871[c], class142, i_69_, i_70_);
				}
			}
		}
	}

	void method15595(byte[] is, int[] is_81_, int i, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_) {
		int i_88_ = i >>> 24;
		int i_89_ = 255 - i_88_;
		for (int i_90_ = -i_85_; i_90_ < 0; i_90_++) {
			for (int i_91_ = -i_84_; i_91_ < 0; i_91_++) {
				if (is[i_82_++] != 0) {
					int i_92_ = (((i_88_ * (i & 0xff00) & 0xff0000) + ((i & 0xff00ff) * i_88_ & ~0xff00ff)) >> 8);
					int i_93_ = is_81_[i_83_];
					is_81_[i_83_++] = i_92_ + ((((i_93_ & 0xff00ff) * i_89_ & ~0xff00ff) + ((i_93_ & 0xff00) * i_89_ & 0xff0000)) >> 8);
				} else
					i_83_++;
			}
			i_83_ += i_86_;
			i_82_ += i_87_;
		}
	}

	void method15596(byte[] is, int[] is_94_, int i, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_, Class142 class142, int i_104_, int i_105_) {
		Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
		int[] is_106_ = class142_sub1.anIntArray9002;
		int[] is_107_ = class142_sub1.anIntArray9003;
		int i_108_ = i_101_ - 1605202751 * aClass180_Sub1_9873.anInt9383;
		int i_109_ = i_102_;
		if (i_105_ > i_109_) {
			i_109_ = i_105_;
			i_96_ += aClass180_Sub1_9873.anInt9387 * -1173855569 * (i_105_ - i_102_);
			i_95_ += (i_105_ - i_102_) * i_103_;
		}
		int i_110_ = (i_105_ + is_106_.length < i_98_ + i_102_ ? i_105_ + is_106_.length : i_102_ + i_98_);
		int i_111_ = i >>> 24;
		int i_112_ = 255 - i_111_;
		for (int i_113_ = i_109_; i_113_ < i_110_; i_113_++) {
			int i_114_ = is_106_[i_113_ - i_105_] + i_104_;
			int i_115_ = is_107_[i_113_ - i_105_];
			int i_116_ = i_97_;
			if (i_108_ > i_114_) {
				int i_117_ = i_108_ - i_114_;
				if (i_117_ >= i_115_) {
					i_95_ += i_100_ + i_97_;
					i_96_ += i_97_ + i_99_;
					continue;
				}
				i_115_ -= i_117_;
			} else {
				int i_118_ = i_114_ - i_108_;
				if (i_118_ >= i_97_) {
					i_95_ += i_100_ + i_97_;
					i_96_ += i_97_ + i_99_;
					continue;
				}
				i_95_ += i_118_;
				i_116_ -= i_118_;
				i_96_ += i_118_;
			}
			int i_119_ = 0;
			if (i_116_ < i_115_)
				i_115_ = i_116_;
			else
				i_119_ = i_116_ - i_115_;
			for (int i_120_ = -i_115_; i_120_ < 0; i_120_++) {
				if (is[i_95_++] != 0) {
					int i_121_ = (((i_111_ * (i & 0xff00) & 0xff0000) + (i_111_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					int i_122_ = is_94_[i_96_];
					is_94_[i_96_++] = i_121_ + (((i_112_ * (i_122_ & 0xff00) & 0xff0000) + ((i_122_ & 0xff00ff) * i_112_ & ~0xff00ff)) >> 8);
				} else
					i_96_++;
			}
			i_95_ += i_119_ + i_100_;
			i_96_ += i_99_ + i_119_;
		}
	}

	void method15597(byte[] is, int[] is_123_, int i, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_, int i_129_) {
		int i_130_ = i >>> 24;
		int i_131_ = 255 - i_130_;
		for (int i_132_ = -i_127_; i_132_ < 0; i_132_++) {
			for (int i_133_ = -i_126_; i_133_ < 0; i_133_++) {
				if (is[i_124_++] != 0) {
					int i_134_ = (((i_130_ * (i & 0xff00) & 0xff0000) + ((i & 0xff00ff) * i_130_ & ~0xff00ff)) >> 8);
					int i_135_ = is_123_[i_125_];
					is_123_[i_125_++] = i_134_ + ((((i_135_ & 0xff00ff) * i_131_ & ~0xff00ff) + ((i_135_ & 0xff00) * i_131_ & 0xff0000)) >> 8);
				} else
					i_125_++;
			}
			i_125_ += i_128_;
			i_124_ += i_129_;
		}
	}

	void method2761(char c, int i, int i_136_, int i_137_, boolean bool) {
		if (aClass180_Sub1_9873.anIntArray9386 != null) {
			i += anIntArray9874[c];
			i_136_ += anIntArray9870[c];
			int i_138_ = anIntArray9871[c];
			int i_139_ = anIntArray9872[c];
			int i_140_ = aClass180_Sub1_9873.anInt9387 * -1173855569;
			int i_141_ = i + i_140_ * i_136_;
			int i_142_ = i_140_ - i_138_;
			int i_143_ = 0;
			int i_144_ = 0;
			if (i_136_ < -456655989 * aClass180_Sub1_9873.anInt9392) {
				int i_145_ = aClass180_Sub1_9873.anInt9392 * -456655989 - i_136_;
				i_139_ -= i_145_;
				i_136_ = aClass180_Sub1_9873.anInt9392 * -456655989;
				i_144_ += i_145_ * i_138_;
				i_141_ += i_145_ * i_140_;
			}
			if (i_139_ + i_136_ > aClass180_Sub1_9873.anInt9393 * -383695469)
				i_139_ -= (i_139_ + i_136_ - -383695469 * aClass180_Sub1_9873.anInt9393);
			if (i < aClass180_Sub1_9873.anInt9383 * 1605202751) {
				int i_146_ = aClass180_Sub1_9873.anInt9383 * 1605202751 - i;
				i_138_ -= i_146_;
				i = aClass180_Sub1_9873.anInt9383 * 1605202751;
				i_144_ += i_146_;
				i_141_ += i_146_;
				i_143_ += i_146_;
				i_142_ += i_146_;
			}
			if (i + i_138_ > aClass180_Sub1_9873.anInt9391 * 2014358275) {
				int i_147_ = i_138_ + i - aClass180_Sub1_9873.anInt9391 * 2014358275;
				i_138_ -= i_147_;
				i_143_ += i_147_;
				i_142_ += i_147_;
			}
			if (i_138_ > 0 && i_139_ > 0) {
				if ((i_137_ & ~0xffffff) == -16777216)
					method15594(aByteArrayArray9869[c], aClass180_Sub1_9873.anIntArray9386, i_137_, i_144_, i_141_, i_138_, i_139_, i_142_, i_143_);
				else if ((i_137_ & ~0xffffff) != 0)
					method15595(aByteArrayArray9869[c], aClass180_Sub1_9873.anIntArray9386, i_137_, i_144_, i_141_, i_138_, i_139_, i_142_, i_143_);
			}
		}
	}

	void method15598(byte[] is, int[] is_148_, int i, int i_149_, int i_150_, int i_151_, int i_152_, int i_153_, int i_154_) {
		int i_155_ = i >>> 24;
		int i_156_ = 255 - i_155_;
		for (int i_157_ = -i_152_; i_157_ < 0; i_157_++) {
			for (int i_158_ = -i_151_; i_158_ < 0; i_158_++) {
				if (is[i_149_++] != 0) {
					int i_159_ = (((i_155_ * (i & 0xff00) & 0xff0000) + ((i & 0xff00ff) * i_155_ & ~0xff00ff)) >> 8);
					int i_160_ = is_148_[i_150_];
					is_148_[i_150_++] = i_159_ + ((((i_160_ & 0xff00ff) * i_156_ & ~0xff00ff) + ((i_160_ & 0xff00) * i_156_ & 0xff0000)) >> 8);
				} else
					i_150_++;
			}
			i_150_ += i_153_;
			i_149_ += i_154_;
		}
	}

	void method2763(char c, int i, int i_161_, int i_162_, boolean bool, Class142 class142, int i_163_, int i_164_) {
		if (null != aClass180_Sub1_9873.anIntArray9386) {
			if (class142 == null)
				method2758(c, i, i_161_, i_162_, bool);
			else {
				i += anIntArray9874[c];
				i_161_ += anIntArray9870[c];
				int i_165_ = anIntArray9871[c];
				int i_166_ = anIntArray9872[c];
				int i_167_ = -1173855569 * aClass180_Sub1_9873.anInt9387;
				int i_168_ = i + i_161_ * i_167_;
				int i_169_ = i_167_ - i_165_;
				int i_170_ = 0;
				int i_171_ = 0;
				if (i_161_ < aClass180_Sub1_9873.anInt9392 * -456655989) {
					int i_172_ = -456655989 * aClass180_Sub1_9873.anInt9392 - i_161_;
					i_166_ -= i_172_;
					i_161_ = -456655989 * aClass180_Sub1_9873.anInt9392;
					i_171_ += i_172_ * i_165_;
					i_168_ += i_172_ * i_167_;
				}
				if (i_161_ + i_166_ > aClass180_Sub1_9873.anInt9393 * -383695469)
					i_166_ -= (i_166_ + i_161_ - -383695469 * aClass180_Sub1_9873.anInt9393);
				if (i < 1605202751 * aClass180_Sub1_9873.anInt9383) {
					int i_173_ = 1605202751 * aClass180_Sub1_9873.anInt9383 - i;
					i_165_ -= i_173_;
					i = aClass180_Sub1_9873.anInt9383 * 1605202751;
					i_171_ += i_173_;
					i_168_ += i_173_;
					i_170_ += i_173_;
					i_169_ += i_173_;
				}
				if (i + i_165_ > 2014358275 * aClass180_Sub1_9873.anInt9391) {
					int i_174_ = (i + i_165_ - aClass180_Sub1_9873.anInt9391 * 2014358275);
					i_165_ -= i_174_;
					i_170_ += i_174_;
					i_169_ += i_174_;
				}
				if (i_165_ > 0 && i_166_ > 0) {
					if ((i_162_ & ~0xffffff) == -16777216)
						method15604(aByteArrayArray9869[c], aClass180_Sub1_9873.anIntArray9386, i_162_, i_171_, i_168_, i_165_, i_166_, i_169_, i_170_, i, i_161_, anIntArray9871[c], class142, i_163_, i_164_);
					else
						method15596(aByteArrayArray9869[c], aClass180_Sub1_9873.anIntArray9386, i_162_, i_171_, i_168_, i_165_, i_166_, i_169_, i_170_, i, i_161_, anIntArray9871[c], class142, i_163_, i_164_);
				}
			}
		}
	}

	void method15599(byte[] is, int[] is_175_, int i, int i_176_, int i_177_, int i_178_, int i_179_, int i_180_, int i_181_) {
		int i_182_ = -(i_178_ >> 2);
		i_178_ = -(i_178_ & 0x3);
		for (int i_183_ = -i_179_; i_183_ < 0; i_183_++) {
			for (int i_184_ = i_182_; i_184_ < 0; i_184_++) {
				if (is[i_176_++] != 0)
					is_175_[i_177_++] = i;
				else
					i_177_++;
				if (is[i_176_++] != 0)
					is_175_[i_177_++] = i;
				else
					i_177_++;
				if (is[i_176_++] != 0)
					is_175_[i_177_++] = i;
				else
					i_177_++;
				if (is[i_176_++] != 0)
					is_175_[i_177_++] = i;
				else
					i_177_++;
			}
			for (int i_185_ = i_178_; i_185_ < 0; i_185_++) {
				if (is[i_176_++] != 0)
					is_175_[i_177_++] = i;
				else
					i_177_++;
			}
			i_177_ += i_180_;
			i_176_ += i_181_;
		}
	}

	void method2760(char c, int i, int i_186_, int i_187_, boolean bool) {
		if (aClass180_Sub1_9873.anIntArray9386 != null) {
			i += anIntArray9874[c];
			i_186_ += anIntArray9870[c];
			int i_188_ = anIntArray9871[c];
			int i_189_ = anIntArray9872[c];
			int i_190_ = aClass180_Sub1_9873.anInt9387 * -1173855569;
			int i_191_ = i + i_190_ * i_186_;
			int i_192_ = i_190_ - i_188_;
			int i_193_ = 0;
			int i_194_ = 0;
			if (i_186_ < -456655989 * aClass180_Sub1_9873.anInt9392) {
				int i_195_ = aClass180_Sub1_9873.anInt9392 * -456655989 - i_186_;
				i_189_ -= i_195_;
				i_186_ = aClass180_Sub1_9873.anInt9392 * -456655989;
				i_194_ += i_195_ * i_188_;
				i_191_ += i_195_ * i_190_;
			}
			if (i_189_ + i_186_ > aClass180_Sub1_9873.anInt9393 * -383695469)
				i_189_ -= (i_189_ + i_186_ - -383695469 * aClass180_Sub1_9873.anInt9393);
			if (i < aClass180_Sub1_9873.anInt9383 * 1605202751) {
				int i_196_ = aClass180_Sub1_9873.anInt9383 * 1605202751 - i;
				i_188_ -= i_196_;
				i = aClass180_Sub1_9873.anInt9383 * 1605202751;
				i_194_ += i_196_;
				i_191_ += i_196_;
				i_193_ += i_196_;
				i_192_ += i_196_;
			}
			if (i + i_188_ > aClass180_Sub1_9873.anInt9391 * 2014358275) {
				int i_197_ = i_188_ + i - aClass180_Sub1_9873.anInt9391 * 2014358275;
				i_188_ -= i_197_;
				i_193_ += i_197_;
				i_192_ += i_197_;
			}
			if (i_188_ > 0 && i_189_ > 0) {
				if ((i_187_ & ~0xffffff) == -16777216)
					method15594(aByteArrayArray9869[c], aClass180_Sub1_9873.anIntArray9386, i_187_, i_194_, i_191_, i_188_, i_189_, i_192_, i_193_);
				else if ((i_187_ & ~0xffffff) != 0)
					method15595(aByteArrayArray9869[c], aClass180_Sub1_9873.anIntArray9386, i_187_, i_194_, i_191_, i_188_, i_189_, i_192_, i_193_);
			}
		}
	}

	void method15600(byte[] is, int[] is_198_, int i, int i_199_, int i_200_, int i_201_, int i_202_, int i_203_, int i_204_) {
		int i_205_ = -(i_201_ >> 2);
		i_201_ = -(i_201_ & 0x3);
		for (int i_206_ = -i_202_; i_206_ < 0; i_206_++) {
			for (int i_207_ = i_205_; i_207_ < 0; i_207_++) {
				if (is[i_199_++] != 0)
					is_198_[i_200_++] = i;
				else
					i_200_++;
				if (is[i_199_++] != 0)
					is_198_[i_200_++] = i;
				else
					i_200_++;
				if (is[i_199_++] != 0)
					is_198_[i_200_++] = i;
				else
					i_200_++;
				if (is[i_199_++] != 0)
					is_198_[i_200_++] = i;
				else
					i_200_++;
			}
			for (int i_208_ = i_201_; i_208_ < 0; i_208_++) {
				if (is[i_199_++] != 0)
					is_198_[i_200_++] = i;
				else
					i_200_++;
			}
			i_200_ += i_203_;
			i_199_ += i_204_;
		}
	}

	Class174_Sub4(Class180_Sub1 class180_sub1, Class22 class22, Class185_Sub2[] class185_sub2s, int[] is, int[] is_209_) {
		super(class180_sub1, class22);
		aClass180_Sub1_9873 = class180_sub1;
		anIntArray9871 = is;
		anIntArray9872 = is_209_;
		aByteArrayArray9869 = new byte[class185_sub2s.length][];
		anIntArray9870 = new int[class185_sub2s.length];
		anIntArray9874 = new int[class185_sub2s.length];
		for (int i = 0; i < class185_sub2s.length; i++) {
			aByteArrayArray9869[i] = class185_sub2s[i].aByteArray9371;
			anIntArray9870[i] = class185_sub2s[i].anInt9378;
			anIntArray9874[i] = class185_sub2s[i].anInt9375;
		}
	}

	void method15601(byte[] is, int[] is_210_, int i, int i_211_, int i_212_, int i_213_, int i_214_, int i_215_, int i_216_) {
		int i_217_ = -(i_213_ >> 2);
		i_213_ = -(i_213_ & 0x3);
		for (int i_218_ = -i_214_; i_218_ < 0; i_218_++) {
			for (int i_219_ = i_217_; i_219_ < 0; i_219_++) {
				if (is[i_211_++] != 0)
					is_210_[i_212_++] = i;
				else
					i_212_++;
				if (is[i_211_++] != 0)
					is_210_[i_212_++] = i;
				else
					i_212_++;
				if (is[i_211_++] != 0)
					is_210_[i_212_++] = i;
				else
					i_212_++;
				if (is[i_211_++] != 0)
					is_210_[i_212_++] = i;
				else
					i_212_++;
			}
			for (int i_220_ = i_213_; i_220_ < 0; i_220_++) {
				if (is[i_211_++] != 0)
					is_210_[i_212_++] = i;
				else
					i_212_++;
			}
			i_212_ += i_215_;
			i_211_ += i_216_;
		}
	}

	void method15602(byte[] is, int[] is_221_, int i, int i_222_, int i_223_, int i_224_, int i_225_, int i_226_, int i_227_) {
		int i_228_ = i >>> 24;
		int i_229_ = 255 - i_228_;
		for (int i_230_ = -i_225_; i_230_ < 0; i_230_++) {
			for (int i_231_ = -i_224_; i_231_ < 0; i_231_++) {
				if (is[i_222_++] != 0) {
					int i_232_ = (((i_228_ * (i & 0xff00) & 0xff0000) + ((i & 0xff00ff) * i_228_ & ~0xff00ff)) >> 8);
					int i_233_ = is_221_[i_223_];
					is_221_[i_223_++] = i_232_ + ((((i_233_ & 0xff00ff) * i_229_ & ~0xff00ff) + ((i_233_ & 0xff00) * i_229_ & 0xff0000)) >> 8);
				} else
					i_223_++;
			}
			i_223_ += i_226_;
			i_222_ += i_227_;
		}
	}

	void method15603(byte[] is, int[] is_234_, int i, int i_235_, int i_236_, int i_237_, int i_238_, int i_239_, int i_240_, int i_241_, int i_242_, int i_243_, Class142 class142, int i_244_, int i_245_) {
		Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
		int[] is_246_ = class142_sub1.anIntArray9002;
		int[] is_247_ = class142_sub1.anIntArray9003;
		int i_248_ = i_242_;
		if (i_245_ > i_248_) {
			i_248_ = i_245_;
			i_236_ += (i_245_ - i_242_) * (-1173855569 * aClass180_Sub1_9873.anInt9387);
			i_235_ += i_243_ * (i_245_ - i_242_);
		}
		int i_249_ = (is_246_.length + i_245_ < i_238_ + i_242_ ? is_246_.length + i_245_ : i_242_ + i_238_);
		for (int i_250_ = i_248_; i_250_ < i_249_; i_250_++) {
			int i_251_ = i_244_ + is_246_[i_250_ - i_245_];
			int i_252_ = is_247_[i_250_ - i_245_];
			int i_253_ = i_237_;
			if (i_241_ > i_251_) {
				int i_254_ = i_241_ - i_251_;
				if (i_254_ >= i_252_) {
					i_235_ += i_240_ + i_237_;
					i_236_ += i_237_ + i_239_;
					continue;
				}
				i_252_ -= i_254_;
			} else {
				int i_255_ = i_251_ - i_241_;
				if (i_255_ >= i_237_) {
					i_235_ += i_237_ + i_240_;
					i_236_ += i_237_ + i_239_;
					continue;
				}
				i_235_ += i_255_;
				i_253_ -= i_255_;
				i_236_ += i_255_;
			}
			int i_256_ = 0;
			if (i_253_ < i_252_)
				i_252_ = i_253_;
			else
				i_256_ = i_253_ - i_252_;
			for (int i_257_ = 0; i_257_ < i_252_; i_257_++) {
				if (is[i_235_++] != 0)
					is_234_[i_236_++] = i;
				else
					i_236_++;
			}
			i_235_ += i_256_ + i_240_;
			i_236_ += i_239_ + i_256_;
		}
	}

	void method15604(byte[] is, int[] is_258_, int i, int i_259_, int i_260_, int i_261_, int i_262_, int i_263_, int i_264_, int i_265_, int i_266_, int i_267_, Class142 class142, int i_268_, int i_269_) {
		Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
		int[] is_270_ = class142_sub1.anIntArray9002;
		int[] is_271_ = class142_sub1.anIntArray9003;
		int i_272_ = i_266_;
		if (i_269_ > i_272_) {
			i_272_ = i_269_;
			i_260_ += (i_269_ - i_266_) * (-1173855569 * aClass180_Sub1_9873.anInt9387);
			i_259_ += i_267_ * (i_269_ - i_266_);
		}
		int i_273_ = (is_270_.length + i_269_ < i_262_ + i_266_ ? is_270_.length + i_269_ : i_266_ + i_262_);
		for (int i_274_ = i_272_; i_274_ < i_273_; i_274_++) {
			int i_275_ = i_268_ + is_270_[i_274_ - i_269_];
			int i_276_ = is_271_[i_274_ - i_269_];
			int i_277_ = i_261_;
			if (i_265_ > i_275_) {
				int i_278_ = i_265_ - i_275_;
				if (i_278_ >= i_276_) {
					i_259_ += i_264_ + i_261_;
					i_260_ += i_261_ + i_263_;
					continue;
				}
				i_276_ -= i_278_;
			} else {
				int i_279_ = i_275_ - i_265_;
				if (i_279_ >= i_261_) {
					i_259_ += i_261_ + i_264_;
					i_260_ += i_261_ + i_263_;
					continue;
				}
				i_259_ += i_279_;
				i_277_ -= i_279_;
				i_260_ += i_279_;
			}
			int i_280_ = 0;
			if (i_277_ < i_276_)
				i_276_ = i_277_;
			else
				i_280_ = i_277_ - i_276_;
			for (int i_281_ = 0; i_281_ < i_276_; i_281_++) {
				if (is[i_259_++] != 0)
					is_258_[i_260_++] = i;
				else
					i_260_++;
			}
			i_259_ += i_280_ + i_264_;
			i_260_ += i_263_ + i_280_;
		}
	}

	void method15605(byte[] is, int[] is_282_, int i, int i_283_, int i_284_, int i_285_, int i_286_, int i_287_, int i_288_, int i_289_, int i_290_, int i_291_, Class142 class142, int i_292_, int i_293_) {
		Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
		int[] is_294_ = class142_sub1.anIntArray9002;
		int[] is_295_ = class142_sub1.anIntArray9003;
		int i_296_ = i_290_;
		if (i_293_ > i_296_) {
			i_296_ = i_293_;
			i_284_ += (i_293_ - i_290_) * (-1173855569 * aClass180_Sub1_9873.anInt9387);
			i_283_ += i_291_ * (i_293_ - i_290_);
		}
		int i_297_ = (is_294_.length + i_293_ < i_286_ + i_290_ ? is_294_.length + i_293_ : i_290_ + i_286_);
		for (int i_298_ = i_296_; i_298_ < i_297_; i_298_++) {
			int i_299_ = i_292_ + is_294_[i_298_ - i_293_];
			int i_300_ = is_295_[i_298_ - i_293_];
			int i_301_ = i_285_;
			if (i_289_ > i_299_) {
				int i_302_ = i_289_ - i_299_;
				if (i_302_ >= i_300_) {
					i_283_ += i_288_ + i_285_;
					i_284_ += i_285_ + i_287_;
					continue;
				}
				i_300_ -= i_302_;
			} else {
				int i_303_ = i_299_ - i_289_;
				if (i_303_ >= i_285_) {
					i_283_ += i_285_ + i_288_;
					i_284_ += i_285_ + i_287_;
					continue;
				}
				i_283_ += i_303_;
				i_301_ -= i_303_;
				i_284_ += i_303_;
			}
			int i_304_ = 0;
			if (i_301_ < i_300_)
				i_300_ = i_301_;
			else
				i_304_ = i_301_ - i_300_;
			for (int i_305_ = 0; i_305_ < i_300_; i_305_++) {
				if (is[i_283_++] != 0)
					is_282_[i_284_++] = i;
				else
					i_284_++;
			}
			i_283_ += i_304_ + i_288_;
			i_284_ += i_287_ + i_304_;
		}
	}

	void method15606(byte[] is, int[] is_306_, int i, int i_307_, int i_308_, int i_309_, int i_310_, int i_311_, int i_312_, int i_313_, int i_314_, int i_315_, Class142 class142, int i_316_, int i_317_) {
		Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
		int[] is_318_ = class142_sub1.anIntArray9002;
		int[] is_319_ = class142_sub1.anIntArray9003;
		int i_320_ = i_313_ - 1605202751 * aClass180_Sub1_9873.anInt9383;
		int i_321_ = i_314_;
		if (i_317_ > i_321_) {
			i_321_ = i_317_;
			i_308_ += aClass180_Sub1_9873.anInt9387 * -1173855569 * (i_317_ - i_314_);
			i_307_ += (i_317_ - i_314_) * i_315_;
		}
		int i_322_ = (i_317_ + is_318_.length < i_310_ + i_314_ ? i_317_ + is_318_.length : i_314_ + i_310_);
		int i_323_ = i >>> 24;
		int i_324_ = 255 - i_323_;
		for (int i_325_ = i_321_; i_325_ < i_322_; i_325_++) {
			int i_326_ = is_318_[i_325_ - i_317_] + i_316_;
			int i_327_ = is_319_[i_325_ - i_317_];
			int i_328_ = i_309_;
			if (i_320_ > i_326_) {
				int i_329_ = i_320_ - i_326_;
				if (i_329_ >= i_327_) {
					i_307_ += i_312_ + i_309_;
					i_308_ += i_309_ + i_311_;
					continue;
				}
				i_327_ -= i_329_;
			} else {
				int i_330_ = i_326_ - i_320_;
				if (i_330_ >= i_309_) {
					i_307_ += i_312_ + i_309_;
					i_308_ += i_309_ + i_311_;
					continue;
				}
				i_307_ += i_330_;
				i_328_ -= i_330_;
				i_308_ += i_330_;
			}
			int i_331_ = 0;
			if (i_328_ < i_327_)
				i_327_ = i_328_;
			else
				i_331_ = i_328_ - i_327_;
			for (int i_332_ = -i_327_; i_332_ < 0; i_332_++) {
				if (is[i_307_++] != 0) {
					int i_333_ = (((i_323_ * (i & 0xff00) & 0xff0000) + (i_323_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					int i_334_ = is_306_[i_308_];
					is_306_[i_308_++] = i_333_ + (((i_324_ * (i_334_ & 0xff00) & 0xff0000) + ((i_334_ & 0xff00ff) * i_324_ & ~0xff00ff)) >> 8);
				} else
					i_308_++;
			}
			i_307_ += i_331_ + i_312_;
			i_308_ += i_311_ + i_331_;
		}
	}

	static final void method15607(Class665 class665, byte i) {
		int i_335_ = class665.anIntArray8545[891367231 * class665.anInt8527];
		class665.anInt8528 -= 433009517 * i_335_;
		String string = Class180_Sub1.method14884(class665.anObjectArray8541, class665.anInt8528 * 318492261, i_335_, (byte) 22);
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = string;
	}
}
