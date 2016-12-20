/* Class486 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class486 implements Interface21, Interface23, Interface55 {
	int anInt5464;
	Class184 aClass184_5465;
	int anInt5466;
	Class157 aClass157_5467;
	Class180_Sub2_Sub1 aClass180_Sub2_Sub1_5468;
	int anInt5469;

	void method7958() throws Throwable {
		method7959();
		super.finalize();
	}

	Class486(Class180_Sub2_Sub1 class180_sub2_sub1, Class157 class157, Class184 class184, int i, int i_0_, int i_1_) {
		aClass157_5467 = class157;
		aClass184_5465 = class184;
		anInt5466 = i;
		anInt5464 = i_0_;
		aClass180_Sub2_Sub1_5468 = class180_sub2_sub1;
		int[] is = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, is, 0);
		anInt5469 = is[0];
		OpenGL.glBindRenderbufferEXT(36161, anInt5469);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, i_1_, Class180_Sub2_Sub1.method18015(aClass157_5467, aClass184_5465), i, i_0_);
	}

	public void method129() {
		if (anInt5469 != 0) {
			int[] is = new int[1];
			is[0] = anInt5469;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			anInt5469 = 0;
		}
	}

	public int method87() {
		return anInt5464;
	}

	public void method97(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt5469);
	}

	public void method60(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt5469);
	}

	void method7959() {
		if (anInt5469 != 0) {
			aClass180_Sub2_Sub1_5468.method18030(anInt5469, (anInt5466 * anInt5464 * (aClass184_5465.anInt2111 * 408933829) * (aClass157_5467.anInt1722 * -1216378097)));
			anInt5469 = 0;
		}
	}

	public void finalize() throws Throwable {
		method7959();
		super.finalize();
	}

	public int method42() {
		return anInt5466;
	}

	void method7960() throws Throwable {
		method7959();
		super.finalize();
	}

	public void method359(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt5469);
	}

	public void method130() {
		if (anInt5469 != 0) {
			int[] is = new int[1];
			is[0] = anInt5469;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			anInt5469 = 0;
		}
	}

	void method7961() throws Throwable {
		method7959();
		super.finalize();
	}

	void method7962() throws Throwable {
		method7959();
		super.finalize();
	}

	void method7963() throws Throwable {
		method7959();
		super.finalize();
	}

	public int method91() {
		return anInt5464;
	}

	public int method6() {
		return anInt5464;
	}

	Class486(Class180_Sub2_Sub1 class180_sub2_sub1, Class157 class157, Class184 class184, int i, int i_2_) {
		aClass157_5467 = class157;
		aClass184_5465 = class184;
		anInt5466 = i;
		anInt5464 = i_2_;
		aClass180_Sub2_Sub1_5468 = class180_sub2_sub1;
		int[] is = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, is, 0);
		anInt5469 = is[0];
		OpenGL.glBindRenderbufferEXT(36161, anInt5469);
		OpenGL.glRenderbufferStorageEXT(36161, Class180_Sub2_Sub1.method18015(aClass157_5467, aClass184_5465), i, i_2_);
	}

	public void method357(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt5469);
	}

	public int method1() {
		return anInt5466;
	}

	public void method360(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt5469);
	}

	public void method358(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt5469);
	}

	void method7964() {
		if (anInt5469 != 0) {
			aClass180_Sub2_Sub1_5468.method18030(anInt5469, (anInt5466 * anInt5464 * (aClass184_5465.anInt2111 * 408933829) * (aClass157_5467.anInt1722 * -1216378097)));
			anInt5469 = 0;
		}
	}
}
