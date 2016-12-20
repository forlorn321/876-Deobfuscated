/* Class122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class122 {
	Class180_Sub3 aClass180_Sub3_1490;
	static final int anInt1491 = 34336;
	int anInt1492;
	static int[] anIntArray1493 = new int[1];

	void method2137() throws Throwable {
		aClass180_Sub3_1490.method15421(anInt1492);
		super.finalize();
	}

	Class122(Class180_Sub3 class180_sub3, int i, int i_0_) {
		aClass180_Sub3_1490 = class180_sub3;
		anInt1492 = i_0_;
	}

	void method2138() throws Throwable {
		aClass180_Sub3_1490.method15421(anInt1492);
		super.finalize();
	}

	void method2139() throws Throwable {
		aClass180_Sub3_1490.method15421(anInt1492);
		super.finalize();
	}

	void method2140() throws Throwable {
		aClass180_Sub3_1490.method15421(anInt1492);
		super.finalize();
	}

	static Class122 method2141(Class180_Sub3 class180_sub3, int i, String string) {
		int i_1_ = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(i, i_1_);
		OpenGL.glProgramStringARB(i, 34933, string);
		OpenGL.glGetIntegerv(34379, anIntArray1493, 0);
		if (anIntArray1493[0] != -1) {
			OpenGL.glBindProgramARB(i, 0);
			return null;
		}
		OpenGL.glBindProgramARB(i, 0);
		return new Class122(class180_sub3, i, i_1_);
	}

	public void finalize() throws Throwable {
		aClass180_Sub3_1490.method15421(anInt1492);
		super.finalize();
	}

	void method2142() throws Throwable {
		aClass180_Sub3_1490.method15421(anInt1492);
		super.finalize();
	}

	static Class122 method2143(Class180_Sub3 class180_sub3, int i, String string) {
		int i_2_ = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(i, i_2_);
		OpenGL.glProgramStringARB(i, 34933, string);
		OpenGL.glGetIntegerv(34379, anIntArray1493, 0);
		if (anIntArray1493[0] != -1) {
			OpenGL.glBindProgramARB(i, 0);
			return null;
		}
		OpenGL.glBindProgramARB(i, 0);
		return new Class122(class180_sub3, i, i_2_);
	}
}
