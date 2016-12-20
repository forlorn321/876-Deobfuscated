/* Class480_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class480_Sub3 extends Class480 implements Interface39 {
	static final int anInt10207 = 34069;

	public void method274(Class343 class343) {
		super.method273(class343);
	}

	public void method277() {
		super.method277();
	}

	public void method273(Class343 class343) {
		super.method273(class343);
	}

	public void method129() {
		super.method129();
	}

	public void method130() {
		super.method129();
	}

	Class480_Sub3(Class180_Sub2_Sub1 class180_sub2_sub1, int i, boolean bool, int[][] is) {
		super(class180_sub2_sub1, 34067, Class157.aClass157_1723, Class184.aClass184_2104, i * i * 6, bool);
		for (int i_0_ = 0; i_0_ < 6; i_0_++) {
			for (int i_1_ = 0; i_1_ < is[i_0_].length; i_1_++) {
				int i_2_ = is[i_0_][i_1_];
				is[i_0_][i_1_] = (~0xff00ff & i_2_ | (i_2_ & 0xff) << 16 | i_2_ >> 16 & 0xff);
			}
		}
		aClass180_Sub2_Sub1_5416.method14971(this);
		if (bool) {
			for (int i_3_ = 0; i_3_ < 6; i_3_++)
				method7818(34069 + i_3_, i, i, is[i_3_]);
		} else {
			for (int i_4_ = 0; i_4_ < 6; i_4_++)
				OpenGL.glTexImage2Di(34069 + i_4_, 0, Class180_Sub2_Sub1.method18015(aClass157_5413, aClass184_5409), i, i, 0, Class180_Sub2_Sub1.method18008(aClass157_5413), aClass180_Sub2_Sub1_5416.anInt11495, is[i_4_], 0);
		}
	}

	public void method275() {
		super.method277();
	}

	public void method276() {
		super.method277();
	}
}
