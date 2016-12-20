/* Class141 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class141 {
	Class161_Sub2 aClass161_Sub2_1648;
	int anInt1649;
	byte[] aByteArray1650;
	Class180_Sub3 aClass180_Sub3_1651;
	int anInt1652;
	int anInt1653;
	int anInt1654;
	int anInt1655;
	Class128[][] aClass128ArrayArray1656;

	void method2342() {
		aClass128ArrayArray1656 = new Class128[anInt1653][anInt1654];
		for (int i = 0; i < anInt1654; i++) {
			for (int i_0_ = 0; i_0_ < anInt1653; i_0_++)
				aClass128ArrayArray1656[i_0_][i] = new Class128(aClass180_Sub3_1651, this, aClass161_Sub2_1648, i_0_, i, anInt1655, i_0_ * 128 + 1, i * 128 + 1);
		}
	}

	void method2343() {
		aClass128ArrayArray1656 = new Class128[anInt1653][anInt1654];
		for (int i = 0; i < anInt1654; i++) {
			for (int i_1_ = 0; i_1_ < anInt1653; i_1_++)
				aClass128ArrayArray1656[i_1_][i] = new Class128(aClass180_Sub3_1651, this, aClass161_Sub2_1648, i_1_, i, anInt1655, i_1_ * 128 + 1, i * 128 + 1);
		}
	}

	void method2344() {
		aClass128ArrayArray1656 = new Class128[anInt1653][anInt1654];
		for (int i = 0; i < anInt1654; i++) {
			for (int i_2_ = 0; i_2_ < anInt1653; i_2_++)
				aClass128ArrayArray1656[i_2_][i] = new Class128(aClass180_Sub3_1651, this, aClass161_Sub2_1648, i_2_, i, anInt1655, i_2_ * 128 + 1, i * 128 + 1);
		}
	}

	void method2345(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_3_) {
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1 = (Class527_Sub8_Sub8_Sub1) class527_sub8_sub8;
		i += class527_sub8_sub8_sub1.anInt12051 + 1;
		i_3_ += class527_sub8_sub8_sub1.anInt12050 + 1;
		int i_4_ = i + i_3_ * anInt1649;
		int i_5_ = 0;
		int i_6_ = class527_sub8_sub8_sub1.anInt12048;
		int i_7_ = class527_sub8_sub8_sub1.anInt12049;
		int i_8_ = anInt1649 - i_7_;
		int i_9_ = 0;
		if (i_3_ <= 0) {
			int i_10_ = 1 - i_3_;
			i_6_ -= i_10_;
			i_5_ += i_10_ * i_7_;
			i_4_ += i_10_ * anInt1649;
			i_3_ = 1;
		}
		if (i_3_ + i_6_ >= anInt1652) {
			int i_11_ = i_3_ + i_6_ + 1 - anInt1652;
			i_6_ -= i_11_;
		}
		if (i <= 0) {
			int i_12_ = 1 - i;
			i_7_ -= i_12_;
			i_5_ += i_12_;
			i_4_ += i_12_;
			i_9_ += i_12_;
			i_8_ += i_12_;
			i = 1;
		}
		if (i + i_7_ >= anInt1649) {
			int i_13_ = i + i_7_ + 1 - anInt1649;
			i_7_ -= i_13_;
			i_9_ += i_13_;
			i_8_ += i_13_;
		}
		if (i_7_ > 0 && i_6_ > 0) {
			method2352(aByteArray1650, class527_sub8_sub8_sub1.aByteArray12053, i_5_, i_4_, i_7_, i_6_, i_8_, i_9_);
			method2366(i, i_3_, i_7_, i_6_);
		}
	}

	void method2346(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_14_) {
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1 = (Class527_Sub8_Sub8_Sub1) class527_sub8_sub8;
		i += class527_sub8_sub8_sub1.anInt12051 + 1;
		i_14_ += class527_sub8_sub8_sub1.anInt12050 + 1;
		int i_15_ = i + i_14_ * anInt1649;
		int i_16_ = 0;
		int i_17_ = class527_sub8_sub8_sub1.anInt12048;
		int i_18_ = class527_sub8_sub8_sub1.anInt12049;
		int i_19_ = anInt1649 - i_18_;
		int i_20_ = 0;
		if (i_14_ <= 0) {
			int i_21_ = 1 - i_14_;
			i_17_ -= i_21_;
			i_16_ += i_21_ * i_18_;
			i_15_ += i_21_ * anInt1649;
			i_14_ = 1;
		}
		if (i_14_ + i_17_ >= anInt1652) {
			int i_22_ = i_14_ + i_17_ + 1 - anInt1652;
			i_17_ -= i_22_;
		}
		if (i <= 0) {
			int i_23_ = 1 - i;
			i_18_ -= i_23_;
			i_16_ += i_23_;
			i_15_ += i_23_;
			i_20_ += i_23_;
			i_19_ += i_23_;
			i = 1;
		}
		if (i + i_18_ >= anInt1649) {
			int i_24_ = i + i_18_ + 1 - anInt1649;
			i_18_ -= i_24_;
			i_20_ += i_24_;
			i_19_ += i_24_;
		}
		if (i_18_ > 0 && i_17_ > 0) {
			method2350(aByteArray1650, class527_sub8_sub8_sub1.aByteArray12053, i_16_, i_15_, i_18_, i_17_, i_19_, i_20_);
			method2366(i, i_14_, i_18_, i_17_);
		}
	}

	void method2347(int i, int i_25_, int i_26_, boolean[][] bools, boolean bool) {
		aClass180_Sub3_1651.method15409(false);
		aClass180_Sub3_1651.method15412(false);
		aClass180_Sub3_1651.method15397(-2);
		aClass180_Sub3_1651.method15402(1);
		aClass180_Sub3_1651.method15525(1);
		float f = 1.0F / (float) (aClass180_Sub3_1651.anInt9706 * 128);
		if (bool) {
			for (int i_27_ = 0; i_27_ < anInt1654; i_27_++) {
				int i_28_ = i_27_ << anInt1655;
				int i_29_ = i_27_ + 1 << anInt1655;
				for (int i_30_ = 0; i_30_ < anInt1653; i_30_++) {
					int i_31_ = i_30_ << anInt1655;
					int i_32_ = i_30_ + 1 << anInt1655;
					while_101_: for (int i_33_ = i_31_; i_33_ < i_32_; i_33_++) {
						if (i_33_ - i >= -i_26_ && i_33_ - i <= i_26_) {
							for (int i_34_ = i_28_; i_34_ < i_29_; i_34_++) {
								if (i_34_ - i_25_ >= -i_26_ && i_34_ - i_25_ <= i_26_ && (bools[i_33_ - i + i_26_][i_34_ - i_25_ + i_26_])) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(f, f, 1.0F);
									OpenGL.glTranslatef((float) -i_30_ / f, (float) -i_27_ / f, 1.0F);
									OpenGL.glMatrixMode(5888);
									aClass128ArrayArray1656[i_30_][i_27_].method2166();
									break while_101_;
								}
							}
						}
					}
				}
			}
		} else {
			for (int i_35_ = 0; i_35_ < anInt1654; i_35_++) {
				int i_36_ = i_35_ << anInt1655;
				int i_37_ = i_35_ + 1 << anInt1655;
				for (int i_38_ = 0; i_38_ < anInt1653; i_38_++) {
					int i_39_ = 0;
					int i_40_ = i_38_ << anInt1655;
					int i_41_ = i_38_ + 1 << anInt1655;
					Class527_Sub38_Sub1 class527_sub38_sub1 = aClass180_Sub3_1651.aClass527_Sub38_Sub1_9819;
					class527_sub38_sub1.anInt10689 = 0;
					for (int i_42_ = i_36_; i_42_ < i_37_; i_42_++) {
						if (i_42_ - i_25_ >= -i_26_ && i_42_ - i_25_ <= i_26_) {
							int i_43_ = (i_42_ * (aClass161_Sub2_1648.anInt1750 * 1210322533) + i_40_);
							for (int i_44_ = i_40_; i_44_ < i_41_; i_44_++) {
								if (i_44_ - i >= -i_26_ && i_44_ - i <= i_26_ && (bools[i_44_ - i + i_26_][i_42_ - i_25_ + i_26_])) {
									short[] is = (aClass161_Sub2_1648.aShortArrayArray9261[i_43_]);
									if (is != null) {
										if (aClass180_Sub3_1651.aBool9788) {
											for (int i_45_ = 0; i_45_ < is.length; i_45_++) {
												class527_sub38_sub1.writeShort(is[i_45_] & 0xffff, 1404835786);
												i_39_++;
											}
										} else {
											for (int i_46_ = 0; i_46_ < is.length; i_46_++) {
												class527_sub38_sub1.writeShortLE(is[i_46_] & 0xffff, 1936554268);
												i_39_++;
											}
										}
									}
								}
								i_43_++;
							}
						}
					}
					if (i_39_ > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(f, f, 1.0F);
						OpenGL.glTranslatef((float) -i_38_ / f, (float) -i_35_ / f, 1.0F);
						OpenGL.glMatrixMode(5888);
						aClass128ArrayArray1656[i_38_][i_35_].method2167(class527_sub38_sub1.buffer, i_39_);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	boolean method2348(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_47_) {
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1 = (Class527_Sub8_Sub8_Sub1) class527_sub8_sub8;
		i += class527_sub8_sub8_sub1.anInt12051 + 1;
		i_47_ += class527_sub8_sub8_sub1.anInt12050 + 1;
		int i_48_ = i + i_47_ * anInt1649;
		int i_49_ = class527_sub8_sub8_sub1.anInt12048;
		int i_50_ = class527_sub8_sub8_sub1.anInt12049;
		int i_51_ = anInt1649 - i_50_;
		if (i_47_ <= 0) {
			int i_52_ = 1 - i_47_;
			i_49_ -= i_52_;
			i_48_ += i_52_ * anInt1649;
			i_47_ = 1;
		}
		if (i_47_ + i_49_ >= anInt1652) {
			int i_53_ = i_47_ + i_49_ + 1 - anInt1652;
			i_49_ -= i_53_;
		}
		if (i <= 0) {
			int i_54_ = 1 - i;
			i_50_ -= i_54_;
			i_48_ += i_54_;
			i_51_ += i_54_;
			i = 1;
		}
		if (i + i_50_ >= anInt1649) {
			int i_55_ = i + i_50_ + 1 - anInt1649;
			i_50_ -= i_55_;
			i_51_ += i_55_;
		}
		if (i_50_ <= 0 || i_49_ <= 0)
			return false;
		int i_56_ = 8;
		i_51_ += (i_56_ - 1) * anInt1649;
		return method2354(aByteArray1650, i_48_, i_50_, i_49_, i_51_, i_56_);
	}

	void method2349() {
		aClass128ArrayArray1656 = new Class128[anInt1653][anInt1654];
		for (int i = 0; i < anInt1654; i++) {
			for (int i_57_ = 0; i_57_ < anInt1653; i_57_++)
				aClass128ArrayArray1656[i_57_][i] = new Class128(aClass180_Sub3_1651, this, aClass161_Sub2_1648, i_57_, i, anInt1655, i_57_ * 128 + 1, i * 128 + 1);
		}
	}

	static final void method2350(byte[] is, byte[] is_58_, int i, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_) {
		int i_64_ = -(i_60_ >> 2);
		i_60_ = -(i_60_ & 0x3);
		for (int i_65_ = -i_61_; i_65_ < 0; i_65_++) {
			for (int i_66_ = i_64_; i_66_ < 0; i_66_++) {
				is[i_59_++] -= is_58_[i++];
				is[i_59_++] -= is_58_[i++];
				is[i_59_++] -= is_58_[i++];
				is[i_59_++] -= is_58_[i++];
			}
			for (int i_67_ = i_60_; i_67_ < 0; i_67_++)
				is[i_59_++] -= is_58_[i++];
			i_59_ += i_62_;
			i += i_63_;
		}
	}

	boolean method2351(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_68_) {
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1 = (Class527_Sub8_Sub8_Sub1) class527_sub8_sub8;
		i += class527_sub8_sub8_sub1.anInt12051 + 1;
		i_68_ += class527_sub8_sub8_sub1.anInt12050 + 1;
		int i_69_ = i + i_68_ * anInt1649;
		int i_70_ = class527_sub8_sub8_sub1.anInt12048;
		int i_71_ = class527_sub8_sub8_sub1.anInt12049;
		int i_72_ = anInt1649 - i_71_;
		if (i_68_ <= 0) {
			int i_73_ = 1 - i_68_;
			i_70_ -= i_73_;
			i_69_ += i_73_ * anInt1649;
			i_68_ = 1;
		}
		if (i_68_ + i_70_ >= anInt1652) {
			int i_74_ = i_68_ + i_70_ + 1 - anInt1652;
			i_70_ -= i_74_;
		}
		if (i <= 0) {
			int i_75_ = 1 - i;
			i_71_ -= i_75_;
			i_69_ += i_75_;
			i_72_ += i_75_;
			i = 1;
		}
		if (i + i_71_ >= anInt1649) {
			int i_76_ = i + i_71_ + 1 - anInt1649;
			i_71_ -= i_76_;
			i_72_ += i_76_;
		}
		if (i_71_ <= 0 || i_70_ <= 0)
			return false;
		int i_77_ = 8;
		i_72_ += (i_77_ - 1) * anInt1649;
		return method2354(aByteArray1650, i_69_, i_71_, i_70_, i_72_, i_77_);
	}

	static final void method2352(byte[] is, byte[] is_78_, int i, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_) {
		int i_84_ = -(i_80_ >> 2);
		i_80_ = -(i_80_ & 0x3);
		for (int i_85_ = -i_81_; i_85_ < 0; i_85_++) {
			for (int i_86_ = i_84_; i_86_ < 0; i_86_++) {
				is[i_79_++] += is_78_[i++];
				is[i_79_++] += is_78_[i++];
				is[i_79_++] += is_78_[i++];
				is[i_79_++] += is_78_[i++];
			}
			for (int i_87_ = i_80_; i_87_ < 0; i_87_++)
				is[i_79_++] += is_78_[i++];
			i_79_ += i_82_;
			i += i_83_;
		}
	}

	void method2353() {
		aClass128ArrayArray1656 = new Class128[anInt1653][anInt1654];
		for (int i = 0; i < anInt1654; i++) {
			for (int i_88_ = 0; i_88_ < anInt1653; i_88_++)
				aClass128ArrayArray1656[i_88_][i] = new Class128(aClass180_Sub3_1651, this, aClass161_Sub2_1648, i_88_, i, anInt1655, i_88_ * 128 + 1, i * 128 + 1);
		}
	}

	static final boolean method2354(byte[] is, int i, int i_89_, int i_90_, int i_91_, int i_92_) {
		int i_93_ = i_89_ % i_92_;
		int i_94_;
		if (i_93_ != 0)
			i_94_ = i_92_ - i_93_;
		else
			i_94_ = 0;
		int i_95_ = -((i_90_ + i_92_ - 1) / i_92_);
		int i_96_ = -((i_89_ + i_92_ - 1) / i_92_);
		for (int i_97_ = i_95_; i_97_ < 0; i_97_++) {
			for (int i_98_ = i_96_; i_98_ < 0; i_98_++) {
				if (is[i] == 0)
					return true;
				i += i_92_;
			}
			i -= i_94_;
			if (is[i - 1] == 0)
				return true;
			i += i_91_;
		}
		return false;
	}

	boolean method2355(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_99_) {
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1 = (Class527_Sub8_Sub8_Sub1) class527_sub8_sub8;
		i += class527_sub8_sub8_sub1.anInt12051 + 1;
		i_99_ += class527_sub8_sub8_sub1.anInt12050 + 1;
		int i_100_ = i + i_99_ * anInt1649;
		int i_101_ = class527_sub8_sub8_sub1.anInt12048;
		int i_102_ = class527_sub8_sub8_sub1.anInt12049;
		int i_103_ = anInt1649 - i_102_;
		if (i_99_ <= 0) {
			int i_104_ = 1 - i_99_;
			i_101_ -= i_104_;
			i_100_ += i_104_ * anInt1649;
			i_99_ = 1;
		}
		if (i_99_ + i_101_ >= anInt1652) {
			int i_105_ = i_99_ + i_101_ + 1 - anInt1652;
			i_101_ -= i_105_;
		}
		if (i <= 0) {
			int i_106_ = 1 - i;
			i_102_ -= i_106_;
			i_100_ += i_106_;
			i_103_ += i_106_;
			i = 1;
		}
		if (i + i_102_ >= anInt1649) {
			int i_107_ = i + i_102_ + 1 - anInt1649;
			i_102_ -= i_107_;
			i_103_ += i_107_;
		}
		if (i_102_ <= 0 || i_101_ <= 0)
			return false;
		int i_108_ = 8;
		i_103_ += (i_108_ - 1) * anInt1649;
		return method2354(aByteArray1650, i_100_, i_102_, i_101_, i_103_, i_108_);
	}

	void method2356(int i, int i_109_, int i_110_, boolean[][] bools, boolean bool) {
		aClass180_Sub3_1651.method15409(false);
		aClass180_Sub3_1651.method15412(false);
		aClass180_Sub3_1651.method15397(-2);
		aClass180_Sub3_1651.method15402(1);
		aClass180_Sub3_1651.method15525(1);
		float f = 1.0F / (float) (aClass180_Sub3_1651.anInt9706 * 128);
		if (bool) {
			for (int i_111_ = 0; i_111_ < anInt1654; i_111_++) {
				int i_112_ = i_111_ << anInt1655;
				int i_113_ = i_111_ + 1 << anInt1655;
				for (int i_114_ = 0; i_114_ < anInt1653; i_114_++) {
					int i_115_ = i_114_ << anInt1655;
					int i_116_ = i_114_ + 1 << anInt1655;
					while_102_: for (int i_117_ = i_115_; i_117_ < i_116_; i_117_++) {
						if (i_117_ - i >= -i_110_ && i_117_ - i <= i_110_) {
							for (int i_118_ = i_112_; i_118_ < i_113_; i_118_++) {
								if (i_118_ - i_109_ >= -i_110_ && i_118_ - i_109_ <= i_110_ && (bools[i_117_ - i + i_110_][i_118_ - i_109_ + i_110_])) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(f, f, 1.0F);
									OpenGL.glTranslatef((float) -i_114_ / f, (float) -i_111_ / f, 1.0F);
									OpenGL.glMatrixMode(5888);
									aClass128ArrayArray1656[i_114_][i_111_].method2166();
									break while_102_;
								}
							}
						}
					}
				}
			}
		} else {
			for (int i_119_ = 0; i_119_ < anInt1654; i_119_++) {
				int i_120_ = i_119_ << anInt1655;
				int i_121_ = i_119_ + 1 << anInt1655;
				for (int i_122_ = 0; i_122_ < anInt1653; i_122_++) {
					int i_123_ = 0;
					int i_124_ = i_122_ << anInt1655;
					int i_125_ = i_122_ + 1 << anInt1655;
					Class527_Sub38_Sub1 class527_sub38_sub1 = aClass180_Sub3_1651.aClass527_Sub38_Sub1_9819;
					class527_sub38_sub1.anInt10689 = 0;
					for (int i_126_ = i_120_; i_126_ < i_121_; i_126_++) {
						if (i_126_ - i_109_ >= -i_110_ && i_126_ - i_109_ <= i_110_) {
							int i_127_ = (i_126_ * (aClass161_Sub2_1648.anInt1750 * 1210322533) + i_124_);
							for (int i_128_ = i_124_; i_128_ < i_125_; i_128_++) {
								if (i_128_ - i >= -i_110_ && i_128_ - i <= i_110_ && (bools[i_128_ - i + i_110_][i_126_ - i_109_ + i_110_])) {
									short[] is = (aClass161_Sub2_1648.aShortArrayArray9261[i_127_]);
									if (is != null) {
										if (aClass180_Sub3_1651.aBool9788) {
											for (int i_129_ = 0; i_129_ < is.length; i_129_++) {
												class527_sub38_sub1.writeShort(is[i_129_] & 0xffff, 1404835786);
												i_123_++;
											}
										} else {
											for (int i_130_ = 0; i_130_ < is.length; i_130_++) {
												class527_sub38_sub1.writeShortLE(is[i_130_] & 0xffff, -148447788);
												i_123_++;
											}
										}
									}
								}
								i_127_++;
							}
						}
					}
					if (i_123_ > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(f, f, 1.0F);
						OpenGL.glTranslatef((float) -i_122_ / f, (float) -i_119_ / f, 1.0F);
						OpenGL.glMatrixMode(5888);
						aClass128ArrayArray1656[i_122_][i_119_].method2167(class527_sub38_sub1.buffer, i_123_);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method2357(int i, int i_131_, int i_132_, boolean[][] bools, boolean bool) {
		aClass180_Sub3_1651.method15409(false);
		aClass180_Sub3_1651.method15412(false);
		aClass180_Sub3_1651.method15397(-2);
		aClass180_Sub3_1651.method15402(1);
		aClass180_Sub3_1651.method15525(1);
		float f = 1.0F / (float) (aClass180_Sub3_1651.anInt9706 * 128);
		if (bool) {
			for (int i_133_ = 0; i_133_ < anInt1654; i_133_++) {
				int i_134_ = i_133_ << anInt1655;
				int i_135_ = i_133_ + 1 << anInt1655;
				for (int i_136_ = 0; i_136_ < anInt1653; i_136_++) {
					int i_137_ = i_136_ << anInt1655;
					int i_138_ = i_136_ + 1 << anInt1655;
					while_103_: for (int i_139_ = i_137_; i_139_ < i_138_; i_139_++) {
						if (i_139_ - i >= -i_132_ && i_139_ - i <= i_132_) {
							for (int i_140_ = i_134_; i_140_ < i_135_; i_140_++) {
								if (i_140_ - i_131_ >= -i_132_ && i_140_ - i_131_ <= i_132_ && (bools[i_139_ - i + i_132_][i_140_ - i_131_ + i_132_])) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(f, f, 1.0F);
									OpenGL.glTranslatef((float) -i_136_ / f, (float) -i_133_ / f, 1.0F);
									OpenGL.glMatrixMode(5888);
									aClass128ArrayArray1656[i_136_][i_133_].method2166();
									break while_103_;
								}
							}
						}
					}
				}
			}
		} else {
			for (int i_141_ = 0; i_141_ < anInt1654; i_141_++) {
				int i_142_ = i_141_ << anInt1655;
				int i_143_ = i_141_ + 1 << anInt1655;
				for (int i_144_ = 0; i_144_ < anInt1653; i_144_++) {
					int i_145_ = 0;
					int i_146_ = i_144_ << anInt1655;
					int i_147_ = i_144_ + 1 << anInt1655;
					Class527_Sub38_Sub1 class527_sub38_sub1 = aClass180_Sub3_1651.aClass527_Sub38_Sub1_9819;
					class527_sub38_sub1.anInt10689 = 0;
					for (int i_148_ = i_142_; i_148_ < i_143_; i_148_++) {
						if (i_148_ - i_131_ >= -i_132_ && i_148_ - i_131_ <= i_132_) {
							int i_149_ = (i_148_ * (aClass161_Sub2_1648.anInt1750 * 1210322533) + i_146_);
							for (int i_150_ = i_146_; i_150_ < i_147_; i_150_++) {
								if (i_150_ - i >= -i_132_ && i_150_ - i <= i_132_ && (bools[i_150_ - i + i_132_][i_148_ - i_131_ + i_132_])) {
									short[] is = (aClass161_Sub2_1648.aShortArrayArray9261[i_149_]);
									if (is != null) {
										if (aClass180_Sub3_1651.aBool9788) {
											for (int i_151_ = 0; i_151_ < is.length; i_151_++) {
												class527_sub38_sub1.writeShort(is[i_151_] & 0xffff, 1404835786);
												i_145_++;
											}
										} else {
											for (int i_152_ = 0; i_152_ < is.length; i_152_++) {
												class527_sub38_sub1.writeShortLE(is[i_152_] & 0xffff, 948219522);
												i_145_++;
											}
										}
									}
								}
								i_149_++;
							}
						}
					}
					if (i_145_ > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(f, f, 1.0F);
						OpenGL.glTranslatef((float) -i_144_ / f, (float) -i_141_ / f, 1.0F);
						OpenGL.glMatrixMode(5888);
						aClass128ArrayArray1656[i_144_][i_141_].method2167(class527_sub38_sub1.buffer, i_145_);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	Class141(Class180_Sub3 class180_sub3, Class161_Sub2 class161_sub2) {
		aClass180_Sub3_1651 = class180_sub3;
		aClass161_Sub2_1648 = class161_sub2;
		anInt1649 = 2 + ((aClass161_Sub2_1648.anInt1750 * 1210322533 * (aClass161_Sub2_1648.anInt1752 * 1048375491)) >> aClass180_Sub3_1651.anInt9850);
		anInt1652 = 2 + ((aClass161_Sub2_1648.anInt1751 * -533476177 * (aClass161_Sub2_1648.anInt1752 * 1048375491)) >> aClass180_Sub3_1651.anInt9850);
		aByteArray1650 = new byte[anInt1649 * anInt1652];
		anInt1655 = (7 + aClass180_Sub3_1651.anInt9850 - aClass161_Sub2_1648.anInt1753 * 1252000143);
		anInt1653 = aClass161_Sub2_1648.anInt1750 * 1210322533 >> anInt1655;
		anInt1654 = aClass161_Sub2_1648.anInt1751 * -533476177 >> anInt1655;
	}

	void method2358(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_153_) {
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1 = (Class527_Sub8_Sub8_Sub1) class527_sub8_sub8;
		i += class527_sub8_sub8_sub1.anInt12051 + 1;
		i_153_ += class527_sub8_sub8_sub1.anInt12050 + 1;
		int i_154_ = i + i_153_ * anInt1649;
		int i_155_ = 0;
		int i_156_ = class527_sub8_sub8_sub1.anInt12048;
		int i_157_ = class527_sub8_sub8_sub1.anInt12049;
		int i_158_ = anInt1649 - i_157_;
		int i_159_ = 0;
		if (i_153_ <= 0) {
			int i_160_ = 1 - i_153_;
			i_156_ -= i_160_;
			i_155_ += i_160_ * i_157_;
			i_154_ += i_160_ * anInt1649;
			i_153_ = 1;
		}
		if (i_153_ + i_156_ >= anInt1652) {
			int i_161_ = i_153_ + i_156_ + 1 - anInt1652;
			i_156_ -= i_161_;
		}
		if (i <= 0) {
			int i_162_ = 1 - i;
			i_157_ -= i_162_;
			i_155_ += i_162_;
			i_154_ += i_162_;
			i_159_ += i_162_;
			i_158_ += i_162_;
			i = 1;
		}
		if (i + i_157_ >= anInt1649) {
			int i_163_ = i + i_157_ + 1 - anInt1649;
			i_157_ -= i_163_;
			i_159_ += i_163_;
			i_158_ += i_163_;
		}
		if (i_157_ > 0 && i_156_ > 0) {
			method2352(aByteArray1650, class527_sub8_sub8_sub1.aByteArray12053, i_155_, i_154_, i_157_, i_156_, i_158_, i_159_);
			method2366(i, i_153_, i_157_, i_156_);
		}
	}

	void method2359(int i, int i_164_, int i_165_, int i_166_) {
		if (aClass128ArrayArray1656 != null) {
			int i_167_ = i - 1 >> 7;
			int i_168_ = i - 1 + i_165_ - 1 >> 7;
			int i_169_ = i_164_ - 1 >> 7;
			int i_170_ = i_164_ - 1 + i_166_ - 1 >> 7;
			for (int i_171_ = i_167_; i_171_ <= i_168_; i_171_++) {
				Class128[] class128s = aClass128ArrayArray1656[i_171_];
				for (int i_172_ = i_169_; i_172_ <= i_170_; i_172_++)
					class128s[i_172_].aBool1532 = true;
			}
		}
	}

	void method2360(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_173_) {
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1 = (Class527_Sub8_Sub8_Sub1) class527_sub8_sub8;
		i += class527_sub8_sub8_sub1.anInt12051 + 1;
		i_173_ += class527_sub8_sub8_sub1.anInt12050 + 1;
		int i_174_ = i + i_173_ * anInt1649;
		int i_175_ = 0;
		int i_176_ = class527_sub8_sub8_sub1.anInt12048;
		int i_177_ = class527_sub8_sub8_sub1.anInt12049;
		int i_178_ = anInt1649 - i_177_;
		int i_179_ = 0;
		if (i_173_ <= 0) {
			int i_180_ = 1 - i_173_;
			i_176_ -= i_180_;
			i_175_ += i_180_ * i_177_;
			i_174_ += i_180_ * anInt1649;
			i_173_ = 1;
		}
		if (i_173_ + i_176_ >= anInt1652) {
			int i_181_ = i_173_ + i_176_ + 1 - anInt1652;
			i_176_ -= i_181_;
		}
		if (i <= 0) {
			int i_182_ = 1 - i;
			i_177_ -= i_182_;
			i_175_ += i_182_;
			i_174_ += i_182_;
			i_179_ += i_182_;
			i_178_ += i_182_;
			i = 1;
		}
		if (i + i_177_ >= anInt1649) {
			int i_183_ = i + i_177_ + 1 - anInt1649;
			i_177_ -= i_183_;
			i_179_ += i_183_;
			i_178_ += i_183_;
		}
		if (i_177_ > 0 && i_176_ > 0) {
			method2352(aByteArray1650, class527_sub8_sub8_sub1.aByteArray12053, i_175_, i_174_, i_177_, i_176_, i_178_, i_179_);
			method2366(i, i_173_, i_177_, i_176_);
		}
	}

	void method2361(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_184_) {
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1 = (Class527_Sub8_Sub8_Sub1) class527_sub8_sub8;
		i += class527_sub8_sub8_sub1.anInt12051 + 1;
		i_184_ += class527_sub8_sub8_sub1.anInt12050 + 1;
		int i_185_ = i + i_184_ * anInt1649;
		int i_186_ = 0;
		int i_187_ = class527_sub8_sub8_sub1.anInt12048;
		int i_188_ = class527_sub8_sub8_sub1.anInt12049;
		int i_189_ = anInt1649 - i_188_;
		int i_190_ = 0;
		if (i_184_ <= 0) {
			int i_191_ = 1 - i_184_;
			i_187_ -= i_191_;
			i_186_ += i_191_ * i_188_;
			i_185_ += i_191_ * anInt1649;
			i_184_ = 1;
		}
		if (i_184_ + i_187_ >= anInt1652) {
			int i_192_ = i_184_ + i_187_ + 1 - anInt1652;
			i_187_ -= i_192_;
		}
		if (i <= 0) {
			int i_193_ = 1 - i;
			i_188_ -= i_193_;
			i_186_ += i_193_;
			i_185_ += i_193_;
			i_190_ += i_193_;
			i_189_ += i_193_;
			i = 1;
		}
		if (i + i_188_ >= anInt1649) {
			int i_194_ = i + i_188_ + 1 - anInt1649;
			i_188_ -= i_194_;
			i_190_ += i_194_;
			i_189_ += i_194_;
		}
		if (i_188_ > 0 && i_187_ > 0) {
			method2350(aByteArray1650, class527_sub8_sub8_sub1.aByteArray12053, i_186_, i_185_, i_188_, i_187_, i_189_, i_190_);
			method2366(i, i_184_, i_188_, i_187_);
		}
	}

	void method2362(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_195_) {
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1 = (Class527_Sub8_Sub8_Sub1) class527_sub8_sub8;
		i += class527_sub8_sub8_sub1.anInt12051 + 1;
		i_195_ += class527_sub8_sub8_sub1.anInt12050 + 1;
		int i_196_ = i + i_195_ * anInt1649;
		int i_197_ = 0;
		int i_198_ = class527_sub8_sub8_sub1.anInt12048;
		int i_199_ = class527_sub8_sub8_sub1.anInt12049;
		int i_200_ = anInt1649 - i_199_;
		int i_201_ = 0;
		if (i_195_ <= 0) {
			int i_202_ = 1 - i_195_;
			i_198_ -= i_202_;
			i_197_ += i_202_ * i_199_;
			i_196_ += i_202_ * anInt1649;
			i_195_ = 1;
		}
		if (i_195_ + i_198_ >= anInt1652) {
			int i_203_ = i_195_ + i_198_ + 1 - anInt1652;
			i_198_ -= i_203_;
		}
		if (i <= 0) {
			int i_204_ = 1 - i;
			i_199_ -= i_204_;
			i_197_ += i_204_;
			i_196_ += i_204_;
			i_201_ += i_204_;
			i_200_ += i_204_;
			i = 1;
		}
		if (i + i_199_ >= anInt1649) {
			int i_205_ = i + i_199_ + 1 - anInt1649;
			i_199_ -= i_205_;
			i_201_ += i_205_;
			i_200_ += i_205_;
		}
		if (i_199_ > 0 && i_198_ > 0) {
			method2352(aByteArray1650, class527_sub8_sub8_sub1.aByteArray12053, i_197_, i_196_, i_199_, i_198_, i_200_, i_201_);
			method2366(i, i_195_, i_199_, i_198_);
		}
	}

	boolean method2363(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_206_) {
		Class527_Sub8_Sub8_Sub1 class527_sub8_sub8_sub1 = (Class527_Sub8_Sub8_Sub1) class527_sub8_sub8;
		i += class527_sub8_sub8_sub1.anInt12051 + 1;
		i_206_ += class527_sub8_sub8_sub1.anInt12050 + 1;
		int i_207_ = i + i_206_ * anInt1649;
		int i_208_ = class527_sub8_sub8_sub1.anInt12048;
		int i_209_ = class527_sub8_sub8_sub1.anInt12049;
		int i_210_ = anInt1649 - i_209_;
		if (i_206_ <= 0) {
			int i_211_ = 1 - i_206_;
			i_208_ -= i_211_;
			i_207_ += i_211_ * anInt1649;
			i_206_ = 1;
		}
		if (i_206_ + i_208_ >= anInt1652) {
			int i_212_ = i_206_ + i_208_ + 1 - anInt1652;
			i_208_ -= i_212_;
		}
		if (i <= 0) {
			int i_213_ = 1 - i;
			i_209_ -= i_213_;
			i_207_ += i_213_;
			i_210_ += i_213_;
			i = 1;
		}
		if (i + i_209_ >= anInt1649) {
			int i_214_ = i + i_209_ + 1 - anInt1649;
			i_209_ -= i_214_;
			i_210_ += i_214_;
		}
		if (i_209_ <= 0 || i_208_ <= 0)
			return false;
		int i_215_ = 8;
		i_210_ += (i_215_ - 1) * anInt1649;
		return method2354(aByteArray1650, i_207_, i_209_, i_208_, i_210_, i_215_);
	}

	void method2364(int i, int i_216_, int i_217_, boolean[][] bools, boolean bool) {
		aClass180_Sub3_1651.method15409(false);
		aClass180_Sub3_1651.method15412(false);
		aClass180_Sub3_1651.method15397(-2);
		aClass180_Sub3_1651.method15402(1);
		aClass180_Sub3_1651.method15525(1);
		float f = 1.0F / (float) (aClass180_Sub3_1651.anInt9706 * 128);
		if (bool) {
			for (int i_218_ = 0; i_218_ < anInt1654; i_218_++) {
				int i_219_ = i_218_ << anInt1655;
				int i_220_ = i_218_ + 1 << anInt1655;
				for (int i_221_ = 0; i_221_ < anInt1653; i_221_++) {
					int i_222_ = i_221_ << anInt1655;
					int i_223_ = i_221_ + 1 << anInt1655;
					while_104_: for (int i_224_ = i_222_; i_224_ < i_223_; i_224_++) {
						if (i_224_ - i >= -i_217_ && i_224_ - i <= i_217_) {
							for (int i_225_ = i_219_; i_225_ < i_220_; i_225_++) {
								if (i_225_ - i_216_ >= -i_217_ && i_225_ - i_216_ <= i_217_ && (bools[i_224_ - i + i_217_][i_225_ - i_216_ + i_217_])) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(f, f, 1.0F);
									OpenGL.glTranslatef((float) -i_221_ / f, (float) -i_218_ / f, 1.0F);
									OpenGL.glMatrixMode(5888);
									aClass128ArrayArray1656[i_221_][i_218_].method2166();
									break while_104_;
								}
							}
						}
					}
				}
			}
		} else {
			for (int i_226_ = 0; i_226_ < anInt1654; i_226_++) {
				int i_227_ = i_226_ << anInt1655;
				int i_228_ = i_226_ + 1 << anInt1655;
				for (int i_229_ = 0; i_229_ < anInt1653; i_229_++) {
					int i_230_ = 0;
					int i_231_ = i_229_ << anInt1655;
					int i_232_ = i_229_ + 1 << anInt1655;
					Class527_Sub38_Sub1 class527_sub38_sub1 = aClass180_Sub3_1651.aClass527_Sub38_Sub1_9819;
					class527_sub38_sub1.anInt10689 = 0;
					for (int i_233_ = i_227_; i_233_ < i_228_; i_233_++) {
						if (i_233_ - i_216_ >= -i_217_ && i_233_ - i_216_ <= i_217_) {
							int i_234_ = (i_233_ * (aClass161_Sub2_1648.anInt1750 * 1210322533) + i_231_);
							for (int i_235_ = i_231_; i_235_ < i_232_; i_235_++) {
								if (i_235_ - i >= -i_217_ && i_235_ - i <= i_217_ && (bools[i_235_ - i + i_217_][i_233_ - i_216_ + i_217_])) {
									short[] is = (aClass161_Sub2_1648.aShortArrayArray9261[i_234_]);
									if (is != null) {
										if (aClass180_Sub3_1651.aBool9788) {
											for (int i_236_ = 0; i_236_ < is.length; i_236_++) {
												class527_sub38_sub1.writeShort(is[i_236_] & 0xffff, 1404835786);
												i_230_++;
											}
										} else {
											for (int i_237_ = 0; i_237_ < is.length; i_237_++) {
												class527_sub38_sub1.writeShortLE(is[i_237_] & 0xffff, 1121805750);
												i_230_++;
											}
										}
									}
								}
								i_234_++;
							}
						}
					}
					if (i_230_ > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(f, f, 1.0F);
						OpenGL.glTranslatef((float) -i_229_ / f, (float) -i_226_ / f, 1.0F);
						OpenGL.glMatrixMode(5888);
						aClass128ArrayArray1656[i_229_][i_226_].method2167(class527_sub38_sub1.buffer, i_230_);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method2365(int i, int i_238_, int i_239_, int i_240_) {
		if (aClass128ArrayArray1656 != null) {
			int i_241_ = i - 1 >> 7;
			int i_242_ = i - 1 + i_239_ - 1 >> 7;
			int i_243_ = i_238_ - 1 >> 7;
			int i_244_ = i_238_ - 1 + i_240_ - 1 >> 7;
			for (int i_245_ = i_241_; i_245_ <= i_242_; i_245_++) {
				Class128[] class128s = aClass128ArrayArray1656[i_245_];
				for (int i_246_ = i_243_; i_246_ <= i_244_; i_246_++)
					class128s[i_246_].aBool1532 = true;
			}
		}
	}

	void method2366(int i, int i_247_, int i_248_, int i_249_) {
		if (aClass128ArrayArray1656 != null) {
			int i_250_ = i - 1 >> 7;
			int i_251_ = i - 1 + i_248_ - 1 >> 7;
			int i_252_ = i_247_ - 1 >> 7;
			int i_253_ = i_247_ - 1 + i_249_ - 1 >> 7;
			for (int i_254_ = i_250_; i_254_ <= i_251_; i_254_++) {
				Class128[] class128s = aClass128ArrayArray1656[i_254_];
				for (int i_255_ = i_252_; i_255_ <= i_253_; i_255_++)
					class128s[i_255_].aBool1532 = true;
			}
		}
	}

	void method2367(int i, int i_256_, int i_257_, int i_258_) {
		if (aClass128ArrayArray1656 != null) {
			int i_259_ = i - 1 >> 7;
			int i_260_ = i - 1 + i_257_ - 1 >> 7;
			int i_261_ = i_256_ - 1 >> 7;
			int i_262_ = i_256_ - 1 + i_258_ - 1 >> 7;
			for (int i_263_ = i_259_; i_263_ <= i_260_; i_263_++) {
				Class128[] class128s = aClass128ArrayArray1656[i_263_];
				for (int i_264_ = i_261_; i_264_ <= i_262_; i_264_++)
					class128s[i_264_].aBool1532 = true;
			}
		}
	}

	void method2368(int i, int i_265_, int i_266_, int i_267_) {
		if (aClass128ArrayArray1656 != null) {
			int i_268_ = i - 1 >> 7;
			int i_269_ = i - 1 + i_266_ - 1 >> 7;
			int i_270_ = i_265_ - 1 >> 7;
			int i_271_ = i_265_ - 1 + i_267_ - 1 >> 7;
			for (int i_272_ = i_268_; i_272_ <= i_269_; i_272_++) {
				Class128[] class128s = aClass128ArrayArray1656[i_272_];
				for (int i_273_ = i_270_; i_273_ <= i_271_; i_273_++)
					class128s[i_273_].aBool1532 = true;
			}
		}
	}

	static final void method2369(byte[] is, byte[] is_274_, int i, int i_275_, int i_276_, int i_277_, int i_278_, int i_279_) {
		int i_280_ = -(i_276_ >> 2);
		i_276_ = -(i_276_ & 0x3);
		for (int i_281_ = -i_277_; i_281_ < 0; i_281_++) {
			for (int i_282_ = i_280_; i_282_ < 0; i_282_++) {
				is[i_275_++] += is_274_[i++];
				is[i_275_++] += is_274_[i++];
				is[i_275_++] += is_274_[i++];
				is[i_275_++] += is_274_[i++];
			}
			for (int i_283_ = i_276_; i_283_ < 0; i_283_++)
				is[i_275_++] += is_274_[i++];
			i_275_ += i_278_;
			i += i_279_;
		}
	}

	static final void method2370(byte[] is, byte[] is_284_, int i, int i_285_, int i_286_, int i_287_, int i_288_, int i_289_) {
		int i_290_ = -(i_286_ >> 2);
		i_286_ = -(i_286_ & 0x3);
		for (int i_291_ = -i_287_; i_291_ < 0; i_291_++) {
			for (int i_292_ = i_290_; i_292_ < 0; i_292_++) {
				is[i_285_++] += is_284_[i++];
				is[i_285_++] += is_284_[i++];
				is[i_285_++] += is_284_[i++];
				is[i_285_++] += is_284_[i++];
			}
			for (int i_293_ = i_286_; i_293_ < 0; i_293_++)
				is[i_285_++] += is_284_[i++];
			i_285_ += i_288_;
			i += i_289_;
		}
	}

	static final void method2371(byte[] is, byte[] is_294_, int i, int i_295_, int i_296_, int i_297_, int i_298_, int i_299_) {
		int i_300_ = -(i_296_ >> 2);
		i_296_ = -(i_296_ & 0x3);
		for (int i_301_ = -i_297_; i_301_ < 0; i_301_++) {
			for (int i_302_ = i_300_; i_302_ < 0; i_302_++) {
				is[i_295_++] -= is_294_[i++];
				is[i_295_++] -= is_294_[i++];
				is[i_295_++] -= is_294_[i++];
				is[i_295_++] -= is_294_[i++];
			}
			for (int i_303_ = i_296_; i_303_ < 0; i_303_++)
				is[i_295_++] -= is_294_[i++];
			i_295_ += i_298_;
			i += i_299_;
		}
	}

	static final void method2372(byte[] is, byte[] is_304_, int i, int i_305_, int i_306_, int i_307_, int i_308_, int i_309_) {
		int i_310_ = -(i_306_ >> 2);
		i_306_ = -(i_306_ & 0x3);
		for (int i_311_ = -i_307_; i_311_ < 0; i_311_++) {
			for (int i_312_ = i_310_; i_312_ < 0; i_312_++) {
				is[i_305_++] -= is_304_[i++];
				is[i_305_++] -= is_304_[i++];
				is[i_305_++] -= is_304_[i++];
				is[i_305_++] -= is_304_[i++];
			}
			for (int i_313_ = i_306_; i_313_ < 0; i_313_++)
				is[i_305_++] -= is_304_[i++];
			i_305_ += i_308_;
			i += i_309_;
		}
	}

	static final boolean method2373(byte[] is, int i, int i_314_, int i_315_, int i_316_, int i_317_) {
		int i_318_ = i_314_ % i_317_;
		int i_319_;
		if (i_318_ != 0)
			i_319_ = i_317_ - i_318_;
		else
			i_319_ = 0;
		int i_320_ = -((i_315_ + i_317_ - 1) / i_317_);
		int i_321_ = -((i_314_ + i_317_ - 1) / i_317_);
		for (int i_322_ = i_320_; i_322_ < 0; i_322_++) {
			for (int i_323_ = i_321_; i_323_ < 0; i_323_++) {
				if (is[i] == 0)
					return true;
				i += i_317_;
			}
			i -= i_319_;
			if (is[i - 1] == 0)
				return true;
			i += i_316_;
		}
		return false;
	}

	static final boolean method2374(byte[] is, int i, int i_324_, int i_325_, int i_326_, int i_327_) {
		int i_328_ = i_324_ % i_327_;
		int i_329_;
		if (i_328_ != 0)
			i_329_ = i_327_ - i_328_;
		else
			i_329_ = 0;
		int i_330_ = -((i_325_ + i_327_ - 1) / i_327_);
		int i_331_ = -((i_324_ + i_327_ - 1) / i_327_);
		for (int i_332_ = i_330_; i_332_ < 0; i_332_++) {
			for (int i_333_ = i_331_; i_333_ < 0; i_333_++) {
				if (is[i] == 0)
					return true;
				i += i_327_;
			}
			i -= i_329_;
			if (is[i - 1] == 0)
				return true;
			i += i_326_;
		}
		return false;
	}
}
