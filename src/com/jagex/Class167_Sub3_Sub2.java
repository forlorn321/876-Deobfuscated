/* Class167_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

import jagdx.Class284;
import jagdx.Class366;
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

public class Class167_Sub3_Sub2 extends Class167_Sub3 {
	long aLong11538;
	int anInt11539;
	long aLong11540 = 0L;
	long[] aLongArray11541;
	D3DCAPS aD3DCAPS11542;
	D3DDISPLAYMODE aD3DDISPLAYMODE11543;
	Class708 aClass708_11544;
	boolean aBool11545;
	boolean aBool11546;
	long[] aLongArray11547;
	long aLong11548;
	boolean aBool11549;
	boolean aBool11550;
	boolean[] aBoolArray11551;
	boolean[] aBoolArray11552;
	boolean[] aBoolArray11553;
	Class342[] aClass342Array11554;
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS11555;
	Class443 aClass443_11556;
	Class285_Sub1 aClass285_Sub1_11557;
	long aLong11558;
	int anInt11559;
	boolean aBool11560;
	boolean aBool11561;
	boolean aBool11562;
	boolean aBool11563;
	boolean aBool11564;
	int[] anIntArray11565;
	boolean aBool11566;
	boolean aBool11567;
	boolean aBool11568;
	int anInt11569;
	float[] aFloatArray11570;
	long aLong11571;
	int anInt11572;
	long aLong11573 = 0L;
	static final int anInt11574 = 3;
	long aLong11575;
	long[] aLongArray11576;
	boolean[] aBoolArray11577;
	int[] anIntArray11578;
	int anInt11579;
	int anInt11580;
	static int[] anIntArray11581 = { 77, 80 };
	static int[] anIntArray11582 = { 22, 23 };

	Interface44 method8779(Class155 class155, Class171 class171, int i, int i_0_) {
		return new Class408_Sub2_Sub1(this, class155, class171, i, i_0_);
	}

	public boolean method8710() {
		return (aD3DCAPS11542.PixelShaderVersion & 0xffff) >= 257;
	}

	public boolean method8948(boolean bool) {
		if (bool)
			return aBool11567;
		return aBool11567 && aBool11568;
	}

	static GraphicalRenderer method10605(Canvas canvas, Class174 class174, Interface24 interface24, Interface47 interface47, Interface48 interface48, Interface46 interface46, JS5ResourceProvider class461, Integer integer) {
		Class167_Sub3_Sub2 class167_sub3_sub2 = null;
		Class167_Sub3_Sub2 class167_sub3_sub2_1_;
		try {
			int i = 0;
			int i_2_ = 1;
			long l = IDirect3D.Direct3DCreate();
			D3DCAPS d3dcaps = new D3DCAPS();
			IDirect3D.GetDeviceCaps(l, i, i_2_, d3dcaps);
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
			if (!method10625(i, i_2_, l, integer.intValue(), d3ddisplaymode, d3dpresent_parameters))
				throw new RuntimeException("");
			int i_3_ = 0;
			if ((d3dcaps.DevCaps & 0x100000) != 0)
				i_3_ |= 0x10;
			long l_4_ = 0L;
			try {
				l_4_ = IDirect3D.CreateDeviceContext(l, i, i_2_, canvas, i_3_ | 0x40, d3dpresent_parameters);
			} catch (RuntimeException_Sub5 runtimeexception_sub5) {
				l_4_ = IDirect3D.CreateDeviceContext(l, i, i_2_, canvas, i_3_ & ~0x100000 | 0x20, d3dpresent_parameters);
			}
			class167_sub3_sub2 = new Class167_Sub3_Sub2(i, i_2_, l, l_4_, d3ddisplaymode, d3dpresent_parameters, d3dcaps, class174, interface24, interface47, interface48, interface46, class461, integer.intValue());
			if (!class167_sub3_sub2.aHashtable1859.containsKey(canvas)) {
				Class166.method1999(canvas, -1411037171);
				class167_sub3_sub2.method2331(canvas, new Class183_Sub1_Sub1_Sub1(class167_sub3_sub2, canvas, canvas.getWidth(), canvas.getHeight(), true), 2024498147);
			}
			class167_sub3_sub2.method2026(canvas, -1112243126);
			class167_sub3_sub2.method8716();
			class167_sub3_sub2_1_ = class167_sub3_sub2;
		} catch (RuntimeException runtimeexception) {
			if (class167_sub3_sub2 != null)
				class167_sub3_sub2.method2072();
			throw runtimeexception;
		}
		return class167_sub3_sub2_1_;
	}

	byte[] method10606(String string) {
		return method8830("dx", string);
	}

	void method8720() {
		for (ObjectParam class536_sub13 = (ObjectParam) aClass708_11544.method8308(1867269829); class536_sub13 != null; class536_sub13 = (ObjectParam) aClass708_11544.method8311(2011747202)) {
			Interface52 interface52 = (Interface52) class536_sub13.value;
			interface52.method353();
			if (interface52 == aClass183_1849)
				interface52.method352();
		}
		super.method8720();
	}

	public Interface21 method2337(int i, int i_5_, int i_6_) {
		return new Class421(this, Class171.aClass171_1895, i, i_5_, i_6_);
	}

	boolean method10607(int i, int i_7_) {
		int i_8_ = IDirect3DDevice.TestCooperativeLevel(aLong11573);
		if (i_8_ == 0 || i_8_ == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(aLong11573, 0L);
			for (int i_9_ = 1; i_9_ < 4; i_9_++)
				IDirect3DDevice.SetRenderTarget(aLong11573, i_9_, 0L);
			for (int i_10_ = 0; i_10_ < 4; i_10_++)
				IDirect3DDevice.SetStreamSource(aLong11573, i_10_, 0L, 0, 0);
			for (int i_11_ = 0; i_11_ < 4; i_11_++)
				IDirect3DDevice.SetTexture(aLong11573, i_11_, 0L);
			IDirect3DDevice.SetIndices(aLong11573, 0L);
			method8719();
			aD3DPRESENT_PARAMETERS11555.BackBufferWidth = i;
			aD3DPRESENT_PARAMETERS11555.BackBufferHeight = i_7_;
			aD3DPRESENT_PARAMETERS11555.BackBufferCount = 1;
			if (method10625(anInt11559, anInt11539, aLong11540, anInt9568, aD3DDISPLAYMODE11543, aD3DPRESENT_PARAMETERS11555)) {
				int i_12_ = IDirect3DDevice.Reset(aLong11573, aD3DPRESENT_PARAMETERS11555);
				if (Class284.method3779(i_12_)) {
					aBool11545 = false;
					method8720();
					method8717();
					return true;
				}
			}
		}
		return false;
	}

	public void method2190(long l) {
		/* empty */
	}

	public Class145 method2001() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(aLong11540, anInt11559, 0, d3dadapter_identifier);
		return new Class145(d3dadapter_identifier.VendorID, method8916() ? "Direct3D FF" : "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion, method8916());
	}

	void method2003(int i, int i_13_) throws Exception_Sub5 {
		if (aBool11545) {
			if (!method10607(aClass183_Sub1_1866.method2725(), aClass183_Sub1_1866.method2726()))
				return;
			((Class183_Sub1_Sub1_Sub1) aClass183_Sub1_1866).method353();
		} else
			IDirect3DDevice.EndScene(aLong11573);
		int i_14_ = aClass183_Sub1_1866.method8650();
		if (Class284.method3778(i_14_)) {
			aBool11545 = true;
			aClass183_Sub1_1866.method131();
		} else {
			IDirect3DDevice.BeginScene(aLong11573);
			if (anInterface24_1851 != null)
				anInterface24_1851.method29(-927830804);
		}
	}

	public void method2004() {
		long l = IDirect3DDevice.CreateEventQuery(aLong11573);
		if (Class284.method3779(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	void method2072() {
		super.method2072();
		if (aLong11538 != 0L) {
			D3DLIGHT.Destroy(aLong11538);
			aLong11538 = 0L;
		}
		if (aLong11571 != 0L) {
			D3DLIGHT.Destroy(aLong11571);
			aLong11571 = 0L;
		}
		if (aLong11548 != 0L) {
			D3DLIGHT.Destroy(aLong11548);
			aLong11548 = 0L;
		}
		if (aLong11573 != 0L) {
			IDirect3DDevice.Destroy(aLong11573);
			aLong11573 = 0L;
		}
		if (aLong11540 != 0L) {
			IUnknown.Release(aLong11540);
			aLong11540 = 0L;
		}
	}

	public Class176 method2293(Class176 class176, Class176 class176_15_, float f, Class176 class176_16_) {
		return f < 0.5F ? class176 : class176_15_;
	}

	public float method8725() {
		return -0.5F;
	}

	public Class183_Sub2 method2304() {
		return new Class183_Sub2_Sub2_Sub2(this);
	}

	Class183_Sub1 method2131(Canvas canvas, int i, int i_17_) {
		return new Class183_Sub1_Sub1_Sub1(this, canvas, i, i_17_, false);
	}

	public Interface22 method2032(int i, int i_18_, Class155 class155, Class171 class171, int i_19_) {
		return new Class423(this, class155, class171, i, i_18_, i_19_);
	}

	final Interface41 method8959(boolean bool) {
		return new Class415(this, Class171.aClass171_1899, bool);
	}

	public Interface21 method2229(int i, int i_20_, int i_21_) {
		return new Class421(this, Class171.aClass171_1895, i, i_20_, i_21_);
	}

	public boolean method2176() {
		return true;
	}

	void method10608(Interface52 interface52) {
		if (method10623(interface52) == null)
			aClass708_11544.method8335(new ObjectParam(interface52), 868732479);
	}

	final void method8727(int i, Class379 class379, boolean bool, boolean bool_22_) {
		if (aBool9704) {
			int i_23_ = 0;
			int i_24_;
			switch (i) {
			case 2:
				i_24_ = 26;
				break;
			default:
				i_24_ = 2;
				break;
			case 1:
				i_24_ = 3;
			}
			if (bool)
				i_23_ |= 0x20;
			if (bool_22_)
				i_23_ |= 0x10;
			IDirect3DDevice.SetTextureStageState(aLong11573, anInt9636, i_24_, (method10614(class379) | i_23_));
		}
	}

	public int[] getPixelArea(int i, int i_25_, int i_26_, int i_27_) {
		method2084();
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(aLong11573, 0);
		long l_28_ = IDirect3DDevice.CreateRenderTarget(aLong11573, i_26_, i_27_, 21, 0, 0, true);
		int i_29_ = IDirect3DDevice.StretchRect(aLong11573, l, i, i_25_, i_26_, i_27_, l_28_, 0, 0, i_26_, i_27_, 1);
		method8713(i_26_ * i_27_ * 4);
		if (Class284.method3779(i_29_)) {
			is = new int[i_26_ * i_27_];
			IDirect3DSurface.Download(l_28_, 0, 0, i_26_, i_27_, i_26_ * 4, 16, aLong9586);
			aByteBuffer9549.clear();
			aByteBuffer9549.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_28_);
		return is;
	}

	public void method2034() {
		/* empty */
	}

	public boolean method2284() {
		return true;
	}

	public final void method8815(Class377 class377, int i, int i_30_) {
		if (aClass285_Sub1_11557 != null)
			aClass285_Sub1_11557.method9120();
		IDirect3DDevice.DrawPrimitive(aLong11573, method10626(class377), i, i_30_);
	}

	public boolean method2036() {
		if (aBool11545)
			return false;
		if (aLongArray11547[anInt11580] != 0L)
			return false;
		return true;
	}

	public boolean method2038() {
		return false;
	}

	final void method8970(Interface41 interface41, Class377 class377, int i, int i_31_, int i_32_, int i_33_) {
		if (aClass285_Sub1_11557 != null)
			aClass285_Sub1_11557.method9120();
		IDirect3DDevice.DrawIndexedPrimitiveIB(aLong11573, (((Class415) interface41).aLong4532), 4, 0, i, i_31_, i_32_, i_33_);
	}

	public int method2149() {
		if (aLongArray11547[anInt11579] == 0L)
			return -1;
		return ((Class284.method3779(IDirect3DEventQuery.IsSignaled(aLongArray11547[anInt11579]))) ? anIntArray11578[anInt11579] : -1);
	}

	public void method2040() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray11547[i] != 0L) {
				IUnknown.Release(aLongArray11547[i]);
				aLongArray11547[i] = 0L;
			}
		}
		anInt11580 = 0;
		anInt11579 = 0;
	}

	Interface34 method8934(Class155 class155, int i, int i_34_, int i_35_, boolean bool, byte[] is) {
		return new Class408_Sub3(this, class155, i, i_34_, i_35_, bool, is);
	}

	public void method2044(int i, int i_36_, int[] is, int[] is_37_) {
		method10609(i, i_36_, is, is_37_);
	}

	long method10609(int i, int i_38_, int[] is, int[] is_39_) {
		if (aLongArray11547[anInt11579] != 0L) {
			IUnknown.Release(aLongArray11547[anInt11579]);
			aLongArray11547[anInt11579] = 0L;
		}
		aByteBuffer9549.clear();
		IDirect3DSurface.Download(aLongArray11541[anInt11579], 0, 0, i, i_38_, i * 4, 0, aLong9586);
		if (++anInt11579 >= 3)
			anInt11579 = 0;
		if (is != null) {
			aByteBuffer9549.asIntBuffer().get(is);
			return 0L;
		}
		return aLong9586;
	}

	public void method2043(long l) {
		/* empty */
	}

	public void method2393() {
		if (aLong11575 != 0L) {
			IUnknown.Release(aLong11575);
			aLong11575 = 0L;
		}
		for (int i = 0; i < 3; i++) {
			if (aLongArray11547[i] != 0L) {
				IUnknown.Release(aLongArray11547[i]);
				aLongArray11547[i] = 0L;
			}
			if (aLongArray11541[i] != 0L) {
				IUnknown.Release(aLongArray11541[i]);
				aLongArray11541[i] = 0L;
			}
		}
		anInt11580 = 0;
		anInt11579 = 0;
	}

	public Class176 method2112(Class176 class176, Class176 class176_40_, float f, Class176 class176_41_) {
		return f < 0.5F ? class176 : class176_40_;
	}

	public void method2000(int i, int i_42_) {
		IDirect3DDevice.Clear(aLong11573, i, i_42_, 1.0F, 0);
	}

	void method8741() {
		if (aClass183_1849 != null)
			IDirect3DDevice.SetViewport(aLong11573, anInt9609 + anInt9618, anInt9610 + anInt9547, anInt9607, anInt9608, aFloat9591, aFloat9592);
	}

	public long method2042(int i, int i_43_) {
		return method10609(i, i_43_, null, null);
	}

	void method8945() {
		IDirect3DDevice.method9304(aLong11573, 174, aBool9715);
	}

	final void method10610(long l) {
		aLong11558 = l;
		IDirect3DDevice.SetVertexShader(aLong11573, l);
	}

	void method8912() {
		if (aBool9704) {
			D3DLIGHT.SetDirection(aLong11538, -aFloatArray9542[0], -aFloatArray9542[1], -aFloatArray9542[2]);
			D3DLIGHT.SetDirection(aLong11571, -aFloatArray9619[0], -aFloatArray9619[1], -aFloatArray9619[2]);
			aBool11549 = false;
		}
	}

	public Class183_Sub2 method2058() {
		return new Class183_Sub2_Sub2_Sub2(this);
	}

	final void method8856() {
		if (aBool9704)
			IDirect3DDevice.SetRenderState(aLong11573, 60, anInt9642);
	}

	void method8761() {
		IDirect3DDevice.method9304(aLong11573, 7, aBool9613 && aBool9614);
	}

	void method8722() {
		IDirect3DDevice.method9304(aLong11573, 14, aBool9611 && aBool9653);
	}

	void method8764() {
		if (aBool9704)
			IDirect3DDevice.method9304(aLong11573, 137, aBool9700 && !aBool9617);
	}

	void method8765() {
		if (aBool9704) {
			D3DLIGHT.SetAmbient(aLong11538, aFloat9678 * aFloat9626, aFloat9649 * aFloat9626, aFloat9701 * aFloat9626, 0.0F);
			aBool11549 = false;
		}
	}

	void method8822() {
		if (aBool9704) {
			float f = aBool9616 ? aFloat9573 : 0.0F;
			float f_44_ = aBool9616 ? -aFloat9579 : 0.0F;
			D3DLIGHT.SetDiffuse(aLong11538, f * aFloat9678, f * aFloat9649, f * aFloat9701, 0.0F);
			D3DLIGHT.SetDiffuse(aLong11571, f_44_ * aFloat9678, f_44_ * aFloat9649, f_44_ * aFloat9701, 0.0F);
			aBool11549 = false;
		}
	}

	void method8947() {
		if (aBool9704) {
			D3DLIGHT.SetDirection(aLong11538, -aFloatArray9542[0], -aFloatArray9542[1], -aFloatArray9542[2]);
			D3DLIGHT.SetDirection(aLong11571, -aFloatArray9619[0], -aFloatArray9619[1], -aFloatArray9619[2]);
			aBool11549 = false;
		}
	}

	void method8975() {
		method8822();
		method8766();
	}

	void method8766() {
		if (aBool9704 && !aBool11549) {
			IDirect3DDevice.LightEnable(aLong11573, 0, false);
			IDirect3DDevice.LightEnable(aLong11573, 1, false);
			IDirect3DDevice.SetLight(aLong11573, 0, aLong11538);
			IDirect3DDevice.SetLight(aLong11573, 1, aLong11571);
			IDirect3DDevice.LightEnable(aLong11573, 0, true);
			IDirect3DDevice.LightEnable(aLong11573, 1, true);
			aBool11549 = true;
		}
	}

	void method8984() {
		int i;
		for (i = 0; i < anInt9601; i++) {
			Class536_Sub19 class536_sub19 = aClass536_Sub19Array9534[i];
			int i_45_ = i + 2;
			int i_46_ = class536_sub19.method9528(267426267);
			float f = class536_sub19.method9531(883172751) / 255.0F;
			D3DLIGHT.SetPosition(aLong11548, (float) class536_sub19.method9548(-351220384), (float) class536_sub19.method9549(241540535), (float) class536_sub19.method9551((byte) 0));
			D3DLIGHT.SetDiffuse(aLong11548, (float) (i_46_ >> 16 & 0xff) * f, (float) (i_46_ >> 8 & 0xff) * f, (float) (i_46_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(aLong11548, 0.0F, 0.0F, 1.0F / (float) (class536_sub19.method9530(-43803058) * class536_sub19.method9530(-504076971)));
			D3DLIGHT.SetRange(aLong11548, (float) class536_sub19.method9530(-241199866));
			IDirect3DDevice.SetLight(aLong11573, i_45_, aLong11548);
			IDirect3DDevice.LightEnable(aLong11573, i_45_, true);
		}
		for (/**/; i < anInt9630; i++)
			IDirect3DDevice.LightEnable(aLong11573, i + 2, false);
	}

	public Interface21 method2079(int i, int i_47_, int i_48_) {
		return new Class421(this, Class171.aClass171_1895, i, i_47_, i_48_);
	}

	void method2136(int i, int i_49_) throws Exception_Sub5 {
		if (aBool11545) {
			if (!method10607(aClass183_Sub1_1866.method2725(), aClass183_Sub1_1866.method2726()))
				return;
			((Class183_Sub1_Sub1_Sub1) aClass183_Sub1_1866).method353();
		} else
			IDirect3DDevice.EndScene(aLong11573);
		int i_50_ = aClass183_Sub1_1866.method8650();
		if (Class284.method3778(i_50_)) {
			aBool11545 = true;
			aClass183_Sub1_1866.method131();
		} else {
			IDirect3DDevice.BeginScene(aLong11573);
			if (anInterface24_1851 != null)
				anInterface24_1851.method29(-768450386);
		}
	}

	Interface36 method8774(Class155 class155, Class171 class171, int i, int i_51_) {
		return new Class408_Sub2(this, class155, class171, i, i_51_);
	}

	Interface36 method8776(int i, int i_52_, boolean bool, int[] is, int i_53_, int i_54_) {
		return new Class408_Sub2(this, i, i_52_, bool, is, i_53_, i_54_);
	}

	Interface36 method8775(Class155 class155, int i, int i_55_, boolean bool, byte[] is, int i_56_, int i_57_) {
		return new Class408_Sub2(this, class155, i, i_55_, bool, is, i_56_, i_57_);
	}

	void method8728() {
		if (aBool9704) {
			int i = (aBoolArray11577[anInt9636] ? method10612(aClass371Array9640[anInt9636]) : 1);
			IDirect3DDevice.SetTextureStageState(aLong11573, anInt9636, 1, i);
		}
	}

	public final void method8817(Class377 class377, int i, int i_58_, int i_59_, int i_60_) {
		if (aClass285_Sub1_11557 != null)
			aClass285_Sub1_11557.method9120();
		IDirect3DDevice.DrawIndexedPrimitive(aLong11573, method10626(class377), 0, i, i_58_, i_59_, i_60_);
	}

	Interface39 method8777(int i, boolean bool, int[][] is) {
		return new Class408_Sub1(this, i, bool, is);
	}

	Interface34 method8870(Class155 class155, int i, int i_61_, int i_62_, boolean bool, byte[] is) {
		return new Class408_Sub3(this, class155, i, i_61_, i_62_, bool, is);
	}

	final void method10611(Class408 class408) {
		IDirect3DDevice.SetTexture(aLong11573, anInt9636, class408.method4958());
		if (aBool9704 && !aBoolArray11577[anInt9636]) {
			aBoolArray11577[anInt9636] = true;
			method8794();
			method8793();
		}
	}

	static final int method10612(Class371 class371) {
		switch (class371.anInt3885) {
		case 1:
			return 2;
		case 0:
			return 10;
		case 4:
			return 7;
		case 3:
			return 26;
		default:
			throw new IllegalArgumentException();
		case 2:
			return 4;
		}
	}

	final void method10613(Class408_Sub3 class408_sub3) {
		method10611(class408_sub3);
		if (!aBoolArray11552[anInt9636]) {
			IDirect3DDevice.SetSamplerState(aLong11573, anInt9636, 1, 1);
			aBoolArray11552[anInt9636] = true;
		}
		if (!aBoolArray11551[anInt9636]) {
			IDirect3DDevice.SetSamplerState(aLong11573, anInt9636, 2, 1);
			aBoolArray11551[anInt9636] = true;
		}
	}

	public void method8827() {
		if (aBoolArray11577[anInt9636]) {
			aBoolArray11577[anInt9636] = false;
			IDirect3DDevice.SetTexture(aLong11573, anInt9636, 0L);
			method8794();
			method8793();
		}
	}

	void method8792() {
		/* empty */
	}

	public Class286 method8868(String string) {
		byte[] is = method10606(string);
		if (is == null)
			return null;
		Class274 class274 = method8899(is);
		return new Class286_Sub1(this, class274);
	}

	void method8794() {
		if (aBool9704) {
			int i = (aBoolArray11577[anInt9636] ? method10612(aClass371Array9641[anInt9636]) : 1);
			IDirect3DDevice.SetTextureStageState(aLong11573, anInt9636, 4, i);
		}
	}

	final void method8944() {
		if (aBool9704)
			IDirect3DDevice.SetRenderState(aLong11573, 60, anInt9642);
	}

	void method8910() {
		if (aBool9704) {
			float f = aBool9616 ? aFloat9573 : 0.0F;
			float f_63_ = aBool9616 ? -aFloat9579 : 0.0F;
			D3DLIGHT.SetDiffuse(aLong11538, f * aFloat9678, f * aFloat9649, f * aFloat9701, 0.0F);
			D3DLIGHT.SetDiffuse(aLong11571, f_63_ * aFloat9678, f_63_ * aFloat9649, f_63_ * aFloat9701, 0.0F);
			aBool11549 = false;
		}
	}

	void method8717() {
		for (int i = 0; i < anInt9690; i++) {
			IDirect3DDevice.SetSamplerState(aLong11573, i, 7, 2);
			IDirect3DDevice.SetSamplerState(aLong11573, i, 6, 2);
			IDirect3DDevice.SetSamplerState(aLong11573, i, 5, 2);
			IDirect3DDevice.SetSamplerState(aLong11573, i, 1, 1);
			IDirect3DDevice.SetSamplerState(aLong11573, i, 2, 1);
			aClass342Array11554[i] = Class342.aClass342_3663;
			boolean[] bools = aBoolArray11552;
			int i_64_ = i;
			aBoolArray11551[i] = true;
			bools[i_64_] = true;
			aBoolArray11553[i] = false;
			anIntArray11565[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState(aLong11573, 0, 6, 1);
		IDirect3DDevice.SetRenderState(aLong11573, 9, 2);
		IDirect3DDevice.SetRenderState(aLong11573, 23, 4);
		IDirect3DDevice.SetRenderState(aLong11573, 25, 5);
		IDirect3DDevice.SetRenderState(aLong11573, 24, 0);
		IDirect3DDevice.method9304(aLong11573, 206, aBool9545);
		IDirect3DDevice.SetRenderState(aLong11573, 181, 0);
		method10616();
		IDirect3DDevice.SetRenderState(aLong11573, 147, 1);
		IDirect3DDevice.SetRenderState(aLong11573, 145, 1);
		IDirect3DDevice.method9303(aLong11573, 38, 0.95F);
		IDirect3DDevice.SetRenderState(aLong11573, 35, 3);
		IDirect3DDevice.method9303(aLong11573, 154, 1.0F);
		D3DLIGHT.SetType(aLong11538, 3);
		D3DLIGHT.SetType(aLong11571, 3);
		D3DLIGHT.SetType(aLong11548, 1);
		aBool11549 = false;
		super.method8717();
	}

	void method8963() {
		int i;
		for (i = 0; i < anInt9601; i++) {
			Class536_Sub19 class536_sub19 = aClass536_Sub19Array9534[i];
			int i_65_ = i + 2;
			int i_66_ = class536_sub19.method9528(213631645);
			float f = class536_sub19.method9531(1074637956) / 255.0F;
			D3DLIGHT.SetPosition(aLong11548, (float) class536_sub19.method9548(-409298152), (float) class536_sub19.method9549(150943646), (float) class536_sub19.method9551((byte) 0));
			D3DLIGHT.SetDiffuse(aLong11548, (float) (i_66_ >> 16 & 0xff) * f, (float) (i_66_ >> 8 & 0xff) * f, (float) (i_66_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(aLong11548, 0.0F, 0.0F, 1.0F / (float) (class536_sub19.method9530(2113127515) * class536_sub19.method9530(-720240304)));
			D3DLIGHT.SetRange(aLong11548, (float) class536_sub19.method9530(-1155982199));
			IDirect3DDevice.SetLight(aLong11573, i_65_, aLong11548);
			IDirect3DDevice.LightEnable(aLong11573, i_65_, true);
		}
		for (/**/; i < anInt9630; i++)
			IDirect3DDevice.LightEnable(aLong11573, i + 2, false);
	}

	static final int method10614(Class379 class379) {
		switch (class379.anInt3927) {
		case 1:
			return 3;
		case 2:
			return 0;
		case 0:
			return 2;
		default:
			throw new IllegalArgumentException();
		case 3:
			return 1;
		}
	}

	static final int method10615(Class367 class367) {
		switch (class367.anInt3865) {
		case 1:
			return 1;
		case 2:
			return 256;
		default:
			return 0;
		case 0:
			return 4;
		case 4:
			return 2;
		case 5:
			return 3;
		}
	}

	void method8734(int i) {
		IDirect3DDevice.SetRenderState(aLong11573, 168, i);
	}

	void method8787() {
		IDirect3DDevice.method9304(aLong11573, 15, aBool9703);
		IDirect3DDevice.SetRenderState(aLong11573, 24, aByte9688 & 0xff);
		if (aD3DPRESENT_PARAMETERS11555.MultiSampleType > 0) {
			if (!aBool9703 || aByte9688 == 0) {
				if (aBool11566 || aBool11564)
					IDirect3DDevice.SetRenderState(aLong11573, 181, 0);
				else if (aBool11550)
					IDirect3DDevice.method9303(aLong11573, 154, 1.0F);
			} else if (aBool11566)
				IDirect3DDevice.SetRenderState(aLong11573, 181, method8819('S', 'S', 'A', 'A'));
			else if (aBool11564)
				IDirect3DDevice.SetRenderState(aLong11573, 181, method8819('A', 'T', 'O', 'C'));
			else if (aBool11550)
				IDirect3DDevice.SetRenderState(aLong11573, 154, method8819('A', '2', 'M', '1'));
		}
	}

	void method8798() {
		IDirect3DDevice.method9304(aLong11573, 27, aBool9554);
	}

	void method10616() {
		IDirect3DDevice.SetRenderState(aLong11573, 22, anInt9615);
	}

	public void method8759(Class443 class443, Class443 class443_67_, Class443 class443_68_) {
		IDirect3DDevice.SetTransform(aLong11573, 256, class443.aFloatArray4878);
		IDirect3DDevice.SetTransform(aLong11573, 2, class443_67_.aFloatArray4878);
		IDirect3DDevice.SetTransform(aLong11573, 3, class443_68_.aFloatArray4878);
	}

	public void method8937() {
		if (aBoolArray11577[anInt9636]) {
			aBoolArray11577[anInt9636] = false;
			IDirect3DDevice.SetTexture(aLong11573, anInt9636, 0L);
			method8794();
			method8793();
		}
	}

	final void method10617(Class408_Sub2 class408_sub2) {
		method10611(class408_sub2);
		if (aBoolArray11552[anInt9636] != class408_sub2.aBool10125) {
			IDirect3DDevice.SetSamplerState(aLong11573, anInt9636, 1, class408_sub2.aBool10125 ? 1 : 3);
			aBoolArray11552[anInt9636] = class408_sub2.aBool10125;
		}
		if (aBoolArray11551[anInt9636] != class408_sub2.aBool10126) {
			IDirect3DDevice.SetSamplerState(aLong11573, anInt9636, 2, class408_sub2.aBool10126 ? 1 : 3);
			aBoolArray11551[anInt9636] = class408_sub2.aBool10126;
		}
	}

	final Interface41 method8804(boolean bool) {
		return new Class415(this, Class171.aClass171_1899, bool);
	}

	final Interface38 method8805(boolean bool) {
		return new Class413(this, bool);
	}

	Class343 method8806(Class362[] class362s) {
		return new Class343_Sub1(this, class362s);
	}

	final void method8791() {
		if (aBool9704)
			IDirect3DDevice.SetRenderState(aLong11573, 60, anInt9642);
	}

	public void method8808(int i, Interface38 interface38) {
		Class413 class413 = (Class413) interface38;
		IDirect3DDevice.SetStreamSource(aLong11573, i, class413.aLong4397, 0, class413.method5015());
	}

	void method8809(Interface41 interface41) {
		IDirect3DDevice.SetIndices(aLong11573, ((Class415) interface41).aLong4532);
	}

	void method8778() {
		if (aLong11558 == 0L && aClass367Array9639[anInt9636] != Class367.aClass367_3860) {
			if (aClass367Array9639[anInt9636] == Class367.aClass367_3861)
				IDirect3DDevice.SetTransform(aLong11573, 16 + anInt9636, aClass443Array9638[anInt9636].method5364(aFloatArray11570));
			else
				IDirect3DDevice.SetTransform(aLong11573, 16 + anInt9636, aClass443Array9638[anInt9636].method5377(aFloatArray11570));
			int i = method10615(aClass367Array9639[anInt9636]);
			if (i != anIntArray11565[anInt9636]) {
				IDirect3DDevice.SetTextureStageState(aLong11573, anInt9636, 24, i);
				anIntArray11565[anInt9636] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState(aLong11573, anInt9636, 24, 0);
			anIntArray11565[anInt9636] = 0;
		}
	}

	void method8840() {
		aFloat9676 = aFloat9596 - (float) anInt9644;
		aFloat9675 = aFloat9676 - (float) anInt9550;
		if (aFloat9675 < aFloat9631)
			aFloat9675 = aFloat9631;
		if (aBool9704) {
			IDirect3DDevice.method9303(aLong11573, 36, aFloat9675);
			IDirect3DDevice.method9303(aLong11573, 37, aFloat9676);
			IDirect3DDevice.SetRenderState(aLong11573, 34, anInt9672);
		}
	}

	Interface44 method8869(Class155 class155, Class171 class171, int i, int i_69_) {
		return new Class408_Sub2_Sub1(this, class155, class171, i, i_69_);
	}

	void method8981(boolean bool) {
		IDirect3DDevice.method9304(aLong11573, 161, bool);
	}

	public Class286 method8714(String string) {
		byte[] is = method10606(string);
		if (is == null)
			return null;
		Class274 class274 = method8899(is);
		return new Class286_Sub1(this, class274);
	}

	public final synchronized void method2007(int i) {
		for (int i_70_ = 0; i_70_ < anInt11572; i_70_++)
			IUnknown.Release(aLongArray11576[i_70_]);
		anInt11572 = 0;
		super.method2007(i);
	}

	static final int method10618(Class155 class155, Class171 class171) {
		switch (class171.anInt1904 * 608193561) {
		case 7:
			if (class155 == Class155.aClass155_1722)
				return 113;
			break;
		default:
			break;
		case 0:
			if (class155 == Class155.aClass155_1722)
				return 116;
			break;
		case 2:
			switch (class155.anInt1723 * 1319222349) {
			case 7:
				return 21;
			case 1:
				return 51;
			default:
				break;
			case 4:
				return Class366.anInt3857 * 700057271;
			case 0:
				return 50;
			case 9:
				return 28;
			case 2:
				return 22;
			case 8:
				return 77;
			case 6:
				return Class366.anInt3858 * -82102453;
			}
		}
		throw new IllegalArgumentException("");
	}

	static final int method10619(Class171 class171) {
		if (class171 == Class171.aClass171_1899)
			return 80;
		if (class171 == Class171.aClass171_1895)
			return 77;
		throw new IllegalArgumentException("");
	}

	void method8966(Interface41 interface41) {
		IDirect3DDevice.SetIndices(aLong11573, ((Class415) interface41).aLong4532);
	}

	void method8803(boolean bool) {
		IDirect3DDevice.method9304(aLong11573, 161, bool);
	}

	final Interface41 method8897(boolean bool) {
		return new Class415(this, Class171.aClass171_1899, bool);
	}

	synchronized void method10620(long l) {
		if (anInt11572 == anInt11569) {
			anInt11569 *= 2;
			long[] ls = new long[anInt11569];
			System.arraycopy(aLongArray11576, 0, ls, 0, anInt11572);
			aLongArray11576 = ls;
		}
		aLongArray11576[anInt11572] = l;
		anInt11572++;
	}

	void method8828() {
		switch (aClass365_9679.anInt3839) {
		case 3:
			IDirect3DDevice.SetRenderState(aLong11573, 19, 5);
			IDirect3DDevice.SetRenderState(aLong11573, 20, 6);
			break;
		case 0:
			IDirect3DDevice.SetRenderState(aLong11573, 19, 9);
			IDirect3DDevice.SetRenderState(aLong11573, 20, 2);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(aLong11573, 19, 2);
			IDirect3DDevice.SetRenderState(aLong11573, 20, 1);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(aLong11573, 19, 2);
			IDirect3DDevice.SetRenderState(aLong11573, 20, 2);
			break;
		}
		switch (anInt9560) {
		case 1:
			IDirect3DDevice.SetRenderState(aLong11573, 207, 2);
			IDirect3DDevice.SetRenderState(aLong11573, 208, 1);
			break;
		case 3:
			IDirect3DDevice.SetRenderState(aLong11573, 207, 1);
			IDirect3DDevice.SetRenderState(aLong11573, 208, 2);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(aLong11573, 207, 2);
			IDirect3DDevice.SetRenderState(aLong11573, 208, 2);
			break;
		case 0:
			IDirect3DDevice.SetRenderState(aLong11573, 207, 1);
			IDirect3DDevice.SetRenderState(aLong11573, 208, 1);
			break;
		}
	}

	public Class145 method2135() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(aLong11540, anInt11559, 0, d3dadapter_identifier);
		return new Class145(d3dadapter_identifier.VendorID, method8916() ? "Direct3D FF" : "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion, method8916());
	}

	void method10621(int i, int i_71_) {
		method2393();
		method2045(i, i_71_, -2056150293);
		aLong11575 = (IDirect3DDevice.CreateRenderTarget(aLong11573, i, i_71_, method10618(Class155.aClass155_1722, Class171.aClass171_1905), 0, 0, false));
		for (int i_72_ = 0; i_72_ < 3; i_72_++)
			aLongArray11541[i_72_] = (IDirect3DDevice.CreateOffscreenPlainSurface(aLong11573, i, i_71_, method10618(Class155.aClass155_1722, Class171.aClass171_1905), 2));
		method8713(i * i_71_ * 4);
	}

	void method2137(int i, int i_73_) throws Exception_Sub5 {
		if (aBool11545) {
			if (!method10607(aClass183_Sub1_1866.method2725(), aClass183_Sub1_1866.method2726()))
				return;
			((Class183_Sub1_Sub1_Sub1) aClass183_Sub1_1866).method353();
		} else
			IDirect3DDevice.EndScene(aLong11573);
		int i_74_ = aClass183_Sub1_1866.method8650();
		if (Class284.method3778(i_74_)) {
			aBool11545 = true;
			aClass183_Sub1_1866.method131();
		} else {
			IDirect3DDevice.BeginScene(aLong11573);
			if (anInterface24_1851 != null)
				anInterface24_1851.method29(159814723);
		}
	}

	void method8820() {
		/* empty */
	}

	void method2139(int i, int i_75_) throws Exception_Sub5 {
		if (aBool11545) {
			if (!method10607(aClass183_Sub1_1866.method2725(), aClass183_Sub1_1866.method2726()))
				return;
			((Class183_Sub1_Sub1_Sub1) aClass183_Sub1_1866).method353();
		} else
			IDirect3DDevice.EndScene(aLong11573);
		int i_76_ = aClass183_Sub1_1866.method8650();
		if (Class284.method3778(i_76_)) {
			aBool11545 = true;
			aClass183_Sub1_1866.method131();
		} else {
			IDirect3DDevice.BeginScene(aLong11573);
			if (anInterface24_1851 != null)
				anInterface24_1851.method29(243746332);
		}
	}

	public void method2140() {
		long l = IDirect3DDevice.CreateEventQuery(aLong11573);
		if (Class284.method3779(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	void method2132() {
		super.method2072();
		if (aLong11538 != 0L) {
			D3DLIGHT.Destroy(aLong11538);
			aLong11538 = 0L;
		}
		if (aLong11571 != 0L) {
			D3DLIGHT.Destroy(aLong11571);
			aLong11571 = 0L;
		}
		if (aLong11548 != 0L) {
			D3DLIGHT.Destroy(aLong11548);
			aLong11548 = 0L;
		}
		if (aLong11573 != 0L) {
			IDirect3DDevice.Destroy(aLong11573);
			aLong11573 = 0L;
		}
		if (aLong11540 != 0L) {
			IUnknown.Release(aLong11540);
			aLong11540 = 0L;
		}
	}

	public String method2240() {
		String string = "Caps: 4:";
		String string_77_ = ":";
		string = new StringBuilder().append(string).append(anInt9568).append(string_77_).toString();
		string = new StringBuilder().append(string).append(anInt9690).append(string_77_).toString();
		string = new StringBuilder().append(string).append(anInt9539).append(string_77_).toString();
		string = new StringBuilder().append(string).append(aBool9695 ? 1 : 0).append(string_77_).toString();
		string = new StringBuilder().append(string).append(method8900() ? 1 : 0).append(string_77_).toString();
		string = new StringBuilder().append(string).append(method8710() ? 1 : 0).append(string_77_).toString();
		string = new StringBuilder().append(string).append(aBool9697 ? 1 : 0).append(string_77_).toString();
		string = new StringBuilder().append(string).append(aBool9622 ? 1 : 0).append(string_77_).toString();
		string = new StringBuilder().append(string).append(aBool11560 ? 1 : 0).append(string_77_).toString();
		string = new StringBuilder().append(string).append(aBool11563 ? 1 : 0).append(string_77_).toString();
		string = new StringBuilder().append(string).append(aBool11546 ? 1 : 0).append(string_77_).toString();
		string = new StringBuilder().append(string).append(aBool11561 ? 1 : 0).append(string_77_).toString();
		string = new StringBuilder().append(string).append(aBool9692 ? 1 : 0).append(string_77_).toString();
		string = new StringBuilder().append(string).append(aBool9658 ? 1 : 0).append(string_77_).toString();
		string = new StringBuilder().append(string).append(aBool9694 ? 1 : 0).append(string_77_).toString();
		string = new StringBuilder().append(string).append(aBool11564 ? 1 : 0).append(string_77_).toString();
		string = new StringBuilder().append(string).append(aBool11550 ? 1 : 0).append(string_77_).toString();
		string = new StringBuilder().append(string).append(aBool11566 ? 1 : 0).append(string_77_).toString();
		string = new StringBuilder().append(string).append(aBool9545 ? 1 : 0).append(string_77_).toString();
		string = new StringBuilder().append(string).append(aBool11567 ? 1 : 0).append(string_77_).toString();
		string = new StringBuilder().append(string).append(aBool11568 ? 1 : 0).toString();
		return string;
	}

	public String method2164() {
		String string = "Caps: 4:";
		String string_78_ = ":";
		string = new StringBuilder().append(string).append(anInt9568).append(string_78_).toString();
		string = new StringBuilder().append(string).append(anInt9690).append(string_78_).toString();
		string = new StringBuilder().append(string).append(anInt9539).append(string_78_).toString();
		string = new StringBuilder().append(string).append(aBool9695 ? 1 : 0).append(string_78_).toString();
		string = new StringBuilder().append(string).append(method8900() ? 1 : 0).append(string_78_).toString();
		string = new StringBuilder().append(string).append(method8710() ? 1 : 0).append(string_78_).toString();
		string = new StringBuilder().append(string).append(aBool9697 ? 1 : 0).append(string_78_).toString();
		string = new StringBuilder().append(string).append(aBool9622 ? 1 : 0).append(string_78_).toString();
		string = new StringBuilder().append(string).append(aBool11560 ? 1 : 0).append(string_78_).toString();
		string = new StringBuilder().append(string).append(aBool11563 ? 1 : 0).append(string_78_).toString();
		string = new StringBuilder().append(string).append(aBool11546 ? 1 : 0).append(string_78_).toString();
		string = new StringBuilder().append(string).append(aBool11561 ? 1 : 0).append(string_78_).toString();
		string = new StringBuilder().append(string).append(aBool9692 ? 1 : 0).append(string_78_).toString();
		string = new StringBuilder().append(string).append(aBool9658 ? 1 : 0).append(string_78_).toString();
		string = new StringBuilder().append(string).append(aBool9694 ? 1 : 0).append(string_78_).toString();
		string = new StringBuilder().append(string).append(aBool11564 ? 1 : 0).append(string_78_).toString();
		string = new StringBuilder().append(string).append(aBool11550 ? 1 : 0).append(string_78_).toString();
		string = new StringBuilder().append(string).append(aBool11566 ? 1 : 0).append(string_78_).toString();
		string = new StringBuilder().append(string).append(aBool9545 ? 1 : 0).append(string_78_).toString();
		string = new StringBuilder().append(string).append(aBool11567 ? 1 : 0).append(string_78_).toString();
		string = new StringBuilder().append(string).append(aBool11568 ? 1 : 0).toString();
		return string;
	}

	public final synchronized void method2377(int i) {
		for (int i_79_ = 0; i_79_ < anInt11572; i_79_++)
			IUnknown.Release(aLongArray11576[i_79_]);
		anInt11572 = 0;
		super.method2007(i);
	}

	final void method8816(Interface41 interface41, Class377 class377, int i, int i_80_, int i_81_, int i_82_) {
		if (aClass285_Sub1_11557 != null)
			aClass285_Sub1_11557.method9120();
		IDirect3DDevice.DrawIndexedPrimitiveIB(aLong11573, (((Class415) interface41).aLong4532), 4, 0, i, i_80_, i_81_, i_82_);
	}

	Class183_Sub1 method2169(Canvas canvas, int i, int i_83_) {
		return new Class183_Sub1_Sub1_Sub1(this, canvas, i, i_83_, false);
	}

	public int[] method2170(int i, int i_84_, int i_85_, int i_86_) {
		method2084();
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(aLong11573, 0);
		long l_87_ = IDirect3DDevice.CreateRenderTarget(aLong11573, i_85_, i_86_, 21, 0, 0, true);
		int i_88_ = IDirect3DDevice.StretchRect(aLong11573, l, i, i_84_, i_85_, i_86_, l_87_, 0, 0, i_85_, i_86_, 1);
		method8713(i_85_ * i_86_ * 4);
		if (Class284.method3779(i_88_)) {
			is = new int[i_85_ * i_86_];
			IDirect3DSurface.Download(l_87_, 0, 0, i_85_, i_86_, i_85_ * 4, 16, aLong9586);
			aByteBuffer9549.clear();
			aByteBuffer9549.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_87_);
		return is;
	}

	Class167_Sub3_Sub2(int i, int i_89_, long l, long l_90_, D3DDISPLAYMODE d3ddisplaymode, D3DPRESENT_PARAMETERS d3dpresent_parameters, D3DCAPS d3dcaps, Class174 class174, Interface24 interface24, Interface47 interface47, Interface48 interface48, Interface46 interface46, JS5ResourceProvider class461, int i_91_) {
		super(class174, interface24, interface47, interface48, interface46, class461, i_91_, 0);
		aClass708_11544 = new Class708();
		aBool11545 = false;
		aLong11538 = 0L;
		aLong11571 = 0L;
		aLong11548 = 0L;
		aBool11549 = false;
		aFloatArray11570 = new float[16];
		anInt11569 = 128;
		anInt11572 = 0;
		aLongArray11576 = new long[anInt11569];
		aLong11575 = 0L;
		aLongArray11547 = new long[3];
		aLongArray11541 = new long[3];
		anIntArray11578 = new int[3];
		anInt11579 = 0;
		anInt11580 = 0;
		try {
			anInt11559 = i;
			anInt11539 = i_89_;
			aLong11540 = l;
			aLong11573 = l_90_;
			aD3DDISPLAYMODE11543 = d3ddisplaymode;
			aD3DPRESENT_PARAMETERS11555 = d3dpresent_parameters;
			aD3DCAPS11542 = d3dcaps;
			aLong11538 = D3DLIGHT.Create();
			aLong11571 = D3DLIGHT.Create();
			aLong11548 = D3DLIGHT.Create();
			anInt9690 = aD3DCAPS11542.MaxSimultaneousTextures;
			anInt9539 = (aD3DCAPS11542.MaxActiveLights > 0 ? aD3DCAPS11542.MaxActiveLights : 8);
			aBool11560 = (aD3DCAPS11542.TextureCaps & 0x2) == 0;
			aBool9622 = (aD3DCAPS11542.TextureCaps & 0x800) != 0;
			aBool9697 = (aD3DCAPS11542.TextureCaps & 0x2000) != 0;
			aBool11563 = (aD3DCAPS11542.TextureCaps & 0x8000) != 0;
			aBool11546 = (aD3DCAPS11542.TextureCaps & 0x10000) != 0;
			aBool11561 = (aD3DCAPS11542.TextureCaps & 0x4000) != 0;
			aBool9692 = aD3DCAPS11542.NumSimultaneousRTs > 0;
			aBool9693 = aBool9692;
			aBool9658 = aD3DCAPS11542.NumSimultaneousRTs > 0;
			aBool9695 = (anInt9568 > 0 || (IDirect3D.CheckDeviceMultiSampleType(aLong11540, anInt11559, anInt11539, aD3DPRESENT_PARAMETERS11555.BackBufferFormat, true, 2)) == 0);
			aBool9694 = (aD3DCAPS11542.NumSimultaneousRTs > 0 && anInt9568 > 0 || IDirect3D.CheckDeviceMultiSampleType(aLong11540, anInt11559, anInt11539, 113, true, 2) == 0);
			aBool11564 = (IDirect3D.CheckDeviceFormat(aLong11540, anInt11559, anInt11539, (aD3DPRESENT_PARAMETERS11555.BackBufferFormat), 0, 1, method8819('A', 'T', 'O', 'C')) == 0);
			aBool11550 = (IDirect3D.CheckDeviceFormat(aLong11540, anInt11559, anInt11539, (aD3DPRESENT_PARAMETERS11555.BackBufferFormat), 0, 1, method8819('A', '2', 'M', '1')) == 0);
			aBool11566 = (IDirect3D.CheckDeviceFormat(aLong11540, anInt11559, anInt11539, (aD3DPRESENT_PARAMETERS11555.BackBufferFormat), 0, 1, method8819('S', 'S', 'A', 'A')) == 0);
			aBool9545 = (aD3DCAPS11542.PrimitiveMiscCaps & 0x20000) != 0;
			aBool11567 = IDirect3D.CheckDeviceFormat(aLong11540, anInt11559, anInt11539, aD3DDISPLAYMODE11543.Format, 524288, 3, 113) == 0;
			aBool11568 = IDirect3D.CheckDeviceFormat(aLong11540, anInt11559, anInt11539, aD3DDISPLAYMODE11543.Format, 524288, 3, 116) == 0;
			aBoolArray11552 = new boolean[anInt9690];
			aBoolArray11551 = new boolean[anInt9690];
			aBoolArray11577 = new boolean[anInt9690];
			aClass342Array11554 = new Class342[anInt9690];
			aBoolArray11553 = new boolean[anInt9690];
			anIntArray11565 = new int[anInt9690];
			Class433 class433 = new Class433();
			class433.method5197(1.0F, -1.0F, 0.5F);
			class433.method5200(0.0F, 0.0F, 0.5F);
			aClass443_11556 = new Class443();
			aClass443_11556.method5359(class433);
			IDirect3DDevice.BeginScene(aLong11573);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method2005(778784407);
			throw new RuntimeException("");
		}
	}

	public int[] method2172(int i, int i_92_, int i_93_, int i_94_) {
		method2084();
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(aLong11573, 0);
		long l_95_ = IDirect3DDevice.CreateRenderTarget(aLong11573, i_93_, i_94_, 21, 0, 0, true);
		int i_96_ = IDirect3DDevice.StretchRect(aLong11573, l, i, i_92_, i_93_, i_94_, l_95_, 0, 0, i_93_, i_94_, 1);
		method8713(i_93_ * i_94_ * 4);
		if (Class284.method3779(i_96_)) {
			is = new int[i_93_ * i_94_];
			IDirect3DSurface.Download(l_95_, 0, 0, i_93_, i_94_, i_93_ * 4, 16, aLong9586);
			aByteBuffer9549.clear();
			aByteBuffer9549.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_95_);
		return is;
	}

	public void method2117() {
		/* empty */
	}

	Interface36 method8859(Class155 class155, int i, int i_97_, boolean bool, float[] fs, int i_98_, int i_99_) {
		return new Class408_Sub2(this, class155, i, i_97_, bool, fs, i_98_, i_99_);
	}

	public void method2024(int i, int i_100_, int[] is, int[] is_101_) {
		method10609(i, i_100_, is, is_101_);
	}

	public boolean method2178() {
		if (aBool11545)
			return false;
		if (aLongArray11547[anInt11580] != 0L)
			return false;
		return true;
	}

	public boolean method2346() {
		return true;
	}

	public boolean method2180() {
		return true;
	}

	public boolean method2064() {
		return false;
	}

	public int method2392() {
		if (aLongArray11547[anInt11579] == 0L)
			return -1;
		return ((Class284.method3779(IDirect3DEventQuery.IsSignaled(aLongArray11547[anInt11579]))) ? anIntArray11578[anInt11579] : -1);
	}

	public int method2183() {
		if (aLongArray11547[anInt11579] == 0L)
			return -1;
		return ((Class284.method3779(IDirect3DEventQuery.IsSignaled(aLongArray11547[anInt11579]))) ? anIntArray11578[anInt11579] : -1);
	}

	public int method2184() {
		if (aLongArray11547[anInt11579] == 0L)
			return -1;
		return ((Class284.method3779(IDirect3DEventQuery.IsSignaled(aLongArray11547[anInt11579]))) ? anIntArray11578[anInt11579] : -1);
	}

	public void method2185() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray11547[i] != 0L) {
				IUnknown.Release(aLongArray11547[i]);
				aLongArray11547[i] = 0L;
			}
		}
		anInt11580 = 0;
		anInt11579 = 0;
	}

	public void method2221(int i, int i_102_) {
		IDirect3DDevice.Clear(aLong11573, i, i_102_, 1.0F, 0);
	}

	public void method2271() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray11547[i] != 0L) {
				IUnknown.Release(aLongArray11547[i]);
				aLongArray11547[i] = 0L;
			}
		}
		anInt11580 = 0;
		anInt11579 = 0;
	}

	public void method2188() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray11547[i] != 0L) {
				IUnknown.Release(aLongArray11547[i]);
				aLongArray11547[i] = 0L;
			}
		}
		anInt11580 = 0;
		anInt11579 = 0;
	}

	public long method2189(int i, int i_103_) {
		return method10609(i, i_103_, null, null);
	}

	public void method2141() {
		long l = IDirect3DDevice.CreateEventQuery(aLong11573);
		if (Class284.method3779(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	final void method10622(long l) {
		IDirect3DDevice.SetPixelShader(aLong11573, l);
	}

	public void method2356() {
		if (aLong11575 != 0L) {
			IUnknown.Release(aLong11575);
			aLong11575 = 0L;
		}
		for (int i = 0; i < 3; i++) {
			if (aLongArray11547[i] != 0L) {
				IUnknown.Release(aLongArray11547[i]);
				aLongArray11547[i] = 0L;
			}
			if (aLongArray11541[i] != 0L) {
				IUnknown.Release(aLongArray11541[i]);
				aLongArray11541[i] = 0L;
			}
		}
		anInt11580 = 0;
		anInt11579 = 0;
	}

	void method8951() {
		if (aBool9704) {
			int i = (aBoolArray11577[anInt9636] ? method10612(aClass371Array9640[anInt9636]) : 1);
			IDirect3DDevice.SetTextureStageState(aLong11573, anInt9636, 1, i);
		}
	}

	public void method2395() {
		if (aLong11575 != 0L) {
			IUnknown.Release(aLong11575);
			aLong11575 = 0L;
		}
		for (int i = 0; i < 3; i++) {
			if (aLongArray11547[i] != 0L) {
				IUnknown.Release(aLongArray11547[i]);
				aLongArray11547[i] = 0L;
			}
			if (aLongArray11541[i] != 0L) {
				IUnknown.Release(aLongArray11541[i]);
				aLongArray11541[i] = 0L;
			}
		}
		anInt11580 = 0;
		anInt11579 = 0;
	}

	public void method2041(int i, int i_104_, int i_105_) {
		if (aLong11575 == 0L)
			method10621(i_104_, i_105_);
		long l = IDirect3DDevice.GetRenderTarget(aLong11573, 0);
		if (!Class284.method3778(IDirect3DDevice.StretchRect(aLong11573, l, 0, 0, aClass183_1849.method2725(), aClass183_1849.method2726(), aLong11575, anInt1872 * 1475697639, anInt1873 * 398729877, anInt1856 * -397142117, anInt1875 * -915384365, 2))) {
			/* empty */
		}
		IUnknown.Release(l);
		IDirect3DDevice.GetRenderTargetData(aLong11573, aLong11575, aLongArray11541[anInt11580]);
		long l_106_ = IDirect3DDevice.CreateEventQuery(aLong11573);
		if (Class284.method3779(IDirect3DEventQuery.Issue(l_106_)))
			aLongArray11547[anInt11580] = l_106_;
		anIntArray11578[anInt11580] = i;
		if (++anInt11580 >= 3)
			anInt11580 = 0;
	}

	public void method2219(int i, int i_107_) {
		IDirect3DDevice.Clear(aLong11573, i, i_107_, 1.0F, 0);
	}

	public void method2404(int i, int i_108_) {
		IDirect3DDevice.Clear(aLong11573, i, i_108_, 1.0F, 0);
	}

	public boolean method2037() {
		return true;
	}

	public void method2222(int i, int i_109_) {
		IDirect3DDevice.Clear(aLong11573, i, i_109_, 1.0F, 0);
	}

	public void method2403() {
		if (aLong11575 != 0L) {
			IUnknown.Release(aLong11575);
			aLong11575 = 0L;
		}
		for (int i = 0; i < 3; i++) {
			if (aLongArray11547[i] != 0L) {
				IUnknown.Release(aLongArray11547[i]);
				aLongArray11547[i] = 0L;
			}
			if (aLongArray11541[i] != 0L) {
				IUnknown.Release(aLongArray11541[i]);
				aLongArray11541[i] = 0L;
			}
		}
		anInt11580 = 0;
		anInt11579 = 0;
	}

	public Class176 method2294(Class176 class176, Class176 class176_110_, float f, Class176 class176_111_) {
		return f < 0.5F ? class176 : class176_110_;
	}

	public Class183_Sub2 method2332() {
		return new Class183_Sub2_Sub2_Sub2(this);
	}

	public void method2168(boolean bool) {
		/* empty */
	}

	public final synchronized void method2324(int i) {
		for (int i_112_ = 0; i_112_ < anInt11572; i_112_++)
			IUnknown.Release(aLongArray11576[i_112_]);
		anInt11572 = 0;
		super.method2007(i);
	}

	void method8801() {
		aFloat9676 = aFloat9596 - (float) anInt9644;
		aFloat9675 = aFloat9676 - (float) anInt9550;
		if (aFloat9675 < aFloat9631)
			aFloat9675 = aFloat9631;
		if (aBool9704) {
			IDirect3DDevice.method9303(aLong11573, 36, aFloat9675);
			IDirect3DDevice.method9303(aLong11573, 37, aFloat9676);
			IDirect3DDevice.SetRenderState(aLong11573, 34, anInt9672);
		}
	}

	public Interface22 method2335(int i, int i_113_, Class155 class155, Class171 class171, int i_114_) {
		return new Class423(this, class155, class171, i, i_113_, i_114_);
	}

	public Interface21 method2193(int i, int i_115_) {
		return new Class421(this, Class171.aClass171_1895, i, i_115_, 0);
	}

	void method2370() {
		super.finalize();
	}

	Interface36 method8924(Class155 class155, Class171 class171, int i, int i_116_) {
		return new Class408_Sub2(this, class155, class171, i, i_116_);
	}

	public Interface21 method2338(int i, int i_117_, int i_118_) {
		return new Class421(this, Class171.aClass171_1895, i, i_117_, i_118_);
	}

	public int[] method2171(int i, int i_119_, int i_120_, int i_121_) {
		method2084();
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(aLong11573, 0);
		long l_122_ = IDirect3DDevice.CreateRenderTarget(aLong11573, i_120_, i_121_, 21, 0, 0, true);
		int i_123_ = IDirect3DDevice.StretchRect(aLong11573, l, i, i_119_, i_120_, i_121_, l_122_, 0, 0, i_120_, i_121_, 1);
		method8713(i_120_ * i_121_ * 4);
		if (Class284.method3779(i_123_)) {
			is = new int[i_120_ * i_121_];
			IDirect3DSurface.Download(l_122_, 0, 0, i_120_, i_121_, i_120_ * 4, 16, aLong9586);
			aByteBuffer9549.clear();
			aByteBuffer9549.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_122_);
		return is;
	}

	public Interface21 method2319(int i, int i_124_, int i_125_) {
		return new Class421(this, Class171.aClass171_1895, i, i_124_, i_125_);
	}

	public void method8807(Class343 class343) {
		Class343_Sub1 class343_sub1 = (Class343_Sub1) class343;
		IDirect3DDevice.SetVertexDeclaration(aLong11573, class343_sub1.aLong10222);
	}

	void method8922() {
		int i;
		for (i = 0; i < anInt9601; i++) {
			Class536_Sub19 class536_sub19 = aClass536_Sub19Array9534[i];
			int i_126_ = i + 2;
			int i_127_ = class536_sub19.method9528(-35031861);
			float f = class536_sub19.method9531(1281345878) / 255.0F;
			D3DLIGHT.SetPosition(aLong11548, (float) class536_sub19.method9548(237486926), (float) class536_sub19.method9549(1307780794), (float) class536_sub19.method9551((byte) 0));
			D3DLIGHT.SetDiffuse(aLong11548, (float) (i_127_ >> 16 & 0xff) * f, (float) (i_127_ >> 8 & 0xff) * f, (float) (i_127_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(aLong11548, 0.0F, 0.0F, 1.0F / (float) (class536_sub19.method9530(-125899810) * class536_sub19.method9530(-62868684)));
			D3DLIGHT.SetRange(aLong11548, (float) class536_sub19.method9530(-756291168));
			IDirect3DDevice.SetLight(aLong11573, i_126_, aLong11548);
			IDirect3DDevice.LightEnable(aLong11573, i_126_, true);
		}
		for (/**/; i < anInt9630; i++)
			IDirect3DDevice.LightEnable(aLong11573, i + 2, false);
	}

	void method8949() {
		/* empty */
	}

	void method8752() {
		IDirect3DDevice.method9304(aLong11573, 15, aBool9703);
		IDirect3DDevice.SetRenderState(aLong11573, 24, aByte9688 & 0xff);
		if (aD3DPRESENT_PARAMETERS11555.MultiSampleType > 0) {
			if (!aBool9703 || aByte9688 == 0) {
				if (aBool11566 || aBool11564)
					IDirect3DDevice.SetRenderState(aLong11573, 181, 0);
				else if (aBool11550)
					IDirect3DDevice.method9303(aLong11573, 154, 1.0F);
			} else if (aBool11566)
				IDirect3DDevice.SetRenderState(aLong11573, 181, method8819('S', 'S', 'A', 'A'));
			else if (aBool11564)
				IDirect3DDevice.SetRenderState(aLong11573, 181, method8819('A', 'T', 'O', 'C'));
			else if (aBool11550)
				IDirect3DDevice.SetRenderState(aLong11573, 154, method8819('A', '2', 'M', '1'));
		}
	}

	public void method2349(int i, int i_128_, int[] is, int[] is_129_) {
		method10609(i, i_128_, is, is_129_);
	}

	public void method2350(int i, int i_130_, int[] is, int[] is_131_) {
		method10609(i, i_130_, is, is_131_);
	}

	void method8914() {
		if (aBool9704 && !aBool11549) {
			IDirect3DDevice.LightEnable(aLong11573, 0, false);
			IDirect3DDevice.LightEnable(aLong11573, 1, false);
			IDirect3DDevice.SetLight(aLong11573, 0, aLong11538);
			IDirect3DDevice.SetLight(aLong11573, 1, aLong11571);
			IDirect3DDevice.LightEnable(aLong11573, 0, true);
			IDirect3DDevice.LightEnable(aLong11573, 1, true);
			aBool11549 = true;
		}
	}

	void method8719() {
		method2393();
		for (ObjectParam class536_sub13 = (ObjectParam) aClass708_11544.method8308(1867269829); class536_sub13 != null; class536_sub13 = (ObjectParam) aClass708_11544.method8311(993064614)) {
			Interface52 interface52 = (Interface52) class536_sub13.value;
			interface52.method131();
		}
		super.method8719();
	}

	Interface36 method8927(Class155 class155, int i, int i_132_, boolean bool, byte[] is, int i_133_, int i_134_) {
		return new Class408_Sub2(this, class155, i, i_132_, bool, is, i_133_, i_134_);
	}

	public boolean method8833() {
		return (aD3DCAPS11542.VertexShaderVersion & 0xffff) >= 257;
	}

	public boolean method8862() {
		return (aD3DCAPS11542.VertexShaderVersion & 0xffff) >= 257;
	}

	public boolean method8863() {
		return (aD3DCAPS11542.VertexShaderVersion & 0xffff) >= 257;
	}

	public boolean method8864() {
		return (aD3DCAPS11542.PixelShaderVersion & 0xffff) >= 257;
	}

	public boolean method8865() {
		return (aD3DCAPS11542.PixelShaderVersion & 0xffff) >= 257;
	}

	public boolean method8866(boolean bool) {
		if (bool)
			return aBool11567;
		return aBool11567 && aBool11568;
	}

	public boolean method8843(boolean bool) {
		if (bool)
			return aBool11567;
		return aBool11567 && aBool11568;
	}

	ObjectParam method10623(Interface52 interface52) {
		for (ObjectParam class536_sub13 = (ObjectParam) aClass708_11544.method8308(1867269829); class536_sub13 != null; class536_sub13 = (ObjectParam) aClass708_11544.method8311(1460386376)) {
			if (class536_sub13.value == interface52)
				return class536_sub13;
		}
		return null;
	}

	public Class286 method8898(String string) {
		byte[] is = method10606(string);
		if (is == null)
			return null;
		Class274 class274 = method8899(is);
		return new Class286_Sub1(this, class274);
	}

	public Class286 method8790(String string) {
		byte[] is = method10606(string);
		if (is == null)
			return null;
		Class274 class274 = method8899(is);
		return new Class286_Sub1(this, class274);
	}

	public void method8871(Class443 class443, Class443 class443_135_, Class443 class443_136_) {
		IDirect3DDevice.SetTransform(aLong11573, 256, class443.aFloatArray4878);
		IDirect3DDevice.SetTransform(aLong11573, 2, class443_135_.aFloatArray4878);
		IDirect3DDevice.SetTransform(aLong11573, 3, class443_136_.aFloatArray4878);
	}

	void method8878() {
		for (int i = 0; i < anInt9690; i++) {
			IDirect3DDevice.SetSamplerState(aLong11573, i, 7, 2);
			IDirect3DDevice.SetSamplerState(aLong11573, i, 6, 2);
			IDirect3DDevice.SetSamplerState(aLong11573, i, 5, 2);
			IDirect3DDevice.SetSamplerState(aLong11573, i, 1, 1);
			IDirect3DDevice.SetSamplerState(aLong11573, i, 2, 1);
			aClass342Array11554[i] = Class342.aClass342_3663;
			boolean[] bools = aBoolArray11552;
			int i_137_ = i;
			aBoolArray11551[i] = true;
			bools[i_137_] = true;
			aBoolArray11553[i] = false;
			anIntArray11565[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState(aLong11573, 0, 6, 1);
		IDirect3DDevice.SetRenderState(aLong11573, 9, 2);
		IDirect3DDevice.SetRenderState(aLong11573, 23, 4);
		IDirect3DDevice.SetRenderState(aLong11573, 25, 5);
		IDirect3DDevice.SetRenderState(aLong11573, 24, 0);
		IDirect3DDevice.method9304(aLong11573, 206, aBool9545);
		IDirect3DDevice.SetRenderState(aLong11573, 181, 0);
		method10616();
		IDirect3DDevice.SetRenderState(aLong11573, 147, 1);
		IDirect3DDevice.SetRenderState(aLong11573, 145, 1);
		IDirect3DDevice.method9303(aLong11573, 38, 0.95F);
		IDirect3DDevice.SetRenderState(aLong11573, 35, 3);
		IDirect3DDevice.method9303(aLong11573, 154, 1.0F);
		D3DLIGHT.SetType(aLong11538, 3);
		D3DLIGHT.SetType(aLong11571, 3);
		D3DLIGHT.SetType(aLong11548, 1);
		aBool11549 = false;
		super.method8717();
	}

	void method8879() {
		for (int i = 0; i < anInt9690; i++) {
			IDirect3DDevice.SetSamplerState(aLong11573, i, 7, 2);
			IDirect3DDevice.SetSamplerState(aLong11573, i, 6, 2);
			IDirect3DDevice.SetSamplerState(aLong11573, i, 5, 2);
			IDirect3DDevice.SetSamplerState(aLong11573, i, 1, 1);
			IDirect3DDevice.SetSamplerState(aLong11573, i, 2, 1);
			aClass342Array11554[i] = Class342.aClass342_3663;
			boolean[] bools = aBoolArray11552;
			int i_138_ = i;
			aBoolArray11551[i] = true;
			bools[i_138_] = true;
			aBoolArray11553[i] = false;
			anIntArray11565[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState(aLong11573, 0, 6, 1);
		IDirect3DDevice.SetRenderState(aLong11573, 9, 2);
		IDirect3DDevice.SetRenderState(aLong11573, 23, 4);
		IDirect3DDevice.SetRenderState(aLong11573, 25, 5);
		IDirect3DDevice.SetRenderState(aLong11573, 24, 0);
		IDirect3DDevice.method9304(aLong11573, 206, aBool9545);
		IDirect3DDevice.SetRenderState(aLong11573, 181, 0);
		method10616();
		IDirect3DDevice.SetRenderState(aLong11573, 147, 1);
		IDirect3DDevice.SetRenderState(aLong11573, 145, 1);
		IDirect3DDevice.method9303(aLong11573, 38, 0.95F);
		IDirect3DDevice.SetRenderState(aLong11573, 35, 3);
		IDirect3DDevice.method9303(aLong11573, 154, 1.0F);
		D3DLIGHT.SetType(aLong11538, 3);
		D3DLIGHT.SetType(aLong11571, 3);
		D3DLIGHT.SetType(aLong11548, 1);
		aBool11549 = false;
		super.method8717();
	}

	void method8880() {
		for (int i = 0; i < anInt9690; i++) {
			IDirect3DDevice.SetSamplerState(aLong11573, i, 7, 2);
			IDirect3DDevice.SetSamplerState(aLong11573, i, 6, 2);
			IDirect3DDevice.SetSamplerState(aLong11573, i, 5, 2);
			IDirect3DDevice.SetSamplerState(aLong11573, i, 1, 1);
			IDirect3DDevice.SetSamplerState(aLong11573, i, 2, 1);
			aClass342Array11554[i] = Class342.aClass342_3663;
			boolean[] bools = aBoolArray11552;
			int i_139_ = i;
			aBoolArray11551[i] = true;
			bools[i_139_] = true;
			aBoolArray11553[i] = false;
			anIntArray11565[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState(aLong11573, 0, 6, 1);
		IDirect3DDevice.SetRenderState(aLong11573, 9, 2);
		IDirect3DDevice.SetRenderState(aLong11573, 23, 4);
		IDirect3DDevice.SetRenderState(aLong11573, 25, 5);
		IDirect3DDevice.SetRenderState(aLong11573, 24, 0);
		IDirect3DDevice.method9304(aLong11573, 206, aBool9545);
		IDirect3DDevice.SetRenderState(aLong11573, 181, 0);
		method10616();
		IDirect3DDevice.SetRenderState(aLong11573, 147, 1);
		IDirect3DDevice.SetRenderState(aLong11573, 145, 1);
		IDirect3DDevice.method9303(aLong11573, 38, 0.95F);
		IDirect3DDevice.SetRenderState(aLong11573, 35, 3);
		IDirect3DDevice.method9303(aLong11573, 154, 1.0F);
		D3DLIGHT.SetType(aLong11538, 3);
		D3DLIGHT.SetType(aLong11571, 3);
		D3DLIGHT.SetType(aLong11548, 1);
		aBool11549 = false;
		super.method8717();
	}

	void method8882() {
		method2393();
		for (ObjectParam class536_sub13 = (ObjectParam) aClass708_11544.method8308(1867269829); class536_sub13 != null; class536_sub13 = (ObjectParam) aClass708_11544.method8311(1075030291)) {
			Interface52 interface52 = (Interface52) class536_sub13.value;
			interface52.method131();
		}
		super.method8719();
	}

	void method8883() {
		method2393();
		for (ObjectParam class536_sub13 = (ObjectParam) aClass708_11544.method8308(1867269829); class536_sub13 != null; class536_sub13 = (ObjectParam) aClass708_11544.method8311(1643935707)) {
			Interface52 interface52 = (Interface52) class536_sub13.value;
			interface52.method131();
		}
		super.method8719();
	}

	public float method8735() {
		return -0.5F;
	}

	void method8885() {
		for (ObjectParam class536_sub13 = (ObjectParam) aClass708_11544.method8308(1867269829); class536_sub13 != null; class536_sub13 = (ObjectParam) aClass708_11544.method8311(1324671303)) {
			Interface52 interface52 = (Interface52) class536_sub13.value;
			interface52.method353();
			if (interface52 == aClass183_1849)
				interface52.method352();
		}
		super.method8720();
	}

	void method8886() {
		for (ObjectParam class536_sub13 = (ObjectParam) aClass708_11544.method8308(1867269829); class536_sub13 != null; class536_sub13 = (ObjectParam) aClass708_11544.method8311(1787607931)) {
			Interface52 interface52 = (Interface52) class536_sub13.value;
			interface52.method353();
			if (interface52 == aClass183_1849)
				interface52.method352();
		}
		super.method8720();
	}

	public float method8887() {
		return -0.5F;
	}

	public Interface22 method2121(int i, int i_140_, Class155 class155, Class171 class171, int i_141_) {
		return new Class423(this, class155, class171, i, i_140_, i_141_);
	}

	public float method8889() {
		return -0.5F;
	}

	void method8874() {
		if (aClass183_1849 != null)
			IDirect3DDevice.SetViewport(aLong11573, anInt9609 + anInt9618, anInt9610 + anInt9547, anInt9607, anInt9608, aFloat9591, aFloat9592);
	}

	void method8969(Interface41 interface41) {
		IDirect3DDevice.SetIndices(aLong11573, ((Class415) interface41).aLong4532);
	}

	void method8884() {
		for (ObjectParam class536_sub13 = (ObjectParam) aClass708_11544.method8308(1867269829); class536_sub13 != null; class536_sub13 = (ObjectParam) aClass708_11544.method8311(880752850)) {
			Interface52 interface52 = (Interface52) class536_sub13.value;
			interface52.method353();
			if (interface52 == aClass183_1849)
				interface52.method352();
		}
		super.method8720();
	}

	void method8738() {
		IDirect3DDevice.SetScissorRect(aLong11573, anInt9609 + anInt9599, anInt9610 + anInt9624, anInt9600, anInt9598);
	}

	void method8895() {
		IDirect3DDevice.SetScissorRect(aLong11573, anInt9609 + anInt9599, anInt9610 + anInt9624, anInt9600, anInt9598);
	}

	void method8709() {
		IDirect3DDevice.method9304(aLong11573, 174, aBool9715);
	}

	void method8896() {
		IDirect3DDevice.method9304(aLong11573, 174, aBool9715);
	}

	void method10624(Interface52 interface52) {
		ObjectParam class536_sub13 = method10623(interface52);
		if (class536_sub13 != null)
			class536_sub13.method6484();
	}

	public void method2191(long l) {
		/* empty */
	}

	public void method8902(Class443 class443) {
		class443.method5390(aClass443_11556);
	}

	void method8904() {
		IDirect3DDevice.method9304(aLong11573, 7, aBool9613 && aBool9614);
	}

	void method8860() {
		IDirect3DDevice.method9304(aLong11573, 7, aBool9613 && aBool9614);
	}

	void method8905() {
		IDirect3DDevice.method9304(aLong11573, 14, aBool9611 && aBool9653);
	}

	void method8768() {
		IDirect3DDevice.method9304(aLong11573, 14, aBool9611 && aBool9653);
	}

	void method8906() {
		if (aBool9704)
			IDirect3DDevice.method9304(aLong11573, 137, aBool9700 && !aBool9617);
	}

	void method8907() {
		if (aBool9704) {
			D3DLIGHT.SetAmbient(aLong11538, aFloat9678 * aFloat9626, aFloat9649 * aFloat9626, aFloat9701 * aFloat9626, 0.0F);
			aBool11549 = false;
		}
	}

	void method8908() {
		if (aBool9704) {
			D3DLIGHT.SetAmbient(aLong11538, aFloat9678 * aFloat9626, aFloat9649 * aFloat9626, aFloat9701 * aFloat9626, 0.0F);
			aBool11549 = false;
		}
	}

	void method8915() {
		method8822();
		method8766();
	}

	void method8797() {
		if (aBool9704) {
			float f = aBool9616 ? aFloat9573 : 0.0F;
			float f_142_ = aBool9616 ? -aFloat9579 : 0.0F;
			D3DLIGHT.SetDiffuse(aLong11538, f * aFloat9678, f * aFloat9649, f * aFloat9701, 0.0F);
			D3DLIGHT.SetDiffuse(aLong11571, f_142_ * aFloat9678, f_142_ * aFloat9649, f_142_ * aFloat9701, 0.0F);
			aBool11549 = false;
		}
	}

	void method8841() {
		if (aBool9704) {
			float f = aBool9616 ? aFloat9573 : 0.0F;
			float f_143_ = aBool9616 ? -aFloat9579 : 0.0F;
			D3DLIGHT.SetDiffuse(aLong11538, f * aFloat9678, f * aFloat9649, f * aFloat9701, 0.0F);
			D3DLIGHT.SetDiffuse(aLong11571, f_143_ * aFloat9678, f_143_ * aFloat9649, f_143_ * aFloat9701, 0.0F);
			aBool11549 = false;
		}
	}

	public int[] method2173(int i, int i_144_, int i_145_, int i_146_) {
		method2084();
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(aLong11573, 0);
		long l_147_ = IDirect3DDevice.CreateRenderTarget(aLong11573, i_145_, i_146_, 21, 0, 0, true);
		int i_148_ = IDirect3DDevice.StretchRect(aLong11573, l, i, i_144_, i_145_, i_146_, l_147_, 0, 0, i_145_, i_146_, 1);
		method8713(i_145_ * i_146_ * 4);
		if (Class284.method3779(i_148_)) {
			is = new int[i_145_ * i_146_];
			IDirect3DSurface.Download(l_147_, 0, 0, i_145_, i_146_, i_145_ * 4, 16, aLong9586);
			aByteBuffer9549.clear();
			aByteBuffer9549.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_147_);
		return is;
	}

	void method8911() {
		if (aBool9704) {
			D3DLIGHT.SetDirection(aLong11538, -aFloatArray9542[0], -aFloatArray9542[1], -aFloatArray9542[2]);
			D3DLIGHT.SetDirection(aLong11571, -aFloatArray9619[0], -aFloatArray9619[1], -aFloatArray9619[2]);
			aBool11549 = false;
		}
	}

	void method8711(int i) {
		if (!aBool11562) {
			int i_149_ = (i & 0x2) != 0 ? 2 : 3;
			IDirect3DDevice.SetRenderState(aLong11573, 8, i_149_);
		}
	}

	void method8913() {
		if (aBool9704) {
			D3DLIGHT.SetDirection(aLong11538, -aFloatArray9542[0], -aFloatArray9542[1], -aFloatArray9542[2]);
			D3DLIGHT.SetDirection(aLong11571, -aFloatArray9619[0], -aFloatArray9619[1], -aFloatArray9619[2]);
			aBool11549 = false;
		}
	}

	Interface36 method8926(Class155 class155, int i, int i_150_, boolean bool, byte[] is, int i_151_, int i_152_) {
		return new Class408_Sub2(this, class155, i, i_150_, bool, is, i_151_, i_152_);
	}

	static boolean method10625(int i, int i_153_, long l, int i_154_, D3DDISPLAYMODE d3ddisplaymode, D3DPRESENT_PARAMETERS d3dpresent_parameters) {
		int i_155_ = 0;
		int i_156_ = 0;
		int i_157_ = 0;
		boolean bool;
		try {
			if (Class284.method3778(IDirect3D.GetAdapterDisplayMode(l, i, d3ddisplaymode)))
				return false;
			while_63_: for (/**/; i_154_ >= 0; i_154_--) {
				if (i_154_ != 1) {
					i_157_ = 0 + i_154_;
					for (int i_158_ = 0; i_158_ < anIntArray11582.length; i_158_++) {
						if (IDirect3D.CheckDeviceType(l, i, i_153_, d3ddisplaymode.Format, anIntArray11582[i_158_], true) == 0 && IDirect3D.CheckDeviceFormat(l, i, i_153_, (d3ddisplaymode.Format), 1, 1, (anIntArray11582[i_158_])) == 0 && (i_154_ == 0 || (IDirect3D.CheckDeviceMultiSampleType(l, i, i_153_, anIntArray11582[i_158_], true, i_157_)) == 0)) {
							for (int i_159_ = 0; i_159_ < anIntArray11581.length; i_159_++) {
								if ((IDirect3D.CheckDeviceFormat(l, i, i_153_, d3ddisplaymode.Format, 2, 1, anIntArray11581[i_159_])) == 0 && (IDirect3D.CheckDepthStencilMatch(l, i, i_153_, d3ddisplaymode.Format, anIntArray11582[i_158_], anIntArray11581[i_159_])) == 0 && (i_154_ == 0 || (IDirect3D.CheckDeviceMultiSampleType(l, i, i_153_, anIntArray11581[i_158_], true, i_157_)) == 0)) {
									i_156_ = anIntArray11582[i_158_];
									i_155_ = anIntArray11581[i_159_];
									break while_63_;
								}
							}
						}
					}
				}
			}
			if (i_154_ < 0 || i_156_ == 0 || i_155_ == 0)
				return false;
			d3dpresent_parameters.BackBufferFormat = i_156_;
			d3dpresent_parameters.AutoDepthStencilFormat = i_155_;
			d3dpresent_parameters.MultiSampleType = i_157_;
			d3dpresent_parameters.MultiSampleQuality = 0;
			bool = true;
		} catch (Throwable throwable) {
			return false;
		}
		return bool;
	}

	void method8831() {
		method8822();
		method8766();
	}

	void method8917() {
		method8822();
		method8766();
	}

	void method8918() {
		method8822();
		method8766();
	}

	void method8849() {
		if (aBool9704) {
			float f = aBool9616 ? aFloat9573 : 0.0F;
			float f_160_ = aBool9616 ? -aFloat9579 : 0.0F;
			D3DLIGHT.SetDiffuse(aLong11538, f * aFloat9678, f * aFloat9649, f * aFloat9701, 0.0F);
			D3DLIGHT.SetDiffuse(aLong11571, f_160_ * aFloat9678, f_160_ * aFloat9649, f_160_ * aFloat9701, 0.0F);
			aBool11549 = false;
		}
	}

	void method8920() {
		int i;
		for (i = 0; i < anInt9601; i++) {
			Class536_Sub19 class536_sub19 = aClass536_Sub19Array9534[i];
			int i_161_ = i + 2;
			int i_162_ = class536_sub19.method9528(1578572558);
			float f = class536_sub19.method9531(1033057937) / 255.0F;
			D3DLIGHT.SetPosition(aLong11548, (float) class536_sub19.method9548(-1086148997), (float) class536_sub19.method9549(1904390290), (float) class536_sub19.method9551((byte) 0));
			D3DLIGHT.SetDiffuse(aLong11548, (float) (i_162_ >> 16 & 0xff) * f, (float) (i_162_ >> 8 & 0xff) * f, (float) (i_162_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(aLong11548, 0.0F, 0.0F, 1.0F / (float) (class536_sub19.method9530(-1849487201) * class536_sub19.method9530(-781632230)));
			D3DLIGHT.SetRange(aLong11548, (float) class536_sub19.method9530(-1067475036));
			IDirect3DDevice.SetLight(aLong11573, i_161_, aLong11548);
			IDirect3DDevice.LightEnable(aLong11573, i_161_, true);
		}
		for (/**/; i < anInt9630; i++)
			IDirect3DDevice.LightEnable(aLong11573, i + 2, false);
	}

	public void method8721(Class443 class443) {
		class443.method5390(aClass443_11556);
	}

	Interface39 method8932(int i, boolean bool, int[][] is) {
		return new Class408_Sub1(this, i, bool, is);
	}

	boolean method8845(Class155 class155, Class171 class171) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class284.method3779(IDirect3D.GetAdapterDisplayMode(aLong11540, anInt11559, d3ddisplaymode)) && Class284.method3779(IDirect3D.CheckDeviceFormat(aLong11540, anInt11559, anInt11539, d3ddisplaymode.Format, 0, 3, method10618(class155, class171))));
	}

	boolean method8923(Class155 class155, Class171 class171) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class284.method3779(IDirect3D.GetAdapterDisplayMode(aLong11540, anInt11559, d3ddisplaymode)) && Class284.method3779(IDirect3D.CheckDeviceFormat(aLong11540, anInt11559, anInt11539, d3ddisplaymode.Format, 0, 3, method10618(class155, class171))));
	}

	public Interface21 method2097(int i, int i_163_, int i_164_) {
		return new Class421(this, Class171.aClass171_1895, i, i_163_, i_164_);
	}

	Interface36 method8834(Class155 class155, int i, int i_165_, boolean bool, byte[] is, int i_166_, int i_167_) {
		return new Class408_Sub2(this, class155, i, i_165_, bool, is, i_166_, i_167_);
	}

	public final synchronized void method2378(int i) {
		for (int i_168_ = 0; i_168_ < anInt11572; i_168_++)
			IUnknown.Release(aLongArray11576[i_168_]);
		anInt11572 = 0;
		super.method2007(i);
	}

	Interface36 method8842(Class155 class155, int i, int i_169_, boolean bool, float[] fs, int i_170_, int i_171_) {
		return new Class408_Sub2(this, class155, i, i_169_, bool, fs, i_170_, i_171_);
	}

	public final void method8972(Class377 class377, int i, int i_172_, int i_173_, int i_174_) {
		if (aClass285_Sub1_11557 != null)
			aClass285_Sub1_11557.method9120();
		IDirect3DDevice.DrawIndexedPrimitive(aLong11573, method10626(class377), 0, i, i_172_, i_173_, i_174_);
	}

	Interface36 method8930(int i, int i_175_, boolean bool, int[] is, int i_176_, int i_177_) {
		return new Class408_Sub2(this, i, i_175_, bool, is, i_176_, i_177_);
	}

	Interface36 method8931(int i, int i_178_, boolean bool, int[] is, int i_179_, int i_180_) {
		return new Class408_Sub2(this, i, i_178_, bool, is, i_179_, i_180_);
	}

	Interface39 method8857(int i, boolean bool, int[][] is) {
		return new Class408_Sub1(this, i, bool, is);
	}

	public void method2186() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray11547[i] != 0L) {
				IUnknown.Release(aLongArray11547[i]);
				aLongArray11547[i] = 0L;
			}
		}
		anInt11580 = 0;
		anInt11579 = 0;
	}

	Interface39 method8933(int i, boolean bool, int[][] is) {
		return new Class408_Sub1(this, i, bool, is);
	}

	final void method8954(int i, Class379 class379, boolean bool) {
		if (aBool9704) {
			int i_181_ = 0;
			int i_182_;
			switch (i) {
			case 1:
				i_182_ = 6;
				break;
			case 2:
				i_182_ = 27;
				break;
			default:
				i_182_ = 5;
			}
			if (bool)
				i_181_ |= 0x10;
			IDirect3DDevice.SetTextureStageState(aLong11573, anInt9636, i_182_, (method10614(class379) | i_181_));
		}
	}

	public Interface21 method2386(int i, int i_183_) {
		return new Class421(this, Class171.aClass171_1895, i, i_183_, 0);
	}

	void method8847() {
		if (aClass183_1849 != null)
			IDirect3DDevice.SetViewport(aLong11573, anInt9609 + anInt9618, anInt9610 + anInt9547, anInt9607, anInt9608, aFloat9591, aFloat9592);
	}

	public void method8875() {
		if (aBoolArray11577[anInt9636]) {
			aBoolArray11577[anInt9636] = false;
			IDirect3DDevice.SetTexture(aLong11573, anInt9636, 0L);
			method8794();
			method8793();
		}
	}

	public String method2165() {
		String string = "Caps: 4:";
		String string_184_ = ":";
		string = new StringBuilder().append(string).append(anInt9568).append(string_184_).toString();
		string = new StringBuilder().append(string).append(anInt9690).append(string_184_).toString();
		string = new StringBuilder().append(string).append(anInt9539).append(string_184_).toString();
		string = new StringBuilder().append(string).append(aBool9695 ? 1 : 0).append(string_184_).toString();
		string = new StringBuilder().append(string).append(method8900() ? 1 : 0).append(string_184_).toString();
		string = new StringBuilder().append(string).append(method8710() ? 1 : 0).append(string_184_).toString();
		string = new StringBuilder().append(string).append(aBool9697 ? 1 : 0).append(string_184_).toString();
		string = new StringBuilder().append(string).append(aBool9622 ? 1 : 0).append(string_184_).toString();
		string = new StringBuilder().append(string).append(aBool11560 ? 1 : 0).append(string_184_).toString();
		string = new StringBuilder().append(string).append(aBool11563 ? 1 : 0).append(string_184_).toString();
		string = new StringBuilder().append(string).append(aBool11546 ? 1 : 0).append(string_184_).toString();
		string = new StringBuilder().append(string).append(aBool11561 ? 1 : 0).append(string_184_).toString();
		string = new StringBuilder().append(string).append(aBool9692 ? 1 : 0).append(string_184_).toString();
		string = new StringBuilder().append(string).append(aBool9658 ? 1 : 0).append(string_184_).toString();
		string = new StringBuilder().append(string).append(aBool9694 ? 1 : 0).append(string_184_).toString();
		string = new StringBuilder().append(string).append(aBool11564 ? 1 : 0).append(string_184_).toString();
		string = new StringBuilder().append(string).append(aBool11550 ? 1 : 0).append(string_184_).toString();
		string = new StringBuilder().append(string).append(aBool11566 ? 1 : 0).append(string_184_).toString();
		string = new StringBuilder().append(string).append(aBool9545 ? 1 : 0).append(string_184_).toString();
		string = new StringBuilder().append(string).append(aBool11567 ? 1 : 0).append(string_184_).toString();
		string = new StringBuilder().append(string).append(aBool11568 ? 1 : 0).toString();
		return string;
	}

	void method8921() {
		int i;
		for (i = 0; i < anInt9601; i++) {
			Class536_Sub19 class536_sub19 = aClass536_Sub19Array9534[i];
			int i_185_ = i + 2;
			int i_186_ = class536_sub19.method9528(1050963961);
			float f = class536_sub19.method9531(1928065157) / 255.0F;
			D3DLIGHT.SetPosition(aLong11548, (float) class536_sub19.method9548(-733603903), (float) class536_sub19.method9549(826762794), (float) class536_sub19.method9551((byte) 0));
			D3DLIGHT.SetDiffuse(aLong11548, (float) (i_186_ >> 16 & 0xff) * f, (float) (i_186_ >> 8 & 0xff) * f, (float) (i_186_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(aLong11548, 0.0F, 0.0F, 1.0F / (float) (class536_sub19.method9530(1641364878) * class536_sub19.method9530(-1794333012)));
			D3DLIGHT.SetRange(aLong11548, (float) class536_sub19.method9530(1009016596));
			IDirect3DDevice.SetLight(aLong11573, i_185_, aLong11548);
			IDirect3DDevice.LightEnable(aLong11573, i_185_, true);
		}
		for (/**/; i < anInt9630; i++)
			IDirect3DDevice.LightEnable(aLong11573, i + 2, false);
	}

	final void method8939(int i, Class379 class379, boolean bool, boolean bool_187_) {
		if (aBool9704) {
			int i_188_ = 0;
			int i_189_;
			switch (i) {
			case 2:
				i_189_ = 26;
				break;
			default:
				i_189_ = 2;
				break;
			case 1:
				i_189_ = 3;
			}
			if (bool)
				i_188_ |= 0x20;
			if (bool_187_)
				i_188_ |= 0x10;
			IDirect3DDevice.SetTextureStageState(aLong11573, anInt9636, i_189_, (method10614(class379) | i_188_));
		}
	}

	final void method8940(int i, Class379 class379, boolean bool, boolean bool_190_) {
		if (aBool9704) {
			int i_191_ = 0;
			int i_192_;
			switch (i) {
			case 2:
				i_192_ = 26;
				break;
			default:
				i_192_ = 2;
				break;
			case 1:
				i_192_ = 3;
			}
			if (bool)
				i_191_ |= 0x20;
			if (bool_190_)
				i_191_ |= 0x10;
			IDirect3DDevice.SetTextureStageState(aLong11573, anInt9636, i_192_, (method10614(class379) | i_191_));
		}
	}

	final void method8941(int i, Class379 class379, boolean bool, boolean bool_193_) {
		if (aBool9704) {
			int i_194_ = 0;
			int i_195_;
			switch (i) {
			case 2:
				i_195_ = 26;
				break;
			default:
				i_195_ = 2;
				break;
			case 1:
				i_195_ = 3;
			}
			if (bool)
				i_194_ |= 0x20;
			if (bool_193_)
				i_194_ |= 0x10;
			IDirect3DDevice.SetTextureStageState(aLong11573, anInt9636, i_195_, (method10614(class379) | i_194_));
		}
	}

	final void method8942(int i, Class379 class379, boolean bool) {
		if (aBool9704) {
			int i_196_ = 0;
			int i_197_;
			switch (i) {
			case 1:
				i_197_ = 6;
				break;
			case 2:
				i_197_ = 27;
				break;
			default:
				i_197_ = 5;
			}
			if (bool)
				i_196_ |= 0x10;
			IDirect3DDevice.SetTextureStageState(aLong11573, anInt9636, i_197_, (method10614(class379) | i_196_));
		}
	}

	Interface34 method8935(Class155 class155, int i, int i_198_, int i_199_, boolean bool, byte[] is) {
		return new Class408_Sub3(this, class155, i, i_198_, i_199_, bool, is);
	}

	final void method8836() {
		if (aBool9704)
			IDirect3DDevice.SetRenderState(aLong11573, 60, anInt9642);
	}

	void method8821() {
		if (aLong11558 == 0L && aClass367Array9639[anInt9636] != Class367.aClass367_3860) {
			if (aClass367Array9639[anInt9636] == Class367.aClass367_3861)
				IDirect3DDevice.SetTransform(aLong11573, 16 + anInt9636, aClass443Array9638[anInt9636].method5364(aFloatArray11570));
			else
				IDirect3DDevice.SetTransform(aLong11573, 16 + anInt9636, aClass443Array9638[anInt9636].method5377(aFloatArray11570));
			int i = method10615(aClass367Array9639[anInt9636]);
			if (i != anIntArray11565[anInt9636]) {
				IDirect3DDevice.SetTextureStageState(aLong11573, anInt9636, 24, i);
				anIntArray11565[anInt9636] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState(aLong11573, anInt9636, 24, 0);
			anIntArray11565[anInt9636] = 0;
		}
	}

	boolean method8855(Class155 class155, Class171 class171) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class284.method3779(IDirect3D.GetAdapterDisplayMode(aLong11540, anInt11559, d3ddisplaymode)) && Class284.method3779(IDirect3D.CheckDeviceFormat(aLong11540, anInt11559, anInt11539, d3ddisplaymode.Format, 0, 4, method10618(class155, class171))));
	}

	void method8928(int i) {
		if (!aBool11562) {
			int i_200_ = (i & 0x2) != 0 ? 2 : 3;
			IDirect3DDevice.SetRenderState(aLong11573, 8, i_200_);
		}
	}

	void method8832() {
		/* empty */
	}

	void method8977(int i) {
		IDirect3DDevice.SetRenderState(aLong11573, 168, i);
	}

	void method8950() {
		/* empty */
	}

	void method8824() {
		IDirect3DDevice.SetScissorRect(aLong11573, anInt9609 + anInt9599, anInt9610 + anInt9624, anInt9600, anInt9598);
	}

	void method8846() {
		if (aBool9704) {
			int i = (aBoolArray11577[anInt9636] ? method10612(aClass371Array9640[anInt9636]) : 1);
			IDirect3DDevice.SetTextureStageState(aLong11573, anInt9636, 1, i);
		}
	}

	Interface36 method8938(Class155 class155, int i, int i_201_, boolean bool, float[] fs, int i_202_, int i_203_) {
		return new Class408_Sub2(this, class155, i, i_201_, bool, fs, i_202_, i_203_);
	}

	boolean method8838(Class155 class155, Class171 class171) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class284.method3779(IDirect3D.GetAdapterDisplayMode(aLong11540, anInt11559, d3ddisplaymode)) && Class284.method3779(IDirect3D.CheckDeviceFormat(aLong11540, anInt11559, anInt11539, d3ddisplaymode.Format, 0, 4, method10618(class155, class171))));
	}

	void method8953() {
		if (aBool9704) {
			int i = (aBoolArray11577[anInt9636] ? method10612(aClass371Array9641[anInt9636]) : 1);
			IDirect3DDevice.SetTextureStageState(aLong11573, anInt9636, 4, i);
		}
	}

	void method8732() {
		if (aBool9704) {
			int i = (aBoolArray11577[anInt9636] ? method10612(aClass371Array9641[anInt9636]) : 1);
			IDirect3DDevice.SetTextureStageState(aLong11573, anInt9636, 4, i);
		}
	}

	void method8955() {
		IDirect3DDevice.method9304(aLong11573, 15, aBool9703);
		IDirect3DDevice.SetRenderState(aLong11573, 24, aByte9688 & 0xff);
		if (aD3DPRESENT_PARAMETERS11555.MultiSampleType > 0) {
			if (!aBool9703 || aByte9688 == 0) {
				if (aBool11566 || aBool11564)
					IDirect3DDevice.SetRenderState(aLong11573, 181, 0);
				else if (aBool11550)
					IDirect3DDevice.method9303(aLong11573, 154, 1.0F);
			} else if (aBool11566)
				IDirect3DDevice.SetRenderState(aLong11573, 181, method8819('S', 'S', 'A', 'A'));
			else if (aBool11564)
				IDirect3DDevice.SetRenderState(aLong11573, 181, method8819('A', 'T', 'O', 'C'));
			else if (aBool11550)
				IDirect3DDevice.SetRenderState(aLong11573, 154, method8819('A', '2', 'M', '1'));
		}
	}

	void method8956() {
		IDirect3DDevice.method9304(aLong11573, 15, aBool9703);
		IDirect3DDevice.SetRenderState(aLong11573, 24, aByte9688 & 0xff);
		if (aD3DPRESENT_PARAMETERS11555.MultiSampleType > 0) {
			if (!aBool9703 || aByte9688 == 0) {
				if (aBool11566 || aBool11564)
					IDirect3DDevice.SetRenderState(aLong11573, 181, 0);
				else if (aBool11550)
					IDirect3DDevice.method9303(aLong11573, 154, 1.0F);
			} else if (aBool11566)
				IDirect3DDevice.SetRenderState(aLong11573, 181, method8819('S', 'S', 'A', 'A'));
			else if (aBool11564)
				IDirect3DDevice.SetRenderState(aLong11573, 181, method8819('A', 'T', 'O', 'C'));
			else if (aBool11550)
				IDirect3DDevice.SetRenderState(aLong11573, 154, method8819('A', '2', 'M', '1'));
		}
	}

	void method8957() {
		IDirect3DDevice.method9304(aLong11573, 15, aBool9703);
		IDirect3DDevice.SetRenderState(aLong11573, 24, aByte9688 & 0xff);
		if (aD3DPRESENT_PARAMETERS11555.MultiSampleType > 0) {
			if (!aBool9703 || aByte9688 == 0) {
				if (aBool11566 || aBool11564)
					IDirect3DDevice.SetRenderState(aLong11573, 181, 0);
				else if (aBool11550)
					IDirect3DDevice.method9303(aLong11573, 154, 1.0F);
			} else if (aBool11566)
				IDirect3DDevice.SetRenderState(aLong11573, 181, method8819('S', 'S', 'A', 'A'));
			else if (aBool11564)
				IDirect3DDevice.SetRenderState(aLong11573, 181, method8819('A', 'T', 'O', 'C'));
			else if (aBool11550)
				IDirect3DDevice.SetRenderState(aLong11573, 154, method8819('A', '2', 'M', '1'));
		}
	}

	public void method2339(int i, int i_204_, int i_205_) {
		if (aLong11575 == 0L)
			method10621(i_204_, i_205_);
		long l = IDirect3DDevice.GetRenderTarget(aLong11573, 0);
		if (!Class284.method3778(IDirect3DDevice.StretchRect(aLong11573, l, 0, 0, aClass183_1849.method2725(), aClass183_1849.method2726(), aLong11575, anInt1872 * 1475697639, anInt1873 * 398729877, anInt1856 * -397142117, anInt1875 * -915384365, 2))) {
			/* empty */
		}
		IUnknown.Release(l);
		IDirect3DDevice.GetRenderTargetData(aLong11573, aLong11575, aLongArray11541[anInt11580]);
		long l_206_ = IDirect3DDevice.CreateEventQuery(aLong11573);
		if (Class284.method3779(IDirect3DEventQuery.Issue(l_206_)))
			aLongArray11547[anInt11580] = l_206_;
		anIntArray11578[anInt11580] = i;
		if (++anInt11580 >= 3)
			anInt11580 = 0;
	}

	void method8960() {
		switch (aClass365_9679.anInt3839) {
		case 3:
			IDirect3DDevice.SetRenderState(aLong11573, 19, 5);
			IDirect3DDevice.SetRenderState(aLong11573, 20, 6);
			break;
		case 0:
			IDirect3DDevice.SetRenderState(aLong11573, 19, 9);
			IDirect3DDevice.SetRenderState(aLong11573, 20, 2);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(aLong11573, 19, 2);
			IDirect3DDevice.SetRenderState(aLong11573, 20, 1);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(aLong11573, 19, 2);
			IDirect3DDevice.SetRenderState(aLong11573, 20, 2);
			break;
		}
		switch (anInt9560) {
		case 1:
			IDirect3DDevice.SetRenderState(aLong11573, 207, 2);
			IDirect3DDevice.SetRenderState(aLong11573, 208, 1);
			break;
		case 3:
			IDirect3DDevice.SetRenderState(aLong11573, 207, 1);
			IDirect3DDevice.SetRenderState(aLong11573, 208, 2);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(aLong11573, 207, 2);
			IDirect3DDevice.SetRenderState(aLong11573, 208, 2);
			break;
		case 0:
			IDirect3DDevice.SetRenderState(aLong11573, 207, 1);
			IDirect3DDevice.SetRenderState(aLong11573, 208, 1);
			break;
		}
	}

	void method8958() {
		if (aBool9704)
			IDirect3DDevice.method9304(aLong11573, 28, (aBool9671 && aBool9674 && anInt9550 >= 0));
	}

	final Interface41 method8854(boolean bool) {
		return new Class415(this, Class171.aClass171_1899, bool);
	}

	void method8835() {
		if (aBool9704) {
			int i = (aBoolArray11577[anInt9636] ? method10612(aClass371Array9641[anInt9636]) : 1);
			IDirect3DDevice.SetTextureStageState(aLong11573, anInt9636, 4, i);
		}
	}

	public void method8708(Class443 class443) {
		class443.method5390(aClass443_11556);
	}

	final Interface41 method8968(boolean bool) {
		return new Class415(this, Class171.aClass171_1899, bool);
	}

	final Interface41 method8952(boolean bool) {
		return new Class415(this, Class171.aClass171_1899, bool);
	}

	final Interface41 method8844(boolean bool) {
		return new Class415(this, Class171.aClass171_1899, bool);
	}

	final Interface38 method8961(boolean bool) {
		return new Class413(this, bool);
	}

	Class343 method8962(Class362[] class362s) {
		return new Class343_Sub1(this, class362s);
	}

	Class343 method8848(Class362[] class362s) {
		return new Class343_Sub1(this, class362s);
	}

	public void method8964(int i, Interface38 interface38) {
		Class413 class413 = (Class413) interface38;
		IDirect3DDevice.SetStreamSource(aLong11573, i, class413.aLong4397, 0, class413.method5015());
	}

	public void method8839(int i, Interface38 interface38) {
		Class413 class413 = (Class413) interface38;
		IDirect3DDevice.SetStreamSource(aLong11573, i, class413.aLong4397, 0, class413.method5015());
	}

	public void method8965(int i, Interface38 interface38) {
		Class413 class413 = (Class413) interface38;
		IDirect3DDevice.SetStreamSource(aLong11573, i, class413.aLong4397, 0, class413.method5015());
	}

	public void method8810(int i, Interface38 interface38) {
		Class413 class413 = (Class413) interface38;
		IDirect3DDevice.SetStreamSource(aLong11573, i, class413.aLong4397, 0, class413.method5015());
	}

	public void method2134(boolean bool) {
		/* empty */
	}

	void method8891() {
		if (aLong11558 == 0L && aClass367Array9639[anInt9636] != Class367.aClass367_3860) {
			if (aClass367Array9639[anInt9636] == Class367.aClass367_3861)
				IDirect3DDevice.SetTransform(aLong11573, 16 + anInt9636, aClass443Array9638[anInt9636].method5364(aFloatArray11570));
			else
				IDirect3DDevice.SetTransform(aLong11573, 16 + anInt9636, aClass443Array9638[anInt9636].method5377(aFloatArray11570));
			int i = method10615(aClass367Array9639[anInt9636]);
			if (i != anIntArray11565[anInt9636]) {
				IDirect3DDevice.SetTextureStageState(aLong11573, anInt9636, 24, i);
				anIntArray11565[anInt9636] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState(aLong11573, anInt9636, 24, 0);
			anIntArray11565[anInt9636] = 0;
		}
	}

	public void method2291() {
		if (aLong11575 != 0L) {
			IUnknown.Release(aLong11575);
			aLong11575 = 0L;
		}
		for (int i = 0; i < 3; i++) {
			if (aLongArray11547[i] != 0L) {
				IUnknown.Release(aLongArray11547[i]);
				aLongArray11547[i] = 0L;
			}
			if (aLongArray11541[i] != 0L) {
				IUnknown.Release(aLongArray11541[i]);
				aLongArray11541[i] = 0L;
			}
		}
		anInt11580 = 0;
		anInt11579 = 0;
	}

	void method8893() {
		if (aClass183_1849 != null)
			IDirect3DDevice.SetViewport(aLong11573, anInt9609 + anInt9618, anInt9610 + anInt9547, anInt9607, anInt9608, aFloat9591, aFloat9592);
	}

	void method2138(int i, int i_207_) throws Exception_Sub5 {
		if (aBool11545) {
			if (!method10607(aClass183_Sub1_1866.method2725(), aClass183_Sub1_1866.method2726()))
				return;
			((Class183_Sub1_Sub1_Sub1) aClass183_Sub1_1866).method353();
		} else
			IDirect3DDevice.EndScene(aLong11573);
		int i_208_ = aClass183_Sub1_1866.method8650();
		if (Class284.method3778(i_208_)) {
			aBool11545 = true;
			aClass183_Sub1_1866.method131();
		} else {
			IDirect3DDevice.BeginScene(aLong11573);
			if (anInterface24_1851 != null)
				anInterface24_1851.method29(1801382486);
		}
	}

	public final void method8971(Class377 class377, int i, int i_209_, int i_210_, int i_211_) {
		if (aClass285_Sub1_11557 != null)
			aClass285_Sub1_11557.method9120();
		IDirect3DDevice.DrawIndexedPrimitive(aLong11573, method10626(class377), 0, i, i_209_, i_210_, i_211_);
	}

	void method8919() {
		int i;
		for (i = 0; i < anInt9601; i++) {
			Class536_Sub19 class536_sub19 = aClass536_Sub19Array9534[i];
			int i_212_ = i + 2;
			int i_213_ = class536_sub19.method9528(1125145104);
			float f = class536_sub19.method9531(-1215025285) / 255.0F;
			D3DLIGHT.SetPosition(aLong11548, (float) class536_sub19.method9548(-213926141), (float) class536_sub19.method9549(1367794804), (float) class536_sub19.method9551((byte) 0));
			D3DLIGHT.SetDiffuse(aLong11548, (float) (i_213_ >> 16 & 0xff) * f, (float) (i_213_ >> 8 & 0xff) * f, (float) (i_213_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(aLong11548, 0.0F, 0.0F, 1.0F / (float) (class536_sub19.method9530(1836764880) * class536_sub19.method9530(-1741394859)));
			D3DLIGHT.SetRange(aLong11548, (float) class536_sub19.method9530(1327376006));
			IDirect3DDevice.SetLight(aLong11573, i_212_, aLong11548);
			IDirect3DDevice.LightEnable(aLong11573, i_212_, true);
		}
		for (/**/; i < anInt9630; i++)
			IDirect3DDevice.LightEnable(aLong11573, i + 2, false);
	}

	public boolean method8900() {
		return (aD3DCAPS11542.VertexShaderVersion & 0xffff) >= 257;
	}

	public void method8901(Class443 class443) {
		class443.method5390(aClass443_11556);
	}

	void method8793() {
		if (aBool9704) {
			int i = (aBoolArray11577[anInt9636] ? method10612(aClass371Array9640[anInt9636]) : 1);
			IDirect3DDevice.SetTextureStageState(aLong11573, anInt9636, 1, i);
		}
	}

	void method8890() {
		IDirect3DDevice.method9304(aLong11573, 27, aBool9554);
	}

	void method8802() {
		if (aBool9704)
			IDirect3DDevice.method9304(aLong11573, 28, (aBool9671 && aBool9674 && anInt9550 >= 0));
	}

	final void method8825(Interface41 interface41, Class377 class377, int i, int i_214_, int i_215_, int i_216_) {
		if (aClass285_Sub1_11557 != null)
			aClass285_Sub1_11557.method9120();
		IDirect3DDevice.DrawIndexedPrimitiveIB(aLong11573, (((Class415) interface41).aLong4532), 4, 0, i, i_214_, i_215_, i_216_);
	}

	void method8974(int i) {
		if (!aBool11562) {
			int i_217_ = (i & 0x2) != 0 ? 2 : 3;
			IDirect3DDevice.SetRenderState(aLong11573, 8, i_217_);
		}
	}

	final void method8785(int i, Class379 class379, boolean bool, boolean bool_218_) {
		if (aBool9704) {
			int i_219_ = 0;
			int i_220_;
			switch (i) {
			case 2:
				i_220_ = 26;
				break;
			default:
				i_220_ = 2;
				break;
			case 1:
				i_220_ = 3;
			}
			if (bool)
				i_219_ |= 0x20;
			if (bool_218_)
				i_219_ |= 0x10;
			IDirect3DDevice.SetTextureStageState(aLong11573, anInt9636, i_220_, (method10614(class379) | i_219_));
		}
	}

	void method8967(Interface41 interface41) {
		IDirect3DDevice.SetIndices(aLong11573, ((Class415) interface41).aLong4532);
	}

	public Class183_Sub2 method2094() {
		return new Class183_Sub2_Sub2_Sub2(this);
	}

	public String method2018() {
		String string = "Caps: 4:";
		String string_221_ = ":";
		string = new StringBuilder().append(string).append(anInt9568).append(string_221_).toString();
		string = new StringBuilder().append(string).append(anInt9690).append(string_221_).toString();
		string = new StringBuilder().append(string).append(anInt9539).append(string_221_).toString();
		string = new StringBuilder().append(string).append(aBool9695 ? 1 : 0).append(string_221_).toString();
		string = new StringBuilder().append(string).append(method8900() ? 1 : 0).append(string_221_).toString();
		string = new StringBuilder().append(string).append(method8710() ? 1 : 0).append(string_221_).toString();
		string = new StringBuilder().append(string).append(aBool9697 ? 1 : 0).append(string_221_).toString();
		string = new StringBuilder().append(string).append(aBool9622 ? 1 : 0).append(string_221_).toString();
		string = new StringBuilder().append(string).append(aBool11560 ? 1 : 0).append(string_221_).toString();
		string = new StringBuilder().append(string).append(aBool11563 ? 1 : 0).append(string_221_).toString();
		string = new StringBuilder().append(string).append(aBool11546 ? 1 : 0).append(string_221_).toString();
		string = new StringBuilder().append(string).append(aBool11561 ? 1 : 0).append(string_221_).toString();
		string = new StringBuilder().append(string).append(aBool9692 ? 1 : 0).append(string_221_).toString();
		string = new StringBuilder().append(string).append(aBool9658 ? 1 : 0).append(string_221_).toString();
		string = new StringBuilder().append(string).append(aBool9694 ? 1 : 0).append(string_221_).toString();
		string = new StringBuilder().append(string).append(aBool11564 ? 1 : 0).append(string_221_).toString();
		string = new StringBuilder().append(string).append(aBool11550 ? 1 : 0).append(string_221_).toString();
		string = new StringBuilder().append(string).append(aBool11566 ? 1 : 0).append(string_221_).toString();
		string = new StringBuilder().append(string).append(aBool9545 ? 1 : 0).append(string_221_).toString();
		string = new StringBuilder().append(string).append(aBool11567 ? 1 : 0).append(string_221_).toString();
		string = new StringBuilder().append(string).append(aBool11568 ? 1 : 0).toString();
		return string;
	}

	void method8978(int i) {
		IDirect3DDevice.SetRenderState(aLong11573, 168, i);
	}

	void method8979() {
		IDirect3DDevice.method9304(aLong11573, 27, aBool9554);
	}

	boolean method8769(Class155 class155, Class171 class171) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class284.method3779(IDirect3D.GetAdapterDisplayMode(aLong11540, anInt11559, d3ddisplaymode)) && Class284.method3779(IDirect3D.CheckDeviceFormat(aLong11540, anInt11559, anInt11539, d3ddisplaymode.Format, 0, 3, method10618(class155, class171))));
	}

	void method2341() {
		super.finalize();
	}

	void method8980(boolean bool) {
		IDirect3DDevice.method9304(aLong11573, 161, bool);
	}

	public void finalize() {
		super.finalize();
	}

	public void method8982(Class343 class343) {
		Class343_Sub1 class343_sub1 = (Class343_Sub1) class343;
		IDirect3DDevice.SetVertexDeclaration(aLong11573, class343_sub1.aLong10222);
	}

	public void method8983(Class343 class343) {
		Class343_Sub1 class343_sub1 = (Class343_Sub1) class343;
		IDirect3DDevice.SetVertexDeclaration(aLong11573, class343_sub1.aLong10222);
	}

	public final void method8723(Class377 class377, int i, int i_222_) {
		if (aClass285_Sub1_11557 != null)
			aClass285_Sub1_11557.method9120();
		IDirect3DDevice.DrawPrimitive(aLong11573, method10626(class377), i, i_222_);
	}

	public void method2348(int i, int i_223_, int i_224_) {
		if (aLong11575 == 0L)
			method10621(i_223_, i_224_);
		long l = IDirect3DDevice.GetRenderTarget(aLong11573, 0);
		if (!Class284.method3778(IDirect3DDevice.StretchRect(aLong11573, l, 0, 0, aClass183_1849.method2725(), aClass183_1849.method2726(), aLong11575, anInt1872 * 1475697639, anInt1873 * 398729877, anInt1856 * -397142117, anInt1875 * -915384365, 2))) {
			/* empty */
		}
		IUnknown.Release(l);
		IDirect3DDevice.GetRenderTargetData(aLong11573, aLong11575, aLongArray11541[anInt11580]);
		long l_225_ = IDirect3DDevice.CreateEventQuery(aLong11573);
		if (Class284.method3779(IDirect3DEventQuery.Issue(l_225_)))
			aLongArray11547[anInt11580] = l_225_;
		anIntArray11578[anInt11580] = i;
		if (++anInt11580 >= 3)
			anInt11580 = 0;
	}

	public boolean method2179() {
		return true;
	}

	static final int method10626(Class377 class377) {
		switch (class377.anInt3920) {
		case 1:
			return 1;
		case 2:
			return 3;
		case 0:
			return 5;
		case 5:
			return 6;
		case 4:
			return 4;
		case 3:
			return 2;
		default:
			throw new IllegalArgumentException("");
		}
	}
}
