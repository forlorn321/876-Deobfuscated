/* Class118_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class118_Sub4 extends Class118 {
	int anInt8980;
	int anInt8981;
	int anInt8982;

	void method14474(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		aClass180_Sub3_1432.method15401(this);
		OpenGL.glCopyTexSubImage3D(anInt1434, 0, i, i_0_, i_1_, i_4_, i_5_, i_2_, i_3_);
		OpenGL.glFlush();
	}

	Class118_Sub4(Class180_Sub3 class180_sub3, Class157 class157, Class184 class184, int i, int i_6_, int i_7_, byte[] is, Class157 class157_8_) {
		super(class180_sub3, 32879, class157, class184, i * i_6_ * i_7_, false);
		anInt8980 = i;
		anInt8981 = i_6_;
		anInt8982 = i_7_;
		aClass180_Sub3_1432.method15401(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(anInt1434, 0, Class180_Sub3.method15424(aClass157_1426, aClass184_1431), anInt8980, anInt8981, anInt8982, 0, Class180_Sub3.method15423(class157_8_), 5121, is, 0);
		OpenGL.glPixelStorei(3317, 4);
		method2035(true);
	}

	void method14475(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_) {
		aClass180_Sub3_1432.method15401(this);
		OpenGL.glCopyTexSubImage3D(anInt1434, 0, i, i_9_, i_10_, i_13_, i_14_, i_11_, i_12_);
		OpenGL.glFlush();
	}

	Class118_Sub4(Class180_Sub3 class180_sub3, Class157 class157, Class184 class184, int i, int i_15_, int i_16_) {
		super(class180_sub3, 32879, class157, class184, i * i_15_ * i_16_, false);
		anInt8980 = i;
		anInt8981 = i_15_;
		anInt8982 = i_16_;
		aClass180_Sub3_1432.method15401(this);
		OpenGL.glTexImage3Dub(anInt1434, 0, Class180_Sub3.method15424(aClass157_1426, aClass184_1431), anInt8980, anInt8981, anInt8982, 0, Class180_Sub3.method15423(aClass157_1426), 5121, null, 0);
		method2035(true);
	}

	void method14476(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_) {
		aClass180_Sub3_1432.method15401(this);
		OpenGL.glCopyTexSubImage3D(anInt1434, 0, i, i_17_, i_18_, i_21_, i_22_, i_19_, i_20_);
		OpenGL.glFlush();
	}

	void method14477(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_) {
		aClass180_Sub3_1432.method15401(this);
		OpenGL.glCopyTexSubImage3D(anInt1434, 0, i, i_23_, i_24_, i_27_, i_28_, i_25_, i_26_);
		OpenGL.glFlush();
	}
}
