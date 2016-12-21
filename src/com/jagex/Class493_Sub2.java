/* Class493_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class493_Sub2 extends Class493 implements Interface39 {
	static final int anInt10220 = 34069;

	Class493_Sub2(Class167_Sub3_Sub1 class167_sub3_sub1, int i, boolean bool, int[][] is) {
		super(class167_sub3_sub1, 34067, Class155.aClass155_1722, Class171.aClass171_1905, i * i * 6, bool);
		for (int i_0_ = 0; i_0_ < 6; i_0_++) {
			for (int i_1_ = 0; i_1_ < is[i_0_].length; i_1_++) {
				int i_2_ = is[i_0_][i_1_];
				is[i_0_][i_1_] = (~0xff00ff & i_2_ | (i_2_ & 0xff) << 16 | i_2_ >> 16 & 0xff);
			}
		}
		aClass167_Sub3_Sub1_5525.method8781(this);
		if (bool) {
			for (int i_3_ = 0; i_3_ < 6; i_3_++)
				method5975(34069 + i_3_, i, i, is[i_3_]);
		} else {
			for (int i_4_ = 0; i_4_ < 6; i_4_++)
				OpenGL.glTexImage2Di(34069 + i_4_, 0, Class167_Sub3_Sub1.method10567(aClass155_5533, aClass171_5537), i, i, 0, Class167_Sub3_Sub1.method10566(aClass155_5533), aClass167_Sub3_Sub1_5525.anInt11454, is[i_4_], 0);
		}
	}

	public void method275() {
		super.method275();
	}

	public void method276() {
		super.method275();
	}

	public void method131() {
		super.method131();
	}

	public void method130() {
		super.method131();
	}

	public void method129() {
		super.method131();
	}

	public void method278(Class342 class342) {
		super.method274(class342);
	}

	public void method277() {
		super.method275();
	}

	public void method274(Class342 class342) {
		super.method274(class342);
	}

	public void method279(Class342 class342) {
		super.method274(class342);
	}
}
