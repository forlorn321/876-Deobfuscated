/* Class696 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class696 {
	static final int anInt8734 = 23;
	static final int anInt8735 = 4096;
	static final int anInt8736 = 16;
	static final int anInt8737 = 0;
	static final int anInt8738 = 6;
	static final int anInt8739 = 1;
	static final int anInt8740 = 50;
	static Class698 aClass698_8741 = new Class698();

	static byte method8225(Class698 class698) {
		return (byte) method8229(1, class698);
	}

	static void method8226(Class698 class698) {
		boolean bool = false;
		boolean bool_0_ = false;
		boolean bool_1_ = false;
		boolean bool_2_ = false;
		boolean bool_3_ = false;
		boolean bool_4_ = false;
		boolean bool_5_ = false;
		boolean bool_6_ = false;
		boolean bool_7_ = false;
		boolean bool_8_ = false;
		boolean bool_9_ = false;
		boolean bool_10_ = false;
		boolean bool_11_ = false;
		boolean bool_12_ = false;
		boolean bool_13_ = false;
		boolean bool_14_ = false;
		boolean bool_15_ = false;
		boolean bool_16_ = false;
		int i = 0;
		int[] is = null;
		int[] is_17_ = null;
		int[] is_18_ = null;
		class698.anInt8763 = 249598389;
		if (Class474.anIntArray5371 == null)
			Class474.anIntArray5371 = new int[class698.anInt8763 * 67375136];
		boolean bool_19_ = true;
		while (bool_19_) {
			byte i_20_ = method8227(class698);
			if (i_20_ == 23)
				break;
			i_20_ = method8227(class698);
			i_20_ = method8227(class698);
			i_20_ = method8227(class698);
			i_20_ = method8227(class698);
			i_20_ = method8227(class698);
			i_20_ = method8227(class698);
			i_20_ = method8227(class698);
			i_20_ = method8227(class698);
			i_20_ = method8227(class698);
			i_20_ = method8225(class698);
			if (i_20_ == 0) {
				/* empty */
			}
			class698.anInt8750 = 0;
			int i_21_ = method8227(class698);
			class698.anInt8750 = (class698.anInt8750 * -632714731 << 8 | i_21_ & 0xff) * 1728378173;
			i_21_ = method8227(class698);
			class698.anInt8750 = (class698.anInt8750 * -632714731 << 8 | i_21_ & 0xff) * 1728378173;
			i_21_ = method8227(class698);
			class698.anInt8750 = (class698.anInt8750 * -632714731 << 8 | i_21_ & 0xff) * 1728378173;
			for (int i_22_ = 0; i_22_ < 16; i_22_++) {
				i_20_ = method8225(class698);
				if (i_20_ == 1)
					class698.aBoolArray8746[i_22_] = true;
				else
					class698.aBoolArray8746[i_22_] = false;
			}
			for (int i_23_ = 0; i_23_ < 256; i_23_++)
				class698.aBoolArray8771[i_23_] = false;
			for (int i_24_ = 0; i_24_ < 16; i_24_++) {
				if (class698.aBoolArray8746[i_24_]) {
					for (int i_25_ = 0; i_25_ < 16; i_25_++) {
						i_20_ = method8225(class698);
						if (i_20_ == 1)
							class698.aBoolArray8771[i_24_ * 16 + i_25_] = true;
					}
				}
			}
			method8230(class698);
			int i_26_ = class698.anInt8770 * -1314991341 + 2;
			int i_27_ = method8229(3, class698);
			int i_28_ = method8229(15, class698);
			for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
				int i_30_ = 0;
				for (;;) {
					i_20_ = method8225(class698);
					if (i_20_ == 0)
						break;
					i_30_++;
				}
				class698.aByteArray8777[i_29_] = (byte) i_30_;
			}
			byte[] is_31_ = new byte[6];
			for (byte i_32_ = 0; i_32_ < i_27_; i_32_++)
				is_31_[i_32_] = i_32_;
			for (int i_33_ = 0; i_33_ < i_28_; i_33_++) {
				byte i_34_ = class698.aByteArray8777[i_33_];
				byte i_35_ = is_31_[i_34_];
				for (/**/; i_34_ > 0; i_34_--)
					is_31_[i_34_] = is_31_[i_34_ - 1];
				is_31_[0] = i_35_;
				class698.aByteArray8776[i_33_] = i_35_;
			}
			for (int i_36_ = 0; i_36_ < i_27_; i_36_++) {
				int i_37_ = method8229(5, class698);
				for (int i_38_ = 0; i_38_ < i_26_; i_38_++) {
					for (;;) {
						i_20_ = method8225(class698);
						if (i_20_ == 0)
							break;
						i_20_ = method8225(class698);
						if (i_20_ == 0)
							i_37_++;
						else
							i_37_--;
					}
					class698.aByteArrayArray8778[i_36_][i_38_] = (byte) i_37_;
				}
			}
			for (int i_39_ = 0; i_39_ < i_27_; i_39_++) {
				int i_40_ = 32;
				byte i_41_ = 0;
				for (int i_42_ = 0; i_42_ < i_26_; i_42_++) {
					if (class698.aByteArrayArray8778[i_39_][i_42_] > i_41_)
						i_41_ = class698.aByteArrayArray8778[i_39_][i_42_];
					if (class698.aByteArrayArray8778[i_39_][i_42_] < i_40_)
						i_40_ = class698.aByteArrayArray8778[i_39_][i_42_];
				}
				method8233(class698.anIntArrayArray8779[i_39_], class698.anIntArrayArray8780[i_39_], class698.anIntArrayArray8781[i_39_], class698.aByteArrayArray8778[i_39_], i_40_, i_41_, i_26_);
				class698.anIntArray8782[i_39_] = i_40_;
			}
			int i_43_ = class698.anInt8770 * -1314991341 + 1;
			int i_44_ = -1;
			int i_45_ = 0;
			for (int i_46_ = 0; i_46_ <= 255; i_46_++)
				class698.anIntArray8767[i_46_] = 0;
			int i_47_ = 4095;
			for (int i_48_ = 15; i_48_ >= 0; i_48_--) {
				for (int i_49_ = 15; i_49_ >= 0; i_49_--) {
					class698.aByteArray8774[i_47_] = (byte) (i_48_ * 16 + i_49_);
					i_47_--;
				}
				class698.anIntArray8761[i_48_] = i_47_ + 1;
			}
			int i_50_ = 0;
			if (i_45_ == 0) {
				i_44_++;
				i_45_ = 50;
				byte i_51_ = class698.aByteArray8776[i_44_];
				i = class698.anIntArray8782[i_51_];
				is = class698.anIntArrayArray8779[i_51_];
				is_18_ = class698.anIntArrayArray8781[i_51_];
				is_17_ = class698.anIntArrayArray8780[i_51_];
			}
			i_45_--;
			int i_52_ = i;
			int i_53_;
			int i_54_;
			for (i_54_ = method8229(i_52_, class698); i_54_ > is[i_52_]; i_54_ = i_54_ << 1 | i_53_) {
				i_52_++;
				i_53_ = method8225(class698);
			}
			int i_55_ = is_18_[i_54_ - is_17_[i_52_]];
			while (i_55_ != i_43_) {
				if (i_55_ == 0 || i_55_ == 1) {
					int i_56_ = -1;
					int i_57_ = 1;
					do {
						if (i_55_ == 0)
							i_56_ += 1 * i_57_;
						else if (i_55_ == 1)
							i_56_ += 2 * i_57_;
						i_57_ *= 2;
						if (i_45_ == 0) {
							i_44_++;
							i_45_ = 50;
							byte i_58_ = class698.aByteArray8776[i_44_];
							i = class698.anIntArray8782[i_58_];
							is = class698.anIntArrayArray8779[i_58_];
							is_18_ = class698.anIntArrayArray8781[i_58_];
							is_17_ = class698.anIntArrayArray8780[i_58_];
						}
						i_45_--;
						i_52_ = i;
						for (i_54_ = method8229(i_52_, class698); i_54_ > is[i_52_]; i_54_ = i_54_ << 1 | i_53_) {
							i_52_++;
							i_53_ = method8225(class698);
						}
						i_55_ = is_18_[i_54_ - is_17_[i_52_]];
					} while (i_55_ == 0 || i_55_ == 1);
					i_56_++;
					i_21_ = (class698.aByteArray8773[(class698.aByteArray8774[class698.anIntArray8761[0]]) & 0xff]);
					class698.anIntArray8767[i_21_ & 0xff] += i_56_;
					for (/**/; i_56_ > 0; i_56_--) {
						Class474.anIntArray5371[i_50_] = i_21_ & 0xff;
						i_50_++;
					}
				} else {
					int i_59_ = i_55_ - 1;
					if (i_59_ < 16) {
						int i_60_ = class698.anIntArray8761[0];
						i_20_ = class698.aByteArray8774[i_60_ + i_59_];
						for (/**/; i_59_ > 3; i_59_ -= 4) {
							int i_61_ = i_60_ + i_59_;
							class698.aByteArray8774[i_61_] = class698.aByteArray8774[i_61_ - 1];
							class698.aByteArray8774[i_61_ - 1] = class698.aByteArray8774[i_61_ - 2];
							class698.aByteArray8774[i_61_ - 2] = class698.aByteArray8774[i_61_ - 3];
							class698.aByteArray8774[i_61_ - 3] = class698.aByteArray8774[i_61_ - 4];
						}
						for (/**/; i_59_ > 0; i_59_--)
							class698.aByteArray8774[i_60_ + i_59_] = class698.aByteArray8774[i_60_ + i_59_ - 1];
						class698.aByteArray8774[i_60_] = i_20_;
					} else {
						int i_62_ = i_59_ / 16;
						int i_63_ = i_59_ % 16;
						int i_64_ = class698.anIntArray8761[i_62_] + i_63_;
						i_20_ = class698.aByteArray8774[i_64_];
						for (/**/; i_64_ > class698.anIntArray8761[i_62_]; i_64_--)
							class698.aByteArray8774[i_64_] = class698.aByteArray8774[i_64_ - 1];
						class698.anIntArray8761[i_62_]++;
						for (/**/; i_62_ > 0; i_62_--) {
							class698.anIntArray8761[i_62_]--;
							class698.aByteArray8774[(class698.anIntArray8761[i_62_])] = (class698.aByteArray8774[(class698.anIntArray8761[i_62_ - 1] + 16 - 1)]);
						}
						class698.anIntArray8761[0]--;
						class698.aByteArray8774[class698.anIntArray8761[0]] = i_20_;
						if (class698.anIntArray8761[0] == 0) {
							i_47_ = 4095;
							for (int i_65_ = 15; i_65_ >= 0; i_65_--) {
								for (int i_66_ = 15; i_66_ >= 0; i_66_--) {
									class698.aByteArray8774[i_47_] = (class698.aByteArray8774[(class698.anIntArray8761[i_65_] + i_66_)]);
									i_47_--;
								}
								class698.anIntArray8761[i_65_] = i_47_ + 1;
							}
						}
					}
					class698.anIntArray8767[class698.aByteArray8773[i_20_ & 0xff] & 0xff]++;
					Class474.anIntArray5371[i_50_] = class698.aByteArray8773[i_20_ & 0xff] & 0xff;
					i_50_++;
					if (i_45_ == 0) {
						i_44_++;
						i_45_ = 50;
						byte i_67_ = class698.aByteArray8776[i_44_];
						i = class698.anIntArray8782[i_67_];
						is = class698.anIntArrayArray8779[i_67_];
						is_18_ = class698.anIntArrayArray8781[i_67_];
						is_17_ = class698.anIntArrayArray8780[i_67_];
					}
					i_45_--;
					i_52_ = i;
					for (i_54_ = method8229(i_52_, class698); i_54_ > is[i_52_]; i_54_ = i_54_ << 1 | i_53_) {
						i_52_++;
						i_53_ = method8225(class698);
					}
					i_55_ = is_18_[i_54_ - is_17_[i_52_]];
				}
			}
			class698.anInt8760 = 0;
			class698.aByte8759 = (byte) 0;
			class698.anIntArray8769[0] = 0;
			for (int i_68_ = 1; i_68_ <= 256; i_68_++)
				class698.anIntArray8769[i_68_] = class698.anIntArray8767[i_68_ - 1];
			for (int i_69_ = 1; i_69_ <= 256; i_69_++)
				class698.anIntArray8769[i_69_] += class698.anIntArray8769[i_69_ - 1];
			for (int i_70_ = 0; i_70_ < i_50_; i_70_++) {
				i_21_ = (byte) (Class474.anIntArray5371[i_70_] & 0xff);
				Class474.anIntArray5371[class698.anIntArray8769[i_21_ & 0xff]] |= i_70_ << 8;
				class698.anIntArray8769[i_21_ & 0xff]++;
			}
			class698.anInt8765 = (Class474.anIntArray5371[class698.anInt8750 * -632714731] >> 8) * -766369419;
			class698.anInt8768 = 0;
			class698.anInt8765 = (Class474.anIntArray5371[class698.anInt8765 * 1973610205] * -766369419);
			class698.anInt8766 = (byte) (class698.anInt8765 * 1973610205 & 0xff) * -1905763817;
			Class698 class698_71_;
			(class698_71_ = class698).anInt8765 = (class698_71_.anInt8765 * 1973610205 >> 8) * -766369419;
			class698.anInt8768 += 1913050093;
			class698.anInt8749 = i_50_ * -1107329695;
			method8232(class698);
			if ((class698.anInt8768 * 474120677 == class698.anInt8749 * 835577505 + 1) && class698.anInt8760 * -1341275865 == 0)
				bool_19_ = true;
			else
				bool_19_ = false;
		}
	}

	static byte method8227(Class698 class698) {
		return (byte) method8229(8, class698);
	}

	public static int method8228(byte[] is, int i, byte[] is_72_, int i_73_, int i_74_) {
		synchronized (aClass698_8741) {
			aClass698_8741.aByteArray8752 = is_72_;
			aClass698_8741.anInt8753 = i_74_ * -811900545;
			aClass698_8741.aByteArray8755 = is;
			aClass698_8741.anInt8758 = 0;
			aClass698_8741.anInt8757 = i * 1752118813;
			aClass698_8741.anInt8762 = 0;
			aClass698_8741.anInt8775 = 0;
			aClass698_8741.anInt8754 = 0;
			aClass698_8741.anInt8764 = 0;
			method8226(aClass698_8741);
			i -= aClass698_8741.anInt8757 * 864500789;
			aClass698_8741.aByteArray8752 = null;
			aClass698_8741.aByteArray8755 = null;
			int i_75_ = i;
			return i_75_;
		}
	}

	static int method8229(int i, Class698 class698) {
		for (;;) {
			if (class698.anInt8762 * 1295411577 >= i) {
				int i_76_ = ((class698.anInt8775 * 1666047209 >> class698.anInt8762 * 1295411577 - i) & (1 << i) - 1);
				class698.anInt8762 -= i * 1222947017;
				return i_76_;
			}
			class698.anInt8775 = (class698.anInt8775 * 1666047209 << 8 | (class698.aByteArray8752[class698.anInt8753 * 518151807] & 0xff)) * -1827620007;
			class698.anInt8762 += 1193641544;
			class698.anInt8753 += -811900545;
			class698.anInt8754 += 1018261909;
			if (class698.anInt8754 * -1508683331 == 0) {
				/* empty */
			}
		}
	}

	static void method8230(Class698 class698) {
		class698.anInt8770 = 0;
		for (int i = 0; i < 256; i++) {
			if (class698.aBoolArray8771[i]) {
				class698.aByteArray8773[class698.anInt8770 * -1314991341] = (byte) i;
				class698.anInt8770 += 1932259099;
			}
		}
	}

	public static int method8231(byte[] is, int i, byte[] is_77_, int i_78_, int i_79_) {
		synchronized (aClass698_8741) {
			aClass698_8741.aByteArray8752 = is_77_;
			aClass698_8741.anInt8753 = i_79_ * -811900545;
			aClass698_8741.aByteArray8755 = is;
			aClass698_8741.anInt8758 = 0;
			aClass698_8741.anInt8757 = i * 1752118813;
			aClass698_8741.anInt8762 = 0;
			aClass698_8741.anInt8775 = 0;
			aClass698_8741.anInt8754 = 0;
			aClass698_8741.anInt8764 = 0;
			method8226(aClass698_8741);
			i -= aClass698_8741.anInt8757 * 864500789;
			aClass698_8741.aByteArray8752 = null;
			aClass698_8741.aByteArray8755 = null;
			int i_80_ = i;
			return i_80_;
		}
	}

	static void method8232(Class698 class698) {
		byte i = class698.aByte8759;
		int i_81_ = class698.anInt8760 * -1341275865;
		int i_82_ = class698.anInt8768 * 474120677;
		int i_83_ = class698.anInt8766 * -275743321;
		int[] is = Class474.anIntArray5371;
		int i_84_ = class698.anInt8765 * 1973610205;
		byte[] is_85_ = class698.aByteArray8755;
		int i_86_ = class698.anInt8758 * 780333809;
		int i_87_ = class698.anInt8757 * 864500789;
		int i_88_ = i_87_;
		int i_89_ = class698.anInt8749 * 835577505 + 1;
		while_75_: for (;;) {
			if (i_81_ > 0) {
				for (;;) {
					if (i_87_ == 0)
						break while_75_;
					if (i_81_ == 1)
						break;
					is_85_[i_86_] = i;
					i_81_--;
					i_86_++;
					i_87_--;
				}
				if (i_87_ == 0) {
					i_81_ = 1;
					break;
				}
				is_85_[i_86_] = i;
				i_86_++;
				i_87_--;
			}
			for (;;) {
				if (i_82_ == i_89_) {
					i_81_ = 0;
					break while_75_;
				}
				i = (byte) i_83_;
				i_84_ = is[i_84_];
				int i_90_ = (byte) i_84_;
				i_84_ >>= 8;
				i_82_++;
				if (i_90_ != i_83_) {
					i_83_ = i_90_;
					if (i_87_ == 0) {
						i_81_ = 1;
						break while_75_;
					}
					is_85_[i_86_] = i;
					i_86_++;
					i_87_--;
				} else {
					if (i_82_ != i_89_)
						break;
					if (i_87_ == 0) {
						i_81_ = 1;
						break while_75_;
					}
					is_85_[i_86_] = i;
					i_86_++;
					i_87_--;
				}
			}
			i_81_ = 2;
			i_84_ = is[i_84_];
			int i_91_ = (byte) i_84_;
			i_84_ >>= 8;
			if (++i_82_ != i_89_) {
				if (i_91_ != i_83_)
					i_83_ = i_91_;
				else {
					i_81_ = 3;
					i_84_ = is[i_84_];
					i_91_ = (byte) i_84_;
					i_84_ >>= 8;
					if (++i_82_ != i_89_) {
						if (i_91_ != i_83_)
							i_83_ = i_91_;
						else {
							i_84_ = is[i_84_];
							i_91_ = (byte) i_84_;
							i_84_ >>= 8;
							i_82_++;
							i_81_ = (i_91_ & 0xff) + 4;
							i_84_ = is[i_84_];
							i_83_ = (byte) i_84_;
							i_84_ >>= 8;
							i_82_++;
						}
					}
				}
			}
		}
		int i_92_ = class698.anInt8764 * -725197759;
		class698.anInt8764 += (i_88_ - i_87_) * -1020021823;
		if (class698.anInt8764 * -725197759 >= i_92_) {
			/* empty */
		}
		class698.aByte8759 = i;
		class698.anInt8760 = i_81_ * 1913364119;
		class698.anInt8768 = i_82_ * 1913050093;
		class698.anInt8766 = i_83_ * -1905763817;
		Class474.anIntArray5371 = is;
		class698.anInt8765 = i_84_ * -766369419;
		class698.aByteArray8755 = is_85_;
		class698.anInt8758 = i_86_ * -1963999727;
		class698.anInt8757 = i_87_ * 1752118813;
	}

	static void method8233(int[] is, int[] is_93_, int[] is_94_, byte[] is_95_, int i, int i_96_, int i_97_) {
		int i_98_ = 0;
		for (int i_99_ = i; i_99_ <= i_96_; i_99_++) {
			for (int i_100_ = 0; i_100_ < i_97_; i_100_++) {
				if (is_95_[i_100_] == i_99_) {
					is_94_[i_98_] = i_100_;
					i_98_++;
				}
			}
		}
		for (int i_101_ = 0; i_101_ < 23; i_101_++)
			is_93_[i_101_] = 0;
		for (int i_102_ = 0; i_102_ < i_97_; i_102_++)
			is_93_[is_95_[i_102_] + 1]++;
		for (int i_103_ = 1; i_103_ < 23; i_103_++)
			is_93_[i_103_] += is_93_[i_103_ - 1];
		for (int i_104_ = 0; i_104_ < 23; i_104_++)
			is[i_104_] = 0;
		int i_105_ = 0;
		for (int i_106_ = i; i_106_ <= i_96_; i_106_++) {
			i_105_ += is_93_[i_106_ + 1] - is_93_[i_106_];
			is[i_106_] = i_105_ - 1;
			i_105_ <<= 1;
		}
		for (int i_107_ = i + 1; i_107_ <= i_96_; i_107_++)
			is_93_[i_107_] = (is[i_107_ - 1] + 1 << 1) - is_93_[i_107_];
	}

	Class696() throws Throwable {
		throw new Error();
	}
}
