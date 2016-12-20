/* Class418 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.net.MalformedURLException;
import java.net.URL;

public class Class418 {
	public static final int anInt4525 = 40;
	public static final int anInt4526 = 36;
	public static final int anInt4527 = 6;
	public static final int anInt4528 = 41;
	public static final int anInt4529 = 42;
	public static final int anInt4530 = 49;
	public static final int anInt4531 = 17;
	public static final int anInt4532 = 45;
	public static final int anInt4533 = 12;
	public static final int anInt4534 = 3;
	public static final int anInt4535 = 38;
	public static final int anInt4536 = 27;
	public static final int anInt4537 = 7;
	public static final int anInt4538 = 25;
	public static final int anInt4539 = 50;
	public static final int anInt4540 = 18;
	public static final int anInt4541 = 5;
	public static final int anInt4542 = 46;
	public static final int anInt4543 = 15;
	public static final int anInt4544 = 28;
	public static final int anInt4545 = 4;
	public static final int anInt4546 = 34;
	public static final int anInt4547 = 47;
	public static final int anInt4548 = 8;
	public static final int anInt4549 = 20;
	public static final int anInt4550 = 1;
	public static final int anInt4551 = 26;
	public static final int anInt4552 = 23;
	public static final int anInt4553 = 22;
	public static final int anInt4554 = 16;
	public static final int anInt4555 = 44;
	public static final int anInt4556 = 39;
	public static final int anInt4557 = 11;
	public static final int anInt4558 = 31;
	public static final int anInt4559 = 14;
	public static final int anInt4560 = 32;
	public static final int anInt4561 = 24;
	public static final int anInt4562 = 2;
	static final int anInt4563 = 19;
	public static final int anInt4564 = 10;
	public static final int anInt4565 = 9;
	public static final int anInt4566 = 13;
	public static final int anInt4567 = 21;
	public static final int anInt4568 = 51;
	public static final int anInt4569 = 30;
	public static final int anInt4570 = 43;
	public static final int anInt4571 = 52;
	public static final int anInt4572 = 29;
	public static final int anInt4573 = 48;
	public static final int anInt4574 = 33;
	public static final int anInt4575 = 35;
	public static final int anInt4576 = 37;

	Class418() throws Throwable {
		throw new Error();
	}

	static boolean method6662(String string, int i) {
		if (string == null)
			return false;
		try {
			new URL(string);
		} catch (MalformedURLException malformedurlexception) {
			return false;
		}
		return true;
	}

	static void method6663(byte i) {
		if (Class35.aClass527_Sub8_Sub4_340 != null) {
			Class35.aClass527_Sub8_Sub4_340 = null;
			Class554_Sub1.method16829(Class576.anInt7640 * -860825733, 182965925 * Class35.anInt354, 949523843 * Class279.anInt3172, Class402.anInt4149 * -1441633063, (byte) 3);
		}
	}

	static final void method6664(Class665 class665, int i) {
		Class699.method14278((byte) -74);
	}

	static final void method6665(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class527_Sub8_Sub12 class527_sub8_sub12 = Class387.method6441((byte) -99);
		if (null != class527_sub8_sub12) {
			boolean bool = class527_sub8_sub12.method18314(i_0_ >> 28 & 0x3, i_0_ >> 14 & 0x3fff, i_0_ & 0x3fff, Class666.anIntArray8556, (short) -7175);
			if (bool) {
				class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = Class666.anIntArray8556[1];
				class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = Class666.anIntArray8556[2];
			} else {
				class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
				class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			}
		} else {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		}
	}
}
