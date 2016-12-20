/* Class171_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;
import java.awt.Dimension;

import jaggl.OpenGL;

public class Class171_Sub1_Sub2 extends Class171_Sub1 {
	int anInt11353;
	Canvas aCanvas11354;
	OpenGL anOpenGL11355;
	long aLong11356;
	Class180_Sub3 aClass180_Sub3_11357;
	boolean aBool11358;
	boolean aBool11359 = false;
	int anInt11360;

	public int method2733() {
		return anInt11360;
	}

	Class171_Sub1_Sub2(Class180_Sub3 class180_sub3, Canvas canvas, long l) {
		aBool11358 = false;
		aClass180_Sub3_11357 = class180_sub3;
		aCanvas11354 = canvas;
		anOpenGL11355 = class180_sub3.anOpenGL9836;
		aLong11356 = l;
		method17928();
	}

	public int method2728() {
		return anInt11360;
	}

	public int method2729() {
		return anInt11353;
	}

	void method14728(int i, int i_0_) {
		if (aBool11359)
			throw new IllegalStateException();
		anOpenGL11355.surfaceResized(aLong11356);
		method17928();
		if (this == aClass180_Sub3_11357.method3285(988720502))
			aClass180_Sub3_11357.method15346();
	}

	void method17928() {
		Dimension dimension = aCanvas11354.getSize();
		anInt11353 = dimension.height;
		anInt11360 = dimension.width;
	}

	public int method14726() {
		if (aBool11359)
			throw new IllegalStateException();
		anOpenGL11355.swapBuffers(aLong11356);
		return 0;
	}

	public int method14727(int i, int i_1_) {
		return 0;
	}

	boolean method348() {
		if (aBool11359)
			throw new IllegalStateException();
		if (!aBool11358) {
			anOpenGL11355.setSurface(aLong11356);
			aBool11358 = true;
		}
		aClass180_Sub3_11357.method15345();
		return true;
	}

	boolean method2731() {
		return true;
	}

	boolean method349() {
		if (aBool11359)
			throw new IllegalStateException();
		if (!aBool11358) {
			anOpenGL11355.setSurface(aLong11356);
			aBool11358 = true;
		}
		aClass180_Sub3_11357.method15345();
		return true;
	}

	public int method2732() {
		return anInt11360;
	}

	void method14730(int i, int i_2_) {
		if (aBool11359)
			throw new IllegalStateException();
		anOpenGL11355.surfaceResized(aLong11356);
		method17928();
		if (this == aClass180_Sub3_11357.method3285(529543142))
			aClass180_Sub3_11357.method15346();
	}

	public int method2730() {
		return anInt11353;
	}

	boolean method351() {
		if (aBool11359)
			throw new IllegalStateException();
		if (!aBool11358) {
			anOpenGL11355.setSurface(aLong11356);
			aBool11358 = true;
		}
		aClass180_Sub3_11357.method15345();
		return true;
	}

	boolean method350() {
		if (aBool11359)
			throw new IllegalStateException();
		if (!aBool11358) {
			anOpenGL11355.setSurface(aLong11356);
			aBool11358 = true;
		}
		aClass180_Sub3_11357.method15345();
		return true;
	}

	public int method14731() {
		if (aBool11359)
			throw new IllegalStateException();
		anOpenGL11355.swapBuffers(aLong11356);
		return 0;
	}

	void method14729(int i, int i_3_) {
		if (aBool11359)
			throw new IllegalStateException();
		anOpenGL11355.surfaceResized(aLong11356);
		method17928();
		if (this == aClass180_Sub3_11357.method3285(1724147730))
			aClass180_Sub3_11357.method15346();
	}

	public void method344() {
		if (aBool11359)
			throw new IllegalStateException();
		anOpenGL11355.releaseSurface(aCanvas11354, aLong11356);
		aBool11359 = true;
		aBool11358 = false;
	}

	Class171_Sub1_Sub2(Class180_Sub3 class180_sub3, Canvas canvas) {
		this(class180_sub3, canvas, class180_sub3.anOpenGL9836.prepareSurface(canvas));
	}

	public void method129() {
		if (aBool11359)
			throw new IllegalStateException();
		anOpenGL11355.releaseSurface(aCanvas11354, aLong11356);
		aBool11359 = true;
		aBool11358 = false;
	}

	boolean method2734() {
		return true;
	}

	public int method14732() {
		if (aBool11359)
			throw new IllegalStateException();
		anOpenGL11355.swapBuffers(aLong11356);
		return 0;
	}

	public int method14733(int i, int i_4_) {
		return 0;
	}

	boolean method352() {
		if (aBool11359)
			throw new IllegalStateException();
		if (!aBool11358) {
			anOpenGL11355.setSurface(aLong11356);
			aBool11358 = true;
		}
		aClass180_Sub3_11357.method15345();
		return true;
	}
}
