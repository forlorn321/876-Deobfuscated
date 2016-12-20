/* Class527_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class527_Sub23 extends Class527 {
	Class527_Sub16 aClass527_Sub16_10495;
	Class161_Sub3 aClass161_Sub3_10496;
	int anInt10497;
	Class180_Sub2 aClass180_Sub2_10498;
	int anInt10499;
	int anInt10500;
	int anInt10501;
	int anInt10502 = 0;
	int anInt10503;
	Interface37 anInterface37_10504;
	int anInt10505;
	Class14 aClass14_10506;
	float[][] aFloatArrayArray10507;
	float[][] aFloatArrayArray10508;
	float[][] aFloatArrayArray10509;
	Interface44 anInterface44_10510;
	ByteBuffer aByteBuffer10511;

	void method16226(Class326 class326, Interface44 interface44, int i) {
		class326.anInt3598 = 0;
		class326.anInt3597 = anInt10502;
		class326.anInt3584 = 0;
		class326.anInt3599 = anInt10499 / 3;
		class326.anInterface38_3595 = aClass180_Sub2_10498.anInterface38_9533;
		float f = aClass527_Sub16_10495.method16162(-1162809405);
		class326.aClass442_3594.method7138(f, f, f);
		aClass180_Sub2_10498.method14988(0, anInterface37_10504);
		aClass180_Sub2_10498.method15149(aClass180_Sub2_10498.aClass355_9433);
		aClass180_Sub2_10498.method15001(anInterface44_10510);
		class326.method5758(0);
	}

	void method16227() {
		anInterface44_10510 = aClass180_Sub2_10498.method15025(false);
		anInterface44_10510.method323(anInt10499);
		anInterface37_10504 = aClass180_Sub2_10498.method15035(false);
		anInterface37_10504.method219(anInt10502 * 16, 16);
		anInterface37_10504.method213(0, anInt10502 * 16, aClass180_Sub2_10498.aLong9439);
		anInterface44_10510.method213(0, anInt10499 * 2, (aClass180_Sub2_10498.aLong9439 + (long) (aClass180_Sub2_10498.anInt9441 >> 1)));
	}

	void method16228(Class326 class326, Interface44 interface44, int i) {
		class326.anInt3598 = 0;
		class326.anInt3597 = anInt10502;
		class326.anInt3584 = 0;
		class326.anInt3599 = anInt10499 / 3;
		class326.anInterface38_3595 = aClass180_Sub2_10498.anInterface38_9533;
		float f = aClass527_Sub16_10495.method16162(-1586129509);
		class326.aClass442_3594.method7138(f, f, f);
		aClass180_Sub2_10498.method14988(0, anInterface37_10504);
		aClass180_Sub2_10498.method15149(aClass180_Sub2_10498.aClass355_9433);
		aClass180_Sub2_10498.method15001(anInterface44_10510);
		class326.method5758(0);
	}

	void method16229(Class326 class326, Interface44 interface44, int i) {
		class326.anInt3598 = 0;
		class326.anInt3597 = anInt10502;
		class326.anInt3584 = 0;
		class326.anInt3599 = anInt10499 / 3;
		class326.anInterface38_3595 = aClass180_Sub2_10498.anInterface38_9533;
		float f = aClass527_Sub16_10495.method16162(-1134804343);
		class326.aClass442_3594.method7138(f, f, f);
		aClass180_Sub2_10498.method14988(0, anInterface37_10504);
		aClass180_Sub2_10498.method15149(aClass180_Sub2_10498.aClass355_9433);
		aClass180_Sub2_10498.method15001(anInterface44_10510);
		class326.method5758(0);
	}

	void method16230(Class326 class326, Interface44 interface44, int i) {
		class326.anInt3598 = 0;
		class326.anInt3597 = anInt10502;
		class326.anInt3584 = 0;
		class326.anInt3599 = anInt10499 / 3;
		class326.anInterface38_3595 = aClass180_Sub2_10498.anInterface38_9533;
		float f = aClass527_Sub16_10495.method16162(-1189616047);
		class326.aClass442_3594.method7138(f, f, f);
		aClass180_Sub2_10498.method14988(0, anInterface37_10504);
		aClass180_Sub2_10498.method15149(aClass180_Sub2_10498.aClass355_9433);
		aClass180_Sub2_10498.method15001(anInterface44_10510);
		class326.method5758(0);
	}

	void method16231() {
		anInterface44_10510 = aClass180_Sub2_10498.method15025(false);
		anInterface44_10510.method323(anInt10499);
		anInterface37_10504 = aClass180_Sub2_10498.method15035(false);
		anInterface37_10504.method219(anInt10502 * 16, 16);
		anInterface37_10504.method213(0, anInt10502 * 16, aClass180_Sub2_10498.aLong9439);
		anInterface44_10510.method213(0, anInt10499 * 2, (aClass180_Sub2_10498.aLong9439 + (long) (aClass180_Sub2_10498.anInt9441 >> 1)));
	}

	void method16232(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		long l = -1L;
		int i_5_ = i_3_ + (i_1_ << aClass161_Sub3_10496.anInt1753 * 1252000143);
		int i_6_ = i_4_ + (i_2_ << aClass161_Sub3_10496.anInt1753 * 1252000143);
		int i_7_ = aClass161_Sub3_10496.method2593(i_5_, i_6_, -1151432033);
		if ((i_3_ & 0x7f) == 0 || (i_4_ & 0x7f) == 0) {
			l = ((long) i_6_ & 0xffffL) << 16 | (long) i_5_ & 0xffffL;
			Class527 class527 = aClass14_10506.method709(l);
			if (class527 != null) {
				Unsafe unsafe = aClass180_Sub2_10498.anUnsafe9437;
				unsafe.putShort((aClass180_Sub2_10498.aLong9439 + (long) (aClass180_Sub2_10498.anInt9441 >> 1) + (long) (anInt10499 * 2)), ((Class527_Sub13) class527).aShort10445);
				anInt10499++;
				return;
			}
		}
		short i_8_ = (short) anInt10502;
		if (l != -1L)
			aClass14_10506.method714(new Class527_Sub13(i_8_), l);
		float f;
		float f_9_;
		float f_10_;
		if (i_3_ == 0 && i_4_ == 0) {
			f = aFloatArrayArray10507[i][i_0_];
			f_9_ = aFloatArrayArray10508[i][i_0_];
			f_10_ = aFloatArrayArray10509[i][i_0_];
		} else if (i_3_ == aClass161_Sub3_10496.anInt1752 * 1048375491 && i_4_ == 0) {
			f = aFloatArrayArray10507[i + 1][i_0_];
			f_9_ = aFloatArrayArray10508[i + 1][i_0_];
			f_10_ = aFloatArrayArray10509[i + 1][i_0_];
		} else if (i_3_ == aClass161_Sub3_10496.anInt1752 * 1048375491 && i_4_ == aClass161_Sub3_10496.anInt1752 * 1048375491) {
			f = aFloatArrayArray10507[i + 1][i_0_ + 1];
			f_9_ = aFloatArrayArray10508[i + 1][i_0_ + 1];
			f_10_ = aFloatArrayArray10509[i + 1][i_0_ + 1];
		} else if (i_3_ == 0 && i_4_ == aClass161_Sub3_10496.anInt1752 * 1048375491) {
			f = aFloatArrayArray10507[i][i_0_ + 1];
			f_9_ = aFloatArrayArray10508[i][i_0_ + 1];
			f_10_ = aFloatArrayArray10509[i][i_0_ + 1];
		} else {
			float f_11_ = ((float) i_3_ / (float) (aClass161_Sub3_10496.anInt1752 * 1048375491));
			float f_12_ = ((float) i_4_ / (float) (aClass161_Sub3_10496.anInt1752 * 1048375491));
			float f_13_ = aFloatArrayArray10507[i][i_0_];
			float f_14_ = aFloatArrayArray10508[i][i_0_];
			float f_15_ = aFloatArrayArray10509[i][i_0_];
			float f_16_ = aFloatArrayArray10507[i + 1][i_0_];
			float f_17_ = aFloatArrayArray10508[i + 1][i_0_];
			float f_18_ = aFloatArrayArray10509[i + 1][i_0_];
			f_13_ += (aFloatArrayArray10507[i][i_0_ + 1] - f_13_) * f_11_;
			f_14_ += (aFloatArrayArray10508[i][i_0_ + 1] - f_14_) * f_11_;
			f_15_ += (aFloatArrayArray10509[i][i_0_ + 1] - f_15_) * f_11_;
			f_16_ += (aFloatArrayArray10507[i + 1][i_0_ + 1] - f_16_) * f_11_;
			f_17_ += (aFloatArrayArray10508[i + 1][i_0_ + 1] - f_17_) * f_11_;
			f_18_ += (aFloatArrayArray10509[i + 1][i_0_ + 1] - f_18_) * f_11_;
			f = f_13_ + (f_16_ - f_13_) * f_12_;
			f_9_ = f_14_ + (f_17_ - f_14_) * f_12_;
			f_10_ = f_15_ + (f_18_ - f_15_) * f_12_;
		}
		float f_19_ = (float) (aClass527_Sub16_10495.method16129((byte) -92) - i_5_);
		float f_20_ = (float) (aClass527_Sub16_10495.method16130((byte) -107) - i_7_);
		float f_21_ = (float) (aClass527_Sub16_10495.method16131((byte) -85) - i_6_);
		float f_22_ = (float) Math.sqrt((double) (f_19_ * f_19_ + f_20_ * f_20_ + f_21_ * f_21_));
		float f_23_ = 1.0F / f_22_;
		f_19_ *= f_23_;
		f_20_ *= f_23_;
		f_21_ *= f_23_;
		float f_24_ = f_22_ / (float) aClass527_Sub16_10495.method16132(-29765927);
		float f_25_ = 1.0F - f_24_ * f_24_;
		if (f_25_ < 0.0F)
			f_25_ = 0.0F;
		float f_26_ = f_19_ * f + f_20_ * f_9_ + f_21_ * f_10_;
		if (f_26_ < 0.0F)
			f_26_ = 0.0F;
		float f_27_ = f_26_ * f_25_ * 2.0F;
		if (f_27_ > 1.0F)
			f_27_ = 1.0F;
		int i_28_ = aClass527_Sub16_10495.method16133((byte) 0);
		int i_29_ = (int) (f_27_ * (float) (i_28_ >> 16 & 0xff));
		if (i_29_ > 255)
			i_29_ = 255;
		int i_30_ = (int) (f_27_ * (float) (i_28_ >> 8 & 0xff));
		if (i_30_ > 255)
			i_30_ = 255;
		int i_31_ = (int) (f_27_ * (float) (i_28_ & 0xff));
		if (i_31_ > 255)
			i_31_ = 255;
		Unsafe unsafe = aClass180_Sub2_10498.anUnsafe9437;
		unsafe.putFloat(aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16), (float) i_5_);
		unsafe.putFloat((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 4L), (float) i_7_);
		unsafe.putFloat((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 8L), (float) i_6_);
		if (aClass180_Sub2_10498.anInt9578 == 0) {
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 12L), (byte) i_31_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 13L), (byte) i_30_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 14L), (byte) i_29_);
		} else {
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 12L), (byte) i_29_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 13L), (byte) i_30_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 14L), (byte) i_31_);
		}
		unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 15L), (byte) -1);
		anInt10502++;
		unsafe.putShort((aClass180_Sub2_10498.aLong9439 + (long) (aClass180_Sub2_10498.anInt9441 >> 1) + (long) (anInt10499 * 2)), i_8_);
		anInt10499++;
	}

	Class527_Sub23(Class180_Sub2 class180_sub2, Class161_Sub3 class161_sub3, Class527_Sub16 class527_sub16, int[] is) {
		anInt10497 = 0;
		anInt10499 = 0;
		aClass180_Sub2_10498 = class180_sub2;
		aClass527_Sub16_10495 = class527_sub16;
		aClass161_Sub3_10496 = class161_sub3;
		int i = (aClass527_Sub16_10495.method16132(-2113020837) - (class161_sub3.anInt1752 * 1048375491 >> 1));
		anInt10503 = (aClass527_Sub16_10495.method16129((byte) -54) - i >> class161_sub3.anInt1753 * 1252000143);
		anInt10505 = (aClass527_Sub16_10495.method16129((byte) 21) + i >> class161_sub3.anInt1753 * 1252000143);
		anInt10500 = (aClass527_Sub16_10495.method16131((byte) 3) - i >> class161_sub3.anInt1753 * 1252000143);
		anInt10501 = (aClass527_Sub16_10495.method16131((byte) -63) + i >> class161_sub3.anInt1753 * 1252000143);
		int i_32_ = anInt10505 - anInt10503 + 1;
		int i_33_ = anInt10501 - anInt10500 + 1;
		aFloatArrayArray10507 = new float[i_32_ + 1][i_33_ + 1];
		aFloatArrayArray10508 = new float[i_32_ + 1][i_33_ + 1];
		aFloatArrayArray10509 = new float[i_32_ + 1][i_33_ + 1];
		for (int i_34_ = 0; i_34_ <= i_33_; i_34_++) {
			int i_35_ = i_34_ + anInt10500;
			if (i_35_ > 0 && i_35_ < aClass161_Sub3_10496.anInt1751 * -533476177 - 1) {
				for (int i_36_ = 0; i_36_ <= i_32_; i_36_++) {
					int i_37_ = i_36_ + anInt10503;
					if (i_37_ > 0 && i_37_ < (aClass161_Sub3_10496.anInt1750 * 1210322533 - 1)) {
						int i_38_ = (class161_sub3.method2595(i_37_ + 1, i_35_, (byte) 36) - class161_sub3.method2595(i_37_ - 1, i_35_, (byte) 63));
						int i_39_ = (class161_sub3.method2595(i_37_, i_35_ + 1, (byte) 5) - class161_sub3.method2595(i_37_, i_35_ - 1, (byte) 117));
						float f = (float) (1.0 / Math.sqrt((double) (i_38_ * i_38_ + 65536 + (i_39_ * i_39_))));
						aFloatArrayArray10507[i_36_][i_34_] = (float) i_38_ * f;
						aFloatArrayArray10508[i_36_][i_34_] = -256.0F * f;
						aFloatArrayArray10509[i_36_][i_34_] = (float) i_39_ * f;
					}
				}
			}
		}
		int i_40_ = 0;
		for (int i_41_ = anInt10500; i_41_ <= anInt10501; i_41_++) {
			if (i_41_ >= 0 && i_41_ < class161_sub3.anInt1751 * -533476177) {
				for (int i_42_ = anInt10503; i_42_ <= anInt10505; i_42_++) {
					if (i_42_ >= 0 && i_42_ < class161_sub3.anInt1750 * 1210322533) {
						int i_43_ = is[i_40_];
						int[] is_44_ = (class161_sub3.anIntArrayArrayArray9618[i_42_][i_41_]);
						if (is_44_ != null && i_43_ != 0) {
							if (i_43_ == 1) {
								for (int i_45_ = 0; i_45_ < is_44_.length; i_45_ += 3) {
									if (is_44_[i_45_] != -1 && is_44_[i_45_ + 1] != -1 && is_44_[i_45_ + 2] != -1)
										anInt10497 += 3;
								}
							} else
								anInt10497 += 3;
						}
					}
					i_40_++;
				}
			} else
				i_40_ += anInt10505 - anInt10503;
		}
		if (anInt10497 > 0) {
			aClass14_10506 = new Class14(Class186.method3652(anInt10497, -1367206682));
			aByteBuffer10511 = aClass180_Sub2_10498.aByteBuffer9438;
			aByteBuffer10511.clear();
			aByteBuffer10511.position(aClass180_Sub2_10498.anInt9441 >> 1);
			aByteBuffer10511.slice();
			aByteBuffer10511.position(0);
			aByteBuffer10511.limit(aClass180_Sub2_10498.anInt9441 >> 1);
			int i_46_ = 0;
			i_40_ = 0;
			for (int i_47_ = anInt10500; i_47_ <= anInt10501; i_47_++) {
				if (i_47_ >= 0 && i_47_ < class161_sub3.anInt1751 * -533476177) {
					int i_48_ = 0;
					for (int i_49_ = anInt10503; i_49_ <= anInt10505; i_49_++) {
						if (i_49_ >= 0 && i_49_ < class161_sub3.anInt1750 * 1210322533) {
							int i_50_ = is[i_40_];
							int[] is_51_ = (class161_sub3.anIntArrayArrayArray9618[i_49_][i_47_]);
							if (is_51_ != null && i_50_ != 0) {
								if (i_50_ == 1) {
									int[] is_52_ = (class161_sub3.anIntArrayArrayArray9612[i_49_][i_47_]);
									int[] is_53_ = (class161_sub3.anIntArrayArrayArray9614[i_49_][i_47_]);
									int i_54_ = 0;
									while (i_54_ < is_51_.length) {
										if (is_51_[i_54_] != -1 && is_51_[i_54_ + 1] != -1 && is_51_[i_54_ + 2] != -1) {
											method16240(i_48_, i_46_, i_49_, i_47_, is_52_[i_54_], is_53_[i_54_]);
											i_54_++;
											method16240(i_48_, i_46_, i_49_, i_47_, is_52_[i_54_], is_53_[i_54_]);
											i_54_++;
											method16240(i_48_, i_46_, i_49_, i_47_, is_52_[i_54_], is_53_[i_54_]);
											i_54_++;
										} else
											i_54_ += 3;
									}
								} else if (i_50_ == 3) {
									method16240(i_48_, i_46_, i_49_, i_47_, 0, 0);
									method16240(i_48_, i_46_, i_49_, i_47_, (class161_sub3.anInt1752 * 1048375491), 0);
									method16240(i_48_, i_46_, i_49_, i_47_, 0, (class161_sub3.anInt1752 * 1048375491));
								} else if (i_50_ == 2) {
									method16240(i_48_, i_46_, i_49_, i_47_, (class161_sub3.anInt1752 * 1048375491), 0);
									method16240(i_48_, i_46_, i_49_, i_47_, (class161_sub3.anInt1752 * 1048375491), (class161_sub3.anInt1752 * 1048375491));
									method16240(i_48_, i_46_, i_49_, i_47_, 0, 0);
								} else if (i_50_ == 5) {
									method16240(i_48_, i_46_, i_49_, i_47_, (class161_sub3.anInt1752 * 1048375491), (class161_sub3.anInt1752 * 1048375491));
									method16240(i_48_, i_46_, i_49_, i_47_, 0, (class161_sub3.anInt1752 * 1048375491));
									method16240(i_48_, i_46_, i_49_, i_47_, (class161_sub3.anInt1752 * 1048375491), 0);
								} else if (i_50_ == 4) {
									method16240(i_48_, i_46_, i_49_, i_47_, 0, (class161_sub3.anInt1752 * 1048375491));
									method16240(i_48_, i_46_, i_49_, i_47_, 0, 0);
									method16240(i_48_, i_46_, i_49_, i_47_, (class161_sub3.anInt1752 * 1048375491), (class161_sub3.anInt1752 * 1048375491));
								}
							}
						}
						i_40_++;
						i_48_++;
					}
				} else
					i_40_ += anInt10505 - anInt10503;
				i_46_++;
			}
			method16227();
		} else {
			anInterface37_10504 = null;
			anInterface44_10510 = null;
		}
		aClass14_10506 = null;
		aFloatArrayArray10509 = null;
		aFloatArrayArray10508 = null;
		aFloatArrayArray10507 = null;
	}

	void method16233(int i, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_) {
		long l = -1L;
		int i_60_ = i_58_ + (i_56_ << aClass161_Sub3_10496.anInt1753 * 1252000143);
		int i_61_ = i_59_ + (i_57_ << aClass161_Sub3_10496.anInt1753 * 1252000143);
		int i_62_ = aClass161_Sub3_10496.method2593(i_60_, i_61_, -1151432033);
		if ((i_58_ & 0x7f) == 0 || (i_59_ & 0x7f) == 0) {
			l = ((long) i_61_ & 0xffffL) << 16 | (long) i_60_ & 0xffffL;
			Class527 class527 = aClass14_10506.method709(l);
			if (class527 != null) {
				Unsafe unsafe = aClass180_Sub2_10498.anUnsafe9437;
				unsafe.putShort((aClass180_Sub2_10498.aLong9439 + (long) (aClass180_Sub2_10498.anInt9441 >> 1) + (long) (anInt10499 * 2)), ((Class527_Sub13) class527).aShort10445);
				anInt10499++;
				return;
			}
		}
		short i_63_ = (short) anInt10502;
		if (l != -1L)
			aClass14_10506.method714(new Class527_Sub13(i_63_), l);
		float f;
		float f_64_;
		float f_65_;
		if (i_58_ == 0 && i_59_ == 0) {
			f = aFloatArrayArray10507[i][i_55_];
			f_64_ = aFloatArrayArray10508[i][i_55_];
			f_65_ = aFloatArrayArray10509[i][i_55_];
		} else if (i_58_ == aClass161_Sub3_10496.anInt1752 * 1048375491 && i_59_ == 0) {
			f = aFloatArrayArray10507[i + 1][i_55_];
			f_64_ = aFloatArrayArray10508[i + 1][i_55_];
			f_65_ = aFloatArrayArray10509[i + 1][i_55_];
		} else if (i_58_ == aClass161_Sub3_10496.anInt1752 * 1048375491 && i_59_ == aClass161_Sub3_10496.anInt1752 * 1048375491) {
			f = aFloatArrayArray10507[i + 1][i_55_ + 1];
			f_64_ = aFloatArrayArray10508[i + 1][i_55_ + 1];
			f_65_ = aFloatArrayArray10509[i + 1][i_55_ + 1];
		} else if (i_58_ == 0 && i_59_ == aClass161_Sub3_10496.anInt1752 * 1048375491) {
			f = aFloatArrayArray10507[i][i_55_ + 1];
			f_64_ = aFloatArrayArray10508[i][i_55_ + 1];
			f_65_ = aFloatArrayArray10509[i][i_55_ + 1];
		} else {
			float f_66_ = ((float) i_58_ / (float) (aClass161_Sub3_10496.anInt1752 * 1048375491));
			float f_67_ = ((float) i_59_ / (float) (aClass161_Sub3_10496.anInt1752 * 1048375491));
			float f_68_ = aFloatArrayArray10507[i][i_55_];
			float f_69_ = aFloatArrayArray10508[i][i_55_];
			float f_70_ = aFloatArrayArray10509[i][i_55_];
			float f_71_ = aFloatArrayArray10507[i + 1][i_55_];
			float f_72_ = aFloatArrayArray10508[i + 1][i_55_];
			float f_73_ = aFloatArrayArray10509[i + 1][i_55_];
			f_68_ += (aFloatArrayArray10507[i][i_55_ + 1] - f_68_) * f_66_;
			f_69_ += (aFloatArrayArray10508[i][i_55_ + 1] - f_69_) * f_66_;
			f_70_ += (aFloatArrayArray10509[i][i_55_ + 1] - f_70_) * f_66_;
			f_71_ += (aFloatArrayArray10507[i + 1][i_55_ + 1] - f_71_) * f_66_;
			f_72_ += (aFloatArrayArray10508[i + 1][i_55_ + 1] - f_72_) * f_66_;
			f_73_ += (aFloatArrayArray10509[i + 1][i_55_ + 1] - f_73_) * f_66_;
			f = f_68_ + (f_71_ - f_68_) * f_67_;
			f_64_ = f_69_ + (f_72_ - f_69_) * f_67_;
			f_65_ = f_70_ + (f_73_ - f_70_) * f_67_;
		}
		float f_74_ = (float) (aClass527_Sub16_10495.method16129((byte) 62) - i_60_);
		float f_75_ = (float) (aClass527_Sub16_10495.method16130((byte) 25) - i_62_);
		float f_76_ = (float) (aClass527_Sub16_10495.method16131((byte) -28) - i_61_);
		float f_77_ = (float) Math.sqrt((double) (f_74_ * f_74_ + f_75_ * f_75_ + f_76_ * f_76_));
		float f_78_ = 1.0F / f_77_;
		f_74_ *= f_78_;
		f_75_ *= f_78_;
		f_76_ *= f_78_;
		float f_79_ = f_77_ / (float) aClass527_Sub16_10495.method16132(-474386752);
		float f_80_ = 1.0F - f_79_ * f_79_;
		if (f_80_ < 0.0F)
			f_80_ = 0.0F;
		float f_81_ = f_74_ * f + f_75_ * f_64_ + f_76_ * f_65_;
		if (f_81_ < 0.0F)
			f_81_ = 0.0F;
		float f_82_ = f_81_ * f_80_ * 2.0F;
		if (f_82_ > 1.0F)
			f_82_ = 1.0F;
		int i_83_ = aClass527_Sub16_10495.method16133((byte) 0);
		int i_84_ = (int) (f_82_ * (float) (i_83_ >> 16 & 0xff));
		if (i_84_ > 255)
			i_84_ = 255;
		int i_85_ = (int) (f_82_ * (float) (i_83_ >> 8 & 0xff));
		if (i_85_ > 255)
			i_85_ = 255;
		int i_86_ = (int) (f_82_ * (float) (i_83_ & 0xff));
		if (i_86_ > 255)
			i_86_ = 255;
		Unsafe unsafe = aClass180_Sub2_10498.anUnsafe9437;
		unsafe.putFloat(aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16), (float) i_60_);
		unsafe.putFloat((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 4L), (float) i_62_);
		unsafe.putFloat((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 8L), (float) i_61_);
		if (aClass180_Sub2_10498.anInt9578 == 0) {
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 12L), (byte) i_86_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 13L), (byte) i_85_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 14L), (byte) i_84_);
		} else {
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 12L), (byte) i_84_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 13L), (byte) i_85_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 14L), (byte) i_86_);
		}
		unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 15L), (byte) -1);
		anInt10502++;
		unsafe.putShort((aClass180_Sub2_10498.aLong9439 + (long) (aClass180_Sub2_10498.anInt9441 >> 1) + (long) (anInt10499 * 2)), i_63_);
		anInt10499++;
	}

	void method16234(int i, int i_87_, int i_88_, int i_89_, int i_90_, int i_91_) {
		long l = -1L;
		int i_92_ = i_90_ + (i_88_ << aClass161_Sub3_10496.anInt1753 * 1252000143);
		int i_93_ = i_91_ + (i_89_ << aClass161_Sub3_10496.anInt1753 * 1252000143);
		int i_94_ = aClass161_Sub3_10496.method2593(i_92_, i_93_, -1151432033);
		if ((i_90_ & 0x7f) == 0 || (i_91_ & 0x7f) == 0) {
			l = ((long) i_93_ & 0xffffL) << 16 | (long) i_92_ & 0xffffL;
			Class527 class527 = aClass14_10506.method709(l);
			if (class527 != null) {
				Unsafe unsafe = aClass180_Sub2_10498.anUnsafe9437;
				unsafe.putShort((aClass180_Sub2_10498.aLong9439 + (long) (aClass180_Sub2_10498.anInt9441 >> 1) + (long) (anInt10499 * 2)), ((Class527_Sub13) class527).aShort10445);
				anInt10499++;
				return;
			}
		}
		short i_95_ = (short) anInt10502;
		if (l != -1L)
			aClass14_10506.method714(new Class527_Sub13(i_95_), l);
		float f;
		float f_96_;
		float f_97_;
		if (i_90_ == 0 && i_91_ == 0) {
			f = aFloatArrayArray10507[i][i_87_];
			f_96_ = aFloatArrayArray10508[i][i_87_];
			f_97_ = aFloatArrayArray10509[i][i_87_];
		} else if (i_90_ == aClass161_Sub3_10496.anInt1752 * 1048375491 && i_91_ == 0) {
			f = aFloatArrayArray10507[i + 1][i_87_];
			f_96_ = aFloatArrayArray10508[i + 1][i_87_];
			f_97_ = aFloatArrayArray10509[i + 1][i_87_];
		} else if (i_90_ == aClass161_Sub3_10496.anInt1752 * 1048375491 && i_91_ == aClass161_Sub3_10496.anInt1752 * 1048375491) {
			f = aFloatArrayArray10507[i + 1][i_87_ + 1];
			f_96_ = aFloatArrayArray10508[i + 1][i_87_ + 1];
			f_97_ = aFloatArrayArray10509[i + 1][i_87_ + 1];
		} else if (i_90_ == 0 && i_91_ == aClass161_Sub3_10496.anInt1752 * 1048375491) {
			f = aFloatArrayArray10507[i][i_87_ + 1];
			f_96_ = aFloatArrayArray10508[i][i_87_ + 1];
			f_97_ = aFloatArrayArray10509[i][i_87_ + 1];
		} else {
			float f_98_ = ((float) i_90_ / (float) (aClass161_Sub3_10496.anInt1752 * 1048375491));
			float f_99_ = ((float) i_91_ / (float) (aClass161_Sub3_10496.anInt1752 * 1048375491));
			float f_100_ = aFloatArrayArray10507[i][i_87_];
			float f_101_ = aFloatArrayArray10508[i][i_87_];
			float f_102_ = aFloatArrayArray10509[i][i_87_];
			float f_103_ = aFloatArrayArray10507[i + 1][i_87_];
			float f_104_ = aFloatArrayArray10508[i + 1][i_87_];
			float f_105_ = aFloatArrayArray10509[i + 1][i_87_];
			f_100_ += (aFloatArrayArray10507[i][i_87_ + 1] - f_100_) * f_98_;
			f_101_ += (aFloatArrayArray10508[i][i_87_ + 1] - f_101_) * f_98_;
			f_102_ += (aFloatArrayArray10509[i][i_87_ + 1] - f_102_) * f_98_;
			f_103_ += (aFloatArrayArray10507[i + 1][i_87_ + 1] - f_103_) * f_98_;
			f_104_ += (aFloatArrayArray10508[i + 1][i_87_ + 1] - f_104_) * f_98_;
			f_105_ += (aFloatArrayArray10509[i + 1][i_87_ + 1] - f_105_) * f_98_;
			f = f_100_ + (f_103_ - f_100_) * f_99_;
			f_96_ = f_101_ + (f_104_ - f_101_) * f_99_;
			f_97_ = f_102_ + (f_105_ - f_102_) * f_99_;
		}
		float f_106_ = (float) (aClass527_Sub16_10495.method16129((byte) 24) - i_92_);
		float f_107_ = (float) (aClass527_Sub16_10495.method16130((byte) -13) - i_94_);
		float f_108_ = (float) (aClass527_Sub16_10495.method16131((byte) -17) - i_93_);
		float f_109_ = (float) Math.sqrt((double) (f_106_ * f_106_ + f_107_ * f_107_ + f_108_ * f_108_));
		float f_110_ = 1.0F / f_109_;
		f_106_ *= f_110_;
		f_107_ *= f_110_;
		f_108_ *= f_110_;
		float f_111_ = f_109_ / (float) aClass527_Sub16_10495.method16132(277921338);
		float f_112_ = 1.0F - f_111_ * f_111_;
		if (f_112_ < 0.0F)
			f_112_ = 0.0F;
		float f_113_ = f_106_ * f + f_107_ * f_96_ + f_108_ * f_97_;
		if (f_113_ < 0.0F)
			f_113_ = 0.0F;
		float f_114_ = f_113_ * f_112_ * 2.0F;
		if (f_114_ > 1.0F)
			f_114_ = 1.0F;
		int i_115_ = aClass527_Sub16_10495.method16133((byte) 0);
		int i_116_ = (int) (f_114_ * (float) (i_115_ >> 16 & 0xff));
		if (i_116_ > 255)
			i_116_ = 255;
		int i_117_ = (int) (f_114_ * (float) (i_115_ >> 8 & 0xff));
		if (i_117_ > 255)
			i_117_ = 255;
		int i_118_ = (int) (f_114_ * (float) (i_115_ & 0xff));
		if (i_118_ > 255)
			i_118_ = 255;
		Unsafe unsafe = aClass180_Sub2_10498.anUnsafe9437;
		unsafe.putFloat(aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16), (float) i_92_);
		unsafe.putFloat((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 4L), (float) i_94_);
		unsafe.putFloat((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 8L), (float) i_93_);
		if (aClass180_Sub2_10498.anInt9578 == 0) {
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 12L), (byte) i_118_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 13L), (byte) i_117_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 14L), (byte) i_116_);
		} else {
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 12L), (byte) i_116_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 13L), (byte) i_117_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 14L), (byte) i_118_);
		}
		unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 15L), (byte) -1);
		anInt10502++;
		unsafe.putShort((aClass180_Sub2_10498.aLong9439 + (long) (aClass180_Sub2_10498.anInt9441 >> 1) + (long) (anInt10499 * 2)), i_95_);
		anInt10499++;
	}

	void method16235(int i, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_) {
		long l = -1L;
		int i_124_ = i_122_ + (i_120_ << aClass161_Sub3_10496.anInt1753 * 1252000143);
		int i_125_ = i_123_ + (i_121_ << aClass161_Sub3_10496.anInt1753 * 1252000143);
		int i_126_ = aClass161_Sub3_10496.method2593(i_124_, i_125_, -1151432033);
		if ((i_122_ & 0x7f) == 0 || (i_123_ & 0x7f) == 0) {
			l = ((long) i_125_ & 0xffffL) << 16 | (long) i_124_ & 0xffffL;
			Class527 class527 = aClass14_10506.method709(l);
			if (class527 != null) {
				Unsafe unsafe = aClass180_Sub2_10498.anUnsafe9437;
				unsafe.putShort((aClass180_Sub2_10498.aLong9439 + (long) (aClass180_Sub2_10498.anInt9441 >> 1) + (long) (anInt10499 * 2)), ((Class527_Sub13) class527).aShort10445);
				anInt10499++;
				return;
			}
		}
		short i_127_ = (short) anInt10502;
		if (l != -1L)
			aClass14_10506.method714(new Class527_Sub13(i_127_), l);
		float f;
		float f_128_;
		float f_129_;
		if (i_122_ == 0 && i_123_ == 0) {
			f = aFloatArrayArray10507[i][i_119_];
			f_128_ = aFloatArrayArray10508[i][i_119_];
			f_129_ = aFloatArrayArray10509[i][i_119_];
		} else if (i_122_ == aClass161_Sub3_10496.anInt1752 * 1048375491 && i_123_ == 0) {
			f = aFloatArrayArray10507[i + 1][i_119_];
			f_128_ = aFloatArrayArray10508[i + 1][i_119_];
			f_129_ = aFloatArrayArray10509[i + 1][i_119_];
		} else if (i_122_ == aClass161_Sub3_10496.anInt1752 * 1048375491 && i_123_ == aClass161_Sub3_10496.anInt1752 * 1048375491) {
			f = aFloatArrayArray10507[i + 1][i_119_ + 1];
			f_128_ = aFloatArrayArray10508[i + 1][i_119_ + 1];
			f_129_ = aFloatArrayArray10509[i + 1][i_119_ + 1];
		} else if (i_122_ == 0 && i_123_ == aClass161_Sub3_10496.anInt1752 * 1048375491) {
			f = aFloatArrayArray10507[i][i_119_ + 1];
			f_128_ = aFloatArrayArray10508[i][i_119_ + 1];
			f_129_ = aFloatArrayArray10509[i][i_119_ + 1];
		} else {
			float f_130_ = ((float) i_122_ / (float) (aClass161_Sub3_10496.anInt1752 * 1048375491));
			float f_131_ = ((float) i_123_ / (float) (aClass161_Sub3_10496.anInt1752 * 1048375491));
			float f_132_ = aFloatArrayArray10507[i][i_119_];
			float f_133_ = aFloatArrayArray10508[i][i_119_];
			float f_134_ = aFloatArrayArray10509[i][i_119_];
			float f_135_ = aFloatArrayArray10507[i + 1][i_119_];
			float f_136_ = aFloatArrayArray10508[i + 1][i_119_];
			float f_137_ = aFloatArrayArray10509[i + 1][i_119_];
			f_132_ += (aFloatArrayArray10507[i][i_119_ + 1] - f_132_) * f_130_;
			f_133_ += (aFloatArrayArray10508[i][i_119_ + 1] - f_133_) * f_130_;
			f_134_ += (aFloatArrayArray10509[i][i_119_ + 1] - f_134_) * f_130_;
			f_135_ += ((aFloatArrayArray10507[i + 1][i_119_ + 1] - f_135_) * f_130_);
			f_136_ += ((aFloatArrayArray10508[i + 1][i_119_ + 1] - f_136_) * f_130_);
			f_137_ += ((aFloatArrayArray10509[i + 1][i_119_ + 1] - f_137_) * f_130_);
			f = f_132_ + (f_135_ - f_132_) * f_131_;
			f_128_ = f_133_ + (f_136_ - f_133_) * f_131_;
			f_129_ = f_134_ + (f_137_ - f_134_) * f_131_;
		}
		float f_138_ = (float) (aClass527_Sub16_10495.method16129((byte) 19) - i_124_);
		float f_139_ = (float) (aClass527_Sub16_10495.method16130((byte) -1) - i_126_);
		float f_140_ = (float) (aClass527_Sub16_10495.method16131((byte) -84) - i_125_);
		float f_141_ = (float) Math.sqrt((double) (f_138_ * f_138_ + f_139_ * f_139_ + f_140_ * f_140_));
		float f_142_ = 1.0F / f_141_;
		f_138_ *= f_142_;
		f_139_ *= f_142_;
		f_140_ *= f_142_;
		float f_143_ = f_141_ / (float) aClass527_Sub16_10495.method16132(309640583);
		float f_144_ = 1.0F - f_143_ * f_143_;
		if (f_144_ < 0.0F)
			f_144_ = 0.0F;
		float f_145_ = f_138_ * f + f_139_ * f_128_ + f_140_ * f_129_;
		if (f_145_ < 0.0F)
			f_145_ = 0.0F;
		float f_146_ = f_145_ * f_144_ * 2.0F;
		if (f_146_ > 1.0F)
			f_146_ = 1.0F;
		int i_147_ = aClass527_Sub16_10495.method16133((byte) 0);
		int i_148_ = (int) (f_146_ * (float) (i_147_ >> 16 & 0xff));
		if (i_148_ > 255)
			i_148_ = 255;
		int i_149_ = (int) (f_146_ * (float) (i_147_ >> 8 & 0xff));
		if (i_149_ > 255)
			i_149_ = 255;
		int i_150_ = (int) (f_146_ * (float) (i_147_ & 0xff));
		if (i_150_ > 255)
			i_150_ = 255;
		Unsafe unsafe = aClass180_Sub2_10498.anUnsafe9437;
		unsafe.putFloat(aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16), (float) i_124_);
		unsafe.putFloat((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 4L), (float) i_126_);
		unsafe.putFloat((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 8L), (float) i_125_);
		if (aClass180_Sub2_10498.anInt9578 == 0) {
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 12L), (byte) i_150_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 13L), (byte) i_149_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 14L), (byte) i_148_);
		} else {
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 12L), (byte) i_148_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 13L), (byte) i_149_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 14L), (byte) i_150_);
		}
		unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 15L), (byte) -1);
		anInt10502++;
		unsafe.putShort((aClass180_Sub2_10498.aLong9439 + (long) (aClass180_Sub2_10498.anInt9441 >> 1) + (long) (anInt10499 * 2)), i_127_);
		anInt10499++;
	}

	void method16236(int i, int i_151_, int i_152_, int i_153_, int i_154_, int i_155_) {
		long l = -1L;
		int i_156_ = i_154_ + (i_152_ << aClass161_Sub3_10496.anInt1753 * 1252000143);
		int i_157_ = i_155_ + (i_153_ << aClass161_Sub3_10496.anInt1753 * 1252000143);
		int i_158_ = aClass161_Sub3_10496.method2593(i_156_, i_157_, -1151432033);
		if ((i_154_ & 0x7f) == 0 || (i_155_ & 0x7f) == 0) {
			l = ((long) i_157_ & 0xffffL) << 16 | (long) i_156_ & 0xffffL;
			Class527 class527 = aClass14_10506.method709(l);
			if (class527 != null) {
				Unsafe unsafe = aClass180_Sub2_10498.anUnsafe9437;
				unsafe.putShort((aClass180_Sub2_10498.aLong9439 + (long) (aClass180_Sub2_10498.anInt9441 >> 1) + (long) (anInt10499 * 2)), ((Class527_Sub13) class527).aShort10445);
				anInt10499++;
				return;
			}
		}
		short i_159_ = (short) anInt10502;
		if (l != -1L)
			aClass14_10506.method714(new Class527_Sub13(i_159_), l);
		float f;
		float f_160_;
		float f_161_;
		if (i_154_ == 0 && i_155_ == 0) {
			f = aFloatArrayArray10507[i][i_151_];
			f_160_ = aFloatArrayArray10508[i][i_151_];
			f_161_ = aFloatArrayArray10509[i][i_151_];
		} else if (i_154_ == aClass161_Sub3_10496.anInt1752 * 1048375491 && i_155_ == 0) {
			f = aFloatArrayArray10507[i + 1][i_151_];
			f_160_ = aFloatArrayArray10508[i + 1][i_151_];
			f_161_ = aFloatArrayArray10509[i + 1][i_151_];
		} else if (i_154_ == aClass161_Sub3_10496.anInt1752 * 1048375491 && i_155_ == aClass161_Sub3_10496.anInt1752 * 1048375491) {
			f = aFloatArrayArray10507[i + 1][i_151_ + 1];
			f_160_ = aFloatArrayArray10508[i + 1][i_151_ + 1];
			f_161_ = aFloatArrayArray10509[i + 1][i_151_ + 1];
		} else if (i_154_ == 0 && i_155_ == aClass161_Sub3_10496.anInt1752 * 1048375491) {
			f = aFloatArrayArray10507[i][i_151_ + 1];
			f_160_ = aFloatArrayArray10508[i][i_151_ + 1];
			f_161_ = aFloatArrayArray10509[i][i_151_ + 1];
		} else {
			float f_162_ = ((float) i_154_ / (float) (aClass161_Sub3_10496.anInt1752 * 1048375491));
			float f_163_ = ((float) i_155_ / (float) (aClass161_Sub3_10496.anInt1752 * 1048375491));
			float f_164_ = aFloatArrayArray10507[i][i_151_];
			float f_165_ = aFloatArrayArray10508[i][i_151_];
			float f_166_ = aFloatArrayArray10509[i][i_151_];
			float f_167_ = aFloatArrayArray10507[i + 1][i_151_];
			float f_168_ = aFloatArrayArray10508[i + 1][i_151_];
			float f_169_ = aFloatArrayArray10509[i + 1][i_151_];
			f_164_ += (aFloatArrayArray10507[i][i_151_ + 1] - f_164_) * f_162_;
			f_165_ += (aFloatArrayArray10508[i][i_151_ + 1] - f_165_) * f_162_;
			f_166_ += (aFloatArrayArray10509[i][i_151_ + 1] - f_166_) * f_162_;
			f_167_ += ((aFloatArrayArray10507[i + 1][i_151_ + 1] - f_167_) * f_162_);
			f_168_ += ((aFloatArrayArray10508[i + 1][i_151_ + 1] - f_168_) * f_162_);
			f_169_ += ((aFloatArrayArray10509[i + 1][i_151_ + 1] - f_169_) * f_162_);
			f = f_164_ + (f_167_ - f_164_) * f_163_;
			f_160_ = f_165_ + (f_168_ - f_165_) * f_163_;
			f_161_ = f_166_ + (f_169_ - f_166_) * f_163_;
		}
		float f_170_ = (float) (aClass527_Sub16_10495.method16129((byte) -86) - i_156_);
		float f_171_ = (float) (aClass527_Sub16_10495.method16130((byte) 22) - i_158_);
		float f_172_ = (float) (aClass527_Sub16_10495.method16131((byte) 51) - i_157_);
		float f_173_ = (float) Math.sqrt((double) (f_170_ * f_170_ + f_171_ * f_171_ + f_172_ * f_172_));
		float f_174_ = 1.0F / f_173_;
		f_170_ *= f_174_;
		f_171_ *= f_174_;
		f_172_ *= f_174_;
		float f_175_ = f_173_ / (float) aClass527_Sub16_10495.method16132(-1704967714);
		float f_176_ = 1.0F - f_175_ * f_175_;
		if (f_176_ < 0.0F)
			f_176_ = 0.0F;
		float f_177_ = f_170_ * f + f_171_ * f_160_ + f_172_ * f_161_;
		if (f_177_ < 0.0F)
			f_177_ = 0.0F;
		float f_178_ = f_177_ * f_176_ * 2.0F;
		if (f_178_ > 1.0F)
			f_178_ = 1.0F;
		int i_179_ = aClass527_Sub16_10495.method16133((byte) 0);
		int i_180_ = (int) (f_178_ * (float) (i_179_ >> 16 & 0xff));
		if (i_180_ > 255)
			i_180_ = 255;
		int i_181_ = (int) (f_178_ * (float) (i_179_ >> 8 & 0xff));
		if (i_181_ > 255)
			i_181_ = 255;
		int i_182_ = (int) (f_178_ * (float) (i_179_ & 0xff));
		if (i_182_ > 255)
			i_182_ = 255;
		Unsafe unsafe = aClass180_Sub2_10498.anUnsafe9437;
		unsafe.putFloat(aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16), (float) i_156_);
		unsafe.putFloat((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 4L), (float) i_158_);
		unsafe.putFloat((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 8L), (float) i_157_);
		if (aClass180_Sub2_10498.anInt9578 == 0) {
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 12L), (byte) i_182_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 13L), (byte) i_181_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 14L), (byte) i_180_);
		} else {
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 12L), (byte) i_180_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 13L), (byte) i_181_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 14L), (byte) i_182_);
		}
		unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 15L), (byte) -1);
		anInt10502++;
		unsafe.putShort((aClass180_Sub2_10498.aLong9439 + (long) (aClass180_Sub2_10498.anInt9441 >> 1) + (long) (anInt10499 * 2)), i_159_);
		anInt10499++;
	}

	void method16237(Class326 class326, int i, int i_183_, int i_184_, boolean[][] bools, boolean bool) {
		if (anInterface44_10510 != null && anInt10503 <= i + i_184_ && anInt10505 >= i - i_184_ && anInt10500 <= i_183_ + i_184_ && anInt10501 >= i_183_ - i_184_) {
			if (bool) {
				for (int i_185_ = anInt10503; i_185_ <= anInt10505; i_185_++) {
					if (i_185_ - i >= -i_184_ && i_185_ - i <= i_184_) {
						for (int i_186_ = anInt10500; i_186_ <= anInt10501; i_186_++) {
							if (i_186_ - i_183_ >= -i_184_ && i_186_ - i_183_ <= i_184_ && (bools[i_185_ - i + i_184_][i_186_ - i_183_ + i_184_])) {
								method16230(class326, anInterface44_10510, anInt10499 / 3);
								return;
							}
						}
					}
				}
			} else {
				int i_187_ = 0;
				ByteBuffer bytebuffer = aClass180_Sub2_10498.aByteBuffer9438;
				bytebuffer.clear();
				for (int i_188_ = anInt10500; i_188_ <= anInt10501; i_188_++) {
					if (i_188_ - i_183_ >= -i_184_ && i_188_ - i_183_ <= i_184_) {
						int i_189_ = (i_188_ * (aClass161_Sub3_10496.anInt1750 * 1210322533) + anInt10503);
						for (int i_190_ = anInt10503; i_190_ <= anInt10505; i_190_++) {
							if (i_190_ - i >= -i_184_ && i_190_ - i <= i_184_ && (bools[i_190_ - i + i_184_][i_188_ - i_183_ + i_184_])) {
								short[] is = (aClass161_Sub3_10496.aShortArrayArray9621[i_189_]);
								if (is != null) {
									for (int i_191_ = 0; i_191_ < is.length; i_191_++) {
										bytebuffer.putShort(is[i_191_]);
										i_187_++;
									}
								}
							}
							i_189_++;
						}
					}
				}
				if (bytebuffer.position() != 0 && i_187_ != 0) {
					int i_192_ = bytebuffer.position();
					Interface44 interface44 = aClass180_Sub2_10498.method15136(i_192_ / 2);
					interface44.method213(0, i_192_, aClass180_Sub2_10498.aLong9439);
					method16230(class326, interface44, i_187_ / 3);
				}
			}
		}
	}

	void method16238(Class326 class326, int i, int i_193_, int i_194_, boolean[][] bools, boolean bool) {
		if (anInterface44_10510 != null && anInt10503 <= i + i_194_ && anInt10505 >= i - i_194_ && anInt10500 <= i_193_ + i_194_ && anInt10501 >= i_193_ - i_194_) {
			if (bool) {
				for (int i_195_ = anInt10503; i_195_ <= anInt10505; i_195_++) {
					if (i_195_ - i >= -i_194_ && i_195_ - i <= i_194_) {
						for (int i_196_ = anInt10500; i_196_ <= anInt10501; i_196_++) {
							if (i_196_ - i_193_ >= -i_194_ && i_196_ - i_193_ <= i_194_ && (bools[i_195_ - i + i_194_][i_196_ - i_193_ + i_194_])) {
								method16230(class326, anInterface44_10510, anInt10499 / 3);
								return;
							}
						}
					}
				}
			} else {
				int i_197_ = 0;
				ByteBuffer bytebuffer = aClass180_Sub2_10498.aByteBuffer9438;
				bytebuffer.clear();
				for (int i_198_ = anInt10500; i_198_ <= anInt10501; i_198_++) {
					if (i_198_ - i_193_ >= -i_194_ && i_198_ - i_193_ <= i_194_) {
						int i_199_ = (i_198_ * (aClass161_Sub3_10496.anInt1750 * 1210322533) + anInt10503);
						for (int i_200_ = anInt10503; i_200_ <= anInt10505; i_200_++) {
							if (i_200_ - i >= -i_194_ && i_200_ - i <= i_194_ && (bools[i_200_ - i + i_194_][i_198_ - i_193_ + i_194_])) {
								short[] is = (aClass161_Sub3_10496.aShortArrayArray9621[i_199_]);
								if (is != null) {
									for (int i_201_ = 0; i_201_ < is.length; i_201_++) {
										bytebuffer.putShort(is[i_201_]);
										i_197_++;
									}
								}
							}
							i_199_++;
						}
					}
				}
				if (bytebuffer.position() != 0 && i_197_ != 0) {
					int i_202_ = bytebuffer.position();
					Interface44 interface44 = aClass180_Sub2_10498.method15136(i_202_ / 2);
					interface44.method213(0, i_202_, aClass180_Sub2_10498.aLong9439);
					method16230(class326, interface44, i_197_ / 3);
				}
			}
		}
	}

	void method16239(Class326 class326, int i, int i_203_, int i_204_, boolean[][] bools, boolean bool) {
		if (anInterface44_10510 != null && anInt10503 <= i + i_204_ && anInt10505 >= i - i_204_ && anInt10500 <= i_203_ + i_204_ && anInt10501 >= i_203_ - i_204_) {
			if (bool) {
				for (int i_205_ = anInt10503; i_205_ <= anInt10505; i_205_++) {
					if (i_205_ - i >= -i_204_ && i_205_ - i <= i_204_) {
						for (int i_206_ = anInt10500; i_206_ <= anInt10501; i_206_++) {
							if (i_206_ - i_203_ >= -i_204_ && i_206_ - i_203_ <= i_204_ && (bools[i_205_ - i + i_204_][i_206_ - i_203_ + i_204_])) {
								method16230(class326, anInterface44_10510, anInt10499 / 3);
								return;
							}
						}
					}
				}
			} else {
				int i_207_ = 0;
				ByteBuffer bytebuffer = aClass180_Sub2_10498.aByteBuffer9438;
				bytebuffer.clear();
				for (int i_208_ = anInt10500; i_208_ <= anInt10501; i_208_++) {
					if (i_208_ - i_203_ >= -i_204_ && i_208_ - i_203_ <= i_204_) {
						int i_209_ = (i_208_ * (aClass161_Sub3_10496.anInt1750 * 1210322533) + anInt10503);
						for (int i_210_ = anInt10503; i_210_ <= anInt10505; i_210_++) {
							if (i_210_ - i >= -i_204_ && i_210_ - i <= i_204_ && (bools[i_210_ - i + i_204_][i_208_ - i_203_ + i_204_])) {
								short[] is = (aClass161_Sub3_10496.aShortArrayArray9621[i_209_]);
								if (is != null) {
									for (int i_211_ = 0; i_211_ < is.length; i_211_++) {
										bytebuffer.putShort(is[i_211_]);
										i_207_++;
									}
								}
							}
							i_209_++;
						}
					}
				}
				if (bytebuffer.position() != 0 && i_207_ != 0) {
					int i_212_ = bytebuffer.position();
					Interface44 interface44 = aClass180_Sub2_10498.method15136(i_212_ / 2);
					interface44.method213(0, i_212_, aClass180_Sub2_10498.aLong9439);
					method16230(class326, interface44, i_207_ / 3);
				}
			}
		}
	}

	void method16240(int i, int i_213_, int i_214_, int i_215_, int i_216_, int i_217_) {
		long l = -1L;
		int i_218_ = i_216_ + (i_214_ << aClass161_Sub3_10496.anInt1753 * 1252000143);
		int i_219_ = i_217_ + (i_215_ << aClass161_Sub3_10496.anInt1753 * 1252000143);
		int i_220_ = aClass161_Sub3_10496.method2593(i_218_, i_219_, -1151432033);
		if ((i_216_ & 0x7f) == 0 || (i_217_ & 0x7f) == 0) {
			l = ((long) i_219_ & 0xffffL) << 16 | (long) i_218_ & 0xffffL;
			Class527 class527 = aClass14_10506.method709(l);
			if (class527 != null) {
				Unsafe unsafe = aClass180_Sub2_10498.anUnsafe9437;
				unsafe.putShort((aClass180_Sub2_10498.aLong9439 + (long) (aClass180_Sub2_10498.anInt9441 >> 1) + (long) (anInt10499 * 2)), ((Class527_Sub13) class527).aShort10445);
				anInt10499++;
				return;
			}
		}
		short i_221_ = (short) anInt10502;
		if (l != -1L)
			aClass14_10506.method714(new Class527_Sub13(i_221_), l);
		float f;
		float f_222_;
		float f_223_;
		if (i_216_ == 0 && i_217_ == 0) {
			f = aFloatArrayArray10507[i][i_213_];
			f_222_ = aFloatArrayArray10508[i][i_213_];
			f_223_ = aFloatArrayArray10509[i][i_213_];
		} else if (i_216_ == aClass161_Sub3_10496.anInt1752 * 1048375491 && i_217_ == 0) {
			f = aFloatArrayArray10507[i + 1][i_213_];
			f_222_ = aFloatArrayArray10508[i + 1][i_213_];
			f_223_ = aFloatArrayArray10509[i + 1][i_213_];
		} else if (i_216_ == aClass161_Sub3_10496.anInt1752 * 1048375491 && i_217_ == aClass161_Sub3_10496.anInt1752 * 1048375491) {
			f = aFloatArrayArray10507[i + 1][i_213_ + 1];
			f_222_ = aFloatArrayArray10508[i + 1][i_213_ + 1];
			f_223_ = aFloatArrayArray10509[i + 1][i_213_ + 1];
		} else if (i_216_ == 0 && i_217_ == aClass161_Sub3_10496.anInt1752 * 1048375491) {
			f = aFloatArrayArray10507[i][i_213_ + 1];
			f_222_ = aFloatArrayArray10508[i][i_213_ + 1];
			f_223_ = aFloatArrayArray10509[i][i_213_ + 1];
		} else {
			float f_224_ = ((float) i_216_ / (float) (aClass161_Sub3_10496.anInt1752 * 1048375491));
			float f_225_ = ((float) i_217_ / (float) (aClass161_Sub3_10496.anInt1752 * 1048375491));
			float f_226_ = aFloatArrayArray10507[i][i_213_];
			float f_227_ = aFloatArrayArray10508[i][i_213_];
			float f_228_ = aFloatArrayArray10509[i][i_213_];
			float f_229_ = aFloatArrayArray10507[i + 1][i_213_];
			float f_230_ = aFloatArrayArray10508[i + 1][i_213_];
			float f_231_ = aFloatArrayArray10509[i + 1][i_213_];
			f_226_ += (aFloatArrayArray10507[i][i_213_ + 1] - f_226_) * f_224_;
			f_227_ += (aFloatArrayArray10508[i][i_213_ + 1] - f_227_) * f_224_;
			f_228_ += (aFloatArrayArray10509[i][i_213_ + 1] - f_228_) * f_224_;
			f_229_ += ((aFloatArrayArray10507[i + 1][i_213_ + 1] - f_229_) * f_224_);
			f_230_ += ((aFloatArrayArray10508[i + 1][i_213_ + 1] - f_230_) * f_224_);
			f_231_ += ((aFloatArrayArray10509[i + 1][i_213_ + 1] - f_231_) * f_224_);
			f = f_226_ + (f_229_ - f_226_) * f_225_;
			f_222_ = f_227_ + (f_230_ - f_227_) * f_225_;
			f_223_ = f_228_ + (f_231_ - f_228_) * f_225_;
		}
		float f_232_ = (float) (aClass527_Sub16_10495.method16129((byte) -46) - i_218_);
		float f_233_ = (float) (aClass527_Sub16_10495.method16130((byte) 68) - i_220_);
		float f_234_ = (float) (aClass527_Sub16_10495.method16131((byte) 64) - i_219_);
		float f_235_ = (float) Math.sqrt((double) (f_232_ * f_232_ + f_233_ * f_233_ + f_234_ * f_234_));
		float f_236_ = 1.0F / f_235_;
		f_232_ *= f_236_;
		f_233_ *= f_236_;
		f_234_ *= f_236_;
		float f_237_ = f_235_ / (float) aClass527_Sub16_10495.method16132(-114614512);
		float f_238_ = 1.0F - f_237_ * f_237_;
		if (f_238_ < 0.0F)
			f_238_ = 0.0F;
		float f_239_ = f_232_ * f + f_233_ * f_222_ + f_234_ * f_223_;
		if (f_239_ < 0.0F)
			f_239_ = 0.0F;
		float f_240_ = f_239_ * f_238_ * 2.0F;
		if (f_240_ > 1.0F)
			f_240_ = 1.0F;
		int i_241_ = aClass527_Sub16_10495.method16133((byte) 0);
		int i_242_ = (int) (f_240_ * (float) (i_241_ >> 16 & 0xff));
		if (i_242_ > 255)
			i_242_ = 255;
		int i_243_ = (int) (f_240_ * (float) (i_241_ >> 8 & 0xff));
		if (i_243_ > 255)
			i_243_ = 255;
		int i_244_ = (int) (f_240_ * (float) (i_241_ & 0xff));
		if (i_244_ > 255)
			i_244_ = 255;
		Unsafe unsafe = aClass180_Sub2_10498.anUnsafe9437;
		unsafe.putFloat(aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16), (float) i_218_);
		unsafe.putFloat((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 4L), (float) i_220_);
		unsafe.putFloat((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 8L), (float) i_219_);
		if (aClass180_Sub2_10498.anInt9578 == 0) {
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 12L), (byte) i_244_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 13L), (byte) i_243_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 14L), (byte) i_242_);
		} else {
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 12L), (byte) i_242_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 13L), (byte) i_243_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 14L), (byte) i_244_);
		}
		unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 15L), (byte) -1);
		anInt10502++;
		unsafe.putShort((aClass180_Sub2_10498.aLong9439 + (long) (aClass180_Sub2_10498.anInt9441 >> 1) + (long) (anInt10499 * 2)), i_221_);
		anInt10499++;
	}

	void method16241(int i, int i_245_, int i_246_, int i_247_, int i_248_, int i_249_) {
		long l = -1L;
		int i_250_ = i_248_ + (i_246_ << aClass161_Sub3_10496.anInt1753 * 1252000143);
		int i_251_ = i_249_ + (i_247_ << aClass161_Sub3_10496.anInt1753 * 1252000143);
		int i_252_ = aClass161_Sub3_10496.method2593(i_250_, i_251_, -1151432033);
		if ((i_248_ & 0x7f) == 0 || (i_249_ & 0x7f) == 0) {
			l = ((long) i_251_ & 0xffffL) << 16 | (long) i_250_ & 0xffffL;
			Class527 class527 = aClass14_10506.method709(l);
			if (class527 != null) {
				Unsafe unsafe = aClass180_Sub2_10498.anUnsafe9437;
				unsafe.putShort((aClass180_Sub2_10498.aLong9439 + (long) (aClass180_Sub2_10498.anInt9441 >> 1) + (long) (anInt10499 * 2)), ((Class527_Sub13) class527).aShort10445);
				anInt10499++;
				return;
			}
		}
		short i_253_ = (short) anInt10502;
		if (l != -1L)
			aClass14_10506.method714(new Class527_Sub13(i_253_), l);
		float f;
		float f_254_;
		float f_255_;
		if (i_248_ == 0 && i_249_ == 0) {
			f = aFloatArrayArray10507[i][i_245_];
			f_254_ = aFloatArrayArray10508[i][i_245_];
			f_255_ = aFloatArrayArray10509[i][i_245_];
		} else if (i_248_ == aClass161_Sub3_10496.anInt1752 * 1048375491 && i_249_ == 0) {
			f = aFloatArrayArray10507[i + 1][i_245_];
			f_254_ = aFloatArrayArray10508[i + 1][i_245_];
			f_255_ = aFloatArrayArray10509[i + 1][i_245_];
		} else if (i_248_ == aClass161_Sub3_10496.anInt1752 * 1048375491 && i_249_ == aClass161_Sub3_10496.anInt1752 * 1048375491) {
			f = aFloatArrayArray10507[i + 1][i_245_ + 1];
			f_254_ = aFloatArrayArray10508[i + 1][i_245_ + 1];
			f_255_ = aFloatArrayArray10509[i + 1][i_245_ + 1];
		} else if (i_248_ == 0 && i_249_ == aClass161_Sub3_10496.anInt1752 * 1048375491) {
			f = aFloatArrayArray10507[i][i_245_ + 1];
			f_254_ = aFloatArrayArray10508[i][i_245_ + 1];
			f_255_ = aFloatArrayArray10509[i][i_245_ + 1];
		} else {
			float f_256_ = ((float) i_248_ / (float) (aClass161_Sub3_10496.anInt1752 * 1048375491));
			float f_257_ = ((float) i_249_ / (float) (aClass161_Sub3_10496.anInt1752 * 1048375491));
			float f_258_ = aFloatArrayArray10507[i][i_245_];
			float f_259_ = aFloatArrayArray10508[i][i_245_];
			float f_260_ = aFloatArrayArray10509[i][i_245_];
			float f_261_ = aFloatArrayArray10507[i + 1][i_245_];
			float f_262_ = aFloatArrayArray10508[i + 1][i_245_];
			float f_263_ = aFloatArrayArray10509[i + 1][i_245_];
			f_258_ += (aFloatArrayArray10507[i][i_245_ + 1] - f_258_) * f_256_;
			f_259_ += (aFloatArrayArray10508[i][i_245_ + 1] - f_259_) * f_256_;
			f_260_ += (aFloatArrayArray10509[i][i_245_ + 1] - f_260_) * f_256_;
			f_261_ += ((aFloatArrayArray10507[i + 1][i_245_ + 1] - f_261_) * f_256_);
			f_262_ += ((aFloatArrayArray10508[i + 1][i_245_ + 1] - f_262_) * f_256_);
			f_263_ += ((aFloatArrayArray10509[i + 1][i_245_ + 1] - f_263_) * f_256_);
			f = f_258_ + (f_261_ - f_258_) * f_257_;
			f_254_ = f_259_ + (f_262_ - f_259_) * f_257_;
			f_255_ = f_260_ + (f_263_ - f_260_) * f_257_;
		}
		float f_264_ = (float) (aClass527_Sub16_10495.method16129((byte) -113) - i_250_);
		float f_265_ = (float) (aClass527_Sub16_10495.method16130((byte) -29) - i_252_);
		float f_266_ = (float) (aClass527_Sub16_10495.method16131((byte) -15) - i_251_);
		float f_267_ = (float) Math.sqrt((double) (f_264_ * f_264_ + f_265_ * f_265_ + f_266_ * f_266_));
		float f_268_ = 1.0F / f_267_;
		f_264_ *= f_268_;
		f_265_ *= f_268_;
		f_266_ *= f_268_;
		float f_269_ = f_267_ / (float) aClass527_Sub16_10495.method16132(798875954);
		float f_270_ = 1.0F - f_269_ * f_269_;
		if (f_270_ < 0.0F)
			f_270_ = 0.0F;
		float f_271_ = f_264_ * f + f_265_ * f_254_ + f_266_ * f_255_;
		if (f_271_ < 0.0F)
			f_271_ = 0.0F;
		float f_272_ = f_271_ * f_270_ * 2.0F;
		if (f_272_ > 1.0F)
			f_272_ = 1.0F;
		int i_273_ = aClass527_Sub16_10495.method16133((byte) 0);
		int i_274_ = (int) (f_272_ * (float) (i_273_ >> 16 & 0xff));
		if (i_274_ > 255)
			i_274_ = 255;
		int i_275_ = (int) (f_272_ * (float) (i_273_ >> 8 & 0xff));
		if (i_275_ > 255)
			i_275_ = 255;
		int i_276_ = (int) (f_272_ * (float) (i_273_ & 0xff));
		if (i_276_ > 255)
			i_276_ = 255;
		Unsafe unsafe = aClass180_Sub2_10498.anUnsafe9437;
		unsafe.putFloat(aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16), (float) i_250_);
		unsafe.putFloat((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 4L), (float) i_252_);
		unsafe.putFloat((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 8L), (float) i_251_);
		if (aClass180_Sub2_10498.anInt9578 == 0) {
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 12L), (byte) i_276_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 13L), (byte) i_275_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 14L), (byte) i_274_);
		} else {
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 12L), (byte) i_274_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 13L), (byte) i_275_);
			unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 14L), (byte) i_276_);
		}
		unsafe.putByte((aClass180_Sub2_10498.aLong9439 + (long) (anInt10502 * 16) + 15L), (byte) -1);
		anInt10502++;
		unsafe.putShort((aClass180_Sub2_10498.aLong9439 + (long) (aClass180_Sub2_10498.anInt9441 >> 1) + (long) (anInt10499 * 2)), i_253_);
		anInt10499++;
	}

	void method16242(Class326 class326, Interface44 interface44, int i) {
		class326.anInt3598 = 0;
		class326.anInt3597 = anInt10502;
		class326.anInt3584 = 0;
		class326.anInt3599 = anInt10499 / 3;
		class326.anInterface38_3595 = aClass180_Sub2_10498.anInterface38_9533;
		float f = aClass527_Sub16_10495.method16162(-1980545648);
		class326.aClass442_3594.method7138(f, f, f);
		aClass180_Sub2_10498.method14988(0, anInterface37_10504);
		aClass180_Sub2_10498.method15149(aClass180_Sub2_10498.aClass355_9433);
		aClass180_Sub2_10498.method15001(anInterface44_10510);
		class326.method5758(0);
	}

	void method16243(Class326 class326, Interface44 interface44, int i) {
		class326.anInt3598 = 0;
		class326.anInt3597 = anInt10502;
		class326.anInt3584 = 0;
		class326.anInt3599 = anInt10499 / 3;
		class326.anInterface38_3595 = aClass180_Sub2_10498.anInterface38_9533;
		float f = aClass527_Sub16_10495.method16162(-1609464222);
		class326.aClass442_3594.method7138(f, f, f);
		aClass180_Sub2_10498.method14988(0, anInterface37_10504);
		aClass180_Sub2_10498.method15149(aClass180_Sub2_10498.aClass355_9433);
		aClass180_Sub2_10498.method15001(anInterface44_10510);
		class326.method5758(0);
	}
}
