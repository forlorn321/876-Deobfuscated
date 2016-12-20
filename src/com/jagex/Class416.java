/* Class416 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.IUnknown;

public abstract class Class416 implements Interface36 {
	Class157 aClass157_4514;
	Class184 aClass184_4515;
	Class180_Sub2_Sub2 aClass180_Sub2_Sub2_4516;
	boolean aBool4517;
	long aLong4518 = 0L;

	Class416(Class180_Sub2_Sub2 class180_sub2_sub2, Class157 class157, Class184 class184, boolean bool, int i) {
		aClass180_Sub2_Sub2_4516 = class180_sub2_sub2;
		aClass157_4514 = class157;
		aClass184_4515 = class184;
		aBool4517 = bool;
		aClass180_Sub2_Sub2_4516.method15055(this);
	}

	long method6642() {
		return aLong4518;
	}

	void method6643() {
		method6644();
	}

	public void method129() {
		if (aLong4518 != 0L) {
			IUnknown.Release(aLong4518);
			aLong4518 = 0L;
		}
		aClass180_Sub2_Sub2_4516.method14886(this);
	}

	void method6644() {
		if (aLong4518 != 0L) {
			aClass180_Sub2_Sub2_4516.method18107(aLong4518);
			aLong4518 = 0L;
		}
	}

	void method6645() {
		method6644();
	}

	public void method130() {
		if (aLong4518 != 0L) {
			IUnknown.Release(aLong4518);
			aLong4518 = 0L;
		}
		aClass180_Sub2_Sub2_4516.method14886(this);
	}

	void method6646() {
		method6644();
	}

	void method6647() {
		method6644();
	}

	void method6648() {
		method6644();
	}

	void method6649() {
		if (aLong4518 != 0L) {
			aClass180_Sub2_Sub2_4516.method18107(aLong4518);
			aLong4518 = 0L;
		}
	}

	public void method273(Class343 class343) {
		/* empty */
	}

	public void method274(Class343 class343) {
		/* empty */
	}

	long method6650() {
		return aLong4518;
	}

	long method6651() {
		return aLong4518;
	}

	public void finalize() {
		method6644();
	}

	void method6652() {
		if (aLong4518 != 0L) {
			aClass180_Sub2_Sub2_4516.method18107(aLong4518);
			aLong4518 = 0L;
		}
	}
}
