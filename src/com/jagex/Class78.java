/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class78 implements Interface6 {
	Class459 aClass459_799;
	Class205 aClass205_800;
	static int anInt801;
	public static short[][][] aShortArrayArrayArray802;

	void method1545(int i) {
		synchronized (aClass205_800) {
			aClass205_800.method3820(-420343719);
		}
	}

	void method1546(int i, int i_0_) {
		aClass205_800 = new Class205(i);
	}

	void method1547(int i) {
		synchronized (aClass205_800) {
			aClass205_800.method3793((byte) 8);
		}
	}

	void method1548(int i, byte i_1_) {
		synchronized (aClass205_800) {
			aClass205_800.method3792(i, (byte) -21);
		}
	}

	void method1549() {
		synchronized (aClass205_800) {
			aClass205_800.method3793((byte) 104);
		}
	}

	void method1550(int i) {
		aClass205_800 = new Class205(i);
	}

	void method1551(int i) {
		aClass205_800 = new Class205(i);
	}

	void method1552() {
		synchronized (aClass205_800) {
			aClass205_800.method3793((byte) 85);
		}
	}

	void method1553() {
		synchronized (aClass205_800) {
			aClass205_800.method3793((byte) 99);
		}
	}

	Class78(Class459 class459, int i) {
		aClass459_799 = class459;
		aClass205_800 = new Class205(i);
	}

	void method1554() {
		synchronized (aClass205_800) {
			aClass205_800.method3793((byte) 66);
		}
	}

	void method1555() {
		synchronized (aClass205_800) {
			aClass205_800.method3793((byte) 49);
		}
	}

	void method1556(int i) {
		synchronized (aClass205_800) {
			aClass205_800.method3792(i, (byte) 70);
		}
	}

	void method1557(int i) {
		synchronized (aClass205_800) {
			aClass205_800.method3792(i, (byte) -13);
		}
	}

	void method1558() {
		synchronized (aClass205_800) {
			aClass205_800.method3820(-1906173262);
		}
	}

	void method1559() {
		synchronized (aClass205_800) {
			aClass205_800.method3820(-631274875);
		}
	}

	public static void method1560(int i, byte i_2_) {
		if (i != client.anInt11048 * -1927019389) {
			client.anInt11312 = 0;
			if (client.anInt11048 * -1927019389 == 9 && 10 != i)
				Class382.method6406(-98109999);
			if (i == 17 || 19 == i)
				Class672.method13830(-457796231);
			if (17 != i && null != Class494.aClass563_5549) {
				Class494.aClass563_5549.method9470((byte) 83);
				Class494.aClass563_5549 = null;
			}
			if (i == 16) {
				Class542.method9025((-1927019389 * client.anInt11048 == 11 || 13 == client.anInt11048 * -1927019389 || ((Class536.aClass615_7224.anInt8048 * 1432330895) != -2119864417 * client.anInt11237)), -1957948753);
				Class462.method7616(896117660);
			}
			if (i == 0) {
				boolean bool;
				if (Class536.aClass615_7224.anInt8043 * 851648657 == -1)
					bool = (1 == client.anInt11048 * -1927019389 || 4 == client.anInt11048 * -1927019389);
				else
					bool = (851648657 * Class536.aClass615_7224.anInt8043 != -2119864417 * client.anInt11237);
				Class274.method5130(bool, (short) 31321);
			}
			if (i == 1 || 4 == i) {
				if (!Class323.method5723(989736162))
					return;
			} else if (i == 3 || i == 8 && -1927019389 * client.anInt11048 != 6) {
				if (!Class672.method13830(-193737351))
					return;
			} else if (13 == i)
				Class72.method1495((short) 8437);
			if (Class104.method1808(i, (byte) -22)) {
				client.aClass509_11072.method8304(1639510413);
				client.aClass509_11072.aLong6967 = -4523297059643251975L;
			}
			if (10 == i || 16 == i)
				Class268.method5050(-1823527829);
			boolean bool = (12 == i || Class640_Sub1_Sub3_Sub2.method18677(i, 1495946201) || Class208_Sub23.method15642(i, -2100626996));
			boolean bool_3_ = (-1927019389 * client.anInt11048 == 12 || Class640_Sub1_Sub3_Sub2.method18677((client.anInt11048 * -1927019389), 1495946201) || Class208_Sub23.method15642((client.anInt11048 * -1927019389), -1592197630));
			if (bool_3_ != bool)
				Class454.aClass452_4972.method7305(!bool, -1877645654);
			if (Class104.method1808(i, (byte) -81) || i == 17 || i == 19)
				Class402.aClass180_4150.method3114();
			client.anInt11048 = i * 8874539;
		}
	}
}
