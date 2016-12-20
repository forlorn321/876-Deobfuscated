/* Class351 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

public class Class351 {
	Class356[][] aClass356ArrayArray3755;
	Class161_Sub3 aClass161_Sub3_3756;
	int anInt3757;
	Class180_Sub2 aClass180_Sub2_3758;
	byte[] aByteArray3759;
	int anInt3760;
	int anInt3761;
	int anInt3762;
	int anInt3763;

	static final boolean method6181(byte[] is, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		int i_4_ = i_0_ % i_3_;
		int i_5_;
		if (i_4_ != 0)
			i_5_ = i_3_ - i_4_;
		else
			i_5_ = 0;
		int i_6_ = -((i_1_ + i_3_ - 1) / i_3_);
		int i_7_ = -((i_0_ + i_3_ - 1) / i_3_);
		for (int i_8_ = i_6_; i_8_ < 0; i_8_++) {
			for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
				if (is[i] == 0)
					return true;
				i += i_3_;
			}
			i -= i_5_;
			if (is[i - 1] == 0)
				return true;
			i += i_2_;
		}
		return false;
	}

	Class351(Class180_Sub2 class180_sub2, Class161_Sub3 class161_sub3) {
		aClass180_Sub2_3758 = class180_sub2;
		aClass161_Sub3_3756 = class161_sub3;
		anInt3757 = 2 + ((aClass161_Sub3_3756.anInt1750 * 1210322533 * (aClass161_Sub3_3756.anInt1752 * 1048375491)) >> aClass180_Sub2_3758.anInt9522);
		anInt3763 = 2 + ((aClass161_Sub3_3756.anInt1751 * -533476177 * (aClass161_Sub3_3756.anInt1752 * 1048375491)) >> aClass180_Sub2_3758.anInt9522);
		aByteArray3759 = new byte[anInt3757 * anInt3763];
		anInt3762 = (7 + aClass180_Sub2_3758.anInt9522 - aClass161_Sub3_3756.anInt1753 * 1252000143);
		anInt3760 = aClass161_Sub3_3756.anInt1750 * 1210322533 >> anInt3762;
		anInt3761 = aClass161_Sub3_3756.anInt1751 * -533476177 >> anInt3762;
	}

	void method6182(Class326 class326, int i, int i_10_, int i_11_, boolean[][] bools, boolean bool) {
		aClass180_Sub2_3758.method3182(false);
		float f = 1.0F / (float) (aClass180_Sub2_3758.anInt9483 * 128);
		if (bool) {
			for (int i_12_ = 0; i_12_ < anInt3761; i_12_++) {
				int i_13_ = i_12_ << anInt3762;
				int i_14_ = i_12_ + 1 << anInt3762;
				for (int i_15_ = 0; i_15_ < anInt3760; i_15_++) {
					if (aClass356ArrayArray3755[i_15_][i_12_] != null) {
						int i_16_ = i_15_ << anInt3762;
						int i_17_ = i_15_ + 1 << anInt3762;
						while_18_: for (int i_18_ = i_16_; i_18_ < i_17_; i_18_++) {
							if (i_18_ - i >= -i_11_ && i_18_ - i <= i_11_) {
								for (int i_19_ = i_13_; i_19_ < i_14_; i_19_++) {
									if (i_19_ - i_10_ >= -i_11_ && i_19_ - i_10_ <= i_11_ && (bools[i_18_ - i + i_11_][i_19_ - i_10_ + i_11_])) {
										class326.aClass427_3583.method6815(f, f, 1.0F, 1.0F);
										class326.aClass427_3583.aFloatArray4807[12] = (float) -i_15_;
										class326.aClass427_3583.aFloatArray4807[13] = (float) -i_12_;
										aClass356ArrayArray3755[i_15_][i_12_].method6261(class326);
										break while_18_;
									}
								}
							}
						}
					}
				}
			}
		} else {
			int[] is = new int[anInt3761 * anInt3760];
			ByteBuffer bytebuffer = aClass180_Sub2_3758.aByteBuffer9438;
			bytebuffer.clear();
			int i_20_ = 0;
			for (int i_21_ = 0; i_21_ < anInt3761; i_21_++) {
				int i_22_ = i_21_ << anInt3762;
				int i_23_ = i_21_ + 1 << anInt3762;
				for (int i_24_ = 0; i_24_ < anInt3760; i_24_++) {
					Class356 class356 = aClass356ArrayArray3755[i_24_][i_21_];
					int i_25_ = 0;
					if (class356 != null) {
						int i_26_ = i_24_ << anInt3762;
						int i_27_ = i_24_ + 1 << anInt3762;
						for (int i_28_ = i_22_; i_28_ < i_23_; i_28_++) {
							if (i_28_ - i_10_ >= -i_11_ && i_28_ - i_10_ <= i_11_) {
								int i_29_ = (i_28_ * (aClass161_Sub3_3756.anInt1750 * 1210322533) + i_26_);
								for (int i_30_ = i_26_; i_30_ < i_27_; i_30_++) {
									if (i_30_ - i >= -i_11_ && i_30_ - i <= i_11_ && (bools[i_30_ - i + i_11_][i_28_ - i_10_ + i_11_])) {
										short[] is_31_ = (aClass161_Sub3_3756.aShortArrayArray9621[i_29_]);
										if (is_31_ != null) {
											for (int i_32_ = 0; i_32_ < is_31_.length; i_32_++) {
												bytebuffer.putShort(is_31_[i_32_]);
												i_25_++;
											}
										}
									}
									i_29_++;
								}
							}
						}
					}
					is[i_20_] = i_25_;
					i_20_++;
				}
			}
			if (bytebuffer.position() != 0) {
				int i_33_ = bytebuffer.position();
				Interface44 interface44 = aClass180_Sub2_3758.method15136(i_33_ / 2);
				interface44.method213(0, i_33_, aClass180_Sub2_3758.aLong9439);
				int i_34_ = 0;
				i_20_ = 0;
				for (int i_35_ = 0; i_35_ < anInt3761; i_35_++) {
					for (int i_36_ = 0; i_36_ < anInt3760; i_36_++) {
						if (is[i_20_] != 0) {
							class326.aClass427_3583.method6815(f, f, 1.0F, 1.0F);
							class326.aClass427_3583.aFloatArray4807[12] = (float) -i_36_;
							class326.aClass427_3583.aFloatArray4807[13] = (float) -i_35_;
							aClass356ArrayArray3755[i_36_][i_35_].method6264(class326, interface44, i_34_, is[i_20_] / 3);
							i_34_ += is[i_20_];
						}
						i_20_++;
					}
				}
			}
		}
		aClass180_Sub2_3758.method3182(true);
	}

	void method6183(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_37_) {
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2 = (Class527_Sub8_Sub8_Sub2) class527_sub8_sub8;
		i += class527_sub8_sub8_sub2.anInt12082 + 1;
		i_37_ += class527_sub8_sub8_sub2.anInt12083 + 1;
		int i_38_ = i + i_37_ * anInt3757;
		int i_39_ = 0;
		int i_40_ = class527_sub8_sub8_sub2.anInt12080;
		int i_41_ = class527_sub8_sub8_sub2.anInt12081;
		int i_42_ = anInt3757 - i_41_;
		int i_43_ = 0;
		if (i_37_ <= 0) {
			int i_44_ = 1 - i_37_;
			i_40_ -= i_44_;
			i_39_ += i_44_ * i_41_;
			i_38_ += i_44_ * anInt3757;
			i_37_ = 1;
		}
		if (i_37_ + i_40_ >= anInt3763) {
			int i_45_ = i_37_ + i_40_ + 1 - anInt3763;
			i_40_ -= i_45_;
		}
		if (i <= 0) {
			int i_46_ = 1 - i;
			i_41_ -= i_46_;
			i_39_ += i_46_;
			i_38_ += i_46_;
			i_43_ += i_46_;
			i_42_ += i_46_;
			i = 1;
		}
		if (i + i_41_ >= anInt3757) {
			int i_47_ = i + i_41_ + 1 - anInt3757;
			i_41_ -= i_47_;
			i_43_ += i_47_;
			i_42_ += i_47_;
		}
		if (i_41_ > 0 && i_40_ > 0) {
			method6193(aByteArray3759, class527_sub8_sub8_sub2.aByteArray12084, i_39_, i_38_, i_41_, i_40_, i_42_, i_43_);
			method6186(i, i_37_, i_41_, i_40_);
		}
	}

	void method6184(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_48_) {
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2 = (Class527_Sub8_Sub8_Sub2) class527_sub8_sub8;
		i += class527_sub8_sub8_sub2.anInt12082 + 1;
		i_48_ += class527_sub8_sub8_sub2.anInt12083 + 1;
		int i_49_ = i + i_48_ * anInt3757;
		int i_50_ = 0;
		int i_51_ = class527_sub8_sub8_sub2.anInt12080;
		int i_52_ = class527_sub8_sub8_sub2.anInt12081;
		int i_53_ = anInt3757 - i_52_;
		int i_54_ = 0;
		if (i_48_ <= 0) {
			int i_55_ = 1 - i_48_;
			i_51_ -= i_55_;
			i_50_ += i_55_ * i_52_;
			i_49_ += i_55_ * anInt3757;
			i_48_ = 1;
		}
		if (i_48_ + i_51_ >= anInt3763) {
			int i_56_ = i_48_ + i_51_ + 1 - anInt3763;
			i_51_ -= i_56_;
		}
		if (i <= 0) {
			int i_57_ = 1 - i;
			i_52_ -= i_57_;
			i_50_ += i_57_;
			i_49_ += i_57_;
			i_54_ += i_57_;
			i_53_ += i_57_;
			i = 1;
		}
		if (i + i_52_ >= anInt3757) {
			int i_58_ = i + i_52_ + 1 - anInt3757;
			i_52_ -= i_58_;
			i_54_ += i_58_;
			i_53_ += i_58_;
		}
		if (i_52_ > 0 && i_51_ > 0) {
			method6201(aByteArray3759, class527_sub8_sub8_sub2.aByteArray12084, i_50_, i_49_, i_52_, i_51_, i_53_, i_54_);
			method6186(i, i_48_, i_52_, i_51_);
		}
	}

	void method6185() {
		aClass356ArrayArray3755 = new Class356[anInt3760][anInt3761];
		for (int i = 0; i < anInt3761; i++) {
			for (int i_59_ = 0; i_59_ < anInt3760; i_59_++) {
				aClass356ArrayArray3755[i_59_][i] = new Class356(aClass180_Sub2_3758, this, aClass161_Sub3_3756, i_59_, i, anInt3762, i_59_ * 128 + 1, i * 128 + 1);
				if (aClass356ArrayArray3755[i_59_][i].anInt3819 == 0)
					aClass356ArrayArray3755[i_59_][i] = null;
			}
		}
	}

	void method6186(int i, int i_60_, int i_61_, int i_62_) {
		if (aClass356ArrayArray3755 != null) {
			int i_63_ = i - 1 >> 7;
			int i_64_ = i - 1 + i_61_ - 1 >> 7;
			int i_65_ = i_60_ - 1 >> 7;
			int i_66_ = i_60_ - 1 + i_62_ - 1 >> 7;
			for (int i_67_ = i_63_; i_67_ <= i_64_; i_67_++) {
				Class356[] class356s = aClass356ArrayArray3755[i_67_];
				for (int i_68_ = i_65_; i_68_ <= i_66_; i_68_++) {
					if (class356s[i_68_] != null)
						class356s[i_68_].aBool3817 = true;
				}
			}
		}
	}

	static final boolean method6187(byte[] is, int i, int i_69_, int i_70_, int i_71_, int i_72_) {
		int i_73_ = i_69_ % i_72_;
		int i_74_;
		if (i_73_ != 0)
			i_74_ = i_72_ - i_73_;
		else
			i_74_ = 0;
		int i_75_ = -((i_70_ + i_72_ - 1) / i_72_);
		int i_76_ = -((i_69_ + i_72_ - 1) / i_72_);
		for (int i_77_ = i_75_; i_77_ < 0; i_77_++) {
			for (int i_78_ = i_76_; i_78_ < 0; i_78_++) {
				if (is[i] == 0)
					return true;
				i += i_72_;
			}
			i -= i_74_;
			if (is[i - 1] == 0)
				return true;
			i += i_71_;
		}
		return false;
	}

	boolean method6188(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_79_) {
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2 = (Class527_Sub8_Sub8_Sub2) class527_sub8_sub8;
		i += class527_sub8_sub8_sub2.anInt12082 + 1;
		i_79_ += class527_sub8_sub8_sub2.anInt12083 + 1;
		int i_80_ = i + i_79_ * anInt3757;
		int i_81_ = class527_sub8_sub8_sub2.anInt12080;
		int i_82_ = class527_sub8_sub8_sub2.anInt12081;
		int i_83_ = anInt3757 - i_82_;
		if (i_79_ <= 0) {
			int i_84_ = 1 - i_79_;
			i_81_ -= i_84_;
			i_80_ += i_84_ * anInt3757;
			i_79_ = 1;
		}
		if (i_79_ + i_81_ >= anInt3763) {
			int i_85_ = i_79_ + i_81_ + 1 - anInt3763;
			i_81_ -= i_85_;
		}
		if (i <= 0) {
			int i_86_ = 1 - i;
			i_82_ -= i_86_;
			i_80_ += i_86_;
			i_83_ += i_86_;
			i = 1;
		}
		if (i + i_82_ >= anInt3757) {
			int i_87_ = i + i_82_ + 1 - anInt3757;
			i_82_ -= i_87_;
			i_83_ += i_87_;
		}
		if (i_82_ <= 0 || i_81_ <= 0)
			return false;
		int i_88_ = 8;
		i_83_ += (i_88_ - 1) * anInt3757;
		return method6181(aByteArray3759, i_80_, i_82_, i_81_, i_83_, i_88_);
	}

	void method6189(Class326 class326, int i, int i_89_, int i_90_, boolean[][] bools, boolean bool) {
		aClass180_Sub2_3758.method3182(false);
		float f = 1.0F / (float) (aClass180_Sub2_3758.anInt9483 * 128);
		if (bool) {
			for (int i_91_ = 0; i_91_ < anInt3761; i_91_++) {
				int i_92_ = i_91_ << anInt3762;
				int i_93_ = i_91_ + 1 << anInt3762;
				for (int i_94_ = 0; i_94_ < anInt3760; i_94_++) {
					if (aClass356ArrayArray3755[i_94_][i_91_] != null) {
						int i_95_ = i_94_ << anInt3762;
						int i_96_ = i_94_ + 1 << anInt3762;
						while_19_: for (int i_97_ = i_95_; i_97_ < i_96_; i_97_++) {
							if (i_97_ - i >= -i_90_ && i_97_ - i <= i_90_) {
								for (int i_98_ = i_92_; i_98_ < i_93_; i_98_++) {
									if (i_98_ - i_89_ >= -i_90_ && i_98_ - i_89_ <= i_90_ && (bools[i_97_ - i + i_90_][i_98_ - i_89_ + i_90_])) {
										class326.aClass427_3583.method6815(f, f, 1.0F, 1.0F);
										class326.aClass427_3583.aFloatArray4807[12] = (float) -i_94_;
										class326.aClass427_3583.aFloatArray4807[13] = (float) -i_91_;
										aClass356ArrayArray3755[i_94_][i_91_].method6261(class326);
										break while_19_;
									}
								}
							}
						}
					}
				}
			}
		} else {
			int[] is = new int[anInt3761 * anInt3760];
			ByteBuffer bytebuffer = aClass180_Sub2_3758.aByteBuffer9438;
			bytebuffer.clear();
			int i_99_ = 0;
			for (int i_100_ = 0; i_100_ < anInt3761; i_100_++) {
				int i_101_ = i_100_ << anInt3762;
				int i_102_ = i_100_ + 1 << anInt3762;
				for (int i_103_ = 0; i_103_ < anInt3760; i_103_++) {
					Class356 class356 = aClass356ArrayArray3755[i_103_][i_100_];
					int i_104_ = 0;
					if (class356 != null) {
						int i_105_ = i_103_ << anInt3762;
						int i_106_ = i_103_ + 1 << anInt3762;
						for (int i_107_ = i_101_; i_107_ < i_102_; i_107_++) {
							if (i_107_ - i_89_ >= -i_90_ && i_107_ - i_89_ <= i_90_) {
								int i_108_ = (i_107_ * (aClass161_Sub3_3756.anInt1750 * 1210322533) + i_105_);
								for (int i_109_ = i_105_; i_109_ < i_106_; i_109_++) {
									if (i_109_ - i >= -i_90_ && i_109_ - i <= i_90_ && (bools[i_109_ - i + i_90_][i_107_ - i_89_ + i_90_])) {
										short[] is_110_ = (aClass161_Sub3_3756.aShortArrayArray9621[i_108_]);
										if (is_110_ != null) {
											for (int i_111_ = 0; i_111_ < is_110_.length; i_111_++) {
												bytebuffer.putShort(is_110_[i_111_]);
												i_104_++;
											}
										}
									}
									i_108_++;
								}
							}
						}
					}
					is[i_99_] = i_104_;
					i_99_++;
				}
			}
			if (bytebuffer.position() != 0) {
				int i_112_ = bytebuffer.position();
				Interface44 interface44 = aClass180_Sub2_3758.method15136(i_112_ / 2);
				interface44.method213(0, i_112_, aClass180_Sub2_3758.aLong9439);
				int i_113_ = 0;
				i_99_ = 0;
				for (int i_114_ = 0; i_114_ < anInt3761; i_114_++) {
					for (int i_115_ = 0; i_115_ < anInt3760; i_115_++) {
						if (is[i_99_] != 0) {
							class326.aClass427_3583.method6815(f, f, 1.0F, 1.0F);
							class326.aClass427_3583.aFloatArray4807[12] = (float) -i_115_;
							class326.aClass427_3583.aFloatArray4807[13] = (float) -i_114_;
							aClass356ArrayArray3755[i_115_][i_114_].method6264(class326, interface44, i_113_, is[i_99_] / 3);
							i_113_ += is[i_99_];
						}
						i_99_++;
					}
				}
			}
		}
		aClass180_Sub2_3758.method3182(true);
	}

	void method6190() {
		aClass356ArrayArray3755 = new Class356[anInt3760][anInt3761];
		for (int i = 0; i < anInt3761; i++) {
			for (int i_116_ = 0; i_116_ < anInt3760; i_116_++) {
				aClass356ArrayArray3755[i_116_][i] = new Class356(aClass180_Sub2_3758, this, aClass161_Sub3_3756, i_116_, i, anInt3762, i_116_ * 128 + 1, i * 128 + 1);
				if (aClass356ArrayArray3755[i_116_][i].anInt3819 == 0)
					aClass356ArrayArray3755[i_116_][i] = null;
			}
		}
	}

	void method6191(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_117_) {
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2 = (Class527_Sub8_Sub8_Sub2) class527_sub8_sub8;
		i += class527_sub8_sub8_sub2.anInt12082 + 1;
		i_117_ += class527_sub8_sub8_sub2.anInt12083 + 1;
		int i_118_ = i + i_117_ * anInt3757;
		int i_119_ = 0;
		int i_120_ = class527_sub8_sub8_sub2.anInt12080;
		int i_121_ = class527_sub8_sub8_sub2.anInt12081;
		int i_122_ = anInt3757 - i_121_;
		int i_123_ = 0;
		if (i_117_ <= 0) {
			int i_124_ = 1 - i_117_;
			i_120_ -= i_124_;
			i_119_ += i_124_ * i_121_;
			i_118_ += i_124_ * anInt3757;
			i_117_ = 1;
		}
		if (i_117_ + i_120_ >= anInt3763) {
			int i_125_ = i_117_ + i_120_ + 1 - anInt3763;
			i_120_ -= i_125_;
		}
		if (i <= 0) {
			int i_126_ = 1 - i;
			i_121_ -= i_126_;
			i_119_ += i_126_;
			i_118_ += i_126_;
			i_123_ += i_126_;
			i_122_ += i_126_;
			i = 1;
		}
		if (i + i_121_ >= anInt3757) {
			int i_127_ = i + i_121_ + 1 - anInt3757;
			i_121_ -= i_127_;
			i_123_ += i_127_;
			i_122_ += i_127_;
		}
		if (i_121_ > 0 && i_120_ > 0) {
			method6201(aByteArray3759, class527_sub8_sub8_sub2.aByteArray12084, i_119_, i_118_, i_121_, i_120_, i_122_, i_123_);
			method6186(i, i_117_, i_121_, i_120_);
		}
	}

	void method6192(Class326 class326, int i, int i_128_, int i_129_, boolean[][] bools, boolean bool) {
		aClass180_Sub2_3758.method3182(false);
		float f = 1.0F / (float) (aClass180_Sub2_3758.anInt9483 * 128);
		if (bool) {
			for (int i_130_ = 0; i_130_ < anInt3761; i_130_++) {
				int i_131_ = i_130_ << anInt3762;
				int i_132_ = i_130_ + 1 << anInt3762;
				for (int i_133_ = 0; i_133_ < anInt3760; i_133_++) {
					if (aClass356ArrayArray3755[i_133_][i_130_] != null) {
						int i_134_ = i_133_ << anInt3762;
						int i_135_ = i_133_ + 1 << anInt3762;
						while_20_: for (int i_136_ = i_134_; i_136_ < i_135_; i_136_++) {
							if (i_136_ - i >= -i_129_ && i_136_ - i <= i_129_) {
								for (int i_137_ = i_131_; i_137_ < i_132_; i_137_++) {
									if (i_137_ - i_128_ >= -i_129_ && i_137_ - i_128_ <= i_129_ && (bools[i_136_ - i + i_129_][i_137_ - i_128_ + i_129_])) {
										class326.aClass427_3583.method6815(f, f, 1.0F, 1.0F);
										class326.aClass427_3583.aFloatArray4807[12] = (float) -i_133_;
										class326.aClass427_3583.aFloatArray4807[13] = (float) -i_130_;
										aClass356ArrayArray3755[i_133_][i_130_].method6261(class326);
										break while_20_;
									}
								}
							}
						}
					}
				}
			}
		} else {
			int[] is = new int[anInt3761 * anInt3760];
			ByteBuffer bytebuffer = aClass180_Sub2_3758.aByteBuffer9438;
			bytebuffer.clear();
			int i_138_ = 0;
			for (int i_139_ = 0; i_139_ < anInt3761; i_139_++) {
				int i_140_ = i_139_ << anInt3762;
				int i_141_ = i_139_ + 1 << anInt3762;
				for (int i_142_ = 0; i_142_ < anInt3760; i_142_++) {
					Class356 class356 = aClass356ArrayArray3755[i_142_][i_139_];
					int i_143_ = 0;
					if (class356 != null) {
						int i_144_ = i_142_ << anInt3762;
						int i_145_ = i_142_ + 1 << anInt3762;
						for (int i_146_ = i_140_; i_146_ < i_141_; i_146_++) {
							if (i_146_ - i_128_ >= -i_129_ && i_146_ - i_128_ <= i_129_) {
								int i_147_ = (i_146_ * (aClass161_Sub3_3756.anInt1750 * 1210322533) + i_144_);
								for (int i_148_ = i_144_; i_148_ < i_145_; i_148_++) {
									if (i_148_ - i >= -i_129_ && i_148_ - i <= i_129_ && (bools[i_148_ - i + i_129_][i_146_ - i_128_ + i_129_])) {
										short[] is_149_ = (aClass161_Sub3_3756.aShortArrayArray9621[i_147_]);
										if (is_149_ != null) {
											for (int i_150_ = 0; i_150_ < is_149_.length; i_150_++) {
												bytebuffer.putShort(is_149_[i_150_]);
												i_143_++;
											}
										}
									}
									i_147_++;
								}
							}
						}
					}
					is[i_138_] = i_143_;
					i_138_++;
				}
			}
			if (bytebuffer.position() != 0) {
				int i_151_ = bytebuffer.position();
				Interface44 interface44 = aClass180_Sub2_3758.method15136(i_151_ / 2);
				interface44.method213(0, i_151_, aClass180_Sub2_3758.aLong9439);
				int i_152_ = 0;
				i_138_ = 0;
				for (int i_153_ = 0; i_153_ < anInt3761; i_153_++) {
					for (int i_154_ = 0; i_154_ < anInt3760; i_154_++) {
						if (is[i_138_] != 0) {
							class326.aClass427_3583.method6815(f, f, 1.0F, 1.0F);
							class326.aClass427_3583.aFloatArray4807[12] = (float) -i_154_;
							class326.aClass427_3583.aFloatArray4807[13] = (float) -i_153_;
							aClass356ArrayArray3755[i_154_][i_153_].method6264(class326, interface44, i_152_, is[i_138_] / 3);
							i_152_ += is[i_138_];
						}
						i_138_++;
					}
				}
			}
		}
		aClass180_Sub2_3758.method3182(true);
	}

	static final void method6193(byte[] is, byte[] is_155_, int i, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_) {
		int i_161_ = -(i_157_ >> 2);
		i_157_ = -(i_157_ & 0x3);
		for (int i_162_ = -i_158_; i_162_ < 0; i_162_++) {
			for (int i_163_ = i_161_; i_163_ < 0; i_163_++) {
				is[i_156_++] += is_155_[i++];
				is[i_156_++] += is_155_[i++];
				is[i_156_++] += is_155_[i++];
				is[i_156_++] += is_155_[i++];
			}
			for (int i_164_ = i_157_; i_164_ < 0; i_164_++)
				is[i_156_++] += is_155_[i++];
			i_156_ += i_159_;
			i += i_160_;
		}
	}

	void method6194(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_165_) {
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2 = (Class527_Sub8_Sub8_Sub2) class527_sub8_sub8;
		i += class527_sub8_sub8_sub2.anInt12082 + 1;
		i_165_ += class527_sub8_sub8_sub2.anInt12083 + 1;
		int i_166_ = i + i_165_ * anInt3757;
		int i_167_ = 0;
		int i_168_ = class527_sub8_sub8_sub2.anInt12080;
		int i_169_ = class527_sub8_sub8_sub2.anInt12081;
		int i_170_ = anInt3757 - i_169_;
		int i_171_ = 0;
		if (i_165_ <= 0) {
			int i_172_ = 1 - i_165_;
			i_168_ -= i_172_;
			i_167_ += i_172_ * i_169_;
			i_166_ += i_172_ * anInt3757;
			i_165_ = 1;
		}
		if (i_165_ + i_168_ >= anInt3763) {
			int i_173_ = i_165_ + i_168_ + 1 - anInt3763;
			i_168_ -= i_173_;
		}
		if (i <= 0) {
			int i_174_ = 1 - i;
			i_169_ -= i_174_;
			i_167_ += i_174_;
			i_166_ += i_174_;
			i_171_ += i_174_;
			i_170_ += i_174_;
			i = 1;
		}
		if (i + i_169_ >= anInt3757) {
			int i_175_ = i + i_169_ + 1 - anInt3757;
			i_169_ -= i_175_;
			i_171_ += i_175_;
			i_170_ += i_175_;
		}
		if (i_169_ > 0 && i_168_ > 0) {
			method6201(aByteArray3759, class527_sub8_sub8_sub2.aByteArray12084, i_167_, i_166_, i_169_, i_168_, i_170_, i_171_);
			method6186(i, i_165_, i_169_, i_168_);
		}
	}

	void method6195(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_176_) {
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2 = (Class527_Sub8_Sub8_Sub2) class527_sub8_sub8;
		i += class527_sub8_sub8_sub2.anInt12082 + 1;
		i_176_ += class527_sub8_sub8_sub2.anInt12083 + 1;
		int i_177_ = i + i_176_ * anInt3757;
		int i_178_ = 0;
		int i_179_ = class527_sub8_sub8_sub2.anInt12080;
		int i_180_ = class527_sub8_sub8_sub2.anInt12081;
		int i_181_ = anInt3757 - i_180_;
		int i_182_ = 0;
		if (i_176_ <= 0) {
			int i_183_ = 1 - i_176_;
			i_179_ -= i_183_;
			i_178_ += i_183_ * i_180_;
			i_177_ += i_183_ * anInt3757;
			i_176_ = 1;
		}
		if (i_176_ + i_179_ >= anInt3763) {
			int i_184_ = i_176_ + i_179_ + 1 - anInt3763;
			i_179_ -= i_184_;
		}
		if (i <= 0) {
			int i_185_ = 1 - i;
			i_180_ -= i_185_;
			i_178_ += i_185_;
			i_177_ += i_185_;
			i_182_ += i_185_;
			i_181_ += i_185_;
			i = 1;
		}
		if (i + i_180_ >= anInt3757) {
			int i_186_ = i + i_180_ + 1 - anInt3757;
			i_180_ -= i_186_;
			i_182_ += i_186_;
			i_181_ += i_186_;
		}
		if (i_180_ > 0 && i_179_ > 0) {
			method6201(aByteArray3759, class527_sub8_sub8_sub2.aByteArray12084, i_178_, i_177_, i_180_, i_179_, i_181_, i_182_);
			method6186(i, i_176_, i_180_, i_179_);
		}
	}

	boolean method6196(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_187_) {
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2 = (Class527_Sub8_Sub8_Sub2) class527_sub8_sub8;
		i += class527_sub8_sub8_sub2.anInt12082 + 1;
		i_187_ += class527_sub8_sub8_sub2.anInt12083 + 1;
		int i_188_ = i + i_187_ * anInt3757;
		int i_189_ = class527_sub8_sub8_sub2.anInt12080;
		int i_190_ = class527_sub8_sub8_sub2.anInt12081;
		int i_191_ = anInt3757 - i_190_;
		if (i_187_ <= 0) {
			int i_192_ = 1 - i_187_;
			i_189_ -= i_192_;
			i_188_ += i_192_ * anInt3757;
			i_187_ = 1;
		}
		if (i_187_ + i_189_ >= anInt3763) {
			int i_193_ = i_187_ + i_189_ + 1 - anInt3763;
			i_189_ -= i_193_;
		}
		if (i <= 0) {
			int i_194_ = 1 - i;
			i_190_ -= i_194_;
			i_188_ += i_194_;
			i_191_ += i_194_;
			i = 1;
		}
		if (i + i_190_ >= anInt3757) {
			int i_195_ = i + i_190_ + 1 - anInt3757;
			i_190_ -= i_195_;
			i_191_ += i_195_;
		}
		if (i_190_ <= 0 || i_189_ <= 0)
			return false;
		int i_196_ = 8;
		i_191_ += (i_196_ - 1) * anInt3757;
		return method6181(aByteArray3759, i_188_, i_190_, i_189_, i_191_, i_196_);
	}

	void method6197(int i, int i_197_, int i_198_, int i_199_) {
		if (aClass356ArrayArray3755 != null) {
			int i_200_ = i - 1 >> 7;
			int i_201_ = i - 1 + i_198_ - 1 >> 7;
			int i_202_ = i_197_ - 1 >> 7;
			int i_203_ = i_197_ - 1 + i_199_ - 1 >> 7;
			for (int i_204_ = i_200_; i_204_ <= i_201_; i_204_++) {
				Class356[] class356s = aClass356ArrayArray3755[i_204_];
				for (int i_205_ = i_202_; i_205_ <= i_203_; i_205_++) {
					if (class356s[i_205_] != null)
						class356s[i_205_].aBool3817 = true;
				}
			}
		}
	}

	static final void method6198(byte[] is, byte[] is_206_, int i, int i_207_, int i_208_, int i_209_, int i_210_, int i_211_) {
		int i_212_ = -(i_208_ >> 2);
		i_208_ = -(i_208_ & 0x3);
		for (int i_213_ = -i_209_; i_213_ < 0; i_213_++) {
			for (int i_214_ = i_212_; i_214_ < 0; i_214_++) {
				is[i_207_++] += is_206_[i++];
				is[i_207_++] += is_206_[i++];
				is[i_207_++] += is_206_[i++];
				is[i_207_++] += is_206_[i++];
			}
			for (int i_215_ = i_208_; i_215_ < 0; i_215_++)
				is[i_207_++] += is_206_[i++];
			i_207_ += i_210_;
			i += i_211_;
		}
	}

	static final void method6199(byte[] is, byte[] is_216_, int i, int i_217_, int i_218_, int i_219_, int i_220_, int i_221_) {
		int i_222_ = -(i_218_ >> 2);
		i_218_ = -(i_218_ & 0x3);
		for (int i_223_ = -i_219_; i_223_ < 0; i_223_++) {
			for (int i_224_ = i_222_; i_224_ < 0; i_224_++) {
				is[i_217_++] += is_216_[i++];
				is[i_217_++] += is_216_[i++];
				is[i_217_++] += is_216_[i++];
				is[i_217_++] += is_216_[i++];
			}
			for (int i_225_ = i_218_; i_225_ < 0; i_225_++)
				is[i_217_++] += is_216_[i++];
			i_217_ += i_220_;
			i += i_221_;
		}
	}

	static final void method6200(byte[] is, byte[] is_226_, int i, int i_227_, int i_228_, int i_229_, int i_230_, int i_231_) {
		int i_232_ = -(i_228_ >> 2);
		i_228_ = -(i_228_ & 0x3);
		for (int i_233_ = -i_229_; i_233_ < 0; i_233_++) {
			for (int i_234_ = i_232_; i_234_ < 0; i_234_++) {
				is[i_227_++] -= is_226_[i++];
				is[i_227_++] -= is_226_[i++];
				is[i_227_++] -= is_226_[i++];
				is[i_227_++] -= is_226_[i++];
			}
			for (int i_235_ = i_228_; i_235_ < 0; i_235_++)
				is[i_227_++] -= is_226_[i++];
			i_227_ += i_230_;
			i += i_231_;
		}
	}

	static final void method6201(byte[] is, byte[] is_236_, int i, int i_237_, int i_238_, int i_239_, int i_240_, int i_241_) {
		int i_242_ = -(i_238_ >> 2);
		i_238_ = -(i_238_ & 0x3);
		for (int i_243_ = -i_239_; i_243_ < 0; i_243_++) {
			for (int i_244_ = i_242_; i_244_ < 0; i_244_++) {
				is[i_237_++] -= is_236_[i++];
				is[i_237_++] -= is_236_[i++];
				is[i_237_++] -= is_236_[i++];
				is[i_237_++] -= is_236_[i++];
			}
			for (int i_245_ = i_238_; i_245_ < 0; i_245_++)
				is[i_237_++] -= is_236_[i++];
			i_237_ += i_240_;
			i += i_241_;
		}
	}
}
