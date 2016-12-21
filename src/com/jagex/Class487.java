/* Class487 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

import jaggl.OpenGL;

public class Class487 {
	public static Class167 method5863(Canvas canvas, Class174 class174, Interface24 interface24, Interface47 interface47, Interface48 interface48, Interface46 interface46, Class461 class461, int i) {
		Class167_Sub3_Sub1 class167_sub3_sub1;
		try {
			Class167_Sub3.method8715();
			Class114.method1481((byte) 110).method391("jaggl", 485887217);
			Class166.method1999(canvas, -1411037171);
			OpenGL opengl = new OpenGL();
			long l = opengl.init(canvas, 8, 8, 8, 24, 0, i);
			if (l == 0L)
				throw new RuntimeException("");
			Class167_Sub3_Sub1 class167_sub3_sub1_0_ = new Class167_Sub3_Sub1(opengl, canvas, l, class174, interface24, interface47, interface48, interface46, class461, i);
			class167_sub3_sub1_0_.method8716();
			class167_sub3_sub1 = class167_sub3_sub1_0_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		} catch (Throwable throwable) {
			throw new RuntimeException("");
		}
		return class167_sub3_sub1;
	}

	Class487() throws Throwable {
		throw new Error();
	}
}
