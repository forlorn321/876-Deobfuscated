/* Class527_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Calendar;

public class Class527_Sub29 extends Class527 {
	int anInt10557;
	int[] anIntArray10558;
	int[] anIntArray10559;
	Field[] aFieldArray10560;
	int anInt10561;
	int[] anIntArray10562;
	Method[] aMethodArray10563;
	byte[][][] aByteArrayArrayArray10564;

	Class527_Sub29() {
		/* empty */
	}

	static final void method16287(Class665 class665, int i) {
		class665.anInt8526 -= 102380841;
	}

	public static int method16288(int i) {
		return Class536.aClass615_7224.aBool8064 ? 2 : 1;
	}

	public static String method16289(long l, int i, boolean bool, short i_0_) {
		Calendar calendar;
		if (bool) {
			Class568.method9567(l);
			calendar = Class85.aCalendar818;
		} else {
			Class565.method9496(l);
			calendar = Class85.aCalendar816;
		}
		int i_1_ = calendar.get(5);
		int i_2_ = calendar.get(2);
		int i_3_ = calendar.get(1);
		int i_4_ = calendar.get(11);
		int i_5_ = calendar.get(12);
		if (i == 3)
			return Class525.method8728(l, i, bool, -252415276);
		return new StringBuilder().append(Integer.toString(i_1_ / 10)).append(i_1_ % 10).append("-").append(Class85.aStringArrayArray817[i][i_2_]).append("-").append(i_3_).append(" ").append(i_4_ / 10).append(i_4_ % 10).append(":").append(i_5_ / 10).append(i_5_ % 10).toString();
	}
}
