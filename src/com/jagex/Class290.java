/* Class290 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class290 {
	static Class290 aClass290_3216;
	boolean aBool3217;
	static Class290 aClass290_3218;
	static Class290 aClass290_3219;
	public static Class290 aClass290_3220;
	public int anInt3221;
	public static Class290 aClass290_3222 = new Class290(0, false);
	public static Class426 aClass426_3223;

	static {
		aClass290_3220 = new Class290(1, false);
		aClass290_3218 = new Class290(2, true);
		aClass290_3219 = new Class290(3, true);
		aClass290_3216 = new Class290(4, true);
	}

	public boolean method3922(short i) {
		return aBool3217;
	}

	Class290(int i, boolean bool) {
		anInt3221 = i * 302312877;
		aBool3217 = bool;
	}

	public boolean method3923() {
		return aBool3217;
	}

	public boolean method3924() {
		return aBool3217;
	}

	static final void method3925(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aClass62_11940.method1047((byte) 16);
	}

	static final void method3926(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		if (1542697723 * client.anInt11074 == 3) {
			int i_7_ = Class95.anInt1156 * -1482773169;
			int[] is = Class95.anIntArray1157;
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
				Player class649_sub1_sub5_sub1_sub2 = client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i_8_]];
				if (class649_sub1_sub5_sub1_sub2 != null)
					class649_sub1_sub5_sub1_sub2.method10884(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, (byte) -65);
			}
			for (int i_9_ = 0; i_9_ < -664631943 * client.anInt11053; i_9_++) {
				int i_10_ = client.anIntArray11211[i_9_];
				Class536_Sub13 class536_sub13 = ((Class536_Sub13) client.aClass4_11050.method556((long) i_10_));
				if (null != class536_sub13)
					((Class649_Sub1_Sub5_Sub1) class536_sub13.anObject10468).method10884(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, (byte) -101);
			}
		}
	}
}
