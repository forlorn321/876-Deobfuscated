/* Class688 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class688 {
	static final int anInt8680 = 4096;
	static final int anInt8681 = 16;
	static final int anInt8682 = 23;
	static final int anInt8683 = 0;
	static final int anInt8684 = 1;
	static final int anInt8685 = 6;
	static final int anInt8686 = 50;
	static Class690 aClass690_8687 = new Class690();

	static byte method13962(Class690 class690) {
		return (byte) method13968(8, class690);
	}

	static void method13963(Class690 class690) {
		byte i = class690.aByte8706;
		int i_0_ = class690.anInt8725 * 2083000921;
		int i_1_ = class690.anInt8715 * -675038417;
		int i_2_ = class690.anInt8713 * 1594652859;
		int[] is = Class210.anIntArray2252;
		int i_3_ = class690.anInt8712 * 1175011593;
		byte[] is_4_ = class690.aByteArray8702;
		int i_5_ = class690.anInt8703 * -2055993169;
		int i_6_ = class690.anInt8704 * 1028562795;
		int i_7_ = i_6_;
		int i_8_ = class690.anInt8693 * -604561083 + 1;
		while_127_: for (;;) {
			if (i_0_ > 0) {
				for (;;) {
					if (i_6_ == 0)
						break while_127_;
					if (i_0_ == 1)
						break;
					is_4_[i_5_] = i;
					i_0_--;
					i_5_++;
					i_6_--;
				}
				if (i_6_ == 0) {
					i_0_ = 1;
					break;
				}
				is_4_[i_5_] = i;
				i_5_++;
				i_6_--;
			}
			for (;;) {
				if (i_1_ == i_8_) {
					i_0_ = 0;
					break while_127_;
				}
				i = (byte) i_2_;
				i_3_ = is[i_3_];
				int i_9_ = (byte) i_3_;
				i_3_ >>= 8;
				i_1_++;
				if (i_9_ != i_2_) {
					i_2_ = i_9_;
					if (i_6_ == 0) {
						i_0_ = 1;
						break while_127_;
					}
					is_4_[i_5_] = i;
					i_5_++;
					i_6_--;
				} else {
					if (i_1_ != i_8_)
						break;
					if (i_6_ == 0) {
						i_0_ = 1;
						break while_127_;
					}
					is_4_[i_5_] = i;
					i_5_++;
					i_6_--;
				}
			}
			i_0_ = 2;
			i_3_ = is[i_3_];
			int i_10_ = (byte) i_3_;
			i_3_ >>= 8;
			if (++i_1_ != i_8_) {
				if (i_10_ != i_2_)
					i_2_ = i_10_;
				else {
					i_0_ = 3;
					i_3_ = is[i_3_];
					i_10_ = (byte) i_3_;
					i_3_ >>= 8;
					if (++i_1_ != i_8_) {
						if (i_10_ != i_2_)
							i_2_ = i_10_;
						else {
							i_3_ = is[i_3_];
							i_10_ = (byte) i_3_;
							i_3_ >>= 8;
							i_1_++;
							i_0_ = (i_10_ & 0xff) + 4;
							i_3_ = is[i_3_];
							i_2_ = (byte) i_3_;
							i_3_ >>= 8;
							i_1_++;
						}
					}
				}
			}
		}
		int i_11_ = class690.anInt8705 * -1960319851;
		class690.anInt8705 += (i_7_ - i_6_) * -1669478723;
		if (class690.anInt8705 * -1960319851 >= i_11_) {
			/* empty */
		}
		class690.aByte8706 = i;
		class690.anInt8725 = i_0_ * 695604713;
		class690.anInt8715 = i_1_ * 313617359;
		class690.anInt8713 = i_2_ * 1709640819;
		Class210.anIntArray2252 = is;
		class690.anInt8712 = i_3_ * 1008639289;
		class690.aByteArray8702 = is_4_;
		class690.anInt8703 = i_5_ * 1026838095;
		class690.anInt8704 = i_6_ * -592865981;
	}

	static void method13964(Class690 class690) {
		byte i = class690.aByte8706;
		int i_12_ = class690.anInt8725 * 2083000921;
		int i_13_ = class690.anInt8715 * -675038417;
		int i_14_ = class690.anInt8713 * 1594652859;
		int[] is = Class210.anIntArray2252;
		int i_15_ = class690.anInt8712 * 1175011593;
		byte[] is_16_ = class690.aByteArray8702;
		int i_17_ = class690.anInt8703 * -2055993169;
		int i_18_ = class690.anInt8704 * 1028562795;
		int i_19_ = i_18_;
		int i_20_ = class690.anInt8693 * -604561083 + 1;
		while_128_: for (;;) {
			if (i_12_ > 0) {
				for (;;) {
					if (i_18_ == 0)
						break while_128_;
					if (i_12_ == 1)
						break;
					is_16_[i_17_] = i;
					i_12_--;
					i_17_++;
					i_18_--;
				}
				if (i_18_ == 0) {
					i_12_ = 1;
					break;
				}
				is_16_[i_17_] = i;
				i_17_++;
				i_18_--;
			}
			for (;;) {
				if (i_13_ == i_20_) {
					i_12_ = 0;
					break while_128_;
				}
				i = (byte) i_14_;
				i_15_ = is[i_15_];
				int i_21_ = (byte) i_15_;
				i_15_ >>= 8;
				i_13_++;
				if (i_21_ != i_14_) {
					i_14_ = i_21_;
					if (i_18_ == 0) {
						i_12_ = 1;
						break while_128_;
					}
					is_16_[i_17_] = i;
					i_17_++;
					i_18_--;
				} else {
					if (i_13_ != i_20_)
						break;
					if (i_18_ == 0) {
						i_12_ = 1;
						break while_128_;
					}
					is_16_[i_17_] = i;
					i_17_++;
					i_18_--;
				}
			}
			i_12_ = 2;
			i_15_ = is[i_15_];
			int i_22_ = (byte) i_15_;
			i_15_ >>= 8;
			if (++i_13_ != i_20_) {
				if (i_22_ != i_14_)
					i_14_ = i_22_;
				else {
					i_12_ = 3;
					i_15_ = is[i_15_];
					i_22_ = (byte) i_15_;
					i_15_ >>= 8;
					if (++i_13_ != i_20_) {
						if (i_22_ != i_14_)
							i_14_ = i_22_;
						else {
							i_15_ = is[i_15_];
							i_22_ = (byte) i_15_;
							i_15_ >>= 8;
							i_13_++;
							i_12_ = (i_22_ & 0xff) + 4;
							i_15_ = is[i_15_];
							i_14_ = (byte) i_15_;
							i_15_ >>= 8;
							i_13_++;
						}
					}
				}
			}
		}
		int i_23_ = class690.anInt8705 * -1960319851;
		class690.anInt8705 += (i_19_ - i_18_) * -1669478723;
		if (class690.anInt8705 * -1960319851 >= i_23_) {
			/* empty */
		}
		class690.aByte8706 = i;
		class690.anInt8725 = i_12_ * 695604713;
		class690.anInt8715 = i_13_ * 313617359;
		class690.anInt8713 = i_14_ * 1709640819;
		Class210.anIntArray2252 = is;
		class690.anInt8712 = i_15_ * 1008639289;
		class690.aByteArray8702 = is_16_;
		class690.anInt8703 = i_17_ * 1026838095;
		class690.anInt8704 = i_18_ * -592865981;
	}

	static byte method13965(Class690 class690) {
		return (byte) method13968(1, class690);
	}

	static int method13966(int i, Class690 class690) {
		for (;;) {
			if (class690.anInt8698 * 2140077089 >= i) {
				int i_24_ = ((class690.anInt8708 * 865505689 >> class690.anInt8698 * 2140077089 - i) & (1 << i) - 1);
				class690.anInt8698 -= i * 1753188321;
				return i_24_;
			}
			class690.anInt8708 = (class690.anInt8708 * 865505689 << 8 | (class690.aByteArray8711[class690.anInt8700 * -368139033] & 0xff)) * -1061539159;
			class690.anInt8698 += 1140604680;
			class690.anInt8700 += -1625411881;
			class690.anInt8730 += -35078353;
			if (class690.anInt8730 * 366405583 == 0) {
				/* empty */
			}
		}
	}

	static void method13967(Class690 class690) {
		class690.anInt8717 = 0;
		for (int i = 0; i < 256; i++) {
			if (class690.aBoolArray8718[i]) {
				class690.aByteArray8720[class690.anInt8717 * 1052091185] = (byte) i;
				class690.anInt8717 += 877581777;
			}
		}
	}

	static int method13968(int i, Class690 class690) {
		for (;;) {
			if (class690.anInt8698 * 2140077089 >= i) {
				int i_25_ = ((class690.anInt8708 * 865505689 >> class690.anInt8698 * 2140077089 - i) & (1 << i) - 1);
				class690.anInt8698 -= i * 1753188321;
				return i_25_;
			}
			class690.anInt8708 = (class690.anInt8708 * 865505689 << 8 | (class690.aByteArray8711[class690.anInt8700 * -368139033] & 0xff)) * -1061539159;
			class690.anInt8698 += 1140604680;
			class690.anInt8700 += -1625411881;
			class690.anInt8730 += -35078353;
			if (class690.anInt8730 * 366405583 == 0) {
				/* empty */
			}
		}
	}

	public static int method13969(byte[] is, int i, byte[] is_26_, int i_27_, int i_28_) {
		synchronized (aClass690_8687) {
			aClass690_8687.aByteArray8711 = is_26_;
			aClass690_8687.anInt8700 = i_28_ * -1625411881;
			aClass690_8687.aByteArray8702 = is;
			aClass690_8687.anInt8703 = 0;
			aClass690_8687.anInt8704 = i * -592865981;
			aClass690_8687.anInt8698 = 0;
			aClass690_8687.anInt8708 = 0;
			aClass690_8687.anInt8730 = 0;
			aClass690_8687.anInt8705 = 0;
			method13981(aClass690_8687);
			i -= aClass690_8687.anInt8704 * 1028562795;
			aClass690_8687.aByteArray8711 = null;
			aClass690_8687.aByteArray8702 = null;
			int i_29_ = i;
			return i_29_;
		}
	}

	static void method13970(Class690 class690) {
		byte i = class690.aByte8706;
		int i_30_ = class690.anInt8725 * 2083000921;
		int i_31_ = class690.anInt8715 * -675038417;
		int i_32_ = class690.anInt8713 * 1594652859;
		int[] is = Class210.anIntArray2252;
		int i_33_ = class690.anInt8712 * 1175011593;
		byte[] is_34_ = class690.aByteArray8702;
		int i_35_ = class690.anInt8703 * -2055993169;
		int i_36_ = class690.anInt8704 * 1028562795;
		int i_37_ = i_36_;
		int i_38_ = class690.anInt8693 * -604561083 + 1;
		while_129_: for (;;) {
			if (i_30_ > 0) {
				for (;;) {
					if (i_36_ == 0)
						break while_129_;
					if (i_30_ == 1)
						break;
					is_34_[i_35_] = i;
					i_30_--;
					i_35_++;
					i_36_--;
				}
				if (i_36_ == 0) {
					i_30_ = 1;
					break;
				}
				is_34_[i_35_] = i;
				i_35_++;
				i_36_--;
			}
			for (;;) {
				if (i_31_ == i_38_) {
					i_30_ = 0;
					break while_129_;
				}
				i = (byte) i_32_;
				i_33_ = is[i_33_];
				int i_39_ = (byte) i_33_;
				i_33_ >>= 8;
				i_31_++;
				if (i_39_ != i_32_) {
					i_32_ = i_39_;
					if (i_36_ == 0) {
						i_30_ = 1;
						break while_129_;
					}
					is_34_[i_35_] = i;
					i_35_++;
					i_36_--;
				} else {
					if (i_31_ != i_38_)
						break;
					if (i_36_ == 0) {
						i_30_ = 1;
						break while_129_;
					}
					is_34_[i_35_] = i;
					i_35_++;
					i_36_--;
				}
			}
			i_30_ = 2;
			i_33_ = is[i_33_];
			int i_40_ = (byte) i_33_;
			i_33_ >>= 8;
			if (++i_31_ != i_38_) {
				if (i_40_ != i_32_)
					i_32_ = i_40_;
				else {
					i_30_ = 3;
					i_33_ = is[i_33_];
					i_40_ = (byte) i_33_;
					i_33_ >>= 8;
					if (++i_31_ != i_38_) {
						if (i_40_ != i_32_)
							i_32_ = i_40_;
						else {
							i_33_ = is[i_33_];
							i_40_ = (byte) i_33_;
							i_33_ >>= 8;
							i_31_++;
							i_30_ = (i_40_ & 0xff) + 4;
							i_33_ = is[i_33_];
							i_32_ = (byte) i_33_;
							i_33_ >>= 8;
							i_31_++;
						}
					}
				}
			}
		}
		int i_41_ = class690.anInt8705 * -1960319851;
		class690.anInt8705 += (i_37_ - i_36_) * -1669478723;
		if (class690.anInt8705 * -1960319851 >= i_41_) {
			/* empty */
		}
		class690.aByte8706 = i;
		class690.anInt8725 = i_30_ * 695604713;
		class690.anInt8715 = i_31_ * 313617359;
		class690.anInt8713 = i_32_ * 1709640819;
		Class210.anIntArray2252 = is;
		class690.anInt8712 = i_33_ * 1008639289;
		class690.aByteArray8702 = is_34_;
		class690.anInt8703 = i_35_ * 1026838095;
		class690.anInt8704 = i_36_ * -592865981;
	}

	public static int method13971(byte[] is, int i, byte[] is_42_, int i_43_, int i_44_) {
		synchronized (aClass690_8687) {
			aClass690_8687.aByteArray8711 = is_42_;
			aClass690_8687.anInt8700 = i_44_ * -1625411881;
			aClass690_8687.aByteArray8702 = is;
			aClass690_8687.anInt8703 = 0;
			aClass690_8687.anInt8704 = i * -592865981;
			aClass690_8687.anInt8698 = 0;
			aClass690_8687.anInt8708 = 0;
			aClass690_8687.anInt8730 = 0;
			aClass690_8687.anInt8705 = 0;
			method13981(aClass690_8687);
			i -= aClass690_8687.anInt8704 * 1028562795;
			aClass690_8687.aByteArray8711 = null;
			aClass690_8687.aByteArray8702 = null;
			int i_45_ = i;
			return i_45_;
		}
	}

	static void method13972(Class690 class690) {
		byte i = class690.aByte8706;
		int i_46_ = class690.anInt8725 * 2083000921;
		int i_47_ = class690.anInt8715 * -675038417;
		int i_48_ = class690.anInt8713 * 1594652859;
		int[] is = Class210.anIntArray2252;
		int i_49_ = class690.anInt8712 * 1175011593;
		byte[] is_50_ = class690.aByteArray8702;
		int i_51_ = class690.anInt8703 * -2055993169;
		int i_52_ = class690.anInt8704 * 1028562795;
		int i_53_ = i_52_;
		int i_54_ = class690.anInt8693 * -604561083 + 1;
		while_130_: for (;;) {
			if (i_46_ > 0) {
				for (;;) {
					if (i_52_ == 0)
						break while_130_;
					if (i_46_ == 1)
						break;
					is_50_[i_51_] = i;
					i_46_--;
					i_51_++;
					i_52_--;
				}
				if (i_52_ == 0) {
					i_46_ = 1;
					break;
				}
				is_50_[i_51_] = i;
				i_51_++;
				i_52_--;
			}
			for (;;) {
				if (i_47_ == i_54_) {
					i_46_ = 0;
					break while_130_;
				}
				i = (byte) i_48_;
				i_49_ = is[i_49_];
				int i_55_ = (byte) i_49_;
				i_49_ >>= 8;
				i_47_++;
				if (i_55_ != i_48_) {
					i_48_ = i_55_;
					if (i_52_ == 0) {
						i_46_ = 1;
						break while_130_;
					}
					is_50_[i_51_] = i;
					i_51_++;
					i_52_--;
				} else {
					if (i_47_ != i_54_)
						break;
					if (i_52_ == 0) {
						i_46_ = 1;
						break while_130_;
					}
					is_50_[i_51_] = i;
					i_51_++;
					i_52_--;
				}
			}
			i_46_ = 2;
			i_49_ = is[i_49_];
			int i_56_ = (byte) i_49_;
			i_49_ >>= 8;
			if (++i_47_ != i_54_) {
				if (i_56_ != i_48_)
					i_48_ = i_56_;
				else {
					i_46_ = 3;
					i_49_ = is[i_49_];
					i_56_ = (byte) i_49_;
					i_49_ >>= 8;
					if (++i_47_ != i_54_) {
						if (i_56_ != i_48_)
							i_48_ = i_56_;
						else {
							i_49_ = is[i_49_];
							i_56_ = (byte) i_49_;
							i_49_ >>= 8;
							i_47_++;
							i_46_ = (i_56_ & 0xff) + 4;
							i_49_ = is[i_49_];
							i_48_ = (byte) i_49_;
							i_49_ >>= 8;
							i_47_++;
						}
					}
				}
			}
		}
		int i_57_ = class690.anInt8705 * -1960319851;
		class690.anInt8705 += (i_53_ - i_52_) * -1669478723;
		if (class690.anInt8705 * -1960319851 >= i_57_) {
			/* empty */
		}
		class690.aByte8706 = i;
		class690.anInt8725 = i_46_ * 695604713;
		class690.anInt8715 = i_47_ * 313617359;
		class690.anInt8713 = i_48_ * 1709640819;
		Class210.anIntArray2252 = is;
		class690.anInt8712 = i_49_ * 1008639289;
		class690.aByteArray8702 = is_50_;
		class690.anInt8703 = i_51_ * 1026838095;
		class690.anInt8704 = i_52_ * -592865981;
	}

	static void method13973(int[] is, int[] is_58_, int[] is_59_, byte[] is_60_, int i, int i_61_, int i_62_) {
		int i_63_ = 0;
		for (int i_64_ = i; i_64_ <= i_61_; i_64_++) {
			for (int i_65_ = 0; i_65_ < i_62_; i_65_++) {
				if (is_60_[i_65_] == i_64_) {
					is_59_[i_63_] = i_65_;
					i_63_++;
				}
			}
		}
		for (int i_66_ = 0; i_66_ < 23; i_66_++)
			is_58_[i_66_] = 0;
		for (int i_67_ = 0; i_67_ < i_62_; i_67_++)
			is_58_[is_60_[i_67_] + 1]++;
		for (int i_68_ = 1; i_68_ < 23; i_68_++)
			is_58_[i_68_] += is_58_[i_68_ - 1];
		for (int i_69_ = 0; i_69_ < 23; i_69_++)
			is[i_69_] = 0;
		int i_70_ = 0;
		for (int i_71_ = i; i_71_ <= i_61_; i_71_++) {
			i_70_ += is_58_[i_71_ + 1] - is_58_[i_71_];
			is[i_71_] = i_70_ - 1;
			i_70_ <<= 1;
		}
		for (int i_72_ = i + 1; i_72_ <= i_61_; i_72_++)
			is_58_[i_72_] = (is[i_72_ - 1] + 1 << 1) - is_58_[i_72_];
	}

	static int method13974(int i, Class690 class690) {
		for (;;) {
			if (class690.anInt8698 * 2140077089 >= i) {
				int i_73_ = ((class690.anInt8708 * 865505689 >> class690.anInt8698 * 2140077089 - i) & (1 << i) - 1);
				class690.anInt8698 -= i * 1753188321;
				return i_73_;
			}
			class690.anInt8708 = (class690.anInt8708 * 865505689 << 8 | (class690.aByteArray8711[class690.anInt8700 * -368139033] & 0xff)) * -1061539159;
			class690.anInt8698 += 1140604680;
			class690.anInt8700 += -1625411881;
			class690.anInt8730 += -35078353;
			if (class690.anInt8730 * 366405583 == 0) {
				/* empty */
			}
		}
	}

	static byte method13975(Class690 class690) {
		return (byte) method13968(8, class690);
	}

	static byte method13976(Class690 class690) {
		return (byte) method13968(1, class690);
	}

	static byte method13977(Class690 class690) {
		return (byte) method13968(1, class690);
	}

	static byte method13978(Class690 class690) {
		return (byte) method13968(1, class690);
	}

	static void method13979(int[] is, int[] is_74_, int[] is_75_, byte[] is_76_, int i, int i_77_, int i_78_) {
		int i_79_ = 0;
		for (int i_80_ = i; i_80_ <= i_77_; i_80_++) {
			for (int i_81_ = 0; i_81_ < i_78_; i_81_++) {
				if (is_76_[i_81_] == i_80_) {
					is_75_[i_79_] = i_81_;
					i_79_++;
				}
			}
		}
		for (int i_82_ = 0; i_82_ < 23; i_82_++)
			is_74_[i_82_] = 0;
		for (int i_83_ = 0; i_83_ < i_78_; i_83_++)
			is_74_[is_76_[i_83_] + 1]++;
		for (int i_84_ = 1; i_84_ < 23; i_84_++)
			is_74_[i_84_] += is_74_[i_84_ - 1];
		for (int i_85_ = 0; i_85_ < 23; i_85_++)
			is[i_85_] = 0;
		int i_86_ = 0;
		for (int i_87_ = i; i_87_ <= i_77_; i_87_++) {
			i_86_ += is_74_[i_87_ + 1] - is_74_[i_87_];
			is[i_87_] = i_86_ - 1;
			i_86_ <<= 1;
		}
		for (int i_88_ = i + 1; i_88_ <= i_77_; i_88_++)
			is_74_[i_88_] = (is[i_88_ - 1] + 1 << 1) - is_74_[i_88_];
	}

	static int method13980(int i, Class690 class690) {
		for (;;) {
			if (class690.anInt8698 * 2140077089 >= i) {
				int i_89_ = ((class690.anInt8708 * 865505689 >> class690.anInt8698 * 2140077089 - i) & (1 << i) - 1);
				class690.anInt8698 -= i * 1753188321;
				return i_89_;
			}
			class690.anInt8708 = (class690.anInt8708 * 865505689 << 8 | (class690.aByteArray8711[class690.anInt8700 * -368139033] & 0xff)) * -1061539159;
			class690.anInt8698 += 1140604680;
			class690.anInt8700 += -1625411881;
			class690.anInt8730 += -35078353;
			if (class690.anInt8730 * 366405583 == 0) {
				/* empty */
			}
		}
	}

	static void method13981(Class690 class690) {
		boolean bool = false;
		boolean bool_90_ = false;
		boolean bool_91_ = false;
		boolean bool_92_ = false;
		boolean bool_93_ = false;
		boolean bool_94_ = false;
		boolean bool_95_ = false;
		boolean bool_96_ = false;
		boolean bool_97_ = false;
		boolean bool_98_ = false;
		boolean bool_99_ = false;
		boolean bool_100_ = false;
		boolean bool_101_ = false;
		boolean bool_102_ = false;
		boolean bool_103_ = false;
		boolean bool_104_ = false;
		boolean bool_105_ = false;
		boolean bool_106_ = false;
		int i = 0;
		int[] is = null;
		int[] is_107_ = null;
		int[] is_108_ = null;
		class690.anInt8710 = 1737538747;
		if (Class210.anIntArray2252 == null)
			Class210.anIntArray2252 = new int[class690.anInt8710 * -1174898208];
		boolean bool_109_ = true;
		while (bool_109_) {
			byte i_110_ = method13962(class690);
			if (i_110_ == 23)
				break;
			i_110_ = method13962(class690);
			i_110_ = method13962(class690);
			i_110_ = method13962(class690);
			i_110_ = method13962(class690);
			i_110_ = method13962(class690);
			i_110_ = method13962(class690);
			i_110_ = method13962(class690);
			i_110_ = method13962(class690);
			i_110_ = method13962(class690);
			i_110_ = method13965(class690);
			if (i_110_ == 0) {
				/* empty */
			}
			class690.anInt8697 = 0;
			int i_111_ = method13962(class690);
			class690.anInt8697 = (class690.anInt8697 * -1181637063 << 8 | i_111_ & 0xff) * 1361733641;
			i_111_ = method13962(class690);
			class690.anInt8697 = (class690.anInt8697 * -1181637063 << 8 | i_111_ & 0xff) * 1361733641;
			i_111_ = method13962(class690);
			class690.anInt8697 = (class690.anInt8697 * -1181637063 << 8 | i_111_ & 0xff) * 1361733641;
			for (int i_112_ = 0; i_112_ < 16; i_112_++) {
				i_110_ = method13965(class690);
				if (i_110_ == 1)
					class690.aBoolArray8719[i_112_] = true;
				else
					class690.aBoolArray8719[i_112_] = false;
			}
			for (int i_113_ = 0; i_113_ < 256; i_113_++)
				class690.aBoolArray8718[i_113_] = false;
			for (int i_114_ = 0; i_114_ < 16; i_114_++) {
				if (class690.aBoolArray8719[i_114_]) {
					for (int i_115_ = 0; i_115_ < 16; i_115_++) {
						i_110_ = method13965(class690);
						if (i_110_ == 1)
							class690.aBoolArray8718[i_114_ * 16 + i_115_] = true;
					}
				}
			}
			method13967(class690);
			int i_116_ = class690.anInt8717 * 1052091185 + 2;
			int i_117_ = method13968(3, class690);
			int i_118_ = method13968(15, class690);
			for (int i_119_ = 0; i_119_ < i_118_; i_119_++) {
				int i_120_ = 0;
				for (;;) {
					i_110_ = method13965(class690);
					if (i_110_ == 0)
						break;
					i_120_++;
				}
				class690.aByteArray8724[i_119_] = (byte) i_120_;
			}
			byte[] is_121_ = new byte[6];
			for (byte i_122_ = 0; i_122_ < i_117_; i_122_++)
				is_121_[i_122_] = i_122_;
			for (int i_123_ = 0; i_123_ < i_118_; i_123_++) {
				byte i_124_ = class690.aByteArray8724[i_123_];
				byte i_125_ = is_121_[i_124_];
				for (/**/; i_124_ > 0; i_124_--)
					is_121_[i_124_] = is_121_[i_124_ - 1];
				is_121_[0] = i_125_;
				class690.aByteArray8721[i_123_] = i_125_;
			}
			for (int i_126_ = 0; i_126_ < i_117_; i_126_++) {
				int i_127_ = method13968(5, class690);
				for (int i_128_ = 0; i_128_ < i_116_; i_128_++) {
					for (;;) {
						i_110_ = method13965(class690);
						if (i_110_ == 0)
							break;
						i_110_ = method13965(class690);
						if (i_110_ == 0)
							i_127_++;
						else
							i_127_--;
					}
					class690.aByteArrayArray8701[i_126_][i_128_] = (byte) i_127_;
				}
			}
			for (int i_129_ = 0; i_129_ < i_117_; i_129_++) {
				int i_130_ = 32;
				byte i_131_ = 0;
				for (int i_132_ = 0; i_132_ < i_116_; i_132_++) {
					if (class690.aByteArrayArray8701[i_129_][i_132_] > i_131_)
						i_131_ = class690.aByteArrayArray8701[i_129_][i_132_];
					if (class690.aByteArrayArray8701[i_129_][i_132_] < i_130_)
						i_130_ = class690.aByteArrayArray8701[i_129_][i_132_];
				}
				method13973(class690.anIntArrayArray8707[i_129_], class690.anIntArrayArray8727[i_129_], class690.anIntArrayArray8716[i_129_], class690.aByteArrayArray8701[i_129_], i_130_, i_131_, i_116_);
				class690.anIntArray8729[i_129_] = i_130_;
			}
			int i_133_ = class690.anInt8717 * 1052091185 + 1;
			int i_134_ = -1;
			int i_135_ = 0;
			for (int i_136_ = 0; i_136_ <= 255; i_136_++)
				class690.anIntArray8714[i_136_] = 0;
			int i_137_ = 4095;
			for (int i_138_ = 15; i_138_ >= 0; i_138_--) {
				for (int i_139_ = 15; i_139_ >= 0; i_139_--) {
					class690.aByteArray8728[i_137_] = (byte) (i_138_ * 16 + i_139_);
					i_137_--;
				}
				class690.anIntArray8722[i_138_] = i_137_ + 1;
			}
			int i_140_ = 0;
			if (i_135_ == 0) {
				i_134_++;
				i_135_ = 50;
				byte i_141_ = class690.aByteArray8721[i_134_];
				i = class690.anIntArray8729[i_141_];
				is = class690.anIntArrayArray8707[i_141_];
				is_108_ = class690.anIntArrayArray8716[i_141_];
				is_107_ = class690.anIntArrayArray8727[i_141_];
			}
			i_135_--;
			int i_142_ = i;
			int i_143_;
			int i_144_;
			for (i_144_ = method13968(i_142_, class690); i_144_ > is[i_142_]; i_144_ = i_144_ << 1 | i_143_) {
				i_142_++;
				i_143_ = method13965(class690);
			}
			int i_145_ = is_108_[i_144_ - is_107_[i_142_]];
			while (i_145_ != i_133_) {
				if (i_145_ == 0 || i_145_ == 1) {
					int i_146_ = -1;
					int i_147_ = 1;
					do {
						if (i_145_ == 0)
							i_146_ += 1 * i_147_;
						else if (i_145_ == 1)
							i_146_ += 2 * i_147_;
						i_147_ *= 2;
						if (i_135_ == 0) {
							i_134_++;
							i_135_ = 50;
							byte i_148_ = class690.aByteArray8721[i_134_];
							i = class690.anIntArray8729[i_148_];
							is = class690.anIntArrayArray8707[i_148_];
							is_108_ = class690.anIntArrayArray8716[i_148_];
							is_107_ = class690.anIntArrayArray8727[i_148_];
						}
						i_135_--;
						i_142_ = i;
						for (i_144_ = method13968(i_142_, class690); i_144_ > is[i_142_]; i_144_ = i_144_ << 1 | i_143_) {
							i_142_++;
							i_143_ = method13965(class690);
						}
						i_145_ = is_108_[i_144_ - is_107_[i_142_]];
					} while (i_145_ == 0 || i_145_ == 1);
					i_146_++;
					i_111_ = (class690.aByteArray8720[(class690.aByteArray8728[class690.anIntArray8722[0]]) & 0xff]);
					class690.anIntArray8714[i_111_ & 0xff] += i_146_;
					for (/**/; i_146_ > 0; i_146_--) {
						Class210.anIntArray2252[i_140_] = i_111_ & 0xff;
						i_140_++;
					}
				} else {
					int i_149_ = i_145_ - 1;
					if (i_149_ < 16) {
						int i_150_ = class690.anIntArray8722[0];
						i_110_ = class690.aByteArray8728[i_150_ + i_149_];
						for (/**/; i_149_ > 3; i_149_ -= 4) {
							int i_151_ = i_150_ + i_149_;
							class690.aByteArray8728[i_151_] = class690.aByteArray8728[i_151_ - 1];
							class690.aByteArray8728[i_151_ - 1] = class690.aByteArray8728[i_151_ - 2];
							class690.aByteArray8728[i_151_ - 2] = class690.aByteArray8728[i_151_ - 3];
							class690.aByteArray8728[i_151_ - 3] = class690.aByteArray8728[i_151_ - 4];
						}
						for (/**/; i_149_ > 0; i_149_--)
							class690.aByteArray8728[i_150_ + i_149_] = class690.aByteArray8728[i_150_ + i_149_ - 1];
						class690.aByteArray8728[i_150_] = i_110_;
					} else {
						int i_152_ = i_149_ / 16;
						int i_153_ = i_149_ % 16;
						int i_154_ = class690.anIntArray8722[i_152_] + i_153_;
						i_110_ = class690.aByteArray8728[i_154_];
						for (/**/; i_154_ > class690.anIntArray8722[i_152_]; i_154_--)
							class690.aByteArray8728[i_154_] = class690.aByteArray8728[i_154_ - 1];
						class690.anIntArray8722[i_152_]++;
						for (/**/; i_152_ > 0; i_152_--) {
							class690.anIntArray8722[i_152_]--;
							class690.aByteArray8728[(class690.anIntArray8722[i_152_])] = (class690.aByteArray8728[(class690.anIntArray8722[i_152_ - 1] + 16 - 1)]);
						}
						class690.anIntArray8722[0]--;
						class690.aByteArray8728[class690.anIntArray8722[0]] = i_110_;
						if (class690.anIntArray8722[0] == 0) {
							i_137_ = 4095;
							for (int i_155_ = 15; i_155_ >= 0; i_155_--) {
								for (int i_156_ = 15; i_156_ >= 0; i_156_--) {
									class690.aByteArray8728[i_137_] = (class690.aByteArray8728[(class690.anIntArray8722[i_155_] + i_156_)]);
									i_137_--;
								}
								class690.anIntArray8722[i_155_] = i_137_ + 1;
							}
						}
					}
					class690.anIntArray8714[class690.aByteArray8720[i_110_ & 0xff] & 0xff]++;
					Class210.anIntArray2252[i_140_] = class690.aByteArray8720[i_110_ & 0xff] & 0xff;
					i_140_++;
					if (i_135_ == 0) {
						i_134_++;
						i_135_ = 50;
						byte i_157_ = class690.aByteArray8721[i_134_];
						i = class690.anIntArray8729[i_157_];
						is = class690.anIntArrayArray8707[i_157_];
						is_108_ = class690.anIntArrayArray8716[i_157_];
						is_107_ = class690.anIntArrayArray8727[i_157_];
					}
					i_135_--;
					i_142_ = i;
					for (i_144_ = method13968(i_142_, class690); i_144_ > is[i_142_]; i_144_ = i_144_ << 1 | i_143_) {
						i_142_++;
						i_143_ = method13965(class690);
					}
					i_145_ = is_108_[i_144_ - is_107_[i_142_]];
				}
			}
			class690.anInt8725 = 0;
			class690.aByte8706 = (byte) 0;
			class690.anIntArray8726[0] = 0;
			for (int i_158_ = 1; i_158_ <= 256; i_158_++)
				class690.anIntArray8726[i_158_] = class690.anIntArray8714[i_158_ - 1];
			for (int i_159_ = 1; i_159_ <= 256; i_159_++)
				class690.anIntArray8726[i_159_] += class690.anIntArray8726[i_159_ - 1];
			for (int i_160_ = 0; i_160_ < i_140_; i_160_++) {
				i_111_ = (byte) (Class210.anIntArray2252[i_160_] & 0xff);
				Class210.anIntArray2252[class690.anIntArray8726[i_111_ & 0xff]] |= i_160_ << 8;
				class690.anIntArray8726[i_111_ & 0xff]++;
			}
			class690.anInt8712 = (Class210.anIntArray2252[class690.anInt8697 * -1181637063] >> 8) * 1008639289;
			class690.anInt8715 = 0;
			class690.anInt8712 = (Class210.anIntArray2252[class690.anInt8712 * 1175011593] * 1008639289);
			class690.anInt8713 = (byte) (class690.anInt8712 * 1175011593 & 0xff) * 1709640819;
			Class690 class690_161_;
			(class690_161_ = class690).anInt8712 = (class690_161_.anInt8712 * 1175011593 >> 8) * 1008639289;
			class690.anInt8715 += 313617359;
			class690.anInt8693 = i_140_ * 774785421;
			method13964(class690);
			if ((class690.anInt8715 * -675038417 == class690.anInt8693 * -604561083 + 1) && class690.anInt8725 * 2083000921 == 0)
				bool_109_ = true;
			else
				bool_109_ = false;
		}
	}

	static void method13982(int[] is, int[] is_162_, int[] is_163_, byte[] is_164_, int i, int i_165_, int i_166_) {
		int i_167_ = 0;
		for (int i_168_ = i; i_168_ <= i_165_; i_168_++) {
			for (int i_169_ = 0; i_169_ < i_166_; i_169_++) {
				if (is_164_[i_169_] == i_168_) {
					is_163_[i_167_] = i_169_;
					i_167_++;
				}
			}
		}
		for (int i_170_ = 0; i_170_ < 23; i_170_++)
			is_162_[i_170_] = 0;
		for (int i_171_ = 0; i_171_ < i_166_; i_171_++)
			is_162_[is_164_[i_171_] + 1]++;
		for (int i_172_ = 1; i_172_ < 23; i_172_++)
			is_162_[i_172_] += is_162_[i_172_ - 1];
		for (int i_173_ = 0; i_173_ < 23; i_173_++)
			is[i_173_] = 0;
		int i_174_ = 0;
		for (int i_175_ = i; i_175_ <= i_165_; i_175_++) {
			i_174_ += is_162_[i_175_ + 1] - is_162_[i_175_];
			is[i_175_] = i_174_ - 1;
			i_174_ <<= 1;
		}
		for (int i_176_ = i + 1; i_176_ <= i_165_; i_176_++)
			is_162_[i_176_] = (is[i_176_ - 1] + 1 << 1) - is_162_[i_176_];
	}

	static void method13983(int[] is, int[] is_177_, int[] is_178_, byte[] is_179_, int i, int i_180_, int i_181_) {
		int i_182_ = 0;
		for (int i_183_ = i; i_183_ <= i_180_; i_183_++) {
			for (int i_184_ = 0; i_184_ < i_181_; i_184_++) {
				if (is_179_[i_184_] == i_183_) {
					is_178_[i_182_] = i_184_;
					i_182_++;
				}
			}
		}
		for (int i_185_ = 0; i_185_ < 23; i_185_++)
			is_177_[i_185_] = 0;
		for (int i_186_ = 0; i_186_ < i_181_; i_186_++)
			is_177_[is_179_[i_186_] + 1]++;
		for (int i_187_ = 1; i_187_ < 23; i_187_++)
			is_177_[i_187_] += is_177_[i_187_ - 1];
		for (int i_188_ = 0; i_188_ < 23; i_188_++)
			is[i_188_] = 0;
		int i_189_ = 0;
		for (int i_190_ = i; i_190_ <= i_180_; i_190_++) {
			i_189_ += is_177_[i_190_ + 1] - is_177_[i_190_];
			is[i_190_] = i_189_ - 1;
			i_189_ <<= 1;
		}
		for (int i_191_ = i + 1; i_191_ <= i_180_; i_191_++)
			is_177_[i_191_] = (is[i_191_ - 1] + 1 << 1) - is_177_[i_191_];
	}

	Class688() throws Throwable {
		throw new Error();
	}

	static void method13984(int[] is, int[] is_192_, int[] is_193_, byte[] is_194_, int i, int i_195_, int i_196_) {
		int i_197_ = 0;
		for (int i_198_ = i; i_198_ <= i_195_; i_198_++) {
			for (int i_199_ = 0; i_199_ < i_196_; i_199_++) {
				if (is_194_[i_199_] == i_198_) {
					is_193_[i_197_] = i_199_;
					i_197_++;
				}
			}
		}
		for (int i_200_ = 0; i_200_ < 23; i_200_++)
			is_192_[i_200_] = 0;
		for (int i_201_ = 0; i_201_ < i_196_; i_201_++)
			is_192_[is_194_[i_201_] + 1]++;
		for (int i_202_ = 1; i_202_ < 23; i_202_++)
			is_192_[i_202_] += is_192_[i_202_ - 1];
		for (int i_203_ = 0; i_203_ < 23; i_203_++)
			is[i_203_] = 0;
		int i_204_ = 0;
		for (int i_205_ = i; i_205_ <= i_195_; i_205_++) {
			i_204_ += is_192_[i_205_ + 1] - is_192_[i_205_];
			is[i_205_] = i_204_ - 1;
			i_204_ <<= 1;
		}
		for (int i_206_ = i + 1; i_206_ <= i_195_; i_206_++)
			is_192_[i_206_] = (is[i_206_ - 1] + 1 << 1) - is_192_[i_206_];
	}
}
