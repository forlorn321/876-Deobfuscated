/* Class632 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class632 implements Iterator {
	int anInt8246;
	Class630[] aClass630Array8247;

	public Object method7534() {
		return aClass630Array8247[(anInt8246 += 1821546007) * 482738599 - 1];
	}

	public boolean hasNext() {
		return 482738599 * anInt8246 < aClass630Array8247.length;
	}

	public Object next() {
		return aClass630Array8247[(anInt8246 += 1821546007) * 482738599 - 1];
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean method7535() {
		return 482738599 * anInt8246 < aClass630Array8247.length;
	}

	public boolean method7536() {
		return 482738599 * anInt8246 < aClass630Array8247.length;
	}

	Class632(Class630[] class630s) {
		aClass630Array8247 = class630s;
	}

	public void method7537() {
		throw new UnsupportedOperationException();
	}

	public Object method7538() {
		return aClass630Array8247[(anInt8246 += 1821546007) * 482738599 - 1];
	}

	static void method7539(long[] ls, Object[] objects, int i, int i_0_, int i_1_) {
		if (i < i_0_) {
			int i_2_ = (i_0_ + i) / 2;
			int i_3_ = i;
			long l = ls[i_2_];
			ls[i_2_] = ls[i_0_];
			ls[i_0_] = l;
			Object object = objects[i_2_];
			objects[i_2_] = objects[i_0_];
			objects[i_0_] = object;
			int i_4_ = l == 9223372036854775807L ? 0 : 1;
			for (int i_5_ = i; i_5_ < i_0_; i_5_++) {
				if (ls[i_5_] < (long) (i_5_ & i_4_) + l) {
					long l_6_ = ls[i_5_];
					ls[i_5_] = ls[i_3_];
					ls[i_3_] = l_6_;
					Object object_7_ = objects[i_5_];
					objects[i_5_] = objects[i_3_];
					objects[i_3_++] = object_7_;
				}
			}
			ls[i_0_] = ls[i_3_];
			ls[i_3_] = l;
			objects[i_0_] = objects[i_3_];
			objects[i_3_] = object;
			method7539(ls, objects, i, i_3_ - 1, 323092201);
			method7539(ls, objects, i_3_ + 1, i_0_, -756398906);
		}
	}

	static final void method7540(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class208.method2968(class251, class234, class668, (short) 255);
	}

	static final void method7541(Class668 class668, byte i) {
		int i_8_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_8_);
		Class234 class234 = Class463.aClass234Array5227[i_8_ >> 16];
		Class292.method3968(class251, class234, class668, -878876194);
	}

	static void method7542(int i, int i_9_, int i_10_) {
		Class324 class324 = (Class324) Class56.aClass34_Sub14_608.method70(i, (byte) -6);
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(1, (long) ((class324.aClass153_3555.anInt1715) * -1786401803));
		try {
			if (Class536_Sub18_Sub5.aBool11676)
				class536_sub18_sub5.anInt11675 = (Class590.aClass147_Sub1_7791.method99(class324.aClass153_3555, 2063594590) * 1577826219);
			class536_sub18_sub5.anInt11675 = class324.method4265((class536_sub18_sub5.anInt11675 * -1670804733), i_9_, (byte) -97) * 1577826219;
			class536_sub18_sub5.method10659(1584234100);
		} catch (Exception_Sub4 exception_sub4) {
			Class81.method1165(new StringBuilder().append("").append(i).toString(), exception_sub4, (byte) 9);
		}
	}
}
