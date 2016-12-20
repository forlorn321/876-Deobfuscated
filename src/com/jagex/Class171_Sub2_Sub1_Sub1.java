/* Class171_Sub2_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.Class276;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class171_Sub2_Sub1_Sub1 extends Class171_Sub2_Sub1 {
	int anInt12071;
	Class180_Sub2_Sub2 aClass180_Sub2_Sub2_12072;
	static final int anInt12073 = 16;
	int anInt12074;
	int anInt12075;
	boolean aBool12076;
	Interface51 anInterface51_12077 = null;
	Interface54[] anInterface54Array12078 = new Interface54[4];

	void method18726() throws Throwable {
		method18730();
		super.finalize();
	}

	void method18727() throws Throwable {
		method18730();
		super.finalize();
	}

	public void method15324(Interface23 interface23) {
		Interface51 interface51 = (Interface51) interface23;
		if (interface23 != null) {
			if (anInt12071 != 0) {
				if (anInt12075 != interface51.method1() || anInt12074 != interface51.method87())
					throw new RuntimeException();
			} else {
				anInt12074 = interface51.method87();
				anInt12075 = interface51.method1();
				method17911();
			}
			anInt12071 |= 0x10;
			anInterface51_12077 = interface51;
			if (aBool12076)
				method18729(interface51.method346());
		} else {
			anInt12071 &= ~0x10;
			anInterface51_12077 = null;
			if (aBool12076)
				method18729(0L);
			if (anInt12071 == 0) {
				anInt12074 = 0;
				anInt12075 = 0;
			}
		}
	}

	public int method2729() {
		return anInt12074;
	}

	public void method15321(int i, Interface21 interface21) {
		int i_0_ = 1 << i;
		Interface54 interface54 = (Interface54) interface21;
		if (interface21 != null) {
			if (anInt12071 != 0) {
				if (anInt12075 != interface54.method1() || anInt12074 != interface54.method87())
					throw new RuntimeException();
			} else {
				anInt12074 = interface54.method87();
				anInt12075 = interface54.method1();
				method17911();
			}
			anInt12071 |= i_0_;
			anInterface54Array12078[i] = interface54;
			if (aBool12076)
				method18728(i, interface54.method346());
		} else {
			anInt12071 &= i_0_ ^ 0xffffffff;
			anInterface54Array12078[i] = null;
			if (aBool12076)
				method18728(i, 0L);
			if (anInt12071 == 0) {
				anInt12074 = 0;
				anInt12075 = 0;
			}
		}
	}

	boolean method18728(int i, long l) {
		return Class276.method5145(IDirect3DDevice.SetRenderTarget(aClass180_Sub2_Sub2_12072.aLong11572, i, l));
	}

	boolean method18729(long l) {
		return Class276.method5145(IDirect3DDevice.SetDepthStencilSurface(aClass180_Sub2_Sub2_12072.aLong11572, l));
	}

	public boolean method15322() {
		return anInterface54Array12078[0] != null;
	}

	public void method15323(int i, Interface21 interface21) {
		int i_1_ = 1 << i;
		Interface54 interface54 = (Interface54) interface21;
		if (interface21 != null) {
			if (anInt12071 != 0) {
				if (anInt12075 != interface54.method1() || anInt12074 != interface54.method87())
					throw new RuntimeException();
			} else {
				anInt12074 = interface54.method87();
				anInt12075 = interface54.method1();
				method17911();
			}
			anInt12071 |= i_1_;
			anInterface54Array12078[i] = interface54;
			if (aBool12076)
				method18728(i, interface54.method346());
		} else {
			anInt12071 &= i_1_ ^ 0xffffffff;
			anInterface54Array12078[i] = null;
			if (aBool12076)
				method18728(i, 0L);
			if (anInt12071 == 0) {
				anInt12074 = 0;
				anInt12075 = 0;
			}
		}
	}

	public void method344() {
		if (anInterface51_12077 != null)
			anInterface51_12077.method129();
		for (int i = 0; i < anInterface54Array12078.length; i++) {
			if (anInterface54Array12078[i] != null)
				anInterface54Array12078[i].method129();
		}
	}

	public void method15332(int i, Interface21 interface21) {
		int i_2_ = 1 << i;
		Interface54 interface54 = (Interface54) interface21;
		if (interface21 != null) {
			if (anInt12071 != 0) {
				if (anInt12075 != interface54.method1() || anInt12074 != interface54.method87())
					throw new RuntimeException();
			} else {
				anInt12074 = interface54.method87();
				anInt12075 = interface54.method1();
				method17911();
			}
			anInt12071 |= i_2_;
			anInterface54Array12078[i] = interface54;
			if (aBool12076)
				method18728(i, interface54.method346());
		} else {
			anInt12071 &= i_2_ ^ 0xffffffff;
			anInterface54Array12078[i] = null;
			if (aBool12076)
				method18728(i, 0L);
			if (anInt12071 == 0) {
				anInt12074 = 0;
				anInt12075 = 0;
			}
		}
	}

	public int method2732() {
		return anInt12075;
	}

	void method18730() {
		if (anInterface51_12077 != null)
			anInterface51_12077.method343();
		for (int i = 0; i < anInterface54Array12078.length; i++) {
			if (anInterface54Array12078[i] != null)
				anInterface54Array12078[i].method343();
		}
	}

	public void finalize() throws Throwable {
		method18730();
		super.finalize();
	}

	void method18731() throws Throwable {
		method18730();
		super.finalize();
	}

	public int method2733() {
		return anInt12075;
	}

	public int method2730() {
		return anInt12074;
	}

	public void method15320(Interface23 interface23) {
		Interface51 interface51 = (Interface51) interface23;
		if (interface23 != null) {
			if (anInt12071 != 0) {
				if (anInt12075 != interface51.method1() || anInt12074 != interface51.method87())
					throw new RuntimeException();
			} else {
				anInt12074 = interface51.method87();
				anInt12075 = interface51.method1();
				method17911();
			}
			anInt12071 |= 0x10;
			anInterface51_12077 = interface51;
			if (aBool12076)
				method18729(interface51.method346());
		} else {
			anInt12071 &= ~0x10;
			anInterface51_12077 = null;
			if (aBool12076)
				method18729(0L);
			if (anInt12071 == 0) {
				anInt12074 = 0;
				anInt12075 = 0;
			}
		}
	}

	boolean method348() {
		for (int i = 0; i < 4; i++) {
			Interface54 interface54 = anInterface54Array12078[i];
			if (interface54 != null) {
				long l = interface54.method346();
				method18728(i, l);
			}
		}
		if (anInterface51_12077 != null)
			method18729(anInterface51_12077.method346());
		aBool12076 = true;
		return super.method348();
	}

	public void method15325(int i, Interface21 interface21) {
		int i_3_ = 1 << i;
		Interface54 interface54 = (Interface54) interface21;
		if (interface21 != null) {
			if (anInt12071 != 0) {
				if (anInt12075 != interface54.method1() || anInt12074 != interface54.method87())
					throw new RuntimeException();
			} else {
				anInt12074 = interface54.method87();
				anInt12075 = interface54.method1();
				method17911();
			}
			anInt12071 |= i_3_;
			anInterface54Array12078[i] = interface54;
			if (aBool12076)
				method18728(i, interface54.method346());
		} else {
			anInt12071 &= i_3_ ^ 0xffffffff;
			anInterface54Array12078[i] = null;
			if (aBool12076)
				method18728(i, 0L);
			if (anInt12071 == 0) {
				anInt12074 = 0;
				anInt12075 = 0;
			}
		}
	}

	public void method15326(int i, Interface21 interface21) {
		int i_4_ = 1 << i;
		Interface54 interface54 = (Interface54) interface21;
		if (interface21 != null) {
			if (anInt12071 != 0) {
				if (anInt12075 != interface54.method1() || anInt12074 != interface54.method87())
					throw new RuntimeException();
			} else {
				anInt12074 = interface54.method87();
				anInt12075 = interface54.method1();
				method17911();
			}
			anInt12071 |= i_4_;
			anInterface54Array12078[i] = interface54;
			if (aBool12076)
				method18728(i, interface54.method346());
		} else {
			anInt12071 &= i_4_ ^ 0xffffffff;
			anInterface54Array12078[i] = null;
			if (aBool12076)
				method18728(i, 0L);
			if (anInt12071 == 0) {
				anInt12074 = 0;
				anInt12075 = 0;
			}
		}
	}

	public int method2728() {
		return anInt12075;
	}

	public void method15329(Interface23 interface23) {
		Interface51 interface51 = (Interface51) interface23;
		if (interface23 != null) {
			if (anInt12071 != 0) {
				if (anInt12075 != interface51.method1() || anInt12074 != interface51.method87())
					throw new RuntimeException();
			} else {
				anInt12074 = interface51.method87();
				anInt12075 = interface51.method1();
				method17911();
			}
			anInt12071 |= 0x10;
			anInterface51_12077 = interface51;
			if (aBool12076)
				method18729(interface51.method346());
		} else {
			anInt12071 &= ~0x10;
			anInterface51_12077 = null;
			if (aBool12076)
				method18729(0L);
			if (anInt12071 == 0) {
				anInt12074 = 0;
				anInt12075 = 0;
			}
		}
	}

	public void method15328(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, boolean bool, boolean bool_10_) {
		if (bool) {
			long l = IDirect3DDevice.GetRenderTarget((aClass180_Sub2_Sub2_12072.aLong11572), 0);
			IDirect3DDevice.StretchRect(aClass180_Sub2_Sub2_12072.aLong11572, anInterface54Array12078[0].method346(), i, i_5_, i_6_, i_7_, l, i_8_, i_9_, i_6_, i_7_, 0);
			IUnknown.Release(l);
		}
	}

	Class171_Sub2_Sub1_Sub1(Class180_Sub2_Sub2 class180_sub2_sub2) {
		super((Class180_Sub2) class180_sub2_sub2);
		aClass180_Sub2_Sub2_12072 = class180_sub2_sub2;
	}

	boolean method351() {
		for (int i = 0; i < 4; i++) {
			Interface54 interface54 = anInterface54Array12078[i];
			if (interface54 != null) {
				long l = interface54.method346();
				method18728(i, l);
			}
		}
		if (anInterface51_12077 != null)
			method18729(anInterface51_12077.method346());
		aBool12076 = true;
		return super.method348();
	}

	boolean method350() {
		for (int i = 0; i < 4; i++) {
			Interface54 interface54 = anInterface54Array12078[i];
			if (interface54 != null) {
				long l = interface54.method346();
				method18728(i, l);
			}
		}
		if (anInterface51_12077 != null)
			method18729(anInterface51_12077.method346());
		aBool12076 = true;
		return super.method348();
	}

	boolean method349() {
		for (int i = 0; i < 4; i++) {
			Interface54 interface54 = anInterface54Array12078[i];
			if (interface54 != null) {
				long l = interface54.method346();
				method18728(i, l);
			}
		}
		if (anInterface51_12077 != null)
			method18729(anInterface51_12077.method346());
		aBool12076 = true;
		return super.method348();
	}

	boolean method352() {
		for (int i = 0; i < 4; i++) {
			Interface54 interface54 = anInterface54Array12078[i];
			if (interface54 != null) {
				long l = interface54.method346();
				method18728(i, l);
			}
		}
		if (anInterface51_12077 != null)
			method18729(anInterface51_12077.method346());
		aBool12076 = true;
		return super.method348();
	}

	public void method15331(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, boolean bool, boolean bool_16_) {
		if (bool) {
			long l = IDirect3DDevice.GetRenderTarget((aClass180_Sub2_Sub2_12072.aLong11572), 0);
			IDirect3DDevice.StretchRect(aClass180_Sub2_Sub2_12072.aLong11572, anInterface54Array12078[0].method346(), i, i_11_, i_12_, i_13_, l, i_14_, i_15_, i_12_, i_13_, 0);
			IUnknown.Release(l);
		}
	}

	void method18732() {
		if (anInterface51_12077 != null)
			anInterface51_12077.method343();
		for (int i = 0; i < anInterface54Array12078.length; i++) {
			if (anInterface54Array12078[i] != null)
				anInterface54Array12078[i].method343();
		}
	}

	public void method15333(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, boolean bool, boolean bool_22_) {
		if (bool) {
			long l = IDirect3DDevice.GetRenderTarget((aClass180_Sub2_Sub2_12072.aLong11572), 0);
			IDirect3DDevice.StretchRect(aClass180_Sub2_Sub2_12072.aLong11572, anInterface54Array12078[0].method346(), i, i_17_, i_18_, i_19_, l, i_20_, i_21_, i_18_, i_19_, 0);
			IUnknown.Release(l);
		}
	}

	boolean method2734() {
		for (int i = 1; i < 4; i++) {
			Interface54 interface54 = anInterface54Array12078[i];
			if (interface54 != null)
				method18728(i, 0L);
		}
		if (anInterface51_12077 != null)
			method18729(0L);
		aBool12076 = false;
		return true;
	}

	public void method129() {
		if (anInterface51_12077 != null)
			anInterface51_12077.method129();
		for (int i = 0; i < anInterface54Array12078.length; i++) {
			if (anInterface54Array12078[i] != null)
				anInterface54Array12078[i].method129();
		}
	}

	void method18733() throws Throwable {
		method18730();
		super.finalize();
	}

	boolean method2731() {
		for (int i = 1; i < 4; i++) {
			Interface54 interface54 = anInterface54Array12078[i];
			if (interface54 != null)
				method18728(i, 0L);
		}
		if (anInterface51_12077 != null)
			method18729(0L);
		aBool12076 = false;
		return true;
	}

	public void method15330(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, boolean bool, boolean bool_28_) {
		if (bool) {
			long l = IDirect3DDevice.GetRenderTarget((aClass180_Sub2_Sub2_12072.aLong11572), 0);
			IDirect3DDevice.StretchRect(aClass180_Sub2_Sub2_12072.aLong11572, anInterface54Array12078[0].method346(), i, i_23_, i_24_, i_25_, l, i_26_, i_27_, i_24_, i_25_, 0);
			IUnknown.Release(l);
		}
	}

	public void method15327(Interface23 interface23) {
		Interface51 interface51 = (Interface51) interface23;
		if (interface23 != null) {
			if (anInt12071 != 0) {
				if (anInt12075 != interface51.method1() || anInt12074 != interface51.method87())
					throw new RuntimeException();
			} else {
				anInt12074 = interface51.method87();
				anInt12075 = interface51.method1();
				method17911();
			}
			anInt12071 |= 0x10;
			anInterface51_12077 = interface51;
			if (aBool12076)
				method18729(interface51.method346());
		} else {
			anInt12071 &= ~0x10;
			anInterface51_12077 = null;
			if (aBool12076)
				method18729(0L);
			if (anInt12071 == 0) {
				anInt12074 = 0;
				anInt12075 = 0;
			}
		}
	}

	void method18734() throws Throwable {
		method18730();
		super.finalize();
	}

	boolean method18735(int i, long l) {
		return Class276.method5145(IDirect3DDevice.SetRenderTarget(aClass180_Sub2_Sub2_12072.aLong11572, i, l));
	}

	boolean method18736(int i, long l) {
		return Class276.method5145(IDirect3DDevice.SetRenderTarget(aClass180_Sub2_Sub2_12072.aLong11572, i, l));
	}

	boolean method18737(long l) {
		return Class276.method5145(IDirect3DDevice.SetDepthStencilSurface(aClass180_Sub2_Sub2_12072.aLong11572, l));
	}

	boolean method18738(long l) {
		return Class276.method5145(IDirect3DDevice.SetDepthStencilSurface(aClass180_Sub2_Sub2_12072.aLong11572, l));
	}

	void method18739() {
		if (anInterface51_12077 != null)
			anInterface51_12077.method343();
		for (int i = 0; i < anInterface54Array12078.length; i++) {
			if (anInterface54Array12078[i] != null)
				anInterface54Array12078[i].method343();
		}
	}

	public boolean method15319() {
		return anInterface54Array12078[0] != null;
	}
}
