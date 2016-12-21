/* Class649 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class649 {
	boolean aBool8458;
	Class431 aClass431_8459;
	boolean aBool8460;
	Class649 aClass649_8461;
	Class431 aClass431_8462;
	Class433 aClass433_8463;
	Class649 aClass649_8464;
	Class431 aClass431_8465 = new Class431();
	Class649 aClass649_8466;
	boolean aBool8467;
	protected boolean aBool8468;

	public final void method7835(float f, float f_0_, float f_1_) {
		aClass431_8465.aClass436_4823.method5243(f, f_0_, f_1_);
		method7844();
		if (aClass649_8461 != null)
			aClass649_8461.method7845();
	}

	public final void method7836() {
		if (aClass649_8466 != null) {
			Class649 class649_2_ = aClass649_8466.aClass649_8461;
			if (class649_2_ == this)
				aClass649_8466.aClass649_8461 = aClass649_8464;
			else {
				for (/**/; class649_2_.aClass649_8464 != this; class649_2_ = class649_2_.aClass649_8464) {
					/* empty */
				}
				class649_2_.aClass649_8464 = aClass649_8464;
			}
		}
		method7844();
		if (aClass649_8461 != null) {
			aClass649_8461.method7845();
			Class649 class649_3_ = aClass649_8461;
			for (;;) {
				class649_3_.aClass431_8465.method5175(aClass431_8465);
				class649_3_.aClass649_8466 = aClass649_8466;
				if (class649_3_.aClass649_8464 == null) {
					class649_3_.aClass649_8464 = aClass649_8466.aClass649_8461;
					break;
				}
				class649_3_ = class649_3_.aClass649_8464;
			}
			aClass649_8466.aClass649_8461 = aClass649_8461;
		}
		aClass649_8466 = null;
		aClass649_8464 = null;
		aClass649_8461 = null;
	}

	public final Class431 method7837() {
		if (aBool8460) {
			aBool8460 = false;
			aClass431_8459.method5172(aClass431_8465);
			if (aClass649_8466 != null)
				aClass431_8459.method5175(aClass649_8466.method7837());
		}
		return aClass431_8459;
	}

	public final Class431 method7838() {
		return aClass431_8465;
	}

	final void method7839(Class431 class431) {
		aClass431_8465.method5172(class431);
		method7844();
		if (aClass649_8461 != null)
			aClass649_8461.method7845();
	}

	public final void method7840(Class425 class425) {
		aClass431_8465.aClass425_4822.method5087(class425);
		method7844();
		if (aClass649_8461 != null)
			aClass649_8461.method7845();
	}

	public final void method7841(Class436 class436) {
		aClass431_8465.aClass436_4823.method5272(class436);
		method7844();
		if (aClass649_8461 != null)
			aClass649_8461.method7845();
	}

	public final void method7842(float f, float f_4_, float f_5_) {
		aClass431_8465.aClass436_4823.method5243(f, f_4_, f_5_);
		method7844();
		if (aClass649_8461 != null)
			aClass649_8461.method7845();
	}

	final void method7843(Class431 class431) {
		if (aClass649_8466 != null) {
			Class431 class431_6_ = new Class431(class431);
			class431_6_.method5175(aClass649_8466.method7848());
			method7839(class431_6_);
		} else
			method7839(class431);
	}

	final void method7844() {
		aBool8460 = true;
		aBool8458 = true;
		aBool8467 = true;
		aBool8468 = true;
	}

	final void method7845() {
		method7844();
		if (aClass649_8461 != null)
			aClass649_8461.method7845();
		if (aClass649_8464 != null)
			aClass649_8464.method7845();
	}

	public final void method7846() {
		if (aClass649_8466 != null) {
			Class649 class649_7_ = aClass649_8466.aClass649_8461;
			if (class649_7_ == this)
				aClass649_8466.aClass649_8461 = aClass649_8464;
			else {
				for (/**/; class649_7_.aClass649_8464 != this; class649_7_ = class649_7_.aClass649_8464) {
					/* empty */
				}
				class649_7_.aClass649_8464 = aClass649_8464;
			}
		}
		method7844();
		if (aClass649_8461 != null) {
			aClass649_8461.method7845();
			Class649 class649_8_ = aClass649_8461;
			for (;;) {
				class649_8_.aClass431_8465.method5175(aClass431_8465);
				class649_8_.aClass649_8466 = aClass649_8466;
				if (class649_8_.aClass649_8464 == null) {
					class649_8_.aClass649_8464 = aClass649_8466.aClass649_8461;
					break;
				}
				class649_8_ = class649_8_.aClass649_8464;
			}
			aClass649_8466.aClass649_8461 = aClass649_8461;
		}
		aClass649_8466 = null;
		aClass649_8464 = null;
		aClass649_8461 = null;
	}

	final void method7847() {
		aBool8460 = true;
		aBool8458 = true;
		aBool8467 = true;
		aBool8468 = true;
	}

	final Class431 method7848() {
		if (aBool8458) {
			aBool8458 = false;
			aClass431_8462.method5172(method7837());
			aClass431_8462.method5173();
		}
		return aClass431_8459;
	}

	Class649() {
		aClass431_8459 = new Class431();
		aBool8460 = true;
		aClass431_8462 = new Class431();
		aBool8458 = true;
		new Class443();
		new Class443();
		aClass433_8463 = new Class433();
		aBool8467 = true;
		aBool8468 = true;
		aClass649_8466 = null;
		aClass649_8461 = null;
		aClass649_8464 = null;
	}

	public final void method7849(float f, float f_9_, float f_10_) {
		aClass431_8465.aClass436_4823.method5243(f, f_9_, f_10_);
		method7844();
		if (aClass649_8461 != null)
			aClass649_8461.method7845();
	}

	public final void method7850() {
		if (aClass649_8466 != null) {
			Class649 class649_11_ = aClass649_8466.aClass649_8461;
			if (class649_11_ == this)
				aClass649_8466.aClass649_8461 = aClass649_8464;
			else {
				for (/**/; class649_11_.aClass649_8464 != this; class649_11_ = class649_11_.aClass649_8464) {
					/* empty */
				}
				class649_11_.aClass649_8464 = aClass649_8464;
			}
		}
		method7844();
		if (aClass649_8461 != null) {
			aClass649_8461.method7845();
			Class649 class649_12_ = aClass649_8461;
			for (;;) {
				class649_12_.aClass431_8465.method5175(aClass431_8465);
				class649_12_.aClass649_8466 = aClass649_8466;
				if (class649_12_.aClass649_8464 == null) {
					class649_12_.aClass649_8464 = aClass649_8466.aClass649_8461;
					break;
				}
				class649_12_ = class649_12_.aClass649_8464;
			}
			aClass649_8466.aClass649_8461 = aClass649_8461;
		}
		aClass649_8466 = null;
		aClass649_8464 = null;
		aClass649_8461 = null;
	}

	final Class433 method7851() {
		if (aBool8467) {
			aBool8467 = false;
			aClass433_8463.method5192(method7837());
		}
		return aClass433_8463;
	}

	public final void method7852(float f, float f_13_, float f_14_) {
		aClass431_8465.aClass436_4823.method5243(f, f_13_, f_14_);
		method7844();
		if (aClass649_8461 != null)
			aClass649_8461.method7845();
	}

	final void method7853() {
		aBool8460 = true;
		aBool8458 = true;
		aBool8467 = true;
		aBool8468 = true;
	}

	final void method7854() {
		aBool8460 = true;
		aBool8458 = true;
		aBool8467 = true;
		aBool8468 = true;
	}

	final void method7855() {
		method7844();
		if (aClass649_8461 != null)
			aClass649_8461.method7845();
		if (aClass649_8464 != null)
			aClass649_8464.method7845();
	}

	public final void method7856() {
		if (aClass649_8466 != null) {
			Class649 class649_15_ = aClass649_8466.aClass649_8461;
			if (class649_15_ == this)
				aClass649_8466.aClass649_8461 = aClass649_8464;
			else {
				for (/**/; class649_15_.aClass649_8464 != this; class649_15_ = class649_15_.aClass649_8464) {
					/* empty */
				}
				class649_15_.aClass649_8464 = aClass649_8464;
			}
		}
		method7844();
		if (aClass649_8461 != null) {
			aClass649_8461.method7845();
			Class649 class649_16_ = aClass649_8461;
			for (;;) {
				class649_16_.aClass431_8465.method5175(aClass431_8465);
				class649_16_.aClass649_8466 = aClass649_8466;
				if (class649_16_.aClass649_8464 == null) {
					class649_16_.aClass649_8464 = aClass649_8466.aClass649_8461;
					break;
				}
				class649_16_ = class649_16_.aClass649_8464;
			}
			aClass649_8466.aClass649_8461 = aClass649_8461;
		}
		aClass649_8466 = null;
		aClass649_8464 = null;
		aClass649_8461 = null;
	}
}
