/* Class416_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.Class276;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class416_Sub1_Sub1 extends Class416_Sub1 implements Interface40 {
	public void method253(int i, int i_0_, int i_1_, int i_2_, int[] is, int i_3_, int i_4_) {
		super.method227(i, i_0_, i_1_, i_2_, is, i_3_, i_4_);
	}

	public void method252(int i, int i_5_, int i_6_, int i_7_, byte[] is, Class157 class157, int i_8_, int i_9_) {
		super.method228(i, i_5_, i_6_, i_7_, is, class157, i_8_, i_9_);
	}

	public float method264(float f) {
		return super.method264(f);
	}

	public void method230(int i, int i_10_, int i_11_, int i_12_, int[] is, int[] is_13_, int i_14_) {
		super.method230(i, i_10_, i_11_, i_12_, is, is_13_, i_14_);
	}

	public int method1() {
		return super.method1();
	}

	public int method87() {
		return super.method87();
	}

	public float method224(float f) {
		return super.method224(f);
	}

	public float method242(float f) {
		return super.method264(f);
	}

	public void method228(int i, int i_15_, int i_16_, int i_17_, byte[] is, Class157 class157, int i_18_, int i_19_) {
		super.method228(i, i_15_, i_16_, i_17_, is, class157, i_18_, i_19_);
	}

	public boolean method236() {
		return super.method260();
	}

	public void method227(int i, int i_20_, int i_21_, int i_22_, int[] is, int i_23_, int i_24_) {
		super.method227(i, i_20_, i_21_, i_22_, is, i_23_, i_24_);
	}

	public float method261() {
		return super.method222();
	}

	public boolean method207() {
		return super.method207();
	}

	public void method231(int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_) {
		super.method231(i, i_25_, i_26_, i_27_, i_28_, i_29_);
	}

	public float method233() {
		return super.method233();
	}

	Class416_Sub1_Sub1(Class180_Sub2_Sub2 class180_sub2_sub2, Class157 class157, Class184 class184, int i, int i_30_) {
		super(class180_sub2_sub2, class157, class184, i, i_30_, 1025, 0);
	}

	public boolean method260() {
		return super.method260();
	}

	public void method265(boolean bool, boolean bool_31_) {
		super.method226(bool, bool_31_);
	}

	public void method273(Class343 class343) {
		super.method273(class343);
	}

	public void method276() {
		super.method277();
	}

	public float method222() {
		return super.method222();
	}

	public Interface21 method269(int i) {
		return new Class401(this, i);
	}

	public int method62() {
		return super.method87();
	}

	public int method237() {
		return super.method87();
	}

	public int method238() {
		return super.method87();
	}

	public int method239() {
		return super.method87();
	}

	public float method255() {
		return super.method222();
	}

	public int method187() {
		return super.method87();
	}

	public float method241(float f) {
		return super.method224(f);
	}

	public void method229(int i, int i_32_, int i_33_, int i_34_, int[] is, int i_35_) {
		long l = IDirect3DTexture.GetSurfaceLevel(aLong4518, 0);
		long l_36_ = IDirect3DDevice.CreateRenderTarget((aClass180_Sub2_Sub2_4516.aLong11572), i_33_, i_34_, 21, 0, 0, true);
		aClass180_Sub2_Sub2_4516.method15097(i_34_ * i_33_ * 4);
		if (Class276.method5145(IDirect3DDevice.StretchRect(aClass180_Sub2_Sub2_4516.aLong11572, l, i, i_32_, i_33_, i_34_, l_36_, 0, 0, i_33_, i_34_, 1))) {
			IDirect3DSurface.Download(l_36_, 0, 0, i_33_, i_34_, i_33_ * 4, 16, aClass180_Sub2_Sub2_4516.aLong9439);
			aClass180_Sub2_Sub2_4516.aByteBuffer9438.clear();
			aClass180_Sub2_Sub2_4516.aByteBuffer9438.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_36_);
	}

	public float method243(float f) {
		return super.method264(f);
	}

	public boolean method244() {
		return super.method207();
	}

	public boolean method245() {
		return super.method207();
	}

	public boolean method246() {
		return super.method207();
	}

	public void method258(int i, int i_37_, int i_38_, int i_39_, int[] is, int i_40_) {
		long l = IDirect3DTexture.GetSurfaceLevel(aLong4518, 0);
		long l_41_ = IDirect3DDevice.CreateRenderTarget((aClass180_Sub2_Sub2_4516.aLong11572), i_38_, i_39_, 21, 0, 0, true);
		aClass180_Sub2_Sub2_4516.method15097(i_39_ * i_38_ * 4);
		if (Class276.method5145(IDirect3DDevice.StretchRect(aClass180_Sub2_Sub2_4516.aLong11572, l, i, i_37_, i_38_, i_39_, l_41_, 0, 0, i_38_, i_39_, 1))) {
			IDirect3DSurface.Download(l_41_, 0, 0, i_38_, i_39_, i_38_ * 4, 16, aClass180_Sub2_Sub2_4516.aLong9439);
			aClass180_Sub2_Sub2_4516.aByteBuffer9438.clear();
			aClass180_Sub2_Sub2_4516.aByteBuffer9438.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_41_);
	}

	public void method277() {
		super.method277();
	}

	public void method248(int i, int i_42_, int i_43_, int i_44_, int[] is, int i_45_, int i_46_) {
		super.method227(i, i_42_, i_43_, i_44_, is, i_45_, i_46_);
	}

	public void method249(int i, int i_47_, int i_48_, int i_49_, byte[] is, Class157 class157, int i_50_, int i_51_) {
		super.method228(i, i_47_, i_48_, i_49_, is, class157, i_50_, i_51_);
	}

	public void method223(int i, int i_52_, int i_53_, int i_54_, byte[] is, Class157 class157, int i_55_, int i_56_) {
		super.method228(i, i_52_, i_53_, i_54_, is, class157, i_55_, i_56_);
	}

	public void method130() {
		super.method129();
	}

	public void method225(int i, int i_57_, int i_58_, int i_59_, byte[] is, Class157 class157, int i_60_, int i_61_) {
		super.method228(i, i_57_, i_58_, i_59_, is, class157, i_60_, i_61_);
	}

	public void method254(int i, int i_62_, int i_63_, int i_64_, int[] is, int[] is_65_, int i_66_) {
		super.method230(i, i_62_, i_63_, i_64_, is, is_65_, i_66_);
	}

	public void method232(int i, int i_67_, int i_68_, int i_69_, int[] is, int[] is_70_, int i_71_) {
		super.method230(i, i_67_, i_68_, i_69_, is, is_70_, i_71_);
	}

	public void method256(int i, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_) {
		super.method231(i, i_72_, i_73_, i_74_, i_75_, i_76_);
	}

	public float method257() {
		return super.method233();
	}

	public float method262() {
		return super.method233();
	}

	public float method259() {
		return super.method222();
	}

	public void method129() {
		super.method129();
	}

	public int method263() {
		return super.method87();
	}

	public boolean method240() {
		return super.method260();
	}

	public int method72() {
		return super.method1();
	}

	public void method275() {
		super.method277();
	}

	public int method235() {
		return super.method1();
	}

	public void method274(Class343 class343) {
		super.method273(class343);
	}

	public void method226(boolean bool, boolean bool_77_) {
		super.method226(bool, bool_77_);
	}

	public void method247(int i, int i_78_, int i_79_, int i_80_, int[] is, int i_81_, int i_82_) {
		super.method227(i, i_78_, i_79_, i_80_, is, i_81_, i_82_);
	}

	public Interface21 method272(int i) {
		return new Class401(this, i);
	}

	public void method251(int i, int i_83_, int i_84_, int i_85_, int[] is, int i_86_) {
		long l = IDirect3DTexture.GetSurfaceLevel(aLong4518, 0);
		long l_87_ = IDirect3DDevice.CreateRenderTarget((aClass180_Sub2_Sub2_4516.aLong11572), i_84_, i_85_, 21, 0, 0, true);
		aClass180_Sub2_Sub2_4516.method15097(i_85_ * i_84_ * 4);
		if (Class276.method5145(IDirect3DDevice.StretchRect(aClass180_Sub2_Sub2_4516.aLong11572, l, i, i_83_, i_84_, i_85_, l_87_, 0, 0, i_84_, i_85_, 1))) {
			IDirect3DSurface.Download(l_87_, 0, 0, i_84_, i_85_, i_84_ * 4, 16, aClass180_Sub2_Sub2_4516.aLong9439);
			aClass180_Sub2_Sub2_4516.aByteBuffer9438.clear();
			aClass180_Sub2_Sub2_4516.aByteBuffer9438.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_87_);
	}

	public void method266(int i, int i_88_, int i_89_, int i_90_, int[] is, int i_91_) {
		long l = IDirect3DTexture.GetSurfaceLevel(aLong4518, 0);
		long l_92_ = IDirect3DDevice.CreateRenderTarget((aClass180_Sub2_Sub2_4516.aLong11572), i_89_, i_90_, 21, 0, 0, true);
		aClass180_Sub2_Sub2_4516.method15097(i_90_ * i_89_ * 4);
		if (Class276.method5145(IDirect3DDevice.StretchRect(aClass180_Sub2_Sub2_4516.aLong11572, l, i, i_88_, i_89_, i_90_, l_92_, 0, 0, i_89_, i_90_, 1))) {
			IDirect3DSurface.Download(l_92_, 0, 0, i_89_, i_90_, i_89_ * 4, 16, aClass180_Sub2_Sub2_4516.aLong9439);
			aClass180_Sub2_Sub2_4516.aByteBuffer9438.clear();
			aClass180_Sub2_Sub2_4516.aByteBuffer9438.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_92_);
	}

	public void method250(int i, int i_93_, int i_94_, int i_95_, int[] is, int i_96_) {
		long l = IDirect3DTexture.GetSurfaceLevel(aLong4518, 0);
		long l_97_ = IDirect3DDevice.CreateRenderTarget((aClass180_Sub2_Sub2_4516.aLong11572), i_94_, i_95_, 21, 0, 0, true);
		aClass180_Sub2_Sub2_4516.method15097(i_95_ * i_94_ * 4);
		if (Class276.method5145(IDirect3DDevice.StretchRect(aClass180_Sub2_Sub2_4516.aLong11572, l, i, i_93_, i_94_, i_95_, l_97_, 0, 0, i_94_, i_95_, 1))) {
			IDirect3DSurface.Download(l_97_, 0, 0, i_94_, i_95_, i_94_ * 4, 16, aClass180_Sub2_Sub2_4516.aLong9439);
			aClass180_Sub2_Sub2_4516.aByteBuffer9438.clear();
			aClass180_Sub2_Sub2_4516.aByteBuffer9438.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_97_);
	}

	public Interface21 method271(int i) {
		return new Class401(this, i);
	}

	public void method234(int i, int i_98_, int i_99_, int i_100_, int[] is, int i_101_) {
		long l = IDirect3DTexture.GetSurfaceLevel(aLong4518, 0);
		long l_102_ = IDirect3DDevice.CreateRenderTarget((aClass180_Sub2_Sub2_4516.aLong11572), i_99_, i_100_, 21, 0, 0, true);
		aClass180_Sub2_Sub2_4516.method15097(i_100_ * i_99_ * 4);
		if (Class276.method5145(IDirect3DDevice.StretchRect(aClass180_Sub2_Sub2_4516.aLong11572, l, i, i_98_, i_99_, i_100_, l_102_, 0, 0, i_99_, i_100_, 1))) {
			IDirect3DSurface.Download(l_102_, 0, 0, i_99_, i_100_, i_99_ * 4, 16, aClass180_Sub2_Sub2_4516.aLong9439);
			aClass180_Sub2_Sub2_4516.aByteBuffer9438.clear();
			aClass180_Sub2_Sub2_4516.aByteBuffer9438.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_102_);
	}

	public void method267(boolean bool, boolean bool_103_) {
		super.method226(bool, bool_103_);
	}

	public void method268(boolean bool, boolean bool_104_) {
		super.method226(bool, bool_104_);
	}

	public Interface21 method270(int i) {
		return new Class401(this, i);
	}
}
