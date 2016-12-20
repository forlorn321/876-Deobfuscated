/* Class514 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Component;
import java.awt.Frame;

public class Class514 {
	Class503 aClass503_7010;
	Class527_Sub38_Sub2 aClass527_Sub38_Sub2_7011;
	protected static Frame aFrame7012;

	public Class514(Class503 class503, Class527_Sub38_Sub2 class527_sub38_sub2) {
		aClass503_7010 = class503;
		aClass527_Sub38_Sub2_7011 = class527_sub38_sub2;
	}

	public static Class553 method8491(Component component, boolean bool, int i) {
		return new Class553_Sub1(component, bool);
	}

	static final void method8492(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class47.method1238(class243, class240, class665, 246128225);
	}

	static final void method8493(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_0_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_1_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		Class243 class243 = Class447.method7260(i_0_, i_1_, 1685416776);
		Class700.method14291(-26854669);
		Class527_Sub25 class527_sub25 = client.method17815(class243);
		Class75.method1530(class243, class527_sub25.method16255((byte) 29), -43099239 * class527_sub25.anInt10512, (byte) -15);
	}

	public static int method8494(int i, int i_2_, byte i_3_) {
		int i_4_ = 0;
		for (/**/; i_2_ > 0; i_2_--) {
			i_4_ = i_4_ << 1 | i & 0x1;
			i >>>= 1;
		}
		return i_4_;
	}
}
