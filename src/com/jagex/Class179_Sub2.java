/* Class179_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class179_Sub2 extends Class179 {
	public int[] anIntArray9813;
	int anInt9814;
	public int anInt9815;
	int anInt9816;
	int anInt9817;
	int anInt9818;
	public int anInt9819;
	public byte[] aByteArray9820;
	public byte[] aByteArray9821;

	public int method2665() {
		return anInt9814;
	}

	public boolean method2631() {
		return true;
	}

	public boolean method2641() {
		return aByteArray9821 != null;
	}

	public int method2669() {
		return anInt9818;
	}

	public int method2638() {
		return anInt9818;
	}

	public void method2676() {
		byte[] is = new byte[anInt9817 * anInt9814];
		int i = 0;
		if (aByteArray9821 == null) {
			for (int i_0_ = 0; i_0_ < anInt9817; i_0_++) {
				for (int i_1_ = anInt9814 - 1; i_1_ >= 0; i_1_--)
					is[i++] = aByteArray9820[i_0_ + i_1_ * anInt9817];
			}
			aByteArray9820 = is;
		} else {
			byte[] is_2_ = new byte[anInt9817 * anInt9814];
			for (int i_3_ = 0; i_3_ < anInt9817; i_3_++) {
				for (int i_4_ = anInt9814 - 1; i_4_ >= 0; i_4_--) {
					is[i] = aByteArray9820[i_3_ + i_4_ * anInt9817];
					is_2_[i++] = aByteArray9821[i_3_ + i_4_ * anInt9817];
				}
			}
			aByteArray9820 = is;
			aByteArray9821 = is_2_;
		}
		int i_5_ = anInt9819;
		anInt9819 = anInt9815;
		anInt9815 = anInt9818;
		anInt9818 = anInt9816;
		anInt9816 = i_5_;
		i_5_ = anInt9814;
		anInt9814 = anInt9817;
		anInt9817 = i_5_;
	}

	public int method2671() {
		return anInt9814 + anInt9819 + anInt9818;
	}

	public int method2635() {
		return anInt9815;
	}

	public int method2640() {
		return anInt9817 + anInt9815 + anInt9816;
	}

	public int method2664() {
		return anInt9815;
	}

	public int method2652() {
		return anInt9816;
	}

	public void method2672(int i) {
		int i_6_ = -1;
		if (anIntArray9813.length < 255) {
			for (int i_7_ = 0; i_7_ < anIntArray9813.length; i_7_++) {
				if (anIntArray9813[i_7_] == i) {
					i_6_ = i_7_;
					break;
				}
			}
			if (i_6_ == -1) {
				i_6_ = anIntArray9813.length;
				int[] is = new int[anIntArray9813.length + 1];
				System.arraycopy(anIntArray9813, 0, is, 0, anIntArray9813.length);
				anIntArray9813 = is;
				is[i_6_] = i;
			}
		} else {
			int i_8_ = 2147483647;
			int i_9_ = i >> 16 & 0xff;
			int i_10_ = i >> 8 & 0xff;
			int i_11_ = i & 0xff;
			for (int i_12_ = 0; i_12_ < anIntArray9813.length; i_12_++) {
				int i_13_ = anIntArray9813[i_12_];
				int i_14_ = i_13_ >> 16 & 0xff;
				int i_15_ = i_13_ >> 8 & 0xff;
				int i_16_ = i_13_ & 0xff;
				int i_17_ = i_9_ - i_14_;
				if (i_17_ < 0)
					i_17_ = -i_17_;
				int i_18_ = i_10_ - i_15_;
				if (i_18_ < 0)
					i_18_ = -i_18_;
				int i_19_ = i_11_ - i_16_;
				if (i_19_ < 0)
					i_19_ = -i_19_;
				int i_20_ = i_17_ + i_18_ + i_19_;
				if (i_20_ < i_8_) {
					i_8_ = i_20_;
					i_6_ = i_12_;
				}
			}
		}
		for (int i_21_ = anInt9814 - 1; i_21_ > 0; i_21_--) {
			int i_22_ = i_21_ * anInt9817;
			for (int i_23_ = anInt9817 - 1; i_23_ > 0; i_23_--) {
				if (anIntArray9813[aByteArray9820[i_23_ + i_22_] & 0xff] == 0 && (anIntArray9813[aByteArray9820[(i_23_ + i_22_ - 1 - anInt9817)] & 0xff] != 0))
					aByteArray9820[i_23_ + i_22_] = (byte) i_6_;
			}
		}
	}

	public void method2642(int i) {
		int i_24_ = method2640();
		int i_25_ = method2671();
		if (anInt9817 != i_24_ || anInt9814 != i_25_) {
			int i_26_ = i;
			if (i_26_ > anInt9815)
				i_26_ = anInt9815;
			int i_27_ = i;
			if (i_27_ + anInt9815 + anInt9817 > i_24_)
				i_27_ = i_24_ - anInt9815 - anInt9817;
			int i_28_ = i;
			if (i_28_ > anInt9819)
				i_28_ = anInt9819;
			int i_29_ = i;
			if (i_29_ + anInt9819 + anInt9814 > i_25_)
				i_29_ = i_25_ - anInt9819 - anInt9814;
			int i_30_ = anInt9817 + i_26_ + i_27_;
			int i_31_ = anInt9814 + i_28_ + i_29_;
			byte[] is = new byte[i_30_ * i_31_];
			if (aByteArray9821 == null) {
				for (int i_32_ = 0; i_32_ < anInt9814; i_32_++) {
					int i_33_ = i_32_ * anInt9817;
					int i_34_ = (i_32_ + i_28_) * i_30_ + i_26_;
					for (int i_35_ = 0; i_35_ < anInt9817; i_35_++)
						is[i_34_++] = aByteArray9820[i_33_++];
				}
			} else {
				byte[] is_36_ = new byte[i_30_ * i_31_];
				for (int i_37_ = 0; i_37_ < anInt9814; i_37_++) {
					int i_38_ = i_37_ * anInt9817;
					int i_39_ = (i_37_ + i_28_) * i_30_ + i_26_;
					for (int i_40_ = 0; i_40_ < anInt9817; i_40_++) {
						is_36_[i_39_] = aByteArray9821[i_38_];
						is[i_39_++] = aByteArray9820[i_38_++];
					}
				}
				aByteArray9821 = is_36_;
			}
			anInt9815 -= i_26_;
			anInt9819 -= i_28_;
			anInt9816 -= i_27_;
			anInt9818 -= i_29_;
			anInt9817 = i_30_;
			anInt9814 = i_31_;
			aByteArray9820 = is;
		}
	}

	public void method2655(int i) {
		int i_41_ = -1;
		if (anIntArray9813.length < 255) {
			for (int i_42_ = 0; i_42_ < anIntArray9813.length; i_42_++) {
				if (anIntArray9813[i_42_] == i) {
					i_41_ = i_42_;
					break;
				}
			}
			if (i_41_ == -1) {
				i_41_ = anIntArray9813.length;
				int[] is = new int[anIntArray9813.length + 1];
				System.arraycopy(anIntArray9813, 0, is, 0, anIntArray9813.length);
				anIntArray9813 = is;
				is[i_41_] = i;
			}
		} else {
			int i_43_ = 2147483647;
			int i_44_ = i >> 16 & 0xff;
			int i_45_ = i >> 8 & 0xff;
			int i_46_ = i & 0xff;
			for (int i_47_ = 0; i_47_ < anIntArray9813.length; i_47_++) {
				int i_48_ = anIntArray9813[i_47_];
				int i_49_ = i_48_ >> 16 & 0xff;
				int i_50_ = i_48_ >> 8 & 0xff;
				int i_51_ = i_48_ & 0xff;
				int i_52_ = i_44_ - i_49_;
				if (i_52_ < 0)
					i_52_ = -i_52_;
				int i_53_ = i_45_ - i_50_;
				if (i_53_ < 0)
					i_53_ = -i_53_;
				int i_54_ = i_46_ - i_51_;
				if (i_54_ < 0)
					i_54_ = -i_54_;
				int i_55_ = i_52_ + i_53_ + i_54_;
				if (i_55_ < i_43_) {
					i_43_ = i_55_;
					i_41_ = i_47_;
				}
			}
		}
		int i_56_ = 0;
		byte[] is = new byte[anInt9817 * anInt9814];
		for (int i_57_ = 0; i_57_ < anInt9814; i_57_++) {
			for (int i_58_ = 0; i_58_ < anInt9817; i_58_++) {
				int i_59_ = aByteArray9820[i_56_] & 0xff;
				if (anIntArray9813[i_59_] == 0) {
					if (i_58_ > 0 && (anIntArray9813[aByteArray9820[i_56_ - 1] & 0xff] != 0))
						i_59_ = i_41_;
					else if (i_57_ > 0 && ((anIntArray9813[aByteArray9820[i_56_ - anInt9817] & 0xff]) != 0))
						i_59_ = i_41_;
					else if (i_58_ < anInt9817 - 1 && (anIntArray9813[aByteArray9820[i_56_ + 1] & 0xff]) != 0)
						i_59_ = i_41_;
					else if (i_57_ < anInt9814 - 1 && ((anIntArray9813[aByteArray9820[i_56_ + anInt9817] & 0xff]) != 0))
						i_59_ = i_41_;
				}
				is[i_56_++] = (byte) i_59_;
			}
		}
		aByteArray9820 = is;
	}

	public void method2644(int i) {
		int i_60_ = -1;
		if (anIntArray9813.length < 255) {
			for (int i_61_ = 0; i_61_ < anIntArray9813.length; i_61_++) {
				if (anIntArray9813[i_61_] == i) {
					i_60_ = i_61_;
					break;
				}
			}
			if (i_60_ == -1) {
				i_60_ = anIntArray9813.length;
				int[] is = new int[anIntArray9813.length + 1];
				System.arraycopy(anIntArray9813, 0, is, 0, anIntArray9813.length);
				anIntArray9813 = is;
				is[i_60_] = i;
			}
		} else {
			int i_62_ = 2147483647;
			int i_63_ = i >> 16 & 0xff;
			int i_64_ = i >> 8 & 0xff;
			int i_65_ = i & 0xff;
			for (int i_66_ = 0; i_66_ < anIntArray9813.length; i_66_++) {
				int i_67_ = anIntArray9813[i_66_];
				int i_68_ = i_67_ >> 16 & 0xff;
				int i_69_ = i_67_ >> 8 & 0xff;
				int i_70_ = i_67_ & 0xff;
				int i_71_ = i_63_ - i_68_;
				if (i_71_ < 0)
					i_71_ = -i_71_;
				int i_72_ = i_64_ - i_69_;
				if (i_72_ < 0)
					i_72_ = -i_72_;
				int i_73_ = i_65_ - i_70_;
				if (i_73_ < 0)
					i_73_ = -i_73_;
				int i_74_ = i_71_ + i_72_ + i_73_;
				if (i_74_ < i_62_) {
					i_62_ = i_74_;
					i_60_ = i_66_;
				}
			}
		}
		for (int i_75_ = anInt9814 - 1; i_75_ > 0; i_75_--) {
			int i_76_ = i_75_ * anInt9817;
			for (int i_77_ = anInt9817 - 1; i_77_ > 0; i_77_--) {
				if (anIntArray9813[aByteArray9820[i_77_ + i_76_] & 0xff] == 0 && (anIntArray9813[aByteArray9820[(i_77_ + i_76_ - 1 - anInt9817)] & 0xff] != 0))
					aByteArray9820[i_77_ + i_76_] = (byte) i_60_;
			}
		}
	}

	public int method2688() {
		return anInt9816;
	}

	public void method2646() {
		byte[] is = aByteArray9820;
		if (aByteArray9821 == null) {
			for (int i = (anInt9814 >> 1) - 1; i >= 0; i--) {
				int i_78_ = i * anInt9817;
				int i_79_ = (anInt9814 - i - 1) * anInt9817;
				for (int i_80_ = -anInt9817; i_80_ < 0; i_80_++) {
					byte i_81_ = is[i_78_];
					is[i_78_] = is[i_79_];
					is[i_79_] = i_81_;
					i_78_++;
					i_79_++;
				}
			}
		} else {
			byte[] is_82_ = aByteArray9821;
			for (int i = (anInt9814 >> 1) - 1; i >= 0; i--) {
				int i_83_ = i * anInt9817;
				int i_84_ = (anInt9814 - i - 1) * anInt9817;
				for (int i_85_ = -anInt9817; i_85_ < 0; i_85_++) {
					byte i_86_ = is[i_83_];
					is[i_83_] = is[i_84_];
					is[i_84_] = i_86_;
					i_86_ = is_82_[i_83_];
					is_82_[i_83_] = is_82_[i_84_];
					is_82_[i_84_] = i_86_;
					i_83_++;
					i_84_++;
				}
			}
		}
		int i = anInt9819;
		anInt9819 = anInt9818;
		anInt9818 = i;
	}

	public void method2647() {
		byte[] is = new byte[anInt9817 * anInt9814];
		int i = 0;
		if (aByteArray9821 == null) {
			for (int i_87_ = 0; i_87_ < anInt9817; i_87_++) {
				for (int i_88_ = anInt9814 - 1; i_88_ >= 0; i_88_--)
					is[i++] = aByteArray9820[i_87_ + i_88_ * anInt9817];
			}
			aByteArray9820 = is;
		} else {
			byte[] is_89_ = new byte[anInt9817 * anInt9814];
			for (int i_90_ = 0; i_90_ < anInt9817; i_90_++) {
				for (int i_91_ = anInt9814 - 1; i_91_ >= 0; i_91_--) {
					is[i] = aByteArray9820[i_90_ + i_91_ * anInt9817];
					is_89_[i++] = aByteArray9821[i_90_ + i_91_ * anInt9817];
				}
			}
			aByteArray9820 = is;
			aByteArray9821 = is_89_;
		}
		int i_92_ = anInt9819;
		anInt9819 = anInt9815;
		anInt9815 = anInt9818;
		anInt9818 = anInt9816;
		anInt9816 = i_92_;
		i_92_ = anInt9814;
		anInt9814 = anInt9817;
		anInt9817 = i_92_;
	}

	public int[] method2643(boolean bool) {
		int[] is;
		if (bool) {
			int i = method2640();
			is = new int[i * method2671()];
			if (aByteArray9821 != null) {
				for (int i_93_ = 0; i_93_ < anInt9814; i_93_++) {
					int i_94_ = i_93_ * anInt9817;
					int i_95_ = anInt9815 + (i_93_ + anInt9819) * i;
					for (int i_96_ = 0; i_96_ < anInt9817; i_96_++) {
						is[i_95_++] = (aByteArray9821[i_94_] << 24 | anIntArray9813[aByteArray9820[i_94_] & 0xff]);
						i_94_++;
					}
				}
			} else {
				for (int i_97_ = 0; i_97_ < anInt9814; i_97_++) {
					int i_98_ = i_97_ * anInt9817;
					int i_99_ = anInt9815 + (i_97_ + anInt9819) * i;
					for (int i_100_ = 0; i_100_ < anInt9817; i_100_++) {
						int i_101_ = anIntArray9813[aByteArray9820[i_98_++] & 0xff];
						if (i_101_ != 0)
							is[i_99_++] = ~0xffffff | i_101_;
						else
							is[i_99_++] = 0;
					}
				}
			}
		} else {
			is = new int[anInt9817 * anInt9814];
			int i = 0;
			int i_102_ = 0;
			if (aByteArray9821 != null) {
				for (int i_103_ = 0; i_103_ < anInt9814; i_103_++) {
					for (int i_104_ = 0; i_104_ < anInt9817; i_104_++) {
						is[i_102_++] = (aByteArray9821[i] << 24 | anIntArray9813[aByteArray9820[i] & 0xff]);
						i++;
					}
				}
			} else {
				for (int i_105_ = 0; i_105_ < anInt9814; i_105_++) {
					for (int i_106_ = 0; i_106_ < anInt9817; i_106_++) {
						int i_107_ = anIntArray9813[aByteArray9820[i++] & 0xff];
						is[i_102_++] = i_107_ != 0 ? ~0xffffff | i_107_ : 0;
					}
				}
			}
		}
		return is;
	}

	public void method2649(int i, int i_108_, int i_109_) {
		for (int i_110_ = 1; i_110_ < anIntArray9813.length; i_110_++) {
			if (anIntArray9813[i_110_] != 1 && anIntArray9813[i_110_] != 16711935) {
				int i_111_ = anIntArray9813[i_110_] >> 16 & 0xff;
				i_111_ += i;
				if (i_111_ < 0)
					i_111_ = 0;
				else if (i_111_ > 255)
					i_111_ = 255;
				int i_112_ = anIntArray9813[i_110_] >> 8 & 0xff;
				i_112_ += i_108_;
				if (i_112_ < 0)
					i_112_ = 0;
				else if (i_112_ > 255)
					i_112_ = 255;
				int i_113_ = anIntArray9813[i_110_] >> 0 & 0xff;
				i_113_ += i_109_;
				if (i_113_ < 0)
					i_113_ = 0;
				else if (i_113_ > 255)
					i_113_ = 255;
				anIntArray9813[i_110_] = i_111_ << 16 | i_112_ << 8 | i_113_;
			}
		}
	}

	public int method2650(int i, int i_114_) {
		return anIntArray9813[aByteArray9820[i + i_114_ * anInt9817] & 0xff];
	}

	public int method2693() {
		return anInt9815;
	}

	public boolean method2690() {
		return true;
	}

	public boolean method2653() {
		return aByteArray9821 != null;
	}

	public boolean method2654() {
		return aByteArray9821 != null;
	}

	public int method2630() {
		return anInt9817;
	}

	public int method2656() {
		return anInt9814;
	}

	public int method2657() {
		return anInt9814;
	}

	public int method2658() {
		return anInt9814;
	}

	public void method2645(int i) {
		int i_115_ = method2640();
		int i_116_ = method2671();
		if (anInt9817 != i_115_ || anInt9814 != i_116_) {
			int i_117_ = i;
			if (i_117_ > anInt9815)
				i_117_ = anInt9815;
			int i_118_ = i;
			if (i_118_ + anInt9815 + anInt9817 > i_115_)
				i_118_ = i_115_ - anInt9815 - anInt9817;
			int i_119_ = i;
			if (i_119_ > anInt9819)
				i_119_ = anInt9819;
			int i_120_ = i;
			if (i_120_ + anInt9819 + anInt9814 > i_116_)
				i_120_ = i_116_ - anInt9819 - anInt9814;
			int i_121_ = anInt9817 + i_117_ + i_118_;
			int i_122_ = anInt9814 + i_119_ + i_120_;
			byte[] is = new byte[i_121_ * i_122_];
			if (aByteArray9821 == null) {
				for (int i_123_ = 0; i_123_ < anInt9814; i_123_++) {
					int i_124_ = i_123_ * anInt9817;
					int i_125_ = (i_123_ + i_119_) * i_121_ + i_117_;
					for (int i_126_ = 0; i_126_ < anInt9817; i_126_++)
						is[i_125_++] = aByteArray9820[i_124_++];
				}
			} else {
				byte[] is_127_ = new byte[i_121_ * i_122_];
				for (int i_128_ = 0; i_128_ < anInt9814; i_128_++) {
					int i_129_ = i_128_ * anInt9817;
					int i_130_ = (i_128_ + i_119_) * i_121_ + i_117_;
					for (int i_131_ = 0; i_131_ < anInt9817; i_131_++) {
						is_127_[i_130_] = aByteArray9821[i_129_];
						is[i_130_++] = aByteArray9820[i_129_++];
					}
				}
				aByteArray9821 = is_127_;
			}
			anInt9815 -= i_117_;
			anInt9819 -= i_119_;
			anInt9816 -= i_118_;
			anInt9818 -= i_120_;
			anInt9817 = i_121_;
			anInt9814 = i_122_;
			aByteArray9820 = is;
		}
	}

	public int method2632() {
		return anInt9814 + anInt9819 + anInt9818;
	}

	public int method2660() {
		return anInt9817 + anInt9815 + anInt9816;
	}

	public int method2662() {
		return anInt9814 + anInt9819 + anInt9818;
	}

	public int method2663() {
		return anInt9814 + anInt9819 + anInt9818;
	}

	public int method2636() {
		return anInt9816;
	}

	public int method2634() {
		return anInt9814 + anInt9819 + anInt9818;
	}

	public int method2670() {
		return anInt9817 + anInt9815 + anInt9816;
	}

	public void method2661() {
		byte[] is = aByteArray9820;
		if (aByteArray9821 == null) {
			for (int i = (anInt9814 >> 1) - 1; i >= 0; i--) {
				int i_132_ = i * anInt9817;
				int i_133_ = (anInt9814 - i - 1) * anInt9817;
				for (int i_134_ = -anInt9817; i_134_ < 0; i_134_++) {
					byte i_135_ = is[i_132_];
					is[i_132_] = is[i_133_];
					is[i_133_] = i_135_;
					i_132_++;
					i_133_++;
				}
			}
		} else {
			byte[] is_136_ = aByteArray9821;
			for (int i = (anInt9814 >> 1) - 1; i >= 0; i--) {
				int i_137_ = i * anInt9817;
				int i_138_ = (anInt9814 - i - 1) * anInt9817;
				for (int i_139_ = -anInt9817; i_139_ < 0; i_139_++) {
					byte i_140_ = is[i_137_];
					is[i_137_] = is[i_138_];
					is[i_138_] = i_140_;
					i_140_ = is_136_[i_137_];
					is_136_[i_137_] = is_136_[i_138_];
					is_136_[i_138_] = i_140_;
					i_137_++;
					i_138_++;
				}
			}
		}
		int i = anInt9819;
		anInt9819 = anInt9818;
		anInt9818 = i;
	}

	public int method2667() {
		return anInt9815;
	}

	public int method2668() {
		return anInt9819;
	}

	public void method2678() {
		byte[] is = new byte[anInt9817 * anInt9814];
		int i = 0;
		if (aByteArray9821 == null) {
			for (int i_141_ = 0; i_141_ < anInt9817; i_141_++) {
				for (int i_142_ = anInt9814 - 1; i_142_ >= 0; i_142_--)
					is[i++] = aByteArray9820[i_141_ + i_142_ * anInt9817];
			}
			aByteArray9820 = is;
		} else {
			byte[] is_143_ = new byte[anInt9817 * anInt9814];
			for (int i_144_ = 0; i_144_ < anInt9817; i_144_++) {
				for (int i_145_ = anInt9814 - 1; i_145_ >= 0; i_145_--) {
					is[i] = aByteArray9820[i_144_ + i_145_ * anInt9817];
					is_143_[i++] = aByteArray9821[i_144_ + i_145_ * anInt9817];
				}
			}
			aByteArray9820 = is;
			aByteArray9821 = is_143_;
		}
		int i_146_ = anInt9819;
		anInt9819 = anInt9815;
		anInt9815 = anInt9818;
		anInt9818 = anInt9816;
		anInt9816 = i_146_;
		i_146_ = anInt9814;
		anInt9814 = anInt9817;
		anInt9817 = i_146_;
	}

	public int method2639(int i, int i_147_) {
		return anIntArray9813[aByteArray9820[i + i_147_ * anInt9817] & 0xff];
	}

	public void method2685(int i) {
		int i_148_ = -1;
		if (anIntArray9813.length < 255) {
			for (int i_149_ = 0; i_149_ < anIntArray9813.length; i_149_++) {
				if (anIntArray9813[i_149_] == i) {
					i_148_ = i_149_;
					break;
				}
			}
			if (i_148_ == -1) {
				i_148_ = anIntArray9813.length;
				int[] is = new int[anIntArray9813.length + 1];
				System.arraycopy(anIntArray9813, 0, is, 0, anIntArray9813.length);
				anIntArray9813 = is;
				is[i_148_] = i;
			}
		} else {
			int i_150_ = 2147483647;
			int i_151_ = i >> 16 & 0xff;
			int i_152_ = i >> 8 & 0xff;
			int i_153_ = i & 0xff;
			for (int i_154_ = 0; i_154_ < anIntArray9813.length; i_154_++) {
				int i_155_ = anIntArray9813[i_154_];
				int i_156_ = i_155_ >> 16 & 0xff;
				int i_157_ = i_155_ >> 8 & 0xff;
				int i_158_ = i_155_ & 0xff;
				int i_159_ = i_151_ - i_156_;
				if (i_159_ < 0)
					i_159_ = -i_159_;
				int i_160_ = i_152_ - i_157_;
				if (i_160_ < 0)
					i_160_ = -i_160_;
				int i_161_ = i_153_ - i_158_;
				if (i_161_ < 0)
					i_161_ = -i_161_;
				int i_162_ = i_159_ + i_160_ + i_161_;
				if (i_162_ < i_150_) {
					i_150_ = i_162_;
					i_148_ = i_154_;
				}
			}
		}
		int i_163_ = 0;
		byte[] is = new byte[anInt9817 * anInt9814];
		for (int i_164_ = 0; i_164_ < anInt9814; i_164_++) {
			for (int i_165_ = 0; i_165_ < anInt9817; i_165_++) {
				int i_166_ = aByteArray9820[i_163_] & 0xff;
				if (anIntArray9813[i_166_] == 0) {
					if (i_165_ > 0 && (anIntArray9813[aByteArray9820[i_163_ - 1] & 0xff] != 0))
						i_166_ = i_148_;
					else if (i_164_ > 0 && ((anIntArray9813[aByteArray9820[i_163_ - anInt9817] & 0xff]) != 0))
						i_166_ = i_148_;
					else if (i_165_ < anInt9817 - 1 && (anIntArray9813[aByteArray9820[i_163_ + 1] & 0xff]) != 0)
						i_166_ = i_148_;
					else if (i_164_ < anInt9814 - 1 && ((anIntArray9813[aByteArray9820[i_163_ + anInt9817] & 0xff]) != 0))
						i_166_ = i_148_;
				}
				is[i_163_++] = (byte) i_166_;
			}
		}
		aByteArray9820 = is;
	}

	public int method2633() {
		return anInt9817;
	}

	public void method2681() {
		byte[] is = aByteArray9820;
		if (aByteArray9821 == null) {
			for (int i = anInt9814 - 1; i >= 0; i--) {
				int i_167_ = i * anInt9817;
				for (int i_168_ = (i + 1) * anInt9817; i_167_ < i_168_; i_167_++) {
					i_168_--;
					byte i_169_ = is[i_167_];
					is[i_167_] = is[i_168_];
					is[i_168_] = i_169_;
				}
			}
		} else {
			byte[] is_170_ = aByteArray9821;
			for (int i = anInt9814 - 1; i >= 0; i--) {
				int i_171_ = i * anInt9817;
				for (int i_172_ = (i + 1) * anInt9817; i_171_ < i_172_; i_171_++) {
					i_172_--;
					byte i_173_ = is[i_171_];
					is[i_171_] = is[i_172_];
					is[i_172_] = i_173_;
					i_173_ = is_170_[i_171_];
					is_170_[i_171_] = is_170_[i_172_];
					is_170_[i_172_] = i_173_;
				}
			}
		}
		int i = anInt9815;
		anInt9815 = anInt9816;
		anInt9816 = i;
	}

	public void method2673() {
		anInt9818 = 0;
		anInt9819 = 0;
		anInt9816 = 0;
		anInt9815 = 0;
	}

	public void method2675() {
		byte[] is = aByteArray9820;
		if (aByteArray9821 == null) {
			for (int i = (anInt9814 >> 1) - 1; i >= 0; i--) {
				int i_174_ = i * anInt9817;
				int i_175_ = (anInt9814 - i - 1) * anInt9817;
				for (int i_176_ = -anInt9817; i_176_ < 0; i_176_++) {
					byte i_177_ = is[i_174_];
					is[i_174_] = is[i_175_];
					is[i_175_] = i_177_;
					i_174_++;
					i_175_++;
				}
			}
		} else {
			byte[] is_178_ = aByteArray9821;
			for (int i = (anInt9814 >> 1) - 1; i >= 0; i--) {
				int i_179_ = i * anInt9817;
				int i_180_ = (anInt9814 - i - 1) * anInt9817;
				for (int i_181_ = -anInt9817; i_181_ < 0; i_181_++) {
					byte i_182_ = is[i_179_];
					is[i_179_] = is[i_180_];
					is[i_180_] = i_182_;
					i_182_ = is_178_[i_179_];
					is_178_[i_179_] = is_178_[i_180_];
					is_178_[i_180_] = i_182_;
					i_179_++;
					i_180_++;
				}
			}
		}
		int i = anInt9819;
		anInt9819 = anInt9818;
		anInt9818 = i;
	}

	public int method2677() {
		return anInt9814;
	}

	Class179_Sub2() {
		/* empty */
	}

	public void method2648() {
		byte[] is = aByteArray9820;
		if (aByteArray9821 == null) {
			for (int i = anInt9814 - 1; i >= 0; i--) {
				int i_183_ = i * anInt9817;
				for (int i_184_ = (i + 1) * anInt9817; i_183_ < i_184_; i_183_++) {
					i_184_--;
					byte i_185_ = is[i_183_];
					is[i_183_] = is[i_184_];
					is[i_184_] = i_185_;
				}
			}
		} else {
			byte[] is_186_ = aByteArray9821;
			for (int i = anInt9814 - 1; i >= 0; i--) {
				int i_187_ = i * anInt9817;
				for (int i_188_ = (i + 1) * anInt9817; i_187_ < i_188_; i_187_++) {
					i_188_--;
					byte i_189_ = is[i_187_];
					is[i_187_] = is[i_188_];
					is[i_188_] = i_189_;
					i_189_ = is_186_[i_187_];
					is_186_[i_187_] = is_186_[i_188_];
					is_186_[i_188_] = i_189_;
				}
			}
		}
		int i = anInt9815;
		anInt9815 = anInt9816;
		anInt9816 = i;
	}

	public int[] method2679(boolean bool) {
		int[] is;
		if (bool) {
			int i = method2640();
			is = new int[i * method2671()];
			if (aByteArray9821 != null) {
				for (int i_190_ = 0; i_190_ < anInt9814; i_190_++) {
					int i_191_ = i_190_ * anInt9817;
					int i_192_ = anInt9815 + (i_190_ + anInt9819) * i;
					for (int i_193_ = 0; i_193_ < anInt9817; i_193_++) {
						is[i_192_++] = (aByteArray9821[i_191_] << 24 | (anIntArray9813[aByteArray9820[i_191_] & 0xff]));
						i_191_++;
					}
				}
			} else {
				for (int i_194_ = 0; i_194_ < anInt9814; i_194_++) {
					int i_195_ = i_194_ * anInt9817;
					int i_196_ = anInt9815 + (i_194_ + anInt9819) * i;
					for (int i_197_ = 0; i_197_ < anInt9817; i_197_++) {
						int i_198_ = anIntArray9813[aByteArray9820[i_195_++] & 0xff];
						if (i_198_ != 0)
							is[i_196_++] = ~0xffffff | i_198_;
						else
							is[i_196_++] = 0;
					}
				}
			}
		} else {
			is = new int[anInt9817 * anInt9814];
			int i = 0;
			int i_199_ = 0;
			if (aByteArray9821 != null) {
				for (int i_200_ = 0; i_200_ < anInt9814; i_200_++) {
					for (int i_201_ = 0; i_201_ < anInt9817; i_201_++) {
						is[i_199_++] = (aByteArray9821[i] << 24 | anIntArray9813[aByteArray9820[i] & 0xff]);
						i++;
					}
				}
			} else {
				for (int i_202_ = 0; i_202_ < anInt9814; i_202_++) {
					for (int i_203_ = 0; i_203_ < anInt9817; i_203_++) {
						int i_204_ = anIntArray9813[aByteArray9820[i++] & 0xff];
						is[i_199_++] = i_204_ != 0 ? ~0xffffff | i_204_ : 0;
					}
				}
			}
		}
		return is;
	}

	public int[] method2680(boolean bool) {
		int[] is;
		if (bool) {
			int i = method2640();
			is = new int[i * method2671()];
			if (aByteArray9821 != null) {
				for (int i_205_ = 0; i_205_ < anInt9814; i_205_++) {
					int i_206_ = i_205_ * anInt9817;
					int i_207_ = anInt9815 + (i_205_ + anInt9819) * i;
					for (int i_208_ = 0; i_208_ < anInt9817; i_208_++) {
						is[i_207_++] = (aByteArray9821[i_206_] << 24 | (anIntArray9813[aByteArray9820[i_206_] & 0xff]));
						i_206_++;
					}
				}
			} else {
				for (int i_209_ = 0; i_209_ < anInt9814; i_209_++) {
					int i_210_ = i_209_ * anInt9817;
					int i_211_ = anInt9815 + (i_209_ + anInt9819) * i;
					for (int i_212_ = 0; i_212_ < anInt9817; i_212_++) {
						int i_213_ = anIntArray9813[aByteArray9820[i_210_++] & 0xff];
						if (i_213_ != 0)
							is[i_211_++] = ~0xffffff | i_213_;
						else
							is[i_211_++] = 0;
					}
				}
			}
		} else {
			is = new int[anInt9817 * anInt9814];
			int i = 0;
			int i_214_ = 0;
			if (aByteArray9821 != null) {
				for (int i_215_ = 0; i_215_ < anInt9814; i_215_++) {
					for (int i_216_ = 0; i_216_ < anInt9817; i_216_++) {
						is[i_214_++] = (aByteArray9821[i] << 24 | anIntArray9813[aByteArray9820[i] & 0xff]);
						i++;
					}
				}
			} else {
				for (int i_217_ = 0; i_217_ < anInt9814; i_217_++) {
					for (int i_218_ = 0; i_218_ < anInt9817; i_218_++) {
						int i_219_ = anIntArray9813[aByteArray9820[i++] & 0xff];
						is[i_214_++] = i_219_ != 0 ? ~0xffffff | i_219_ : 0;
					}
				}
			}
		}
		return is;
	}

	public boolean method2692() {
		return true;
	}

	public void method2682(int i, int i_220_, int i_221_) {
		for (int i_222_ = 1; i_222_ < anIntArray9813.length; i_222_++) {
			if (anIntArray9813[i_222_] != 1 && anIntArray9813[i_222_] != 16711935) {
				int i_223_ = anIntArray9813[i_222_] >> 16 & 0xff;
				i_223_ += i;
				if (i_223_ < 0)
					i_223_ = 0;
				else if (i_223_ > 255)
					i_223_ = 255;
				int i_224_ = anIntArray9813[i_222_] >> 8 & 0xff;
				i_224_ += i_220_;
				if (i_224_ < 0)
					i_224_ = 0;
				else if (i_224_ > 255)
					i_224_ = 255;
				int i_225_ = anIntArray9813[i_222_] >> 0 & 0xff;
				i_225_ += i_221_;
				if (i_225_ < 0)
					i_225_ = 0;
				else if (i_225_ > 255)
					i_225_ = 255;
				anIntArray9813[i_222_] = i_223_ << 16 | i_224_ << 8 | i_225_;
			}
		}
	}

	public void method2683(int i, int i_226_, int i_227_) {
		for (int i_228_ = 1; i_228_ < anIntArray9813.length; i_228_++) {
			if (anIntArray9813[i_228_] != 1 && anIntArray9813[i_228_] != 16711935) {
				int i_229_ = anIntArray9813[i_228_] >> 16 & 0xff;
				i_229_ += i;
				if (i_229_ < 0)
					i_229_ = 0;
				else if (i_229_ > 255)
					i_229_ = 255;
				int i_230_ = anIntArray9813[i_228_] >> 8 & 0xff;
				i_230_ += i_226_;
				if (i_230_ < 0)
					i_230_ = 0;
				else if (i_230_ > 255)
					i_230_ = 255;
				int i_231_ = anIntArray9813[i_228_] >> 0 & 0xff;
				i_231_ += i_227_;
				if (i_231_ < 0)
					i_231_ = 0;
				else if (i_231_ > 255)
					i_231_ = 255;
				anIntArray9813[i_228_] = i_229_ << 16 | i_230_ << 8 | i_231_;
			}
		}
	}

	public int method2684(int i, int i_232_) {
		return anIntArray9813[aByteArray9820[i + i_232_ * anInt9817] & 0xff];
	}

	public int[] method2659(boolean bool) {
		int[] is;
		if (bool) {
			int i = method2640();
			is = new int[i * method2671()];
			if (aByteArray9821 != null) {
				for (int i_233_ = 0; i_233_ < anInt9814; i_233_++) {
					int i_234_ = i_233_ * anInt9817;
					int i_235_ = anInt9815 + (i_233_ + anInt9819) * i;
					for (int i_236_ = 0; i_236_ < anInt9817; i_236_++) {
						is[i_235_++] = (aByteArray9821[i_234_] << 24 | (anIntArray9813[aByteArray9820[i_234_] & 0xff]));
						i_234_++;
					}
				}
			} else {
				for (int i_237_ = 0; i_237_ < anInt9814; i_237_++) {
					int i_238_ = i_237_ * anInt9817;
					int i_239_ = anInt9815 + (i_237_ + anInt9819) * i;
					for (int i_240_ = 0; i_240_ < anInt9817; i_240_++) {
						int i_241_ = anIntArray9813[aByteArray9820[i_238_++] & 0xff];
						if (i_241_ != 0)
							is[i_239_++] = ~0xffffff | i_241_;
						else
							is[i_239_++] = 0;
					}
				}
			}
		} else {
			is = new int[anInt9817 * anInt9814];
			int i = 0;
			int i_242_ = 0;
			if (aByteArray9821 != null) {
				for (int i_243_ = 0; i_243_ < anInt9814; i_243_++) {
					for (int i_244_ = 0; i_244_ < anInt9817; i_244_++) {
						is[i_242_++] = (aByteArray9821[i] << 24 | anIntArray9813[aByteArray9820[i] & 0xff]);
						i++;
					}
				}
			} else {
				for (int i_245_ = 0; i_245_ < anInt9814; i_245_++) {
					for (int i_246_ = 0; i_246_ < anInt9817; i_246_++) {
						int i_247_ = anIntArray9813[aByteArray9820[i++] & 0xff];
						is[i_242_++] = i_247_ != 0 ? ~0xffffff | i_247_ : 0;
					}
				}
			}
		}
		return is;
	}

	public int method2686(int i, int i_248_) {
		return anIntArray9813[aByteArray9820[i + i_248_ * anInt9817] & 0xff];
	}

	public int method2687() {
		return anInt9816;
	}

	public void method2674() {
		byte[] is = aByteArray9820;
		if (aByteArray9821 == null) {
			for (int i = anInt9814 - 1; i >= 0; i--) {
				int i_249_ = i * anInt9817;
				for (int i_250_ = (i + 1) * anInt9817; i_249_ < i_250_; i_249_++) {
					i_250_--;
					byte i_251_ = is[i_249_];
					is[i_249_] = is[i_250_];
					is[i_250_] = i_251_;
				}
			}
		} else {
			byte[] is_252_ = aByteArray9821;
			for (int i = anInt9814 - 1; i >= 0; i--) {
				int i_253_ = i * anInt9817;
				for (int i_254_ = (i + 1) * anInt9817; i_253_ < i_254_; i_253_++) {
					i_254_--;
					byte i_255_ = is[i_253_];
					is[i_253_] = is[i_254_];
					is[i_254_] = i_255_;
					i_255_ = is_252_[i_253_];
					is_252_[i_253_] = is_252_[i_254_];
					is_252_[i_254_] = i_255_;
				}
			}
		}
		int i = anInt9815;
		anInt9815 = anInt9816;
		anInt9816 = i;
	}

	public int method2637() {
		return anInt9819;
	}

	public int method2689() {
		return anInt9816;
	}

	public int method2691() {
		return anInt9816;
	}

	public void method2666() {
		anInt9818 = 0;
		anInt9819 = 0;
		anInt9816 = 0;
		anInt9815 = 0;
	}

	public void method2651() {
		anInt9818 = 0;
		anInt9819 = 0;
		anInt9816 = 0;
		anInt9815 = 0;
	}
}
