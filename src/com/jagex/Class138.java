/* Class138 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class138 {
	Class124_Sub1 aClass124_Sub1_1636;
	static final int anInt1637 = 128;
	Class167_Sub2 aClass167_Sub2_1638;
	static final int anInt1639 = 7;
	int anInt1640;
	boolean aBool1641 = true;
	int anInt1642;
	int anInt1643 = -1;
	int anInt1644;
	Interface17 anInterface17_1645;
	Class122_Sub1 aClass122_Sub1_1646;
	Class150 aClass150_1647;

	void method1688() {
		method1692(anInterface17_1645, anInt1644);
	}

	void method1689() {
		method1692(anInterface17_1645, anInt1644);
	}

	void method1690(byte[] is, int i) {
		aClass122_Sub1_1646.method91(5123, is, i * 2);
		method1692(aClass122_Sub1_1646, i);
	}

	void method1691() {
		if (aBool1641) {
			aBool1641 = false;
			byte[] is = aClass150_1647.aByteArray1706;
			byte[] is_0_ = aClass167_Sub2_1638.aByteArray9324;
			int i = 0;
			int i_1_ = aClass150_1647.anInt1710;
			int i_2_ = anInt1640 + anInt1642 * aClass150_1647.anInt1710;
			for (int i_3_ = -128; i_3_ < 0; i_3_++) {
				i = (i << 8) - i;
				for (int i_4_ = -128; i_4_ < 0; i_4_++) {
					if (is[i_2_++] != 0)
						i++;
				}
				i_2_ += i_1_ - 128;
			}
			if (aClass124_Sub1_1636 != null && anInt1643 == i)
				aBool1641 = false;
			else {
				anInt1643 = i;
				int i_5_ = 0;
				i_2_ = anInt1640 + anInt1642 * i_1_;
				for (int i_6_ = -128; i_6_ < 0; i_6_++) {
					for (int i_7_ = -128; i_7_ < 0; i_7_++) {
						if (is[i_2_] != 0)
							is_0_[i_5_++] = (byte) 68;
						else {
							int i_8_ = 0;
							if (is[i_2_ - 1] != 0)
								i_8_++;
							if (is[i_2_ + 1] != 0)
								i_8_++;
							if (is[i_2_ - i_1_] != 0)
								i_8_++;
							if (is[i_2_ + i_1_] != 0)
								i_8_++;
							is_0_[i_5_++] = (byte) (17 * i_8_);
						}
						i_2_++;
					}
					i_2_ += aClass150_1647.anInt1710 - 128;
				}
				if (aClass124_Sub1_1636 == null) {
					aClass124_Sub1_1636 = new Class124_Sub1(aClass167_Sub2_1638, 3553, Class155.aClass155_1729, Class171.aClass171_1905, 128, 128, false, aClass167_Sub2_1638.aByteArray9324, Class155.aClass155_1729, false);
					aClass124_Sub1_1636.method8394(false, false);
					aClass124_Sub1_1636.method1609(true);
				} else
					aClass124_Sub1_1636.method8395(0, 0, 128, 128, (aClass167_Sub2_1638.aByteArray9324), Class155.aClass155_1729, 0, 0, false);
			}
		}
	}

	void method1692(Interface17 interface17, int i) {
		if (i != 0) {
			method1691();
			aClass167_Sub2_1638.method8617(aClass124_Sub1_1636);
			aClass167_Sub2_1638.method8511(interface17, 4, 0, i);
		}
	}

	void method1693() {
		method1692(anInterface17_1645, anInt1644);
	}

	void method1694() {
		if (aBool1641) {
			aBool1641 = false;
			byte[] is = aClass150_1647.aByteArray1706;
			byte[] is_9_ = aClass167_Sub2_1638.aByteArray9324;
			int i = 0;
			int i_10_ = aClass150_1647.anInt1710;
			int i_11_ = anInt1640 + anInt1642 * aClass150_1647.anInt1710;
			for (int i_12_ = -128; i_12_ < 0; i_12_++) {
				i = (i << 8) - i;
				for (int i_13_ = -128; i_13_ < 0; i_13_++) {
					if (is[i_11_++] != 0)
						i++;
				}
				i_11_ += i_10_ - 128;
			}
			if (aClass124_Sub1_1636 != null && anInt1643 == i)
				aBool1641 = false;
			else {
				anInt1643 = i;
				int i_14_ = 0;
				i_11_ = anInt1640 + anInt1642 * i_10_;
				for (int i_15_ = -128; i_15_ < 0; i_15_++) {
					for (int i_16_ = -128; i_16_ < 0; i_16_++) {
						if (is[i_11_] != 0)
							is_9_[i_14_++] = (byte) 68;
						else {
							int i_17_ = 0;
							if (is[i_11_ - 1] != 0)
								i_17_++;
							if (is[i_11_ + 1] != 0)
								i_17_++;
							if (is[i_11_ - i_10_] != 0)
								i_17_++;
							if (is[i_11_ + i_10_] != 0)
								i_17_++;
							is_9_[i_14_++] = (byte) (17 * i_17_);
						}
						i_11_++;
					}
					i_11_ += aClass150_1647.anInt1710 - 128;
				}
				if (aClass124_Sub1_1636 == null) {
					aClass124_Sub1_1636 = new Class124_Sub1(aClass167_Sub2_1638, 3553, Class155.aClass155_1729, Class171.aClass171_1905, 128, 128, false, aClass167_Sub2_1638.aByteArray9324, Class155.aClass155_1729, false);
					aClass124_Sub1_1636.method8394(false, false);
					aClass124_Sub1_1636.method1609(true);
				} else
					aClass124_Sub1_1636.method8395(0, 0, 128, 128, (aClass167_Sub2_1638.aByteArray9324), Class155.aClass155_1729, 0, 0, false);
			}
		}
	}

	void method1695() {
		if (aBool1641) {
			aBool1641 = false;
			byte[] is = aClass150_1647.aByteArray1706;
			byte[] is_18_ = aClass167_Sub2_1638.aByteArray9324;
			int i = 0;
			int i_19_ = aClass150_1647.anInt1710;
			int i_20_ = anInt1640 + anInt1642 * aClass150_1647.anInt1710;
			for (int i_21_ = -128; i_21_ < 0; i_21_++) {
				i = (i << 8) - i;
				for (int i_22_ = -128; i_22_ < 0; i_22_++) {
					if (is[i_20_++] != 0)
						i++;
				}
				i_20_ += i_19_ - 128;
			}
			if (aClass124_Sub1_1636 != null && anInt1643 == i)
				aBool1641 = false;
			else {
				anInt1643 = i;
				int i_23_ = 0;
				i_20_ = anInt1640 + anInt1642 * i_19_;
				for (int i_24_ = -128; i_24_ < 0; i_24_++) {
					for (int i_25_ = -128; i_25_ < 0; i_25_++) {
						if (is[i_20_] != 0)
							is_18_[i_23_++] = (byte) 68;
						else {
							int i_26_ = 0;
							if (is[i_20_ - 1] != 0)
								i_26_++;
							if (is[i_20_ + 1] != 0)
								i_26_++;
							if (is[i_20_ - i_19_] != 0)
								i_26_++;
							if (is[i_20_ + i_19_] != 0)
								i_26_++;
							is_18_[i_23_++] = (byte) (17 * i_26_);
						}
						i_20_++;
					}
					i_20_ += aClass150_1647.anInt1710 - 128;
				}
				if (aClass124_Sub1_1636 == null) {
					aClass124_Sub1_1636 = new Class124_Sub1(aClass167_Sub2_1638, 3553, Class155.aClass155_1729, Class171.aClass171_1905, 128, 128, false, aClass167_Sub2_1638.aByteArray9324, Class155.aClass155_1729, false);
					aClass124_Sub1_1636.method8394(false, false);
					aClass124_Sub1_1636.method1609(true);
				} else
					aClass124_Sub1_1636.method8395(0, 0, 128, 128, (aClass167_Sub2_1638.aByteArray9324), Class155.aClass155_1729, 0, 0, false);
			}
		}
	}

	Class138(Class167_Sub2 class167_sub2, Class150 class150, Class160_Sub1 class160_sub1, int i, int i_27_, int i_28_, int i_29_, int i_30_) {
		aClass167_Sub2_1638 = class167_sub2;
		aClass150_1647 = class150;
		anInt1640 = i_29_;
		anInt1642 = i_30_;
		int i_31_ = 1 << i_28_;
		int i_32_ = 0;
		int i_33_ = i << i_28_;
		int i_34_ = i_27_ << i_28_;
		for (int i_35_ = 0; i_35_ < i_31_; i_35_++) {
			int i_36_ = ((i_34_ + i_35_) * (class160_sub1.anInt1766 * 1718142487) + i_33_);
			for (int i_37_ = 0; i_37_ < i_31_; i_37_++) {
				short[] is = class160_sub1.aShortArrayArray9380[i_36_++];
				if (is != null)
					i_32_ += is.length;
			}
		}
		anInt1644 = i_32_;
		if (i_32_ > 0) {
			RSByteBuffer class536_sub33 = new RSByteBuffer(i_32_ * 2);
			if (aClass167_Sub2_1638.aBool9284) {
				for (int i_38_ = 0; i_38_ < i_31_; i_38_++) {
					int i_39_ = ((i_34_ + i_38_) * (class160_sub1.anInt1766 * 1718142487) + i_33_);
					for (int i_40_ = 0; i_40_ < i_31_; i_40_++) {
						short[] is = class160_sub1.aShortArrayArray9380[i_39_++];
						if (is != null) {
							for (int i_41_ = 0; i_41_ < is.length; i_41_++)
								class536_sub33.writeShort(is[i_41_] & 0xffff, -1778059594);
						}
					}
				}
			} else {
				for (int i_42_ = 0; i_42_ < i_31_; i_42_++) {
					int i_43_ = ((i_34_ + i_42_) * (class160_sub1.anInt1766 * 1718142487) + i_33_);
					for (int i_44_ = 0; i_44_ < i_31_; i_44_++) {
						short[] is = class160_sub1.aShortArrayArray9380[i_43_++];
						if (is != null) {
							for (int i_45_ = 0; i_45_ < is.length; i_45_++)
								class536_sub33.writeShortLE(is[i_45_] & 0xffff, 2054276904);
						}
					}
				}
			}
			anInterface17_1645 = aClass167_Sub2_1638.method8543(5123, (class536_sub33.buffer), (class536_sub33.off * -810172525), false);
			aClass122_Sub1_1646 = new Class122_Sub1(aClass167_Sub2_1638, 5123, null, 1);
		} else
			aClass124_Sub1_1636 = null;
	}
}
