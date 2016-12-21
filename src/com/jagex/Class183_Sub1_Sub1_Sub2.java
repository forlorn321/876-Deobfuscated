/* Class183_Sub1_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;
import java.awt.Dimension;

import jaggl.OpenGL;

public class Class183_Sub1_Sub1_Sub2 extends Class183_Sub1_Sub1 {
	OpenGL anOpenGL12069;
	long aLong12070;
	boolean aBool12071 = false;
	int anInt12072;
	int anInt12073;
	Canvas aCanvas12074;

	void method10996() {
		Dimension dimension = aCanvas12074.getSize();
		anInt12073 = dimension.height;
		anInt12072 = dimension.width;
	}

	Class183_Sub1_Sub1_Sub2(Class167_Sub3_Sub1 class167_sub3_sub1, Canvas canvas, long l) {
		super(class167_sub3_sub1);
		aCanvas12074 = canvas;
		anOpenGL12069 = class167_sub3_sub1.anOpenGL11441;
		aLong12070 = l;
		method10997();
	}

	public void method131() {
		if (aLong12070 != 0L) {
			anOpenGL12069.releaseSurface(aCanvas12074, aLong12070);
			aLong12070 = 0L;
		}
	}

	public int method8655() {
		if (aLong12070 == 0L)
			throw new IllegalStateException("");
		anOpenGL12069.swapBuffers(aLong12070);
		return 0;
	}

	public void method129() {
		if (aLong12070 != 0L) {
			anOpenGL12069.releaseSurface(aCanvas12074, aLong12070);
			aLong12070 = 0L;
		}
	}

	void method10997() {
		Dimension dimension = aCanvas12074.getSize();
		anInt12073 = dimension.height;
		anInt12072 = dimension.width;
	}

	public int method8650() {
		if (aLong12070 == 0L)
			throw new IllegalStateException("");
		anOpenGL12069.swapBuffers(aLong12070);
		return 0;
	}

	public int method8651(int i, int i_0_) {
		return 0;
	}

	boolean method352() {
		if (aLong12070 == 0L)
			throw new IllegalStateException("");
		boolean bool = true;
		if (!aBool12071) {
			bool = anOpenGL12069.setSurface(aLong12070);
			aBool12071 = true;
		}
		return bool && super.method352();
	}

	public int method2726() {
		return anInt12073;
	}

	public int method2724() {
		return anInt12073;
	}

	public int method2733() {
		return anInt12072;
	}

	public int method8658() {
		if (aLong12070 == 0L)
			throw new IllegalStateException("");
		anOpenGL12069.swapBuffers(aLong12070);
		return 0;
	}

	public int method2729() {
		return anInt12072;
	}

	public void method355() {
		if (aLong12070 != 0L) {
			anOpenGL12069.releaseSurface(aCanvas12074, aLong12070);
			aLong12070 = 0L;
		}
	}

	public void method130() {
		if (aLong12070 != 0L) {
			anOpenGL12069.releaseSurface(aCanvas12074, aLong12070);
			aLong12070 = 0L;
		}
	}

	public int method2725() {
		return anInt12072;
	}

	public int method8653(int i, int i_1_) {
		return 0;
	}

	public int method2731() {
		return anInt12073;
	}

	boolean method354() {
		if (aLong12070 == 0L)
			throw new IllegalStateException("");
		boolean bool = true;
		if (!aBool12071) {
			bool = anOpenGL12069.setSurface(aLong12070);
			aBool12071 = true;
		}
		return bool && super.method352();
	}

	void method10998() {
		Dimension dimension = aCanvas12074.getSize();
		anInt12073 = dimension.height;
		anInt12072 = dimension.width;
	}

	boolean method2730() {
		return true;
	}

	boolean method2734() {
		return true;
	}

	boolean method2735() {
		return true;
	}

	void method8652(int i, int i_2_) {
		if (aLong12070 == 0L)
			throw new IllegalStateException("");
		anOpenGL12069.surfaceResized(aLong12070);
		method10997();
		super.method8652(i, i_2_);
	}

	Class183_Sub1_Sub1_Sub2(Class167_Sub3_Sub1 class167_sub3_sub1, Canvas canvas) {
		this(class167_sub3_sub1, canvas, class167_sub3_sub1.anOpenGL11441.prepareSurface(canvas));
	}

	public int method8654(int i, int i_3_) {
		return 0;
	}

	boolean method2732() {
		return true;
	}

	void method8656(int i, int i_4_) {
		if (aLong12070 == 0L)
			throw new IllegalStateException("");
		anOpenGL12069.surfaceResized(aLong12070);
		method10997();
		super.method8652(i, i_4_);
	}

	void method8649(int i, int i_5_) {
		if (aLong12070 == 0L)
			throw new IllegalStateException("");
		anOpenGL12069.surfaceResized(aLong12070);
		method10997();
		super.method8652(i, i_5_);
	}

	boolean method2727() {
		return true;
	}

	public int method2728() {
		return anInt12072;
	}

	void method8657(int i, int i_6_) {
		if (aLong12070 == 0L)
			throw new IllegalStateException("");
		anOpenGL12069.surfaceResized(aLong12070);
		method10997();
		super.method8652(i, i_6_);
	}
}
