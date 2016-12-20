/* Class171_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class171_Sub2_Sub2 extends Class171_Sub2 {
	Interface16[] anInterface16Array11365 = new Interface16[4];
	Interface16 anInterface16_11366;
	Class180_Sub3 aClass180_Sub3_11367;
	int anInt11368;
	static final int anInt11369 = 16;
	int anInt11370;
	int anInt11371;
	int anInt11372;
	int anInt11373;

	void method17929(int i) {
		Interface16 interface16 = anInterface16Array11365[i];
		if (interface16 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface16.method97(36064 + i);
	}

	public int method2728() {
		return anInt11368;
	}

	boolean method352() {
		OpenGL.glBindFramebufferEXT(36160, anInt11373);
		for (int i = 0; i < 4; i++) {
			if ((anInt11371 & 1 << i) != 0)
				method17931(i);
		}
		if ((anInt11371 & 0x10) != 0)
			method17939();
		anInt11371 = 0;
		aClass180_Sub3_11367.method15345();
		return true;
	}

	void method17930() throws Throwable {
		super.finalize();
		method129();
	}

	public void method15324(Interface23 interface23) {
		Interface16 interface16 = (Interface16) interface23;
		if (interface23 != null) {
			if ((anInt11370 | 0x10) != 16) {
				if (anInt11368 != interface16.method1() || anInt11372 != interface16.method87())
					throw new RuntimeException();
			} else {
				anInt11372 = interface16.method87();
				anInt11368 = interface16.method1();
				if (this == aClass180_Sub3_11367.method3285(408174466))
					aClass180_Sub3_11367.method15346();
			}
			anInt11370 |= 0x10;
			anInterface16_11366 = interface16;
		} else {
			anInt11370 &= ~0x10;
			anInterface16_11366 = null;
			if (anInt11370 == 0) {
				anInt11372 = 0;
				anInt11368 = 0;
			}
		}
		if (this == aClass180_Sub3_11367.method3285(1250533843))
			method17939();
		else
			anInt11371 |= 0x10;
	}

	void method17931(int i) {
		Interface16 interface16 = anInterface16Array11365[i];
		if (interface16 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface16.method97(36064 + i);
	}

	void method17932() throws Throwable {
		super.finalize();
		method129();
	}

	public boolean method15322() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	public int method2732() {
		return anInt11368;
	}

	public void method15321(int i, Interface21 interface21) {
		int i_0_ = 1 << i;
		Interface16 interface16 = (Interface16) interface21;
		if (interface21 != null) {
			if ((anInt11370 | i_0_) != i_0_) {
				if (anInt11368 != interface16.method1() || anInt11372 != interface16.method87())
					throw new RuntimeException();
			} else {
				anInt11372 = interface16.method87();
				anInt11368 = interface16.method1();
				if (this == aClass180_Sub3_11367.method3285(1492587147))
					aClass180_Sub3_11367.method15346();
			}
			anInt11370 |= i_0_;
			anInterface16Array11365[i] = interface16;
		} else {
			anInt11370 &= i_0_ ^ 0xffffffff;
			anInterface16Array11365[i] = null;
			if (anInt11370 == 0) {
				anInt11372 = 0;
				anInt11368 = 0;
			}
		}
		if (this == aClass180_Sub3_11367.method3285(1188679878))
			method17931(i);
		else
			anInt11371 |= i_0_;
	}

	void method17933(int i) {
		OpenGL.glDrawBuffer(36064 + i);
	}

	public void method15330(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, boolean bool, boolean bool_6_) {
		if (bool | bool_6_) {
			int i_7_ = anInt11372;
			int i_8_ = aClass180_Sub3_11367.method3285(2064507370).method2729();
			int i_9_ = 0;
			if (bool_6_)
				i_9_ |= 0x100;
			if (bool)
				i_9_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, anInt11373);
			OpenGL.glBlitFramebufferEXT(i, i_7_ - i_1_ - i_3_, i + i_2_, i_7_ - i_1_, i_4_, i_8_ - i_5_ - i_3_, i_4_ + i_2_, i_8_ - i_5_, i_9_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	public void method129() {
		if (anInt11373 != 0) {
			aClass180_Sub3_11367.method15361(anInt11373);
			anInt11373 = 0;
		}
	}

	public void finalize() throws Throwable {
		super.finalize();
		method129();
	}

	void method17934(int i) {
		Interface16 interface16 = anInterface16Array11365[i];
		if (interface16 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface16.method97(36064 + i);
	}

	public int method2733() {
		return anInt11368;
	}

	public int method2730() {
		return anInt11372;
	}

	public void method15323(int i, Interface21 interface21) {
		int i_10_ = 1 << i;
		Interface16 interface16 = (Interface16) interface21;
		if (interface21 != null) {
			if ((anInt11370 | i_10_) != i_10_) {
				if (anInt11368 != interface16.method1() || anInt11372 != interface16.method87())
					throw new RuntimeException();
			} else {
				anInt11372 = interface16.method87();
				anInt11368 = interface16.method1();
				if (this == aClass180_Sub3_11367.method3285(1521910287))
					aClass180_Sub3_11367.method15346();
			}
			anInt11370 |= i_10_;
			anInterface16Array11365[i] = interface16;
		} else {
			anInt11370 &= i_10_ ^ 0xffffffff;
			anInterface16Array11365[i] = null;
			if (anInt11370 == 0) {
				anInt11372 = 0;
				anInt11368 = 0;
			}
		}
		if (this == aClass180_Sub3_11367.method3285(1237840894))
			method17931(i);
		else
			anInt11371 |= i_10_;
	}

	public void method15332(int i, Interface21 interface21) {
		int i_11_ = 1 << i;
		Interface16 interface16 = (Interface16) interface21;
		if (interface21 != null) {
			if ((anInt11370 | i_11_) != i_11_) {
				if (anInt11368 != interface16.method1() || anInt11372 != interface16.method87())
					throw new RuntimeException();
			} else {
				anInt11372 = interface16.method87();
				anInt11368 = interface16.method1();
				if (this == aClass180_Sub3_11367.method3285(653845993))
					aClass180_Sub3_11367.method15346();
			}
			anInt11370 |= i_11_;
			anInterface16Array11365[i] = interface16;
		} else {
			anInt11370 &= i_11_ ^ 0xffffffff;
			anInterface16Array11365[i] = null;
			if (anInt11370 == 0) {
				anInt11372 = 0;
				anInt11368 = 0;
			}
		}
		if (this == aClass180_Sub3_11367.method3285(486848246))
			method17931(i);
		else
			anInt11371 |= i_11_;
	}

	public void method15325(int i, Interface21 interface21) {
		int i_12_ = 1 << i;
		Interface16 interface16 = (Interface16) interface21;
		if (interface21 != null) {
			if ((anInt11370 | i_12_) != i_12_) {
				if (anInt11368 != interface16.method1() || anInt11372 != interface16.method87())
					throw new RuntimeException();
			} else {
				anInt11372 = interface16.method87();
				anInt11368 = interface16.method1();
				if (this == aClass180_Sub3_11367.method3285(1990147899))
					aClass180_Sub3_11367.method15346();
			}
			anInt11370 |= i_12_;
			anInterface16Array11365[i] = interface16;
		} else {
			anInt11370 &= i_12_ ^ 0xffffffff;
			anInterface16Array11365[i] = null;
			if (anInt11370 == 0) {
				anInt11372 = 0;
				anInt11368 = 0;
			}
		}
		if (this == aClass180_Sub3_11367.method3285(1358569502))
			method17931(i);
		else
			anInt11371 |= i_12_;
	}

	public void method15326(int i, Interface21 interface21) {
		int i_13_ = 1 << i;
		Interface16 interface16 = (Interface16) interface21;
		if (interface21 != null) {
			if ((anInt11370 | i_13_) != i_13_) {
				if (anInt11368 != interface16.method1() || anInt11372 != interface16.method87())
					throw new RuntimeException();
			} else {
				anInt11372 = interface16.method87();
				anInt11368 = interface16.method1();
				if (this == aClass180_Sub3_11367.method3285(458209789))
					aClass180_Sub3_11367.method15346();
			}
			anInt11370 |= i_13_;
			anInterface16Array11365[i] = interface16;
		} else {
			anInt11370 &= i_13_ ^ 0xffffffff;
			anInterface16Array11365[i] = null;
			if (anInt11370 == 0) {
				anInt11372 = 0;
				anInt11368 = 0;
			}
		}
		if (this == aClass180_Sub3_11367.method3285(1386766432))
			method17931(i);
		else
			anInt11371 |= i_13_;
	}

	public void method15327(Interface23 interface23) {
		Interface16 interface16 = (Interface16) interface23;
		if (interface23 != null) {
			if ((anInt11370 | 0x10) != 16) {
				if (anInt11368 != interface16.method1() || anInt11372 != interface16.method87())
					throw new RuntimeException();
			} else {
				anInt11372 = interface16.method87();
				anInt11368 = interface16.method1();
				if (this == aClass180_Sub3_11367.method3285(414979938))
					aClass180_Sub3_11367.method15346();
			}
			anInt11370 |= 0x10;
			anInterface16_11366 = interface16;
		} else {
			anInt11370 &= ~0x10;
			anInterface16_11366 = null;
			if (anInt11370 == 0) {
				anInt11372 = 0;
				anInt11368 = 0;
			}
		}
		if (this == aClass180_Sub3_11367.method3285(439133284))
			method17939();
		else
			anInt11371 |= 0x10;
	}

	public void method15329(Interface23 interface23) {
		Interface16 interface16 = (Interface16) interface23;
		if (interface23 != null) {
			if ((anInt11370 | 0x10) != 16) {
				if (anInt11368 != interface16.method1() || anInt11372 != interface16.method87())
					throw new RuntimeException();
			} else {
				anInt11372 = interface16.method87();
				anInt11368 = interface16.method1();
				if (this == aClass180_Sub3_11367.method3285(1525962608))
					aClass180_Sub3_11367.method15346();
			}
			anInt11370 |= 0x10;
			anInterface16_11366 = interface16;
		} else {
			anInt11370 &= ~0x10;
			anInterface16_11366 = null;
			if (anInt11370 == 0) {
				anInt11372 = 0;
				anInt11368 = 0;
			}
		}
		if (this == aClass180_Sub3_11367.method3285(430520174))
			method17939();
		else
			anInt11371 |= 0x10;
	}

	public void method15320(Interface23 interface23) {
		Interface16 interface16 = (Interface16) interface23;
		if (interface23 != null) {
			if ((anInt11370 | 0x10) != 16) {
				if (anInt11368 != interface16.method1() || anInt11372 != interface16.method87())
					throw new RuntimeException();
			} else {
				anInt11372 = interface16.method87();
				anInt11368 = interface16.method1();
				if (this == aClass180_Sub3_11367.method3285(679086257))
					aClass180_Sub3_11367.method15346();
			}
			anInt11370 |= 0x10;
			anInterface16_11366 = interface16;
		} else {
			anInt11370 &= ~0x10;
			anInterface16_11366 = null;
			if (anInt11370 == 0) {
				anInt11372 = 0;
				anInt11368 = 0;
			}
		}
		if (this == aClass180_Sub3_11367.method3285(1914931623))
			method17939();
		else
			anInt11371 |= 0x10;
	}

	Class171_Sub2_Sub2(Class180_Sub3 class180_sub3) {
		if (!class180_sub3.aBool9818)
			throw new IllegalStateException("");
		aClass180_Sub3_11367 = class180_sub3;
		int[] is = new int[1];
		OpenGL.glGenFramebuffersEXT(1, is, 0);
		anInt11373 = is[0];
	}

	void method17935() throws Throwable {
		super.finalize();
		method129();
	}

	boolean method350() {
		OpenGL.glBindFramebufferEXT(36160, anInt11373);
		for (int i = 0; i < 4; i++) {
			if ((anInt11371 & 1 << i) != 0)
				method17931(i);
		}
		if ((anInt11371 & 0x10) != 0)
			method17939();
		anInt11371 = 0;
		aClass180_Sub3_11367.method15345();
		return true;
	}

	void method17936(int i) {
		OpenGL.glDrawBuffer(36064 + i);
	}

	boolean method2731() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public void method15331(int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, boolean bool, boolean bool_19_) {
		if (bool | bool_19_) {
			int i_20_ = anInt11372;
			int i_21_ = aClass180_Sub3_11367.method3285(1623817356).method2729();
			int i_22_ = 0;
			if (bool_19_)
				i_22_ |= 0x100;
			if (bool)
				i_22_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, anInt11373);
			OpenGL.glBlitFramebufferEXT(i, i_20_ - i_14_ - i_16_, i + i_15_, i_20_ - i_14_, i_17_, i_21_ - i_18_ - i_16_, i_17_ + i_15_, i_21_ - i_18_, i_22_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	public void method15328(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, boolean bool, boolean bool_28_) {
		if (bool | bool_28_) {
			int i_29_ = anInt11372;
			int i_30_ = aClass180_Sub3_11367.method3285(998741105).method2729();
			int i_31_ = 0;
			if (bool_28_)
				i_31_ |= 0x100;
			if (bool)
				i_31_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, anInt11373);
			OpenGL.glBlitFramebufferEXT(i, i_29_ - i_23_ - i_25_, i + i_24_, i_29_ - i_23_, i_26_, i_30_ - i_27_ - i_25_, i_26_ + i_24_, i_30_ - i_27_, i_31_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	public void method15333(int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, boolean bool, boolean bool_37_) {
		if (bool | bool_37_) {
			int i_38_ = anInt11372;
			int i_39_ = aClass180_Sub3_11367.method3285(383547981).method2729();
			int i_40_ = 0;
			if (bool_37_)
				i_40_ |= 0x100;
			if (bool)
				i_40_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, anInt11373);
			OpenGL.glBlitFramebufferEXT(i, i_38_ - i_32_ - i_34_, i + i_33_, i_38_ - i_32_, i_35_, i_39_ - i_36_ - i_34_, i_35_ + i_33_, i_39_ - i_36_, i_40_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	public void method344() {
		if (anInt11373 != 0) {
			aClass180_Sub3_11367.method15361(anInt11373);
			anInt11373 = 0;
		}
	}

	boolean method2734() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	void method17937() throws Throwable {
		super.finalize();
		method129();
	}

	void method17938() throws Throwable {
		super.finalize();
		method129();
	}

	boolean method351() {
		OpenGL.glBindFramebufferEXT(36160, anInt11373);
		for (int i = 0; i < 4; i++) {
			if ((anInt11371 & 1 << i) != 0)
				method17931(i);
		}
		if ((anInt11371 & 0x10) != 0)
			method17939();
		anInt11371 = 0;
		aClass180_Sub3_11367.method15345();
		return true;
	}

	public int method2729() {
		return anInt11372;
	}

	void method17939() {
		if (anInterface16_11366 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			anInterface16_11366.method97(36096);
	}

	boolean method348() {
		OpenGL.glBindFramebufferEXT(36160, anInt11373);
		for (int i = 0; i < 4; i++) {
			if ((anInt11371 & 1 << i) != 0)
				method17931(i);
		}
		if ((anInt11371 & 0x10) != 0)
			method17939();
		anInt11371 = 0;
		aClass180_Sub3_11367.method15345();
		return true;
	}

	boolean method349() {
		OpenGL.glBindFramebufferEXT(36160, anInt11373);
		for (int i = 0; i < 4; i++) {
			if ((anInt11371 & 1 << i) != 0)
				method17931(i);
		}
		if ((anInt11371 & 0x10) != 0)
			method17939();
		anInt11371 = 0;
		aClass180_Sub3_11367.method15345();
		return true;
	}

	void method17940() {
		if (anInterface16_11366 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			anInterface16_11366.method97(36096);
	}

	void method17941() {
		if (anInterface16_11366 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			anInterface16_11366.method97(36096);
	}

	void method17942() {
		if (anInterface16_11366 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			anInterface16_11366.method97(36096);
	}

	public boolean method15319() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	void method17943(int i) {
		OpenGL.glDrawBuffer(36064 + i);
	}

	void method17944(int i) {
		OpenGL.glDrawBuffer(36064 + i);
	}

	void method17945(int i) {
		OpenGL.glDrawBuffer(36064 + i);
	}
}
