/* Class183_Sub2_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class183_Sub2_Sub2_Sub1 extends Class183_Sub2_Sub2 {
	Class167_Sub3_Sub1 aClass167_Sub3_Sub1_12042;
	int anInt12043;
	int anInt12044;
	int anInt12045;
	int anInt12046;
	int anInt12047;
	Interface56[] anInterface56Array12048 = new Interface56[4];
	static final int anInt12049 = 16;
	Interface56 anInterface56_12050;

	public void method9034(int i, Interface22 interface22) {
		int i_0_ = 1 << i;
		Interface56 interface56 = (Interface56) interface22;
		if (interface22 != null) {
			if (anInt12047 != 0) {
				if (anInt12045 != interface56.method1() || anInt12046 != interface56.method78())
					throw new RuntimeException();
			} else {
				anInt12046 = interface56.method78();
				anInt12045 = interface56.method1();
				method10523();
			}
			anInt12047 |= i_0_;
			anInterface56Array12048[i] = interface56;
		} else {
			anInt12047 &= i_0_ ^ 0xffffffff;
			anInterface56Array12048[i] = null;
			if (anInt12047 == 0) {
				anInt12046 = 0;
				anInt12045 = 0;
			}
		}
		if (this == aClass167_Sub3_Sub1_12042.method2278((byte) -95))
			method10963(i);
		else
			anInt12043 |= i_0_;
	}

	public void method9042(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, boolean bool, boolean bool_6_) {
		if (bool | bool_6_) {
			int i_7_ = anInt12046;
			int i_8_ = aClass167_Sub3_Sub1_12042.method2278((byte) -81).method2726();
			int i_9_ = 0;
			if (bool_6_)
				i_9_ |= 0x100;
			if (bool)
				i_9_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, anInt12044);
			OpenGL.glBlitFramebufferEXT(i, i_7_ - i_1_ - i_3_, i + i_2_, i_7_ - i_1_, i_4_, i_8_ - i_5_ - i_3_, i_4_ + i_2_, i_8_ - i_5_, i_9_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	public int method2725() {
		return anInt12045;
	}

	public void method9035(int i, Interface22 interface22) {
		int i_10_ = 1 << i;
		Interface56 interface56 = (Interface56) interface22;
		if (interface22 != null) {
			if (anInt12047 != 0) {
				if (anInt12045 != interface56.method1() || anInt12046 != interface56.method78())
					throw new RuntimeException();
			} else {
				anInt12046 = interface56.method78();
				anInt12045 = interface56.method1();
				method10523();
			}
			anInt12047 |= i_10_;
			anInterface56Array12048[i] = interface56;
		} else {
			anInt12047 &= i_10_ ^ 0xffffffff;
			anInterface56Array12048[i] = null;
			if (anInt12047 == 0) {
				anInt12046 = 0;
				anInt12045 = 0;
			}
		}
		if (this == aClass167_Sub3_Sub1_12042.method2278((byte) 31))
			method10963(i);
		else
			anInt12043 |= i_10_;
	}

	public void method9037(Interface21 interface21) {
		Interface56 interface56 = (Interface56) interface21;
		if (interface21 != null) {
			if (anInt12047 != 0) {
				if (anInt12045 != interface56.method1() || anInt12046 != interface56.method78())
					throw new RuntimeException();
			} else {
				anInt12046 = interface56.method78();
				anInt12045 = interface56.method1();
				method10523();
			}
			anInt12047 |= 0x10;
			anInterface56_12050 = interface56;
		} else {
			anInt12047 &= ~0x10;
			anInterface56_12050 = null;
			if (anInt12047 == 0) {
				anInt12046 = 0;
				anInt12045 = 0;
			}
		}
		if (this == aClass167_Sub3_Sub1_12042.method2278((byte) -1))
			method10964();
		else
			anInt12043 |= 0x10;
	}

	void method10963(int i) {
		Interface56 interface56 = anInterface56Array12048[i];
		if (interface56 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface56.method56(36064 + i);
	}

	void method10964() {
		if (anInterface56_12050 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			anInterface56_12050.method56(36096);
	}

	public boolean method9036() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	boolean method352() {
		OpenGL.glBindFramebufferEXT(36160, anInt12044);
		for (int i = 0; i < 4; i++) {
			if ((anInt12043 & 1 << i) != 0)
				method10963(i);
		}
		if ((anInt12043 & 0x10) != 0)
			method10964();
		anInt12043 = 0;
		return super.method352();
	}

	void method10965() throws Throwable {
		super.finalize();
		method131();
	}

	public void method9040(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, boolean bool, boolean bool_16_) {
		if (bool | bool_16_) {
			int i_17_ = anInt12046;
			int i_18_ = aClass167_Sub3_Sub1_12042.method2278((byte) 28).method2726();
			int i_19_ = 0;
			if (bool_16_)
				i_19_ |= 0x100;
			if (bool)
				i_19_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, anInt12044);
			OpenGL.glBlitFramebufferEXT(i, i_17_ - i_11_ - i_13_, i + i_12_, i_17_ - i_11_, i_14_, i_18_ - i_15_ - i_13_, i_14_ + i_12_, i_18_ - i_15_, i_19_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	boolean method2730() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public void finalize() throws Throwable {
		super.finalize();
		method131();
	}

	public int method2726() {
		return anInt12046;
	}

	public int method2728() {
		return anInt12045;
	}

	public int method2729() {
		return anInt12045;
	}

	public void method9038(Interface21 interface21) {
		Interface56 interface56 = (Interface56) interface21;
		if (interface21 != null) {
			if (anInt12047 != 0) {
				if (anInt12045 != interface56.method1() || anInt12046 != interface56.method78())
					throw new RuntimeException();
			} else {
				anInt12046 = interface56.method78();
				anInt12045 = interface56.method1();
				method10523();
			}
			anInt12047 |= 0x10;
			anInterface56_12050 = interface56;
		} else {
			anInt12047 &= ~0x10;
			anInterface56_12050 = null;
			if (anInt12047 == 0) {
				anInt12046 = 0;
				anInt12045 = 0;
			}
		}
		if (this == aClass167_Sub3_Sub1_12042.method2278((byte) -18))
			method10964();
		else
			anInt12043 |= 0x10;
	}

	public void method9039(Interface21 interface21) {
		Interface56 interface56 = (Interface56) interface21;
		if (interface21 != null) {
			if (anInt12047 != 0) {
				if (anInt12045 != interface56.method1() || anInt12046 != interface56.method78())
					throw new RuntimeException();
			} else {
				anInt12046 = interface56.method78();
				anInt12045 = interface56.method1();
				method10523();
			}
			anInt12047 |= 0x10;
			anInterface56_12050 = interface56;
		} else {
			anInt12047 &= ~0x10;
			anInterface56_12050 = null;
			if (anInt12047 == 0) {
				anInt12046 = 0;
				anInt12045 = 0;
			}
		}
		if (this == aClass167_Sub3_Sub1_12042.method2278((byte) 51))
			method10964();
		else
			anInt12043 |= 0x10;
	}

	public void method9033(Interface21 interface21) {
		Interface56 interface56 = (Interface56) interface21;
		if (interface21 != null) {
			if (anInt12047 != 0) {
				if (anInt12045 != interface56.method1() || anInt12046 != interface56.method78())
					throw new RuntimeException();
			} else {
				anInt12046 = interface56.method78();
				anInt12045 = interface56.method1();
				method10523();
			}
			anInt12047 |= 0x10;
			anInterface56_12050 = interface56;
		} else {
			anInt12047 &= ~0x10;
			anInterface56_12050 = null;
			if (anInt12047 == 0) {
				anInt12046 = 0;
				anInt12045 = 0;
			}
		}
		if (this == aClass167_Sub3_Sub1_12042.method2278((byte) 13))
			method10964();
		else
			anInt12043 |= 0x10;
	}

	public boolean method9041() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	boolean method2732() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public void method355() {
		if (anInt12044 != 0) {
			aClass167_Sub3_Sub1_12042.method10562(anInt12044);
			anInt12044 = 0;
		}
	}

	public void method130() {
		if (anInt12044 != 0) {
			aClass167_Sub3_Sub1_12042.method10562(anInt12044);
			anInt12044 = 0;
		}
	}

	public void method129() {
		if (anInt12044 != 0) {
			aClass167_Sub3_Sub1_12042.method10562(anInt12044);
			anInt12044 = 0;
		}
	}

	public int method2724() {
		return anInt12046;
	}

	void method10966() throws Throwable {
		super.finalize();
		method131();
	}

	public void method131() {
		if (anInt12044 != 0) {
			aClass167_Sub3_Sub1_12042.method10562(anInt12044);
			anInt12044 = 0;
		}
	}

	boolean method354() {
		OpenGL.glBindFramebufferEXT(36160, anInt12044);
		for (int i = 0; i < 4; i++) {
			if ((anInt12043 & 1 << i) != 0)
				method10963(i);
		}
		if ((anInt12043 & 0x10) != 0)
			method10964();
		anInt12043 = 0;
		return super.method352();
	}

	public int method2733() {
		return anInt12045;
	}

	Class183_Sub2_Sub2_Sub1(Class167_Sub3_Sub1 class167_sub3_sub1) {
		super((Class167_Sub3) class167_sub3_sub1);
		aClass167_Sub3_Sub1_12042 = class167_sub3_sub1;
		int[] is = new int[1];
		if (!aClass167_Sub3_Sub1_12042.aBool9692)
			throw new RuntimeException("");
		OpenGL.glGenFramebuffersEXT(1, is, 0);
		anInt12044 = is[0];
	}

	boolean method2735() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public int method2731() {
		return anInt12046;
	}

	boolean method2727() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public void method9043(int i, Interface22 interface22) {
		int i_20_ = 1 << i;
		Interface56 interface56 = (Interface56) interface22;
		if (interface22 != null) {
			if (anInt12047 != 0) {
				if (anInt12045 != interface56.method1() || anInt12046 != interface56.method78())
					throw new RuntimeException();
			} else {
				anInt12046 = interface56.method78();
				anInt12045 = interface56.method1();
				method10523();
			}
			anInt12047 |= i_20_;
			anInterface56Array12048[i] = interface56;
		} else {
			anInt12047 &= i_20_ ^ 0xffffffff;
			anInterface56Array12048[i] = null;
			if (anInt12047 == 0) {
				anInt12046 = 0;
				anInt12045 = 0;
			}
		}
		if (this == aClass167_Sub3_Sub1_12042.method2278((byte) 52))
			method10963(i);
		else
			anInt12043 |= i_20_;
	}

	boolean method2734() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	void method10967(int i) {
		Interface56 interface56 = anInterface56Array12048[i];
		if (interface56 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface56.method56(36064 + i);
	}

	void method10968() {
		if (anInterface56_12050 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			anInterface56_12050.method56(36096);
	}

	void method10969() {
		if (anInterface56_12050 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			anInterface56_12050.method56(36096);
	}

	void method10970() {
		if (anInterface56_12050 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			anInterface56_12050.method56(36096);
	}

	void method10971() {
		if (anInterface56_12050 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			anInterface56_12050.method56(36096);
	}
}
