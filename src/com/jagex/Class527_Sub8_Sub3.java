/* Class527_Sub8_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class527_Sub8_Sub3 extends Class527_Sub8 implements Interface16 {
	int anInt11339;
	Class180_Sub3 aClass180_Sub3_11340;
	int anInt11341;
	static int[] anIntArray11342 = new int[1];
	Class184 aClass184_11343;
	Class157 aClass157_11344;
	int anInt11345;
	int anInt11346;

	void method17901() {
		if (anInt11346 != 0) {
			aClass180_Sub3_11340.method15445(anInt11346, anInt11345);
			anInt11346 = 0;
		}
	}

	Class527_Sub8_Sub3(Class180_Sub3 class180_sub3, Class157 class157, Class184 class184, int i, int i_0_, int i_1_) {
		aClass180_Sub3_11340 = class180_sub3;
		anInt11341 = i;
		anInt11339 = i_0_;
		aClass157_11344 = class157;
		aClass184_11343 = class184;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray11342, 0);
		anInt11346 = anIntArray11342[0];
		OpenGL.glBindRenderbufferEXT(36161, anInt11346);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, i_1_, Class180_Sub3.method15424(aClass157_11344, aClass184_11343), anInt11341, anInt11339);
		anInt11345 = (anInt11341 * anInt11339 * (aClass157_11344.anInt1722 * -1216378097) * (aClass184_11343.anInt2111 * 408933829));
	}

	public int method1() {
		return anInt11341;
	}

	public int method87() {
		return anInt11339;
	}

	public int method42() {
		return anInt11341;
	}

	public void method129() {
		if (anInt11346 != 0) {
			int[] is = new int[1];
			is[0] = anInt11346;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			anInt11346 = 0;
		}
	}

	void method17902() {
		if (anInt11346 != 0) {
			aClass180_Sub3_11340.method15445(anInt11346, anInt11345);
			anInt11346 = 0;
		}
	}

	public void finalize() throws Throwable {
		method17902();
		super.finalize();
	}

	public int method6() {
		return anInt11339;
	}

	public int method91() {
		return anInt11339;
	}

	public void method60(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt11346);
	}

	Class527_Sub8_Sub3(Class180_Sub3 class180_sub3, Class157 class157, Class184 class184, int i, int i_2_) {
		aClass180_Sub3_11340 = class180_sub3;
		anInt11341 = i;
		anInt11339 = i_2_;
		aClass157_11344 = class157;
		aClass184_11343 = class184;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray11342, 0);
		anInt11346 = anIntArray11342[0];
		OpenGL.glBindRenderbufferEXT(36161, anInt11346);
		OpenGL.glRenderbufferStorageEXT(36161, Class180_Sub3.method15424(aClass157_11344, aClass184_11343), anInt11341, anInt11339);
		anInt11345 = (anInt11341 * anInt11339 * (aClass157_11344.anInt1722 * -1216378097) * (aClass184_11343.anInt2111 * 408933829));
	}

	void method17903() throws Throwable {
		method17902();
		super.finalize();
	}

	void method17904() throws Throwable {
		method17902();
		super.finalize();
	}

	void method17905() throws Throwable {
		method17902();
		super.finalize();
	}

	public void method97(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt11346);
	}

	void method17906() throws Throwable {
		method17902();
		super.finalize();
	}

	void method17907() throws Throwable {
		method17902();
		super.finalize();
	}

	public void method130() {
		if (anInt11346 != 0) {
			int[] is = new int[1];
			is[0] = anInt11346;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			anInt11346 = 0;
		}
	}

	void method17908() {
		if (anInt11346 != 0) {
			aClass180_Sub3_11340.method15445(anInt11346, anInt11345);
			anInt11346 = 0;
		}
	}
}
