/* Class144 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class144 implements Interface19 {
	public Interface3 anInterface3_1670;

	public void method109(Class333 class333, int i, int i_0_) throws Exception_Sub7 {
		method105(class333.aClass160_3626, class333.method5841(method101(class333.aClass160_3626, 1096407173), i, (byte) -88), (byte) 19);
	}

	Class144(Class95_Sub1 class95_sub1, Class18 class18) {
		this(class95_sub1.aClass465_8985, class18);
	}

	public Class144(Class465 class465, Class18 class18) {
		anInterface3_1670 = class18;
	}

	public int method101(Class160 class160, int i) {
		return anInterface3_1670.method21(727971013 * class160.anInt1746, (byte) -16);
	}

	public Object method106(Class160 class160, int i) {
		return anInterface3_1670.method31(727971013 * class160.anInt1746, 2096697704);
	}

	public Object method117(Class160 class160) {
		return anInterface3_1670.method31(727971013 * class160.anInt1746, 1460852933);
	}

	public long method113(Class160 class160, byte i) {
		return anInterface3_1670.method15(class160.anInt1746 * 727971013, (byte) 57);
	}

	public Object method115(Class160 class160) {
		return anInterface3_1670.method31(727971013 * class160.anInt1746, 2035807480);
	}

	public void method111(Class160 class160, Object object, int i) {
		anInterface3_1670.method18(727971013 * class160.anInt1746, object, -1619550454);
	}

	public int method100(Class333 class333, short i) {
		return class333.method5839(method101(class333.aClass160_3626, 1096407173), (byte) 3);
	}

	public void method122(Class160 class160, int i) {
		anInterface3_1670.method14(class160.anInt1746 * 727971013, i, 984711688);
	}

	public int method102(Class333 class333) {
		return class333.method5839(method101(class333.aClass160_3626, 1096407173), (byte) 3);
	}

	public int method103(Class160 class160) {
		return anInterface3_1670.method21(727971013 * class160.anInt1746, (byte) -111);
	}

	public int method104(Class160 class160) {
		return anInterface3_1670.method21(727971013 * class160.anInt1746, (byte) -103);
	}

	public long method112(Class160 class160) {
		return anInterface3_1670.method15(class160.anInt1746 * 727971013, (byte) 124);
	}

	public long method108(Class160 class160) {
		return anInterface3_1670.method15(class160.anInt1746 * 727971013, (byte) 87);
	}

	public void method114(Class160 class160, long l) {
		anInterface3_1670.method35(727971013 * class160.anInt1746, l);
	}

	public Object method116(Class160 class160) {
		return anInterface3_1670.method31(727971013 * class160.anInt1746, 1774027522);
	}

	public Class144(Class95_Sub1 class95_sub1) {
		this(class95_sub1, new Class18(class95_sub1));
	}

	public void method105(Class160 class160, int i, byte i_1_) {
		anInterface3_1670.method14(class160.anInt1746 * 727971013, i, 984711688);
	}

	public void method118(Class160 class160, Object object) {
		anInterface3_1670.method18(727971013 * class160.anInt1746, object, -816077270);
	}

	public void method119(Class333 class333, int i) throws Exception_Sub7 {
		method105(class333.aClass160_3626, class333.method5841(method101(class333.aClass160_3626, 1096407173), i, (byte) -109), (byte) -35);
	}

	public void method120(Class333 class333, int i) throws Exception_Sub7 {
		method105(class333.aClass160_3626, class333.method5841(method101(class333.aClass160_3626, 1096407173), i, (byte) -84), (byte) 44);
	}

	public void method107(Class160 class160, int i) {
		anInterface3_1670.method14(class160.anInt1746 * 727971013, i, 984711688);
	}

	public void method121(Class160 class160, int i) {
		anInterface3_1670.method14(class160.anInt1746 * 727971013, i, 984711688);
	}

	public void method110(Class160 class160, long l) {
		anInterface3_1670.method35(727971013 * class160.anInt1746, l);
	}

	static final void method2384(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 80155925 * client.anInt11036 - 2014593057 * client.anInt11117;
	}

	public static void method2385(int i, byte i_2_) {
		Class25 class25 = (Class25) Class529_Sub1.aHashMap10764.get(Integer.valueOf(i));
		if (class25 == null)
			class25 = new Class25();
		class25.anInt236 = Class529_Sub1.anInt10784 * 1896267987;
		class25.anInt235 = 1656762787 * Class529_Sub1.anInt10791;
		Class529_Sub1.aHashMap10764.put(Integer.valueOf(i), class25);
	}

	static boolean method2386(int i) {
		if (16 != -1927019389 * client.anInt11048)
			return false;
		if (Class266.method5045((byte) 1) || Class472.method7739(-26319263))
			return false;
		return true;
	}

	public static String method2387(String string, int i) {
		int i_3_ = string.length();
		int i_4_ = 0;
		for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
			char c = string.charAt(i_5_);
			if ('<' == c || c == '>')
				i_4_ += 3;
		}
		StringBuilder stringbuilder = new StringBuilder(i_4_ + i_3_);
		for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
			char c = string.charAt(i_6_);
			if ('<' == c)
				stringbuilder.append("<lt>");
			else if ('>' == c)
				stringbuilder.append("<gt>");
			else
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	public static Class704[] method2388(Class709 class709, byte i) {
		int[] is = class709.method14389(1150360169);
		Class704[] class704s = new Class704[is.length >> 2];
		for (int i_7_ = 0; i_7_ < class704s.length; i_7_++) {
			Class704 class704 = new Class704();
			class704s[i_7_] = class704;
			class704.anInt8829 = is[i_7_ << 2] * 990043033;
			class704.anInt8827 = -862491263 * is[(i_7_ << 2) + 1];
			class704.anInt8828 = is[2 + (i_7_ << 2)] * -695981651;
			class704.anInt8826 = is[3 + (i_7_ << 2)] * 1184450883;
		}
		return class704s;
	}

	static final void method2389(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -192538049 * class243.anInt2527;
	}

	static void method2390(short i) {
		Class106.anInt1320 = 0;
		Class106.anInt1321 = 1830047253;
		Class106.anInt1323 = -1689365215;
		Class106.anInt1322 = 1880014929;
	}
}
