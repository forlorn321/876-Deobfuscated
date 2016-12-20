/* Class179_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class179_Sub1_Sub1 extends Class179_Sub1 {
	static int[] anIntArray11388;
	Class118_Sub2 aClass118_Sub2_11389;
	static int[] anIntArray11390 = new int[4];
	Class180_Sub3 aClass180_Sub3_11391;

	Class118_Sub2 method14724() {
		return aClass118_Sub2_11389;
	}

	Class179_Sub1_Sub1(Class180_Sub3 class180_sub3, int i) {
		aClass180_Sub3_11391 = class180_sub3;
		aClass118_Sub2_11389 = new Class118_Sub2(class180_sub3, Class157.aClass157_1723, Class184.aClass184_2104, i);
	}

	Class118_Sub2 method14725() {
		return aClass118_Sub2_11389;
	}

	boolean method17970(Class118_Sub2 class118_sub2, Class118_Sub2 class118_sub2_0_, float f) {
		boolean bool = true;
		Class171_Sub2_Sub2 class171_sub2_sub2 = aClass180_Sub3_11391.aClass171_Sub2_Sub2_9798;
		aClass180_Sub3_11391.method3135(anIntArray11390);
		aClass180_Sub3_11391.method3131();
		aClass180_Sub3_11391.method3129(anIntArray11388);
		aClass180_Sub3_11391.method15371();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, aClass118_Sub2_11389.anInt8938, aClass118_Sub2_11389.anInt8938);
		aClass180_Sub3_11391.method15408(false);
		aClass180_Sub3_11391.method15409(false);
		aClass180_Sub3_11391.method15411(false);
		aClass180_Sub3_11391.method15412(false);
		aClass180_Sub3_11391.method15397(-2);
		aClass180_Sub3_11391.method15400(1);
		aClass180_Sub3_11391.method15406(0.0F, 0.0F, 0.0F, f);
		aClass180_Sub3_11391.method15403(34165, 34165);
		aClass180_Sub3_11391.method15401(class118_sub2_0_);
		aClass180_Sub3_11391.method15400(0);
		aClass180_Sub3_11391.method15402(1);
		aClass180_Sub3_11391.method15401(class118_sub2);
		aClass180_Sub3_11391.method3106(class171_sub2_sub2, (byte) -6);
		for (int i = 0; i < 6; i++) {
			int i_1_ = 34069 + i;
			class171_sub2_sub2.method15321(0, aClass118_Sub2_11389.method14439(i_1_, 0));
			class171_sub2_sub2.method17933(0);
			if (class171_sub2_sub2.method15322()) {
				OpenGL.glBegin(7);
				switch (i_1_) {
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				}
				OpenGL.glEnd();
			} else {
				bool = false;
				break;
			}
		}
		class171_sub2_sub2.method15321(0, null);
		aClass180_Sub3_11391.method3107(class171_sub2_sub2, -677418425);
		aClass180_Sub3_11391.method15400(1);
		aClass180_Sub3_11391.method15401(null);
		aClass180_Sub3_11391.method15403(8448, 8448);
		aClass180_Sub3_11391.method15400(0);
		aClass180_Sub3_11391.method15401(null);
		aClass180_Sub3_11391.method3132(anIntArray11390[0], anIntArray11390[1], anIntArray11390[2], anIntArray11390[3]);
		aClass180_Sub3_11391.method3128(anIntArray11388[0], anIntArray11388[1], anIntArray11388[2], anIntArray11388[3]);
		if (bool && !aClass180_Sub3_11391.aBool9693)
			aClass118_Sub2_11389.method2037();
		return bool;
	}

	static {
		anIntArray11388 = new int[4];
	}

	Class118_Sub2 method14723() {
		return aClass118_Sub2_11389;
	}

	int method17971() {
		return aClass118_Sub2_11389.anInt8938;
	}

	int method17972() {
		return aClass118_Sub2_11389.anInt8938;
	}

	boolean method17973(Class118_Sub2 class118_sub2, Class118_Sub2 class118_sub2_2_, float f) {
		boolean bool = true;
		Class171_Sub2_Sub2 class171_sub2_sub2 = aClass180_Sub3_11391.aClass171_Sub2_Sub2_9798;
		aClass180_Sub3_11391.method3135(anIntArray11390);
		aClass180_Sub3_11391.method3131();
		aClass180_Sub3_11391.method3129(anIntArray11388);
		aClass180_Sub3_11391.method15371();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, aClass118_Sub2_11389.anInt8938, aClass118_Sub2_11389.anInt8938);
		aClass180_Sub3_11391.method15408(false);
		aClass180_Sub3_11391.method15409(false);
		aClass180_Sub3_11391.method15411(false);
		aClass180_Sub3_11391.method15412(false);
		aClass180_Sub3_11391.method15397(-2);
		aClass180_Sub3_11391.method15400(1);
		aClass180_Sub3_11391.method15406(0.0F, 0.0F, 0.0F, f);
		aClass180_Sub3_11391.method15403(34165, 34165);
		aClass180_Sub3_11391.method15401(class118_sub2_2_);
		aClass180_Sub3_11391.method15400(0);
		aClass180_Sub3_11391.method15402(1);
		aClass180_Sub3_11391.method15401(class118_sub2);
		aClass180_Sub3_11391.method3106(class171_sub2_sub2, (byte) -54);
		for (int i = 0; i < 6; i++) {
			int i_3_ = 34069 + i;
			class171_sub2_sub2.method15321(0, aClass118_Sub2_11389.method14439(i_3_, 0));
			class171_sub2_sub2.method17933(0);
			if (class171_sub2_sub2.method15322()) {
				OpenGL.glBegin(7);
				switch (i_3_) {
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				}
				OpenGL.glEnd();
			} else {
				bool = false;
				break;
			}
		}
		class171_sub2_sub2.method15321(0, null);
		aClass180_Sub3_11391.method3107(class171_sub2_sub2, -677418425);
		aClass180_Sub3_11391.method15400(1);
		aClass180_Sub3_11391.method15401(null);
		aClass180_Sub3_11391.method15403(8448, 8448);
		aClass180_Sub3_11391.method15400(0);
		aClass180_Sub3_11391.method15401(null);
		aClass180_Sub3_11391.method3132(anIntArray11390[0], anIntArray11390[1], anIntArray11390[2], anIntArray11390[3]);
		aClass180_Sub3_11391.method3128(anIntArray11388[0], anIntArray11388[1], anIntArray11388[2], anIntArray11388[3]);
		if (bool && !aClass180_Sub3_11391.aBool9693)
			aClass118_Sub2_11389.method2037();
		return bool;
	}
}
