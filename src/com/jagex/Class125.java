/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class125 {
	int anInt1503;

	void method1636(int i) {
		OpenGL.glNewList(anInt1503 + i, 4864);
	}

	void method1637(int i) {
		OpenGL.glNewList(anInt1503 + i, 4864);
	}

	void method1638() {
		OpenGL.glEndList();
	}

	void method1639(char c) {
		OpenGL.glCallList(anInt1503 + c);
	}

	Class125(Class167_Sub2 class167_sub2, int i) {
		anInt1503 = OpenGL.glGenLists(i);
	}

	void method1640() {
		OpenGL.glEndList();
	}

	void method1641() {
		OpenGL.glEndList();
	}

	void method1642() {
		OpenGL.glEndList();
	}
}
