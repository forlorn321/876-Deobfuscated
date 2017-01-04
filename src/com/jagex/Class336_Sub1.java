/* Class336_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.lang.management.GarbageCollectorMXBean;

public class Class336_Sub1 extends Class336 {
	Class286 aClass286_10013;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10014;
	Class285 aClass285_10015;
	static GarbageCollectorMXBean aGarbageCollectorMXBean10016;

	boolean method9153() throws Exception_Sub7 {
		aClass286_10013 = aClass167_Sub3_3631.method8714("BatchedSprite");
		aClass536_Sub8_Sub1_10014 = aClass286_10013.method3866("SpriteSampler", (byte) 0);
		aClass285_10015 = aClass286_10013.method3855("Normal", (byte) 22);
		aClass286_10013.method3850(aClass285_10015);
		return true;
	}

	public Class336_Sub1(Class167_Sub3 class167_sub3) throws Exception_Sub7 {
		super(class167_sub3);
		method9154(-1807415634);
	}

	public void method4379() {
		aClass286_10013.method3843();
		aClass286_10013.method3896(aClass536_Sub8_Sub1_10014, 0, anInterface36_3630, -948976061);
	}

	boolean method9154(int i) throws Exception_Sub7 {
		aClass286_10013 = aClass167_Sub3_3631.method8714("BatchedSprite");
		aClass536_Sub8_Sub1_10014 = aClass286_10013.method3866("SpriteSampler", (byte) 0);
		aClass285_10015 = aClass286_10013.method3855("Normal", (byte) -52);
		aClass286_10013.method3850(aClass285_10015);
		return true;
	}

	boolean method9155() throws Exception_Sub7 {
		aClass286_10013 = aClass167_Sub3_3631.method8714("BatchedSprite");
		aClass536_Sub8_Sub1_10014 = aClass286_10013.method3866("SpriteSampler", (byte) 0);
		aClass285_10015 = aClass286_10013.method3855("Normal", (byte) -10);
		aClass286_10013.method3850(aClass285_10015);
		return true;
	}

	boolean method9156() throws Exception_Sub7 {
		aClass286_10013 = aClass167_Sub3_3631.method8714("BatchedSprite");
		aClass536_Sub8_Sub1_10014 = aClass286_10013.method3866("SpriteSampler", (byte) 0);
		aClass285_10015 = aClass286_10013.method3855("Normal", (byte) -6);
		aClass286_10013.method3850(aClass285_10015);
		return true;
	}

	public void method4378() {
		aClass286_10013.method3843();
		aClass286_10013.method3896(aClass536_Sub8_Sub1_10014, 0, anInterface36_3630, -948976061);
	}

	static Class536_Sub18_Sub5 method9157(int i) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = ((Class536_Sub18_Sub5) Class536_Sub18_Sub5.aClass700_11647.method8248(1204730496));
		if (null != class536_sub18_sub5) {
			class536_sub18_sub5.method6484();
			class536_sub18_sub5.method9521(-889431304);
			return class536_sub18_sub5;
		}
		for (;;) {
			class536_sub18_sub5 = ((Class536_Sub18_Sub5) Class536_Sub18_Sub5.aClass700_11674.method8248(890561063));
			if (class536_sub18_sub5 == null)
				return null;
			if (class536_sub18_sub5.method10682(-1910215392) > Class249.method3450(1781403953))
				return null;
			class536_sub18_sub5.method6484();
			class536_sub18_sub5.method9521(-1532414489);
			if (0L != (4749301371101216403L * class536_sub18_sub5.requestHash & ~0x7fffffffffffffffL))
				return class536_sub18_sub5;
		}
	}
}
