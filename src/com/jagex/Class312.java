/* Class312 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class312 implements Interface6 {
	Class461 aClass461_3486;
	static int anInt3487;

	public Interface13 method54(int i, Interface12 interface12) {
		return new Class313(i, aClass461_3486);
	}

	Class312(Class461 class461) {
		aClass461_3486 = class461;
	}

	public Class method51(int i) {
		return com.jagex.Class313.class;
	}

	public Interface13 method53(int i, Interface12 interface12) {
		return new Class313(i, aClass461_3486);
	}

	public Interface13 method55(int i, Interface12 interface12, int i_0_) {
		return new Class313(i, aClass461_3486);
	}

	public Class method52() {
		return com.jagex.Class313.class;
	}

	static final void method4182(Class668 class668, int i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (0 != -1484801557 * client.anInt11289 && i_1_ < 1857706641 * client.anInt11293)
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = client.aClass30Array11295[i_1_].aString261;
		else
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
	}

	static final void method4183(Class668 class668, int i) {
		if (null != Class256.aClass350_2762) {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1;
			class668.aClass350_8563 = Class256.aClass350_2762;
			class668.aMap8557.put(Class458.aClass458_5165, Class262.method3643(class668.aClass350_8563, 572579010));
		} else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	static final void method4184(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}
}
