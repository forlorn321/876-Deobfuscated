/* Class527_Sub18_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class527_Sub18_Sub1_Sub1 extends Class527_Sub18_Sub1 {
	int[] anIntArray12068 = null;
	Class261_Sub1 aClass261_Sub1_12069;

	public boolean method18143(int i) {
		if (anIntArray12068 == null)
			anIntArray12068 = new int[aClass261_Sub1_12069.method4806(-1784678551)];
		Class265_Sub1 class265_sub1 = (Class265_Sub1) aClass261_Sub1_12069.method4841(i, (byte) -66);
		anIntArray12068[i] = OpenGL.glGetUniformLocation(class265_sub1.anInt9978, method18150(1884475632));
		return anIntArray12068[i] != -1;
	}

	final int method18723() {
		return anIntArray12068[aClass261_Sub1_12069.method4925((byte) -54)];
	}

	public boolean method18144(int i) {
		if (anIntArray12068 == null)
			anIntArray12068 = new int[aClass261_Sub1_12069.method4806(1452065282)];
		Class265_Sub1 class265_sub1 = (Class265_Sub1) aClass261_Sub1_12069.method4841(i, (byte) 5);
		anIntArray12068[i] = OpenGL.glGetUniformLocation(class265_sub1.anInt9978, method18150(2008967394));
		return anIntArray12068[i] != -1;
	}

	public final int method18146(int i) {
		return anIntArray12068[i];
	}

	public boolean method18161(int i) {
		if (anIntArray12068 == null)
			anIntArray12068 = new int[aClass261_Sub1_12069.method4806(-1289930188)];
		Class265_Sub1 class265_sub1 = (Class265_Sub1) aClass261_Sub1_12069.method4841(i, (byte) 66);
		anIntArray12068[i] = OpenGL.glGetUniformLocation(class265_sub1.anInt9978, method18150(1876899983));
		return anIntArray12068[i] != -1;
	}

	public final int method18158(int i) {
		return anIntArray12068[i];
	}

	public final int method18163(int i) {
		return anIntArray12068[i];
	}

	public final int method18164(int i) {
		return anIntArray12068[i];
	}

	final int method18724() {
		return anIntArray12068[aClass261_Sub1_12069.method4925((byte) -65)];
	}

	final int method18725() {
		return anIntArray12068[aClass261_Sub1_12069.method4925((byte) -104)];
	}

	Class527_Sub18_Sub1_Sub1(Class261_Sub1 class261_sub1, Class275 class275) {
		super(class275);
		aClass261_Sub1_12069 = class261_sub1;
	}
}
