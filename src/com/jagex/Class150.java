/* Class150 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class150 {
	Class160_Sub1 aClass160_Sub1_1702;
	Class167_Sub2 aClass167_Sub2_1703;
	Class138[][] aClass138ArrayArray1704;
	int anInt1705;
	byte[] aByteArray1706;
	int anInt1707;
	int anInt1708;
	int anInt1709;
	int anInt1710;

	void method1826() {
		aClass138ArrayArray1704 = new Class138[anInt1707][anInt1708];
		for (int i = 0; i < anInt1708; i++) {
			for (int i_0_ = 0; i_0_ < anInt1707; i_0_++)
				aClass138ArrayArray1704[i_0_][i] = new Class138(aClass167_Sub2_1703, this, aClass160_Sub1_1702, i_0_, i, anInt1709, i_0_ * 128 + 1, i * 128 + 1);
		}
	}

	void method1827(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_1_) {
		Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2 = (Class536_Sub18_Sub7_Sub2) class536_sub18_sub7;
		i += class536_sub18_sub7_sub2.anInt12078 + 1;
		i_1_ += class536_sub18_sub7_sub2.anInt12079 + 1;
		int i_2_ = i + i_1_ * anInt1710;
		int i_3_ = 0;
		int i_4_ = class536_sub18_sub7_sub2.anInt12076;
		int i_5_ = class536_sub18_sub7_sub2.anInt12075;
		int i_6_ = anInt1710 - i_5_;
		int i_7_ = 0;
		if (i_1_ <= 0) {
			int i_8_ = 1 - i_1_;
			i_4_ -= i_8_;
			i_3_ += i_8_ * i_5_;
			i_2_ += i_8_ * anInt1710;
			i_1_ = 1;
		}
		if (i_1_ + i_4_ >= anInt1705) {
			int i_9_ = i_1_ + i_4_ + 1 - anInt1705;
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
		if (i + i_5_ >= anInt1710) {
			int i_11_ = i + i_5_ + 1 - anInt1710;
			i_5_ -= i_11_;
			i_7_ += i_11_;
			i_6_ += i_11_;
		}
		if (i_5_ > 0 && i_4_ > 0) {
			method1833(aByteArray1706, class536_sub18_sub7_sub2.aByteArray12080, i_3_, i_2_, i_5_, i_4_, i_6_, i_7_);
			method1844(i, i_1_, i_5_, i_4_);
		}
	}

	void method1828(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_12_) {
		Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2 = (Class536_Sub18_Sub7_Sub2) class536_sub18_sub7;
		i += class536_sub18_sub7_sub2.anInt12078 + 1;
		i_12_ += class536_sub18_sub7_sub2.anInt12079 + 1;
		int i_13_ = i + i_12_ * anInt1710;
		int i_14_ = 0;
		int i_15_ = class536_sub18_sub7_sub2.anInt12076;
		int i_16_ = class536_sub18_sub7_sub2.anInt12075;
		int i_17_ = anInt1710 - i_16_;
		int i_18_ = 0;
		if (i_12_ <= 0) {
			int i_19_ = 1 - i_12_;
			i_15_ -= i_19_;
			i_14_ += i_19_ * i_16_;
			i_13_ += i_19_ * anInt1710;
			i_12_ = 1;
		}
		if (i_12_ + i_15_ >= anInt1705) {
			int i_20_ = i_12_ + i_15_ + 1 - anInt1705;
			i_15_ -= i_20_;
		}
		if (i <= 0) {
			int i_21_ = 1 - i;
			i_16_ -= i_21_;
			i_14_ += i_21_;
			i_13_ += i_21_;
			i_18_ += i_21_;
			i_17_ += i_21_;
			i = 1;
		}
		if (i + i_16_ >= anInt1710) {
			int i_22_ = i + i_16_ + 1 - anInt1710;
			i_16_ -= i_22_;
			i_18_ += i_22_;
			i_17_ += i_22_;
		}
		if (i_16_ > 0 && i_15_ > 0) {
			method1833(aByteArray1706, class536_sub18_sub7_sub2.aByteArray12080, i_14_, i_13_, i_16_, i_15_, i_17_, i_18_);
			method1844(i, i_12_, i_16_, i_15_);
		}
	}

	void method1829(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_23_) {
		Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2 = (Class536_Sub18_Sub7_Sub2) class536_sub18_sub7;
		i += class536_sub18_sub7_sub2.anInt12078 + 1;
		i_23_ += class536_sub18_sub7_sub2.anInt12079 + 1;
		int i_24_ = i + i_23_ * anInt1710;
		int i_25_ = 0;
		int i_26_ = class536_sub18_sub7_sub2.anInt12076;
		int i_27_ = class536_sub18_sub7_sub2.anInt12075;
		int i_28_ = anInt1710 - i_27_;
		int i_29_ = 0;
		if (i_23_ <= 0) {
			int i_30_ = 1 - i_23_;
			i_26_ -= i_30_;
			i_25_ += i_30_ * i_27_;
			i_24_ += i_30_ * anInt1710;
			i_23_ = 1;
		}
		if (i_23_ + i_26_ >= anInt1705) {
			int i_31_ = i_23_ + i_26_ + 1 - anInt1705;
			i_26_ -= i_31_;
		}
		if (i <= 0) {
			int i_32_ = 1 - i;
			i_27_ -= i_32_;
			i_25_ += i_32_;
			i_24_ += i_32_;
			i_29_ += i_32_;
			i_28_ += i_32_;
			i = 1;
		}
		if (i + i_27_ >= anInt1710) {
			int i_33_ = i + i_27_ + 1 - anInt1710;
			i_27_ -= i_33_;
			i_29_ += i_33_;
			i_28_ += i_33_;
		}
		if (i_27_ > 0 && i_26_ > 0) {
			method1832(aByteArray1706, class536_sub18_sub7_sub2.aByteArray12080, i_25_, i_24_, i_27_, i_26_, i_28_, i_29_);
			method1844(i, i_23_, i_27_, i_26_);
		}
	}

	void method1830(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_34_) {
		Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2 = (Class536_Sub18_Sub7_Sub2) class536_sub18_sub7;
		i += class536_sub18_sub7_sub2.anInt12078 + 1;
		i_34_ += class536_sub18_sub7_sub2.anInt12079 + 1;
		int i_35_ = i + i_34_ * anInt1710;
		int i_36_ = 0;
		int i_37_ = class536_sub18_sub7_sub2.anInt12076;
		int i_38_ = class536_sub18_sub7_sub2.anInt12075;
		int i_39_ = anInt1710 - i_38_;
		int i_40_ = 0;
		if (i_34_ <= 0) {
			int i_41_ = 1 - i_34_;
			i_37_ -= i_41_;
			i_36_ += i_41_ * i_38_;
			i_35_ += i_41_ * anInt1710;
			i_34_ = 1;
		}
		if (i_34_ + i_37_ >= anInt1705) {
			int i_42_ = i_34_ + i_37_ + 1 - anInt1705;
			i_37_ -= i_42_;
		}
		if (i <= 0) {
			int i_43_ = 1 - i;
			i_38_ -= i_43_;
			i_36_ += i_43_;
			i_35_ += i_43_;
			i_40_ += i_43_;
			i_39_ += i_43_;
			i = 1;
		}
		if (i + i_38_ >= anInt1710) {
			int i_44_ = i + i_38_ + 1 - anInt1710;
			i_38_ -= i_44_;
			i_40_ += i_44_;
			i_39_ += i_44_;
		}
		if (i_38_ > 0 && i_37_ > 0) {
			method1832(aByteArray1706, class536_sub18_sub7_sub2.aByteArray12080, i_36_, i_35_, i_38_, i_37_, i_39_, i_40_);
			method1844(i, i_34_, i_38_, i_37_);
		}
	}

	boolean method1831(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_45_) {
		Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2 = (Class536_Sub18_Sub7_Sub2) class536_sub18_sub7;
		i += class536_sub18_sub7_sub2.anInt12078 + 1;
		i_45_ += class536_sub18_sub7_sub2.anInt12079 + 1;
		int i_46_ = i + i_45_ * anInt1710;
		int i_47_ = class536_sub18_sub7_sub2.anInt12076;
		int i_48_ = class536_sub18_sub7_sub2.anInt12075;
		int i_49_ = anInt1710 - i_48_;
		if (i_45_ <= 0) {
			int i_50_ = 1 - i_45_;
			i_47_ -= i_50_;
			i_46_ += i_50_ * anInt1710;
			i_45_ = 1;
		}
		if (i_45_ + i_47_ >= anInt1705) {
			int i_51_ = i_45_ + i_47_ + 1 - anInt1705;
			i_47_ -= i_51_;
		}
		if (i <= 0) {
			int i_52_ = 1 - i;
			i_48_ -= i_52_;
			i_46_ += i_52_;
			i_49_ += i_52_;
			i = 1;
		}
		if (i + i_48_ >= anInt1710) {
			int i_53_ = i + i_48_ + 1 - anInt1710;
			i_48_ -= i_53_;
			i_49_ += i_53_;
		}
		if (i_48_ <= 0 || i_47_ <= 0)
			return false;
		int i_54_ = 8;
		i_49_ += (i_54_ - 1) * anInt1710;
		return method1836(aByteArray1706, i_46_, i_48_, i_47_, i_49_, i_54_);
	}

	Class150(Class167_Sub2 class167_sub2, Class160_Sub1 class160_sub1) {
		aClass167_Sub2_1703 = class167_sub2;
		aClass160_Sub1_1702 = class160_sub1;
		anInt1710 = 2 + ((aClass160_Sub1_1702.anInt1766 * 1718142487 * (aClass160_Sub1_1702.anInt1767 * -1504778739)) >> aClass167_Sub2_1703.anInt9178);
		anInt1705 = 2 + ((aClass160_Sub1_1702.anInt1769 * -889224915 * (aClass160_Sub1_1702.anInt1767 * -1504778739)) >> aClass167_Sub2_1703.anInt9178);
		aByteArray1706 = new byte[anInt1710 * anInt1705];
		anInt1709 = (7 + aClass167_Sub2_1703.anInt9178 - aClass160_Sub1_1702.anInt1768 * 2064238369);
		anInt1707 = aClass160_Sub1_1702.anInt1766 * 1718142487 >> anInt1709;
		anInt1708 = aClass160_Sub1_1702.anInt1769 * -889224915 >> anInt1709;
	}

	static final void method1832(byte[] is, byte[] is_55_, int i, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_) {
		int i_61_ = -(i_57_ >> 2);
		i_57_ = -(i_57_ & 0x3);
		for (int i_62_ = -i_58_; i_62_ < 0; i_62_++) {
			for (int i_63_ = i_61_; i_63_ < 0; i_63_++) {
				is[i_56_++] += is_55_[i++];
				is[i_56_++] += is_55_[i++];
				is[i_56_++] += is_55_[i++];
				is[i_56_++] += is_55_[i++];
			}
			for (int i_64_ = i_57_; i_64_ < 0; i_64_++)
				is[i_56_++] += is_55_[i++];
			i_56_ += i_59_;
			i += i_60_;
		}
	}

	static final void method1833(byte[] is, byte[] is_65_, int i, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_) {
		int i_71_ = -(i_67_ >> 2);
		i_67_ = -(i_67_ & 0x3);
		for (int i_72_ = -i_68_; i_72_ < 0; i_72_++) {
			for (int i_73_ = i_71_; i_73_ < 0; i_73_++) {
				is[i_66_++] -= is_65_[i++];
				is[i_66_++] -= is_65_[i++];
				is[i_66_++] -= is_65_[i++];
				is[i_66_++] -= is_65_[i++];
			}
			for (int i_74_ = i_67_; i_74_ < 0; i_74_++)
				is[i_66_++] -= is_65_[i++];
			i_66_ += i_69_;
			i += i_70_;
		}
	}

	void method1834(int i, int i_75_, int i_76_, boolean[][] bools, boolean bool) {
		aClass167_Sub2_1703.method8611(false);
		aClass167_Sub2_1703.method8599(false);
		aClass167_Sub2_1703.method8553(-2);
		aClass167_Sub2_1703.method8557(1);
		aClass167_Sub2_1703.method8567(1);
		float f = 1.0F / (float) (aClass167_Sub2_1703.anInt9290 * 128);
		if (bool) {
			for (int i_77_ = 0; i_77_ < anInt1708; i_77_++) {
				int i_78_ = i_77_ << anInt1709;
				int i_79_ = i_77_ + 1 << anInt1709;
				for (int i_80_ = 0; i_80_ < anInt1707; i_80_++) {
					int i_81_ = i_80_ << anInt1709;
					int i_82_ = i_80_ + 1 << anInt1709;
					while_53_: for (int i_83_ = i_81_; i_83_ < i_82_; i_83_++) {
						if (i_83_ - i >= -i_76_ && i_83_ - i <= i_76_) {
							for (int i_84_ = i_78_; i_84_ < i_79_; i_84_++) {
								if (i_84_ - i_75_ >= -i_76_ && i_84_ - i_75_ <= i_76_ && (bools[i_83_ - i + i_76_][i_84_ - i_75_ + i_76_])) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(f, f, 1.0F);
									OpenGL.glTranslatef((float) -i_80_ / f, (float) -i_77_ / f, 1.0F);
									OpenGL.glMatrixMode(5888);
									aClass138ArrayArray1704[i_80_][i_77_].method1689();
									break while_53_;
								}
							}
						}
					}
				}
			}
		} else {
			for (int i_85_ = 0; i_85_ < anInt1708; i_85_++) {
				int i_86_ = i_85_ << anInt1709;
				int i_87_ = i_85_ + 1 << anInt1709;
				for (int i_88_ = 0; i_88_ < anInt1707; i_88_++) {
					int i_89_ = 0;
					int i_90_ = i_88_ << anInt1709;
					int i_91_ = i_88_ + 1 << anInt1709;
					Class536_Sub33_Sub1 class536_sub33_sub1 = aClass167_Sub2_1703.aClass536_Sub33_Sub1_9136;
					class536_sub33_sub1.off = 0;
					for (int i_92_ = i_86_; i_92_ < i_87_; i_92_++) {
						if (i_92_ - i_75_ >= -i_76_ && i_92_ - i_75_ <= i_76_) {
							int i_93_ = (i_92_ * (aClass160_Sub1_1702.anInt1766 * 1718142487) + i_90_);
							for (int i_94_ = i_90_; i_94_ < i_91_; i_94_++) {
								if (i_94_ - i >= -i_76_ && i_94_ - i <= i_76_ && (bools[i_94_ - i + i_76_][i_92_ - i_75_ + i_76_])) {
									short[] is = (aClass160_Sub1_1702.aShortArrayArray9380[i_93_]);
									if (is != null) {
										if (aClass167_Sub2_1703.aBool9284) {
											for (int i_95_ = 0; i_95_ < is.length; i_95_++) {
												class536_sub33_sub1.writeShort(is[i_95_] & 0xffff, -1778059594);
												i_89_++;
											}
										} else {
											for (int i_96_ = 0; i_96_ < is.length; i_96_++) {
												class536_sub33_sub1.writeShortLE(is[i_96_] & 0xffff, -919344972);
												i_89_++;
											}
										}
									}
								}
								i_93_++;
							}
						}
					}
					if (i_89_ > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(f, f, 1.0F);
						OpenGL.glTranslatef((float) -i_88_ / f, (float) -i_85_ / f, 1.0F);
						OpenGL.glMatrixMode(5888);
						aClass138ArrayArray1704[i_88_][i_85_].method1690(class536_sub33_sub1.buffer, i_89_);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method1835() {
		aClass138ArrayArray1704 = new Class138[anInt1707][anInt1708];
		for (int i = 0; i < anInt1708; i++) {
			for (int i_97_ = 0; i_97_ < anInt1707; i_97_++)
				aClass138ArrayArray1704[i_97_][i] = new Class138(aClass167_Sub2_1703, this, aClass160_Sub1_1702, i_97_, i, anInt1709, i_97_ * 128 + 1, i * 128 + 1);
		}
	}

	static final boolean method1836(byte[] is, int i, int i_98_, int i_99_, int i_100_, int i_101_) {
		int i_102_ = i_98_ % i_101_;
		int i_103_;
		if (i_102_ != 0)
			i_103_ = i_101_ - i_102_;
		else
			i_103_ = 0;
		int i_104_ = -((i_99_ + i_101_ - 1) / i_101_);
		int i_105_ = -((i_98_ + i_101_ - 1) / i_101_);
		for (int i_106_ = i_104_; i_106_ < 0; i_106_++) {
			for (int i_107_ = i_105_; i_107_ < 0; i_107_++) {
				if (is[i] == 0)
					return true;
				i += i_101_;
			}
			i -= i_103_;
			if (is[i - 1] == 0)
				return true;
			i += i_100_;
		}
		return false;
	}

	void method1837() {
		aClass138ArrayArray1704 = new Class138[anInt1707][anInt1708];
		for (int i = 0; i < anInt1708; i++) {
			for (int i_108_ = 0; i_108_ < anInt1707; i_108_++)
				aClass138ArrayArray1704[i_108_][i] = new Class138(aClass167_Sub2_1703, this, aClass160_Sub1_1702, i_108_, i, anInt1709, i_108_ * 128 + 1, i * 128 + 1);
		}
	}

	void method1838(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_109_) {
		Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2 = (Class536_Sub18_Sub7_Sub2) class536_sub18_sub7;
		i += class536_sub18_sub7_sub2.anInt12078 + 1;
		i_109_ += class536_sub18_sub7_sub2.anInt12079 + 1;
		int i_110_ = i + i_109_ * anInt1710;
		int i_111_ = 0;
		int i_112_ = class536_sub18_sub7_sub2.anInt12076;
		int i_113_ = class536_sub18_sub7_sub2.anInt12075;
		int i_114_ = anInt1710 - i_113_;
		int i_115_ = 0;
		if (i_109_ <= 0) {
			int i_116_ = 1 - i_109_;
			i_112_ -= i_116_;
			i_111_ += i_116_ * i_113_;
			i_110_ += i_116_ * anInt1710;
			i_109_ = 1;
		}
		if (i_109_ + i_112_ >= anInt1705) {
			int i_117_ = i_109_ + i_112_ + 1 - anInt1705;
			i_112_ -= i_117_;
		}
		if (i <= 0) {
			int i_118_ = 1 - i;
			i_113_ -= i_118_;
			i_111_ += i_118_;
			i_110_ += i_118_;
			i_115_ += i_118_;
			i_114_ += i_118_;
			i = 1;
		}
		if (i + i_113_ >= anInt1710) {
			int i_119_ = i + i_113_ + 1 - anInt1710;
			i_113_ -= i_119_;
			i_115_ += i_119_;
			i_114_ += i_119_;
		}
		if (i_113_ > 0 && i_112_ > 0) {
			method1833(aByteArray1706, class536_sub18_sub7_sub2.aByteArray12080, i_111_, i_110_, i_113_, i_112_, i_114_, i_115_);
			method1844(i, i_109_, i_113_, i_112_);
		}
	}

	static final void method1839(byte[] is, byte[] is_120_, int i, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_) {
		int i_126_ = -(i_122_ >> 2);
		i_122_ = -(i_122_ & 0x3);
		for (int i_127_ = -i_123_; i_127_ < 0; i_127_++) {
			for (int i_128_ = i_126_; i_128_ < 0; i_128_++) {
				is[i_121_++] -= is_120_[i++];
				is[i_121_++] -= is_120_[i++];
				is[i_121_++] -= is_120_[i++];
				is[i_121_++] -= is_120_[i++];
			}
			for (int i_129_ = i_122_; i_129_ < 0; i_129_++)
				is[i_121_++] -= is_120_[i++];
			i_121_ += i_124_;
			i += i_125_;
		}
	}

	boolean method1840(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_130_) {
		Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2 = (Class536_Sub18_Sub7_Sub2) class536_sub18_sub7;
		i += class536_sub18_sub7_sub2.anInt12078 + 1;
		i_130_ += class536_sub18_sub7_sub2.anInt12079 + 1;
		int i_131_ = i + i_130_ * anInt1710;
		int i_132_ = class536_sub18_sub7_sub2.anInt12076;
		int i_133_ = class536_sub18_sub7_sub2.anInt12075;
		int i_134_ = anInt1710 - i_133_;
		if (i_130_ <= 0) {
			int i_135_ = 1 - i_130_;
			i_132_ -= i_135_;
			i_131_ += i_135_ * anInt1710;
			i_130_ = 1;
		}
		if (i_130_ + i_132_ >= anInt1705) {
			int i_136_ = i_130_ + i_132_ + 1 - anInt1705;
			i_132_ -= i_136_;
		}
		if (i <= 0) {
			int i_137_ = 1 - i;
			i_133_ -= i_137_;
			i_131_ += i_137_;
			i_134_ += i_137_;
			i = 1;
		}
		if (i + i_133_ >= anInt1710) {
			int i_138_ = i + i_133_ + 1 - anInt1710;
			i_133_ -= i_138_;
			i_134_ += i_138_;
		}
		if (i_133_ <= 0 || i_132_ <= 0)
			return false;
		int i_139_ = 8;
		i_134_ += (i_139_ - 1) * anInt1710;
		return method1836(aByteArray1706, i_131_, i_133_, i_132_, i_134_, i_139_);
	}

	void method1841(int i, int i_140_, int i_141_, int i_142_) {
		if (aClass138ArrayArray1704 != null) {
			int i_143_ = i - 1 >> 7;
			int i_144_ = i - 1 + i_141_ - 1 >> 7;
			int i_145_ = i_140_ - 1 >> 7;
			int i_146_ = i_140_ - 1 + i_142_ - 1 >> 7;
			for (int i_147_ = i_143_; i_147_ <= i_144_; i_147_++) {
				Class138[] class138s = aClass138ArrayArray1704[i_147_];
				for (int i_148_ = i_145_; i_148_ <= i_146_; i_148_++)
					class138s[i_148_].aBool1641 = true;
			}
		}
	}

	static final void method1842(byte[] is, byte[] is_149_, int i, int i_150_, int i_151_, int i_152_, int i_153_, int i_154_) {
		int i_155_ = -(i_151_ >> 2);
		i_151_ = -(i_151_ & 0x3);
		for (int i_156_ = -i_152_; i_156_ < 0; i_156_++) {
			for (int i_157_ = i_155_; i_157_ < 0; i_157_++) {
				is[i_150_++] += is_149_[i++];
				is[i_150_++] += is_149_[i++];
				is[i_150_++] += is_149_[i++];
				is[i_150_++] += is_149_[i++];
			}
			for (int i_158_ = i_151_; i_158_ < 0; i_158_++)
				is[i_150_++] += is_149_[i++];
			i_150_ += i_153_;
			i += i_154_;
		}
	}

	static final void method1843(byte[] is, byte[] is_159_, int i, int i_160_, int i_161_, int i_162_, int i_163_, int i_164_) {
		int i_165_ = -(i_161_ >> 2);
		i_161_ = -(i_161_ & 0x3);
		for (int i_166_ = -i_162_; i_166_ < 0; i_166_++) {
			for (int i_167_ = i_165_; i_167_ < 0; i_167_++) {
				is[i_160_++] -= is_159_[i++];
				is[i_160_++] -= is_159_[i++];
				is[i_160_++] -= is_159_[i++];
				is[i_160_++] -= is_159_[i++];
			}
			for (int i_168_ = i_161_; i_168_ < 0; i_168_++)
				is[i_160_++] -= is_159_[i++];
			i_160_ += i_163_;
			i += i_164_;
		}
	}

	void method1844(int i, int i_169_, int i_170_, int i_171_) {
		if (aClass138ArrayArray1704 != null) {
			int i_172_ = i - 1 >> 7;
			int i_173_ = i - 1 + i_170_ - 1 >> 7;
			int i_174_ = i_169_ - 1 >> 7;
			int i_175_ = i_169_ - 1 + i_171_ - 1 >> 7;
			for (int i_176_ = i_172_; i_176_ <= i_173_; i_176_++) {
				Class138[] class138s = aClass138ArrayArray1704[i_176_];
				for (int i_177_ = i_174_; i_177_ <= i_175_; i_177_++)
					class138s[i_177_].aBool1641 = true;
			}
		}
	}
}
