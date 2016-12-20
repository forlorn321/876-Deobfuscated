/* Class171_Sub2_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class171_Sub2_Sub1_Sub2 extends Class171_Sub2_Sub1 {
	Class180_Sub2_Sub1 aClass180_Sub2_Sub1_12088;
	int anInt12089;
	int anInt12090;
	int anInt12091;
	int anInt12092;
	static final int anInt12093 = 16;
	int anInt12094;
	Interface55 anInterface55_12095;
	Interface55[] anInterface55Array12096 = new Interface55[4];

	public void method15333(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
		if (bool | bool_5_) {
			int i_6_ = anInt12092;
			int i_7_ = aClass180_Sub2_Sub1_12088.method3285(674948040).method2729();
			int i_8_ = 0;
			if (bool_5_)
				i_8_ |= 0x100;
			if (bool)
				i_8_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, anInt12090);
			OpenGL.glBlitFramebufferEXT(i, i_6_ - i_0_ - i_2_, i + i_1_, i_6_ - i_0_, i_3_, i_7_ - i_4_ - i_2_, i_3_ + i_1_, i_7_ - i_4_, i_8_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	public int method2728() {
		return anInt12091;
	}

	public int method2732() {
		return anInt12091;
	}

	public void method15321(int i, Interface21 interface21) {
		int i_9_ = 1 << i;
		Interface55 interface55 = (Interface55) interface21;
		if (interface21 != null) {
			if (anInt12089 != 0) {
				if (anInt12091 != interface55.method1() || anInt12092 != interface55.method87())
					throw new RuntimeException();
			} else {
				anInt12092 = interface55.method87();
				anInt12091 = interface55.method1();
				method17911();
			}
			anInt12089 |= i_9_;
			anInterface55Array12096[i] = interface55;
		} else {
			anInt12089 &= i_9_ ^ 0xffffffff;
			anInterface55Array12096[i] = null;
			if (anInt12089 == 0) {
				anInt12092 = 0;
				anInt12091 = 0;
			}
		}
		if (this == aClass180_Sub2_Sub1_12088.method3285(549515869))
			method18759(i);
		else
			anInt12094 |= i_9_;
	}

	public void method129() {
		if (anInt12090 != 0) {
			aClass180_Sub2_Sub1_12088.method18023(anInt12090);
			anInt12090 = 0;
		}
	}

	public void method15327(Interface23 interface23) {
		Interface55 interface55 = (Interface55) interface23;
		if (interface23 != null) {
			if (anInt12089 != 0) {
				if (anInt12091 != interface55.method1() || anInt12092 != interface55.method87())
					throw new RuntimeException();
			} else {
				anInt12092 = interface55.method87();
				anInt12091 = interface55.method1();
				method17911();
			}
			anInt12089 |= 0x10;
			anInterface55_12095 = interface55;
		} else {
			anInt12089 &= ~0x10;
			anInterface55_12095 = null;
			if (anInt12089 == 0) {
				anInt12092 = 0;
				anInt12091 = 0;
			}
		}
		if (this == aClass180_Sub2_Sub1_12088.method3285(537502280))
			method18757();
		else
			anInt12094 |= 0x10;
	}

	void method18757() {
		if (anInterface55_12095 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			anInterface55_12095.method97(36096);
	}

	public boolean method15322() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	boolean method348() {
		OpenGL.glBindFramebufferEXT(36160, anInt12090);
		for (int i = 0; i < 4; i++) {
			if ((anInt12094 & 1 << i) != 0)
				method18759(i);
		}
		if ((anInt12094 & 0x10) != 0)
			method18757();
		anInt12094 = 0;
		return super.method348();
	}

	Class171_Sub2_Sub1_Sub2(Class180_Sub2_Sub1 class180_sub2_sub1) {
		super((Class180_Sub2) class180_sub2_sub1);
		aClass180_Sub2_Sub1_12088 = class180_sub2_sub1;
		int[] is = new int[1];
		if (!aClass180_Sub2_Sub1_12088.aBool9581)
			throw new RuntimeException("");
		OpenGL.glGenFramebuffersEXT(1, is, 0);
		anInt12090 = is[0];
	}

	public void method15330(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, boolean bool, boolean bool_15_) {
		if (bool | bool_15_) {
			int i_16_ = anInt12092;
			int i_17_ = aClass180_Sub2_Sub1_12088.method3285(1065928605).method2729();
			int i_18_ = 0;
			if (bool_15_)
				i_18_ |= 0x100;
			if (bool)
				i_18_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, anInt12090);
			OpenGL.glBlitFramebufferEXT(i, i_16_ - i_10_ - i_12_, i + i_11_, i_16_ - i_10_, i_13_, i_17_ - i_14_ - i_12_, i_13_ + i_11_, i_17_ - i_14_, i_18_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	public void finalize() throws Throwable {
		super.finalize();
		method129();
	}

	void method18758(int i) {
		Interface55 interface55 = anInterface55Array12096[i];
		if (interface55 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface55.method97(36064 + i);
	}

	void method18759(int i) {
		Interface55 interface55 = anInterface55Array12096[i];
		if (interface55 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface55.method97(36064 + i);
	}

	public int method2733() {
		return anInt12091;
	}

	public int method2730() {
		return anInt12092;
	}

	public void method15323(int i, Interface21 interface21) {
		int i_19_ = 1 << i;
		Interface55 interface55 = (Interface55) interface21;
		if (interface21 != null) {
			if (anInt12089 != 0) {
				if (anInt12091 != interface55.method1() || anInt12092 != interface55.method87())
					throw new RuntimeException();
			} else {
				anInt12092 = interface55.method87();
				anInt12091 = interface55.method1();
				method17911();
			}
			anInt12089 |= i_19_;
			anInterface55Array12096[i] = interface55;
		} else {
			anInt12089 &= i_19_ ^ 0xffffffff;
			anInterface55Array12096[i] = null;
			if (anInt12089 == 0) {
				anInt12092 = 0;
				anInt12091 = 0;
			}
		}
		if (this == aClass180_Sub2_Sub1_12088.method3285(1138751204))
			method18759(i);
		else
			anInt12094 |= i_19_;
	}

	public void method15325(int i, Interface21 interface21) {
		int i_20_ = 1 << i;
		Interface55 interface55 = (Interface55) interface21;
		if (interface21 != null) {
			if (anInt12089 != 0) {
				if (anInt12091 != interface55.method1() || anInt12092 != interface55.method87())
					throw new RuntimeException();
			} else {
				anInt12092 = interface55.method87();
				anInt12091 = interface55.method1();
				method17911();
			}
			anInt12089 |= i_20_;
			anInterface55Array12096[i] = interface55;
		} else {
			anInt12089 &= i_20_ ^ 0xffffffff;
			anInterface55Array12096[i] = null;
			if (anInt12089 == 0) {
				anInt12092 = 0;
				anInt12091 = 0;
			}
		}
		if (this == aClass180_Sub2_Sub1_12088.method3285(612257333))
			method18759(i);
		else
			anInt12094 |= i_20_;
	}

	public boolean method15319() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	public void method15326(int i, Interface21 interface21) {
		int i_21_ = 1 << i;
		Interface55 interface55 = (Interface55) interface21;
		if (interface21 != null) {
			if (anInt12089 != 0) {
				if (anInt12091 != interface55.method1() || anInt12092 != interface55.method87())
					throw new RuntimeException();
			} else {
				anInt12092 = interface55.method87();
				anInt12091 = interface55.method1();
				method17911();
			}
			anInt12089 |= i_21_;
			anInterface55Array12096[i] = interface55;
		} else {
			anInt12089 &= i_21_ ^ 0xffffffff;
			anInterface55Array12096[i] = null;
			if (anInt12089 == 0) {
				anInt12092 = 0;
				anInt12091 = 0;
			}
		}
		if (this == aClass180_Sub2_Sub1_12088.method3285(1459995700))
			method18759(i);
		else
			anInt12094 |= i_21_;
	}

	void method18760() throws Throwable {
		super.finalize();
		method129();
	}

	public void method15329(Interface23 interface23) {
		Interface55 interface55 = (Interface55) interface23;
		if (interface23 != null) {
			if (anInt12089 != 0) {
				if (anInt12091 != interface55.method1() || anInt12092 != interface55.method87())
					throw new RuntimeException();
			} else {
				anInt12092 = interface55.method87();
				anInt12091 = interface55.method1();
				method17911();
			}
			anInt12089 |= 0x10;
			anInterface55_12095 = interface55;
		} else {
			anInt12089 &= ~0x10;
			anInterface55_12095 = null;
			if (anInt12089 == 0) {
				anInt12092 = 0;
				anInt12091 = 0;
			}
		}
		if (this == aClass180_Sub2_Sub1_12088.method3285(382203709))
			method18757();
		else
			anInt12094 |= 0x10;
	}

	public void method15320(Interface23 interface23) {
		Interface55 interface55 = (Interface55) interface23;
		if (interface23 != null) {
			if (anInt12089 != 0) {
				if (anInt12091 != interface55.method1() || anInt12092 != interface55.method87())
					throw new RuntimeException();
			} else {
				anInt12092 = interface55.method87();
				anInt12091 = interface55.method1();
				method17911();
			}
			anInt12089 |= 0x10;
			anInterface55_12095 = interface55;
		} else {
			anInt12089 &= ~0x10;
			anInterface55_12095 = null;
			if (anInt12089 == 0) {
				anInt12092 = 0;
				anInt12091 = 0;
			}
		}
		if (this == aClass180_Sub2_Sub1_12088.method3285(1630357647))
			method18757();
		else
			anInt12094 |= 0x10;
	}

	boolean method2731() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	boolean method351() {
		OpenGL.glBindFramebufferEXT(36160, anInt12090);
		for (int i = 0; i < 4; i++) {
			if ((anInt12094 & 1 << i) != 0)
				method18759(i);
		}
		if ((anInt12094 & 0x10) != 0)
			method18757();
		anInt12094 = 0;
		return super.method348();
	}

	boolean method350() {
		OpenGL.glBindFramebufferEXT(36160, anInt12090);
		for (int i = 0; i < 4; i++) {
			if ((anInt12094 & 1 << i) != 0)
				method18759(i);
		}
		if ((anInt12094 & 0x10) != 0)
			method18757();
		anInt12094 = 0;
		return super.method348();
	}

	boolean method349() {
		OpenGL.glBindFramebufferEXT(36160, anInt12090);
		for (int i = 0; i < 4; i++) {
			if ((anInt12094 & 1 << i) != 0)
				method18759(i);
		}
		if ((anInt12094 & 0x10) != 0)
			method18757();
		anInt12094 = 0;
		return super.method348();
	}

	boolean method352() {
		OpenGL.glBindFramebufferEXT(36160, anInt12090);
		for (int i = 0; i < 4; i++) {
			if ((anInt12094 & 1 << i) != 0)
				method18759(i);
		}
		if ((anInt12094 & 0x10) != 0)
			method18757();
		anInt12094 = 0;
		return super.method348();
	}

	public int method2729() {
		return anInt12092;
	}

	public void method15328(int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, boolean bool, boolean bool_27_) {
		if (bool | bool_27_) {
			int i_28_ = anInt12092;
			int i_29_ = aClass180_Sub2_Sub1_12088.method3285(348350728).method2729();
			int i_30_ = 0;
			if (bool_27_)
				i_30_ |= 0x100;
			if (bool)
				i_30_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, anInt12090);
			OpenGL.glBlitFramebufferEXT(i, i_28_ - i_22_ - i_24_, i + i_23_, i_28_ - i_22_, i_25_, i_29_ - i_26_ - i_24_, i_25_ + i_23_, i_29_ - i_26_, i_30_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	void method18761(int i) {
		Interface55 interface55 = anInterface55Array12096[i];
		if (interface55 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface55.method97(36064 + i);
	}

	public void method15332(int i, Interface21 interface21) {
		int i_31_ = 1 << i;
		Interface55 interface55 = (Interface55) interface21;
		if (interface21 != null) {
			if (anInt12089 != 0) {
				if (anInt12091 != interface55.method1() || anInt12092 != interface55.method87())
					throw new RuntimeException();
			} else {
				anInt12092 = interface55.method87();
				anInt12091 = interface55.method1();
				method17911();
			}
			anInt12089 |= i_31_;
			anInterface55Array12096[i] = interface55;
		} else {
			anInt12089 &= i_31_ ^ 0xffffffff;
			anInterface55Array12096[i] = null;
			if (anInt12089 == 0) {
				anInt12092 = 0;
				anInt12091 = 0;
			}
		}
		if (this == aClass180_Sub2_Sub1_12088.method3285(1570599207))
			method18759(i);
		else
			anInt12094 |= i_31_;
	}

	boolean method2734() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	void method18762() throws Throwable {
		super.finalize();
		method129();
	}

	void method18763() throws Throwable {
		super.finalize();
		method129();
	}

	void method18764() throws Throwable {
		super.finalize();
		method129();
	}

	void method18765() throws Throwable {
		super.finalize();
		method129();
	}

	public void method15331(int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, boolean bool, boolean bool_37_) {
		if (bool | bool_37_) {
			int i_38_ = anInt12092;
			int i_39_ = aClass180_Sub2_Sub1_12088.method3285(1426083960).method2729();
			int i_40_ = 0;
			if (bool_37_)
				i_40_ |= 0x100;
			if (bool)
				i_40_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, anInt12090);
			OpenGL.glBlitFramebufferEXT(i, i_38_ - i_32_ - i_34_, i + i_33_, i_38_ - i_32_, i_35_, i_39_ - i_36_ - i_34_, i_35_ + i_33_, i_39_ - i_36_, i_40_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	void method18766(int i) {
		Interface55 interface55 = anInterface55Array12096[i];
		if (interface55 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface55.method97(36064 + i);
	}

	public void method15324(Interface23 interface23) {
		Interface55 interface55 = (Interface55) interface23;
		if (interface23 != null) {
			if (anInt12089 != 0) {
				if (anInt12091 != interface55.method1() || anInt12092 != interface55.method87())
					throw new RuntimeException();
			} else {
				anInt12092 = interface55.method87();
				anInt12091 = interface55.method1();
				method17911();
			}
			anInt12089 |= 0x10;
			anInterface55_12095 = interface55;
		} else {
			anInt12089 &= ~0x10;
			anInterface55_12095 = null;
			if (anInt12089 == 0) {
				anInt12092 = 0;
				anInt12091 = 0;
			}
		}
		if (this == aClass180_Sub2_Sub1_12088.method3285(1495236308))
			method18757();
		else
			anInt12094 |= 0x10;
	}

	public void method344() {
		if (anInt12090 != 0) {
			aClass180_Sub2_Sub1_12088.method18023(anInt12090);
			anInt12090 = 0;
		}
	}

	void method18767(int i) {
		Interface55 interface55 = anInterface55Array12096[i];
		if (interface55 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface55.method97(36064 + i);
	}
}
