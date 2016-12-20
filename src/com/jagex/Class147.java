/* Class147 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class147 implements Interface4 {
	public final void method2404(int i, int i_0_, int i_1_, int i_2_) {
		method2422(i, i_0_, i_1_, i_2_, 1, -1, 1);
	}

	public abstract void method2405(int i, int i_3_, int i_4_, int i_5_);

	public final void method2406(float f, float f_6_, int i, int i_7_) {
		method2428(f, f_6_, (float) method42() / 2.0F, (float) method2410() / 2.0F, i, i_7_, 1, -1, 1);
	}

	public abstract int method2407();

	abstract void method2408(float f, float f_8_, float f_9_, float f_10_, float f_11_, float f_12_, int i, int i_13_, int i_14_, int i_15_);

	public abstract void method2409(int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_);

	public abstract int method2410();

	public final void method2411(int i, int i_22_) {
		method2416(i, i_22_, 1, -1, 1);
	}

	public abstract int method42();

	public abstract void method2412(int i, int i_23_, int i_24_, int i_25_, int[] is, int[] is_26_, int i_27_, int i_28_);

	public final void method2413(float f, float f_29_, float f_30_, float f_31_, int i, int i_32_) {
		method2428(f, f_29_, f_30_, f_31_, i, i_32_, 1, -1, 1);
	}

	public abstract int method2414();

	public final void method2415(int i, int i_33_) {
		method2416(i, i_33_, 1, -1, 1);
	}

	public abstract void method2416(int i, int i_34_, int i_35_, int i_36_, int i_37_);

	public abstract void method2417(int i, int i_38_, int i_39_, int i_40_);

	public final void method2418(int i, int i_41_, int i_42_, int i_43_) {
		method2420(i, i_41_, i_42_, i_43_, 1, -1, 1, 1);
	}

	public final void method2419(int i, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_) {
		method2420(i, i_44_, i_45_, i_46_, i_47_, i_48_, i_49_, 1);
	}

	abstract void method2420(int i, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_);

	public final void method2421(int i, int i_57_, int i_58_, int i_59_) {
		method2422(i, i_57_, i_58_, i_59_, 1, -1, 1);
	}

	public abstract void method2422(int i, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_);

	public final void method2423(float f, float f_66_, float f_67_, float f_68_, int i, int i_69_) {
		method2428(f, f_66_, f_67_, f_68_, i, i_69_, 1, -1, 1);
	}

	public abstract int method2424();

	Class147() {
		/* empty */
	}

	public final void method2425(float f, float f_70_, float f_71_, float f_72_, int i, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_) {
		if (i != 0 && i_73_ != 0) {
			double d = (double) (i_74_ & 0xffff) * 9.587379924285257E-5;
			float f_78_ = (float) Math.sin(d) * (float) i_73_;
			float f_79_ = (float) Math.cos(d) * (float) i_73_;
			float f_80_ = (float) Math.sin(d) * (float) i;
			float f_81_ = (float) Math.cos(d) * (float) i;
			float f_82_ = (-f_71_ * f_81_ + -f_72_ * f_78_) / 4096.0F + f;
			float f_83_ = (--f_71_ * f_80_ + -f_72_ * f_79_) / 4096.0F + f_70_;
			float f_84_ = ((((float) method42() - f_71_) * f_81_ + -f_72_ * f_78_) / 4096.0F + f);
			float f_85_ = ((-((float) method42() - f_71_) * f_80_ + -f_72_ * f_79_) / 4096.0F + f_70_);
			float f_86_ = ((-f_71_ * f_81_ + ((float) method2410() - f_72_) * f_78_) / 4096.0F + f);
			float f_87_ = ((--f_71_ * f_80_ + ((float) method2410() - f_72_) * f_79_) / 4096.0F + f_70_);
			method2429(f_82_, f_83_, f_84_, f_85_, f_86_, f_87_, i_75_, i_76_, i_77_);
		}
	}

	public final void method2426(int i, int i_88_) {
		method2416(i, i_88_, 1, -1, 1);
	}

	public final void method2427(float f, float f_89_, int i, int i_90_, Class142 class142, int i_91_, int i_92_) {
		method2471(f, f_89_, (float) method42() / 2.0F, (float) method2410() / 2.0F, i, i_90_, class142, i_91_, i_92_);
	}

	public final void method2428(float f, float f_93_, float f_94_, float f_95_, int i, int i_96_, int i_97_, int i_98_, int i_99_) {
		if (i != 0) {
			double d = (double) (i_96_ & 0xffff) * 9.587379924285257E-5;
			float f_100_ = (float) Math.sin(d) * (float) i;
			float f_101_ = (float) Math.cos(d) * (float) i;
			float f_102_ = (-f_94_ * f_101_ + -f_95_ * f_100_) / 4096.0F + f;
			float f_103_ = (--f_94_ * f_100_ + -f_95_ * f_101_) / 4096.0F + f_93_;
			float f_104_ = ((((float) method42() - f_94_) * f_101_ + -f_95_ * f_100_) / 4096.0F + f);
			float f_105_ = ((-((float) method42() - f_94_) * f_100_ + -f_95_ * f_101_) / 4096.0F + f_93_);
			float f_106_ = (((-f_94_ * f_101_ + ((float) method2410() - f_95_) * f_100_) / 4096.0F) + f);
			float f_107_ = ((--f_94_ * f_100_ + ((float) method2410() - f_95_) * f_101_) / 4096.0F + f_93_);
			method2429(f_102_, f_103_, f_104_, f_105_, f_106_, f_107_, i_97_, i_98_, i_99_);
		}
	}

	public final void method2429(float f, float f_108_, float f_109_, float f_110_, float f_111_, float f_112_, int i, int i_113_, int i_114_) {
		method2430(f, f_108_, f_109_, f_110_, f_111_, f_112_, i, i_113_, i_114_, 1);
	}

	abstract void method2430(float f, float f_115_, float f_116_, float f_117_, float f_118_, float f_119_, int i, int i_120_, int i_121_, int i_122_);

	public abstract int method2431();

	abstract void method2432(float f, float f_123_, float f_124_, float f_125_, float f_126_, float f_127_, int i, Class142 class142, int i_128_, int i_129_);

	public abstract int method41();

	public abstract void method2433(int i, int i_130_, int i_131_, int i_132_, int[] is, int i_133_, int i_134_);

	public abstract void method2434(int i, int i_135_, int i_136_, int i_137_, int[] is, int i_138_, int i_139_);

	public abstract void method2435(int i, int i_140_, int i_141_, int i_142_, int i_143_, int i_144_);

	public abstract void method2436(int i, int i_145_, int i_146_);

	final void method2437(float f, float f_147_, float f_148_, float f_149_, float f_150_, float f_151_, Class142 class142, int i, int i_152_) {
		method2432(f, f_147_, f_148_, f_149_, f_150_, f_151_, 1, class142, i, i_152_);
	}

	public abstract void method2438(int i, int i_153_, Class142 class142, int i_154_, int i_155_);

	abstract void method2439(int i, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_, int i_161_, int i_162_);

	public abstract void method2440(int i, int i_163_, int i_164_);

	public abstract void method2441(int i, int i_165_, int i_166_, int i_167_, int[] is, int[] is_168_, int i_169_, int i_170_);

	public final void method2442(float f, float f_171_, int i, int i_172_, int i_173_, int i_174_, int i_175_) {
		method2428(f, f_171_, (float) method42() / 2.0F, (float) method2410() / 2.0F, i, i_172_, i_173_, i_174_, i_175_);
	}

	public abstract Interface21 method2443();

	public abstract void method2444(int i, int i_176_, int i_177_, int i_178_, int[] is, int i_179_, int i_180_);

	public abstract void method2445(int i, int i_181_, int i_182_, int i_183_, int i_184_, int i_185_);

	public abstract void method2446(int[] is);

	public abstract void method2447(int[] is);

	public abstract int method2448();

	abstract void method2449(float f, float f_186_, float f_187_, float f_188_, float f_189_, float f_190_, int i, Class142 class142, int i_191_, int i_192_);

	public final void method2450(float f, float f_193_, float f_194_, float f_195_, int i, int i_196_, int i_197_, int i_198_, int i_199_) {
		if (i != 0) {
			double d = (double) (i_196_ & 0xffff) * 9.587379924285257E-5;
			float f_200_ = (float) Math.sin(d) * (float) i;
			float f_201_ = (float) Math.cos(d) * (float) i;
			float f_202_ = (-f_194_ * f_201_ + -f_195_ * f_200_) / 4096.0F + f;
			float f_203_ = (--f_194_ * f_200_ + -f_195_ * f_201_) / 4096.0F + f_193_;
			float f_204_ = ((((float) method42() - f_194_) * f_201_ + -f_195_ * f_200_) / 4096.0F + f);
			float f_205_ = ((-((float) method42() - f_194_) * f_200_ + -f_195_ * f_201_) / 4096.0F + f_193_);
			float f_206_ = ((-f_194_ * f_201_ + ((float) method2410() - f_195_) * f_200_) / 4096.0F + f);
			float f_207_ = ((--f_194_ * f_200_ + ((float) method2410() - f_195_) * f_201_) / 4096.0F + f_193_);
			method2429(f_202_, f_203_, f_204_, f_205_, f_206_, f_207_, i_197_, i_198_, i_199_);
		}
	}

	public abstract int method40();

	public abstract int method43();

	public final void method2451(int i, int i_208_, int i_209_, int i_210_) {
		method2422(i, i_208_, i_209_, i_210_, 1, -1, 1);
	}

	public abstract int method44();

	public abstract int method2452();

	public abstract void method2453(int i, int i_211_, int i_212_, int i_213_, int i_214_);

	public abstract Interface21 method2454();

	public abstract void method2455(int i, int i_215_, int i_216_, int i_217_, int i_218_, int i_219_, int i_220_);

	public abstract void method2456(int i, int i_221_, int i_222_, int i_223_, int i_224_, int i_225_, int i_226_);

	abstract void method2457(float f, float f_227_, float f_228_, float f_229_, float f_230_, float f_231_, int i, int i_232_, int i_233_, int i_234_);

	public final void method2458(int i, int i_235_, int i_236_, int i_237_, int i_238_, int i_239_, int i_240_) {
		method2420(i, i_235_, i_236_, i_237_, i_238_, i_239_, i_240_, 1);
	}

	public abstract void method2459(int i, int i_241_, int i_242_, int i_243_, int[] is, int i_244_, int i_245_);

	public abstract int method2460();

	public abstract int method2461();

	public abstract Interface21 method2462();

	public final void method2463(float f, float f_246_, float f_247_, float f_248_, int i, int i_249_, int i_250_, int i_251_, int i_252_, int i_253_) {
		if (i != 0 && i_249_ != 0) {
			double d = (double) (i_250_ & 0xffff) * 9.587379924285257E-5;
			float f_254_ = (float) Math.sin(d) * (float) i_249_;
			float f_255_ = (float) Math.cos(d) * (float) i_249_;
			float f_256_ = (float) Math.sin(d) * (float) i;
			float f_257_ = (float) Math.cos(d) * (float) i;
			float f_258_ = (-f_247_ * f_257_ + -f_248_ * f_254_) / 4096.0F + f;
			float f_259_ = (--f_247_ * f_256_ + -f_248_ * f_255_) / 4096.0F + f_246_;
			float f_260_ = ((((float) method42() - f_247_) * f_257_ + -f_248_ * f_254_) / 4096.0F + f);
			float f_261_ = ((-((float) method42() - f_247_) * f_256_ + -f_248_ * f_255_) / 4096.0F + f_246_);
			float f_262_ = ((-f_247_ * f_257_ + ((float) method2410() - f_248_) * f_254_) / 4096.0F + f);
			float f_263_ = ((--f_247_ * f_256_ + ((float) method2410() - f_248_) * f_255_) / 4096.0F + f_246_);
			method2429(f_258_, f_259_, f_260_, f_261_, f_262_, f_263_, i_251_, i_252_, i_253_);
		}
	}

	public final void method2464(int i, int i_264_, int i_265_, int i_266_) {
		method2420(i, i_264_, i_265_, i_266_, 1, -1, 1, 1);
	}

	public abstract void method2465(int i, int i_267_, Class142 class142, int i_268_, int i_269_);

	public final void method2466(int i, int i_270_, int i_271_, int i_272_) {
		method2422(i, i_270_, i_271_, i_272_, 1, -1, 1);
	}

	final void method2467(float f, float f_273_, float f_274_, float f_275_, float f_276_, float f_277_, Class142 class142, int i, int i_278_) {
		method2432(f, f_273_, f_274_, f_275_, f_276_, f_277_, 1, class142, i, i_278_);
	}

	public final void method2468(float f, float f_279_, float f_280_, float f_281_, int i, int i_282_, int i_283_, int i_284_, int i_285_) {
		if (i != 0) {
			double d = (double) (i_282_ & 0xffff) * 9.587379924285257E-5;
			float f_286_ = (float) Math.sin(d) * (float) i;
			float f_287_ = (float) Math.cos(d) * (float) i;
			float f_288_ = (-f_280_ * f_287_ + -f_281_ * f_286_) / 4096.0F + f;
			float f_289_ = (--f_280_ * f_286_ + -f_281_ * f_287_) / 4096.0F + f_279_;
			float f_290_ = ((((float) method42() - f_280_) * f_287_ + -f_281_ * f_286_) / 4096.0F + f);
			float f_291_ = ((-((float) method42() - f_280_) * f_286_ + -f_281_ * f_287_) / 4096.0F + f_279_);
			float f_292_ = ((-f_280_ * f_287_ + ((float) method2410() - f_281_) * f_286_) / 4096.0F + f);
			float f_293_ = ((--f_280_ * f_286_ + ((float) method2410() - f_281_) * f_287_) / 4096.0F + f_279_);
			method2429(f_288_, f_289_, f_290_, f_291_, f_292_, f_293_, i_283_, i_284_, i_285_);
		}
	}

	public final void method2469(float f, float f_294_, float f_295_, float f_296_, int i, int i_297_) {
		method2428(f, f_294_, f_295_, f_296_, i, i_297_, 1, -1, 1);
	}

	public final void method2470(float f, float f_298_, float f_299_, float f_300_, int i, int i_301_) {
		method2428(f, f_298_, f_299_, f_300_, i, i_301_, 1, -1, 1);
	}

	public final void method2471(float f, float f_302_, float f_303_, float f_304_, int i, int i_305_, Class142 class142, int i_306_, int i_307_) {
		if (i != 0) {
			double d = (double) (i_305_ & 0xffff) * 9.587379924285257E-5;
			float f_308_ = (float) Math.sin(d) * (float) i;
			float f_309_ = (float) Math.cos(d) * (float) i;
			float f_310_ = (-f_303_ * f_309_ + -f_304_ * f_308_) / 4096.0F + f;
			float f_311_ = (--f_303_ * f_308_ + -f_304_ * f_309_) / 4096.0F + f_302_;
			float f_312_ = ((((float) method42() - f_303_) * f_309_ + -f_304_ * f_308_) / 4096.0F + f);
			float f_313_ = ((-((float) method42() - f_303_) * f_308_ + -f_304_ * f_309_) / 4096.0F + f_302_);
			float f_314_ = ((-f_303_ * f_309_ + ((float) method2410() - f_304_) * f_308_) / 4096.0F + f);
			float f_315_ = ((--f_303_ * f_308_ + ((float) method2410() - f_304_) * f_309_) / 4096.0F + f_302_);
			method2467(f_310_, f_311_, f_312_, f_313_, f_314_, f_315_, class142, i_306_, i_307_);
		}
	}

	abstract void method2472(int i, int i_316_, int i_317_, int i_318_, int i_319_, int i_320_, int i_321_, int i_322_);

	public final void method2473(float f, float f_323_, int i, int i_324_) {
		method2428(f, f_323_, (float) method42() / 2.0F, (float) method2410() / 2.0F, i, i_324_, 1, -1, 1);
	}

	public final void method2474(float f, float f_325_, int i, int i_326_, int i_327_, int i_328_, int i_329_) {
		method2428(f, f_325_, (float) method42() / 2.0F, (float) method2410() / 2.0F, i, i_326_, i_327_, i_328_, i_329_);
	}

	public final void method2475(float f, float f_330_, float f_331_, float f_332_, int i, int i_333_, int i_334_, int i_335_, int i_336_) {
		if (i != 0) {
			double d = (double) (i_333_ & 0xffff) * 9.587379924285257E-5;
			float f_337_ = (float) Math.sin(d) * (float) i;
			float f_338_ = (float) Math.cos(d) * (float) i;
			float f_339_ = (-f_331_ * f_338_ + -f_332_ * f_337_) / 4096.0F + f;
			float f_340_ = (--f_331_ * f_337_ + -f_332_ * f_338_) / 4096.0F + f_330_;
			float f_341_ = ((((float) method42() - f_331_) * f_338_ + -f_332_ * f_337_) / 4096.0F + f);
			float f_342_ = ((-((float) method42() - f_331_) * f_337_ + -f_332_ * f_338_) / 4096.0F + f_330_);
			float f_343_ = ((-f_331_ * f_338_ + ((float) method2410() - f_332_) * f_337_) / 4096.0F + f);
			float f_344_ = ((--f_331_ * f_337_ + ((float) method2410() - f_332_) * f_338_) / 4096.0F + f_330_);
			method2429(f_339_, f_340_, f_341_, f_342_, f_343_, f_344_, i_334_, i_335_, i_336_);
		}
	}

	public final void method2476(float f, float f_345_, float f_346_, float f_347_, int i, int i_348_, int i_349_, int i_350_, int i_351_, int i_352_) {
		if (i != 0 && i_348_ != 0) {
			double d = (double) (i_349_ & 0xffff) * 9.587379924285257E-5;
			float f_353_ = (float) Math.sin(d) * (float) i_348_;
			float f_354_ = (float) Math.cos(d) * (float) i_348_;
			float f_355_ = (float) Math.sin(d) * (float) i;
			float f_356_ = (float) Math.cos(d) * (float) i;
			float f_357_ = (-f_346_ * f_356_ + -f_347_ * f_353_) / 4096.0F + f;
			float f_358_ = (--f_346_ * f_355_ + -f_347_ * f_354_) / 4096.0F + f_345_;
			float f_359_ = ((((float) method42() - f_346_) * f_356_ + -f_347_ * f_353_) / 4096.0F + f);
			float f_360_ = ((-((float) method42() - f_346_) * f_355_ + -f_347_ * f_354_) / 4096.0F + f_345_);
			float f_361_ = ((-f_346_ * f_356_ + ((float) method2410() - f_347_) * f_353_) / 4096.0F + f);
			float f_362_ = ((--f_346_ * f_355_ + ((float) method2410() - f_347_) * f_354_) / 4096.0F + f_345_);
			method2429(f_357_, f_358_, f_359_, f_360_, f_361_, f_362_, i_350_, i_351_, i_352_);
		}
	}

	public final void method2477(float f, float f_363_, int i, int i_364_) {
		method2428(f, f_363_, (float) method42() / 2.0F, (float) method2410() / 2.0F, i, i_364_, 1, -1, 1);
	}

	public abstract void method2478(int i, int i_365_, int i_366_, int i_367_);

	public final void method2479(float f, float f_368_, float f_369_, float f_370_, int i, int i_371_, int i_372_, int i_373_, int i_374_) {
		if (i != 0) {
			double d = (double) (i_371_ & 0xffff) * 9.587379924285257E-5;
			float f_375_ = (float) Math.sin(d) * (float) i;
			float f_376_ = (float) Math.cos(d) * (float) i;
			float f_377_ = (-f_369_ * f_376_ + -f_370_ * f_375_) / 4096.0F + f;
			float f_378_ = (--f_369_ * f_375_ + -f_370_ * f_376_) / 4096.0F + f_368_;
			float f_379_ = ((((float) method42() - f_369_) * f_376_ + -f_370_ * f_375_) / 4096.0F + f);
			float f_380_ = ((-((float) method42() - f_369_) * f_375_ + -f_370_ * f_376_) / 4096.0F + f_368_);
			float f_381_ = ((-f_369_ * f_376_ + ((float) method2410() - f_370_) * f_375_) / 4096.0F + f);
			float f_382_ = ((--f_369_ * f_375_ + ((float) method2410() - f_370_) * f_376_) / 4096.0F + f_368_);
			method2429(f_377_, f_378_, f_379_, f_380_, f_381_, f_382_, i_372_, i_373_, i_374_);
		}
	}

	public final void method2480(float f, float f_383_, float f_384_, float f_385_, int i, int i_386_, int i_387_, int i_388_, int i_389_) {
		if (i != 0) {
			double d = (double) (i_386_ & 0xffff) * 9.587379924285257E-5;
			float f_390_ = (float) Math.sin(d) * (float) i;
			float f_391_ = (float) Math.cos(d) * (float) i;
			float f_392_ = (-f_384_ * f_391_ + -f_385_ * f_390_) / 4096.0F + f;
			float f_393_ = (--f_384_ * f_390_ + -f_385_ * f_391_) / 4096.0F + f_383_;
			float f_394_ = ((((float) method42() - f_384_) * f_391_ + -f_385_ * f_390_) / 4096.0F + f);
			float f_395_ = ((-((float) method42() - f_384_) * f_390_ + -f_385_ * f_391_) / 4096.0F + f_383_);
			float f_396_ = ((-f_384_ * f_391_ + ((float) method2410() - f_385_) * f_390_) / 4096.0F + f);
			float f_397_ = ((--f_384_ * f_390_ + ((float) method2410() - f_385_) * f_391_) / 4096.0F + f_383_);
			method2429(f_392_, f_393_, f_394_, f_395_, f_396_, f_397_, i_387_, i_388_, i_389_);
		}
	}

	public final void method2481(float f, float f_398_, float f_399_, float f_400_, int i, int i_401_, int i_402_, int i_403_, int i_404_) {
		if (i != 0) {
			double d = (double) (i_401_ & 0xffff) * 9.587379924285257E-5;
			float f_405_ = (float) Math.sin(d) * (float) i;
			float f_406_ = (float) Math.cos(d) * (float) i;
			float f_407_ = (-f_399_ * f_406_ + -f_400_ * f_405_) / 4096.0F + f;
			float f_408_ = (--f_399_ * f_405_ + -f_400_ * f_406_) / 4096.0F + f_398_;
			float f_409_ = ((((float) method42() - f_399_) * f_406_ + -f_400_ * f_405_) / 4096.0F + f);
			float f_410_ = ((-((float) method42() - f_399_) * f_405_ + -f_400_ * f_406_) / 4096.0F + f_398_);
			float f_411_ = ((-f_399_ * f_406_ + ((float) method2410() - f_400_) * f_405_) / 4096.0F + f);
			float f_412_ = ((--f_399_ * f_405_ + ((float) method2410() - f_400_) * f_406_) / 4096.0F + f_398_);
			method2429(f_407_, f_408_, f_409_, f_410_, f_411_, f_412_, i_402_, i_403_, i_404_);
		}
	}

	public abstract void method2482(int[] is);

	public final void method2483(float f, float f_413_, int i, int i_414_, Class142 class142, int i_415_, int i_416_) {
		method2471(f, f_413_, (float) method42() / 2.0F, (float) method2410() / 2.0F, i, i_414_, class142, i_415_, i_416_);
	}

	public final void method2484(float f, float f_417_, float f_418_, float f_419_, int i, int i_420_, Class142 class142, int i_421_, int i_422_) {
		if (i != 0) {
			double d = (double) (i_420_ & 0xffff) * 9.587379924285257E-5;
			float f_423_ = (float) Math.sin(d) * (float) i;
			float f_424_ = (float) Math.cos(d) * (float) i;
			float f_425_ = (-f_418_ * f_424_ + -f_419_ * f_423_) / 4096.0F + f;
			float f_426_ = (--f_418_ * f_423_ + -f_419_ * f_424_) / 4096.0F + f_417_;
			float f_427_ = ((((float) method42() - f_418_) * f_424_ + -f_419_ * f_423_) / 4096.0F + f);
			float f_428_ = ((-((float) method42() - f_418_) * f_423_ + -f_419_ * f_424_) / 4096.0F + f_417_);
			float f_429_ = ((-f_418_ * f_424_ + ((float) method2410() - f_419_) * f_423_) / 4096.0F + f);
			float f_430_ = ((--f_418_ * f_423_ + ((float) method2410() - f_419_) * f_424_) / 4096.0F + f_417_);
			method2467(f_425_, f_426_, f_427_, f_428_, f_429_, f_430_, class142, i_421_, i_422_);
		}
	}

	public final void method2485(float f, float f_431_, float f_432_, float f_433_, int i, int i_434_, Class142 class142, int i_435_, int i_436_) {
		if (i != 0) {
			double d = (double) (i_434_ & 0xffff) * 9.587379924285257E-5;
			float f_437_ = (float) Math.sin(d) * (float) i;
			float f_438_ = (float) Math.cos(d) * (float) i;
			float f_439_ = (-f_432_ * f_438_ + -f_433_ * f_437_) / 4096.0F + f;
			float f_440_ = (--f_432_ * f_437_ + -f_433_ * f_438_) / 4096.0F + f_431_;
			float f_441_ = ((((float) method42() - f_432_) * f_438_ + -f_433_ * f_437_) / 4096.0F + f);
			float f_442_ = ((-((float) method42() - f_432_) * f_437_ + -f_433_ * f_438_) / 4096.0F + f_431_);
			float f_443_ = ((-f_432_ * f_438_ + ((float) method2410() - f_433_) * f_437_) / 4096.0F + f);
			float f_444_ = ((--f_432_ * f_437_ + ((float) method2410() - f_433_) * f_438_) / 4096.0F + f_431_);
			method2467(f_439_, f_440_, f_441_, f_442_, f_443_, f_444_, class142, i_435_, i_436_);
		}
	}

	public abstract void method2486(int i, int i_445_, int i_446_);
}
