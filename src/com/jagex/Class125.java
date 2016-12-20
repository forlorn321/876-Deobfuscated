/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class125 {
	static int[] anIntArray1515 = new int[2];
	Class180_Sub3 aClass180_Sub3_1516;
	int anInt1517;

	void method2158() throws Throwable {
		aClass180_Sub3_1516.method15420((long) anInt1517);
		super.finalize();
	}

	Class125(Class180_Sub3 class180_sub3, int i, Class135[] class135s) {
		aClass180_Sub3_1516 = class180_sub3;
		anInt1517 = i;
	}

	void method2159() throws Throwable {
		aClass180_Sub3_1516.method15420((long) anInt1517);
		super.finalize();
	}

	static Class125 method2160(Class180_Sub3 class180_sub3, Class135[] class135s) {
		for (int i = 0; i < class135s.length; i++) {
			if (class135s[i] == null || class135s[i].anInt1565 <= 0)
				return null;
		}
		int i = OpenGL.glCreateProgram();
		for (int i_0_ = 0; i_0_ < class135s.length; i_0_++)
			OpenGL.glAttachShader(i, class135s[i_0_].anInt1565);
		OpenGL.glLinkProgram(i);
		OpenGL.glGetProgramiv(i, 35714, anIntArray1515, 0);
		if (anIntArray1515[0] == 0) {
			OpenGL.glGetProgramiv(i, 35716, anIntArray1515, 1);
			if (anIntArray1515[1] > 1) {
				byte[] is = new byte[anIntArray1515[1]];
				OpenGL.glGetProgramInfoLog(i, anIntArray1515[1], anIntArray1515, 0, is, 0);
				System.out.println(new String(is));
			}
			if (anIntArray1515[0] == 0) {
				for (int i_1_ = 0; i_1_ < class135s.length; i_1_++)
					OpenGL.glDetachShader(i, class135s[i_1_].anInt1565);
				OpenGL.glDeleteProgram(i);
				return null;
			}
		}
		return new Class125(class180_sub3, i, class135s);
	}

	public void finalize() throws Throwable {
		aClass180_Sub3_1516.method15420((long) anInt1517);
		super.finalize();
	}

	void method2161() throws Throwable {
		aClass180_Sub3_1516.method15420((long) anInt1517);
		super.finalize();
	}

	void method2162() throws Throwable {
		aClass180_Sub3_1516.method15420((long) anInt1517);
		super.finalize();
	}

	void method2163() throws Throwable {
		aClass180_Sub3_1516.method15420((long) anInt1517);
		super.finalize();
	}

	static Class125 method2164(Class180_Sub3 class180_sub3, Class135[] class135s) {
		for (int i = 0; i < class135s.length; i++) {
			if (class135s[i] == null || class135s[i].anInt1565 <= 0)
				return null;
		}
		int i = OpenGL.glCreateProgram();
		for (int i_2_ = 0; i_2_ < class135s.length; i_2_++)
			OpenGL.glAttachShader(i, class135s[i_2_].anInt1565);
		OpenGL.glLinkProgram(i);
		OpenGL.glGetProgramiv(i, 35714, anIntArray1515, 0);
		if (anIntArray1515[0] == 0) {
			OpenGL.glGetProgramiv(i, 35716, anIntArray1515, 1);
			if (anIntArray1515[1] > 1) {
				byte[] is = new byte[anIntArray1515[1]];
				OpenGL.glGetProgramInfoLog(i, anIntArray1515[1], anIntArray1515, 0, is, 0);
				System.out.println(new String(is));
			}
			if (anIntArray1515[0] == 0) {
				for (int i_3_ = 0; i_3_ < class135s.length; i_3_++)
					OpenGL.glDetachShader(i, class135s[i_3_].anInt1565);
				OpenGL.glDeleteProgram(i);
				return null;
			}
		}
		return new Class125(class180_sub3, i, class135s);
	}
}
