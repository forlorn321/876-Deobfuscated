/* Class618 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class618 {
	int anInt8083;
	Class630 aClass630_8084;
	boolean aBool8085;
	int anInt8086 = 0;
	static final int anInt8087 = 2000000000;
	int anInt8088;
	static int sceneY;
	static Class143 aClass143_8090;
	static Class2 aClass2_8091;

	public int method7370() {
		return 251044957 * anInt8083;
	}

	public int method7371(int i) {
		return -209628249 * anInt8086;
	}

	public void method7372(int i) {
		anInt8088 = i * 1008270269;
	}

	public int method7373(Class674 class674, int i) {
		if (class674 == Class674.aClass674_8582 && aClass630_8084.method7505(-1362787557) && aClass630_8084.method7517(65535)) {
			int i_0_ = aClass630_8084.method7506(781063856);
			if (!aBool8085)
				i_0_ /= 10;
			if (anInt8086 * -209628249 > i_0_)
				return i_0_;
		}
		return anInt8086 * -209628249;
	}

	public int method7374(byte i) {
		return 251044957 * anInt8083;
	}

	public int method7375(Class674 class674, byte i) {
		if (Class674.aClass674_8582 == class674 && aClass630_8084.method7505(-1156811320) && aClass630_8084.method7517(65535)) {
			int i_1_ = aClass630_8084.method7503(-325590966);
			if (anInt8083 * 251044957 > i_1_)
				return i_1_;
		}
		return anInt8083 * 251044957;
	}

	public void method7376(int i, int i_2_) {
		anInt8088 = i * 1008270269;
	}

	void method7377(int i) {
		if (aBool8085)
			anInt8083 = aClass630_8084.method7510(anInt8086 * -209628249, 83196179) * -2106830859;
		else
			anInt8083 = aClass630_8084.method7508(-209628249 * anInt8086, 325769376) * -2106830859;
	}

	public int method7378() {
		return -209628249 * anInt8086;
	}

	public Class618(Class630 class630, boolean bool) {
		anInt8083 = -2106830859;
		anInt8088 = 1008270269;
		aClass630_8084 = class630;
		aBool8085 = bool;
	}

	public void method7379(int i) {
		anInt8086 = i * -1087233001;
		if (anInt8086 * -209628249 < 0)
			anInt8086 = 0;
		else if (aBool8085 && anInt8086 * -209628249 > 2000000000)
			anInt8086 = 648039424;
		else if (!aBool8085 && anInt8086 * -209628249 > 200000000)
			anInt8086 = 494300672;
		method7377(-2018086680);
	}

	public void method7380(int i, byte i_3_) {
		anInt8086 = i * -1087233001;
		if (anInt8086 * -209628249 < 0)
			anInt8086 = 0;
		else if (aBool8085 && anInt8086 * -209628249 > 2000000000)
			anInt8086 = 648039424;
		else if (!aBool8085 && anInt8086 * -209628249 > 200000000)
			anInt8086 = 494300672;
		method7377(-1781844922);
	}

	public int method7381() {
		return 251044957 * anInt8083;
	}

	public int method7382() {
		return anInt8088 * 1475188629;
	}

	public int method7383(int i) {
		return anInt8088 * 1475188629;
	}

	public int method7384() {
		return anInt8088 * 1475188629;
	}

	public int method7385() {
		return anInt8088 * 1475188629;
	}

	public int method7386() {
		return 251044957 * anInt8083;
	}

	void method7387() {
		if (aBool8085)
			anInt8083 = aClass630_8084.method7510(anInt8086 * -209628249, 1341340527) * -2106830859;
		else
			anInt8083 = aClass630_8084.method7508(-209628249 * anInt8086, 1232918171) * -2106830859;
	}

	public static void method7388(Class536_Sub42 class536_sub42, int i) {
		Class277.method3753(class536_sub42, 500000, 2130981033);
	}

	static final void method7389(Class668 class668, int i) {
		int i_4_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_4_);
		Class234 class234 = Class463.aClass234Array5227[i_4_ >> 16];
		Class315.method4210(class251, class234, class668, -25382400);
	}

	static final void method7390(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class99.method1326(class251, class234, class668, -1918680727);
	}

	static final void method7391(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.bloomSetting.method10204(1867269829) == 1 ? 1 : 0;
	}
}
