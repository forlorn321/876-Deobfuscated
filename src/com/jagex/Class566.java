/* Class566 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class566 {
	int[] anIntArray7579;
	boolean aBool7580;
	static final int anInt7581 = 102;
	static final float aFloat7582 = 3.0F;
	int[] anIntArray7583;
	Class555 aClass555_7584;
	Class564 aClass564_7585;
	boolean aBool7586;
	int anInt7587;
	int anInt7588;
	int anInt7589;
	int anInt7590;
	Class560[] aClass560Array7591;
	int[][][] anIntArrayArrayArray7592;
	Class560[] aClass560Array7593;
	static final int anInt7594 = 10;
	Class560[] aClass560Array7595;
	float[] aFloatArray7596;
	Class560[] aClass560Array7597;
	int[] anIntArray7598;
	int anInt7599;
	int[] anIntArray7600;
	int anInt7601;
	int[] anIntArray7602;
	public boolean aBool7603 = true;
	static Class180 aClass180_7604;
	int[] anIntArray7605;
	int anInt7606;
	int anInt7607;
	int[] anIntArray7608;
	boolean aBool7609;

	boolean method9501(Class560 class560, int i) {
		if (!method9524(class560.anIntArray7544[i], class560.anIntArray7545[i], class560.anIntArray7543[i]))
			return false;
		class560.aShortArray7547[i] = (short) (int) aFloatArray7596[0];
		class560.aShortArray7548[i] = (short) (int) aFloatArray7596[1];
		class560.aShortArray7533[i] = (short) (int) aFloatArray7596[2];
		return true;
	}

	public void method9502(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		if (i == 8 || i == 16) {
			if (i == 8) {
				int i_5_ = i_1_ << aClass555_7584.anInt7421 * 1742303003;
				int i_6_ = i_5_ + aClass555_7584.anInt7422 * -1478371119;
				int i_7_ = i_2_ << aClass555_7584.anInt7421 * 1742303003;
				int i_8_ = i_7_ + aClass555_7584.anInt7422 * -1478371119;
				int i_9_ = aClass555_7584.aClass161Array7457[i_0_].method2595(i_1_, i_2_, (byte) 66);
				int i_10_ = aClass555_7584.aClass161Array7457[i_0_].method2595(i_1_ + 1, i_2_ + 1, (byte) 88);
				aClass560Array7595[anInt7606++] = new Class560(aClass555_7584, i, i_0_, i_5_, i_6_, i_6_, i_5_, i_9_, i_10_, i_10_ - i_3_, i_9_ - i_3_, i_7_, i_8_, i_8_, i_7_);
			} else {
				int i_11_ = ((i_1_ << aClass555_7584.anInt7421 * 1742303003) + aClass555_7584.anInt7422 * -1478371119);
				int i_12_ = i_11_ - aClass555_7584.anInt7422 * -1478371119;
				int i_13_ = i_2_ << aClass555_7584.anInt7421 * 1742303003;
				int i_14_ = i_13_ + aClass555_7584.anInt7422 * -1478371119;
				int i_15_ = aClass555_7584.aClass161Array7457[i_0_].method2595(i_1_ + 1, i_2_, (byte) 57);
				int i_16_ = aClass555_7584.aClass161Array7457[i_0_].method2595(i_1_, i_2_ + 1, (byte) 55);
				aClass560Array7595[anInt7606++] = new Class560(aClass555_7584, i, i_0_, i_11_, i_12_, i_12_, i_11_, i_15_, i_16_, i_16_ - i_3_, i_15_ - i_3_, i_13_, i_14_, i_14_, i_13_);
			}
		} else {
			Class561 class561 = (aClass555_7584.aClass561ArrayArrayArray7426[i_0_][i_1_][i_2_]);
			if (class561 == null)
				aClass555_7584.aClass561ArrayArrayArray7426[i_0_][i_1_][i_2_] = class561 = new Class561(i_0_);
			if (i == 1) {
				class561.aShort7559 = (short) i_3_;
				class561.aShort7560 = (short) i_4_;
			} else if (i == 2) {
				class561.aShort7561 = (short) i_3_;
				class561.aShort7551 = (short) i_4_;
			}
			if (aBool7586)
				method9505();
		}
	}

	public void method9503(int i, int i_17_, int i_18_, int i_19_) {
		if (i == 8 || i == 16) {
			for (int i_20_ = 0; i_20_ < anInt7606; i_20_++) {
				Class560 class560 = aClass560Array7595[i_20_];
				if (class560.aByte7535 == i && class560.aByte7539 == i_17_ && ((class560.aShort7540 == i_18_ && class560.aShort7537 == i_19_) || (class560.aShort7541 == i_18_ && class560.aShort7538 == i_19_))) {
					if (i_20_ != anInt7606)
						System.arraycopy(aClass560Array7595, i_20_ + 1, aClass560Array7595, i_20_, aClass560Array7595.length - (i_20_ + 1));
					anInt7606--;
					break;
				}
			}
		} else {
			Class561 class561 = (aClass555_7584.aClass561ArrayArrayArray7426[i_17_][i_18_][i_19_]);
			if (class561 != null) {
				if (i == 1)
					class561.aShort7559 = (short) 0;
				else if (i == 2)
					class561.aShort7561 = (short) 0;
			}
			method9505();
		}
	}

	public void method9504() {
		method9505();
	}

	void method9505() {
		for (int i = 0; i < anInt7589; i++)
			aClass560Array7593[i] = null;
		anInt7589 = 0;
		for (int i = 0; i < aClass555_7584.anInt7466 * -1609909485; i++) {
			for (int i_21_ = 0; i_21_ < aClass555_7584.anInt7443 * -547681223; i_21_++) {
				for (int i_22_ = 0; i_22_ < aClass555_7584.anInt7432 * -1437024153; i_22_++) {
					Class561 class561 = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_22_][i_21_]);
					if (class561 != null) {
						if (class561.aShort7559 > 0)
							class561.aShort7559 *= -1;
						if (class561.aShort7561 > 0)
							class561.aShort7561 *= -1;
					}
				}
			}
		}
		for (int i = 0; i < aClass555_7584.anInt7466 * -1609909485; i++) {
			for (int i_23_ = 0; i_23_ < aClass555_7584.anInt7443 * -547681223; i_23_++) {
				for (int i_24_ = 0; i_24_ < aClass555_7584.anInt7432 * -1437024153; i_24_++) {
					Class561 class561 = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_24_][i_23_]);
					if (class561 != null) {
						boolean bool = ((aClass555_7584.aClass561ArrayArrayArray7426[0][i_24_][i_23_]) != null && (aClass555_7584.aClass561ArrayArrayArray7426[0][i_24_][i_23_].aClass561_7554) != null);
						if (class561.aShort7559 < 0) {
							int i_25_ = i_23_;
							int i_26_ = i_23_;
							int i_27_ = i;
							int i_28_ = i;
							Class561 class561_29_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_24_][i_25_ - 1]);
							int i_30_;
							for (i_30_ = (aClass555_7584.aClass161Array7457[i].method2595(i_24_, i_23_, (byte) 82)); (i_25_ > 0 && class561_29_ != null && class561_29_.aShort7559 < 0 && (class561_29_.aShort7559 == class561.aShort7559) && (class561_29_.aShort7560 == class561.aShort7560) && i_30_ == (aClass555_7584.aClass161Array7457[i].method2595(i_24_, i_25_ - 1, (byte) 67)) && (i_25_ - 1 <= 0 || (i_30_ == (aClass555_7584.aClass161Array7457[i].method2595(i_24_, i_25_ - 2, (byte) 42))))
									&& i_26_ - i_25_ <= 10); class561_29_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_24_][i_25_ - 1]))
								i_25_--;
							for (class561_29_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_24_][i_26_ + 1]); ((i_26_ < aClass555_7584.anInt7432 * -1437024153) && class561_29_ != null && class561_29_.aShort7559 < 0 && (class561_29_.aShort7559 == class561.aShort7559) && (class561_29_.aShort7560 == class561.aShort7560) && i_30_ == (aClass555_7584.aClass161Array7457[i].method2595(i_24_, i_26_ + 1, (byte) 87))
									&& (i_26_ + 1 >= (aClass555_7584.anInt7432 * -1437024153) || (i_30_ == (aClass555_7584.aClass161Array7457[i].method2595(i_24_, i_26_ + 2, (byte) 122)))) && i_26_ - i_25_ <= 10); class561_29_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_24_][i_26_ + 1]))
								i_26_++;
							int i_31_ = i_28_ - i_27_ + 1;
							int i_32_ = aClass555_7584.aClass161Array7457[bool ? i_27_ + 1 : i_27_].method2595(i_24_, i_25_, (byte) 48);
							int i_33_ = i_32_ + class561.aShort7559 * i_31_;
							int i_34_ = aClass555_7584.aClass161Array7457[bool ? i_27_ + 1 : i_27_].method2595(i_24_, i_26_ + 1, (byte) 33);
							int i_35_ = i_34_ + class561.aShort7559 * i_31_;
							int i_36_ = (i_24_ << aClass555_7584.anInt7421 * 1742303003);
							int i_37_ = (i_25_ << aClass555_7584.anInt7421 * 1742303003);
							int i_38_ = ((i_26_ << aClass555_7584.anInt7421 * 1742303003) + aClass555_7584.anInt7422 * -1478371119);
							aClass560Array7593[anInt7589++] = new Class560(aClass555_7584, 1, i_28_, i_36_ + class561.aShort7560, i_36_ + class561.aShort7560, i_36_ + class561.aShort7560, i_36_ + class561.aShort7560, i_32_, i_34_, i_35_, i_33_, i_37_, i_38_, i_38_, i_37_);
							for (int i_39_ = i_27_; i_39_ <= i_28_; i_39_++) {
								for (int i_40_ = i_25_; i_40_ <= i_26_; i_40_++)
									aClass555_7584.aClass561ArrayArrayArray7426[i_39_][i_24_][i_40_].aShort7559 *= -1;
							}
						}
						if (class561.aShort7561 < 0) {
							int i_41_ = i_24_;
							int i_42_ = i_24_;
							int i_43_ = i;
							int i_44_ = i;
							Class561 class561_45_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_41_ - 1][i_23_]);
							int i_46_;
							for (i_46_ = (aClass555_7584.aClass161Array7457[i].method2595(i_24_, i_23_, (byte) 32)); (i_41_ > 0 && class561_45_ != null && class561_45_.aShort7561 < 0 && (class561_45_.aShort7561 == class561.aShort7561) && (class561_45_.aShort7551 == class561.aShort7551) && i_46_ == (aClass555_7584.aClass161Array7457[i].method2595(i_41_ - 1, i_23_, (byte) 20)) && (i_41_ - 1 <= 0 || (i_46_ == (aClass555_7584.aClass161Array7457[i].method2595(i_41_ - 2, i_23_, (byte) 51))))
									&& i_42_ - i_41_ <= 10); class561_45_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_41_ - 1][i_23_]))
								i_41_--;
							for (class561_45_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_42_ + 1][i_23_]); (i_42_ < aClass555_7584.anInt7443 * -547681223 && class561_45_ != null && class561_45_.aShort7561 < 0 && (class561_45_.aShort7561 == class561.aShort7561) && (class561_45_.aShort7551 == class561.aShort7551) && i_46_ == (aClass555_7584.aClass161Array7457[i].method2595(i_42_ + 1, i_23_, (byte) 92))
									&& (i_42_ + 1 >= (aClass555_7584.anInt7443 * -547681223) || (i_46_ == (aClass555_7584.aClass161Array7457[i].method2595(i_42_ + 2, i_23_, (byte) 86)))) && i_42_ - i_41_ <= 10); class561_45_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_42_ + 1][i_23_]))
								i_42_++;
							int i_47_ = i_44_ - i_43_ + 1;
							int i_48_ = aClass555_7584.aClass161Array7457[bool ? i_43_ + 1 : i_43_].method2595(i_41_, i_23_, (byte) 101);
							int i_49_ = i_48_ + class561.aShort7561 * i_47_;
							int i_50_ = aClass555_7584.aClass161Array7457[bool ? i_43_ + 1 : i_43_].method2595(i_42_ + 1, i_23_, (byte) 81);
							int i_51_ = i_50_ + class561.aShort7561 * i_47_;
							int i_52_ = (i_41_ << aClass555_7584.anInt7421 * 1742303003);
							int i_53_ = ((i_42_ << aClass555_7584.anInt7421 * 1742303003) + aClass555_7584.anInt7422 * -1478371119);
							int i_54_ = (i_23_ << aClass555_7584.anInt7421 * 1742303003);
							aClass560Array7593[anInt7589++] = new Class560(aClass555_7584, 2, i_44_, i_52_, i_53_, i_53_, i_52_, i_48_, i_50_, i_51_, i_49_, i_54_ + class561.aShort7551, i_54_ + class561.aShort7551, i_54_ + class561.aShort7551, i_54_ + class561.aShort7551);
							for (int i_55_ = i_43_; i_55_ <= i_44_; i_55_++) {
								for (int i_56_ = i_41_; i_56_ <= i_42_; i_56_++)
									aClass555_7584.aClass561ArrayArrayArray7426[i_55_][i_56_][i_23_].aShort7561 *= -1;
							}
						}
					}
				}
			}
		}
		aBool7586 = true;
	}

	public void method9506(int i, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_) {
		aClass560Array7591[anInt7599++] = new Class560(aClass555_7584, i, i_57_, i_58_, i_59_, i_59_, i_58_, i_62_, i_63_, i_63_, i_62_, i_60_, i_60_, i_61_, i_61_);
	}

	void method9507(Class180 class180, int i) {
		aClass180_7604 = class180;
		if (!aBool7603 || !aBool7580)
			anInt7590 = 0;
		else {
			if (aBool7609)
				aClass555_7584.aClass67_7438.method1472((byte) -36);
			aClass180_7604.method3098(anIntArray7579);
			if (anInt7607 != (int) ((float) anIntArray7579[0] / 3.0F) || anInt7601 != (int) ((float) anIntArray7579[1] / 3.0F)) {
				anInt7607 = (int) ((float) anIntArray7579[0] / 3.0F);
				anInt7601 = (int) ((float) anIntArray7579[1] / 3.0F);
				anIntArray7583 = new int[anInt7607 * anInt7601];
			}
			anInt7590 = 0;
			for (int i_64_ = 0; i_64_ < anInt7599; i_64_++)
				method9548(aClass180_7604, aClass560Array7591[i_64_], i);
			for (int i_65_ = 0; i_65_ < anInt7589; i_65_++)
				method9548(aClass180_7604, aClass560Array7593[i_65_], i);
			for (int i_66_ = 0; i_66_ < anInt7606; i_66_++)
				method9548(aClass180_7604, aClass560Array7595[i_66_], i);
			aClass564_7585.anInt7576 = 0;
			if (anInt7590 > 0) {
				int i_67_ = anIntArray7583.length;
				int i_68_ = i_67_ - i_67_ & 0x7;
				int i_69_ = 0;
				while (i_69_ < i_68_) {
					anIntArray7583[i_69_++] = 2147483647;
					anIntArray7583[i_69_++] = 2147483647;
					anIntArray7583[i_69_++] = 2147483647;
					anIntArray7583[i_69_++] = 2147483647;
					anIntArray7583[i_69_++] = 2147483647;
					anIntArray7583[i_69_++] = 2147483647;
					anIntArray7583[i_69_++] = 2147483647;
					anIntArray7583[i_69_++] = 2147483647;
				}
				while (i_69_ < i_67_)
					anIntArray7583[i_69_++] = 2147483647;
				aClass564_7585.anInt7575 = 1;
				for (int i_70_ = 0; i_70_ < anInt7590; i_70_++) {
					Class560 class560 = aClass560Array7597[i_70_];
					aClass564_7585.method9485(class560.aShortArray7548[0], class560.aShortArray7548[1], class560.aShortArray7548[3], class560.aShortArray7547[0], class560.aShortArray7547[1], class560.aShortArray7547[3], class560.aShortArray7533[0], class560.aShortArray7533[1], class560.aShortArray7533[3]);
					aClass564_7585.method9485(class560.aShortArray7548[1], class560.aShortArray7548[2], class560.aShortArray7548[3], class560.aShortArray7547[1], class560.aShortArray7547[2], class560.aShortArray7547[3], class560.aShortArray7533[1], class560.aShortArray7533[2], class560.aShortArray7533[3]);
				}
				aClass564_7585.anInt7575 = 2;
			}
			if (aBool7609)
				aClass555_7584.aClass67_7438.method1472((byte) -32);
		}
	}

	boolean method9508(int i, int i_71_, int i_72_, int i_73_, int i_74_, Class549 class549) {
		if (!aBool7603 || !aBool7580)
			return false;
		if (aClass564_7585.anInt7576 < 102)
			return false;
		if (i_71_ < 0 || i_73_ < 0 || i_72_ >= anIntArrayArrayArray7592[i].length || i_74_ >= anIntArrayArrayArray7592[i][i_71_].length)
			return false;
		if (i_71_ == i_72_ && i_73_ == i_74_) {
			if (!method9549(i, i_71_, i_73_))
				return false;
			if (method9515(class549))
				return true;
			return false;
		}
		for (int i_75_ = i_71_; i_75_ <= i_72_; i_75_++) {
			for (int i_76_ = i_73_; i_76_ <= i_74_; i_76_++) {
				if (anIntArrayArrayArray7592[i][i_75_][i_76_] == -(aClass555_7584.anInt7429 * -1690479805))
					return false;
			}
		}
		if (!method9515(class549))
			return false;
		return true;
	}

	boolean method9509(Class560 class560, int i) {
		if (!method9524(class560.anIntArray7544[i], class560.anIntArray7545[i], class560.anIntArray7543[i]))
			return false;
		class560.aShortArray7547[i] = (short) (int) aFloatArray7596[0];
		class560.aShortArray7548[i] = (short) (int) aFloatArray7596[1];
		class560.aShortArray7533[i] = (short) (int) aFloatArray7596[2];
		return true;
	}

	public void method9510(int i, int i_77_, int i_78_, int i_79_) {
		if (i == 8 || i == 16) {
			for (int i_80_ = 0; i_80_ < anInt7606; i_80_++) {
				Class560 class560 = aClass560Array7595[i_80_];
				if (class560.aByte7535 == i && class560.aByte7539 == i_77_ && ((class560.aShort7540 == i_78_ && class560.aShort7537 == i_79_) || (class560.aShort7541 == i_78_ && class560.aShort7538 == i_79_))) {
					if (i_80_ != anInt7606)
						System.arraycopy(aClass560Array7595, i_80_ + 1, aClass560Array7595, i_80_, aClass560Array7595.length - (i_80_ + 1));
					anInt7606--;
					break;
				}
			}
		} else {
			Class561 class561 = (aClass555_7584.aClass561ArrayArrayArray7426[i_77_][i_78_][i_79_]);
			if (class561 != null) {
				if (i == 1)
					class561.aShort7559 = (short) 0;
				else if (i == 2)
					class561.aShort7561 = (short) 0;
			}
			method9505();
		}
	}

	void method9511(Class180 class180, Class560 class560, int i) {
		aClass180_7604 = class180;
		if (anIntArray7598 != null && class560.aByte7539 >= i) {
			for (int i_81_ = 0; i_81_ < anIntArray7598.length; i_81_++) {
				if (anIntArray7598[i_81_] != -1000000 && (class560.anIntArray7545[0] <= anIntArray7598[i_81_] || class560.anIntArray7545[1] <= anIntArray7598[i_81_] || class560.anIntArray7545[2] <= anIntArray7598[i_81_] || class560.anIntArray7545[3] <= anIntArray7598[i_81_]) && (class560.anIntArray7544[0] <= anIntArray7600[i_81_] || class560.anIntArray7544[1] <= anIntArray7600[i_81_] || class560.anIntArray7544[2] <= anIntArray7600[i_81_] || class560.anIntArray7544[3] <= anIntArray7600[i_81_])
						&& (class560.anIntArray7544[0] >= anIntArray7605[i_81_] || class560.anIntArray7544[1] >= anIntArray7605[i_81_] || class560.anIntArray7544[2] >= anIntArray7605[i_81_] || class560.anIntArray7544[3] >= anIntArray7605[i_81_]) && (class560.anIntArray7543[0] <= anIntArray7608[i_81_] || class560.anIntArray7543[1] <= anIntArray7608[i_81_] || class560.anIntArray7543[2] <= anIntArray7608[i_81_] || class560.anIntArray7543[3] <= anIntArray7608[i_81_])
						&& (class560.anIntArray7543[0] >= anIntArray7602[i_81_] || class560.anIntArray7543[1] >= anIntArray7602[i_81_] || class560.anIntArray7543[2] >= anIntArray7602[i_81_] || (class560.anIntArray7543[3] >= anIntArray7602[i_81_])))
					return;
			}
		}
		if (class560.aByte7535 == 1) {
			int i_82_ = (class560.aShort7540 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
			if (i_82_ >= 0 && i_82_ <= (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325)) {
				int i_83_ = (class560.aShort7537 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_83_ < 0)
					i_83_ = 0;
				else if (i_83_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					return;
				int i_84_ = (class560.aShort7538 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_84_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					i_84_ = (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325);
				else if (i_84_ < 0)
					return;
				boolean bool = false;
				while_28_: do {
					do {
						if (i_83_ > i_84_)
							break while_28_;
					} while (!aClass555_7584.aBoolArrayArray7467[i_82_][i_83_++]);
					bool = true;
				} while (false);
				if (bool) {
					float f = (float) (aClass555_7584.anInt7459 * 120302175 - class560.anIntArray7544[0]);
					if (f < 0.0F)
						f *= -1.0F;
					if (!(f < (float) anInt7587) && method9509(class560, 0) && method9509(class560, 1) && method9509(class560, 2) && method9509(class560, 3))
						aClass560Array7597[anInt7590++] = class560;
				}
			}
		} else if (class560.aByte7535 == 2) {
			int i_85_ = (class560.aShort7537 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
			if (i_85_ >= 0 && i_85_ <= (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325)) {
				int i_86_ = (class560.aShort7540 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
				if (i_86_ < 0)
					i_86_ = 0;
				else if (i_86_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					return;
				int i_87_ = (class560.aShort7541 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
				if (i_87_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					i_87_ = (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325);
				else if (i_87_ < 0)
					return;
				boolean bool = false;
				while_29_: do {
					do {
						if (i_86_ > i_87_)
							break while_29_;
					} while (!aClass555_7584.aBoolArrayArray7467[i_86_++][i_85_]);
					bool = true;
				} while (false);
				if (bool) {
					float f = (float) (aClass555_7584.anInt7460 * 2047098835 - class560.anIntArray7543[0]);
					if (f < 0.0F)
						f *= -1.0F;
					if (!(f < (float) anInt7587) && method9509(class560, 0) && method9509(class560, 1) && method9509(class560, 2) && method9509(class560, 3))
						aClass560Array7597[anInt7590++] = class560;
				}
			}
		} else if (class560.aByte7535 == 16 || class560.aByte7535 == 8) {
			int i_88_ = (class560.aShort7540 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
			if (i_88_ >= 0 && i_88_ <= (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325)) {
				int i_89_ = (class560.aShort7537 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_89_ >= 0 && i_89_ <= (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325) && aClass555_7584.aBoolArrayArray7467[i_88_][i_89_]) {
					float f = (float) (aClass555_7584.anInt7459 * 120302175 - class560.anIntArray7544[0]);
					if (f < 0.0F)
						f *= -1.0F;
					float f_90_ = (float) (aClass555_7584.anInt7460 * 2047098835 - class560.anIntArray7543[0]);
					if (f_90_ < 0.0F)
						f_90_ *= -1.0F;
					if ((!(f < (float) anInt7587) || !(f_90_ < (float) anInt7587)) && method9509(class560, 0) && method9509(class560, 1) && method9509(class560, 2) && method9509(class560, 3))
						aClass560Array7597[anInt7590++] = class560;
				}
			}
		} else if (class560.aByte7535 == 4) {
			float f = (float) (class560.anIntArray7545[0] - aClass555_7584.anInt7461 * -1990869435);
			if (!(f <= (float) anInt7588)) {
				int i_91_ = (class560.aShort7537 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_91_ < 0)
					i_91_ = 0;
				else if (i_91_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					return;
				int i_92_ = (class560.aShort7538 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_92_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					i_92_ = (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325);
				else if (i_92_ < 0)
					return;
				int i_93_ = (class560.aShort7540 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
				if (i_93_ < 0)
					i_93_ = 0;
				else if (i_93_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					return;
				int i_94_ = (class560.aShort7541 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
				if (i_94_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					i_94_ = (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325);
				else if (i_94_ < 0)
					return;
				boolean bool = false;
				while_30_: for (int i_95_ = i_93_; i_95_ <= i_94_; i_95_++) {
					for (int i_96_ = i_91_; i_96_ <= i_92_; i_96_++) {
						if (aClass555_7584.aBoolArrayArray7467[i_95_][i_96_]) {
							bool = true;
							break while_30_;
						}
					}
				}
				if (bool && method9509(class560, 0) && method9509(class560, 1) && method9509(class560, 2) && method9509(class560, 3))
					aClass560Array7597[anInt7590++] = class560;
			}
		}
	}

	boolean method9512(Class640_Sub1_Sub3 class640_sub1_sub3, int i, int i_97_, int i_98_) {
		if (!aBool7603 || !aBool7580)
			return false;
		if (aClass564_7585.anInt7576 < 102)
			return false;
		if (!method9549(i, i_97_, i_98_))
			return false;
		int i_99_ = i_97_ << aClass555_7584.anInt7421 * 1742303003;
		int i_100_ = i_98_ << aClass555_7584.anInt7421 * 1742303003;
		int i_101_ = (aClass555_7584.aClass161Array7434[i].method2595(i_97_, i_98_, (byte) 56) - 1);
		int i_102_ = i_101_ + class640_sub1_sub3.method17047(1004008254);
		if (class640_sub1_sub3.aShort11859 == 1) {
			if (!method9517(i_99_, i_101_, i_100_, i_99_, i_102_, i_100_, i_99_, i_102_, i_100_ + aClass555_7584.anInt7422 * -1478371119))
				return false;
			if (!method9517(i_99_, i_101_, i_100_, i_99_, i_102_, i_100_ + aClass555_7584.anInt7422 * -1478371119, i_99_, i_101_, i_100_ + aClass555_7584.anInt7422 * -1478371119))
				return false;
			return true;
		}
		if (class640_sub1_sub3.aShort11859 == 2) {
			if (!method9517(i_99_, i_101_, i_100_ + aClass555_7584.anInt7422 * -1478371119, i_99_ + aClass555_7584.anInt7422 * -1478371119, i_102_, i_100_ + aClass555_7584.anInt7422 * -1478371119, i_99_, i_102_, i_100_ + aClass555_7584.anInt7422 * -1478371119))
				return false;
			if (!method9517(i_99_, i_101_, i_100_ + aClass555_7584.anInt7422 * -1478371119, i_99_ + aClass555_7584.anInt7422 * -1478371119, i_101_, i_100_ + aClass555_7584.anInt7422 * -1478371119, i_99_ + aClass555_7584.anInt7422 * -1478371119, i_102_, i_100_ + aClass555_7584.anInt7422 * -1478371119))
				return false;
			return true;
		}
		if (class640_sub1_sub3.aShort11859 == 4) {
			if (!method9517(i_99_ + aClass555_7584.anInt7422 * -1478371119, i_101_, i_100_, i_99_ + aClass555_7584.anInt7422 * -1478371119, i_102_, i_100_, i_99_ + aClass555_7584.anInt7422 * -1478371119, i_102_, i_100_ + aClass555_7584.anInt7422 * -1478371119))
				return false;
			if (!method9517(i_99_ + aClass555_7584.anInt7422 * -1478371119, i_101_, i_100_, i_99_ + aClass555_7584.anInt7422 * -1478371119, i_102_, i_100_ + aClass555_7584.anInt7422 * -1478371119, i_99_ + aClass555_7584.anInt7422 * -1478371119, i_101_, i_100_ + aClass555_7584.anInt7422 * -1478371119))
				return false;
			return true;
		}
		if (class640_sub1_sub3.aShort11859 == 8) {
			if (!method9517(i_99_, i_101_, i_100_, i_99_ + aClass555_7584.anInt7422 * -1478371119, i_102_, i_100_, i_99_, i_102_, i_100_))
				return false;
			if (!method9517(i_99_, i_101_, i_100_, i_99_ + aClass555_7584.anInt7422 * -1478371119, i_101_, i_100_, i_99_ + aClass555_7584.anInt7422 * -1478371119, i_102_, i_100_))
				return false;
			return true;
		}
		if (class640_sub1_sub3.aShort11859 == 16) {
			if (!method9516(i_99_, i_101_, i_100_ + aClass555_7584.anInt7471 * -1485744437, aClass555_7584.anInt7471 * -1485744437, i_102_, aClass555_7584.anInt7471 * -1485744437))
				return false;
			return true;
		}
		if (class640_sub1_sub3.aShort11859 == 32) {
			if (!method9516(i_99_ + aClass555_7584.anInt7471 * -1485744437, i_101_, i_100_ + aClass555_7584.anInt7471 * -1485744437, aClass555_7584.anInt7471 * -1485744437, i_102_, aClass555_7584.anInt7471 * -1485744437))
				return false;
			return true;
		}
		if (class640_sub1_sub3.aShort11859 == 64) {
			if (!method9516(i_99_ + aClass555_7584.anInt7471 * -1485744437, i_101_, i_100_, aClass555_7584.anInt7471 * -1485744437, i_102_, aClass555_7584.anInt7471 * -1485744437))
				return false;
			return true;
		}
		if (class640_sub1_sub3.aShort11859 == 128) {
			if (!method9516(i_99_, i_101_, i_100_, aClass555_7584.anInt7471 * -1485744437, i_102_, aClass555_7584.anInt7471 * -1485744437))
				return false;
			return true;
		}
		return true;
	}

	boolean method9513(int i, int i_103_, int i_104_, int i_105_) {
		if (!aBool7603 || !aBool7580)
			return false;
		if (aClass564_7585.anInt7576 < 102)
			return false;
		if (!method9549(i, i_103_, i_104_))
			return false;
		int i_106_ = i_103_ << aClass555_7584.anInt7421 * 1742303003;
		int i_107_ = i_104_ << aClass555_7584.anInt7421 * 1742303003;
		if (method9516(i_106_, aClass555_7584.aClass161Array7434[i].method2595(i_103_, i_104_, (byte) 51), i_107_, aClass555_7584.anInt7422 * -1478371119, i_105_, aClass555_7584.anInt7422 * -1478371119))
			return true;
		return false;
	}

	final boolean method9514(int i, int i_108_, int i_109_) {
		aClass180_7604.method3333((float) i, (float) i_108_, (float) i_109_, aFloatArray7596);
		if (aFloatArray7596[2] < 50.0F)
			return false;
		aFloatArray7596[0] /= 3.0F;
		aFloatArray7596[1] /= 3.0F;
		return true;
	}

	final boolean method9515(Class549 class549) {
		if (class549 == null)
			return false;
		return method9516(class549.anInt7280, class549.anInt7282, class549.anInt7279, class549.anInt7284 - class549.anInt7280, class549.anInt7283 - class549.anInt7282, class549.anInt7285 - class549.anInt7279);
	}

	final boolean method9516(int i, int i_110_, int i_111_, int i_112_, int i_113_, int i_114_) {
		int i_115_ = i + i_112_;
		int i_116_ = i_110_ + i_113_;
		int i_117_ = i_111_ + i_114_;
		if (!method9517(i, i_116_, i_111_, i_115_, i_116_, i_117_, i, i_116_, i_117_))
			return false;
		if (!method9517(i, i_116_, i_111_, i_115_, i_116_, i_111_, i_115_, i_116_, i_117_))
			return false;
		if (i < aClass555_7584.anInt7459 * 120302175) {
			if (!method9517(i, i_110_, i_117_, i, i_116_, i_111_, i, i_116_, i_117_))
				return false;
			if (!method9517(i, i_110_, i_117_, i, i_110_, i_111_, i, i_116_, i_111_))
				return false;
		} else {
			if (!method9517(i_115_, i_110_, i_117_, i_115_, i_116_, i_111_, i_115_, i_116_, i_117_))
				return false;
			if (!method9517(i_115_, i_110_, i_117_, i_115_, i_110_, i_111_, i_115_, i_116_, i_111_))
				return false;
		}
		if (i_111_ < aClass555_7584.anInt7460 * 2047098835) {
			if (!method9517(i, i_110_, i_111_, i_115_, i_116_, i_111_, i, i_116_, i_111_))
				return false;
			if (!method9517(i, i_110_, i_111_, i_115_, i_110_, i_111_, i_115_, i_116_, i_111_))
				return false;
		} else {
			if (!method9517(i, i_110_, i_117_, i_115_, i_116_, i_117_, i, i_116_, i_117_))
				return false;
			if (!method9517(i, i_110_, i_117_, i_115_, i_110_, i_117_, i_115_, i_116_, i_117_))
				return false;
		}
		return true;
	}

	final boolean method9517(int i, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_) {
		if (!method9524(i, i_118_, i_119_))
			return false;
		i = (int) aFloatArray7596[0];
		i_118_ = (int) aFloatArray7596[1];
		i_119_ = (int) aFloatArray7596[2];
		if (!method9524(i_120_, i_121_, i_122_))
			return false;
		i_120_ = (int) aFloatArray7596[0];
		i_121_ = (int) aFloatArray7596[1];
		i_122_ = (int) aFloatArray7596[2];
		if (!method9524(i_123_, i_124_, i_125_))
			return false;
		i_123_ = (int) aFloatArray7596[0];
		i_124_ = (int) aFloatArray7596[1];
		i_125_ = (int) aFloatArray7596[2];
		return aClass564_7585.method9485(i_118_, i_121_, i_124_, i, i_120_, i_123_, i_119_, i_122_, i_125_);
	}

	public void method9518(int i, int i_126_, int i_127_, int i_128_, int i_129_, int i_130_) {
		if (i == 8 || i == 16) {
			if (i == 8) {
				int i_131_ = i_127_ << aClass555_7584.anInt7421 * 1742303003;
				int i_132_ = i_131_ + aClass555_7584.anInt7422 * -1478371119;
				int i_133_ = i_128_ << aClass555_7584.anInt7421 * 1742303003;
				int i_134_ = i_133_ + aClass555_7584.anInt7422 * -1478371119;
				int i_135_ = aClass555_7584.aClass161Array7457[i_126_].method2595(i_127_, i_128_, (byte) 40);
				int i_136_ = aClass555_7584.aClass161Array7457[i_126_].method2595(i_127_ + 1, i_128_ + 1, (byte) 31);
				aClass560Array7595[anInt7606++] = new Class560(aClass555_7584, i, i_126_, i_131_, i_132_, i_132_, i_131_, i_135_, i_136_, i_136_ - i_129_, i_135_ - i_129_, i_133_, i_134_, i_134_, i_133_);
			} else {
				int i_137_ = ((i_127_ << aClass555_7584.anInt7421 * 1742303003) + aClass555_7584.anInt7422 * -1478371119);
				int i_138_ = i_137_ - aClass555_7584.anInt7422 * -1478371119;
				int i_139_ = i_128_ << aClass555_7584.anInt7421 * 1742303003;
				int i_140_ = i_139_ + aClass555_7584.anInt7422 * -1478371119;
				int i_141_ = aClass555_7584.aClass161Array7457[i_126_].method2595(i_127_ + 1, i_128_, (byte) 97);
				int i_142_ = aClass555_7584.aClass161Array7457[i_126_].method2595(i_127_, i_128_ + 1, (byte) 106);
				aClass560Array7595[anInt7606++] = new Class560(aClass555_7584, i, i_126_, i_137_, i_138_, i_138_, i_137_, i_141_, i_142_, i_142_ - i_129_, i_141_ - i_129_, i_139_, i_140_, i_140_, i_139_);
			}
		} else {
			Class561 class561 = (aClass555_7584.aClass561ArrayArrayArray7426[i_126_][i_127_][i_128_]);
			if (class561 == null)
				aClass555_7584.aClass561ArrayArrayArray7426[i_126_][i_127_][i_128_] = class561 = new Class561(i_126_);
			if (i == 1) {
				class561.aShort7559 = (short) i_129_;
				class561.aShort7560 = (short) i_130_;
			} else if (i == 2) {
				class561.aShort7561 = (short) i_129_;
				class561.aShort7551 = (short) i_130_;
			}
			if (aBool7586)
				method9505();
		}
	}

	public void method9519(int i, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_) {
		if (i == 8 || i == 16) {
			if (i == 8) {
				int i_148_ = i_144_ << aClass555_7584.anInt7421 * 1742303003;
				int i_149_ = i_148_ + aClass555_7584.anInt7422 * -1478371119;
				int i_150_ = i_145_ << aClass555_7584.anInt7421 * 1742303003;
				int i_151_ = i_150_ + aClass555_7584.anInt7422 * -1478371119;
				int i_152_ = aClass555_7584.aClass161Array7457[i_143_].method2595(i_144_, i_145_, (byte) 33);
				int i_153_ = aClass555_7584.aClass161Array7457[i_143_].method2595(i_144_ + 1, i_145_ + 1, (byte) 39);
				aClass560Array7595[anInt7606++] = new Class560(aClass555_7584, i, i_143_, i_148_, i_149_, i_149_, i_148_, i_152_, i_153_, i_153_ - i_146_, i_152_ - i_146_, i_150_, i_151_, i_151_, i_150_);
			} else {
				int i_154_ = ((i_144_ << aClass555_7584.anInt7421 * 1742303003) + aClass555_7584.anInt7422 * -1478371119);
				int i_155_ = i_154_ - aClass555_7584.anInt7422 * -1478371119;
				int i_156_ = i_145_ << aClass555_7584.anInt7421 * 1742303003;
				int i_157_ = i_156_ + aClass555_7584.anInt7422 * -1478371119;
				int i_158_ = aClass555_7584.aClass161Array7457[i_143_].method2595(i_144_ + 1, i_145_, (byte) 56);
				int i_159_ = aClass555_7584.aClass161Array7457[i_143_].method2595(i_144_, i_145_ + 1, (byte) 31);
				aClass560Array7595[anInt7606++] = new Class560(aClass555_7584, i, i_143_, i_154_, i_155_, i_155_, i_154_, i_158_, i_159_, i_159_ - i_146_, i_158_ - i_146_, i_156_, i_157_, i_157_, i_156_);
			}
		} else {
			Class561 class561 = (aClass555_7584.aClass561ArrayArrayArray7426[i_143_][i_144_][i_145_]);
			if (class561 == null)
				aClass555_7584.aClass561ArrayArrayArray7426[i_143_][i_144_][i_145_] = class561 = new Class561(i_143_);
			if (i == 1) {
				class561.aShort7559 = (short) i_146_;
				class561.aShort7560 = (short) i_147_;
			} else if (i == 2) {
				class561.aShort7561 = (short) i_146_;
				class561.aShort7551 = (short) i_147_;
			}
			if (aBool7586)
				method9505();
		}
	}

	public void method9520(int i, int i_160_, int i_161_, int i_162_, int i_163_, int i_164_) {
		if (i == 8 || i == 16) {
			if (i == 8) {
				int i_165_ = i_161_ << aClass555_7584.anInt7421 * 1742303003;
				int i_166_ = i_165_ + aClass555_7584.anInt7422 * -1478371119;
				int i_167_ = i_162_ << aClass555_7584.anInt7421 * 1742303003;
				int i_168_ = i_167_ + aClass555_7584.anInt7422 * -1478371119;
				int i_169_ = aClass555_7584.aClass161Array7457[i_160_].method2595(i_161_, i_162_, (byte) 91);
				int i_170_ = aClass555_7584.aClass161Array7457[i_160_].method2595(i_161_ + 1, i_162_ + 1, (byte) 5);
				aClass560Array7595[anInt7606++] = new Class560(aClass555_7584, i, i_160_, i_165_, i_166_, i_166_, i_165_, i_169_, i_170_, i_170_ - i_163_, i_169_ - i_163_, i_167_, i_168_, i_168_, i_167_);
			} else {
				int i_171_ = ((i_161_ << aClass555_7584.anInt7421 * 1742303003) + aClass555_7584.anInt7422 * -1478371119);
				int i_172_ = i_171_ - aClass555_7584.anInt7422 * -1478371119;
				int i_173_ = i_162_ << aClass555_7584.anInt7421 * 1742303003;
				int i_174_ = i_173_ + aClass555_7584.anInt7422 * -1478371119;
				int i_175_ = aClass555_7584.aClass161Array7457[i_160_].method2595(i_161_ + 1, i_162_, (byte) 63);
				int i_176_ = aClass555_7584.aClass161Array7457[i_160_].method2595(i_161_, i_162_ + 1, (byte) 100);
				aClass560Array7595[anInt7606++] = new Class560(aClass555_7584, i, i_160_, i_171_, i_172_, i_172_, i_171_, i_175_, i_176_, i_176_ - i_163_, i_175_ - i_163_, i_173_, i_174_, i_174_, i_173_);
			}
		} else {
			Class561 class561 = (aClass555_7584.aClass561ArrayArrayArray7426[i_160_][i_161_][i_162_]);
			if (class561 == null)
				aClass555_7584.aClass561ArrayArrayArray7426[i_160_][i_161_][i_162_] = class561 = new Class561(i_160_);
			if (i == 1) {
				class561.aShort7559 = (short) i_163_;
				class561.aShort7560 = (short) i_164_;
			} else if (i == 2) {
				class561.aShort7561 = (short) i_163_;
				class561.aShort7551 = (short) i_164_;
			}
			if (aBool7586)
				method9505();
		}
	}

	public void method9521(int i, int i_177_, int i_178_, int i_179_) {
		if (i == 8 || i == 16) {
			for (int i_180_ = 0; i_180_ < anInt7606; i_180_++) {
				Class560 class560 = aClass560Array7595[i_180_];
				if (class560.aByte7535 == i && class560.aByte7539 == i_177_ && ((class560.aShort7540 == i_178_ && class560.aShort7537 == i_179_) || (class560.aShort7541 == i_178_ && class560.aShort7538 == i_179_))) {
					if (i_180_ != anInt7606)
						System.arraycopy(aClass560Array7595, i_180_ + 1, aClass560Array7595, i_180_, aClass560Array7595.length - (i_180_ + 1));
					anInt7606--;
					break;
				}
			}
		} else {
			Class561 class561 = (aClass555_7584.aClass561ArrayArrayArray7426[i_177_][i_178_][i_179_]);
			if (class561 != null) {
				if (i == 1)
					class561.aShort7559 = (short) 0;
				else if (i == 2)
					class561.aShort7561 = (short) 0;
			}
			method9505();
		}
	}

	public void method9522(int i, int i_181_, int i_182_, int i_183_) {
		if (i == 8 || i == 16) {
			for (int i_184_ = 0; i_184_ < anInt7606; i_184_++) {
				Class560 class560 = aClass560Array7595[i_184_];
				if (class560.aByte7535 == i && class560.aByte7539 == i_181_ && ((class560.aShort7540 == i_182_ && class560.aShort7537 == i_183_) || (class560.aShort7541 == i_182_ && class560.aShort7538 == i_183_))) {
					if (i_184_ != anInt7606)
						System.arraycopy(aClass560Array7595, i_184_ + 1, aClass560Array7595, i_184_, aClass560Array7595.length - (i_184_ + 1));
					anInt7606--;
					break;
				}
			}
		} else {
			Class561 class561 = (aClass555_7584.aClass561ArrayArrayArray7426[i_181_][i_182_][i_183_]);
			if (class561 != null) {
				if (i == 1)
					class561.aShort7559 = (short) 0;
				else if (i == 2)
					class561.aShort7561 = (short) 0;
			}
			method9505();
		}
	}

	public void method9523(int i, int i_185_, int i_186_, int i_187_) {
		if (i == 8 || i == 16) {
			for (int i_188_ = 0; i_188_ < anInt7606; i_188_++) {
				Class560 class560 = aClass560Array7595[i_188_];
				if (class560.aByte7535 == i && class560.aByte7539 == i_185_ && ((class560.aShort7540 == i_186_ && class560.aShort7537 == i_187_) || (class560.aShort7541 == i_186_ && class560.aShort7538 == i_187_))) {
					if (i_188_ != anInt7606)
						System.arraycopy(aClass560Array7595, i_188_ + 1, aClass560Array7595, i_188_, aClass560Array7595.length - (i_188_ + 1));
					anInt7606--;
					break;
				}
			}
		} else {
			Class561 class561 = (aClass555_7584.aClass561ArrayArrayArray7426[i_185_][i_186_][i_187_]);
			if (class561 != null) {
				if (i == 1)
					class561.aShort7559 = (short) 0;
				else if (i == 2)
					class561.aShort7561 = (short) 0;
			}
			method9505();
		}
	}

	final boolean method9524(int i, int i_189_, int i_190_) {
		aClass180_7604.method3333((float) i, (float) i_189_, (float) i_190_, aFloatArray7596);
		if (aFloatArray7596[2] < 50.0F)
			return false;
		aFloatArray7596[0] /= 3.0F;
		aFloatArray7596[1] /= 3.0F;
		return true;
	}

	public void method9525() {
		method9505();
	}

	public void method9526() {
		method9505();
	}

	public void method9527() {
		method9505();
	}

	public void method9528() {
		method9505();
	}

	Class566(Class555 class555) {
		aBool7580 = true;
		aBool7586 = false;
		anInt7590 = 0;
		aFloatArray7596 = new float[3];
		anIntArray7579 = new int[2];
		anInt7607 = -1;
		anInt7601 = -1;
		aBool7609 = true;
		anInt7587 = class555.anInt7422 * -1478371119;
		anInt7588 = class555.anInt7422 * -1478371119;
		aClass555_7584 = class555;
		aClass560Array7591 = new Class560[503];
		anInt7599 = 0;
		aClass560Array7593 = new Class560[2015];
		anInt7589 = 0;
		aClass560Array7595 = new Class560[1009];
		anInt7606 = 0;
		aClass560Array7597 = new Class560[1006];
		anInt7590 = 0;
		anIntArrayArrayArray7592 = (new int[aClass555_7584.anInt7466 * -1609909485][aClass555_7584.anInt7443 * -547681223 + 1][aClass555_7584.anInt7432 * -1437024153 + 1]);
		aBool7586 = false;
		aBool7603 = true;
		if (aBool7603)
			aClass564_7585 = new Class564(this);
	}

	final boolean method9529(int i, int i_191_, int i_192_) {
		aClass180_7604.method3333((float) i, (float) i_191_, (float) i_192_, aFloatArray7596);
		if (aFloatArray7596[2] < 50.0F)
			return false;
		aFloatArray7596[0] /= 3.0F;
		aFloatArray7596[1] /= 3.0F;
		return true;
	}

	void method9530() {
		for (int i = 0; i < anInt7589; i++)
			aClass560Array7593[i] = null;
		anInt7589 = 0;
		for (int i = 0; i < aClass555_7584.anInt7466 * -1609909485; i++) {
			for (int i_193_ = 0; i_193_ < aClass555_7584.anInt7443 * -547681223; i_193_++) {
				for (int i_194_ = 0; i_194_ < aClass555_7584.anInt7432 * -1437024153; i_194_++) {
					Class561 class561 = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_194_][i_193_]);
					if (class561 != null) {
						if (class561.aShort7559 > 0)
							class561.aShort7559 *= -1;
						if (class561.aShort7561 > 0)
							class561.aShort7561 *= -1;
					}
				}
			}
		}
		for (int i = 0; i < aClass555_7584.anInt7466 * -1609909485; i++) {
			for (int i_195_ = 0; i_195_ < aClass555_7584.anInt7443 * -547681223; i_195_++) {
				for (int i_196_ = 0; i_196_ < aClass555_7584.anInt7432 * -1437024153; i_196_++) {
					Class561 class561 = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_196_][i_195_]);
					if (class561 != null) {
						boolean bool = ((aClass555_7584.aClass561ArrayArrayArray7426[0][i_196_][i_195_]) != null && ((aClass555_7584.aClass561ArrayArrayArray7426[0][i_196_][i_195_].aClass561_7554) != null));
						if (class561.aShort7559 < 0) {
							int i_197_ = i_195_;
							int i_198_ = i_195_;
							int i_199_ = i;
							int i_200_ = i;
							Class561 class561_201_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_196_][i_197_ - 1]);
							int i_202_;
							for (i_202_ = (aClass555_7584.aClass161Array7457[i].method2595(i_196_, i_195_, (byte) 31)); (i_197_ > 0 && class561_201_ != null && class561_201_.aShort7559 < 0 && (class561_201_.aShort7559 == class561.aShort7559) && (class561_201_.aShort7560 == class561.aShort7560) && (i_202_ == (aClass555_7584.aClass161Array7457[i].method2595(i_196_, i_197_ - 1, (byte) 113)))
									&& (i_197_ - 1 <= 0 || i_202_ == (aClass555_7584.aClass161Array7457[i].method2595(i_196_, i_197_ - 2, (byte) 67))) && i_198_ - i_197_ <= 10); class561_201_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_196_][i_197_ - 1]))
								i_197_--;
							for (class561_201_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_196_][i_198_ + 1]); ((i_198_ < aClass555_7584.anInt7432 * -1437024153) && class561_201_ != null && class561_201_.aShort7559 < 0 && (class561_201_.aShort7559 == class561.aShort7559) && (class561_201_.aShort7560 == class561.aShort7560) && (i_202_ == (aClass555_7584.aClass161Array7457[i].method2595(i_196_, i_198_ + 1, (byte) 109)))
									&& (i_198_ + 1 >= (aClass555_7584.anInt7432 * -1437024153) || i_202_ == (aClass555_7584.aClass161Array7457[i].method2595(i_196_, i_198_ + 2, (byte) 62))) && i_198_ - i_197_ <= 10); class561_201_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_196_][i_198_ + 1]))
								i_198_++;
							int i_203_ = i_200_ - i_199_ + 1;
							int i_204_ = aClass555_7584.aClass161Array7457[bool ? i_199_ + 1 : i_199_].method2595(i_196_, i_197_, (byte) 62);
							int i_205_ = i_204_ + class561.aShort7559 * i_203_;
							int i_206_ = (aClass555_7584.aClass161Array7457[bool ? i_199_ + 1 : i_199_].method2595(i_196_, i_198_ + 1, (byte) 119));
							int i_207_ = i_206_ + class561.aShort7559 * i_203_;
							int i_208_ = (i_196_ << aClass555_7584.anInt7421 * 1742303003);
							int i_209_ = (i_197_ << aClass555_7584.anInt7421 * 1742303003);
							int i_210_ = ((i_198_ << aClass555_7584.anInt7421 * 1742303003) + aClass555_7584.anInt7422 * -1478371119);
							aClass560Array7593[anInt7589++] = new Class560(aClass555_7584, 1, i_200_, i_208_ + class561.aShort7560, i_208_ + class561.aShort7560, i_208_ + class561.aShort7560, i_208_ + class561.aShort7560, i_204_, i_206_, i_207_, i_205_, i_209_, i_210_, i_210_, i_209_);
							for (int i_211_ = i_199_; i_211_ <= i_200_; i_211_++) {
								for (int i_212_ = i_197_; i_212_ <= i_198_; i_212_++)
									aClass555_7584.aClass561ArrayArrayArray7426[i_211_][i_196_][i_212_].aShort7559 *= -1;
							}
						}
						if (class561.aShort7561 < 0) {
							int i_213_ = i_196_;
							int i_214_ = i_196_;
							int i_215_ = i;
							int i_216_ = i;
							Class561 class561_217_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_213_ - 1][i_195_]);
							int i_218_;
							for (i_218_ = (aClass555_7584.aClass161Array7457[i].method2595(i_196_, i_195_, (byte) 120)); (i_213_ > 0 && class561_217_ != null && class561_217_.aShort7561 < 0 && (class561_217_.aShort7561 == class561.aShort7561) && (class561_217_.aShort7551 == class561.aShort7551) && i_218_ == (aClass555_7584.aClass161Array7457[i].method2595(i_213_ - 1, i_195_, (byte) 4))
									&& (i_213_ - 1 <= 0 || i_218_ == (aClass555_7584.aClass161Array7457[i].method2595(i_213_ - 2, i_195_, (byte) 93))) && i_214_ - i_213_ <= 10); class561_217_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_213_ - 1][i_195_]))
								i_213_--;
							for (class561_217_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_214_ + 1][i_195_]); ((i_214_ < aClass555_7584.anInt7443 * -547681223) && class561_217_ != null && class561_217_.aShort7561 < 0 && (class561_217_.aShort7561 == class561.aShort7561) && (class561_217_.aShort7551 == class561.aShort7551) && (i_218_ == (aClass555_7584.aClass161Array7457[i].method2595(i_214_ + 1, i_195_, (byte) 101)))
									&& (i_214_ + 1 >= (aClass555_7584.anInt7443 * -547681223) || i_218_ == (aClass555_7584.aClass161Array7457[i].method2595(i_214_ + 2, i_195_, (byte) 69))) && i_214_ - i_213_ <= 10); class561_217_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_214_ + 1][i_195_]))
								i_214_++;
							int i_219_ = i_216_ - i_215_ + 1;
							int i_220_ = aClass555_7584.aClass161Array7457[bool ? i_215_ + 1 : i_215_].method2595(i_213_, i_195_, (byte) 89);
							int i_221_ = i_220_ + class561.aShort7561 * i_219_;
							int i_222_ = (aClass555_7584.aClass161Array7457[bool ? i_215_ + 1 : i_215_].method2595(i_214_ + 1, i_195_, (byte) 60));
							int i_223_ = i_222_ + class561.aShort7561 * i_219_;
							int i_224_ = (i_213_ << aClass555_7584.anInt7421 * 1742303003);
							int i_225_ = ((i_214_ << aClass555_7584.anInt7421 * 1742303003) + aClass555_7584.anInt7422 * -1478371119);
							int i_226_ = (i_195_ << aClass555_7584.anInt7421 * 1742303003);
							aClass560Array7593[anInt7589++] = new Class560(aClass555_7584, 2, i_216_, i_224_, i_225_, i_225_, i_224_, i_220_, i_222_, i_223_, i_221_, i_226_ + class561.aShort7551, i_226_ + class561.aShort7551, i_226_ + class561.aShort7551, i_226_ + class561.aShort7551);
							for (int i_227_ = i_215_; i_227_ <= i_216_; i_227_++) {
								for (int i_228_ = i_213_; i_228_ <= i_214_; i_228_++)
									aClass555_7584.aClass561ArrayArrayArray7426[i_227_][i_228_][i_195_].aShort7561 *= -1;
							}
						}
					}
				}
			}
		}
		aBool7586 = true;
	}

	boolean method9531(int i, int i_229_, int i_230_) {
		if (!aBool7603 || !aBool7580)
			return false;
		if (aClass564_7585.anInt7576 < 102)
			return false;
		int i_231_ = anIntArrayArrayArray7592[i][i_229_][i_230_];
		if (i_231_ == -(aClass555_7584.anInt7429 * -1690479805))
			return false;
		if (i_231_ == aClass555_7584.anInt7429 * -1690479805)
			return true;
		if (aClass555_7584.aClass161Array7434 == aClass555_7584.aClass161Array7435)
			return false;
		int i_232_ = i_229_ << aClass555_7584.anInt7421 * 1742303003;
		int i_233_ = i_230_ << aClass555_7584.anInt7421 * 1742303003;
		if (method9517(i_232_ + 1, aClass555_7584.aClass161Array7434[i].method2595(i_229_, i_230_, (byte) 40), i_233_ + 1, i_232_ + aClass555_7584.anInt7422 * -1478371119 - 1, aClass555_7584.aClass161Array7434[i].method2595(i_229_ + 1, i_230_ + 1, (byte) 107), i_233_ + aClass555_7584.anInt7422 * -1478371119 - 1, i_232_ + 1, aClass555_7584.aClass161Array7434[i].method2595(i_229_, i_230_ + 1, (byte) 119), i_233_ + aClass555_7584.anInt7422 * -1478371119 - 1)
				&& method9517(i_232_ + 1, aClass555_7584.aClass161Array7434[i].method2595(i_229_, i_230_, (byte) 74), i_233_ + 1, i_232_ + aClass555_7584.anInt7422 * -1478371119 - 1, aClass555_7584.aClass161Array7434[i].method2595(i_229_ + 1, i_230_, (byte) 18), i_233_ + 1, i_232_ + aClass555_7584.anInt7422 * -1478371119 - 1, aClass555_7584.aClass161Array7434[i].method2595(i_229_ + 1, i_230_ + 1, (byte) 36), (i_233_ + aClass555_7584.anInt7422 * -1478371119 - 1))) {
			anIntArrayArrayArray7592[i][i_229_][i_230_] = aClass555_7584.anInt7429 * -1690479805;
			return true;
		}
		anIntArrayArrayArray7592[i][i_229_][i_230_] = -(aClass555_7584.anInt7429 * -1690479805);
		return false;
	}

	void method9532(Class180 class180, Class560 class560, int i) {
		aClass180_7604 = class180;
		if (anIntArray7598 != null && class560.aByte7539 >= i) {
			for (int i_234_ = 0; i_234_ < anIntArray7598.length; i_234_++) {
				if (anIntArray7598[i_234_] != -1000000 && (class560.anIntArray7545[0] <= anIntArray7598[i_234_] || class560.anIntArray7545[1] <= anIntArray7598[i_234_] || class560.anIntArray7545[2] <= anIntArray7598[i_234_] || (class560.anIntArray7545[3] <= anIntArray7598[i_234_]))
						&& (class560.anIntArray7544[0] <= anIntArray7600[i_234_] || class560.anIntArray7544[1] <= anIntArray7600[i_234_] || class560.anIntArray7544[2] <= anIntArray7600[i_234_] || (class560.anIntArray7544[3] <= anIntArray7600[i_234_])) && (class560.anIntArray7544[0] >= anIntArray7605[i_234_] || class560.anIntArray7544[1] >= anIntArray7605[i_234_] || class560.anIntArray7544[2] >= anIntArray7605[i_234_] || (class560.anIntArray7544[3] >= anIntArray7605[i_234_]))
						&& (class560.anIntArray7543[0] <= anIntArray7608[i_234_] || class560.anIntArray7543[1] <= anIntArray7608[i_234_] || class560.anIntArray7543[2] <= anIntArray7608[i_234_] || (class560.anIntArray7543[3] <= anIntArray7608[i_234_])) && (class560.anIntArray7543[0] >= anIntArray7602[i_234_] || class560.anIntArray7543[1] >= anIntArray7602[i_234_] || class560.anIntArray7543[2] >= anIntArray7602[i_234_] || (class560.anIntArray7543[3] >= anIntArray7602[i_234_])))
					return;
			}
		}
		if (class560.aByte7535 == 1) {
			int i_235_ = (class560.aShort7540 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
			if (i_235_ >= 0 && i_235_ <= (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325)) {
				int i_236_ = (class560.aShort7537 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_236_ < 0)
					i_236_ = 0;
				else if (i_236_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					return;
				int i_237_ = (class560.aShort7538 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_237_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					i_237_ = (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325);
				else if (i_237_ < 0)
					return;
				boolean bool = false;
				while_31_: do {
					do {
						if (i_236_ > i_237_)
							break while_31_;
					} while (!aClass555_7584.aBoolArrayArray7467[i_235_][i_236_++]);
					bool = true;
				} while (false);
				if (bool) {
					float f = (float) (aClass555_7584.anInt7459 * 120302175 - class560.anIntArray7544[0]);
					if (f < 0.0F)
						f *= -1.0F;
					if (!(f < (float) anInt7587) && method9509(class560, 0) && method9509(class560, 1) && method9509(class560, 2) && method9509(class560, 3))
						aClass560Array7597[anInt7590++] = class560;
				}
			}
		} else if (class560.aByte7535 == 2) {
			int i_238_ = (class560.aShort7537 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
			if (i_238_ >= 0 && i_238_ <= (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325)) {
				int i_239_ = (class560.aShort7540 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
				if (i_239_ < 0)
					i_239_ = 0;
				else if (i_239_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					return;
				int i_240_ = (class560.aShort7541 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
				if (i_240_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					i_240_ = (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325);
				else if (i_240_ < 0)
					return;
				boolean bool = false;
				while_32_: do {
					do {
						if (i_239_ > i_240_)
							break while_32_;
					} while (!aClass555_7584.aBoolArrayArray7467[i_239_++][i_238_]);
					bool = true;
				} while (false);
				if (bool) {
					float f = (float) (aClass555_7584.anInt7460 * 2047098835 - class560.anIntArray7543[0]);
					if (f < 0.0F)
						f *= -1.0F;
					if (!(f < (float) anInt7587) && method9509(class560, 0) && method9509(class560, 1) && method9509(class560, 2) && method9509(class560, 3))
						aClass560Array7597[anInt7590++] = class560;
				}
			}
		} else if (class560.aByte7535 == 16 || class560.aByte7535 == 8) {
			int i_241_ = (class560.aShort7540 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
			if (i_241_ >= 0 && i_241_ <= (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325)) {
				int i_242_ = (class560.aShort7537 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_242_ >= 0 && i_242_ <= (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325) && aClass555_7584.aBoolArrayArray7467[i_241_][i_242_]) {
					float f = (float) (aClass555_7584.anInt7459 * 120302175 - class560.anIntArray7544[0]);
					if (f < 0.0F)
						f *= -1.0F;
					float f_243_ = (float) (aClass555_7584.anInt7460 * 2047098835 - class560.anIntArray7543[0]);
					if (f_243_ < 0.0F)
						f_243_ *= -1.0F;
					if ((!(f < (float) anInt7587) || !(f_243_ < (float) anInt7587)) && method9509(class560, 0) && method9509(class560, 1) && method9509(class560, 2) && method9509(class560, 3))
						aClass560Array7597[anInt7590++] = class560;
				}
			}
		} else if (class560.aByte7535 == 4) {
			float f = (float) (class560.anIntArray7545[0] - aClass555_7584.anInt7461 * -1990869435);
			if (!(f <= (float) anInt7588)) {
				int i_244_ = (class560.aShort7537 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_244_ < 0)
					i_244_ = 0;
				else if (i_244_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					return;
				int i_245_ = (class560.aShort7538 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_245_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					i_245_ = (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325);
				else if (i_245_ < 0)
					return;
				int i_246_ = (class560.aShort7540 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
				if (i_246_ < 0)
					i_246_ = 0;
				else if (i_246_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					return;
				int i_247_ = (class560.aShort7541 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
				if (i_247_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					i_247_ = (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325);
				else if (i_247_ < 0)
					return;
				boolean bool = false;
				while_33_: for (int i_248_ = i_246_; i_248_ <= i_247_; i_248_++) {
					for (int i_249_ = i_244_; i_249_ <= i_245_; i_249_++) {
						if (aClass555_7584.aBoolArrayArray7467[i_248_][i_249_]) {
							bool = true;
							break while_33_;
						}
					}
				}
				if (bool && method9509(class560, 0) && method9509(class560, 1) && method9509(class560, 2) && method9509(class560, 3))
					aClass560Array7597[anInt7590++] = class560;
			}
		}
	}

	void method9533() {
		for (int i = 0; i < anInt7589; i++)
			aClass560Array7593[i] = null;
		anInt7589 = 0;
		for (int i = 0; i < aClass555_7584.anInt7466 * -1609909485; i++) {
			for (int i_250_ = 0; i_250_ < aClass555_7584.anInt7443 * -547681223; i_250_++) {
				for (int i_251_ = 0; i_251_ < aClass555_7584.anInt7432 * -1437024153; i_251_++) {
					Class561 class561 = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_251_][i_250_]);
					if (class561 != null) {
						if (class561.aShort7559 > 0)
							class561.aShort7559 *= -1;
						if (class561.aShort7561 > 0)
							class561.aShort7561 *= -1;
					}
				}
			}
		}
		for (int i = 0; i < aClass555_7584.anInt7466 * -1609909485; i++) {
			for (int i_252_ = 0; i_252_ < aClass555_7584.anInt7443 * -547681223; i_252_++) {
				for (int i_253_ = 0; i_253_ < aClass555_7584.anInt7432 * -1437024153; i_253_++) {
					Class561 class561 = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_253_][i_252_]);
					if (class561 != null) {
						boolean bool = ((aClass555_7584.aClass561ArrayArrayArray7426[0][i_253_][i_252_]) != null && ((aClass555_7584.aClass561ArrayArrayArray7426[0][i_253_][i_252_].aClass561_7554) != null));
						if (class561.aShort7559 < 0) {
							int i_254_ = i_252_;
							int i_255_ = i_252_;
							int i_256_ = i;
							int i_257_ = i;
							Class561 class561_258_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_253_][i_254_ - 1]);
							int i_259_;
							for (i_259_ = (aClass555_7584.aClass161Array7457[i].method2595(i_253_, i_252_, (byte) 84)); (i_254_ > 0 && class561_258_ != null && class561_258_.aShort7559 < 0 && (class561_258_.aShort7559 == class561.aShort7559) && (class561_258_.aShort7560 == class561.aShort7560) && (i_259_ == (aClass555_7584.aClass161Array7457[i].method2595(i_253_, i_254_ - 1, (byte) 29)))
									&& (i_254_ - 1 <= 0 || (i_259_ == (aClass555_7584.aClass161Array7457[i].method2595(i_253_, i_254_ - 2, (byte) 8)))) && i_255_ - i_254_ <= 10); class561_258_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_253_][i_254_ - 1]))
								i_254_--;
							for (class561_258_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_253_][i_255_ + 1]); ((i_255_ < aClass555_7584.anInt7432 * -1437024153) && class561_258_ != null && class561_258_.aShort7559 < 0 && (class561_258_.aShort7559 == class561.aShort7559) && (class561_258_.aShort7560 == class561.aShort7560) && (i_259_ == (aClass555_7584.aClass161Array7457[i].method2595(i_253_, i_255_ + 1, (byte) 88)))
									&& (i_255_ + 1 >= (aClass555_7584.anInt7432 * -1437024153) || i_259_ == (aClass555_7584.aClass161Array7457[i].method2595(i_253_, i_255_ + 2, (byte) 80))) && i_255_ - i_254_ <= 10); class561_258_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_253_][i_255_ + 1]))
								i_255_++;
							int i_260_ = i_257_ - i_256_ + 1;
							int i_261_ = aClass555_7584.aClass161Array7457[bool ? i_256_ + 1 : i_256_].method2595(i_253_, i_254_, (byte) 25);
							int i_262_ = i_261_ + class561.aShort7559 * i_260_;
							int i_263_ = (aClass555_7584.aClass161Array7457[bool ? i_256_ + 1 : i_256_].method2595(i_253_, i_255_ + 1, (byte) 112));
							int i_264_ = i_263_ + class561.aShort7559 * i_260_;
							int i_265_ = (i_253_ << aClass555_7584.anInt7421 * 1742303003);
							int i_266_ = (i_254_ << aClass555_7584.anInt7421 * 1742303003);
							int i_267_ = ((i_255_ << aClass555_7584.anInt7421 * 1742303003) + aClass555_7584.anInt7422 * -1478371119);
							aClass560Array7593[anInt7589++] = new Class560(aClass555_7584, 1, i_257_, i_265_ + class561.aShort7560, i_265_ + class561.aShort7560, i_265_ + class561.aShort7560, i_265_ + class561.aShort7560, i_261_, i_263_, i_264_, i_262_, i_266_, i_267_, i_267_, i_266_);
							for (int i_268_ = i_256_; i_268_ <= i_257_; i_268_++) {
								for (int i_269_ = i_254_; i_269_ <= i_255_; i_269_++)
									aClass555_7584.aClass561ArrayArrayArray7426[i_268_][i_253_][i_269_].aShort7559 *= -1;
							}
						}
						if (class561.aShort7561 < 0) {
							int i_270_ = i_253_;
							int i_271_ = i_253_;
							int i_272_ = i;
							int i_273_ = i;
							Class561 class561_274_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_270_ - 1][i_252_]);
							int i_275_;
							for (i_275_ = (aClass555_7584.aClass161Array7457[i].method2595(i_253_, i_252_, (byte) 94)); (i_270_ > 0 && class561_274_ != null && class561_274_.aShort7561 < 0 && (class561_274_.aShort7561 == class561.aShort7561) && (class561_274_.aShort7551 == class561.aShort7551) && (i_275_ == (aClass555_7584.aClass161Array7457[i].method2595(i_270_ - 1, i_252_, (byte) 18)))
									&& (i_270_ - 1 <= 0 || i_275_ == (aClass555_7584.aClass161Array7457[i].method2595(i_270_ - 2, i_252_, (byte) 50))) && i_271_ - i_270_ <= 10); class561_274_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_270_ - 1][i_252_]))
								i_270_--;
							for (class561_274_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_271_ + 1][i_252_]); ((i_271_ < aClass555_7584.anInt7443 * -547681223) && class561_274_ != null && class561_274_.aShort7561 < 0 && (class561_274_.aShort7561 == class561.aShort7561) && (class561_274_.aShort7551 == class561.aShort7551) && (i_275_ == (aClass555_7584.aClass161Array7457[i].method2595(i_271_ + 1, i_252_, (byte) 20)))
									&& (i_271_ + 1 >= (aClass555_7584.anInt7443 * -547681223) || i_275_ == (aClass555_7584.aClass161Array7457[i].method2595(i_271_ + 2, i_252_, (byte) 103))) && i_271_ - i_270_ <= 10); class561_274_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_271_ + 1][i_252_]))
								i_271_++;
							int i_276_ = i_273_ - i_272_ + 1;
							int i_277_ = aClass555_7584.aClass161Array7457[bool ? i_272_ + 1 : i_272_].method2595(i_270_, i_252_, (byte) 54);
							int i_278_ = i_277_ + class561.aShort7561 * i_276_;
							int i_279_ = (aClass555_7584.aClass161Array7457[bool ? i_272_ + 1 : i_272_].method2595(i_271_ + 1, i_252_, (byte) 66));
							int i_280_ = i_279_ + class561.aShort7561 * i_276_;
							int i_281_ = (i_270_ << aClass555_7584.anInt7421 * 1742303003);
							int i_282_ = ((i_271_ << aClass555_7584.anInt7421 * 1742303003) + aClass555_7584.anInt7422 * -1478371119);
							int i_283_ = (i_252_ << aClass555_7584.anInt7421 * 1742303003);
							aClass560Array7593[anInt7589++] = new Class560(aClass555_7584, 2, i_273_, i_281_, i_282_, i_282_, i_281_, i_277_, i_279_, i_280_, i_278_, i_283_ + class561.aShort7551, i_283_ + class561.aShort7551, i_283_ + class561.aShort7551, i_283_ + class561.aShort7551);
							for (int i_284_ = i_272_; i_284_ <= i_273_; i_284_++) {
								for (int i_285_ = i_270_; i_285_ <= i_271_; i_285_++)
									aClass555_7584.aClass561ArrayArrayArray7426[i_284_][i_285_][i_252_].aShort7561 *= -1;
							}
						}
					}
				}
			}
		}
		aBool7586 = true;
	}

	void method9534(Class180 class180, Class560 class560, int i) {
		aClass180_7604 = class180;
		if (anIntArray7598 != null && class560.aByte7539 >= i) {
			for (int i_286_ = 0; i_286_ < anIntArray7598.length; i_286_++) {
				if (anIntArray7598[i_286_] != -1000000 && (class560.anIntArray7545[0] <= anIntArray7598[i_286_] || class560.anIntArray7545[1] <= anIntArray7598[i_286_] || class560.anIntArray7545[2] <= anIntArray7598[i_286_] || (class560.anIntArray7545[3] <= anIntArray7598[i_286_]))
						&& (class560.anIntArray7544[0] <= anIntArray7600[i_286_] || class560.anIntArray7544[1] <= anIntArray7600[i_286_] || class560.anIntArray7544[2] <= anIntArray7600[i_286_] || (class560.anIntArray7544[3] <= anIntArray7600[i_286_])) && (class560.anIntArray7544[0] >= anIntArray7605[i_286_] || class560.anIntArray7544[1] >= anIntArray7605[i_286_] || class560.anIntArray7544[2] >= anIntArray7605[i_286_] || (class560.anIntArray7544[3] >= anIntArray7605[i_286_]))
						&& (class560.anIntArray7543[0] <= anIntArray7608[i_286_] || class560.anIntArray7543[1] <= anIntArray7608[i_286_] || class560.anIntArray7543[2] <= anIntArray7608[i_286_] || (class560.anIntArray7543[3] <= anIntArray7608[i_286_])) && (class560.anIntArray7543[0] >= anIntArray7602[i_286_] || class560.anIntArray7543[1] >= anIntArray7602[i_286_] || class560.anIntArray7543[2] >= anIntArray7602[i_286_] || (class560.anIntArray7543[3] >= anIntArray7602[i_286_])))
					return;
			}
		}
		if (class560.aByte7535 == 1) {
			int i_287_ = (class560.aShort7540 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
			if (i_287_ >= 0 && i_287_ <= (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325)) {
				int i_288_ = (class560.aShort7537 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_288_ < 0)
					i_288_ = 0;
				else if (i_288_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					return;
				int i_289_ = (class560.aShort7538 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_289_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					i_289_ = (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325);
				else if (i_289_ < 0)
					return;
				boolean bool = false;
				while_34_: do {
					do {
						if (i_288_ > i_289_)
							break while_34_;
					} while (!aClass555_7584.aBoolArrayArray7467[i_287_][i_288_++]);
					bool = true;
				} while (false);
				if (bool) {
					float f = (float) (aClass555_7584.anInt7459 * 120302175 - class560.anIntArray7544[0]);
					if (f < 0.0F)
						f *= -1.0F;
					if (!(f < (float) anInt7587) && method9509(class560, 0) && method9509(class560, 1) && method9509(class560, 2) && method9509(class560, 3))
						aClass560Array7597[anInt7590++] = class560;
				}
			}
		} else if (class560.aByte7535 == 2) {
			int i_290_ = (class560.aShort7537 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
			if (i_290_ >= 0 && i_290_ <= (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325)) {
				int i_291_ = (class560.aShort7540 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
				if (i_291_ < 0)
					i_291_ = 0;
				else if (i_291_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					return;
				int i_292_ = (class560.aShort7541 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
				if (i_292_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					i_292_ = (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325);
				else if (i_292_ < 0)
					return;
				boolean bool = false;
				while_35_: do {
					do {
						if (i_291_ > i_292_)
							break while_35_;
					} while (!aClass555_7584.aBoolArrayArray7467[i_291_++][i_290_]);
					bool = true;
				} while (false);
				if (bool) {
					float f = (float) (aClass555_7584.anInt7460 * 2047098835 - class560.anIntArray7543[0]);
					if (f < 0.0F)
						f *= -1.0F;
					if (!(f < (float) anInt7587) && method9509(class560, 0) && method9509(class560, 1) && method9509(class560, 2) && method9509(class560, 3))
						aClass560Array7597[anInt7590++] = class560;
				}
			}
		} else if (class560.aByte7535 == 16 || class560.aByte7535 == 8) {
			int i_293_ = (class560.aShort7540 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
			if (i_293_ >= 0 && i_293_ <= (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325)) {
				int i_294_ = (class560.aShort7537 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_294_ >= 0 && i_294_ <= (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325) && aClass555_7584.aBoolArrayArray7467[i_293_][i_294_]) {
					float f = (float) (aClass555_7584.anInt7459 * 120302175 - class560.anIntArray7544[0]);
					if (f < 0.0F)
						f *= -1.0F;
					float f_295_ = (float) (aClass555_7584.anInt7460 * 2047098835 - class560.anIntArray7543[0]);
					if (f_295_ < 0.0F)
						f_295_ *= -1.0F;
					if ((!(f < (float) anInt7587) || !(f_295_ < (float) anInt7587)) && method9509(class560, 0) && method9509(class560, 1) && method9509(class560, 2) && method9509(class560, 3))
						aClass560Array7597[anInt7590++] = class560;
				}
			}
		} else if (class560.aByte7535 == 4) {
			float f = (float) (class560.anIntArray7545[0] - aClass555_7584.anInt7461 * -1990869435);
			if (!(f <= (float) anInt7588)) {
				int i_296_ = (class560.aShort7537 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_296_ < 0)
					i_296_ = 0;
				else if (i_296_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					return;
				int i_297_ = (class560.aShort7538 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_297_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					i_297_ = (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325);
				else if (i_297_ < 0)
					return;
				int i_298_ = (class560.aShort7540 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
				if (i_298_ < 0)
					i_298_ = 0;
				else if (i_298_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					return;
				int i_299_ = (class560.aShort7541 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
				if (i_299_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					i_299_ = (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325);
				else if (i_299_ < 0)
					return;
				boolean bool = false;
				while_36_: for (int i_300_ = i_298_; i_300_ <= i_299_; i_300_++) {
					for (int i_301_ = i_296_; i_301_ <= i_297_; i_301_++) {
						if (aClass555_7584.aBoolArrayArray7467[i_300_][i_301_]) {
							bool = true;
							break while_36_;
						}
					}
				}
				if (bool && method9509(class560, 0) && method9509(class560, 1) && method9509(class560, 2) && method9509(class560, 3))
					aClass560Array7597[anInt7590++] = class560;
			}
		}
	}

	void method9535(Class180 class180, Class560 class560, int i) {
		aClass180_7604 = class180;
		if (anIntArray7598 != null && class560.aByte7539 >= i) {
			for (int i_302_ = 0; i_302_ < anIntArray7598.length; i_302_++) {
				if (anIntArray7598[i_302_] != -1000000 && (class560.anIntArray7545[0] <= anIntArray7598[i_302_] || class560.anIntArray7545[1] <= anIntArray7598[i_302_] || class560.anIntArray7545[2] <= anIntArray7598[i_302_] || (class560.anIntArray7545[3] <= anIntArray7598[i_302_]))
						&& (class560.anIntArray7544[0] <= anIntArray7600[i_302_] || class560.anIntArray7544[1] <= anIntArray7600[i_302_] || class560.anIntArray7544[2] <= anIntArray7600[i_302_] || (class560.anIntArray7544[3] <= anIntArray7600[i_302_])) && (class560.anIntArray7544[0] >= anIntArray7605[i_302_] || class560.anIntArray7544[1] >= anIntArray7605[i_302_] || class560.anIntArray7544[2] >= anIntArray7605[i_302_] || (class560.anIntArray7544[3] >= anIntArray7605[i_302_]))
						&& (class560.anIntArray7543[0] <= anIntArray7608[i_302_] || class560.anIntArray7543[1] <= anIntArray7608[i_302_] || class560.anIntArray7543[2] <= anIntArray7608[i_302_] || (class560.anIntArray7543[3] <= anIntArray7608[i_302_])) && (class560.anIntArray7543[0] >= anIntArray7602[i_302_] || class560.anIntArray7543[1] >= anIntArray7602[i_302_] || class560.anIntArray7543[2] >= anIntArray7602[i_302_] || (class560.anIntArray7543[3] >= anIntArray7602[i_302_])))
					return;
			}
		}
		if (class560.aByte7535 == 1) {
			int i_303_ = (class560.aShort7540 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
			if (i_303_ >= 0 && i_303_ <= (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325)) {
				int i_304_ = (class560.aShort7537 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_304_ < 0)
					i_304_ = 0;
				else if (i_304_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					return;
				int i_305_ = (class560.aShort7538 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_305_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					i_305_ = (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325);
				else if (i_305_ < 0)
					return;
				boolean bool = false;
				while_37_: do {
					do {
						if (i_304_ > i_305_)
							break while_37_;
					} while (!aClass555_7584.aBoolArrayArray7467[i_303_][i_304_++]);
					bool = true;
				} while (false);
				if (bool) {
					float f = (float) (aClass555_7584.anInt7459 * 120302175 - class560.anIntArray7544[0]);
					if (f < 0.0F)
						f *= -1.0F;
					if (!(f < (float) anInt7587) && method9509(class560, 0) && method9509(class560, 1) && method9509(class560, 2) && method9509(class560, 3))
						aClass560Array7597[anInt7590++] = class560;
				}
			}
		} else if (class560.aByte7535 == 2) {
			int i_306_ = (class560.aShort7537 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
			if (i_306_ >= 0 && i_306_ <= (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325)) {
				int i_307_ = (class560.aShort7540 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
				if (i_307_ < 0)
					i_307_ = 0;
				else if (i_307_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					return;
				int i_308_ = (class560.aShort7541 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
				if (i_308_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					i_308_ = (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325);
				else if (i_308_ < 0)
					return;
				boolean bool = false;
				while_38_: do {
					do {
						if (i_307_ > i_308_)
							break while_38_;
					} while (!aClass555_7584.aBoolArrayArray7467[i_307_++][i_306_]);
					bool = true;
				} while (false);
				if (bool) {
					float f = (float) (aClass555_7584.anInt7460 * 2047098835 - class560.anIntArray7543[0]);
					if (f < 0.0F)
						f *= -1.0F;
					if (!(f < (float) anInt7587) && method9509(class560, 0) && method9509(class560, 1) && method9509(class560, 2) && method9509(class560, 3))
						aClass560Array7597[anInt7590++] = class560;
				}
			}
		} else if (class560.aByte7535 == 16 || class560.aByte7535 == 8) {
			int i_309_ = (class560.aShort7540 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
			if (i_309_ >= 0 && i_309_ <= (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325)) {
				int i_310_ = (class560.aShort7537 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_310_ >= 0 && i_310_ <= (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325) && aClass555_7584.aBoolArrayArray7467[i_309_][i_310_]) {
					float f = (float) (aClass555_7584.anInt7459 * 120302175 - class560.anIntArray7544[0]);
					if (f < 0.0F)
						f *= -1.0F;
					float f_311_ = (float) (aClass555_7584.anInt7460 * 2047098835 - class560.anIntArray7543[0]);
					if (f_311_ < 0.0F)
						f_311_ *= -1.0F;
					if ((!(f < (float) anInt7587) || !(f_311_ < (float) anInt7587)) && method9509(class560, 0) && method9509(class560, 1) && method9509(class560, 2) && method9509(class560, 3))
						aClass560Array7597[anInt7590++] = class560;
				}
			}
		} else if (class560.aByte7535 == 4) {
			float f = (float) (class560.anIntArray7545[0] - aClass555_7584.anInt7461 * -1990869435);
			if (!(f <= (float) anInt7588)) {
				int i_312_ = (class560.aShort7537 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_312_ < 0)
					i_312_ = 0;
				else if (i_312_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					return;
				int i_313_ = (class560.aShort7538 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_313_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					i_313_ = (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325);
				else if (i_313_ < 0)
					return;
				int i_314_ = (class560.aShort7540 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
				if (i_314_ < 0)
					i_314_ = 0;
				else if (i_314_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					return;
				int i_315_ = (class560.aShort7541 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
				if (i_315_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					i_315_ = (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325);
				else if (i_315_ < 0)
					return;
				boolean bool = false;
				while_39_: for (int i_316_ = i_314_; i_316_ <= i_315_; i_316_++) {
					for (int i_317_ = i_312_; i_317_ <= i_313_; i_317_++) {
						if (aClass555_7584.aBoolArrayArray7467[i_316_][i_317_]) {
							bool = true;
							break while_39_;
						}
					}
				}
				if (bool && method9509(class560, 0) && method9509(class560, 1) && method9509(class560, 2) && method9509(class560, 3))
					aClass560Array7597[anInt7590++] = class560;
			}
		}
	}

	final boolean method9536(int i, int i_318_, int i_319_) {
		aClass180_7604.method3333((float) i, (float) i_318_, (float) i_319_, aFloatArray7596);
		if (aFloatArray7596[2] < 50.0F)
			return false;
		aFloatArray7596[0] /= 3.0F;
		aFloatArray7596[1] /= 3.0F;
		return true;
	}

	final boolean method9537(int i, int i_320_, int i_321_) {
		aClass180_7604.method3333((float) i, (float) i_320_, (float) i_321_, aFloatArray7596);
		if (aFloatArray7596[2] < 50.0F)
			return false;
		aFloatArray7596[0] /= 3.0F;
		aFloatArray7596[1] /= 3.0F;
		return true;
	}

	public void method9538(int i, int i_322_, int i_323_, int i_324_, int i_325_, int i_326_, int i_327_, int i_328_) {
		aClass560Array7591[anInt7599++] = new Class560(aClass555_7584, i, i_322_, i_323_, i_324_, i_324_, i_323_, i_327_, i_328_, i_328_, i_327_, i_325_, i_325_, i_326_, i_326_);
	}

	boolean method9539(int i, int i_329_, int i_330_, int i_331_) {
		if (!aBool7603 || !aBool7580)
			return false;
		if (aClass564_7585.anInt7576 < 102)
			return false;
		if (!method9549(i, i_329_, i_330_))
			return false;
		int i_332_ = i_329_ << aClass555_7584.anInt7421 * 1742303003;
		int i_333_ = i_330_ << aClass555_7584.anInt7421 * 1742303003;
		if (method9516(i_332_, aClass555_7584.aClass161Array7434[i].method2595(i_329_, i_330_, (byte) 73), i_333_, aClass555_7584.anInt7422 * -1478371119, i_331_, aClass555_7584.anInt7422 * -1478371119))
			return true;
		return false;
	}

	boolean method9540(int i, int i_334_, int i_335_, int i_336_, int i_337_, Class549 class549) {
		if (!aBool7603 || !aBool7580)
			return false;
		if (aClass564_7585.anInt7576 < 102)
			return false;
		if (i_334_ < 0 || i_336_ < 0 || i_335_ >= anIntArrayArrayArray7592[i].length || i_337_ >= anIntArrayArrayArray7592[i][i_334_].length)
			return false;
		if (i_334_ == i_335_ && i_336_ == i_337_) {
			if (!method9549(i, i_334_, i_336_))
				return false;
			if (method9515(class549))
				return true;
			return false;
		}
		for (int i_338_ = i_334_; i_338_ <= i_335_; i_338_++) {
			for (int i_339_ = i_336_; i_339_ <= i_337_; i_339_++) {
				if (anIntArrayArrayArray7592[i][i_338_][i_339_] == -(aClass555_7584.anInt7429 * -1690479805))
					return false;
			}
		}
		if (!method9515(class549))
			return false;
		return true;
	}

	final boolean method9541(int i, int i_340_, int i_341_, int i_342_, int i_343_, int i_344_) {
		int i_345_ = i + i_342_;
		int i_346_ = i_340_ + i_343_;
		int i_347_ = i_341_ + i_344_;
		if (!method9517(i, i_346_, i_341_, i_345_, i_346_, i_347_, i, i_346_, i_347_))
			return false;
		if (!method9517(i, i_346_, i_341_, i_345_, i_346_, i_341_, i_345_, i_346_, i_347_))
			return false;
		if (i < aClass555_7584.anInt7459 * 120302175) {
			if (!method9517(i, i_340_, i_347_, i, i_346_, i_341_, i, i_346_, i_347_))
				return false;
			if (!method9517(i, i_340_, i_347_, i, i_340_, i_341_, i, i_346_, i_341_))
				return false;
		} else {
			if (!method9517(i_345_, i_340_, i_347_, i_345_, i_346_, i_341_, i_345_, i_346_, i_347_))
				return false;
			if (!method9517(i_345_, i_340_, i_347_, i_345_, i_340_, i_341_, i_345_, i_346_, i_341_))
				return false;
		}
		if (i_341_ < aClass555_7584.anInt7460 * 2047098835) {
			if (!method9517(i, i_340_, i_341_, i_345_, i_346_, i_341_, i, i_346_, i_341_))
				return false;
			if (!method9517(i, i_340_, i_341_, i_345_, i_340_, i_341_, i_345_, i_346_, i_341_))
				return false;
		} else {
			if (!method9517(i, i_340_, i_347_, i_345_, i_346_, i_347_, i, i_346_, i_347_))
				return false;
			if (!method9517(i, i_340_, i_347_, i_345_, i_340_, i_347_, i_345_, i_346_, i_347_))
				return false;
		}
		return true;
	}

	boolean method9542(int i, int i_348_, int i_349_) {
		if (!aBool7603 || !aBool7580)
			return false;
		if (aClass564_7585.anInt7576 < 102)
			return false;
		int i_350_ = anIntArrayArrayArray7592[i][i_348_][i_349_];
		if (i_350_ == -(aClass555_7584.anInt7429 * -1690479805))
			return false;
		if (i_350_ == aClass555_7584.anInt7429 * -1690479805)
			return true;
		if (aClass555_7584.aClass161Array7434 == aClass555_7584.aClass161Array7435)
			return false;
		int i_351_ = i_348_ << aClass555_7584.anInt7421 * 1742303003;
		int i_352_ = i_349_ << aClass555_7584.anInt7421 * 1742303003;
		if (method9517(i_351_ + 1, aClass555_7584.aClass161Array7434[i].method2595(i_348_, i_349_, (byte) 76), i_352_ + 1, i_351_ + aClass555_7584.anInt7422 * -1478371119 - 1, aClass555_7584.aClass161Array7434[i].method2595(i_348_ + 1, i_349_ + 1, (byte) 27), i_352_ + aClass555_7584.anInt7422 * -1478371119 - 1, i_351_ + 1, aClass555_7584.aClass161Array7434[i].method2595(i_348_, i_349_ + 1, (byte) 4), i_352_ + aClass555_7584.anInt7422 * -1478371119 - 1)
				&& method9517(i_351_ + 1, aClass555_7584.aClass161Array7434[i].method2595(i_348_, i_349_, (byte) 90), i_352_ + 1, i_351_ + aClass555_7584.anInt7422 * -1478371119 - 1, aClass555_7584.aClass161Array7434[i].method2595(i_348_ + 1, i_349_, (byte) 107), i_352_ + 1, i_351_ + aClass555_7584.anInt7422 * -1478371119 - 1, aClass555_7584.aClass161Array7434[i].method2595(i_348_ + 1, i_349_ + 1, (byte) 55), (i_352_ + aClass555_7584.anInt7422 * -1478371119 - 1))) {
			anIntArrayArrayArray7592[i][i_348_][i_349_] = aClass555_7584.anInt7429 * -1690479805;
			return true;
		}
		anIntArrayArrayArray7592[i][i_348_][i_349_] = -(aClass555_7584.anInt7429 * -1690479805);
		return false;
	}

	final boolean method9543(Class549 class549) {
		if (class549 == null)
			return false;
		return method9516(class549.anInt7280, class549.anInt7282, class549.anInt7279, class549.anInt7284 - class549.anInt7280, class549.anInt7283 - class549.anInt7282, class549.anInt7285 - class549.anInt7279);
	}

	boolean method9544(Class640_Sub1_Sub3 class640_sub1_sub3, int i, int i_353_, int i_354_) {
		if (!aBool7603 || !aBool7580)
			return false;
		if (aClass564_7585.anInt7576 < 102)
			return false;
		if (!method9549(i, i_353_, i_354_))
			return false;
		int i_355_ = i_353_ << aClass555_7584.anInt7421 * 1742303003;
		int i_356_ = i_354_ << aClass555_7584.anInt7421 * 1742303003;
		int i_357_ = (aClass555_7584.aClass161Array7434[i].method2595(i_353_, i_354_, (byte) 27) - 1);
		int i_358_ = i_357_ + class640_sub1_sub3.method17047(1004008254);
		if (class640_sub1_sub3.aShort11859 == 1) {
			if (!method9517(i_355_, i_357_, i_356_, i_355_, i_358_, i_356_, i_355_, i_358_, i_356_ + aClass555_7584.anInt7422 * -1478371119))
				return false;
			if (!method9517(i_355_, i_357_, i_356_, i_355_, i_358_, i_356_ + aClass555_7584.anInt7422 * -1478371119, i_355_, i_357_, i_356_ + aClass555_7584.anInt7422 * -1478371119))
				return false;
			return true;
		}
		if (class640_sub1_sub3.aShort11859 == 2) {
			if (!method9517(i_355_, i_357_, i_356_ + aClass555_7584.anInt7422 * -1478371119, i_355_ + aClass555_7584.anInt7422 * -1478371119, i_358_, i_356_ + aClass555_7584.anInt7422 * -1478371119, i_355_, i_358_, i_356_ + aClass555_7584.anInt7422 * -1478371119))
				return false;
			if (!method9517(i_355_, i_357_, i_356_ + aClass555_7584.anInt7422 * -1478371119, i_355_ + aClass555_7584.anInt7422 * -1478371119, i_357_, i_356_ + aClass555_7584.anInt7422 * -1478371119, i_355_ + aClass555_7584.anInt7422 * -1478371119, i_358_, i_356_ + aClass555_7584.anInt7422 * -1478371119))
				return false;
			return true;
		}
		if (class640_sub1_sub3.aShort11859 == 4) {
			if (!method9517(i_355_ + aClass555_7584.anInt7422 * -1478371119, i_357_, i_356_, i_355_ + aClass555_7584.anInt7422 * -1478371119, i_358_, i_356_, i_355_ + aClass555_7584.anInt7422 * -1478371119, i_358_, i_356_ + aClass555_7584.anInt7422 * -1478371119))
				return false;
			if (!method9517(i_355_ + aClass555_7584.anInt7422 * -1478371119, i_357_, i_356_, i_355_ + aClass555_7584.anInt7422 * -1478371119, i_358_, i_356_ + aClass555_7584.anInt7422 * -1478371119, i_355_ + aClass555_7584.anInt7422 * -1478371119, i_357_, i_356_ + aClass555_7584.anInt7422 * -1478371119))
				return false;
			return true;
		}
		if (class640_sub1_sub3.aShort11859 == 8) {
			if (!method9517(i_355_, i_357_, i_356_, i_355_ + aClass555_7584.anInt7422 * -1478371119, i_358_, i_356_, i_355_, i_358_, i_356_))
				return false;
			if (!method9517(i_355_, i_357_, i_356_, i_355_ + aClass555_7584.anInt7422 * -1478371119, i_357_, i_356_, i_355_ + aClass555_7584.anInt7422 * -1478371119, i_358_, i_356_))
				return false;
			return true;
		}
		if (class640_sub1_sub3.aShort11859 == 16) {
			if (!method9516(i_355_, i_357_, i_356_ + aClass555_7584.anInt7471 * -1485744437, aClass555_7584.anInt7471 * -1485744437, i_358_, aClass555_7584.anInt7471 * -1485744437))
				return false;
			return true;
		}
		if (class640_sub1_sub3.aShort11859 == 32) {
			if (!method9516(i_355_ + aClass555_7584.anInt7471 * -1485744437, i_357_, i_356_ + aClass555_7584.anInt7471 * -1485744437, aClass555_7584.anInt7471 * -1485744437, i_358_, aClass555_7584.anInt7471 * -1485744437))
				return false;
			return true;
		}
		if (class640_sub1_sub3.aShort11859 == 64) {
			if (!method9516(i_355_ + aClass555_7584.anInt7471 * -1485744437, i_357_, i_356_, aClass555_7584.anInt7471 * -1485744437, i_358_, aClass555_7584.anInt7471 * -1485744437))
				return false;
			return true;
		}
		if (class640_sub1_sub3.aShort11859 == 128) {
			if (!method9516(i_355_, i_357_, i_356_, aClass555_7584.anInt7471 * -1485744437, i_358_, aClass555_7584.anInt7471 * -1485744437))
				return false;
			return true;
		}
		return true;
	}

	boolean method9545(Class640_Sub1_Sub3 class640_sub1_sub3, int i, int i_359_, int i_360_) {
		if (!aBool7603 || !aBool7580)
			return false;
		if (aClass564_7585.anInt7576 < 102)
			return false;
		if (!method9549(i, i_359_, i_360_))
			return false;
		int i_361_ = i_359_ << aClass555_7584.anInt7421 * 1742303003;
		int i_362_ = i_360_ << aClass555_7584.anInt7421 * 1742303003;
		int i_363_ = (aClass555_7584.aClass161Array7434[i].method2595(i_359_, i_360_, (byte) 114) - 1);
		int i_364_ = i_363_ + class640_sub1_sub3.method17047(1004008254);
		if (class640_sub1_sub3.aShort11859 == 1) {
			if (!method9517(i_361_, i_363_, i_362_, i_361_, i_364_, i_362_, i_361_, i_364_, i_362_ + aClass555_7584.anInt7422 * -1478371119))
				return false;
			if (!method9517(i_361_, i_363_, i_362_, i_361_, i_364_, i_362_ + aClass555_7584.anInt7422 * -1478371119, i_361_, i_363_, i_362_ + aClass555_7584.anInt7422 * -1478371119))
				return false;
			return true;
		}
		if (class640_sub1_sub3.aShort11859 == 2) {
			if (!method9517(i_361_, i_363_, i_362_ + aClass555_7584.anInt7422 * -1478371119, i_361_ + aClass555_7584.anInt7422 * -1478371119, i_364_, i_362_ + aClass555_7584.anInt7422 * -1478371119, i_361_, i_364_, i_362_ + aClass555_7584.anInt7422 * -1478371119))
				return false;
			if (!method9517(i_361_, i_363_, i_362_ + aClass555_7584.anInt7422 * -1478371119, i_361_ + aClass555_7584.anInt7422 * -1478371119, i_363_, i_362_ + aClass555_7584.anInt7422 * -1478371119, i_361_ + aClass555_7584.anInt7422 * -1478371119, i_364_, i_362_ + aClass555_7584.anInt7422 * -1478371119))
				return false;
			return true;
		}
		if (class640_sub1_sub3.aShort11859 == 4) {
			if (!method9517(i_361_ + aClass555_7584.anInt7422 * -1478371119, i_363_, i_362_, i_361_ + aClass555_7584.anInt7422 * -1478371119, i_364_, i_362_, i_361_ + aClass555_7584.anInt7422 * -1478371119, i_364_, i_362_ + aClass555_7584.anInt7422 * -1478371119))
				return false;
			if (!method9517(i_361_ + aClass555_7584.anInt7422 * -1478371119, i_363_, i_362_, i_361_ + aClass555_7584.anInt7422 * -1478371119, i_364_, i_362_ + aClass555_7584.anInt7422 * -1478371119, i_361_ + aClass555_7584.anInt7422 * -1478371119, i_363_, i_362_ + aClass555_7584.anInt7422 * -1478371119))
				return false;
			return true;
		}
		if (class640_sub1_sub3.aShort11859 == 8) {
			if (!method9517(i_361_, i_363_, i_362_, i_361_ + aClass555_7584.anInt7422 * -1478371119, i_364_, i_362_, i_361_, i_364_, i_362_))
				return false;
			if (!method9517(i_361_, i_363_, i_362_, i_361_ + aClass555_7584.anInt7422 * -1478371119, i_363_, i_362_, i_361_ + aClass555_7584.anInt7422 * -1478371119, i_364_, i_362_))
				return false;
			return true;
		}
		if (class640_sub1_sub3.aShort11859 == 16) {
			if (!method9516(i_361_, i_363_, i_362_ + aClass555_7584.anInt7471 * -1485744437, aClass555_7584.anInt7471 * -1485744437, i_364_, aClass555_7584.anInt7471 * -1485744437))
				return false;
			return true;
		}
		if (class640_sub1_sub3.aShort11859 == 32) {
			if (!method9516(i_361_ + aClass555_7584.anInt7471 * -1485744437, i_363_, i_362_ + aClass555_7584.anInt7471 * -1485744437, aClass555_7584.anInt7471 * -1485744437, i_364_, aClass555_7584.anInt7471 * -1485744437))
				return false;
			return true;
		}
		if (class640_sub1_sub3.aShort11859 == 64) {
			if (!method9516(i_361_ + aClass555_7584.anInt7471 * -1485744437, i_363_, i_362_, aClass555_7584.anInt7471 * -1485744437, i_364_, aClass555_7584.anInt7471 * -1485744437))
				return false;
			return true;
		}
		if (class640_sub1_sub3.aShort11859 == 128) {
			if (!method9516(i_361_, i_363_, i_362_, aClass555_7584.anInt7471 * -1485744437, i_364_, aClass555_7584.anInt7471 * -1485744437))
				return false;
			return true;
		}
		return true;
	}

	boolean method9546(int i, int i_365_, int i_366_, int i_367_) {
		if (!aBool7603 || !aBool7580)
			return false;
		if (aClass564_7585.anInt7576 < 102)
			return false;
		if (!method9549(i, i_365_, i_366_))
			return false;
		int i_368_ = i_365_ << aClass555_7584.anInt7421 * 1742303003;
		int i_369_ = i_366_ << aClass555_7584.anInt7421 * 1742303003;
		if (method9516(i_368_, aClass555_7584.aClass161Array7434[i].method2595(i_365_, i_366_, (byte) 31), i_369_, aClass555_7584.anInt7422 * -1478371119, i_367_, aClass555_7584.anInt7422 * -1478371119))
			return true;
		return false;
	}

	boolean method9547(int i, int i_370_, int i_371_, int i_372_, int i_373_, Class549 class549) {
		if (!aBool7603 || !aBool7580)
			return false;
		if (aClass564_7585.anInt7576 < 102)
			return false;
		if (i_370_ < 0 || i_372_ < 0 || i_371_ >= anIntArrayArrayArray7592[i].length || i_373_ >= anIntArrayArrayArray7592[i][i_370_].length)
			return false;
		if (i_370_ == i_371_ && i_372_ == i_373_) {
			if (!method9549(i, i_370_, i_372_))
				return false;
			if (method9515(class549))
				return true;
			return false;
		}
		for (int i_374_ = i_370_; i_374_ <= i_371_; i_374_++) {
			for (int i_375_ = i_372_; i_375_ <= i_373_; i_375_++) {
				if (anIntArrayArrayArray7592[i][i_374_][i_375_] == -(aClass555_7584.anInt7429 * -1690479805))
					return false;
			}
		}
		if (!method9515(class549))
			return false;
		return true;
	}

	void method9548(Class180 class180, Class560 class560, int i) {
		aClass180_7604 = class180;
		if (anIntArray7598 != null && class560.aByte7539 >= i) {
			for (int i_376_ = 0; i_376_ < anIntArray7598.length; i_376_++) {
				if (anIntArray7598[i_376_] != -1000000 && (class560.anIntArray7545[0] <= anIntArray7598[i_376_] || class560.anIntArray7545[1] <= anIntArray7598[i_376_] || class560.anIntArray7545[2] <= anIntArray7598[i_376_] || (class560.anIntArray7545[3] <= anIntArray7598[i_376_]))
						&& (class560.anIntArray7544[0] <= anIntArray7600[i_376_] || class560.anIntArray7544[1] <= anIntArray7600[i_376_] || class560.anIntArray7544[2] <= anIntArray7600[i_376_] || (class560.anIntArray7544[3] <= anIntArray7600[i_376_])) && (class560.anIntArray7544[0] >= anIntArray7605[i_376_] || class560.anIntArray7544[1] >= anIntArray7605[i_376_] || class560.anIntArray7544[2] >= anIntArray7605[i_376_] || (class560.anIntArray7544[3] >= anIntArray7605[i_376_]))
						&& (class560.anIntArray7543[0] <= anIntArray7608[i_376_] || class560.anIntArray7543[1] <= anIntArray7608[i_376_] || class560.anIntArray7543[2] <= anIntArray7608[i_376_] || (class560.anIntArray7543[3] <= anIntArray7608[i_376_])) && (class560.anIntArray7543[0] >= anIntArray7602[i_376_] || class560.anIntArray7543[1] >= anIntArray7602[i_376_] || class560.anIntArray7543[2] >= anIntArray7602[i_376_] || (class560.anIntArray7543[3] >= anIntArray7602[i_376_])))
					return;
			}
		}
		if (class560.aByte7535 == 1) {
			int i_377_ = (class560.aShort7540 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
			if (i_377_ >= 0 && i_377_ <= (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325)) {
				int i_378_ = (class560.aShort7537 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_378_ < 0)
					i_378_ = 0;
				else if (i_378_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					return;
				int i_379_ = (class560.aShort7538 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_379_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					i_379_ = (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325);
				else if (i_379_ < 0)
					return;
				boolean bool = false;
				while_40_: do {
					do {
						if (i_378_ > i_379_)
							break while_40_;
					} while (!aClass555_7584.aBoolArrayArray7467[i_377_][i_378_++]);
					bool = true;
				} while (false);
				if (bool) {
					float f = (float) (aClass555_7584.anInt7459 * 120302175 - class560.anIntArray7544[0]);
					if (f < 0.0F)
						f *= -1.0F;
					if (!(f < (float) anInt7587) && method9509(class560, 0) && method9509(class560, 1) && method9509(class560, 2) && method9509(class560, 3))
						aClass560Array7597[anInt7590++] = class560;
				}
			}
		} else if (class560.aByte7535 == 2) {
			int i_380_ = (class560.aShort7537 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
			if (i_380_ >= 0 && i_380_ <= (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325)) {
				int i_381_ = (class560.aShort7540 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
				if (i_381_ < 0)
					i_381_ = 0;
				else if (i_381_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					return;
				int i_382_ = (class560.aShort7541 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
				if (i_382_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					i_382_ = (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325);
				else if (i_382_ < 0)
					return;
				boolean bool = false;
				while_41_: do {
					do {
						if (i_381_ > i_382_)
							break while_41_;
					} while (!aClass555_7584.aBoolArrayArray7467[i_381_++][i_380_]);
					bool = true;
				} while (false);
				if (bool) {
					float f = (float) (aClass555_7584.anInt7460 * 2047098835 - class560.anIntArray7543[0]);
					if (f < 0.0F)
						f *= -1.0F;
					if (!(f < (float) anInt7587) && method9509(class560, 0) && method9509(class560, 1) && method9509(class560, 2) && method9509(class560, 3))
						aClass560Array7597[anInt7590++] = class560;
				}
			}
		} else if (class560.aByte7535 == 16 || class560.aByte7535 == 8) {
			int i_383_ = (class560.aShort7540 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
			if (i_383_ >= 0 && i_383_ <= (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325)) {
				int i_384_ = (class560.aShort7537 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_384_ >= 0 && i_384_ <= (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325) && aClass555_7584.aBoolArrayArray7467[i_383_][i_384_]) {
					float f = (float) (aClass555_7584.anInt7459 * 120302175 - class560.anIntArray7544[0]);
					if (f < 0.0F)
						f *= -1.0F;
					float f_385_ = (float) (aClass555_7584.anInt7460 * 2047098835 - class560.anIntArray7543[0]);
					if (f_385_ < 0.0F)
						f_385_ *= -1.0F;
					if ((!(f < (float) anInt7587) || !(f_385_ < (float) anInt7587)) && method9509(class560, 0) && method9509(class560, 1) && method9509(class560, 2) && method9509(class560, 3))
						aClass560Array7597[anInt7590++] = class560;
				}
			}
		} else if (class560.aByte7535 == 4) {
			float f = (float) (class560.anIntArray7545[0] - aClass555_7584.anInt7461 * -1990869435);
			if (!(f <= (float) anInt7588)) {
				int i_386_ = (class560.aShort7537 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_386_ < 0)
					i_386_ = 0;
				else if (i_386_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					return;
				int i_387_ = (class560.aShort7538 - aClass555_7584.anInt7458 * 64349821 + aClass555_7584.anInt7463 * 1329492325);
				if (i_387_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					i_387_ = (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325);
				else if (i_387_ < 0)
					return;
				int i_388_ = (class560.aShort7540 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
				if (i_388_ < 0)
					i_388_ = 0;
				else if (i_388_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					return;
				int i_389_ = (class560.aShort7541 - aClass555_7584.anInt7431 * 1968897173 + aClass555_7584.anInt7463 * 1329492325);
				if (i_389_ > (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325))
					i_389_ = (aClass555_7584.anInt7463 * 1329492325 + aClass555_7584.anInt7463 * 1329492325);
				else if (i_389_ < 0)
					return;
				boolean bool = false;
				while_42_: for (int i_390_ = i_388_; i_390_ <= i_389_; i_390_++) {
					for (int i_391_ = i_386_; i_391_ <= i_387_; i_391_++) {
						if (aClass555_7584.aBoolArrayArray7467[i_390_][i_391_]) {
							bool = true;
							break while_42_;
						}
					}
				}
				if (bool && method9509(class560, 0) && method9509(class560, 1) && method9509(class560, 2) && method9509(class560, 3))
					aClass560Array7597[anInt7590++] = class560;
			}
		}
	}

	boolean method9549(int i, int i_392_, int i_393_) {
		if (!aBool7603 || !aBool7580)
			return false;
		if (aClass564_7585.anInt7576 < 102)
			return false;
		int i_394_ = anIntArrayArrayArray7592[i][i_392_][i_393_];
		if (i_394_ == -(aClass555_7584.anInt7429 * -1690479805))
			return false;
		if (i_394_ == aClass555_7584.anInt7429 * -1690479805)
			return true;
		if (aClass555_7584.aClass161Array7434 == aClass555_7584.aClass161Array7435)
			return false;
		int i_395_ = i_392_ << aClass555_7584.anInt7421 * 1742303003;
		int i_396_ = i_393_ << aClass555_7584.anInt7421 * 1742303003;
		if (method9517(i_395_ + 1, aClass555_7584.aClass161Array7434[i].method2595(i_392_, i_393_, (byte) 66), i_396_ + 1, i_395_ + aClass555_7584.anInt7422 * -1478371119 - 1, aClass555_7584.aClass161Array7434[i].method2595(i_392_ + 1, i_393_ + 1, (byte) 48), i_396_ + aClass555_7584.anInt7422 * -1478371119 - 1, i_395_ + 1, aClass555_7584.aClass161Array7434[i].method2595(i_392_, i_393_ + 1, (byte) 31), i_396_ + aClass555_7584.anInt7422 * -1478371119 - 1)
				&& method9517(i_395_ + 1, aClass555_7584.aClass161Array7434[i].method2595(i_392_, i_393_, (byte) 21), i_396_ + 1, i_395_ + aClass555_7584.anInt7422 * -1478371119 - 1, aClass555_7584.aClass161Array7434[i].method2595(i_392_ + 1, i_393_, (byte) 84), i_396_ + 1, i_395_ + aClass555_7584.anInt7422 * -1478371119 - 1, aClass555_7584.aClass161Array7434[i].method2595(i_392_ + 1, i_393_ + 1, (byte) 22), (i_396_ + aClass555_7584.anInt7422 * -1478371119 - 1))) {
			anIntArrayArrayArray7592[i][i_392_][i_393_] = aClass555_7584.anInt7429 * -1690479805;
			return true;
		}
		anIntArrayArrayArray7592[i][i_392_][i_393_] = -(aClass555_7584.anInt7429 * -1690479805);
		return false;
	}

	boolean method9550(int i, int i_397_, int i_398_, int i_399_, int i_400_, Class549 class549) {
		if (!aBool7603 || !aBool7580)
			return false;
		if (aClass564_7585.anInt7576 < 102)
			return false;
		if (i_397_ < 0 || i_399_ < 0 || i_398_ >= anIntArrayArrayArray7592[i].length || i_400_ >= anIntArrayArrayArray7592[i][i_397_].length)
			return false;
		if (i_397_ == i_398_ && i_399_ == i_400_) {
			if (!method9549(i, i_397_, i_399_))
				return false;
			if (method9515(class549))
				return true;
			return false;
		}
		for (int i_401_ = i_397_; i_401_ <= i_398_; i_401_++) {
			for (int i_402_ = i_399_; i_402_ <= i_400_; i_402_++) {
				if (anIntArrayArrayArray7592[i][i_401_][i_402_] == -(aClass555_7584.anInt7429 * -1690479805))
					return false;
			}
		}
		if (!method9515(class549))
			return false;
		return true;
	}

	final boolean method9551(Class549 class549) {
		if (class549 == null)
			return false;
		return method9516(class549.anInt7280, class549.anInt7282, class549.anInt7279, class549.anInt7284 - class549.anInt7280, class549.anInt7283 - class549.anInt7282, class549.anInt7285 - class549.anInt7279);
	}

	void method9552() {
		for (int i = 0; i < anInt7589; i++)
			aClass560Array7593[i] = null;
		anInt7589 = 0;
		for (int i = 0; i < aClass555_7584.anInt7466 * -1609909485; i++) {
			for (int i_403_ = 0; i_403_ < aClass555_7584.anInt7443 * -547681223; i_403_++) {
				for (int i_404_ = 0; i_404_ < aClass555_7584.anInt7432 * -1437024153; i_404_++) {
					Class561 class561 = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_404_][i_403_]);
					if (class561 != null) {
						if (class561.aShort7559 > 0)
							class561.aShort7559 *= -1;
						if (class561.aShort7561 > 0)
							class561.aShort7561 *= -1;
					}
				}
			}
		}
		for (int i = 0; i < aClass555_7584.anInt7466 * -1609909485; i++) {
			for (int i_405_ = 0; i_405_ < aClass555_7584.anInt7443 * -547681223; i_405_++) {
				for (int i_406_ = 0; i_406_ < aClass555_7584.anInt7432 * -1437024153; i_406_++) {
					Class561 class561 = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_406_][i_405_]);
					if (class561 != null) {
						boolean bool = ((aClass555_7584.aClass561ArrayArrayArray7426[0][i_406_][i_405_]) != null && ((aClass555_7584.aClass561ArrayArrayArray7426[0][i_406_][i_405_].aClass561_7554) != null));
						if (class561.aShort7559 < 0) {
							int i_407_ = i_405_;
							int i_408_ = i_405_;
							int i_409_ = i;
							int i_410_ = i;
							Class561 class561_411_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_406_][i_407_ - 1]);
							int i_412_;
							for (i_412_ = (aClass555_7584.aClass161Array7457[i].method2595(i_406_, i_405_, (byte) 69)); (i_407_ > 0 && class561_411_ != null && class561_411_.aShort7559 < 0 && (class561_411_.aShort7559 == class561.aShort7559) && (class561_411_.aShort7560 == class561.aShort7560) && (i_412_ == (aClass555_7584.aClass161Array7457[i].method2595(i_406_, i_407_ - 1, (byte) 39)))
									&& (i_407_ - 1 <= 0 || i_412_ == (aClass555_7584.aClass161Array7457[i].method2595(i_406_, i_407_ - 2, (byte) 126))) && i_408_ - i_407_ <= 10); class561_411_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_406_][i_407_ - 1]))
								i_407_--;
							for (class561_411_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_406_][i_408_ + 1]); ((i_408_ < aClass555_7584.anInt7432 * -1437024153) && class561_411_ != null && class561_411_.aShort7559 < 0 && (class561_411_.aShort7559 == class561.aShort7559) && (class561_411_.aShort7560 == class561.aShort7560) && (i_412_ == (aClass555_7584.aClass161Array7457[i].method2595(i_406_, i_408_ + 1, (byte) 89)))
									&& (i_408_ + 1 >= (aClass555_7584.anInt7432 * -1437024153) || i_412_ == (aClass555_7584.aClass161Array7457[i].method2595(i_406_, i_408_ + 2, (byte) 126))) && i_408_ - i_407_ <= 10); class561_411_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_406_][i_408_ + 1]))
								i_408_++;
							int i_413_ = i_410_ - i_409_ + 1;
							int i_414_ = aClass555_7584.aClass161Array7457[bool ? i_409_ + 1 : i_409_].method2595(i_406_, i_407_, (byte) 100);
							int i_415_ = i_414_ + class561.aShort7559 * i_413_;
							int i_416_ = (aClass555_7584.aClass161Array7457[bool ? i_409_ + 1 : i_409_].method2595(i_406_, i_408_ + 1, (byte) 123));
							int i_417_ = i_416_ + class561.aShort7559 * i_413_;
							int i_418_ = (i_406_ << aClass555_7584.anInt7421 * 1742303003);
							int i_419_ = (i_407_ << aClass555_7584.anInt7421 * 1742303003);
							int i_420_ = ((i_408_ << aClass555_7584.anInt7421 * 1742303003) + aClass555_7584.anInt7422 * -1478371119);
							aClass560Array7593[anInt7589++] = new Class560(aClass555_7584, 1, i_410_, i_418_ + class561.aShort7560, i_418_ + class561.aShort7560, i_418_ + class561.aShort7560, i_418_ + class561.aShort7560, i_414_, i_416_, i_417_, i_415_, i_419_, i_420_, i_420_, i_419_);
							for (int i_421_ = i_409_; i_421_ <= i_410_; i_421_++) {
								for (int i_422_ = i_407_; i_422_ <= i_408_; i_422_++)
									aClass555_7584.aClass561ArrayArrayArray7426[i_421_][i_406_][i_422_].aShort7559 *= -1;
							}
						}
						if (class561.aShort7561 < 0) {
							int i_423_ = i_406_;
							int i_424_ = i_406_;
							int i_425_ = i;
							int i_426_ = i;
							Class561 class561_427_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_423_ - 1][i_405_]);
							int i_428_;
							for (i_428_ = (aClass555_7584.aClass161Array7457[i].method2595(i_406_, i_405_, (byte) 101)); (i_423_ > 0 && class561_427_ != null && class561_427_.aShort7561 < 0 && (class561_427_.aShort7561 == class561.aShort7561) && (class561_427_.aShort7551 == class561.aShort7551) && (i_428_ == (aClass555_7584.aClass161Array7457[i].method2595(i_423_ - 1, i_405_, (byte) 96)))
									&& (i_423_ - 1 <= 0 || i_428_ == (aClass555_7584.aClass161Array7457[i].method2595(i_423_ - 2, i_405_, (byte) 86))) && i_424_ - i_423_ <= 10); class561_427_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_423_ - 1][i_405_]))
								i_423_--;
							for (class561_427_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_424_ + 1][i_405_]); ((i_424_ < aClass555_7584.anInt7443 * -547681223) && class561_427_ != null && class561_427_.aShort7561 < 0 && (class561_427_.aShort7561 == class561.aShort7561) && (class561_427_.aShort7551 == class561.aShort7551) && (i_428_ == (aClass555_7584.aClass161Array7457[i].method2595(i_424_ + 1, i_405_, (byte) 24)))
									&& (i_424_ + 1 >= (aClass555_7584.anInt7443 * -547681223) || i_428_ == (aClass555_7584.aClass161Array7457[i].method2595(i_424_ + 2, i_405_, (byte) 43))) && i_424_ - i_423_ <= 10); class561_427_ = (aClass555_7584.aClass561ArrayArrayArray7426[i][i_424_ + 1][i_405_]))
								i_424_++;
							int i_429_ = i_426_ - i_425_ + 1;
							int i_430_ = aClass555_7584.aClass161Array7457[bool ? i_425_ + 1 : i_425_].method2595(i_423_, i_405_, (byte) 101);
							int i_431_ = i_430_ + class561.aShort7561 * i_429_;
							int i_432_ = (aClass555_7584.aClass161Array7457[bool ? i_425_ + 1 : i_425_].method2595(i_424_ + 1, i_405_, (byte) 74));
							int i_433_ = i_432_ + class561.aShort7561 * i_429_;
							int i_434_ = (i_423_ << aClass555_7584.anInt7421 * 1742303003);
							int i_435_ = ((i_424_ << aClass555_7584.anInt7421 * 1742303003) + aClass555_7584.anInt7422 * -1478371119);
							int i_436_ = (i_405_ << aClass555_7584.anInt7421 * 1742303003);
							aClass560Array7593[anInt7589++] = new Class560(aClass555_7584, 2, i_426_, i_434_, i_435_, i_435_, i_434_, i_430_, i_432_, i_433_, i_431_, i_436_ + class561.aShort7551, i_436_ + class561.aShort7551, i_436_ + class561.aShort7551, i_436_ + class561.aShort7551);
							for (int i_437_ = i_425_; i_437_ <= i_426_; i_437_++) {
								for (int i_438_ = i_423_; i_438_ <= i_424_; i_438_++)
									aClass555_7584.aClass561ArrayArrayArray7426[i_437_][i_438_][i_405_].aShort7561 *= -1;
							}
						}
					}
				}
			}
		}
		aBool7586 = true;
	}

	final boolean method9553(int i, int i_439_, int i_440_, int i_441_, int i_442_, int i_443_) {
		int i_444_ = i + i_441_;
		int i_445_ = i_439_ + i_442_;
		int i_446_ = i_440_ + i_443_;
		if (!method9517(i, i_445_, i_440_, i_444_, i_445_, i_446_, i, i_445_, i_446_))
			return false;
		if (!method9517(i, i_445_, i_440_, i_444_, i_445_, i_440_, i_444_, i_445_, i_446_))
			return false;
		if (i < aClass555_7584.anInt7459 * 120302175) {
			if (!method9517(i, i_439_, i_446_, i, i_445_, i_440_, i, i_445_, i_446_))
				return false;
			if (!method9517(i, i_439_, i_446_, i, i_439_, i_440_, i, i_445_, i_440_))
				return false;
		} else {
			if (!method9517(i_444_, i_439_, i_446_, i_444_, i_445_, i_440_, i_444_, i_445_, i_446_))
				return false;
			if (!method9517(i_444_, i_439_, i_446_, i_444_, i_439_, i_440_, i_444_, i_445_, i_440_))
				return false;
		}
		if (i_440_ < aClass555_7584.anInt7460 * 2047098835) {
			if (!method9517(i, i_439_, i_440_, i_444_, i_445_, i_440_, i, i_445_, i_440_))
				return false;
			if (!method9517(i, i_439_, i_440_, i_444_, i_439_, i_440_, i_444_, i_445_, i_440_))
				return false;
		} else {
			if (!method9517(i, i_439_, i_446_, i_444_, i_445_, i_446_, i, i_445_, i_446_))
				return false;
			if (!method9517(i, i_439_, i_446_, i_444_, i_439_, i_446_, i_444_, i_445_, i_446_))
				return false;
		}
		return true;
	}

	final boolean method9554(int i, int i_447_, int i_448_) {
		aClass180_7604.method3333((float) i, (float) i_447_, (float) i_448_, aFloatArray7596);
		if (aFloatArray7596[2] < 50.0F)
			return false;
		aFloatArray7596[0] /= 3.0F;
		aFloatArray7596[1] /= 3.0F;
		return true;
	}

	final boolean method9555(int i, int i_449_, int i_450_, int i_451_, int i_452_, int i_453_) {
		int i_454_ = i + i_451_;
		int i_455_ = i_449_ + i_452_;
		int i_456_ = i_450_ + i_453_;
		if (!method9517(i, i_455_, i_450_, i_454_, i_455_, i_456_, i, i_455_, i_456_))
			return false;
		if (!method9517(i, i_455_, i_450_, i_454_, i_455_, i_450_, i_454_, i_455_, i_456_))
			return false;
		if (i < aClass555_7584.anInt7459 * 120302175) {
			if (!method9517(i, i_449_, i_456_, i, i_455_, i_450_, i, i_455_, i_456_))
				return false;
			if (!method9517(i, i_449_, i_456_, i, i_449_, i_450_, i, i_455_, i_450_))
				return false;
		} else {
			if (!method9517(i_454_, i_449_, i_456_, i_454_, i_455_, i_450_, i_454_, i_455_, i_456_))
				return false;
			if (!method9517(i_454_, i_449_, i_456_, i_454_, i_449_, i_450_, i_454_, i_455_, i_450_))
				return false;
		}
		if (i_450_ < aClass555_7584.anInt7460 * 2047098835) {
			if (!method9517(i, i_449_, i_450_, i_454_, i_455_, i_450_, i, i_455_, i_450_))
				return false;
			if (!method9517(i, i_449_, i_450_, i_454_, i_449_, i_450_, i_454_, i_455_, i_450_))
				return false;
		} else {
			if (!method9517(i, i_449_, i_456_, i_454_, i_455_, i_456_, i, i_455_, i_456_))
				return false;
			if (!method9517(i, i_449_, i_456_, i_454_, i_449_, i_456_, i_454_, i_455_, i_456_))
				return false;
		}
		return true;
	}

	final boolean method9556(int i, int i_457_, int i_458_, int i_459_, int i_460_, int i_461_, int i_462_, int i_463_, int i_464_) {
		if (!method9524(i, i_457_, i_458_))
			return false;
		i = (int) aFloatArray7596[0];
		i_457_ = (int) aFloatArray7596[1];
		i_458_ = (int) aFloatArray7596[2];
		if (!method9524(i_459_, i_460_, i_461_))
			return false;
		i_459_ = (int) aFloatArray7596[0];
		i_460_ = (int) aFloatArray7596[1];
		i_461_ = (int) aFloatArray7596[2];
		if (!method9524(i_462_, i_463_, i_464_))
			return false;
		i_462_ = (int) aFloatArray7596[0];
		i_463_ = (int) aFloatArray7596[1];
		i_464_ = (int) aFloatArray7596[2];
		return aClass564_7585.method9485(i_457_, i_460_, i_463_, i, i_459_, i_462_, i_458_, i_461_, i_464_);
	}
}
