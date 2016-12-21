/* Class183_Sub2_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class183_Sub2_Sub3 extends Class183_Sub2 {
	static final int anInt11376 = 16;
	Class167_Sub2 aClass167_Sub2_11377;
	int anInt11378;
	int anInt11379;
	int anInt11380;
	int anInt11381;
	int anInt11382;
	Interface16 anInterface16_11383;
	Interface16[] anInterface16Array11384 = new Interface16[4];

	public void method9039(Interface21 interface21) {
		Interface16 interface16 = (Interface16) interface21;
		if (interface21 != null) {
			if ((anInt11381 | 0x10) != 16) {
				if (anInt11379 != interface16.method1() || anInt11380 != interface16.method78())
					throw new RuntimeException();
			} else {
				anInt11380 = interface16.method78();
				anInt11379 = interface16.method1();
				if (this == aClass167_Sub2_11377.method2278((byte) -47))
					aClass167_Sub2_11377.method8513();
			}
			anInt11381 |= 0x10;
			anInterface16_11383 = interface16;
		} else {
			anInt11381 &= ~0x10;
			anInterface16_11383 = null;
			if (anInt11381 == 0) {
				anInt11380 = 0;
				anInt11379 = 0;
			}
		}
		if (this == aClass167_Sub2_11377.method2278((byte) 17))
			method10541();
		else
			anInt11382 |= 0x10;
	}

	public int method2725() {
		return anInt11379;
	}

	public int method2726() {
		return anInt11380;
	}

	Class183_Sub2_Sub3(Class167_Sub2 class167_sub2) {
		if (!class167_sub2.aBool9289)
			throw new IllegalStateException("");
		aClass167_Sub2_11377 = class167_sub2;
		int[] is = new int[1];
		OpenGL.glGenFramebuffersEXT(1, is, 0);
		anInt11378 = is[0];
	}

	boolean method2730() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	void method10540(int i) {
		Interface16 interface16 = anInterface16Array11384[i];
		if (interface16 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface16.method56(36064 + i);
	}

	boolean method2734() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public int method2733() {
		return anInt11379;
	}

	boolean method352() {
		OpenGL.glBindFramebufferEXT(36160, anInt11378);
		for (int i = 0; i < 4; i++) {
			if ((anInt11382 & 1 << i) != 0)
				method10540(i);
		}
		if ((anInt11382 & 0x10) != 0)
			method10541();
		anInt11382 = 0;
		aClass167_Sub2_11377.method8512();
		return true;
	}

	boolean method2727() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public void method9037(Interface21 interface21) {
		Interface16 interface16 = (Interface16) interface21;
		if (interface21 != null) {
			if ((anInt11381 | 0x10) != 16) {
				if (anInt11379 != interface16.method1() || anInt11380 != interface16.method78())
					throw new RuntimeException();
			} else {
				anInt11380 = interface16.method78();
				anInt11379 = interface16.method1();
				if (this == aClass167_Sub2_11377.method2278((byte) 8))
					aClass167_Sub2_11377.method8513();
			}
			anInt11381 |= 0x10;
			anInterface16_11383 = interface16;
		} else {
			anInt11381 &= ~0x10;
			anInterface16_11383 = null;
			if (anInt11381 == 0) {
				anInt11380 = 0;
				anInt11379 = 0;
			}
		}
		if (this == aClass167_Sub2_11377.method2278((byte) 4))
			method10541();
		else
			anInt11382 |= 0x10;
	}

	public void method9040(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
		if (bool | bool_5_) {
			int i_6_ = anInt11380;
			int i_7_ = aClass167_Sub2_11377.method2278((byte) -2).method2726();
			int i_8_ = 0;
			if (bool_5_)
				i_8_ |= 0x100;
			if (bool)
				i_8_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, anInt11378);
			OpenGL.glBlitFramebufferEXT(i, i_6_ - i_0_ - i_2_, i + i_1_, i_6_ - i_0_, i_3_, i_7_ - i_4_ - i_2_, i_3_ + i_1_, i_7_ - i_4_, i_8_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	public void method131() {
		if (anInt11378 != 0) {
			aClass167_Sub2_11377.method8572(anInt11378);
			anInt11378 = 0;
		}
	}

	public boolean method9036() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	public void method9038(Interface21 interface21) {
		Interface16 interface16 = (Interface16) interface21;
		if (interface21 != null) {
			if ((anInt11381 | 0x10) != 16) {
				if (anInt11379 != interface16.method1() || anInt11380 != interface16.method78())
					throw new RuntimeException();
			} else {
				anInt11380 = interface16.method78();
				anInt11379 = interface16.method1();
				if (this == aClass167_Sub2_11377.method2278((byte) 43))
					aClass167_Sub2_11377.method8513();
			}
			anInt11381 |= 0x10;
			anInterface16_11383 = interface16;
		} else {
			anInt11381 &= ~0x10;
			anInterface16_11383 = null;
			if (anInt11381 == 0) {
				anInt11380 = 0;
				anInt11379 = 0;
			}
		}
		if (this == aClass167_Sub2_11377.method2278((byte) 13))
			method10541();
		else
			anInt11382 |= 0x10;
	}

	public int method2728() {
		return anInt11379;
	}

	public int method2729() {
		return anInt11379;
	}

	void method10541() {
		if (anInterface16_11383 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			anInterface16_11383.method56(36096);
	}

	public void method9034(int i, Interface22 interface22) {
		int i_9_ = 1 << i;
		Interface16 interface16 = (Interface16) interface22;
		if (interface22 != null) {
			if ((anInt11381 | i_9_) != i_9_) {
				if (anInt11379 != interface16.method1() || anInt11380 != interface16.method78())
					throw new RuntimeException();
			} else {
				anInt11380 = interface16.method78();
				anInt11379 = interface16.method1();
				if (this == aClass167_Sub2_11377.method2278((byte) 16))
					aClass167_Sub2_11377.method8513();
			}
			anInt11381 |= i_9_;
			anInterface16Array11384[i] = interface16;
		} else {
			anInt11381 &= i_9_ ^ 0xffffffff;
			anInterface16Array11384[i] = null;
			if (anInt11381 == 0) {
				anInt11380 = 0;
				anInt11379 = 0;
			}
		}
		if (this == aClass167_Sub2_11377.method2278((byte) -62))
			method10540(i);
		else
			anInt11382 |= i_9_;
	}

	void method10542(int i) {
		OpenGL.glDrawBuffer(36064 + i);
	}

	public boolean method9041() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	public void method9042(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, boolean bool, boolean bool_15_) {
		if (bool | bool_15_) {
			int i_16_ = anInt11380;
			int i_17_ = aClass167_Sub2_11377.method2278((byte) -8).method2726();
			int i_18_ = 0;
			if (bool_15_)
				i_18_ |= 0x100;
			if (bool)
				i_18_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, anInt11378);
			OpenGL.glBlitFramebufferEXT(i, i_16_ - i_10_ - i_12_, i + i_11_, i_16_ - i_10_, i_13_, i_17_ - i_14_ - i_12_, i_13_ + i_11_, i_17_ - i_14_, i_18_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	public void finalize() throws Throwable {
		super.finalize();
		method131();
	}

	public void method130() {
		if (anInt11378 != 0) {
			aClass167_Sub2_11377.method8572(anInt11378);
			anInt11378 = 0;
		}
	}

	public void method129() {
		if (anInt11378 != 0) {
			aClass167_Sub2_11377.method8572(anInt11378);
			anInt11378 = 0;
		}
	}

	public int method2724() {
		return anInt11380;
	}

	public int method2731() {
		return anInt11380;
	}

	boolean method354() {
		OpenGL.glBindFramebufferEXT(36160, anInt11378);
		for (int i = 0; i < 4; i++) {
			if ((anInt11382 & 1 << i) != 0)
				method10540(i);
		}
		if ((anInt11382 & 0x10) != 0)
			method10541();
		anInt11382 = 0;
		aClass167_Sub2_11377.method8512();
		return true;
	}

	boolean method2732() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public void method9035(int i, Interface22 interface22) {
		int i_19_ = 1 << i;
		Interface16 interface16 = (Interface16) interface22;
		if (interface22 != null) {
			if ((anInt11381 | i_19_) != i_19_) {
				if (anInt11379 != interface16.method1() || anInt11380 != interface16.method78())
					throw new RuntimeException();
			} else {
				anInt11380 = interface16.method78();
				anInt11379 = interface16.method1();
				if (this == aClass167_Sub2_11377.method2278((byte) -40))
					aClass167_Sub2_11377.method8513();
			}
			anInt11381 |= i_19_;
			anInterface16Array11384[i] = interface16;
		} else {
			anInt11381 &= i_19_ ^ 0xffffffff;
			anInterface16Array11384[i] = null;
			if (anInt11381 == 0) {
				anInt11380 = 0;
				anInt11379 = 0;
			}
		}
		if (this == aClass167_Sub2_11377.method2278((byte) -81))
			method10540(i);
		else
			anInt11382 |= i_19_;
	}

	void method10543(int i) {
		OpenGL.glDrawBuffer(36064 + i);
	}

	boolean method2735() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public void method355() {
		if (anInt11378 != 0) {
			aClass167_Sub2_11377.method8572(anInt11378);
			anInt11378 = 0;
		}
	}

	void method10544() throws Throwable {
		super.finalize();
		method131();
	}

	public void method9043(int i, Interface22 interface22) {
		int i_20_ = 1 << i;
		Interface16 interface16 = (Interface16) interface22;
		if (interface22 != null) {
			if ((anInt11381 | i_20_) != i_20_) {
				if (anInt11379 != interface16.method1() || anInt11380 != interface16.method78())
					throw new RuntimeException();
			} else {
				anInt11380 = interface16.method78();
				anInt11379 = interface16.method1();
				if (this == aClass167_Sub2_11377.method2278((byte) -117))
					aClass167_Sub2_11377.method8513();
			}
			anInt11381 |= i_20_;
			anInterface16Array11384[i] = interface16;
		} else {
			anInt11381 &= i_20_ ^ 0xffffffff;
			anInterface16Array11384[i] = null;
			if (anInt11381 == 0) {
				anInt11380 = 0;
				anInt11379 = 0;
			}
		}
		if (this == aClass167_Sub2_11377.method2278((byte) -3))
			method10540(i);
		else
			anInt11382 |= i_20_;
	}

	public void method9033(Interface21 interface21) {
		Interface16 interface16 = (Interface16) interface21;
		if (interface21 != null) {
			if ((anInt11381 | 0x10) != 16) {
				if (anInt11379 != interface16.method1() || anInt11380 != interface16.method78())
					throw new RuntimeException();
			} else {
				anInt11380 = interface16.method78();
				anInt11379 = interface16.method1();
				if (this == aClass167_Sub2_11377.method2278((byte) -35))
					aClass167_Sub2_11377.method8513();
			}
			anInt11381 |= 0x10;
			anInterface16_11383 = interface16;
		} else {
			anInt11381 &= ~0x10;
			anInterface16_11383 = null;
			if (anInt11381 == 0) {
				anInt11380 = 0;
				anInt11379 = 0;
			}
		}
		if (this == aClass167_Sub2_11377.method2278((byte) -36))
			method10541();
		else
			anInt11382 |= 0x10;
	}

	void method10545() {
		if (anInterface16_11383 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			anInterface16_11383.method56(36096);
	}

	void method10546() throws Throwable {
		super.finalize();
		method131();
	}

	void method10547(int i) {
		OpenGL.glDrawBuffer(36064 + i);
	}

	void method10548(int i) {
		OpenGL.glDrawBuffer(36064 + i);
	}
}
