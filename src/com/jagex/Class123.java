/* Class123 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class123 implements Interface16 {
	int anInt1494;
	int anInt1495;
	Class118_Sub2 aClass118_Sub2_1496;

	public int method6() {
		return aClass118_Sub2_1496.anInt8938;
	}

	public int method1() {
		return aClass118_Sub2_1496.anInt8938;
	}

	Class123(Class118_Sub2 class118_sub2, int i, int i_0_) {
		anInt1495 = i_0_;
		aClass118_Sub2_1496 = class118_sub2;
		anInt1494 = i;
	}

	public void method97(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, anInt1494, aClass118_Sub2_1496.anInt1433, anInt1495);
	}

	public void method130() {
		/* empty */
	}

	public int method42() {
		return aClass118_Sub2_1496.anInt8938;
	}

	public int method91() {
		return aClass118_Sub2_1496.anInt8938;
	}

	public int method87() {
		return aClass118_Sub2_1496.anInt8938;
	}

	public void method129() {
		/* empty */
	}

	public void method60(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, anInt1494, aClass118_Sub2_1496.anInt1433, anInt1495);
	}
}
