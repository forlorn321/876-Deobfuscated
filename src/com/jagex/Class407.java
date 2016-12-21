/* Class407 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class407 implements Interface53, Interface50 {
	long aLong4299;
	int anInt4300;
	Class408_Sub2_Sub1 aClass408_Sub2_Sub1_4301;

	public void method130() {
		if (aLong4299 != 0L) {
			IUnknown.Release(aLong4299);
			aLong4299 = 0L;
		}
		aClass408_Sub2_Sub1_4301.aClass167_Sub3_Sub2_4302.method8936(this);
	}

	public int method1() {
		return aClass408_Sub2_Sub1_4301.method1();
	}

	public int method78() {
		return aClass408_Sub2_Sub1_4301.method78();
	}

	public void method129() {
		if (aLong4299 != 0L) {
			IUnknown.Release(aLong4299);
			aLong4299 = 0L;
		}
		aClass408_Sub2_Sub1_4301.aClass167_Sub3_Sub2_4302.method8936(this);
	}

	public void method131() {
		if (aLong4299 != 0L) {
			IUnknown.Release(aLong4299);
			aLong4299 = 0L;
		}
		aClass408_Sub2_Sub1_4301.aClass167_Sub3_Sub2_4302.method8936(this);
	}

	public void method345() {
		if (aLong4299 != 0L) {
			aClass408_Sub2_Sub1_4301.aClass167_Sub3_Sub2_4302.method10620(aLong4299);
			aLong4299 = 0L;
		}
	}

	public void finalize() {
		method345();
	}

	public long method347() {
		if (aLong4299 == 0L)
			aLong4299 = IDirect3DTexture.GetSurfaceLevel((aClass408_Sub2_Sub1_4301.aLong4306), anInt4300);
		return aLong4299;
	}

	public int method73() {
		return aClass408_Sub2_Sub1_4301.method1();
	}

	public int method82() {
		return aClass408_Sub2_Sub1_4301.method1();
	}

	public int method83() {
		return aClass408_Sub2_Sub1_4301.method78();
	}

	public long method348() {
		if (aLong4299 == 0L)
			aLong4299 = IDirect3DTexture.GetSurfaceLevel((aClass408_Sub2_Sub1_4301.aLong4306), anInt4300);
		return aLong4299;
	}

	public int method9() {
		return aClass408_Sub2_Sub1_4301.method78();
	}

	Class407(Class408_Sub2_Sub1 class408_sub2_sub1, int i) {
		anInt4300 = i;
		aClass408_Sub2_Sub1_4301 = class408_sub2_sub1;
		aClass408_Sub2_Sub1_4301.aClass167_Sub3_Sub2_4302.method8894(this);
	}

	public int method12() {
		return aClass408_Sub2_Sub1_4301.method1();
	}

	void method4956() {
		method345();
	}

	void method4957() {
		method345();
	}

	public long method88() {
		if (aLong4299 == 0L)
			aLong4299 = IDirect3DTexture.GetSurfaceLevel((aClass408_Sub2_Sub1_4301.aLong4306), anInt4300);
		return aLong4299;
	}

	public long method79() {
		if (aLong4299 == 0L)
			aLong4299 = IDirect3DTexture.GetSurfaceLevel((aClass408_Sub2_Sub1_4301.aLong4306), anInt4300);
		return aLong4299;
	}

	public int method8() {
		return aClass408_Sub2_Sub1_4301.method78();
	}

	public void method346() {
		if (aLong4299 != 0L) {
			aClass408_Sub2_Sub1_4301.aClass167_Sub3_Sub2_4302.method10620(aLong4299);
			aLong4299 = 0L;
		}
	}
}
