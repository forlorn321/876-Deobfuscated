/* Class118_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class118_Sub1 extends Class118 {
	int anInt8875;

	void method14423(boolean bool) {
		aClass180_Sub3_1432.method15401(this);
		OpenGL.glTexParameteri(anInt1434, 10242, bool ? 10497 : 33071);
	}

	void method14424(boolean bool) {
		aClass180_Sub3_1432.method15401(this);
		OpenGL.glTexParameteri(anInt1434, 10242, bool ? 10497 : 33071);
	}

	Class118_Sub1(Class180_Sub3 class180_sub3, Class157 class157, Class184 class184, int i, byte[] is, Class157 class157_0_) {
		super(class180_sub3, 3552, class157, class184, i, false);
		anInt8875 = i;
		aClass180_Sub3_1432.method15401(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(anInt1434, 0, Class180_Sub3.method15424(aClass157_1426, aClass184_1431), anInt8875, 0, Class180_Sub3.method15423(class157_0_), 5121, is, 0);
		OpenGL.glPixelStorei(3317, 4);
		method2035(true);
	}
}
