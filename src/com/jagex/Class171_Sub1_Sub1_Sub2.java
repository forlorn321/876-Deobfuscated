/* Class171_Sub1_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;
import java.awt.Dimension;

import jaggl.OpenGL;

public class Class171_Sub1_Sub1_Sub2 extends Class171_Sub1_Sub1 {
	int anInt12060;
	Canvas aCanvas12061;
	long aLong12062;
	int anInt12063;
	OpenGL anOpenGL12064;
	boolean aBool12065 = false;

	public void method344() {
		if (aLong12062 != 0L) {
			anOpenGL12064.releaseSurface(aCanvas12061, aLong12062);
			aLong12062 = 0L;
		}
	}

	public int method14733(int i, int i_0_) {
		return 0;
	}

	void method14730(int i, int i_1_) {
		if (aLong12062 == 0L)
			throw new IllegalStateException("");
		anOpenGL12064.surfaceResized(aLong12062);
		method18716();
		super.method14728(i, i_1_);
	}

	public int method2729() {
		return anInt12063;
	}

	void method14728(int i, int i_2_) {
		if (aLong12062 == 0L)
			throw new IllegalStateException("");
		anOpenGL12064.surfaceResized(aLong12062);
		method18716();
		super.method14728(i, i_2_);
	}

	void method18716() {
		Dimension dimension = aCanvas12061.getSize();
		anInt12063 = dimension.height;
		anInt12060 = dimension.width;
	}

	public int method14726() {
		if (aLong12062 == 0L)
			throw new IllegalStateException("");
		anOpenGL12064.swapBuffers(aLong12062);
		return 0;
	}

	public int method14727(int i, int i_3_) {
		return 0;
	}

	void method14729(int i, int i_4_) {
		if (aLong12062 == 0L)
			throw new IllegalStateException("");
		anOpenGL12064.surfaceResized(aLong12062);
		method18716();
		super.method14728(i, i_4_);
	}

	boolean method2731() {
		return true;
	}

	boolean method348() {
		if (aLong12062 == 0L)
			throw new IllegalStateException("");
		boolean bool = true;
		if (!aBool12065) {
			bool = anOpenGL12064.setSurface(aLong12062);
			aBool12065 = true;
		}
		return bool && super.method348();
	}

	public int method2732() {
		return anInt12060;
	}

	public int method2733() {
		return anInt12060;
	}

	public int method2730() {
		return anInt12063;
	}

	public int method14731() {
		if (aLong12062 == 0L)
			throw new IllegalStateException("");
		anOpenGL12064.swapBuffers(aLong12062);
		return 0;
	}

	boolean method350() {
		if (aLong12062 == 0L)
			throw new IllegalStateException("");
		boolean bool = true;
		if (!aBool12065) {
			bool = anOpenGL12064.setSurface(aLong12062);
			aBool12065 = true;
		}
		return bool && super.method348();
	}

	boolean method349() {
		if (aLong12062 == 0L)
			throw new IllegalStateException("");
		boolean bool = true;
		if (!aBool12065) {
			bool = anOpenGL12064.setSurface(aLong12062);
			aBool12065 = true;
		}
		return bool && super.method348();
	}

	public int method14732() {
		if (aLong12062 == 0L)
			throw new IllegalStateException("");
		anOpenGL12064.swapBuffers(aLong12062);
		return 0;
	}

	boolean method352() {
		if (aLong12062 == 0L)
			throw new IllegalStateException("");
		boolean bool = true;
		if (!aBool12065) {
			bool = anOpenGL12064.setSurface(aLong12062);
			aBool12065 = true;
		}
		return bool && super.method348();
	}

	public void method129() {
		if (aLong12062 != 0L) {
			anOpenGL12064.releaseSurface(aCanvas12061, aLong12062);
			aLong12062 = 0L;
		}
	}

	Class171_Sub1_Sub1_Sub2(Class180_Sub2_Sub1 class180_sub2_sub1, Canvas canvas) {
		this(class180_sub2_sub1, canvas, class180_sub2_sub1.anOpenGL11482.prepareSurface(canvas));
	}

	boolean method2734() {
		return true;
	}

	Class171_Sub1_Sub1_Sub2(Class180_Sub2_Sub1 class180_sub2_sub1, Canvas canvas, long l) {
		super(class180_sub2_sub1);
		aCanvas12061 = canvas;
		anOpenGL12064 = class180_sub2_sub1.anOpenGL11482;
		aLong12062 = l;
		method18716();
	}

	public int method2728() {
		return anInt12060;
	}

	boolean method351() {
		if (aLong12062 == 0L)
			throw new IllegalStateException("");
		boolean bool = true;
		if (!aBool12065) {
			bool = anOpenGL12064.setSurface(aLong12062);
			aBool12065 = true;
		}
		return bool && super.method348();
	}

	void method18717() {
		Dimension dimension = aCanvas12061.getSize();
		anInt12063 = dimension.height;
		anInt12060 = dimension.width;
	}

	void method18718() {
		Dimension dimension = aCanvas12061.getSize();
		anInt12063 = dimension.height;
		anInt12060 = dimension.width;
	}
}
