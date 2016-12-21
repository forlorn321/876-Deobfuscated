/* Class124_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class124_Sub2 extends Class124 {
	int anInt8894;
	int anInt8895;
	int anInt8896;

	void method8414(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		aClass167_Sub2_1488.method8617(this);
		OpenGL.glCopyTexSubImage3D(anInt1496, 0, i, i_0_, i_1_, i_4_, i_5_, i_2_, i_3_);
		OpenGL.glFlush();
	}

	Class124_Sub2(Class167_Sub2 class167_sub2, Class155 class155, Class171 class171, int i, int i_6_, int i_7_, byte[] is, Class155 class155_8_) {
		super(class167_sub2, 32879, class155, class171, i * i_6_ * i_7_, false);
		anInt8895 = i;
		anInt8894 = i_6_;
		anInt8896 = i_7_;
		aClass167_Sub2_1488.method8617(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(anInt1496, 0, Class167_Sub2.method8519(aClass155_1495, aClass171_1498), anInt8895, anInt8894, anInt8896, 0, Class167_Sub2.method8576(class155_8_), 5121, is, 0);
		OpenGL.glPixelStorei(3317, 4);
		method1609(true);
	}

	Class124_Sub2(Class167_Sub2 class167_sub2, Class155 class155, Class171 class171, int i, int i_9_, int i_10_) {
		super(class167_sub2, 32879, class155, class171, i * i_9_ * i_10_, false);
		anInt8895 = i;
		anInt8894 = i_9_;
		anInt8896 = i_10_;
		aClass167_Sub2_1488.method8617(this);
		OpenGL.glTexImage3Dub(anInt1496, 0, Class167_Sub2.method8519(aClass155_1495, aClass171_1498), anInt8895, anInt8894, anInt8896, 0, Class167_Sub2.method8576(aClass155_1495), 5121, null, 0);
		method1609(true);
	}
}
