/* Class180 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;
import java.awt.Dimension;
import java.io.DataInputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class Class180 {
	protected int anInt2057;
	public static final int anInt2058 = 2;
	public Class181 aClass181_2059;
	public static final int anInt2060 = 3;
	public static final int anInt2061 = 5;
	static final int anInt2062 = 8;
	static boolean[] aBoolArray2063 = new boolean[8];
	public int anInt2064;
	static final int anInt2065 = 4;
	public static final int anInt2066 = 1;
	public Interface48 anInterface48_2067;
	public int anInt2068;
	public static final int anInt2069 = 0;
	public static final int anInt2070 = 1;
	protected static final int anInt2071 = 8;
	protected static final int anInt2072 = 1;
	protected Class171_Sub1 aClass171_Sub1_2073;
	protected static final int anInt2074 = 4;
	protected static final int anInt2075 = 2;
	protected static final int anInt2076 = 16;
	protected static final int anInt2077 = 32;
	public Interface46 anInterface46_2078;
	public static final int anInt2079 = 2;
	protected Class171 aClass171_2080;
	public static final int anInt2081 = 0;
	protected Hashtable aHashtable2082;
	public int anInt2083;
	protected int anInt2084;
	public Interface24 anInterface24_2085;
	int anInt2086 = 1346974809;
	Class171_Sub2[] aClass171_Sub2Array2087;
	protected int anInt2088;
	protected int anInt2089;
	public float aFloat2090;

	public abstract void method3075(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_);

	public abstract void method3076(int i, int i_5_, float f, int i_6_, int i_7_, float f_8_, int i_9_, int i_10_, float f_11_, int i_12_, int i_13_, int i_14_, int i_15_);

	public abstract Class143 method3077();

	public final void method3078(byte i) throws Exception_Sub1 {
		method3079(0, 0);
	}

	abstract void method3079(int i, int i_16_) throws Exception_Sub1;

	public abstract void method3080();

	public void method3081(byte i) {
		aBoolArray2063[anInt2064 * -397006101] = false;
		Enumeration enumeration = aHashtable2082.keys();
		while (enumeration.hasMoreElements()) {
			Canvas canvas = (Canvas) enumeration.nextElement();
			Class171_Sub1 class171_sub1 = (Class171_Sub1) aHashtable2082.get(canvas);
			class171_sub1.method129();
		}
		method3082();
	}

	abstract void method3082();

	public abstract void method3083(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, Class142 class142, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_);

	public abstract boolean method3084();

	public abstract Class161 method3085(int i, int i_27_, int[][] is, int[][] is_28_, int i_29_, int i_30_, int i_31_);

	public abstract boolean method3086();

	public abstract void method3087();

	public abstract boolean method3088();

	public abstract boolean method3089();

	public abstract int method3090();

	public abstract boolean method3091();

	abstract void method3092();

	public abstract boolean method3093();

	public abstract boolean method3094();

	public abstract boolean method3095();

	public abstract String method3096();

	public abstract void method3097(int i, int i_32_);

	public void method3098(int[] is) {
		if (null != aClass171_Sub1_2073) {
			is[0] = aClass171_Sub1_2073.method2728();
			is[1] = aClass171_Sub1_2073.method2729();
		} else {
			int[] is_33_ = is;
			is[1] = 0;
			is_33_[0] = 0;
		}
	}

	public abstract Class161 method3099(int i, int i_34_, int[][] is, int[][] is_35_, int i_36_, int i_37_, int i_38_);

	public final Class171_Sub1 method3100(int i) {
		return aClass171_Sub1_2073;
	}

	public abstract String method3101();

	final void method3102(Canvas canvas, Class171_Sub1 class171_sub1, int i) {
		if (null == class171_sub1)
			throw new RuntimeException("");
		aHashtable2082.put(canvas, class171_sub1);
	}

	public final void method3103(Canvas canvas, int i) {
		if (aHashtable2082.containsKey(canvas)) {
			Class171_Sub1 class171_sub1 = (Class171_Sub1) aHashtable2082.get(canvas);
			class171_sub1.method129();
			aHashtable2082.remove(canvas);
		}
	}

	public final void method3104(Canvas canvas, int i) {
		Class171_Sub1 class171_sub1 = (Class171_Sub1) aHashtable2082.get(canvas);
		if (null == class171_sub1)
			throw new RuntimeException();
		if (anInt2086 * -1909117929 > 0 || aClass171_2080 != aClass171_Sub1_2073)
			throw new RuntimeException();
		if (null != aClass171_2080)
			aClass171_2080.method2731();
		if (anInt2086 * -1909117929 < 0)
			aClass171_2080 = class171_sub1;
		aClass171_Sub1_2073 = class171_sub1;
		class171_sub1.method348();
	}

	public abstract void method3105(Class427 class427);

	public final void method3106(Class171_Sub2 class171_sub2, byte i) {
		if (anInt2086 * -1909117929 >= 3)
			throw new RuntimeException();
		if (anInt2086 * -1909117929 >= 0)
			aClass171_Sub2Array2087[anInt2086 * -1909117929].method2731();
		else
			aClass171_Sub1_2073.method2731();
		aClass171_2080 = aClass171_Sub2Array2087[(anInt2086 += -1346974809) * -1909117929] = class171_sub2;
		class171_sub2.method348();
	}

	public final void method3107(Class171_Sub2 class171_sub2, int i) {
		if (-1909117929 * anInt2086 < 0 || (class171_sub2 != aClass171_Sub2Array2087[anInt2086 * -1909117929]))
			throw new RuntimeException();
		aClass171_Sub2Array2087[(anInt2086 -= -1346974809) * -1909117929 + 1] = null;
		class171_sub2.method2731();
		if (anInt2086 * -1909117929 >= 0) {
			aClass171_2080 = aClass171_Sub2Array2087[anInt2086 * -1909117929];
			aClass171_Sub2Array2087[anInt2086 * -1909117929].method348();
		} else {
			aClass171_2080 = aClass171_Sub1_2073;
			aClass171_Sub1_2073.method348();
		}
	}

	abstract Class171_Sub1 method3108(Canvas canvas, int i, int i_39_);

	public abstract Class171_Sub2 method3109();

	public abstract Class176 method3110(Class175 class175, int i, int i_40_, int i_41_, int i_42_);

	public abstract Interface23 method3111(int i, int i_43_);

	public abstract boolean method3112();

	public abstract int[] method3113(int i, int i_44_, int i_45_, int i_46_);

	public abstract void method3114();

	public abstract boolean method3115();

	public abstract void method3116(int i, int i_47_);

	public abstract long method3117(int i, int i_48_);

	public abstract boolean method3118();

	public abstract int method3119();

	public abstract void method3120();

	public abstract void method3121(int i, int i_49_, int i_50_);

	abstract void method3122(int i, int i_51_) throws Exception_Sub1;

	public abstract void method3123(long l);

	public void method3124(boolean bool) {
		/* empty */
	}

	public int[] method3125(int i, int i_52_, int i_53_, int i_54_, int[] is, int i_55_, int i_56_) {
		int[] is_57_ = new int[i_54_ * i_53_];
		if (i_56_ == 0)
			i_56_ = i;
		for (int i_58_ = 0; i_58_ < i_54_; i_58_++) {
			if (i_58_ < i_52_) {
				int i_59_ = i_55_ + i_58_ * i_56_;
				for (int i_60_ = 0; i_60_ < i; i_60_++)
					is_57_[i_60_ + i_58_ * i_53_] = is[i_59_ + i_60_];
				int i_61_ = is[i - 1 + i_59_];
				for (int i_62_ = i; i_62_ < i_53_; i_62_++)
					is_57_[i_53_ * i_58_ + i_62_] = i_61_;
			} else {
				int i_63_ = i_53_ * (i_52_ - 1);
				for (int i_64_ = 0; i_64_ < i_53_; i_64_++)
					is_57_[i_53_ * i_58_ + i_64_] = is_57_[i_64_ + i_63_];
			}
		}
		return is_57_;
	}

	public abstract void method3126();

	public abstract void method3127();

	public abstract void method3128(int i, int i_65_, int i_66_, int i_67_);

	public abstract void method3129(int[] is);

	public abstract void method3130(Class527_Sub27 class527_sub27);

	public abstract void method3131();

	public abstract void method3132(int i, int i_68_, int i_69_, int i_70_);

	public abstract boolean method3133();

	public abstract void method3134(int i, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_);

	public abstract void method3135(int[] is);

	public abstract void method3136(int i, int i_76_);

	public abstract Class427 method3137();

	public abstract void method3138(int i, int i_77_, int i_78_, int i_79_);

	public final void method3139(int i, int i_80_, int i_81_, int i_82_, byte i_83_) {
		method3529(i, i_80_, i_81_, i_82_, 1);
	}

	public abstract boolean method3140();

	public final void method3141(int i, int i_84_, int i_85_, int i_86_, int i_87_) {
		method3148(i, i_84_, i_85_, i_86_, 1);
	}

	public final void method3142(int i, int i_88_, int i_89_, int i_90_, int i_91_, byte i_92_) {
		method3149(i, i_88_, i_89_, i_90_, i_91_, 1);
	}

	public abstract Class432 method3143();

	public abstract void method3144(int i, Class178 class178);

	public abstract int method3145(int i, int i_93_);

	public Class147 method3146(int i, int i_94_, boolean bool, int i_95_) {
		return method3161(i, i_94_, bool, false);
	}

	static synchronized Class180 method3147(int i, Canvas canvas, Class181 class181, Interface24 interface24, Interface48 interface48, Interface46 interface46, Interface49 interface49, Class459 class459, int i_96_, int i_97_, int i_98_, int i_99_) {
		if (0 == i)
			return Class25.method849(canvas, class181, interface24, interface48, interface46, interface49, i_97_, i_98_, 141897409);
		if (1 == i)
			return Class148.method2487(canvas, class181, interface24, interface48, interface46, interface49, i_96_);
		if (i == 5)
			return Class489.method7971(canvas, class181, interface24, interface48, interface46, interface49, class459, i_96_);
		if (i == 3)
			return Class423.method6723(canvas, class181, interface24, interface48, interface46, interface49, class459, i_96_);
		throw new IllegalArgumentException("");
	}

	abstract void method3148(int i, int i_100_, int i_101_, int i_102_, int i_103_);

	public abstract void method3149(int i, int i_104_, int i_105_, int i_106_, int i_107_, int i_108_);

	public abstract void method3150(int i, int i_109_, int i_110_, int i_111_, int i_112_, int i_113_, Class142 class142, int i_114_, int i_115_);

	public abstract void method3151(int i, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_);

	public abstract boolean method3152();

	public final Class171_Sub1 method3153() {
		return aClass171_Sub1_2073;
	}

	public final void method3154(Class171_Sub2 class171_sub2) {
		if (anInt2086 * -1909117929 >= 3)
			throw new RuntimeException();
		if (anInt2086 * -1909117929 >= 0)
			aClass171_Sub2Array2087[anInt2086 * -1909117929].method2731();
		else
			aClass171_Sub1_2073.method2731();
		aClass171_2080 = aClass171_Sub2Array2087[(anInt2086 += -1346974809) * -1909117929] = class171_sub2;
		class171_sub2.method348();
	}

	public boolean method3155(int i, int i_124_, Class432 class432, Class439 class439, int i_125_) {
		return method3349(i, i_124_, 0, 0, class432, class439);
	}

	public abstract Interface23 method3156(int i, int i_126_, int i_127_);

	public abstract void method3157(int i, float f, float f_128_, float f_129_, float f_130_, float f_131_);

	public abstract void method3158(int i, Class527_Sub16[] class527_sub16s);

	public final void method3159(Canvas canvas, int i, int i_132_, int i_133_) {
		Class171_Sub1 class171_sub1 = (Class171_Sub1) aHashtable2082.get(canvas);
		if (null == class171_sub1)
			throw new RuntimeException("");
		class171_sub1.method14728(i, i_132_);
	}

	public abstract void method3160(int i, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_, int i_139_, int i_140_, int i_141_);

	public abstract Class147 method3161(int i, int i_142_, boolean bool, boolean bool_143_);

	public abstract Class147 method3162(int[] is, int i, int i_144_, int i_145_, int i_146_, boolean bool);

	public Class147 method3163(int[] is, int i, int i_147_, int i_148_, int i_149_, int i_150_) {
		return method3162(is, i, i_147_, i_148_, i_149_, true);
	}

	Class180(Class181 class181, Interface24 interface24, Interface48 interface48, Interface46 interface46, Interface49 interface49) {
		aHashtable2082 = new Hashtable();
		aClass171_Sub2Array2087 = new Class171_Sub2[4];
		anInt2089 = 0;
		aFloat2090 = 0.0F;
		aClass181_2059 = class181;
		anInterface24_2085 = interface24;
		anInterface48_2067 = interface48;
		anInterface46_2078 = interface46;
		int i = -1;
		for (int i_151_ = 0; i_151_ < 8; i_151_++) {
			if (!aBoolArray2063[i_151_]) {
				aBoolArray2063[i_151_] = true;
				i = i_151_;
				break;
			}
		}
		if (i == -1)
			throw new IllegalStateException("");
		anInt2064 = i * 703999427;
	}

	public final void method3164(int i, int i_152_, int i_153_, int i_154_) {
		method3410(i, i_152_, i_153_, i_154_, 1);
	}

	public void method3165() {
		/* empty */
	}

	public abstract Class174 method3166(Class22 class22, Class185[] class185s, boolean bool);

	public void method3167() {
		/* empty */
	}

	public abstract void method3168(int i, int i_155_, int i_156_, int i_157_);

	public abstract void method3169(int i, Class142 class142, int i_158_, int i_159_);

	public abstract Class174 method3170(Class22 class22, Class185[] class185s, boolean bool);

	public abstract Class427 method3171();

	public abstract Class432 method3172();

	public abstract void method3173(int i);

	public final void method3174(int i, int i_160_, int i_161_, int i_162_, int i_163_, int i_164_) {
		method3348(i, i_160_, i_161_, i_162_, i_163_, 1);
	}

	public abstract int method3175(int i, int i_165_);

	public abstract int method3176(int i, int i_166_);

	public abstract void method3177(int i, int i_167_, int i_168_, int i_169_, int i_170_, int i_171_, int i_172_);

	public boolean method3178(int i) {
		return true;
	}

	public abstract void method3179(Class182 class182);

	public abstract void method3180(Class432 class432);

	public abstract Class432 method3181();

	public abstract void method3182(boolean bool);

	public abstract void method3183(Class427 class427);

	public abstract boolean method3184();

	public abstract void method3185(Class432 class432);

	public abstract void method3186(int i, int i_173_, int i_174_, int i_175_, int i_176_, int i_177_);

	public abstract void method3187(int i, int i_178_, int i_179_);

	public abstract int method3188();

	public final void method3189(int i, int i_180_, int i_181_, int i_182_, int i_183_) {
		method3149(i, i_180_, i_181_, i_182_, i_183_, 1);
	}

	public abstract void method3190(Class527_Sub27 class527_sub27);

	public abstract Class179 method3191(int i);

	public abstract void method3192();

	public abstract void method3193(Class179 class179);

	public abstract void method3194();

	public abstract void method3195(int i, int i_184_);

	public abstract boolean method3196();

	public abstract boolean method3197();

	public abstract void method3198(float f, float f_185_, float f_186_, float f_187_, float f_188_);

	public abstract Class172 method3199(int[] is);

	public abstract boolean method3200();

	public abstract void method3201(Class172 class172, float f, Class172 class172_189_, float f_190_, Class172 class172_191_, float f_192_);

	public abstract boolean method3202();

	public abstract void method3203();

	public abstract boolean method3204();

	public abstract boolean method3205();

	abstract void method3206(float f, float f_193_, float f_194_, float f_195_, float f_196_, float f_197_);

	public abstract void method3207(int i, Class178 class178);

	public abstract boolean method3208();

	public abstract void method3209(int i);

	public abstract void method3210(float f, float f_198_, float f_199_, float[] fs);

	public abstract Class432 method3211();

	public int[] method3212(int i, int i_200_, int i_201_, int i_202_, int[] is, int i_203_, int i_204_, byte i_205_) {
		int[] is_206_ = new int[i_202_ * i_201_];
		if (i_204_ == 0)
			i_204_ = i;
		for (int i_207_ = 0; i_207_ < i_202_; i_207_++) {
			if (i_207_ < i_200_) {
				int i_208_ = i_203_ + i_207_ * i_204_;
				for (int i_209_ = 0; i_209_ < i; i_209_++)
					is_206_[i_209_ + i_207_ * i_201_] = is[i_208_ + i_209_];
				int i_210_ = is[i - 1 + i_208_];
				for (int i_211_ = i; i_211_ < i_201_; i_211_++)
					is_206_[i_201_ * i_207_ + i_211_] = i_210_;
			} else {
				int i_212_ = i_201_ * (i_200_ - 1);
				for (int i_213_ = 0; i_213_ < i_201_; i_213_++)
					is_206_[i_201_ * i_207_ + i_213_] = is_206_[i_213_ + i_212_];
			}
		}
		return is_206_;
	}

	public float[] method3213(int i, int i_214_, int i_215_, int i_216_, float[] fs, int i_217_, int i_218_, int i_219_, int i_220_) {
		float[] fs_221_ = new float[i_219_ * (i_215_ * i_216_)];
		if (i_218_ == 0)
			i_218_ = i_219_ * i;
		for (int i_222_ = 0; i_222_ < i_216_; i_222_++) {
			if (i_222_ < i_214_) {
				int i_223_ = i_217_ + i_218_ * i_222_;
				for (int i_224_ = 0; i_224_ < i; i_224_++) {
					for (int i_225_ = 0; i_225_ < i_219_; i_225_++)
						fs_221_[(i_224_ * i_219_ + i_215_ * i_222_ * i_219_ + i_225_)] = fs[i_224_ * i_219_ + i_223_ + i_225_];
				}
				float[] fs_226_ = new float[i_219_];
				for (int i_227_ = 0; i_227_ < i_219_; i_227_++)
					fs_226_[i_227_] = fs[i_227_ + ((i - 1) * i_219_ + i_223_)];
				for (int i_228_ = i; i_228_ < i_215_; i_228_++) {
					for (int i_229_ = 0; i_229_ < i_219_; i_229_++)
						fs_221_[(i_222_ * i_215_ * i_219_ + i_228_ * i_219_ + i_229_)] = fs_226_[i_229_];
				}
			} else {
				int i_230_ = (i_214_ - 1) * i_215_ * i_219_;
				for (int i_231_ = 0; i_231_ < i_215_; i_231_++) {
					for (int i_232_ = 0; i_232_ < i_219_; i_232_++)
						fs_221_[i_232_ + (i_219_ * i_231_ + i_215_ * i_222_ * i_219_)] = fs_221_[i_232_ + (i_231_ * i_219_ + i_230_)];
				}
			}
		}
		return fs_221_;
	}

	public abstract void method3214(int i, int i_233_, int i_234_, int i_235_);

	abstract void method3215(float f, float f_236_, float f_237_, float f_238_, float f_239_, float f_240_);

	public void method3216(int[] is) {
		if (null != aClass171_Sub1_2073) {
			is[0] = aClass171_Sub1_2073.method2728();
			is[1] = aClass171_Sub1_2073.method2729();
		} else {
			int[] is_241_ = is;
			is[1] = 0;
			is_241_[0] = 0;
		}
	}

	public abstract Class143 method3217();

	public abstract Class143 method3218();

	public abstract void method3219();

	public abstract Class143 method3220();

	public abstract Class172 method3221(int[] is);

	public abstract int method3222(int i, int i_242_);

	abstract void method3223(int i, int i_243_) throws Exception_Sub1;

	abstract void method3224(int i, int i_244_) throws Exception_Sub1;

	public abstract void method3225();

	public abstract Class147 method3226(int i, int i_245_, int i_246_, int i_247_, boolean bool);

	public abstract void method3227();

	abstract void method3228();

	public abstract void method3229();

	abstract void method3230();

	public abstract void method3231(int i, int i_248_, int i_249_, int i_250_, int i_251_, int i_252_, int i_253_);

	public abstract void method3232(Class432 class432, Class169 class169, Class439 class439);

	public abstract void method3233(int i);

	public abstract void method3234(Class182 class182);

	public abstract void method3235(int i);

	public Class527_Sub16 method3236(int i, int i_254_, int i_255_, int i_256_, int i_257_, float f) {
		return new Class527_Sub16(i, i_254_, i_255_, i_256_, i_257_, f);
	}

	public abstract boolean method3237();

	public abstract boolean method3238();

	public abstract boolean method3239();

	public abstract boolean method3240();

	public abstract boolean method3241();

	public void method3242() {
		/* empty */
	}

	public abstract boolean method3243();

	public abstract boolean method3244();

	public abstract boolean method3245();

	public abstract void method3246(long l);

	public abstract boolean method3247();

	public abstract boolean method3248();

	public abstract boolean method3249();

	public abstract boolean method3250();

	public abstract boolean method3251();

	public abstract boolean method3252();

	public Class147 method3253(int[] is, int i, int i_258_, int i_259_, int i_260_) {
		return method3162(is, i, i_258_, i_259_, i_260_, true);
	}

	public abstract String method3254();

	public byte[] method3255(int i, int i_261_, int i_262_, int i_263_, byte[] is, int i_264_, int i_265_, int i_266_) {
		byte[] is_267_ = new byte[i_263_ * i_262_ * i_266_];
		if (i_265_ == 0)
			i_265_ = i_266_ * i;
		for (int i_268_ = 0; i_268_ < i_263_; i_268_++) {
			if (i_268_ < i_261_) {
				int i_269_ = i_265_ * i_268_ + i_264_;
				for (int i_270_ = 0; i_270_ < i; i_270_++) {
					for (int i_271_ = 0; i_271_ < i_266_; i_271_++)
						is_267_[(i_270_ * i_266_ + i_266_ * (i_268_ * i_262_) + i_271_)] = is[i_266_ * i_270_ + i_269_ + i_271_];
				}
				byte[] is_272_ = new byte[i_266_];
				for (int i_273_ = 0; i_273_ < i_266_; i_273_++)
					is_272_[i_273_] = is[i_273_ + (i_266_ * (i - 1) + i_269_)];
				for (int i_274_ = i; i_274_ < i_262_; i_274_++) {
					for (int i_275_ = 0; i_275_ < i_266_; i_275_++)
						is_267_[(i_266_ * (i_262_ * i_268_) + i_266_ * i_274_ + i_275_)] = is_272_[i_275_];
				}
			} else {
				int i_276_ = (i_261_ - 1) * i_262_ * i_266_;
				for (int i_277_ = 0; i_277_ < i_262_; i_277_++) {
					for (int i_278_ = 0; i_278_ < i_266_; i_278_++)
						is_267_[i_278_ + (i_266_ * (i_268_ * i_262_) + i_277_ * i_266_)] = is_267_[i_278_ + (i_266_ * i_277_ + i_276_)];
				}
			}
		}
		return is_267_;
	}

	public abstract int[] method3256();

	public abstract void method3257(boolean bool);

	public abstract void method3258(boolean bool);

	public void finalize() {
		method3081((byte) 43);
	}

	public abstract int[] method3259(int i, int i_279_, int i_280_, int i_281_);

	public abstract int[] method3260(int i, int i_282_, int i_283_, int i_284_);

	public abstract void method3261();

	public void method3262(int[] is) {
		if (null != aClass171_Sub1_2073) {
			is[0] = aClass171_Sub1_2073.method2728();
			is[1] = aClass171_Sub1_2073.method2729();
		} else {
			int[] is_285_ = is;
			is[1] = 0;
			is_285_[0] = 0;
		}
	}

	void method3263() {
		method3081((byte) 69);
	}

	public abstract boolean method3264();

	public abstract boolean method3265();

	public abstract void method3266(int i, int i_286_, int[] is, int[] is_287_);

	public abstract void method3267(int i);

	public abstract Class172 method3268(int[] is);

	public final void method3269(int i, int i_288_, int i_289_, int i_290_, int i_291_, int i_292_) {
		method3134(i, i_288_, i_289_, i_290_, i_291_, 1);
	}

	public abstract Class142 method3270(int i, int i_293_, int[] is, int[] is_294_);

	public abstract Class147 method3271(Class185 class185, boolean bool);

	public abstract void method3272(int i, int i_295_, int i_296_);

	public abstract void method3273();

	public abstract long method3274(int i, int i_297_);

	public abstract long method3275(int i, int i_298_);

	public abstract void method3276(long l);

	public abstract void method3277(int i, float f, float f_299_, float f_300_, float f_301_, float f_302_);

	public abstract void method3278(int i, int i_303_, int[] is, int[] is_304_);

	public abstract void method3279(boolean bool);

	public abstract void method3280(boolean bool);

	public abstract void method3281(boolean bool);

	public abstract void method3282(boolean bool);

	public abstract void method3283(int i, int i_305_, int i_306_, int i_307_);

	public abstract int[] method3284();

	public final Class171 method3285(int i) {
		return aClass171_2080;
	}

	public abstract void method3286(int[] is);

	public abstract void method3287(int[] is);

	public byte[] method3288(int i, int i_308_, int i_309_, int i_310_, byte[] is, int i_311_, int i_312_, int i_313_, int i_314_) {
		byte[] is_315_ = new byte[i_310_ * i_309_ * i_313_];
		if (i_312_ == 0)
			i_312_ = i_313_ * i;
		for (int i_316_ = 0; i_316_ < i_310_; i_316_++) {
			if (i_316_ < i_308_) {
				int i_317_ = i_312_ * i_316_ + i_311_;
				for (int i_318_ = 0; i_318_ < i; i_318_++) {
					for (int i_319_ = 0; i_319_ < i_313_; i_319_++)
						is_315_[(i_318_ * i_313_ + i_313_ * (i_316_ * i_309_) + i_319_)] = is[i_313_ * i_318_ + i_317_ + i_319_];
				}
				byte[] is_320_ = new byte[i_313_];
				for (int i_321_ = 0; i_321_ < i_313_; i_321_++)
					is_320_[i_321_] = is[i_321_ + (i_313_ * (i - 1) + i_317_)];
				for (int i_322_ = i; i_322_ < i_309_; i_322_++) {
					for (int i_323_ = 0; i_323_ < i_313_; i_323_++)
						is_315_[(i_313_ * (i_309_ * i_316_) + i_313_ * i_322_ + i_323_)] = is_320_[i_323_];
				}
			} else {
				int i_324_ = (i_308_ - 1) * i_309_ * i_313_;
				for (int i_325_ = 0; i_325_ < i_309_; i_325_++) {
					for (int i_326_ = 0; i_326_ < i_313_; i_326_++)
						is_315_[i_326_ + (i_313_ * (i_316_ * i_309_) + i_325_ * i_313_)] = is_315_[i_326_ + (i_313_ * i_325_ + i_324_)];
				}
			}
		}
		return is_315_;
	}

	public abstract void method3289(float f, float f_327_);

	public abstract void method3290(float f, float f_328_);

	public abstract void method3291(Class427 class427);

	public abstract void method3292();

	public abstract void method3293();

	public abstract void method3294();

	public abstract boolean method3295();

	public abstract void method3296();

	public abstract void method3297(int i, int i_329_);

	public abstract Class527_Sub27 method3298(int i);

	public abstract void method3299(int i, int i_330_, float f, int i_331_, int i_332_, float f_333_, int i_334_, int i_335_, float f_336_, int i_337_, int i_338_, int i_339_, int i_340_);

	public abstract Class172 method3300(int[] is);

	public abstract void method3301(int i, int i_341_, int i_342_, int i_343_, int i_344_, int i_345_);

	public abstract void method3302(float f);

	public abstract void method3303(int i, int i_346_, int i_347_, int i_348_, int i_349_, int i_350_);

	public abstract int method3304();

	abstract void method3305(int i, int i_351_, int i_352_, int i_353_, int i_354_);

	abstract void method3306(int i, int i_355_, int i_356_, int i_357_, int i_358_);

	public final void method3307(Canvas canvas, int i, int i_359_) {
		Class171_Sub1 class171_sub1 = (Class171_Sub1) aHashtable2082.get(canvas);
		if (null == class171_sub1)
			throw new RuntimeException("");
		class171_sub1.method14728(i, i_359_);
	}

	public abstract void method3308();

	public abstract void method3309(int i, Class178 class178);

	abstract void method3310();

	public static void method3311(Canvas canvas) {
		try {
			Class var_class = Class.forName("java.awt.Canvas");
			Method method = var_class.getMethod("setIgnoreRepaint", new Class[] { Boolean.TYPE });
			method.invoke(canvas, new Object[] { Boolean.TRUE });
		} catch (Exception exception) {
			/* empty */
		}
	}

	public abstract void method3312(int i, int i_360_, int i_361_, int i_362_, int i_363_, int i_364_, int i_365_, int i_366_, int i_367_);

	public abstract void method3313(int i, int i_368_, int i_369_, int i_370_, int i_371_, int i_372_, Class142 class142, int i_373_, int i_374_);

	public abstract void method3314(int i, int i_375_, int i_376_, int i_377_);

	public abstract void method3315(int i, int i_378_, int i_379_, int i_380_, int i_381_, int i_382_, int i_383_);

	public abstract boolean method3316();

	public abstract int method3317(int i, int i_384_, int i_385_, int i_386_, int i_387_, int i_388_);

	abstract boolean method3318(int i, int i_389_, int i_390_, int i_391_, Class432 class432, Class439 class439);

	abstract boolean method3319(int i, int i_392_, int i_393_, int i_394_, Class432 class432, Class439 class439);

	abstract boolean method3320(int i, int i_395_, int i_396_, int i_397_, Class432 class432, Class439 class439);

	public abstract Class147 method3321(int i, int i_398_, boolean bool, boolean bool_399_);

	public abstract Class527_Sub27 method3322(int i);

	public abstract void method3323(Class527_Sub27 class527_sub27);

	public abstract Class179 method3324(int i);

	public abstract void method3325(Class527_Sub27 class527_sub27);

	public abstract Class147 method3326(int i, int i_400_, boolean bool, boolean bool_401_);

	public abstract void method3327(float f, float f_402_);

	void method3328() {
		method3081((byte) 32);
	}

	public abstract Class147 method3329(int[] is, int i, int i_403_, int i_404_, int i_405_, boolean bool);

	public abstract Class147 method3330(Class185 class185, boolean bool);

	public abstract Class147 method3331(Class185 class185, boolean bool);

	public abstract Class147 method3332(Class185 class185, boolean bool);

	public abstract void method3333(float f, float f_406_, float f_407_, float[] fs);

	public abstract Class147 method3334(int i, int i_408_, int i_409_, int i_410_, boolean bool);

	public abstract boolean method3335();

	public abstract Class142 method3336(int i, int i_411_, int[] is, int[] is_412_);

	public abstract void method3337(int i, Class142 class142, int i_413_, int i_414_);

	public abstract Class174 method3338(Class22 class22, Class185[] class185s, boolean bool);

	public abstract void method3339(boolean bool);

	public final void method3340(Canvas canvas, int i, int i_415_) {
		Class171_Sub1 class171_sub1 = (Class171_Sub1) aHashtable2082.get(canvas);
		if (null == class171_sub1)
			throw new RuntimeException("");
		class171_sub1.method14728(i, i_415_);
	}

	public abstract void method3341(int i);

	public abstract void method3342(int i);

	public abstract void method3343(int i);

	public abstract void method3344(int i, Class527_Sub16[] class527_sub16s);

	public abstract int method3345(int i, int i_416_);

	public abstract int method3346(int i, int i_417_);

	public abstract int method3347(int i, int i_418_);

	public abstract void method3348(int i, int i_419_, int i_420_, int i_421_, int i_422_, int i_423_);

	abstract boolean method3349(int i, int i_424_, int i_425_, int i_426_, Class432 class432, Class439 class439);

	abstract void method3350(int i, int i_427_) throws Exception_Sub1;

	public abstract void method3351(float f, float f_428_, float f_429_, float f_430_, float f_431_);

	public abstract Class161 method3352(int i, int i_432_, int[][] is, int[][] is_433_, int i_434_, int i_435_, int i_436_);

	public abstract Class161 method3353(int i, int i_437_, int[][] is, int[][] is_438_, int i_439_, int i_440_, int i_441_);

	public abstract Class427 method3354();

	public abstract Class427 method3355();

	public abstract Class427 method3356();

	void method3357() {
		method3081((byte) 119);
	}

	public abstract Class432 method3358();

	public abstract int method3359();

	public Class527_Sub16 method3360(int i, int i_442_, int i_443_, int i_444_, int i_445_, float f) {
		return new Class527_Sub16(i, i_442_, i_443_, i_444_, i_445_, f);
	}

	public abstract void method3361(int i, int i_446_, int i_447_, int i_448_, int i_449_, int i_450_, int i_451_, int i_452_, int i_453_);

	public final void method3362(Class171_Sub2 class171_sub2) {
		if (anInt2086 * -1909117929 >= 3)
			throw new RuntimeException();
		if (anInt2086 * -1909117929 >= 0)
			aClass171_Sub2Array2087[anInt2086 * -1909117929].method2731();
		else
			aClass171_Sub1_2073.method2731();
		aClass171_2080 = aClass171_Sub2Array2087[(anInt2086 += -1346974809) * -1909117929] = class171_sub2;
		class171_sub2.method348();
	}

	public abstract void method3363(int i, Class527_Sub16[] class527_sub16s);

	public abstract Class427 method3364();

	public abstract void method3365(int i, Class527_Sub16[] class527_sub16s);

	public abstract void method3366(Class182 class182);

	public final Class171_Sub1 method3367() {
		return aClass171_Sub1_2073;
	}

	void method3368() {
		method3081((byte) 67);
	}

	public abstract void method3369(int i, int i_454_, int i_455_, int i_456_);

	public abstract Class143 method3370();

	public final void method3371(Canvas canvas, int i, int i_457_, int i_458_) {
		if (!aHashtable2082.containsKey(canvas)) {
			Class552.method9150(canvas, -1224021011);
			method3102(canvas, method3108(canvas, i, i_457_), -158912915);
		}
	}

	public abstract Class432 method3372();

	public boolean method3373() {
		return true;
	}

	public abstract boolean method3374();

	public abstract void method3375(Class427 class427);

	public abstract Class176 method3376(Class175 class175, int i, int i_459_, int i_460_, int i_461_);

	public abstract Class427 method3377();

	final void method3378(Canvas canvas, Class171_Sub1 class171_sub1) {
		if (null == class171_sub1)
			throw new RuntimeException("");
		aHashtable2082.put(canvas, class171_sub1);
	}

	public abstract void method3379(float f);

	public abstract void method3380(Class182 class182);

	public abstract boolean method3381();

	public abstract int method3382(int i, int i_462_, int i_463_, int i_464_, int i_465_, int i_466_);

	public abstract void method3383(int i, float f, float f_467_, float f_468_, float f_469_, float f_470_);

	public abstract void method3384(int i, float f, float f_471_, float f_472_, float f_473_, float f_474_);

	public abstract void method3385(int i);

	public abstract void method3386(int i, int i_475_, int i_476_);

	public abstract void method3387(int i, int i_477_, int i_478_);

	public abstract void method3388(int i, int i_479_, int i_480_);

	public abstract void method3389(int i, int i_481_, int i_482_, int i_483_);

	public abstract Class179 method3390(Class179 class179, Class179 class179_484_, float f, Class179 class179_485_);

	public abstract Class179 method3391(Class179 class179, Class179 class179_486_, float f, Class179 class179_487_);

	public abstract void method3392(Class179 class179);

	public abstract void method3393(Class179 class179);

	public abstract void method3394(int i, int i_488_, int i_489_, int i_490_);

	public abstract void method3395(int i, int i_491_, int i_492_, int i_493_, int i_494_, int i_495_);

	public void method3396() {
		/* empty */
	}

	public abstract void method3397(int i, int i_496_, int i_497_, int i_498_);

	public abstract void method3398(float f, float f_499_, float f_500_, float f_501_, float f_502_);

	public abstract Class161 method3399(int i, int i_503_, int[][] is, int[][] is_504_, int i_505_, int i_506_, int i_507_);

	public void method3400(float f, float f_508_, float f_509_, int i) {
		method3206(f, f_508_, f_509_, 0.0F, 1.0F, 1.0F);
	}

	public abstract void method3401(float f, float f_510_);

	public abstract int method3402();

	public abstract boolean method3403();

	public abstract void method3404();

	public abstract void method3405(float f, float f_511_, float f_512_, float f_513_, float f_514_);

	public abstract boolean method3406();

	public abstract void method3407(Class172 class172, float f, Class172 class172_515_, float f_516_, Class172 class172_517_, float f_518_);

	public abstract boolean method3408();

	public abstract Class179 method3409(Class179 class179, Class179 class179_519_, float f, Class179 class179_520_);

	abstract void method3410(int i, int i_521_, int i_522_, int i_523_, int i_524_);

	public abstract boolean method3411();

	public abstract boolean method3412();

	public abstract void method3413(int i, int i_525_, int i_526_, int i_527_, int i_528_, int i_529_, Class142 class142, int i_530_, int i_531_, int i_532_, int i_533_, int i_534_);

	abstract void method3414(float f, float f_535_, float f_536_, float f_537_, float f_538_, float f_539_);

	public abstract void method3415(int i, Class178 class178);

	public abstract void method3416(int i, Class178 class178);

	public abstract void method3417(int i, Class178 class178);

	public abstract void method3418(int i, Class178 class178);

	public abstract Interface21 method3419(int i, int i_540_, Class157 class157, Class184 class184, int i_541_);

	public abstract void method3420(int i, Class178 class178);

	public abstract void method3421();

	public abstract void method3422();

	abstract void method3423();

	public abstract void method3424(int i, int i_542_, float f, int i_543_, int i_544_, float f_545_, int i_546_, int i_547_, float f_548_, int i_549_, int i_550_, int i_551_, int i_552_);

	public abstract void method3425(int i, int i_553_, float f, int i_554_, int i_555_, float f_556_, int i_557_, int i_558_, float f_559_, int i_560_, int i_561_, int i_562_, int i_563_);

	public abstract void method3426(float f, float f_564_, float f_565_, float[] fs);

	public abstract void method3427(float f, float f_566_, float f_567_, float[] fs);

	public abstract void method3428(float f, float f_568_, float f_569_, float[] fs);

	public abstract void method3429(int i, int i_570_);

	public abstract Interface21 method3430(int i, int i_571_, Class157 class157, Class184 class184, int i_572_);

	public abstract Interface21 method3431(int i, int i_573_, Class157 class157, Class184 class184, int i_574_);

	public abstract Interface21 method3432(int i, int i_575_, Class157 class157, Class184 class184, int i_576_);

	public abstract void method3433(int[] is);

	public abstract Interface23 method3434(int i, int i_577_);

	public abstract Interface23 method3435(int i, int i_578_, int i_579_);

	public abstract boolean method3436();

	void method3437() {
		method3081((byte) 69);
	}

	public abstract void method3438(Class432 class432);

	public abstract void method3439(int[] is);

	public abstract Class147 method3440(int i, int i_580_, int i_581_, int i_582_, boolean bool);

	public abstract boolean method3441();

	public abstract boolean method3442();

	public abstract void method3443(float f, float f_583_);

	public abstract void method3444();

	abstract void method3445(int i, int i_584_, int i_585_, int i_586_, int i_587_);

	abstract void method3446(int i, int i_588_, int i_589_, int i_590_, int i_591_);

	public abstract void method3447(int i);

	public abstract void method3448();

	public abstract void method3449();

	public Class527_Sub16 method3450(int i, int i_592_, int i_593_, int i_594_, int i_595_, float f) {
		return new Class527_Sub16(i, i_592_, i_593_, i_594_, i_595_, f);
	}

	public static Class180 method3451(int i, Canvas canvas, Class181 class181, Interface24 interface24, Interface48 interface48, Interface46 interface46, Interface49 interface49, Class459 class459, int i_596_) {
		int i_597_ = 0;
		int i_598_ = 0;
		if (canvas != null) {
			Dimension dimension = canvas.getSize();
			i_597_ = dimension.width;
			i_598_ = dimension.height;
		}
		return method3147(i, canvas, class181, interface24, interface48, interface46, interface49, class459, i_596_, i_597_, i_598_, 483599511);
	}

	static synchronized Class180 method3452(int i, Canvas canvas, Class181 class181, Interface24 interface24, Interface48 interface48, Interface46 interface46, Interface49 interface49, Class459 class459, int i_599_, int i_600_, int i_601_) {
		if (0 == i)
			return Class25.method849(canvas, class181, interface24, interface48, interface46, interface49, i_600_, i_601_, 219321158);
		if (1 == i)
			return Class148.method2487(canvas, class181, interface24, interface48, interface46, interface49, i_599_);
		if (i == 5)
			return Class489.method7971(canvas, class181, interface24, interface48, interface46, interface49, class459, i_599_);
		if (i == 3)
			return Class423.method6723(canvas, class181, interface24, interface48, interface46, interface49, class459, i_599_);
		throw new IllegalArgumentException("");
	}

	public static boolean method3453(int i) {
		return 1 == i || i == 3 || 5 == i;
	}

	public static boolean method3454(int i) {
		return 1 == i || i == 3 || 5 == i;
	}

	public static boolean method3455(int i) {
		return 1 == i || i == 3 || 5 == i;
	}

	public static boolean method3456(int i) {
		return i == 0 || 2 == i;
	}

	public final void method3457() throws Exception_Sub1 {
		method3079(0, 0);
	}

	public final void method3458() throws Exception_Sub1 {
		method3079(0, 0);
	}

	public void method3459() {
		aBoolArray2063[anInt2064 * -397006101] = false;
		Enumeration enumeration = aHashtable2082.keys();
		while (enumeration.hasMoreElements()) {
			Canvas canvas = (Canvas) enumeration.nextElement();
			Class171_Sub1 class171_sub1 = (Class171_Sub1) aHashtable2082.get(canvas);
			class171_sub1.method129();
		}
		method3082();
	}

	public void method3460() {
		aBoolArray2063[anInt2064 * -397006101] = false;
		Enumeration enumeration = aHashtable2082.keys();
		while (enumeration.hasMoreElements()) {
			Canvas canvas = (Canvas) enumeration.nextElement();
			Class171_Sub1 class171_sub1 = (Class171_Sub1) aHashtable2082.get(canvas);
			class171_sub1.method129();
		}
		method3082();
	}

	public void method3461() {
		aBoolArray2063[anInt2064 * -397006101] = false;
		Enumeration enumeration = aHashtable2082.keys();
		while (enumeration.hasMoreElements()) {
			Canvas canvas = (Canvas) enumeration.nextElement();
			Class171_Sub1 class171_sub1 = (Class171_Sub1) aHashtable2082.get(canvas);
			class171_sub1.method129();
		}
		method3082();
	}

	public void method3462() {
		aBoolArray2063[anInt2064 * -397006101] = false;
		Enumeration enumeration = aHashtable2082.keys();
		while (enumeration.hasMoreElements()) {
			Canvas canvas = (Canvas) enumeration.nextElement();
			Class171_Sub1 class171_sub1 = (Class171_Sub1) aHashtable2082.get(canvas);
			class171_sub1.method129();
		}
		method3082();
	}

	public abstract void method3463(int i, int i_602_, int i_603_, int i_604_, int i_605_, int i_606_);

	public abstract Class171_Sub2 method3464();

	public abstract boolean method3465();

	public static void method3466(Canvas canvas) {
		try {
			Class var_class = Class.forName("java.awt.Canvas");
			Method method = var_class.getMethod("setIgnoreRepaint", new Class[] { Boolean.TYPE });
			method.invoke(canvas, new Object[] { Boolean.TRUE });
		} catch (Exception exception) {
			/* empty */
		}
	}

	public static void method3467(Canvas canvas) {
		try {
			Class var_class = Class.forName("java.awt.Canvas");
			Method method = var_class.getMethod("setIgnoreRepaint", new Class[] { Boolean.TYPE });
			method.invoke(canvas, new Object[] { Boolean.TRUE });
		} catch (Exception exception) {
			/* empty */
		}
	}

	public static void method3468(Canvas canvas) {
		try {
			Class var_class = Class.forName("java.awt.Canvas");
			Method method = var_class.getMethod("setIgnoreRepaint", new Class[] { Boolean.TYPE });
			method.invoke(canvas, new Object[] { Boolean.TRUE });
		} catch (Exception exception) {
			/* empty */
		}
	}

	public abstract boolean method3469();

	public static void method3470(Canvas canvas) {
		try {
			Class var_class = Class.forName("java.awt.Canvas");
			Method method = var_class.getMethod("setIgnoreRepaint", new Class[] { Boolean.TYPE });
			method.invoke(canvas, new Object[] { Boolean.TRUE });
		} catch (Exception exception) {
			/* empty */
		}
	}

	public final Class171 method3471() {
		return aClass171_2080;
	}

	public Class527_Sub16 method3472(int i, int i_607_, int i_608_, int i_609_, int i_610_, float f) {
		return new Class527_Sub16(i, i_607_, i_608_, i_609_, i_610_, f);
	}

	public abstract void method3473(int[] is);

	public final Class171_Sub1 method3474() {
		return aClass171_Sub1_2073;
	}

	public final void method3475(Canvas canvas, int i, int i_611_) {
		if (!aHashtable2082.containsKey(canvas)) {
			Class552.method9150(canvas, -817333620);
			method3102(canvas, method3108(canvas, i, i_611_), -158912915);
		}
	}

	public final void method3476(Canvas canvas, int i, int i_612_) {
		if (!aHashtable2082.containsKey(canvas)) {
			Class552.method9150(canvas, -740324439);
			method3102(canvas, method3108(canvas, i, i_612_), -158912915);
		}
	}

	public final void method3477(Canvas canvas, int i, int i_613_) {
		if (!aHashtable2082.containsKey(canvas)) {
			Class552.method9150(canvas, -2109902913);
			method3102(canvas, method3108(canvas, i, i_613_), -158912915);
		}
	}

	public abstract void method3478(float f);

	final void method3479(Canvas canvas, Class171_Sub1 class171_sub1) {
		if (null == class171_sub1)
			throw new RuntimeException("");
		aHashtable2082.put(canvas, class171_sub1);
	}

	public final void method3480(Canvas canvas) {
		if (aHashtable2082.containsKey(canvas)) {
			Class171_Sub1 class171_sub1 = (Class171_Sub1) aHashtable2082.get(canvas);
			class171_sub1.method129();
			aHashtable2082.remove(canvas);
		}
	}

	public final void method3481(Canvas canvas) {
		Class171_Sub1 class171_sub1 = (Class171_Sub1) aHashtable2082.get(canvas);
		if (null == class171_sub1)
			throw new RuntimeException();
		if (anInt2086 * -1909117929 > 0 || aClass171_2080 != aClass171_Sub1_2073)
			throw new RuntimeException();
		if (null != aClass171_2080)
			aClass171_2080.method2731();
		if (anInt2086 * -1909117929 < 0)
			aClass171_2080 = class171_sub1;
		aClass171_Sub1_2073 = class171_sub1;
		class171_sub1.method348();
	}

	void method3482(int i, int i_614_, int i_615_) {
		anInt2084 = i * -571023569;
		anInt2057 = i_614_ * -1077835251;
		float f = ((float) aClass171_2080.method2728() / (float) aClass171_2080.method2729());
		float f_616_ = ((float) (anInt2084 * -413349937) / (float) (anInt2057 * 2000082117));
		if (f < f_616_) {
			anInt2088 = (int) ((float) (anInt2057 * 2000082117) * f) * -1036933615;
			anInt2089 = anInt2057 * -2123776527;
		} else {
			anInt2088 = -1554481473 * anInt2084;
			anInt2089 = -1804366019 * (int) ((float) (anInt2084 * -413349937) / f);
		}
		aFloat2090 = ((float) (-731510031 * anInt2088) / (float) aClass171_2080.method2728());
		anInt2083 = ((anInt2084 * -413349937 - -731510031 * anInt2088) / 2 * -564004251);
		anInt2068 = -1524993747 * ((anInt2057 * 2000082117 - 351158293 * anInt2089) / 2);
	}

	public abstract void method3483(int i, int i_617_, int i_618_, int i_619_);

	public final void method3484(Canvas canvas, int i, int i_620_) {
		Class171_Sub1 class171_sub1 = (Class171_Sub1) aHashtable2082.get(canvas);
		if (null == class171_sub1)
			throw new RuntimeException("");
		class171_sub1.method14728(i, i_620_);
	}

	void method3485(int i, int i_621_) {
		anInt2084 = i * -571023569;
		anInt2057 = i_621_ * -1077835251;
		float f = ((float) aClass171_2080.method2728() / (float) aClass171_2080.method2729());
		float f_622_ = ((float) (anInt2084 * -413349937) / (float) (anInt2057 * 2000082117));
		if (f < f_622_) {
			anInt2088 = (int) ((float) (anInt2057 * 2000082117) * f) * -1036933615;
			anInt2089 = anInt2057 * -2123776527;
		} else {
			anInt2088 = -1554481473 * anInt2084;
			anInt2089 = -1804366019 * (int) ((float) (anInt2084 * -413349937) / f);
		}
		aFloat2090 = ((float) (-731510031 * anInt2088) / (float) aClass171_2080.method2728());
		anInt2083 = ((anInt2084 * -413349937 - -731510031 * anInt2088) / 2 * -564004251);
		anInt2068 = -1524993747 * ((anInt2057 * 2000082117 - 351158293 * anInt2089) / 2);
	}

	public final void method3486(Class171_Sub2 class171_sub2) {
		if (anInt2086 * -1909117929 >= 3)
			throw new RuntimeException();
		if (anInt2086 * -1909117929 >= 0)
			aClass171_Sub2Array2087[anInt2086 * -1909117929].method2731();
		else
			aClass171_Sub1_2073.method2731();
		aClass171_2080 = aClass171_Sub2Array2087[(anInt2086 += -1346974809) * -1909117929] = class171_sub2;
		class171_sub2.method348();
	}

	public abstract Class147 method3487(Class185 class185, boolean bool);

	public final void method3488(Class171_Sub2 class171_sub2) {
		if (-1909117929 * anInt2086 < 0 || (class171_sub2 != aClass171_Sub2Array2087[anInt2086 * -1909117929]))
			throw new RuntimeException();
		aClass171_Sub2Array2087[(anInt2086 -= -1346974809) * -1909117929 + 1] = null;
		class171_sub2.method2731();
		if (anInt2086 * -1909117929 >= 0) {
			aClass171_2080 = aClass171_Sub2Array2087[anInt2086 * -1909117929];
			aClass171_Sub2Array2087[anInt2086 * -1909117929].method348();
		} else {
			aClass171_2080 = aClass171_Sub1_2073;
			aClass171_Sub1_2073.method348();
		}
	}

	void method3489(int i, int i_623_) {
		anInt2084 = i * -571023569;
		anInt2057 = i_623_ * -1077835251;
		float f = ((float) aClass171_2080.method2728() / (float) aClass171_2080.method2729());
		float f_624_ = ((float) (anInt2084 * -413349937) / (float) (anInt2057 * 2000082117));
		if (f < f_624_) {
			anInt2088 = (int) ((float) (anInt2057 * 2000082117) * f) * -1036933615;
			anInt2089 = anInt2057 * -2123776527;
		} else {
			anInt2088 = -1554481473 * anInt2084;
			anInt2089 = -1804366019 * (int) ((float) (anInt2084 * -413349937) / f);
		}
		aFloat2090 = ((float) (-731510031 * anInt2088) / (float) aClass171_2080.method2728());
		anInt2083 = ((anInt2084 * -413349937 - -731510031 * anInt2088) / 2 * -564004251);
		anInt2068 = -1524993747 * ((anInt2057 * 2000082117 - 351158293 * anInt2089) / 2);
	}

	void method3490(int i, int i_625_) {
		anInt2084 = i * -571023569;
		anInt2057 = i_625_ * -1077835251;
		float f = ((float) aClass171_2080.method2728() / (float) aClass171_2080.method2729());
		float f_626_ = ((float) (anInt2084 * -413349937) / (float) (anInt2057 * 2000082117));
		if (f < f_626_) {
			anInt2088 = (int) ((float) (anInt2057 * 2000082117) * f) * -1036933615;
			anInt2089 = anInt2057 * -2123776527;
		} else {
			anInt2088 = -1554481473 * anInt2084;
			anInt2089 = -1804366019 * (int) ((float) (anInt2084 * -413349937) / f);
		}
		aFloat2090 = ((float) (-731510031 * anInt2088) / (float) aClass171_2080.method2728());
		anInt2083 = ((anInt2084 * -413349937 - -731510031 * anInt2088) / 2 * -564004251);
		anInt2068 = -1524993747 * ((anInt2057 * 2000082117 - 351158293 * anInt2089) / 2);
	}

	abstract Class171_Sub1 method3491(Canvas canvas, int i, int i_627_);

	public void method3492(boolean bool) {
		/* empty */
	}

	public void method3493(boolean bool) {
		/* empty */
	}

	public abstract void method3494(int[] is);

	public abstract void method3495(int[] is);

	public abstract void method3496(int i, int i_628_, int i_629_, int i_630_, int i_631_, int i_632_);

	public abstract void method3497(int[] is);

	public final void method3498(int i, int i_633_, int i_634_, int i_635_, int i_636_) {
		method3134(i, i_633_, i_634_, i_635_, i_636_, 1);
	}

	public final void method3499(int i, int i_637_, int i_638_, int i_639_, int i_640_) {
		method3348(i, i_637_, i_638_, i_639_, i_640_, 1);
	}

	public final void method3500(int i, int i_641_, int i_642_, int i_643_, int i_644_) {
		method3348(i, i_641_, i_642_, i_643_, i_644_, 1);
	}

	public final void method3501(int i, int i_645_, int i_646_, int i_647_, int i_648_) {
		method3348(i, i_645_, i_646_, i_647_, i_648_, 1);
	}

	public final void method3502(int i, int i_649_, int i_650_, int i_651_, int i_652_) {
		method3348(i, i_649_, i_650_, i_651_, i_652_, 1);
	}

	public final void method3503(int i, int i_653_, int i_654_, int i_655_) {
		method3529(i, i_653_, i_654_, i_655_, 1);
	}

	public final void method3504(int i, int i_656_, int i_657_, int i_658_) {
		method3410(i, i_656_, i_657_, i_658_, 1);
	}

	public abstract void method3505(float f);

	public final void method3506(int i, int i_659_, int i_660_, int i_661_) {
		method3410(i, i_659_, i_660_, i_661_, 1);
	}

	public final void method3507(int i, int i_662_, int i_663_, int i_664_, int i_665_) {
		method3149(i, i_662_, i_663_, i_664_, i_665_, 1);
	}

	public final void method3508(int i, int i_666_, int i_667_, int i_668_, int i_669_) {
		method3149(i, i_666_, i_667_, i_668_, i_669_, 1);
	}

	public abstract void method3509(Class182 class182);

	public boolean method3510(int i, int i_670_, Class432 class432, Class439 class439) {
		return method3349(i, i_670_, 0, 0, class432, class439);
	}

	public boolean method3511(int i, int i_671_, Class432 class432, Class439 class439) {
		return method3349(i, i_671_, 0, 0, class432, class439);
	}

	public boolean method3512(int i, int i_672_, Class432 class432, Class439 class439) {
		return method3349(i, i_672_, 0, 0, class432, class439);
	}

	public Class147 method3513(int i, int i_673_, boolean bool) {
		return method3161(i, i_673_, bool, false);
	}

	public Class147 method3514(int i, int i_674_, boolean bool) {
		return method3161(i, i_674_, bool, false);
	}

	public Class147 method3515(int[] is, int i, int i_675_, int i_676_, int i_677_) {
		return method3162(is, i, i_675_, i_676_, i_677_, true);
	}

	public Class147 method3516(int[] is, int i, int i_678_, int i_679_, int i_680_) {
		return method3162(is, i, i_678_, i_679_, i_680_, true);
	}

	public abstract boolean method3517();

	public void method3518() {
		/* empty */
	}

	public void method3519() {
		/* empty */
	}

	public void method3520() {
		/* empty */
	}

	public boolean method3521() {
		return true;
	}

	public abstract Interface23 method3522(int i, int i_681_);

	public void method3523(float f, float f_682_, float f_683_) {
		method3206(f, f_682_, f_683_, 0.0F, 1.0F, 1.0F);
	}

	public void method3524(float f, float f_684_, float f_685_) {
		method3206(f, f_684_, f_685_, 0.0F, 1.0F, 1.0F);
	}

	public void method3525(float f, float f_686_, float f_687_) {
		method3206(f, f_686_, f_687_, 0.0F, 1.0F, 1.0F);
	}

	public int[] method3526(int i, int i_688_, int i_689_, int i_690_, int[] is, int i_691_, int i_692_) {
		int[] is_693_ = new int[i_690_ * i_689_];
		if (i_692_ == 0)
			i_692_ = i;
		for (int i_694_ = 0; i_694_ < i_690_; i_694_++) {
			if (i_694_ < i_688_) {
				int i_695_ = i_691_ + i_694_ * i_692_;
				for (int i_696_ = 0; i_696_ < i; i_696_++)
					is_693_[i_696_ + i_694_ * i_689_] = is[i_695_ + i_696_];
				int i_697_ = is[i - 1 + i_695_];
				for (int i_698_ = i; i_698_ < i_689_; i_698_++)
					is_693_[i_689_ * i_694_ + i_698_] = i_697_;
			} else {
				int i_699_ = i_689_ * (i_688_ - 1);
				for (int i_700_ = 0; i_700_ < i_689_; i_700_++)
					is_693_[i_689_ * i_694_ + i_700_] = is_693_[i_700_ + i_699_];
			}
		}
		return is_693_;
	}

	public final void method3527(int i, int i_701_, int i_702_, int i_703_, int i_704_) {
		method3410(i, i_701_, i_702_, i_703_, 1);
	}

	public float[] method3528(int i, int i_705_, int i_706_, int i_707_, float[] fs, int i_708_, int i_709_, int i_710_) {
		float[] fs_711_ = new float[i_710_ * (i_706_ * i_707_)];
		if (i_709_ == 0)
			i_709_ = i_710_ * i;
		for (int i_712_ = 0; i_712_ < i_707_; i_712_++) {
			if (i_712_ < i_705_) {
				int i_713_ = i_708_ + i_709_ * i_712_;
				for (int i_714_ = 0; i_714_ < i; i_714_++) {
					for (int i_715_ = 0; i_715_ < i_710_; i_715_++)
						fs_711_[(i_714_ * i_710_ + i_706_ * i_712_ * i_710_ + i_715_)] = fs[i_714_ * i_710_ + i_713_ + i_715_];
				}
				float[] fs_716_ = new float[i_710_];
				for (int i_717_ = 0; i_717_ < i_710_; i_717_++)
					fs_716_[i_717_] = fs[i_717_ + ((i - 1) * i_710_ + i_713_)];
				for (int i_718_ = i; i_718_ < i_706_; i_718_++) {
					for (int i_719_ = 0; i_719_ < i_710_; i_719_++)
						fs_711_[(i_712_ * i_706_ * i_710_ + i_718_ * i_710_ + i_719_)] = fs_716_[i_719_];
				}
			} else {
				int i_720_ = (i_705_ - 1) * i_706_ * i_710_;
				for (int i_721_ = 0; i_721_ < i_706_; i_721_++) {
					for (int i_722_ = 0; i_722_ < i_710_; i_722_++)
						fs_711_[i_722_ + (i_710_ * i_721_ + i_706_ * i_712_ * i_710_)] = fs_711_[i_722_ + (i_721_ * i_710_ + i_720_)];
				}
			}
		}
		return fs_711_;
	}

	abstract void method3529(int i, int i_723_, int i_724_, int i_725_, int i_726_);

	public byte[] method3530(int i, int i_727_, int i_728_, int i_729_, byte[] is, int i_730_, int i_731_, int i_732_) {
		byte[] is_733_ = new byte[i_729_ * i_728_ * i_732_];
		if (i_731_ == 0)
			i_731_ = i_732_ * i;
		for (int i_734_ = 0; i_734_ < i_729_; i_734_++) {
			if (i_734_ < i_727_) {
				int i_735_ = i_731_ * i_734_ + i_730_;
				for (int i_736_ = 0; i_736_ < i; i_736_++) {
					for (int i_737_ = 0; i_737_ < i_732_; i_737_++)
						is_733_[(i_736_ * i_732_ + i_732_ * (i_734_ * i_728_) + i_737_)] = is[i_732_ * i_736_ + i_735_ + i_737_];
				}
				byte[] is_738_ = new byte[i_732_];
				for (int i_739_ = 0; i_739_ < i_732_; i_739_++)
					is_738_[i_739_] = is[i_739_ + (i_732_ * (i - 1) + i_735_)];
				for (int i_740_ = i; i_740_ < i_728_; i_740_++) {
					for (int i_741_ = 0; i_741_ < i_732_; i_741_++)
						is_733_[(i_732_ * (i_728_ * i_734_) + i_732_ * i_740_ + i_741_)] = is_738_[i_741_];
				}
			} else {
				int i_742_ = (i_727_ - 1) * i_728_ * i_732_;
				for (int i_743_ = 0; i_743_ < i_728_; i_743_++) {
					for (int i_744_ = 0; i_744_ < i_732_; i_744_++)
						is_733_[i_744_ + (i_732_ * (i_734_ * i_728_) + i_743_ * i_732_)] = is_733_[i_744_ + (i_732_ * i_743_ + i_742_)];
				}
			}
		}
		return is_733_;
	}

	public abstract void method3531(int i, int i_745_, int i_746_, int i_747_, int i_748_, int i_749_, int i_750_);

	public void method3532() {
		/* empty */
	}

	public abstract Class172 method3533(int[] is);

	public abstract Class147 method3534(int i, int i_751_, boolean bool, boolean bool_752_);

	public abstract void method3535(int i);

	public abstract void method3536(Class432 class432, Class169 class169, Class439 class439);

	static final void method3537(Class243 class243, Class240 class240, Class665 class665, short i) {
		class243.anInt2541 = 726714582;
		class243.aClass308_2513 = null;
		class243.anInt2542 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) * -174092741;
		if (-927924265 * class243.anInt2675 == -1 && !class240.aBool2394)
			Class207.method3844(class243.anInt2504 * -254728301, 1723717944);
	}

	static final void method3538(Class665 class665, byte i) {
		Class527_Sub36 class527_sub36 = ((Class527_Sub36) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]));
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class527_sub36.anInt10675 * -424734829;
	}

	static final void method3539(Class665 class665, byte i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4384, client.aClass109_11066.aClass2_1367, (byte) 55);
		class527_sub15.buffer.writeByte(Class208_Sub18.method15632(string, (byte) -117), 619295587);
		class527_sub15.buffer.writeString(string, -1522314532);
		client.aClass109_11066.method1969(class527_sub15, (byte) 1);
	}

	static final void method3540(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.anInt11198 * 1065289977;
	}

	static final void method3541(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class144_Sub1.aClass671_8995.method87();
	}

	public static void method3542(String string, Throwable throwable, int i) {
		try {
			String string_753_ = "";
			if (null != throwable)
				string_753_ = Class279.method5177(throwable, (short) 8534);
			if (string != null) {
				if (null != throwable)
					string_753_ = new StringBuilder().append(string_753_).append(" | ").toString();
				string_753_ = new StringBuilder().append(string_753_).append(string).toString();
			}
			Class695_Sub3.method17381(string_753_, 1544191536);
			string_753_ = Class166.method2669(string_753_, (byte) -95);
			URL url = null;
			if (null != RuntimeException_Sub1.anApplet12044)
				url = RuntimeException_Sub1.anApplet12044.getCodeBase();
			else if (RuntimeException_Sub1.anInterface60_12045 != null)
				url = RuntimeException_Sub1.anInterface60_12045.method375(1803810373);
			if (null != url) {
				String string_754_ = "Unknown";
				String string_755_ = "1.1";
				try {
					string_754_ = System.getProperty("java.vendor");
					string_755_ = System.getProperty("java.version");
				} catch (Exception exception) {
					/* empty */
				}
				URL url_756_ = (new URL(url, new StringBuilder().append("clienterror.ws?c=").append(1162135809 * RuntimeException_Sub1.anInt12042).append("&cs=").append(1757037323 * RuntimeException_Sub1.anInt12040).append("&u=").append(null != RuntimeException_Sub1.aString12047 ? Class166.method2669((RuntimeException_Sub1.aString12047), (byte) -105) : new StringBuilder().append("").append(RuntimeException_Sub1.aLong12041 * 2966339287679300477L).toString()).append("&v1=")
						.append(Class166.method2669(string_754_, (byte) -20)).append("&v2=").append(Class166.method2669(string_755_, (byte) -88)).append("&e=").append(string_753_).toString()));
				DataInputStream datainputstream = new DataInputStream(url_756_.openStream());
				datainputstream.read();
				datainputstream.close();
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
