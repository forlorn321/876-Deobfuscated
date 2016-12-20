/* Class185_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class185_Sub2 extends Class185 {
	public byte[] aByteArray9371;
	int anInt9372;
	int anInt9373;
	int anInt9374;
	public int anInt9375;
	int anInt9376;
	public int[] anIntArray9377;
	public int anInt9378;
	public byte[] aByteArray9379;

	public void method3614(int i) {
		int i_0_ = -1;
		if (anIntArray9377.length < 255) {
			for (int i_1_ = 0; i_1_ < anIntArray9377.length; i_1_++) {
				if (anIntArray9377[i_1_] == i) {
					i_0_ = i_1_;
					break;
				}
			}
			if (i_0_ == -1) {
				i_0_ = anIntArray9377.length;
				int[] is = new int[anIntArray9377.length + 1];
				System.arraycopy(anIntArray9377, 0, is, 0, anIntArray9377.length);
				anIntArray9377 = is;
				is[i_0_] = i;
			}
		} else {
			int i_2_ = 2147483647;
			int i_3_ = i >> 16 & 0xff;
			int i_4_ = i >> 8 & 0xff;
			int i_5_ = i & 0xff;
			for (int i_6_ = 0; i_6_ < anIntArray9377.length; i_6_++) {
				int i_7_ = anIntArray9377[i_6_];
				int i_8_ = i_7_ >> 16 & 0xff;
				int i_9_ = i_7_ >> 8 & 0xff;
				int i_10_ = i_7_ & 0xff;
				int i_11_ = i_3_ - i_8_;
				if (i_11_ < 0)
					i_11_ = -i_11_;
				int i_12_ = i_4_ - i_9_;
				if (i_12_ < 0)
					i_12_ = -i_12_;
				int i_13_ = i_5_ - i_10_;
				if (i_13_ < 0)
					i_13_ = -i_13_;
				int i_14_ = i_11_ + i_12_ + i_13_;
				if (i_14_ < i_2_) {
					i_2_ = i_14_;
					i_0_ = i_6_;
				}
			}
		}
		int i_15_ = 0;
		byte[] is = new byte[anInt9373 * anInt9372];
		for (int i_16_ = 0; i_16_ < anInt9372; i_16_++) {
			for (int i_17_ = 0; i_17_ < anInt9373; i_17_++) {
				int i_18_ = aByteArray9371[i_15_] & 0xff;
				if (anIntArray9377[i_18_] == 0) {
					if (i_17_ > 0 && (anIntArray9377[aByteArray9371[i_15_ - 1] & 0xff] != 0))
						i_18_ = i_0_;
					else if (i_16_ > 0 && ((anIntArray9377[aByteArray9371[i_15_ - anInt9373] & 0xff]) != 0))
						i_18_ = i_0_;
					else if (i_17_ < anInt9373 - 1 && (anIntArray9377[aByteArray9371[i_15_ + 1] & 0xff]) != 0)
						i_18_ = i_0_;
					else if (i_16_ < anInt9372 - 1 && ((anIntArray9377[aByteArray9371[i_15_ + anInt9373] & 0xff]) != 0))
						i_18_ = i_0_;
				}
				is[i_15_++] = (byte) i_18_;
			}
		}
		aByteArray9371 = is;
	}

	public void method3606() {
		anInt9376 = 0;
		anInt9378 = 0;
		anInt9374 = 0;
		anInt9375 = 0;
	}

	public boolean method3568() {
		return aByteArray9379 != null;
	}

	public int method3636() {
		return anInt9373;
	}

	public int method3570() {
		return anInt9372;
	}

	public int method3576() {
		return anInt9373 + anInt9375 + anInt9374;
	}

	public int method3605() {
		return anInt9376;
	}

	public int method3634() {
		return anInt9375;
	}

	public int method3572() {
		return anInt9374;
	}

	public int method3611() {
		return anInt9378;
	}

	public int method3603() {
		return anInt9376;
	}

	public void method3617() {
		anInt9376 = 0;
		anInt9378 = 0;
		anInt9374 = 0;
		anInt9375 = 0;
	}

	public void method3578(int i) {
		int i_19_ = method3576();
		int i_20_ = method3577();
		if (anInt9373 != i_19_ || anInt9372 != i_20_) {
			int i_21_ = i;
			if (i_21_ > anInt9375)
				i_21_ = anInt9375;
			int i_22_ = i;
			if (i_22_ + anInt9375 + anInt9373 > i_19_)
				i_22_ = i_19_ - anInt9375 - anInt9373;
			int i_23_ = i;
			if (i_23_ > anInt9378)
				i_23_ = anInt9378;
			int i_24_ = i;
			if (i_24_ + anInt9378 + anInt9372 > i_20_)
				i_24_ = i_20_ - anInt9378 - anInt9372;
			int i_25_ = anInt9373 + i_21_ + i_22_;
			int i_26_ = anInt9372 + i_23_ + i_24_;
			byte[] is = new byte[i_25_ * i_26_];
			if (aByteArray9379 == null) {
				for (int i_27_ = 0; i_27_ < anInt9372; i_27_++) {
					int i_28_ = i_27_ * anInt9373;
					int i_29_ = (i_27_ + i_23_) * i_25_ + i_21_;
					for (int i_30_ = 0; i_30_ < anInt9373; i_30_++)
						is[i_29_++] = aByteArray9371[i_28_++];
				}
			} else {
				byte[] is_31_ = new byte[i_25_ * i_26_];
				for (int i_32_ = 0; i_32_ < anInt9372; i_32_++) {
					int i_33_ = i_32_ * anInt9373;
					int i_34_ = (i_32_ + i_23_) * i_25_ + i_21_;
					for (int i_35_ = 0; i_35_ < anInt9373; i_35_++) {
						is_31_[i_34_] = aByteArray9379[i_33_];
						is[i_34_++] = aByteArray9371[i_33_++];
					}
				}
				aByteArray9379 = is_31_;
			}
			anInt9375 -= i_21_;
			anInt9378 -= i_23_;
			anInt9374 -= i_22_;
			anInt9376 -= i_24_;
			anInt9373 = i_25_;
			anInt9372 = i_26_;
			aByteArray9371 = is;
		}
	}

	public void method3579(int i) {
		int i_36_ = -1;
		if (anIntArray9377.length < 255) {
			for (int i_37_ = 0; i_37_ < anIntArray9377.length; i_37_++) {
				if (anIntArray9377[i_37_] == i) {
					i_36_ = i_37_;
					break;
				}
			}
			if (i_36_ == -1) {
				i_36_ = anIntArray9377.length;
				int[] is = new int[anIntArray9377.length + 1];
				System.arraycopy(anIntArray9377, 0, is, 0, anIntArray9377.length);
				anIntArray9377 = is;
				is[i_36_] = i;
			}
		} else {
			int i_38_ = 2147483647;
			int i_39_ = i >> 16 & 0xff;
			int i_40_ = i >> 8 & 0xff;
			int i_41_ = i & 0xff;
			for (int i_42_ = 0; i_42_ < anIntArray9377.length; i_42_++) {
				int i_43_ = anIntArray9377[i_42_];
				int i_44_ = i_43_ >> 16 & 0xff;
				int i_45_ = i_43_ >> 8 & 0xff;
				int i_46_ = i_43_ & 0xff;
				int i_47_ = i_39_ - i_44_;
				if (i_47_ < 0)
					i_47_ = -i_47_;
				int i_48_ = i_40_ - i_45_;
				if (i_48_ < 0)
					i_48_ = -i_48_;
				int i_49_ = i_41_ - i_46_;
				if (i_49_ < 0)
					i_49_ = -i_49_;
				int i_50_ = i_47_ + i_48_ + i_49_;
				if (i_50_ < i_38_) {
					i_38_ = i_50_;
					i_36_ = i_42_;
				}
			}
		}
		int i_51_ = 0;
		byte[] is = new byte[anInt9373 * anInt9372];
		for (int i_52_ = 0; i_52_ < anInt9372; i_52_++) {
			for (int i_53_ = 0; i_53_ < anInt9373; i_53_++) {
				int i_54_ = aByteArray9371[i_51_] & 0xff;
				if (anIntArray9377[i_54_] == 0) {
					if (i_53_ > 0 && (anIntArray9377[aByteArray9371[i_51_ - 1] & 0xff] != 0))
						i_54_ = i_36_;
					else if (i_52_ > 0 && ((anIntArray9377[aByteArray9371[i_51_ - anInt9373] & 0xff]) != 0))
						i_54_ = i_36_;
					else if (i_53_ < anInt9373 - 1 && (anIntArray9377[aByteArray9371[i_51_ + 1] & 0xff]) != 0)
						i_54_ = i_36_;
					else if (i_52_ < anInt9372 - 1 && ((anIntArray9377[aByteArray9371[i_51_ + anInt9373] & 0xff]) != 0))
						i_54_ = i_36_;
				}
				is[i_51_++] = (byte) i_54_;
			}
		}
		aByteArray9371 = is;
	}

	public void method3580(int i) {
		int i_55_ = -1;
		if (anIntArray9377.length < 255) {
			for (int i_56_ = 0; i_56_ < anIntArray9377.length; i_56_++) {
				if (anIntArray9377[i_56_] == i) {
					i_55_ = i_56_;
					break;
				}
			}
			if (i_55_ == -1) {
				i_55_ = anIntArray9377.length;
				int[] is = new int[anIntArray9377.length + 1];
				System.arraycopy(anIntArray9377, 0, is, 0, anIntArray9377.length);
				anIntArray9377 = is;
				is[i_55_] = i;
			}
		} else {
			int i_57_ = 2147483647;
			int i_58_ = i >> 16 & 0xff;
			int i_59_ = i >> 8 & 0xff;
			int i_60_ = i & 0xff;
			for (int i_61_ = 0; i_61_ < anIntArray9377.length; i_61_++) {
				int i_62_ = anIntArray9377[i_61_];
				int i_63_ = i_62_ >> 16 & 0xff;
				int i_64_ = i_62_ >> 8 & 0xff;
				int i_65_ = i_62_ & 0xff;
				int i_66_ = i_58_ - i_63_;
				if (i_66_ < 0)
					i_66_ = -i_66_;
				int i_67_ = i_59_ - i_64_;
				if (i_67_ < 0)
					i_67_ = -i_67_;
				int i_68_ = i_60_ - i_65_;
				if (i_68_ < 0)
					i_68_ = -i_68_;
				int i_69_ = i_66_ + i_67_ + i_68_;
				if (i_69_ < i_57_) {
					i_57_ = i_69_;
					i_55_ = i_61_;
				}
			}
		}
		for (int i_70_ = anInt9372 - 1; i_70_ > 0; i_70_--) {
			int i_71_ = i_70_ * anInt9373;
			for (int i_72_ = anInt9373 - 1; i_72_ > 0; i_72_--) {
				if (anIntArray9377[aByteArray9371[i_72_ + i_71_] & 0xff] == 0 && (anIntArray9377[aByteArray9371[(i_72_ + i_71_ - 1 - anInt9373)] & 0xff] != 0))
					aByteArray9371[i_72_ + i_71_] = (byte) i_55_;
			}
		}
	}

	public int[] method3633(boolean bool) {
		int[] is;
		if (bool) {
			int i = method3576();
			is = new int[i * method3577()];
			if (aByteArray9379 != null) {
				for (int i_73_ = 0; i_73_ < anInt9372; i_73_++) {
					int i_74_ = i_73_ * anInt9373;
					int i_75_ = anInt9375 + (i_73_ + anInt9378) * i;
					for (int i_76_ = 0; i_76_ < anInt9373; i_76_++) {
						is[i_75_++] = (aByteArray9379[i_74_] << 24 | anIntArray9377[aByteArray9371[i_74_] & 0xff]);
						i_74_++;
					}
				}
			} else {
				for (int i_77_ = 0; i_77_ < anInt9372; i_77_++) {
					int i_78_ = i_77_ * anInt9373;
					int i_79_ = anInt9375 + (i_77_ + anInt9378) * i;
					for (int i_80_ = 0; i_80_ < anInt9373; i_80_++) {
						int i_81_ = anIntArray9377[aByteArray9371[i_78_++] & 0xff];
						if (i_81_ != 0)
							is[i_79_++] = ~0xffffff | i_81_;
						else
							is[i_79_++] = 0;
					}
				}
			}
		} else {
			is = new int[anInt9373 * anInt9372];
			int i = 0;
			int i_82_ = 0;
			if (aByteArray9379 != null) {
				for (int i_83_ = 0; i_83_ < anInt9372; i_83_++) {
					for (int i_84_ = 0; i_84_ < anInt9373; i_84_++) {
						is[i_82_++] = (aByteArray9379[i] << 24 | anIntArray9377[aByteArray9371[i] & 0xff]);
						i++;
					}
				}
			} else {
				for (int i_85_ = 0; i_85_ < anInt9372; i_85_++) {
					for (int i_86_ = 0; i_86_ < anInt9373; i_86_++) {
						int i_87_ = anIntArray9377[aByteArray9371[i++] & 0xff];
						is[i_82_++] = i_87_ != 0 ? ~0xffffff | i_87_ : 0;
					}
				}
			}
		}
		return is;
	}

	public void method3582() {
		byte[] is = aByteArray9371;
		if (aByteArray9379 == null) {
			for (int i = (anInt9372 >> 1) - 1; i >= 0; i--) {
				int i_88_ = i * anInt9373;
				int i_89_ = (anInt9372 - i - 1) * anInt9373;
				for (int i_90_ = -anInt9373; i_90_ < 0; i_90_++) {
					byte i_91_ = is[i_88_];
					is[i_88_] = is[i_89_];
					is[i_89_] = i_91_;
					i_88_++;
					i_89_++;
				}
			}
		} else {
			byte[] is_92_ = aByteArray9379;
			for (int i = (anInt9372 >> 1) - 1; i >= 0; i--) {
				int i_93_ = i * anInt9373;
				int i_94_ = (anInt9372 - i - 1) * anInt9373;
				for (int i_95_ = -anInt9373; i_95_ < 0; i_95_++) {
					byte i_96_ = is[i_93_];
					is[i_93_] = is[i_94_];
					is[i_94_] = i_96_;
					i_96_ = is_92_[i_93_];
					is_92_[i_93_] = is_92_[i_94_];
					is_92_[i_94_] = i_96_;
					i_93_++;
					i_94_++;
				}
			}
		}
		int i = anInt9378;
		anInt9378 = anInt9376;
		anInt9376 = i;
	}

	public void method3593() {
		byte[] is = new byte[anInt9373 * anInt9372];
		int i = 0;
		if (aByteArray9379 == null) {
			for (int i_97_ = 0; i_97_ < anInt9373; i_97_++) {
				for (int i_98_ = anInt9372 - 1; i_98_ >= 0; i_98_--)
					is[i++] = aByteArray9371[i_97_ + i_98_ * anInt9373];
			}
			aByteArray9371 = is;
		} else {
			byte[] is_99_ = new byte[anInt9373 * anInt9372];
			for (int i_100_ = 0; i_100_ < anInt9373; i_100_++) {
				for (int i_101_ = anInt9372 - 1; i_101_ >= 0; i_101_--) {
					is[i] = aByteArray9371[i_100_ + i_101_ * anInt9373];
					is_99_[i++] = aByteArray9379[i_100_ + i_101_ * anInt9373];
				}
			}
			aByteArray9371 = is;
			aByteArray9379 = is_99_;
		}
		int i_102_ = anInt9378;
		anInt9378 = anInt9375;
		anInt9375 = anInt9376;
		anInt9376 = anInt9374;
		anInt9374 = i_102_;
		i_102_ = anInt9372;
		anInt9372 = anInt9373;
		anInt9373 = i_102_;
	}

	public int[] method3584(boolean bool) {
		int[] is;
		if (bool) {
			int i = method3576();
			is = new int[i * method3577()];
			if (aByteArray9379 != null) {
				for (int i_103_ = 0; i_103_ < anInt9372; i_103_++) {
					int i_104_ = i_103_ * anInt9373;
					int i_105_ = anInt9375 + (i_103_ + anInt9378) * i;
					for (int i_106_ = 0; i_106_ < anInt9373; i_106_++) {
						is[i_105_++] = (aByteArray9379[i_104_] << 24 | (anIntArray9377[aByteArray9371[i_104_] & 0xff]));
						i_104_++;
					}
				}
			} else {
				for (int i_107_ = 0; i_107_ < anInt9372; i_107_++) {
					int i_108_ = i_107_ * anInt9373;
					int i_109_ = anInt9375 + (i_107_ + anInt9378) * i;
					for (int i_110_ = 0; i_110_ < anInt9373; i_110_++) {
						int i_111_ = anIntArray9377[aByteArray9371[i_108_++] & 0xff];
						if (i_111_ != 0)
							is[i_109_++] = ~0xffffff | i_111_;
						else
							is[i_109_++] = 0;
					}
				}
			}
		} else {
			is = new int[anInt9373 * anInt9372];
			int i = 0;
			int i_112_ = 0;
			if (aByteArray9379 != null) {
				for (int i_113_ = 0; i_113_ < anInt9372; i_113_++) {
					for (int i_114_ = 0; i_114_ < anInt9373; i_114_++) {
						is[i_112_++] = (aByteArray9379[i] << 24 | anIntArray9377[aByteArray9371[i] & 0xff]);
						i++;
					}
				}
			} else {
				for (int i_115_ = 0; i_115_ < anInt9372; i_115_++) {
					for (int i_116_ = 0; i_116_ < anInt9373; i_116_++) {
						int i_117_ = anIntArray9377[aByteArray9371[i++] & 0xff];
						is[i_112_++] = i_117_ != 0 ? ~0xffffff | i_117_ : 0;
					}
				}
			}
		}
		return is;
	}

	public void method3585(int i, int i_118_, int i_119_) {
		for (int i_120_ = 1; i_120_ < anIntArray9377.length; i_120_++) {
			if (anIntArray9377[i_120_] != 1 && anIntArray9377[i_120_] != 16711935) {
				int i_121_ = anIntArray9377[i_120_] >> 16 & 0xff;
				i_121_ += i;
				if (i_121_ < 0)
					i_121_ = 0;
				else if (i_121_ > 255)
					i_121_ = 255;
				int i_122_ = anIntArray9377[i_120_] >> 8 & 0xff;
				i_122_ += i_118_;
				if (i_122_ < 0)
					i_122_ = 0;
				else if (i_122_ > 255)
					i_122_ = 255;
				int i_123_ = anIntArray9377[i_120_] >> 0 & 0xff;
				i_123_ += i_119_;
				if (i_123_ < 0)
					i_123_ = 0;
				else if (i_123_ > 255)
					i_123_ = 255;
				anIntArray9377[i_120_] = i_121_ << 16 | i_122_ << 8 | i_123_;
			}
		}
	}

	Class185_Sub2() {
		/* empty */
	}

	public void method3586(int i) {
		int i_124_ = -1;
		if (anIntArray9377.length < 255) {
			for (int i_125_ = 0; i_125_ < anIntArray9377.length; i_125_++) {
				if (anIntArray9377[i_125_] == i) {
					i_124_ = i_125_;
					break;
				}
			}
			if (i_124_ == -1) {
				i_124_ = anIntArray9377.length;
				int[] is = new int[anIntArray9377.length + 1];
				System.arraycopy(anIntArray9377, 0, is, 0, anIntArray9377.length);
				anIntArray9377 = is;
				is[i_124_] = i;
			}
		} else {
			int i_126_ = 2147483647;
			int i_127_ = i >> 16 & 0xff;
			int i_128_ = i >> 8 & 0xff;
			int i_129_ = i & 0xff;
			for (int i_130_ = 0; i_130_ < anIntArray9377.length; i_130_++) {
				int i_131_ = anIntArray9377[i_130_];
				int i_132_ = i_131_ >> 16 & 0xff;
				int i_133_ = i_131_ >> 8 & 0xff;
				int i_134_ = i_131_ & 0xff;
				int i_135_ = i_127_ - i_132_;
				if (i_135_ < 0)
					i_135_ = -i_135_;
				int i_136_ = i_128_ - i_133_;
				if (i_136_ < 0)
					i_136_ = -i_136_;
				int i_137_ = i_129_ - i_134_;
				if (i_137_ < 0)
					i_137_ = -i_137_;
				int i_138_ = i_135_ + i_136_ + i_137_;
				if (i_138_ < i_126_) {
					i_126_ = i_138_;
					i_124_ = i_130_;
				}
			}
		}
		int i_139_ = 0;
		byte[] is = new byte[anInt9373 * anInt9372];
		for (int i_140_ = 0; i_140_ < anInt9372; i_140_++) {
			for (int i_141_ = 0; i_141_ < anInt9373; i_141_++) {
				int i_142_ = aByteArray9371[i_139_] & 0xff;
				if (anIntArray9377[i_142_] == 0) {
					if (i_141_ > 0 && (anIntArray9377[aByteArray9371[i_139_ - 1] & 0xff] != 0))
						i_142_ = i_124_;
					else if (i_140_ > 0 && ((anIntArray9377[aByteArray9371[i_139_ - anInt9373] & 0xff]) != 0))
						i_142_ = i_124_;
					else if (i_141_ < anInt9373 - 1 && (anIntArray9377[aByteArray9371[i_139_ + 1] & 0xff]) != 0)
						i_142_ = i_124_;
					else if (i_140_ < anInt9372 - 1 && ((anIntArray9377[aByteArray9371[i_139_ + anInt9373] & 0xff]) != 0))
						i_142_ = i_124_;
				}
				is[i_139_++] = (byte) i_142_;
			}
		}
		aByteArray9371 = is;
	}

	public boolean method3612() {
		return aByteArray9379 != null;
	}

	public boolean method3587() {
		return true;
	}

	public boolean method3590() {
		return aByteArray9379 != null;
	}

	public int method3574() {
		return anInt9373;
	}

	public int method3592() {
		return anInt9373;
	}

	public void method3613(int i, int i_143_, int i_144_) {
		for (int i_145_ = 1; i_145_ < anIntArray9377.length; i_145_++) {
			if (anIntArray9377[i_145_] != 1 && anIntArray9377[i_145_] != 16711935) {
				int i_146_ = anIntArray9377[i_145_] >> 16 & 0xff;
				i_146_ += i;
				if (i_146_ < 0)
					i_146_ = 0;
				else if (i_146_ > 255)
					i_146_ = 255;
				int i_147_ = anIntArray9377[i_145_] >> 8 & 0xff;
				i_147_ += i_143_;
				if (i_147_ < 0)
					i_147_ = 0;
				else if (i_147_ > 255)
					i_147_ = 255;
				int i_148_ = anIntArray9377[i_145_] >> 0 & 0xff;
				i_148_ += i_144_;
				if (i_148_ < 0)
					i_148_ = 0;
				else if (i_148_ > 255)
					i_148_ = 255;
				anIntArray9377[i_145_] = i_146_ << 16 | i_147_ << 8 | i_148_;
			}
		}
	}

	public int method3620() {
		return anInt9373;
	}

	public int method3595() {
		return anInt9372;
	}

	public int method3566(int i, int i_149_) {
		return anIntArray9377[aByteArray9371[i + i_149_ * anInt9373] & 0xff];
	}

	public int method3597() {
		return anInt9372;
	}

	public int method3598() {
		return anInt9372 + anInt9378 + anInt9376;
	}

	public void method3618() {
		byte[] is = aByteArray9371;
		if (aByteArray9379 == null) {
			for (int i = anInt9372 - 1; i >= 0; i--) {
				int i_150_ = i * anInt9373;
				for (int i_151_ = (i + 1) * anInt9373; i_150_ < i_151_; i_150_++) {
					i_151_--;
					byte i_152_ = is[i_150_];
					is[i_150_] = is[i_151_];
					is[i_151_] = i_152_;
				}
			}
		} else {
			byte[] is_153_ = aByteArray9379;
			for (int i = anInt9372 - 1; i >= 0; i--) {
				int i_154_ = i * anInt9373;
				for (int i_155_ = (i + 1) * anInt9373; i_154_ < i_155_; i_154_++) {
					i_155_--;
					byte i_156_ = is[i_154_];
					is[i_154_] = is[i_155_];
					is[i_155_] = i_156_;
					i_156_ = is_153_[i_154_];
					is_153_[i_154_] = is_153_[i_155_];
					is_153_[i_155_] = i_156_;
				}
			}
		}
		int i = anInt9375;
		anInt9375 = anInt9374;
		anInt9374 = i;
	}

	public int method3577() {
		return anInt9372 + anInt9378 + anInt9376;
	}

	public void method3571() {
		byte[] is = new byte[anInt9373 * anInt9372];
		int i = 0;
		if (aByteArray9379 == null) {
			for (int i_157_ = 0; i_157_ < anInt9373; i_157_++) {
				for (int i_158_ = anInt9372 - 1; i_158_ >= 0; i_158_--)
					is[i++] = aByteArray9371[i_157_ + i_158_ * anInt9373];
			}
			aByteArray9371 = is;
		} else {
			byte[] is_159_ = new byte[anInt9373 * anInt9372];
			for (int i_160_ = 0; i_160_ < anInt9373; i_160_++) {
				for (int i_161_ = anInt9372 - 1; i_161_ >= 0; i_161_--) {
					is[i] = aByteArray9371[i_160_ + i_161_ * anInt9373];
					is_159_[i++] = aByteArray9379[i_160_ + i_161_ * anInt9373];
				}
			}
			aByteArray9371 = is;
			aByteArray9379 = is_159_;
		}
		int i_162_ = anInt9378;
		anInt9378 = anInt9375;
		anInt9375 = anInt9376;
		anInt9376 = anInt9374;
		anInt9374 = i_162_;
		i_162_ = anInt9372;
		anInt9372 = anInt9373;
		anInt9373 = i_162_;
	}

	public int method3619() {
		return anInt9374;
	}

	public void method3588(int i, int i_163_, int i_164_) {
		for (int i_165_ = 1; i_165_ < anIntArray9377.length; i_165_++) {
			if (anIntArray9377[i_165_] != 1 && anIntArray9377[i_165_] != 16711935) {
				int i_166_ = anIntArray9377[i_165_] >> 16 & 0xff;
				i_166_ += i;
				if (i_166_ < 0)
					i_166_ = 0;
				else if (i_166_ > 255)
					i_166_ = 255;
				int i_167_ = anIntArray9377[i_165_] >> 8 & 0xff;
				i_167_ += i_163_;
				if (i_167_ < 0)
					i_167_ = 0;
				else if (i_167_ > 255)
					i_167_ = 255;
				int i_168_ = anIntArray9377[i_165_] >> 0 & 0xff;
				i_168_ += i_164_;
				if (i_168_ < 0)
					i_168_ = 0;
				else if (i_168_ > 255)
					i_168_ = 255;
				anIntArray9377[i_165_] = i_166_ << 16 | i_167_ << 8 | i_168_;
			}
		}
	}

	public int method3604() {
		return anInt9378;
	}

	public int method3635() {
		return anInt9376;
	}

	public int method3599() {
		return anInt9372 + anInt9378 + anInt9376;
	}

	public int method3596() {
		return anInt9372;
	}

	public void method3607() {
		anInt9376 = 0;
		anInt9378 = 0;
		anInt9374 = 0;
		anInt9375 = 0;
	}

	public void method3621() {
		byte[] is = aByteArray9371;
		if (aByteArray9379 == null) {
			for (int i = anInt9372 - 1; i >= 0; i--) {
				int i_169_ = i * anInt9373;
				for (int i_170_ = (i + 1) * anInt9373; i_169_ < i_170_; i_169_++) {
					i_170_--;
					byte i_171_ = is[i_169_];
					is[i_169_] = is[i_170_];
					is[i_170_] = i_171_;
				}
			}
		} else {
			byte[] is_172_ = aByteArray9379;
			for (int i = anInt9372 - 1; i >= 0; i--) {
				int i_173_ = i * anInt9373;
				for (int i_174_ = (i + 1) * anInt9373; i_173_ < i_174_; i_173_++) {
					i_174_--;
					byte i_175_ = is[i_173_];
					is[i_173_] = is[i_174_];
					is[i_174_] = i_175_;
					i_175_ = is_172_[i_173_];
					is_172_[i_173_] = is_172_[i_174_];
					is_172_[i_174_] = i_175_;
				}
			}
		}
		int i = anInt9375;
		anInt9375 = anInt9374;
		anInt9374 = i;
	}

	public void method3609() {
		anInt9376 = 0;
		anInt9378 = 0;
		anInt9374 = 0;
		anInt9375 = 0;
	}

	public void method3610(int i) {
		int i_176_ = method3576();
		int i_177_ = method3577();
		if (anInt9373 != i_176_ || anInt9372 != i_177_) {
			int i_178_ = i;
			if (i_178_ > anInt9375)
				i_178_ = anInt9375;
			int i_179_ = i;
			if (i_179_ + anInt9375 + anInt9373 > i_176_)
				i_179_ = i_176_ - anInt9375 - anInt9373;
			int i_180_ = i;
			if (i_180_ > anInt9378)
				i_180_ = anInt9378;
			int i_181_ = i;
			if (i_181_ + anInt9378 + anInt9372 > i_177_)
				i_181_ = i_177_ - anInt9378 - anInt9372;
			int i_182_ = anInt9373 + i_178_ + i_179_;
			int i_183_ = anInt9372 + i_180_ + i_181_;
			byte[] is = new byte[i_182_ * i_183_];
			if (aByteArray9379 == null) {
				for (int i_184_ = 0; i_184_ < anInt9372; i_184_++) {
					int i_185_ = i_184_ * anInt9373;
					int i_186_ = (i_184_ + i_180_) * i_182_ + i_178_;
					for (int i_187_ = 0; i_187_ < anInt9373; i_187_++)
						is[i_186_++] = aByteArray9371[i_185_++];
				}
			} else {
				byte[] is_188_ = new byte[i_182_ * i_183_];
				for (int i_189_ = 0; i_189_ < anInt9372; i_189_++) {
					int i_190_ = i_189_ * anInt9373;
					int i_191_ = (i_189_ + i_180_) * i_182_ + i_178_;
					for (int i_192_ = 0; i_192_ < anInt9373; i_192_++) {
						is_188_[i_191_] = aByteArray9379[i_190_];
						is[i_191_++] = aByteArray9371[i_190_++];
					}
				}
				aByteArray9379 = is_188_;
			}
			anInt9375 -= i_178_;
			anInt9378 -= i_180_;
			anInt9374 -= i_179_;
			anInt9376 -= i_181_;
			anInt9373 = i_182_;
			anInt9372 = i_183_;
			aByteArray9371 = is;
		}
	}

	public int method3600() {
		return anInt9372 + anInt9378 + anInt9376;
	}

	public void method3583(int i) {
		int i_193_ = method3576();
		int i_194_ = method3577();
		if (anInt9373 != i_193_ || anInt9372 != i_194_) {
			int i_195_ = i;
			if (i_195_ > anInt9375)
				i_195_ = anInt9375;
			int i_196_ = i;
			if (i_196_ + anInt9375 + anInt9373 > i_193_)
				i_196_ = i_193_ - anInt9375 - anInt9373;
			int i_197_ = i;
			if (i_197_ > anInt9378)
				i_197_ = anInt9378;
			int i_198_ = i;
			if (i_198_ + anInt9378 + anInt9372 > i_194_)
				i_198_ = i_194_ - anInt9378 - anInt9372;
			int i_199_ = anInt9373 + i_195_ + i_196_;
			int i_200_ = anInt9372 + i_197_ + i_198_;
			byte[] is = new byte[i_199_ * i_200_];
			if (aByteArray9379 == null) {
				for (int i_201_ = 0; i_201_ < anInt9372; i_201_++) {
					int i_202_ = i_201_ * anInt9373;
					int i_203_ = (i_201_ + i_197_) * i_199_ + i_195_;
					for (int i_204_ = 0; i_204_ < anInt9373; i_204_++)
						is[i_203_++] = aByteArray9371[i_202_++];
				}
			} else {
				byte[] is_205_ = new byte[i_199_ * i_200_];
				for (int i_206_ = 0; i_206_ < anInt9372; i_206_++) {
					int i_207_ = i_206_ * anInt9373;
					int i_208_ = (i_206_ + i_197_) * i_199_ + i_195_;
					for (int i_209_ = 0; i_209_ < anInt9373; i_209_++) {
						is_205_[i_208_] = aByteArray9379[i_207_];
						is[i_208_++] = aByteArray9371[i_207_++];
					}
				}
				aByteArray9379 = is_205_;
			}
			anInt9375 -= i_195_;
			anInt9378 -= i_197_;
			anInt9374 -= i_196_;
			anInt9376 -= i_198_;
			anInt9373 = i_199_;
			anInt9372 = i_200_;
			aByteArray9371 = is;
		}
	}

	public void method3624() {
		byte[] is = new byte[anInt9373 * anInt9372];
		int i = 0;
		if (aByteArray9379 == null) {
			for (int i_210_ = 0; i_210_ < anInt9373; i_210_++) {
				for (int i_211_ = anInt9372 - 1; i_211_ >= 0; i_211_--)
					is[i++] = aByteArray9371[i_210_ + i_211_ * anInt9373];
			}
			aByteArray9371 = is;
		} else {
			byte[] is_212_ = new byte[anInt9373 * anInt9372];
			for (int i_213_ = 0; i_213_ < anInt9373; i_213_++) {
				for (int i_214_ = anInt9372 - 1; i_214_ >= 0; i_214_--) {
					is[i] = aByteArray9371[i_213_ + i_214_ * anInt9373];
					is_212_[i++] = aByteArray9379[i_213_ + i_214_ * anInt9373];
				}
			}
			aByteArray9371 = is;
			aByteArray9379 = is_212_;
		}
		int i_215_ = anInt9378;
		anInt9378 = anInt9375;
		anInt9375 = anInt9376;
		anInt9376 = anInt9374;
		anInt9374 = i_215_;
		i_215_ = anInt9372;
		anInt9372 = anInt9373;
		anInt9373 = i_215_;
	}

	public int method3630() {
		return anInt9374;
	}

	public void method3615(int i) {
		int i_216_ = -1;
		if (anIntArray9377.length < 255) {
			for (int i_217_ = 0; i_217_ < anIntArray9377.length; i_217_++) {
				if (anIntArray9377[i_217_] == i) {
					i_216_ = i_217_;
					break;
				}
			}
			if (i_216_ == -1) {
				i_216_ = anIntArray9377.length;
				int[] is = new int[anIntArray9377.length + 1];
				System.arraycopy(anIntArray9377, 0, is, 0, anIntArray9377.length);
				anIntArray9377 = is;
				is[i_216_] = i;
			}
		} else {
			int i_218_ = 2147483647;
			int i_219_ = i >> 16 & 0xff;
			int i_220_ = i >> 8 & 0xff;
			int i_221_ = i & 0xff;
			for (int i_222_ = 0; i_222_ < anIntArray9377.length; i_222_++) {
				int i_223_ = anIntArray9377[i_222_];
				int i_224_ = i_223_ >> 16 & 0xff;
				int i_225_ = i_223_ >> 8 & 0xff;
				int i_226_ = i_223_ & 0xff;
				int i_227_ = i_219_ - i_224_;
				if (i_227_ < 0)
					i_227_ = -i_227_;
				int i_228_ = i_220_ - i_225_;
				if (i_228_ < 0)
					i_228_ = -i_228_;
				int i_229_ = i_221_ - i_226_;
				if (i_229_ < 0)
					i_229_ = -i_229_;
				int i_230_ = i_227_ + i_228_ + i_229_;
				if (i_230_ < i_218_) {
					i_218_ = i_230_;
					i_216_ = i_222_;
				}
			}
		}
		int i_231_ = 0;
		byte[] is = new byte[anInt9373 * anInt9372];
		for (int i_232_ = 0; i_232_ < anInt9372; i_232_++) {
			for (int i_233_ = 0; i_233_ < anInt9373; i_233_++) {
				int i_234_ = aByteArray9371[i_231_] & 0xff;
				if (anIntArray9377[i_234_] == 0) {
					if (i_233_ > 0 && (anIntArray9377[aByteArray9371[i_231_ - 1] & 0xff] != 0))
						i_234_ = i_216_;
					else if (i_232_ > 0 && ((anIntArray9377[aByteArray9371[i_231_ - anInt9373] & 0xff]) != 0))
						i_234_ = i_216_;
					else if (i_233_ < anInt9373 - 1 && (anIntArray9377[aByteArray9371[i_231_ + 1] & 0xff]) != 0)
						i_234_ = i_216_;
					else if (i_232_ < anInt9372 - 1 && ((anIntArray9377[aByteArray9371[i_231_ + anInt9373] & 0xff]) != 0))
						i_234_ = i_216_;
				}
				is[i_231_++] = (byte) i_234_;
			}
		}
		aByteArray9371 = is;
	}

	public int method3629() {
		return anInt9375;
	}

	public void method3569(int i) {
		int i_235_ = -1;
		if (anIntArray9377.length < 255) {
			for (int i_236_ = 0; i_236_ < anIntArray9377.length; i_236_++) {
				if (anIntArray9377[i_236_] == i) {
					i_235_ = i_236_;
					break;
				}
			}
			if (i_235_ == -1) {
				i_235_ = anIntArray9377.length;
				int[] is = new int[anIntArray9377.length + 1];
				System.arraycopy(anIntArray9377, 0, is, 0, anIntArray9377.length);
				anIntArray9377 = is;
				is[i_235_] = i;
			}
		} else {
			int i_237_ = 2147483647;
			int i_238_ = i >> 16 & 0xff;
			int i_239_ = i >> 8 & 0xff;
			int i_240_ = i & 0xff;
			for (int i_241_ = 0; i_241_ < anIntArray9377.length; i_241_++) {
				int i_242_ = anIntArray9377[i_241_];
				int i_243_ = i_242_ >> 16 & 0xff;
				int i_244_ = i_242_ >> 8 & 0xff;
				int i_245_ = i_242_ & 0xff;
				int i_246_ = i_238_ - i_243_;
				if (i_246_ < 0)
					i_246_ = -i_246_;
				int i_247_ = i_239_ - i_244_;
				if (i_247_ < 0)
					i_247_ = -i_247_;
				int i_248_ = i_240_ - i_245_;
				if (i_248_ < 0)
					i_248_ = -i_248_;
				int i_249_ = i_246_ + i_247_ + i_248_;
				if (i_249_ < i_237_) {
					i_237_ = i_249_;
					i_235_ = i_241_;
				}
			}
		}
		for (int i_250_ = anInt9372 - 1; i_250_ > 0; i_250_--) {
			int i_251_ = i_250_ * anInt9373;
			for (int i_252_ = anInt9373 - 1; i_252_ > 0; i_252_--) {
				if (anIntArray9377[aByteArray9371[i_252_ + i_251_] & 0xff] == 0 && (anIntArray9377[aByteArray9371[(i_252_ + i_251_ - 1 - anInt9373)] & 0xff] != 0))
					aByteArray9371[i_252_ + i_251_] = (byte) i_235_;
			}
		}
	}

	public void method3594(int i) {
		int i_253_ = method3576();
		int i_254_ = method3577();
		if (anInt9373 != i_253_ || anInt9372 != i_254_) {
			int i_255_ = i;
			if (i_255_ > anInt9375)
				i_255_ = anInt9375;
			int i_256_ = i;
			if (i_256_ + anInt9375 + anInt9373 > i_253_)
				i_256_ = i_253_ - anInt9375 - anInt9373;
			int i_257_ = i;
			if (i_257_ > anInt9378)
				i_257_ = anInt9378;
			int i_258_ = i;
			if (i_258_ + anInt9378 + anInt9372 > i_254_)
				i_258_ = i_254_ - anInt9378 - anInt9372;
			int i_259_ = anInt9373 + i_255_ + i_256_;
			int i_260_ = anInt9372 + i_257_ + i_258_;
			byte[] is = new byte[i_259_ * i_260_];
			if (aByteArray9379 == null) {
				for (int i_261_ = 0; i_261_ < anInt9372; i_261_++) {
					int i_262_ = i_261_ * anInt9373;
					int i_263_ = (i_261_ + i_257_) * i_259_ + i_255_;
					for (int i_264_ = 0; i_264_ < anInt9373; i_264_++)
						is[i_263_++] = aByteArray9371[i_262_++];
				}
			} else {
				byte[] is_265_ = new byte[i_259_ * i_260_];
				for (int i_266_ = 0; i_266_ < anInt9372; i_266_++) {
					int i_267_ = i_266_ * anInt9373;
					int i_268_ = (i_266_ + i_257_) * i_259_ + i_255_;
					for (int i_269_ = 0; i_269_ < anInt9373; i_269_++) {
						is_265_[i_268_] = aByteArray9379[i_267_];
						is[i_268_++] = aByteArray9371[i_267_++];
					}
				}
				aByteArray9379 = is_265_;
			}
			anInt9375 -= i_255_;
			anInt9378 -= i_257_;
			anInt9374 -= i_256_;
			anInt9376 -= i_258_;
			anInt9373 = i_259_;
			anInt9372 = i_260_;
			aByteArray9371 = is;
		}
	}

	public void method3625() {
		byte[] is = aByteArray9371;
		if (aByteArray9379 == null) {
			for (int i = anInt9372 - 1; i >= 0; i--) {
				int i_270_ = i * anInt9373;
				for (int i_271_ = (i + 1) * anInt9373; i_270_ < i_271_; i_270_++) {
					i_271_--;
					byte i_272_ = is[i_270_];
					is[i_270_] = is[i_271_];
					is[i_271_] = i_272_;
				}
			}
		} else {
			byte[] is_273_ = aByteArray9379;
			for (int i = anInt9372 - 1; i >= 0; i--) {
				int i_274_ = i * anInt9373;
				for (int i_275_ = (i + 1) * anInt9373; i_274_ < i_275_; i_274_++) {
					i_275_--;
					byte i_276_ = is[i_274_];
					is[i_274_] = is[i_275_];
					is[i_275_] = i_276_;
					i_276_ = is_273_[i_274_];
					is_273_[i_274_] = is_273_[i_275_];
					is_273_[i_275_] = i_276_;
				}
			}
		}
		int i = anInt9375;
		anInt9375 = anInt9374;
		anInt9374 = i;
	}

	public void method3581() {
		byte[] is = aByteArray9371;
		if (aByteArray9379 == null) {
			for (int i = anInt9372 - 1; i >= 0; i--) {
				int i_277_ = i * anInt9373;
				for (int i_278_ = (i + 1) * anInt9373; i_277_ < i_278_; i_277_++) {
					i_278_--;
					byte i_279_ = is[i_277_];
					is[i_277_] = is[i_278_];
					is[i_278_] = i_279_;
				}
			}
		} else {
			byte[] is_280_ = aByteArray9379;
			for (int i = anInt9372 - 1; i >= 0; i--) {
				int i_281_ = i * anInt9373;
				for (int i_282_ = (i + 1) * anInt9373; i_281_ < i_282_; i_281_++) {
					i_282_--;
					byte i_283_ = is[i_281_];
					is[i_281_] = is[i_282_];
					is[i_282_] = i_283_;
					i_283_ = is_280_[i_281_];
					is_280_[i_281_] = is_280_[i_282_];
					is_280_[i_282_] = i_283_;
				}
			}
		}
		int i = anInt9375;
		anInt9375 = anInt9374;
		anInt9374 = i;
	}

	public void method3575() {
		byte[] is = aByteArray9371;
		if (aByteArray9379 == null) {
			for (int i = (anInt9372 >> 1) - 1; i >= 0; i--) {
				int i_284_ = i * anInt9373;
				int i_285_ = (anInt9372 - i - 1) * anInt9373;
				for (int i_286_ = -anInt9373; i_286_ < 0; i_286_++) {
					byte i_287_ = is[i_284_];
					is[i_284_] = is[i_285_];
					is[i_285_] = i_287_;
					i_284_++;
					i_285_++;
				}
			}
		} else {
			byte[] is_288_ = aByteArray9379;
			for (int i = (anInt9372 >> 1) - 1; i >= 0; i--) {
				int i_289_ = i * anInt9373;
				int i_290_ = (anInt9372 - i - 1) * anInt9373;
				for (int i_291_ = -anInt9373; i_291_ < 0; i_291_++) {
					byte i_292_ = is[i_289_];
					is[i_289_] = is[i_290_];
					is[i_290_] = i_292_;
					i_292_ = is_288_[i_289_];
					is_288_[i_289_] = is_288_[i_290_];
					is_288_[i_290_] = i_292_;
					i_289_++;
					i_290_++;
				}
			}
		}
		int i = anInt9378;
		anInt9378 = anInt9376;
		anInt9376 = i;
	}

	public void method3573() {
		byte[] is = aByteArray9371;
		if (aByteArray9379 == null) {
			for (int i = (anInt9372 >> 1) - 1; i >= 0; i--) {
				int i_293_ = i * anInt9373;
				int i_294_ = (anInt9372 - i - 1) * anInt9373;
				for (int i_295_ = -anInt9373; i_295_ < 0; i_295_++) {
					byte i_296_ = is[i_293_];
					is[i_293_] = is[i_294_];
					is[i_294_] = i_296_;
					i_293_++;
					i_294_++;
				}
			}
		} else {
			byte[] is_297_ = aByteArray9379;
			for (int i = (anInt9372 >> 1) - 1; i >= 0; i--) {
				int i_298_ = i * anInt9373;
				int i_299_ = (anInt9372 - i - 1) * anInt9373;
				for (int i_300_ = -anInt9373; i_300_ < 0; i_300_++) {
					byte i_301_ = is[i_298_];
					is[i_298_] = is[i_299_];
					is[i_299_] = i_301_;
					i_301_ = is_297_[i_298_];
					is_297_[i_298_] = is_297_[i_299_];
					is_297_[i_299_] = i_301_;
					i_298_++;
					i_299_++;
				}
			}
		}
		int i = anInt9378;
		anInt9378 = anInt9376;
		anInt9376 = i;
	}

	public int method3608() {
		return anInt9378;
	}

	public int method3622() {
		return anInt9373;
	}

	public void method3616(int i) {
		int i_302_ = -1;
		if (anIntArray9377.length < 255) {
			for (int i_303_ = 0; i_303_ < anIntArray9377.length; i_303_++) {
				if (anIntArray9377[i_303_] == i) {
					i_302_ = i_303_;
					break;
				}
			}
			if (i_302_ == -1) {
				i_302_ = anIntArray9377.length;
				int[] is = new int[anIntArray9377.length + 1];
				System.arraycopy(anIntArray9377, 0, is, 0, anIntArray9377.length);
				anIntArray9377 = is;
				is[i_302_] = i;
			}
		} else {
			int i_304_ = 2147483647;
			int i_305_ = i >> 16 & 0xff;
			int i_306_ = i >> 8 & 0xff;
			int i_307_ = i & 0xff;
			for (int i_308_ = 0; i_308_ < anIntArray9377.length; i_308_++) {
				int i_309_ = anIntArray9377[i_308_];
				int i_310_ = i_309_ >> 16 & 0xff;
				int i_311_ = i_309_ >> 8 & 0xff;
				int i_312_ = i_309_ & 0xff;
				int i_313_ = i_305_ - i_310_;
				if (i_313_ < 0)
					i_313_ = -i_313_;
				int i_314_ = i_306_ - i_311_;
				if (i_314_ < 0)
					i_314_ = -i_314_;
				int i_315_ = i_307_ - i_312_;
				if (i_315_ < 0)
					i_315_ = -i_315_;
				int i_316_ = i_313_ + i_314_ + i_315_;
				if (i_316_ < i_304_) {
					i_304_ = i_316_;
					i_302_ = i_308_;
				}
			}
		}
		int i_317_ = 0;
		byte[] is = new byte[anInt9373 * anInt9372];
		for (int i_318_ = 0; i_318_ < anInt9372; i_318_++) {
			for (int i_319_ = 0; i_319_ < anInt9373; i_319_++) {
				int i_320_ = aByteArray9371[i_317_] & 0xff;
				if (anIntArray9377[i_320_] == 0) {
					if (i_319_ > 0 && (anIntArray9377[aByteArray9371[i_317_ - 1] & 0xff] != 0))
						i_320_ = i_302_;
					else if (i_318_ > 0 && ((anIntArray9377[aByteArray9371[i_317_ - anInt9373] & 0xff]) != 0))
						i_320_ = i_302_;
					else if (i_319_ < anInt9373 - 1 && (anIntArray9377[aByteArray9371[i_317_ + 1] & 0xff]) != 0)
						i_320_ = i_302_;
					else if (i_318_ < anInt9372 - 1 && ((anIntArray9377[aByteArray9371[i_317_ + anInt9373] & 0xff]) != 0))
						i_320_ = i_302_;
				}
				is[i_317_++] = (byte) i_320_;
			}
		}
		aByteArray9371 = is;
	}

	public int method3626(int i, int i_321_) {
		return anIntArray9377[aByteArray9371[i + i_321_ * anInt9373] & 0xff];
	}

	public int method3627(int i, int i_322_) {
		return anIntArray9377[aByteArray9371[i + i_322_ * anInt9373] & 0xff];
	}

	public int method3589(int i, int i_323_) {
		return anIntArray9377[aByteArray9371[i + i_323_ * anInt9373] & 0xff];
	}

	public boolean method3602() {
		return aByteArray9379 != null;
	}

	public int method3628() {
		return anInt9375;
	}

	public int[] method3631(boolean bool) {
		int[] is;
		if (bool) {
			int i = method3576();
			is = new int[i * method3577()];
			if (aByteArray9379 != null) {
				for (int i_324_ = 0; i_324_ < anInt9372; i_324_++) {
					int i_325_ = i_324_ * anInt9373;
					int i_326_ = anInt9375 + (i_324_ + anInt9378) * i;
					for (int i_327_ = 0; i_327_ < anInt9373; i_327_++) {
						is[i_326_++] = (aByteArray9379[i_325_] << 24 | (anIntArray9377[aByteArray9371[i_325_] & 0xff]));
						i_325_++;
					}
				}
			} else {
				for (int i_328_ = 0; i_328_ < anInt9372; i_328_++) {
					int i_329_ = i_328_ * anInt9373;
					int i_330_ = anInt9375 + (i_328_ + anInt9378) * i;
					for (int i_331_ = 0; i_331_ < anInt9373; i_331_++) {
						int i_332_ = anIntArray9377[aByteArray9371[i_329_++] & 0xff];
						if (i_332_ != 0)
							is[i_330_++] = ~0xffffff | i_332_;
						else
							is[i_330_++] = 0;
					}
				}
			}
		} else {
			is = new int[anInt9373 * anInt9372];
			int i = 0;
			int i_333_ = 0;
			if (aByteArray9379 != null) {
				for (int i_334_ = 0; i_334_ < anInt9372; i_334_++) {
					for (int i_335_ = 0; i_335_ < anInt9373; i_335_++) {
						is[i_333_++] = (aByteArray9379[i] << 24 | anIntArray9377[aByteArray9371[i] & 0xff]);
						i++;
					}
				}
			} else {
				for (int i_336_ = 0; i_336_ < anInt9372; i_336_++) {
					for (int i_337_ = 0; i_337_ < anInt9373; i_337_++) {
						int i_338_ = anIntArray9377[aByteArray9371[i++] & 0xff];
						is[i_333_++] = i_338_ != 0 ? ~0xffffff | i_338_ : 0;
					}
				}
			}
		}
		return is;
	}

	public int[] method3632(boolean bool) {
		int[] is;
		if (bool) {
			int i = method3576();
			is = new int[i * method3577()];
			if (aByteArray9379 != null) {
				for (int i_339_ = 0; i_339_ < anInt9372; i_339_++) {
					int i_340_ = i_339_ * anInt9373;
					int i_341_ = anInt9375 + (i_339_ + anInt9378) * i;
					for (int i_342_ = 0; i_342_ < anInt9373; i_342_++) {
						is[i_341_++] = (aByteArray9379[i_340_] << 24 | (anIntArray9377[aByteArray9371[i_340_] & 0xff]));
						i_340_++;
					}
				}
			} else {
				for (int i_343_ = 0; i_343_ < anInt9372; i_343_++) {
					int i_344_ = i_343_ * anInt9373;
					int i_345_ = anInt9375 + (i_343_ + anInt9378) * i;
					for (int i_346_ = 0; i_346_ < anInt9373; i_346_++) {
						int i_347_ = anIntArray9377[aByteArray9371[i_344_++] & 0xff];
						if (i_347_ != 0)
							is[i_345_++] = ~0xffffff | i_347_;
						else
							is[i_345_++] = 0;
					}
				}
			}
		} else {
			is = new int[anInt9373 * anInt9372];
			int i = 0;
			int i_348_ = 0;
			if (aByteArray9379 != null) {
				for (int i_349_ = 0; i_349_ < anInt9372; i_349_++) {
					for (int i_350_ = 0; i_350_ < anInt9373; i_350_++) {
						is[i_348_++] = (aByteArray9379[i] << 24 | anIntArray9377[aByteArray9371[i] & 0xff]);
						i++;
					}
				}
			} else {
				for (int i_351_ = 0; i_351_ < anInt9372; i_351_++) {
					for (int i_352_ = 0; i_352_ < anInt9373; i_352_++) {
						int i_353_ = anIntArray9377[aByteArray9371[i++] & 0xff];
						is[i_348_++] = i_353_ != 0 ? ~0xffffff | i_353_ : 0;
					}
				}
			}
		}
		return is;
	}

	public boolean method3567() {
		return true;
	}

	public void method3623() {
		byte[] is = aByteArray9371;
		if (aByteArray9379 == null) {
			for (int i = (anInt9372 >> 1) - 1; i >= 0; i--) {
				int i_354_ = i * anInt9373;
				int i_355_ = (anInt9372 - i - 1) * anInt9373;
				for (int i_356_ = -anInt9373; i_356_ < 0; i_356_++) {
					byte i_357_ = is[i_354_];
					is[i_354_] = is[i_355_];
					is[i_355_] = i_357_;
					i_354_++;
					i_355_++;
				}
			}
		} else {
			byte[] is_358_ = aByteArray9379;
			for (int i = (anInt9372 >> 1) - 1; i >= 0; i--) {
				int i_359_ = i * anInt9373;
				int i_360_ = (anInt9372 - i - 1) * anInt9373;
				for (int i_361_ = -anInt9373; i_361_ < 0; i_361_++) {
					byte i_362_ = is[i_359_];
					is[i_359_] = is[i_360_];
					is[i_360_] = i_362_;
					i_362_ = is_358_[i_359_];
					is_358_[i_359_] = is_358_[i_360_];
					is_358_[i_360_] = i_362_;
					i_359_++;
					i_360_++;
				}
			}
		}
		int i = anInt9378;
		anInt9378 = anInt9376;
		anInt9376 = i;
	}

	public int method3601() {
		return anInt9374;
	}

	public void method3591(int i, int i_363_, int i_364_) {
		for (int i_365_ = 1; i_365_ < anIntArray9377.length; i_365_++) {
			if (anIntArray9377[i_365_] != 1 && anIntArray9377[i_365_] != 16711935) {
				int i_366_ = anIntArray9377[i_365_] >> 16 & 0xff;
				i_366_ += i;
				if (i_366_ < 0)
					i_366_ = 0;
				else if (i_366_ > 255)
					i_366_ = 255;
				int i_367_ = anIntArray9377[i_365_] >> 8 & 0xff;
				i_367_ += i_363_;
				if (i_367_ < 0)
					i_367_ = 0;
				else if (i_367_ > 255)
					i_367_ = 255;
				int i_368_ = anIntArray9377[i_365_] >> 0 & 0xff;
				i_368_ += i_364_;
				if (i_368_ < 0)
					i_368_ = 0;
				else if (i_368_ > 255)
					i_368_ = 255;
				anIntArray9377[i_365_] = i_366_ << 16 | i_367_ << 8 | i_368_;
			}
		}
	}

	public int method3637() {
		return anInt9373 + anInt9375 + anInt9374;
	}
}
