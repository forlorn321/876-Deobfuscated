/* Class123 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class123 {
	static final int anInt1484 = 34336;
	static int[] anIntArray1485 = new int[1];
	int anInt1486;
	Class167_Sub2 aClass167_Sub2_1487;

	void method1605() throws Throwable {
		aClass167_Sub2_1487.method8578(anInt1486);
		super.finalize();
	}

	public void finalize() throws Throwable {
		aClass167_Sub2_1487.method8578(anInt1486);
		super.finalize();
	}

	void method1606() throws Throwable {
		aClass167_Sub2_1487.method8578(anInt1486);
		super.finalize();
	}

	Class123(Class167_Sub2 class167_sub2, int i, int i_0_) {
		aClass167_Sub2_1487 = class167_sub2;
		anInt1486 = i_0_;
	}

	static Class123 method1607(Class167_Sub2 class167_sub2, int i, String string) {
		int i_1_ = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(i, i_1_);
		OpenGL.glProgramStringARB(i, 34933, string);
		OpenGL.glGetIntegerv(34379, anIntArray1485, 0);
		if (anIntArray1485[0] != -1) {
			OpenGL.glBindProgramARB(i, 0);
			return null;
		}
		OpenGL.glBindProgramARB(i, 0);
		return new Class123(class167_sub2, i, i_1_);
	}
}
