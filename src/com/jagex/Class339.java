/* Class339 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

public class Class339 {
	Class160_Sub2 aClass160_Sub2_3649;
	int anInt3650;
	int anInt3651;
	int anInt3652;
	int anInt3653;
	int anInt3654;
	byte[] aByteArray3655;
	Class167_Sub3 aClass167_Sub3_3656;
	Class337[][] aClass337ArrayArray3657;

	void method4433() {
		aClass337ArrayArray3657 = new Class337[anInt3654][anInt3650];
		for (int i = 0; i < anInt3650; i++) {
			for (int i_0_ = 0; i_0_ < anInt3654; i_0_++) {
				aClass337ArrayArray3657[i_0_][i] = new Class337(aClass167_Sub3_3656, this, aClass160_Sub2_3649, i_0_, i, anInt3652, i_0_ * 128 + 1, i * 128 + 1);
				if (aClass337ArrayArray3657[i_0_][i].anInt3640 == 0)
					aClass337ArrayArray3657[i_0_][i] = null;
			}
		}
	}

	void method4434(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_1_) {
		Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1 = (Class536_Sub18_Sub7_Sub1) class536_sub18_sub7;
		i += class536_sub18_sub7_sub1.anInt12054 + 1;
		i_1_ += class536_sub18_sub7_sub1.anInt12051 + 1;
		int i_2_ = i + i_1_ * anInt3651;
		int i_3_ = 0;
		int i_4_ = class536_sub18_sub7_sub1.anInt12052;
		int i_5_ = class536_sub18_sub7_sub1.anInt12055;
		int i_6_ = anInt3651 - i_5_;
		int i_7_ = 0;
		if (i_1_ <= 0) {
			int i_8_ = 1 - i_1_;
			i_4_ -= i_8_;
			i_3_ += i_8_ * i_5_;
			i_2_ += i_8_ * anInt3651;
			i_1_ = 1;
		}
		if (i_1_ + i_4_ >= anInt3653) {
			int i_9_ = i_1_ + i_4_ + 1 - anInt3653;
			i_4_ -= i_9_;
		}
		if (i <= 0) {
			int i_10_ = 1 - i;
			i_5_ -= i_10_;
			i_3_ += i_10_;
			i_2_ += i_10_;
			i_7_ += i_10_;
			i_6_ += i_10_;
			i = 1;
		}
		if (i + i_5_ >= anInt3651) {
			int i_11_ = i + i_5_ + 1 - anInt3651;
			i_5_ -= i_11_;
			i_7_ += i_11_;
			i_6_ += i_11_;
		}
		if (i_5_ > 0 && i_4_ > 0) {
			method4442(aByteArray3655, class536_sub18_sub7_sub1.aByteArray12056, i_3_, i_2_, i_5_, i_4_, i_6_, i_7_);
			method4437(i, i_1_, i_5_, i_4_);
		}
	}

	void method4435(int i, int i_12_, int i_13_, int i_14_) {
		if (aClass337ArrayArray3657 != null) {
			int i_15_ = i - 1 >> 7;
			int i_16_ = i - 1 + i_13_ - 1 >> 7;
			int i_17_ = i_12_ - 1 >> 7;
			int i_18_ = i_12_ - 1 + i_14_ - 1 >> 7;
			for (int i_19_ = i_15_; i_19_ <= i_16_; i_19_++) {
				Class337[] class337s = aClass337ArrayArray3657[i_19_];
				for (int i_20_ = i_17_; i_20_ <= i_18_; i_20_++) {
					if (class337s[i_20_] != null)
						class337s[i_20_].aBool3641 = true;
				}
			}
		}
	}

	boolean method4436(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_21_) {
		Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1 = (Class536_Sub18_Sub7_Sub1) class536_sub18_sub7;
		i += class536_sub18_sub7_sub1.anInt12054 + 1;
		i_21_ += class536_sub18_sub7_sub1.anInt12051 + 1;
		int i_22_ = i + i_21_ * anInt3651;
		int i_23_ = class536_sub18_sub7_sub1.anInt12052;
		int i_24_ = class536_sub18_sub7_sub1.anInt12055;
		int i_25_ = anInt3651 - i_24_;
		if (i_21_ <= 0) {
			int i_26_ = 1 - i_21_;
			i_23_ -= i_26_;
			i_22_ += i_26_ * anInt3651;
			i_21_ = 1;
		}
		if (i_21_ + i_23_ >= anInt3653) {
			int i_27_ = i_21_ + i_23_ + 1 - anInt3653;
			i_23_ -= i_27_;
		}
		if (i <= 0) {
			int i_28_ = 1 - i;
			i_24_ -= i_28_;
			i_22_ += i_28_;
			i_25_ += i_28_;
			i = 1;
		}
		if (i + i_24_ >= anInt3651) {
			int i_29_ = i + i_24_ + 1 - anInt3651;
			i_24_ -= i_29_;
			i_25_ += i_29_;
		}
		if (i_24_ <= 0 || i_23_ <= 0)
			return false;
		int i_30_ = 8;
		i_25_ += (i_30_ - 1) * anInt3651;
		return method4440(aByteArray3655, i_22_, i_24_, i_23_, i_25_, i_30_);
	}

	void method4437(int i, int i_31_, int i_32_, int i_33_) {
		if (aClass337ArrayArray3657 != null) {
			int i_34_ = i - 1 >> 7;
			int i_35_ = i - 1 + i_32_ - 1 >> 7;
			int i_36_ = i_31_ - 1 >> 7;
			int i_37_ = i_31_ - 1 + i_33_ - 1 >> 7;
			for (int i_38_ = i_34_; i_38_ <= i_35_; i_38_++) {
				Class337[] class337s = aClass337ArrayArray3657[i_38_];
				for (int i_39_ = i_36_; i_39_ <= i_37_; i_39_++) {
					if (class337s[i_39_] != null)
						class337s[i_39_].aBool3641 = true;
				}
			}
		}
	}

	void method4438(Class327 class327, int i, int i_40_, int i_41_, boolean[][] bools, boolean bool) {
		aClass167_Sub3_3656.method2302(false);
		float f = 1.0F / (float) (aClass167_Sub3_3656.anInt9632 * 128);
		if (bool) {
			for (int i_42_ = 0; i_42_ < anInt3650; i_42_++) {
				int i_43_ = i_42_ << anInt3652;
				int i_44_ = i_42_ + 1 << anInt3652;
				for (int i_45_ = 0; i_45_ < anInt3654; i_45_++) {
					if (aClass337ArrayArray3657[i_45_][i_42_] != null) {
						int i_46_ = i_45_ << anInt3652;
						int i_47_ = i_45_ + 1 << anInt3652;
						while_34_: for (int i_48_ = i_46_; i_48_ < i_47_; i_48_++) {
							if (i_48_ - i >= -i_41_ && i_48_ - i <= i_41_) {
								for (int i_49_ = i_43_; i_49_ < i_44_; i_49_++) {
									if (i_49_ - i_40_ >= -i_41_ && i_49_ - i_40_ <= i_41_ && (bools[i_48_ - i + i_41_][i_49_ - i_40_ + i_41_])) {
										class327.aClass443_3571.method5344(f, f, 1.0F, 1.0F);
										class327.aClass443_3571.aFloatArray4878[12] = (float) -i_45_;
										class327.aClass443_3571.aFloatArray4878[13] = (float) -i_42_;
										aClass337ArrayArray3657[i_45_][i_42_].method4380(class327);
										break while_34_;
									}
								}
							}
						}
					}
				}
			}
		} else {
			int[] is = new int[anInt3650 * anInt3654];
			ByteBuffer bytebuffer = aClass167_Sub3_3656.aByteBuffer9549;
			bytebuffer.clear();
			int i_50_ = 0;
			for (int i_51_ = 0; i_51_ < anInt3650; i_51_++) {
				int i_52_ = i_51_ << anInt3652;
				int i_53_ = i_51_ + 1 << anInt3652;
				for (int i_54_ = 0; i_54_ < anInt3654; i_54_++) {
					Class337 class337 = aClass337ArrayArray3657[i_54_][i_51_];
					int i_55_ = 0;
					if (class337 != null) {
						int i_56_ = i_54_ << anInt3652;
						int i_57_ = i_54_ + 1 << anInt3652;
						for (int i_58_ = i_52_; i_58_ < i_53_; i_58_++) {
							if (i_58_ - i_40_ >= -i_41_ && i_58_ - i_40_ <= i_41_) {
								int i_59_ = (i_58_ * (aClass160_Sub2_3649.anInt1766 * 1718142487) + i_56_);
								for (int i_60_ = i_56_; i_60_ < i_57_; i_60_++) {
									if (i_60_ - i >= -i_41_ && i_60_ - i <= i_41_ && (bools[i_60_ - i + i_41_][i_58_ - i_40_ + i_41_])) {
										short[] is_61_ = (aClass160_Sub2_3649.aShortArrayArray9402[i_59_]);
										if (is_61_ != null) {
											for (int i_62_ = 0; i_62_ < is_61_.length; i_62_++) {
												bytebuffer.putShort(is_61_[i_62_]);
												i_55_++;
											}
										}
									}
									i_59_++;
								}
							}
						}
					}
					is[i_50_] = i_55_;
					i_50_++;
				}
			}
			if (bytebuffer.position() != 0) {
				int i_63_ = bytebuffer.position();
				Interface41 interface41 = aClass167_Sub3_3656.method8737(i_63_ / 2);
				interface41.method264(0, i_63_, aClass167_Sub3_3656.aLong9586);
				int i_64_ = 0;
				i_50_ = 0;
				for (int i_65_ = 0; i_65_ < anInt3650; i_65_++) {
					for (int i_66_ = 0; i_66_ < anInt3654; i_66_++) {
						if (is[i_50_] != 0) {
							class327.aClass443_3571.method5344(f, f, 1.0F, 1.0F);
							class327.aClass443_3571.aFloatArray4878[12] = (float) -i_66_;
							class327.aClass443_3571.aFloatArray4878[13] = (float) -i_65_;
							aClass337ArrayArray3657[i_66_][i_65_].method4381(class327, interface41, i_64_, is[i_50_] / 3);
							i_64_ += is[i_50_];
						}
						i_50_++;
					}
				}
			}
		}
		aClass167_Sub3_3656.method2302(true);
	}

	static final void method4439(byte[] is, byte[] is_67_, int i, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_) {
		int i_73_ = -(i_69_ >> 2);
		i_69_ = -(i_69_ & 0x3);
		for (int i_74_ = -i_70_; i_74_ < 0; i_74_++) {
			for (int i_75_ = i_73_; i_75_ < 0; i_75_++) {
				is[i_68_++] -= is_67_[i++];
				is[i_68_++] -= is_67_[i++];
				is[i_68_++] -= is_67_[i++];
				is[i_68_++] -= is_67_[i++];
			}
			for (int i_76_ = i_69_; i_76_ < 0; i_76_++)
				is[i_68_++] -= is_67_[i++];
			i_68_ += i_71_;
			i += i_72_;
		}
	}

	static final boolean method4440(byte[] is, int i, int i_77_, int i_78_, int i_79_, int i_80_) {
		int i_81_ = i_77_ % i_80_;
		int i_82_;
		if (i_81_ != 0)
			i_82_ = i_80_ - i_81_;
		else
			i_82_ = 0;
		int i_83_ = -((i_78_ + i_80_ - 1) / i_80_);
		int i_84_ = -((i_77_ + i_80_ - 1) / i_80_);
		for (int i_85_ = i_83_; i_85_ < 0; i_85_++) {
			for (int i_86_ = i_84_; i_86_ < 0; i_86_++) {
				if (is[i] == 0)
					return true;
				i += i_80_;
			}
			i -= i_82_;
			if (is[i - 1] == 0)
				return true;
			i += i_79_;
		}
		return false;
	}

	void method4441() {
		aClass337ArrayArray3657 = new Class337[anInt3654][anInt3650];
		for (int i = 0; i < anInt3650; i++) {
			for (int i_87_ = 0; i_87_ < anInt3654; i_87_++) {
				aClass337ArrayArray3657[i_87_][i] = new Class337(aClass167_Sub3_3656, this, aClass160_Sub2_3649, i_87_, i, anInt3652, i_87_ * 128 + 1, i * 128 + 1);
				if (aClass337ArrayArray3657[i_87_][i].anInt3640 == 0)
					aClass337ArrayArray3657[i_87_][i] = null;
			}
		}
	}

	static final void method4442(byte[] is, byte[] is_88_, int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_) {
		int i_94_ = -(i_90_ >> 2);
		i_90_ = -(i_90_ & 0x3);
		for (int i_95_ = -i_91_; i_95_ < 0; i_95_++) {
			for (int i_96_ = i_94_; i_96_ < 0; i_96_++) {
				is[i_89_++] += is_88_[i++];
				is[i_89_++] += is_88_[i++];
				is[i_89_++] += is_88_[i++];
				is[i_89_++] += is_88_[i++];
			}
			for (int i_97_ = i_90_; i_97_ < 0; i_97_++)
				is[i_89_++] += is_88_[i++];
			i_89_ += i_92_;
			i += i_93_;
		}
	}

	void method4443(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_98_) {
		Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1 = (Class536_Sub18_Sub7_Sub1) class536_sub18_sub7;
		i += class536_sub18_sub7_sub1.anInt12054 + 1;
		i_98_ += class536_sub18_sub7_sub1.anInt12051 + 1;
		int i_99_ = i + i_98_ * anInt3651;
		int i_100_ = 0;
		int i_101_ = class536_sub18_sub7_sub1.anInt12052;
		int i_102_ = class536_sub18_sub7_sub1.anInt12055;
		int i_103_ = anInt3651 - i_102_;
		int i_104_ = 0;
		if (i_98_ <= 0) {
			int i_105_ = 1 - i_98_;
			i_101_ -= i_105_;
			i_100_ += i_105_ * i_102_;
			i_99_ += i_105_ * anInt3651;
			i_98_ = 1;
		}
		if (i_98_ + i_101_ >= anInt3653) {
			int i_106_ = i_98_ + i_101_ + 1 - anInt3653;
			i_101_ -= i_106_;
		}
		if (i <= 0) {
			int i_107_ = 1 - i;
			i_102_ -= i_107_;
			i_100_ += i_107_;
			i_99_ += i_107_;
			i_104_ += i_107_;
			i_103_ += i_107_;
			i = 1;
		}
		if (i + i_102_ >= anInt3651) {
			int i_108_ = i + i_102_ + 1 - anInt3651;
			i_102_ -= i_108_;
			i_104_ += i_108_;
			i_103_ += i_108_;
		}
		if (i_102_ > 0 && i_101_ > 0) {
			method4439(aByteArray3655, class536_sub18_sub7_sub1.aByteArray12056, i_100_, i_99_, i_102_, i_101_, i_103_, i_104_);
			method4437(i, i_98_, i_102_, i_101_);
		}
	}

	boolean method4444(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_109_) {
		Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1 = (Class536_Sub18_Sub7_Sub1) class536_sub18_sub7;
		i += class536_sub18_sub7_sub1.anInt12054 + 1;
		i_109_ += class536_sub18_sub7_sub1.anInt12051 + 1;
		int i_110_ = i + i_109_ * anInt3651;
		int i_111_ = class536_sub18_sub7_sub1.anInt12052;
		int i_112_ = class536_sub18_sub7_sub1.anInt12055;
		int i_113_ = anInt3651 - i_112_;
		if (i_109_ <= 0) {
			int i_114_ = 1 - i_109_;
			i_111_ -= i_114_;
			i_110_ += i_114_ * anInt3651;
			i_109_ = 1;
		}
		if (i_109_ + i_111_ >= anInt3653) {
			int i_115_ = i_109_ + i_111_ + 1 - anInt3653;
			i_111_ -= i_115_;
		}
		if (i <= 0) {
			int i_116_ = 1 - i;
			i_112_ -= i_116_;
			i_110_ += i_116_;
			i_113_ += i_116_;
			i = 1;
		}
		if (i + i_112_ >= anInt3651) {
			int i_117_ = i + i_112_ + 1 - anInt3651;
			i_112_ -= i_117_;
			i_113_ += i_117_;
		}
		if (i_112_ <= 0 || i_111_ <= 0)
			return false;
		int i_118_ = 8;
		i_113_ += (i_118_ - 1) * anInt3651;
		return method4440(aByteArray3655, i_110_, i_112_, i_111_, i_113_, i_118_);
	}

	void method4445(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_119_) {
		Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1 = (Class536_Sub18_Sub7_Sub1) class536_sub18_sub7;
		i += class536_sub18_sub7_sub1.anInt12054 + 1;
		i_119_ += class536_sub18_sub7_sub1.anInt12051 + 1;
		int i_120_ = i + i_119_ * anInt3651;
		int i_121_ = 0;
		int i_122_ = class536_sub18_sub7_sub1.anInt12052;
		int i_123_ = class536_sub18_sub7_sub1.anInt12055;
		int i_124_ = anInt3651 - i_123_;
		int i_125_ = 0;
		if (i_119_ <= 0) {
			int i_126_ = 1 - i_119_;
			i_122_ -= i_126_;
			i_121_ += i_126_ * i_123_;
			i_120_ += i_126_ * anInt3651;
			i_119_ = 1;
		}
		if (i_119_ + i_122_ >= anInt3653) {
			int i_127_ = i_119_ + i_122_ + 1 - anInt3653;
			i_122_ -= i_127_;
		}
		if (i <= 0) {
			int i_128_ = 1 - i;
			i_123_ -= i_128_;
			i_121_ += i_128_;
			i_120_ += i_128_;
			i_125_ += i_128_;
			i_124_ += i_128_;
			i = 1;
		}
		if (i + i_123_ >= anInt3651) {
			int i_129_ = i + i_123_ + 1 - anInt3651;
			i_123_ -= i_129_;
			i_125_ += i_129_;
			i_124_ += i_129_;
		}
		if (i_123_ > 0 && i_122_ > 0) {
			method4442(aByteArray3655, class536_sub18_sub7_sub1.aByteArray12056, i_121_, i_120_, i_123_, i_122_, i_124_, i_125_);
			method4437(i, i_119_, i_123_, i_122_);
		}
	}

	void method4446(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_130_) {
		Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1 = (Class536_Sub18_Sub7_Sub1) class536_sub18_sub7;
		i += class536_sub18_sub7_sub1.anInt12054 + 1;
		i_130_ += class536_sub18_sub7_sub1.anInt12051 + 1;
		int i_131_ = i + i_130_ * anInt3651;
		int i_132_ = 0;
		int i_133_ = class536_sub18_sub7_sub1.anInt12052;
		int i_134_ = class536_sub18_sub7_sub1.anInt12055;
		int i_135_ = anInt3651 - i_134_;
		int i_136_ = 0;
		if (i_130_ <= 0) {
			int i_137_ = 1 - i_130_;
			i_133_ -= i_137_;
			i_132_ += i_137_ * i_134_;
			i_131_ += i_137_ * anInt3651;
			i_130_ = 1;
		}
		if (i_130_ + i_133_ >= anInt3653) {
			int i_138_ = i_130_ + i_133_ + 1 - anInt3653;
			i_133_ -= i_138_;
		}
		if (i <= 0) {
			int i_139_ = 1 - i;
			i_134_ -= i_139_;
			i_132_ += i_139_;
			i_131_ += i_139_;
			i_136_ += i_139_;
			i_135_ += i_139_;
			i = 1;
		}
		if (i + i_134_ >= anInt3651) {
			int i_140_ = i + i_134_ + 1 - anInt3651;
			i_134_ -= i_140_;
			i_136_ += i_140_;
			i_135_ += i_140_;
		}
		if (i_134_ > 0 && i_133_ > 0) {
			method4439(aByteArray3655, class536_sub18_sub7_sub1.aByteArray12056, i_132_, i_131_, i_134_, i_133_, i_135_, i_136_);
			method4437(i, i_130_, i_134_, i_133_);
		}
	}

	static final void method4447(byte[] is, byte[] is_141_, int i, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_) {
		int i_147_ = -(i_143_ >> 2);
		i_143_ = -(i_143_ & 0x3);
		for (int i_148_ = -i_144_; i_148_ < 0; i_148_++) {
			for (int i_149_ = i_147_; i_149_ < 0; i_149_++) {
				is[i_142_++] += is_141_[i++];
				is[i_142_++] += is_141_[i++];
				is[i_142_++] += is_141_[i++];
				is[i_142_++] += is_141_[i++];
			}
			for (int i_150_ = i_143_; i_150_ < 0; i_150_++)
				is[i_142_++] += is_141_[i++];
			i_142_ += i_145_;
			i += i_146_;
		}
	}

	static final void method4448(byte[] is, byte[] is_151_, int i, int i_152_, int i_153_, int i_154_, int i_155_, int i_156_) {
		int i_157_ = -(i_153_ >> 2);
		i_153_ = -(i_153_ & 0x3);
		for (int i_158_ = -i_154_; i_158_ < 0; i_158_++) {
			for (int i_159_ = i_157_; i_159_ < 0; i_159_++) {
				is[i_152_++] += is_151_[i++];
				is[i_152_++] += is_151_[i++];
				is[i_152_++] += is_151_[i++];
				is[i_152_++] += is_151_[i++];
			}
			for (int i_160_ = i_153_; i_160_ < 0; i_160_++)
				is[i_152_++] += is_151_[i++];
			i_152_ += i_155_;
			i += i_156_;
		}
	}

	static final void method4449(byte[] is, byte[] is_161_, int i, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_) {
		int i_167_ = -(i_163_ >> 2);
		i_163_ = -(i_163_ & 0x3);
		for (int i_168_ = -i_164_; i_168_ < 0; i_168_++) {
			for (int i_169_ = i_167_; i_169_ < 0; i_169_++) {
				is[i_162_++] += is_161_[i++];
				is[i_162_++] += is_161_[i++];
				is[i_162_++] += is_161_[i++];
				is[i_162_++] += is_161_[i++];
			}
			for (int i_170_ = i_163_; i_170_ < 0; i_170_++)
				is[i_162_++] += is_161_[i++];
			i_162_ += i_165_;
			i += i_166_;
		}
	}

	void method4450(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_171_) {
		Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1 = (Class536_Sub18_Sub7_Sub1) class536_sub18_sub7;
		i += class536_sub18_sub7_sub1.anInt12054 + 1;
		i_171_ += class536_sub18_sub7_sub1.anInt12051 + 1;
		int i_172_ = i + i_171_ * anInt3651;
		int i_173_ = 0;
		int i_174_ = class536_sub18_sub7_sub1.anInt12052;
		int i_175_ = class536_sub18_sub7_sub1.anInt12055;
		int i_176_ = anInt3651 - i_175_;
		int i_177_ = 0;
		if (i_171_ <= 0) {
			int i_178_ = 1 - i_171_;
			i_174_ -= i_178_;
			i_173_ += i_178_ * i_175_;
			i_172_ += i_178_ * anInt3651;
			i_171_ = 1;
		}
		if (i_171_ + i_174_ >= anInt3653) {
			int i_179_ = i_171_ + i_174_ + 1 - anInt3653;
			i_174_ -= i_179_;
		}
		if (i <= 0) {
			int i_180_ = 1 - i;
			i_175_ -= i_180_;
			i_173_ += i_180_;
			i_172_ += i_180_;
			i_177_ += i_180_;
			i_176_ += i_180_;
			i = 1;
		}
		if (i + i_175_ >= anInt3651) {
			int i_181_ = i + i_175_ + 1 - anInt3651;
			i_175_ -= i_181_;
			i_177_ += i_181_;
			i_176_ += i_181_;
		}
		if (i_175_ > 0 && i_174_ > 0) {
			method4439(aByteArray3655, class536_sub18_sub7_sub1.aByteArray12056, i_173_, i_172_, i_175_, i_174_, i_176_, i_177_);
			method4437(i, i_171_, i_175_, i_174_);
		}
	}

	Class339(Class167_Sub3 class167_sub3, Class160_Sub2 class160_sub2) {
		aClass167_Sub3_3656 = class167_sub3;
		aClass160_Sub2_3649 = class160_sub2;
		anInt3651 = 2 + ((aClass160_Sub2_3649.anInt1766 * 1718142487 * (aClass160_Sub2_3649.anInt1767 * -1504778739)) >> aClass167_Sub3_3656.anInt9633);
		anInt3653 = 2 + ((aClass160_Sub2_3649.anInt1769 * -889224915 * (aClass160_Sub2_3649.anInt1767 * -1504778739)) >> aClass167_Sub3_3656.anInt9633);
		aByteArray3655 = new byte[anInt3651 * anInt3653];
		anInt3652 = (7 + aClass167_Sub3_3656.anInt9633 - aClass160_Sub2_3649.anInt1768 * 2064238369);
		anInt3654 = aClass160_Sub2_3649.anInt1766 * 1718142487 >> anInt3652;
		anInt3650 = aClass160_Sub2_3649.anInt1769 * -889224915 >> anInt3652;
	}
}
