/* Class408 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.IUnknown;

public abstract class Class408 implements Interface35 {
	Class167_Sub3_Sub2 aClass167_Sub3_Sub2_4302;
	Class155 aClass155_4303;
	Class171 aClass171_4304;
	boolean aBool4305;
	long aLong4306 = 0L;

	public void method279(Class342 class342) {
		/* empty */
	}

	long method4958() {
		return aLong4306;
	}

	public void method274(Class342 class342) {
		/* empty */
	}

	long method4959() {
		return aLong4306;
	}

	public void method131() {
		if (aLong4306 != 0L) {
			IUnknown.Release(aLong4306);
			aLong4306 = 0L;
		}
		aClass167_Sub3_Sub2_4302.method8936(this);
	}

	public void finalize() {
		method4961();
	}

	public void method130() {
		if (aLong4306 != 0L) {
			IUnknown.Release(aLong4306);
			aLong4306 = 0L;
		}
		aClass167_Sub3_Sub2_4302.method8936(this);
	}

	long method4960() {
		return aLong4306;
	}

	void method4961() {
		if (aLong4306 != 0L) {
			aClass167_Sub3_Sub2_4302.method10620(aLong4306);
			aLong4306 = 0L;
		}
	}

	void method4962() {
		method4961();
	}

	public void method278(Class342 class342) {
		/* empty */
	}

	void method4963() {
		method4961();
	}

	Class408(Class167_Sub3_Sub2 class167_sub3_sub2, Class155 class155, Class171 class171, boolean bool, int i) {
		aClass167_Sub3_Sub2_4302 = class167_sub3_sub2;
		aClass155_4303 = class155;
		aClass171_4304 = class171;
		aBool4305 = bool;
		aClass167_Sub3_Sub2_4302.method8894(this);
	}

	public void method129() {
		if (aLong4306 != 0L) {
			IUnknown.Release(aLong4306);
			aLong4306 = 0L;
		}
		aClass167_Sub3_Sub2_4302.method8936(this);
	}

	long method4964() {
		return aLong4306;
	}

	long method4965() {
		return aLong4306;
	}

	void method4966() {
		if (aLong4306 != 0L) {
			aClass167_Sub3_Sub2_4302.method10620(aLong4306);
			aLong4306 = 0L;
		}
	}
}
