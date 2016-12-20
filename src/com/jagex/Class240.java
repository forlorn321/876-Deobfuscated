/* Class240 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class240 {
	public Class243[] aClass243Array2392;
	Class243[] aClass243Array2393;
	public boolean aBool2394;

	public Class243 method4383(int i) {
		if (-254728301 * aClass243Array2392[0].anInt2504 >>> 16 != i >>> 16)
			throw new IllegalArgumentException();
		return aClass243Array2392[i & 0xffff];
	}

	public Class243[] method4384(int i) {
		return (aClass243Array2393 == null ? aClass243Array2392 : aClass243Array2393);
	}

	public Class243[] method4385() {
		return (aClass243Array2393 == null ? aClass243Array2392 : aClass243Array2393);
	}

	public Class243 method4386(int i, int i_0_) {
		if (-254728301 * aClass243Array2392[0].anInt2504 >>> 16 != i >>> 16)
			throw new IllegalArgumentException();
		return aClass243Array2392[i & 0xffff];
	}

	public Class243[] method4387(int i) {
		if (null == aClass243Array2393) {
			int i_1_ = aClass243Array2392.length;
			aClass243Array2393 = new Class243[i_1_];
			System.arraycopy(aClass243Array2392, 0, aClass243Array2393, 0, aClass243Array2392.length);
		}
		return aClass243Array2393;
	}

	public Class243[] method4388() {
		return (aClass243Array2393 == null ? aClass243Array2392 : aClass243Array2393);
	}

	Class240(boolean bool, Class243[] class243s) {
		aClass243Array2392 = class243s;
		aBool2394 = bool;
	}

	public Class243[] method4389() {
		if (null == aClass243Array2393) {
			int i = aClass243Array2392.length;
			aClass243Array2393 = new Class243[i];
			System.arraycopy(aClass243Array2392, 0, aClass243Array2393, 0, aClass243Array2392.length);
		}
		return aClass243Array2393;
	}

	public Class243 method4390(int i) {
		if (-254728301 * aClass243Array2392[0].anInt2504 >>> 16 != i >>> 16)
			throw new IllegalArgumentException();
		return aClass243Array2392[i & 0xffff];
	}

	public Class243[] method4391() {
		if (null == aClass243Array2393) {
			int i = aClass243Array2392.length;
			aClass243Array2393 = new Class243[i];
			System.arraycopy(aClass243Array2392, 0, aClass243Array2393, 0, aClass243Array2392.length);
		}
		return aClass243Array2393;
	}

	static final void method4392(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class160.method2581(class243, class240, class665, -2085704870);
	}

	public static String method4393(CharSequence charsequence, int i) {
		String string = Class670.method13762(Class687.method13960(charsequence, 1440439848));
		if (null == string)
			string = "";
		return string;
	}

	static Class149[] method4394(int i) {
		return (new Class149[] { Class149.aClass149_1673, Class149.aClass149_1679, Class149.aClass149_1677, Class149.aClass149_1674, Class149.aClass149_1681, Class149.aClass149_1678, Class149.aClass149_1676 });
	}
}
