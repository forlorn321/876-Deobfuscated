/* Class356 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

public class Class356 {
	byte[] aByteArray3811;
	static final int anInt3812 = 128;
	Class180_Sub2 aClass180_Sub2_3813;
	Class351 aClass351_3814;
	int anInt3815;
	int anInt3816;
	boolean aBool3817 = true;
	int anInt3818 = -1;
	int anInt3819;
	Interface44 anInterface44_3820;
	int[] anIntArray3821;
	int anInt3822;
	int anInt3823;
	static final int anInt3824 = 7;
	Interface38 anInterface38_3825;

	void method6261(Class326 class326) {
		method6264(class326, anInterface44_3820, 0, anInt3819);
	}

	void method6262() {
		if (aBool3817) {
			aBool3817 = false;
			byte[] is = aClass351_3814.aByteArray3759;
			int i = 0;
			int i_0_ = aClass351_3814.anInt3757;
			int i_1_ = anInt3815 + anInt3816 * aClass351_3814.anInt3757;
			for (int i_2_ = -128; i_2_ < 0; i_2_++) {
				i = (i << 8) - i;
				for (int i_3_ = -128; i_3_ < 0; i_3_++) {
					if (is[i_1_++] != 0)
						i++;
				}
				i_1_ += i_0_ - 128;
			}
			if (anInterface38_3825 != null && anInt3818 == i)
				aBool3817 = false;
			else {
				anInt3818 = i;
				int i_4_ = 0;
				i_1_ = anInt3815 + anInt3816 * i_0_;
				if (aClass180_Sub2_3813.method14960(Class157.aClass157_1724, Class184.aClass184_2104)) {
					if (aByteArray3811 == null)
						aByteArray3811 = new byte[16384];
					byte[] is_5_ = aByteArray3811;
					for (int i_6_ = -128; i_6_ < 0; i_6_++) {
						for (int i_7_ = -128; i_7_ < 0; i_7_++) {
							if (is[i_1_] != 0)
								is_5_[i_4_++] = (byte) 68;
							else {
								int i_8_ = 0;
								if (is[i_1_ - 1] != 0)
									i_8_++;
								if (is[i_1_ + 1] != 0)
									i_8_++;
								if (is[i_1_ - i_0_] != 0)
									i_8_++;
								if (is[i_1_ + i_0_] != 0)
									i_8_++;
								is_5_[i_4_++] = (byte) (17 * i_8_);
							}
							i_1_++;
						}
						i_1_ += aClass351_3814.anInt3757 - 128;
					}
					if (anInterface38_3825 == null) {
						anInterface38_3825 = (aClass180_Sub2_3813.method15022(Class157.aClass157_1724, 128, 128, false, aByteArray3811));
						anInterface38_3825.method226(false, false);
					} else
						anInterface38_3825.method228(0, 0, 128, 128, aByteArray3811, Class157.aClass157_1724, 0, 128);
				} else {
					if (anIntArray3821 == null)
						anIntArray3821 = new int[16384];
					int[] is_9_ = anIntArray3821;
					for (int i_10_ = -128; i_10_ < 0; i_10_++) {
						for (int i_11_ = -128; i_11_ < 0; i_11_++) {
							if (is[i_1_] != 0)
								is_9_[i_4_++] = 1140850688;
							else {
								int i_12_ = 0;
								if (is[i_1_ - 1] != 0)
									i_12_++;
								if (is[i_1_ + 1] != 0)
									i_12_++;
								if (is[i_1_ - i_0_] != 0)
									i_12_++;
								if (is[i_1_ + i_0_] != 0)
									i_12_++;
								is_9_[i_4_++] = 17 * i_12_ << 24;
							}
							i_1_++;
						}
						i_1_ += aClass351_3814.anInt3757 - 128;
					}
					if (anInterface38_3825 == null) {
						anInterface38_3825 = aClass180_Sub2_3813.method14962(128, 128, false, anIntArray3821);
						anInterface38_3825.method226(false, false);
					} else
						anInterface38_3825.method227(0, 0, 128, 128, anIntArray3821, 0, 128);
				}
			}
		}
	}

	void method6263(Class326 class326, Interface44 interface44, int i, int i_13_) {
		if (i_13_ > 0) {
			method6262();
			aClass180_Sub2_3813.method15001(interface44);
			class326.anInterface38_3595 = anInterface38_3825;
			class326.anInt3598 = anInt3822;
			class326.anInt3597 = anInt3823 - anInt3822 + 1;
			class326.anInt3584 = i;
			class326.anInt3599 = i_13_;
			class326.method5757(false);
		}
	}

	void method6264(Class326 class326, Interface44 interface44, int i, int i_14_) {
		if (i_14_ > 0) {
			method6262();
			aClass180_Sub2_3813.method15001(interface44);
			class326.anInterface38_3595 = anInterface38_3825;
			class326.anInt3598 = anInt3822;
			class326.anInt3597 = anInt3823 - anInt3822 + 1;
			class326.anInt3584 = i;
			class326.anInt3599 = i_14_;
			class326.method5757(false);
		}
	}

	void method6265(Class326 class326) {
		method6264(class326, anInterface44_3820, 0, anInt3819);
	}

	Class356(Class180_Sub2 class180_sub2, Class351 class351, Class161_Sub3 class161_sub3, int i, int i_15_, int i_16_, int i_17_, int i_18_) {
		aClass180_Sub2_3813 = class180_sub2;
		aClass351_3814 = class351;
		anInt3815 = i_17_;
		anInt3816 = i_18_;
		int i_19_ = 1 << i_16_;
		int i_20_ = 0;
		int i_21_ = i << i_16_;
		int i_22_ = i_15_ << i_16_;
		for (int i_23_ = 0; i_23_ < i_19_; i_23_++) {
			int i_24_ = ((i_22_ + i_23_) * (class161_sub3.anInt1750 * 1210322533) + i_21_);
			for (int i_25_ = 0; i_25_ < i_19_; i_25_++) {
				short[] is = class161_sub3.aShortArrayArray9621[i_24_++];
				if (is != null)
					i_20_ += is.length;
			}
		}
		if (i_20_ > 0) {
			anInt3823 = -2147483648;
			anInt3822 = 2147483647;
			anInterface44_3820 = aClass180_Sub2_3813.method15025(false);
			anInterface44_3820.method323(i_20_);
			ByteBuffer bytebuffer = aClass180_Sub2_3813.aByteBuffer9438;
			bytebuffer.clear();
			for (int i_26_ = 0; i_26_ < i_19_; i_26_++) {
				int i_27_ = ((i_22_ + i_26_) * (class161_sub3.anInt1750 * 1210322533) + i_21_);
				for (int i_28_ = 0; i_28_ < i_19_; i_28_++) {
					short[] is = class161_sub3.aShortArrayArray9621[i_27_++];
					if (is != null) {
						for (int i_29_ = 0; i_29_ < is.length; i_29_++) {
							int i_30_ = is[i_29_] & 0xffff;
							if (i_30_ < anInt3822)
								anInt3822 = i_30_;
							if (i_30_ > anInt3823)
								anInt3823 = i_30_;
							bytebuffer.putShort((short) i_30_);
						}
					}
				}
			}
			anInterface44_3820.method213(0, bytebuffer.position(), aClass180_Sub2_3813.aLong9439);
			anInt3819 = i_20_ / 3;
		} else {
			anInt3819 = 0;
			anInterface38_3825 = null;
		}
	}

	void method6266(Class326 class326, Interface44 interface44, int i, int i_31_) {
		if (i_31_ > 0) {
			method6262();
			aClass180_Sub2_3813.method15001(interface44);
			class326.anInterface38_3595 = anInterface38_3825;
			class326.anInt3598 = anInt3822;
			class326.anInt3597 = anInt3823 - anInt3822 + 1;
			class326.anInt3584 = i;
			class326.anInt3599 = i_31_;
			class326.method5757(false);
		}
	}

	void method6267(Class326 class326, Interface44 interface44, int i, int i_32_) {
		if (i_32_ > 0) {
			method6262();
			aClass180_Sub2_3813.method15001(interface44);
			class326.anInterface38_3595 = anInterface38_3825;
			class326.anInt3598 = anInt3822;
			class326.anInt3597 = anInt3823 - anInt3822 + 1;
			class326.anInt3584 = i;
			class326.anInt3599 = i_32_;
			class326.method5757(false);
		}
	}

	void method6268() {
		if (aBool3817) {
			aBool3817 = false;
			byte[] is = aClass351_3814.aByteArray3759;
			int i = 0;
			int i_33_ = aClass351_3814.anInt3757;
			int i_34_ = anInt3815 + anInt3816 * aClass351_3814.anInt3757;
			for (int i_35_ = -128; i_35_ < 0; i_35_++) {
				i = (i << 8) - i;
				for (int i_36_ = -128; i_36_ < 0; i_36_++) {
					if (is[i_34_++] != 0)
						i++;
				}
				i_34_ += i_33_ - 128;
			}
			if (anInterface38_3825 != null && anInt3818 == i)
				aBool3817 = false;
			else {
				anInt3818 = i;
				int i_37_ = 0;
				i_34_ = anInt3815 + anInt3816 * i_33_;
				if (aClass180_Sub2_3813.method14960(Class157.aClass157_1724, Class184.aClass184_2104)) {
					if (aByteArray3811 == null)
						aByteArray3811 = new byte[16384];
					byte[] is_38_ = aByteArray3811;
					for (int i_39_ = -128; i_39_ < 0; i_39_++) {
						for (int i_40_ = -128; i_40_ < 0; i_40_++) {
							if (is[i_34_] != 0)
								is_38_[i_37_++] = (byte) 68;
							else {
								int i_41_ = 0;
								if (is[i_34_ - 1] != 0)
									i_41_++;
								if (is[i_34_ + 1] != 0)
									i_41_++;
								if (is[i_34_ - i_33_] != 0)
									i_41_++;
								if (is[i_34_ + i_33_] != 0)
									i_41_++;
								is_38_[i_37_++] = (byte) (17 * i_41_);
							}
							i_34_++;
						}
						i_34_ += aClass351_3814.anInt3757 - 128;
					}
					if (anInterface38_3825 == null) {
						anInterface38_3825 = (aClass180_Sub2_3813.method15022(Class157.aClass157_1724, 128, 128, false, aByteArray3811));
						anInterface38_3825.method226(false, false);
					} else
						anInterface38_3825.method228(0, 0, 128, 128, aByteArray3811, Class157.aClass157_1724, 0, 128);
				} else {
					if (anIntArray3821 == null)
						anIntArray3821 = new int[16384];
					int[] is_42_ = anIntArray3821;
					for (int i_43_ = -128; i_43_ < 0; i_43_++) {
						for (int i_44_ = -128; i_44_ < 0; i_44_++) {
							if (is[i_34_] != 0)
								is_42_[i_37_++] = 1140850688;
							else {
								int i_45_ = 0;
								if (is[i_34_ - 1] != 0)
									i_45_++;
								if (is[i_34_ + 1] != 0)
									i_45_++;
								if (is[i_34_ - i_33_] != 0)
									i_45_++;
								if (is[i_34_ + i_33_] != 0)
									i_45_++;
								is_42_[i_37_++] = 17 * i_45_ << 24;
							}
							i_34_++;
						}
						i_34_ += aClass351_3814.anInt3757 - 128;
					}
					if (anInterface38_3825 == null) {
						anInterface38_3825 = aClass180_Sub2_3813.method14962(128, 128, false, anIntArray3821);
						anInterface38_3825.method226(false, false);
					} else
						anInterface38_3825.method227(0, 0, 128, 128, anIntArray3821, 0, 128);
				}
			}
		}
	}

	void method6269() {
		if (aBool3817) {
			aBool3817 = false;
			byte[] is = aClass351_3814.aByteArray3759;
			int i = 0;
			int i_46_ = aClass351_3814.anInt3757;
			int i_47_ = anInt3815 + anInt3816 * aClass351_3814.anInt3757;
			for (int i_48_ = -128; i_48_ < 0; i_48_++) {
				i = (i << 8) - i;
				for (int i_49_ = -128; i_49_ < 0; i_49_++) {
					if (is[i_47_++] != 0)
						i++;
				}
				i_47_ += i_46_ - 128;
			}
			if (anInterface38_3825 != null && anInt3818 == i)
				aBool3817 = false;
			else {
				anInt3818 = i;
				int i_50_ = 0;
				i_47_ = anInt3815 + anInt3816 * i_46_;
				if (aClass180_Sub2_3813.method14960(Class157.aClass157_1724, Class184.aClass184_2104)) {
					if (aByteArray3811 == null)
						aByteArray3811 = new byte[16384];
					byte[] is_51_ = aByteArray3811;
					for (int i_52_ = -128; i_52_ < 0; i_52_++) {
						for (int i_53_ = -128; i_53_ < 0; i_53_++) {
							if (is[i_47_] != 0)
								is_51_[i_50_++] = (byte) 68;
							else {
								int i_54_ = 0;
								if (is[i_47_ - 1] != 0)
									i_54_++;
								if (is[i_47_ + 1] != 0)
									i_54_++;
								if (is[i_47_ - i_46_] != 0)
									i_54_++;
								if (is[i_47_ + i_46_] != 0)
									i_54_++;
								is_51_[i_50_++] = (byte) (17 * i_54_);
							}
							i_47_++;
						}
						i_47_ += aClass351_3814.anInt3757 - 128;
					}
					if (anInterface38_3825 == null) {
						anInterface38_3825 = (aClass180_Sub2_3813.method15022(Class157.aClass157_1724, 128, 128, false, aByteArray3811));
						anInterface38_3825.method226(false, false);
					} else
						anInterface38_3825.method228(0, 0, 128, 128, aByteArray3811, Class157.aClass157_1724, 0, 128);
				} else {
					if (anIntArray3821 == null)
						anIntArray3821 = new int[16384];
					int[] is_55_ = anIntArray3821;
					for (int i_56_ = -128; i_56_ < 0; i_56_++) {
						for (int i_57_ = -128; i_57_ < 0; i_57_++) {
							if (is[i_47_] != 0)
								is_55_[i_50_++] = 1140850688;
							else {
								int i_58_ = 0;
								if (is[i_47_ - 1] != 0)
									i_58_++;
								if (is[i_47_ + 1] != 0)
									i_58_++;
								if (is[i_47_ - i_46_] != 0)
									i_58_++;
								if (is[i_47_ + i_46_] != 0)
									i_58_++;
								is_55_[i_50_++] = 17 * i_58_ << 24;
							}
							i_47_++;
						}
						i_47_ += aClass351_3814.anInt3757 - 128;
					}
					if (anInterface38_3825 == null) {
						anInterface38_3825 = aClass180_Sub2_3813.method14962(128, 128, false, anIntArray3821);
						anInterface38_3825.method226(false, false);
					} else
						anInterface38_3825.method227(0, 0, 128, 128, anIntArray3821, 0, 128);
				}
			}
		}
	}

	void method6270() {
		if (aBool3817) {
			aBool3817 = false;
			byte[] is = aClass351_3814.aByteArray3759;
			int i = 0;
			int i_59_ = aClass351_3814.anInt3757;
			int i_60_ = anInt3815 + anInt3816 * aClass351_3814.anInt3757;
			for (int i_61_ = -128; i_61_ < 0; i_61_++) {
				i = (i << 8) - i;
				for (int i_62_ = -128; i_62_ < 0; i_62_++) {
					if (is[i_60_++] != 0)
						i++;
				}
				i_60_ += i_59_ - 128;
			}
			if (anInterface38_3825 != null && anInt3818 == i)
				aBool3817 = false;
			else {
				anInt3818 = i;
				int i_63_ = 0;
				i_60_ = anInt3815 + anInt3816 * i_59_;
				if (aClass180_Sub2_3813.method14960(Class157.aClass157_1724, Class184.aClass184_2104)) {
					if (aByteArray3811 == null)
						aByteArray3811 = new byte[16384];
					byte[] is_64_ = aByteArray3811;
					for (int i_65_ = -128; i_65_ < 0; i_65_++) {
						for (int i_66_ = -128; i_66_ < 0; i_66_++) {
							if (is[i_60_] != 0)
								is_64_[i_63_++] = (byte) 68;
							else {
								int i_67_ = 0;
								if (is[i_60_ - 1] != 0)
									i_67_++;
								if (is[i_60_ + 1] != 0)
									i_67_++;
								if (is[i_60_ - i_59_] != 0)
									i_67_++;
								if (is[i_60_ + i_59_] != 0)
									i_67_++;
								is_64_[i_63_++] = (byte) (17 * i_67_);
							}
							i_60_++;
						}
						i_60_ += aClass351_3814.anInt3757 - 128;
					}
					if (anInterface38_3825 == null) {
						anInterface38_3825 = (aClass180_Sub2_3813.method15022(Class157.aClass157_1724, 128, 128, false, aByteArray3811));
						anInterface38_3825.method226(false, false);
					} else
						anInterface38_3825.method228(0, 0, 128, 128, aByteArray3811, Class157.aClass157_1724, 0, 128);
				} else {
					if (anIntArray3821 == null)
						anIntArray3821 = new int[16384];
					int[] is_68_ = anIntArray3821;
					for (int i_69_ = -128; i_69_ < 0; i_69_++) {
						for (int i_70_ = -128; i_70_ < 0; i_70_++) {
							if (is[i_60_] != 0)
								is_68_[i_63_++] = 1140850688;
							else {
								int i_71_ = 0;
								if (is[i_60_ - 1] != 0)
									i_71_++;
								if (is[i_60_ + 1] != 0)
									i_71_++;
								if (is[i_60_ - i_59_] != 0)
									i_71_++;
								if (is[i_60_ + i_59_] != 0)
									i_71_++;
								is_68_[i_63_++] = 17 * i_71_ << 24;
							}
							i_60_++;
						}
						i_60_ += aClass351_3814.anInt3757 - 128;
					}
					if (anInterface38_3825 == null) {
						anInterface38_3825 = aClass180_Sub2_3813.method14962(128, 128, false, anIntArray3821);
						anInterface38_3825.method226(false, false);
					} else
						anInterface38_3825.method227(0, 0, 128, 128, anIntArray3821, 0, 128);
				}
			}
		}
	}
}
