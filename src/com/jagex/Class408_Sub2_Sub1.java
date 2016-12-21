/* Class408_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.Class284;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class408_Sub2_Sub1 extends Class408_Sub2 implements Interface44 {
	public float method260() {
		return super.method261();
	}

	public Interface22 method331(int i) {
		return new Class407(this, i);
	}

	public float method250() {
		return super.method244();
	}

	public int method232() {
		return super.method78();
	}

	public boolean method236() {
		return super.method230();
	}

	public int method78() {
		return super.method78();
	}

	public void method242(int i, int i_0_, int i_1_, int i_2_, int[] is, int[] is_3_, int i_4_) {
		super.method226(i, i_0_, i_1_, i_2_, is, is_3_, i_4_);
	}

	public float method220(float f) {
		return super.method220(f);
	}

	public boolean method221() {
		return super.method221();
	}

	public void method222(boolean bool, boolean bool_5_) {
		super.method222(bool, bool_5_);
	}

	public void method223(int i, int i_6_, int i_7_, int i_8_, int[] is, int i_9_, int i_10_) {
		super.method223(i, i_6_, i_7_, i_8_, is, i_9_, i_10_);
	}

	public void method224(int i, int i_11_, int i_12_, int i_13_, byte[] is, Class155 class155, int i_14_, int i_15_) {
		super.method224(i, i_11_, i_12_, i_13_, is, class155, i_14_, i_15_);
	}

	public void method226(int i, int i_16_, int i_17_, int i_18_, int[] is, int[] is_19_, int i_20_) {
		super.method226(i, i_16_, i_17_, i_18_, is, is_19_, i_20_);
	}

	public void method231(int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_) {
		super.method231(i, i_21_, i_22_, i_23_, i_24_, i_25_);
	}

	public float method261() {
		return super.method261();
	}

	public float method244() {
		return super.method244();
	}

	public boolean method230() {
		return super.method230();
	}

	public void method275() {
		super.method275();
	}

	public void method274(Class342 class342) {
		super.method274(class342);
	}

	public void method130() {
		super.method131();
	}

	public void method129() {
		super.method131();
	}

	public int method262() {
		return super.method1();
	}

	public void method277() {
		super.method275();
	}

	public int method228() {
		return super.method78();
	}

	public float method256(float f) {
		return super.method220(f);
	}

	public float method235(float f) {
		return super.method219(f);
	}

	public float method227(float f) {
		return super.method219(f);
	}

	public int method1() {
		return super.method1();
	}

	public void method240(int i, int i_26_, int i_27_, int i_28_, int[] is, int i_29_, int i_30_) {
		super.method223(i, i_26_, i_27_, i_28_, is, i_29_, i_30_);
	}

	Class408_Sub2_Sub1(Class167_Sub3_Sub2 class167_sub3_sub2, Class155 class155, Class171 class171, int i, int i_31_) {
		super(class167_sub3_sub2, class155, class171, i, i_31_, 1025, 0);
	}

	public void method241(int i, int i_32_, int i_33_, int i_34_, byte[] is, Class155 class155, int i_35_, int i_36_) {
		super.method224(i, i_32_, i_33_, i_34_, is, class155, i_35_, i_36_);
	}

	public void method248(int i, int i_37_, int i_38_, int i_39_, int[] is, int i_40_) {
		long l = IDirect3DTexture.GetSurfaceLevel(aLong4306, 0);
		long l_41_ = IDirect3DDevice.CreateRenderTarget((aClass167_Sub3_Sub2_4302.aLong11573), i_38_, i_39_, 21, 0, 0, true);
		aClass167_Sub3_Sub2_4302.method8713(i_39_ * i_38_ * 4);
		if (Class284.method3779(IDirect3DDevice.StretchRect(aClass167_Sub3_Sub2_4302.aLong11573, l, i, i_37_, i_38_, i_39_, l_41_, 0, 0, i_38_, i_39_, 1))) {
			IDirect3DSurface.Download(l_41_, 0, 0, i_38_, i_39_, i_38_ * 4, 16, aClass167_Sub3_Sub2_4302.aLong9586);
			aClass167_Sub3_Sub2_4302.aByteBuffer9549.clear();
			aClass167_Sub3_Sub2_4302.aByteBuffer9549.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_41_);
	}

	public float method233() {
		return super.method261();
	}

	public void method253(int i, int i_42_, int i_43_, int i_44_, int[] is, int[] is_45_, int i_46_) {
		super.method226(i, i_42_, i_43_, i_44_, is, is_45_, i_46_);
	}

	public void method251(int i, int i_47_, int i_48_, int i_49_, int[] is, int[] is_50_, int i_51_) {
		super.method226(i, i_47_, i_48_, i_49_, is, is_50_, i_51_);
	}

	public void method245(int i, int i_52_, int i_53_, int i_54_, int[] is, int[] is_55_, int i_56_) {
		super.method226(i, i_52_, i_53_, i_54_, is, is_55_, i_56_);
	}

	public void method229(int i, int i_57_, int i_58_, int i_59_, int[] is, int[] is_60_, int i_61_) {
		super.method226(i, i_57_, i_58_, i_59_, is, is_60_, i_61_);
	}

	public void method247(int i, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_) {
		super.method231(i, i_62_, i_63_, i_64_, i_65_, i_66_);
	}

	public int method234() {
		return super.method78();
	}

	public float method246() {
		return super.method261();
	}

	public float method249() {
		return super.method244();
	}

	public float method225() {
		return super.method244();
	}

	public boolean method252() {
		return super.method230();
	}

	public float method219(float f) {
		return super.method219(f);
	}

	public boolean method254() {
		return super.method230();
	}

	public void method276() {
		super.method275();
	}

	public boolean method238() {
		return super.method221();
	}

	public void method278(Class342 class342) {
		super.method274(class342);
	}

	public void method279(Class342 class342) {
		super.method274(class342);
	}

	public Interface22 method330(int i) {
		return new Class407(this, i);
	}

	public float method255(float f) {
		return super.method220(f);
	}

	public void method239(boolean bool, boolean bool_67_) {
		super.method222(bool, bool_67_);
	}

	public void method258(int i, int i_68_, int i_69_, int i_70_, int[] is, int i_71_, int i_72_) {
		super.method223(i, i_68_, i_69_, i_70_, is, i_71_, i_72_);
	}

	public void method257(int i, int i_73_, int i_74_, int i_75_, int[] is, int i_76_, int i_77_) {
		super.method223(i, i_73_, i_74_, i_75_, is, i_76_, i_77_);
	}

	public boolean method237() {
		return super.method221();
	}

	public void method259(int i, int i_78_, int i_79_, int i_80_, int[] is, int i_81_, int i_82_) {
		super.method223(i, i_78_, i_79_, i_80_, is, i_81_, i_82_);
	}

	public void method243(int i, int i_83_, int i_84_, int i_85_, int[] is, int i_86_) {
		long l = IDirect3DTexture.GetSurfaceLevel(aLong4306, 0);
		long l_87_ = IDirect3DDevice.CreateRenderTarget((aClass167_Sub3_Sub2_4302.aLong11573), i_84_, i_85_, 21, 0, 0, true);
		aClass167_Sub3_Sub2_4302.method8713(i_85_ * i_84_ * 4);
		if (Class284.method3779(IDirect3DDevice.StretchRect(aClass167_Sub3_Sub2_4302.aLong11573, l, i, i_83_, i_84_, i_85_, l_87_, 0, 0, i_84_, i_85_, 1))) {
			IDirect3DSurface.Download(l_87_, 0, 0, i_84_, i_85_, i_84_ * 4, 16, aClass167_Sub3_Sub2_4302.aLong9586);
			aClass167_Sub3_Sub2_4302.aByteBuffer9549.clear();
			aClass167_Sub3_Sub2_4302.aByteBuffer9549.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_87_);
	}

	public void method131() {
		super.method131();
	}

	public void method218(int i, int i_88_, int i_89_, int i_90_, int i_91_, int i_92_) {
		super.method231(i, i_88_, i_89_, i_90_, i_91_, i_92_);
	}
}
