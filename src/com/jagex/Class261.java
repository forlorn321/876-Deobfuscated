/* Class261 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public abstract class Class261 {
	Class262 aClass262_2854;
	String aString2855;
	int anInt2856;
	Class262 aClass262_2857;
	int anInt2858;
	static Interface29 anInterface29_2859 = new Class268();
	protected int anInt2860 = -1637698529;
	Class265[] aClass265Array2861;
	public static String aString2862;
	static Iterator anIterator2863;

	abstract Class265 method4799(Class180_Sub2 class180_sub2, Class287 class287);

	public final void method4800(Class527_Sub18_Sub1 class527_sub18_sub1, float[] fs) {
		aClass265Array2861[1176516641 * anInt2860].method4993(class527_sub18_sub1, fs, fs.length);
	}

	public final void method4801(Class527_Sub18_Sub1 class527_sub18_sub1, int i, Interface41 interface41) {
		aClass265Array2861[anInt2860 * 1176516641].method4995(class527_sub18_sub1, i, interface41);
	}

	public abstract boolean method4802();

	public String method4803(int i) {
		return aString2855;
	}

	abstract Class527_Sub18_Sub1 method4804(Class275 class275);

	public Class265 method4805(String string, int i) throws Exception_Sub5_Sub1 {
		Class265[] class265s = aClass265Array2861;
		for (int i_0_ = 0; i_0_ < class265s.length; i_0_++) {
			Class265 class265 = class265s[i_0_];
			String string_1_ = class265.method5004(231975546);
			if (string_1_ != null && string_1_.equals(string)) {
				if (!class265.method4988())
					throw new Exception_Sub5_Sub1(string);
				return class265;
			}
		}
		throw new Exception_Sub5_Sub1(string);
	}

	public final int method4806(int i) {
		return aClass265Array2861.length;
	}

	public final void method4807(Class527_Sub18_Sub1 class527_sub18_sub1, int i, Interface41 interface41, int i_2_) {
		aClass265Array2861[anInt2860 * 1176516641].method4995(class527_sub18_sub1, i, interface41);
	}

	public int method4808(Class265 class265, byte i) {
		for (int i_3_ = 0; i_3_ < aClass265Array2861.length; i_3_++) {
			if (class265 == aClass265Array2861[i_3_])
				return i_3_;
		}
		return -1;
	}

	public Class265 method4809(int i) {
		Class265[] class265s = aClass265Array2861;
		for (int i_4_ = 0; i_4_ < class265s.length; i_4_++) {
			Class265 class265 = class265s[i_4_];
			if (class265.method4988())
				return class265;
		}
		return null;
	}

	public abstract boolean method4810(Class265 class265);

	public final void method4811(int i, Class442 class442) {
		aClass265Array2861[anInt2860 * 1176516641].method4996(i, class442.aFloat4918, class442.aFloat4915, class442.aFloat4919);
	}

	public final void method4812(Class527_Sub18_Sub1 class527_sub18_sub1, Class441 class441) {
		aClass265Array2861[anInt2860 * 1176516641].method4997(class527_sub18_sub1, class441.aFloat4913, class441.aFloat4911, class441.aFloat4912, class441.aFloat4910);
	}

	public abstract boolean method4813();

	public final void method4814(Class527_Sub18_Sub1 class527_sub18_sub1, float f, int i) {
		aClass265Array2861[anInt2860 * 1176516641].method4989(class527_sub18_sub1, f);
	}

	public final void method4815(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_5_, int i) {
		aClass265Array2861[anInt2860 * 1176516641].method4990(class527_sub18_sub1, f, f_5_);
	}

	public final void method4816(int i, float f, float f_6_, float f_7_, byte i_8_) {
		aClass265Array2861[anInt2860 * 1176516641].method4996(i, f, f_6_, f_7_);
	}

	public final void method4817(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_9_, float f_10_, float f_11_, int i) {
		aClass265Array2861[1176516641 * anInt2860].method4997(class527_sub18_sub1, f, f_9_, f_10_, f_11_);
	}

	public final void method4818(Class527_Sub18_Sub1 class527_sub18_sub1, Class441 class441) {
		aClass265Array2861[anInt2860 * 1176516641].method4997(class527_sub18_sub1, class441.aFloat4913, class441.aFloat4911, class441.aFloat4912, class441.aFloat4910);
	}

	Class261(Class180_Sub2 class180_sub2, Class272 class272) {
		aString2855 = class272.aString3133;
		anInt2858 = -56494363 * class272.aClass275Array3132.length;
		aClass262_2854 = new Class262(-716187923 * anInt2858, anInterface29_2859);
		for (int i = 0; i < -716187923 * anInt2858; i++)
			aClass262_2854.method4934(i, class272.aClass275Array3132[i].aString3149, method4897(class272.aClass275Array3132[i]), 1735804224);
		anInt2856 = -453673295 * class272.aClass275Array3130.length;
		aClass262_2857 = new Class262(anInt2856 * 90180177, anInterface29_2859);
		for (int i = 0; i < anInt2856 * 90180177; i++)
			aClass262_2857.method4934(i, class272.aClass275Array3130[i].aString3149, method4897(class272.aClass275Array3130[i]), 1898407958);
		aClass265Array2861 = new Class265[class272.aClass287Array3134.length];
		for (int i = 0; i < class272.aClass287Array3134.length; i++)
			aClass265Array2861[i] = method4799(class180_sub2, class272.aClass287Array3134[i]);
	}

	public final void method4819(Class527_Sub18_Sub1 class527_sub18_sub1, float[] fs, byte i) {
		aClass265Array2861[1176516641 * anInt2860].method4993(class527_sub18_sub1, fs, fs.length);
	}

	public final void method4820(Class527_Sub18_Sub1 class527_sub18_sub1, int i, byte i_12_) {
		float f = (float) (i >> 16 & 0xff) / 255.0F;
		float f_13_ = (float) (i >> 8 & 0xff) / 255.0F;
		float f_14_ = (float) (i & 0xff) / 255.0F;
		float f_15_ = (float) (i >> 24 & 0xff) / 255.0F;
		method4817(class527_sub18_sub1, f, f_13_, f_14_, f_15_, 2057896703);
	}

	public final void method4821(Class527_Sub18_Sub1 class527_sub18_sub1, Class427 class427, int i) {
		aClass265Array2861[anInt2860 * 1176516641].method4994(class527_sub18_sub1, class427);
	}

	public final void method4822(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_16_, float f_17_) {
		aClass265Array2861[1176516641 * anInt2860].method4991(class527_sub18_sub1, f, f_16_, f_17_);
	}

	public Class265 method4823() {
		Class265[] class265s = aClass265Array2861;
		for (int i = 0; i < class265s.length; i++) {
			Class265 class265 = class265s[i];
			if (class265.method4988())
				return class265;
		}
		return null;
	}

	public final void method4824(Class527_Sub18_Sub1 class527_sub18_sub1, Class427 class427, int i) {
		aClass265Array2861[anInt2860 * 1176516641].method5028(class527_sub18_sub1, class427);
	}

	public final void method4825(int i, float f, float f_18_, float f_19_, float f_20_, short i_21_) {
		aClass265Array2861[anInt2860 * 1176516641].method4992(i, f, f_18_, f_19_, f_20_);
	}

	public final void method4826(int i, Class442 class442, int i_22_) {
		aClass265Array2861[anInt2860 * 1176516641].method4996(i, class442.aFloat4918, class442.aFloat4915, class442.aFloat4919);
	}

	public final void method4827(int i, Class427 class427) {
		aClass265Array2861[1176516641 * anInt2860].method4999(i, class427);
	}

	public Class265 method4828(String string) throws Exception_Sub5_Sub1 {
		Class265[] class265s = aClass265Array2861;
		for (int i = 0; i < class265s.length; i++) {
			Class265 class265 = class265s[i];
			String string_23_ = class265.method5004(-1805682107);
			if (string_23_ != null && string_23_.equals(string)) {
				if (!class265.method4988())
					throw new Exception_Sub5_Sub1(string);
				return class265;
			}
		}
		throw new Exception_Sub5_Sub1(string);
	}

	public final void method4829(int i, Class427 class427, int i_24_) {
		aClass265Array2861[1176516641 * anInt2860].method4987(i, class427);
	}

	public final void method4830(int i, Class427 class427, int i_25_) {
		aClass265Array2861[anInt2860 * 1176516641].method5000(i, class427);
	}

	public final void method4831(int i, int i_26_, Interface41 interface41, byte i_27_) {
		aClass265Array2861[1176516641 * anInt2860].method5002(i, i_26_, interface41);
	}

	public int method4832(int i) {
		return anInt2856 * 90180177;
	}

	public String method4833() {
		return aString2855;
	}

	public final void method4834(int i, float[] fs, int i_28_, int i_29_) {
		aClass265Array2861[1176516641 * anInt2860].method5022(i, fs, i_28_);
	}

	public Class527_Sub18_Sub1 method4835(String string, byte i) {
		return ((Class527_Sub18_Sub1) aClass262_2857.method4932(string, (byte) 1));
	}

	public int method4836(int i) {
		return -716187923 * anInt2858;
	}

	public Class527_Sub18_Sub1 method4837(int i, int i_30_) {
		return (Class527_Sub18_Sub1) aClass262_2854.method4931(i, (short) 512);
	}

	void method4838() {
		/* empty */
	}

	public abstract void method4839();

	public abstract void method4840();

	public final Class265 method4841(int i, byte i_31_) {
		return aClass265Array2861[i];
	}

	public abstract boolean method4842();

	public final Class265 method4843(int i) {
		return (1176516641 * anInt2860 >= 0 ? aClass265Array2861[anInt2860 * 1176516641] : null);
	}

	public final void method4844(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_32_, float f_33_, float f_34_) {
		aClass265Array2861[1176516641 * anInt2860].method4997(class527_sub18_sub1, f, f_32_, f_33_, f_34_);
	}

	public String method4845() {
		return aString2855;
	}

	public Class265 method4846() {
		Class265[] class265s = aClass265Array2861;
		for (int i = 0; i < class265s.length; i++) {
			Class265 class265 = class265s[i];
			if (class265.method4988())
				return class265;
		}
		return null;
	}

	public String method4847() {
		return aString2855;
	}

	abstract Class265 method4848(Class180_Sub2 class180_sub2, Class287 class287);

	public abstract void method4849();

	public Class265 method4850(String string) throws Exception_Sub5_Sub1 {
		Class265[] class265s = aClass265Array2861;
		for (int i = 0; i < class265s.length; i++) {
			Class265 class265 = class265s[i];
			String string_35_ = class265.method5004(1556713931);
			if (string_35_ != null && string_35_.equals(string)) {
				if (!class265.method4988())
					throw new Exception_Sub5_Sub1(string);
				return class265;
			}
		}
		throw new Exception_Sub5_Sub1(string);
	}

	public final int method4851() {
		return aClass265Array2861.length;
	}

	public final int method4852() {
		return aClass265Array2861.length;
	}

	public final Class265 method4853(int i) {
		return aClass265Array2861[i];
	}

	public abstract void method4854();

	public final Class265 method4855() {
		return (1176516641 * anInt2860 >= 0 ? aClass265Array2861[anInt2860 * 1176516641] : null);
	}

	public Class527_Sub18_Sub1 method4856(int i, byte i_36_) {
		return (Class527_Sub18_Sub1) aClass262_2857.method4931(i, (short) 512);
	}

	public final void method4857(Class527_Sub18_Sub1 class527_sub18_sub1, Class427 class427) {
		aClass265Array2861[anInt2860 * 1176516641].method4994(class527_sub18_sub1, class427);
	}

	public abstract boolean method4858(Class265 class265);

	public abstract boolean method4859(Class265 class265);

	public final Class265 method4860() {
		return (1176516641 * anInt2860 >= 0 ? aClass265Array2861[anInt2860 * 1176516641] : null);
	}

	public final void method4861(int i, float f, float f_37_, float f_38_, float f_39_) {
		aClass265Array2861[anInt2860 * 1176516641].method4992(i, f, f_37_, f_38_, f_39_);
	}

	void method4862() {
		/* empty */
	}

	public final int method4863() {
		return anInt2860 * 1176516641;
	}

	public final int method4864() {
		return anInt2860 * 1176516641;
	}

	abstract Class527_Sub18_Sub1 method4865(Class275 class275);

	public final void method4866(Class527_Sub18_Sub1 class527_sub18_sub1, Class441 class441, int i) {
		aClass265Array2861[anInt2860 * 1176516641].method4997(class527_sub18_sub1, class441.aFloat4913, class441.aFloat4911, class441.aFloat4912, class441.aFloat4910);
	}

	public final void method4867(Class527_Sub18_Sub1 class527_sub18_sub1, float f) {
		aClass265Array2861[anInt2860 * 1176516641].method4989(class527_sub18_sub1, f);
	}

	public final void method4868(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_40_) {
		aClass265Array2861[anInt2860 * 1176516641].method4990(class527_sub18_sub1, f, f_40_);
	}

	public final void method4869(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_41_, float f_42_, int i) {
		aClass265Array2861[1176516641 * anInt2860].method4991(class527_sub18_sub1, f, f_41_, f_42_);
	}

	public final void method4870(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_43_) {
		aClass265Array2861[anInt2860 * 1176516641].method4990(class527_sub18_sub1, f, f_43_);
	}

	public final void method4871(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_44_, float f_45_) {
		aClass265Array2861[1176516641 * anInt2860].method4991(class527_sub18_sub1, f, f_44_, f_45_);
	}

	public final void method4872(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_46_, float f_47_) {
		aClass265Array2861[1176516641 * anInt2860].method4991(class527_sub18_sub1, f, f_46_, f_47_);
	}

	public final void method4873(int i, int i_48_, Interface41 interface41) {
		aClass265Array2861[1176516641 * anInt2860].method5002(i, i_48_, interface41);
	}

	public final void method4874(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_49_, float f_50_, float f_51_) {
		aClass265Array2861[1176516641 * anInt2860].method4997(class527_sub18_sub1, f, f_49_, f_50_, f_51_);
	}

	public abstract void method4875();

	public final void method4876(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_52_, float f_53_, float f_54_) {
		aClass265Array2861[1176516641 * anInt2860].method4997(class527_sub18_sub1, f, f_52_, f_53_, f_54_);
	}

	public abstract boolean method4877();

	public final void method4878(Class527_Sub18_Sub1 class527_sub18_sub1, Class442 class442) {
		aClass265Array2861[1176516641 * anInt2860].method4991(class527_sub18_sub1, class442.aFloat4918, class442.aFloat4915, class442.aFloat4919);
	}

	public final void method4879(Class527_Sub18_Sub1 class527_sub18_sub1, Class441 class441) {
		aClass265Array2861[anInt2860 * 1176516641].method4997(class527_sub18_sub1, class441.aFloat4913, class441.aFloat4911, class441.aFloat4912, class441.aFloat4910);
	}

	public int method4880(Class265 class265) {
		for (int i = 0; i < aClass265Array2861.length; i++) {
			if (class265 == aClass265Array2861[i])
				return i;
		}
		return -1;
	}

	public Class527_Sub18_Sub1 method4881(String string, int i) throws Exception_Sub5_Sub2 {
		Class527_Sub18_Sub1 class527_sub18_sub1 = ((Class527_Sub18_Sub1) aClass262_2854.method4932(string, (byte) 1));
		if (class527_sub18_sub1 == null)
			throw new Exception_Sub5_Sub2(string);
		return class527_sub18_sub1;
	}

	public final void method4882(Class527_Sub18_Sub1 class527_sub18_sub1, float[] fs) {
		aClass265Array2861[1176516641 * anInt2860].method4993(class527_sub18_sub1, fs, fs.length);
	}

	public final void method4883(Class527_Sub18_Sub1 class527_sub18_sub1, float[] fs) {
		aClass265Array2861[1176516641 * anInt2860].method4993(class527_sub18_sub1, fs, fs.length);
	}

	public Class527_Sub18_Sub1 method4884(String string) {
		return ((Class527_Sub18_Sub1) aClass262_2857.method4932(string, (byte) 1));
	}

	public final void method4885(Class527_Sub18_Sub1 class527_sub18_sub1, int i) {
		float f = (float) (i >> 16 & 0xff) / 255.0F;
		float f_55_ = (float) (i >> 8 & 0xff) / 255.0F;
		float f_56_ = (float) (i & 0xff) / 255.0F;
		float f_57_ = (float) (i >> 24 & 0xff) / 255.0F;
		method4817(class527_sub18_sub1, f, f_55_, f_56_, f_57_, 595176669);
	}

	public final Class265 method4886() {
		return (1176516641 * anInt2860 >= 0 ? aClass265Array2861[anInt2860 * 1176516641] : null);
	}

	public final void method4887(Class527_Sub18_Sub1 class527_sub18_sub1, Class427 class427) {
		aClass265Array2861[anInt2860 * 1176516641].method4994(class527_sub18_sub1, class427);
	}

	public final void method4888(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_58_, float f_59_, float f_60_) {
		aClass265Array2861[1176516641 * anInt2860].method4997(class527_sub18_sub1, f, f_58_, f_59_, f_60_);
	}

	public final void method4889(int i, Class427 class427) {
		aClass265Array2861[1176516641 * anInt2860].method4987(i, class427);
	}

	public final void method4890(int i, float f, float f_61_, float f_62_) {
		aClass265Array2861[anInt2860 * 1176516641].method4996(i, f, f_61_, f_62_);
	}

	public final void method4891(int i, float f, float f_63_, float f_64_) {
		aClass265Array2861[anInt2860 * 1176516641].method4996(i, f, f_63_, f_64_);
	}

	public final void method4892(int i, float f, float f_65_, float f_66_) {
		aClass265Array2861[anInt2860 * 1176516641].method4996(i, f, f_65_, f_66_);
	}

	public final void method4893(int i, float f, float f_67_, float f_68_, float f_69_) {
		aClass265Array2861[anInt2860 * 1176516641].method4992(i, f, f_67_, f_68_, f_69_);
	}

	public final void method4894(int i, float f, float f_70_, float f_71_, float f_72_) {
		aClass265Array2861[anInt2860 * 1176516641].method4992(i, f, f_70_, f_71_, f_72_);
	}

	public final void method4895(int i, float f, float f_73_, float f_74_, float f_75_) {
		aClass265Array2861[anInt2860 * 1176516641].method4992(i, f, f_73_, f_74_, f_75_);
	}

	public final void method4896(int i, float f, float f_76_, float f_77_, float f_78_) {
		aClass265Array2861[anInt2860 * 1176516641].method4992(i, f, f_76_, f_77_, f_78_);
	}

	abstract Class527_Sub18_Sub1 method4897(Class275 class275);

	public final void method4898(int i, Class442 class442) {
		aClass265Array2861[anInt2860 * 1176516641].method4996(i, class442.aFloat4918, class442.aFloat4915, class442.aFloat4919);
	}

	public int method4899(Class265 class265) {
		for (int i = 0; i < aClass265Array2861.length; i++) {
			if (class265 == aClass265Array2861[i])
				return i;
		}
		return -1;
	}

	public final void method4900(int i, Class442 class442) {
		aClass265Array2861[anInt2860 * 1176516641].method4996(i, class442.aFloat4918, class442.aFloat4915, class442.aFloat4919);
	}

	public final void method4901(int i, float[] fs, int i_79_) {
		aClass265Array2861[1176516641 * anInt2860].method5022(i, fs, i_79_);
	}

	public final void method4902(int i, float[] fs, int i_80_) {
		aClass265Array2861[1176516641 * anInt2860].method5022(i, fs, i_80_);
	}

	public final void method4903(Class527_Sub18_Sub1 class527_sub18_sub1, int i, Interface41 interface41) {
		aClass265Array2861[anInt2860 * 1176516641].method4995(class527_sub18_sub1, i, interface41);
	}

	public final void method4904(int i, Class427 class427) {
		aClass265Array2861[1176516641 * anInt2860].method4999(i, class427);
	}

	public final void method4905(int i, Class427 class427) {
		aClass265Array2861[1176516641 * anInt2860].method4999(i, class427);
	}

	public final void method4906(int i, Class427 class427) {
		aClass265Array2861[1176516641 * anInt2860].method4999(i, class427);
	}

	public final void method4907(int i, Class427 class427) {
		aClass265Array2861[1176516641 * anInt2860].method4999(i, class427);
	}

	public final void method4908(int i, Class427 class427) {
		aClass265Array2861[1176516641 * anInt2860].method4999(i, class427);
	}

	public final void method4909(int i, Class427 class427) {
		aClass265Array2861[1176516641 * anInt2860].method4987(i, class427);
	}

	public final void method4910(int i, Class427 class427) {
		aClass265Array2861[1176516641 * anInt2860].method4987(i, class427);
	}

	public final void method4911(Class527_Sub18_Sub1 class527_sub18_sub1, Class442 class442, byte i) {
		aClass265Array2861[1176516641 * anInt2860].method4991(class527_sub18_sub1, class442.aFloat4918, class442.aFloat4915, class442.aFloat4919);
	}

	public final void method4912(int i, Class427 class427) {
		aClass265Array2861[anInt2860 * 1176516641].method5000(i, class427);
	}

	public final void method4913(int i, Class427 class427) {
		aClass265Array2861[anInt2860 * 1176516641].method5000(i, class427);
	}

	public final void method4914(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_81_) {
		aClass265Array2861[anInt2860 * 1176516641].method4990(class527_sub18_sub1, f, f_81_);
	}

	public final void method4915(int i, int i_82_, Interface41 interface41) {
		aClass265Array2861[1176516641 * anInt2860].method5002(i, i_82_, interface41);
	}

	public final void method4916(int i, int i_83_, Interface41 interface41) {
		aClass265Array2861[1176516641 * anInt2860].method5002(i, i_83_, interface41);
	}

	public Class527_Sub18_Sub1 method4917(String string) throws Exception_Sub5_Sub2 {
		Class527_Sub18_Sub1 class527_sub18_sub1 = ((Class527_Sub18_Sub1) aClass262_2854.method4932(string, (byte) 1));
		if (class527_sub18_sub1 == null)
			throw new Exception_Sub5_Sub2(string);
		return class527_sub18_sub1;
	}

	public Class527_Sub18_Sub1 method4918(String string) throws Exception_Sub5_Sub2 {
		Class527_Sub18_Sub1 class527_sub18_sub1 = ((Class527_Sub18_Sub1) aClass262_2854.method4932(string, (byte) 1));
		if (class527_sub18_sub1 == null)
			throw new Exception_Sub5_Sub2(string);
		return class527_sub18_sub1;
	}

	public Class527_Sub18_Sub1 method4919(String string) throws Exception_Sub5_Sub2 {
		Class527_Sub18_Sub1 class527_sub18_sub1 = ((Class527_Sub18_Sub1) aClass262_2854.method4932(string, (byte) 1));
		if (class527_sub18_sub1 == null)
			throw new Exception_Sub5_Sub2(string);
		return class527_sub18_sub1;
	}

	public Class527_Sub18_Sub1 method4920(String string) throws Exception_Sub5_Sub2 {
		Class527_Sub18_Sub1 class527_sub18_sub1 = ((Class527_Sub18_Sub1) aClass262_2854.method4932(string, (byte) 1));
		if (class527_sub18_sub1 == null)
			throw new Exception_Sub5_Sub2(string);
		return class527_sub18_sub1;
	}

	public Class527_Sub18_Sub1 method4921(String string) {
		return ((Class527_Sub18_Sub1) aClass262_2857.method4932(string, (byte) 1));
	}

	public Class527_Sub18_Sub1 method4922(String string) {
		return ((Class527_Sub18_Sub1) aClass262_2857.method4932(string, (byte) 1));
	}

	public final void method4923(int i, Class427 class427, byte i_84_) {
		aClass265Array2861[1176516641 * anInt2860].method4999(i, class427);
	}

	public int method4924() {
		return -716187923 * anInt2858;
	}

	public final int method4925(byte i) {
		return anInt2860 * 1176516641;
	}

	static void method4926(Class579 class579, int i, int i_85_, Class665 class665, int i_86_) {
		Class527_Sub8_Sub10 class527_sub8_sub10 = Class373.method6376(class579, i, i_85_, -357767199);
		if (null == class527_sub8_sub10)
			Class619.method10213(2038506555);
		else {
			class665.anIntArray8546 = new int[class527_sub8_sub10.anInt11726 * -1228779449];
			class665.anObjectArray8524 = new Object[class527_sub8_sub10.anInt11727 * 1563313657];
			if (Class579.aClass579_7655 == class527_sub8_sub10.aClass579_11730 || (Class579.aClass579_7666 == class527_sub8_sub10.aClass579_11730) || (Class579.aClass579_7656 == class527_sub8_sub10.aClass579_11730)) {
				class665.anIntArray8546[0] = i;
				class665.anIntArray8546[1] = Class534.aClass553_7213.method9158(-1412060454);
				class665.anIntArray8546[2] = Class534.aClass553_7213.method9159(2129437532);
			} else if ((class527_sub8_sub10.aClass579_11730 == Class579.aClass579_7651) || (Class579.aClass579_7657 == class527_sub8_sub10.aClass579_11730) || (Class579.aClass579_7665 == class527_sub8_sub10.aClass579_11730) || (Class579.aClass579_7653 == class527_sub8_sub10.aClass579_11730) || (Class579.aClass579_7654 == class527_sub8_sub10.aClass579_11730))
				class665.anIntArray8546[0] = i;
			else if (Class579.aClass579_7663 == class527_sub8_sub10.aClass579_11730)
				class665.anIntArray8546[0] = class665.anInt8544 * -930758103;
			Class208_Sub17.method15631(class527_sub8_sub10, 500000, class665, -1899706435);
		}
	}

	static final void method4927(Class243 class243, Class240 class240, Class665 class665, byte i) {
		class243.anInt2533 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) * -340425963;
		Class430.method6876(class243, (byte) 110);
	}

	static final void method4928(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class249.method4659(class243, class240, false, 0, class665, (byte) 25);
	}

	static final void method4929(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}
}
