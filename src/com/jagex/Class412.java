/* Class412 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Random;

public abstract class Class412 {
	static final int anInt4371 = 12;
	int anInt4372;
	static final int anInt4373 = 4095;
	short[] aShortArray4374;
	short[] aShortArray4375 = new short[512];
	int anInt4376 = 0;
	int anInt4377 = 4;
	int anInt4378 = 4;
	int anInt4379 = 4;
	public static int[] anIntArray4380 = new int[4096];
	static final int anInt4381 = 4096;

	static int method6602(int i, int i_0_, int i_1_, int i_2_) {
		int i_3_ = i & 0xf;
		int i_4_ = i_3_ < 8 ? i_0_ : i_1_;
		int i_5_ = i_3_ < 4 ? i_1_ : i_3_ == 12 || i_3_ == 14 ? i_0_ : i_2_;
		return (((i_3_ & 0x1) == 0 ? i_4_ : -i_4_) + ((i_3_ & 0x2) == 0 ? i_5_ : -i_5_));
	}

	void method6603(int i, int i_6_, int i_7_) {
		int[] is = new int[i];
		int[] is_8_ = new int[i_6_];
		int[] is_9_ = new int[i_7_];
		for (int i_10_ = 0; i_10_ < i; i_10_++)
			is[i_10_] = (i_10_ << 12) / i;
		for (int i_11_ = 0; i_11_ < i_6_; i_11_++)
			is_8_[i_11_] = (i_11_ << 12) / i_6_;
		for (int i_12_ = 0; i_12_ < i_7_; i_12_++)
			is_9_[i_12_] = (i_12_ << 12) / i_7_;
		method6622();
		for (int i_13_ = 0; i_13_ < i_7_; i_13_++) {
			for (int i_14_ = 0; i_14_ < i_6_; i_14_++) {
				for (int i_15_ = 0; i_15_ < i; i_15_++) {
					for (int i_16_ = 0; i_16_ < anInt4372; i_16_++) {
						int i_17_ = aShortArray4374[i_16_] << 12;
						int i_18_ = anInt4377 * i_17_ >> 12;
						int i_19_ = anInt4378 * i_17_ >> 12;
						int i_20_ = anInt4379 * i_17_ >> 12;
						int i_21_ = is[i_15_] * i_17_ >> 12;
						int i_22_ = is_8_[i_14_] * i_17_ >> 12;
						int i_23_ = is_9_[i_13_] * i_17_ >> 12;
						i_21_ *= anInt4377;
						i_22_ *= anInt4378;
						i_23_ *= anInt4379;
						int i_24_ = i_21_ >> 12;
						int i_25_ = i_24_ + 1;
						i_24_ &= 0xff;
						int i_26_ = i_22_ >> 12;
						int i_27_ = i_26_ + 1;
						i_26_ &= 0xff;
						int i_28_ = i_23_ >> 12;
						int i_29_ = i_28_ + 1;
						i_28_ &= 0xff;
						if (i_25_ >= i_18_)
							i_25_ = 0;
						else
							i_25_ &= 0xff;
						if (i_27_ >= i_19_)
							i_27_ = 0;
						else
							i_27_ &= 0xff;
						if (i_29_ >= i_20_)
							i_29_ = 0;
						else
							i_29_ &= 0xff;
						i_21_ &= 0xfff;
						i_22_ &= 0xfff;
						i_23_ &= 0xfff;
						int i_30_ = anIntArray4380[i_21_];
						int i_31_ = anIntArray4380[i_22_];
						int i_32_ = anIntArray4380[i_23_];
						int i_33_ = i_21_ - 4096;
						int i_34_ = i_22_ - 4096;
						int i_35_ = i_23_ - 4096;
						int i_36_ = aShortArray4375[i_28_];
						int i_37_ = aShortArray4375[i_29_];
						int i_38_ = aShortArray4375[i_26_ + i_36_];
						int i_39_ = aShortArray4375[i_27_ + i_36_];
						int i_40_ = aShortArray4375[i_26_ + i_37_];
						int i_41_ = aShortArray4375[i_27_ + i_37_];
						int i_42_ = method6608(aShortArray4375[i_24_ + i_38_], i_21_, i_22_, i_23_);
						int i_43_ = method6608(aShortArray4375[i_25_ + i_38_], i_33_, i_22_, i_23_);
						int i_44_ = i_42_ + (i_30_ * (i_43_ - i_42_) >> 12);
						i_42_ = method6608(aShortArray4375[i_24_ + i_39_], i_21_, i_34_, i_23_);
						i_43_ = method6608(aShortArray4375[i_25_ + i_39_], i_33_, i_34_, i_23_);
						int i_45_ = i_42_ + (i_30_ * (i_43_ - i_42_) >> 12);
						int i_46_ = i_44_ + (i_31_ * (i_45_ - i_44_) >> 12);
						i_42_ = method6608(aShortArray4375[i_24_ + i_40_], i_21_, i_22_, i_35_);
						i_43_ = method6608(aShortArray4375[i_25_ + i_40_], i_33_, i_22_, i_35_);
						i_44_ = i_42_ + (i_30_ * (i_43_ - i_42_) >> 12);
						i_42_ = method6608(aShortArray4375[i_24_ + i_41_], i_21_, i_34_, i_35_);
						i_43_ = method6608(aShortArray4375[i_25_ + i_41_], i_33_, i_34_, i_35_);
						i_45_ = i_42_ + (i_30_ * (i_43_ - i_42_) >> 12);
						int i_47_ = i_44_ + (i_31_ * (i_45_ - i_44_) >> 12);
						method6606(i_16_, i_46_ + (i_32_ * (i_47_ - i_46_) >> 12));
					}
					method6605();
				}
			}
		}
	}

	abstract void method6604();

	abstract void method6605();

	abstract void method6606(int i, int i_48_);

	void method6607() {
		aShortArray4374 = new short[anInt4372];
		for (int i = 0; i < anInt4372; i++)
			aShortArray4374[i] = (short) (int) Math.pow(2.0, (double) i);
	}

	static int method6608(int i, int i_49_, int i_50_, int i_51_) {
		int i_52_ = i & 0xf;
		int i_53_ = i_52_ < 8 ? i_49_ : i_50_;
		int i_54_ = i_52_ < 4 ? i_50_ : i_52_ == 12 || i_52_ == 14 ? i_49_ : i_51_;
		return (((i_52_ & 0x1) == 0 ? i_53_ : -i_53_) + ((i_52_ & 0x2) == 0 ? i_54_ : -i_54_));
	}

	void method6609() {
		Random random = new Random((long) anInt4376);
		for (int i = 0; i < 255; i++)
			aShortArray4375[i] = (short) i;
		for (int i = 0; i < 255; i++) {
			int i_55_ = 255 - i;
			int i_56_ = Class24_Sub10.method17391(random, i_55_, -505179117);
			short i_57_ = aShortArray4375[i_56_];
			aShortArray4375[i_56_] = aShortArray4375[i_55_];
			aShortArray4375[i_55_] = aShortArray4375[i_55_ + 256] = i_57_;
		}
	}

	static final int method6610(int i) {
		int i_58_ = i * (i * i >> 12) >> 12;
		int i_59_ = i * 6 - 61440;
		int i_60_ = 40960 + (i_59_ * i >> 12);
		return i_60_ * i_58_ >> 12;
	}

	static {
		for (int i = 0; i < 4096; i++)
			anIntArray4380[i] = method6610(i);
	}

	void method6611(int i, int i_61_, int i_62_) {
		int[] is = new int[i];
		int[] is_63_ = new int[i_61_];
		int[] is_64_ = new int[i_62_];
		for (int i_65_ = 0; i_65_ < i; i_65_++)
			is[i_65_] = (i_65_ << 12) / i;
		for (int i_66_ = 0; i_66_ < i_61_; i_66_++)
			is_63_[i_66_] = (i_66_ << 12) / i_61_;
		for (int i_67_ = 0; i_67_ < i_62_; i_67_++)
			is_64_[i_67_] = (i_67_ << 12) / i_62_;
		method6622();
		for (int i_68_ = 0; i_68_ < i_62_; i_68_++) {
			for (int i_69_ = 0; i_69_ < i_61_; i_69_++) {
				for (int i_70_ = 0; i_70_ < i; i_70_++) {
					for (int i_71_ = 0; i_71_ < anInt4372; i_71_++) {
						int i_72_ = aShortArray4374[i_71_] << 12;
						int i_73_ = anInt4377 * i_72_ >> 12;
						int i_74_ = anInt4378 * i_72_ >> 12;
						int i_75_ = anInt4379 * i_72_ >> 12;
						int i_76_ = is[i_70_] * i_72_ >> 12;
						int i_77_ = is_63_[i_69_] * i_72_ >> 12;
						int i_78_ = is_64_[i_68_] * i_72_ >> 12;
						i_76_ *= anInt4377;
						i_77_ *= anInt4378;
						i_78_ *= anInt4379;
						int i_79_ = i_76_ >> 12;
						int i_80_ = i_79_ + 1;
						i_79_ &= 0xff;
						int i_81_ = i_77_ >> 12;
						int i_82_ = i_81_ + 1;
						i_81_ &= 0xff;
						int i_83_ = i_78_ >> 12;
						int i_84_ = i_83_ + 1;
						i_83_ &= 0xff;
						if (i_80_ >= i_73_)
							i_80_ = 0;
						else
							i_80_ &= 0xff;
						if (i_82_ >= i_74_)
							i_82_ = 0;
						else
							i_82_ &= 0xff;
						if (i_84_ >= i_75_)
							i_84_ = 0;
						else
							i_84_ &= 0xff;
						i_76_ &= 0xfff;
						i_77_ &= 0xfff;
						i_78_ &= 0xfff;
						int i_85_ = anIntArray4380[i_76_];
						int i_86_ = anIntArray4380[i_77_];
						int i_87_ = anIntArray4380[i_78_];
						int i_88_ = i_76_ - 4096;
						int i_89_ = i_77_ - 4096;
						int i_90_ = i_78_ - 4096;
						int i_91_ = aShortArray4375[i_83_];
						int i_92_ = aShortArray4375[i_84_];
						int i_93_ = aShortArray4375[i_81_ + i_91_];
						int i_94_ = aShortArray4375[i_82_ + i_91_];
						int i_95_ = aShortArray4375[i_81_ + i_92_];
						int i_96_ = aShortArray4375[i_82_ + i_92_];
						int i_97_ = method6608(aShortArray4375[i_79_ + i_93_], i_76_, i_77_, i_78_);
						int i_98_ = method6608(aShortArray4375[i_80_ + i_93_], i_88_, i_77_, i_78_);
						int i_99_ = i_97_ + (i_85_ * (i_98_ - i_97_) >> 12);
						i_97_ = method6608(aShortArray4375[i_79_ + i_94_], i_76_, i_89_, i_78_);
						i_98_ = method6608(aShortArray4375[i_80_ + i_94_], i_88_, i_89_, i_78_);
						int i_100_ = i_97_ + (i_85_ * (i_98_ - i_97_) >> 12);
						int i_101_ = i_99_ + (i_86_ * (i_100_ - i_99_) >> 12);
						i_97_ = method6608(aShortArray4375[i_79_ + i_95_], i_76_, i_77_, i_90_);
						i_98_ = method6608(aShortArray4375[i_80_ + i_95_], i_88_, i_77_, i_90_);
						i_99_ = i_97_ + (i_85_ * (i_98_ - i_97_) >> 12);
						i_97_ = method6608(aShortArray4375[i_79_ + i_96_], i_76_, i_89_, i_90_);
						i_98_ = method6608(aShortArray4375[i_80_ + i_96_], i_88_, i_89_, i_90_);
						i_100_ = i_97_ + (i_85_ * (i_98_ - i_97_) >> 12);
						int i_102_ = i_99_ + (i_86_ * (i_100_ - i_99_) >> 12);
						method6606(i_71_, i_101_ + (i_87_ * (i_102_ - i_101_) >> 12));
					}
					method6605();
				}
			}
		}
	}

	void method6612() {
		Random random = new Random((long) anInt4376);
		for (int i = 0; i < 255; i++)
			aShortArray4375[i] = (short) i;
		for (int i = 0; i < 255; i++) {
			int i_103_ = 255 - i;
			int i_104_ = Class24_Sub10.method17391(random, i_103_, -901742878);
			short i_105_ = aShortArray4375[i_104_];
			aShortArray4375[i_104_] = aShortArray4375[i_103_];
			aShortArray4375[i_103_] = aShortArray4375[i_103_ + 256] = i_105_;
		}
	}

	abstract void method6613();

	Class412(int i, int i_106_, int i_107_, int i_108_, int i_109_) {
		anInt4372 = 4;
		anInt4376 = i;
		anInt4377 = i_107_;
		anInt4378 = i_108_;
		anInt4379 = i_109_;
		anInt4372 = i_106_;
		method6621();
		method6609();
	}

	abstract void method6614();

	abstract void method6615();

	abstract void method6616(int i, int i_110_);

	void method6617() {
		aShortArray4374 = new short[anInt4372];
		for (int i = 0; i < anInt4372; i++)
			aShortArray4374[i] = (short) (int) Math.pow(2.0, (double) i);
	}

	static final int method6618(int i) {
		int i_111_ = i * (i * i >> 12) >> 12;
		int i_112_ = i * 6 - 61440;
		int i_113_ = 40960 + (i_112_ * i >> 12);
		return i_113_ * i_111_ >> 12;
	}

	static int method6619(int i, int i_114_, int i_115_, int i_116_) {
		int i_117_ = i & 0xf;
		int i_118_ = i_117_ < 8 ? i_114_ : i_115_;
		int i_119_ = (i_117_ < 4 ? i_115_ : i_117_ == 12 || i_117_ == 14 ? i_114_ : i_116_);
		return (((i_117_ & 0x1) == 0 ? i_118_ : -i_118_) + ((i_117_ & 0x2) == 0 ? i_119_ : -i_119_));
	}

	static int method6620(int i, int i_120_, int i_121_, int i_122_) {
		int i_123_ = i & 0xf;
		int i_124_ = i_123_ < 8 ? i_120_ : i_121_;
		int i_125_ = (i_123_ < 4 ? i_121_ : i_123_ == 12 || i_123_ == 14 ? i_120_ : i_122_);
		return (((i_123_ & 0x1) == 0 ? i_124_ : -i_124_) + ((i_123_ & 0x2) == 0 ? i_125_ : -i_125_));
	}

	void method6621() {
		aShortArray4374 = new short[anInt4372];
		for (int i = 0; i < anInt4372; i++)
			aShortArray4374[i] = (short) (int) Math.pow(2.0, (double) i);
	}

	abstract void method6622();

	void method6623() {
		Random random = new Random((long) anInt4376);
		for (int i = 0; i < 255; i++)
			aShortArray4375[i] = (short) i;
		for (int i = 0; i < 255; i++) {
			int i_126_ = 255 - i;
			int i_127_ = Class24_Sub10.method17391(random, i_126_, -1139637372);
			short i_128_ = aShortArray4375[i_127_];
			aShortArray4375[i_127_] = aShortArray4375[i_126_];
			aShortArray4375[i_126_] = aShortArray4375[i_126_ + 256] = i_128_;
		}
	}

	void method6624(int i, int i_129_, int i_130_) {
		int[] is = new int[i];
		int[] is_131_ = new int[i_129_];
		int[] is_132_ = new int[i_130_];
		for (int i_133_ = 0; i_133_ < i; i_133_++)
			is[i_133_] = (i_133_ << 12) / i;
		for (int i_134_ = 0; i_134_ < i_129_; i_134_++)
			is_131_[i_134_] = (i_134_ << 12) / i_129_;
		for (int i_135_ = 0; i_135_ < i_130_; i_135_++)
			is_132_[i_135_] = (i_135_ << 12) / i_130_;
		method6622();
		for (int i_136_ = 0; i_136_ < i_130_; i_136_++) {
			for (int i_137_ = 0; i_137_ < i_129_; i_137_++) {
				for (int i_138_ = 0; i_138_ < i; i_138_++) {
					for (int i_139_ = 0; i_139_ < anInt4372; i_139_++) {
						int i_140_ = aShortArray4374[i_139_] << 12;
						int i_141_ = anInt4377 * i_140_ >> 12;
						int i_142_ = anInt4378 * i_140_ >> 12;
						int i_143_ = anInt4379 * i_140_ >> 12;
						int i_144_ = is[i_138_] * i_140_ >> 12;
						int i_145_ = is_131_[i_137_] * i_140_ >> 12;
						int i_146_ = is_132_[i_136_] * i_140_ >> 12;
						i_144_ *= anInt4377;
						i_145_ *= anInt4378;
						i_146_ *= anInt4379;
						int i_147_ = i_144_ >> 12;
						int i_148_ = i_147_ + 1;
						i_147_ &= 0xff;
						int i_149_ = i_145_ >> 12;
						int i_150_ = i_149_ + 1;
						i_149_ &= 0xff;
						int i_151_ = i_146_ >> 12;
						int i_152_ = i_151_ + 1;
						i_151_ &= 0xff;
						if (i_148_ >= i_141_)
							i_148_ = 0;
						else
							i_148_ &= 0xff;
						if (i_150_ >= i_142_)
							i_150_ = 0;
						else
							i_150_ &= 0xff;
						if (i_152_ >= i_143_)
							i_152_ = 0;
						else
							i_152_ &= 0xff;
						i_144_ &= 0xfff;
						i_145_ &= 0xfff;
						i_146_ &= 0xfff;
						int i_153_ = anIntArray4380[i_144_];
						int i_154_ = anIntArray4380[i_145_];
						int i_155_ = anIntArray4380[i_146_];
						int i_156_ = i_144_ - 4096;
						int i_157_ = i_145_ - 4096;
						int i_158_ = i_146_ - 4096;
						int i_159_ = aShortArray4375[i_151_];
						int i_160_ = aShortArray4375[i_152_];
						int i_161_ = aShortArray4375[i_149_ + i_159_];
						int i_162_ = aShortArray4375[i_150_ + i_159_];
						int i_163_ = aShortArray4375[i_149_ + i_160_];
						int i_164_ = aShortArray4375[i_150_ + i_160_];
						int i_165_ = method6608(aShortArray4375[i_147_ + i_161_], i_144_, i_145_, i_146_);
						int i_166_ = method6608(aShortArray4375[i_148_ + i_161_], i_156_, i_145_, i_146_);
						int i_167_ = i_165_ + (i_153_ * (i_166_ - i_165_) >> 12);
						i_165_ = method6608(aShortArray4375[i_147_ + i_162_], i_144_, i_157_, i_146_);
						i_166_ = method6608(aShortArray4375[i_148_ + i_162_], i_156_, i_157_, i_146_);
						int i_168_ = i_165_ + (i_153_ * (i_166_ - i_165_) >> 12);
						int i_169_ = i_167_ + (i_154_ * (i_168_ - i_167_) >> 12);
						i_165_ = method6608(aShortArray4375[i_147_ + i_163_], i_144_, i_145_, i_158_);
						i_166_ = method6608(aShortArray4375[i_148_ + i_163_], i_156_, i_145_, i_158_);
						i_167_ = i_165_ + (i_153_ * (i_166_ - i_165_) >> 12);
						i_165_ = method6608(aShortArray4375[i_147_ + i_164_], i_144_, i_157_, i_158_);
						i_166_ = method6608(aShortArray4375[i_148_ + i_164_], i_156_, i_157_, i_158_);
						i_168_ = i_165_ + (i_153_ * (i_166_ - i_165_) >> 12);
						int i_170_ = i_167_ + (i_154_ * (i_168_ - i_167_) >> 12);
						method6606(i_139_, i_169_ + (i_155_ * (i_170_ - i_169_) >> 12));
					}
					method6605();
				}
			}
		}
	}
}
