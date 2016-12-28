/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class3 implements Iterator {
	Class4 aClass4_97;
	Class536 aClass536_98;
	int anInt99;
	Class536 aClass536_100 = null;

	void method545() {
		aClass536_98 = aClass4_97.aClass536Array105[0].aClass536_7132;
		anInt99 = 262050299;
		aClass536_100 = null;
	}

	void method546(int i) {
		aClass536_98 = aClass4_97.aClass536Array105[0].aClass536_7132;
		anInt99 = 262050299;
		aClass536_100 = null;
	}

	public boolean method547() {
		if (aClass4_97.aClass536Array105[anInt99 * 549572915 - 1] != aClass536_98)
			return true;
		while (anInt99 * 549572915 < aClass4_97.anInt101 * -1392230473) {
			if ((aClass4_97.aClass536Array105[(anInt99 += 262050299) * 549572915 - 1].aClass536_7132) != aClass4_97.aClass536Array105[549572915 * anInt99 - 1]) {
				aClass536_98 = (aClass4_97.aClass536Array105[549572915 * anInt99 - 1].aClass536_7132);
				return true;
			}
			aClass536_98 = aClass4_97.aClass536Array105[anInt99 * 549572915 - 1];
		}
		return false;
	}

	public Object next() {
		if (aClass4_97.aClass536Array105[anInt99 * 549572915 - 1] != aClass536_98) {
			Class536 class536 = aClass536_98;
			aClass536_98 = class536.aClass536_7132;
			aClass536_100 = class536;
			return class536;
		}
		while (anInt99 * 549572915 < aClass4_97.anInt101 * -1392230473) {
			Class536 class536 = (aClass4_97.aClass536Array105[(anInt99 += 262050299) * 549572915 - 1].aClass536_7132);
			if (aClass4_97.aClass536Array105[anInt99 * 549572915 - 1] != class536) {
				aClass536_98 = class536.aClass536_7132;
				aClass536_100 = class536;
				return class536;
			}
		}
		return null;
	}

	public boolean hasNext() {
		if (aClass4_97.aClass536Array105[anInt99 * 549572915 - 1] != aClass536_98)
			return true;
		while (anInt99 * 549572915 < aClass4_97.anInt101 * -1392230473) {
			if ((aClass4_97.aClass536Array105[(anInt99 += 262050299) * 549572915 - 1].aClass536_7132) != aClass4_97.aClass536Array105[549572915 * anInt99 - 1]) {
				aClass536_98 = (aClass4_97.aClass536Array105[549572915 * anInt99 - 1].aClass536_7132);
				return true;
			}
			aClass536_98 = aClass4_97.aClass536Array105[anInt99 * 549572915 - 1];
		}
		return false;
	}

	public void remove() {
		if (aClass536_100 == null)
			throw new IllegalStateException();
		aClass536_100.method6484();
		aClass536_100 = null;
	}

	public Object method548() {
		if (aClass4_97.aClass536Array105[anInt99 * 549572915 - 1] != aClass536_98) {
			Class536 class536 = aClass536_98;
			aClass536_98 = class536.aClass536_7132;
			aClass536_100 = class536;
			return class536;
		}
		while (anInt99 * 549572915 < aClass4_97.anInt101 * -1392230473) {
			Class536 class536 = (aClass4_97.aClass536Array105[(anInt99 += 262050299) * 549572915 - 1].aClass536_7132);
			if (aClass4_97.aClass536Array105[anInt99 * 549572915 - 1] != class536) {
				aClass536_98 = class536.aClass536_7132;
				aClass536_100 = class536;
				return class536;
			}
		}
		return null;
	}

	public boolean method549() {
		if (aClass4_97.aClass536Array105[anInt99 * 549572915 - 1] != aClass536_98)
			return true;
		while (anInt99 * 549572915 < aClass4_97.anInt101 * -1392230473) {
			if ((aClass4_97.aClass536Array105[(anInt99 += 262050299) * 549572915 - 1].aClass536_7132) != aClass4_97.aClass536Array105[549572915 * anInt99 - 1]) {
				aClass536_98 = (aClass4_97.aClass536Array105[549572915 * anInt99 - 1].aClass536_7132);
				return true;
			}
			aClass536_98 = aClass4_97.aClass536Array105[anInt99 * 549572915 - 1];
		}
		return false;
	}

	public Object method550() {
		if (aClass4_97.aClass536Array105[anInt99 * 549572915 - 1] != aClass536_98) {
			Class536 class536 = aClass536_98;
			aClass536_98 = class536.aClass536_7132;
			aClass536_100 = class536;
			return class536;
		}
		while (anInt99 * 549572915 < aClass4_97.anInt101 * -1392230473) {
			Class536 class536 = (aClass4_97.aClass536Array105[(anInt99 += 262050299) * 549572915 - 1].aClass536_7132);
			if (aClass4_97.aClass536Array105[anInt99 * 549572915 - 1] != class536) {
				aClass536_98 = class536.aClass536_7132;
				aClass536_100 = class536;
				return class536;
			}
		}
		return null;
	}

	public void method551() {
		if (aClass536_100 == null)
			throw new IllegalStateException();
		aClass536_100.method6484();
		aClass536_100 = null;
	}

	public Class536 method552(int i) {
		method546(1917160722);
		return (Class536) next();
	}

	public Class3(Class4 class4) {
		aClass4_97 = class4;
		method546(1998527277);
	}

	static final void method553(Class668 class668, int i) {
		NPC class649_sub1_sub5_sub1_sub1 = ((NPC) class668.aClass649_Sub1_Sub5_Sub1_8554);
		boolean bool = false;
		Class296 class296 = class649_sub1_sub5_sub1_sub1.aClass296_12174;
		if (null != class296.anIntArray3304)
			class296 = class296.method3984(Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, (byte) -112);
		if (null != class296)
			bool = class296.aBool3287;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = bool ? 1 : 0;
	}

	public static void method554(int i) {
		if (Class310.aClass303Array3467 == null) {
			Class310.aClass303Array3467 = Class303.method4103((byte) -109);
			Class483.aClass303_5431 = Class310.aClass303Array3467[0];
			Class34_Sub14.aLong10970 = Class249.method3450(1953577373) * -5008952368824637043L;
		}
		if (null == Class192.aClass292_2177)
			Class6.method593(560532053);
		Class303 class303 = Class483.aClass303_5431;
		int i_0_ = Class601.method7169(2086284843);
		if (class303 == Class483.aClass303_5431) {
			Class310.aString3469 = Class483.aClass303_5431.aClass38_3426.method840(Class459.aClass664_5178, 1982223612);
			Class594.aString7816 = Class310.aString3469;
			if (Class483.aClass303_5431.aBool3427)
				Class71.anInt795 = (-1270314255 * ((i_0_ * (Class483.aClass303_5431.anInt3429 * -1375848401 - (Class483.aClass303_5431.anInt3431 * -1949228175)) / 100) + -1949228175 * Class483.aClass303_5431.anInt3431));
			if (Class483.aClass303_5431.aBool3430)
				Class594.aString7816 = new StringBuilder().append(Class594.aString7816).append(" - ").append(Class71.anInt795 * -1518393839).append("%").toString();
		} else if (Class303.aClass303_3424 == Class483.aClass303_5431) {
			Class192.aClass292_2177 = null;
			Class673.method8026(16, -1798113843);
			if (Class310.aBool3471) {
				Class310.aBool3471 = false;
				Class315_Sub2.method9204(Class310.aString3472, Class87.aString872, "", false, -926219828);
			}
		} else {
			Class310.aString3469 = class303.aClass38_3412.method840(Class459.aClass664_5178, 1802078994);
			Class594.aString7816 = Class310.aString3469;
			if (Class483.aClass303_5431.aBool3430)
				Class594.aString7816 = new StringBuilder().append(Class594.aString7816).append(" - ").append(class303.anInt3429 * -1375848401).append("%").toString();
			Class71.anInt795 = class303.anInt3429 * -1345045953;
			if (Class483.aClass303_5431.aBool3427 || class303.aBool3427)
				Class34_Sub14.aLong10970 = Class249.method3450(1540231618) * -5008952368824637043L;
		}
		if (Class192.aClass292_2177 != null) {
			Class192.aClass292_2177.method3935((-1422508675219242683L * Class34_Sub14.aLong10970), Class310.aString3469, Class594.aString7816, Class71.anInt795 * -1518393839, Class483.aClass303_5431, 1977747764);
			if (null != Class310.anInterface30Array3473) {
				for (int i_1_ = -28724835 * Class310.anInt3468 + 1; i_1_ < Class310.anInterface30Array3473.length; i_1_++) {
					if (Class310.anInterface30Array3473[i_1_].method171(-2102150449) >= 100 && Class310.anInt3468 * -28724835 == i_1_ - 1 && 18 != -708374433 * client.anInt11101 && Class192.aClass292_2177.method3933(-1102640801)) {
						try {
							Class310.anInterface30Array3473[i_1_].method172((short) 807);
						} catch (Exception exception) {
							Class310.anInterface30Array3473 = null;
							break;
						}
						Class192.aClass292_2177.method3934(Class310.anInterface30Array3473[i_1_], -1971930592);
						Class310.anInt3468 += -1442489163;
						if ((Class310.anInt3468 * -28724835 >= Class310.anInterface30Array3473.length - 1) && Class310.anInterface30Array3473.length > 1)
							Class310.anInt3468 = (Class708.aClass87_8824.method1208(1028803727) ? 0 : -1) * -1442489163;
					}
				}
			}
		}
	}
}
