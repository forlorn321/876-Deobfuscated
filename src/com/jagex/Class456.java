/* Class456 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class456 {
	static final int anInt4975 = 0;
	public boolean aBool4976;
	static int[] anIntArray4977;
	protected Class555 aClass555_4978;
	static final int anInt4979 = 0;
	public int anInt4980 = 0;
	static int[] anIntArray4981;
	public boolean aBool4982;
	public boolean aBool4983;
	public boolean aBool4984;
	int anInt4985;
	static final int anInt4986 = 128;
	protected int anInt4987;
	int anInt4988;
	public int[][][] anIntArrayArrayArray4989;
	static boolean[][] aBoolArrayArray4990;
	protected boolean aBool4991;
	byte[][][] aByteArrayArrayArray4992;
	byte[][][] aByteArrayArrayArray4993;
	short[][][] aShortArrayArrayArray4994;
	short[][][] aShortArrayArrayArray4995;
	protected byte[][][] aByteArrayArrayArray4996;
	int[] anIntArray4997;
	int[] anIntArray4998;
	int[] anIntArray4999;
	int[] anIntArray5000;
	int[] anIntArray5001;
	static int[][] anIntArrayArray5002;
	static final int anInt5003 = 1;
	static final int anInt5004 = 2;
	static final int anInt5005 = 3;
	static int[][] anIntArrayArray5006;
	Class24_Sub14 aClass24_Sub14_5007;
	static final int anInt5008 = 4;
	static final int anInt5009 = 8;
	protected int anInt5010;
	static final int anInt5011 = 32;
	Class24_Sub5 aClass24_Sub5_5012;
	boolean aBool5013;
	static final int anInt5014 = 256;
	static final int anInt5015 = 512;
	static final int anInt5016 = 2;
	static int[] anIntArray5017;
	static int[] anIntArray5018;
	static int[] anIntArray5019;
	static final int anInt5020 = 16;
	int[] anIntArray5021;
	public boolean aBool5022 = false;
	static int[] anIntArray5023;
	static final int anInt5024 = 64;
	static boolean[][] aBoolArrayArray5025;
	static int[][] anIntArrayArray5026;
	static int[][] anIntArrayArray5027;
	static int[][] anIntArrayArray5028;
	static int[] anIntArray5029;
	static int[][] anIntArrayArray5030;
	static int[][] anIntArrayArray5031;
	static int[][] anIntArrayArray5032;
	int[] anIntArray5033;
	static boolean[][] aBoolArrayArray5034;
	static int[][] anIntArrayArray5035;
	int[] anIntArray5036;
	static int[][] anIntArrayArray5037;
	static int[][] anIntArrayArray5038;
	int[] anIntArray5039;
	static int[] anIntArray5040 = { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
	int[] anIntArray5041;
	int[] anIntArray5042;
	int[] anIntArray5043;
	int[] anIntArray5044;
	int anInt5045;
	int anInt5046;
	public int anInt5047;
	int anInt5048;
	int anInt5049;
	static final int anInt5050 = 1;
	int anInt5051;
	int anInt5052;
	boolean aBool5053;
	boolean aBool5054;
	int[] anIntArray5055;
	boolean aBool5056;
	public byte[][][] aByteArrayArrayArray5057;
	static boolean[][] aBoolArrayArray5058;
	int[] anIntArray5059;
	int anInt5060;
	int[] anIntArray5061;
	protected Class470 aClass470_5062;

	void method7348(Class161 class161, Class7 class7, Class660 class660, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, byte i_6_) {
		int i_7_ = class161.method2595(i_0_, i_1_, (byte) 21);
		int i_8_ = class161.method2595(i_2_, i_1_, (byte) 43);
		int i_9_ = class161.method2595(i_2_, i_3_, (byte) 95);
		int i_10_ = class161.method2595(i_0_, i_3_, (byte) 91);
		boolean bool = aClass470_5062.method7706(i_0_, i_1_, (short) 18519);
		if (bool && i > 1 || !bool && i > 0) {
			boolean bool_11_ = true;
			if (null != class7 && !class7.aBool68)
				bool_11_ = false;
			else if (i_4_ == 0 && anInt5046 * 781976289 != 0)
				bool_11_ = false;
			else if (i_5_ > 0 && class660 != null && !class660.aBool8502)
				bool_11_ = false;
			if (bool_11_ && i_8_ == i_7_ && i_9_ == i_7_ && i_7_ == i_10_)
				aByteArrayArrayArray4996[i][i_0_][i_1_] |= 0x4;
		}
	}

	static final int method7349(int i, int i_12_, int i_13_, int i_14_) {
		int i_15_ = 65536 - Class428.anIntArray4819[i_13_ * 8192 / i_14_] >> 1;
		return (i_12_ * i_15_ >> 16) + (i * (65536 - i_15_) >> 16);
	}

	public void method7350(int i) {
		anIntArray4997 = null;
		anIntArray5043 = null;
		anIntArray4999 = null;
		anIntArray5000 = null;
		anIntArray5001 = null;
		aBool4991 = false;
	}

	public final void method7351(int i, int i_16_, int i_17_, int i_18_, int i_19_) {
		for (int i_20_ = 0; i_20_ < anInt5047 * 587945237; i_20_++)
			method7352(i_20_, i, i_16_, i_17_, i_18_, -375517254);
	}

	public final void method7352(int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_) {
		for (int i_26_ = i_22_; i_26_ < i_22_ + i_24_; i_26_++) {
			for (int i_27_ = i_21_; i_27_ < i_21_ + i_23_; i_27_++) {
				if (i_27_ >= 0 && i_27_ < 1665134431 * anInt5010 && i_26_ >= 0 && i_26_ < -1904271179 * anInt4987)
					anIntArrayArrayArray4989[i][i_27_][i_26_] = i > 0 ? (anIntArrayArrayArray4989[i - 1][i_27_][i_26_]) - 960 : 0;
			}
		}
		if (i_21_ > 0 && i_21_ < 1665134431 * anInt5010) {
			for (int i_28_ = 1 + i_22_; i_28_ < i_24_ + i_22_; i_28_++) {
				if (i_28_ >= 0 && i_28_ < -1904271179 * anInt4987)
					anIntArrayArrayArray4989[i][i_21_][i_28_] = anIntArrayArrayArray4989[i][i_21_ - 1][i_28_];
			}
		}
		if (i_22_ > 0 && i_22_ < anInt4987 * -1904271179) {
			for (int i_29_ = i_21_ + 1; i_29_ < i_21_ + i_23_; i_29_++) {
				if (i_29_ >= 0 && i_29_ < 1665134431 * anInt5010)
					anIntArrayArrayArray4989[i][i_29_][i_22_] = anIntArrayArrayArray4989[i][i_29_][i_22_ - 1];
			}
		}
		if (i_21_ >= 0 && i_22_ >= 0 && i_21_ < anInt5010 * 1665134431 && i_22_ < anInt4987 * -1904271179) {
			if (0 == i) {
				if (i_21_ > 0 && 0 != anIntArrayArrayArray4989[i][i_21_ - 1][i_22_])
					anIntArrayArrayArray4989[i][i_21_][i_22_] = anIntArrayArrayArray4989[i][i_21_ - 1][i_22_];
				else if (i_22_ > 0 && anIntArrayArrayArray4989[i][i_21_][i_22_ - 1] != 0)
					anIntArrayArrayArray4989[i][i_21_][i_22_] = anIntArrayArrayArray4989[i][i_21_][i_22_ - 1];
				else if (i_21_ > 0 && i_22_ > 0 && 0 != (anIntArrayArrayArray4989[i][i_21_ - 1][i_22_ - 1]))
					anIntArrayArrayArray4989[i][i_21_][i_22_] = anIntArrayArrayArray4989[i][i_21_ - 1][i_22_ - 1];
			} else if (i_21_ > 0 && (anIntArrayArrayArray4989[i - 1][i_21_ - 1][i_22_] != anIntArrayArrayArray4989[i][i_21_ - 1][i_22_]))
				anIntArrayArrayArray4989[i][i_21_][i_22_] = anIntArrayArrayArray4989[i][i_21_ - 1][i_22_];
			else if (i_22_ > 0 && (anIntArrayArrayArray4989[i][i_21_][i_22_ - 1] != anIntArrayArrayArray4989[i - 1][i_21_][i_22_ - 1]))
				anIntArrayArrayArray4989[i][i_21_][i_22_] = anIntArrayArrayArray4989[i][i_21_][i_22_ - 1];
			else if (i_21_ > 0 && i_22_ > 0 && (anIntArrayArrayArray4989[i][i_21_ - 1][i_22_ - 1] != (anIntArrayArrayArray4989[i - 1][i_21_ - 1][i_22_ - 1])))
				anIntArrayArrayArray4989[i][i_21_][i_22_] = anIntArrayArrayArray4989[i][i_21_ - 1][i_22_ - 1];
		}
	}

	public final void method7353(RSByteBuffer class527_sub38, int i, int i_30_, int i_31_, int i_32_, byte i_33_) {
		int i_34_ = i + i_31_;
		int i_35_ = i_32_ + i_30_;
		for (int i_36_ = 0; i_36_ < anInt5047 * 587945237; i_36_++) {
			for (int i_37_ = 0; i_37_ < 64; i_37_++) {
				for (int i_38_ = 0; i_38_ < 64; i_38_++)
					method7418(class527_sub38, i_36_, i + i_37_, i_30_ + i_38_, 0, 0, i_37_ + i_34_, i_35_ + i_38_, 0, false, -1813145292);
			}
		}
	}

	public final void method7354(int i, int i_39_, int i_40_, int i_41_) {
		for (int i_42_ = 0; i_42_ < anInt5047 * 587945237; i_42_++)
			method7352(i_42_, i, i_39_, i_40_, i_41_, -375517254);
	}

	public void method7355() {
		anIntArray4997 = null;
		anIntArray5043 = null;
		anIntArray4999 = null;
		anIntArray5000 = null;
		anIntArray5001 = null;
		aBool4991 = false;
	}

	public final void method7356(int i, int[][] is, int i_43_) {
		int[][] is_44_ = anIntArrayArrayArray4989[i];
		for (int i_45_ = 0; i_45_ < 1665134431 * anInt5010 + 1; i_45_++) {
			for (int i_46_ = 0; i_46_ < 1 + anInt4987 * -1904271179; i_46_++)
				is_44_[i_45_][i_46_] += is[i_45_][i_46_];
		}
	}

	void method7357(Class180 class180, int i, int i_47_, int i_48_, int i_49_, int i_50_, Class7 class7, int i_51_, int i_52_, int i_53_, int i_54_, boolean[] bools, int[] is, int[] is_55_, int[] is_56_, int[] is_57_, int[] is_58_, int[] is_59_, int[] is_60_, int[] is_61_, int[][] is_62_, Class161 class161, Class161 class161_63_, Class161 class161_64_) {
		if (class7 != null) {
			if (0 == i_52_)
				i_52_ = i_51_;
			if (0 == i_53_)
				i_53_ = i_51_;
			if (0 == i_54_)
				i_54_ = i_51_;
			Class7 class7_65_ = (Class7) aClass24_Sub5_5012.method81(i_51_ - 1, 1514518886);
			Class7 class7_66_ = (Class7) aClass24_Sub5_5012.method81(i_52_ - 1, 603498517);
			Class7 class7_67_ = (Class7) aClass24_Sub5_5012.method81(i_53_ - 1, 178243453);
			Class7 class7_68_ = (Class7) aClass24_Sub5_5012.method81(i_54_ - 1, 1334256119);
			for (int i_69_ = 0; i_69_ < -1214157947 * anInt5060; i_69_++) {
				boolean bool = false;
				int i_70_;
				if (bools[0 - anInt5045 * 2008969689 & 0x3] && anIntArray5033[0] == anInt5048 * 1442739543) {
					anIntArray5039[0] = anIntArray5059[1442739543 * anInt5048];
					anIntArray5039[1] = 1;
					anIntArray5039[2] = anIntArray5061[anInt5048 * 1442739543];
					anIntArray5039[3] = 1;
					anIntArray5039[4] = anIntArray5036[1442739543 * anInt5048];
					anIntArray5039[5] = anIntArray5061[anInt5048 * 1442739543];
					i_70_ = 6;
				} else if (bools[2 - 2008969689 * anInt5045 & 0x3] && anIntArray5033[2] == 1442739543 * anInt5048) {
					anIntArray5039[0] = anIntArray5059[anInt5048 * 1442739543];
					anIntArray5039[1] = 5;
					anIntArray5039[2] = anIntArray5061[1442739543 * anInt5048];
					anIntArray5039[3] = 5;
					anIntArray5039[4] = anIntArray5036[1442739543 * anInt5048];
					anIntArray5039[5] = anIntArray5061[anInt5048 * 1442739543];
					i_70_ = 6;
				} else if (bools[1 - anInt5045 * 2008969689 & 0x3] && 1442739543 * anInt5048 == anIntArray5033[1]) {
					anIntArray5039[0] = anIntArray5059[1442739543 * anInt5048];
					anIntArray5039[1] = 3;
					anIntArray5039[2] = anIntArray5061[anInt5048 * 1442739543];
					anIntArray5039[3] = 3;
					anIntArray5039[4] = anIntArray5036[anInt5048 * 1442739543];
					anIntArray5039[5] = anIntArray5061[1442739543 * anInt5048];
					i_70_ = 6;
				} else if (bools[3 - anInt5045 * 2008969689 & 0x3] && 1442739543 * anInt5048 == anIntArray5033[3]) {
					anIntArray5039[0] = anIntArray5059[anInt5048 * 1442739543];
					anIntArray5039[1] = 7;
					anIntArray5039[2] = anIntArray5061[1442739543 * anInt5048];
					anIntArray5039[3] = 7;
					anIntArray5039[4] = anIntArray5036[1442739543 * anInt5048];
					anIntArray5039[5] = anIntArray5061[1442739543 * anInt5048];
					i_70_ = 6;
				} else {
					anIntArray5039[0] = anIntArray5059[anInt5048 * 1442739543];
					anIntArray5039[1] = anIntArray5036[anInt5048 * 1442739543];
					anIntArray5039[2] = anIntArray5061[anInt5048 * 1442739543];
					i_70_ = 3;
				}
				for (int i_71_ = 0; i_71_ < i_70_; i_71_++) {
					int i_72_ = anIntArray5039[i_71_];
					int i_73_ = i_72_ - anInt5045 * -277027918 & 0x7;
					int i_74_ = anIntArray4977[i_72_];
					int i_75_ = anIntArray4981[i_72_];
					int i_76_;
					int i_77_;
					if (2008969689 * anInt5045 == 1) {
						i_76_ = i_75_;
						i_77_ = 512 - i_74_;
					} else if (2008969689 * anInt5045 == 2) {
						i_76_ = 512 - i_74_;
						i_77_ = 512 - i_75_;
					} else if (2008969689 * anInt5045 == 3) {
						i_76_ = 512 - i_75_;
						i_77_ = i_74_;
					} else {
						i_76_ = i_74_;
						i_77_ = i_75_;
					}
					is_55_[anInt5049 * -1297675597] = i_76_;
					is_56_[anInt5049 * -1297675597] = i_77_;
					if (is_60_ != null && aBoolArrayArray5058[781976289 * anInt5046][i_72_]) {
						int i_78_ = i_76_ + (i_47_ << 9);
						int i_79_ = (i_48_ << 9) + i_77_;
						is_60_[anInt5049 * -1297675597] = (class161_63_.method2593(i_78_, i_79_, -1151432033) - class161.method2593(i_78_, i_79_, -1151432033));
					}
					if (is_61_ != null) {
						if (null != class161_63_ && !(aBoolArrayArray5058[781976289 * anInt5046][i_72_])) {
							int i_80_ = i_76_ + (i_47_ << 9);
							int i_81_ = i_77_ + (i_48_ << 9);
							is_61_[anInt5049 * -1297675597] = (class161.method2593(i_80_, i_81_, -1151432033) - class161_63_.method2593(i_80_, i_81_, -1151432033));
						} else if (null != class161_64_ && !(aBoolArrayArray5025[781976289 * anInt5046][i_72_])) {
							int i_82_ = i_76_ + (i_47_ << 9);
							int i_83_ = i_77_ + (i_48_ << 9);
							is_61_[anInt5049 * -1297675597] = (class161_64_.method2593(i_82_, i_83_, -1151432033) - class161.method2593(i_82_, i_83_, -1151432033));
						}
					}
					if (i_72_ < 8 && anIntArray5044[i_73_] >= 0) {
						if (null != is)
							is[anInt5049 * -1297675597] = anIntArray5041[i_73_];
						is_59_[-1297675597 * anInt5049] = anIntArray5021[i_73_];
						is_58_[-1297675597 * anInt5049] = anIntArray5042[i_73_];
						is_57_[anInt5049 * -1297675597] = anIntArray4998[i_73_];
					} else {
						if (aBool5054 && (aBoolArrayArray5058[anInt5046 * 781976289][i_72_])) {
							is_58_[-1297675597 * anInt5049] = anInt4988 * -138056727;
							is_59_[-1297675597 * anInt5049] = -2112710167 * anInt5051;
							is_57_[-1297675597 * anInt5049] = -1731078331 * anInt5052;
						} else if (i_76_ == 0 && i_77_ == 0) {
							is_57_[anInt5049 * -1297675597] = is_62_[i_47_][i_48_];
							is_58_[anInt5049 * -1297675597] = 1277621507 * class7_65_.anInt67;
							is_59_[anInt5049 * -1297675597] = class7_65_.anInt66 * 592138937;
						} else if (i_76_ == 0 && i_77_ == 512) {
							is_57_[-1297675597 * anInt5049] = is_62_[i_47_][i_50_];
							is_58_[anInt5049 * -1297675597] = 1277621507 * class7_66_.anInt67;
							is_59_[anInt5049 * -1297675597] = class7_66_.anInt66 * 592138937;
						} else if (512 == i_76_ && i_77_ == 512) {
							is_57_[anInt5049 * -1297675597] = is_62_[i_49_][i_50_];
							is_58_[-1297675597 * anInt5049] = 1277621507 * class7_67_.anInt67;
							is_59_[-1297675597 * anInt5049] = class7_67_.anInt66 * 592138937;
						} else if (i_76_ == 512 && i_77_ == 0) {
							is_57_[-1297675597 * anInt5049] = is_62_[i_49_][i_48_];
							is_58_[anInt5049 * -1297675597] = 1277621507 * class7_68_.anInt67;
							is_59_[-1297675597 * anInt5049] = 592138937 * class7_68_.anInt66;
						} else {
							if (i_76_ < 256) {
								if (i_77_ < 256) {
									is_58_[anInt5049 * -1297675597] = class7_65_.anInt67 * 1277621507;
									is_59_[anInt5049 * -1297675597] = 592138937 * class7_65_.anInt66;
								} else {
									is_58_[-1297675597 * anInt5049] = class7_66_.anInt67 * 1277621507;
									is_59_[-1297675597 * anInt5049] = class7_66_.anInt66 * 592138937;
								}
							} else if (i_77_ < 256) {
								is_58_[-1297675597 * anInt5049] = class7_68_.anInt67 * 1277621507;
								is_59_[-1297675597 * anInt5049] = class7_68_.anInt66 * 592138937;
							} else {
								is_58_[-1297675597 * anInt5049] = class7_67_.anInt67 * 1277621507;
								is_59_[anInt5049 * -1297675597] = 592138937 * class7_67_.anInt66;
							}
							int i_84_ = Class249.method4658(is_62_[i_47_][i_48_], is_62_[i_49_][i_48_], i_76_ << 7 >> 9, -604110072);
							int i_85_ = Class249.method4658(is_62_[i_47_][i_50_], is_62_[i_49_][i_50_], i_76_ << 7 >> 9, -604110072);
							is_57_[anInt5049 * -1297675597] = Class249.method4658(i_84_, i_85_, i_77_ << 7 >> 9, -604110072);
						}
						if (null != is)
							is[anInt5049 * -1297675597] = is_57_[anInt5049 * -1297675597];
					}
					anInt5049 += -320293765;
				}
				anInt5048 += 723469927;
			}
			if (0 != 781976289 * anInt5046 && class7.aBool64)
				aBool5053 = true;
		}
	}

	public final void method7358(Class180 class180, Class161 class161, Class161 class161_86_, int i) {
		int[][] is = new int[anInt5010 * 1665134431][anInt4987 * -1904271179];
		if (null == anIntArray4997 || anInt4987 * -1904271179 != anIntArray4997.length) {
			anIntArray4997 = new int[anInt4987 * -1904271179];
			anIntArray5043 = new int[anInt4987 * -1904271179];
			anIntArray4999 = new int[-1904271179 * anInt4987];
			anIntArray5000 = new int[anInt4987 * -1904271179];
			anIntArray5001 = new int[-1904271179 * anInt4987];
		}
		for (int i_87_ = 0; i_87_ < 587945237 * anInt5047; i_87_++) {
			for (int i_88_ = 0; i_88_ < anInt4987 * -1904271179; i_88_++) {
				anIntArray4997[i_88_] = 0;
				anIntArray5043[i_88_] = 0;
				anIntArray4999[i_88_] = 0;
				anIntArray5000[i_88_] = 0;
				anIntArray5001[i_88_] = 0;
			}
			for (int i_89_ = -5; i_89_ < anInt5010 * 1665134431; i_89_++) {
				for (int i_90_ = 0; i_90_ < -1904271179 * anInt4987; i_90_++) {
					int i_91_ = i_89_ + 5;
					if (i_91_ < 1665134431 * anInt5010) {
						int i_92_ = (aShortArrayArrayArray4994[i_87_][i_91_][i_90_] & 0x7fff);
						if (i_92_ > 0) {
							Class7 class7 = ((Class7) aClass24_Sub5_5012.method81(i_92_ - 1, -469918527));
							anIntArray4997[i_90_] += class7.anInt65 * 126708699;
							anIntArray5043[i_90_] += class7.anInt70 * -1261235975;
							anIntArray4999[i_90_] += class7.anInt69 * -2060189111;
							anIntArray5000[i_90_] += class7.anInt72 * -1916962147;
							anIntArray5001[i_90_]++;
						}
					}
					int i_93_ = i_89_ - 5;
					if (i_93_ >= 0) {
						int i_94_ = (aShortArrayArrayArray4994[i_87_][i_93_][i_90_] & 0x7fff);
						if (i_94_ > 0) {
							Class7 class7 = ((Class7) aClass24_Sub5_5012.method81(i_94_ - 1, -1020575146));
							anIntArray4997[i_90_] -= 126708699 * class7.anInt65;
							anIntArray5043[i_90_] -= class7.anInt70 * -1261235975;
							anIntArray4999[i_90_] -= -2060189111 * class7.anInt69;
							anIntArray5000[i_90_] -= class7.anInt72 * -1916962147;
							anIntArray5001[i_90_]--;
						}
					}
				}
				if (i_89_ >= 0) {
					int i_95_ = 0;
					int i_96_ = 0;
					int i_97_ = 0;
					int i_98_ = 0;
					int i_99_ = 0;
					for (int i_100_ = -5; i_100_ < anInt4987 * -1904271179; i_100_++) {
						int i_101_ = i_100_ + 5;
						if (i_101_ < anInt4987 * -1904271179) {
							i_95_ += anIntArray4997[i_101_];
							i_96_ += anIntArray5043[i_101_];
							i_97_ += anIntArray4999[i_101_];
							i_98_ += anIntArray5000[i_101_];
							i_99_ += anIntArray5001[i_101_];
						}
						int i_102_ = i_100_ - 5;
						if (i_102_ >= 0) {
							i_95_ -= anIntArray4997[i_102_];
							i_96_ -= anIntArray5043[i_102_];
							i_97_ -= anIntArray4999[i_102_];
							i_98_ -= anIntArray5000[i_102_];
							i_99_ -= anIntArray5001[i_102_];
						}
						if (i_100_ >= 0 && i_98_ > 0 && i_99_ > 0)
							is[i_89_][i_100_] = Class625.method10351(i_95_ * 256 / i_98_, i_96_ / i_99_, i_97_ / i_99_, 1035908315);
					}
				}
			}
			if (aBool4983)
				method7360(class180, aClass555_4978.aClass161Array7434[i_87_], i_87_, is, i_87_ == 0 ? class161 : null, 0 == i_87_ ? class161_86_ : null, 1293420879);
			else
				method7359(class180, aClass555_4978.aClass161Array7434[i_87_], i_87_, is, i_87_ == 0 ? class161 : null, i_87_ == 0 ? class161_86_ : null, (byte) -30);
			aShortArrayArrayArray4994[i_87_] = null;
			aShortArrayArrayArray4995[i_87_] = null;
			aByteArrayArrayArray4992[i_87_] = null;
			aByteArrayArrayArray4993[i_87_] = null;
		}
		if (!aBool4976) {
			if (0 != -1869831017 * anInt4980)
				aClass555_4978.method9270((byte) 12);
			if (aBool4982)
				aClass555_4978.method9332(267665495);
		}
		for (int i_103_ = 0; i_103_ < anInt5047 * 587945237; i_103_++)
			aClass555_4978.aClass161Array7434[i_103_].method2588();
	}

	void method7359(Class180 class180, Class161 class161, int i, int[][] is, Class161 class161_104_, Class161 class161_105_, byte i_106_) {
		for (int i_107_ = 0; i_107_ < anInt5010 * 1665134431; i_107_++) {
			for (int i_108_ = 0; i_108_ < anInt4987 * -1904271179; i_108_++) {
				byte i_109_ = aByteArrayArrayArray4992[i][i_107_][i_108_];
				byte i_110_ = aByteArrayArrayArray4993[i][i_107_][i_108_];
				int i_111_ = aShortArrayArrayArray4995[i][i_107_][i_108_] & 0x7fff;
				int i_112_ = aShortArrayArrayArray4994[i][i_107_][i_108_] & 0x7fff;
				Class660 class660 = ((Class660) (0 != i_111_ ? aClass24_Sub14_5007.method81(i_111_ - 1, -1768120000) : null));
				Class7 class7 = ((Class7) (0 != i_112_ ? aClass24_Sub5_5012.method81(i_112_ - 1, 560772538) : null));
				if (0 == i_109_ && class660 == null)
					i_109_ = (byte) 12;
				Class660 class660_113_ = class660;
				if (class660 != null && 335838185 * class660.anInt8498 == -1 && -1 == -742413183 * class660.anInt8505) {
					class660_113_ = class660;
					class660 = null;
				}
				if (class660 != null || class7 != null) {
					anInt5060 = anIntArray5017[i_109_] * -31861427;
					anInt4985 = 275329041 * anIntArray5040[i_109_];
					int i_114_ = ((null != class7 ? -1214157947 * anInt5060 : 0) + (null != class660 ? anInt4985 * -954351375 : 0));
					int i_115_ = 0;
					anInt5045 = 0;
					anInt4988 = -1777329063 * (class660 != null ? class660.anInt8501 * 482678519 : -1);
					int i_116_ = null != class7 ? class7.anInt67 * 1277621507 : -1;
					int[] is_117_ = new int[i_114_];
					int[] is_118_ = new int[i_114_];
					int[] is_119_ = new int[i_114_];
					int[] is_120_ = new int[i_114_];
					int[] is_121_ = new int[i_114_];
					int[] is_122_ = new int[i_114_];
					int[] is_123_ = ((null != class660 && -1 != class660.anInt8505 * -742413183) ? new int[i_114_] : null);
					if (class660 != null) {
						for (int i_124_ = 0; i_124_ < anInt4985 * -954351375; i_124_++) {
							is_117_[i_115_] = (anIntArrayArray5026[i_109_][2008969689 * anInt5045]);
							is_118_[i_115_] = (anIntArrayArray5027[i_109_][2008969689 * anInt5045]);
							is_119_[i_115_] = (anIntArrayArray5028[i_109_][2008969689 * anInt5045]);
							is_121_[i_115_] = -138056727 * anInt4988;
							is_122_[i_115_] = 237632829 * class660.anInt8504;
							is_120_[i_115_] = class660.anInt8498 * 335838185;
							if (is_123_ != null)
								is_123_[i_115_] = -742413183 * class660.anInt8505;
							i_115_++;
							anInt5045 += -1163985303;
						}
						if (!aBool4976 && i == 0)
							aClass555_4978.method9233(i_107_, i_108_, class660.anInt8508 * -873535531, -509948648 * class660.anInt8506, -422438769 * class660.anInt8512, class660.anInt8511 * 52683443, class660.anInt8503 * 1106522129, 1126257915 * class660.anInt8513, (byte) 24);
					} else
						anInt5045 += 1600209113 * anInt4985;
					if (null != class7) {
						for (int i_125_ = 0; i_125_ < anInt5060 * -1214157947; i_125_++) {
							is_117_[i_115_] = (anIntArrayArray5026[i_109_][2008969689 * anInt5045]);
							is_118_[i_115_] = (anIntArrayArray5027[i_109_][anInt5045 * 2008969689]);
							is_119_[i_115_] = (anIntArrayArray5028[i_109_][anInt5045 * 2008969689]);
							is_121_[i_115_] = i_116_;
							is_122_[i_115_] = 592138937 * class7.anInt66;
							is_120_[i_115_] = is[i_107_][i_108_];
							if (null != is_123_)
								is_123_[i_115_] = is_120_[i_115_];
							i_115_++;
							anInt5045 += -1163985303;
						}
					}
					int i_126_ = anIntArray4977.length;
					int[] is_127_ = new int[i_126_];
					int[] is_128_ = new int[i_126_];
					int[] is_129_ = class161_105_ != null ? new int[i_126_] : null;
					int[] is_130_ = (null != class161_105_ || class161_104_ != null ? new int[i_126_] : null);
					for (int i_131_ = 0; i_131_ < i_126_; i_131_++) {
						int i_132_ = anIntArray4977[i_131_];
						int i_133_ = anIntArray4981[i_131_];
						if (i_110_ == 0) {
							is_127_[i_131_] = i_132_;
							is_128_[i_131_] = i_133_;
						} else if (i_110_ == 1) {
							int i_134_ = i_132_;
							is_127_[i_131_] = i_133_;
							is_128_[i_131_] = 512 - i_134_;
						} else if (2 == i_110_) {
							is_127_[i_131_] = 512 - i_132_;
							is_128_[i_131_] = 512 - i_133_;
						} else if (3 == i_110_) {
							int i_135_ = i_132_;
							is_127_[i_131_] = 512 - i_133_;
							is_128_[i_131_] = i_135_;
						}
						if (null != is_129_ && aBoolArrayArray5058[i_109_][i_131_]) {
							int i_136_ = (i_107_ << 9) + is_127_[i_131_];
							int i_137_ = is_128_[i_131_] + (i_108_ << 9);
							is_129_[i_131_] = (class161_105_.method2593(i_136_, i_137_, -1151432033) - class161.method2593(i_136_, i_137_, -1151432033));
						}
						if (null != is_130_) {
							if (class161_105_ != null && !aBoolArrayArray5058[i_109_][i_131_]) {
								int i_138_ = is_127_[i_131_] + (i_107_ << 9);
								int i_139_ = (i_108_ << 9) + is_128_[i_131_];
								is_130_[i_131_] = (class161.method2593(i_138_, i_139_, -1151432033) - (class161_105_.method2593(i_138_, i_139_, -1151432033)));
							} else if (null != class161_104_ && !(aBoolArrayArray5025[i_109_][i_131_])) {
								int i_140_ = is_127_[i_131_] + (i_107_ << 9);
								int i_141_ = is_128_[i_131_] + (i_108_ << 9);
								is_130_[i_131_] = (class161_104_.method2593(i_140_, i_141_, -1151432033) - class161.method2593(i_140_, i_141_, -1151432033));
							}
						}
					}
					int i_142_ = class161.method2595(i_107_, i_108_, (byte) 115);
					int i_143_ = class161.method2595(1 + i_107_, i_108_, (byte) 40);
					int i_144_ = class161.method2595(i_107_ + 1, 1 + i_108_, (byte) 62);
					int i_145_ = class161.method2595(i_107_, 1 + i_108_, (byte) 66);
					boolean bool = aClass470_5062.method7706(i_107_, i_108_, (short) -15966);
					if (bool && i > 1 || !bool && i > 0) {
						boolean bool_146_ = true;
						if (null != class7 && !class7.aBool68)
							bool_146_ = false;
						else if (i_112_ == 0 && i_109_ != 0)
							bool_146_ = false;
						else if (i_111_ > 0 && null != class660_113_ && !class660_113_.aBool8502)
							bool_146_ = false;
						if (bool_146_ && i_142_ == i_143_ && i_144_ == i_142_ && i_145_ == i_142_)
							aByteArrayArrayArray4996[i][i_107_][i_108_] |= 0x4;
					}
					Class178 class178 = new Class178();
					if (aBool4976) {
						class178.anInt2055 = (aClass555_4978.method9263(i_107_, i_108_, -672510268) * -2125644365);
						class178.anInt2050 = (aClass555_4978.method9227(i_107_, i_108_, (short) 23710) * 1806816041);
						class178.anInt2051 = (aClass555_4978.method9229(i_107_, i_108_, 2001176372) * 433693819);
						class178.anInt2053 = (aClass555_4978.method9247(i_107_, i_108_, -1137832299) * -1803459975);
						class178.anInt2054 = aClass555_4978.method9273(i_107_, i_108_, (byte) 1) * 420597091;
						class178.anInt2049 = (aClass555_4978.method9232(i_107_, i_108_, 598870759) * -834736135);
					}
					class161.method2589(i_107_, i_108_, is_127_, is_129_, is_128_, is_130_, is_117_, is_118_, is_119_, is_120_, is_123_, is_121_, is_122_, class178, false);
					aClass555_4978.method9225(i, i_107_, i_108_, -1841285265);
				}
			}
		}
	}

	void method7360(Class180 class180, Class161 class161, int i, int[][] is, Class161 class161_147_, Class161 class161_148_, int i_149_) {
		byte[][] is_150_ = aByteArrayArrayArray4992[i];
		byte[][] is_151_ = aByteArrayArrayArray4993[i];
		short[][] is_152_ = aShortArrayArrayArray4994[i];
		short[][] is_153_ = aShortArrayArrayArray4995[i];
		boolean[] bools = new boolean[4];
		for (int i_154_ = 0; i_154_ < 1665134431 * anInt5010; i_154_++) {
			int i_155_ = i_154_ < 1665134431 * anInt5010 - 1 ? 1 + i_154_ : i_154_;
			for (int i_156_ = 0; i_156_ < anInt4987 * -1904271179; i_156_++) {
				int i_157_ = (i_156_ < anInt4987 * -1904271179 - 1 ? i_156_ + 1 : i_156_);
				anInt5046 = is_150_[i_154_][i_156_] * 246989089;
				anInt5045 = -1163985303 * is_151_[i_154_][i_156_];
				int i_158_ = is_153_[i_154_][i_156_] & 0x7fff;
				int i_159_ = is_152_[i_154_][i_156_] & 0x7fff;
				if (i_158_ != 0 || 0 != i_159_) {
					Class660 class660 = ((Class660) (0 != i_158_ ? aClass24_Sub14_5007.method81(i_158_ - 1, -2123246974) : null));
					Class7 class7 = (Class7) (0 != i_159_ ? aClass24_Sub5_5012.method81(i_159_ - 1, -1762437305) : null);
					if (0 == anInt5046 * 781976289 && class660 == null)
						anInt5046 = -1331098228;
					aBool5053 = false;
					aBool5054 = false;
					boolean[] bools_160_ = bools;
					boolean[] bools_161_ = bools;
					boolean[] bools_162_ = bools;
					bools[3] = false;
					bools_162_[2] = false;
					bools_161_[1] = false;
					bools_160_[0] = false;
					Class660 class660_163_ = class660;
					if (class660 != null) {
						if (class660.anInt8498 * 335838185 == -1 && -1 == class660.anInt8505 * -742413183) {
							class660_163_ = class660;
							class660 = null;
						} else if (class7 != null && anInt5046 * 781976289 != 0)
							aBool5054 = class660.aBool8507;
					}
					anInt5045 = method7361(i_159_, i_154_, i_156_, i_155_, i_157_, class161, is_152_, (byte) -11) * -1163985303;
					for (int i_164_ = 0; i_164_ < 13; i_164_++) {
						anIntArray5044[i_164_] = -1;
						anIntArray5055[i_164_] = 1;
					}
					method7362(class180, class660, class7, i_154_, i_156_, is_150_, is_151_, is_153_, bools, -435873304);
					aBool5013 = (!aBool5054 && !bools[0] && !bools[2] && !bools[1] && !bools[3]);
					method7363(class660, class7, 2133763938);
					int i_165_ = -954351375 * anInt4985 + anInt5060 * -1214157947;
					if (i_165_ <= 0)
						aClass555_4978.method9225(i, i_154_, i_156_, -1730343994);
					else {
						if (bools[0])
							i_165_++;
						if (bools[2])
							i_165_++;
						if (bools[1])
							i_165_++;
						if (bools[3])
							i_165_++;
						anInt5048 = 0;
						anInt5049 = 0;
						int i_166_ = 3 * i_165_;
						int[] is_167_ = aBool5056 ? new int[i_166_] : null;
						int[] is_168_ = new int[i_166_];
						int[] is_169_ = new int[i_166_];
						int[] is_170_ = new int[i_166_];
						int[] is_171_ = new int[i_166_];
						int[] is_172_ = new int[i_166_];
						int[] is_173_ = class161_148_ != null ? new int[i_166_] : null;
						int[] is_174_ = (null != class161_148_ || class161_147_ != null ? new int[i_166_] : null);
						for (int i_175_ = 0; i_175_ < i_166_; i_175_++)
							is_171_[i_175_] = -1;
						method7364(class180, i, i_154_, i_156_, class660, bools, is_167_, is_168_, is_169_, is_170_, is_171_, is_172_, is_173_, is_174_, class161, class161_148_, class161_147_, -1112241514);
						int i_176_ = is_152_[i_154_][i_157_] & 0x7fff;
						int i_177_ = is_152_[i_155_][i_157_] & 0x7fff;
						int i_178_ = is_152_[i_155_][i_156_] & 0x7fff;
						method7365(class180, i, i_154_, i_156_, i_155_, i_157_, class7, i_159_, i_176_, i_177_, i_178_, bools, is_167_, is_168_, is_169_, is_170_, is_171_, is_172_, is_173_, is_174_, is, class161, class161_148_, class161_147_, -2061517479);
						method7348(class161, class7, class660_163_, i, i_154_, i_156_, i_155_, i_157_, i_159_, i_158_, (byte) -103);
						Class178 class178 = new Class178();
						if (aBool4976) {
							class178.anInt2055 = (aClass555_4978.method9263(i_154_, i_156_, -1398303356) * -2125644365);
							class178.anInt2050 = (aClass555_4978.method9227(i_154_, i_156_, (short) 6261) * 1806816041);
							class178.anInt2051 = (aClass555_4978.method9229(i_154_, i_156_, 83403496) * 433693819);
							class178.anInt2053 = (aClass555_4978.method9247(i_154_, i_156_, -884428367) * -1803459975);
							class178.anInt2054 = (aClass555_4978.method9273(i_154_, i_156_, (byte) 1) * 420597091);
							class178.anInt2049 = (aClass555_4978.method9232(i_154_, i_156_, 598870759) * -834736135);
						}
						class161.method2604(i_154_, i_156_, is_168_, is_173_, is_169_, is_174_, is_170_, is_167_, is_171_, is_172_, class178, aBool5053);
						aClass555_4978.method9225(i, i_154_, i_156_, -1890790019);
					}
				}
			}
		}
	}

	int method7361(int i, int i_179_, int i_180_, int i_181_, int i_182_, Class161 class161, short[][] is, byte i_183_) {
		if ((anInt5046 * 781976289 == 0 || 12 == anInt5046 * 781976289) && i_179_ > 0 && i_180_ > 0 && i_179_ < anInt5010 * 1665134431 && i_180_ < -1904271179 * anInt4987) {
			int i_184_ = 0;
			int i_185_ = 0;
			int i_186_ = 0;
			int i_187_ = 0;
			i_184_ = i_184_ + (i == is[i_179_ - 1][i_180_ - 1] ? 1 : -1);
			i_185_ = i_185_ + (i == is[i_181_][i_180_ - 1] ? 1 : -1);
			i_186_ = i_186_ + (i == is[i_181_][i_182_] ? 1 : -1);
			i_187_ = i_187_ + (i == is[i_179_ - 1][i_182_] ? 1 : -1);
			if (i == is[i_179_][i_180_ - 1]) {
				i_184_++;
				i_185_++;
			} else {
				i_184_--;
				i_185_--;
			}
			if (is[i_181_][i_180_] == i) {
				i_185_++;
				i_186_++;
			} else {
				i_185_--;
				i_186_--;
			}
			if (is[i_179_][i_182_] == i) {
				i_186_++;
				i_187_++;
			} else {
				i_186_--;
				i_187_--;
			}
			if (i == is[i_179_ - 1][i_180_]) {
				i_187_++;
				i_184_++;
			} else {
				i_187_--;
				i_184_--;
			}
			int i_188_ = i_184_ - i_186_;
			if (i_188_ < 0)
				i_188_ = -i_188_;
			int i_189_ = i_185_ - i_187_;
			if (i_189_ < 0)
				i_189_ = -i_189_;
			if (i_189_ == i_188_) {
				i_188_ = (class161.method2595(i_179_, i_180_, (byte) 80) - class161.method2595(i_181_, i_182_, (byte) 62));
				if (i_188_ < 0)
					i_188_ = -i_188_;
				i_189_ = (class161.method2595(i_181_, i_180_, (byte) 107) - class161.method2595(i_179_, i_182_, (byte) 30));
				if (i_189_ < 0)
					i_189_ = -i_189_;
			}
			return i_188_ < i_189_ ? 1 : 0;
		}
		return anInt5045 * 2008969689;
	}

	void method7362(Class180 class180, Class660 class660, Class7 class7, int i, int i_190_, byte[][] is, byte[][] is_191_, short[][] is_192_, boolean[] bools, int i_193_) {
		boolean[] bools_194_ = (null != class660 && class660.aBool8507 ? aBoolArrayArray5034[anInt5046 * 781976289] : aBoolArrayArray4990[781976289 * anInt5046]);
		method7393(class180, class660, class7, i, i_190_, 1665134431 * anInt5010, anInt4987 * -1904271179, is_192_, is, is_191_, bools, (byte) 92);
		aBool5056 = class660 != null && (-742413183 * class660.anInt8505 != class660.anInt8498 * 335838185);
		if (!aBool5056) {
			for (int i_195_ = 0; i_195_ < 8; i_195_++) {
				if (anIntArray5044[i_195_] >= 0 && anIntArray4998[i_195_] != anIntArray5041[i_195_]) {
					aBool5056 = true;
					break;
				}
			}
		}
		if (!bools_194_[1 + 2008969689 * anInt5045 & 0x3]) {
			boolean[] bools_196_ = bools;
			int i_197_ = 1;
			bools_196_[i_197_] = (bools_196_[i_197_] | (anIntArray5055[2] & anIntArray5055[4]) == 0);
		}
		if (!bools_194_[3 + anInt5045 * 2008969689 & 0x3]) {
			boolean[] bools_198_ = bools;
			int i_199_ = 3;
			bools_198_[i_199_] = bools_198_[i_199_] | 0 == (anIntArray5055[6] & anIntArray5055[0]);
		}
		if (!bools_194_[anInt5045 * 2008969689 + 0 & 0x3]) {
			boolean[] bools_200_ = bools;
			int i_201_ = 0;
			bools_200_[i_201_] = bools_200_[i_201_] | 0 == (anIntArray5055[0] & anIntArray5055[2]);
		}
		if (!bools_194_[2 + anInt5045 * 2008969689 & 0x3]) {
			boolean[] bools_202_ = bools;
			int i_203_ = 2;
			bools_202_[i_203_] = (bools_202_[i_203_] | (anIntArray5055[4] & anIntArray5055[6]) == 0);
		}
		if (!aBool5054 && (0 == anInt5046 * 781976289 || 781976289 * anInt5046 == 12)) {
			if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
				boolean[] bools_204_ = bools;
				bools[3] = false;
				bools_204_[0] = false;
				anInt5046 = (anInt5046 * 781976289 == 0 ? 13 : 14) * 246989089;
				anInt5045 = 0;
			} else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
				boolean[] bools_205_ = bools;
				bools[1] = false;
				bools_205_[0] = false;
				anInt5046 = (781976289 * anInt5046 == 0 ? 13 : 14) * 246989089;
				anInt5045 = 803011387;
			} else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
				boolean[] bools_206_ = bools;
				bools[2] = false;
				bools_206_[1] = false;
				anInt5046 = 246989089 * (0 == anInt5046 * 781976289 ? 13 : 14);
				anInt5045 = 1966996690;
			} else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
				boolean[] bools_207_ = bools;
				bools[3] = false;
				bools_207_[2] = false;
				anInt5046 = 246989089 * (0 == anInt5046 * 781976289 ? 13 : 14);
				anInt5045 = -1163985303;
			}
		}
	}

	void method7363(Class660 class660, Class7 class7, int i) {
		if (aBool5013) {
			anIntArray5059 = anIntArrayArray5026[781976289 * anInt5046];
			anIntArray5036 = anIntArrayArray5027[anInt5046 * 781976289];
			anIntArray5061 = anIntArrayArray5028[anInt5046 * 781976289];
			anInt4985 = 275329041 * (null != class660 ? anIntArray5040[781976289 * anInt5046] : 0);
			anInt5060 = (null != class7 ? anIntArray5017[anInt5046 * 781976289] : 0) * -31861427;
		} else if (aBool5054) {
			anIntArray5059 = anIntArrayArray5006[781976289 * anInt5046];
			anIntArray5036 = anIntArrayArray5037[anInt5046 * 781976289];
			anIntArray5061 = anIntArrayArray5038[781976289 * anInt5046];
			anInt4985 = (class660 != null ? anIntArray5029[781976289 * anInt5046] : 0) * 275329041;
			anInt5060 = -31861427 * (class7 != null ? anIntArray5023[anInt5046 * 781976289] : 0);
			anIntArray5033 = anIntArrayArray5035[781976289 * anInt5046];
		} else {
			anIntArray5059 = anIntArrayArray5031[781976289 * anInt5046];
			anIntArray5036 = anIntArrayArray5032[781976289 * anInt5046];
			anIntArray5061 = anIntArrayArray5030[781976289 * anInt5046];
			anInt4985 = 275329041 * (class660 != null ? anIntArray5018[781976289 * anInt5046] : 0);
			anInt5060 = (class7 != null ? anIntArray5019[781976289 * anInt5046] : 0) * -31861427;
			anIntArray5033 = anIntArrayArray5002[anInt5046 * 781976289];
		}
	}

	void method7364(Class180 class180, int i, int i_208_, int i_209_, Class660 class660, boolean[] bools, int[] is, int[] is_210_, int[] is_211_, int[] is_212_, int[] is_213_, int[] is_214_, int[] is_215_, int[] is_216_, Class161 class161, Class161 class161_217_, Class161 class161_218_, int i_219_) {
		anInt5052 = 1931074675;
		anInt4988 = 1777329063;
		anInt5051 = -674342656;
		if (class660 != null) {
			anInt5052 = 1656691285 * class660.anInt8498;
			anInt4988 = class660.anInt8501 * -1200095265;
			anInt5051 = class660.anInt8504 * -1784995787;
			int i_220_ = Class245.method4622(class180, class660, 657148233);
			for (int i_221_ = 0; i_221_ < -954351375 * anInt4985; i_221_++) {
				boolean bool = false;
				int i_222_;
				if (bools[0 - 2008969689 * anInt5045 & 0x3] && anInt5048 * 1442739543 == anIntArray5033[0]) {
					anIntArray5039[0] = anIntArray5059[anInt5048 * 1442739543];
					anIntArray5039[1] = 1;
					anIntArray5039[2] = anIntArray5061[anInt5048 * 1442739543];
					anIntArray5039[3] = 1;
					anIntArray5039[4] = anIntArray5036[anInt5048 * 1442739543];
					anIntArray5039[5] = anIntArray5061[anInt5048 * 1442739543];
					i_222_ = 6;
				} else if (bools[2 - anInt5045 * 2008969689 & 0x3] && anInt5048 * 1442739543 == anIntArray5033[2]) {
					anIntArray5039[0] = anIntArray5059[anInt5048 * 1442739543];
					anIntArray5039[1] = 5;
					anIntArray5039[2] = anIntArray5061[1442739543 * anInt5048];
					anIntArray5039[3] = 5;
					anIntArray5039[4] = anIntArray5036[anInt5048 * 1442739543];
					anIntArray5039[5] = anIntArray5061[1442739543 * anInt5048];
					i_222_ = 6;
				} else if (bools[1 - 2008969689 * anInt5045 & 0x3] && 1442739543 * anInt5048 == anIntArray5033[1]) {
					anIntArray5039[0] = anIntArray5059[1442739543 * anInt5048];
					anIntArray5039[1] = 3;
					anIntArray5039[2] = anIntArray5061[anInt5048 * 1442739543];
					anIntArray5039[3] = 3;
					anIntArray5039[4] = anIntArray5036[1442739543 * anInt5048];
					anIntArray5039[5] = anIntArray5061[1442739543 * anInt5048];
					i_222_ = 6;
				} else if (bools[3 - 2008969689 * anInt5045 & 0x3] && anIntArray5033[3] == anInt5048 * 1442739543) {
					anIntArray5039[0] = anIntArray5059[1442739543 * anInt5048];
					anIntArray5039[1] = 7;
					anIntArray5039[2] = anIntArray5061[anInt5048 * 1442739543];
					anIntArray5039[3] = 7;
					anIntArray5039[4] = anIntArray5036[anInt5048 * 1442739543];
					anIntArray5039[5] = anIntArray5061[1442739543 * anInt5048];
					i_222_ = 6;
				} else {
					anIntArray5039[0] = anIntArray5059[anInt5048 * 1442739543];
					anIntArray5039[1] = anIntArray5036[1442739543 * anInt5048];
					anIntArray5039[2] = anIntArray5061[1442739543 * anInt5048];
					i_222_ = 3;
				}
				for (int i_223_ = 0; i_223_ < i_222_; i_223_++) {
					int i_224_ = anIntArray5039[i_223_];
					int i_225_ = i_224_ - -277027918 * anInt5045 & 0x7;
					int i_226_ = anIntArray4977[i_224_];
					int i_227_ = anIntArray4981[i_224_];
					int i_228_;
					int i_229_;
					if (1 == anInt5045 * 2008969689) {
						i_228_ = i_227_;
						i_229_ = 512 - i_226_;
					} else if (2 == 2008969689 * anInt5045) {
						i_228_ = 512 - i_226_;
						i_229_ = 512 - i_227_;
					} else if (anInt5045 * 2008969689 == 3) {
						i_228_ = 512 - i_227_;
						i_229_ = i_226_;
					} else {
						i_228_ = i_226_;
						i_229_ = i_227_;
					}
					is_210_[-1297675597 * anInt5049] = i_228_;
					is_211_[anInt5049 * -1297675597] = i_229_;
					if (is_215_ != null && (aBoolArrayArray5058[anInt5046 * 781976289][i_224_])) {
						int i_230_ = (i_208_ << 9) + i_228_;
						int i_231_ = i_229_ + (i_209_ << 9);
						is_215_[-1297675597 * anInt5049] = (class161_217_.method2593(i_230_, i_231_, -1151432033) - class161.method2593(i_230_, i_231_, -1151432033));
					}
					if (null != is_216_) {
						if (null != class161_217_ && !(aBoolArrayArray5058[781976289 * anInt5046][i_224_])) {
							int i_232_ = (i_208_ << 9) + i_228_;
							int i_233_ = i_229_ + (i_209_ << 9);
							is_216_[anInt5049 * -1297675597] = (class161.method2593(i_232_, i_233_, -1151432033) - class161_217_.method2593(i_232_, i_233_, -1151432033));
						} else if (class161_218_ != null && !(aBoolArrayArray5025[anInt5046 * 781976289][i_224_])) {
							int i_234_ = (i_208_ << 9) + i_228_;
							int i_235_ = i_229_ + (i_209_ << 9);
							is_216_[anInt5049 * -1297675597] = (class161_218_.method2593(i_234_, i_235_, -1151432033) - class161.method2593(i_234_, i_235_, -1151432033));
						}
					}
					if (i_224_ < 8 && (anIntArray5044[i_225_] > class660.anInt8500 * 194118137)) {
						if (null != is)
							is[-1297675597 * anInt5049] = anIntArray5041[i_225_];
						is_214_[-1297675597 * anInt5049] = anIntArray5021[i_225_];
						is_213_[-1297675597 * anInt5049] = anIntArray5042[i_225_];
						is_212_[-1297675597 * anInt5049] = anIntArray4998[i_225_];
					} else {
						if (null != is)
							is[-1297675597 * anInt5049] = i_220_;
						is_213_[anInt5049 * -1297675597] = class660.anInt8501 * 482678519;
						is_214_[-1297675597 * anInt5049] = class660.anInt8504 * 237632829;
						is_212_[anInt5049 * -1297675597] = anInt5052 * -1731078331;
					}
					anInt5049 += -320293765;
				}
				anInt5048 += 723469927;
			}
			if (!aBool4976 && 0 == i)
				aClass555_4978.method9233(i_208_, i_209_, -873535531 * class660.anInt8508, -509948648 * class660.anInt8506, class660.anInt8512 * -422438769, 52683443 * class660.anInt8511, 1106522129 * class660.anInt8503, 1126257915 * class660.anInt8513, (byte) 10);
			if (781976289 * anInt5046 != 12 && -1 != 335838185 * class660.anInt8498 && class660.aBool8510)
				aBool5053 = true;
		} else if (aBool5013)
			anInt5048 += anIntArray5040[anInt5046 * 781976289] * 723469927;
		else if (aBool5054)
			anInt5048 += 723469927 * anIntArray5029[781976289 * anInt5046];
		else
			anInt5048 += 723469927 * anIntArray5018[781976289 * anInt5046];
	}

	void method7365(Class180 class180, int i, int i_236_, int i_237_, int i_238_, int i_239_, Class7 class7, int i_240_, int i_241_, int i_242_, int i_243_, boolean[] bools, int[] is, int[] is_244_, int[] is_245_, int[] is_246_, int[] is_247_, int[] is_248_, int[] is_249_, int[] is_250_, int[][] is_251_, Class161 class161, Class161 class161_252_, Class161 class161_253_, int i_254_) {
		if (class7 != null) {
			if (0 == i_241_)
				i_241_ = i_240_;
			if (0 == i_242_)
				i_242_ = i_240_;
			if (0 == i_243_)
				i_243_ = i_240_;
			Class7 class7_255_ = (Class7) aClass24_Sub5_5012.method81(i_240_ - 1, 1456785347);
			Class7 class7_256_ = (Class7) aClass24_Sub5_5012.method81(i_241_ - 1, 1761353599);
			Class7 class7_257_ = (Class7) aClass24_Sub5_5012.method81(i_242_ - 1, 1505547633);
			Class7 class7_258_ = ((Class7) aClass24_Sub5_5012.method81(i_243_ - 1, -1433838041));
			for (int i_259_ = 0; i_259_ < -1214157947 * anInt5060; i_259_++) {
				boolean bool = false;
				int i_260_;
				if (bools[0 - anInt5045 * 2008969689 & 0x3] && anIntArray5033[0] == anInt5048 * 1442739543) {
					anIntArray5039[0] = anIntArray5059[1442739543 * anInt5048];
					anIntArray5039[1] = 1;
					anIntArray5039[2] = anIntArray5061[anInt5048 * 1442739543];
					anIntArray5039[3] = 1;
					anIntArray5039[4] = anIntArray5036[1442739543 * anInt5048];
					anIntArray5039[5] = anIntArray5061[anInt5048 * 1442739543];
					i_260_ = 6;
				} else if (bools[2 - 2008969689 * anInt5045 & 0x3] && anIntArray5033[2] == 1442739543 * anInt5048) {
					anIntArray5039[0] = anIntArray5059[anInt5048 * 1442739543];
					anIntArray5039[1] = 5;
					anIntArray5039[2] = anIntArray5061[1442739543 * anInt5048];
					anIntArray5039[3] = 5;
					anIntArray5039[4] = anIntArray5036[1442739543 * anInt5048];
					anIntArray5039[5] = anIntArray5061[anInt5048 * 1442739543];
					i_260_ = 6;
				} else if (bools[1 - anInt5045 * 2008969689 & 0x3] && 1442739543 * anInt5048 == anIntArray5033[1]) {
					anIntArray5039[0] = anIntArray5059[1442739543 * anInt5048];
					anIntArray5039[1] = 3;
					anIntArray5039[2] = anIntArray5061[anInt5048 * 1442739543];
					anIntArray5039[3] = 3;
					anIntArray5039[4] = anIntArray5036[anInt5048 * 1442739543];
					anIntArray5039[5] = anIntArray5061[1442739543 * anInt5048];
					i_260_ = 6;
				} else if (bools[3 - anInt5045 * 2008969689 & 0x3] && 1442739543 * anInt5048 == anIntArray5033[3]) {
					anIntArray5039[0] = anIntArray5059[anInt5048 * 1442739543];
					anIntArray5039[1] = 7;
					anIntArray5039[2] = anIntArray5061[1442739543 * anInt5048];
					anIntArray5039[3] = 7;
					anIntArray5039[4] = anIntArray5036[1442739543 * anInt5048];
					anIntArray5039[5] = anIntArray5061[1442739543 * anInt5048];
					i_260_ = 6;
				} else {
					anIntArray5039[0] = anIntArray5059[anInt5048 * 1442739543];
					anIntArray5039[1] = anIntArray5036[anInt5048 * 1442739543];
					anIntArray5039[2] = anIntArray5061[anInt5048 * 1442739543];
					i_260_ = 3;
				}
				for (int i_261_ = 0; i_261_ < i_260_; i_261_++) {
					int i_262_ = anIntArray5039[i_261_];
					int i_263_ = i_262_ - anInt5045 * -277027918 & 0x7;
					int i_264_ = anIntArray4977[i_262_];
					int i_265_ = anIntArray4981[i_262_];
					int i_266_;
					int i_267_;
					if (2008969689 * anInt5045 == 1) {
						i_266_ = i_265_;
						i_267_ = 512 - i_264_;
					} else if (2008969689 * anInt5045 == 2) {
						i_266_ = 512 - i_264_;
						i_267_ = 512 - i_265_;
					} else if (2008969689 * anInt5045 == 3) {
						i_266_ = 512 - i_265_;
						i_267_ = i_264_;
					} else {
						i_266_ = i_264_;
						i_267_ = i_265_;
					}
					is_244_[anInt5049 * -1297675597] = i_266_;
					is_245_[anInt5049 * -1297675597] = i_267_;
					if (is_249_ != null && (aBoolArrayArray5058[781976289 * anInt5046][i_262_])) {
						int i_268_ = i_266_ + (i_236_ << 9);
						int i_269_ = (i_237_ << 9) + i_267_;
						is_249_[anInt5049 * -1297675597] = (class161_252_.method2593(i_268_, i_269_, -1151432033) - class161.method2593(i_268_, i_269_, -1151432033));
					}
					if (is_250_ != null) {
						if (null != class161_252_ && !(aBoolArrayArray5058[781976289 * anInt5046][i_262_])) {
							int i_270_ = i_266_ + (i_236_ << 9);
							int i_271_ = i_267_ + (i_237_ << 9);
							is_250_[anInt5049 * -1297675597] = (class161.method2593(i_270_, i_271_, -1151432033) - class161_252_.method2593(i_270_, i_271_, -1151432033));
						} else if (null != class161_253_ && !(aBoolArrayArray5025[781976289 * anInt5046][i_262_])) {
							int i_272_ = i_266_ + (i_236_ << 9);
							int i_273_ = i_267_ + (i_237_ << 9);
							is_250_[anInt5049 * -1297675597] = (class161_253_.method2593(i_272_, i_273_, -1151432033) - class161.method2593(i_272_, i_273_, -1151432033));
						}
					}
					if (i_262_ < 8 && anIntArray5044[i_263_] >= 0) {
						if (null != is)
							is[anInt5049 * -1297675597] = anIntArray5041[i_263_];
						is_248_[-1297675597 * anInt5049] = anIntArray5021[i_263_];
						is_247_[-1297675597 * anInt5049] = anIntArray5042[i_263_];
						is_246_[anInt5049 * -1297675597] = anIntArray4998[i_263_];
					} else {
						if (aBool5054 && (aBoolArrayArray5058[anInt5046 * 781976289][i_262_])) {
							is_247_[-1297675597 * anInt5049] = anInt4988 * -138056727;
							is_248_[-1297675597 * anInt5049] = -2112710167 * anInt5051;
							is_246_[-1297675597 * anInt5049] = -1731078331 * anInt5052;
						} else if (i_266_ == 0 && i_267_ == 0) {
							is_246_[anInt5049 * -1297675597] = is_251_[i_236_][i_237_];
							is_247_[anInt5049 * -1297675597] = 1277621507 * class7_255_.anInt67;
							is_248_[anInt5049 * -1297675597] = class7_255_.anInt66 * 592138937;
						} else if (i_266_ == 0 && i_267_ == 512) {
							is_246_[-1297675597 * anInt5049] = is_251_[i_236_][i_239_];
							is_247_[anInt5049 * -1297675597] = 1277621507 * class7_256_.anInt67;
							is_248_[anInt5049 * -1297675597] = class7_256_.anInt66 * 592138937;
						} else if (512 == i_266_ && i_267_ == 512) {
							is_246_[anInt5049 * -1297675597] = is_251_[i_238_][i_239_];
							is_247_[-1297675597 * anInt5049] = 1277621507 * class7_257_.anInt67;
							is_248_[-1297675597 * anInt5049] = class7_257_.anInt66 * 592138937;
						} else if (i_266_ == 512 && i_267_ == 0) {
							is_246_[-1297675597 * anInt5049] = is_251_[i_238_][i_237_];
							is_247_[anInt5049 * -1297675597] = 1277621507 * class7_258_.anInt67;
							is_248_[-1297675597 * anInt5049] = 592138937 * class7_258_.anInt66;
						} else {
							if (i_266_ < 256) {
								if (i_267_ < 256) {
									is_247_[anInt5049 * -1297675597] = class7_255_.anInt67 * 1277621507;
									is_248_[anInt5049 * -1297675597] = 592138937 * class7_255_.anInt66;
								} else {
									is_247_[-1297675597 * anInt5049] = class7_256_.anInt67 * 1277621507;
									is_248_[-1297675597 * anInt5049] = class7_256_.anInt66 * 592138937;
								}
							} else if (i_267_ < 256) {
								is_247_[-1297675597 * anInt5049] = class7_258_.anInt67 * 1277621507;
								is_248_[-1297675597 * anInt5049] = class7_258_.anInt66 * 592138937;
							} else {
								is_247_[-1297675597 * anInt5049] = class7_257_.anInt67 * 1277621507;
								is_248_[anInt5049 * -1297675597] = 592138937 * class7_257_.anInt66;
							}
							int i_274_ = Class249.method4658(is_251_[i_236_][i_237_], is_251_[i_238_][i_237_], i_266_ << 7 >> 9, -604110072);
							int i_275_ = Class249.method4658(is_251_[i_236_][i_239_], is_251_[i_238_][i_239_], i_266_ << 7 >> 9, -604110072);
							is_246_[anInt5049 * -1297675597] = Class249.method4658(i_274_, i_275_, i_267_ << 7 >> 9, -604110072);
						}
						if (null != is)
							is[anInt5049 * -1297675597] = is_246_[anInt5049 * -1297675597];
					}
					anInt5049 += -320293765;
				}
				anInt5048 += 723469927;
			}
			if (0 != 781976289 * anInt5046 && class7.aBool64)
				aBool5053 = true;
		}
	}

	public void method7366(Class180 class180, int[][][] is) {
		for (int i = 0; i < anInt5047 * 587945237; i++) {
			int i_276_ = 0;
			int i_277_ = 0;
			if (!aBool4976) {
				if (aBool5022)
					i_277_ |= 0x8;
				if (aBool4982)
					i_276_ |= 0x2;
				if (0 != anInt4980 * -1869831017) {
					i_276_ |= 0x1;
					i_277_ |= 0x10;
				}
			}
			if (aBool4982)
				i_277_ |= 0x7;
			if (!aBool4984)
				i_277_ |= 0x20;
			int[][] is_278_ = (null != is && i < is.length ? is[i] : anIntArrayArrayArray4989[i]);
			aClass555_4978.method9226(i, class180.method3099(anInt5010 * 1665134431, -1904271179 * anInt4987, anIntArrayArrayArray4989[i], is_278_, 512, i_276_, i_277_), (byte) 28);
		}
	}

	public void method7367(Class180 class180, int[][][] is, byte i) {
		for (int i_279_ = 0; i_279_ < anInt5047 * 587945237; i_279_++) {
			int i_280_ = 0;
			int i_281_ = 0;
			if (!aBool4976) {
				if (aBool5022)
					i_281_ |= 0x8;
				if (aBool4982)
					i_280_ |= 0x2;
				if (0 != anInt4980 * -1869831017) {
					i_280_ |= 0x1;
					i_281_ |= 0x10;
				}
			}
			if (aBool4982)
				i_281_ |= 0x7;
			if (!aBool4984)
				i_281_ |= 0x20;
			int[][] is_282_ = (null != is && i_279_ < is.length ? is[i_279_] : anIntArrayArrayArray4989[i_279_]);
			aClass555_4978.method9226(i_279_, class180.method3099(anInt5010 * 1665134431, -1904271179 * anInt4987, anIntArrayArrayArray4989[i_279_], is_282_, 512, i_280_, i_281_), (byte) 6);
		}
	}

	public final void method7368(Class180 class180, Class161 class161, Class161 class161_283_) {
		int[][] is = new int[anInt5010 * 1665134431][anInt4987 * -1904271179];
		if (null == anIntArray4997 || anInt4987 * -1904271179 != anIntArray4997.length) {
			anIntArray4997 = new int[anInt4987 * -1904271179];
			anIntArray5043 = new int[anInt4987 * -1904271179];
			anIntArray4999 = new int[-1904271179 * anInt4987];
			anIntArray5000 = new int[anInt4987 * -1904271179];
			anIntArray5001 = new int[-1904271179 * anInt4987];
		}
		for (int i = 0; i < 587945237 * anInt5047; i++) {
			for (int i_284_ = 0; i_284_ < anInt4987 * -1904271179; i_284_++) {
				anIntArray4997[i_284_] = 0;
				anIntArray5043[i_284_] = 0;
				anIntArray4999[i_284_] = 0;
				anIntArray5000[i_284_] = 0;
				anIntArray5001[i_284_] = 0;
			}
			for (int i_285_ = -5; i_285_ < anInt5010 * 1665134431; i_285_++) {
				for (int i_286_ = 0; i_286_ < -1904271179 * anInt4987; i_286_++) {
					int i_287_ = i_285_ + 5;
					if (i_287_ < 1665134431 * anInt5010) {
						int i_288_ = (aShortArrayArrayArray4994[i][i_287_][i_286_] & 0x7fff);
						if (i_288_ > 0) {
							Class7 class7 = ((Class7) aClass24_Sub5_5012.method81(i_288_ - 1, 623456742));
							anIntArray4997[i_286_] += class7.anInt65 * 126708699;
							anIntArray5043[i_286_] += class7.anInt70 * -1261235975;
							anIntArray4999[i_286_] += class7.anInt69 * -2060189111;
							anIntArray5000[i_286_] += class7.anInt72 * -1916962147;
							anIntArray5001[i_286_]++;
						}
					}
					int i_289_ = i_285_ - 5;
					if (i_289_ >= 0) {
						int i_290_ = (aShortArrayArrayArray4994[i][i_289_][i_286_] & 0x7fff);
						if (i_290_ > 0) {
							Class7 class7 = ((Class7) aClass24_Sub5_5012.method81(i_290_ - 1, 1340207822));
							anIntArray4997[i_286_] -= 126708699 * class7.anInt65;
							anIntArray5043[i_286_] -= class7.anInt70 * -1261235975;
							anIntArray4999[i_286_] -= -2060189111 * class7.anInt69;
							anIntArray5000[i_286_] -= class7.anInt72 * -1916962147;
							anIntArray5001[i_286_]--;
						}
					}
				}
				if (i_285_ >= 0) {
					int i_291_ = 0;
					int i_292_ = 0;
					int i_293_ = 0;
					int i_294_ = 0;
					int i_295_ = 0;
					for (int i_296_ = -5; i_296_ < anInt4987 * -1904271179; i_296_++) {
						int i_297_ = i_296_ + 5;
						if (i_297_ < anInt4987 * -1904271179) {
							i_291_ += anIntArray4997[i_297_];
							i_292_ += anIntArray5043[i_297_];
							i_293_ += anIntArray4999[i_297_];
							i_294_ += anIntArray5000[i_297_];
							i_295_ += anIntArray5001[i_297_];
						}
						int i_298_ = i_296_ - 5;
						if (i_298_ >= 0) {
							i_291_ -= anIntArray4997[i_298_];
							i_292_ -= anIntArray5043[i_298_];
							i_293_ -= anIntArray4999[i_298_];
							i_294_ -= anIntArray5000[i_298_];
							i_295_ -= anIntArray5001[i_298_];
						}
						if (i_296_ >= 0 && i_294_ > 0 && i_295_ > 0)
							is[i_285_][i_296_] = Class625.method10351(i_291_ * 256 / i_294_, i_292_ / i_295_, i_293_ / i_295_, 1323292618);
					}
				}
			}
			if (aBool4983)
				method7360(class180, aClass555_4978.aClass161Array7434[i], i, is, i == 0 ? class161 : null, 0 == i ? class161_283_ : null, 1214301582);
			else
				method7359(class180, aClass555_4978.aClass161Array7434[i], i, is, i == 0 ? class161 : null, i == 0 ? class161_283_ : null, (byte) -22);
			aShortArrayArrayArray4994[i] = null;
			aShortArrayArrayArray4995[i] = null;
			aByteArrayArrayArray4992[i] = null;
			aByteArrayArrayArray4993[i] = null;
		}
		if (!aBool4976) {
			if (0 != -1869831017 * anInt4980)
				aClass555_4978.method9270((byte) 12);
			if (aBool4982)
				aClass555_4978.method9332(267665495);
		}
		for (int i = 0; i < anInt5047 * 587945237; i++)
			aClass555_4978.aClass161Array7434[i].method2588();
	}

	public void method7369() {
		aBool4991 = true;
	}

	static final int method7370(int i, int i_299_, int i_300_) {
		int i_301_ = i / i_300_;
		int i_302_ = i & i_300_ - 1;
		int i_303_ = i_299_ / i_300_;
		int i_304_ = i_299_ & i_300_ - 1;
		int i_305_ = Class490.method7973(i_301_, i_303_, (byte) 70);
		int i_306_ = Class490.method7973(i_301_ + 1, i_303_, (byte) 1);
		int i_307_ = Class490.method7973(i_301_, 1 + i_303_, (byte) 107);
		int i_308_ = Class490.method7973(i_301_ + 1, i_303_ + 1, (byte) 127);
		int i_309_ = Class298.method5512(i_305_, i_306_, i_302_, i_300_, (short) 397);
		int i_310_ = Class298.method5512(i_307_, i_308_, i_302_, i_300_, (short) 397);
		return Class298.method5512(i_309_, i_310_, i_304_, i_300_, (short) 397);
	}

	public void method7371() {
		anIntArray4997 = null;
		anIntArray5043 = null;
		anIntArray4999 = null;
		anIntArray5000 = null;
		anIntArray5001 = null;
		aBool4991 = false;
	}

	static {
		anIntArray5017 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
		anIntArray5018 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
		anIntArray5019 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
		anIntArray5029 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
		anIntArray5023 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
		anIntArray4977 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };
		anIntArray4981 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };
		aBoolArrayArray5058 = (new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false },
				{ true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false },
				{ true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, { false, false, false, false, false, false, false, false, false, false, false, false, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, { false, false, false, false, false, false, false, false, false, false, false, false, false } });
		aBoolArrayArray5025 = (new boolean[][] { { false, false, false, false, false, false, false, false, false, false, false, false, false }, { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false },
				{ true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false },
				{ true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, { false, false, false, false, false, false, false, false, false, false, false, false, false },
				{ true, true, true, true, true, true, true, true, true, true, true, true, true } });
		anIntArrayArray5026 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };
		anIntArrayArray5027 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
		anIntArrayArray5028 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };
		aBoolArrayArray4990 = (new boolean[][] { { false, false, false, false }, { false, false, false, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false } });
		anIntArrayArray5002 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
		anIntArrayArray5031 = (new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } });
		anIntArrayArray5032 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };
		anIntArrayArray5030 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };
		aBoolArrayArray5034 = (new boolean[][] { { false, false, false, false }, { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, { false, false, false, false }, { false, true, false, true }, { false, false, false, false } });
		anIntArrayArray5035 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
		anIntArrayArray5006 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
		anIntArrayArray5037 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
		anIntArrayArray5038 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
	}

	public void method7372() {
		anIntArray4997 = null;
		anIntArray5043 = null;
		anIntArray4999 = null;
		anIntArray5000 = null;
		anIntArray5001 = null;
		aBool4991 = false;
	}

	void method7373(Class180 class180, Class161 class161, int i, int[][] is, Class161 class161_311_, Class161 class161_312_) {
		for (int i_313_ = 0; i_313_ < anInt5010 * 1665134431; i_313_++) {
			for (int i_314_ = 0; i_314_ < anInt4987 * -1904271179; i_314_++) {
				byte i_315_ = aByteArrayArrayArray4992[i][i_313_][i_314_];
				byte i_316_ = aByteArrayArrayArray4993[i][i_313_][i_314_];
				int i_317_ = aShortArrayArrayArray4995[i][i_313_][i_314_] & 0x7fff;
				int i_318_ = aShortArrayArrayArray4994[i][i_313_][i_314_] & 0x7fff;
				Class660 class660 = ((Class660) (0 != i_317_ ? aClass24_Sub14_5007.method81(i_317_ - 1, 505857854) : null));
				Class7 class7 = ((Class7) (0 != i_318_ ? aClass24_Sub5_5012.method81(i_318_ - 1, -956520693) : null));
				if (0 == i_315_ && class660 == null)
					i_315_ = (byte) 12;
				Class660 class660_319_ = class660;
				if (class660 != null && 335838185 * class660.anInt8498 == -1 && -1 == -742413183 * class660.anInt8505) {
					class660_319_ = class660;
					class660 = null;
				}
				if (class660 != null || class7 != null) {
					anInt5060 = anIntArray5017[i_315_] * -31861427;
					anInt4985 = 275329041 * anIntArray5040[i_315_];
					int i_320_ = ((null != class7 ? -1214157947 * anInt5060 : 0) + (null != class660 ? anInt4985 * -954351375 : 0));
					int i_321_ = 0;
					anInt5045 = 0;
					anInt4988 = -1777329063 * (class660 != null ? class660.anInt8501 * 482678519 : -1);
					int i_322_ = null != class7 ? class7.anInt67 * 1277621507 : -1;
					int[] is_323_ = new int[i_320_];
					int[] is_324_ = new int[i_320_];
					int[] is_325_ = new int[i_320_];
					int[] is_326_ = new int[i_320_];
					int[] is_327_ = new int[i_320_];
					int[] is_328_ = new int[i_320_];
					int[] is_329_ = ((null != class660 && -1 != class660.anInt8505 * -742413183) ? new int[i_320_] : null);
					if (class660 != null) {
						for (int i_330_ = 0; i_330_ < anInt4985 * -954351375; i_330_++) {
							is_323_[i_321_] = (anIntArrayArray5026[i_315_][2008969689 * anInt5045]);
							is_324_[i_321_] = (anIntArrayArray5027[i_315_][2008969689 * anInt5045]);
							is_325_[i_321_] = (anIntArrayArray5028[i_315_][2008969689 * anInt5045]);
							is_327_[i_321_] = -138056727 * anInt4988;
							is_328_[i_321_] = 237632829 * class660.anInt8504;
							is_326_[i_321_] = class660.anInt8498 * 335838185;
							if (is_329_ != null)
								is_329_[i_321_] = -742413183 * class660.anInt8505;
							i_321_++;
							anInt5045 += -1163985303;
						}
						if (!aBool4976 && i == 0)
							aClass555_4978.method9233(i_313_, i_314_, class660.anInt8508 * -873535531, -509948648 * class660.anInt8506, -422438769 * class660.anInt8512, class660.anInt8511 * 52683443, class660.anInt8503 * 1106522129, 1126257915 * class660.anInt8513, (byte) 71);
					} else
						anInt5045 += 1600209113 * anInt4985;
					if (null != class7) {
						for (int i_331_ = 0; i_331_ < anInt5060 * -1214157947; i_331_++) {
							is_323_[i_321_] = (anIntArrayArray5026[i_315_][2008969689 * anInt5045]);
							is_324_[i_321_] = (anIntArrayArray5027[i_315_][anInt5045 * 2008969689]);
							is_325_[i_321_] = (anIntArrayArray5028[i_315_][anInt5045 * 2008969689]);
							is_327_[i_321_] = i_322_;
							is_328_[i_321_] = 592138937 * class7.anInt66;
							is_326_[i_321_] = is[i_313_][i_314_];
							if (null != is_329_)
								is_329_[i_321_] = is_326_[i_321_];
							i_321_++;
							anInt5045 += -1163985303;
						}
					}
					int i_332_ = anIntArray4977.length;
					int[] is_333_ = new int[i_332_];
					int[] is_334_ = new int[i_332_];
					int[] is_335_ = class161_312_ != null ? new int[i_332_] : null;
					int[] is_336_ = (null != class161_312_ || class161_311_ != null ? new int[i_332_] : null);
					for (int i_337_ = 0; i_337_ < i_332_; i_337_++) {
						int i_338_ = anIntArray4977[i_337_];
						int i_339_ = anIntArray4981[i_337_];
						if (i_316_ == 0) {
							is_333_[i_337_] = i_338_;
							is_334_[i_337_] = i_339_;
						} else if (i_316_ == 1) {
							int i_340_ = i_338_;
							is_333_[i_337_] = i_339_;
							is_334_[i_337_] = 512 - i_340_;
						} else if (2 == i_316_) {
							is_333_[i_337_] = 512 - i_338_;
							is_334_[i_337_] = 512 - i_339_;
						} else if (3 == i_316_) {
							int i_341_ = i_338_;
							is_333_[i_337_] = 512 - i_339_;
							is_334_[i_337_] = i_341_;
						}
						if (null != is_335_ && aBoolArrayArray5058[i_315_][i_337_]) {
							int i_342_ = (i_313_ << 9) + is_333_[i_337_];
							int i_343_ = is_334_[i_337_] + (i_314_ << 9);
							is_335_[i_337_] = (class161_312_.method2593(i_342_, i_343_, -1151432033) - class161.method2593(i_342_, i_343_, -1151432033));
						}
						if (null != is_336_) {
							if (class161_312_ != null && !aBoolArrayArray5058[i_315_][i_337_]) {
								int i_344_ = is_333_[i_337_] + (i_313_ << 9);
								int i_345_ = (i_314_ << 9) + is_334_[i_337_];
								is_336_[i_337_] = (class161.method2593(i_344_, i_345_, -1151432033) - (class161_312_.method2593(i_344_, i_345_, -1151432033)));
							} else if (null != class161_311_ && !(aBoolArrayArray5025[i_315_][i_337_])) {
								int i_346_ = is_333_[i_337_] + (i_313_ << 9);
								int i_347_ = is_334_[i_337_] + (i_314_ << 9);
								is_336_[i_337_] = (class161_311_.method2593(i_346_, i_347_, -1151432033) - class161.method2593(i_346_, i_347_, -1151432033));
							}
						}
					}
					int i_348_ = class161.method2595(i_313_, i_314_, (byte) 40);
					int i_349_ = class161.method2595(1 + i_313_, i_314_, (byte) 112);
					int i_350_ = class161.method2595(i_313_ + 1, 1 + i_314_, (byte) 126);
					int i_351_ = class161.method2595(i_313_, 1 + i_314_, (byte) 14);
					boolean bool = aClass470_5062.method7706(i_313_, i_314_, (short) 405);
					if (bool && i > 1 || !bool && i > 0) {
						boolean bool_352_ = true;
						if (null != class7 && !class7.aBool68)
							bool_352_ = false;
						else if (i_318_ == 0 && i_315_ != 0)
							bool_352_ = false;
						else if (i_317_ > 0 && null != class660_319_ && !class660_319_.aBool8502)
							bool_352_ = false;
						if (bool_352_ && i_348_ == i_349_ && i_350_ == i_348_ && i_351_ == i_348_)
							aByteArrayArrayArray4996[i][i_313_][i_314_] |= 0x4;
					}
					Class178 class178 = new Class178();
					if (aBool4976) {
						class178.anInt2055 = (aClass555_4978.method9263(i_313_, i_314_, -1878888433) * -2125644365);
						class178.anInt2050 = (aClass555_4978.method9227(i_313_, i_314_, (short) 27848) * 1806816041);
						class178.anInt2051 = aClass555_4978.method9229(i_313_, i_314_, 503088812) * 433693819;
						class178.anInt2053 = (aClass555_4978.method9247(i_313_, i_314_, -1194545924) * -1803459975);
						class178.anInt2054 = aClass555_4978.method9273(i_313_, i_314_, (byte) 1) * 420597091;
						class178.anInt2049 = (aClass555_4978.method9232(i_313_, i_314_, 598870759) * -834736135);
					}
					class161.method2589(i_313_, i_314_, is_333_, is_335_, is_334_, is_336_, is_323_, is_324_, is_325_, is_326_, is_329_, is_327_, is_328_, class178, false);
					aClass555_4978.method9225(i, i_313_, i_314_, -1831549350);
				}
			}
		}
	}

	static final int method7374(int i, int i_353_) {
		int i_354_ = i + 57 * i_353_;
		i_354_ = i_354_ << 13 ^ i_354_;
		int i_355_ = (i_354_ * (789221 + i_354_ * i_354_ * 15731) + 1376312589 & 0x7fffffff);
		return i_355_ >> 19 & 0xff;
	}

	public final void method7375(int i, int i_356_, int i_357_, int i_358_) {
		for (int i_359_ = 0; i_359_ < anInt5047 * 587945237; i_359_++)
			method7352(i_359_, i, i_356_, i_357_, i_358_, -375517254);
	}

	public final void method7376(int i, int i_360_, int i_361_, int i_362_) {
		for (int i_363_ = 0; i_363_ < anInt5047 * 587945237; i_363_++)
			method7352(i_363_, i, i_360_, i_361_, i_362_, -375517254);
	}

	public void method7377(Class180 class180, int[][][] is) {
		for (int i = 0; i < anInt5047 * 587945237; i++) {
			int i_364_ = 0;
			int i_365_ = 0;
			if (!aBool4976) {
				if (aBool5022)
					i_365_ |= 0x8;
				if (aBool4982)
					i_364_ |= 0x2;
				if (0 != anInt4980 * -1869831017) {
					i_364_ |= 0x1;
					i_365_ |= 0x10;
				}
			}
			if (aBool4982)
				i_365_ |= 0x7;
			if (!aBool4984)
				i_365_ |= 0x20;
			int[][] is_366_ = (null != is && i < is.length ? is[i] : anIntArrayArrayArray4989[i]);
			aClass555_4978.method9226(i, class180.method3099(anInt5010 * 1665134431, -1904271179 * anInt4987, anIntArrayArrayArray4989[i], is_366_, 512, i_364_, i_365_), (byte) 5);
		}
	}

	public final void method7378(int i, int i_367_, int i_368_, int i_369_) {
		for (int i_370_ = 0; i_370_ < anInt5047 * 587945237; i_370_++)
			method7352(i_370_, i, i_367_, i_368_, i_369_, -375517254);
	}

	public final void method7379(int i, int i_371_, int i_372_, int i_373_) {
		for (int i_374_ = 0; i_374_ < anInt5047 * 587945237; i_374_++)
			method7352(i_374_, i, i_371_, i_372_, i_373_, -375517254);
	}

	public final void method7380(int i, int i_375_, int i_376_, int i_377_, int i_378_) {
		for (int i_379_ = i_376_; i_379_ < i_376_ + i_378_; i_379_++) {
			for (int i_380_ = i_375_; i_380_ < i_375_ + i_377_; i_380_++) {
				if (i_380_ >= 0 && i_380_ < 1665134431 * anInt5010 && i_379_ >= 0 && i_379_ < -1904271179 * anInt4987)
					anIntArrayArrayArray4989[i][i_380_][i_379_] = i > 0 ? (anIntArrayArrayArray4989[i - 1][i_380_][i_379_]) - 960 : 0;
			}
		}
		if (i_375_ > 0 && i_375_ < 1665134431 * anInt5010) {
			for (int i_381_ = 1 + i_376_; i_381_ < i_378_ + i_376_; i_381_++) {
				if (i_381_ >= 0 && i_381_ < -1904271179 * anInt4987)
					anIntArrayArrayArray4989[i][i_375_][i_381_] = anIntArrayArrayArray4989[i][i_375_ - 1][i_381_];
			}
		}
		if (i_376_ > 0 && i_376_ < anInt4987 * -1904271179) {
			for (int i_382_ = i_375_ + 1; i_382_ < i_375_ + i_377_; i_382_++) {
				if (i_382_ >= 0 && i_382_ < 1665134431 * anInt5010)
					anIntArrayArrayArray4989[i][i_382_][i_376_] = anIntArrayArrayArray4989[i][i_382_][i_376_ - 1];
			}
		}
		if (i_375_ >= 0 && i_376_ >= 0 && i_375_ < anInt5010 * 1665134431 && i_376_ < anInt4987 * -1904271179) {
			if (0 == i) {
				if (i_375_ > 0 && 0 != anIntArrayArrayArray4989[i][i_375_ - 1][i_376_])
					anIntArrayArrayArray4989[i][i_375_][i_376_] = anIntArrayArrayArray4989[i][i_375_ - 1][i_376_];
				else if (i_376_ > 0 && (anIntArrayArrayArray4989[i][i_375_][i_376_ - 1] != 0))
					anIntArrayArrayArray4989[i][i_375_][i_376_] = anIntArrayArrayArray4989[i][i_375_][i_376_ - 1];
				else if (i_375_ > 0 && i_376_ > 0 && 0 != (anIntArrayArrayArray4989[i][i_375_ - 1][i_376_ - 1]))
					anIntArrayArrayArray4989[i][i_375_][i_376_] = anIntArrayArrayArray4989[i][i_375_ - 1][i_376_ - 1];
			} else if (i_375_ > 0 && (anIntArrayArrayArray4989[i - 1][i_375_ - 1][i_376_] != anIntArrayArrayArray4989[i][i_375_ - 1][i_376_]))
				anIntArrayArrayArray4989[i][i_375_][i_376_] = anIntArrayArrayArray4989[i][i_375_ - 1][i_376_];
			else if (i_376_ > 0 && (anIntArrayArrayArray4989[i][i_375_][i_376_ - 1] != (anIntArrayArrayArray4989[i - 1][i_375_][i_376_ - 1])))
				anIntArrayArrayArray4989[i][i_375_][i_376_] = anIntArrayArrayArray4989[i][i_375_][i_376_ - 1];
			else if (i_375_ > 0 && i_376_ > 0 && (anIntArrayArrayArray4989[i][i_375_ - 1][i_376_ - 1] != (anIntArrayArrayArray4989[i - 1][i_375_ - 1][i_376_ - 1])))
				anIntArrayArrayArray4989[i][i_375_][i_376_] = anIntArrayArrayArray4989[i][i_375_ - 1][i_376_ - 1];
		}
	}

	public final void method7381(RSByteBuffer class527_sub38, int i, int i_383_, int i_384_, int i_385_) {
		int i_386_ = i + i_384_;
		int i_387_ = i_385_ + i_383_;
		for (int i_388_ = 0; i_388_ < anInt5047 * 587945237; i_388_++) {
			for (int i_389_ = 0; i_389_ < 64; i_389_++) {
				for (int i_390_ = 0; i_390_ < 64; i_390_++)
					method7418(class527_sub38, i_388_, i + i_389_, i_383_ + i_390_, 0, 0, i_389_ + i_386_, i_387_ + i_390_, 0, false, -1739611975);
			}
		}
	}

	public final void method7382(RSByteBuffer class527_sub38, int i, int i_391_, int i_392_, int i_393_) {
		int i_394_ = i + i_392_;
		int i_395_ = i_393_ + i_391_;
		for (int i_396_ = 0; i_396_ < anInt5047 * 587945237; i_396_++) {
			for (int i_397_ = 0; i_397_ < 64; i_397_++) {
				for (int i_398_ = 0; i_398_ < 64; i_398_++)
					method7418(class527_sub38, i_396_, i + i_397_, i_391_ + i_398_, 0, 0, i_397_ + i_394_, i_395_ + i_398_, 0, false, -1103116557);
			}
		}
	}

	public void method7383() {
		aBool4991 = true;
	}

	public final void method7384(RSByteBuffer class527_sub38, int i, int i_399_, int i_400_, int i_401_, int i_402_, int i_403_, int i_404_) {
		int i_405_ = 8 * (i_402_ & 0x7);
		int i_406_ = 8 * (i_403_ & 0x7);
		int i_407_ = (i_402_ & ~0x7) << 3;
		int i_408_ = (i_403_ & ~0x7) << 3;
		int i_409_ = 0;
		int i_410_ = 0;
		if (i_404_ == 1)
			i_410_ = 1;
		else if (i_404_ == 2) {
			i_409_ = 1;
			i_410_ = 1;
		} else if (3 == i_404_)
			i_409_ = 1;
		for (int i_411_ = 0; i_411_ < 587945237 * anInt5047; i_411_++) {
			for (int i_412_ = 0; i_412_ < 64; i_412_++) {
				for (int i_413_ = 0; i_413_ < 64; i_413_++) {
					if (i_411_ == i_401_ && i_412_ >= i_405_ && i_412_ <= i_405_ + 8 && i_413_ >= i_406_ && i_413_ <= i_406_ + 8) {
						int i_414_;
						int i_415_;
						if (i_405_ + 8 == i_412_ || 8 + i_406_ == i_413_) {
							if (0 == i_404_) {
								i_414_ = i_399_ + (i_412_ - i_405_);
								i_415_ = i_400_ + (i_413_ - i_406_);
							} else if (i_404_ == 1) {
								i_414_ = i_413_ - i_406_ + i_399_;
								i_415_ = 8 + i_400_ - (i_412_ - i_405_);
							} else if (2 == i_404_) {
								i_414_ = i_399_ + 8 - (i_412_ - i_405_);
								i_415_ = i_400_ + 8 - (i_413_ - i_406_);
							} else {
								i_414_ = i_399_ + 8 - (i_413_ - i_406_);
								i_415_ = i_412_ - i_405_ + i_400_;
							}
							method7418(class527_sub38, i, i_414_, i_415_, 0, 0, i_407_ + i_412_, i_413_ + i_408_, 0, true, -1505565048);
						} else {
							i_414_ = (i_399_ + Class208_Sub20.method15634(i_412_ & 0x7, i_413_ & 0x7, i_404_, 1650059756));
							i_415_ = i_400_ + Class289.method5228(i_412_ & 0x7, i_413_ & 0x7, i_404_, 265402356);
							method7418(class527_sub38, i, i_414_, i_415_, i_409_, i_410_, i_407_ + i_412_, i_408_ + i_413_, i_404_, false, -1123674877);
						}
						if (i_412_ == 63 || i_413_ == 63) {
							int i_416_ = 1;
							if (63 == i_412_ && i_413_ == 63)
								i_416_ = 3;
							for (int i_417_ = 0; i_417_ < i_416_; i_417_++) {
								int i_418_ = i_412_;
								int i_419_ = i_413_;
								if (0 == i_417_) {
									i_418_ = i_412_ == 63 ? 64 : i_412_;
									i_419_ = 63 == i_413_ ? 64 : i_413_;
								} else if (1 == i_417_)
									i_418_ = 64;
								else if (2 == i_417_)
									i_419_ = 64;
								int i_420_;
								int i_421_;
								if (i_404_ == 0) {
									i_420_ = i_418_ - i_405_ + i_399_;
									i_421_ = i_400_ + (i_419_ - i_406_);
								} else if (1 == i_404_) {
									i_420_ = i_419_ - i_406_ + i_399_;
									i_421_ = i_400_ + 8 - (i_418_ - i_405_);
								} else if (i_404_ == 2) {
									i_420_ = i_399_ + 8 - (i_418_ - i_405_);
									i_421_ = i_400_ + 8 - (i_419_ - i_406_);
								} else {
									i_420_ = i_399_ + 8 - (i_419_ - i_406_);
									i_421_ = i_400_ + (i_418_ - i_405_);
								}
								if (i_420_ >= 0 && i_420_ < 1665134431 * anInt5010 && i_421_ >= 0 && i_421_ < -1904271179 * anInt4987)
									anIntArrayArrayArray4989[i][i_420_][i_421_] = (anIntArrayArrayArray4989[i][i_414_ + i_409_][i_415_ + i_410_]);
							}
						}
					} else
						method7418(class527_sub38, 0, -1, -1, 0, 0, 0, 0, 0, false, -1217179125);
				}
			}
		}
	}

	public final void method7385(RSByteBuffer class527_sub38, int i, int i_422_, int i_423_, int i_424_, int i_425_, int i_426_, int i_427_) {
		int i_428_ = 8 * (i_425_ & 0x7);
		int i_429_ = 8 * (i_426_ & 0x7);
		int i_430_ = (i_425_ & ~0x7) << 3;
		int i_431_ = (i_426_ & ~0x7) << 3;
		int i_432_ = 0;
		int i_433_ = 0;
		if (i_427_ == 1)
			i_433_ = 1;
		else if (i_427_ == 2) {
			i_432_ = 1;
			i_433_ = 1;
		} else if (3 == i_427_)
			i_432_ = 1;
		for (int i_434_ = 0; i_434_ < 587945237 * anInt5047; i_434_++) {
			for (int i_435_ = 0; i_435_ < 64; i_435_++) {
				for (int i_436_ = 0; i_436_ < 64; i_436_++) {
					if (i_434_ == i_424_ && i_435_ >= i_428_ && i_435_ <= i_428_ + 8 && i_436_ >= i_429_ && i_436_ <= i_429_ + 8) {
						int i_437_;
						int i_438_;
						if (i_428_ + 8 == i_435_ || 8 + i_429_ == i_436_) {
							if (0 == i_427_) {
								i_437_ = i_422_ + (i_435_ - i_428_);
								i_438_ = i_423_ + (i_436_ - i_429_);
							} else if (i_427_ == 1) {
								i_437_ = i_436_ - i_429_ + i_422_;
								i_438_ = 8 + i_423_ - (i_435_ - i_428_);
							} else if (2 == i_427_) {
								i_437_ = i_422_ + 8 - (i_435_ - i_428_);
								i_438_ = i_423_ + 8 - (i_436_ - i_429_);
							} else {
								i_437_ = i_422_ + 8 - (i_436_ - i_429_);
								i_438_ = i_435_ - i_428_ + i_423_;
							}
							method7418(class527_sub38, i, i_437_, i_438_, 0, 0, i_430_ + i_435_, i_436_ + i_431_, 0, true, -1101129606);
						} else {
							i_437_ = (i_422_ + Class208_Sub20.method15634(i_435_ & 0x7, i_436_ & 0x7, i_427_, 1650059756));
							i_438_ = i_423_ + Class289.method5228(i_435_ & 0x7, i_436_ & 0x7, i_427_, -1962667685);
							method7418(class527_sub38, i, i_437_, i_438_, i_432_, i_433_, i_430_ + i_435_, i_431_ + i_436_, i_427_, false, -923417298);
						}
						if (i_435_ == 63 || i_436_ == 63) {
							int i_439_ = 1;
							if (63 == i_435_ && i_436_ == 63)
								i_439_ = 3;
							for (int i_440_ = 0; i_440_ < i_439_; i_440_++) {
								int i_441_ = i_435_;
								int i_442_ = i_436_;
								if (0 == i_440_) {
									i_441_ = i_435_ == 63 ? 64 : i_435_;
									i_442_ = 63 == i_436_ ? 64 : i_436_;
								} else if (1 == i_440_)
									i_441_ = 64;
								else if (2 == i_440_)
									i_442_ = 64;
								int i_443_;
								int i_444_;
								if (i_427_ == 0) {
									i_443_ = i_441_ - i_428_ + i_422_;
									i_444_ = i_423_ + (i_442_ - i_429_);
								} else if (1 == i_427_) {
									i_443_ = i_442_ - i_429_ + i_422_;
									i_444_ = i_423_ + 8 - (i_441_ - i_428_);
								} else if (i_427_ == 2) {
									i_443_ = i_422_ + 8 - (i_441_ - i_428_);
									i_444_ = i_423_ + 8 - (i_442_ - i_429_);
								} else {
									i_443_ = i_422_ + 8 - (i_442_ - i_429_);
									i_444_ = i_423_ + (i_441_ - i_428_);
								}
								if (i_443_ >= 0 && i_443_ < 1665134431 * anInt5010 && i_444_ >= 0 && i_444_ < -1904271179 * anInt4987)
									anIntArrayArrayArray4989[i][i_443_][i_444_] = (anIntArrayArrayArray4989[i][i_437_ + i_432_][i_438_ + i_433_]);
							}
						}
					} else
						method7418(class527_sub38, 0, -1, -1, 0, 0, 0, 0, 0, false, -1567444036);
				}
			}
		}
	}

	public void method7386() {
		anIntArray4997 = null;
		anIntArray5043 = null;
		anIntArray4999 = null;
		anIntArray5000 = null;
		anIntArray5001 = null;
		aBool4991 = false;
	}

	public final void method7387(int i, int[][] is) {
		int[][] is_445_ = anIntArrayArrayArray4989[i];
		for (int i_446_ = 0; i_446_ < 1665134431 * anInt5010 + 1; i_446_++) {
			for (int i_447_ = 0; i_447_ < 1 + anInt4987 * -1904271179; i_447_++)
				is_445_[i_446_][i_447_] += is[i_446_][i_447_];
		}
	}

	public final void method7388(int i, int[][] is) {
		int[][] is_448_ = anIntArrayArrayArray4989[i];
		for (int i_449_ = 0; i_449_ < 1665134431 * anInt5010 + 1; i_449_++) {
			for (int i_450_ = 0; i_450_ < 1 + anInt4987 * -1904271179; i_450_++)
				is_448_[i_449_][i_450_] += is[i_449_][i_450_];
		}
	}

	public void method7389(Class180 class180, int[][][] is) {
		for (int i = 0; i < anInt5047 * 587945237; i++) {
			int i_451_ = 0;
			int i_452_ = 0;
			if (!aBool4976) {
				if (aBool5022)
					i_452_ |= 0x8;
				if (aBool4982)
					i_451_ |= 0x2;
				if (0 != anInt4980 * -1869831017) {
					i_451_ |= 0x1;
					i_452_ |= 0x10;
				}
			}
			if (aBool4982)
				i_452_ |= 0x7;
			if (!aBool4984)
				i_452_ |= 0x20;
			int[][] is_453_ = (null != is && i < is.length ? is[i] : anIntArrayArrayArray4989[i]);
			aClass555_4978.method9226(i, class180.method3099(anInt5010 * 1665134431, -1904271179 * anInt4987, anIntArrayArrayArray4989[i], is_453_, 512, i_451_, i_452_), (byte) 55);
		}
	}

	final void method7390(RSByteBuffer class527_sub38, int i, int i_454_, int i_455_, int i_456_, int i_457_, int i_458_, int i_459_, int i_460_, boolean bool) {
		if (1 == i_460_)
			i_457_ = 1;
		else if (i_460_ == 2) {
			i_456_ = 1;
			i_457_ = 1;
		} else if (3 == i_460_)
			i_456_ = 1;
		if (i_454_ >= 0 && i_454_ < 1665134431 * anInt5010 && i_455_ >= 0 && i_455_ < -1904271179 * anInt4987) {
			if (!aBool4976 && !bool)
				aClass470_5062.aByteArrayArrayArray5354[i][i_454_][i_455_] = (byte) 0;
			int i_461_ = class527_sub38.readUnsignedByte();
			if (0 != (i_461_ & 0x1)) {
				if (bool) {
					class527_sub38.readUnsignedByte();
					class527_sub38.readUnsignedSmart((byte) -17);
				} else {
					int i_462_ = class527_sub38.readUnsignedByte();
					aShortArrayArrayArray4995[i][i_454_][i_455_] = (short) class527_sub38.readUnsignedSmart((byte) -72);
					aByteArrayArrayArray4992[i][i_454_][i_455_] = (byte) (i_462_ >> 2);
					aByteArrayArrayArray4993[i][i_454_][i_455_] = (byte) (i_462_ + i_460_ & 0x3);
				}
			}
			if ((i_461_ & 0x2) != 0) {
				if (!aBool4976 && !bool)
					aClass470_5062.aByteArrayArrayArray5354[i][i_454_][i_455_] = class527_sub38.readByte();
				else
					class527_sub38.anInt10689 += 1474750881;
			}
			if ((i_461_ & 0x4) != 0) {
				if (bool)
					class527_sub38.readUnsignedSmart((byte) -16);
				else
					aShortArrayArrayArray4994[i][i_454_][i_455_] = (short) class527_sub38.readUnsignedSmart((byte) -30);
			}
			if (0 != (i_461_ & 0x8)) {
				int i_463_ = class527_sub38.readUnsignedByte();
				if (!aBool4976) {
					if (1 == i_463_)
						i_463_ = 0;
					if (i == 0)
						anIntArrayArrayArray4989[0][i_454_ + i_456_][i_457_ + i_455_] = -i_463_ * 8 << 2;
					else
						anIntArrayArrayArray4989[i][i_456_ + i_454_][i_457_ + i_455_] = (anIntArrayArrayArray4989[i - 1][i_454_ + i_456_][i_457_ + i_455_]) - (i_463_ * 8 << 2);
				} else
					anIntArrayArrayArray4989[0][i_456_ + i_454_][(i_455_ + i_457_)] = i_463_ * 8 << 2;
			} else if (aBool4976)
				anIntArrayArrayArray4989[0][i_454_ + i_456_][i_455_ + i_457_] = 0;
			else if (0 == i)
				anIntArrayArrayArray4989[0][i_456_ + i_454_][i_455_ + i_457_] = -Class63.method1440(932731 + i_458_, 556238 + i_459_, 1769813785) * 8 << 2;
			else
				anIntArrayArrayArray4989[i][i_456_ + i_454_][i_457_ + i_455_] = (anIntArrayArrayArray4989[i - 1][i_454_ + i_456_][i_455_ + i_457_]) - 960;
		} else {
			int i_464_ = class527_sub38.readUnsignedByte();
			if (0 != (i_464_ & 0x1)) {
				class527_sub38.readUnsignedByte();
				class527_sub38.readUnsignedSmart((byte) -17);
			}
			if (0 != (i_464_ & 0x2))
				class527_sub38.anInt10689 += 1474750881;
			if ((i_464_ & 0x4) != 0)
				class527_sub38.readUnsignedSmart((byte) -55);
			if ((i_464_ & 0x8) != 0)
				class527_sub38.readUnsignedByte();
		}
	}

	public final void method7391(RSByteBuffer class527_sub38, int i, int i_465_, int i_466_, int i_467_) {
		int i_468_ = i + i_466_;
		int i_469_ = i_467_ + i_465_;
		for (int i_470_ = 0; i_470_ < anInt5047 * 587945237; i_470_++) {
			for (int i_471_ = 0; i_471_ < 64; i_471_++) {
				for (int i_472_ = 0; i_472_ < 64; i_472_++)
					method7418(class527_sub38, i_470_, i + i_471_, i_465_ + i_472_, 0, 0, i_471_ + i_468_, i_469_ + i_472_, 0, false, -1009823511);
			}
		}
	}

	void method7392(Class180 class180, Class161 class161, int i, int[][] is, Class161 class161_473_, Class161 class161_474_) {
		for (int i_475_ = 0; i_475_ < anInt5010 * 1665134431; i_475_++) {
			for (int i_476_ = 0; i_476_ < anInt4987 * -1904271179; i_476_++) {
				byte i_477_ = aByteArrayArrayArray4992[i][i_475_][i_476_];
				byte i_478_ = aByteArrayArrayArray4993[i][i_475_][i_476_];
				int i_479_ = aShortArrayArrayArray4995[i][i_475_][i_476_] & 0x7fff;
				int i_480_ = aShortArrayArrayArray4994[i][i_475_][i_476_] & 0x7fff;
				Class660 class660 = ((Class660) (0 != i_479_ ? aClass24_Sub14_5007.method81(i_479_ - 1, 1481028032) : null));
				Class7 class7 = ((Class7) (0 != i_480_ ? aClass24_Sub5_5012.method81(i_480_ - 1, 1154193185) : null));
				if (0 == i_477_ && class660 == null)
					i_477_ = (byte) 12;
				Class660 class660_481_ = class660;
				if (class660 != null && 335838185 * class660.anInt8498 == -1 && -1 == -742413183 * class660.anInt8505) {
					class660_481_ = class660;
					class660 = null;
				}
				if (class660 != null || class7 != null) {
					anInt5060 = anIntArray5017[i_477_] * -31861427;
					anInt4985 = 275329041 * anIntArray5040[i_477_];
					int i_482_ = ((null != class7 ? -1214157947 * anInt5060 : 0) + (null != class660 ? anInt4985 * -954351375 : 0));
					int i_483_ = 0;
					anInt5045 = 0;
					anInt4988 = -1777329063 * (class660 != null ? class660.anInt8501 * 482678519 : -1);
					int i_484_ = null != class7 ? class7.anInt67 * 1277621507 : -1;
					int[] is_485_ = new int[i_482_];
					int[] is_486_ = new int[i_482_];
					int[] is_487_ = new int[i_482_];
					int[] is_488_ = new int[i_482_];
					int[] is_489_ = new int[i_482_];
					int[] is_490_ = new int[i_482_];
					int[] is_491_ = ((null != class660 && -1 != class660.anInt8505 * -742413183) ? new int[i_482_] : null);
					if (class660 != null) {
						for (int i_492_ = 0; i_492_ < anInt4985 * -954351375; i_492_++) {
							is_485_[i_483_] = (anIntArrayArray5026[i_477_][2008969689 * anInt5045]);
							is_486_[i_483_] = (anIntArrayArray5027[i_477_][2008969689 * anInt5045]);
							is_487_[i_483_] = (anIntArrayArray5028[i_477_][2008969689 * anInt5045]);
							is_489_[i_483_] = -138056727 * anInt4988;
							is_490_[i_483_] = 237632829 * class660.anInt8504;
							is_488_[i_483_] = class660.anInt8498 * 335838185;
							if (is_491_ != null)
								is_491_[i_483_] = -742413183 * class660.anInt8505;
							i_483_++;
							anInt5045 += -1163985303;
						}
						if (!aBool4976 && i == 0)
							aClass555_4978.method9233(i_475_, i_476_, class660.anInt8508 * -873535531, -509948648 * class660.anInt8506, -422438769 * class660.anInt8512, class660.anInt8511 * 52683443, class660.anInt8503 * 1106522129, 1126257915 * class660.anInt8513, (byte) 116);
					} else
						anInt5045 += 1600209113 * anInt4985;
					if (null != class7) {
						for (int i_493_ = 0; i_493_ < anInt5060 * -1214157947; i_493_++) {
							is_485_[i_483_] = (anIntArrayArray5026[i_477_][2008969689 * anInt5045]);
							is_486_[i_483_] = (anIntArrayArray5027[i_477_][anInt5045 * 2008969689]);
							is_487_[i_483_] = (anIntArrayArray5028[i_477_][anInt5045 * 2008969689]);
							is_489_[i_483_] = i_484_;
							is_490_[i_483_] = 592138937 * class7.anInt66;
							is_488_[i_483_] = is[i_475_][i_476_];
							if (null != is_491_)
								is_491_[i_483_] = is_488_[i_483_];
							i_483_++;
							anInt5045 += -1163985303;
						}
					}
					int i_494_ = anIntArray4977.length;
					int[] is_495_ = new int[i_494_];
					int[] is_496_ = new int[i_494_];
					int[] is_497_ = class161_474_ != null ? new int[i_494_] : null;
					int[] is_498_ = (null != class161_474_ || class161_473_ != null ? new int[i_494_] : null);
					for (int i_499_ = 0; i_499_ < i_494_; i_499_++) {
						int i_500_ = anIntArray4977[i_499_];
						int i_501_ = anIntArray4981[i_499_];
						if (i_478_ == 0) {
							is_495_[i_499_] = i_500_;
							is_496_[i_499_] = i_501_;
						} else if (i_478_ == 1) {
							int i_502_ = i_500_;
							is_495_[i_499_] = i_501_;
							is_496_[i_499_] = 512 - i_502_;
						} else if (2 == i_478_) {
							is_495_[i_499_] = 512 - i_500_;
							is_496_[i_499_] = 512 - i_501_;
						} else if (3 == i_478_) {
							int i_503_ = i_500_;
							is_495_[i_499_] = 512 - i_501_;
							is_496_[i_499_] = i_503_;
						}
						if (null != is_497_ && aBoolArrayArray5058[i_477_][i_499_]) {
							int i_504_ = (i_475_ << 9) + is_495_[i_499_];
							int i_505_ = is_496_[i_499_] + (i_476_ << 9);
							is_497_[i_499_] = (class161_474_.method2593(i_504_, i_505_, -1151432033) - class161.method2593(i_504_, i_505_, -1151432033));
						}
						if (null != is_498_) {
							if (class161_474_ != null && !aBoolArrayArray5058[i_477_][i_499_]) {
								int i_506_ = is_495_[i_499_] + (i_475_ << 9);
								int i_507_ = (i_476_ << 9) + is_496_[i_499_];
								is_498_[i_499_] = (class161.method2593(i_506_, i_507_, -1151432033) - (class161_474_.method2593(i_506_, i_507_, -1151432033)));
							} else if (null != class161_473_ && !(aBoolArrayArray5025[i_477_][i_499_])) {
								int i_508_ = is_495_[i_499_] + (i_475_ << 9);
								int i_509_ = is_496_[i_499_] + (i_476_ << 9);
								is_498_[i_499_] = (class161_473_.method2593(i_508_, i_509_, -1151432033) - class161.method2593(i_508_, i_509_, -1151432033));
							}
						}
					}
					int i_510_ = class161.method2595(i_475_, i_476_, (byte) 42);
					int i_511_ = class161.method2595(1 + i_475_, i_476_, (byte) 36);
					int i_512_ = class161.method2595(i_475_ + 1, 1 + i_476_, (byte) 13);
					int i_513_ = class161.method2595(i_475_, 1 + i_476_, (byte) 63);
					boolean bool = aClass470_5062.method7706(i_475_, i_476_, (short) 17588);
					if (bool && i > 1 || !bool && i > 0) {
						boolean bool_514_ = true;
						if (null != class7 && !class7.aBool68)
							bool_514_ = false;
						else if (i_480_ == 0 && i_477_ != 0)
							bool_514_ = false;
						else if (i_479_ > 0 && null != class660_481_ && !class660_481_.aBool8502)
							bool_514_ = false;
						if (bool_514_ && i_510_ == i_511_ && i_512_ == i_510_ && i_513_ == i_510_)
							aByteArrayArrayArray4996[i][i_475_][i_476_] |= 0x4;
					}
					Class178 class178 = new Class178();
					if (aBool4976) {
						class178.anInt2055 = (aClass555_4978.method9263(i_475_, i_476_, -511980402) * -2125644365);
						class178.anInt2050 = (aClass555_4978.method9227(i_475_, i_476_, (short) 16534) * 1806816041);
						class178.anInt2051 = (aClass555_4978.method9229(i_475_, i_476_, 1938669776) * 433693819);
						class178.anInt2053 = (aClass555_4978.method9247(i_475_, i_476_, -1489460735) * -1803459975);
						class178.anInt2054 = aClass555_4978.method9273(i_475_, i_476_, (byte) 1) * 420597091;
						class178.anInt2049 = (aClass555_4978.method9232(i_475_, i_476_, 598870759) * -834736135);
					}
					class161.method2589(i_475_, i_476_, is_495_, is_497_, is_496_, is_498_, is_485_, is_486_, is_487_, is_488_, is_491_, is_489_, is_490_, class178, false);
					aClass555_4978.method9225(i, i_475_, i_476_, -2107930412);
				}
			}
		}
	}

	final void method7393(Class180 class180, Class660 class660, Class7 class7, int i, int i_515_, int i_516_, int i_517_, short[][] is, byte[][] is_518_, byte[][] is_519_, boolean[] bools, byte i_520_) {
		boolean[] bools_521_ = (null != class660 && class660.aBool8507 ? aBoolArrayArray5034[781976289 * anInt5046] : aBoolArrayArray4990[781976289 * anInt5046]);
		if (i_515_ > 0) {
			if (i > 0) {
				int i_522_ = is[i - 1][i_515_ - 1] & 0x7fff;
				if (i_522_ > 0) {
					Class660 class660_523_ = (Class660) aClass24_Sub14_5007.method81(i_522_ - 1, 1935279829);
					if (-1 != 335838185 * class660_523_.anInt8498 && class660_523_.aBool8507) {
						byte i_524_ = is_518_[i - 1][i_515_ - 1];
						int i_525_ = 4 + 2 * is_519_[i - 1][i_515_ - 1] & 0x7;
						int i_526_ = Class245.method4622(class180, class660_523_, 657148233);
						if (aBoolArrayArray5058[i_524_][i_525_]) {
							anIntArray4998[0] = 335838185 * class660_523_.anInt8498;
							anIntArray5041[0] = i_526_;
							anIntArray5042[0] = 482678519 * class660_523_.anInt8501;
							anIntArray5021[0] = class660_523_.anInt8504 * 237632829;
							anIntArray5044[0] = 194118137 * class660_523_.anInt8500;
							anIntArray5055[0] = 256;
						}
					}
				}
			}
			if (i < i_516_ - 1) {
				int i_527_ = is[1 + i][i_515_ - 1] & 0x7fff;
				if (i_527_ > 0) {
					Class660 class660_528_ = (Class660) aClass24_Sub14_5007.method81(i_527_ - 1, -1933037927);
					if (class660_528_.anInt8498 * 335838185 != -1 && class660_528_.aBool8507) {
						byte i_529_ = is_518_[i + 1][i_515_ - 1];
						int i_530_ = is_519_[i + 1][i_515_ - 1] * 2 + 6 & 0x7;
						int i_531_ = Class245.method4622(class180, class660_528_, 657148233);
						if (aBoolArrayArray5058[i_529_][i_530_]) {
							anIntArray4998[2] = 335838185 * class660_528_.anInt8498;
							anIntArray5041[2] = i_531_;
							anIntArray5042[2] = 482678519 * class660_528_.anInt8501;
							anIntArray5021[2] = 237632829 * class660_528_.anInt8504;
							anIntArray5044[2] = class660_528_.anInt8500 * 194118137;
							anIntArray5055[2] = 512;
						}
					}
				}
			}
		}
		if (i_515_ < i_517_ - 1) {
			if (i > 0) {
				int i_532_ = is[i - 1][i_515_ + 1] & 0x7fff;
				if (i_532_ > 0) {
					Class660 class660_533_ = (Class660) aClass24_Sub14_5007.method81(i_532_ - 1, -608294748);
					if (335838185 * class660_533_.anInt8498 != -1 && class660_533_.aBool8507) {
						byte i_534_ = is_518_[i - 1][i_515_ + 1];
						int i_535_ = is_519_[i - 1][1 + i_515_] * 2 + 2 & 0x7;
						int i_536_ = Class245.method4622(class180, class660_533_, 657148233);
						if (aBoolArrayArray5058[i_534_][i_535_]) {
							anIntArray4998[6] = class660_533_.anInt8498 * 335838185;
							anIntArray5041[6] = i_536_;
							anIntArray5042[6] = class660_533_.anInt8501 * 482678519;
							anIntArray5021[6] = 237632829 * class660_533_.anInt8504;
							anIntArray5044[6] = 194118137 * class660_533_.anInt8500;
							anIntArray5055[6] = 64;
						}
					}
				}
			}
			if (i < i_516_ - 1) {
				int i_537_ = is[i + 1][i_515_ + 1] & 0x7fff;
				if (i_537_ > 0) {
					Class660 class660_538_ = (Class660) aClass24_Sub14_5007.method81(i_537_ - 1, -509011918);
					if (-1 != class660_538_.anInt8498 * 335838185 && class660_538_.aBool8507) {
						byte i_539_ = is_518_[i + 1][i_515_ + 1];
						int i_540_ = 2 * is_519_[1 + i][1 + i_515_] + 0 & 0x7;
						int i_541_ = Class245.method4622(class180, class660_538_, 657148233);
						if (aBoolArrayArray5058[i_539_][i_540_]) {
							anIntArray4998[4] = 335838185 * class660_538_.anInt8498;
							anIntArray5041[4] = i_541_;
							anIntArray5042[4] = class660_538_.anInt8501 * 482678519;
							anIntArray5021[4] = 237632829 * class660_538_.anInt8504;
							anIntArray5044[4] = 194118137 * class660_538_.anInt8500;
							anIntArray5055[4] = 128;
						}
					}
				}
			}
		}
		if (i_515_ > 0) {
			int i_542_ = is[i][i_515_ - 1] & 0x7fff;
			if (i_542_ > 0) {
				Class660 class660_543_ = ((Class660) aClass24_Sub14_5007.method81(i_542_ - 1, -719117845));
				if (-1 != class660_543_.anInt8498 * 335838185) {
					byte i_544_ = is_518_[i][i_515_ - 1];
					int i_545_ = is_519_[i][i_515_ - 1];
					if (class660_543_.aBool8507) {
						int i_546_ = 2;
						int i_547_ = i_545_ * 2 + 4;
						int i_548_ = Class245.method4622(class180, class660_543_, 657148233);
						for (int i_549_ = 0; i_549_ < 3; i_549_++) {
							i_547_ &= 0x7;
							i_546_ &= 0x7;
							if (aBoolArrayArray5058[i_544_][i_547_] && (anIntArray5044[i_546_] <= class660_543_.anInt8500 * 194118137)) {
								anIntArray4998[i_546_] = 335838185 * class660_543_.anInt8498;
								anIntArray5041[i_546_] = i_548_;
								anIntArray5042[i_546_] = 482678519 * class660_543_.anInt8501;
								anIntArray5021[i_546_] = class660_543_.anInt8504 * 237632829;
								if (anIntArray5044[i_546_] == class660_543_.anInt8500 * 194118137)
									anIntArray5055[i_546_] |= 0x20;
								else
									anIntArray5055[i_546_] = 32;
								anIntArray5044[i_546_] = class660_543_.anInt8500 * 194118137;
							}
							i_547_++;
							i_546_--;
						}
						if (!bools_521_[2008969689 * anInt5045 + 0 & 0x3])
							bools[0] = (aBoolArrayArray5034[i_544_][i_545_ + 2 & 0x3]);
					} else if (!bools_521_[anInt5045 * 2008969689 + 0 & 0x3])
						bools[0] = aBoolArrayArray4990[i_544_][2 + i_545_ & 0x3];
				}
			}
		}
		if (i_515_ < i_517_ - 1) {
			int i_550_ = is[i][1 + i_515_] & 0x7fff;
			if (i_550_ > 0) {
				Class660 class660_551_ = ((Class660) aClass24_Sub14_5007.method81(i_550_ - 1, -1425825111));
				if (-1 != 335838185 * class660_551_.anInt8498) {
					byte i_552_ = is_518_[i][1 + i_515_];
					int i_553_ = is_519_[i][i_515_ + 1];
					if (class660_551_.aBool8507) {
						int i_554_ = 4;
						int i_555_ = 2 + 2 * i_553_;
						int i_556_ = Class245.method4622(class180, class660_551_, 657148233);
						for (int i_557_ = 0; i_557_ < 3; i_557_++) {
							i_555_ &= 0x7;
							i_554_ &= 0x7;
							if (aBoolArrayArray5058[i_552_][i_555_] && (anIntArray5044[i_554_] <= 194118137 * class660_551_.anInt8500)) {
								anIntArray4998[i_554_] = class660_551_.anInt8498 * 335838185;
								anIntArray5041[i_554_] = i_556_;
								anIntArray5042[i_554_] = 482678519 * class660_551_.anInt8501;
								anIntArray5021[i_554_] = 237632829 * class660_551_.anInt8504;
								if (anIntArray5044[i_554_] == 194118137 * class660_551_.anInt8500)
									anIntArray5055[i_554_] |= 0x10;
								else
									anIntArray5055[i_554_] = 16;
								anIntArray5044[i_554_] = 194118137 * class660_551_.anInt8500;
							}
							i_555_--;
							i_554_++;
						}
						if (!bools_521_[anInt5045 * 2008969689 + 2 & 0x3])
							bools[2] = (aBoolArrayArray5034[i_552_][0 + i_553_ & 0x3]);
					} else if (!bools_521_[anInt5045 * 2008969689 + 2 & 0x3])
						bools[2] = aBoolArrayArray4990[i_552_][0 + i_553_ & 0x3];
				}
			}
		}
		if (i > 0) {
			int i_558_ = is[i - 1][i_515_] & 0x7fff;
			if (i_558_ > 0) {
				Class660 class660_559_ = ((Class660) aClass24_Sub14_5007.method81(i_558_ - 1, -898963212));
				if (-1 != class660_559_.anInt8498 * 335838185) {
					byte i_560_ = is_518_[i - 1][i_515_];
					int i_561_ = is_519_[i - 1][i_515_];
					if (class660_559_.aBool8507) {
						int i_562_ = 6;
						int i_563_ = 4 + 2 * i_561_;
						int i_564_ = Class245.method4622(class180, class660_559_, 657148233);
						for (int i_565_ = 0; i_565_ < 3; i_565_++) {
							i_563_ &= 0x7;
							i_562_ &= 0x7;
							if (aBoolArrayArray5058[i_560_][i_563_] && (anIntArray5044[i_562_] <= 194118137 * class660_559_.anInt8500)) {
								anIntArray4998[i_562_] = 335838185 * class660_559_.anInt8498;
								anIntArray5041[i_562_] = i_564_;
								anIntArray5042[i_562_] = 482678519 * class660_559_.anInt8501;
								anIntArray5021[i_562_] = 237632829 * class660_559_.anInt8504;
								if (anIntArray5044[i_562_] == 194118137 * class660_559_.anInt8500)
									anIntArray5055[i_562_] |= 0x8;
								else
									anIntArray5055[i_562_] = 8;
								anIntArray5044[i_562_] = 194118137 * class660_559_.anInt8500;
							}
							i_563_--;
							i_562_++;
						}
						if (!bools_521_[2008969689 * anInt5045 + 3 & 0x3])
							bools[3] = (aBoolArrayArray5034[i_560_][i_561_ + 1 & 0x3]);
					} else if (!bools_521_[anInt5045 * 2008969689 + 3 & 0x3])
						bools[3] = aBoolArrayArray4990[i_560_][i_561_ + 1 & 0x3];
				}
			}
		}
		if (i < i_516_ - 1) {
			int i_566_ = is[i + 1][i_515_] & 0x7fff;
			if (i_566_ > 0) {
				Class660 class660_567_ = ((Class660) aClass24_Sub14_5007.method81(i_566_ - 1, -94312215));
				if (class660_567_.anInt8498 * 335838185 != -1) {
					byte i_568_ = is_518_[i + 1][i_515_];
					int i_569_ = is_519_[i + 1][i_515_];
					if (class660_567_.aBool8507) {
						int i_570_ = 4;
						int i_571_ = i_569_ * 2 + 6;
						int i_572_ = Class245.method4622(class180, class660_567_, 657148233);
						for (int i_573_ = 0; i_573_ < 3; i_573_++) {
							i_571_ &= 0x7;
							i_570_ &= 0x7;
							if (aBoolArrayArray5058[i_568_][i_571_] && (anIntArray5044[i_570_] <= class660_567_.anInt8500 * 194118137)) {
								anIntArray4998[i_570_] = 335838185 * class660_567_.anInt8498;
								anIntArray5041[i_570_] = i_572_;
								anIntArray5042[i_570_] = class660_567_.anInt8501 * 482678519;
								anIntArray5021[i_570_] = 237632829 * class660_567_.anInt8504;
								if (anIntArray5044[i_570_] == class660_567_.anInt8500 * 194118137)
									anIntArray5055[i_570_] |= 0x4;
								else
									anIntArray5055[i_570_] = 4;
								anIntArray5044[i_570_] = 194118137 * class660_567_.anInt8500;
							}
							i_571_++;
							i_570_--;
						}
						if (!bools_521_[anInt5045 * 2008969689 + 1 & 0x3])
							bools[1] = (aBoolArrayArray5034[i_568_][i_569_ + 3 & 0x3]);
					} else if (!bools_521_[1 + 2008969689 * anInt5045 & 0x3])
						bools[1] = aBoolArrayArray4990[i_568_][3 + i_569_ & 0x3];
				}
			}
		}
		if (null != class660 && class660.aBool8507) {
			int i_574_ = Class245.method4622(class180, class660, 657148233);
			for (int i_575_ = 0; i_575_ < 8; i_575_++) {
				int i_576_ = i_575_ - anInt5045 * -277027918 & 0x7;
				if (aBoolArrayArray5058[781976289 * anInt5046][i_575_] && (anIntArray5044[i_576_] <= class660.anInt8500 * 194118137)) {
					anIntArray4998[i_576_] = class660.anInt8498 * 335838185;
					anIntArray5041[i_576_] = i_574_;
					anIntArray5042[i_576_] = class660.anInt8501 * 482678519;
					anIntArray5021[i_576_] = 237632829 * class660.anInt8504;
					if (anIntArray5044[i_576_] == 194118137 * class660.anInt8500)
						anIntArray5055[i_576_] |= 0x2;
					else
						anIntArray5055[i_576_] = 2;
					anIntArray5044[i_576_] = 194118137 * class660.anInt8500;
				}
			}
		}
	}

	public void method7394(Class180 class180, int[][][] is) {
		for (int i = 0; i < anInt5047 * 587945237; i++) {
			int i_577_ = 0;
			int i_578_ = 0;
			if (!aBool4976) {
				if (aBool5022)
					i_578_ |= 0x8;
				if (aBool4982)
					i_577_ |= 0x2;
				if (0 != anInt4980 * -1869831017) {
					i_577_ |= 0x1;
					i_578_ |= 0x10;
				}
			}
			if (aBool4982)
				i_578_ |= 0x7;
			if (!aBool4984)
				i_578_ |= 0x20;
			int[][] is_579_ = (null != is && i < is.length ? is[i] : anIntArrayArrayArray4989[i]);
			aClass555_4978.method9226(i, class180.method3099(anInt5010 * 1665134431, -1904271179 * anInt4987, anIntArrayArrayArray4989[i], is_579_, 512, i_577_, i_578_), (byte) 74);
		}
	}

	public void method7395(int i) {
		aBool4991 = true;
	}

	public final void method7396(Class180 class180, Class161 class161, Class161 class161_580_) {
		int[][] is = new int[anInt5010 * 1665134431][anInt4987 * -1904271179];
		if (null == anIntArray4997 || anInt4987 * -1904271179 != anIntArray4997.length) {
			anIntArray4997 = new int[anInt4987 * -1904271179];
			anIntArray5043 = new int[anInt4987 * -1904271179];
			anIntArray4999 = new int[-1904271179 * anInt4987];
			anIntArray5000 = new int[anInt4987 * -1904271179];
			anIntArray5001 = new int[-1904271179 * anInt4987];
		}
		for (int i = 0; i < 587945237 * anInt5047; i++) {
			for (int i_581_ = 0; i_581_ < anInt4987 * -1904271179; i_581_++) {
				anIntArray4997[i_581_] = 0;
				anIntArray5043[i_581_] = 0;
				anIntArray4999[i_581_] = 0;
				anIntArray5000[i_581_] = 0;
				anIntArray5001[i_581_] = 0;
			}
			for (int i_582_ = -5; i_582_ < anInt5010 * 1665134431; i_582_++) {
				for (int i_583_ = 0; i_583_ < -1904271179 * anInt4987; i_583_++) {
					int i_584_ = i_582_ + 5;
					if (i_584_ < 1665134431 * anInt5010) {
						int i_585_ = (aShortArrayArrayArray4994[i][i_584_][i_583_] & 0x7fff);
						if (i_585_ > 0) {
							Class7 class7 = ((Class7) aClass24_Sub5_5012.method81(i_585_ - 1, 855027277));
							anIntArray4997[i_583_] += class7.anInt65 * 126708699;
							anIntArray5043[i_583_] += class7.anInt70 * -1261235975;
							anIntArray4999[i_583_] += class7.anInt69 * -2060189111;
							anIntArray5000[i_583_] += class7.anInt72 * -1916962147;
							anIntArray5001[i_583_]++;
						}
					}
					int i_586_ = i_582_ - 5;
					if (i_586_ >= 0) {
						int i_587_ = (aShortArrayArrayArray4994[i][i_586_][i_583_] & 0x7fff);
						if (i_587_ > 0) {
							Class7 class7 = ((Class7) aClass24_Sub5_5012.method81(i_587_ - 1, 1468836625));
							anIntArray4997[i_583_] -= 126708699 * class7.anInt65;
							anIntArray5043[i_583_] -= class7.anInt70 * -1261235975;
							anIntArray4999[i_583_] -= -2060189111 * class7.anInt69;
							anIntArray5000[i_583_] -= class7.anInt72 * -1916962147;
							anIntArray5001[i_583_]--;
						}
					}
				}
				if (i_582_ >= 0) {
					int i_588_ = 0;
					int i_589_ = 0;
					int i_590_ = 0;
					int i_591_ = 0;
					int i_592_ = 0;
					for (int i_593_ = -5; i_593_ < anInt4987 * -1904271179; i_593_++) {
						int i_594_ = i_593_ + 5;
						if (i_594_ < anInt4987 * -1904271179) {
							i_588_ += anIntArray4997[i_594_];
							i_589_ += anIntArray5043[i_594_];
							i_590_ += anIntArray4999[i_594_];
							i_591_ += anIntArray5000[i_594_];
							i_592_ += anIntArray5001[i_594_];
						}
						int i_595_ = i_593_ - 5;
						if (i_595_ >= 0) {
							i_588_ -= anIntArray4997[i_595_];
							i_589_ -= anIntArray5043[i_595_];
							i_590_ -= anIntArray4999[i_595_];
							i_591_ -= anIntArray5000[i_595_];
							i_592_ -= anIntArray5001[i_595_];
						}
						if (i_593_ >= 0 && i_591_ > 0 && i_592_ > 0)
							is[i_582_][i_593_] = Class625.method10351(i_588_ * 256 / i_591_, i_589_ / i_592_, i_590_ / i_592_, 954629389);
					}
				}
			}
			if (aBool4983)
				method7360(class180, aClass555_4978.aClass161Array7434[i], i, is, i == 0 ? class161 : null, 0 == i ? class161_580_ : null, 946225516);
			else
				method7359(class180, aClass555_4978.aClass161Array7434[i], i, is, i == 0 ? class161 : null, i == 0 ? class161_580_ : null, (byte) -2);
			aShortArrayArrayArray4994[i] = null;
			aShortArrayArrayArray4995[i] = null;
			aByteArrayArrayArray4992[i] = null;
			aByteArrayArrayArray4993[i] = null;
		}
		if (!aBool4976) {
			if (0 != -1869831017 * anInt4980)
				aClass555_4978.method9270((byte) 12);
			if (aBool4982)
				aClass555_4978.method9332(267665495);
		}
		for (int i = 0; i < anInt5047 * 587945237; i++)
			aClass555_4978.aClass161Array7434[i].method2588();
	}

	public void method7397(Class180 class180, int[][][] is) {
		for (int i = 0; i < anInt5047 * 587945237; i++) {
			int i_596_ = 0;
			int i_597_ = 0;
			if (!aBool4976) {
				if (aBool5022)
					i_597_ |= 0x8;
				if (aBool4982)
					i_596_ |= 0x2;
				if (0 != anInt4980 * -1869831017) {
					i_596_ |= 0x1;
					i_597_ |= 0x10;
				}
			}
			if (aBool4982)
				i_597_ |= 0x7;
			if (!aBool4984)
				i_597_ |= 0x20;
			int[][] is_598_ = (null != is && i < is.length ? is[i] : anIntArrayArrayArray4989[i]);
			aClass555_4978.method9226(i, class180.method3099(anInt5010 * 1665134431, -1904271179 * anInt4987, anIntArrayArrayArray4989[i], is_598_, 512, i_596_, i_597_), (byte) 37);
		}
	}

	public final void method7398(RSByteBuffer class527_sub38, int i, int i_599_, int i_600_, int i_601_, int i_602_, int i_603_, int i_604_, int i_605_) {
		int i_606_ = 8 * (i_602_ & 0x7);
		int i_607_ = 8 * (i_603_ & 0x7);
		int i_608_ = (i_602_ & ~0x7) << 3;
		int i_609_ = (i_603_ & ~0x7) << 3;
		int i_610_ = 0;
		int i_611_ = 0;
		if (i_604_ == 1)
			i_611_ = 1;
		else if (i_604_ == 2) {
			i_610_ = 1;
			i_611_ = 1;
		} else if (3 == i_604_)
			i_610_ = 1;
		for (int i_612_ = 0; i_612_ < 587945237 * anInt5047; i_612_++) {
			for (int i_613_ = 0; i_613_ < 64; i_613_++) {
				for (int i_614_ = 0; i_614_ < 64; i_614_++) {
					if (i_612_ == i_601_ && i_613_ >= i_606_ && i_613_ <= i_606_ + 8 && i_614_ >= i_607_ && i_614_ <= i_607_ + 8) {
						int i_615_;
						int i_616_;
						if (i_606_ + 8 == i_613_ || 8 + i_607_ == i_614_) {
							if (0 == i_604_) {
								i_615_ = i_599_ + (i_613_ - i_606_);
								i_616_ = i_600_ + (i_614_ - i_607_);
							} else if (i_604_ == 1) {
								i_615_ = i_614_ - i_607_ + i_599_;
								i_616_ = 8 + i_600_ - (i_613_ - i_606_);
							} else if (2 == i_604_) {
								i_615_ = i_599_ + 8 - (i_613_ - i_606_);
								i_616_ = i_600_ + 8 - (i_614_ - i_607_);
							} else {
								i_615_ = i_599_ + 8 - (i_614_ - i_607_);
								i_616_ = i_613_ - i_606_ + i_600_;
							}
							method7418(class527_sub38, i, i_615_, i_616_, 0, 0, i_608_ + i_613_, i_614_ + i_609_, 0, true, -1798482646);
						} else {
							i_615_ = (i_599_ + Class208_Sub20.method15634(i_613_ & 0x7, i_614_ & 0x7, i_604_, 1650059756));
							i_616_ = i_600_ + Class289.method5228(i_613_ & 0x7, i_614_ & 0x7, i_604_, 1998321955);
							method7418(class527_sub38, i, i_615_, i_616_, i_610_, i_611_, i_608_ + i_613_, i_609_ + i_614_, i_604_, false, -1113836951);
						}
						if (i_613_ == 63 || i_614_ == 63) {
							int i_617_ = 1;
							if (63 == i_613_ && i_614_ == 63)
								i_617_ = 3;
							for (int i_618_ = 0; i_618_ < i_617_; i_618_++) {
								int i_619_ = i_613_;
								int i_620_ = i_614_;
								if (0 == i_618_) {
									i_619_ = i_613_ == 63 ? 64 : i_613_;
									i_620_ = 63 == i_614_ ? 64 : i_614_;
								} else if (1 == i_618_)
									i_619_ = 64;
								else if (2 == i_618_)
									i_620_ = 64;
								int i_621_;
								int i_622_;
								if (i_604_ == 0) {
									i_621_ = i_619_ - i_606_ + i_599_;
									i_622_ = i_600_ + (i_620_ - i_607_);
								} else if (1 == i_604_) {
									i_621_ = i_620_ - i_607_ + i_599_;
									i_622_ = i_600_ + 8 - (i_619_ - i_606_);
								} else if (i_604_ == 2) {
									i_621_ = i_599_ + 8 - (i_619_ - i_606_);
									i_622_ = i_600_ + 8 - (i_620_ - i_607_);
								} else {
									i_621_ = i_599_ + 8 - (i_620_ - i_607_);
									i_622_ = i_600_ + (i_619_ - i_606_);
								}
								if (i_621_ >= 0 && i_621_ < 1665134431 * anInt5010 && i_622_ >= 0 && i_622_ < -1904271179 * anInt4987)
									anIntArrayArrayArray4989[i][i_621_][i_622_] = (anIntArrayArrayArray4989[i][i_615_ + i_610_][i_616_ + i_611_]);
							}
						}
					} else
						method7418(class527_sub38, 0, -1, -1, 0, 0, 0, 0, 0, false, -2114815270);
				}
			}
		}
	}

	void method7399(Class180 class180, Class161 class161, int i, int[][] is, Class161 class161_623_, Class161 class161_624_) {
		byte[][] is_625_ = aByteArrayArrayArray4992[i];
		byte[][] is_626_ = aByteArrayArrayArray4993[i];
		short[][] is_627_ = aShortArrayArrayArray4994[i];
		short[][] is_628_ = aShortArrayArrayArray4995[i];
		boolean[] bools = new boolean[4];
		for (int i_629_ = 0; i_629_ < 1665134431 * anInt5010; i_629_++) {
			int i_630_ = i_629_ < 1665134431 * anInt5010 - 1 ? 1 + i_629_ : i_629_;
			for (int i_631_ = 0; i_631_ < anInt4987 * -1904271179; i_631_++) {
				int i_632_ = (i_631_ < anInt4987 * -1904271179 - 1 ? i_631_ + 1 : i_631_);
				anInt5046 = is_625_[i_629_][i_631_] * 246989089;
				anInt5045 = -1163985303 * is_626_[i_629_][i_631_];
				int i_633_ = is_628_[i_629_][i_631_] & 0x7fff;
				int i_634_ = is_627_[i_629_][i_631_] & 0x7fff;
				if (i_633_ != 0 || 0 != i_634_) {
					Class660 class660 = ((Class660) (0 != i_633_ ? aClass24_Sub14_5007.method81(i_633_ - 1, 1316783237) : null));
					Class7 class7 = (Class7) (0 != i_634_ ? aClass24_Sub5_5012.method81(i_634_ - 1, 333958245) : null);
					if (0 == anInt5046 * 781976289 && class660 == null)
						anInt5046 = -1331098228;
					aBool5053 = false;
					aBool5054 = false;
					boolean[] bools_635_ = bools;
					boolean[] bools_636_ = bools;
					boolean[] bools_637_ = bools;
					bools[3] = false;
					bools_637_[2] = false;
					bools_636_[1] = false;
					bools_635_[0] = false;
					Class660 class660_638_ = class660;
					if (class660 != null) {
						if (class660.anInt8498 * 335838185 == -1 && -1 == class660.anInt8505 * -742413183) {
							class660_638_ = class660;
							class660 = null;
						} else if (class7 != null && anInt5046 * 781976289 != 0)
							aBool5054 = class660.aBool8507;
					}
					anInt5045 = method7361(i_634_, i_629_, i_631_, i_630_, i_632_, class161, is_627_, (byte) -86) * -1163985303;
					for (int i_639_ = 0; i_639_ < 13; i_639_++) {
						anIntArray5044[i_639_] = -1;
						anIntArray5055[i_639_] = 1;
					}
					method7362(class180, class660, class7, i_629_, i_631_, is_625_, is_626_, is_628_, bools, -1618807158);
					aBool5013 = (!aBool5054 && !bools[0] && !bools[2] && !bools[1] && !bools[3]);
					method7363(class660, class7, 2138319478);
					int i_640_ = -954351375 * anInt4985 + anInt5060 * -1214157947;
					if (i_640_ <= 0)
						aClass555_4978.method9225(i, i_629_, i_631_, -1962652246);
					else {
						if (bools[0])
							i_640_++;
						if (bools[2])
							i_640_++;
						if (bools[1])
							i_640_++;
						if (bools[3])
							i_640_++;
						anInt5048 = 0;
						anInt5049 = 0;
						int i_641_ = 3 * i_640_;
						int[] is_642_ = aBool5056 ? new int[i_641_] : null;
						int[] is_643_ = new int[i_641_];
						int[] is_644_ = new int[i_641_];
						int[] is_645_ = new int[i_641_];
						int[] is_646_ = new int[i_641_];
						int[] is_647_ = new int[i_641_];
						int[] is_648_ = class161_624_ != null ? new int[i_641_] : null;
						int[] is_649_ = (null != class161_624_ || class161_623_ != null ? new int[i_641_] : null);
						for (int i_650_ = 0; i_650_ < i_641_; i_650_++)
							is_646_[i_650_] = -1;
						method7364(class180, i, i_629_, i_631_, class660, bools, is_642_, is_643_, is_644_, is_645_, is_646_, is_647_, is_648_, is_649_, class161, class161_624_, class161_623_, 901100040);
						int i_651_ = is_627_[i_629_][i_632_] & 0x7fff;
						int i_652_ = is_627_[i_630_][i_632_] & 0x7fff;
						int i_653_ = is_627_[i_630_][i_631_] & 0x7fff;
						method7365(class180, i, i_629_, i_631_, i_630_, i_632_, class7, i_634_, i_651_, i_652_, i_653_, bools, is_642_, is_643_, is_644_, is_645_, is_646_, is_647_, is_648_, is_649_, is, class161, class161_624_, class161_623_, -1538311691);
						method7348(class161, class7, class660_638_, i, i_629_, i_631_, i_630_, i_632_, i_634_, i_633_, (byte) -60);
						Class178 class178 = new Class178();
						if (aBool4976) {
							class178.anInt2055 = (aClass555_4978.method9263(i_629_, i_631_, -1763358166) * -2125644365);
							class178.anInt2050 = (aClass555_4978.method9227(i_629_, i_631_, (short) 2014) * 1806816041);
							class178.anInt2051 = (aClass555_4978.method9229(i_629_, i_631_, 1747591845) * 433693819);
							class178.anInt2053 = (aClass555_4978.method9247(i_629_, i_631_, -1440717293) * -1803459975);
							class178.anInt2054 = (aClass555_4978.method9273(i_629_, i_631_, (byte) 1) * 420597091);
							class178.anInt2049 = (aClass555_4978.method9232(i_629_, i_631_, 598870759) * -834736135);
						}
						class161.method2604(i_629_, i_631_, is_643_, is_648_, is_644_, is_649_, is_645_, is_642_, is_646_, is_647_, class178, aBool5053);
						aClass555_4978.method9225(i, i_629_, i_631_, -1908111230);
					}
				}
			}
		}
	}

	void method7400(Class180 class180, Class161 class161, int i, int[][] is, Class161 class161_654_, Class161 class161_655_) {
		byte[][] is_656_ = aByteArrayArrayArray4992[i];
		byte[][] is_657_ = aByteArrayArrayArray4993[i];
		short[][] is_658_ = aShortArrayArrayArray4994[i];
		short[][] is_659_ = aShortArrayArrayArray4995[i];
		boolean[] bools = new boolean[4];
		for (int i_660_ = 0; i_660_ < 1665134431 * anInt5010; i_660_++) {
			int i_661_ = i_660_ < 1665134431 * anInt5010 - 1 ? 1 + i_660_ : i_660_;
			for (int i_662_ = 0; i_662_ < anInt4987 * -1904271179; i_662_++) {
				int i_663_ = (i_662_ < anInt4987 * -1904271179 - 1 ? i_662_ + 1 : i_662_);
				anInt5046 = is_656_[i_660_][i_662_] * 246989089;
				anInt5045 = -1163985303 * is_657_[i_660_][i_662_];
				int i_664_ = is_659_[i_660_][i_662_] & 0x7fff;
				int i_665_ = is_658_[i_660_][i_662_] & 0x7fff;
				if (i_664_ != 0 || 0 != i_665_) {
					Class660 class660 = ((Class660) (0 != i_664_ ? aClass24_Sub14_5007.method81(i_664_ - 1, -986268272) : null));
					Class7 class7 = (Class7) (0 != i_665_ ? aClass24_Sub5_5012.method81(i_665_ - 1, -408484221) : null);
					if (0 == anInt5046 * 781976289 && class660 == null)
						anInt5046 = -1331098228;
					aBool5053 = false;
					aBool5054 = false;
					boolean[] bools_666_ = bools;
					boolean[] bools_667_ = bools;
					boolean[] bools_668_ = bools;
					bools[3] = false;
					bools_668_[2] = false;
					bools_667_[1] = false;
					bools_666_[0] = false;
					Class660 class660_669_ = class660;
					if (class660 != null) {
						if (class660.anInt8498 * 335838185 == -1 && -1 == class660.anInt8505 * -742413183) {
							class660_669_ = class660;
							class660 = null;
						} else if (class7 != null && anInt5046 * 781976289 != 0)
							aBool5054 = class660.aBool8507;
					}
					anInt5045 = method7361(i_665_, i_660_, i_662_, i_661_, i_663_, class161, is_658_, (byte) -119) * -1163985303;
					for (int i_670_ = 0; i_670_ < 13; i_670_++) {
						anIntArray5044[i_670_] = -1;
						anIntArray5055[i_670_] = 1;
					}
					method7362(class180, class660, class7, i_660_, i_662_, is_656_, is_657_, is_659_, bools, -423698072);
					aBool5013 = (!aBool5054 && !bools[0] && !bools[2] && !bools[1] && !bools[3]);
					method7363(class660, class7, 2135031088);
					int i_671_ = -954351375 * anInt4985 + anInt5060 * -1214157947;
					if (i_671_ <= 0)
						aClass555_4978.method9225(i, i_660_, i_662_, -1838813179);
					else {
						if (bools[0])
							i_671_++;
						if (bools[2])
							i_671_++;
						if (bools[1])
							i_671_++;
						if (bools[3])
							i_671_++;
						anInt5048 = 0;
						anInt5049 = 0;
						int i_672_ = 3 * i_671_;
						int[] is_673_ = aBool5056 ? new int[i_672_] : null;
						int[] is_674_ = new int[i_672_];
						int[] is_675_ = new int[i_672_];
						int[] is_676_ = new int[i_672_];
						int[] is_677_ = new int[i_672_];
						int[] is_678_ = new int[i_672_];
						int[] is_679_ = class161_655_ != null ? new int[i_672_] : null;
						int[] is_680_ = (null != class161_655_ || class161_654_ != null ? new int[i_672_] : null);
						for (int i_681_ = 0; i_681_ < i_672_; i_681_++)
							is_677_[i_681_] = -1;
						method7364(class180, i, i_660_, i_662_, class660, bools, is_673_, is_674_, is_675_, is_676_, is_677_, is_678_, is_679_, is_680_, class161, class161_655_, class161_654_, 833186062);
						int i_682_ = is_658_[i_660_][i_663_] & 0x7fff;
						int i_683_ = is_658_[i_661_][i_663_] & 0x7fff;
						int i_684_ = is_658_[i_661_][i_662_] & 0x7fff;
						method7365(class180, i, i_660_, i_662_, i_661_, i_663_, class7, i_665_, i_682_, i_683_, i_684_, bools, is_673_, is_674_, is_675_, is_676_, is_677_, is_678_, is_679_, is_680_, is, class161, class161_655_, class161_654_, -1400790195);
						method7348(class161, class7, class660_669_, i, i_660_, i_662_, i_661_, i_663_, i_665_, i_664_, (byte) -34);
						Class178 class178 = new Class178();
						if (aBool4976) {
							class178.anInt2055 = (aClass555_4978.method9263(i_660_, i_662_, -428133280) * -2125644365);
							class178.anInt2050 = (aClass555_4978.method9227(i_660_, i_662_, (short) 4568) * 1806816041);
							class178.anInt2051 = (aClass555_4978.method9229(i_660_, i_662_, 208466548) * 433693819);
							class178.anInt2053 = (aClass555_4978.method9247(i_660_, i_662_, -1885443631) * -1803459975);
							class178.anInt2054 = (aClass555_4978.method9273(i_660_, i_662_, (byte) 1) * 420597091);
							class178.anInt2049 = (aClass555_4978.method9232(i_660_, i_662_, 598870759) * -834736135);
						}
						class161.method2604(i_660_, i_662_, is_674_, is_679_, is_675_, is_680_, is_676_, is_673_, is_677_, is_678_, class178, aBool5053);
						aClass555_4978.method9225(i, i_660_, i_662_, -2105649320);
					}
				}
			}
		}
	}

	public final void method7401(int i, int i_685_, int i_686_, int i_687_) {
		for (int i_688_ = 0; i_688_ < anInt5047 * 587945237; i_688_++)
			method7352(i_688_, i, i_685_, i_686_, i_687_, -375517254);
	}

	int method7402(int i, int i_689_, int i_690_, int i_691_, int i_692_, Class161 class161, short[][] is) {
		if ((anInt5046 * 781976289 == 0 || 12 == anInt5046 * 781976289) && i_689_ > 0 && i_690_ > 0 && i_689_ < anInt5010 * 1665134431 && i_690_ < -1904271179 * anInt4987) {
			int i_693_ = 0;
			int i_694_ = 0;
			int i_695_ = 0;
			int i_696_ = 0;
			i_693_ = i_693_ + (i == is[i_689_ - 1][i_690_ - 1] ? 1 : -1);
			i_694_ = i_694_ + (i == is[i_691_][i_690_ - 1] ? 1 : -1);
			i_695_ = i_695_ + (i == is[i_691_][i_692_] ? 1 : -1);
			i_696_ = i_696_ + (i == is[i_689_ - 1][i_692_] ? 1 : -1);
			if (i == is[i_689_][i_690_ - 1]) {
				i_693_++;
				i_694_++;
			} else {
				i_693_--;
				i_694_--;
			}
			if (is[i_691_][i_690_] == i) {
				i_694_++;
				i_695_++;
			} else {
				i_694_--;
				i_695_--;
			}
			if (is[i_689_][i_692_] == i) {
				i_695_++;
				i_696_++;
			} else {
				i_695_--;
				i_696_--;
			}
			if (i == is[i_689_ - 1][i_690_]) {
				i_696_++;
				i_693_++;
			} else {
				i_696_--;
				i_693_--;
			}
			int i_697_ = i_693_ - i_695_;
			if (i_697_ < 0)
				i_697_ = -i_697_;
			int i_698_ = i_694_ - i_696_;
			if (i_698_ < 0)
				i_698_ = -i_698_;
			if (i_698_ == i_697_) {
				i_697_ = (class161.method2595(i_689_, i_690_, (byte) 77) - class161.method2595(i_691_, i_692_, (byte) 72));
				if (i_697_ < 0)
					i_697_ = -i_697_;
				i_698_ = (class161.method2595(i_691_, i_690_, (byte) 14) - class161.method2595(i_689_, i_692_, (byte) 88));
				if (i_698_ < 0)
					i_698_ = -i_698_;
			}
			return i_697_ < i_698_ ? 1 : 0;
		}
		return anInt5045 * 2008969689;
	}

	void method7403(Class180 class180, Class660 class660, Class7 class7, int i, int i_699_, byte[][] is, byte[][] is_700_, short[][] is_701_, boolean[] bools) {
		boolean[] bools_702_ = (null != class660 && class660.aBool8507 ? aBoolArrayArray5034[anInt5046 * 781976289] : aBoolArrayArray4990[781976289 * anInt5046]);
		method7393(class180, class660, class7, i, i_699_, 1665134431 * anInt5010, anInt4987 * -1904271179, is_701_, is, is_700_, bools, (byte) 56);
		aBool5056 = class660 != null && (-742413183 * class660.anInt8505 != class660.anInt8498 * 335838185);
		if (!aBool5056) {
			for (int i_703_ = 0; i_703_ < 8; i_703_++) {
				if (anIntArray5044[i_703_] >= 0 && anIntArray4998[i_703_] != anIntArray5041[i_703_]) {
					aBool5056 = true;
					break;
				}
			}
		}
		if (!bools_702_[1 + 2008969689 * anInt5045 & 0x3]) {
			boolean[] bools_704_ = bools;
			int i_705_ = 1;
			bools_704_[i_705_] = (bools_704_[i_705_] | (anIntArray5055[2] & anIntArray5055[4]) == 0);
		}
		if (!bools_702_[3 + anInt5045 * 2008969689 & 0x3]) {
			boolean[] bools_706_ = bools;
			int i_707_ = 3;
			bools_706_[i_707_] = bools_706_[i_707_] | 0 == (anIntArray5055[6] & anIntArray5055[0]);
		}
		if (!bools_702_[anInt5045 * 2008969689 + 0 & 0x3]) {
			boolean[] bools_708_ = bools;
			int i_709_ = 0;
			bools_708_[i_709_] = bools_708_[i_709_] | 0 == (anIntArray5055[0] & anIntArray5055[2]);
		}
		if (!bools_702_[2 + anInt5045 * 2008969689 & 0x3]) {
			boolean[] bools_710_ = bools;
			int i_711_ = 2;
			bools_710_[i_711_] = (bools_710_[i_711_] | (anIntArray5055[4] & anIntArray5055[6]) == 0);
		}
		if (!aBool5054 && (0 == anInt5046 * 781976289 || 781976289 * anInt5046 == 12)) {
			if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
				boolean[] bools_712_ = bools;
				bools[3] = false;
				bools_712_[0] = false;
				anInt5046 = (anInt5046 * 781976289 == 0 ? 13 : 14) * 246989089;
				anInt5045 = 0;
			} else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
				boolean[] bools_713_ = bools;
				bools[1] = false;
				bools_713_[0] = false;
				anInt5046 = (781976289 * anInt5046 == 0 ? 13 : 14) * 246989089;
				anInt5045 = 803011387;
			} else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
				boolean[] bools_714_ = bools;
				bools[2] = false;
				bools_714_[1] = false;
				anInt5046 = 246989089 * (0 == anInt5046 * 781976289 ? 13 : 14);
				anInt5045 = 1966996690;
			} else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
				boolean[] bools_715_ = bools;
				bools[3] = false;
				bools_715_[2] = false;
				anInt5046 = 246989089 * (0 == anInt5046 * 781976289 ? 13 : 14);
				anInt5045 = -1163985303;
			}
		}
	}

	void method7404(Class660 class660, Class7 class7) {
		if (aBool5013) {
			anIntArray5059 = anIntArrayArray5026[781976289 * anInt5046];
			anIntArray5036 = anIntArrayArray5027[anInt5046 * 781976289];
			anIntArray5061 = anIntArrayArray5028[anInt5046 * 781976289];
			anInt4985 = 275329041 * (null != class660 ? anIntArray5040[781976289 * anInt5046] : 0);
			anInt5060 = (null != class7 ? anIntArray5017[anInt5046 * 781976289] : 0) * -31861427;
		} else if (aBool5054) {
			anIntArray5059 = anIntArrayArray5006[781976289 * anInt5046];
			anIntArray5036 = anIntArrayArray5037[anInt5046 * 781976289];
			anIntArray5061 = anIntArrayArray5038[781976289 * anInt5046];
			anInt4985 = (class660 != null ? anIntArray5029[781976289 * anInt5046] : 0) * 275329041;
			anInt5060 = -31861427 * (class7 != null ? anIntArray5023[anInt5046 * 781976289] : 0);
			anIntArray5033 = anIntArrayArray5035[781976289 * anInt5046];
		} else {
			anIntArray5059 = anIntArrayArray5031[781976289 * anInt5046];
			anIntArray5036 = anIntArrayArray5032[781976289 * anInt5046];
			anIntArray5061 = anIntArrayArray5030[781976289 * anInt5046];
			anInt4985 = 275329041 * (class660 != null ? anIntArray5018[781976289 * anInt5046] : 0);
			anInt5060 = (class7 != null ? anIntArray5019[781976289 * anInt5046] : 0) * -31861427;
			anIntArray5033 = anIntArrayArray5002[anInt5046 * 781976289];
		}
	}

	void method7405(Class180 class180, int i, int i_716_, int i_717_, Class660 class660, boolean[] bools, int[] is, int[] is_718_, int[] is_719_, int[] is_720_, int[] is_721_, int[] is_722_, int[] is_723_, int[] is_724_, Class161 class161, Class161 class161_725_, Class161 class161_726_) {
		anInt5052 = 1931074675;
		anInt4988 = 1777329063;
		anInt5051 = -674342656;
		if (class660 != null) {
			anInt5052 = 1656691285 * class660.anInt8498;
			anInt4988 = class660.anInt8501 * -1200095265;
			anInt5051 = class660.anInt8504 * -1784995787;
			int i_727_ = Class245.method4622(class180, class660, 657148233);
			for (int i_728_ = 0; i_728_ < -954351375 * anInt4985; i_728_++) {
				boolean bool = false;
				int i_729_;
				if (bools[0 - 2008969689 * anInt5045 & 0x3] && anInt5048 * 1442739543 == anIntArray5033[0]) {
					anIntArray5039[0] = anIntArray5059[anInt5048 * 1442739543];
					anIntArray5039[1] = 1;
					anIntArray5039[2] = anIntArray5061[anInt5048 * 1442739543];
					anIntArray5039[3] = 1;
					anIntArray5039[4] = anIntArray5036[anInt5048 * 1442739543];
					anIntArray5039[5] = anIntArray5061[anInt5048 * 1442739543];
					i_729_ = 6;
				} else if (bools[2 - anInt5045 * 2008969689 & 0x3] && anInt5048 * 1442739543 == anIntArray5033[2]) {
					anIntArray5039[0] = anIntArray5059[anInt5048 * 1442739543];
					anIntArray5039[1] = 5;
					anIntArray5039[2] = anIntArray5061[1442739543 * anInt5048];
					anIntArray5039[3] = 5;
					anIntArray5039[4] = anIntArray5036[anInt5048 * 1442739543];
					anIntArray5039[5] = anIntArray5061[1442739543 * anInt5048];
					i_729_ = 6;
				} else if (bools[1 - 2008969689 * anInt5045 & 0x3] && 1442739543 * anInt5048 == anIntArray5033[1]) {
					anIntArray5039[0] = anIntArray5059[1442739543 * anInt5048];
					anIntArray5039[1] = 3;
					anIntArray5039[2] = anIntArray5061[anInt5048 * 1442739543];
					anIntArray5039[3] = 3;
					anIntArray5039[4] = anIntArray5036[1442739543 * anInt5048];
					anIntArray5039[5] = anIntArray5061[1442739543 * anInt5048];
					i_729_ = 6;
				} else if (bools[3 - 2008969689 * anInt5045 & 0x3] && anIntArray5033[3] == anInt5048 * 1442739543) {
					anIntArray5039[0] = anIntArray5059[1442739543 * anInt5048];
					anIntArray5039[1] = 7;
					anIntArray5039[2] = anIntArray5061[anInt5048 * 1442739543];
					anIntArray5039[3] = 7;
					anIntArray5039[4] = anIntArray5036[anInt5048 * 1442739543];
					anIntArray5039[5] = anIntArray5061[1442739543 * anInt5048];
					i_729_ = 6;
				} else {
					anIntArray5039[0] = anIntArray5059[anInt5048 * 1442739543];
					anIntArray5039[1] = anIntArray5036[1442739543 * anInt5048];
					anIntArray5039[2] = anIntArray5061[1442739543 * anInt5048];
					i_729_ = 3;
				}
				for (int i_730_ = 0; i_730_ < i_729_; i_730_++) {
					int i_731_ = anIntArray5039[i_730_];
					int i_732_ = i_731_ - -277027918 * anInt5045 & 0x7;
					int i_733_ = anIntArray4977[i_731_];
					int i_734_ = anIntArray4981[i_731_];
					int i_735_;
					int i_736_;
					if (1 == anInt5045 * 2008969689) {
						i_735_ = i_734_;
						i_736_ = 512 - i_733_;
					} else if (2 == 2008969689 * anInt5045) {
						i_735_ = 512 - i_733_;
						i_736_ = 512 - i_734_;
					} else if (anInt5045 * 2008969689 == 3) {
						i_735_ = 512 - i_734_;
						i_736_ = i_733_;
					} else {
						i_735_ = i_733_;
						i_736_ = i_734_;
					}
					is_718_[-1297675597 * anInt5049] = i_735_;
					is_719_[anInt5049 * -1297675597] = i_736_;
					if (is_723_ != null && (aBoolArrayArray5058[anInt5046 * 781976289][i_731_])) {
						int i_737_ = (i_716_ << 9) + i_735_;
						int i_738_ = i_736_ + (i_717_ << 9);
						is_723_[-1297675597 * anInt5049] = (class161_725_.method2593(i_737_, i_738_, -1151432033) - class161.method2593(i_737_, i_738_, -1151432033));
					}
					if (null != is_724_) {
						if (null != class161_725_ && !(aBoolArrayArray5058[781976289 * anInt5046][i_731_])) {
							int i_739_ = (i_716_ << 9) + i_735_;
							int i_740_ = i_736_ + (i_717_ << 9);
							is_724_[anInt5049 * -1297675597] = (class161.method2593(i_739_, i_740_, -1151432033) - class161_725_.method2593(i_739_, i_740_, -1151432033));
						} else if (class161_726_ != null && !(aBoolArrayArray5025[anInt5046 * 781976289][i_731_])) {
							int i_741_ = (i_716_ << 9) + i_735_;
							int i_742_ = i_736_ + (i_717_ << 9);
							is_724_[anInt5049 * -1297675597] = (class161_726_.method2593(i_741_, i_742_, -1151432033) - class161.method2593(i_741_, i_742_, -1151432033));
						}
					}
					if (i_731_ < 8 && (anIntArray5044[i_732_] > class660.anInt8500 * 194118137)) {
						if (null != is)
							is[-1297675597 * anInt5049] = anIntArray5041[i_732_];
						is_722_[-1297675597 * anInt5049] = anIntArray5021[i_732_];
						is_721_[-1297675597 * anInt5049] = anIntArray5042[i_732_];
						is_720_[-1297675597 * anInt5049] = anIntArray4998[i_732_];
					} else {
						if (null != is)
							is[-1297675597 * anInt5049] = i_727_;
						is_721_[anInt5049 * -1297675597] = class660.anInt8501 * 482678519;
						is_722_[-1297675597 * anInt5049] = class660.anInt8504 * 237632829;
						is_720_[anInt5049 * -1297675597] = anInt5052 * -1731078331;
					}
					anInt5049 += -320293765;
				}
				anInt5048 += 723469927;
			}
			if (!aBool4976 && 0 == i)
				aClass555_4978.method9233(i_716_, i_717_, -873535531 * class660.anInt8508, -509948648 * class660.anInt8506, class660.anInt8512 * -422438769, 52683443 * class660.anInt8511, 1106522129 * class660.anInt8503, 1126257915 * class660.anInt8513, (byte) 29);
			if (781976289 * anInt5046 != 12 && -1 != 335838185 * class660.anInt8498 && class660.aBool8510)
				aBool5053 = true;
		} else if (aBool5013)
			anInt5048 += anIntArray5040[anInt5046 * 781976289] * 723469927;
		else if (aBool5054)
			anInt5048 += 723469927 * anIntArray5029[781976289 * anInt5046];
		else
			anInt5048 += 723469927 * anIntArray5018[781976289 * anInt5046];
	}

	void method7406(Class180 class180, int i, int i_743_, int i_744_, Class660 class660, boolean[] bools, int[] is, int[] is_745_, int[] is_746_, int[] is_747_, int[] is_748_, int[] is_749_, int[] is_750_, int[] is_751_, Class161 class161, Class161 class161_752_, Class161 class161_753_) {
		anInt5052 = 1931074675;
		anInt4988 = 1777329063;
		anInt5051 = -674342656;
		if (class660 != null) {
			anInt5052 = 1656691285 * class660.anInt8498;
			anInt4988 = class660.anInt8501 * -1200095265;
			anInt5051 = class660.anInt8504 * -1784995787;
			int i_754_ = Class245.method4622(class180, class660, 657148233);
			for (int i_755_ = 0; i_755_ < -954351375 * anInt4985; i_755_++) {
				boolean bool = false;
				int i_756_;
				if (bools[0 - 2008969689 * anInt5045 & 0x3] && anInt5048 * 1442739543 == anIntArray5033[0]) {
					anIntArray5039[0] = anIntArray5059[anInt5048 * 1442739543];
					anIntArray5039[1] = 1;
					anIntArray5039[2] = anIntArray5061[anInt5048 * 1442739543];
					anIntArray5039[3] = 1;
					anIntArray5039[4] = anIntArray5036[anInt5048 * 1442739543];
					anIntArray5039[5] = anIntArray5061[anInt5048 * 1442739543];
					i_756_ = 6;
				} else if (bools[2 - anInt5045 * 2008969689 & 0x3] && anInt5048 * 1442739543 == anIntArray5033[2]) {
					anIntArray5039[0] = anIntArray5059[anInt5048 * 1442739543];
					anIntArray5039[1] = 5;
					anIntArray5039[2] = anIntArray5061[1442739543 * anInt5048];
					anIntArray5039[3] = 5;
					anIntArray5039[4] = anIntArray5036[anInt5048 * 1442739543];
					anIntArray5039[5] = anIntArray5061[1442739543 * anInt5048];
					i_756_ = 6;
				} else if (bools[1 - 2008969689 * anInt5045 & 0x3] && 1442739543 * anInt5048 == anIntArray5033[1]) {
					anIntArray5039[0] = anIntArray5059[1442739543 * anInt5048];
					anIntArray5039[1] = 3;
					anIntArray5039[2] = anIntArray5061[anInt5048 * 1442739543];
					anIntArray5039[3] = 3;
					anIntArray5039[4] = anIntArray5036[1442739543 * anInt5048];
					anIntArray5039[5] = anIntArray5061[1442739543 * anInt5048];
					i_756_ = 6;
				} else if (bools[3 - 2008969689 * anInt5045 & 0x3] && anIntArray5033[3] == anInt5048 * 1442739543) {
					anIntArray5039[0] = anIntArray5059[1442739543 * anInt5048];
					anIntArray5039[1] = 7;
					anIntArray5039[2] = anIntArray5061[anInt5048 * 1442739543];
					anIntArray5039[3] = 7;
					anIntArray5039[4] = anIntArray5036[anInt5048 * 1442739543];
					anIntArray5039[5] = anIntArray5061[1442739543 * anInt5048];
					i_756_ = 6;
				} else {
					anIntArray5039[0] = anIntArray5059[anInt5048 * 1442739543];
					anIntArray5039[1] = anIntArray5036[1442739543 * anInt5048];
					anIntArray5039[2] = anIntArray5061[1442739543 * anInt5048];
					i_756_ = 3;
				}
				for (int i_757_ = 0; i_757_ < i_756_; i_757_++) {
					int i_758_ = anIntArray5039[i_757_];
					int i_759_ = i_758_ - -277027918 * anInt5045 & 0x7;
					int i_760_ = anIntArray4977[i_758_];
					int i_761_ = anIntArray4981[i_758_];
					int i_762_;
					int i_763_;
					if (1 == anInt5045 * 2008969689) {
						i_762_ = i_761_;
						i_763_ = 512 - i_760_;
					} else if (2 == 2008969689 * anInt5045) {
						i_762_ = 512 - i_760_;
						i_763_ = 512 - i_761_;
					} else if (anInt5045 * 2008969689 == 3) {
						i_762_ = 512 - i_761_;
						i_763_ = i_760_;
					} else {
						i_762_ = i_760_;
						i_763_ = i_761_;
					}
					is_745_[-1297675597 * anInt5049] = i_762_;
					is_746_[anInt5049 * -1297675597] = i_763_;
					if (is_750_ != null && (aBoolArrayArray5058[anInt5046 * 781976289][i_758_])) {
						int i_764_ = (i_743_ << 9) + i_762_;
						int i_765_ = i_763_ + (i_744_ << 9);
						is_750_[-1297675597 * anInt5049] = (class161_752_.method2593(i_764_, i_765_, -1151432033) - class161.method2593(i_764_, i_765_, -1151432033));
					}
					if (null != is_751_) {
						if (null != class161_752_ && !(aBoolArrayArray5058[781976289 * anInt5046][i_758_])) {
							int i_766_ = (i_743_ << 9) + i_762_;
							int i_767_ = i_763_ + (i_744_ << 9);
							is_751_[anInt5049 * -1297675597] = (class161.method2593(i_766_, i_767_, -1151432033) - class161_752_.method2593(i_766_, i_767_, -1151432033));
						} else if (class161_753_ != null && !(aBoolArrayArray5025[anInt5046 * 781976289][i_758_])) {
							int i_768_ = (i_743_ << 9) + i_762_;
							int i_769_ = i_763_ + (i_744_ << 9);
							is_751_[anInt5049 * -1297675597] = (class161_753_.method2593(i_768_, i_769_, -1151432033) - class161.method2593(i_768_, i_769_, -1151432033));
						}
					}
					if (i_758_ < 8 && (anIntArray5044[i_759_] > class660.anInt8500 * 194118137)) {
						if (null != is)
							is[-1297675597 * anInt5049] = anIntArray5041[i_759_];
						is_749_[-1297675597 * anInt5049] = anIntArray5021[i_759_];
						is_748_[-1297675597 * anInt5049] = anIntArray5042[i_759_];
						is_747_[-1297675597 * anInt5049] = anIntArray4998[i_759_];
					} else {
						if (null != is)
							is[-1297675597 * anInt5049] = i_754_;
						is_748_[anInt5049 * -1297675597] = class660.anInt8501 * 482678519;
						is_749_[-1297675597 * anInt5049] = class660.anInt8504 * 237632829;
						is_747_[anInt5049 * -1297675597] = anInt5052 * -1731078331;
					}
					anInt5049 += -320293765;
				}
				anInt5048 += 723469927;
			}
			if (!aBool4976 && 0 == i)
				aClass555_4978.method9233(i_743_, i_744_, -873535531 * class660.anInt8508, -509948648 * class660.anInt8506, class660.anInt8512 * -422438769, 52683443 * class660.anInt8511, 1106522129 * class660.anInt8503, 1126257915 * class660.anInt8513, (byte) 116);
			if (781976289 * anInt5046 != 12 && -1 != 335838185 * class660.anInt8498 && class660.aBool8510)
				aBool5053 = true;
		} else if (aBool5013)
			anInt5048 += anIntArray5040[anInt5046 * 781976289] * 723469927;
		else if (aBool5054)
			anInt5048 += 723469927 * anIntArray5029[781976289 * anInt5046];
		else
			anInt5048 += 723469927 * anIntArray5018[781976289 * anInt5046];
	}

	Class456(Class555 class555, int i, int i_770_, int i_771_, boolean bool, Class24_Sub14 class24_sub14, Class24_Sub5 class24_sub5, Class470 class470) {
		aBool4982 = false;
		aBool4983 = false;
		aBool4984 = false;
		anIntArray5039 = new int[6];
		anIntArray4998 = new int[13];
		anIntArray5041 = new int[13];
		anIntArray5042 = new int[13];
		anIntArray5021 = new int[13];
		anIntArray5044 = new int[13];
		anIntArray5055 = new int[13];
		anInt5048 = 0;
		anInt5049 = 0;
		anIntArray5033 = null;
		aClass555_4978 = class555;
		anInt5047 = i * 198988349;
		anInt5010 = 26881183 * i_770_;
		anInt4987 = i_771_ * -763834979;
		aBool4976 = bool;
		aClass24_Sub14_5007 = class24_sub14;
		aClass24_Sub5_5012 = class24_sub5;
		aClass470_5062 = class470;
		aShortArrayArrayArray4994 = (new short[587945237 * anInt5047][anInt5010 * 1665134431][anInt4987 * -1904271179]);
		aShortArrayArrayArray4995 = (new short[anInt5047 * 587945237][anInt5010 * 1665134431][-1904271179 * anInt4987]);
		aByteArrayArrayArray4992 = (new byte[587945237 * anInt5047][anInt5010 * 1665134431][anInt4987 * -1904271179]);
		aByteArrayArrayArray4993 = (new byte[587945237 * anInt5047][1665134431 * anInt5010][anInt4987 * -1904271179]);
		anIntArrayArrayArray4989 = (new int[587945237 * anInt5047][anInt5010 * 1665134431 + 1][1 + -1904271179 * anInt4987]);
		aByteArrayArrayArray4996 = (new byte[anInt5047 * 587945237][1665134431 * anInt5010 + 1][1 + anInt4987 * -1904271179]);
	}

	int method7407(int i, int i_772_, int i_773_, int i_774_, int i_775_, Class161 class161, short[][] is) {
		if ((anInt5046 * 781976289 == 0 || 12 == anInt5046 * 781976289) && i_772_ > 0 && i_773_ > 0 && i_772_ < anInt5010 * 1665134431 && i_773_ < -1904271179 * anInt4987) {
			int i_776_ = 0;
			int i_777_ = 0;
			int i_778_ = 0;
			int i_779_ = 0;
			i_776_ = i_776_ + (i == is[i_772_ - 1][i_773_ - 1] ? 1 : -1);
			i_777_ = i_777_ + (i == is[i_774_][i_773_ - 1] ? 1 : -1);
			i_778_ = i_778_ + (i == is[i_774_][i_775_] ? 1 : -1);
			i_779_ = i_779_ + (i == is[i_772_ - 1][i_775_] ? 1 : -1);
			if (i == is[i_772_][i_773_ - 1]) {
				i_776_++;
				i_777_++;
			} else {
				i_776_--;
				i_777_--;
			}
			if (is[i_774_][i_773_] == i) {
				i_777_++;
				i_778_++;
			} else {
				i_777_--;
				i_778_--;
			}
			if (is[i_772_][i_775_] == i) {
				i_778_++;
				i_779_++;
			} else {
				i_778_--;
				i_779_--;
			}
			if (i == is[i_772_ - 1][i_773_]) {
				i_779_++;
				i_776_++;
			} else {
				i_779_--;
				i_776_--;
			}
			int i_780_ = i_776_ - i_778_;
			if (i_780_ < 0)
				i_780_ = -i_780_;
			int i_781_ = i_777_ - i_779_;
			if (i_781_ < 0)
				i_781_ = -i_781_;
			if (i_781_ == i_780_) {
				i_780_ = (class161.method2595(i_772_, i_773_, (byte) 122) - class161.method2595(i_774_, i_775_, (byte) 66));
				if (i_780_ < 0)
					i_780_ = -i_780_;
				i_781_ = (class161.method2595(i_774_, i_773_, (byte) 5) - class161.method2595(i_772_, i_775_, (byte) 58));
				if (i_781_ < 0)
					i_781_ = -i_781_;
			}
			return i_780_ < i_781_ ? 1 : 0;
		}
		return anInt5045 * 2008969689;
	}

	void method7408(Class161 class161, Class7 class7, Class660 class660, int i, int i_782_, int i_783_, int i_784_, int i_785_, int i_786_, int i_787_) {
		int i_788_ = class161.method2595(i_782_, i_783_, (byte) 75);
		int i_789_ = class161.method2595(i_784_, i_783_, (byte) 4);
		int i_790_ = class161.method2595(i_784_, i_785_, (byte) 35);
		int i_791_ = class161.method2595(i_782_, i_785_, (byte) 78);
		boolean bool = aClass470_5062.method7706(i_782_, i_783_, (short) -15934);
		if (bool && i > 1 || !bool && i > 0) {
			boolean bool_792_ = true;
			if (null != class7 && !class7.aBool68)
				bool_792_ = false;
			else if (i_786_ == 0 && anInt5046 * 781976289 != 0)
				bool_792_ = false;
			else if (i_787_ > 0 && class660 != null && !class660.aBool8502)
				bool_792_ = false;
			if (bool_792_ && i_789_ == i_788_ && i_790_ == i_788_ && i_788_ == i_791_)
				aByteArrayArrayArray4996[i][i_782_][i_783_] |= 0x4;
		}
	}

	void method7409(Class161 class161, Class7 class7, Class660 class660, int i, int i_793_, int i_794_, int i_795_, int i_796_, int i_797_, int i_798_) {
		int i_799_ = class161.method2595(i_793_, i_794_, (byte) 34);
		int i_800_ = class161.method2595(i_795_, i_794_, (byte) 26);
		int i_801_ = class161.method2595(i_795_, i_796_, (byte) 59);
		int i_802_ = class161.method2595(i_793_, i_796_, (byte) 89);
		boolean bool = aClass470_5062.method7706(i_793_, i_794_, (short) 8665);
		if (bool && i > 1 || !bool && i > 0) {
			boolean bool_803_ = true;
			if (null != class7 && !class7.aBool68)
				bool_803_ = false;
			else if (i_797_ == 0 && anInt5046 * 781976289 != 0)
				bool_803_ = false;
			else if (i_798_ > 0 && class660 != null && !class660.aBool8502)
				bool_803_ = false;
			if (bool_803_ && i_800_ == i_799_ && i_801_ == i_799_ && i_799_ == i_802_)
				aByteArrayArrayArray4996[i][i_793_][i_794_] |= 0x4;
		}
	}

	void method7410(Class161 class161, Class7 class7, Class660 class660, int i, int i_804_, int i_805_, int i_806_, int i_807_, int i_808_, int i_809_) {
		int i_810_ = class161.method2595(i_804_, i_805_, (byte) 70);
		int i_811_ = class161.method2595(i_806_, i_805_, (byte) 98);
		int i_812_ = class161.method2595(i_806_, i_807_, (byte) 10);
		int i_813_ = class161.method2595(i_804_, i_807_, (byte) 124);
		boolean bool = aClass470_5062.method7706(i_804_, i_805_, (short) -14121);
		if (bool && i > 1 || !bool && i > 0) {
			boolean bool_814_ = true;
			if (null != class7 && !class7.aBool68)
				bool_814_ = false;
			else if (i_808_ == 0 && anInt5046 * 781976289 != 0)
				bool_814_ = false;
			else if (i_809_ > 0 && class660 != null && !class660.aBool8502)
				bool_814_ = false;
			if (bool_814_ && i_811_ == i_810_ && i_812_ == i_810_ && i_810_ == i_813_)
				aByteArrayArrayArray4996[i][i_804_][i_805_] |= 0x4;
		}
	}

	final void method7411(Class180 class180, Class660 class660, Class7 class7, int i, int i_815_, int i_816_, int i_817_, short[][] is, byte[][] is_818_, byte[][] is_819_, boolean[] bools) {
		boolean[] bools_820_ = (null != class660 && class660.aBool8507 ? aBoolArrayArray5034[781976289 * anInt5046] : aBoolArrayArray4990[781976289 * anInt5046]);
		if (i_815_ > 0) {
			if (i > 0) {
				int i_821_ = is[i - 1][i_815_ - 1] & 0x7fff;
				if (i_821_ > 0) {
					Class660 class660_822_ = (Class660) aClass24_Sub14_5007.method81(i_821_ - 1, 268398786);
					if (-1 != 335838185 * class660_822_.anInt8498 && class660_822_.aBool8507) {
						byte i_823_ = is_818_[i - 1][i_815_ - 1];
						int i_824_ = 4 + 2 * is_819_[i - 1][i_815_ - 1] & 0x7;
						int i_825_ = Class245.method4622(class180, class660_822_, 657148233);
						if (aBoolArrayArray5058[i_823_][i_824_]) {
							anIntArray4998[0] = 335838185 * class660_822_.anInt8498;
							anIntArray5041[0] = i_825_;
							anIntArray5042[0] = 482678519 * class660_822_.anInt8501;
							anIntArray5021[0] = class660_822_.anInt8504 * 237632829;
							anIntArray5044[0] = 194118137 * class660_822_.anInt8500;
							anIntArray5055[0] = 256;
						}
					}
				}
			}
			if (i < i_816_ - 1) {
				int i_826_ = is[1 + i][i_815_ - 1] & 0x7fff;
				if (i_826_ > 0) {
					Class660 class660_827_ = (Class660) aClass24_Sub14_5007.method81(i_826_ - 1, 735800216);
					if (class660_827_.anInt8498 * 335838185 != -1 && class660_827_.aBool8507) {
						byte i_828_ = is_818_[i + 1][i_815_ - 1];
						int i_829_ = is_819_[i + 1][i_815_ - 1] * 2 + 6 & 0x7;
						int i_830_ = Class245.method4622(class180, class660_827_, 657148233);
						if (aBoolArrayArray5058[i_828_][i_829_]) {
							anIntArray4998[2] = 335838185 * class660_827_.anInt8498;
							anIntArray5041[2] = i_830_;
							anIntArray5042[2] = 482678519 * class660_827_.anInt8501;
							anIntArray5021[2] = 237632829 * class660_827_.anInt8504;
							anIntArray5044[2] = class660_827_.anInt8500 * 194118137;
							anIntArray5055[2] = 512;
						}
					}
				}
			}
		}
		if (i_815_ < i_817_ - 1) {
			if (i > 0) {
				int i_831_ = is[i - 1][i_815_ + 1] & 0x7fff;
				if (i_831_ > 0) {
					Class660 class660_832_ = (Class660) aClass24_Sub14_5007.method81(i_831_ - 1, -899261856);
					if (335838185 * class660_832_.anInt8498 != -1 && class660_832_.aBool8507) {
						byte i_833_ = is_818_[i - 1][i_815_ + 1];
						int i_834_ = is_819_[i - 1][1 + i_815_] * 2 + 2 & 0x7;
						int i_835_ = Class245.method4622(class180, class660_832_, 657148233);
						if (aBoolArrayArray5058[i_833_][i_834_]) {
							anIntArray4998[6] = class660_832_.anInt8498 * 335838185;
							anIntArray5041[6] = i_835_;
							anIntArray5042[6] = class660_832_.anInt8501 * 482678519;
							anIntArray5021[6] = 237632829 * class660_832_.anInt8504;
							anIntArray5044[6] = 194118137 * class660_832_.anInt8500;
							anIntArray5055[6] = 64;
						}
					}
				}
			}
			if (i < i_816_ - 1) {
				int i_836_ = is[i + 1][i_815_ + 1] & 0x7fff;
				if (i_836_ > 0) {
					Class660 class660_837_ = (Class660) aClass24_Sub14_5007.method81(i_836_ - 1, -1367073649);
					if (-1 != class660_837_.anInt8498 * 335838185 && class660_837_.aBool8507) {
						byte i_838_ = is_818_[i + 1][i_815_ + 1];
						int i_839_ = 2 * is_819_[1 + i][1 + i_815_] + 0 & 0x7;
						int i_840_ = Class245.method4622(class180, class660_837_, 657148233);
						if (aBoolArrayArray5058[i_838_][i_839_]) {
							anIntArray4998[4] = 335838185 * class660_837_.anInt8498;
							anIntArray5041[4] = i_840_;
							anIntArray5042[4] = class660_837_.anInt8501 * 482678519;
							anIntArray5021[4] = 237632829 * class660_837_.anInt8504;
							anIntArray5044[4] = 194118137 * class660_837_.anInt8500;
							anIntArray5055[4] = 128;
						}
					}
				}
			}
		}
		if (i_815_ > 0) {
			int i_841_ = is[i][i_815_ - 1] & 0x7fff;
			if (i_841_ > 0) {
				Class660 class660_842_ = ((Class660) aClass24_Sub14_5007.method81(i_841_ - 1, 1594635261));
				if (-1 != class660_842_.anInt8498 * 335838185) {
					byte i_843_ = is_818_[i][i_815_ - 1];
					int i_844_ = is_819_[i][i_815_ - 1];
					if (class660_842_.aBool8507) {
						int i_845_ = 2;
						int i_846_ = i_844_ * 2 + 4;
						int i_847_ = Class245.method4622(class180, class660_842_, 657148233);
						for (int i_848_ = 0; i_848_ < 3; i_848_++) {
							i_846_ &= 0x7;
							i_845_ &= 0x7;
							if (aBoolArrayArray5058[i_843_][i_846_] && (anIntArray5044[i_845_] <= class660_842_.anInt8500 * 194118137)) {
								anIntArray4998[i_845_] = 335838185 * class660_842_.anInt8498;
								anIntArray5041[i_845_] = i_847_;
								anIntArray5042[i_845_] = 482678519 * class660_842_.anInt8501;
								anIntArray5021[i_845_] = class660_842_.anInt8504 * 237632829;
								if (anIntArray5044[i_845_] == class660_842_.anInt8500 * 194118137)
									anIntArray5055[i_845_] |= 0x20;
								else
									anIntArray5055[i_845_] = 32;
								anIntArray5044[i_845_] = class660_842_.anInt8500 * 194118137;
							}
							i_846_++;
							i_845_--;
						}
						if (!bools_820_[2008969689 * anInt5045 + 0 & 0x3])
							bools[0] = (aBoolArrayArray5034[i_843_][i_844_ + 2 & 0x3]);
					} else if (!bools_820_[anInt5045 * 2008969689 + 0 & 0x3])
						bools[0] = aBoolArrayArray4990[i_843_][2 + i_844_ & 0x3];
				}
			}
		}
		if (i_815_ < i_817_ - 1) {
			int i_849_ = is[i][1 + i_815_] & 0x7fff;
			if (i_849_ > 0) {
				Class660 class660_850_ = ((Class660) aClass24_Sub14_5007.method81(i_849_ - 1, -795872397));
				if (-1 != 335838185 * class660_850_.anInt8498) {
					byte i_851_ = is_818_[i][1 + i_815_];
					int i_852_ = is_819_[i][i_815_ + 1];
					if (class660_850_.aBool8507) {
						int i_853_ = 4;
						int i_854_ = 2 + 2 * i_852_;
						int i_855_ = Class245.method4622(class180, class660_850_, 657148233);
						for (int i_856_ = 0; i_856_ < 3; i_856_++) {
							i_854_ &= 0x7;
							i_853_ &= 0x7;
							if (aBoolArrayArray5058[i_851_][i_854_] && (anIntArray5044[i_853_] <= 194118137 * class660_850_.anInt8500)) {
								anIntArray4998[i_853_] = class660_850_.anInt8498 * 335838185;
								anIntArray5041[i_853_] = i_855_;
								anIntArray5042[i_853_] = 482678519 * class660_850_.anInt8501;
								anIntArray5021[i_853_] = 237632829 * class660_850_.anInt8504;
								if (anIntArray5044[i_853_] == 194118137 * class660_850_.anInt8500)
									anIntArray5055[i_853_] |= 0x10;
								else
									anIntArray5055[i_853_] = 16;
								anIntArray5044[i_853_] = 194118137 * class660_850_.anInt8500;
							}
							i_854_--;
							i_853_++;
						}
						if (!bools_820_[anInt5045 * 2008969689 + 2 & 0x3])
							bools[2] = (aBoolArrayArray5034[i_851_][0 + i_852_ & 0x3]);
					} else if (!bools_820_[anInt5045 * 2008969689 + 2 & 0x3])
						bools[2] = aBoolArrayArray4990[i_851_][0 + i_852_ & 0x3];
				}
			}
		}
		if (i > 0) {
			int i_857_ = is[i - 1][i_815_] & 0x7fff;
			if (i_857_ > 0) {
				Class660 class660_858_ = ((Class660) aClass24_Sub14_5007.method81(i_857_ - 1, -1172045462));
				if (-1 != class660_858_.anInt8498 * 335838185) {
					byte i_859_ = is_818_[i - 1][i_815_];
					int i_860_ = is_819_[i - 1][i_815_];
					if (class660_858_.aBool8507) {
						int i_861_ = 6;
						int i_862_ = 4 + 2 * i_860_;
						int i_863_ = Class245.method4622(class180, class660_858_, 657148233);
						for (int i_864_ = 0; i_864_ < 3; i_864_++) {
							i_862_ &= 0x7;
							i_861_ &= 0x7;
							if (aBoolArrayArray5058[i_859_][i_862_] && (anIntArray5044[i_861_] <= 194118137 * class660_858_.anInt8500)) {
								anIntArray4998[i_861_] = 335838185 * class660_858_.anInt8498;
								anIntArray5041[i_861_] = i_863_;
								anIntArray5042[i_861_] = 482678519 * class660_858_.anInt8501;
								anIntArray5021[i_861_] = 237632829 * class660_858_.anInt8504;
								if (anIntArray5044[i_861_] == 194118137 * class660_858_.anInt8500)
									anIntArray5055[i_861_] |= 0x8;
								else
									anIntArray5055[i_861_] = 8;
								anIntArray5044[i_861_] = 194118137 * class660_858_.anInt8500;
							}
							i_862_--;
							i_861_++;
						}
						if (!bools_820_[2008969689 * anInt5045 + 3 & 0x3])
							bools[3] = (aBoolArrayArray5034[i_859_][i_860_ + 1 & 0x3]);
					} else if (!bools_820_[anInt5045 * 2008969689 + 3 & 0x3])
						bools[3] = aBoolArrayArray4990[i_859_][i_860_ + 1 & 0x3];
				}
			}
		}
		if (i < i_816_ - 1) {
			int i_865_ = is[i + 1][i_815_] & 0x7fff;
			if (i_865_ > 0) {
				Class660 class660_866_ = ((Class660) aClass24_Sub14_5007.method81(i_865_ - 1, -1133762368));
				if (class660_866_.anInt8498 * 335838185 != -1) {
					byte i_867_ = is_818_[i + 1][i_815_];
					int i_868_ = is_819_[i + 1][i_815_];
					if (class660_866_.aBool8507) {
						int i_869_ = 4;
						int i_870_ = i_868_ * 2 + 6;
						int i_871_ = Class245.method4622(class180, class660_866_, 657148233);
						for (int i_872_ = 0; i_872_ < 3; i_872_++) {
							i_870_ &= 0x7;
							i_869_ &= 0x7;
							if (aBoolArrayArray5058[i_867_][i_870_] && (anIntArray5044[i_869_] <= class660_866_.anInt8500 * 194118137)) {
								anIntArray4998[i_869_] = 335838185 * class660_866_.anInt8498;
								anIntArray5041[i_869_] = i_871_;
								anIntArray5042[i_869_] = class660_866_.anInt8501 * 482678519;
								anIntArray5021[i_869_] = 237632829 * class660_866_.anInt8504;
								if (anIntArray5044[i_869_] == class660_866_.anInt8500 * 194118137)
									anIntArray5055[i_869_] |= 0x4;
								else
									anIntArray5055[i_869_] = 4;
								anIntArray5044[i_869_] = 194118137 * class660_866_.anInt8500;
							}
							i_870_++;
							i_869_--;
						}
						if (!bools_820_[anInt5045 * 2008969689 + 1 & 0x3])
							bools[1] = (aBoolArrayArray5034[i_867_][i_868_ + 3 & 0x3]);
					} else if (!bools_820_[1 + 2008969689 * anInt5045 & 0x3])
						bools[1] = aBoolArrayArray4990[i_867_][3 + i_868_ & 0x3];
				}
			}
		}
		if (null != class660 && class660.aBool8507) {
			int i_873_ = Class245.method4622(class180, class660, 657148233);
			for (int i_874_ = 0; i_874_ < 8; i_874_++) {
				int i_875_ = i_874_ - anInt5045 * -277027918 & 0x7;
				if (aBoolArrayArray5058[781976289 * anInt5046][i_874_] && (anIntArray5044[i_875_] <= class660.anInt8500 * 194118137)) {
					anIntArray4998[i_875_] = class660.anInt8498 * 335838185;
					anIntArray5041[i_875_] = i_873_;
					anIntArray5042[i_875_] = class660.anInt8501 * 482678519;
					anIntArray5021[i_875_] = 237632829 * class660.anInt8504;
					if (anIntArray5044[i_875_] == 194118137 * class660.anInt8500)
						anIntArray5055[i_875_] |= 0x2;
					else
						anIntArray5055[i_875_] = 2;
					anIntArray5044[i_875_] = 194118137 * class660.anInt8500;
				}
			}
		}
	}

	static final int method7412(Class180 class180, Class660 class660) {
		if (-1 != -742413183 * class660.anInt8505)
			return -742413183 * class660.anInt8505;
		if (class660.anInt8501 * 482678519 != -1) {
			Class163 class163 = class180.aClass181_2059.method3544(class660.anInt8501 * 482678519, (byte) -71);
			if (!class163.aBool1806)
				return class163.aShort1810;
		}
		return class660.anInt8498 * 335838185;
	}

	static final int method7413(Class180 class180, Class660 class660) {
		if (-1 != -742413183 * class660.anInt8505)
			return -742413183 * class660.anInt8505;
		if (class660.anInt8501 * 482678519 != -1) {
			Class163 class163 = class180.aClass181_2059.method3544(class660.anInt8501 * 482678519, (byte) 3);
			if (!class163.aBool1806)
				return class163.aShort1810;
		}
		return class660.anInt8498 * 335838185;
	}

	public void method7414(Class180 class180, int[][][] is) {
		for (int i = 0; i < anInt5047 * 587945237; i++) {
			int i_876_ = 0;
			int i_877_ = 0;
			if (!aBool4976) {
				if (aBool5022)
					i_877_ |= 0x8;
				if (aBool4982)
					i_876_ |= 0x2;
				if (0 != anInt4980 * -1869831017) {
					i_876_ |= 0x1;
					i_877_ |= 0x10;
				}
			}
			if (aBool4982)
				i_877_ |= 0x7;
			if (!aBool4984)
				i_877_ |= 0x20;
			int[][] is_878_ = (null != is && i < is.length ? is[i] : anIntArrayArrayArray4989[i]);
			aClass555_4978.method9226(i, class180.method3099(anInt5010 * 1665134431, -1904271179 * anInt4987, anIntArrayArrayArray4989[i], is_878_, 512, i_876_, i_877_), (byte) 75);
		}
	}

	static final int method7415(int i, int i_879_) {
		int i_880_ = (Class180_Sub1.method14883(45365 + i, 91923 + i_879_, 4, (byte) -112) - 128 + (Class180_Sub1.method14883(10294 + i, 37821 + i_879_, 2, (byte) -117) - 128 >> 1) + (Class180_Sub1.method14883(i, i_879_, 1, (byte) -111) - 128 >> 2));
		i_880_ = (int) (0.3 * (double) i_880_) + 35;
		if (i_880_ < 10)
			i_880_ = 10;
		else if (i_880_ > 60)
			i_880_ = 60;
		return i_880_;
	}

	static final int method7416(int i, int i_881_) {
		int i_882_ = (Class180_Sub1.method14883(45365 + i, 91923 + i_881_, 4, (byte) -81) - 128 + (Class180_Sub1.method14883(10294 + i, 37821 + i_881_, 2, (byte) -57) - 128 >> 1) + (Class180_Sub1.method14883(i, i_881_, 1, (byte) -83) - 128 >> 2));
		i_882_ = (int) (0.3 * (double) i_882_) + 35;
		if (i_882_ < 10)
			i_882_ = 10;
		else if (i_882_ > 60)
			i_882_ = 60;
		return i_882_;
	}

	static final int method7417(int i, int i_883_) {
		int i_884_ = (Class646.method10755(i - 1, i_883_ - 1, -1348538085) + Class646.method10755(i + 1, i_883_ - 1, -772948331) + Class646.method10755(i - 1, i_883_ + 1, -1970025592) + Class646.method10755(1 + i, i_883_ + 1, -1329601789));
		int i_885_ = (Class646.method10755(i - 1, i_883_, -2088198719) + Class646.method10755(1 + i, i_883_, -2136000450) + Class646.method10755(i, i_883_ - 1, -2109843952) + Class646.method10755(i, i_883_ + 1, -1515547711));
		int i_886_ = Class646.method10755(i, i_883_, -856890272);
		return i_886_ / 4 + (i_884_ / 16 + i_885_ / 8);
	}

	final void method7418(RSByteBuffer class527_sub38, int i, int i_887_, int i_888_, int i_889_, int i_890_, int i_891_, int i_892_, int i_893_, boolean bool, int i_894_) {
		if (1 == i_893_)
			i_890_ = 1;
		else if (i_893_ == 2) {
			i_889_ = 1;
			i_890_ = 1;
		} else if (3 == i_893_)
			i_889_ = 1;
		if (i_887_ >= 0 && i_887_ < 1665134431 * anInt5010 && i_888_ >= 0 && i_888_ < -1904271179 * anInt4987) {
			if (!aBool4976 && !bool)
				aClass470_5062.aByteArrayArrayArray5354[i][i_887_][i_888_] = (byte) 0;
			int i_895_ = class527_sub38.readUnsignedByte();
			if (0 != (i_895_ & 0x1)) {
				if (bool) {
					class527_sub38.readUnsignedByte();
					class527_sub38.readUnsignedSmart((byte) -33);
				} else {
					int i_896_ = class527_sub38.readUnsignedByte();
					aShortArrayArrayArray4995[i][i_887_][i_888_] = (short) class527_sub38.readUnsignedSmart((byte) -80);
					aByteArrayArrayArray4992[i][i_887_][i_888_] = (byte) (i_896_ >> 2);
					aByteArrayArrayArray4993[i][i_887_][i_888_] = (byte) (i_896_ + i_893_ & 0x3);
				}
			}
			if ((i_895_ & 0x2) != 0) {
				if (!aBool4976 && !bool)
					aClass470_5062.aByteArrayArrayArray5354[i][i_887_][i_888_] = class527_sub38.readByte();
				else
					class527_sub38.anInt10689 += 1474750881;
			}
			if ((i_895_ & 0x4) != 0) {
				if (bool)
					class527_sub38.readUnsignedSmart((byte) -107);
				else
					aShortArrayArrayArray4994[i][i_887_][i_888_] = (short) class527_sub38.readUnsignedSmart((byte) -29);
			}
			if (0 != (i_895_ & 0x8)) {
				int i_897_ = class527_sub38.readUnsignedByte();
				if (!aBool4976) {
					if (1 == i_897_)
						i_897_ = 0;
					if (i == 0)
						anIntArrayArrayArray4989[0][i_887_ + i_889_][i_890_ + i_888_] = -i_897_ * 8 << 2;
					else
						anIntArrayArrayArray4989[i][i_889_ + i_887_][i_890_ + i_888_] = (anIntArrayArrayArray4989[i - 1][i_887_ + i_889_][i_890_ + i_888_]) - (i_897_ * 8 << 2);
				} else
					anIntArrayArrayArray4989[0][i_889_ + i_887_][(i_888_ + i_890_)] = i_897_ * 8 << 2;
			} else if (aBool4976)
				anIntArrayArrayArray4989[0][i_887_ + i_889_][i_888_ + i_890_] = 0;
			else if (0 == i)
				anIntArrayArrayArray4989[0][i_889_ + i_887_][i_888_ + i_890_] = -Class63.method1440(932731 + i_891_, 556238 + i_892_, 1769813785) * 8 << 2;
			else
				anIntArrayArrayArray4989[i][i_889_ + i_887_][i_890_ + i_888_] = (anIntArrayArrayArray4989[i - 1][i_887_ + i_889_][i_888_ + i_890_]) - 960;
		} else {
			int i_898_ = class527_sub38.readUnsignedByte();
			if (0 != (i_898_ & 0x1)) {
				class527_sub38.readUnsignedByte();
				class527_sub38.readUnsignedSmart((byte) -72);
			}
			if (0 != (i_898_ & 0x2))
				class527_sub38.anInt10689 += 1474750881;
			if ((i_898_ & 0x4) != 0)
				class527_sub38.readUnsignedSmart((byte) -128);
			if ((i_898_ & 0x8) != 0)
				class527_sub38.readUnsignedByte();
		}
	}

	static final int method7419(int i, int i_899_, int i_900_) {
		int i_901_ = i / i_900_;
		int i_902_ = i & i_900_ - 1;
		int i_903_ = i_899_ / i_900_;
		int i_904_ = i_899_ & i_900_ - 1;
		int i_905_ = Class490.method7973(i_901_, i_903_, (byte) 110);
		int i_906_ = Class490.method7973(i_901_ + 1, i_903_, (byte) 25);
		int i_907_ = Class490.method7973(i_901_, 1 + i_903_, (byte) 81);
		int i_908_ = Class490.method7973(i_901_ + 1, i_903_ + 1, (byte) 35);
		int i_909_ = Class298.method5512(i_905_, i_906_, i_902_, i_900_, (short) 397);
		int i_910_ = Class298.method5512(i_907_, i_908_, i_902_, i_900_, (short) 397);
		return Class298.method5512(i_909_, i_910_, i_904_, i_900_, (short) 397);
	}

	static final int method7420(int i, int i_911_) {
		int i_912_ = (Class180_Sub1.method14883(45365 + i, 91923 + i_911_, 4, (byte) -90) - 128 + (Class180_Sub1.method14883(10294 + i, 37821 + i_911_, 2, (byte) -94) - 128 >> 1) + (Class180_Sub1.method14883(i, i_911_, 1, (byte) -92) - 128 >> 2));
		i_912_ = (int) (0.3 * (double) i_912_) + 35;
		if (i_912_ < 10)
			i_912_ = 10;
		else if (i_912_ > 60)
			i_912_ = 60;
		return i_912_;
	}

	void method7421(Class180 class180, int i, int i_913_, int i_914_, int i_915_, int i_916_, Class7 class7, int i_917_, int i_918_, int i_919_, int i_920_, boolean[] bools, int[] is, int[] is_921_, int[] is_922_, int[] is_923_, int[] is_924_, int[] is_925_, int[] is_926_, int[] is_927_, int[][] is_928_, Class161 class161, Class161 class161_929_, Class161 class161_930_) {
		if (class7 != null) {
			if (0 == i_918_)
				i_918_ = i_917_;
			if (0 == i_919_)
				i_919_ = i_917_;
			if (0 == i_920_)
				i_920_ = i_917_;
			Class7 class7_931_ = (Class7) aClass24_Sub5_5012.method81(i_917_ - 1, 1834824520);
			Class7 class7_932_ = (Class7) aClass24_Sub5_5012.method81(i_918_ - 1, -543589487);
			Class7 class7_933_ = (Class7) aClass24_Sub5_5012.method81(i_919_ - 1, 180448839);
			Class7 class7_934_ = ((Class7) aClass24_Sub5_5012.method81(i_920_ - 1, -1211626303));
			for (int i_935_ = 0; i_935_ < -1214157947 * anInt5060; i_935_++) {
				boolean bool = false;
				int i_936_;
				if (bools[0 - anInt5045 * 2008969689 & 0x3] && anIntArray5033[0] == anInt5048 * 1442739543) {
					anIntArray5039[0] = anIntArray5059[1442739543 * anInt5048];
					anIntArray5039[1] = 1;
					anIntArray5039[2] = anIntArray5061[anInt5048 * 1442739543];
					anIntArray5039[3] = 1;
					anIntArray5039[4] = anIntArray5036[1442739543 * anInt5048];
					anIntArray5039[5] = anIntArray5061[anInt5048 * 1442739543];
					i_936_ = 6;
				} else if (bools[2 - 2008969689 * anInt5045 & 0x3] && anIntArray5033[2] == 1442739543 * anInt5048) {
					anIntArray5039[0] = anIntArray5059[anInt5048 * 1442739543];
					anIntArray5039[1] = 5;
					anIntArray5039[2] = anIntArray5061[1442739543 * anInt5048];
					anIntArray5039[3] = 5;
					anIntArray5039[4] = anIntArray5036[1442739543 * anInt5048];
					anIntArray5039[5] = anIntArray5061[anInt5048 * 1442739543];
					i_936_ = 6;
				} else if (bools[1 - anInt5045 * 2008969689 & 0x3] && 1442739543 * anInt5048 == anIntArray5033[1]) {
					anIntArray5039[0] = anIntArray5059[1442739543 * anInt5048];
					anIntArray5039[1] = 3;
					anIntArray5039[2] = anIntArray5061[anInt5048 * 1442739543];
					anIntArray5039[3] = 3;
					anIntArray5039[4] = anIntArray5036[anInt5048 * 1442739543];
					anIntArray5039[5] = anIntArray5061[1442739543 * anInt5048];
					i_936_ = 6;
				} else if (bools[3 - anInt5045 * 2008969689 & 0x3] && 1442739543 * anInt5048 == anIntArray5033[3]) {
					anIntArray5039[0] = anIntArray5059[anInt5048 * 1442739543];
					anIntArray5039[1] = 7;
					anIntArray5039[2] = anIntArray5061[1442739543 * anInt5048];
					anIntArray5039[3] = 7;
					anIntArray5039[4] = anIntArray5036[1442739543 * anInt5048];
					anIntArray5039[5] = anIntArray5061[1442739543 * anInt5048];
					i_936_ = 6;
				} else {
					anIntArray5039[0] = anIntArray5059[anInt5048 * 1442739543];
					anIntArray5039[1] = anIntArray5036[anInt5048 * 1442739543];
					anIntArray5039[2] = anIntArray5061[anInt5048 * 1442739543];
					i_936_ = 3;
				}
				for (int i_937_ = 0; i_937_ < i_936_; i_937_++) {
					int i_938_ = anIntArray5039[i_937_];
					int i_939_ = i_938_ - anInt5045 * -277027918 & 0x7;
					int i_940_ = anIntArray4977[i_938_];
					int i_941_ = anIntArray4981[i_938_];
					int i_942_;
					int i_943_;
					if (2008969689 * anInt5045 == 1) {
						i_942_ = i_941_;
						i_943_ = 512 - i_940_;
					} else if (2008969689 * anInt5045 == 2) {
						i_942_ = 512 - i_940_;
						i_943_ = 512 - i_941_;
					} else if (2008969689 * anInt5045 == 3) {
						i_942_ = 512 - i_941_;
						i_943_ = i_940_;
					} else {
						i_942_ = i_940_;
						i_943_ = i_941_;
					}
					is_921_[anInt5049 * -1297675597] = i_942_;
					is_922_[anInt5049 * -1297675597] = i_943_;
					if (is_926_ != null && (aBoolArrayArray5058[781976289 * anInt5046][i_938_])) {
						int i_944_ = i_942_ + (i_913_ << 9);
						int i_945_ = (i_914_ << 9) + i_943_;
						is_926_[anInt5049 * -1297675597] = (class161_929_.method2593(i_944_, i_945_, -1151432033) - class161.method2593(i_944_, i_945_, -1151432033));
					}
					if (is_927_ != null) {
						if (null != class161_929_ && !(aBoolArrayArray5058[781976289 * anInt5046][i_938_])) {
							int i_946_ = i_942_ + (i_913_ << 9);
							int i_947_ = i_943_ + (i_914_ << 9);
							is_927_[anInt5049 * -1297675597] = (class161.method2593(i_946_, i_947_, -1151432033) - class161_929_.method2593(i_946_, i_947_, -1151432033));
						} else if (null != class161_930_ && !(aBoolArrayArray5025[781976289 * anInt5046][i_938_])) {
							int i_948_ = i_942_ + (i_913_ << 9);
							int i_949_ = i_943_ + (i_914_ << 9);
							is_927_[anInt5049 * -1297675597] = (class161_930_.method2593(i_948_, i_949_, -1151432033) - class161.method2593(i_948_, i_949_, -1151432033));
						}
					}
					if (i_938_ < 8 && anIntArray5044[i_939_] >= 0) {
						if (null != is)
							is[anInt5049 * -1297675597] = anIntArray5041[i_939_];
						is_925_[-1297675597 * anInt5049] = anIntArray5021[i_939_];
						is_924_[-1297675597 * anInt5049] = anIntArray5042[i_939_];
						is_923_[anInt5049 * -1297675597] = anIntArray4998[i_939_];
					} else {
						if (aBool5054 && (aBoolArrayArray5058[anInt5046 * 781976289][i_938_])) {
							is_924_[-1297675597 * anInt5049] = anInt4988 * -138056727;
							is_925_[-1297675597 * anInt5049] = -2112710167 * anInt5051;
							is_923_[-1297675597 * anInt5049] = -1731078331 * anInt5052;
						} else if (i_942_ == 0 && i_943_ == 0) {
							is_923_[anInt5049 * -1297675597] = is_928_[i_913_][i_914_];
							is_924_[anInt5049 * -1297675597] = 1277621507 * class7_931_.anInt67;
							is_925_[anInt5049 * -1297675597] = class7_931_.anInt66 * 592138937;
						} else if (i_942_ == 0 && i_943_ == 512) {
							is_923_[-1297675597 * anInt5049] = is_928_[i_913_][i_916_];
							is_924_[anInt5049 * -1297675597] = 1277621507 * class7_932_.anInt67;
							is_925_[anInt5049 * -1297675597] = class7_932_.anInt66 * 592138937;
						} else if (512 == i_942_ && i_943_ == 512) {
							is_923_[anInt5049 * -1297675597] = is_928_[i_915_][i_916_];
							is_924_[-1297675597 * anInt5049] = 1277621507 * class7_933_.anInt67;
							is_925_[-1297675597 * anInt5049] = class7_933_.anInt66 * 592138937;
						} else if (i_942_ == 512 && i_943_ == 0) {
							is_923_[-1297675597 * anInt5049] = is_928_[i_915_][i_914_];
							is_924_[anInt5049 * -1297675597] = 1277621507 * class7_934_.anInt67;
							is_925_[-1297675597 * anInt5049] = 592138937 * class7_934_.anInt66;
						} else {
							if (i_942_ < 256) {
								if (i_943_ < 256) {
									is_924_[anInt5049 * -1297675597] = class7_931_.anInt67 * 1277621507;
									is_925_[anInt5049 * -1297675597] = 592138937 * class7_931_.anInt66;
								} else {
									is_924_[-1297675597 * anInt5049] = class7_932_.anInt67 * 1277621507;
									is_925_[-1297675597 * anInt5049] = class7_932_.anInt66 * 592138937;
								}
							} else if (i_943_ < 256) {
								is_924_[-1297675597 * anInt5049] = class7_934_.anInt67 * 1277621507;
								is_925_[-1297675597 * anInt5049] = class7_934_.anInt66 * 592138937;
							} else {
								is_924_[-1297675597 * anInt5049] = class7_933_.anInt67 * 1277621507;
								is_925_[anInt5049 * -1297675597] = 592138937 * class7_933_.anInt66;
							}
							int i_950_ = Class249.method4658(is_928_[i_913_][i_914_], is_928_[i_915_][i_914_], i_942_ << 7 >> 9, -604110072);
							int i_951_ = Class249.method4658(is_928_[i_913_][i_916_], is_928_[i_915_][i_916_], i_942_ << 7 >> 9, -604110072);
							is_923_[anInt5049 * -1297675597] = Class249.method4658(i_950_, i_951_, i_943_ << 7 >> 9, -604110072);
						}
						if (null != is)
							is[anInt5049 * -1297675597] = is_923_[anInt5049 * -1297675597];
					}
					anInt5049 += -320293765;
				}
				anInt5048 += 723469927;
			}
			if (0 != 781976289 * anInt5046 && class7.aBool64)
				aBool5053 = true;
		}
	}

	static final int method7422(int i, int i_952_) {
		int i_953_ = i + 57 * i_952_;
		i_953_ = i_953_ << 13 ^ i_953_;
		int i_954_ = (i_953_ * (789221 + i_953_ * i_953_ * 15731) + 1376312589 & 0x7fffffff);
		return i_954_ >> 19 & 0xff;
	}

	static final int method7423(int i, int i_955_) {
		int i_956_ = i + 57 * i_955_;
		i_956_ = i_956_ << 13 ^ i_956_;
		int i_957_ = (i_956_ * (789221 + i_956_ * i_956_ * 15731) + 1376312589 & 0x7fffffff);
		return i_957_ >> 19 & 0xff;
	}

	static final int method7424(int i, int i_958_, int i_959_) {
		int i_960_ = i / i_959_;
		int i_961_ = i & i_959_ - 1;
		int i_962_ = i_958_ / i_959_;
		int i_963_ = i_958_ & i_959_ - 1;
		int i_964_ = Class490.method7973(i_960_, i_962_, (byte) 17);
		int i_965_ = Class490.method7973(i_960_ + 1, i_962_, (byte) 3);
		int i_966_ = Class490.method7973(i_960_, 1 + i_962_, (byte) 94);
		int i_967_ = Class490.method7973(i_960_ + 1, i_962_ + 1, (byte) 1);
		int i_968_ = Class298.method5512(i_964_, i_965_, i_961_, i_959_, (short) 397);
		int i_969_ = Class298.method5512(i_966_, i_967_, i_961_, i_959_, (short) 397);
		return Class298.method5512(i_968_, i_969_, i_963_, i_959_, (short) 397);
	}

	static final boolean method7425(int i, int i_970_) {
		return i < 7;
	}

	static final void method7426(Class665 class665, byte i) {
		int i_971_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (i_971_ == -1)
			Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub13_10608, Class204.aClass527_Sub31_2213.aClass700_Sub13_10607.method16964((byte) -37), 1578193317);
		else
			Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10608), i_971_, 280307296);
		Class639_Sub1.method16871((byte) 30);
	}

	public static boolean method7427(char c, byte i) {
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			return true;
		if ('\0' != c) {
			char[] cs = Class662.aCharArray8515;
			for (int i_972_ = 0; i_972_ < cs.length; i_972_++) {
				char c_973_ = cs[i_972_];
				if (c_973_ == c)
					return true;
			}
		}
		return false;
	}

	static int method7428(Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1, int i) {
		Class295 class295 = class640_sub1_sub2_sub1_sub1.aClass295_12168;
		if (null != class295.anIntArray3312) {
			class295 = class295.method5314(Class671.aClass97_8584, Class671.aClass97_8584, 773665029);
			if (null == class295)
				return -1;
		}
		int i_974_ = -422751553 * class295.anInt3329;
		Class587 class587 = class640_sub1_sub2_sub1_sub1.method18542(-1807127329);
		int i_975_ = class640_sub1_sub2_sub1_sub1.aClass695_Sub2_11913.method14164(1313803335);
		if (i_975_ == -1 || class640_sub1_sub2_sub1_sub1.aClass695_Sub2_11913.aBool10970)
			i_974_ = class295.anInt3327 * -324553837;
		else if (i_975_ == class587.anInt7755 * 298811127 || i_975_ == class587.anInt7727 * -1566427073 || i_975_ == -1620298651 * class587.anInt7729 || i_975_ == class587.anInt7728 * 1429573541)
			i_974_ = 2047475243 * class295.anInt3330;
		else if (-1585256987 * class587.anInt7721 == i_975_ || i_975_ == class587.anInt7731 * 755159797 || -553713681 * class587.anInt7733 == i_975_ || i_975_ == class587.anInt7732 * -2115193861)
			i_974_ = class295.anInt3331 * 1772688851;
		return i_974_;
	}
}
