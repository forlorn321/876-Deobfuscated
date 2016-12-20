/* Class161 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class161 {
	public int anInt1750;
	public int anInt1751;
	public int anInt1752;
	public int anInt1753;
	public int[][] anIntArrayArray1754;

	public abstract Class527_Sub8_Sub8 method2586(int i, int i_0_, Class527_Sub8_Sub8 class527_sub8_sub8);

	public abstract void method2587(int i, int i_1_, int i_2_);

	public abstract void method2588();

	public abstract void method2589(int i, int i_3_, int[] is, int[] is_4_, int[] is_5_, int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_, int[] is_13_, Class178 class178, boolean bool);

	public abstract void method2590(int i, int i_14_, int[] is, int[] is_15_, int[] is_16_, int[] is_17_, int[] is_18_, int[] is_19_, int[] is_20_, int[] is_21_, int[] is_22_, int[] is_23_, int[] is_24_, Class178 class178, boolean bool);

	public abstract void method2591(int i, int i_25_, int i_26_, boolean[][] bools, boolean bool, int i_27_);

	public abstract void method2592(int i, int i_28_, int[] is, int[] is_29_, int[] is_30_, int[] is_31_, int[] is_32_, int[] is_33_, int[] is_34_, int[] is_35_, Class178 class178, boolean bool);

	public final int method2593(int i, int i_36_, int i_37_) {
		int i_38_ = i >> 1252000143 * anInt1753;
		int i_39_ = i_36_ >> anInt1753 * 1252000143;
		if (i_38_ < 0 || i_39_ < 0 || i_38_ > 1210322533 * anInt1750 - 1 || i_39_ > anInt1751 * -533476177 - 1)
			return 0;
		int i_40_ = i & anInt1752 * 1048375491 - 1;
		int i_41_ = i_36_ & anInt1752 * 1048375491 - 1;
		int i_42_ = ((anIntArrayArray1754[1 + i_38_][i_39_] * i_40_ + anIntArrayArray1754[i_38_][i_39_] * (1048375491 * anInt1752 - i_40_)) >> anInt1753 * 1252000143);
		int i_43_ = ((((1048375491 * anInt1752 - i_40_) * anIntArrayArray1754[i_38_][1 + i_39_]) + anIntArrayArray1754[1 + i_38_][1 + i_39_] * i_40_) >> anInt1753 * 1252000143);
		return (i_42_ * (1048375491 * anInt1752 - i_41_) + i_43_ * i_41_ >> anInt1753 * 1252000143);
	}

	public abstract void method2594(int i, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, boolean[][] bools);

	public final int method2595(int i, int i_50_, byte i_51_) {
		return anIntArrayArray1754[i][i_50_];
	}

	public final int method2596(int i, int i_52_, int i_53_) {
		return (anIntArrayArray1754[Math.min(anInt1750 * 1210322533 - 1, Math.max(0, i))][Math.min(anInt1751 * -533476177 - 1, Math.max(0, i_52_))]);
	}

	public abstract Class527_Sub8_Sub8 method2597(int i, int i_54_, Class527_Sub8_Sub8 class527_sub8_sub8);

	public abstract boolean method2598(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_55_, int i_56_, int i_57_, boolean bool);

	public final int method2599(int i, int i_58_) {
		int i_59_ = i >> 1252000143 * anInt1753;
		int i_60_ = i_58_ >> anInt1753 * 1252000143;
		if (i_59_ < 0 || i_60_ < 0 || i_59_ > 1210322533 * anInt1750 - 1 || i_60_ > anInt1751 * -533476177 - 1)
			return 0;
		int i_61_ = i & anInt1752 * 1048375491 - 1;
		int i_62_ = i_58_ & anInt1752 * 1048375491 - 1;
		int i_63_ = ((anIntArrayArray1754[1 + i_59_][i_60_] * i_61_ + anIntArrayArray1754[i_59_][i_60_] * (1048375491 * anInt1752 - i_61_)) >> anInt1753 * 1252000143);
		int i_64_ = ((((1048375491 * anInt1752 - i_61_) * anIntArrayArray1754[i_59_][1 + i_60_]) + anIntArrayArray1754[1 + i_59_][1 + i_60_] * i_61_) >> anInt1753 * 1252000143);
		return (i_63_ * (1048375491 * anInt1752 - i_62_) + i_64_ * i_62_ >> anInt1753 * 1252000143);
	}

	public abstract void method2600(int i, int i_65_, int i_66_, boolean[][] bools, boolean bool, int i_67_);

	public abstract void method2601(Class527_Sub16 class527_sub16, int[] is);

	public abstract void method2602(int i, int i_68_, int i_69_);

	public abstract void method2603(int i, int i_70_, int i_71_);

	public abstract void method2604(int i, int i_72_, int[] is, int[] is_73_, int[] is_74_, int[] is_75_, int[] is_76_, int[] is_77_, int[] is_78_, int[] is_79_, Class178 class178, boolean bool);

	public final int method2605(int i, int i_80_) {
		return anIntArrayArray1754[i][i_80_];
	}

	public abstract void method2606(int i, int i_81_, int[] is, int[] is_82_, int[] is_83_, int[] is_84_, int[] is_85_, int[] is_86_, int[] is_87_, int[] is_88_, Class178 class178, boolean bool);

	public abstract void method2607(int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, boolean[][] bools);

	public abstract void method2608(int i, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, boolean[][] bools);

	public abstract void method2609(int i, int i_101_, int i_102_, int i_103_, int i_104_, int i_105_, int i_106_, boolean[][] bools);

	public abstract Class527_Sub8_Sub8 method2610(int i, int i_107_, Class527_Sub8_Sub8 class527_sub8_sub8);

	Class161(int i, int i_108_, int i_109_, int[][] is) {
		anInt1750 = i * -1790119059;
		anInt1751 = -1987376561 * i_108_;
		int i_110_ = 0;
		for (/**/; i_109_ > 1; i_109_ >>= 1)
			i_110_++;
		anInt1752 = (1 << i_110_) * 180699115;
		anInt1753 = -1759773329 * i_110_;
		anIntArrayArray1754 = is;
	}

	public abstract void method2611(int i, int i_111_, int[] is, int[] is_112_, int[] is_113_, int[] is_114_, int[] is_115_, int[] is_116_, int[] is_117_, int[] is_118_, Class178 class178, boolean bool);

	public abstract void method2612();

	public abstract void method2613(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_119_, int i_120_, int i_121_, boolean bool);

	public abstract boolean method2614(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_122_, int i_123_, int i_124_, boolean bool);

	public abstract void method2615(Class527_Sub16 class527_sub16, int[] is);

	public abstract void method2616(Class527_Sub16 class527_sub16, int[] is);

	public final int method2617(int i, int i_125_) {
		int i_126_ = i >> 1252000143 * anInt1753;
		int i_127_ = i_125_ >> 1252000143 * anInt1753;
		i_126_ = Math.min(1210322533 * anInt1750 - 1, Math.max(0, i_126_));
		i_127_ = Math.min(-533476177 * anInt1751 - 1, Math.max(0, i_127_));
		int i_128_ = Math.min(anInt1750 * 1210322533 - 1, 1 + i_126_);
		int i_129_ = Math.min(anInt1751 * -533476177 - 1, i_127_ + 1);
		int i_130_ = i & anInt1752 * 1048375491 - 1;
		int i_131_ = i_125_ & 1048375491 * anInt1752 - 1;
		int i_132_ = ((anIntArrayArray1754[i_128_][i_127_] * i_130_ + anIntArrayArray1754[i_126_][i_127_] * (anInt1752 * 1048375491 - i_130_)) >> 1252000143 * anInt1753);
		int i_133_ = ((anIntArrayArray1754[i_128_][i_129_] * i_130_ + anIntArrayArray1754[i_126_][i_129_] * (1048375491 * anInt1752 - i_130_)) >> 1252000143 * anInt1753);
		return (i_132_ * (1048375491 * anInt1752 - i_131_) + i_131_ * i_133_ >> anInt1753 * 1252000143);
	}

	public abstract void method2618(int i, int i_134_, int[] is, int[] is_135_, int[] is_136_, int[] is_137_, int[] is_138_, int[] is_139_, int[] is_140_, int[] is_141_, int[] is_142_, int[] is_143_, int[] is_144_, Class178 class178, boolean bool);

	public final int method2619(int i, int i_145_, int i_146_) {
		int i_147_ = i >> 1252000143 * anInt1753;
		int i_148_ = i_145_ >> 1252000143 * anInt1753;
		i_147_ = Math.min(1210322533 * anInt1750 - 1, Math.max(0, i_147_));
		i_148_ = Math.min(-533476177 * anInt1751 - 1, Math.max(0, i_148_));
		int i_149_ = Math.min(anInt1750 * 1210322533 - 1, 1 + i_147_);
		int i_150_ = Math.min(anInt1751 * -533476177 - 1, i_148_ + 1);
		int i_151_ = i & anInt1752 * 1048375491 - 1;
		int i_152_ = i_145_ & 1048375491 * anInt1752 - 1;
		int i_153_ = ((anIntArrayArray1754[i_149_][i_148_] * i_151_ + anIntArrayArray1754[i_147_][i_148_] * (anInt1752 * 1048375491 - i_151_)) >> 1252000143 * anInt1753);
		int i_154_ = ((anIntArrayArray1754[i_149_][i_150_] * i_151_ + anIntArrayArray1754[i_147_][i_150_] * (1048375491 * anInt1752 - i_151_)) >> 1252000143 * anInt1753);
		return (i_153_ * (1048375491 * anInt1752 - i_152_) + i_152_ * i_154_ >> anInt1753 * 1252000143);
	}

	public abstract void method2620(int i, int i_155_, int i_156_, boolean[][] bools, boolean bool, int i_157_);

	public abstract void method2621(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_158_, int i_159_, int i_160_, boolean bool);

	public abstract void method2622(int i, int i_161_, int i_162_, boolean[][] bools, boolean bool, int i_163_);

	public abstract void method2623(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_164_, int i_165_, int i_166_, boolean bool);

	public abstract void method2624(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_167_, int i_168_, int i_169_, boolean bool);

	public abstract Class527_Sub8_Sub8 method2625(int i, int i_170_, Class527_Sub8_Sub8 class527_sub8_sub8);

	public final int method2626(int i, int i_171_) {
		int i_172_ = i >> 1252000143 * anInt1753;
		int i_173_ = i_171_ >> anInt1753 * 1252000143;
		if (i_172_ < 0 || i_173_ < 0 || i_172_ > 1210322533 * anInt1750 - 1 || i_173_ > anInt1751 * -533476177 - 1)
			return 0;
		int i_174_ = i & anInt1752 * 1048375491 - 1;
		int i_175_ = i_171_ & anInt1752 * 1048375491 - 1;
		int i_176_ = ((anIntArrayArray1754[1 + i_172_][i_173_] * i_174_ + anIntArrayArray1754[i_172_][i_173_] * (1048375491 * anInt1752 - i_174_)) >> anInt1753 * 1252000143);
		int i_177_ = ((((1048375491 * anInt1752 - i_174_) * anIntArrayArray1754[i_172_][1 + i_173_]) + anIntArrayArray1754[1 + i_172_][1 + i_173_] * i_174_) >> anInt1753 * 1252000143);
		return (i_176_ * (1048375491 * anInt1752 - i_175_) + i_177_ * i_175_ >> anInt1753 * 1252000143);
	}

	public final int method2627(int i, int i_178_) {
		int i_179_ = i >> 1252000143 * anInt1753;
		int i_180_ = i_178_ >> anInt1753 * 1252000143;
		if (i_179_ < 0 || i_180_ < 0 || i_179_ > 1210322533 * anInt1750 - 1 || i_180_ > anInt1751 * -533476177 - 1)
			return 0;
		int i_181_ = i & anInt1752 * 1048375491 - 1;
		int i_182_ = i_178_ & anInt1752 * 1048375491 - 1;
		int i_183_ = ((anIntArrayArray1754[1 + i_179_][i_180_] * i_181_ + anIntArrayArray1754[i_179_][i_180_] * (1048375491 * anInt1752 - i_181_)) >> anInt1753 * 1252000143);
		int i_184_ = ((((1048375491 * anInt1752 - i_181_) * anIntArrayArray1754[i_179_][1 + i_180_]) + anIntArrayArray1754[1 + i_179_][1 + i_180_] * i_181_) >> anInt1753 * 1252000143);
		return (i_183_ * (1048375491 * anInt1752 - i_182_) + i_184_ * i_182_ >> anInt1753 * 1252000143);
	}

	public final int method2628(int i, int i_185_) {
		int i_186_ = i >> 1252000143 * anInt1753;
		int i_187_ = i_185_ >> anInt1753 * 1252000143;
		if (i_186_ < 0 || i_187_ < 0 || i_186_ > 1210322533 * anInt1750 - 1 || i_187_ > anInt1751 * -533476177 - 1)
			return 0;
		int i_188_ = i & anInt1752 * 1048375491 - 1;
		int i_189_ = i_185_ & anInt1752 * 1048375491 - 1;
		int i_190_ = ((anIntArrayArray1754[1 + i_186_][i_187_] * i_188_ + anIntArrayArray1754[i_186_][i_187_] * (1048375491 * anInt1752 - i_188_)) >> anInt1753 * 1252000143);
		int i_191_ = ((((1048375491 * anInt1752 - i_188_) * anIntArrayArray1754[i_186_][1 + i_187_]) + anIntArrayArray1754[1 + i_186_][1 + i_187_] * i_188_) >> anInt1753 * 1252000143);
		return (i_190_ * (1048375491 * anInt1752 - i_189_) + i_191_ * i_189_ >> anInt1753 * 1252000143);
	}

	public abstract void method2629(int i, int i_192_, int i_193_, boolean[][] bools, boolean bool, int i_194_);

	public final int method2630(int i, int i_195_) {
		int i_196_ = i >> 1252000143 * anInt1753;
		int i_197_ = i_195_ >> 1252000143 * anInt1753;
		i_196_ = Math.min(1210322533 * anInt1750 - 1, Math.max(0, i_196_));
		i_197_ = Math.min(-533476177 * anInt1751 - 1, Math.max(0, i_197_));
		int i_198_ = Math.min(anInt1750 * 1210322533 - 1, 1 + i_196_);
		int i_199_ = Math.min(anInt1751 * -533476177 - 1, i_197_ + 1);
		int i_200_ = i & anInt1752 * 1048375491 - 1;
		int i_201_ = i_195_ & 1048375491 * anInt1752 - 1;
		int i_202_ = ((anIntArrayArray1754[i_198_][i_197_] * i_200_ + anIntArrayArray1754[i_196_][i_197_] * (anInt1752 * 1048375491 - i_200_)) >> 1252000143 * anInt1753);
		int i_203_ = ((anIntArrayArray1754[i_198_][i_199_] * i_200_ + anIntArrayArray1754[i_196_][i_199_] * (1048375491 * anInt1752 - i_200_)) >> 1252000143 * anInt1753);
		return (i_202_ * (1048375491 * anInt1752 - i_201_) + i_201_ * i_203_ >> anInt1753 * 1252000143);
	}

	public abstract void method2631(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_204_, int i_205_, int i_206_, boolean bool);

	public final int method2632(int i, int i_207_) {
		int i_208_ = i >> 1252000143 * anInt1753;
		int i_209_ = i_207_ >> 1252000143 * anInt1753;
		i_208_ = Math.min(1210322533 * anInt1750 - 1, Math.max(0, i_208_));
		i_209_ = Math.min(-533476177 * anInt1751 - 1, Math.max(0, i_209_));
		int i_210_ = Math.min(anInt1750 * 1210322533 - 1, 1 + i_208_);
		int i_211_ = Math.min(anInt1751 * -533476177 - 1, i_209_ + 1);
		int i_212_ = i & anInt1752 * 1048375491 - 1;
		int i_213_ = i_207_ & 1048375491 * anInt1752 - 1;
		int i_214_ = ((anIntArrayArray1754[i_210_][i_209_] * i_212_ + anIntArrayArray1754[i_208_][i_209_] * (anInt1752 * 1048375491 - i_212_)) >> 1252000143 * anInt1753);
		int i_215_ = ((anIntArrayArray1754[i_210_][i_211_] * i_212_ + anIntArrayArray1754[i_208_][i_211_] * (1048375491 * anInt1752 - i_212_)) >> 1252000143 * anInt1753);
		return (i_214_ * (1048375491 * anInt1752 - i_213_) + i_213_ * i_215_ >> anInt1753 * 1252000143);
	}

	public abstract void method2633(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_216_, int i_217_, int i_218_, boolean bool);

	public final int method2634(int i, int i_219_) {
		return anIntArrayArray1754[i][i_219_];
	}

	public final int method2635(int i, int i_220_) {
		return (anIntArrayArray1754[Math.min(anInt1750 * 1210322533 - 1, Math.max(0, i))][Math.min(anInt1751 * -533476177 - 1, Math.max(0, i_220_))]);
	}

	public final int method2636(int i, int i_221_) {
		return (anIntArrayArray1754[Math.min(anInt1750 * 1210322533 - 1, Math.max(0, i))][Math.min(anInt1751 * -533476177 - 1, Math.max(0, i_221_))]);
	}

	public final int method2637(int i, int i_222_) {
		return (anIntArrayArray1754[Math.min(anInt1750 * 1210322533 - 1, Math.max(0, i))][Math.min(anInt1751 * -533476177 - 1, Math.max(0, i_222_))]);
	}

	public final int method2638(int i, int i_223_) {
		return (anIntArrayArray1754[Math.min(anInt1750 * 1210322533 - 1, Math.max(0, i))][Math.min(anInt1751 * -533476177 - 1, Math.max(0, i_223_))]);
	}

	static final void method2639(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 1839947435 * Class32.anInt319;
	}

	static final void method2640(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_224_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_225_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		Class9 class9 = ((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_224_, 241809147));
		if (i_225_ >= 1 && i_225_ <= 5 && class9.aStringArray133[i_225_ - 1] != null)
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class9.aStringArray133[i_225_ - 1];
		else
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
	}

	static final void method2641(Class665 class665, int i) {
		class665.aLongArray8547[(class665.anIntArray8545[891367231 * class665.anInt8527])] = (class665.aLongArray8529[(class665.anInt8530 -= 32636613) * -2076258291]);
	}

	public static void method2642(int i, int i_226_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(23, (long) i);
		class527_sub8_sub9.method18186(1431506156);
	}
}
