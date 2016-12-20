/* Class262 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class262 {
	Class527_Sub18[] aClass527_Sub18Array2864;
	Interface29 anInterface29_2865;
	Class14 aClass14_2866;

	public void method4930(int i, String string, Class527_Sub18 class527_sub18) {
		Class527_Sub18 class527_sub18_0_ = method4932(string, (byte) 1);
		if (null != class527_sub18_0_ && i != 1233112961 * class527_sub18_0_.anInt10475)
			throw new IllegalArgumentException(string);
		method4939(i, -1190617033);
		if (i >= aClass527_Sub18Array2864.length) {
			int i_1_;
			for (i_1_ = aClass527_Sub18Array2864.length; i >= i_1_; i_1_ += i_1_) {
				/* empty */
			}
			aClass14_2866 = new Class14(i_1_);
			for (int i_2_ = 0; i_2_ < aClass527_Sub18Array2864.length; i_2_++) {
				Class527_Sub18 class527_sub18_3_ = aClass527_Sub18Array2864[i_2_];
				if (null != class527_sub18_3_)
					aClass14_2866.method714(class527_sub18_3_, (class527_sub18_3_.aLong7106 * -8168620736534281759L));
			}
			Class527_Sub18[] class527_sub18s = new Class527_Sub18[i_1_];
			for (int i_4_ = 0; i_4_ < aClass527_Sub18Array2864.length; i_4_++)
				class527_sub18s[i_4_] = aClass527_Sub18Array2864[i_4_];
			aClass527_Sub18Array2864 = class527_sub18s;
		}
		class527_sub18.anInt10475 = i * -204443519;
		class527_sub18.aString10474 = string;
		aClass14_2866.method714(class527_sub18, anInterface29_2865.method169(string, -1661486288));
		aClass527_Sub18Array2864[i] = class527_sub18;
	}

	public Class527_Sub18 method4931(int i, short i_5_) {
		if (i >= aClass527_Sub18Array2864.length)
			return null;
		return aClass527_Sub18Array2864[i];
	}

	public Class527_Sub18 method4932(String string, byte i) {
		long l = anInterface29_2865.method169(string, -100874419);
		for (Class527_Sub18 class527_sub18 = (Class527_Sub18) aClass14_2866.method709(l); null != class527_sub18; class527_sub18 = (Class527_Sub18) aClass14_2866.method715(-1780693915)) {
			if (class527_sub18.aString10474.equals(string))
				return class527_sub18;
		}
		return null;
	}

	void method4933(int i) {
		Class527_Sub18 class527_sub18 = method4931(i, (short) 512);
		if (class527_sub18 != null) {
			class527_sub18.method8735(-1889161967);
			aClass527_Sub18Array2864[class527_sub18.anInt10475 * 1233112961] = null;
		}
	}

	public void method4934(int i, String string, Class527_Sub18 class527_sub18, int i_6_) {
		Class527_Sub18 class527_sub18_7_ = method4932(string, (byte) 1);
		if (null != class527_sub18_7_ && i != 1233112961 * class527_sub18_7_.anInt10475)
			throw new IllegalArgumentException(string);
		method4939(i, -1122160383);
		if (i >= aClass527_Sub18Array2864.length) {
			int i_8_;
			for (i_8_ = aClass527_Sub18Array2864.length; i >= i_8_; i_8_ += i_8_) {
				/* empty */
			}
			aClass14_2866 = new Class14(i_8_);
			for (int i_9_ = 0; i_9_ < aClass527_Sub18Array2864.length; i_9_++) {
				Class527_Sub18 class527_sub18_10_ = aClass527_Sub18Array2864[i_9_];
				if (null != class527_sub18_10_)
					aClass14_2866.method714(class527_sub18_10_, (class527_sub18_10_.aLong7106 * -8168620736534281759L));
			}
			Class527_Sub18[] class527_sub18s = new Class527_Sub18[i_8_];
			for (int i_11_ = 0; i_11_ < aClass527_Sub18Array2864.length; i_11_++)
				class527_sub18s[i_11_] = aClass527_Sub18Array2864[i_11_];
			aClass527_Sub18Array2864 = class527_sub18s;
		}
		class527_sub18.anInt10475 = i * -204443519;
		class527_sub18.aString10474 = string;
		aClass14_2866.method714(class527_sub18, anInterface29_2865.method169(string, 1587547846));
		aClass527_Sub18Array2864[i] = class527_sub18;
	}

	public Class527_Sub18 method4935(int i) {
		if (i >= aClass527_Sub18Array2864.length)
			return null;
		return aClass527_Sub18Array2864[i];
	}

	void method4936(int i) {
		Class527_Sub18 class527_sub18 = method4931(i, (short) 512);
		if (class527_sub18 != null) {
			class527_sub18.method8735(-1889161967);
			aClass527_Sub18Array2864[class527_sub18.anInt10475 * 1233112961] = null;
		}
	}

	public Class262(int i, Interface29 interface29) {
		int i_12_;
		for (i_12_ = 1; i_12_ < i; i_12_ += i_12_) {
			/* empty */
		}
		aClass14_2866 = new Class14(i_12_);
		aClass527_Sub18Array2864 = new Class527_Sub18[i_12_];
		anInterface29_2865 = interface29;
	}

	public Class527_Sub18 method4937(String string) {
		long l = anInterface29_2865.method169(string, 961890340);
		for (Class527_Sub18 class527_sub18 = (Class527_Sub18) aClass14_2866.method709(l); null != class527_sub18; class527_sub18 = (Class527_Sub18) aClass14_2866.method715(-2101379105)) {
			if (class527_sub18.aString10474.equals(string))
				return class527_sub18;
		}
		return null;
	}

	public Class527_Sub18 method4938(String string) {
		long l = anInterface29_2865.method169(string, 1374298287);
		for (Class527_Sub18 class527_sub18 = (Class527_Sub18) aClass14_2866.method709(l); null != class527_sub18; class527_sub18 = (Class527_Sub18) aClass14_2866.method715(559821994)) {
			if (class527_sub18.aString10474.equals(string))
				return class527_sub18;
		}
		return null;
	}

	void method4939(int i, int i_13_) {
		Class527_Sub18 class527_sub18 = method4931(i, (short) 512);
		if (class527_sub18 != null) {
			class527_sub18.method8735(-1889161967);
			aClass527_Sub18Array2864[class527_sub18.anInt10475 * 1233112961] = null;
		}
	}

	public Class527_Sub18 method4940(String string) {
		long l = anInterface29_2865.method169(string, -942497289);
		for (Class527_Sub18 class527_sub18 = (Class527_Sub18) aClass14_2866.method709(l); null != class527_sub18; class527_sub18 = (Class527_Sub18) aClass14_2866.method715(2045279598)) {
			if (class527_sub18.aString10474.equals(string))
				return class527_sub18;
		}
		return null;
	}

	public Class527_Sub18 method4941(int i) {
		if (i >= aClass527_Sub18Array2864.length)
			return null;
		return aClass527_Sub18Array2864[i];
	}

	public void method4942(int i, String string, Class527_Sub18 class527_sub18) {
		Class527_Sub18 class527_sub18_14_ = method4932(string, (byte) 1);
		if (null != class527_sub18_14_ && i != 1233112961 * class527_sub18_14_.anInt10475)
			throw new IllegalArgumentException(string);
		method4939(i, 415498558);
		if (i >= aClass527_Sub18Array2864.length) {
			int i_15_;
			for (i_15_ = aClass527_Sub18Array2864.length; i >= i_15_; i_15_ += i_15_) {
				/* empty */
			}
			aClass14_2866 = new Class14(i_15_);
			for (int i_16_ = 0; i_16_ < aClass527_Sub18Array2864.length; i_16_++) {
				Class527_Sub18 class527_sub18_17_ = aClass527_Sub18Array2864[i_16_];
				if (null != class527_sub18_17_)
					aClass14_2866.method714(class527_sub18_17_, (class527_sub18_17_.aLong7106 * -8168620736534281759L));
			}
			Class527_Sub18[] class527_sub18s = new Class527_Sub18[i_15_];
			for (int i_18_ = 0; i_18_ < aClass527_Sub18Array2864.length; i_18_++)
				class527_sub18s[i_18_] = aClass527_Sub18Array2864[i_18_];
			aClass527_Sub18Array2864 = class527_sub18s;
		}
		class527_sub18.anInt10475 = i * -204443519;
		class527_sub18.aString10474 = string;
		aClass14_2866.method714(class527_sub18, anInterface29_2865.method169(string, -1529969061));
		aClass527_Sub18Array2864[i] = class527_sub18;
	}

	static final void method4943(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class17.method743(class243, class240, class665, 572036030);
	}

	static final void method4944(Class665 class665, int i) {
		class665.anIntArray8525[1769813785 * class665.anInt8526 - 1] = (class665.aClass527_Sub21_8537.method16208(1769813785)[class665.anIntArray8525[1769813785 * class665.anInt8526 - 1]]);
	}

	public static void method4945(int i, int i_19_, float f, Interface42 interface42, byte i_20_) {
		if (Class649.aClass358_8371 != null)
			Class649.aClass358_8371.method6287(842633119).method6381(i, i_19_, f, interface42, (byte) -41);
	}

	static final void method4946(Class665 class665, byte i) {
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub31_10628, (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]), 2123036924);
		Class631.method10465(1405662167);
	}
}
