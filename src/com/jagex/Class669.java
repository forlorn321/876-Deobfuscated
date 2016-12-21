/* Class669 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Map;

public class Class669 {
	static Map aMap8566 = new HashMap();

	Class669() throws Throwable {
		throw new Error();
	}

	static final void method8012(Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		int i_0_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		boolean bool = 1 == (class668.anIntArray8541[1 + class668.anInt8542 * 1867269829]);
		if (null != Class542_Sub1.aClass4_10699) {
			Class536 class536 = Class542_Sub1.aClass4_10699.method556((long) i_0_);
			if (class536 != null && !bool)
				class536.method6484(-474541730);
			else if (class536 == null && bool) {
				class536 = new Class536();
				Class542_Sub1.aClass4_10699.method560(class536, (long) i_0_);
			}
		}
	}
}
