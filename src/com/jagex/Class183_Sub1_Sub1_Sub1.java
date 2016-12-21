/* Class183_Sub1_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

import jagdx.Class284;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;

public class Class183_Sub1_Sub1_Sub1 extends Class183_Sub1_Sub1 implements Interface52 {
	int anInt11959;
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS11960;
	long aLong11961;
	Canvas aCanvas11962;
	long aLong11963;
	long aLong11964;
	int anInt11965;
	boolean aBool11966 = false;
	boolean aBool11967 = false;
	Class167_Sub3_Sub2 aClass167_Sub3_Sub2_11968;

	public boolean method352() {
		aBool11966 = true;
		if (aLong11961 == 0L) {
			if (aClass167_Sub3_Sub2_11968.aBool11545)
				return false;
			method353();
		}
		if (Class284.method3778(IDirect3DDevice.SetRenderTarget(aClass167_Sub3_Sub2_11968.aLong11573, 0, aLong11963)))
			return false;
		if (Class284.method3778(IDirect3DDevice.SetDepthStencilSurface(aClass167_Sub3_Sub2_11968.aLong11573, aLong11964)))
			return false;
		return super.method352();
	}

	public void method353() {
		if (aLong11961 == 0L) {
			aD3DPRESENT_PARAMETERS11960 = new D3DPRESENT_PARAMETERS(aCanvas11962);
			aD3DPRESENT_PARAMETERS11960.Windowed = true;
			aD3DPRESENT_PARAMETERS11960.BackBufferCount = 1;
			aD3DPRESENT_PARAMETERS11960.PresentationInterval = -2147483648;
			aD3DPRESENT_PARAMETERS11960.BackBufferWidth = anInt11959;
			aD3DPRESENT_PARAMETERS11960.BackBufferHeight = anInt11965;
			if (aBool11967) {
				aLong11961 = IDirect3DDevice.GetSwapChain((aClass167_Sub3_Sub2_11968.aLong11573), 0);
				aLong11963 = IDirect3DSwapChain.GetBackBuffer(aLong11961, 0, 0);
				aLong11964 = (IDirect3DDevice.GetDepthStencilSurface(aClass167_Sub3_Sub2_11968.aLong11573));
			} else {
				if (!Class167_Sub3_Sub2.method10625(aClass167_Sub3_Sub2_11968.anInt11559, aClass167_Sub3_Sub2_11968.anInt11539, aClass167_Sub3_Sub2_11968.aLong11540, aClass167_Sub3_Sub2_11968.anInt9568, aClass167_Sub3_Sub2_11968.aD3DDISPLAYMODE11543, aD3DPRESENT_PARAMETERS11960))
					throw new RuntimeException();
				int i = aD3DPRESENT_PARAMETERS11960.AutoDepthStencilFormat;
				aLong11961 = (IDirect3DDevice.CreateAdditionalSwapChain(aClass167_Sub3_Sub2_11968.aLong11573, aD3DPRESENT_PARAMETERS11960));
				aLong11963 = IDirect3DSwapChain.GetBackBuffer(aLong11961, 0, 0);
				aLong11964 = (IDirect3DDevice.CreateDepthStencilSurface(aClass167_Sub3_Sub2_11968.aLong11573, anInt11959, anInt11965, i, aD3DPRESENT_PARAMETERS11960.MultiSampleType, aD3DPRESENT_PARAMETERS11960.MultiSampleQuality, false));
			}
			aClass167_Sub3_Sub2_11968.method10608(this);
		}
		if (aBool11966)
			method352();
	}

	public int method8654(int i, int i_0_) {
		return IDirect3DSwapChain.Present(aLong11961, 0);
	}

	public int method2726() {
		return anInt11965;
	}

	public int method8653(int i, int i_1_) {
		return IDirect3DSwapChain.Present(aLong11961, 0);
	}

	boolean method2727() {
		aBool11966 = false;
		return Class284.method3779(IDirect3DDevice.SetDepthStencilSurface(aClass167_Sub3_Sub2_11968.aLong11573, 0L));
	}

	public int method8650() {
		return IDirect3DSwapChain.Present(aLong11961, 0);
	}

	public int method8651(int i, int i_2_) {
		return IDirect3DSwapChain.Present(aLong11961, 0);
	}

	boolean method2730() {
		aBool11966 = false;
		return Class284.method3779(IDirect3DDevice.SetDepthStencilSurface(aClass167_Sub3_Sub2_11968.aLong11573, 0L));
	}

	public void method131() {
		if (aLong11963 != 0L) {
			IUnknown.Release(aLong11963);
			aLong11963 = 0L;
		}
		if (aLong11964 != 0L) {
			IUnknown.Release(aLong11964);
			aLong11964 = 0L;
		}
		if (aLong11961 != 0L) {
			IUnknown.Release(aLong11961);
			aLong11961 = 0L;
		}
		aClass167_Sub3_Sub2_11968.method10624(this);
	}

	void method10921() {
		if (aLong11963 != 0L) {
			IUnknown.Release(aLong11963);
			aLong11963 = 0L;
		}
		if (aLong11964 != 0L) {
			IUnknown.Release(aLong11964);
			aLong11964 = 0L;
		}
		if (aLong11961 != 0L) {
			IUnknown.Release(aLong11961);
			aLong11961 = 0L;
		}
		aClass167_Sub3_Sub2_11968.method10624(this);
	}

	public void finalize() throws Throwable {
		method10921();
		super.finalize();
	}

	public int method2733() {
		return anInt11959;
	}

	public int method2728() {
		return anInt11959;
	}

	public int method2729() {
		return anInt11959;
	}

	public void method355() {
		if (aLong11963 != 0L) {
			IUnknown.Release(aLong11963);
			aLong11963 = 0L;
		}
		if (aLong11964 != 0L) {
			IUnknown.Release(aLong11964);
			aLong11964 = 0L;
		}
		if (aLong11961 != 0L) {
			IUnknown.Release(aLong11961);
			aLong11961 = 0L;
		}
		aClass167_Sub3_Sub2_11968.method10624(this);
	}

	public void method178() {
		if (aLong11961 == 0L) {
			aD3DPRESENT_PARAMETERS11960 = new D3DPRESENT_PARAMETERS(aCanvas11962);
			aD3DPRESENT_PARAMETERS11960.Windowed = true;
			aD3DPRESENT_PARAMETERS11960.BackBufferCount = 1;
			aD3DPRESENT_PARAMETERS11960.PresentationInterval = -2147483648;
			aD3DPRESENT_PARAMETERS11960.BackBufferWidth = anInt11959;
			aD3DPRESENT_PARAMETERS11960.BackBufferHeight = anInt11965;
			if (aBool11967) {
				aLong11961 = IDirect3DDevice.GetSwapChain((aClass167_Sub3_Sub2_11968.aLong11573), 0);
				aLong11963 = IDirect3DSwapChain.GetBackBuffer(aLong11961, 0, 0);
				aLong11964 = (IDirect3DDevice.GetDepthStencilSurface(aClass167_Sub3_Sub2_11968.aLong11573));
			} else {
				if (!Class167_Sub3_Sub2.method10625(aClass167_Sub3_Sub2_11968.anInt11559, aClass167_Sub3_Sub2_11968.anInt11539, aClass167_Sub3_Sub2_11968.aLong11540, aClass167_Sub3_Sub2_11968.anInt9568, aClass167_Sub3_Sub2_11968.aD3DDISPLAYMODE11543, aD3DPRESENT_PARAMETERS11960))
					throw new RuntimeException();
				int i = aD3DPRESENT_PARAMETERS11960.AutoDepthStencilFormat;
				aLong11961 = (IDirect3DDevice.CreateAdditionalSwapChain(aClass167_Sub3_Sub2_11968.aLong11573, aD3DPRESENT_PARAMETERS11960));
				aLong11963 = IDirect3DSwapChain.GetBackBuffer(aLong11961, 0, 0);
				aLong11964 = (IDirect3DDevice.CreateDepthStencilSurface(aClass167_Sub3_Sub2_11968.aLong11573, anInt11959, anInt11965, i, aD3DPRESENT_PARAMETERS11960.MultiSampleType, aD3DPRESENT_PARAMETERS11960.MultiSampleQuality, false));
			}
			aClass167_Sub3_Sub2_11968.method10608(this);
		}
		if (aBool11966)
			method352();
	}

	public void method129() {
		if (aLong11963 != 0L) {
			IUnknown.Release(aLong11963);
			aLong11963 = 0L;
		}
		if (aLong11964 != 0L) {
			IUnknown.Release(aLong11964);
			aLong11964 = 0L;
		}
		if (aLong11961 != 0L) {
			IUnknown.Release(aLong11961);
			aLong11961 = 0L;
		}
		aClass167_Sub3_Sub2_11968.method10624(this);
	}

	public int method2724() {
		return anInt11965;
	}

	public int method2731() {
		return anInt11965;
	}

	public boolean method354() {
		aBool11966 = true;
		if (aLong11961 == 0L) {
			if (aClass167_Sub3_Sub2_11968.aBool11545)
				return false;
			method353();
		}
		if (Class284.method3778(IDirect3DDevice.SetRenderTarget(aClass167_Sub3_Sub2_11968.aLong11573, 0, aLong11963)))
			return false;
		if (Class284.method3778(IDirect3DDevice.SetDepthStencilSurface(aClass167_Sub3_Sub2_11968.aLong11573, aLong11964)))
			return false;
		return super.method352();
	}

	boolean method2732() {
		aBool11966 = false;
		return Class284.method3779(IDirect3DDevice.SetDepthStencilSurface(aClass167_Sub3_Sub2_11968.aLong11573, 0L));
	}

	boolean method2734() {
		aBool11966 = false;
		return Class284.method3779(IDirect3DDevice.SetDepthStencilSurface(aClass167_Sub3_Sub2_11968.aLong11573, 0L));
	}

	void method8652(int i, int i_3_) {
		method131();
		anInt11959 = i;
		anInt11965 = i_3_;
		if (aBool11967)
			aClass167_Sub3_Sub2_11968.method10607(anInt11959, anInt11965);
		method353();
		super.method8652(i, i_3_);
	}

	void method8657(int i, int i_4_) {
		method131();
		anInt11959 = i;
		anInt11965 = i_4_;
		if (aBool11967)
			aClass167_Sub3_Sub2_11968.method10607(anInt11959, anInt11965);
		method353();
		super.method8652(i, i_4_);
	}

	void method10922() throws Throwable {
		method10921();
		super.finalize();
	}

	public int method8658() {
		return IDirect3DSwapChain.Present(aLong11961, 0);
	}

	Class183_Sub1_Sub1_Sub1(Class167_Sub3_Sub2 class167_sub3_sub2, Canvas canvas, int i, int i_5_, boolean bool) {
		super(class167_sub3_sub2);
		aCanvas11962 = canvas;
		aClass167_Sub3_Sub2_11968 = class167_sub3_sub2;
		anInt11959 = i;
		anInt11965 = i_5_;
		aBool11967 = bool;
		method353();
	}

	public void method356() {
		if (aLong11961 == 0L) {
			aD3DPRESENT_PARAMETERS11960 = new D3DPRESENT_PARAMETERS(aCanvas11962);
			aD3DPRESENT_PARAMETERS11960.Windowed = true;
			aD3DPRESENT_PARAMETERS11960.BackBufferCount = 1;
			aD3DPRESENT_PARAMETERS11960.PresentationInterval = -2147483648;
			aD3DPRESENT_PARAMETERS11960.BackBufferWidth = anInt11959;
			aD3DPRESENT_PARAMETERS11960.BackBufferHeight = anInt11965;
			if (aBool11967) {
				aLong11961 = IDirect3DDevice.GetSwapChain((aClass167_Sub3_Sub2_11968.aLong11573), 0);
				aLong11963 = IDirect3DSwapChain.GetBackBuffer(aLong11961, 0, 0);
				aLong11964 = (IDirect3DDevice.GetDepthStencilSurface(aClass167_Sub3_Sub2_11968.aLong11573));
			} else {
				if (!Class167_Sub3_Sub2.method10625(aClass167_Sub3_Sub2_11968.anInt11559, aClass167_Sub3_Sub2_11968.anInt11539, aClass167_Sub3_Sub2_11968.aLong11540, aClass167_Sub3_Sub2_11968.anInt9568, aClass167_Sub3_Sub2_11968.aD3DDISPLAYMODE11543, aD3DPRESENT_PARAMETERS11960))
					throw new RuntimeException();
				int i = aD3DPRESENT_PARAMETERS11960.AutoDepthStencilFormat;
				aLong11961 = (IDirect3DDevice.CreateAdditionalSwapChain(aClass167_Sub3_Sub2_11968.aLong11573, aD3DPRESENT_PARAMETERS11960));
				aLong11963 = IDirect3DSwapChain.GetBackBuffer(aLong11961, 0, 0);
				aLong11964 = (IDirect3DDevice.CreateDepthStencilSurface(aClass167_Sub3_Sub2_11968.aLong11573, anInt11959, anInt11965, i, aD3DPRESENT_PARAMETERS11960.MultiSampleType, aD3DPRESENT_PARAMETERS11960.MultiSampleQuality, false));
			}
			aClass167_Sub3_Sub2_11968.method10608(this);
		}
		if (aBool11966)
			method352();
	}

	public void method183() {
		if (aLong11961 == 0L) {
			aD3DPRESENT_PARAMETERS11960 = new D3DPRESENT_PARAMETERS(aCanvas11962);
			aD3DPRESENT_PARAMETERS11960.Windowed = true;
			aD3DPRESENT_PARAMETERS11960.BackBufferCount = 1;
			aD3DPRESENT_PARAMETERS11960.PresentationInterval = -2147483648;
			aD3DPRESENT_PARAMETERS11960.BackBufferWidth = anInt11959;
			aD3DPRESENT_PARAMETERS11960.BackBufferHeight = anInt11965;
			if (aBool11967) {
				aLong11961 = IDirect3DDevice.GetSwapChain((aClass167_Sub3_Sub2_11968.aLong11573), 0);
				aLong11963 = IDirect3DSwapChain.GetBackBuffer(aLong11961, 0, 0);
				aLong11964 = (IDirect3DDevice.GetDepthStencilSurface(aClass167_Sub3_Sub2_11968.aLong11573));
			} else {
				if (!Class167_Sub3_Sub2.method10625(aClass167_Sub3_Sub2_11968.anInt11559, aClass167_Sub3_Sub2_11968.anInt11539, aClass167_Sub3_Sub2_11968.aLong11540, aClass167_Sub3_Sub2_11968.anInt9568, aClass167_Sub3_Sub2_11968.aD3DDISPLAYMODE11543, aD3DPRESENT_PARAMETERS11960))
					throw new RuntimeException();
				int i = aD3DPRESENT_PARAMETERS11960.AutoDepthStencilFormat;
				aLong11961 = (IDirect3DDevice.CreateAdditionalSwapChain(aClass167_Sub3_Sub2_11968.aLong11573, aD3DPRESENT_PARAMETERS11960));
				aLong11963 = IDirect3DSwapChain.GetBackBuffer(aLong11961, 0, 0);
				aLong11964 = (IDirect3DDevice.CreateDepthStencilSurface(aClass167_Sub3_Sub2_11968.aLong11573, anInt11959, anInt11965, i, aD3DPRESENT_PARAMETERS11960.MultiSampleType, aD3DPRESENT_PARAMETERS11960.MultiSampleQuality, false));
			}
			aClass167_Sub3_Sub2_11968.method10608(this);
		}
		if (aBool11966)
			method352();
	}

	void method10923() throws Throwable {
		method10921();
		super.finalize();
	}

	void method8656(int i, int i_6_) {
		method131();
		anInt11959 = i;
		anInt11965 = i_6_;
		if (aBool11967)
			aClass167_Sub3_Sub2_11968.method10607(anInt11959, anInt11965);
		method353();
		super.method8652(i, i_6_);
	}

	void method8649(int i, int i_7_) {
		method131();
		anInt11959 = i;
		anInt11965 = i_7_;
		if (aBool11967)
			aClass167_Sub3_Sub2_11968.method10607(anInt11959, anInt11965);
		method353();
		super.method8652(i, i_7_);
	}

	public void method130() {
		if (aLong11963 != 0L) {
			IUnknown.Release(aLong11963);
			aLong11963 = 0L;
		}
		if (aLong11964 != 0L) {
			IUnknown.Release(aLong11964);
			aLong11964 = 0L;
		}
		if (aLong11961 != 0L) {
			IUnknown.Release(aLong11961);
			aLong11961 = 0L;
		}
		aClass167_Sub3_Sub2_11968.method10624(this);
	}

	void method10924() {
		if (aLong11963 != 0L) {
			IUnknown.Release(aLong11963);
			aLong11963 = 0L;
		}
		if (aLong11964 != 0L) {
			IUnknown.Release(aLong11964);
			aLong11964 = 0L;
		}
		if (aLong11961 != 0L) {
			IUnknown.Release(aLong11961);
			aLong11961 = 0L;
		}
		aClass167_Sub3_Sub2_11968.method10624(this);
	}

	public int method8655() {
		return IDirect3DSwapChain.Present(aLong11961, 0);
	}

	void method10925() {
		if (aLong11963 != 0L) {
			IUnknown.Release(aLong11963);
			aLong11963 = 0L;
		}
		if (aLong11964 != 0L) {
			IUnknown.Release(aLong11964);
			aLong11964 = 0L;
		}
		if (aLong11961 != 0L) {
			IUnknown.Release(aLong11961);
			aLong11961 = 0L;
		}
		aClass167_Sub3_Sub2_11968.method10624(this);
	}

	public int method2725() {
		return anInt11959;
	}

	boolean method2735() {
		aBool11966 = false;
		return Class284.method3779(IDirect3DDevice.SetDepthStencilSurface(aClass167_Sub3_Sub2_11968.aLong11573, 0L));
	}
}
