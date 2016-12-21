/* Class415 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.Class284;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;

public class Class415 implements Interface41 {
	Class171 aClass171_4527;
	Class167_Sub3_Sub2 aClass167_Sub3_Sub2_4528;
	int anInt4529;
	boolean aBool4530;
	int anInt4531;
	long aLong4532 = 0L;

	public Class171 method281() {
		return aClass171_4527;
	}

	public int method73() {
		return anInt4531;
	}

	public int method9() {
		return anInt4531;
	}

	public void method283(int i) {
		anInt4531 = aClass171_4527.anInt1898 * -147747987 * i;
		if (anInt4531 > anInt4529) {
			if (aLong4532 != 0L)
				IUnknown.Release(aLong4532);
			int i_0_ = 8;
			int i_1_;
			if (aBool4530) {
				i_1_ = 0;
				i_0_ |= 0x200;
			} else
				i_1_ = 1;
			aLong4532 = (IDirect3DDevice.CreateIndexBuffer(aClass167_Sub3_Sub2_4528.aLong11573, anInt4531, i_0_, aClass171_4527 == Class171.aClass171_1899 ? 101 : 102, i_1_));
			anInt4529 = anInt4531;
		}
	}

	public long method263(int i, int i_2_) {
		return IDirect3DIndexBuffer.Lock(aLong4532, i, i_2_, aBool4530 ? 8192 : 0);
	}

	public long method269(int i, int i_3_) {
		return IDirect3DIndexBuffer.Lock(aLong4532, i, i_3_, aBool4530 ? 8192 : 0);
	}

	public boolean method264(int i, int i_4_, long l) {
		return Class284.method3779(IDirect3DIndexBuffer.Upload(aLong4532, i, i_4_, (aBool4530 ? 8192 : 0), l));
	}

	public void method131() {
		if (aLong4532 != 0L) {
			IUnknown.Release(aLong4532);
			aLong4532 = 0L;
		}
		anInt4529 = 0;
		anInt4531 = 0;
		aClass167_Sub3_Sub2_4528.method8936(this);
	}

	void method5029() {
		if (aLong4532 != 0L) {
			aClass167_Sub3_Sub2_4528.method10620(aLong4532);
			aLong4532 = 0L;
		}
		anInt4529 = 0;
		anInt4531 = 0;
	}

	public void method265() {
		IDirect3DIndexBuffer.Unlock(aLong4532);
	}

	public void method280(int i) {
		anInt4531 = aClass171_4527.anInt1898 * -147747987 * i;
		if (anInt4531 > anInt4529) {
			if (aLong4532 != 0L)
				IUnknown.Release(aLong4532);
			int i_5_ = 8;
			int i_6_;
			if (aBool4530) {
				i_6_ = 0;
				i_5_ |= 0x200;
			} else
				i_6_ = 1;
			aLong4532 = (IDirect3DDevice.CreateIndexBuffer(aClass167_Sub3_Sub2_4528.aLong11573, anInt4531, i_5_, aClass171_4527 == Class171.aClass171_1899 ? 101 : 102, i_6_));
			anInt4529 = anInt4531;
		}
	}

	public void method130() {
		if (aLong4532 != 0L) {
			IUnknown.Release(aLong4532);
			aLong4532 = 0L;
		}
		anInt4529 = 0;
		anInt4531 = 0;
		aClass167_Sub3_Sub2_4528.method8936(this);
	}

	void method5030() {
		method5029();
	}

	Class415(Class167_Sub3_Sub2 class167_sub3_sub2, Class171 class171, boolean bool) {
		aClass167_Sub3_Sub2_4528 = class167_sub3_sub2;
		aClass171_4527 = class171;
		aBool4530 = bool;
		aClass167_Sub3_Sub2_4528.method8894(this);
	}

	public void method270() {
		IDirect3DIndexBuffer.Unlock(aLong4532);
	}

	public int method267() {
		return anInt4531;
	}

	public boolean method266(int i, int i_7_, long l) {
		return Class284.method3779(IDirect3DIndexBuffer.Upload(aLong4532, i, i_7_, (aBool4530 ? 8192 : 0), l));
	}

	public long method268(int i, int i_8_) {
		return IDirect3DIndexBuffer.Lock(aLong4532, i, i_8_, aBool4530 ? 8192 : 0);
	}

	public void finalize() {
		method5029();
	}

	public void method129() {
		if (aLong4532 != 0L) {
			IUnknown.Release(aLong4532);
			aLong4532 = 0L;
		}
		anInt4529 = 0;
		anInt4531 = 0;
		aClass167_Sub3_Sub2_4528.method8936(this);
	}

	public Class171 method282() {
		return aClass171_4527;
	}

	void method5031() {
		method5029();
	}

	public void method284(int i) {
		anInt4531 = aClass171_4527.anInt1898 * -147747987 * i;
		if (anInt4531 > anInt4529) {
			if (aLong4532 != 0L)
				IUnknown.Release(aLong4532);
			int i_9_ = 8;
			int i_10_;
			if (aBool4530) {
				i_10_ = 0;
				i_9_ |= 0x200;
			} else
				i_10_ = 1;
			aLong4532 = (IDirect3DDevice.CreateIndexBuffer(aClass167_Sub3_Sub2_4528.aLong11573, anInt4531, i_9_, aClass171_4527 == Class171.aClass171_1899 ? 101 : 102, i_10_));
			anInt4529 = anInt4531;
		}
	}

	void method5032() {
		if (aLong4532 != 0L) {
			aClass167_Sub3_Sub2_4528.method10620(aLong4532);
			aLong4532 = 0L;
		}
		anInt4529 = 0;
		anInt4531 = 0;
	}
}
