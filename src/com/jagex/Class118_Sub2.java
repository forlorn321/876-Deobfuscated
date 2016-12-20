/* Class118_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class118_Sub2 extends Class118 {
	static final int anInt8932 = 34071;
	static final int anInt8933 = 34070;
	static final int anInt8934 = 34073;
	static final int anInt8935 = 34072;
	static final int anInt8936 = 34069;
	static final int anInt8937 = 34074;
	int anInt8938;

	Class118_Sub2(Class180_Sub3 class180_sub3, Class157 class157, Class184 class184, int i) {
		super(class180_sub3, 34067, class157, class184, i * i * 6, false);
		anInt8938 = i;
		aClass180_Sub3_1432.method15401(this);
		for (int i_0_ = 0; i_0_ < 6; i_0_++)
			OpenGL.glTexImage2Dub(34069 + i_0_, 0, Class180_Sub3.method15424(aClass157_1426, aClass184_1431), i, i, 0, Class180_Sub3.method15423(aClass157_1426), 5121, null, 0);
		method2035(true);
	}

	Class118_Sub2(Class180_Sub3 class180_sub3, Class157 class157, Class184 class184, int i, boolean bool, int[][] is) {
		super(class180_sub3, 34067, class157, class184, i * i * 6, bool);
		anInt8938 = i;
		aClass180_Sub3_1432.method15401(this);
		if (bool) {
			for (int i_1_ = 0; i_1_ < 6; i_1_++)
				method2043(34069 + i_1_, Class180_Sub3.method15424(aClass157_1426, aClass184_1431), i, i, 32993, aClass180_Sub3_1432.anInt9835, is[i_1_]);
		} else {
			for (int i_2_ = 0; i_2_ < 6; i_2_++)
				OpenGL.glTexImage2Di(34069 + i_2_, 0, Class180_Sub3.method15424(aClass157_1426, aClass184_1431), i, i, 0, 32993, aClass180_Sub3_1432.anInt9835, is[i_2_], 0);
		}
		method2035(true);
	}

	Class118_Sub2(Class180_Sub3 class180_sub3, Class157 class157, Class184 class184, int i, boolean bool, byte[][] is, Class157 class157_3_) {
		super(class180_sub3, 34067, class157, class184, i * i * 6, bool);
		anInt8938 = i;
		aClass180_Sub3_1432.method15401(this);
		for (int i_4_ = 0; i_4_ < 6; i_4_++)
			OpenGL.glTexImage2Dub(34069 + i_4_, 0, Class180_Sub3.method15424(aClass157_1426, aClass184_1431), i, i, 0, Class180_Sub3.method15423(class157_3_), 5121, is[i_4_], 0);
		method2035(true);
	}

	Interface21 method14439(int i, int i_5_) {
		return new Class123(this, i, i_5_);
	}

	Interface21 method14440(int i, int i_6_) {
		return new Class123(this, i, i_6_);
	}

	Interface21 method14441(int i, int i_7_) {
		return new Class123(this, i, i_7_);
	}

	Interface21 method14442(int i, int i_8_) {
		return new Class123(this, i, i_8_);
	}
}
