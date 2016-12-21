/* Class239 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class239 {
	static float[] aFloatArray2431;
	int anInt2432;
	int[] anIntArray2433;
	int[][] anIntArrayArray2434;
	boolean[][] aBoolArrayArray2435;
	int[] anIntArray2436;
	int[] anIntArray2437;
	int[] anIntArray2438;
	int[][] anIntArrayArray2439;
	int[][] anIntArrayArray2440;
	Class258 aClass258_2441;
	boolean[] aBoolArray2442;
	static int[] anIntArray2443 = { 256, 128, 86, 64 };
	int[] anIntArray2444;

	void method3362(Class258 class258, int i) {
		aClass258_2441 = class258;
		int i_0_ = aClass258_2441.method3563(16);
		if (i_0_ != 1)
			throw new RuntimeException();
		if (aBoolArray2442 == null || aBoolArray2442.length != i)
			aBoolArray2442 = new boolean[i];
		else {
			for (int i_1_ = 0; i_1_ < aBoolArray2442.length; i_1_++)
				aBoolArray2442[i_1_] = false;
		}
		int i_2_ = aClass258_2441.method3563(5);
		int i_3_ = 0;
		if (anIntArray2437 == null || anIntArray2437.length != i_2_)
			anIntArray2437 = new int[i_2_];
		else
			method3377(anIntArray2437);
		for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
			int i_5_ = aClass258_2441.method3563(4);
			anIntArray2437[i_4_] = i_5_;
			if (i_5_ >= i_3_)
				i_3_ = i_5_ + 1;
		}
		if (anIntArray2444 == null || anIntArray2444.length != i_3_)
			anIntArray2444 = new int[i_3_];
		else
			method3377(anIntArray2444);
		if (anIntArray2438 == null || anIntArray2438.length != i_3_)
			anIntArray2438 = new int[i_3_];
		else
			method3377(anIntArray2438);
		if (anIntArray2436 == null || anIntArray2436.length != i_3_)
			anIntArray2436 = new int[i_3_];
		else
			method3377(anIntArray2436);
		if (anIntArrayArray2440 == null || anIntArrayArray2440.length != i_3_)
			anIntArrayArray2440 = new int[i_3_][];
		for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
			anIntArray2444[i_6_] = aClass258_2441.method3563(3) + 1;
			int i_7_ = anIntArray2438[i_6_] = aClass258_2441.method3563(2);
			if (i_7_ != 0)
				anIntArray2436[i_6_] = aClass258_2441.method3563(8);
			i_7_ = 1 << i_7_;
			int[] is = new int[i_7_];
			anIntArrayArray2440[i_6_] = is;
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
				is[i_8_] = aClass258_2441.method3563(8) - 1;
		}
		anInt2432 = aClass258_2441.method3563(2) + 1;
		int i_9_ = aClass258_2441.method3563(4);
		int i_10_ = 2;
		for (int i_11_ = 0; i_11_ < i_2_; i_11_++)
			i_10_ += anIntArray2444[anIntArray2437[i_11_]];
		if (anIntArray2433 == null || anIntArray2433.length != i_10_)
			anIntArray2433 = new int[i_10_];
		else
			method3377(anIntArray2433);
		anIntArray2433[0] = 0;
		anIntArray2433[1] = 1 << i_9_;
		i_10_ = 2;
		for (int i_12_ = 0; i_12_ < i_2_; i_12_++) {
			int i_13_ = anIntArray2437[i_12_];
			for (int i_14_ = 0; i_14_ < anIntArray2444[i_13_]; i_14_++)
				anIntArray2433[i_10_++] = aClass258_2441.method3563(i_9_);
		}
		if (anIntArrayArray2434 == null || anIntArrayArray2434.length < i_10_) {
			anIntArrayArray2434 = new int[i][i_10_];
			anIntArrayArray2439 = new int[i][i_10_];
			aBoolArrayArray2435 = new boolean[i][i_10_];
		}
	}

	int method3363(int i, int i_15_, int i_16_, int i_17_, int i_18_) {
		int i_19_ = i_17_ - i_15_;
		int i_20_ = i_16_ - i;
		int i_21_ = i_19_ < 0 ? -i_19_ : i_19_;
		int i_22_ = i_21_ * (i_18_ - i);
		int i_23_ = i_22_ / i_20_;
		return i_19_ < 0 ? i_15_ - i_23_ : i_15_ + i_23_;
	}

	static int method3364(int[] is, int i) {
		int i_24_ = is[i];
		int i_25_ = -1;
		int i_26_ = 2147483647;
		for (int i_27_ = 0; i_27_ < i; i_27_++) {
			int i_28_ = is[i_27_];
			if (i_28_ > i_24_ && i_28_ < i_26_) {
				i_25_ = i_27_;
				i_26_ = i_28_;
			}
		}
		return i_25_;
	}

	int method3365(int i, int i_29_, int i_30_, int i_31_, int i_32_) {
		int i_33_ = i_31_ - i_29_;
		int i_34_ = i_30_ - i;
		int i_35_ = i_33_ < 0 ? -i_33_ : i_33_;
		int i_36_ = i_35_ * (i_32_ - i);
		int i_37_ = i_36_ / i_34_;
		return i_33_ < 0 ? i_29_ - i_37_ : i_29_ + i_37_;
	}

	void method3366(int i, int i_38_, int i_39_, int i_40_, Class235 class235, int i_41_) {
		int i_42_ = i_40_ - i_38_;
		int i_43_ = i_39_ - i;
		int i_44_ = i_42_ < 0 ? -i_42_ : i_42_;
		int i_45_ = i_42_ / i_43_;
		int i_46_ = i_38_;
		int i_47_ = 0;
		int i_48_ = i_42_ < 0 ? i_45_ - 1 : i_45_ + 1;
		i_44_ = i_44_ - (i_45_ < 0 ? -i_45_ : i_45_) * i_43_;
		class235.aFloatArray2382[i] *= aFloatArray2431[i_46_];
		if (i_39_ > i_41_)
			i_39_ = i_41_;
		for (int i_49_ = i + 1; i_49_ < i_39_; i_49_++) {
			i_47_ += i_44_;
			if (i_47_ >= i_43_) {
				i_47_ -= i_43_;
				i_46_ += i_48_;
			} else
				i_46_ += i_45_;
			class235.aFloatArray2382[i_49_] *= aFloatArray2431[i_46_];
		}
	}

	static int method3367(int[] is, int i) {
		int i_50_ = is[i];
		int i_51_ = -1;
		int i_52_ = -2147483648;
		for (int i_53_ = 0; i_53_ < i; i_53_++) {
			int i_54_ = is[i_53_];
			if (i_54_ < i_50_ && i_54_ > i_52_) {
				i_51_ = i_53_;
				i_52_ = i_54_;
			}
		}
		return i_51_;
	}

	void method3368(int i, int i_55_, int i_56_) {
		if (i < i_55_) {
			int i_57_ = i;
			int i_58_ = anIntArrayArray2434[i_56_][i_57_];
			int i_59_ = anIntArrayArray2439[i_56_][i_57_];
			boolean bool = aBoolArrayArray2435[i_56_][i_57_];
			for (int i_60_ = i + 1; i_60_ <= i_55_; i_60_++) {
				int i_61_ = anIntArrayArray2434[i_56_][i_60_];
				if (i_61_ < i_58_) {
					anIntArrayArray2434[i_56_][i_57_] = i_61_;
					anIntArrayArray2439[i_56_][i_57_] = anIntArrayArray2439[i_56_][i_60_];
					aBoolArrayArray2435[i_56_][i_57_] = aBoolArrayArray2435[i_56_][i_60_];
					i_57_++;
					anIntArrayArray2434[i_56_][i_60_] = anIntArrayArray2434[i_56_][i_57_];
					anIntArrayArray2439[i_56_][i_60_] = anIntArrayArray2439[i_56_][i_57_];
					aBoolArrayArray2435[i_56_][i_60_] = aBoolArrayArray2435[i_56_][i_57_];
				}
			}
			anIntArrayArray2434[i_56_][i_57_] = i_58_;
			anIntArrayArray2439[i_56_][i_57_] = i_59_;
			aBoolArrayArray2435[i_56_][i_57_] = bool;
			method3368(i, i_57_ - 1, i_56_);
			method3368(i_57_ + 1, i_55_, i_56_);
		}
	}

	boolean method3369(int i) {
		boolean bool = aClass258_2441.method3590() != 0;
		aBoolArray2442[i] = bool;
		if (!bool)
			return false;
		int i_62_ = anIntArray2433.length;
		for (int i_63_ = 0; i_63_ < i_62_; i_63_++)
			anIntArrayArray2434[i][i_63_] = anIntArray2433[i_63_];
		int i_64_ = anIntArray2443[anInt2432 - 1];
		int i_65_ = Class98_Sub1.method8392(i_64_ - 1, (byte) -59);
		anIntArrayArray2439[i][0] = aClass258_2441.method3563(i_65_);
		anIntArrayArray2439[i][1] = aClass258_2441.method3563(i_65_);
		int i_66_ = 2;
		for (int i_67_ = 0; i_67_ < anIntArray2437.length; i_67_++) {
			int i_68_ = anIntArray2437[i_67_];
			int i_69_ = anIntArray2444[i_68_];
			int i_70_ = anIntArray2438[i_68_];
			int i_71_ = (1 << i_70_) - 1;
			int i_72_ = 0;
			if (i_70_ > 0)
				i_72_ = aClass258_2441.aClass253Array2785[anIntArray2436[i_68_]].method3528(aClass258_2441);
			for (int i_73_ = 0; i_73_ < i_69_; i_73_++) {
				int i_74_ = anIntArrayArray2440[i_68_][i_72_ & i_71_];
				i_72_ >>>= i_70_;
				anIntArrayArray2439[i][i_66_] = i_74_ >= 0 ? aClass258_2441.aClass253Array2785[i_74_].method3528(aClass258_2441) : 0;
				i_66_++;
			}
		}
		return true;
	}

	void method3370(Class235 class235, int i, int i_75_) {
		if (aBoolArray2442[i_75_]) {
			int i_76_ = anIntArray2433.length;
			method3368(0, i_76_ - 1, i_75_);
			int i_77_ = 0;
			int i_78_ = anIntArrayArray2439[i_75_][0] * anInt2432;
			for (int i_79_ = 1; i_79_ < i_76_; i_79_++) {
				if (anIntArrayArray2439[i_75_][i_79_] >= 0) {
					int i_80_ = anIntArrayArray2434[i_75_][i_79_];
					int i_81_ = anIntArrayArray2439[i_75_][i_79_] * anInt2432;
					method3366(i_77_, i_78_, i_80_, i_81_, class235, i);
					if (i_80_ < i) {
						/* empty */
					}
					i_77_ = i_80_;
					i_78_ = i_81_;
				}
			}
			float f = aFloatArray2431[i_78_];
			for (int i_82_ = i_77_; i_82_ < i; i_82_++)
				class235.aFloatArray2382[i_82_] *= f;
		}
	}

	static {
		aFloatArray2431 = (new float[] { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F, 2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F, 3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F, 4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F, 7.041359E-7F,
				7.4989464E-7F, 7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F, 1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F, 1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F, 2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F, 3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F, 4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F,
				5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F, 7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F, 1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F, 1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F, 2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F,
				4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F, 6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F, 1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F, 1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F, 2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F, 2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F,
				3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F, 4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F, 7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F, 9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F, 0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F, 0.0026895993F,
				0.0028643848F, 0.0030505287F, 0.003248769F, 0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F, 0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F, 0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F, 0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F, 0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F, 0.020169148F, 0.021479854F,
				0.022875736F, 0.02436233F, 0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F, 0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F, 0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F, 0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F, 0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F, 0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F,
				0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F, 0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F, 0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F, 0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F, 0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F });
	}

	boolean method3371(int i) {
		boolean bool = aClass258_2441.method3590() != 0;
		aBoolArray2442[i] = bool;
		if (!bool)
			return false;
		int i_83_ = anIntArray2433.length;
		for (int i_84_ = 0; i_84_ < i_83_; i_84_++)
			anIntArrayArray2434[i][i_84_] = anIntArray2433[i_84_];
		int i_85_ = anIntArray2443[anInt2432 - 1];
		int i_86_ = Class98_Sub1.method8392(i_85_ - 1, (byte) -55);
		anIntArrayArray2439[i][0] = aClass258_2441.method3563(i_86_);
		anIntArrayArray2439[i][1] = aClass258_2441.method3563(i_86_);
		int i_87_ = 2;
		for (int i_88_ = 0; i_88_ < anIntArray2437.length; i_88_++) {
			int i_89_ = anIntArray2437[i_88_];
			int i_90_ = anIntArray2444[i_89_];
			int i_91_ = anIntArray2438[i_89_];
			int i_92_ = (1 << i_91_) - 1;
			int i_93_ = 0;
			if (i_91_ > 0)
				i_93_ = aClass258_2441.aClass253Array2785[anIntArray2436[i_89_]].method3528(aClass258_2441);
			for (int i_94_ = 0; i_94_ < i_90_; i_94_++) {
				int i_95_ = anIntArrayArray2440[i_89_][i_93_ & i_92_];
				i_93_ >>>= i_91_;
				anIntArrayArray2439[i][i_87_] = i_95_ >= 0 ? aClass258_2441.aClass253Array2785[i_95_].method3528(aClass258_2441) : 0;
				i_87_++;
			}
		}
		return true;
	}

	void method3372(int i) {
		if (aBoolArray2442[i]) {
			int i_96_ = anIntArray2433.length;
			int i_97_ = anIntArray2443[anInt2432 - 1];
			boolean[] bools = aBoolArrayArray2435[i];
			aBoolArrayArray2435[i][1] = true;
			bools[0] = true;
			for (int i_98_ = 2; i_98_ < i_96_; i_98_++) {
				int i_99_ = method3367(anIntArray2433, i_98_);
				int i_100_ = method3364(anIntArray2433, i_98_);
				int i_101_ = method3365(anIntArray2433[i_99_], anIntArrayArray2439[i][i_99_], anIntArray2433[i_100_], anIntArrayArray2439[i][i_100_], anIntArray2433[i_98_]);
				int i_102_ = anIntArrayArray2439[i][i_98_];
				int i_103_ = i_97_ - i_101_;
				int i_104_ = i_101_;
				int i_105_ = (i_103_ < i_104_ ? i_103_ : i_104_) << 1;
				if (i_102_ != 0) {
					boolean[] bools_106_ = aBoolArrayArray2435[i];
					int i_107_ = i_99_;
					aBoolArrayArray2435[i][i_100_] = true;
					bools_106_[i_107_] = true;
					aBoolArrayArray2435[i][i_98_] = true;
					if (i_102_ >= i_105_)
						anIntArrayArray2439[i][i_98_] = (i_103_ > i_104_ ? i_102_ - i_104_ + i_101_ : i_101_ - i_102_ + i_103_ - 1);
					else
						anIntArrayArray2439[i][i_98_] = ((i_102_ & 0x1) != 0 ? i_101_ - (i_102_ + 1 >> 1) : i_101_ + (i_102_ >> 1));
				} else {
					aBoolArrayArray2435[i][i_98_] = false;
					anIntArrayArray2439[i][i_98_] = i_101_;
				}
			}
			for (int i_108_ = 0; i_108_ < i_96_; i_108_++) {
				if (!aBoolArrayArray2435[i][i_108_])
					anIntArrayArray2439[i][i_108_] = -1;
			}
		}
	}

	boolean method3373(int i) {
		boolean bool = aClass258_2441.method3590() != 0;
		aBoolArray2442[i] = bool;
		if (!bool)
			return false;
		int i_109_ = anIntArray2433.length;
		for (int i_110_ = 0; i_110_ < i_109_; i_110_++)
			anIntArrayArray2434[i][i_110_] = anIntArray2433[i_110_];
		int i_111_ = anIntArray2443[anInt2432 - 1];
		int i_112_ = Class98_Sub1.method8392(i_111_ - 1, (byte) 28);
		anIntArrayArray2439[i][0] = aClass258_2441.method3563(i_112_);
		anIntArrayArray2439[i][1] = aClass258_2441.method3563(i_112_);
		int i_113_ = 2;
		for (int i_114_ = 0; i_114_ < anIntArray2437.length; i_114_++) {
			int i_115_ = anIntArray2437[i_114_];
			int i_116_ = anIntArray2444[i_115_];
			int i_117_ = anIntArray2438[i_115_];
			int i_118_ = (1 << i_117_) - 1;
			int i_119_ = 0;
			if (i_117_ > 0)
				i_119_ = aClass258_2441.aClass253Array2785[anIntArray2436[i_115_]].method3528(aClass258_2441);
			for (int i_120_ = 0; i_120_ < i_116_; i_120_++) {
				int i_121_ = anIntArrayArray2440[i_115_][i_119_ & i_118_];
				i_119_ >>>= i_117_;
				anIntArrayArray2439[i][i_113_] = i_121_ >= 0 ? aClass258_2441.aClass253Array2785[i_121_].method3528(aClass258_2441) : 0;
				i_113_++;
			}
		}
		return true;
	}

	void method3374(int i, int i_122_, int i_123_) {
		if (i < i_122_) {
			int i_124_ = i;
			int i_125_ = anIntArrayArray2434[i_123_][i_124_];
			int i_126_ = anIntArrayArray2439[i_123_][i_124_];
			boolean bool = aBoolArrayArray2435[i_123_][i_124_];
			for (int i_127_ = i + 1; i_127_ <= i_122_; i_127_++) {
				int i_128_ = anIntArrayArray2434[i_123_][i_127_];
				if (i_128_ < i_125_) {
					anIntArrayArray2434[i_123_][i_124_] = i_128_;
					anIntArrayArray2439[i_123_][i_124_] = anIntArrayArray2439[i_123_][i_127_];
					aBoolArrayArray2435[i_123_][i_124_] = aBoolArrayArray2435[i_123_][i_127_];
					i_124_++;
					anIntArrayArray2434[i_123_][i_127_] = anIntArrayArray2434[i_123_][i_124_];
					anIntArrayArray2439[i_123_][i_127_] = anIntArrayArray2439[i_123_][i_124_];
					aBoolArrayArray2435[i_123_][i_127_] = aBoolArrayArray2435[i_123_][i_124_];
				}
			}
			anIntArrayArray2434[i_123_][i_124_] = i_125_;
			anIntArrayArray2439[i_123_][i_124_] = i_126_;
			aBoolArrayArray2435[i_123_][i_124_] = bool;
			method3368(i, i_124_ - 1, i_123_);
			method3368(i_124_ + 1, i_122_, i_123_);
		}
	}

	Class239() {
		/* empty */
	}

	boolean method3375(int i) {
		boolean bool = aClass258_2441.method3590() != 0;
		aBoolArray2442[i] = bool;
		if (!bool)
			return false;
		int i_129_ = anIntArray2433.length;
		for (int i_130_ = 0; i_130_ < i_129_; i_130_++)
			anIntArrayArray2434[i][i_130_] = anIntArray2433[i_130_];
		int i_131_ = anIntArray2443[anInt2432 - 1];
		int i_132_ = Class98_Sub1.method8392(i_131_ - 1, (byte) -101);
		anIntArrayArray2439[i][0] = aClass258_2441.method3563(i_132_);
		anIntArrayArray2439[i][1] = aClass258_2441.method3563(i_132_);
		int i_133_ = 2;
		for (int i_134_ = 0; i_134_ < anIntArray2437.length; i_134_++) {
			int i_135_ = anIntArray2437[i_134_];
			int i_136_ = anIntArray2444[i_135_];
			int i_137_ = anIntArray2438[i_135_];
			int i_138_ = (1 << i_137_) - 1;
			int i_139_ = 0;
			if (i_137_ > 0)
				i_139_ = aClass258_2441.aClass253Array2785[anIntArray2436[i_135_]].method3528(aClass258_2441);
			for (int i_140_ = 0; i_140_ < i_136_; i_140_++) {
				int i_141_ = anIntArrayArray2440[i_135_][i_139_ & i_138_];
				i_139_ >>>= i_137_;
				anIntArrayArray2439[i][i_133_] = i_141_ >= 0 ? aClass258_2441.aClass253Array2785[i_141_].method3528(aClass258_2441) : 0;
				i_133_++;
			}
		}
		return true;
	}

	boolean method3376(int i) {
		boolean bool = aClass258_2441.method3590() != 0;
		aBoolArray2442[i] = bool;
		if (!bool)
			return false;
		int i_142_ = anIntArray2433.length;
		for (int i_143_ = 0; i_143_ < i_142_; i_143_++)
			anIntArrayArray2434[i][i_143_] = anIntArray2433[i_143_];
		int i_144_ = anIntArray2443[anInt2432 - 1];
		int i_145_ = Class98_Sub1.method8392(i_144_ - 1, (byte) -5);
		anIntArrayArray2439[i][0] = aClass258_2441.method3563(i_145_);
		anIntArrayArray2439[i][1] = aClass258_2441.method3563(i_145_);
		int i_146_ = 2;
		for (int i_147_ = 0; i_147_ < anIntArray2437.length; i_147_++) {
			int i_148_ = anIntArray2437[i_147_];
			int i_149_ = anIntArray2444[i_148_];
			int i_150_ = anIntArray2438[i_148_];
			int i_151_ = (1 << i_150_) - 1;
			int i_152_ = 0;
			if (i_150_ > 0)
				i_152_ = aClass258_2441.aClass253Array2785[anIntArray2436[i_148_]].method3528(aClass258_2441);
			for (int i_153_ = 0; i_153_ < i_149_; i_153_++) {
				int i_154_ = anIntArrayArray2440[i_148_][i_152_ & i_151_];
				i_152_ >>>= i_150_;
				anIntArrayArray2439[i][i_146_] = i_154_ >= 0 ? aClass258_2441.aClass253Array2785[i_154_].method3528(aClass258_2441) : 0;
				i_146_++;
			}
		}
		return true;
	}

	void method3377(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	void method3378(int i) {
		if (aBoolArray2442[i]) {
			int i_155_ = anIntArray2433.length;
			int i_156_ = anIntArray2443[anInt2432 - 1];
			boolean[] bools = aBoolArrayArray2435[i];
			aBoolArrayArray2435[i][1] = true;
			bools[0] = true;
			for (int i_157_ = 2; i_157_ < i_155_; i_157_++) {
				int i_158_ = method3367(anIntArray2433, i_157_);
				int i_159_ = method3364(anIntArray2433, i_157_);
				int i_160_ = method3365(anIntArray2433[i_158_], anIntArrayArray2439[i][i_158_], anIntArray2433[i_159_], anIntArrayArray2439[i][i_159_], anIntArray2433[i_157_]);
				int i_161_ = anIntArrayArray2439[i][i_157_];
				int i_162_ = i_156_ - i_160_;
				int i_163_ = i_160_;
				int i_164_ = (i_162_ < i_163_ ? i_162_ : i_163_) << 1;
				if (i_161_ != 0) {
					boolean[] bools_165_ = aBoolArrayArray2435[i];
					int i_166_ = i_158_;
					aBoolArrayArray2435[i][i_159_] = true;
					bools_165_[i_166_] = true;
					aBoolArrayArray2435[i][i_157_] = true;
					if (i_161_ >= i_164_)
						anIntArrayArray2439[i][i_157_] = (i_162_ > i_163_ ? i_161_ - i_163_ + i_160_ : i_160_ - i_161_ + i_162_ - 1);
					else
						anIntArrayArray2439[i][i_157_] = ((i_161_ & 0x1) != 0 ? i_160_ - (i_161_ + 1 >> 1) : i_160_ + (i_161_ >> 1));
				} else {
					aBoolArrayArray2435[i][i_157_] = false;
					anIntArrayArray2439[i][i_157_] = i_160_;
				}
			}
			for (int i_167_ = 0; i_167_ < i_155_; i_167_++) {
				if (!aBoolArrayArray2435[i][i_167_])
					anIntArrayArray2439[i][i_167_] = -1;
			}
		}
	}

	void method3379(int i) {
		if (aBoolArray2442[i]) {
			int i_168_ = anIntArray2433.length;
			int i_169_ = anIntArray2443[anInt2432 - 1];
			boolean[] bools = aBoolArrayArray2435[i];
			aBoolArrayArray2435[i][1] = true;
			bools[0] = true;
			for (int i_170_ = 2; i_170_ < i_168_; i_170_++) {
				int i_171_ = method3367(anIntArray2433, i_170_);
				int i_172_ = method3364(anIntArray2433, i_170_);
				int i_173_ = method3365(anIntArray2433[i_171_], anIntArrayArray2439[i][i_171_], anIntArray2433[i_172_], anIntArrayArray2439[i][i_172_], anIntArray2433[i_170_]);
				int i_174_ = anIntArrayArray2439[i][i_170_];
				int i_175_ = i_169_ - i_173_;
				int i_176_ = i_173_;
				int i_177_ = (i_175_ < i_176_ ? i_175_ : i_176_) << 1;
				if (i_174_ != 0) {
					boolean[] bools_178_ = aBoolArrayArray2435[i];
					int i_179_ = i_171_;
					aBoolArrayArray2435[i][i_172_] = true;
					bools_178_[i_179_] = true;
					aBoolArrayArray2435[i][i_170_] = true;
					if (i_174_ >= i_177_)
						anIntArrayArray2439[i][i_170_] = (i_175_ > i_176_ ? i_174_ - i_176_ + i_173_ : i_173_ - i_174_ + i_175_ - 1);
					else
						anIntArrayArray2439[i][i_170_] = ((i_174_ & 0x1) != 0 ? i_173_ - (i_174_ + 1 >> 1) : i_173_ + (i_174_ >> 1));
				} else {
					aBoolArrayArray2435[i][i_170_] = false;
					anIntArrayArray2439[i][i_170_] = i_173_;
				}
			}
			for (int i_180_ = 0; i_180_ < i_168_; i_180_++) {
				if (!aBoolArrayArray2435[i][i_180_])
					anIntArrayArray2439[i][i_180_] = -1;
			}
		}
	}
}
