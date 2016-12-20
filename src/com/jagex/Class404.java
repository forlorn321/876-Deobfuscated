/* Class404 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class404 implements Interface54 {
	Class180_Sub2_Sub2 aClass180_Sub2_Sub2_4165;
	Class184 aClass184_4166;
	long aLong4167;
	int anInt4168;
	Class157 aClass157_4169;
	int anInt4170;

	public int method87() {
		return anInt4170;
	}

	public long method96() {
		return aLong4167;
	}

	public void method347() {
		if (aLong4167 != 0L) {
			aClass180_Sub2_Sub2_4165.method18107(aLong4167);
			aLong4167 = 0L;
		}
	}

	public long method346() {
		return aLong4167;
	}

	public int method42() {
		return anInt4168;
	}

	public void method343() {
		if (aLong4167 != 0L) {
			aClass180_Sub2_Sub2_4165.method18107(aLong4167);
			aLong4167 = 0L;
		}
	}

	public void finalize() {
		method343();
	}

	public void method129() {
		if (aLong4167 != 0L) {
			IUnknown.Release(aLong4167);
			aLong4167 = 0L;
		}
		aClass180_Sub2_Sub2_4165.method14886(this);
	}

	public int method91() {
		return anInt4170;
	}

	public int method6() {
		return anInt4170;
	}

	public void method130() {
		if (aLong4167 != 0L) {
			IUnknown.Release(aLong4167);
			aLong4167 = 0L;
		}
		aClass180_Sub2_Sub2_4165.method14886(this);
	}

	void method6543() {
		method343();
	}

	void method6544() {
		method343();
	}

	void method6545() {
		method343();
	}

	void method6546() {
		method343();
	}

	void method6547() {
		method343();
	}

	Class404(Class180_Sub2_Sub2 class180_sub2_sub2, Class157 class157, Class184 class184, int i, int i_0_, int i_1_) {
		aClass180_Sub2_Sub2_4165 = class180_sub2_sub2;
		anInt4168 = i;
		anInt4170 = i_0_;
		aClass157_4169 = class157;
		aClass184_4166 = class184;
		aLong4167 = (IDirect3DDevice.CreateRenderTarget(aClass180_Sub2_Sub2_4165.aLong11572, i, i_0_, Class180_Sub2_Sub2.method18096(aClass157_4169, aClass184_4166), 0 + i_1_, 0, false));
		aClass180_Sub2_Sub2_4165.method15055(this);
	}

	public long method95() {
		return aLong4167;
	}

	public int method1() {
		return anInt4168;
	}

	public long method345() {
		return aLong4167;
	}

	public void method342() {
		if (aLong4167 != 0L) {
			aClass180_Sub2_Sub2_4165.method18107(aLong4167);
			aLong4167 = 0L;
		}
	}

	public void method344() {
		if (aLong4167 != 0L) {
			aClass180_Sub2_Sub2_4165.method18107(aLong4167);
			aLong4167 = 0L;
		}
	}
}
