/* Class174 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Random;

public abstract class Class174 {
	public static final int anInt1888 = 1;
	Class180 aClass180_1889;
	public static final int anInt1890 = 0;
	static int anInt1891 = -45568001;
	public static final int anInt1892 = 0;
	Class22 aClass22_1893;
	static int anInt1894;
	static int anInt1895;
	static int anInt1896;
	static int anInt1897 = 583860229;
	static int anInt1898;
	static int anInt1899;
	static int anInt1900;
	static String[] aStringArray1901;

	void method2742(String string) {
		try {
			if (string.startsWith("col="))
				anInt1896 = ((anInt1896 * 2094942515 & ~0xffffff | Class59.method1374(string.substring(4), 16, (byte) 48) & 0xffffff) * -168371717);
			else if (string.equals("/col"))
				anInt1896 = (anInt1896 * 2094942515 & ~0xffffff | -2132250511 * anInt1895 & 0xffffff) * -168371717;
			if (string.startsWith("argb="))
				anInt1896 = Class59.method1374(string.substring(5), 16, (byte) 81) * -168371717;
			else if (string.equals("/argb"))
				anInt1896 = -1664350261 * anInt1895;
			else if (string.startsWith("str="))
				anInt1891 = (anInt1896 * 2094942515 & ~0xffffff | Class59.method1374(string.substring(4), 16, (byte) 46)) * 45568001;
			else if (string.equals("str"))
				anInt1891 = ((anInt1896 * 2094942515 & ~0xffffff | 0x800000) * 45568001);
			else if (string.equals("/str"))
				anInt1891 = -45568001;
			else if (string.startsWith("u="))
				anInt1897 = (anInt1896 * 2094942515 & ~0xffffff | Class59.method1374(string.substring(2), 16, (byte) 48)) * -583860229;
			else if (string.equals("u"))
				anInt1897 = -583860229 * (anInt1896 * 2094942515 & ~0xffffff);
			else if (string.equals("/u"))
				anInt1897 = 583860229;
			else if (string.equalsIgnoreCase("shad=-1"))
				anInt1899 = 0;
			else if (string.startsWith("shad="))
				anInt1899 = (anInt1896 * 2094942515 & ~0xffffff | Class59.method1374(string.substring(5), 16, (byte) 77)) * -104665419;
			else if (string.equals("shad"))
				anInt1899 = -104665419 * (2094942515 * anInt1896 & ~0xffffff);
			else if (string.equals("/shad"))
				anInt1899 = -983851573 * anInt1894;
			else if (string.equals("br"))
				method2753(-2132250511 * anInt1895, -1049122177 * anInt1894, 761667478);
		} catch (Exception exception) {
			/* empty */
		}
	}

	void method2743(String string) {
		try {
			if (string.startsWith("col="))
				anInt1896 = ((anInt1896 * 2094942515 & ~0xffffff | Class59.method1374(string.substring(4), 16, (byte) 23) & 0xffffff) * -168371717);
			else if (string.equals("/col"))
				anInt1896 = (anInt1896 * 2094942515 & ~0xffffff | -2132250511 * anInt1895 & 0xffffff) * -168371717;
			if (string.startsWith("argb="))
				anInt1896 = Class59.method1374(string.substring(5), 16, (byte) 124) * -168371717;
			else if (string.equals("/argb"))
				anInt1896 = -1664350261 * anInt1895;
			else if (string.startsWith("str="))
				anInt1891 = (anInt1896 * 2094942515 & ~0xffffff | Class59.method1374(string.substring(4), 16, (byte) 21)) * 45568001;
			else if (string.equals("str"))
				anInt1891 = ((anInt1896 * 2094942515 & ~0xffffff | 0x800000) * 45568001);
			else if (string.equals("/str"))
				anInt1891 = -45568001;
			else if (string.startsWith("u="))
				anInt1897 = (anInt1896 * 2094942515 & ~0xffffff | Class59.method1374(string.substring(2), 16, (byte) 25)) * -583860229;
			else if (string.equals("u"))
				anInt1897 = -583860229 * (anInt1896 * 2094942515 & ~0xffffff);
			else if (string.equals("/u"))
				anInt1897 = 583860229;
			else if (string.equalsIgnoreCase("shad=-1"))
				anInt1899 = 0;
			else if (string.startsWith("shad="))
				anInt1899 = (anInt1896 * 2094942515 & ~0xffffff | Class59.method1374(string.substring(5), 16, (byte) 31)) * -104665419;
			else if (string.equals("shad"))
				anInt1899 = -104665419 * (2094942515 * anInt1896 & ~0xffffff);
			else if (string.equals("/shad"))
				anInt1899 = -983851573 * anInt1894;
			else if (string.equals("br"))
				method2753(-2132250511 * anInt1895, -1049122177 * anInt1894, 139072921);
		} catch (Exception exception) {
			/* empty */
		}
	}

	public void method2744(String string, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		if (string != null) {
			method2753(i_1_, i_2_, 234524676);
			method2777(string, i - aClass22_1893.method780(string, (short) -4815), i_0_, null, null, null, 0, 0, (byte) -36);
		}
	}

	public void method2745(String string, int i, int i_4_, int i_5_, int i_6_, int i_7_) {
		if (null != string) {
			method2753(i_5_, i_6_, 395108886);
			method2777(string, i - aClass22_1893.method780(string, (short) -4100) / 2, i_4_, null, null, null, 0, 0, (byte) -39);
		}
	}

	public int method2746(String string, int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, Class147[] class147s, int[] is, Class142 class142, int i_16_, int i_17_, int i_18_) {
		return method2747(string, i, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, 0, class147s, is, class142, i_16_, i_17_, -357980626);
	}

	public int method2747(String string, int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, Class147[] class147s, int[] is, Class142 class142, int i_28_, int i_29_, int i_30_) {
		if (null == string)
			return 0;
		method2753(i_22_, i_23_, 624630604);
		if (0 == i_26_)
			i_26_ = 169086347 * aClass22_1893.anInt212;
		int[] is_31_;
		if (i_21_ < (-63286397 * aClass22_1893.anInt215 + 672688101 * aClass22_1893.anInt213 + i_26_) && i_21_ < i_26_ + i_26_)
			is_31_ = null;
		else
			is_31_ = new int[] { i_20_ };
		int i_32_ = aClass22_1893.method783(string, is_31_, aStringArray1901, class147s, 2122075549);
		if (-1 == i_27_) {
			i_27_ = i_21_ / i_26_;
			if (i_27_ <= 0)
				i_27_ = 1;
		}
		if (i_27_ > 0 && i_32_ >= i_27_) {
			aStringArray1901[i_27_ - 1] = aClass22_1893.method791(aStringArray1901[i_27_ - 1], i_20_, class147s, (byte) -42);
			i_32_ = i_27_;
		}
		if (i_25_ == 3 && i_32_ == 1)
			i_25_ = 1;
		int i_33_;
		if (0 == i_25_)
			i_33_ = i_19_ + -63286397 * aClass22_1893.anInt215;
		else if (i_25_ == 1)
			i_33_ = (i_19_ + -63286397 * aClass22_1893.anInt215 + (i_21_ - -63286397 * aClass22_1893.anInt215 - aClass22_1893.anInt213 * 672688101 - (i_32_ - 1) * i_26_) / 2);
		else if (i_25_ == 2)
			i_33_ = (i_21_ + i_19_ - aClass22_1893.anInt213 * 672688101 - i_26_ * (i_32_ - 1));
		else {
			int i_34_ = ((i_21_ - aClass22_1893.anInt215 * -63286397 - aClass22_1893.anInt213 * 672688101 - i_26_ * (i_32_ - 1)) / (i_32_ + 1));
			if (i_34_ < 0)
				i_34_ = 0;
			i_33_ = i_19_ + -63286397 * aClass22_1893.anInt215 + i_34_;
			i_26_ += i_34_;
		}
		for (int i_35_ = 0; i_35_ < i_32_; i_35_++) {
			if (i_24_ == 0)
				method2777(aStringArray1901[i_35_], i, i_33_, class147s, is, class142, i_28_, i_29_, (byte) -97);
			else if (1 == i_24_)
				method2777(aStringArray1901[i_35_], i + (i_20_ - aClass22_1893.method780((aStringArray1901[i_35_]), (short) -24023)) / 2, i_33_, class147s, is, class142, i_28_, i_29_, (byte) -123);
			else if (2 == i_24_)
				method2777(aStringArray1901[i_35_], (i + i_20_ - aClass22_1893.method780(aStringArray1901[i_35_], (short) 5655)), i_33_, class147s, is, class142, i_28_, i_29_, (byte) -108);
			else if (i_32_ - 1 == i_35_)
				method2777(aStringArray1901[i_35_], i, i_33_, class147s, is, class142, i_28_, i_29_, (byte) -17);
			else {
				method2755(aStringArray1901[i_35_], i_20_, -391468585);
				method2777(aStringArray1901[i_35_], i, i_33_, class147s, is, class142, i_28_, i_29_, (byte) -124);
				anInt1898 = 0;
			}
			i_33_ += i_26_;
		}
		return i_32_;
	}

	public void method2748(String string, int i, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_) {
		if (null != string) {
			method2753(i_37_, i_38_, 2061143768);
			int i_41_ = string.length();
			int[] is = new int[i_41_];
			for (int i_42_ = 0; i_42_ < i_41_; i_42_++)
				is[i_42_] = (int) (Math.sin((double) i_39_ / 5.0 + (double) i_42_ / 2.0) * 5.0);
			method2757(string, i - aClass22_1893.method780(string, (short) 2730) / 2, i_36_, null, null, null, is, (byte) -66);
		}
	}

	public void method2749(String string, int i, int i_43_, int i_44_, int i_45_) {
		if (null != string) {
			method2753(i_44_, i_45_, 592635847);
			method2777(string, i - aClass22_1893.method780(string, (short) -15317) / 2, i_43_, null, null, null, 0, 0, (byte) -100);
		}
	}

	public int method2750(String string, int i, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, Class147[] class147s, int[] is, Class142 class142, int i_54_, int i_55_) {
		return method2747(string, i, i_46_, i_47_, i_48_, i_49_, i_50_, i_51_, i_52_, i_53_, 0, class147s, is, class142, i_54_, i_55_, -893768380);
	}

	public void method2751(String string, int i, int i_56_, int i_57_, int i_58_) {
		if (null != string) {
			method2753(i_57_, i_58_, 513032682);
			method2777(string, i - aClass22_1893.method780(string, (short) -12084) / 2, i_56_, null, null, null, 0, 0, (byte) -112);
		}
	}

	public void method2752(String string, int i, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_) {
		if (string != null) {
			method2753(i_60_, i_61_, 1458832309);
			double d = 7.0 - (double) i_63_ / 8.0;
			if (d < 0.0)
				d = 0.0;
			int i_64_ = string.length();
			int[] is = new int[i_64_];
			for (int i_65_ = 0; i_65_ < i_64_; i_65_++)
				is[i_65_] = (int) (Math.sin((double) i_62_ / 1.0 + (double) i_65_ / 1.5) * d);
			method2757(string, i - aClass22_1893.method780(string, (short) -29332) / 2, i_59_, null, null, null, is, (byte) -120);
		}
	}

	void method2753(int i, int i_66_, int i_67_) {
		anInt1891 = -45568001;
		anInt1897 = 583860229;
		anInt1896 = (anInt1895 = i * 386224273) * -1664350261;
		anInt1898 = 0;
		anInt1900 = 0;
		if (i_66_ == -1)
			i_66_ = 0;
		anInt1899 = (anInt1894 = -1134946945 * i_66_) * -983851573;
	}

	void method2754(String string, int i) {
		try {
			if (string.startsWith("col="))
				anInt1896 = ((anInt1896 * 2094942515 & ~0xffffff | Class59.method1374(string.substring(4), 16, (byte) 13) & 0xffffff) * -168371717);
			else if (string.equals("/col"))
				anInt1896 = (anInt1896 * 2094942515 & ~0xffffff | -2132250511 * anInt1895 & 0xffffff) * -168371717;
			if (string.startsWith("argb="))
				anInt1896 = Class59.method1374(string.substring(5), 16, (byte) 118) * -168371717;
			else if (string.equals("/argb"))
				anInt1896 = -1664350261 * anInt1895;
			else if (string.startsWith("str="))
				anInt1891 = (anInt1896 * 2094942515 & ~0xffffff | Class59.method1374(string.substring(4), 16, (byte) 68)) * 45568001;
			else if (string.equals("str"))
				anInt1891 = ((anInt1896 * 2094942515 & ~0xffffff | 0x800000) * 45568001);
			else if (string.equals("/str"))
				anInt1891 = -45568001;
			else if (string.startsWith("u="))
				anInt1897 = (anInt1896 * 2094942515 & ~0xffffff | Class59.method1374(string.substring(2), 16, (byte) 58)) * -583860229;
			else if (string.equals("u"))
				anInt1897 = -583860229 * (anInt1896 * 2094942515 & ~0xffffff);
			else if (string.equals("/u"))
				anInt1897 = 583860229;
			else if (string.equalsIgnoreCase("shad=-1"))
				anInt1899 = 0;
			else if (string.startsWith("shad="))
				anInt1899 = (anInt1896 * 2094942515 & ~0xffffff | Class59.method1374(string.substring(5), 16, (byte) 47)) * -104665419;
			else if (string.equals("shad"))
				anInt1899 = -104665419 * (2094942515 * anInt1896 & ~0xffffff);
			else if (string.equals("/shad"))
				anInt1899 = -983851573 * anInt1894;
			else if (string.equals("br"))
				method2753(-2132250511 * anInt1895, -1049122177 * anInt1894, 1688817126);
		} catch (Exception exception) {
			/* empty */
		}
	}

	void method2755(String string, int i, int i_68_) {
		int i_69_ = 0;
		boolean bool = false;
		for (int i_70_ = 0; i_70_ < string.length(); i_70_++) {
			char c = string.charAt(i_70_);
			if ('<' == c)
				bool = true;
			else if ('>' == c)
				bool = false;
			else if (!bool && ' ' == c)
				i_69_++;
		}
		if (i_69_ > 0)
			anInt1898 = (i - aClass22_1893.method780(string, (short) -252) << 8) / i_69_ * -673579895;
	}

	public void method2756(String string, int i, int i_71_, int i_72_, int i_73_, int i_74_) {
		if (string != null) {
			method2753(i_72_, i_73_, 1923922457);
			int i_75_ = string.length();
			int[] is = new int[i_75_];
			int[] is_76_ = new int[i_75_];
			for (int i_77_ = 0; i_77_ < i_75_; i_77_++) {
				is[i_77_] = (int) (Math.sin((double) i_77_ / 5.0 + (double) i_74_ / 5.0) * 5.0);
				is_76_[i_77_] = (int) (Math.sin((double) i_77_ / 3.0 + (double) i_74_ / 5.0) * 5.0);
			}
			method2757(string, i - aClass22_1893.method780(string, (short) 6026) / 2, i_71_, null, null, is, is_76_, (byte) -32);
		}
	}

	void method2757(String string, int i, int i_78_, Class147[] class147s, int[] is, int[] is_79_, int[] is_80_, byte i_81_) {
		i_78_ -= 169086347 * aClass22_1893.anInt212;
		int i_82_ = -1;
		int i_83_ = -1;
		int i_84_ = 0;
		int i_85_ = string.length();
		for (int i_86_ = 0; i_86_ < i_85_; i_86_++) {
			char c = (char) (Class676.method13876(string.charAt(i_86_), 1907269876) & 0xff);
			if (60 == c)
				i_82_ = i_86_;
			else {
				if (62 == c && -1 != i_82_) {
					String string_87_ = string.substring(1 + i_82_, i_86_);
					i_82_ = -1;
					if (string_87_.equals("lt"))
						c = '<';
					else if (string_87_.equals("gt"))
						c = '>';
					else if (string_87_.equals("nbsp"))
						c = '\u00a0';
					else if (string_87_.equals("shy"))
						c = '\u00ad';
					else if (string_87_.equals("times"))
						c = '\u00d7';
					else if (string_87_.equals("euro"))
						c = '\u0080';
					else if (string_87_.equals("copy"))
						c = '\u00a9';
					else if (string_87_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_87_.startsWith("img=")) {
							try {
								int i_88_;
								if (is_79_ != null)
									i_88_ = is_79_[i_84_];
								else
									i_88_ = 0;
								int i_89_;
								if (null != is_80_)
									i_89_ = is_80_[i_84_];
								else
									i_89_ = 0;
								i_84_++;
								int i_90_ = Class360.method6326(string_87_.substring(4), (byte) -25);
								Class147 class147 = class147s[i_90_];
								int i_91_ = (is != null ? is[i_90_] : class147.method2410());
								class147.method2416(i + i_88_, ((aClass22_1893.anInt212 * 169086347) + i_78_ - i_91_ + i_89_), 1, -1, 1);
								i += class147s[i_90_].method42();
								i_83_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else if (string_87_.startsWith("sprite=")) {
							if (aClass22_1893.anInterface2_214 != null) {
								try {
									int i_92_ = -1;
									int i_93_ = 0;
									int i_94_ = string_87_.indexOf(',');
									if (i_94_ == -1)
										i_92_ = (Class360.method6326(string_87_.substring(7), (byte) -11));
									else {
										i_92_ = (Class360.method6326(string_87_.substring(7, i_94_), (byte) -24));
										i_93_ = (Class360.method6326(string_87_.substring(i_94_ + 1), (byte) 74));
									}
									int i_95_;
									if (is_79_ != null)
										i_95_ = is_79_[i_84_];
									else
										i_95_ = 0;
									int i_96_;
									if (is_80_ != null)
										i_96_ = is_80_[i_84_];
									else
										i_96_ = 0;
									i_84_++;
									Class147[] class147s_97_ = (aClass22_1893.anInterface2_214.method10(aClass180_1889, i_92_, -1023294585));
									if (null != class147s_97_) {
										int i_98_ = Math.min(class147s_97_[i_93_].method2410(), ((aClass22_1893.anInt213 * 672688101) + ((aClass22_1893.anInt215) * -63286397)));
										class147s_97_[i_93_].method2416(i_95_ + i, ((aClass22_1893.anInt212 * 169086347) + (3 + i_78_) - i_98_ + i_96_), 1, -1, 1);
										i += class147s_97_[i_93_].method42();
									}
									i_83_ = -1;
								} catch (Exception exception) {
									/* empty */
								}
							}
						} else
							method2754(string_87_, -1109642947);
						continue;
					}
				}
				if (-1 == i_82_) {
					if (-1 != i_83_)
						i += aClass22_1893.method778(i_83_, c, -748242297);
					int i_99_;
					if (null != is_79_)
						i_99_ = is_79_[i_84_];
					else
						i_99_ = 0;
					int i_100_;
					if (null != is_80_)
						i_100_ = is_80_[i_84_];
					else
						i_100_ = 0;
					i_84_++;
					if (32 != c) {
						if ((anInt1899 * 1828392861 & ~0xffffff) != 0)
							method2758(c, i_99_ + (1 + i), i_100_ + (1 + i_78_), 1828392861 * anInt1899, true);
						method2758(c, i_99_ + i, i_78_ + i_100_, anInt1896 * 2094942515, false);
					} else if (anInt1898 * 617494969 > 0) {
						anInt1900 += anInt1898 * -1137487941;
						i += -1426660581 * anInt1900 >> 8;
						anInt1900 = -596328685 * (anInt1900 * -1426660581 & 0xff);
					}
					int i_101_ = aClass22_1893.method788(c, (short) 31018);
					if (-1 != 1984475137 * anInt1891)
						aClass180_1889.method3527(i, i_78_ + (int) ((double) (aClass22_1893.anInt212 * 169086347) * 0.7), i_101_, 1984475137 * anInt1891, 1145940484);
					if (-1 != 1913140019 * anInt1897)
						aClass180_1889.method3527(i, 169086347 * aClass22_1893.anInt212 + i_78_, i_101_, 1913140019 * anInt1897, 1145940484);
					i += i_101_;
					i_83_ = c;
				}
			}
		}
	}

	abstract void method2758(char c, int i, int i_102_, int i_103_, boolean bool);

	abstract void method2759(char c, int i, int i_104_, int i_105_, boolean bool, Class142 class142, int i_106_, int i_107_);

	static {
		anInt1895 = 0;
		anInt1896 = 0;
		anInt1894 = 0;
		anInt1899 = 0;
		anInt1898 = 0;
		anInt1900 = 0;
		aStringArray1901 = new String[100];
	}

	abstract void method2760(char c, int i, int i_108_, int i_109_, boolean bool);

	abstract void method2761(char c, int i, int i_110_, int i_111_, boolean bool);

	abstract void method2762(char c, int i, int i_112_, int i_113_, boolean bool, Class142 class142, int i_114_, int i_115_);

	abstract void method2763(char c, int i, int i_116_, int i_117_, boolean bool, Class142 class142, int i_118_, int i_119_);

	public void method2764(String string, int i, int i_120_, int i_121_, int i_122_) {
		if (string != null) {
			method2753(i_121_, i_122_, 436054767);
			method2777(string, i, i_120_, null, null, null, 0, 0, (byte) -1);
		}
	}

	public void method2765(String string, int i, int i_123_, int i_124_, int i_125_) {
		if (string != null) {
			method2753(i_124_, i_125_, 528043576);
			method2777(string, i - aClass22_1893.method780(string, (short) -26077), i_123_, null, null, null, 0, 0, (byte) -99);
		}
	}

	public void method2766(String string, int i, int i_126_, int i_127_, int i_128_) {
		if (string != null) {
			method2753(i_127_, i_128_, 1649564922);
			method2777(string, i - aClass22_1893.method780(string, (short) -20608), i_126_, null, null, null, 0, 0, (byte) -30);
		}
	}

	public int method2767(String string, int i, int i_129_, int i_130_, int i_131_, int i_132_, int i_133_, int i_134_, int i_135_, Random random, int i_136_, int[] is, Class147[] class147s, int[] is_137_, int i_138_) {
		if (null == string)
			return 0;
		random.setSeed((long) i_136_);
		int i_139_ = 192 + (random.nextInt() & 0x1f);
		method2753(i_139_ << 24 | i_132_ & 0xffffff, i_133_ == -1 ? 0 : i_139_ << 24 | i_133_ & 0xffffff, 560049308);
		int i_140_ = string.length();
		int[] is_141_ = new int[i_140_];
		int i_142_ = 0;
		for (int i_143_ = 0; i_143_ < i_140_; i_143_++) {
			is_141_[i_143_] = i_142_;
			if ((random.nextInt() & 0x3) == 0)
				i_142_++;
		}
		int i_144_ = i;
		int i_145_ = i_129_ + aClass22_1893.anInt215 * -63286397;
		int i_146_ = -1;
		if (i_135_ == 1)
			i_145_ += (i_131_ - -63286397 * aClass22_1893.anInt215 - aClass22_1893.anInt213 * 672688101) / 2;
		else if (i_135_ == 2)
			i_145_ = i_129_ + i_131_ - aClass22_1893.anInt213 * 672688101;
		if (i_134_ == 1) {
			i_146_ = aClass22_1893.method780(string, (short) -20184) + i_142_;
			i_144_ += (i_130_ - i_146_) / 2;
		} else if (2 == i_134_) {
			i_146_ = aClass22_1893.method780(string, (short) -10389) + i_142_;
			i_144_ += i_130_ - i_146_;
		}
		method2757(string, i_144_, i_145_, class147s, is_137_, is_141_, null, (byte) -33);
		if (is != null) {
			if (i_146_ == -1)
				i_146_ = aClass22_1893.method780(string, (short) 5766) + i_142_;
			is[0] = i_144_;
			is[1] = i_145_ - aClass22_1893.anInt215 * -63286397;
			is[2] = i_146_;
			is[3] = (672688101 * aClass22_1893.anInt213 + aClass22_1893.anInt215 * -63286397);
		}
		return i_142_;
	}

	public void method2768(String string, int i, int i_147_, int i_148_, int i_149_, int i_150_, int i_151_) {
		if (string != null) {
			method2753(i_148_, i_149_, 1678583811);
			double d = 7.0 - (double) i_151_ / 8.0;
			if (d < 0.0)
				d = 0.0;
			int i_152_ = string.length();
			int[] is = new int[i_152_];
			for (int i_153_ = 0; i_153_ < i_152_; i_153_++)
				is[i_153_] = (int) (Math.sin((double) i_150_ / 1.0 + (double) i_153_ / 1.5) * d);
			method2757(string, i - aClass22_1893.method780(string, (short) -32647) / 2, i_147_, null, null, null, is, (byte) -57);
		}
	}

	public void method2769(String string, int i, int i_154_, int i_155_, int i_156_, int i_157_) {
		if (string != null) {
			method2753(i_155_, i_156_, 906636618);
			int i_158_ = string.length();
			int[] is = new int[i_158_];
			int[] is_159_ = new int[i_158_];
			for (int i_160_ = 0; i_160_ < i_158_; i_160_++) {
				is[i_160_] = (int) (Math.sin((double) i_160_ / 5.0 + (double) i_157_ / 5.0) * 5.0);
				is_159_[i_160_] = (int) (Math.sin((double) i_160_ / 3.0 + (double) i_157_ / 5.0) * 5.0);
			}
			method2757(string, i - aClass22_1893.method780(string, (short) -2681) / 2, i_154_, null, null, is, is_159_, (byte) -6);
		}
	}

	public void method2770(String string, int i, int i_161_, int i_162_, int i_163_, int i_164_) {
		if (string != null) {
			method2753(i_162_, i_163_, 1838875774);
			method2777(string, i, i_161_, null, null, null, 0, 0, (byte) -24);
		}
	}

	public int method2771(String string, int i, int i_165_, int i_166_, int i_167_, int i_168_, int i_169_, int i_170_, int i_171_, int i_172_, Class147[] class147s, int[] is, Class142 class142, int i_173_, int i_174_) {
		return method2747(string, i, i_165_, i_166_, i_167_, i_168_, i_169_, i_170_, i_171_, i_172_, 0, class147s, is, class142, i_173_, i_174_, 2108414628);
	}

	public int method2772(String string, int i, int i_175_, int i_176_, int i_177_, int i_178_, int i_179_, int i_180_, int i_181_, int i_182_, int i_183_, Class147[] class147s, int[] is, Class142 class142, int i_184_, int i_185_) {
		if (null == string)
			return 0;
		method2753(i_178_, i_179_, 1297173214);
		if (0 == i_182_)
			i_182_ = 169086347 * aClass22_1893.anInt212;
		int[] is_186_;
		if (i_177_ < (-63286397 * aClass22_1893.anInt215 + 672688101 * aClass22_1893.anInt213 + i_182_) && i_177_ < i_182_ + i_182_)
			is_186_ = null;
		else
			is_186_ = new int[] { i_176_ };
		int i_187_ = aClass22_1893.method783(string, is_186_, aStringArray1901, class147s, 184157464);
		if (-1 == i_183_) {
			i_183_ = i_177_ / i_182_;
			if (i_183_ <= 0)
				i_183_ = 1;
		}
		if (i_183_ > 0 && i_187_ >= i_183_) {
			aStringArray1901[i_183_ - 1] = aClass22_1893.method791(aStringArray1901[i_183_ - 1], i_176_, class147s, (byte) -22);
			i_187_ = i_183_;
		}
		if (i_181_ == 3 && i_187_ == 1)
			i_181_ = 1;
		int i_188_;
		if (0 == i_181_)
			i_188_ = i_175_ + -63286397 * aClass22_1893.anInt215;
		else if (i_181_ == 1)
			i_188_ = (i_175_ + -63286397 * aClass22_1893.anInt215 + (i_177_ - -63286397 * aClass22_1893.anInt215 - aClass22_1893.anInt213 * 672688101 - (i_187_ - 1) * i_182_) / 2);
		else if (i_181_ == 2)
			i_188_ = (i_177_ + i_175_ - aClass22_1893.anInt213 * 672688101 - i_182_ * (i_187_ - 1));
		else {
			int i_189_ = ((i_177_ - aClass22_1893.anInt215 * -63286397 - aClass22_1893.anInt213 * 672688101 - i_182_ * (i_187_ - 1)) / (i_187_ + 1));
			if (i_189_ < 0)
				i_189_ = 0;
			i_188_ = i_175_ + -63286397 * aClass22_1893.anInt215 + i_189_;
			i_182_ += i_189_;
		}
		for (int i_190_ = 0; i_190_ < i_187_; i_190_++) {
			if (i_180_ == 0)
				method2777(aStringArray1901[i_190_], i, i_188_, class147s, is, class142, i_184_, i_185_, (byte) -103);
			else if (1 == i_180_)
				method2777(aStringArray1901[i_190_], i + (i_176_ - aClass22_1893.method780((aStringArray1901[i_190_]), (short) -6861)) / 2, i_188_, class147s, is, class142, i_184_, i_185_, (byte) -105);
			else if (2 == i_180_)
				method2777(aStringArray1901[i_190_], (i + i_176_ - aClass22_1893.method780(aStringArray1901[i_190_], (short) -9811)), i_188_, class147s, is, class142, i_184_, i_185_, (byte) -104);
			else if (i_187_ - 1 == i_190_)
				method2777(aStringArray1901[i_190_], i, i_188_, class147s, is, class142, i_184_, i_185_, (byte) -99);
			else {
				method2755(aStringArray1901[i_190_], i_176_, 1208635466);
				method2777(aStringArray1901[i_190_], i, i_188_, class147s, is, class142, i_184_, i_185_, (byte) -10);
				anInt1898 = 0;
			}
			i_188_ += i_182_;
		}
		return i_187_;
	}

	public void method2773(String string, int i, int i_191_, int i_192_, int i_193_, int i_194_) {
		if (null != string) {
			method2753(i_192_, i_193_, 322730594);
			int i_195_ = string.length();
			int[] is = new int[i_195_];
			for (int i_196_ = 0; i_196_ < i_195_; i_196_++)
				is[i_196_] = (int) (Math.sin((double) i_194_ / 5.0 + (double) i_196_ / 2.0) * 5.0);
			method2757(string, i - aClass22_1893.method780(string, (short) -19072) / 2, i_191_, null, null, null, is, (byte) -118);
		}
	}

	public void method2774(String string, int i, int i_197_, int i_198_, int i_199_, int i_200_) {
		if (null != string) {
			method2753(i_198_, i_199_, 296214710);
			int i_201_ = string.length();
			int[] is = new int[i_201_];
			for (int i_202_ = 0; i_202_ < i_201_; i_202_++)
				is[i_202_] = (int) (Math.sin((double) i_200_ / 5.0 + (double) i_202_ / 2.0) * 5.0);
			method2757(string, i - aClass22_1893.method780(string, (short) -25591) / 2, i_197_, null, null, null, is, (byte) -89);
		}
	}

	public void method2775(String string, int i, int i_203_, int i_204_, int i_205_, int i_206_, int i_207_) {
		if (string != null) {
			method2753(i_204_, i_205_, 1372269342);
			int i_208_ = string.length();
			int[] is = new int[i_208_];
			int[] is_209_ = new int[i_208_];
			for (int i_210_ = 0; i_210_ < i_208_; i_210_++) {
				is[i_210_] = (int) (Math.sin((double) i_210_ / 5.0 + (double) i_206_ / 5.0) * 5.0);
				is_209_[i_210_] = (int) (Math.sin((double) i_210_ / 3.0 + (double) i_206_ / 5.0) * 5.0);
			}
			method2757(string, i - aClass22_1893.method780(string, (short) -755) / 2, i_203_, null, null, is, is_209_, (byte) -90);
		}
	}

	public void method2776(String string, int i, int i_211_, int i_212_, int i_213_, int i_214_) {
		if (string != null) {
			method2753(i_212_, i_213_, 2142486396);
			int i_215_ = string.length();
			int[] is = new int[i_215_];
			int[] is_216_ = new int[i_215_];
			for (int i_217_ = 0; i_217_ < i_215_; i_217_++) {
				is[i_217_] = (int) (Math.sin((double) i_217_ / 5.0 + (double) i_214_ / 5.0) * 5.0);
				is_216_[i_217_] = (int) (Math.sin((double) i_217_ / 3.0 + (double) i_214_ / 5.0) * 5.0);
			}
			method2757(string, i - aClass22_1893.method780(string, (short) -4777) / 2, i_211_, null, null, is, is_216_, (byte) -54);
		}
	}

	void method2777(String string, int i, int i_218_, Class147[] class147s, int[] is, Class142 class142, int i_219_, int i_220_, byte i_221_) {
		i_218_ -= aClass22_1893.anInt212 * 169086347;
		int i_222_ = -1;
		int i_223_ = -1;
		int i_224_ = string.length();
		for (int i_225_ = 0; i_225_ < i_224_; i_225_++) {
			char c = (char) (Class676.method13876(string.charAt(i_225_), 1907269876) & 0xff);
			if (c == 60)
				i_222_ = i_225_;
			else {
				if (62 == c && -1 != i_222_) {
					String string_226_ = string.substring(i_222_ + 1, i_225_);
					i_222_ = -1;
					if (string_226_.equals("lt"))
						c = '<';
					else if (string_226_.equals("gt"))
						c = '>';
					else if (string_226_.equals("nbsp"))
						c = '\u00a0';
					else if (string_226_.equals("shy"))
						c = '\u00ad';
					else if (string_226_.equals("times"))
						c = '\u00d7';
					else if (string_226_.equals("euro"))
						c = '\u0080';
					else if (string_226_.equals("copy"))
						c = '\u00a9';
					else if (string_226_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_226_.startsWith("img=")) {
							try {
								int i_227_ = Class360.method6326(string_226_.substring(4), (byte) -38);
								Class147 class147 = class147s[i_227_];
								int i_228_ = (null != is ? is[i_227_] : class147.method2410());
								if ((anInt1896 * 2094942515 & ~0xffffff) == -16777216)
									class147.method2416(i, (((aClass22_1893.anInt212) * 169086347) + i_218_ - i_228_), 1, -1, 1);
								else
									class147.method2416(i, (aClass22_1893.anInt212 * 169086347 + i_218_ - i_228_), 0, (2094942515 * anInt1896 & ~0xffffff | 0xffffff), 1);
								i += class147s[i_227_].method42();
								i_223_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else if (string_226_.startsWith("sprite=")) {
							if (null != aClass22_1893.anInterface2_214) {
								try {
									int i_229_ = -1;
									int i_230_ = 0;
									int i_231_ = string_226_.indexOf(',');
									if (-1 == i_231_)
										i_229_ = (Class360.method6326(string_226_.substring(7), (byte) 39));
									else {
										i_229_ = (Class360.method6326(string_226_.substring(7, i_231_), (byte) -14));
										i_230_ = (Class360.method6326(string_226_.substring(i_231_ + 1), (byte) 2));
									}
									Class147[] class147s_232_ = (aClass22_1893.anInterface2_214.method10(aClass180_1889, i_229_, -913077056));
									if (null != class147s_232_) {
										int i_233_ = Math.min(class147s_232_[i_230_].method2410(), ((672688101 * (aClass22_1893.anInt213)) + (-63286397 * (aClass22_1893.anInt215))));
										if (-16777216 == (2094942515 * anInt1896 & ~0xffffff))
											class147s_232_[i_230_].method2416(i, ((aClass22_1893.anInt212 * 169086347) + (2 + i_218_) - i_233_), 1, -1, 1);
										else
											class147s_232_[i_230_].method2416(i, (i_218_ + 2 + (169086347 * aClass22_1893.anInt212) - i_233_), 0, (anInt1896 * 2094942515 & ~0xffffff) | 0xffffff, 1);
										i += class147s_232_[i_230_].method42();
									}
									i_223_ = -1;
								} catch (Exception exception) {
									/* empty */
								}
							}
						} else
							method2754(string_226_, -581772994);
						continue;
					}
				}
				if (i_222_ == -1) {
					if (i_223_ != -1)
						i += aClass22_1893.method778(i_223_, c, 782359196);
					if (32 != c) {
						if (class142 == null) {
							if (0 != (1828392861 * anInt1899 & ~0xffffff))
								method2758(c, 1 + i, i_218_ + 1, 1828392861 * anInt1899, true);
							method2758(c, i, i_218_, anInt1896 * 2094942515, false);
						} else {
							if ((anInt1899 * 1828392861 & ~0xffffff) != 0)
								method2759(c, 1 + i, i_218_ + 1, 1828392861 * anInt1899, true, class142, i_219_, i_220_);
							method2759(c, i, i_218_, anInt1896 * 2094942515, false, class142, i_219_, i_220_);
						}
					} else if (anInt1898 * 617494969 > 0) {
						anInt1900 += anInt1898 * -1137487941;
						i += -1426660581 * anInt1900 >> 8;
						anInt1900 = -596328685 * (-1426660581 * anInt1900 & 0xff);
					}
					int i_234_ = aClass22_1893.method788(c, (short) 24075);
					if (-1 != 1984475137 * anInt1891)
						aClass180_1889.method3527(i, (int) ((double) (169086347 * aClass22_1893.anInt212) * 0.7) + i_218_, i_234_, anInt1891 * 1984475137, 1145940484);
					if (1913140019 * anInt1897 != -1)
						aClass180_1889.method3527(i, 1 + (i_218_ + 169086347 * aClass22_1893.anInt212), i_234_, 1913140019 * anInt1897, 1145940484);
					i += i_234_;
					i_223_ = c;
				}
			}
		}
	}

	public void method2778(String string, int i, int i_235_, int i_236_, int i_237_, int i_238_) {
		if (string != null) {
			method2753(i_236_, i_237_, 1512717045);
			int i_239_ = string.length();
			int[] is = new int[i_239_];
			int[] is_240_ = new int[i_239_];
			for (int i_241_ = 0; i_241_ < i_239_; i_241_++) {
				is[i_241_] = (int) (Math.sin((double) i_241_ / 5.0 + (double) i_238_ / 5.0) * 5.0);
				is_240_[i_241_] = (int) (Math.sin((double) i_241_ / 3.0 + (double) i_238_ / 5.0) * 5.0);
			}
			method2757(string, i - aClass22_1893.method780(string, (short) -30394) / 2, i_235_, null, null, is, is_240_, (byte) -100);
		}
	}

	public void method2779(String string, int i, int i_242_, int i_243_, int i_244_, int i_245_) {
		if (string != null) {
			method2753(i_243_, i_244_, 2117725564);
			int i_246_ = string.length();
			int[] is = new int[i_246_];
			int[] is_247_ = new int[i_246_];
			for (int i_248_ = 0; i_248_ < i_246_; i_248_++) {
				is[i_248_] = (int) (Math.sin((double) i_248_ / 5.0 + (double) i_245_ / 5.0) * 5.0);
				is_247_[i_248_] = (int) (Math.sin((double) i_248_ / 3.0 + (double) i_245_ / 5.0) * 5.0);
			}
			method2757(string, i - aClass22_1893.method780(string, (short) -17336) / 2, i_242_, null, null, is, is_247_, (byte) -55);
		}
	}

	public void method2780(String string, int i, int i_249_, int i_250_, int i_251_, int i_252_, int i_253_) {
		if (string != null) {
			method2753(i_250_, i_251_, 1472069885);
			double d = 7.0 - (double) i_253_ / 8.0;
			if (d < 0.0)
				d = 0.0;
			int i_254_ = string.length();
			int[] is = new int[i_254_];
			for (int i_255_ = 0; i_255_ < i_254_; i_255_++)
				is[i_255_] = (int) (Math.sin((double) i_252_ / 1.0 + (double) i_255_ / 1.5) * d);
			method2757(string, i - aClass22_1893.method780(string, (short) -10462) / 2, i_249_, null, null, null, is, (byte) -13);
		}
	}

	public void method2781(String string, int i, int i_256_, int i_257_, int i_258_, int i_259_, int i_260_, short i_261_) {
		if (string != null) {
			method2753(i_257_, i_258_, 344798621);
			double d = 7.0 - (double) i_260_ / 8.0;
			if (d < 0.0)
				d = 0.0;
			int i_262_ = string.length();
			int[] is = new int[i_262_];
			for (int i_263_ = 0; i_263_ < i_262_; i_263_++)
				is[i_263_] = (int) (Math.sin((double) i_259_ / 1.0 + (double) i_263_ / 1.5) * d);
			method2757(string, i - aClass22_1893.method780(string, (short) -21971) / 2, i_256_, null, null, null, is, (byte) -101);
		}
	}

	Class174(Class180 class180, Class22 class22) {
		aClass180_1889 = class180;
		aClass22_1893 = class22;
	}

	void method2782(String string) {
		try {
			if (string.startsWith("col="))
				anInt1896 = ((anInt1896 * 2094942515 & ~0xffffff | Class59.method1374(string.substring(4), 16, (byte) 115) & 0xffffff) * -168371717);
			else if (string.equals("/col"))
				anInt1896 = (anInt1896 * 2094942515 & ~0xffffff | -2132250511 * anInt1895 & 0xffffff) * -168371717;
			if (string.startsWith("argb="))
				anInt1896 = Class59.method1374(string.substring(5), 16, (byte) 118) * -168371717;
			else if (string.equals("/argb"))
				anInt1896 = -1664350261 * anInt1895;
			else if (string.startsWith("str="))
				anInt1891 = (anInt1896 * 2094942515 & ~0xffffff | Class59.method1374(string.substring(4), 16, (byte) 115)) * 45568001;
			else if (string.equals("str"))
				anInt1891 = ((anInt1896 * 2094942515 & ~0xffffff | 0x800000) * 45568001);
			else if (string.equals("/str"))
				anInt1891 = -45568001;
			else if (string.startsWith("u="))
				anInt1897 = (anInt1896 * 2094942515 & ~0xffffff | Class59.method1374(string.substring(2), 16, (byte) 15)) * -583860229;
			else if (string.equals("u"))
				anInt1897 = -583860229 * (anInt1896 * 2094942515 & ~0xffffff);
			else if (string.equals("/u"))
				anInt1897 = 583860229;
			else if (string.equalsIgnoreCase("shad=-1"))
				anInt1899 = 0;
			else if (string.startsWith("shad="))
				anInt1899 = (anInt1896 * 2094942515 & ~0xffffff | Class59.method1374(string.substring(5), 16, (byte) 3)) * -104665419;
			else if (string.equals("shad"))
				anInt1899 = -104665419 * (2094942515 * anInt1896 & ~0xffffff);
			else if (string.equals("/shad"))
				anInt1899 = -983851573 * anInt1894;
			else if (string.equals("br"))
				method2753(-2132250511 * anInt1895, -1049122177 * anInt1894, 1198172129);
		} catch (Exception exception) {
			/* empty */
		}
	}

	void method2783(int i, int i_264_) {
		anInt1891 = -45568001;
		anInt1897 = 583860229;
		anInt1896 = (anInt1895 = i * 386224273) * -1664350261;
		anInt1898 = 0;
		anInt1900 = 0;
		if (i_264_ == -1)
			i_264_ = 0;
		anInt1899 = (anInt1894 = -1134946945 * i_264_) * -983851573;
	}

	void method2784(int i, int i_265_) {
		anInt1891 = -45568001;
		anInt1897 = 583860229;
		anInt1896 = (anInt1895 = i * 386224273) * -1664350261;
		anInt1898 = 0;
		anInt1900 = 0;
		if (i_265_ == -1)
			i_265_ = 0;
		anInt1899 = (anInt1894 = -1134946945 * i_265_) * -983851573;
	}

	public void method2785(String string, int i, int i_266_, int i_267_, int i_268_) {
		if (null != string) {
			method2753(i_267_, i_268_, 926560300);
			method2777(string, i - aClass22_1893.method780(string, (short) 3110) / 2, i_266_, null, null, null, 0, 0, (byte) -80);
		}
	}

	void method2786(int i, int i_269_) {
		anInt1891 = -45568001;
		anInt1897 = 583860229;
		anInt1896 = (anInt1895 = i * 386224273) * -1664350261;
		anInt1898 = 0;
		anInt1900 = 0;
		if (i_269_ == -1)
			i_269_ = 0;
		anInt1899 = (anInt1894 = -1134946945 * i_269_) * -983851573;
	}

	public void method2787(String string, int i, int i_270_, int i_271_, int i_272_, int i_273_, int i_274_) {
		if (string != null) {
			method2753(i_271_, i_272_, 1776226889);
			double d = 7.0 - (double) i_274_ / 8.0;
			if (d < 0.0)
				d = 0.0;
			int i_275_ = string.length();
			int[] is = new int[i_275_];
			for (int i_276_ = 0; i_276_ < i_275_; i_276_++)
				is[i_276_] = (int) (Math.sin((double) i_273_ / 1.0 + (double) i_276_ / 1.5) * d);
			method2757(string, i - aClass22_1893.method780(string, (short) -29568) / 2, i_270_, null, null, null, is, (byte) -123);
		}
	}

	void method2788(String string) {
		try {
			if (string.startsWith("col="))
				anInt1896 = ((anInt1896 * 2094942515 & ~0xffffff | Class59.method1374(string.substring(4), 16, (byte) 78) & 0xffffff) * -168371717);
			else if (string.equals("/col"))
				anInt1896 = (anInt1896 * 2094942515 & ~0xffffff | -2132250511 * anInt1895 & 0xffffff) * -168371717;
			if (string.startsWith("argb="))
				anInt1896 = Class59.method1374(string.substring(5), 16, (byte) 14) * -168371717;
			else if (string.equals("/argb"))
				anInt1896 = -1664350261 * anInt1895;
			else if (string.startsWith("str="))
				anInt1891 = (anInt1896 * 2094942515 & ~0xffffff | Class59.method1374(string.substring(4), 16, (byte) 98)) * 45568001;
			else if (string.equals("str"))
				anInt1891 = ((anInt1896 * 2094942515 & ~0xffffff | 0x800000) * 45568001);
			else if (string.equals("/str"))
				anInt1891 = -45568001;
			else if (string.startsWith("u="))
				anInt1897 = (anInt1896 * 2094942515 & ~0xffffff | Class59.method1374(string.substring(2), 16, (byte) 28)) * -583860229;
			else if (string.equals("u"))
				anInt1897 = -583860229 * (anInt1896 * 2094942515 & ~0xffffff);
			else if (string.equals("/u"))
				anInt1897 = 583860229;
			else if (string.equalsIgnoreCase("shad=-1"))
				anInt1899 = 0;
			else if (string.startsWith("shad="))
				anInt1899 = (anInt1896 * 2094942515 & ~0xffffff | Class59.method1374(string.substring(5), 16, (byte) 108)) * -104665419;
			else if (string.equals("shad"))
				anInt1899 = -104665419 * (2094942515 * anInt1896 & ~0xffffff);
			else if (string.equals("/shad"))
				anInt1899 = -983851573 * anInt1894;
			else if (string.equals("br"))
				method2753(-2132250511 * anInt1895, -1049122177 * anInt1894, 151421685);
		} catch (Exception exception) {
			/* empty */
		}
	}

	public int method2789(String string, int i, int i_277_, int i_278_, int i_279_, Random random, int i_280_, Class147[] class147s, int[] is, int i_281_) {
		if (string == null)
			return 0;
		random.setSeed((long) i_280_);
		int i_282_ = 192 + (random.nextInt() & 0x1f);
		method2753(i_282_ << 24 | i_278_ & 0xffffff, i_282_ << 24 | i_279_ & 0xffffff, 248557496);
		int i_283_ = string.length();
		int[] is_284_ = new int[i_283_];
		int i_285_ = 0;
		for (int i_286_ = 0; i_286_ < i_283_; i_286_++) {
			is_284_[i_286_] = i_285_;
			if ((random.nextInt() & 0x3) == 0)
				i_285_++;
		}
		method2757(string, i, i_277_, class147s, is, is_284_, null, (byte) -2);
		return i_285_;
	}

	void method2790(String string, int i, int i_287_, Class147[] class147s, int[] is, Class142 class142, int i_288_, int i_289_) {
		i_287_ -= aClass22_1893.anInt212 * 169086347;
		int i_290_ = -1;
		int i_291_ = -1;
		int i_292_ = string.length();
		for (int i_293_ = 0; i_293_ < i_292_; i_293_++) {
			char c = (char) (Class676.method13876(string.charAt(i_293_), 1907269876) & 0xff);
			if (c == 60)
				i_290_ = i_293_;
			else {
				if (62 == c && -1 != i_290_) {
					String string_294_ = string.substring(i_290_ + 1, i_293_);
					i_290_ = -1;
					if (string_294_.equals("lt"))
						c = '<';
					else if (string_294_.equals("gt"))
						c = '>';
					else if (string_294_.equals("nbsp"))
						c = '\u00a0';
					else if (string_294_.equals("shy"))
						c = '\u00ad';
					else if (string_294_.equals("times"))
						c = '\u00d7';
					else if (string_294_.equals("euro"))
						c = '\u0080';
					else if (string_294_.equals("copy"))
						c = '\u00a9';
					else if (string_294_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_294_.startsWith("img=")) {
							try {
								int i_295_ = Class360.method6326(string_294_.substring(4), (byte) -64);
								Class147 class147 = class147s[i_295_];
								int i_296_ = (null != is ? is[i_295_] : class147.method2410());
								if ((anInt1896 * 2094942515 & ~0xffffff) == -16777216)
									class147.method2416(i, (((aClass22_1893.anInt212) * 169086347) + i_287_ - i_296_), 1, -1, 1);
								else
									class147.method2416(i, (aClass22_1893.anInt212 * 169086347 + i_287_ - i_296_), 0, (2094942515 * anInt1896 & ~0xffffff | 0xffffff), 1);
								i += class147s[i_295_].method42();
								i_291_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else if (string_294_.startsWith("sprite=")) {
							if (null != aClass22_1893.anInterface2_214) {
								try {
									int i_297_ = -1;
									int i_298_ = 0;
									int i_299_ = string_294_.indexOf(',');
									if (-1 == i_299_)
										i_297_ = (Class360.method6326(string_294_.substring(7), (byte) -2));
									else {
										i_297_ = (Class360.method6326(string_294_.substring(7, i_299_), (byte) -29));
										i_298_ = (Class360.method6326(string_294_.substring(i_299_ + 1), (byte) 67));
									}
									Class147[] class147s_300_ = (aClass22_1893.anInterface2_214.method10(aClass180_1889, i_297_, -1833328530));
									if (null != class147s_300_) {
										int i_301_ = Math.min(class147s_300_[i_298_].method2410(), ((672688101 * (aClass22_1893.anInt213)) + (-63286397 * (aClass22_1893.anInt215))));
										if (-16777216 == (2094942515 * anInt1896 & ~0xffffff))
											class147s_300_[i_298_].method2416(i, ((aClass22_1893.anInt212 * 169086347) + (2 + i_287_) - i_301_), 1, -1, 1);
										else
											class147s_300_[i_298_].method2416(i, (i_287_ + 2 + (169086347 * aClass22_1893.anInt212) - i_301_), 0, (anInt1896 * 2094942515 & ~0xffffff) | 0xffffff, 1);
										i += class147s_300_[i_298_].method42();
									}
									i_291_ = -1;
								} catch (Exception exception) {
									/* empty */
								}
							}
						} else
							method2754(string_294_, -2106312723);
						continue;
					}
				}
				if (i_290_ == -1) {
					if (i_291_ != -1)
						i += aClass22_1893.method778(i_291_, c, 833191336);
					if (32 != c) {
						if (class142 == null) {
							if (0 != (1828392861 * anInt1899 & ~0xffffff))
								method2758(c, 1 + i, i_287_ + 1, 1828392861 * anInt1899, true);
							method2758(c, i, i_287_, anInt1896 * 2094942515, false);
						} else {
							if ((anInt1899 * 1828392861 & ~0xffffff) != 0)
								method2759(c, 1 + i, i_287_ + 1, 1828392861 * anInt1899, true, class142, i_288_, i_289_);
							method2759(c, i, i_287_, anInt1896 * 2094942515, false, class142, i_288_, i_289_);
						}
					} else if (anInt1898 * 617494969 > 0) {
						anInt1900 += anInt1898 * -1137487941;
						i += -1426660581 * anInt1900 >> 8;
						anInt1900 = -596328685 * (-1426660581 * anInt1900 & 0xff);
					}
					int i_302_ = aClass22_1893.method788(c, (short) 31702);
					if (-1 != 1984475137 * anInt1891)
						aClass180_1889.method3527(i, (int) ((double) (169086347 * aClass22_1893.anInt212) * 0.7) + i_287_, i_302_, anInt1891 * 1984475137, 1145940484);
					if (1913140019 * anInt1897 != -1)
						aClass180_1889.method3527(i, 1 + (i_287_ + 169086347 * aClass22_1893.anInt212), i_302_, 1913140019 * anInt1897, 1145940484);
					i += i_302_;
					i_291_ = c;
				}
			}
		}
	}

	void method2791(String string, int i, int i_303_, Class147[] class147s, int[] is, Class142 class142, int i_304_, int i_305_) {
		i_303_ -= aClass22_1893.anInt212 * 169086347;
		int i_306_ = -1;
		int i_307_ = -1;
		int i_308_ = string.length();
		for (int i_309_ = 0; i_309_ < i_308_; i_309_++) {
			char c = (char) (Class676.method13876(string.charAt(i_309_), 1907269876) & 0xff);
			if (c == 60)
				i_306_ = i_309_;
			else {
				if (62 == c && -1 != i_306_) {
					String string_310_ = string.substring(i_306_ + 1, i_309_);
					i_306_ = -1;
					if (string_310_.equals("lt"))
						c = '<';
					else if (string_310_.equals("gt"))
						c = '>';
					else if (string_310_.equals("nbsp"))
						c = '\u00a0';
					else if (string_310_.equals("shy"))
						c = '\u00ad';
					else if (string_310_.equals("times"))
						c = '\u00d7';
					else if (string_310_.equals("euro"))
						c = '\u0080';
					else if (string_310_.equals("copy"))
						c = '\u00a9';
					else if (string_310_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_310_.startsWith("img=")) {
							try {
								int i_311_ = Class360.method6326(string_310_.substring(4), (byte) -37);
								Class147 class147 = class147s[i_311_];
								int i_312_ = (null != is ? is[i_311_] : class147.method2410());
								if ((anInt1896 * 2094942515 & ~0xffffff) == -16777216)
									class147.method2416(i, (((aClass22_1893.anInt212) * 169086347) + i_303_ - i_312_), 1, -1, 1);
								else
									class147.method2416(i, (aClass22_1893.anInt212 * 169086347 + i_303_ - i_312_), 0, (2094942515 * anInt1896 & ~0xffffff | 0xffffff), 1);
								i += class147s[i_311_].method42();
								i_307_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else if (string_310_.startsWith("sprite=")) {
							if (null != aClass22_1893.anInterface2_214) {
								try {
									int i_313_ = -1;
									int i_314_ = 0;
									int i_315_ = string_310_.indexOf(',');
									if (-1 == i_315_)
										i_313_ = (Class360.method6326(string_310_.substring(7), (byte) -20));
									else {
										i_313_ = (Class360.method6326(string_310_.substring(7, i_315_), (byte) -32));
										i_314_ = (Class360.method6326(string_310_.substring(i_315_ + 1), (byte) 66));
									}
									Class147[] class147s_316_ = (aClass22_1893.anInterface2_214.method10(aClass180_1889, i_313_, -1412083932));
									if (null != class147s_316_) {
										int i_317_ = Math.min(class147s_316_[i_314_].method2410(), ((672688101 * (aClass22_1893.anInt213)) + (-63286397 * (aClass22_1893.anInt215))));
										if (-16777216 == (2094942515 * anInt1896 & ~0xffffff))
											class147s_316_[i_314_].method2416(i, ((aClass22_1893.anInt212 * 169086347) + (2 + i_303_) - i_317_), 1, -1, 1);
										else
											class147s_316_[i_314_].method2416(i, (i_303_ + 2 + (169086347 * aClass22_1893.anInt212) - i_317_), 0, (anInt1896 * 2094942515 & ~0xffffff) | 0xffffff, 1);
										i += class147s_316_[i_314_].method42();
									}
									i_307_ = -1;
								} catch (Exception exception) {
									/* empty */
								}
							}
						} else
							method2754(string_310_, -389753497);
						continue;
					}
				}
				if (i_306_ == -1) {
					if (i_307_ != -1)
						i += aClass22_1893.method778(i_307_, c, -457345378);
					if (32 != c) {
						if (class142 == null) {
							if (0 != (1828392861 * anInt1899 & ~0xffffff))
								method2758(c, 1 + i, i_303_ + 1, 1828392861 * anInt1899, true);
							method2758(c, i, i_303_, anInt1896 * 2094942515, false);
						} else {
							if ((anInt1899 * 1828392861 & ~0xffffff) != 0)
								method2759(c, 1 + i, i_303_ + 1, 1828392861 * anInt1899, true, class142, i_304_, i_305_);
							method2759(c, i, i_303_, anInt1896 * 2094942515, false, class142, i_304_, i_305_);
						}
					} else if (anInt1898 * 617494969 > 0) {
						anInt1900 += anInt1898 * -1137487941;
						i += -1426660581 * anInt1900 >> 8;
						anInt1900 = -596328685 * (-1426660581 * anInt1900 & 0xff);
					}
					int i_318_ = aClass22_1893.method788(c, (short) 28435);
					if (-1 != 1984475137 * anInt1891)
						aClass180_1889.method3527(i, (int) ((double) (169086347 * aClass22_1893.anInt212) * 0.7) + i_303_, i_318_, anInt1891 * 1984475137, 1145940484);
					if (1913140019 * anInt1897 != -1)
						aClass180_1889.method3527(i, 1 + (i_303_ + 169086347 * aClass22_1893.anInt212), i_318_, 1913140019 * anInt1897, 1145940484);
					i += i_318_;
					i_307_ = c;
				}
			}
		}
	}

	void method2792(String string, int i, int i_319_, Class147[] class147s, int[] is, int[] is_320_, int[] is_321_) {
		i_319_ -= 169086347 * aClass22_1893.anInt212;
		int i_322_ = -1;
		int i_323_ = -1;
		int i_324_ = 0;
		int i_325_ = string.length();
		for (int i_326_ = 0; i_326_ < i_325_; i_326_++) {
			char c = (char) (Class676.method13876(string.charAt(i_326_), 1907269876) & 0xff);
			if (60 == c)
				i_322_ = i_326_;
			else {
				if (62 == c && -1 != i_322_) {
					String string_327_ = string.substring(1 + i_322_, i_326_);
					i_322_ = -1;
					if (string_327_.equals("lt"))
						c = '<';
					else if (string_327_.equals("gt"))
						c = '>';
					else if (string_327_.equals("nbsp"))
						c = '\u00a0';
					else if (string_327_.equals("shy"))
						c = '\u00ad';
					else if (string_327_.equals("times"))
						c = '\u00d7';
					else if (string_327_.equals("euro"))
						c = '\u0080';
					else if (string_327_.equals("copy"))
						c = '\u00a9';
					else if (string_327_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_327_.startsWith("img=")) {
							try {
								int i_328_;
								if (is_320_ != null)
									i_328_ = is_320_[i_324_];
								else
									i_328_ = 0;
								int i_329_;
								if (null != is_321_)
									i_329_ = is_321_[i_324_];
								else
									i_329_ = 0;
								i_324_++;
								int i_330_ = Class360.method6326(string_327_.substring(4), (byte) -119);
								Class147 class147 = class147s[i_330_];
								int i_331_ = (is != null ? is[i_330_] : class147.method2410());
								class147.method2416(i + i_328_, ((aClass22_1893.anInt212 * 169086347) + i_319_ - i_331_ + i_329_), 1, -1, 1);
								i += class147s[i_330_].method42();
								i_323_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else if (string_327_.startsWith("sprite=")) {
							if (aClass22_1893.anInterface2_214 != null) {
								try {
									int i_332_ = -1;
									int i_333_ = 0;
									int i_334_ = string_327_.indexOf(',');
									if (i_334_ == -1)
										i_332_ = (Class360.method6326(string_327_.substring(7), (byte) -63));
									else {
										i_332_ = (Class360.method6326(string_327_.substring(7, i_334_), (byte) -21));
										i_333_ = (Class360.method6326(string_327_.substring(i_334_ + 1), (byte) -19));
									}
									int i_335_;
									if (is_320_ != null)
										i_335_ = is_320_[i_324_];
									else
										i_335_ = 0;
									int i_336_;
									if (is_321_ != null)
										i_336_ = is_321_[i_324_];
									else
										i_336_ = 0;
									i_324_++;
									Class147[] class147s_337_ = (aClass22_1893.anInterface2_214.method10(aClass180_1889, i_332_, -701739442));
									if (null != class147s_337_) {
										int i_338_ = Math.min(class147s_337_[i_333_].method2410(), ((aClass22_1893.anInt213 * 672688101) + ((aClass22_1893.anInt215) * -63286397)));
										class147s_337_[i_333_].method2416(i_335_ + i, ((aClass22_1893.anInt212 * 169086347) + (3 + i_319_) - i_338_ + i_336_), 1, -1, 1);
										i += class147s_337_[i_333_].method42();
									}
									i_323_ = -1;
								} catch (Exception exception) {
									/* empty */
								}
							}
						} else
							method2754(string_327_, -1549083938);
						continue;
					}
				}
				if (-1 == i_322_) {
					if (-1 != i_323_)
						i += aClass22_1893.method778(i_323_, c, -1618908284);
					int i_339_;
					if (null != is_320_)
						i_339_ = is_320_[i_324_];
					else
						i_339_ = 0;
					int i_340_;
					if (null != is_321_)
						i_340_ = is_321_[i_324_];
					else
						i_340_ = 0;
					i_324_++;
					if (32 != c) {
						if ((anInt1899 * 1828392861 & ~0xffffff) != 0)
							method2758(c, i_339_ + (1 + i), i_340_ + (1 + i_319_), 1828392861 * anInt1899, true);
						method2758(c, i_339_ + i, i_319_ + i_340_, anInt1896 * 2094942515, false);
					} else if (anInt1898 * 617494969 > 0) {
						anInt1900 += anInt1898 * -1137487941;
						i += -1426660581 * anInt1900 >> 8;
						anInt1900 = -596328685 * (anInt1900 * -1426660581 & 0xff);
					}
					int i_341_ = aClass22_1893.method788(c, (short) 23668);
					if (-1 != 1984475137 * anInt1891)
						aClass180_1889.method3527(i, i_319_ + (int) ((double) (aClass22_1893.anInt212 * 169086347) * 0.7), i_341_, 1984475137 * anInt1891, 1145940484);
					if (-1 != 1913140019 * anInt1897)
						aClass180_1889.method3527(i, 169086347 * aClass22_1893.anInt212 + i_319_, i_341_, 1913140019 * anInt1897, 1145940484);
					i += i_341_;
					i_323_ = c;
				}
			}
		}
	}

	static final void method2793(Class665 class665, byte i) {
		int i_342_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_342_, -659097854);
		Class240 class240 = Class183.aClass240Array2100[i_342_ >> 16];
		Class676_Sub1.method17024(class243, class240, class665, 760011723);
	}

	static final void method2794(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_343_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_344_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_343_ * i_344_;
	}

	static final void method2795(Class665 class665, int i) {
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub8_10601, (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) == 1 ? 1 : 0, 38716873);
		Class208_Sub22.method15638((byte) 1);
		client.aClass509_11072.method8397(2093259771).method10252((short) -11529);
		Class631.method10465(169093253);
		client.aBool11020 = false;
	}

	static final void method2796(Class527_Sub38_Sub2 class527_sub38_sub2, int i) {
		class527_sub38_sub2.method18450(1046912813);
		int i_345_ = -899375681 * client.anInt11070;
		Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_345_] = new Class640_Sub1_Sub2_Sub1_Sub2(client.aClass509_11072.method8314(576767320)));
		class640_sub1_sub2_sub1_sub2.anInt11955 = 1587877927 * i_345_;
		int i_346_ = class527_sub38_sub2.method18469(30, 437986250);
		byte i_347_ = (byte) (i_346_ >> 28);
		int i_348_ = i_346_ >> 14 & 0x3fff;
		int i_349_ = i_346_ & 0x3fff;
		Class592 class592 = client.aClass509_11072.method8283((short) 27126);
		class640_sub1_sub2_sub1_sub2.anIntArray11902[0] = i_348_ - class592.anInt7798 * 153371143;
		class640_sub1_sub2_sub1_sub2.anIntArray11944[0] = i_349_ - -2029646807 * class592.anInt7799;
		class640_sub1_sub2_sub1_sub2.method10619((float) ((class640_sub1_sub2_sub1_sub2.anIntArray11902[0] << 9) + (class640_sub1_sub2_sub1_sub2.method18564(-1492495704) << 8)), (class640_sub1_sub2_sub1_sub2.method10613().aClass442_4927.aFloat4915), (float) ((class640_sub1_sub2_sub1_sub2.anIntArray11944[0] << 9) + (class640_sub1_sub2_sub1_sub2.method18564(-1609790478) << 8)));
		Class673.anInt8585 = (class640_sub1_sub2_sub1_sub2.aByte10864 = class640_sub1_sub2_sub1_sub2.aByte10862 = i_347_) * 706975839;
		if (client.aClass509_11072.method8359(-721630807).method7706(class640_sub1_sub2_sub1_sub2.anIntArray11902[0], class640_sub1_sub2_sub1_sub2.anIntArray11944[0], (short) 21772))
			class640_sub1_sub2_sub1_sub2.aByte10862++;
		if (Class105.aClass527_Sub38Array1298[i_345_] != null)
			class640_sub1_sub2_sub1_sub2.method18873((Class105.aClass527_Sub38Array1298[i_345_]), 348521444);
		if (Class105.aClass527_Sub38Array1305[i_345_] != null)
			class640_sub1_sub2_sub1_sub2.method18874((Class105.aClass527_Sub38Array1305[i_345_]), -1720390257);
		Class105.anInt1300 = 0;
		Class105.anIntArray1301[((Class105.anInt1300 += -858376649) * 351100807 - 1)] = i_345_;
		Class105.aByteArray1295[i_345_] = (byte) 0;
		Class105.anInt1302 = 0;
		for (int i_350_ = 1; i_350_ < 2048; i_350_++) {
			if (i_345_ != i_350_) {
				int i_351_ = class527_sub38_sub2.method18469(18, -1411640225);
				int i_352_ = i_351_ >> 16 & 0x3;
				int i_353_ = i_351_ >> 8 & 0xff;
				int i_354_ = i_351_ & 0xff;
				Class47 class47 = Class105.aClass47Array1296[i_350_] = new Class47();
				class47.anInt497 = 224559645 * (i_354_ + ((i_352_ << 28) + (i_353_ << 14)));
				class47.anInt496 = 0;
				class47.anInt495 = -1031003831;
				class47.aClass210_498 = Class210.aClass210_2251;
				class47.aBool499 = false;
				Class105.anIntArray1303[(Class105.anInt1302 += 410783055) * 1242229167 - 1] = i_350_;
				Class105.aByteArray1295[i_350_] = (byte) 0;
			}
		}
		class527_sub38_sub2.method18452(1555889112);
		Class301 class301 = Class208_Sub10.aClass296_Sub1_9923.method5376((byte) -81);
		if (Class301.aClass301_3418 == class301) {
			Class327_Sub2 class327_sub2 = ((Class327_Sub2) Class208_Sub10.aClass296_Sub1_9923.method5372((byte) 0));
			class327_sub2.method15729((byte) -8);
		}
		Class309 class309 = Class208_Sub10.aClass296_Sub1_9923.method5378((byte) -39);
		if (class309 == Class309.aClass309_3455) {
			Class696_Sub3 class696_sub3 = ((Class696_Sub3) Class208_Sub10.aClass296_Sub1_9923.method5472(977895665));
			class696_sub3.method17233(1832508695);
		}
	}

	static Class549 method2797(int i, int i_355_, int i_356_, Class176 class176, int i_357_) {
		if (class176 == null)
			return null;
		Class549 class549 = new Class549(i, i_355_, i_356_, class176.method2865(), class176.method2894(), class176.method2939(), class176.method2896(), class176.method2897(), class176.method2898(), class176.method2890());
		return class549;
	}
}
