/* Class176_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class176_Sub2 extends Class176 {
	int[] anIntArray9161;
	short[] aShortArray9162;
	Class101 aClass101_9163;
	Class101 aClass101_9164;
	Class119 aClass119_9165;
	static int anInt9166 = 4096;
	float[] aFloatArray9167;
	boolean aBool9168;
	static final int anInt9169 = -2;
	static final int anInt9170 = 4;
	Class180_Sub1 aClass180_Sub1_9171;
	static final int anInt9172 = 618520;
	short aShort9173;
	int anInt9174;
	int anInt9175;
	int[] anIntArray9176;
	int anInt9177;
	int[][] anIntArrayArray9178;
	int anInt9179;
	int[] anIntArray9180;
	short[] aShortArray9181;
	static final int anInt9182 = -1;
	Class176_Sub2[] aClass176_Sub2Array9183;
	int[] anIntArray9184;
	int anInt9185;
	int anInt9186;
	short[] aShortArray9187;
	short[] aShortArray9188;
	short[] aShortArray9189;
	float[][] aFloatArrayArray9190;
	int[] anIntArray9191;
	int[] anIntArray9192;
	short[] aShortArray9193;
	int[] anIntArray9194;
	static final int anInt9195 = 0;
	short aShort9196;
	static final int anInt9197 = 2;
	float[] aFloatArray9198;
	Class113[] aClass113Array9199;
	byte[] aByteArray9200;
	byte[] aByteArray9201;
	byte[] aByteArray9202;
	Class114[] aClass114Array9203;
	boolean aBool9204 = false;
	short[] aShortArray9205;
	static int anInt9206 = 4096;
	static final int anInt9207 = 618648;
	int[][] anIntArrayArray9208;
	boolean aBool9209;
	boolean aBool9210;
	Class108[] aClass108Array9211;
	int anInt9212;
	static final int anInt9213 = 7;
	boolean aBool9214;
	Class167[] aClass167Array9215;
	Class159[] aClass159Array9216;
	int anInt9217;
	Class116[] aClass116Array9218;
	static final int anInt9219 = 1;
	int[][] anIntArrayArray9220;
	boolean aBool9221;
	short aShort9222;
	short aShort9223;
	int anInt9224;
	Class176_Sub2[] aClass176_Sub2Array9225;
	short aShort9226;
	short[] aShortArray9227;
	short aShort9228;
	short aShort9229;
	int[] anIntArray9230;
	int anInt9231;
	boolean aBool9232;
	boolean aBool9233;
	static int anInt9234 = 0;
	float[][] aFloatArrayArray9235;
	Class114[] aClass114Array9236;
	short aShort9237;
	float[] aFloatArray9238;
	float[] aFloatArray9239;
	int[] anIntArray9240;
	int[] anIntArray9241;
	short aShort9242;
	int[] anIntArray9243;
	int[] anIntArray9244;
	int[] anIntArray9245;
	int anInt9246;
	int anInt9247;

	void method2885(int i, int[] is, int i_0_, int i_1_, int i_2_, boolean bool, int i_3_, int[] is_4_) {
		int i_5_ = is.length;
		if (i == 0) {
			i_0_ <<= 4;
			i_1_ <<= 4;
			i_2_ <<= 4;
			if (!aBool9210) {
				for (int i_6_ = 0; i_6_ < anInt9177; i_6_++) {
					anIntArray9191[i_6_] <<= 4;
					anIntArray9184[i_6_] <<= 4;
					anIntArray9161[i_6_] <<= 4;
				}
				aBool9210 = true;
			}
			int i_7_ = 0;
			anInt9247 = 0;
			anInt9212 = 0;
			anInt9224 = 0;
			for (int i_8_ = 0; i_8_ < i_5_; i_8_++) {
				int i_9_ = is[i_8_];
				if (i_9_ < anIntArrayArray9178.length) {
					int[] is_10_ = anIntArrayArray9178[i_9_];
					for (int i_11_ = 0; i_11_ < is_10_.length; i_11_++) {
						int i_12_ = is_10_[i_11_];
						if (aShortArray9227 == null || (i_3_ & aShortArray9227[i_12_]) != 0) {
							anInt9247 += anIntArray9191[i_12_];
							anInt9212 += anIntArray9184[i_12_];
							anInt9224 += anIntArray9161[i_12_];
							i_7_++;
						}
					}
				}
			}
			if (i_7_ > 0) {
				anInt9247 = anInt9247 / i_7_ + i_0_;
				anInt9212 = anInt9212 / i_7_ + i_1_;
				anInt9224 = anInt9224 / i_7_ + i_2_;
				aBool9214 = true;
			} else {
				anInt9247 = i_0_;
				anInt9212 = i_1_;
				anInt9224 = i_2_;
			}
		} else if (i == 1) {
			if (is_4_ != null) {
				int i_13_ = ((is_4_[0] * i_0_ + is_4_[1] * i_1_ + is_4_[2] * i_2_ + 8192) >> 14);
				int i_14_ = ((is_4_[3] * i_0_ + is_4_[4] * i_1_ + is_4_[5] * i_2_ + 8192) >> 14);
				int i_15_ = ((is_4_[6] * i_0_ + is_4_[7] * i_1_ + is_4_[8] * i_2_ + 8192) >> 14);
				i_0_ = i_13_;
				i_1_ = i_14_;
				i_2_ = i_15_;
			}
			i_0_ <<= 4;
			i_1_ <<= 4;
			i_2_ <<= 4;
			if (!aBool9210) {
				for (int i_16_ = 0; i_16_ < anInt9177; i_16_++) {
					anIntArray9191[i_16_] <<= 4;
					anIntArray9184[i_16_] <<= 4;
					anIntArray9161[i_16_] <<= 4;
				}
				aBool9210 = true;
			}
			for (int i_17_ = 0; i_17_ < i_5_; i_17_++) {
				int i_18_ = is[i_17_];
				if (i_18_ < anIntArrayArray9178.length) {
					int[] is_19_ = anIntArrayArray9178[i_18_];
					for (int i_20_ = 0; i_20_ < is_19_.length; i_20_++) {
						int i_21_ = is_19_[i_20_];
						if (aShortArray9227 == null || (i_3_ & aShortArray9227[i_21_]) != 0) {
							anIntArray9191[i_21_] += i_0_;
							anIntArray9184[i_21_] += i_1_;
							anIntArray9161[i_21_] += i_2_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_4_ != null) {
				if (!aBool9210) {
					for (int i_22_ = 0; i_22_ < anInt9177; i_22_++) {
						anIntArray9191[i_22_] <<= 4;
						anIntArray9184[i_22_] <<= 4;
						anIntArray9161[i_22_] <<= 4;
					}
					aBool9210 = true;
				}
				int i_23_ = is_4_[9] << 4;
				int i_24_ = is_4_[10] << 4;
				int i_25_ = is_4_[11] << 4;
				int i_26_ = is_4_[12] << 4;
				int i_27_ = is_4_[13] << 4;
				int i_28_ = is_4_[14] << 4;
				if (aBool9214) {
					int i_29_ = ((is_4_[0] * anInt9247 + is_4_[3] * anInt9212 + is_4_[6] * anInt9224 + 8192) >> 14);
					int i_30_ = ((is_4_[1] * anInt9247 + is_4_[4] * anInt9212 + is_4_[7] * anInt9224 + 8192) >> 14);
					int i_31_ = ((is_4_[2] * anInt9247 + is_4_[5] * anInt9212 + is_4_[8] * anInt9224 + 8192) >> 14);
					i_29_ += i_26_;
					i_30_ += i_27_;
					i_31_ += i_28_;
					anInt9247 = i_29_;
					anInt9212 = i_30_;
					anInt9224 = i_31_;
					aBool9214 = false;
				}
				int[] is_32_ = new int[9];
				int i_33_ = Class428.anIntArray4819[i_0_];
				int i_34_ = Class428.anIntArray4825[i_0_];
				int i_35_ = Class428.anIntArray4819[i_1_];
				int i_36_ = Class428.anIntArray4825[i_1_];
				int i_37_ = Class428.anIntArray4819[i_2_];
				int i_38_ = Class428.anIntArray4825[i_2_];
				int i_39_ = i_34_ * i_37_ + 8192 >> 14;
				int i_40_ = i_34_ * i_38_ + 8192 >> 14;
				is_32_[0] = i_35_ * i_37_ + i_36_ * i_40_ + 8192 >> 14;
				is_32_[1] = -i_35_ * i_38_ + i_36_ * i_39_ + 8192 >> 14;
				is_32_[2] = i_36_ * i_33_ + 8192 >> 14;
				is_32_[3] = i_33_ * i_38_ + 8192 >> 14;
				is_32_[4] = i_33_ * i_37_ + 8192 >> 14;
				is_32_[5] = -i_34_;
				is_32_[6] = -i_36_ * i_37_ + i_35_ * i_40_ + 8192 >> 14;
				is_32_[7] = i_36_ * i_38_ + i_35_ * i_39_ + 8192 >> 14;
				is_32_[8] = i_35_ * i_33_ + 8192 >> 14;
				int i_41_ = ((is_32_[0] * -anInt9247 + is_32_[1] * -anInt9212 + is_32_[2] * -anInt9224 + 8192) >> 14);
				int i_42_ = ((is_32_[3] * -anInt9247 + is_32_[4] * -anInt9212 + is_32_[5] * -anInt9224 + 8192) >> 14);
				int i_43_ = ((is_32_[6] * -anInt9247 + is_32_[7] * -anInt9212 + is_32_[8] * -anInt9224 + 8192) >> 14);
				int i_44_ = i_41_ + anInt9247;
				int i_45_ = i_42_ + anInt9212;
				int i_46_ = i_43_ + anInt9224;
				int[] is_47_ = new int[9];
				for (int i_48_ = 0; i_48_ < 3; i_48_++) {
					for (int i_49_ = 0; i_49_ < 3; i_49_++) {
						int i_50_ = 0;
						for (int i_51_ = 0; i_51_ < 3; i_51_++)
							i_50_ += (is_32_[i_48_ * 3 + i_51_] * is_4_[i_49_ * 3 + i_51_]);
						is_47_[i_48_ * 3 + i_49_] = i_50_ + 8192 >> 14;
					}
				}
				int i_52_ = ((is_32_[0] * i_26_ + is_32_[1] * i_27_ + is_32_[2] * i_28_ + 8192) >> 14);
				int i_53_ = ((is_32_[3] * i_26_ + is_32_[4] * i_27_ + is_32_[5] * i_28_ + 8192) >> 14);
				int i_54_ = ((is_32_[6] * i_26_ + is_32_[7] * i_27_ + is_32_[8] * i_28_ + 8192) >> 14);
				i_52_ += i_44_;
				i_53_ += i_45_;
				i_54_ += i_46_;
				int[] is_55_ = new int[9];
				for (int i_56_ = 0; i_56_ < 3; i_56_++) {
					for (int i_57_ = 0; i_57_ < 3; i_57_++) {
						int i_58_ = 0;
						for (int i_59_ = 0; i_59_ < 3; i_59_++)
							i_58_ += (is_4_[i_56_ * 3 + i_59_] * is_47_[i_57_ + i_59_ * 3]);
						is_55_[i_56_ * 3 + i_57_] = i_58_ + 8192 >> 14;
					}
				}
				int i_60_ = ((is_4_[0] * i_52_ + is_4_[1] * i_53_ + is_4_[2] * i_54_ + 8192) >> 14);
				int i_61_ = ((is_4_[3] * i_52_ + is_4_[4] * i_53_ + is_4_[5] * i_54_ + 8192) >> 14);
				int i_62_ = ((is_4_[6] * i_52_ + is_4_[7] * i_53_ + is_4_[8] * i_54_ + 8192) >> 14);
				i_60_ += i_23_;
				i_61_ += i_24_;
				i_62_ += i_25_;
				for (int i_63_ = 0; i_63_ < i_5_; i_63_++) {
					int i_64_ = is[i_63_];
					if (i_64_ < anIntArrayArray9178.length) {
						int[] is_65_ = anIntArrayArray9178[i_64_];
						for (int i_66_ = 0; i_66_ < is_65_.length; i_66_++) {
							int i_67_ = is_65_[i_66_];
							if (aShortArray9227 == null || (i_3_ & aShortArray9227[i_67_]) != 0) {
								int i_68_ = ((is_55_[0] * anIntArray9191[i_67_] + is_55_[1] * anIntArray9184[i_67_] + is_55_[2] * anIntArray9161[i_67_] + 8192) >> 14);
								int i_69_ = ((is_55_[3] * anIntArray9191[i_67_] + is_55_[4] * anIntArray9184[i_67_] + is_55_[5] * anIntArray9161[i_67_] + 8192) >> 14);
								int i_70_ = ((is_55_[6] * anIntArray9191[i_67_] + is_55_[7] * anIntArray9184[i_67_] + is_55_[8] * anIntArray9161[i_67_] + 8192) >> 14);
								i_68_ += i_60_;
								i_69_ += i_61_;
								i_70_ += i_62_;
								anIntArray9191[i_67_] = i_68_;
								anIntArray9184[i_67_] = i_69_;
								anIntArray9161[i_67_] = i_70_;
							}
						}
					}
				}
			} else {
				for (int i_71_ = 0; i_71_ < i_5_; i_71_++) {
					int i_72_ = is[i_71_];
					if (i_72_ < anIntArrayArray9178.length) {
						int[] is_73_ = anIntArrayArray9178[i_72_];
						for (int i_74_ = 0; i_74_ < is_73_.length; i_74_++) {
							int i_75_ = is_73_[i_74_];
							if (aShortArray9227 == null || (i_3_ & aShortArray9227[i_75_]) != 0) {
								anIntArray9191[i_75_] -= anInt9247;
								anIntArray9184[i_75_] -= anInt9212;
								anIntArray9161[i_75_] -= anInt9224;
								if (i_2_ != 0) {
									int i_76_ = Class428.anIntArray4825[i_2_];
									int i_77_ = Class428.anIntArray4819[i_2_];
									int i_78_ = ((anIntArray9184[i_75_] * i_76_ + anIntArray9191[i_75_] * i_77_ + 16383) >> 14);
									anIntArray9184[i_75_] = (anIntArray9184[i_75_] * i_77_ - anIntArray9191[i_75_] * i_76_ + 16383) >> 14;
									anIntArray9191[i_75_] = i_78_;
								}
								if (i_0_ != 0) {
									int i_79_ = Class428.anIntArray4825[i_0_];
									int i_80_ = Class428.anIntArray4819[i_0_];
									int i_81_ = ((anIntArray9184[i_75_] * i_80_ - anIntArray9161[i_75_] * i_79_ + 16383) >> 14);
									anIntArray9161[i_75_] = (anIntArray9184[i_75_] * i_79_ + anIntArray9161[i_75_] * i_80_ + 16383) >> 14;
									anIntArray9184[i_75_] = i_81_;
								}
								if (i_1_ != 0) {
									int i_82_ = Class428.anIntArray4825[i_1_];
									int i_83_ = Class428.anIntArray4819[i_1_];
									int i_84_ = ((anIntArray9161[i_75_] * i_82_ + anIntArray9191[i_75_] * i_83_ + 16383) >> 14);
									anIntArray9161[i_75_] = (anIntArray9161[i_75_] * i_83_ - anIntArray9191[i_75_] * i_82_ + 16383) >> 14;
									anIntArray9191[i_75_] = i_84_;
								}
								anIntArray9191[i_75_] += anInt9247;
								anIntArray9184[i_75_] += anInt9212;
								anIntArray9161[i_75_] += anInt9224;
							}
						}
					}
				}
			}
		} else if (i == 3) {
			if (is_4_ != null) {
				if (!aBool9210) {
					for (int i_85_ = 0; i_85_ < anInt9177; i_85_++) {
						anIntArray9191[i_85_] <<= 4;
						anIntArray9184[i_85_] <<= 4;
						anIntArray9161[i_85_] <<= 4;
					}
					aBool9210 = true;
				}
				int i_86_ = is_4_[9] << 4;
				int i_87_ = is_4_[10] << 4;
				int i_88_ = is_4_[11] << 4;
				int i_89_ = is_4_[12] << 4;
				int i_90_ = is_4_[13] << 4;
				int i_91_ = is_4_[14] << 4;
				if (aBool9214) {
					int i_92_ = ((is_4_[0] * anInt9247 + is_4_[3] * anInt9212 + is_4_[6] * anInt9224 + 8192) >> 14);
					int i_93_ = ((is_4_[1] * anInt9247 + is_4_[4] * anInt9212 + is_4_[7] * anInt9224 + 8192) >> 14);
					int i_94_ = ((is_4_[2] * anInt9247 + is_4_[5] * anInt9212 + is_4_[8] * anInt9224 + 8192) >> 14);
					i_92_ += i_89_;
					i_93_ += i_90_;
					i_94_ += i_91_;
					anInt9247 = i_92_;
					anInt9212 = i_93_;
					anInt9224 = i_94_;
					aBool9214 = false;
				}
				int i_95_ = i_0_ << 15 >> 7;
				int i_96_ = i_1_ << 15 >> 7;
				int i_97_ = i_2_ << 15 >> 7;
				int i_98_ = i_95_ * -anInt9247 + 8192 >> 14;
				int i_99_ = i_96_ * -anInt9212 + 8192 >> 14;
				int i_100_ = i_97_ * -anInt9224 + 8192 >> 14;
				int i_101_ = i_98_ + anInt9247;
				int i_102_ = i_99_ + anInt9212;
				int i_103_ = i_100_ + anInt9224;
				int[] is_104_ = new int[9];
				is_104_[0] = i_95_ * is_4_[0] + 8192 >> 14;
				is_104_[1] = i_95_ * is_4_[3] + 8192 >> 14;
				is_104_[2] = i_95_ * is_4_[6] + 8192 >> 14;
				is_104_[3] = i_96_ * is_4_[1] + 8192 >> 14;
				is_104_[4] = i_96_ * is_4_[4] + 8192 >> 14;
				is_104_[5] = i_96_ * is_4_[7] + 8192 >> 14;
				is_104_[6] = i_97_ * is_4_[2] + 8192 >> 14;
				is_104_[7] = i_97_ * is_4_[5] + 8192 >> 14;
				is_104_[8] = i_97_ * is_4_[8] + 8192 >> 14;
				int i_105_ = i_95_ * i_89_ + 8192 >> 14;
				int i_106_ = i_96_ * i_90_ + 8192 >> 14;
				int i_107_ = i_97_ * i_91_ + 8192 >> 14;
				i_105_ += i_101_;
				i_106_ += i_102_;
				i_107_ += i_103_;
				int[] is_108_ = new int[9];
				for (int i_109_ = 0; i_109_ < 3; i_109_++) {
					for (int i_110_ = 0; i_110_ < 3; i_110_++) {
						int i_111_ = 0;
						for (int i_112_ = 0; i_112_ < 3; i_112_++)
							i_111_ += (is_4_[i_109_ * 3 + i_112_] * is_104_[i_110_ + i_112_ * 3]);
						is_108_[i_109_ * 3 + i_110_] = i_111_ + 8192 >> 14;
					}
				}
				int i_113_ = ((is_4_[0] * i_105_ + is_4_[1] * i_106_ + is_4_[2] * i_107_ + 8192) >> 14);
				int i_114_ = ((is_4_[3] * i_105_ + is_4_[4] * i_106_ + is_4_[5] * i_107_ + 8192) >> 14);
				int i_115_ = ((is_4_[6] * i_105_ + is_4_[7] * i_106_ + is_4_[8] * i_107_ + 8192) >> 14);
				i_113_ += i_86_;
				i_114_ += i_87_;
				i_115_ += i_88_;
				for (int i_116_ = 0; i_116_ < i_5_; i_116_++) {
					int i_117_ = is[i_116_];
					if (i_117_ < anIntArrayArray9178.length) {
						int[] is_118_ = anIntArrayArray9178[i_117_];
						for (int i_119_ = 0; i_119_ < is_118_.length; i_119_++) {
							int i_120_ = is_118_[i_119_];
							if (aShortArray9227 == null || (i_3_ & aShortArray9227[i_120_]) != 0) {
								int i_121_ = ((is_108_[0] * anIntArray9191[i_120_] + is_108_[1] * anIntArray9184[i_120_] + is_108_[2] * anIntArray9161[i_120_] + 8192) >> 14);
								int i_122_ = ((is_108_[3] * anIntArray9191[i_120_] + is_108_[4] * anIntArray9184[i_120_] + is_108_[5] * anIntArray9161[i_120_] + 8192) >> 14);
								int i_123_ = ((is_108_[6] * anIntArray9191[i_120_] + is_108_[7] * anIntArray9184[i_120_] + is_108_[8] * anIntArray9161[i_120_] + 8192) >> 14);
								i_121_ += i_113_;
								i_122_ += i_114_;
								i_123_ += i_115_;
								anIntArray9191[i_120_] = i_121_;
								anIntArray9184[i_120_] = i_122_;
								anIntArray9161[i_120_] = i_123_;
							}
						}
					}
				}
			} else {
				for (int i_124_ = 0; i_124_ < i_5_; i_124_++) {
					int i_125_ = is[i_124_];
					if (i_125_ < anIntArrayArray9178.length) {
						int[] is_126_ = anIntArrayArray9178[i_125_];
						for (int i_127_ = 0; i_127_ < is_126_.length; i_127_++) {
							int i_128_ = is_126_[i_127_];
							if (aShortArray9227 == null || (i_3_ & aShortArray9227[i_128_]) != 0) {
								anIntArray9191[i_128_] -= anInt9247;
								anIntArray9184[i_128_] -= anInt9212;
								anIntArray9161[i_128_] -= anInt9224;
								anIntArray9191[i_128_] = anIntArray9191[i_128_] * i_0_ / 128;
								anIntArray9184[i_128_] = anIntArray9184[i_128_] * i_1_ / 128;
								anIntArray9161[i_128_] = anIntArray9161[i_128_] * i_2_ / 128;
								anIntArray9191[i_128_] += anInt9247;
								anIntArray9184[i_128_] += anInt9212;
								anIntArray9161[i_128_] += anInt9224;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9208 != null && aByteArray9202 != null) {
				for (int i_129_ = 0; i_129_ < i_5_; i_129_++) {
					int i_130_ = is[i_129_];
					if (i_130_ < anIntArrayArray9208.length) {
						int[] is_131_ = anIntArrayArray9208[i_130_];
						for (int i_132_ = 0; i_132_ < is_131_.length; i_132_++) {
							int i_133_ = is_131_[i_132_];
							if (aShortArray9205 == null || (i_3_ & aShortArray9205[i_133_]) != 0) {
								int i_134_ = ((aByteArray9202[i_133_] & 0xff) + i_0_ * 8);
								if (i_134_ < 0)
									i_134_ = 0;
								else if (i_134_ > 255)
									i_134_ = 255;
								aByteArray9202[i_133_] = (byte) i_134_;
							}
						}
					}
				}
				if (aClass116Array9218 != null) {
					for (int i_135_ = 0; i_135_ < anInt9217; i_135_++) {
						Class116 class116 = aClass116Array9218[i_135_];
						Class108 class108 = aClass108Array9211[i_135_];
						class108.anInt1351 = (class108.anInt1351 * 328110239 & 0xffffff | 255 - ((aByteArray9202[class116.anInt1421 * 1723945109]) & 0xff) << 24) * 120490847;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9208 != null) {
				for (int i_136_ = 0; i_136_ < i_5_; i_136_++) {
					int i_137_ = is[i_136_];
					if (i_137_ < anIntArrayArray9208.length) {
						int[] is_138_ = anIntArrayArray9208[i_137_];
						for (int i_139_ = 0; i_139_ < is_138_.length; i_139_++) {
							int i_140_ = is_138_[i_139_];
							if (aShortArray9205 == null || (i_3_ & aShortArray9205[i_140_]) != 0) {
								int i_141_ = aShortArray9193[i_140_] & 0xffff;
								int i_142_ = i_141_ >> 10 & 0x3f;
								int i_143_ = i_141_ >> 7 & 0x7;
								int i_144_ = i_141_ & 0x7f;
								i_142_ = i_142_ + i_0_ & 0x3f;
								i_143_ += i_1_;
								if (i_143_ < 0)
									i_143_ = 0;
								else if (i_143_ > 7)
									i_143_ = 7;
								i_144_ += i_2_;
								if (i_144_ < 0)
									i_144_ = 0;
								else if (i_144_ > 127)
									i_144_ = 127;
								aShortArray9193[i_140_] = (short) (i_142_ << 10 | i_143_ << 7 | i_144_);
							}
						}
						aBool9209 = true;
					}
				}
				if (aClass116Array9218 != null) {
					for (int i_145_ = 0; i_145_ < anInt9217; i_145_++) {
						Class116 class116 = aClass116Array9218[i_145_];
						Class108 class108 = aClass108Array9211[i_145_];
						class108.anInt1351 = (class108.anInt1351 * 328110239 & ~0xffffff | ((Class656.anIntArray8393[Class453.method7333(((aShortArray9193[(class116.anInt1421 * 1723945109)]) & 0xffff), (byte) 10) & 0xffff]) & 0xffffff)) * 120490847;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9220 != null) {
				for (int i_146_ = 0; i_146_ < i_5_; i_146_++) {
					int i_147_ = is[i_146_];
					if (i_147_ < anIntArrayArray9220.length) {
						int[] is_148_ = anIntArrayArray9220[i_147_];
						for (int i_149_ = 0; i_149_ < is_148_.length; i_149_++) {
							Class108 class108 = aClass108Array9211[is_148_[i_149_]];
							class108.anInt1346 += i_0_ * -653278629;
							class108.anInt1350 += i_1_ * -1290559937;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9220 != null) {
				for (int i_150_ = 0; i_150_ < i_5_; i_150_++) {
					int i_151_ = is[i_150_];
					if (i_151_ < anIntArrayArray9220.length) {
						int[] is_152_ = anIntArrayArray9220[i_151_];
						for (int i_153_ = 0; i_153_ < is_152_.length; i_153_++) {
							Class108 class108 = aClass108Array9211[is_152_[i_153_]];
							class108.aFloat1347 = class108.aFloat1347 * (float) i_0_ / 128.0F;
							class108.aFloat1353 = class108.aFloat1353 * (float) i_1_ / 128.0F;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9220 != null) {
				for (int i_154_ = 0; i_154_ < i_5_; i_154_++) {
					int i_155_ = is[i_154_];
					if (i_155_ < anIntArrayArray9220.length) {
						int[] is_156_ = anIntArrayArray9220[i_155_];
						for (int i_157_ = 0; i_157_ < is_156_.length; i_157_++) {
							Class108 class108 = aClass108Array9211[is_156_[i_157_]];
							class108.anInt1349 = (class108.anInt1349 * 1169382623 + i_0_ & 0x3fff) * -1991287009;
						}
					}
				}
			}
		}
	}

	void method14630() {
		synchronized (this) {
			for (int i = 0; i < anInt9177; i++) {
				int i_158_ = anIntArray9161[i];
				anIntArray9161[i] = anIntArray9191[i];
				anIntArray9191[i] = -i_158_;
			}
			method14645();
		}
	}

	void method14631(Class101 class101) {
		aClass119_9165 = class101.aClass119_1197;
		if (class101 != aClass101_9163) {
			aClass101_9163 = class101;
			anIntArray9230 = aClass101_9163.anIntArray1232;
			aFloatArray9167 = aClass101_9163.aFloatArray1207;
			aFloatArray9198 = aClass101_9163.aFloatArray1208;
			aFloatArray9238 = aClass101_9163.aFloatArray1213;
			aFloatArray9239 = aClass101_9163.aFloatArray1210;
			anIntArray9240 = aClass101_9163.anIntArray1211;
			anIntArray9241 = aClass101_9163.anIntArray1217;
			anIntArray9176 = aClass101_9163.anIntArray1200;
			anIntArray9243 = aClass101_9163.anIntArray1214;
			anIntArray9244 = aClass101_9163.anIntArray1215;
			anIntArray9245 = aClass101_9163.anIntArray1216;
		}
	}

	public void method2926(int i) {
		if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
			synchronized (this) {
				if ((anInt9174 & 0x10000) == 65536 && (i & 0x10000) == 0)
					method14634(true);
				anInt9174 = i;
			}
		} else {
			if ((anInt9174 & 0x10000) == 65536 && (i & 0x10000) == 0)
				method14634(true);
			anInt9174 = i;
		}
	}

	void method14632() {
		if (anInt9246 == 0 && aClass114Array9236 == null) {
			if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
				synchronized (this) {
					method14633();
				}
			} else
				method14633();
		}
	}

	void method14633() {
		aClass114Array9236 = new Class114[anInt9231];
		for (int i = 0; i < anInt9231; i++)
			aClass114Array9236[i] = new Class114();
		for (int i = 0; i < anInt9185; i++) {
			short i_159_ = aShortArray9187[i];
			short i_160_ = aShortArray9188[i];
			short i_161_ = aShortArray9189[i];
			int i_162_ = anIntArray9191[i_160_] - anIntArray9191[i_159_];
			int i_163_ = anIntArray9184[i_160_] - anIntArray9184[i_159_];
			int i_164_ = anIntArray9161[i_160_] - anIntArray9161[i_159_];
			int i_165_ = anIntArray9191[i_161_] - anIntArray9191[i_159_];
			int i_166_ = anIntArray9184[i_161_] - anIntArray9184[i_159_];
			int i_167_ = anIntArray9161[i_161_] - anIntArray9161[i_159_];
			int i_168_ = i_163_ * i_167_ - i_166_ * i_164_;
			int i_169_ = i_164_ * i_165_ - i_167_ * i_162_;
			int i_170_;
			for (i_170_ = i_162_ * i_166_ - i_165_ * i_163_; (i_168_ > 8192 || i_169_ > 8192 || i_170_ > 8192 || i_168_ < -8192 || i_169_ < -8192 || i_170_ < -8192); i_170_ >>= 1) {
				i_168_ >>= 1;
				i_169_ >>= 1;
			}
			int i_171_ = (int) Math.sqrt((double) (i_168_ * i_168_ + i_169_ * i_169_ + i_170_ * i_170_));
			if (i_171_ <= 0)
				i_171_ = 1;
			i_168_ = i_168_ * 256 / i_171_;
			i_169_ = i_169_ * 256 / i_171_;
			i_170_ = i_170_ * 256 / i_171_;
			byte i_172_;
			if (aByteArray9200 == null)
				i_172_ = (byte) 0;
			else
				i_172_ = aByteArray9200[i];
			if (i_172_ == 0) {
				Class114 class114 = aClass114Array9236[i_159_];
				class114.anInt1412 += i_168_;
				class114.anInt1411 += i_169_;
				class114.anInt1410 += i_170_;
				class114.anInt1413++;
				class114 = aClass114Array9236[i_160_];
				class114.anInt1412 += i_168_;
				class114.anInt1411 += i_169_;
				class114.anInt1410 += i_170_;
				class114.anInt1413++;
				class114 = aClass114Array9236[i_161_];
				class114.anInt1412 += i_168_;
				class114.anInt1411 += i_169_;
				class114.anInt1410 += i_170_;
				class114.anInt1413++;
			} else if (i_172_ == 1) {
				if (aClass113Array9199 == null)
					aClass113Array9199 = new Class113[anInt9185];
				Class113 class113 = aClass113Array9199[i] = new Class113();
				class113.anInt1407 = i_168_;
				class113.anInt1408 = i_169_;
				class113.anInt1409 = i_170_;
			}
		}
	}

	void method14634(boolean bool) {
		if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
			synchronized (this) {
				method14707(bool);
			}
		} else
			method14707(bool);
	}

	void method2875() {
		if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
			synchronized (this) {
				while (aBool1951) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool1951 = true;
			}
		}
	}

	int method14635(int i, short i_173_, int i_174_) {
		int i_175_ = Class656.anIntArray8390[method14636(i, i_174_)];
		Class163 class163 = aClass180_Sub1_9171.aClass181_2059.method3544(i_173_ & 0xffff, (byte) -46);
		int i_176_ = class163.aByte1808 & 0xff;
		if (i_176_ != 0) {
			int i_177_ = 131586 * i_174_;
			if (i_176_ == 256)
				i_175_ = i_177_;
			else {
				int i_178_ = i_176_;
				int i_179_ = 256 - i_176_;
				i_175_ = ((((i_177_ & 0xff00ff) * i_178_ + (i_175_ & 0xff00ff) * i_179_) & ~0xff00ff) + (((i_177_ & 0xff00) * i_178_ + (i_175_ & 0xff00) * i_179_) & 0xff0000)) >> 8;
			}
		}
		int i_180_ = class163.aByte1802 & 0xff;
		if (i_180_ != 0) {
			i_180_ += 256;
			int i_181_ = ((i_175_ & 0xff0000) >> 16) * i_180_;
			if (i_181_ > 65535)
				i_181_ = 65535;
			int i_182_ = ((i_175_ & 0xff00) >> 8) * i_180_;
			if (i_182_ > 65535)
				i_182_ = 65535;
			int i_183_ = (i_175_ & 0xff) * i_180_;
			if (i_183_ > 65535)
				i_183_ = 65535;
			i_175_ = (i_181_ << 8 & 0xff0000) + (i_182_ & 0xff00) + (i_183_ >> 8);
		}
		return i_175_;
	}

	int method14636(int i, int i_184_) {
		i_184_ = i_184_ * (i & 0x7f) >> 7;
		if (i_184_ < 2)
			i_184_ = 2;
		else if (i_184_ > 126)
			i_184_ = 126;
		return (i & 0xff80) + i_184_;
	}

	int method14637(int i) {
		if (i < 2)
			i = 2;
		else if (i > 126)
			i = 126;
		return i;
	}

	void method2950() {
		if (aBool9210) {
			for (int i = 0; i < anInt9177; i++) {
				anIntArray9191[i] = anIntArray9191[i] + 7 >> 4;
				anIntArray9184[i] = anIntArray9184[i] + 7 >> 4;
				anIntArray9161[i] = anIntArray9161[i] + 7 >> 4;
			}
			aBool9210 = false;
		}
		if (aBool9209) {
			method14656();
			aBool9209 = false;
		}
		aBool9221 = false;
	}

	public void method2918(Class176 class176, int i, int i_185_, int i_186_, boolean bool) {
		Class176_Sub2 class176_sub2_187_ = (Class176_Sub2) class176;
		if ((anInt9174 & 0x10000) != 65536)
			throw new IllegalStateException("");
		if ((class176_sub2_187_.anInt9174 & 0x10000) != 65536)
			throw new IllegalStateException("");
		method14631(aClass180_Sub1_9171.method14835(Thread.currentThread()));
		method14659();
		method14632();
		class176_sub2_187_.method14659();
		class176_sub2_187_.method14632();
		anInt9234++;
		int i_188_ = 0;
		int[] is = class176_sub2_187_.anIntArray9191;
		int i_189_ = class176_sub2_187_.anInt9231;
		for (int i_190_ = 0; i_190_ < anInt9231; i_190_++) {
			Class114 class114 = aClass114Array9236[i_190_];
			if (class114.anInt1413 != 0) {
				int i_191_ = anIntArray9184[i_190_] - i_185_;
				if (i_191_ >= class176_sub2_187_.aShort9223 && i_191_ <= class176_sub2_187_.aShort9237) {
					int i_192_ = anIntArray9191[i_190_] - i;
					if (i_192_ >= class176_sub2_187_.aShort9226 && i_192_ <= class176_sub2_187_.aShort9173) {
						int i_193_ = anIntArray9161[i_190_] - i_186_;
						if (i_193_ >= class176_sub2_187_.aShort9228 && i_193_ <= class176_sub2_187_.aShort9229) {
							for (int i_194_ = 0; i_194_ < i_189_; i_194_++) {
								Class114 class114_195_ = (class176_sub2_187_.aClass114Array9236[i_194_]);
								if (i_192_ == is[i_194_] && i_193_ == (class176_sub2_187_.anIntArray9161[i_194_]) && i_191_ == (class176_sub2_187_.anIntArray9184[i_194_]) && class114_195_.anInt1413 != 0) {
									if (aClass114Array9203 == null)
										aClass114Array9203 = new Class114[anInt9231];
									if (class176_sub2_187_.aClass114Array9203 == null)
										class176_sub2_187_.aClass114Array9203 = new Class114[i_189_];
									Class114 class114_196_ = aClass114Array9203[i_190_];
									if (class114_196_ == null)
										class114_196_ = aClass114Array9203[i_190_] = new Class114(class114);
									Class114 class114_197_ = (class176_sub2_187_.aClass114Array9203[i_194_]);
									if (class114_197_ == null)
										class114_197_ = class176_sub2_187_.aClass114Array9203[i_194_] = new Class114(class114_195_);
									class114_196_.anInt1412 += class114_195_.anInt1412;
									class114_196_.anInt1411 += class114_195_.anInt1411;
									class114_196_.anInt1410 += class114_195_.anInt1410;
									class114_196_.anInt1413 += class114_195_.anInt1413;
									class114_197_.anInt1412 += class114.anInt1412;
									class114_197_.anInt1411 += class114.anInt1411;
									class114_197_.anInt1410 += class114.anInt1410;
									class114_197_.anInt1413 += class114.anInt1413;
									i_188_++;
									anIntArray9243[i_190_] = anInt9234;
									anIntArray9244[i_194_] = anInt9234;
								}
							}
						}
					}
				}
			}
		}
		if (i_188_ >= 3 && bool) {
			for (int i_198_ = 0; i_198_ < anInt9185; i_198_++) {
				if (anIntArray9243[aShortArray9187[i_198_]] == anInt9234 && anIntArray9243[aShortArray9188[i_198_]] == anInt9234 && anIntArray9243[aShortArray9189[i_198_]] == anInt9234) {
					if (aByteArray9200 == null)
						aByteArray9200 = new byte[anInt9185];
					aByteArray9200[i_198_] = (byte) 2;
				}
			}
			for (int i_199_ = 0; i_199_ < class176_sub2_187_.anInt9185; i_199_++) {
				if ((anIntArray9244[class176_sub2_187_.aShortArray9187[i_199_]] == anInt9234) && anIntArray9244[(class176_sub2_187_.aShortArray9188[i_199_])] == anInt9234 && anIntArray9244[(class176_sub2_187_.aShortArray9189[i_199_])] == anInt9234) {
					if (class176_sub2_187_.aByteArray9200 == null)
						class176_sub2_187_.aByteArray9200 = new byte[class176_sub2_187_.anInt9185];
					class176_sub2_187_.aByteArray9200[i_199_] = (byte) 2;
				}
			}
		}
	}

	public void method2881(Class176 class176, int i, int i_200_, int i_201_, boolean bool) {
		Class176_Sub2 class176_sub2_202_ = (Class176_Sub2) class176;
		if ((anInt9174 & 0x10000) != 65536)
			throw new IllegalStateException("");
		if ((class176_sub2_202_.anInt9174 & 0x10000) != 65536)
			throw new IllegalStateException("");
		method14631(aClass180_Sub1_9171.method14835(Thread.currentThread()));
		method14659();
		method14632();
		class176_sub2_202_.method14659();
		class176_sub2_202_.method14632();
		anInt9234++;
		int i_203_ = 0;
		int[] is = class176_sub2_202_.anIntArray9191;
		int i_204_ = class176_sub2_202_.anInt9231;
		for (int i_205_ = 0; i_205_ < anInt9231; i_205_++) {
			Class114 class114 = aClass114Array9236[i_205_];
			if (class114.anInt1413 != 0) {
				int i_206_ = anIntArray9184[i_205_] - i_200_;
				if (i_206_ >= class176_sub2_202_.aShort9223 && i_206_ <= class176_sub2_202_.aShort9237) {
					int i_207_ = anIntArray9191[i_205_] - i;
					if (i_207_ >= class176_sub2_202_.aShort9226 && i_207_ <= class176_sub2_202_.aShort9173) {
						int i_208_ = anIntArray9161[i_205_] - i_201_;
						if (i_208_ >= class176_sub2_202_.aShort9228 && i_208_ <= class176_sub2_202_.aShort9229) {
							for (int i_209_ = 0; i_209_ < i_204_; i_209_++) {
								Class114 class114_210_ = (class176_sub2_202_.aClass114Array9236[i_209_]);
								if (i_207_ == is[i_209_] && i_208_ == (class176_sub2_202_.anIntArray9161[i_209_]) && i_206_ == (class176_sub2_202_.anIntArray9184[i_209_]) && class114_210_.anInt1413 != 0) {
									if (aClass114Array9203 == null)
										aClass114Array9203 = new Class114[anInt9231];
									if (class176_sub2_202_.aClass114Array9203 == null)
										class176_sub2_202_.aClass114Array9203 = new Class114[i_204_];
									Class114 class114_211_ = aClass114Array9203[i_205_];
									if (class114_211_ == null)
										class114_211_ = aClass114Array9203[i_205_] = new Class114(class114);
									Class114 class114_212_ = (class176_sub2_202_.aClass114Array9203[i_209_]);
									if (class114_212_ == null)
										class114_212_ = class176_sub2_202_.aClass114Array9203[i_209_] = new Class114(class114_210_);
									class114_211_.anInt1412 += class114_210_.anInt1412;
									class114_211_.anInt1411 += class114_210_.anInt1411;
									class114_211_.anInt1410 += class114_210_.anInt1410;
									class114_211_.anInt1413 += class114_210_.anInt1413;
									class114_212_.anInt1412 += class114.anInt1412;
									class114_212_.anInt1411 += class114.anInt1411;
									class114_212_.anInt1410 += class114.anInt1410;
									class114_212_.anInt1413 += class114.anInt1413;
									i_203_++;
									anIntArray9243[i_205_] = anInt9234;
									anIntArray9244[i_209_] = anInt9234;
								}
							}
						}
					}
				}
			}
		}
		if (i_203_ >= 3 && bool) {
			for (int i_213_ = 0; i_213_ < anInt9185; i_213_++) {
				if (anIntArray9243[aShortArray9187[i_213_]] == anInt9234 && anIntArray9243[aShortArray9188[i_213_]] == anInt9234 && anIntArray9243[aShortArray9189[i_213_]] == anInt9234) {
					if (aByteArray9200 == null)
						aByteArray9200 = new byte[anInt9185];
					aByteArray9200[i_213_] = (byte) 2;
				}
			}
			for (int i_214_ = 0; i_214_ < class176_sub2_202_.anInt9185; i_214_++) {
				if ((anIntArray9244[class176_sub2_202_.aShortArray9187[i_214_]] == anInt9234) && anIntArray9244[(class176_sub2_202_.aShortArray9188[i_214_])] == anInt9234 && anIntArray9244[(class176_sub2_202_.aShortArray9189[i_214_])] == anInt9234) {
					if (class176_sub2_202_.aByteArray9200 == null)
						class176_sub2_202_.aByteArray9200 = new byte[class176_sub2_202_.anInt9185];
					class176_sub2_202_.aByteArray9200[i_214_] = (byte) 2;
				}
			}
		}
	}

	void method14638() {
		if (!aBool9221) {
			int i = 0;
			int i_215_ = 0;
			int i_216_ = 32767;
			int i_217_ = 32767;
			int i_218_ = 32767;
			int i_219_ = -32768;
			int i_220_ = -32768;
			int i_221_ = -32768;
			for (int i_222_ = 0; i_222_ < anInt9231; i_222_++) {
				int i_223_ = anIntArray9191[i_222_];
				int i_224_ = anIntArray9184[i_222_];
				int i_225_ = anIntArray9161[i_222_];
				if (i_223_ < i_216_)
					i_216_ = i_223_;
				if (i_223_ > i_219_)
					i_219_ = i_223_;
				if (i_224_ < i_217_)
					i_217_ = i_224_;
				if (i_224_ > i_220_)
					i_220_ = i_224_;
				if (i_225_ < i_218_)
					i_218_ = i_225_;
				if (i_225_ > i_221_)
					i_221_ = i_225_;
				int i_226_ = i_223_ * i_223_ + i_225_ * i_225_;
				if (i_226_ > i)
					i = i_226_;
				i_226_ += i_224_ * i_224_;
				if (i_226_ > i_215_)
					i_215_ = i_226_;
			}
			aShort9226 = (short) i_216_;
			aShort9173 = (short) i_219_;
			aShort9223 = (short) i_217_;
			aShort9237 = (short) i_220_;
			aShort9228 = (short) i_218_;
			aShort9229 = (short) i_221_;
			aShort9196 = (short) (int) (Math.sqrt((double) i) + 0.99);
			aShort9222 = (short) (int) (Math.sqrt((double) i_215_) + 0.99);
			aBool9221 = true;
		}
	}

	Class176 method14639(Class176_Sub2 class176_sub2_227_, Class176_Sub2 class176_sub2_228_, int i, boolean bool, boolean bool_229_) {
		class176_sub2_227_.aBool9221 = aBool9221;
		if (aBool9221) {
			class176_sub2_227_.aShort9173 = aShort9173;
			class176_sub2_227_.aShort9237 = aShort9237;
			class176_sub2_227_.aShort9229 = aShort9229;
			class176_sub2_227_.aShort9226 = aShort9226;
			class176_sub2_227_.aShort9223 = aShort9223;
			class176_sub2_227_.aShort9228 = aShort9228;
			class176_sub2_227_.aShort9196 = aShort9196;
			class176_sub2_227_.aShort9222 = aShort9222;
		}
		if (aBool9168) {
			class176_sub2_227_.aShort9242 = aShort9242;
			class176_sub2_227_.aBool9168 = true;
		} else
			class176_sub2_227_.aBool9168 = false;
		class176_sub2_227_.anInt9175 = anInt9175;
		class176_sub2_227_.anInt9179 = anInt9179;
		class176_sub2_227_.anInt9177 = anInt9177;
		class176_sub2_227_.anInt9231 = anInt9231;
		class176_sub2_227_.anInt9185 = anInt9185;
		class176_sub2_227_.anInt9217 = anInt9217;
		class176_sub2_227_.anInt9186 = anInt9186;
		if ((i & 0x100) != 0)
			class176_sub2_227_.aBool9232 = true;
		else
			class176_sub2_227_.aBool9232 = aBool9232;
		class176_sub2_227_.aBool9233 = aBool9233;
		boolean bool_230_ = (i & 0x7) == 7 | (i & 0x20) != 0;
		boolean bool_231_ = bool_230_ || (i & 0x1) != 0;
		boolean bool_232_ = bool_230_ || (i & 0x2) != 0;
		boolean bool_233_ = bool_230_ || (i & 0x4) != 0 || (i & 0x10) != 0;
		if (bool_231_ || bool_232_ || bool_233_) {
			if (bool_231_) {
				if (class176_sub2_228_.anIntArray9191 == null || class176_sub2_228_.anIntArray9191.length < anInt9177)
					class176_sub2_227_.anIntArray9191 = class176_sub2_228_.anIntArray9191 = new int[anInt9177];
				else
					class176_sub2_227_.anIntArray9191 = class176_sub2_228_.anIntArray9191;
				for (int i_234_ = 0; i_234_ < anInt9177; i_234_++)
					class176_sub2_227_.anIntArray9191[i_234_] = anIntArray9191[i_234_];
			} else
				class176_sub2_227_.anIntArray9191 = anIntArray9191;
			if (bool_232_) {
				if (class176_sub2_228_.anIntArray9184 == null || class176_sub2_228_.anIntArray9184.length < anInt9177)
					class176_sub2_227_.anIntArray9184 = class176_sub2_228_.anIntArray9184 = new int[anInt9177];
				else
					class176_sub2_227_.anIntArray9184 = class176_sub2_228_.anIntArray9184;
				for (int i_235_ = 0; i_235_ < anInt9177; i_235_++)
					class176_sub2_227_.anIntArray9184[i_235_] = anIntArray9184[i_235_];
			} else
				class176_sub2_227_.anIntArray9184 = anIntArray9184;
			if (bool_233_) {
				if (class176_sub2_228_.anIntArray9161 == null || class176_sub2_228_.anIntArray9161.length < anInt9177)
					class176_sub2_227_.anIntArray9161 = class176_sub2_228_.anIntArray9161 = new int[anInt9177];
				else
					class176_sub2_227_.anIntArray9161 = class176_sub2_228_.anIntArray9161;
				for (int i_236_ = 0; i_236_ < anInt9177; i_236_++)
					class176_sub2_227_.anIntArray9161[i_236_] = anIntArray9161[i_236_];
			} else
				class176_sub2_227_.anIntArray9161 = anIntArray9161;
		} else {
			class176_sub2_227_.anIntArray9191 = anIntArray9191;
			class176_sub2_227_.anIntArray9184 = anIntArray9184;
			class176_sub2_227_.anIntArray9161 = anIntArray9161;
		}
		if ((i & 0x84080) != 0) {
			if (class176_sub2_228_.aShortArray9193 == null || class176_sub2_228_.aShortArray9193.length < anInt9185) {
				int i_237_ = anInt9185;
				class176_sub2_227_.aShortArray9193 = class176_sub2_228_.aShortArray9193 = new short[i_237_];
			} else
				class176_sub2_227_.aShortArray9193 = class176_sub2_228_.aShortArray9193;
			for (int i_238_ = 0; i_238_ < anInt9185; i_238_++)
				class176_sub2_227_.aShortArray9193[i_238_] = aShortArray9193[i_238_];
		} else
			class176_sub2_227_.aShortArray9193 = aShortArray9193;
		if ((i & 0x97018) != 0) {
			class176_sub2_227_.anInt9246 = 0;
			Class176_Sub2 class176_sub2_239_ = class176_sub2_227_;
			Class176_Sub2 class176_sub2_240_ = class176_sub2_227_;
			class176_sub2_227_.anIntArray9194 = null;
			class176_sub2_240_.anIntArray9180 = null;
			class176_sub2_239_.anIntArray9192 = null;
		} else if ((i & 0x80) != 0) {
			if (bool_229_)
				method14634(false);
			if (anIntArray9192 != null) {
				if (class176_sub2_228_.anIntArray9192 == null || class176_sub2_228_.anIntArray9192.length < anInt9185) {
					int i_241_ = anInt9185;
					class176_sub2_227_.anIntArray9192 = class176_sub2_228_.anIntArray9192 = new int[i_241_];
					class176_sub2_227_.anIntArray9180 = class176_sub2_228_.anIntArray9180 = new int[i_241_];
					class176_sub2_227_.anIntArray9194 = class176_sub2_228_.anIntArray9194 = new int[i_241_];
				} else {
					class176_sub2_227_.anIntArray9192 = class176_sub2_228_.anIntArray9192;
					class176_sub2_227_.anIntArray9180 = class176_sub2_228_.anIntArray9180;
					class176_sub2_227_.anIntArray9194 = class176_sub2_228_.anIntArray9194;
				}
				for (int i_242_ = 0; i_242_ < anInt9185; i_242_++) {
					class176_sub2_227_.anIntArray9192[i_242_] = anIntArray9192[i_242_];
					class176_sub2_227_.anIntArray9180[i_242_] = anIntArray9180[i_242_];
					class176_sub2_227_.anIntArray9194[i_242_] = anIntArray9194[i_242_];
				}
			}
			class176_sub2_227_.anInt9246 = anInt9246;
		} else {
			if (bool_229_)
				method14634(false);
			class176_sub2_227_.anIntArray9192 = anIntArray9192;
			class176_sub2_227_.anIntArray9180 = anIntArray9180;
			class176_sub2_227_.anIntArray9194 = anIntArray9194;
			class176_sub2_227_.anInt9246 = anInt9246;
		}
		if ((i & 0x100) != 0) {
			if (class176_sub2_228_.aByteArray9202 == null || class176_sub2_228_.aByteArray9202.length < anInt9185) {
				int i_243_ = anInt9185;
				class176_sub2_227_.aByteArray9202 = class176_sub2_228_.aByteArray9202 = new byte[i_243_];
			} else
				class176_sub2_227_.aByteArray9202 = class176_sub2_228_.aByteArray9202;
			if (aByteArray9202 != null) {
				for (int i_244_ = 0; i_244_ < anInt9185; i_244_++)
					class176_sub2_227_.aByteArray9202[i_244_] = aByteArray9202[i_244_];
			} else {
				for (int i_245_ = 0; i_245_ < anInt9185; i_245_++)
					class176_sub2_227_.aByteArray9202[i_245_] = (byte) 0;
			}
		} else
			class176_sub2_227_.aByteArray9202 = aByteArray9202;
		if ((i & 0x8) != 0 || (i & 0x10) != 0) {
			if (class176_sub2_228_.aClass114Array9236 == null || class176_sub2_228_.aClass114Array9236.length < anInt9231) {
				int i_246_ = anInt9231;
				class176_sub2_227_.aClass114Array9236 = class176_sub2_228_.aClass114Array9236 = new Class114[i_246_];
			} else
				class176_sub2_227_.aClass114Array9236 = class176_sub2_228_.aClass114Array9236;
			if (aClass114Array9236 != null) {
				for (int i_247_ = 0; i_247_ < anInt9231; i_247_++)
					class176_sub2_227_.aClass114Array9236[i_247_] = new Class114(aClass114Array9236[i_247_]);
			} else
				class176_sub2_227_.aClass114Array9236 = null;
			if (aClass113Array9199 != null) {
				if (class176_sub2_228_.aClass113Array9199 == null || (class176_sub2_228_.aClass113Array9199.length < anInt9185)) {
					int i_248_ = anInt9185;
					class176_sub2_227_.aClass113Array9199 = class176_sub2_228_.aClass113Array9199 = new Class113[i_248_];
				} else
					class176_sub2_227_.aClass113Array9199 = class176_sub2_228_.aClass113Array9199;
				for (int i_249_ = 0; i_249_ < anInt9185; i_249_++)
					class176_sub2_227_.aClass113Array9199[i_249_] = (aClass113Array9199[i_249_] != null ? new Class113(aClass113Array9199[i_249_]) : null);
			} else
				class176_sub2_227_.aClass113Array9199 = null;
		} else {
			if (bool_229_)
				method14632();
			class176_sub2_227_.aClass114Array9236 = aClass114Array9236;
			class176_sub2_227_.aClass113Array9199 = aClass113Array9199;
		}
		if ((i & 0x8000) != 0) {
			if (aShortArray9162 == null)
				class176_sub2_227_.aShortArray9162 = null;
			else {
				if (class176_sub2_228_.aShortArray9162 == null || class176_sub2_228_.aShortArray9162.length < anInt9185) {
					int i_250_ = anInt9185;
					class176_sub2_227_.aShortArray9162 = class176_sub2_228_.aShortArray9162 = new short[i_250_];
				} else
					class176_sub2_227_.aShortArray9162 = class176_sub2_228_.aShortArray9162;
				for (int i_251_ = 0; i_251_ < anInt9185; i_251_++)
					class176_sub2_227_.aShortArray9162[i_251_] = aShortArray9162[i_251_];
			}
		} else
			class176_sub2_227_.aShortArray9162 = aShortArray9162;
		if ((i & 0x10000) != 0) {
			if (aByteArray9200 == null)
				class176_sub2_227_.aByteArray9200 = null;
			else {
				if (class176_sub2_228_.aByteArray9200 == null || class176_sub2_228_.aByteArray9200.length < anInt9185) {
					int i_252_ = bool ? anInt9185 + 100 : anInt9185;
					class176_sub2_227_.aByteArray9200 = class176_sub2_228_.aByteArray9200 = new byte[i_252_];
				} else
					class176_sub2_227_.aByteArray9200 = class176_sub2_228_.aByteArray9200;
				for (int i_253_ = 0; i_253_ < anInt9185; i_253_++)
					class176_sub2_227_.aByteArray9200[i_253_] = aByteArray9200[i_253_];
			}
		} else
			class176_sub2_227_.aByteArray9200 = aByteArray9200;
		if ((i & 0xc580) != 0) {
			if (class176_sub2_228_.aClass108Array9211 == null || class176_sub2_228_.aClass108Array9211.length < anInt9217) {
				int i_254_ = anInt9217;
				class176_sub2_227_.aClass108Array9211 = class176_sub2_228_.aClass108Array9211 = new Class108[i_254_];
				for (int i_255_ = 0; i_255_ < anInt9217; i_255_++)
					class176_sub2_227_.aClass108Array9211[i_255_] = aClass108Array9211[i_255_].method1930(1408858154);
			} else {
				class176_sub2_227_.aClass108Array9211 = class176_sub2_228_.aClass108Array9211;
				for (int i_256_ = 0; i_256_ < anInt9217; i_256_++)
					class176_sub2_227_.aClass108Array9211[i_256_].method1933(aClass108Array9211[i_256_], 1769813785);
			}
		} else
			class176_sub2_227_.aClass108Array9211 = aClass108Array9211;
		if (aFloatArrayArray9190 != null && (i & 0x10) != 0) {
			if (class176_sub2_228_.aFloatArrayArray9190 == null || (class176_sub2_228_.aFloatArrayArray9190.length < anInt9185)) {
				int i_257_ = bool ? anInt9185 + 100 : anInt9185;
				class176_sub2_227_.aFloatArrayArray9190 = class176_sub2_228_.aFloatArrayArray9190 = new float[i_257_][3];
			} else
				class176_sub2_227_.aFloatArrayArray9190 = class176_sub2_228_.aFloatArrayArray9190;
			for (int i_258_ = 0; i_258_ < anInt9185; i_258_++) {
				if (aFloatArrayArray9190[i_258_] != null) {
					class176_sub2_227_.aFloatArrayArray9190[i_258_][0] = aFloatArrayArray9190[i_258_][0];
					class176_sub2_227_.aFloatArrayArray9190[i_258_][1] = aFloatArrayArray9190[i_258_][1];
					class176_sub2_227_.aFloatArrayArray9190[i_258_][2] = aFloatArrayArray9190[i_258_][2];
				}
			}
			if (class176_sub2_228_.aFloatArrayArray9235 == null || (class176_sub2_228_.aFloatArrayArray9235.length < anInt9185)) {
				int i_259_ = bool ? anInt9185 + 100 : anInt9185;
				class176_sub2_227_.aFloatArrayArray9235 = class176_sub2_228_.aFloatArrayArray9235 = new float[i_259_][3];
			} else
				class176_sub2_227_.aFloatArrayArray9235 = class176_sub2_228_.aFloatArrayArray9235;
			for (int i_260_ = 0; i_260_ < anInt9185; i_260_++) {
				if (aFloatArrayArray9235[i_260_] != null) {
					class176_sub2_227_.aFloatArrayArray9235[i_260_][0] = aFloatArrayArray9235[i_260_][0];
					class176_sub2_227_.aFloatArrayArray9235[i_260_][1] = aFloatArrayArray9235[i_260_][1];
					class176_sub2_227_.aFloatArrayArray9235[i_260_][2] = aFloatArrayArray9235[i_260_][2];
				}
			}
		} else {
			class176_sub2_227_.aFloatArrayArray9190 = aFloatArrayArray9190;
			class176_sub2_227_.aFloatArrayArray9235 = aFloatArrayArray9235;
		}
		class176_sub2_227_.anIntArrayArray9178 = anIntArrayArray9178;
		class176_sub2_227_.anIntArrayArray9208 = anIntArrayArray9208;
		class176_sub2_227_.anIntArrayArray9220 = anIntArrayArray9220;
		class176_sub2_227_.aShortArray9227 = aShortArray9227;
		class176_sub2_227_.aShortArray9205 = aShortArray9205;
		class176_sub2_227_.aByteArray9201 = aByteArray9201;
		class176_sub2_227_.aShortArray9187 = aShortArray9187;
		class176_sub2_227_.aShortArray9188 = aShortArray9188;
		class176_sub2_227_.aShortArray9189 = aShortArray9189;
		class176_sub2_227_.aClass167Array9215 = aClass167Array9215;
		class176_sub2_227_.aClass159Array9216 = aClass159Array9216;
		class176_sub2_227_.aClass116Array9218 = aClass116Array9218;
		class176_sub2_227_.aShortArray9181 = aShortArray9181;
		class176_sub2_227_.anInt9174 = i;
		return class176_sub2_227_;
	}

	public int method2874() {
		return anInt9174;
	}

	public int method2994() {
		return anInt9175;
	}

	public void method2895() {
		/* empty */
	}

	void method2984() {
		if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
			synchronized (this) {
				aBool1951 = false;
				this.notifyAll();
			}
		}
	}

	public void method2867(int i) {
		if ((anInt9174 & 0xd) != 13)
			throw new IllegalStateException();
		if (aClass114Array9236 != null) {
			if (i == 4096)
				method14654();
			else if (i == 8192)
				method14642();
			else if (i == 12288)
				method14643();
			else {
				int i_261_ = Class428.anIntArray4825[i];
				int i_262_ = Class428.anIntArray4819[i];
				synchronized (this) {
					for (int i_263_ = 0; i_263_ < anInt9231; i_263_++) {
						int i_264_ = ((anIntArray9161[i_263_] * i_261_ + anIntArray9191[i_263_] * i_262_) >> 14);
						anIntArray9161[i_263_] = (anIntArray9161[i_263_] * i_262_ - anIntArray9191[i_263_] * i_261_) >> 14;
						anIntArray9191[i_263_] = i_264_;
						if (aClass114Array9236[i_263_] != null) {
							i_264_ = ((aClass114Array9236[i_263_].anInt1410 * i_261_) + (aClass114Array9236[i_263_].anInt1412 * i_262_)) >> 14;
							aClass114Array9236[i_263_].anInt1410 = ((aClass114Array9236[i_263_].anInt1410 * i_262_) - (aClass114Array9236[i_263_].anInt1412 * i_261_)) >> 14;
							aClass114Array9236[i_263_].anInt1412 = i_264_;
						}
					}
					if (aClass113Array9199 != null) {
						for (int i_265_ = 0; i_265_ < anInt9185; i_265_++) {
							if (aClass113Array9199[i_265_] != null) {
								int i_266_ = (((aClass113Array9199[i_265_].anInt1409 * i_261_) + (aClass113Array9199[i_265_].anInt1407 * i_262_)) >> 14);
								aClass113Array9199[i_265_].anInt1409 = ((aClass113Array9199[i_265_].anInt1409 * i_262_) - (aClass113Array9199[i_265_].anInt1407 * i_261_)) >> 14;
								aClass113Array9199[i_265_].anInt1407 = i_266_;
							}
						}
					}
					for (int i_267_ = anInt9231; i_267_ < anInt9177; i_267_++) {
						int i_268_ = ((anIntArray9161[i_267_] * i_261_ + anIntArray9191[i_267_] * i_262_) >> 14);
						anIntArray9161[i_267_] = (anIntArray9161[i_267_] * i_262_ - anIntArray9191[i_267_] * i_261_) >> 14;
						anIntArray9191[i_267_] = i_268_;
					}
					anInt9246 = 0;
					aBool9221 = false;
				}
			}
		} else
			method2911(i);
	}

	void method14640() {
		synchronized (this) {
			for (int i = 0; i < anInt9177; i++) {
				int i_269_ = anIntArray9191[i];
				anIntArray9191[i] = anIntArray9161[i];
				anIntArray9161[i] = -i_269_;
			}
			method14645();
		}
	}

	void method14641() {
		synchronized (this) {
			for (int i = 0; i < anInt9177; i++) {
				anIntArray9191[i] = -anIntArray9191[i];
				anIntArray9161[i] = -anIntArray9161[i];
			}
			method14645();
		}
	}

	void method2887() {
		if (aBool9210) {
			for (int i = 0; i < anInt9177; i++) {
				anIntArray9191[i] = anIntArray9191[i] + 7 >> 4;
				anIntArray9184[i] = anIntArray9184[i] + 7 >> 4;
				anIntArray9161[i] = anIntArray9161[i] + 7 >> 4;
			}
			aBool9210 = false;
		}
		if (aBool9209) {
			method14656();
			aBool9209 = false;
		}
		aBool9221 = false;
	}

	public void method3002(int i) {
		if ((anInt9174 & 0xd) != 13)
			throw new IllegalStateException();
		if (aClass114Array9236 != null) {
			if (i == 4096)
				method14654();
			else if (i == 8192)
				method14642();
			else if (i == 12288)
				method14643();
			else {
				int i_270_ = Class428.anIntArray4825[i];
				int i_271_ = Class428.anIntArray4819[i];
				synchronized (this) {
					for (int i_272_ = 0; i_272_ < anInt9231; i_272_++) {
						int i_273_ = ((anIntArray9161[i_272_] * i_270_ + anIntArray9191[i_272_] * i_271_) >> 14);
						anIntArray9161[i_272_] = (anIntArray9161[i_272_] * i_271_ - anIntArray9191[i_272_] * i_270_) >> 14;
						anIntArray9191[i_272_] = i_273_;
						if (aClass114Array9236[i_272_] != null) {
							i_273_ = ((aClass114Array9236[i_272_].anInt1410 * i_270_) + (aClass114Array9236[i_272_].anInt1412 * i_271_)) >> 14;
							aClass114Array9236[i_272_].anInt1410 = ((aClass114Array9236[i_272_].anInt1410 * i_271_) - (aClass114Array9236[i_272_].anInt1412 * i_270_)) >> 14;
							aClass114Array9236[i_272_].anInt1412 = i_273_;
						}
					}
					if (aClass113Array9199 != null) {
						for (int i_274_ = 0; i_274_ < anInt9185; i_274_++) {
							if (aClass113Array9199[i_274_] != null) {
								int i_275_ = (((aClass113Array9199[i_274_].anInt1409 * i_270_) + (aClass113Array9199[i_274_].anInt1407 * i_271_)) >> 14);
								aClass113Array9199[i_274_].anInt1409 = ((aClass113Array9199[i_274_].anInt1409 * i_271_) - (aClass113Array9199[i_274_].anInt1407 * i_270_)) >> 14;
								aClass113Array9199[i_274_].anInt1407 = i_275_;
							}
						}
					}
					for (int i_276_ = anInt9231; i_276_ < anInt9177; i_276_++) {
						int i_277_ = ((anIntArray9161[i_276_] * i_270_ + anIntArray9191[i_276_] * i_271_) >> 14);
						anIntArray9161[i_276_] = (anIntArray9161[i_276_] * i_271_ - anIntArray9191[i_276_] * i_270_) >> 14;
						anIntArray9191[i_276_] = i_277_;
					}
					anInt9246 = 0;
					aBool9221 = false;
				}
			}
		} else
			method2911(i);
	}

	void method14642() {
		synchronized (this) {
			for (int i = 0; i < anInt9231; i++) {
				anIntArray9191[i] = -anIntArray9191[i];
				anIntArray9161[i] = -anIntArray9161[i];
				if (aClass114Array9236[i] != null) {
					aClass114Array9236[i].anInt1412 = -aClass114Array9236[i].anInt1412;
					aClass114Array9236[i].anInt1410 = -aClass114Array9236[i].anInt1410;
				}
			}
			if (aClass113Array9199 != null) {
				for (int i = 0; i < anInt9185; i++) {
					if (aClass113Array9199[i] != null) {
						aClass113Array9199[i].anInt1407 = -aClass113Array9199[i].anInt1407;
						aClass113Array9199[i].anInt1409 = -aClass113Array9199[i].anInt1409;
					}
				}
			}
			for (int i = anInt9231; i < anInt9177; i++) {
				anIntArray9191[i] = -anIntArray9191[i];
				anIntArray9161[i] = -anIntArray9161[i];
			}
			anInt9246 = 0;
			aBool9221 = false;
		}
	}

	void method14643() {
		synchronized (this) {
			for (int i = 0; i < anInt9231; i++) {
				int i_278_ = anIntArray9161[i];
				anIntArray9161[i] = anIntArray9191[i];
				anIntArray9191[i] = -i_278_;
				if (aClass114Array9236[i] != null) {
					i_278_ = aClass114Array9236[i].anInt1410;
					aClass114Array9236[i].anInt1410 = aClass114Array9236[i].anInt1412;
					aClass114Array9236[i].anInt1412 = -i_278_;
				}
			}
			if (aClass113Array9199 != null) {
				for (int i = 0; i < anInt9185; i++) {
					if (aClass113Array9199[i] != null) {
						int i_279_ = aClass113Array9199[i].anInt1409;
						aClass113Array9199[i].anInt1409 = aClass113Array9199[i].anInt1407;
						aClass113Array9199[i].anInt1407 = -i_279_;
					}
				}
			}
			for (int i = anInt9231; i < anInt9177; i++) {
				int i_280_ = anIntArray9161[i];
				anIntArray9161[i] = anIntArray9191[i];
				anIntArray9191[i] = -i_280_;
			}
			anInt9246 = 0;
			aBool9221 = false;
		}
	}

	public void method2868(int i) {
		if ((anInt9174 & 0x6) != 6)
			throw new IllegalStateException();
		int i_281_ = Class428.anIntArray4825[i];
		int i_282_ = Class428.anIntArray4819[i];
		synchronized (this) {
			for (int i_283_ = 0; i_283_ < anInt9177; i_283_++) {
				int i_284_ = ((anIntArray9184[i_283_] * i_282_ - anIntArray9161[i_283_] * i_281_) >> 14);
				anIntArray9161[i_283_] = (anIntArray9184[i_283_] * i_281_ + anIntArray9161[i_283_] * i_282_) >> 14;
				anIntArray9184[i_283_] = i_284_;
			}
			method14645();
		}
	}

	public void method3027(int i, int i_285_, Class161 class161, Class161 class161_286_, int i_287_, int i_288_, int i_289_) {
		if (i == 3) {
			if ((anInt9174 & 0x7) != 7)
				throw new IllegalStateException();
		} else if ((anInt9174 & 0x2) != 2)
			throw new IllegalStateException();
		if (!aBool9221)
			method14659();
		int i_290_ = i_287_ + aShort9226;
		int i_291_ = i_287_ + aShort9173;
		int i_292_ = i_289_ + aShort9228;
		int i_293_ = i_289_ + aShort9229;
		if (i == 4 || (i_290_ >= 0 && ((i_291_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1750 * 1210322533) && i_292_ >= 0 && ((i_293_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1751 * -533476177))) {
			int[][] is = class161.anIntArrayArray1754;
			int[][] is_294_ = null;
			if (class161_286_ != null)
				is_294_ = class161_286_.anIntArrayArray1754;
			if (i == 4 || i == 5) {
				if (class161_286_ == null || (i_290_ < 0 || ((i_291_ + class161_286_.anInt1752 * 1048375491 >> class161_286_.anInt1753 * 1252000143) >= class161_286_.anInt1750 * 1210322533) || i_292_ < 0 || ((i_293_ + class161_286_.anInt1752 * 1048375491 >> class161_286_.anInt1753 * 1252000143) >= class161_286_.anInt1751 * -533476177)))
					return;
			} else {
				i_290_ >>= class161.anInt1753 * 1252000143;
				i_291_ = (i_291_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				i_292_ >>= class161.anInt1753 * 1252000143;
				i_293_ = (i_293_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				if (is[i_290_][i_292_] == i_288_ && is[i_291_][i_292_] == i_288_ && is[i_290_][i_293_] == i_288_ && is[i_291_][i_293_] == i_288_)
					return;
			}
			synchronized (this) {
				if (i == 1) {
					int i_295_ = class161.anInt1752 * 1048375491 - 1;
					for (int i_296_ = 0; i_296_ < anInt9231; i_296_++) {
						int i_297_ = anIntArray9191[i_296_] + i_287_;
						int i_298_ = anIntArray9161[i_296_] + i_289_;
						int i_299_ = i_297_ & i_295_;
						int i_300_ = i_298_ & i_295_;
						int i_301_ = i_297_ >> class161.anInt1753 * 1252000143;
						int i_302_ = i_298_ >> class161.anInt1753 * 1252000143;
						int i_303_ = (((is[i_301_][i_302_] * (class161.anInt1752 * 1048375491 - i_299_)) + is[i_301_ + 1][i_302_] * i_299_) >> class161.anInt1753 * 1252000143);
						int i_304_ = (((is[i_301_][i_302_ + 1] * (class161.anInt1752 * 1048375491 - i_299_)) + is[i_301_ + 1][i_302_ + 1] * i_299_) >> class161.anInt1753 * 1252000143);
						int i_305_ = (i_303_ * (class161.anInt1752 * 1048375491 - i_300_) + i_304_ * i_300_ >> class161.anInt1753 * 1252000143);
						anIntArray9184[i_296_] = anIntArray9184[i_296_] + i_305_ - i_288_;
					}
					for (int i_306_ = anInt9231; i_306_ < anInt9177; i_306_++) {
						int i_307_ = anIntArray9191[i_306_] + i_287_;
						int i_308_ = anIntArray9161[i_306_] + i_289_;
						int i_309_ = i_307_ & i_295_;
						int i_310_ = i_308_ & i_295_;
						int i_311_ = i_307_ >> class161.anInt1753 * 1252000143;
						int i_312_ = i_308_ >> class161.anInt1753 * 1252000143;
						if (i_311_ >= 0 && i_311_ < is.length - 1 && i_312_ >= 0 && i_312_ < is[0].length - 1) {
							int i_313_ = (((is[i_311_][i_312_] * (class161.anInt1752 * 1048375491 - i_309_)) + is[i_311_ + 1][i_312_] * i_309_) >> class161.anInt1753 * 1252000143);
							int i_314_ = (((is[i_311_][i_312_ + 1] * (class161.anInt1752 * 1048375491 - i_309_)) + is[i_311_ + 1][i_312_ + 1] * i_309_) >> class161.anInt1753 * 1252000143);
							int i_315_ = (i_313_ * (class161.anInt1752 * 1048375491 - i_310_) + i_314_ * i_310_ >> class161.anInt1753 * 1252000143);
							anIntArray9184[i_306_] = anIntArray9184[i_306_] + i_315_ - i_288_;
						}
					}
				} else if (i == 2) {
					if (aShort9223 == 0)
						return;
					int i_316_ = class161.anInt1752 * 1048375491 - 1;
					for (int i_317_ = 0; i_317_ < anInt9231; i_317_++) {
						int i_318_ = (anIntArray9184[i_317_] << 16) / aShort9223;
						if (i_318_ < i_285_) {
							int i_319_ = anIntArray9191[i_317_] + i_287_;
							int i_320_ = anIntArray9161[i_317_] + i_289_;
							int i_321_ = i_319_ & i_316_;
							int i_322_ = i_320_ & i_316_;
							int i_323_ = i_319_ >> class161.anInt1753 * 1252000143;
							int i_324_ = i_320_ >> class161.anInt1753 * 1252000143;
							int i_325_ = (((is[i_323_][i_324_] * (class161.anInt1752 * 1048375491 - i_321_)) + is[i_323_ + 1][i_324_] * i_321_) >> class161.anInt1753 * 1252000143);
							int i_326_ = (((is[i_323_][i_324_ + 1] * (class161.anInt1752 * 1048375491 - i_321_)) + is[i_323_ + 1][i_324_ + 1] * i_321_) >> class161.anInt1753 * 1252000143);
							int i_327_ = (i_325_ * (class161.anInt1752 * 1048375491 - i_322_) + i_326_ * i_322_ >> class161.anInt1753 * 1252000143);
							anIntArray9184[i_317_] = anIntArray9184[i_317_] + ((i_327_ - i_288_) * (i_285_ - i_318_) / i_285_);
						} else
							anIntArray9184[i_317_] = anIntArray9184[i_317_];
					}
					for (int i_328_ = anInt9231; i_328_ < anInt9177; i_328_++) {
						int i_329_ = (anIntArray9184[i_328_] << 16) / aShort9223;
						if (i_329_ < i_285_) {
							int i_330_ = anIntArray9191[i_328_] + i_287_;
							int i_331_ = anIntArray9161[i_328_] + i_289_;
							int i_332_ = i_330_ & i_316_;
							int i_333_ = i_331_ & i_316_;
							int i_334_ = i_330_ >> class161.anInt1753 * 1252000143;
							int i_335_ = i_331_ >> class161.anInt1753 * 1252000143;
							if (i_334_ >= 0 && i_334_ < class161.anInt1750 * 1210322533 - 1 && i_335_ >= 0 && (i_335_ < class161.anInt1751 * -533476177 - 1)) {
								int i_336_ = (((is[i_334_][i_335_] * (class161.anInt1752 * 1048375491 - i_332_)) + is[i_334_ + 1][i_335_] * i_332_) >> class161.anInt1753 * 1252000143);
								int i_337_ = (((is[i_334_][i_335_ + 1] * (class161.anInt1752 * 1048375491 - i_332_)) + is[i_334_ + 1][i_335_ + 1] * i_332_) >> class161.anInt1753 * 1252000143);
								int i_338_ = ((i_336_ * (class161.anInt1752 * 1048375491 - i_333_)) + i_337_ * i_333_ >> class161.anInt1753 * 1252000143);
								anIntArray9184[i_328_] = (anIntArray9184[i_328_] + ((i_338_ - i_288_) * (i_285_ - i_329_) / i_285_));
							}
						} else
							anIntArray9184[i_328_] = anIntArray9184[i_328_];
					}
				} else if (i == 3) {
					int i_339_ = (i_285_ & 0xff) * 16;
					int i_340_ = (i_285_ >> 8 & 0xff) * 16;
					int i_341_ = (i_285_ >> 16 & 0xff) << 6;
					int i_342_ = (i_285_ >> 24 & 0xff) << 6;
					if (i_287_ - (i_339_ >> 1) < 0 || ((i_287_ + (i_339_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1750 * 1210322533 << class161.anInt1753 * 1252000143)) || i_289_ - (i_340_ >> 1) < 0 || ((i_289_ + (i_340_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1751 * -533476177 << class161.anInt1753 * 1252000143)))
						return;
					method2962(class161, i_287_, i_288_, i_289_, i_339_, i_340_, i_341_, i_342_);
				} else if (i == 4) {
					int i_343_ = class161_286_.anInt1752 * 1048375491 - 1;
					int i_344_ = aShort9237 - aShort9223;
					for (int i_345_ = 0; i_345_ < anInt9231; i_345_++) {
						int i_346_ = anIntArray9191[i_345_] + i_287_;
						int i_347_ = anIntArray9161[i_345_] + i_289_;
						int i_348_ = i_346_ & i_343_;
						int i_349_ = i_347_ & i_343_;
						int i_350_ = i_346_ >> class161_286_.anInt1753 * 1252000143;
						int i_351_ = i_347_ >> class161_286_.anInt1753 * 1252000143;
						int i_352_ = (((is_294_[i_350_][i_351_] * (class161_286_.anInt1752 * 1048375491 - i_348_)) + is_294_[i_350_ + 1][i_351_] * i_348_) >> class161_286_.anInt1753 * 1252000143);
						int i_353_ = (((is_294_[i_350_][i_351_ + 1] * (class161_286_.anInt1752 * 1048375491 - i_348_)) + is_294_[i_350_ + 1][i_351_ + 1] * i_348_) >> class161_286_.anInt1753 * 1252000143);
						int i_354_ = (i_352_ * (class161_286_.anInt1752 * 1048375491 - i_349_) + i_353_ * i_349_ >> class161_286_.anInt1753 * 1252000143);
						anIntArray9184[i_345_] = (anIntArray9184[i_345_] + (i_354_ - i_288_) + i_344_);
					}
					for (int i_355_ = anInt9231; i_355_ < anInt9177; i_355_++) {
						int i_356_ = anIntArray9191[i_355_] + i_287_;
						int i_357_ = anIntArray9161[i_355_] + i_289_;
						int i_358_ = i_356_ & i_343_;
						int i_359_ = i_357_ & i_343_;
						int i_360_ = i_356_ >> class161_286_.anInt1753 * 1252000143;
						int i_361_ = i_357_ >> class161_286_.anInt1753 * 1252000143;
						if (i_360_ >= 0 && (i_360_ < class161_286_.anInt1750 * 1210322533 - 1) && i_361_ >= 0 && (i_361_ < class161_286_.anInt1751 * -533476177 - 1)) {
							int i_362_ = (((is_294_[i_360_][i_361_] * (class161_286_.anInt1752 * 1048375491 - i_358_)) + is_294_[i_360_ + 1][i_361_] * i_358_) >> class161_286_.anInt1753 * 1252000143);
							int i_363_ = (((is_294_[i_360_][i_361_ + 1] * (class161_286_.anInt1752 * 1048375491 - i_358_)) + is_294_[i_360_ + 1][i_361_ + 1] * i_358_) >> class161_286_.anInt1753 * 1252000143);
							int i_364_ = ((i_362_ * (class161_286_.anInt1752 * 1048375491 - i_359_)) + i_363_ * i_359_ >> class161_286_.anInt1753 * 1252000143);
							anIntArray9184[i_355_] = (anIntArray9184[i_355_] + (i_364_ - i_288_) + i_344_);
						}
					}
				} else if (i == 5) {
					int i_365_ = class161_286_.anInt1752 * 1048375491 - 1;
					int i_366_ = aShort9237 - aShort9223;
					for (int i_367_ = 0; i_367_ < anInt9231; i_367_++) {
						int i_368_ = anIntArray9191[i_367_] + i_287_;
						int i_369_ = anIntArray9161[i_367_] + i_289_;
						int i_370_ = i_368_ & i_365_;
						int i_371_ = i_369_ & i_365_;
						int i_372_ = i_368_ >> class161.anInt1753 * 1252000143;
						int i_373_ = i_369_ >> class161.anInt1753 * 1252000143;
						int i_374_ = (((is[i_372_][i_373_] * (class161.anInt1752 * 1048375491 - i_370_)) + is[i_372_ + 1][i_373_] * i_370_) >> class161.anInt1753 * 1252000143);
						int i_375_ = (((is[i_372_][i_373_ + 1] * (class161.anInt1752 * 1048375491 - i_370_)) + is[i_372_ + 1][i_373_ + 1] * i_370_) >> class161.anInt1753 * 1252000143);
						int i_376_ = (i_374_ * (class161.anInt1752 * 1048375491 - i_371_) + i_375_ * i_371_ >> class161.anInt1753 * 1252000143);
						i_374_ = (((is_294_[i_372_][i_373_] * (class161_286_.anInt1752 * 1048375491 - i_370_)) + is_294_[i_372_ + 1][i_373_] * i_370_) >> class161_286_.anInt1753 * 1252000143);
						i_375_ = (((is_294_[i_372_][i_373_ + 1] * (class161_286_.anInt1752 * 1048375491 - i_370_)) + is_294_[i_372_ + 1][i_373_ + 1] * i_370_) >> class161_286_.anInt1753 * 1252000143);
						int i_377_ = (i_374_ * (class161_286_.anInt1752 * 1048375491 - i_371_) + i_375_ * i_371_ >> class161_286_.anInt1753 * 1252000143);
						int i_378_ = i_376_ - i_377_ - i_285_;
						anIntArray9184[i_367_] = ((anIntArray9184[i_367_] << 8) / i_366_ * i_378_ >> 8) - (i_288_ - i_376_);
					}
					for (int i_379_ = anInt9231; i_379_ < anInt9177; i_379_++) {
						int i_380_ = anIntArray9191[i_379_] + i_287_;
						int i_381_ = anIntArray9161[i_379_] + i_289_;
						int i_382_ = i_380_ & i_365_;
						int i_383_ = i_381_ & i_365_;
						int i_384_ = i_380_ >> class161.anInt1753 * 1252000143;
						int i_385_ = i_381_ >> class161.anInt1753 * 1252000143;
						if (i_384_ >= 0 && i_384_ < class161.anInt1750 * 1210322533 - 1 && (i_384_ < class161_286_.anInt1750 * 1210322533 - 1) && i_385_ >= 0 && i_385_ < class161.anInt1751 * -533476177 - 1 && (i_385_ < class161_286_.anInt1751 * -533476177 - 1)) {
							int i_386_ = (((is[i_384_][i_385_] * (class161.anInt1752 * 1048375491 - i_382_)) + is[i_384_ + 1][i_385_] * i_382_) >> class161.anInt1753 * 1252000143);
							int i_387_ = (((is[i_384_][i_385_ + 1] * (class161.anInt1752 * 1048375491 - i_382_)) + is[i_384_ + 1][i_385_ + 1] * i_382_) >> class161.anInt1753 * 1252000143);
							int i_388_ = (i_386_ * (class161.anInt1752 * 1048375491 - i_383_) + i_387_ * i_383_ >> class161.anInt1753 * 1252000143);
							i_386_ = (((is_294_[i_384_][i_385_] * (class161_286_.anInt1752 * 1048375491 - i_382_)) + is_294_[i_384_ + 1][i_385_] * i_382_) >> class161_286_.anInt1753 * 1252000143);
							i_387_ = (((is_294_[i_384_][i_385_ + 1] * (class161_286_.anInt1752 * 1048375491 - i_382_)) + is_294_[i_384_ + 1][i_385_ + 1] * i_382_) >> class161_286_.anInt1753 * 1252000143);
							int i_389_ = ((i_386_ * (class161_286_.anInt1752 * 1048375491 - i_383_)) + i_387_ * i_383_ >> class161_286_.anInt1753 * 1252000143);
							int i_390_ = i_388_ - i_389_ - i_285_;
							anIntArray9184[i_379_] = (((anIntArray9184[i_379_] << 8) / i_366_ * i_390_) >> 8) - (i_288_ - i_388_);
						}
					}
				}
				aBool9221 = false;
			}
		}
	}

	public void method3015(int i, int i_391_, int i_392_) {
		if (i != 0 && (anInt9174 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_391_ != 0 && (anInt9174 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_392_ != 0 && (anInt9174 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_393_ = 0; i_393_ < anInt9177; i_393_++) {
				anIntArray9191[i_393_] += i;
				anIntArray9184[i_393_] += i_391_;
				anIntArray9161[i_393_] += i_392_;
			}
		}
	}

	public void method2864() {
		if ((anInt9174 & 0x10) != 16)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i = 0; i < anInt9177; i++)
				anIntArray9161[i] = -anIntArray9161[i];
			if (aClass114Array9236 != null) {
				for (int i = 0; i < anInt9231; i++) {
					if (aClass114Array9236[i] != null)
						aClass114Array9236[i].anInt1410 = -aClass114Array9236[i].anInt1410;
				}
			}
			if (aClass114Array9203 != null) {
				for (int i = 0; i < anInt9231; i++) {
					if (aClass114Array9203[i] != null)
						aClass114Array9203[i].anInt1410 = -aClass114Array9203[i].anInt1410;
				}
			}
			if (aClass113Array9199 != null) {
				for (int i = 0; i < anInt9185; i++) {
					if (aClass113Array9199[i] != null)
						aClass113Array9199[i].anInt1409 = -aClass113Array9199[i].anInt1409;
				}
			}
			short[] is = aShortArray9187;
			aShortArray9187 = aShortArray9189;
			aShortArray9189 = is;
			if (aFloatArrayArray9190 != null) {
				for (int i = 0; i < anInt9185; i++) {
					if (aFloatArrayArray9190[i] != null) {
						float f = aFloatArrayArray9190[i][0];
						aFloatArrayArray9190[i][0] = aFloatArrayArray9190[i][2];
						aFloatArrayArray9190[i][2] = f;
					}
					if (aFloatArrayArray9235[i] != null) {
						float f = aFloatArrayArray9235[i][0];
						aFloatArrayArray9235[i][0] = aFloatArrayArray9235[i][2];
						aFloatArrayArray9235[i][2] = f;
					}
				}
			}
			aBool9221 = false;
			anInt9246 = 0;
		}
	}

	public void method2872(int i, int i_394_, int i_395_) {
		if (i != 128 && (anInt9174 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_394_ != 128 && (anInt9174 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_395_ != 128 && (anInt9174 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_396_ = 0; i_396_ < anInt9177; i_396_++) {
				anIntArray9191[i_396_] = anIntArray9191[i_396_] * i >> 7;
				anIntArray9184[i_396_] = anIntArray9184[i_396_] * i_394_ >> 7;
				anIntArray9161[i_396_] = anIntArray9161[i_396_] * i_395_ >> 7;
			}
			aBool9221 = false;
		}
	}

	void method14644() {
		synchronized (this) {
			for (int i = 0; i < anInt9177; i++) {
				anIntArray9191[i] = -anIntArray9191[i];
				anIntArray9161[i] = -anIntArray9161[i];
			}
			method14645();
		}
	}

	void method14645() {
		aClass114Array9236 = null;
		aClass114Array9203 = null;
		aClass113Array9199 = null;
		aBool9221 = false;
	}

	final void method14646(boolean bool, boolean bool_397_, boolean bool_398_, int i) {
		boolean bool_399_ = false;
		if (aShortArray9162 != null && aShortArray9162[i] != -1)
			bool_399_ = (aClass180_Sub1_9171.aClass181_2059.method3544(aShortArray9162[i] & 0xffff, (byte) -99).aBool1761);
		if (!aClass101_9163.aBool1196) {
			short i_400_ = aShortArray9187[i];
			short i_401_ = aShortArray9188[i];
			short i_402_ = aShortArray9189[i];
			Class427 class427 = aClass180_Sub1_9171.aClass427_9402;
			float f = class427.aFloatArray4807[10];
			float f_403_ = class427.aFloatArray4807[14];
			float f_404_ = class427.aFloatArray4807[11];
			float f_405_ = class427.aFloatArray4807[15];
			float f_406_ = f_403_ * f_404_ - f * f_405_;
			float f_407_ = ((aFloatArray9238[i_400_] - aClass101_9163.aFloat1222) * aClass101_9163.aFloat1223);
			float f_408_ = ((aFloatArray9238[i_401_] - aClass101_9163.aFloat1222) * aClass101_9163.aFloat1223);
			float f_409_ = ((aFloatArray9238[i_402_] - aClass101_9163.aFloat1222) * aClass101_9163.aFloat1223);
			float f_410_ = f_407_ * f_406_ / (f_407_ * f_404_ - f);
			float f_411_ = f_408_ * f_406_ / (f_408_ * f_404_ - f);
			float f_412_ = f_409_ * f_406_ / (f_409_ * f_404_ - f);
			float f_413_ = ((f_410_ - aClass101_9163.aFloat1192) / aClass101_9163.aFloat1193);
			if (f_413_ > 1.0F)
				f_413_ = 1.0F;
			else if (f_413_ < 0.0F)
				f_413_ = 0.0F;
			float f_414_ = ((f_411_ - aClass101_9163.aFloat1192) / aClass101_9163.aFloat1193);
			if (f_414_ > 1.0F)
				f_414_ = 1.0F;
			else if (f_414_ < 0.0F)
				f_414_ = 0.0F;
			float f_415_ = ((f_412_ - aClass101_9163.aFloat1192) / aClass101_9163.aFloat1193);
			if (f_415_ > 1.0F)
				f_415_ = 1.0F;
			else if (f_415_ < 0.0F)
				f_415_ = 0.0F;
			float f_416_ = f_413_ + f_414_ + f_415_;
			if (!(f_416_ >= 3.0F)) {
				if (f_416_ <= 0.0F)
					method14652(bool, bool_397_, bool_398_, i);
				else {
					if (aByteArray9202 == null)
						aClass119_9165.anInt1441 = 0;
					else
						aClass119_9165.anInt1441 = aByteArray9202[i] & 0xff;
					if (!bool_399_) {
						if (anIntArray9194[i] == -1)
							aClass119_9165.method2106(bool, bool_397_, bool_398_, aFloatArray9198[i_400_], aFloatArray9198[i_401_], aFloatArray9198[i_402_], aFloatArray9167[i_400_], aFloatArray9167[i_401_], aFloatArray9167[i_402_], aFloatArray9238[i_400_], aFloatArray9238[i_401_], aFloatArray9238[i_402_], Class388.method6456((Class656.anIntArray8393[(anIntArray9192[i] & 0xffff)]), (aClass101_9163.anInt1194 * -1009384223), f_413_ * 255.0F, (byte) 42),
									Class388.method6456((Class656.anIntArray8393[(anIntArray9192[i] & 0xffff)]), (aClass101_9163.anInt1194 * -1009384223), f_414_ * 255.0F, (byte) -42), Class388.method6456((Class656.anIntArray8393[(anIntArray9192[i] & 0xffff)]), (aClass101_9163.anInt1194 * -1009384223), f_415_ * 255.0F, (byte) -74));
						else
							aClass119_9165.method2106(bool, bool_397_, bool_398_, aFloatArray9198[i_400_], aFloatArray9198[i_401_], aFloatArray9198[i_402_], aFloatArray9167[i_400_], aFloatArray9167[i_401_], aFloatArray9167[i_402_], aFloatArray9238[i_400_], aFloatArray9238[i_401_], aFloatArray9238[i_402_], Class388.method6456((Class656.anIntArray8393[(anIntArray9192[i] & 0xffff)]), (aClass101_9163.anInt1194 * -1009384223), f_413_ * 255.0F, (byte) 81),
									Class388.method6456((Class656.anIntArray8393[(anIntArray9180[i] & 0xffff)]), (aClass101_9163.anInt1194 * -1009384223), f_414_ * 255.0F, (byte) -53), Class388.method6456((Class656.anIntArray8393[(anIntArray9194[i] & 0xffff)]), (aClass101_9163.anInt1194 * -1009384223), f_415_ * 255.0F, (byte) 44));
					} else {
						int i_417_ = -16777216;
						if (aByteArray9202 != null)
							i_417_ = 255 - (aByteArray9202[i] & 0xff) << 24;
						if (anIntArray9194[i] == -1) {
							int i_418_ = i_417_ | anIntArray9192[i] & 0xffffff;
							aClass119_9165.method2079(bool, bool_397_, bool_398_, aFloatArray9198[i_400_], aFloatArray9198[i_401_], aFloatArray9198[i_402_], aFloatArray9167[i_400_], aFloatArray9167[i_401_], aFloatArray9167[i_402_], aFloatArray9238[i_400_], aFloatArray9238[i_401_], aFloatArray9238[i_402_], aFloatArray9239[i_400_], aFloatArray9239[i_401_], aFloatArray9239[i_402_], aFloatArrayArray9190[i][0], aFloatArrayArray9190[i][1], aFloatArrayArray9190[i][2], aFloatArrayArray9235[i][0],
									aFloatArrayArray9235[i][1], aFloatArrayArray9235[i][2], i_418_, i_418_, i_418_, aClass101_9163.anInt1194 * -1009384223, f_413_ * 255.0F, f_414_ * 255.0F, f_415_ * 255.0F, aShortArray9162[i] & 0xffff);
						} else
							aClass119_9165.method2079(bool, bool_397_, bool_398_, aFloatArray9198[i_400_], aFloatArray9198[i_401_], aFloatArray9198[i_402_], aFloatArray9167[i_400_], aFloatArray9167[i_401_], aFloatArray9167[i_402_], aFloatArray9238[i_400_], aFloatArray9238[i_401_], aFloatArray9238[i_402_], aFloatArray9239[i_400_], aFloatArray9239[i_401_], aFloatArray9239[i_402_], aFloatArrayArray9190[i][0], aFloatArrayArray9190[i][1], aFloatArrayArray9190[i][2], aFloatArrayArray9235[i][0],
									aFloatArrayArray9235[i][1], aFloatArrayArray9235[i][2], i_417_ | anIntArray9192[i] & 0xffffff, i_417_ | anIntArray9180[i] & 0xffffff, i_417_ | anIntArray9194[i] & 0xffffff, aClass101_9163.anInt1194 * -1009384223, f_413_ * 255.0F, f_414_ * 255.0F, f_415_ * 255.0F, aShortArray9162[i] & 0xffff);
					}
				}
			}
		} else {
			short i_419_ = aShortArray9187[i];
			short i_420_ = aShortArray9188[i];
			short i_421_ = aShortArray9189[i];
			float f = 0.0F;
			float f_422_ = 0.0F;
			float f_423_ = 0.0F;
			if (anIntArray9230[i_419_] > aClass101_9163.anInt1198 * 1247682779)
				f = 1.0F;
			else if (anIntArray9230[i_419_] > aClass101_9163.anInt1205 * -1275882393)
				f = ((float) (aClass101_9163.anInt1205 * -1275882393 - anIntArray9230[i_419_]) * 1.0F / (float) (aClass101_9163.anInt1205 * -1275882393 - aClass101_9163.anInt1198 * 1247682779));
			if (anIntArray9230[i_420_] > aClass101_9163.anInt1198 * 1247682779)
				f_422_ = 1.0F;
			else if (anIntArray9230[i_420_] > aClass101_9163.anInt1205 * -1275882393)
				f_422_ = ((float) (aClass101_9163.anInt1205 * -1275882393 - anIntArray9230[i_420_]) * 1.0F / (float) (aClass101_9163.anInt1205 * -1275882393 - aClass101_9163.anInt1198 * 1247682779));
			if (anIntArray9230[i_421_] > aClass101_9163.anInt1198 * 1247682779)
				f_423_ = 1.0F;
			else if (anIntArray9230[i_421_] > aClass101_9163.anInt1205 * -1275882393)
				f_423_ = ((float) (aClass101_9163.anInt1205 * -1275882393 - anIntArray9230[i_421_]) * 1.0F / (float) (aClass101_9163.anInt1205 * -1275882393 - aClass101_9163.anInt1198 * 1247682779));
			if (aByteArray9202 == null)
				aClass119_9165.anInt1441 = 0;
			else
				aClass119_9165.anInt1441 = aByteArray9202[i] & 0xff;
			if (!bool_399_) {
				if (anIntArray9194[i] == -1)
					aClass119_9165.method2106(bool, bool_397_, bool_398_, aFloatArray9198[i_419_], aFloatArray9198[i_420_], aFloatArray9198[i_421_], aFloatArray9167[i_419_], aFloatArray9167[i_420_], aFloatArray9167[i_421_], aFloatArray9238[i_419_], aFloatArray9238[i_420_], aFloatArray9238[i_421_], Class388.method6456((Class656.anIntArray8393[anIntArray9192[i] & 0xffff]), (aClass101_9163.anInt1194 * -1009384223), f * 255.0F, (byte) -29),
							Class388.method6456((Class656.anIntArray8393[anIntArray9192[i] & 0xffff]), (aClass101_9163.anInt1194 * -1009384223), f_422_ * 255.0F, (byte) -25), Class388.method6456((Class656.anIntArray8393[anIntArray9192[i] & 0xffff]), (aClass101_9163.anInt1194 * -1009384223), f_423_ * 255.0F, (byte) 5));
				else
					aClass119_9165.method2106(bool, bool_397_, bool_398_, aFloatArray9198[i_419_], aFloatArray9198[i_420_], aFloatArray9198[i_421_], aFloatArray9167[i_419_], aFloatArray9167[i_420_], aFloatArray9167[i_421_], aFloatArray9238[i_419_], aFloatArray9238[i_420_], aFloatArray9238[i_421_], Class388.method6456((Class656.anIntArray8393[anIntArray9192[i] & 0xffff]), (aClass101_9163.anInt1194 * -1009384223), f * 255.0F, (byte) 79),
							Class388.method6456((Class656.anIntArray8393[anIntArray9180[i] & 0xffff]), (aClass101_9163.anInt1194 * -1009384223), f_422_ * 255.0F, (byte) 11), Class388.method6456((Class656.anIntArray8393[anIntArray9194[i] & 0xffff]), (aClass101_9163.anInt1194 * -1009384223), f_423_ * 255.0F, (byte) -66));
			} else {
				int i_424_ = -16777216;
				if (aByteArray9202 != null)
					i_424_ = 255 - (aByteArray9202[i] & 0xff) << 24;
				if (anIntArray9194[i] == -1) {
					int i_425_ = i_424_ | anIntArray9192[i] & 0xffffff;
					aClass119_9165.method2079(bool, bool_397_, bool_398_, aFloatArray9198[i_419_], aFloatArray9198[i_420_], aFloatArray9198[i_421_], aFloatArray9167[i_419_], aFloatArray9167[i_420_], aFloatArray9167[i_421_], aFloatArray9238[i_419_], aFloatArray9238[i_420_], aFloatArray9238[i_421_], aFloatArray9239[i_419_], aFloatArray9239[i_420_], aFloatArray9239[i_421_], aFloatArrayArray9190[i][0], aFloatArrayArray9190[i][1], aFloatArrayArray9190[i][2], aFloatArrayArray9235[i][0],
							aFloatArrayArray9235[i][1], aFloatArrayArray9235[i][2], i_425_, i_425_, i_425_, aClass101_9163.anInt1194 * -1009384223, f * 255.0F, f_422_ * 255.0F, f_423_ * 255.0F, aShortArray9162[i] & 0xffff);
				} else
					aClass119_9165.method2079(bool, bool_397_, bool_398_, aFloatArray9198[i_419_], aFloatArray9198[i_420_], aFloatArray9198[i_421_], aFloatArray9167[i_419_], aFloatArray9167[i_420_], aFloatArray9167[i_421_], aFloatArray9238[i_419_], aFloatArray9238[i_420_], aFloatArray9238[i_421_], aFloatArray9239[i_419_], aFloatArray9239[i_420_], aFloatArray9239[i_421_], aFloatArrayArray9190[i][0], aFloatArrayArray9190[i][1], aFloatArrayArray9190[i][2], aFloatArrayArray9235[i][0],
							aFloatArrayArray9235[i][1], aFloatArrayArray9235[i][2], i_424_ | anIntArray9192[i] & 0xffffff, i_424_ | anIntArray9180[i] & 0xffffff, i_424_ | anIntArray9194[i] & 0xffffff, aClass101_9163.anInt1194 * -1009384223, f * 255.0F, f_422_ * 255.0F, f_423_ * 255.0F, aShortArray9162[i] & 0xffff);
			}
		}
	}

	void method14647() {
		synchronized (this) {
			for (int i = 0; i < anInt9177; i++) {
				int i_426_ = anIntArray9161[i];
				anIntArray9161[i] = anIntArray9191[i];
				anIntArray9191[i] = -i_426_;
			}
			method14645();
		}
	}

	boolean method2883() {
		if (anIntArrayArray9178 == null)
			return false;
		anInt9247 = 0;
		anInt9212 = 0;
		anInt9224 = 0;
		return true;
	}

	public void method2873(int i, int i_427_, Class161 class161, Class161 class161_428_, int i_429_, int i_430_, int i_431_) {
		if (i == 3) {
			if ((anInt9174 & 0x7) != 7)
				throw new IllegalStateException();
		} else if ((anInt9174 & 0x2) != 2)
			throw new IllegalStateException();
		if (!aBool9221)
			method14659();
		int i_432_ = i_429_ + aShort9226;
		int i_433_ = i_429_ + aShort9173;
		int i_434_ = i_431_ + aShort9228;
		int i_435_ = i_431_ + aShort9229;
		if (i == 4 || (i_432_ >= 0 && ((i_433_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1750 * 1210322533) && i_434_ >= 0 && ((i_435_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1751 * -533476177))) {
			int[][] is = class161.anIntArrayArray1754;
			int[][] is_436_ = null;
			if (class161_428_ != null)
				is_436_ = class161_428_.anIntArrayArray1754;
			if (i == 4 || i == 5) {
				if (class161_428_ == null || (i_432_ < 0 || ((i_433_ + class161_428_.anInt1752 * 1048375491 >> class161_428_.anInt1753 * 1252000143) >= class161_428_.anInt1750 * 1210322533) || i_434_ < 0 || ((i_435_ + class161_428_.anInt1752 * 1048375491 >> class161_428_.anInt1753 * 1252000143) >= class161_428_.anInt1751 * -533476177)))
					return;
			} else {
				i_432_ >>= class161.anInt1753 * 1252000143;
				i_433_ = (i_433_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				i_434_ >>= class161.anInt1753 * 1252000143;
				i_435_ = (i_435_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				if (is[i_432_][i_434_] == i_430_ && is[i_433_][i_434_] == i_430_ && is[i_432_][i_435_] == i_430_ && is[i_433_][i_435_] == i_430_)
					return;
			}
			synchronized (this) {
				if (i == 1) {
					int i_437_ = class161.anInt1752 * 1048375491 - 1;
					for (int i_438_ = 0; i_438_ < anInt9231; i_438_++) {
						int i_439_ = anIntArray9191[i_438_] + i_429_;
						int i_440_ = anIntArray9161[i_438_] + i_431_;
						int i_441_ = i_439_ & i_437_;
						int i_442_ = i_440_ & i_437_;
						int i_443_ = i_439_ >> class161.anInt1753 * 1252000143;
						int i_444_ = i_440_ >> class161.anInt1753 * 1252000143;
						int i_445_ = (((is[i_443_][i_444_] * (class161.anInt1752 * 1048375491 - i_441_)) + is[i_443_ + 1][i_444_] * i_441_) >> class161.anInt1753 * 1252000143);
						int i_446_ = (((is[i_443_][i_444_ + 1] * (class161.anInt1752 * 1048375491 - i_441_)) + is[i_443_ + 1][i_444_ + 1] * i_441_) >> class161.anInt1753 * 1252000143);
						int i_447_ = (i_445_ * (class161.anInt1752 * 1048375491 - i_442_) + i_446_ * i_442_ >> class161.anInt1753 * 1252000143);
						anIntArray9184[i_438_] = anIntArray9184[i_438_] + i_447_ - i_430_;
					}
					for (int i_448_ = anInt9231; i_448_ < anInt9177; i_448_++) {
						int i_449_ = anIntArray9191[i_448_] + i_429_;
						int i_450_ = anIntArray9161[i_448_] + i_431_;
						int i_451_ = i_449_ & i_437_;
						int i_452_ = i_450_ & i_437_;
						int i_453_ = i_449_ >> class161.anInt1753 * 1252000143;
						int i_454_ = i_450_ >> class161.anInt1753 * 1252000143;
						if (i_453_ >= 0 && i_453_ < is.length - 1 && i_454_ >= 0 && i_454_ < is[0].length - 1) {
							int i_455_ = (((is[i_453_][i_454_] * (class161.anInt1752 * 1048375491 - i_451_)) + is[i_453_ + 1][i_454_] * i_451_) >> class161.anInt1753 * 1252000143);
							int i_456_ = (((is[i_453_][i_454_ + 1] * (class161.anInt1752 * 1048375491 - i_451_)) + is[i_453_ + 1][i_454_ + 1] * i_451_) >> class161.anInt1753 * 1252000143);
							int i_457_ = (i_455_ * (class161.anInt1752 * 1048375491 - i_452_) + i_456_ * i_452_ >> class161.anInt1753 * 1252000143);
							anIntArray9184[i_448_] = anIntArray9184[i_448_] + i_457_ - i_430_;
						}
					}
				} else if (i == 2) {
					if (aShort9223 == 0)
						return;
					int i_458_ = class161.anInt1752 * 1048375491 - 1;
					for (int i_459_ = 0; i_459_ < anInt9231; i_459_++) {
						int i_460_ = (anIntArray9184[i_459_] << 16) / aShort9223;
						if (i_460_ < i_427_) {
							int i_461_ = anIntArray9191[i_459_] + i_429_;
							int i_462_ = anIntArray9161[i_459_] + i_431_;
							int i_463_ = i_461_ & i_458_;
							int i_464_ = i_462_ & i_458_;
							int i_465_ = i_461_ >> class161.anInt1753 * 1252000143;
							int i_466_ = i_462_ >> class161.anInt1753 * 1252000143;
							int i_467_ = (((is[i_465_][i_466_] * (class161.anInt1752 * 1048375491 - i_463_)) + is[i_465_ + 1][i_466_] * i_463_) >> class161.anInt1753 * 1252000143);
							int i_468_ = (((is[i_465_][i_466_ + 1] * (class161.anInt1752 * 1048375491 - i_463_)) + is[i_465_ + 1][i_466_ + 1] * i_463_) >> class161.anInt1753 * 1252000143);
							int i_469_ = (i_467_ * (class161.anInt1752 * 1048375491 - i_464_) + i_468_ * i_464_ >> class161.anInt1753 * 1252000143);
							anIntArray9184[i_459_] = anIntArray9184[i_459_] + ((i_469_ - i_430_) * (i_427_ - i_460_) / i_427_);
						} else
							anIntArray9184[i_459_] = anIntArray9184[i_459_];
					}
					for (int i_470_ = anInt9231; i_470_ < anInt9177; i_470_++) {
						int i_471_ = (anIntArray9184[i_470_] << 16) / aShort9223;
						if (i_471_ < i_427_) {
							int i_472_ = anIntArray9191[i_470_] + i_429_;
							int i_473_ = anIntArray9161[i_470_] + i_431_;
							int i_474_ = i_472_ & i_458_;
							int i_475_ = i_473_ & i_458_;
							int i_476_ = i_472_ >> class161.anInt1753 * 1252000143;
							int i_477_ = i_473_ >> class161.anInt1753 * 1252000143;
							if (i_476_ >= 0 && i_476_ < class161.anInt1750 * 1210322533 - 1 && i_477_ >= 0 && (i_477_ < class161.anInt1751 * -533476177 - 1)) {
								int i_478_ = (((is[i_476_][i_477_] * (class161.anInt1752 * 1048375491 - i_474_)) + is[i_476_ + 1][i_477_] * i_474_) >> class161.anInt1753 * 1252000143);
								int i_479_ = (((is[i_476_][i_477_ + 1] * (class161.anInt1752 * 1048375491 - i_474_)) + is[i_476_ + 1][i_477_ + 1] * i_474_) >> class161.anInt1753 * 1252000143);
								int i_480_ = ((i_478_ * (class161.anInt1752 * 1048375491 - i_475_)) + i_479_ * i_475_ >> class161.anInt1753 * 1252000143);
								anIntArray9184[i_470_] = (anIntArray9184[i_470_] + ((i_480_ - i_430_) * (i_427_ - i_471_) / i_427_));
							}
						} else
							anIntArray9184[i_470_] = anIntArray9184[i_470_];
					}
				} else if (i == 3) {
					int i_481_ = (i_427_ & 0xff) * 16;
					int i_482_ = (i_427_ >> 8 & 0xff) * 16;
					int i_483_ = (i_427_ >> 16 & 0xff) << 6;
					int i_484_ = (i_427_ >> 24 & 0xff) << 6;
					if (i_429_ - (i_481_ >> 1) < 0 || ((i_429_ + (i_481_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1750 * 1210322533 << class161.anInt1753 * 1252000143)) || i_431_ - (i_482_ >> 1) < 0 || ((i_431_ + (i_482_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1751 * -533476177 << class161.anInt1753 * 1252000143)))
						return;
					method2962(class161, i_429_, i_430_, i_431_, i_481_, i_482_, i_483_, i_484_);
				} else if (i == 4) {
					int i_485_ = class161_428_.anInt1752 * 1048375491 - 1;
					int i_486_ = aShort9237 - aShort9223;
					for (int i_487_ = 0; i_487_ < anInt9231; i_487_++) {
						int i_488_ = anIntArray9191[i_487_] + i_429_;
						int i_489_ = anIntArray9161[i_487_] + i_431_;
						int i_490_ = i_488_ & i_485_;
						int i_491_ = i_489_ & i_485_;
						int i_492_ = i_488_ >> class161_428_.anInt1753 * 1252000143;
						int i_493_ = i_489_ >> class161_428_.anInt1753 * 1252000143;
						int i_494_ = (((is_436_[i_492_][i_493_] * (class161_428_.anInt1752 * 1048375491 - i_490_)) + is_436_[i_492_ + 1][i_493_] * i_490_) >> class161_428_.anInt1753 * 1252000143);
						int i_495_ = (((is_436_[i_492_][i_493_ + 1] * (class161_428_.anInt1752 * 1048375491 - i_490_)) + is_436_[i_492_ + 1][i_493_ + 1] * i_490_) >> class161_428_.anInt1753 * 1252000143);
						int i_496_ = (i_494_ * (class161_428_.anInt1752 * 1048375491 - i_491_) + i_495_ * i_491_ >> class161_428_.anInt1753 * 1252000143);
						anIntArray9184[i_487_] = (anIntArray9184[i_487_] + (i_496_ - i_430_) + i_486_);
					}
					for (int i_497_ = anInt9231; i_497_ < anInt9177; i_497_++) {
						int i_498_ = anIntArray9191[i_497_] + i_429_;
						int i_499_ = anIntArray9161[i_497_] + i_431_;
						int i_500_ = i_498_ & i_485_;
						int i_501_ = i_499_ & i_485_;
						int i_502_ = i_498_ >> class161_428_.anInt1753 * 1252000143;
						int i_503_ = i_499_ >> class161_428_.anInt1753 * 1252000143;
						if (i_502_ >= 0 && (i_502_ < class161_428_.anInt1750 * 1210322533 - 1) && i_503_ >= 0 && (i_503_ < class161_428_.anInt1751 * -533476177 - 1)) {
							int i_504_ = (((is_436_[i_502_][i_503_] * (class161_428_.anInt1752 * 1048375491 - i_500_)) + is_436_[i_502_ + 1][i_503_] * i_500_) >> class161_428_.anInt1753 * 1252000143);
							int i_505_ = (((is_436_[i_502_][i_503_ + 1] * (class161_428_.anInt1752 * 1048375491 - i_500_)) + is_436_[i_502_ + 1][i_503_ + 1] * i_500_) >> class161_428_.anInt1753 * 1252000143);
							int i_506_ = ((i_504_ * (class161_428_.anInt1752 * 1048375491 - i_501_)) + i_505_ * i_501_ >> class161_428_.anInt1753 * 1252000143);
							anIntArray9184[i_497_] = (anIntArray9184[i_497_] + (i_506_ - i_430_) + i_486_);
						}
					}
				} else if (i == 5) {
					int i_507_ = class161_428_.anInt1752 * 1048375491 - 1;
					int i_508_ = aShort9237 - aShort9223;
					for (int i_509_ = 0; i_509_ < anInt9231; i_509_++) {
						int i_510_ = anIntArray9191[i_509_] + i_429_;
						int i_511_ = anIntArray9161[i_509_] + i_431_;
						int i_512_ = i_510_ & i_507_;
						int i_513_ = i_511_ & i_507_;
						int i_514_ = i_510_ >> class161.anInt1753 * 1252000143;
						int i_515_ = i_511_ >> class161.anInt1753 * 1252000143;
						int i_516_ = (((is[i_514_][i_515_] * (class161.anInt1752 * 1048375491 - i_512_)) + is[i_514_ + 1][i_515_] * i_512_) >> class161.anInt1753 * 1252000143);
						int i_517_ = (((is[i_514_][i_515_ + 1] * (class161.anInt1752 * 1048375491 - i_512_)) + is[i_514_ + 1][i_515_ + 1] * i_512_) >> class161.anInt1753 * 1252000143);
						int i_518_ = (i_516_ * (class161.anInt1752 * 1048375491 - i_513_) + i_517_ * i_513_ >> class161.anInt1753 * 1252000143);
						i_516_ = (((is_436_[i_514_][i_515_] * (class161_428_.anInt1752 * 1048375491 - i_512_)) + is_436_[i_514_ + 1][i_515_] * i_512_) >> class161_428_.anInt1753 * 1252000143);
						i_517_ = (((is_436_[i_514_][i_515_ + 1] * (class161_428_.anInt1752 * 1048375491 - i_512_)) + is_436_[i_514_ + 1][i_515_ + 1] * i_512_) >> class161_428_.anInt1753 * 1252000143);
						int i_519_ = (i_516_ * (class161_428_.anInt1752 * 1048375491 - i_513_) + i_517_ * i_513_ >> class161_428_.anInt1753 * 1252000143);
						int i_520_ = i_518_ - i_519_ - i_427_;
						anIntArray9184[i_509_] = ((anIntArray9184[i_509_] << 8) / i_508_ * i_520_ >> 8) - (i_430_ - i_518_);
					}
					for (int i_521_ = anInt9231; i_521_ < anInt9177; i_521_++) {
						int i_522_ = anIntArray9191[i_521_] + i_429_;
						int i_523_ = anIntArray9161[i_521_] + i_431_;
						int i_524_ = i_522_ & i_507_;
						int i_525_ = i_523_ & i_507_;
						int i_526_ = i_522_ >> class161.anInt1753 * 1252000143;
						int i_527_ = i_523_ >> class161.anInt1753 * 1252000143;
						if (i_526_ >= 0 && i_526_ < class161.anInt1750 * 1210322533 - 1 && (i_526_ < class161_428_.anInt1750 * 1210322533 - 1) && i_527_ >= 0 && i_527_ < class161.anInt1751 * -533476177 - 1 && (i_527_ < class161_428_.anInt1751 * -533476177 - 1)) {
							int i_528_ = (((is[i_526_][i_527_] * (class161.anInt1752 * 1048375491 - i_524_)) + is[i_526_ + 1][i_527_] * i_524_) >> class161.anInt1753 * 1252000143);
							int i_529_ = (((is[i_526_][i_527_ + 1] * (class161.anInt1752 * 1048375491 - i_524_)) + is[i_526_ + 1][i_527_ + 1] * i_524_) >> class161.anInt1753 * 1252000143);
							int i_530_ = (i_528_ * (class161.anInt1752 * 1048375491 - i_525_) + i_529_ * i_525_ >> class161.anInt1753 * 1252000143);
							i_528_ = (((is_436_[i_526_][i_527_] * (class161_428_.anInt1752 * 1048375491 - i_524_)) + is_436_[i_526_ + 1][i_527_] * i_524_) >> class161_428_.anInt1753 * 1252000143);
							i_529_ = (((is_436_[i_526_][i_527_ + 1] * (class161_428_.anInt1752 * 1048375491 - i_524_)) + is_436_[i_526_ + 1][i_527_ + 1] * i_524_) >> class161_428_.anInt1753 * 1252000143);
							int i_531_ = ((i_528_ * (class161_428_.anInt1752 * 1048375491 - i_525_)) + i_529_ * i_525_ >> class161_428_.anInt1753 * 1252000143);
							int i_532_ = i_530_ - i_531_ - i_427_;
							anIntArray9184[i_521_] = (((anIntArray9184[i_521_] << 8) / i_508_ * i_532_) >> 8) - (i_430_ - i_530_);
						}
					}
				}
				aBool9221 = false;
			}
		}
	}

	void method2884(int i, int[] is, int i_533_, int i_534_, int i_535_, int i_536_, boolean bool) {
		int i_537_ = is.length;
		if (i == 0) {
			i_533_ <<= 4;
			i_534_ <<= 4;
			i_535_ <<= 4;
			if (!aBool9210) {
				for (int i_538_ = 0; i_538_ < anInt9177; i_538_++) {
					anIntArray9191[i_538_] <<= 4;
					anIntArray9184[i_538_] <<= 4;
					anIntArray9161[i_538_] <<= 4;
				}
				aBool9210 = true;
			}
			int i_539_ = 0;
			anInt9247 = 0;
			anInt9212 = 0;
			anInt9224 = 0;
			for (int i_540_ = 0; i_540_ < i_537_; i_540_++) {
				int i_541_ = is[i_540_];
				if (i_541_ < anIntArrayArray9178.length) {
					int[] is_542_ = anIntArrayArray9178[i_541_];
					for (int i_543_ = 0; i_543_ < is_542_.length; i_543_++) {
						int i_544_ = is_542_[i_543_];
						anInt9247 += anIntArray9191[i_544_];
						anInt9212 += anIntArray9184[i_544_];
						anInt9224 += anIntArray9161[i_544_];
						i_539_++;
					}
				}
			}
			if (i_539_ > 0) {
				anInt9247 = anInt9247 / i_539_ + i_533_;
				anInt9212 = anInt9212 / i_539_ + i_534_;
				anInt9224 = anInt9224 / i_539_ + i_535_;
			} else {
				anInt9247 = i_533_;
				anInt9212 = i_534_;
				anInt9224 = i_535_;
			}
		} else if (i == 1) {
			i_533_ <<= 4;
			i_534_ <<= 4;
			i_535_ <<= 4;
			if (!aBool9210) {
				for (int i_545_ = 0; i_545_ < anInt9177; i_545_++) {
					anIntArray9191[i_545_] <<= 4;
					anIntArray9184[i_545_] <<= 4;
					anIntArray9161[i_545_] <<= 4;
				}
				aBool9210 = true;
			}
			for (int i_546_ = 0; i_546_ < i_537_; i_546_++) {
				int i_547_ = is[i_546_];
				if (i_547_ < anIntArrayArray9178.length) {
					int[] is_548_ = anIntArrayArray9178[i_547_];
					for (int i_549_ = 0; i_549_ < is_548_.length; i_549_++) {
						int i_550_ = is_548_[i_549_];
						anIntArray9191[i_550_] += i_533_;
						anIntArray9184[i_550_] += i_534_;
						anIntArray9161[i_550_] += i_535_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_551_ = 0; i_551_ < i_537_; i_551_++) {
				int i_552_ = is[i_551_];
				if (i_552_ < anIntArrayArray9178.length) {
					int[] is_553_ = anIntArrayArray9178[i_552_];
					if ((i_536_ & 0x1) == 0) {
						for (int i_554_ = 0; i_554_ < is_553_.length; i_554_++) {
							int i_555_ = is_553_[i_554_];
							anIntArray9191[i_555_] -= anInt9247;
							anIntArray9184[i_555_] -= anInt9212;
							anIntArray9161[i_555_] -= anInt9224;
							if (i_535_ != 0) {
								int i_556_ = Class428.anIntArray4825[i_535_];
								int i_557_ = Class428.anIntArray4819[i_535_];
								int i_558_ = (anIntArray9184[i_555_] * i_556_ + anIntArray9191[i_555_] * i_557_ + 16383) >> 14;
								anIntArray9184[i_555_] = (anIntArray9184[i_555_] * i_557_ - anIntArray9191[i_555_] * i_556_ + 16383) >> 14;
								anIntArray9191[i_555_] = i_558_;
							}
							if (i_533_ != 0) {
								int i_559_ = Class428.anIntArray4825[i_533_];
								int i_560_ = Class428.anIntArray4819[i_533_];
								int i_561_ = (anIntArray9184[i_555_] * i_560_ - anIntArray9161[i_555_] * i_559_ + 16383) >> 14;
								anIntArray9161[i_555_] = (anIntArray9184[i_555_] * i_559_ + anIntArray9161[i_555_] * i_560_ + 16383) >> 14;
								anIntArray9184[i_555_] = i_561_;
							}
							if (i_534_ != 0) {
								int i_562_ = Class428.anIntArray4825[i_534_];
								int i_563_ = Class428.anIntArray4819[i_534_];
								int i_564_ = (anIntArray9161[i_555_] * i_562_ + anIntArray9191[i_555_] * i_563_ + 16383) >> 14;
								anIntArray9161[i_555_] = (anIntArray9161[i_555_] * i_563_ - anIntArray9191[i_555_] * i_562_ + 16383) >> 14;
								anIntArray9191[i_555_] = i_564_;
							}
							anIntArray9191[i_555_] += anInt9247;
							anIntArray9184[i_555_] += anInt9212;
							anIntArray9161[i_555_] += anInt9224;
						}
					} else {
						for (int i_565_ = 0; i_565_ < is_553_.length; i_565_++) {
							int i_566_ = is_553_[i_565_];
							anIntArray9191[i_566_] -= anInt9247;
							anIntArray9184[i_566_] -= anInt9212;
							anIntArray9161[i_566_] -= anInt9224;
							if (i_533_ != 0) {
								int i_567_ = Class428.anIntArray4825[i_533_];
								int i_568_ = Class428.anIntArray4819[i_533_];
								int i_569_ = (anIntArray9184[i_566_] * i_568_ - anIntArray9161[i_566_] * i_567_ + 16383) >> 14;
								anIntArray9161[i_566_] = (anIntArray9184[i_566_] * i_567_ + anIntArray9161[i_566_] * i_568_ + 16383) >> 14;
								anIntArray9184[i_566_] = i_569_;
							}
							if (i_535_ != 0) {
								int i_570_ = Class428.anIntArray4825[i_535_];
								int i_571_ = Class428.anIntArray4819[i_535_];
								int i_572_ = (anIntArray9184[i_566_] * i_570_ + anIntArray9191[i_566_] * i_571_ + 16383) >> 14;
								anIntArray9184[i_566_] = (anIntArray9184[i_566_] * i_571_ - anIntArray9191[i_566_] * i_570_ + 16383) >> 14;
								anIntArray9191[i_566_] = i_572_;
							}
							if (i_534_ != 0) {
								int i_573_ = Class428.anIntArray4825[i_534_];
								int i_574_ = Class428.anIntArray4819[i_534_];
								int i_575_ = (anIntArray9161[i_566_] * i_573_ + anIntArray9191[i_566_] * i_574_ + 16383) >> 14;
								anIntArray9161[i_566_] = (anIntArray9161[i_566_] * i_574_ - anIntArray9191[i_566_] * i_573_ + 16383) >> 14;
								anIntArray9191[i_566_] = i_575_;
							}
							anIntArray9191[i_566_] += anInt9247;
							anIntArray9184[i_566_] += anInt9212;
							anIntArray9161[i_566_] += anInt9224;
						}
					}
				}
			}
		} else if (i == 3) {
			for (int i_576_ = 0; i_576_ < i_537_; i_576_++) {
				int i_577_ = is[i_576_];
				if (i_577_ < anIntArrayArray9178.length) {
					int[] is_578_ = anIntArrayArray9178[i_577_];
					for (int i_579_ = 0; i_579_ < is_578_.length; i_579_++) {
						int i_580_ = is_578_[i_579_];
						anIntArray9191[i_580_] -= anInt9247;
						anIntArray9184[i_580_] -= anInt9212;
						anIntArray9161[i_580_] -= anInt9224;
						anIntArray9191[i_580_] = anIntArray9191[i_580_] * i_533_ / 128;
						anIntArray9184[i_580_] = anIntArray9184[i_580_] * i_534_ / 128;
						anIntArray9161[i_580_] = anIntArray9161[i_580_] * i_535_ / 128;
						anIntArray9191[i_580_] += anInt9247;
						anIntArray9184[i_580_] += anInt9212;
						anIntArray9161[i_580_] += anInt9224;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9208 != null && aByteArray9202 != null) {
				for (int i_581_ = 0; i_581_ < i_537_; i_581_++) {
					int i_582_ = is[i_581_];
					if (i_582_ < anIntArrayArray9208.length) {
						int[] is_583_ = anIntArrayArray9208[i_582_];
						for (int i_584_ = 0; i_584_ < is_583_.length; i_584_++) {
							int i_585_ = is_583_[i_584_];
							int i_586_ = (aByteArray9202[i_585_] & 0xff) + i_533_ * 8;
							if (i_586_ < 0)
								i_586_ = 0;
							else if (i_586_ > 255)
								i_586_ = 255;
							aByteArray9202[i_585_] = (byte) i_586_;
						}
					}
				}
				if (aClass116Array9218 != null) {
					for (int i_587_ = 0; i_587_ < anInt9217; i_587_++) {
						Class116 class116 = aClass116Array9218[i_587_];
						Class108 class108 = aClass108Array9211[i_587_];
						class108.anInt1351 = (class108.anInt1351 * 328110239 & 0xffffff | 255 - ((aByteArray9202[class116.anInt1421 * 1723945109]) & 0xff) << 24) * 120490847;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9208 != null) {
				for (int i_588_ = 0; i_588_ < i_537_; i_588_++) {
					int i_589_ = is[i_588_];
					if (i_589_ < anIntArrayArray9208.length) {
						int[] is_590_ = anIntArrayArray9208[i_589_];
						for (int i_591_ = 0; i_591_ < is_590_.length; i_591_++) {
							int i_592_ = is_590_[i_591_];
							int i_593_ = aShortArray9193[i_592_] & 0xffff;
							int i_594_ = i_593_ >> 10 & 0x3f;
							int i_595_ = i_593_ >> 7 & 0x7;
							int i_596_ = i_593_ & 0x7f;
							i_594_ = i_594_ + i_533_ & 0x3f;
							i_595_ += i_534_;
							if (i_595_ < 0)
								i_595_ = 0;
							else if (i_595_ > 7)
								i_595_ = 7;
							i_596_ += i_535_;
							if (i_596_ < 0)
								i_596_ = 0;
							else if (i_596_ > 127)
								i_596_ = 127;
							aShortArray9193[i_592_] = (short) (i_594_ << 10 | i_595_ << 7 | i_596_);
						}
						aBool9209 = true;
					}
				}
				if (aClass116Array9218 != null) {
					for (int i_597_ = 0; i_597_ < anInt9217; i_597_++) {
						Class116 class116 = aClass116Array9218[i_597_];
						Class108 class108 = aClass108Array9211[i_597_];
						class108.anInt1351 = (class108.anInt1351 * 328110239 & ~0xffffff | ((Class656.anIntArray8393[Class453.method7333(((aShortArray9193[(class116.anInt1421 * 1723945109)]) & 0xffff), (byte) 10) & 0xffff]) & 0xffffff)) * 120490847;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9220 != null) {
				for (int i_598_ = 0; i_598_ < i_537_; i_598_++) {
					int i_599_ = is[i_598_];
					if (i_599_ < anIntArrayArray9220.length) {
						int[] is_600_ = anIntArrayArray9220[i_599_];
						for (int i_601_ = 0; i_601_ < is_600_.length; i_601_++) {
							Class108 class108 = aClass108Array9211[is_600_[i_601_]];
							class108.anInt1346 += i_533_ * -653278629;
							class108.anInt1350 += i_534_ * -1290559937;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9220 != null) {
				for (int i_602_ = 0; i_602_ < i_537_; i_602_++) {
					int i_603_ = is[i_602_];
					if (i_603_ < anIntArrayArray9220.length) {
						int[] is_604_ = anIntArrayArray9220[i_603_];
						for (int i_605_ = 0; i_605_ < is_604_.length; i_605_++) {
							Class108 class108 = aClass108Array9211[is_604_[i_605_]];
							class108.aFloat1347 = (class108.aFloat1347 * (float) i_533_ / 128.0F);
							class108.aFloat1353 = (class108.aFloat1353 * (float) i_534_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9220 != null) {
				for (int i_606_ = 0; i_606_ < i_537_; i_606_++) {
					int i_607_ = is[i_606_];
					if (i_607_ < anIntArrayArray9220.length) {
						int[] is_608_ = anIntArrayArray9220[i_607_];
						for (int i_609_ = 0; i_609_ < is_608_.length; i_609_++) {
							Class108 class108 = aClass108Array9211[is_608_[i_609_]];
							class108.anInt1349 = (class108.anInt1349 * 1169382623 + i_533_ & 0x3fff) * -1991287009;
						}
					}
				}
			}
		}
	}

	public void method2908(byte i, byte[] is) {
		if ((anInt9174 & 0x100000) == 0)
			throw new RuntimeException();
		if (aByteArray9202 == null)
			aByteArray9202 = new byte[anInt9185];
		if (is == null) {
			for (int i_610_ = 0; i_610_ < anInt9185; i_610_++)
				aByteArray9202[i_610_] = i;
		} else {
			for (int i_611_ = 0; i_611_ < anInt9185; i_611_++) {
				int i_612_ = 255 - ((255 - (is[i_611_] & 0xff)) * (255 - (i & 0xff)) / 255);
				aByteArray9202[i_611_] = (byte) i_612_;
			}
		}
		if (anInt9246 == 2)
			anInt9246 = 1;
	}

	void method2910(int i, int i_613_, int i_614_, int i_615_) {
		if (i == 0) {
			int i_616_ = 0;
			anInt9247 = 0;
			anInt9212 = 0;
			anInt9224 = 0;
			for (int i_617_ = 0; i_617_ < anInt9177; i_617_++) {
				anInt9247 += anIntArray9191[i_617_];
				anInt9212 += anIntArray9184[i_617_];
				anInt9224 += anIntArray9161[i_617_];
				i_616_++;
			}
			if (i_616_ > 0) {
				anInt9247 = anInt9247 / i_616_ + i_613_;
				anInt9212 = anInt9212 / i_616_ + i_614_;
				anInt9224 = anInt9224 / i_616_ + i_615_;
			} else {
				anInt9247 = i_613_;
				anInt9212 = i_614_;
				anInt9224 = i_615_;
			}
		} else if (i == 1) {
			for (int i_618_ = 0; i_618_ < anInt9177; i_618_++) {
				anIntArray9191[i_618_] += i_613_;
				anIntArray9184[i_618_] += i_614_;
				anIntArray9161[i_618_] += i_615_;
			}
		} else if (i == 2) {
			for (int i_619_ = 0; i_619_ < anInt9177; i_619_++) {
				anIntArray9191[i_619_] -= anInt9247;
				anIntArray9184[i_619_] -= anInt9212;
				anIntArray9161[i_619_] -= anInt9224;
				if (i_615_ != 0) {
					int i_620_ = Class428.anIntArray4825[i_615_];
					int i_621_ = Class428.anIntArray4819[i_615_];
					int i_622_ = ((anIntArray9184[i_619_] * i_620_ + anIntArray9191[i_619_] * i_621_ + 16383) >> 14);
					anIntArray9184[i_619_] = (anIntArray9184[i_619_] * i_621_ - anIntArray9191[i_619_] * i_620_ + 16383) >> 14;
					anIntArray9191[i_619_] = i_622_;
				}
				if (i_613_ != 0) {
					int i_623_ = Class428.anIntArray4825[i_613_];
					int i_624_ = Class428.anIntArray4819[i_613_];
					int i_625_ = ((anIntArray9184[i_619_] * i_624_ - anIntArray9161[i_619_] * i_623_ + 16383) >> 14);
					anIntArray9161[i_619_] = (anIntArray9184[i_619_] * i_623_ + anIntArray9161[i_619_] * i_624_ + 16383) >> 14;
					anIntArray9184[i_619_] = i_625_;
				}
				if (i_614_ != 0) {
					int i_626_ = Class428.anIntArray4825[i_614_];
					int i_627_ = Class428.anIntArray4819[i_614_];
					int i_628_ = ((anIntArray9161[i_619_] * i_626_ + anIntArray9191[i_619_] * i_627_ + 16383) >> 14);
					anIntArray9161[i_619_] = (anIntArray9161[i_619_] * i_627_ - anIntArray9191[i_619_] * i_626_ + 16383) >> 14;
					anIntArray9191[i_619_] = i_628_;
				}
				anIntArray9191[i_619_] += anInt9247;
				anIntArray9184[i_619_] += anInt9212;
				anIntArray9161[i_619_] += anInt9224;
			}
		} else if (i == 3) {
			for (int i_629_ = 0; i_629_ < anInt9177; i_629_++) {
				anIntArray9191[i_629_] -= anInt9247;
				anIntArray9184[i_629_] -= anInt9212;
				anIntArray9161[i_629_] -= anInt9224;
				anIntArray9191[i_629_] = anIntArray9191[i_629_] * i_613_ / 128;
				anIntArray9184[i_629_] = anIntArray9184[i_629_] * i_614_ / 128;
				anIntArray9161[i_629_] = anIntArray9161[i_629_] * i_615_ / 128;
				anIntArray9191[i_629_] += anInt9247;
				anIntArray9184[i_629_] += anInt9212;
				anIntArray9161[i_629_] += anInt9224;
			}
		} else if (i == 5) {
			for (int i_630_ = 0; i_630_ < anInt9185; i_630_++) {
				int i_631_ = (aByteArray9202[i_630_] & 0xff) + i_613_ * 8;
				if (i_631_ < 0)
					i_631_ = 0;
				else if (i_631_ > 255)
					i_631_ = 255;
				aByteArray9202[i_630_] = (byte) i_631_;
			}
			if (aClass116Array9218 != null) {
				for (int i_632_ = 0; i_632_ < anInt9217; i_632_++) {
					Class116 class116 = aClass116Array9218[i_632_];
					Class108 class108 = aClass108Array9211[i_632_];
					class108.anInt1351 = (class108.anInt1351 * 328110239 & 0xffffff | 255 - ((aByteArray9202[class116.anInt1421 * 1723945109]) & 0xff) << 24) * 120490847;
				}
			}
		} else if (i == 7) {
			for (int i_633_ = 0; i_633_ < anInt9185; i_633_++) {
				int i_634_ = aShortArray9193[i_633_] & 0xffff;
				int i_635_ = i_634_ >> 10 & 0x3f;
				int i_636_ = i_634_ >> 7 & 0x7;
				int i_637_ = i_634_ & 0x7f;
				i_635_ = i_635_ + i_613_ & 0x3f;
				i_636_ += i_614_;
				if (i_636_ < 0)
					i_636_ = 0;
				else if (i_636_ > 7)
					i_636_ = 7;
				i_637_ += i_615_;
				if (i_637_ < 0)
					i_637_ = 0;
				else if (i_637_ > 127)
					i_637_ = 127;
				aShortArray9193[i_633_] = (short) (i_635_ << 10 | i_636_ << 7 | i_637_);
			}
			aBool9209 = true;
			if (aClass116Array9218 != null) {
				for (int i_638_ = 0; i_638_ < anInt9217; i_638_++) {
					Class116 class116 = aClass116Array9218[i_638_];
					Class108 class108 = aClass108Array9211[i_638_];
					class108.anInt1351 = (class108.anInt1351 * 328110239 & ~0xffffff | ((Class656.anIntArray8393[Class453.method7333(((aShortArray9193[(class116.anInt1421 * 1723945109)]) & 0xffff), (byte) 10) & 0xffff]) & 0xffffff)) * 120490847;
				}
			}
		} else if (i == 8) {
			for (int i_639_ = 0; i_639_ < anInt9217; i_639_++) {
				Class108 class108 = aClass108Array9211[i_639_];
				class108.anInt1346 += i_613_ * -653278629;
				class108.anInt1350 += i_614_ * -1290559937;
			}
		} else if (i == 10) {
			for (int i_640_ = 0; i_640_ < anInt9217; i_640_++) {
				Class108 class108 = aClass108Array9211[i_640_];
				class108.aFloat1347 = class108.aFloat1347 * (float) i_613_ / 128.0F;
				class108.aFloat1353 = class108.aFloat1353 * (float) i_614_ / 128.0F;
			}
		} else if (i == 9) {
			for (int i_641_ = 0; i_641_ < anInt9217; i_641_++) {
				Class108 class108 = aClass108Array9211[i_641_];
				class108.anInt1349 = (class108.anInt1349 * 1169382623 + i_613_ & 0x3fff) * -1991287009;
			}
		}
	}

	public void method2888(Class432 class432, int i, boolean bool) {
		if (aShortArray9227 != null) {
			Class101 class101 = aClass180_Sub1_9171.method14835(Thread.currentThread());
			Class432 class432_642_ = class101.aClass432_1203;
			class432_642_.method6899(class432);
			if (bool)
				class432_642_.method6887();
			Class427 class427 = class101.aClass427_1188;
			class427.method6784(class432_642_);
			float[] fs = new float[3];
			for (int i_643_ = 0; i_643_ < anInt9231; i_643_++) {
				if ((i & aShortArray9227[i_643_]) != 0) {
					class427.method6773((float) anIntArray9191[i_643_], (float) anIntArray9184[i_643_], (float) anIntArray9161[i_643_], fs);
					anIntArray9191[i_643_] = (int) fs[0];
					anIntArray9184[i_643_] = (int) fs[1];
					anIntArray9161[i_643_] = (int) fs[2];
				}
			}
		}
	}

	public void method2889(Class432 class432, Class169 class169, int i) {
		method14648(class432, class169, i);
	}

	void method14648(Class432 class432, Class169 class169, int i) {
		if (anInt9231 >= 1) {
			Class101 class101 = aClass180_Sub1_9171.method14835(Thread.currentThread());
			Class427 class427 = class101.aClass427_1188;
			class427.method6784(class432);
			Class427 class427_644_ = aClass180_Sub1_9171.aClass427_9398;
			Class427 class427_645_ = aClass180_Sub1_9171.aClass427_9402;
			if (!aBool9221)
				method14659();
			boolean bool = class427.method6744();
			float[] fs = class101.aFloatArray1233;
			class427.method6773(0.0F, (float) aShort9223, 0.0F, fs);
			float f = fs[0];
			float f_646_ = fs[1];
			float f_647_ = fs[2];
			class427.method6773(0.0F, (float) aShort9237, 0.0F, fs);
			float f_648_ = fs[0];
			float f_649_ = fs[1];
			float f_650_ = fs[2];
			for (int i_651_ = 0; i_651_ < 6; i_651_++) {
				float[] fs_652_ = aClass180_Sub1_9171.aFloatArrayArray9404[i_651_];
				float f_653_ = (fs_652_[0] * f + fs_652_[1] * f_646_ + fs_652_[2] * f_647_ + fs_652_[3] + (float) aShort9196);
				float f_654_ = (fs_652_[0] * f_648_ + fs_652_[1] * f_649_ + fs_652_[2] * f_650_ + fs_652_[3] + (float) aShort9196);
				if (f_653_ < 0.0F && f_654_ < 0.0F)
					return;
			}
			float f_655_;
			float f_656_;
			if (bool) {
				f_655_ = class427_644_.aFloatArray4807[14];
				f_656_ = class427_644_.aFloatArray4807[6];
			} else {
				f_655_ = ((class427.aFloatArray4807[12] * class427_644_.aFloatArray4807[2]) + (class427.aFloatArray4807[13] * class427_644_.aFloatArray4807[6]) + (class427.aFloatArray4807[14] * class427_644_.aFloatArray4807[10]) + class427_644_.aFloatArray4807[14]);
				f_656_ = ((class427.aFloatArray4807[4] * class427_644_.aFloatArray4807[2]) + (class427.aFloatArray4807[5] * class427_644_.aFloatArray4807[6]) + (class427.aFloatArray4807[6] * class427_644_.aFloatArray4807[10]));
			}
			float f_657_ = f_655_ + (float) aShort9223 * f_656_;
			float f_658_ = f_655_ + (float) aShort9237 * f_656_;
			float f_659_ = (f_657_ > f_658_ ? f_657_ + (float) aShort9196 : f_658_ + (float) aShort9196);
			float f_660_ = (class427_645_.aFloatArray4807[10] * f_659_ + class427_645_.aFloatArray4807[14]);
			if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
				synchronized (this) {
					while (aBool9204) {
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
					aBool9204 = true;
				}
			}
			method14631(class101);
			Class427 class427_661_ = aClass101_9163.aClass427_1204;
			class427_661_.method6750(class427);
			class427_661_.method6751(aClass180_Sub1_9171.aClass427_9403);
			if ((i & 0x2) != 0)
				aClass119_9165.method2093(true);
			else
				aClass119_9165.method2093(false);
			boolean bool_662_ = false;
			aClass101_9163.aFloat1199 = aClass119_9165.aFloat1451;
			aClass101_9163.aFloat1219 = aClass119_9165.aFloat1466;
			aClass101_9163.aFloat1221 = aClass119_9165.aFloat1453;
			aClass101_9163.aFloat1223 = 1.0F / aClass119_9165.aFloat1453;
			aClass101_9163.aFloat1218 = aClass119_9165.aFloat1448;
			aClass101_9163.aFloat1220 = aClass119_9165.aFloat1444;
			aClass101_9163.aFloat1222 = aClass119_9165.aFloat1452;
			aClass101_9163.anInt1224 = aClass119_9165.anInt1442 * -1630745973;
			for (int i_663_ = 0; i_663_ < anInt9177; i_663_++) {
				int i_664_ = anIntArray9191[i_663_];
				int i_665_ = anIntArray9184[i_663_];
				int i_666_ = anIntArray9161[i_663_];
				float f_667_ = (class427_661_.aFloatArray4807[0] * (float) i_664_ + class427_661_.aFloatArray4807[4] * (float) i_665_ + class427_661_.aFloatArray4807[8] * (float) i_666_ + class427_661_.aFloatArray4807[12]);
				float f_668_ = (class427_661_.aFloatArray4807[1] * (float) i_664_ + class427_661_.aFloatArray4807[5] * (float) i_665_ + class427_661_.aFloatArray4807[9] * (float) i_666_ + class427_661_.aFloatArray4807[13]);
				float f_669_ = (class427_661_.aFloatArray4807[2] * (float) i_664_ + class427_661_.aFloatArray4807[6] * (float) i_665_ + class427_661_.aFloatArray4807[10] * (float) i_666_ + class427_661_.aFloatArray4807[14]);
				float f_670_ = (class427_661_.aFloatArray4807[3] * (float) i_664_ + class427_661_.aFloatArray4807[7] * (float) i_665_ + class427_661_.aFloatArray4807[11] * (float) i_666_ + class427_661_.aFloatArray4807[15]);
				aFloatArray9238[i_663_] = (aClass101_9163.aFloat1222 + aClass101_9163.aFloat1221 * f_669_ / f_670_);
				aFloatArray9239[i_663_] = f_670_;
				if (f_669_ >= -f_670_) {
					aFloatArray9167[i_663_] = (float) (int) (aClass101_9163.aFloat1218 + (aClass101_9163.aFloat1199 * f_667_ / f_670_));
					aFloatArray9198[i_663_] = (float) (int) (aClass101_9163.aFloat1220 + (aClass101_9163.aFloat1219 * f_668_ / f_670_));
				} else {
					aFloatArray9167[i_663_] = -5000.0F;
					bool_662_ = true;
				}
				if (aClass101_9163.aBool1196)
					anIntArray9230[i_663_] = (int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) i_664_) + (class427.aFloatArray4807[5] * (float) i_665_) + (class427.aFloatArray4807[9] * (float) i_666_)));
			}
			if (aClass116Array9218 != null) {
				for (int i_671_ = 0; i_671_ < anInt9217; i_671_++) {
					Class116 class116 = aClass116Array9218[i_671_];
					Class108 class108 = aClass108Array9211[i_671_];
					short i_672_ = aShortArray9187[class116.anInt1421 * 1723945109];
					short i_673_ = aShortArray9188[class116.anInt1421 * 1723945109];
					short i_674_ = aShortArray9189[class116.anInt1421 * 1723945109];
					int i_675_ = ((anIntArray9191[i_672_] + anIntArray9191[i_673_] + anIntArray9191[i_674_]) / 3);
					int i_676_ = ((anIntArray9184[i_672_] + anIntArray9184[i_673_] + anIntArray9184[i_674_]) / 3);
					int i_677_ = ((anIntArray9161[i_672_] + anIntArray9161[i_673_] + anIntArray9161[i_674_]) / 3);
					float f_678_ = (class427_661_.aFloatArray4807[0] * (float) i_675_ + class427_661_.aFloatArray4807[4] * (float) i_676_ + class427_661_.aFloatArray4807[8] * (float) i_677_ + class427_661_.aFloatArray4807[12]);
					float f_679_ = (class427_661_.aFloatArray4807[1] * (float) i_675_ + class427_661_.aFloatArray4807[5] * (float) i_676_ + class427_661_.aFloatArray4807[9] * (float) i_677_ + class427_661_.aFloatArray4807[13]);
					float f_680_ = (class427_661_.aFloatArray4807[2] * (float) i_675_ + class427_661_.aFloatArray4807[6] * (float) i_676_ + class427_661_.aFloatArray4807[10] * (float) i_677_ + class427_661_.aFloatArray4807[14]);
					float f_681_ = (class427_661_.aFloatArray4807[3] * (float) i_675_ + class427_661_.aFloatArray4807[7] * (float) i_676_ + class427_661_.aFloatArray4807[11] * (float) i_677_ + class427_661_.aFloatArray4807[15]);
					f_680_ += ((class427_645_.aFloatArray4807[2] * (float) (class108.anInt1346 * -1337745965)) + (class427_645_.aFloatArray4807[6] * (float) (class108.anInt1350 * 66408895)));
					f_681_ += ((class427_645_.aFloatArray4807[3] * (float) (class108.anInt1346 * -1337745965)) + (class427_645_.aFloatArray4807[7] * (float) (class108.anInt1350 * 66408895)));
					if (f_680_ > -f_681_) {
						f_678_ += ((class427_645_.aFloatArray4807[0] * (float) (class108.anInt1346 * -1337745965)) + (class427_645_.aFloatArray4807[4] * (float) (class108.anInt1350 * 66408895)));
						f_679_ += ((class427_645_.aFloatArray4807[1] * (float) (class108.anInt1346 * -1337745965)) + (class427_645_.aFloatArray4807[5] * (float) (class108.anInt1350 * 66408895)));
						float f_682_ = (aClass180_Sub1_9171.aFloat9410 + (aClass180_Sub1_9171.aFloat9419 * f_678_ / f_681_));
						float f_683_ = (aClass180_Sub1_9171.aFloat9412 + (aClass180_Sub1_9171.aFloat9395 * f_679_ / f_681_));
						float f_684_ = (class108.aFloat1347 * (float) class116.aShort1420);
						float f_685_ = (class108.aFloat1353 * (float) class116.aShort1417);
						float f_686_ = (f_678_ + class427_645_.aFloatArray4807[0] * f_684_ + class427_645_.aFloatArray4807[4] * f_685_);
						float f_687_ = (f_679_ + class427_645_.aFloatArray4807[1] * f_684_ + class427_645_.aFloatArray4807[5] * f_685_);
						float f_688_ = (f_681_ + class427_645_.aFloatArray4807[3] * f_684_ + class427_645_.aFloatArray4807[7] * f_685_);
						float f_689_ = (aClass180_Sub1_9171.aFloat9410 + (aClass180_Sub1_9171.aFloat9419 * f_686_ / f_688_));
						float f_690_ = (aClass180_Sub1_9171.aFloat9412 + (aClass180_Sub1_9171.aFloat9395 * f_687_ / f_688_));
						class108.anInt1348 = (int) f_682_ * -323246595;
						class108.anInt1352 = (int) f_683_ * 334129577;
						class108.aFloat1356 = (aClass180_Sub1_9171.aFloat9414 + (aClass180_Sub1_9171.aFloat9405 * (f_680_ - (class427_645_.aFloatArray4807[10] * (float) (class116.anInt1422 * -451624537))) / f_681_));
						class108.anInt1354 = (int) (f_689_ < f_682_ ? f_682_ - f_689_ : f_689_ - f_682_) * 1505072457;
						class108.anInt1355 = (int) (f_690_ < f_683_ ? f_683_ - f_690_ : f_690_ - f_683_) * 1609227583;
					} else {
						Class108 class108_691_ = class108;
						class108.anInt1355 = 0;
						class108_691_.anInt1354 = 0;
					}
				}
			}
			if (class169 != null) {
				boolean bool_692_ = false;
				boolean bool_693_ = true;
				int i_694_ = aShort9226 + aShort9173 >> 1;
				int i_695_ = aShort9228 + aShort9229 >> 1;
				int i_696_ = i_694_;
				short i_697_ = aShort9223;
				int i_698_ = i_695_;
				float f_699_ = (class427_661_.aFloatArray4807[0] * (float) i_696_ + class427_661_.aFloatArray4807[4] * (float) i_697_ + class427_661_.aFloatArray4807[8] * (float) i_698_ + class427_661_.aFloatArray4807[12]);
				float f_700_ = (class427_661_.aFloatArray4807[1] * (float) i_696_ + class427_661_.aFloatArray4807[5] * (float) i_697_ + class427_661_.aFloatArray4807[9] * (float) i_698_ + class427_661_.aFloatArray4807[13]);
				float f_701_ = (class427_661_.aFloatArray4807[2] * (float) i_696_ + class427_661_.aFloatArray4807[6] * (float) i_697_ + class427_661_.aFloatArray4807[10] * (float) i_698_ + class427_661_.aFloatArray4807[14]);
				float f_702_ = (class427_661_.aFloatArray4807[3] * (float) i_696_ + class427_661_.aFloatArray4807[7] * (float) i_697_ + class427_661_.aFloatArray4807[11] * (float) i_698_ + class427_661_.aFloatArray4807[15]);
				if (f_701_ >= -f_702_) {
					class169.anInt1872 = (int) (aClass180_Sub1_9171.aFloat9410 + (aClass180_Sub1_9171.aFloat9419 * f_699_ / f_702_));
					class169.anInt1876 = (int) (aClass180_Sub1_9171.aFloat9412 + (aClass180_Sub1_9171.aFloat9395 * f_700_ / f_702_));
				} else
					bool_692_ = true;
				i_696_ = i_694_;
				i_697_ = aShort9237;
				i_698_ = i_695_;
				float f_703_ = (class427_661_.aFloatArray4807[0] * (float) i_696_ + class427_661_.aFloatArray4807[4] * (float) i_697_ + class427_661_.aFloatArray4807[8] * (float) i_698_ + class427_661_.aFloatArray4807[12]);
				float f_704_ = (class427_661_.aFloatArray4807[1] * (float) i_696_ + class427_661_.aFloatArray4807[5] * (float) i_697_ + class427_661_.aFloatArray4807[9] * (float) i_698_ + class427_661_.aFloatArray4807[13]);
				float f_705_ = (class427_661_.aFloatArray4807[2] * (float) i_696_ + class427_661_.aFloatArray4807[6] * (float) i_697_ + class427_661_.aFloatArray4807[10] * (float) i_698_ + class427_661_.aFloatArray4807[14]);
				float f_706_ = (class427_661_.aFloatArray4807[3] * (float) i_696_ + class427_661_.aFloatArray4807[7] * (float) i_697_ + class427_661_.aFloatArray4807[11] * (float) i_698_ + class427_661_.aFloatArray4807[15]);
				if (f_705_ >= -f_706_) {
					class169.anInt1873 = (int) (aClass180_Sub1_9171.aFloat9410 + (aClass180_Sub1_9171.aFloat9419 * f_703_ / f_706_));
					class169.anInt1875 = (int) (aClass180_Sub1_9171.aFloat9412 + (aClass180_Sub1_9171.aFloat9395 * f_704_ / f_706_));
				} else
					bool_692_ = true;
				if (bool_692_) {
					if (f_701_ < -f_702_ && f_705_ < -f_706_)
						bool_693_ = false;
					else if (f_701_ < -f_702_) {
						float f_707_ = (f_701_ + f_702_) / (f_705_ + f_706_) - 1.0F;
						float f_708_ = f_699_ + f_707_ * (f_703_ - f_699_);
						float f_709_ = f_700_ + f_707_ * (f_704_ - f_700_);
						float f_710_ = f_702_ + f_707_ * (f_706_ - f_702_);
						class169.anInt1872 = (int) (aClass180_Sub1_9171.aFloat9410 + (aClass180_Sub1_9171.aFloat9419 * f_708_ / f_710_));
						class169.anInt1876 = (int) (aClass180_Sub1_9171.aFloat9412 + (aClass180_Sub1_9171.aFloat9395 * f_709_ / f_710_));
					} else if (f_705_ < -f_706_) {
						float f_711_ = (f_705_ + f_706_) / (f_701_ + f_702_) - 1.0F;
						float f_712_ = f_703_ + f_711_ * (f_699_ - f_703_);
						float f_713_ = f_704_ + f_711_ * (f_700_ - f_704_);
						float f_714_ = f_706_ + f_711_ * (f_702_ - f_706_);
						class169.anInt1873 = (int) (aClass180_Sub1_9171.aFloat9410 + (aClass180_Sub1_9171.aFloat9419 * f_712_ / f_714_));
						class169.anInt1875 = (int) (aClass180_Sub1_9171.aFloat9412 + (aClass180_Sub1_9171.aFloat9395 * f_713_ / f_714_));
					}
				}
				if (bool_693_) {
					if (f_701_ / f_702_ > f_705_ / f_706_) {
						float f_715_ = (f_699_ + (class427_645_.aFloatArray4807[0] * (float) aShort9196) + class427_645_.aFloatArray4807[12]);
						float f_716_ = (f_702_ + (class427_645_.aFloatArray4807[3] * (float) aShort9196) + class427_645_.aFloatArray4807[15]);
						class169.anInt1877 = (int) (aClass180_Sub1_9171.aFloat9410 - (float) class169.anInt1872 + (aClass180_Sub1_9171.aFloat9419 * f_715_ / f_716_));
					} else {
						float f_717_ = (f_703_ + (class427_645_.aFloatArray4807[0] * (float) aShort9196) + class427_645_.aFloatArray4807[12]);
						float f_718_ = (f_706_ + (class427_645_.aFloatArray4807[3] * (float) aShort9196) + class427_645_.aFloatArray4807[15]);
						class169.anInt1877 = (int) (aClass180_Sub1_9171.aFloat9410 - (float) class169.anInt1873 + (aClass180_Sub1_9171.aFloat9419 * f_717_ / f_718_));
					}
					class169.aBool1874 = true;
				}
			}
			method14634(true);
			aClass119_9165.aBool1467 = (i & 0x1) == 0;
			aClass119_9165.aBool1443 = false;
			try {
				method14649(aClass180_Sub1_9171.anIntArray9386 != null, aClass180_Sub1_9171.aFloatArray9389 != null, (i & 0x4) != 0, bool_662_, ((aClass101_9163.aBool1191 && f_660_ > aClass101_9163.aFloat1192) || aClass101_9163.aBool1196));
			} catch (Exception exception) {
				/* empty */
			}
			if (aClass116Array9218 != null) {
				for (int i_719_ = 0; i_719_ < anInt9185; i_719_++)
					anIntArray9245[i_719_] = -1;
			}
			aClass119_9165 = null;
			if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
				synchronized (this) {
					aBool9204 = false;
					this.notifyAll();
				}
			}
		}
	}

	final void method14649(boolean bool, boolean bool_720_, boolean bool_721_, boolean bool_722_, boolean bool_723_) {
		if (aClass116Array9218 != null) {
			for (int i = 0; i < anInt9217; i++) {
				Class116 class116 = aClass116Array9218[i];
				anIntArray9245[class116.anInt1421 * 1723945109] = i;
			}
		}
		if (aBool9232 || aClass116Array9218 != null) {
			if ((anInt9174 & 0x100) == 0 && aShortArray9181 != null) {
				for (int i = 0; i < anInt9186; i++) {
					short i_724_ = aShortArray9181[i];
					method14651(bool, bool_720_, bool_721_, i_724_, bool_722_, bool_723_);
				}
			} else {
				for (int i = 0; i < anInt9186; i++) {
					if (!method14690(i) && !method14693(i))
						method14651(bool, bool_720_, bool_721_, i, bool_722_, bool_723_);
				}
				if (aByteArray9201 == null) {
					for (int i = 0; i < anInt9186; i++) {
						if (method14690(i) || method14693(i))
							method14651(bool, bool_720_, bool_721_, i, bool_722_, bool_723_);
					}
				} else {
					for (int i = 0; i < 12; i++) {
						for (int i_725_ = 0; i_725_ < anInt9186; i_725_++) {
							if (aByteArray9201[i_725_] == i && (method14690(i_725_) || method14693(i_725_)))
								method14651(bool, bool_720_, bool_721_, i_725_, bool_722_, bool_723_);
						}
					}
				}
			}
			if (aClass116Array9218 != null)
				method14650(bool, bool_720_, bool_721_);
		} else {
			for (int i = 0; i < anInt9186; i++)
				method14651(bool, bool_720_, bool_721_, i, bool_722_, bool_723_);
		}
	}

	final void method14650(boolean bool, boolean bool_726_, boolean bool_727_) {
		for (int i = 0; i < anInt9217; i++) {
			Class116 class116 = aClass116Array9218[i];
			if (class116.aBool1415) {
				Class108 class108 = aClass108Array9211[i];
				aClass180_Sub1_9171.method14840(bool, bool_726_, bool_727_, class108.anInt1348 * 239951701, class108.anInt1352 * 888949401, class108.aFloat1356, class108.anInt1354 * -483431175, class108.anInt1355 * -777416001, class116.aShort1418, class108.anInt1351 * 328110239, class116.aByte1419, class116.aByte1416);
			}
		}
	}

	public int method2893() {
		if (!aBool9221)
			method14659();
		return aShort9222;
	}

	public void method2967() {
		if (!aBool9168) {
			if (!aBool9221)
				method14659();
			aShort9242 = aShort9223;
			aBool9168 = true;
		}
	}

	final void method14651(boolean bool, boolean bool_728_, boolean bool_729_, int i, boolean bool_730_, boolean bool_731_) {
		if (anIntArray9194[i] != -2) {
			short i_732_ = aShortArray9187[i];
			short i_733_ = aShortArray9188[i];
			short i_734_ = aShortArray9189[i];
			float f = aFloatArray9167[i_732_];
			float f_735_ = aFloatArray9167[i_733_];
			float f_736_ = aFloatArray9167[i_734_];
			if (!bool_730_ || f != -5000.0F && f_735_ != -5000.0F && f_736_ != -5000.0F) {
				float f_737_ = aFloatArray9198[i_732_];
				float f_738_ = aFloatArray9198[i_733_];
				float f_739_ = aFloatArray9198[i_734_];
				if (anIntArray9245[i] != -1 || ((f - f_735_) * (f_739_ - f_738_) - (f_737_ - f_738_) * (f_736_ - f_735_)) > 0.0F) {
					if (f < 0.0F || f_735_ < 0.0F || f_736_ < 0.0F || f > (float) (aClass101_9163.anInt1224 * 541969699) || f_735_ > (float) (aClass101_9163.anInt1224 * 541969699) || f_736_ > (float) (aClass101_9163.anInt1224 * 541969699))
						aClass119_9165.aBool1445 = true;
					else
						aClass119_9165.aBool1445 = false;
					if (bool_731_) {
						int i_740_ = anIntArray9245[i];
						if (i_740_ == -1 || !aClass116Array9218[i_740_].aBool1415)
							method14646(bool, bool_728_, bool_729_, i);
					} else {
						int i_741_ = anIntArray9245[i];
						if (i_741_ != -1) {
							Class116 class116 = aClass116Array9218[i_741_];
							Class108 class108 = aClass108Array9211[i_741_];
							if (!class116.aBool1415)
								method14652(bool, bool_728_, bool_729_, i);
							aClass180_Sub1_9171.method14840(bool, bool_728_, bool_729_, class108.anInt1348 * 239951701, class108.anInt1352 * 888949401, class108.aFloat1356, class108.anInt1354 * -483431175, class108.anInt1355 * -777416001, class116.aShort1418, class108.anInt1351 * 328110239, class116.aByte1419, class116.aByte1416);
						} else
							method14652(bool, bool_728_, bool_729_, i);
					}
				}
			}
		}
	}

	final void method14652(boolean bool, boolean bool_742_, boolean bool_743_, int i) {
		short i_744_ = aShortArray9187[i];
		short i_745_ = aShortArray9188[i];
		short i_746_ = aShortArray9189[i];
		boolean bool_747_ = false;
		if (aShortArray9162 != null && aShortArray9162[i] != -1)
			bool_747_ = (aClass180_Sub1_9171.aClass181_2059.method3544(aShortArray9162[i] & 0xffff, (byte) -89).aBool1761);
		if (!bool_747_) {
			if (aByteArray9202 == null)
				aClass119_9165.anInt1441 = 0;
			else
				aClass119_9165.anInt1441 = aByteArray9202[i] & 0xff;
			if (anIntArray9194[i] == -1)
				aClass119_9165.method2077(bool, bool_742_, bool_743_, aFloatArray9198[i_744_], aFloatArray9198[i_745_], aFloatArray9198[i_746_], aFloatArray9167[i_744_], aFloatArray9167[i_745_], aFloatArray9167[i_746_], aFloatArray9238[i_744_], aFloatArray9238[i_745_], aFloatArray9238[i_746_], Class656.anIntArray8393[anIntArray9192[i] & 0xffff]);
			else
				aClass119_9165.method2073(bool, bool_742_, bool_743_, aFloatArray9198[i_744_], aFloatArray9198[i_745_], aFloatArray9198[i_746_], aFloatArray9167[i_744_], aFloatArray9167[i_745_], aFloatArray9167[i_746_], aFloatArray9238[i_744_], aFloatArray9238[i_745_], aFloatArray9238[i_746_], (float) (anIntArray9192[i] & 0xffff), (float) (anIntArray9180[i] & 0xffff), (float) (anIntArray9194[i] & 0xffff));
		} else {
			int i_748_ = -16777216;
			if (aByteArray9202 != null)
				i_748_ = 255 - (aByteArray9202[i] & 0xff) << 24;
			if (anIntArray9194[i] == -1) {
				int i_749_ = i_748_ | anIntArray9192[i] & 0xffffff;
				aClass119_9165.method2079(bool, bool_742_, bool_743_, aFloatArray9198[i_744_], aFloatArray9198[i_745_], aFloatArray9198[i_746_], aFloatArray9167[i_744_], aFloatArray9167[i_745_], aFloatArray9167[i_746_], aFloatArray9238[i_744_], aFloatArray9238[i_745_], aFloatArray9238[i_746_], aFloatArray9239[i_744_], aFloatArray9239[i_745_], aFloatArray9239[i_746_], aFloatArrayArray9190[i][0], aFloatArrayArray9190[i][1], aFloatArrayArray9190[i][2], aFloatArrayArray9235[i][0],
						aFloatArrayArray9235[i][1], aFloatArrayArray9235[i][2], i_749_, i_749_, i_749_, aClass101_9163.anInt1194 * -1009384223, 0.0F, 0.0F, 0.0F, aShortArray9162[i] & 0xffff);
			} else
				aClass119_9165.method2079(bool, bool_742_, bool_743_, aFloatArray9198[i_744_], aFloatArray9198[i_745_], aFloatArray9198[i_746_], aFloatArray9167[i_744_], aFloatArray9167[i_745_], aFloatArray9167[i_746_], aFloatArray9238[i_744_], aFloatArray9238[i_745_], aFloatArray9238[i_746_], aFloatArray9239[i_744_], aFloatArray9239[i_745_], aFloatArray9239[i_746_], aFloatArrayArray9190[i][0], aFloatArrayArray9190[i][1], aFloatArrayArray9190[i][2], aFloatArrayArray9235[i][0],
						aFloatArrayArray9235[i][1], aFloatArrayArray9235[i][2], i_748_ | anIntArray9192[i] & 0xffffff, i_748_ | anIntArray9180[i] & 0xffffff, i_748_ | anIntArray9194[i] & 0xffffff, aClass101_9163.anInt1194 * -1009384223, 0.0F, 0.0F, 0.0F, aShortArray9162[i] & 0xffff);
		}
	}

	public int method2985() {
		if (!aBool9221)
			method14659();
		return aShort9223;
	}

	public boolean method3051(int i, int i_750_, Class432 class432, boolean bool, int i_751_) {
		method14631(aClass180_Sub1_9171.method14835(Thread.currentThread()));
		Class427 class427 = aClass101_9163.aClass427_1188;
		class427.method6784(class432);
		Class427 class427_752_ = aClass101_9163.aClass427_1204;
		class427_752_.method6750(class427);
		class427_752_.method6751(aClass180_Sub1_9171.aClass427_9403);
		boolean bool_753_ = false;
		int i_754_ = 2147483647;
		int i_755_ = -2147483648;
		int i_756_ = 2147483647;
		int i_757_ = -2147483648;
		if (!aBool9221)
			method14659();
		int i_758_ = aShort9173 - aShort9226 >> 1;
		int i_759_ = aShort9237 - aShort9223 >> 1;
		int i_760_ = aShort9229 - aShort9228 >> 1;
		int i_761_ = aShort9226 + i_758_;
		int i_762_ = aShort9223 + i_759_;
		int i_763_ = aShort9228 + i_760_;
		int i_764_ = i_761_ - (i_758_ << i_751_);
		int i_765_ = i_762_ - (i_759_ << i_751_);
		int i_766_ = i_763_ - (i_760_ << i_751_);
		int i_767_ = i_761_ + (i_758_ << i_751_);
		int i_768_ = i_762_ + (i_759_ << i_751_);
		int i_769_ = i_763_ + (i_760_ << i_751_);
		anIntArray9240[0] = i_764_;
		anIntArray9241[0] = i_765_;
		anIntArray9176[0] = i_766_;
		anIntArray9240[1] = i_767_;
		anIntArray9241[1] = i_765_;
		anIntArray9176[1] = i_766_;
		anIntArray9240[2] = i_764_;
		anIntArray9241[2] = i_768_;
		anIntArray9176[2] = i_766_;
		anIntArray9240[3] = i_767_;
		anIntArray9241[3] = i_768_;
		anIntArray9176[3] = i_766_;
		anIntArray9240[4] = i_764_;
		anIntArray9241[4] = i_765_;
		anIntArray9176[4] = i_769_;
		anIntArray9240[5] = i_767_;
		anIntArray9241[5] = i_765_;
		anIntArray9176[5] = i_769_;
		anIntArray9240[6] = i_764_;
		anIntArray9241[6] = i_768_;
		anIntArray9176[6] = i_769_;
		anIntArray9240[7] = i_767_;
		anIntArray9241[7] = i_768_;
		anIntArray9176[7] = i_769_;
		for (int i_770_ = 0; i_770_ < 8; i_770_++) {
			int i_771_ = anIntArray9240[i_770_];
			int i_772_ = anIntArray9241[i_770_];
			int i_773_ = anIntArray9176[i_770_];
			float f = (class427_752_.aFloatArray4807[2] * (float) i_771_ + class427_752_.aFloatArray4807[6] * (float) i_772_ + class427_752_.aFloatArray4807[10] * (float) i_773_ + class427_752_.aFloatArray4807[14]);
			float f_774_ = (class427_752_.aFloatArray4807[3] * (float) i_771_ + class427_752_.aFloatArray4807[7] * (float) i_772_ + class427_752_.aFloatArray4807[11] * (float) i_773_ + class427_752_.aFloatArray4807[15]);
			if (f >= -f_774_) {
				float f_775_ = (class427_752_.aFloatArray4807[0] * (float) i_771_ + class427_752_.aFloatArray4807[4] * (float) i_772_ + class427_752_.aFloatArray4807[8] * (float) i_773_ + class427_752_.aFloatArray4807[12]);
				float f_776_ = (class427_752_.aFloatArray4807[1] * (float) i_771_ + class427_752_.aFloatArray4807[5] * (float) i_772_ + class427_752_.aFloatArray4807[9] * (float) i_773_ + class427_752_.aFloatArray4807[13]);
				int i_777_ = (int) (aClass180_Sub1_9171.aFloat9410 + (aClass180_Sub1_9171.aFloat9419 * f_775_ / f_774_));
				int i_778_ = (int) (aClass180_Sub1_9171.aFloat9412 + (aClass180_Sub1_9171.aFloat9395 * f_776_ / f_774_));
				if (i_777_ < i_754_)
					i_754_ = i_777_;
				if (i_777_ > i_755_)
					i_755_ = i_777_;
				if (i_778_ < i_756_)
					i_756_ = i_778_;
				if (i_778_ > i_757_)
					i_757_ = i_778_;
				bool_753_ = true;
			}
		}
		if (bool_753_ && i > i_754_ && i < i_755_ && i_750_ > i_756_ && i_750_ < i_757_) {
			if (bool)
				return true;
			for (int i_779_ = 0; i_779_ < anInt9177; i_779_++) {
				int i_780_ = anIntArray9191[i_779_];
				int i_781_ = anIntArray9184[i_779_];
				int i_782_ = anIntArray9161[i_779_];
				float f = (class427_752_.aFloatArray4807[2] * (float) i_780_ + class427_752_.aFloatArray4807[6] * (float) i_781_ + class427_752_.aFloatArray4807[10] * (float) i_782_ + class427_752_.aFloatArray4807[14]);
				float f_783_ = (class427_752_.aFloatArray4807[3] * (float) i_780_ + class427_752_.aFloatArray4807[7] * (float) i_781_ + class427_752_.aFloatArray4807[11] * (float) i_782_ + class427_752_.aFloatArray4807[15]);
				if (f >= -f_783_) {
					float f_784_ = (class427_752_.aFloatArray4807[0] * (float) i_780_ + class427_752_.aFloatArray4807[4] * (float) i_781_ + class427_752_.aFloatArray4807[8] * (float) i_782_ + class427_752_.aFloatArray4807[12]);
					float f_785_ = (class427_752_.aFloatArray4807[1] * (float) i_780_ + class427_752_.aFloatArray4807[5] * (float) i_781_ + class427_752_.aFloatArray4807[9] * (float) i_782_ + class427_752_.aFloatArray4807[13]);
					aFloatArray9167[i_779_] = (float) (int) (aClass180_Sub1_9171.aFloat9410 + (aClass180_Sub1_9171.aFloat9419 * f_784_ / f_783_));
					aFloatArray9198[i_779_] = (float) (int) (aClass180_Sub1_9171.aFloat9412 + (aClass180_Sub1_9171.aFloat9395 * f_785_ / f_783_));
				} else
					aFloatArray9167[i_779_] = -999999.0F;
			}
			for (int i_786_ = 0; i_786_ < anInt9186; i_786_++) {
				if (aFloatArray9167[aShortArray9187[i_786_]] != -999999.0F && aFloatArray9167[aShortArray9188[i_786_]] != -999999.0F && aFloatArray9167[aShortArray9189[i_786_]] != -999999.0F && method14663(i, i_750_, aFloatArray9198[aShortArray9187[i_786_]], aFloatArray9198[aShortArray9188[i_786_]], aFloatArray9198[aShortArray9189[i_786_]], aFloatArray9167[aShortArray9187[i_786_]], aFloatArray9167[aShortArray9188[i_786_]], aFloatArray9167[aShortArray9189[i_786_]]))
					return true;
			}
		}
		return false;
	}

	public Class167[] method2974() {
		return aClass167Array9215;
	}

	public void method2870(Class432 class432) {
		method14631(aClass180_Sub1_9171.method14835(Thread.currentThread()));
		Class427 class427 = aClass101_9163.aClass427_1188;
		class427.method6784(class432);
		if (aClass167Array9215 != null) {
			for (int i = 0; i < aClass167Array9215.length; i++) {
				Class167 class167 = aClass167Array9215[i];
				Class167 class167_787_ = class167;
				if (class167.aClass167_1849 != null)
					class167_787_ = class167.aClass167_1849;
				class167_787_.anInt1855 = (int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) (anIntArray9191[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[4] * (float) anIntArray9184[(class167.anInt1851 * -18705907)]) + (class427.aFloatArray4807[8] * (float) (anIntArray9161[(class167.anInt1851 * -18705907)])))) * 1542395015;
				class167_787_.anInt1856 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) (anIntArray9191[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[5] * (float) (anIntArray9184[(class167.anInt1851 * -18705907)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9161[(class167.anInt1851 * -18705907)])))) * -1886500927);
				class167_787_.anInt1860 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) (anIntArray9191[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[6] * (float) (anIntArray9184[(class167.anInt1851 * -18705907)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9161[(class167.anInt1851 * -18705907)])))) * -1731268533);
				class167_787_.anInt1858 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9191[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9184[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9161[(class167.anInt1852 * -1573542389)])))) * -2034723417);
				class167_787_.anInt1859 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9191[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9184[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9161[(class167.anInt1852 * -1573542389)])))) * -481732551);
				class167_787_.anInt1862 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) anIntArray9191[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[6] * (float) (anIntArray9184[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9161[(class167.anInt1852 * -1573542389)])))) * -980787877);
				class167_787_.anInt1857 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9191[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9184[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9161[(class167.anInt1853 * -2116684303)])))) * -1482367683);
				class167_787_.anInt1850 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9191[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9184[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9161[(class167.anInt1853 * -2116684303)])))) * 1240185219);
				class167_787_.anInt1863 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) anIntArray9191[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[6] * (float) (anIntArray9184[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9161[(class167.anInt1853 * -2116684303)])))) * -857185851);
			}
		}
		if (aClass159Array9216 != null) {
			for (int i = 0; i < aClass159Array9216.length; i++) {
				Class159 class159 = aClass159Array9216[i];
				Class159 class159_788_ = class159;
				if (class159.aClass159_1739 != null)
					class159_788_ = class159.aClass159_1739;
				if (class159.aClass427_1738 != null)
					class159.aClass427_1738.method6750(class427);
				else
					class159.aClass427_1738 = new Class427(class427);
				class159_788_.anInt1744 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9191[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9184[(class159.anInt1740 * -449756941)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9161[(class159.anInt1740 * -449756941)])))) * -306739393);
				class159_788_.anInt1742 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9191[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9184[(class159.anInt1740 * -449756941)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9161[(class159.anInt1740 * -449756941)])))) * -1995176663);
				class159_788_.anInt1743 = (int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) (anIntArray9191[class159.anInt1740 * -449756941])) + (class427.aFloatArray4807[6] * (float) anIntArray9184[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[10] * (float) (anIntArray9161[(class159.anInt1740 * -449756941)])))) * 76591605;
			}
		}
	}

	public Class527_Sub8_Sub8 method2891(Class527_Sub8_Sub8 class527_sub8_sub8) {
		return null;
	}

	public int method2997() {
		if (!aBool9221)
			method14659();
		return aShort9222;
	}

	public void method2901() {
		if (!aBool9168) {
			if (!aBool9221)
				method14659();
			aShort9242 = aShort9223;
			aBool9168 = true;
		}
	}

	public int method2865() {
		if (!aBool9221)
			method14659();
		return aShort9196;
	}

	void method14653() {
		synchronized (this) {
			for (int i = 0; i < anInt9177; i++) {
				int i_789_ = anIntArray9191[i];
				anIntArray9191[i] = anIntArray9161[i];
				anIntArray9161[i] = -i_789_;
			}
			method14645();
		}
	}

	public boolean method2948(int i, int i_790_, Class432 class432, boolean bool, int i_791_) {
		method14631(aClass180_Sub1_9171.method14835(Thread.currentThread()));
		Class427 class427 = aClass101_9163.aClass427_1188;
		class427.method6784(class432);
		Class427 class427_792_ = aClass101_9163.aClass427_1204;
		class427_792_.method6750(class427);
		class427_792_.method6751(aClass180_Sub1_9171.aClass427_9403);
		boolean bool_793_ = false;
		int i_794_ = 2147483647;
		int i_795_ = -2147483648;
		int i_796_ = 2147483647;
		int i_797_ = -2147483648;
		if (!aBool9221)
			method14659();
		int i_798_ = aShort9173 - aShort9226 >> 1;
		int i_799_ = aShort9237 - aShort9223 >> 1;
		int i_800_ = aShort9229 - aShort9228 >> 1;
		int i_801_ = aShort9226 + i_798_;
		int i_802_ = aShort9223 + i_799_;
		int i_803_ = aShort9228 + i_800_;
		int i_804_ = i_801_ - (i_798_ << i_791_);
		int i_805_ = i_802_ - (i_799_ << i_791_);
		int i_806_ = i_803_ - (i_800_ << i_791_);
		int i_807_ = i_801_ + (i_798_ << i_791_);
		int i_808_ = i_802_ + (i_799_ << i_791_);
		int i_809_ = i_803_ + (i_800_ << i_791_);
		anIntArray9240[0] = i_804_;
		anIntArray9241[0] = i_805_;
		anIntArray9176[0] = i_806_;
		anIntArray9240[1] = i_807_;
		anIntArray9241[1] = i_805_;
		anIntArray9176[1] = i_806_;
		anIntArray9240[2] = i_804_;
		anIntArray9241[2] = i_808_;
		anIntArray9176[2] = i_806_;
		anIntArray9240[3] = i_807_;
		anIntArray9241[3] = i_808_;
		anIntArray9176[3] = i_806_;
		anIntArray9240[4] = i_804_;
		anIntArray9241[4] = i_805_;
		anIntArray9176[4] = i_809_;
		anIntArray9240[5] = i_807_;
		anIntArray9241[5] = i_805_;
		anIntArray9176[5] = i_809_;
		anIntArray9240[6] = i_804_;
		anIntArray9241[6] = i_808_;
		anIntArray9176[6] = i_809_;
		anIntArray9240[7] = i_807_;
		anIntArray9241[7] = i_808_;
		anIntArray9176[7] = i_809_;
		for (int i_810_ = 0; i_810_ < 8; i_810_++) {
			int i_811_ = anIntArray9240[i_810_];
			int i_812_ = anIntArray9241[i_810_];
			int i_813_ = anIntArray9176[i_810_];
			float f = (class427_792_.aFloatArray4807[2] * (float) i_811_ + class427_792_.aFloatArray4807[6] * (float) i_812_ + class427_792_.aFloatArray4807[10] * (float) i_813_ + class427_792_.aFloatArray4807[14]);
			float f_814_ = (class427_792_.aFloatArray4807[3] * (float) i_811_ + class427_792_.aFloatArray4807[7] * (float) i_812_ + class427_792_.aFloatArray4807[11] * (float) i_813_ + class427_792_.aFloatArray4807[15]);
			if (f >= -f_814_) {
				float f_815_ = (class427_792_.aFloatArray4807[0] * (float) i_811_ + class427_792_.aFloatArray4807[4] * (float) i_812_ + class427_792_.aFloatArray4807[8] * (float) i_813_ + class427_792_.aFloatArray4807[12]);
				float f_816_ = (class427_792_.aFloatArray4807[1] * (float) i_811_ + class427_792_.aFloatArray4807[5] * (float) i_812_ + class427_792_.aFloatArray4807[9] * (float) i_813_ + class427_792_.aFloatArray4807[13]);
				int i_817_ = (int) (aClass180_Sub1_9171.aFloat9410 + (aClass180_Sub1_9171.aFloat9419 * f_815_ / f_814_));
				int i_818_ = (int) (aClass180_Sub1_9171.aFloat9412 + (aClass180_Sub1_9171.aFloat9395 * f_816_ / f_814_));
				if (i_817_ < i_794_)
					i_794_ = i_817_;
				if (i_817_ > i_795_)
					i_795_ = i_817_;
				if (i_818_ < i_796_)
					i_796_ = i_818_;
				if (i_818_ > i_797_)
					i_797_ = i_818_;
				bool_793_ = true;
			}
		}
		if (bool_793_ && i > i_794_ && i < i_795_ && i_790_ > i_796_ && i_790_ < i_797_) {
			if (bool)
				return true;
			for (int i_819_ = 0; i_819_ < anInt9177; i_819_++) {
				int i_820_ = anIntArray9191[i_819_];
				int i_821_ = anIntArray9184[i_819_];
				int i_822_ = anIntArray9161[i_819_];
				float f = (class427_792_.aFloatArray4807[2] * (float) i_820_ + class427_792_.aFloatArray4807[6] * (float) i_821_ + class427_792_.aFloatArray4807[10] * (float) i_822_ + class427_792_.aFloatArray4807[14]);
				float f_823_ = (class427_792_.aFloatArray4807[3] * (float) i_820_ + class427_792_.aFloatArray4807[7] * (float) i_821_ + class427_792_.aFloatArray4807[11] * (float) i_822_ + class427_792_.aFloatArray4807[15]);
				if (f >= -f_823_) {
					float f_824_ = (class427_792_.aFloatArray4807[0] * (float) i_820_ + class427_792_.aFloatArray4807[4] * (float) i_821_ + class427_792_.aFloatArray4807[8] * (float) i_822_ + class427_792_.aFloatArray4807[12]);
					float f_825_ = (class427_792_.aFloatArray4807[1] * (float) i_820_ + class427_792_.aFloatArray4807[5] * (float) i_821_ + class427_792_.aFloatArray4807[9] * (float) i_822_ + class427_792_.aFloatArray4807[13]);
					aFloatArray9167[i_819_] = (float) (int) (aClass180_Sub1_9171.aFloat9410 + (aClass180_Sub1_9171.aFloat9419 * f_824_ / f_823_));
					aFloatArray9198[i_819_] = (float) (int) (aClass180_Sub1_9171.aFloat9412 + (aClass180_Sub1_9171.aFloat9395 * f_825_ / f_823_));
				} else
					aFloatArray9167[i_819_] = -999999.0F;
			}
			for (int i_826_ = 0; i_826_ < anInt9186; i_826_++) {
				if (aFloatArray9167[aShortArray9187[i_826_]] != -999999.0F && aFloatArray9167[aShortArray9188[i_826_]] != -999999.0F && aFloatArray9167[aShortArray9189[i_826_]] != -999999.0F && method14663(i, i_790_, aFloatArray9198[aShortArray9187[i_826_]], aFloatArray9198[aShortArray9188[i_826_]], aFloatArray9198[aShortArray9189[i_826_]], aFloatArray9167[aShortArray9187[i_826_]], aFloatArray9167[aShortArray9188[i_826_]], aFloatArray9167[aShortArray9189[i_826_]]))
					return true;
			}
		}
		return false;
	}

	public byte[] method2900() {
		return aByteArray9202;
	}

	public int method2896() {
		if (!aBool9221)
			method14659();
		return aShort9223;
	}

	void method14654() {
		synchronized (this) {
			for (int i = 0; i < anInt9231; i++) {
				int i_827_ = anIntArray9191[i];
				anIntArray9191[i] = anIntArray9161[i];
				anIntArray9161[i] = -i_827_;
				if (aClass114Array9236[i] != null) {
					i_827_ = aClass114Array9236[i].anInt1412;
					aClass114Array9236[i].anInt1412 = aClass114Array9236[i].anInt1410;
					aClass114Array9236[i].anInt1410 = -i_827_;
				}
			}
			if (aClass113Array9199 != null) {
				for (int i = 0; i < anInt9185; i++) {
					if (aClass113Array9199[i] != null) {
						int i_828_ = aClass113Array9199[i].anInt1407;
						aClass113Array9199[i].anInt1407 = aClass113Array9199[i].anInt1409;
						aClass113Array9199[i].anInt1409 = -i_828_;
					}
				}
			}
			for (int i = anInt9231; i < anInt9177; i++) {
				int i_829_ = anIntArray9191[i];
				anIntArray9191[i] = anIntArray9161[i];
				anIntArray9161[i] = -i_829_;
			}
			anInt9246 = 0;
			aBool9221 = false;
		}
	}

	public int method2898() {
		if (!aBool9221)
			method14659();
		return aShort9228;
	}

	public int method2890() {
		if (!aBool9221)
			method14659();
		return aShort9229;
	}

	final void method14655(boolean bool, boolean bool_830_, boolean bool_831_, int i) {
		boolean bool_832_ = false;
		if (aShortArray9162 != null && aShortArray9162[i] != -1)
			bool_832_ = (aClass180_Sub1_9171.aClass181_2059.method3544(aShortArray9162[i] & 0xffff, (byte) -11).aBool1761);
		if (!aClass101_9163.aBool1196) {
			short i_833_ = aShortArray9187[i];
			short i_834_ = aShortArray9188[i];
			short i_835_ = aShortArray9189[i];
			Class427 class427 = aClass180_Sub1_9171.aClass427_9402;
			float f = class427.aFloatArray4807[10];
			float f_836_ = class427.aFloatArray4807[14];
			float f_837_ = class427.aFloatArray4807[11];
			float f_838_ = class427.aFloatArray4807[15];
			float f_839_ = f_836_ * f_837_ - f * f_838_;
			float f_840_ = ((aFloatArray9238[i_833_] - aClass101_9163.aFloat1222) * aClass101_9163.aFloat1223);
			float f_841_ = ((aFloatArray9238[i_834_] - aClass101_9163.aFloat1222) * aClass101_9163.aFloat1223);
			float f_842_ = ((aFloatArray9238[i_835_] - aClass101_9163.aFloat1222) * aClass101_9163.aFloat1223);
			float f_843_ = f_840_ * f_839_ / (f_840_ * f_837_ - f);
			float f_844_ = f_841_ * f_839_ / (f_841_ * f_837_ - f);
			float f_845_ = f_842_ * f_839_ / (f_842_ * f_837_ - f);
			float f_846_ = ((f_843_ - aClass101_9163.aFloat1192) / aClass101_9163.aFloat1193);
			if (f_846_ > 1.0F)
				f_846_ = 1.0F;
			else if (f_846_ < 0.0F)
				f_846_ = 0.0F;
			float f_847_ = ((f_844_ - aClass101_9163.aFloat1192) / aClass101_9163.aFloat1193);
			if (f_847_ > 1.0F)
				f_847_ = 1.0F;
			else if (f_847_ < 0.0F)
				f_847_ = 0.0F;
			float f_848_ = ((f_845_ - aClass101_9163.aFloat1192) / aClass101_9163.aFloat1193);
			if (f_848_ > 1.0F)
				f_848_ = 1.0F;
			else if (f_848_ < 0.0F)
				f_848_ = 0.0F;
			float f_849_ = f_846_ + f_847_ + f_848_;
			if (!(f_849_ >= 3.0F)) {
				if (f_849_ <= 0.0F)
					method14652(bool, bool_830_, bool_831_, i);
				else {
					if (aByteArray9202 == null)
						aClass119_9165.anInt1441 = 0;
					else
						aClass119_9165.anInt1441 = aByteArray9202[i] & 0xff;
					if (!bool_832_) {
						if (anIntArray9194[i] == -1)
							aClass119_9165.method2106(bool, bool_830_, bool_831_, aFloatArray9198[i_833_], aFloatArray9198[i_834_], aFloatArray9198[i_835_], aFloatArray9167[i_833_], aFloatArray9167[i_834_], aFloatArray9167[i_835_], aFloatArray9238[i_833_], aFloatArray9238[i_834_], aFloatArray9238[i_835_], Class388.method6456((Class656.anIntArray8393[(anIntArray9192[i] & 0xffff)]), (aClass101_9163.anInt1194 * -1009384223), f_846_ * 255.0F, (byte) -18),
									Class388.method6456((Class656.anIntArray8393[(anIntArray9192[i] & 0xffff)]), (aClass101_9163.anInt1194 * -1009384223), f_847_ * 255.0F, (byte) 46), Class388.method6456((Class656.anIntArray8393[(anIntArray9192[i] & 0xffff)]), (aClass101_9163.anInt1194 * -1009384223), f_848_ * 255.0F, (byte) -59));
						else
							aClass119_9165.method2106(bool, bool_830_, bool_831_, aFloatArray9198[i_833_], aFloatArray9198[i_834_], aFloatArray9198[i_835_], aFloatArray9167[i_833_], aFloatArray9167[i_834_], aFloatArray9167[i_835_], aFloatArray9238[i_833_], aFloatArray9238[i_834_], aFloatArray9238[i_835_], Class388.method6456((Class656.anIntArray8393[(anIntArray9192[i] & 0xffff)]), (aClass101_9163.anInt1194 * -1009384223), f_846_ * 255.0F, (byte) -4),
									Class388.method6456((Class656.anIntArray8393[(anIntArray9180[i] & 0xffff)]), (aClass101_9163.anInt1194 * -1009384223), f_847_ * 255.0F, (byte) -110), Class388.method6456((Class656.anIntArray8393[(anIntArray9194[i] & 0xffff)]), (aClass101_9163.anInt1194 * -1009384223), f_848_ * 255.0F, (byte) 44));
					} else {
						int i_850_ = -16777216;
						if (aByteArray9202 != null)
							i_850_ = 255 - (aByteArray9202[i] & 0xff) << 24;
						if (anIntArray9194[i] == -1) {
							int i_851_ = i_850_ | anIntArray9192[i] & 0xffffff;
							aClass119_9165.method2079(bool, bool_830_, bool_831_, aFloatArray9198[i_833_], aFloatArray9198[i_834_], aFloatArray9198[i_835_], aFloatArray9167[i_833_], aFloatArray9167[i_834_], aFloatArray9167[i_835_], aFloatArray9238[i_833_], aFloatArray9238[i_834_], aFloatArray9238[i_835_], aFloatArray9239[i_833_], aFloatArray9239[i_834_], aFloatArray9239[i_835_], aFloatArrayArray9190[i][0], aFloatArrayArray9190[i][1], aFloatArrayArray9190[i][2], aFloatArrayArray9235[i][0],
									aFloatArrayArray9235[i][1], aFloatArrayArray9235[i][2], i_851_, i_851_, i_851_, aClass101_9163.anInt1194 * -1009384223, f_846_ * 255.0F, f_847_ * 255.0F, f_848_ * 255.0F, aShortArray9162[i] & 0xffff);
						} else
							aClass119_9165.method2079(bool, bool_830_, bool_831_, aFloatArray9198[i_833_], aFloatArray9198[i_834_], aFloatArray9198[i_835_], aFloatArray9167[i_833_], aFloatArray9167[i_834_], aFloatArray9167[i_835_], aFloatArray9238[i_833_], aFloatArray9238[i_834_], aFloatArray9238[i_835_], aFloatArray9239[i_833_], aFloatArray9239[i_834_], aFloatArray9239[i_835_], aFloatArrayArray9190[i][0], aFloatArrayArray9190[i][1], aFloatArrayArray9190[i][2], aFloatArrayArray9235[i][0],
									aFloatArrayArray9235[i][1], aFloatArrayArray9235[i][2], i_850_ | anIntArray9192[i] & 0xffffff, i_850_ | anIntArray9180[i] & 0xffffff, i_850_ | anIntArray9194[i] & 0xffffff, aClass101_9163.anInt1194 * -1009384223, f_846_ * 255.0F, f_847_ * 255.0F, f_848_ * 255.0F, aShortArray9162[i] & 0xffff);
					}
				}
			}
		} else {
			short i_852_ = aShortArray9187[i];
			short i_853_ = aShortArray9188[i];
			short i_854_ = aShortArray9189[i];
			float f = 0.0F;
			float f_855_ = 0.0F;
			float f_856_ = 0.0F;
			if (anIntArray9230[i_852_] > aClass101_9163.anInt1198 * 1247682779)
				f = 1.0F;
			else if (anIntArray9230[i_852_] > aClass101_9163.anInt1205 * -1275882393)
				f = ((float) (aClass101_9163.anInt1205 * -1275882393 - anIntArray9230[i_852_]) * 1.0F / (float) (aClass101_9163.anInt1205 * -1275882393 - aClass101_9163.anInt1198 * 1247682779));
			if (anIntArray9230[i_853_] > aClass101_9163.anInt1198 * 1247682779)
				f_855_ = 1.0F;
			else if (anIntArray9230[i_853_] > aClass101_9163.anInt1205 * -1275882393)
				f_855_ = ((float) (aClass101_9163.anInt1205 * -1275882393 - anIntArray9230[i_853_]) * 1.0F / (float) (aClass101_9163.anInt1205 * -1275882393 - aClass101_9163.anInt1198 * 1247682779));
			if (anIntArray9230[i_854_] > aClass101_9163.anInt1198 * 1247682779)
				f_856_ = 1.0F;
			else if (anIntArray9230[i_854_] > aClass101_9163.anInt1205 * -1275882393)
				f_856_ = ((float) (aClass101_9163.anInt1205 * -1275882393 - anIntArray9230[i_854_]) * 1.0F / (float) (aClass101_9163.anInt1205 * -1275882393 - aClass101_9163.anInt1198 * 1247682779));
			if (aByteArray9202 == null)
				aClass119_9165.anInt1441 = 0;
			else
				aClass119_9165.anInt1441 = aByteArray9202[i] & 0xff;
			if (!bool_832_) {
				if (anIntArray9194[i] == -1)
					aClass119_9165.method2106(bool, bool_830_, bool_831_, aFloatArray9198[i_852_], aFloatArray9198[i_853_], aFloatArray9198[i_854_], aFloatArray9167[i_852_], aFloatArray9167[i_853_], aFloatArray9167[i_854_], aFloatArray9238[i_852_], aFloatArray9238[i_853_], aFloatArray9238[i_854_], Class388.method6456((Class656.anIntArray8393[anIntArray9192[i] & 0xffff]), (aClass101_9163.anInt1194 * -1009384223), f * 255.0F, (byte) -45),
							Class388.method6456((Class656.anIntArray8393[anIntArray9192[i] & 0xffff]), (aClass101_9163.anInt1194 * -1009384223), f_855_ * 255.0F, (byte) -73), Class388.method6456((Class656.anIntArray8393[anIntArray9192[i] & 0xffff]), (aClass101_9163.anInt1194 * -1009384223), f_856_ * 255.0F, (byte) -39));
				else
					aClass119_9165.method2106(bool, bool_830_, bool_831_, aFloatArray9198[i_852_], aFloatArray9198[i_853_], aFloatArray9198[i_854_], aFloatArray9167[i_852_], aFloatArray9167[i_853_], aFloatArray9167[i_854_], aFloatArray9238[i_852_], aFloatArray9238[i_853_], aFloatArray9238[i_854_], Class388.method6456((Class656.anIntArray8393[anIntArray9192[i] & 0xffff]), (aClass101_9163.anInt1194 * -1009384223), f * 255.0F, (byte) 78),
							Class388.method6456((Class656.anIntArray8393[anIntArray9180[i] & 0xffff]), (aClass101_9163.anInt1194 * -1009384223), f_855_ * 255.0F, (byte) 95), Class388.method6456((Class656.anIntArray8393[anIntArray9194[i] & 0xffff]), (aClass101_9163.anInt1194 * -1009384223), f_856_ * 255.0F, (byte) 49));
			} else {
				int i_857_ = -16777216;
				if (aByteArray9202 != null)
					i_857_ = 255 - (aByteArray9202[i] & 0xff) << 24;
				if (anIntArray9194[i] == -1) {
					int i_858_ = i_857_ | anIntArray9192[i] & 0xffffff;
					aClass119_9165.method2079(bool, bool_830_, bool_831_, aFloatArray9198[i_852_], aFloatArray9198[i_853_], aFloatArray9198[i_854_], aFloatArray9167[i_852_], aFloatArray9167[i_853_], aFloatArray9167[i_854_], aFloatArray9238[i_852_], aFloatArray9238[i_853_], aFloatArray9238[i_854_], aFloatArray9239[i_852_], aFloatArray9239[i_853_], aFloatArray9239[i_854_], aFloatArrayArray9190[i][0], aFloatArrayArray9190[i][1], aFloatArrayArray9190[i][2], aFloatArrayArray9235[i][0],
							aFloatArrayArray9235[i][1], aFloatArrayArray9235[i][2], i_858_, i_858_, i_858_, aClass101_9163.anInt1194 * -1009384223, f * 255.0F, f_855_ * 255.0F, f_856_ * 255.0F, aShortArray9162[i] & 0xffff);
				} else
					aClass119_9165.method2079(bool, bool_830_, bool_831_, aFloatArray9198[i_852_], aFloatArray9198[i_853_], aFloatArray9198[i_854_], aFloatArray9167[i_852_], aFloatArray9167[i_853_], aFloatArray9167[i_854_], aFloatArray9238[i_852_], aFloatArray9238[i_853_], aFloatArray9238[i_854_], aFloatArray9239[i_852_], aFloatArray9239[i_853_], aFloatArray9239[i_854_], aFloatArrayArray9190[i][0], aFloatArrayArray9190[i][1], aFloatArrayArray9190[i][2], aFloatArrayArray9235[i][0],
							aFloatArrayArray9235[i][1], aFloatArrayArray9235[i][2], i_857_ | anIntArray9192[i] & 0xffffff, i_857_ | anIntArray9180[i] & 0xffffff, i_857_ | anIntArray9194[i] & 0xffffff, aClass101_9163.anInt1194 * -1009384223, f * 255.0F, f_855_ * 255.0F, f_856_ * 255.0F, aShortArray9162[i] & 0xffff);
			}
		}
	}

	public void method3019(int i) {
		if ((anInt9174 & 0x1000) != 4096)
			throw new IllegalStateException();
		anInt9175 = i;
		anInt9246 = 0;
	}

	public void method2903(int i) {
		if ((anInt9174 & 0x2000) != 8192)
			throw new IllegalStateException();
		anInt9179 = i;
		anInt9246 = 0;
	}

	void method14656() {
		if (anInt9246 == 0)
			method14634(false);
		else if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
			synchronized (this) {
				method14716();
			}
		} else
			method14716();
	}

	boolean method14657(int i, int i_859_, float f, float f_860_, float f_861_, float f_862_, float f_863_, float f_864_) {
		if ((float) i_859_ < f && (float) i_859_ < f_860_ && (float) i_859_ < f_861_)
			return false;
		if ((float) i_859_ > f && (float) i_859_ > f_860_ && (float) i_859_ > f_861_)
			return false;
		if ((float) i < f_862_ && (float) i < f_863_ && (float) i < f_864_)
			return false;
		if ((float) i > f_862_ && (float) i > f_863_ && (float) i > f_864_)
			return false;
		return true;
	}

	public byte[] method2906() {
		return aByteArray9202;
	}

	public void method2937(int i) {
		if ((anInt9174 & 0x5) != 5)
			throw new IllegalStateException();
		if (i == 4096)
			method14640();
		else if (i == 8192)
			method14641();
		else if (i == 12288)
			method14647();
		else {
			int i_865_ = Class428.anIntArray4825[i];
			int i_866_ = Class428.anIntArray4819[i];
			synchronized (this) {
				for (int i_867_ = 0; i_867_ < anInt9177; i_867_++) {
					int i_868_ = ((anIntArray9161[i_867_] * i_865_ + anIntArray9191[i_867_] * i_866_) >> 14);
					anIntArray9161[i_867_] = (anIntArray9161[i_867_] * i_866_ - anIntArray9191[i_867_] * i_865_) >> 14;
					anIntArray9191[i_867_] = i_868_;
				}
				method14645();
			}
		}
	}

	public boolean method3010() {
		return aBool9232;
	}

	public void method2909(short i, short i_869_) {
		if (aShortArray9162 != null) {
			if (!aBool9233 && i_869_ >= 0) {
				Class163 class163 = aClass180_Sub1_9171.aClass181_2059.method3544(i_869_ & 0xffff, (byte) -97);
				if (class163.aByte1781 != 0 || class163.aByte1797 != 0)
					aBool9233 = true;
			}
			for (int i_870_ = 0; i_870_ < anInt9185; i_870_++) {
				if (aShortArray9162[i_870_] == i)
					aShortArray9162[i_870_] = i_869_;
			}
		}
	}

	public void method2986(int i, int i_871_, int i_872_, int i_873_) {
		if ((anInt9174 & 0x80000) != 524288)
			throw new IllegalStateException();
		for (int i_874_ = 0; i_874_ < anInt9185; i_874_++) {
			int i_875_ = aShortArray9193[i_874_] & 0xffff;
			int i_876_ = i_875_ >> 10 & 0x3f;
			int i_877_ = i_875_ >> 7 & 0x7;
			int i_878_ = i_875_ & 0x7f;
			if (i != -1)
				i_876_ += (i - i_876_) * i_873_ >> 7;
			if (i_871_ != -1)
				i_877_ += (i_871_ - i_877_) * i_873_ >> 7;
			if (i_872_ != -1)
				i_878_ += (i_872_ - i_878_) * i_873_ >> 7;
			aShortArray9193[i_874_] = (short) (i_876_ << 10 | i_877_ << 7 | i_878_);
		}
		if (aClass116Array9218 != null) {
			for (int i_879_ = 0; i_879_ < anInt9217; i_879_++) {
				Class116 class116 = aClass116Array9218[i_879_];
				Class108 class108 = aClass108Array9211[i_879_];
				class108.anInt1351 = (class108.anInt1351 * 328110239 & ~0xffffff | ((Class656.anIntArray8393[Class453.method7333((aShortArray9193[(class116.anInt1421 * 1723945109)]) & 0xffff, (byte) 10) & 0xffff]) & 0xffffff)) * 120490847;
			}
		}
		if (anInt9246 == 2)
			anInt9246 = 1;
	}

	public Class167[] method2915() {
		return aClass167Array9215;
	}

	void method14658() {
		if (anInt9246 == 0)
			method14634(false);
		else if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
			synchronized (this) {
				method14716();
			}
		} else
			method14716();
	}

	public boolean method3035() {
		if (aShortArray9162 == null)
			return true;
		for (int i = 0; i < aShortArray9162.length; i++) {
			if (aShortArray9162[i] != -1 && !aClass180_Sub1_9171.method14821(aShortArray9162[i]))
				return false;
		}
		return true;
	}

	public boolean method2949() {
		return aBool9232;
	}

	public boolean method2913() {
		return aBool9233;
	}

	void method14659() {
		if (!aBool9221) {
			int i = 0;
			int i_880_ = 0;
			int i_881_ = 32767;
			int i_882_ = 32767;
			int i_883_ = 32767;
			int i_884_ = -32768;
			int i_885_ = -32768;
			int i_886_ = -32768;
			for (int i_887_ = 0; i_887_ < anInt9231; i_887_++) {
				int i_888_ = anIntArray9191[i_887_];
				int i_889_ = anIntArray9184[i_887_];
				int i_890_ = anIntArray9161[i_887_];
				if (i_888_ < i_881_)
					i_881_ = i_888_;
				if (i_888_ > i_884_)
					i_884_ = i_888_;
				if (i_889_ < i_882_)
					i_882_ = i_889_;
				if (i_889_ > i_885_)
					i_885_ = i_889_;
				if (i_890_ < i_883_)
					i_883_ = i_890_;
				if (i_890_ > i_886_)
					i_886_ = i_890_;
				int i_891_ = i_888_ * i_888_ + i_890_ * i_890_;
				if (i_891_ > i)
					i = i_891_;
				i_891_ += i_889_ * i_889_;
				if (i_891_ > i_880_)
					i_880_ = i_891_;
			}
			aShort9226 = (short) i_881_;
			aShort9173 = (short) i_884_;
			aShort9223 = (short) i_882_;
			aShort9237 = (short) i_885_;
			aShort9228 = (short) i_883_;
			aShort9229 = (short) i_886_;
			aShort9196 = (short) (int) (Math.sqrt((double) i) + 0.99);
			aShort9222 = (short) (int) (Math.sqrt((double) i_880_) + 0.99);
			aBool9221 = true;
		}
	}

	void method14660(Class101 class101) {
		aClass119_9165 = class101.aClass119_1197;
		if (class101 != aClass101_9163) {
			aClass101_9163 = class101;
			anIntArray9230 = aClass101_9163.anIntArray1232;
			aFloatArray9167 = aClass101_9163.aFloatArray1207;
			aFloatArray9198 = aClass101_9163.aFloatArray1208;
			aFloatArray9238 = aClass101_9163.aFloatArray1213;
			aFloatArray9239 = aClass101_9163.aFloatArray1210;
			anIntArray9240 = aClass101_9163.anIntArray1211;
			anIntArray9241 = aClass101_9163.anIntArray1217;
			anIntArray9176 = aClass101_9163.anIntArray1200;
			anIntArray9243 = aClass101_9163.anIntArray1214;
			anIntArray9244 = aClass101_9163.anIntArray1215;
			anIntArray9245 = aClass101_9163.anIntArray1216;
		}
	}

	void method14661(Class101 class101) {
		aClass119_9165 = class101.aClass119_1197;
		if (class101 != aClass101_9163) {
			aClass101_9163 = class101;
			anIntArray9230 = aClass101_9163.anIntArray1232;
			aFloatArray9167 = aClass101_9163.aFloatArray1207;
			aFloatArray9198 = aClass101_9163.aFloatArray1208;
			aFloatArray9238 = aClass101_9163.aFloatArray1213;
			aFloatArray9239 = aClass101_9163.aFloatArray1210;
			anIntArray9240 = aClass101_9163.anIntArray1211;
			anIntArray9241 = aClass101_9163.anIntArray1217;
			anIntArray9176 = aClass101_9163.anIntArray1200;
			anIntArray9243 = aClass101_9163.anIntArray1214;
			anIntArray9244 = aClass101_9163.anIntArray1215;
			anIntArray9245 = aClass101_9163.anIntArray1216;
		}
	}

	void method14662(Thread thread) {
		Class101 class101 = aClass180_Sub1_9171.method14835(thread);
		if (class101 != aClass101_9164) {
			aClass101_9164 = class101;
			aClass176_Sub2Array9183 = aClass101_9164.aClass176_Sub2Array1226;
			aClass176_Sub2Array9225 = aClass101_9164.aClass176_Sub2Array1190;
		}
	}

	boolean method14663(int i, int i_892_, float f, float f_893_, float f_894_, float f_895_, float f_896_, float f_897_) {
		if ((float) i_892_ < f && (float) i_892_ < f_893_ && (float) i_892_ < f_894_)
			return false;
		if ((float) i_892_ > f && (float) i_892_ > f_893_ && (float) i_892_ > f_894_)
			return false;
		if ((float) i < f_895_ && (float) i < f_896_ && (float) i < f_897_)
			return false;
		if ((float) i > f_895_ && (float) i > f_896_ && (float) i > f_897_)
			return false;
		return true;
	}

	void method14664() {
		if (anInt9246 == 0 && aClass114Array9236 == null) {
			if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
				synchronized (this) {
					method14633();
				}
			} else
				method14633();
		}
	}

	void method14665() {
		if (anInt9246 == 0 && aClass114Array9236 == null) {
			if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
				synchronized (this) {
					method14633();
				}
			} else
				method14633();
		}
	}

	void method14666() {
		if (anInt9246 == 0 && aClass114Array9236 == null) {
			if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
				synchronized (this) {
					method14633();
				}
			} else
				method14633();
		}
	}

	void method14667() {
		aClass114Array9236 = new Class114[anInt9231];
		for (int i = 0; i < anInt9231; i++)
			aClass114Array9236[i] = new Class114();
		for (int i = 0; i < anInt9185; i++) {
			short i_898_ = aShortArray9187[i];
			short i_899_ = aShortArray9188[i];
			short i_900_ = aShortArray9189[i];
			int i_901_ = anIntArray9191[i_899_] - anIntArray9191[i_898_];
			int i_902_ = anIntArray9184[i_899_] - anIntArray9184[i_898_];
			int i_903_ = anIntArray9161[i_899_] - anIntArray9161[i_898_];
			int i_904_ = anIntArray9191[i_900_] - anIntArray9191[i_898_];
			int i_905_ = anIntArray9184[i_900_] - anIntArray9184[i_898_];
			int i_906_ = anIntArray9161[i_900_] - anIntArray9161[i_898_];
			int i_907_ = i_902_ * i_906_ - i_905_ * i_903_;
			int i_908_ = i_903_ * i_904_ - i_906_ * i_901_;
			int i_909_;
			for (i_909_ = i_901_ * i_905_ - i_904_ * i_902_; (i_907_ > 8192 || i_908_ > 8192 || i_909_ > 8192 || i_907_ < -8192 || i_908_ < -8192 || i_909_ < -8192); i_909_ >>= 1) {
				i_907_ >>= 1;
				i_908_ >>= 1;
			}
			int i_910_ = (int) Math.sqrt((double) (i_907_ * i_907_ + i_908_ * i_908_ + i_909_ * i_909_));
			if (i_910_ <= 0)
				i_910_ = 1;
			i_907_ = i_907_ * 256 / i_910_;
			i_908_ = i_908_ * 256 / i_910_;
			i_909_ = i_909_ * 256 / i_910_;
			byte i_911_;
			if (aByteArray9200 == null)
				i_911_ = (byte) 0;
			else
				i_911_ = aByteArray9200[i];
			if (i_911_ == 0) {
				Class114 class114 = aClass114Array9236[i_898_];
				class114.anInt1412 += i_907_;
				class114.anInt1411 += i_908_;
				class114.anInt1410 += i_909_;
				class114.anInt1413++;
				class114 = aClass114Array9236[i_899_];
				class114.anInt1412 += i_907_;
				class114.anInt1411 += i_908_;
				class114.anInt1410 += i_909_;
				class114.anInt1413++;
				class114 = aClass114Array9236[i_900_];
				class114.anInt1412 += i_907_;
				class114.anInt1411 += i_908_;
				class114.anInt1410 += i_909_;
				class114.anInt1413++;
			} else if (i_911_ == 1) {
				if (aClass113Array9199 == null)
					aClass113Array9199 = new Class113[anInt9185];
				Class113 class113 = aClass113Array9199[i] = new Class113();
				class113.anInt1407 = i_907_;
				class113.anInt1408 = i_908_;
				class113.anInt1409 = i_909_;
			}
		}
	}

	void method14668() {
		aClass114Array9236 = new Class114[anInt9231];
		for (int i = 0; i < anInt9231; i++)
			aClass114Array9236[i] = new Class114();
		for (int i = 0; i < anInt9185; i++) {
			short i_912_ = aShortArray9187[i];
			short i_913_ = aShortArray9188[i];
			short i_914_ = aShortArray9189[i];
			int i_915_ = anIntArray9191[i_913_] - anIntArray9191[i_912_];
			int i_916_ = anIntArray9184[i_913_] - anIntArray9184[i_912_];
			int i_917_ = anIntArray9161[i_913_] - anIntArray9161[i_912_];
			int i_918_ = anIntArray9191[i_914_] - anIntArray9191[i_912_];
			int i_919_ = anIntArray9184[i_914_] - anIntArray9184[i_912_];
			int i_920_ = anIntArray9161[i_914_] - anIntArray9161[i_912_];
			int i_921_ = i_916_ * i_920_ - i_919_ * i_917_;
			int i_922_ = i_917_ * i_918_ - i_920_ * i_915_;
			int i_923_;
			for (i_923_ = i_915_ * i_919_ - i_918_ * i_916_; (i_921_ > 8192 || i_922_ > 8192 || i_923_ > 8192 || i_921_ < -8192 || i_922_ < -8192 || i_923_ < -8192); i_923_ >>= 1) {
				i_921_ >>= 1;
				i_922_ >>= 1;
			}
			int i_924_ = (int) Math.sqrt((double) (i_921_ * i_921_ + i_922_ * i_922_ + i_923_ * i_923_));
			if (i_924_ <= 0)
				i_924_ = 1;
			i_921_ = i_921_ * 256 / i_924_;
			i_922_ = i_922_ * 256 / i_924_;
			i_923_ = i_923_ * 256 / i_924_;
			byte i_925_;
			if (aByteArray9200 == null)
				i_925_ = (byte) 0;
			else
				i_925_ = aByteArray9200[i];
			if (i_925_ == 0) {
				Class114 class114 = aClass114Array9236[i_912_];
				class114.anInt1412 += i_921_;
				class114.anInt1411 += i_922_;
				class114.anInt1410 += i_923_;
				class114.anInt1413++;
				class114 = aClass114Array9236[i_913_];
				class114.anInt1412 += i_921_;
				class114.anInt1411 += i_922_;
				class114.anInt1410 += i_923_;
				class114.anInt1413++;
				class114 = aClass114Array9236[i_914_];
				class114.anInt1412 += i_921_;
				class114.anInt1411 += i_922_;
				class114.anInt1410 += i_923_;
				class114.anInt1413++;
			} else if (i_925_ == 1) {
				if (aClass113Array9199 == null)
					aClass113Array9199 = new Class113[anInt9185];
				Class113 class113 = aClass113Array9199[i] = new Class113();
				class113.anInt1407 = i_921_;
				class113.anInt1408 = i_922_;
				class113.anInt1409 = i_923_;
			}
		}
	}

	final void method14669(boolean bool, boolean bool_926_, boolean bool_927_, int i) {
		short i_928_ = aShortArray9187[i];
		short i_929_ = aShortArray9188[i];
		short i_930_ = aShortArray9189[i];
		boolean bool_931_ = false;
		if (aShortArray9162 != null && aShortArray9162[i] != -1)
			bool_931_ = (aClass180_Sub1_9171.aClass181_2059.method3544(aShortArray9162[i] & 0xffff, (byte) -90).aBool1761);
		if (!bool_931_) {
			if (aByteArray9202 == null)
				aClass119_9165.anInt1441 = 0;
			else
				aClass119_9165.anInt1441 = aByteArray9202[i] & 0xff;
			if (anIntArray9194[i] == -1)
				aClass119_9165.method2077(bool, bool_926_, bool_927_, aFloatArray9198[i_928_], aFloatArray9198[i_929_], aFloatArray9198[i_930_], aFloatArray9167[i_928_], aFloatArray9167[i_929_], aFloatArray9167[i_930_], aFloatArray9238[i_928_], aFloatArray9238[i_929_], aFloatArray9238[i_930_], Class656.anIntArray8393[anIntArray9192[i] & 0xffff]);
			else
				aClass119_9165.method2073(bool, bool_926_, bool_927_, aFloatArray9198[i_928_], aFloatArray9198[i_929_], aFloatArray9198[i_930_], aFloatArray9167[i_928_], aFloatArray9167[i_929_], aFloatArray9167[i_930_], aFloatArray9238[i_928_], aFloatArray9238[i_929_], aFloatArray9238[i_930_], (float) (anIntArray9192[i] & 0xffff), (float) (anIntArray9180[i] & 0xffff), (float) (anIntArray9194[i] & 0xffff));
		} else {
			int i_932_ = -16777216;
			if (aByteArray9202 != null)
				i_932_ = 255 - (aByteArray9202[i] & 0xff) << 24;
			if (anIntArray9194[i] == -1) {
				int i_933_ = i_932_ | anIntArray9192[i] & 0xffffff;
				aClass119_9165.method2079(bool, bool_926_, bool_927_, aFloatArray9198[i_928_], aFloatArray9198[i_929_], aFloatArray9198[i_930_], aFloatArray9167[i_928_], aFloatArray9167[i_929_], aFloatArray9167[i_930_], aFloatArray9238[i_928_], aFloatArray9238[i_929_], aFloatArray9238[i_930_], aFloatArray9239[i_928_], aFloatArray9239[i_929_], aFloatArray9239[i_930_], aFloatArrayArray9190[i][0], aFloatArrayArray9190[i][1], aFloatArrayArray9190[i][2], aFloatArrayArray9235[i][0],
						aFloatArrayArray9235[i][1], aFloatArrayArray9235[i][2], i_933_, i_933_, i_933_, aClass101_9163.anInt1194 * -1009384223, 0.0F, 0.0F, 0.0F, aShortArray9162[i] & 0xffff);
			} else
				aClass119_9165.method2079(bool, bool_926_, bool_927_, aFloatArray9198[i_928_], aFloatArray9198[i_929_], aFloatArray9198[i_930_], aFloatArray9167[i_928_], aFloatArray9167[i_929_], aFloatArray9167[i_930_], aFloatArray9238[i_928_], aFloatArray9238[i_929_], aFloatArray9238[i_930_], aFloatArray9239[i_928_], aFloatArray9239[i_929_], aFloatArray9239[i_930_], aFloatArrayArray9190[i][0], aFloatArrayArray9190[i][1], aFloatArrayArray9190[i][2], aFloatArrayArray9235[i][0],
						aFloatArrayArray9235[i][1], aFloatArrayArray9235[i][2], i_932_ | anIntArray9192[i] & 0xffffff, i_932_ | anIntArray9180[i] & 0xffffff, i_932_ | anIntArray9194[i] & 0xffffff, aClass101_9163.anInt1194 * -1009384223, 0.0F, 0.0F, 0.0F, aShortArray9162[i] & 0xffff);
		}
	}

	public int method2987() {
		if (!aBool9168)
			method2901();
		return aShort9242;
	}

	public Class527_Sub8_Sub8 method2904(Class527_Sub8_Sub8 class527_sub8_sub8) {
		return null;
	}

	void method14670(boolean bool) {
		if (anInt9246 == 1)
			method14656();
		else if (anInt9246 == 2) {
			if ((anInt9174 & 0x97098) == 0 && aFloatArrayArray9190 == null)
				aShortArray9193 = null;
			if (bool)
				aByteArray9200 = null;
		} else {
			method14632();
			int i = aClass180_Sub1_9171.anInt9413 * -1353141313;
			int i_934_ = aClass180_Sub1_9171.anInt9409 * 748091021;
			int i_935_ = aClass180_Sub1_9171.anInt9394 * -1663247975;
			int i_936_ = aClass180_Sub1_9171.anInt9399 * -1757876199 >> 8;
			int i_937_ = 0;
			int i_938_ = 0;
			if (anInt9179 != 0) {
				i_937_ = aClass180_Sub1_9171.anInt9397 * 1789958400 / anInt9179;
				i_938_ = aClass180_Sub1_9171.anInt9408 * -1863567104 / anInt9179;
			}
			if (anIntArray9192 == null) {
				anIntArray9192 = new int[anInt9185];
				anIntArray9180 = new int[anInt9185];
				anIntArray9194 = new int[anInt9185];
			}
			for (int i_939_ = 0; i_939_ < anInt9185; i_939_++) {
				byte i_940_;
				if (aByteArray9200 == null)
					i_940_ = (byte) 0;
				else
					i_940_ = aByteArray9200[i_939_];
				byte i_941_;
				if (aByteArray9202 == null)
					i_941_ = (byte) 0;
				else
					i_941_ = aByteArray9202[i_939_];
				short i_942_;
				if (aShortArray9162 == null)
					i_942_ = (short) -1;
				else
					i_942_ = aShortArray9162[i_939_];
				if (i_941_ == -2)
					i_940_ = (byte) 3;
				if (i_941_ == -1)
					i_940_ = (byte) 2;
				if (i_942_ == -1) {
					if (i_940_ == 0) {
						int i_943_ = aShortArray9193[i_939_] & 0xffff;
						int i_944_ = (i_943_ & 0x7f) * anInt9175 >> 7;
						short i_945_ = Class453.method7333(i_943_ & ~0x7f | i_944_, (byte) 10);
						Class114 class114;
						if (aClass114Array9203 != null && (aClass114Array9203[aShortArray9187[i_939_]] != null))
							class114 = aClass114Array9203[aShortArray9187[i_939_]];
						else
							class114 = aClass114Array9236[aShortArray9187[i_939_]];
						int i_946_ = (((i * class114.anInt1412 + i_934_ * class114.anInt1411 + i_935_ * class114.anInt1410) / class114.anInt1413) >> 16);
						int i_947_ = i_946_ > 256 ? i_937_ : i_938_;
						int i_948_ = (i_936_ >> 1) + (i_947_ * i_946_ >> 17);
						anIntArray9192[i_939_] = i_948_ << 17 | Class395.method6504(i_945_, i_948_, -501584282);
						if (aClass114Array9203 != null && (aClass114Array9203[aShortArray9188[i_939_]] != null))
							class114 = aClass114Array9203[aShortArray9188[i_939_]];
						else
							class114 = aClass114Array9236[aShortArray9188[i_939_]];
						i_946_ = ((i * class114.anInt1412 + i_934_ * class114.anInt1411 + i_935_ * class114.anInt1410) / class114.anInt1413) >> 16;
						i_947_ = i_946_ > 256 ? i_937_ : i_938_;
						i_948_ = (i_936_ >> 1) + (i_947_ * i_946_ >> 17);
						anIntArray9180[i_939_] = i_948_ << 17 | Class395.method6504(i_945_, i_948_, -501584282);
						if (aClass114Array9203 != null && (aClass114Array9203[aShortArray9189[i_939_]] != null))
							class114 = aClass114Array9203[aShortArray9189[i_939_]];
						else
							class114 = aClass114Array9236[aShortArray9189[i_939_]];
						i_946_ = ((i * class114.anInt1412 + i_934_ * class114.anInt1411 + i_935_ * class114.anInt1410) / class114.anInt1413) >> 16;
						i_947_ = i_946_ > 256 ? i_937_ : i_938_;
						i_948_ = (i_936_ >> 1) + (i_947_ * i_946_ >> 17);
						anIntArray9194[i_939_] = i_948_ << 17 | Class395.method6504(i_945_, i_948_, -501584282);
					} else if (i_940_ == 1) {
						int i_949_ = aShortArray9193[i_939_] & 0xffff;
						int i_950_ = (i_949_ & 0x7f) * anInt9175 >> 7;
						short i_951_ = Class453.method7333(i_949_ & ~0x7f | i_950_, (byte) 10);
						Class113 class113 = aClass113Array9199[i_939_];
						int i_952_ = ((i * class113.anInt1407 + i_934_ * class113.anInt1408 + i_935_ * class113.anInt1409) >> 16);
						int i_953_ = i_952_ > 256 ? i_937_ : i_938_;
						int i_954_ = (i_936_ >> 1) + (i_953_ * i_952_ >> 17);
						anIntArray9192[i_939_] = i_954_ << 17 | Class395.method6504(i_951_, i_954_, -501584282);
						anIntArray9194[i_939_] = -1;
					} else if (i_940_ == 3) {
						anIntArray9192[i_939_] = 128;
						anIntArray9194[i_939_] = -1;
					} else
						anIntArray9194[i_939_] = -2;
				} else {
					int i_955_ = aShortArray9193[i_939_] & 0xffff;
					if (i_940_ == 0) {
						Class114 class114;
						if (aClass114Array9203 != null && (aClass114Array9203[aShortArray9187[i_939_]] != null))
							class114 = aClass114Array9203[aShortArray9187[i_939_]];
						else
							class114 = aClass114Array9236[aShortArray9187[i_939_]];
						int i_956_ = (((i * class114.anInt1412 + i_934_ * class114.anInt1411 + i_935_ * class114.anInt1410) / class114.anInt1413) >> 16);
						int i_957_ = i_956_ > 256 ? i_937_ : i_938_;
						int i_958_ = method14637((i_936_ >> 2) + (i_957_ * i_956_ >> 18));
						anIntArray9192[i_939_] = i_958_ << 24 | method14635(i_955_, i_942_, i_958_);
						if (aClass114Array9203 != null && (aClass114Array9203[aShortArray9188[i_939_]] != null))
							class114 = aClass114Array9203[aShortArray9188[i_939_]];
						else
							class114 = aClass114Array9236[aShortArray9188[i_939_]];
						i_956_ = ((i * class114.anInt1412 + i_934_ * class114.anInt1411 + i_935_ * class114.anInt1410) / class114.anInt1413) >> 16;
						i_957_ = i_956_ > 256 ? i_937_ : i_938_;
						i_958_ = method14637((i_936_ >> 2) + (i_957_ * i_956_ >> 18));
						anIntArray9180[i_939_] = i_958_ << 24 | method14635(i_955_, i_942_, i_958_);
						if (aClass114Array9203 != null && (aClass114Array9203[aShortArray9189[i_939_]] != null))
							class114 = aClass114Array9203[aShortArray9189[i_939_]];
						else
							class114 = aClass114Array9236[aShortArray9189[i_939_]];
						i_956_ = ((i * class114.anInt1412 + i_934_ * class114.anInt1411 + i_935_ * class114.anInt1410) / class114.anInt1413) >> 16;
						i_957_ = i_956_ > 256 ? i_937_ : i_938_;
						i_958_ = method14637((i_936_ >> 2) + (i_957_ * i_956_ >> 18));
						anIntArray9194[i_939_] = i_958_ << 24 | method14635(i_955_, i_942_, i_958_);
					} else if (i_940_ == 1) {
						Class113 class113 = aClass113Array9199[i_939_];
						int i_959_ = ((i * class113.anInt1407 + i_934_ * class113.anInt1408 + i_935_ * class113.anInt1409) >> 16);
						int i_960_ = i_959_ > 256 ? i_937_ : i_938_;
						int i_961_ = method14637((i_936_ >> 2) + (i_960_ * i_959_ >> 18));
						anIntArray9192[i_939_] = i_961_ << 24 | method14635(i_955_, i_942_, i_961_);
						anIntArray9194[i_939_] = -1;
					} else
						anIntArray9194[i_939_] = -2;
				}
			}
			aClass114Array9236 = null;
			aClass114Array9203 = null;
			aClass113Array9199 = null;
			if ((anInt9174 & 0x97098) == 0 && aFloatArrayArray9190 == null)
				aShortArray9193 = null;
			if (bool)
				aByteArray9200 = null;
			anInt9246 = 2;
		}
	}

	void method14671(boolean bool) {
		if (anInt9246 == 1)
			method14656();
		else if (anInt9246 == 2) {
			if ((anInt9174 & 0x97098) == 0 && aFloatArrayArray9190 == null)
				aShortArray9193 = null;
			if (bool)
				aByteArray9200 = null;
		} else {
			method14632();
			int i = aClass180_Sub1_9171.anInt9413 * -1353141313;
			int i_962_ = aClass180_Sub1_9171.anInt9409 * 748091021;
			int i_963_ = aClass180_Sub1_9171.anInt9394 * -1663247975;
			int i_964_ = aClass180_Sub1_9171.anInt9399 * -1757876199 >> 8;
			int i_965_ = 0;
			int i_966_ = 0;
			if (anInt9179 != 0) {
				i_965_ = aClass180_Sub1_9171.anInt9397 * 1789958400 / anInt9179;
				i_966_ = aClass180_Sub1_9171.anInt9408 * -1863567104 / anInt9179;
			}
			if (anIntArray9192 == null) {
				anIntArray9192 = new int[anInt9185];
				anIntArray9180 = new int[anInt9185];
				anIntArray9194 = new int[anInt9185];
			}
			for (int i_967_ = 0; i_967_ < anInt9185; i_967_++) {
				byte i_968_;
				if (aByteArray9200 == null)
					i_968_ = (byte) 0;
				else
					i_968_ = aByteArray9200[i_967_];
				byte i_969_;
				if (aByteArray9202 == null)
					i_969_ = (byte) 0;
				else
					i_969_ = aByteArray9202[i_967_];
				short i_970_;
				if (aShortArray9162 == null)
					i_970_ = (short) -1;
				else
					i_970_ = aShortArray9162[i_967_];
				if (i_969_ == -2)
					i_968_ = (byte) 3;
				if (i_969_ == -1)
					i_968_ = (byte) 2;
				if (i_970_ == -1) {
					if (i_968_ == 0) {
						int i_971_ = aShortArray9193[i_967_] & 0xffff;
						int i_972_ = (i_971_ & 0x7f) * anInt9175 >> 7;
						short i_973_ = Class453.method7333(i_971_ & ~0x7f | i_972_, (byte) 10);
						Class114 class114;
						if (aClass114Array9203 != null && (aClass114Array9203[aShortArray9187[i_967_]] != null))
							class114 = aClass114Array9203[aShortArray9187[i_967_]];
						else
							class114 = aClass114Array9236[aShortArray9187[i_967_]];
						int i_974_ = (((i * class114.anInt1412 + i_962_ * class114.anInt1411 + i_963_ * class114.anInt1410) / class114.anInt1413) >> 16);
						int i_975_ = i_974_ > 256 ? i_965_ : i_966_;
						int i_976_ = (i_964_ >> 1) + (i_975_ * i_974_ >> 17);
						anIntArray9192[i_967_] = i_976_ << 17 | Class395.method6504(i_973_, i_976_, -501584282);
						if (aClass114Array9203 != null && (aClass114Array9203[aShortArray9188[i_967_]] != null))
							class114 = aClass114Array9203[aShortArray9188[i_967_]];
						else
							class114 = aClass114Array9236[aShortArray9188[i_967_]];
						i_974_ = ((i * class114.anInt1412 + i_962_ * class114.anInt1411 + i_963_ * class114.anInt1410) / class114.anInt1413) >> 16;
						i_975_ = i_974_ > 256 ? i_965_ : i_966_;
						i_976_ = (i_964_ >> 1) + (i_975_ * i_974_ >> 17);
						anIntArray9180[i_967_] = i_976_ << 17 | Class395.method6504(i_973_, i_976_, -501584282);
						if (aClass114Array9203 != null && (aClass114Array9203[aShortArray9189[i_967_]] != null))
							class114 = aClass114Array9203[aShortArray9189[i_967_]];
						else
							class114 = aClass114Array9236[aShortArray9189[i_967_]];
						i_974_ = ((i * class114.anInt1412 + i_962_ * class114.anInt1411 + i_963_ * class114.anInt1410) / class114.anInt1413) >> 16;
						i_975_ = i_974_ > 256 ? i_965_ : i_966_;
						i_976_ = (i_964_ >> 1) + (i_975_ * i_974_ >> 17);
						anIntArray9194[i_967_] = i_976_ << 17 | Class395.method6504(i_973_, i_976_, -501584282);
					} else if (i_968_ == 1) {
						int i_977_ = aShortArray9193[i_967_] & 0xffff;
						int i_978_ = (i_977_ & 0x7f) * anInt9175 >> 7;
						short i_979_ = Class453.method7333(i_977_ & ~0x7f | i_978_, (byte) 10);
						Class113 class113 = aClass113Array9199[i_967_];
						int i_980_ = ((i * class113.anInt1407 + i_962_ * class113.anInt1408 + i_963_ * class113.anInt1409) >> 16);
						int i_981_ = i_980_ > 256 ? i_965_ : i_966_;
						int i_982_ = (i_964_ >> 1) + (i_981_ * i_980_ >> 17);
						anIntArray9192[i_967_] = i_982_ << 17 | Class395.method6504(i_979_, i_982_, -501584282);
						anIntArray9194[i_967_] = -1;
					} else if (i_968_ == 3) {
						anIntArray9192[i_967_] = 128;
						anIntArray9194[i_967_] = -1;
					} else
						anIntArray9194[i_967_] = -2;
				} else {
					int i_983_ = aShortArray9193[i_967_] & 0xffff;
					if (i_968_ == 0) {
						Class114 class114;
						if (aClass114Array9203 != null && (aClass114Array9203[aShortArray9187[i_967_]] != null))
							class114 = aClass114Array9203[aShortArray9187[i_967_]];
						else
							class114 = aClass114Array9236[aShortArray9187[i_967_]];
						int i_984_ = (((i * class114.anInt1412 + i_962_ * class114.anInt1411 + i_963_ * class114.anInt1410) / class114.anInt1413) >> 16);
						int i_985_ = i_984_ > 256 ? i_965_ : i_966_;
						int i_986_ = method14637((i_964_ >> 2) + (i_985_ * i_984_ >> 18));
						anIntArray9192[i_967_] = i_986_ << 24 | method14635(i_983_, i_970_, i_986_);
						if (aClass114Array9203 != null && (aClass114Array9203[aShortArray9188[i_967_]] != null))
							class114 = aClass114Array9203[aShortArray9188[i_967_]];
						else
							class114 = aClass114Array9236[aShortArray9188[i_967_]];
						i_984_ = ((i * class114.anInt1412 + i_962_ * class114.anInt1411 + i_963_ * class114.anInt1410) / class114.anInt1413) >> 16;
						i_985_ = i_984_ > 256 ? i_965_ : i_966_;
						i_986_ = method14637((i_964_ >> 2) + (i_985_ * i_984_ >> 18));
						anIntArray9180[i_967_] = i_986_ << 24 | method14635(i_983_, i_970_, i_986_);
						if (aClass114Array9203 != null && (aClass114Array9203[aShortArray9189[i_967_]] != null))
							class114 = aClass114Array9203[aShortArray9189[i_967_]];
						else
							class114 = aClass114Array9236[aShortArray9189[i_967_]];
						i_984_ = ((i * class114.anInt1412 + i_962_ * class114.anInt1411 + i_963_ * class114.anInt1410) / class114.anInt1413) >> 16;
						i_985_ = i_984_ > 256 ? i_965_ : i_966_;
						i_986_ = method14637((i_964_ >> 2) + (i_985_ * i_984_ >> 18));
						anIntArray9194[i_967_] = i_986_ << 24 | method14635(i_983_, i_970_, i_986_);
					} else if (i_968_ == 1) {
						Class113 class113 = aClass113Array9199[i_967_];
						int i_987_ = ((i * class113.anInt1407 + i_962_ * class113.anInt1408 + i_963_ * class113.anInt1409) >> 16);
						int i_988_ = i_987_ > 256 ? i_965_ : i_966_;
						int i_989_ = method14637((i_964_ >> 2) + (i_988_ * i_987_ >> 18));
						anIntArray9192[i_967_] = i_989_ << 24 | method14635(i_983_, i_970_, i_989_);
						anIntArray9194[i_967_] = -1;
					} else
						anIntArray9194[i_967_] = -2;
				}
			}
			aClass114Array9236 = null;
			aClass114Array9203 = null;
			aClass113Array9199 = null;
			if ((anInt9174 & 0x97098) == 0 && aFloatArrayArray9190 == null)
				aShortArray9193 = null;
			if (bool)
				aByteArray9200 = null;
			anInt9246 = 2;
		}
	}

	int method14672(int i, short i_990_, int i_991_) {
		int i_992_ = Class656.anIntArray8390[method14636(i, i_991_)];
		Class163 class163 = aClass180_Sub1_9171.aClass181_2059.method3544(i_990_ & 0xffff, (byte) -86);
		int i_993_ = class163.aByte1808 & 0xff;
		if (i_993_ != 0) {
			int i_994_ = 131586 * i_991_;
			if (i_993_ == 256)
				i_992_ = i_994_;
			else {
				int i_995_ = i_993_;
				int i_996_ = 256 - i_993_;
				i_992_ = ((((i_994_ & 0xff00ff) * i_995_ + (i_992_ & 0xff00ff) * i_996_) & ~0xff00ff) + (((i_994_ & 0xff00) * i_995_ + (i_992_ & 0xff00) * i_996_) & 0xff0000)) >> 8;
			}
		}
		int i_997_ = class163.aByte1802 & 0xff;
		if (i_997_ != 0) {
			i_997_ += 256;
			int i_998_ = ((i_992_ & 0xff0000) >> 16) * i_997_;
			if (i_998_ > 65535)
				i_998_ = 65535;
			int i_999_ = ((i_992_ & 0xff00) >> 8) * i_997_;
			if (i_999_ > 65535)
				i_999_ = 65535;
			int i_1000_ = (i_992_ & 0xff) * i_997_;
			if (i_1000_ > 65535)
				i_1000_ = 65535;
			i_992_ = (i_998_ << 8 & 0xff0000) + (i_999_ & 0xff00) + (i_1000_ >> 8);
		}
		return i_992_;
	}

	public Class176 method2924(byte i, int i_1001_, boolean bool) {
		method14713(Thread.currentThread());
		boolean bool_1002_ = false;
		Class176_Sub2 class176_sub2_1003_;
		Class176_Sub2 class176_sub2_1004_;
		if (i > 0 && i <= 8) {
			class176_sub2_1004_ = aClass176_Sub2Array9225[i - 1];
			class176_sub2_1003_ = aClass176_Sub2Array9183[i - 1];
			bool_1002_ = true;
		} else
			class176_sub2_1003_ = class176_sub2_1004_ = new Class176_Sub2(aClass180_Sub1_9171);
		return method14639(class176_sub2_1003_, class176_sub2_1004_, i_1001_, bool_1002_, bool);
	}

	int method14673(int i, int i_1005_) {
		i_1005_ = i_1005_ * (i & 0x7f) >> 7;
		if (i_1005_ < 2)
			i_1005_ = 2;
		else if (i_1005_ > 126)
			i_1005_ = 126;
		return (i & 0xff80) + i_1005_;
	}

	int method14674(int i, int i_1006_) {
		i_1006_ = i_1006_ * (i & 0x7f) >> 7;
		if (i_1006_ < 2)
			i_1006_ = 2;
		else if (i_1006_ > 126)
			i_1006_ = 126;
		return (i & 0xff80) + i_1006_;
	}

	public void method3016() {
		if ((anInt9174 & 0x10) != 16)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i = 0; i < anInt9177; i++)
				anIntArray9161[i] = -anIntArray9161[i];
			if (aClass114Array9236 != null) {
				for (int i = 0; i < anInt9231; i++) {
					if (aClass114Array9236[i] != null)
						aClass114Array9236[i].anInt1410 = -aClass114Array9236[i].anInt1410;
				}
			}
			if (aClass114Array9203 != null) {
				for (int i = 0; i < anInt9231; i++) {
					if (aClass114Array9203[i] != null)
						aClass114Array9203[i].anInt1410 = -aClass114Array9203[i].anInt1410;
				}
			}
			if (aClass113Array9199 != null) {
				for (int i = 0; i < anInt9185; i++) {
					if (aClass113Array9199[i] != null)
						aClass113Array9199[i].anInt1409 = -aClass113Array9199[i].anInt1409;
				}
			}
			short[] is = aShortArray9187;
			aShortArray9187 = aShortArray9189;
			aShortArray9189 = is;
			if (aFloatArrayArray9190 != null) {
				for (int i = 0; i < anInt9185; i++) {
					if (aFloatArrayArray9190[i] != null) {
						float f = aFloatArrayArray9190[i][0];
						aFloatArrayArray9190[i][0] = aFloatArrayArray9190[i][2];
						aFloatArrayArray9190[i][2] = f;
					}
					if (aFloatArrayArray9235[i] != null) {
						float f = aFloatArrayArray9235[i][0];
						aFloatArrayArray9235[i][0] = aFloatArrayArray9235[i][2];
						aFloatArrayArray9235[i][2] = f;
					}
				}
			}
			aBool9221 = false;
			anInt9246 = 0;
		}
	}

	int method14675(int i) {
		if (i < 2)
			i = 2;
		else if (i > 126)
			i = 126;
		return i;
	}

	void method14676() {
		if (anInt9246 == 0)
			method14634(false);
		else if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
			synchronized (this) {
				method14716();
			}
		} else
			method14716();
	}

	void method2940() {
		if (aBool9210) {
			for (int i = 0; i < anInt9177; i++) {
				anIntArray9191[i] = anIntArray9191[i] + 7 >> 4;
				anIntArray9184[i] = anIntArray9184[i] + 7 >> 4;
				anIntArray9161[i] = anIntArray9161[i] + 7 >> 4;
			}
			aBool9210 = false;
		}
		if (aBool9209) {
			method14656();
			aBool9209 = false;
		}
		aBool9221 = false;
	}

	public int method2866() {
		if (!aBool9168)
			method2901();
		return aShort9242;
	}

	public void method3036(Class176 class176, int i, int i_1007_, int i_1008_, boolean bool) {
		Class176_Sub2 class176_sub2_1009_ = (Class176_Sub2) class176;
		if ((anInt9174 & 0x10000) != 65536)
			throw new IllegalStateException("");
		if ((class176_sub2_1009_.anInt9174 & 0x10000) != 65536)
			throw new IllegalStateException("");
		method14631(aClass180_Sub1_9171.method14835(Thread.currentThread()));
		method14659();
		method14632();
		class176_sub2_1009_.method14659();
		class176_sub2_1009_.method14632();
		anInt9234++;
		int i_1010_ = 0;
		int[] is = class176_sub2_1009_.anIntArray9191;
		int i_1011_ = class176_sub2_1009_.anInt9231;
		for (int i_1012_ = 0; i_1012_ < anInt9231; i_1012_++) {
			Class114 class114 = aClass114Array9236[i_1012_];
			if (class114.anInt1413 != 0) {
				int i_1013_ = anIntArray9184[i_1012_] - i_1007_;
				if (i_1013_ >= class176_sub2_1009_.aShort9223 && i_1013_ <= class176_sub2_1009_.aShort9237) {
					int i_1014_ = anIntArray9191[i_1012_] - i;
					if (i_1014_ >= class176_sub2_1009_.aShort9226 && i_1014_ <= class176_sub2_1009_.aShort9173) {
						int i_1015_ = anIntArray9161[i_1012_] - i_1008_;
						if (i_1015_ >= class176_sub2_1009_.aShort9228 && i_1015_ <= class176_sub2_1009_.aShort9229) {
							for (int i_1016_ = 0; i_1016_ < i_1011_; i_1016_++) {
								Class114 class114_1017_ = (class176_sub2_1009_.aClass114Array9236[i_1016_]);
								if (i_1014_ == is[i_1016_] && i_1015_ == (class176_sub2_1009_.anIntArray9161[i_1016_]) && i_1013_ == (class176_sub2_1009_.anIntArray9184[i_1016_]) && class114_1017_.anInt1413 != 0) {
									if (aClass114Array9203 == null)
										aClass114Array9203 = new Class114[anInt9231];
									if (class176_sub2_1009_.aClass114Array9203 == null)
										class176_sub2_1009_.aClass114Array9203 = new Class114[i_1011_];
									Class114 class114_1018_ = aClass114Array9203[i_1012_];
									if (class114_1018_ == null)
										class114_1018_ = aClass114Array9203[i_1012_] = new Class114(class114);
									Class114 class114_1019_ = (class176_sub2_1009_.aClass114Array9203[i_1016_]);
									if (class114_1019_ == null)
										class114_1019_ = class176_sub2_1009_.aClass114Array9203[i_1016_] = new Class114(class114_1017_);
									class114_1018_.anInt1412 += class114_1017_.anInt1412;
									class114_1018_.anInt1411 += class114_1017_.anInt1411;
									class114_1018_.anInt1410 += class114_1017_.anInt1410;
									class114_1018_.anInt1413 += class114_1017_.anInt1413;
									class114_1019_.anInt1412 += class114.anInt1412;
									class114_1019_.anInt1411 += class114.anInt1411;
									class114_1019_.anInt1410 += class114.anInt1410;
									class114_1019_.anInt1413 += class114.anInt1413;
									i_1010_++;
									anIntArray9243[i_1012_] = anInt9234;
									anIntArray9244[i_1016_] = anInt9234;
								}
							}
						}
					}
				}
			}
		}
		if (i_1010_ >= 3 && bool) {
			for (int i_1020_ = 0; i_1020_ < anInt9185; i_1020_++) {
				if (anIntArray9243[aShortArray9187[i_1020_]] == anInt9234 && anIntArray9243[aShortArray9188[i_1020_]] == anInt9234 && anIntArray9243[aShortArray9189[i_1020_]] == anInt9234) {
					if (aByteArray9200 == null)
						aByteArray9200 = new byte[anInt9185];
					aByteArray9200[i_1020_] = (byte) 2;
				}
			}
			for (int i_1021_ = 0; i_1021_ < class176_sub2_1009_.anInt9185; i_1021_++) {
				if (anIntArray9244[(class176_sub2_1009_.aShortArray9187[i_1021_])] == anInt9234 && anIntArray9244[(class176_sub2_1009_.aShortArray9188[i_1021_])] == anInt9234 && anIntArray9244[(class176_sub2_1009_.aShortArray9189[i_1021_])] == anInt9234) {
					if (class176_sub2_1009_.aByteArray9200 == null)
						class176_sub2_1009_.aByteArray9200 = new byte[class176_sub2_1009_.anInt9185];
					class176_sub2_1009_.aByteArray9200[i_1021_] = (byte) 2;
				}
			}
		}
	}

	public Class176 method2920(byte i, int i_1022_, boolean bool) {
		method14713(Thread.currentThread());
		boolean bool_1023_ = false;
		Class176_Sub2 class176_sub2_1024_;
		Class176_Sub2 class176_sub2_1025_;
		if (i > 0 && i <= 8) {
			class176_sub2_1025_ = aClass176_Sub2Array9225[i - 1];
			class176_sub2_1024_ = aClass176_Sub2Array9183[i - 1];
			bool_1023_ = true;
		} else
			class176_sub2_1024_ = class176_sub2_1025_ = new Class176_Sub2(aClass180_Sub1_9171);
		return method14639(class176_sub2_1024_, class176_sub2_1025_, i_1022_, bool_1023_, bool);
	}

	public Class176 method2921(byte i, int i_1026_, boolean bool) {
		method14713(Thread.currentThread());
		boolean bool_1027_ = false;
		Class176_Sub2 class176_sub2_1028_;
		Class176_Sub2 class176_sub2_1029_;
		if (i > 0 && i <= 8) {
			class176_sub2_1029_ = aClass176_Sub2Array9225[i - 1];
			class176_sub2_1028_ = aClass176_Sub2Array9183[i - 1];
			bool_1027_ = true;
		} else
			class176_sub2_1028_ = class176_sub2_1029_ = new Class176_Sub2(aClass180_Sub1_9171);
		return method14639(class176_sub2_1028_, class176_sub2_1029_, i_1026_, bool_1027_, bool);
	}

	public void method3005(short i, short i_1030_) {
		if (aShortArray9162 != null) {
			if (!aBool9233 && i_1030_ >= 0) {
				Class163 class163 = aClass180_Sub1_9171.aClass181_2059.method3544(i_1030_ & 0xffff, (byte) -55);
				if (class163.aByte1781 != 0 || class163.aByte1797 != 0)
					aBool9233 = true;
			}
			for (int i_1031_ = 0; i_1031_ < anInt9185; i_1031_++) {
				if (aShortArray9162[i_1031_] == i)
					aShortArray9162[i_1031_] = i_1030_;
			}
		}
	}

	void method3020() {
		if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
			synchronized (this) {
				aBool1951 = false;
				this.notifyAll();
			}
		}
	}

	public int method2983() {
		if (!aBool9221)
			method14659();
		return aShort9229;
	}

	Class176 method14677(Class176_Sub2 class176_sub2_1032_, Class176_Sub2 class176_sub2_1033_, int i, boolean bool, boolean bool_1034_) {
		class176_sub2_1032_.aBool9221 = aBool9221;
		if (aBool9221) {
			class176_sub2_1032_.aShort9173 = aShort9173;
			class176_sub2_1032_.aShort9237 = aShort9237;
			class176_sub2_1032_.aShort9229 = aShort9229;
			class176_sub2_1032_.aShort9226 = aShort9226;
			class176_sub2_1032_.aShort9223 = aShort9223;
			class176_sub2_1032_.aShort9228 = aShort9228;
			class176_sub2_1032_.aShort9196 = aShort9196;
			class176_sub2_1032_.aShort9222 = aShort9222;
		}
		if (aBool9168) {
			class176_sub2_1032_.aShort9242 = aShort9242;
			class176_sub2_1032_.aBool9168 = true;
		} else
			class176_sub2_1032_.aBool9168 = false;
		class176_sub2_1032_.anInt9175 = anInt9175;
		class176_sub2_1032_.anInt9179 = anInt9179;
		class176_sub2_1032_.anInt9177 = anInt9177;
		class176_sub2_1032_.anInt9231 = anInt9231;
		class176_sub2_1032_.anInt9185 = anInt9185;
		class176_sub2_1032_.anInt9217 = anInt9217;
		class176_sub2_1032_.anInt9186 = anInt9186;
		if ((i & 0x100) != 0)
			class176_sub2_1032_.aBool9232 = true;
		else
			class176_sub2_1032_.aBool9232 = aBool9232;
		class176_sub2_1032_.aBool9233 = aBool9233;
		boolean bool_1035_ = (i & 0x7) == 7 | (i & 0x20) != 0;
		boolean bool_1036_ = bool_1035_ || (i & 0x1) != 0;
		boolean bool_1037_ = bool_1035_ || (i & 0x2) != 0;
		boolean bool_1038_ = bool_1035_ || (i & 0x4) != 0 || (i & 0x10) != 0;
		if (bool_1036_ || bool_1037_ || bool_1038_) {
			if (bool_1036_) {
				if (class176_sub2_1033_.anIntArray9191 == null || class176_sub2_1033_.anIntArray9191.length < anInt9177)
					class176_sub2_1032_.anIntArray9191 = class176_sub2_1033_.anIntArray9191 = new int[anInt9177];
				else
					class176_sub2_1032_.anIntArray9191 = class176_sub2_1033_.anIntArray9191;
				for (int i_1039_ = 0; i_1039_ < anInt9177; i_1039_++)
					class176_sub2_1032_.anIntArray9191[i_1039_] = anIntArray9191[i_1039_];
			} else
				class176_sub2_1032_.anIntArray9191 = anIntArray9191;
			if (bool_1037_) {
				if (class176_sub2_1033_.anIntArray9184 == null || class176_sub2_1033_.anIntArray9184.length < anInt9177)
					class176_sub2_1032_.anIntArray9184 = class176_sub2_1033_.anIntArray9184 = new int[anInt9177];
				else
					class176_sub2_1032_.anIntArray9184 = class176_sub2_1033_.anIntArray9184;
				for (int i_1040_ = 0; i_1040_ < anInt9177; i_1040_++)
					class176_sub2_1032_.anIntArray9184[i_1040_] = anIntArray9184[i_1040_];
			} else
				class176_sub2_1032_.anIntArray9184 = anIntArray9184;
			if (bool_1038_) {
				if (class176_sub2_1033_.anIntArray9161 == null || class176_sub2_1033_.anIntArray9161.length < anInt9177)
					class176_sub2_1032_.anIntArray9161 = class176_sub2_1033_.anIntArray9161 = new int[anInt9177];
				else
					class176_sub2_1032_.anIntArray9161 = class176_sub2_1033_.anIntArray9161;
				for (int i_1041_ = 0; i_1041_ < anInt9177; i_1041_++)
					class176_sub2_1032_.anIntArray9161[i_1041_] = anIntArray9161[i_1041_];
			} else
				class176_sub2_1032_.anIntArray9161 = anIntArray9161;
		} else {
			class176_sub2_1032_.anIntArray9191 = anIntArray9191;
			class176_sub2_1032_.anIntArray9184 = anIntArray9184;
			class176_sub2_1032_.anIntArray9161 = anIntArray9161;
		}
		if ((i & 0x84080) != 0) {
			if (class176_sub2_1033_.aShortArray9193 == null || class176_sub2_1033_.aShortArray9193.length < anInt9185) {
				int i_1042_ = anInt9185;
				class176_sub2_1032_.aShortArray9193 = class176_sub2_1033_.aShortArray9193 = new short[i_1042_];
			} else
				class176_sub2_1032_.aShortArray9193 = class176_sub2_1033_.aShortArray9193;
			for (int i_1043_ = 0; i_1043_ < anInt9185; i_1043_++)
				class176_sub2_1032_.aShortArray9193[i_1043_] = aShortArray9193[i_1043_];
		} else
			class176_sub2_1032_.aShortArray9193 = aShortArray9193;
		if ((i & 0x97018) != 0) {
			class176_sub2_1032_.anInt9246 = 0;
			Class176_Sub2 class176_sub2_1044_ = class176_sub2_1032_;
			Class176_Sub2 class176_sub2_1045_ = class176_sub2_1032_;
			class176_sub2_1032_.anIntArray9194 = null;
			class176_sub2_1045_.anIntArray9180 = null;
			class176_sub2_1044_.anIntArray9192 = null;
		} else if ((i & 0x80) != 0) {
			if (bool_1034_)
				method14634(false);
			if (anIntArray9192 != null) {
				if (class176_sub2_1033_.anIntArray9192 == null || class176_sub2_1033_.anIntArray9192.length < anInt9185) {
					int i_1046_ = anInt9185;
					class176_sub2_1032_.anIntArray9192 = class176_sub2_1033_.anIntArray9192 = new int[i_1046_];
					class176_sub2_1032_.anIntArray9180 = class176_sub2_1033_.anIntArray9180 = new int[i_1046_];
					class176_sub2_1032_.anIntArray9194 = class176_sub2_1033_.anIntArray9194 = new int[i_1046_];
				} else {
					class176_sub2_1032_.anIntArray9192 = class176_sub2_1033_.anIntArray9192;
					class176_sub2_1032_.anIntArray9180 = class176_sub2_1033_.anIntArray9180;
					class176_sub2_1032_.anIntArray9194 = class176_sub2_1033_.anIntArray9194;
				}
				for (int i_1047_ = 0; i_1047_ < anInt9185; i_1047_++) {
					class176_sub2_1032_.anIntArray9192[i_1047_] = anIntArray9192[i_1047_];
					class176_sub2_1032_.anIntArray9180[i_1047_] = anIntArray9180[i_1047_];
					class176_sub2_1032_.anIntArray9194[i_1047_] = anIntArray9194[i_1047_];
				}
			}
			class176_sub2_1032_.anInt9246 = anInt9246;
		} else {
			if (bool_1034_)
				method14634(false);
			class176_sub2_1032_.anIntArray9192 = anIntArray9192;
			class176_sub2_1032_.anIntArray9180 = anIntArray9180;
			class176_sub2_1032_.anIntArray9194 = anIntArray9194;
			class176_sub2_1032_.anInt9246 = anInt9246;
		}
		if ((i & 0x100) != 0) {
			if (class176_sub2_1033_.aByteArray9202 == null || class176_sub2_1033_.aByteArray9202.length < anInt9185) {
				int i_1048_ = anInt9185;
				class176_sub2_1032_.aByteArray9202 = class176_sub2_1033_.aByteArray9202 = new byte[i_1048_];
			} else
				class176_sub2_1032_.aByteArray9202 = class176_sub2_1033_.aByteArray9202;
			if (aByteArray9202 != null) {
				for (int i_1049_ = 0; i_1049_ < anInt9185; i_1049_++)
					class176_sub2_1032_.aByteArray9202[i_1049_] = aByteArray9202[i_1049_];
			} else {
				for (int i_1050_ = 0; i_1050_ < anInt9185; i_1050_++)
					class176_sub2_1032_.aByteArray9202[i_1050_] = (byte) 0;
			}
		} else
			class176_sub2_1032_.aByteArray9202 = aByteArray9202;
		if ((i & 0x8) != 0 || (i & 0x10) != 0) {
			if (class176_sub2_1033_.aClass114Array9236 == null || class176_sub2_1033_.aClass114Array9236.length < anInt9231) {
				int i_1051_ = anInt9231;
				class176_sub2_1032_.aClass114Array9236 = class176_sub2_1033_.aClass114Array9236 = new Class114[i_1051_];
			} else
				class176_sub2_1032_.aClass114Array9236 = class176_sub2_1033_.aClass114Array9236;
			if (aClass114Array9236 != null) {
				for (int i_1052_ = 0; i_1052_ < anInt9231; i_1052_++)
					class176_sub2_1032_.aClass114Array9236[i_1052_] = new Class114(aClass114Array9236[i_1052_]);
			} else
				class176_sub2_1032_.aClass114Array9236 = null;
			if (aClass113Array9199 != null) {
				if (class176_sub2_1033_.aClass113Array9199 == null || (class176_sub2_1033_.aClass113Array9199.length < anInt9185)) {
					int i_1053_ = anInt9185;
					class176_sub2_1032_.aClass113Array9199 = class176_sub2_1033_.aClass113Array9199 = new Class113[i_1053_];
				} else
					class176_sub2_1032_.aClass113Array9199 = class176_sub2_1033_.aClass113Array9199;
				for (int i_1054_ = 0; i_1054_ < anInt9185; i_1054_++)
					class176_sub2_1032_.aClass113Array9199[i_1054_] = (aClass113Array9199[i_1054_] != null ? new Class113(aClass113Array9199[i_1054_]) : null);
			} else
				class176_sub2_1032_.aClass113Array9199 = null;
		} else {
			if (bool_1034_)
				method14632();
			class176_sub2_1032_.aClass114Array9236 = aClass114Array9236;
			class176_sub2_1032_.aClass113Array9199 = aClass113Array9199;
		}
		if ((i & 0x8000) != 0) {
			if (aShortArray9162 == null)
				class176_sub2_1032_.aShortArray9162 = null;
			else {
				if (class176_sub2_1033_.aShortArray9162 == null || (class176_sub2_1033_.aShortArray9162.length < anInt9185)) {
					int i_1055_ = anInt9185;
					class176_sub2_1032_.aShortArray9162 = class176_sub2_1033_.aShortArray9162 = new short[i_1055_];
				} else
					class176_sub2_1032_.aShortArray9162 = class176_sub2_1033_.aShortArray9162;
				for (int i_1056_ = 0; i_1056_ < anInt9185; i_1056_++)
					class176_sub2_1032_.aShortArray9162[i_1056_] = aShortArray9162[i_1056_];
			}
		} else
			class176_sub2_1032_.aShortArray9162 = aShortArray9162;
		if ((i & 0x10000) != 0) {
			if (aByteArray9200 == null)
				class176_sub2_1032_.aByteArray9200 = null;
			else {
				if (class176_sub2_1033_.aByteArray9200 == null || class176_sub2_1033_.aByteArray9200.length < anInt9185) {
					int i_1057_ = bool ? anInt9185 + 100 : anInt9185;
					class176_sub2_1032_.aByteArray9200 = class176_sub2_1033_.aByteArray9200 = new byte[i_1057_];
				} else
					class176_sub2_1032_.aByteArray9200 = class176_sub2_1033_.aByteArray9200;
				for (int i_1058_ = 0; i_1058_ < anInt9185; i_1058_++)
					class176_sub2_1032_.aByteArray9200[i_1058_] = aByteArray9200[i_1058_];
			}
		} else
			class176_sub2_1032_.aByteArray9200 = aByteArray9200;
		if ((i & 0xc580) != 0) {
			if (class176_sub2_1033_.aClass108Array9211 == null || class176_sub2_1033_.aClass108Array9211.length < anInt9217) {
				int i_1059_ = anInt9217;
				class176_sub2_1032_.aClass108Array9211 = class176_sub2_1033_.aClass108Array9211 = new Class108[i_1059_];
				for (int i_1060_ = 0; i_1060_ < anInt9217; i_1060_++)
					class176_sub2_1032_.aClass108Array9211[i_1060_] = aClass108Array9211[i_1060_].method1930(1650274831);
			} else {
				class176_sub2_1032_.aClass108Array9211 = class176_sub2_1033_.aClass108Array9211;
				for (int i_1061_ = 0; i_1061_ < anInt9217; i_1061_++)
					class176_sub2_1032_.aClass108Array9211[i_1061_].method1933(aClass108Array9211[i_1061_], 1769813785);
			}
		} else
			class176_sub2_1032_.aClass108Array9211 = aClass108Array9211;
		if (aFloatArrayArray9190 != null && (i & 0x10) != 0) {
			if (class176_sub2_1033_.aFloatArrayArray9190 == null || (class176_sub2_1033_.aFloatArrayArray9190.length < anInt9185)) {
				int i_1062_ = bool ? anInt9185 + 100 : anInt9185;
				class176_sub2_1032_.aFloatArrayArray9190 = class176_sub2_1033_.aFloatArrayArray9190 = new float[i_1062_][3];
			} else
				class176_sub2_1032_.aFloatArrayArray9190 = class176_sub2_1033_.aFloatArrayArray9190;
			for (int i_1063_ = 0; i_1063_ < anInt9185; i_1063_++) {
				if (aFloatArrayArray9190[i_1063_] != null) {
					class176_sub2_1032_.aFloatArrayArray9190[i_1063_][0] = aFloatArrayArray9190[i_1063_][0];
					class176_sub2_1032_.aFloatArrayArray9190[i_1063_][1] = aFloatArrayArray9190[i_1063_][1];
					class176_sub2_1032_.aFloatArrayArray9190[i_1063_][2] = aFloatArrayArray9190[i_1063_][2];
				}
			}
			if (class176_sub2_1033_.aFloatArrayArray9235 == null || (class176_sub2_1033_.aFloatArrayArray9235.length < anInt9185)) {
				int i_1064_ = bool ? anInt9185 + 100 : anInt9185;
				class176_sub2_1032_.aFloatArrayArray9235 = class176_sub2_1033_.aFloatArrayArray9235 = new float[i_1064_][3];
			} else
				class176_sub2_1032_.aFloatArrayArray9235 = class176_sub2_1033_.aFloatArrayArray9235;
			for (int i_1065_ = 0; i_1065_ < anInt9185; i_1065_++) {
				if (aFloatArrayArray9235[i_1065_] != null) {
					class176_sub2_1032_.aFloatArrayArray9235[i_1065_][0] = aFloatArrayArray9235[i_1065_][0];
					class176_sub2_1032_.aFloatArrayArray9235[i_1065_][1] = aFloatArrayArray9235[i_1065_][1];
					class176_sub2_1032_.aFloatArrayArray9235[i_1065_][2] = aFloatArrayArray9235[i_1065_][2];
				}
			}
		} else {
			class176_sub2_1032_.aFloatArrayArray9190 = aFloatArrayArray9190;
			class176_sub2_1032_.aFloatArrayArray9235 = aFloatArrayArray9235;
		}
		class176_sub2_1032_.anIntArrayArray9178 = anIntArrayArray9178;
		class176_sub2_1032_.anIntArrayArray9208 = anIntArrayArray9208;
		class176_sub2_1032_.anIntArrayArray9220 = anIntArrayArray9220;
		class176_sub2_1032_.aShortArray9227 = aShortArray9227;
		class176_sub2_1032_.aShortArray9205 = aShortArray9205;
		class176_sub2_1032_.aByteArray9201 = aByteArray9201;
		class176_sub2_1032_.aShortArray9187 = aShortArray9187;
		class176_sub2_1032_.aShortArray9188 = aShortArray9188;
		class176_sub2_1032_.aShortArray9189 = aShortArray9189;
		class176_sub2_1032_.aClass167Array9215 = aClass167Array9215;
		class176_sub2_1032_.aClass159Array9216 = aClass159Array9216;
		class176_sub2_1032_.aClass116Array9218 = aClass116Array9218;
		class176_sub2_1032_.aShortArray9181 = aShortArray9181;
		class176_sub2_1032_.anInt9174 = i;
		return class176_sub2_1032_;
	}

	public void method2925(int i) {
		if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
			synchronized (this) {
				if ((anInt9174 & 0x10000) == 65536 && (i & 0x10000) == 0)
					method14634(true);
				anInt9174 = i;
			}
		} else {
			if ((anInt9174 & 0x10000) == 65536 && (i & 0x10000) == 0)
				method14634(true);
			anInt9174 = i;
		}
	}

	public int method3055() {
		if (!aBool9221)
			method14659();
		return aShort9237;
	}

	public void method2886(int i, int i_1066_, int i_1067_) {
		if (i != 128 && (anInt9174 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_1066_ != 128 && (anInt9174 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_1067_ != 128 && (anInt9174 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_1068_ = 0; i_1068_ < anInt9177; i_1068_++) {
				anIntArray9191[i_1068_] = anIntArray9191[i_1068_] * i >> 7;
				anIntArray9184[i_1068_] = anIntArray9184[i_1068_] * i_1066_ >> 7;
				anIntArray9161[i_1068_] = anIntArray9161[i_1068_] * i_1067_ >> 7;
			}
			aBool9221 = false;
		}
	}

	public void method2928() {
		/* empty */
	}

	public boolean method3013() {
		return aBool9233;
	}

	public void method2930(int i) {
		if ((anInt9174 & 0x5) != 5)
			throw new IllegalStateException();
		if (i == 4096)
			method14640();
		else if (i == 8192)
			method14641();
		else if (i == 12288)
			method14647();
		else {
			int i_1069_ = Class428.anIntArray4825[i];
			int i_1070_ = Class428.anIntArray4819[i];
			synchronized (this) {
				for (int i_1071_ = 0; i_1071_ < anInt9177; i_1071_++) {
					int i_1072_ = ((anIntArray9161[i_1071_] * i_1069_ + anIntArray9191[i_1071_] * i_1070_) >> 14);
					anIntArray9161[i_1071_] = (anIntArray9161[i_1071_] * i_1070_ - anIntArray9191[i_1071_] * i_1069_) >> 14;
					anIntArray9191[i_1071_] = i_1072_;
				}
				method14645();
			}
		}
	}

	public void method2911(int i) {
		if ((anInt9174 & 0x5) != 5)
			throw new IllegalStateException();
		if (i == 4096)
			method14640();
		else if (i == 8192)
			method14641();
		else if (i == 12288)
			method14647();
		else {
			int i_1073_ = Class428.anIntArray4825[i];
			int i_1074_ = Class428.anIntArray4819[i];
			synchronized (this) {
				for (int i_1075_ = 0; i_1075_ < anInt9177; i_1075_++) {
					int i_1076_ = ((anIntArray9161[i_1075_] * i_1073_ + anIntArray9191[i_1075_] * i_1074_) >> 14);
					anIntArray9161[i_1075_] = (anIntArray9161[i_1075_] * i_1074_ - anIntArray9191[i_1075_] * i_1073_) >> 14;
					anIntArray9191[i_1075_] = i_1076_;
				}
				method14645();
			}
		}
	}

	public void method3039(int i) {
		if ((anInt9174 & 0x1000) != 4096)
			throw new IllegalStateException();
		anInt9175 = i;
		anInt9246 = 0;
	}

	void method14678() {
		synchronized (this) {
			for (int i = 0; i < anInt9177; i++) {
				int i_1077_ = anIntArray9191[i];
				anIntArray9191[i] = anIntArray9161[i];
				anIntArray9161[i] = -i_1077_;
			}
			method14645();
		}
	}

	void method14679() {
		synchronized (this) {
			for (int i = 0; i < anInt9177; i++) {
				int i_1078_ = anIntArray9191[i];
				anIntArray9191[i] = anIntArray9161[i];
				anIntArray9161[i] = -i_1078_;
			}
			method14645();
		}
	}

	public boolean method2923(int i, int i_1079_, Class432 class432, boolean bool, int i_1080_) {
		method14631(aClass180_Sub1_9171.method14835(Thread.currentThread()));
		Class427 class427 = aClass101_9163.aClass427_1188;
		class427.method6784(class432);
		Class427 class427_1081_ = aClass101_9163.aClass427_1204;
		class427_1081_.method6750(class427);
		class427_1081_.method6751(aClass180_Sub1_9171.aClass427_9403);
		boolean bool_1082_ = false;
		int i_1083_ = 2147483647;
		int i_1084_ = -2147483648;
		int i_1085_ = 2147483647;
		int i_1086_ = -2147483648;
		if (!aBool9221)
			method14659();
		int i_1087_ = aShort9173 - aShort9226 >> 1;
		int i_1088_ = aShort9237 - aShort9223 >> 1;
		int i_1089_ = aShort9229 - aShort9228 >> 1;
		int i_1090_ = aShort9226 + i_1087_;
		int i_1091_ = aShort9223 + i_1088_;
		int i_1092_ = aShort9228 + i_1089_;
		int i_1093_ = i_1090_ - (i_1087_ << i_1080_);
		int i_1094_ = i_1091_ - (i_1088_ << i_1080_);
		int i_1095_ = i_1092_ - (i_1089_ << i_1080_);
		int i_1096_ = i_1090_ + (i_1087_ << i_1080_);
		int i_1097_ = i_1091_ + (i_1088_ << i_1080_);
		int i_1098_ = i_1092_ + (i_1089_ << i_1080_);
		anIntArray9240[0] = i_1093_;
		anIntArray9241[0] = i_1094_;
		anIntArray9176[0] = i_1095_;
		anIntArray9240[1] = i_1096_;
		anIntArray9241[1] = i_1094_;
		anIntArray9176[1] = i_1095_;
		anIntArray9240[2] = i_1093_;
		anIntArray9241[2] = i_1097_;
		anIntArray9176[2] = i_1095_;
		anIntArray9240[3] = i_1096_;
		anIntArray9241[3] = i_1097_;
		anIntArray9176[3] = i_1095_;
		anIntArray9240[4] = i_1093_;
		anIntArray9241[4] = i_1094_;
		anIntArray9176[4] = i_1098_;
		anIntArray9240[5] = i_1096_;
		anIntArray9241[5] = i_1094_;
		anIntArray9176[5] = i_1098_;
		anIntArray9240[6] = i_1093_;
		anIntArray9241[6] = i_1097_;
		anIntArray9176[6] = i_1098_;
		anIntArray9240[7] = i_1096_;
		anIntArray9241[7] = i_1097_;
		anIntArray9176[7] = i_1098_;
		for (int i_1099_ = 0; i_1099_ < 8; i_1099_++) {
			int i_1100_ = anIntArray9240[i_1099_];
			int i_1101_ = anIntArray9241[i_1099_];
			int i_1102_ = anIntArray9176[i_1099_];
			float f = (class427_1081_.aFloatArray4807[2] * (float) i_1100_ + class427_1081_.aFloatArray4807[6] * (float) i_1101_ + class427_1081_.aFloatArray4807[10] * (float) i_1102_ + class427_1081_.aFloatArray4807[14]);
			float f_1103_ = (class427_1081_.aFloatArray4807[3] * (float) i_1100_ + class427_1081_.aFloatArray4807[7] * (float) i_1101_ + class427_1081_.aFloatArray4807[11] * (float) i_1102_ + class427_1081_.aFloatArray4807[15]);
			if (f >= -f_1103_) {
				float f_1104_ = (class427_1081_.aFloatArray4807[0] * (float) i_1100_ + class427_1081_.aFloatArray4807[4] * (float) i_1101_ + class427_1081_.aFloatArray4807[8] * (float) i_1102_ + class427_1081_.aFloatArray4807[12]);
				float f_1105_ = (class427_1081_.aFloatArray4807[1] * (float) i_1100_ + class427_1081_.aFloatArray4807[5] * (float) i_1101_ + class427_1081_.aFloatArray4807[9] * (float) i_1102_ + class427_1081_.aFloatArray4807[13]);
				int i_1106_ = (int) (aClass180_Sub1_9171.aFloat9410 + (aClass180_Sub1_9171.aFloat9419 * f_1104_ / f_1103_));
				int i_1107_ = (int) (aClass180_Sub1_9171.aFloat9412 + (aClass180_Sub1_9171.aFloat9395 * f_1105_ / f_1103_));
				if (i_1106_ < i_1083_)
					i_1083_ = i_1106_;
				if (i_1106_ > i_1084_)
					i_1084_ = i_1106_;
				if (i_1107_ < i_1085_)
					i_1085_ = i_1107_;
				if (i_1107_ > i_1086_)
					i_1086_ = i_1107_;
				bool_1082_ = true;
			}
		}
		if (bool_1082_ && i > i_1083_ && i < i_1084_ && i_1079_ > i_1085_ && i_1079_ < i_1086_) {
			if (bool)
				return true;
			for (int i_1108_ = 0; i_1108_ < anInt9177; i_1108_++) {
				int i_1109_ = anIntArray9191[i_1108_];
				int i_1110_ = anIntArray9184[i_1108_];
				int i_1111_ = anIntArray9161[i_1108_];
				float f = (class427_1081_.aFloatArray4807[2] * (float) i_1109_ + class427_1081_.aFloatArray4807[6] * (float) i_1110_ + class427_1081_.aFloatArray4807[10] * (float) i_1111_ + class427_1081_.aFloatArray4807[14]);
				float f_1112_ = (class427_1081_.aFloatArray4807[3] * (float) i_1109_ + class427_1081_.aFloatArray4807[7] * (float) i_1110_ + class427_1081_.aFloatArray4807[11] * (float) i_1111_ + class427_1081_.aFloatArray4807[15]);
				if (f >= -f_1112_) {
					float f_1113_ = (class427_1081_.aFloatArray4807[0] * (float) i_1109_ + (class427_1081_.aFloatArray4807[4] * (float) i_1110_) + (class427_1081_.aFloatArray4807[8] * (float) i_1111_) + class427_1081_.aFloatArray4807[12]);
					float f_1114_ = (class427_1081_.aFloatArray4807[1] * (float) i_1109_ + (class427_1081_.aFloatArray4807[5] * (float) i_1110_) + (class427_1081_.aFloatArray4807[9] * (float) i_1111_) + class427_1081_.aFloatArray4807[13]);
					aFloatArray9167[i_1108_] = (float) (int) (aClass180_Sub1_9171.aFloat9410 + (aClass180_Sub1_9171.aFloat9419 * f_1113_ / f_1112_));
					aFloatArray9198[i_1108_] = (float) (int) (aClass180_Sub1_9171.aFloat9412 + (aClass180_Sub1_9171.aFloat9395 * f_1114_ / f_1112_));
				} else
					aFloatArray9167[i_1108_] = -999999.0F;
			}
			for (int i_1115_ = 0; i_1115_ < anInt9186; i_1115_++) {
				if (aFloatArray9167[aShortArray9187[i_1115_]] != -999999.0F && aFloatArray9167[aShortArray9188[i_1115_]] != -999999.0F && aFloatArray9167[aShortArray9189[i_1115_]] != -999999.0F && method14663(i, i_1079_, aFloatArray9198[aShortArray9187[i_1115_]], aFloatArray9198[aShortArray9188[i_1115_]], aFloatArray9198[aShortArray9189[i_1115_]], aFloatArray9167[aShortArray9187[i_1115_]], aFloatArray9167[aShortArray9188[i_1115_]], aFloatArray9167[aShortArray9189[i_1115_]]))
					return true;
			}
		}
		return false;
	}

	public Class176 method3043(byte i, int i_1116_, boolean bool) {
		method14713(Thread.currentThread());
		boolean bool_1117_ = false;
		Class176_Sub2 class176_sub2_1118_;
		Class176_Sub2 class176_sub2_1119_;
		if (i > 0 && i <= 8) {
			class176_sub2_1119_ = aClass176_Sub2Array9225[i - 1];
			class176_sub2_1118_ = aClass176_Sub2Array9183[i - 1];
			bool_1117_ = true;
		} else
			class176_sub2_1118_ = class176_sub2_1119_ = new Class176_Sub2(aClass180_Sub1_9171);
		return method14639(class176_sub2_1118_, class176_sub2_1119_, i_1116_, bool_1117_, bool);
	}

	void method14680() {
		synchronized (this) {
			for (int i = 0; i < anInt9177; i++) {
				int i_1120_ = anIntArray9161[i];
				anIntArray9161[i] = anIntArray9191[i];
				anIntArray9191[i] = -i_1120_;
			}
			method14645();
		}
	}

	void method14681() {
		synchronized (this) {
			for (int i = 0; i < anInt9177; i++) {
				int i_1121_ = anIntArray9161[i];
				anIntArray9161[i] = anIntArray9191[i];
				anIntArray9191[i] = -i_1121_;
			}
			method14645();
		}
	}

	int method14682(int i) {
		if (i < 2)
			i = 2;
		else if (i > 126)
			i = 126;
		return i;
	}

	void method14683() {
		synchronized (this) {
			for (int i = 0; i < anInt9231; i++) {
				anIntArray9191[i] = -anIntArray9191[i];
				anIntArray9161[i] = -anIntArray9161[i];
				if (aClass114Array9236[i] != null) {
					aClass114Array9236[i].anInt1412 = -aClass114Array9236[i].anInt1412;
					aClass114Array9236[i].anInt1410 = -aClass114Array9236[i].anInt1410;
				}
			}
			if (aClass113Array9199 != null) {
				for (int i = 0; i < anInt9185; i++) {
					if (aClass113Array9199[i] != null) {
						aClass113Array9199[i].anInt1407 = -aClass113Array9199[i].anInt1407;
						aClass113Array9199[i].anInt1409 = -aClass113Array9199[i].anInt1409;
					}
				}
			}
			for (int i = anInt9231; i < anInt9177; i++) {
				anIntArray9191[i] = -anIntArray9191[i];
				anIntArray9161[i] = -anIntArray9161[i];
			}
			anInt9246 = 0;
			aBool9221 = false;
		}
	}

	void method2952(int i, int[] is, int i_1122_, int i_1123_, int i_1124_, int i_1125_, boolean bool) {
		int i_1126_ = is.length;
		if (i == 0) {
			i_1122_ <<= 4;
			i_1123_ <<= 4;
			i_1124_ <<= 4;
			if (!aBool9210) {
				for (int i_1127_ = 0; i_1127_ < anInt9177; i_1127_++) {
					anIntArray9191[i_1127_] <<= 4;
					anIntArray9184[i_1127_] <<= 4;
					anIntArray9161[i_1127_] <<= 4;
				}
				aBool9210 = true;
			}
			int i_1128_ = 0;
			anInt9247 = 0;
			anInt9212 = 0;
			anInt9224 = 0;
			for (int i_1129_ = 0; i_1129_ < i_1126_; i_1129_++) {
				int i_1130_ = is[i_1129_];
				if (i_1130_ < anIntArrayArray9178.length) {
					int[] is_1131_ = anIntArrayArray9178[i_1130_];
					for (int i_1132_ = 0; i_1132_ < is_1131_.length; i_1132_++) {
						int i_1133_ = is_1131_[i_1132_];
						anInt9247 += anIntArray9191[i_1133_];
						anInt9212 += anIntArray9184[i_1133_];
						anInt9224 += anIntArray9161[i_1133_];
						i_1128_++;
					}
				}
			}
			if (i_1128_ > 0) {
				anInt9247 = anInt9247 / i_1128_ + i_1122_;
				anInt9212 = anInt9212 / i_1128_ + i_1123_;
				anInt9224 = anInt9224 / i_1128_ + i_1124_;
			} else {
				anInt9247 = i_1122_;
				anInt9212 = i_1123_;
				anInt9224 = i_1124_;
			}
		} else if (i == 1) {
			i_1122_ <<= 4;
			i_1123_ <<= 4;
			i_1124_ <<= 4;
			if (!aBool9210) {
				for (int i_1134_ = 0; i_1134_ < anInt9177; i_1134_++) {
					anIntArray9191[i_1134_] <<= 4;
					anIntArray9184[i_1134_] <<= 4;
					anIntArray9161[i_1134_] <<= 4;
				}
				aBool9210 = true;
			}
			for (int i_1135_ = 0; i_1135_ < i_1126_; i_1135_++) {
				int i_1136_ = is[i_1135_];
				if (i_1136_ < anIntArrayArray9178.length) {
					int[] is_1137_ = anIntArrayArray9178[i_1136_];
					for (int i_1138_ = 0; i_1138_ < is_1137_.length; i_1138_++) {
						int i_1139_ = is_1137_[i_1138_];
						anIntArray9191[i_1139_] += i_1122_;
						anIntArray9184[i_1139_] += i_1123_;
						anIntArray9161[i_1139_] += i_1124_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1140_ = 0; i_1140_ < i_1126_; i_1140_++) {
				int i_1141_ = is[i_1140_];
				if (i_1141_ < anIntArrayArray9178.length) {
					int[] is_1142_ = anIntArrayArray9178[i_1141_];
					if ((i_1125_ & 0x1) == 0) {
						for (int i_1143_ = 0; i_1143_ < is_1142_.length; i_1143_++) {
							int i_1144_ = is_1142_[i_1143_];
							anIntArray9191[i_1144_] -= anInt9247;
							anIntArray9184[i_1144_] -= anInt9212;
							anIntArray9161[i_1144_] -= anInt9224;
							if (i_1124_ != 0) {
								int i_1145_ = Class428.anIntArray4825[i_1124_];
								int i_1146_ = Class428.anIntArray4819[i_1124_];
								int i_1147_ = ((anIntArray9184[i_1144_] * i_1145_ + anIntArray9191[i_1144_] * i_1146_ + 16383) >> 14);
								anIntArray9184[i_1144_] = (anIntArray9184[i_1144_] * i_1146_ - anIntArray9191[i_1144_] * i_1145_ + 16383) >> 14;
								anIntArray9191[i_1144_] = i_1147_;
							}
							if (i_1122_ != 0) {
								int i_1148_ = Class428.anIntArray4825[i_1122_];
								int i_1149_ = Class428.anIntArray4819[i_1122_];
								int i_1150_ = ((anIntArray9184[i_1144_] * i_1149_ - anIntArray9161[i_1144_] * i_1148_ + 16383) >> 14);
								anIntArray9161[i_1144_] = (anIntArray9184[i_1144_] * i_1148_ + anIntArray9161[i_1144_] * i_1149_ + 16383) >> 14;
								anIntArray9184[i_1144_] = i_1150_;
							}
							if (i_1123_ != 0) {
								int i_1151_ = Class428.anIntArray4825[i_1123_];
								int i_1152_ = Class428.anIntArray4819[i_1123_];
								int i_1153_ = ((anIntArray9161[i_1144_] * i_1151_ + anIntArray9191[i_1144_] * i_1152_ + 16383) >> 14);
								anIntArray9161[i_1144_] = (anIntArray9161[i_1144_] * i_1152_ - anIntArray9191[i_1144_] * i_1151_ + 16383) >> 14;
								anIntArray9191[i_1144_] = i_1153_;
							}
							anIntArray9191[i_1144_] += anInt9247;
							anIntArray9184[i_1144_] += anInt9212;
							anIntArray9161[i_1144_] += anInt9224;
						}
					} else {
						for (int i_1154_ = 0; i_1154_ < is_1142_.length; i_1154_++) {
							int i_1155_ = is_1142_[i_1154_];
							anIntArray9191[i_1155_] -= anInt9247;
							anIntArray9184[i_1155_] -= anInt9212;
							anIntArray9161[i_1155_] -= anInt9224;
							if (i_1122_ != 0) {
								int i_1156_ = Class428.anIntArray4825[i_1122_];
								int i_1157_ = Class428.anIntArray4819[i_1122_];
								int i_1158_ = ((anIntArray9184[i_1155_] * i_1157_ - anIntArray9161[i_1155_] * i_1156_ + 16383) >> 14);
								anIntArray9161[i_1155_] = (anIntArray9184[i_1155_] * i_1156_ + anIntArray9161[i_1155_] * i_1157_ + 16383) >> 14;
								anIntArray9184[i_1155_] = i_1158_;
							}
							if (i_1124_ != 0) {
								int i_1159_ = Class428.anIntArray4825[i_1124_];
								int i_1160_ = Class428.anIntArray4819[i_1124_];
								int i_1161_ = ((anIntArray9184[i_1155_] * i_1159_ + anIntArray9191[i_1155_] * i_1160_ + 16383) >> 14);
								anIntArray9184[i_1155_] = (anIntArray9184[i_1155_] * i_1160_ - anIntArray9191[i_1155_] * i_1159_ + 16383) >> 14;
								anIntArray9191[i_1155_] = i_1161_;
							}
							if (i_1123_ != 0) {
								int i_1162_ = Class428.anIntArray4825[i_1123_];
								int i_1163_ = Class428.anIntArray4819[i_1123_];
								int i_1164_ = ((anIntArray9161[i_1155_] * i_1162_ + anIntArray9191[i_1155_] * i_1163_ + 16383) >> 14);
								anIntArray9161[i_1155_] = (anIntArray9161[i_1155_] * i_1163_ - anIntArray9191[i_1155_] * i_1162_ + 16383) >> 14;
								anIntArray9191[i_1155_] = i_1164_;
							}
							anIntArray9191[i_1155_] += anInt9247;
							anIntArray9184[i_1155_] += anInt9212;
							anIntArray9161[i_1155_] += anInt9224;
						}
					}
				}
			}
		} else if (i == 3) {
			for (int i_1165_ = 0; i_1165_ < i_1126_; i_1165_++) {
				int i_1166_ = is[i_1165_];
				if (i_1166_ < anIntArrayArray9178.length) {
					int[] is_1167_ = anIntArrayArray9178[i_1166_];
					for (int i_1168_ = 0; i_1168_ < is_1167_.length; i_1168_++) {
						int i_1169_ = is_1167_[i_1168_];
						anIntArray9191[i_1169_] -= anInt9247;
						anIntArray9184[i_1169_] -= anInt9212;
						anIntArray9161[i_1169_] -= anInt9224;
						anIntArray9191[i_1169_] = anIntArray9191[i_1169_] * i_1122_ / 128;
						anIntArray9184[i_1169_] = anIntArray9184[i_1169_] * i_1123_ / 128;
						anIntArray9161[i_1169_] = anIntArray9161[i_1169_] * i_1124_ / 128;
						anIntArray9191[i_1169_] += anInt9247;
						anIntArray9184[i_1169_] += anInt9212;
						anIntArray9161[i_1169_] += anInt9224;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9208 != null && aByteArray9202 != null) {
				for (int i_1170_ = 0; i_1170_ < i_1126_; i_1170_++) {
					int i_1171_ = is[i_1170_];
					if (i_1171_ < anIntArrayArray9208.length) {
						int[] is_1172_ = anIntArrayArray9208[i_1171_];
						for (int i_1173_ = 0; i_1173_ < is_1172_.length; i_1173_++) {
							int i_1174_ = is_1172_[i_1173_];
							int i_1175_ = ((aByteArray9202[i_1174_] & 0xff) + i_1122_ * 8);
							if (i_1175_ < 0)
								i_1175_ = 0;
							else if (i_1175_ > 255)
								i_1175_ = 255;
							aByteArray9202[i_1174_] = (byte) i_1175_;
						}
					}
				}
				if (aClass116Array9218 != null) {
					for (int i_1176_ = 0; i_1176_ < anInt9217; i_1176_++) {
						Class116 class116 = aClass116Array9218[i_1176_];
						Class108 class108 = aClass108Array9211[i_1176_];
						class108.anInt1351 = (class108.anInt1351 * 328110239 & 0xffffff | 255 - ((aByteArray9202[class116.anInt1421 * 1723945109]) & 0xff) << 24) * 120490847;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9208 != null) {
				for (int i_1177_ = 0; i_1177_ < i_1126_; i_1177_++) {
					int i_1178_ = is[i_1177_];
					if (i_1178_ < anIntArrayArray9208.length) {
						int[] is_1179_ = anIntArrayArray9208[i_1178_];
						for (int i_1180_ = 0; i_1180_ < is_1179_.length; i_1180_++) {
							int i_1181_ = is_1179_[i_1180_];
							int i_1182_ = aShortArray9193[i_1181_] & 0xffff;
							int i_1183_ = i_1182_ >> 10 & 0x3f;
							int i_1184_ = i_1182_ >> 7 & 0x7;
							int i_1185_ = i_1182_ & 0x7f;
							i_1183_ = i_1183_ + i_1122_ & 0x3f;
							i_1184_ += i_1123_;
							if (i_1184_ < 0)
								i_1184_ = 0;
							else if (i_1184_ > 7)
								i_1184_ = 7;
							i_1185_ += i_1124_;
							if (i_1185_ < 0)
								i_1185_ = 0;
							else if (i_1185_ > 127)
								i_1185_ = 127;
							aShortArray9193[i_1181_] = (short) (i_1183_ << 10 | i_1184_ << 7 | i_1185_);
						}
						aBool9209 = true;
					}
				}
				if (aClass116Array9218 != null) {
					for (int i_1186_ = 0; i_1186_ < anInt9217; i_1186_++) {
						Class116 class116 = aClass116Array9218[i_1186_];
						Class108 class108 = aClass108Array9211[i_1186_];
						class108.anInt1351 = (class108.anInt1351 * 328110239 & ~0xffffff | ((Class656.anIntArray8393[Class453.method7333(((aShortArray9193[(class116.anInt1421 * 1723945109)]) & 0xffff), (byte) 10) & 0xffff]) & 0xffffff)) * 120490847;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9220 != null) {
				for (int i_1187_ = 0; i_1187_ < i_1126_; i_1187_++) {
					int i_1188_ = is[i_1187_];
					if (i_1188_ < anIntArrayArray9220.length) {
						int[] is_1189_ = anIntArrayArray9220[i_1188_];
						for (int i_1190_ = 0; i_1190_ < is_1189_.length; i_1190_++) {
							Class108 class108 = aClass108Array9211[is_1189_[i_1190_]];
							class108.anInt1346 += i_1122_ * -653278629;
							class108.anInt1350 += i_1123_ * -1290559937;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9220 != null) {
				for (int i_1191_ = 0; i_1191_ < i_1126_; i_1191_++) {
					int i_1192_ = is[i_1191_];
					if (i_1192_ < anIntArrayArray9220.length) {
						int[] is_1193_ = anIntArrayArray9220[i_1192_];
						for (int i_1194_ = 0; i_1194_ < is_1193_.length; i_1194_++) {
							Class108 class108 = aClass108Array9211[is_1193_[i_1194_]];
							class108.aFloat1347 = (class108.aFloat1347 * (float) i_1122_ / 128.0F);
							class108.aFloat1353 = (class108.aFloat1353 * (float) i_1123_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9220 != null) {
				for (int i_1195_ = 0; i_1195_ < i_1126_; i_1195_++) {
					int i_1196_ = is[i_1195_];
					if (i_1196_ < anIntArrayArray9220.length) {
						int[] is_1197_ = anIntArrayArray9220[i_1196_];
						for (int i_1198_ = 0; i_1198_ < is_1197_.length; i_1198_++) {
							Class108 class108 = aClass108Array9211[is_1197_[i_1198_]];
							class108.anInt1349 = (class108.anInt1349 * 1169382623 + i_1122_ & 0x3fff) * -1991287009;
						}
					}
				}
			}
		}
	}

	void method14684() {
		synchronized (this) {
			for (int i = 0; i < anInt9231; i++) {
				int i_1199_ = anIntArray9161[i];
				anIntArray9161[i] = anIntArray9191[i];
				anIntArray9191[i] = -i_1199_;
				if (aClass114Array9236[i] != null) {
					i_1199_ = aClass114Array9236[i].anInt1410;
					aClass114Array9236[i].anInt1410 = aClass114Array9236[i].anInt1412;
					aClass114Array9236[i].anInt1412 = -i_1199_;
				}
			}
			if (aClass113Array9199 != null) {
				for (int i = 0; i < anInt9185; i++) {
					if (aClass113Array9199[i] != null) {
						int i_1200_ = aClass113Array9199[i].anInt1409;
						aClass113Array9199[i].anInt1409 = aClass113Array9199[i].anInt1407;
						aClass113Array9199[i].anInt1407 = -i_1200_;
					}
				}
			}
			for (int i = anInt9231; i < anInt9177; i++) {
				int i_1201_ = anIntArray9161[i];
				anIntArray9161[i] = anIntArray9191[i];
				anIntArray9191[i] = -i_1201_;
			}
			anInt9246 = 0;
			aBool9221 = false;
		}
	}

	void method14685() {
		synchronized (this) {
			for (int i = 0; i < anInt9231; i++) {
				int i_1202_ = anIntArray9161[i];
				anIntArray9161[i] = anIntArray9191[i];
				anIntArray9191[i] = -i_1202_;
				if (aClass114Array9236[i] != null) {
					i_1202_ = aClass114Array9236[i].anInt1410;
					aClass114Array9236[i].anInt1410 = aClass114Array9236[i].anInt1412;
					aClass114Array9236[i].anInt1412 = -i_1202_;
				}
			}
			if (aClass113Array9199 != null) {
				for (int i = 0; i < anInt9185; i++) {
					if (aClass113Array9199[i] != null) {
						int i_1203_ = aClass113Array9199[i].anInt1409;
						aClass113Array9199[i].anInt1409 = aClass113Array9199[i].anInt1407;
						aClass113Array9199[i].anInt1407 = -i_1203_;
					}
				}
			}
			for (int i = anInt9231; i < anInt9177; i++) {
				int i_1204_ = anIntArray9161[i];
				anIntArray9161[i] = anIntArray9191[i];
				anIntArray9191[i] = -i_1204_;
			}
			anInt9246 = 0;
			aBool9221 = false;
		}
	}

	void method14686() {
		synchronized (this) {
			for (int i = 0; i < anInt9231; i++) {
				int i_1205_ = anIntArray9161[i];
				anIntArray9161[i] = anIntArray9191[i];
				anIntArray9191[i] = -i_1205_;
				if (aClass114Array9236[i] != null) {
					i_1205_ = aClass114Array9236[i].anInt1410;
					aClass114Array9236[i].anInt1410 = aClass114Array9236[i].anInt1412;
					aClass114Array9236[i].anInt1412 = -i_1205_;
				}
			}
			if (aClass113Array9199 != null) {
				for (int i = 0; i < anInt9185; i++) {
					if (aClass113Array9199[i] != null) {
						int i_1206_ = aClass113Array9199[i].anInt1409;
						aClass113Array9199[i].anInt1409 = aClass113Array9199[i].anInt1407;
						aClass113Array9199[i].anInt1407 = -i_1206_;
					}
				}
			}
			for (int i = anInt9231; i < anInt9177; i++) {
				int i_1207_ = anIntArray9161[i];
				anIntArray9161[i] = anIntArray9191[i];
				anIntArray9191[i] = -i_1207_;
			}
			anInt9246 = 0;
			aBool9221 = false;
		}
	}

	public void method2933(int i) {
		if ((anInt9174 & 0x6) != 6)
			throw new IllegalStateException();
		int i_1208_ = Class428.anIntArray4825[i];
		int i_1209_ = Class428.anIntArray4819[i];
		synchronized (this) {
			for (int i_1210_ = 0; i_1210_ < anInt9177; i_1210_++) {
				int i_1211_ = ((anIntArray9184[i_1210_] * i_1209_ - anIntArray9161[i_1210_] * i_1208_) >> 14);
				anIntArray9161[i_1210_] = (anIntArray9184[i_1210_] * i_1208_ + anIntArray9161[i_1210_] * i_1209_) >> 14;
				anIntArray9184[i_1210_] = i_1211_;
			}
			method14645();
		}
	}

	public void method3018(int i) {
		if ((anInt9174 & 0x6) != 6)
			throw new IllegalStateException();
		int i_1212_ = Class428.anIntArray4825[i];
		int i_1213_ = Class428.anIntArray4819[i];
		synchronized (this) {
			for (int i_1214_ = 0; i_1214_ < anInt9177; i_1214_++) {
				int i_1215_ = ((anIntArray9184[i_1214_] * i_1213_ - anIntArray9161[i_1214_] * i_1212_) >> 14);
				anIntArray9161[i_1214_] = (anIntArray9184[i_1214_] * i_1212_ + anIntArray9161[i_1214_] * i_1213_) >> 14;
				anIntArray9184[i_1214_] = i_1215_;
			}
			method14645();
		}
	}

	public void method2935(int i) {
		if ((anInt9174 & 0x3) != 3)
			throw new IllegalStateException();
		int i_1216_ = Class428.anIntArray4825[i];
		int i_1217_ = Class428.anIntArray4819[i];
		synchronized (this) {
			for (int i_1218_ = 0; i_1218_ < anInt9177; i_1218_++) {
				int i_1219_ = ((anIntArray9184[i_1218_] * i_1216_ + anIntArray9191[i_1218_] * i_1217_) >> 14);
				anIntArray9184[i_1218_] = (anIntArray9184[i_1218_] * i_1217_ - anIntArray9191[i_1218_] * i_1216_) >> 14;
				anIntArray9191[i_1218_] = i_1219_;
			}
			method14645();
		}
	}

	public void method2876(int i) {
		if ((anInt9174 & 0x3) != 3)
			throw new IllegalStateException();
		int i_1220_ = Class428.anIntArray4825[i];
		int i_1221_ = Class428.anIntArray4819[i];
		synchronized (this) {
			for (int i_1222_ = 0; i_1222_ < anInt9177; i_1222_++) {
				int i_1223_ = ((anIntArray9184[i_1222_] * i_1220_ + anIntArray9191[i_1222_] * i_1221_) >> 14);
				anIntArray9184[i_1222_] = (anIntArray9184[i_1222_] * i_1221_ - anIntArray9191[i_1222_] * i_1220_) >> 14;
				anIntArray9191[i_1222_] = i_1223_;
			}
			method14645();
		}
	}

	public void method3000(int i) {
		if ((anInt9174 & 0x3) != 3)
			throw new IllegalStateException();
		int i_1224_ = Class428.anIntArray4825[i];
		int i_1225_ = Class428.anIntArray4819[i];
		synchronized (this) {
			for (int i_1226_ = 0; i_1226_ < anInt9177; i_1226_++) {
				int i_1227_ = ((anIntArray9184[i_1226_] * i_1224_ + anIntArray9191[i_1226_] * i_1225_) >> 14);
				anIntArray9184[i_1226_] = (anIntArray9184[i_1226_] * i_1225_ - anIntArray9191[i_1226_] * i_1224_) >> 14;
				anIntArray9191[i_1226_] = i_1227_;
			}
			method14645();
		}
	}

	public void method2938(int i) {
		if ((anInt9174 & 0x3) != 3)
			throw new IllegalStateException();
		int i_1228_ = Class428.anIntArray4825[i];
		int i_1229_ = Class428.anIntArray4819[i];
		synchronized (this) {
			for (int i_1230_ = 0; i_1230_ < anInt9177; i_1230_++) {
				int i_1231_ = ((anIntArray9184[i_1230_] * i_1228_ + anIntArray9191[i_1230_] * i_1229_) >> 14);
				anIntArray9184[i_1230_] = (anIntArray9184[i_1230_] * i_1229_ - anIntArray9191[i_1230_] * i_1228_) >> 14;
				anIntArray9191[i_1230_] = i_1231_;
			}
			method14645();
		}
	}

	public void method2855(int i, int i_1232_, int i_1233_) {
		if (i != 0 && (anInt9174 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_1232_ != 0 && (anInt9174 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_1233_ != 0 && (anInt9174 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_1234_ = 0; i_1234_ < anInt9177; i_1234_++) {
				anIntArray9191[i_1234_] += i;
				anIntArray9184[i_1234_] += i_1232_;
				anIntArray9161[i_1234_] += i_1233_;
			}
		}
	}

	void method14687(boolean bool) {
		if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
			synchronized (this) {
				method14707(bool);
			}
		} else
			method14707(bool);
	}

	final boolean method14688(int i) {
		if (anIntArray9245 == null)
			return false;
		if (anIntArray9245[i] == -1)
			return false;
		return true;
	}

	public void method2912(int i, int i_1235_, Class161 class161, Class161 class161_1236_, int i_1237_, int i_1238_, int i_1239_) {
		if (i == 3) {
			if ((anInt9174 & 0x7) != 7)
				throw new IllegalStateException();
		} else if ((anInt9174 & 0x2) != 2)
			throw new IllegalStateException();
		if (!aBool9221)
			method14659();
		int i_1240_ = i_1237_ + aShort9226;
		int i_1241_ = i_1237_ + aShort9173;
		int i_1242_ = i_1239_ + aShort9228;
		int i_1243_ = i_1239_ + aShort9229;
		if (i == 4 || (i_1240_ >= 0 && ((i_1241_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1750 * 1210322533) && i_1242_ >= 0 && ((i_1243_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1751 * -533476177))) {
			int[][] is = class161.anIntArrayArray1754;
			int[][] is_1244_ = null;
			if (class161_1236_ != null)
				is_1244_ = class161_1236_.anIntArrayArray1754;
			if (i == 4 || i == 5) {
				if (class161_1236_ == null || (i_1240_ < 0 || ((i_1241_ + class161_1236_.anInt1752 * 1048375491 >> class161_1236_.anInt1753 * 1252000143) >= class161_1236_.anInt1750 * 1210322533) || i_1242_ < 0 || ((i_1243_ + class161_1236_.anInt1752 * 1048375491 >> class161_1236_.anInt1753 * 1252000143) >= class161_1236_.anInt1751 * -533476177)))
					return;
			} else {
				i_1240_ >>= class161.anInt1753 * 1252000143;
				i_1241_ = (i_1241_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				i_1242_ >>= class161.anInt1753 * 1252000143;
				i_1243_ = (i_1243_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				if (is[i_1240_][i_1242_] == i_1238_ && is[i_1241_][i_1242_] == i_1238_ && is[i_1240_][i_1243_] == i_1238_ && is[i_1241_][i_1243_] == i_1238_)
					return;
			}
			synchronized (this) {
				if (i == 1) {
					int i_1245_ = class161.anInt1752 * 1048375491 - 1;
					for (int i_1246_ = 0; i_1246_ < anInt9231; i_1246_++) {
						int i_1247_ = anIntArray9191[i_1246_] + i_1237_;
						int i_1248_ = anIntArray9161[i_1246_] + i_1239_;
						int i_1249_ = i_1247_ & i_1245_;
						int i_1250_ = i_1248_ & i_1245_;
						int i_1251_ = i_1247_ >> class161.anInt1753 * 1252000143;
						int i_1252_ = i_1248_ >> class161.anInt1753 * 1252000143;
						int i_1253_ = (((is[i_1251_][i_1252_] * (class161.anInt1752 * 1048375491 - i_1249_)) + is[i_1251_ + 1][i_1252_] * i_1249_) >> class161.anInt1753 * 1252000143);
						int i_1254_ = (((is[i_1251_][i_1252_ + 1] * (class161.anInt1752 * 1048375491 - i_1249_)) + is[i_1251_ + 1][i_1252_ + 1] * i_1249_) >> class161.anInt1753 * 1252000143);
						int i_1255_ = (i_1253_ * (class161.anInt1752 * 1048375491 - i_1250_) + i_1254_ * i_1250_ >> class161.anInt1753 * 1252000143);
						anIntArray9184[i_1246_] = anIntArray9184[i_1246_] + i_1255_ - i_1238_;
					}
					for (int i_1256_ = anInt9231; i_1256_ < anInt9177; i_1256_++) {
						int i_1257_ = anIntArray9191[i_1256_] + i_1237_;
						int i_1258_ = anIntArray9161[i_1256_] + i_1239_;
						int i_1259_ = i_1257_ & i_1245_;
						int i_1260_ = i_1258_ & i_1245_;
						int i_1261_ = i_1257_ >> class161.anInt1753 * 1252000143;
						int i_1262_ = i_1258_ >> class161.anInt1753 * 1252000143;
						if (i_1261_ >= 0 && i_1261_ < is.length - 1 && i_1262_ >= 0 && i_1262_ < is[0].length - 1) {
							int i_1263_ = (((is[i_1261_][i_1262_] * (class161.anInt1752 * 1048375491 - i_1259_)) + is[i_1261_ + 1][i_1262_] * i_1259_) >> class161.anInt1753 * 1252000143);
							int i_1264_ = (((is[i_1261_][i_1262_ + 1] * (class161.anInt1752 * 1048375491 - i_1259_)) + is[i_1261_ + 1][i_1262_ + 1] * i_1259_) >> class161.anInt1753 * 1252000143);
							int i_1265_ = (i_1263_ * (class161.anInt1752 * 1048375491 - i_1260_) + i_1264_ * i_1260_ >> class161.anInt1753 * 1252000143);
							anIntArray9184[i_1256_] = anIntArray9184[i_1256_] + i_1265_ - i_1238_;
						}
					}
				} else if (i == 2) {
					if (aShort9223 == 0)
						return;
					int i_1266_ = class161.anInt1752 * 1048375491 - 1;
					for (int i_1267_ = 0; i_1267_ < anInt9231; i_1267_++) {
						int i_1268_ = (anIntArray9184[i_1267_] << 16) / aShort9223;
						if (i_1268_ < i_1235_) {
							int i_1269_ = anIntArray9191[i_1267_] + i_1237_;
							int i_1270_ = anIntArray9161[i_1267_] + i_1239_;
							int i_1271_ = i_1269_ & i_1266_;
							int i_1272_ = i_1270_ & i_1266_;
							int i_1273_ = i_1269_ >> class161.anInt1753 * 1252000143;
							int i_1274_ = i_1270_ >> class161.anInt1753 * 1252000143;
							int i_1275_ = (((is[i_1273_][i_1274_] * (class161.anInt1752 * 1048375491 - i_1271_)) + is[i_1273_ + 1][i_1274_] * i_1271_) >> class161.anInt1753 * 1252000143);
							int i_1276_ = (((is[i_1273_][i_1274_ + 1] * (class161.anInt1752 * 1048375491 - i_1271_)) + is[i_1273_ + 1][i_1274_ + 1] * i_1271_) >> class161.anInt1753 * 1252000143);
							int i_1277_ = (i_1275_ * (class161.anInt1752 * 1048375491 - i_1272_) + i_1276_ * i_1272_ >> class161.anInt1753 * 1252000143);
							anIntArray9184[i_1267_] = (anIntArray9184[i_1267_] + ((i_1277_ - i_1238_) * (i_1235_ - i_1268_) / i_1235_));
						} else
							anIntArray9184[i_1267_] = anIntArray9184[i_1267_];
					}
					for (int i_1278_ = anInt9231; i_1278_ < anInt9177; i_1278_++) {
						int i_1279_ = (anIntArray9184[i_1278_] << 16) / aShort9223;
						if (i_1279_ < i_1235_) {
							int i_1280_ = anIntArray9191[i_1278_] + i_1237_;
							int i_1281_ = anIntArray9161[i_1278_] + i_1239_;
							int i_1282_ = i_1280_ & i_1266_;
							int i_1283_ = i_1281_ & i_1266_;
							int i_1284_ = i_1280_ >> class161.anInt1753 * 1252000143;
							int i_1285_ = i_1281_ >> class161.anInt1753 * 1252000143;
							if (i_1284_ >= 0 && (i_1284_ < class161.anInt1750 * 1210322533 - 1) && i_1285_ >= 0 && (i_1285_ < class161.anInt1751 * -533476177 - 1)) {
								int i_1286_ = (((is[i_1284_][i_1285_] * (class161.anInt1752 * 1048375491 - i_1282_)) + is[i_1284_ + 1][i_1285_] * i_1282_) >> class161.anInt1753 * 1252000143);
								int i_1287_ = (((is[i_1284_][i_1285_ + 1] * (class161.anInt1752 * 1048375491 - i_1282_)) + (is[i_1284_ + 1][i_1285_ + 1] * i_1282_)) >> class161.anInt1753 * 1252000143);
								int i_1288_ = ((i_1286_ * (class161.anInt1752 * 1048375491 - i_1283_)) + i_1287_ * i_1283_ >> class161.anInt1753 * 1252000143);
								anIntArray9184[i_1278_] = (anIntArray9184[i_1278_] + ((i_1288_ - i_1238_) * (i_1235_ - i_1279_) / i_1235_));
							}
						} else
							anIntArray9184[i_1278_] = anIntArray9184[i_1278_];
					}
				} else if (i == 3) {
					int i_1289_ = (i_1235_ & 0xff) * 16;
					int i_1290_ = (i_1235_ >> 8 & 0xff) * 16;
					int i_1291_ = (i_1235_ >> 16 & 0xff) << 6;
					int i_1292_ = (i_1235_ >> 24 & 0xff) << 6;
					if (i_1237_ - (i_1289_ >> 1) < 0 || ((i_1237_ + (i_1289_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1750 * 1210322533 << class161.anInt1753 * 1252000143)) || i_1239_ - (i_1290_ >> 1) < 0 || ((i_1239_ + (i_1290_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1751 * -533476177 << class161.anInt1753 * 1252000143)))
						return;
					method2962(class161, i_1237_, i_1238_, i_1239_, i_1289_, i_1290_, i_1291_, i_1292_);
				} else if (i == 4) {
					int i_1293_ = class161_1236_.anInt1752 * 1048375491 - 1;
					int i_1294_ = aShort9237 - aShort9223;
					for (int i_1295_ = 0; i_1295_ < anInt9231; i_1295_++) {
						int i_1296_ = anIntArray9191[i_1295_] + i_1237_;
						int i_1297_ = anIntArray9161[i_1295_] + i_1239_;
						int i_1298_ = i_1296_ & i_1293_;
						int i_1299_ = i_1297_ & i_1293_;
						int i_1300_ = i_1296_ >> class161_1236_.anInt1753 * 1252000143;
						int i_1301_ = i_1297_ >> class161_1236_.anInt1753 * 1252000143;
						int i_1302_ = (((is_1244_[i_1300_][i_1301_] * (class161_1236_.anInt1752 * 1048375491 - i_1298_)) + is_1244_[i_1300_ + 1][i_1301_] * i_1298_) >> class161_1236_.anInt1753 * 1252000143);
						int i_1303_ = (((is_1244_[i_1300_][i_1301_ + 1] * (class161_1236_.anInt1752 * 1048375491 - i_1298_)) + is_1244_[i_1300_ + 1][i_1301_ + 1] * i_1298_) >> class161_1236_.anInt1753 * 1252000143);
						int i_1304_ = (i_1302_ * (class161_1236_.anInt1752 * 1048375491 - i_1299_) + i_1303_ * i_1299_ >> class161_1236_.anInt1753 * 1252000143);
						anIntArray9184[i_1295_] = (anIntArray9184[i_1295_] + (i_1304_ - i_1238_) + i_1294_);
					}
					for (int i_1305_ = anInt9231; i_1305_ < anInt9177; i_1305_++) {
						int i_1306_ = anIntArray9191[i_1305_] + i_1237_;
						int i_1307_ = anIntArray9161[i_1305_] + i_1239_;
						int i_1308_ = i_1306_ & i_1293_;
						int i_1309_ = i_1307_ & i_1293_;
						int i_1310_ = i_1306_ >> class161_1236_.anInt1753 * 1252000143;
						int i_1311_ = i_1307_ >> class161_1236_.anInt1753 * 1252000143;
						if (i_1310_ >= 0 && (i_1310_ < class161_1236_.anInt1750 * 1210322533 - 1) && i_1311_ >= 0 && (i_1311_ < class161_1236_.anInt1751 * -533476177 - 1)) {
							int i_1312_ = (((is_1244_[i_1310_][i_1311_] * (class161_1236_.anInt1752 * 1048375491 - i_1308_)) + is_1244_[i_1310_ + 1][i_1311_] * i_1308_) >> class161_1236_.anInt1753 * 1252000143);
							int i_1313_ = (((is_1244_[i_1310_][i_1311_ + 1] * (class161_1236_.anInt1752 * 1048375491 - i_1308_)) + (is_1244_[i_1310_ + 1][i_1311_ + 1] * i_1308_)) >> class161_1236_.anInt1753 * 1252000143);
							int i_1314_ = ((i_1312_ * (class161_1236_.anInt1752 * 1048375491 - i_1309_)) + i_1313_ * i_1309_ >> class161_1236_.anInt1753 * 1252000143);
							anIntArray9184[i_1305_] = (anIntArray9184[i_1305_] + (i_1314_ - i_1238_) + i_1294_);
						}
					}
				} else if (i == 5) {
					int i_1315_ = class161_1236_.anInt1752 * 1048375491 - 1;
					int i_1316_ = aShort9237 - aShort9223;
					for (int i_1317_ = 0; i_1317_ < anInt9231; i_1317_++) {
						int i_1318_ = anIntArray9191[i_1317_] + i_1237_;
						int i_1319_ = anIntArray9161[i_1317_] + i_1239_;
						int i_1320_ = i_1318_ & i_1315_;
						int i_1321_ = i_1319_ & i_1315_;
						int i_1322_ = i_1318_ >> class161.anInt1753 * 1252000143;
						int i_1323_ = i_1319_ >> class161.anInt1753 * 1252000143;
						int i_1324_ = (((is[i_1322_][i_1323_] * (class161.anInt1752 * 1048375491 - i_1320_)) + is[i_1322_ + 1][i_1323_] * i_1320_) >> class161.anInt1753 * 1252000143);
						int i_1325_ = (((is[i_1322_][i_1323_ + 1] * (class161.anInt1752 * 1048375491 - i_1320_)) + is[i_1322_ + 1][i_1323_ + 1] * i_1320_) >> class161.anInt1753 * 1252000143);
						int i_1326_ = (i_1324_ * (class161.anInt1752 * 1048375491 - i_1321_) + i_1325_ * i_1321_ >> class161.anInt1753 * 1252000143);
						i_1324_ = (((is_1244_[i_1322_][i_1323_] * (class161_1236_.anInt1752 * 1048375491 - i_1320_)) + is_1244_[i_1322_ + 1][i_1323_] * i_1320_) >> class161_1236_.anInt1753 * 1252000143);
						i_1325_ = (((is_1244_[i_1322_][i_1323_ + 1] * (class161_1236_.anInt1752 * 1048375491 - i_1320_)) + is_1244_[i_1322_ + 1][i_1323_ + 1] * i_1320_) >> class161_1236_.anInt1753 * 1252000143);
						int i_1327_ = (i_1324_ * (class161_1236_.anInt1752 * 1048375491 - i_1321_) + i_1325_ * i_1321_ >> class161_1236_.anInt1753 * 1252000143);
						int i_1328_ = i_1326_ - i_1327_ - i_1235_;
						anIntArray9184[i_1317_] = ((anIntArray9184[i_1317_] << 8) / i_1316_ * i_1328_ >> 8) - (i_1238_ - i_1326_);
					}
					for (int i_1329_ = anInt9231; i_1329_ < anInt9177; i_1329_++) {
						int i_1330_ = anIntArray9191[i_1329_] + i_1237_;
						int i_1331_ = anIntArray9161[i_1329_] + i_1239_;
						int i_1332_ = i_1330_ & i_1315_;
						int i_1333_ = i_1331_ & i_1315_;
						int i_1334_ = i_1330_ >> class161.anInt1753 * 1252000143;
						int i_1335_ = i_1331_ >> class161.anInt1753 * 1252000143;
						if (i_1334_ >= 0 && i_1334_ < class161.anInt1750 * 1210322533 - 1 && (i_1334_ < class161_1236_.anInt1750 * 1210322533 - 1) && i_1335_ >= 0 && i_1335_ < class161.anInt1751 * -533476177 - 1 && (i_1335_ < class161_1236_.anInt1751 * -533476177 - 1)) {
							int i_1336_ = (((is[i_1334_][i_1335_] * (class161.anInt1752 * 1048375491 - i_1332_)) + is[i_1334_ + 1][i_1335_] * i_1332_) >> class161.anInt1753 * 1252000143);
							int i_1337_ = (((is[i_1334_][i_1335_ + 1] * (class161.anInt1752 * 1048375491 - i_1332_)) + is[i_1334_ + 1][i_1335_ + 1] * i_1332_) >> class161.anInt1753 * 1252000143);
							int i_1338_ = (i_1336_ * (class161.anInt1752 * 1048375491 - i_1333_) + i_1337_ * i_1333_ >> class161.anInt1753 * 1252000143);
							i_1336_ = (((is_1244_[i_1334_][i_1335_] * (class161_1236_.anInt1752 * 1048375491 - i_1332_)) + is_1244_[i_1334_ + 1][i_1335_] * i_1332_) >> class161_1236_.anInt1753 * 1252000143);
							i_1337_ = (((is_1244_[i_1334_][i_1335_ + 1] * (class161_1236_.anInt1752 * 1048375491 - i_1332_)) + (is_1244_[i_1334_ + 1][i_1335_ + 1] * i_1332_)) >> class161_1236_.anInt1753 * 1252000143);
							int i_1339_ = ((i_1336_ * (class161_1236_.anInt1752 * 1048375491 - i_1333_)) + i_1337_ * i_1333_ >> class161_1236_.anInt1753 * 1252000143);
							int i_1340_ = i_1338_ - i_1339_ - i_1235_;
							anIntArray9184[i_1329_] = (((anIntArray9184[i_1329_] << 8) / i_1316_ * i_1340_) >> 8) - (i_1238_ - i_1338_);
						}
					}
				}
				aBool9221 = false;
			}
		}
	}

	final void method14689(boolean bool, boolean bool_1341_, boolean bool_1342_, int i, boolean bool_1343_, boolean bool_1344_) {
		if (anIntArray9194[i] != -2) {
			short i_1345_ = aShortArray9187[i];
			short i_1346_ = aShortArray9188[i];
			short i_1347_ = aShortArray9189[i];
			float f = aFloatArray9167[i_1345_];
			float f_1348_ = aFloatArray9167[i_1346_];
			float f_1349_ = aFloatArray9167[i_1347_];
			if (!bool_1343_ || (f != -5000.0F && f_1348_ != -5000.0F && f_1349_ != -5000.0F)) {
				float f_1350_ = aFloatArray9198[i_1345_];
				float f_1351_ = aFloatArray9198[i_1346_];
				float f_1352_ = aFloatArray9198[i_1347_];
				if (anIntArray9245[i] != -1 || ((f - f_1348_) * (f_1352_ - f_1351_) - (f_1350_ - f_1351_) * (f_1349_ - f_1348_)) > 0.0F) {
					if (f < 0.0F || f_1348_ < 0.0F || f_1349_ < 0.0F || f > (float) (aClass101_9163.anInt1224 * 541969699) || f_1348_ > (float) (aClass101_9163.anInt1224 * 541969699) || f_1349_ > (float) (aClass101_9163.anInt1224 * 541969699))
						aClass119_9165.aBool1445 = true;
					else
						aClass119_9165.aBool1445 = false;
					if (bool_1344_) {
						int i_1353_ = anIntArray9245[i];
						if (i_1353_ == -1 || !aClass116Array9218[i_1353_].aBool1415)
							method14646(bool, bool_1341_, bool_1342_, i);
					} else {
						int i_1354_ = anIntArray9245[i];
						if (i_1354_ != -1) {
							Class116 class116 = aClass116Array9218[i_1354_];
							Class108 class108 = aClass108Array9211[i_1354_];
							if (!class116.aBool1415)
								method14652(bool, bool_1341_, bool_1342_, i);
							aClass180_Sub1_9171.method14840(bool, bool_1341_, bool_1342_, class108.anInt1348 * 239951701, class108.anInt1352 * 888949401, class108.aFloat1356, class108.anInt1354 * -483431175, class108.anInt1355 * -777416001, class116.aShort1418, class108.anInt1351 * 328110239, class116.aByte1419, class116.aByte1416);
						} else
							method14652(bool, bool_1341_, bool_1342_, i);
					}
				}
			}
		}
	}

	public int method2897() {
		if (!aBool9221)
			method14659();
		return aShort9237;
	}

	public void method2945(int i, int i_1355_, Class161 class161, Class161 class161_1356_, int i_1357_, int i_1358_, int i_1359_) {
		if (i == 3) {
			if ((anInt9174 & 0x7) != 7)
				throw new IllegalStateException();
		} else if ((anInt9174 & 0x2) != 2)
			throw new IllegalStateException();
		if (!aBool9221)
			method14659();
		int i_1360_ = i_1357_ + aShort9226;
		int i_1361_ = i_1357_ + aShort9173;
		int i_1362_ = i_1359_ + aShort9228;
		int i_1363_ = i_1359_ + aShort9229;
		if (i == 4 || (i_1360_ >= 0 && ((i_1361_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1750 * 1210322533) && i_1362_ >= 0 && ((i_1363_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1751 * -533476177))) {
			int[][] is = class161.anIntArrayArray1754;
			int[][] is_1364_ = null;
			if (class161_1356_ != null)
				is_1364_ = class161_1356_.anIntArrayArray1754;
			if (i == 4 || i == 5) {
				if (class161_1356_ == null || (i_1360_ < 0 || ((i_1361_ + class161_1356_.anInt1752 * 1048375491 >> class161_1356_.anInt1753 * 1252000143) >= class161_1356_.anInt1750 * 1210322533) || i_1362_ < 0 || ((i_1363_ + class161_1356_.anInt1752 * 1048375491 >> class161_1356_.anInt1753 * 1252000143) >= class161_1356_.anInt1751 * -533476177)))
					return;
			} else {
				i_1360_ >>= class161.anInt1753 * 1252000143;
				i_1361_ = (i_1361_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				i_1362_ >>= class161.anInt1753 * 1252000143;
				i_1363_ = (i_1363_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				if (is[i_1360_][i_1362_] == i_1358_ && is[i_1361_][i_1362_] == i_1358_ && is[i_1360_][i_1363_] == i_1358_ && is[i_1361_][i_1363_] == i_1358_)
					return;
			}
			synchronized (this) {
				if (i == 1) {
					int i_1365_ = class161.anInt1752 * 1048375491 - 1;
					for (int i_1366_ = 0; i_1366_ < anInt9231; i_1366_++) {
						int i_1367_ = anIntArray9191[i_1366_] + i_1357_;
						int i_1368_ = anIntArray9161[i_1366_] + i_1359_;
						int i_1369_ = i_1367_ & i_1365_;
						int i_1370_ = i_1368_ & i_1365_;
						int i_1371_ = i_1367_ >> class161.anInt1753 * 1252000143;
						int i_1372_ = i_1368_ >> class161.anInt1753 * 1252000143;
						int i_1373_ = (((is[i_1371_][i_1372_] * (class161.anInt1752 * 1048375491 - i_1369_)) + is[i_1371_ + 1][i_1372_] * i_1369_) >> class161.anInt1753 * 1252000143);
						int i_1374_ = (((is[i_1371_][i_1372_ + 1] * (class161.anInt1752 * 1048375491 - i_1369_)) + is[i_1371_ + 1][i_1372_ + 1] * i_1369_) >> class161.anInt1753 * 1252000143);
						int i_1375_ = (i_1373_ * (class161.anInt1752 * 1048375491 - i_1370_) + i_1374_ * i_1370_ >> class161.anInt1753 * 1252000143);
						anIntArray9184[i_1366_] = anIntArray9184[i_1366_] + i_1375_ - i_1358_;
					}
					for (int i_1376_ = anInt9231; i_1376_ < anInt9177; i_1376_++) {
						int i_1377_ = anIntArray9191[i_1376_] + i_1357_;
						int i_1378_ = anIntArray9161[i_1376_] + i_1359_;
						int i_1379_ = i_1377_ & i_1365_;
						int i_1380_ = i_1378_ & i_1365_;
						int i_1381_ = i_1377_ >> class161.anInt1753 * 1252000143;
						int i_1382_ = i_1378_ >> class161.anInt1753 * 1252000143;
						if (i_1381_ >= 0 && i_1381_ < is.length - 1 && i_1382_ >= 0 && i_1382_ < is[0].length - 1) {
							int i_1383_ = (((is[i_1381_][i_1382_] * (class161.anInt1752 * 1048375491 - i_1379_)) + is[i_1381_ + 1][i_1382_] * i_1379_) >> class161.anInt1753 * 1252000143);
							int i_1384_ = (((is[i_1381_][i_1382_ + 1] * (class161.anInt1752 * 1048375491 - i_1379_)) + is[i_1381_ + 1][i_1382_ + 1] * i_1379_) >> class161.anInt1753 * 1252000143);
							int i_1385_ = (i_1383_ * (class161.anInt1752 * 1048375491 - i_1380_) + i_1384_ * i_1380_ >> class161.anInt1753 * 1252000143);
							anIntArray9184[i_1376_] = anIntArray9184[i_1376_] + i_1385_ - i_1358_;
						}
					}
				} else if (i == 2) {
					if (aShort9223 == 0)
						return;
					int i_1386_ = class161.anInt1752 * 1048375491 - 1;
					for (int i_1387_ = 0; i_1387_ < anInt9231; i_1387_++) {
						int i_1388_ = (anIntArray9184[i_1387_] << 16) / aShort9223;
						if (i_1388_ < i_1355_) {
							int i_1389_ = anIntArray9191[i_1387_] + i_1357_;
							int i_1390_ = anIntArray9161[i_1387_] + i_1359_;
							int i_1391_ = i_1389_ & i_1386_;
							int i_1392_ = i_1390_ & i_1386_;
							int i_1393_ = i_1389_ >> class161.anInt1753 * 1252000143;
							int i_1394_ = i_1390_ >> class161.anInt1753 * 1252000143;
							int i_1395_ = (((is[i_1393_][i_1394_] * (class161.anInt1752 * 1048375491 - i_1391_)) + is[i_1393_ + 1][i_1394_] * i_1391_) >> class161.anInt1753 * 1252000143);
							int i_1396_ = (((is[i_1393_][i_1394_ + 1] * (class161.anInt1752 * 1048375491 - i_1391_)) + is[i_1393_ + 1][i_1394_ + 1] * i_1391_) >> class161.anInt1753 * 1252000143);
							int i_1397_ = (i_1395_ * (class161.anInt1752 * 1048375491 - i_1392_) + i_1396_ * i_1392_ >> class161.anInt1753 * 1252000143);
							anIntArray9184[i_1387_] = (anIntArray9184[i_1387_] + ((i_1397_ - i_1358_) * (i_1355_ - i_1388_) / i_1355_));
						} else
							anIntArray9184[i_1387_] = anIntArray9184[i_1387_];
					}
					for (int i_1398_ = anInt9231; i_1398_ < anInt9177; i_1398_++) {
						int i_1399_ = (anIntArray9184[i_1398_] << 16) / aShort9223;
						if (i_1399_ < i_1355_) {
							int i_1400_ = anIntArray9191[i_1398_] + i_1357_;
							int i_1401_ = anIntArray9161[i_1398_] + i_1359_;
							int i_1402_ = i_1400_ & i_1386_;
							int i_1403_ = i_1401_ & i_1386_;
							int i_1404_ = i_1400_ >> class161.anInt1753 * 1252000143;
							int i_1405_ = i_1401_ >> class161.anInt1753 * 1252000143;
							if (i_1404_ >= 0 && (i_1404_ < class161.anInt1750 * 1210322533 - 1) && i_1405_ >= 0 && (i_1405_ < class161.anInt1751 * -533476177 - 1)) {
								int i_1406_ = (((is[i_1404_][i_1405_] * (class161.anInt1752 * 1048375491 - i_1402_)) + is[i_1404_ + 1][i_1405_] * i_1402_) >> class161.anInt1753 * 1252000143);
								int i_1407_ = (((is[i_1404_][i_1405_ + 1] * (class161.anInt1752 * 1048375491 - i_1402_)) + (is[i_1404_ + 1][i_1405_ + 1] * i_1402_)) >> class161.anInt1753 * 1252000143);
								int i_1408_ = ((i_1406_ * (class161.anInt1752 * 1048375491 - i_1403_)) + i_1407_ * i_1403_ >> class161.anInt1753 * 1252000143);
								anIntArray9184[i_1398_] = (anIntArray9184[i_1398_] + ((i_1408_ - i_1358_) * (i_1355_ - i_1399_) / i_1355_));
							}
						} else
							anIntArray9184[i_1398_] = anIntArray9184[i_1398_];
					}
				} else if (i == 3) {
					int i_1409_ = (i_1355_ & 0xff) * 16;
					int i_1410_ = (i_1355_ >> 8 & 0xff) * 16;
					int i_1411_ = (i_1355_ >> 16 & 0xff) << 6;
					int i_1412_ = (i_1355_ >> 24 & 0xff) << 6;
					if (i_1357_ - (i_1409_ >> 1) < 0 || ((i_1357_ + (i_1409_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1750 * 1210322533 << class161.anInt1753 * 1252000143)) || i_1359_ - (i_1410_ >> 1) < 0 || ((i_1359_ + (i_1410_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1751 * -533476177 << class161.anInt1753 * 1252000143)))
						return;
					method2962(class161, i_1357_, i_1358_, i_1359_, i_1409_, i_1410_, i_1411_, i_1412_);
				} else if (i == 4) {
					int i_1413_ = class161_1356_.anInt1752 * 1048375491 - 1;
					int i_1414_ = aShort9237 - aShort9223;
					for (int i_1415_ = 0; i_1415_ < anInt9231; i_1415_++) {
						int i_1416_ = anIntArray9191[i_1415_] + i_1357_;
						int i_1417_ = anIntArray9161[i_1415_] + i_1359_;
						int i_1418_ = i_1416_ & i_1413_;
						int i_1419_ = i_1417_ & i_1413_;
						int i_1420_ = i_1416_ >> class161_1356_.anInt1753 * 1252000143;
						int i_1421_ = i_1417_ >> class161_1356_.anInt1753 * 1252000143;
						int i_1422_ = (((is_1364_[i_1420_][i_1421_] * (class161_1356_.anInt1752 * 1048375491 - i_1418_)) + is_1364_[i_1420_ + 1][i_1421_] * i_1418_) >> class161_1356_.anInt1753 * 1252000143);
						int i_1423_ = (((is_1364_[i_1420_][i_1421_ + 1] * (class161_1356_.anInt1752 * 1048375491 - i_1418_)) + is_1364_[i_1420_ + 1][i_1421_ + 1] * i_1418_) >> class161_1356_.anInt1753 * 1252000143);
						int i_1424_ = (i_1422_ * (class161_1356_.anInt1752 * 1048375491 - i_1419_) + i_1423_ * i_1419_ >> class161_1356_.anInt1753 * 1252000143);
						anIntArray9184[i_1415_] = (anIntArray9184[i_1415_] + (i_1424_ - i_1358_) + i_1414_);
					}
					for (int i_1425_ = anInt9231; i_1425_ < anInt9177; i_1425_++) {
						int i_1426_ = anIntArray9191[i_1425_] + i_1357_;
						int i_1427_ = anIntArray9161[i_1425_] + i_1359_;
						int i_1428_ = i_1426_ & i_1413_;
						int i_1429_ = i_1427_ & i_1413_;
						int i_1430_ = i_1426_ >> class161_1356_.anInt1753 * 1252000143;
						int i_1431_ = i_1427_ >> class161_1356_.anInt1753 * 1252000143;
						if (i_1430_ >= 0 && (i_1430_ < class161_1356_.anInt1750 * 1210322533 - 1) && i_1431_ >= 0 && (i_1431_ < class161_1356_.anInt1751 * -533476177 - 1)) {
							int i_1432_ = (((is_1364_[i_1430_][i_1431_] * (class161_1356_.anInt1752 * 1048375491 - i_1428_)) + is_1364_[i_1430_ + 1][i_1431_] * i_1428_) >> class161_1356_.anInt1753 * 1252000143);
							int i_1433_ = (((is_1364_[i_1430_][i_1431_ + 1] * (class161_1356_.anInt1752 * 1048375491 - i_1428_)) + (is_1364_[i_1430_ + 1][i_1431_ + 1] * i_1428_)) >> class161_1356_.anInt1753 * 1252000143);
							int i_1434_ = ((i_1432_ * (class161_1356_.anInt1752 * 1048375491 - i_1429_)) + i_1433_ * i_1429_ >> class161_1356_.anInt1753 * 1252000143);
							anIntArray9184[i_1425_] = (anIntArray9184[i_1425_] + (i_1434_ - i_1358_) + i_1414_);
						}
					}
				} else if (i == 5) {
					int i_1435_ = class161_1356_.anInt1752 * 1048375491 - 1;
					int i_1436_ = aShort9237 - aShort9223;
					for (int i_1437_ = 0; i_1437_ < anInt9231; i_1437_++) {
						int i_1438_ = anIntArray9191[i_1437_] + i_1357_;
						int i_1439_ = anIntArray9161[i_1437_] + i_1359_;
						int i_1440_ = i_1438_ & i_1435_;
						int i_1441_ = i_1439_ & i_1435_;
						int i_1442_ = i_1438_ >> class161.anInt1753 * 1252000143;
						int i_1443_ = i_1439_ >> class161.anInt1753 * 1252000143;
						int i_1444_ = (((is[i_1442_][i_1443_] * (class161.anInt1752 * 1048375491 - i_1440_)) + is[i_1442_ + 1][i_1443_] * i_1440_) >> class161.anInt1753 * 1252000143);
						int i_1445_ = (((is[i_1442_][i_1443_ + 1] * (class161.anInt1752 * 1048375491 - i_1440_)) + is[i_1442_ + 1][i_1443_ + 1] * i_1440_) >> class161.anInt1753 * 1252000143);
						int i_1446_ = (i_1444_ * (class161.anInt1752 * 1048375491 - i_1441_) + i_1445_ * i_1441_ >> class161.anInt1753 * 1252000143);
						i_1444_ = (((is_1364_[i_1442_][i_1443_] * (class161_1356_.anInt1752 * 1048375491 - i_1440_)) + is_1364_[i_1442_ + 1][i_1443_] * i_1440_) >> class161_1356_.anInt1753 * 1252000143);
						i_1445_ = (((is_1364_[i_1442_][i_1443_ + 1] * (class161_1356_.anInt1752 * 1048375491 - i_1440_)) + is_1364_[i_1442_ + 1][i_1443_ + 1] * i_1440_) >> class161_1356_.anInt1753 * 1252000143);
						int i_1447_ = (i_1444_ * (class161_1356_.anInt1752 * 1048375491 - i_1441_) + i_1445_ * i_1441_ >> class161_1356_.anInt1753 * 1252000143);
						int i_1448_ = i_1446_ - i_1447_ - i_1355_;
						anIntArray9184[i_1437_] = ((anIntArray9184[i_1437_] << 8) / i_1436_ * i_1448_ >> 8) - (i_1358_ - i_1446_);
					}
					for (int i_1449_ = anInt9231; i_1449_ < anInt9177; i_1449_++) {
						int i_1450_ = anIntArray9191[i_1449_] + i_1357_;
						int i_1451_ = anIntArray9161[i_1449_] + i_1359_;
						int i_1452_ = i_1450_ & i_1435_;
						int i_1453_ = i_1451_ & i_1435_;
						int i_1454_ = i_1450_ >> class161.anInt1753 * 1252000143;
						int i_1455_ = i_1451_ >> class161.anInt1753 * 1252000143;
						if (i_1454_ >= 0 && i_1454_ < class161.anInt1750 * 1210322533 - 1 && (i_1454_ < class161_1356_.anInt1750 * 1210322533 - 1) && i_1455_ >= 0 && i_1455_ < class161.anInt1751 * -533476177 - 1 && (i_1455_ < class161_1356_.anInt1751 * -533476177 - 1)) {
							int i_1456_ = (((is[i_1454_][i_1455_] * (class161.anInt1752 * 1048375491 - i_1452_)) + is[i_1454_ + 1][i_1455_] * i_1452_) >> class161.anInt1753 * 1252000143);
							int i_1457_ = (((is[i_1454_][i_1455_ + 1] * (class161.anInt1752 * 1048375491 - i_1452_)) + is[i_1454_ + 1][i_1455_ + 1] * i_1452_) >> class161.anInt1753 * 1252000143);
							int i_1458_ = (i_1456_ * (class161.anInt1752 * 1048375491 - i_1453_) + i_1457_ * i_1453_ >> class161.anInt1753 * 1252000143);
							i_1456_ = (((is_1364_[i_1454_][i_1455_] * (class161_1356_.anInt1752 * 1048375491 - i_1452_)) + is_1364_[i_1454_ + 1][i_1455_] * i_1452_) >> class161_1356_.anInt1753 * 1252000143);
							i_1457_ = (((is_1364_[i_1454_][i_1455_ + 1] * (class161_1356_.anInt1752 * 1048375491 - i_1452_)) + (is_1364_[i_1454_ + 1][i_1455_ + 1] * i_1452_)) >> class161_1356_.anInt1753 * 1252000143);
							int i_1459_ = ((i_1456_ * (class161_1356_.anInt1752 * 1048375491 - i_1453_)) + i_1457_ * i_1453_ >> class161_1356_.anInt1753 * 1252000143);
							int i_1460_ = i_1458_ - i_1459_ - i_1355_;
							anIntArray9184[i_1449_] = (((anIntArray9184[i_1449_] << 8) / i_1436_ * i_1460_) >> 8) - (i_1358_ - i_1458_);
						}
					}
				}
				aBool9221 = false;
			}
		}
	}

	public int method2939() {
		if (!aBool9221)
			method14659();
		return aShort9173;
	}

	void method2946() {
		if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
			synchronized (this) {
				while (aBool1951) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool1951 = true;
			}
		}
	}

	public int method2973() {
		if (!aBool9221)
			method14659();
		return aShort9222;
	}

	final boolean method14690(int i) {
		if (aByteArray9202 == null)
			return false;
		if (aByteArray9202[i] == 0)
			return false;
		return true;
	}

	boolean method3021() {
		if (anIntArrayArray9178 == null)
			return false;
		anInt9247 = 0;
		anInt9212 = 0;
		anInt9224 = 0;
		return true;
	}

	void method3031() {
		if (aBool9210) {
			for (int i = 0; i < anInt9177; i++) {
				anIntArray9191[i] = anIntArray9191[i] + 7 >> 4;
				anIntArray9184[i] = anIntArray9184[i] + 7 >> 4;
				anIntArray9161[i] = anIntArray9161[i] + 7 >> 4;
			}
			aBool9210 = false;
		}
		if (aBool9209) {
			method14656();
			aBool9209 = false;
		}
		aBool9221 = false;
	}

	void method2927() {
		if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
			synchronized (this) {
				aBool1951 = false;
				this.notifyAll();
			}
		}
	}

	public void method2990() {
		/* empty */
	}

	public void method2941(int i) {
		if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
			synchronized (this) {
				if ((anInt9174 & 0x10000) == 65536 && (i & 0x10000) == 0)
					method14634(true);
				anInt9174 = i;
			}
		} else {
			if ((anInt9174 & 0x10000) == 65536 && (i & 0x10000) == 0)
				method14634(true);
			anInt9174 = i;
		}
	}

	void method14691(boolean bool) {
		if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
			synchronized (this) {
				method14707(bool);
			}
		} else
			method14707(bool);
	}

	void method2954(int i, int[] is, int i_1461_, int i_1462_, int i_1463_, int i_1464_, boolean bool) {
		int i_1465_ = is.length;
		if (i == 0) {
			i_1461_ <<= 4;
			i_1462_ <<= 4;
			i_1463_ <<= 4;
			if (!aBool9210) {
				for (int i_1466_ = 0; i_1466_ < anInt9177; i_1466_++) {
					anIntArray9191[i_1466_] <<= 4;
					anIntArray9184[i_1466_] <<= 4;
					anIntArray9161[i_1466_] <<= 4;
				}
				aBool9210 = true;
			}
			int i_1467_ = 0;
			anInt9247 = 0;
			anInt9212 = 0;
			anInt9224 = 0;
			for (int i_1468_ = 0; i_1468_ < i_1465_; i_1468_++) {
				int i_1469_ = is[i_1468_];
				if (i_1469_ < anIntArrayArray9178.length) {
					int[] is_1470_ = anIntArrayArray9178[i_1469_];
					for (int i_1471_ = 0; i_1471_ < is_1470_.length; i_1471_++) {
						int i_1472_ = is_1470_[i_1471_];
						anInt9247 += anIntArray9191[i_1472_];
						anInt9212 += anIntArray9184[i_1472_];
						anInt9224 += anIntArray9161[i_1472_];
						i_1467_++;
					}
				}
			}
			if (i_1467_ > 0) {
				anInt9247 = anInt9247 / i_1467_ + i_1461_;
				anInt9212 = anInt9212 / i_1467_ + i_1462_;
				anInt9224 = anInt9224 / i_1467_ + i_1463_;
			} else {
				anInt9247 = i_1461_;
				anInt9212 = i_1462_;
				anInt9224 = i_1463_;
			}
		} else if (i == 1) {
			i_1461_ <<= 4;
			i_1462_ <<= 4;
			i_1463_ <<= 4;
			if (!aBool9210) {
				for (int i_1473_ = 0; i_1473_ < anInt9177; i_1473_++) {
					anIntArray9191[i_1473_] <<= 4;
					anIntArray9184[i_1473_] <<= 4;
					anIntArray9161[i_1473_] <<= 4;
				}
				aBool9210 = true;
			}
			for (int i_1474_ = 0; i_1474_ < i_1465_; i_1474_++) {
				int i_1475_ = is[i_1474_];
				if (i_1475_ < anIntArrayArray9178.length) {
					int[] is_1476_ = anIntArrayArray9178[i_1475_];
					for (int i_1477_ = 0; i_1477_ < is_1476_.length; i_1477_++) {
						int i_1478_ = is_1476_[i_1477_];
						anIntArray9191[i_1478_] += i_1461_;
						anIntArray9184[i_1478_] += i_1462_;
						anIntArray9161[i_1478_] += i_1463_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1479_ = 0; i_1479_ < i_1465_; i_1479_++) {
				int i_1480_ = is[i_1479_];
				if (i_1480_ < anIntArrayArray9178.length) {
					int[] is_1481_ = anIntArrayArray9178[i_1480_];
					if ((i_1464_ & 0x1) == 0) {
						for (int i_1482_ = 0; i_1482_ < is_1481_.length; i_1482_++) {
							int i_1483_ = is_1481_[i_1482_];
							anIntArray9191[i_1483_] -= anInt9247;
							anIntArray9184[i_1483_] -= anInt9212;
							anIntArray9161[i_1483_] -= anInt9224;
							if (i_1463_ != 0) {
								int i_1484_ = Class428.anIntArray4825[i_1463_];
								int i_1485_ = Class428.anIntArray4819[i_1463_];
								int i_1486_ = ((anIntArray9184[i_1483_] * i_1484_ + anIntArray9191[i_1483_] * i_1485_ + 16383) >> 14);
								anIntArray9184[i_1483_] = (anIntArray9184[i_1483_] * i_1485_ - anIntArray9191[i_1483_] * i_1484_ + 16383) >> 14;
								anIntArray9191[i_1483_] = i_1486_;
							}
							if (i_1461_ != 0) {
								int i_1487_ = Class428.anIntArray4825[i_1461_];
								int i_1488_ = Class428.anIntArray4819[i_1461_];
								int i_1489_ = ((anIntArray9184[i_1483_] * i_1488_ - anIntArray9161[i_1483_] * i_1487_ + 16383) >> 14);
								anIntArray9161[i_1483_] = (anIntArray9184[i_1483_] * i_1487_ + anIntArray9161[i_1483_] * i_1488_ + 16383) >> 14;
								anIntArray9184[i_1483_] = i_1489_;
							}
							if (i_1462_ != 0) {
								int i_1490_ = Class428.anIntArray4825[i_1462_];
								int i_1491_ = Class428.anIntArray4819[i_1462_];
								int i_1492_ = ((anIntArray9161[i_1483_] * i_1490_ + anIntArray9191[i_1483_] * i_1491_ + 16383) >> 14);
								anIntArray9161[i_1483_] = (anIntArray9161[i_1483_] * i_1491_ - anIntArray9191[i_1483_] * i_1490_ + 16383) >> 14;
								anIntArray9191[i_1483_] = i_1492_;
							}
							anIntArray9191[i_1483_] += anInt9247;
							anIntArray9184[i_1483_] += anInt9212;
							anIntArray9161[i_1483_] += anInt9224;
						}
					} else {
						for (int i_1493_ = 0; i_1493_ < is_1481_.length; i_1493_++) {
							int i_1494_ = is_1481_[i_1493_];
							anIntArray9191[i_1494_] -= anInt9247;
							anIntArray9184[i_1494_] -= anInt9212;
							anIntArray9161[i_1494_] -= anInt9224;
							if (i_1461_ != 0) {
								int i_1495_ = Class428.anIntArray4825[i_1461_];
								int i_1496_ = Class428.anIntArray4819[i_1461_];
								int i_1497_ = ((anIntArray9184[i_1494_] * i_1496_ - anIntArray9161[i_1494_] * i_1495_ + 16383) >> 14);
								anIntArray9161[i_1494_] = (anIntArray9184[i_1494_] * i_1495_ + anIntArray9161[i_1494_] * i_1496_ + 16383) >> 14;
								anIntArray9184[i_1494_] = i_1497_;
							}
							if (i_1463_ != 0) {
								int i_1498_ = Class428.anIntArray4825[i_1463_];
								int i_1499_ = Class428.anIntArray4819[i_1463_];
								int i_1500_ = ((anIntArray9184[i_1494_] * i_1498_ + anIntArray9191[i_1494_] * i_1499_ + 16383) >> 14);
								anIntArray9184[i_1494_] = (anIntArray9184[i_1494_] * i_1499_ - anIntArray9191[i_1494_] * i_1498_ + 16383) >> 14;
								anIntArray9191[i_1494_] = i_1500_;
							}
							if (i_1462_ != 0) {
								int i_1501_ = Class428.anIntArray4825[i_1462_];
								int i_1502_ = Class428.anIntArray4819[i_1462_];
								int i_1503_ = ((anIntArray9161[i_1494_] * i_1501_ + anIntArray9191[i_1494_] * i_1502_ + 16383) >> 14);
								anIntArray9161[i_1494_] = (anIntArray9161[i_1494_] * i_1502_ - anIntArray9191[i_1494_] * i_1501_ + 16383) >> 14;
								anIntArray9191[i_1494_] = i_1503_;
							}
							anIntArray9191[i_1494_] += anInt9247;
							anIntArray9184[i_1494_] += anInt9212;
							anIntArray9161[i_1494_] += anInt9224;
						}
					}
				}
			}
		} else if (i == 3) {
			for (int i_1504_ = 0; i_1504_ < i_1465_; i_1504_++) {
				int i_1505_ = is[i_1504_];
				if (i_1505_ < anIntArrayArray9178.length) {
					int[] is_1506_ = anIntArrayArray9178[i_1505_];
					for (int i_1507_ = 0; i_1507_ < is_1506_.length; i_1507_++) {
						int i_1508_ = is_1506_[i_1507_];
						anIntArray9191[i_1508_] -= anInt9247;
						anIntArray9184[i_1508_] -= anInt9212;
						anIntArray9161[i_1508_] -= anInt9224;
						anIntArray9191[i_1508_] = anIntArray9191[i_1508_] * i_1461_ / 128;
						anIntArray9184[i_1508_] = anIntArray9184[i_1508_] * i_1462_ / 128;
						anIntArray9161[i_1508_] = anIntArray9161[i_1508_] * i_1463_ / 128;
						anIntArray9191[i_1508_] += anInt9247;
						anIntArray9184[i_1508_] += anInt9212;
						anIntArray9161[i_1508_] += anInt9224;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9208 != null && aByteArray9202 != null) {
				for (int i_1509_ = 0; i_1509_ < i_1465_; i_1509_++) {
					int i_1510_ = is[i_1509_];
					if (i_1510_ < anIntArrayArray9208.length) {
						int[] is_1511_ = anIntArrayArray9208[i_1510_];
						for (int i_1512_ = 0; i_1512_ < is_1511_.length; i_1512_++) {
							int i_1513_ = is_1511_[i_1512_];
							int i_1514_ = ((aByteArray9202[i_1513_] & 0xff) + i_1461_ * 8);
							if (i_1514_ < 0)
								i_1514_ = 0;
							else if (i_1514_ > 255)
								i_1514_ = 255;
							aByteArray9202[i_1513_] = (byte) i_1514_;
						}
					}
				}
				if (aClass116Array9218 != null) {
					for (int i_1515_ = 0; i_1515_ < anInt9217; i_1515_++) {
						Class116 class116 = aClass116Array9218[i_1515_];
						Class108 class108 = aClass108Array9211[i_1515_];
						class108.anInt1351 = (class108.anInt1351 * 328110239 & 0xffffff | 255 - ((aByteArray9202[class116.anInt1421 * 1723945109]) & 0xff) << 24) * 120490847;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9208 != null) {
				for (int i_1516_ = 0; i_1516_ < i_1465_; i_1516_++) {
					int i_1517_ = is[i_1516_];
					if (i_1517_ < anIntArrayArray9208.length) {
						int[] is_1518_ = anIntArrayArray9208[i_1517_];
						for (int i_1519_ = 0; i_1519_ < is_1518_.length; i_1519_++) {
							int i_1520_ = is_1518_[i_1519_];
							int i_1521_ = aShortArray9193[i_1520_] & 0xffff;
							int i_1522_ = i_1521_ >> 10 & 0x3f;
							int i_1523_ = i_1521_ >> 7 & 0x7;
							int i_1524_ = i_1521_ & 0x7f;
							i_1522_ = i_1522_ + i_1461_ & 0x3f;
							i_1523_ += i_1462_;
							if (i_1523_ < 0)
								i_1523_ = 0;
							else if (i_1523_ > 7)
								i_1523_ = 7;
							i_1524_ += i_1463_;
							if (i_1524_ < 0)
								i_1524_ = 0;
							else if (i_1524_ > 127)
								i_1524_ = 127;
							aShortArray9193[i_1520_] = (short) (i_1522_ << 10 | i_1523_ << 7 | i_1524_);
						}
						aBool9209 = true;
					}
				}
				if (aClass116Array9218 != null) {
					for (int i_1525_ = 0; i_1525_ < anInt9217; i_1525_++) {
						Class116 class116 = aClass116Array9218[i_1525_];
						Class108 class108 = aClass108Array9211[i_1525_];
						class108.anInt1351 = (class108.anInt1351 * 328110239 & ~0xffffff | ((Class656.anIntArray8393[Class453.method7333(((aShortArray9193[(class116.anInt1421 * 1723945109)]) & 0xffff), (byte) 10) & 0xffff]) & 0xffffff)) * 120490847;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9220 != null) {
				for (int i_1526_ = 0; i_1526_ < i_1465_; i_1526_++) {
					int i_1527_ = is[i_1526_];
					if (i_1527_ < anIntArrayArray9220.length) {
						int[] is_1528_ = anIntArrayArray9220[i_1527_];
						for (int i_1529_ = 0; i_1529_ < is_1528_.length; i_1529_++) {
							Class108 class108 = aClass108Array9211[is_1528_[i_1529_]];
							class108.anInt1346 += i_1461_ * -653278629;
							class108.anInt1350 += i_1462_ * -1290559937;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9220 != null) {
				for (int i_1530_ = 0; i_1530_ < i_1465_; i_1530_++) {
					int i_1531_ = is[i_1530_];
					if (i_1531_ < anIntArrayArray9220.length) {
						int[] is_1532_ = anIntArrayArray9220[i_1531_];
						for (int i_1533_ = 0; i_1533_ < is_1532_.length; i_1533_++) {
							Class108 class108 = aClass108Array9211[is_1532_[i_1533_]];
							class108.aFloat1347 = (class108.aFloat1347 * (float) i_1461_ / 128.0F);
							class108.aFloat1353 = (class108.aFloat1353 * (float) i_1462_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9220 != null) {
				for (int i_1534_ = 0; i_1534_ < i_1465_; i_1534_++) {
					int i_1535_ = is[i_1534_];
					if (i_1535_ < anIntArrayArray9220.length) {
						int[] is_1536_ = anIntArrayArray9220[i_1535_];
						for (int i_1537_ = 0; i_1537_ < is_1536_.length; i_1537_++) {
							Class108 class108 = aClass108Array9211[is_1536_[i_1537_]];
							class108.anInt1349 = (class108.anInt1349 * 1169382623 + i_1461_ & 0x3fff) * -1991287009;
						}
					}
				}
			}
		}
	}

	void method2955(int i, int[] is, int i_1538_, int i_1539_, int i_1540_, boolean bool, int i_1541_, int[] is_1542_) {
		int i_1543_ = is.length;
		if (i == 0) {
			i_1538_ <<= 4;
			i_1539_ <<= 4;
			i_1540_ <<= 4;
			if (!aBool9210) {
				for (int i_1544_ = 0; i_1544_ < anInt9177; i_1544_++) {
					anIntArray9191[i_1544_] <<= 4;
					anIntArray9184[i_1544_] <<= 4;
					anIntArray9161[i_1544_] <<= 4;
				}
				aBool9210 = true;
			}
			int i_1545_ = 0;
			anInt9247 = 0;
			anInt9212 = 0;
			anInt9224 = 0;
			for (int i_1546_ = 0; i_1546_ < i_1543_; i_1546_++) {
				int i_1547_ = is[i_1546_];
				if (i_1547_ < anIntArrayArray9178.length) {
					int[] is_1548_ = anIntArrayArray9178[i_1547_];
					for (int i_1549_ = 0; i_1549_ < is_1548_.length; i_1549_++) {
						int i_1550_ = is_1548_[i_1549_];
						if (aShortArray9227 == null || (i_1541_ & aShortArray9227[i_1550_]) != 0) {
							anInt9247 += anIntArray9191[i_1550_];
							anInt9212 += anIntArray9184[i_1550_];
							anInt9224 += anIntArray9161[i_1550_];
							i_1545_++;
						}
					}
				}
			}
			if (i_1545_ > 0) {
				anInt9247 = anInt9247 / i_1545_ + i_1538_;
				anInt9212 = anInt9212 / i_1545_ + i_1539_;
				anInt9224 = anInt9224 / i_1545_ + i_1540_;
				aBool9214 = true;
			} else {
				anInt9247 = i_1538_;
				anInt9212 = i_1539_;
				anInt9224 = i_1540_;
			}
		} else if (i == 1) {
			if (is_1542_ != null) {
				int i_1551_ = ((is_1542_[0] * i_1538_ + is_1542_[1] * i_1539_ + is_1542_[2] * i_1540_ + 8192) >> 14);
				int i_1552_ = ((is_1542_[3] * i_1538_ + is_1542_[4] * i_1539_ + is_1542_[5] * i_1540_ + 8192) >> 14);
				int i_1553_ = ((is_1542_[6] * i_1538_ + is_1542_[7] * i_1539_ + is_1542_[8] * i_1540_ + 8192) >> 14);
				i_1538_ = i_1551_;
				i_1539_ = i_1552_;
				i_1540_ = i_1553_;
			}
			i_1538_ <<= 4;
			i_1539_ <<= 4;
			i_1540_ <<= 4;
			if (!aBool9210) {
				for (int i_1554_ = 0; i_1554_ < anInt9177; i_1554_++) {
					anIntArray9191[i_1554_] <<= 4;
					anIntArray9184[i_1554_] <<= 4;
					anIntArray9161[i_1554_] <<= 4;
				}
				aBool9210 = true;
			}
			for (int i_1555_ = 0; i_1555_ < i_1543_; i_1555_++) {
				int i_1556_ = is[i_1555_];
				if (i_1556_ < anIntArrayArray9178.length) {
					int[] is_1557_ = anIntArrayArray9178[i_1556_];
					for (int i_1558_ = 0; i_1558_ < is_1557_.length; i_1558_++) {
						int i_1559_ = is_1557_[i_1558_];
						if (aShortArray9227 == null || (i_1541_ & aShortArray9227[i_1559_]) != 0) {
							anIntArray9191[i_1559_] += i_1538_;
							anIntArray9184[i_1559_] += i_1539_;
							anIntArray9161[i_1559_] += i_1540_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1542_ != null) {
				if (!aBool9210) {
					for (int i_1560_ = 0; i_1560_ < anInt9177; i_1560_++) {
						anIntArray9191[i_1560_] <<= 4;
						anIntArray9184[i_1560_] <<= 4;
						anIntArray9161[i_1560_] <<= 4;
					}
					aBool9210 = true;
				}
				int i_1561_ = is_1542_[9] << 4;
				int i_1562_ = is_1542_[10] << 4;
				int i_1563_ = is_1542_[11] << 4;
				int i_1564_ = is_1542_[12] << 4;
				int i_1565_ = is_1542_[13] << 4;
				int i_1566_ = is_1542_[14] << 4;
				if (aBool9214) {
					int i_1567_ = ((is_1542_[0] * anInt9247 + is_1542_[3] * anInt9212 + is_1542_[6] * anInt9224 + 8192) >> 14);
					int i_1568_ = ((is_1542_[1] * anInt9247 + is_1542_[4] * anInt9212 + is_1542_[7] * anInt9224 + 8192) >> 14);
					int i_1569_ = ((is_1542_[2] * anInt9247 + is_1542_[5] * anInt9212 + is_1542_[8] * anInt9224 + 8192) >> 14);
					i_1567_ += i_1564_;
					i_1568_ += i_1565_;
					i_1569_ += i_1566_;
					anInt9247 = i_1567_;
					anInt9212 = i_1568_;
					anInt9224 = i_1569_;
					aBool9214 = false;
				}
				int[] is_1570_ = new int[9];
				int i_1571_ = Class428.anIntArray4819[i_1538_];
				int i_1572_ = Class428.anIntArray4825[i_1538_];
				int i_1573_ = Class428.anIntArray4819[i_1539_];
				int i_1574_ = Class428.anIntArray4825[i_1539_];
				int i_1575_ = Class428.anIntArray4819[i_1540_];
				int i_1576_ = Class428.anIntArray4825[i_1540_];
				int i_1577_ = i_1572_ * i_1575_ + 8192 >> 14;
				int i_1578_ = i_1572_ * i_1576_ + 8192 >> 14;
				is_1570_[0] = i_1573_ * i_1575_ + i_1574_ * i_1578_ + 8192 >> 14;
				is_1570_[1] = -i_1573_ * i_1576_ + i_1574_ * i_1577_ + 8192 >> 14;
				is_1570_[2] = i_1574_ * i_1571_ + 8192 >> 14;
				is_1570_[3] = i_1571_ * i_1576_ + 8192 >> 14;
				is_1570_[4] = i_1571_ * i_1575_ + 8192 >> 14;
				is_1570_[5] = -i_1572_;
				is_1570_[6] = -i_1574_ * i_1575_ + i_1573_ * i_1578_ + 8192 >> 14;
				is_1570_[7] = i_1574_ * i_1576_ + i_1573_ * i_1577_ + 8192 >> 14;
				is_1570_[8] = i_1573_ * i_1571_ + 8192 >> 14;
				int i_1579_ = ((is_1570_[0] * -anInt9247 + is_1570_[1] * -anInt9212 + is_1570_[2] * -anInt9224 + 8192) >> 14);
				int i_1580_ = ((is_1570_[3] * -anInt9247 + is_1570_[4] * -anInt9212 + is_1570_[5] * -anInt9224 + 8192) >> 14);
				int i_1581_ = ((is_1570_[6] * -anInt9247 + is_1570_[7] * -anInt9212 + is_1570_[8] * -anInt9224 + 8192) >> 14);
				int i_1582_ = i_1579_ + anInt9247;
				int i_1583_ = i_1580_ + anInt9212;
				int i_1584_ = i_1581_ + anInt9224;
				int[] is_1585_ = new int[9];
				for (int i_1586_ = 0; i_1586_ < 3; i_1586_++) {
					for (int i_1587_ = 0; i_1587_ < 3; i_1587_++) {
						int i_1588_ = 0;
						for (int i_1589_ = 0; i_1589_ < 3; i_1589_++)
							i_1588_ += (is_1570_[i_1586_ * 3 + i_1589_] * is_1542_[i_1587_ * 3 + i_1589_]);
						is_1585_[i_1586_ * 3 + i_1587_] = i_1588_ + 8192 >> 14;
					}
				}
				int i_1590_ = ((is_1570_[0] * i_1564_ + is_1570_[1] * i_1565_ + is_1570_[2] * i_1566_ + 8192) >> 14);
				int i_1591_ = ((is_1570_[3] * i_1564_ + is_1570_[4] * i_1565_ + is_1570_[5] * i_1566_ + 8192) >> 14);
				int i_1592_ = ((is_1570_[6] * i_1564_ + is_1570_[7] * i_1565_ + is_1570_[8] * i_1566_ + 8192) >> 14);
				i_1590_ += i_1582_;
				i_1591_ += i_1583_;
				i_1592_ += i_1584_;
				int[] is_1593_ = new int[9];
				for (int i_1594_ = 0; i_1594_ < 3; i_1594_++) {
					for (int i_1595_ = 0; i_1595_ < 3; i_1595_++) {
						int i_1596_ = 0;
						for (int i_1597_ = 0; i_1597_ < 3; i_1597_++)
							i_1596_ += (is_1542_[i_1594_ * 3 + i_1597_] * is_1585_[i_1595_ + i_1597_ * 3]);
						is_1593_[i_1594_ * 3 + i_1595_] = i_1596_ + 8192 >> 14;
					}
				}
				int i_1598_ = ((is_1542_[0] * i_1590_ + is_1542_[1] * i_1591_ + is_1542_[2] * i_1592_ + 8192) >> 14);
				int i_1599_ = ((is_1542_[3] * i_1590_ + is_1542_[4] * i_1591_ + is_1542_[5] * i_1592_ + 8192) >> 14);
				int i_1600_ = ((is_1542_[6] * i_1590_ + is_1542_[7] * i_1591_ + is_1542_[8] * i_1592_ + 8192) >> 14);
				i_1598_ += i_1561_;
				i_1599_ += i_1562_;
				i_1600_ += i_1563_;
				for (int i_1601_ = 0; i_1601_ < i_1543_; i_1601_++) {
					int i_1602_ = is[i_1601_];
					if (i_1602_ < anIntArrayArray9178.length) {
						int[] is_1603_ = anIntArrayArray9178[i_1602_];
						for (int i_1604_ = 0; i_1604_ < is_1603_.length; i_1604_++) {
							int i_1605_ = is_1603_[i_1604_];
							if (aShortArray9227 == null || (i_1541_ & aShortArray9227[i_1605_]) != 0) {
								int i_1606_ = ((is_1593_[0] * anIntArray9191[i_1605_] + is_1593_[1] * anIntArray9184[i_1605_] + is_1593_[2] * anIntArray9161[i_1605_] + 8192) >> 14);
								int i_1607_ = ((is_1593_[3] * anIntArray9191[i_1605_] + is_1593_[4] * anIntArray9184[i_1605_] + is_1593_[5] * anIntArray9161[i_1605_] + 8192) >> 14);
								int i_1608_ = ((is_1593_[6] * anIntArray9191[i_1605_] + is_1593_[7] * anIntArray9184[i_1605_] + is_1593_[8] * anIntArray9161[i_1605_] + 8192) >> 14);
								i_1606_ += i_1598_;
								i_1607_ += i_1599_;
								i_1608_ += i_1600_;
								anIntArray9191[i_1605_] = i_1606_;
								anIntArray9184[i_1605_] = i_1607_;
								anIntArray9161[i_1605_] = i_1608_;
							}
						}
					}
				}
			} else {
				for (int i_1609_ = 0; i_1609_ < i_1543_; i_1609_++) {
					int i_1610_ = is[i_1609_];
					if (i_1610_ < anIntArrayArray9178.length) {
						int[] is_1611_ = anIntArrayArray9178[i_1610_];
						for (int i_1612_ = 0; i_1612_ < is_1611_.length; i_1612_++) {
							int i_1613_ = is_1611_[i_1612_];
							if (aShortArray9227 == null || (i_1541_ & aShortArray9227[i_1613_]) != 0) {
								anIntArray9191[i_1613_] -= anInt9247;
								anIntArray9184[i_1613_] -= anInt9212;
								anIntArray9161[i_1613_] -= anInt9224;
								if (i_1540_ != 0) {
									int i_1614_ = Class428.anIntArray4825[i_1540_];
									int i_1615_ = Class428.anIntArray4819[i_1540_];
									int i_1616_ = ((anIntArray9184[i_1613_] * i_1614_ + anIntArray9191[i_1613_] * i_1615_ + 16383) >> 14);
									anIntArray9184[i_1613_] = (anIntArray9184[i_1613_] * i_1615_ - anIntArray9191[i_1613_] * i_1614_ + 16383) >> 14;
									anIntArray9191[i_1613_] = i_1616_;
								}
								if (i_1538_ != 0) {
									int i_1617_ = Class428.anIntArray4825[i_1538_];
									int i_1618_ = Class428.anIntArray4819[i_1538_];
									int i_1619_ = ((anIntArray9184[i_1613_] * i_1618_ - anIntArray9161[i_1613_] * i_1617_ + 16383) >> 14);
									anIntArray9161[i_1613_] = (anIntArray9184[i_1613_] * i_1617_ + anIntArray9161[i_1613_] * i_1618_ + 16383) >> 14;
									anIntArray9184[i_1613_] = i_1619_;
								}
								if (i_1539_ != 0) {
									int i_1620_ = Class428.anIntArray4825[i_1539_];
									int i_1621_ = Class428.anIntArray4819[i_1539_];
									int i_1622_ = ((anIntArray9161[i_1613_] * i_1620_ + anIntArray9191[i_1613_] * i_1621_ + 16383) >> 14);
									anIntArray9161[i_1613_] = (anIntArray9161[i_1613_] * i_1621_ - anIntArray9191[i_1613_] * i_1620_ + 16383) >> 14;
									anIntArray9191[i_1613_] = i_1622_;
								}
								anIntArray9191[i_1613_] += anInt9247;
								anIntArray9184[i_1613_] += anInt9212;
								anIntArray9161[i_1613_] += anInt9224;
							}
						}
					}
				}
			}
		} else if (i == 3) {
			if (is_1542_ != null) {
				if (!aBool9210) {
					for (int i_1623_ = 0; i_1623_ < anInt9177; i_1623_++) {
						anIntArray9191[i_1623_] <<= 4;
						anIntArray9184[i_1623_] <<= 4;
						anIntArray9161[i_1623_] <<= 4;
					}
					aBool9210 = true;
				}
				int i_1624_ = is_1542_[9] << 4;
				int i_1625_ = is_1542_[10] << 4;
				int i_1626_ = is_1542_[11] << 4;
				int i_1627_ = is_1542_[12] << 4;
				int i_1628_ = is_1542_[13] << 4;
				int i_1629_ = is_1542_[14] << 4;
				if (aBool9214) {
					int i_1630_ = ((is_1542_[0] * anInt9247 + is_1542_[3] * anInt9212 + is_1542_[6] * anInt9224 + 8192) >> 14);
					int i_1631_ = ((is_1542_[1] * anInt9247 + is_1542_[4] * anInt9212 + is_1542_[7] * anInt9224 + 8192) >> 14);
					int i_1632_ = ((is_1542_[2] * anInt9247 + is_1542_[5] * anInt9212 + is_1542_[8] * anInt9224 + 8192) >> 14);
					i_1630_ += i_1627_;
					i_1631_ += i_1628_;
					i_1632_ += i_1629_;
					anInt9247 = i_1630_;
					anInt9212 = i_1631_;
					anInt9224 = i_1632_;
					aBool9214 = false;
				}
				int i_1633_ = i_1538_ << 15 >> 7;
				int i_1634_ = i_1539_ << 15 >> 7;
				int i_1635_ = i_1540_ << 15 >> 7;
				int i_1636_ = i_1633_ * -anInt9247 + 8192 >> 14;
				int i_1637_ = i_1634_ * -anInt9212 + 8192 >> 14;
				int i_1638_ = i_1635_ * -anInt9224 + 8192 >> 14;
				int i_1639_ = i_1636_ + anInt9247;
				int i_1640_ = i_1637_ + anInt9212;
				int i_1641_ = i_1638_ + anInt9224;
				int[] is_1642_ = new int[9];
				is_1642_[0] = i_1633_ * is_1542_[0] + 8192 >> 14;
				is_1642_[1] = i_1633_ * is_1542_[3] + 8192 >> 14;
				is_1642_[2] = i_1633_ * is_1542_[6] + 8192 >> 14;
				is_1642_[3] = i_1634_ * is_1542_[1] + 8192 >> 14;
				is_1642_[4] = i_1634_ * is_1542_[4] + 8192 >> 14;
				is_1642_[5] = i_1634_ * is_1542_[7] + 8192 >> 14;
				is_1642_[6] = i_1635_ * is_1542_[2] + 8192 >> 14;
				is_1642_[7] = i_1635_ * is_1542_[5] + 8192 >> 14;
				is_1642_[8] = i_1635_ * is_1542_[8] + 8192 >> 14;
				int i_1643_ = i_1633_ * i_1627_ + 8192 >> 14;
				int i_1644_ = i_1634_ * i_1628_ + 8192 >> 14;
				int i_1645_ = i_1635_ * i_1629_ + 8192 >> 14;
				i_1643_ += i_1639_;
				i_1644_ += i_1640_;
				i_1645_ += i_1641_;
				int[] is_1646_ = new int[9];
				for (int i_1647_ = 0; i_1647_ < 3; i_1647_++) {
					for (int i_1648_ = 0; i_1648_ < 3; i_1648_++) {
						int i_1649_ = 0;
						for (int i_1650_ = 0; i_1650_ < 3; i_1650_++)
							i_1649_ += (is_1542_[i_1647_ * 3 + i_1650_] * is_1642_[i_1648_ + i_1650_ * 3]);
						is_1646_[i_1647_ * 3 + i_1648_] = i_1649_ + 8192 >> 14;
					}
				}
				int i_1651_ = ((is_1542_[0] * i_1643_ + is_1542_[1] * i_1644_ + is_1542_[2] * i_1645_ + 8192) >> 14);
				int i_1652_ = ((is_1542_[3] * i_1643_ + is_1542_[4] * i_1644_ + is_1542_[5] * i_1645_ + 8192) >> 14);
				int i_1653_ = ((is_1542_[6] * i_1643_ + is_1542_[7] * i_1644_ + is_1542_[8] * i_1645_ + 8192) >> 14);
				i_1651_ += i_1624_;
				i_1652_ += i_1625_;
				i_1653_ += i_1626_;
				for (int i_1654_ = 0; i_1654_ < i_1543_; i_1654_++) {
					int i_1655_ = is[i_1654_];
					if (i_1655_ < anIntArrayArray9178.length) {
						int[] is_1656_ = anIntArrayArray9178[i_1655_];
						for (int i_1657_ = 0; i_1657_ < is_1656_.length; i_1657_++) {
							int i_1658_ = is_1656_[i_1657_];
							if (aShortArray9227 == null || (i_1541_ & aShortArray9227[i_1658_]) != 0) {
								int i_1659_ = ((is_1646_[0] * anIntArray9191[i_1658_] + is_1646_[1] * anIntArray9184[i_1658_] + is_1646_[2] * anIntArray9161[i_1658_] + 8192) >> 14);
								int i_1660_ = ((is_1646_[3] * anIntArray9191[i_1658_] + is_1646_[4] * anIntArray9184[i_1658_] + is_1646_[5] * anIntArray9161[i_1658_] + 8192) >> 14);
								int i_1661_ = ((is_1646_[6] * anIntArray9191[i_1658_] + is_1646_[7] * anIntArray9184[i_1658_] + is_1646_[8] * anIntArray9161[i_1658_] + 8192) >> 14);
								i_1659_ += i_1651_;
								i_1660_ += i_1652_;
								i_1661_ += i_1653_;
								anIntArray9191[i_1658_] = i_1659_;
								anIntArray9184[i_1658_] = i_1660_;
								anIntArray9161[i_1658_] = i_1661_;
							}
						}
					}
				}
			} else {
				for (int i_1662_ = 0; i_1662_ < i_1543_; i_1662_++) {
					int i_1663_ = is[i_1662_];
					if (i_1663_ < anIntArrayArray9178.length) {
						int[] is_1664_ = anIntArrayArray9178[i_1663_];
						for (int i_1665_ = 0; i_1665_ < is_1664_.length; i_1665_++) {
							int i_1666_ = is_1664_[i_1665_];
							if (aShortArray9227 == null || (i_1541_ & aShortArray9227[i_1666_]) != 0) {
								anIntArray9191[i_1666_] -= anInt9247;
								anIntArray9184[i_1666_] -= anInt9212;
								anIntArray9161[i_1666_] -= anInt9224;
								anIntArray9191[i_1666_] = anIntArray9191[i_1666_] * i_1538_ / 128;
								anIntArray9184[i_1666_] = anIntArray9184[i_1666_] * i_1539_ / 128;
								anIntArray9161[i_1666_] = anIntArray9161[i_1666_] * i_1540_ / 128;
								anIntArray9191[i_1666_] += anInt9247;
								anIntArray9184[i_1666_] += anInt9212;
								anIntArray9161[i_1666_] += anInt9224;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9208 != null && aByteArray9202 != null) {
				for (int i_1667_ = 0; i_1667_ < i_1543_; i_1667_++) {
					int i_1668_ = is[i_1667_];
					if (i_1668_ < anIntArrayArray9208.length) {
						int[] is_1669_ = anIntArrayArray9208[i_1668_];
						for (int i_1670_ = 0; i_1670_ < is_1669_.length; i_1670_++) {
							int i_1671_ = is_1669_[i_1670_];
							if (aShortArray9205 == null || (i_1541_ & aShortArray9205[i_1671_]) != 0) {
								int i_1672_ = ((aByteArray9202[i_1671_] & 0xff) + i_1538_ * 8);
								if (i_1672_ < 0)
									i_1672_ = 0;
								else if (i_1672_ > 255)
									i_1672_ = 255;
								aByteArray9202[i_1671_] = (byte) i_1672_;
							}
						}
					}
				}
				if (aClass116Array9218 != null) {
					for (int i_1673_ = 0; i_1673_ < anInt9217; i_1673_++) {
						Class116 class116 = aClass116Array9218[i_1673_];
						Class108 class108 = aClass108Array9211[i_1673_];
						class108.anInt1351 = (class108.anInt1351 * 328110239 & 0xffffff | 255 - ((aByteArray9202[class116.anInt1421 * 1723945109]) & 0xff) << 24) * 120490847;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9208 != null) {
				for (int i_1674_ = 0; i_1674_ < i_1543_; i_1674_++) {
					int i_1675_ = is[i_1674_];
					if (i_1675_ < anIntArrayArray9208.length) {
						int[] is_1676_ = anIntArrayArray9208[i_1675_];
						for (int i_1677_ = 0; i_1677_ < is_1676_.length; i_1677_++) {
							int i_1678_ = is_1676_[i_1677_];
							if (aShortArray9205 == null || (i_1541_ & aShortArray9205[i_1678_]) != 0) {
								int i_1679_ = aShortArray9193[i_1678_] & 0xffff;
								int i_1680_ = i_1679_ >> 10 & 0x3f;
								int i_1681_ = i_1679_ >> 7 & 0x7;
								int i_1682_ = i_1679_ & 0x7f;
								i_1680_ = i_1680_ + i_1538_ & 0x3f;
								i_1681_ += i_1539_;
								if (i_1681_ < 0)
									i_1681_ = 0;
								else if (i_1681_ > 7)
									i_1681_ = 7;
								i_1682_ += i_1540_;
								if (i_1682_ < 0)
									i_1682_ = 0;
								else if (i_1682_ > 127)
									i_1682_ = 127;
								aShortArray9193[i_1678_] = (short) (i_1680_ << 10 | i_1681_ << 7 | i_1682_);
							}
						}
						aBool9209 = true;
					}
				}
				if (aClass116Array9218 != null) {
					for (int i_1683_ = 0; i_1683_ < anInt9217; i_1683_++) {
						Class116 class116 = aClass116Array9218[i_1683_];
						Class108 class108 = aClass108Array9211[i_1683_];
						class108.anInt1351 = (class108.anInt1351 * 328110239 & ~0xffffff | ((Class656.anIntArray8393[Class453.method7333(((aShortArray9193[(class116.anInt1421 * 1723945109)]) & 0xffff), (byte) 10) & 0xffff]) & 0xffffff)) * 120490847;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9220 != null) {
				for (int i_1684_ = 0; i_1684_ < i_1543_; i_1684_++) {
					int i_1685_ = is[i_1684_];
					if (i_1685_ < anIntArrayArray9220.length) {
						int[] is_1686_ = anIntArrayArray9220[i_1685_];
						for (int i_1687_ = 0; i_1687_ < is_1686_.length; i_1687_++) {
							Class108 class108 = aClass108Array9211[is_1686_[i_1687_]];
							class108.anInt1346 += i_1538_ * -653278629;
							class108.anInt1350 += i_1539_ * -1290559937;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9220 != null) {
				for (int i_1688_ = 0; i_1688_ < i_1543_; i_1688_++) {
					int i_1689_ = is[i_1688_];
					if (i_1689_ < anIntArrayArray9220.length) {
						int[] is_1690_ = anIntArrayArray9220[i_1689_];
						for (int i_1691_ = 0; i_1691_ < is_1690_.length; i_1691_++) {
							Class108 class108 = aClass108Array9211[is_1690_[i_1691_]];
							class108.aFloat1347 = (class108.aFloat1347 * (float) i_1538_ / 128.0F);
							class108.aFloat1353 = (class108.aFloat1353 * (float) i_1539_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9220 != null) {
				for (int i_1692_ = 0; i_1692_ < i_1543_; i_1692_++) {
					int i_1693_ = is[i_1692_];
					if (i_1693_ < anIntArrayArray9220.length) {
						int[] is_1694_ = anIntArrayArray9220[i_1693_];
						for (int i_1695_ = 0; i_1695_ < is_1694_.length; i_1695_++) {
							Class108 class108 = aClass108Array9211[is_1694_[i_1695_]];
							class108.anInt1349 = (class108.anInt1349 * 1169382623 + i_1538_ & 0x3fff) * -1991287009;
						}
					}
				}
			}
		}
	}

	public int method2894() {
		if (!aBool9221)
			method14659();
		return aShort9226;
	}

	public void method2957(Class432 class432, Class169 class169, int i) {
		method14648(class432, class169, i);
	}

	void method14692(Class432 class432, Class169 class169, int i) {
		if (anInt9231 >= 1) {
			Class101 class101 = aClass180_Sub1_9171.method14835(Thread.currentThread());
			Class427 class427 = class101.aClass427_1188;
			class427.method6784(class432);
			Class427 class427_1696_ = aClass180_Sub1_9171.aClass427_9398;
			Class427 class427_1697_ = aClass180_Sub1_9171.aClass427_9402;
			if (!aBool9221)
				method14659();
			boolean bool = class427.method6744();
			float[] fs = class101.aFloatArray1233;
			class427.method6773(0.0F, (float) aShort9223, 0.0F, fs);
			float f = fs[0];
			float f_1698_ = fs[1];
			float f_1699_ = fs[2];
			class427.method6773(0.0F, (float) aShort9237, 0.0F, fs);
			float f_1700_ = fs[0];
			float f_1701_ = fs[1];
			float f_1702_ = fs[2];
			for (int i_1703_ = 0; i_1703_ < 6; i_1703_++) {
				float[] fs_1704_ = aClass180_Sub1_9171.aFloatArrayArray9404[i_1703_];
				float f_1705_ = (fs_1704_[0] * f + fs_1704_[1] * f_1698_ + fs_1704_[2] * f_1699_ + fs_1704_[3] + (float) aShort9196);
				float f_1706_ = (fs_1704_[0] * f_1700_ + fs_1704_[1] * f_1701_ + fs_1704_[2] * f_1702_ + fs_1704_[3] + (float) aShort9196);
				if (f_1705_ < 0.0F && f_1706_ < 0.0F)
					return;
			}
			float f_1707_;
			float f_1708_;
			if (bool) {
				f_1707_ = class427_1696_.aFloatArray4807[14];
				f_1708_ = class427_1696_.aFloatArray4807[6];
			} else {
				f_1707_ = ((class427.aFloatArray4807[12] * class427_1696_.aFloatArray4807[2]) + (class427.aFloatArray4807[13] * class427_1696_.aFloatArray4807[6]) + (class427.aFloatArray4807[14] * class427_1696_.aFloatArray4807[10]) + class427_1696_.aFloatArray4807[14]);
				f_1708_ = ((class427.aFloatArray4807[4] * class427_1696_.aFloatArray4807[2]) + (class427.aFloatArray4807[5] * class427_1696_.aFloatArray4807[6]) + (class427.aFloatArray4807[6] * class427_1696_.aFloatArray4807[10]));
			}
			float f_1709_ = f_1707_ + (float) aShort9223 * f_1708_;
			float f_1710_ = f_1707_ + (float) aShort9237 * f_1708_;
			float f_1711_ = (f_1709_ > f_1710_ ? f_1709_ + (float) aShort9196 : f_1710_ + (float) aShort9196);
			float f_1712_ = (class427_1697_.aFloatArray4807[10] * f_1711_ + class427_1697_.aFloatArray4807[14]);
			if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
				synchronized (this) {
					while (aBool9204) {
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
					aBool9204 = true;
				}
			}
			method14631(class101);
			Class427 class427_1713_ = aClass101_9163.aClass427_1204;
			class427_1713_.method6750(class427);
			class427_1713_.method6751(aClass180_Sub1_9171.aClass427_9403);
			if ((i & 0x2) != 0)
				aClass119_9165.method2093(true);
			else
				aClass119_9165.method2093(false);
			boolean bool_1714_ = false;
			aClass101_9163.aFloat1199 = aClass119_9165.aFloat1451;
			aClass101_9163.aFloat1219 = aClass119_9165.aFloat1466;
			aClass101_9163.aFloat1221 = aClass119_9165.aFloat1453;
			aClass101_9163.aFloat1223 = 1.0F / aClass119_9165.aFloat1453;
			aClass101_9163.aFloat1218 = aClass119_9165.aFloat1448;
			aClass101_9163.aFloat1220 = aClass119_9165.aFloat1444;
			aClass101_9163.aFloat1222 = aClass119_9165.aFloat1452;
			aClass101_9163.anInt1224 = aClass119_9165.anInt1442 * -1630745973;
			for (int i_1715_ = 0; i_1715_ < anInt9177; i_1715_++) {
				int i_1716_ = anIntArray9191[i_1715_];
				int i_1717_ = anIntArray9184[i_1715_];
				int i_1718_ = anIntArray9161[i_1715_];
				float f_1719_ = (class427_1713_.aFloatArray4807[0] * (float) i_1716_ + class427_1713_.aFloatArray4807[4] * (float) i_1717_ + class427_1713_.aFloatArray4807[8] * (float) i_1718_ + class427_1713_.aFloatArray4807[12]);
				float f_1720_ = (class427_1713_.aFloatArray4807[1] * (float) i_1716_ + class427_1713_.aFloatArray4807[5] * (float) i_1717_ + class427_1713_.aFloatArray4807[9] * (float) i_1718_ + class427_1713_.aFloatArray4807[13]);
				float f_1721_ = (class427_1713_.aFloatArray4807[2] * (float) i_1716_ + class427_1713_.aFloatArray4807[6] * (float) i_1717_ + class427_1713_.aFloatArray4807[10] * (float) i_1718_ + class427_1713_.aFloatArray4807[14]);
				float f_1722_ = (class427_1713_.aFloatArray4807[3] * (float) i_1716_ + class427_1713_.aFloatArray4807[7] * (float) i_1717_ + class427_1713_.aFloatArray4807[11] * (float) i_1718_ + class427_1713_.aFloatArray4807[15]);
				aFloatArray9238[i_1715_] = (aClass101_9163.aFloat1222 + aClass101_9163.aFloat1221 * f_1721_ / f_1722_);
				aFloatArray9239[i_1715_] = f_1722_;
				if (f_1721_ >= -f_1722_) {
					aFloatArray9167[i_1715_] = (float) (int) (aClass101_9163.aFloat1218 + (aClass101_9163.aFloat1199 * f_1719_ / f_1722_));
					aFloatArray9198[i_1715_] = (float) (int) (aClass101_9163.aFloat1220 + (aClass101_9163.aFloat1219 * f_1720_ / f_1722_));
				} else {
					aFloatArray9167[i_1715_] = -5000.0F;
					bool_1714_ = true;
				}
				if (aClass101_9163.aBool1196)
					anIntArray9230[i_1715_] = (int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) i_1716_) + (class427.aFloatArray4807[5] * (float) i_1717_) + (class427.aFloatArray4807[9] * (float) i_1718_)));
			}
			if (aClass116Array9218 != null) {
				for (int i_1723_ = 0; i_1723_ < anInt9217; i_1723_++) {
					Class116 class116 = aClass116Array9218[i_1723_];
					Class108 class108 = aClass108Array9211[i_1723_];
					short i_1724_ = aShortArray9187[class116.anInt1421 * 1723945109];
					short i_1725_ = aShortArray9188[class116.anInt1421 * 1723945109];
					short i_1726_ = aShortArray9189[class116.anInt1421 * 1723945109];
					int i_1727_ = ((anIntArray9191[i_1724_] + anIntArray9191[i_1725_] + anIntArray9191[i_1726_]) / 3);
					int i_1728_ = ((anIntArray9184[i_1724_] + anIntArray9184[i_1725_] + anIntArray9184[i_1726_]) / 3);
					int i_1729_ = ((anIntArray9161[i_1724_] + anIntArray9161[i_1725_] + anIntArray9161[i_1726_]) / 3);
					float f_1730_ = (class427_1713_.aFloatArray4807[0] * (float) i_1727_ + (class427_1713_.aFloatArray4807[4] * (float) i_1728_) + (class427_1713_.aFloatArray4807[8] * (float) i_1729_) + class427_1713_.aFloatArray4807[12]);
					float f_1731_ = (class427_1713_.aFloatArray4807[1] * (float) i_1727_ + (class427_1713_.aFloatArray4807[5] * (float) i_1728_) + (class427_1713_.aFloatArray4807[9] * (float) i_1729_) + class427_1713_.aFloatArray4807[13]);
					float f_1732_ = (class427_1713_.aFloatArray4807[2] * (float) i_1727_ + (class427_1713_.aFloatArray4807[6] * (float) i_1728_) + (class427_1713_.aFloatArray4807[10] * (float) i_1729_) + class427_1713_.aFloatArray4807[14]);
					float f_1733_ = (class427_1713_.aFloatArray4807[3] * (float) i_1727_ + (class427_1713_.aFloatArray4807[7] * (float) i_1728_) + (class427_1713_.aFloatArray4807[11] * (float) i_1729_) + class427_1713_.aFloatArray4807[15]);
					f_1732_ += ((class427_1697_.aFloatArray4807[2] * (float) (class108.anInt1346 * -1337745965)) + (class427_1697_.aFloatArray4807[6] * (float) (class108.anInt1350 * 66408895)));
					f_1733_ += ((class427_1697_.aFloatArray4807[3] * (float) (class108.anInt1346 * -1337745965)) + (class427_1697_.aFloatArray4807[7] * (float) (class108.anInt1350 * 66408895)));
					if (f_1732_ > -f_1733_) {
						f_1730_ += ((class427_1697_.aFloatArray4807[0] * (float) (class108.anInt1346 * -1337745965)) + (class427_1697_.aFloatArray4807[4] * (float) (class108.anInt1350 * 66408895)));
						f_1731_ += ((class427_1697_.aFloatArray4807[1] * (float) (class108.anInt1346 * -1337745965)) + (class427_1697_.aFloatArray4807[5] * (float) (class108.anInt1350 * 66408895)));
						float f_1734_ = (aClass180_Sub1_9171.aFloat9410 + (aClass180_Sub1_9171.aFloat9419 * f_1730_ / f_1733_));
						float f_1735_ = (aClass180_Sub1_9171.aFloat9412 + (aClass180_Sub1_9171.aFloat9395 * f_1731_ / f_1733_));
						float f_1736_ = (class108.aFloat1347 * (float) class116.aShort1420);
						float f_1737_ = (class108.aFloat1353 * (float) class116.aShort1417);
						float f_1738_ = (f_1730_ + class427_1697_.aFloatArray4807[0] * f_1736_ + class427_1697_.aFloatArray4807[4] * f_1737_);
						float f_1739_ = (f_1731_ + class427_1697_.aFloatArray4807[1] * f_1736_ + class427_1697_.aFloatArray4807[5] * f_1737_);
						float f_1740_ = (f_1733_ + class427_1697_.aFloatArray4807[3] * f_1736_ + class427_1697_.aFloatArray4807[7] * f_1737_);
						float f_1741_ = (aClass180_Sub1_9171.aFloat9410 + (aClass180_Sub1_9171.aFloat9419 * f_1738_ / f_1740_));
						float f_1742_ = (aClass180_Sub1_9171.aFloat9412 + (aClass180_Sub1_9171.aFloat9395 * f_1739_ / f_1740_));
						class108.anInt1348 = (int) f_1734_ * -323246595;
						class108.anInt1352 = (int) f_1735_ * 334129577;
						class108.aFloat1356 = (aClass180_Sub1_9171.aFloat9414 + (aClass180_Sub1_9171.aFloat9405 * (f_1732_ - (class427_1697_.aFloatArray4807[10] * (float) (class116.anInt1422 * -451624537))) / f_1733_));
						class108.anInt1354 = (int) (f_1741_ < f_1734_ ? f_1734_ - f_1741_ : f_1741_ - f_1734_) * 1505072457;
						class108.anInt1355 = (int) (f_1742_ < f_1735_ ? f_1735_ - f_1742_ : f_1742_ - f_1735_) * 1609227583;
					} else {
						Class108 class108_1743_ = class108;
						class108.anInt1355 = 0;
						class108_1743_.anInt1354 = 0;
					}
				}
			}
			if (class169 != null) {
				boolean bool_1744_ = false;
				boolean bool_1745_ = true;
				int i_1746_ = aShort9226 + aShort9173 >> 1;
				int i_1747_ = aShort9228 + aShort9229 >> 1;
				int i_1748_ = i_1746_;
				short i_1749_ = aShort9223;
				int i_1750_ = i_1747_;
				float f_1751_ = (class427_1713_.aFloatArray4807[0] * (float) i_1748_ + class427_1713_.aFloatArray4807[4] * (float) i_1749_ + class427_1713_.aFloatArray4807[8] * (float) i_1750_ + class427_1713_.aFloatArray4807[12]);
				float f_1752_ = (class427_1713_.aFloatArray4807[1] * (float) i_1748_ + class427_1713_.aFloatArray4807[5] * (float) i_1749_ + class427_1713_.aFloatArray4807[9] * (float) i_1750_ + class427_1713_.aFloatArray4807[13]);
				float f_1753_ = (class427_1713_.aFloatArray4807[2] * (float) i_1748_ + class427_1713_.aFloatArray4807[6] * (float) i_1749_ + class427_1713_.aFloatArray4807[10] * (float) i_1750_ + class427_1713_.aFloatArray4807[14]);
				float f_1754_ = (class427_1713_.aFloatArray4807[3] * (float) i_1748_ + class427_1713_.aFloatArray4807[7] * (float) i_1749_ + class427_1713_.aFloatArray4807[11] * (float) i_1750_ + class427_1713_.aFloatArray4807[15]);
				if (f_1753_ >= -f_1754_) {
					class169.anInt1872 = (int) (aClass180_Sub1_9171.aFloat9410 + (aClass180_Sub1_9171.aFloat9419 * f_1751_ / f_1754_));
					class169.anInt1876 = (int) (aClass180_Sub1_9171.aFloat9412 + (aClass180_Sub1_9171.aFloat9395 * f_1752_ / f_1754_));
				} else
					bool_1744_ = true;
				i_1748_ = i_1746_;
				i_1749_ = aShort9237;
				i_1750_ = i_1747_;
				float f_1755_ = (class427_1713_.aFloatArray4807[0] * (float) i_1748_ + class427_1713_.aFloatArray4807[4] * (float) i_1749_ + class427_1713_.aFloatArray4807[8] * (float) i_1750_ + class427_1713_.aFloatArray4807[12]);
				float f_1756_ = (class427_1713_.aFloatArray4807[1] * (float) i_1748_ + class427_1713_.aFloatArray4807[5] * (float) i_1749_ + class427_1713_.aFloatArray4807[9] * (float) i_1750_ + class427_1713_.aFloatArray4807[13]);
				float f_1757_ = (class427_1713_.aFloatArray4807[2] * (float) i_1748_ + class427_1713_.aFloatArray4807[6] * (float) i_1749_ + class427_1713_.aFloatArray4807[10] * (float) i_1750_ + class427_1713_.aFloatArray4807[14]);
				float f_1758_ = (class427_1713_.aFloatArray4807[3] * (float) i_1748_ + class427_1713_.aFloatArray4807[7] * (float) i_1749_ + class427_1713_.aFloatArray4807[11] * (float) i_1750_ + class427_1713_.aFloatArray4807[15]);
				if (f_1757_ >= -f_1758_) {
					class169.anInt1873 = (int) (aClass180_Sub1_9171.aFloat9410 + (aClass180_Sub1_9171.aFloat9419 * f_1755_ / f_1758_));
					class169.anInt1875 = (int) (aClass180_Sub1_9171.aFloat9412 + (aClass180_Sub1_9171.aFloat9395 * f_1756_ / f_1758_));
				} else
					bool_1744_ = true;
				if (bool_1744_) {
					if (f_1753_ < -f_1754_ && f_1757_ < -f_1758_)
						bool_1745_ = false;
					else if (f_1753_ < -f_1754_) {
						float f_1759_ = (f_1753_ + f_1754_) / (f_1757_ + f_1758_) - 1.0F;
						float f_1760_ = f_1751_ + f_1759_ * (f_1755_ - f_1751_);
						float f_1761_ = f_1752_ + f_1759_ * (f_1756_ - f_1752_);
						float f_1762_ = f_1754_ + f_1759_ * (f_1758_ - f_1754_);
						class169.anInt1872 = (int) (aClass180_Sub1_9171.aFloat9410 + (aClass180_Sub1_9171.aFloat9419 * f_1760_ / f_1762_));
						class169.anInt1876 = (int) (aClass180_Sub1_9171.aFloat9412 + (aClass180_Sub1_9171.aFloat9395 * f_1761_ / f_1762_));
					} else if (f_1757_ < -f_1758_) {
						float f_1763_ = (f_1757_ + f_1758_) / (f_1753_ + f_1754_) - 1.0F;
						float f_1764_ = f_1755_ + f_1763_ * (f_1751_ - f_1755_);
						float f_1765_ = f_1756_ + f_1763_ * (f_1752_ - f_1756_);
						float f_1766_ = f_1758_ + f_1763_ * (f_1754_ - f_1758_);
						class169.anInt1873 = (int) (aClass180_Sub1_9171.aFloat9410 + (aClass180_Sub1_9171.aFloat9419 * f_1764_ / f_1766_));
						class169.anInt1875 = (int) (aClass180_Sub1_9171.aFloat9412 + (aClass180_Sub1_9171.aFloat9395 * f_1765_ / f_1766_));
					}
				}
				if (bool_1745_) {
					if (f_1753_ / f_1754_ > f_1757_ / f_1758_) {
						float f_1767_ = (f_1751_ + (class427_1697_.aFloatArray4807[0] * (float) aShort9196) + class427_1697_.aFloatArray4807[12]);
						float f_1768_ = (f_1754_ + (class427_1697_.aFloatArray4807[3] * (float) aShort9196) + class427_1697_.aFloatArray4807[15]);
						class169.anInt1877 = (int) (aClass180_Sub1_9171.aFloat9410 - (float) class169.anInt1872 + (aClass180_Sub1_9171.aFloat9419 * f_1767_ / f_1768_));
					} else {
						float f_1769_ = (f_1755_ + (class427_1697_.aFloatArray4807[0] * (float) aShort9196) + class427_1697_.aFloatArray4807[12]);
						float f_1770_ = (f_1758_ + (class427_1697_.aFloatArray4807[3] * (float) aShort9196) + class427_1697_.aFloatArray4807[15]);
						class169.anInt1877 = (int) (aClass180_Sub1_9171.aFloat9410 - (float) class169.anInt1873 + (aClass180_Sub1_9171.aFloat9419 * f_1769_ / f_1770_));
					}
					class169.aBool1874 = true;
				}
			}
			method14634(true);
			aClass119_9165.aBool1467 = (i & 0x1) == 0;
			aClass119_9165.aBool1443 = false;
			try {
				method14649(aClass180_Sub1_9171.anIntArray9386 != null, aClass180_Sub1_9171.aFloatArray9389 != null, (i & 0x4) != 0, bool_1714_, ((aClass101_9163.aBool1191 && f_1712_ > aClass101_9163.aFloat1192) || aClass101_9163.aBool1196));
			} catch (Exception exception) {
				/* empty */
			}
			if (aClass116Array9218 != null) {
				for (int i_1771_ = 0; i_1771_ < anInt9185; i_1771_++)
					anIntArray9245[i_1771_] = -1;
			}
			aClass119_9165 = null;
			if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
				synchronized (this) {
					aBool9204 = false;
					this.notifyAll();
				}
			}
		}
	}

	final boolean method14693(int i) {
		if (anIntArray9245 == null)
			return false;
		if (anIntArray9245[i] == -1)
			return false;
		return true;
	}

	final void method14694(boolean bool, boolean bool_1772_, boolean bool_1773_, boolean bool_1774_, boolean bool_1775_) {
		if (aClass116Array9218 != null) {
			for (int i = 0; i < anInt9217; i++) {
				Class116 class116 = aClass116Array9218[i];
				anIntArray9245[class116.anInt1421 * 1723945109] = i;
			}
		}
		if (aBool9232 || aClass116Array9218 != null) {
			if ((anInt9174 & 0x100) == 0 && aShortArray9181 != null) {
				for (int i = 0; i < anInt9186; i++) {
					short i_1776_ = aShortArray9181[i];
					method14651(bool, bool_1772_, bool_1773_, i_1776_, bool_1774_, bool_1775_);
				}
			} else {
				for (int i = 0; i < anInt9186; i++) {
					if (!method14690(i) && !method14693(i))
						method14651(bool, bool_1772_, bool_1773_, i, bool_1774_, bool_1775_);
				}
				if (aByteArray9201 == null) {
					for (int i = 0; i < anInt9186; i++) {
						if (method14690(i) || method14693(i))
							method14651(bool, bool_1772_, bool_1773_, i, bool_1774_, bool_1775_);
					}
				} else {
					for (int i = 0; i < 12; i++) {
						for (int i_1777_ = 0; i_1777_ < anInt9186; i_1777_++) {
							if (aByteArray9201[i_1777_] == i && (method14690(i_1777_) || method14693(i_1777_)))
								method14651(bool, bool_1772_, bool_1773_, i_1777_, bool_1774_, bool_1775_);
						}
					}
				}
			}
			if (aClass116Array9218 != null)
				method14650(bool, bool_1772_, bool_1773_);
		} else {
			for (int i = 0; i < anInt9186; i++)
				method14651(bool, bool_1772_, bool_1773_, i, bool_1774_, bool_1775_);
		}
	}

	public Class159[] method2916() {
		return aClass159Array9216;
	}

	final void method14695(boolean bool, boolean bool_1778_, boolean bool_1779_) {
		for (int i = 0; i < anInt9217; i++) {
			Class116 class116 = aClass116Array9218[i];
			if (class116.aBool1415) {
				Class108 class108 = aClass108Array9211[i];
				aClass180_Sub1_9171.method14840(bool, bool_1778_, bool_1779_, class108.anInt1348 * 239951701, class108.anInt1352 * 888949401, class108.aFloat1356, class108.anInt1354 * -483431175, class108.anInt1355 * -777416001, class116.aShort1418, class108.anInt1351 * 328110239, class116.aByte1419, class116.aByte1416);
			}
		}
	}

	final boolean method14696(int i) {
		if (aByteArray9202 == null)
			return false;
		if (aByteArray9202[i] == 0)
			return false;
		return true;
	}

	final boolean method14697(int i) {
		if (aByteArray9202 == null)
			return false;
		if (aByteArray9202[i] == 0)
			return false;
		return true;
	}

	final boolean method14698(int i) {
		if (anIntArray9245 == null)
			return false;
		if (anIntArray9245[i] == -1)
			return false;
		return true;
	}

	final boolean method14699(int i) {
		if (anIntArray9245 == null)
			return false;
		if (anIntArray9245[i] == -1)
			return false;
		return true;
	}

	void method2947() {
		if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
			synchronized (this) {
				while (aBool1951) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool1951 = true;
			}
		}
	}

	final void method14700(boolean bool, boolean bool_1780_, boolean bool_1781_, int i, boolean bool_1782_, boolean bool_1783_) {
		if (anIntArray9194[i] != -2) {
			short i_1784_ = aShortArray9187[i];
			short i_1785_ = aShortArray9188[i];
			short i_1786_ = aShortArray9189[i];
			float f = aFloatArray9167[i_1784_];
			float f_1787_ = aFloatArray9167[i_1785_];
			float f_1788_ = aFloatArray9167[i_1786_];
			if (!bool_1782_ || (f != -5000.0F && f_1787_ != -5000.0F && f_1788_ != -5000.0F)) {
				float f_1789_ = aFloatArray9198[i_1784_];
				float f_1790_ = aFloatArray9198[i_1785_];
				float f_1791_ = aFloatArray9198[i_1786_];
				if (anIntArray9245[i] != -1 || ((f - f_1787_) * (f_1791_ - f_1790_) - (f_1789_ - f_1790_) * (f_1788_ - f_1787_)) > 0.0F) {
					if (f < 0.0F || f_1787_ < 0.0F || f_1788_ < 0.0F || f > (float) (aClass101_9163.anInt1224 * 541969699) || f_1787_ > (float) (aClass101_9163.anInt1224 * 541969699) || f_1788_ > (float) (aClass101_9163.anInt1224 * 541969699))
						aClass119_9165.aBool1445 = true;
					else
						aClass119_9165.aBool1445 = false;
					if (bool_1783_) {
						int i_1792_ = anIntArray9245[i];
						if (i_1792_ == -1 || !aClass116Array9218[i_1792_].aBool1415)
							method14646(bool, bool_1780_, bool_1781_, i);
					} else {
						int i_1793_ = anIntArray9245[i];
						if (i_1793_ != -1) {
							Class116 class116 = aClass116Array9218[i_1793_];
							Class108 class108 = aClass108Array9211[i_1793_];
							if (!class116.aBool1415)
								method14652(bool, bool_1780_, bool_1781_, i);
							aClass180_Sub1_9171.method14840(bool, bool_1780_, bool_1781_, class108.anInt1348 * 239951701, class108.anInt1352 * 888949401, class108.aFloat1356, class108.anInt1354 * -483431175, class108.anInt1355 * -777416001, class116.aShort1418, class108.anInt1351 * 328110239, class116.aByte1419, class116.aByte1416);
						} else
							method14652(bool, bool_1780_, bool_1781_, i);
					}
				}
			}
		}
	}

	public void method2961(Class432 class432) {
		method14631(aClass180_Sub1_9171.method14835(Thread.currentThread()));
		Class427 class427 = aClass101_9163.aClass427_1188;
		class427.method6784(class432);
		if (aClass167Array9215 != null) {
			for (int i = 0; i < aClass167Array9215.length; i++) {
				Class167 class167 = aClass167Array9215[i];
				Class167 class167_1794_ = class167;
				if (class167.aClass167_1849 != null)
					class167_1794_ = class167.aClass167_1849;
				class167_1794_.anInt1855 = (int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) (anIntArray9191[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[4] * (float) anIntArray9184[(class167.anInt1851 * -18705907)]) + (class427.aFloatArray4807[8] * (float) (anIntArray9161[(class167.anInt1851 * -18705907)])))) * 1542395015;
				class167_1794_.anInt1856 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) (anIntArray9191[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[5] * (float) (anIntArray9184[(class167.anInt1851 * -18705907)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9161[(class167.anInt1851 * -18705907)])))) * -1886500927);
				class167_1794_.anInt1860 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) (anIntArray9191[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[6] * (float) (anIntArray9184[(class167.anInt1851 * -18705907)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9161[(class167.anInt1851 * -18705907)])))) * -1731268533);
				class167_1794_.anInt1858 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9191[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9184[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9161[(class167.anInt1852 * -1573542389)])))) * -2034723417);
				class167_1794_.anInt1859 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9191[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9184[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9161[(class167.anInt1852 * -1573542389)])))) * -481732551);
				class167_1794_.anInt1862 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) anIntArray9191[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[6] * (float) (anIntArray9184[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9161[(class167.anInt1852 * -1573542389)])))) * -980787877);
				class167_1794_.anInt1857 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9191[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9184[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9161[(class167.anInt1853 * -2116684303)])))) * -1482367683);
				class167_1794_.anInt1850 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9191[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9184[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9161[(class167.anInt1853 * -2116684303)])))) * 1240185219);
				class167_1794_.anInt1863 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) anIntArray9191[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[6] * (float) (anIntArray9184[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9161[(class167.anInt1853 * -2116684303)])))) * -857185851);
			}
		}
		if (aClass159Array9216 != null) {
			for (int i = 0; i < aClass159Array9216.length; i++) {
				Class159 class159 = aClass159Array9216[i];
				Class159 class159_1795_ = class159;
				if (class159.aClass159_1739 != null)
					class159_1795_ = class159.aClass159_1739;
				if (class159.aClass427_1738 != null)
					class159.aClass427_1738.method6750(class427);
				else
					class159.aClass427_1738 = new Class427(class427);
				class159_1795_.anInt1744 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9191[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9184[(class159.anInt1740 * -449756941)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9161[(class159.anInt1740 * -449756941)])))) * -306739393);
				class159_1795_.anInt1742 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9191[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9184[(class159.anInt1740 * -449756941)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9161[(class159.anInt1740 * -449756941)])))) * -1995176663);
				class159_1795_.anInt1743 = (int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) (anIntArray9191[class159.anInt1740 * -449756941])) + (class427.aFloatArray4807[6] * (float) anIntArray9184[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[10] * (float) (anIntArray9161[(class159.anInt1740 * -449756941)])))) * 76591605;
			}
		}
	}

	final void method14701(boolean bool, boolean bool_1796_, boolean bool_1797_, int i) {
		short i_1798_ = aShortArray9187[i];
		short i_1799_ = aShortArray9188[i];
		short i_1800_ = aShortArray9189[i];
		boolean bool_1801_ = false;
		if (aShortArray9162 != null && aShortArray9162[i] != -1)
			bool_1801_ = (aClass180_Sub1_9171.aClass181_2059.method3544(aShortArray9162[i] & 0xffff, (byte) -52).aBool1761);
		if (!bool_1801_) {
			if (aByteArray9202 == null)
				aClass119_9165.anInt1441 = 0;
			else
				aClass119_9165.anInt1441 = aByteArray9202[i] & 0xff;
			if (anIntArray9194[i] == -1)
				aClass119_9165.method2077(bool, bool_1796_, bool_1797_, aFloatArray9198[i_1798_], aFloatArray9198[i_1799_], aFloatArray9198[i_1800_], aFloatArray9167[i_1798_], aFloatArray9167[i_1799_], aFloatArray9167[i_1800_], aFloatArray9238[i_1798_], aFloatArray9238[i_1799_], aFloatArray9238[i_1800_], Class656.anIntArray8393[anIntArray9192[i] & 0xffff]);
			else
				aClass119_9165.method2073(bool, bool_1796_, bool_1797_, aFloatArray9198[i_1798_], aFloatArray9198[i_1799_], aFloatArray9198[i_1800_], aFloatArray9167[i_1798_], aFloatArray9167[i_1799_], aFloatArray9167[i_1800_], aFloatArray9238[i_1798_], aFloatArray9238[i_1799_], aFloatArray9238[i_1800_], (float) (anIntArray9192[i] & 0xffff), (float) (anIntArray9180[i] & 0xffff), (float) (anIntArray9194[i] & 0xffff));
		} else {
			int i_1802_ = -16777216;
			if (aByteArray9202 != null)
				i_1802_ = 255 - (aByteArray9202[i] & 0xff) << 24;
			if (anIntArray9194[i] == -1) {
				int i_1803_ = i_1802_ | anIntArray9192[i] & 0xffffff;
				aClass119_9165.method2079(bool, bool_1796_, bool_1797_, aFloatArray9198[i_1798_], aFloatArray9198[i_1799_], aFloatArray9198[i_1800_], aFloatArray9167[i_1798_], aFloatArray9167[i_1799_], aFloatArray9167[i_1800_], aFloatArray9238[i_1798_], aFloatArray9238[i_1799_], aFloatArray9238[i_1800_], aFloatArray9239[i_1798_], aFloatArray9239[i_1799_], aFloatArray9239[i_1800_], aFloatArrayArray9190[i][0], aFloatArrayArray9190[i][1], aFloatArrayArray9190[i][2], aFloatArrayArray9235[i][0],
						aFloatArrayArray9235[i][1], aFloatArrayArray9235[i][2], i_1803_, i_1803_, i_1803_, aClass101_9163.anInt1194 * -1009384223, 0.0F, 0.0F, 0.0F, aShortArray9162[i] & 0xffff);
			} else
				aClass119_9165.method2079(bool, bool_1796_, bool_1797_, aFloatArray9198[i_1798_], aFloatArray9198[i_1799_], aFloatArray9198[i_1800_], aFloatArray9167[i_1798_], aFloatArray9167[i_1799_], aFloatArray9167[i_1800_], aFloatArray9238[i_1798_], aFloatArray9238[i_1799_], aFloatArray9238[i_1800_], aFloatArray9239[i_1798_], aFloatArray9239[i_1799_], aFloatArray9239[i_1800_], aFloatArrayArray9190[i][0], aFloatArrayArray9190[i][1], aFloatArrayArray9190[i][2], aFloatArrayArray9235[i][0],
						aFloatArrayArray9235[i][1], aFloatArrayArray9235[i][2], i_1802_ | anIntArray9192[i] & 0xffffff, i_1802_ | anIntArray9180[i] & 0xffffff, i_1802_ | anIntArray9194[i] & 0xffffff, aClass101_9163.anInt1194 * -1009384223, 0.0F, 0.0F, 0.0F, aShortArray9162[i] & 0xffff);
		}
	}

	final void method14702(boolean bool, boolean bool_1804_, boolean bool_1805_, int i) {
		short i_1806_ = aShortArray9187[i];
		short i_1807_ = aShortArray9188[i];
		short i_1808_ = aShortArray9189[i];
		boolean bool_1809_ = false;
		if (aShortArray9162 != null && aShortArray9162[i] != -1)
			bool_1809_ = (aClass180_Sub1_9171.aClass181_2059.method3544(aShortArray9162[i] & 0xffff, (byte) -71).aBool1761);
		if (!bool_1809_) {
			if (aByteArray9202 == null)
				aClass119_9165.anInt1441 = 0;
			else
				aClass119_9165.anInt1441 = aByteArray9202[i] & 0xff;
			if (anIntArray9194[i] == -1)
				aClass119_9165.method2077(bool, bool_1804_, bool_1805_, aFloatArray9198[i_1806_], aFloatArray9198[i_1807_], aFloatArray9198[i_1808_], aFloatArray9167[i_1806_], aFloatArray9167[i_1807_], aFloatArray9167[i_1808_], aFloatArray9238[i_1806_], aFloatArray9238[i_1807_], aFloatArray9238[i_1808_], Class656.anIntArray8393[anIntArray9192[i] & 0xffff]);
			else
				aClass119_9165.method2073(bool, bool_1804_, bool_1805_, aFloatArray9198[i_1806_], aFloatArray9198[i_1807_], aFloatArray9198[i_1808_], aFloatArray9167[i_1806_], aFloatArray9167[i_1807_], aFloatArray9167[i_1808_], aFloatArray9238[i_1806_], aFloatArray9238[i_1807_], aFloatArray9238[i_1808_], (float) (anIntArray9192[i] & 0xffff), (float) (anIntArray9180[i] & 0xffff), (float) (anIntArray9194[i] & 0xffff));
		} else {
			int i_1810_ = -16777216;
			if (aByteArray9202 != null)
				i_1810_ = 255 - (aByteArray9202[i] & 0xff) << 24;
			if (anIntArray9194[i] == -1) {
				int i_1811_ = i_1810_ | anIntArray9192[i] & 0xffffff;
				aClass119_9165.method2079(bool, bool_1804_, bool_1805_, aFloatArray9198[i_1806_], aFloatArray9198[i_1807_], aFloatArray9198[i_1808_], aFloatArray9167[i_1806_], aFloatArray9167[i_1807_], aFloatArray9167[i_1808_], aFloatArray9238[i_1806_], aFloatArray9238[i_1807_], aFloatArray9238[i_1808_], aFloatArray9239[i_1806_], aFloatArray9239[i_1807_], aFloatArray9239[i_1808_], aFloatArrayArray9190[i][0], aFloatArrayArray9190[i][1], aFloatArrayArray9190[i][2], aFloatArrayArray9235[i][0],
						aFloatArrayArray9235[i][1], aFloatArrayArray9235[i][2], i_1811_, i_1811_, i_1811_, aClass101_9163.anInt1194 * -1009384223, 0.0F, 0.0F, 0.0F, aShortArray9162[i] & 0xffff);
			} else
				aClass119_9165.method2079(bool, bool_1804_, bool_1805_, aFloatArray9198[i_1806_], aFloatArray9198[i_1807_], aFloatArray9198[i_1808_], aFloatArray9167[i_1806_], aFloatArray9167[i_1807_], aFloatArray9167[i_1808_], aFloatArray9238[i_1806_], aFloatArray9238[i_1807_], aFloatArray9238[i_1808_], aFloatArray9239[i_1806_], aFloatArray9239[i_1807_], aFloatArray9239[i_1808_], aFloatArrayArray9190[i][0], aFloatArrayArray9190[i][1], aFloatArrayArray9190[i][2], aFloatArrayArray9235[i][0],
						aFloatArrayArray9235[i][1], aFloatArrayArray9235[i][2], i_1810_ | anIntArray9192[i] & 0xffffff, i_1810_ | anIntArray9180[i] & 0xffffff, i_1810_ | anIntArray9194[i] & 0xffffff, aClass101_9163.anInt1194 * -1009384223, 0.0F, 0.0F, 0.0F, aShortArray9162[i] & 0xffff);
		}
	}

	final void method14703(boolean bool, boolean bool_1812_, boolean bool_1813_, int i) {
		short i_1814_ = aShortArray9187[i];
		short i_1815_ = aShortArray9188[i];
		short i_1816_ = aShortArray9189[i];
		boolean bool_1817_ = false;
		if (aShortArray9162 != null && aShortArray9162[i] != -1)
			bool_1817_ = (aClass180_Sub1_9171.aClass181_2059.method3544(aShortArray9162[i] & 0xffff, (byte) -34).aBool1761);
		if (!bool_1817_) {
			if (aByteArray9202 == null)
				aClass119_9165.anInt1441 = 0;
			else
				aClass119_9165.anInt1441 = aByteArray9202[i] & 0xff;
			if (anIntArray9194[i] == -1)
				aClass119_9165.method2077(bool, bool_1812_, bool_1813_, aFloatArray9198[i_1814_], aFloatArray9198[i_1815_], aFloatArray9198[i_1816_], aFloatArray9167[i_1814_], aFloatArray9167[i_1815_], aFloatArray9167[i_1816_], aFloatArray9238[i_1814_], aFloatArray9238[i_1815_], aFloatArray9238[i_1816_], Class656.anIntArray8393[anIntArray9192[i] & 0xffff]);
			else
				aClass119_9165.method2073(bool, bool_1812_, bool_1813_, aFloatArray9198[i_1814_], aFloatArray9198[i_1815_], aFloatArray9198[i_1816_], aFloatArray9167[i_1814_], aFloatArray9167[i_1815_], aFloatArray9167[i_1816_], aFloatArray9238[i_1814_], aFloatArray9238[i_1815_], aFloatArray9238[i_1816_], (float) (anIntArray9192[i] & 0xffff), (float) (anIntArray9180[i] & 0xffff), (float) (anIntArray9194[i] & 0xffff));
		} else {
			int i_1818_ = -16777216;
			if (aByteArray9202 != null)
				i_1818_ = 255 - (aByteArray9202[i] & 0xff) << 24;
			if (anIntArray9194[i] == -1) {
				int i_1819_ = i_1818_ | anIntArray9192[i] & 0xffffff;
				aClass119_9165.method2079(bool, bool_1812_, bool_1813_, aFloatArray9198[i_1814_], aFloatArray9198[i_1815_], aFloatArray9198[i_1816_], aFloatArray9167[i_1814_], aFloatArray9167[i_1815_], aFloatArray9167[i_1816_], aFloatArray9238[i_1814_], aFloatArray9238[i_1815_], aFloatArray9238[i_1816_], aFloatArray9239[i_1814_], aFloatArray9239[i_1815_], aFloatArray9239[i_1816_], aFloatArrayArray9190[i][0], aFloatArrayArray9190[i][1], aFloatArrayArray9190[i][2], aFloatArrayArray9235[i][0],
						aFloatArrayArray9235[i][1], aFloatArrayArray9235[i][2], i_1819_, i_1819_, i_1819_, aClass101_9163.anInt1194 * -1009384223, 0.0F, 0.0F, 0.0F, aShortArray9162[i] & 0xffff);
			} else
				aClass119_9165.method2079(bool, bool_1812_, bool_1813_, aFloatArray9198[i_1814_], aFloatArray9198[i_1815_], aFloatArray9198[i_1816_], aFloatArray9167[i_1814_], aFloatArray9167[i_1815_], aFloatArray9167[i_1816_], aFloatArray9238[i_1814_], aFloatArray9238[i_1815_], aFloatArray9238[i_1816_], aFloatArray9239[i_1814_], aFloatArray9239[i_1815_], aFloatArray9239[i_1816_], aFloatArrayArray9190[i][0], aFloatArrayArray9190[i][1], aFloatArrayArray9190[i][2], aFloatArrayArray9235[i][0],
						aFloatArrayArray9235[i][1], aFloatArrayArray9235[i][2], i_1818_ | anIntArray9192[i] & 0xffffff, i_1818_ | anIntArray9180[i] & 0xffffff, i_1818_ | anIntArray9194[i] & 0xffffff, aClass101_9163.anInt1194 * -1009384223, 0.0F, 0.0F, 0.0F, aShortArray9162[i] & 0xffff);
		}
	}

	void method3034(int i, int[] is, int i_1820_, int i_1821_, int i_1822_, int i_1823_, boolean bool) {
		int i_1824_ = is.length;
		if (i == 0) {
			i_1820_ <<= 4;
			i_1821_ <<= 4;
			i_1822_ <<= 4;
			if (!aBool9210) {
				for (int i_1825_ = 0; i_1825_ < anInt9177; i_1825_++) {
					anIntArray9191[i_1825_] <<= 4;
					anIntArray9184[i_1825_] <<= 4;
					anIntArray9161[i_1825_] <<= 4;
				}
				aBool9210 = true;
			}
			int i_1826_ = 0;
			anInt9247 = 0;
			anInt9212 = 0;
			anInt9224 = 0;
			for (int i_1827_ = 0; i_1827_ < i_1824_; i_1827_++) {
				int i_1828_ = is[i_1827_];
				if (i_1828_ < anIntArrayArray9178.length) {
					int[] is_1829_ = anIntArrayArray9178[i_1828_];
					for (int i_1830_ = 0; i_1830_ < is_1829_.length; i_1830_++) {
						int i_1831_ = is_1829_[i_1830_];
						anInt9247 += anIntArray9191[i_1831_];
						anInt9212 += anIntArray9184[i_1831_];
						anInt9224 += anIntArray9161[i_1831_];
						i_1826_++;
					}
				}
			}
			if (i_1826_ > 0) {
				anInt9247 = anInt9247 / i_1826_ + i_1820_;
				anInt9212 = anInt9212 / i_1826_ + i_1821_;
				anInt9224 = anInt9224 / i_1826_ + i_1822_;
			} else {
				anInt9247 = i_1820_;
				anInt9212 = i_1821_;
				anInt9224 = i_1822_;
			}
		} else if (i == 1) {
			i_1820_ <<= 4;
			i_1821_ <<= 4;
			i_1822_ <<= 4;
			if (!aBool9210) {
				for (int i_1832_ = 0; i_1832_ < anInt9177; i_1832_++) {
					anIntArray9191[i_1832_] <<= 4;
					anIntArray9184[i_1832_] <<= 4;
					anIntArray9161[i_1832_] <<= 4;
				}
				aBool9210 = true;
			}
			for (int i_1833_ = 0; i_1833_ < i_1824_; i_1833_++) {
				int i_1834_ = is[i_1833_];
				if (i_1834_ < anIntArrayArray9178.length) {
					int[] is_1835_ = anIntArrayArray9178[i_1834_];
					for (int i_1836_ = 0; i_1836_ < is_1835_.length; i_1836_++) {
						int i_1837_ = is_1835_[i_1836_];
						anIntArray9191[i_1837_] += i_1820_;
						anIntArray9184[i_1837_] += i_1821_;
						anIntArray9161[i_1837_] += i_1822_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1838_ = 0; i_1838_ < i_1824_; i_1838_++) {
				int i_1839_ = is[i_1838_];
				if (i_1839_ < anIntArrayArray9178.length) {
					int[] is_1840_ = anIntArrayArray9178[i_1839_];
					if ((i_1823_ & 0x1) == 0) {
						for (int i_1841_ = 0; i_1841_ < is_1840_.length; i_1841_++) {
							int i_1842_ = is_1840_[i_1841_];
							anIntArray9191[i_1842_] -= anInt9247;
							anIntArray9184[i_1842_] -= anInt9212;
							anIntArray9161[i_1842_] -= anInt9224;
							if (i_1822_ != 0) {
								int i_1843_ = Class428.anIntArray4825[i_1822_];
								int i_1844_ = Class428.anIntArray4819[i_1822_];
								int i_1845_ = ((anIntArray9184[i_1842_] * i_1843_ + anIntArray9191[i_1842_] * i_1844_ + 16383) >> 14);
								anIntArray9184[i_1842_] = (anIntArray9184[i_1842_] * i_1844_ - anIntArray9191[i_1842_] * i_1843_ + 16383) >> 14;
								anIntArray9191[i_1842_] = i_1845_;
							}
							if (i_1820_ != 0) {
								int i_1846_ = Class428.anIntArray4825[i_1820_];
								int i_1847_ = Class428.anIntArray4819[i_1820_];
								int i_1848_ = ((anIntArray9184[i_1842_] * i_1847_ - anIntArray9161[i_1842_] * i_1846_ + 16383) >> 14);
								anIntArray9161[i_1842_] = (anIntArray9184[i_1842_] * i_1846_ + anIntArray9161[i_1842_] * i_1847_ + 16383) >> 14;
								anIntArray9184[i_1842_] = i_1848_;
							}
							if (i_1821_ != 0) {
								int i_1849_ = Class428.anIntArray4825[i_1821_];
								int i_1850_ = Class428.anIntArray4819[i_1821_];
								int i_1851_ = ((anIntArray9161[i_1842_] * i_1849_ + anIntArray9191[i_1842_] * i_1850_ + 16383) >> 14);
								anIntArray9161[i_1842_] = (anIntArray9161[i_1842_] * i_1850_ - anIntArray9191[i_1842_] * i_1849_ + 16383) >> 14;
								anIntArray9191[i_1842_] = i_1851_;
							}
							anIntArray9191[i_1842_] += anInt9247;
							anIntArray9184[i_1842_] += anInt9212;
							anIntArray9161[i_1842_] += anInt9224;
						}
					} else {
						for (int i_1852_ = 0; i_1852_ < is_1840_.length; i_1852_++) {
							int i_1853_ = is_1840_[i_1852_];
							anIntArray9191[i_1853_] -= anInt9247;
							anIntArray9184[i_1853_] -= anInt9212;
							anIntArray9161[i_1853_] -= anInt9224;
							if (i_1820_ != 0) {
								int i_1854_ = Class428.anIntArray4825[i_1820_];
								int i_1855_ = Class428.anIntArray4819[i_1820_];
								int i_1856_ = ((anIntArray9184[i_1853_] * i_1855_ - anIntArray9161[i_1853_] * i_1854_ + 16383) >> 14);
								anIntArray9161[i_1853_] = (anIntArray9184[i_1853_] * i_1854_ + anIntArray9161[i_1853_] * i_1855_ + 16383) >> 14;
								anIntArray9184[i_1853_] = i_1856_;
							}
							if (i_1822_ != 0) {
								int i_1857_ = Class428.anIntArray4825[i_1822_];
								int i_1858_ = Class428.anIntArray4819[i_1822_];
								int i_1859_ = ((anIntArray9184[i_1853_] * i_1857_ + anIntArray9191[i_1853_] * i_1858_ + 16383) >> 14);
								anIntArray9184[i_1853_] = (anIntArray9184[i_1853_] * i_1858_ - anIntArray9191[i_1853_] * i_1857_ + 16383) >> 14;
								anIntArray9191[i_1853_] = i_1859_;
							}
							if (i_1821_ != 0) {
								int i_1860_ = Class428.anIntArray4825[i_1821_];
								int i_1861_ = Class428.anIntArray4819[i_1821_];
								int i_1862_ = ((anIntArray9161[i_1853_] * i_1860_ + anIntArray9191[i_1853_] * i_1861_ + 16383) >> 14);
								anIntArray9161[i_1853_] = (anIntArray9161[i_1853_] * i_1861_ - anIntArray9191[i_1853_] * i_1860_ + 16383) >> 14;
								anIntArray9191[i_1853_] = i_1862_;
							}
							anIntArray9191[i_1853_] += anInt9247;
							anIntArray9184[i_1853_] += anInt9212;
							anIntArray9161[i_1853_] += anInt9224;
						}
					}
				}
			}
		} else if (i == 3) {
			for (int i_1863_ = 0; i_1863_ < i_1824_; i_1863_++) {
				int i_1864_ = is[i_1863_];
				if (i_1864_ < anIntArrayArray9178.length) {
					int[] is_1865_ = anIntArrayArray9178[i_1864_];
					for (int i_1866_ = 0; i_1866_ < is_1865_.length; i_1866_++) {
						int i_1867_ = is_1865_[i_1866_];
						anIntArray9191[i_1867_] -= anInt9247;
						anIntArray9184[i_1867_] -= anInt9212;
						anIntArray9161[i_1867_] -= anInt9224;
						anIntArray9191[i_1867_] = anIntArray9191[i_1867_] * i_1820_ / 128;
						anIntArray9184[i_1867_] = anIntArray9184[i_1867_] * i_1821_ / 128;
						anIntArray9161[i_1867_] = anIntArray9161[i_1867_] * i_1822_ / 128;
						anIntArray9191[i_1867_] += anInt9247;
						anIntArray9184[i_1867_] += anInt9212;
						anIntArray9161[i_1867_] += anInt9224;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9208 != null && aByteArray9202 != null) {
				for (int i_1868_ = 0; i_1868_ < i_1824_; i_1868_++) {
					int i_1869_ = is[i_1868_];
					if (i_1869_ < anIntArrayArray9208.length) {
						int[] is_1870_ = anIntArrayArray9208[i_1869_];
						for (int i_1871_ = 0; i_1871_ < is_1870_.length; i_1871_++) {
							int i_1872_ = is_1870_[i_1871_];
							int i_1873_ = ((aByteArray9202[i_1872_] & 0xff) + i_1820_ * 8);
							if (i_1873_ < 0)
								i_1873_ = 0;
							else if (i_1873_ > 255)
								i_1873_ = 255;
							aByteArray9202[i_1872_] = (byte) i_1873_;
						}
					}
				}
				if (aClass116Array9218 != null) {
					for (int i_1874_ = 0; i_1874_ < anInt9217; i_1874_++) {
						Class116 class116 = aClass116Array9218[i_1874_];
						Class108 class108 = aClass108Array9211[i_1874_];
						class108.anInt1351 = (class108.anInt1351 * 328110239 & 0xffffff | 255 - ((aByteArray9202[class116.anInt1421 * 1723945109]) & 0xff) << 24) * 120490847;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9208 != null) {
				for (int i_1875_ = 0; i_1875_ < i_1824_; i_1875_++) {
					int i_1876_ = is[i_1875_];
					if (i_1876_ < anIntArrayArray9208.length) {
						int[] is_1877_ = anIntArrayArray9208[i_1876_];
						for (int i_1878_ = 0; i_1878_ < is_1877_.length; i_1878_++) {
							int i_1879_ = is_1877_[i_1878_];
							int i_1880_ = aShortArray9193[i_1879_] & 0xffff;
							int i_1881_ = i_1880_ >> 10 & 0x3f;
							int i_1882_ = i_1880_ >> 7 & 0x7;
							int i_1883_ = i_1880_ & 0x7f;
							i_1881_ = i_1881_ + i_1820_ & 0x3f;
							i_1882_ += i_1821_;
							if (i_1882_ < 0)
								i_1882_ = 0;
							else if (i_1882_ > 7)
								i_1882_ = 7;
							i_1883_ += i_1822_;
							if (i_1883_ < 0)
								i_1883_ = 0;
							else if (i_1883_ > 127)
								i_1883_ = 127;
							aShortArray9193[i_1879_] = (short) (i_1881_ << 10 | i_1882_ << 7 | i_1883_);
						}
						aBool9209 = true;
					}
				}
				if (aClass116Array9218 != null) {
					for (int i_1884_ = 0; i_1884_ < anInt9217; i_1884_++) {
						Class116 class116 = aClass116Array9218[i_1884_];
						Class108 class108 = aClass108Array9211[i_1884_];
						class108.anInt1351 = (class108.anInt1351 * 328110239 & ~0xffffff | ((Class656.anIntArray8393[Class453.method7333(((aShortArray9193[(class116.anInt1421 * 1723945109)]) & 0xffff), (byte) 10) & 0xffff]) & 0xffffff)) * 120490847;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9220 != null) {
				for (int i_1885_ = 0; i_1885_ < i_1824_; i_1885_++) {
					int i_1886_ = is[i_1885_];
					if (i_1886_ < anIntArrayArray9220.length) {
						int[] is_1887_ = anIntArrayArray9220[i_1886_];
						for (int i_1888_ = 0; i_1888_ < is_1887_.length; i_1888_++) {
							Class108 class108 = aClass108Array9211[is_1887_[i_1888_]];
							class108.anInt1346 += i_1820_ * -653278629;
							class108.anInt1350 += i_1821_ * -1290559937;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9220 != null) {
				for (int i_1889_ = 0; i_1889_ < i_1824_; i_1889_++) {
					int i_1890_ = is[i_1889_];
					if (i_1890_ < anIntArrayArray9220.length) {
						int[] is_1891_ = anIntArrayArray9220[i_1890_];
						for (int i_1892_ = 0; i_1892_ < is_1891_.length; i_1892_++) {
							Class108 class108 = aClass108Array9211[is_1891_[i_1892_]];
							class108.aFloat1347 = (class108.aFloat1347 * (float) i_1820_ / 128.0F);
							class108.aFloat1353 = (class108.aFloat1353 * (float) i_1821_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9220 != null) {
				for (int i_1893_ = 0; i_1893_ < i_1824_; i_1893_++) {
					int i_1894_ = is[i_1893_];
					if (i_1894_ < anIntArrayArray9220.length) {
						int[] is_1895_ = anIntArrayArray9220[i_1894_];
						for (int i_1896_ = 0; i_1896_ < is_1895_.length; i_1896_++) {
							Class108 class108 = aClass108Array9211[is_1895_[i_1896_]];
							class108.anInt1349 = (class108.anInt1349 * 1169382623 + i_1820_ & 0x3fff) * -1991287009;
						}
					}
				}
			}
		}
	}

	final void method14704(boolean bool, boolean bool_1897_, boolean bool_1898_, int i) {
		boolean bool_1899_ = false;
		if (aShortArray9162 != null && aShortArray9162[i] != -1)
			bool_1899_ = (aClass180_Sub1_9171.aClass181_2059.method3544(aShortArray9162[i] & 0xffff, (byte) 1).aBool1761);
		if (!aClass101_9163.aBool1196) {
			short i_1900_ = aShortArray9187[i];
			short i_1901_ = aShortArray9188[i];
			short i_1902_ = aShortArray9189[i];
			Class427 class427 = aClass180_Sub1_9171.aClass427_9402;
			float f = class427.aFloatArray4807[10];
			float f_1903_ = class427.aFloatArray4807[14];
			float f_1904_ = class427.aFloatArray4807[11];
			float f_1905_ = class427.aFloatArray4807[15];
			float f_1906_ = f_1903_ * f_1904_ - f * f_1905_;
			float f_1907_ = ((aFloatArray9238[i_1900_] - aClass101_9163.aFloat1222) * aClass101_9163.aFloat1223);
			float f_1908_ = ((aFloatArray9238[i_1901_] - aClass101_9163.aFloat1222) * aClass101_9163.aFloat1223);
			float f_1909_ = ((aFloatArray9238[i_1902_] - aClass101_9163.aFloat1222) * aClass101_9163.aFloat1223);
			float f_1910_ = f_1907_ * f_1906_ / (f_1907_ * f_1904_ - f);
			float f_1911_ = f_1908_ * f_1906_ / (f_1908_ * f_1904_ - f);
			float f_1912_ = f_1909_ * f_1906_ / (f_1909_ * f_1904_ - f);
			float f_1913_ = ((f_1910_ - aClass101_9163.aFloat1192) / aClass101_9163.aFloat1193);
			if (f_1913_ > 1.0F)
				f_1913_ = 1.0F;
			else if (f_1913_ < 0.0F)
				f_1913_ = 0.0F;
			float f_1914_ = ((f_1911_ - aClass101_9163.aFloat1192) / aClass101_9163.aFloat1193);
			if (f_1914_ > 1.0F)
				f_1914_ = 1.0F;
			else if (f_1914_ < 0.0F)
				f_1914_ = 0.0F;
			float f_1915_ = ((f_1912_ - aClass101_9163.aFloat1192) / aClass101_9163.aFloat1193);
			if (f_1915_ > 1.0F)
				f_1915_ = 1.0F;
			else if (f_1915_ < 0.0F)
				f_1915_ = 0.0F;
			float f_1916_ = f_1913_ + f_1914_ + f_1915_;
			if (!(f_1916_ >= 3.0F)) {
				if (f_1916_ <= 0.0F)
					method14652(bool, bool_1897_, bool_1898_, i);
				else {
					if (aByteArray9202 == null)
						aClass119_9165.anInt1441 = 0;
					else
						aClass119_9165.anInt1441 = aByteArray9202[i] & 0xff;
					if (!bool_1899_) {
						if (anIntArray9194[i] == -1)
							aClass119_9165.method2106(bool, bool_1897_, bool_1898_, aFloatArray9198[i_1900_], aFloatArray9198[i_1901_], aFloatArray9198[i_1902_], aFloatArray9167[i_1900_], aFloatArray9167[i_1901_], aFloatArray9167[i_1902_], aFloatArray9238[i_1900_], aFloatArray9238[i_1901_], aFloatArray9238[i_1902_], Class388.method6456((Class656.anIntArray8393[(anIntArray9192[i] & 0xffff)]), (aClass101_9163.anInt1194 * -1009384223), f_1913_ * 255.0F, (byte) 14),
									Class388.method6456((Class656.anIntArray8393[(anIntArray9192[i] & 0xffff)]), (aClass101_9163.anInt1194 * -1009384223), f_1914_ * 255.0F, (byte) -61), Class388.method6456((Class656.anIntArray8393[(anIntArray9192[i] & 0xffff)]), (aClass101_9163.anInt1194 * -1009384223), f_1915_ * 255.0F, (byte) 50));
						else
							aClass119_9165.method2106(bool, bool_1897_, bool_1898_, aFloatArray9198[i_1900_], aFloatArray9198[i_1901_], aFloatArray9198[i_1902_], aFloatArray9167[i_1900_], aFloatArray9167[i_1901_], aFloatArray9167[i_1902_], aFloatArray9238[i_1900_], aFloatArray9238[i_1901_], aFloatArray9238[i_1902_], Class388.method6456((Class656.anIntArray8393[(anIntArray9192[i] & 0xffff)]), (aClass101_9163.anInt1194 * -1009384223), f_1913_ * 255.0F, (byte) -36),
									Class388.method6456((Class656.anIntArray8393[(anIntArray9180[i] & 0xffff)]), (aClass101_9163.anInt1194 * -1009384223), f_1914_ * 255.0F, (byte) -51), Class388.method6456((Class656.anIntArray8393[(anIntArray9194[i] & 0xffff)]), (aClass101_9163.anInt1194 * -1009384223), f_1915_ * 255.0F, (byte) -57));
					} else {
						int i_1917_ = -16777216;
						if (aByteArray9202 != null)
							i_1917_ = 255 - (aByteArray9202[i] & 0xff) << 24;
						if (anIntArray9194[i] == -1) {
							int i_1918_ = i_1917_ | anIntArray9192[i] & 0xffffff;
							aClass119_9165.method2079(bool, bool_1897_, bool_1898_, aFloatArray9198[i_1900_], aFloatArray9198[i_1901_], aFloatArray9198[i_1902_], aFloatArray9167[i_1900_], aFloatArray9167[i_1901_], aFloatArray9167[i_1902_], aFloatArray9238[i_1900_], aFloatArray9238[i_1901_], aFloatArray9238[i_1902_], aFloatArray9239[i_1900_], aFloatArray9239[i_1901_], aFloatArray9239[i_1902_], aFloatArrayArray9190[i][0], aFloatArrayArray9190[i][1], aFloatArrayArray9190[i][2],
									aFloatArrayArray9235[i][0], aFloatArrayArray9235[i][1], aFloatArrayArray9235[i][2], i_1918_, i_1918_, i_1918_, aClass101_9163.anInt1194 * -1009384223, f_1913_ * 255.0F, f_1914_ * 255.0F, f_1915_ * 255.0F, aShortArray9162[i] & 0xffff);
						} else
							aClass119_9165.method2079(bool, bool_1897_, bool_1898_, aFloatArray9198[i_1900_], aFloatArray9198[i_1901_], aFloatArray9198[i_1902_], aFloatArray9167[i_1900_], aFloatArray9167[i_1901_], aFloatArray9167[i_1902_], aFloatArray9238[i_1900_], aFloatArray9238[i_1901_], aFloatArray9238[i_1902_], aFloatArray9239[i_1900_], aFloatArray9239[i_1901_], aFloatArray9239[i_1902_], aFloatArrayArray9190[i][0], aFloatArrayArray9190[i][1], aFloatArrayArray9190[i][2],
									aFloatArrayArray9235[i][0], aFloatArrayArray9235[i][1], aFloatArrayArray9235[i][2], i_1917_ | anIntArray9192[i] & 0xffffff, i_1917_ | anIntArray9180[i] & 0xffffff, i_1917_ | anIntArray9194[i] & 0xffffff, aClass101_9163.anInt1194 * -1009384223, f_1913_ * 255.0F, f_1914_ * 255.0F, f_1915_ * 255.0F, aShortArray9162[i] & 0xffff);
					}
				}
			}
		} else {
			short i_1919_ = aShortArray9187[i];
			short i_1920_ = aShortArray9188[i];
			short i_1921_ = aShortArray9189[i];
			float f = 0.0F;
			float f_1922_ = 0.0F;
			float f_1923_ = 0.0F;
			if (anIntArray9230[i_1919_] > aClass101_9163.anInt1198 * 1247682779)
				f = 1.0F;
			else if (anIntArray9230[i_1919_] > aClass101_9163.anInt1205 * -1275882393)
				f = ((float) (aClass101_9163.anInt1205 * -1275882393 - anIntArray9230[i_1919_]) * 1.0F / (float) (aClass101_9163.anInt1205 * -1275882393 - aClass101_9163.anInt1198 * 1247682779));
			if (anIntArray9230[i_1920_] > aClass101_9163.anInt1198 * 1247682779)
				f_1922_ = 1.0F;
			else if (anIntArray9230[i_1920_] > aClass101_9163.anInt1205 * -1275882393)
				f_1922_ = ((float) (aClass101_9163.anInt1205 * -1275882393 - anIntArray9230[i_1920_]) * 1.0F / (float) (aClass101_9163.anInt1205 * -1275882393 - aClass101_9163.anInt1198 * 1247682779));
			if (anIntArray9230[i_1921_] > aClass101_9163.anInt1198 * 1247682779)
				f_1923_ = 1.0F;
			else if (anIntArray9230[i_1921_] > aClass101_9163.anInt1205 * -1275882393)
				f_1923_ = ((float) (aClass101_9163.anInt1205 * -1275882393 - anIntArray9230[i_1921_]) * 1.0F / (float) (aClass101_9163.anInt1205 * -1275882393 - aClass101_9163.anInt1198 * 1247682779));
			if (aByteArray9202 == null)
				aClass119_9165.anInt1441 = 0;
			else
				aClass119_9165.anInt1441 = aByteArray9202[i] & 0xff;
			if (!bool_1899_) {
				if (anIntArray9194[i] == -1)
					aClass119_9165.method2106(bool, bool_1897_, bool_1898_, aFloatArray9198[i_1919_], aFloatArray9198[i_1920_], aFloatArray9198[i_1921_], aFloatArray9167[i_1919_], aFloatArray9167[i_1920_], aFloatArray9167[i_1921_], aFloatArray9238[i_1919_], aFloatArray9238[i_1920_], aFloatArray9238[i_1921_], Class388.method6456((Class656.anIntArray8393[anIntArray9192[i] & 0xffff]), (aClass101_9163.anInt1194 * -1009384223), f * 255.0F, (byte) 29),
							Class388.method6456((Class656.anIntArray8393[anIntArray9192[i] & 0xffff]), (aClass101_9163.anInt1194 * -1009384223), f_1922_ * 255.0F, (byte) 19), Class388.method6456((Class656.anIntArray8393[anIntArray9192[i] & 0xffff]), (aClass101_9163.anInt1194 * -1009384223), f_1923_ * 255.0F, (byte) -92));
				else
					aClass119_9165.method2106(bool, bool_1897_, bool_1898_, aFloatArray9198[i_1919_], aFloatArray9198[i_1920_], aFloatArray9198[i_1921_], aFloatArray9167[i_1919_], aFloatArray9167[i_1920_], aFloatArray9167[i_1921_], aFloatArray9238[i_1919_], aFloatArray9238[i_1920_], aFloatArray9238[i_1921_], Class388.method6456((Class656.anIntArray8393[anIntArray9192[i] & 0xffff]), (aClass101_9163.anInt1194 * -1009384223), f * 255.0F, (byte) -38),
							Class388.method6456((Class656.anIntArray8393[anIntArray9180[i] & 0xffff]), (aClass101_9163.anInt1194 * -1009384223), f_1922_ * 255.0F, (byte) -67), Class388.method6456((Class656.anIntArray8393[anIntArray9194[i] & 0xffff]), (aClass101_9163.anInt1194 * -1009384223), f_1923_ * 255.0F, (byte) -77));
			} else {
				int i_1924_ = -16777216;
				if (aByteArray9202 != null)
					i_1924_ = 255 - (aByteArray9202[i] & 0xff) << 24;
				if (anIntArray9194[i] == -1) {
					int i_1925_ = i_1924_ | anIntArray9192[i] & 0xffffff;
					aClass119_9165.method2079(bool, bool_1897_, bool_1898_, aFloatArray9198[i_1919_], aFloatArray9198[i_1920_], aFloatArray9198[i_1921_], aFloatArray9167[i_1919_], aFloatArray9167[i_1920_], aFloatArray9167[i_1921_], aFloatArray9238[i_1919_], aFloatArray9238[i_1920_], aFloatArray9238[i_1921_], aFloatArray9239[i_1919_], aFloatArray9239[i_1920_], aFloatArray9239[i_1921_], aFloatArrayArray9190[i][0], aFloatArrayArray9190[i][1], aFloatArrayArray9190[i][2], aFloatArrayArray9235[i][0],
							aFloatArrayArray9235[i][1], aFloatArrayArray9235[i][2], i_1925_, i_1925_, i_1925_, aClass101_9163.anInt1194 * -1009384223, f * 255.0F, f_1922_ * 255.0F, f_1923_ * 255.0F, aShortArray9162[i] & 0xffff);
				} else
					aClass119_9165.method2079(bool, bool_1897_, bool_1898_, aFloatArray9198[i_1919_], aFloatArray9198[i_1920_], aFloatArray9198[i_1921_], aFloatArray9167[i_1919_], aFloatArray9167[i_1920_], aFloatArray9167[i_1921_], aFloatArray9238[i_1919_], aFloatArray9238[i_1920_], aFloatArray9238[i_1921_], aFloatArray9239[i_1919_], aFloatArray9239[i_1920_], aFloatArray9239[i_1921_], aFloatArrayArray9190[i][0], aFloatArrayArray9190[i][1], aFloatArrayArray9190[i][2], aFloatArrayArray9235[i][0],
							aFloatArrayArray9235[i][1], aFloatArrayArray9235[i][2], i_1924_ | anIntArray9192[i] & 0xffffff, i_1924_ | anIntArray9180[i] & 0xffffff, i_1924_ | anIntArray9194[i] & 0xffffff, aClass101_9163.anInt1194 * -1009384223, f * 255.0F, f_1922_ * 255.0F, f_1923_ * 255.0F, aShortArray9162[i] & 0xffff);
			}
		}
	}

	public void method3006(int i, int i_1926_, int i_1927_, int i_1928_) {
		if ((anInt9174 & 0x80000) != 524288)
			throw new IllegalStateException();
		for (int i_1929_ = 0; i_1929_ < anInt9185; i_1929_++) {
			int i_1930_ = aShortArray9193[i_1929_] & 0xffff;
			int i_1931_ = i_1930_ >> 10 & 0x3f;
			int i_1932_ = i_1930_ >> 7 & 0x7;
			int i_1933_ = i_1930_ & 0x7f;
			if (i != -1)
				i_1931_ += (i - i_1931_) * i_1928_ >> 7;
			if (i_1926_ != -1)
				i_1932_ += (i_1926_ - i_1932_) * i_1928_ >> 7;
			if (i_1927_ != -1)
				i_1933_ += (i_1927_ - i_1933_) * i_1928_ >> 7;
			aShortArray9193[i_1929_] = (short) (i_1931_ << 10 | i_1932_ << 7 | i_1933_);
		}
		if (aClass116Array9218 != null) {
			for (int i_1934_ = 0; i_1934_ < anInt9217; i_1934_++) {
				Class116 class116 = aClass116Array9218[i_1934_];
				Class108 class108 = aClass108Array9211[i_1934_];
				class108.anInt1351 = (class108.anInt1351 * 328110239 & ~0xffffff | ((Class656.anIntArray8393[Class453.method7333((aShortArray9193[(class116.anInt1421 * 1723945109)]) & 0xffff, (byte) 10) & 0xffff]) & 0xffffff)) * 120490847;
			}
		}
		if (anInt9246 == 2)
			anInt9246 = 1;
	}

	public boolean method2958(int i, int i_1935_, Class432 class432, boolean bool, int i_1936_) {
		method14631(aClass180_Sub1_9171.method14835(Thread.currentThread()));
		Class427 class427 = aClass101_9163.aClass427_1188;
		class427.method6784(class432);
		Class427 class427_1937_ = aClass101_9163.aClass427_1204;
		class427_1937_.method6750(class427);
		class427_1937_.method6751(aClass180_Sub1_9171.aClass427_9403);
		boolean bool_1938_ = false;
		int i_1939_ = 2147483647;
		int i_1940_ = -2147483648;
		int i_1941_ = 2147483647;
		int i_1942_ = -2147483648;
		if (!aBool9221)
			method14659();
		int i_1943_ = aShort9173 - aShort9226 >> 1;
		int i_1944_ = aShort9237 - aShort9223 >> 1;
		int i_1945_ = aShort9229 - aShort9228 >> 1;
		int i_1946_ = aShort9226 + i_1943_;
		int i_1947_ = aShort9223 + i_1944_;
		int i_1948_ = aShort9228 + i_1945_;
		int i_1949_ = i_1946_ - (i_1943_ << i_1936_);
		int i_1950_ = i_1947_ - (i_1944_ << i_1936_);
		int i_1951_ = i_1948_ - (i_1945_ << i_1936_);
		int i_1952_ = i_1946_ + (i_1943_ << i_1936_);
		int i_1953_ = i_1947_ + (i_1944_ << i_1936_);
		int i_1954_ = i_1948_ + (i_1945_ << i_1936_);
		anIntArray9240[0] = i_1949_;
		anIntArray9241[0] = i_1950_;
		anIntArray9176[0] = i_1951_;
		anIntArray9240[1] = i_1952_;
		anIntArray9241[1] = i_1950_;
		anIntArray9176[1] = i_1951_;
		anIntArray9240[2] = i_1949_;
		anIntArray9241[2] = i_1953_;
		anIntArray9176[2] = i_1951_;
		anIntArray9240[3] = i_1952_;
		anIntArray9241[3] = i_1953_;
		anIntArray9176[3] = i_1951_;
		anIntArray9240[4] = i_1949_;
		anIntArray9241[4] = i_1950_;
		anIntArray9176[4] = i_1954_;
		anIntArray9240[5] = i_1952_;
		anIntArray9241[5] = i_1950_;
		anIntArray9176[5] = i_1954_;
		anIntArray9240[6] = i_1949_;
		anIntArray9241[6] = i_1953_;
		anIntArray9176[6] = i_1954_;
		anIntArray9240[7] = i_1952_;
		anIntArray9241[7] = i_1953_;
		anIntArray9176[7] = i_1954_;
		for (int i_1955_ = 0; i_1955_ < 8; i_1955_++) {
			int i_1956_ = anIntArray9240[i_1955_];
			int i_1957_ = anIntArray9241[i_1955_];
			int i_1958_ = anIntArray9176[i_1955_];
			float f = (class427_1937_.aFloatArray4807[2] * (float) i_1956_ + class427_1937_.aFloatArray4807[6] * (float) i_1957_ + class427_1937_.aFloatArray4807[10] * (float) i_1958_ + class427_1937_.aFloatArray4807[14]);
			float f_1959_ = (class427_1937_.aFloatArray4807[3] * (float) i_1956_ + class427_1937_.aFloatArray4807[7] * (float) i_1957_ + class427_1937_.aFloatArray4807[11] * (float) i_1958_ + class427_1937_.aFloatArray4807[15]);
			if (f >= -f_1959_) {
				float f_1960_ = (class427_1937_.aFloatArray4807[0] * (float) i_1956_ + class427_1937_.aFloatArray4807[4] * (float) i_1957_ + class427_1937_.aFloatArray4807[8] * (float) i_1958_ + class427_1937_.aFloatArray4807[12]);
				float f_1961_ = (class427_1937_.aFloatArray4807[1] * (float) i_1956_ + class427_1937_.aFloatArray4807[5] * (float) i_1957_ + class427_1937_.aFloatArray4807[9] * (float) i_1958_ + class427_1937_.aFloatArray4807[13]);
				int i_1962_ = (int) (aClass180_Sub1_9171.aFloat9410 + (aClass180_Sub1_9171.aFloat9419 * f_1960_ / f_1959_));
				int i_1963_ = (int) (aClass180_Sub1_9171.aFloat9412 + (aClass180_Sub1_9171.aFloat9395 * f_1961_ / f_1959_));
				if (i_1962_ < i_1939_)
					i_1939_ = i_1962_;
				if (i_1962_ > i_1940_)
					i_1940_ = i_1962_;
				if (i_1963_ < i_1941_)
					i_1941_ = i_1963_;
				if (i_1963_ > i_1942_)
					i_1942_ = i_1963_;
				bool_1938_ = true;
			}
		}
		if (bool_1938_ && i > i_1939_ && i < i_1940_ && i_1935_ > i_1941_ && i_1935_ < i_1942_) {
			if (bool)
				return true;
			for (int i_1964_ = 0; i_1964_ < anInt9177; i_1964_++) {
				int i_1965_ = anIntArray9191[i_1964_];
				int i_1966_ = anIntArray9184[i_1964_];
				int i_1967_ = anIntArray9161[i_1964_];
				float f = (class427_1937_.aFloatArray4807[2] * (float) i_1965_ + class427_1937_.aFloatArray4807[6] * (float) i_1966_ + class427_1937_.aFloatArray4807[10] * (float) i_1967_ + class427_1937_.aFloatArray4807[14]);
				float f_1968_ = (class427_1937_.aFloatArray4807[3] * (float) i_1965_ + class427_1937_.aFloatArray4807[7] * (float) i_1966_ + class427_1937_.aFloatArray4807[11] * (float) i_1967_ + class427_1937_.aFloatArray4807[15]);
				if (f >= -f_1968_) {
					float f_1969_ = (class427_1937_.aFloatArray4807[0] * (float) i_1965_ + (class427_1937_.aFloatArray4807[4] * (float) i_1966_) + (class427_1937_.aFloatArray4807[8] * (float) i_1967_) + class427_1937_.aFloatArray4807[12]);
					float f_1970_ = (class427_1937_.aFloatArray4807[1] * (float) i_1965_ + (class427_1937_.aFloatArray4807[5] * (float) i_1966_) + (class427_1937_.aFloatArray4807[9] * (float) i_1967_) + class427_1937_.aFloatArray4807[13]);
					aFloatArray9167[i_1964_] = (float) (int) (aClass180_Sub1_9171.aFloat9410 + (aClass180_Sub1_9171.aFloat9419 * f_1969_ / f_1968_));
					aFloatArray9198[i_1964_] = (float) (int) (aClass180_Sub1_9171.aFloat9412 + (aClass180_Sub1_9171.aFloat9395 * f_1970_ / f_1968_));
				} else
					aFloatArray9167[i_1964_] = -999999.0F;
			}
			for (int i_1971_ = 0; i_1971_ < anInt9186; i_1971_++) {
				if (aFloatArray9167[aShortArray9187[i_1971_]] != -999999.0F && aFloatArray9167[aShortArray9188[i_1971_]] != -999999.0F && aFloatArray9167[aShortArray9189[i_1971_]] != -999999.0F && method14663(i, i_1935_, aFloatArray9198[aShortArray9187[i_1971_]], aFloatArray9198[aShortArray9188[i_1971_]], aFloatArray9198[aShortArray9189[i_1971_]], aFloatArray9167[aShortArray9187[i_1971_]], aFloatArray9167[aShortArray9188[i_1971_]], aFloatArray9167[aShortArray9189[i_1971_]]))
					return true;
			}
		}
		return false;
	}

	public void method2944(int i, int i_1972_, Class161 class161, Class161 class161_1973_, int i_1974_, int i_1975_, int i_1976_) {
		if (i == 3) {
			if ((anInt9174 & 0x7) != 7)
				throw new IllegalStateException();
		} else if ((anInt9174 & 0x2) != 2)
			throw new IllegalStateException();
		if (!aBool9221)
			method14659();
		int i_1977_ = i_1974_ + aShort9226;
		int i_1978_ = i_1974_ + aShort9173;
		int i_1979_ = i_1976_ + aShort9228;
		int i_1980_ = i_1976_ + aShort9229;
		if (i == 4 || (i_1977_ >= 0 && ((i_1978_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1750 * 1210322533) && i_1979_ >= 0 && ((i_1980_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1751 * -533476177))) {
			int[][] is = class161.anIntArrayArray1754;
			int[][] is_1981_ = null;
			if (class161_1973_ != null)
				is_1981_ = class161_1973_.anIntArrayArray1754;
			if (i == 4 || i == 5) {
				if (class161_1973_ == null || (i_1977_ < 0 || ((i_1978_ + class161_1973_.anInt1752 * 1048375491 >> class161_1973_.anInt1753 * 1252000143) >= class161_1973_.anInt1750 * 1210322533) || i_1979_ < 0 || ((i_1980_ + class161_1973_.anInt1752 * 1048375491 >> class161_1973_.anInt1753 * 1252000143) >= class161_1973_.anInt1751 * -533476177)))
					return;
			} else {
				i_1977_ >>= class161.anInt1753 * 1252000143;
				i_1978_ = (i_1978_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				i_1979_ >>= class161.anInt1753 * 1252000143;
				i_1980_ = (i_1980_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				if (is[i_1977_][i_1979_] == i_1975_ && is[i_1978_][i_1979_] == i_1975_ && is[i_1977_][i_1980_] == i_1975_ && is[i_1978_][i_1980_] == i_1975_)
					return;
			}
			synchronized (this) {
				if (i == 1) {
					int i_1982_ = class161.anInt1752 * 1048375491 - 1;
					for (int i_1983_ = 0; i_1983_ < anInt9231; i_1983_++) {
						int i_1984_ = anIntArray9191[i_1983_] + i_1974_;
						int i_1985_ = anIntArray9161[i_1983_] + i_1976_;
						int i_1986_ = i_1984_ & i_1982_;
						int i_1987_ = i_1985_ & i_1982_;
						int i_1988_ = i_1984_ >> class161.anInt1753 * 1252000143;
						int i_1989_ = i_1985_ >> class161.anInt1753 * 1252000143;
						int i_1990_ = (((is[i_1988_][i_1989_] * (class161.anInt1752 * 1048375491 - i_1986_)) + is[i_1988_ + 1][i_1989_] * i_1986_) >> class161.anInt1753 * 1252000143);
						int i_1991_ = (((is[i_1988_][i_1989_ + 1] * (class161.anInt1752 * 1048375491 - i_1986_)) + is[i_1988_ + 1][i_1989_ + 1] * i_1986_) >> class161.anInt1753 * 1252000143);
						int i_1992_ = (i_1990_ * (class161.anInt1752 * 1048375491 - i_1987_) + i_1991_ * i_1987_ >> class161.anInt1753 * 1252000143);
						anIntArray9184[i_1983_] = anIntArray9184[i_1983_] + i_1992_ - i_1975_;
					}
					for (int i_1993_ = anInt9231; i_1993_ < anInt9177; i_1993_++) {
						int i_1994_ = anIntArray9191[i_1993_] + i_1974_;
						int i_1995_ = anIntArray9161[i_1993_] + i_1976_;
						int i_1996_ = i_1994_ & i_1982_;
						int i_1997_ = i_1995_ & i_1982_;
						int i_1998_ = i_1994_ >> class161.anInt1753 * 1252000143;
						int i_1999_ = i_1995_ >> class161.anInt1753 * 1252000143;
						if (i_1998_ >= 0 && i_1998_ < is.length - 1 && i_1999_ >= 0 && i_1999_ < is[0].length - 1) {
							int i_2000_ = (((is[i_1998_][i_1999_] * (class161.anInt1752 * 1048375491 - i_1996_)) + is[i_1998_ + 1][i_1999_] * i_1996_) >> class161.anInt1753 * 1252000143);
							int i_2001_ = (((is[i_1998_][i_1999_ + 1] * (class161.anInt1752 * 1048375491 - i_1996_)) + is[i_1998_ + 1][i_1999_ + 1] * i_1996_) >> class161.anInt1753 * 1252000143);
							int i_2002_ = (i_2000_ * (class161.anInt1752 * 1048375491 - i_1997_) + i_2001_ * i_1997_ >> class161.anInt1753 * 1252000143);
							anIntArray9184[i_1993_] = anIntArray9184[i_1993_] + i_2002_ - i_1975_;
						}
					}
				} else if (i == 2) {
					if (aShort9223 == 0)
						return;
					int i_2003_ = class161.anInt1752 * 1048375491 - 1;
					for (int i_2004_ = 0; i_2004_ < anInt9231; i_2004_++) {
						int i_2005_ = (anIntArray9184[i_2004_] << 16) / aShort9223;
						if (i_2005_ < i_1972_) {
							int i_2006_ = anIntArray9191[i_2004_] + i_1974_;
							int i_2007_ = anIntArray9161[i_2004_] + i_1976_;
							int i_2008_ = i_2006_ & i_2003_;
							int i_2009_ = i_2007_ & i_2003_;
							int i_2010_ = i_2006_ >> class161.anInt1753 * 1252000143;
							int i_2011_ = i_2007_ >> class161.anInt1753 * 1252000143;
							int i_2012_ = (((is[i_2010_][i_2011_] * (class161.anInt1752 * 1048375491 - i_2008_)) + is[i_2010_ + 1][i_2011_] * i_2008_) >> class161.anInt1753 * 1252000143);
							int i_2013_ = (((is[i_2010_][i_2011_ + 1] * (class161.anInt1752 * 1048375491 - i_2008_)) + is[i_2010_ + 1][i_2011_ + 1] * i_2008_) >> class161.anInt1753 * 1252000143);
							int i_2014_ = (i_2012_ * (class161.anInt1752 * 1048375491 - i_2009_) + i_2013_ * i_2009_ >> class161.anInt1753 * 1252000143);
							anIntArray9184[i_2004_] = (anIntArray9184[i_2004_] + ((i_2014_ - i_1975_) * (i_1972_ - i_2005_) / i_1972_));
						} else
							anIntArray9184[i_2004_] = anIntArray9184[i_2004_];
					}
					for (int i_2015_ = anInt9231; i_2015_ < anInt9177; i_2015_++) {
						int i_2016_ = (anIntArray9184[i_2015_] << 16) / aShort9223;
						if (i_2016_ < i_1972_) {
							int i_2017_ = anIntArray9191[i_2015_] + i_1974_;
							int i_2018_ = anIntArray9161[i_2015_] + i_1976_;
							int i_2019_ = i_2017_ & i_2003_;
							int i_2020_ = i_2018_ & i_2003_;
							int i_2021_ = i_2017_ >> class161.anInt1753 * 1252000143;
							int i_2022_ = i_2018_ >> class161.anInt1753 * 1252000143;
							if (i_2021_ >= 0 && (i_2021_ < class161.anInt1750 * 1210322533 - 1) && i_2022_ >= 0 && (i_2022_ < class161.anInt1751 * -533476177 - 1)) {
								int i_2023_ = (((is[i_2021_][i_2022_] * (class161.anInt1752 * 1048375491 - i_2019_)) + is[i_2021_ + 1][i_2022_] * i_2019_) >> class161.anInt1753 * 1252000143);
								int i_2024_ = (((is[i_2021_][i_2022_ + 1] * (class161.anInt1752 * 1048375491 - i_2019_)) + (is[i_2021_ + 1][i_2022_ + 1] * i_2019_)) >> class161.anInt1753 * 1252000143);
								int i_2025_ = ((i_2023_ * (class161.anInt1752 * 1048375491 - i_2020_)) + i_2024_ * i_2020_ >> class161.anInt1753 * 1252000143);
								anIntArray9184[i_2015_] = (anIntArray9184[i_2015_] + ((i_2025_ - i_1975_) * (i_1972_ - i_2016_) / i_1972_));
							}
						} else
							anIntArray9184[i_2015_] = anIntArray9184[i_2015_];
					}
				} else if (i == 3) {
					int i_2026_ = (i_1972_ & 0xff) * 16;
					int i_2027_ = (i_1972_ >> 8 & 0xff) * 16;
					int i_2028_ = (i_1972_ >> 16 & 0xff) << 6;
					int i_2029_ = (i_1972_ >> 24 & 0xff) << 6;
					if (i_1974_ - (i_2026_ >> 1) < 0 || ((i_1974_ + (i_2026_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1750 * 1210322533 << class161.anInt1753 * 1252000143)) || i_1976_ - (i_2027_ >> 1) < 0 || ((i_1976_ + (i_2027_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1751 * -533476177 << class161.anInt1753 * 1252000143)))
						return;
					method2962(class161, i_1974_, i_1975_, i_1976_, i_2026_, i_2027_, i_2028_, i_2029_);
				} else if (i == 4) {
					int i_2030_ = class161_1973_.anInt1752 * 1048375491 - 1;
					int i_2031_ = aShort9237 - aShort9223;
					for (int i_2032_ = 0; i_2032_ < anInt9231; i_2032_++) {
						int i_2033_ = anIntArray9191[i_2032_] + i_1974_;
						int i_2034_ = anIntArray9161[i_2032_] + i_1976_;
						int i_2035_ = i_2033_ & i_2030_;
						int i_2036_ = i_2034_ & i_2030_;
						int i_2037_ = i_2033_ >> class161_1973_.anInt1753 * 1252000143;
						int i_2038_ = i_2034_ >> class161_1973_.anInt1753 * 1252000143;
						int i_2039_ = (((is_1981_[i_2037_][i_2038_] * (class161_1973_.anInt1752 * 1048375491 - i_2035_)) + is_1981_[i_2037_ + 1][i_2038_] * i_2035_) >> class161_1973_.anInt1753 * 1252000143);
						int i_2040_ = (((is_1981_[i_2037_][i_2038_ + 1] * (class161_1973_.anInt1752 * 1048375491 - i_2035_)) + is_1981_[i_2037_ + 1][i_2038_ + 1] * i_2035_) >> class161_1973_.anInt1753 * 1252000143);
						int i_2041_ = (i_2039_ * (class161_1973_.anInt1752 * 1048375491 - i_2036_) + i_2040_ * i_2036_ >> class161_1973_.anInt1753 * 1252000143);
						anIntArray9184[i_2032_] = (anIntArray9184[i_2032_] + (i_2041_ - i_1975_) + i_2031_);
					}
					for (int i_2042_ = anInt9231; i_2042_ < anInt9177; i_2042_++) {
						int i_2043_ = anIntArray9191[i_2042_] + i_1974_;
						int i_2044_ = anIntArray9161[i_2042_] + i_1976_;
						int i_2045_ = i_2043_ & i_2030_;
						int i_2046_ = i_2044_ & i_2030_;
						int i_2047_ = i_2043_ >> class161_1973_.anInt1753 * 1252000143;
						int i_2048_ = i_2044_ >> class161_1973_.anInt1753 * 1252000143;
						if (i_2047_ >= 0 && (i_2047_ < class161_1973_.anInt1750 * 1210322533 - 1) && i_2048_ >= 0 && (i_2048_ < class161_1973_.anInt1751 * -533476177 - 1)) {
							int i_2049_ = (((is_1981_[i_2047_][i_2048_] * (class161_1973_.anInt1752 * 1048375491 - i_2045_)) + is_1981_[i_2047_ + 1][i_2048_] * i_2045_) >> class161_1973_.anInt1753 * 1252000143);
							int i_2050_ = (((is_1981_[i_2047_][i_2048_ + 1] * (class161_1973_.anInt1752 * 1048375491 - i_2045_)) + (is_1981_[i_2047_ + 1][i_2048_ + 1] * i_2045_)) >> class161_1973_.anInt1753 * 1252000143);
							int i_2051_ = ((i_2049_ * (class161_1973_.anInt1752 * 1048375491 - i_2046_)) + i_2050_ * i_2046_ >> class161_1973_.anInt1753 * 1252000143);
							anIntArray9184[i_2042_] = (anIntArray9184[i_2042_] + (i_2051_ - i_1975_) + i_2031_);
						}
					}
				} else if (i == 5) {
					int i_2052_ = class161_1973_.anInt1752 * 1048375491 - 1;
					int i_2053_ = aShort9237 - aShort9223;
					for (int i_2054_ = 0; i_2054_ < anInt9231; i_2054_++) {
						int i_2055_ = anIntArray9191[i_2054_] + i_1974_;
						int i_2056_ = anIntArray9161[i_2054_] + i_1976_;
						int i_2057_ = i_2055_ & i_2052_;
						int i_2058_ = i_2056_ & i_2052_;
						int i_2059_ = i_2055_ >> class161.anInt1753 * 1252000143;
						int i_2060_ = i_2056_ >> class161.anInt1753 * 1252000143;
						int i_2061_ = (((is[i_2059_][i_2060_] * (class161.anInt1752 * 1048375491 - i_2057_)) + is[i_2059_ + 1][i_2060_] * i_2057_) >> class161.anInt1753 * 1252000143);
						int i_2062_ = (((is[i_2059_][i_2060_ + 1] * (class161.anInt1752 * 1048375491 - i_2057_)) + is[i_2059_ + 1][i_2060_ + 1] * i_2057_) >> class161.anInt1753 * 1252000143);
						int i_2063_ = (i_2061_ * (class161.anInt1752 * 1048375491 - i_2058_) + i_2062_ * i_2058_ >> class161.anInt1753 * 1252000143);
						i_2061_ = (((is_1981_[i_2059_][i_2060_] * (class161_1973_.anInt1752 * 1048375491 - i_2057_)) + is_1981_[i_2059_ + 1][i_2060_] * i_2057_) >> class161_1973_.anInt1753 * 1252000143);
						i_2062_ = (((is_1981_[i_2059_][i_2060_ + 1] * (class161_1973_.anInt1752 * 1048375491 - i_2057_)) + is_1981_[i_2059_ + 1][i_2060_ + 1] * i_2057_) >> class161_1973_.anInt1753 * 1252000143);
						int i_2064_ = (i_2061_ * (class161_1973_.anInt1752 * 1048375491 - i_2058_) + i_2062_ * i_2058_ >> class161_1973_.anInt1753 * 1252000143);
						int i_2065_ = i_2063_ - i_2064_ - i_1972_;
						anIntArray9184[i_2054_] = ((anIntArray9184[i_2054_] << 8) / i_2053_ * i_2065_ >> 8) - (i_1975_ - i_2063_);
					}
					for (int i_2066_ = anInt9231; i_2066_ < anInt9177; i_2066_++) {
						int i_2067_ = anIntArray9191[i_2066_] + i_1974_;
						int i_2068_ = anIntArray9161[i_2066_] + i_1976_;
						int i_2069_ = i_2067_ & i_2052_;
						int i_2070_ = i_2068_ & i_2052_;
						int i_2071_ = i_2067_ >> class161.anInt1753 * 1252000143;
						int i_2072_ = i_2068_ >> class161.anInt1753 * 1252000143;
						if (i_2071_ >= 0 && i_2071_ < class161.anInt1750 * 1210322533 - 1 && (i_2071_ < class161_1973_.anInt1750 * 1210322533 - 1) && i_2072_ >= 0 && i_2072_ < class161.anInt1751 * -533476177 - 1 && (i_2072_ < class161_1973_.anInt1751 * -533476177 - 1)) {
							int i_2073_ = (((is[i_2071_][i_2072_] * (class161.anInt1752 * 1048375491 - i_2069_)) + is[i_2071_ + 1][i_2072_] * i_2069_) >> class161.anInt1753 * 1252000143);
							int i_2074_ = (((is[i_2071_][i_2072_ + 1] * (class161.anInt1752 * 1048375491 - i_2069_)) + is[i_2071_ + 1][i_2072_ + 1] * i_2069_) >> class161.anInt1753 * 1252000143);
							int i_2075_ = (i_2073_ * (class161.anInt1752 * 1048375491 - i_2070_) + i_2074_ * i_2070_ >> class161.anInt1753 * 1252000143);
							i_2073_ = (((is_1981_[i_2071_][i_2072_] * (class161_1973_.anInt1752 * 1048375491 - i_2069_)) + is_1981_[i_2071_ + 1][i_2072_] * i_2069_) >> class161_1973_.anInt1753 * 1252000143);
							i_2074_ = (((is_1981_[i_2071_][i_2072_ + 1] * (class161_1973_.anInt1752 * 1048375491 - i_2069_)) + (is_1981_[i_2071_ + 1][i_2072_ + 1] * i_2069_)) >> class161_1973_.anInt1753 * 1252000143);
							int i_2076_ = ((i_2073_ * (class161_1973_.anInt1752 * 1048375491 - i_2070_)) + i_2074_ * i_2070_ >> class161_1973_.anInt1753 * 1252000143);
							int i_2077_ = i_2075_ - i_2076_ - i_1972_;
							anIntArray9184[i_2066_] = (((anIntArray9184[i_2066_] << 8) / i_2053_ * i_2077_) >> 8) - (i_1975_ - i_2075_);
						}
					}
				}
				aBool9221 = false;
			}
		}
	}

	public boolean method3012() {
		return aBool9232;
	}

	boolean method14705(int i, int i_2078_, float f, float f_2079_, float f_2080_, float f_2081_, float f_2082_, float f_2083_) {
		if ((float) i_2078_ < f && (float) i_2078_ < f_2079_ && (float) i_2078_ < f_2080_)
			return false;
		if ((float) i_2078_ > f && (float) i_2078_ > f_2079_ && (float) i_2078_ > f_2080_)
			return false;
		if ((float) i < f_2081_ && (float) i < f_2082_ && (float) i < f_2083_)
			return false;
		if ((float) i > f_2081_ && (float) i > f_2082_ && (float) i > f_2083_)
			return false;
		return true;
	}

	boolean method14706(int i, int i_2084_, float f, float f_2085_, float f_2086_, float f_2087_, float f_2088_, float f_2089_) {
		if ((float) i_2084_ < f && (float) i_2084_ < f_2085_ && (float) i_2084_ < f_2086_)
			return false;
		if ((float) i_2084_ > f && (float) i_2084_ > f_2085_ && (float) i_2084_ > f_2086_)
			return false;
		if ((float) i < f_2087_ && (float) i < f_2088_ && (float) i < f_2089_)
			return false;
		if ((float) i > f_2087_ && (float) i > f_2088_ && (float) i > f_2089_)
			return false;
		return true;
	}

	boolean method3042() {
		if (anIntArrayArray9178 == null)
			return false;
		anInt9247 = 0;
		anInt9212 = 0;
		anInt9224 = 0;
		return true;
	}

	void method2956(int i, int[] is, int i_2090_, int i_2091_, int i_2092_, boolean bool, int i_2093_, int[] is_2094_) {
		int i_2095_ = is.length;
		if (i == 0) {
			i_2090_ <<= 4;
			i_2091_ <<= 4;
			i_2092_ <<= 4;
			if (!aBool9210) {
				for (int i_2096_ = 0; i_2096_ < anInt9177; i_2096_++) {
					anIntArray9191[i_2096_] <<= 4;
					anIntArray9184[i_2096_] <<= 4;
					anIntArray9161[i_2096_] <<= 4;
				}
				aBool9210 = true;
			}
			int i_2097_ = 0;
			anInt9247 = 0;
			anInt9212 = 0;
			anInt9224 = 0;
			for (int i_2098_ = 0; i_2098_ < i_2095_; i_2098_++) {
				int i_2099_ = is[i_2098_];
				if (i_2099_ < anIntArrayArray9178.length) {
					int[] is_2100_ = anIntArrayArray9178[i_2099_];
					for (int i_2101_ = 0; i_2101_ < is_2100_.length; i_2101_++) {
						int i_2102_ = is_2100_[i_2101_];
						if (aShortArray9227 == null || (i_2093_ & aShortArray9227[i_2102_]) != 0) {
							anInt9247 += anIntArray9191[i_2102_];
							anInt9212 += anIntArray9184[i_2102_];
							anInt9224 += anIntArray9161[i_2102_];
							i_2097_++;
						}
					}
				}
			}
			if (i_2097_ > 0) {
				anInt9247 = anInt9247 / i_2097_ + i_2090_;
				anInt9212 = anInt9212 / i_2097_ + i_2091_;
				anInt9224 = anInt9224 / i_2097_ + i_2092_;
				aBool9214 = true;
			} else {
				anInt9247 = i_2090_;
				anInt9212 = i_2091_;
				anInt9224 = i_2092_;
			}
		} else if (i == 1) {
			if (is_2094_ != null) {
				int i_2103_ = ((is_2094_[0] * i_2090_ + is_2094_[1] * i_2091_ + is_2094_[2] * i_2092_ + 8192) >> 14);
				int i_2104_ = ((is_2094_[3] * i_2090_ + is_2094_[4] * i_2091_ + is_2094_[5] * i_2092_ + 8192) >> 14);
				int i_2105_ = ((is_2094_[6] * i_2090_ + is_2094_[7] * i_2091_ + is_2094_[8] * i_2092_ + 8192) >> 14);
				i_2090_ = i_2103_;
				i_2091_ = i_2104_;
				i_2092_ = i_2105_;
			}
			i_2090_ <<= 4;
			i_2091_ <<= 4;
			i_2092_ <<= 4;
			if (!aBool9210) {
				for (int i_2106_ = 0; i_2106_ < anInt9177; i_2106_++) {
					anIntArray9191[i_2106_] <<= 4;
					anIntArray9184[i_2106_] <<= 4;
					anIntArray9161[i_2106_] <<= 4;
				}
				aBool9210 = true;
			}
			for (int i_2107_ = 0; i_2107_ < i_2095_; i_2107_++) {
				int i_2108_ = is[i_2107_];
				if (i_2108_ < anIntArrayArray9178.length) {
					int[] is_2109_ = anIntArrayArray9178[i_2108_];
					for (int i_2110_ = 0; i_2110_ < is_2109_.length; i_2110_++) {
						int i_2111_ = is_2109_[i_2110_];
						if (aShortArray9227 == null || (i_2093_ & aShortArray9227[i_2111_]) != 0) {
							anIntArray9191[i_2111_] += i_2090_;
							anIntArray9184[i_2111_] += i_2091_;
							anIntArray9161[i_2111_] += i_2092_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_2094_ != null) {
				if (!aBool9210) {
					for (int i_2112_ = 0; i_2112_ < anInt9177; i_2112_++) {
						anIntArray9191[i_2112_] <<= 4;
						anIntArray9184[i_2112_] <<= 4;
						anIntArray9161[i_2112_] <<= 4;
					}
					aBool9210 = true;
				}
				int i_2113_ = is_2094_[9] << 4;
				int i_2114_ = is_2094_[10] << 4;
				int i_2115_ = is_2094_[11] << 4;
				int i_2116_ = is_2094_[12] << 4;
				int i_2117_ = is_2094_[13] << 4;
				int i_2118_ = is_2094_[14] << 4;
				if (aBool9214) {
					int i_2119_ = ((is_2094_[0] * anInt9247 + is_2094_[3] * anInt9212 + is_2094_[6] * anInt9224 + 8192) >> 14);
					int i_2120_ = ((is_2094_[1] * anInt9247 + is_2094_[4] * anInt9212 + is_2094_[7] * anInt9224 + 8192) >> 14);
					int i_2121_ = ((is_2094_[2] * anInt9247 + is_2094_[5] * anInt9212 + is_2094_[8] * anInt9224 + 8192) >> 14);
					i_2119_ += i_2116_;
					i_2120_ += i_2117_;
					i_2121_ += i_2118_;
					anInt9247 = i_2119_;
					anInt9212 = i_2120_;
					anInt9224 = i_2121_;
					aBool9214 = false;
				}
				int[] is_2122_ = new int[9];
				int i_2123_ = Class428.anIntArray4819[i_2090_];
				int i_2124_ = Class428.anIntArray4825[i_2090_];
				int i_2125_ = Class428.anIntArray4819[i_2091_];
				int i_2126_ = Class428.anIntArray4825[i_2091_];
				int i_2127_ = Class428.anIntArray4819[i_2092_];
				int i_2128_ = Class428.anIntArray4825[i_2092_];
				int i_2129_ = i_2124_ * i_2127_ + 8192 >> 14;
				int i_2130_ = i_2124_ * i_2128_ + 8192 >> 14;
				is_2122_[0] = i_2125_ * i_2127_ + i_2126_ * i_2130_ + 8192 >> 14;
				is_2122_[1] = -i_2125_ * i_2128_ + i_2126_ * i_2129_ + 8192 >> 14;
				is_2122_[2] = i_2126_ * i_2123_ + 8192 >> 14;
				is_2122_[3] = i_2123_ * i_2128_ + 8192 >> 14;
				is_2122_[4] = i_2123_ * i_2127_ + 8192 >> 14;
				is_2122_[5] = -i_2124_;
				is_2122_[6] = -i_2126_ * i_2127_ + i_2125_ * i_2130_ + 8192 >> 14;
				is_2122_[7] = i_2126_ * i_2128_ + i_2125_ * i_2129_ + 8192 >> 14;
				is_2122_[8] = i_2125_ * i_2123_ + 8192 >> 14;
				int i_2131_ = ((is_2122_[0] * -anInt9247 + is_2122_[1] * -anInt9212 + is_2122_[2] * -anInt9224 + 8192) >> 14);
				int i_2132_ = ((is_2122_[3] * -anInt9247 + is_2122_[4] * -anInt9212 + is_2122_[5] * -anInt9224 + 8192) >> 14);
				int i_2133_ = ((is_2122_[6] * -anInt9247 + is_2122_[7] * -anInt9212 + is_2122_[8] * -anInt9224 + 8192) >> 14);
				int i_2134_ = i_2131_ + anInt9247;
				int i_2135_ = i_2132_ + anInt9212;
				int i_2136_ = i_2133_ + anInt9224;
				int[] is_2137_ = new int[9];
				for (int i_2138_ = 0; i_2138_ < 3; i_2138_++) {
					for (int i_2139_ = 0; i_2139_ < 3; i_2139_++) {
						int i_2140_ = 0;
						for (int i_2141_ = 0; i_2141_ < 3; i_2141_++)
							i_2140_ += (is_2122_[i_2138_ * 3 + i_2141_] * is_2094_[i_2139_ * 3 + i_2141_]);
						is_2137_[i_2138_ * 3 + i_2139_] = i_2140_ + 8192 >> 14;
					}
				}
				int i_2142_ = ((is_2122_[0] * i_2116_ + is_2122_[1] * i_2117_ + is_2122_[2] * i_2118_ + 8192) >> 14);
				int i_2143_ = ((is_2122_[3] * i_2116_ + is_2122_[4] * i_2117_ + is_2122_[5] * i_2118_ + 8192) >> 14);
				int i_2144_ = ((is_2122_[6] * i_2116_ + is_2122_[7] * i_2117_ + is_2122_[8] * i_2118_ + 8192) >> 14);
				i_2142_ += i_2134_;
				i_2143_ += i_2135_;
				i_2144_ += i_2136_;
				int[] is_2145_ = new int[9];
				for (int i_2146_ = 0; i_2146_ < 3; i_2146_++) {
					for (int i_2147_ = 0; i_2147_ < 3; i_2147_++) {
						int i_2148_ = 0;
						for (int i_2149_ = 0; i_2149_ < 3; i_2149_++)
							i_2148_ += (is_2094_[i_2146_ * 3 + i_2149_] * is_2137_[i_2147_ + i_2149_ * 3]);
						is_2145_[i_2146_ * 3 + i_2147_] = i_2148_ + 8192 >> 14;
					}
				}
				int i_2150_ = ((is_2094_[0] * i_2142_ + is_2094_[1] * i_2143_ + is_2094_[2] * i_2144_ + 8192) >> 14);
				int i_2151_ = ((is_2094_[3] * i_2142_ + is_2094_[4] * i_2143_ + is_2094_[5] * i_2144_ + 8192) >> 14);
				int i_2152_ = ((is_2094_[6] * i_2142_ + is_2094_[7] * i_2143_ + is_2094_[8] * i_2144_ + 8192) >> 14);
				i_2150_ += i_2113_;
				i_2151_ += i_2114_;
				i_2152_ += i_2115_;
				for (int i_2153_ = 0; i_2153_ < i_2095_; i_2153_++) {
					int i_2154_ = is[i_2153_];
					if (i_2154_ < anIntArrayArray9178.length) {
						int[] is_2155_ = anIntArrayArray9178[i_2154_];
						for (int i_2156_ = 0; i_2156_ < is_2155_.length; i_2156_++) {
							int i_2157_ = is_2155_[i_2156_];
							if (aShortArray9227 == null || (i_2093_ & aShortArray9227[i_2157_]) != 0) {
								int i_2158_ = ((is_2145_[0] * anIntArray9191[i_2157_] + is_2145_[1] * anIntArray9184[i_2157_] + is_2145_[2] * anIntArray9161[i_2157_] + 8192) >> 14);
								int i_2159_ = ((is_2145_[3] * anIntArray9191[i_2157_] + is_2145_[4] * anIntArray9184[i_2157_] + is_2145_[5] * anIntArray9161[i_2157_] + 8192) >> 14);
								int i_2160_ = ((is_2145_[6] * anIntArray9191[i_2157_] + is_2145_[7] * anIntArray9184[i_2157_] + is_2145_[8] * anIntArray9161[i_2157_] + 8192) >> 14);
								i_2158_ += i_2150_;
								i_2159_ += i_2151_;
								i_2160_ += i_2152_;
								anIntArray9191[i_2157_] = i_2158_;
								anIntArray9184[i_2157_] = i_2159_;
								anIntArray9161[i_2157_] = i_2160_;
							}
						}
					}
				}
			} else {
				for (int i_2161_ = 0; i_2161_ < i_2095_; i_2161_++) {
					int i_2162_ = is[i_2161_];
					if (i_2162_ < anIntArrayArray9178.length) {
						int[] is_2163_ = anIntArrayArray9178[i_2162_];
						for (int i_2164_ = 0; i_2164_ < is_2163_.length; i_2164_++) {
							int i_2165_ = is_2163_[i_2164_];
							if (aShortArray9227 == null || (i_2093_ & aShortArray9227[i_2165_]) != 0) {
								anIntArray9191[i_2165_] -= anInt9247;
								anIntArray9184[i_2165_] -= anInt9212;
								anIntArray9161[i_2165_] -= anInt9224;
								if (i_2092_ != 0) {
									int i_2166_ = Class428.anIntArray4825[i_2092_];
									int i_2167_ = Class428.anIntArray4819[i_2092_];
									int i_2168_ = ((anIntArray9184[i_2165_] * i_2166_ + anIntArray9191[i_2165_] * i_2167_ + 16383) >> 14);
									anIntArray9184[i_2165_] = (anIntArray9184[i_2165_] * i_2167_ - anIntArray9191[i_2165_] * i_2166_ + 16383) >> 14;
									anIntArray9191[i_2165_] = i_2168_;
								}
								if (i_2090_ != 0) {
									int i_2169_ = Class428.anIntArray4825[i_2090_];
									int i_2170_ = Class428.anIntArray4819[i_2090_];
									int i_2171_ = ((anIntArray9184[i_2165_] * i_2170_ - anIntArray9161[i_2165_] * i_2169_ + 16383) >> 14);
									anIntArray9161[i_2165_] = (anIntArray9184[i_2165_] * i_2169_ + anIntArray9161[i_2165_] * i_2170_ + 16383) >> 14;
									anIntArray9184[i_2165_] = i_2171_;
								}
								if (i_2091_ != 0) {
									int i_2172_ = Class428.anIntArray4825[i_2091_];
									int i_2173_ = Class428.anIntArray4819[i_2091_];
									int i_2174_ = ((anIntArray9161[i_2165_] * i_2172_ + anIntArray9191[i_2165_] * i_2173_ + 16383) >> 14);
									anIntArray9161[i_2165_] = (anIntArray9161[i_2165_] * i_2173_ - anIntArray9191[i_2165_] * i_2172_ + 16383) >> 14;
									anIntArray9191[i_2165_] = i_2174_;
								}
								anIntArray9191[i_2165_] += anInt9247;
								anIntArray9184[i_2165_] += anInt9212;
								anIntArray9161[i_2165_] += anInt9224;
							}
						}
					}
				}
			}
		} else if (i == 3) {
			if (is_2094_ != null) {
				if (!aBool9210) {
					for (int i_2175_ = 0; i_2175_ < anInt9177; i_2175_++) {
						anIntArray9191[i_2175_] <<= 4;
						anIntArray9184[i_2175_] <<= 4;
						anIntArray9161[i_2175_] <<= 4;
					}
					aBool9210 = true;
				}
				int i_2176_ = is_2094_[9] << 4;
				int i_2177_ = is_2094_[10] << 4;
				int i_2178_ = is_2094_[11] << 4;
				int i_2179_ = is_2094_[12] << 4;
				int i_2180_ = is_2094_[13] << 4;
				int i_2181_ = is_2094_[14] << 4;
				if (aBool9214) {
					int i_2182_ = ((is_2094_[0] * anInt9247 + is_2094_[3] * anInt9212 + is_2094_[6] * anInt9224 + 8192) >> 14);
					int i_2183_ = ((is_2094_[1] * anInt9247 + is_2094_[4] * anInt9212 + is_2094_[7] * anInt9224 + 8192) >> 14);
					int i_2184_ = ((is_2094_[2] * anInt9247 + is_2094_[5] * anInt9212 + is_2094_[8] * anInt9224 + 8192) >> 14);
					i_2182_ += i_2179_;
					i_2183_ += i_2180_;
					i_2184_ += i_2181_;
					anInt9247 = i_2182_;
					anInt9212 = i_2183_;
					anInt9224 = i_2184_;
					aBool9214 = false;
				}
				int i_2185_ = i_2090_ << 15 >> 7;
				int i_2186_ = i_2091_ << 15 >> 7;
				int i_2187_ = i_2092_ << 15 >> 7;
				int i_2188_ = i_2185_ * -anInt9247 + 8192 >> 14;
				int i_2189_ = i_2186_ * -anInt9212 + 8192 >> 14;
				int i_2190_ = i_2187_ * -anInt9224 + 8192 >> 14;
				int i_2191_ = i_2188_ + anInt9247;
				int i_2192_ = i_2189_ + anInt9212;
				int i_2193_ = i_2190_ + anInt9224;
				int[] is_2194_ = new int[9];
				is_2194_[0] = i_2185_ * is_2094_[0] + 8192 >> 14;
				is_2194_[1] = i_2185_ * is_2094_[3] + 8192 >> 14;
				is_2194_[2] = i_2185_ * is_2094_[6] + 8192 >> 14;
				is_2194_[3] = i_2186_ * is_2094_[1] + 8192 >> 14;
				is_2194_[4] = i_2186_ * is_2094_[4] + 8192 >> 14;
				is_2194_[5] = i_2186_ * is_2094_[7] + 8192 >> 14;
				is_2194_[6] = i_2187_ * is_2094_[2] + 8192 >> 14;
				is_2194_[7] = i_2187_ * is_2094_[5] + 8192 >> 14;
				is_2194_[8] = i_2187_ * is_2094_[8] + 8192 >> 14;
				int i_2195_ = i_2185_ * i_2179_ + 8192 >> 14;
				int i_2196_ = i_2186_ * i_2180_ + 8192 >> 14;
				int i_2197_ = i_2187_ * i_2181_ + 8192 >> 14;
				i_2195_ += i_2191_;
				i_2196_ += i_2192_;
				i_2197_ += i_2193_;
				int[] is_2198_ = new int[9];
				for (int i_2199_ = 0; i_2199_ < 3; i_2199_++) {
					for (int i_2200_ = 0; i_2200_ < 3; i_2200_++) {
						int i_2201_ = 0;
						for (int i_2202_ = 0; i_2202_ < 3; i_2202_++)
							i_2201_ += (is_2094_[i_2199_ * 3 + i_2202_] * is_2194_[i_2200_ + i_2202_ * 3]);
						is_2198_[i_2199_ * 3 + i_2200_] = i_2201_ + 8192 >> 14;
					}
				}
				int i_2203_ = ((is_2094_[0] * i_2195_ + is_2094_[1] * i_2196_ + is_2094_[2] * i_2197_ + 8192) >> 14);
				int i_2204_ = ((is_2094_[3] * i_2195_ + is_2094_[4] * i_2196_ + is_2094_[5] * i_2197_ + 8192) >> 14);
				int i_2205_ = ((is_2094_[6] * i_2195_ + is_2094_[7] * i_2196_ + is_2094_[8] * i_2197_ + 8192) >> 14);
				i_2203_ += i_2176_;
				i_2204_ += i_2177_;
				i_2205_ += i_2178_;
				for (int i_2206_ = 0; i_2206_ < i_2095_; i_2206_++) {
					int i_2207_ = is[i_2206_];
					if (i_2207_ < anIntArrayArray9178.length) {
						int[] is_2208_ = anIntArrayArray9178[i_2207_];
						for (int i_2209_ = 0; i_2209_ < is_2208_.length; i_2209_++) {
							int i_2210_ = is_2208_[i_2209_];
							if (aShortArray9227 == null || (i_2093_ & aShortArray9227[i_2210_]) != 0) {
								int i_2211_ = ((is_2198_[0] * anIntArray9191[i_2210_] + is_2198_[1] * anIntArray9184[i_2210_] + is_2198_[2] * anIntArray9161[i_2210_] + 8192) >> 14);
								int i_2212_ = ((is_2198_[3] * anIntArray9191[i_2210_] + is_2198_[4] * anIntArray9184[i_2210_] + is_2198_[5] * anIntArray9161[i_2210_] + 8192) >> 14);
								int i_2213_ = ((is_2198_[6] * anIntArray9191[i_2210_] + is_2198_[7] * anIntArray9184[i_2210_] + is_2198_[8] * anIntArray9161[i_2210_] + 8192) >> 14);
								i_2211_ += i_2203_;
								i_2212_ += i_2204_;
								i_2213_ += i_2205_;
								anIntArray9191[i_2210_] = i_2211_;
								anIntArray9184[i_2210_] = i_2212_;
								anIntArray9161[i_2210_] = i_2213_;
							}
						}
					}
				}
			} else {
				for (int i_2214_ = 0; i_2214_ < i_2095_; i_2214_++) {
					int i_2215_ = is[i_2214_];
					if (i_2215_ < anIntArrayArray9178.length) {
						int[] is_2216_ = anIntArrayArray9178[i_2215_];
						for (int i_2217_ = 0; i_2217_ < is_2216_.length; i_2217_++) {
							int i_2218_ = is_2216_[i_2217_];
							if (aShortArray9227 == null || (i_2093_ & aShortArray9227[i_2218_]) != 0) {
								anIntArray9191[i_2218_] -= anInt9247;
								anIntArray9184[i_2218_] -= anInt9212;
								anIntArray9161[i_2218_] -= anInt9224;
								anIntArray9191[i_2218_] = anIntArray9191[i_2218_] * i_2090_ / 128;
								anIntArray9184[i_2218_] = anIntArray9184[i_2218_] * i_2091_ / 128;
								anIntArray9161[i_2218_] = anIntArray9161[i_2218_] * i_2092_ / 128;
								anIntArray9191[i_2218_] += anInt9247;
								anIntArray9184[i_2218_] += anInt9212;
								anIntArray9161[i_2218_] += anInt9224;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9208 != null && aByteArray9202 != null) {
				for (int i_2219_ = 0; i_2219_ < i_2095_; i_2219_++) {
					int i_2220_ = is[i_2219_];
					if (i_2220_ < anIntArrayArray9208.length) {
						int[] is_2221_ = anIntArrayArray9208[i_2220_];
						for (int i_2222_ = 0; i_2222_ < is_2221_.length; i_2222_++) {
							int i_2223_ = is_2221_[i_2222_];
							if (aShortArray9205 == null || (i_2093_ & aShortArray9205[i_2223_]) != 0) {
								int i_2224_ = ((aByteArray9202[i_2223_] & 0xff) + i_2090_ * 8);
								if (i_2224_ < 0)
									i_2224_ = 0;
								else if (i_2224_ > 255)
									i_2224_ = 255;
								aByteArray9202[i_2223_] = (byte) i_2224_;
							}
						}
					}
				}
				if (aClass116Array9218 != null) {
					for (int i_2225_ = 0; i_2225_ < anInt9217; i_2225_++) {
						Class116 class116 = aClass116Array9218[i_2225_];
						Class108 class108 = aClass108Array9211[i_2225_];
						class108.anInt1351 = (class108.anInt1351 * 328110239 & 0xffffff | 255 - ((aByteArray9202[class116.anInt1421 * 1723945109]) & 0xff) << 24) * 120490847;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9208 != null) {
				for (int i_2226_ = 0; i_2226_ < i_2095_; i_2226_++) {
					int i_2227_ = is[i_2226_];
					if (i_2227_ < anIntArrayArray9208.length) {
						int[] is_2228_ = anIntArrayArray9208[i_2227_];
						for (int i_2229_ = 0; i_2229_ < is_2228_.length; i_2229_++) {
							int i_2230_ = is_2228_[i_2229_];
							if (aShortArray9205 == null || (i_2093_ & aShortArray9205[i_2230_]) != 0) {
								int i_2231_ = aShortArray9193[i_2230_] & 0xffff;
								int i_2232_ = i_2231_ >> 10 & 0x3f;
								int i_2233_ = i_2231_ >> 7 & 0x7;
								int i_2234_ = i_2231_ & 0x7f;
								i_2232_ = i_2232_ + i_2090_ & 0x3f;
								i_2233_ += i_2091_;
								if (i_2233_ < 0)
									i_2233_ = 0;
								else if (i_2233_ > 7)
									i_2233_ = 7;
								i_2234_ += i_2092_;
								if (i_2234_ < 0)
									i_2234_ = 0;
								else if (i_2234_ > 127)
									i_2234_ = 127;
								aShortArray9193[i_2230_] = (short) (i_2232_ << 10 | i_2233_ << 7 | i_2234_);
							}
						}
						aBool9209 = true;
					}
				}
				if (aClass116Array9218 != null) {
					for (int i_2235_ = 0; i_2235_ < anInt9217; i_2235_++) {
						Class116 class116 = aClass116Array9218[i_2235_];
						Class108 class108 = aClass108Array9211[i_2235_];
						class108.anInt1351 = (class108.anInt1351 * 328110239 & ~0xffffff | ((Class656.anIntArray8393[Class453.method7333(((aShortArray9193[(class116.anInt1421 * 1723945109)]) & 0xffff), (byte) 10) & 0xffff]) & 0xffffff)) * 120490847;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9220 != null) {
				for (int i_2236_ = 0; i_2236_ < i_2095_; i_2236_++) {
					int i_2237_ = is[i_2236_];
					if (i_2237_ < anIntArrayArray9220.length) {
						int[] is_2238_ = anIntArrayArray9220[i_2237_];
						for (int i_2239_ = 0; i_2239_ < is_2238_.length; i_2239_++) {
							Class108 class108 = aClass108Array9211[is_2238_[i_2239_]];
							class108.anInt1346 += i_2090_ * -653278629;
							class108.anInt1350 += i_2091_ * -1290559937;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9220 != null) {
				for (int i_2240_ = 0; i_2240_ < i_2095_; i_2240_++) {
					int i_2241_ = is[i_2240_];
					if (i_2241_ < anIntArrayArray9220.length) {
						int[] is_2242_ = anIntArrayArray9220[i_2241_];
						for (int i_2243_ = 0; i_2243_ < is_2242_.length; i_2243_++) {
							Class108 class108 = aClass108Array9211[is_2242_[i_2243_]];
							class108.aFloat1347 = (class108.aFloat1347 * (float) i_2090_ / 128.0F);
							class108.aFloat1353 = (class108.aFloat1353 * (float) i_2091_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9220 != null) {
				for (int i_2244_ = 0; i_2244_ < i_2095_; i_2244_++) {
					int i_2245_ = is[i_2244_];
					if (i_2245_ < anIntArrayArray9220.length) {
						int[] is_2246_ = anIntArrayArray9220[i_2245_];
						for (int i_2247_ = 0; i_2247_ < is_2246_.length; i_2247_++) {
							Class108 class108 = aClass108Array9211[is_2246_[i_2247_]];
							class108.anInt1349 = (class108.anInt1349 * 1169382623 + i_2090_ & 0x3fff) * -1991287009;
						}
					}
				}
			}
		}
	}

	public void method2871(Class432 class432) {
		method14631(aClass180_Sub1_9171.method14835(Thread.currentThread()));
		Class427 class427 = aClass101_9163.aClass427_1188;
		class427.method6784(class432);
		if (aClass167Array9215 != null) {
			for (int i = 0; i < aClass167Array9215.length; i++) {
				Class167 class167 = aClass167Array9215[i];
				Class167 class167_2248_ = class167;
				if (class167.aClass167_1849 != null)
					class167_2248_ = class167.aClass167_1849;
				class167_2248_.anInt1855 = (int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) (anIntArray9191[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[4] * (float) anIntArray9184[(class167.anInt1851 * -18705907)]) + (class427.aFloatArray4807[8] * (float) (anIntArray9161[(class167.anInt1851 * -18705907)])))) * 1542395015;
				class167_2248_.anInt1856 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) (anIntArray9191[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[5] * (float) (anIntArray9184[(class167.anInt1851 * -18705907)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9161[(class167.anInt1851 * -18705907)])))) * -1886500927);
				class167_2248_.anInt1860 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) (anIntArray9191[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[6] * (float) (anIntArray9184[(class167.anInt1851 * -18705907)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9161[(class167.anInt1851 * -18705907)])))) * -1731268533);
				class167_2248_.anInt1858 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9191[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9184[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9161[(class167.anInt1852 * -1573542389)])))) * -2034723417);
				class167_2248_.anInt1859 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9191[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9184[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9161[(class167.anInt1852 * -1573542389)])))) * -481732551);
				class167_2248_.anInt1862 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) anIntArray9191[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[6] * (float) (anIntArray9184[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9161[(class167.anInt1852 * -1573542389)])))) * -980787877);
				class167_2248_.anInt1857 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9191[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9184[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9161[(class167.anInt1853 * -2116684303)])))) * -1482367683);
				class167_2248_.anInt1850 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9191[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9184[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9161[(class167.anInt1853 * -2116684303)])))) * 1240185219);
				class167_2248_.anInt1863 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) anIntArray9191[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[6] * (float) (anIntArray9184[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9161[(class167.anInt1853 * -2116684303)])))) * -857185851);
			}
		}
		if (aClass159Array9216 != null) {
			for (int i = 0; i < aClass159Array9216.length; i++) {
				Class159 class159 = aClass159Array9216[i];
				Class159 class159_2249_ = class159;
				if (class159.aClass159_1739 != null)
					class159_2249_ = class159.aClass159_1739;
				if (class159.aClass427_1738 != null)
					class159.aClass427_1738.method6750(class427);
				else
					class159.aClass427_1738 = new Class427(class427);
				class159_2249_.anInt1744 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9191[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9184[(class159.anInt1740 * -449756941)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9161[(class159.anInt1740 * -449756941)])))) * -306739393);
				class159_2249_.anInt1742 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9191[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9184[(class159.anInt1740 * -449756941)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9161[(class159.anInt1740 * -449756941)])))) * -1995176663);
				class159_2249_.anInt1743 = (int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) (anIntArray9191[class159.anInt1740 * -449756941])) + (class427.aFloatArray4807[6] * (float) anIntArray9184[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[10] * (float) (anIntArray9161[(class159.anInt1740 * -449756941)])))) * 76591605;
			}
		}
	}

	void method14707(boolean bool) {
		if (anInt9246 == 1)
			method14656();
		else if (anInt9246 == 2) {
			if ((anInt9174 & 0x97098) == 0 && aFloatArrayArray9190 == null)
				aShortArray9193 = null;
			if (bool)
				aByteArray9200 = null;
		} else {
			method14632();
			int i = aClass180_Sub1_9171.anInt9413 * -1353141313;
			int i_2250_ = aClass180_Sub1_9171.anInt9409 * 748091021;
			int i_2251_ = aClass180_Sub1_9171.anInt9394 * -1663247975;
			int i_2252_ = aClass180_Sub1_9171.anInt9399 * -1757876199 >> 8;
			int i_2253_ = 0;
			int i_2254_ = 0;
			if (anInt9179 != 0) {
				i_2253_ = aClass180_Sub1_9171.anInt9397 * 1789958400 / anInt9179;
				i_2254_ = aClass180_Sub1_9171.anInt9408 * -1863567104 / anInt9179;
			}
			if (anIntArray9192 == null) {
				anIntArray9192 = new int[anInt9185];
				anIntArray9180 = new int[anInt9185];
				anIntArray9194 = new int[anInt9185];
			}
			for (int i_2255_ = 0; i_2255_ < anInt9185; i_2255_++) {
				byte i_2256_;
				if (aByteArray9200 == null)
					i_2256_ = (byte) 0;
				else
					i_2256_ = aByteArray9200[i_2255_];
				byte i_2257_;
				if (aByteArray9202 == null)
					i_2257_ = (byte) 0;
				else
					i_2257_ = aByteArray9202[i_2255_];
				short i_2258_;
				if (aShortArray9162 == null)
					i_2258_ = (short) -1;
				else
					i_2258_ = aShortArray9162[i_2255_];
				if (i_2257_ == -2)
					i_2256_ = (byte) 3;
				if (i_2257_ == -1)
					i_2256_ = (byte) 2;
				if (i_2258_ == -1) {
					if (i_2256_ == 0) {
						int i_2259_ = aShortArray9193[i_2255_] & 0xffff;
						int i_2260_ = (i_2259_ & 0x7f) * anInt9175 >> 7;
						short i_2261_ = Class453.method7333(i_2259_ & ~0x7f | i_2260_, (byte) 10);
						Class114 class114;
						if (aClass114Array9203 != null && (aClass114Array9203[aShortArray9187[i_2255_]] != null))
							class114 = aClass114Array9203[aShortArray9187[i_2255_]];
						else
							class114 = aClass114Array9236[aShortArray9187[i_2255_]];
						int i_2262_ = (((i * class114.anInt1412 + i_2250_ * class114.anInt1411 + i_2251_ * class114.anInt1410) / class114.anInt1413) >> 16);
						int i_2263_ = i_2262_ > 256 ? i_2253_ : i_2254_;
						int i_2264_ = (i_2252_ >> 1) + (i_2263_ * i_2262_ >> 17);
						anIntArray9192[i_2255_] = i_2264_ << 17 | Class395.method6504(i_2261_, i_2264_, -501584282);
						if (aClass114Array9203 != null && (aClass114Array9203[aShortArray9188[i_2255_]] != null))
							class114 = aClass114Array9203[aShortArray9188[i_2255_]];
						else
							class114 = aClass114Array9236[aShortArray9188[i_2255_]];
						i_2262_ = ((i * class114.anInt1412 + i_2250_ * class114.anInt1411 + i_2251_ * class114.anInt1410) / class114.anInt1413) >> 16;
						i_2263_ = i_2262_ > 256 ? i_2253_ : i_2254_;
						i_2264_ = (i_2252_ >> 1) + (i_2263_ * i_2262_ >> 17);
						anIntArray9180[i_2255_] = i_2264_ << 17 | Class395.method6504(i_2261_, i_2264_, -501584282);
						if (aClass114Array9203 != null && (aClass114Array9203[aShortArray9189[i_2255_]] != null))
							class114 = aClass114Array9203[aShortArray9189[i_2255_]];
						else
							class114 = aClass114Array9236[aShortArray9189[i_2255_]];
						i_2262_ = ((i * class114.anInt1412 + i_2250_ * class114.anInt1411 + i_2251_ * class114.anInt1410) / class114.anInt1413) >> 16;
						i_2263_ = i_2262_ > 256 ? i_2253_ : i_2254_;
						i_2264_ = (i_2252_ >> 1) + (i_2263_ * i_2262_ >> 17);
						anIntArray9194[i_2255_] = i_2264_ << 17 | Class395.method6504(i_2261_, i_2264_, -501584282);
					} else if (i_2256_ == 1) {
						int i_2265_ = aShortArray9193[i_2255_] & 0xffff;
						int i_2266_ = (i_2265_ & 0x7f) * anInt9175 >> 7;
						short i_2267_ = Class453.method7333(i_2265_ & ~0x7f | i_2266_, (byte) 10);
						Class113 class113 = aClass113Array9199[i_2255_];
						int i_2268_ = ((i * class113.anInt1407 + i_2250_ * class113.anInt1408 + i_2251_ * class113.anInt1409) >> 16);
						int i_2269_ = i_2268_ > 256 ? i_2253_ : i_2254_;
						int i_2270_ = (i_2252_ >> 1) + (i_2269_ * i_2268_ >> 17);
						anIntArray9192[i_2255_] = i_2270_ << 17 | Class395.method6504(i_2267_, i_2270_, -501584282);
						anIntArray9194[i_2255_] = -1;
					} else if (i_2256_ == 3) {
						anIntArray9192[i_2255_] = 128;
						anIntArray9194[i_2255_] = -1;
					} else
						anIntArray9194[i_2255_] = -2;
				} else {
					int i_2271_ = aShortArray9193[i_2255_] & 0xffff;
					if (i_2256_ == 0) {
						Class114 class114;
						if (aClass114Array9203 != null && (aClass114Array9203[aShortArray9187[i_2255_]] != null))
							class114 = aClass114Array9203[aShortArray9187[i_2255_]];
						else
							class114 = aClass114Array9236[aShortArray9187[i_2255_]];
						int i_2272_ = (((i * class114.anInt1412 + i_2250_ * class114.anInt1411 + i_2251_ * class114.anInt1410) / class114.anInt1413) >> 16);
						int i_2273_ = i_2272_ > 256 ? i_2253_ : i_2254_;
						int i_2274_ = method14637((i_2252_ >> 2) + (i_2273_ * i_2272_ >> 18));
						anIntArray9192[i_2255_] = i_2274_ << 24 | method14635(i_2271_, i_2258_, i_2274_);
						if (aClass114Array9203 != null && (aClass114Array9203[aShortArray9188[i_2255_]] != null))
							class114 = aClass114Array9203[aShortArray9188[i_2255_]];
						else
							class114 = aClass114Array9236[aShortArray9188[i_2255_]];
						i_2272_ = ((i * class114.anInt1412 + i_2250_ * class114.anInt1411 + i_2251_ * class114.anInt1410) / class114.anInt1413) >> 16;
						i_2273_ = i_2272_ > 256 ? i_2253_ : i_2254_;
						i_2274_ = method14637((i_2252_ >> 2) + (i_2273_ * i_2272_ >> 18));
						anIntArray9180[i_2255_] = i_2274_ << 24 | method14635(i_2271_, i_2258_, i_2274_);
						if (aClass114Array9203 != null && (aClass114Array9203[aShortArray9189[i_2255_]] != null))
							class114 = aClass114Array9203[aShortArray9189[i_2255_]];
						else
							class114 = aClass114Array9236[aShortArray9189[i_2255_]];
						i_2272_ = ((i * class114.anInt1412 + i_2250_ * class114.anInt1411 + i_2251_ * class114.anInt1410) / class114.anInt1413) >> 16;
						i_2273_ = i_2272_ > 256 ? i_2253_ : i_2254_;
						i_2274_ = method14637((i_2252_ >> 2) + (i_2273_ * i_2272_ >> 18));
						anIntArray9194[i_2255_] = i_2274_ << 24 | method14635(i_2271_, i_2258_, i_2274_);
					} else if (i_2256_ == 1) {
						Class113 class113 = aClass113Array9199[i_2255_];
						int i_2275_ = ((i * class113.anInt1407 + i_2250_ * class113.anInt1408 + i_2251_ * class113.anInt1409) >> 16);
						int i_2276_ = i_2275_ > 256 ? i_2253_ : i_2254_;
						int i_2277_ = method14637((i_2252_ >> 2) + (i_2276_ * i_2275_ >> 18));
						anIntArray9192[i_2255_] = i_2277_ << 24 | method14635(i_2271_, i_2258_, i_2277_);
						anIntArray9194[i_2255_] = -1;
					} else
						anIntArray9194[i_2255_] = -2;
				}
			}
			aClass114Array9236 = null;
			aClass114Array9203 = null;
			aClass113Array9199 = null;
			if ((anInt9174 & 0x97098) == 0 && aFloatArrayArray9190 == null)
				aShortArray9193 = null;
			if (bool)
				aByteArray9200 = null;
			anInt9246 = 2;
		}
	}

	public Class527_Sub8_Sub8 method2964(Class527_Sub8_Sub8 class527_sub8_sub8) {
		return null;
	}

	public Class527_Sub8_Sub8 method2965(Class527_Sub8_Sub8 class527_sub8_sub8) {
		return null;
	}

	public Class527_Sub8_Sub8 method2966(Class527_Sub8_Sub8 class527_sub8_sub8) {
		return null;
	}

	void method14708() {
		if (!aBool9221) {
			int i = 0;
			int i_2278_ = 0;
			int i_2279_ = 32767;
			int i_2280_ = 32767;
			int i_2281_ = 32767;
			int i_2282_ = -32768;
			int i_2283_ = -32768;
			int i_2284_ = -32768;
			for (int i_2285_ = 0; i_2285_ < anInt9231; i_2285_++) {
				int i_2286_ = anIntArray9191[i_2285_];
				int i_2287_ = anIntArray9184[i_2285_];
				int i_2288_ = anIntArray9161[i_2285_];
				if (i_2286_ < i_2279_)
					i_2279_ = i_2286_;
				if (i_2286_ > i_2282_)
					i_2282_ = i_2286_;
				if (i_2287_ < i_2280_)
					i_2280_ = i_2287_;
				if (i_2287_ > i_2283_)
					i_2283_ = i_2287_;
				if (i_2288_ < i_2281_)
					i_2281_ = i_2288_;
				if (i_2288_ > i_2284_)
					i_2284_ = i_2288_;
				int i_2289_ = i_2286_ * i_2286_ + i_2288_ * i_2288_;
				if (i_2289_ > i)
					i = i_2289_;
				i_2289_ += i_2287_ * i_2287_;
				if (i_2289_ > i_2278_)
					i_2278_ = i_2289_;
			}
			aShort9226 = (short) i_2279_;
			aShort9173 = (short) i_2282_;
			aShort9223 = (short) i_2280_;
			aShort9237 = (short) i_2283_;
			aShort9228 = (short) i_2281_;
			aShort9229 = (short) i_2284_;
			aShort9196 = (short) (int) (Math.sqrt((double) i) + 0.99);
			aShort9222 = (short) (int) (Math.sqrt((double) i_2278_) + 0.99);
			aBool9221 = true;
		}
	}

	void method14709() {
		if (!aBool9221) {
			int i = 0;
			int i_2290_ = 0;
			int i_2291_ = 32767;
			int i_2292_ = 32767;
			int i_2293_ = 32767;
			int i_2294_ = -32768;
			int i_2295_ = -32768;
			int i_2296_ = -32768;
			for (int i_2297_ = 0; i_2297_ < anInt9231; i_2297_++) {
				int i_2298_ = anIntArray9191[i_2297_];
				int i_2299_ = anIntArray9184[i_2297_];
				int i_2300_ = anIntArray9161[i_2297_];
				if (i_2298_ < i_2291_)
					i_2291_ = i_2298_;
				if (i_2298_ > i_2294_)
					i_2294_ = i_2298_;
				if (i_2299_ < i_2292_)
					i_2292_ = i_2299_;
				if (i_2299_ > i_2295_)
					i_2295_ = i_2299_;
				if (i_2300_ < i_2293_)
					i_2293_ = i_2300_;
				if (i_2300_ > i_2296_)
					i_2296_ = i_2300_;
				int i_2301_ = i_2298_ * i_2298_ + i_2300_ * i_2300_;
				if (i_2301_ > i)
					i = i_2301_;
				i_2301_ += i_2299_ * i_2299_;
				if (i_2301_ > i_2290_)
					i_2290_ = i_2301_;
			}
			aShort9226 = (short) i_2291_;
			aShort9173 = (short) i_2294_;
			aShort9223 = (short) i_2292_;
			aShort9237 = (short) i_2295_;
			aShort9228 = (short) i_2293_;
			aShort9229 = (short) i_2296_;
			aShort9196 = (short) (int) (Math.sqrt((double) i) + 0.99);
			aShort9222 = (short) (int) (Math.sqrt((double) i_2290_) + 0.99);
			aBool9221 = true;
		}
	}

	public int method2972() {
		if (!aBool9221)
			method14659();
		return aShort9222;
	}

	public int method2929() {
		return anInt9175;
	}

	public int method3028() {
		if (!aBool9221)
			method14659();
		return aShort9196;
	}

	public int method2969() {
		if (!aBool9221)
			method14659();
		return aShort9196;
	}

	public int method2970() {
		if (!aBool9221)
			method14659();
		return aShort9196;
	}

	public int method2971() {
		if (!aBool9221)
			method14659();
		return aShort9196;
	}

	final void method14710(boolean bool, boolean bool_2302_, boolean bool_2303_) {
		for (int i = 0; i < anInt9217; i++) {
			Class116 class116 = aClass116Array9218[i];
			if (class116.aBool1415) {
				Class108 class108 = aClass108Array9211[i];
				aClass180_Sub1_9171.method14840(bool, bool_2302_, bool_2303_, class108.anInt1348 * 239951701, class108.anInt1352 * 888949401, class108.aFloat1356, class108.anInt1354 * -483431175, class108.anInt1355 * -777416001, class116.aShort1418, class108.anInt1351 * 328110239, class116.aByte1419, class116.aByte1416);
			}
		}
	}

	public byte[] method3001() {
		return aByteArray9202;
	}

	public Class176 method2922(byte i, int i_2304_, boolean bool) {
		method14713(Thread.currentThread());
		boolean bool_2305_ = false;
		Class176_Sub2 class176_sub2_2306_;
		Class176_Sub2 class176_sub2_2307_;
		if (i > 0 && i <= 8) {
			class176_sub2_2307_ = aClass176_Sub2Array9225[i - 1];
			class176_sub2_2306_ = aClass176_Sub2Array9183[i - 1];
			bool_2305_ = true;
		} else
			class176_sub2_2306_ = class176_sub2_2307_ = new Class176_Sub2(aClass180_Sub1_9171);
		return method14639(class176_sub2_2306_, class176_sub2_2307_, i_2304_, bool_2305_, bool);
	}

	public int method2932() {
		if (!aBool9221)
			method14659();
		return aShort9173;
	}

	public int method2976() {
		if (!aBool9221)
			method14659();
		return aShort9173;
	}

	void method14711() {
		aClass114Array9236 = new Class114[anInt9231];
		for (int i = 0; i < anInt9231; i++)
			aClass114Array9236[i] = new Class114();
		for (int i = 0; i < anInt9185; i++) {
			short i_2308_ = aShortArray9187[i];
			short i_2309_ = aShortArray9188[i];
			short i_2310_ = aShortArray9189[i];
			int i_2311_ = anIntArray9191[i_2309_] - anIntArray9191[i_2308_];
			int i_2312_ = anIntArray9184[i_2309_] - anIntArray9184[i_2308_];
			int i_2313_ = anIntArray9161[i_2309_] - anIntArray9161[i_2308_];
			int i_2314_ = anIntArray9191[i_2310_] - anIntArray9191[i_2308_];
			int i_2315_ = anIntArray9184[i_2310_] - anIntArray9184[i_2308_];
			int i_2316_ = anIntArray9161[i_2310_] - anIntArray9161[i_2308_];
			int i_2317_ = i_2312_ * i_2316_ - i_2315_ * i_2313_;
			int i_2318_ = i_2313_ * i_2314_ - i_2316_ * i_2311_;
			int i_2319_;
			for (i_2319_ = i_2311_ * i_2315_ - i_2314_ * i_2312_; (i_2317_ > 8192 || i_2318_ > 8192 || i_2319_ > 8192 || i_2317_ < -8192 || i_2318_ < -8192 || i_2319_ < -8192); i_2319_ >>= 1) {
				i_2317_ >>= 1;
				i_2318_ >>= 1;
			}
			int i_2320_ = (int) Math.sqrt((double) (i_2317_ * i_2317_ + i_2318_ * i_2318_ + i_2319_ * i_2319_));
			if (i_2320_ <= 0)
				i_2320_ = 1;
			i_2317_ = i_2317_ * 256 / i_2320_;
			i_2318_ = i_2318_ * 256 / i_2320_;
			i_2319_ = i_2319_ * 256 / i_2320_;
			byte i_2321_;
			if (aByteArray9200 == null)
				i_2321_ = (byte) 0;
			else
				i_2321_ = aByteArray9200[i];
			if (i_2321_ == 0) {
				Class114 class114 = aClass114Array9236[i_2308_];
				class114.anInt1412 += i_2317_;
				class114.anInt1411 += i_2318_;
				class114.anInt1410 += i_2319_;
				class114.anInt1413++;
				class114 = aClass114Array9236[i_2309_];
				class114.anInt1412 += i_2317_;
				class114.anInt1411 += i_2318_;
				class114.anInt1410 += i_2319_;
				class114.anInt1413++;
				class114 = aClass114Array9236[i_2310_];
				class114.anInt1412 += i_2317_;
				class114.anInt1411 += i_2318_;
				class114.anInt1410 += i_2319_;
				class114.anInt1413++;
			} else if (i_2321_ == 1) {
				if (aClass113Array9199 == null)
					aClass113Array9199 = new Class113[anInt9185];
				Class113 class113 = aClass113Array9199[i] = new Class113();
				class113.anInt1407 = i_2317_;
				class113.anInt1408 = i_2318_;
				class113.anInt1409 = i_2319_;
			}
		}
	}

	public int method2978() {
		if (!aBool9221)
			method14659();
		return aShort9223;
	}

	public int method2979() {
		if (!aBool9221)
			method14659();
		return aShort9223;
	}

	public void method3026(Class432 class432, int i, boolean bool) {
		if (aShortArray9227 != null) {
			Class101 class101 = aClass180_Sub1_9171.method14835(Thread.currentThread());
			Class432 class432_2322_ = class101.aClass432_1203;
			class432_2322_.method6899(class432);
			if (bool)
				class432_2322_.method6887();
			Class427 class427 = class101.aClass427_1188;
			class427.method6784(class432_2322_);
			float[] fs = new float[3];
			for (int i_2323_ = 0; i_2323_ < anInt9231; i_2323_++) {
				if ((i & aShortArray9227[i_2323_]) != 0) {
					class427.method6773((float) anIntArray9191[i_2323_], (float) anIntArray9184[i_2323_], (float) anIntArray9161[i_2323_], fs);
					anIntArray9191[i_2323_] = (int) fs[0];
					anIntArray9184[i_2323_] = (int) fs[1];
					anIntArray9161[i_2323_] = (int) fs[2];
				}
			}
		}
	}

	public int method2902() {
		if (!aBool9221)
			method14659();
		return aShort9228;
	}

	public int method2982() {
		if (!aBool9221)
			method14659();
		return aShort9228;
	}

	Class176_Sub2(Class180_Sub1 class180_sub1, Class175 class175, int i, int i_2324_, int i_2325_, int i_2326_) {
		anInt9177 = 0;
		anInt9231 = 0;
		anInt9185 = 0;
		anInt9186 = 0;
		anInt9246 = 0;
		aBool9210 = false;
		aBool9214 = false;
		aBool9221 = false;
		aBool9168 = false;
		aBool9232 = false;
		aBool9233 = false;
		aClass180_Sub1_9171 = class180_sub1;
		anInt9174 = i;
		anInt9175 = i_2324_;
		anInt9179 = i_2325_;
		Class181 class181 = aClass180_Sub1_9171.aClass181_2059;
		Interface48 interface48 = aClass180_Sub1_9171.anInterface48_2067;
		anInt9177 = class175.anInt1906;
		anInt9231 = class175.anInt1912;
		anIntArray9191 = class175.anIntArray1908;
		anIntArray9184 = class175.anIntArray1909;
		anIntArray9161 = class175.anIntArray1910;
		anInt9185 = class175.anInt1917;
		aShortArray9187 = class175.aShortArray1918;
		aShortArray9188 = class175.aShortArray1940;
		aShortArray9189 = class175.aShortArray1920;
		aByteArray9201 = class175.aByteArray1924;
		aShortArray9193 = class175.aShortArray1942;
		aByteArray9202 = class175.aByteArray1907;
		aShortArray9205 = class175.aShortArray1935;
		aByteArray9200 = class175.aByteArray1928;
		aClass167Array9215 = class175.aClass167Array1948;
		aClass159Array9216 = class175.aClass159Array1925;
		aShortArray9227 = class175.aShortArray1913;
		anInt9186 = anInt9185;
		int[] is = new int[anInt9185];
		for (int i_2327_ = 0; i_2327_ < anInt9185; i_2327_++)
			is[i_2327_] = i_2327_;
		long[] ls = new long[anInt9185];
		boolean bool = (anInt9174 & 0x100) != 0;
		for (int i_2328_ = 0; i_2328_ < anInt9185; i_2328_++) {
			int i_2329_ = is[i_2328_];
			Class163 class163 = null;
			int i_2330_ = 0;
			int i_2331_ = 0;
			int i_2332_ = 0;
			int i_2333_ = 0;
			if (class175.aClass183Array1947 != null) {
				boolean bool_2334_ = false;
				for (int i_2335_ = 0; i_2335_ < class175.aClass183Array1947.length; i_2335_++) {
					Class183 class183 = class175.aClass183Array1947[i_2335_];
					if (i_2329_ == class183.anInt2097 * -214271421) {
						Class393 class393 = interface48.method336((class183.anInt2099 * 1280345283), -1563449310);
						if (class393.aBool4018)
							bool_2334_ = true;
						if (class393.anInt4021 * 1521281507 != -1) {
							Class163 class163_2336_ = class181.method3544((class393.anInt4021 * 1521281507), (byte) -115);
							if (class163_2336_.aClass595_1784 == Class595.aClass595_7814)
								aBool9232 = true;
						}
					}
				}
				if (bool_2334_) {
					ls[i_2328_] = 9223372036854775807L;
					anInt9186--;
					continue;
				}
			}
			if (class175.aClass167Array1948 != null) {
				boolean bool_2337_ = false;
				for (int i_2338_ = 0; i_2338_ < class175.aClass167Array1948.length; i_2338_++) {
					Class167 class167 = class175.aClass167Array1948[i_2338_];
					if (i_2329_ == class167.anInt1848 * 359046121) {
						Class394 class394 = (aClass180_Sub1_9171.anInterface46_2078.method330(class167.anInt1854 * -1557661391, 2089201853));
						if (class394.aBool4098)
							bool_2337_ = true;
					}
				}
				if (bool_2337_) {
					ls[i_2328_] = 9223372036854775807L;
					anInt9186--;
					continue;
				}
			}
			int i_2339_ = -1;
			if (class175.aShortArray1929 != null) {
				i_2339_ = class175.aShortArray1929[i_2329_];
				if (i_2339_ != -1) {
					class163 = class181.method3544(i_2339_ & 0xffff, (byte) -63);
					if ((i_2326_ & 0x40) == 0 || !class163.aBool1806) {
						i_2332_ = class163.aByte1801;
						i_2333_ = class163.aByte1775;
					} else
						i_2339_ = -1;
				}
			}
			boolean bool_2340_ = (aByteArray9202 != null && aByteArray9202[i_2329_] != 0 || (class163 != null && class163.aClass595_1784 == Class595.aClass595_7814));
			if ((bool || bool_2340_) && aByteArray9201 != null)
				i_2330_ += aByteArray9201[i_2329_] << 17;
			if (bool_2340_)
				i_2330_ += 65536;
			i_2330_ += (i_2332_ & 0xff) << 8;
			i_2330_ += i_2333_ & 0xff;
			i_2331_ += (i_2339_ & 0xffff) << 16;
			i_2331_ += i_2328_ & 0xffff;
			ls[i_2328_] = ((long) i_2330_ << 32) + (long) i_2331_;
			aBool9232 |= bool_2340_;
		}
		Class98.method1752(ls, is, -1597032138);
		if (class175.aClass183Array1947 != null) {
			anInt9217 = class175.aClass183Array1947.length;
			aClass116Array9218 = new Class116[anInt9217];
			aClass108Array9211 = new Class108[anInt9217];
			for (int i_2341_ = 0; i_2341_ < class175.aClass183Array1947.length; i_2341_++) {
				Class183 class183 = class175.aClass183Array1947[i_2341_];
				Class393 class393 = interface48.method336(class183.anInt2099 * 1280345283, -757760734);
				int i_2342_ = ((Class656.anIntArray8393[(class175.aShortArray1942[class183.anInt2097 * -214271421]) & 0xffff]) & 0xffffff);
				i_2342_ = i_2342_ | 255 - (class175.aByteArray1907 != null ? ((class175.aByteArray1907[class183.anInt2097 * -214271421]) & 0xff) : 0) << 24;
				aClass116Array9218[i_2341_] = new Class116(class183.anInt2097 * -214271421, (class175.aShortArray1918[class183.anInt2097 * -214271421]), (class175.aShortArray1940[class183.anInt2097 * -214271421]), (class175.aShortArray1920[class183.anInt2097 * -214271421]), class393.anInt4020 * 1759660577, class393.anInt4025 * -1228217751, class393.anInt4021 * 1521281507, class393.anInt4023 * -142033085, class393.anInt4022 * -1198324925, class393.aBool4018, class183.anInt2098 * -1651221637);
				aClass108Array9211[i_2341_] = new Class108(i_2342_);
			}
		}
		aFloatArrayArray9190 = new float[anInt9185][];
		aFloatArrayArray9235 = new float[anInt9185][];
		Class173 class173 = method2860(class175, is, anInt9185);
		Class101 class101 = aClass180_Sub1_9171.method14835(Thread.currentThread());
		float[] fs = class101.aFloatArray1225;
		boolean bool_2343_ = false;
		for (int i_2344_ = 0; i_2344_ < anInt9185; i_2344_++) {
			int i_2345_ = is[i_2344_];
			int i_2346_ = (class175.aShortArray1929 != null ? class175.aShortArray1929[i_2345_] : -1);
			if (i_2346_ != -1 && (i_2326_ & 0x40) != 0 && class181.method3544(i_2346_ & 0xffff, (byte) -88).aBool1806)
				i_2346_ = -1;
			if (i_2346_ != -1) {
				int i_2347_ = (class175.aShortArray1927 != null ? class175.aShortArray1927[i_2345_] : -1);
				bool_2343_ = true;
				float[] fs_2348_ = aFloatArrayArray9190[i_2345_] = new float[3];
				float[] fs_2349_ = aFloatArrayArray9235[i_2345_] = new float[3];
				if (i_2347_ == 32766) {
					int i_2350_ = class175.aByteArray1944[i_2345_] & 0xff;
					int i_2351_ = class175.aByteArray1949[i_2345_] & 0xff;
					int i_2352_ = class175.aByteArray1923[i_2345_] & 0xff;
					i_2350_ += (class175.anIntArray1911[class175.aShortArray1918[i_2345_]]);
					i_2351_ += (class175.anIntArray1911[class175.aShortArray1940[i_2345_]]);
					i_2352_ += (class175.anIntArray1911[class175.aShortArray1920[i_2345_]]);
					fs_2348_[0] = class175.aFloatArray1915[i_2350_];
					fs_2349_[0] = class175.aFloatArray1931[i_2350_];
					fs_2348_[1] = class175.aFloatArray1915[i_2351_];
					fs_2349_[1] = class175.aFloatArray1931[i_2351_];
					fs_2348_[2] = class175.aFloatArray1915[i_2352_];
					fs_2349_[2] = class175.aFloatArray1931[i_2352_];
				} else if (i_2347_ == -1) {
					fs_2348_[0] = 0.0F;
					fs_2349_[0] = 1.0F;
					fs_2348_[1] = 1.0F;
					fs_2349_[1] = 1.0F;
					fs_2348_[2] = 0.0F;
					fs_2349_[2] = 0.0F;
				} else {
					i_2347_ &= 0xffff;
					byte i_2353_ = class175.aByteArray1936[i_2347_];
					if (i_2353_ == 0) {
						short i_2354_ = aShortArray9187[i_2345_];
						short i_2355_ = aShortArray9188[i_2345_];
						short i_2356_ = aShortArray9189[i_2345_];
						short i_2357_ = class175.aShortArray1937[i_2347_];
						short i_2358_ = class175.aShortArray1938[i_2347_];
						short i_2359_ = class175.aShortArray1939[i_2347_];
						float f = (float) anIntArray9191[i_2357_];
						float f_2360_ = (float) anIntArray9184[i_2357_];
						float f_2361_ = (float) anIntArray9161[i_2357_];
						float f_2362_ = (float) anIntArray9191[i_2358_] - f;
						float f_2363_ = (float) anIntArray9184[i_2358_] - f_2360_;
						float f_2364_ = (float) anIntArray9161[i_2358_] - f_2361_;
						float f_2365_ = (float) anIntArray9191[i_2359_] - f;
						float f_2366_ = (float) anIntArray9184[i_2359_] - f_2360_;
						float f_2367_ = (float) anIntArray9161[i_2359_] - f_2361_;
						float f_2368_ = (float) anIntArray9191[i_2354_] - f;
						float f_2369_ = (float) anIntArray9184[i_2354_] - f_2360_;
						float f_2370_ = (float) anIntArray9161[i_2354_] - f_2361_;
						float f_2371_ = (float) anIntArray9191[i_2355_] - f;
						float f_2372_ = (float) anIntArray9184[i_2355_] - f_2360_;
						float f_2373_ = (float) anIntArray9161[i_2355_] - f_2361_;
						float f_2374_ = (float) anIntArray9191[i_2356_] - f;
						float f_2375_ = (float) anIntArray9184[i_2356_] - f_2360_;
						float f_2376_ = (float) anIntArray9161[i_2356_] - f_2361_;
						float f_2377_ = f_2363_ * f_2367_ - f_2364_ * f_2366_;
						float f_2378_ = f_2364_ * f_2365_ - f_2362_ * f_2367_;
						float f_2379_ = f_2362_ * f_2366_ - f_2363_ * f_2365_;
						float f_2380_ = f_2366_ * f_2379_ - f_2367_ * f_2378_;
						float f_2381_ = f_2367_ * f_2377_ - f_2365_ * f_2379_;
						float f_2382_ = f_2365_ * f_2378_ - f_2366_ * f_2377_;
						float f_2383_ = 1.0F / (f_2380_ * f_2362_ + f_2381_ * f_2363_ + f_2382_ * f_2364_);
						fs_2348_[0] = (f_2380_ * f_2368_ + f_2381_ * f_2369_ + f_2382_ * f_2370_) * f_2383_;
						fs_2348_[1] = (f_2380_ * f_2371_ + f_2381_ * f_2372_ + f_2382_ * f_2373_) * f_2383_;
						fs_2348_[2] = (f_2380_ * f_2374_ + f_2381_ * f_2375_ + f_2382_ * f_2376_) * f_2383_;
						f_2380_ = f_2363_ * f_2379_ - f_2364_ * f_2378_;
						f_2381_ = f_2364_ * f_2377_ - f_2362_ * f_2379_;
						f_2382_ = f_2362_ * f_2378_ - f_2363_ * f_2377_;
						f_2383_ = 1.0F / (f_2380_ * f_2365_ + f_2381_ * f_2366_ + f_2382_ * f_2367_);
						fs_2349_[0] = (f_2380_ * f_2368_ + f_2381_ * f_2369_ + f_2382_ * f_2370_) * f_2383_;
						fs_2349_[1] = (f_2380_ * f_2371_ + f_2381_ * f_2372_ + f_2382_ * f_2373_) * f_2383_;
						fs_2349_[2] = (f_2380_ * f_2374_ + f_2381_ * f_2375_ + f_2382_ * f_2376_) * f_2383_;
					} else {
						short i_2384_ = aShortArray9187[i_2345_];
						short i_2385_ = aShortArray9188[i_2345_];
						short i_2386_ = aShortArray9189[i_2345_];
						int i_2387_ = class173.anIntArray1887[i_2347_];
						int i_2388_ = class173.anIntArray1884[i_2347_];
						int i_2389_ = class173.anIntArray1885[i_2347_];
						float[] fs_2390_ = class173.aFloatArrayArray1886[i_2347_];
						byte i_2391_ = class175.aByteArray1932[i_2347_];
						float f = ((float) class175.anIntArray1902[i_2347_] / 256.0F);
						if (i_2353_ == 1) {
							float f_2392_ = ((float) class175.anIntArray1943[i_2347_] / 1024.0F);
							method2857(anIntArray9191[i_2384_], anIntArray9184[i_2384_], anIntArray9161[i_2384_], i_2387_, i_2388_, i_2389_, fs_2390_, f_2392_, i_2391_, f, fs);
							fs_2348_[0] = fs[0];
							fs_2349_[0] = fs[1];
							method2857(anIntArray9191[i_2385_], anIntArray9184[i_2385_], anIntArray9161[i_2385_], i_2387_, i_2388_, i_2389_, fs_2390_, f_2392_, i_2391_, f, fs);
							fs_2348_[1] = fs[0];
							fs_2349_[1] = fs[1];
							method2857(anIntArray9191[i_2386_], anIntArray9184[i_2386_], anIntArray9161[i_2386_], i_2387_, i_2388_, i_2389_, fs_2390_, f_2392_, i_2391_, f, fs);
							fs_2348_[2] = fs[0];
							fs_2349_[2] = fs[1];
							float f_2393_ = f_2392_ / 2.0F;
							if ((i_2391_ & 0x1) == 0) {
								if (fs_2348_[1] - fs_2348_[0] > f_2393_)
									fs_2348_[1] -= f_2392_;
								else if (fs_2348_[0] - fs_2348_[1] > f_2393_)
									fs_2348_[1] += f_2392_;
								if (fs_2348_[2] - fs_2348_[0] > f_2393_)
									fs_2348_[2] -= f_2392_;
								else if (fs_2348_[0] - fs_2348_[2] > f_2393_)
									fs_2348_[2] += f_2392_;
							} else {
								if (fs_2349_[1] - fs_2349_[0] > f_2393_)
									fs_2349_[1] -= f_2392_;
								else if (fs_2349_[0] - fs_2349_[1] > f_2393_)
									fs_2349_[1] += f_2392_;
								if (fs_2349_[2] - fs_2349_[0] > f_2393_)
									fs_2349_[2] -= f_2392_;
								else if (fs_2349_[0] - fs_2349_[2] > f_2393_)
									fs_2349_[2] += f_2392_;
							}
						} else if (i_2353_ == 2) {
							float f_2394_ = ((float) class175.anIntArray1950[i_2347_] / 256.0F);
							float f_2395_ = ((float) class175.anIntArray1945[i_2347_] / 256.0F);
							int i_2396_ = (anIntArray9191[i_2385_] - anIntArray9191[i_2384_]);
							int i_2397_ = (anIntArray9184[i_2385_] - anIntArray9184[i_2384_]);
							int i_2398_ = (anIntArray9161[i_2385_] - anIntArray9161[i_2384_]);
							int i_2399_ = (anIntArray9191[i_2386_] - anIntArray9191[i_2384_]);
							int i_2400_ = (anIntArray9184[i_2386_] - anIntArray9184[i_2384_]);
							int i_2401_ = (anIntArray9161[i_2386_] - anIntArray9161[i_2384_]);
							int i_2402_ = i_2397_ * i_2401_ - i_2400_ * i_2398_;
							int i_2403_ = i_2398_ * i_2399_ - i_2401_ * i_2396_;
							int i_2404_ = i_2396_ * i_2400_ - i_2399_ * i_2397_;
							float f_2405_ = (64.0F / (float) class175.anIntArray1930[i_2347_]);
							float f_2406_ = (64.0F / (float) class175.anIntArray1941[i_2347_]);
							float f_2407_ = (64.0F / (float) class175.anIntArray1943[i_2347_]);
							float f_2408_ = (((float) i_2402_ * fs_2390_[0] + (float) i_2403_ * fs_2390_[1] + (float) i_2404_ * fs_2390_[2]) / f_2405_);
							float f_2409_ = (((float) i_2402_ * fs_2390_[3] + (float) i_2403_ * fs_2390_[4] + (float) i_2404_ * fs_2390_[5]) / f_2406_);
							float f_2410_ = (((float) i_2402_ * fs_2390_[6] + (float) i_2403_ * fs_2390_[7] + (float) i_2404_ * fs_2390_[8]) / f_2407_);
							int i_2411_ = method2858(f_2408_, f_2409_, f_2410_);
							method2859(anIntArray9191[i_2384_], anIntArray9184[i_2384_], anIntArray9161[i_2384_], i_2387_, i_2388_, i_2389_, i_2411_, fs_2390_, i_2391_, f, f_2394_, f_2395_, fs);
							fs_2348_[0] = fs[0];
							fs_2349_[0] = fs[1];
							method2859(anIntArray9191[i_2385_], anIntArray9184[i_2385_], anIntArray9161[i_2385_], i_2387_, i_2388_, i_2389_, i_2411_, fs_2390_, i_2391_, f, f_2394_, f_2395_, fs);
							fs_2348_[1] = fs[0];
							fs_2349_[1] = fs[1];
							method2859(anIntArray9191[i_2386_], anIntArray9184[i_2386_], anIntArray9161[i_2386_], i_2387_, i_2388_, i_2389_, i_2411_, fs_2390_, i_2391_, f, f_2394_, f_2395_, fs);
							fs_2348_[2] = fs[0];
							fs_2349_[2] = fs[1];
						} else if (i_2353_ == 3) {
							method2856(anIntArray9191[i_2384_], anIntArray9184[i_2384_], anIntArray9161[i_2384_], i_2387_, i_2388_, i_2389_, fs_2390_, i_2391_, f, fs);
							fs_2348_[0] = fs[0];
							fs_2349_[0] = fs[1];
							method2856(anIntArray9191[i_2385_], anIntArray9184[i_2385_], anIntArray9161[i_2385_], i_2387_, i_2388_, i_2389_, fs_2390_, i_2391_, f, fs);
							fs_2348_[1] = fs[0];
							fs_2349_[1] = fs[1];
							method2856(anIntArray9191[i_2386_], anIntArray9184[i_2386_], anIntArray9161[i_2386_], i_2387_, i_2388_, i_2389_, fs_2390_, i_2391_, f, fs);
							fs_2348_[2] = fs[0];
							fs_2349_[2] = fs[1];
							if ((i_2391_ & 0x1) == 0) {
								if (fs_2348_[1] - fs_2348_[0] > 0.5F)
									fs_2348_[1]--;
								else if (fs_2348_[0] - fs_2348_[1] > 0.5F)
									fs_2348_[1]++;
								if (fs_2348_[2] - fs_2348_[0] > 0.5F)
									fs_2348_[2]--;
								else if (fs_2348_[0] - fs_2348_[2] > 0.5F)
									fs_2348_[2]++;
							} else {
								if (fs_2349_[1] - fs_2349_[0] > 0.5F)
									fs_2349_[1]--;
								else if (fs_2349_[0] - fs_2349_[1] > 0.5F)
									fs_2349_[1]++;
								if (fs_2349_[2] - fs_2349_[0] > 0.5F)
									fs_2349_[2]--;
								else if (fs_2349_[0] - fs_2349_[2] > 0.5F)
									fs_2349_[2]++;
							}
						}
					}
				}
			}
		}
		if (!bool_2343_) {
			aFloatArrayArray9235 = null;
			aFloatArrayArray9190 = null;
		}
		if (class175.anIntArray1921 != null && (anInt9174 & 0x20) != 0)
			anIntArrayArray9178 = class175.method2807(true);
		if (class175.anIntArray1914 != null && (anInt9174 & 0x180) != 0)
			anIntArrayArray9208 = class175.method2808();
		if (class175.aClass183Array1947 != null && (anInt9174 & 0x400) != 0)
			anIntArrayArray9220 = class175.method2809();
		if (class175.aShortArray1929 != null) {
			aShortArray9162 = new short[anInt9185];
			boolean bool_2412_ = false;
			for (int i_2413_ = 0; i_2413_ < anInt9185; i_2413_++) {
				short i_2414_ = class175.aShortArray1929[i_2413_];
				if (i_2414_ != -1) {
					Class163 class163 = aClass180_Sub1_9171.aClass181_2059.method3544(i_2414_ & 0xffff, (byte) -37);
					if ((i_2326_ & 0x40) == 0 || !class163.aBool1806) {
						aShortArray9162[i_2413_] = i_2414_;
						bool_2412_ = true;
						if (class163.aClass595_1784 == Class595.aClass595_7814)
							aBool9232 = true;
						if (class163.aByte1781 != 0 || class163.aByte1797 != 0)
							aBool9233 = true;
					} else
						aShortArray9162[i_2413_] = (short) -1;
				} else
					aShortArray9162[i_2413_] = (short) -1;
			}
			if (!bool_2412_)
				aShortArray9162 = null;
		} else
			aShortArray9162 = null;
		if (aBool9232 || aClass116Array9218 != null) {
			aShortArray9181 = new short[anInt9185];
			for (int i_2415_ = 0; i_2415_ < anInt9185; i_2415_++)
				aShortArray9181[i_2415_] = (short) is[i_2415_];
		}
	}

	public int method2989() {
		if (!aBool9168)
			method2901();
		return aShort9242;
	}

	public void method2943(int i, int i_2416_, Class161 class161, Class161 class161_2417_, int i_2418_, int i_2419_, int i_2420_) {
		if (i == 3) {
			if ((anInt9174 & 0x7) != 7)
				throw new IllegalStateException();
		} else if ((anInt9174 & 0x2) != 2)
			throw new IllegalStateException();
		if (!aBool9221)
			method14659();
		int i_2421_ = i_2418_ + aShort9226;
		int i_2422_ = i_2418_ + aShort9173;
		int i_2423_ = i_2420_ + aShort9228;
		int i_2424_ = i_2420_ + aShort9229;
		if (i == 4 || (i_2421_ >= 0 && ((i_2422_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1750 * 1210322533) && i_2423_ >= 0 && ((i_2424_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1751 * -533476177))) {
			int[][] is = class161.anIntArrayArray1754;
			int[][] is_2425_ = null;
			if (class161_2417_ != null)
				is_2425_ = class161_2417_.anIntArrayArray1754;
			if (i == 4 || i == 5) {
				if (class161_2417_ == null || (i_2421_ < 0 || ((i_2422_ + class161_2417_.anInt1752 * 1048375491 >> class161_2417_.anInt1753 * 1252000143) >= class161_2417_.anInt1750 * 1210322533) || i_2423_ < 0 || ((i_2424_ + class161_2417_.anInt1752 * 1048375491 >> class161_2417_.anInt1753 * 1252000143) >= class161_2417_.anInt1751 * -533476177)))
					return;
			} else {
				i_2421_ >>= class161.anInt1753 * 1252000143;
				i_2422_ = (i_2422_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				i_2423_ >>= class161.anInt1753 * 1252000143;
				i_2424_ = (i_2424_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				if (is[i_2421_][i_2423_] == i_2419_ && is[i_2422_][i_2423_] == i_2419_ && is[i_2421_][i_2424_] == i_2419_ && is[i_2422_][i_2424_] == i_2419_)
					return;
			}
			synchronized (this) {
				if (i == 1) {
					int i_2426_ = class161.anInt1752 * 1048375491 - 1;
					for (int i_2427_ = 0; i_2427_ < anInt9231; i_2427_++) {
						int i_2428_ = anIntArray9191[i_2427_] + i_2418_;
						int i_2429_ = anIntArray9161[i_2427_] + i_2420_;
						int i_2430_ = i_2428_ & i_2426_;
						int i_2431_ = i_2429_ & i_2426_;
						int i_2432_ = i_2428_ >> class161.anInt1753 * 1252000143;
						int i_2433_ = i_2429_ >> class161.anInt1753 * 1252000143;
						int i_2434_ = (((is[i_2432_][i_2433_] * (class161.anInt1752 * 1048375491 - i_2430_)) + is[i_2432_ + 1][i_2433_] * i_2430_) >> class161.anInt1753 * 1252000143);
						int i_2435_ = (((is[i_2432_][i_2433_ + 1] * (class161.anInt1752 * 1048375491 - i_2430_)) + is[i_2432_ + 1][i_2433_ + 1] * i_2430_) >> class161.anInt1753 * 1252000143);
						int i_2436_ = (i_2434_ * (class161.anInt1752 * 1048375491 - i_2431_) + i_2435_ * i_2431_ >> class161.anInt1753 * 1252000143);
						anIntArray9184[i_2427_] = anIntArray9184[i_2427_] + i_2436_ - i_2419_;
					}
					for (int i_2437_ = anInt9231; i_2437_ < anInt9177; i_2437_++) {
						int i_2438_ = anIntArray9191[i_2437_] + i_2418_;
						int i_2439_ = anIntArray9161[i_2437_] + i_2420_;
						int i_2440_ = i_2438_ & i_2426_;
						int i_2441_ = i_2439_ & i_2426_;
						int i_2442_ = i_2438_ >> class161.anInt1753 * 1252000143;
						int i_2443_ = i_2439_ >> class161.anInt1753 * 1252000143;
						if (i_2442_ >= 0 && i_2442_ < is.length - 1 && i_2443_ >= 0 && i_2443_ < is[0].length - 1) {
							int i_2444_ = (((is[i_2442_][i_2443_] * (class161.anInt1752 * 1048375491 - i_2440_)) + is[i_2442_ + 1][i_2443_] * i_2440_) >> class161.anInt1753 * 1252000143);
							int i_2445_ = (((is[i_2442_][i_2443_ + 1] * (class161.anInt1752 * 1048375491 - i_2440_)) + is[i_2442_ + 1][i_2443_ + 1] * i_2440_) >> class161.anInt1753 * 1252000143);
							int i_2446_ = (i_2444_ * (class161.anInt1752 * 1048375491 - i_2441_) + i_2445_ * i_2441_ >> class161.anInt1753 * 1252000143);
							anIntArray9184[i_2437_] = anIntArray9184[i_2437_] + i_2446_ - i_2419_;
						}
					}
				} else if (i == 2) {
					if (aShort9223 == 0)
						return;
					int i_2447_ = class161.anInt1752 * 1048375491 - 1;
					for (int i_2448_ = 0; i_2448_ < anInt9231; i_2448_++) {
						int i_2449_ = (anIntArray9184[i_2448_] << 16) / aShort9223;
						if (i_2449_ < i_2416_) {
							int i_2450_ = anIntArray9191[i_2448_] + i_2418_;
							int i_2451_ = anIntArray9161[i_2448_] + i_2420_;
							int i_2452_ = i_2450_ & i_2447_;
							int i_2453_ = i_2451_ & i_2447_;
							int i_2454_ = i_2450_ >> class161.anInt1753 * 1252000143;
							int i_2455_ = i_2451_ >> class161.anInt1753 * 1252000143;
							int i_2456_ = (((is[i_2454_][i_2455_] * (class161.anInt1752 * 1048375491 - i_2452_)) + is[i_2454_ + 1][i_2455_] * i_2452_) >> class161.anInt1753 * 1252000143);
							int i_2457_ = (((is[i_2454_][i_2455_ + 1] * (class161.anInt1752 * 1048375491 - i_2452_)) + is[i_2454_ + 1][i_2455_ + 1] * i_2452_) >> class161.anInt1753 * 1252000143);
							int i_2458_ = (i_2456_ * (class161.anInt1752 * 1048375491 - i_2453_) + i_2457_ * i_2453_ >> class161.anInt1753 * 1252000143);
							anIntArray9184[i_2448_] = (anIntArray9184[i_2448_] + ((i_2458_ - i_2419_) * (i_2416_ - i_2449_) / i_2416_));
						} else
							anIntArray9184[i_2448_] = anIntArray9184[i_2448_];
					}
					for (int i_2459_ = anInt9231; i_2459_ < anInt9177; i_2459_++) {
						int i_2460_ = (anIntArray9184[i_2459_] << 16) / aShort9223;
						if (i_2460_ < i_2416_) {
							int i_2461_ = anIntArray9191[i_2459_] + i_2418_;
							int i_2462_ = anIntArray9161[i_2459_] + i_2420_;
							int i_2463_ = i_2461_ & i_2447_;
							int i_2464_ = i_2462_ & i_2447_;
							int i_2465_ = i_2461_ >> class161.anInt1753 * 1252000143;
							int i_2466_ = i_2462_ >> class161.anInt1753 * 1252000143;
							if (i_2465_ >= 0 && (i_2465_ < class161.anInt1750 * 1210322533 - 1) && i_2466_ >= 0 && (i_2466_ < class161.anInt1751 * -533476177 - 1)) {
								int i_2467_ = (((is[i_2465_][i_2466_] * (class161.anInt1752 * 1048375491 - i_2463_)) + is[i_2465_ + 1][i_2466_] * i_2463_) >> class161.anInt1753 * 1252000143);
								int i_2468_ = (((is[i_2465_][i_2466_ + 1] * (class161.anInt1752 * 1048375491 - i_2463_)) + (is[i_2465_ + 1][i_2466_ + 1] * i_2463_)) >> class161.anInt1753 * 1252000143);
								int i_2469_ = ((i_2467_ * (class161.anInt1752 * 1048375491 - i_2464_)) + i_2468_ * i_2464_ >> class161.anInt1753 * 1252000143);
								anIntArray9184[i_2459_] = (anIntArray9184[i_2459_] + ((i_2469_ - i_2419_) * (i_2416_ - i_2460_) / i_2416_));
							}
						} else
							anIntArray9184[i_2459_] = anIntArray9184[i_2459_];
					}
				} else if (i == 3) {
					int i_2470_ = (i_2416_ & 0xff) * 16;
					int i_2471_ = (i_2416_ >> 8 & 0xff) * 16;
					int i_2472_ = (i_2416_ >> 16 & 0xff) << 6;
					int i_2473_ = (i_2416_ >> 24 & 0xff) << 6;
					if (i_2418_ - (i_2470_ >> 1) < 0 || ((i_2418_ + (i_2470_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1750 * 1210322533 << class161.anInt1753 * 1252000143)) || i_2420_ - (i_2471_ >> 1) < 0 || ((i_2420_ + (i_2471_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1751 * -533476177 << class161.anInt1753 * 1252000143)))
						return;
					method2962(class161, i_2418_, i_2419_, i_2420_, i_2470_, i_2471_, i_2472_, i_2473_);
				} else if (i == 4) {
					int i_2474_ = class161_2417_.anInt1752 * 1048375491 - 1;
					int i_2475_ = aShort9237 - aShort9223;
					for (int i_2476_ = 0; i_2476_ < anInt9231; i_2476_++) {
						int i_2477_ = anIntArray9191[i_2476_] + i_2418_;
						int i_2478_ = anIntArray9161[i_2476_] + i_2420_;
						int i_2479_ = i_2477_ & i_2474_;
						int i_2480_ = i_2478_ & i_2474_;
						int i_2481_ = i_2477_ >> class161_2417_.anInt1753 * 1252000143;
						int i_2482_ = i_2478_ >> class161_2417_.anInt1753 * 1252000143;
						int i_2483_ = (((is_2425_[i_2481_][i_2482_] * (class161_2417_.anInt1752 * 1048375491 - i_2479_)) + is_2425_[i_2481_ + 1][i_2482_] * i_2479_) >> class161_2417_.anInt1753 * 1252000143);
						int i_2484_ = (((is_2425_[i_2481_][i_2482_ + 1] * (class161_2417_.anInt1752 * 1048375491 - i_2479_)) + is_2425_[i_2481_ + 1][i_2482_ + 1] * i_2479_) >> class161_2417_.anInt1753 * 1252000143);
						int i_2485_ = (i_2483_ * (class161_2417_.anInt1752 * 1048375491 - i_2480_) + i_2484_ * i_2480_ >> class161_2417_.anInt1753 * 1252000143);
						anIntArray9184[i_2476_] = (anIntArray9184[i_2476_] + (i_2485_ - i_2419_) + i_2475_);
					}
					for (int i_2486_ = anInt9231; i_2486_ < anInt9177; i_2486_++) {
						int i_2487_ = anIntArray9191[i_2486_] + i_2418_;
						int i_2488_ = anIntArray9161[i_2486_] + i_2420_;
						int i_2489_ = i_2487_ & i_2474_;
						int i_2490_ = i_2488_ & i_2474_;
						int i_2491_ = i_2487_ >> class161_2417_.anInt1753 * 1252000143;
						int i_2492_ = i_2488_ >> class161_2417_.anInt1753 * 1252000143;
						if (i_2491_ >= 0 && (i_2491_ < class161_2417_.anInt1750 * 1210322533 - 1) && i_2492_ >= 0 && (i_2492_ < class161_2417_.anInt1751 * -533476177 - 1)) {
							int i_2493_ = (((is_2425_[i_2491_][i_2492_] * (class161_2417_.anInt1752 * 1048375491 - i_2489_)) + is_2425_[i_2491_ + 1][i_2492_] * i_2489_) >> class161_2417_.anInt1753 * 1252000143);
							int i_2494_ = (((is_2425_[i_2491_][i_2492_ + 1] * (class161_2417_.anInt1752 * 1048375491 - i_2489_)) + (is_2425_[i_2491_ + 1][i_2492_ + 1] * i_2489_)) >> class161_2417_.anInt1753 * 1252000143);
							int i_2495_ = ((i_2493_ * (class161_2417_.anInt1752 * 1048375491 - i_2490_)) + i_2494_ * i_2490_ >> class161_2417_.anInt1753 * 1252000143);
							anIntArray9184[i_2486_] = (anIntArray9184[i_2486_] + (i_2495_ - i_2419_) + i_2475_);
						}
					}
				} else if (i == 5) {
					int i_2496_ = class161_2417_.anInt1752 * 1048375491 - 1;
					int i_2497_ = aShort9237 - aShort9223;
					for (int i_2498_ = 0; i_2498_ < anInt9231; i_2498_++) {
						int i_2499_ = anIntArray9191[i_2498_] + i_2418_;
						int i_2500_ = anIntArray9161[i_2498_] + i_2420_;
						int i_2501_ = i_2499_ & i_2496_;
						int i_2502_ = i_2500_ & i_2496_;
						int i_2503_ = i_2499_ >> class161.anInt1753 * 1252000143;
						int i_2504_ = i_2500_ >> class161.anInt1753 * 1252000143;
						int i_2505_ = (((is[i_2503_][i_2504_] * (class161.anInt1752 * 1048375491 - i_2501_)) + is[i_2503_ + 1][i_2504_] * i_2501_) >> class161.anInt1753 * 1252000143);
						int i_2506_ = (((is[i_2503_][i_2504_ + 1] * (class161.anInt1752 * 1048375491 - i_2501_)) + is[i_2503_ + 1][i_2504_ + 1] * i_2501_) >> class161.anInt1753 * 1252000143);
						int i_2507_ = (i_2505_ * (class161.anInt1752 * 1048375491 - i_2502_) + i_2506_ * i_2502_ >> class161.anInt1753 * 1252000143);
						i_2505_ = (((is_2425_[i_2503_][i_2504_] * (class161_2417_.anInt1752 * 1048375491 - i_2501_)) + is_2425_[i_2503_ + 1][i_2504_] * i_2501_) >> class161_2417_.anInt1753 * 1252000143);
						i_2506_ = (((is_2425_[i_2503_][i_2504_ + 1] * (class161_2417_.anInt1752 * 1048375491 - i_2501_)) + is_2425_[i_2503_ + 1][i_2504_ + 1] * i_2501_) >> class161_2417_.anInt1753 * 1252000143);
						int i_2508_ = (i_2505_ * (class161_2417_.anInt1752 * 1048375491 - i_2502_) + i_2506_ * i_2502_ >> class161_2417_.anInt1753 * 1252000143);
						int i_2509_ = i_2507_ - i_2508_ - i_2416_;
						anIntArray9184[i_2498_] = ((anIntArray9184[i_2498_] << 8) / i_2497_ * i_2509_ >> 8) - (i_2419_ - i_2507_);
					}
					for (int i_2510_ = anInt9231; i_2510_ < anInt9177; i_2510_++) {
						int i_2511_ = anIntArray9191[i_2510_] + i_2418_;
						int i_2512_ = anIntArray9161[i_2510_] + i_2420_;
						int i_2513_ = i_2511_ & i_2496_;
						int i_2514_ = i_2512_ & i_2496_;
						int i_2515_ = i_2511_ >> class161.anInt1753 * 1252000143;
						int i_2516_ = i_2512_ >> class161.anInt1753 * 1252000143;
						if (i_2515_ >= 0 && i_2515_ < class161.anInt1750 * 1210322533 - 1 && (i_2515_ < class161_2417_.anInt1750 * 1210322533 - 1) && i_2516_ >= 0 && i_2516_ < class161.anInt1751 * -533476177 - 1 && (i_2516_ < class161_2417_.anInt1751 * -533476177 - 1)) {
							int i_2517_ = (((is[i_2515_][i_2516_] * (class161.anInt1752 * 1048375491 - i_2513_)) + is[i_2515_ + 1][i_2516_] * i_2513_) >> class161.anInt1753 * 1252000143);
							int i_2518_ = (((is[i_2515_][i_2516_ + 1] * (class161.anInt1752 * 1048375491 - i_2513_)) + is[i_2515_ + 1][i_2516_ + 1] * i_2513_) >> class161.anInt1753 * 1252000143);
							int i_2519_ = (i_2517_ * (class161.anInt1752 * 1048375491 - i_2514_) + i_2518_ * i_2514_ >> class161.anInt1753 * 1252000143);
							i_2517_ = (((is_2425_[i_2515_][i_2516_] * (class161_2417_.anInt1752 * 1048375491 - i_2513_)) + is_2425_[i_2515_ + 1][i_2516_] * i_2513_) >> class161_2417_.anInt1753 * 1252000143);
							i_2518_ = (((is_2425_[i_2515_][i_2516_ + 1] * (class161_2417_.anInt1752 * 1048375491 - i_2513_)) + (is_2425_[i_2515_ + 1][i_2516_ + 1] * i_2513_)) >> class161_2417_.anInt1753 * 1252000143);
							int i_2520_ = ((i_2517_ * (class161_2417_.anInt1752 * 1048375491 - i_2514_)) + i_2518_ * i_2514_ >> class161_2417_.anInt1753 * 1252000143);
							int i_2521_ = i_2519_ - i_2520_ - i_2416_;
							anIntArray9184[i_2510_] = (((anIntArray9184[i_2510_] << 8) / i_2497_ * i_2521_) >> 8) - (i_2419_ - i_2519_);
						}
					}
				}
				aBool9221 = false;
			}
		}
	}

	public void method2931(int i) {
		if ((anInt9174 & 0xd) != 13)
			throw new IllegalStateException();
		if (aClass114Array9236 != null) {
			if (i == 4096)
				method14654();
			else if (i == 8192)
				method14642();
			else if (i == 12288)
				method14643();
			else {
				int i_2522_ = Class428.anIntArray4825[i];
				int i_2523_ = Class428.anIntArray4819[i];
				synchronized (this) {
					for (int i_2524_ = 0; i_2524_ < anInt9231; i_2524_++) {
						int i_2525_ = ((anIntArray9161[i_2524_] * i_2522_ + anIntArray9191[i_2524_] * i_2523_) >> 14);
						anIntArray9161[i_2524_] = (anIntArray9161[i_2524_] * i_2523_ - anIntArray9191[i_2524_] * i_2522_) >> 14;
						anIntArray9191[i_2524_] = i_2525_;
						if (aClass114Array9236[i_2524_] != null) {
							i_2525_ = ((aClass114Array9236[i_2524_].anInt1410 * i_2522_) + (aClass114Array9236[i_2524_].anInt1412 * i_2523_)) >> 14;
							aClass114Array9236[i_2524_].anInt1410 = ((aClass114Array9236[i_2524_].anInt1410 * i_2523_) - (aClass114Array9236[i_2524_].anInt1412 * i_2522_)) >> 14;
							aClass114Array9236[i_2524_].anInt1412 = i_2525_;
						}
					}
					if (aClass113Array9199 != null) {
						for (int i_2526_ = 0; i_2526_ < anInt9185; i_2526_++) {
							if (aClass113Array9199[i_2526_] != null) {
								int i_2527_ = ((aClass113Array9199[i_2526_].anInt1409 * i_2522_) + (aClass113Array9199[i_2526_].anInt1407 * i_2523_)) >> 14;
								aClass113Array9199[i_2526_].anInt1409 = ((aClass113Array9199[i_2526_].anInt1409 * i_2523_) - (aClass113Array9199[i_2526_].anInt1407 * i_2522_)) >> 14;
								aClass113Array9199[i_2526_].anInt1407 = i_2527_;
							}
						}
					}
					for (int i_2528_ = anInt9231; i_2528_ < anInt9177; i_2528_++) {
						int i_2529_ = ((anIntArray9161[i_2528_] * i_2522_ + anIntArray9191[i_2528_] * i_2523_) >> 14);
						anIntArray9161[i_2528_] = (anIntArray9161[i_2528_] * i_2523_ - anIntArray9191[i_2528_] * i_2522_) >> 14;
						anIntArray9191[i_2528_] = i_2529_;
					}
					anInt9246 = 0;
					aBool9221 = false;
				}
			}
		} else
			method2911(i);
	}

	public void method2869(int i) {
		if ((anInt9174 & 0x3) != 3)
			throw new IllegalStateException();
		int i_2530_ = Class428.anIntArray4825[i];
		int i_2531_ = Class428.anIntArray4819[i];
		synchronized (this) {
			for (int i_2532_ = 0; i_2532_ < anInt9177; i_2532_++) {
				int i_2533_ = ((anIntArray9184[i_2532_] * i_2530_ + anIntArray9191[i_2532_] * i_2531_) >> 14);
				anIntArray9184[i_2532_] = (anIntArray9184[i_2532_] * i_2531_ - anIntArray9191[i_2532_] * i_2530_) >> 14;
				anIntArray9191[i_2532_] = i_2533_;
			}
			method14645();
		}
	}

	public void method2988(int i) {
		if ((anInt9174 & 0x1000) != 4096)
			throw new IllegalStateException();
		anInt9175 = i;
		anInt9246 = 0;
	}

	public int method3054() {
		if (!aBool9221)
			method14659();
		return aShort9237;
	}

	public void method3007(int i) {
		if ((anInt9174 & 0x2000) != 8192)
			throw new IllegalStateException();
		anInt9179 = i;
		anInt9246 = 0;
	}

	public void method2991(int i) {
		if ((anInt9174 & 0x2000) != 8192)
			throw new IllegalStateException();
		anInt9179 = i;
		anInt9246 = 0;
	}

	public int method2942() {
		return anInt9175;
	}

	public int method2993() {
		return anInt9175;
	}

	final void method14712(boolean bool, boolean bool_2534_, boolean bool_2535_, boolean bool_2536_, boolean bool_2537_) {
		if (aClass116Array9218 != null) {
			for (int i = 0; i < anInt9217; i++) {
				Class116 class116 = aClass116Array9218[i];
				anIntArray9245[class116.anInt1421 * 1723945109] = i;
			}
		}
		if (aBool9232 || aClass116Array9218 != null) {
			if ((anInt9174 & 0x100) == 0 && aShortArray9181 != null) {
				for (int i = 0; i < anInt9186; i++) {
					short i_2538_ = aShortArray9181[i];
					method14651(bool, bool_2534_, bool_2535_, i_2538_, bool_2536_, bool_2537_);
				}
			} else {
				for (int i = 0; i < anInt9186; i++) {
					if (!method14690(i) && !method14693(i))
						method14651(bool, bool_2534_, bool_2535_, i, bool_2536_, bool_2537_);
				}
				if (aByteArray9201 == null) {
					for (int i = 0; i < anInt9186; i++) {
						if (method14690(i) || method14693(i))
							method14651(bool, bool_2534_, bool_2535_, i, bool_2536_, bool_2537_);
					}
				} else {
					for (int i = 0; i < 12; i++) {
						for (int i_2539_ = 0; i_2539_ < anInt9186; i_2539_++) {
							if (aByteArray9201[i_2539_] == i && (method14690(i_2539_) || method14693(i_2539_)))
								method14651(bool, bool_2534_, bool_2535_, i_2539_, bool_2536_, bool_2537_);
						}
					}
				}
			}
			if (aClass116Array9218 != null)
				method14650(bool, bool_2534_, bool_2535_);
		} else {
			for (int i = 0; i < anInt9186; i++)
				method14651(bool, bool_2534_, bool_2535_, i, bool_2536_, bool_2537_);
		}
	}

	public int method2995() {
		return anInt9175;
	}

	public int method2996() {
		return anInt9179;
	}

	public int method2919() {
		return anInt9179;
	}

	public int method2998() {
		return anInt9179;
	}

	public byte[] method2999() {
		return aByteArray9202;
	}

	void method14713(Thread thread) {
		Class101 class101 = aClass180_Sub1_9171.method14835(thread);
		if (class101 != aClass101_9164) {
			aClass101_9164 = class101;
			aClass176_Sub2Array9183 = aClass101_9164.aClass176_Sub2Array1226;
			aClass176_Sub2Array9225 = aClass101_9164.aClass176_Sub2Array1190;
		}
	}

	public int method2977() {
		if (!aBool9221)
			method14659();
		return aShort9173;
	}

	public void method2914(byte i, byte[] is) {
		if ((anInt9174 & 0x100000) == 0)
			throw new RuntimeException();
		if (aByteArray9202 == null)
			aByteArray9202 = new byte[anInt9185];
		if (is == null) {
			for (int i_2540_ = 0; i_2540_ < anInt9185; i_2540_++)
				aByteArray9202[i_2540_] = i;
		} else {
			for (int i_2541_ = 0; i_2541_ < anInt9185; i_2541_++) {
				int i_2542_ = 255 - ((255 - (is[i_2541_] & 0xff)) * (255 - (i & 0xff)) / 255);
				aByteArray9202[i_2541_] = (byte) i_2542_;
			}
		}
		if (anInt9246 == 2)
			anInt9246 = 1;
	}

	public void method2959(byte i, byte[] is) {
		if ((anInt9174 & 0x100000) == 0)
			throw new RuntimeException();
		if (aByteArray9202 == null)
			aByteArray9202 = new byte[anInt9185];
		if (is == null) {
			for (int i_2543_ = 0; i_2543_ < anInt9185; i_2543_++)
				aByteArray9202[i_2543_] = i;
		} else {
			for (int i_2544_ = 0; i_2544_ < anInt9185; i_2544_++) {
				int i_2545_ = 255 - ((255 - (is[i_2544_] & 0xff)) * (255 - (i & 0xff)) / 255);
				aByteArray9202[i_2544_] = (byte) i_2545_;
			}
		}
		if (anInt9246 == 2)
			anInt9246 = 1;
	}

	public void method3004(short i, short i_2546_) {
		if (aShortArray9162 != null) {
			if (!aBool9233 && i_2546_ >= 0) {
				Class163 class163 = aClass180_Sub1_9171.aClass181_2059.method3544(i_2546_ & 0xffff, (byte) -19);
				if (class163.aByte1781 != 0 || class163.aByte1797 != 0)
					aBool9233 = true;
			}
			for (int i_2547_ = 0; i_2547_ < anInt9185; i_2547_++) {
				if (aShortArray9162[i_2547_] == i)
					aShortArray9162[i_2547_] = i_2546_;
			}
		}
	}

	public void method2907(short i, short i_2548_) {
		for (int i_2549_ = 0; i_2549_ < anInt9185; i_2549_++) {
			if (aShortArray9193[i_2549_] == i)
				aShortArray9193[i_2549_] = i_2548_;
		}
		if (aClass116Array9218 != null) {
			for (int i_2550_ = 0; i_2550_ < anInt9217; i_2550_++) {
				Class116 class116 = aClass116Array9218[i_2550_];
				Class108 class108 = aClass108Array9211[i_2550_];
				class108.anInt1351 = (class108.anInt1351 * 328110239 & ~0xffffff | ((Class656.anIntArray8393[Class453.method7333((aShortArray9193[(class116.anInt1421 * 1723945109)]), (byte) 10) & 0xffff]) & 0xffffff)) * 120490847;
			}
		}
		if (anInt9246 == 2)
			anInt9246 = 1;
	}

	Class176_Sub2(Class180_Sub1 class180_sub1) {
		anInt9177 = 0;
		anInt9231 = 0;
		anInt9185 = 0;
		anInt9186 = 0;
		anInt9246 = 0;
		aBool9210 = false;
		aBool9214 = false;
		aBool9221 = false;
		aBool9168 = false;
		aBool9232 = false;
		aBool9233 = false;
		aClass180_Sub1_9171 = class180_sub1;
	}

	public int method3023() {
		if (!aBool9168)
			method2901();
		return aShort9242;
	}

	public boolean method3008() {
		if (aShortArray9162 == null)
			return true;
		for (int i = 0; i < aShortArray9162.length; i++) {
			if (aShortArray9162[i] != -1 && !aClass180_Sub1_9171.method14821(aShortArray9162[i]))
				return false;
		}
		return true;
	}

	public boolean method3009() {
		if (aShortArray9162 == null)
			return true;
		for (int i = 0; i < aShortArray9162.length; i++) {
			if (aShortArray9162[i] != -1 && !aClass180_Sub1_9171.method14821(aShortArray9162[i]))
				return false;
		}
		return true;
	}

	void method14714(Thread thread) {
		Class101 class101 = aClass180_Sub1_9171.method14835(thread);
		if (class101 != aClass101_9164) {
			aClass101_9164 = class101;
			aClass176_Sub2Array9183 = aClass101_9164.aClass176_Sub2Array1226;
			aClass176_Sub2Array9225 = aClass101_9164.aClass176_Sub2Array1190;
		}
	}

	public boolean method3011() {
		return aBool9232;
	}

	void method14715() {
		synchronized (this) {
			for (int i = 0; i < anInt9231; i++) {
				anIntArray9191[i] = -anIntArray9191[i];
				anIntArray9161[i] = -anIntArray9161[i];
				if (aClass114Array9236[i] != null) {
					aClass114Array9236[i].anInt1412 = -aClass114Array9236[i].anInt1412;
					aClass114Array9236[i].anInt1410 = -aClass114Array9236[i].anInt1410;
				}
			}
			if (aClass113Array9199 != null) {
				for (int i = 0; i < anInt9185; i++) {
					if (aClass113Array9199[i] != null) {
						aClass113Array9199[i].anInt1407 = -aClass113Array9199[i].anInt1407;
						aClass113Array9199[i].anInt1409 = -aClass113Array9199[i].anInt1409;
					}
				}
			}
			for (int i = anInt9231; i < anInt9177; i++) {
				anIntArray9191[i] = -anIntArray9191[i];
				anIntArray9161[i] = -anIntArray9161[i];
			}
			anInt9246 = 0;
			aBool9221 = false;
		}
	}

	public int method2963() {
		if (!aBool9221)
			method14659();
		return aShort9229;
	}

	public boolean method3014() {
		return aBool9233;
	}

	public int method2951() {
		return anInt9174;
	}

	void method14716() {
		for (int i = 0; i < anInt9185; i++) {
			short i_2551_ = aShortArray9162 != null ? aShortArray9162[i] : (short) -1;
			if (i_2551_ == -1) {
				int i_2552_ = aShortArray9193[i] & 0xffff;
				int i_2553_ = (i_2552_ & 0x7f) * anInt9175 >> 7;
				short i_2554_ = Class453.method7333(i_2552_ & ~0x7f | i_2553_, (byte) 10);
				if (anIntArray9194[i] == -1) {
					int i_2555_ = anIntArray9192[i] & ~0x1ffff;
					anIntArray9192[i] = i_2555_ | Class395.method6504(i_2554_, i_2555_ >> 17, -501584282);
				} else if (anIntArray9194[i] != -2) {
					int i_2556_ = anIntArray9192[i] & ~0x1ffff;
					anIntArray9192[i] = i_2556_ | Class395.method6504(i_2554_, i_2556_ >> 17, -501584282);
					i_2556_ = anIntArray9180[i] & ~0x1ffff;
					anIntArray9180[i] = i_2556_ | Class395.method6504(i_2554_, i_2556_ >> 17, -501584282);
					i_2556_ = anIntArray9194[i] & ~0x1ffff;
					anIntArray9194[i] = i_2556_ | Class395.method6504(i_2554_, i_2556_ >> 17, -501584282);
				}
			}
		}
		anInt9246 = 2;
	}

	public void method2863() {
		if ((anInt9174 & 0x10) != 16)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i = 0; i < anInt9177; i++)
				anIntArray9161[i] = -anIntArray9161[i];
			if (aClass114Array9236 != null) {
				for (int i = 0; i < anInt9231; i++) {
					if (aClass114Array9236[i] != null)
						aClass114Array9236[i].anInt1410 = -aClass114Array9236[i].anInt1410;
				}
			}
			if (aClass114Array9203 != null) {
				for (int i = 0; i < anInt9231; i++) {
					if (aClass114Array9203[i] != null)
						aClass114Array9203[i].anInt1410 = -aClass114Array9203[i].anInt1410;
				}
			}
			if (aClass113Array9199 != null) {
				for (int i = 0; i < anInt9185; i++) {
					if (aClass113Array9199[i] != null)
						aClass113Array9199[i].anInt1409 = -aClass113Array9199[i].anInt1409;
				}
			}
			short[] is = aShortArray9187;
			aShortArray9187 = aShortArray9189;
			aShortArray9189 = is;
			if (aFloatArrayArray9190 != null) {
				for (int i = 0; i < anInt9185; i++) {
					if (aFloatArrayArray9190[i] != null) {
						float f = aFloatArrayArray9190[i][0];
						aFloatArrayArray9190[i][0] = aFloatArrayArray9190[i][2];
						aFloatArrayArray9190[i][2] = f;
					}
					if (aFloatArrayArray9235[i] != null) {
						float f = aFloatArrayArray9235[i][0];
						aFloatArrayArray9235[i][0] = aFloatArrayArray9235[i][2];
						aFloatArrayArray9235[i][2] = f;
					}
				}
			}
			aBool9221 = false;
			anInt9246 = 0;
		}
	}

	public void method3003(short i, short i_2557_) {
		for (int i_2558_ = 0; i_2558_ < anInt9185; i_2558_++) {
			if (aShortArray9193[i_2558_] == i)
				aShortArray9193[i_2558_] = i_2557_;
		}
		if (aClass116Array9218 != null) {
			for (int i_2559_ = 0; i_2559_ < anInt9217; i_2559_++) {
				Class116 class116 = aClass116Array9218[i_2559_];
				Class108 class108 = aClass108Array9211[i_2559_];
				class108.anInt1351 = (class108.anInt1351 * 328110239 & ~0xffffff | ((Class656.anIntArray8393[Class453.method7333((aShortArray9193[(class116.anInt1421 * 1723945109)]), (byte) 10) & 0xffff]) & 0xffffff)) * 120490847;
			}
		}
		if (anInt9246 == 2)
			anInt9246 = 1;
	}

	public void method2936(short i, short i_2560_) {
		for (int i_2561_ = 0; i_2561_ < anInt9185; i_2561_++) {
			if (aShortArray9193[i_2561_] == i)
				aShortArray9193[i_2561_] = i_2560_;
		}
		if (aClass116Array9218 != null) {
			for (int i_2562_ = 0; i_2562_ < anInt9217; i_2562_++) {
				Class116 class116 = aClass116Array9218[i_2562_];
				Class108 class108 = aClass108Array9211[i_2562_];
				class108.anInt1351 = (class108.anInt1351 * 328110239 & ~0xffffff | ((Class656.anIntArray8393[Class453.method7333((aShortArray9193[(class116.anInt1421 * 1723945109)]), (byte) 10) & 0xffff]) & 0xffffff)) * 120490847;
			}
		}
		if (anInt9246 == 2)
			anInt9246 = 1;
	}

	void method2917() {
		if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
			synchronized (this) {
				aBool1951 = false;
				this.notifyAll();
			}
		}
	}

	void method2981() {
		if (aClass180_Sub1_9171.anInt9415 * 1413774429 > 1) {
			synchronized (this) {
				aBool1951 = false;
				this.notifyAll();
			}
		}
	}

	public Class176 method2862(byte i, int i_2563_, boolean bool) {
		method14713(Thread.currentThread());
		boolean bool_2564_ = false;
		Class176_Sub2 class176_sub2_2565_;
		Class176_Sub2 class176_sub2_2566_;
		if (i > 0 && i <= 8) {
			class176_sub2_2566_ = aClass176_Sub2Array9225[i - 1];
			class176_sub2_2565_ = aClass176_Sub2Array9183[i - 1];
			bool_2564_ = true;
		} else
			class176_sub2_2565_ = class176_sub2_2566_ = new Class176_Sub2(aClass180_Sub1_9171);
		return method14639(class176_sub2_2565_, class176_sub2_2566_, i_2563_, bool_2564_, bool);
	}

	void method3024(int i, int i_2567_, int i_2568_, int i_2569_) {
		if (i == 0) {
			int i_2570_ = 0;
			anInt9247 = 0;
			anInt9212 = 0;
			anInt9224 = 0;
			for (int i_2571_ = 0; i_2571_ < anInt9177; i_2571_++) {
				anInt9247 += anIntArray9191[i_2571_];
				anInt9212 += anIntArray9184[i_2571_];
				anInt9224 += anIntArray9161[i_2571_];
				i_2570_++;
			}
			if (i_2570_ > 0) {
				anInt9247 = anInt9247 / i_2570_ + i_2567_;
				anInt9212 = anInt9212 / i_2570_ + i_2568_;
				anInt9224 = anInt9224 / i_2570_ + i_2569_;
			} else {
				anInt9247 = i_2567_;
				anInt9212 = i_2568_;
				anInt9224 = i_2569_;
			}
		} else if (i == 1) {
			for (int i_2572_ = 0; i_2572_ < anInt9177; i_2572_++) {
				anIntArray9191[i_2572_] += i_2567_;
				anIntArray9184[i_2572_] += i_2568_;
				anIntArray9161[i_2572_] += i_2569_;
			}
		} else if (i == 2) {
			for (int i_2573_ = 0; i_2573_ < anInt9177; i_2573_++) {
				anIntArray9191[i_2573_] -= anInt9247;
				anIntArray9184[i_2573_] -= anInt9212;
				anIntArray9161[i_2573_] -= anInt9224;
				if (i_2569_ != 0) {
					int i_2574_ = Class428.anIntArray4825[i_2569_];
					int i_2575_ = Class428.anIntArray4819[i_2569_];
					int i_2576_ = ((anIntArray9184[i_2573_] * i_2574_ + anIntArray9191[i_2573_] * i_2575_ + 16383) >> 14);
					anIntArray9184[i_2573_] = (anIntArray9184[i_2573_] * i_2575_ - anIntArray9191[i_2573_] * i_2574_ + 16383) >> 14;
					anIntArray9191[i_2573_] = i_2576_;
				}
				if (i_2567_ != 0) {
					int i_2577_ = Class428.anIntArray4825[i_2567_];
					int i_2578_ = Class428.anIntArray4819[i_2567_];
					int i_2579_ = ((anIntArray9184[i_2573_] * i_2578_ - anIntArray9161[i_2573_] * i_2577_ + 16383) >> 14);
					anIntArray9161[i_2573_] = (anIntArray9184[i_2573_] * i_2577_ + anIntArray9161[i_2573_] * i_2578_ + 16383) >> 14;
					anIntArray9184[i_2573_] = i_2579_;
				}
				if (i_2568_ != 0) {
					int i_2580_ = Class428.anIntArray4825[i_2568_];
					int i_2581_ = Class428.anIntArray4819[i_2568_];
					int i_2582_ = ((anIntArray9161[i_2573_] * i_2580_ + anIntArray9191[i_2573_] * i_2581_ + 16383) >> 14);
					anIntArray9161[i_2573_] = (anIntArray9161[i_2573_] * i_2581_ - anIntArray9191[i_2573_] * i_2580_ + 16383) >> 14;
					anIntArray9191[i_2573_] = i_2582_;
				}
				anIntArray9191[i_2573_] += anInt9247;
				anIntArray9184[i_2573_] += anInt9212;
				anIntArray9161[i_2573_] += anInt9224;
			}
		} else if (i == 3) {
			for (int i_2583_ = 0; i_2583_ < anInt9177; i_2583_++) {
				anIntArray9191[i_2583_] -= anInt9247;
				anIntArray9184[i_2583_] -= anInt9212;
				anIntArray9161[i_2583_] -= anInt9224;
				anIntArray9191[i_2583_] = anIntArray9191[i_2583_] * i_2567_ / 128;
				anIntArray9184[i_2583_] = anIntArray9184[i_2583_] * i_2568_ / 128;
				anIntArray9161[i_2583_] = anIntArray9161[i_2583_] * i_2569_ / 128;
				anIntArray9191[i_2583_] += anInt9247;
				anIntArray9184[i_2583_] += anInt9212;
				anIntArray9161[i_2583_] += anInt9224;
			}
		} else if (i == 5) {
			for (int i_2584_ = 0; i_2584_ < anInt9185; i_2584_++) {
				int i_2585_ = (aByteArray9202[i_2584_] & 0xff) + i_2567_ * 8;
				if (i_2585_ < 0)
					i_2585_ = 0;
				else if (i_2585_ > 255)
					i_2585_ = 255;
				aByteArray9202[i_2584_] = (byte) i_2585_;
			}
			if (aClass116Array9218 != null) {
				for (int i_2586_ = 0; i_2586_ < anInt9217; i_2586_++) {
					Class116 class116 = aClass116Array9218[i_2586_];
					Class108 class108 = aClass108Array9211[i_2586_];
					class108.anInt1351 = (class108.anInt1351 * 328110239 & 0xffffff | 255 - ((aByteArray9202[class116.anInt1421 * 1723945109]) & 0xff) << 24) * 120490847;
				}
			}
		} else if (i == 7) {
			for (int i_2587_ = 0; i_2587_ < anInt9185; i_2587_++) {
				int i_2588_ = aShortArray9193[i_2587_] & 0xffff;
				int i_2589_ = i_2588_ >> 10 & 0x3f;
				int i_2590_ = i_2588_ >> 7 & 0x7;
				int i_2591_ = i_2588_ & 0x7f;
				i_2589_ = i_2589_ + i_2567_ & 0x3f;
				i_2590_ += i_2568_;
				if (i_2590_ < 0)
					i_2590_ = 0;
				else if (i_2590_ > 7)
					i_2590_ = 7;
				i_2591_ += i_2569_;
				if (i_2591_ < 0)
					i_2591_ = 0;
				else if (i_2591_ > 127)
					i_2591_ = 127;
				aShortArray9193[i_2587_] = (short) (i_2589_ << 10 | i_2590_ << 7 | i_2591_);
			}
			aBool9209 = true;
			if (aClass116Array9218 != null) {
				for (int i_2592_ = 0; i_2592_ < anInt9217; i_2592_++) {
					Class116 class116 = aClass116Array9218[i_2592_];
					Class108 class108 = aClass108Array9211[i_2592_];
					class108.anInt1351 = (class108.anInt1351 * 328110239 & ~0xffffff | ((Class656.anIntArray8393[Class453.method7333(((aShortArray9193[(class116.anInt1421 * 1723945109)]) & 0xffff), (byte) 10) & 0xffff]) & 0xffffff)) * 120490847;
				}
			}
		} else if (i == 8) {
			for (int i_2593_ = 0; i_2593_ < anInt9217; i_2593_++) {
				Class108 class108 = aClass108Array9211[i_2593_];
				class108.anInt1346 += i_2567_ * -653278629;
				class108.anInt1350 += i_2568_ * -1290559937;
			}
		} else if (i == 10) {
			for (int i_2594_ = 0; i_2594_ < anInt9217; i_2594_++) {
				Class108 class108 = aClass108Array9211[i_2594_];
				class108.aFloat1347 = class108.aFloat1347 * (float) i_2567_ / 128.0F;
				class108.aFloat1353 = class108.aFloat1353 * (float) i_2568_ / 128.0F;
			}
		} else if (i == 9) {
			for (int i_2595_ = 0; i_2595_ < anInt9217; i_2595_++) {
				Class108 class108 = aClass108Array9211[i_2595_];
				class108.anInt1349 = (class108.anInt1349 * 1169382623 + i_2567_ & 0x3fff) * -1991287009;
			}
		}
	}

	void method3025(int i, int i_2596_, int i_2597_, int i_2598_) {
		if (i == 0) {
			int i_2599_ = 0;
			anInt9247 = 0;
			anInt9212 = 0;
			anInt9224 = 0;
			for (int i_2600_ = 0; i_2600_ < anInt9177; i_2600_++) {
				anInt9247 += anIntArray9191[i_2600_];
				anInt9212 += anIntArray9184[i_2600_];
				anInt9224 += anIntArray9161[i_2600_];
				i_2599_++;
			}
			if (i_2599_ > 0) {
				anInt9247 = anInt9247 / i_2599_ + i_2596_;
				anInt9212 = anInt9212 / i_2599_ + i_2597_;
				anInt9224 = anInt9224 / i_2599_ + i_2598_;
			} else {
				anInt9247 = i_2596_;
				anInt9212 = i_2597_;
				anInt9224 = i_2598_;
			}
		} else if (i == 1) {
			for (int i_2601_ = 0; i_2601_ < anInt9177; i_2601_++) {
				anIntArray9191[i_2601_] += i_2596_;
				anIntArray9184[i_2601_] += i_2597_;
				anIntArray9161[i_2601_] += i_2598_;
			}
		} else if (i == 2) {
			for (int i_2602_ = 0; i_2602_ < anInt9177; i_2602_++) {
				anIntArray9191[i_2602_] -= anInt9247;
				anIntArray9184[i_2602_] -= anInt9212;
				anIntArray9161[i_2602_] -= anInt9224;
				if (i_2598_ != 0) {
					int i_2603_ = Class428.anIntArray4825[i_2598_];
					int i_2604_ = Class428.anIntArray4819[i_2598_];
					int i_2605_ = ((anIntArray9184[i_2602_] * i_2603_ + anIntArray9191[i_2602_] * i_2604_ + 16383) >> 14);
					anIntArray9184[i_2602_] = (anIntArray9184[i_2602_] * i_2604_ - anIntArray9191[i_2602_] * i_2603_ + 16383) >> 14;
					anIntArray9191[i_2602_] = i_2605_;
				}
				if (i_2596_ != 0) {
					int i_2606_ = Class428.anIntArray4825[i_2596_];
					int i_2607_ = Class428.anIntArray4819[i_2596_];
					int i_2608_ = ((anIntArray9184[i_2602_] * i_2607_ - anIntArray9161[i_2602_] * i_2606_ + 16383) >> 14);
					anIntArray9161[i_2602_] = (anIntArray9184[i_2602_] * i_2606_ + anIntArray9161[i_2602_] * i_2607_ + 16383) >> 14;
					anIntArray9184[i_2602_] = i_2608_;
				}
				if (i_2597_ != 0) {
					int i_2609_ = Class428.anIntArray4825[i_2597_];
					int i_2610_ = Class428.anIntArray4819[i_2597_];
					int i_2611_ = ((anIntArray9161[i_2602_] * i_2609_ + anIntArray9191[i_2602_] * i_2610_ + 16383) >> 14);
					anIntArray9161[i_2602_] = (anIntArray9161[i_2602_] * i_2610_ - anIntArray9191[i_2602_] * i_2609_ + 16383) >> 14;
					anIntArray9191[i_2602_] = i_2611_;
				}
				anIntArray9191[i_2602_] += anInt9247;
				anIntArray9184[i_2602_] += anInt9212;
				anIntArray9161[i_2602_] += anInt9224;
			}
		} else if (i == 3) {
			for (int i_2612_ = 0; i_2612_ < anInt9177; i_2612_++) {
				anIntArray9191[i_2612_] -= anInt9247;
				anIntArray9184[i_2612_] -= anInt9212;
				anIntArray9161[i_2612_] -= anInt9224;
				anIntArray9191[i_2612_] = anIntArray9191[i_2612_] * i_2596_ / 128;
				anIntArray9184[i_2612_] = anIntArray9184[i_2612_] * i_2597_ / 128;
				anIntArray9161[i_2612_] = anIntArray9161[i_2612_] * i_2598_ / 128;
				anIntArray9191[i_2612_] += anInt9247;
				anIntArray9184[i_2612_] += anInt9212;
				anIntArray9161[i_2612_] += anInt9224;
			}
		} else if (i == 5) {
			for (int i_2613_ = 0; i_2613_ < anInt9185; i_2613_++) {
				int i_2614_ = (aByteArray9202[i_2613_] & 0xff) + i_2596_ * 8;
				if (i_2614_ < 0)
					i_2614_ = 0;
				else if (i_2614_ > 255)
					i_2614_ = 255;
				aByteArray9202[i_2613_] = (byte) i_2614_;
			}
			if (aClass116Array9218 != null) {
				for (int i_2615_ = 0; i_2615_ < anInt9217; i_2615_++) {
					Class116 class116 = aClass116Array9218[i_2615_];
					Class108 class108 = aClass108Array9211[i_2615_];
					class108.anInt1351 = (class108.anInt1351 * 328110239 & 0xffffff | 255 - ((aByteArray9202[class116.anInt1421 * 1723945109]) & 0xff) << 24) * 120490847;
				}
			}
		} else if (i == 7) {
			for (int i_2616_ = 0; i_2616_ < anInt9185; i_2616_++) {
				int i_2617_ = aShortArray9193[i_2616_] & 0xffff;
				int i_2618_ = i_2617_ >> 10 & 0x3f;
				int i_2619_ = i_2617_ >> 7 & 0x7;
				int i_2620_ = i_2617_ & 0x7f;
				i_2618_ = i_2618_ + i_2596_ & 0x3f;
				i_2619_ += i_2597_;
				if (i_2619_ < 0)
					i_2619_ = 0;
				else if (i_2619_ > 7)
					i_2619_ = 7;
				i_2620_ += i_2598_;
				if (i_2620_ < 0)
					i_2620_ = 0;
				else if (i_2620_ > 127)
					i_2620_ = 127;
				aShortArray9193[i_2616_] = (short) (i_2618_ << 10 | i_2619_ << 7 | i_2620_);
			}
			aBool9209 = true;
			if (aClass116Array9218 != null) {
				for (int i_2621_ = 0; i_2621_ < anInt9217; i_2621_++) {
					Class116 class116 = aClass116Array9218[i_2621_];
					Class108 class108 = aClass108Array9211[i_2621_];
					class108.anInt1351 = (class108.anInt1351 * 328110239 & ~0xffffff | ((Class656.anIntArray8393[Class453.method7333(((aShortArray9193[(class116.anInt1421 * 1723945109)]) & 0xffff), (byte) 10) & 0xffff]) & 0xffffff)) * 120490847;
				}
			}
		} else if (i == 8) {
			for (int i_2622_ = 0; i_2622_ < anInt9217; i_2622_++) {
				Class108 class108 = aClass108Array9211[i_2622_];
				class108.anInt1346 += i_2596_ * -653278629;
				class108.anInt1350 += i_2597_ * -1290559937;
			}
		} else if (i == 10) {
			for (int i_2623_ = 0; i_2623_ < anInt9217; i_2623_++) {
				Class108 class108 = aClass108Array9211[i_2623_];
				class108.aFloat1347 = class108.aFloat1347 * (float) i_2596_ / 128.0F;
				class108.aFloat1353 = class108.aFloat1353 * (float) i_2597_ / 128.0F;
			}
		} else if (i == 9) {
			for (int i_2624_ = 0; i_2624_ < anInt9217; i_2624_++) {
				Class108 class108 = aClass108Array9211[i_2624_];
				class108.anInt1349 = (class108.anInt1349 * 1169382623 + i_2596_ & 0x3fff) * -1991287009;
			}
		}
	}

	void method14717() {
		aClass114Array9236 = null;
		aClass114Array9203 = null;
		aClass113Array9199 = null;
		aBool9221 = false;
	}

	public Class159[] method2899() {
		return aClass159Array9216;
	}

	public int method3053() {
		if (!aBool9221)
			method14659();
		return aShort9226;
	}

	int method14718(int i, int i_2625_) {
		i_2625_ = i_2625_ * (i & 0x7f) >> 7;
		if (i_2625_ < 2)
			i_2625_ = 2;
		else if (i_2625_ > 126)
			i_2625_ = 126;
		return (i & 0xff80) + i_2625_;
	}

	public int method2905() {
		return anInt9179;
	}
}
