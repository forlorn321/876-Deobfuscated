/* Class490 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class490 implements Interface22, Interface21, Interface56 {
	Class171 aClass171_5466;
	int anInt5467;
	Class155 aClass155_5468;
	int anInt5469;
	Class167_Sub3_Sub1 aClass167_Sub3_Sub1_5470;
	int anInt5471;

	public int method83() {
		return anInt5469;
	}

	public int method12() {
		return anInt5467;
	}

	void method5882() throws Throwable {
		method5883();
		super.finalize();
	}

	Class490(Class167_Sub3_Sub1 class167_sub3_sub1, Class155 class155, Class171 class171, int i, int i_0_) {
		aClass155_5468 = class155;
		aClass171_5466 = class171;
		anInt5467 = i;
		anInt5469 = i_0_;
		aClass167_Sub3_Sub1_5470 = class167_sub3_sub1;
		int[] is = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, is, 0);
		anInt5471 = is[0];
		OpenGL.glBindRenderbufferEXT(36161, anInt5471);
		OpenGL.glRenderbufferStorageEXT(36161, Class167_Sub3_Sub1.method10567(aClass155_5468, aClass171_5466), i, i_0_);
	}

	public void method56(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt5471);
	}

	public void method131() {
		if (anInt5471 != 0) {
			int[] is = new int[1];
			is[0] = anInt5471;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			anInt5471 = 0;
		}
	}

	void method5883() {
		if (anInt5471 != 0) {
			aClass167_Sub3_Sub1_5470.method10563(anInt5471, (anInt5467 * anInt5469 * (aClass171_5466.anInt1898 * -147747987) * (aClass155_5468.anInt1732 * -2037186451)));
			anInt5471 = 0;
		}
	}

	public void method130() {
		if (anInt5471 != 0) {
			int[] is = new int[1];
			is[0] = anInt5471;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			anInt5471 = 0;
		}
	}

	public int method82() {
		return anInt5467;
	}

	public int method73() {
		return anInt5467;
	}

	Class490(Class167_Sub3_Sub1 class167_sub3_sub1, Class155 class155, Class171 class171, int i, int i_1_, int i_2_) {
		aClass155_5468 = class155;
		aClass171_5466 = class171;
		anInt5467 = i;
		anInt5469 = i_1_;
		aClass167_Sub3_Sub1_5470 = class167_sub3_sub1;
		int[] is = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, is, 0);
		anInt5471 = is[0];
		OpenGL.glBindRenderbufferEXT(36161, anInt5471);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, i_2_, Class167_Sub3_Sub1.method10567(aClass155_5468, aClass171_5466), i, i_1_);
	}

	public void finalize() throws Throwable {
		method5883();
		super.finalize();
	}

	public int method8() {
		return anInt5469;
	}

	public int method9() {
		return anInt5469;
	}

	public int method78() {
		return anInt5469;
	}

	public int method1() {
		return anInt5467;
	}

	public void method129() {
		if (anInt5471 != 0) {
			int[] is = new int[1];
			is[0] = anInt5471;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			anInt5471 = 0;
		}
	}

	void method5884() throws Throwable {
		method5883();
		super.finalize();
	}

	public void method89(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt5471);
	}

	public void method90(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt5471);
	}

	public void method363(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt5471);
	}

	void method5885() {
		if (anInt5471 != 0) {
			aClass167_Sub3_Sub1_5470.method10563(anInt5471, (anInt5467 * anInt5469 * (aClass171_5466.anInt1898 * -147747987) * (aClass155_5468.anInt1732 * -2037186451)));
			anInt5471 = 0;
		}
	}

	void method5886() {
		if (anInt5471 != 0) {
			aClass167_Sub3_Sub1_5470.method10563(anInt5471, (anInt5467 * anInt5469 * (aClass171_5466.anInt1898 * -147747987) * (aClass155_5468.anInt1732 * -2037186451)));
			anInt5471 = 0;
		}
	}
}
