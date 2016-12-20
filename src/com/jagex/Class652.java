/* Class652 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class652 {
	public static void method10866(int[] is, float[] fs, float[] fs_0_) {
		Class328.method5804(is, fs, fs_0_, 0, is.length - 1, 1450870813);
	}

	public static void method10867(String[] strings, int[] is) {
		Class532.method8924(strings, is, 0, strings.length - 1, -1071073423);
	}

	public static void method10868(String[] strings, int[] is) {
		Class532.method8924(strings, is, 0, strings.length - 1, -1903245293);
	}

	static void method10869(String[] strings, int[] is, int i, int i_1_) {
		if (i < i_1_) {
			int i_2_ = (i_1_ + i) / 2;
			int i_3_ = i;
			String string = strings[i_2_];
			strings[i_2_] = strings[i_1_];
			strings[i_1_] = string;
			int i_4_ = is[i_2_];
			is[i_2_] = is[i_1_];
			is[i_1_] = i_4_;
			for (int i_5_ = i; i_5_ < i_1_; i_5_++) {
				if (null == string || (null != strings[i_5_] && strings[i_5_].compareTo(string) < (i_5_ & 0x1))) {
					String string_6_ = strings[i_5_];
					strings[i_5_] = strings[i_3_];
					strings[i_3_] = string_6_;
					int i_7_ = is[i_5_];
					is[i_5_] = is[i_3_];
					is[i_3_++] = i_7_;
				}
			}
			strings[i_1_] = strings[i_3_];
			strings[i_3_] = string;
			is[i_1_] = is[i_3_];
			is[i_3_] = i_4_;
			Class532.method8924(strings, is, i, i_3_ - 1, 44017974);
			Class532.method8924(strings, is, 1 + i_3_, i_1_, 364277398);
		}
	}

	public static void method10870(int[] is, Object[] objects) {
		Class605.method10048(is, objects, 0, is.length - 1, -493814043);
	}

	public static void method10871(int[] is, int[] is_8_, int i, int i_9_) {
		if (i < i_9_) {
			int i_10_ = (i_9_ + i) / 2;
			int i_11_ = i;
			int i_12_ = is[i_10_];
			is[i_10_] = is[i_9_];
			is[i_9_] = i_12_;
			int i_13_ = is_8_[i_10_];
			is_8_[i_10_] = is_8_[i_9_];
			is_8_[i_9_] = i_13_;
			int i_14_ = 2147483647 == i_12_ ? 0 : 1;
			for (int i_15_ = i; i_15_ < i_9_; i_15_++) {
				if (is[i_15_] < (i_15_ & i_14_) + i_12_) {
					int i_16_ = is[i_15_];
					is[i_15_] = is[i_11_];
					is[i_11_] = i_16_;
					int i_17_ = is_8_[i_15_];
					is_8_[i_15_] = is_8_[i_11_];
					is_8_[i_11_++] = i_17_;
				}
			}
			is[i_9_] = is[i_11_];
			is[i_11_] = i_12_;
			is_8_[i_9_] = is_8_[i_11_];
			is_8_[i_11_] = i_13_;
			Class149.method2492(is, is_8_, i, i_11_ - 1, 737584488);
			Class149.method2492(is, is_8_, i_11_ + 1, i_9_, -928941162);
		}
	}

	static void method10872(long[] ls, int[] is, int i, int i_18_) {
		if (i < i_18_) {
			int i_19_ = (i + i_18_) / 2;
			int i_20_ = i;
			long l = ls[i_19_];
			ls[i_19_] = ls[i_18_];
			ls[i_18_] = l;
			int i_21_ = is[i_19_];
			is[i_19_] = is[i_18_];
			is[i_18_] = i_21_;
			int i_22_ = 9223372036854775807L == l ? 0 : 1;
			for (int i_23_ = i; i_23_ < i_18_; i_23_++) {
				if (ls[i_23_] < (long) (i_23_ & i_22_) + l) {
					long l_24_ = ls[i_23_];
					ls[i_23_] = ls[i_20_];
					ls[i_20_] = l_24_;
					int i_25_ = is[i_23_];
					is[i_23_] = is[i_20_];
					is[i_20_++] = i_25_;
				}
			}
			ls[i_18_] = ls[i_20_];
			ls[i_20_] = l;
			is[i_18_] = is[i_20_];
			is[i_20_] = i_21_;
			Class172.method2737(ls, is, i, i_20_ - 1, (byte) 10);
			Class172.method2737(ls, is, 1 + i_20_, i_18_, (byte) 10);
		}
	}

	public static void method10873(int[] is, int[] is_26_, int i, int i_27_) {
		if (i < i_27_) {
			int i_28_ = (i_27_ + i) / 2;
			int i_29_ = i;
			int i_30_ = is[i_28_];
			is[i_28_] = is[i_27_];
			is[i_27_] = i_30_;
			int i_31_ = is_26_[i_28_];
			is_26_[i_28_] = is_26_[i_27_];
			is_26_[i_27_] = i_31_;
			int i_32_ = 2147483647 == i_30_ ? 0 : 1;
			for (int i_33_ = i; i_33_ < i_27_; i_33_++) {
				if (is[i_33_] < (i_33_ & i_32_) + i_30_) {
					int i_34_ = is[i_33_];
					is[i_33_] = is[i_29_];
					is[i_29_] = i_34_;
					int i_35_ = is_26_[i_33_];
					is_26_[i_33_] = is_26_[i_29_];
					is_26_[i_29_++] = i_35_;
				}
			}
			is[i_27_] = is[i_29_];
			is[i_29_] = i_30_;
			is_26_[i_27_] = is_26_[i_29_];
			is_26_[i_29_] = i_31_;
			Class149.method2492(is, is_26_, i, i_29_ - 1, -1724565654);
			Class149.method2492(is, is_26_, i_29_ + 1, i_27_, 1453883942);
		}
	}

	public static void method10874(int[] is, Object[] objects, int i, int i_36_) {
		if (i < i_36_) {
			int i_37_ = (i + i_36_) / 2;
			int i_38_ = i;
			int i_39_ = is[i_37_];
			is[i_37_] = is[i_36_];
			is[i_36_] = i_39_;
			Object object = objects[i_37_];
			objects[i_37_] = objects[i_36_];
			objects[i_36_] = object;
			int i_40_ = i_39_ == 2147483647 ? 0 : 1;
			for (int i_41_ = i; i_41_ < i_36_; i_41_++) {
				if (is[i_41_] < (i_41_ & i_40_) + i_39_) {
					int i_42_ = is[i_41_];
					is[i_41_] = is[i_38_];
					is[i_38_] = i_42_;
					Object object_43_ = objects[i_41_];
					objects[i_41_] = objects[i_38_];
					objects[i_38_++] = object_43_;
				}
			}
			is[i_36_] = is[i_38_];
			is[i_38_] = i_39_;
			objects[i_36_] = objects[i_38_];
			objects[i_38_] = object;
			Class605.method10048(is, objects, i, i_38_ - 1, -1572440479);
			Class605.method10048(is, objects, 1 + i_38_, i_36_, -941878878);
		}
	}

	static void method10875(long[] ls, int[] is, int i, int i_44_) {
		if (i < i_44_) {
			int i_45_ = (i + i_44_) / 2;
			int i_46_ = i;
			long l = ls[i_45_];
			ls[i_45_] = ls[i_44_];
			ls[i_44_] = l;
			int i_47_ = is[i_45_];
			is[i_45_] = is[i_44_];
			is[i_44_] = i_47_;
			int i_48_ = 9223372036854775807L == l ? 0 : 1;
			for (int i_49_ = i; i_49_ < i_44_; i_49_++) {
				if (ls[i_49_] < (long) (i_49_ & i_48_) + l) {
					long l_50_ = ls[i_49_];
					ls[i_49_] = ls[i_46_];
					ls[i_46_] = l_50_;
					int i_51_ = is[i_49_];
					is[i_49_] = is[i_46_];
					is[i_46_++] = i_51_;
				}
			}
			ls[i_44_] = ls[i_46_];
			ls[i_46_] = l;
			is[i_44_] = is[i_46_];
			is[i_46_] = i_47_;
			Class172.method2737(ls, is, i, i_46_ - 1, (byte) 10);
			Class172.method2737(ls, is, 1 + i_46_, i_44_, (byte) 10);
		}
	}

	public static void method10876(long[] ls, Object[] objects) {
		Class238.method4374(ls, objects, 0, ls.length - 1, (byte) -6);
	}

	static void method10877(long[] ls, int[] is, int i, int i_52_) {
		if (i < i_52_) {
			int i_53_ = (i + i_52_) / 2;
			int i_54_ = i;
			long l = ls[i_53_];
			ls[i_53_] = ls[i_52_];
			ls[i_52_] = l;
			int i_55_ = is[i_53_];
			is[i_53_] = is[i_52_];
			is[i_52_] = i_55_;
			int i_56_ = 9223372036854775807L == l ? 0 : 1;
			for (int i_57_ = i; i_57_ < i_52_; i_57_++) {
				if (ls[i_57_] < (long) (i_57_ & i_56_) + l) {
					long l_58_ = ls[i_57_];
					ls[i_57_] = ls[i_54_];
					ls[i_54_] = l_58_;
					int i_59_ = is[i_57_];
					is[i_57_] = is[i_54_];
					is[i_54_++] = i_59_;
				}
			}
			ls[i_52_] = ls[i_54_];
			ls[i_54_] = l;
			is[i_52_] = is[i_54_];
			is[i_54_] = i_55_;
			Class172.method2737(ls, is, i, i_54_ - 1, (byte) 10);
			Class172.method2737(ls, is, 1 + i_54_, i_52_, (byte) 10);
		}
	}

	public static void method10878(float[] fs, int[] is, int i, int i_60_) {
		if (i < i_60_) {
			int i_61_ = (i + i_60_) / 2;
			int i_62_ = i;
			float f = fs[i_61_];
			fs[i_61_] = fs[i_60_];
			fs[i_60_] = f;
			int i_63_ = is[i_61_];
			is[i_61_] = is[i_60_];
			is[i_60_] = i_63_;
			for (int i_64_ = i; i_64_ < i_60_; i_64_++) {
				if (fs[i_64_] > f) {
					float f_65_ = fs[i_64_];
					fs[i_64_] = fs[i_62_];
					fs[i_62_] = f_65_;
					int i_66_ = is[i_64_];
					is[i_64_] = is[i_62_];
					is[i_62_++] = i_66_;
				}
			}
			fs[i_60_] = fs[i_62_];
			fs[i_62_] = f;
			is[i_60_] = is[i_62_];
			is[i_62_] = i_63_;
			Class102.method1799(fs, is, i, i_62_ - 1, (byte) 59);
			Class102.method1799(fs, is, 1 + i_62_, i_60_, (byte) 11);
		}
	}

	public static void method10879(int[] is, int[] is_67_, int i, int i_68_) {
		if (i < i_68_) {
			int i_69_ = (i_68_ + i) / 2;
			int i_70_ = i;
			int i_71_ = is[i_69_];
			is[i_69_] = is[i_68_];
			is[i_68_] = i_71_;
			int i_72_ = is_67_[i_69_];
			is_67_[i_69_] = is_67_[i_68_];
			is_67_[i_68_] = i_72_;
			int i_73_ = 2147483647 == i_71_ ? 0 : 1;
			for (int i_74_ = i; i_74_ < i_68_; i_74_++) {
				if (is[i_74_] < (i_74_ & i_73_) + i_71_) {
					int i_75_ = is[i_74_];
					is[i_74_] = is[i_70_];
					is[i_70_] = i_75_;
					int i_76_ = is_67_[i_74_];
					is_67_[i_74_] = is_67_[i_70_];
					is_67_[i_70_++] = i_76_;
				}
			}
			is[i_68_] = is[i_70_];
			is[i_70_] = i_71_;
			is_67_[i_68_] = is_67_[i_70_];
			is_67_[i_70_] = i_72_;
			Class149.method2492(is, is_67_, i, i_70_ - 1, -1160760025);
			Class149.method2492(is, is_67_, i_70_ + 1, i_68_, -2083279104);
		}
	}

	public static void method10880(long[] ls, Object[] objects) {
		Class238.method4374(ls, objects, 0, ls.length - 1, (byte) -108);
	}

	public static void method10881(int[] is, float[] fs, float[] fs_77_) {
		Class328.method5804(is, fs, fs_77_, 0, is.length - 1, 2094780917);
	}

	static void method10882(String[] strings, int[] is, int i, int i_78_) {
		if (i < i_78_) {
			int i_79_ = (i_78_ + i) / 2;
			int i_80_ = i;
			String string = strings[i_79_];
			strings[i_79_] = strings[i_78_];
			strings[i_78_] = string;
			int i_81_ = is[i_79_];
			is[i_79_] = is[i_78_];
			is[i_78_] = i_81_;
			for (int i_82_ = i; i_82_ < i_78_; i_82_++) {
				if (null == string || (null != strings[i_82_] && strings[i_82_].compareTo(string) < (i_82_ & 0x1))) {
					String string_83_ = strings[i_82_];
					strings[i_82_] = strings[i_80_];
					strings[i_80_] = string_83_;
					int i_84_ = is[i_82_];
					is[i_82_] = is[i_80_];
					is[i_80_++] = i_84_;
				}
			}
			strings[i_78_] = strings[i_80_];
			strings[i_80_] = string;
			is[i_78_] = is[i_80_];
			is[i_80_] = i_81_;
			Class532.method8924(strings, is, i, i_80_ - 1, -2146141707);
			Class532.method8924(strings, is, 1 + i_80_, i_78_, -206162008);
		}
	}

	public static void method10883(int[] is, Object[] objects) {
		Class605.method10048(is, objects, 0, is.length - 1, -1952882195);
	}

	public static void method10884(int[] is, Object[] objects) {
		Class605.method10048(is, objects, 0, is.length - 1, -1835462812);
	}

	static void method10885(long[] ls, Object[] objects, int i, int i_85_) {
		if (i < i_85_) {
			int i_86_ = (i_85_ + i) / 2;
			int i_87_ = i;
			long l = ls[i_86_];
			ls[i_86_] = ls[i_85_];
			ls[i_85_] = l;
			Object object = objects[i_86_];
			objects[i_86_] = objects[i_85_];
			objects[i_85_] = object;
			int i_88_ = l == 9223372036854775807L ? 0 : 1;
			for (int i_89_ = i; i_89_ < i_85_; i_89_++) {
				if (ls[i_89_] < l + (long) (i_89_ & i_88_)) {
					long l_90_ = ls[i_89_];
					ls[i_89_] = ls[i_87_];
					ls[i_87_] = l_90_;
					Object object_91_ = objects[i_89_];
					objects[i_89_] = objects[i_87_];
					objects[i_87_++] = object_91_;
				}
			}
			ls[i_85_] = ls[i_87_];
			ls[i_87_] = l;
			objects[i_85_] = objects[i_87_];
			objects[i_87_] = object;
			Class238.method4374(ls, objects, i, i_87_ - 1, (byte) -127);
			Class238.method4374(ls, objects, 1 + i_87_, i_85_, (byte) -27);
		}
	}

	public static void method10886(int[] is, Object[] objects) {
		Class605.method10048(is, objects, 0, is.length - 1, -1129041227);
	}

	static void method10887(int[] is, float[] fs, float[] fs_92_, int i, int i_93_) {
		if (i < i_93_) {
			int i_94_ = (i_93_ + i) / 2;
			int i_95_ = i;
			int i_96_ = is[i_94_];
			is[i_94_] = is[i_93_];
			is[i_93_] = i_96_;
			float f = fs[i_94_];
			fs[i_94_] = fs[i_93_];
			fs[i_93_] = f;
			float f_97_ = fs_92_[i_94_];
			fs_92_[i_94_] = fs_92_[i_93_];
			fs_92_[i_93_] = f_97_;
			int i_98_ = 9223372036854775807L == (long) i_96_ ? 0 : 1;
			for (int i_99_ = i; i_99_ < i_93_; i_99_++) {
				if (is[i_99_] < i_96_ + (i_99_ & i_98_)) {
					int i_100_ = is[i_99_];
					is[i_99_] = is[i_95_];
					is[i_95_] = i_100_;
					float f_101_ = fs[i_99_];
					fs[i_99_] = fs[i_95_];
					fs[i_95_] = f_101_;
					float f_102_ = fs_92_[i_99_];
					fs_92_[i_99_] = fs_92_[i_95_];
					fs_92_[i_95_] = f_102_;
					i_95_++;
				}
			}
			is[i_93_] = is[i_95_];
			is[i_95_] = i_96_;
			fs[i_93_] = fs[i_95_];
			fs[i_95_] = f;
			fs_92_[i_93_] = fs_92_[i_95_];
			fs_92_[i_95_] = f_97_;
			Class328.method5804(is, fs, fs_92_, i, i_95_ - 1, 1856174816);
			Class328.method5804(is, fs, fs_92_, 1 + i_95_, i_93_, 1429649017);
		}
	}

	Class652() throws Throwable {
		throw new Error();
	}

	public static void method10888(float[] fs, int[] is, int i, int i_103_) {
		if (i < i_103_) {
			int i_104_ = (i + i_103_) / 2;
			int i_105_ = i;
			float f = fs[i_104_];
			fs[i_104_] = fs[i_103_];
			fs[i_103_] = f;
			int i_106_ = is[i_104_];
			is[i_104_] = is[i_103_];
			is[i_103_] = i_106_;
			for (int i_107_ = i; i_107_ < i_103_; i_107_++) {
				if (fs[i_107_] > f) {
					float f_108_ = fs[i_107_];
					fs[i_107_] = fs[i_105_];
					fs[i_105_] = f_108_;
					int i_109_ = is[i_107_];
					is[i_107_] = is[i_105_];
					is[i_105_++] = i_109_;
				}
			}
			fs[i_103_] = fs[i_105_];
			fs[i_105_] = f;
			is[i_103_] = is[i_105_];
			is[i_105_] = i_106_;
			Class102.method1799(fs, is, i, i_105_ - 1, (byte) 26);
			Class102.method1799(fs, is, 1 + i_105_, i_103_, (byte) 21);
		}
	}

	public static void method10889(long[] ls, Object[] objects) {
		Class238.method4374(ls, objects, 0, ls.length - 1, (byte) -59);
	}

	public static void method10890(long[] ls, int[] is) {
		Class172.method2737(ls, is, 0, ls.length - 1, (byte) 10);
	}

	static void method10891(long[] ls, Object[] objects, int i, int i_110_) {
		if (i < i_110_) {
			int i_111_ = (i_110_ + i) / 2;
			int i_112_ = i;
			long l = ls[i_111_];
			ls[i_111_] = ls[i_110_];
			ls[i_110_] = l;
			Object object = objects[i_111_];
			objects[i_111_] = objects[i_110_];
			objects[i_110_] = object;
			int i_113_ = l == 9223372036854775807L ? 0 : 1;
			for (int i_114_ = i; i_114_ < i_110_; i_114_++) {
				if (ls[i_114_] < l + (long) (i_114_ & i_113_)) {
					long l_115_ = ls[i_114_];
					ls[i_114_] = ls[i_112_];
					ls[i_112_] = l_115_;
					Object object_116_ = objects[i_114_];
					objects[i_114_] = objects[i_112_];
					objects[i_112_++] = object_116_;
				}
			}
			ls[i_110_] = ls[i_112_];
			ls[i_112_] = l;
			objects[i_110_] = objects[i_112_];
			objects[i_112_] = object;
			Class238.method4374(ls, objects, i, i_112_ - 1, (byte) -81);
			Class238.method4374(ls, objects, 1 + i_112_, i_110_, (byte) -44);
		}
	}

	static void method10892(Class665 class665, byte i) {
		class665.anInt8526 -= 307142523;
		if (Class641.aBool8339) {
			Class512.method8487((class665.anIntArray8525[1769813785 * class665.anInt8526]) != 0, 1729260771);
			Class245.method4623(0 != (class665.anIntArray8525[1 + class665.anInt8526 * 1769813785]), -297430771);
			Class638.method10574(0 != (class665.anIntArray8525[2 + 1769813785 * class665.anInt8526]), (byte) -1);
		}
	}

	static final void method10893(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class492.method7990(class243, class240, class665, 1339254378);
	}

	static final void method10894(Class665 class665, int i) {
		class665.anInt8526 -= 409523364;
		int i_117_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_118_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		int i_119_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 2];
		int i_120_ = class665.anIntArray8525[3 + class665.anInt8526 * 1769813785];
		Class592 class592 = client.aClass509_11072.method8283((short) 32585);
		Class548.method9094(((i_117_ >> 14 & 0x3fff) - class592.anInt7798 * 153371143), ((i_117_ & 0x3fff) - -2029646807 * class592.anInt7799), i_118_ << 2, i_119_, i_120_, -2063805694);
		client.aBool11119 = true;
	}

	static boolean method10895(int i) {
		return Class510.method8443(Class271.aClass624_3128.aClass586_8154, -662449501);
	}

	static final void method10896(Class665 class665, int i) {
		int i_121_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (!Class402.aClass180_4150.method3251())
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 3;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = Class204.aClass527_Sub31_2213.aClass700_Sub37_10589.method14289(i_121_, 1124037719);
	}
}
