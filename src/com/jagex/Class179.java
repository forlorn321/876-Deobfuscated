/* Class179 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class179 {
	Class179() {
		/* empty */
	}

	static final void method3070(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class392.method6484(class243, class240, class665, -1250237075);
	}

	static final void method3071(Class665 class665, byte i) {
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub21_10638, (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) == 1 ? 1 : 0, 1879618806);
		Class631.method10465(1113728022);
		client.aBool11020 = false;
	}

	static int method3072(char c, Class671 class671, int i) {
		int i_0_ = c << 4;
		if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
			c = Character.toLowerCase(c);
			i_0_ = 1 + (c << 4);
		}
		if (241 == c && Class671.aClass671_8578 == class671)
			i_0_ = 1762;
		return i_0_;
	}

	static void method3073(Class665 class665, byte i) {
		class665.anIntArray8525[1769813785 * class665.anInt8526 - 2] = (((Class259) Class590.aClass62_Sub1_7793.method81((class665.anIntArray8525[((1769813785 * class665.anInt8526) - 2)]), 385644742)).anIntArrayArray2844[class665.anIntArray8525[class665.anInt8526 * 1769813785 - 1]][0]);
		class665.anInt8526 -= 102380841;
	}

	static final void method3074(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub10_10611.method16937(-1928547371) ? 1 : 0;
	}
}
