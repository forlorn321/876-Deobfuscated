/* Class128_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class128_Sub2 extends Class128 {
	boolean aBool8897 = false;
	static final char aChar8898 = '\001';
	Class125 aClass125_8899;
	static final char aChar8900 = '\0';

	void method1671(int i, int i_0_) {
		/* empty */
	}

	boolean method1652() {
		return true;
	}

	void method1653(boolean bool) {
		Class124_Sub4 class124_sub4 = aClass167_Sub2_1567.method8594();
		if (aClass125_8899 != null && class124_sub4 != null && bool) {
			aClass125_8899.method1639('\0');
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(class124_sub4);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((aClass167_Sub2_1567.aClass443_9208.method5360(aClass167_Sub2_1567.aFloatArray9333)), 0);
			OpenGL.glScalef(1.0F, -1.0F, -1.0F);
			OpenGL.glMatrixMode(5888);
			aClass167_Sub2_1567.method8556(0);
			aBool8897 = true;
		} else
			aClass167_Sub2_1567.method8560(0, 34168, 770);
	}

	void method1673(boolean bool) {
		aClass167_Sub2_1567.method8558(8448, 7681);
	}

	void method1654() {
		if (aBool8897) {
			aClass125_8899.method1639('\001');
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
		} else
			aClass167_Sub2_1567.method8560(0, 5890, 770);
		aClass167_Sub2_1567.method8558(8448, 8448);
		aBool8897 = false;
	}

	void method1656(int i, int i_1_) {
		/* empty */
	}

	void method1661() {
		if (aBool8897) {
			aClass125_8899.method1639('\001');
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
		} else
			aClass167_Sub2_1567.method8560(0, 5890, 770);
		aClass167_Sub2_1567.method8558(8448, 8448);
		aBool8897 = false;
	}

	boolean method1657() {
		return true;
	}

	boolean method1658() {
		return true;
	}

	void method1667(boolean bool) {
		Class124_Sub4 class124_sub4 = aClass167_Sub2_1567.method8594();
		if (aClass125_8899 != null && class124_sub4 != null && bool) {
			aClass125_8899.method1639('\0');
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(class124_sub4);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((aClass167_Sub2_1567.aClass443_9208.method5360(aClass167_Sub2_1567.aFloatArray9333)), 0);
			OpenGL.glScalef(1.0F, -1.0F, -1.0F);
			OpenGL.glMatrixMode(5888);
			aClass167_Sub2_1567.method8556(0);
			aBool8897 = true;
		} else
			aClass167_Sub2_1567.method8560(0, 34168, 770);
	}

	void method1660(boolean bool) {
		Class124_Sub4 class124_sub4 = aClass167_Sub2_1567.method8594();
		if (aClass125_8899 != null && class124_sub4 != null && bool) {
			aClass125_8899.method1639('\0');
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(class124_sub4);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((aClass167_Sub2_1567.aClass443_9208.method5360(aClass167_Sub2_1567.aFloatArray9333)), 0);
			OpenGL.glScalef(1.0F, -1.0F, -1.0F);
			OpenGL.glMatrixMode(5888);
			aClass167_Sub2_1567.method8556(0);
			aBool8897 = true;
		} else
			aClass167_Sub2_1567.method8560(0, 34168, 770);
	}

	Class128_Sub2(Class167_Sub2 class167_sub2) {
		super(class167_sub2);
		if (class167_sub2.aBool9298) {
			aClass125_8899 = new Class125(class167_sub2, 2);
			aClass125_8899.method1636(0);
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8558(34165, 7681);
			aClass167_Sub2_1567.method8520(2, 34168, 770);
			aClass167_Sub2_1567.method8560(0, 34167, 770);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			aClass167_Sub2_1567.method8556(0);
			aClass125_8899.method1638();
			aClass125_8899.method1636(1);
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8558(8448, 8448);
			aClass167_Sub2_1567.method8520(2, 34166, 770);
			aClass167_Sub2_1567.method8560(0, 5890, 770);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			aClass167_Sub2_1567.method8556(0);
			aClass125_8899.method1638();
		}
	}

	void method1662(boolean bool) {
		Class124_Sub4 class124_sub4 = aClass167_Sub2_1567.method8594();
		if (aClass125_8899 != null && class124_sub4 != null && bool) {
			aClass125_8899.method1639('\0');
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(class124_sub4);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((aClass167_Sub2_1567.aClass443_9208.method5360(aClass167_Sub2_1567.aFloatArray9333)), 0);
			OpenGL.glScalef(1.0F, -1.0F, -1.0F);
			OpenGL.glMatrixMode(5888);
			aClass167_Sub2_1567.method8556(0);
			aBool8897 = true;
		} else
			aClass167_Sub2_1567.method8560(0, 34168, 770);
	}

	void method1655(boolean bool) {
		aClass167_Sub2_1567.method8558(8448, 7681);
	}

	void method1664(boolean bool) {
		aClass167_Sub2_1567.method8558(8448, 7681);
	}

	void method1665(boolean bool) {
		aClass167_Sub2_1567.method8558(8448, 7681);
	}

	void method1670() {
		if (aBool8897) {
			aClass125_8899.method1639('\001');
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
		} else
			aClass167_Sub2_1567.method8560(0, 5890, 770);
		aClass167_Sub2_1567.method8558(8448, 8448);
		aBool8897 = false;
	}

	void method1651() {
		if (aBool8897) {
			aClass125_8899.method1639('\001');
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
		} else
			aClass167_Sub2_1567.method8560(0, 5890, 770);
		aClass167_Sub2_1567.method8558(8448, 8448);
		aBool8897 = false;
	}

	void method1672(Class124 class124, int i) {
		aClass167_Sub2_1567.method8617(class124);
		aClass167_Sub2_1567.method8557(i);
	}

	void method1669() {
		if (aBool8897) {
			aClass125_8899.method1639('\001');
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
		} else
			aClass167_Sub2_1567.method8560(0, 5890, 770);
		aClass167_Sub2_1567.method8558(8448, 8448);
		aBool8897 = false;
	}

	boolean method1659() {
		return true;
	}

	void method1666(boolean bool) {
		aClass167_Sub2_1567.method8558(8448, 7681);
	}

	void method1674(Class124 class124, int i) {
		aClass167_Sub2_1567.method8617(class124);
		aClass167_Sub2_1567.method8557(i);
	}

	void method1668(Class124 class124, int i) {
		aClass167_Sub2_1567.method8617(class124);
		aClass167_Sub2_1567.method8557(i);
	}

	void method1663(Class124 class124, int i) {
		aClass167_Sub2_1567.method8617(class124);
		aClass167_Sub2_1567.method8557(i);
	}
}
