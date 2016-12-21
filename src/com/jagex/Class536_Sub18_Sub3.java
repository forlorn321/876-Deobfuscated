/* Class536_Sub18_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class536_Sub18_Sub3 extends Class536_Sub18 implements Interface16 {
	int anInt11336;
	int anInt11337;
	int anInt11338;
	Class167_Sub2 aClass167_Sub2_11339;
	Class171 aClass171_11340;
	Class155 aClass155_11341;
	int anInt11342;
	static int[] anIntArray11343 = new int[1];

	void method10506() throws Throwable {
		method10507();
		super.finalize();
	}

	public void method56(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt11337);
	}

	public int method1() {
		return anInt11338;
	}

	public int method78() {
		return anInt11336;
	}

	Class536_Sub18_Sub3(Class167_Sub2 class167_sub2, Class155 class155, Class171 class171, int i, int i_0_) {
		aClass167_Sub2_11339 = class167_sub2;
		anInt11338 = i;
		anInt11336 = i_0_;
		aClass155_11341 = class155;
		aClass171_11340 = class171;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray11343, 0);
		anInt11337 = anIntArray11343[0];
		OpenGL.glBindRenderbufferEXT(36161, anInt11337);
		OpenGL.glRenderbufferStorageEXT(36161, Class167_Sub2.method8519(aClass155_11341, aClass171_11340), anInt11338, anInt11336);
		anInt11342 = (anInt11338 * anInt11336 * (aClass155_11341.anInt1732 * -2037186451) * (aClass171_11340.anInt1898 * -147747987));
	}

	public void method131() {
		if (anInt11337 != 0) {
			int[] is = new int[1];
			is[0] = anInt11337;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			anInt11337 = 0;
		}
	}

	public int method73() {
		return anInt11338;
	}

	public void finalize() throws Throwable {
		method10507();
		super.finalize();
	}

	public int method12() {
		return anInt11338;
	}

	void method10507() {
		if (anInt11337 != 0) {
			aClass167_Sub2_11339.method8573(anInt11337, anInt11342);
			anInt11337 = 0;
		}
	}

	public int method82() {
		return anInt11338;
	}

	public int method83() {
		return anInt11336;
	}

	public int method8() {
		return anInt11336;
	}

	public int method9() {
		return anInt11336;
	}

	public void method130() {
		if (anInt11337 != 0) {
			int[] is = new int[1];
			is[0] = anInt11337;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			anInt11337 = 0;
		}
	}

	public void method129() {
		if (anInt11337 != 0) {
			int[] is = new int[1];
			is[0] = anInt11337;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			anInt11337 = 0;
		}
	}

	void method10508() throws Throwable {
		method10507();
		super.finalize();
	}

	public void method90(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt11337);
	}

	public void method89(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt11337);
	}

	Class536_Sub18_Sub3(Class167_Sub2 class167_sub2, Class155 class155, Class171 class171, int i, int i_1_, int i_2_) {
		aClass167_Sub2_11339 = class167_sub2;
		anInt11338 = i;
		anInt11336 = i_1_;
		aClass155_11341 = class155;
		aClass171_11340 = class171;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray11343, 0);
		anInt11337 = anIntArray11343[0];
		OpenGL.glBindRenderbufferEXT(36161, anInt11337);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, i_2_, Class167_Sub2.method8519(aClass155_11341, aClass171_11340), anInt11338, anInt11336);
		anInt11342 = (anInt11338 * anInt11336 * (aClass155_11341.anInt1732 * -2037186451) * (aClass171_11340.anInt1898 * -147747987));
	}

	void method10509() {
		if (anInt11337 != 0) {
			aClass167_Sub2_11339.method8573(anInt11337, anInt11342);
			anInt11337 = 0;
		}
	}
}
