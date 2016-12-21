/* Class137 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class137 {
	Class167_Sub2 aClass167_Sub2_1633;
	static int[] anIntArray1634 = new int[2];
	int anInt1635;

	void method1685() throws Throwable {
		aClass167_Sub2_1633.method8574((long) anInt1635);
		super.finalize();
	}

	static Class137 method1686(Class167_Sub2 class167_sub2, Class119[] class119s) {
		for (int i = 0; i < class119s.length; i++) {
			if (class119s[i] == null || class119s[i].anInt1476 <= 0)
				return null;
		}
		int i = OpenGL.glCreateProgram();
		for (int i_0_ = 0; i_0_ < class119s.length; i_0_++)
			OpenGL.glAttachShader(i, class119s[i_0_].anInt1476);
		OpenGL.glLinkProgram(i);
		OpenGL.glGetProgramiv(i, 35714, anIntArray1634, 0);
		if (anIntArray1634[0] == 0) {
			OpenGL.glGetProgramiv(i, 35716, anIntArray1634, 1);
			if (anIntArray1634[1] > 1) {
				byte[] is = new byte[anIntArray1634[1]];
				OpenGL.glGetProgramInfoLog(i, anIntArray1634[1], anIntArray1634, 0, is, 0);
				System.out.println(new String(is));
			}
			if (anIntArray1634[0] == 0) {
				for (int i_1_ = 0; i_1_ < class119s.length; i_1_++)
					OpenGL.glDetachShader(i, class119s[i_1_].anInt1476);
				OpenGL.glDeleteProgram(i);
				return null;
			}
		}
		return new Class137(class167_sub2, i, class119s);
	}

	public void finalize() throws Throwable {
		aClass167_Sub2_1633.method8574((long) anInt1635);
		super.finalize();
	}

	Class137(Class167_Sub2 class167_sub2, int i, Class119[] class119s) {
		aClass167_Sub2_1633 = class167_sub2;
		anInt1635 = i;
	}

	void method1687() throws Throwable {
		aClass167_Sub2_1633.method8574((long) anInt1635);
		super.finalize();
	}
}
