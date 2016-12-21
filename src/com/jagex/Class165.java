/* Class165 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class165 {
	static int anInt1832;
	static int anInt1833;
	static int anInt1834;
	static int anInt1835;
	static int anInt1836;
	static int anInt1837;
	static int[] anIntArray1838;
	static int anInt1839;

	Class165() throws Throwable {
		throw new Error();
	}

	public static void method1975(Class167 class167, int[] is, int i, int[] is_0_, int[] is_1_) {
		method1983(class167, is, 0, is.length, i, is_0_, is_1_);
	}

	static boolean method1976(int i) {
		int i_2_ = anInt1839;
		int i_3_ = anInt1832;
		int i_4_ = anInt1835;
		int i_5_;
		for (/**/; i_3_ >= i_2_; i_3_ = i_5_) {
			anInt1835 = ++i_4_;
			if (i_4_ >= i)
				return false;
			i_5_ = anInt1837;
			for (/**/; i_2_ < anInt1836; i_2_ += 4) {
				int i_6_ = anIntArray1838[i_2_ + 1];
				if (i_4_ < i_6_)
					break;
				int i_7_ = anIntArray1838[i_2_];
				int i_8_ = anIntArray1838[i_2_ + 2];
				int i_9_ = anIntArray1838[i_2_ + 3];
				int i_10_ = (i_8_ - i_7_ << 16) / (i_9_ - i_6_);
				int i_11_ = (i_7_ << 16) + 32768;
				anIntArray1838[i_2_] = i_11_;
				anIntArray1838[i_2_ + 2] = i_10_;
			}
			for (int i_12_ = i_5_; i_12_ < i_2_; i_12_ += 4) {
				int i_13_ = anIntArray1838[i_12_ + 3];
				if (i_4_ >= i_13_) {
					anIntArray1838[i_12_] = anIntArray1838[i_5_];
					anIntArray1838[i_12_ + 1] = anIntArray1838[i_5_ + 1];
					anIntArray1838[i_12_ + 2] = anIntArray1838[i_5_ + 2];
					anIntArray1838[i_12_ + 3] = anIntArray1838[i_5_ + 3];
					i_5_ += 4;
				}
			}
			if (i_5_ == anInt1836) {
				anInt1836 = 0;
				return false;
			}
			method1982(i_5_, i_2_);
			anInt1837 = i_5_;
			anInt1839 = i_2_;
		}
		anInt1834 = anIntArray1838[i_3_] >> 16;
		anInt1833 = anIntArray1838[i_3_ + 4] >> 16;
		anIntArray1838[i_3_] += anIntArray1838[i_3_ + 2];
		anIntArray1838[i_3_ + 4] += anIntArray1838[i_3_ + 6];
		i_3_ += 8;
		anInt1832 = i_3_;
		return true;
	}

	static void method1977() {
		anInt1836 = 0;
	}

	static void method1978(int[] is, int i, int i_14_) {
		int i_15_ = anInt1836 + (i_14_ << 1);
		if (anIntArray1838 == null || anIntArray1838.length < i_15_) {
			int[] is_16_ = new int[i_15_];
			for (int i_17_ = 0; i_17_ < anInt1836; i_17_++)
				is_16_[i_17_] = anIntArray1838[i_17_];
			anIntArray1838 = is_16_;
		}
		i_14_ += i;
		int i_18_ = i_14_ - 2;
		for (int i_19_ = i; i_19_ < i_14_; i_19_ += 2) {
			int i_20_ = is[i_18_ + 1];
			int i_21_ = is[i_19_ + 1];
			if (i_20_ < i_21_) {
				anIntArray1838[anInt1836++] = is[i_18_];
				anIntArray1838[anInt1836++] = i_20_;
				anIntArray1838[anInt1836++] = is[i_19_];
				anIntArray1838[anInt1836++] = i_21_;
			} else if (i_21_ < i_20_) {
				anIntArray1838[anInt1836++] = is[i_19_];
				anIntArray1838[anInt1836++] = i_21_;
				anIntArray1838[anInt1836++] = is[i_18_];
				anIntArray1838[anInt1836++] = i_20_;
			}
			i_18_ = i_19_;
		}
	}

	static void method1979(int i) {
		if (anInt1836 < 0) {
			anInt1832 = 0;
			anInt1839 = 0;
			anInt1837 = 0;
			anInt1835 = 2147483646;
		} else {
			method1981(0, anInt1836);
			int i_22_ = anIntArray1838[1];
			if (i_22_ < i)
				i_22_ = i;
			int i_23_ = 0;
			int i_24_;
			for (i_24_ = 0; i_24_ < anInt1836; i_24_ += 4) {
				int i_25_ = anIntArray1838[i_24_ + 1];
				if (i_22_ < i_25_)
					break;
				int i_26_ = anIntArray1838[i_24_];
				int i_27_ = anIntArray1838[i_24_ + 2];
				int i_28_ = anIntArray1838[i_24_ + 3];
				int i_29_ = (i_27_ - i_26_ << 16) / (i_28_ - i_25_);
				int i_30_ = (i_26_ << 16) + 32768;
				anIntArray1838[i_24_] = i_30_ + (i_22_ - i_25_) * i_29_;
				anIntArray1838[i_24_ + 2] = i_29_;
			}
			anInt1837 = i_23_;
			anInt1839 = i_24_;
			anInt1832 = i_24_;
			anInt1835 = i_22_ - 1;
		}
	}

	static void method1980(int i, int i_31_) {
		if (i_31_ > i + 4) {
			int i_32_ = i;
			int i_33_ = anIntArray1838[i_32_];
			int i_34_ = anIntArray1838[i_32_ + 1];
			int i_35_ = anIntArray1838[i_32_ + 2];
			int i_36_ = anIntArray1838[i_32_ + 3];
			for (int i_37_ = i + 4; i_37_ < i_31_; i_37_ += 4) {
				int i_38_ = anIntArray1838[i_37_ + 1];
				if (i_38_ < i_34_) {
					anIntArray1838[i_32_] = anIntArray1838[i_37_];
					anIntArray1838[i_32_ + 1] = i_38_;
					anIntArray1838[i_32_ + 2] = anIntArray1838[i_37_ + 2];
					anIntArray1838[i_32_ + 3] = anIntArray1838[i_37_ + 3];
					i_32_ += 4;
					anIntArray1838[i_37_] = anIntArray1838[i_32_];
					anIntArray1838[i_37_ + 1] = anIntArray1838[i_32_ + 1];
					anIntArray1838[i_37_ + 2] = anIntArray1838[i_32_ + 2];
					anIntArray1838[i_37_ + 3] = anIntArray1838[i_32_ + 3];
				}
			}
			anIntArray1838[i_32_] = i_33_;
			anIntArray1838[i_32_ + 1] = i_34_;
			anIntArray1838[i_32_ + 2] = i_35_;
			anIntArray1838[i_32_ + 3] = i_36_;
			method1981(i, i_32_);
			method1981(i_32_ + 4, i_31_);
		}
	}

	static void method1981(int i, int i_39_) {
		if (i_39_ > i + 4) {
			int i_40_ = i;
			int i_41_ = anIntArray1838[i_40_];
			int i_42_ = anIntArray1838[i_40_ + 1];
			int i_43_ = anIntArray1838[i_40_ + 2];
			int i_44_ = anIntArray1838[i_40_ + 3];
			for (int i_45_ = i + 4; i_45_ < i_39_; i_45_ += 4) {
				int i_46_ = anIntArray1838[i_45_ + 1];
				if (i_46_ < i_42_) {
					anIntArray1838[i_40_] = anIntArray1838[i_45_];
					anIntArray1838[i_40_ + 1] = i_46_;
					anIntArray1838[i_40_ + 2] = anIntArray1838[i_45_ + 2];
					anIntArray1838[i_40_ + 3] = anIntArray1838[i_45_ + 3];
					i_40_ += 4;
					anIntArray1838[i_45_] = anIntArray1838[i_40_];
					anIntArray1838[i_45_ + 1] = anIntArray1838[i_40_ + 1];
					anIntArray1838[i_45_ + 2] = anIntArray1838[i_40_ + 2];
					anIntArray1838[i_45_ + 3] = anIntArray1838[i_40_ + 3];
				}
			}
			anIntArray1838[i_40_] = i_41_;
			anIntArray1838[i_40_ + 1] = i_42_;
			anIntArray1838[i_40_ + 2] = i_43_;
			anIntArray1838[i_40_ + 3] = i_44_;
			method1981(i, i_40_);
			method1981(i_40_ + 4, i_39_);
		}
	}

	static void method1982(int i, int i_47_) {
		for (/**/; i_47_ >= i + 8; i_47_ -= 4) {
			boolean bool = true;
			for (int i_48_ = i + 4; i_48_ < i_47_; i_48_ += 4) {
				int i_49_ = anIntArray1838[i_48_ - 4];
				int i_50_ = anIntArray1838[i_48_];
				if (i_49_ > i_50_) {
					bool = false;
					anIntArray1838[i_48_ - 4] = i_50_;
					anIntArray1838[i_48_] = i_49_;
					i_49_ = anIntArray1838[i_48_ - 2];
					anIntArray1838[i_48_ - 2] = anIntArray1838[i_48_ + 2];
					anIntArray1838[i_48_ + 2] = i_49_;
					i_49_ = anIntArray1838[i_48_ - 1];
					anIntArray1838[i_48_ - 1] = anIntArray1838[i_48_ + 3];
					anIntArray1838[i_48_ + 3] = i_49_;
				}
			}
			if (bool)
				break;
		}
	}

	static void method1983(Class167 class167, int[] is, int i, int i_51_, int i_52_, int[] is_53_, int[] is_54_) {
		int[] is_55_ = new int[4];
		class167.method2054(is_55_);
		if (is_53_ != null && is_55_[3] - is_55_[1] != is_53_.length)
			throw new IllegalStateException();
		method1977();
		method1978(is, i, i_51_);
		method1979(is_55_[1]);
		while (method1976(is_55_[3])) {
			int i_56_ = anInt1834;
			int i_57_ = anInt1833;
			int i_58_ = anInt1835;
			if (is_53_ != null) {
				int i_59_ = i_58_ - is_55_[1];
				if (i_56_ < is_53_[i_59_] + is_55_[0])
					i_56_ = is_53_[i_59_] + is_55_[0];
				if (i_57_ > is_53_[i_59_] + is_54_[i_59_] + is_55_[0])
					i_57_ = is_53_[i_59_] + is_54_[i_59_] + is_55_[0];
				if (i_57_ - i_56_ <= 0)
					continue;
			}
			class167.method2066(i_56_, i_58_, i_57_ - i_56_, i_52_, 1);
		}
	}

	public static void method1984(Class167 class167, int[] is, int i) {
		method1983(class167, is, 0, is.length, i, null, null);
	}

	static void method1985() {
		anInt1836 = 0;
	}

	static void method1986(int i) {
		if (anInt1836 < 0) {
			anInt1832 = 0;
			anInt1839 = 0;
			anInt1837 = 0;
			anInt1835 = 2147483646;
		} else {
			method1981(0, anInt1836);
			int i_60_ = anIntArray1838[1];
			if (i_60_ < i)
				i_60_ = i;
			int i_61_ = 0;
			int i_62_;
			for (i_62_ = 0; i_62_ < anInt1836; i_62_ += 4) {
				int i_63_ = anIntArray1838[i_62_ + 1];
				if (i_60_ < i_63_)
					break;
				int i_64_ = anIntArray1838[i_62_];
				int i_65_ = anIntArray1838[i_62_ + 2];
				int i_66_ = anIntArray1838[i_62_ + 3];
				int i_67_ = (i_65_ - i_64_ << 16) / (i_66_ - i_63_);
				int i_68_ = (i_64_ << 16) + 32768;
				anIntArray1838[i_62_] = i_68_ + (i_60_ - i_63_) * i_67_;
				anIntArray1838[i_62_ + 2] = i_67_;
			}
			anInt1837 = i_61_;
			anInt1839 = i_62_;
			anInt1832 = i_62_;
			anInt1835 = i_60_ - 1;
		}
	}

	static boolean method1987(int i) {
		int i_69_ = anInt1839;
		int i_70_ = anInt1832;
		int i_71_ = anInt1835;
		int i_72_;
		for (/**/; i_70_ >= i_69_; i_70_ = i_72_) {
			anInt1835 = ++i_71_;
			if (i_71_ >= i)
				return false;
			i_72_ = anInt1837;
			for (/**/; i_69_ < anInt1836; i_69_ += 4) {
				int i_73_ = anIntArray1838[i_69_ + 1];
				if (i_71_ < i_73_)
					break;
				int i_74_ = anIntArray1838[i_69_];
				int i_75_ = anIntArray1838[i_69_ + 2];
				int i_76_ = anIntArray1838[i_69_ + 3];
				int i_77_ = (i_75_ - i_74_ << 16) / (i_76_ - i_73_);
				int i_78_ = (i_74_ << 16) + 32768;
				anIntArray1838[i_69_] = i_78_;
				anIntArray1838[i_69_ + 2] = i_77_;
			}
			for (int i_79_ = i_72_; i_79_ < i_69_; i_79_ += 4) {
				int i_80_ = anIntArray1838[i_79_ + 3];
				if (i_71_ >= i_80_) {
					anIntArray1838[i_79_] = anIntArray1838[i_72_];
					anIntArray1838[i_79_ + 1] = anIntArray1838[i_72_ + 1];
					anIntArray1838[i_79_ + 2] = anIntArray1838[i_72_ + 2];
					anIntArray1838[i_79_ + 3] = anIntArray1838[i_72_ + 3];
					i_72_ += 4;
				}
			}
			if (i_72_ == anInt1836) {
				anInt1836 = 0;
				return false;
			}
			method1982(i_72_, i_69_);
			anInt1837 = i_72_;
			anInt1839 = i_69_;
		}
		anInt1834 = anIntArray1838[i_70_] >> 16;
		anInt1833 = anIntArray1838[i_70_ + 4] >> 16;
		anIntArray1838[i_70_] += anIntArray1838[i_70_ + 2];
		anIntArray1838[i_70_ + 4] += anIntArray1838[i_70_ + 6];
		i_70_ += 8;
		anInt1832 = i_70_;
		return true;
	}

	static boolean method1988(int i) {
		int i_81_ = anInt1839;
		int i_82_ = anInt1832;
		int i_83_ = anInt1835;
		int i_84_;
		for (/**/; i_82_ >= i_81_; i_82_ = i_84_) {
			anInt1835 = ++i_83_;
			if (i_83_ >= i)
				return false;
			i_84_ = anInt1837;
			for (/**/; i_81_ < anInt1836; i_81_ += 4) {
				int i_85_ = anIntArray1838[i_81_ + 1];
				if (i_83_ < i_85_)
					break;
				int i_86_ = anIntArray1838[i_81_];
				int i_87_ = anIntArray1838[i_81_ + 2];
				int i_88_ = anIntArray1838[i_81_ + 3];
				int i_89_ = (i_87_ - i_86_ << 16) / (i_88_ - i_85_);
				int i_90_ = (i_86_ << 16) + 32768;
				anIntArray1838[i_81_] = i_90_;
				anIntArray1838[i_81_ + 2] = i_89_;
			}
			for (int i_91_ = i_84_; i_91_ < i_81_; i_91_ += 4) {
				int i_92_ = anIntArray1838[i_91_ + 3];
				if (i_83_ >= i_92_) {
					anIntArray1838[i_91_] = anIntArray1838[i_84_];
					anIntArray1838[i_91_ + 1] = anIntArray1838[i_84_ + 1];
					anIntArray1838[i_91_ + 2] = anIntArray1838[i_84_ + 2];
					anIntArray1838[i_91_ + 3] = anIntArray1838[i_84_ + 3];
					i_84_ += 4;
				}
			}
			if (i_84_ == anInt1836) {
				anInt1836 = 0;
				return false;
			}
			method1982(i_84_, i_81_);
			anInt1837 = i_84_;
			anInt1839 = i_81_;
		}
		anInt1834 = anIntArray1838[i_82_] >> 16;
		anInt1833 = anIntArray1838[i_82_ + 4] >> 16;
		anIntArray1838[i_82_] += anIntArray1838[i_82_ + 2];
		anIntArray1838[i_82_ + 4] += anIntArray1838[i_82_ + 6];
		i_82_ += 8;
		anInt1832 = i_82_;
		return true;
	}

	static void method1989(int i, int i_93_) {
		for (/**/; i_93_ >= i + 8; i_93_ -= 4) {
			boolean bool = true;
			for (int i_94_ = i + 4; i_94_ < i_93_; i_94_ += 4) {
				int i_95_ = anIntArray1838[i_94_ - 4];
				int i_96_ = anIntArray1838[i_94_];
				if (i_95_ > i_96_) {
					bool = false;
					anIntArray1838[i_94_ - 4] = i_96_;
					anIntArray1838[i_94_] = i_95_;
					i_95_ = anIntArray1838[i_94_ - 2];
					anIntArray1838[i_94_ - 2] = anIntArray1838[i_94_ + 2];
					anIntArray1838[i_94_ + 2] = i_95_;
					i_95_ = anIntArray1838[i_94_ - 1];
					anIntArray1838[i_94_ - 1] = anIntArray1838[i_94_ + 3];
					anIntArray1838[i_94_ + 3] = i_95_;
				}
			}
			if (bool)
				break;
		}
	}

	static void method1990(int i, int i_97_) {
		if (i_97_ > i + 4) {
			int i_98_ = i;
			int i_99_ = anIntArray1838[i_98_];
			int i_100_ = anIntArray1838[i_98_ + 1];
			int i_101_ = anIntArray1838[i_98_ + 2];
			int i_102_ = anIntArray1838[i_98_ + 3];
			for (int i_103_ = i + 4; i_103_ < i_97_; i_103_ += 4) {
				int i_104_ = anIntArray1838[i_103_ + 1];
				if (i_104_ < i_100_) {
					anIntArray1838[i_98_] = anIntArray1838[i_103_];
					anIntArray1838[i_98_ + 1] = i_104_;
					anIntArray1838[i_98_ + 2] = anIntArray1838[i_103_ + 2];
					anIntArray1838[i_98_ + 3] = anIntArray1838[i_103_ + 3];
					i_98_ += 4;
					anIntArray1838[i_103_] = anIntArray1838[i_98_];
					anIntArray1838[i_103_ + 1] = anIntArray1838[i_98_ + 1];
					anIntArray1838[i_103_ + 2] = anIntArray1838[i_98_ + 2];
					anIntArray1838[i_103_ + 3] = anIntArray1838[i_98_ + 3];
				}
			}
			anIntArray1838[i_98_] = i_99_;
			anIntArray1838[i_98_ + 1] = i_100_;
			anIntArray1838[i_98_ + 2] = i_101_;
			anIntArray1838[i_98_ + 3] = i_102_;
			method1981(i, i_98_);
			method1981(i_98_ + 4, i_97_);
		}
	}

	static void method1991(int i, int i_105_) {
		if (i_105_ > i + 4) {
			int i_106_ = i;
			int i_107_ = anIntArray1838[i_106_];
			int i_108_ = anIntArray1838[i_106_ + 1];
			int i_109_ = anIntArray1838[i_106_ + 2];
			int i_110_ = anIntArray1838[i_106_ + 3];
			for (int i_111_ = i + 4; i_111_ < i_105_; i_111_ += 4) {
				int i_112_ = anIntArray1838[i_111_ + 1];
				if (i_112_ < i_108_) {
					anIntArray1838[i_106_] = anIntArray1838[i_111_];
					anIntArray1838[i_106_ + 1] = i_112_;
					anIntArray1838[i_106_ + 2] = anIntArray1838[i_111_ + 2];
					anIntArray1838[i_106_ + 3] = anIntArray1838[i_111_ + 3];
					i_106_ += 4;
					anIntArray1838[i_111_] = anIntArray1838[i_106_];
					anIntArray1838[i_111_ + 1] = anIntArray1838[i_106_ + 1];
					anIntArray1838[i_111_ + 2] = anIntArray1838[i_106_ + 2];
					anIntArray1838[i_111_ + 3] = anIntArray1838[i_106_ + 3];
				}
			}
			anIntArray1838[i_106_] = i_107_;
			anIntArray1838[i_106_ + 1] = i_108_;
			anIntArray1838[i_106_ + 2] = i_109_;
			anIntArray1838[i_106_ + 3] = i_110_;
			method1981(i, i_106_);
			method1981(i_106_ + 4, i_105_);
		}
	}

	static void method1992(int i, int i_113_) {
		for (/**/; i_113_ >= i + 8; i_113_ -= 4) {
			boolean bool = true;
			for (int i_114_ = i + 4; i_114_ < i_113_; i_114_ += 4) {
				int i_115_ = anIntArray1838[i_114_ - 4];
				int i_116_ = anIntArray1838[i_114_];
				if (i_115_ > i_116_) {
					bool = false;
					anIntArray1838[i_114_ - 4] = i_116_;
					anIntArray1838[i_114_] = i_115_;
					i_115_ = anIntArray1838[i_114_ - 2];
					anIntArray1838[i_114_ - 2] = anIntArray1838[i_114_ + 2];
					anIntArray1838[i_114_ + 2] = i_115_;
					i_115_ = anIntArray1838[i_114_ - 1];
					anIntArray1838[i_114_ - 1] = anIntArray1838[i_114_ + 3];
					anIntArray1838[i_114_ + 3] = i_115_;
				}
			}
			if (bool)
				break;
		}
	}

	static void method1993(int i) {
		if (anInt1836 < 0) {
			anInt1832 = 0;
			anInt1839 = 0;
			anInt1837 = 0;
			anInt1835 = 2147483646;
		} else {
			method1981(0, anInt1836);
			int i_117_ = anIntArray1838[1];
			if (i_117_ < i)
				i_117_ = i;
			int i_118_ = 0;
			int i_119_;
			for (i_119_ = 0; i_119_ < anInt1836; i_119_ += 4) {
				int i_120_ = anIntArray1838[i_119_ + 1];
				if (i_117_ < i_120_)
					break;
				int i_121_ = anIntArray1838[i_119_];
				int i_122_ = anIntArray1838[i_119_ + 2];
				int i_123_ = anIntArray1838[i_119_ + 3];
				int i_124_ = (i_122_ - i_121_ << 16) / (i_123_ - i_120_);
				int i_125_ = (i_121_ << 16) + 32768;
				anIntArray1838[i_119_] = i_125_ + (i_117_ - i_120_) * i_124_;
				anIntArray1838[i_119_ + 2] = i_124_;
			}
			anInt1837 = i_118_;
			anInt1839 = i_119_;
			anInt1832 = i_119_;
			anInt1835 = i_117_ - 1;
		}
	}
}
