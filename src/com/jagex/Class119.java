/* Class119 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class119 {
	static final int anInt1472 = 35633;
	static final int anInt1473 = 35632;
	static int[] anIntArray1474 = new int[2];
	Class167_Sub2 aClass167_Sub2_1475;
	int anInt1476;

	static Class119 method1600(Class167_Sub2 class167_sub2, int i, String string) {
		int i_0_ = OpenGL.glCreateShader(i);
		OpenGL.glShaderSource(i_0_, string);
		OpenGL.glCompileShader(i_0_);
		OpenGL.glGetShaderiv(i_0_, 35713, anIntArray1474, 0);
		if (anIntArray1474[0] == 0) {
			boolean bool = false;
			if (anIntArray1474[0] == 0) {
				bool = true;
				System.out.println("");
			}
			OpenGL.glGetShaderiv(i_0_, 35716, anIntArray1474, 1);
			if (anIntArray1474[1] > 1) {
				byte[] is = new byte[anIntArray1474[1]];
				OpenGL.glGetShaderInfoLog(i_0_, anIntArray1474[1], anIntArray1474, 0, is, 0);
				System.out.println(new String(is));
			}
			if (bool) {
				OpenGL.glDeleteShader(i_0_);
				return null;
			}
		}
		return new Class119(class167_sub2, i_0_, i);
	}

	Class119(Class167_Sub2 class167_sub2, int i, int i_1_) {
		aClass167_Sub2_1475 = class167_sub2;
		anInt1476 = i;
	}

	public void finalize() throws Throwable {
		aClass167_Sub2_1475.method8574((long) anInt1476);
		super.finalize();
	}

	void method1601() throws Throwable {
		aClass167_Sub2_1475.method8574((long) anInt1476);
		super.finalize();
	}

	void method1602() throws Throwable {
		aClass167_Sub2_1475.method8574((long) anInt1476);
		super.finalize();
	}
}
