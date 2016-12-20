/* Class424 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class424 {
	public static void method6724(Class442 class442, Class442 class442_0_, Class442 class442_1_, float f, Class442[] class442s) {
		Class442 class442_2_ = Class442.method7155(class442, class442_1_);
		float f_3_ = Class442.method7145(class442_2_, class442_2_) - f * f;
		float f_4_ = Class442.method7145(class442_0_, class442_2_);
		float f_5_ = f_4_ * f_4_ - f_3_;
		if (f_5_ < 0.0F) {
			Class442[] class442s_6_ = class442s;
			class442s[1] = null;
			class442s_6_[0] = null;
		} else if (f_5_ >= 9.765625E-4F) {
			float f_7_ = (float) Math.sqrt((double) f_5_);
			class442s[0] = Class442.method7137();
			class442s[0].method7146(class442);
			class442s[0].method7219(Class442.method7168(Class442.method7139(class442_0_), -f_4_ - f_7_));
			class442s[1] = Class442.method7137();
			class442s[1].method7146(class442);
			class442s[1].method7219(Class442.method7168(Class442.method7139(class442_0_), -f_4_ + f_7_));
		} else {
			class442s[0] = Class442.method7137();
			class442s[0].method7146(class442);
			class442s[0].method7219(Class442.method7168(Class442.method7139(class442_0_), -f_4_));
			class442s[1] = null;
		}
	}

	public static void method6725(Class442 class442, Class442 class442_8_, Class442 class442_9_, float f, Class442[] class442s) {
		Class442 class442_10_ = Class442.method7155(class442, class442_9_);
		float f_11_ = Class442.method7145(class442_10_, class442_10_) - f * f;
		float f_12_ = Class442.method7145(class442_8_, class442_10_);
		float f_13_ = f_12_ * f_12_ - f_11_;
		if (f_13_ < 0.0F) {
			Class442[] class442s_14_ = class442s;
			class442s[1] = null;
			class442s_14_[0] = null;
		} else if (f_13_ >= 9.765625E-4F) {
			float f_15_ = (float) Math.sqrt((double) f_13_);
			class442s[0] = Class442.method7137();
			class442s[0].method7146(class442);
			class442s[0].method7219(Class442.method7168(Class442.method7139(class442_8_), -f_12_ - f_15_));
			class442s[1] = Class442.method7137();
			class442s[1].method7146(class442);
			class442s[1].method7219(Class442.method7168(Class442.method7139(class442_8_), -f_12_ + f_15_));
		} else {
			class442s[0] = Class442.method7137();
			class442s[0].method7146(class442);
			class442s[0].method7219(Class442.method7168(Class442.method7139(class442_8_), -f_12_));
			class442s[1] = null;
		}
	}

	Class424() throws Throwable {
		throw new Error();
	}

	public static void method6726(Class442 class442, Class442 class442_16_, Class442 class442_17_, float f, Class442[] class442s) {
		Class442 class442_18_ = Class442.method7155(class442, class442_17_);
		float f_19_ = Class442.method7145(class442_18_, class442_18_) - f * f;
		float f_20_ = Class442.method7145(class442_16_, class442_18_);
		float f_21_ = f_20_ * f_20_ - f_19_;
		if (f_21_ < 0.0F) {
			Class442[] class442s_22_ = class442s;
			class442s[1] = null;
			class442s_22_[0] = null;
		} else if (f_21_ >= 9.765625E-4F) {
			float f_23_ = (float) Math.sqrt((double) f_21_);
			class442s[0] = Class442.method7137();
			class442s[0].method7146(class442);
			class442s[0].method7219(Class442.method7168(Class442.method7139(class442_16_), -f_20_ - f_23_));
			class442s[1] = Class442.method7137();
			class442s[1].method7146(class442);
			class442s[1].method7219(Class442.method7168(Class442.method7139(class442_16_), -f_20_ + f_23_));
		} else {
			class442s[0] = Class442.method7137();
			class442s[0].method7146(class442);
			class442s[0].method7219(Class442.method7168(Class442.method7139(class442_16_), -f_20_));
			class442s[1] = null;
		}
	}
}
