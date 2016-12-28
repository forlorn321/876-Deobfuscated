/* Class160_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class160_Sub3 extends Class160 {
	static final int anInt9822 = -1694498816;
	float aFloat9823;
	static final int anInt9824 = 1;
	static final int anInt9825 = 2;
	Class102[][] aClass102ArrayArray9826;
	Class167_Sub1 aClass167_Sub1_9827;
	int anInt9828;
	Class136[][] aClass136ArrayArray9829;
	float aFloat9830;
	Class115[][] aClass115ArrayArray9831;
	static final boolean aBool9832 = false;
	Class134[][] aClass134ArrayArray9833;
	float aFloat9834;
	byte[][] aByteArrayArray9835;
	float aFloat9836;
	static final boolean aBool9837 = true;
	float aFloat9838;
	float aFloat9839;
	float aFloat9840;
	float aFloat9841;
	float aFloat9842;
	byte[][] aByteArrayArray9843;
	float aFloat9844;
	float aFloat9845;
	float aFloat9846;
	float aFloat9847;
	float aFloat9848;
	float aFloat9849;
	static final int anInt9850 = 64;
	Class113[][] aClass113ArrayArray9851;
	static final boolean aBool9852 = true;
	static final int anInt9853 = 4;
	float aFloat9854;

	public void method1934(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_0_, int i_1_, int i_2_, boolean bool) {
		/* empty */
	}

	public void method1921(int i, int i_3_, int[] is, int[] is_4_, int[] is_5_, int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_, int[] is_13_, Class175 class175, boolean bool) {
		if (aClass136ArrayArray9829 == null) {
			aClass136ArrayArray9829 = new Class136[anInt1766 * 1718142487][anInt1769 * -889224915];
			aClass113ArrayArray9851 = new Class113[anInt1766 * 1718142487][anInt1769 * -889224915];
		} else if (aClass115ArrayArray9831 != null || aClass134ArrayArray9833 != null)
			throw new IllegalStateException();
		boolean bool_14_ = false;
		if (is_10_.length == 2 && is_7_.length == 2 && (is_10_[0] == is_10_[1] || is_12_[0] != -1 && is_12_[0] == is_12_[1])) {
			bool_14_ = true;
			for (int i_15_ = 1; i_15_ < 2; i_15_++) {
				int i_16_ = is[is_7_[i_15_]];
				int i_17_ = is_5_[is_7_[i_15_]];
				if (i_16_ != 0 && i_16_ != anInt1767 * -1504778739 || i_17_ != 0 && i_17_ != anInt1767 * -1504778739) {
					bool_14_ = false;
					break;
				}
			}
		}
		if (!bool_14_) {
			Class113 class113 = new Class113();
			short i_18_ = (short) is.length;
			int i_19_ = (short) is_10_.length;
			class113.aShort1399 = i_18_;
			class113.aShortArray1401 = new short[i_18_];
			class113.aShortArray1403 = new short[i_18_];
			class113.aShortArray1396 = new short[i_18_];
			class113.aShortArray1400 = new short[i_18_];
			for (int i_20_ = 0; i_20_ < i_18_; i_20_++) {
				int i_21_ = is[i_20_];
				int i_22_ = is_5_[i_20_];
				if (i_21_ == 0 && i_22_ == 0)
					class113.aShortArray1401[i_20_] = (short) (aByteArrayArray9835[i][i_3_] - aByteArrayArray9843[i][i_3_]);
				else if (i_21_ == 0 && i_22_ == anInt1767 * -1504778739)
					class113.aShortArray1401[i_20_] = (short) (aByteArrayArray9835[i][i_3_ + 1] - aByteArrayArray9843[i][i_3_ + 1]);
				else if (i_21_ == anInt1767 * -1504778739 && i_22_ == anInt1767 * -1504778739)
					class113.aShortArray1401[i_20_] = (short) (aByteArrayArray9835[i + 1][i_3_ + 1] - aByteArrayArray9843[i + 1][i_3_ + 1]);
				else if (i_21_ == anInt1767 * -1504778739 && i_22_ == 0)
					class113.aShortArray1401[i_20_] = (short) (aByteArrayArray9835[i + 1][i_3_] - aByteArrayArray9843[i + 1][i_3_]);
				else {
					int i_23_ = (((aByteArrayArray9835[i][i_3_] - aByteArrayArray9843[i][i_3_]) * (anInt1767 * -1504778739 - i_21_)) + (aByteArrayArray9835[i + 1][i_3_] - aByteArrayArray9843[i + 1][i_3_]) * i_21_);
					int i_24_ = (((aByteArrayArray9835[i][i_3_ + 1] - aByteArrayArray9843[i][i_3_ + 1]) * (anInt1767 * -1504778739 - i_21_)) + (aByteArrayArray9835[i + 1][i_3_ + 1] - aByteArrayArray9843[i + 1][i_3_ + 1]) * i_21_);
					class113.aShortArray1401[i_20_] = (short) ((i_23_ * (anInt1767 * -1504778739 - i_22_) + i_24_ * i_22_) >> anInt1768 * -166490558);
				}
				int i_25_ = (i << anInt1768 * 2064238369) + i_21_;
				int i_26_ = (i_3_ << anInt1768 * 2064238369) + i_22_;
				class113.aShortArray1403[i_20_] = (short) i_21_;
				class113.aShortArray1400[i_20_] = (short) i_22_;
				class113.aShortArray1396[i_20_] = (short) (method1925(i_25_, i_26_, (byte) -2) + (is_4_ != null ? is_4_[i_20_] : 0));
				if (class113.aShortArray1401[i_20_] < 2)
					class113.aShortArray1401[i_20_] = (short) 2;
			}
			boolean bool_27_ = false;
			int i_28_ = 0;
			for (int i_29_ = 0; i_29_ < i_19_; i_29_++) {
				if (is_10_[i_29_] >= 0 || is_11_ != null && is_11_[i_29_] >= 0)
					i_28_++;
				int i_30_ = is_12_[i_29_];
				if (i_30_ != -1) {
					Class164 class164 = aClass167_Sub1_9827.aClass174_1852.method2446(i_30_, -1868451150);
					if (!class164.aBool1820) {
						bool_27_ = true;
						if (method9051(class164.aByte1797) || class164.aByte1802 != 0 || class164.aByte1803 != 0)
							class113.aByte1395 |= 0x4;
					}
				}
			}
			class113.anIntArray1407 = new int[i_28_];
			if (is_11_ != null)
				class113.anIntArray1408 = new int[i_28_];
			class113.aShortArray1398 = new short[i_28_];
			class113.aShortArray1402 = new short[i_28_];
			class113.aShortArray1404 = new short[i_28_];
			if (bool_27_) {
				class113.aShortArray1405 = new short[i_28_];
				class113.aShortArray1406 = new short[i_28_];
			}
			for (int i_31_ = 0; i_31_ < i_19_; i_31_++) {
				if (is_10_[i_31_] >= 0 || is_11_ != null && is_11_[i_31_] >= 0) {
					if (is_10_[i_31_] >= 0)
						class113.anIntArray1407[class113.aShort1397] = Class254.method3537(is_10_[i_31_], 1409175155);
					else
						class113.anIntArray1407[class113.aShort1397] = -1;
					if (is_11_ != null) {
						if (is_11_[i_31_] != -1)
							class113.anIntArray1408[class113.aShort1397] = Class254.method3537(is_11_[i_31_], 1409175155);
						else
							class113.anIntArray1408[class113.aShort1397] = -1;
					}
					class113.aShortArray1398[class113.aShort1397] = (short) is_7_[i_31_];
					class113.aShortArray1402[class113.aShort1397] = (short) is_8_[i_31_];
					class113.aShortArray1404[class113.aShort1397] = (short) is_9_[i_31_];
					if (bool_27_) {
						if (is_12_[i_31_] != -1 && !(aClass167_Sub1_9827.aClass174_1852.method2446(is_12_[i_31_], -91493350).aBool1820)) {
							class113.aShortArray1405[class113.aShort1397] = (short) is_12_[i_31_];
							class113.aShortArray1406[class113.aShort1397] = (short) is_13_[i_31_];
						} else
							class113.aShortArray1405[class113.aShort1397] = (short) -1;
					}
					class113.aShort1397++;
				}
			}
			aClass113ArrayArray9851[i][i_3_] = class113;
		} else if (is_10_[0] >= 0 || is_11_ != null && is_11_[0] >= 0) {
			Class136 class136 = new Class136();
			int i_32_ = is_10_[0];
			int i_33_ = is_12_[0];
			if (is_11_ != null) {
				class136.anInt1631 = Class267.method3703(Class254.method3537(is_11_[0], 1409175155), (aByteArrayArray9835[i][i_3_] - aByteArrayArray9843[i][i_3_]), -329965339);
				if (i_32_ == -1)
					class136.aByte1629 |= 0x2;
			}
			if ((anIntArrayArray1765[i][i_3_] == anIntArrayArray1765[i + 1][i_3_]) && (anIntArrayArray1765[i][i_3_] == anIntArrayArray1765[i + 1][i_3_ + 1]) && (anIntArrayArray1765[i][i_3_] == anIntArrayArray1765[i][i_3_ + 1]))
				class136.aByte1629 |= 0x1;
			Class164 class164 = null;
			if (i_33_ != -1)
				class164 = aClass167_Sub1_9827.aClass174_1852.method2446(i_33_, -1707551300);
			if (class164 != null && (class136.aByte1629 & 0x2) == 0 && !class164.aBool1820) {
				class136.aShort1626 = (short) (aByteArrayArray9835[i][i_3_] - aByteArrayArray9843[i][i_3_]);
				class136.aShort1628 = (short) (aByteArrayArray9835[i + 1][i_3_] - aByteArrayArray9843[i + 1][i_3_]);
				class136.aShort1627 = (short) (aByteArrayArray9835[i + 1][i_3_ + 1] - aByteArrayArray9843[i + 1][i_3_ + 1]);
				class136.aShort1630 = (short) (aByteArrayArray9835[i][i_3_ + 1] - aByteArrayArray9843[i][i_3_ + 1]);
				class136.aShort1632 = (short) i_33_;
				if (method9051(class164.aByte1797) || class164.aByte1802 != 0 || class164.aByte1803 != 0)
					class136.aByte1629 |= 0x4;
			} else {
				short i_34_ = Class254.method3537(i_32_, 1409175155);
				class136.aShort1626 = (short) Class267.method3703(i_34_, (aByteArrayArray9835[i][i_3_] - (aByteArrayArray9843[i][i_3_])), -329965339);
				class136.aShort1628 = (short) Class267.method3703(i_34_, ((aByteArrayArray9835[i + 1][i_3_]) - (aByteArrayArray9843[i + 1][i_3_])), -329965339);
				class136.aShort1627 = (short) Class267.method3703(i_34_, ((aByteArrayArray9835[i + 1][i_3_ + 1]) - (aByteArrayArray9843[i + 1][i_3_ + 1])), -329965339);
				class136.aShort1630 = (short) Class267.method3703(i_34_, ((aByteArrayArray9835[i][i_3_ + 1]) - (aByteArrayArray9843[i][i_3_ + 1])), -329965339);
				class136.aShort1632 = (short) -1;
			}
			aClass136ArrayArray9829[i][i_3_] = class136;
		}
	}

	public void method1933(Class536_Sub19 class536_sub19, int[] is) {
		/* empty */
	}

	public void method1956(int i, int i_35_, int i_36_) {
		i = Math.min(aByteArrayArray9843.length - 1, Math.max(0, i));
		i_35_ = Math.min(aByteArrayArray9843[i].length - 1, Math.max(0, i_35_));
		if (aByteArrayArray9843[i][i_35_] < i_36_)
			aByteArrayArray9843[i][i_35_] = (byte) i_36_;
	}

	public void method1943(int i, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, boolean[][] bools) {
		Class107 class107 = aClass167_Sub1_9827.method8458(Thread.currentThread());
		Class117 class117 = class107.aClass117_1290;
		class117.anInt1436 = 0;
		class117.aBool1449 = true;
		aClass167_Sub1_9827.method8460();
		if (aClass115ArrayArray9831 != null || aClass134ArrayArray9833 != null)
			method9053(i, i_37_, i_38_, i_39_, i_40_, i_41_, i_42_, bools, class107, class117, class107.aFloatArray1316, class107.aFloatArray1292);
		else if (aClass136ArrayArray9829 != null)
			method9049(i, i_37_, i_38_, i_39_, i_40_, i_41_, i_42_, bools, class107, class117, class107.aFloatArray1316, class107.aFloatArray1292);
	}

	void method9045(int i, int i_43_, int i_44_) {
		Class107 class107 = aClass167_Sub1_9827.method8458(Thread.currentThread());
		class107.aClass117_1290.anInt1436 = 0;
		if (aClass115ArrayArray9831 != null)
			method9047(i, i_43_, class107.aBool1284, class107, class107.aClass117_1290, class107.aFloatArray1316, class107.aFloatArray1292, class107.aFloatArray1318, class107.aFloatArray1319, class107.aFloatArray1288, i_44_);
		else if (aClass136ArrayArray9829 != null)
			method9046(i, i_43_, class107.aClass117_1290, class107.aFloatArray1316, class107.aFloatArray1292, class107.aFloatArray1318, class107.aFloatArray1319, class107.aFloatArray1288, i_44_);
		else if (aClass134ArrayArray9833 != null)
			method9048(i, i_43_, class107.aBool1284, class107, class107.aClass117_1290, class107.aFloatArray1316, class107.aFloatArray1292, class107.aFloatArray1318, class107.aFloatArray1319, class107.aFloatArray1288, i_44_);
	}

	void method9046(int i, int i_45_, Class117 class117, float[] fs, float[] fs_46_, float[] fs_47_, float[] fs_48_, float[] fs_49_, int i_50_) {
		Class136 class136 = aClass136ArrayArray9829[i][i_45_];
		if (class136 != null) {
			if ((class136.aByte1629 & 0x2) == 0) {
				if (i_50_ != 0) {
					if ((class136.aByte1629 & 0x4) != 0) {
						if ((i_50_ & 0x1) != 0)
							return;
					} else if ((i_50_ & 0x2) != 0)
						return;
				}
				int i_51_ = i * (anInt1767 * -1504778739);
				int i_52_ = i_51_ + anInt1767 * -1504778739;
				int i_53_ = i_45_ * (anInt1767 * -1504778739);
				int i_54_ = i_53_ + anInt1767 * -1504778739;
				float f;
				float f_55_;
				float f_56_;
				float f_57_;
				float f_58_;
				float f_59_;
				float f_60_;
				float f_61_;
				float f_62_;
				float f_63_;
				float f_64_;
				float f_65_;
				float f_66_;
				float f_67_;
				float f_68_;
				float f_69_;
				if ((class136.aByte1629 & 0x1) != 0) {
					int i_70_ = anIntArrayArray1765[i][i_45_];
					float f_71_ = aFloat9840 * (float) i_70_;
					float f_72_ = aFloat9841 * (float) i_70_;
					float f_73_ = aFloat9823 + (aFloat9836 * (float) i_51_ + f_71_ + aFloat9844 * (float) i_53_);
					f = aFloat9849 + (aFloat9854 * (float) i_51_ + f_72_ + aFloat9845 * (float) i_53_);
					if (f_73_ < -f)
						return;
					float f_74_ = aFloat9823 + (aFloat9836 * (float) i_52_ + f_71_ + aFloat9844 * (float) i_53_);
					f_55_ = aFloat9849 + (aFloat9854 * (float) i_52_ + f_72_ + aFloat9845 * (float) i_53_);
					if (f_74_ < -f_55_)
						return;
					float f_75_ = aFloat9823 + (aFloat9836 * (float) i_52_ + f_71_ + aFloat9844 * (float) i_54_);
					f_56_ = aFloat9849 + (aFloat9854 * (float) i_52_ + f_72_ + aFloat9845 * (float) i_54_);
					if (f_75_ < -f_56_)
						return;
					float f_76_ = aFloat9823 + (aFloat9836 * (float) i_51_ + f_71_ + aFloat9844 * (float) i_54_);
					f_57_ = aFloat9849 + (aFloat9854 * (float) i_51_ + f_72_ + aFloat9845 * (float) i_54_);
					if (f_76_ < -f_57_)
						return;
					float f_77_ = aFloat9838 * (float) i_70_;
					float f_78_ = aFloat9830 * (float) i_70_;
					float f_79_ = aFloat9846 + (aFloat9834 * (float) i_51_ + f_77_ + aFloat9842 * (float) i_53_);
					f_58_ = (class117.aFloat1462 + class117.aFloat1459 * f_79_ / f);
					float f_80_ = aFloat9847 + (aFloat9848 * (float) i_51_ + f_78_ + aFloat9839 * (float) i_53_);
					f_59_ = (class117.aFloat1442 + class117.aFloat1439 * f_80_ / f);
					f_60_ = (class117.aFloat1444 + class117.aFloat1445 * f_73_ / f);
					float f_81_ = aFloat9846 + (aFloat9834 * (float) i_52_ + f_77_ + aFloat9842 * (float) i_53_);
					f_61_ = (class117.aFloat1462 + class117.aFloat1459 * f_81_ / f_55_);
					float f_82_ = aFloat9847 + (aFloat9848 * (float) i_52_ + f_78_ + aFloat9839 * (float) i_53_);
					f_62_ = (class117.aFloat1442 + class117.aFloat1439 * f_82_ / f_55_);
					f_63_ = (class117.aFloat1444 + class117.aFloat1445 * f_74_ / f_55_);
					float f_83_ = aFloat9846 + (aFloat9834 * (float) i_52_ + f_77_ + aFloat9842 * (float) i_54_);
					f_64_ = (class117.aFloat1462 + class117.aFloat1459 * f_83_ / f_56_);
					float f_84_ = aFloat9847 + (aFloat9848 * (float) i_52_ + f_78_ + aFloat9839 * (float) i_54_);
					f_65_ = (class117.aFloat1442 + class117.aFloat1439 * f_84_ / f_56_);
					f_66_ = (class117.aFloat1444 + class117.aFloat1445 * f_75_ / f_56_);
					float f_85_ = aFloat9846 + (aFloat9834 * (float) i_51_ + f_77_ + aFloat9842 * (float) i_54_);
					f_67_ = (class117.aFloat1462 + class117.aFloat1459 * f_85_ / f_57_);
					float f_86_ = aFloat9847 + (aFloat9848 * (float) i_51_ + f_78_ + aFloat9839 * (float) i_54_);
					f_68_ = (class117.aFloat1442 + class117.aFloat1439 * f_86_ / f_57_);
					f_69_ = (class117.aFloat1444 + class117.aFloat1445 * f_76_ / f_57_);
				} else {
					int i_87_ = anIntArrayArray1765[i][i_45_];
					int i_88_ = anIntArrayArray1765[i + 1][i_45_];
					int i_89_ = anIntArrayArray1765[i + 1][i_45_ + 1];
					int i_90_ = anIntArrayArray1765[i][i_45_ + 1];
					float f_91_ = aFloat9823 + (aFloat9836 * (float) i_51_ + aFloat9840 * (float) i_87_ + aFloat9844 * (float) i_53_);
					f = aFloat9849 + (aFloat9854 * (float) i_51_ + aFloat9841 * (float) i_87_ + aFloat9845 * (float) i_53_);
					if (f_91_ < -f)
						return;
					float f_92_ = aFloat9823 + (aFloat9836 * (float) i_52_ + aFloat9840 * (float) i_88_ + aFloat9844 * (float) i_53_);
					f_55_ = aFloat9849 + (aFloat9854 * (float) i_52_ + aFloat9841 * (float) i_88_ + aFloat9845 * (float) i_53_);
					if (f_92_ < -f_55_)
						return;
					float f_93_ = aFloat9823 + (aFloat9836 * (float) i_52_ + aFloat9840 * (float) i_89_ + aFloat9844 * (float) i_54_);
					f_56_ = aFloat9849 + (aFloat9854 * (float) i_52_ + aFloat9841 * (float) i_89_ + aFloat9845 * (float) i_54_);
					if (f_93_ < -f_56_)
						return;
					float f_94_ = aFloat9823 + (aFloat9836 * (float) i_51_ + aFloat9840 * (float) i_90_ + aFloat9844 * (float) i_54_);
					f_57_ = aFloat9849 + (aFloat9854 * (float) i_51_ + aFloat9841 * (float) i_90_ + aFloat9845 * (float) i_54_);
					if (f_94_ < -f_57_)
						return;
					float f_95_ = aFloat9846 + (aFloat9834 * (float) i_51_ + aFloat9838 * (float) i_87_ + aFloat9842 * (float) i_53_);
					f_58_ = (class117.aFloat1462 + class117.aFloat1459 * f_95_ / f);
					float f_96_ = aFloat9847 + (aFloat9848 * (float) i_51_ + aFloat9830 * (float) i_87_ + aFloat9839 * (float) i_53_);
					f_59_ = (class117.aFloat1442 + class117.aFloat1439 * f_96_ / f);
					f_60_ = (class117.aFloat1444 + class117.aFloat1445 * f_91_ / f);
					float f_97_ = aFloat9846 + (aFloat9834 * (float) i_52_ + aFloat9838 * (float) i_88_ + aFloat9842 * (float) i_53_);
					f_61_ = (class117.aFloat1462 + class117.aFloat1459 * f_97_ / f_55_);
					float f_98_ = aFloat9847 + (aFloat9848 * (float) i_52_ + aFloat9830 * (float) i_88_ + aFloat9839 * (float) i_53_);
					f_62_ = (class117.aFloat1442 + class117.aFloat1439 * f_98_ / f_55_);
					f_63_ = (class117.aFloat1444 + class117.aFloat1445 * f_92_ / f_55_);
					float f_99_ = aFloat9846 + (aFloat9834 * (float) i_52_ + aFloat9838 * (float) i_89_ + aFloat9842 * (float) i_54_);
					f_64_ = (class117.aFloat1462 + class117.aFloat1459 * f_99_ / f_56_);
					float f_100_ = aFloat9847 + (aFloat9848 * (float) i_52_ + aFloat9830 * (float) i_89_ + aFloat9839 * (float) i_54_);
					f_65_ = (class117.aFloat1442 + class117.aFloat1439 * f_100_ / f_56_);
					f_66_ = (class117.aFloat1444 + class117.aFloat1445 * f_93_ / f_56_);
					float f_101_ = aFloat9846 + (aFloat9834 * (float) i_51_ + aFloat9838 * (float) i_90_ + aFloat9842 * (float) i_54_);
					f_67_ = (class117.aFloat1462 + class117.aFloat1459 * f_101_ / f_57_);
					float f_102_ = aFloat9847 + (aFloat9848 * (float) i_51_ + aFloat9830 * (float) i_90_ + aFloat9839 * (float) i_54_);
					f_68_ = (class117.aFloat1442 + class117.aFloat1439 * f_102_ / f_57_);
					f_69_ = (class117.aFloat1444 + class117.aFloat1445 * f_94_ / f_57_);
				}
				boolean bool = false;
				if (class136.aShort1632 != -1) {
					Class164 class164 = (aClass167_Sub1_9827.aClass174_1852.method2446(class136.aShort1632 & 0xffff, -154581984));
					bool = class164.aBool1814;
				}
				if (((f_64_ - f_67_) * (f_62_ - f_68_) - (f_65_ - f_68_) * (f_61_ - f_67_)) > 0.0F) {
					class117.aBool1449 = (f_64_ < 0.0F || f_67_ < 0.0F || f_61_ < 0.0F || f_64_ > (float) class117.anInt1441 || f_67_ > (float) class117.anInt1441 || f_61_ > (float) class117.anInt1441);
					if (bool)
						class117.method1491(true, true, false, f_65_, f_68_, f_62_, f_64_, f_67_, f_61_, f_66_, f_69_, f_63_, f_56_, f_57_, f_55_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, ~0xffffff | ((ColourUtils.anIntArray8308[class136.aShort1627 & 0xffff]) & 0xffffff), ~0xffffff | ((ColourUtils.anIntArray8308[class136.aShort1630 & 0xffff]) & 0xffffff), ~0xffffff | ((ColourUtils.anIntArray8308[class136.aShort1628 & 0xffff]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, class136.aShort1632 & 0xffff);
					else
						class117.method1487(true, true, false, f_65_, f_68_, f_62_, f_64_, f_67_, f_61_, f_66_, f_69_, f_63_, (float) (class136.aShort1627 & 0xffff), (float) (class136.aShort1630 & 0xffff), (float) (class136.aShort1628 & 0xffff));
				}
				if (((f_58_ - f_61_) * (f_68_ - f_62_) - (f_59_ - f_62_) * (f_67_ - f_61_)) > 0.0F) {
					class117.aBool1449 = (f_58_ < 0.0F || f_61_ < 0.0F || f_67_ < 0.0F || f_58_ > (float) class117.anInt1441 || f_61_ > (float) class117.anInt1441 || f_67_ > (float) class117.anInt1441);
					if (bool)
						class117.method1491(true, true, false, f_59_, f_62_, f_68_, f_58_, f_61_, f_67_, f_60_, f_63_, f_69_, f, f_55_, f_57_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, ~0xffffff | ((ColourUtils.anIntArray8308[class136.aShort1626 & 0xffff]) & 0xffffff), ~0xffffff | ((ColourUtils.anIntArray8308[class136.aShort1628 & 0xffff]) & 0xffffff), ~0xffffff | ((ColourUtils.anIntArray8308[class136.aShort1630 & 0xffff]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, class136.aShort1632 & 0xffff);
					else
						class117.method1487(true, true, false, f_59_, f_62_, f_68_, f_58_, f_61_, f_67_, f_60_, f_63_, f_69_, (float) (class136.aShort1626 & 0xffff), (float) (class136.aShort1628 & 0xffff), (float) (class136.aShort1630 & 0xffff));
				}
			}
		} else {
			Class113 class113 = aClass113ArrayArray9851[i][i_45_];
			if (class113 != null) {
				if (i_50_ != 0) {
					if ((class113.aByte1395 & 0x4) != 0) {
						if ((i_50_ & 0x1) != 0)
							return;
					} else if ((i_50_ & 0x2) != 0)
						return;
				}
				for (int i_103_ = 0; i_103_ < class113.aShort1399; i_103_++) {
					int i_104_ = (class113.aShortArray1403[i_103_] + (i << anInt1768 * 2064238369));
					short i_105_ = class113.aShortArray1396[i_103_];
					int i_106_ = (class113.aShortArray1400[i_103_] + (i_45_ << anInt1768 * 2064238369));
					float f = aFloat9823 + (aFloat9836 * (float) i_104_ + aFloat9840 * (float) i_105_ + aFloat9844 * (float) i_106_);
					float f_107_ = aFloat9849 + (aFloat9854 * (float) i_104_ + aFloat9841 * (float) i_105_ + aFloat9845 * (float) i_106_);
					if (f < -f_107_)
						return;
					float f_108_ = aFloat9846 + (aFloat9834 * (float) i_104_ + aFloat9838 * (float) i_105_ + aFloat9842 * (float) i_106_);
					float f_109_ = aFloat9847 + (aFloat9848 * (float) i_104_ + aFloat9830 * (float) i_105_ + aFloat9839 * (float) i_106_);
					fs[i_103_] = (class117.aFloat1462 + class117.aFloat1459 * f_108_ / f_107_);
					fs_46_[i_103_] = (class117.aFloat1442 + class117.aFloat1439 * f_109_ / f_107_);
					fs_47_[i_103_] = (class117.aFloat1444 + class117.aFloat1445 * f / f_107_);
					fs_48_[i_103_] = f_107_;
				}
				if (class113.aShortArray1405 != null) {
					for (int i_110_ = 0; i_110_ < class113.aShort1397; i_110_++) {
						short i_111_ = class113.aShortArray1398[i_110_];
						short i_112_ = class113.aShortArray1402[i_110_];
						short i_113_ = class113.aShortArray1404[i_110_];
						float f = fs[i_111_];
						float f_114_ = fs[i_112_];
						float f_115_ = fs[i_113_];
						float f_116_ = fs_46_[i_111_];
						float f_117_ = fs_46_[i_112_];
						float f_118_ = fs_46_[i_113_];
						if (((f - f_114_) * (f_118_ - f_117_) - (f_116_ - f_117_) * (f_115_ - f_114_)) > 0.0F) {
							class117.aBool1449 = (f < 0.0F || f_114_ < 0.0F || f_115_ < 0.0F || f > (float) class117.anInt1441 || f_114_ > (float) class117.anInt1441 || f_115_ > (float) class117.anInt1441);
							boolean bool = false;
							if (class113.aShortArray1405[i_110_] != -1) {
								Class164 class164 = (aClass167_Sub1_9827.aClass174_1852.method2446((class113.aShortArray1405[i_110_] & 0xffff), -685148154));
								bool = class164.aBool1814;
							}
							if (bool)
								class117.method1491(true, true, false, f_116_, f_117_, f_118_, f, f_114_, f_115_, fs_47_[i_111_], fs_47_[i_112_], fs_47_[i_113_], fs_48_[i_111_], fs_48_[i_112_], fs_48_[i_113_], ((float) class113.aShortArray1403[i_111_] / (float) (anInt1767 * -1504778739)), ((float) class113.aShortArray1403[i_112_] / (float) (anInt1767 * -1504778739)), ((float) class113.aShortArray1403[i_113_] / (float) (anInt1767 * -1504778739)),
										((float) class113.aShortArray1400[i_111_] / (float) (anInt1767 * -1504778739)), ((float) class113.aShortArray1400[i_112_] / (float) (anInt1767 * -1504778739)), ((float) class113.aShortArray1400[i_113_] / (float) (anInt1767 * -1504778739)), (~0xffffff | (ColourUtils.anIntArray8308[(class113.aShortArray1401[i_111_] & 0xffff)]) & 0xffffff), (~0xffffff | (ColourUtils.anIntArray8308[(class113.aShortArray1401[i_112_] & 0xffff)]) & 0xffffff),
										(~0xffffff | (ColourUtils.anIntArray8308[(class113.aShortArray1401[i_113_] & 0xffff)]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, (class113.aShortArray1405[i_110_] & 0xffff));
							else {
								int i_119_ = class113.anIntArray1407[i_110_];
								if (i_119_ != -1)
									class117.method1487(true, true, false, f_116_, f_117_, f_118_, f, f_114_, f_115_, fs_47_[i_111_], fs_47_[i_112_], fs_47_[i_113_], (float) (Class267.method3703(i_119_, (class113.aShortArray1401[i_111_]), -329965339)), (float) (Class267.method3703(i_119_, (class113.aShortArray1401[i_112_]), -329965339)), (float) (Class267.method3703(i_119_, (class113.aShortArray1401[i_113_]), -329965339)));
							}
						}
					}
				} else {
					for (int i_120_ = 0; i_120_ < class113.aShort1397; i_120_++) {
						short i_121_ = class113.aShortArray1398[i_120_];
						short i_122_ = class113.aShortArray1402[i_120_];
						short i_123_ = class113.aShortArray1404[i_120_];
						float f = fs[i_121_];
						float f_124_ = fs[i_122_];
						float f_125_ = fs[i_123_];
						float f_126_ = fs_46_[i_121_];
						float f_127_ = fs_46_[i_122_];
						float f_128_ = fs_46_[i_123_];
						if (((f - f_124_) * (f_128_ - f_127_) - (f_126_ - f_127_) * (f_125_ - f_124_)) > 0.0F) {
							int i_129_ = class113.anIntArray1407[i_120_];
							if (i_129_ != -1) {
								class117.aBool1449 = (f < 0.0F || f_124_ < 0.0F || f_125_ < 0.0F || f > (float) class117.anInt1441 || f_124_ > (float) class117.anInt1441 || f_125_ > (float) class117.anInt1441);
								class117.method1487(true, true, false, f_126_, f_127_, f_128_, f, f_124_, f_125_, fs_47_[i_121_], fs_47_[i_122_], fs_47_[i_123_], (float) (Class267.method3703(i_129_, (class113.aShortArray1401[i_121_]), -329965339)), (float) (Class267.method3703(i_129_, (class113.aShortArray1401[i_122_]), -329965339)), (float) (Class267.method3703(i_129_, (class113.aShortArray1401[i_123_]), -329965339)));
							}
						}
					}
				}
			}
		}
	}

	void method9047(int i, int i_130_, boolean bool, Class107 class107, Class117 class117, float[] fs, float[] fs_131_, float[] fs_132_, float[] fs_133_, float[] fs_134_, int i_135_) {
		Class115 class115 = aClass115ArrayArray9831[i][i_130_];
		if (class115 != null) {
			if ((class115.aByte1416 & 0x2) == 0) {
				if (i_135_ != 0) {
					if ((class115.aByte1416 & 0x4) != 0) {
						if ((i_135_ & 0x1) != 0)
							return;
					} else if ((i_135_ & 0x2) != 0)
						return;
				}
				int i_136_ = i * (anInt1767 * -1504778739);
				int i_137_ = i_136_ + anInt1767 * -1504778739;
				int i_138_ = i_130_ * (anInt1767 * -1504778739);
				int i_139_ = i_138_ + anInt1767 * -1504778739;
				float f = 0.0F;
				float f_140_ = 0.0F;
				float f_141_ = 0.0F;
				float f_142_ = 0.0F;
				float f_143_;
				float f_144_;
				float f_145_;
				float f_146_;
				float f_147_;
				float f_148_;
				float f_149_;
				float f_150_;
				float f_151_;
				float f_152_;
				float f_153_;
				float f_154_;
				float f_155_;
				float f_156_;
				float f_157_;
				float f_158_;
				if ((class115.aByte1416 & 0x1) != 0 && !bool) {
					int i_159_ = anIntArrayArray1765[i][i_130_];
					float f_160_ = aFloat9840 * (float) i_159_;
					float f_161_ = aFloat9841 * (float) i_159_;
					float f_162_ = aFloat9823 + (aFloat9836 * (float) i_136_ + f_160_ + aFloat9844 * (float) i_138_);
					f_143_ = aFloat9849 + (aFloat9854 * (float) i_136_ + f_161_ + aFloat9845 * (float) i_138_);
					if (f_162_ < -f_143_)
						return;
					float f_163_ = aFloat9823 + (aFloat9836 * (float) i_137_ + f_160_ + aFloat9844 * (float) i_138_);
					f_144_ = aFloat9849 + (aFloat9854 * (float) i_137_ + f_161_ + aFloat9845 * (float) i_138_);
					if (f_163_ < -f_144_)
						return;
					float f_164_ = aFloat9823 + (aFloat9836 * (float) i_137_ + f_160_ + aFloat9844 * (float) i_139_);
					f_145_ = aFloat9849 + (aFloat9854 * (float) i_137_ + f_161_ + aFloat9845 * (float) i_139_);
					if (f_164_ < -f_145_)
						return;
					float f_165_ = aFloat9823 + (aFloat9836 * (float) i_136_ + f_160_ + aFloat9844 * (float) i_139_);
					f_146_ = aFloat9849 + (aFloat9854 * (float) i_136_ + f_161_ + aFloat9845 * (float) i_139_);
					if (f_165_ < -f_146_)
						return;
					f_147_ = (class117.aFloat1444 + class117.aFloat1445 * f_162_ / f_143_);
					f_148_ = (class117.aFloat1444 + class117.aFloat1445 * f_163_ / f_144_);
					f_149_ = (class117.aFloat1444 + class117.aFloat1445 * f_164_ / f_145_);
					f_150_ = (class117.aFloat1444 + class117.aFloat1445 * f_165_ / f_146_);
					if (class107.aBool1279) {
						float f_166_ = f_162_ - class107.aFloat1277;
						if (f_166_ > 0.0F) {
							f = f_166_ / class107.aFloat1281;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_166_ = f_163_ - class107.aFloat1277;
						if (f_166_ > 0.0F) {
							f_140_ = f_166_ / class107.aFloat1281;
							if (f_140_ > 1.0F)
								f_140_ = 1.0F;
						}
						f_166_ = f_164_ - class107.aFloat1277;
						if (f_166_ > 0.0F) {
							f_141_ = f_166_ / class107.aFloat1281;
							if (f_141_ > 1.0F)
								f_141_ = 1.0F;
						}
						f_166_ = f_165_ - class107.aFloat1277;
						if (f_166_ > 0.0F) {
							f_142_ = f_166_ / class107.aFloat1281;
							if (f_142_ > 1.0F)
								f_142_ = 1.0F;
						}
					}
					float f_167_ = aFloat9838 * (float) i_159_;
					float f_168_ = aFloat9830 * (float) i_159_;
					float f_169_ = aFloat9846 + (aFloat9834 * (float) i_136_ + f_167_ + aFloat9842 * (float) i_138_);
					f_151_ = (class117.aFloat1462 + class117.aFloat1459 * f_169_ / f_143_);
					float f_170_ = aFloat9847 + (aFloat9848 * (float) i_136_ + f_168_ + aFloat9839 * (float) i_138_);
					f_152_ = (class117.aFloat1442 + class117.aFloat1439 * f_170_ / f_143_);
					float f_171_ = aFloat9846 + (aFloat9834 * (float) i_137_ + f_167_ + aFloat9842 * (float) i_138_);
					f_153_ = (class117.aFloat1462 + class117.aFloat1459 * f_171_ / f_144_);
					float f_172_ = aFloat9847 + (aFloat9848 * (float) i_137_ + f_168_ + aFloat9839 * (float) i_138_);
					f_154_ = (class117.aFloat1442 + class117.aFloat1439 * f_172_ / f_144_);
					float f_173_ = aFloat9846 + (aFloat9834 * (float) i_137_ + f_167_ + aFloat9842 * (float) i_139_);
					f_155_ = (class117.aFloat1462 + class117.aFloat1459 * f_173_ / f_145_);
					float f_174_ = aFloat9847 + (aFloat9848 * (float) i_137_ + f_168_ + aFloat9839 * (float) i_139_);
					f_156_ = (class117.aFloat1442 + class117.aFloat1439 * f_174_ / f_145_);
					float f_175_ = aFloat9846 + (aFloat9834 * (float) i_136_ + f_167_ + aFloat9842 * (float) i_139_);
					f_157_ = (class117.aFloat1462 + class117.aFloat1459 * f_175_ / f_146_);
					float f_176_ = aFloat9847 + (aFloat9848 * (float) i_136_ + f_168_ + aFloat9839 * (float) i_139_);
					f_158_ = (class117.aFloat1442 + class117.aFloat1439 * f_176_ / f_146_);
				} else {
					int i_177_ = anIntArrayArray1765[i][i_130_];
					int i_178_ = anIntArrayArray1765[i + 1][i_130_];
					int i_179_ = anIntArrayArray1765[i + 1][i_130_ + 1];
					int i_180_ = anIntArrayArray1765[i][i_130_ + 1];
					float f_181_ = aFloat9823 + (aFloat9836 * (float) i_136_ + aFloat9840 * (float) i_177_ + aFloat9844 * (float) i_138_);
					f_143_ = aFloat9849 + (aFloat9854 * (float) i_136_ + aFloat9841 * (float) i_177_ + aFloat9845 * (float) i_138_);
					if (f_181_ < -f_143_)
						return;
					float f_182_ = aFloat9823 + (aFloat9836 * (float) i_137_ + aFloat9840 * (float) i_178_ + aFloat9844 * (float) i_138_);
					f_144_ = aFloat9849 + (aFloat9854 * (float) i_137_ + aFloat9841 * (float) i_178_ + aFloat9845 * (float) i_138_);
					if (f_182_ < -f_144_)
						return;
					float f_183_ = aFloat9823 + (aFloat9836 * (float) i_137_ + aFloat9840 * (float) i_179_ + aFloat9844 * (float) i_139_);
					f_145_ = aFloat9849 + (aFloat9854 * (float) i_137_ + aFloat9841 * (float) i_179_ + aFloat9845 * (float) i_139_);
					if (f_183_ < -f_145_)
						return;
					float f_184_ = aFloat9823 + (aFloat9836 * (float) i_136_ + aFloat9840 * (float) i_180_ + aFloat9844 * (float) i_139_);
					f_146_ = aFloat9849 + (aFloat9854 * (float) i_136_ + aFloat9841 * (float) i_180_ + aFloat9845 * (float) i_139_);
					if (f_184_ < -f_146_)
						return;
					f_147_ = (class117.aFloat1444 + class117.aFloat1445 * f_181_ / f_143_);
					f_148_ = (class117.aFloat1444 + class117.aFloat1445 * f_182_ / f_144_);
					f_149_ = (class117.aFloat1444 + class117.aFloat1445 * f_183_ / f_145_);
					f_150_ = (class117.aFloat1444 + class117.aFloat1445 * f_184_ / f_146_);
					if (bool) {
						float f_185_ = f_181_ - class107.aFloat1277;
						if (f_185_ > 0.0F) {
							f_185_ /= class107.aFloat1281;
							if (f_185_ > 1.0F)
								f_185_ = 1.0F;
							f = f_185_;
							int i_186_ = (int) ((float) class115.aShort1418 * f_185_);
							if (i_186_ > 0)
								i_177_ -= i_186_;
						}
						f_185_ = f_182_ - class107.aFloat1277;
						if (f_185_ > 0.0F) {
							f_185_ /= class107.aFloat1281;
							if (f_185_ > 1.0F)
								f_185_ = 1.0F;
							f_140_ = f_185_;
							int i_187_ = (int) ((float) class115.aShort1419 * f_185_);
							if (i_187_ > 0)
								i_178_ -= i_187_;
						}
						f_185_ = f_183_ - class107.aFloat1277;
						if (f_185_ > 0.0F) {
							f_185_ /= class107.aFloat1281;
							if (f_185_ > 1.0F)
								f_185_ = 1.0F;
							f_141_ = f_185_;
							int i_188_ = (int) ((float) class115.aShort1420 * f_185_);
							if (i_188_ > 0)
								i_179_ -= i_188_;
						}
						f_185_ = f_184_ - class107.aFloat1277;
						if (f_185_ > 0.0F) {
							f_185_ /= class107.aFloat1281;
							if (f_185_ > 1.0F)
								f_185_ = 1.0F;
							f_142_ = f_185_;
							int i_189_ = (int) ((float) class115.aShort1417 * f_185_);
							if (i_189_ > 0)
								i_180_ -= i_189_;
						}
					} else if (class107.aBool1279) {
						float f_190_ = f_181_ - class107.aFloat1277;
						if (f_190_ > 0.0F) {
							f = f_190_ / class107.aFloat1281;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_190_ = f_182_ - class107.aFloat1277;
						if (f_190_ > 0.0F) {
							f_140_ = f_190_ / class107.aFloat1281;
							if (f_140_ > 1.0F)
								f_140_ = 1.0F;
						}
						f_190_ = f_183_ - class107.aFloat1277;
						if (f_190_ > 0.0F) {
							f_141_ = f_190_ / class107.aFloat1281;
							if (f_141_ > 1.0F)
								f_141_ = 1.0F;
						}
						f_190_ = f_184_ - class107.aFloat1277;
						if (f_190_ > 0.0F) {
							f_142_ = f_190_ / class107.aFloat1281;
							if (f_142_ > 1.0F)
								f_142_ = 1.0F;
						}
					}
					float f_191_ = aFloat9846 + (aFloat9834 * (float) i_136_ + aFloat9838 * (float) i_177_ + aFloat9842 * (float) i_138_);
					f_151_ = (class117.aFloat1462 + class117.aFloat1459 * f_191_ / f_143_);
					float f_192_ = aFloat9847 + (aFloat9848 * (float) i_136_ + aFloat9830 * (float) i_177_ + aFloat9839 * (float) i_138_);
					f_152_ = (class117.aFloat1442 + class117.aFloat1439 * f_192_ / f_143_);
					float f_193_ = aFloat9846 + (aFloat9834 * (float) i_137_ + aFloat9838 * (float) i_178_ + aFloat9842 * (float) i_138_);
					f_153_ = (class117.aFloat1462 + class117.aFloat1459 * f_193_ / f_144_);
					float f_194_ = aFloat9847 + (aFloat9848 * (float) i_137_ + aFloat9830 * (float) i_178_ + aFloat9839 * (float) i_138_);
					f_154_ = (class117.aFloat1442 + class117.aFloat1439 * f_194_ / f_144_);
					float f_195_ = aFloat9846 + (aFloat9834 * (float) i_137_ + aFloat9838 * (float) i_179_ + aFloat9842 * (float) i_139_);
					f_155_ = (class117.aFloat1462 + class117.aFloat1459 * f_195_ / f_145_);
					float f_196_ = aFloat9847 + (aFloat9848 * (float) i_137_ + aFloat9830 * (float) i_179_ + aFloat9839 * (float) i_139_);
					f_156_ = (class117.aFloat1442 + class117.aFloat1439 * f_196_ / f_145_);
					float f_197_ = aFloat9846 + (aFloat9834 * (float) i_136_ + aFloat9838 * (float) i_180_ + aFloat9842 * (float) i_139_);
					f_157_ = (class117.aFloat1462 + class117.aFloat1459 * f_197_ / f_146_);
					float f_198_ = aFloat9847 + (aFloat9848 * (float) i_136_ + aFloat9830 * (float) i_180_ + aFloat9839 * (float) i_139_);
					f_158_ = (class117.aFloat1442 + class117.aFloat1439 * f_198_ / f_146_);
				}
				Class164 class164 = null;
				boolean bool_199_ = false;
				if (class115.aShort1423 != -1) {
					class164 = (aClass167_Sub1_9827.aClass174_1852.method2446(class115.aShort1423 & 0xffff, -1111059328));
					bool_199_ = class164.aBool1814;
				}
				boolean bool_200_ = class164 != null && method9051(class164.aByte1797);
				float f_201_ = f_140_ + f_141_ + f_142_;
				if (((f_155_ - f_157_) * (f_154_ - f_158_) - (f_156_ - f_158_) * (f_153_ - f_157_)) > 0.0F) {
					class117.aBool1449 = (f_155_ < 0.0F || f_157_ < 0.0F || f_153_ < 0.0F || f_155_ > (float) class117.anInt1441 || f_157_ > (float) class117.anInt1441 || f_153_ > (float) class117.anInt1441);
					if (f_201_ < 3.0F) {
						if (f_201_ > 0.0F) {
							if (bool_199_) {
								int i_202_ = -16777216;
								if (bool_200_)
									i_202_ = -1694498816;
								class117.method1491(true, true, false, f_156_, f_158_, f_154_, f_155_, f_157_, f_153_, f_149_, f_150_, f_148_, f_145_, f_146_, f_144_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_202_ | class115.anInt1413 & 0xffffff, i_202_ | class115.anInt1422 & 0xffffff, i_202_ | class115.anInt1415 & 0xffffff, class107.anInt1282 * 900823373, f_141_ * 255.0F, f_142_ * 255.0F, f_140_ * 255.0F, class115.aShort1423 & 0xffff);
							} else {
								if (bool_200_)
									class117.anInt1436 = 100;
								class117.method1504(true, true, false, f_156_, f_158_, f_154_, f_155_, f_157_, f_153_, f_149_, f_150_, f_148_, Class97.method1319(class115.anInt1413, ((int) (f_141_ * 255.0F) << 24 | (class107.anInt1282 * 900823373)), (byte) 103), Class97.method1319(class115.anInt1422, ((int) (f_142_ * 255.0F) << 24 | (class107.anInt1282 * 900823373)), (byte) 87),
										Class97.method1319(class115.anInt1415, ((int) (f_140_ * 255.0F) << 24 | (class107.anInt1282 * 900823373)), (byte) 113));
								class117.anInt1436 = 0;
							}
						} else if (bool_199_) {
							int i_203_ = -16777216;
							if (bool_200_)
								i_203_ = -1694498816;
							class117.method1491(true, true, false, f_156_, f_158_, f_154_, f_155_, f_157_, f_153_, f_149_, f_150_, f_148_, f_145_, f_146_, f_144_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_203_ | class115.anInt1413 & 0xffffff, i_203_ | class115.anInt1422 & 0xffffff, i_203_ | class115.anInt1415 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class115.aShort1423 & 0xffff);
						} else {
							if (bool_200_)
								class117.anInt1436 = 100;
							class117.method1504(true, true, false, f_156_, f_158_, f_154_, f_155_, f_157_, f_153_, f_149_, f_150_, f_148_, class115.anInt1413, class115.anInt1422, class115.anInt1415);
							class117.anInt1436 = 0;
						}
					} else
						class117.method1507(true, true, false, f_156_, f_158_, f_154_, f_155_, f_157_, f_153_, f_149_, f_150_, f_148_, class107.anInt1282 * 900823373);
				}
				f_201_ = f + f_140_ + f_142_;
				if (((f_151_ - f_153_) * (f_158_ - f_154_) - (f_152_ - f_154_) * (f_157_ - f_153_)) > 0.0F) {
					class117.aBool1449 = (f_151_ < 0.0F || f_153_ < 0.0F || f_157_ < 0.0F || f_151_ > (float) class117.anInt1441 || f_153_ > (float) class117.anInt1441 || f_157_ > (float) class117.anInt1441);
					if (f_201_ < 3.0F) {
						if (bool_200_)
							class117.anInt1436 = -1694498816;
						if (f_201_ > 0.0F) {
							if (bool_199_) {
								int i_204_ = -16777216;
								if (bool_200_)
									i_204_ = -1694498816;
								class117.method1491(true, true, false, f_152_, f_154_, f_158_, f_151_, f_153_, f_157_, f_147_, f_148_, f_150_, f_143_, f_144_, f_146_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_204_ | class115.anInt1414 & 0xffffff, i_204_ | class115.anInt1415 & 0xffffff, i_204_ | class115.anInt1422 & 0xffffff, class107.anInt1282 * 900823373, f * 255.0F, f_140_ * 255.0F, f_142_ * 255.0F, class115.aShort1423 & 0xffff);
							} else {
								if (bool_200_)
									class117.anInt1436 = 100;
								class117.method1504(true, true, false, f_152_, f_154_, f_158_, f_151_, f_153_, f_157_, f_147_, f_148_, f_150_, Class97.method1319(class115.anInt1414, (((int) (f * 255.0F) << 24) | (class107.anInt1282 * 900823373)), (byte) 79), Class97.method1319(class115.anInt1415, ((int) (f_140_ * 255.0F) << 24 | (class107.anInt1282 * 900823373)), (byte) 106), Class97.method1319(class115.anInt1422, ((int) (f_142_ * 255.0F) << 24 | (class107.anInt1282 * 900823373)), (byte) 102));
								class117.anInt1436 = 0;
							}
						} else if (bool_199_) {
							int i_205_ = -16777216;
							if (bool_200_)
								i_205_ = -1694498816;
							class117.method1491(true, true, false, f_152_, f_154_, f_158_, f_151_, f_153_, f_157_, f_147_, f_148_, f_150_, f_143_, f_144_, f_146_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_205_ | class115.anInt1414 & 0xffffff, i_205_ | class115.anInt1415 & 0xffffff, i_205_ | class115.anInt1422 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class115.aShort1423 & 0xffff);
						} else {
							if (bool_200_)
								class117.anInt1436 = 100;
							class117.method1504(true, true, false, f_152_, f_154_, f_158_, f_151_, f_153_, f_157_, f_147_, f_148_, f_150_, class115.anInt1414, class115.anInt1415, class115.anInt1422);
							class117.anInt1436 = 0;
						}
					} else
						class117.method1507(true, true, false, f_152_, f_154_, f_158_, f_151_, f_153_, f_157_, f_147_, f_148_, f_150_, class107.anInt1282 * 900823373);
				}
			}
		} else {
			Class102 class102 = aClass102ArrayArray9826[i][i_130_];
			if (class102 != null) {
				if (i_135_ != 0) {
					if ((class102.aByte1212 & 0x4) != 0) {
						if ((i_135_ & 0x1) != 0)
							return;
					} else if ((i_135_ & 0x2) != 0)
						return;
				}
				for (int i_206_ = 0; i_206_ < class102.aShort1211; i_206_++) {
					int i_207_ = (class102.aShortArray1215[i_206_] + (i << anInt1768 * 2064238369));
					int i_208_ = class102.aShortArray1214[i_206_];
					int i_209_ = (class102.aShortArray1216[i_206_] + (i_130_ << anInt1768 * 2064238369));
					float f = aFloat9823 + (aFloat9836 * (float) i_207_ + aFloat9840 * (float) i_208_ + aFloat9844 * (float) i_209_);
					float f_210_ = aFloat9849 + (aFloat9854 * (float) i_207_ + aFloat9841 * (float) i_208_ + aFloat9845 * (float) i_209_);
					if (f < -f_210_)
						return;
					float f_211_ = (class117.aFloat1444 + class117.aFloat1445 * f / f_210_);
					fs_134_[i_206_] = 0.0F;
					if (bool) {
						float f_212_ = f - class107.aFloat1277;
						if (f_212_ > 0.0F) {
							f_212_ /= class107.aFloat1281;
							if (f_212_ > 1.0F)
								f_212_ = 1.0F;
							fs_134_[i_206_] = f_212_;
							int i_213_ = (int) ((float) (class102.aShortArray1218[i_206_]) * f_212_);
							if (i_213_ > 0)
								i_208_ -= i_213_;
						}
					} else if (class107.aBool1279) {
						float f_214_ = f - class107.aFloat1277;
						if (f_214_ > 0.0F) {
							fs_134_[i_206_] = f_214_ / class107.aFloat1281;
							if (fs_134_[i_206_] > 1.0F)
								fs_134_[i_206_] = 1.0F;
						}
					}
					float f_215_ = aFloat9846 + (aFloat9834 * (float) i_207_ + aFloat9838 * (float) i_208_ + aFloat9842 * (float) i_209_);
					float f_216_ = aFloat9847 + (aFloat9848 * (float) i_207_ + aFloat9830 * (float) i_208_ + aFloat9839 * (float) i_209_);
					fs[i_206_] = (class117.aFloat1462 + class117.aFloat1459 * f_215_ / f_210_);
					fs_131_[i_206_] = (class117.aFloat1442 + class117.aFloat1439 * f_216_ / f_210_);
					fs_132_[i_206_] = f_211_;
					fs_133_[i_206_] = f_210_;
				}
				if (class102.aShortArray1213 != null) {
					for (int i_217_ = 0; i_217_ < class102.aShort1219; i_217_++) {
						int i_218_ = i_217_ * 3;
						int i_219_ = i_218_ + 1;
						int i_220_ = i_219_ + 1;
						float f = fs[i_218_];
						float f_221_ = fs[i_219_];
						float f_222_ = fs[i_220_];
						float f_223_ = fs_131_[i_218_];
						float f_224_ = fs_131_[i_219_];
						float f_225_ = fs_131_[i_220_];
						float f_226_ = (fs_134_[i_218_] + fs_134_[i_219_] + fs_134_[i_220_]);
						if (((f - f_221_) * (f_225_ - f_224_) - (f_223_ - f_224_) * (f_222_ - f_221_)) > 0.0F) {
							class117.aBool1449 = (f < 0.0F || f_221_ < 0.0F || f_222_ < 0.0F || f > (float) class117.anInt1441 || f_221_ > (float) class117.anInt1441 || f_222_ > (float) class117.anInt1441);
							Class164 class164 = null;
							boolean bool_227_ = false;
							if (class102.aShortArray1213[i_217_] != -1) {
								class164 = (aClass167_Sub1_9827.aClass174_1852.method2446((class102.aShortArray1213[i_217_] & 0xffff), -35821048));
								bool_227_ = class164.aBool1814;
							}
							if (f_226_ < 3.0F) {
								if (f_226_ > 0.0F) {
									if (bool_227_) {
										int i_228_ = -16777216;
										if (method9051(class164.aByte1797))
											i_228_ = -1694498816;
										class117.method1491(true, true, false, f_223_, f_224_, f_225_, f, f_221_, f_222_, fs_132_[i_218_], fs_132_[i_219_], fs_132_[i_220_], fs_133_[i_218_], fs_133_[i_219_], fs_133_[i_220_], ((float) (class102.aShortArray1215[i_218_]) / (float) (anInt1767 * -1504778739)), ((float) (class102.aShortArray1215[i_219_]) / (float) (anInt1767 * -1504778739)), ((float) (class102.aShortArray1215[i_220_]) / (float) (anInt1767 * -1504778739)),
												((float) (class102.aShortArray1216[i_218_]) / (float) (anInt1767 * -1504778739)), ((float) (class102.aShortArray1216[i_219_]) / (float) (anInt1767 * -1504778739)), ((float) (class102.aShortArray1216[i_220_]) / (float) (anInt1767 * -1504778739)), i_228_ | (class102.anIntArray1217[i_218_]) & 0xffffff, i_228_ | (class102.anIntArray1217[i_219_]) & 0xffffff, i_228_ | (class102.anIntArray1217[i_220_]) & 0xffffff, class107.anInt1282 * 900823373,
												fs_134_[i_218_] * 255.0F, fs_134_[i_219_] * 255.0F, fs_134_[i_220_] * 255.0F, (class102.aShortArray1213[i_217_] & 0xffff));
									} else if ((class102.anIntArray1217[i_218_] & 0xffffff) != 0) {
										class117.method1504(true, true, false, f_223_, f_224_, f_225_, f, f_221_, f_222_, fs_132_[i_218_], fs_132_[i_219_], fs_132_[i_220_], (Class97.method1319(class102.anIntArray1217[i_218_], ((int) (fs_134_[i_218_] * 255.0F) << 24 | (class107.anInt1282 * 900823373)), (byte) 98)), (Class97.method1319(class102.anIntArray1217[i_219_], ((int) (fs_134_[i_219_] * 255.0F) << 24 | (class107.anInt1282 * 900823373)), (byte) 118)),
												(Class97.method1319(class102.anIntArray1217[i_220_], ((int) (fs_134_[i_220_] * 255.0F) << 24 | (class107.anInt1282 * 900823373)), (byte) 118)));
										class117.anInt1436 = 0;
									}
								} else if (bool_227_) {
									int i_229_ = -16777216;
									if (method9051(class164.aByte1797))
										i_229_ = -1694498816;
									class117.method1491(true, true, false, f_223_, f_224_, f_225_, f, f_221_, f_222_, fs_132_[i_218_], fs_132_[i_219_], fs_132_[i_220_], fs_133_[i_218_], fs_133_[i_219_], fs_133_[i_220_], ((float) (class102.aShortArray1215[i_218_]) / (float) (anInt1767 * -1504778739)), ((float) (class102.aShortArray1215[i_219_]) / (float) (anInt1767 * -1504778739)), ((float) (class102.aShortArray1215[i_220_]) / (float) (anInt1767 * -1504778739)),
											((float) (class102.aShortArray1216[i_218_]) / (float) (anInt1767 * -1504778739)), ((float) (class102.aShortArray1216[i_219_]) / (float) (anInt1767 * -1504778739)), ((float) (class102.aShortArray1216[i_220_]) / (float) (anInt1767 * -1504778739)), i_229_ | (class102.anIntArray1217[i_218_]) & 0xffffff, i_229_ | (class102.anIntArray1217[i_219_]) & 0xffffff, i_229_ | (class102.anIntArray1217[i_220_]) & 0xffffff, 0, 0.0F, 0.0F, 0.0F,
											(class102.aShortArray1213[i_217_] & 0xffff));
								} else if ((class102.anIntArray1217[i_218_] & 0xffffff) != 0) {
									class117.method1504(true, true, false, f_223_, f_224_, f_225_, f, f_221_, f_222_, fs_132_[i_218_], fs_132_[i_219_], fs_132_[i_220_], class102.anIntArray1217[i_218_], class102.anIntArray1217[i_219_], class102.anIntArray1217[i_220_]);
									class117.anInt1436 = 0;
								}
							} else
								class117.method1507(true, true, false, f_223_, f_224_, f_225_, f, f_221_, f_222_, fs_132_[i_218_], fs_132_[i_219_], fs_132_[i_220_], (class107.anInt1282 * 900823373));
						}
					}
				} else {
					for (int i_230_ = 0; i_230_ < class102.aShort1219; i_230_++) {
						int i_231_ = i_230_ * 3;
						int i_232_ = i_231_ + 1;
						int i_233_ = i_232_ + 1;
						float f = fs[i_231_];
						float f_234_ = fs[i_232_];
						float f_235_ = fs[i_233_];
						float f_236_ = fs_131_[i_231_];
						float f_237_ = fs_131_[i_232_];
						float f_238_ = fs_131_[i_233_];
						float f_239_ = (fs_134_[i_231_] + fs_134_[i_232_] + fs_134_[i_233_]);
						if (((f - f_234_) * (f_238_ - f_237_) - (f_236_ - f_237_) * (f_235_ - f_234_)) > 0.0F) {
							class117.aBool1449 = (f < 0.0F || f_234_ < 0.0F || f_235_ < 0.0F || f > (float) class117.anInt1441 || f_234_ > (float) class117.anInt1441 || f_235_ > (float) class117.anInt1441);
							if (f_239_ < 3.0F) {
								if (f_239_ > 0.0F) {
									if ((class102.anIntArray1217[i_231_] & 0xffffff) != 0)
										class117.method1504(true, true, false, f_236_, f_237_, f_238_, f, f_234_, f_235_, fs_132_[i_231_], fs_132_[i_232_], fs_132_[i_233_], (Class302.method4097(class102.anIntArray1217[i_231_], class107.anInt1282 * 900823373, fs_134_[i_231_] * 255.0F, -1250617064)), (Class302.method4097(class102.anIntArray1217[i_232_], class107.anInt1282 * 900823373, fs_134_[i_232_] * 255.0F, -1414969597)),
												(Class302.method4097(class102.anIntArray1217[i_233_], class107.anInt1282 * 900823373, fs_134_[i_233_] * 255.0F, -2009197403)));
								} else if ((class102.anIntArray1217[i_231_] & 0xffffff) != 0)
									class117.method1504(true, true, false, f_236_, f_237_, f_238_, f, f_234_, f_235_, fs_132_[i_231_], fs_132_[i_232_], fs_132_[i_233_], class102.anIntArray1217[i_231_], class102.anIntArray1217[i_232_], class102.anIntArray1217[i_233_]);
							} else
								class117.method1507(true, true, false, f_236_, f_237_, f_238_, f, f_234_, f_235_, fs_132_[i_231_], fs_132_[i_232_], fs_132_[i_233_], (class107.anInt1282 * 900823373));
						}
					}
				}
			}
		}
	}

	void method9048(int i, int i_240_, boolean bool, Class107 class107, Class117 class117, float[] fs, float[] fs_241_, float[] fs_242_, float[] fs_243_, float[] fs_244_, int i_245_) {
		Class134 class134 = aClass134ArrayArray9833[i][i_240_];
		if (i_245_ == 0 || (i_245_ & 0x2) == 0) {
			if (class134 != null) {
				for (int i_246_ = 0; i_246_ < class134.aShort1617; i_246_++) {
					int i_247_ = (class134.aShortArray1619[i_246_] + (i << anInt1768 * 2064238369));
					int i_248_ = class134.aShortArray1615[i_246_];
					int i_249_ = (class134.aShortArray1616[i_246_] + (i_240_ << anInt1768 * 2064238369));
					float f = aFloat9823 + (aFloat9836 * (float) i_247_ + aFloat9840 * (float) i_248_ + aFloat9844 * (float) i_249_);
					float f_250_ = aFloat9849 + (aFloat9854 * (float) i_247_ + aFloat9841 * (float) i_248_ + aFloat9845 * (float) i_249_);
					if (f < -f_250_)
						return;
					fs_244_[i_246_] = 0.0F;
					if (bool) {
						float f_251_ = f - class107.aFloat1277;
						if (f_251_ > 0.0F) {
							f_251_ /= class107.aFloat1281;
							if (f_251_ > 1.0F)
								f_251_ = 1.0F;
							fs_244_[i_246_] = f_251_;
							int i_252_ = (int) ((float) (class134.aShortArray1612[i_246_]) * f_251_);
							if (i_252_ > 0)
								i_248_ -= i_252_;
						}
					} else if (class107.aBool1279) {
						float f_253_ = f - class107.aFloat1277;
						if (f_253_ > 0.0F) {
							fs_244_[i_246_] = f_253_ / class107.aFloat1281;
							if (fs_244_[i_246_] > 1.0F)
								fs_244_[i_246_] = 1.0F;
						}
					}
					float f_254_ = aFloat9846 + (aFloat9834 * (float) i_247_ + aFloat9838 * (float) i_248_ + aFloat9842 * (float) i_249_);
					float f_255_ = aFloat9847 + (aFloat9848 * (float) i_247_ + aFloat9830 * (float) i_248_ + aFloat9839 * (float) i_249_);
					fs[i_246_] = (class117.aFloat1462 + class117.aFloat1459 * f_254_ / f_250_);
					fs_241_[i_246_] = (class117.aFloat1442 + class117.aFloat1439 * f_255_ / f_250_);
					fs_242_[i_246_] = (class117.aFloat1444 + class117.aFloat1445 * f / f_250_);
					fs_243_[i_246_] = f_250_;
				}
				float f = (float) (anInt1767 * -1504778739);
				for (int i_256_ = 0; i_256_ < class134.aShort1621; i_256_++) {
					int i_257_ = i_256_ * 3;
					int i_258_ = i_257_ + 1;
					int i_259_ = i_258_ + 1;
					float f_260_ = fs[i_257_];
					float f_261_ = fs[i_258_];
					float f_262_ = fs[i_259_];
					float f_263_ = fs_241_[i_257_];
					float f_264_ = fs_241_[i_258_];
					float f_265_ = fs_241_[i_259_];
					if (((f_260_ - f_261_) * (f_265_ - f_264_) - (f_263_ - f_264_) * (f_262_ - f_261_)) > 0.0F) {
						class117.aBool1449 = (f_260_ < 0.0F || f_261_ < 0.0F || f_262_ < 0.0F || f_260_ > (float) class117.anInt1441 || f_261_ > (float) class117.anInt1441 || f_262_ > (float) class117.anInt1441);
						if (fs_244_[i_257_] + fs_244_[i_258_] + fs_244_[i_259_] < 3.0F) {
							int i_266_ = i << anInt1768 * 2064238369;
							int i_267_ = i_240_ << anInt1768 * 2064238369;
							if ((class134.anIntArray1620[i_257_] & 0xffffff) != 0) {
								if (class134.aShortArray1618[i_257_] != -1 && class134.aShortArray1618[i_258_] != -1 && (class134.aShortArray1618[i_259_] != -1)) {
									if ((class134.aShortArray1618[i_257_] == class134.aShortArray1618[i_258_]) && (class134.aShortArray1618[i_257_] == (class134.aShortArray1618[i_259_])) && (class134.aShortArray1613[i_257_] == (class134.aShortArray1613[i_258_])) && (class134.aShortArray1613[i_257_] == (class134.aShortArray1613[i_259_])))
										class117.method1491(true, true, false, f_263_, f_264_, f_265_, f_260_, f_261_, f_262_, fs_242_[i_257_], fs_242_[i_258_], fs_242_[i_259_], fs_243_[i_257_], fs_243_[i_258_], fs_243_[i_259_], ((float) (i_266_ + (class134.aShortArray1619[i_257_])) / (float) (class134.aShortArray1613[i_257_])), ((float) (i_266_ + (class134.aShortArray1619[i_258_])) / (float) (class134.aShortArray1613[i_258_])),
												((float) (i_266_ + (class134.aShortArray1619[i_259_])) / (float) (class134.aShortArray1613[i_259_])), ((float) (i_267_ + (class134.aShortArray1616[i_257_])) / (float) (class134.aShortArray1613[i_257_])), ((float) (i_267_ + (class134.aShortArray1616[i_258_])) / (float) (class134.aShortArray1613[i_258_])), ((float) (i_267_ + (class134.aShortArray1616[i_259_])) / (float) (class134.aShortArray1613[i_259_])), class134.anIntArray1620[i_257_],
												class134.anIntArray1620[i_258_], class134.anIntArray1620[i_259_], class107.anInt1282 * 900823373, fs_244_[i_257_] * 255.0F, fs_244_[i_258_] * 255.0F, fs_244_[i_259_] * 255.0F, (class134.aShortArray1618[i_257_] & 0xffff));
									else
										class117.method1493(true, true, false, f_263_, f_264_, f_265_, f_260_, f_261_, f_262_, fs_242_[i_257_], fs_242_[i_258_], fs_242_[i_259_], fs_243_[i_257_], fs_243_[i_258_], fs_243_[i_259_], (float) (i_266_ + (class134.aShortArray1619[i_257_])) / f, (float) (i_266_ + (class134.aShortArray1619[i_258_])) / f, (float) (i_266_ + (class134.aShortArray1619[i_259_])) / f, (float) (i_267_ + (class134.aShortArray1616[i_257_])) / f,
												(float) (i_267_ + (class134.aShortArray1616[i_258_])) / f, (float) (i_267_ + (class134.aShortArray1616[i_259_])) / f, class134.anIntArray1620[i_257_], class134.anIntArray1620[i_258_], class134.anIntArray1620[i_259_], class107.anInt1282 * 900823373, fs_244_[i_257_] * 255.0F, fs_244_[i_258_] * 255.0F, fs_244_[i_259_] * 255.0F, (class134.aShortArray1618[i_257_] & 0xffff), f / (float) (class134.aShortArray1613[i_257_]),
												(class134.aShortArray1618[i_258_] & 0xffff), f / (float) (class134.aShortArray1613[i_258_]), (class134.aShortArray1618[i_259_] & 0xffff), f / (float) (class134.aShortArray1613[i_259_]));
								} else if ((fs_244_[i_257_] + fs_244_[i_258_] + fs_244_[i_259_]) > 0.0F)
									class117.method1504(true, true, false, f_263_, f_264_, f_265_, f_260_, f_261_, f_262_, fs_242_[i_257_], fs_242_[i_258_], fs_242_[i_259_], (Class302.method4097(class134.anIntArray1620[i_257_], class107.anInt1282 * 900823373, fs_244_[i_257_] * 255.0F, -1287705153)), (Class302.method4097(class134.anIntArray1620[i_258_], class107.anInt1282 * 900823373, fs_244_[i_258_] * 255.0F, -2108061539)),
											(Class302.method4097(class134.anIntArray1620[i_259_], class107.anInt1282 * 900823373, fs_244_[i_259_] * 255.0F, -1310025644)));
								else
									class117.method1504(true, true, false, f_263_, f_264_, f_265_, f_260_, f_261_, f_262_, fs_242_[i_257_], fs_242_[i_258_], fs_242_[i_259_], class134.anIntArray1620[i_257_], class134.anIntArray1620[i_258_], class134.anIntArray1620[i_259_]);
							}
						} else
							class117.method1507(true, true, false, f_263_, f_264_, f_265_, f_260_, f_261_, f_262_, fs_242_[i_257_], fs_242_[i_258_], fs_242_[i_259_], (class107.anInt1282 * 900823373));
					}
				}
			}
		}
	}

	public void method1938(int i, int i_268_, int i_269_) {
		i = Math.min(aByteArrayArray9843.length - 1, Math.max(0, i));
		i_268_ = Math.min(aByteArrayArray9843[i].length - 1, Math.max(0, i_268_));
		if (aByteArrayArray9843[i][i_268_] < i_269_)
			aByteArrayArray9843[i][i_268_] = (byte) i_269_;
	}

	public void method1951(int i, int i_270_, int i_271_, boolean[][] bools, boolean bool, int i_272_) {
		if (aClass167_Sub1_9827.anIntArray8996 == null || aClass167_Sub1_9827.aFloatArray8999 == null)
			throw new IllegalStateException("");
		Class443 class443 = aClass167_Sub1_9827.aClass443_9013;
		aFloat9834 = class443.aFloatArray4878[0];
		aFloat9848 = class443.aFloatArray4878[1];
		aFloat9836 = class443.aFloatArray4878[2];
		aFloat9854 = class443.aFloatArray4878[3];
		aFloat9838 = class443.aFloatArray4878[4];
		aFloat9830 = class443.aFloatArray4878[5];
		aFloat9840 = class443.aFloatArray4878[6];
		aFloat9841 = class443.aFloatArray4878[7];
		aFloat9842 = class443.aFloatArray4878[8];
		aFloat9839 = class443.aFloatArray4878[9];
		aFloat9844 = class443.aFloatArray4878[10];
		aFloat9845 = class443.aFloatArray4878[11];
		aFloat9846 = class443.aFloatArray4878[12];
		aFloat9847 = class443.aFloatArray4878[13];
		aFloat9823 = class443.aFloatArray4878[14];
		aFloat9849 = class443.aFloatArray4878[15];
		for (int i_273_ = 0; i_273_ < i_271_ + i_271_; i_273_++) {
			for (int i_274_ = 0; i_274_ < i_271_ + i_271_; i_274_++) {
				if (bools[i_273_][i_274_]) {
					int i_275_ = i - i_271_ + i_273_;
					int i_276_ = i_270_ - i_271_ + i_274_;
					if (i_275_ >= 0 && i_275_ < anInt1766 * 1718142487 && i_276_ >= 0 && i_276_ < anInt1769 * -889224915)
						method9045(i_275_, i_276_, i_272_);
				}
			}
		}
	}

	void method9049(int i, int i_277_, int i_278_, int i_279_, int i_280_, int i_281_, int i_282_, boolean[][] bools, Class107 class107, Class117 class117, float[] fs, float[] fs_283_) {
		int i_284_ = (i_282_ - i_280_) * i_278_ / 256;
		int i_285_ = i_278_ >> 8;
		boolean bool = class107.aBool1285;
		aClass167_Sub1_9827.method2302(false);
		class117.aBool1434 = false;
		class117.aBool1435 = false;
		int i_286_ = i;
		int i_287_ = i_277_ + i_284_;
		for (int i_288_ = i_279_; i_288_ < i_281_; i_288_++) {
			for (int i_289_ = i_280_; i_289_ < i_282_; i_289_++) {
				if (bools[i_288_ - i_279_][i_289_ - i_280_]) {
					if (aClass136ArrayArray9829[i_288_][i_289_] != null) {
						Class136 class136 = aClass136ArrayArray9829[i_288_][i_289_];
						if (class136.aShort1632 != -1 && (class136.aByte1629 & 0x2) == 0 && class136.anInt1631 == -1) {
							int i_290_ = aClass167_Sub1_9827.method8448((class136.aShort1632) & 0xffff);
							class117.method1487(true, true, false, (float) (i_287_ - i_285_), (float) (i_287_ - i_285_), (float) i_287_, (float) (i_286_ + i_285_), (float) i_286_, (float) (i_286_ + i_285_), 100.0F, 100.0F, 100.0F, (float) Class267.method3703(i_290_, ((class136.aShort1627) & 0xffff), -329965339), (float) Class267.method3703(i_290_, ((class136.aShort1630) & 0xffff), -329965339), (float) Class267.method3703(i_290_, ((class136.aShort1628) & 0xffff), -329965339));
							class117.method1487(true, true, false, (float) i_287_, (float) i_287_, (float) (i_287_ - i_285_), (float) i_286_, (float) (i_286_ + i_285_), (float) i_286_, 100.0F, 100.0F, 100.0F, (float) Class267.method3703(i_290_, ((class136.aShort1626) & 0xffff), -329965339), (float) Class267.method3703(i_290_, ((class136.aShort1628) & 0xffff), -329965339), (float) Class267.method3703(i_290_, ((class136.aShort1630) & 0xffff), -329965339));
						} else if (class136.anInt1631 == -1) {
							class117.method1487(true, true, false, (float) (i_287_ - i_285_), (float) (i_287_ - i_285_), (float) i_287_, (float) (i_286_ + i_285_), (float) i_286_, (float) (i_286_ + i_285_), 100.0F, 100.0F, 100.0F, (float) (class136.aShort1627 & 0xffff), (float) (class136.aShort1630 & 0xffff), (float) (class136.aShort1628 & 0xffff));
							class117.method1487(true, true, false, (float) i_287_, (float) i_287_, (float) (i_287_ - i_285_), (float) i_286_, (float) (i_286_ + i_285_), (float) i_286_, 100.0F, 100.0F, 100.0F, (float) (class136.aShort1626 & 0xffff), (float) (class136.aShort1628 & 0xffff), (float) (class136.aShort1630 & 0xffff));
						} else {
							int i_291_ = class136.anInt1631;
							class117.method1487(true, true, false, (float) (i_287_ - i_285_), (float) (i_287_ - i_285_), (float) i_287_, (float) (i_286_ + i_285_), (float) i_286_, (float) (i_286_ + i_285_), 100.0F, 100.0F, 100.0F, (float) i_291_, (float) i_291_, (float) i_291_);
							class117.method1487(true, true, false, (float) i_287_, (float) i_287_, (float) (i_287_ - i_285_), (float) i_286_, (float) (i_286_ + i_285_), (float) i_286_, 100.0F, 100.0F, 100.0F, (float) i_291_, (float) i_291_, (float) i_291_);
						}
					} else if (aClass113ArrayArray9851[i_288_][i_289_] != null) {
						Class113 class113 = aClass113ArrayArray9851[i_288_][i_289_];
						for (int i_292_ = 0; i_292_ < class113.aShort1399; i_292_++) {
							fs[i_292_] = (float) (i_286_ + (class113.aShortArray1403[i_292_] * i_285_ / (anInt1767 * -1504778739)));
							fs_283_[i_292_] = (float) (i_287_ - (class113.aShortArray1400[i_292_] * i_285_ / (anInt1767 * -1504778739)));
						}
						for (int i_293_ = 0; i_293_ < class113.aShort1397; i_293_++) {
							short i_294_ = class113.aShortArray1398[i_293_];
							short i_295_ = class113.aShortArray1402[i_293_];
							short i_296_ = class113.aShortArray1404[i_293_];
							float f = fs[i_294_];
							float f_297_ = fs[i_295_];
							float f_298_ = fs[i_296_];
							float f_299_ = fs_283_[i_294_];
							float f_300_ = fs_283_[i_295_];
							float f_301_ = fs_283_[i_296_];
							if (class113.anIntArray1408 != null && class113.anIntArray1408[i_293_] != -1) {
								int i_302_ = class113.anIntArray1408[i_293_];
								class117.method1487(true, true, false, f_299_, f_300_, f_301_, f, f_297_, f_298_, 100.0F, 100.0F, 100.0F, (float) (Class267.method3703(i_302_, (class113.aShortArray1401[i_294_]), -329965339)), (float) (Class267.method3703(i_302_, (class113.aShortArray1401[i_295_]), -329965339)), (float) (Class267.method3703(i_302_, (class113.aShortArray1401[i_296_]), -329965339)));
							} else if (class113.aShortArray1405 != null && (class113.aShortArray1405[i_293_] != -1)) {
								int i_303_ = (aClass167_Sub1_9827.method8448(class113.aShortArray1405[i_293_] & 0xffff));
								class117.method1487(true, true, false, f_299_, f_300_, f_301_, f, f_297_, f_298_, 100.0F, 100.0F, 100.0F, (float) (Class267.method3703(i_303_, (class113.aShortArray1401[i_294_]), -329965339)), (float) (Class267.method3703(i_303_, (class113.aShortArray1401[i_295_]), -329965339)), (float) (Class267.method3703(i_303_, (class113.aShortArray1401[i_296_]), -329965339)));
							} else {
								int i_304_ = class113.anIntArray1407[i_293_];
								class117.method1487(true, true, false, f_299_, f_300_, f_301_, f, f_297_, f_298_, 100.0F, 100.0F, 100.0F, (float) (Class267.method3703(i_304_, (class113.aShortArray1401[i_294_]), -329965339)), (float) (Class267.method3703(i_304_, (class113.aShortArray1401[i_295_]), -329965339)), (float) (Class267.method3703(i_304_, (class113.aShortArray1401[i_296_]), -329965339)));
							}
						}
					}
				}
				i_287_ -= i_285_;
			}
			i_287_ = i_277_ + i_284_;
			i_286_ += i_285_;
		}
		class117.aBool1434 = true;
		aClass167_Sub1_9827.method2302(bool);
	}

	public boolean method1924(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_305_, int i_306_, int i_307_, boolean bool) {
		return false;
	}

	public void method1923(int i, int i_308_, int i_309_, boolean[][] bools, boolean bool, int i_310_) {
		if (aClass167_Sub1_9827.anIntArray8996 == null || aClass167_Sub1_9827.aFloatArray8999 == null)
			throw new IllegalStateException("");
		Class443 class443 = aClass167_Sub1_9827.aClass443_9013;
		aFloat9834 = class443.aFloatArray4878[0];
		aFloat9848 = class443.aFloatArray4878[1];
		aFloat9836 = class443.aFloatArray4878[2];
		aFloat9854 = class443.aFloatArray4878[3];
		aFloat9838 = class443.aFloatArray4878[4];
		aFloat9830 = class443.aFloatArray4878[5];
		aFloat9840 = class443.aFloatArray4878[6];
		aFloat9841 = class443.aFloatArray4878[7];
		aFloat9842 = class443.aFloatArray4878[8];
		aFloat9839 = class443.aFloatArray4878[9];
		aFloat9844 = class443.aFloatArray4878[10];
		aFloat9845 = class443.aFloatArray4878[11];
		aFloat9846 = class443.aFloatArray4878[12];
		aFloat9847 = class443.aFloatArray4878[13];
		aFloat9823 = class443.aFloatArray4878[14];
		aFloat9849 = class443.aFloatArray4878[15];
		for (int i_311_ = 0; i_311_ < i_309_ + i_309_; i_311_++) {
			for (int i_312_ = 0; i_312_ < i_309_ + i_309_; i_312_++) {
				if (bools[i_311_][i_312_]) {
					int i_313_ = i - i_309_ + i_311_;
					int i_314_ = i_308_ - i_309_ + i_312_;
					if (i_313_ >= 0 && i_313_ < anInt1766 * 1718142487 && i_314_ >= 0 && i_314_ < anInt1769 * -889224915)
						method9045(i_313_, i_314_, i_310_);
				}
			}
		}
	}

	public void method1945(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_315_, int i_316_, int i_317_, boolean bool) {
		/* empty */
	}

	public void method1922() {
		aByteArrayArray9835 = null;
		aByteArrayArray9843 = null;
	}

	public void method1932(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_318_, int i_319_, int i_320_, boolean bool) {
		/* empty */
	}

	public boolean method1930(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_321_, int i_322_, int i_323_, boolean bool) {
		return false;
	}

	public void method1955(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_324_, int i_325_, int i_326_, boolean bool) {
		/* empty */
	}

	public void method1931(int i, int i_327_, int[] is, int[] is_328_, int[] is_329_, int[] is_330_, int[] is_331_, int[] is_332_, int[] is_333_, int[] is_334_, int[] is_335_, int[] is_336_, int[] is_337_, Class175 class175, boolean bool) {
		if (aClass136ArrayArray9829 == null) {
			aClass136ArrayArray9829 = new Class136[anInt1766 * 1718142487][anInt1769 * -889224915];
			aClass113ArrayArray9851 = new Class113[anInt1766 * 1718142487][anInt1769 * -889224915];
		} else if (aClass115ArrayArray9831 != null || aClass134ArrayArray9833 != null)
			throw new IllegalStateException();
		boolean bool_338_ = false;
		if (is_334_.length == 2 && is_331_.length == 2 && (is_334_[0] == is_334_[1] || is_336_[0] != -1 && is_336_[0] == is_336_[1])) {
			bool_338_ = true;
			for (int i_339_ = 1; i_339_ < 2; i_339_++) {
				int i_340_ = is[is_331_[i_339_]];
				int i_341_ = is_329_[is_331_[i_339_]];
				if (i_340_ != 0 && i_340_ != anInt1767 * -1504778739 || i_341_ != 0 && i_341_ != anInt1767 * -1504778739) {
					bool_338_ = false;
					break;
				}
			}
		}
		if (!bool_338_) {
			Class113 class113 = new Class113();
			short i_342_ = (short) is.length;
			int i_343_ = (short) is_334_.length;
			class113.aShort1399 = i_342_;
			class113.aShortArray1401 = new short[i_342_];
			class113.aShortArray1403 = new short[i_342_];
			class113.aShortArray1396 = new short[i_342_];
			class113.aShortArray1400 = new short[i_342_];
			for (int i_344_ = 0; i_344_ < i_342_; i_344_++) {
				int i_345_ = is[i_344_];
				int i_346_ = is_329_[i_344_];
				if (i_345_ == 0 && i_346_ == 0)
					class113.aShortArray1401[i_344_] = (short) (aByteArrayArray9835[i][i_327_] - aByteArrayArray9843[i][i_327_]);
				else if (i_345_ == 0 && i_346_ == anInt1767 * -1504778739)
					class113.aShortArray1401[i_344_] = (short) (aByteArrayArray9835[i][i_327_ + 1] - aByteArrayArray9843[i][i_327_ + 1]);
				else if (i_345_ == anInt1767 * -1504778739 && i_346_ == anInt1767 * -1504778739)
					class113.aShortArray1401[i_344_] = (short) (aByteArrayArray9835[i + 1][i_327_ + 1] - aByteArrayArray9843[i + 1][i_327_ + 1]);
				else if (i_345_ == anInt1767 * -1504778739 && i_346_ == 0)
					class113.aShortArray1401[i_344_] = (short) (aByteArrayArray9835[i + 1][i_327_] - aByteArrayArray9843[i + 1][i_327_]);
				else {
					int i_347_ = (((aByteArrayArray9835[i][i_327_] - aByteArrayArray9843[i][i_327_]) * (anInt1767 * -1504778739 - i_345_)) + (aByteArrayArray9835[i + 1][i_327_] - aByteArrayArray9843[i + 1][i_327_]) * i_345_);
					int i_348_ = (((aByteArrayArray9835[i][i_327_ + 1] - aByteArrayArray9843[i][i_327_ + 1]) * (anInt1767 * -1504778739 - i_345_)) + ((aByteArrayArray9835[i + 1][i_327_ + 1] - aByteArrayArray9843[i + 1][i_327_ + 1]) * i_345_));
					class113.aShortArray1401[i_344_] = (short) ((i_347_ * (anInt1767 * -1504778739 - i_346_) + i_348_ * i_346_) >> anInt1768 * -166490558);
				}
				int i_349_ = (i << anInt1768 * 2064238369) + i_345_;
				int i_350_ = (i_327_ << anInt1768 * 2064238369) + i_346_;
				class113.aShortArray1403[i_344_] = (short) i_345_;
				class113.aShortArray1400[i_344_] = (short) i_346_;
				class113.aShortArray1396[i_344_] = (short) (method1925(i_349_, i_350_, (byte) -58) + (is_328_ != null ? is_328_[i_344_] : 0));
				if (class113.aShortArray1401[i_344_] < 2)
					class113.aShortArray1401[i_344_] = (short) 2;
			}
			boolean bool_351_ = false;
			int i_352_ = 0;
			for (int i_353_ = 0; i_353_ < i_343_; i_353_++) {
				if (is_334_[i_353_] >= 0 || is_335_ != null && is_335_[i_353_] >= 0)
					i_352_++;
				int i_354_ = is_336_[i_353_];
				if (i_354_ != -1) {
					Class164 class164 = aClass167_Sub1_9827.aClass174_1852.method2446(i_354_, -639717752);
					if (!class164.aBool1820) {
						bool_351_ = true;
						if (method9051(class164.aByte1797) || class164.aByte1802 != 0 || class164.aByte1803 != 0)
							class113.aByte1395 |= 0x4;
					}
				}
			}
			class113.anIntArray1407 = new int[i_352_];
			if (is_335_ != null)
				class113.anIntArray1408 = new int[i_352_];
			class113.aShortArray1398 = new short[i_352_];
			class113.aShortArray1402 = new short[i_352_];
			class113.aShortArray1404 = new short[i_352_];
			if (bool_351_) {
				class113.aShortArray1405 = new short[i_352_];
				class113.aShortArray1406 = new short[i_352_];
			}
			for (int i_355_ = 0; i_355_ < i_343_; i_355_++) {
				if (is_334_[i_355_] >= 0 || is_335_ != null && is_335_[i_355_] >= 0) {
					if (is_334_[i_355_] >= 0)
						class113.anIntArray1407[class113.aShort1397] = Class254.method3537(is_334_[i_355_], 1409175155);
					else
						class113.anIntArray1407[class113.aShort1397] = -1;
					if (is_335_ != null) {
						if (is_335_[i_355_] != -1)
							class113.anIntArray1408[class113.aShort1397] = Class254.method3537(is_335_[i_355_], 1409175155);
						else
							class113.anIntArray1408[class113.aShort1397] = -1;
					}
					class113.aShortArray1398[class113.aShort1397] = (short) is_331_[i_355_];
					class113.aShortArray1402[class113.aShort1397] = (short) is_332_[i_355_];
					class113.aShortArray1404[class113.aShort1397] = (short) is_333_[i_355_];
					if (bool_351_) {
						if (is_336_[i_355_] != -1 && !(aClass167_Sub1_9827.aClass174_1852.method2446(is_336_[i_355_], -1964304370).aBool1820)) {
							class113.aShortArray1405[class113.aShort1397] = (short) is_336_[i_355_];
							class113.aShortArray1406[class113.aShort1397] = (short) is_337_[i_355_];
						} else
							class113.aShortArray1405[class113.aShort1397] = (short) -1;
					}
					class113.aShort1397++;
				}
			}
			aClass113ArrayArray9851[i][i_327_] = class113;
		} else if (is_334_[0] >= 0 || is_335_ != null && is_335_[0] >= 0) {
			Class136 class136 = new Class136();
			int i_356_ = is_334_[0];
			int i_357_ = is_336_[0];
			if (is_335_ != null) {
				class136.anInt1631 = Class267.method3703(Class254.method3537(is_335_[0], 1409175155), (aByteArrayArray9835[i][i_327_] - aByteArrayArray9843[i][i_327_]), -329965339);
				if (i_356_ == -1)
					class136.aByte1629 |= 0x2;
			}
			if ((anIntArrayArray1765[i][i_327_] == anIntArrayArray1765[i + 1][i_327_]) && (anIntArrayArray1765[i][i_327_] == anIntArrayArray1765[i + 1][i_327_ + 1]) && (anIntArrayArray1765[i][i_327_] == anIntArrayArray1765[i][i_327_ + 1]))
				class136.aByte1629 |= 0x1;
			Class164 class164 = null;
			if (i_357_ != -1)
				class164 = aClass167_Sub1_9827.aClass174_1852.method2446(i_357_, -823825588);
			if (class164 != null && (class136.aByte1629 & 0x2) == 0 && !class164.aBool1820) {
				class136.aShort1626 = (short) (aByteArrayArray9835[i][i_327_] - aByteArrayArray9843[i][i_327_]);
				class136.aShort1628 = (short) (aByteArrayArray9835[i + 1][i_327_] - aByteArrayArray9843[i + 1][i_327_]);
				class136.aShort1627 = (short) (aByteArrayArray9835[i + 1][i_327_ + 1] - aByteArrayArray9843[i + 1][i_327_ + 1]);
				class136.aShort1630 = (short) (aByteArrayArray9835[i][i_327_ + 1] - aByteArrayArray9843[i][i_327_ + 1]);
				class136.aShort1632 = (short) i_357_;
				if (method9051(class164.aByte1797) || class164.aByte1802 != 0 || class164.aByte1803 != 0)
					class136.aByte1629 |= 0x4;
			} else {
				short i_358_ = Class254.method3537(i_356_, 1409175155);
				class136.aShort1626 = (short) Class267.method3703(i_358_, ((aByteArrayArray9835[i][i_327_]) - (aByteArrayArray9843[i][i_327_])), -329965339);
				class136.aShort1628 = (short) Class267.method3703(i_358_, ((aByteArrayArray9835[i + 1][i_327_]) - (aByteArrayArray9843[i + 1][i_327_])), -329965339);
				class136.aShort1627 = (short) Class267.method3703(i_358_, ((aByteArrayArray9835[i + 1][i_327_ + 1]) - (aByteArrayArray9843[i + 1][i_327_ + 1])), -329965339);
				class136.aShort1630 = (short) Class267.method3703(i_358_, ((aByteArrayArray9835[i][i_327_ + 1]) - (aByteArrayArray9843[i][i_327_ + 1])), -329965339);
				class136.aShort1632 = (short) -1;
			}
			aClass136ArrayArray9829[i][i_327_] = class136;
		}
	}

	public void method1935(int i, int i_359_, int[] is, int[] is_360_, int[] is_361_, int[] is_362_, int[] is_363_, int[] is_364_, int[] is_365_, int[] is_366_, Class175 class175, boolean bool) {
		boolean bool_367_ = (anInt9828 & 0x20) == 0;
		if (aClass115ArrayArray9831 == null && !bool_367_) {
			aClass115ArrayArray9831 = new Class115[anInt1766 * 1718142487][anInt1769 * -889224915];
			aClass102ArrayArray9826 = new Class102[anInt1766 * 1718142487][anInt1769 * -889224915];
		} else if (aClass134ArrayArray9833 == null && bool_367_)
			aClass134ArrayArray9833 = new Class134[anInt1766 * 1718142487][anInt1769 * -889224915];
		else if (aClass136ArrayArray9829 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_368_ = 0; i_368_ < is_363_.length; i_368_++) {
				if (is_363_[i_368_] == -1)
					is_363_[i_368_] = 0;
				else
					is_363_[i_368_] = (ColourUtils.anIntArray8308[(Class254.method3537(is_363_[i_368_], 1409175155) & 0xffff)]) << 8 | 0xff;
			}
			if (is_364_ != null) {
				for (int i_369_ = 0; i_369_ < is_364_.length; i_369_++) {
					if (is_364_[i_369_] == -1)
						is_364_[i_369_] = 0;
					else
						is_364_[i_369_] = ((ColourUtils.anIntArray8308[Class254.method3537(is_364_[i_369_], 1409175155) & 0xffff]) << 8) | 0xff;
				}
			}
			if (bool_367_) {
				Class134 class134 = new Class134();
				class134.aShort1617 = (short) is.length;
				class134.aShort1621 = (short) (is.length / 3);
				class134.aShortArray1619 = new short[class134.aShort1617];
				class134.aShortArray1615 = new short[class134.aShort1617];
				class134.aShortArray1616 = new short[class134.aShort1617];
				class134.anIntArray1620 = new int[class134.aShort1617];
				class134.aShortArray1618 = new short[class134.aShort1617];
				class134.aShortArray1613 = new short[class134.aShort1617];
				class134.aByteArray1614 = new byte[class134.aShort1617];
				if (is_362_ != null)
					class134.aShortArray1612 = new short[class134.aShort1617];
				for (int i_370_ = 0; i_370_ < class134.aShort1617; i_370_++) {
					int i_371_ = is[i_370_];
					int i_372_ = is_361_[i_370_];
					boolean bool_373_ = false;
					int i_374_;
					if (i_371_ == 0 && i_372_ == 0)
						i_374_ = (aByteArrayArray9835[i][i_359_] - aByteArrayArray9843[i][i_359_]);
					else if (i_371_ == 0 && i_372_ == anInt1767 * -1504778739)
						i_374_ = (aByteArrayArray9835[i][i_359_ + 1] - aByteArrayArray9843[i][i_359_ + 1]);
					else if (i_371_ == anInt1767 * -1504778739 && i_372_ == anInt1767 * -1504778739)
						i_374_ = (aByteArrayArray9835[i + 1][i_359_ + 1] - aByteArrayArray9843[i + 1][i_359_ + 1]);
					else if (i_371_ == anInt1767 * -1504778739 && i_372_ == 0)
						i_374_ = (aByteArrayArray9835[i + 1][i_359_] - aByteArrayArray9843[i + 1][i_359_]);
					else {
						int i_375_ = (((aByteArrayArray9835[i][i_359_] - aByteArrayArray9843[i][i_359_]) * (anInt1767 * -1504778739 - i_371_)) + ((aByteArrayArray9835[i + 1][i_359_] - aByteArrayArray9843[i + 1][i_359_]) * i_371_));
						int i_376_ = (((aByteArrayArray9835[i][i_359_ + 1] - aByteArrayArray9843[i][i_359_ + 1]) * (anInt1767 * -1504778739 - i_371_)) + ((aByteArrayArray9835[i + 1][i_359_ + 1] - aByteArrayArray9843[i + 1][i_359_ + 1]) * i_371_));
						i_374_ = (i_375_ * (anInt1767 * -1504778739 - i_372_) + i_376_ * i_372_) >> anInt1768 * -166490558;
					}
					int i_377_ = (i << anInt1768 * 2064238369) + i_371_;
					int i_378_ = (i_359_ << anInt1768 * 2064238369) + i_372_;
					class134.aShortArray1619[i_370_] = (short) i_371_;
					class134.aShortArray1616[i_370_] = (short) i_372_;
					class134.aShortArray1615[i_370_] = (short) (method1925(i_377_, i_378_, (byte) 18) + (is_360_ != null ? is_360_[i_370_] : 0));
					if (i_374_ < 0)
						i_374_ = 0;
					if (is_363_[i_370_] == 0) {
						class134.anIntArray1620[i_370_] = 0;
						if (is_364_ != null)
							class134.aByteArray1614[i_370_] = (byte) i_374_;
					} else {
						int i_379_ = 0;
						if (is_362_ != null) {
							int i_380_ = (class134.aShortArray1612[i_370_] = (short) is_362_[i_370_]);
							if (class175.anInt1934 * 71478565 != 0) {
								i_379_ = 255 * i_380_ / (class175.anInt1934 * 71478565);
								if (i_379_ < 0)
									i_379_ = 0;
								else if (i_379_ > 255)
									i_379_ = 255;
							}
						}
						int i_381_ = -16777216;
						if (is_365_[i_370_] != -1) {
							Class164 class164 = aClass167_Sub1_9827.aClass174_1852.method2446(is_365_[i_370_], -832142814);
							if (class164.aBool1814 && method9051(class164.aByte1797))
								i_381_ = -1694498816;
						}
						class134.anIntArray1620[i_370_] = (i_381_ | Class59.method984(method9052((is_363_[i_370_] >> 8), i_374_), (class175.anInt1932 * 432289019), i_379_, -713820673));
						if (is_364_ != null)
							class134.aByteArray1614[i_370_] = (byte) i_374_;
					}
					class134.aShortArray1618[i_370_] = (short) is_365_[i_370_];
					class134.aShortArray1613[i_370_] = (short) is_366_[i_370_];
				}
				if (is_364_ != null) {
					class134.anIntArray1622 = new int[class134.aShort1621];
					for (int i_382_ = 0; i_382_ < class134.aShort1621; i_382_++) {
						int i_383_ = i_382_ * 3;
						if (is_364_[i_383_] != 0)
							class134.anIntArray1622[i_382_] = ~0xffffff | is_364_[i_383_] >> 8;
					}
				}
				aClass134ArrayArray9833[i][i_359_] = class134;
			} else {
				boolean bool_384_ = true;
				int i_385_ = -1;
				int i_386_ = -1;
				int i_387_ = -1;
				int i_388_ = -1;
				if (is.length == 6) {
					for (int i_389_ = 0; i_389_ < 6; i_389_++) {
						if (is[i_389_] == 0 && is_361_[i_389_] == 0) {
							if (i_385_ != -1 && is_363_[i_385_] != is_363_[i_389_]) {
								bool_384_ = false;
								break;
							}
							i_385_ = i_389_;
						} else if (is[i_389_] == anInt1767 * -1504778739 && is_361_[i_389_] == 0) {
							if (i_386_ != -1 && is_363_[i_386_] != is_363_[i_389_]) {
								bool_384_ = false;
								break;
							}
							i_386_ = i_389_;
						} else if (is[i_389_] == anInt1767 * -1504778739 && (is_361_[i_389_] == anInt1767 * -1504778739)) {
							if (i_387_ != -1 && is_363_[i_387_] != is_363_[i_389_]) {
								bool_384_ = false;
								break;
							}
							i_387_ = i_389_;
						} else if (is[i_389_] == 0 && (is_361_[i_389_] == anInt1767 * -1504778739)) {
							if (i_388_ != -1 && is_363_[i_388_] != is_363_[i_389_]) {
								bool_384_ = false;
								break;
							}
							i_388_ = i_389_;
						}
					}
					if (i_385_ == -1 || i_386_ == -1 || i_387_ == -1 || i_388_ == -1)
						bool_384_ = false;
					if (bool_384_) {
						if (is_360_ != null) {
							for (int i_390_ = 0; i_390_ < 4; i_390_++) {
								if (is_360_[i_390_] != 0) {
									bool_384_ = false;
									break;
								}
							}
						}
						if (bool_384_) {
							for (int i_391_ = 1; i_391_ < 4; i_391_++) {
								if (is[i_391_] != is[0] && (is[i_391_] != is[0] + anInt1767 * -1504778739) && (is[i_391_] != is[0] - anInt1767 * -1504778739)) {
									bool_384_ = false;
									break;
								}
								if (is_361_[i_391_] != is_361_[0] && (is_361_[i_391_] != (is_361_[0] + anInt1767 * -1504778739)) && (is_361_[i_391_] != (is_361_[0] - anInt1767 * -1504778739))) {
									bool_384_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_384_ = false;
				if (bool_384_) {
					Class115 class115 = new Class115();
					int i_392_ = is_363_[0];
					int i_393_ = is_365_[0];
					if (is_364_ != null) {
						class115.anInt1421 = is_364_[0] >> 8;
						if (i_392_ == 0)
							class115.aByte1416 |= 0x2;
					} else if (i_392_ == 0)
						return;
					if ((anIntArrayArray1765[i][i_359_] == anIntArrayArray1765[i + 1][i_359_]) && (anIntArrayArray1765[i][i_359_] == anIntArrayArray1765[i + 1][i_359_ + 1]) && (anIntArrayArray1765[i][i_359_] == anIntArrayArray1765[i][i_359_ + 1]))
						class115.aByte1416 |= 0x1;
					if (i_393_ != -1 && (class115.aByte1416 & 0x2) == 0 && !(aClass167_Sub1_9827.aClass174_1852.method2446(i_393_, -257764691).aBool1820)) {
						int i_394_;
						if (is_362_ != null && class175.anInt1934 * 71478565 != 0) {
							i_394_ = 255 * is_362_[i_385_] / (class175.anInt1934 * 71478565);
							if (i_394_ < 0)
								i_394_ = 0;
							else if (i_394_ > 255)
								i_394_ = 255;
						} else
							i_394_ = 0;
						class115.anInt1414 = (Class59.method984(method9052(is_363_[i_385_] >> 8, (aByteArrayArray9835[i][i_359_] - aByteArrayArray9843[i][i_359_])), class175.anInt1932 * 432289019, i_394_, -272558411));
						if (class115.anInt1421 != 0)
							class115.anInt1414 |= (255 - (aByteArrayArray9835[i][i_359_] - aByteArrayArray9843[i][i_359_]) << 25);
						if (is_362_ != null && class175.anInt1934 * 71478565 != 0) {
							i_394_ = 255 * is_362_[i_386_] / (class175.anInt1934 * 71478565);
							if (i_394_ < 0)
								i_394_ = 0;
							else if (i_394_ > 255)
								i_394_ = 255;
						} else
							i_394_ = 0;
						class115.anInt1415 = (Class59.method984(method9052(is_363_[i_386_] >> 8, (aByteArrayArray9835[i + 1][i_359_] - (aByteArrayArray9843[i + 1][i_359_]))), class175.anInt1932 * 432289019, i_394_, 220016861));
						if (class115.anInt1421 != 0)
							class115.anInt1415 |= 255 - (aByteArrayArray9835[i + 1][i_359_] - (aByteArrayArray9843[i + 1][i_359_])) << 25;
						if (is_362_ != null && class175.anInt1934 * 71478565 != 0) {
							i_394_ = 255 * is_362_[i_387_] / (class175.anInt1934 * 71478565);
							if (i_394_ < 0)
								i_394_ = 0;
							else if (i_394_ > 255)
								i_394_ = 255;
						} else
							i_394_ = 0;
						class115.anInt1413 = (Class59.method984(method9052(is_363_[i_387_] >> 8, ((aByteArrayArray9835[i + 1][i_359_ + 1]) - (aByteArrayArray9843[i + 1][i_359_ + 1]))), class175.anInt1932 * 432289019, i_394_, -165007056));
						if (class115.anInt1421 != 0)
							class115.anInt1413 |= (255 - (aByteArrayArray9835[i + 1][i_359_ + 1] - (aByteArrayArray9843[i + 1][i_359_ + 1]))) << 25;
						if (is_362_ != null && class175.anInt1934 * 71478565 != 0) {
							i_394_ = 255 * is_362_[i_388_] / (class175.anInt1934 * 71478565);
							if (i_394_ < 0)
								i_394_ = 0;
							else if (i_394_ > 255)
								i_394_ = 255;
						} else
							i_394_ = 0;
						class115.anInt1422 = (Class59.method984(method9052(is_363_[i_388_] >> 8, (aByteArrayArray9835[i][i_359_ + 1] - (aByteArrayArray9843[i][i_359_ + 1]))), class175.anInt1932 * 432289019, i_394_, -2006822513));
						class115.aShort1423 = (short) i_393_;
					} else {
						int i_395_;
						if (is_362_ != null && class175.anInt1934 * 71478565 != 0) {
							i_395_ = 255 * is_362_[i_385_] / (class175.anInt1934 * 71478565);
							if (i_395_ < 0)
								i_395_ = 0;
							else if (i_395_ > 255)
								i_395_ = 255;
						} else
							i_395_ = 0;
						class115.anInt1414 = (Class59.method984(method9052(is_363_[i_385_] >> 8, (aByteArrayArray9835[i][i_359_] - aByteArrayArray9843[i][i_359_])), class175.anInt1932 * 432289019, i_395_, -501965235));
						if (class115.anInt1421 != 0)
							class115.anInt1414 |= (255 - (aByteArrayArray9835[i][i_359_] - aByteArrayArray9843[i][i_359_]) << 25);
						if (is_362_ != null && class175.anInt1934 * 71478565 != 0) {
							i_395_ = 255 * is_362_[i_386_] / (class175.anInt1934 * 71478565);
							if (i_395_ < 0)
								i_395_ = 0;
							else if (i_395_ > 255)
								i_395_ = 255;
						} else
							i_395_ = 0;
						class115.anInt1415 = (Class59.method984(method9052(is_363_[i_386_] >> 8, (aByteArrayArray9835[i + 1][i_359_] - (aByteArrayArray9843[i + 1][i_359_]))), class175.anInt1932 * 432289019, i_395_, 397255276));
						if (class115.anInt1421 != 0)
							class115.anInt1415 |= 255 - (aByteArrayArray9835[i + 1][i_359_] - (aByteArrayArray9843[i + 1][i_359_])) << 25;
						if (is_362_ != null && class175.anInt1934 * 71478565 != 0) {
							i_395_ = 255 * is_362_[i_387_] / (class175.anInt1934 * 71478565);
							if (i_395_ < 0)
								i_395_ = 0;
							else if (i_395_ > 255)
								i_395_ = 255;
						} else
							i_395_ = 0;
						class115.anInt1413 = (Class59.method984(method9052(is_363_[i_387_] >> 8, ((aByteArrayArray9835[i + 1][i_359_ + 1]) - (aByteArrayArray9843[i + 1][i_359_ + 1]))), class175.anInt1932 * 432289019, i_395_, 112050073));
						if (class115.anInt1421 != 0)
							class115.anInt1413 |= (255 - (aByteArrayArray9835[i + 1][i_359_ + 1] - (aByteArrayArray9843[i + 1][i_359_ + 1]))) << 25;
						if (is_362_ != null && class175.anInt1934 * 71478565 != 0) {
							i_395_ = 255 * is_362_[i_388_] / (class175.anInt1934 * 71478565);
							if (i_395_ < 0)
								i_395_ = 0;
							else if (i_395_ > 255)
								i_395_ = 255;
						} else
							i_395_ = 0;
						class115.anInt1422 = (Class59.method984(method9052(is_363_[i_388_] >> 8, (aByteArrayArray9835[i][i_359_ + 1] - (aByteArrayArray9843[i][i_359_ + 1]))), class175.anInt1932 * 432289019, i_395_, 381530108));
						if (class115.anInt1421 != 0)
							class115.anInt1422 |= 255 - (aByteArrayArray9835[i][i_359_ + 1] - (aByteArrayArray9843[i][i_359_ + 1])) << 25;
						class115.aShort1423 = (short) -1;
					}
					if (is_362_ != null) {
						class115.aShort1420 = (short) is_362_[i_387_];
						class115.aShort1417 = (short) is_362_[i_388_];
						class115.aShort1419 = (short) is_362_[i_386_];
						class115.aShort1418 = (short) is_362_[i_385_];
					}
					aClass115ArrayArray9831[i][i_359_] = class115;
				} else {
					Class102 class102 = new Class102();
					class102.aShort1211 = (short) is.length;
					class102.aShort1219 = (short) (is.length / 3);
					class102.aShortArray1215 = new short[class102.aShort1211];
					class102.aShortArray1214 = new short[class102.aShort1211];
					class102.aShortArray1216 = new short[class102.aShort1211];
					class102.anIntArray1217 = new int[class102.aShort1211];
					if (is_362_ != null)
						class102.aShortArray1218 = new short[class102.aShort1211];
					for (int i_396_ = 0; i_396_ < class102.aShort1211; i_396_++) {
						int i_397_ = is[i_396_];
						int i_398_ = is_361_[i_396_];
						boolean bool_399_ = false;
						int i_400_;
						if (i_397_ == 0 && i_398_ == 0)
							i_400_ = (aByteArrayArray9835[i][i_359_] - aByteArrayArray9843[i][i_359_]);
						else if (i_397_ == 0 && i_398_ == anInt1767 * -1504778739)
							i_400_ = (aByteArrayArray9835[i][i_359_ + 1] - aByteArrayArray9843[i][i_359_ + 1]);
						else if (i_397_ == anInt1767 * -1504778739 && i_398_ == anInt1767 * -1504778739)
							i_400_ = (aByteArrayArray9835[i + 1][i_359_ + 1] - aByteArrayArray9843[i + 1][i_359_ + 1]);
						else if (i_397_ == anInt1767 * -1504778739 && i_398_ == 0)
							i_400_ = (aByteArrayArray9835[i + 1][i_359_] - aByteArrayArray9843[i + 1][i_359_]);
						else {
							int i_401_ = (((aByteArrayArray9835[i][i_359_] - aByteArrayArray9843[i][i_359_]) * (anInt1767 * -1504778739 - i_397_)) + ((aByteArrayArray9835[i + 1][i_359_] - aByteArrayArray9843[i + 1][i_359_]) * i_397_));
							int i_402_ = (((aByteArrayArray9835[i][i_359_ + 1] - aByteArrayArray9843[i][i_359_ + 1]) * (anInt1767 * -1504778739 - i_397_)) + (aByteArrayArray9835[i + 1][i_359_ + 1] - (aByteArrayArray9843[i + 1][i_359_ + 1])) * i_397_);
							i_400_ = (i_401_ * (anInt1767 * -1504778739 - i_398_) + i_402_ * i_398_ >> anInt1768 * -166490558);
						}
						int i_403_ = (i << anInt1768 * 2064238369) + i_397_;
						int i_404_ = (i_359_ << anInt1768 * 2064238369) + i_398_;
						class102.aShortArray1215[i_396_] = (short) i_397_;
						class102.aShortArray1216[i_396_] = (short) i_398_;
						class102.aShortArray1214[i_396_] = (short) (method1925(i_403_, i_404_, (byte) -6) + (is_360_ != null ? is_360_[i_396_] : 0));
						if (i_400_ < 0)
							i_400_ = 0;
						if (is_363_[i_396_] == 0) {
							if (is_364_ != null)
								class102.anIntArray1217[i_396_] = i_400_ << 25;
							else
								class102.anIntArray1217[i_396_] = 0;
						} else {
							int i_405_ = 0;
							if (is_362_ != null) {
								int i_406_ = (class102.aShortArray1218[i_396_] = (short) is_362_[i_396_]);
								if (class175.anInt1934 * 71478565 != 0) {
									i_405_ = 255 * i_406_ / (class175.anInt1934 * 71478565);
									if (i_405_ < 0)
										i_405_ = 0;
									else if (i_405_ > 255)
										i_405_ = 255;
								}
							}
							class102.anIntArray1217[i_396_] = Class59.method984(method9052((is_363_[i_396_] >> 8), i_400_), (class175.anInt1932 * 432289019), i_405_, 595764501);
							if (is_364_ != null)
								class102.anIntArray1217[i_396_] |= i_400_ << 25;
						}
					}
					boolean bool_407_ = false;
					for (int i_408_ = 0; i_408_ < class102.aShort1219; i_408_++) {
						if (is_365_[i_408_ * 3] != -1 && !(aClass167_Sub1_9827.aClass174_1852.method2446(is_365_[i_408_ * 3], -1192095184).aBool1820))
							bool_407_ = true;
					}
					if (is_364_ != null)
						class102.anIntArray1220 = new int[class102.aShort1219];
					if (bool_407_) {
						class102.aShortArray1213 = new short[class102.aShort1219];
						class102.aShortArray1210 = new short[class102.aShort1219];
					}
					for (int i_409_ = 0; i_409_ < class102.aShort1219; i_409_++) {
						int i_410_ = i_409_ * 3;
						if (is_364_ != null && is_364_[i_410_] != 0)
							class102.anIntArray1220[i_409_] = is_364_[i_410_] >> 8;
						if (bool_407_) {
							int i_411_ = i_410_ + 1;
							int i_412_ = i_411_ + 1;
							boolean bool_413_ = false;
							boolean bool_414_ = true;
							int i_415_ = is_365_[i_410_];
							if (i_415_ == -1 || (aClass167_Sub1_9827.aClass174_1852.method2446(i_415_, -94376190).aBool1820))
								bool_414_ = false;
							else
								bool_413_ = true;
							i_415_ = is_365_[i_411_];
							if (i_415_ == -1 || (aClass167_Sub1_9827.aClass174_1852.method2446(i_415_, -921330887).aBool1820))
								bool_414_ = false;
							else
								bool_413_ = true;
							i_415_ = is_365_[i_412_];
							if (i_415_ == -1 || (aClass167_Sub1_9827.aClass174_1852.method2446(i_415_, -1388732420).aBool1820))
								bool_414_ = false;
							else
								bool_413_ = true;
							if (bool_414_) {
								class102.aShortArray1213[i_409_] = (short) i_415_;
								class102.aShortArray1210[i_409_] = (short) is_366_[i_410_];
							} else {
								if (bool_413_) {
									i_415_ = is_365_[i_410_];
									if (i_415_ != -1 && !(aClass167_Sub1_9827.aClass174_1852.method2446(i_415_, -1233913169).aBool1820))
										class102.anIntArray1217[i_410_] = (ColourUtils.anIntArray8308[(Class254.method3537((aClass167_Sub1_9827.aClass174_1852.method2446(i_415_, -1063705029).aShort1831) & 0xffff, 1409175155)) & 0xffff]);
									i_415_ = is_365_[i_411_];
									if (i_415_ != -1 && !(aClass167_Sub1_9827.aClass174_1852.method2446(i_415_, -935405105).aBool1820))
										class102.anIntArray1217[i_411_] = (ColourUtils.anIntArray8308[(Class254.method3537((aClass167_Sub1_9827.aClass174_1852.method2446(i_415_, -663165607).aShort1831) & 0xffff, 1409175155)) & 0xffff]);
									i_415_ = is_365_[i_412_];
									if (i_415_ != -1 && !(aClass167_Sub1_9827.aClass174_1852.method2446(i_415_, -1978898422).aBool1820))
										class102.anIntArray1217[i_412_] = (ColourUtils.anIntArray8308[(Class254.method3537((aClass167_Sub1_9827.aClass174_1852.method2446(i_415_, -741771760).aShort1831) & 0xffff, 1409175155)) & 0xffff]);
								}
								class102.aShortArray1213[i_409_] = (short) -1;
							}
						}
					}
					aClass102ArrayArray9826[i][i_359_] = class102;
				}
			}
		}
	}

	public void method1936(int i, int i_416_, int[] is, int[] is_417_, int[] is_418_, int[] is_419_, int[] is_420_, int[] is_421_, int[] is_422_, int[] is_423_, Class175 class175, boolean bool) {
		boolean bool_424_ = (anInt9828 & 0x20) == 0;
		if (aClass115ArrayArray9831 == null && !bool_424_) {
			aClass115ArrayArray9831 = new Class115[anInt1766 * 1718142487][anInt1769 * -889224915];
			aClass102ArrayArray9826 = new Class102[anInt1766 * 1718142487][anInt1769 * -889224915];
		} else if (aClass134ArrayArray9833 == null && bool_424_)
			aClass134ArrayArray9833 = new Class134[anInt1766 * 1718142487][anInt1769 * -889224915];
		else if (aClass136ArrayArray9829 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_425_ = 0; i_425_ < is_420_.length; i_425_++) {
				if (is_420_[i_425_] == -1)
					is_420_[i_425_] = 0;
				else
					is_420_[i_425_] = (ColourUtils.anIntArray8308[(Class254.method3537(is_420_[i_425_], 1409175155) & 0xffff)]) << 8 | 0xff;
			}
			if (is_421_ != null) {
				for (int i_426_ = 0; i_426_ < is_421_.length; i_426_++) {
					if (is_421_[i_426_] == -1)
						is_421_[i_426_] = 0;
					else
						is_421_[i_426_] = ((ColourUtils.anIntArray8308[Class254.method3537(is_421_[i_426_], 1409175155) & 0xffff]) << 8) | 0xff;
				}
			}
			if (bool_424_) {
				Class134 class134 = new Class134();
				class134.aShort1617 = (short) is.length;
				class134.aShort1621 = (short) (is.length / 3);
				class134.aShortArray1619 = new short[class134.aShort1617];
				class134.aShortArray1615 = new short[class134.aShort1617];
				class134.aShortArray1616 = new short[class134.aShort1617];
				class134.anIntArray1620 = new int[class134.aShort1617];
				class134.aShortArray1618 = new short[class134.aShort1617];
				class134.aShortArray1613 = new short[class134.aShort1617];
				class134.aByteArray1614 = new byte[class134.aShort1617];
				if (is_419_ != null)
					class134.aShortArray1612 = new short[class134.aShort1617];
				for (int i_427_ = 0; i_427_ < class134.aShort1617; i_427_++) {
					int i_428_ = is[i_427_];
					int i_429_ = is_418_[i_427_];
					boolean bool_430_ = false;
					int i_431_;
					if (i_428_ == 0 && i_429_ == 0)
						i_431_ = (aByteArrayArray9835[i][i_416_] - aByteArrayArray9843[i][i_416_]);
					else if (i_428_ == 0 && i_429_ == anInt1767 * -1504778739)
						i_431_ = (aByteArrayArray9835[i][i_416_ + 1] - aByteArrayArray9843[i][i_416_ + 1]);
					else if (i_428_ == anInt1767 * -1504778739 && i_429_ == anInt1767 * -1504778739)
						i_431_ = (aByteArrayArray9835[i + 1][i_416_ + 1] - aByteArrayArray9843[i + 1][i_416_ + 1]);
					else if (i_428_ == anInt1767 * -1504778739 && i_429_ == 0)
						i_431_ = (aByteArrayArray9835[i + 1][i_416_] - aByteArrayArray9843[i + 1][i_416_]);
					else {
						int i_432_ = (((aByteArrayArray9835[i][i_416_] - aByteArrayArray9843[i][i_416_]) * (anInt1767 * -1504778739 - i_428_)) + ((aByteArrayArray9835[i + 1][i_416_] - aByteArrayArray9843[i + 1][i_416_]) * i_428_));
						int i_433_ = (((aByteArrayArray9835[i][i_416_ + 1] - aByteArrayArray9843[i][i_416_ + 1]) * (anInt1767 * -1504778739 - i_428_)) + ((aByteArrayArray9835[i + 1][i_416_ + 1] - aByteArrayArray9843[i + 1][i_416_ + 1]) * i_428_));
						i_431_ = (i_432_ * (anInt1767 * -1504778739 - i_429_) + i_433_ * i_429_) >> anInt1768 * -166490558;
					}
					int i_434_ = (i << anInt1768 * 2064238369) + i_428_;
					int i_435_ = (i_416_ << anInt1768 * 2064238369) + i_429_;
					class134.aShortArray1619[i_427_] = (short) i_428_;
					class134.aShortArray1616[i_427_] = (short) i_429_;
					class134.aShortArray1615[i_427_] = (short) (method1925(i_434_, i_435_, (byte) 99) + (is_417_ != null ? is_417_[i_427_] : 0));
					if (i_431_ < 0)
						i_431_ = 0;
					if (is_420_[i_427_] == 0) {
						class134.anIntArray1620[i_427_] = 0;
						if (is_421_ != null)
							class134.aByteArray1614[i_427_] = (byte) i_431_;
					} else {
						int i_436_ = 0;
						if (is_419_ != null) {
							int i_437_ = (class134.aShortArray1612[i_427_] = (short) is_419_[i_427_]);
							if (class175.anInt1934 * 71478565 != 0) {
								i_436_ = 255 * i_437_ / (class175.anInt1934 * 71478565);
								if (i_436_ < 0)
									i_436_ = 0;
								else if (i_436_ > 255)
									i_436_ = 255;
							}
						}
						int i_438_ = -16777216;
						if (is_422_[i_427_] != -1) {
							Class164 class164 = (aClass167_Sub1_9827.aClass174_1852.method2446(is_422_[i_427_], -1954487111));
							if (class164.aBool1814 && method9051(class164.aByte1797))
								i_438_ = -1694498816;
						}
						class134.anIntArray1620[i_427_] = (i_438_ | Class59.method984(method9052((is_420_[i_427_] >> 8), i_431_), (class175.anInt1932 * 432289019), i_436_, -1171705943));
						if (is_421_ != null)
							class134.aByteArray1614[i_427_] = (byte) i_431_;
					}
					class134.aShortArray1618[i_427_] = (short) is_422_[i_427_];
					class134.aShortArray1613[i_427_] = (short) is_423_[i_427_];
				}
				if (is_421_ != null) {
					class134.anIntArray1622 = new int[class134.aShort1621];
					for (int i_439_ = 0; i_439_ < class134.aShort1621; i_439_++) {
						int i_440_ = i_439_ * 3;
						if (is_421_[i_440_] != 0)
							class134.anIntArray1622[i_439_] = ~0xffffff | is_421_[i_440_] >> 8;
					}
				}
				aClass134ArrayArray9833[i][i_416_] = class134;
			} else {
				boolean bool_441_ = true;
				int i_442_ = -1;
				int i_443_ = -1;
				int i_444_ = -1;
				int i_445_ = -1;
				if (is.length == 6) {
					for (int i_446_ = 0; i_446_ < 6; i_446_++) {
						if (is[i_446_] == 0 && is_418_[i_446_] == 0) {
							if (i_442_ != -1 && is_420_[i_442_] != is_420_[i_446_]) {
								bool_441_ = false;
								break;
							}
							i_442_ = i_446_;
						} else if (is[i_446_] == anInt1767 * -1504778739 && is_418_[i_446_] == 0) {
							if (i_443_ != -1 && is_420_[i_443_] != is_420_[i_446_]) {
								bool_441_ = false;
								break;
							}
							i_443_ = i_446_;
						} else if (is[i_446_] == anInt1767 * -1504778739 && (is_418_[i_446_] == anInt1767 * -1504778739)) {
							if (i_444_ != -1 && is_420_[i_444_] != is_420_[i_446_]) {
								bool_441_ = false;
								break;
							}
							i_444_ = i_446_;
						} else if (is[i_446_] == 0 && (is_418_[i_446_] == anInt1767 * -1504778739)) {
							if (i_445_ != -1 && is_420_[i_445_] != is_420_[i_446_]) {
								bool_441_ = false;
								break;
							}
							i_445_ = i_446_;
						}
					}
					if (i_442_ == -1 || i_443_ == -1 || i_444_ == -1 || i_445_ == -1)
						bool_441_ = false;
					if (bool_441_) {
						if (is_417_ != null) {
							for (int i_447_ = 0; i_447_ < 4; i_447_++) {
								if (is_417_[i_447_] != 0) {
									bool_441_ = false;
									break;
								}
							}
						}
						if (bool_441_) {
							for (int i_448_ = 1; i_448_ < 4; i_448_++) {
								if (is[i_448_] != is[0] && (is[i_448_] != is[0] + anInt1767 * -1504778739) && (is[i_448_] != is[0] - anInt1767 * -1504778739)) {
									bool_441_ = false;
									break;
								}
								if (is_418_[i_448_] != is_418_[0] && (is_418_[i_448_] != (is_418_[0] + anInt1767 * -1504778739)) && (is_418_[i_448_] != (is_418_[0] - anInt1767 * -1504778739))) {
									bool_441_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_441_ = false;
				if (bool_441_) {
					Class115 class115 = new Class115();
					int i_449_ = is_420_[0];
					int i_450_ = is_422_[0];
					if (is_421_ != null) {
						class115.anInt1421 = is_421_[0] >> 8;
						if (i_449_ == 0)
							class115.aByte1416 |= 0x2;
					} else if (i_449_ == 0)
						return;
					if ((anIntArrayArray1765[i][i_416_] == anIntArrayArray1765[i + 1][i_416_]) && (anIntArrayArray1765[i][i_416_] == anIntArrayArray1765[i + 1][i_416_ + 1]) && (anIntArrayArray1765[i][i_416_] == anIntArrayArray1765[i][i_416_ + 1]))
						class115.aByte1416 |= 0x1;
					if (i_450_ != -1 && (class115.aByte1416 & 0x2) == 0 && !(aClass167_Sub1_9827.aClass174_1852.method2446(i_450_, -621725139).aBool1820)) {
						int i_451_;
						if (is_419_ != null && class175.anInt1934 * 71478565 != 0) {
							i_451_ = 255 * is_419_[i_442_] / (class175.anInt1934 * 71478565);
							if (i_451_ < 0)
								i_451_ = 0;
							else if (i_451_ > 255)
								i_451_ = 255;
						} else
							i_451_ = 0;
						class115.anInt1414 = (Class59.method984(method9052(is_420_[i_442_] >> 8, (aByteArrayArray9835[i][i_416_] - aByteArrayArray9843[i][i_416_])), class175.anInt1932 * 432289019, i_451_, -2026408311));
						if (class115.anInt1421 != 0)
							class115.anInt1414 |= (255 - (aByteArrayArray9835[i][i_416_] - aByteArrayArray9843[i][i_416_]) << 25);
						if (is_419_ != null && class175.anInt1934 * 71478565 != 0) {
							i_451_ = 255 * is_419_[i_443_] / (class175.anInt1934 * 71478565);
							if (i_451_ < 0)
								i_451_ = 0;
							else if (i_451_ > 255)
								i_451_ = 255;
						} else
							i_451_ = 0;
						class115.anInt1415 = (Class59.method984(method9052(is_420_[i_443_] >> 8, (aByteArrayArray9835[i + 1][i_416_] - (aByteArrayArray9843[i + 1][i_416_]))), class175.anInt1932 * 432289019, i_451_, -2085779396));
						if (class115.anInt1421 != 0)
							class115.anInt1415 |= 255 - (aByteArrayArray9835[i + 1][i_416_] - (aByteArrayArray9843[i + 1][i_416_])) << 25;
						if (is_419_ != null && class175.anInt1934 * 71478565 != 0) {
							i_451_ = 255 * is_419_[i_444_] / (class175.anInt1934 * 71478565);
							if (i_451_ < 0)
								i_451_ = 0;
							else if (i_451_ > 255)
								i_451_ = 255;
						} else
							i_451_ = 0;
						class115.anInt1413 = (Class59.method984(method9052(is_420_[i_444_] >> 8, ((aByteArrayArray9835[i + 1][i_416_ + 1]) - (aByteArrayArray9843[i + 1][i_416_ + 1]))), class175.anInt1932 * 432289019, i_451_, 567541379));
						if (class115.anInt1421 != 0)
							class115.anInt1413 |= (255 - (aByteArrayArray9835[i + 1][i_416_ + 1] - (aByteArrayArray9843[i + 1][i_416_ + 1]))) << 25;
						if (is_419_ != null && class175.anInt1934 * 71478565 != 0) {
							i_451_ = 255 * is_419_[i_445_] / (class175.anInt1934 * 71478565);
							if (i_451_ < 0)
								i_451_ = 0;
							else if (i_451_ > 255)
								i_451_ = 255;
						} else
							i_451_ = 0;
						class115.anInt1422 = (Class59.method984(method9052(is_420_[i_445_] >> 8, (aByteArrayArray9835[i][i_416_ + 1] - (aByteArrayArray9843[i][i_416_ + 1]))), class175.anInt1932 * 432289019, i_451_, -109779754));
						class115.aShort1423 = (short) i_450_;
					} else {
						int i_452_;
						if (is_419_ != null && class175.anInt1934 * 71478565 != 0) {
							i_452_ = 255 * is_419_[i_442_] / (class175.anInt1934 * 71478565);
							if (i_452_ < 0)
								i_452_ = 0;
							else if (i_452_ > 255)
								i_452_ = 255;
						} else
							i_452_ = 0;
						class115.anInt1414 = (Class59.method984(method9052(is_420_[i_442_] >> 8, (aByteArrayArray9835[i][i_416_] - aByteArrayArray9843[i][i_416_])), class175.anInt1932 * 432289019, i_452_, -1696688146));
						if (class115.anInt1421 != 0)
							class115.anInt1414 |= (255 - (aByteArrayArray9835[i][i_416_] - aByteArrayArray9843[i][i_416_]) << 25);
						if (is_419_ != null && class175.anInt1934 * 71478565 != 0) {
							i_452_ = 255 * is_419_[i_443_] / (class175.anInt1934 * 71478565);
							if (i_452_ < 0)
								i_452_ = 0;
							else if (i_452_ > 255)
								i_452_ = 255;
						} else
							i_452_ = 0;
						class115.anInt1415 = (Class59.method984(method9052(is_420_[i_443_] >> 8, (aByteArrayArray9835[i + 1][i_416_] - (aByteArrayArray9843[i + 1][i_416_]))), class175.anInt1932 * 432289019, i_452_, -325362016));
						if (class115.anInt1421 != 0)
							class115.anInt1415 |= 255 - (aByteArrayArray9835[i + 1][i_416_] - (aByteArrayArray9843[i + 1][i_416_])) << 25;
						if (is_419_ != null && class175.anInt1934 * 71478565 != 0) {
							i_452_ = 255 * is_419_[i_444_] / (class175.anInt1934 * 71478565);
							if (i_452_ < 0)
								i_452_ = 0;
							else if (i_452_ > 255)
								i_452_ = 255;
						} else
							i_452_ = 0;
						class115.anInt1413 = (Class59.method984(method9052(is_420_[i_444_] >> 8, ((aByteArrayArray9835[i + 1][i_416_ + 1]) - (aByteArrayArray9843[i + 1][i_416_ + 1]))), class175.anInt1932 * 432289019, i_452_, -1061168371));
						if (class115.anInt1421 != 0)
							class115.anInt1413 |= (255 - (aByteArrayArray9835[i + 1][i_416_ + 1] - (aByteArrayArray9843[i + 1][i_416_ + 1]))) << 25;
						if (is_419_ != null && class175.anInt1934 * 71478565 != 0) {
							i_452_ = 255 * is_419_[i_445_] / (class175.anInt1934 * 71478565);
							if (i_452_ < 0)
								i_452_ = 0;
							else if (i_452_ > 255)
								i_452_ = 255;
						} else
							i_452_ = 0;
						class115.anInt1422 = (Class59.method984(method9052(is_420_[i_445_] >> 8, (aByteArrayArray9835[i][i_416_ + 1] - (aByteArrayArray9843[i][i_416_ + 1]))), class175.anInt1932 * 432289019, i_452_, -869811917));
						if (class115.anInt1421 != 0)
							class115.anInt1422 |= 255 - (aByteArrayArray9835[i][i_416_ + 1] - (aByteArrayArray9843[i][i_416_ + 1])) << 25;
						class115.aShort1423 = (short) -1;
					}
					if (is_419_ != null) {
						class115.aShort1420 = (short) is_419_[i_444_];
						class115.aShort1417 = (short) is_419_[i_445_];
						class115.aShort1419 = (short) is_419_[i_443_];
						class115.aShort1418 = (short) is_419_[i_442_];
					}
					aClass115ArrayArray9831[i][i_416_] = class115;
				} else {
					Class102 class102 = new Class102();
					class102.aShort1211 = (short) is.length;
					class102.aShort1219 = (short) (is.length / 3);
					class102.aShortArray1215 = new short[class102.aShort1211];
					class102.aShortArray1214 = new short[class102.aShort1211];
					class102.aShortArray1216 = new short[class102.aShort1211];
					class102.anIntArray1217 = new int[class102.aShort1211];
					if (is_419_ != null)
						class102.aShortArray1218 = new short[class102.aShort1211];
					for (int i_453_ = 0; i_453_ < class102.aShort1211; i_453_++) {
						int i_454_ = is[i_453_];
						int i_455_ = is_418_[i_453_];
						boolean bool_456_ = false;
						int i_457_;
						if (i_454_ == 0 && i_455_ == 0)
							i_457_ = (aByteArrayArray9835[i][i_416_] - aByteArrayArray9843[i][i_416_]);
						else if (i_454_ == 0 && i_455_ == anInt1767 * -1504778739)
							i_457_ = (aByteArrayArray9835[i][i_416_ + 1] - aByteArrayArray9843[i][i_416_ + 1]);
						else if (i_454_ == anInt1767 * -1504778739 && i_455_ == anInt1767 * -1504778739)
							i_457_ = (aByteArrayArray9835[i + 1][i_416_ + 1] - aByteArrayArray9843[i + 1][i_416_ + 1]);
						else if (i_454_ == anInt1767 * -1504778739 && i_455_ == 0)
							i_457_ = (aByteArrayArray9835[i + 1][i_416_] - aByteArrayArray9843[i + 1][i_416_]);
						else {
							int i_458_ = (((aByteArrayArray9835[i][i_416_] - aByteArrayArray9843[i][i_416_]) * (anInt1767 * -1504778739 - i_454_)) + ((aByteArrayArray9835[i + 1][i_416_] - aByteArrayArray9843[i + 1][i_416_]) * i_454_));
							int i_459_ = (((aByteArrayArray9835[i][i_416_ + 1] - aByteArrayArray9843[i][i_416_ + 1]) * (anInt1767 * -1504778739 - i_454_)) + (aByteArrayArray9835[i + 1][i_416_ + 1] - (aByteArrayArray9843[i + 1][i_416_ + 1])) * i_454_);
							i_457_ = (i_458_ * (anInt1767 * -1504778739 - i_455_) + i_459_ * i_455_ >> anInt1768 * -166490558);
						}
						int i_460_ = (i << anInt1768 * 2064238369) + i_454_;
						int i_461_ = (i_416_ << anInt1768 * 2064238369) + i_455_;
						class102.aShortArray1215[i_453_] = (short) i_454_;
						class102.aShortArray1216[i_453_] = (short) i_455_;
						class102.aShortArray1214[i_453_] = (short) (method1925(i_460_, i_461_, (byte) -112) + (is_417_ != null ? is_417_[i_453_] : 0));
						if (i_457_ < 0)
							i_457_ = 0;
						if (is_420_[i_453_] == 0) {
							if (is_421_ != null)
								class102.anIntArray1217[i_453_] = i_457_ << 25;
							else
								class102.anIntArray1217[i_453_] = 0;
						} else {
							int i_462_ = 0;
							if (is_419_ != null) {
								int i_463_ = (class102.aShortArray1218[i_453_] = (short) is_419_[i_453_]);
								if (class175.anInt1934 * 71478565 != 0) {
									i_462_ = 255 * i_463_ / (class175.anInt1934 * 71478565);
									if (i_462_ < 0)
										i_462_ = 0;
									else if (i_462_ > 255)
										i_462_ = 255;
								}
							}
							class102.anIntArray1217[i_453_] = Class59.method984(method9052((is_420_[i_453_] >> 8), i_457_), (class175.anInt1932 * 432289019), i_462_, -1120867056);
							if (is_421_ != null)
								class102.anIntArray1217[i_453_] |= i_457_ << 25;
						}
					}
					boolean bool_464_ = false;
					for (int i_465_ = 0; i_465_ < class102.aShort1219; i_465_++) {
						if (is_422_[i_465_ * 3] != -1 && !(aClass167_Sub1_9827.aClass174_1852.method2446(is_422_[i_465_ * 3], -628608638).aBool1820))
							bool_464_ = true;
					}
					if (is_421_ != null)
						class102.anIntArray1220 = new int[class102.aShort1219];
					if (bool_464_) {
						class102.aShortArray1213 = new short[class102.aShort1219];
						class102.aShortArray1210 = new short[class102.aShort1219];
					}
					for (int i_466_ = 0; i_466_ < class102.aShort1219; i_466_++) {
						int i_467_ = i_466_ * 3;
						if (is_421_ != null && is_421_[i_467_] != 0)
							class102.anIntArray1220[i_466_] = is_421_[i_467_] >> 8;
						if (bool_464_) {
							int i_468_ = i_467_ + 1;
							int i_469_ = i_468_ + 1;
							boolean bool_470_ = false;
							boolean bool_471_ = true;
							int i_472_ = is_422_[i_467_];
							if (i_472_ == -1 || (aClass167_Sub1_9827.aClass174_1852.method2446(i_472_, -1366443872).aBool1820))
								bool_471_ = false;
							else
								bool_470_ = true;
							i_472_ = is_422_[i_468_];
							if (i_472_ == -1 || (aClass167_Sub1_9827.aClass174_1852.method2446(i_472_, -1562974503).aBool1820))
								bool_471_ = false;
							else
								bool_470_ = true;
							i_472_ = is_422_[i_469_];
							if (i_472_ == -1 || (aClass167_Sub1_9827.aClass174_1852.method2446(i_472_, -1906009691).aBool1820))
								bool_471_ = false;
							else
								bool_470_ = true;
							if (bool_471_) {
								class102.aShortArray1213[i_466_] = (short) i_472_;
								class102.aShortArray1210[i_466_] = (short) is_423_[i_467_];
							} else {
								if (bool_470_) {
									i_472_ = is_422_[i_467_];
									if (i_472_ != -1 && !(aClass167_Sub1_9827.aClass174_1852.method2446(i_472_, -613738405).aBool1820))
										class102.anIntArray1217[i_467_] = (ColourUtils.anIntArray8308[(Class254.method3537((aClass167_Sub1_9827.aClass174_1852.method2446(i_472_, -1903844699).aShort1831) & 0xffff, 1409175155)) & 0xffff]);
									i_472_ = is_422_[i_468_];
									if (i_472_ != -1 && !(aClass167_Sub1_9827.aClass174_1852.method2446(i_472_, -1607137970).aBool1820))
										class102.anIntArray1217[i_468_] = (ColourUtils.anIntArray8308[(Class254.method3537((aClass167_Sub1_9827.aClass174_1852.method2446(i_472_, -313697672).aShort1831) & 0xffff, 1409175155)) & 0xffff]);
									i_472_ = is_422_[i_469_];
									if (i_472_ != -1 && !(aClass167_Sub1_9827.aClass174_1852.method2446(i_472_, -967381809).aBool1820))
										class102.anIntArray1217[i_469_] = (ColourUtils.anIntArray8308[(Class254.method3537((aClass167_Sub1_9827.aClass174_1852.method2446(i_472_, -1392499123).aShort1831) & 0xffff, 1409175155)) & 0xffff]);
								}
								class102.aShortArray1213[i_466_] = (short) -1;
							}
						}
					}
					aClass102ArrayArray9826[i][i_416_] = class102;
				}
			}
		}
	}

	public void method1937() {
		aByteArrayArray9835 = null;
		aByteArrayArray9843 = null;
	}

	void method9050(int i, int i_473_, int i_474_) {
		Class107 class107 = aClass167_Sub1_9827.method8458(Thread.currentThread());
		class107.aClass117_1290.anInt1436 = 0;
		if (aClass115ArrayArray9831 != null)
			method9047(i, i_473_, class107.aBool1284, class107, class107.aClass117_1290, class107.aFloatArray1316, class107.aFloatArray1292, class107.aFloatArray1318, class107.aFloatArray1319, class107.aFloatArray1288, i_474_);
		else if (aClass136ArrayArray9829 != null)
			method9046(i, i_473_, class107.aClass117_1290, class107.aFloatArray1316, class107.aFloatArray1292, class107.aFloatArray1318, class107.aFloatArray1319, class107.aFloatArray1288, i_474_);
		else if (aClass134ArrayArray9833 != null)
			method9048(i, i_473_, class107.aBool1284, class107, class107.aClass117_1290, class107.aFloatArray1316, class107.aFloatArray1292, class107.aFloatArray1318, class107.aFloatArray1319, class107.aFloatArray1288, i_474_);
	}

	public void method1920(int i, int i_475_, int[] is, int[] is_476_, int[] is_477_, int[] is_478_, int[] is_479_, int[] is_480_, int[] is_481_, int[] is_482_, Class175 class175, boolean bool) {
		boolean bool_483_ = (anInt9828 & 0x20) == 0;
		if (aClass115ArrayArray9831 == null && !bool_483_) {
			aClass115ArrayArray9831 = new Class115[anInt1766 * 1718142487][anInt1769 * -889224915];
			aClass102ArrayArray9826 = new Class102[anInt1766 * 1718142487][anInt1769 * -889224915];
		} else if (aClass134ArrayArray9833 == null && bool_483_)
			aClass134ArrayArray9833 = new Class134[anInt1766 * 1718142487][anInt1769 * -889224915];
		else if (aClass136ArrayArray9829 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_484_ = 0; i_484_ < is_479_.length; i_484_++) {
				if (is_479_[i_484_] == -1)
					is_479_[i_484_] = 0;
				else
					is_479_[i_484_] = (ColourUtils.anIntArray8308[(Class254.method3537(is_479_[i_484_], 1409175155) & 0xffff)]) << 8 | 0xff;
			}
			if (is_480_ != null) {
				for (int i_485_ = 0; i_485_ < is_480_.length; i_485_++) {
					if (is_480_[i_485_] == -1)
						is_480_[i_485_] = 0;
					else
						is_480_[i_485_] = ((ColourUtils.anIntArray8308[Class254.method3537(is_480_[i_485_], 1409175155) & 0xffff]) << 8) | 0xff;
				}
			}
			if (bool_483_) {
				Class134 class134 = new Class134();
				class134.aShort1617 = (short) is.length;
				class134.aShort1621 = (short) (is.length / 3);
				class134.aShortArray1619 = new short[class134.aShort1617];
				class134.aShortArray1615 = new short[class134.aShort1617];
				class134.aShortArray1616 = new short[class134.aShort1617];
				class134.anIntArray1620 = new int[class134.aShort1617];
				class134.aShortArray1618 = new short[class134.aShort1617];
				class134.aShortArray1613 = new short[class134.aShort1617];
				class134.aByteArray1614 = new byte[class134.aShort1617];
				if (is_478_ != null)
					class134.aShortArray1612 = new short[class134.aShort1617];
				for (int i_486_ = 0; i_486_ < class134.aShort1617; i_486_++) {
					int i_487_ = is[i_486_];
					int i_488_ = is_477_[i_486_];
					boolean bool_489_ = false;
					int i_490_;
					if (i_487_ == 0 && i_488_ == 0)
						i_490_ = (aByteArrayArray9835[i][i_475_] - aByteArrayArray9843[i][i_475_]);
					else if (i_487_ == 0 && i_488_ == anInt1767 * -1504778739)
						i_490_ = (aByteArrayArray9835[i][i_475_ + 1] - aByteArrayArray9843[i][i_475_ + 1]);
					else if (i_487_ == anInt1767 * -1504778739 && i_488_ == anInt1767 * -1504778739)
						i_490_ = (aByteArrayArray9835[i + 1][i_475_ + 1] - aByteArrayArray9843[i + 1][i_475_ + 1]);
					else if (i_487_ == anInt1767 * -1504778739 && i_488_ == 0)
						i_490_ = (aByteArrayArray9835[i + 1][i_475_] - aByteArrayArray9843[i + 1][i_475_]);
					else {
						int i_491_ = (((aByteArrayArray9835[i][i_475_] - aByteArrayArray9843[i][i_475_]) * (anInt1767 * -1504778739 - i_487_)) + ((aByteArrayArray9835[i + 1][i_475_] - aByteArrayArray9843[i + 1][i_475_]) * i_487_));
						int i_492_ = (((aByteArrayArray9835[i][i_475_ + 1] - aByteArrayArray9843[i][i_475_ + 1]) * (anInt1767 * -1504778739 - i_487_)) + ((aByteArrayArray9835[i + 1][i_475_ + 1] - aByteArrayArray9843[i + 1][i_475_ + 1]) * i_487_));
						i_490_ = (i_491_ * (anInt1767 * -1504778739 - i_488_) + i_492_ * i_488_) >> anInt1768 * -166490558;
					}
					int i_493_ = (i << anInt1768 * 2064238369) + i_487_;
					int i_494_ = (i_475_ << anInt1768 * 2064238369) + i_488_;
					class134.aShortArray1619[i_486_] = (short) i_487_;
					class134.aShortArray1616[i_486_] = (short) i_488_;
					class134.aShortArray1615[i_486_] = (short) (method1925(i_493_, i_494_, (byte) 72) + (is_476_ != null ? is_476_[i_486_] : 0));
					if (i_490_ < 0)
						i_490_ = 0;
					if (is_479_[i_486_] == 0) {
						class134.anIntArray1620[i_486_] = 0;
						if (is_480_ != null)
							class134.aByteArray1614[i_486_] = (byte) i_490_;
					} else {
						int i_495_ = 0;
						if (is_478_ != null) {
							int i_496_ = (class134.aShortArray1612[i_486_] = (short) is_478_[i_486_]);
							if (class175.anInt1934 * 71478565 != 0) {
								i_495_ = 255 * i_496_ / (class175.anInt1934 * 71478565);
								if (i_495_ < 0)
									i_495_ = 0;
								else if (i_495_ > 255)
									i_495_ = 255;
							}
						}
						int i_497_ = -16777216;
						if (is_481_[i_486_] != -1) {
							Class164 class164 = aClass167_Sub1_9827.aClass174_1852.method2446(is_481_[i_486_], -441293690);
							if (class164.aBool1814 && method9051(class164.aByte1797))
								i_497_ = -1694498816;
						}
						class134.anIntArray1620[i_486_] = (i_497_ | Class59.method984(method9052((is_479_[i_486_] >> 8), i_490_), (class175.anInt1932 * 432289019), i_495_, -1442213484));
						if (is_480_ != null)
							class134.aByteArray1614[i_486_] = (byte) i_490_;
					}
					class134.aShortArray1618[i_486_] = (short) is_481_[i_486_];
					class134.aShortArray1613[i_486_] = (short) is_482_[i_486_];
				}
				if (is_480_ != null) {
					class134.anIntArray1622 = new int[class134.aShort1621];
					for (int i_498_ = 0; i_498_ < class134.aShort1621; i_498_++) {
						int i_499_ = i_498_ * 3;
						if (is_480_[i_499_] != 0)
							class134.anIntArray1622[i_498_] = ~0xffffff | is_480_[i_499_] >> 8;
					}
				}
				aClass134ArrayArray9833[i][i_475_] = class134;
			} else {
				boolean bool_500_ = true;
				int i_501_ = -1;
				int i_502_ = -1;
				int i_503_ = -1;
				int i_504_ = -1;
				if (is.length == 6) {
					for (int i_505_ = 0; i_505_ < 6; i_505_++) {
						if (is[i_505_] == 0 && is_477_[i_505_] == 0) {
							if (i_501_ != -1 && is_479_[i_501_] != is_479_[i_505_]) {
								bool_500_ = false;
								break;
							}
							i_501_ = i_505_;
						} else if (is[i_505_] == anInt1767 * -1504778739 && is_477_[i_505_] == 0) {
							if (i_502_ != -1 && is_479_[i_502_] != is_479_[i_505_]) {
								bool_500_ = false;
								break;
							}
							i_502_ = i_505_;
						} else if (is[i_505_] == anInt1767 * -1504778739 && (is_477_[i_505_] == anInt1767 * -1504778739)) {
							if (i_503_ != -1 && is_479_[i_503_] != is_479_[i_505_]) {
								bool_500_ = false;
								break;
							}
							i_503_ = i_505_;
						} else if (is[i_505_] == 0 && (is_477_[i_505_] == anInt1767 * -1504778739)) {
							if (i_504_ != -1 && is_479_[i_504_] != is_479_[i_505_]) {
								bool_500_ = false;
								break;
							}
							i_504_ = i_505_;
						}
					}
					if (i_501_ == -1 || i_502_ == -1 || i_503_ == -1 || i_504_ == -1)
						bool_500_ = false;
					if (bool_500_) {
						if (is_476_ != null) {
							for (int i_506_ = 0; i_506_ < 4; i_506_++) {
								if (is_476_[i_506_] != 0) {
									bool_500_ = false;
									break;
								}
							}
						}
						if (bool_500_) {
							for (int i_507_ = 1; i_507_ < 4; i_507_++) {
								if (is[i_507_] != is[0] && (is[i_507_] != is[0] + anInt1767 * -1504778739) && (is[i_507_] != is[0] - anInt1767 * -1504778739)) {
									bool_500_ = false;
									break;
								}
								if (is_477_[i_507_] != is_477_[0] && (is_477_[i_507_] != (is_477_[0] + anInt1767 * -1504778739)) && (is_477_[i_507_] != (is_477_[0] - anInt1767 * -1504778739))) {
									bool_500_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_500_ = false;
				if (bool_500_) {
					Class115 class115 = new Class115();
					int i_508_ = is_479_[0];
					int i_509_ = is_481_[0];
					if (is_480_ != null) {
						class115.anInt1421 = is_480_[0] >> 8;
						if (i_508_ == 0)
							class115.aByte1416 |= 0x2;
					} else if (i_508_ == 0)
						return;
					if ((anIntArrayArray1765[i][i_475_] == anIntArrayArray1765[i + 1][i_475_]) && (anIntArrayArray1765[i][i_475_] == anIntArrayArray1765[i + 1][i_475_ + 1]) && (anIntArrayArray1765[i][i_475_] == anIntArrayArray1765[i][i_475_ + 1]))
						class115.aByte1416 |= 0x1;
					if (i_509_ != -1 && (class115.aByte1416 & 0x2) == 0 && !(aClass167_Sub1_9827.aClass174_1852.method2446(i_509_, -1390798270).aBool1820)) {
						int i_510_;
						if (is_478_ != null && class175.anInt1934 * 71478565 != 0) {
							i_510_ = 255 * is_478_[i_501_] / (class175.anInt1934 * 71478565);
							if (i_510_ < 0)
								i_510_ = 0;
							else if (i_510_ > 255)
								i_510_ = 255;
						} else
							i_510_ = 0;
						class115.anInt1414 = (Class59.method984(method9052(is_479_[i_501_] >> 8, (aByteArrayArray9835[i][i_475_] - aByteArrayArray9843[i][i_475_])), class175.anInt1932 * 432289019, i_510_, -644600887));
						if (class115.anInt1421 != 0)
							class115.anInt1414 |= (255 - (aByteArrayArray9835[i][i_475_] - aByteArrayArray9843[i][i_475_]) << 25);
						if (is_478_ != null && class175.anInt1934 * 71478565 != 0) {
							i_510_ = 255 * is_478_[i_502_] / (class175.anInt1934 * 71478565);
							if (i_510_ < 0)
								i_510_ = 0;
							else if (i_510_ > 255)
								i_510_ = 255;
						} else
							i_510_ = 0;
						class115.anInt1415 = (Class59.method984(method9052(is_479_[i_502_] >> 8, (aByteArrayArray9835[i + 1][i_475_] - (aByteArrayArray9843[i + 1][i_475_]))), class175.anInt1932 * 432289019, i_510_, 539253464));
						if (class115.anInt1421 != 0)
							class115.anInt1415 |= 255 - (aByteArrayArray9835[i + 1][i_475_] - (aByteArrayArray9843[i + 1][i_475_])) << 25;
						if (is_478_ != null && class175.anInt1934 * 71478565 != 0) {
							i_510_ = 255 * is_478_[i_503_] / (class175.anInt1934 * 71478565);
							if (i_510_ < 0)
								i_510_ = 0;
							else if (i_510_ > 255)
								i_510_ = 255;
						} else
							i_510_ = 0;
						class115.anInt1413 = (Class59.method984(method9052(is_479_[i_503_] >> 8, ((aByteArrayArray9835[i + 1][i_475_ + 1]) - (aByteArrayArray9843[i + 1][i_475_ + 1]))), class175.anInt1932 * 432289019, i_510_, -416717938));
						if (class115.anInt1421 != 0)
							class115.anInt1413 |= (255 - (aByteArrayArray9835[i + 1][i_475_ + 1] - (aByteArrayArray9843[i + 1][i_475_ + 1]))) << 25;
						if (is_478_ != null && class175.anInt1934 * 71478565 != 0) {
							i_510_ = 255 * is_478_[i_504_] / (class175.anInt1934 * 71478565);
							if (i_510_ < 0)
								i_510_ = 0;
							else if (i_510_ > 255)
								i_510_ = 255;
						} else
							i_510_ = 0;
						class115.anInt1422 = (Class59.method984(method9052(is_479_[i_504_] >> 8, (aByteArrayArray9835[i][i_475_ + 1] - (aByteArrayArray9843[i][i_475_ + 1]))), class175.anInt1932 * 432289019, i_510_, -690783492));
						class115.aShort1423 = (short) i_509_;
					} else {
						int i_511_;
						if (is_478_ != null && class175.anInt1934 * 71478565 != 0) {
							i_511_ = 255 * is_478_[i_501_] / (class175.anInt1934 * 71478565);
							if (i_511_ < 0)
								i_511_ = 0;
							else if (i_511_ > 255)
								i_511_ = 255;
						} else
							i_511_ = 0;
						class115.anInt1414 = (Class59.method984(method9052(is_479_[i_501_] >> 8, (aByteArrayArray9835[i][i_475_] - aByteArrayArray9843[i][i_475_])), class175.anInt1932 * 432289019, i_511_, -398740240));
						if (class115.anInt1421 != 0)
							class115.anInt1414 |= (255 - (aByteArrayArray9835[i][i_475_] - aByteArrayArray9843[i][i_475_]) << 25);
						if (is_478_ != null && class175.anInt1934 * 71478565 != 0) {
							i_511_ = 255 * is_478_[i_502_] / (class175.anInt1934 * 71478565);
							if (i_511_ < 0)
								i_511_ = 0;
							else if (i_511_ > 255)
								i_511_ = 255;
						} else
							i_511_ = 0;
						class115.anInt1415 = (Class59.method984(method9052(is_479_[i_502_] >> 8, (aByteArrayArray9835[i + 1][i_475_] - (aByteArrayArray9843[i + 1][i_475_]))), class175.anInt1932 * 432289019, i_511_, -471832078));
						if (class115.anInt1421 != 0)
							class115.anInt1415 |= 255 - (aByteArrayArray9835[i + 1][i_475_] - (aByteArrayArray9843[i + 1][i_475_])) << 25;
						if (is_478_ != null && class175.anInt1934 * 71478565 != 0) {
							i_511_ = 255 * is_478_[i_503_] / (class175.anInt1934 * 71478565);
							if (i_511_ < 0)
								i_511_ = 0;
							else if (i_511_ > 255)
								i_511_ = 255;
						} else
							i_511_ = 0;
						class115.anInt1413 = (Class59.method984(method9052(is_479_[i_503_] >> 8, ((aByteArrayArray9835[i + 1][i_475_ + 1]) - (aByteArrayArray9843[i + 1][i_475_ + 1]))), class175.anInt1932 * 432289019, i_511_, -2098743528));
						if (class115.anInt1421 != 0)
							class115.anInt1413 |= (255 - (aByteArrayArray9835[i + 1][i_475_ + 1] - (aByteArrayArray9843[i + 1][i_475_ + 1]))) << 25;
						if (is_478_ != null && class175.anInt1934 * 71478565 != 0) {
							i_511_ = 255 * is_478_[i_504_] / (class175.anInt1934 * 71478565);
							if (i_511_ < 0)
								i_511_ = 0;
							else if (i_511_ > 255)
								i_511_ = 255;
						} else
							i_511_ = 0;
						class115.anInt1422 = (Class59.method984(method9052(is_479_[i_504_] >> 8, (aByteArrayArray9835[i][i_475_ + 1] - (aByteArrayArray9843[i][i_475_ + 1]))), class175.anInt1932 * 432289019, i_511_, -1372876831));
						if (class115.anInt1421 != 0)
							class115.anInt1422 |= 255 - (aByteArrayArray9835[i][i_475_ + 1] - (aByteArrayArray9843[i][i_475_ + 1])) << 25;
						class115.aShort1423 = (short) -1;
					}
					if (is_478_ != null) {
						class115.aShort1420 = (short) is_478_[i_503_];
						class115.aShort1417 = (short) is_478_[i_504_];
						class115.aShort1419 = (short) is_478_[i_502_];
						class115.aShort1418 = (short) is_478_[i_501_];
					}
					aClass115ArrayArray9831[i][i_475_] = class115;
				} else {
					Class102 class102 = new Class102();
					class102.aShort1211 = (short) is.length;
					class102.aShort1219 = (short) (is.length / 3);
					class102.aShortArray1215 = new short[class102.aShort1211];
					class102.aShortArray1214 = new short[class102.aShort1211];
					class102.aShortArray1216 = new short[class102.aShort1211];
					class102.anIntArray1217 = new int[class102.aShort1211];
					if (is_478_ != null)
						class102.aShortArray1218 = new short[class102.aShort1211];
					for (int i_512_ = 0; i_512_ < class102.aShort1211; i_512_++) {
						int i_513_ = is[i_512_];
						int i_514_ = is_477_[i_512_];
						boolean bool_515_ = false;
						int i_516_;
						if (i_513_ == 0 && i_514_ == 0)
							i_516_ = (aByteArrayArray9835[i][i_475_] - aByteArrayArray9843[i][i_475_]);
						else if (i_513_ == 0 && i_514_ == anInt1767 * -1504778739)
							i_516_ = (aByteArrayArray9835[i][i_475_ + 1] - aByteArrayArray9843[i][i_475_ + 1]);
						else if (i_513_ == anInt1767 * -1504778739 && i_514_ == anInt1767 * -1504778739)
							i_516_ = (aByteArrayArray9835[i + 1][i_475_ + 1] - aByteArrayArray9843[i + 1][i_475_ + 1]);
						else if (i_513_ == anInt1767 * -1504778739 && i_514_ == 0)
							i_516_ = (aByteArrayArray9835[i + 1][i_475_] - aByteArrayArray9843[i + 1][i_475_]);
						else {
							int i_517_ = (((aByteArrayArray9835[i][i_475_] - aByteArrayArray9843[i][i_475_]) * (anInt1767 * -1504778739 - i_513_)) + ((aByteArrayArray9835[i + 1][i_475_] - aByteArrayArray9843[i + 1][i_475_]) * i_513_));
							int i_518_ = (((aByteArrayArray9835[i][i_475_ + 1] - aByteArrayArray9843[i][i_475_ + 1]) * (anInt1767 * -1504778739 - i_513_)) + (aByteArrayArray9835[i + 1][i_475_ + 1] - (aByteArrayArray9843[i + 1][i_475_ + 1])) * i_513_);
							i_516_ = (i_517_ * (anInt1767 * -1504778739 - i_514_) + i_518_ * i_514_ >> anInt1768 * -166490558);
						}
						int i_519_ = (i << anInt1768 * 2064238369) + i_513_;
						int i_520_ = (i_475_ << anInt1768 * 2064238369) + i_514_;
						class102.aShortArray1215[i_512_] = (short) i_513_;
						class102.aShortArray1216[i_512_] = (short) i_514_;
						class102.aShortArray1214[i_512_] = (short) (method1925(i_519_, i_520_, (byte) 0) + (is_476_ != null ? is_476_[i_512_] : 0));
						if (i_516_ < 0)
							i_516_ = 0;
						if (is_479_[i_512_] == 0) {
							if (is_480_ != null)
								class102.anIntArray1217[i_512_] = i_516_ << 25;
							else
								class102.anIntArray1217[i_512_] = 0;
						} else {
							int i_521_ = 0;
							if (is_478_ != null) {
								int i_522_ = (class102.aShortArray1218[i_512_] = (short) is_478_[i_512_]);
								if (class175.anInt1934 * 71478565 != 0) {
									i_521_ = 255 * i_522_ / (class175.anInt1934 * 71478565);
									if (i_521_ < 0)
										i_521_ = 0;
									else if (i_521_ > 255)
										i_521_ = 255;
								}
							}
							class102.anIntArray1217[i_512_] = Class59.method984(method9052((is_479_[i_512_] >> 8), i_516_), (class175.anInt1932 * 432289019), i_521_, -294274177);
							if (is_480_ != null)
								class102.anIntArray1217[i_512_] |= i_516_ << 25;
						}
					}
					boolean bool_523_ = false;
					for (int i_524_ = 0; i_524_ < class102.aShort1219; i_524_++) {
						if (is_481_[i_524_ * 3] != -1 && !(aClass167_Sub1_9827.aClass174_1852.method2446(is_481_[i_524_ * 3], -622081637).aBool1820))
							bool_523_ = true;
					}
					if (is_480_ != null)
						class102.anIntArray1220 = new int[class102.aShort1219];
					if (bool_523_) {
						class102.aShortArray1213 = new short[class102.aShort1219];
						class102.aShortArray1210 = new short[class102.aShort1219];
					}
					for (int i_525_ = 0; i_525_ < class102.aShort1219; i_525_++) {
						int i_526_ = i_525_ * 3;
						if (is_480_ != null && is_480_[i_526_] != 0)
							class102.anIntArray1220[i_525_] = is_480_[i_526_] >> 8;
						if (bool_523_) {
							int i_527_ = i_526_ + 1;
							int i_528_ = i_527_ + 1;
							boolean bool_529_ = false;
							boolean bool_530_ = true;
							int i_531_ = is_481_[i_526_];
							if (i_531_ == -1 || (aClass167_Sub1_9827.aClass174_1852.method2446(i_531_, -1703500475).aBool1820))
								bool_530_ = false;
							else
								bool_529_ = true;
							i_531_ = is_481_[i_527_];
							if (i_531_ == -1 || (aClass167_Sub1_9827.aClass174_1852.method2446(i_531_, -1811949787).aBool1820))
								bool_530_ = false;
							else
								bool_529_ = true;
							i_531_ = is_481_[i_528_];
							if (i_531_ == -1 || (aClass167_Sub1_9827.aClass174_1852.method2446(i_531_, -667012821).aBool1820))
								bool_530_ = false;
							else
								bool_529_ = true;
							if (bool_530_) {
								class102.aShortArray1213[i_525_] = (short) i_531_;
								class102.aShortArray1210[i_525_] = (short) is_482_[i_526_];
							} else {
								if (bool_529_) {
									i_531_ = is_481_[i_526_];
									if (i_531_ != -1 && !(aClass167_Sub1_9827.aClass174_1852.method2446(i_531_, -1429560930).aBool1820))
										class102.anIntArray1217[i_526_] = (ColourUtils.anIntArray8308[(Class254.method3537((aClass167_Sub1_9827.aClass174_1852.method2446(i_531_, -1795229671).aShort1831) & 0xffff, 1409175155)) & 0xffff]);
									i_531_ = is_481_[i_527_];
									if (i_531_ != -1 && !(aClass167_Sub1_9827.aClass174_1852.method2446(i_531_, -1949135721).aBool1820))
										class102.anIntArray1217[i_527_] = (ColourUtils.anIntArray8308[(Class254.method3537((aClass167_Sub1_9827.aClass174_1852.method2446(i_531_, -743087045).aShort1831) & 0xffff, 1409175155)) & 0xffff]);
									i_531_ = is_481_[i_528_];
									if (i_531_ != -1 && !(aClass167_Sub1_9827.aClass174_1852.method2446(i_531_, -1422099686).aBool1820))
										class102.anIntArray1217[i_528_] = (ColourUtils.anIntArray8308[(Class254.method3537((aClass167_Sub1_9827.aClass174_1852.method2446(i_531_, -219043834).aShort1831) & 0xffff, 1409175155)) & 0xffff]);
								}
								class102.aShortArray1213[i_525_] = (short) -1;
							}
						}
					}
					aClass102ArrayArray9826[i][i_475_] = class102;
				}
			}
		}
	}

	public void method1953(int i, int i_532_, int i_533_, int i_534_, int i_535_, int i_536_, int i_537_, boolean[][] bools) {
		Class107 class107 = aClass167_Sub1_9827.method8458(Thread.currentThread());
		Class117 class117 = class107.aClass117_1290;
		class117.anInt1436 = 0;
		class117.aBool1449 = true;
		aClass167_Sub1_9827.method8460();
		if (aClass115ArrayArray9831 != null || aClass134ArrayArray9833 != null)
			method9053(i, i_532_, i_533_, i_534_, i_535_, i_536_, i_537_, bools, class107, class117, class107.aFloatArray1316, class107.aFloatArray1292);
		else if (aClass136ArrayArray9829 != null)
			method9049(i, i_532_, i_533_, i_534_, i_535_, i_536_, i_537_, bools, class107, class117, class107.aFloatArray1316, class107.aFloatArray1292);
	}

	public void method1939(int i, int i_538_, int i_539_, int i_540_, int i_541_, int i_542_, int i_543_, boolean[][] bools) {
		Class107 class107 = aClass167_Sub1_9827.method8458(Thread.currentThread());
		Class117 class117 = class107.aClass117_1290;
		class117.anInt1436 = 0;
		class117.aBool1449 = true;
		aClass167_Sub1_9827.method8460();
		if (aClass115ArrayArray9831 != null || aClass134ArrayArray9833 != null)
			method9053(i, i_538_, i_539_, i_540_, i_541_, i_542_, i_543_, bools, class107, class117, class107.aFloatArray1316, class107.aFloatArray1292);
		else if (aClass136ArrayArray9829 != null)
			method9049(i, i_538_, i_539_, i_540_, i_541_, i_542_, i_543_, bools, class107, class117, class107.aFloatArray1316, class107.aFloatArray1292);
	}

	public void method1940(int i, int i_544_, int i_545_, int i_546_, int i_547_, int i_548_, int i_549_, boolean[][] bools) {
		Class107 class107 = aClass167_Sub1_9827.method8458(Thread.currentThread());
		Class117 class117 = class107.aClass117_1290;
		class117.anInt1436 = 0;
		class117.aBool1449 = true;
		aClass167_Sub1_9827.method8460();
		if (aClass115ArrayArray9831 != null || aClass134ArrayArray9833 != null)
			method9053(i, i_544_, i_545_, i_546_, i_547_, i_548_, i_549_, bools, class107, class117, class107.aFloatArray1316, class107.aFloatArray1292);
		else if (aClass136ArrayArray9829 != null)
			method9049(i, i_544_, i_545_, i_546_, i_547_, i_548_, i_549_, bools, class107, class117, class107.aFloatArray1316, class107.aFloatArray1292);
	}

	Class160_Sub3(Class167_Sub1 class167_sub1, int i, int i_550_, int i_551_, int i_552_, int[][] is, int[][] is_553_, int i_554_) {
		super(i_551_, i_552_, i_554_, is);
		aClass167_Sub1_9827 = class167_sub1;
		anInt9828 = i_550_;
		aByteArrayArray9835 = new byte[i_551_ + 1][i_552_ + 1];
		int i_555_ = aClass167_Sub1_9827.anInt9009 * 810309955 >> 9;
		for (int i_556_ = 1; i_556_ < i_552_; i_556_++) {
			for (int i_557_ = 1; i_557_ < i_551_; i_557_++) {
				int i_558_ = i_555_;
				int i_559_ = (is_553_[i_557_ + 1][i_556_] - is_553_[i_557_ - 1][i_556_]);
				int i_560_ = (is_553_[i_557_][i_556_ + 1] - is_553_[i_557_][i_556_ - 1]);
				int i_561_ = (int) Math.sqrt((double) (i_559_ * i_559_ + 512 * i_554_ + i_560_ * i_560_));
				int i_562_ = (i_559_ << 8) / i_561_;
				int i_563_ = -512 * i_554_ / i_561_;
				int i_564_ = (i_560_ << 8) / i_561_;
				i_558_ += (aClass167_Sub1_9827.anInt9004 * 1708831941 * i_562_ + aClass167_Sub1_9827.anInt9016 * -265863553 * i_563_ + (aClass167_Sub1_9827.anInt9026 * -1963535039 * i_564_)) >> 17;
				i_558_ >>= 1;
				if (i_558_ < 2)
					i_558_ = 2;
				else if (i_558_ > 126)
					i_558_ = 126;
				aByteArrayArray9835[i_557_][i_556_] = (byte) i_558_;
			}
		}
		aByteArrayArray9843 = new byte[i_551_ + 1][i_552_ + 1];
	}

	public boolean method1944(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_565_, int i_566_, int i_567_, boolean bool) {
		return false;
	}

	public void method1929(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_568_, int i_569_, int i_570_, boolean bool) {
		/* empty */
	}

	public void method1952(Class536_Sub19 class536_sub19, int[] is) {
		/* empty */
	}

	public Class536_Sub18_Sub7 method1941(int i, int i_571_, Class536_Sub18_Sub7 class536_sub18_sub7) {
		return null;
	}

	public void method1942(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_572_, int i_573_, int i_574_, boolean bool) {
		/* empty */
	}

	boolean method9051(int i) {
		if ((anInt9828 & 0x8) == 0)
			return false;
		if (i == 4)
			return true;
		if (i == 8)
			return true;
		if (i == 9)
			return true;
		return false;
	}

	public Class536_Sub18_Sub7 method1928(int i, int i_575_, Class536_Sub18_Sub7 class536_sub18_sub7) {
		return null;
	}

	static int method9052(int i, int i_576_) {
		int i_577_ = (i & 0xff0000) * i_576_ >> 23;
		if (i_577_ < 2)
			i_577_ = 2;
		else if (i_577_ > 253)
			i_577_ = 253;
		int i_578_ = (i & 0xff00) * i_576_ >> 15;
		if (i_578_ < 2)
			i_578_ = 2;
		else if (i_578_ > 253)
			i_578_ = 253;
		int i_579_ = (i & 0xff) * i_576_ >> 7;
		if (i_579_ < 2)
			i_579_ = 2;
		else if (i_579_ > 253)
			i_579_ = 253;
		return i_577_ << 16 | i_578_ << 8 | i_579_;
	}

	public boolean method1946(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_580_, int i_581_, int i_582_, boolean bool) {
		return false;
	}

	public boolean method1947(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_583_, int i_584_, int i_585_, boolean bool) {
		return false;
	}

	public boolean method1948(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_586_, int i_587_, int i_588_, boolean bool) {
		return false;
	}

	public void method1919(int i, int i_589_, int[] is, int[] is_590_, int[] is_591_, int[] is_592_, int[] is_593_, int[] is_594_, int[] is_595_, int[] is_596_, int[] is_597_, int[] is_598_, int[] is_599_, Class175 class175, boolean bool) {
		if (aClass136ArrayArray9829 == null) {
			aClass136ArrayArray9829 = new Class136[anInt1766 * 1718142487][anInt1769 * -889224915];
			aClass113ArrayArray9851 = new Class113[anInt1766 * 1718142487][anInt1769 * -889224915];
		} else if (aClass115ArrayArray9831 != null || aClass134ArrayArray9833 != null)
			throw new IllegalStateException();
		boolean bool_600_ = false;
		if (is_596_.length == 2 && is_593_.length == 2 && (is_596_[0] == is_596_[1] || is_598_[0] != -1 && is_598_[0] == is_598_[1])) {
			bool_600_ = true;
			for (int i_601_ = 1; i_601_ < 2; i_601_++) {
				int i_602_ = is[is_593_[i_601_]];
				int i_603_ = is_591_[is_593_[i_601_]];
				if (i_602_ != 0 && i_602_ != anInt1767 * -1504778739 || i_603_ != 0 && i_603_ != anInt1767 * -1504778739) {
					bool_600_ = false;
					break;
				}
			}
		}
		if (!bool_600_) {
			Class113 class113 = new Class113();
			short i_604_ = (short) is.length;
			int i_605_ = (short) is_596_.length;
			class113.aShort1399 = i_604_;
			class113.aShortArray1401 = new short[i_604_];
			class113.aShortArray1403 = new short[i_604_];
			class113.aShortArray1396 = new short[i_604_];
			class113.aShortArray1400 = new short[i_604_];
			for (int i_606_ = 0; i_606_ < i_604_; i_606_++) {
				int i_607_ = is[i_606_];
				int i_608_ = is_591_[i_606_];
				if (i_607_ == 0 && i_608_ == 0)
					class113.aShortArray1401[i_606_] = (short) (aByteArrayArray9835[i][i_589_] - aByteArrayArray9843[i][i_589_]);
				else if (i_607_ == 0 && i_608_ == anInt1767 * -1504778739)
					class113.aShortArray1401[i_606_] = (short) (aByteArrayArray9835[i][i_589_ + 1] - aByteArrayArray9843[i][i_589_ + 1]);
				else if (i_607_ == anInt1767 * -1504778739 && i_608_ == anInt1767 * -1504778739)
					class113.aShortArray1401[i_606_] = (short) (aByteArrayArray9835[i + 1][i_589_ + 1] - aByteArrayArray9843[i + 1][i_589_ + 1]);
				else if (i_607_ == anInt1767 * -1504778739 && i_608_ == 0)
					class113.aShortArray1401[i_606_] = (short) (aByteArrayArray9835[i + 1][i_589_] - aByteArrayArray9843[i + 1][i_589_]);
				else {
					int i_609_ = (((aByteArrayArray9835[i][i_589_] - aByteArrayArray9843[i][i_589_]) * (anInt1767 * -1504778739 - i_607_)) + (aByteArrayArray9835[i + 1][i_589_] - aByteArrayArray9843[i + 1][i_589_]) * i_607_);
					int i_610_ = (((aByteArrayArray9835[i][i_589_ + 1] - aByteArrayArray9843[i][i_589_ + 1]) * (anInt1767 * -1504778739 - i_607_)) + ((aByteArrayArray9835[i + 1][i_589_ + 1] - aByteArrayArray9843[i + 1][i_589_ + 1]) * i_607_));
					class113.aShortArray1401[i_606_] = (short) ((i_609_ * (anInt1767 * -1504778739 - i_608_) + i_610_ * i_608_) >> anInt1768 * -166490558);
				}
				int i_611_ = (i << anInt1768 * 2064238369) + i_607_;
				int i_612_ = (i_589_ << anInt1768 * 2064238369) + i_608_;
				class113.aShortArray1403[i_606_] = (short) i_607_;
				class113.aShortArray1400[i_606_] = (short) i_608_;
				class113.aShortArray1396[i_606_] = (short) (method1925(i_611_, i_612_, (byte) 18) + (is_590_ != null ? is_590_[i_606_] : 0));
				if (class113.aShortArray1401[i_606_] < 2)
					class113.aShortArray1401[i_606_] = (short) 2;
			}
			boolean bool_613_ = false;
			int i_614_ = 0;
			for (int i_615_ = 0; i_615_ < i_605_; i_615_++) {
				if (is_596_[i_615_] >= 0 || is_597_ != null && is_597_[i_615_] >= 0)
					i_614_++;
				int i_616_ = is_598_[i_615_];
				if (i_616_ != -1) {
					Class164 class164 = aClass167_Sub1_9827.aClass174_1852.method2446(i_616_, -1005761920);
					if (!class164.aBool1820) {
						bool_613_ = true;
						if (method9051(class164.aByte1797) || class164.aByte1802 != 0 || class164.aByte1803 != 0)
							class113.aByte1395 |= 0x4;
					}
				}
			}
			class113.anIntArray1407 = new int[i_614_];
			if (is_597_ != null)
				class113.anIntArray1408 = new int[i_614_];
			class113.aShortArray1398 = new short[i_614_];
			class113.aShortArray1402 = new short[i_614_];
			class113.aShortArray1404 = new short[i_614_];
			if (bool_613_) {
				class113.aShortArray1405 = new short[i_614_];
				class113.aShortArray1406 = new short[i_614_];
			}
			for (int i_617_ = 0; i_617_ < i_605_; i_617_++) {
				if (is_596_[i_617_] >= 0 || is_597_ != null && is_597_[i_617_] >= 0) {
					if (is_596_[i_617_] >= 0)
						class113.anIntArray1407[class113.aShort1397] = Class254.method3537(is_596_[i_617_], 1409175155);
					else
						class113.anIntArray1407[class113.aShort1397] = -1;
					if (is_597_ != null) {
						if (is_597_[i_617_] != -1)
							class113.anIntArray1408[class113.aShort1397] = Class254.method3537(is_597_[i_617_], 1409175155);
						else
							class113.anIntArray1408[class113.aShort1397] = -1;
					}
					class113.aShortArray1398[class113.aShort1397] = (short) is_593_[i_617_];
					class113.aShortArray1402[class113.aShort1397] = (short) is_594_[i_617_];
					class113.aShortArray1404[class113.aShort1397] = (short) is_595_[i_617_];
					if (bool_613_) {
						if (is_598_[i_617_] != -1 && !(aClass167_Sub1_9827.aClass174_1852.method2446(is_598_[i_617_], -2080728058).aBool1820)) {
							class113.aShortArray1405[class113.aShort1397] = (short) is_598_[i_617_];
							class113.aShortArray1406[class113.aShort1397] = (short) is_599_[i_617_];
						} else
							class113.aShortArray1405[class113.aShort1397] = (short) -1;
					}
					class113.aShort1397++;
				}
			}
			aClass113ArrayArray9851[i][i_589_] = class113;
		} else if (is_596_[0] >= 0 || is_597_ != null && is_597_[0] >= 0) {
			Class136 class136 = new Class136();
			int i_618_ = is_596_[0];
			int i_619_ = is_598_[0];
			if (is_597_ != null) {
				class136.anInt1631 = Class267.method3703(Class254.method3537(is_597_[0], 1409175155), (aByteArrayArray9835[i][i_589_] - aByteArrayArray9843[i][i_589_]), -329965339);
				if (i_618_ == -1)
					class136.aByte1629 |= 0x2;
			}
			if ((anIntArrayArray1765[i][i_589_] == anIntArrayArray1765[i + 1][i_589_]) && (anIntArrayArray1765[i][i_589_] == anIntArrayArray1765[i + 1][i_589_ + 1]) && (anIntArrayArray1765[i][i_589_] == anIntArrayArray1765[i][i_589_ + 1]))
				class136.aByte1629 |= 0x1;
			Class164 class164 = null;
			if (i_619_ != -1)
				class164 = aClass167_Sub1_9827.aClass174_1852.method2446(i_619_, -1957912628);
			if (class164 != null && (class136.aByte1629 & 0x2) == 0 && !class164.aBool1820) {
				class136.aShort1626 = (short) (aByteArrayArray9835[i][i_589_] - aByteArrayArray9843[i][i_589_]);
				class136.aShort1628 = (short) (aByteArrayArray9835[i + 1][i_589_] - aByteArrayArray9843[i + 1][i_589_]);
				class136.aShort1627 = (short) (aByteArrayArray9835[i + 1][i_589_ + 1] - aByteArrayArray9843[i + 1][i_589_ + 1]);
				class136.aShort1630 = (short) (aByteArrayArray9835[i][i_589_ + 1] - aByteArrayArray9843[i][i_589_ + 1]);
				class136.aShort1632 = (short) i_619_;
				if (method9051(class164.aByte1797) || class164.aByte1802 != 0 || class164.aByte1803 != 0)
					class136.aByte1629 |= 0x4;
			} else {
				short i_620_ = Class254.method3537(i_618_, 1409175155);
				class136.aShort1626 = (short) Class267.method3703(i_620_, ((aByteArrayArray9835[i][i_589_]) - (aByteArrayArray9843[i][i_589_])), -329965339);
				class136.aShort1628 = (short) Class267.method3703(i_620_, ((aByteArrayArray9835[i + 1][i_589_]) - (aByteArrayArray9843[i + 1][i_589_])), -329965339);
				class136.aShort1627 = (short) Class267.method3703(i_620_, ((aByteArrayArray9835[i + 1][i_589_ + 1]) - (aByteArrayArray9843[i + 1][i_589_ + 1])), -329965339);
				class136.aShort1630 = (short) Class267.method3703(i_620_, ((aByteArrayArray9835[i][i_589_ + 1]) - (aByteArrayArray9843[i][i_589_ + 1])), -329965339);
				class136.aShort1632 = (short) -1;
			}
			aClass136ArrayArray9829[i][i_589_] = class136;
		}
	}

	public void method1950(Class536_Sub19 class536_sub19, int[] is) {
		/* empty */
	}

	void method9053(int i, int i_621_, int i_622_, int i_623_, int i_624_, int i_625_, int i_626_, boolean[][] bools, Class107 class107, Class117 class117, float[] fs, float[] fs_627_) {
		int i_628_ = (i_626_ - i_624_) * i_622_ / 256;
		int i_629_ = i_622_ >> 8;
		boolean bool = class107.aBool1285;
		aClass167_Sub1_9827.method2302(false);
		class117.aBool1434 = false;
		class117.aBool1435 = false;
		int i_630_ = i;
		int i_631_ = i_621_ + i_628_;
		for (int i_632_ = i_623_; i_632_ < i_625_; i_632_++) {
			for (int i_633_ = i_624_; i_633_ < i_626_; i_633_++) {
				if (bools[i_632_ - i_623_][i_633_ - i_624_]) {
					if (aClass115ArrayArray9831 != null) {
						if (aClass115ArrayArray9831[i_632_][i_633_] != null) {
							Class115 class115 = aClass115ArrayArray9831[i_632_][i_633_];
							if (class115.aShort1423 != -1 && (class115.aByte1416 & 0x2) == 0 && class115.anInt1421 == 0) {
								int i_634_ = (aClass167_Sub1_9827.method8448(class115.aShort1423 & 0xffff));
								class117.method1487(true, true, false, (float) (i_631_ - i_629_), (float) (i_631_ - i_629_), (float) i_631_, (float) (i_630_ + i_629_), (float) i_630_, (float) (i_630_ + i_629_), 100.0F, 100.0F, 100.0F, (float) Class267.method3703(i_634_, (class115.anInt1413), -329965339), (float) Class267.method3703(i_634_, (class115.anInt1422), -329965339), (float) Class267.method3703(i_634_, (class115.anInt1415), -329965339));
								class117.method1487(true, true, false, (float) i_631_, (float) i_631_, (float) (i_631_ - i_629_), (float) i_630_, (float) (i_630_ + i_629_), (float) i_630_, 100.0F, 100.0F, 100.0F, (float) Class267.method3703(i_634_, (class115.anInt1414), -329965339), (float) Class267.method3703(i_634_, (class115.anInt1415), -329965339), (float) Class267.method3703(i_634_, (class115.anInt1422), -329965339));
							} else if (class115.anInt1421 == 0) {
								class117.method1504(true, true, false, (float) (i_631_ - i_629_), (float) (i_631_ - i_629_), (float) i_631_, (float) (i_630_ + i_629_), (float) i_630_, (float) (i_630_ + i_629_), 100.0F, 100.0F, 100.0F, class115.anInt1413, class115.anInt1422, class115.anInt1415);
								class117.method1504(true, true, false, (float) i_631_, (float) i_631_, (float) (i_631_ - i_629_), (float) i_630_, (float) (i_630_ + i_629_), (float) i_630_, 100.0F, 100.0F, 100.0F, class115.anInt1414, class115.anInt1415, class115.anInt1422);
							} else {
								int i_635_ = class115.anInt1421;
								class117.method1504(true, true, false, (float) (i_631_ - i_629_), (float) (i_631_ - i_629_), (float) i_631_, (float) (i_630_ + i_629_), (float) i_630_, (float) (i_630_ + i_629_), 100.0F, 100.0F, 100.0F, Class97.method1319(i_635_, (class115.anInt1413 & ~0xffffff), (byte) 71), Class97.method1319(i_635_, (class115.anInt1422 & ~0xffffff), (byte) 65), Class97.method1319(i_635_, (class115.anInt1415 & ~0xffffff), (byte) 104));
								class117.method1504(true, true, false, (float) i_631_, (float) i_631_, (float) (i_631_ - i_629_), (float) i_630_, (float) (i_630_ + i_629_), (float) i_630_, 100.0F, 100.0F, 100.0F, Class97.method1319(i_635_, (class115.anInt1414 & ~0xffffff), (byte) 93), Class97.method1319(i_635_, (class115.anInt1415 & ~0xffffff), (byte) 85), Class97.method1319(i_635_, (class115.anInt1422 & ~0xffffff), (byte) 67));
							}
						} else if (aClass102ArrayArray9826[i_632_][i_633_] != null) {
							Class102 class102 = aClass102ArrayArray9826[i_632_][i_633_];
							for (int i_636_ = 0; i_636_ < class102.aShort1211; i_636_++) {
								fs[i_636_] = (float) (i_630_ + ((class102.aShortArray1215[i_636_]) * i_629_ / (anInt1767 * -1504778739)));
								fs_627_[i_636_] = (float) (i_631_ - ((class102.aShortArray1216[i_636_]) * i_629_ / (anInt1767 * -1504778739)));
							}
							for (int i_637_ = 0; i_637_ < class102.aShort1219; i_637_++) {
								int i_638_ = i_637_ * 3;
								int i_639_ = i_638_ + 1;
								int i_640_ = i_639_ + 1;
								float f = fs[i_638_];
								float f_641_ = fs[i_639_];
								float f_642_ = fs[i_640_];
								float f_643_ = fs_627_[i_638_];
								float f_644_ = fs_627_[i_639_];
								float f_645_ = fs_627_[i_640_];
								if (class102.anIntArray1220 != null && class102.anIntArray1220[i_637_] != 0 && (class102.aShortArray1213 == null || (class102.aShortArray1213 != null && (class102.aShortArray1213[i_637_]) == -1))) {
									int i_646_ = class102.anIntArray1220[i_637_];
									class117.method1504(true, true, false, f_643_, f_644_, f_645_, f, f_641_, f_642_, 100.0F, 100.0F, 100.0F, (Class97.method1319(i_646_, (-16777216 - (class102.anIntArray1217[i_638_] & ~0xffffff)), (byte) 91)), (Class97.method1319(i_646_, (-16777216 - (class102.anIntArray1217[i_639_] & ~0xffffff)), (byte) 87)), (Class97.method1319(i_646_, (-16777216 - (class102.anIntArray1217[i_640_] & ~0xffffff)), (byte) 88)));
								} else if (class102.aShortArray1213 != null && (class102.aShortArray1213[i_637_] != -1)) {
									int i_647_ = (aClass167_Sub1_9827.method8448(class102.aShortArray1213[i_637_] & 0xffff));
									class117.method1487(true, true, false, f_643_, f_644_, f_645_, f, f_641_, f_642_, 100.0F, 100.0F, 100.0F, (float) i_647_, (float) i_647_, (float) i_647_);
								} else
									class117.method1504(true, true, false, f_643_, f_644_, f_645_, f, f_641_, f_642_, 100.0F, 100.0F, 100.0F, class102.anIntArray1217[i_638_], class102.anIntArray1217[i_639_], class102.anIntArray1217[i_640_]);
							}
						}
					} else if (aClass134ArrayArray9833[i_632_][i_633_] != null) {
						Class134 class134 = aClass134ArrayArray9833[i_632_][i_633_];
						for (int i_648_ = 0; i_648_ < class134.aShort1617; i_648_++) {
							fs[i_648_] = (float) (i_630_ + (class134.aShortArray1619[i_648_] * i_629_ / (anInt1767 * -1504778739)));
							fs_627_[i_648_] = (float) (i_631_ - (class134.aShortArray1616[i_648_] * i_629_ / (anInt1767 * -1504778739)));
						}
						for (int i_649_ = 0; i_649_ < class134.aShort1621; i_649_++) {
							int i_650_ = i_649_ * 3;
							int i_651_ = i_650_ + 1;
							int i_652_ = i_651_ + 1;
							float f = fs[i_650_];
							float f_653_ = fs[i_651_];
							float f_654_ = fs[i_652_];
							float f_655_ = fs_627_[i_650_];
							float f_656_ = fs_627_[i_651_];
							float f_657_ = fs_627_[i_652_];
							if (class134.anIntArray1622 != null && class134.anIntArray1622[i_649_] != 0) {
								int i_658_ = class134.anIntArray1622[i_649_];
								class117.method1504(true, true, false, f_655_, f_656_, f_657_, f, f_653_, f_654_, 100.0F, 100.0F, 100.0F, i_658_, i_658_, i_658_);
							} else
								class117.method1504(true, true, false, f_655_, f_656_, f_657_, f, f_653_, f_654_, 100.0F, 100.0F, 100.0F, class134.anIntArray1620[i_650_], class134.anIntArray1620[i_651_], class134.anIntArray1620[i_652_]);
						}
					}
				}
				i_631_ -= i_629_;
			}
			i_631_ = i_621_ + i_628_;
			i_630_ += i_629_;
		}
		class117.aBool1434 = true;
		aClass167_Sub1_9827.method2302(bool);
	}

	public void method1949(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_659_, int i_660_, int i_661_, boolean bool) {
		/* empty */
	}
}
