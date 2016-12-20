/* Class168 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class168 {
	static int anInt1864;
	static int anInt1865;
	static int anInt1866;
	static int[] anIntArray1867;
	static int anInt1868;
	static int anInt1869;
	static int anInt1870;
	static int anInt1871;

	Class168() throws Throwable {
		throw new Error();
	}

	static boolean method2678(int i) {
		int i_0_ = anInt1870;
		int i_1_ = anInt1871;
		int i_2_ = anInt1865;
		int i_3_;
		for (/**/; i_1_ >= i_0_; i_1_ = i_3_) {
			anInt1865 = ++i_2_;
			if (i_2_ >= i)
				return false;
			i_3_ = anInt1869;
			for (/**/; i_0_ < anInt1864; i_0_ += 4) {
				int i_4_ = anIntArray1867[i_0_ + 1];
				if (i_2_ < i_4_)
					break;
				int i_5_ = anIntArray1867[i_0_];
				int i_6_ = anIntArray1867[i_0_ + 2];
				int i_7_ = anIntArray1867[i_0_ + 3];
				int i_8_ = (i_6_ - i_5_ << 16) / (i_7_ - i_4_);
				int i_9_ = (i_5_ << 16) + 32768;
				anIntArray1867[i_0_] = i_9_;
				anIntArray1867[i_0_ + 2] = i_8_;
			}
			for (int i_10_ = i_3_; i_10_ < i_0_; i_10_ += 4) {
				int i_11_ = anIntArray1867[i_10_ + 3];
				if (i_2_ >= i_11_) {
					anIntArray1867[i_10_] = anIntArray1867[i_3_];
					anIntArray1867[i_10_ + 1] = anIntArray1867[i_3_ + 1];
					anIntArray1867[i_10_ + 2] = anIntArray1867[i_3_ + 2];
					anIntArray1867[i_10_ + 3] = anIntArray1867[i_3_ + 3];
					i_3_ += 4;
				}
			}
			if (i_3_ == anInt1864) {
				anInt1864 = 0;
				return false;
			}
			method2686(i_3_, i_0_);
			anInt1869 = i_3_;
			anInt1870 = i_0_;
		}
		anInt1866 = anIntArray1867[i_1_] >> 16;
		anInt1868 = anIntArray1867[i_1_ + 4] >> 16;
		anIntArray1867[i_1_] += anIntArray1867[i_1_ + 2];
		anIntArray1867[i_1_ + 4] += anIntArray1867[i_1_ + 6];
		i_1_ += 8;
		anInt1871 = i_1_;
		return true;
	}

	public static void method2679(Class180 class180, int[] is, int i) {
		method2680(class180, is, 0, is.length, i, null, null);
	}

	static void method2680(Class180 class180, int[] is, int i, int i_12_, int i_13_, int[] is_14_, int[] is_15_) {
		int[] is_16_ = new int[4];
		class180.method3135(is_16_);
		if (is_14_ != null && is_16_[3] - is_16_[1] != is_14_.length)
			throw new IllegalStateException();
		method2700();
		method2683(is, i, i_12_);
		method2690(is_16_[1]);
		while (method2684(is_16_[3])) {
			int i_17_ = anInt1866;
			int i_18_ = anInt1868;
			int i_19_ = anInt1865;
			if (is_14_ != null) {
				int i_20_ = i_19_ - is_16_[1];
				if (i_17_ < is_14_[i_20_] + is_16_[0])
					i_17_ = is_14_[i_20_] + is_16_[0];
				if (i_18_ > is_14_[i_20_] + is_15_[i_20_] + is_16_[0])
					i_18_ = is_14_[i_20_] + is_15_[i_20_] + is_16_[0];
				if (i_18_ - i_17_ <= 0)
					continue;
			}
			class180.method3410(i_17_, i_19_, i_18_ - i_17_, i_13_, 1);
		}
	}

	public static void method2681(Class180 class180, int[] is, int i, int[] is_21_, int[] is_22_) {
		method2680(class180, is, 0, is.length, i, is_21_, is_22_);
	}

	static void method2682(int i, int i_23_) {
		if (i_23_ > i + 4) {
			int i_24_ = i;
			int i_25_ = anIntArray1867[i_24_];
			int i_26_ = anIntArray1867[i_24_ + 1];
			int i_27_ = anIntArray1867[i_24_ + 2];
			int i_28_ = anIntArray1867[i_24_ + 3];
			for (int i_29_ = i + 4; i_29_ < i_23_; i_29_ += 4) {
				int i_30_ = anIntArray1867[i_29_ + 1];
				if (i_30_ < i_26_) {
					anIntArray1867[i_24_] = anIntArray1867[i_29_];
					anIntArray1867[i_24_ + 1] = i_30_;
					anIntArray1867[i_24_ + 2] = anIntArray1867[i_29_ + 2];
					anIntArray1867[i_24_ + 3] = anIntArray1867[i_29_ + 3];
					i_24_ += 4;
					anIntArray1867[i_29_] = anIntArray1867[i_24_];
					anIntArray1867[i_29_ + 1] = anIntArray1867[i_24_ + 1];
					anIntArray1867[i_29_ + 2] = anIntArray1867[i_24_ + 2];
					anIntArray1867[i_29_ + 3] = anIntArray1867[i_24_ + 3];
				}
			}
			anIntArray1867[i_24_] = i_25_;
			anIntArray1867[i_24_ + 1] = i_26_;
			anIntArray1867[i_24_ + 2] = i_27_;
			anIntArray1867[i_24_ + 3] = i_28_;
			method2685(i, i_24_);
			method2685(i_24_ + 4, i_23_);
		}
	}

	static void method2683(int[] is, int i, int i_31_) {
		int i_32_ = anInt1864 + (i_31_ << 1);
		if (anIntArray1867 == null || anIntArray1867.length < i_32_) {
			int[] is_33_ = new int[i_32_];
			for (int i_34_ = 0; i_34_ < anInt1864; i_34_++)
				is_33_[i_34_] = anIntArray1867[i_34_];
			anIntArray1867 = is_33_;
		}
		i_31_ += i;
		int i_35_ = i_31_ - 2;
		for (int i_36_ = i; i_36_ < i_31_; i_36_ += 2) {
			int i_37_ = is[i_35_ + 1];
			int i_38_ = is[i_36_ + 1];
			if (i_37_ < i_38_) {
				anIntArray1867[anInt1864++] = is[i_35_];
				anIntArray1867[anInt1864++] = i_37_;
				anIntArray1867[anInt1864++] = is[i_36_];
				anIntArray1867[anInt1864++] = i_38_;
			} else if (i_38_ < i_37_) {
				anIntArray1867[anInt1864++] = is[i_36_];
				anIntArray1867[anInt1864++] = i_38_;
				anIntArray1867[anInt1864++] = is[i_35_];
				anIntArray1867[anInt1864++] = i_37_;
			}
			i_35_ = i_36_;
		}
	}

	static boolean method2684(int i) {
		int i_39_ = anInt1870;
		int i_40_ = anInt1871;
		int i_41_ = anInt1865;
		int i_42_;
		for (/**/; i_40_ >= i_39_; i_40_ = i_42_) {
			anInt1865 = ++i_41_;
			if (i_41_ >= i)
				return false;
			i_42_ = anInt1869;
			for (/**/; i_39_ < anInt1864; i_39_ += 4) {
				int i_43_ = anIntArray1867[i_39_ + 1];
				if (i_41_ < i_43_)
					break;
				int i_44_ = anIntArray1867[i_39_];
				int i_45_ = anIntArray1867[i_39_ + 2];
				int i_46_ = anIntArray1867[i_39_ + 3];
				int i_47_ = (i_45_ - i_44_ << 16) / (i_46_ - i_43_);
				int i_48_ = (i_44_ << 16) + 32768;
				anIntArray1867[i_39_] = i_48_;
				anIntArray1867[i_39_ + 2] = i_47_;
			}
			for (int i_49_ = i_42_; i_49_ < i_39_; i_49_ += 4) {
				int i_50_ = anIntArray1867[i_49_ + 3];
				if (i_41_ >= i_50_) {
					anIntArray1867[i_49_] = anIntArray1867[i_42_];
					anIntArray1867[i_49_ + 1] = anIntArray1867[i_42_ + 1];
					anIntArray1867[i_49_ + 2] = anIntArray1867[i_42_ + 2];
					anIntArray1867[i_49_ + 3] = anIntArray1867[i_42_ + 3];
					i_42_ += 4;
				}
			}
			if (i_42_ == anInt1864) {
				anInt1864 = 0;
				return false;
			}
			method2686(i_42_, i_39_);
			anInt1869 = i_42_;
			anInt1870 = i_39_;
		}
		anInt1866 = anIntArray1867[i_40_] >> 16;
		anInt1868 = anIntArray1867[i_40_ + 4] >> 16;
		anIntArray1867[i_40_] += anIntArray1867[i_40_ + 2];
		anIntArray1867[i_40_ + 4] += anIntArray1867[i_40_ + 6];
		i_40_ += 8;
		anInt1871 = i_40_;
		return true;
	}

	static void method2685(int i, int i_51_) {
		if (i_51_ > i + 4) {
			int i_52_ = i;
			int i_53_ = anIntArray1867[i_52_];
			int i_54_ = anIntArray1867[i_52_ + 1];
			int i_55_ = anIntArray1867[i_52_ + 2];
			int i_56_ = anIntArray1867[i_52_ + 3];
			for (int i_57_ = i + 4; i_57_ < i_51_; i_57_ += 4) {
				int i_58_ = anIntArray1867[i_57_ + 1];
				if (i_58_ < i_54_) {
					anIntArray1867[i_52_] = anIntArray1867[i_57_];
					anIntArray1867[i_52_ + 1] = i_58_;
					anIntArray1867[i_52_ + 2] = anIntArray1867[i_57_ + 2];
					anIntArray1867[i_52_ + 3] = anIntArray1867[i_57_ + 3];
					i_52_ += 4;
					anIntArray1867[i_57_] = anIntArray1867[i_52_];
					anIntArray1867[i_57_ + 1] = anIntArray1867[i_52_ + 1];
					anIntArray1867[i_57_ + 2] = anIntArray1867[i_52_ + 2];
					anIntArray1867[i_57_ + 3] = anIntArray1867[i_52_ + 3];
				}
			}
			anIntArray1867[i_52_] = i_53_;
			anIntArray1867[i_52_ + 1] = i_54_;
			anIntArray1867[i_52_ + 2] = i_55_;
			anIntArray1867[i_52_ + 3] = i_56_;
			method2685(i, i_52_);
			method2685(i_52_ + 4, i_51_);
		}
	}

	static void method2686(int i, int i_59_) {
		for (/**/; i_59_ >= i + 8; i_59_ -= 4) {
			boolean bool = true;
			for (int i_60_ = i + 4; i_60_ < i_59_; i_60_ += 4) {
				int i_61_ = anIntArray1867[i_60_ - 4];
				int i_62_ = anIntArray1867[i_60_];
				if (i_61_ > i_62_) {
					bool = false;
					anIntArray1867[i_60_ - 4] = i_62_;
					anIntArray1867[i_60_] = i_61_;
					i_61_ = anIntArray1867[i_60_ - 2];
					anIntArray1867[i_60_ - 2] = anIntArray1867[i_60_ + 2];
					anIntArray1867[i_60_ + 2] = i_61_;
					i_61_ = anIntArray1867[i_60_ - 1];
					anIntArray1867[i_60_ - 1] = anIntArray1867[i_60_ + 3];
					anIntArray1867[i_60_ + 3] = i_61_;
				}
			}
			if (bool)
				break;
		}
	}

	static void method2687(int i, int i_63_) {
		for (/**/; i_63_ >= i + 8; i_63_ -= 4) {
			boolean bool = true;
			for (int i_64_ = i + 4; i_64_ < i_63_; i_64_ += 4) {
				int i_65_ = anIntArray1867[i_64_ - 4];
				int i_66_ = anIntArray1867[i_64_];
				if (i_65_ > i_66_) {
					bool = false;
					anIntArray1867[i_64_ - 4] = i_66_;
					anIntArray1867[i_64_] = i_65_;
					i_65_ = anIntArray1867[i_64_ - 2];
					anIntArray1867[i_64_ - 2] = anIntArray1867[i_64_ + 2];
					anIntArray1867[i_64_ + 2] = i_65_;
					i_65_ = anIntArray1867[i_64_ - 1];
					anIntArray1867[i_64_ - 1] = anIntArray1867[i_64_ + 3];
					anIntArray1867[i_64_ + 3] = i_65_;
				}
			}
			if (bool)
				break;
		}
	}

	public static void method2688(Class180 class180, int[] is, int i, int[] is_67_, int[] is_68_) {
		method2680(class180, is, 0, is.length, i, is_67_, is_68_);
	}

	public static void method2689(Class180 class180, int[] is, int i, int[] is_69_, int[] is_70_) {
		method2680(class180, is, 0, is.length, i, is_69_, is_70_);
	}

	static void method2690(int i) {
		if (anInt1864 < 0) {
			anInt1871 = 0;
			anInt1870 = 0;
			anInt1869 = 0;
			anInt1865 = 2147483646;
		} else {
			method2685(0, anInt1864);
			int i_71_ = anIntArray1867[1];
			if (i_71_ < i)
				i_71_ = i;
			int i_72_ = 0;
			int i_73_;
			for (i_73_ = 0; i_73_ < anInt1864; i_73_ += 4) {
				int i_74_ = anIntArray1867[i_73_ + 1];
				if (i_71_ < i_74_)
					break;
				int i_75_ = anIntArray1867[i_73_];
				int i_76_ = anIntArray1867[i_73_ + 2];
				int i_77_ = anIntArray1867[i_73_ + 3];
				int i_78_ = (i_76_ - i_75_ << 16) / (i_77_ - i_74_);
				int i_79_ = (i_75_ << 16) + 32768;
				anIntArray1867[i_73_] = i_79_ + (i_71_ - i_74_) * i_78_;
				anIntArray1867[i_73_ + 2] = i_78_;
			}
			anInt1869 = i_72_;
			anInt1870 = i_73_;
			anInt1871 = i_73_;
			anInt1865 = i_71_ - 1;
		}
	}

	static void method2691(Class180 class180, int[] is, int i, int i_80_, int i_81_, int[] is_82_, int[] is_83_) {
		int[] is_84_ = new int[4];
		class180.method3135(is_84_);
		if (is_82_ != null && is_84_[3] - is_84_[1] != is_82_.length)
			throw new IllegalStateException();
		method2700();
		method2683(is, i, i_80_);
		method2690(is_84_[1]);
		while (method2684(is_84_[3])) {
			int i_85_ = anInt1866;
			int i_86_ = anInt1868;
			int i_87_ = anInt1865;
			if (is_82_ != null) {
				int i_88_ = i_87_ - is_84_[1];
				if (i_85_ < is_82_[i_88_] + is_84_[0])
					i_85_ = is_82_[i_88_] + is_84_[0];
				if (i_86_ > is_82_[i_88_] + is_83_[i_88_] + is_84_[0])
					i_86_ = is_82_[i_88_] + is_83_[i_88_] + is_84_[0];
				if (i_86_ - i_85_ <= 0)
					continue;
			}
			class180.method3410(i_85_, i_87_, i_86_ - i_85_, i_81_, 1);
		}
	}

	static void method2692() {
		anInt1864 = 0;
	}

	static void method2693() {
		anInt1864 = 0;
	}

	static void method2694(int[] is, int i, int i_89_) {
		int i_90_ = anInt1864 + (i_89_ << 1);
		if (anIntArray1867 == null || anIntArray1867.length < i_90_) {
			int[] is_91_ = new int[i_90_];
			for (int i_92_ = 0; i_92_ < anInt1864; i_92_++)
				is_91_[i_92_] = anIntArray1867[i_92_];
			anIntArray1867 = is_91_;
		}
		i_89_ += i;
		int i_93_ = i_89_ - 2;
		for (int i_94_ = i; i_94_ < i_89_; i_94_ += 2) {
			int i_95_ = is[i_93_ + 1];
			int i_96_ = is[i_94_ + 1];
			if (i_95_ < i_96_) {
				anIntArray1867[anInt1864++] = is[i_93_];
				anIntArray1867[anInt1864++] = i_95_;
				anIntArray1867[anInt1864++] = is[i_94_];
				anIntArray1867[anInt1864++] = i_96_;
			} else if (i_96_ < i_95_) {
				anIntArray1867[anInt1864++] = is[i_94_];
				anIntArray1867[anInt1864++] = i_96_;
				anIntArray1867[anInt1864++] = is[i_93_];
				anIntArray1867[anInt1864++] = i_95_;
			}
			i_93_ = i_94_;
		}
	}

	static void method2695(int[] is, int i, int i_97_) {
		int i_98_ = anInt1864 + (i_97_ << 1);
		if (anIntArray1867 == null || anIntArray1867.length < i_98_) {
			int[] is_99_ = new int[i_98_];
			for (int i_100_ = 0; i_100_ < anInt1864; i_100_++)
				is_99_[i_100_] = anIntArray1867[i_100_];
			anIntArray1867 = is_99_;
		}
		i_97_ += i;
		int i_101_ = i_97_ - 2;
		for (int i_102_ = i; i_102_ < i_97_; i_102_ += 2) {
			int i_103_ = is[i_101_ + 1];
			int i_104_ = is[i_102_ + 1];
			if (i_103_ < i_104_) {
				anIntArray1867[anInt1864++] = is[i_101_];
				anIntArray1867[anInt1864++] = i_103_;
				anIntArray1867[anInt1864++] = is[i_102_];
				anIntArray1867[anInt1864++] = i_104_;
			} else if (i_104_ < i_103_) {
				anIntArray1867[anInt1864++] = is[i_102_];
				anIntArray1867[anInt1864++] = i_104_;
				anIntArray1867[anInt1864++] = is[i_101_];
				anIntArray1867[anInt1864++] = i_103_;
			}
			i_101_ = i_102_;
		}
	}

	public static void method2696(Class180 class180, int[] is, int i, int[] is_105_, int[] is_106_) {
		method2680(class180, is, 0, is.length, i, is_105_, is_106_);
	}

	static void method2697(int i) {
		if (anInt1864 < 0) {
			anInt1871 = 0;
			anInt1870 = 0;
			anInt1869 = 0;
			anInt1865 = 2147483646;
		} else {
			method2685(0, anInt1864);
			int i_107_ = anIntArray1867[1];
			if (i_107_ < i)
				i_107_ = i;
			int i_108_ = 0;
			int i_109_;
			for (i_109_ = 0; i_109_ < anInt1864; i_109_ += 4) {
				int i_110_ = anIntArray1867[i_109_ + 1];
				if (i_107_ < i_110_)
					break;
				int i_111_ = anIntArray1867[i_109_];
				int i_112_ = anIntArray1867[i_109_ + 2];
				int i_113_ = anIntArray1867[i_109_ + 3];
				int i_114_ = (i_112_ - i_111_ << 16) / (i_113_ - i_110_);
				int i_115_ = (i_111_ << 16) + 32768;
				anIntArray1867[i_109_] = i_115_ + (i_107_ - i_110_) * i_114_;
				anIntArray1867[i_109_ + 2] = i_114_;
			}
			anInt1869 = i_108_;
			anInt1870 = i_109_;
			anInt1871 = i_109_;
			anInt1865 = i_107_ - 1;
		}
	}

	public static void method2698(Class180 class180, int[] is, int i) {
		method2680(class180, is, 0, is.length, i, null, null);
	}

	static void method2699(int i, int i_116_) {
		if (i_116_ > i + 4) {
			int i_117_ = i;
			int i_118_ = anIntArray1867[i_117_];
			int i_119_ = anIntArray1867[i_117_ + 1];
			int i_120_ = anIntArray1867[i_117_ + 2];
			int i_121_ = anIntArray1867[i_117_ + 3];
			for (int i_122_ = i + 4; i_122_ < i_116_; i_122_ += 4) {
				int i_123_ = anIntArray1867[i_122_ + 1];
				if (i_123_ < i_119_) {
					anIntArray1867[i_117_] = anIntArray1867[i_122_];
					anIntArray1867[i_117_ + 1] = i_123_;
					anIntArray1867[i_117_ + 2] = anIntArray1867[i_122_ + 2];
					anIntArray1867[i_117_ + 3] = anIntArray1867[i_122_ + 3];
					i_117_ += 4;
					anIntArray1867[i_122_] = anIntArray1867[i_117_];
					anIntArray1867[i_122_ + 1] = anIntArray1867[i_117_ + 1];
					anIntArray1867[i_122_ + 2] = anIntArray1867[i_117_ + 2];
					anIntArray1867[i_122_ + 3] = anIntArray1867[i_117_ + 3];
				}
			}
			anIntArray1867[i_117_] = i_118_;
			anIntArray1867[i_117_ + 1] = i_119_;
			anIntArray1867[i_117_ + 2] = i_120_;
			anIntArray1867[i_117_ + 3] = i_121_;
			method2685(i, i_117_);
			method2685(i_117_ + 4, i_116_);
		}
	}

	static void method2700() {
		anInt1864 = 0;
	}

	static void method2701(int i, int i_124_) {
		for (/**/; i_124_ >= i + 8; i_124_ -= 4) {
			boolean bool = true;
			for (int i_125_ = i + 4; i_125_ < i_124_; i_125_ += 4) {
				int i_126_ = anIntArray1867[i_125_ - 4];
				int i_127_ = anIntArray1867[i_125_];
				if (i_126_ > i_127_) {
					bool = false;
					anIntArray1867[i_125_ - 4] = i_127_;
					anIntArray1867[i_125_] = i_126_;
					i_126_ = anIntArray1867[i_125_ - 2];
					anIntArray1867[i_125_ - 2] = anIntArray1867[i_125_ + 2];
					anIntArray1867[i_125_ + 2] = i_126_;
					i_126_ = anIntArray1867[i_125_ - 1];
					anIntArray1867[i_125_ - 1] = anIntArray1867[i_125_ + 3];
					anIntArray1867[i_125_ + 3] = i_126_;
				}
			}
			if (bool)
				break;
		}
	}

	static void method2702(int i) {
		if (anInt1864 < 0) {
			anInt1871 = 0;
			anInt1870 = 0;
			anInt1869 = 0;
			anInt1865 = 2147483646;
		} else {
			method2685(0, anInt1864);
			int i_128_ = anIntArray1867[1];
			if (i_128_ < i)
				i_128_ = i;
			int i_129_ = 0;
			int i_130_;
			for (i_130_ = 0; i_130_ < anInt1864; i_130_ += 4) {
				int i_131_ = anIntArray1867[i_130_ + 1];
				if (i_128_ < i_131_)
					break;
				int i_132_ = anIntArray1867[i_130_];
				int i_133_ = anIntArray1867[i_130_ + 2];
				int i_134_ = anIntArray1867[i_130_ + 3];
				int i_135_ = (i_133_ - i_132_ << 16) / (i_134_ - i_131_);
				int i_136_ = (i_132_ << 16) + 32768;
				anIntArray1867[i_130_] = i_136_ + (i_128_ - i_131_) * i_135_;
				anIntArray1867[i_130_ + 2] = i_135_;
			}
			anInt1869 = i_129_;
			anInt1870 = i_130_;
			anInt1871 = i_130_;
			anInt1865 = i_128_ - 1;
		}
	}

	static void method2703(int i, int i_137_) {
		for (/**/; i_137_ >= i + 8; i_137_ -= 4) {
			boolean bool = true;
			for (int i_138_ = i + 4; i_138_ < i_137_; i_138_ += 4) {
				int i_139_ = anIntArray1867[i_138_ - 4];
				int i_140_ = anIntArray1867[i_138_];
				if (i_139_ > i_140_) {
					bool = false;
					anIntArray1867[i_138_ - 4] = i_140_;
					anIntArray1867[i_138_] = i_139_;
					i_139_ = anIntArray1867[i_138_ - 2];
					anIntArray1867[i_138_ - 2] = anIntArray1867[i_138_ + 2];
					anIntArray1867[i_138_ + 2] = i_139_;
					i_139_ = anIntArray1867[i_138_ - 1];
					anIntArray1867[i_138_ - 1] = anIntArray1867[i_138_ + 3];
					anIntArray1867[i_138_ + 3] = i_139_;
				}
			}
			if (bool)
				break;
		}
	}
}
