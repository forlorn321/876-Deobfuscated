/* Class527_Sub35_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub35_Sub1 extends Class527_Sub35 {
	static final int anInt11832 = 4;
	static final int anInt11833 = 8;
	static final int anInt11834 = 0;
	static final int anInt11835 = 1638;
	static final boolean aBool11836 = true;
	short[] aShortArray11837;
	short[] aShortArray11838;
	byte[] aByteArray11839 = new byte[512];
	int anInt11840 = 0;
	int anInt11841 = -45912068;
	int anInt11842 = 370681612;
	int anInt11843 = -18312580;
	int anInt11844 = -1683837538;
	boolean aBool11845 = true;
	static final int anInt11846 = 4;

	int method18428(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		int i_5_ = i >> 12;
		int i_6_ = i_5_ + 1;
		if (i_6_ >= i_4_)
			i_6_ = 0;
		i &= 0xfff;
		i_5_ &= 0xff;
		i_6_ &= 0xff;
		int i_7_ = i - 4096;
		int i_8_ = i_0_ - 4096;
		int i_9_ = Class412.anIntArray4380[i];
		int i_10_ = aByteArray11839[i_5_ + i_1_] & 0x3;
		int i_11_;
		if (i_10_ <= 1)
			i_11_ = 0 == i_10_ ? i + i_0_ : i_0_ - i;
		else
			i_11_ = i_10_ == 2 ? i - i_0_ : -i - i_0_;
		i_10_ = aByteArray11839[i_1_ + i_6_] & 0x3;
		int i_12_;
		if (i_10_ <= 1)
			i_12_ = 0 == i_10_ ? i_0_ + i_7_ : i_0_ - i_7_;
		else
			i_12_ = 2 == i_10_ ? i_7_ - i_0_ : -i_7_ - i_0_;
		int i_13_ = ((i_12_ - i_11_) * i_9_ >> 12) + i_11_;
		i_10_ = aByteArray11839[i_2_ + i_5_] & 0x3;
		if (i_10_ <= 1)
			i_11_ = 0 == i_10_ ? i + i_8_ : i_8_ - i;
		else
			i_11_ = 2 == i_10_ ? i - i_8_ : -i - i_8_;
		i_10_ = aByteArray11839[i_6_ + i_2_] & 0x3;
		if (i_10_ <= 1)
			i_12_ = i_10_ == 0 ? i_7_ + i_8_ : i_8_ - i_7_;
		else
			i_12_ = i_10_ == 2 ? i_7_ - i_8_ : -i_7_ - i_8_;
		int i_14_ = (i_9_ * (i_12_ - i_11_) >> 12) + i_11_;
		return i_13_ + ((i_14_ - i_13_) * i_3_ >> 12);
	}

	void method18429(int i, int[] is, byte i_15_) {
		int i_16_ = -1883492629 * anInt11842 * Class40.anIntArray434[i];
		if (1 == anInt11843 * 1762260831) {
			int i_17_ = aShortArray11837[0];
			int i_18_ = aShortArray11838[0] << 12;
			int i_19_ = i_18_ * (anInt11842 * -1883492629) >> 12;
			int i_20_ = i_18_ * (-2086722561 * anInt11841) >> 12;
			int i_21_ = i_16_ * i_18_ >> 12;
			int i_22_ = i_21_ >> 12;
			int i_23_ = i_22_ + 1;
			if (i_23_ >= i_19_)
				i_23_ = 0;
			i_21_ &= 0xfff;
			int i_24_ = Class412.anIntArray4380[i_21_];
			int i_25_ = aByteArray11839[i_22_ & 0xff] & 0xff;
			int i_26_ = aByteArray11839[i_23_ & 0xff] & 0xff;
			if (aBool11845) {
				for (int i_27_ = 0; i_27_ < Class40.anInt435 * 2089128527; i_27_++) {
					int i_28_ = (anInt11841 * -2086722561 * Class40.anIntArray436[i_27_]);
					int i_29_ = method18436(i_28_ * i_18_ >> 12, i_21_, i_25_, i_26_, i_24_, i_20_, -2129866132);
					i_29_ = i_17_ * i_29_ >> 12;
					is[i_27_] = (i_29_ >> 1) + 2048;
				}
			} else {
				for (int i_30_ = 0; i_30_ < Class40.anInt435 * 2089128527; i_30_++) {
					int i_31_ = (anInt11841 * -2086722561 * Class40.anIntArray436[i_30_]);
					int i_32_ = method18436(i_31_ * i_18_ >> 12, i_21_, i_25_, i_26_, i_24_, i_20_, -922000381);
					is[i_30_] = i_17_ * i_32_ >> 12;
				}
			}
		} else {
			int i_33_ = aShortArray11837[0];
			if (i_33_ > 8 || i_33_ < -8) {
				int i_34_ = aShortArray11838[0] << 12;
				int i_35_ = anInt11842 * -1883492629 * i_34_ >> 12;
				int i_36_ = -2086722561 * anInt11841 * i_34_ >> 12;
				int i_37_ = i_16_ * i_34_ >> 12;
				int i_38_ = i_37_ >> 12;
				int i_39_ = 1 + i_38_;
				if (i_39_ >= i_35_)
					i_39_ = 0;
				i_37_ &= 0xfff;
				int i_40_ = Class412.anIntArray4380[i_37_];
				int i_41_ = aByteArray11839[i_38_ & 0xff] & 0xff;
				int i_42_ = aByteArray11839[i_39_ & 0xff] & 0xff;
				for (int i_43_ = 0; i_43_ < 2089128527 * Class40.anInt435; i_43_++) {
					int i_44_ = (-2086722561 * anInt11841 * Class40.anIntArray436[i_43_]);
					int i_45_ = method18436(i_34_ * i_44_ >> 12, i_37_, i_41_, i_42_, i_40_, i_36_, -110737495);
					is[i_43_] = i_45_ * i_33_ >> 12;
				}
			}
			for (int i_46_ = 1; i_46_ < anInt11843 * 1762260831; i_46_++) {
				i_33_ = aShortArray11837[i_46_];
				if (i_33_ > 8 || i_33_ < -8) {
					int i_47_ = aShortArray11838[i_46_] << 12;
					int i_48_ = i_47_ * (anInt11842 * -1883492629) >> 12;
					int i_49_ = anInt11841 * -2086722561 * i_47_ >> 12;
					int i_50_ = i_16_ * i_47_ >> 12;
					int i_51_ = i_50_ >> 12;
					int i_52_ = i_51_ + 1;
					if (i_52_ >= i_48_)
						i_52_ = 0;
					i_50_ &= 0xfff;
					int i_53_ = Class412.anIntArray4380[i_50_];
					int i_54_ = aByteArray11839[i_51_ & 0xff] & 0xff;
					int i_55_ = aByteArray11839[i_52_ & 0xff] & 0xff;
					if (aBool11845 && i_46_ == anInt11843 * 1762260831 - 1) {
						for (int i_56_ = 0; i_56_ < Class40.anInt435 * 2089128527; i_56_++) {
							int i_57_ = (Class40.anIntArray436[i_56_] * (-2086722561 * anInt11841));
							int i_58_ = method18436(i_57_ * i_47_ >> 12, i_50_, i_54_, i_55_, i_53_, i_49_, -1312099587);
							i_58_ = is[i_56_] + (i_33_ * i_58_ >> 12);
							is[i_56_] = 2048 + (i_58_ >> 1);
						}
					} else {
						for (int i_59_ = 0; i_59_ < Class40.anInt435 * 2089128527; i_59_++) {
							int i_60_ = (-2086722561 * anInt11841 * Class40.anIntArray436[i_59_]);
							int i_61_ = method18436(i_47_ * i_60_ >> 12, i_50_, i_54_, i_55_, i_53_, i_49_, 2004662581);
							is[i_59_] += i_33_ * i_61_ >> 12;
						}
					}
				}
			}
		}
	}

	void method18430(int i) {
		if (anInt11844 * -820812195 > 0) {
			aShortArray11837 = new short[anInt11843 * 1762260831];
			aShortArray11838 = new short[1762260831 * anInt11843];
			for (int i_62_ = 0; i_62_ < 1762260831 * anInt11843; i_62_++) {
				aShortArray11837[i_62_] = (short) (int) (Math.pow((double) ((float) (anInt11844 * -820812195) / 4096.0F), (double) i_62_) * 4096.0);
				aShortArray11838[i_62_] = (short) (int) Math.pow(2.0, (double) i_62_);
			}
		} else if (aShortArray11837 != null && aShortArray11837.length == 1762260831 * anInt11843) {
			aShortArray11838 = new short[anInt11843 * 1762260831];
			for (int i_63_ = 0; i_63_ < 1762260831 * anInt11843; i_63_++)
				aShortArray11838[i_63_] = (short) (int) Math.pow(2.0, (double) i_63_);
		}
	}

	void method18431(byte i) {
		aByteArray11839 = Class40.method1164(1065481473 * anInt11840, -121171246);
		method18430(1955953820);
		for (int i_64_ = anInt11843 * 1762260831 - 1; i_64_ >= 1; i_64_--) {
			short i_65_ = aShortArray11837[i_64_];
			if (i_65_ > 8 || i_65_ < -8)
				break;
			anInt11843 -= -4578145;
		}
	}

	Class527_Sub35_Sub1() {
		super(0, true);
	}

	void method18432(int i, int[] is) {
		int i_66_ = -1883492629 * anInt11842 * Class40.anIntArray434[i];
		if (1 == anInt11843 * 1762260831) {
			int i_67_ = aShortArray11837[0];
			int i_68_ = aShortArray11838[0] << 12;
			int i_69_ = i_68_ * (anInt11842 * -1883492629) >> 12;
			int i_70_ = i_68_ * (-2086722561 * anInt11841) >> 12;
			int i_71_ = i_66_ * i_68_ >> 12;
			int i_72_ = i_71_ >> 12;
			int i_73_ = i_72_ + 1;
			if (i_73_ >= i_69_)
				i_73_ = 0;
			i_71_ &= 0xfff;
			int i_74_ = Class412.anIntArray4380[i_71_];
			int i_75_ = aByteArray11839[i_72_ & 0xff] & 0xff;
			int i_76_ = aByteArray11839[i_73_ & 0xff] & 0xff;
			if (aBool11845) {
				for (int i_77_ = 0; i_77_ < Class40.anInt435 * 2089128527; i_77_++) {
					int i_78_ = (anInt11841 * -2086722561 * Class40.anIntArray436[i_77_]);
					int i_79_ = method18436(i_78_ * i_68_ >> 12, i_71_, i_75_, i_76_, i_74_, i_70_, 1152679384);
					i_79_ = i_67_ * i_79_ >> 12;
					is[i_77_] = (i_79_ >> 1) + 2048;
				}
			} else {
				for (int i_80_ = 0; i_80_ < Class40.anInt435 * 2089128527; i_80_++) {
					int i_81_ = (anInt11841 * -2086722561 * Class40.anIntArray436[i_80_]);
					int i_82_ = method18436(i_81_ * i_68_ >> 12, i_71_, i_75_, i_76_, i_74_, i_70_, -557015160);
					is[i_80_] = i_67_ * i_82_ >> 12;
				}
			}
		} else {
			int i_83_ = aShortArray11837[0];
			if (i_83_ > 8 || i_83_ < -8) {
				int i_84_ = aShortArray11838[0] << 12;
				int i_85_ = anInt11842 * -1883492629 * i_84_ >> 12;
				int i_86_ = -2086722561 * anInt11841 * i_84_ >> 12;
				int i_87_ = i_66_ * i_84_ >> 12;
				int i_88_ = i_87_ >> 12;
				int i_89_ = 1 + i_88_;
				if (i_89_ >= i_85_)
					i_89_ = 0;
				i_87_ &= 0xfff;
				int i_90_ = Class412.anIntArray4380[i_87_];
				int i_91_ = aByteArray11839[i_88_ & 0xff] & 0xff;
				int i_92_ = aByteArray11839[i_89_ & 0xff] & 0xff;
				for (int i_93_ = 0; i_93_ < 2089128527 * Class40.anInt435; i_93_++) {
					int i_94_ = (-2086722561 * anInt11841 * Class40.anIntArray436[i_93_]);
					int i_95_ = method18436(i_84_ * i_94_ >> 12, i_87_, i_91_, i_92_, i_90_, i_86_, -2116025236);
					is[i_93_] = i_95_ * i_83_ >> 12;
				}
			}
			for (int i_96_ = 1; i_96_ < anInt11843 * 1762260831; i_96_++) {
				i_83_ = aShortArray11837[i_96_];
				if (i_83_ > 8 || i_83_ < -8) {
					int i_97_ = aShortArray11838[i_96_] << 12;
					int i_98_ = i_97_ * (anInt11842 * -1883492629) >> 12;
					int i_99_ = anInt11841 * -2086722561 * i_97_ >> 12;
					int i_100_ = i_66_ * i_97_ >> 12;
					int i_101_ = i_100_ >> 12;
					int i_102_ = i_101_ + 1;
					if (i_102_ >= i_98_)
						i_102_ = 0;
					i_100_ &= 0xfff;
					int i_103_ = Class412.anIntArray4380[i_100_];
					int i_104_ = aByteArray11839[i_101_ & 0xff] & 0xff;
					int i_105_ = aByteArray11839[i_102_ & 0xff] & 0xff;
					if (aBool11845 && i_96_ == anInt11843 * 1762260831 - 1) {
						for (int i_106_ = 0; i_106_ < Class40.anInt435 * 2089128527; i_106_++) {
							int i_107_ = (Class40.anIntArray436[i_106_] * (-2086722561 * anInt11841));
							int i_108_ = method18436(i_107_ * i_97_ >> 12, i_100_, i_104_, i_105_, i_103_, i_99_, 91380447);
							i_108_ = is[i_106_] + (i_83_ * i_108_ >> 12);
							is[i_106_] = 2048 + (i_108_ >> 1);
						}
					} else {
						for (int i_109_ = 0; i_109_ < Class40.anInt435 * 2089128527; i_109_++) {
							int i_110_ = (-2086722561 * anInt11841 * Class40.anIntArray436[i_109_]);
							int i_111_ = method18436(i_97_ * i_110_ >> 12, i_100_, i_104_, i_105_, i_103_, i_99_, 1802072577);
							is[i_109_] += i_83_ * i_111_ >> 12;
						}
					}
				}
			}
		}
	}

	void method18433(int i, int[] is) {
		int i_112_ = -1883492629 * anInt11842 * Class40.anIntArray434[i];
		if (1 == anInt11843 * 1762260831) {
			int i_113_ = aShortArray11837[0];
			int i_114_ = aShortArray11838[0] << 12;
			int i_115_ = i_114_ * (anInt11842 * -1883492629) >> 12;
			int i_116_ = i_114_ * (-2086722561 * anInt11841) >> 12;
			int i_117_ = i_112_ * i_114_ >> 12;
			int i_118_ = i_117_ >> 12;
			int i_119_ = i_118_ + 1;
			if (i_119_ >= i_115_)
				i_119_ = 0;
			i_117_ &= 0xfff;
			int i_120_ = Class412.anIntArray4380[i_117_];
			int i_121_ = aByteArray11839[i_118_ & 0xff] & 0xff;
			int i_122_ = aByteArray11839[i_119_ & 0xff] & 0xff;
			if (aBool11845) {
				for (int i_123_ = 0; i_123_ < Class40.anInt435 * 2089128527; i_123_++) {
					int i_124_ = (anInt11841 * -2086722561 * Class40.anIntArray436[i_123_]);
					int i_125_ = method18436(i_124_ * i_114_ >> 12, i_117_, i_121_, i_122_, i_120_, i_116_, 2058897105);
					i_125_ = i_113_ * i_125_ >> 12;
					is[i_123_] = (i_125_ >> 1) + 2048;
				}
			} else {
				for (int i_126_ = 0; i_126_ < Class40.anInt435 * 2089128527; i_126_++) {
					int i_127_ = (anInt11841 * -2086722561 * Class40.anIntArray436[i_126_]);
					int i_128_ = method18436(i_127_ * i_114_ >> 12, i_117_, i_121_, i_122_, i_120_, i_116_, -1736817821);
					is[i_126_] = i_113_ * i_128_ >> 12;
				}
			}
		} else {
			int i_129_ = aShortArray11837[0];
			if (i_129_ > 8 || i_129_ < -8) {
				int i_130_ = aShortArray11838[0] << 12;
				int i_131_ = anInt11842 * -1883492629 * i_130_ >> 12;
				int i_132_ = -2086722561 * anInt11841 * i_130_ >> 12;
				int i_133_ = i_112_ * i_130_ >> 12;
				int i_134_ = i_133_ >> 12;
				int i_135_ = 1 + i_134_;
				if (i_135_ >= i_131_)
					i_135_ = 0;
				i_133_ &= 0xfff;
				int i_136_ = Class412.anIntArray4380[i_133_];
				int i_137_ = aByteArray11839[i_134_ & 0xff] & 0xff;
				int i_138_ = aByteArray11839[i_135_ & 0xff] & 0xff;
				for (int i_139_ = 0; i_139_ < 2089128527 * Class40.anInt435; i_139_++) {
					int i_140_ = (-2086722561 * anInt11841 * Class40.anIntArray436[i_139_]);
					int i_141_ = method18436(i_130_ * i_140_ >> 12, i_133_, i_137_, i_138_, i_136_, i_132_, -1131907361);
					is[i_139_] = i_141_ * i_129_ >> 12;
				}
			}
			for (int i_142_ = 1; i_142_ < anInt11843 * 1762260831; i_142_++) {
				i_129_ = aShortArray11837[i_142_];
				if (i_129_ > 8 || i_129_ < -8) {
					int i_143_ = aShortArray11838[i_142_] << 12;
					int i_144_ = i_143_ * (anInt11842 * -1883492629) >> 12;
					int i_145_ = anInt11841 * -2086722561 * i_143_ >> 12;
					int i_146_ = i_112_ * i_143_ >> 12;
					int i_147_ = i_146_ >> 12;
					int i_148_ = i_147_ + 1;
					if (i_148_ >= i_144_)
						i_148_ = 0;
					i_146_ &= 0xfff;
					int i_149_ = Class412.anIntArray4380[i_146_];
					int i_150_ = aByteArray11839[i_147_ & 0xff] & 0xff;
					int i_151_ = aByteArray11839[i_148_ & 0xff] & 0xff;
					if (aBool11845 && i_142_ == anInt11843 * 1762260831 - 1) {
						for (int i_152_ = 0; i_152_ < Class40.anInt435 * 2089128527; i_152_++) {
							int i_153_ = (Class40.anIntArray436[i_152_] * (-2086722561 * anInt11841));
							int i_154_ = method18436(i_153_ * i_143_ >> 12, i_146_, i_150_, i_151_, i_149_, i_145_, -2008187414);
							i_154_ = is[i_152_] + (i_129_ * i_154_ >> 12);
							is[i_152_] = 2048 + (i_154_ >> 1);
						}
					} else {
						for (int i_155_ = 0; i_155_ < Class40.anInt435 * 2089128527; i_155_++) {
							int i_156_ = (-2086722561 * anInt11841 * Class40.anIntArray436[i_155_]);
							int i_157_ = method18436(i_143_ * i_156_ >> 12, i_146_, i_150_, i_151_, i_149_, i_145_, 1370729475);
							is[i_155_] += i_129_ * i_157_ >> 12;
						}
					}
				}
			}
		}
	}

	int method18434(int i, int i_158_, int i_159_, int i_160_, int i_161_, int i_162_) {
		int i_163_ = i >> 12;
		int i_164_ = i_163_ + 1;
		if (i_164_ >= i_162_)
			i_164_ = 0;
		i &= 0xfff;
		i_163_ &= 0xff;
		i_164_ &= 0xff;
		int i_165_ = i - 4096;
		int i_166_ = i_158_ - 4096;
		int i_167_ = Class412.anIntArray4380[i];
		int i_168_ = aByteArray11839[i_163_ + i_159_] & 0x3;
		int i_169_;
		if (i_168_ <= 1)
			i_169_ = 0 == i_168_ ? i + i_158_ : i_158_ - i;
		else
			i_169_ = i_168_ == 2 ? i - i_158_ : -i - i_158_;
		i_168_ = aByteArray11839[i_159_ + i_164_] & 0x3;
		int i_170_;
		if (i_168_ <= 1)
			i_170_ = 0 == i_168_ ? i_158_ + i_165_ : i_158_ - i_165_;
		else
			i_170_ = 2 == i_168_ ? i_165_ - i_158_ : -i_165_ - i_158_;
		int i_171_ = ((i_170_ - i_169_) * i_167_ >> 12) + i_169_;
		i_168_ = aByteArray11839[i_160_ + i_163_] & 0x3;
		if (i_168_ <= 1)
			i_169_ = 0 == i_168_ ? i + i_166_ : i_166_ - i;
		else
			i_169_ = 2 == i_168_ ? i - i_166_ : -i - i_166_;
		i_168_ = aByteArray11839[i_164_ + i_160_] & 0x3;
		if (i_168_ <= 1)
			i_170_ = i_168_ == 0 ? i_165_ + i_166_ : i_166_ - i_165_;
		else
			i_170_ = i_168_ == 2 ? i_165_ - i_166_ : -i_165_ - i_166_;
		int i_172_ = (i_167_ * (i_170_ - i_169_) >> 12) + i_169_;
		return i_171_ + ((i_172_ - i_171_) * i_161_ >> 12);
	}

	int method18435(int i, int i_173_, int i_174_, int i_175_, int i_176_, int i_177_) {
		int i_178_ = i >> 12;
		int i_179_ = i_178_ + 1;
		if (i_179_ >= i_177_)
			i_179_ = 0;
		i &= 0xfff;
		i_178_ &= 0xff;
		i_179_ &= 0xff;
		int i_180_ = i - 4096;
		int i_181_ = i_173_ - 4096;
		int i_182_ = Class412.anIntArray4380[i];
		int i_183_ = aByteArray11839[i_178_ + i_174_] & 0x3;
		int i_184_;
		if (i_183_ <= 1)
			i_184_ = 0 == i_183_ ? i + i_173_ : i_173_ - i;
		else
			i_184_ = i_183_ == 2 ? i - i_173_ : -i - i_173_;
		i_183_ = aByteArray11839[i_174_ + i_179_] & 0x3;
		int i_185_;
		if (i_183_ <= 1)
			i_185_ = 0 == i_183_ ? i_173_ + i_180_ : i_173_ - i_180_;
		else
			i_185_ = 2 == i_183_ ? i_180_ - i_173_ : -i_180_ - i_173_;
		int i_186_ = ((i_185_ - i_184_) * i_182_ >> 12) + i_184_;
		i_183_ = aByteArray11839[i_175_ + i_178_] & 0x3;
		if (i_183_ <= 1)
			i_184_ = 0 == i_183_ ? i + i_181_ : i_181_ - i;
		else
			i_184_ = 2 == i_183_ ? i - i_181_ : -i - i_181_;
		i_183_ = aByteArray11839[i_179_ + i_175_] & 0x3;
		if (i_183_ <= 1)
			i_185_ = i_183_ == 0 ? i_180_ + i_181_ : i_181_ - i_180_;
		else
			i_185_ = i_183_ == 2 ? i_180_ - i_181_ : -i_180_ - i_181_;
		int i_187_ = (i_182_ * (i_185_ - i_184_) >> 12) + i_184_;
		return i_186_ + ((i_187_ - i_186_) * i_176_ >> 12);
	}

	int method18436(int i, int i_188_, int i_189_, int i_190_, int i_191_, int i_192_, int i_193_) {
		int i_194_ = i >> 12;
		int i_195_ = i_194_ + 1;
		if (i_195_ >= i_192_)
			i_195_ = 0;
		i &= 0xfff;
		i_194_ &= 0xff;
		i_195_ &= 0xff;
		int i_196_ = i - 4096;
		int i_197_ = i_188_ - 4096;
		int i_198_ = Class412.anIntArray4380[i];
		int i_199_ = aByteArray11839[i_194_ + i_189_] & 0x3;
		int i_200_;
		if (i_199_ <= 1)
			i_200_ = 0 == i_199_ ? i + i_188_ : i_188_ - i;
		else
			i_200_ = i_199_ == 2 ? i - i_188_ : -i - i_188_;
		i_199_ = aByteArray11839[i_189_ + i_195_] & 0x3;
		int i_201_;
		if (i_199_ <= 1)
			i_201_ = 0 == i_199_ ? i_188_ + i_196_ : i_188_ - i_196_;
		else
			i_201_ = 2 == i_199_ ? i_196_ - i_188_ : -i_196_ - i_188_;
		int i_202_ = ((i_201_ - i_200_) * i_198_ >> 12) + i_200_;
		i_199_ = aByteArray11839[i_190_ + i_194_] & 0x3;
		if (i_199_ <= 1)
			i_200_ = 0 == i_199_ ? i + i_197_ : i_197_ - i;
		else
			i_200_ = 2 == i_199_ ? i - i_197_ : -i - i_197_;
		i_199_ = aByteArray11839[i_195_ + i_190_] & 0x3;
		if (i_199_ <= 1)
			i_201_ = i_199_ == 0 ? i_196_ + i_197_ : i_197_ - i_196_;
		else
			i_201_ = i_199_ == 2 ? i_196_ - i_197_ : -i_196_ - i_197_;
		int i_203_ = (i_198_ * (i_201_ - i_200_) >> 12) + i_200_;
		return i_202_ + ((i_203_ - i_202_) * i_191_ >> 12);
	}

	int method18437(int i, int i_204_, int i_205_, int i_206_, int i_207_, int i_208_) {
		int i_209_ = i >> 12;
		int i_210_ = i_209_ + 1;
		if (i_210_ >= i_208_)
			i_210_ = 0;
		i &= 0xfff;
		i_209_ &= 0xff;
		i_210_ &= 0xff;
		int i_211_ = i - 4096;
		int i_212_ = i_204_ - 4096;
		int i_213_ = Class412.anIntArray4380[i];
		int i_214_ = aByteArray11839[i_209_ + i_205_] & 0x3;
		int i_215_;
		if (i_214_ <= 1)
			i_215_ = 0 == i_214_ ? i + i_204_ : i_204_ - i;
		else
			i_215_ = i_214_ == 2 ? i - i_204_ : -i - i_204_;
		i_214_ = aByteArray11839[i_205_ + i_210_] & 0x3;
		int i_216_;
		if (i_214_ <= 1)
			i_216_ = 0 == i_214_ ? i_204_ + i_211_ : i_204_ - i_211_;
		else
			i_216_ = 2 == i_214_ ? i_211_ - i_204_ : -i_211_ - i_204_;
		int i_217_ = ((i_216_ - i_215_) * i_213_ >> 12) + i_215_;
		i_214_ = aByteArray11839[i_206_ + i_209_] & 0x3;
		if (i_214_ <= 1)
			i_215_ = 0 == i_214_ ? i + i_212_ : i_212_ - i;
		else
			i_215_ = 2 == i_214_ ? i - i_212_ : -i - i_212_;
		i_214_ = aByteArray11839[i_210_ + i_206_] & 0x3;
		if (i_214_ <= 1)
			i_216_ = i_214_ == 0 ? i_211_ + i_212_ : i_212_ - i_211_;
		else
			i_216_ = i_214_ == 2 ? i_211_ - i_212_ : -i_211_ - i_212_;
		int i_218_ = (i_213_ * (i_216_ - i_215_) >> 12) + i_215_;
		return i_217_ + ((i_218_ - i_217_) * i_207_ >> 12);
	}

	void method18438() {
		aByteArray11839 = Class40.method1164(1065481473 * anInt11840, -1441159363);
		method18430(1955953820);
		for (int i = anInt11843 * 1762260831 - 1; i >= 1; i--) {
			short i_219_ = aShortArray11837[i];
			if (i_219_ > 8 || i_219_ < -8)
				break;
			anInt11843 -= -4578145;
		}
	}

	void method18439() {
		if (anInt11844 * -820812195 > 0) {
			aShortArray11837 = new short[anInt11843 * 1762260831];
			aShortArray11838 = new short[1762260831 * anInt11843];
			for (int i = 0; i < 1762260831 * anInt11843; i++) {
				aShortArray11837[i] = (short) (int) (Math.pow((double) ((float) (anInt11844 * -820812195) / 4096.0F), (double) i) * 4096.0);
				aShortArray11838[i] = (short) (int) Math.pow(2.0, (double) i);
			}
		} else if (aShortArray11837 != null && aShortArray11837.length == 1762260831 * anInt11843) {
			aShortArray11838 = new short[anInt11843 * 1762260831];
			for (int i = 0; i < 1762260831 * anInt11843; i++)
				aShortArray11838[i] = (short) (int) Math.pow(2.0, (double) i);
		}
	}

	void method18440() {
		if (anInt11844 * -820812195 > 0) {
			aShortArray11837 = new short[anInt11843 * 1762260831];
			aShortArray11838 = new short[1762260831 * anInt11843];
			for (int i = 0; i < 1762260831 * anInt11843; i++) {
				aShortArray11837[i] = (short) (int) (Math.pow((double) ((float) (anInt11844 * -820812195) / 4096.0F), (double) i) * 4096.0);
				aShortArray11838[i] = (short) (int) Math.pow(2.0, (double) i);
			}
		} else if (aShortArray11837 != null && aShortArray11837.length == 1762260831 * anInt11843) {
			aShortArray11838 = new short[anInt11843 * 1762260831];
			for (int i = 0; i < 1762260831 * anInt11843; i++)
				aShortArray11838[i] = (short) (int) Math.pow(2.0, (double) i);
		}
	}

	public static int[] method18441(int i, int i_220_, int i_221_, int i_222_, int i_223_, float f, boolean bool) {
		int[] is = new int[i];
		Class527_Sub35_Sub1 class527_sub35_sub1 = new Class527_Sub35_Sub1();
		class527_sub35_sub1.anInt11840 = -940111103 * i_220_;
		class527_sub35_sub1.aBool11845 = bool;
		class527_sub35_sub1.anInt11841 = i_221_ * 2136005631;
		class527_sub35_sub1.anInt11842 = 1166412227 * i_222_;
		class527_sub35_sub1.anInt11843 = -4578145 * i_223_;
		class527_sub35_sub1.anInt11844 = -2067227147 * (int) (f * 4096.0F);
		class527_sub35_sub1.method18431((byte) -58);
		Class40.method1162(i, 1, 153371143);
		class527_sub35_sub1.method18429(0, is, (byte) 0);
		return is;
	}

	public static int[][] method18442(int i, int i_224_, int i_225_, int i_226_, int i_227_, int i_228_, float f, boolean bool) {
		int[][] is = new int[i_224_][i];
		Class527_Sub35_Sub1 class527_sub35_sub1 = new Class527_Sub35_Sub1();
		class527_sub35_sub1.aBool11845 = bool;
		class527_sub35_sub1.anInt11841 = 2136005631 * i_226_;
		class527_sub35_sub1.anInt11842 = 1166412227 * i_227_;
		class527_sub35_sub1.anInt11843 = i_228_ * -4578145;
		class527_sub35_sub1.anInt11844 = -2067227147 * (int) (4096.0F * f);
		class527_sub35_sub1.method18431((byte) -63);
		Class40.method1162(i, i_224_, 153371143);
		for (int i_229_ = 0; i_229_ < i_224_; i_229_++)
			class527_sub35_sub1.method18429(i_229_, is[i_229_], (byte) 0);
		return is;
	}

	public static int[][] method18443(int i, int i_230_, int i_231_, int i_232_, int i_233_, int i_234_, float f, boolean bool) {
		int[][] is = new int[i_230_][i];
		Class527_Sub35_Sub1 class527_sub35_sub1 = new Class527_Sub35_Sub1();
		class527_sub35_sub1.aBool11845 = bool;
		class527_sub35_sub1.anInt11841 = 2136005631 * i_232_;
		class527_sub35_sub1.anInt11842 = 1166412227 * i_233_;
		class527_sub35_sub1.anInt11843 = i_234_ * -4578145;
		class527_sub35_sub1.anInt11844 = -2067227147 * (int) (4096.0F * f);
		class527_sub35_sub1.method18431((byte) -109);
		Class40.method1162(i, i_230_, 153371143);
		for (int i_235_ = 0; i_235_ < i_230_; i_235_++)
			class527_sub35_sub1.method18429(i_235_, is[i_235_], (byte) 0);
		return is;
	}
}
