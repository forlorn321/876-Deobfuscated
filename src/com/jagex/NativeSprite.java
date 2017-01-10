/* Class143 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class NativeSprite implements Interface2 {
	public final void method1717(float f, float f_0_, float f_1_, float f_2_, float f_3_, float f_4_, int i, int i_5_, int i_6_) {
		method1740(f, f_0_, f_1_, f_2_, f_3_, f_4_, i, i_5_, i_6_, 1);
	}

	public abstract void method1718(int i, int i_7_, int i_8_, int i_9_);

	public abstract void method1719(int[] is);

	public abstract int method1720();

	public abstract void method1721(int i, int i_10_, int i_11_, int i_12_, int i_13_);

	public abstract Interface22 method1722();

	public final void method1723(float f, float f_14_, float f_15_, float f_16_, int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_) {
		if (i != 0 && i_17_ != 0) {
			double d = (double) (i_18_ & 0xffff) * 9.587379924285257E-5;
			float f_22_ = (float) Math.sin(d) * (float) i_17_;
			float f_23_ = (float) Math.cos(d) * (float) i_17_;
			float f_24_ = (float) Math.sin(d) * (float) i;
			float f_25_ = (float) Math.cos(d) * (float) i;
			float f_26_ = (-f_15_ * f_25_ + -f_16_ * f_22_) / 4096.0F + f;
			float f_27_ = (--f_15_ * f_24_ + -f_16_ * f_23_) / 4096.0F + f_14_;
			float f_28_ = ((((float) method12() - f_15_) * f_25_ + -f_16_ * f_22_) / 4096.0F + f);
			float f_29_ = ((-((float) method12() - f_15_) * f_24_ + -f_16_ * f_23_) / 4096.0F + f_14_);
			float f_30_ = ((-f_15_ * f_25_ + ((float) method1785() - f_16_) * f_22_) / 4096.0F + f);
			float f_31_ = ((--f_15_ * f_24_ + ((float) method1785() - f_16_) * f_23_) / 4096.0F + f_14_);
			method1717(f_26_, f_27_, f_28_, f_29_, f_30_, f_31_, i_19_, i_20_, i_21_);
		}
	}

	public final void method1724(int i, int i_32_, int i_33_, int i_34_) {
		method1732(i, i_32_, i_33_, i_34_, 1, -1, 1, 1);
	}

	abstract void method1725(float f, float f_35_, float f_36_, float f_37_, float f_38_, float f_39_, int i, Class161 class161, int i_40_, int i_41_);

	public abstract void method1726(int i, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_);

	public abstract void method1727(int i, int i_47_, int i_48_);

	public final void method1728(int i, int i_49_) {
		method1729(i, i_49_, 1, -1, 1);
	}

	public abstract void method1729(int i, int i_50_, int i_51_, int i_52_, int i_53_);

	public abstract void method1730(int i, int i_54_, Class161 class161, int i_55_, int i_56_);

	public abstract int method11();

	public final void method1731(int i, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_) {
		method1732(i, i_57_, i_58_, i_59_, i_60_, i_61_, i_62_, 1);
	}

	abstract void method1732(int i, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_);

	public final void method1733(int i, int i_70_, int i_71_, int i_72_) {
		method1734(i, i_70_, i_71_, i_72_, 1, -1, 1);
	}

	public abstract void method1734(int i, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_);

	public final void method1735(float f, float f_79_, int i, int i_80_) {
		method1744(f, f_79_, (float) method12() / 2.0F, (float) method1785() / 2.0F, i, i_80_, 1, -1, 1);
	}

	public final void method1736(float f, float f_81_, int i, int i_82_, int i_83_, int i_84_, int i_85_) {
		method1744(f, f_81_, (float) method12() / 2.0F, (float) method1785() / 2.0F, i, i_82_, i_83_, i_84_, i_85_);
	}

	public abstract void method1737(int i, int i_86_, Class161 class161, int i_87_, int i_88_);

	public final void method1738(float f, float f_89_, int i, int i_90_, Class161 class161, int i_91_, int i_92_) {
		method1739(f, f_89_, (float) method12() / 2.0F, (float) method1785() / 2.0F, i, i_90_, class161, i_91_, i_92_);
	}

	public final void method1739(float f, float f_93_, float f_94_, float f_95_, int i, int i_96_, Class161 class161, int i_97_, int i_98_) {
		if (i != 0) {
			double d = (double) (i_96_ & 0xffff) * 9.587379924285257E-5;
			float f_99_ = (float) Math.sin(d) * (float) i;
			float f_100_ = (float) Math.cos(d) * (float) i;
			float f_101_ = (-f_94_ * f_100_ + -f_95_ * f_99_) / 4096.0F + f;
			float f_102_ = (--f_94_ * f_99_ + -f_95_ * f_100_) / 4096.0F + f_93_;
			float f_103_ = ((((float) method12() - f_94_) * f_100_ + -f_95_ * f_99_) / 4096.0F + f);
			float f_104_ = ((-((float) method12() - f_94_) * f_99_ + -f_95_ * f_100_) / 4096.0F + f_93_);
			float f_105_ = (((-f_94_ * f_100_ + ((float) method1785() - f_95_) * f_99_) / 4096.0F) + f);
			float f_106_ = (((--f_94_ * f_99_ + ((float) method1785() - f_95_) * f_100_) / 4096.0F) + f_93_);
			method1741(f_101_, f_102_, f_103_, f_104_, f_105_, f_106_, class161, i_97_, i_98_);
		}
	}

	abstract void method1740(float f, float f_107_, float f_108_, float f_109_, float f_110_, float f_111_, int i, int i_112_, int i_113_, int i_114_);

	final void method1741(float f, float f_115_, float f_116_, float f_117_, float f_118_, float f_119_, Class161 class161, int i, int i_120_) {
		method1725(f, f_115_, f_116_, f_117_, f_118_, f_119_, 1, class161, i, i_120_);
	}

	public abstract void method1742(int i, int i_121_, int i_122_);

	public abstract void method1743(int i, int i_123_, int i_124_, int i_125_, int[] is, int i_126_, int i_127_);

	public final void method1744(float f, float f_128_, float f_129_, float f_130_, int i, int i_131_, int i_132_, int i_133_, int i_134_) {
		if (i != 0) {
			double d = (double) (i_131_ & 0xffff) * 9.587379924285257E-5;
			float f_135_ = (float) Math.sin(d) * (float) i;
			float f_136_ = (float) Math.cos(d) * (float) i;
			float f_137_ = (-f_129_ * f_136_ + -f_130_ * f_135_) / 4096.0F + f;
			float f_138_ = (--f_129_ * f_135_ + -f_130_ * f_136_) / 4096.0F + f_128_;
			float f_139_ = ((((float) method12() - f_129_) * f_136_ + -f_130_ * f_135_) / 4096.0F + f);
			float f_140_ = ((-((float) method12() - f_129_) * f_135_ + -f_130_ * f_136_) / 4096.0F + f_128_);
			float f_141_ = ((-f_129_ * f_136_ + ((float) method1785() - f_130_) * f_135_) / 4096.0F + f);
			float f_142_ = ((--f_129_ * f_135_ + ((float) method1785() - f_130_) * f_136_) / 4096.0F + f_128_);
			method1717(f_137_, f_138_, f_139_, f_140_, f_141_, f_142_, i_132_, i_133_, i_134_);
		}
	}

	public abstract void method1745(int i, int i_143_, int i_144_, int i_145_, int[] is, int i_146_, int i_147_);

	public abstract void method1746(int i, int i_148_, int i_149_, int i_150_, int[] is, int[] is_151_, int i_152_, int i_153_);

	public abstract void method1747(int i, int i_154_, int i_155_, int i_156_, int[] is, int[] is_157_, int i_158_, int i_159_);

	public abstract void method1748(int i, int i_160_, int i_161_, int i_162_, int i_163_, int i_164_);

	abstract void method1749(int i, int i_165_, int i_166_, int i_167_, int i_168_, int i_169_, int i_170_, int i_171_);

	public abstract void method1750(int i, int i_172_, int i_173_);

	public abstract void method1751(int i, int i_174_, int i_175_);

	public abstract int method1752();

	public abstract int method1753();

	public abstract void method1754(int i, int i_176_, Class161 class161, int i_177_, int i_178_);

	public abstract void method1755(int i, int i_179_, int i_180_, int i_181_, int i_182_);

	public abstract void method1756(int i, int i_183_, int i_184_, int i_185_, int i_186_);

	public abstract void method1757(int i, int i_187_, int i_188_, int i_189_, int[] is, int i_190_, int i_191_);

	abstract void method1758(int i, int i_192_, int i_193_, int i_194_, int i_195_, int i_196_, int i_197_, int i_198_);

	public abstract void method1759(int i, int i_199_, int i_200_, int i_201_, int i_202_, int i_203_, int i_204_);

	public abstract void method1760(int i, int i_205_, Class161 class161, int i_206_, int i_207_);

	public abstract void method1761(int i, int i_208_, int i_209_, int i_210_, int[] is, int[] is_211_, int i_212_, int i_213_);

	public abstract void method1762(int i, int i_214_, Class161 class161, int i_215_, int i_216_);

	public abstract void method1763(int i, int i_217_, int i_218_, int i_219_, int i_220_);

	public abstract void method1764(int i, int i_221_, Class161 class161, int i_222_, int i_223_);

	public abstract void method1765(int i, int i_224_, int i_225_, int i_226_);

	public abstract void method1766(int[] is);

	public abstract int method1767();

	public abstract void method1768(int[] is);

	public abstract int method1769();

	public abstract int method1770();

	public final void method1771(float f, float f_227_, float f_228_, float f_229_, int i, int i_230_) {
		method1744(f, f_227_, f_228_, f_229_, i, i_230_, 1, -1, 1);
	}

	public abstract void method1772(int i, int i_231_, int i_232_, int i_233_, int i_234_, int i_235_, int i_236_);

	public abstract void method1773(int i, int i_237_, int i_238_, int i_239_, int i_240_, int i_241_, int i_242_);

	public abstract void method1774(int i, int i_243_, int i_244_, int i_245_, int i_246_, int i_247_, int i_248_);

	abstract void method1775(float f, float f_249_, float f_250_, float f_251_, float f_252_, float f_253_, int i, int i_254_, int i_255_, int i_256_);

	abstract void method1776(float f, float f_257_, float f_258_, float f_259_, float f_260_, float f_261_, int i, int i_262_, int i_263_, int i_264_);

	abstract void method1777(float f, float f_265_, float f_266_, float f_267_, float f_268_, float f_269_, int i, Class161 class161, int i_270_, int i_271_);

	abstract void method1778(float f, float f_272_, float f_273_, float f_274_, float f_275_, float f_276_, int i, Class161 class161, int i_277_, int i_278_);

	public abstract Interface22 method1779();

	public final void method1780(int i, int i_279_) {
		method1729(i, i_279_, 1, -1, 1);
	}

	public abstract void method1781(int i, int i_280_, int i_281_, int i_282_);

	NativeSprite() {
		/* empty */
	}

	public abstract Interface22 method1782();

	public abstract void method1783(int i, int i_283_, int i_284_, int i_285_, int[] is, int i_286_, int i_287_);

	public abstract Interface22 method1784();

	public abstract int method1785();

	public final void method1786(int i, int i_288_) {
		method1729(i, i_288_, 1, -1, 1);
	}

	abstract void method1787(float f, float f_289_, float f_290_, float f_291_, float f_292_, float f_293_, int i, int i_294_, int i_295_, int i_296_);

	public abstract int method12();

	public abstract void method1788(int i, int i_297_, Class161 class161, int i_298_, int i_299_);
}
