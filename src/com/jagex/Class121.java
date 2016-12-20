/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class121 {
	int anInt1489;

	void method2125() {
		OpenGL.glEndList();
	}

	void method2126(int i) {
		OpenGL.glNewList(anInt1489 + i, 4864);
	}

	Class121(Class180_Sub3 class180_sub3, int i) {
		anInt1489 = OpenGL.glGenLists(i);
	}

	void method2127(char c) {
		OpenGL.glCallList(anInt1489 + c);
	}

	void method2128(int i) {
		OpenGL.glNewList(anInt1489 + i, 4864);
	}

	void method2129() {
		OpenGL.glEndList();
	}

	void method2130(int i) {
		OpenGL.glNewList(anInt1489 + i, 4864);
	}

	void method2131() {
		OpenGL.glEndList();
	}

	void method2132(int i) {
		OpenGL.glNewList(anInt1489 + i, 4864);
	}

	void method2133() {
		OpenGL.glEndList();
	}

	void method2134() {
		OpenGL.glEndList();
	}

	void method2135(char c) {
		OpenGL.glCallList(anInt1489 + c);
	}

	void method2136(char c) {
		OpenGL.glCallList(anInt1489 + c);
	}
}
