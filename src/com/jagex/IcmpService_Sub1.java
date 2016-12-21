/* IcmpService_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jaclib.ping.IcmpService;

public class IcmpService_Sub1 extends IcmpService {
	List aList10854 = new ArrayList();
	static volatile IcmpService_Sub1 anIcmpService_Sub1_10855;

	public static boolean method10055() {
		do {
			boolean bool;
			try {
				if (available())
					break;
				bool = false;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		} while (false);
		if (anIcmpService_Sub1_10855 != null)
			throw new IllegalStateException("");
		anIcmpService_Sub1_10855 = new IcmpService_Sub1();
		Thread thread = new Thread(new Class640());
		thread.setDaemon(true);
		thread.start();
		return true;
	}

	protected void method1261(int i) {
		Iterator iterator = aList10854.iterator();
		while (iterator.hasNext()) {
			Interface74 interface74 = (Interface74) iterator.next();
			interface74.method493(0 == i, 661328509);
		}
	}

	protected void notify(int i) {
		Iterator iterator = aList10854.iterator();
		while (iterator.hasNext()) {
			Interface74 interface74 = (Interface74) iterator.next();
			interface74.method493(0 == i, 661328509);
		}
	}

	IcmpService_Sub1() {
		/* empty */
	}

	public static void method10056() {
		if (anIcmpService_Sub1_10855 != null) {
			try {
				anIcmpService_Sub1_10855.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
			anIcmpService_Sub1_10855 = null;
		}
	}

	protected void notify(int i, int i_0_, int i_1_) {
		Iterator iterator = aList10854.iterator();
		while (iterator.hasNext()) {
			Interface74 interface74 = (Interface74) iterator.next();
			interface74.method495(i, i_0_, i_1_, -1700922941);
		}
	}

	public static void method10057() {
		if (anIcmpService_Sub1_10855 != null) {
			try {
				anIcmpService_Sub1_10855.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
			anIcmpService_Sub1_10855 = null;
		}
	}

	protected void method1263(int i, int i_2_, int i_3_) {
		Iterator iterator = aList10854.iterator();
		while (iterator.hasNext()) {
			Interface74 interface74 = (Interface74) iterator.next();
			interface74.method495(i, i_2_, i_3_, -1636097268);
		}
	}

	public static void method10058() {
		if (anIcmpService_Sub1_10855 != null) {
			try {
				anIcmpService_Sub1_10855.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
			anIcmpService_Sub1_10855 = null;
		}
	}

	protected void method1260(int i) {
		Iterator iterator = aList10854.iterator();
		while (iterator.hasNext()) {
			Interface74 interface74 = (Interface74) iterator.next();
			interface74.method493(0 == i, 661328509);
		}
	}

	public static boolean method10059() {
		do {
			boolean bool;
			try {
				if (available())
					break;
				bool = false;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		} while (false);
		if (anIcmpService_Sub1_10855 != null)
			throw new IllegalStateException("");
		anIcmpService_Sub1_10855 = new IcmpService_Sub1();
		Thread thread = new Thread(new Class640());
		thread.setDaemon(true);
		thread.start();
		return true;
	}

	protected void method1262(int i) {
		Iterator iterator = aList10854.iterator();
		while (iterator.hasNext()) {
			Interface74 interface74 = (Interface74) iterator.next();
			interface74.method493(0 == i, 661328509);
		}
	}

	protected void method1264(int i, int i_4_, int i_5_) {
		Iterator iterator = aList10854.iterator();
		while (iterator.hasNext()) {
			Interface74 interface74 = (Interface74) iterator.next();
			interface74.method495(i, i_4_, i_5_, -961373752);
		}
	}

	static final void method10060(Class668 class668, int i) {
		class668.anInt8542 -= -1411037171;
		int i_6_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class15.method643(i_6_, -2109805633);
	}
}
