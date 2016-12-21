/* Class413 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.Class284;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;

public class Class413 implements Interface38 {
	int anInt4396;
	long aLong4397 = 0L;
	int anInt4398;
	byte aByte4399;
	boolean aBool4400;
	Class167_Sub3_Sub2 aClass167_Sub3_Sub2_4401;

	public long method268(int i, int i_0_) {
		return IDirect3DVertexBuffer.Lock(aLong4397, i, i_0_, aBool4400 ? 8192 : 0);
	}

	public int method73() {
		return anInt4398;
	}

	Class413(Class167_Sub3_Sub2 class167_sub3_sub2, boolean bool) {
		aClass167_Sub3_Sub2_4401 = class167_sub3_sub2;
		aBool4400 = bool;
		aClass167_Sub3_Sub2_4401.method8894(this);
	}

	public boolean method271(int i, int i_1_) {
		anInt4398 = i;
		aByte4399 = (byte) i_1_;
		if (anInt4398 > anInt4396) {
			int i_2_ = 8;
			int i_3_;
			if (aBool4400) {
				i_3_ = 0;
				i_2_ |= 0x200;
			} else
				i_3_ = 1;
			if (aLong4397 != 0L)
				IUnknown.Release(aLong4397);
			aLong4397 = IDirect3DDevice.CreateVertexBuffer((aClass167_Sub3_Sub2_4401.aLong11573), anInt4398, i_2_, 0, i_3_);
			anInt4396 = anInt4398;
		}
		return aLong4397 != 0L;
	}

	public long method263(int i, int i_4_) {
		return IDirect3DVertexBuffer.Lock(aLong4397, i, i_4_, aBool4400 ? 8192 : 0);
	}

	int method5015() {
		return aByte4399;
	}

	public void finalize() {
		method5016();
	}

	public void method131() {
		if (aLong4397 != 0L) {
			IUnknown.Release(aLong4397);
			aLong4397 = 0L;
		}
		anInt4396 = 0;
		anInt4398 = 0;
		aClass167_Sub3_Sub2_4401.method8936(this);
	}

	void method5016() {
		if (aLong4397 != 0L) {
			aClass167_Sub3_Sub2_4401.method10620(aLong4397);
			aLong4397 = 0L;
			anInt4396 = 0;
			anInt4398 = 0;
		}
	}

	public long method269(int i, int i_5_) {
		return IDirect3DVertexBuffer.Lock(aLong4397, i, i_5_, aBool4400 ? 8192 : 0);
	}

	public void method130() {
		if (aLong4397 != 0L) {
			IUnknown.Release(aLong4397);
			aLong4397 = 0L;
		}
		anInt4396 = 0;
		anInt4398 = 0;
		aClass167_Sub3_Sub2_4401.method8936(this);
	}

	public void method129() {
		if (aLong4397 != 0L) {
			IUnknown.Release(aLong4397);
			aLong4397 = 0L;
		}
		anInt4396 = 0;
		anInt4398 = 0;
		aClass167_Sub3_Sub2_4401.method8936(this);
	}

	int method5017() {
		return aByte4399;
	}

	void method5018() {
		method5016();
	}

	public boolean method273(int i, int i_6_) {
		anInt4398 = i;
		aByte4399 = (byte) i_6_;
		if (anInt4398 > anInt4396) {
			int i_7_ = 8;
			int i_8_;
			if (aBool4400) {
				i_8_ = 0;
				i_7_ |= 0x200;
			} else
				i_8_ = 1;
			if (aLong4397 != 0L)
				IUnknown.Release(aLong4397);
			aLong4397 = IDirect3DDevice.CreateVertexBuffer((aClass167_Sub3_Sub2_4401.aLong11573), anInt4398, i_7_, 0, i_8_);
			anInt4396 = anInt4398;
		}
		return aLong4397 != 0L;
	}

	public boolean method264(int i, int i_9_, long l) {
		return Class284.method3779(IDirect3DVertexBuffer.Upload(aLong4397, i, i_9_, (aBool4400 ? 8192 : 0), l));
	}

	public int method9() {
		return anInt4398;
	}

	public int method267() {
		return anInt4398;
	}

	public boolean method266(int i, int i_10_, long l) {
		return Class284.method3779(IDirect3DVertexBuffer.Upload(aLong4397, i, i_10_, (aBool4400 ? 8192 : 0), l));
	}

	public boolean method272(int i, int i_11_) {
		anInt4398 = i;
		aByte4399 = (byte) i_11_;
		if (anInt4398 > anInt4396) {
			int i_12_ = 8;
			int i_13_;
			if (aBool4400) {
				i_13_ = 0;
				i_12_ |= 0x200;
			} else
				i_13_ = 1;
			if (aLong4397 != 0L)
				IUnknown.Release(aLong4397);
			aLong4397 = IDirect3DDevice.CreateVertexBuffer((aClass167_Sub3_Sub2_4401.aLong11573), anInt4398, i_12_, 0, i_13_);
			anInt4396 = anInt4398;
		}
		return aLong4397 != 0L;
	}

	void method5019() {
		method5016();
	}

	public void method270() {
		IDirect3DVertexBuffer.Unlock(aLong4397);
	}

	int method5020() {
		return aByte4399;
	}

	public void method265() {
		IDirect3DVertexBuffer.Unlock(aLong4397);
	}

	int method5021() {
		return aByte4399;
	}

	void method5022() {
		if (aLong4397 != 0L) {
			aClass167_Sub3_Sub2_4401.method10620(aLong4397);
			aLong4397 = 0L;
			anInt4396 = 0;
			anInt4398 = 0;
		}
	}

	void method5023() {
		if (aLong4397 != 0L) {
			aClass167_Sub3_Sub2_4401.method10620(aLong4397);
			aLong4397 = 0L;
			anInt4396 = 0;
			anInt4398 = 0;
		}
	}

	void method5024() {
		if (aLong4397 != 0L) {
			aClass167_Sub3_Sub2_4401.method10620(aLong4397);
			aLong4397 = 0L;
			anInt4396 = 0;
			anInt4398 = 0;
		}
	}

	void method5025() {
		if (aLong4397 != 0L) {
			aClass167_Sub3_Sub2_4401.method10620(aLong4397);
			aLong4397 = 0L;
			anInt4396 = 0;
			anInt4398 = 0;
		}
	}
}
