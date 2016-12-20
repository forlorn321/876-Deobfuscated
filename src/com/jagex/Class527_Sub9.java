/* Class527_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub9 extends Class527 {
	Class180_Sub3 aClass180_Sub3_10403;
	Class161_Sub2 aClass161_Sub2_10404;
	Class527_Sub16 aClass527_Sub16_10405;
	int anInt10406;
	float[][] aFloatArrayArray10407;
	int anInt10408;
	Class527_Sub38_Sub1 aClass527_Sub38_Sub1_10409;
	int anInt10410;
	int anInt10411;
	Interface17 anInterface17_10412;
	Interface15 anInterface15_10413;
	Class129 aClass129_10414;
	Class129 aClass129_10415;
	Class14 aClass14_10416;
	float[][] aFloatArrayArray10417;
	RSByteBuffer aClass527_Sub38_10418;
	float[][] aFloatArrayArray10419;
	int anInt10420;
	int anInt10421;

	void method16064(short i) {
		if (aClass180_Sub3_10403.aBool9788)
			aClass527_Sub38_10418.writeShort(i, 1404835786);
		else
			aClass527_Sub38_10418.writeShortLE(i, 1695957054);
	}

	void method16065(short i) {
		if (aClass180_Sub3_10403.aBool9788)
			aClass527_Sub38_10418.writeShort(i, 1404835786);
		else
			aClass527_Sub38_10418.writeShortLE(i, 1777701952);
	}

	void method16066(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		long l = -1L;
		int i_5_ = i_3_ + (i_1_ << aClass161_Sub2_10404.anInt1753 * 1252000143);
		int i_6_ = i_4_ + (i_2_ << aClass161_Sub2_10404.anInt1753 * 1252000143);
		int i_7_ = aClass161_Sub2_10404.method2593(i_5_, i_6_, -1151432033);
		if ((i_3_ & 0x7f) == 0 || (i_4_ & 0x7f) == 0) {
			l = ((long) i_6_ & 0xffffL) << 16 | (long) i_5_ & 0xffffL;
			Class527_Sub13 class527_sub13 = (Class527_Sub13) aClass14_10416.method709(l);
			if (class527_sub13 != null) {
				method16065(class527_sub13.aShort10445);
				return;
			}
		}
		short i_8_ = (short) anInt10410++;
		if (l != -1L)
			aClass14_10416.method714(new Class527_Sub13(i_8_), l);
		float f;
		float f_9_;
		float f_10_;
		if (i_3_ == 0 && i_4_ == 0) {
			f = aFloatArrayArray10419[i][i_0_];
			f_9_ = aFloatArrayArray10417[i][i_0_];
			f_10_ = aFloatArrayArray10407[i][i_0_];
		} else if (i_3_ == aClass161_Sub2_10404.anInt1752 * 1048375491 && i_4_ == 0) {
			f = aFloatArrayArray10419[i + 1][i_0_];
			f_9_ = aFloatArrayArray10417[i + 1][i_0_];
			f_10_ = aFloatArrayArray10407[i + 1][i_0_];
		} else if (i_3_ == aClass161_Sub2_10404.anInt1752 * 1048375491 && i_4_ == aClass161_Sub2_10404.anInt1752 * 1048375491) {
			f = aFloatArrayArray10419[i + 1][i_0_ + 1];
			f_9_ = aFloatArrayArray10417[i + 1][i_0_ + 1];
			f_10_ = aFloatArrayArray10407[i + 1][i_0_ + 1];
		} else if (i_3_ == 0 && i_4_ == aClass161_Sub2_10404.anInt1752 * 1048375491) {
			f = aFloatArrayArray10419[i][i_0_ + 1];
			f_9_ = aFloatArrayArray10417[i][i_0_ + 1];
			f_10_ = aFloatArrayArray10407[i][i_0_ + 1];
		} else {
			float f_11_ = ((float) i_3_ / (float) (aClass161_Sub2_10404.anInt1752 * 1048375491));
			float f_12_ = ((float) i_4_ / (float) (aClass161_Sub2_10404.anInt1752 * 1048375491));
			float f_13_ = aFloatArrayArray10419[i][i_0_];
			float f_14_ = aFloatArrayArray10417[i][i_0_];
			float f_15_ = aFloatArrayArray10407[i][i_0_];
			float f_16_ = aFloatArrayArray10419[i + 1][i_0_];
			float f_17_ = aFloatArrayArray10417[i + 1][i_0_];
			float f_18_ = aFloatArrayArray10407[i + 1][i_0_];
			f_13_ += (aFloatArrayArray10419[i][i_0_ + 1] - f_13_) * f_11_;
			f_14_ += (aFloatArrayArray10417[i][i_0_ + 1] - f_14_) * f_11_;
			f_15_ += (aFloatArrayArray10407[i][i_0_ + 1] - f_15_) * f_11_;
			f_16_ += (aFloatArrayArray10419[i + 1][i_0_ + 1] - f_16_) * f_11_;
			f_17_ += (aFloatArrayArray10417[i + 1][i_0_ + 1] - f_17_) * f_11_;
			f_18_ += (aFloatArrayArray10407[i + 1][i_0_ + 1] - f_18_) * f_11_;
			f = f_13_ + (f_16_ - f_13_) * f_12_;
			f_9_ = f_14_ + (f_17_ - f_14_) * f_12_;
			f_10_ = f_15_ + (f_18_ - f_15_) * f_12_;
		}
		float f_19_ = (float) (aClass527_Sub16_10405.method16129((byte) 9) - i_5_);
		float f_20_ = (float) (aClass527_Sub16_10405.method16130((byte) -39) - i_7_);
		float f_21_ = (float) (aClass527_Sub16_10405.method16131((byte) 60) - i_6_);
		float f_22_ = (float) Math.sqrt((double) (f_19_ * f_19_ + f_20_ * f_20_ + f_21_ * f_21_));
		float f_23_ = 1.0F / f_22_;
		f_19_ *= f_23_;
		f_20_ *= f_23_;
		f_21_ *= f_23_;
		float f_24_ = f_22_ / (float) aClass527_Sub16_10405.method16132(1096281253);
		float f_25_ = 1.0F - f_24_ * f_24_;
		if (f_25_ < 0.0F)
			f_25_ = 0.0F;
		float f_26_ = f_19_ * f + f_20_ * f_9_ + f_21_ * f_10_;
		if (f_26_ < 0.0F)
			f_26_ = 0.0F;
		float f_27_ = f_26_ * f_25_ * 2.0F;
		if (f_27_ > 1.0F)
			f_27_ = 1.0F;
		int i_28_ = aClass527_Sub16_10405.method16133((byte) 0);
		int i_29_ = (int) (f_27_ * (float) (i_28_ >> 16 & 0xff));
		if (i_29_ > 255)
			i_29_ = 255;
		int i_30_ = (int) (f_27_ * (float) (i_28_ >> 8 & 0xff));
		if (i_30_ > 255)
			i_30_ = 255;
		int i_31_ = (int) (f_27_ * (float) (i_28_ & 0xff));
		if (i_31_ > 255)
			i_31_ = 255;
		if (aClass180_Sub3_10403.aBool9788) {
			aClass527_Sub38_Sub1_10409.method18329((float) i_5_);
			aClass527_Sub38_Sub1_10409.method18329((float) i_7_);
			aClass527_Sub38_Sub1_10409.method18329((float) i_6_);
		} else {
			aClass527_Sub38_Sub1_10409.method18331((float) i_5_);
			aClass527_Sub38_Sub1_10409.method18331((float) i_7_);
			aClass527_Sub38_Sub1_10409.method18331((float) i_6_);
		}
		aClass527_Sub38_Sub1_10409.writeByte(i_29_, 1653632224);
		aClass527_Sub38_Sub1_10409.writeByte(i_30_, 205477787);
		aClass527_Sub38_Sub1_10409.writeByte(i_31_, -6278445);
		aClass527_Sub38_Sub1_10409.writeByte(255, 566627247);
		method16065(i_8_);
	}

	void method16067(int i, int i_32_, int i_33_, boolean[][] bools) {
		if (anInterface17_10412 != null && anInt10406 <= i + i_33_ && anInt10420 >= i - i_33_ && anInt10408 <= i_32_ + i_33_ && anInt10421 >= i_32_ - i_33_) {
			for (int i_34_ = anInt10408; i_34_ <= anInt10421; i_34_++) {
				for (int i_35_ = anInt10406; i_35_ <= anInt10420; i_35_++) {
					int i_36_ = i_35_ - i;
					int i_37_ = i_34_ - i_32_;
					if (i_36_ > -i_33_ && i_36_ < i_33_ && i_37_ > -i_33_ && i_37_ < i_33_ && bools[i_36_ + i_33_][i_37_ + i_33_]) {
						aClass180_Sub3_10403.method15344((int) (aClass527_Sub16_10405.method16162(-1103310049) * 255.0F) << 24);
						aClass180_Sub3_10403.method15385(aClass129_10414, null, aClass129_10415, null);
						aClass180_Sub3_10403.method15433(anInterface17_10412, 4, 0, anInt10411);
						return;
					}
				}
			}
		}
	}

	void method16068(short i) {
		if (aClass180_Sub3_10403.aBool9788)
			aClass527_Sub38_10418.writeShort(i, 1404835786);
		else
			aClass527_Sub38_10418.writeShortLE(i, -959493452);
	}

	void method16069(int i, int i_38_, int i_39_, boolean[][] bools) {
		if (anInterface17_10412 != null && anInt10406 <= i + i_39_ && anInt10420 >= i - i_39_ && anInt10408 <= i_38_ + i_39_ && anInt10421 >= i_38_ - i_39_) {
			for (int i_40_ = anInt10408; i_40_ <= anInt10421; i_40_++) {
				for (int i_41_ = anInt10406; i_41_ <= anInt10420; i_41_++) {
					int i_42_ = i_41_ - i;
					int i_43_ = i_40_ - i_38_;
					if (i_42_ > -i_39_ && i_42_ < i_39_ && i_43_ > -i_39_ && i_43_ < i_39_ && bools[i_42_ + i_39_][i_43_ + i_39_]) {
						aClass180_Sub3_10403.method15344((int) (aClass527_Sub16_10405.method16162(-1566490814) * 255.0F) << 24);
						aClass180_Sub3_10403.method15385(aClass129_10414, null, aClass129_10415, null);
						aClass180_Sub3_10403.method15433(anInterface17_10412, 4, 0, anInt10411);
						return;
					}
				}
			}
		}
	}

	void method16070(short i) {
		if (aClass180_Sub3_10403.aBool9788)
			aClass527_Sub38_10418.writeShort(i, 1404835786);
		else
			aClass527_Sub38_10418.writeShortLE(i, -125833582);
	}

	void method16071(int i, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_) {
		long l = -1L;
		int i_49_ = i_47_ + (i_45_ << aClass161_Sub2_10404.anInt1753 * 1252000143);
		int i_50_ = i_48_ + (i_46_ << aClass161_Sub2_10404.anInt1753 * 1252000143);
		int i_51_ = aClass161_Sub2_10404.method2593(i_49_, i_50_, -1151432033);
		if ((i_47_ & 0x7f) == 0 || (i_48_ & 0x7f) == 0) {
			l = ((long) i_50_ & 0xffffL) << 16 | (long) i_49_ & 0xffffL;
			Class527_Sub13 class527_sub13 = (Class527_Sub13) aClass14_10416.method709(l);
			if (class527_sub13 != null) {
				method16065(class527_sub13.aShort10445);
				return;
			}
		}
		short i_52_ = (short) anInt10410++;
		if (l != -1L)
			aClass14_10416.method714(new Class527_Sub13(i_52_), l);
		float f;
		float f_53_;
		float f_54_;
		if (i_47_ == 0 && i_48_ == 0) {
			f = aFloatArrayArray10419[i][i_44_];
			f_53_ = aFloatArrayArray10417[i][i_44_];
			f_54_ = aFloatArrayArray10407[i][i_44_];
		} else if (i_47_ == aClass161_Sub2_10404.anInt1752 * 1048375491 && i_48_ == 0) {
			f = aFloatArrayArray10419[i + 1][i_44_];
			f_53_ = aFloatArrayArray10417[i + 1][i_44_];
			f_54_ = aFloatArrayArray10407[i + 1][i_44_];
		} else if (i_47_ == aClass161_Sub2_10404.anInt1752 * 1048375491 && i_48_ == aClass161_Sub2_10404.anInt1752 * 1048375491) {
			f = aFloatArrayArray10419[i + 1][i_44_ + 1];
			f_53_ = aFloatArrayArray10417[i + 1][i_44_ + 1];
			f_54_ = aFloatArrayArray10407[i + 1][i_44_ + 1];
		} else if (i_47_ == 0 && i_48_ == aClass161_Sub2_10404.anInt1752 * 1048375491) {
			f = aFloatArrayArray10419[i][i_44_ + 1];
			f_53_ = aFloatArrayArray10417[i][i_44_ + 1];
			f_54_ = aFloatArrayArray10407[i][i_44_ + 1];
		} else {
			float f_55_ = ((float) i_47_ / (float) (aClass161_Sub2_10404.anInt1752 * 1048375491));
			float f_56_ = ((float) i_48_ / (float) (aClass161_Sub2_10404.anInt1752 * 1048375491));
			float f_57_ = aFloatArrayArray10419[i][i_44_];
			float f_58_ = aFloatArrayArray10417[i][i_44_];
			float f_59_ = aFloatArrayArray10407[i][i_44_];
			float f_60_ = aFloatArrayArray10419[i + 1][i_44_];
			float f_61_ = aFloatArrayArray10417[i + 1][i_44_];
			float f_62_ = aFloatArrayArray10407[i + 1][i_44_];
			f_57_ += (aFloatArrayArray10419[i][i_44_ + 1] - f_57_) * f_55_;
			f_58_ += (aFloatArrayArray10417[i][i_44_ + 1] - f_58_) * f_55_;
			f_59_ += (aFloatArrayArray10407[i][i_44_ + 1] - f_59_) * f_55_;
			f_60_ += (aFloatArrayArray10419[i + 1][i_44_ + 1] - f_60_) * f_55_;
			f_61_ += (aFloatArrayArray10417[i + 1][i_44_ + 1] - f_61_) * f_55_;
			f_62_ += (aFloatArrayArray10407[i + 1][i_44_ + 1] - f_62_) * f_55_;
			f = f_57_ + (f_60_ - f_57_) * f_56_;
			f_53_ = f_58_ + (f_61_ - f_58_) * f_56_;
			f_54_ = f_59_ + (f_62_ - f_59_) * f_56_;
		}
		float f_63_ = (float) (aClass527_Sub16_10405.method16129((byte) -91) - i_49_);
		float f_64_ = (float) (aClass527_Sub16_10405.method16130((byte) -64) - i_51_);
		float f_65_ = (float) (aClass527_Sub16_10405.method16131((byte) 81) - i_50_);
		float f_66_ = (float) Math.sqrt((double) (f_63_ * f_63_ + f_64_ * f_64_ + f_65_ * f_65_));
		float f_67_ = 1.0F / f_66_;
		f_63_ *= f_67_;
		f_64_ *= f_67_;
		f_65_ *= f_67_;
		float f_68_ = f_66_ / (float) aClass527_Sub16_10405.method16132(-1572821594);
		float f_69_ = 1.0F - f_68_ * f_68_;
		if (f_69_ < 0.0F)
			f_69_ = 0.0F;
		float f_70_ = f_63_ * f + f_64_ * f_53_ + f_65_ * f_54_;
		if (f_70_ < 0.0F)
			f_70_ = 0.0F;
		float f_71_ = f_70_ * f_69_ * 2.0F;
		if (f_71_ > 1.0F)
			f_71_ = 1.0F;
		int i_72_ = aClass527_Sub16_10405.method16133((byte) 0);
		int i_73_ = (int) (f_71_ * (float) (i_72_ >> 16 & 0xff));
		if (i_73_ > 255)
			i_73_ = 255;
		int i_74_ = (int) (f_71_ * (float) (i_72_ >> 8 & 0xff));
		if (i_74_ > 255)
			i_74_ = 255;
		int i_75_ = (int) (f_71_ * (float) (i_72_ & 0xff));
		if (i_75_ > 255)
			i_75_ = 255;
		if (aClass180_Sub3_10403.aBool9788) {
			aClass527_Sub38_Sub1_10409.method18329((float) i_49_);
			aClass527_Sub38_Sub1_10409.method18329((float) i_51_);
			aClass527_Sub38_Sub1_10409.method18329((float) i_50_);
		} else {
			aClass527_Sub38_Sub1_10409.method18331((float) i_49_);
			aClass527_Sub38_Sub1_10409.method18331((float) i_51_);
			aClass527_Sub38_Sub1_10409.method18331((float) i_50_);
		}
		aClass527_Sub38_Sub1_10409.writeByte(i_73_, -1551525303);
		aClass527_Sub38_Sub1_10409.writeByte(i_74_, 1553860297);
		aClass527_Sub38_Sub1_10409.writeByte(i_75_, 1591030374);
		aClass527_Sub38_Sub1_10409.writeByte(255, 2124110414);
		method16065(i_52_);
	}

	void method16072(int i, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_) {
		long l = -1L;
		int i_81_ = i_79_ + (i_77_ << aClass161_Sub2_10404.anInt1753 * 1252000143);
		int i_82_ = i_80_ + (i_78_ << aClass161_Sub2_10404.anInt1753 * 1252000143);
		int i_83_ = aClass161_Sub2_10404.method2593(i_81_, i_82_, -1151432033);
		if ((i_79_ & 0x7f) == 0 || (i_80_ & 0x7f) == 0) {
			l = ((long) i_82_ & 0xffffL) << 16 | (long) i_81_ & 0xffffL;
			Class527_Sub13 class527_sub13 = (Class527_Sub13) aClass14_10416.method709(l);
			if (class527_sub13 != null) {
				method16065(class527_sub13.aShort10445);
				return;
			}
		}
		short i_84_ = (short) anInt10410++;
		if (l != -1L)
			aClass14_10416.method714(new Class527_Sub13(i_84_), l);
		float f;
		float f_85_;
		float f_86_;
		if (i_79_ == 0 && i_80_ == 0) {
			f = aFloatArrayArray10419[i][i_76_];
			f_85_ = aFloatArrayArray10417[i][i_76_];
			f_86_ = aFloatArrayArray10407[i][i_76_];
		} else if (i_79_ == aClass161_Sub2_10404.anInt1752 * 1048375491 && i_80_ == 0) {
			f = aFloatArrayArray10419[i + 1][i_76_];
			f_85_ = aFloatArrayArray10417[i + 1][i_76_];
			f_86_ = aFloatArrayArray10407[i + 1][i_76_];
		} else if (i_79_ == aClass161_Sub2_10404.anInt1752 * 1048375491 && i_80_ == aClass161_Sub2_10404.anInt1752 * 1048375491) {
			f = aFloatArrayArray10419[i + 1][i_76_ + 1];
			f_85_ = aFloatArrayArray10417[i + 1][i_76_ + 1];
			f_86_ = aFloatArrayArray10407[i + 1][i_76_ + 1];
		} else if (i_79_ == 0 && i_80_ == aClass161_Sub2_10404.anInt1752 * 1048375491) {
			f = aFloatArrayArray10419[i][i_76_ + 1];
			f_85_ = aFloatArrayArray10417[i][i_76_ + 1];
			f_86_ = aFloatArrayArray10407[i][i_76_ + 1];
		} else {
			float f_87_ = ((float) i_79_ / (float) (aClass161_Sub2_10404.anInt1752 * 1048375491));
			float f_88_ = ((float) i_80_ / (float) (aClass161_Sub2_10404.anInt1752 * 1048375491));
			float f_89_ = aFloatArrayArray10419[i][i_76_];
			float f_90_ = aFloatArrayArray10417[i][i_76_];
			float f_91_ = aFloatArrayArray10407[i][i_76_];
			float f_92_ = aFloatArrayArray10419[i + 1][i_76_];
			float f_93_ = aFloatArrayArray10417[i + 1][i_76_];
			float f_94_ = aFloatArrayArray10407[i + 1][i_76_];
			f_89_ += (aFloatArrayArray10419[i][i_76_ + 1] - f_89_) * f_87_;
			f_90_ += (aFloatArrayArray10417[i][i_76_ + 1] - f_90_) * f_87_;
			f_91_ += (aFloatArrayArray10407[i][i_76_ + 1] - f_91_) * f_87_;
			f_92_ += (aFloatArrayArray10419[i + 1][i_76_ + 1] - f_92_) * f_87_;
			f_93_ += (aFloatArrayArray10417[i + 1][i_76_ + 1] - f_93_) * f_87_;
			f_94_ += (aFloatArrayArray10407[i + 1][i_76_ + 1] - f_94_) * f_87_;
			f = f_89_ + (f_92_ - f_89_) * f_88_;
			f_85_ = f_90_ + (f_93_ - f_90_) * f_88_;
			f_86_ = f_91_ + (f_94_ - f_91_) * f_88_;
		}
		float f_95_ = (float) (aClass527_Sub16_10405.method16129((byte) -75) - i_81_);
		float f_96_ = (float) (aClass527_Sub16_10405.method16130((byte) 75) - i_83_);
		float f_97_ = (float) (aClass527_Sub16_10405.method16131((byte) -71) - i_82_);
		float f_98_ = (float) Math.sqrt((double) (f_95_ * f_95_ + f_96_ * f_96_ + f_97_ * f_97_));
		float f_99_ = 1.0F / f_98_;
		f_95_ *= f_99_;
		f_96_ *= f_99_;
		f_97_ *= f_99_;
		float f_100_ = f_98_ / (float) aClass527_Sub16_10405.method16132(-446985481);
		float f_101_ = 1.0F - f_100_ * f_100_;
		if (f_101_ < 0.0F)
			f_101_ = 0.0F;
		float f_102_ = f_95_ * f + f_96_ * f_85_ + f_97_ * f_86_;
		if (f_102_ < 0.0F)
			f_102_ = 0.0F;
		float f_103_ = f_102_ * f_101_ * 2.0F;
		if (f_103_ > 1.0F)
			f_103_ = 1.0F;
		int i_104_ = aClass527_Sub16_10405.method16133((byte) 0);
		int i_105_ = (int) (f_103_ * (float) (i_104_ >> 16 & 0xff));
		if (i_105_ > 255)
			i_105_ = 255;
		int i_106_ = (int) (f_103_ * (float) (i_104_ >> 8 & 0xff));
		if (i_106_ > 255)
			i_106_ = 255;
		int i_107_ = (int) (f_103_ * (float) (i_104_ & 0xff));
		if (i_107_ > 255)
			i_107_ = 255;
		if (aClass180_Sub3_10403.aBool9788) {
			aClass527_Sub38_Sub1_10409.method18329((float) i_81_);
			aClass527_Sub38_Sub1_10409.method18329((float) i_83_);
			aClass527_Sub38_Sub1_10409.method18329((float) i_82_);
		} else {
			aClass527_Sub38_Sub1_10409.method18331((float) i_81_);
			aClass527_Sub38_Sub1_10409.method18331((float) i_83_);
			aClass527_Sub38_Sub1_10409.method18331((float) i_82_);
		}
		aClass527_Sub38_Sub1_10409.writeByte(i_105_, 624306090);
		aClass527_Sub38_Sub1_10409.writeByte(i_106_, -1925561140);
		aClass527_Sub38_Sub1_10409.writeByte(i_107_, 770546881);
		aClass527_Sub38_Sub1_10409.writeByte(255, 1782497092);
		method16065(i_84_);
	}

	Class527_Sub9(Class180_Sub3 class180_sub3, Class161_Sub2 class161_sub2, Class527_Sub16 class527_sub16, int[] is) {
		aClass180_Sub3_10403 = class180_sub3;
		aClass527_Sub16_10405 = class527_sub16;
		aClass161_Sub2_10404 = class161_sub2;
		int i = (aClass527_Sub16_10405.method16132(125578078) - (class161_sub2.anInt1752 * 1048375491 >> 1));
		anInt10406 = (aClass527_Sub16_10405.method16129((byte) -7) - i >> class161_sub2.anInt1753 * 1252000143);
		anInt10420 = (aClass527_Sub16_10405.method16129((byte) -80) + i >> class161_sub2.anInt1753 * 1252000143);
		anInt10408 = (aClass527_Sub16_10405.method16131((byte) -8) - i >> class161_sub2.anInt1753 * 1252000143);
		anInt10421 = (aClass527_Sub16_10405.method16131((byte) -23) + i >> class161_sub2.anInt1753 * 1252000143);
		int i_108_ = anInt10420 - anInt10406 + 1;
		int i_109_ = anInt10421 - anInt10408 + 1;
		aFloatArrayArray10419 = new float[i_108_ + 1][i_109_ + 1];
		aFloatArrayArray10417 = new float[i_108_ + 1][i_109_ + 1];
		aFloatArrayArray10407 = new float[i_108_ + 1][i_109_ + 1];
		for (int i_110_ = 0; i_110_ <= i_109_; i_110_++) {
			int i_111_ = i_110_ + anInt10408;
			if (i_111_ > 0 && i_111_ < aClass161_Sub2_10404.anInt1751 * -533476177 - 1) {
				for (int i_112_ = 0; i_112_ <= i_108_; i_112_++) {
					int i_113_ = i_112_ + anInt10406;
					if (i_113_ > 0 && i_113_ < (aClass161_Sub2_10404.anInt1750 * 1210322533) - 1) {
						int i_114_ = (class161_sub2.method2595(i_113_ + 1, i_111_, (byte) 110) - class161_sub2.method2595(i_113_ - 1, i_111_, (byte) 79));
						int i_115_ = (class161_sub2.method2595(i_113_, i_111_ + 1, (byte) 113) - class161_sub2.method2595(i_113_, i_111_ - 1, (byte) 123));
						float f = (float) (1.0 / Math.sqrt((double) (i_114_ * i_114_ + 65536 + (i_115_ * i_115_))));
						aFloatArrayArray10419[i_112_][i_110_] = (float) i_114_ * f;
						aFloatArrayArray10417[i_112_][i_110_] = -256.0F * f;
						aFloatArrayArray10407[i_112_][i_110_] = (float) i_115_ * f;
					}
				}
			}
		}
		int i_116_ = 0;
		for (int i_117_ = anInt10408; i_117_ <= anInt10421; i_117_++) {
			if (i_117_ >= 0 && i_117_ < class161_sub2.anInt1751 * -533476177) {
				for (int i_118_ = anInt10406; i_118_ <= anInt10420; i_118_++) {
					if (i_118_ >= 0 && i_118_ < class161_sub2.anInt1750 * 1210322533) {
						int i_119_ = is[i_116_];
						int[] is_120_ = (class161_sub2.anIntArrayArrayArray9271[i_118_][i_117_]);
						if (is_120_ != null && i_119_ != 0) {
							if (i_119_ == 1) {
								for (int i_121_ = 0; i_121_ < is_120_.length; i_121_ += 3) {
									if (is_120_[i_121_] != -1 && is_120_[i_121_ + 1] != -1 && is_120_[i_121_ + 2] != -1)
										anInt10411 += 3;
								}
							} else
								anInt10411 += 3;
						}
					}
					i_116_++;
				}
			} else
				i_116_ += anInt10420 - anInt10406;
		}
		if (anInt10411 > 0) {
			aClass527_Sub38_10418 = new RSByteBuffer(anInt10411 * 2);
			aClass527_Sub38_Sub1_10409 = new Class527_Sub38_Sub1(anInt10411 * 16);
			aClass14_10416 = new Class14(Class186.method3652(anInt10411, 694317751));
			int i_122_ = 0;
			i_116_ = 0;
			for (int i_123_ = anInt10408; i_123_ <= anInt10421; i_123_++) {
				if (i_123_ >= 0 && i_123_ < class161_sub2.anInt1751 * -533476177) {
					int i_124_ = 0;
					for (int i_125_ = anInt10406; i_125_ <= anInt10420; i_125_++) {
						if (i_125_ >= 0 && i_125_ < class161_sub2.anInt1750 * 1210322533) {
							int i_126_ = is[i_116_];
							int[] is_127_ = (class161_sub2.anIntArrayArrayArray9271[i_125_][i_123_]);
							if (is_127_ != null && i_126_ != 0) {
								if (i_126_ == 1) {
									int[] is_128_ = (class161_sub2.anIntArrayArrayArray9293[i_125_][i_123_]);
									int[] is_129_ = (class161_sub2.anIntArrayArrayArray9265[i_125_][i_123_]);
									int i_130_ = 0;
									while (i_130_ < is_127_.length) {
										if (is_127_[i_130_] != -1 && is_127_[i_130_ + 1] != -1 && is_127_[i_130_ + 2] != -1) {
											method16066(i_124_, i_122_, i_125_, i_123_, is_128_[i_130_], is_129_[i_130_]);
											i_130_++;
											method16066(i_124_, i_122_, i_125_, i_123_, is_128_[i_130_], is_129_[i_130_]);
											i_130_++;
											method16066(i_124_, i_122_, i_125_, i_123_, is_128_[i_130_], is_129_[i_130_]);
											i_130_++;
										} else
											i_130_ += 3;
									}
								} else if (i_126_ == 3) {
									method16066(i_124_, i_122_, i_125_, i_123_, 0, 0);
									method16066(i_124_, i_122_, i_125_, i_123_, (class161_sub2.anInt1752 * 1048375491), 0);
									method16066(i_124_, i_122_, i_125_, i_123_, 0, (class161_sub2.anInt1752 * 1048375491));
								} else if (i_126_ == 2) {
									method16066(i_124_, i_122_, i_125_, i_123_, (class161_sub2.anInt1752 * 1048375491), 0);
									method16066(i_124_, i_122_, i_125_, i_123_, (class161_sub2.anInt1752 * 1048375491), (class161_sub2.anInt1752 * 1048375491));
									method16066(i_124_, i_122_, i_125_, i_123_, 0, 0);
								} else if (i_126_ == 5) {
									method16066(i_124_, i_122_, i_125_, i_123_, (class161_sub2.anInt1752 * 1048375491), (class161_sub2.anInt1752 * 1048375491));
									method16066(i_124_, i_122_, i_125_, i_123_, 0, (class161_sub2.anInt1752 * 1048375491));
									method16066(i_124_, i_122_, i_125_, i_123_, (class161_sub2.anInt1752 * 1048375491), 0);
								} else if (i_126_ == 4) {
									method16066(i_124_, i_122_, i_125_, i_123_, 0, (class161_sub2.anInt1752 * 1048375491));
									method16066(i_124_, i_122_, i_125_, i_123_, 0, 0);
									method16066(i_124_, i_122_, i_125_, i_123_, (class161_sub2.anInt1752 * 1048375491), (class161_sub2.anInt1752 * 1048375491));
								}
							}
						}
						i_116_++;
						i_124_++;
					}
				} else
					i_116_ += anInt10420 - anInt10406;
				i_122_++;
			}
			anInterface17_10412 = (aClass180_Sub3_10403.method15434(5123, aClass527_Sub38_10418.buffer, aClass527_Sub38_10418.anInt10689 * -441238943, false));
			anInterface15_10413 = aClass180_Sub3_10403.method15389(16, (aClass527_Sub38_Sub1_10409.buffer), (aClass527_Sub38_Sub1_10409.anInt10689) * -441238943, false);
			aClass129_10414 = new Class129(anInterface15_10413, 5126, 3, 0);
			aClass129_10415 = new Class129(anInterface15_10413, 5121, 4, 12);
		} else {
			anInterface17_10412 = null;
			anInterface15_10413 = null;
			aClass129_10414 = null;
			aClass129_10415 = null;
		}
		aClass527_Sub38_Sub1_10409 = null;
		aClass527_Sub38_10418 = null;
		aClass14_10416 = null;
		aFloatArrayArray10407 = null;
		aFloatArrayArray10417 = null;
		aFloatArrayArray10419 = null;
	}

	void method16073(int i, int i_131_, int i_132_, boolean[][] bools) {
		if (anInterface17_10412 != null && anInt10406 <= i + i_132_ && anInt10420 >= i - i_132_ && anInt10408 <= i_131_ + i_132_ && anInt10421 >= i_131_ - i_132_) {
			for (int i_133_ = anInt10408; i_133_ <= anInt10421; i_133_++) {
				for (int i_134_ = anInt10406; i_134_ <= anInt10420; i_134_++) {
					int i_135_ = i_134_ - i;
					int i_136_ = i_133_ - i_131_;
					if (i_135_ > -i_132_ && i_135_ < i_132_ && i_136_ > -i_132_ && i_136_ < i_132_ && bools[i_135_ + i_132_][i_136_ + i_132_]) {
						aClass180_Sub3_10403.method15344((int) (aClass527_Sub16_10405.method16162(-1751935823) * 255.0F) << 24);
						aClass180_Sub3_10403.method15385(aClass129_10414, null, aClass129_10415, null);
						aClass180_Sub3_10403.method15433(anInterface17_10412, 4, 0, anInt10411);
						return;
					}
				}
			}
		}
	}
}
