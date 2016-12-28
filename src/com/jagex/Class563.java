/* Class563 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Stack;

public class Class563 {
	Class564 aClass564_7579;
	static Stack aStack7580 = new Stack();
	boolean aBool7581;
	public Class649_Sub1 aClass649_Sub1_7582;

	public static void method6866() {
		synchronized (aStack7580) {
			aStack7580 = new Stack();
		}
	}

	public boolean method6867(Class167 class167, int i, int i_0_, byte i_1_) {
		int i_2_ = aClass649_Sub1_7582.method9954(-1237432603);
		if (null != aClass649_Sub1_7582.aClass178Array10842) {
			for (int i_3_ = 0; i_3_ < aClass649_Sub1_7582.aClass178Array10842.length; i_3_++) {
				aClass649_Sub1_7582.aClass178Array10842[i_3_].anInt1940 <<= i_2_;
				if ((aClass649_Sub1_7582.aClass178Array10842[i_3_].method2629(i + aClass564_7579.anInt7585 * -983725355, i_0_ + -1403508185 * aClass564_7579.anInt7583)) && aClass649_Sub1_7582.method9939(class167, i, i_0_, (byte) 42)) {
					aClass649_Sub1_7582.aClass178Array10842[i_3_].anInt1940 >>= i_2_;
					return true;
				}
				aClass649_Sub1_7582.aClass178Array10842[i_3_].anInt1940 >>= i_2_;
			}
		}
		return false;
	}

	Class563() {
		/* empty */
	}

	static final void method6868(Class668 class668, int i) {
		int i_4_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_4_);
		Class234 class234 = Class463.aClass234Array5227[i_4_ >> 16];
		Class198.method2873(class251, class234, class668, Class233.aClass233_2374, (byte) 15);
	}

	static final void method6869(Class668 class668, byte i) {
		if (Class707.aBool8822) {
			Class697[] class697s = Class385.method4841((byte) -48);
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class697s.length;
		} else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	public static String method6870(Class536_Sub18_Sub9 class536_sub18_sub9, int i) {
		if (Class70.aBool752 || class536_sub18_sub9 == null)
			return "";
		return class536_sub18_sub9.aString11716;
	}

	static final void method6871(Class668 class668, int i) {
		int i_5_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_5_);
		Class234 class234 = Class463.aClass234Array5227[i_5_ >> 16];
		Class42.method878(class251, class234, class668, 339311983);
	}
}
