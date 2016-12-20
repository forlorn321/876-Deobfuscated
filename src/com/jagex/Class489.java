/* Class489 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

import jaggl.OpenGL;

public class Class489 {
	public static Class180 method7970(Canvas canvas, Class181 class181, Interface24 interface24, Interface48 interface48, Interface46 interface46, Interface49 interface49, Class459 class459, int i) {
		Class180_Sub2_Sub1 class180_sub2_sub1;
		try {
			Class180_Sub2.method15222();
			Class177.method3056((byte) 1).method369("jaggl", -505035477);
			Class552.method9150(canvas, -1857034484);
			OpenGL opengl = new OpenGL();
			long l = opengl.init(canvas, 8, 8, 8, 24, 0, i);
			if (l == 0L)
				throw new RuntimeException("");
			Class180_Sub2_Sub1 class180_sub2_sub1_0_ = new Class180_Sub2_Sub1(opengl, canvas, l, class181, interface24, interface48, interface46, interface49, class459, i);
			class180_sub2_sub1_0_.method14899();
			class180_sub2_sub1 = class180_sub2_sub1_0_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		} catch (Throwable throwable) {
			throw new RuntimeException("");
		}
		return class180_sub2_sub1;
	}

	Class489() throws Throwable {
		throw new Error();
	}

	public static Class180 method7971(Canvas canvas, Class181 class181, Interface24 interface24, Interface48 interface48, Interface46 interface46, Interface49 interface49, Class459 class459, int i) {
		Class180_Sub2_Sub1 class180_sub2_sub1;
		try {
			Class180_Sub2.method15222();
			Class177.method3056((byte) -107).method369("jaggl", 867976180);
			Class552.method9150(canvas, -1438292058);
			OpenGL opengl = new OpenGL();
			long l = opengl.init(canvas, 8, 8, 8, 24, 0, i);
			if (l == 0L)
				throw new RuntimeException("");
			Class180_Sub2_Sub1 class180_sub2_sub1_1_ = new Class180_Sub2_Sub1(opengl, canvas, l, class181, interface24, interface48, interface46, interface49, class459, i);
			class180_sub2_sub1_1_.method14899();
			class180_sub2_sub1 = class180_sub2_sub1_1_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		} catch (Throwable throwable) {
			throw new RuntimeException("");
		}
		return class180_sub2_sub1;
	}
}
