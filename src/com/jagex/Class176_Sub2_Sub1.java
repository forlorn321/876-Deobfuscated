/* Class176_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class176_Sub2_Sub1 extends Class176_Sub2 {
	Class167_Sub2 aClass167_Sub2_11349;
	Class124_Sub4 aClass124_Sub4_11350;
	static int[] anIntArray11351;
	static int[] anIntArray11352 = new int[4];

	int method10517() {
		return aClass124_Sub4_11350.anInt8986;
	}

	Class124_Sub4 method8648() {
		return aClass124_Sub4_11350;
	}

	boolean method10518(Class124_Sub4 class124_sub4, Class124_Sub4 class124_sub4_0_, float f) {
		boolean bool = true;
		Class183_Sub2_Sub3 class183_sub2_sub3 = aClass167_Sub2_11349.aClass183_Sub2_Sub3_9314;
		aClass167_Sub2_11349.method2054(anIntArray11352);
		aClass167_Sub2_11349.method2051();
		aClass167_Sub2_11349.method2049(anIntArray11351);
		aClass167_Sub2_11349.method8532();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, aClass124_Sub4_11350.anInt8986, aClass124_Sub4_11350.anInt8986);
		aClass167_Sub2_11349.method8563(false);
		aClass167_Sub2_11349.method8611(false);
		aClass167_Sub2_11349.method8566(false);
		aClass167_Sub2_11349.method8599(false);
		aClass167_Sub2_11349.method8553(-2);
		aClass167_Sub2_11349.method8556(1);
		aClass167_Sub2_11349.method8562(0.0F, 0.0F, 0.0F, f);
		aClass167_Sub2_11349.method8558(34165, 34165);
		aClass167_Sub2_11349.method8617(class124_sub4_0_);
		aClass167_Sub2_11349.method8556(0);
		aClass167_Sub2_11349.method8557(1);
		aClass167_Sub2_11349.method8617(class124_sub4);
		aClass167_Sub2_11349.method2028(class183_sub2_sub3, -409819235);
		for (int i = 0; i < 6; i++) {
			int i_1_ = 34069 + i;
			class183_sub2_sub3.method9035(0, aClass124_Sub4_11350.method8442(i_1_, 0));
			class183_sub2_sub3.method10542(0);
			if (class183_sub2_sub3.method9036()) {
				OpenGL.glBegin(7);
				switch (i_1_) {
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
				}
				OpenGL.glEnd();
			} else {
				bool = false;
				break;
			}
		}
		class183_sub2_sub3.method9035(0, null);
		aClass167_Sub2_11349.method2029(class183_sub2_sub3, (byte) 1);
		aClass167_Sub2_11349.method8556(1);
		aClass167_Sub2_11349.method8617(null);
		aClass167_Sub2_11349.method8558(8448, 8448);
		aClass167_Sub2_11349.method8556(0);
		aClass167_Sub2_11349.method8617(null);
		aClass167_Sub2_11349.method2369(anIntArray11352[0], anIntArray11352[1], anIntArray11352[2], anIntArray11352[3]);
		aClass167_Sub2_11349.method2048(anIntArray11351[0], anIntArray11351[1], anIntArray11351[2], anIntArray11351[3]);
		if (bool && !aClass167_Sub2_11349.aBool9265)
			aClass124_Sub4_11350.method1611();
		return bool;
	}

	Class124_Sub4 method8647() {
		return aClass124_Sub4_11350;
	}

	Class176_Sub2_Sub1(Class167_Sub2 class167_sub2, int i) {
		aClass167_Sub2_11349 = class167_sub2;
		aClass124_Sub4_11350 = new Class124_Sub4(class167_sub2, Class155.aClass155_1722, Class171.aClass171_1905, i);
	}

	Class124_Sub4 method8646() {
		return aClass124_Sub4_11350;
	}

	int method10519() {
		return aClass124_Sub4_11350.anInt8986;
	}

	static {
		anIntArray11351 = new int[4];
	}

	int method10520() {
		return aClass124_Sub4_11350.anInt8986;
	}
}
