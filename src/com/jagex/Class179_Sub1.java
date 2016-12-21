/* Class179_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class179_Sub1 extends Class179 {
	int anInt9526;
	int anInt9527;
	int anInt9528;
	int anInt9529;
	int anInt9530;
	int anInt9531;
	int[] anIntArray9532;
	boolean aBool9533 = false;

	public void method2685(int i) {
		int i_0_ = 0;
		aBool9533 = false;
		int[] is = new int[anInt9526 * anInt9527];
		for (int i_1_ = 0; i_1_ < anInt9527; i_1_++) {
			for (int i_2_ = 0; i_2_ < anInt9526; i_2_++) {
				int i_3_ = anIntArray9532[i_0_];
				if ((i_3_ & ~0xffffff) == 0) {
					if (i_2_ > 0 && (anIntArray9532[i_0_ - 1] & ~0xffffff) != 0)
						i_3_ = i;
					else if (i_1_ > 0 && (anIntArray9532[i_0_ - anInt9526] & ~0xffffff) != 0)
						i_3_ = i;
					else if (i_2_ < anInt9526 - 1 && (anIntArray9532[i_0_ + 1] & ~0xffffff) != 0)
						i_3_ = i;
					else if (i_1_ < anInt9527 - 1 && ((anIntArray9532[i_0_ + anInt9526] & ~0xffffff) != 0))
						i_3_ = i;
				}
				if ((i_3_ & ~0xffffff) != -16777216)
					aBool9533 = true;
				is[i_0_++] = i_3_;
			}
		}
		anIntArray9532 = is;
	}

	public int[] method2679(boolean bool) {
		if (bool && (method2640() != anInt9526 || method2671() != anInt9527)) {
			int i = method2640();
			int[] is = new int[i * method2671()];
			for (int i_4_ = 0; i_4_ < anInt9527; i_4_++) {
				int i_5_ = i_4_ * anInt9526;
				int i_6_ = anInt9528 + (i_4_ + anInt9530) * i;
				for (int i_7_ = 0; i_7_ < anInt9526; i_7_++) {
					is[i_6_++] = anIntArray9532[i_5_];
					i_5_++;
				}
			}
			return is;
		}
		return anIntArray9532;
	}

	public void method2645(int i) {
		int i_8_ = method2640();
		int i_9_ = method2671();
		if (anInt9526 != i_8_ || anInt9527 != i_9_) {
			int i_10_ = i;
			if (i_10_ > anInt9528)
				i_10_ = anInt9528;
			int i_11_ = i;
			if (i_11_ + anInt9528 + anInt9526 > i_8_)
				i_11_ = i_8_ - anInt9528 - anInt9526;
			int i_12_ = i;
			if (i_12_ > anInt9530)
				i_12_ = anInt9530;
			int i_13_ = i;
			if (i_13_ + anInt9530 + anInt9527 > i_9_)
				i_13_ = i_9_ - anInt9530 - anInt9527;
			int i_14_ = anInt9526 + i_10_ + i_11_;
			int i_15_ = anInt9527 + i_12_ + i_13_;
			int[] is = new int[i_14_ * i_15_];
			aBool9533 = false;
			for (int i_16_ = 0; i_16_ < anInt9527; i_16_++) {
				int i_17_ = i_16_ * anInt9526;
				int i_18_ = (i_16_ + i_12_) * i_14_ + i_10_;
				for (int i_19_ = 0; i_19_ < anInt9526; i_19_++) {
					if ((anIntArray9532[i_17_] & ~0xffffff) != -16777216)
						aBool9533 = true;
					is[i_18_++] = anIntArray9532[i_17_++];
				}
			}
			anInt9528 -= i_10_;
			anInt9530 -= i_12_;
			anInt9529 -= i_11_;
			anInt9531 -= i_13_;
			anInt9526 = i_14_;
			anInt9527 = i_15_;
			anIntArray9532 = is;
		}
	}

	public int method2633() {
		return anInt9526;
	}

	public int method2636() {
		return anInt9529;
	}

	public int method2640() {
		return anInt9526 + anInt9528 + anInt9529;
	}

	public int method2671() {
		return anInt9527 + anInt9530 + anInt9531;
	}

	public int method2635() {
		return anInt9528;
	}

	public boolean method2690() {
		return false;
	}

	public int method2637() {
		return anInt9530;
	}

	public int[] method2643(boolean bool) {
		if (bool && (method2640() != anInt9526 || method2671() != anInt9527)) {
			int i = method2640();
			int[] is = new int[i * method2671()];
			for (int i_20_ = 0; i_20_ < anInt9527; i_20_++) {
				int i_21_ = i_20_ * anInt9526;
				int i_22_ = anInt9528 + (i_20_ + anInt9530) * i;
				for (int i_23_ = 0; i_23_ < anInt9526; i_23_++) {
					is[i_22_++] = anIntArray9532[i_21_];
					i_21_++;
				}
			}
			return is;
		}
		return anIntArray9532;
	}

	public boolean method2641() {
		return aBool9533;
	}

	public void method2642(int i) {
		int i_24_ = method2640();
		int i_25_ = method2671();
		if (anInt9526 != i_24_ || anInt9527 != i_25_) {
			int i_26_ = i;
			if (i_26_ > anInt9528)
				i_26_ = anInt9528;
			int i_27_ = i;
			if (i_27_ + anInt9528 + anInt9526 > i_24_)
				i_27_ = i_24_ - anInt9528 - anInt9526;
			int i_28_ = i;
			if (i_28_ > anInt9530)
				i_28_ = anInt9530;
			int i_29_ = i;
			if (i_29_ + anInt9530 + anInt9527 > i_25_)
				i_29_ = i_25_ - anInt9530 - anInt9527;
			int i_30_ = anInt9526 + i_26_ + i_27_;
			int i_31_ = anInt9527 + i_28_ + i_29_;
			int[] is = new int[i_30_ * i_31_];
			aBool9533 = false;
			for (int i_32_ = 0; i_32_ < anInt9527; i_32_++) {
				int i_33_ = i_32_ * anInt9526;
				int i_34_ = (i_32_ + i_28_) * i_30_ + i_26_;
				for (int i_35_ = 0; i_35_ < anInt9526; i_35_++) {
					if ((anIntArray9532[i_33_] & ~0xffffff) != -16777216)
						aBool9533 = true;
					is[i_34_++] = anIntArray9532[i_33_++];
				}
			}
			anInt9528 -= i_26_;
			anInt9530 -= i_28_;
			anInt9529 -= i_27_;
			anInt9531 -= i_29_;
			anInt9526 = i_30_;
			anInt9527 = i_31_;
			anIntArray9532 = is;
		}
	}

	public void method2676() {
		int[] is = new int[anInt9526 * anInt9527];
		int i = 0;
		for (int i_36_ = 0; i_36_ < anInt9526; i_36_++) {
			for (int i_37_ = anInt9527 - 1; i_37_ >= 0; i_37_--)
				is[i++] = anIntArray9532[i_36_ + i_37_ * anInt9526];
		}
		anIntArray9532 = is;
		int i_38_ = anInt9530;
		anInt9530 = anInt9528;
		anInt9528 = anInt9531;
		anInt9531 = anInt9529;
		anInt9529 = i_38_;
		i_38_ = anInt9527;
		anInt9527 = anInt9526;
		anInt9526 = i_38_;
	}

	public void method2644(int i) {
		for (int i_39_ = anInt9527 - 1; i_39_ > 0; i_39_--) {
			int i_40_ = i_39_ * anInt9526;
			for (int i_41_ = anInt9526 - 1; i_41_ > 0; i_41_--) {
				if ((anIntArray9532[i_41_ + i_40_] & ~0xffffff) == 0 && (anIntArray9532[i_41_ + i_40_ - 1 - anInt9526] & ~0xffffff) != 0)
					anIntArray9532[i_41_ + i_40_] = i;
			}
		}
	}

	public boolean method2631() {
		return false;
	}

	public int method2693() {
		return anInt9528;
	}

	public void method2647() {
		int[] is = new int[anInt9526 * anInt9527];
		int i = 0;
		for (int i_42_ = 0; i_42_ < anInt9526; i_42_++) {
			for (int i_43_ = anInt9527 - 1; i_43_ >= 0; i_43_--)
				is[i++] = anIntArray9532[i_42_ + i_43_ * anInt9526];
		}
		anIntArray9532 = is;
		int i_44_ = anInt9530;
		anInt9530 = anInt9528;
		anInt9528 = anInt9531;
		anInt9531 = anInt9529;
		anInt9529 = i_44_;
		i_44_ = anInt9527;
		anInt9527 = anInt9526;
		anInt9526 = i_44_;
	}

	public int method2639(int i, int i_45_) {
		return anIntArray9532[i + i_45_ * anInt9526];
	}

	public void method2649(int i, int i_46_, int i_47_) {
		for (int i_48_ = 1; i_48_ < anIntArray9532.length; i_48_++) {
			int i_49_ = anIntArray9532[i_48_] >> 16 & 0xff;
			i_49_ += i;
			if (i_49_ < 0)
				i_49_ = 0;
			else if (i_49_ > 255)
				i_49_ = 255;
			int i_50_ = anIntArray9532[i_48_] >> 8 & 0xff;
			i_50_ += i_46_;
			if (i_50_ < 0)
				i_50_ = 0;
			else if (i_50_ > 255)
				i_50_ = 255;
			int i_51_ = anIntArray9532[i_48_] >> 0 & 0xff;
			i_51_ += i_47_;
			if (i_51_ < 0)
				i_51_ = 0;
			else if (i_51_ > 255)
				i_51_ = 255;
			anIntArray9532[i_48_] = (anIntArray9532[i_48_] & ~0xffffff | i_49_ << 16 | i_50_ << 8 | i_51_);
		}
	}

	public int method2650(int i, int i_52_) {
		return anIntArray9532[i + i_52_ * anInt9526];
	}

	public boolean method2692() {
		return false;
	}

	Class179_Sub1(int i, int i_53_, int[] is) {
		anInt9526 = i;
		anInt9527 = i_53_;
		anIntArray9532 = is;
		for (int i_54_ = 0; i_54_ < anIntArray9532.length; i_54_++) {
			if ((anIntArray9532[i_54_] & ~0xffffff) != -16777216) {
				aBool9533 = true;
				break;
			}
		}
	}

	public boolean method2653() {
		return aBool9533;
	}

	public boolean method2654() {
		return aBool9533;
	}

	public void method2666() {
		anInt9531 = 0;
		anInt9530 = 0;
		anInt9529 = 0;
		anInt9528 = 0;
	}

	public int method2656() {
		return anInt9527;
	}

	public int method2657() {
		return anInt9527;
	}

	public int method2658() {
		return anInt9527;
	}

	public int method2665() {
		return anInt9527;
	}

	public int method2670() {
		return anInt9526 + anInt9528 + anInt9529;
	}

	public int method2638() {
		return anInt9531;
	}

	public int method2662() {
		return anInt9527 + anInt9530 + anInt9531;
	}

	public int method2663() {
		return anInt9527 + anInt9530 + anInt9531;
	}

	public int method2632() {
		return anInt9527 + anInt9530 + anInt9531;
	}

	public int method2634() {
		return anInt9527 + anInt9530 + anInt9531;
	}

	public void method2646() {
		int[] is = anIntArray9532;
		for (int i = (anInt9527 >> 1) - 1; i >= 0; i--) {
			int i_55_ = i * anInt9526;
			int i_56_ = (anInt9527 - i - 1) * anInt9526;
			for (int i_57_ = -anInt9526; i_57_ < 0; i_57_++) {
				int i_58_ = is[i_55_];
				is[i_55_] = is[i_56_];
				is[i_56_] = i_58_;
				i_55_++;
				i_56_++;
			}
		}
		int i = anInt9530;
		anInt9530 = anInt9531;
		anInt9531 = i;
	}

	public int method2664() {
		return anInt9528;
	}

	public int method2667() {
		return anInt9528;
	}

	public int method2668() {
		return anInt9530;
	}

	public void method2655(int i) {
		int i_59_ = 0;
		aBool9533 = false;
		int[] is = new int[anInt9526 * anInt9527];
		for (int i_60_ = 0; i_60_ < anInt9527; i_60_++) {
			for (int i_61_ = 0; i_61_ < anInt9526; i_61_++) {
				int i_62_ = anIntArray9532[i_59_];
				if ((i_62_ & ~0xffffff) == 0) {
					if (i_61_ > 0 && (anIntArray9532[i_59_ - 1] & ~0xffffff) != 0)
						i_62_ = i;
					else if (i_60_ > 0 && (anIntArray9532[i_59_ - anInt9526] & ~0xffffff) != 0)
						i_62_ = i;
					else if (i_61_ < anInt9526 - 1 && (anIntArray9532[i_59_ + 1] & ~0xffffff) != 0)
						i_62_ = i;
					else if (i_60_ < anInt9527 - 1 && (anIntArray9532[i_59_ + anInt9526] & ~0xffffff) != 0)
						i_62_ = i;
				}
				if ((i_62_ & ~0xffffff) != -16777216)
					aBool9533 = true;
				is[i_59_++] = i_62_;
			}
		}
		anIntArray9532 = is;
	}

	public int method2689() {
		return anInt9529;
	}

	public int method2630() {
		return anInt9526;
	}

	public void method2672(int i) {
		for (int i_63_ = anInt9527 - 1; i_63_ > 0; i_63_--) {
			int i_64_ = i_63_ * anInt9526;
			for (int i_65_ = anInt9526 - 1; i_65_ > 0; i_65_--) {
				if ((anIntArray9532[i_65_ + i_64_] & ~0xffffff) == 0 && (anIntArray9532[i_65_ + i_64_ - 1 - anInt9526] & ~0xffffff) != 0)
					anIntArray9532[i_65_ + i_64_] = i;
			}
		}
	}

	public void method2681() {
		int[] is = anIntArray9532;
		for (int i = anInt9527 - 1; i >= 0; i--) {
			int i_66_ = i * anInt9526;
			for (int i_67_ = (i + 1) * anInt9526; i_66_ < i_67_; i_66_++) {
				i_67_--;
				int i_68_ = is[i_66_];
				is[i_66_] = is[i_67_];
				is[i_67_] = i_68_;
			}
		}
		int i = anInt9528;
		anInt9528 = anInt9529;
		anInt9529 = i;
	}

	public void method2674() {
		int[] is = anIntArray9532;
		for (int i = anInt9527 - 1; i >= 0; i--) {
			int i_69_ = i * anInt9526;
			for (int i_70_ = (i + 1) * anInt9526; i_69_ < i_70_; i_69_++) {
				i_70_--;
				int i_71_ = is[i_69_];
				is[i_69_] = is[i_70_];
				is[i_70_] = i_71_;
			}
		}
		int i = anInt9528;
		anInt9528 = anInt9529;
		anInt9529 = i;
	}

	public void method2675() {
		int[] is = anIntArray9532;
		for (int i = (anInt9527 >> 1) - 1; i >= 0; i--) {
			int i_72_ = i * anInt9526;
			int i_73_ = (anInt9527 - i - 1) * anInt9526;
			for (int i_74_ = -anInt9526; i_74_ < 0; i_74_++) {
				int i_75_ = is[i_72_];
				is[i_72_] = is[i_73_];
				is[i_73_] = i_75_;
				i_72_++;
				i_73_++;
			}
		}
		int i = anInt9530;
		anInt9530 = anInt9531;
		anInt9531 = i;
	}

	public int[] method2680(boolean bool) {
		if (bool && (method2640() != anInt9526 || method2671() != anInt9527)) {
			int i = method2640();
			int[] is = new int[i * method2671()];
			for (int i_76_ = 0; i_76_ < anInt9527; i_76_++) {
				int i_77_ = i_76_ * anInt9526;
				int i_78_ = anInt9528 + (i_76_ + anInt9530) * i;
				for (int i_79_ = 0; i_79_ < anInt9526; i_79_++) {
					is[i_78_++] = anIntArray9532[i_77_];
					i_77_++;
				}
			}
			return is;
		}
		return anIntArray9532;
	}

	public int method2652() {
		return anInt9529;
	}

	public void method2678() {
		int[] is = new int[anInt9526 * anInt9527];
		int i = 0;
		for (int i_80_ = 0; i_80_ < anInt9526; i_80_++) {
			for (int i_81_ = anInt9527 - 1; i_81_ >= 0; i_81_--)
				is[i++] = anIntArray9532[i_80_ + i_81_ * anInt9526];
		}
		anIntArray9532 = is;
		int i_82_ = anInt9530;
		anInt9530 = anInt9528;
		anInt9528 = anInt9531;
		anInt9531 = anInt9529;
		anInt9529 = i_82_;
		i_82_ = anInt9527;
		anInt9527 = anInt9526;
		anInt9526 = i_82_;
	}

	public int method2677() {
		return anInt9527;
	}

	public int method2669() {
		return anInt9531;
	}

	public int[] method2659(boolean bool) {
		if (bool && (method2640() != anInt9526 || method2671() != anInt9527)) {
			int i = method2640();
			int[] is = new int[i * method2671()];
			for (int i_83_ = 0; i_83_ < anInt9527; i_83_++) {
				int i_84_ = i_83_ * anInt9526;
				int i_85_ = anInt9528 + (i_83_ + anInt9530) * i;
				for (int i_86_ = 0; i_86_ < anInt9526; i_86_++) {
					is[i_85_++] = anIntArray9532[i_84_];
					i_84_++;
				}
			}
			return is;
		}
		return anIntArray9532;
	}

	public void method2648() {
		int[] is = anIntArray9532;
		for (int i = anInt9527 - 1; i >= 0; i--) {
			int i_87_ = i * anInt9526;
			for (int i_88_ = (i + 1) * anInt9526; i_87_ < i_88_; i_87_++) {
				i_88_--;
				int i_89_ = is[i_87_];
				is[i_87_] = is[i_88_];
				is[i_88_] = i_89_;
			}
		}
		int i = anInt9528;
		anInt9528 = anInt9529;
		anInt9529 = i;
	}

	public void method2683(int i, int i_90_, int i_91_) {
		for (int i_92_ = 1; i_92_ < anIntArray9532.length; i_92_++) {
			int i_93_ = anIntArray9532[i_92_] >> 16 & 0xff;
			i_93_ += i;
			if (i_93_ < 0)
				i_93_ = 0;
			else if (i_93_ > 255)
				i_93_ = 255;
			int i_94_ = anIntArray9532[i_92_] >> 8 & 0xff;
			i_94_ += i_90_;
			if (i_94_ < 0)
				i_94_ = 0;
			else if (i_94_ > 255)
				i_94_ = 255;
			int i_95_ = anIntArray9532[i_92_] >> 0 & 0xff;
			i_95_ += i_91_;
			if (i_95_ < 0)
				i_95_ = 0;
			else if (i_95_ > 255)
				i_95_ = 255;
			anIntArray9532[i_92_] = (anIntArray9532[i_92_] & ~0xffffff | i_93_ << 16 | i_94_ << 8 | i_95_);
		}
	}

	public int method2687() {
		return anInt9529;
	}

	public void method2661() {
		int[] is = anIntArray9532;
		for (int i = (anInt9527 >> 1) - 1; i >= 0; i--) {
			int i_96_ = i * anInt9526;
			int i_97_ = (anInt9527 - i - 1) * anInt9526;
			for (int i_98_ = -anInt9526; i_98_ < 0; i_98_++) {
				int i_99_ = is[i_96_];
				is[i_96_] = is[i_97_];
				is[i_97_] = i_99_;
				i_96_++;
				i_97_++;
			}
		}
		int i = anInt9530;
		anInt9530 = anInt9531;
		anInt9531 = i;
	}

	public int method2686(int i, int i_100_) {
		return anIntArray9532[i + i_100_ * anInt9526];
	}

	public void method2673() {
		anInt9531 = 0;
		anInt9530 = 0;
		anInt9529 = 0;
		anInt9528 = 0;
	}

	public int method2688() {
		return anInt9529;
	}

	public int method2684(int i, int i_101_) {
		return anIntArray9532[i + i_101_ * anInt9526];
	}

	public int method2660() {
		return anInt9526 + anInt9528 + anInt9529;
	}

	public int method2691() {
		return anInt9529;
	}

	public void method2651() {
		anInt9531 = 0;
		anInt9530 = 0;
		anInt9529 = 0;
		anInt9528 = 0;
	}

	public void method2682(int i, int i_102_, int i_103_) {
		for (int i_104_ = 1; i_104_ < anIntArray9532.length; i_104_++) {
			int i_105_ = anIntArray9532[i_104_] >> 16 & 0xff;
			i_105_ += i;
			if (i_105_ < 0)
				i_105_ = 0;
			else if (i_105_ > 255)
				i_105_ = 255;
			int i_106_ = anIntArray9532[i_104_] >> 8 & 0xff;
			i_106_ += i_102_;
			if (i_106_ < 0)
				i_106_ = 0;
			else if (i_106_ > 255)
				i_106_ = 255;
			int i_107_ = anIntArray9532[i_104_] >> 0 & 0xff;
			i_107_ += i_103_;
			if (i_107_ < 0)
				i_107_ = 0;
			else if (i_107_ > 255)
				i_107_ = 255;
			anIntArray9532[i_104_] = (anIntArray9532[i_104_] & ~0xffffff | i_105_ << 16 | i_106_ << 8 | i_107_);
		}
	}
}
