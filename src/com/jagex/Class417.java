/* Class417 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.Class276;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;

public class Class417 implements Interface44 {
	boolean aBool4519;
	int anInt4520;
	Class180_Sub2_Sub2 aClass180_Sub2_Sub2_4521;
	int anInt4522;
	Class184 aClass184_4523;
	long aLong4524 = 0L;

	public void method323(int i) {
		anInt4520 = aClass184_4523.anInt2111 * 408933829 * i;
		if (anInt4520 > anInt4522) {
			if (aLong4524 != 0L)
				IUnknown.Release(aLong4524);
			int i_0_ = 8;
			int i_1_;
			if (aBool4519) {
				i_1_ = 0;
				i_0_ |= 0x200;
			} else
				i_1_ = 1;
			aLong4524 = (IDirect3DDevice.CreateIndexBuffer(aClass180_Sub2_Sub2_4521.aLong11572, anInt4520, i_0_, aClass184_4523 == Class184.aClass184_2110 ? 101 : 102, i_1_));
			anInt4522 = anInt4520;
		}
	}

	public Class184 method322() {
		return aClass184_4523;
	}

	public Class184 method329() {
		return aClass184_4523;
	}

	public int method6() {
		return anInt4520;
	}

	public long method209(int i, int i_2_) {
		return IDirect3DIndexBuffer.Lock(aLong4524, i, i_2_, aBool4519 ? 8192 : 0);
	}

	public void method130() {
		if (aLong4524 != 0L) {
			IUnknown.Release(aLong4524);
			aLong4524 = 0L;
		}
		anInt4522 = 0;
		anInt4520 = 0;
		aClass180_Sub2_Sub2_4521.method14886(this);
	}

	public boolean method213(int i, int i_3_, long l) {
		return Class276.method5145(IDirect3DIndexBuffer.Upload(aLong4524, i, i_3_, (aBool4519 ? 8192 : 0), l));
	}

	void method6653() {
		if (aLong4524 != 0L) {
			aClass180_Sub2_Sub2_4521.method18107(aLong4524);
			aLong4524 = 0L;
		}
		anInt4522 = 0;
		anInt4520 = 0;
	}

	void method6654() {
		method6653();
	}

	public void finalize() {
		method6653();
	}

	public void method327(int i) {
		anInt4520 = aClass184_4523.anInt2111 * 408933829 * i;
		if (anInt4520 > anInt4522) {
			if (aLong4524 != 0L)
				IUnknown.Release(aLong4524);
			int i_4_ = 8;
			int i_5_;
			if (aBool4519) {
				i_5_ = 0;
				i_4_ |= 0x200;
			} else
				i_5_ = 1;
			aLong4524 = (IDirect3DDevice.CreateIndexBuffer(aClass180_Sub2_Sub2_4521.aLong11572, anInt4520, i_4_, aClass184_4523 == Class184.aClass184_2110 ? 101 : 102, i_5_));
			anInt4522 = anInt4520;
		}
	}

	void method6655() {
		method6653();
	}

	void method6656() {
		method6653();
	}

	Class417(Class180_Sub2_Sub2 class180_sub2_sub2, Class184 class184, boolean bool) {
		aClass180_Sub2_Sub2_4521 = class180_sub2_sub2;
		aClass184_4523 = class184;
		aBool4519 = bool;
		aClass180_Sub2_Sub2_4521.method15055(this);
	}

	void method6657() {
		method6653();
	}

	public void method211() {
		IDirect3DIndexBuffer.Unlock(aLong4524);
	}

	void method6658() {
		method6653();
	}

	public boolean method212(int i, int i_6_, long l) {
		return Class276.method5145(IDirect3DIndexBuffer.Upload(aLong4524, i, i_6_, (aBool4519 ? 8192 : 0), l));
	}

	public int method194() {
		return anInt4520;
	}

	public long method214(int i, int i_7_) {
		return IDirect3DIndexBuffer.Lock(aLong4524, i, i_7_, aBool4519 ? 8192 : 0);
	}

	public long method215(int i, int i_8_) {
		return IDirect3DIndexBuffer.Lock(aLong4524, i, i_8_, aBool4519 ? 8192 : 0);
	}

	public long method216(int i, int i_9_) {
		return IDirect3DIndexBuffer.Lock(aLong4524, i, i_9_, aBool4519 ? 8192 : 0);
	}

	public void method217() {
		IDirect3DIndexBuffer.Unlock(aLong4524);
	}

	void method6659() {
		if (aLong4524 != 0L) {
			aClass180_Sub2_Sub2_4521.method18107(aLong4524);
			aLong4524 = 0L;
		}
		anInt4522 = 0;
		anInt4520 = 0;
	}

	public Class184 method326() {
		return aClass184_4523;
	}

	public void method324(int i) {
		anInt4520 = aClass184_4523.anInt2111 * 408933829 * i;
		if (anInt4520 > anInt4522) {
			if (aLong4524 != 0L)
				IUnknown.Release(aLong4524);
			int i_10_ = 8;
			int i_11_;
			if (aBool4519) {
				i_11_ = 0;
				i_10_ |= 0x200;
			} else
				i_11_ = 1;
			aLong4524 = (IDirect3DDevice.CreateIndexBuffer(aClass180_Sub2_Sub2_4521.aLong11572, anInt4520, i_10_, aClass184_4523 == Class184.aClass184_2110 ? 101 : 102, i_11_));
			anInt4522 = anInt4520;
		}
	}

	public void method129() {
		if (aLong4524 != 0L) {
			IUnknown.Release(aLong4524);
			aLong4524 = 0L;
		}
		anInt4522 = 0;
		anInt4520 = 0;
		aClass180_Sub2_Sub2_4521.method14886(this);
	}

	public void method325(int i) {
		anInt4520 = aClass184_4523.anInt2111 * 408933829 * i;
		if (anInt4520 > anInt4522) {
			if (aLong4524 != 0L)
				IUnknown.Release(aLong4524);
			int i_12_ = 8;
			int i_13_;
			if (aBool4519) {
				i_13_ = 0;
				i_12_ |= 0x200;
			} else
				i_13_ = 1;
			aLong4524 = (IDirect3DDevice.CreateIndexBuffer(aClass180_Sub2_Sub2_4521.aLong11572, anInt4520, i_12_, aClass184_4523 == Class184.aClass184_2110 ? 101 : 102, i_13_));
			anInt4522 = anInt4520;
		}
	}

	public void method328(int i) {
		anInt4520 = aClass184_4523.anInt2111 * 408933829 * i;
		if (anInt4520 > anInt4522) {
			if (aLong4524 != 0L)
				IUnknown.Release(aLong4524);
			int i_14_ = 8;
			int i_15_;
			if (aBool4519) {
				i_15_ = 0;
				i_14_ |= 0x200;
			} else
				i_15_ = 1;
			aLong4524 = (IDirect3DDevice.CreateIndexBuffer(aClass180_Sub2_Sub2_4521.aLong11572, anInt4520, i_14_, aClass184_4523 == Class184.aClass184_2110 ? 101 : 102, i_15_));
			anInt4522 = anInt4520;
		}
	}

	void method6660() {
		if (aLong4524 != 0L) {
			aClass180_Sub2_Sub2_4521.method18107(aLong4524);
			aLong4524 = 0L;
		}
		anInt4522 = 0;
		anInt4520 = 0;
	}

	public long method210(int i, int i_16_) {
		return IDirect3DIndexBuffer.Lock(aLong4524, i, i_16_, aBool4519 ? 8192 : 0);
	}

	void method6661() {
		if (aLong4524 != 0L) {
			aClass180_Sub2_Sub2_4521.method18107(aLong4524);
			aLong4524 = 0L;
		}
		anInt4522 = 0;
		anInt4520 = 0;
	}
}
