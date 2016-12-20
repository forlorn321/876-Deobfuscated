/* Class156 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.LinkedList;

public class Class156 {
	public static int anInt1720;
	static int anInt1721;

	public static String method2553(String string) {
		int i = string.length();
		int i_0_ = 0;
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
			char c = string.charAt(i_1_);
			if ('<' == c || c == '>')
				i_0_ += 3;
		}
		StringBuilder stringbuilder = new StringBuilder(i_0_ + i);
		for (int i_2_ = 0; i_2_ < i; i_2_++) {
			char c = string.charAt(i_2_);
			if ('<' == c)
				stringbuilder.append("<lt>");
			else if ('>' == c)
				stringbuilder.append("<gt>");
			else
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	Class156() throws Throwable {
		throw new Error();
	}

	public static String method2554(String string) {
		int i = string.length();
		int i_3_ = 0;
		for (int i_4_ = 0; i_4_ < i; i_4_++) {
			char c = string.charAt(i_4_);
			if ('<' == c || c == '>')
				i_3_ += 3;
		}
		StringBuilder stringbuilder = new StringBuilder(i_3_ + i);
		for (int i_5_ = 0; i_5_ < i; i_5_++) {
			char c = string.charAt(i_5_);
			if ('<' == c)
				stringbuilder.append("<lt>");
			else if ('>' == c)
				stringbuilder.append("<gt>");
			else
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	public static String method2555(String string) {
		int i = string.length();
		int i_6_ = 0;
		for (int i_7_ = 0; i_7_ < i; i_7_++) {
			char c = string.charAt(i_7_);
			if ('<' == c || c == '>')
				i_6_ += 3;
		}
		StringBuilder stringbuilder = new StringBuilder(i_6_ + i);
		for (int i_8_ = 0; i_8_ < i; i_8_++) {
			char c = string.charAt(i_8_);
			if ('<' == c)
				stringbuilder.append("<lt>");
			else if ('>' == c)
				stringbuilder.append("<gt>");
			else
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	public static void method2556(Class180 class180, long l, int i, int i_9_, byte i_10_) {
		do {
			if (class180.method3469() && class180.method3119() > -1) {
				int i_11_ = class180.method3119();
				Class571 class571 = null;
				if (!Class585.aLinkedList7707.isEmpty())
					class571 = (Class571) Class585.aLinkedList7707.getFirst();
				if (class571 == null || i_11_ != -678765547 * class571.anInt7623) {
					class180.method3120();
					Class585.aLinkedList7707.clear();
				} else {
					Class585.aLinkedList7707.removeFirst();
					class180.method3242();
					boolean bool = false;
					int i_12_;
					if (class571.aLinkedList7624.isEmpty() && class180.method3084()) {
						long l_13_ = class180.method3117(-127594503 * (Class700_Sub20.anInt10872), (Class174_Sub1.anInt9112 * -909192181));
						i_12_ = (Class585.aTwitchTV7698.SubmitFrame(l_13_, class180.method3118(), Class585.aBool7704, i, i_9_));
						class180.method3123(l_13_);
					} else {
						class180.method3266((Class700_Sub20.anInt10872 * -127594503), (Class174_Sub1.anInt9112 * -909192181), Class172.anIntArray1883, Class398.anIntArray4124);
						Class289.method5221(Class172.anIntArray1883, class571.aLinkedList7624, class571.anInt7620 * -1399577493, 1772060341 * class571.anInt7621, class571.aFloat7622, -169567016);
						i_12_ = (Class585.aTwitchTV7698.SubmitFrameRaw(Class172.anIntArray1883, Class585.aBool7704, i, i_9_));
					}
					class180.method3167();
					if (i_12_ == 2072)
						Class585.aLong7700 = 8999503276147174491L * l;
					else if (23 == i_12_)
						Class585.aLong7701 = -5423139962974464727L * l;
					else if (i_12_ == -995 || i_12_ != 0)
						break;
				}
			}
		} while (false);
		if (Class585.aBool7696) {
			if (Class172.anIntArray1883 == null) {
				Class172.anIntArray1883 = new int[(Class585.aBool7704 ? i * i_9_ : (-127594503 * Class700_Sub20.anInt10872 * (-909192181 * Class174_Sub1.anInt9112)))];
				Class398.anIntArray4124 = new int[(Class585.aBool7704 ? i * i_9_ : (-127594503 * Class700_Sub20.anInt10872 * (Class174_Sub1.anInt9112 * -909192181)))];
			}
			if (!class180.method3469()) {
				class180.method3242();
				class180.method3266(Class700_Sub20.anInt10872 * -127594503, -909192181 * Class174_Sub1.anInt9112, Class172.anIntArray1883, Class398.anIntArray4124);
				Class289.method5221(Class172.anIntArray1883, Class585.aLinkedList7706, class180.anInt2083 * -1964562579, 960890533 * class180.anInt2068, class180.aFloat2090, 576580001);
				int i_14_ = Class585.aTwitchTV7698.SubmitFrameRaw((Class172.anIntArray1883), Class585.aBool7704, i, i_9_);
				class180.method3167();
				Class585.aLinkedList7706.clear();
				do {
					if (i_14_ == 2072)
						Class585.aLong7700 = l * 8999503276147174491L;
					else if (23 == i_14_)
						Class585.aLong7701 = -5423139962974464727L * l;
					else if (-995 == i_14_ || 0 != i_14_)
						break;
				} while (false);
			} else {
				class180.method3121(client.anInt11019, -127594503 * Class700_Sub20.anInt10872, Class174_Sub1.anInt9112 * -909192181);
				Class585.aLinkedList7707.add(new Class571(client.anInt11019, Class585.aLinkedList7706, class180.anInt2083 * -1964562579, 960890533 * class180.anInt2068, class180.aFloat2090));
				Class585.aLinkedList7706 = new LinkedList();
			}
			Class585.aBool7696 = false;
		}
	}

	static final void method2557(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	static final void method2558(Class665 class665, int i) {
		class665.anInt8528 -= 866019034;
		String string = ((String) class665.anObjectArray8541[class665.anInt8528 * 318492261]);
		String string_15_ = ((String) class665.anObjectArray8541[1 + class665.anInt8528 * 318492261]);
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = new StringBuilder().append(string).append(string_15_).toString();
	}
}
