/* Class488 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public abstract class Class488 implements Interface37 {
	int anInt5444;
	static final int anInt5445 = 34963;
	Class167_Sub3_Sub1 aClass167_Sub3_Sub1_5446;
	static final int anInt5447 = 34962;
	int anInt5448;
	int anInt5449 = -1;
	int anInt5450;
	static int[] anIntArray5451 = new int[1];
	NativeHeapBuffer aNativeHeapBuffer5452;
	boolean aBool5453;

	public boolean method264(int i, int i_0_, long l) {
		method5865();
		if (anInt5449 > 0) {
			OpenGL.glBindBufferARB(anInt5450, anInt5449);
			OpenGL.glBufferSubDataARBa(anInt5450, i, i_0_, l);
		} else
			aNativeHeapBuffer5452.aNativeHeap1105.copy(aNativeHeapBuffer5452.method2() + (long) i, l, i_0_);
		return true;
	}

	void method284(int i) {
		if (i > anInt5444) {
			method5865();
			if (anInt5449 > 0) {
				OpenGL.glBindBufferARB(anInt5450, anInt5449);
				OpenGL.glBufferDataARBub(anInt5450, i, null, 0, aBool5453 ? 35040 : 35044);
				aClass167_Sub3_Sub1_5446.anInt9557 += i - anInt5444;
			} else
				aNativeHeapBuffer5452 = aClass167_Sub3_Sub1_5446.method8736(i, false);
			anInt5444 = i;
		}
		anInt5448 = i;
	}

	public int method73() {
		return anInt5448;
	}

	long method5864() {
		return anInt5449 == 0 ? aNativeHeapBuffer5452.method2() : 0L;
	}

	void method283(int i) {
		if (i > anInt5444) {
			method5865();
			if (anInt5449 > 0) {
				OpenGL.glBindBufferARB(anInt5450, anInt5449);
				OpenGL.glBufferDataARBub(anInt5450, i, null, 0, aBool5453 ? 35040 : 35044);
				aClass167_Sub3_Sub1_5446.anInt9557 += i - anInt5444;
			} else
				aNativeHeapBuffer5452 = aClass167_Sub3_Sub1_5446.method8736(i, false);
			anInt5444 = i;
		}
		anInt5448 = i;
	}

	void method5865() {
		if (anInt5449 < 0) {
			if (aClass167_Sub3_Sub1_5446.aBool11433) {
				OpenGL.glGenBuffersARB(1, anIntArray5451, 0);
				anInt5449 = anIntArray5451[0];
				OpenGL.glBindBufferARB(anInt5450, anInt5449);
			} else
				anInt5449 = 0;
		}
	}

	public void method270() {
		OpenGL.glUnmapBufferARB(anInt5450);
	}

	public void method265() {
		OpenGL.glUnmapBufferARB(anInt5450);
	}

	public long method269(int i, int i_1_) {
		OpenGL.glBindBufferARB(anInt5450, anInt5449);
		return OpenGL.glMapBufferARB(anInt5450, 35001) + (long) i;
	}

	Class488(Class167_Sub3_Sub1 class167_sub3_sub1, int i, boolean bool) {
		aClass167_Sub3_Sub1_5446 = class167_sub3_sub1;
		anInt5450 = i;
		aBool5453 = bool;
	}

	public void finalize() throws Throwable {
		method131();
		super.finalize();
	}

	void method130() {
		if (anInt5449 > 0) {
			aClass167_Sub3_Sub1_5446.method10560(anInt5449, anInt5448);
			anInt5449 = -1;
		}
	}

	void method129() {
		if (anInt5449 > 0) {
			aClass167_Sub3_Sub1_5446.method10560(anInt5449, anInt5448);
			anInt5449 = -1;
		}
	}

	void method5866() throws Throwable {
		method131();
		super.finalize();
	}

	void method5867() throws Throwable {
		method131();
		super.finalize();
	}

	public int method9() {
		return anInt5448;
	}

	void method131() {
		if (anInt5449 > 0) {
			aClass167_Sub3_Sub1_5446.method10560(anInt5449, anInt5448);
			anInt5449 = -1;
		}
	}

	public boolean method266(int i, int i_2_, long l) {
		method5865();
		if (anInt5449 > 0) {
			OpenGL.glBindBufferARB(anInt5450, anInt5449);
			OpenGL.glBufferSubDataARBa(anInt5450, i, i_2_, l);
		} else
			aNativeHeapBuffer5452.aNativeHeap1105.copy(aNativeHeapBuffer5452.method2() + (long) i, l, i_2_);
		return true;
	}

	public long method268(int i, int i_3_) {
		OpenGL.glBindBufferARB(anInt5450, anInt5449);
		return OpenGL.glMapBufferARB(anInt5450, 35001) + (long) i;
	}

	void method5868() {
		if (aClass167_Sub3_Sub1_5446.aBool11433)
			OpenGL.glBindBufferARB(anInt5450, anInt5449);
	}

	public long method263(int i, int i_4_) {
		OpenGL.glBindBufferARB(anInt5450, anInt5449);
		return OpenGL.glMapBufferARB(anInt5450, 35001) + (long) i;
	}

	void method280(int i) {
		if (i > anInt5444) {
			method5865();
			if (anInt5449 > 0) {
				OpenGL.glBindBufferARB(anInt5450, anInt5449);
				OpenGL.glBufferDataARBub(anInt5450, i, null, 0, aBool5453 ? 35040 : 35044);
				aClass167_Sub3_Sub1_5446.anInt9557 += i - anInt5444;
			} else
				aNativeHeapBuffer5452 = aClass167_Sub3_Sub1_5446.method8736(i, false);
			anInt5444 = i;
		}
		anInt5448 = i;
	}

	public int method267() {
		return anInt5448;
	}

	void method5869() {
		if (anInt5449 < 0) {
			if (aClass167_Sub3_Sub1_5446.aBool11433) {
				OpenGL.glGenBuffersARB(1, anIntArray5451, 0);
				anInt5449 = anIntArray5451[0];
				OpenGL.glBindBufferARB(anInt5450, anInt5449);
			} else
				anInt5449 = 0;
		}
	}

	void method5870() {
		if (anInt5449 < 0) {
			if (aClass167_Sub3_Sub1_5446.aBool11433) {
				OpenGL.glGenBuffersARB(1, anIntArray5451, 0);
				anInt5449 = anIntArray5451[0];
				OpenGL.glBindBufferARB(anInt5450, anInt5449);
			} else
				anInt5449 = 0;
		}
	}

	void method5871() {
		if (anInt5449 < 0) {
			if (aClass167_Sub3_Sub1_5446.aBool11433) {
				OpenGL.glGenBuffersARB(1, anIntArray5451, 0);
				anInt5449 = anIntArray5451[0];
				OpenGL.glBindBufferARB(anInt5450, anInt5449);
			} else
				anInt5449 = 0;
		}
	}

	void method5872() {
		if (anInt5449 < 0) {
			if (aClass167_Sub3_Sub1_5446.aBool11433) {
				OpenGL.glGenBuffersARB(1, anIntArray5451, 0);
				anInt5449 = anIntArray5451[0];
				OpenGL.glBindBufferARB(anInt5450, anInt5449);
			} else
				anInt5449 = 0;
		}
	}

	void method5873() {
		if (aClass167_Sub3_Sub1_5446.aBool11433)
			OpenGL.glBindBufferARB(anInt5450, anInt5449);
	}

	void method5874() {
		if (aClass167_Sub3_Sub1_5446.aBool11433)
			OpenGL.glBindBufferARB(anInt5450, anInt5449);
	}

	void method5875() {
		if (aClass167_Sub3_Sub1_5446.aBool11433)
			OpenGL.glBindBufferARB(anInt5450, anInt5449);
	}
}
