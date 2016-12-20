/* IcmpService_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jaclib.ping.IcmpService;

public class IcmpService_Sub1 extends IcmpService {
	List aList10868 = new ArrayList();
	static volatile IcmpService_Sub1 anIcmpService_Sub1_10869;

	public static void method17094() {
		if (null != anIcmpService_Sub1_10869) {
			try {
				anIcmpService_Sub1_10869.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
			anIcmpService_Sub1_10869 = null;
		}
	}

	public static void method17095() {
		if (null != anIcmpService_Sub1_10869) {
			try {
				anIcmpService_Sub1_10869.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
			anIcmpService_Sub1_10869 = null;
		}
	}

	protected void notify(int i, int i_0_, int i_1_) {
		Iterator iterator = aList10868.iterator();
		while (iterator.hasNext()) {
			Interface74 interface74 = (Interface74) iterator.next();
			interface74.method485(i, i_0_, i_1_, (byte) -31);
		}
	}

	public static boolean method17096() {
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
		if (null != anIcmpService_Sub1_10869)
			throw new IllegalStateException("");
		anIcmpService_Sub1_10869 = new IcmpService_Sub1();
		Thread thread = new Thread(new Class644());
		thread.setDaemon(true);
		thread.start();
		return true;
	}

	public static void method17097(Interface74 interface74) {
		if (null == anIcmpService_Sub1_10869)
			throw new IllegalStateException("");
		anIcmpService_Sub1_10869.aList10868.add(interface74);
	}

	protected void notify(int i) {
		Iterator iterator = aList10868.iterator();
		while (iterator.hasNext()) {
			Interface74 interface74 = (Interface74) iterator.next();
			interface74.method489(i == 0, 1790206391);
		}
	}

	IcmpService_Sub1() {
		/* empty */
	}

	public static void method17098(Interface74 interface74) {
		if (null == anIcmpService_Sub1_10869)
			throw new IllegalStateException("");
		anIcmpService_Sub1_10869.aList10868.add(interface74);
	}

	public static void method17099() {
		if (null != anIcmpService_Sub1_10869) {
			try {
				anIcmpService_Sub1_10869.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
			anIcmpService_Sub1_10869 = null;
		}
	}

	protected void method1689(int i) {
		Iterator iterator = aList10868.iterator();
		while (iterator.hasNext()) {
			Interface74 interface74 = (Interface74) iterator.next();
			interface74.method489(i == 0, -2042662971);
		}
	}

	protected void method1690(int i, int i_2_, int i_3_) {
		Iterator iterator = aList10868.iterator();
		while (iterator.hasNext()) {
			Interface74 interface74 = (Interface74) iterator.next();
			interface74.method485(i, i_2_, i_3_, (byte) -90);
		}
	}

	static void method17100(Class180 class180, int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		if ((Class700_Sub27.aClass147_10907 == null || null == Class327_Sub2.aClass147_10052 || null == Class190.aClass147_2130) && Class338.aClass459_3656.method7480(1488678351 * Class637.anInt8318, -1700242191) && Class338.aClass459_3656.method7480(Class171.anInt1882 * -1403969657, -1709395025) && Class338.aClass459_3656.method7480(644846365 * Class156.anInt1720, -836421466)) {
			Class185 class185 = Class165.method2653(Class338.aClass459_3656, Class171.anInt1882 * -1403969657, 0);
			Class327_Sub2.aClass147_10052 = class180.method3271(class185, true);
			class185.method3621();
			Class218.aClass147_2285 = class180.method3271(class185, true);
			Class700_Sub27.aClass147_10907 = class180.method3271(Class165.method2653((Class338.aClass459_3656), (Class637.anInt8318 * 1488678351), 0), true);
			Class185 class185_9_ = Class165.method2653(Class338.aClass459_3656, 644846365 * Class156.anInt1720, 0);
			Class190.aClass147_2130 = class180.method3271(class185_9_, true);
			class185_9_.method3621();
			Class700_Sub16.aClass147_10856 = class180.method3271(class185_9_, true);
		}
		if (Class700_Sub27.aClass147_10907 != null && Class327_Sub2.aClass147_10052 != null && null != Class190.aClass147_2130) {
			int i_10_ = ((i_5_ - Class190.aClass147_2130.method2407() * 2) / Class700_Sub27.aClass147_10907.method2407());
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
				Class700_Sub27.aClass147_10907.method2415((i + Class190.aClass147_2130.method2407() + i_11_ * Class700_Sub27.aClass147_10907.method2407()), (i_6_ + i_4_ - Class700_Sub27.aClass147_10907.method2424()));
			int i_12_ = ((i_6_ - i_7_ - Class190.aClass147_2130.method2424()) / Class327_Sub2.aClass147_10052.method2424());
			for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
				Class327_Sub2.aClass147_10052.method2415(i, i_4_ + i_7_ + i_13_ * Class327_Sub2.aClass147_10052.method2424());
				Class218.aClass147_2285.method2415(i + i_5_ - Class218.aClass147_2285.method2407(), (i_7_ + i_4_ + i_13_ * Class327_Sub2.aClass147_10052.method2424()));
			}
			Class190.aClass147_2130.method2415(i, (i_4_ + i_6_ - Class190.aClass147_2130.method2424()));
			Class700_Sub16.aClass147_10856.method2415(i_5_ + i - Class190.aClass147_2130.method2407(), i_4_ + i_6_ - Class190.aClass147_2130.method2424());
		}
	}
}
