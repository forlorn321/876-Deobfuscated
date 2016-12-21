/* Class337 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

public class Class337 {
	Interface41 anInterface41_3632;
	static final int anInt3633 = 128;
	Class167_Sub3 aClass167_Sub3_3634;
	Class339 aClass339_3635;
	int anInt3636;
	int anInt3637;
	int anInt3638;
	int anInt3639;
	int anInt3640;
	boolean aBool3641 = true;
	static final int anInt3642 = 7;
	int anInt3643;
	Interface36 anInterface36_3644;
	int[] anIntArray3645;
	byte[] aByteArray3646;

	void method4380(Class327 class327) {
		method4381(class327, anInterface41_3632, 0, anInt3640);
	}

	void method4381(Class327 class327, Interface41 interface41, int i, int i_0_) {
		if (i_0_ > 0) {
			method4383();
			aClass167_Sub3_3634.method8809(interface41);
			class327.anInterface36_3569 = anInterface36_3644;
			class327.anInt3584 = anInt3643;
			class327.anInt3574 = anInt3638 - anInt3643 + 1;
			class327.anInt3586 = i;
			class327.anInt3587 = i_0_;
			class327.method4285(false);
		}
	}

	Class337(Class167_Sub3 class167_sub3, Class339 class339, Class160_Sub2 class160_sub2, int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		anInt3639 = -1;
		aClass167_Sub3_3634 = class167_sub3;
		aClass339_3635 = class339;
		anInt3636 = i_3_;
		anInt3637 = i_4_;
		int i_5_ = 1 << i_2_;
		int i_6_ = 0;
		int i_7_ = i << i_2_;
		int i_8_ = i_1_ << i_2_;
		for (int i_9_ = 0; i_9_ < i_5_; i_9_++) {
			int i_10_ = ((i_8_ + i_9_) * (class160_sub2.anInt1766 * 1718142487) + i_7_);
			for (int i_11_ = 0; i_11_ < i_5_; i_11_++) {
				short[] is = class160_sub2.aShortArrayArray9402[i_10_++];
				if (is != null)
					i_6_ += is.length;
			}
		}
		if (i_6_ > 0) {
			anInt3638 = -2147483648;
			anInt3643 = 2147483647;
			anInterface41_3632 = aClass167_Sub3_3634.method8804(false);
			anInterface41_3632.method283(i_6_);
			ByteBuffer bytebuffer = aClass167_Sub3_3634.aByteBuffer9549;
			bytebuffer.clear();
			for (int i_12_ = 0; i_12_ < i_5_; i_12_++) {
				int i_13_ = ((i_8_ + i_12_) * (class160_sub2.anInt1766 * 1718142487) + i_7_);
				for (int i_14_ = 0; i_14_ < i_5_; i_14_++) {
					short[] is = class160_sub2.aShortArrayArray9402[i_13_++];
					if (is != null) {
						for (int i_15_ = 0; i_15_ < is.length; i_15_++) {
							int i_16_ = is[i_15_] & 0xffff;
							if (i_16_ < anInt3643)
								anInt3643 = i_16_;
							if (i_16_ > anInt3638)
								anInt3638 = i_16_;
							bytebuffer.putShort((short) i_16_);
						}
					}
				}
			}
			anInterface41_3632.method264(0, bytebuffer.position(), aClass167_Sub3_3634.aLong9586);
			anInt3640 = i_6_ / 3;
		} else {
			anInt3640 = 0;
			anInterface36_3644 = null;
		}
	}

	void method4382() {
		if (aBool3641) {
			aBool3641 = false;
			byte[] is = aClass339_3635.aByteArray3655;
			int i = 0;
			int i_17_ = aClass339_3635.anInt3651;
			int i_18_ = anInt3636 + anInt3637 * aClass339_3635.anInt3651;
			for (int i_19_ = -128; i_19_ < 0; i_19_++) {
				i = (i << 8) - i;
				for (int i_20_ = -128; i_20_ < 0; i_20_++) {
					if (is[i_18_++] != 0)
						i++;
				}
				i_18_ += i_17_ - 128;
			}
			if (anInterface36_3644 != null && anInt3639 == i)
				aBool3641 = false;
			else {
				anInt3639 = i;
				int i_21_ = 0;
				i_18_ = anInt3636 + anInt3637 * i_17_;
				if (aClass167_Sub3_3634.method8769(Class155.aClass155_1729, Class171.aClass171_1905)) {
					if (aByteArray3646 == null)
						aByteArray3646 = new byte[16384];
					byte[] is_22_ = aByteArray3646;
					for (int i_23_ = -128; i_23_ < 0; i_23_++) {
						for (int i_24_ = -128; i_24_ < 0; i_24_++) {
							if (is[i_18_] != 0)
								is_22_[i_21_++] = (byte) 68;
							else {
								int i_25_ = 0;
								if (is[i_18_ - 1] != 0)
									i_25_++;
								if (is[i_18_ + 1] != 0)
									i_25_++;
								if (is[i_18_ - i_17_] != 0)
									i_25_++;
								if (is[i_18_ + i_17_] != 0)
									i_25_++;
								is_22_[i_21_++] = (byte) (17 * i_25_);
							}
							i_18_++;
						}
						i_18_ += aClass339_3635.anInt3651 - 128;
					}
					if (anInterface36_3644 == null) {
						anInterface36_3644 = aClass167_Sub3_3634.method8740((Class155.aClass155_1729), 128, 128, false, aByteArray3646);
						anInterface36_3644.method222(false, false);
					} else
						anInterface36_3644.method224(0, 0, 128, 128, aByteArray3646, Class155.aClass155_1729, 0, 128);
				} else {
					if (anIntArray3645 == null)
						anIntArray3645 = new int[16384];
					int[] is_26_ = anIntArray3645;
					for (int i_27_ = -128; i_27_ < 0; i_27_++) {
						for (int i_28_ = -128; i_28_ < 0; i_28_++) {
							if (is[i_18_] != 0)
								is_26_[i_21_++] = 1140850688;
							else {
								int i_29_ = 0;
								if (is[i_18_ - 1] != 0)
									i_29_++;
								if (is[i_18_ + 1] != 0)
									i_29_++;
								if (is[i_18_ - i_17_] != 0)
									i_29_++;
								if (is[i_18_ + i_17_] != 0)
									i_29_++;
								is_26_[i_21_++] = 17 * i_29_ << 24;
							}
							i_18_++;
						}
						i_18_ += aClass339_3635.anInt3651 - 128;
					}
					if (anInterface36_3644 == null) {
						anInterface36_3644 = aClass167_Sub3_3634.method8771(128, 128, false, anIntArray3645);
						anInterface36_3644.method222(false, false);
					} else
						anInterface36_3644.method223(0, 0, 128, 128, anIntArray3645, 0, 128);
				}
			}
		}
	}

	void method4383() {
		if (aBool3641) {
			aBool3641 = false;
			byte[] is = aClass339_3635.aByteArray3655;
			int i = 0;
			int i_30_ = aClass339_3635.anInt3651;
			int i_31_ = anInt3636 + anInt3637 * aClass339_3635.anInt3651;
			for (int i_32_ = -128; i_32_ < 0; i_32_++) {
				i = (i << 8) - i;
				for (int i_33_ = -128; i_33_ < 0; i_33_++) {
					if (is[i_31_++] != 0)
						i++;
				}
				i_31_ += i_30_ - 128;
			}
			if (anInterface36_3644 != null && anInt3639 == i)
				aBool3641 = false;
			else {
				anInt3639 = i;
				int i_34_ = 0;
				i_31_ = anInt3636 + anInt3637 * i_30_;
				if (aClass167_Sub3_3634.method8769(Class155.aClass155_1729, Class171.aClass171_1905)) {
					if (aByteArray3646 == null)
						aByteArray3646 = new byte[16384];
					byte[] is_35_ = aByteArray3646;
					for (int i_36_ = -128; i_36_ < 0; i_36_++) {
						for (int i_37_ = -128; i_37_ < 0; i_37_++) {
							if (is[i_31_] != 0)
								is_35_[i_34_++] = (byte) 68;
							else {
								int i_38_ = 0;
								if (is[i_31_ - 1] != 0)
									i_38_++;
								if (is[i_31_ + 1] != 0)
									i_38_++;
								if (is[i_31_ - i_30_] != 0)
									i_38_++;
								if (is[i_31_ + i_30_] != 0)
									i_38_++;
								is_35_[i_34_++] = (byte) (17 * i_38_);
							}
							i_31_++;
						}
						i_31_ += aClass339_3635.anInt3651 - 128;
					}
					if (anInterface36_3644 == null) {
						anInterface36_3644 = aClass167_Sub3_3634.method8740((Class155.aClass155_1729), 128, 128, false, aByteArray3646);
						anInterface36_3644.method222(false, false);
					} else
						anInterface36_3644.method224(0, 0, 128, 128, aByteArray3646, Class155.aClass155_1729, 0, 128);
				} else {
					if (anIntArray3645 == null)
						anIntArray3645 = new int[16384];
					int[] is_39_ = anIntArray3645;
					for (int i_40_ = -128; i_40_ < 0; i_40_++) {
						for (int i_41_ = -128; i_41_ < 0; i_41_++) {
							if (is[i_31_] != 0)
								is_39_[i_34_++] = 1140850688;
							else {
								int i_42_ = 0;
								if (is[i_31_ - 1] != 0)
									i_42_++;
								if (is[i_31_ + 1] != 0)
									i_42_++;
								if (is[i_31_ - i_30_] != 0)
									i_42_++;
								if (is[i_31_ + i_30_] != 0)
									i_42_++;
								is_39_[i_34_++] = 17 * i_42_ << 24;
							}
							i_31_++;
						}
						i_31_ += aClass339_3635.anInt3651 - 128;
					}
					if (anInterface36_3644 == null) {
						anInterface36_3644 = aClass167_Sub3_3634.method8771(128, 128, false, anIntArray3645);
						anInterface36_3644.method222(false, false);
					} else
						anInterface36_3644.method223(0, 0, 128, 128, anIntArray3645, 0, 128);
				}
			}
		}
	}

	void method4384() {
		if (aBool3641) {
			aBool3641 = false;
			byte[] is = aClass339_3635.aByteArray3655;
			int i = 0;
			int i_43_ = aClass339_3635.anInt3651;
			int i_44_ = anInt3636 + anInt3637 * aClass339_3635.anInt3651;
			for (int i_45_ = -128; i_45_ < 0; i_45_++) {
				i = (i << 8) - i;
				for (int i_46_ = -128; i_46_ < 0; i_46_++) {
					if (is[i_44_++] != 0)
						i++;
				}
				i_44_ += i_43_ - 128;
			}
			if (anInterface36_3644 != null && anInt3639 == i)
				aBool3641 = false;
			else {
				anInt3639 = i;
				int i_47_ = 0;
				i_44_ = anInt3636 + anInt3637 * i_43_;
				if (aClass167_Sub3_3634.method8769(Class155.aClass155_1729, Class171.aClass171_1905)) {
					if (aByteArray3646 == null)
						aByteArray3646 = new byte[16384];
					byte[] is_48_ = aByteArray3646;
					for (int i_49_ = -128; i_49_ < 0; i_49_++) {
						for (int i_50_ = -128; i_50_ < 0; i_50_++) {
							if (is[i_44_] != 0)
								is_48_[i_47_++] = (byte) 68;
							else {
								int i_51_ = 0;
								if (is[i_44_ - 1] != 0)
									i_51_++;
								if (is[i_44_ + 1] != 0)
									i_51_++;
								if (is[i_44_ - i_43_] != 0)
									i_51_++;
								if (is[i_44_ + i_43_] != 0)
									i_51_++;
								is_48_[i_47_++] = (byte) (17 * i_51_);
							}
							i_44_++;
						}
						i_44_ += aClass339_3635.anInt3651 - 128;
					}
					if (anInterface36_3644 == null) {
						anInterface36_3644 = aClass167_Sub3_3634.method8740((Class155.aClass155_1729), 128, 128, false, aByteArray3646);
						anInterface36_3644.method222(false, false);
					} else
						anInterface36_3644.method224(0, 0, 128, 128, aByteArray3646, Class155.aClass155_1729, 0, 128);
				} else {
					if (anIntArray3645 == null)
						anIntArray3645 = new int[16384];
					int[] is_52_ = anIntArray3645;
					for (int i_53_ = -128; i_53_ < 0; i_53_++) {
						for (int i_54_ = -128; i_54_ < 0; i_54_++) {
							if (is[i_44_] != 0)
								is_52_[i_47_++] = 1140850688;
							else {
								int i_55_ = 0;
								if (is[i_44_ - 1] != 0)
									i_55_++;
								if (is[i_44_ + 1] != 0)
									i_55_++;
								if (is[i_44_ - i_43_] != 0)
									i_55_++;
								if (is[i_44_ + i_43_] != 0)
									i_55_++;
								is_52_[i_47_++] = 17 * i_55_ << 24;
							}
							i_44_++;
						}
						i_44_ += aClass339_3635.anInt3651 - 128;
					}
					if (anInterface36_3644 == null) {
						anInterface36_3644 = aClass167_Sub3_3634.method8771(128, 128, false, anIntArray3645);
						anInterface36_3644.method222(false, false);
					} else
						anInterface36_3644.method223(0, 0, 128, 128, anIntArray3645, 0, 128);
				}
			}
		}
	}
}
