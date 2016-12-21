/* Class124_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class124_Sub3 extends Class124 {
	int anInt8979;

	void method8440(boolean bool) {
		aClass167_Sub2_1488.method8617(this);
		OpenGL.glTexParameteri(anInt1496, 10242, bool ? 10497 : 33071);
	}

	Class124_Sub3(Class167_Sub2 class167_sub2, Class155 class155, Class171 class171, int i, byte[] is, Class155 class155_0_) {
		super(class167_sub2, 3552, class155, class171, i, false);
		anInt8979 = i;
		aClass167_Sub2_1488.method8617(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(anInt1496, 0, Class167_Sub2.method8519(aClass155_1495, aClass171_1498), anInt8979, 0, Class167_Sub2.method8576(class155_0_), 5121, is, 0);
		OpenGL.glPixelStorei(3317, 4);
		method1609(true);
	}
}
