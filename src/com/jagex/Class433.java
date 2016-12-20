/* Class433 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class433 {
	public static final int anInt4865 = 2;
	public static final int anInt4866 = 3;
	public static final int anInt4867 = 5;
	public static final int anInt4868 = 6;
	public static final int anInt4869 = 4;
	public static final int anInt4870 = 1;

	Class433() throws Throwable {
		throw new Error();
	}

	static final void method6963(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_0_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		boolean bool = 1 == (class665.anIntArray8525[1769813785 * class665.anInt8526 + 1]);
		if (Class529_Sub1.aClass14_10788 != null) {
			Class527 class527 = Class529_Sub1.aClass14_10788.method709((long) i_0_);
			if (class527 != null && !bool)
				class527.method8735(-1889161967);
			else if (class527 == null && bool) {
				class527 = new Class527();
				Class529_Sub1.aClass14_10788.method714(class527, (long) i_0_);
			}
		}
	}

	public static int[] method6964(int i, int i_1_) {
		int[] is = new int[3];
		Class565.method9496(Class66.method1470(i, 1620175916));
		is[0] = Class85.aCalendar816.get(5);
		is[1] = Class85.aCalendar816.get(2);
		is[2] = Class85.aCalendar816.get(1);
		return is;
	}

	static final void method6965(Class665 class665, int i) {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (2 == -405609043 * client.anInt11083 && i_2_ < -67152419 * client.anInt11261)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = client.aClass69Array11297[i_2_].aBool778 ? 1 : 0;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}

	public static Class270 method6966(int i, int i_3_) {
		if (i == Class270.aClass270_3124.anInt3122 * -116330391)
			return Class270.aClass270_3124;
		if (-116330391 * Class270.aClass270_3123.anInt3122 == i)
			return Class270.aClass270_3123;
		return null;
	}
}
