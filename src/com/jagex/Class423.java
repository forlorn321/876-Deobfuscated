/* Class423 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class423 implements Interface53 {
	int anInt4786;
	long aLong4787;
	Class155 aClass155_4788;
	int anInt4789;
	Class171 aClass171_4790;
	Class167_Sub3_Sub2 aClass167_Sub3_Sub2_4791;

	public long method348() {
		return aLong4787;
	}

	public int method1() {
		return anInt4789;
	}

	public int method78() {
		return anInt4786;
	}

	public long method347() {
		return aLong4787;
	}

	public void method131() {
		if (aLong4787 != 0L) {
			IUnknown.Release(aLong4787);
			aLong4787 = 0L;
		}
		aClass167_Sub3_Sub2_4791.method8936(this);
	}

	public void method345() {
		if (aLong4787 != 0L) {
			aClass167_Sub3_Sub2_4791.method10620(aLong4787);
			aLong4787 = 0L;
		}
	}

	Class423(Class167_Sub3_Sub2 class167_sub3_sub2, Class155 class155, Class171 class171, int i, int i_0_, int i_1_) {
		aClass167_Sub3_Sub2_4791 = class167_sub3_sub2;
		anInt4789 = i;
		anInt4786 = i_0_;
		aClass155_4788 = class155;
		aClass171_4790 = class171;
		aLong4787 = (IDirect3DDevice.CreateRenderTarget(aClass167_Sub3_Sub2_4791.aLong11573, i, i_0_, Class167_Sub3_Sub2.method10618(aClass155_4788, aClass171_4790), 0 + i_1_, 0, false));
		aClass167_Sub3_Sub2_4791.method8894(this);
	}

	public int method12() {
		return anInt4789;
	}

	public int method73() {
		return anInt4789;
	}

	public int method83() {
		return anInt4786;
	}

	public void finalize() {
		method345();
	}

	void method5074() {
		method345();
	}

	public int method9() {
		return anInt4786;
	}

	public void method130() {
		if (aLong4787 != 0L) {
			IUnknown.Release(aLong4787);
			aLong4787 = 0L;
		}
		aClass167_Sub3_Sub2_4791.method8936(this);
	}

	public void method129() {
		if (aLong4787 != 0L) {
			IUnknown.Release(aLong4787);
			aLong4787 = 0L;
		}
		aClass167_Sub3_Sub2_4791.method8936(this);
	}

	public int method82() {
		return anInt4789;
	}

	void method5075() {
		method345();
	}

	public long method88() {
		return aLong4787;
	}

	public long method79() {
		return aLong4787;
	}

	public int method8() {
		return anInt4786;
	}

	public void method346() {
		if (aLong4787 != 0L) {
			aClass167_Sub3_Sub2_4791.method10620(aLong4787);
			aLong4787 = 0L;
		}
	}
}
