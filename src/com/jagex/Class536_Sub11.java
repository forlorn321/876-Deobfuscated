/* Class536_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub11 extends Class536 {
	Interface15 anInterface15_10447;
	Class160_Sub1 aClass160_Sub1_10448;
	Class536_Sub19 aClass536_Sub19_10449;
	int anInt10450;
	int anInt10451;
	int anInt10452;
	int anInt10453;
	float[][] aFloatArrayArray10454;
	int anInt10455;
	float[][] aFloatArrayArray10456;
	RSByteBuffer aClass536_Sub33_10457;
	Class130 aClass130_10458;
	Class130 aClass130_10459;
	Interface17 anInterface17_10460;
	int anInt10461;
	float[][] aFloatArrayArray10462;
	Class167_Sub2 aClass167_Sub2_10463;
	Class536_Sub33_Sub1 aClass536_Sub33_Sub1_10464;
	Class4 aClass4_10465;

	void method9425(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		long l = -1L;
		int i_5_ = i_3_ + (i_1_ << aClass160_Sub1_10448.anInt1768 * 2064238369);
		int i_6_ = i_4_ + (i_2_ << aClass160_Sub1_10448.anInt1768 * 2064238369);
		int i_7_ = aClass160_Sub1_10448.method1925(i_5_, i_6_, (byte) 8);
		if ((i_3_ & 0x7f) == 0 || (i_4_ & 0x7f) == 0) {
			l = ((long) i_6_ & 0xffffL) << 16 | (long) i_5_ & 0xffffL;
			Class536_Sub20 class536_sub20 = (Class536_Sub20) aClass4_10465.method556(l);
			if (class536_sub20 != null) {
				method9430(class536_sub20.aShort10520);
				return;
			}
		}
		short i_8_ = (short) anInt10461++;
		if (l != -1L)
			aClass4_10465.method560(new Class536_Sub20(i_8_), l);
		float f;
		float f_9_;
		float f_10_;
		if (i_3_ == 0 && i_4_ == 0) {
			f = aFloatArrayArray10454[i][i_0_];
			f_9_ = aFloatArrayArray10456[i][i_0_];
			f_10_ = aFloatArrayArray10462[i][i_0_];
		} else if (i_3_ == aClass160_Sub1_10448.anInt1767 * -1504778739 && i_4_ == 0) {
			f = aFloatArrayArray10454[i + 1][i_0_];
			f_9_ = aFloatArrayArray10456[i + 1][i_0_];
			f_10_ = aFloatArrayArray10462[i + 1][i_0_];
		} else if (i_3_ == aClass160_Sub1_10448.anInt1767 * -1504778739 && i_4_ == aClass160_Sub1_10448.anInt1767 * -1504778739) {
			f = aFloatArrayArray10454[i + 1][i_0_ + 1];
			f_9_ = aFloatArrayArray10456[i + 1][i_0_ + 1];
			f_10_ = aFloatArrayArray10462[i + 1][i_0_ + 1];
		} else if (i_3_ == 0 && i_4_ == aClass160_Sub1_10448.anInt1767 * -1504778739) {
			f = aFloatArrayArray10454[i][i_0_ + 1];
			f_9_ = aFloatArrayArray10456[i][i_0_ + 1];
			f_10_ = aFloatArrayArray10462[i][i_0_ + 1];
		} else {
			float f_11_ = ((float) i_3_ / (float) (aClass160_Sub1_10448.anInt1767 * -1504778739));
			float f_12_ = ((float) i_4_ / (float) (aClass160_Sub1_10448.anInt1767 * -1504778739));
			float f_13_ = aFloatArrayArray10454[i][i_0_];
			float f_14_ = aFloatArrayArray10456[i][i_0_];
			float f_15_ = aFloatArrayArray10462[i][i_0_];
			float f_16_ = aFloatArrayArray10454[i + 1][i_0_];
			float f_17_ = aFloatArrayArray10456[i + 1][i_0_];
			float f_18_ = aFloatArrayArray10462[i + 1][i_0_];
			f_13_ += (aFloatArrayArray10454[i][i_0_ + 1] - f_13_) * f_11_;
			f_14_ += (aFloatArrayArray10456[i][i_0_ + 1] - f_14_) * f_11_;
			f_15_ += (aFloatArrayArray10462[i][i_0_ + 1] - f_15_) * f_11_;
			f_16_ += (aFloatArrayArray10454[i + 1][i_0_ + 1] - f_16_) * f_11_;
			f_17_ += (aFloatArrayArray10456[i + 1][i_0_ + 1] - f_17_) * f_11_;
			f_18_ += (aFloatArrayArray10462[i + 1][i_0_ + 1] - f_18_) * f_11_;
			f = f_13_ + (f_16_ - f_13_) * f_12_;
			f_9_ = f_14_ + (f_17_ - f_14_) * f_12_;
			f_10_ = f_15_ + (f_18_ - f_15_) * f_12_;
		}
		float f_19_ = (float) (aClass536_Sub19_10449.method9548(-1735264973) - i_5_);
		float f_20_ = (float) (aClass536_Sub19_10449.method9549(1495192664) - i_7_);
		float f_21_ = (float) (aClass536_Sub19_10449.method9551((byte) 0) - i_6_);
		float f_22_ = (float) Math.sqrt((double) (f_19_ * f_19_ + f_20_ * f_20_ + f_21_ * f_21_));
		float f_23_ = 1.0F / f_22_;
		f_19_ *= f_23_;
		f_20_ *= f_23_;
		f_21_ *= f_23_;
		float f_24_ = f_22_ / (float) aClass536_Sub19_10449.method9530(-965132984);
		float f_25_ = 1.0F - f_24_ * f_24_;
		if (f_25_ < 0.0F)
			f_25_ = 0.0F;
		float f_26_ = f_19_ * f + f_20_ * f_9_ + f_21_ * f_10_;
		if (f_26_ < 0.0F)
			f_26_ = 0.0F;
		float f_27_ = f_26_ * f_25_ * 2.0F;
		if (f_27_ > 1.0F)
			f_27_ = 1.0F;
		int i_28_ = aClass536_Sub19_10449.method9528(608869197);
		int i_29_ = (int) (f_27_ * (float) (i_28_ >> 16 & 0xff));
		if (i_29_ > 255)
			i_29_ = 255;
		int i_30_ = (int) (f_27_ * (float) (i_28_ >> 8 & 0xff));
		if (i_30_ > 255)
			i_30_ = 255;
		int i_31_ = (int) (f_27_ * (float) (i_28_ & 0xff));
		if (i_31_ > 255)
			i_31_ = 255;
		if (aClass167_Sub2_10463.aBool9284) {
			aClass536_Sub33_Sub1_10464.method10740((float) i_5_);
			aClass536_Sub33_Sub1_10464.method10740((float) i_7_);
			aClass536_Sub33_Sub1_10464.method10740((float) i_6_);
		} else {
			aClass536_Sub33_Sub1_10464.method10741((float) i_5_);
			aClass536_Sub33_Sub1_10464.method10741((float) i_7_);
			aClass536_Sub33_Sub1_10464.method10741((float) i_6_);
		}
		aClass536_Sub33_Sub1_10464.writeByte(i_29_, 465637339);
		aClass536_Sub33_Sub1_10464.writeByte(i_30_, 465637339);
		aClass536_Sub33_Sub1_10464.writeByte(i_31_, 465637339);
		aClass536_Sub33_Sub1_10464.writeByte(255, 465637339);
		method9430(i_8_);
	}

	void method9426(int i, int i_32_, int i_33_, boolean[][] bools) {
		if (anInterface17_10460 != null && anInt10450 <= i + i_33_ && anInt10451 >= i - i_33_ && anInt10452 <= i_32_ + i_33_ && anInt10453 >= i_32_ - i_33_) {
			for (int i_34_ = anInt10452; i_34_ <= anInt10453; i_34_++) {
				for (int i_35_ = anInt10450; i_35_ <= anInt10451; i_35_++) {
					int i_36_ = i_35_ - i;
					int i_37_ = i_34_ - i_32_;
					if (i_36_ > -i_33_ && i_36_ < i_33_ && i_37_ > -i_33_ && i_37_ < i_33_ && bools[i_36_ + i_33_][i_37_ + i_33_]) {
						aClass167_Sub2_10463.method8561((int) (aClass536_Sub19_10449.method9531(1341887202) * 255.0F) << 24);
						aClass167_Sub2_10463.method8547(aClass130_10458, null, aClass130_10459, null);
						aClass167_Sub2_10463.method8511(anInterface17_10460, 4, 0, anInt10455);
						return;
					}
				}
			}
		}
	}

	void method9427(int i, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_) {
		long l = -1L;
		int i_43_ = i_41_ + (i_39_ << aClass160_Sub1_10448.anInt1768 * 2064238369);
		int i_44_ = i_42_ + (i_40_ << aClass160_Sub1_10448.anInt1768 * 2064238369);
		int i_45_ = aClass160_Sub1_10448.method1925(i_43_, i_44_, (byte) -27);
		if ((i_41_ & 0x7f) == 0 || (i_42_ & 0x7f) == 0) {
			l = ((long) i_44_ & 0xffffL) << 16 | (long) i_43_ & 0xffffL;
			Class536_Sub20 class536_sub20 = (Class536_Sub20) aClass4_10465.method556(l);
			if (class536_sub20 != null) {
				method9430(class536_sub20.aShort10520);
				return;
			}
		}
		short i_46_ = (short) anInt10461++;
		if (l != -1L)
			aClass4_10465.method560(new Class536_Sub20(i_46_), l);
		float f;
		float f_47_;
		float f_48_;
		if (i_41_ == 0 && i_42_ == 0) {
			f = aFloatArrayArray10454[i][i_38_];
			f_47_ = aFloatArrayArray10456[i][i_38_];
			f_48_ = aFloatArrayArray10462[i][i_38_];
		} else if (i_41_ == aClass160_Sub1_10448.anInt1767 * -1504778739 && i_42_ == 0) {
			f = aFloatArrayArray10454[i + 1][i_38_];
			f_47_ = aFloatArrayArray10456[i + 1][i_38_];
			f_48_ = aFloatArrayArray10462[i + 1][i_38_];
		} else if (i_41_ == aClass160_Sub1_10448.anInt1767 * -1504778739 && i_42_ == aClass160_Sub1_10448.anInt1767 * -1504778739) {
			f = aFloatArrayArray10454[i + 1][i_38_ + 1];
			f_47_ = aFloatArrayArray10456[i + 1][i_38_ + 1];
			f_48_ = aFloatArrayArray10462[i + 1][i_38_ + 1];
		} else if (i_41_ == 0 && i_42_ == aClass160_Sub1_10448.anInt1767 * -1504778739) {
			f = aFloatArrayArray10454[i][i_38_ + 1];
			f_47_ = aFloatArrayArray10456[i][i_38_ + 1];
			f_48_ = aFloatArrayArray10462[i][i_38_ + 1];
		} else {
			float f_49_ = ((float) i_41_ / (float) (aClass160_Sub1_10448.anInt1767 * -1504778739));
			float f_50_ = ((float) i_42_ / (float) (aClass160_Sub1_10448.anInt1767 * -1504778739));
			float f_51_ = aFloatArrayArray10454[i][i_38_];
			float f_52_ = aFloatArrayArray10456[i][i_38_];
			float f_53_ = aFloatArrayArray10462[i][i_38_];
			float f_54_ = aFloatArrayArray10454[i + 1][i_38_];
			float f_55_ = aFloatArrayArray10456[i + 1][i_38_];
			float f_56_ = aFloatArrayArray10462[i + 1][i_38_];
			f_51_ += (aFloatArrayArray10454[i][i_38_ + 1] - f_51_) * f_49_;
			f_52_ += (aFloatArrayArray10456[i][i_38_ + 1] - f_52_) * f_49_;
			f_53_ += (aFloatArrayArray10462[i][i_38_ + 1] - f_53_) * f_49_;
			f_54_ += (aFloatArrayArray10454[i + 1][i_38_ + 1] - f_54_) * f_49_;
			f_55_ += (aFloatArrayArray10456[i + 1][i_38_ + 1] - f_55_) * f_49_;
			f_56_ += (aFloatArrayArray10462[i + 1][i_38_ + 1] - f_56_) * f_49_;
			f = f_51_ + (f_54_ - f_51_) * f_50_;
			f_47_ = f_52_ + (f_55_ - f_52_) * f_50_;
			f_48_ = f_53_ + (f_56_ - f_53_) * f_50_;
		}
		float f_57_ = (float) (aClass536_Sub19_10449.method9548(-770368360) - i_43_);
		float f_58_ = (float) (aClass536_Sub19_10449.method9549(1255750571) - i_45_);
		float f_59_ = (float) (aClass536_Sub19_10449.method9551((byte) 0) - i_44_);
		float f_60_ = (float) Math.sqrt((double) (f_57_ * f_57_ + f_58_ * f_58_ + f_59_ * f_59_));
		float f_61_ = 1.0F / f_60_;
		f_57_ *= f_61_;
		f_58_ *= f_61_;
		f_59_ *= f_61_;
		float f_62_ = f_60_ / (float) aClass536_Sub19_10449.method9530(-647707878);
		float f_63_ = 1.0F - f_62_ * f_62_;
		if (f_63_ < 0.0F)
			f_63_ = 0.0F;
		float f_64_ = f_57_ * f + f_58_ * f_47_ + f_59_ * f_48_;
		if (f_64_ < 0.0F)
			f_64_ = 0.0F;
		float f_65_ = f_64_ * f_63_ * 2.0F;
		if (f_65_ > 1.0F)
			f_65_ = 1.0F;
		int i_66_ = aClass536_Sub19_10449.method9528(1508479577);
		int i_67_ = (int) (f_65_ * (float) (i_66_ >> 16 & 0xff));
		if (i_67_ > 255)
			i_67_ = 255;
		int i_68_ = (int) (f_65_ * (float) (i_66_ >> 8 & 0xff));
		if (i_68_ > 255)
			i_68_ = 255;
		int i_69_ = (int) (f_65_ * (float) (i_66_ & 0xff));
		if (i_69_ > 255)
			i_69_ = 255;
		if (aClass167_Sub2_10463.aBool9284) {
			aClass536_Sub33_Sub1_10464.method10740((float) i_43_);
			aClass536_Sub33_Sub1_10464.method10740((float) i_45_);
			aClass536_Sub33_Sub1_10464.method10740((float) i_44_);
		} else {
			aClass536_Sub33_Sub1_10464.method10741((float) i_43_);
			aClass536_Sub33_Sub1_10464.method10741((float) i_45_);
			aClass536_Sub33_Sub1_10464.method10741((float) i_44_);
		}
		aClass536_Sub33_Sub1_10464.writeByte(i_67_, 465637339);
		aClass536_Sub33_Sub1_10464.writeByte(i_68_, 465637339);
		aClass536_Sub33_Sub1_10464.writeByte(i_69_, 465637339);
		aClass536_Sub33_Sub1_10464.writeByte(255, 465637339);
		method9430(i_46_);
	}

	Class536_Sub11(Class167_Sub2 class167_sub2, Class160_Sub1 class160_sub1, Class536_Sub19 class536_sub19, int[] is) {
		aClass167_Sub2_10463 = class167_sub2;
		aClass536_Sub19_10449 = class536_sub19;
		aClass160_Sub1_10448 = class160_sub1;
		int i = (aClass536_Sub19_10449.method9530(1049487327) - (class160_sub1.anInt1767 * -1504778739 >> 1));
		anInt10450 = (aClass536_Sub19_10449.method9548(-32996754) - i >> class160_sub1.anInt1768 * 2064238369);
		anInt10451 = (aClass536_Sub19_10449.method9548(-383696891) + i >> class160_sub1.anInt1768 * 2064238369);
		anInt10452 = (aClass536_Sub19_10449.method9551((byte) 0) - i >> class160_sub1.anInt1768 * 2064238369);
		anInt10453 = (aClass536_Sub19_10449.method9551((byte) 0) + i >> class160_sub1.anInt1768 * 2064238369);
		int i_70_ = anInt10451 - anInt10450 + 1;
		int i_71_ = anInt10453 - anInt10452 + 1;
		aFloatArrayArray10454 = new float[i_70_ + 1][i_71_ + 1];
		aFloatArrayArray10456 = new float[i_70_ + 1][i_71_ + 1];
		aFloatArrayArray10462 = new float[i_70_ + 1][i_71_ + 1];
		for (int i_72_ = 0; i_72_ <= i_71_; i_72_++) {
			int i_73_ = i_72_ + anInt10452;
			if (i_73_ > 0 && i_73_ < aClass160_Sub1_10448.anInt1769 * -889224915 - 1) {
				for (int i_74_ = 0; i_74_ <= i_70_; i_74_++) {
					int i_75_ = i_74_ + anInt10450;
					if (i_75_ > 0 && i_75_ < (aClass160_Sub1_10448.anInt1766 * 1718142487 - 1)) {
						int i_76_ = (class160_sub1.method1927(i_75_ + 1, i_73_, 1463800143) - class160_sub1.method1927(i_75_ - 1, i_73_, 1280225326));
						int i_77_ = (class160_sub1.method1927(i_75_, i_73_ + 1, 717954225) - class160_sub1.method1927(i_75_, i_73_ - 1, -1272433763));
						float f = (float) (1.0 / Math.sqrt((double) (i_76_ * i_76_ + 65536 + (i_77_ * i_77_))));
						aFloatArrayArray10454[i_74_][i_72_] = (float) i_76_ * f;
						aFloatArrayArray10456[i_74_][i_72_] = -256.0F * f;
						aFloatArrayArray10462[i_74_][i_72_] = (float) i_77_ * f;
					}
				}
			}
		}
		int i_78_ = 0;
		for (int i_79_ = anInt10452; i_79_ <= anInt10453; i_79_++) {
			if (i_79_ >= 0 && i_79_ < class160_sub1.anInt1769 * -889224915) {
				for (int i_80_ = anInt10450; i_80_ <= anInt10451; i_80_++) {
					if (i_80_ >= 0 && i_80_ < class160_sub1.anInt1766 * 1718142487) {
						int i_81_ = is[i_78_];
						int[] is_82_ = (class160_sub1.anIntArrayArrayArray9359[i_80_][i_79_]);
						if (is_82_ != null && i_81_ != 0) {
							if (i_81_ == 1) {
								for (int i_83_ = 0; i_83_ < is_82_.length; i_83_ += 3) {
									if (is_82_[i_83_] != -1 && is_82_[i_83_ + 1] != -1 && is_82_[i_83_ + 2] != -1)
										anInt10455 += 3;
								}
							} else
								anInt10455 += 3;
						}
					}
					i_78_++;
				}
			} else
				i_78_ += anInt10451 - anInt10450;
		}
		if (anInt10455 > 0) {
			aClass536_Sub33_10457 = new RSByteBuffer(anInt10455 * 2);
			aClass536_Sub33_Sub1_10464 = new Class536_Sub33_Sub1(anInt10455 * 16);
			aClass4_10465 = new Class4(Class528.method6434(anInt10455, -611750309));
			int i_84_ = 0;
			i_78_ = 0;
			for (int i_85_ = anInt10452; i_85_ <= anInt10453; i_85_++) {
				if (i_85_ >= 0 && i_85_ < class160_sub1.anInt1769 * -889224915) {
					int i_86_ = 0;
					for (int i_87_ = anInt10450; i_87_ <= anInt10451; i_87_++) {
						if (i_87_ >= 0 && i_87_ < class160_sub1.anInt1766 * 1718142487) {
							int i_88_ = is[i_78_];
							int[] is_89_ = (class160_sub1.anIntArrayArrayArray9359[i_87_][i_85_]);
							if (is_89_ != null && i_88_ != 0) {
								if (i_88_ == 1) {
									int[] is_90_ = (class160_sub1.anIntArrayArrayArray9361[i_87_][i_85_]);
									int[] is_91_ = (class160_sub1.anIntArrayArrayArray9362[i_87_][i_85_]);
									int i_92_ = 0;
									while (i_92_ < is_89_.length) {
										if (is_89_[i_92_] != -1 && is_89_[i_92_ + 1] != -1 && is_89_[i_92_ + 2] != -1) {
											method9427(i_86_, i_84_, i_87_, i_85_, is_90_[i_92_], is_91_[i_92_]);
											i_92_++;
											method9427(i_86_, i_84_, i_87_, i_85_, is_90_[i_92_], is_91_[i_92_]);
											i_92_++;
											method9427(i_86_, i_84_, i_87_, i_85_, is_90_[i_92_], is_91_[i_92_]);
											i_92_++;
										} else
											i_92_ += 3;
									}
								} else if (i_88_ == 3) {
									method9427(i_86_, i_84_, i_87_, i_85_, 0, 0);
									method9427(i_86_, i_84_, i_87_, i_85_, (class160_sub1.anInt1767 * -1504778739), 0);
									method9427(i_86_, i_84_, i_87_, i_85_, 0, (class160_sub1.anInt1767 * -1504778739));
								} else if (i_88_ == 2) {
									method9427(i_86_, i_84_, i_87_, i_85_, (class160_sub1.anInt1767 * -1504778739), 0);
									method9427(i_86_, i_84_, i_87_, i_85_, (class160_sub1.anInt1767 * -1504778739), (class160_sub1.anInt1767 * -1504778739));
									method9427(i_86_, i_84_, i_87_, i_85_, 0, 0);
								} else if (i_88_ == 5) {
									method9427(i_86_, i_84_, i_87_, i_85_, (class160_sub1.anInt1767 * -1504778739), (class160_sub1.anInt1767 * -1504778739));
									method9427(i_86_, i_84_, i_87_, i_85_, 0, (class160_sub1.anInt1767 * -1504778739));
									method9427(i_86_, i_84_, i_87_, i_85_, (class160_sub1.anInt1767 * -1504778739), 0);
								} else if (i_88_ == 4) {
									method9427(i_86_, i_84_, i_87_, i_85_, 0, (class160_sub1.anInt1767 * -1504778739));
									method9427(i_86_, i_84_, i_87_, i_85_, 0, 0);
									method9427(i_86_, i_84_, i_87_, i_85_, (class160_sub1.anInt1767 * -1504778739), (class160_sub1.anInt1767 * -1504778739));
								}
							}
						}
						i_78_++;
						i_86_++;
					}
				} else
					i_78_ += anInt10451 - anInt10450;
				i_84_++;
			}
			anInterface17_10460 = (aClass167_Sub2_10463.method8543(5123, aClass536_Sub33_10457.buffer, aClass536_Sub33_10457.off * -810172525, false));
			anInterface15_10447 = aClass167_Sub2_10463.method8522(16, (aClass536_Sub33_Sub1_10464.buffer), (aClass536_Sub33_Sub1_10464.off) * -810172525, false);
			aClass130_10458 = new Class130(anInterface15_10447, 5126, 3, 0);
			aClass130_10459 = new Class130(anInterface15_10447, 5121, 4, 12);
		} else {
			anInterface17_10460 = null;
			anInterface15_10447 = null;
			aClass130_10458 = null;
			aClass130_10459 = null;
		}
		aClass536_Sub33_Sub1_10464 = null;
		aClass536_Sub33_10457 = null;
		aClass4_10465 = null;
		aFloatArrayArray10462 = null;
		aFloatArrayArray10456 = null;
		aFloatArrayArray10454 = null;
	}

	void method9428(short i) {
		if (aClass167_Sub2_10463.aBool9284)
			aClass536_Sub33_10457.writeShort(i, -1778059594);
		else
			aClass536_Sub33_10457.writeShortLE(i, -583205729);
	}

	void method9429(int i, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_) {
		long l = -1L;
		int i_98_ = i_96_ + (i_94_ << aClass160_Sub1_10448.anInt1768 * 2064238369);
		int i_99_ = i_97_ + (i_95_ << aClass160_Sub1_10448.anInt1768 * 2064238369);
		int i_100_ = aClass160_Sub1_10448.method1925(i_98_, i_99_, (byte) -21);
		if ((i_96_ & 0x7f) == 0 || (i_97_ & 0x7f) == 0) {
			l = ((long) i_99_ & 0xffffL) << 16 | (long) i_98_ & 0xffffL;
			Class536_Sub20 class536_sub20 = (Class536_Sub20) aClass4_10465.method556(l);
			if (class536_sub20 != null) {
				method9430(class536_sub20.aShort10520);
				return;
			}
		}
		short i_101_ = (short) anInt10461++;
		if (l != -1L)
			aClass4_10465.method560(new Class536_Sub20(i_101_), l);
		float f;
		float f_102_;
		float f_103_;
		if (i_96_ == 0 && i_97_ == 0) {
			f = aFloatArrayArray10454[i][i_93_];
			f_102_ = aFloatArrayArray10456[i][i_93_];
			f_103_ = aFloatArrayArray10462[i][i_93_];
		} else if (i_96_ == aClass160_Sub1_10448.anInt1767 * -1504778739 && i_97_ == 0) {
			f = aFloatArrayArray10454[i + 1][i_93_];
			f_102_ = aFloatArrayArray10456[i + 1][i_93_];
			f_103_ = aFloatArrayArray10462[i + 1][i_93_];
		} else if (i_96_ == aClass160_Sub1_10448.anInt1767 * -1504778739 && i_97_ == aClass160_Sub1_10448.anInt1767 * -1504778739) {
			f = aFloatArrayArray10454[i + 1][i_93_ + 1];
			f_102_ = aFloatArrayArray10456[i + 1][i_93_ + 1];
			f_103_ = aFloatArrayArray10462[i + 1][i_93_ + 1];
		} else if (i_96_ == 0 && i_97_ == aClass160_Sub1_10448.anInt1767 * -1504778739) {
			f = aFloatArrayArray10454[i][i_93_ + 1];
			f_102_ = aFloatArrayArray10456[i][i_93_ + 1];
			f_103_ = aFloatArrayArray10462[i][i_93_ + 1];
		} else {
			float f_104_ = ((float) i_96_ / (float) (aClass160_Sub1_10448.anInt1767 * -1504778739));
			float f_105_ = ((float) i_97_ / (float) (aClass160_Sub1_10448.anInt1767 * -1504778739));
			float f_106_ = aFloatArrayArray10454[i][i_93_];
			float f_107_ = aFloatArrayArray10456[i][i_93_];
			float f_108_ = aFloatArrayArray10462[i][i_93_];
			float f_109_ = aFloatArrayArray10454[i + 1][i_93_];
			float f_110_ = aFloatArrayArray10456[i + 1][i_93_];
			float f_111_ = aFloatArrayArray10462[i + 1][i_93_];
			f_106_ += (aFloatArrayArray10454[i][i_93_ + 1] - f_106_) * f_104_;
			f_107_ += (aFloatArrayArray10456[i][i_93_ + 1] - f_107_) * f_104_;
			f_108_ += (aFloatArrayArray10462[i][i_93_ + 1] - f_108_) * f_104_;
			f_109_ += (aFloatArrayArray10454[i + 1][i_93_ + 1] - f_109_) * f_104_;
			f_110_ += (aFloatArrayArray10456[i + 1][i_93_ + 1] - f_110_) * f_104_;
			f_111_ += (aFloatArrayArray10462[i + 1][i_93_ + 1] - f_111_) * f_104_;
			f = f_106_ + (f_109_ - f_106_) * f_105_;
			f_102_ = f_107_ + (f_110_ - f_107_) * f_105_;
			f_103_ = f_108_ + (f_111_ - f_108_) * f_105_;
		}
		float f_112_ = (float) (aClass536_Sub19_10449.method9548(208073831) - i_98_);
		float f_113_ = (float) (aClass536_Sub19_10449.method9549(1765986169) - i_100_);
		float f_114_ = (float) (aClass536_Sub19_10449.method9551((byte) 0) - i_99_);
		float f_115_ = (float) Math.sqrt((double) (f_112_ * f_112_ + f_113_ * f_113_ + f_114_ * f_114_));
		float f_116_ = 1.0F / f_115_;
		f_112_ *= f_116_;
		f_113_ *= f_116_;
		f_114_ *= f_116_;
		float f_117_ = f_115_ / (float) aClass536_Sub19_10449.method9530(-1528854210);
		float f_118_ = 1.0F - f_117_ * f_117_;
		if (f_118_ < 0.0F)
			f_118_ = 0.0F;
		float f_119_ = f_112_ * f + f_113_ * f_102_ + f_114_ * f_103_;
		if (f_119_ < 0.0F)
			f_119_ = 0.0F;
		float f_120_ = f_119_ * f_118_ * 2.0F;
		if (f_120_ > 1.0F)
			f_120_ = 1.0F;
		int i_121_ = aClass536_Sub19_10449.method9528(-552463237);
		int i_122_ = (int) (f_120_ * (float) (i_121_ >> 16 & 0xff));
		if (i_122_ > 255)
			i_122_ = 255;
		int i_123_ = (int) (f_120_ * (float) (i_121_ >> 8 & 0xff));
		if (i_123_ > 255)
			i_123_ = 255;
		int i_124_ = (int) (f_120_ * (float) (i_121_ & 0xff));
		if (i_124_ > 255)
			i_124_ = 255;
		if (aClass167_Sub2_10463.aBool9284) {
			aClass536_Sub33_Sub1_10464.method10740((float) i_98_);
			aClass536_Sub33_Sub1_10464.method10740((float) i_100_);
			aClass536_Sub33_Sub1_10464.method10740((float) i_99_);
		} else {
			aClass536_Sub33_Sub1_10464.method10741((float) i_98_);
			aClass536_Sub33_Sub1_10464.method10741((float) i_100_);
			aClass536_Sub33_Sub1_10464.method10741((float) i_99_);
		}
		aClass536_Sub33_Sub1_10464.writeByte(i_122_, 465637339);
		aClass536_Sub33_Sub1_10464.writeByte(i_123_, 465637339);
		aClass536_Sub33_Sub1_10464.writeByte(i_124_, 465637339);
		aClass536_Sub33_Sub1_10464.writeByte(255, 465637339);
		method9430(i_101_);
	}

	void method9430(short i) {
		if (aClass167_Sub2_10463.aBool9284)
			aClass536_Sub33_10457.writeShort(i, -1778059594);
		else
			aClass536_Sub33_10457.writeShortLE(i, -1869922170);
	}
}
