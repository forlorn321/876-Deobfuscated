/* Class376 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class376 {
	Interface37 anInterface37_3917;
	int anInt3918;
	Class180_Sub2 this$0;

	void method6386() {
		anInterface37_3917.method129();
	}

	void method6387() {
		anInterface37_3917 = this$0.method15035(true);
		this$0.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3734 }) });
		this$0.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3734 }) });
		this$0.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3734 }) });
		anInt3918 = 16;
	}

	Class376(Class180_Sub2 class180_sub2, int i) {
		this$0 = class180_sub2;
		method6387();
		method6388(i, anInt3918);
	}

	void method6388(int i, int i_0_) {
		if (!anInterface37_3917.method219(i, i_0_))
			System.out.println("PrimitiveVertexBuffer:ensureSize: failed vertexBuffer.allocate !");
	}

	void method6389(int i, int i_1_) {
		if (!anInterface37_3917.method219(i, i_1_))
			System.out.println("PrimitiveVertexBuffer:ensureSize: failed vertexBuffer.allocate !");
	}

	void method6390(int i, int i_2_) {
		if (!anInterface37_3917.method219(i, i_2_))
			System.out.println("PrimitiveVertexBuffer:ensureSize: failed vertexBuffer.allocate !");
	}
}
