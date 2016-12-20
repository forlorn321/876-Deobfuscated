/* Class415 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class415 implements Interface51 {
	long aLong4509;
	Class184 aClass184_4510;
	int anInt4511;
	int anInt4512;
	Class180_Sub2_Sub2 aClass180_Sub2_Sub2_4513;

	Class415(Class180_Sub2_Sub2 class180_sub2_sub2, Class184 class184, int i, int i_0_, int i_1_) {
		aClass180_Sub2_Sub2_4513 = class180_sub2_sub2;
		anInt4511 = i;
		anInt4512 = i_0_;
		aClass184_4510 = class184;
		aLong4509 = (IDirect3DDevice.CreateDepthStencilSurface(aClass180_Sub2_Sub2_4513.aLong11572, i, i_0_, Class180_Sub2_Sub2.method18092(aClass184_4510), 0 + i_1_, 0, false));
		aClass180_Sub2_Sub2_4513.method15055(this);
	}

	public int method1() {
		return anInt4511;
	}

	public long method95() {
		return aLong4509;
	}

	public long method346() {
		return aLong4509;
	}

	public void method129() {
		if (aLong4509 != 0L) {
			IUnknown.Release(aLong4509);
			aLong4509 = 0L;
		}
		aClass180_Sub2_Sub2_4513.method14886(this);
	}

	public void method343() {
		if (aLong4509 != 0L) {
			aClass180_Sub2_Sub2_4513.method18107(aLong4509);
			aLong4509 = 0L;
		}
	}

	void method6637() {
		method343();
	}

	public int method42() {
		return anInt4511;
	}

	public void method344() {
		if (aLong4509 != 0L) {
			aClass180_Sub2_Sub2_4513.method18107(aLong4509);
			aLong4509 = 0L;
		}
	}

	public int method6() {
		return anInt4512;
	}

	public void method130() {
		if (aLong4509 != 0L) {
			IUnknown.Release(aLong4509);
			aLong4509 = 0L;
		}
		aClass180_Sub2_Sub2_4513.method14886(this);
	}

	void method6638() {
		method343();
	}

	public void finalize() {
		method343();
	}

	void method6639() {
		method343();
	}

	void method6640() {
		method343();
	}

	public int method91() {
		return anInt4512;
	}

	public long method345() {
		return aLong4509;
	}

	public long method96() {
		return aLong4509;
	}

	public int method87() {
		return anInt4512;
	}

	void method6641() {
		method343();
	}

	public void method342() {
		if (aLong4509 != 0L) {
			aClass180_Sub2_Sub2_4513.method18107(aLong4509);
			aLong4509 = 0L;
		}
	}

	public void method347() {
		if (aLong4509 != 0L) {
			aClass180_Sub2_Sub2_4513.method18107(aLong4509);
			aLong4509 = 0L;
		}
	}
}
