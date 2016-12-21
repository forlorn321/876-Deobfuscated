/* Class286_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class286_Sub2 extends Class286 {
	int anInt9973;
	Class285_Sub2 aClass285_Sub2_9974;
	Class167_Sub3_Sub1 aClass167_Sub3_Sub1_9975;

	Class286_Sub2(Class167_Sub3_Sub1 class167_sub3_sub1, Class274 class274) {
		super((Class167_Sub3) class167_sub3_sub1, class274);
		aClass167_Sub3_Sub1_9975 = class167_sub3_sub1;
	}

	void method3889() {
		for (int i = 0; i < method3848(2069069379); i++)
			((Class285_Sub2) method3871(i, 1814027715)).method131();
		super.method3889();
	}

	public boolean method3850(Class285 class285) {
		if (aClass285_Sub2_9974 == class285)
			return true;
		if (!class285.method3785())
			return false;
		boolean bool = method3845();
		aClass285_Sub2_9974 = (Class285_Sub2) class285;
		anInt3199 = method3894(class285, 1320571026) * 404651793;
		if (anInt3199 * 1605784049 == -1)
			throw new IllegalArgumentException();
		anInt9973 = aClass285_Sub2_9974.anInt10055;
		if (bool) {
			OpenGL.glUseProgram(anInt9973);
			aClass167_Sub3_Sub1_9975.aClass285_Sub2_11442 = aClass285_Sub2_9974;
		}
		return true;
	}

	public void method3906() {
		/* empty */
	}

	public void method3843() {
		if (aClass167_Sub3_Sub1_9975.aClass285_Sub2_11442 != aClass285_Sub2_9974) {
			if (aClass285_Sub2_9974 == null)
				throw new RuntimeException_Sub4();
			OpenGL.glUseProgram(anInt9973);
			aClass167_Sub3_Sub1_9975.aClass285_Sub2_11442 = aClass285_Sub2_9974;
		}
	}

	Class285 method3875(Class167_Sub3 class167_sub3, Class264 class264) {
		return new Class285_Sub2((Class167_Sub3_Sub1) class167_sub3, this, class264);
	}

	public boolean method3845() {
		return (aClass167_Sub3_Sub1_9975.aClass285_Sub2_11442 == aClass285_Sub2_9974);
	}

	public boolean method3872() {
		return (aClass167_Sub3_Sub1_9975.aClass285_Sub2_11442 == aClass285_Sub2_9974);
	}

	Class285 method3847(Class167_Sub3 class167_sub3, Class264 class264) {
		return new Class285_Sub2((Class167_Sub3_Sub1) class167_sub3, this, class264);
	}

	void method9115() throws Throwable {
		method3889();
		super.finalize();
	}

	void method9116() throws Throwable {
		method3889();
		super.finalize();
	}

	public void method3844() {
		/* empty */
	}

	public void finalize() throws Throwable {
		method3889();
		super.finalize();
	}

	Class285 method3907(Class167_Sub3 class167_sub3, Class264 class264) {
		return new Class285_Sub2((Class167_Sub3_Sub1) class167_sub3, this, class264);
	}

	Class536_Sub8_Sub1 method3853(Class265 class265) {
		return new Class536_Sub8_Sub1_Sub1(this, class265);
	}

	public boolean method3873() {
		return (aClass167_Sub3_Sub1_9975.aClass285_Sub2_11442 == aClass285_Sub2_9974);
	}

	Class285 method3897(Class167_Sub3 class167_sub3, Class264 class264) {
		return new Class285_Sub2((Class167_Sub3_Sub1) class167_sub3, this, class264);
	}

	Class285 method3877(Class167_Sub3 class167_sub3, Class264 class264) {
		return new Class285_Sub2((Class167_Sub3_Sub1) class167_sub3, this, class264);
	}

	Class285 method3895(Class167_Sub3 class167_sub3, Class264 class264) {
		return new Class285_Sub2((Class167_Sub3_Sub1) class167_sub3, this, class264);
	}

	public boolean method3884(Class285 class285) {
		if (aClass285_Sub2_9974 == class285)
			return true;
		if (!class285.method3785())
			return false;
		boolean bool = method3845();
		aClass285_Sub2_9974 = (Class285_Sub2) class285;
		anInt3199 = method3894(class285, 786146239) * 404651793;
		if (anInt3199 * 1605784049 == -1)
			throw new IllegalArgumentException();
		anInt9973 = aClass285_Sub2_9974.anInt10055;
		if (bool) {
			OpenGL.glUseProgram(anInt9973);
			aClass167_Sub3_Sub1_9975.aClass285_Sub2_11442 = aClass285_Sub2_9974;
		}
		return true;
	}

	Class536_Sub8_Sub1 method3885(Class265 class265) {
		return new Class536_Sub8_Sub1_Sub1(this, class265);
	}

	Class536_Sub8_Sub1 method3886(Class265 class265) {
		return new Class536_Sub8_Sub1_Sub1(this, class265);
	}

	void method3903() {
		for (int i = 0; i < method3848(1432170073); i++)
			((Class285_Sub2) method3871(i, -1534361677)).method131();
		super.method3889();
	}

	void method3859() {
		for (int i = 0; i < method3848(1745795990); i++)
			((Class285_Sub2) method3871(i, -202905489)).method131();
		super.method3889();
	}

	public void method3904() {
		if (aClass167_Sub3_Sub1_9975.aClass285_Sub2_11442 != aClass285_Sub2_9974) {
			if (aClass285_Sub2_9974 == null)
				throw new RuntimeException_Sub4();
			OpenGL.glUseProgram(anInt9973);
			aClass167_Sub3_Sub1_9975.aClass285_Sub2_11442 = aClass285_Sub2_9974;
		}
	}

	public void method3905() {
		/* empty */
	}

	public boolean method3883(Class285 class285) {
		if (aClass285_Sub2_9974 == class285)
			return true;
		if (!class285.method3785())
			return false;
		boolean bool = method3845();
		aClass285_Sub2_9974 = (Class285_Sub2) class285;
		anInt3199 = method3894(class285, 299964879) * 404651793;
		if (anInt3199 * 1605784049 == -1)
			throw new IllegalArgumentException();
		anInt9973 = aClass285_Sub2_9974.anInt10055;
		if (bool) {
			OpenGL.glUseProgram(anInt9973);
			aClass167_Sub3_Sub1_9975.aClass285_Sub2_11442 = aClass285_Sub2_9974;
		}
		return true;
	}

	public void method3899() {
		/* empty */
	}
}
