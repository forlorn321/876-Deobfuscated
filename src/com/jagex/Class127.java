/* Class127 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.memory.Buffer;

import jaggl.OpenGL;

public abstract class Class127 {
	static int[] anIntArray1558 = new int[1];
	static final int anInt1559 = 34963;
	Class167_Sub2 aClass167_Sub2_1560;
	int anInt1561;
	boolean aBool1562 = false;
	static final int anInt1563 = 34962;
	boolean aBool1564;
	int anInt1565;
	int anInt1566;

	Class127(Class167_Sub2 class167_sub2, int i, byte[] is, int i_0_, boolean bool) {
		aClass167_Sub2_1560 = class167_sub2;
		anInt1561 = i;
		anInt1566 = i_0_;
		aBool1564 = bool;
		OpenGL.glGenBuffersARB(1, anIntArray1558, 0);
		anInt1565 = anIntArray1558[0];
		method1644();
		OpenGL.glBufferDataARBub(i, anInt1566, is, 0, aBool1564 ? 35040 : 35044);
		aClass167_Sub2_1560.anInt9184 += anInt1566;
	}

	abstract void method1644();

	void method1645(byte[] is, int i) {
		method1644();
		if (i > anInt1566) {
			OpenGL.glBufferDataARBub(anInt1561, i, is, 0, aBool1564 ? 35040 : 35044);
			aClass167_Sub2_1560.anInt9184 += i - anInt1566;
			anInt1566 = i;
		} else
			OpenGL.glBufferSubDataARBub(anInt1561, 0, i, is, 0);
	}

	public void finalize() throws Throwable {
		if (!aBool1562) {
			aClass167_Sub2_1560.method8591(anInt1565, anInt1566);
			aBool1562 = true;
		}
		super.finalize();
	}

	abstract void method1646();

	void method1647() throws Throwable {
		if (!aBool1562) {
			aClass167_Sub2_1560.method8591(anInt1565, anInt1566);
			aBool1562 = true;
		}
		super.finalize();
	}

	void method1648() throws Throwable {
		if (!aBool1562) {
			aClass167_Sub2_1560.method8591(anInt1565, anInt1566);
			aBool1562 = true;
		}
		super.finalize();
	}

	Class127(Class167_Sub2 class167_sub2, int i, Buffer buffer, int i_1_, boolean bool) {
		aClass167_Sub2_1560 = class167_sub2;
		anInt1561 = i;
		anInt1566 = i_1_;
		aBool1564 = bool;
		OpenGL.glGenBuffersARB(1, anIntArray1558, 0);
		anInt1565 = anIntArray1558[0];
		method1644();
		OpenGL.glBufferDataARBa(i, anInt1566, buffer.method2(), aBool1564 ? 35040 : 35044);
		aClass167_Sub2_1560.anInt9184 += anInt1566;
	}

	abstract void method1649();

	abstract void method1650();
}
