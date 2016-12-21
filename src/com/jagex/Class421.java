/* Class421 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class421 implements Interface50 {
	Class167_Sub3_Sub2 aClass167_Sub3_Sub2_4586;
	Class171 aClass171_4587;
	int anInt4588;
	int anInt4589;
	long aLong4590;

	public long method79() {
		return aLong4590;
	}

	public int method82() {
		return anInt4588;
	}

	public int method73() {
		return anInt4588;
	}

	public long method347() {
		return aLong4590;
	}

	public void method131() {
		if (aLong4590 != 0L) {
			IUnknown.Release(aLong4590);
			aLong4590 = 0L;
		}
		aClass167_Sub3_Sub2_4586.method8936(this);
	}

	public void method345() {
		if (aLong4590 != 0L) {
			aClass167_Sub3_Sub2_4586.method10620(aLong4590);
			aLong4590 = 0L;
		}
	}

	public int method78() {
		return anInt4589;
	}

	public int method12() {
		return anInt4588;
	}

	void method5065() {
		method345();
	}

	public int method1() {
		return anInt4588;
	}

	public int method83() {
		return anInt4589;
	}

	public int method8() {
		return anInt4589;
	}

	public int method9() {
		return anInt4589;
	}

	public void method130() {
		if (aLong4590 != 0L) {
			IUnknown.Release(aLong4590);
			aLong4590 = 0L;
		}
		aClass167_Sub3_Sub2_4586.method8936(this);
	}

	public void method129() {
		if (aLong4590 != 0L) {
			IUnknown.Release(aLong4590);
			aLong4590 = 0L;
		}
		aClass167_Sub3_Sub2_4586.method8936(this);
	}

	public void finalize() {
		method345();
	}

	void method5066() {
		method345();
	}

	public long method88() {
		return aLong4590;
	}

	Class421(Class167_Sub3_Sub2 class167_sub3_sub2, Class171 class171, int i, int i_0_, int i_1_) {
		aClass167_Sub3_Sub2_4586 = class167_sub3_sub2;
		anInt4588 = i;
		anInt4589 = i_0_;
		aClass171_4587 = class171;
		aLong4590 = (IDirect3DDevice.CreateDepthStencilSurface(aClass167_Sub3_Sub2_4586.aLong11573, i, i_0_, Class167_Sub3_Sub2.method10619(aClass171_4587), 0 + i_1_, 0, false));
		aClass167_Sub3_Sub2_4586.method8894(this);
	}

	public long method348() {
		return aLong4590;
	}

	public void method346() {
		if (aLong4590 != 0L) {
			aClass167_Sub3_Sub2_4586.method10620(aLong4590);
			aLong4590 = 0L;
		}
	}
}
