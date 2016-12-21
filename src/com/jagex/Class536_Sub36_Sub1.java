/* Class536_Sub36_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub36_Sub1 extends Class536_Sub36 {
	Class666 aClass666_11756;

	public boolean method9817() {
		Class649_Sub1_Sub1_Sub1 class649_sub1_sub1_sub1 = aClass666_11756.method8002(-1954984083);
		if (class649_sub1_sub1_sub1 != null) {
			Class76.method1156(Class570.aClass570_7629, -358726121 * anInt10634, -1, aClass666_11756, class649_sub1_sub1_sub1, 1045238732);
			return true;
		}
		return false;
	}

	public boolean method9818(int i) {
		Class649_Sub1_Sub1_Sub1 class649_sub1_sub1_sub1 = aClass666_11756.method8002(-2014149668);
		if (class649_sub1_sub1_sub1 != null) {
			Class76.method1156(Class570.aClass570_7629, -358726121 * anInt10634, -1, aClass666_11756, class649_sub1_sub1_sub1, -745501841);
			return true;
		}
		return false;
	}

	public Class536_Sub36_Sub1(int i, int i_0_, Class666 class666) {
		super(i, i_0_);
		aClass666_11756 = class666;
	}

	public static String method10752(long l, int i, int i_1_) {
		Class164.method1972(l);
		int i_2_ = Class81.aCalendar859.get(5);
		int i_3_ = Class81.aCalendar859.get(2);
		int i_4_ = Class81.aCalendar859.get(1);
		if (i == 3)
			return Class272.method3723(l, i, 386187216);
		return new StringBuilder().append(Integer.toString(i_2_ / 10)).append(i_2_ % 10).append("-").append(Class81.aStringArrayArray858[i][i_3_]).append("-").append(i_4_).toString();
	}
}
