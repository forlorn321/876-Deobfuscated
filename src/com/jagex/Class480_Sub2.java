/* Class480_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class480_Sub2 extends Class480 implements Interface35 {
	int anInt10165;
	int anInt10166;
	int anInt10167;

	public void method273(Class343 class343) {
		super.method273(class343);
	}

	public void method277() {
		super.method277();
	}

	public void method129() {
		super.method129();
	}

	public void method275() {
		super.method277();
	}

	public void method130() {
		super.method129();
	}

	public void method276() {
		super.method277();
	}

	Class480_Sub2(Class180_Sub2_Sub1 class180_sub2_sub1, Class157 class157, int i, int i_0_, int i_1_, boolean bool, byte[] is) {
		super(class180_sub2_sub1, 32879, class157, Class184.aClass184_2104, i * i_0_ * i_1_, bool);
		anInt10166 = i;
		anInt10165 = i_0_;
		anInt10167 = i_1_;
		aClass180_Sub2_Sub1_5416.method14971(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(anInt5412, 0, Class180_Sub2_Sub1.method18015(aClass157_5413, aClass184_5409), anInt10166, anInt10165, anInt10167, 0, Class180_Sub2_Sub1.method18008(aClass157_5413), 5121, is, 0);
		OpenGL.glPixelStorei(3317, 4);
		if (bool)
			method260();
	}

	public void method274(Class343 class343) {
		super.method273(class343);
	}
}
