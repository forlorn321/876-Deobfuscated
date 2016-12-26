/* Class160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.LinkedList;

public abstract class Class160 {
	public int[][] anIntArrayArray1765;
	public int anInt1766;
	public int anInt1767;
	public int anInt1768;
	public int anInt1769;

	public abstract void method1919(int i, int i_0_, int[] is, int[] is_1_, int[] is_2_, int[] is_3_, int[] is_4_, int[] is_5_, int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_, Class175 class175, boolean bool);

	public abstract void method1920(int i, int i_11_, int[] is, int[] is_12_, int[] is_13_, int[] is_14_, int[] is_15_, int[] is_16_, int[] is_17_, int[] is_18_, Class175 class175, boolean bool);

	public abstract void method1921(int i, int i_19_, int[] is, int[] is_20_, int[] is_21_, int[] is_22_, int[] is_23_, int[] is_24_, int[] is_25_, int[] is_26_, int[] is_27_, int[] is_28_, int[] is_29_, Class175 class175, boolean bool);

	public abstract void method1922();

	public abstract void method1923(int i, int i_30_, int i_31_, boolean[][] bools, boolean bool, int i_32_);

	public abstract boolean method1924(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_33_, int i_34_, int i_35_, boolean bool);

	public final int method1925(int i, int i_36_, byte i_37_) {
		int i_38_ = i >> 2064238369 * anInt1768;
		int i_39_ = i_36_ >> anInt1768 * 2064238369;
		if (i_38_ < 0 || i_39_ < 0 || i_38_ > anInt1766 * 1718142487 - 1 || i_39_ > anInt1769 * -889224915 - 1)
			return 0;
		int i_40_ = i & anInt1767 * -1504778739 - 1;
		int i_41_ = i_36_ & anInt1767 * -1504778739 - 1;
		int i_42_ = ((anIntArrayArray1765[i_38_][i_39_] * (anInt1767 * -1504778739 - i_40_) + anIntArrayArray1765[i_38_ + 1][i_39_] * i_40_) >> 2064238369 * anInt1768);
		int i_43_ = ((((anInt1767 * -1504778739 - i_40_) * anIntArrayArray1765[i_38_][i_39_ + 1]) + anIntArrayArray1765[i_38_ + 1][i_39_ + 1] * i_40_) >> anInt1768 * 2064238369);
		return (i_43_ * i_41_ + i_42_ * (-1504778739 * anInt1767 - i_41_) >> 2064238369 * anInt1768);
	}

	public final int method1926(int i, int i_44_, byte i_45_) {
		int i_46_ = i >> anInt1768 * 2064238369;
		int i_47_ = i_44_ >> anInt1768 * 2064238369;
		i_46_ = Math.min(1718142487 * anInt1766 - 1, Math.max(0, i_46_));
		i_47_ = Math.min(-889224915 * anInt1769 - 1, Math.max(0, i_47_));
		int i_48_ = Math.min(anInt1766 * 1718142487 - 1, i_46_ + 1);
		int i_49_ = Math.min(anInt1769 * -889224915 - 1, i_47_ + 1);
		int i_50_ = i & anInt1767 * -1504778739 - 1;
		int i_51_ = i_44_ & anInt1767 * -1504778739 - 1;
		int i_52_ = ((((-1504778739 * anInt1767 - i_50_) * anIntArrayArray1765[i_46_][i_47_]) + i_50_ * anIntArrayArray1765[i_48_][i_47_]) >> 2064238369 * anInt1768);
		int i_53_ = ((((-1504778739 * anInt1767 - i_50_) * anIntArrayArray1765[i_46_][i_49_]) + i_50_ * anIntArrayArray1765[i_48_][i_49_]) >> 2064238369 * anInt1768);
		return ((anInt1767 * -1504778739 - i_51_) * i_52_ + i_53_ * i_51_ >> anInt1768 * 2064238369);
	}

	public final int method1927(int i, int i_54_, int i_55_) {
		return anIntArrayArray1765[i][i_54_];
	}

	public abstract Class536_Sub18_Sub7 method1928(int i, int i_56_, Class536_Sub18_Sub7 class536_sub18_sub7);

	Class160(int i, int i_57_, int i_58_, int[][] is) {
		anInt1766 = i * -633155161;
		anInt1769 = i_57_ * 155416229;
		int i_59_ = 0;
		for (/**/; i_58_ > 1; i_58_ >>= 1)
			i_59_++;
		anInt1767 = (1 << i_59_) * 1919342789;
		anInt1768 = 1165262049 * i_59_;
		anIntArrayArray1765 = is;
	}

	public abstract void method1929(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_60_, int i_61_, int i_62_, boolean bool);

	public abstract boolean method1930(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_63_, int i_64_, int i_65_, boolean bool);

	public abstract void method1931(int i, int i_66_, int[] is, int[] is_67_, int[] is_68_, int[] is_69_, int[] is_70_, int[] is_71_, int[] is_72_, int[] is_73_, int[] is_74_, int[] is_75_, int[] is_76_, Class175 class175, boolean bool);

	public abstract void method1932(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_77_, int i_78_, int i_79_, boolean bool);

	public abstract void method1933(Class536_Sub19 class536_sub19, int[] is);

	public abstract void method1934(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_80_, int i_81_, int i_82_, boolean bool);

	public abstract void method1935(int i, int i_83_, int[] is, int[] is_84_, int[] is_85_, int[] is_86_, int[] is_87_, int[] is_88_, int[] is_89_, int[] is_90_, Class175 class175, boolean bool);

	public abstract void method1936(int i, int i_91_, int[] is, int[] is_92_, int[] is_93_, int[] is_94_, int[] is_95_, int[] is_96_, int[] is_97_, int[] is_98_, Class175 class175, boolean bool);

	public abstract void method1937();

	public abstract void method1938(int i, int i_99_, int i_100_);

	public abstract void method1939(int i, int i_101_, int i_102_, int i_103_, int i_104_, int i_105_, int i_106_, boolean[][] bools);

	public abstract void method1940(int i, int i_107_, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_, boolean[][] bools);

	public abstract Class536_Sub18_Sub7 method1941(int i, int i_113_, Class536_Sub18_Sub7 class536_sub18_sub7);

	public abstract void method1942(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_114_, int i_115_, int i_116_, boolean bool);

	public abstract void method1943(int i, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_, boolean[][] bools);

	public abstract boolean method1944(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_123_, int i_124_, int i_125_, boolean bool);

	public abstract void method1945(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_126_, int i_127_, int i_128_, boolean bool);

	public abstract boolean method1946(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_129_, int i_130_, int i_131_, boolean bool);

	public abstract boolean method1947(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_132_, int i_133_, int i_134_, boolean bool);

	public abstract boolean method1948(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_135_, int i_136_, int i_137_, boolean bool);

	public abstract void method1949(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_138_, int i_139_, int i_140_, boolean bool);

	public abstract void method1950(Class536_Sub19 class536_sub19, int[] is);

	public abstract void method1951(int i, int i_141_, int i_142_, boolean[][] bools, boolean bool, int i_143_);

	public abstract void method1952(Class536_Sub19 class536_sub19, int[] is);

	public abstract void method1953(int i, int i_144_, int i_145_, int i_146_, int i_147_, int i_148_, int i_149_, boolean[][] bools);

	public final int method1954(int i, int i_150_, short i_151_) {
		return (anIntArrayArray1765[Math.min(1718142487 * anInt1766 - 1, Math.max(0, i))][Math.min(-889224915 * anInt1769 - 1, Math.max(0, i_150_))]);
	}

	public abstract void method1955(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_152_, int i_153_, int i_154_, boolean bool);

	public abstract void method1956(int i, int i_155_, int i_156_);

	static final void method1957(Class668 class668, byte i) {
		int i_157_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		InterfaceDefinitions class251 = Class264.method3678(i_157_, -689214737);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class251.anInt2636 * 2003514143;
	}

	static final void method1958(Class668 class668, byte i) {
		Class532.method6442(class668, 833224664);
	}

	static final void method1959(Class668 class668, short i) {
		class668.anInt8542 -= 1472892954;
		int i_158_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_159_ = class668.anIntArray8541[1 + class668.anInt8542 * 1867269829];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (client.aClass485ArrayArray11266[i_159_][i_158_].anInt5440 * -417200313);
	}

	public static boolean method1960(int i, byte i_160_) {
		return 0 == i || i == 1 || i == 2;
	}

	public static void method1961(short i) {
		Class103.aShort1232 = client.aShort11255;
		Class98.aShort1181 = client.aShort11282;
		Class199.aShort2222 = client.aShort11279;
		Class466.aShort5324 = client.aShort11280;
		Class193.aBool2188 = true;
		Class193.anInt2189 = Class184_Sub2.aClass211_9442.method3006(606439230) * -359085763;
		if (Class193.anInt2178 * 1663579 != 0 && Class193.anInt2186 * 2024963135 != 0) {
			client.aShort11279 = (short) 334;
			client.aShort11280 = (short) 334;
			client.aShort11282 = client.aShort11255 = (short) (Class193.anInt2178 * 851752448 / (2024963135 * Class193.anInt2186));
		}
	}

	static final void method1962(Class668 class668, int i) {
		Class536_Sub18_Sub9 class536_sub18_sub9 = Class19.method690((byte) -105);
		if (Class555.method6805(class536_sub18_sub9, -731436892) == 7) {
			int i_161_ = (int) class536_sub18_sub9.method10706(16711680);
			if (i_161_ >= 0 && i_161_ <= Class95.anInt1156 * -1482773169) {
				Player class649_sub1_sub5_sub1_sub2 = client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i_161_];
				if (null != class649_sub1_sub5_sub1_sub2) {
					class668.aClass649_Sub1_Sub5_Sub1_8554 = class649_sub1_sub5_sub1_sub2;
					class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1;
					return;
				}
			}
		}
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	public static void method1963(Interface48 interface48, Interface46 interface46, int i) {
		Class626.anInt8155 = 0;
		Class626.anInt8156 = 0;
		Class626.aList8161 = new LinkedList();
		Class626.aClass521_Sub2_Sub1_Sub1Array8159 = new Class521_Sub2_Sub1_Sub1[1024];
		Class626.aClass627Array8157 = (new Class627[1 + Class169.anIntArray1878[500175661 * Class626.anInt8167]]);
		Class626.anInt8154 = 0;
		Class626.anInt8162 = 0;
		Class532.anInterface46_7121 = interface46;
	}
}
