/* Class183_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;
import java.awt.Dimension;

import jaggl.OpenGL;

public class Class183_Sub1_Sub3 extends Class183_Sub1 {
	boolean aBool11385;
	Canvas aCanvas11386;
	OpenGL anOpenGL11387;
	Class167_Sub2 aClass167_Sub2_11388;
	int anInt11389;
	int anInt11390;
	long aLong11391;
	boolean aBool11392 = false;

	boolean method354() {
		if (aBool11392)
			throw new IllegalStateException();
		if (!aBool11385) {
			anOpenGL11387.setSurface(aLong11391);
			aBool11385 = true;
		}
		aClass167_Sub2_11388.method8512();
		return true;
	}

	Class183_Sub1_Sub3(Class167_Sub2 class167_sub2, Canvas canvas, long l) {
		aBool11385 = false;
		aClass167_Sub2_11388 = class167_sub2;
		aCanvas11386 = canvas;
		anOpenGL11387 = class167_sub2.anOpenGL9163;
		aLong11391 = l;
		method10549();
	}

	boolean method2735() {
		return true;
	}

	void method8656(int i, int i_0_) {
		if (aBool11392)
			throw new IllegalStateException();
		anOpenGL11387.surfaceResized(aLong11391);
		method10549();
		if (this == aClass167_Sub2_11388.method2278((byte) -28))
			aClass167_Sub2_11388.method8513();
	}

	public int method2729() {
		return anInt11389;
	}

	void method10549() {
		Dimension dimension = aCanvas11386.getSize();
		anInt11390 = dimension.height;
		anInt11389 = dimension.width;
	}

	void method8652(int i, int i_1_) {
		if (aBool11392)
			throw new IllegalStateException();
		anOpenGL11387.surfaceResized(aLong11391);
		method10549();
		if (this == aClass167_Sub2_11388.method2278((byte) -50))
			aClass167_Sub2_11388.method8513();
	}

	public int method8651(int i, int i_2_) {
		return 0;
	}

	boolean method352() {
		if (aBool11392)
			throw new IllegalStateException();
		if (!aBool11385) {
			anOpenGL11387.setSurface(aLong11391);
			aBool11385 = true;
		}
		aClass167_Sub2_11388.method8512();
		return true;
	}

	boolean method2727() {
		return true;
	}

	public void method131() {
		if (aBool11392)
			throw new IllegalStateException();
		anOpenGL11387.releaseSurface(aCanvas11386, aLong11391);
		aBool11392 = true;
		aBool11385 = false;
	}

	public int method2733() {
		return anInt11389;
	}

	public int method2728() {
		return anInt11389;
	}

	public void method130() {
		if (aBool11392)
			throw new IllegalStateException();
		anOpenGL11387.releaseSurface(aCanvas11386, aLong11391);
		aBool11392 = true;
		aBool11385 = false;
	}

	public int method2725() {
		return anInt11389;
	}

	public int method8650() {
		if (aBool11392)
			throw new IllegalStateException();
		anOpenGL11387.swapBuffers(aLong11391);
		return 0;
	}

	public void method129() {
		if (aBool11392)
			throw new IllegalStateException();
		anOpenGL11387.releaseSurface(aCanvas11386, aLong11391);
		aBool11392 = true;
		aBool11385 = false;
	}

	public int method2724() {
		return anInt11390;
	}

	public int method2731() {
		return anInt11390;
	}

	public int method2726() {
		return anInt11390;
	}

	boolean method2732() {
		return true;
	}

	public int method8658() {
		if (aBool11392)
			throw new IllegalStateException();
		anOpenGL11387.swapBuffers(aLong11391);
		return 0;
	}

	boolean method2730() {
		return true;
	}

	Class183_Sub1_Sub3(Class167_Sub2 class167_sub2, Canvas canvas) {
		this(class167_sub2, canvas, class167_sub2.anOpenGL9163.prepareSurface(canvas));
	}

	public int method8655() {
		if (aBool11392)
			throw new IllegalStateException();
		anOpenGL11387.swapBuffers(aLong11391);
		return 0;
	}

	public void method355() {
		if (aBool11392)
			throw new IllegalStateException();
		anOpenGL11387.releaseSurface(aCanvas11386, aLong11391);
		aBool11392 = true;
		aBool11385 = false;
	}

	public int method8654(int i, int i_3_) {
		return 0;
	}

	public int method8653(int i, int i_4_) {
		return 0;
	}

	void method10550() {
		Dimension dimension = aCanvas11386.getSize();
		anInt11390 = dimension.height;
		anInt11389 = dimension.width;
	}

	void method10551() {
		Dimension dimension = aCanvas11386.getSize();
		anInt11390 = dimension.height;
		anInt11389 = dimension.width;
	}

	boolean method2734() {
		return true;
	}

	void method8649(int i, int i_5_) {
		if (aBool11392)
			throw new IllegalStateException();
		anOpenGL11387.surfaceResized(aLong11391);
		method10549();
		if (this == aClass167_Sub2_11388.method2278((byte) 40))
			aClass167_Sub2_11388.method8513();
	}

	void method8657(int i, int i_6_) {
		if (aBool11392)
			throw new IllegalStateException();
		anOpenGL11387.surfaceResized(aLong11391);
		method10549();
		if (this == aClass167_Sub2_11388.method2278((byte) 30))
			aClass167_Sub2_11388.method8513();
	}
}
