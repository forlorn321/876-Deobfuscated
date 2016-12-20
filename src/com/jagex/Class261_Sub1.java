/* Class261_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class261_Sub1 extends Class261 {
	Class265_Sub1 aClass265_Sub1_10028;
	int anInt10029;
	Class180_Sub2_Sub1 aClass180_Sub2_Sub1_10030;

	public void method4854() {
		/* empty */
	}

	void method4838() {
		for (int i = 0; i < method4806(-1490904813); i++)
			((Class265_Sub1) method4841(i, (byte) -15)).method129();
		super.method4838();
	}

	public boolean method4810(Class265 class265) {
		if (aClass265_Sub1_10028 == class265)
			return true;
		if (!class265.method4988())
			return false;
		boolean bool = method4802();
		aClass265_Sub1_10028 = (Class265_Sub1) class265;
		anInt2860 = method4808(class265, (byte) 126) * 1637698529;
		if (anInt2860 * 1176516641 == -1)
			throw new IllegalArgumentException();
		anInt10029 = aClass265_Sub1_10028.anInt9978;
		if (bool) {
			OpenGL.glUseProgram(anInt10029);
			aClass180_Sub2_Sub1_10030.aClass265_Sub1_11483 = aClass265_Sub1_10028;
		}
		return true;
	}

	public boolean method4859(Class265 class265) {
		if (aClass265_Sub1_10028 == class265)
			return true;
		if (!class265.method4988())
			return false;
		boolean bool = method4802();
		aClass265_Sub1_10028 = (Class265_Sub1) class265;
		anInt2860 = method4808(class265, (byte) 26) * 1637698529;
		if (anInt2860 * 1176516641 == -1)
			throw new IllegalArgumentException();
		anInt10029 = aClass265_Sub1_10028.anInt9978;
		if (bool) {
			OpenGL.glUseProgram(anInt10029);
			aClass180_Sub2_Sub1_10030.aClass265_Sub1_11483 = aClass265_Sub1_10028;
		}
		return true;
	}

	Class527_Sub18_Sub1 method4897(Class275 class275) {
		return new Class527_Sub18_Sub1_Sub1(this, class275);
	}

	Class527_Sub18_Sub1 method4804(Class275 class275) {
		return new Class527_Sub18_Sub1_Sub1(this, class275);
	}

	public boolean method4802() {
		return (aClass180_Sub2_Sub1_10030.aClass265_Sub1_11483 == aClass265_Sub1_10028);
	}

	public boolean method4858(Class265 class265) {
		if (aClass265_Sub1_10028 == class265)
			return true;
		if (!class265.method4988())
			return false;
		boolean bool = method4802();
		aClass265_Sub1_10028 = (Class265_Sub1) class265;
		anInt2860 = method4808(class265, (byte) 124) * 1637698529;
		if (anInt2860 * 1176516641 == -1)
			throw new IllegalArgumentException();
		anInt10029 = aClass265_Sub1_10028.anInt9978;
		if (bool) {
			OpenGL.glUseProgram(anInt10029);
			aClass180_Sub2_Sub1_10030.aClass265_Sub1_11483 = aClass265_Sub1_10028;
		}
		return true;
	}

	public void finalize() throws Throwable {
		method4838();
		super.finalize();
	}

	Class261_Sub1(Class180_Sub2_Sub1 class180_sub2_sub1, Class272 class272) {
		super((Class180_Sub2) class180_sub2_sub1, class272);
		aClass180_Sub2_Sub1_10030 = class180_sub2_sub1;
	}

	public void method4875() {
		if (aClass180_Sub2_Sub1_10030.aClass265_Sub1_11483 != aClass265_Sub1_10028) {
			if (aClass265_Sub1_10028 == null)
				throw new RuntimeException_Sub4();
			OpenGL.glUseProgram(anInt10029);
			aClass180_Sub2_Sub1_10030.aClass265_Sub1_11483 = aClass265_Sub1_10028;
		}
	}

	void method15697() throws Throwable {
		method4838();
		super.finalize();
	}

	void method15698() throws Throwable {
		method4838();
		super.finalize();
	}

	void method15699() throws Throwable {
		method4838();
		super.finalize();
	}

	public void method4839() {
		if (aClass180_Sub2_Sub1_10030.aClass265_Sub1_11483 != aClass265_Sub1_10028) {
			if (aClass265_Sub1_10028 == null)
				throw new RuntimeException_Sub4();
			OpenGL.glUseProgram(anInt10029);
			aClass180_Sub2_Sub1_10030.aClass265_Sub1_11483 = aClass265_Sub1_10028;
		}
	}

	public void method4840() {
		if (aClass180_Sub2_Sub1_10030.aClass265_Sub1_11483 != aClass265_Sub1_10028) {
			if (aClass265_Sub1_10028 == null)
				throw new RuntimeException_Sub4();
			OpenGL.glUseProgram(anInt10029);
			aClass180_Sub2_Sub1_10030.aClass265_Sub1_11483 = aClass265_Sub1_10028;
		}
	}

	public void method4849() {
		/* empty */
	}

	public boolean method4842() {
		return (aClass180_Sub2_Sub1_10030.aClass265_Sub1_11483 == aClass265_Sub1_10028);
	}

	public boolean method4813() {
		return (aClass180_Sub2_Sub1_10030.aClass265_Sub1_11483 == aClass265_Sub1_10028);
	}

	public boolean method4877() {
		return (aClass180_Sub2_Sub1_10030.aClass265_Sub1_11483 == aClass265_Sub1_10028);
	}

	void method15700() throws Throwable {
		method4838();
		super.finalize();
	}

	Class265 method4848(Class180_Sub2 class180_sub2, Class287 class287) {
		return new Class265_Sub1((Class180_Sub2_Sub1) class180_sub2, this, class287);
	}

	void method15701() throws Throwable {
		method4838();
		super.finalize();
	}

	Class527_Sub18_Sub1 method4865(Class275 class275) {
		return new Class527_Sub18_Sub1_Sub1(this, class275);
	}

	Class265 method4799(Class180_Sub2 class180_sub2, Class287 class287) {
		return new Class265_Sub1((Class180_Sub2_Sub1) class180_sub2, this, class287);
	}

	void method4862() {
		for (int i = 0; i < method4806(-1975633626); i++)
			((Class265_Sub1) method4841(i, (byte) 58)).method129();
		super.method4838();
	}
}
