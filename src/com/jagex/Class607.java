/* Class607 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class607 {
	Class693 aClass693_7981 = new Class693();
	int anInt7982;
	Class14 aClass14_7983;
	int anInt7984;

	public final Object method10061(Interface69 interface69) {
		long l = interface69.method423();
		for (Class527_Sub8_Sub14 class527_sub8_sub14 = (Class527_Sub8_Sub14) aClass14_7983.method709(l); class527_sub8_sub14 != null; class527_sub8_sub14 = (Class527_Sub8_Sub14) aClass14_7983.method715(1788510676)) {
			if (class527_sub8_sub14.anInterface69_11777.method425(interface69)) {
				Object object = class527_sub8_sub14.method18343();
				if (object == null) {
					class527_sub8_sub14.method8735(-1889161967);
					class527_sub8_sub14.method16057((byte) -126);
					anInt7984 += class527_sub8_sub14.anInt11778;
				} else {
					if (class527_sub8_sub14.method18344()) {
						Class527_Sub8_Sub14_Sub2 class527_sub8_sub14_sub2 = new Class527_Sub8_Sub14_Sub2(interface69, object, (class527_sub8_sub14.anInt11778));
						aClass14_7983.method714(class527_sub8_sub14_sub2, (class527_sub8_sub14.aLong7106 * -8168620736534281759L));
						aClass693_7981.method14055(class527_sub8_sub14_sub2, 1099807780);
						class527_sub8_sub14_sub2.aLong10401 = 0L;
						class527_sub8_sub14.method8735(-1889161967);
						class527_sub8_sub14.method16057((byte) -28);
					} else {
						aClass693_7981.method14055(class527_sub8_sub14, 815412593);
						class527_sub8_sub14.aLong10401 = 0L;
					}
					return object;
				}
			}
		}
		return null;
	}

	public final void method10062(Object object, Interface69 interface69) {
		method10066(object, interface69, 1);
	}

	final void method10063(Interface69 interface69) {
		long l = interface69.method423();
		for (Class527_Sub8_Sub14 class527_sub8_sub14 = (Class527_Sub8_Sub14) aClass14_7983.method709(l); class527_sub8_sub14 != null; class527_sub8_sub14 = (Class527_Sub8_Sub14) aClass14_7983.method715(968308428)) {
			if (class527_sub8_sub14.anInterface69_11777.method425(interface69)) {
				method10072(class527_sub8_sub14);
				break;
			}
		}
	}

	public final void method10064() {
		for (Class527_Sub8_Sub14 class527_sub8_sub14 = (Class527_Sub8_Sub14) aClass693_7981.method14072(-65206765); class527_sub8_sub14 != null; class527_sub8_sub14 = ((Class527_Sub8_Sub14) aClass693_7981.method14059(1219693505))) {
			if (class527_sub8_sub14.method18344()) {
				class527_sub8_sub14.method8735(-1889161967);
				class527_sub8_sub14.method16057((byte) -74);
				anInt7984 += class527_sub8_sub14.anInt11778;
			}
		}
	}

	public final void method10065(Object object, Interface69 interface69) {
		method10066(object, interface69, 1);
	}

	final void method10066(Object object, Interface69 interface69, int i) {
		if (i > anInt7982)
			throw new IllegalStateException();
		method10063(interface69);
		anInt7984 -= i;
		while (anInt7984 < 0) {
			Class527_Sub8_Sub14 class527_sub8_sub14 = (Class527_Sub8_Sub14) aClass693_7981.method14056(518720638);
			method10072(class527_sub8_sub14);
		}
		Class527_Sub8_Sub14_Sub2 class527_sub8_sub14_sub2 = new Class527_Sub8_Sub14_Sub2(interface69, object, i);
		aClass14_7983.method714(class527_sub8_sub14_sub2, interface69.method423());
		aClass693_7981.method14055(class527_sub8_sub14_sub2, 435215364);
		class527_sub8_sub14_sub2.aLong10401 = 0L;
	}

	public final void method10067(int i) {
		for (Class527_Sub8_Sub14 class527_sub8_sub14 = (Class527_Sub8_Sub14) aClass693_7981.method14072(337295731); class527_sub8_sub14 != null; class527_sub8_sub14 = ((Class527_Sub8_Sub14) aClass693_7981.method14059(-1207762306))) {
			if (class527_sub8_sub14.method18344()) {
				if (class527_sub8_sub14.method18343() == null) {
					class527_sub8_sub14.method8735(-1889161967);
					class527_sub8_sub14.method16057((byte) -36);
					anInt7984 += class527_sub8_sub14.anInt11778;
				}
			} else if ((class527_sub8_sub14.aLong10401 += 1718300610056979369L) * -8775265850242314087L > (long) i) {
				Class527_Sub8_Sub14_Sub1 class527_sub8_sub14_sub1 = (new Class527_Sub8_Sub14_Sub1(class527_sub8_sub14.anInterface69_11777, class527_sub8_sub14.method18343(), class527_sub8_sub14.anInt11778));
				aClass14_7983.method714(class527_sub8_sub14_sub1, (class527_sub8_sub14.aLong7106 * -8168620736534281759L));
				Class370.method6361(class527_sub8_sub14_sub1, class527_sub8_sub14, -1979827248);
				class527_sub8_sub14.method8735(-1889161967);
				class527_sub8_sub14.method16057((byte) -51);
			}
		}
	}

	public Class607(int i) {
		anInt7982 = i;
		anInt7984 = i;
		int i_0_;
		for (i_0_ = 1; i_0_ + i_0_ < i; i_0_ += i_0_) {
			/* empty */
		}
		aClass14_7983 = new Class14(i_0_);
	}

	public final void method10068() {
		for (Class527_Sub8_Sub14 class527_sub8_sub14 = (Class527_Sub8_Sub14) aClass693_7981.method14072(442416549); class527_sub8_sub14 != null; class527_sub8_sub14 = ((Class527_Sub8_Sub14) aClass693_7981.method14059(-1159434307))) {
			if (class527_sub8_sub14.method18344()) {
				class527_sub8_sub14.method8735(-1889161967);
				class527_sub8_sub14.method16057((byte) -72);
				anInt7984 += class527_sub8_sub14.anInt11778;
			}
		}
	}

	public final void method10069() {
		aClass693_7981.method14054(-10722784);
		aClass14_7983.method721(-731055571);
		anInt7984 = anInt7982;
	}

	final void method10070(Class527_Sub8_Sub14 class527_sub8_sub14) {
		if (class527_sub8_sub14 != null) {
			class527_sub8_sub14.method8735(-1889161967);
			class527_sub8_sub14.method16057((byte) -120);
			anInt7984 += class527_sub8_sub14.anInt11778;
		}
	}

	final void method10071(Interface69 interface69) {
		long l = interface69.method423();
		for (Class527_Sub8_Sub14 class527_sub8_sub14 = (Class527_Sub8_Sub14) aClass14_7983.method709(l); class527_sub8_sub14 != null; class527_sub8_sub14 = ((Class527_Sub8_Sub14) aClass14_7983.method715(-2021119985))) {
			if (class527_sub8_sub14.anInterface69_11777.method425(interface69)) {
				method10072(class527_sub8_sub14);
				break;
			}
		}
	}

	final void method10072(Class527_Sub8_Sub14 class527_sub8_sub14) {
		if (class527_sub8_sub14 != null) {
			class527_sub8_sub14.method8735(-1889161967);
			class527_sub8_sub14.method16057((byte) -73);
			anInt7984 += class527_sub8_sub14.anInt11778;
		}
	}

	final void method10073(Class527_Sub8_Sub14 class527_sub8_sub14) {
		if (class527_sub8_sub14 != null) {
			class527_sub8_sub14.method8735(-1889161967);
			class527_sub8_sub14.method16057((byte) -73);
			anInt7984 += class527_sub8_sub14.anInt11778;
		}
	}

	public final Object method10074(Interface69 interface69) {
		long l = interface69.method423();
		for (Class527_Sub8_Sub14 class527_sub8_sub14 = (Class527_Sub8_Sub14) aClass14_7983.method709(l); class527_sub8_sub14 != null; class527_sub8_sub14 = (Class527_Sub8_Sub14) aClass14_7983.method715(89166923)) {
			if (class527_sub8_sub14.anInterface69_11777.method425(interface69)) {
				Object object = class527_sub8_sub14.method18343();
				if (object == null) {
					class527_sub8_sub14.method8735(-1889161967);
					class527_sub8_sub14.method16057((byte) -29);
					anInt7984 += class527_sub8_sub14.anInt11778;
				} else {
					if (class527_sub8_sub14.method18344()) {
						Class527_Sub8_Sub14_Sub2 class527_sub8_sub14_sub2 = new Class527_Sub8_Sub14_Sub2(interface69, object, (class527_sub8_sub14.anInt11778));
						aClass14_7983.method714(class527_sub8_sub14_sub2, (class527_sub8_sub14.aLong7106 * -8168620736534281759L));
						aClass693_7981.method14055(class527_sub8_sub14_sub2, 1537257953);
						class527_sub8_sub14_sub2.aLong10401 = 0L;
						class527_sub8_sub14.method8735(-1889161967);
						class527_sub8_sub14.method16057((byte) -74);
					} else {
						aClass693_7981.method14055(class527_sub8_sub14, 1535260816);
						class527_sub8_sub14.aLong10401 = 0L;
					}
					return object;
				}
			}
		}
		return null;
	}

	public final Object method10075(Interface69 interface69) {
		long l = interface69.method423();
		for (Class527_Sub8_Sub14 class527_sub8_sub14 = (Class527_Sub8_Sub14) aClass14_7983.method709(l); class527_sub8_sub14 != null; class527_sub8_sub14 = (Class527_Sub8_Sub14) aClass14_7983.method715(1569046147)) {
			if (class527_sub8_sub14.anInterface69_11777.method425(interface69)) {
				Object object = class527_sub8_sub14.method18343();
				if (object == null) {
					class527_sub8_sub14.method8735(-1889161967);
					class527_sub8_sub14.method16057((byte) -99);
					anInt7984 += class527_sub8_sub14.anInt11778;
				} else {
					if (class527_sub8_sub14.method18344()) {
						Class527_Sub8_Sub14_Sub2 class527_sub8_sub14_sub2 = new Class527_Sub8_Sub14_Sub2(interface69, object, (class527_sub8_sub14.anInt11778));
						aClass14_7983.method714(class527_sub8_sub14_sub2, (class527_sub8_sub14.aLong7106 * -8168620736534281759L));
						aClass693_7981.method14055(class527_sub8_sub14_sub2, 1511825041);
						class527_sub8_sub14_sub2.aLong10401 = 0L;
						class527_sub8_sub14.method8735(-1889161967);
						class527_sub8_sub14.method16057((byte) -21);
					} else {
						aClass693_7981.method14055(class527_sub8_sub14, 1825272830);
						class527_sub8_sub14.aLong10401 = 0L;
					}
					return object;
				}
			}
		}
		return null;
	}

	public final void method10076(int i) {
		for (Class527_Sub8_Sub14 class527_sub8_sub14 = ((Class527_Sub8_Sub14) aClass693_7981.method14072(1597043044)); class527_sub8_sub14 != null; class527_sub8_sub14 = ((Class527_Sub8_Sub14) aClass693_7981.method14059(510005335))) {
			if (class527_sub8_sub14.method18344()) {
				if (class527_sub8_sub14.method18343() == null) {
					class527_sub8_sub14.method8735(-1889161967);
					class527_sub8_sub14.method16057((byte) -122);
					anInt7984 += class527_sub8_sub14.anInt11778;
				}
			} else if ((class527_sub8_sub14.aLong10401 += 1718300610056979369L) * -8775265850242314087L > (long) i) {
				Class527_Sub8_Sub14_Sub1 class527_sub8_sub14_sub1 = (new Class527_Sub8_Sub14_Sub1(class527_sub8_sub14.anInterface69_11777, class527_sub8_sub14.method18343(), class527_sub8_sub14.anInt11778));
				aClass14_7983.method714(class527_sub8_sub14_sub1, (class527_sub8_sub14.aLong7106 * -8168620736534281759L));
				Class370.method6361(class527_sub8_sub14_sub1, class527_sub8_sub14, -1984009267);
				class527_sub8_sub14.method8735(-1889161967);
				class527_sub8_sub14.method16057((byte) -97);
			}
		}
	}

	public final void method10077(int i) {
		for (Class527_Sub8_Sub14 class527_sub8_sub14 = (Class527_Sub8_Sub14) aClass693_7981.method14072(518607675); class527_sub8_sub14 != null; class527_sub8_sub14 = ((Class527_Sub8_Sub14) aClass693_7981.method14059(1749556236))) {
			if (class527_sub8_sub14.method18344()) {
				if (class527_sub8_sub14.method18343() == null) {
					class527_sub8_sub14.method8735(-1889161967);
					class527_sub8_sub14.method16057((byte) -5);
					anInt7984 += class527_sub8_sub14.anInt11778;
				}
			} else if ((class527_sub8_sub14.aLong10401 += 1718300610056979369L) * -8775265850242314087L > (long) i) {
				Class527_Sub8_Sub14_Sub1 class527_sub8_sub14_sub1 = (new Class527_Sub8_Sub14_Sub1(class527_sub8_sub14.anInterface69_11777, class527_sub8_sub14.method18343(), class527_sub8_sub14.anInt11778));
				aClass14_7983.method714(class527_sub8_sub14_sub1, (class527_sub8_sub14.aLong7106 * -8168620736534281759L));
				Class370.method6361(class527_sub8_sub14_sub1, class527_sub8_sub14, -1181859601);
				class527_sub8_sub14.method8735(-1889161967);
				class527_sub8_sub14.method16057((byte) -90);
			}
		}
	}

	public final void method10078() {
		aClass693_7981.method14054(-1981047222);
		aClass14_7983.method721(615653710);
		anInt7984 = anInt7982;
	}

	public final void method10079() {
		aClass693_7981.method14054(-200436518);
		aClass14_7983.method721(-410419959);
		anInt7984 = anInt7982;
	}
}
