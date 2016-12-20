/* Class640 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class640 {
	boolean aBool8328;
	Class445 aClass445_8329;
	Class640 aClass640_8330;
	Class445 aClass445_8331;
	Class640 aClass640_8332;
	Class432 aClass432_8333;
	boolean aBool8334;
	protected boolean aBool8335;
	Class640 aClass640_8336;
	boolean aBool8337;
	Class445 aClass445_8338 = new Class445();

	final Class432 method10612() {
		if (aBool8334) {
			aBool8334 = false;
			aClass432_8333.method6902(method10637());
		}
		return aClass432_8333;
	}

	public final Class445 method10613() {
		return aClass445_8338;
	}

	final void method10614(Class445 class445) {
		if (aClass640_8332 != null) {
			Class445 class445_0_ = new Class445(class445);
			class445_0_.method7249(aClass640_8332.method10645());
			method10616(class445_0_);
		} else
			method10616(class445);
	}

	Class640() {
		aClass445_8329 = new Class445();
		aBool8328 = true;
		aClass445_8331 = new Class445();
		aBool8337 = true;
		new Class427();
		new Class427();
		aClass432_8333 = new Class432();
		aBool8334 = true;
		aBool8335 = true;
		aClass640_8332 = null;
		aClass640_8336 = null;
		aClass640_8330 = null;
	}

	final void method10615() {
		aBool8328 = true;
		aBool8337 = true;
		aBool8334 = true;
		aBool8335 = true;
	}

	final void method10616(Class445 class445) {
		aClass445_8338.method7251(class445);
		method10623();
		if (aClass640_8336 != null)
			aClass640_8336.method10622();
	}

	public final void method10617(Class438 class438) {
		aClass445_8338.aClass438_4926.method7054(class438);
		method10623();
		if (aClass640_8336 != null)
			aClass640_8336.method10622();
	}

	public final void method10618(Class442 class442) {
		aClass445_8338.aClass442_4927.method7146(class442);
		method10623();
		if (aClass640_8336 != null)
			aClass640_8336.method10622();
	}

	public final void method10619(float f, float f_1_, float f_2_) {
		aClass445_8338.aClass442_4927.method7138(f, f_1_, f_2_);
		method10623();
		if (aClass640_8336 != null)
			aClass640_8336.method10622();
	}

	public final void method10620() {
		if (aClass640_8332 != null) {
			Class640 class640_3_ = aClass640_8332.aClass640_8336;
			if (class640_3_ == this)
				aClass640_8332.aClass640_8336 = aClass640_8330;
			else {
				for (/**/; class640_3_.aClass640_8330 != this; class640_3_ = class640_3_.aClass640_8330) {
					/* empty */
				}
				class640_3_.aClass640_8330 = aClass640_8330;
			}
		}
		method10623();
		if (aClass640_8336 != null) {
			aClass640_8336.method10622();
			Class640 class640_4_ = aClass640_8336;
			for (;;) {
				class640_4_.aClass445_8338.method7249(aClass445_8338);
				class640_4_.aClass640_8332 = aClass640_8332;
				if (class640_4_.aClass640_8330 == null) {
					class640_4_.aClass640_8330 = aClass640_8332.aClass640_8336;
					break;
				}
				class640_4_ = class640_4_.aClass640_8330;
			}
			aClass640_8332.aClass640_8336 = aClass640_8336;
		}
		aClass640_8332 = null;
		aClass640_8330 = null;
		aClass640_8336 = null;
	}

	final void method10621() {
		aBool8328 = true;
		aBool8337 = true;
		aBool8334 = true;
		aBool8335 = true;
	}

	final void method10622() {
		method10623();
		if (aClass640_8336 != null)
			aClass640_8336.method10622();
		if (aClass640_8330 != null)
			aClass640_8330.method10622();
	}

	final void method10623() {
		aBool8328 = true;
		aBool8337 = true;
		aBool8334 = true;
		aBool8335 = true;
	}

	public final Class445 method10624() {
		return aClass445_8338;
	}

	final Class445 method10625() {
		if (aBool8337) {
			aBool8337 = false;
			aClass445_8331.method7251(method10637());
			aClass445_8331.method7246();
		}
		return aClass445_8329;
	}

	public final Class445 method10626() {
		if (aBool8328) {
			aBool8328 = false;
			aClass445_8329.method7251(aClass445_8338);
			if (aClass640_8332 != null)
				aClass445_8329.method7249(aClass640_8332.method10637());
		}
		return aClass445_8329;
	}

	final Class445 method10627() {
		if (aBool8337) {
			aBool8337 = false;
			aClass445_8331.method7251(method10637());
			aClass445_8331.method7246();
		}
		return aClass445_8329;
	}

	final Class445 method10628() {
		if (aBool8337) {
			aBool8337 = false;
			aClass445_8331.method7251(method10637());
			aClass445_8331.method7246();
		}
		return aClass445_8329;
	}

	final Class445 method10629() {
		if (aBool8337) {
			aBool8337 = false;
			aClass445_8331.method7251(method10637());
			aClass445_8331.method7246();
		}
		return aClass445_8329;
	}

	public final void method10630(Class438 class438) {
		aClass445_8338.aClass438_4926.method7054(class438);
		method10623();
		if (aClass640_8336 != null)
			aClass640_8336.method10622();
	}

	final Class432 method10631() {
		if (aBool8334) {
			aBool8334 = false;
			aClass432_8333.method6902(method10637());
		}
		return aClass432_8333;
	}

	final Class432 method10632() {
		if (aBool8334) {
			aBool8334 = false;
			aClass432_8333.method6902(method10637());
		}
		return aClass432_8333;
	}

	final void method10633(Class445 class445) {
		aClass445_8338.method7251(class445);
		method10623();
		if (aClass640_8336 != null)
			aClass640_8336.method10622();
	}

	final void method10634(Class445 class445) {
		aClass445_8338.method7251(class445);
		method10623();
		if (aClass640_8336 != null)
			aClass640_8336.method10622();
	}

	public final void method10635(Class438 class438) {
		aClass445_8338.aClass438_4926.method7054(class438);
		method10623();
		if (aClass640_8336 != null)
			aClass640_8336.method10622();
	}

	public final void method10636(Class442 class442) {
		aClass445_8338.aClass442_4927.method7146(class442);
		method10623();
		if (aClass640_8336 != null)
			aClass640_8336.method10622();
	}

	public final Class445 method10637() {
		if (aBool8328) {
			aBool8328 = false;
			aClass445_8329.method7251(aClass445_8338);
			if (aClass640_8332 != null)
				aClass445_8329.method7249(aClass640_8332.method10637());
		}
		return aClass445_8329;
	}

	public final Class445 method10638() {
		if (aBool8328) {
			aBool8328 = false;
			aClass445_8329.method7251(aClass445_8338);
			if (aClass640_8332 != null)
				aClass445_8329.method7249(aClass640_8332.method10637());
		}
		return aClass445_8329;
	}

	public final void method10639(float f, float f_5_, float f_6_) {
		aClass445_8338.aClass442_4927.method7138(f, f_5_, f_6_);
		method10623();
		if (aClass640_8336 != null)
			aClass640_8336.method10622();
	}

	final void method10640(Class445 class445) {
		if (aClass640_8332 != null) {
			Class445 class445_7_ = new Class445(class445);
			class445_7_.method7249(aClass640_8332.method10645());
			method10616(class445_7_);
		} else
			method10616(class445);
	}

	final void method10641(Class445 class445) {
		if (aClass640_8332 != null) {
			Class445 class445_8_ = new Class445(class445);
			class445_8_.method7249(aClass640_8332.method10645());
			method10616(class445_8_);
		} else
			method10616(class445);
	}

	final void method10642(Class445 class445) {
		if (aClass640_8332 != null) {
			Class445 class445_9_ = new Class445(class445);
			class445_9_.method7249(aClass640_8332.method10645());
			method10616(class445_9_);
		} else
			method10616(class445);
	}

	final void method10643() {
		aBool8328 = true;
		aBool8337 = true;
		aBool8334 = true;
		aBool8335 = true;
	}

	public final void method10644(Class442 class442) {
		aClass445_8338.aClass442_4927.method7146(class442);
		method10623();
		if (aClass640_8336 != null)
			aClass640_8336.method10622();
	}

	final Class445 method10645() {
		if (aBool8337) {
			aBool8337 = false;
			aClass445_8331.method7251(method10637());
			aClass445_8331.method7246();
		}
		return aClass445_8329;
	}

	final void method10646() {
		method10623();
		if (aClass640_8336 != null)
			aClass640_8336.method10622();
		if (aClass640_8330 != null)
			aClass640_8330.method10622();
	}

	final void method10647() {
		method10623();
		if (aClass640_8336 != null)
			aClass640_8336.method10622();
		if (aClass640_8330 != null)
			aClass640_8330.method10622();
	}
}
