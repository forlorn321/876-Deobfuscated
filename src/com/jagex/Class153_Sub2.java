/* Class153_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class153_Sub2 extends Class153 {
	void method1860(RSByteBuffer class536_sub33, int i) {
		/* empty */
	}

	void method1858(RSByteBuffer class536_sub33, int i, int i_0_) {
		/* empty */
	}

	public void postDecode() {
		/* empty */
	}

	public void method77() {
		/* empty */
	}

	void method1863(RSByteBuffer class536_sub33, int i) {
		/* empty */
	}

	Class153_Sub2(Class458 class458, int i) {
		super(class458, i);
	}

	void method1859(RSByteBuffer class536_sub33, int i) {
		/* empty */
	}

	static final void decodePlayerUpdate(RSBitBuffer class536_sub33_sub2, int i, byte i_1_) {
		Class95.anInt1150 = 0;
		Class532.method6445(class536_sub33_sub2);
		Class302.method4102(class536_sub33_sub2);
		if (i != class536_sub33_sub2.off * -810172525)
			throw new RuntimeException(new StringBuilder().append(class536_sub33_sub2.off * -810172525).append(" ").append(i).toString());
	}
}
