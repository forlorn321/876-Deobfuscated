/* Class256 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class256 {
	int[][] anIntArrayArray2809;
	int anInt2810;
	boolean[] aBoolArray2811;
	int[] anIntArray2812;
	int[] anIntArray2813;
	int[] anIntArray2814;
	boolean[][] aBoolArrayArray2815;
	int[][] anIntArrayArray2816;
	int[] anIntArray2817;
	int[][] anIntArrayArray2818;
	Class241 aClass241_2819;
	int[] anIntArray2820;
	static int[] anIntArray2821 = { 256, 128, 86, 64 };
	static float[] aFloatArray2822 = { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F, 2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F, 3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F, 4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F, 7.041359E-7F,
			7.4989464E-7F, 7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F, 1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F, 1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F, 2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F, 3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F, 4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F,
			5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F, 7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F, 1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F, 1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F, 2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F,
			4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F, 6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F, 1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F, 1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F, 2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F, 2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F, 3.5866388E-4F,
			3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F, 4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F, 7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F, 9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F, 0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F, 0.0026895993F, 0.0028643848F,
			0.0030505287F, 0.003248769F, 0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F, 0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F, 0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F, 0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F, 0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F, 0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F,
			0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F, 0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F, 0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F, 0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F, 0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F, 0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F, 0.22067343F, 0.23501402F,
			0.25028655F, 0.26655158F, 0.28387362F, 0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F, 0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F, 0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F, 0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F };

	void method4709(int i, int i_0_, int i_1_, int i_2_, Class250 class250, int i_3_) {
		int i_4_ = i_2_ - i_0_;
		int i_5_ = i_1_ - i;
		int i_6_ = i_4_ < 0 ? -i_4_ : i_4_;
		int i_7_ = i_4_ / i_5_;
		int i_8_ = i_0_;
		int i_9_ = 0;
		int i_10_ = i_4_ < 0 ? i_7_ - 1 : i_7_ + 1;
		i_6_ = i_6_ - (i_7_ < 0 ? -i_7_ : i_7_) * i_5_;
		class250.aFloatArray2781[i] *= aFloatArray2822[i_8_];
		if (i_1_ > i_3_)
			i_1_ = i_3_;
		for (int i_11_ = i + 1; i_11_ < i_1_; i_11_++) {
			i_9_ += i_6_;
			if (i_9_ >= i_5_) {
				i_9_ -= i_5_;
				i_8_ += i_10_;
			} else
				i_8_ += i_7_;
			class250.aFloatArray2781[i_11_] *= aFloatArray2822[i_8_];
		}
	}

	void method4710(Class241 class241, int i) {
		aClass241_2819 = class241;
		int i_12_ = aClass241_2819.method4413(16);
		if (i_12_ != 1)
			throw new RuntimeException();
		if (aBoolArray2811 == null || aBoolArray2811.length != i)
			aBoolArray2811 = new boolean[i];
		else {
			for (int i_13_ = 0; i_13_ < aBoolArray2811.length; i_13_++)
				aBoolArray2811[i_13_] = false;
		}
		int i_14_ = aClass241_2819.method4413(5);
		int i_15_ = 0;
		if (anIntArray2817 == null || anIntArray2817.length != i_14_)
			anIntArray2817 = new int[i_14_];
		else
			method4714(anIntArray2817);
		for (int i_16_ = 0; i_16_ < i_14_; i_16_++) {
			int i_17_ = aClass241_2819.method4413(4);
			anIntArray2817[i_16_] = i_17_;
			if (i_17_ >= i_15_)
				i_15_ = i_17_ + 1;
		}
		if (anIntArray2812 == null || anIntArray2812.length != i_15_)
			anIntArray2812 = new int[i_15_];
		else
			method4714(anIntArray2812);
		if (anIntArray2813 == null || anIntArray2813.length != i_15_)
			anIntArray2813 = new int[i_15_];
		else
			method4714(anIntArray2813);
		if (anIntArray2814 == null || anIntArray2814.length != i_15_)
			anIntArray2814 = new int[i_15_];
		else
			method4714(anIntArray2814);
		if (anIntArrayArray2809 == null || anIntArrayArray2809.length != i_15_)
			anIntArrayArray2809 = new int[i_15_][];
		for (int i_18_ = 0; i_18_ < i_15_; i_18_++) {
			anIntArray2812[i_18_] = aClass241_2819.method4413(3) + 1;
			int i_19_ = anIntArray2813[i_18_] = aClass241_2819.method4413(2);
			if (i_19_ != 0)
				anIntArray2814[i_18_] = aClass241_2819.method4413(8);
			i_19_ = 1 << i_19_;
			int[] is = new int[i_19_];
			anIntArrayArray2809[i_18_] = is;
			for (int i_20_ = 0; i_20_ < i_19_; i_20_++)
				is[i_20_] = aClass241_2819.method4413(8) - 1;
		}
		anInt2810 = aClass241_2819.method4413(2) + 1;
		int i_21_ = aClass241_2819.method4413(4);
		int i_22_ = 2;
		for (int i_23_ = 0; i_23_ < i_14_; i_23_++)
			i_22_ += anIntArray2812[anIntArray2817[i_23_]];
		if (anIntArray2820 == null || anIntArray2820.length != i_22_)
			anIntArray2820 = new int[i_22_];
		else
			method4714(anIntArray2820);
		anIntArray2820[0] = 0;
		anIntArray2820[1] = 1 << i_21_;
		i_22_ = 2;
		for (int i_24_ = 0; i_24_ < i_14_; i_24_++) {
			int i_25_ = anIntArray2817[i_24_];
			for (int i_26_ = 0; i_26_ < anIntArray2812[i_25_]; i_26_++)
				anIntArray2820[i_22_++] = aClass241_2819.method4413(i_21_);
		}
		if (anIntArrayArray2816 == null || anIntArrayArray2816.length < i_22_) {
			anIntArrayArray2816 = new int[i][i_22_];
			anIntArrayArray2818 = new int[i][i_22_];
			aBoolArrayArray2815 = new boolean[i][i_22_];
		}
	}

	void method4711(Class250 class250, int i, int i_27_) {
		if (aBoolArray2811[i_27_]) {
			int i_28_ = anIntArray2820.length;
			method4715(0, i_28_ - 1, i_27_);
			int i_29_ = 0;
			int i_30_ = anIntArrayArray2818[i_27_][0] * anInt2810;
			for (int i_31_ = 1; i_31_ < i_28_; i_31_++) {
				if (anIntArrayArray2818[i_27_][i_31_] >= 0) {
					int i_32_ = anIntArrayArray2816[i_27_][i_31_];
					int i_33_ = anIntArrayArray2818[i_27_][i_31_] * anInt2810;
					method4712(i_29_, i_30_, i_32_, i_33_, class250, i);
					if (i_32_ < i) {
						/* empty */
					}
					i_29_ = i_32_;
					i_30_ = i_33_;
				}
			}
			float f = aFloatArray2822[i_30_];
			for (int i_34_ = i_29_; i_34_ < i; i_34_++)
				class250.aFloatArray2781[i_34_] *= f;
		}
	}

	void method4712(int i, int i_35_, int i_36_, int i_37_, Class250 class250, int i_38_) {
		int i_39_ = i_37_ - i_35_;
		int i_40_ = i_36_ - i;
		int i_41_ = i_39_ < 0 ? -i_39_ : i_39_;
		int i_42_ = i_39_ / i_40_;
		int i_43_ = i_35_;
		int i_44_ = 0;
		int i_45_ = i_39_ < 0 ? i_42_ - 1 : i_42_ + 1;
		i_41_ = i_41_ - (i_42_ < 0 ? -i_42_ : i_42_) * i_40_;
		class250.aFloatArray2781[i] *= aFloatArray2822[i_43_];
		if (i_36_ > i_38_)
			i_36_ = i_38_;
		for (int i_46_ = i + 1; i_46_ < i_36_; i_46_++) {
			i_44_ += i_41_;
			if (i_44_ >= i_40_) {
				i_44_ -= i_40_;
				i_43_ += i_45_;
			} else
				i_43_ += i_42_;
			class250.aFloatArray2781[i_46_] *= aFloatArray2822[i_43_];
		}
	}

	static int method4713(int[] is, int i) {
		int i_47_ = is[i];
		int i_48_ = -1;
		int i_49_ = -2147483648;
		for (int i_50_ = 0; i_50_ < i; i_50_++) {
			int i_51_ = is[i_50_];
			if (i_51_ < i_47_ && i_51_ > i_49_) {
				i_48_ = i_50_;
				i_49_ = i_51_;
			}
		}
		return i_48_;
	}

	void method4714(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	void method4715(int i, int i_52_, int i_53_) {
		if (i < i_52_) {
			int i_54_ = i;
			int i_55_ = anIntArrayArray2816[i_53_][i_54_];
			int i_56_ = anIntArrayArray2818[i_53_][i_54_];
			boolean bool = aBoolArrayArray2815[i_53_][i_54_];
			for (int i_57_ = i + 1; i_57_ <= i_52_; i_57_++) {
				int i_58_ = anIntArrayArray2816[i_53_][i_57_];
				if (i_58_ < i_55_) {
					anIntArrayArray2816[i_53_][i_54_] = i_58_;
					anIntArrayArray2818[i_53_][i_54_] = anIntArrayArray2818[i_53_][i_57_];
					aBoolArrayArray2815[i_53_][i_54_] = aBoolArrayArray2815[i_53_][i_57_];
					i_54_++;
					anIntArrayArray2816[i_53_][i_57_] = anIntArrayArray2816[i_53_][i_54_];
					anIntArrayArray2818[i_53_][i_57_] = anIntArrayArray2818[i_53_][i_54_];
					aBoolArrayArray2815[i_53_][i_57_] = aBoolArrayArray2815[i_53_][i_54_];
				}
			}
			anIntArrayArray2816[i_53_][i_54_] = i_55_;
			anIntArrayArray2818[i_53_][i_54_] = i_56_;
			aBoolArrayArray2815[i_53_][i_54_] = bool;
			method4715(i, i_54_ - 1, i_53_);
			method4715(i_54_ + 1, i_52_, i_53_);
		}
	}

	boolean method4716(int i) {
		boolean bool = aClass241_2819.method4416() != 0;
		aBoolArray2811[i] = bool;
		if (!bool)
			return false;
		int i_59_ = anIntArray2820.length;
		for (int i_60_ = 0; i_60_ < i_59_; i_60_++)
			anIntArrayArray2816[i][i_60_] = anIntArray2820[i_60_];
		int i_61_ = anIntArray2821[anInt2810 - 1];
		int i_62_ = Class15.method735(i_61_ - 1, (byte) -76);
		anIntArrayArray2818[i][0] = aClass241_2819.method4413(i_62_);
		anIntArrayArray2818[i][1] = aClass241_2819.method4413(i_62_);
		int i_63_ = 2;
		for (int i_64_ = 0; i_64_ < anIntArray2817.length; i_64_++) {
			int i_65_ = anIntArray2817[i_64_];
			int i_66_ = anIntArray2812[i_65_];
			int i_67_ = anIntArray2813[i_65_];
			int i_68_ = (1 << i_67_) - 1;
			int i_69_ = 0;
			if (i_67_ > 0)
				i_69_ = aClass241_2819.aClass233Array2444[anIntArray2814[i_65_]].method4337(aClass241_2819);
			for (int i_70_ = 0; i_70_ < i_66_; i_70_++) {
				int i_71_ = anIntArrayArray2809[i_65_][i_69_ & i_68_];
				i_69_ >>>= i_67_;
				anIntArrayArray2818[i][i_63_] = i_71_ >= 0 ? aClass241_2819.aClass233Array2444[i_71_].method4337(aClass241_2819) : 0;
				i_63_++;
			}
		}
		return true;
	}

	void method4717(int i) {
		if (aBoolArray2811[i]) {
			int i_72_ = anIntArray2820.length;
			int i_73_ = anIntArray2821[anInt2810 - 1];
			boolean[] bools = aBoolArrayArray2815[i];
			aBoolArrayArray2815[i][1] = true;
			bools[0] = true;
			for (int i_74_ = 2; i_74_ < i_72_; i_74_++) {
				int i_75_ = method4713(anIntArray2820, i_74_);
				int i_76_ = method4721(anIntArray2820, i_74_);
				int i_77_ = method4722(anIntArray2820[i_75_], anIntArrayArray2818[i][i_75_], anIntArray2820[i_76_], anIntArrayArray2818[i][i_76_], anIntArray2820[i_74_]);
				int i_78_ = anIntArrayArray2818[i][i_74_];
				int i_79_ = i_73_ - i_77_;
				int i_80_ = i_77_;
				int i_81_ = (i_79_ < i_80_ ? i_79_ : i_80_) << 1;
				if (i_78_ != 0) {
					boolean[] bools_82_ = aBoolArrayArray2815[i];
					int i_83_ = i_75_;
					aBoolArrayArray2815[i][i_76_] = true;
					bools_82_[i_83_] = true;
					aBoolArrayArray2815[i][i_74_] = true;
					if (i_78_ >= i_81_)
						anIntArrayArray2818[i][i_74_] = (i_79_ > i_80_ ? i_78_ - i_80_ + i_77_ : i_77_ - i_78_ + i_79_ - 1);
					else
						anIntArrayArray2818[i][i_74_] = ((i_78_ & 0x1) != 0 ? i_77_ - (i_78_ + 1 >> 1) : i_77_ + (i_78_ >> 1));
				} else {
					aBoolArrayArray2815[i][i_74_] = false;
					anIntArrayArray2818[i][i_74_] = i_77_;
				}
			}
			for (int i_84_ = 0; i_84_ < i_72_; i_84_++) {
				if (!aBoolArrayArray2815[i][i_84_])
					anIntArrayArray2818[i][i_84_] = -1;
			}
		}
	}

	void method4718(Class250 class250, int i, int i_85_) {
		if (aBoolArray2811[i_85_]) {
			int i_86_ = anIntArray2820.length;
			method4715(0, i_86_ - 1, i_85_);
			int i_87_ = 0;
			int i_88_ = anIntArrayArray2818[i_85_][0] * anInt2810;
			for (int i_89_ = 1; i_89_ < i_86_; i_89_++) {
				if (anIntArrayArray2818[i_85_][i_89_] >= 0) {
					int i_90_ = anIntArrayArray2816[i_85_][i_89_];
					int i_91_ = anIntArrayArray2818[i_85_][i_89_] * anInt2810;
					method4712(i_87_, i_88_, i_90_, i_91_, class250, i);
					if (i_90_ < i) {
						/* empty */
					}
					i_87_ = i_90_;
					i_88_ = i_91_;
				}
			}
			float f = aFloatArray2822[i_88_];
			for (int i_92_ = i_87_; i_92_ < i; i_92_++)
				class250.aFloatArray2781[i_92_] *= f;
		}
	}

	void method4719(Class250 class250, int i, int i_93_) {
		if (aBoolArray2811[i_93_]) {
			int i_94_ = anIntArray2820.length;
			method4715(0, i_94_ - 1, i_93_);
			int i_95_ = 0;
			int i_96_ = anIntArrayArray2818[i_93_][0] * anInt2810;
			for (int i_97_ = 1; i_97_ < i_94_; i_97_++) {
				if (anIntArrayArray2818[i_93_][i_97_] >= 0) {
					int i_98_ = anIntArrayArray2816[i_93_][i_97_];
					int i_99_ = anIntArrayArray2818[i_93_][i_97_] * anInt2810;
					method4712(i_95_, i_96_, i_98_, i_99_, class250, i);
					if (i_98_ < i) {
						/* empty */
					}
					i_95_ = i_98_;
					i_96_ = i_99_;
				}
			}
			float f = aFloatArray2822[i_96_];
			for (int i_100_ = i_95_; i_100_ < i; i_100_++)
				class250.aFloatArray2781[i_100_] *= f;
		}
	}

	static int method4720(int[] is, int i) {
		int i_101_ = is[i];
		int i_102_ = -1;
		int i_103_ = -2147483648;
		for (int i_104_ = 0; i_104_ < i; i_104_++) {
			int i_105_ = is[i_104_];
			if (i_105_ < i_101_ && i_105_ > i_103_) {
				i_102_ = i_104_;
				i_103_ = i_105_;
			}
		}
		return i_102_;
	}

	static int method4721(int[] is, int i) {
		int i_106_ = is[i];
		int i_107_ = -1;
		int i_108_ = 2147483647;
		for (int i_109_ = 0; i_109_ < i; i_109_++) {
			int i_110_ = is[i_109_];
			if (i_110_ > i_106_ && i_110_ < i_108_) {
				i_107_ = i_109_;
				i_108_ = i_110_;
			}
		}
		return i_107_;
	}

	int method4722(int i, int i_111_, int i_112_, int i_113_, int i_114_) {
		int i_115_ = i_113_ - i_111_;
		int i_116_ = i_112_ - i;
		int i_117_ = i_115_ < 0 ? -i_115_ : i_115_;
		int i_118_ = i_117_ * (i_114_ - i);
		int i_119_ = i_118_ / i_116_;
		return i_115_ < 0 ? i_111_ - i_119_ : i_111_ + i_119_;
	}

	int method4723(int i, int i_120_, int i_121_, int i_122_, int i_123_) {
		int i_124_ = i_122_ - i_120_;
		int i_125_ = i_121_ - i;
		int i_126_ = i_124_ < 0 ? -i_124_ : i_124_;
		int i_127_ = i_126_ * (i_123_ - i);
		int i_128_ = i_127_ / i_125_;
		return i_124_ < 0 ? i_120_ - i_128_ : i_120_ + i_128_;
	}

	int method4724(int i, int i_129_, int i_130_, int i_131_, int i_132_) {
		int i_133_ = i_131_ - i_129_;
		int i_134_ = i_130_ - i;
		int i_135_ = i_133_ < 0 ? -i_133_ : i_133_;
		int i_136_ = i_135_ * (i_132_ - i);
		int i_137_ = i_136_ / i_134_;
		return i_133_ < 0 ? i_129_ - i_137_ : i_129_ + i_137_;
	}

	static int method4725(int[] is, int i) {
		int i_138_ = is[i];
		int i_139_ = -1;
		int i_140_ = 2147483647;
		for (int i_141_ = 0; i_141_ < i; i_141_++) {
			int i_142_ = is[i_141_];
			if (i_142_ > i_138_ && i_142_ < i_140_) {
				i_139_ = i_141_;
				i_140_ = i_142_;
			}
		}
		return i_139_;
	}

	void method4726(int i, int i_143_, int i_144_, int i_145_, Class250 class250, int i_146_) {
		int i_147_ = i_145_ - i_143_;
		int i_148_ = i_144_ - i;
		int i_149_ = i_147_ < 0 ? -i_147_ : i_147_;
		int i_150_ = i_147_ / i_148_;
		int i_151_ = i_143_;
		int i_152_ = 0;
		int i_153_ = i_147_ < 0 ? i_150_ - 1 : i_150_ + 1;
		i_149_ = i_149_ - (i_150_ < 0 ? -i_150_ : i_150_) * i_148_;
		class250.aFloatArray2781[i] *= aFloatArray2822[i_151_];
		if (i_144_ > i_146_)
			i_144_ = i_146_;
		for (int i_154_ = i + 1; i_154_ < i_144_; i_154_++) {
			i_152_ += i_149_;
			if (i_152_ >= i_148_) {
				i_152_ -= i_148_;
				i_151_ += i_153_;
			} else
				i_151_ += i_150_;
			class250.aFloatArray2781[i_154_] *= aFloatArray2822[i_151_];
		}
	}

	void method4727(int i, int i_155_, int i_156_, int i_157_, Class250 class250, int i_158_) {
		int i_159_ = i_157_ - i_155_;
		int i_160_ = i_156_ - i;
		int i_161_ = i_159_ < 0 ? -i_159_ : i_159_;
		int i_162_ = i_159_ / i_160_;
		int i_163_ = i_155_;
		int i_164_ = 0;
		int i_165_ = i_159_ < 0 ? i_162_ - 1 : i_162_ + 1;
		i_161_ = i_161_ - (i_162_ < 0 ? -i_162_ : i_162_) * i_160_;
		class250.aFloatArray2781[i] *= aFloatArray2822[i_163_];
		if (i_156_ > i_158_)
			i_156_ = i_158_;
		for (int i_166_ = i + 1; i_166_ < i_156_; i_166_++) {
			i_164_ += i_161_;
			if (i_164_ >= i_160_) {
				i_164_ -= i_160_;
				i_163_ += i_165_;
			} else
				i_163_ += i_162_;
			class250.aFloatArray2781[i_166_] *= aFloatArray2822[i_163_];
		}
	}

	void method4728(Class250 class250, int i, int i_167_) {
		if (aBoolArray2811[i_167_]) {
			int i_168_ = anIntArray2820.length;
			method4715(0, i_168_ - 1, i_167_);
			int i_169_ = 0;
			int i_170_ = anIntArrayArray2818[i_167_][0] * anInt2810;
			for (int i_171_ = 1; i_171_ < i_168_; i_171_++) {
				if (anIntArrayArray2818[i_167_][i_171_] >= 0) {
					int i_172_ = anIntArrayArray2816[i_167_][i_171_];
					int i_173_ = anIntArrayArray2818[i_167_][i_171_] * anInt2810;
					method4712(i_169_, i_170_, i_172_, i_173_, class250, i);
					if (i_172_ < i) {
						/* empty */
					}
					i_169_ = i_172_;
					i_170_ = i_173_;
				}
			}
			float f = aFloatArray2822[i_170_];
			for (int i_174_ = i_169_; i_174_ < i; i_174_++)
				class250.aFloatArray2781[i_174_] *= f;
		}
	}

	void method4729(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	void method4730(int i, int i_175_, int i_176_) {
		if (i < i_175_) {
			int i_177_ = i;
			int i_178_ = anIntArrayArray2816[i_176_][i_177_];
			int i_179_ = anIntArrayArray2818[i_176_][i_177_];
			boolean bool = aBoolArrayArray2815[i_176_][i_177_];
			for (int i_180_ = i + 1; i_180_ <= i_175_; i_180_++) {
				int i_181_ = anIntArrayArray2816[i_176_][i_180_];
				if (i_181_ < i_178_) {
					anIntArrayArray2816[i_176_][i_177_] = i_181_;
					anIntArrayArray2818[i_176_][i_177_] = anIntArrayArray2818[i_176_][i_180_];
					aBoolArrayArray2815[i_176_][i_177_] = aBoolArrayArray2815[i_176_][i_180_];
					i_177_++;
					anIntArrayArray2816[i_176_][i_180_] = anIntArrayArray2816[i_176_][i_177_];
					anIntArrayArray2818[i_176_][i_180_] = anIntArrayArray2818[i_176_][i_177_];
					aBoolArrayArray2815[i_176_][i_180_] = aBoolArrayArray2815[i_176_][i_177_];
				}
			}
			anIntArrayArray2816[i_176_][i_177_] = i_178_;
			anIntArrayArray2818[i_176_][i_177_] = i_179_;
			aBoolArrayArray2815[i_176_][i_177_] = bool;
			method4715(i, i_177_ - 1, i_176_);
			method4715(i_177_ + 1, i_175_, i_176_);
		}
	}

	void method4731(int i, int i_182_, int i_183_) {
		if (i < i_182_) {
			int i_184_ = i;
			int i_185_ = anIntArrayArray2816[i_183_][i_184_];
			int i_186_ = anIntArrayArray2818[i_183_][i_184_];
			boolean bool = aBoolArrayArray2815[i_183_][i_184_];
			for (int i_187_ = i + 1; i_187_ <= i_182_; i_187_++) {
				int i_188_ = anIntArrayArray2816[i_183_][i_187_];
				if (i_188_ < i_185_) {
					anIntArrayArray2816[i_183_][i_184_] = i_188_;
					anIntArrayArray2818[i_183_][i_184_] = anIntArrayArray2818[i_183_][i_187_];
					aBoolArrayArray2815[i_183_][i_184_] = aBoolArrayArray2815[i_183_][i_187_];
					i_184_++;
					anIntArrayArray2816[i_183_][i_187_] = anIntArrayArray2816[i_183_][i_184_];
					anIntArrayArray2818[i_183_][i_187_] = anIntArrayArray2818[i_183_][i_184_];
					aBoolArrayArray2815[i_183_][i_187_] = aBoolArrayArray2815[i_183_][i_184_];
				}
			}
			anIntArrayArray2816[i_183_][i_184_] = i_185_;
			anIntArrayArray2818[i_183_][i_184_] = i_186_;
			aBoolArrayArray2815[i_183_][i_184_] = bool;
			method4715(i, i_184_ - 1, i_183_);
			method4715(i_184_ + 1, i_182_, i_183_);
		}
	}

	boolean method4732(int i) {
		boolean bool = aClass241_2819.method4416() != 0;
		aBoolArray2811[i] = bool;
		if (!bool)
			return false;
		int i_189_ = anIntArray2820.length;
		for (int i_190_ = 0; i_190_ < i_189_; i_190_++)
			anIntArrayArray2816[i][i_190_] = anIntArray2820[i_190_];
		int i_191_ = anIntArray2821[anInt2810 - 1];
		int i_192_ = Class15.method735(i_191_ - 1, (byte) -47);
		anIntArrayArray2818[i][0] = aClass241_2819.method4413(i_192_);
		anIntArrayArray2818[i][1] = aClass241_2819.method4413(i_192_);
		int i_193_ = 2;
		for (int i_194_ = 0; i_194_ < anIntArray2817.length; i_194_++) {
			int i_195_ = anIntArray2817[i_194_];
			int i_196_ = anIntArray2812[i_195_];
			int i_197_ = anIntArray2813[i_195_];
			int i_198_ = (1 << i_197_) - 1;
			int i_199_ = 0;
			if (i_197_ > 0)
				i_199_ = aClass241_2819.aClass233Array2444[anIntArray2814[i_195_]].method4337(aClass241_2819);
			for (int i_200_ = 0; i_200_ < i_196_; i_200_++) {
				int i_201_ = anIntArrayArray2809[i_195_][i_199_ & i_198_];
				i_199_ >>>= i_197_;
				anIntArrayArray2818[i][i_193_] = i_201_ >= 0 ? aClass241_2819.aClass233Array2444[i_201_].method4337(aClass241_2819) : 0;
				i_193_++;
			}
		}
		return true;
	}

	int method4733(int i, int i_202_, int i_203_, int i_204_, int i_205_) {
		int i_206_ = i_204_ - i_202_;
		int i_207_ = i_203_ - i;
		int i_208_ = i_206_ < 0 ? -i_206_ : i_206_;
		int i_209_ = i_208_ * (i_205_ - i);
		int i_210_ = i_209_ / i_207_;
		return i_206_ < 0 ? i_202_ - i_210_ : i_202_ + i_210_;
	}

	static int method4734(int[] is, int i) {
		int i_211_ = is[i];
		int i_212_ = -1;
		int i_213_ = 2147483647;
		for (int i_214_ = 0; i_214_ < i; i_214_++) {
			int i_215_ = is[i_214_];
			if (i_215_ > i_211_ && i_215_ < i_213_) {
				i_212_ = i_214_;
				i_213_ = i_215_;
			}
		}
		return i_212_;
	}

	void method4735(int i) {
		if (aBoolArray2811[i]) {
			int i_216_ = anIntArray2820.length;
			int i_217_ = anIntArray2821[anInt2810 - 1];
			boolean[] bools = aBoolArrayArray2815[i];
			aBoolArrayArray2815[i][1] = true;
			bools[0] = true;
			for (int i_218_ = 2; i_218_ < i_216_; i_218_++) {
				int i_219_ = method4713(anIntArray2820, i_218_);
				int i_220_ = method4721(anIntArray2820, i_218_);
				int i_221_ = method4722(anIntArray2820[i_219_], anIntArrayArray2818[i][i_219_], anIntArray2820[i_220_], anIntArrayArray2818[i][i_220_], anIntArray2820[i_218_]);
				int i_222_ = anIntArrayArray2818[i][i_218_];
				int i_223_ = i_217_ - i_221_;
				int i_224_ = i_221_;
				int i_225_ = (i_223_ < i_224_ ? i_223_ : i_224_) << 1;
				if (i_222_ != 0) {
					boolean[] bools_226_ = aBoolArrayArray2815[i];
					int i_227_ = i_219_;
					aBoolArrayArray2815[i][i_220_] = true;
					bools_226_[i_227_] = true;
					aBoolArrayArray2815[i][i_218_] = true;
					if (i_222_ >= i_225_)
						anIntArrayArray2818[i][i_218_] = (i_223_ > i_224_ ? i_222_ - i_224_ + i_221_ : i_221_ - i_222_ + i_223_ - 1);
					else
						anIntArrayArray2818[i][i_218_] = ((i_222_ & 0x1) != 0 ? i_221_ - (i_222_ + 1 >> 1) : i_221_ + (i_222_ >> 1));
				} else {
					aBoolArrayArray2815[i][i_218_] = false;
					anIntArrayArray2818[i][i_218_] = i_221_;
				}
			}
			for (int i_228_ = 0; i_228_ < i_216_; i_228_++) {
				if (!aBoolArrayArray2815[i][i_228_])
					anIntArrayArray2818[i][i_228_] = -1;
			}
		}
	}

	void method4736(int i) {
		if (aBoolArray2811[i]) {
			int i_229_ = anIntArray2820.length;
			int i_230_ = anIntArray2821[anInt2810 - 1];
			boolean[] bools = aBoolArrayArray2815[i];
			aBoolArrayArray2815[i][1] = true;
			bools[0] = true;
			for (int i_231_ = 2; i_231_ < i_229_; i_231_++) {
				int i_232_ = method4713(anIntArray2820, i_231_);
				int i_233_ = method4721(anIntArray2820, i_231_);
				int i_234_ = method4722(anIntArray2820[i_232_], anIntArrayArray2818[i][i_232_], anIntArray2820[i_233_], anIntArrayArray2818[i][i_233_], anIntArray2820[i_231_]);
				int i_235_ = anIntArrayArray2818[i][i_231_];
				int i_236_ = i_230_ - i_234_;
				int i_237_ = i_234_;
				int i_238_ = (i_236_ < i_237_ ? i_236_ : i_237_) << 1;
				if (i_235_ != 0) {
					boolean[] bools_239_ = aBoolArrayArray2815[i];
					int i_240_ = i_232_;
					aBoolArrayArray2815[i][i_233_] = true;
					bools_239_[i_240_] = true;
					aBoolArrayArray2815[i][i_231_] = true;
					if (i_235_ >= i_238_)
						anIntArrayArray2818[i][i_231_] = (i_236_ > i_237_ ? i_235_ - i_237_ + i_234_ : i_234_ - i_235_ + i_236_ - 1);
					else
						anIntArrayArray2818[i][i_231_] = ((i_235_ & 0x1) != 0 ? i_234_ - (i_235_ + 1 >> 1) : i_234_ + (i_235_ >> 1));
				} else {
					aBoolArrayArray2815[i][i_231_] = false;
					anIntArrayArray2818[i][i_231_] = i_234_;
				}
			}
			for (int i_241_ = 0; i_241_ < i_229_; i_241_++) {
				if (!aBoolArrayArray2815[i][i_241_])
					anIntArrayArray2818[i][i_241_] = -1;
			}
		}
	}

	Class256() {
		/* empty */
	}

	boolean method4737(int i) {
		boolean bool = aClass241_2819.method4416() != 0;
		aBoolArray2811[i] = bool;
		if (!bool)
			return false;
		int i_242_ = anIntArray2820.length;
		for (int i_243_ = 0; i_243_ < i_242_; i_243_++)
			anIntArrayArray2816[i][i_243_] = anIntArray2820[i_243_];
		int i_244_ = anIntArray2821[anInt2810 - 1];
		int i_245_ = Class15.method735(i_244_ - 1, (byte) -119);
		anIntArrayArray2818[i][0] = aClass241_2819.method4413(i_245_);
		anIntArrayArray2818[i][1] = aClass241_2819.method4413(i_245_);
		int i_246_ = 2;
		for (int i_247_ = 0; i_247_ < anIntArray2817.length; i_247_++) {
			int i_248_ = anIntArray2817[i_247_];
			int i_249_ = anIntArray2812[i_248_];
			int i_250_ = anIntArray2813[i_248_];
			int i_251_ = (1 << i_250_) - 1;
			int i_252_ = 0;
			if (i_250_ > 0)
				i_252_ = aClass241_2819.aClass233Array2444[anIntArray2814[i_248_]].method4337(aClass241_2819);
			for (int i_253_ = 0; i_253_ < i_249_; i_253_++) {
				int i_254_ = anIntArrayArray2809[i_248_][i_252_ & i_251_];
				i_252_ >>>= i_250_;
				anIntArrayArray2818[i][i_246_] = i_254_ >= 0 ? aClass241_2819.aClass233Array2444[i_254_].method4337(aClass241_2819) : 0;
				i_246_++;
			}
		}
		return true;
	}

	boolean method4738(int i) {
		boolean bool = aClass241_2819.method4416() != 0;
		aBoolArray2811[i] = bool;
		if (!bool)
			return false;
		int i_255_ = anIntArray2820.length;
		for (int i_256_ = 0; i_256_ < i_255_; i_256_++)
			anIntArrayArray2816[i][i_256_] = anIntArray2820[i_256_];
		int i_257_ = anIntArray2821[anInt2810 - 1];
		int i_258_ = Class15.method735(i_257_ - 1, (byte) -16);
		anIntArrayArray2818[i][0] = aClass241_2819.method4413(i_258_);
		anIntArrayArray2818[i][1] = aClass241_2819.method4413(i_258_);
		int i_259_ = 2;
		for (int i_260_ = 0; i_260_ < anIntArray2817.length; i_260_++) {
			int i_261_ = anIntArray2817[i_260_];
			int i_262_ = anIntArray2812[i_261_];
			int i_263_ = anIntArray2813[i_261_];
			int i_264_ = (1 << i_263_) - 1;
			int i_265_ = 0;
			if (i_263_ > 0)
				i_265_ = aClass241_2819.aClass233Array2444[anIntArray2814[i_261_]].method4337(aClass241_2819);
			for (int i_266_ = 0; i_266_ < i_262_; i_266_++) {
				int i_267_ = anIntArrayArray2809[i_261_][i_265_ & i_264_];
				i_265_ >>>= i_263_;
				anIntArrayArray2818[i][i_259_] = i_267_ >= 0 ? aClass241_2819.aClass233Array2444[i_267_].method4337(aClass241_2819) : 0;
				i_259_++;
			}
		}
		return true;
	}
}
