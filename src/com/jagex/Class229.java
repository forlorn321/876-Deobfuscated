/* Class229 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class229 implements Interface27 {
	int anInt2361;
	int anInt2362;
	Class213 this$0;
	static int anInt2363;

	public void method153(Class226 class226) {
		class226.method3233(-1675601611 * anInt2361, -181635957 * anInt2362, 736717639);
		class226.method3227(-1675601611 * anInt2361, -781094290).method3123(368312517);
	}

	Class229(Class213 class213, RSByteBuffer class536_sub33) {
		this$0 = class213;
		anInt2361 = class536_sub33.readUnsignedShort((short) 5526) * -1588596451;
		anInt2362 = class536_sub33.readUnsignedByte(-1315582228) * -1328983261;
	}

	public void method154(Class226 class226, short i) {
		class226.method3233(-1675601611 * anInt2361, -181635957 * anInt2362, 345989330);
		class226.method3227(-1675601611 * anInt2361, -781094290).method3123(368312517);
	}

	public void method155(Class226 class226) {
		class226.method3233(-1675601611 * anInt2361, -181635957 * anInt2362, 83435662);
		class226.method3227(-1675601611 * anInt2361, -781094290).method3123(368312517);
	}

	static final int method3290(int i) {
		return 0;
	}

	static final void method3291(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class315.method4210(class251, class234, class668, -95845096);
	}

	static final void method3292(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class668.method8007(class251, class234, class668, -430128735);
	}

	public static Class299 method3293(int i, byte i_0_) {
		Class299[] class299s = Class184_Sub3.method8991(1331811755);
		for (int i_1_ = 0; i_1_ < class299s.length; i_1_++) {
			Class299 class299 = class299s[i_1_];
			if (i == class299.anInt3352 * -406080485)
				return class299;
		}
		return null;
	}
}
