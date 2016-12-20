/* Class180_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

import jagdx.Class276;
import jagdx.Class280;
import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DSurface;
import jagdx.IUnknown;
import jagdx.RuntimeException_Sub5;

public class Class180_Sub2_Sub2 extends Class180_Sub2 {
	boolean aBool11569;
	int anInt11570;
	long aLong11571 = 0L;
	long aLong11572 = 0L;
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS11573;
	D3DDISPLAYMODE aD3DDISPLAYMODE11574;
	Class694 aClass694_11575 = new Class694();
	boolean aBool11576;
	long aLong11577;
	boolean aBool11578;
	long aLong11579;
	boolean aBool11580;
	boolean[] aBoolArray11581;
	static int[] anIntArray11582;
	long aLong11583;
	boolean[] aBoolArray11584;
	Class343[] aClass343Array11585;
	int[] anIntArray11586;
	boolean aBool11587 = false;
	Class265_Sub2 aClass265_Sub2_11588;
	boolean[] aBoolArray11589;
	D3DCAPS aD3DCAPS11590;
	int anInt11591;
	long aLong11592;
	boolean aBool11593;
	long aLong11594;
	boolean aBool11595;
	boolean[] aBoolArray11596;
	boolean aBool11597;
	long[] aLongArray11598;
	boolean aBool11599;
	boolean aBool11600;
	float[] aFloatArray11601;
	long[] aLongArray11602;
	int anInt11603;
	long[] aLongArray11604;
	static final int anInt11605 = 3;
	boolean aBool11606;
	boolean aBool11607;
	int anInt11608;
	int[] anIntArray11609;
	int anInt11610;
	int anInt11611;
	static int[] anIntArray11612 = { 77, 80 };
	Class427 aClass427_11613;

	void method14924() {
		/* empty */
	}

	public boolean method14889() {
		return (aD3DCAPS11590.PixelShaderVersion & 0xffff) >= 257;
	}

	Class355 method15266(Class372[] class372s) {
		return new Class355_Sub1(this, class372s);
	}

	void method3263() {
		super.finalize();
	}

	void method18076(Interface52 interface52) {
		if (method18078(interface52) == null)
			aClass694_11575.method14147(new Class527_Sub26(interface52), -1155235651);
	}

	void method15254() {
		switch (aClass357_9568.anInt3827) {
		case 0:
			IDirect3DDevice.SetRenderState(aLong11572, 19, 5);
			IDirect3DDevice.SetRenderState(aLong11572, 20, 6);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(aLong11572, 19, 2);
			IDirect3DDevice.SetRenderState(aLong11572, 20, 1);
			break;
		case 3:
			IDirect3DDevice.SetRenderState(aLong11572, 19, 2);
			IDirect3DDevice.SetRenderState(aLong11572, 20, 2);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(aLong11572, 19, 9);
			IDirect3DDevice.SetRenderState(aLong11572, 20, 2);
			break;
		}
		switch (anInt9593) {
		case 3:
			IDirect3DDevice.SetRenderState(aLong11572, 207, 1);
			IDirect3DDevice.SetRenderState(aLong11572, 208, 2);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(aLong11572, 207, 2);
			IDirect3DDevice.SetRenderState(aLong11572, 208, 1);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(aLong11572, 207, 2);
			IDirect3DDevice.SetRenderState(aLong11572, 208, 2);
			break;
		case 0:
			IDirect3DDevice.SetRenderState(aLong11572, 207, 1);
			IDirect3DDevice.SetRenderState(aLong11572, 208, 1);
			break;
		}
	}

	void method15030() {
		method3126();
		for (Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass694_11575.method14081((short) 20504); class527_sub26 != null; class527_sub26 = (Class527_Sub26) aClass694_11575.method14086(-65534)) {
			Interface52 interface52 = (Interface52) class527_sub26.anObject10522;
			interface52.method129();
		}
		super.method15030();
	}

	public boolean method14898(boolean bool) {
		if (bool)
			return aBool11578;
		return aBool11578 && aBool11569;
	}

	void method15052() {
		if (aBool9597) {
			D3DLIGHT.SetDirection(aLong11577, -aFloatArray9507[0], -aFloatArray9507[1], -aFloatArray9507[2]);
			D3DLIGHT.SetDirection(aLong11583, -aFloatArray9519[0], -aFloatArray9519[1], -aFloatArray9519[2]);
			aBool11580 = false;
		}
	}

	public Class143 method3077() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(aLong11571, anInt11608, 0, d3dadapter_identifier);
		return new Class143(d3dadapter_identifier.VendorID, method14891() ? "Direct3D FF" : "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion, method14891());
	}

	void method3079(int i, int i_0_) throws Exception_Sub1 {
		if (aBool11587) {
			if (!method18102(aClass171_Sub1_2073.method2728(), aClass171_Sub1_2073.method2729()))
				return;
			((Class171_Sub1_Sub1_Sub1) aClass171_Sub1_2073).method347();
		} else
			IDirect3DDevice.EndScene(aLong11572);
		int i_1_ = aClass171_Sub1_2073.method14726();
		if (Class276.method5144(i_1_)) {
			aBool11587 = true;
			aClass171_Sub1_2073.method129();
		} else {
			IDirect3DDevice.BeginScene(aLong11572);
			if (anInterface24_2085 != null)
				anInterface24_2085.method19((byte) -9);
		}
	}

	public void method3080() {
		long l = IDirect3DDevice.CreateEventQuery(aLong11572);
		if (Class276.method5145(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	void method3082() {
		super.method3082();
		if (aLong11577 != 0L) {
			D3DLIGHT.Destroy(aLong11577);
			aLong11577 = 0L;
		}
		if (aLong11583 != 0L) {
			D3DLIGHT.Destroy(aLong11583);
			aLong11583 = 0L;
		}
		if (aLong11579 != 0L) {
			D3DLIGHT.Destroy(aLong11579);
			aLong11579 = 0L;
		}
		if (aLong11572 != 0L) {
			IDirect3DDevice.Destroy(aLong11572);
			aLong11572 = 0L;
		}
		if (aLong11571 != 0L) {
			IUnknown.Release(aLong11571);
			aLong11571 = 0L;
		}
	}

	public void finalize() {
		super.finalize();
	}

	public float method14911() {
		return -0.5F;
	}

	final void method18077(long l) {
		aLong11592 = l;
		IDirect3DDevice.SetVertexShader(aLong11572, l);
	}

	Class171_Sub1 method3108(Canvas canvas, int i, int i_2_) {
		return new Class171_Sub1_Sub1_Sub1(this, canvas, i, i_2_, false);
	}

	public final synchronized void method3235(int i) {
		for (int i_3_ = 0; i_3_ < anInt11603; i_3_++)
			IUnknown.Release(aLongArray11604[i_3_]);
		anInt11603 = 0;
		super.method3209(i);
	}

	public Interface23 method3111(int i, int i_4_) {
		return new Class415(this, Class184.aClass184_2106, i, i_4_, 0);
	}

	public Interface23 method3434(int i, int i_5_) {
		return new Class415(this, Class184.aClass184_2106, i, i_5_, 0);
	}

	Class527_Sub26 method18078(Interface52 interface52) {
		for (Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass694_11575.method14081((short) 10971); class527_sub26 != null; class527_sub26 = (Class527_Sub26) aClass694_11575.method14086(-65534)) {
			if (class527_sub26.anObject10522 == interface52)
				return class527_sub26;
		}
		return null;
	}

	void method18079(Interface52 interface52) {
		if (method18078(interface52) == null)
			aClass694_11575.method14147(new Class527_Sub26(interface52), -1284856370);
	}

	void method18080(Interface52 interface52) {
		Class527_Sub26 class527_sub26 = method18078(interface52);
		if (class527_sub26 != null)
			class527_sub26.method8735(-1889161967);
	}

	public int[] method3113(int i, int i_6_, int i_7_, int i_8_) {
		method3165();
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(aLong11572, 0);
		long l_9_ = IDirect3DDevice.CreateRenderTarget(aLong11572, i_7_, i_8_, 21, 0, 0, true);
		int i_10_ = IDirect3DDevice.StretchRect(aLong11572, l, i, i_6_, i_7_, i_8_, l_9_, 0, 0, i_7_, i_8_, 1);
		method15097(i_7_ * i_8_ * 4);
		if (Class276.method5145(i_10_)) {
			is = new int[i_7_ * i_8_];
			IDirect3DSurface.Download(l_9_, 0, 0, i_7_, i_8_, i_7_ * 4, 16, aLong9439);
			aByteBuffer9438.clear();
			aByteBuffer9438.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_9_);
		return is;
	}

	Interface39 method14917(int i, boolean bool, int[][] is) {
		return new Class416_Sub3(this, i, bool, is);
	}

	public boolean method3469() {
		return true;
	}

	void method18081(int i, int i_11_) {
		method3126();
		method3482(i, i_11_, -1784395681);
		aLong11594 = (IDirect3DDevice.CreateRenderTarget(aLong11572, i, i_11_, method18096(Class157.aClass157_1723, Class184.aClass184_2104), 0, 0, false));
		for (int i_12_ = 0; i_12_ < 3; i_12_++)
			aLongArray11598[i_12_] = (IDirect3DDevice.CreateOffscreenPlainSurface(aLong11572, i, i_11_, method18096(Class157.aClass157_1723, Class184.aClass184_2104), 2));
		method15097(i * i_11_ * 4);
	}

	public boolean method15021() {
		return (aD3DCAPS11590.PixelShaderVersion & 0xffff) >= 257;
	}

	public boolean method3084() {
		return true;
	}

	public boolean method3118() {
		return false;
	}

	Interface40 method15027(Class157 class157, Class184 class184, int i, int i_13_) {
		return new Class416_Sub1_Sub1(this, class157, class184, i, i_13_);
	}

	public int method3119() {
		if (aLongArray11602[anInt11610] == 0L)
			return -1;
		return ((Class276.method5145(IDirect3DEventQuery.IsSignaled(aLongArray11602[anInt11610]))) ? anIntArray11609[anInt11610] : -1);
	}

	void method15175() {
		if (aBool9597 && !aBool11580) {
			IDirect3DDevice.LightEnable(aLong11572, 0, false);
			IDirect3DDevice.LightEnable(aLong11572, 1, false);
			IDirect3DDevice.SetLight(aLong11572, 0, aLong11577);
			IDirect3DDevice.SetLight(aLong11572, 1, aLong11583);
			IDirect3DDevice.LightEnable(aLong11572, 0, true);
			IDirect3DDevice.LightEnable(aLong11572, 1, true);
			aBool11580 = true;
		}
	}

	final void method15226(int i, Class368 class368, boolean bool, boolean bool_14_) {
		if (aBool9597) {
			int i_15_ = 0;
			int i_16_;
			switch (i) {
			default:
				i_16_ = 2;
				break;
			case 2:
				i_16_ = 26;
				break;
			case 1:
				i_16_ = 3;
			}
			if (bool)
				i_15_ |= 0x20;
			if (bool_14_)
				i_15_ |= 0x10;
			IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, i_16_, (method18089(class368) | i_15_));
		}
	}

	final void method18082(Class416_Sub2 class416_sub2) {
		method18086(class416_sub2);
		if (!aBoolArray11581[anInt9525]) {
			IDirect3DDevice.SetSamplerState(aLong11572, anInt9525, 1, 1);
			aBoolArray11581[anInt9525] = true;
		}
		if (!aBoolArray11596[anInt9525]) {
			IDirect3DDevice.SetSamplerState(aLong11572, anInt9525, 2, 1);
			aBoolArray11596[anInt9525] = true;
		}
	}

	public boolean method15053(boolean bool) {
		if (bool)
			return aBool11578;
		return aBool11578 && aBool11569;
	}

	public void method3123(long l) {
		/* empty */
	}

	public void method3126() {
		if (aLong11594 != 0L) {
			IUnknown.Release(aLong11594);
			aLong11594 = 0L;
		}
		for (int i = 0; i < 3; i++) {
			if (aLongArray11602[i] != 0L) {
				IUnknown.Release(aLongArray11602[i]);
				aLongArray11602[i] = 0L;
			}
			if (aLongArray11598[i] != 0L) {
				IUnknown.Release(aLongArray11598[i]);
				aLongArray11598[i] = 0L;
			}
		}
		anInt11611 = 0;
		anInt11610 = 0;
	}

	public Class179 method3409(Class179 class179, Class179 class179_17_, float f, Class179 class179_18_) {
		return f < 0.5F ? class179 : class179_17_;
	}

	void method14919() {
		if (aBool9597 && !aBool11580) {
			IDirect3DDevice.LightEnable(aLong11572, 0, false);
			IDirect3DDevice.LightEnable(aLong11572, 1, false);
			IDirect3DDevice.SetLight(aLong11572, 0, aLong11577);
			IDirect3DDevice.SetLight(aLong11572, 1, aLong11583);
			IDirect3DDevice.LightEnable(aLong11572, 0, true);
			IDirect3DDevice.LightEnable(aLong11572, 1, true);
			aBool11580 = true;
		}
	}

	public Class179 method3390(Class179 class179, Class179 class179_19_, float f, Class179 class179_20_) {
		return f < 0.5F ? class179 : class179_19_;
	}

	void method18083(Interface52 interface52) {
		Class527_Sub26 class527_sub26 = method18078(interface52);
		if (class527_sub26 != null)
			class527_sub26.method8735(-1889161967);
	}

	void method14922() {
		IDirect3DDevice.method15866(aLong11572, 174, aBool9604);
	}

	final void method18084(long l) {
		aLong11592 = l;
		IDirect3DDevice.SetVertexShader(aLong11572, l);
	}

	final void method18085(long l) {
		IDirect3DDevice.SetPixelShader(aLong11572, l);
	}

	void method15015() {
		IDirect3DDevice.method15866(aLong11572, 14, aBool9559 && aBool9563);
	}

	public void method14940(Class427 class427) {
		class427.method6751(aClass427_11613);
	}

	void method14952() {
		IDirect3DDevice.method15866(aLong11572, 7, aBool9427 && aBool9503);
	}

	void method15214() {
		IDirect3DDevice.method15866(aLong11572, 14, aBool9559 && aBool9563);
	}

	public Class143 method3218() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(aLong11571, anInt11608, 0, d3dadapter_identifier);
		return new Class143(d3dadapter_identifier.VendorID, method14891() ? "Direct3D FF" : "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion, method14891());
	}

	void method15193() {
		if (aBool9597) {
			D3DLIGHT.SetAmbient(aLong11577, aFloat9583 * aFloat9551, aFloat9513 * aFloat9551, aFloat9448 * aFloat9551, 0.0F);
			aBool11580 = false;
		}
	}

	void method15044() {
		if (aBool9597) {
			float f = aBool9505 ? aFloat9516 : 0.0F;
			float f_21_ = aBool9505 ? -aFloat9548 : 0.0F;
			D3DLIGHT.SetDiffuse(aLong11577, f * aFloat9583, f * aFloat9513, f * aFloat9448, 0.0F);
			D3DLIGHT.SetDiffuse(aLong11583, f_21_ * aFloat9583, f_21_ * aFloat9513, f_21_ * aFloat9448, 0.0F);
			aBool11580 = false;
		}
	}

	void method14955() {
		if (aBool9597) {
			D3DLIGHT.SetDirection(aLong11577, -aFloatArray9507[0], -aFloatArray9507[1], -aFloatArray9507[2]);
			D3DLIGHT.SetDirection(aLong11583, -aFloatArray9519[0], -aFloatArray9519[1], -aFloatArray9519[2]);
			aBool11580 = false;
		}
	}

	void method14938() {
		method15044();
		method14956();
	}

	void method14956() {
		if (aBool9597 && !aBool11580) {
			IDirect3DDevice.LightEnable(aLong11572, 0, false);
			IDirect3DDevice.LightEnable(aLong11572, 1, false);
			IDirect3DDevice.SetLight(aLong11572, 0, aLong11577);
			IDirect3DDevice.SetLight(aLong11572, 1, aLong11583);
			IDirect3DDevice.LightEnable(aLong11572, 0, true);
			IDirect3DDevice.LightEnable(aLong11572, 1, true);
			aBool11580 = true;
		}
	}

	public final synchronized void method3267(int i) {
		for (int i_22_ = 0; i_22_ < anInt11603; i_22_++)
			IUnknown.Release(aLongArray11604[i_22_]);
		anInt11603 = 0;
		super.method3209(i);
	}

	boolean method14960(Class157 class157, Class184 class184) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class276.method5145(IDirect3D.GetAdapterDisplayMode(aLong11571, anInt11608, d3ddisplaymode)) && Class276.method5145(IDirect3D.CheckDeviceFormat(aLong11571, anInt11608, anInt11570, d3ddisplaymode.Format, 0, 3, method18096(class157, class184))));
	}

	boolean method14961(Class157 class157, Class184 class184) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class276.method5145(IDirect3D.GetAdapterDisplayMode(aLong11571, anInt11608, d3ddisplaymode)) && Class276.method5145(IDirect3D.CheckDeviceFormat(aLong11571, anInt11608, anInt11570, d3ddisplaymode.Format, 0, 4, method18096(class157, class184))));
	}

	void method15294() {
		IDirect3DDevice.method15866(aLong11572, 14, aBool9559 && aBool9563);
	}

	void method15272(Interface44 interface44) {
		IDirect3DDevice.SetIndices(aLong11572, ((Class417) interface44).aLong4524);
	}

	Interface38 method14965(Class157 class157, int i, int i_23_, boolean bool, byte[] is, int i_24_, int i_25_) {
		return new Class416_Sub1(this, class157, i, i_23_, bool, is, i_24_, i_25_);
	}

	Interface35 method15202(Class157 class157, int i, int i_26_, int i_27_, boolean bool, byte[] is) {
		return new Class416_Sub2(this, class157, i, i_26_, i_27_, bool, is);
	}

	Interface38 method15163(Class157 class157, int i, int i_28_, boolean bool, float[] fs, int i_29_, int i_30_) {
		return new Class416_Sub1(this, class157, i, i_28_, bool, fs, i_29_, i_30_);
	}

	Interface39 method14968(int i, boolean bool, int[][] is) {
		return new Class416_Sub3(this, i, bool, is);
	}

	Interface35 method15179(Class157 class157, int i, int i_31_, int i_32_, boolean bool, byte[] is) {
		return new Class416_Sub2(this, class157, i, i_31_, i_32_, bool, is);
	}

	final void method18086(Class416 class416) {
		IDirect3DDevice.SetTexture(aLong11572, anInt9525, class416.method6642());
		if (aBool9597 && !aBoolArray11589[anInt9525]) {
			aBoolArray11589[anInt9525] = true;
			method15039();
			method14986();
		}
	}

	final void method18087(Class416_Sub1 class416_sub1) {
		method18086(class416_sub1);
		if (aBoolArray11581[anInt9525] != class416_sub1.aBool10175) {
			IDirect3DDevice.SetSamplerState(aLong11572, anInt9525, 1, class416_sub1.aBool10175 ? 1 : 3);
			aBoolArray11581[anInt9525] = class416_sub1.aBool10175;
		}
		if (aBoolArray11596[anInt9525] != class416_sub1.aBool10176) {
			IDirect3DDevice.SetSamplerState(aLong11572, anInt9525, 2, class416_sub1.aBool10176 ? 1 : 3);
			aBoolArray11596[anInt9525] = class416_sub1.aBool10176;
		}
	}

	public boolean method14888() {
		return (aD3DCAPS11590.VertexShaderVersion & 0xffff) >= 257;
	}

	public final void method15008(Class364 class364, int i, int i_33_) {
		if (aClass265_Sub2_11588 != null)
			aClass265_Sub2_11588.method15666();
		IDirect3DDevice.DrawPrimitive(aLong11572, method18093(class364), i, i_33_);
	}

	void method14984() {
		if (aLong11592 == 0L && aClass377Array9528[anInt9525] != Class377.aClass377_3923) {
			if (aClass377Array9528[anInt9525] == Class377.aClass377_3921)
				IDirect3DDevice.SetTransform(aLong11572, 16 + anInt9525, aClass427Array9527[anInt9525].method6769(aFloatArray11601));
			else
				IDirect3DDevice.SetTransform(aLong11572, 16 + anInt9525, aClass427Array9527[anInt9525].method6763(aFloatArray11601));
			int i = method18090(aClass377Array9528[anInt9525]);
			if (i != anIntArray11586[anInt9525]) {
				IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, 24, i);
				anIntArray11586[anInt9525] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, 24, 0);
			anIntArray11586[anInt9525] = 0;
		}
	}

	void method14985() {
		/* empty */
	}

	public void method14916(Class427 class427, Class427 class427_34_, Class427 class427_35_) {
		IDirect3DDevice.SetTransform(aLong11572, 256, class427.aFloatArray4807);
		IDirect3DDevice.SetTransform(aLong11572, 2, class427_34_.aFloatArray4807);
		IDirect3DDevice.SetTransform(aLong11572, 3, class427_35_.aFloatArray4807);
	}

	void method15039() {
		if (aBool9597) {
			int i = (aBoolArray11589[anInt9525] ? method18088(aClass374Array9472[anInt9525]) : 1);
			IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, 4, i);
		}
	}

	final void method15281(Interface44 interface44, Class364 class364, int i, int i_36_, int i_37_, int i_38_) {
		if (aClass265_Sub2_11588 != null)
			aClass265_Sub2_11588.method15666();
		IDirect3DDevice.DrawIndexedPrimitiveIB(aLong11572, (((Class417) interface44).aLong4524), 4, 0, i, i_36_, i_37_, i_38_);
	}

	final void method15289(int i, Class368 class368, boolean bool) {
		if (aBool9597) {
			int i_39_ = 0;
			int i_40_;
			switch (i) {
			case 1:
				i_40_ = 6;
				break;
			case 2:
				i_40_ = 27;
				break;
			default:
				i_40_ = 5;
			}
			if (bool)
				i_39_ |= 0x10;
			IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, i_40_, (method18089(class368) | i_39_));
		}
	}

	final void method15304() {
		if (aBool9597)
			IDirect3DDevice.SetRenderState(aLong11572, 60, anInt9531);
	}

	static final int method18088(Class374 class374) {
		switch (class374.anInt3914) {
		case 1:
			return 7;
		case 2:
			return 10;
		case 0:
			return 4;
		default:
			throw new IllegalArgumentException();
		case 3:
			return 26;
		case 4:
			return 2;
		}
	}

	static final int method18089(Class368 class368) {
		switch (class368.anInt3891) {
		default:
			throw new IllegalArgumentException();
		case 1:
			return 0;
		case 0:
			return 2;
		case 3:
			return 1;
		case 2:
			return 3;
		}
	}

	static final int method18090(Class377 class377) {
		switch (class377.anInt3925) {
		case 4:
			return 3;
		case 3:
			return 256;
		case 5:
			return 4;
		case 0:
			return 1;
		case 1:
			return 2;
		default:
			return 0;
		}
	}

	long method18091(int i, int i_41_, int[] is, int[] is_42_) {
		if (aLongArray11602[anInt11610] != 0L) {
			IUnknown.Release(aLongArray11602[anInt11610]);
			aLongArray11602[anInt11610] = 0L;
		}
		aByteBuffer9438.clear();
		IDirect3DSurface.Download(aLongArray11598[anInt11610], 0, 0, i, i_41_, i * 4, 0, aLong9439);
		if (++anInt11610 >= 3)
			anInt11610 = 0;
		if (is != null) {
			aByteBuffer9438.asIntBuffer().get(is);
			return 0L;
		}
		return aLong9439;
	}

	void method15208() {
		IDirect3DDevice.method15866(aLong11572, 15, aBool9570);
		IDirect3DDevice.SetRenderState(aLong11572, 24, aByte9571 & 0xff);
		if (aD3DPRESENT_PARAMETERS11573.MultiSampleType > 0) {
			if (!aBool9570 || aByte9571 == 0) {
				if (aBool11597 || aBool11595)
					IDirect3DDevice.SetRenderState(aLong11572, 181, 0);
				else if (aBool11607)
					IDirect3DDevice.method15865(aLong11572, 154, 1.0F);
			} else if (aBool11597)
				IDirect3DDevice.SetRenderState(aLong11572, 181, method15014('S', 'S', 'A', 'A'));
			else if (aBool11595)
				IDirect3DDevice.SetRenderState(aLong11572, 181, method15014('A', 'T', 'O', 'C'));
			else if (aBool11607)
				IDirect3DDevice.SetRenderState(aLong11572, 154, method15014('A', '2', 'M', '1'));
		}
	}

	void method14992() {
		switch (aClass357_9568.anInt3827) {
		case 0:
			IDirect3DDevice.SetRenderState(aLong11572, 19, 5);
			IDirect3DDevice.SetRenderState(aLong11572, 20, 6);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(aLong11572, 19, 2);
			IDirect3DDevice.SetRenderState(aLong11572, 20, 1);
			break;
		case 3:
			IDirect3DDevice.SetRenderState(aLong11572, 19, 2);
			IDirect3DDevice.SetRenderState(aLong11572, 20, 2);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(aLong11572, 19, 9);
			IDirect3DDevice.SetRenderState(aLong11572, 20, 2);
			break;
		}
		switch (anInt9593) {
		case 3:
			IDirect3DDevice.SetRenderState(aLong11572, 207, 1);
			IDirect3DDevice.SetRenderState(aLong11572, 208, 2);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(aLong11572, 207, 2);
			IDirect3DDevice.SetRenderState(aLong11572, 208, 1);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(aLong11572, 207, 2);
			IDirect3DDevice.SetRenderState(aLong11572, 208, 2);
			break;
		case 0:
			IDirect3DDevice.SetRenderState(aLong11572, 207, 1);
			IDirect3DDevice.SetRenderState(aLong11572, 208, 1);
			break;
		}
	}

	void method15155() {
		IDirect3DDevice.method15866(aLong11572, 27, aBool9569);
	}

	public long method3117(int i, int i_43_) {
		return method18108(i, i_43_, null, null);
	}

	void method14900() {
		for (int i = 0; i < anInt9521; i++) {
			IDirect3DDevice.SetSamplerState(aLong11572, i, 7, 2);
			IDirect3DDevice.SetSamplerState(aLong11572, i, 6, 2);
			IDirect3DDevice.SetSamplerState(aLong11572, i, 5, 2);
			IDirect3DDevice.SetSamplerState(aLong11572, i, 1, 1);
			IDirect3DDevice.SetSamplerState(aLong11572, i, 2, 1);
			aClass343Array11585[i] = Class343.aClass343_3692;
			boolean[] bools = aBoolArray11581;
			int i_44_ = i;
			aBoolArray11596[i] = true;
			bools[i_44_] = true;
			aBoolArray11584[i] = false;
			anIntArray11586[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState(aLong11572, 0, 6, 1);
		IDirect3DDevice.SetRenderState(aLong11572, 9, 2);
		IDirect3DDevice.SetRenderState(aLong11572, 23, 4);
		IDirect3DDevice.SetRenderState(aLong11572, 25, 5);
		IDirect3DDevice.SetRenderState(aLong11572, 24, 0);
		IDirect3DDevice.method15866(aLong11572, 206, aBool9588);
		IDirect3DDevice.SetRenderState(aLong11572, 181, 0);
		method18095();
		IDirect3DDevice.SetRenderState(aLong11572, 147, 1);
		IDirect3DDevice.SetRenderState(aLong11572, 145, 1);
		IDirect3DDevice.method15865(aLong11572, 38, 0.95F);
		IDirect3DDevice.SetRenderState(aLong11572, 35, 3);
		IDirect3DDevice.method15865(aLong11572, 154, 1.0F);
		D3DLIGHT.SetType(aLong11577, 3);
		D3DLIGHT.SetType(aLong11583, 3);
		D3DLIGHT.SetType(aLong11579, 1);
		aBool11580 = false;
		super.method14900();
	}

	void method15285(int i) {
		if (!aBool11600) {
			int i_45_ = (i & 0x2) != 0 ? 2 : 3;
			IDirect3DDevice.SetRenderState(aLong11572, 8, i_45_);
		}
	}

	void method14997(boolean bool) {
		IDirect3DDevice.method15866(aLong11572, 161, bool);
	}

	final Interface44 method15025(boolean bool) {
		return new Class417(this, Class184.aClass184_2110, bool);
	}

	final Interface37 method15035(boolean bool) {
		return new Class419(this, bool);
	}

	Class355 method14999(Class372[] class372s) {
		return new Class355_Sub1(this, class372s);
	}

	public void method3114() {
		/* empty */
	}

	public void method14988(int i, Interface37 interface37) {
		Class419 class419 = (Class419) interface37;
		IDirect3DDevice.SetStreamSource(aLong11572, i, class419.aLong4577, 0, class419.method6667());
	}

	final void method14976(int i, Class368 class368, boolean bool, boolean bool_46_) {
		if (aBool9597) {
			int i_47_ = 0;
			int i_48_;
			switch (i) {
			default:
				i_48_ = 2;
				break;
			case 2:
				i_48_ = 26;
				break;
			case 1:
				i_48_ = 3;
			}
			if (bool)
				i_47_ |= 0x20;
			if (bool_46_)
				i_47_ |= 0x10;
			IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, i_48_, (method18089(class368) | i_47_));
		}
	}

	public Interface21 method3431(int i, int i_49_, Class157 class157, Class184 class184, int i_50_) {
		return new Class404(this, class157, class184, i, i_49_, i_50_);
	}

	final void method15009(Interface44 interface44, Class364 class364, int i, int i_51_, int i_52_, int i_53_) {
		if (aClass265_Sub2_11588 != null)
			aClass265_Sub2_11588.method15666();
		IDirect3DDevice.DrawIndexedPrimitiveIB(aLong11572, (((Class417) interface44).aLong4524), 4, 0, i, i_51_, i_52_, i_53_);
	}

	void method15247() {
		if (aBool9597)
			IDirect3DDevice.method15866(aLong11572, 137, aBool9515 && !aBool9506);
	}

	void method14983(boolean bool) {
		IDirect3DDevice.method15866(aLong11572, 161, bool);
	}

	public Class261 method14894(String string) {
		byte[] is = method18103(string);
		if (is == null)
			return null;
		Class272 class272 = method14896(is);
		return new Class261_Sub2(this, class272);
	}

	public void method3120() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray11602[i] != 0L) {
				IUnknown.Release(aLongArray11602[i]);
				aLongArray11602[i] = 0L;
			}
		}
		anInt11611 = 0;
		anInt11610 = 0;
	}

	void method15206(int i) {
		if (!aBool11600) {
			int i_54_ = (i & 0x2) != 0 ? 2 : 3;
			IDirect3DDevice.SetRenderState(aLong11572, 8, i_54_);
		}
	}

	static final int method18092(Class184 class184) {
		if (class184 == Class184.aClass184_2110)
			return 80;
		if (class184 == Class184.aClass184_2106)
			return 77;
		throw new IllegalArgumentException("");
	}

	static final int method18093(Class364 class364) {
		switch (class364.anInt3859) {
		case 1:
			return 5;
		case 0:
			return 4;
		case 4:
			return 3;
		case 5:
			return 6;
		case 3:
			return 2;
		case 2:
			return 1;
		default:
			throw new IllegalArgumentException("");
		}
	}

	public void method3339(boolean bool) {
		/* empty */
	}

	static boolean method18094(int i, int i_55_, long l, int i_56_, D3DDISPLAYMODE d3ddisplaymode, D3DPRESENT_PARAMETERS d3dpresent_parameters) {
		int i_57_ = 0;
		int i_58_ = 0;
		int i_59_ = 0;
		boolean bool;
		try {
			if (Class276.method5144(IDirect3D.GetAdapterDisplayMode(l, i, d3ddisplaymode)))
				return false;
			while_44_: for (/**/; i_56_ >= 0; i_56_--) {
				if (i_56_ != 1) {
					i_59_ = 0 + i_56_;
					for (int i_60_ = 0; i_60_ < anIntArray11582.length; i_60_++) {
						if (IDirect3D.CheckDeviceType(l, i, i_55_, d3ddisplaymode.Format, anIntArray11582[i_60_], true) == 0 && IDirect3D.CheckDeviceFormat(l, i, i_55_, (d3ddisplaymode.Format), 1, 1, (anIntArray11582[i_60_])) == 0 && (i_56_ == 0 || (IDirect3D.CheckDeviceMultiSampleType(l, i, i_55_, anIntArray11582[i_60_], true, i_59_)) == 0)) {
							for (int i_61_ = 0; i_61_ < anIntArray11612.length; i_61_++) {
								if ((IDirect3D.CheckDeviceFormat(l, i, i_55_, d3ddisplaymode.Format, 2, 1, anIntArray11612[i_61_])) == 0 && (IDirect3D.CheckDepthStencilMatch(l, i, i_55_, d3ddisplaymode.Format, anIntArray11582[i_60_], anIntArray11612[i_61_])) == 0 && (i_56_ == 0 || (IDirect3D.CheckDeviceMultiSampleType(l, i, i_55_, anIntArray11612[i_60_], true, i_59_)) == 0)) {
									i_58_ = anIntArray11582[i_60_];
									i_57_ = anIntArray11612[i_61_];
									break while_44_;
								}
							}
						}
					}
				}
			}
			if (i_56_ < 0 || i_58_ == 0 || i_57_ == 0)
				return false;
			d3dpresent_parameters.BackBufferFormat = i_58_;
			d3dpresent_parameters.AutoDepthStencilFormat = i_57_;
			d3dpresent_parameters.MultiSampleType = i_59_;
			d3dpresent_parameters.MultiSampleQuality = 0;
			bool = true;
		} catch (Throwable throwable) {
			return false;
		}
		return bool;
	}

	void method18095() {
		IDirect3DDevice.SetRenderState(aLong11572, 22, anInt9572);
	}

	void method15013(int i) {
		if (!aBool11600) {
			int i_62_ = (i & 0x2) != 0 ? 2 : 3;
			IDirect3DDevice.SetRenderState(aLong11572, 8, i_62_);
		}
	}

	static final int method18096(Class157 class157, Class184 class184) {
		switch (class184.anInt2103 * -1159397783) {
		case 8:
			if (class157 == Class157.aClass157_1723)
				return 116;
			break;
		default:
			break;
		case 0:
			if (class157 == Class157.aClass157_1723)
				return 113;
			break;
		case 3:
			switch (class157.anInt1730 * -524990245) {
			case 1:
				return 21;
			case 8:
				return 50;
			case 7:
				return 77;
			case 3:
				return Class280.anInt3186 * 710563563;
			case 2:
				return Class280.anInt3187 * 1577221699;
			default:
				break;
			case 6:
				return 22;
			case 5:
				return 28;
			case 4:
				return 51;
			}
		}
		throw new IllegalArgumentException("");
	}

	static {
		anIntArray11582 = new int[] { 22, 23 };
	}

	public Class143 method3217() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(aLong11571, anInt11608, 0, d3dadapter_identifier);
		return new Class143(d3dadapter_identifier.VendorID, method14891() ? "Direct3D FF" : "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion, method14891());
	}

	static final int method18097(Class157 class157, Class184 class184) {
		switch (class184.anInt2103 * -1159397783) {
		case 8:
			if (class157 == Class157.aClass157_1723)
				return 116;
			break;
		default:
			break;
		case 0:
			if (class157 == Class157.aClass157_1723)
				return 113;
			break;
		case 3:
			switch (class157.anInt1730 * -524990245) {
			case 1:
				return 21;
			case 8:
				return 50;
			case 7:
				return 77;
			case 3:
				return Class280.anInt3186 * 710563563;
			case 2:
				return Class280.anInt3187 * 1577221699;
			default:
				break;
			case 6:
				return 22;
			case 5:
				return 28;
			case 4:
				return 51;
			}
		}
		throw new IllegalArgumentException("");
	}

	public Class143 method3370() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(aLong11571, anInt11608, 0, d3dadapter_identifier);
		return new Class143(d3dadapter_identifier.VendorID, method14891() ? "Direct3D FF" : "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion, method14891());
	}

	public final void method15010(Class364 class364, int i, int i_63_, int i_64_, int i_65_) {
		if (aClass265_Sub2_11588 != null)
			aClass265_Sub2_11588.method15666();
		IDirect3DDevice.DrawIndexedPrimitive(aLong11572, method18093(class364), 0, i, i_63_, i_64_, i_65_);
	}

	Interface38 method15196(int i, int i_66_, boolean bool, int[] is, int i_67_, int i_68_) {
		return new Class416_Sub1(this, i, i_66_, bool, is, i_67_, i_68_);
	}

	long method18098(int i, int i_69_, int[] is, int[] is_70_) {
		if (aLongArray11602[anInt11610] != 0L) {
			IUnknown.Release(aLongArray11602[anInt11610]);
			aLongArray11602[anInt11610] = 0L;
		}
		aByteBuffer9438.clear();
		IDirect3DSurface.Download(aLongArray11598[anInt11610], 0, 0, i, i_69_, i * 4, 0, aLong9439);
		if (++anInt11610 >= 3)
			anInt11610 = 0;
		if (is != null) {
			aByteBuffer9438.asIntBuffer().get(is);
			return 0L;
		}
		return aLong9439;
	}

	void method3223(int i, int i_71_) throws Exception_Sub1 {
		if (aBool11587) {
			if (!method18102(aClass171_Sub1_2073.method2728(), aClass171_Sub1_2073.method2729()))
				return;
			((Class171_Sub1_Sub1_Sub1) aClass171_Sub1_2073).method347();
		} else
			IDirect3DDevice.EndScene(aLong11572);
		int i_72_ = aClass171_Sub1_2073.method14726();
		if (Class276.method5144(i_72_)) {
			aBool11587 = true;
			aClass171_Sub1_2073.method129();
		} else {
			IDirect3DDevice.BeginScene(aLong11572);
			if (anInterface24_2085 != null)
				anInterface24_2085.method19((byte) -101);
		}
	}

	void method3224(int i, int i_73_) throws Exception_Sub1 {
		if (aBool11587) {
			if (!method18102(aClass171_Sub1_2073.method2728(), aClass171_Sub1_2073.method2729()))
				return;
			((Class171_Sub1_Sub1_Sub1) aClass171_Sub1_2073).method347();
		} else
			IDirect3DDevice.EndScene(aLong11572);
		int i_74_ = aClass171_Sub1_2073.method14726();
		if (Class276.method5144(i_74_)) {
			aBool11587 = true;
			aClass171_Sub1_2073.method129();
		} else {
			IDirect3DDevice.BeginScene(aLong11572);
			if (anInterface24_2085 != null)
				anInterface24_2085.method19((byte) -7);
		}
	}

	public boolean method15067() {
		return (aD3DCAPS11590.VertexShaderVersion & 0xffff) >= 257;
	}

	public void method3229() {
		long l = IDirect3DDevice.CreateEventQuery(aLong11572);
		if (Class276.method5145(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	public void method3227() {
		long l = IDirect3DDevice.CreateEventQuery(aLong11572);
		if (Class276.method5145(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	void method3228() {
		super.method3082();
		if (aLong11577 != 0L) {
			D3DLIGHT.Destroy(aLong11577);
			aLong11577 = 0L;
		}
		if (aLong11583 != 0L) {
			D3DLIGHT.Destroy(aLong11583);
			aLong11583 = 0L;
		}
		if (aLong11579 != 0L) {
			D3DLIGHT.Destroy(aLong11579);
			aLong11579 = 0L;
		}
		if (aLong11572 != 0L) {
			IDirect3DDevice.Destroy(aLong11572);
			aLong11572 = 0L;
		}
		if (aLong11571 != 0L) {
			IUnknown.Release(aLong11571);
			aLong11571 = 0L;
		}
	}

	void method3092() {
		super.method3082();
		if (aLong11577 != 0L) {
			D3DLIGHT.Destroy(aLong11577);
			aLong11577 = 0L;
		}
		if (aLong11583 != 0L) {
			D3DLIGHT.Destroy(aLong11583);
			aLong11583 = 0L;
		}
		if (aLong11579 != 0L) {
			D3DLIGHT.Destroy(aLong11579);
			aLong11579 = 0L;
		}
		if (aLong11572 != 0L) {
			IDirect3DDevice.Destroy(aLong11572);
			aLong11572 = 0L;
		}
		if (aLong11571 != 0L) {
			IUnknown.Release(aLong11571);
			aLong11571 = 0L;
		}
	}

	void method3230() {
		super.method3082();
		if (aLong11577 != 0L) {
			D3DLIGHT.Destroy(aLong11577);
			aLong11577 = 0L;
		}
		if (aLong11583 != 0L) {
			D3DLIGHT.Destroy(aLong11583);
			aLong11583 = 0L;
		}
		if (aLong11579 != 0L) {
			D3DLIGHT.Destroy(aLong11579);
			aLong11579 = 0L;
		}
		if (aLong11572 != 0L) {
			IDirect3DDevice.Destroy(aLong11572);
			aLong11572 = 0L;
		}
		if (aLong11571 != 0L) {
			IUnknown.Release(aLong11571);
			aLong11571 = 0L;
		}
	}

	void method3310() {
		super.method3082();
		if (aLong11577 != 0L) {
			D3DLIGHT.Destroy(aLong11577);
			aLong11577 = 0L;
		}
		if (aLong11583 != 0L) {
			D3DLIGHT.Destroy(aLong11583);
			aLong11583 = 0L;
		}
		if (aLong11579 != 0L) {
			D3DLIGHT.Destroy(aLong11579);
			aLong11579 = 0L;
		}
		if (aLong11572 != 0L) {
			IDirect3DDevice.Destroy(aLong11572);
			aLong11572 = 0L;
		}
		if (aLong11571 != 0L) {
			IUnknown.Release(aLong11571);
			aLong11571 = 0L;
		}
	}

	void method3423() {
		super.method3082();
		if (aLong11577 != 0L) {
			D3DLIGHT.Destroy(aLong11577);
			aLong11577 = 0L;
		}
		if (aLong11583 != 0L) {
			D3DLIGHT.Destroy(aLong11583);
			aLong11583 = 0L;
		}
		if (aLong11579 != 0L) {
			D3DLIGHT.Destroy(aLong11579);
			aLong11579 = 0L;
		}
		if (aLong11572 != 0L) {
			IDirect3DDevice.Destroy(aLong11572);
			aLong11572 = 0L;
		}
		if (aLong11571 != 0L) {
			IUnknown.Release(aLong11571);
			aLong11571 = 0L;
		}
	}

	public void method15149(Class355 class355) {
		Class355_Sub1 class355_sub1 = (Class355_Sub1) class355;
		IDirect3DDevice.SetVertexDeclaration(aLong11572, class355_sub1.aLong10120);
	}

	public void method3258(boolean bool) {
		/* empty */
	}

	public boolean method15073(boolean bool) {
		if (bool)
			return aBool11578;
		return aBool11578 && aBool11569;
	}

	public String method3254() {
		String string = "Caps: 4:";
		String string_75_ = ":";
		string = new StringBuilder().append(string).append(anInt9573).append(string_75_).toString();
		string = new StringBuilder().append(string).append(anInt9521).append(string_75_).toString();
		string = new StringBuilder().append(string).append(anInt9580).append(string_75_).toString();
		string = new StringBuilder().append(string).append(aBool9518 ? 1 : 0).append(string_75_).toString();
		string = new StringBuilder().append(string).append(method14888() ? 1 : 0).append(string_75_).toString();
		string = new StringBuilder().append(string).append(method14889() ? 1 : 0).append(string_75_).toString();
		string = new StringBuilder().append(string).append(aBool9587 ? 1 : 0).append(string_75_).toString();
		string = new StringBuilder().append(string).append(aBool9585 ? 1 : 0).append(string_75_).toString();
		string = new StringBuilder().append(string).append(aBool11599 ? 1 : 0).append(string_75_).toString();
		string = new StringBuilder().append(string).append(aBool11576 ? 1 : 0).append(string_75_).toString();
		string = new StringBuilder().append(string).append(aBool11593 ? 1 : 0).append(string_75_).toString();
		string = new StringBuilder().append(string).append(aBool11606 ? 1 : 0).append(string_75_).toString();
		string = new StringBuilder().append(string).append(aBool9581 ? 1 : 0).append(string_75_).toString();
		string = new StringBuilder().append(string).append(aBool9494 ? 1 : 0).append(string_75_).toString();
		string = new StringBuilder().append(string).append(aBool9567 ? 1 : 0).append(string_75_).toString();
		string = new StringBuilder().append(string).append(aBool11595 ? 1 : 0).append(string_75_).toString();
		string = new StringBuilder().append(string).append(aBool11607 ? 1 : 0).append(string_75_).toString();
		string = new StringBuilder().append(string).append(aBool11597 ? 1 : 0).append(string_75_).toString();
		string = new StringBuilder().append(string).append(aBool9588 ? 1 : 0).append(string_75_).toString();
		string = new StringBuilder().append(string).append(aBool11578 ? 1 : 0).append(string_75_).toString();
		string = new StringBuilder().append(string).append(aBool11569 ? 1 : 0).toString();
		return string;
	}

	public String method3101() {
		String string = "Caps: 4:";
		String string_76_ = ":";
		string = new StringBuilder().append(string).append(anInt9573).append(string_76_).toString();
		string = new StringBuilder().append(string).append(anInt9521).append(string_76_).toString();
		string = new StringBuilder().append(string).append(anInt9580).append(string_76_).toString();
		string = new StringBuilder().append(string).append(aBool9518 ? 1 : 0).append(string_76_).toString();
		string = new StringBuilder().append(string).append(method14888() ? 1 : 0).append(string_76_).toString();
		string = new StringBuilder().append(string).append(method14889() ? 1 : 0).append(string_76_).toString();
		string = new StringBuilder().append(string).append(aBool9587 ? 1 : 0).append(string_76_).toString();
		string = new StringBuilder().append(string).append(aBool9585 ? 1 : 0).append(string_76_).toString();
		string = new StringBuilder().append(string).append(aBool11599 ? 1 : 0).append(string_76_).toString();
		string = new StringBuilder().append(string).append(aBool11576 ? 1 : 0).append(string_76_).toString();
		string = new StringBuilder().append(string).append(aBool11593 ? 1 : 0).append(string_76_).toString();
		string = new StringBuilder().append(string).append(aBool11606 ? 1 : 0).append(string_76_).toString();
		string = new StringBuilder().append(string).append(aBool9581 ? 1 : 0).append(string_76_).toString();
		string = new StringBuilder().append(string).append(aBool9494 ? 1 : 0).append(string_76_).toString();
		string = new StringBuilder().append(string).append(aBool9567 ? 1 : 0).append(string_76_).toString();
		string = new StringBuilder().append(string).append(aBool11595 ? 1 : 0).append(string_76_).toString();
		string = new StringBuilder().append(string).append(aBool11607 ? 1 : 0).append(string_76_).toString();
		string = new StringBuilder().append(string).append(aBool11597 ? 1 : 0).append(string_76_).toString();
		string = new StringBuilder().append(string).append(aBool9588 ? 1 : 0).append(string_76_).toString();
		string = new StringBuilder().append(string).append(aBool11578 ? 1 : 0).append(string_76_).toString();
		string = new StringBuilder().append(string).append(aBool11569 ? 1 : 0).toString();
		return string;
	}

	public void method3257(boolean bool) {
		/* empty */
	}

	Interface35 method15203(Class157 class157, int i, int i_77_, int i_78_, boolean bool, byte[] is) {
		return new Class416_Sub2(this, class157, i, i_77_, i_78_, bool, is);
	}

	Class171_Sub1 method3491(Canvas canvas, int i, int i_79_) {
		return new Class171_Sub1_Sub1_Sub1(this, canvas, i, i_79_, false);
	}

	public int[] method3259(int i, int i_80_, int i_81_, int i_82_) {
		method3165();
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(aLong11572, 0);
		long l_83_ = IDirect3DDevice.CreateRenderTarget(aLong11572, i_81_, i_82_, 21, 0, 0, true);
		int i_84_ = IDirect3DDevice.StretchRect(aLong11572, l, i, i_80_, i_81_, i_82_, l_83_, 0, 0, i_81_, i_82_, 1);
		method15097(i_81_ * i_82_ * 4);
		if (Class276.method5145(i_84_)) {
			is = new int[i_81_ * i_82_];
			IDirect3DSurface.Download(l_83_, 0, 0, i_81_, i_82_, i_81_ * 4, 16, aLong9439);
			aByteBuffer9438.clear();
			aByteBuffer9438.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_83_);
		return is;
	}

	public int[] method3260(int i, int i_85_, int i_86_, int i_87_) {
		method3165();
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(aLong11572, 0);
		long l_88_ = IDirect3DDevice.CreateRenderTarget(aLong11572, i_86_, i_87_, 21, 0, 0, true);
		int i_89_ = IDirect3DDevice.StretchRect(aLong11572, l, i, i_85_, i_86_, i_87_, l_88_, 0, 0, i_86_, i_87_, 1);
		method15097(i_86_ * i_87_ * 4);
		if (Class276.method5145(i_89_)) {
			is = new int[i_86_ * i_87_];
			IDirect3DSurface.Download(l_88_, 0, 0, i_86_, i_87_, i_86_ * 4, 16, aLong9439);
			aByteBuffer9438.clear();
			aByteBuffer9438.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_88_);
		return is;
	}

	public boolean method3184() {
		if (aBool11587)
			return false;
		if (aLongArray11602[anInt11611] != 0L)
			return false;
		return true;
	}

	final void method18099(Class416 class416) {
		IDirect3DDevice.SetTexture(aLong11572, anInt9525, class416.method6642());
		if (aBool9597 && !aBoolArray11589[anInt9525]) {
			aBoolArray11589[anInt9525] = true;
			method15039();
			method14986();
		}
	}

	public boolean method3265() {
		return true;
	}

	public boolean method3335() {
		if (aBool11587)
			return false;
		if (aLongArray11602[anInt11611] != 0L)
			return false;
		return true;
	}

	public boolean method3247() {
		if (aBool11587)
			return false;
		if (aLongArray11602[anInt11611] != 0L)
			return false;
		return true;
	}

	public final synchronized void method3233(int i) {
		for (int i_90_ = 0; i_90_ < anInt11603; i_90_++)
			IUnknown.Release(aLongArray11604[i_90_]);
		anInt11603 = 0;
		super.method3209(i);
	}

	public void method3225() {
		long l = IDirect3DDevice.CreateEventQuery(aLong11572);
		if (Class276.method5145(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	public boolean method3316() {
		return true;
	}

	byte[] method18100(String string) {
		return method14895("dx", string);
	}

	public void method3272(int i, int i_91_, int i_92_) {
		if (aLong11594 == 0L)
			method18081(i_91_, i_92_);
		long l = IDirect3DDevice.GetRenderTarget(aLong11572, 0);
		if (!Class276.method5144(IDirect3DDevice.StretchRect(aLong11572, l, 0, 0, aClass171_2080.method2728(), aClass171_2080.method2729(), aLong11594, anInt2083 * -1964562579, anInt2068 * 960890533, anInt2088 * -731510031, anInt2089 * 351158293, 2))) {
			/* empty */
		}
		IUnknown.Release(l);
		IDirect3DDevice.GetRenderTargetData(aLong11572, aLong11594, aLongArray11598[anInt11611]);
		long l_93_ = IDirect3DDevice.CreateEventQuery(aLong11572);
		if (Class276.method5145(IDirect3DEventQuery.Issue(l_93_)))
			aLongArray11602[anInt11611] = l_93_;
		anIntArray11609[anInt11611] = i;
		if (++anInt11611 >= 3)
			anInt11611 = 0;
	}

	public void method3273() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray11602[i] != 0L) {
				IUnknown.Release(aLongArray11602[i]);
				aLongArray11602[i] = 0L;
			}
		}
		anInt11611 = 0;
		anInt11610 = 0;
	}

	public long method3274(int i, int i_94_) {
		return method18108(i, i_94_, null, null);
	}

	public long method3275(int i, int i_95_) {
		return method18108(i, i_95_, null, null);
	}

	public void method15139(Class427 class427) {
		class427.method6751(aClass427_11613);
	}

	public void method3246(long l) {
		/* empty */
	}

	void method14995() {
		aFloat9565 = aFloat9485 - (float) anInt9589;
		aFloat9517 = aFloat9565 - (float) anInt9562;
		if (aFloat9517 < aFloat9484)
			aFloat9517 = aFloat9484;
		if (aBool9597) {
			IDirect3DDevice.method15865(aLong11572, 36, aFloat9517);
			IDirect3DDevice.method15865(aLong11572, 37, aFloat9565);
			IDirect3DDevice.SetRenderState(aLong11572, 34, anInt9561);
		}
	}

	public void method3429(int i, int i_96_) {
		IDirect3DDevice.Clear(aLong11572, i, i_96_, 1.0F, 0);
	}

	public Interface21 method3419(int i, int i_97_, Class157 class157, Class184 class184, int i_98_) {
		return new Class404(this, class157, class184, i, i_97_, i_98_);
	}

	public Class179 method3391(Class179 class179, Class179 class179_99_, float f, Class179 class179_100_) {
		return f < 0.5F ? class179 : class179_99_;
	}

	public Class171_Sub2 method3464() {
		return new Class171_Sub2_Sub1_Sub1(this);
	}

	public Interface21 method3430(int i, int i_101_, Class157 class157, Class184 class184, int i_102_) {
		return new Class404(this, class157, class184, i, i_101_, i_102_);
	}

	void method14996() {
		if (aBool9597)
			IDirect3DDevice.method15866(aLong11572, 28, (aBool9560 && aBool9473 && anInt9562 >= 0));
	}

	public Interface21 method3432(int i, int i_103_, Class157 class157, Class184 class184, int i_104_) {
		return new Class404(this, class157, class184, i, i_103_, i_104_);
	}

	public Interface23 method3522(int i, int i_105_) {
		return new Class415(this, Class184.aClass184_2106, i, i_105_, 0);
	}

	public void method15268(Class355 class355) {
		Class355_Sub1 class355_sub1 = (Class355_Sub1) class355;
		IDirect3DDevice.SetVertexDeclaration(aLong11572, class355_sub1.aLong10120);
	}

	public Interface23 method3435(int i, int i_106_, int i_107_) {
		return new Class415(this, Class184.aClass184_2106, i, i_106_, i_107_);
	}

	void method3328() {
		super.finalize();
	}

	void method3437() {
		super.finalize();
	}

	void method3357() {
		super.finalize();
	}

	public void method3261() {
		/* empty */
	}

	void method3368() {
		super.finalize();
	}

	public boolean method3441() {
		return false;
	}

	public boolean method3442() {
		return false;
	}

	public void method3219() {
		if (aLong11594 != 0L) {
			IUnknown.Release(aLong11594);
			aLong11594 = 0L;
		}
		for (int i = 0; i < 3; i++) {
			if (aLongArray11602[i] != 0L) {
				IUnknown.Release(aLongArray11602[i]);
				aLongArray11602[i] = 0L;
			}
			if (aLongArray11598[i] != 0L) {
				IUnknown.Release(aLongArray11598[i]);
				aLongArray11598[i] = 0L;
			}
		}
		anInt11611 = 0;
		anInt11610 = 0;
	}

	public void method3444() {
		if (aLong11594 != 0L) {
			IUnknown.Release(aLong11594);
			aLong11594 = 0L;
		}
		for (int i = 0; i < 3; i++) {
			if (aLongArray11602[i] != 0L) {
				IUnknown.Release(aLongArray11602[i]);
				aLongArray11602[i] = 0L;
			}
			if (aLongArray11598[i] != 0L) {
				IUnknown.Release(aLongArray11598[i]);
				aLongArray11598[i] = 0L;
			}
		}
		anInt11611 = 0;
		anInt11610 = 0;
	}

	Interface38 method15191(Class157 class157, int i, int i_108_, boolean bool, byte[] is, int i_109_, int i_110_) {
		return new Class416_Sub1(this, class157, i, i_108_, bool, is, i_109_, i_110_);
	}

	public boolean method15068() {
		return (aD3DCAPS11590.VertexShaderVersion & 0xffff) >= 257;
	}

	Interface38 method15198(int i, int i_111_, boolean bool, int[] is, int i_112_, int i_113_) {
		return new Class416_Sub1(this, i, i_111_, bool, is, i_112_, i_113_);
	}

	public boolean method15250() {
		return (aD3DCAPS11590.PixelShaderVersion & 0xffff) >= 257;
	}

	void method15264() {
		IDirect3DDevice.method15866(aLong11572, 174, aBool9604);
	}

	public boolean method15075() {
		return (aD3DCAPS11590.PixelShaderVersion & 0xffff) >= 257;
	}

	public boolean method15072() {
		return (aD3DCAPS11590.PixelShaderVersion & 0xffff) >= 257;
	}

	void method15001(Interface44 interface44) {
		IDirect3DDevice.SetIndices(aLong11572, ((Class417) interface44).aLong4524);
	}

	Interface38 method15194(Class157 class157, int i, int i_114_, boolean bool, float[] fs, int i_115_, int i_116_) {
		return new Class416_Sub1(this, class157, i, i_114_, bool, fs, i_115_, i_116_);
	}

	public boolean method15058(boolean bool) {
		if (bool)
			return aBool11578;
		return aBool11578 && aBool11569;
	}

	void method14902() {
		for (Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass694_11575.method14081((short) 18459); class527_sub26 != null; class527_sub26 = (Class527_Sub26) aClass694_11575.method14086(-65534)) {
			Interface52 interface52 = (Interface52) class527_sub26.anObject10522;
			interface52.method347();
			if (interface52 == aClass171_2080)
				interface52.method348();
		}
		super.method14902();
	}

	public Class261 method15085(String string) {
		byte[] is = method18103(string);
		if (is == null)
			return null;
		Class272 class272 = method14896(is);
		return new Class261_Sub2(this, class272);
	}

	public void method3136(int i, int i_117_) {
		IDirect3DDevice.Clear(aLong11572, i, i_117_, 1.0F, 0);
	}

	void method15252() {
		IDirect3DDevice.method15866(aLong11572, 15, aBool9570);
		IDirect3DDevice.SetRenderState(aLong11572, 24, aByte9571 & 0xff);
		if (aD3DPRESENT_PARAMETERS11573.MultiSampleType > 0) {
			if (!aBool9570 || aByte9571 == 0) {
				if (aBool11597 || aBool11595)
					IDirect3DDevice.SetRenderState(aLong11572, 181, 0);
				else if (aBool11607)
					IDirect3DDevice.method15865(aLong11572, 154, 1.0F);
			} else if (aBool11597)
				IDirect3DDevice.SetRenderState(aLong11572, 181, method15014('S', 'S', 'A', 'A'));
			else if (aBool11595)
				IDirect3DDevice.SetRenderState(aLong11572, 181, method15014('A', 'T', 'O', 'C'));
			else if (aBool11607)
				IDirect3DDevice.SetRenderState(aLong11572, 154, method15014('A', '2', 'M', '1'));
		}
	}

	public void method15301(Class427 class427, Class427 class427_118_, Class427 class427_119_) {
		IDirect3DDevice.SetTransform(aLong11572, 256, class427.aFloatArray4807);
		IDirect3DDevice.SetTransform(aLong11572, 2, class427_118_.aFloatArray4807);
		IDirect3DDevice.SetTransform(aLong11572, 3, class427_119_.aFloatArray4807);
	}

	void method18101(Interface52 interface52) {
		Class527_Sub26 class527_sub26 = method18078(interface52);
		if (class527_sub26 != null)
			class527_sub26.method8735(-1889161967);
	}

	void method15200() {
		method3126();
		for (Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass694_11575.method14081((short) 7055); class527_sub26 != null; class527_sub26 = (Class527_Sub26) aClass694_11575.method14086(-65534)) {
			Interface52 interface52 = (Interface52) class527_sub26.anObject10522;
			interface52.method129();
		}
		super.method15030();
	}

	void method15231() {
		method3126();
		for (Class527_Sub26 class527_sub26 = ((Class527_Sub26) aClass694_11575.method14081((short) -13972)); class527_sub26 != null; class527_sub26 = (Class527_Sub26) aClass694_11575.method14086(-65534)) {
			Interface52 interface52 = (Interface52) class527_sub26.anObject10522;
			interface52.method129();
		}
		super.method15030();
	}

	public float method15102() {
		return -0.5F;
	}

	void method15113() {
		if (aClass171_2080 != null)
			IDirect3DDevice.SetViewport(aLong11572, anInt9504 + anInt9586, anInt9499 + anInt9510, anInt9466, anInt9450, aFloat9480, aFloat9524);
	}

	void method15114() {
		if (aClass171_2080 != null)
			IDirect3DDevice.SetViewport(aLong11572, anInt9504 + anInt9586, anInt9499 + anInt9510, anInt9466, anInt9450, aFloat9480, aFloat9524);
	}

	void method15115() {
		if (aClass171_2080 != null)
			IDirect3DDevice.SetViewport(aLong11572, anInt9504 + anInt9586, anInt9499 + anInt9510, anInt9466, anInt9450, aFloat9480, aFloat9524);
	}

	boolean method18102(int i, int i_120_) {
		int i_121_ = IDirect3DDevice.TestCooperativeLevel(aLong11572);
		if (i_121_ == 0 || i_121_ == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(aLong11572, 0L);
			for (int i_122_ = 1; i_122_ < 4; i_122_++)
				IDirect3DDevice.SetRenderTarget(aLong11572, i_122_, 0L);
			for (int i_123_ = 0; i_123_ < 4; i_123_++)
				IDirect3DDevice.SetStreamSource(aLong11572, i_123_, 0L, 0, 0);
			for (int i_124_ = 0; i_124_ < 4; i_124_++)
				IDirect3DDevice.SetTexture(aLong11572, i_124_, 0L);
			IDirect3DDevice.SetIndices(aLong11572, 0L);
			method15030();
			aD3DPRESENT_PARAMETERS11573.BackBufferWidth = i;
			aD3DPRESENT_PARAMETERS11573.BackBufferHeight = i_120_;
			aD3DPRESENT_PARAMETERS11573.BackBufferCount = 1;
			if (method18094(anInt11608, anInt11570, aLong11571, anInt9573, aD3DDISPLAYMODE11574, aD3DPRESENT_PARAMETERS11573)) {
				int i_125_ = IDirect3DDevice.Reset(aLong11572, aD3DPRESENT_PARAMETERS11573);
				if (Class276.method5145(i_125_)) {
					aBool11587 = false;
					method14902();
					method14900();
					return true;
				}
			}
		}
		return false;
	}

	void method15059() {
		IDirect3DDevice.SetScissorRect(aLong11572, anInt9504 + anInt9468, anInt9499 + anInt9486, anInt9603, anInt9487);
	}

	public void method15138(Class427 class427) {
		class427.method6751(aClass427_11613);
	}

	public void method3266(int i, int i_126_, int[] is, int[] is_127_) {
		method18108(i, i_126_, is, is_127_);
	}

	public void method15140(Class427 class427) {
		class427.method6751(aClass427_11613);
	}

	public void method15043(Class427 class427) {
		class427.method6751(aClass427_11613);
	}

	void method14918() {
		IDirect3DDevice.method15866(aLong11572, 7, aBool9427 && aBool9503);
	}

	void method15183() {
		int i;
		for (i = 0; i < anInt9440; i++) {
			Class527_Sub16 class527_sub16 = aClass527_Sub16Array9520[i];
			int i_128_ = i + 2;
			int i_129_ = class527_sub16.method16133((byte) 0);
			float f = class527_sub16.method16162(-2113392201) / 255.0F;
			D3DLIGHT.SetPosition(aLong11579, (float) class527_sub16.method16129((byte) 48), (float) class527_sub16.method16130((byte) -25), (float) class527_sub16.method16131((byte) -15));
			D3DLIGHT.SetDiffuse(aLong11579, (float) (i_129_ >> 16 & 0xff) * f, (float) (i_129_ >> 8 & 0xff) * f, (float) (i_129_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(aLong11579, 0.0F, 0.0F, 1.0F / (float) (class527_sub16.method16132(-306076525) * class527_sub16.method16132(1096586530)));
			D3DLIGHT.SetRange(aLong11579, (float) class527_sub16.method16132(-1273757686));
			IDirect3DDevice.SetLight(aLong11572, i_128_, aLong11579);
			IDirect3DDevice.LightEnable(aLong11572, i_128_, true);
		}
		for (/**/; i < anInt9526; i++)
			IDirect3DDevice.LightEnable(aLong11572, i + 2, false);
	}

	void method15046() {
		if (aBool9597)
			IDirect3DDevice.method15866(aLong11572, 137, aBool9515 && !aBool9506);
	}

	void method15131() {
		if (aBool9597)
			IDirect3DDevice.method15866(aLong11572, 137, aBool9515 && !aBool9506);
	}

	void method15167() {
		if (aBool9597)
			IDirect3DDevice.method15866(aLong11572, 137, aBool9515 && !aBool9506);
	}

	void method15168() {
		if (aBool9597) {
			float f = aBool9505 ? aFloat9516 : 0.0F;
			float f_130_ = aBool9505 ? -aFloat9548 : 0.0F;
			D3DLIGHT.SetDiffuse(aLong11577, f * aFloat9583, f * aFloat9513, f * aFloat9448, 0.0F);
			D3DLIGHT.SetDiffuse(aLong11583, f_130_ * aFloat9583, f_130_ * aFloat9513, f_130_ * aFloat9448, 0.0F);
			aBool11580 = false;
		}
	}

	void method15176() {
		if (aBool9597 && !aBool11580) {
			IDirect3DDevice.LightEnable(aLong11572, 0, false);
			IDirect3DDevice.LightEnable(aLong11572, 1, false);
			IDirect3DDevice.SetLight(aLong11572, 0, aLong11577);
			IDirect3DDevice.SetLight(aLong11572, 1, aLong11583);
			IDirect3DDevice.LightEnable(aLong11572, 0, true);
			IDirect3DDevice.LightEnable(aLong11572, 1, true);
			aBool11580 = true;
		}
	}

	void method15169() {
		if (aBool9597) {
			D3DLIGHT.SetDirection(aLong11577, -aFloatArray9507[0], -aFloatArray9507[1], -aFloatArray9507[2]);
			D3DLIGHT.SetDirection(aLong11583, -aFloatArray9519[0], -aFloatArray9519[1], -aFloatArray9519[2]);
			aBool11580 = false;
		}
	}

	void method15094() {
		if (aBool9597) {
			D3DLIGHT.SetDirection(aLong11577, -aFloatArray9507[0], -aFloatArray9507[1], -aFloatArray9507[2]);
			D3DLIGHT.SetDirection(aLong11583, -aFloatArray9519[0], -aFloatArray9519[1], -aFloatArray9519[2]);
			aBool11580 = false;
		}
	}

	byte[] method18103(String string) {
		return method14895("dx", string);
	}

	final void method18104(long l) {
		IDirect3DDevice.SetPixelShader(aLong11572, l);
	}

	void method15173() {
		if (aBool9597) {
			D3DLIGHT.SetDirection(aLong11577, -aFloatArray9507[0], -aFloatArray9507[1], -aFloatArray9507[2]);
			D3DLIGHT.SetDirection(aLong11583, -aFloatArray9519[0], -aFloatArray9519[1], -aFloatArray9519[2]);
			aBool11580 = false;
		}
	}

	void method14991(int i) {
		IDirect3DDevice.SetRenderState(aLong11572, 168, i);
	}

	synchronized void method18105(long l) {
		if (anInt11603 == anInt11591) {
			anInt11591 *= 2;
			long[] ls = new long[anInt11591];
			System.arraycopy(aLongArray11604, 0, ls, 0, anInt11603);
			aLongArray11604 = ls;
		}
		aLongArray11604[anInt11603] = l;
		anInt11603++;
	}

	Interface40 method15184(Class157 class157, Class184 class184, int i, int i_131_) {
		return new Class416_Sub1_Sub1(this, class157, class184, i, i_131_);
	}

	void method15261() {
		if (aBool9597)
			IDirect3DDevice.method15866(aLong11572, 28, (aBool9560 && aBool9473 && anInt9562 >= 0));
	}

	void method15178() {
		method15044();
		method14956();
	}

	Class355 method15267(Class372[] class372s) {
		return new Class355_Sub1(this, class372s);
	}

	void method15180() {
		method15044();
		method14956();
	}

	void method15181() {
		method15044();
		method14956();
	}

	void method15182() {
		int i;
		for (i = 0; i < anInt9440; i++) {
			Class527_Sub16 class527_sub16 = aClass527_Sub16Array9520[i];
			int i_132_ = i + 2;
			int i_133_ = class527_sub16.method16133((byte) 0);
			float f = class527_sub16.method16162(-1815380622) / 255.0F;
			D3DLIGHT.SetPosition(aLong11579, (float) class527_sub16.method16129((byte) 11), (float) class527_sub16.method16130((byte) 62), (float) class527_sub16.method16131((byte) -49));
			D3DLIGHT.SetDiffuse(aLong11579, (float) (i_133_ >> 16 & 0xff) * f, (float) (i_133_ >> 8 & 0xff) * f, (float) (i_133_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(aLong11579, 0.0F, 0.0F, 1.0F / (float) (class527_sub16.method16132(-1345284178) * class527_sub16.method16132(760367106)));
			D3DLIGHT.SetRange(aLong11579, (float) class527_sub16.method16132(-1297698657));
			IDirect3DDevice.SetLight(aLong11572, i_132_, aLong11579);
			IDirect3DDevice.LightEnable(aLong11572, i_132_, true);
		}
		for (/**/; i < anInt9526; i++)
			IDirect3DDevice.LightEnable(aLong11572, i + 2, false);
	}

	void method3122(int i, int i_134_) throws Exception_Sub1 {
		if (aBool11587) {
			if (!method18102(aClass171_Sub1_2073.method2728(), aClass171_Sub1_2073.method2729()))
				return;
			((Class171_Sub1_Sub1_Sub1) aClass171_Sub1_2073).method347();
		} else
			IDirect3DDevice.EndScene(aLong11572);
		int i_135_ = aClass171_Sub1_2073.method14726();
		if (Class276.method5144(i_135_)) {
			aBool11587 = true;
			aClass171_Sub1_2073.method129();
		} else {
			IDirect3DDevice.BeginScene(aLong11572);
			if (anInterface24_2085 != null)
				anInterface24_2085.method19((byte) -28);
		}
	}

	boolean method15188(Class157 class157, Class184 class184) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class276.method5145(IDirect3D.GetAdapterDisplayMode(aLong11571, anInt11608, d3ddisplaymode)) && Class276.method5145(IDirect3D.CheckDeviceFormat(aLong11571, anInt11608, anInt11570, d3ddisplaymode.Format, 0, 4, method18096(class157, class184))));
	}

	public void method14969(Class427 class427, Class427 class427_136_, Class427 class427_137_) {
		IDirect3DDevice.SetTransform(aLong11572, 256, class427.aFloatArray4807);
		IDirect3DDevice.SetTransform(aLong11572, 2, class427_136_.aFloatArray4807);
		IDirect3DDevice.SetTransform(aLong11572, 3, class427_137_.aFloatArray4807);
	}

	Interface35 method15204(Class157 class157, int i, int i_138_, int i_139_, boolean bool, byte[] is) {
		return new Class416_Sub2(this, class157, i, i_138_, i_139_, bool, is);
	}

	public boolean method3264() {
		return true;
	}

	Interface38 method14978(Class157 class157, int i, int i_140_, boolean bool, byte[] is, int i_141_, int i_142_) {
		return new Class416_Sub1(this, class157, i, i_140_, bool, is, i_141_, i_142_);
	}

	Interface38 method15057(Class157 class157, int i, int i_143_, boolean bool, byte[] is, int i_144_, int i_145_) {
		return new Class416_Sub1(this, class157, i, i_143_, bool, is, i_144_, i_145_);
	}

	final void method15239() {
		if (aBool9597)
			IDirect3DDevice.SetRenderState(aLong11572, 60, anInt9531);
	}

	Interface38 method15195(Class157 class157, int i, int i_146_, boolean bool, float[] fs, int i_147_, int i_148_) {
		return new Class416_Sub1(this, class157, i, i_146_, bool, fs, i_147_, i_148_);
	}

	public Class171_Sub2 method3109() {
		return new Class171_Sub2_Sub1_Sub1(this);
	}

	void method14928() {
		if (aClass171_2080 != null)
			IDirect3DDevice.SetViewport(aLong11572, anInt9504 + anInt9586, anInt9499 + anInt9510, anInt9466, anInt9450, aFloat9480, aFloat9524);
	}

	Interface38 method15197(int i, int i_149_, boolean bool, int[] is, int i_150_, int i_151_) {
		return new Class416_Sub1(this, i, i_149_, bool, is, i_150_, i_151_);
	}

	void method14929() {
		IDirect3DDevice.SetScissorRect(aLong11572, anInt9504 + anInt9468, anInt9499 + anInt9486, anInt9603, anInt9487);
	}

	Interface39 method15199(int i, boolean bool, int[][] is) {
		return new Class416_Sub3(this, i, bool, is);
	}

	void method18106(Interface52 interface52) {
		if (method18078(interface52) == null)
			aClass694_11575.method14147(new Class527_Sub26(interface52), -724756763);
	}

	Interface39 method15201(int i, boolean bool, int[][] is) {
		return new Class416_Sub3(this, i, bool, is);
	}

	Interface39 method14957(int i, boolean bool, int[][] is) {
		return new Class416_Sub3(this, i, bool, is);
	}

	synchronized void method18107(long l) {
		if (anInt11603 == anInt11591) {
			anInt11591 *= 2;
			long[] ls = new long[anInt11591];
			System.arraycopy(aLongArray11604, 0, ls, 0, anInt11603);
			aLongArray11604 = ls;
		}
		aLongArray11604[anInt11603] = l;
		anInt11603++;
	}

	public final synchronized void method3209(int i) {
		for (int i_152_ = 0; i_152_ < anInt11603; i_152_++)
			IUnknown.Release(aLongArray11604[i_152_]);
		anInt11603 = 0;
		super.method3209(i);
	}

	public void method14906() {
		if (aBoolArray11589[anInt9525]) {
			aBoolArray11589[anInt9525] = false;
			IDirect3DDevice.SetTexture(aLong11572, anInt9525, 0L);
			method15039();
			method14986();
		}
	}

	public boolean method15069() {
		return (aD3DCAPS11590.PixelShaderVersion & 0xffff) >= 257;
	}

	public void method15211() {
		if (aBoolArray11589[anInt9525]) {
			aBoolArray11589[anInt9525] = false;
			IDirect3DDevice.SetTexture(aLong11572, anInt9525, 0L);
			method15039();
			method14986();
		}
	}

	final void method15223(int i, Class368 class368, boolean bool, boolean bool_153_) {
		if (aBool9597) {
			int i_154_ = 0;
			int i_155_;
			switch (i) {
			default:
				i_155_ = 2;
				break;
			case 2:
				i_155_ = 26;
				break;
			case 1:
				i_155_ = 3;
			}
			if (bool)
				i_154_ |= 0x20;
			if (bool_153_)
				i_154_ |= 0x10;
			IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, i_155_, (method18089(class368) | i_154_));
		}
	}

	final void method15224(int i, Class368 class368, boolean bool, boolean bool_156_) {
		if (aBool9597) {
			int i_157_ = 0;
			int i_158_;
			switch (i) {
			default:
				i_158_ = 2;
				break;
			case 2:
				i_158_ = 26;
				break;
			case 1:
				i_158_ = 3;
			}
			if (bool)
				i_157_ |= 0x20;
			if (bool_156_)
				i_157_ |= 0x10;
			IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, i_158_, (method18089(class368) | i_157_));
		}
	}

	final void method15225(int i, Class368 class368, boolean bool, boolean bool_159_) {
		if (aBool9597) {
			int i_160_ = 0;
			int i_161_;
			switch (i) {
			default:
				i_161_ = 2;
				break;
			case 2:
				i_161_ = 26;
				break;
			case 1:
				i_161_ = 3;
			}
			if (bool)
				i_160_ |= 0x20;
			if (bool_159_)
				i_160_ |= 0x10;
			IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, i_161_, (method18089(class368) | i_160_));
		}
	}

	void method15164() {
		IDirect3DDevice.method15866(aLong11572, 7, aBool9427 && aBool9503);
	}

	final void method15293(int i, Class368 class368, boolean bool) {
		if (aBool9597) {
			int i_162_ = 0;
			int i_163_;
			switch (i) {
			case 1:
				i_163_ = 6;
				break;
			case 2:
				i_163_ = 27;
				break;
			default:
				i_163_ = 5;
			}
			if (bool)
				i_162_ |= 0x10;
			IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, i_163_, (method18089(class368) | i_162_));
		}
	}

	void method15228() {
		/* empty */
	}

	long method18108(int i, int i_164_, int[] is, int[] is_165_) {
		if (aLongArray11602[anInt11610] != 0L) {
			IUnknown.Release(aLongArray11602[anInt11610]);
			aLongArray11602[anInt11610] = 0L;
		}
		aByteBuffer9438.clear();
		IDirect3DSurface.Download(aLongArray11598[anInt11610], 0, 0, i, i_164_, i * 4, 0, aLong9439);
		if (++anInt11610 >= 3)
			anInt11610 = 0;
		if (is != null) {
			aByteBuffer9438.asIntBuffer().get(is);
			return 0L;
		}
		return aLong9439;
	}

	void method15093() {
		/* empty */
	}

	void method14949() {
		if (aBool9597) {
			int i = (aBoolArray11589[anInt9525] ? method18088(aClass374Array9536[anInt9525]) : 1);
			IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, 1, i);
		}
	}

	public String method3096() {
		String string = "Caps: 4:";
		String string_166_ = ":";
		string = new StringBuilder().append(string).append(anInt9573).append(string_166_).toString();
		string = new StringBuilder().append(string).append(anInt9521).append(string_166_).toString();
		string = new StringBuilder().append(string).append(anInt9580).append(string_166_).toString();
		string = new StringBuilder().append(string).append(aBool9518 ? 1 : 0).append(string_166_).toString();
		string = new StringBuilder().append(string).append(method14888() ? 1 : 0).append(string_166_).toString();
		string = new StringBuilder().append(string).append(method14889() ? 1 : 0).append(string_166_).toString();
		string = new StringBuilder().append(string).append(aBool9587 ? 1 : 0).append(string_166_).toString();
		string = new StringBuilder().append(string).append(aBool9585 ? 1 : 0).append(string_166_).toString();
		string = new StringBuilder().append(string).append(aBool11599 ? 1 : 0).append(string_166_).toString();
		string = new StringBuilder().append(string).append(aBool11576 ? 1 : 0).append(string_166_).toString();
		string = new StringBuilder().append(string).append(aBool11593 ? 1 : 0).append(string_166_).toString();
		string = new StringBuilder().append(string).append(aBool11606 ? 1 : 0).append(string_166_).toString();
		string = new StringBuilder().append(string).append(aBool9581 ? 1 : 0).append(string_166_).toString();
		string = new StringBuilder().append(string).append(aBool9494 ? 1 : 0).append(string_166_).toString();
		string = new StringBuilder().append(string).append(aBool9567 ? 1 : 0).append(string_166_).toString();
		string = new StringBuilder().append(string).append(aBool11595 ? 1 : 0).append(string_166_).toString();
		string = new StringBuilder().append(string).append(aBool11607 ? 1 : 0).append(string_166_).toString();
		string = new StringBuilder().append(string).append(aBool11597 ? 1 : 0).append(string_166_).toString();
		string = new StringBuilder().append(string).append(aBool9588 ? 1 : 0).append(string_166_).toString();
		string = new StringBuilder().append(string).append(aBool11578 ? 1 : 0).append(string_166_).toString();
		string = new StringBuilder().append(string).append(aBool11569 ? 1 : 0).toString();
		return string;
	}

	void method15241() {
		if (aBool9597) {
			int i = (aBoolArray11589[anInt9525] ? method18088(aClass374Array9536[anInt9525]) : 1);
			IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, 1, i);
		}
	}

	void method15229() {
		if (aBool9597) {
			int i = (aBoolArray11589[anInt9525] ? method18088(aClass374Array9536[anInt9525]) : 1);
			IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, 1, i);
		}
	}

	void method15242() {
		if (aBool9597) {
			int i = (aBoolArray11589[anInt9525] ? method18088(aClass374Array9472[anInt9525]) : 1);
			IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, 4, i);
		}
	}

	void method14981(int i) {
		IDirect3DDevice.SetRenderState(aLong11572, 168, i);
	}

	void method15251(int i) {
		IDirect3DDevice.SetRenderState(aLong11572, 168, i);
	}

	void method15031() {
		IDirect3DDevice.method15866(aLong11572, 15, aBool9570);
		IDirect3DDevice.SetRenderState(aLong11572, 24, aByte9571 & 0xff);
		if (aD3DPRESENT_PARAMETERS11573.MultiSampleType > 0) {
			if (!aBool9570 || aByte9571 == 0) {
				if (aBool11597 || aBool11595)
					IDirect3DDevice.SetRenderState(aLong11572, 181, 0);
				else if (aBool11607)
					IDirect3DDevice.method15865(aLong11572, 154, 1.0F);
			} else if (aBool11597)
				IDirect3DDevice.SetRenderState(aLong11572, 181, method15014('S', 'S', 'A', 'A'));
			else if (aBool11595)
				IDirect3DDevice.SetRenderState(aLong11572, 181, method15014('A', 'T', 'O', 'C'));
			else if (aBool11607)
				IDirect3DDevice.SetRenderState(aLong11572, 154, method15014('A', '2', 'M', '1'));
		}
	}

	public void method3276(long l) {
		/* empty */
	}

	void method15040() {
		switch (aClass357_9568.anInt3827) {
		case 0:
			IDirect3DDevice.SetRenderState(aLong11572, 19, 5);
			IDirect3DDevice.SetRenderState(aLong11572, 20, 6);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(aLong11572, 19, 2);
			IDirect3DDevice.SetRenderState(aLong11572, 20, 1);
			break;
		case 3:
			IDirect3DDevice.SetRenderState(aLong11572, 19, 2);
			IDirect3DDevice.SetRenderState(aLong11572, 20, 2);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(aLong11572, 19, 9);
			IDirect3DDevice.SetRenderState(aLong11572, 20, 2);
			break;
		}
		switch (anInt9593) {
		case 3:
			IDirect3DDevice.SetRenderState(aLong11572, 207, 1);
			IDirect3DDevice.SetRenderState(aLong11572, 208, 2);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(aLong11572, 207, 2);
			IDirect3DDevice.SetRenderState(aLong11572, 208, 1);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(aLong11572, 207, 2);
			IDirect3DDevice.SetRenderState(aLong11572, 208, 2);
			break;
		case 0:
			IDirect3DDevice.SetRenderState(aLong11572, 207, 1);
			IDirect3DDevice.SetRenderState(aLong11572, 208, 1);
			break;
		}
	}

	void method15286(int i) {
		if (!aBool11600) {
			int i_167_ = (i & 0x2) != 0 ? 2 : 3;
			IDirect3DDevice.SetRenderState(aLong11572, 8, i_167_);
		}
	}

	void method15255() {
		IDirect3DDevice.method15866(aLong11572, 27, aBool9569);
	}

	Interface38 method14967(int i, int i_168_, boolean bool, int[] is, int i_169_, int i_170_) {
		return new Class416_Sub1(this, i, i_168_, bool, is, i_169_, i_170_);
	}

	public void method15090(Class427 class427, Class427 class427_171_, Class427 class427_172_) {
		IDirect3DDevice.SetTransform(aLong11572, 256, class427.aFloatArray4807);
		IDirect3DDevice.SetTransform(aLong11572, 2, class427_171_.aFloatArray4807);
		IDirect3DDevice.SetTransform(aLong11572, 3, class427_172_.aFloatArray4807);
	}

	void method15262(boolean bool) {
		IDirect3DDevice.method15866(aLong11572, 161, bool);
	}

	final Interface44 method15263(boolean bool) {
		return new Class417(this, Class184.aClass184_2110, bool);
	}

	final Interface37 method15282(boolean bool) {
		return new Class419(this, bool);
	}

	final Interface37 method15002(boolean bool) {
		return new Class419(this, bool);
	}

	Class355 method15152(Class372[] class372s) {
		return new Class355_Sub1(this, class372s);
	}

	void method15230() {
		method15044();
		method14956();
	}

	static final int method18109(Class368 class368) {
		switch (class368.anInt3891) {
		default:
			throw new IllegalArgumentException();
		case 1:
			return 0;
		case 0:
			return 2;
		case 3:
			return 1;
		case 2:
			return 3;
		}
	}

	public Class261 method15086(String string) {
		byte[] is = method18103(string);
		if (is == null)
			return null;
		Class272 class272 = method14896(is);
		return new Class261_Sub2(this, class272);
	}

	public void method15045(Class355 class355) {
		Class355_Sub1 class355_sub1 = (Class355_Sub1) class355;
		IDirect3DDevice.SetVertexDeclaration(aLong11572, class355_sub1.aLong10120);
	}

	public void method15269(int i, Interface37 interface37) {
		Class419 class419 = (Class419) interface37;
		IDirect3DDevice.SetStreamSource(aLong11572, i, class419.aLong4577, 0, class419.method6667());
	}

	public void method15270(int i, Interface37 interface37) {
		Class419 class419 = (Class419) interface37;
		IDirect3DDevice.SetStreamSource(aLong11572, i, class419.aLong4577, 0, class419.method6667());
	}

	public void method15077(int i, Interface37 interface37) {
		Class419 class419 = (Class419) interface37;
		IDirect3DDevice.SetStreamSource(aLong11572, i, class419.aLong4577, 0, class419.method6667());
	}

	void method15271(Interface44 interface44) {
		IDirect3DDevice.SetIndices(aLong11572, ((Class417) interface44).aLong4524);
	}

	public Class143 method3220() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(aLong11571, anInt11608, 0, d3dadapter_identifier);
		return new Class143(d3dadapter_identifier.VendorID, method14891() ? "Direct3D FF" : "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion, method14891());
	}

	void method15037(Interface44 interface44) {
		IDirect3DDevice.SetIndices(aLong11572, ((Class417) interface44).aLong4524);
	}

	public final void method15042(Class364 class364, int i, int i_173_) {
		if (aClass265_Sub2_11588 != null)
			aClass265_Sub2_11588.method15666();
		IDirect3DDevice.DrawPrimitive(aLong11572, method18093(class364), i, i_173_);
	}

	public final void method15019(Class364 class364, int i, int i_174_) {
		if (aClass265_Sub2_11588 != null)
			aClass265_Sub2_11588.method15666();
		IDirect3DDevice.DrawPrimitive(aLong11572, method18093(class364), i, i_174_);
	}

	public boolean method3133() {
		return true;
	}

	public final void method15234(Class364 class364, int i, int i_175_, int i_176_, int i_177_) {
		if (aClass265_Sub2_11588 != null)
			aClass265_Sub2_11588.method15666();
		IDirect3DDevice.DrawIndexedPrimitive(aLong11572, method18093(class364), 0, i, i_175_, i_176_, i_177_);
	}

	public Interface23 method3156(int i, int i_178_, int i_179_) {
		return new Class415(this, Class184.aClass184_2106, i, i_178_, i_179_);
	}

	void method15172() {
		if (aBool9597) {
			D3DLIGHT.SetDirection(aLong11577, -aFloatArray9507[0], -aFloatArray9507[1], -aFloatArray9507[2]);
			D3DLIGHT.SetDirection(aLong11583, -aFloatArray9519[0], -aFloatArray9519[1], -aFloatArray9519[2]);
			aBool11580 = false;
		}
	}

	void method15287(int i) {
		if (!aBool11600) {
			int i_180_ = (i & 0x2) != 0 ? 2 : 3;
			IDirect3DDevice.SetRenderState(aLong11572, 8, i_180_);
		}
	}

	Interface38 method14966(Class157 class157, int i, int i_181_, boolean bool, float[] fs, int i_182_, int i_183_) {
		return new Class416_Sub1(this, class157, i, i_181_, bool, fs, i_182_, i_183_);
	}

	static Class180 method18110(Canvas canvas, Class181 class181, Interface24 interface24, Interface48 interface48, Interface46 interface46, Interface49 interface49, Class459 class459, Integer integer) {
		Class180_Sub2_Sub2 class180_sub2_sub2 = null;
		Class180_Sub2_Sub2 class180_sub2_sub2_184_;
		try {
			int i = 0;
			int i_185_ = 1;
			long l = IDirect3D.Direct3DCreate();
			D3DCAPS d3dcaps = new D3DCAPS();
			IDirect3D.GetDeviceCaps(l, i, i_185_, d3dcaps);
			if ((d3dcaps.RasterCaps & 0x1000000) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxSimultaneousTextures < 2)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x8) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x40) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x200) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
				throw new RuntimeException("");
			if (d3dcaps.MaxStreams < 5)
				throw new RuntimeException("");
			D3DPRESENT_PARAMETERS d3dpresent_parameters = new D3DPRESENT_PARAMETERS(canvas);
			d3dpresent_parameters.Windowed = true;
			d3dpresent_parameters.EnableAutoDepthStencil = true;
			d3dpresent_parameters.BackBufferWidth = canvas.getWidth();
			d3dpresent_parameters.BackBufferHeight = canvas.getHeight();
			d3dpresent_parameters.BackBufferCount = 1;
			d3dpresent_parameters.PresentationInterval = -2147483648;
			D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
			if (!method18094(i, i_185_, l, integer.intValue(), d3ddisplaymode, d3dpresent_parameters))
				throw new RuntimeException("");
			int i_186_ = 0;
			if ((d3dcaps.DevCaps & 0x100000) != 0)
				i_186_ |= 0x10;
			long l_187_ = 0L;
			try {
				l_187_ = IDirect3D.CreateDeviceContext(l, i, i_185_, canvas, i_186_ | 0x40, d3dpresent_parameters);
			} catch (RuntimeException_Sub5 runtimeexception_sub5) {
				l_187_ = IDirect3D.CreateDeviceContext(l, i, i_185_, canvas, i_186_ & ~0x100000 | 0x20, d3dpresent_parameters);
			}
			class180_sub2_sub2 = new Class180_Sub2_Sub2(i, i_185_, l, l_187_, d3ddisplaymode, d3dpresent_parameters, d3dcaps, class181, interface24, interface48, interface46, interface49, class459, integer.intValue());
			if (!class180_sub2_sub2.aHashtable2082.containsKey(canvas)) {
				Class552.method9150(canvas, -748015741);
				class180_sub2_sub2.method3102(canvas, new Class171_Sub1_Sub1_Sub1(class180_sub2_sub2, canvas, canvas.getWidth(), canvas.getHeight(), true), -158912915);
			}
			class180_sub2_sub2.method3104(canvas, 673954373);
			class180_sub2_sub2.method14899();
			class180_sub2_sub2_184_ = class180_sub2_sub2;
		} catch (RuntimeException runtimeexception) {
			if (class180_sub2_sub2 != null)
				class180_sub2_sub2.method3082();
			throw runtimeexception;
		}
		return class180_sub2_sub2_184_;
	}

	static Class180 method18111(Canvas canvas, Class181 class181, Interface24 interface24, Interface48 interface48, Interface46 interface46, Interface49 interface49, Class459 class459, Integer integer) {
		Class180_Sub2_Sub2 class180_sub2_sub2 = null;
		Class180_Sub2_Sub2 class180_sub2_sub2_188_;
		try {
			int i = 0;
			int i_189_ = 1;
			long l = IDirect3D.Direct3DCreate();
			D3DCAPS d3dcaps = new D3DCAPS();
			IDirect3D.GetDeviceCaps(l, i, i_189_, d3dcaps);
			if ((d3dcaps.RasterCaps & 0x1000000) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxSimultaneousTextures < 2)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x8) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x40) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x200) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
				throw new RuntimeException("");
			if (d3dcaps.MaxStreams < 5)
				throw new RuntimeException("");
			D3DPRESENT_PARAMETERS d3dpresent_parameters = new D3DPRESENT_PARAMETERS(canvas);
			d3dpresent_parameters.Windowed = true;
			d3dpresent_parameters.EnableAutoDepthStencil = true;
			d3dpresent_parameters.BackBufferWidth = canvas.getWidth();
			d3dpresent_parameters.BackBufferHeight = canvas.getHeight();
			d3dpresent_parameters.BackBufferCount = 1;
			d3dpresent_parameters.PresentationInterval = -2147483648;
			D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
			if (!method18094(i, i_189_, l, integer.intValue(), d3ddisplaymode, d3dpresent_parameters))
				throw new RuntimeException("");
			int i_190_ = 0;
			if ((d3dcaps.DevCaps & 0x100000) != 0)
				i_190_ |= 0x10;
			long l_191_ = 0L;
			try {
				l_191_ = IDirect3D.CreateDeviceContext(l, i, i_189_, canvas, i_190_ | 0x40, d3dpresent_parameters);
			} catch (RuntimeException_Sub5 runtimeexception_sub5) {
				l_191_ = IDirect3D.CreateDeviceContext(l, i, i_189_, canvas, i_190_ & ~0x100000 | 0x20, d3dpresent_parameters);
			}
			class180_sub2_sub2 = new Class180_Sub2_Sub2(i, i_189_, l, l_191_, d3ddisplaymode, d3dpresent_parameters, d3dcaps, class181, interface24, interface48, interface46, interface49, class459, integer.intValue());
			if (!class180_sub2_sub2.aHashtable2082.containsKey(canvas)) {
				Class552.method9150(canvas, -2136708366);
				class180_sub2_sub2.method3102(canvas, new Class171_Sub1_Sub1_Sub1(class180_sub2_sub2, canvas, canvas.getWidth(), canvas.getHeight(), true), -158912915);
			}
			class180_sub2_sub2.method3104(canvas, 673954373);
			class180_sub2_sub2.method14899();
			class180_sub2_sub2_188_ = class180_sub2_sub2;
		} catch (RuntimeException runtimeexception) {
			if (class180_sub2_sub2 != null)
				class180_sub2_sub2.method3082();
			throw runtimeexception;
		}
		return class180_sub2_sub2_188_;
	}

	static Class180 method18112(Canvas canvas, Class181 class181, Interface24 interface24, Interface48 interface48, Interface46 interface46, Interface49 interface49, Class459 class459, Integer integer) {
		Class180_Sub2_Sub2 class180_sub2_sub2 = null;
		Class180_Sub2_Sub2 class180_sub2_sub2_192_;
		try {
			int i = 0;
			int i_193_ = 1;
			long l = IDirect3D.Direct3DCreate();
			D3DCAPS d3dcaps = new D3DCAPS();
			IDirect3D.GetDeviceCaps(l, i, i_193_, d3dcaps);
			if ((d3dcaps.RasterCaps & 0x1000000) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxSimultaneousTextures < 2)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x8) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x40) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x200) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
				throw new RuntimeException("");
			if (d3dcaps.MaxStreams < 5)
				throw new RuntimeException("");
			D3DPRESENT_PARAMETERS d3dpresent_parameters = new D3DPRESENT_PARAMETERS(canvas);
			d3dpresent_parameters.Windowed = true;
			d3dpresent_parameters.EnableAutoDepthStencil = true;
			d3dpresent_parameters.BackBufferWidth = canvas.getWidth();
			d3dpresent_parameters.BackBufferHeight = canvas.getHeight();
			d3dpresent_parameters.BackBufferCount = 1;
			d3dpresent_parameters.PresentationInterval = -2147483648;
			D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
			if (!method18094(i, i_193_, l, integer.intValue(), d3ddisplaymode, d3dpresent_parameters))
				throw new RuntimeException("");
			int i_194_ = 0;
			if ((d3dcaps.DevCaps & 0x100000) != 0)
				i_194_ |= 0x10;
			long l_195_ = 0L;
			try {
				l_195_ = IDirect3D.CreateDeviceContext(l, i, i_193_, canvas, i_194_ | 0x40, d3dpresent_parameters);
			} catch (RuntimeException_Sub5 runtimeexception_sub5) {
				l_195_ = IDirect3D.CreateDeviceContext(l, i, i_193_, canvas, i_194_ & ~0x100000 | 0x20, d3dpresent_parameters);
			}
			class180_sub2_sub2 = new Class180_Sub2_Sub2(i, i_193_, l, l_195_, d3ddisplaymode, d3dpresent_parameters, d3dcaps, class181, interface24, interface48, interface46, interface49, class459, integer.intValue());
			if (!class180_sub2_sub2.aHashtable2082.containsKey(canvas)) {
				Class552.method9150(canvas, -1056120043);
				class180_sub2_sub2.method3102(canvas, new Class171_Sub1_Sub1_Sub1(class180_sub2_sub2, canvas, canvas.getWidth(), canvas.getHeight(), true), -158912915);
			}
			class180_sub2_sub2.method3104(canvas, 673954373);
			class180_sub2_sub2.method14899();
			class180_sub2_sub2_192_ = class180_sub2_sub2;
		} catch (RuntimeException runtimeexception) {
			if (class180_sub2_sub2 != null)
				class180_sub2_sub2.method3082();
			throw runtimeexception;
		}
		return class180_sub2_sub2_192_;
	}

	void method15290() {
		for (Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass694_11575.method14081((short) 11749); class527_sub26 != null; class527_sub26 = (Class527_Sub26) aClass694_11575.method14086(-65534)) {
			Interface52 interface52 = (Interface52) class527_sub26.anObject10522;
			interface52.method347();
			if (interface52 == aClass171_2080)
				interface52.method348();
		}
		super.method14902();
	}

	void method15291() {
		for (Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass694_11575.method14081((short) -8499); class527_sub26 != null; class527_sub26 = (Class527_Sub26) aClass694_11575.method14086(-65534)) {
			Interface52 interface52 = (Interface52) class527_sub26.anObject10522;
			interface52.method347();
			if (interface52 == aClass171_2080)
				interface52.method348();
		}
		super.method14902();
	}

	boolean method18113(int i, int i_196_) {
		int i_197_ = IDirect3DDevice.TestCooperativeLevel(aLong11572);
		if (i_197_ == 0 || i_197_ == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(aLong11572, 0L);
			for (int i_198_ = 1; i_198_ < 4; i_198_++)
				IDirect3DDevice.SetRenderTarget(aLong11572, i_198_, 0L);
			for (int i_199_ = 0; i_199_ < 4; i_199_++)
				IDirect3DDevice.SetStreamSource(aLong11572, i_199_, 0L, 0, 0);
			for (int i_200_ = 0; i_200_ < 4; i_200_++)
				IDirect3DDevice.SetTexture(aLong11572, i_200_, 0L);
			IDirect3DDevice.SetIndices(aLong11572, 0L);
			method15030();
			aD3DPRESENT_PARAMETERS11573.BackBufferWidth = i;
			aD3DPRESENT_PARAMETERS11573.BackBufferHeight = i_196_;
			aD3DPRESENT_PARAMETERS11573.BackBufferCount = 1;
			if (method18094(anInt11608, anInt11570, aLong11571, anInt9573, aD3DDISPLAYMODE11574, aD3DPRESENT_PARAMETERS11573)) {
				int i_201_ = IDirect3DDevice.Reset(aLong11572, aD3DPRESENT_PARAMETERS11573);
				if (Class276.method5145(i_201_)) {
					aBool11587 = false;
					method14902();
					method14900();
					return true;
				}
			}
		}
		return false;
	}

	boolean method18114(int i, int i_202_) {
		int i_203_ = IDirect3DDevice.TestCooperativeLevel(aLong11572);
		if (i_203_ == 0 || i_203_ == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(aLong11572, 0L);
			for (int i_204_ = 1; i_204_ < 4; i_204_++)
				IDirect3DDevice.SetRenderTarget(aLong11572, i_204_, 0L);
			for (int i_205_ = 0; i_205_ < 4; i_205_++)
				IDirect3DDevice.SetStreamSource(aLong11572, i_205_, 0L, 0, 0);
			for (int i_206_ = 0; i_206_ < 4; i_206_++)
				IDirect3DDevice.SetTexture(aLong11572, i_206_, 0L);
			IDirect3DDevice.SetIndices(aLong11572, 0L);
			method15030();
			aD3DPRESENT_PARAMETERS11573.BackBufferWidth = i;
			aD3DPRESENT_PARAMETERS11573.BackBufferHeight = i_202_;
			aD3DPRESENT_PARAMETERS11573.BackBufferCount = 1;
			if (method18094(anInt11608, anInt11570, aLong11571, anInt9573, aD3DDISPLAYMODE11574, aD3DPRESENT_PARAMETERS11573)) {
				int i_207_ = IDirect3DDevice.Reset(aLong11572, aD3DPRESENT_PARAMETERS11573);
				if (Class276.method5145(i_207_)) {
					aBool11587 = false;
					method14902();
					method14900();
					return true;
				}
			}
		}
		return false;
	}

	boolean method18115(int i, int i_208_) {
		int i_209_ = IDirect3DDevice.TestCooperativeLevel(aLong11572);
		if (i_209_ == 0 || i_209_ == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(aLong11572, 0L);
			for (int i_210_ = 1; i_210_ < 4; i_210_++)
				IDirect3DDevice.SetRenderTarget(aLong11572, i_210_, 0L);
			for (int i_211_ = 0; i_211_ < 4; i_211_++)
				IDirect3DDevice.SetStreamSource(aLong11572, i_211_, 0L, 0, 0);
			for (int i_212_ = 0; i_212_ < 4; i_212_++)
				IDirect3DDevice.SetTexture(aLong11572, i_212_, 0L);
			IDirect3DDevice.SetIndices(aLong11572, 0L);
			method15030();
			aD3DPRESENT_PARAMETERS11573.BackBufferWidth = i;
			aD3DPRESENT_PARAMETERS11573.BackBufferHeight = i_208_;
			aD3DPRESENT_PARAMETERS11573.BackBufferCount = 1;
			if (method18094(anInt11608, anInt11570, aLong11571, anInt9573, aD3DDISPLAYMODE11574, aD3DPRESENT_PARAMETERS11573)) {
				int i_213_ = IDirect3DDevice.Reset(aLong11572, aD3DPRESENT_PARAMETERS11573);
				if (Class276.method5145(i_213_)) {
					aBool11587 = false;
					method14902();
					method14900();
					return true;
				}
			}
		}
		return false;
	}

	void method15292() {
		for (int i = 0; i < anInt9521; i++) {
			IDirect3DDevice.SetSamplerState(aLong11572, i, 7, 2);
			IDirect3DDevice.SetSamplerState(aLong11572, i, 6, 2);
			IDirect3DDevice.SetSamplerState(aLong11572, i, 5, 2);
			IDirect3DDevice.SetSamplerState(aLong11572, i, 1, 1);
			IDirect3DDevice.SetSamplerState(aLong11572, i, 2, 1);
			aClass343Array11585[i] = Class343.aClass343_3692;
			boolean[] bools = aBoolArray11581;
			int i_214_ = i;
			aBoolArray11596[i] = true;
			bools[i_214_] = true;
			aBoolArray11584[i] = false;
			anIntArray11586[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState(aLong11572, 0, 6, 1);
		IDirect3DDevice.SetRenderState(aLong11572, 9, 2);
		IDirect3DDevice.SetRenderState(aLong11572, 23, 4);
		IDirect3DDevice.SetRenderState(aLong11572, 25, 5);
		IDirect3DDevice.SetRenderState(aLong11572, 24, 0);
		IDirect3DDevice.method15866(aLong11572, 206, aBool9588);
		IDirect3DDevice.SetRenderState(aLong11572, 181, 0);
		method18095();
		IDirect3DDevice.SetRenderState(aLong11572, 147, 1);
		IDirect3DDevice.SetRenderState(aLong11572, 145, 1);
		IDirect3DDevice.method15865(aLong11572, 38, 0.95F);
		IDirect3DDevice.SetRenderState(aLong11572, 35, 3);
		IDirect3DDevice.method15865(aLong11572, 154, 1.0F);
		D3DLIGHT.SetType(aLong11577, 3);
		D3DLIGHT.SetType(aLong11583, 3);
		D3DLIGHT.SetType(aLong11579, 1);
		aBool11580 = false;
		super.method14900();
	}

	Class527_Sub26 method18116(Interface52 interface52) {
		for (Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass694_11575.method14081((short) 114); class527_sub26 != null; class527_sub26 = (Class527_Sub26) aClass694_11575.method14086(-65534)) {
			if (class527_sub26.anObject10522 == interface52)
				return class527_sub26;
		}
		return null;
	}

	Interface38 method15190(Class157 class157, Class184 class184, int i, int i_215_) {
		return new Class416_Sub1(this, class157, class184, i, i_215_);
	}

	void method18117(Interface52 interface52) {
		if (method18078(interface52) == null)
			aClass694_11575.method14147(new Class527_Sub26(interface52), -883836863);
	}

	synchronized void method18118(long l) {
		if (anInt11603 == anInt11591) {
			anInt11591 *= 2;
			long[] ls = new long[anInt11591];
			System.arraycopy(aLongArray11604, 0, ls, 0, anInt11603);
			aLongArray11604 = ls;
		}
		aLongArray11604[anInt11603] = l;
		anInt11603++;
	}

	void method18119(Interface52 interface52) {
		Class527_Sub26 class527_sub26 = method18078(interface52);
		if (class527_sub26 != null)
			class527_sub26.method8735(-1889161967);
	}

	public void method3278(int i, int i_216_, int[] is, int[] is_217_) {
		method18108(i, i_216_, is, is_217_);
	}

	Interface38 method14964(Class157 class157, Class184 class184, int i, int i_218_) {
		return new Class416_Sub1(this, class157, class184, i, i_218_);
	}

	void method18120(Interface52 interface52) {
		Class527_Sub26 class527_sub26 = method18078(interface52);
		if (class527_sub26 != null)
			class527_sub26.method8735(-1889161967);
	}

	void method18121(int i, int i_219_) {
		method3126();
		method3482(i, i_219_, -1784395681);
		aLong11594 = (IDirect3DDevice.CreateRenderTarget(aLong11572, i, i_219_, method18096(Class157.aClass157_1723, Class184.aClass184_2104), 0, 0, false));
		for (int i_220_ = 0; i_220_ < 3; i_220_++)
			aLongArray11598[i_220_] = (IDirect3DDevice.CreateOffscreenPlainSurface(aLong11572, i, i_219_, method18096(Class157.aClass157_1723, Class184.aClass184_2104), 2));
		method15097(i * i_219_ * 4);
	}

	public boolean method3140() {
		if (aBool11587)
			return false;
		if (aLongArray11602[anInt11611] != 0L)
			return false;
		return true;
	}

	public int method3402() {
		if (aLongArray11602[anInt11610] == 0L)
			return -1;
		return ((Class276.method5145(IDirect3DEventQuery.IsSignaled(aLongArray11602[anInt11610]))) ? anIntArray11609[anInt11610] : -1);
	}

	public boolean method15076(boolean bool) {
		if (bool)
			return aBool11578;
		return aBool11578 && aBool11569;
	}

	boolean method15297(Class157 class157, Class184 class184) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class276.method5145(IDirect3D.GetAdapterDisplayMode(aLong11571, anInt11608, d3ddisplaymode)) && Class276.method5145(IDirect3D.CheckDeviceFormat(aLong11571, anInt11608, anInt11570, d3ddisplaymode.Format, 0, 3, method18096(class157, class184))));
	}

	void method15299() {
		if (aLong11592 == 0L && aClass377Array9528[anInt9525] != Class377.aClass377_3923) {
			if (aClass377Array9528[anInt9525] == Class377.aClass377_3921)
				IDirect3DDevice.SetTransform(aLong11572, 16 + anInt9525, aClass427Array9527[anInt9525].method6769(aFloatArray11601));
			else
				IDirect3DDevice.SetTransform(aLong11572, 16 + anInt9525, aClass427Array9527[anInt9525].method6763(aFloatArray11601));
			int i = method18090(aClass377Array9528[anInt9525]);
			if (i != anIntArray11586[anInt9525]) {
				IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, 24, i);
				anIntArray11586[anInt9525] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, 24, 0);
			anIntArray11586[anInt9525] = 0;
		}
	}

	final void method18122(long l) {
		IDirect3DDevice.SetPixelShader(aLong11572, l);
	}

	void method14910() {
		if (aBool9597) {
			int i = (aBoolArray11589[anInt9525] ? method18088(aClass374Array9536[anInt9525]) : 1);
			IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, 1, i);
		}
	}

	Class180_Sub2_Sub2(int i, int i_221_, long l, long l_222_, D3DDISPLAYMODE d3ddisplaymode, D3DPRESENT_PARAMETERS d3dpresent_parameters, D3DCAPS d3dcaps, Class181 class181, Interface24 interface24, Interface48 interface48, Interface46 interface46, Interface49 interface49, Class459 class459, int i_223_) {
		super(class181, interface24, interface48, interface46, interface49, class459, i_223_, 0);
		aLong11577 = 0L;
		aLong11583 = 0L;
		aLong11579 = 0L;
		aBool11580 = false;
		aFloatArray11601 = new float[16];
		anInt11591 = 128;
		anInt11603 = 0;
		aLongArray11604 = new long[anInt11591];
		aLong11594 = 0L;
		aLongArray11602 = new long[3];
		aLongArray11598 = new long[3];
		anIntArray11609 = new int[3];
		anInt11610 = 0;
		anInt11611 = 0;
		try {
			anInt11608 = i;
			anInt11570 = i_221_;
			aLong11571 = l;
			aLong11572 = l_222_;
			aD3DDISPLAYMODE11574 = d3ddisplaymode;
			aD3DPRESENT_PARAMETERS11573 = d3dpresent_parameters;
			aD3DCAPS11590 = d3dcaps;
			aLong11577 = D3DLIGHT.Create();
			aLong11583 = D3DLIGHT.Create();
			aLong11579 = D3DLIGHT.Create();
			anInt9521 = aD3DCAPS11590.MaxSimultaneousTextures;
			anInt9580 = (aD3DCAPS11590.MaxActiveLights > 0 ? aD3DCAPS11590.MaxActiveLights : 8);
			aBool11599 = (aD3DCAPS11590.TextureCaps & 0x2) == 0;
			aBool9585 = (aD3DCAPS11590.TextureCaps & 0x800) != 0;
			aBool9587 = (aD3DCAPS11590.TextureCaps & 0x2000) != 0;
			aBool11576 = (aD3DCAPS11590.TextureCaps & 0x8000) != 0;
			aBool11593 = (aD3DCAPS11590.TextureCaps & 0x10000) != 0;
			aBool11606 = (aD3DCAPS11590.TextureCaps & 0x4000) != 0;
			aBool9581 = aD3DCAPS11590.NumSimultaneousRTs > 0;
			aBool9488 = aBool9581;
			aBool9494 = aD3DCAPS11590.NumSimultaneousRTs > 0;
			aBool9518 = (anInt9573 > 0 || (IDirect3D.CheckDeviceMultiSampleType(aLong11571, anInt11608, anInt11570, aD3DPRESENT_PARAMETERS11573.BackBufferFormat, true, 2)) == 0);
			aBool9567 = (aD3DCAPS11590.NumSimultaneousRTs > 0 && anInt9573 > 0 || IDirect3D.CheckDeviceMultiSampleType(aLong11571, anInt11608, anInt11570, 113, true, 2) == 0);
			aBool11595 = (IDirect3D.CheckDeviceFormat(aLong11571, anInt11608, anInt11570, (aD3DPRESENT_PARAMETERS11573.BackBufferFormat), 0, 1, method15014('A', 'T', 'O', 'C')) == 0);
			aBool11607 = (IDirect3D.CheckDeviceFormat(aLong11571, anInt11608, anInt11570, (aD3DPRESENT_PARAMETERS11573.BackBufferFormat), 0, 1, method15014('A', '2', 'M', '1')) == 0);
			aBool11597 = (IDirect3D.CheckDeviceFormat(aLong11571, anInt11608, anInt11570, (aD3DPRESENT_PARAMETERS11573.BackBufferFormat), 0, 1, method15014('S', 'S', 'A', 'A')) == 0);
			aBool9588 = (aD3DCAPS11590.PrimitiveMiscCaps & 0x20000) != 0;
			aBool11578 = IDirect3D.CheckDeviceFormat(aLong11571, anInt11608, anInt11570, aD3DDISPLAYMODE11574.Format, 524288, 3, 113) == 0;
			aBool11569 = IDirect3D.CheckDeviceFormat(aLong11571, anInt11608, anInt11570, aD3DDISPLAYMODE11574.Format, 524288, 3, 116) == 0;
			aBoolArray11581 = new boolean[anInt9521];
			aBoolArray11596 = new boolean[anInt9521];
			aBoolArray11589 = new boolean[anInt9521];
			aClass343Array11585 = new Class343[anInt9521];
			aBoolArray11584 = new boolean[anInt9521];
			anIntArray11586 = new int[anInt9521];
			Class432 class432 = new Class432();
			class432.method6892(1.0F, -1.0F, 0.5F);
			class432.method6896(0.0F, 0.0F, 0.5F);
			aClass427_11613 = new Class427();
			aClass427_11613.method6784(class432);
			IDirect3DDevice.BeginScene(aLong11572);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method3081((byte) 63);
			throw new RuntimeException("");
		}
	}

	void method15295() {
		if (aBool9597) {
			D3DLIGHT.SetAmbient(aLong11577, aFloat9583 * aFloat9551, aFloat9513 * aFloat9551, aFloat9448 * aFloat9551, 0.0F);
			aBool11580 = false;
		}
	}

	boolean method15016(Class157 class157, Class184 class184) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class276.method5145(IDirect3D.GetAdapterDisplayMode(aLong11571, anInt11608, d3ddisplaymode)) && Class276.method5145(IDirect3D.CheckDeviceFormat(aLong11571, anInt11608, anInt11570, d3ddisplaymode.Format, 0, 3, method18096(class157, class184))));
	}

	boolean method15296(Class157 class157, Class184 class184) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class276.method5145(IDirect3D.GetAdapterDisplayMode(aLong11571, anInt11608, d3ddisplaymode)) && Class276.method5145(IDirect3D.CheckDeviceFormat(aLong11571, anInt11608, anInt11570, d3ddisplaymode.Format, 0, 3, method18096(class157, class184))));
	}

	void method15185() {
		int i;
		for (i = 0; i < anInt9440; i++) {
			Class527_Sub16 class527_sub16 = aClass527_Sub16Array9520[i];
			int i_224_ = i + 2;
			int i_225_ = class527_sub16.method16133((byte) 0);
			float f = class527_sub16.method16162(-2019388452) / 255.0F;
			D3DLIGHT.SetPosition(aLong11579, (float) class527_sub16.method16129((byte) -69), (float) class527_sub16.method16130((byte) -96), (float) class527_sub16.method16131((byte) -97));
			D3DLIGHT.SetDiffuse(aLong11579, (float) (i_225_ >> 16 & 0xff) * f, (float) (i_225_ >> 8 & 0xff) * f, (float) (i_225_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(aLong11579, 0.0F, 0.0F, 1.0F / (float) (class527_sub16.method16132(-238588757) * class527_sub16.method16132(-46212460)));
			D3DLIGHT.SetRange(aLong11579, (float) class527_sub16.method16132(-1447284043));
			IDirect3DDevice.SetLight(aLong11572, i_224_, aLong11579);
			IDirect3DDevice.LightEnable(aLong11572, i_224_, true);
		}
		for (/**/; i < anInt9526; i++)
			IDirect3DDevice.LightEnable(aLong11572, i + 2, false);
	}

	void method14986() {
		if (aBool9597) {
			int i = (aBoolArray11589[anInt9525] ? method18088(aClass374Array9536[anInt9525]) : 1);
			IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, 1, i);
		}
	}

	void method3350(int i, int i_226_) throws Exception_Sub1 {
		if (aBool11587) {
			if (!method18102(aClass171_Sub1_2073.method2728(), aClass171_Sub1_2073.method2729()))
				return;
			((Class171_Sub1_Sub1_Sub1) aClass171_Sub1_2073).method347();
		} else
			IDirect3DDevice.EndScene(aLong11572);
		int i_227_ = aClass171_Sub1_2073.method14726();
		if (Class276.method5144(i_227_)) {
			aBool11587 = true;
			aClass171_Sub1_2073.method129();
		} else {
			IDirect3DDevice.BeginScene(aLong11572);
			if (anInterface24_2085 != null)
				anInterface24_2085.method19((byte) -20);
		}
	}

	final void method18123(Class416 class416) {
		IDirect3DDevice.SetTexture(aLong11572, anInt9525, class416.method6642());
		if (aBool9597 && !aBoolArray11589[anInt9525]) {
			aBoolArray11589[anInt9525] = true;
			method15039();
			method14986();
		}
	}

	final void method18124(Class416_Sub1 class416_sub1) {
		method18086(class416_sub1);
		if (aBoolArray11581[anInt9525] != class416_sub1.aBool10175) {
			IDirect3DDevice.SetSamplerState(aLong11572, anInt9525, 1, class416_sub1.aBool10175 ? 1 : 3);
			aBoolArray11581[anInt9525] = class416_sub1.aBool10175;
		}
		if (aBoolArray11596[anInt9525] != class416_sub1.aBool10176) {
			IDirect3DDevice.SetSamplerState(aLong11572, anInt9525, 2, class416_sub1.aBool10176 ? 1 : 3);
			aBoolArray11596[anInt9525] = class416_sub1.aBool10176;
		}
	}

	final void method18125(Class416_Sub1 class416_sub1) {
		method18086(class416_sub1);
		if (aBoolArray11581[anInt9525] != class416_sub1.aBool10175) {
			IDirect3DDevice.SetSamplerState(aLong11572, anInt9525, 1, class416_sub1.aBool10175 ? 1 : 3);
			aBoolArray11581[anInt9525] = class416_sub1.aBool10175;
		}
		if (aBoolArray11596[anInt9525] != class416_sub1.aBool10176) {
			IDirect3DDevice.SetSamplerState(aLong11572, anInt9525, 2, class416_sub1.aBool10176 ? 1 : 3);
			aBoolArray11596[anInt9525] = class416_sub1.aBool10176;
		}
	}

	final void method18126(Class416_Sub1 class416_sub1) {
		method18086(class416_sub1);
		if (aBoolArray11581[anInt9525] != class416_sub1.aBool10175) {
			IDirect3DDevice.SetSamplerState(aLong11572, anInt9525, 1, class416_sub1.aBool10175 ? 1 : 3);
			aBoolArray11581[anInt9525] = class416_sub1.aBool10175;
		}
		if (aBoolArray11596[anInt9525] != class416_sub1.aBool10176) {
			IDirect3DDevice.SetSamplerState(aLong11572, anInt9525, 2, class416_sub1.aBool10176 ? 1 : 3);
			aBoolArray11596[anInt9525] = class416_sub1.aBool10176;
		}
	}

	final void method18127(Class416_Sub1 class416_sub1) {
		method18086(class416_sub1);
		if (aBoolArray11581[anInt9525] != class416_sub1.aBool10175) {
			IDirect3DDevice.SetSamplerState(aLong11572, anInt9525, 1, class416_sub1.aBool10175 ? 1 : 3);
			aBoolArray11581[anInt9525] = class416_sub1.aBool10175;
		}
		if (aBoolArray11596[anInt9525] != class416_sub1.aBool10176) {
			IDirect3DDevice.SetSamplerState(aLong11572, anInt9525, 2, class416_sub1.aBool10176 ? 1 : 3);
			aBoolArray11596[anInt9525] = class416_sub1.aBool10176;
		}
	}

	void method15116() {
		IDirect3DDevice.SetScissorRect(aLong11572, anInt9504 + anInt9468, anInt9499 + anInt9486, anInt9603, anInt9487);
	}

	void method15300() {
		if (aLong11592 == 0L && aClass377Array9528[anInt9525] != Class377.aClass377_3923) {
			if (aClass377Array9528[anInt9525] == Class377.aClass377_3921)
				IDirect3DDevice.SetTransform(aLong11572, 16 + anInt9525, aClass427Array9527[anInt9525].method6769(aFloatArray11601));
			else
				IDirect3DDevice.SetTransform(aLong11572, 16 + anInt9525, aClass427Array9527[anInt9525].method6763(aFloatArray11601));
			int i = method18090(aClass377Array9528[anInt9525]);
			if (i != anIntArray11586[anInt9525]) {
				IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, 24, i);
				anIntArray11586[anInt9525] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, 24, 0);
			anIntArray11586[anInt9525] = 0;
		}
	}

	void method15192() {
		if (aLong11592 == 0L && aClass377Array9528[anInt9525] != Class377.aClass377_3923) {
			if (aClass377Array9528[anInt9525] == Class377.aClass377_3921)
				IDirect3DDevice.SetTransform(aLong11572, 16 + anInt9525, aClass427Array9527[anInt9525].method6769(aFloatArray11601));
			else
				IDirect3DDevice.SetTransform(aLong11572, 16 + anInt9525, aClass427Array9527[anInt9525].method6763(aFloatArray11601));
			int i = method18090(aClass377Array9528[anInt9525]);
			if (i != anIntArray11586[anInt9525]) {
				IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, 24, i);
				anIntArray11586[anInt9525] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, 24, 0);
			anIntArray11586[anInt9525] = 0;
		}
	}

	void method15004() {
		if (aLong11592 == 0L && aClass377Array9528[anInt9525] != Class377.aClass377_3923) {
			if (aClass377Array9528[anInt9525] == Class377.aClass377_3921)
				IDirect3DDevice.SetTransform(aLong11572, 16 + anInt9525, aClass427Array9527[anInt9525].method6769(aFloatArray11601));
			else
				IDirect3DDevice.SetTransform(aLong11572, 16 + anInt9525, aClass427Array9527[anInt9525].method6763(aFloatArray11601));
			int i = method18090(aClass377Array9528[anInt9525]);
			if (i != anIntArray11586[anInt9525]) {
				IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, 24, i);
				anIntArray11586[anInt9525] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState(aLong11572, anInt9525, 24, 0);
			anIntArray11586[anInt9525] = 0;
		}
	}

	final void method15303() {
		if (aBool9597)
			IDirect3DDevice.SetRenderState(aLong11572, 60, anInt9531);
	}

	final void method15095() {
		if (aBool9597)
			IDirect3DDevice.SetRenderState(aLong11572, 60, anInt9531);
	}

	public void method3121(int i, int i_228_, int i_229_) {
		if (aLong11594 == 0L)
			method18081(i_228_, i_229_);
		long l = IDirect3DDevice.GetRenderTarget(aLong11572, 0);
		if (!Class276.method5144(IDirect3DDevice.StretchRect(aLong11572, l, 0, 0, aClass171_2080.method2728(), aClass171_2080.method2729(), aLong11594, anInt2083 * -1964562579, anInt2068 * 960890533, anInt2088 * -731510031, anInt2089 * 351158293, 2))) {
			/* empty */
		}
		IUnknown.Release(l);
		IDirect3DDevice.GetRenderTargetData(aLong11572, aLong11594, aLongArray11598[anInt11611]);
		long l_230_ = IDirect3DDevice.CreateEventQuery(aLong11572);
		if (Class276.method5145(IDirect3DEventQuery.Issue(l_230_)))
			aLongArray11602[anInt11611] = l_230_;
		anIntArray11609[anInt11611] = i;
		if (++anInt11611 >= 3)
			anInt11611 = 0;
	}

	Interface35 method15005(Class157 class157, int i, int i_231_, int i_232_, boolean bool, byte[] is) {
		return new Class416_Sub2(this, class157, i, i_231_, i_232_, bool, is);
	}

	static final int method18128(Class377 class377) {
		switch (class377.anInt3925) {
		case 4:
			return 3;
		case 3:
			return 256;
		case 5:
			return 4;
		case 0:
			return 1;
		case 1:
			return 2;
		default:
			return 0;
		}
	}

	void method18129() {
		IDirect3DDevice.SetRenderState(aLong11572, 22, anInt9572);
	}

	void method18130() {
		IDirect3DDevice.SetRenderState(aLong11572, 22, anInt9572);
	}

	void method18131() {
		IDirect3DDevice.SetRenderState(aLong11572, 22, anInt9572);
	}

	byte[] method18132(String string) {
		return method14895("dx", string);
	}

	void method15032() {
		method15044();
		method14956();
	}

	byte[] method18133(String string) {
		return method14895("dx", string);
	}

	Interface38 method15189(Class157 class157, Class184 class184, int i, int i_233_) {
		return new Class416_Sub1(this, class157, class184, i, i_233_);
	}

	static final int method18134(Class184 class184) {
		if (class184 == Class184.aClass184_2110)
			return 80;
		if (class184 == Class184.aClass184_2106)
			return 77;
		throw new IllegalArgumentException("");
	}

	static final int method18135(Class184 class184) {
		if (class184 == Class184.aClass184_2110)
			return 80;
		if (class184 == Class184.aClass184_2106)
			return 77;
		throw new IllegalArgumentException("");
	}

	static final int method18136(Class184 class184) {
		if (class184 == Class184.aClass184_2110)
			return 80;
		if (class184 == Class184.aClass184_2106)
			return 77;
		throw new IllegalArgumentException("");
	}

	static final int method18137(Class184 class184) {
		if (class184 == Class184.aClass184_2110)
			return 80;
		if (class184 == Class184.aClass184_2106)
			return 77;
		throw new IllegalArgumentException("");
	}

	static final int method18138(Class364 class364) {
		switch (class364.anInt3859) {
		case 1:
			return 5;
		case 0:
			return 4;
		case 4:
			return 3;
		case 5:
			return 6;
		case 3:
			return 2;
		case 2:
			return 1;
		default:
			throw new IllegalArgumentException("");
		}
	}

	static final int method18139(Class364 class364) {
		switch (class364.anInt3859) {
		case 1:
			return 5;
		case 0:
			return 4;
		case 4:
			return 3;
		case 5:
			return 6;
		case 3:
			return 2;
		case 2:
			return 1;
		default:
			throw new IllegalArgumentException("");
		}
	}

	static boolean method18140(int i, int i_234_, long l, int i_235_, D3DDISPLAYMODE d3ddisplaymode, D3DPRESENT_PARAMETERS d3dpresent_parameters) {
		int i_236_ = 0;
		int i_237_ = 0;
		int i_238_ = 0;
		boolean bool;
		try {
			if (Class276.method5144(IDirect3D.GetAdapterDisplayMode(l, i, d3ddisplaymode)))
				return false;
			while_45_: for (/**/; i_235_ >= 0; i_235_--) {
				if (i_235_ != 1) {
					i_238_ = 0 + i_235_;
					for (int i_239_ = 0; i_239_ < anIntArray11582.length; i_239_++) {
						if (IDirect3D.CheckDeviceType(l, i, i_234_, d3ddisplaymode.Format, anIntArray11582[i_239_], true) == 0 && IDirect3D.CheckDeviceFormat(l, i, i_234_, (d3ddisplaymode.Format), 1, 1, (anIntArray11582[i_239_])) == 0 && (i_235_ == 0 || (IDirect3D.CheckDeviceMultiSampleType(l, i, i_234_, anIntArray11582[i_239_], true, i_238_)) == 0)) {
							for (int i_240_ = 0; i_240_ < anIntArray11612.length; i_240_++) {
								if ((IDirect3D.CheckDeviceFormat(l, i, i_234_, d3ddisplaymode.Format, 2, 1, anIntArray11612[i_240_])) == 0 && (IDirect3D.CheckDepthStencilMatch(l, i, i_234_, d3ddisplaymode.Format, anIntArray11582[i_239_], anIntArray11612[i_240_])) == 0 && (i_235_ == 0 || (IDirect3D.CheckDeviceMultiSampleType(l, i, i_234_, anIntArray11612[i_239_], true, i_238_)) == 0)) {
									i_237_ = anIntArray11582[i_239_];
									i_236_ = anIntArray11612[i_240_];
									break while_45_;
								}
							}
						}
					}
				}
			}
			if (i_235_ < 0 || i_237_ == 0 || i_236_ == 0)
				return false;
			d3dpresent_parameters.BackBufferFormat = i_237_;
			d3dpresent_parameters.AutoDepthStencilFormat = i_236_;
			d3dpresent_parameters.MultiSampleType = i_238_;
			d3dpresent_parameters.MultiSampleQuality = 0;
			bool = true;
		} catch (Throwable throwable) {
			return false;
		}
		return bool;
	}

	static boolean method18141(int i, int i_241_, long l, int i_242_, D3DDISPLAYMODE d3ddisplaymode, D3DPRESENT_PARAMETERS d3dpresent_parameters) {
		int i_243_ = 0;
		int i_244_ = 0;
		int i_245_ = 0;
		boolean bool;
		try {
			if (Class276.method5144(IDirect3D.GetAdapterDisplayMode(l, i, d3ddisplaymode)))
				return false;
			while_46_: for (/**/; i_242_ >= 0; i_242_--) {
				if (i_242_ != 1) {
					i_245_ = 0 + i_242_;
					for (int i_246_ = 0; i_246_ < anIntArray11582.length; i_246_++) {
						if (IDirect3D.CheckDeviceType(l, i, i_241_, d3ddisplaymode.Format, anIntArray11582[i_246_], true) == 0 && IDirect3D.CheckDeviceFormat(l, i, i_241_, (d3ddisplaymode.Format), 1, 1, (anIntArray11582[i_246_])) == 0 && (i_242_ == 0 || (IDirect3D.CheckDeviceMultiSampleType(l, i, i_241_, anIntArray11582[i_246_], true, i_245_)) == 0)) {
							for (int i_247_ = 0; i_247_ < anIntArray11612.length; i_247_++) {
								if ((IDirect3D.CheckDeviceFormat(l, i, i_241_, d3ddisplaymode.Format, 2, 1, anIntArray11612[i_247_])) == 0 && (IDirect3D.CheckDepthStencilMatch(l, i, i_241_, d3ddisplaymode.Format, anIntArray11582[i_246_], anIntArray11612[i_247_])) == 0 && (i_242_ == 0 || (IDirect3D.CheckDeviceMultiSampleType(l, i, i_241_, anIntArray11612[i_246_], true, i_245_)) == 0)) {
									i_244_ = anIntArray11582[i_246_];
									i_243_ = anIntArray11612[i_247_];
									break while_46_;
								}
							}
						}
					}
				}
			}
			if (i_242_ < 0 || i_244_ == 0 || i_243_ == 0)
				return false;
			d3dpresent_parameters.BackBufferFormat = i_244_;
			d3dpresent_parameters.AutoDepthStencilFormat = i_243_;
			d3dpresent_parameters.MultiSampleType = i_245_;
			d3dpresent_parameters.MultiSampleQuality = 0;
			bool = true;
		} catch (Throwable throwable) {
			return false;
		}
		return bool;
	}

	static Class180 method18142(Canvas canvas, Class181 class181, Interface24 interface24, Interface48 interface48, Interface46 interface46, Interface49 interface49, Class459 class459, Integer integer) {
		Class180_Sub2_Sub2 class180_sub2_sub2 = null;
		Class180_Sub2_Sub2 class180_sub2_sub2_248_;
		try {
			int i = 0;
			int i_249_ = 1;
			long l = IDirect3D.Direct3DCreate();
			D3DCAPS d3dcaps = new D3DCAPS();
			IDirect3D.GetDeviceCaps(l, i, i_249_, d3dcaps);
			if ((d3dcaps.RasterCaps & 0x1000000) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxSimultaneousTextures < 2)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x8) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x40) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x200) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
				throw new RuntimeException("");
			if (d3dcaps.MaxStreams < 5)
				throw new RuntimeException("");
			D3DPRESENT_PARAMETERS d3dpresent_parameters = new D3DPRESENT_PARAMETERS(canvas);
			d3dpresent_parameters.Windowed = true;
			d3dpresent_parameters.EnableAutoDepthStencil = true;
			d3dpresent_parameters.BackBufferWidth = canvas.getWidth();
			d3dpresent_parameters.BackBufferHeight = canvas.getHeight();
			d3dpresent_parameters.BackBufferCount = 1;
			d3dpresent_parameters.PresentationInterval = -2147483648;
			D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
			if (!method18094(i, i_249_, l, integer.intValue(), d3ddisplaymode, d3dpresent_parameters))
				throw new RuntimeException("");
			int i_250_ = 0;
			if ((d3dcaps.DevCaps & 0x100000) != 0)
				i_250_ |= 0x10;
			long l_251_ = 0L;
			try {
				l_251_ = IDirect3D.CreateDeviceContext(l, i, i_249_, canvas, i_250_ | 0x40, d3dpresent_parameters);
			} catch (RuntimeException_Sub5 runtimeexception_sub5) {
				l_251_ = IDirect3D.CreateDeviceContext(l, i, i_249_, canvas, i_250_ & ~0x100000 | 0x20, d3dpresent_parameters);
			}
			class180_sub2_sub2 = new Class180_Sub2_Sub2(i, i_249_, l, l_251_, d3ddisplaymode, d3dpresent_parameters, d3dcaps, class181, interface24, interface48, interface46, interface49, class459, integer.intValue());
			if (!class180_sub2_sub2.aHashtable2082.containsKey(canvas)) {
				Class552.method9150(canvas, -913012812);
				class180_sub2_sub2.method3102(canvas, new Class171_Sub1_Sub1_Sub1(class180_sub2_sub2, canvas, canvas.getWidth(), canvas.getHeight(), true), -158912915);
			}
			class180_sub2_sub2.method3104(canvas, 673954373);
			class180_sub2_sub2.method14899();
			class180_sub2_sub2_248_ = class180_sub2_sub2;
		} catch (RuntimeException runtimeexception) {
			if (class180_sub2_sub2 != null)
				class180_sub2_sub2.method3082();
			throw runtimeexception;
		}
		return class180_sub2_sub2_248_;
	}

	void method14963() {
		if (aBool9597) {
			D3DLIGHT.SetDirection(aLong11577, -aFloatArray9507[0], -aFloatArray9507[1], -aFloatArray9507[2]);
			D3DLIGHT.SetDirection(aLong11583, -aFloatArray9519[0], -aFloatArray9519[1], -aFloatArray9519[2]);
			aBool11580 = false;
		}
	}

	void method15305() {
		aFloat9565 = aFloat9485 - (float) anInt9589;
		aFloat9517 = aFloat9565 - (float) anInt9562;
		if (aFloat9517 < aFloat9484)
			aFloat9517 = aFloat9484;
		if (aBool9597) {
			IDirect3DDevice.method15865(aLong11572, 36, aFloat9517);
			IDirect3DDevice.method15865(aLong11572, 37, aFloat9565);
			IDirect3DDevice.SetRenderState(aLong11572, 34, anInt9561);
		}
	}
}
