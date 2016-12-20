/* Class232 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class232 implements Interface27 {
	Class214 this$0;
	static Class195[] aClass195Array2359;
	Class425 aClass425_2360;
	public static int anInt2361;
	static Class563 getClientSocketStream;

	public void method151(Class219 class219) {
		if (aClass425_2360 != null)
			class219.method3994(1636000752).method111(((Class160) (this$0.anInterface28_2263.method153(-1348998462).method81(aClass425_2360.anInt4803 * 494563151, 1459583017))), aClass425_2360.anObject4804, 1858018415);
	}

	Class232(Class214 class214, RSByteBuffer class527_sub38) {
		this$0 = class214;
		if (class527_sub38.readUnsignedShort() != 65535) {
			class527_sub38.anInt10689 -= -1345465534;
			aClass425_2360 = class214.anInterface28_2263.method153(-1348998462).method14483(class527_sub38, 1387971325);
		} else
			aClass425_2360 = null;
	}

	public void method150(Class219 class219, int i) {
		if (aClass425_2360 != null)
			class219.method3994(1636000752).method111(((Class160) (this$0.anInterface28_2263.method153(-1348998462).method81(aClass425_2360.anInt4803 * 494563151, -1913100402))), aClass425_2360.anObject4804, 1004453748);
	}

	public static String method4330(int i, int i_0_) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
	}

	public static void method4331(int i) {
		Class628.aClass14_8188 = new Class14(8);
		Class628.anInt8191 = 0;
		Iterator iterator = Class628.aList8199.iterator();
		while (iterator.hasNext()) {
			Class613 class613 = (Class613) iterator.next();
			class613.method10134();
		}
	}
}
