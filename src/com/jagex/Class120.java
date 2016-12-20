/* Class120 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.memory.Buffer;

import jaggl.OpenGL;

public abstract class Class120 {
	Class180_Sub3 aClass180_Sub3_1480;
	static int[] anIntArray1481 = new int[1];
	static final int anInt1482 = 34962;
	int anInt1483;
	static final int anInt1484 = 34963;
	int anInt1485;
	boolean aBool1486;
	boolean aBool1487 = false;
	int anInt1488;

	void method2115() throws Throwable {
		if (!aBool1487) {
			aClass180_Sub3_1480.method15418(anInt1488, anInt1485);
			aBool1487 = true;
		}
		super.finalize();
	}

	Class120(Class180_Sub3 class180_sub3, int i, Buffer buffer, int i_0_, boolean bool) {
		aClass180_Sub3_1480 = class180_sub3;
		anInt1483 = i;
		anInt1485 = i_0_;
		aBool1486 = bool;
		OpenGL.glGenBuffersARB(1, anIntArray1481, 0);
		anInt1488 = anIntArray1481[0];
		method2124();
		OpenGL.glBufferDataARBa(i, anInt1485, buffer.method2(), aBool1486 ? 35040 : 35044);
		aClass180_Sub3_1480.anInt9796 += anInt1485;
	}

	void method2116() throws Throwable {
		if (!aBool1487) {
			aClass180_Sub3_1480.method15418(anInt1488, anInt1485);
			aBool1487 = true;
		}
		super.finalize();
	}

	void method2117(byte[] is, int i) {
		method2124();
		if (i > anInt1485) {
			OpenGL.glBufferDataARBub(anInt1483, i, is, 0, aBool1486 ? 35040 : 35044);
			aClass180_Sub3_1480.anInt9796 += i - anInt1485;
			anInt1485 = i;
		} else
			OpenGL.glBufferSubDataARBub(anInt1483, 0, i, is, 0);
	}

	public void finalize() throws Throwable {
		if (!aBool1487) {
			aClass180_Sub3_1480.method15418(anInt1488, anInt1485);
			aBool1487 = true;
		}
		super.finalize();
	}

	Class120(Class180_Sub3 class180_sub3, int i, byte[] is, int i_1_, boolean bool) {
		aClass180_Sub3_1480 = class180_sub3;
		anInt1483 = i;
		anInt1485 = i_1_;
		aBool1486 = bool;
		OpenGL.glGenBuffersARB(1, anIntArray1481, 0);
		anInt1488 = anIntArray1481[0];
		method2124();
		OpenGL.glBufferDataARBub(i, anInt1485, is, 0, aBool1486 ? 35040 : 35044);
		aClass180_Sub3_1480.anInt9796 += anInt1485;
	}

	void method2118() throws Throwable {
		if (!aBool1487) {
			aClass180_Sub3_1480.method15418(anInt1488, anInt1485);
			aBool1487 = true;
		}
		super.finalize();
	}

	void method2119() throws Throwable {
		if (!aBool1487) {
			aClass180_Sub3_1480.method15418(anInt1488, anInt1485);
			aBool1487 = true;
		}
		super.finalize();
	}

	void method2120() throws Throwable {
		if (!aBool1487) {
			aClass180_Sub3_1480.method15418(anInt1488, anInt1485);
			aBool1487 = true;
		}
		super.finalize();
	}

	void method2121(byte[] is, int i) {
		method2124();
		if (i > anInt1485) {
			OpenGL.glBufferDataARBub(anInt1483, i, is, 0, aBool1486 ? 35040 : 35044);
			aClass180_Sub3_1480.anInt9796 += i - anInt1485;
			anInt1485 = i;
		} else
			OpenGL.glBufferSubDataARBub(anInt1483, 0, i, is, 0);
	}

	abstract void method2122();

	abstract void method2123();

	abstract void method2124();
}
