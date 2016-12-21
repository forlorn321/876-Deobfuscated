/* Class536_Sub8_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class536_Sub8_Sub1_Sub1 extends Class536_Sub8_Sub1 {
	int[] anIntArray12057 = null;
	Class286_Sub2 aClass286_Sub2_12058;

	public boolean method10655(int i) {
		if (anIntArray12057 == null)
			anIntArray12057 = new int[aClass286_Sub2_12058.method3848(1709604225)];
		Class285_Sub2 class285_sub2 = (Class285_Sub2) aClass286_Sub2_12058.method3871(i, -1670319399);
		anIntArray12057[i] = OpenGL.glGetUniformLocation(class285_sub2.anInt10055, method10641(-2089639720));
		return anIntArray12057[i] != -1;
	}

	public boolean method10646(int i) {
		if (anIntArray12057 == null)
			anIntArray12057 = new int[aClass286_Sub2_12058.method3848(1358198665)];
		Class285_Sub2 class285_sub2 = (Class285_Sub2) aClass286_Sub2_12058.method3871(i, 744520496);
		anIntArray12057[i] = OpenGL.glGetUniformLocation(class285_sub2.anInt10055, method10641(-438300153));
		return anIntArray12057[i] != -1;
	}

	public boolean method10640(int i) {
		if (anIntArray12057 == null)
			anIntArray12057 = new int[aClass286_Sub2_12058.method3848(1718506450)];
		Class285_Sub2 class285_sub2 = (Class285_Sub2) aClass286_Sub2_12058.method3871(i, -456411483);
		anIntArray12057[i] = OpenGL.glGetUniformLocation(class285_sub2.anInt10055, method10641(2142259308));
		return anIntArray12057[i] != -1;
	}

	public final int method10647(int i) {
		return anIntArray12057[i];
	}

	public final int method10653(int i) {
		return anIntArray12057[i];
	}

	final int method10984() {
		return anIntArray12057[aClass286_Sub2_12058.method3852(373377258)];
	}

	public boolean method10648(int i) {
		if (anIntArray12057 == null)
			anIntArray12057 = new int[aClass286_Sub2_12058.method3848(1588738120)];
		Class285_Sub2 class285_sub2 = (Class285_Sub2) aClass286_Sub2_12058.method3871(i, -1829755271);
		anIntArray12057[i] = OpenGL.glGetUniformLocation(class285_sub2.anInt10055, method10641(1186568022));
		return anIntArray12057[i] != -1;
	}

	public boolean method10645(int i) {
		if (anIntArray12057 == null)
			anIntArray12057 = new int[aClass286_Sub2_12058.method3848(1308517008)];
		Class285_Sub2 class285_sub2 = (Class285_Sub2) aClass286_Sub2_12058.method3871(i, 1318515231);
		anIntArray12057[i] = OpenGL.glGetUniformLocation(class285_sub2.anInt10055, method10641(-2015045050));
		return anIntArray12057[i] != -1;
	}

	public boolean method10650(int i) {
		if (anIntArray12057 == null)
			anIntArray12057 = new int[aClass286_Sub2_12058.method3848(1579746904)];
		Class285_Sub2 class285_sub2 = (Class285_Sub2) aClass286_Sub2_12058.method3871(i, -1959267106);
		anIntArray12057[i] = OpenGL.glGetUniformLocation(class285_sub2.anInt10055, method10641(-1263875190));
		return anIntArray12057[i] != -1;
	}

	Class536_Sub8_Sub1_Sub1(Class286_Sub2 class286_sub2, Class265 class265) {
		super(class265);
		aClass286_Sub2_12058 = class286_sub2;
	}

	public final int method10656(int i) {
		return anIntArray12057[i];
	}

	final int method10985() {
		return anIntArray12057[aClass286_Sub2_12058.method3852(1184729581)];
	}
}
