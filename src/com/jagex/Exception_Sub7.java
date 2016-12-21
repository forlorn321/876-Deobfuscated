/* Exception_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Exception_Sub7 extends Exception {
	public Exception_Sub7(String string) {
		super(string);
	}

	public static int method10552(int i, int i_0_) {
		Class279 class279 = (Class279) Class262.aMap2848.get(Integer.valueOf(i));
		if (null == class279)
			return 0;
		return class279.method3758(-880668486);
	}

	static final void method10553(Class668 class668, byte i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_1_, -689214737);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class251.anInt2572 * -712740187;
	}
}
