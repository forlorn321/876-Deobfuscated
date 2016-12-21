/* Class493_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class493_Sub1 extends Class493 implements Interface34 {
	int anInt10118;
	int anInt10119;
	int anInt10120;

	public void method129() {
		super.method131();
	}

	public void method275() {
		super.method275();
	}

	public void method274(Class342 class342) {
		super.method274(class342);
	}

	public void method131() {
		super.method131();
	}

	Class493_Sub1(Class167_Sub3_Sub1 class167_sub3_sub1, Class155 class155, int i, int i_0_, int i_1_, boolean bool, byte[] is) {
		super(class167_sub3_sub1, 32879, class155, Class171.aClass171_1905, i * i_0_ * i_1_, bool);
		anInt10119 = i;
		anInt10118 = i_0_;
		anInt10120 = i_1_;
		aClass167_Sub3_Sub1_5525.method8781(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(anInt5531, 0, Class167_Sub3_Sub1.method10567(aClass155_5533, aClass171_5537), anInt10119, anInt10118, anInt10120, 0, Class167_Sub3_Sub1.method10566(aClass155_5533), 5121, is, 0);
		OpenGL.glPixelStorei(3317, 4);
		if (bool)
			method230();
	}

	public void method130() {
		super.method131();
	}

	public void method276() {
		super.method275();
	}

	public void method277() {
		super.method275();
	}

	public void method278(Class342 class342) {
		super.method274(class342);
	}

	public void method279(Class342 class342) {
		super.method274(class342);
	}
}
