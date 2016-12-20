/* Class171_Sub1_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

import jagdx.Class276;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;

public class Class171_Sub1_Sub1_Sub1 extends Class171_Sub1_Sub1 implements Interface52 {
	long aLong11958;
	Class180_Sub2_Sub2 aClass180_Sub2_Sub2_11959;
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS11960;
	int anInt11961;
	long aLong11962;
	long aLong11963;
	int anInt11964;
	boolean aBool11965 = false;
	boolean aBool11966 = false;
	Canvas aCanvas11967;

	public boolean method352() {
		aBool11965 = true;
		if (aLong11958 == 0L) {
			if (aClass180_Sub2_Sub2_11959.aBool11587)
				return false;
			method347();
		}
		if (Class276.method5144(IDirect3DDevice.SetRenderTarget(aClass180_Sub2_Sub2_11959.aLong11572, 0, aLong11962)))
			return false;
		if (Class276.method5144(IDirect3DDevice.SetDepthStencilSurface(aClass180_Sub2_Sub2_11959.aLong11572, aLong11963)))
			return false;
		return super.method348();
	}

	public void method347() {
		if (aLong11958 == 0L) {
			aD3DPRESENT_PARAMETERS11960 = new D3DPRESENT_PARAMETERS(aCanvas11967);
			aD3DPRESENT_PARAMETERS11960.Windowed = true;
			aD3DPRESENT_PARAMETERS11960.BackBufferCount = 1;
			aD3DPRESENT_PARAMETERS11960.PresentationInterval = -2147483648;
			aD3DPRESENT_PARAMETERS11960.BackBufferWidth = anInt11961;
			aD3DPRESENT_PARAMETERS11960.BackBufferHeight = anInt11964;
			if (aBool11966) {
				aLong11958 = IDirect3DDevice.GetSwapChain((aClass180_Sub2_Sub2_11959.aLong11572), 0);
				aLong11962 = IDirect3DSwapChain.GetBackBuffer(aLong11958, 0, 0);
				aLong11963 = (IDirect3DDevice.GetDepthStencilSurface(aClass180_Sub2_Sub2_11959.aLong11572));
			} else {
				if (!Class180_Sub2_Sub2.method18094(aClass180_Sub2_Sub2_11959.anInt11608, aClass180_Sub2_Sub2_11959.anInt11570, aClass180_Sub2_Sub2_11959.aLong11571, aClass180_Sub2_Sub2_11959.anInt9573, aClass180_Sub2_Sub2_11959.aD3DDISPLAYMODE11574, aD3DPRESENT_PARAMETERS11960))
					throw new RuntimeException();
				int i = aD3DPRESENT_PARAMETERS11960.AutoDepthStencilFormat;
				aLong11958 = (IDirect3DDevice.CreateAdditionalSwapChain(aClass180_Sub2_Sub2_11959.aLong11572, aD3DPRESENT_PARAMETERS11960));
				aLong11962 = IDirect3DSwapChain.GetBackBuffer(aLong11958, 0, 0);
				aLong11963 = (IDirect3DDevice.CreateDepthStencilSurface(aClass180_Sub2_Sub2_11959.aLong11572, anInt11961, anInt11964, i, aD3DPRESENT_PARAMETERS11960.MultiSampleType, aD3DPRESENT_PARAMETERS11960.MultiSampleQuality, false));
			}
			aClass180_Sub2_Sub2_11959.method18079(this);
		}
		if (aBool11965)
			method348();
	}

	public int method14731() {
		return IDirect3DSwapChain.Present(aLong11958, 0);
	}

	public int method14732() {
		return IDirect3DSwapChain.Present(aLong11958, 0);
	}

	public boolean method348() {
		aBool11965 = true;
		if (aLong11958 == 0L) {
			if (aClass180_Sub2_Sub2_11959.aBool11587)
				return false;
			method347();
		}
		if (Class276.method5144(IDirect3DDevice.SetRenderTarget(aClass180_Sub2_Sub2_11959.aLong11572, 0, aLong11962)))
			return false;
		if (Class276.method5144(IDirect3DDevice.SetDepthStencilSurface(aClass180_Sub2_Sub2_11959.aLong11572, aLong11963)))
			return false;
		return super.method348();
	}

	void method18632() throws Throwable {
		method18634();
		super.finalize();
	}

	void method18633() throws Throwable {
		method18634();
		super.finalize();
	}

	Class171_Sub1_Sub1_Sub1(Class180_Sub2_Sub2 class180_sub2_sub2, Canvas canvas, int i, int i_0_, boolean bool) {
		super(class180_sub2_sub2);
		aCanvas11967 = canvas;
		aClass180_Sub2_Sub2_11959 = class180_sub2_sub2;
		anInt11961 = i;
		anInt11964 = i_0_;
		aBool11966 = bool;
		method347();
	}

	void method14728(int i, int i_1_) {
		method129();
		anInt11961 = i;
		anInt11964 = i_1_;
		if (aBool11966)
			aClass180_Sub2_Sub2_11959.method18102(anInt11961, anInt11964);
		method347();
		super.method14728(i, i_1_);
	}

	public void method129() {
		if (aLong11962 != 0L) {
			IUnknown.Release(aLong11962);
			aLong11962 = 0L;
		}
		if (aLong11963 != 0L) {
			IUnknown.Release(aLong11963);
			aLong11963 = 0L;
		}
		if (aLong11958 != 0L) {
			IUnknown.Release(aLong11958);
			aLong11958 = 0L;
		}
		aClass180_Sub2_Sub2_11959.method18080(this);
	}

	void method18634() {
		if (aLong11962 != 0L) {
			IUnknown.Release(aLong11962);
			aLong11962 = 0L;
		}
		if (aLong11963 != 0L) {
			IUnknown.Release(aLong11963);
			aLong11963 = 0L;
		}
		if (aLong11958 != 0L) {
			IUnknown.Release(aLong11958);
			aLong11958 = 0L;
		}
		aClass180_Sub2_Sub2_11959.method18080(this);
	}

	public void finalize() throws Throwable {
		method18634();
		super.finalize();
	}

	public int method2732() {
		return anInt11961;
	}

	public int method2733() {
		return anInt11961;
	}

	public int method2730() {
		return anInt11964;
	}

	public boolean method351() {
		aBool11965 = true;
		if (aLong11958 == 0L) {
			if (aClass180_Sub2_Sub2_11959.aBool11587)
				return false;
			method347();
		}
		if (Class276.method5144(IDirect3DDevice.SetRenderTarget(aClass180_Sub2_Sub2_11959.aLong11572, 0, aLong11962)))
			return false;
		if (Class276.method5144(IDirect3DDevice.SetDepthStencilSurface(aClass180_Sub2_Sub2_11959.aLong11572, aLong11963)))
			return false;
		return super.method348();
	}

	public boolean method350() {
		aBool11965 = true;
		if (aLong11958 == 0L) {
			if (aClass180_Sub2_Sub2_11959.aBool11587)
				return false;
			method347();
		}
		if (Class276.method5144(IDirect3DDevice.SetRenderTarget(aClass180_Sub2_Sub2_11959.aLong11572, 0, aLong11962)))
			return false;
		if (Class276.method5144(IDirect3DDevice.SetDepthStencilSurface(aClass180_Sub2_Sub2_11959.aLong11572, aLong11963)))
			return false;
		return super.method348();
	}

	public boolean method349() {
		aBool11965 = true;
		if (aLong11958 == 0L) {
			if (aClass180_Sub2_Sub2_11959.aBool11587)
				return false;
			method347();
		}
		if (Class276.method5144(IDirect3DDevice.SetRenderTarget(aClass180_Sub2_Sub2_11959.aLong11572, 0, aLong11962)))
			return false;
		if (Class276.method5144(IDirect3DDevice.SetDepthStencilSurface(aClass180_Sub2_Sub2_11959.aLong11572, aLong11963)))
			return false;
		return super.method348();
	}

	public int method14733(int i, int i_2_) {
		return IDirect3DSwapChain.Present(aLong11958, 0);
	}

	public void method344() {
		if (aLong11962 != 0L) {
			IUnknown.Release(aLong11962);
			aLong11962 = 0L;
		}
		if (aLong11963 != 0L) {
			IUnknown.Release(aLong11963);
			aLong11963 = 0L;
		}
		if (aLong11958 != 0L) {
			IUnknown.Release(aLong11958);
			aLong11958 = 0L;
		}
		aClass180_Sub2_Sub2_11959.method18080(this);
	}

	void method14729(int i, int i_3_) {
		method129();
		anInt11961 = i;
		anInt11964 = i_3_;
		if (aBool11966)
			aClass180_Sub2_Sub2_11959.method18102(anInt11961, anInt11964);
		method347();
		super.method14728(i, i_3_);
	}

	void method14730(int i, int i_4_) {
		method129();
		anInt11961 = i;
		anInt11964 = i_4_;
		if (aBool11966)
			aClass180_Sub2_Sub2_11959.method18102(anInt11961, anInt11964);
		method347();
		super.method14728(i, i_4_);
	}

	public int method14726() {
		return IDirect3DSwapChain.Present(aLong11958, 0);
	}

	public int method14727(int i, int i_5_) {
		return IDirect3DSwapChain.Present(aLong11958, 0);
	}

	boolean method2731() {
		aBool11965 = false;
		return Class276.method5145(IDirect3DDevice.SetDepthStencilSurface(aClass180_Sub2_Sub2_11959.aLong11572, 0L));
	}

	boolean method2734() {
		aBool11965 = false;
		return Class276.method5145(IDirect3DDevice.SetDepthStencilSurface(aClass180_Sub2_Sub2_11959.aLong11572, 0L));
	}

	void method18635() throws Throwable {
		method18634();
		super.finalize();
	}

	void method18636() throws Throwable {
		method18634();
		super.finalize();
	}

	void method18637() throws Throwable {
		method18634();
		super.finalize();
	}

	public int method2729() {
		return anInt11964;
	}

	public int method2728() {
		return anInt11961;
	}

	public void method353() {
		if (aLong11958 == 0L) {
			aD3DPRESENT_PARAMETERS11960 = new D3DPRESENT_PARAMETERS(aCanvas11967);
			aD3DPRESENT_PARAMETERS11960.Windowed = true;
			aD3DPRESENT_PARAMETERS11960.BackBufferCount = 1;
			aD3DPRESENT_PARAMETERS11960.PresentationInterval = -2147483648;
			aD3DPRESENT_PARAMETERS11960.BackBufferWidth = anInt11961;
			aD3DPRESENT_PARAMETERS11960.BackBufferHeight = anInt11964;
			if (aBool11966) {
				aLong11958 = IDirect3DDevice.GetSwapChain((aClass180_Sub2_Sub2_11959.aLong11572), 0);
				aLong11962 = IDirect3DSwapChain.GetBackBuffer(aLong11958, 0, 0);
				aLong11963 = (IDirect3DDevice.GetDepthStencilSurface(aClass180_Sub2_Sub2_11959.aLong11572));
			} else {
				if (!Class180_Sub2_Sub2.method18094(aClass180_Sub2_Sub2_11959.anInt11608, aClass180_Sub2_Sub2_11959.anInt11570, aClass180_Sub2_Sub2_11959.aLong11571, aClass180_Sub2_Sub2_11959.anInt9573, aClass180_Sub2_Sub2_11959.aD3DDISPLAYMODE11574, aD3DPRESENT_PARAMETERS11960))
					throw new RuntimeException();
				int i = aD3DPRESENT_PARAMETERS11960.AutoDepthStencilFormat;
				aLong11958 = (IDirect3DDevice.CreateAdditionalSwapChain(aClass180_Sub2_Sub2_11959.aLong11572, aD3DPRESENT_PARAMETERS11960));
				aLong11962 = IDirect3DSwapChain.GetBackBuffer(aLong11958, 0, 0);
				aLong11963 = (IDirect3DDevice.CreateDepthStencilSurface(aClass180_Sub2_Sub2_11959.aLong11572, anInt11961, anInt11964, i, aD3DPRESENT_PARAMETERS11960.MultiSampleType, aD3DPRESENT_PARAMETERS11960.MultiSampleQuality, false));
			}
			aClass180_Sub2_Sub2_11959.method18079(this);
		}
		if (aBool11965)
			method348();
	}
}
