/* Class167 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class Class167 {
	public static final int anInt1843 = 1;
	public static final int anInt1844 = 1;
	Class183_Sub2[] aClass183_Sub2Array1845;
	public static final int anInt1846 = 3;
	public static final int anInt1847 = 5;
	protected int anInt1848;
	protected Class183 aClass183_1849;
	public int anInt1850;
	public Interface24 anInterface24_1851;
	public Class174 aClass174_1852;
	public static final int anInt1853 = 0;
	public Interface48 anInterface48_1854;
	static final int anInt1855 = 8;
	protected int anInt1856;
	public static final int anInt1857 = 2;
	protected static final int anInt1858 = 1;
	protected Hashtable aHashtable1859;
	protected static final int anInt1860 = 4;
	protected static final int anInt1861 = 8;
	protected static final int anInt1862 = 16;
	protected static final int anInt1863 = 32;
	static final int anInt1864 = 4;
	int anInt1865 = -26180443;
	protected Class183_Sub1 aClass183_Sub1_1866;
	public Interface47 anInterface47_1867;
	public static final int anInt1868 = 2;
	public static final int anInt1869 = 0;
	protected int anInt1870;
	protected static final int anInt1871 = 2;
	public int anInt1872;
	public int anInt1873;
	static boolean[] aBoolArray1874 = new boolean[8];
	protected int anInt1875;
	public float aFloat1876;

	public abstract void method2000(int i, int i_0_);

	Class167(Class174 class174, Interface24 interface24, Interface47 interface47, Interface48 interface48, Interface46 interface46) {
		aHashtable1859 = new Hashtable();
		aClass183_Sub2Array1845 = new Class183_Sub2[4];
		anInt1875 = 0;
		aFloat1876 = 0.0F;
		aClass174_1852 = class174;
		anInterface24_1851 = interface24;
		anInterface47_1867 = interface47;
		anInterface48_1854 = interface48;
		int i = -1;
		for (int i_1_ = 0; i_1_ < 8; i_1_++) {
			if (!aBoolArray1874[i_1_]) {
				aBoolArray1874[i_1_] = true;
				i = i_1_;
				break;
			}
		}
		if (i == -1)
			throw new IllegalStateException("");
		anInt1850 = 1855460457 * i;
	}

	public abstract Class145 method2001();

	public final void method2002(byte i) throws Exception_Sub5 {
		method2003(0, 0);
	}

	abstract void method2003(int i, int i_2_) throws Exception_Sub5;

	public abstract void method2004();

	public void method2005(int i) {
		aBoolArray1874[1526643673 * anInt1850] = false;
		Enumeration enumeration = aHashtable1859.keys();
		while (enumeration.hasMoreElements()) {
			Canvas canvas = (Canvas) enumeration.nextElement();
			Class183_Sub1 class183_sub1 = (Class183_Sub1) aHashtable1859.get(canvas);
			class183_sub1.method131();
		}
		method2072();
	}

	public abstract void method2006(float f);

	public abstract void method2007(int i);

	public abstract int method2008();

	public void finalize() {
		method2005(778784407);
	}

	public abstract boolean method2009();

	public abstract boolean method2010();

	public abstract boolean method2011();

	public abstract boolean method2012();

	public abstract boolean method2013();

	public abstract boolean method2014();

	public abstract boolean method2015();

	public abstract boolean method2016();

	public abstract void method2017(float f, float f_3_, float f_4_, float[] fs);

	public abstract String method2018();

	public abstract int[] method2019();

	public void method2020(int[] is) {
		if (aClass183_Sub1_1866 != null) {
			is[0] = aClass183_Sub1_1866.method2725();
			is[1] = aClass183_Sub1_1866.method2726();
		} else {
			int[] is_5_ = is;
			is[1] = 0;
			is_5_[0] = 0;
		}
	}

	public abstract void method2021(int i, Class175 class175);

	public final Class183_Sub1 method2022(int i) {
		return aClass183_Sub1_1866;
	}

	public final void method2023(Canvas canvas, int i, int i_6_, byte i_7_) {
		if (!aHashtable1859.containsKey(canvas)) {
			Class166.method1999(canvas, -1411037171);
			method2331(canvas, method2131(canvas, i, i_6_), 2024498147);
		}
	}

	public abstract void method2024(int i, int i_8_, int[] is, int[] is_9_);

	public final void method2025(Canvas canvas, int i) {
		if (aHashtable1859.containsKey(canvas)) {
			Class183_Sub1 class183_sub1 = (Class183_Sub1) aHashtable1859.get(canvas);
			class183_sub1.method131();
			aHashtable1859.remove(canvas);
		}
	}

	public final void method2026(Canvas canvas, int i) {
		Class183_Sub1 class183_sub1 = (Class183_Sub1) aHashtable1859.get(canvas);
		if (null == class183_sub1)
			throw new RuntimeException();
		if (-1380172589 * anInt1865 > 0 || aClass183_1849 != aClass183_Sub1_1866)
			throw new RuntimeException();
		if (null != aClass183_1849)
			aClass183_1849.method2727();
		if (-1380172589 * anInt1865 < 0)
			aClass183_1849 = class183_sub1;
		aClass183_Sub1_1866 = class183_sub1;
		class183_sub1.method352();
	}

	public final void method2027(Canvas canvas, int i, int i_10_, int i_11_) {
		Class183_Sub1 class183_sub1 = (Class183_Sub1) aHashtable1859.get(canvas);
		if (class183_sub1 == null)
			throw new RuntimeException("");
		class183_sub1.method8652(i, i_10_);
	}

	public final void method2028(Class183_Sub2 class183_sub2, int i) {
		if (-1380172589 * anInt1865 >= 3)
			throw new RuntimeException();
		if (anInt1865 * -1380172589 >= 0)
			aClass183_Sub2Array1845[-1380172589 * anInt1865].method2727();
		else
			aClass183_Sub1_1866.method2727();
		aClass183_1849 = aClass183_Sub2Array1845[(anInt1865 += 26180443) * -1380172589] = class183_sub2;
		class183_sub2.method352();
	}

	public final void method2029(Class183_Sub2 class183_sub2, byte i) {
		if (anInt1865 * -1380172589 < 0 || (aClass183_Sub2Array1845[-1380172589 * anInt1865] != class183_sub2))
			throw new RuntimeException();
		aClass183_Sub2Array1845[(anInt1865 -= 26180443) * -1380172589 + 1] = null;
		class183_sub2.method2727();
		if (-1380172589 * anInt1865 >= 0) {
			aClass183_1849 = aClass183_Sub2Array1845[anInt1865 * -1380172589];
			aClass183_Sub2Array1845[anInt1865 * -1380172589].method352();
		} else {
			aClass183_1849 = aClass183_Sub1_1866;
			aClass183_Sub1_1866.method352();
		}
	}

	public abstract void method2030(int i, int i_12_, float f, int i_13_, int i_14_, float f_15_, int i_16_, int i_17_, float f_18_, int i_19_, int i_20_, int i_21_, int i_22_);

	public abstract boolean method2031();

	public abstract Interface22 method2032(int i, int i_23_, Class155 class155, Class171 class171, int i_24_);

	public abstract void method2033(int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_);

	public abstract void method2034();

	public abstract boolean method2035();

	public abstract boolean method2036();

	public abstract boolean method2037();

	public abstract boolean method2038();

	public abstract void method2039(float f, float f_30_);

	public abstract void method2040();

	public abstract void method2041(int i, int i_31_, int i_32_);

	public abstract long method2042(int i, int i_33_);

	public abstract void method2043(long l);

	public abstract void method2044(int i, int i_34_, int[] is, int[] is_35_);

	void method2045(int i, int i_36_, int i_37_) {
		anInt1870 = i * 1237525955;
		anInt1848 = 1448991287 * i_36_;
		float f = ((float) aClass183_1849.method2725() / (float) aClass183_1849.method2726());
		float f_38_ = ((float) (-896601365 * anInt1870) / (float) (anInt1848 * 232979335));
		if (f < f_38_) {
			anInt1856 = (int) (f * (float) (anInt1848 * 232979335)) * 1682929299;
			anInt1875 = -976940803 * anInt1848;
		} else {
			anInt1856 = anInt1870 * -158150927;
			anInt1875 = 2008488027 * (int) ((float) (-896601365 * anInt1870) / f);
		}
		aFloat1876 = ((float) (anInt1856 * -397142117) / (float) aClass183_1849.method2725());
		anInt1872 = ((anInt1870 * -896601365 - anInt1856 * -397142117) / 2 * -274757673);
		anInt1873 = ((anInt1848 * 232979335 - anInt1875 * -915384365) / 2 * -1333618499);
	}

	public abstract void method2046(int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_);

	public abstract void method2047();

	public abstract void method2048(int i, int i_44_, int i_45_, int i_46_);

	public abstract void method2049(int[] is);

	public abstract Class143 method2050(int i, int i_47_, boolean bool, boolean bool_48_);

	public abstract void method2051();

	public abstract void method2052(int i, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_);

	abstract boolean method2053(int i, int i_55_, int i_56_, int i_57_, Class433 class433, Class437 class437);

	public abstract void method2054(int[] is);

	public abstract boolean method2055();

	public final void method2056(int i, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_) {
		method2062(i, i_58_, i_59_, i_60_, i_61_, 1);
	}

	public final void method2057(int i, int i_63_, int i_64_, int i_65_, int i_66_, short i_67_) {
		method2063(i, i_63_, i_64_, i_65_, i_66_, 1);
	}

	public abstract Class183_Sub2 method2058();

	public final void method2059(int i, int i_68_, int i_69_, int i_70_, int i_71_) {
		method2066(i, i_68_, i_69_, i_70_, 1);
	}

	public final void method2060(int i, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_) {
		method2277(i, i_72_, i_73_, i_74_, i_75_, 1);
	}

	public abstract boolean method2061();

	public abstract void method2062(int i, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_);

	public abstract void method2063(int i, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_);

	public abstract boolean method2064();

	public abstract void method2065(boolean bool);

	abstract void method2066(int i, int i_87_, int i_88_, int i_89_, int i_90_);

	abstract void method2067(int i, int i_91_, int i_92_, int i_93_, int i_94_);

	public abstract int method2068(int i, int i_95_);

	public abstract void method2069(int i, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_);

	public abstract void method2070(int i, int i_104_, int i_105_, int i_106_, int i_107_, int i_108_, Class161 class161, int i_109_, int i_110_, int i_111_, int i_112_, int i_113_);

	public abstract void method2071(int i, int i_114_);

	abstract void method2072();

	public boolean method2073(int i, int i_115_, Class433 class433, Class437 class437, int i_116_) {
		return method2318(i, i_115_, 0, 0, class433, class437);
	}

	public abstract void method2074();

	public void method2075() {
		/* empty */
	}

	public abstract Class536_Sub25 method2076(int i);

	public abstract void method2077(Class536_Sub25 class536_sub25);

	public abstract int[] method2078(int i, int i_117_, int i_118_, int i_119_);

	public abstract Interface21 method2079(int i, int i_120_, int i_121_);

	public abstract Class143 method2080(int[] is, int i, int i_122_, int i_123_, int i_124_, boolean bool);

	public Class143 method2081(int[] is, int i, int i_125_, int i_126_, int i_127_, byte i_128_) {
		return method2080(is, i, i_125_, i_126_, i_127_, true);
	}

	public abstract Class143 method2082(Class179 class179, boolean bool);

	public abstract boolean method2083();

	public void method2084() {
		/* empty */
	}

	public void method2085() {
		/* empty */
	}

	public void method2086() {
		/* empty */
	}

	public abstract Class161 method2087(int i, int i_129_, int[] is, int[] is_130_);

	public abstract void method2088(int i, Class161 class161, int i_131_, int i_132_);

	public abstract Class184 method2089(Class2 class2, Class179[] class179s, boolean bool);

	public abstract boolean method2090();

	public abstract Class433 method2091();

	public abstract void method2092(int i);

	public abstract Class177 method2093(Class180 class180, int i, int i_133_, int i_134_, int i_135_);

	public abstract Class183_Sub2 method2094();

	public final void method2095(int i, int i_136_, int i_137_, int i_138_, short i_139_) {
		method2174(i, i_136_, i_137_, i_138_, 1);
	}

	public abstract void method2096(int i, int i_140_, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_);

	public abstract Interface21 method2097(int i, int i_146_, int i_147_);

	public abstract int method2098(int i, int i_148_);

	public abstract void method2099(Class433 class433);

	public abstract Class433 method2100();

	public abstract void method2101(int i);

	public abstract void method2102(Class433 class433, Class178 class178, Class437 class437);

	public abstract Class443 method2103();

	public abstract void method2104(int i, int i_149_, int i_150_, int i_151_);

	public abstract void method2105(int i, float f, float f_152_, float f_153_, float f_154_, float f_155_);

	public abstract void method2106(int i);

	public abstract void method2107(int i, int i_156_, int i_157_);

	public abstract int method2108();

	public Class536_Sub19 method2109(int i, int i_158_, int i_159_, int i_160_, int i_161_, float f) {
		return new Class536_Sub19(i, i_158_, i_159_, i_160_, i_161_, f);
	}

	public abstract void method2110(int i, Class536_Sub19[] class536_sub19s);

	public abstract Class176 method2111(int i);

	public abstract Class176 method2112(Class176 class176, Class176 class176_162_, float f, Class176 class176_163_);

	public abstract void method2113(Class176 class176);

	public abstract void method2114(int i, int i_164_, int i_165_, int i_166_);

	public abstract void method2115(int i, int i_167_, int i_168_, int i_169_);

	public abstract boolean method2116();

	public abstract void method2117();

	public abstract void method2118(float f, float f_170_, float f_171_, float f_172_, float f_173_);

	public abstract Class168 method2119(int[] is);

	public abstract boolean method2120();

	public abstract Interface22 method2121(int i, int i_174_, Class155 class155, Class171 class171, int i_175_);

	public abstract boolean method2122();

	public abstract void method2123();

	public abstract boolean method2124();

	public void method2125(float f, float f_176_, float f_177_, byte i) {
		method2126(f, f_176_, f_177_, 0.0F, 1.0F, 1.0F);
	}

	abstract void method2126(float f, float f_178_, float f_179_, float f_180_, float f_181_, float f_182_);

	public abstract void method2127(int i, Class175 class175);

	public abstract Class433 method2128();

	public abstract Class176 method2129(int i);

	public abstract void method2130(float f, float f_183_, float f_184_, float[] fs);

	abstract Class183_Sub1 method2131(Canvas canvas, int i, int i_185_);

	abstract void method2132();

	public abstract void method2133(int i, int i_186_, int i_187_, int i_188_);

	public abstract void method2134(boolean bool);

	public abstract Class145 method2135();

	abstract void method2136(int i, int i_189_) throws Exception_Sub5;

	abstract void method2137(int i, int i_190_) throws Exception_Sub5;

	abstract void method2138(int i, int i_191_) throws Exception_Sub5;

	abstract void method2139(int i, int i_192_) throws Exception_Sub5;

	public abstract void method2140();

	public abstract void method2141();

	static synchronized Class167 method2142(int i, Canvas canvas, Class174 class174, Interface24 interface24, Interface47 interface47, Interface48 interface48, Interface46 interface46, JS5ResourceProvider class461, int i_193_, int i_194_, int i_195_, byte i_196_) {
		if (0 == i)
			return Class57.method971(canvas, class174, interface24, interface47, interface48, interface46, i_194_, i_195_, 918484402);
		if (1 == i)
			return Class152.method1854(canvas, class174, interface24, interface47, interface48, interface46, i_193_);
		if (5 == i)
			return Class487.method5863(canvas, class174, interface24, interface47, interface48, interface46, class461, i_193_);
		if (3 == i)
			return Class419.method5061(canvas, class174, interface24, interface47, interface48, interface46, class461, i_193_);
		throw new IllegalArgumentException("");
	}

	public abstract boolean method2143();

	public abstract boolean method2144();

	public abstract boolean method2145();

	public abstract void method2146(int i, int i_197_, int i_198_, int i_199_, int i_200_, int i_201_, Class161 class161, int i_202_, int i_203_, int i_204_, int i_205_, int i_206_);

	public abstract boolean method2147();

	public abstract boolean method2148();

	public abstract int method2149();

	public abstract void method2150(Class166 class166);

	public abstract boolean method2151();

	public abstract boolean method2152();

	public abstract Class168 method2153(int[] is);

	public abstract void method2154(int[] is);

	public abstract boolean method2155();

	public abstract boolean method2156();

	public abstract boolean method2157();

	public abstract boolean method2158();

	public abstract boolean method2159();

	public abstract void method2160(Class168 class168, float f, Class168 class168_207_, float f_208_, Class168 class168_209_, float f_210_);

	public abstract boolean method2161();

	public abstract Class160 method2162(int i, int i_211_, int[][] is, int[][] is_212_, int i_213_, int i_214_, int i_215_);

	public void method2163() {
		/* empty */
	}

	public abstract String method2164();

	public abstract String method2165();

	public abstract int[] method2166();

	public abstract int[] method2167();

	public abstract void method2168(boolean bool);

	abstract Class183_Sub1 method2169(Canvas canvas, int i, int i_216_);

	public abstract int[] method2170(int i, int i_217_, int i_218_, int i_219_);

	public abstract int[] method2171(int i, int i_220_, int i_221_, int i_222_);

	public abstract int[] method2172(int i, int i_223_, int i_224_, int i_225_);

	public abstract int[] method2173(int i, int i_226_, int i_227_, int i_228_);

	abstract void method2174(int i, int i_229_, int i_230_, int i_231_, int i_232_);

	public abstract void method2175();

	public abstract boolean method2176();

	public float[] method2177(int i, int i_233_, int i_234_, int i_235_, float[] fs, int i_236_, int i_237_, int i_238_, int i_239_) {
		float[] fs_240_ = new float[i_238_ * (i_235_ * i_234_)];
		if (i_237_ == 0)
			i_237_ = i * i_238_;
		for (int i_241_ = 0; i_241_ < i_235_; i_241_++) {
			if (i_241_ < i_233_) {
				int i_242_ = i_237_ * i_241_ + i_236_;
				for (int i_243_ = 0; i_243_ < i; i_243_++) {
					for (int i_244_ = 0; i_244_ < i_238_; i_244_++)
						fs_240_[i_244_ + (i_234_ * i_241_ * i_238_ + i_238_ * i_243_)] = fs[i_244_ + (i_242_ + i_238_ * i_243_)];
				}
				float[] fs_245_ = new float[i_238_];
				for (int i_246_ = 0; i_246_ < i_238_; i_246_++)
					fs_245_[i_246_] = fs[i_246_ + (i_242_ + i_238_ * (i - 1))];
				for (int i_247_ = i; i_247_ < i_234_; i_247_++) {
					for (int i_248_ = 0; i_248_ < i_238_; i_248_++)
						fs_240_[i_248_ + (i_238_ * (i_241_ * i_234_) + i_247_ * i_238_)] = fs_245_[i_248_];
				}
			} else {
				int i_249_ = i_238_ * (i_234_ * (i_233_ - 1));
				for (int i_250_ = 0; i_250_ < i_234_; i_250_++) {
					for (int i_251_ = 0; i_251_ < i_238_; i_251_++)
						fs_240_[(i_238_ * i_250_ + i_238_ * (i_241_ * i_234_) + i_251_)] = fs_240_[i_251_ + (i_249_ + i_238_ * i_250_)];
				}
			}
		}
		return fs_240_;
	}

	public abstract boolean method2178();

	public abstract boolean method2179();

	public abstract boolean method2180();

	public abstract void method2181(int i, int i_252_, float f, int i_253_, int i_254_, float f_255_, int i_256_, int i_257_, float f_258_, int i_259_, int i_260_, int i_261_, int i_262_);

	public int[] method2182(int i, int i_263_, int i_264_, int i_265_, int[] is, int i_266_, int i_267_, byte i_268_) {
		int[] is_269_ = new int[i_265_ * i_264_];
		if (0 == i_267_)
			i_267_ = i;
		for (int i_270_ = 0; i_270_ < i_265_; i_270_++) {
			if (i_270_ < i_263_) {
				int i_271_ = i_266_ + i_267_ * i_270_;
				for (int i_272_ = 0; i_272_ < i; i_272_++)
					is_269_[i_272_ + i_270_ * i_264_] = is[i_272_ + i_271_];
				int i_273_ = is[i - 1 + i_271_];
				for (int i_274_ = i; i_274_ < i_264_; i_274_++)
					is_269_[i_264_ * i_270_ + i_274_] = i_273_;
			} else {
				int i_275_ = i_264_ * (i_263_ - 1);
				for (int i_276_ = 0; i_276_ < i_264_; i_276_++)
					is_269_[i_276_ + i_270_ * i_264_] = is_269_[i_276_ + i_275_];
			}
		}
		return is_269_;
	}

	public abstract int method2183();

	public abstract int method2184();

	public abstract void method2185();

	public abstract void method2186();

	public abstract void method2187(Class168 class168, float f, Class168 class168_277_, float f_278_, Class168 class168_279_, float f_280_);

	public abstract void method2188();

	public abstract long method2189(int i, int i_281_);

	public abstract void method2190(long l);

	public abstract void method2191(long l);

	public Class536_Sub19 method2192(int i, int i_282_, int i_283_, int i_284_, int i_285_, float f) {
		return new Class536_Sub19(i, i_282_, i_283_, i_284_, i_285_, f);
	}

	public abstract Interface21 method2193(int i, int i_286_);

	public abstract Class536_Sub25 method2194(int i);

	public abstract void method2195(Class443 class443);

	public abstract void method2196(int i, int i_287_, int i_288_, int i_289_);

	abstract void method2197(int i, int i_290_, int i_291_, int i_292_, int i_293_);

	public abstract void method2198();

	public abstract void method2199();

	public abstract void method2200();

	public abstract boolean method2201();

	public void method2202() {
		/* empty */
	}

	public abstract void method2203(int[] is);

	public abstract void method2204(int[] is);

	public abstract Class143 method2205(int i, int i_294_, int i_295_, int i_296_, boolean bool);

	public abstract void method2206(float f, float f_297_);

	public abstract void method2207(float f, float f_298_);

	public abstract void method2208(float f, float f_299_);

	public abstract void method2209();

	public abstract void method2210(int i, int i_300_, int i_301_, int i_302_);

	public abstract void method2211(int i, int i_303_, int i_304_, int i_305_);

	public abstract void method2212(int i, int i_306_, int i_307_, int i_308_);

	public abstract void method2213(int i, int i_309_, int i_310_, int i_311_);

	public abstract void method2214(int i, int i_312_, int i_313_, int i_314_);

	public abstract void method2215(int i, int i_315_, int i_316_, int i_317_, int i_318_, int i_319_, int i_320_);

	public byte[] method2216(int i, int i_321_, int i_322_, int i_323_, byte[] is, int i_324_, int i_325_, int i_326_, int i_327_) {
		byte[] is_328_ = new byte[i_326_ * (i_323_ * i_322_)];
		if (0 == i_325_)
			i_325_ = i * i_326_;
		for (int i_329_ = 0; i_329_ < i_323_; i_329_++) {
			if (i_329_ < i_321_) {
				int i_330_ = i_325_ * i_329_ + i_324_;
				for (int i_331_ = 0; i_331_ < i; i_331_++) {
					for (int i_332_ = 0; i_332_ < i_326_; i_332_++)
						is_328_[i_332_ + (i_326_ * i_331_ + i_329_ * i_322_ * i_326_)] = is[i_330_ + i_331_ * i_326_ + i_332_];
				}
				byte[] is_333_ = new byte[i_326_];
				for (int i_334_ = 0; i_334_ < i_326_; i_334_++)
					is_333_[i_334_] = is[i_326_ * (i - 1) + i_330_ + i_334_];
				for (int i_335_ = i; i_335_ < i_322_; i_335_++) {
					for (int i_336_ = 0; i_336_ < i_326_; i_336_++)
						is_328_[(i_322_ * i_329_ * i_326_ + i_335_ * i_326_ + i_336_)] = is_333_[i_336_];
				}
			} else {
				int i_337_ = i_326_ * ((i_321_ - 1) * i_322_);
				for (int i_338_ = 0; i_338_ < i_322_; i_338_++) {
					for (int i_339_ = 0; i_339_ < i_326_; i_339_++)
						is_328_[(i_338_ * i_326_ + i_326_ * (i_329_ * i_322_) + i_339_)] = is_328_[i_339_ + (i_337_ + i_338_ * i_326_)];
				}
			}
		}
		return is_328_;
	}

	public abstract void method2217(int[] is);

	public abstract void method2218(int[] is);

	public abstract void method2219(int i, int i_340_);

	public abstract boolean method2220();

	public abstract void method2221(int i, int i_341_);

	public abstract void method2222(int i, int i_342_);

	public void method2223() {
		/* empty */
	}

	public abstract void method2224(int i, int i_343_, int i_344_, int i_345_, int i_346_, int i_347_, Class161 class161, int i_348_, int i_349_);

	public abstract boolean method2225();

	abstract void method2226(int i, int i_350_, int i_351_, int i_352_, int i_353_);

	abstract void method2227(int i, int i_354_, int i_355_, int i_356_, int i_357_);

	public abstract void method2228(int[] is);

	public abstract Interface21 method2229(int i, int i_358_, int i_359_);

	public abstract boolean method2230();

	public void method2231() {
		aBoolArray1874[1526643673 * anInt1850] = false;
		Enumeration enumeration = aHashtable1859.keys();
		while (enumeration.hasMoreElements()) {
			Canvas canvas = (Canvas) enumeration.nextElement();
			Class183_Sub1 class183_sub1 = (Class183_Sub1) aHashtable1859.get(canvas);
			class183_sub1.method131();
		}
		method2072();
	}

	public abstract void method2232(int i, int i_360_, int i_361_, int i_362_, int i_363_, int i_364_);

	public abstract void method2233(int i, int i_365_, int i_366_, int i_367_, int i_368_, int i_369_, int i_370_, int i_371_, int i_372_);

	public abstract void method2234(int i, int i_373_, int i_374_, int i_375_, int i_376_, int i_377_, Class161 class161, int i_378_, int i_379_);

	public abstract void method2235(int i, int i_380_, int i_381_, int i_382_);

	public abstract void method2236(int i, int i_383_, int i_384_, int i_385_, int i_386_, int i_387_, Class161 class161, int i_388_, int i_389_);

	public abstract Class433 method2237();

	public abstract void method2238(int i, int i_390_, int i_391_, int i_392_, int i_393_, int i_394_, Class161 class161, int i_395_, int i_396_, int i_397_, int i_398_, int i_399_);

	public abstract void method2239(int i, int i_400_, int i_401_, int i_402_, int i_403_, int i_404_, Class161 class161, int i_405_, int i_406_, int i_407_, int i_408_, int i_409_);

	public abstract String method2240();

	public abstract void method2241(Class433 class433);

	public abstract int method2242(int i, int i_410_, int i_411_, int i_412_, int i_413_, int i_414_);

	public abstract int method2243(int i, int i_415_, int i_416_, int i_417_, int i_418_, int i_419_);

	public abstract void method2244();

	public void method2245(boolean bool) {
		/* empty */
	}

	public abstract void method2246(Class433 class433, Class178 class178, Class437 class437);

	public abstract boolean method2247();

	public abstract void method2248(Class536_Sub25 class536_sub25);

	public void method2249(boolean bool) {
		/* empty */
	}

	abstract void method2250(int i, int i_420_, int i_421_, int i_422_, int i_423_);

	public abstract Class143 method2251(Class179 class179, boolean bool);

	public abstract Class161 method2252(int i, int i_424_, int[] is, int[] is_425_);

	public abstract void method2253(float f, float f_426_, float f_427_, float f_428_, float f_429_);

	public abstract void method2254(int i, Class161 class161, int i_430_, int i_431_);

	public abstract Class184 method2255(Class2 class2, Class179[] class179s, boolean bool);

	public abstract void method2256(int i);

	public abstract void method2257(int i, int i_432_);

	public abstract boolean method2258();

	public abstract Class177 method2259(Class180 class180, int i, int i_433_, int i_434_, int i_435_);

	public abstract void method2260(Class176 class176);

	public abstract Class177 method2261(Class180 class180, int i, int i_436_, int i_437_, int i_438_);

	public abstract int method2262(int i, int i_439_, int i_440_, int i_441_, int i_442_, int i_443_);

	public abstract int method2263(int i, int i_444_);

	public abstract int method2264(int i, int i_445_);

	public abstract int method2265(int i, int i_446_);

	public abstract void method2266(float f, float f_447_, float f_448_, float[] fs);

	public abstract Class443 method2267();

	public abstract Class433 method2268();

	public abstract int method2269();

	public Class536_Sub19 method2270(int i, int i_449_, int i_450_, int i_451_, int i_452_, float f) {
		return new Class536_Sub19(i, i_449_, i_450_, i_451_, i_452_, f);
	}

	public abstract void method2271();

	public Class536_Sub19 method2272(int i, int i_453_, int i_454_, int i_455_, int i_456_, float f) {
		return new Class536_Sub19(i, i_453_, i_454_, i_455_, i_456_, f);
	}

	public Class536_Sub19 method2273(int i, int i_457_, int i_458_, int i_459_, int i_460_, float f) {
		return new Class536_Sub19(i, i_457_, i_458_, i_459_, i_460_, f);
	}

	public Class536_Sub19 method2274(int i, int i_461_, int i_462_, int i_463_, int i_464_, float f) {
		return new Class536_Sub19(i, i_461_, i_462_, i_463_, i_464_, f);
	}

	public abstract void method2275(int i, Class536_Sub19[] class536_sub19s);

	public Class143 method2276(int i, int i_465_, boolean bool, int i_466_) {
		return method2050(i, i_465_, bool, false);
	}

	public abstract void method2277(int i, int i_467_, int i_468_, int i_469_, int i_470_, int i_471_);

	public final Class183 method2278(byte i) {
		return aClass183_1849;
	}

	public abstract void method2279(Class433 class433);

	public abstract Class143 method2280(Class179 class179, boolean bool);

	public abstract boolean method2281();

	public abstract void method2282(int i, Class175 class175);

	public abstract Class143 method2283(Class179 class179, boolean bool);

	public abstract boolean method2284();

	public abstract void method2285(Class443 class443);

	public abstract void method2286(Class443 class443);

	public abstract void method2287(float f);

	public abstract void method2288(int i);

	public abstract void method2289(int i);

	public abstract void method2290(int i);

	public abstract void method2291();

	public abstract Class176 method2292(int i);

	public abstract Class176 method2293(Class176 class176, Class176 class176_472_, float f, Class176 class176_473_);

	public abstract Class176 method2294(Class176 class176, Class176 class176_474_, float f, Class176 class176_475_);

	public abstract void method2295(Class176 class176);

	public abstract void method2296(Class176 class176);

	public void method2297(int[] is) {
		if (aClass183_Sub1_1866 != null) {
			is[0] = aClass183_Sub1_1866.method2725();
			is[1] = aClass183_Sub1_1866.method2726();
		} else {
			int[] is_476_ = is;
			is[1] = 0;
			is_476_[0] = 0;
		}
	}

	public abstract void method2298(int i, int i_477_);

	public abstract void method2299(int i, int i_478_);

	public abstract void method2300(int i, int i_479_);

	abstract void method2301(int i, int i_480_, int i_481_, int i_482_, int i_483_);

	public abstract void method2302(boolean bool);

	public abstract Class143 method2303(int i, int i_484_, int i_485_, int i_486_, boolean bool);

	public abstract Class183_Sub2 method2304();

	public abstract boolean method2305();

	public abstract boolean method2306();

	public abstract boolean method2307();

	public abstract int method2308(int i, int i_487_);

	public abstract void method2309(float f, float f_488_, float f_489_, float f_490_, float f_491_);

	public abstract void method2310(float f, float f_492_, float f_493_, float f_494_, float f_495_);

	public abstract void method2311(float f, float f_496_, float f_497_, float f_498_, float f_499_);

	public abstract Class160 method2312(int i, int i_500_, int[][] is, int[][] is_501_, int i_502_, int i_503_, int i_504_);

	public abstract boolean method2313();

	public abstract void method2314(Class168 class168, float f, Class168 class168_505_, float f_506_, Class168 class168_507_, float f_508_);

	public void method2315(int[] is) {
		if (aClass183_Sub1_1866 != null) {
			is[0] = aClass183_Sub1_1866.method2725();
			is[1] = aClass183_Sub1_1866.method2726();
		} else {
			int[] is_509_ = is;
			is[1] = 0;
			is_509_[0] = 0;
		}
	}

	public abstract boolean method2316();

	public abstract boolean method2317();

	abstract boolean method2318(int i, int i_510_, int i_511_, int i_512_, Class433 class433, Class437 class437);

	public abstract Interface21 method2319(int i, int i_513_, int i_514_);

	abstract void method2320(float f, float f_515_, float f_516_, float f_517_, float f_518_, float f_519_);

	public abstract void method2321(int i, Class175 class175);

	public abstract void method2322(int i, Class175 class175);

	public abstract void method2323(int i, Class175 class175);

	public abstract void method2324(int i);

	public abstract void method2325();

	public abstract void method2326();

	public abstract void method2327(int i, int i_520_, float f, int i_521_, int i_522_, float f_523_, int i_524_, int i_525_, float f_526_, int i_527_, int i_528_, int i_529_, int i_530_);

	public abstract void method2328(Class433 class433);

	public abstract void method2329(int i, int i_531_, float f, int i_532_, int i_533_, float f_534_, int i_535_, int i_536_, float f_537_, int i_538_, int i_539_, int i_540_, int i_541_);

	public abstract Class177 method2330(Class180 class180, int i, int i_542_, int i_543_, int i_544_);

	final void method2331(Canvas canvas, Class183_Sub1 class183_sub1, int i) {
		if (null == class183_sub1)
			throw new RuntimeException("");
		aHashtable1859.put(canvas, class183_sub1);
	}

	public abstract Class183_Sub2 method2332();

	public abstract Class143 method2333(int[] is, int i, int i_545_, int i_546_, int i_547_, boolean bool);

	public abstract void method2334(float f, float f_548_, float f_549_, float[] fs);

	public abstract Interface22 method2335(int i, int i_550_, Class155 class155, Class171 class171, int i_551_);

	public abstract Class433 method2336();

	public abstract Interface21 method2337(int i, int i_552_, int i_553_);

	public abstract Interface21 method2338(int i, int i_554_, int i_555_);

	public abstract void method2339(int i, int i_556_, int i_557_);

	public abstract boolean method2340();

	void method2341() {
		method2005(778784407);
	}

	public abstract boolean method2342();

	public abstract boolean method2343();

	public abstract boolean method2344();

	public abstract boolean method2345();

	public abstract boolean method2346();

	public abstract void method2347(boolean bool);

	public abstract void method2348(int i, int i_558_, int i_559_);

	public abstract void method2349(int i, int i_560_, int[] is, int[] is_561_);

	public abstract void method2350(int i, int i_562_, int[] is, int[] is_563_);

	public abstract void method2351(Class166 class166);

	abstract void method2352(int i, int i_564_, int i_565_, int i_566_, int i_567_);

	public abstract Class143 method2353(int[] is, int i, int i_568_, int i_569_, int i_570_, boolean bool);

	public abstract void method2354(int i, int i_571_, int i_572_, int i_573_, int i_574_, int i_575_, Class161 class161, int i_576_, int i_577_);

	public abstract Class143 method2355(int[] is, int i, int i_578_, int i_579_, int i_580_, boolean bool);

	public abstract void method2356();

	public abstract Class143 method2357(int i, int i_581_, int i_582_, int i_583_, boolean bool);

	public abstract Class443 method2358();

	public abstract void method2359(Class433 class433, Class178 class178, Class437 class437);

	public abstract int method2360();

	public abstract void method2361(int i, float f, float f_584_, float f_585_, float f_586_, float f_587_);

	public abstract void method2362(int i, float f, float f_588_, float f_589_, float f_590_, float f_591_);

	public abstract void method2363(int i, float f, float f_592_, float f_593_, float f_594_, float f_595_);

	public abstract void method2364(int i, float f, float f_596_, float f_597_, float f_598_, float f_599_);

	public abstract void method2365(int i, int i_600_, int i_601_);

	public abstract void method2366(int i, int i_602_, int i_603_);

	public abstract void method2367(Class433 class433);

	public abstract void method2368(int i, int i_604_, int i_605_, int i_606_);

	public abstract void method2369(int i, int i_607_, int i_608_, int i_609_);

	void method2370() {
		method2005(778784407);
	}

	public abstract void method2371(int i, int i_610_, int i_611_, int i_612_, int i_613_, int i_614_);

	public abstract boolean method2372();

	public abstract void method2373(int i, int i_615_, int i_616_, int i_617_);

	public abstract void method2374(int i);

	public void method2375() {
		aBoolArray1874[1526643673 * anInt1850] = false;
		Enumeration enumeration = aHashtable1859.keys();
		while (enumeration.hasMoreElements()) {
			Canvas canvas = (Canvas) enumeration.nextElement();
			Class183_Sub1 class183_sub1 = (Class183_Sub1) aHashtable1859.get(canvas);
			class183_sub1.method131();
		}
		method2072();
	}

	public void method2376() {
		aBoolArray1874[1526643673 * anInt1850] = false;
		Enumeration enumeration = aHashtable1859.keys();
		while (enumeration.hasMoreElements()) {
			Canvas canvas = (Canvas) enumeration.nextElement();
			Class183_Sub1 class183_sub1 = (Class183_Sub1) aHashtable1859.get(canvas);
			class183_sub1.method131();
		}
		method2072();
	}

	public abstract void method2377(int i);

	public abstract void method2378(int i);

	public abstract Class143 method2379(int i, int i_618_, boolean bool, boolean bool_619_);

	public abstract int method2380();

	abstract void method2381(int i, int i_620_, int i_621_, int i_622_, int i_623_);

	public abstract Class433 method2382();

	public abstract boolean method2383();

	abstract void method2384(int i, int i_624_, int i_625_, int i_626_, int i_627_);

	public final void method2385(int i, int i_628_, int i_629_, int i_630_, int i_631_) {
		method2067(i, i_628_, i_629_, i_630_, 1);
	}

	public abstract Interface21 method2386(int i, int i_632_);

	public boolean method2387(int i) {
		return true;
	}

	public abstract Class433 method2388();

	public abstract boolean method2389();

	public abstract void method2390(Class443 class443);

	public abstract Class443 method2391();

	public abstract int method2392();

	public abstract void method2393();

	public void method2394() {
		/* empty */
	}

	public abstract void method2395();

	public abstract void method2396(Class433 class433);

	public abstract void method2397(int i, int i_633_, int i_634_, int i_635_, int i_636_, int i_637_);

	public void method2398() {
		/* empty */
	}

	public void method2399() {
		/* empty */
	}

	public void method2400() {
		/* empty */
	}

	public void method2401() {
		/* empty */
	}

	public abstract void method2402(int i, int i_638_);

	public abstract void method2403();

	public abstract void method2404(int i, int i_639_);

	public abstract void method2405(Class166 class166);

	public abstract void method2406(Class166 class166);

	public abstract boolean method2407();

	public static void method2408(int i) {
		Class101.anInt1201 = 1861762603;
	}

	static final void method2409(Class668 class668, byte i) {
		int i_640_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_640_);
		Class234 class234 = Class463.aClass234Array5227[i_640_ >> 16];
		Class309.method4152(class251, class234, class668, -755391233);
	}

	public static boolean method2410(int i) {
		return Class310.aBool3471;
	}

	static final void method2411(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		class668.anInt8542 -= 61855783;
		int i_641_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		short i_642_ = (short) (class668.anIntArray8541[1 + class668.anInt8542 * 1867269829]);
		short i_643_ = (short) (class668.anIntArray8541[class668.anInt8542 * 1867269829 + 2]);
		if (i_641_ >= 0 && i_641_ < 5) {
			class251.method3481(i_641_, i_642_, i_643_, (byte) 7);
			Class668.method8011(class251, 263642117);
			if (-809980533 * class251.anInt2546 == -1 && !class234.aBool2379)
				Class536_Sub20.method9569(class251.anInt2559 * -1591767037, i_641_, (byte) 87);
		}
	}

	public static int method2412(int i) {
		return 10;
	}

	static final void method2413(Class668 class668, byte i) {
		int i_644_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (i_644_ < 0 || i_644_ > 5 || 2 == i_644_)
			i_644_ = 3;
		Class704.method8264(i_644_, false, (byte) 8);
	}

	static void method2414(int i) {
		if (Class54.method942(1617881523)) {
			if (null == Class205_Sub16.aStringArray9941)
				Class558.method6818(1551682379);
			Class105.aBool1248 = true;
			Class105.anInt1244 = 0;
			Class105.anIntArray1251 = new int[100];
			Class388.anIntArray4046 = new int[100];
			Class536_Sub22_Sub1.anIntArray11618 = new int[100];
			Class16_Sub1.anIntArray10976 = new int[100];
			for (int i_645_ = 0; i_645_ < 100; i_645_++) {
				Class105.anIntArray1251[i_645_] = ((int) (Math.random() * (double) (Class144.anInt1679 * -1804846931)) << 4) + (int) (Math.random() * 15.0);
				Class388.anIntArray4046[i_645_] = (int) (Math.random() * 350.0) << 4;
				Class536_Sub22_Sub1.anIntArray11618[i_645_] = (int) (Math.random() * 102.0) + 51;
				Class16_Sub1.anIntArray10976[i_645_] = 8 + (int) (Math.random() * 48.0);
			}
			Class271.anIntArray2887 = new int[-1804846931 * Class144.anInt1679 >> 1];
		}
	}
}
