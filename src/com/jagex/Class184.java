/* Class184 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Random;

public abstract class Class184 {
	public static final int anInt2092 = 0;
	Class2 aClass2_2093;
	static String[] aStringArray2094;
	public static final int anInt2095 = 1;
	public static final int anInt2096 = 0;
	static int anInt2097 = -27420367;
	static int anInt2098 = 30889797;
	static int anInt2099 = 0;
	static int anInt2100;
	Class167 aClass167_2101;
	static int anInt2102;
	static int anInt2103;
	static int anInt2104 = 0;
	static int anInt2105;

	public int method2739(String string, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, Random random, int i_7_, int[] is, Class143[] class143s, int[] is_8_, byte i_9_) {
		if (null == string)
			return 0;
		random.setSeed((long) i_7_);
		int i_10_ = 192 + (random.nextInt() & 0x1f);
		method2750(i_10_ << 24 | i_3_ & 0xffffff, -1 == i_4_ ? 0 : i_10_ << 24 | i_4_ & 0xffffff, -1506975189);
		int i_11_ = string.length();
		int[] is_12_ = new int[i_11_];
		int i_13_ = 0;
		for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
			is_12_[i_14_] = i_13_;
			if ((random.nextInt() & 0x3) == 0)
				i_13_++;
		}
		int i_15_ = i;
		int i_16_ = aClass2_2093.anInt91 * -1214764847 + i_0_;
		int i_17_ = -1;
		if (i_6_ == 1)
			i_16_ += (i_2_ - aClass2_2093.anInt91 * -1214764847 - 1780869003 * aClass2_2093.anInt92) / 2;
		else if (2 == i_6_)
			i_16_ = i_2_ + i_0_ - 1780869003 * aClass2_2093.anInt92;
		if (1 == i_5_) {
			i_17_ = aClass2_2093.method530(string, (byte) -46) + i_13_;
			i_15_ += (i_1_ - i_17_) / 2;
		} else if (i_5_ == 2) {
			i_17_ = aClass2_2093.method530(string, (byte) 6) + i_13_;
			i_15_ += i_1_ - i_17_;
		}
		method2758(string, i_15_, i_16_, class143s, is_8_, is_12_, null, 1461824795);
		if (null != is) {
			if (-1 == i_17_)
				i_17_ = aClass2_2093.method530(string, (byte) -102) + i_13_;
			is[0] = i_15_;
			is[1] = i_16_ - aClass2_2093.anInt91 * -1214764847;
			is[2] = i_17_;
			is[3] = (aClass2_2093.anInt92 * 1780869003 + -1214764847 * aClass2_2093.anInt91);
		}
		return i_13_;
	}

	void method2740(String string, int i, int i_18_, Class143[] class143s, int[] is, Class161 class161, int i_19_, int i_20_, byte i_21_) {
		i_18_ -= aClass2_2093.anInt90 * -206496891;
		int i_22_ = -1;
		int i_23_ = -1;
		int i_24_ = string.length();
		for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
			char c = (char) (Class543.method6581(string.charAt(i_25_), -5823823) & 0xff);
			if (60 == c)
				i_22_ = i_25_;
			else {
				if (c == 62 && i_22_ != -1) {
					String string_26_ = string.substring(1 + i_22_, i_25_);
					i_22_ = -1;
					if (string_26_.equals("lt"))
						c = '<';
					else if (string_26_.equals("gt"))
						c = '>';
					else if (string_26_.equals("nbsp"))
						c = '\u00a0';
					else if (string_26_.equals("shy"))
						c = '\u00ad';
					else if (string_26_.equals("times"))
						c = '\u00d7';
					else if (string_26_.equals("euro"))
						c = '\u0080';
					else if (string_26_.equals("copy"))
						c = '\u00a9';
					else if (string_26_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_26_.startsWith("img=")) {
							try {
								int i_27_ = Class392.method4867(string_26_.substring(4), 1296252523);
								Class143 class143 = class143s[i_27_];
								int i_28_ = (is != null ? is[i_27_] : class143.method1785());
								if (-16777216 == (anInt2104 * 177401017 & ~0xffffff))
									class143.method1729(i, ((aClass2_2093.anInt90 * -206496891) + i_18_ - i_28_), 1, -1, 1);
								else
									class143.method1729(i, (i_18_ + aClass2_2093.anInt90 * -206496891 - i_28_), 0, (177401017 * anInt2104 & ~0xffffff | 0xffffff), 1);
								i += class143s[i_27_].method12();
								i_23_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else if (string_26_.startsWith("sprite=")) {
							if (null != aClass2_2093.anInterface4_94) {
								try {
									int i_29_ = -1;
									int i_30_ = 0;
									int i_31_ = string_26_.indexOf(',');
									if (-1 == i_31_)
										i_29_ = (Class392.method4867(string_26_.substring(7), -2143157851));
									else {
										i_29_ = (Class392.method4867(string_26_.substring(7, i_31_), 385229451));
										i_30_ = (Class392.method4867(string_26_.substring(1 + i_31_), 525677989));
									}
									Class143[] class143s_32_ = (aClass2_2093.anInterface4_94.method38(aClass167_2101, i_29_, 635066169));
									if (class143s_32_ != null) {
										int i_33_ = Math.min(class143s_32_[i_30_].method1785(), ((aClass2_2093.anInt92 * 1780869003) + (-1214764847 * (aClass2_2093.anInt91))));
										if (-16777216 == (177401017 * anInt2104 & ~0xffffff))
											class143s_32_[i_30_].method1729(i, ((aClass2_2093.anInt90 * -206496891) + (2 + i_18_) - i_33_), 1, -1, 1);
										else
											class143s_32_[i_30_].method1729(i, ((-206496891 * aClass2_2093.anInt90) + (2 + i_18_) - i_33_), 0, (anInt2104 * 177401017 & ~0xffffff) | 0xffffff, 1);
										i += class143s_32_[i_30_].method12();
									}
									i_23_ = -1;
								} catch (Exception exception) {
									/* empty */
								}
							}
						} else
							method2759(string_26_, -2001173339);
						continue;
					}
				}
				if (-1 == i_22_) {
					if (-1 != i_23_)
						i += aClass2_2093.method528(i_23_, c, (byte) 77);
					if (32 != c) {
						if (null == class161) {
							if ((-123808587 * anInt2102 & ~0xffffff) != 0)
								method2755(c, 1 + i, 1 + i_18_, anInt2102 * -123808587, true);
							method2755(c, i, i_18_, 177401017 * anInt2104, false);
						} else {
							if ((anInt2102 * -123808587 & ~0xffffff) != 0)
								method2751(c, i + 1, i_18_ + 1, anInt2102 * -123808587, true, class161, i_19_, i_20_);
							method2751(c, i, i_18_, anInt2104 * 177401017, false, class161, i_19_, i_20_);
						}
					} else if (anInt2103 * 1521459555 > 0) {
						anInt2105 += anInt2103 * -771871983;
						i += anInt2105 * -1540735693 >> 8;
						anInt2105 = 1124861435 * (-1540735693 * anInt2105 & 0xff);
					}
					int i_34_ = aClass2_2093.method529(c, -1391957696);
					if (-1 != -509157329 * anInt2097)
						aClass167_2101.method2059(i, (int) ((double) (-206496891 * aClass2_2093.anInt90) * 0.7) + i_18_, i_34_, anInt2097 * -509157329, -1399442393);
					if (-1 != anInt2098 * -1136960397)
						aClass167_2101.method2059(i, i_18_ + -206496891 * aClass2_2093.anInt90 + 1, i_34_, -1136960397 * anInt2098, -1399442393);
					i += i_34_;
					i_23_ = c;
				}
			}
		}
	}

	public void method2741(String string, int i, int i_35_, int i_36_, int i_37_, int i_38_) {
		if (null != string) {
			method2750(i_36_, i_37_, -1506975189);
			method2740(string, i - aClass2_2093.method530(string, (byte) -81), i_35_, null, null, null, 0, 0, (byte) 4);
		}
	}

	public void method2742(String string, int i, int i_39_, int i_40_, int i_41_, byte i_42_) {
		if (null != string) {
			method2750(i_40_, i_41_, -1506975189);
			method2740(string, i - aClass2_2093.method530(string, (byte) -68) / 2, i_39_, null, null, null, 0, 0, (byte) 4);
		}
	}

	public int method2743(String string, int i, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, Class143[] class143s, int[] is, Class161 class161, int i_51_, int i_52_, int i_53_) {
		return method2744(string, i, i_43_, i_44_, i_45_, i_46_, i_47_, i_48_, i_49_, i_50_, 0, class143s, is, class161, i_51_, i_52_, -426754560);
	}

	public int method2744(String string, int i, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, Class143[] class143s, int[] is, Class161 class161, int i_63_, int i_64_, int i_65_) {
		if (string == null)
			return 0;
		method2750(i_57_, i_58_, -1506975189);
		if (i_61_ == 0)
			i_61_ = aClass2_2093.anInt90 * -206496891;
		int[] is_66_;
		if (i_56_ < i_61_ + (1780869003 * aClass2_2093.anInt92 + -1214764847 * aClass2_2093.anInt91) && i_56_ < i_61_ + i_61_)
			is_66_ = null;
		else
			is_66_ = new int[] { i_55_ };
		int i_67_ = aClass2_2093.method533(string, is_66_, aStringArray2094, class143s, (byte) 84);
		if (-1 == i_62_) {
			i_62_ = i_56_ / i_61_;
			if (i_62_ <= 0)
				i_62_ = 1;
		}
		if (i_62_ > 0 && i_67_ >= i_62_) {
			aStringArray2094[i_62_ - 1] = aClass2_2093.method532(aStringArray2094[i_62_ - 1], i_55_, class143s, 1443009416);
			i_67_ = i_62_;
		}
		if (3 == i_60_ && i_67_ == 1)
			i_60_ = 1;
		int i_68_;
		if (i_60_ == 0)
			i_68_ = i_54_ + aClass2_2093.anInt91 * -1214764847;
		else if (1 == i_60_)
			i_68_ = (-1214764847 * aClass2_2093.anInt91 + i_54_ + (i_56_ - -1214764847 * aClass2_2093.anInt91 - 1780869003 * aClass2_2093.anInt92 - (i_67_ - 1) * i_61_) / 2);
		else if (2 == i_60_)
			i_68_ = (i_54_ + i_56_ - 1780869003 * aClass2_2093.anInt92 - i_61_ * (i_67_ - 1));
		else {
			int i_69_ = ((i_56_ - aClass2_2093.anInt91 * -1214764847 - 1780869003 * aClass2_2093.anInt92 - i_61_ * (i_67_ - 1)) / (i_67_ + 1));
			if (i_69_ < 0)
				i_69_ = 0;
			i_68_ = -1214764847 * aClass2_2093.anInt91 + i_54_ + i_69_;
			i_61_ += i_69_;
		}
		for (int i_70_ = 0; i_70_ < i_67_; i_70_++) {
			if (i_59_ == 0)
				method2740(aStringArray2094[i_70_], i, i_68_, class143s, is, class161, i_63_, i_64_, (byte) 4);
			else if (1 == i_59_)
				method2740(aStringArray2094[i_70_], i + (i_55_ - aClass2_2093.method530((aStringArray2094[i_70_]), (byte) -16)) / 2, i_68_, class143s, is, class161, i_63_, i_64_, (byte) 4);
			else if (i_59_ == 2)
				method2740(aStringArray2094[i_70_], (i_55_ + i - aClass2_2093.method530(aStringArray2094[i_70_], (byte) -16)), i_68_, class143s, is, class161, i_63_, i_64_, (byte) 4);
			else if (i_67_ - 1 == i_70_)
				method2740(aStringArray2094[i_70_], i, i_68_, class143s, is, class161, i_63_, i_64_, (byte) 4);
			else {
				method2754(aStringArray2094[i_70_], i_55_, (byte) -51);
				method2740(aStringArray2094[i_70_], i, i_68_, class143s, is, class161, i_63_, i_64_, (byte) 4);
				anInt2103 = 0;
			}
			i_68_ += i_61_;
		}
		return i_67_;
	}

	public void method2745(String string, int i, int i_71_, int i_72_, int i_73_, int i_74_, byte i_75_) {
		if (null != string) {
			method2750(i_72_, i_73_, -1506975189);
			int i_76_ = string.length();
			int[] is = new int[i_76_];
			for (int i_77_ = 0; i_77_ < i_76_; i_77_++)
				is[i_77_] = (int) (Math.sin((double) i_74_ / 5.0 + (double) i_77_ / 2.0) * 5.0);
			method2758(string, i - aClass2_2093.method530(string, (byte) -15) / 2, i_71_, null, null, null, is, -172887483);
		}
	}

	public void method2746(String string, int i, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_) {
		if (null != string) {
			method2750(i_79_, i_80_, -1506975189);
			int i_83_ = string.length();
			int[] is = new int[i_83_];
			int[] is_84_ = new int[i_83_];
			for (int i_85_ = 0; i_85_ < i_83_; i_85_++) {
				is[i_85_] = (int) (Math.sin((double) i_85_ / 5.0 + (double) i_81_ / 5.0) * 5.0);
				is_84_[i_85_] = (int) (Math.sin((double) i_81_ / 5.0 + (double) i_85_ / 3.0) * 5.0);
			}
			method2758(string, i - aClass2_2093.method530(string, (byte) -11) / 2, i_78_, null, null, is, is_84_, -1130189267);
		}
	}

	public void method2747(String string, int i, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_, byte i_91_) {
		if (string != null) {
			method2750(i_87_, i_88_, -1506975189);
			double d = 7.0 - (double) i_90_ / 8.0;
			if (d < 0.0)
				d = 0.0;
			int i_92_ = string.length();
			int[] is = new int[i_92_];
			for (int i_93_ = 0; i_93_ < i_92_; i_93_++)
				is[i_93_] = (int) (Math.sin((double) i_89_ / 1.0 + (double) i_93_ / 1.5) * d);
			method2758(string, i - aClass2_2093.method530(string, (byte) -101) / 2, i_86_, null, null, null, is, 350749118);
		}
	}

	public int method2748(String string, int i, int i_94_, int i_95_, int i_96_, Random random, int i_97_, Class143[] class143s, int[] is, int i_98_) {
		if (string == null)
			return 0;
		random.setSeed((long) i_97_);
		int i_99_ = 192 + (random.nextInt() & 0x1f);
		method2750(i_99_ << 24 | i_95_ & 0xffffff, i_99_ << 24 | i_96_ & 0xffffff, -1506975189);
		int i_100_ = string.length();
		int[] is_101_ = new int[i_100_];
		int i_102_ = 0;
		for (int i_103_ = 0; i_103_ < i_100_; i_103_++) {
			is_101_[i_103_] = i_102_;
			if ((random.nextInt() & 0x3) == 0)
				i_102_++;
		}
		method2758(string, i, i_94_, class143s, is, is_101_, null, -519123975);
		return i_102_;
	}

	abstract void method2749(char c, int i, int i_104_, int i_105_, boolean bool, Class161 class161, int i_106_, int i_107_);

	void method2750(int i, int i_108_, int i_109_) {
		anInt2097 = -27420367;
		anInt2098 = 30889797;
		anInt2104 = (anInt2099 = 1946502799 * i) * -868242841;
		anInt2103 = 0;
		anInt2105 = 0;
		if (i_108_ == -1)
			i_108_ = 0;
		anInt2102 = (anInt2100 = i_108_ * -243932123) * -1149842919;
	}

	abstract void method2751(char c, int i, int i_110_, int i_111_, boolean bool, Class161 class161, int i_112_, int i_113_);

	abstract void method2752(char c, int i, int i_114_, int i_115_, boolean bool, Class161 class161, int i_116_, int i_117_);

	abstract void method2753(char c, int i, int i_118_, int i_119_, boolean bool);

	void method2754(String string, int i, byte i_120_) {
		int i_121_ = 0;
		boolean bool = false;
		for (int i_122_ = 0; i_122_ < string.length(); i_122_++) {
			char c = string.charAt(i_122_);
			if (c == '<')
				bool = true;
			else if ('>' == c)
				bool = false;
			else if (!bool && ' ' == c)
				i_121_++;
		}
		if (i_121_ > 0)
			anInt2103 = ((i - aClass2_2093.method530(string, (byte) 1) << 8) / i_121_ * 296675403);
	}

	abstract void method2755(char c, int i, int i_123_, int i_124_, boolean bool);

	abstract void method2756(char c, int i, int i_125_, int i_126_, boolean bool, Class161 class161, int i_127_, int i_128_);

	abstract void method2757(char c, int i, int i_129_, int i_130_, boolean bool, Class161 class161, int i_131_, int i_132_);

	Class184(Class167 class167, Class2 class2) {
		aClass167_2101 = class167;
		aClass2_2093 = class2;
	}

	void method2758(String string, int i, int i_133_, Class143[] class143s, int[] is, int[] is_134_, int[] is_135_, int i_136_) {
		i_133_ -= aClass2_2093.anInt90 * -206496891;
		int i_137_ = -1;
		int i_138_ = -1;
		int i_139_ = 0;
		int i_140_ = string.length();
		for (int i_141_ = 0; i_141_ < i_140_; i_141_++) {
			char c = (char) (Class543.method6581(string.charAt(i_141_), -5823823) & 0xff);
			if (c == 60)
				i_137_ = i_141_;
			else {
				if (62 == c && -1 != i_137_) {
					String string_142_ = string.substring(i_137_ + 1, i_141_);
					i_137_ = -1;
					if (string_142_.equals("lt"))
						c = '<';
					else if (string_142_.equals("gt"))
						c = '>';
					else if (string_142_.equals("nbsp"))
						c = '\u00a0';
					else if (string_142_.equals("shy"))
						c = '\u00ad';
					else if (string_142_.equals("times"))
						c = '\u00d7';
					else if (string_142_.equals("euro"))
						c = '\u0080';
					else if (string_142_.equals("copy"))
						c = '\u00a9';
					else if (string_142_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_142_.startsWith("img=")) {
							try {
								int i_143_;
								if (null != is_134_)
									i_143_ = is_134_[i_139_];
								else
									i_143_ = 0;
								int i_144_;
								if (null != is_135_)
									i_144_ = is_135_[i_139_];
								else
									i_144_ = 0;
								i_139_++;
								int i_145_ = Class392.method4867(string_142_.substring(4), 1339966169);
								Class143 class143 = class143s[i_145_];
								int i_146_ = (null != is ? is[i_145_] : class143.method1785());
								class143.method1729(i_143_ + i, (i_133_ + (aClass2_2093.anInt90 * -206496891) - i_146_ + i_144_), 1, -1, 1);
								i += class143s[i_145_].method12();
								i_138_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else if (string_142_.startsWith("sprite=")) {
							if (aClass2_2093.anInterface4_94 != null) {
								try {
									int i_147_ = -1;
									int i_148_ = 0;
									int i_149_ = string_142_.indexOf(',');
									if (-1 == i_149_)
										i_147_ = (Class392.method4867(string_142_.substring(7), -1877457447));
									else {
										i_147_ = (Class392.method4867(string_142_.substring(7, i_149_), -1058460555));
										i_148_ = (Class392.method4867(string_142_.substring(1 + i_149_), -1356636301));
									}
									int i_150_;
									if (is_134_ != null)
										i_150_ = is_134_[i_139_];
									else
										i_150_ = 0;
									int i_151_;
									if (is_135_ != null)
										i_151_ = is_135_[i_139_];
									else
										i_151_ = 0;
									i_139_++;
									Class143[] class143s_152_ = (aClass2_2093.anInterface4_94.method38(aClass167_2101, i_147_, -570778620));
									if (class143s_152_ != null) {
										int i_153_ = Math.min(class143s_152_[i_148_].method1785(), ((aClass2_2093.anInt92 * 1780869003) + (-1214764847 * (aClass2_2093.anInt91))));
										class143s_152_[i_148_].method1729(i + i_150_, (i_133_ + 3 + (aClass2_2093.anInt90 * -206496891) - i_153_ + i_151_), 1, -1, 1);
										i += class143s_152_[i_148_].method12();
									}
									i_138_ = -1;
								} catch (Exception exception) {
									/* empty */
								}
							}
						} else
							method2759(string_142_, -144567768);
						continue;
					}
				}
				if (-1 == i_137_) {
					if (i_138_ != -1)
						i += aClass2_2093.method528(i_138_, c, (byte) 26);
					int i_154_;
					if (is_134_ != null)
						i_154_ = is_134_[i_139_];
					else
						i_154_ = 0;
					int i_155_;
					if (null != is_135_)
						i_155_ = is_135_[i_139_];
					else
						i_155_ = 0;
					i_139_++;
					if (c != 32) {
						if ((-123808587 * anInt2102 & ~0xffffff) != 0)
							method2755(c, i_154_ + (1 + i), i_155_ + (i_133_ + 1), anInt2102 * -123808587, true);
						method2755(c, i + i_154_, i_133_ + i_155_, anInt2104 * 177401017, false);
					} else if (1521459555 * anInt2103 > 0) {
						anInt2105 += -771871983 * anInt2103;
						i += anInt2105 * -1540735693 >> 8;
						anInt2105 = 1124861435 * (anInt2105 * -1540735693 & 0xff);
					}
					int i_156_ = aClass2_2093.method529(c, -1307101126);
					if (anInt2097 * -509157329 != -1)
						aClass167_2101.method2059(i, i_133_ + (int) ((double) (aClass2_2093.anInt90 * -206496891) * 0.7), i_156_, -509157329 * anInt2097, -1399442393);
					if (-1 != anInt2098 * -1136960397)
						aClass167_2101.method2059(i, -206496891 * aClass2_2093.anInt90 + i_133_, i_156_, anInt2098 * -1136960397, -1399442393);
					i += i_156_;
					i_138_ = c;
				}
			}
		}
	}

	void method2759(String string, int i) {
		try {
			if (string.startsWith("col="))
				anInt2104 = ((anInt2104 * 177401017 & ~0xffffff | Class508.method6178(string.substring(4), 16, -1113382872) & 0xffffff) * -2144642679);
			else if (string.equals("/col"))
				anInt2104 = (anInt2104 * 177401017 & ~0xffffff | anInt2099 * 2144802927 & 0xffffff) * -2144642679;
			if (string.startsWith("argb="))
				anInt2104 = Class508.method6178(string.substring(5), 16, -1113382872) * -2144642679;
			else if (string.equals("/argb"))
				anInt2104 = anInt2099 * -868242841;
			else if (string.startsWith("str="))
				anInt2097 = (anInt2104 * 177401017 & ~0xffffff | Class508.method6178(string.substring(4), 16, -1113382872)) * 27420367;
			else if (string.equals("str"))
				anInt2097 = ((177401017 * anInt2104 & ~0xffffff | 0x800000) * 27420367);
			else if (string.equals("/str"))
				anInt2097 = -27420367;
			else if (string.startsWith("u="))
				anInt2098 = (177401017 * anInt2104 & ~0xffffff | Class508.method6178(string.substring(2), 16, -1113382872)) * -30889797;
			else if (string.equals("u"))
				anInt2098 = -30889797 * (177401017 * anInt2104 & ~0xffffff);
			else if (string.equals("/u"))
				anInt2098 = 30889797;
			else if (string.equalsIgnoreCase("shad=-1"))
				anInt2102 = 0;
			else if (string.startsWith("shad="))
				anInt2102 = (anInt2104 * 177401017 & ~0xffffff | Class508.method6178(string.substring(5), 16, -1113382872)) * -896108131;
			else if (string.equals("shad"))
				anInt2102 = -896108131 * (anInt2104 * 177401017 & ~0xffffff);
			else if (string.equals("/shad"))
				anInt2102 = -1149842919 * anInt2100;
			else if (string.equals("br"))
				method2750(2144802927 * anInt2099, -574122067 * anInt2100, -1506975189);
		} catch (Exception exception) {
			/* empty */
		}
	}

	static {
		anInt2100 = 0;
		anInt2102 = 0;
		anInt2103 = 0;
		anInt2105 = 0;
		aStringArray2094 = new String[100];
	}

	void method2760(int i, int i_157_) {
		anInt2097 = -27420367;
		anInt2098 = 30889797;
		anInt2104 = (anInt2099 = 1946502799 * i) * -868242841;
		anInt2103 = 0;
		anInt2105 = 0;
		if (i_157_ == -1)
			i_157_ = 0;
		anInt2102 = (anInt2100 = i_157_ * -243932123) * -1149842919;
	}

	void method2761(int i, int i_158_) {
		anInt2097 = -27420367;
		anInt2098 = 30889797;
		anInt2104 = (anInt2099 = 1946502799 * i) * -868242841;
		anInt2103 = 0;
		anInt2105 = 0;
		if (i_158_ == -1)
			i_158_ = 0;
		anInt2102 = (anInt2100 = i_158_ * -243932123) * -1149842919;
	}

	abstract void method2762(char c, int i, int i_159_, int i_160_, boolean bool);

	public void method2763(String string, int i, int i_161_, int i_162_, int i_163_, byte i_164_) {
		if (null != string) {
			method2750(i_162_, i_163_, -1506975189);
			method2740(string, i, i_161_, null, null, null, 0, 0, (byte) 4);
		}
	}

	public static final boolean method2764(String string, String string_165_, String string_166_, String string_167_, int i) {
		if (string == null || null == string_166_)
			return false;
		if (string.startsWith("#") || string_166_.startsWith("#"))
			return string.equals(string_166_);
		return string_165_.equals(string_167_);
	}

	static final void method2765(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class153.method1867(class251, class668, (byte) -28);
	}

	static final void method2766(Class668 class668, int i) {
		int i_168_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (-1 == i_168_)
			Class710.aClass536_Sub40_8843.method9857(Class710.aClass536_Sub40_8843.aClass710_Sub5_10761, Class710.aClass536_Sub40_8843.aClass710_Sub5_10760.method9916(1753449855), (byte) 1);
		else
			Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub5_10761), i_168_, (byte) 1);
		Class85.method1188(1014953755);
	}

	static final void method2767(int i, int i_169_, int i_170_, int i_171_, int i_172_, int i_173_, int i_174_) {
		int i_175_ = Class95.anInt1156 * -1482773169;
		int[] is = Class95.anIntArray1157;
		client.anInt11252 = 0;
		int i_176_;
		if (client.anInt11074 * 1542697723 == 4)
			i_176_ = Class193.aClass189Array2180.length;
		else
			i_176_ = i_175_ + client.anInt11053 * -664631943;
		for (int i_177_ = 0; i_177_ < i_176_; i_177_++) {
			Class296 class296 = null;
			Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1;
			if (1542697723 * client.anInt11074 == 4) {
				Class189 class189 = Class193.aClass189Array2180[i_177_];
				if (!class189.aBool2141)
					continue;
				class649_sub1_sub5_sub1 = class189.method2804(-50208494);
				if (client.anInt11127 * 648319383 != class649_sub1_sub5_sub1.anInt11943 * -522234003)
					continue;
				if (class189.anInt2140 * 329594177 >= 0) {
					class296 = ((Class649_Sub1_Sub5_Sub1_Sub1) class649_sub1_sub5_sub1).aClass296_12174;
					if (null != class296.anIntArray3304) {
						class296 = class296.method3984(Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, (byte) -96);
						if (class296 == null)
							continue;
					}
				}
			} else {
				if (i_177_ < i_175_)
					class649_sub1_sub5_sub1 = (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i_177_]]);
				else {
					class649_sub1_sub5_sub1 = ((Class649_Sub1_Sub5_Sub1) (((Class536_Sub13) (client.aClass4_11050.method556((long) client.anIntArray11211[i_177_ - i_175_]))).anObject10468));
					class296 = ((Class649_Sub1_Sub5_Sub1_Sub1) class649_sub1_sub5_sub1).aClass296_12174;
					if (null != class296.anIntArray3304) {
						class296 = class296.method3984(Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, (byte) -95);
						if (null == class296)
							continue;
					}
				}
				if (1272934333 * class649_sub1_sub5_sub1.anInt11905 < 0 || ((-522234003 * class649_sub1_sub5_sub1.anInt11943 != 648319383 * client.anInt11127) && (class649_sub1_sub5_sub1.aByte10839 != (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839))))
					continue;
			}
			Class384.method4836(class649_sub1_sub5_sub1, class649_sub1_sub5_sub1.method9953(27442457), false, 985523942);
			if (!(client.aFloatArray11133[0] < 0.0F)) {
				if (class649_sub1_sub5_sub1.method10865(-313829762)) {
					Class533 class533 = class649_sub1_sub5_sub1.method10880(-348930154);
					if (class533 != null && (-1006517265 * client.anInt11252 < -1712931327 * client.anInt11061)) {
						String string = class533.method6448(100873648);
						if (Class613.aClass263_8014.method3644((byte) 96))
							string = Class613.aClass263_8014.method3649(string, -2108069310);
						client.anIntArray11256[-1006517265 * client.anInt11252] = Class260.aClass2_2840.method530(string, (byte) -29) / 2;
						client.anIntArray11254[client.anInt11252 * -1006517265] = (int) client.aFloatArray11133[0];
						client.anIntArray11258[-1006517265 * client.anInt11252] = (int) client.aFloatArray11133[1];
						client.aClass533Array11257[(-1006517265 * client.anInt11252)] = class533;
						client.anInt11252 += -940979441;
					}
				}
				int i_178_ = (int) ((float) i_169_ + client.aFloatArray11133[1]);
				i_178_ -= Class260.aClass2_2840.anInt91 * -1214764847;
				boolean bool = false;
				if (!class649_sub1_sub5_sub1.aBool11894 && !class649_sub1_sub5_sub1.aClass695_11910.method8221(1360139595)) {
					for (Class521_Sub1 class521_sub1 = (Class521_Sub1) class649_sub1_sub5_sub1.aClass695_11910.method8210(-2027281550); null != class521_sub1; class521_sub1 = (Class521_Sub1) class649_sub1_sub5_sub1.aClass695_11910.method8219(1355000488)) {
						Class521_Sub3 class521_sub3 = class521_sub1.method9328(client.anInt11014, 124386538);
						if (null != class521_sub3) {
							Class546 class546 = class521_sub1.aClass546_10293;
							Player class649_sub1_sub5_sub1_sub2 = (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i_177_]]);
							Class143 class143;
							Class143 class143_179_;
							if (null != class649_sub1_sub5_sub1_sub2 && ((class649_sub1_sub5_sub1_sub2.aClass210_12200) != Class210.aClass210_2258)) {
								if (Class210.aClass210_2259 == (class649_sub1_sub5_sub1_sub2.aClass210_12200)) {
									class143 = (class546.method6614(Class677.aClass167_8609, class546.anInt7288 * -1794801113, 2000704741));
									class143_179_ = (class546.method6614(Class677.aClass167_8609, class546.anInt7280 * 1090904519, 2000704741));
								} else {
									class143 = (class546.method6614(Class677.aClass167_8609, class546.anInt7282 * 1594042231, 2000704741));
									class143_179_ = (class546.method6614(Class677.aClass167_8609, -1222862513 * class546.anInt7289, 2000704741));
								}
							} else {
								class143 = class546.method6614((Class677.aClass167_8609), (1922671995 * (class546.anInt7286)), 2000704741);
								class143_179_ = class546.method6614((Class677.aClass167_8609), (948522675 * (class546.anInt7285)), 2000704741);
							}
							if (null != class143 && null != class143_179_) {
								int i_180_ = 255;
								int i_181_ = -1;
								int i_182_ = (client.anInt11014 - (-1602943443 * class521_sub3.anInt10296));
								int i_183_ = (class143_179_.method1720() * (class521_sub3.anInt10298 * 889573765) / 255);
								if (1153557387 * class521_sub3.anInt10299 > i_182_) {
									int i_184_ = (0 == 722723653 * class546.anInt7283 ? 0 : (i_182_ / (722723653 * class546.anInt7283) * (722723653 * class546.anInt7283)));
									int i_185_ = (class143_179_.method1720() * (class521_sub3.anInt10297 * -2051964923) / 255);
									i_181_ = (((i_183_ - i_185_) * i_184_ / (1153557387 * class521_sub3.anInt10299)) + i_185_);
								} else {
									i_181_ = i_183_;
									int i_186_ = (class546.anInt7284 * 1748392441 + (class521_sub3.anInt10299 * 1153557387) - i_182_);
									if (class546.anInt7281 * -2129215067 >= 0)
										i_180_ = ((i_186_ << 8) / ((class546.anInt7284 * 1748392441) - (class546.anInt7281 * -2129215067)));
								}
								if (class521_sub3.anInt10298 * 889573765 > 0 && i_181_ < 2)
									i_181_ = 2;
								int i_187_ = class143.method1752();
								int i_188_ = (int) ((float) i + client.aFloatArray11133[0] - (float) (class143.method1720() >> 1));
								i_178_ -= i_187_;
								if (i_180_ >= 0 && i_180_ < 255) {
									int i_189_ = i_180_ << 24;
									int i_190_ = i_189_ | 0xffffff;
									class143.method1729(i_188_, i_178_, 0, i_190_, 1);
									Class677.aClass167_8609.method2196(i_188_, i_178_, i_181_ + i_188_, i_187_ + i_178_);
									class143_179_.method1729(i_188_, i_178_, 0, i_190_, 1);
								} else {
									class143.method1728(i_188_, i_178_);
									Class677.aClass167_8609.method2196(i_188_, i_178_, i_181_ + i_188_, i_187_ + i_178_);
									class143_179_.method1728(i_188_, i_178_);
								}
								Class677.aClass167_8609.method2369(i, i_169_, i_170_ + i, (i_171_ + i_169_));
								i_178_ -= 2;
								bool = true;
							}
						} else if (class521_sub1.method9329(511314186))
							class521_sub1.method6354((byte) 45);
					}
				}
				if (!bool)
					i_178_ -= Class644.aClass628_8352.anInt8193 * 1823801087 + 2;
				if (!class649_sub1_sub5_sub1.aBool11894) {
					if (null == class296) {
						Player class649_sub1_sub5_sub1_sub2 = ((Player) class649_sub1_sub5_sub1);
						for (int i_191_ = 0; i_191_ < (class649_sub1_sub5_sub1_sub2.anIntArray12183).length; i_191_++) {
							if ((class649_sub1_sub5_sub1_sub2.anIntArray12183[i_191_]) >= 0) {
								Object object = null;
								int i_192_ = (class649_sub1_sub5_sub1_sub2.anIntArray12183[i_191_]);
								int i_193_ = (class649_sub1_sub5_sub1_sub2.anIntArray12179[i_191_]);
								long l = (long) (i_193_ << 8 | i_192_);
								Class143 class143 = ((Class143) client.aClass199_11045.method2886(l));
								if (null == class143) {
									Class179[] class179s = (Class181.method2720(Class398.aClass461_4122, i_193_, 0));
									if (null == class179s)
										continue;
									class143 = (Class677.aClass167_8609.method2082(class179s[i_192_], true));
									client.aClass199_11045.method2881(class143, l);
								}
								if (null != class143) {
									i_178_ -= class143.method1752();
									class143.method1728((int) ((float) i + client.aFloatArray11133[0] - 12.0F), i_178_);
									i_178_ -= 2;
								}
							}
						}
					} else {
						Class649_Sub1_Sub5_Sub1_Sub1 class649_sub1_sub5_sub1_sub1 = ((Class649_Sub1_Sub5_Sub1_Sub1) class649_sub1_sub5_sub1);
						int[] is_194_ = (null != (class649_sub1_sub5_sub1_sub1.aClass307_12167) ? (class649_sub1_sub5_sub1_sub1.aClass307_12167.anIntArray3453) : (class649_sub1_sub5_sub1_sub1.aClass296_12174.anIntArray3300));
						short[] is_195_ = ((class649_sub1_sub5_sub1_sub1.aClass307_12167 != null) ? (class649_sub1_sub5_sub1_sub1.aClass307_12167.aShortArray3452) : (class649_sub1_sub5_sub1_sub1.aClass296_12174.aShortArray3301));
						if (null != is_195_ && null != is_194_) {
							int i_196_ = 0;
							for (/**/; i_196_ < is_195_.length; i_196_++) {
								if (is_195_[i_196_] >= 0 && is_194_[i_196_] >= 0) {
									Object object = null;
									long l = (long) (is_194_[i_196_] << 8 | is_195_[i_196_]);
									Class143 class143 = (Class143) client.aClass199_11045.method2886(l);
									if (class143 == null) {
										Class179[] class179s = (Class181.method2720(Class398.aClass461_4122, is_194_[i_196_], 0));
										if (class179s == null)
											continue;
										class143 = (Class677.aClass167_8609.method2082(class179s[is_195_[i_196_]], true));
										client.aClass199_11045.method2881(class143, l);
									}
									if (class143 != null) {
										i_178_ -= class143.method1752();
										class143.method1728((int) (client.aFloatArray11133[0] + (float) i - (float) ((class143.method1720()) >> 1)), i_178_);
										i_178_ -= 2;
									}
								}
							}
						}
					}
				}
				if (class649_sub1_sub5_sub1 instanceof Player) {
					if (i_177_ >= 0) {
						int i_197_ = 0;
						Class103[] class103s = client.aClass103Array11020;
						for (int i_198_ = 0; i_198_ < class103s.length; i_198_++) {
							Class103 class103 = class103s[i_198_];
							if (class103 != null && class103.anInt1224 * 2030004867 == 10 && (is[i_177_] == class103.anInt1223 * 1298998125)) {
								Class143 class143 = (Class458_Sub5.aClass143Array10338[-1060879377 * class103.anInt1222]);
								if (class143.method1752() > i_197_)
									i_197_ = class143.method1752();
								class143.method1728((int) (client.aFloatArray11133[0] + (float) i - 12.0F), i_178_ - class143.method1752());
							}
						}
						if (i_197_ > 0)
							i_178_ -= 2 + i_197_;
					}
				} else {
					int i_199_ = 0;
					Class103[] class103s = client.aClass103Array11020;
					for (int i_200_ = 0; i_200_ < class103s.length; i_200_++) {
						Class103 class103 = class103s[i_200_];
						if (null != class103 && 2030004867 * class103.anInt1224 == 1 && (client.anIntArray11211[i_177_ - i_175_] == class103.anInt1223 * 1298998125)) {
							Class143 class143 = (Class458_Sub5.aClass143Array10338[class103.anInt1222 * -1060879377]);
							if (class143.method1752() > i_199_)
								i_199_ = class143.method1752();
							boolean bool_201_;
							if (0 == class103.anInt1230 * 954351267)
								bool_201_ = true;
							else {
								int i_202_ = (Class319_Sub1.method9134(-234700539) * 1000 / (class103.anInt1230 * 954351267) / 2);
								bool_201_ = (client.anInt11014 % (i_202_ * 2) < i_202_);
							}
							if (bool_201_)
								class143.method1728((int) (client.aFloatArray11133[0] + (float) i - 12.0F), i_178_ - class143.method1752());
						}
					}
					if (i_199_ > 0)
						i_178_ -= i_199_ + 2;
				}
				int i_203_ = 0;
				for (/**/; i_203_ < Class644.aClass628_8352.anInt8185 * -1964901131; i_203_++) {
					int i_204_ = class649_sub1_sub5_sub1.anIntArray11907[i_203_];
					int i_205_ = class649_sub1_sub5_sub1.anIntArray11941[i_203_];
					Class587 class587 = null;
					int i_206_ = 0;
					if (i_205_ >= 0) {
						if (i_204_ <= client.anInt11014)
							continue;
						class587 = (Class587) (Class524.aClass34_Sub10_7097.method70((class649_sub1_sub5_sub1.anIntArray11941[i_203_]), (byte) -93));
						i_206_ = class587.anInt7715 * 2071058317;
						if (null != class587 && null != class587.anIntArray7734) {
							class587 = class587.method7067((Class465_Sub1.aClass96_10352), (Class465_Sub1.aClass96_10352), -492765028);
							if (null == class587) {
								class649_sub1_sub5_sub1.anIntArray11907[i_203_] = -1;
								continue;
							}
						}
					} else if (i_204_ < 0)
						continue;
					int i_207_ = class649_sub1_sub5_sub1.anIntArray11932[i_203_];
					Class587 class587_208_ = null;
					if (i_207_ >= 0) {
						class587_208_ = (Class587) Class524.aClass34_Sub10_7097.method70(i_207_, (byte) 91);
						if (class587_208_ != null && class587_208_.anIntArray7734 != null)
							class587_208_ = class587_208_.method7067((Class465_Sub1.aClass96_10352), (Class465_Sub1.aClass96_10352), 1806942662);
					}
					if (i_204_ - i_206_ <= client.anInt11014) {
						if (class587 == null)
							class649_sub1_sub5_sub1.anIntArray11907[i_203_] = -1;
						else {
							int i_209_ = (class649_sub1_sub5_sub1.method9953(-183471114) / 2);
							Class384.method4836(class649_sub1_sub5_sub1, i_209_, false, 951336753);
							if (client.aFloatArray11133[0] > -1.0F) {
								client.aFloatArray11133[0] += (float) (Class644.aClass628_8352.anIntArray8220[i_203_]);
								client.aFloatArray11133[1] += (float) (Class644.aClass628_8352.anIntArray8187[i_203_]);
								Object object = null;
								Object object_210_ = null;
								Object object_211_ = null;
								Object object_212_ = null;
								int i_213_ = 0;
								int i_214_ = 0;
								int i_215_ = 0;
								int i_216_ = 0;
								int i_217_ = 0;
								int i_218_ = 0;
								int i_219_ = 0;
								int i_220_ = 0;
								Class143 class143 = null;
								Class143 class143_221_ = null;
								Class143 class143_222_ = null;
								Class143 class143_223_ = null;
								int i_224_ = 0;
								int i_225_ = 0;
								int i_226_ = 0;
								int i_227_ = 0;
								int i_228_ = 0;
								int i_229_ = 0;
								int i_230_ = 0;
								int i_231_ = 0;
								Class143 class143_232_ = class587.method7070((Class677.aClass167_8609), (byte) 0);
								if (null != class143_232_) {
									i_213_ = class143_232_.method1720();
									class143_232_.method1719(client.anIntArray11321);
									i_217_ = client.anIntArray11321[0];
								}
								Class143 class143_233_ = class587.method7074((Class677.aClass167_8609), -504292923);
								if (null != class143_233_) {
									i_214_ = class143_233_.method1720();
									class143_233_.method1719(client.anIntArray11321);
									i_218_ = client.anIntArray11321[0];
								}
								Class143 class143_234_ = class587.method7073((Class677.aClass167_8609), (byte) 35);
								if (class143_234_ != null) {
									i_215_ = class143_234_.method1720();
									class143_234_.method1719(client.anIntArray11321);
									i_219_ = client.anIntArray11321[0];
								}
								Class143 class143_235_ = class587.method7077((Class677.aClass167_8609), 92102565);
								if (null != class143_235_) {
									i_216_ = class143_235_.method1720();
									class143_235_.method1719(client.anIntArray11321);
									i_220_ = client.anIntArray11321[0];
								}
								if (class587_208_ != null) {
									class143 = (class587_208_.method7070(Class677.aClass167_8609, (byte) 0));
									if (null != class143) {
										i_224_ = class143.method1720();
										class143.method1719(client.anIntArray11321);
										i_228_ = client.anIntArray11321[0];
									}
									class143_221_ = (class587_208_.method7074(Class677.aClass167_8609, 454857777));
									if (null != class143_221_) {
										i_225_ = class143_221_.method1720();
										class143_221_.method1719(client.anIntArray11321);
										i_229_ = client.anIntArray11321[0];
									}
									class143_222_ = (class587_208_.method7073(Class677.aClass167_8609, (byte) -43));
									if (null != class143_222_) {
										i_226_ = class143_222_.method1720();
										class143_222_.method1719(client.anIntArray11321);
										i_230_ = client.anIntArray11321[0];
									}
									class143_223_ = (class587_208_.method7077(Class677.aClass167_8609, 1426915709));
									if (class143_223_ != null) {
										i_227_ = class143_223_.method1720();
										class143_223_.method1719(client.anIntArray11321);
										i_231_ = client.anIntArray11321[0];
									}
								}
								Class184 class184 = Class18.aClass184_190;
								Class184 class184_236_ = Class18.aClass184_190;
								Class2 class2 = Class556.aClass2_7510;
								Class2 class2_237_ = Class556.aClass2_7510;
								int i_238_ = class587.anInt7719 * -1272543053;
								if (i_238_ >= 0) {
									Class184 class184_239_ = ((Class184) (Class196.aClass410_2202.method4980(client.anInterface51_11196, i_238_, true, class587.aBool7718, (byte) -90)));
									Class2 class2_240_ = (Class196.aClass410_2202.method4981(client.anInterface51_11196, i_238_, -1256410488));
									if (class184_239_ != null && class2_240_ != null) {
										class184 = class184_239_;
										class2 = class2_240_;
									}
								}
								if (class587_208_ != null) {
									i_238_ = (-1272543053 * class587_208_.anInt7719);
									if (i_238_ >= 0) {
										Class184 class184_241_ = ((Class184) (Class196.aClass410_2202.method4980(client.anInterface51_11196, i_238_, true, class587_208_.aBool7718, (byte) 2)));
										Class2 class2_242_ = (Class196.aClass410_2202.method4981(client.anInterface51_11196, i_238_, 1303915736));
										if (class184_241_ != null && class2_242_ != null) {
											class184_236_ = class184_241_;
											class2_237_ = class2_242_;
										}
									}
								}
								Object object_243_ = null;
								String string = null;
								boolean bool_244_ = false;
								int i_245_ = 0;
								String string_246_ = (class587.method7069((class649_sub1_sub5_sub1.anIntArray11906[i_203_]), (byte) -24));
								int i_247_ = class2.method530(string_246_, (byte) 2);
								if (null != class587_208_) {
									string = (class587_208_.method7069((class649_sub1_sub5_sub1.anIntArray11909[i_203_]), (byte) 16));
									i_245_ = class2_237_.method530(string, (byte) -96);
								}
								int i_248_ = 0;
								int i_249_ = 0;
								if (i_214_ > 0)
									i_248_ = i_247_ / i_214_ + 1;
								if (null != class587_208_ && i_225_ > 0)
									i_249_ = i_245_ / i_225_ + 1;
								int i_250_ = 0;
								int i_251_ = i_250_;
								if (i_213_ > 0)
									i_250_ += i_213_;
								i_250_ += 2;
								int i_252_ = i_250_;
								if (i_215_ > 0)
									i_250_ += i_215_;
								int i_253_ = i_250_;
								int i_254_ = i_250_;
								if (i_214_ > 0) {
									int i_255_ = i_214_ * i_248_;
									i_250_ += i_255_;
									i_254_ += (i_255_ - i_247_) / 2;
								} else
									i_250_ += i_247_;
								int i_256_ = i_250_;
								if (i_216_ > 0)
									i_250_ += i_216_;
								int i_257_ = 0;
								int i_258_ = 0;
								int i_259_ = 0;
								int i_260_ = 0;
								int i_261_ = 0;
								if (class587_208_ != null) {
									i_250_ += 2;
									i_257_ = i_250_;
									if (i_224_ > 0)
										i_250_ += i_224_;
									i_250_ += 2;
									i_258_ = i_250_;
									if (i_226_ > 0)
										i_250_ += i_226_;
									i_259_ = i_250_;
									i_261_ = i_250_;
									if (i_225_ > 0) {
										int i_262_ = i_249_ * i_225_;
										i_250_ += i_262_;
										i_261_ += (i_262_ - i_245_) / 2;
									} else
										i_250_ += i_245_;
									i_260_ = i_250_;
									if (i_227_ > 0)
										i_250_ += i_227_;
								}
								int i_263_ = ((class649_sub1_sub5_sub1.anIntArray11907[i_203_]) - client.anInt11014);
								int i_264_ = (1387402249 * class587.anInt7731 - (i_263_ * (class587.anInt7731 * 1387402249) / (class587.anInt7715 * 2071058317)));
								int i_265_ = ((i_263_ * (class587.anInt7727 * 533510607) / (2071058317 * class587.anInt7715)) + -(class587.anInt7727 * 533510607));
								int i_266_ = (int) (client.aFloatArray11133[0] + (float) i - (float) (i_250_ >> 1) + (float) i_264_);
								int i_267_ = (int) ((float) i_265_ + ((float) i_169_ + client.aFloatArray11133[1] - 12.0F));
								int i_268_ = (15 + i_267_ + 758479323 * class587.anInt7733);
								int i_269_ = 0;
								if (null != class587_208_)
									i_269_ = (758479323 * class587_208_.anInt7733 + (i_267_ + 15));
								int i_270_ = 255;
								if (201002209 * class587.anInt7735 >= 0)
									i_270_ = ((i_263_ << 8) / (2071058317 * class587.anInt7715 - (201002209 * class587.anInt7735)));
								if (i_270_ >= 0 && i_270_ < 255) {
									int i_271_ = i_270_ << 24;
									int i_272_ = i_271_ | 0xffffff;
									if (null != class143_232_)
										class143_232_.method1729((i_266_ + i_251_ - i_217_), i_267_, 0, i_272_, 1);
									if (class143_234_ != null)
										class143_234_.method1729((499533787 * class587.anInt7732 + (i_252_ + i_266_ - i_219_)), (-537581303 * class587.anInt7714 + i_267_), 0, i_272_, 1);
									if (class143_233_ != null) {
										for (int i_273_ = 0; i_273_ < i_248_; i_273_++)
											class143_233_.method1729(((class587.anInt7732 * 499533787) + (i_266_ + i_253_ - i_218_ + i_273_ * i_214_)), i_267_ + (class587.anInt7714 * -537581303), 0, i_272_, 1);
									}
									if (null != class143_235_)
										class143_235_.method1729((i_256_ + i_266_ - i_220_ + (499533787 * class587.anInt7732)), i_267_ + (class587.anInt7714 * -537581303), 0, i_272_, 1);
									class184.method2763(string_246_, i_254_ + i_266_, i_268_, ((706730403 * class587.anInt7711) | i_271_), 0, (byte) -54);
									if (null != class587_208_) {
										if (null != class143)
											class143.method1729((i_266_ + i_257_ - i_228_), i_267_, 0, i_272_, 1);
										if (class143_222_ != null)
											class143_222_.method1729((i_258_ + i_266_ - i_230_ + (class587_208_.anInt7732 * 499533787)), ((-537581303 * class587_208_.anInt7714) + i_267_), 0, i_272_, 1);
										if (null != class143_221_) {
											for (int i_274_ = 0; i_274_ < i_249_; i_274_++)
												class143_221_.method1729(((class587_208_.anInt7732 * 499533787) + (i_266_ + i_259_ - i_229_ + i_225_ * i_274_)), i_267_ + ((class587_208_.anInt7714) * -537581303), 0, i_272_, 1);
										}
										if (null != class143_223_)
											class143_223_.method1729((i_260_ + i_266_ - i_231_ + 499533787 * (class587_208_.anInt7732)), (i_267_ + -537581303 * (class587_208_.anInt7714)), 0, i_272_, 1);
										class184_236_.method2763(string, i_266_ + i_261_, i_269_, (class587_208_.anInt7711 * 706730403) | i_271_, 0, (byte) -108);
									}
								} else {
									if (class143_232_ != null)
										class143_232_.method1728((i_266_ + i_251_ - i_217_), i_267_);
									if (class143_234_ != null)
										class143_234_.method1728((i_252_ + i_266_ - i_219_ + (class587.anInt7732 * 499533787)), (-537581303 * class587.anInt7714 + i_267_));
									if (null != class143_233_) {
										for (int i_275_ = 0; i_275_ < i_248_; i_275_++)
											class143_233_.method1728(((class587.anInt7732 * 499533787) + (i_214_ * i_275_ + (i_253_ + i_266_ - i_218_))), ((-537581303 * class587.anInt7714) + i_267_));
									}
									if (null != class143_235_)
										class143_235_.method1728((499533787 * class587.anInt7732 + (i_256_ + i_266_ - i_220_)), (-537581303 * class587.anInt7714 + i_267_));
									class184.method2763(string_246_, i_266_ + i_254_, i_268_, ((class587.anInt7711 * 706730403) | ~0xffffff), 0, (byte) -56);
									if (class587_208_ != null) {
										if (class143 != null)
											class143.method1728((i_266_ + i_257_ - i_228_), i_267_);
										if (null != class143_222_)
											class143_222_.method1728(((class587_208_.anInt7732 * 499533787) + (i_266_ + i_258_ - i_230_)), (class587_208_.anInt7714 * -537581303) + i_267_);
										if (class143_221_ != null) {
											for (int i_276_ = 0; i_276_ < i_249_; i_276_++)
												class143_221_.method1728(((class587_208_.anInt7732 * 499533787) + (i_276_ * i_225_ + (i_259_ + i_266_ - i_229_))), (class587_208_.anInt7714 * -537581303) + i_267_);
										}
										if (null != class143_223_)
											class143_223_.method1728(((class587_208_.anInt7732 * 499533787) + (i_266_ + i_260_ - i_231_)), ((-537581303 * class587_208_.anInt7714) + i_267_));
										class184_236_.method2763(string, i_266_ + i_261_, i_269_, (class587_208_.anInt7711 * 706730403) | ~0xffffff, 0, (byte) -60);
									}
								}
							}
						}
					}
				}
			}
		}
		for (int i_277_ = 0; i_277_ < client.anInt11261 * 1973460815; i_277_++) {
			int i_278_ = client.anIntArray11128[i_277_];
			Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1;
			if (i_278_ < 2048)
				class649_sub1_sub5_sub1 = client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i_278_];
			else
				class649_sub1_sub5_sub1 = ((Class649_Sub1_Sub5_Sub1) (((Class536_Sub13) client.aClass4_11050.method556((long) (i_278_ - 2048))).anObject10468));
			int i_279_ = client.anIntArray11129[i_277_];
			Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1_280_;
			if (i_279_ < 2048)
				class649_sub1_sub5_sub1_280_ = client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i_279_];
			else
				class649_sub1_sub5_sub1_280_ = ((Class649_Sub1_Sub5_Sub1) (((Class536_Sub13) client.aClass4_11050.method556((long) (i_279_ - 2048))).anObject10468));
			Class206.method2962(class649_sub1_sub5_sub1, class649_sub1_sub5_sub1_280_, (class649_sub1_sub5_sub1.anInt11896 -= -2104510915) * -1991503595, i, i_169_, i_170_, i_171_, i_172_, i_173_, 355273862);
		}
		int i_281_ = 2 + (1780869003 * Class260.aClass2_2840.anInt92 + Class260.aClass2_2840.anInt91 * -1214764847);
		for (int i_282_ = 0; i_282_ < -1006517265 * client.anInt11252; i_282_++) {
			int i_283_ = client.anIntArray11254[i_282_];
			int i_284_ = client.anIntArray11258[i_282_];
			int i_285_ = client.anIntArray11256[i_282_];
			boolean bool = true;
			while (bool) {
				bool = false;
				for (int i_286_ = 0; i_286_ < i_282_; i_286_++) {
					if (2 + i_284_ > client.anIntArray11258[i_286_] - i_281_ && i_284_ - i_281_ < client.anIntArray11258[i_286_] + 2 && i_283_ - i_285_ < (client.anIntArray11256[i_286_] + client.anIntArray11254[i_286_]) && i_283_ + i_285_ > (client.anIntArray11254[i_286_] - client.anIntArray11256[i_286_]) && client.anIntArray11258[i_286_] - i_281_ < i_284_) {
						i_284_ = client.anIntArray11258[i_286_] - i_281_;
						bool = true;
					}
				}
			}
			client.anIntArray11258[i_282_] = i_284_;
			String string = client.aClass533Array11257[i_282_].method6448(-53761759);
			if (Class613.aClass263_8014.method3644((byte) 85))
				string = Class613.aClass263_8014.method3649(string, -1816572877);
			if (0 == -1500500417 * client.anInt11189) {
				int i_287_ = 16776960;
				int i_288_ = client.aClass533Array11257[i_282_].method6449(237873850);
				if (i_288_ < 6)
					i_287_ = client.anIntArray11024[i_288_];
				if (i_288_ == 6)
					i_287_ = (648319383 * client.anInt11127 % 20 < 10 ? 16711680 : 16776960);
				if (i_288_ == 7)
					i_287_ = (648319383 * client.anInt11127 % 20 < 10 ? 255 : 65535);
				if (8 == i_288_)
					i_287_ = (client.anInt11127 * 648319383 % 20 < 10 ? 45056 : 8454016);
				if (i_288_ == 9) {
					int i_289_ = 150 - (client.aClass533Array11257[i_282_].method6455(-602267629) * 150 / client.aClass533Array11257[i_282_].method6450(-742769584));
					if (i_289_ < 50)
						i_287_ = 16711680 + 1280 * i_289_;
					else if (i_289_ < 100)
						i_287_ = 16776960 - (i_289_ - 50) * 327680;
					else if (i_289_ < 150)
						i_287_ = (i_289_ - 100) * 5 + 65280;
				}
				if (10 == i_288_) {
					int i_290_ = 150 - (client.aClass533Array11257[i_282_].method6455(-662663293) * 150 / client.aClass533Array11257[i_282_].method6450(720998946));
					if (i_290_ < 50)
						i_287_ = 16711680 + i_290_ * 5;
					else if (i_290_ < 100)
						i_287_ = 16711935 - 327680 * (i_290_ - 50);
					else if (i_290_ < 150)
						i_287_ = (i_290_ - 100) * 327680 + 255 - 5 * (i_290_ - 100);
				}
				if (i_288_ == 11) {
					int i_291_ = 150 - (client.aClass533Array11257[i_282_].method6455(1356304956) * 150 / client.aClass533Array11257[i_282_].method6450(461293337));
					if (i_291_ < 50)
						i_287_ = 16777215 - 327685 * i_291_;
					else if (i_291_ < 100)
						i_287_ = 327685 * (i_291_ - 50) + 65280;
					else if (i_291_ < 150)
						i_287_ = 16777215 - (i_291_ - 100) * 327680;
				}
				int i_292_ = i_287_ | ~0xffffff;
				int i_293_ = client.aClass533Array11257[i_282_].method6457(-862596775);
				if (0 == i_293_)
					Class26.aClass184_248.method2742(string, i + i_283_, i_284_ + i_169_, i_292_, -16777216, (byte) 53);
				if (i_293_ == 1)
					Class26.aClass184_248.method2745(string, i + i_283_, i_169_ + i_284_, i_292_, -16777216, (648319383 * client.anInt11127), (byte) -46);
				if (2 == i_293_)
					Class26.aClass184_248.method2746(string, i_283_ + i, i_284_ + i_169_, i_292_, -16777216, (648319383 * client.anInt11127), -2120526516);
				if (i_293_ == 3) {
					int i_294_ = 150 - (client.aClass533Array11257[i_282_].method6455(-1424821129) * 150 / client.aClass533Array11257[i_282_].method6450(1862014009));
					Class26.aClass184_248.method2747(string, i_283_ + i, i_169_ + i_284_, i_292_, -16777216, (648319383 * client.anInt11127), i_294_, (byte) 42);
				}
				if (i_293_ == 4) {
					int i_295_ = 150 - (client.aClass533Array11257[i_282_].method6455(-2055378375) * 150 / client.aClass533Array11257[i_282_].method6450(1826524511));
					int i_296_ = i_295_ * (Class260.aClass2_2840.method530(string, (byte) -88) + 100) / 150;
					Class677.aClass167_8609.method2196(i + i_283_ - 50, i_169_, 50 + (i + i_283_), i_169_ + i_171_);
					Class26.aClass184_248.method2763(string, i_283_ + i + 50 - i_296_, i_169_ + i_284_, i_292_, -16777216, (byte) -12);
					Class677.aClass167_8609.method2369(i, i_169_, i_170_ + i, i_169_ + i_171_);
				}
				if (5 == i_293_) {
					int i_297_ = 150 - (client.aClass533Array11257[i_282_].method6455(701156581) * 150 / client.aClass533Array11257[i_282_].method6450(-1256124165));
					int i_298_ = 0;
					if (i_297_ < 25)
						i_298_ = i_297_ - 25;
					else if (i_297_ > 125)
						i_298_ = i_297_ - 125;
					int i_299_ = (Class260.aClass2_2840.anInt91 * -1214764847 + 1780869003 * Class260.aClass2_2840.anInt92);
					Class677.aClass167_8609.method2196(i, (i_169_ + i_284_ - i_299_ - 1), i_170_ + i, i_284_ + i_169_ + 5);
					Class26.aClass184_248.method2742(string, i + i_283_, i_284_ + i_169_ + i_298_, i_292_, -16777216, (byte) -78);
					Class677.aClass167_8609.method2369(i, i_169_, i_170_ + i, i_169_ + i_171_);
				}
			} else
				Class26.aClass184_248.method2742(string, i_283_ + i, i_169_ + i_284_, -256, -16777216, (byte) 19);
		}
	}

	public static void method2768(short i) {
		Class440.anInt4871 = 0;
		Class440.anInt4873 = 0;
	}

	public static void method2769(int i) {
		int i_300_ = 0;
		if (Class710.aClass536_Sub40_8843.aClass710_Sub14_10755.method10066((byte) 0) == 1) {
			i_300_ |= 0x1;
			i_300_ |= 0x10;
			i_300_ |= 0x20;
			i_300_ |= 0x2;
			i_300_ |= 0x4;
		}
		if (Class710.aClass536_Sub40_8843.aClass710_Sub2_10765.method9885(925865461) == 0)
			i_300_ |= 0x40;
		Class153.method1866(i_300_, (byte) -69);
		client.aClass515_11066.method6280(-1073841494).method10352(i_300_, (byte) -121);
		Class266.aClass503_2867.method6045(-703477035).method6280(-1073841494).method10352(i_300_, (byte) -74);
		Class111.aClass34_Sub13_1391.method10339(i_300_, 1867269829);
		Class172.aClass34_Sub7_1922.method10323(i_300_, 903956364);
		Class633.aClass34_Sub15_8260.method10348(i_300_, 1700206604);
		Class406.method4950(i_300_, 339066292);
		Class671.method8020(i_300_, -1166106921);
		Class444.method5394(i_300_, 1911745745);
		Class57.method966(i_300_, -1936897460);
		Class360_Sub2.method9318(i_300_, 457367888);
		client.aClass515_11066.method6319(-1365182082);
	}
}
