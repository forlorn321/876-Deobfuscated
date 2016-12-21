/* Class445 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class445 {
	public static void method5397(Class436 class436, Class436 class436_0_, Class436 class436_1_, float f, Class436[] class436s) {
		Class436 class436_2_ = Class436.method5252(class436, class436_1_);
		float f_3_ = Class436.method5254(class436_2_, class436_2_) - f * f;
		float f_4_ = Class436.method5254(class436_0_, class436_2_);
		float f_5_ = f_4_ * f_4_ - f_3_;
		if (f_5_ < 0.0F) {
			Class436[] class436s_6_ = class436s;
			class436s[1] = null;
			class436s_6_[0] = null;
		} else if (f_5_ >= 9.765625E-4F) {
			float f_7_ = (float) Math.sqrt((double) f_5_);
			class436s[0] = Class436.method5238();
			class436s[0].method5272(class436);
			class436s[0].method5248(Class436.method5281(Class436.method5240(class436_0_), -f_4_ - f_7_));
			class436s[1] = Class436.method5238();
			class436s[1].method5272(class436);
			class436s[1].method5248(Class436.method5281(Class436.method5240(class436_0_), -f_4_ + f_7_));
		} else {
			class436s[0] = Class436.method5238();
			class436s[0].method5272(class436);
			class436s[0].method5248(Class436.method5281(Class436.method5240(class436_0_), -f_4_));
			class436s[1] = null;
		}
	}

	Class445() throws Throwable {
		throw new Error();
	}
}
