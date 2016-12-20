/* Class479 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public abstract class Class479 implements Interface34 {
	static int[] anIntArray5396 = new int[1];
	int anInt5397 = -1;
	Class180_Sub2_Sub1 aClass180_Sub2_Sub1_5398;
	int anInt5399;
	boolean aBool5400;
	int anInt5401;
	int anInt5402;
	static final int anInt5403 = 34963;
	NativeHeapBuffer aNativeHeapBuffer5404;
	static final int anInt5405 = 34962;

	void method324(int i) {
		if (i > anInt5402) {
			method7795();
			if (anInt5397 > 0) {
				OpenGL.glBindBufferARB(anInt5399, anInt5397);
				OpenGL.glBufferDataARBub(anInt5399, i, null, 0, aBool5400 ? 35040 : 35044);
				aClass180_Sub2_Sub1_5398.anInt9502 += i - anInt5402;
			} else
				aNativeHeapBuffer5404 = aClass180_Sub2_Sub1_5398.method14921(i, false);
			anInt5402 = i;
		}
		anInt5401 = i;
	}

	void method7788() {
		if (anInt5397 < 0) {
			if (aClass180_Sub2_Sub1_5398.aBool11488) {
				OpenGL.glGenBuffersARB(1, anIntArray5396, 0);
				anInt5397 = anIntArray5396[0];
				OpenGL.glBindBufferARB(anInt5399, anInt5397);
			} else
				anInt5397 = 0;
		}
	}

	public int method6() {
		return anInt5401;
	}

	long method7789() {
		return anInt5397 == 0 ? aNativeHeapBuffer5404.method2() : 0L;
	}

	void method7790() {
		if (aClass180_Sub2_Sub1_5398.aBool11488)
			OpenGL.glBindBufferARB(anInt5399, anInt5397);
	}

	void method7791() {
		if (aClass180_Sub2_Sub1_5398.aBool11488)
			OpenGL.glBindBufferARB(anInt5399, anInt5397);
	}

	public long method209(int i, int i_0_) {
		OpenGL.glBindBufferARB(anInt5399, anInt5397);
		return OpenGL.glMapBufferARB(anInt5399, 35001) + (long) i;
	}

	public long method215(int i, int i_1_) {
		OpenGL.glBindBufferARB(anInt5399, anInt5397);
		return OpenGL.glMapBufferARB(anInt5399, 35001) + (long) i;
	}

	public boolean method213(int i, int i_2_, long l) {
		method7795();
		if (anInt5397 > 0) {
			OpenGL.glBindBufferARB(anInt5399, anInt5397);
			OpenGL.glBufferSubDataARBa(anInt5399, i, i_2_, l);
		} else
			aNativeHeapBuffer5404.aNativeHeap1098.copy(aNativeHeapBuffer5404.method2() + (long) i, l, i_2_);
		return true;
	}

	public void method217() {
		OpenGL.glUnmapBufferARB(anInt5399);
	}

	public void finalize() throws Throwable {
		method129();
		super.finalize();
	}

	void method130() {
		if (anInt5397 > 0) {
			aClass180_Sub2_Sub1_5398.method18011(anInt5397, anInt5401);
			anInt5397 = -1;
		}
	}

	void method7792() throws Throwable {
		method129();
		super.finalize();
	}

	public long method216(int i, int i_3_) {
		OpenGL.glBindBufferARB(anInt5399, anInt5397);
		return OpenGL.glMapBufferARB(anInt5399, 35001) + (long) i;
	}

	void method325(int i) {
		if (i > anInt5402) {
			method7795();
			if (anInt5397 > 0) {
				OpenGL.glBindBufferARB(anInt5399, anInt5397);
				OpenGL.glBufferDataARBub(anInt5399, i, null, 0, aBool5400 ? 35040 : 35044);
				aClass180_Sub2_Sub1_5398.anInt9502 += i - anInt5402;
			} else
				aNativeHeapBuffer5404 = aClass180_Sub2_Sub1_5398.method14921(i, false);
			anInt5402 = i;
		}
		anInt5401 = i;
	}

	void method7793() throws Throwable {
		method129();
		super.finalize();
	}

	void method327(int i) {
		if (i > anInt5402) {
			method7795();
			if (anInt5397 > 0) {
				OpenGL.glBindBufferARB(anInt5399, anInt5397);
				OpenGL.glBufferDataARBub(anInt5399, i, null, 0, aBool5400 ? 35040 : 35044);
				aClass180_Sub2_Sub1_5398.anInt9502 += i - anInt5402;
			} else
				aNativeHeapBuffer5404 = aClass180_Sub2_Sub1_5398.method14921(i, false);
			anInt5402 = i;
		}
		anInt5401 = i;
	}

	public int method194() {
		return anInt5401;
	}

	void method7794() throws Throwable {
		method129();
		super.finalize();
	}

	public long method210(int i, int i_4_) {
		OpenGL.glBindBufferARB(anInt5399, anInt5397);
		return OpenGL.glMapBufferARB(anInt5399, 35001) + (long) i;
	}

	public long method214(int i, int i_5_) {
		OpenGL.glBindBufferARB(anInt5399, anInt5397);
		return OpenGL.glMapBufferARB(anInt5399, 35001) + (long) i;
	}

	public boolean method212(int i, int i_6_, long l) {
		method7795();
		if (anInt5397 > 0) {
			OpenGL.glBindBufferARB(anInt5399, anInt5397);
			OpenGL.glBufferSubDataARBa(anInt5399, i, i_6_, l);
		} else
			aNativeHeapBuffer5404.aNativeHeap1098.copy(aNativeHeapBuffer5404.method2() + (long) i, l, i_6_);
		return true;
	}

	Class479(Class180_Sub2_Sub1 class180_sub2_sub1, int i, boolean bool) {
		aClass180_Sub2_Sub1_5398 = class180_sub2_sub1;
		anInt5399 = i;
		aBool5400 = bool;
	}

	void method7795() {
		if (anInt5397 < 0) {
			if (aClass180_Sub2_Sub1_5398.aBool11488) {
				OpenGL.glGenBuffersARB(1, anIntArray5396, 0);
				anInt5397 = anIntArray5396[0];
				OpenGL.glBindBufferARB(anInt5399, anInt5397);
			} else
				anInt5397 = 0;
		}
	}

	void method129() {
		if (anInt5397 > 0) {
			aClass180_Sub2_Sub1_5398.method18011(anInt5397, anInt5401);
			anInt5397 = -1;
		}
	}

	void method323(int i) {
		if (i > anInt5402) {
			method7795();
			if (anInt5397 > 0) {
				OpenGL.glBindBufferARB(anInt5399, anInt5397);
				OpenGL.glBufferDataARBub(anInt5399, i, null, 0, aBool5400 ? 35040 : 35044);
				aClass180_Sub2_Sub1_5398.anInt9502 += i - anInt5402;
			} else
				aNativeHeapBuffer5404 = aClass180_Sub2_Sub1_5398.method14921(i, false);
			anInt5402 = i;
		}
		anInt5401 = i;
	}

	public void method211() {
		OpenGL.glUnmapBufferARB(anInt5399);
	}

	void method7796() throws Throwable {
		method129();
		super.finalize();
	}

	void method328(int i) {
		if (i > anInt5402) {
			method7795();
			if (anInt5397 > 0) {
				OpenGL.glBindBufferARB(anInt5399, anInt5397);
				OpenGL.glBufferDataARBub(anInt5399, i, null, 0, aBool5400 ? 35040 : 35044);
				aClass180_Sub2_Sub1_5398.anInt9502 += i - anInt5402;
			} else
				aNativeHeapBuffer5404 = aClass180_Sub2_Sub1_5398.method14921(i, false);
			anInt5402 = i;
		}
		anInt5401 = i;
	}

	void method7797() {
		if (anInt5397 < 0) {
			if (aClass180_Sub2_Sub1_5398.aBool11488) {
				OpenGL.glGenBuffersARB(1, anIntArray5396, 0);
				anInt5397 = anIntArray5396[0];
				OpenGL.glBindBufferARB(anInt5399, anInt5397);
			} else
				anInt5397 = 0;
		}
	}

	long method7798() {
		return anInt5397 == 0 ? aNativeHeapBuffer5404.method2() : 0L;
	}

	void method7799() {
		if (aClass180_Sub2_Sub1_5398.aBool11488)
			OpenGL.glBindBufferARB(anInt5399, anInt5397);
	}

	void method7800() {
		if (aClass180_Sub2_Sub1_5398.aBool11488)
			OpenGL.glBindBufferARB(anInt5399, anInt5397);
	}

	void method7801() throws Throwable {
		method129();
		super.finalize();
	}

	void method7802() {
		if (aClass180_Sub2_Sub1_5398.aBool11488)
			OpenGL.glBindBufferARB(anInt5399, anInt5397);
	}
}
