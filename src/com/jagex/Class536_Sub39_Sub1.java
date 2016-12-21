/* Class536_Sub39_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub39_Sub1 extends Class536_Sub39 {
	int anInt11738;
	static final int anInt11739 = 4;
	static final int anInt11740 = 4;
	static final boolean aBool11741 = true;
	static final int anInt11742 = 1638;
	static final int anInt11743 = 0;
	short[] aShortArray11744;
	byte[] aByteArray11745 = new byte[512];
	static final int anInt11746 = 8;
	int anInt11747;
	int anInt11748;
	int anInt11749 = 0;
	int anInt11750;
	boolean aBool11751;
	short[] aShortArray11752;

	void method10742() {
		aByteArray11745 = Class28.method766(anInt11749 * 1574009207, 897996053);
		method10746(46556298);
		for (int i = 27285161 * anInt11738 - 1; i >= 1; i--) {
			short i_0_ = aShortArray11752[i];
			if (i_0_ > 8 || i_0_ < -8)
				break;
			anInt11738 -= -1791185511;
		}
	}

	void method10743(int i, int[] is, int i_1_) {
		int i_2_ = -1030467477 * anInt11748 * Class28.anIntArray257[i];
		if (1 == 27285161 * anInt11738) {
			int i_3_ = aShortArray11752[0];
			int i_4_ = aShortArray11744[0] << 12;
			int i_5_ = i_4_ * (-1030467477 * anInt11748) >> 12;
			int i_6_ = -743748155 * anInt11747 * i_4_ >> 12;
			int i_7_ = i_2_ * i_4_ >> 12;
			int i_8_ = i_7_ >> 12;
			int i_9_ = i_8_ + 1;
			if (i_9_ >= i_5_)
				i_9_ = 0;
			i_7_ &= 0xfff;
			int i_10_ = Class418.anIntArray4570[i_7_];
			int i_11_ = aByteArray11745[i_8_ & 0xff] & 0xff;
			int i_12_ = aByteArray11745[i_9_ & 0xff] & 0xff;
			if (aBool11751) {
				for (int i_13_ = 0; i_13_ < Class28.anInt258 * 1394024703; i_13_++) {
					int i_14_ = (anInt11747 * -743748155 * Class28.anIntArray254[i_13_]);
					int i_15_ = method10744(i_14_ * i_4_ >> 12, i_7_, i_11_, i_12_, i_10_, i_6_, -450458281);
					i_15_ = i_15_ * i_3_ >> 12;
					is[i_13_] = 2048 + (i_15_ >> 1);
				}
			} else {
				for (int i_16_ = 0; i_16_ < Class28.anInt258 * 1394024703; i_16_++) {
					int i_17_ = (-743748155 * anInt11747 * Class28.anIntArray254[i_16_]);
					int i_18_ = method10744(i_4_ * i_17_ >> 12, i_7_, i_11_, i_12_, i_10_, i_6_, 2137065486);
					is[i_16_] = i_18_ * i_3_ >> 12;
				}
			}
		} else {
			int i_19_ = aShortArray11752[0];
			if (i_19_ > 8 || i_19_ < -8) {
				int i_20_ = aShortArray11744[0] << 12;
				int i_21_ = -1030467477 * anInt11748 * i_20_ >> 12;
				int i_22_ = anInt11747 * -743748155 * i_20_ >> 12;
				int i_23_ = i_20_ * i_2_ >> 12;
				int i_24_ = i_23_ >> 12;
				int i_25_ = i_24_ + 1;
				if (i_25_ >= i_21_)
					i_25_ = 0;
				i_23_ &= 0xfff;
				int i_26_ = Class418.anIntArray4570[i_23_];
				int i_27_ = aByteArray11745[i_24_ & 0xff] & 0xff;
				int i_28_ = aByteArray11745[i_25_ & 0xff] & 0xff;
				for (int i_29_ = 0; i_29_ < Class28.anInt258 * 1394024703; i_29_++) {
					int i_30_ = (-743748155 * anInt11747 * Class28.anIntArray254[i_29_]);
					int i_31_ = method10744(i_30_ * i_20_ >> 12, i_23_, i_27_, i_28_, i_26_, i_22_, 251383472);
					is[i_29_] = i_19_ * i_31_ >> 12;
				}
			}
			for (int i_32_ = 1; i_32_ < anInt11738 * 27285161; i_32_++) {
				i_19_ = aShortArray11752[i_32_];
				if (i_19_ > 8 || i_19_ < -8) {
					int i_33_ = aShortArray11744[i_32_] << 12;
					int i_34_ = i_33_ * (anInt11748 * -1030467477) >> 12;
					int i_35_ = anInt11747 * -743748155 * i_33_ >> 12;
					int i_36_ = i_33_ * i_2_ >> 12;
					int i_37_ = i_36_ >> 12;
					int i_38_ = i_37_ + 1;
					if (i_38_ >= i_34_)
						i_38_ = 0;
					i_36_ &= 0xfff;
					int i_39_ = Class418.anIntArray4570[i_36_];
					int i_40_ = aByteArray11745[i_37_ & 0xff] & 0xff;
					int i_41_ = aByteArray11745[i_38_ & 0xff] & 0xff;
					if (aBool11751 && anInt11738 * 27285161 - 1 == i_32_) {
						for (int i_42_ = 0; i_42_ < Class28.anInt258 * 1394024703; i_42_++) {
							int i_43_ = (Class28.anIntArray254[i_42_] * (anInt11747 * -743748155));
							int i_44_ = method10744(i_33_ * i_43_ >> 12, i_36_, i_40_, i_41_, i_39_, i_35_, -592989835);
							i_44_ = (i_44_ * i_19_ >> 12) + is[i_42_];
							is[i_42_] = 2048 + (i_44_ >> 1);
						}
					} else {
						for (int i_45_ = 0; i_45_ < 1394024703 * Class28.anInt258; i_45_++) {
							int i_46_ = (anInt11747 * -743748155 * Class28.anIntArray254[i_45_]);
							int i_47_ = method10744(i_33_ * i_46_ >> 12, i_36_, i_40_, i_41_, i_39_, i_35_, -597418531);
							is[i_45_] += i_47_ * i_19_ >> 12;
						}
					}
				}
			}
		}
	}

	int method10744(int i, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_) {
		int i_54_ = i >> 12;
		int i_55_ = 1 + i_54_;
		if (i_55_ >= i_52_)
			i_55_ = 0;
		i &= 0xfff;
		i_54_ &= 0xff;
		i_55_ &= 0xff;
		int i_56_ = i - 4096;
		int i_57_ = i_48_ - 4096;
		int i_58_ = Class418.anIntArray4570[i];
		int i_59_ = aByteArray11745[i_49_ + i_54_] & 0x3;
		int i_60_;
		if (i_59_ <= 1)
			i_60_ = i_59_ == 0 ? i_48_ + i : i_48_ - i;
		else
			i_60_ = 2 == i_59_ ? i - i_48_ : -i - i_48_;
		i_59_ = aByteArray11745[i_49_ + i_55_] & 0x3;
		int i_61_;
		if (i_59_ <= 1)
			i_61_ = 0 == i_59_ ? i_48_ + i_56_ : i_48_ - i_56_;
		else
			i_61_ = i_59_ == 2 ? i_56_ - i_48_ : -i_56_ - i_48_;
		int i_62_ = i_60_ + (i_58_ * (i_61_ - i_60_) >> 12);
		i_59_ = aByteArray11745[i_54_ + i_50_] & 0x3;
		if (i_59_ <= 1)
			i_60_ = 0 == i_59_ ? i + i_57_ : i_57_ - i;
		else
			i_60_ = i_59_ == 2 ? i - i_57_ : -i - i_57_;
		i_59_ = aByteArray11745[i_50_ + i_55_] & 0x3;
		if (i_59_ <= 1)
			i_61_ = 0 == i_59_ ? i_56_ + i_57_ : i_57_ - i_56_;
		else
			i_61_ = 2 == i_59_ ? i_56_ - i_57_ : -i_56_ - i_57_;
		int i_63_ = i_60_ + ((i_61_ - i_60_) * i_58_ >> 12);
		return ((i_63_ - i_62_) * i_51_ >> 12) + i_62_;
	}

	void method10745(byte i) {
		aByteArray11745 = Class28.method766(anInt11749 * 1574009207, 1824559476);
		method10746(1961106591);
		for (int i_64_ = 27285161 * anInt11738 - 1; i_64_ >= 1; i_64_--) {
			short i_65_ = aShortArray11752[i_64_];
			if (i_65_ > 8 || i_65_ < -8)
				break;
			anInt11738 -= -1791185511;
		}
	}

	void method10746(int i) {
		if (-378093791 * anInt11750 > 0) {
			aShortArray11752 = new short[27285161 * anInt11738];
			aShortArray11744 = new short[27285161 * anInt11738];
			for (int i_66_ = 0; i_66_ < 27285161 * anInt11738; i_66_++) {
				aShortArray11752[i_66_] = (short) (int) (Math.pow((double) ((float) (anInt11750 * -378093791) / 4096.0F), (double) i_66_) * 4096.0);
				aShortArray11744[i_66_] = (short) (int) Math.pow(2.0, (double) i_66_);
			}
		} else if (aShortArray11752 != null && anInt11738 * 27285161 == aShortArray11752.length) {
			aShortArray11744 = new short[27285161 * anInt11738];
			for (int i_67_ = 0; i_67_ < 27285161 * anInt11738; i_67_++)
				aShortArray11744[i_67_] = (short) (int) Math.pow(2.0, (double) i_67_);
		}
	}

	void method10747() {
		if (-378093791 * anInt11750 > 0) {
			aShortArray11752 = new short[27285161 * anInt11738];
			aShortArray11744 = new short[27285161 * anInt11738];
			for (int i = 0; i < 27285161 * anInt11738; i++) {
				aShortArray11752[i] = (short) (int) (Math.pow((double) ((float) (anInt11750 * -378093791) / 4096.0F), (double) i) * 4096.0);
				aShortArray11744[i] = (short) (int) Math.pow(2.0, (double) i);
			}
		} else if (aShortArray11752 != null && anInt11738 * 27285161 == aShortArray11752.length) {
			aShortArray11744 = new short[27285161 * anInt11738];
			for (int i = 0; i < 27285161 * anInt11738; i++)
				aShortArray11744[i] = (short) (int) Math.pow(2.0, (double) i);
		}
	}

	void method10748() {
		if (-378093791 * anInt11750 > 0) {
			aShortArray11752 = new short[27285161 * anInt11738];
			aShortArray11744 = new short[27285161 * anInt11738];
			for (int i = 0; i < 27285161 * anInt11738; i++) {
				aShortArray11752[i] = (short) (int) (Math.pow((double) ((float) (anInt11750 * -378093791) / 4096.0F), (double) i) * 4096.0);
				aShortArray11744[i] = (short) (int) Math.pow(2.0, (double) i);
			}
		} else if (aShortArray11752 != null && anInt11738 * 27285161 == aShortArray11752.length) {
			aShortArray11744 = new short[27285161 * anInt11738];
			for (int i = 0; i < 27285161 * anInt11738; i++)
				aShortArray11744[i] = (short) (int) Math.pow(2.0, (double) i);
		}
	}

	void method10749() {
		if (-378093791 * anInt11750 > 0) {
			aShortArray11752 = new short[27285161 * anInt11738];
			aShortArray11744 = new short[27285161 * anInt11738];
			for (int i = 0; i < 27285161 * anInt11738; i++) {
				aShortArray11752[i] = (short) (int) (Math.pow((double) ((float) (anInt11750 * -378093791) / 4096.0F), (double) i) * 4096.0);
				aShortArray11744[i] = (short) (int) Math.pow(2.0, (double) i);
			}
		} else if (aShortArray11752 != null && anInt11738 * 27285161 == aShortArray11752.length) {
			aShortArray11744 = new short[27285161 * anInt11738];
			for (int i = 0; i < 27285161 * anInt11738; i++)
				aShortArray11744[i] = (short) (int) Math.pow(2.0, (double) i);
		}
	}

	void method10750() {
		if (-378093791 * anInt11750 > 0) {
			aShortArray11752 = new short[27285161 * anInt11738];
			aShortArray11744 = new short[27285161 * anInt11738];
			for (int i = 0; i < 27285161 * anInt11738; i++) {
				aShortArray11752[i] = (short) (int) (Math.pow((double) ((float) (anInt11750 * -378093791) / 4096.0F), (double) i) * 4096.0);
				aShortArray11744[i] = (short) (int) Math.pow(2.0, (double) i);
			}
		} else if (aShortArray11752 != null && anInt11738 * 27285161 == aShortArray11752.length) {
			aShortArray11744 = new short[27285161 * anInt11738];
			for (int i = 0; i < 27285161 * anInt11738; i++)
				aShortArray11744[i] = (short) (int) Math.pow(2.0, (double) i);
		}
	}

	Class536_Sub39_Sub1() {
		super(0, true);
		anInt11747 = 502965300;
		anInt11748 = -874024692;
		anInt11738 = 1425192548;
		anInt11750 = -1947191386;
		aBool11751 = true;
	}
}
