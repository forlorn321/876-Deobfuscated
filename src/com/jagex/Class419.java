/* Class419 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.Class276;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;

public class Class419 implements Interface37 {
	long aLong4577 = 0L;
	int anInt4578;
	Class180_Sub2_Sub2 aClass180_Sub2_Sub2_4579;
	byte aByte4580;
	int anInt4581;
	boolean aBool4582;

	public boolean method213(int i, int i_0_, long l) {
		return Class276.method5145(IDirect3DVertexBuffer.Upload(aLong4577, i, i_0_, (aBool4582 ? 8192 : 0), l));
	}

	void method6666() {
		if (aLong4577 != 0L) {
			aClass180_Sub2_Sub2_4579.method18107(aLong4577);
			aLong4577 = 0L;
			anInt4578 = 0;
			anInt4581 = 0;
		}
	}

	int method6667() {
		return aByte4580;
	}

	public boolean method219(int i, int i_1_) {
		anInt4581 = i;
		aByte4580 = (byte) i_1_;
		if (anInt4581 > anInt4578) {
			int i_2_ = 8;
			int i_3_;
			if (aBool4582) {
				i_3_ = 0;
				i_2_ |= 0x200;
			} else
				i_3_ = 1;
			if (aLong4577 != 0L)
				IUnknown.Release(aLong4577);
			aLong4577 = IDirect3DDevice.CreateVertexBuffer((aClass180_Sub2_Sub2_4579.aLong11572), anInt4581, i_2_, 0, i_3_);
			anInt4578 = anInt4581;
		}
		return aLong4577 != 0L;
	}

	void method6668() {
		if (aLong4577 != 0L) {
			aClass180_Sub2_Sub2_4579.method18107(aLong4577);
			aLong4577 = 0L;
			anInt4578 = 0;
			anInt4581 = 0;
		}
	}

	void method6669() {
		method6670();
	}

	public boolean method220(int i, int i_4_) {
		anInt4581 = i;
		aByte4580 = (byte) i_4_;
		if (anInt4581 > anInt4578) {
			int i_5_ = 8;
			int i_6_;
			if (aBool4582) {
				i_6_ = 0;
				i_5_ |= 0x200;
			} else
				i_6_ = 1;
			if (aLong4577 != 0L)
				IUnknown.Release(aLong4577);
			aLong4577 = IDirect3DDevice.CreateVertexBuffer((aClass180_Sub2_Sub2_4579.aLong11572), anInt4581, i_5_, 0, i_6_);
			anInt4578 = anInt4581;
		}
		return aLong4577 != 0L;
	}

	public void method129() {
		if (aLong4577 != 0L) {
			IUnknown.Release(aLong4577);
			aLong4577 = 0L;
		}
		anInt4578 = 0;
		anInt4581 = 0;
		aClass180_Sub2_Sub2_4579.method14886(this);
	}

	void method6670() {
		if (aLong4577 != 0L) {
			aClass180_Sub2_Sub2_4579.method18107(aLong4577);
			aLong4577 = 0L;
			anInt4578 = 0;
			anInt4581 = 0;
		}
	}

	public void finalize() {
		method6670();
	}

	void method6671() {
		method6670();
	}

	void method6672() {
		method6670();
	}

	void method6673() {
		method6670();
	}

	public void method211() {
		IDirect3DVertexBuffer.Unlock(aLong4577);
	}

	void method6674() {
		method6670();
	}

	public boolean method221(int i, int i_7_) {
		anInt4581 = i;
		aByte4580 = (byte) i_7_;
		if (anInt4581 > anInt4578) {
			int i_8_ = 8;
			int i_9_;
			if (aBool4582) {
				i_9_ = 0;
				i_8_ |= 0x200;
			} else
				i_9_ = 1;
			if (aLong4577 != 0L)
				IUnknown.Release(aLong4577);
			aLong4577 = IDirect3DDevice.CreateVertexBuffer((aClass180_Sub2_Sub2_4579.aLong11572), anInt4581, i_8_, 0, i_9_);
			anInt4578 = anInt4581;
		}
		return aLong4577 != 0L;
	}

	Class419(Class180_Sub2_Sub2 class180_sub2_sub2, boolean bool) {
		aClass180_Sub2_Sub2_4579 = class180_sub2_sub2;
		aBool4582 = bool;
		aClass180_Sub2_Sub2_4579.method15055(this);
	}

	public boolean method218(int i, int i_10_) {
		anInt4581 = i;
		aByte4580 = (byte) i_10_;
		if (anInt4581 > anInt4578) {
			int i_11_ = 8;
			int i_12_;
			if (aBool4582) {
				i_12_ = 0;
				i_11_ |= 0x200;
			} else
				i_12_ = 1;
			if (aLong4577 != 0L)
				IUnknown.Release(aLong4577);
			aLong4577 = IDirect3DDevice.CreateVertexBuffer((aClass180_Sub2_Sub2_4579.aLong11572), anInt4581, i_11_, 0, i_12_);
			anInt4578 = anInt4581;
		}
		return aLong4577 != 0L;
	}

	public int method6() {
		return anInt4581;
	}

	public int method194() {
		return anInt4581;
	}

	public long method209(int i, int i_13_) {
		return IDirect3DVertexBuffer.Lock(aLong4577, i, i_13_, aBool4582 ? 8192 : 0);
	}

	public long method210(int i, int i_14_) {
		return IDirect3DVertexBuffer.Lock(aLong4577, i, i_14_, aBool4582 ? 8192 : 0);
	}

	public long method214(int i, int i_15_) {
		return IDirect3DVertexBuffer.Lock(aLong4577, i, i_15_, aBool4582 ? 8192 : 0);
	}

	public long method215(int i, int i_16_) {
		return IDirect3DVertexBuffer.Lock(aLong4577, i, i_16_, aBool4582 ? 8192 : 0);
	}

	public long method216(int i, int i_17_) {
		return IDirect3DVertexBuffer.Lock(aLong4577, i, i_17_, aBool4582 ? 8192 : 0);
	}

	public void method217() {
		IDirect3DVertexBuffer.Unlock(aLong4577);
	}

	int method6675() {
		return aByte4580;
	}

	int method6676() {
		return aByte4580;
	}

	public boolean method212(int i, int i_18_, long l) {
		return Class276.method5145(IDirect3DVertexBuffer.Upload(aLong4577, i, i_18_, (aBool4582 ? 8192 : 0), l));
	}

	public void method130() {
		if (aLong4577 != 0L) {
			IUnknown.Release(aLong4577);
			aLong4577 = 0L;
		}
		anInt4578 = 0;
		anInt4581 = 0;
		aClass180_Sub2_Sub2_4579.method14886(this);
	}
}
