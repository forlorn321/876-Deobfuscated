/* Class135 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class135 {
	static final int anInt1561 = 35632;
	static int[] anIntArray1562 = new int[2];
	Class180_Sub3 aClass180_Sub3_1563;
	static final int anInt1564 = 35633;
	int anInt1565;

	Class135(Class180_Sub3 class180_sub3, int i, int i_0_) {
		aClass180_Sub3_1563 = class180_sub3;
		anInt1565 = i;
	}

	void method2292() throws Throwable {
		aClass180_Sub3_1563.method15420((long) anInt1565);
		super.finalize();
	}

	public void finalize() throws Throwable {
		aClass180_Sub3_1563.method15420((long) anInt1565);
		super.finalize();
	}

	void method2293() throws Throwable {
		aClass180_Sub3_1563.method15420((long) anInt1565);
		super.finalize();
	}

	static Class135 method2294(Class180_Sub3 class180_sub3, int i, String string) {
		int i_1_ = OpenGL.glCreateShader(i);
		OpenGL.glShaderSource(i_1_, string);
		OpenGL.glCompileShader(i_1_);
		OpenGL.glGetShaderiv(i_1_, 35713, anIntArray1562, 0);
		if (anIntArray1562[0] == 0) {
			boolean bool = false;
			if (anIntArray1562[0] == 0) {
				bool = true;
				System.out.println("");
			}
			OpenGL.glGetShaderiv(i_1_, 35716, anIntArray1562, 1);
			if (anIntArray1562[1] > 1) {
				byte[] is = new byte[anIntArray1562[1]];
				OpenGL.glGetShaderInfoLog(i_1_, anIntArray1562[1], anIntArray1562, 0, is, 0);
				System.out.println(new String(is));
			}
			if (bool) {
				OpenGL.glDeleteShader(i_1_);
				return null;
			}
		}
		return new Class135(class180_sub3, i_1_, i);
	}

	void method2295() throws Throwable {
		aClass180_Sub3_1563.method15420((long) anInt1565);
		super.finalize();
	}

	void method2296() throws Throwable {
		aClass180_Sub3_1563.method15420((long) anInt1565);
		super.finalize();
	}

	void method2297() throws Throwable {
		aClass180_Sub3_1563.method15420((long) anInt1565);
		super.finalize();
	}

	static Class135 method2298(Class180_Sub3 class180_sub3, int i, String string) {
		int i_2_ = OpenGL.glCreateShader(i);
		OpenGL.glShaderSource(i_2_, string);
		OpenGL.glCompileShader(i_2_);
		OpenGL.glGetShaderiv(i_2_, 35713, anIntArray1562, 0);
		if (anIntArray1562[0] == 0) {
			boolean bool = false;
			if (anIntArray1562[0] == 0) {
				bool = true;
				System.out.println("");
			}
			OpenGL.glGetShaderiv(i_2_, 35716, anIntArray1562, 1);
			if (anIntArray1562[1] > 1) {
				byte[] is = new byte[anIntArray1562[1]];
				OpenGL.glGetShaderInfoLog(i_2_, anIntArray1562[1], anIntArray1562, 0, is, 0);
				System.out.println(new String(is));
			}
			if (bool) {
				OpenGL.glDeleteShader(i_2_);
				return null;
			}
		}
		return new Class135(class180_sub3, i_2_, i);
	}

	static Class135 method2299(Class180_Sub3 class180_sub3, int i, String string) {
		int i_3_ = OpenGL.glCreateShader(i);
		OpenGL.glShaderSource(i_3_, string);
		OpenGL.glCompileShader(i_3_);
		OpenGL.glGetShaderiv(i_3_, 35713, anIntArray1562, 0);
		if (anIntArray1562[0] == 0) {
			boolean bool = false;
			if (anIntArray1562[0] == 0) {
				bool = true;
				System.out.println("");
			}
			OpenGL.glGetShaderiv(i_3_, 35716, anIntArray1562, 1);
			if (anIntArray1562[1] > 1) {
				byte[] is = new byte[anIntArray1562[1]];
				OpenGL.glGetShaderInfoLog(i_3_, anIntArray1562[1], anIntArray1562, 0, is, 0);
				System.out.println(new String(is));
			}
			if (bool) {
				OpenGL.glDeleteShader(i_3_);
				return null;
			}
		}
		return new Class135(class180_sub3, i_3_, i);
	}

	static Class135 method2300(Class180_Sub3 class180_sub3, int i, String string) {
		int i_4_ = OpenGL.glCreateShader(i);
		OpenGL.glShaderSource(i_4_, string);
		OpenGL.glCompileShader(i_4_);
		OpenGL.glGetShaderiv(i_4_, 35713, anIntArray1562, 0);
		if (anIntArray1562[0] == 0) {
			boolean bool = false;
			if (anIntArray1562[0] == 0) {
				bool = true;
				System.out.println("");
			}
			OpenGL.glGetShaderiv(i_4_, 35716, anIntArray1562, 1);
			if (anIntArray1562[1] > 1) {
				byte[] is = new byte[anIntArray1562[1]];
				OpenGL.glGetShaderInfoLog(i_4_, anIntArray1562[1], anIntArray1562, 0, is, 0);
				System.out.println(new String(is));
			}
			if (bool) {
				OpenGL.glDeleteShader(i_4_);
				return null;
			}
		}
		return new Class135(class180_sub3, i_4_, i);
	}
}
