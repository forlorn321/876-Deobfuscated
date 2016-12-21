/* Class607 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class607 {
	int anInt7899;
	int anInt7900;
	Class4 aClass4_7901;
	Class700 aClass700_7902 = new Class700();

	public final Object method7222(Interface70 interface70) {
		long l = interface70.method436();
		for (Class536_Sub18_Sub19 class536_sub18_sub19 = (Class536_Sub18_Sub19) aClass4_7901.method556(l); class536_sub18_sub19 != null; class536_sub18_sub19 = ((Class536_Sub18_Sub19) aClass4_7901.method557(-2103660604))) {
			if (class536_sub18_sub19.anInterface70_11826.method432(interface70)) {
				Object object = class536_sub18_sub19.method10814();
				if (object == null) {
					class536_sub18_sub19.method6484(447798810);
					class536_sub18_sub19.method9521(-1525579103);
					anInt7899 += class536_sub18_sub19.anInt11827;
				} else {
					if (class536_sub18_sub19.method10815()) {
						Class536_Sub18_Sub19_Sub1 class536_sub18_sub19_sub1 = (new Class536_Sub18_Sub19_Sub1(interface70, object, class536_sub18_sub19.anInt11827));
						aClass4_7901.method560(class536_sub18_sub19_sub1, (class536_sub18_sub19.aLong7133 * -6909195213925454795L));
						aClass700_7902.method8239(class536_sub18_sub19_sub1, (byte) 57);
						class536_sub18_sub19_sub1.aLong10507 = 0L;
						class536_sub18_sub19.method6484(-794876254);
						class536_sub18_sub19.method9521(-709943953);
					} else {
						aClass700_7902.method8239(class536_sub18_sub19, (byte) -33);
						class536_sub18_sub19.aLong10507 = 0L;
					}
					return object;
				}
			}
		}
		return null;
	}

	final void method7223(Interface70 interface70) {
		long l = interface70.method436();
		for (Class536_Sub18_Sub19 class536_sub18_sub19 = (Class536_Sub18_Sub19) aClass4_7901.method556(l); class536_sub18_sub19 != null; class536_sub18_sub19 = (Class536_Sub18_Sub19) aClass4_7901.method557(-876858681)) {
			if (class536_sub18_sub19.anInterface70_11826.method432(interface70)) {
				method7233(class536_sub18_sub19);
				break;
			}
		}
	}

	public final void method7224(int i) {
		for (Class536_Sub18_Sub19 class536_sub18_sub19 = ((Class536_Sub18_Sub19) aClass700_7902.method8248(1553631156)); class536_sub18_sub19 != null; class536_sub18_sub19 = ((Class536_Sub18_Sub19) aClass700_7902.method8241(1965211972))) {
			if (class536_sub18_sub19.method10815()) {
				if (class536_sub18_sub19.method10814() == null) {
					class536_sub18_sub19.method6484(-745976310);
					class536_sub18_sub19.method9521(-638159489);
					anInt7899 += class536_sub18_sub19.anInt11827;
				}
			} else if ((class536_sub18_sub19.aLong10507 += 2122374251850846107L) * 4749301371101216403L > (long) i) {
				Class536_Sub18_Sub19_Sub2 class536_sub18_sub19_sub2 = (new Class536_Sub18_Sub19_Sub2(class536_sub18_sub19.anInterface70_11826, class536_sub18_sub19.method10814(), class536_sub18_sub19.anInt11827));
				aClass4_7901.method560(class536_sub18_sub19_sub2, (class536_sub18_sub19.aLong7133 * -6909195213925454795L));
				Class38.method841(class536_sub18_sub19_sub2, class536_sub18_sub19, 1723756988);
				class536_sub18_sub19.method6484(-712722032);
				class536_sub18_sub19.method9521(-1228864369);
			}
		}
	}

	public final void method7225(Object object, Interface70 interface70) {
		method7226(object, interface70, 1);
	}

	final void method7226(Object object, Interface70 interface70, int i) {
		if (i > anInt7900)
			throw new IllegalStateException();
		method7223(interface70);
		anInt7899 -= i;
		while (anInt7899 < 0) {
			Class536_Sub18_Sub19 class536_sub18_sub19 = (Class536_Sub18_Sub19) aClass700_7902.method8237(1919124059);
			method7233(class536_sub18_sub19);
		}
		Class536_Sub18_Sub19_Sub1 class536_sub18_sub19_sub1 = new Class536_Sub18_Sub19_Sub1(interface70, object, i);
		aClass4_7901.method560(class536_sub18_sub19_sub1, interface70.method436());
		aClass700_7902.method8239(class536_sub18_sub19_sub1, (byte) -34);
		class536_sub18_sub19_sub1.aLong10507 = 0L;
	}

	public final void method7227(int i) {
		for (Class536_Sub18_Sub19 class536_sub18_sub19 = ((Class536_Sub18_Sub19) aClass700_7902.method8248(-1832115652)); class536_sub18_sub19 != null; class536_sub18_sub19 = ((Class536_Sub18_Sub19) aClass700_7902.method8241(-1082626249))) {
			if (class536_sub18_sub19.method10815()) {
				if (class536_sub18_sub19.method10814() == null) {
					class536_sub18_sub19.method6484(-433369366);
					class536_sub18_sub19.method9521(-1124137203);
					anInt7899 += class536_sub18_sub19.anInt11827;
				}
			} else if ((class536_sub18_sub19.aLong10507 += 2122374251850846107L) * 4749301371101216403L > (long) i) {
				Class536_Sub18_Sub19_Sub2 class536_sub18_sub19_sub2 = (new Class536_Sub18_Sub19_Sub2(class536_sub18_sub19.anInterface70_11826, class536_sub18_sub19.method10814(), class536_sub18_sub19.anInt11827));
				aClass4_7901.method560(class536_sub18_sub19_sub2, (class536_sub18_sub19.aLong7133 * -6909195213925454795L));
				Class38.method841(class536_sub18_sub19_sub2, class536_sub18_sub19, 1095057505);
				class536_sub18_sub19.method6484(1556312716);
				class536_sub18_sub19.method9521(-2113743350);
			}
		}
	}

	public final void method7228() {
		for (Class536_Sub18_Sub19 class536_sub18_sub19 = ((Class536_Sub18_Sub19) aClass700_7902.method8248(-151526516)); class536_sub18_sub19 != null; class536_sub18_sub19 = ((Class536_Sub18_Sub19) aClass700_7902.method8241(812774002))) {
			if (class536_sub18_sub19.method10815()) {
				class536_sub18_sub19.method6484(478270250);
				class536_sub18_sub19.method9521(-66056173);
				anInt7899 += class536_sub18_sub19.anInt11827;
			}
		}
	}

	public final void method7229() {
		aClass700_7902.method8238(-2009020098);
		aClass4_7901.method561(-2117553523);
		anInt7899 = anInt7900;
	}

	public final void method7230() {
		aClass700_7902.method8238(-2139795729);
		aClass4_7901.method561(-2117553523);
		anInt7899 = anInt7900;
	}

	public Class607(int i) {
		anInt7900 = i;
		anInt7899 = i;
		int i_0_;
		for (i_0_ = 1; i_0_ + i_0_ < i; i_0_ += i_0_) {
			/* empty */
		}
		aClass4_7901 = new Class4(i_0_);
	}

	public final void method7231(int i) {
		for (Class536_Sub18_Sub19 class536_sub18_sub19 = ((Class536_Sub18_Sub19) aClass700_7902.method8248(-145201957)); class536_sub18_sub19 != null; class536_sub18_sub19 = ((Class536_Sub18_Sub19) aClass700_7902.method8241(1143675365))) {
			if (class536_sub18_sub19.method10815()) {
				if (class536_sub18_sub19.method10814() == null) {
					class536_sub18_sub19.method6484(234348545);
					class536_sub18_sub19.method9521(-1408837793);
					anInt7899 += class536_sub18_sub19.anInt11827;
				}
			} else if ((class536_sub18_sub19.aLong10507 += 2122374251850846107L) * 4749301371101216403L > (long) i) {
				Class536_Sub18_Sub19_Sub2 class536_sub18_sub19_sub2 = (new Class536_Sub18_Sub19_Sub2(class536_sub18_sub19.anInterface70_11826, class536_sub18_sub19.method10814(), class536_sub18_sub19.anInt11827));
				aClass4_7901.method560(class536_sub18_sub19_sub2, (class536_sub18_sub19.aLong7133 * -6909195213925454795L));
				Class38.method841(class536_sub18_sub19_sub2, class536_sub18_sub19, 1060637748);
				class536_sub18_sub19.method6484(-727709450);
				class536_sub18_sub19.method9521(-1527854123);
			}
		}
	}

	public final void method7232(int i) {
		for (Class536_Sub18_Sub19 class536_sub18_sub19 = ((Class536_Sub18_Sub19) aClass700_7902.method8248(2131315607)); class536_sub18_sub19 != null; class536_sub18_sub19 = ((Class536_Sub18_Sub19) aClass700_7902.method8241(-1803642680))) {
			if (class536_sub18_sub19.method10815()) {
				if (class536_sub18_sub19.method10814() == null) {
					class536_sub18_sub19.method6484(-969526665);
					class536_sub18_sub19.method9521(-218064834);
					anInt7899 += class536_sub18_sub19.anInt11827;
				}
			} else if ((class536_sub18_sub19.aLong10507 += 2122374251850846107L) * 4749301371101216403L > (long) i) {
				Class536_Sub18_Sub19_Sub2 class536_sub18_sub19_sub2 = (new Class536_Sub18_Sub19_Sub2(class536_sub18_sub19.anInterface70_11826, class536_sub18_sub19.method10814(), class536_sub18_sub19.anInt11827));
				aClass4_7901.method560(class536_sub18_sub19_sub2, (class536_sub18_sub19.aLong7133 * -6909195213925454795L));
				Class38.method841(class536_sub18_sub19_sub2, class536_sub18_sub19, 778889033);
				class536_sub18_sub19.method6484(91175663);
				class536_sub18_sub19.method9521(-1690085940);
			}
		}
	}

	final void method7233(Class536_Sub18_Sub19 class536_sub18_sub19) {
		if (class536_sub18_sub19 != null) {
			class536_sub18_sub19.method6484(-196363385);
			class536_sub18_sub19.method9521(-2041094839);
			anInt7899 += class536_sub18_sub19.anInt11827;
		}
	}
}
