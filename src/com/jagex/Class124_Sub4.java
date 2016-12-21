/* Class124_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class124_Sub4 extends Class124 {
	int anInt8986;
	static final int anInt8987 = 34070;
	static final int anInt8988 = 34071;
	static final int anInt8989 = 34072;
	static final int anInt8990 = 34073;
	static final int anInt8991 = 34074;
	static final int anInt8992 = 34069;

	Class124_Sub4(Class167_Sub2 class167_sub2, Class155 class155, Class171 class171, int i, boolean bool, int[][] is) {
		super(class167_sub2, 34067, class155, class171, i * i * 6, bool);
		anInt8986 = i;
		aClass167_Sub2_1488.method8617(this);
		if (bool) {
			for (int i_0_ = 0; i_0_ < 6; i_0_++)
				method1612(34069 + i_0_, Class167_Sub2.method8519(aClass155_1495, aClass171_1498), i, i, 32993, aClass167_Sub2_1488.anInt9309, is[i_0_]);
		} else {
			for (int i_1_ = 0; i_1_ < 6; i_1_++)
				OpenGL.glTexImage2Di(34069 + i_1_, 0, Class167_Sub2.method8519(aClass155_1495, aClass171_1498), i, i, 0, 32993, aClass167_Sub2_1488.anInt9309, is[i_1_], 0);
		}
		method1609(true);
	}

	Class124_Sub4(Class167_Sub2 class167_sub2, Class155 class155, Class171 class171, int i) {
		super(class167_sub2, 34067, class155, class171, i * i * 6, false);
		anInt8986 = i;
		aClass167_Sub2_1488.method8617(this);
		for (int i_2_ = 0; i_2_ < 6; i_2_++)
			OpenGL.glTexImage2Dub(34069 + i_2_, 0, Class167_Sub2.method8519(aClass155_1495, aClass171_1498), i, i, 0, Class167_Sub2.method8576(aClass155_1495), 5121, null, 0);
		method1609(true);
	}

	Class124_Sub4(Class167_Sub2 class167_sub2, Class155 class155, Class171 class171, int i, boolean bool, byte[][] is, Class155 class155_3_) {
		super(class167_sub2, 34067, class155, class171, i * i * 6, bool);
		anInt8986 = i;
		aClass167_Sub2_1488.method8617(this);
		for (int i_4_ = 0; i_4_ < 6; i_4_++)
			OpenGL.glTexImage2Dub(34069 + i_4_, 0, Class167_Sub2.method8519(aClass155_1495, aClass171_1498), i, i, 0, Class167_Sub2.method8576(class155_3_), 5121, is[i_4_], 0);
		method1609(true);
	}

	Interface22 method8442(int i, int i_5_) {
		return new Class133(this, i, i_5_);
	}
}
