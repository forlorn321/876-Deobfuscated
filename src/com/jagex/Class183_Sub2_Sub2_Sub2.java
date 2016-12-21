/* Class183_Sub2_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.Class284;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class183_Sub2_Sub2_Sub2 extends Class183_Sub2_Sub2 {
	boolean aBool12081;
	Interface53[] anInterface53Array12082;
	int anInt12083;
	int anInt12084;
	int anInt12085;
	static final int anInt12086 = 16;
	Interface50 anInterface50_12087 = null;
	Class167_Sub3_Sub2 aClass167_Sub3_Sub2_12088;

	public int method2733() {
		return anInt12083;
	}

	public int method2725() {
		return anInt12083;
	}

	public int method2726() {
		return anInt12084;
	}

	public void method9037(Interface21 interface21) {
		Interface50 interface50 = (Interface50) interface21;
		if (interface21 != null) {
			if (anInt12085 != 0) {
				if (anInt12083 != interface50.method1() || anInt12084 != interface50.method78())
					throw new RuntimeException();
			} else {
				anInt12084 = interface50.method78();
				anInt12083 = interface50.method1();
				method10523();
			}
			anInt12085 |= 0x10;
			anInterface50_12087 = interface50;
			if (aBool12081)
				method11011(interface50.method347());
		} else {
			anInt12085 &= ~0x10;
			anInterface50_12087 = null;
			if (aBool12081)
				method11011(0L);
			if (anInt12085 == 0) {
				anInt12084 = 0;
				anInt12083 = 0;
			}
		}
	}

	boolean method11011(long l) {
		return Class284.method3779(IDirect3DDevice.SetDepthStencilSurface(aClass167_Sub3_Sub2_12088.aLong11573, l));
	}

	boolean method11012(int i, long l) {
		return Class284.method3779(IDirect3DDevice.SetRenderTarget(aClass167_Sub3_Sub2_12088.aLong11573, i, l));
	}

	Class183_Sub2_Sub2_Sub2(Class167_Sub3_Sub2 class167_sub3_sub2) {
		super((Class167_Sub3) class167_sub3_sub2);
		anInterface53Array12082 = new Interface53[4];
		aClass167_Sub3_Sub2_12088 = class167_sub3_sub2;
	}

	public boolean method9036() {
		return anInterface53Array12082[0] != null;
	}

	boolean method352() {
		for (int i = 0; i < 4; i++) {
			Interface53 interface53 = anInterface53Array12082[i];
			if (interface53 != null) {
				long l = interface53.method347();
				method11012(i, l);
			}
		}
		if (anInterface50_12087 != null)
			method11011(anInterface50_12087.method347());
		aBool12081 = true;
		return super.method352();
	}

	boolean method2727() {
		for (int i = 1; i < 4; i++) {
			Interface53 interface53 = anInterface53Array12082[i];
			if (interface53 != null)
				method11012(i, 0L);
		}
		if (anInterface50_12087 != null)
			method11011(0L);
		aBool12081 = false;
		return true;
	}

	public void method9040(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
		if (bool) {
			long l = IDirect3DDevice.GetRenderTarget((aClass167_Sub3_Sub2_12088.aLong11573), 0);
			IDirect3DDevice.StretchRect(aClass167_Sub3_Sub2_12088.aLong11573, anInterface53Array12082[0].method347(), i, i_0_, i_1_, i_2_, l, i_3_, i_4_, i_1_, i_2_, 0);
			IUnknown.Release(l);
		}
	}

	public void method9035(int i, Interface22 interface22) {
		int i_6_ = 1 << i;
		Interface53 interface53 = (Interface53) interface22;
		if (interface22 != null) {
			if (anInt12085 != 0) {
				if (anInt12083 != interface53.method1() || anInt12084 != interface53.method78())
					throw new RuntimeException();
			} else {
				anInt12084 = interface53.method78();
				anInt12083 = interface53.method1();
				method10523();
			}
			anInt12085 |= i_6_;
			anInterface53Array12082[i] = interface53;
			if (aBool12081)
				method11012(i, interface53.method347());
		} else {
			anInt12085 &= i_6_ ^ 0xffffffff;
			anInterface53Array12082[i] = null;
			if (aBool12081)
				method11012(i, 0L);
			if (anInt12085 == 0) {
				anInt12084 = 0;
				anInt12083 = 0;
			}
		}
	}

	void method11013() {
		if (anInterface50_12087 != null)
			anInterface50_12087.method345();
		for (int i = 0; i < anInterface53Array12082.length; i++) {
			if (anInterface53Array12082[i] != null)
				anInterface53Array12082[i].method345();
		}
	}

	public void method9043(int i, Interface22 interface22) {
		int i_7_ = 1 << i;
		Interface53 interface53 = (Interface53) interface22;
		if (interface22 != null) {
			if (anInt12085 != 0) {
				if (anInt12083 != interface53.method1() || anInt12084 != interface53.method78())
					throw new RuntimeException();
			} else {
				anInt12084 = interface53.method78();
				anInt12083 = interface53.method1();
				method10523();
			}
			anInt12085 |= i_7_;
			anInterface53Array12082[i] = interface53;
			if (aBool12081)
				method11012(i, interface53.method347());
		} else {
			anInt12085 &= i_7_ ^ 0xffffffff;
			anInterface53Array12082[i] = null;
			if (aBool12081)
				method11012(i, 0L);
			if (anInt12085 == 0) {
				anInt12084 = 0;
				anInt12083 = 0;
			}
		}
	}

	public void method9034(int i, Interface22 interface22) {
		int i_8_ = 1 << i;
		Interface53 interface53 = (Interface53) interface22;
		if (interface22 != null) {
			if (anInt12085 != 0) {
				if (anInt12083 != interface53.method1() || anInt12084 != interface53.method78())
					throw new RuntimeException();
			} else {
				anInt12084 = interface53.method78();
				anInt12083 = interface53.method1();
				method10523();
			}
			anInt12085 |= i_8_;
			anInterface53Array12082[i] = interface53;
			if (aBool12081)
				method11012(i, interface53.method347());
		} else {
			anInt12085 &= i_8_ ^ 0xffffffff;
			anInterface53Array12082[i] = null;
			if (aBool12081)
				method11012(i, 0L);
			if (anInt12085 == 0) {
				anInt12084 = 0;
				anInt12083 = 0;
			}
		}
	}

	public int method2728() {
		return anInt12083;
	}

	public int method2729() {
		return anInt12083;
	}

	public void method131() {
		if (anInterface50_12087 != null)
			anInterface50_12087.method131();
		for (int i = 0; i < anInterface53Array12082.length; i++) {
			if (anInterface53Array12082[i] != null)
				anInterface53Array12082[i].method131();
		}
	}

	void method11014() {
		if (anInterface50_12087 != null)
			anInterface50_12087.method345();
		for (int i = 0; i < anInterface53Array12082.length; i++) {
			if (anInterface53Array12082[i] != null)
				anInterface53Array12082[i].method345();
		}
	}

	public void finalize() throws Throwable {
		method11013();
		super.finalize();
	}

	public boolean method9041() {
		return anInterface53Array12082[0] != null;
	}

	public void method9042(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, boolean bool, boolean bool_14_) {
		if (bool) {
			long l = IDirect3DDevice.GetRenderTarget((aClass167_Sub3_Sub2_12088.aLong11573), 0);
			IDirect3DDevice.StretchRect(aClass167_Sub3_Sub2_12088.aLong11573, anInterface53Array12082[0].method347(), i, i_9_, i_10_, i_11_, l, i_12_, i_13_, i_10_, i_11_, 0);
			IUnknown.Release(l);
		}
	}

	public void method355() {
		if (anInterface50_12087 != null)
			anInterface50_12087.method131();
		for (int i = 0; i < anInterface53Array12082.length; i++) {
			if (anInterface53Array12082[i] != null)
				anInterface53Array12082[i].method131();
		}
	}

	public void method130() {
		if (anInterface50_12087 != null)
			anInterface50_12087.method131();
		for (int i = 0; i < anInterface53Array12082.length; i++) {
			if (anInterface53Array12082[i] != null)
				anInterface53Array12082[i].method131();
		}
	}

	public void method129() {
		if (anInterface50_12087 != null)
			anInterface50_12087.method131();
		for (int i = 0; i < anInterface53Array12082.length; i++) {
			if (anInterface53Array12082[i] != null)
				anInterface53Array12082[i].method131();
		}
	}

	public int method2724() {
		return anInt12084;
	}

	public int method2731() {
		return anInt12084;
	}

	boolean method2732() {
		for (int i = 1; i < 4; i++) {
			Interface53 interface53 = anInterface53Array12082[i];
			if (interface53 != null)
				method11012(i, 0L);
		}
		if (anInterface50_12087 != null)
			method11011(0L);
		aBool12081 = false;
		return true;
	}

	public void method9039(Interface21 interface21) {
		Interface50 interface50 = (Interface50) interface21;
		if (interface21 != null) {
			if (anInt12085 != 0) {
				if (anInt12083 != interface50.method1() || anInt12084 != interface50.method78())
					throw new RuntimeException();
			} else {
				anInt12084 = interface50.method78();
				anInt12083 = interface50.method1();
				method10523();
			}
			anInt12085 |= 0x10;
			anInterface50_12087 = interface50;
			if (aBool12081)
				method11011(interface50.method347());
		} else {
			anInt12085 &= ~0x10;
			anInterface50_12087 = null;
			if (aBool12081)
				method11011(0L);
			if (anInt12085 == 0) {
				anInt12084 = 0;
				anInt12083 = 0;
			}
		}
	}

	boolean method2730() {
		for (int i = 1; i < 4; i++) {
			Interface53 interface53 = anInterface53Array12082[i];
			if (interface53 != null)
				method11012(i, 0L);
		}
		if (anInterface50_12087 != null)
			method11011(0L);
		aBool12081 = false;
		return true;
	}

	boolean method2734() {
		for (int i = 1; i < 4; i++) {
			Interface53 interface53 = anInterface53Array12082[i];
			if (interface53 != null)
				method11012(i, 0L);
		}
		if (anInterface50_12087 != null)
			method11011(0L);
		aBool12081 = false;
		return true;
	}

	boolean method2735() {
		for (int i = 1; i < 4; i++) {
			Interface53 interface53 = anInterface53Array12082[i];
			if (interface53 != null)
				method11012(i, 0L);
		}
		if (anInterface50_12087 != null)
			method11011(0L);
		aBool12081 = false;
		return true;
	}

	void method11015() throws Throwable {
		method11013();
		super.finalize();
	}

	void method11016() throws Throwable {
		method11013();
		super.finalize();
	}

	public void method9033(Interface21 interface21) {
		Interface50 interface50 = (Interface50) interface21;
		if (interface21 != null) {
			if (anInt12085 != 0) {
				if (anInt12083 != interface50.method1() || anInt12084 != interface50.method78())
					throw new RuntimeException();
			} else {
				anInt12084 = interface50.method78();
				anInt12083 = interface50.method1();
				method10523();
			}
			anInt12085 |= 0x10;
			anInterface50_12087 = interface50;
			if (aBool12081)
				method11011(interface50.method347());
		} else {
			anInt12085 &= ~0x10;
			anInterface50_12087 = null;
			if (aBool12081)
				method11011(0L);
			if (anInt12085 == 0) {
				anInt12084 = 0;
				anInt12083 = 0;
			}
		}
	}

	public void method9038(Interface21 interface21) {
		Interface50 interface50 = (Interface50) interface21;
		if (interface21 != null) {
			if (anInt12085 != 0) {
				if (anInt12083 != interface50.method1() || anInt12084 != interface50.method78())
					throw new RuntimeException();
			} else {
				anInt12084 = interface50.method78();
				anInt12083 = interface50.method1();
				method10523();
			}
			anInt12085 |= 0x10;
			anInterface50_12087 = interface50;
			if (aBool12081)
				method11011(interface50.method347());
		} else {
			anInt12085 &= ~0x10;
			anInterface50_12087 = null;
			if (aBool12081)
				method11011(0L);
			if (anInt12085 == 0) {
				anInt12084 = 0;
				anInt12083 = 0;
			}
		}
	}

	boolean method354() {
		for (int i = 0; i < 4; i++) {
			Interface53 interface53 = anInterface53Array12082[i];
			if (interface53 != null) {
				long l = interface53.method347();
				method11012(i, l);
			}
		}
		if (anInterface50_12087 != null)
			method11011(anInterface50_12087.method347());
		aBool12081 = true;
		return super.method352();
	}

	void method11017() {
		if (anInterface50_12087 != null)
			anInterface50_12087.method345();
		for (int i = 0; i < anInterface53Array12082.length; i++) {
			if (anInterface53Array12082[i] != null)
				anInterface53Array12082[i].method345();
		}
	}
}
