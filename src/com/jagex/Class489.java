/* Class489 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class Class489 {
	static Class489 aClass489_5454;
	public static Class489 aClass489_5455;
	static Class489 aClass489_5456;
	static Class489 aClass489_5457;
	static Class489 aClass489_5458;
	static Class489 aClass489_5459;
	static Class489 aClass489_5460 = new Class489(0, false);
	static Class489 aClass489_5461;
	static Class489 aClass489_5462;
	int anInt5463;
	public boolean aBool5464;
	static int anInt5465;

	static {
		aClass489_5455 = new Class489(1, false);
		aClass489_5457 = new Class489(2, false);
		aClass489_5454 = new Class489(3, false);
		aClass489_5456 = new Class489(4, false);
		aClass489_5459 = new Class489(5, true);
		aClass489_5458 = new Class489(6, true);
		aClass489_5461 = new Class489(7, true);
		aClass489_5462 = new Class489(8, true);
	}

	Class489(int i, boolean bool) {
		anInt5463 = 367656953 * i;
		aBool5464 = bool;
	}

	public static String method5876(Object[] objects, int i, int i_0_, int i_1_) {
		if (0 == i_0_)
			return "";
		if (i_0_ == 1) {
			CharSequence charsequence = (CharSequence) objects[i];
			if (charsequence == null)
				return "null";
			return charsequence.toString();
		}
		int i_2_ = i_0_ + i;
		int i_3_ = 0;
		for (int i_4_ = i; i_4_ < i_2_; i_4_++) {
			CharSequence charsequence = (CharSequence) objects[i_4_];
			if (null == charsequence)
				i_3_ += 4;
			else
				i_3_ += charsequence.length();
		}
		StringBuilder stringbuilder = new StringBuilder(i_3_);
		for (int i_5_ = i; i_5_ < i_2_; i_5_++) {
			CharSequence charsequence = (CharSequence) objects[i_5_];
			if (charsequence == null)
				stringbuilder.append("null");
			else
				stringbuilder.append(charsequence);
		}
		return stringbuilder.toString();
	}

	static final void method5877(Class668 class668, byte i) {
		class668.anInt8542 -= -1411037171;
	}

	static void method5878(boolean bool, int i) {
		if (bool) {
			if (-1 != client.anInt11187 * -1959825479)
				Class444.method5395(-1959825479 * client.anInt11187, -687424059);
			for (Class536_Sub36 class536_sub36 = ((Class536_Sub36) client.aClass4_11008.method562(-1796654109)); class536_sub36 != null; class536_sub36 = ((Class536_Sub36) client.aClass4_11008.method567(-461051332))) {
				if (!class536_sub36.method6487((byte) -119)) {
					class536_sub36 = ((Class536_Sub36) client.aClass4_11008.method562(-1892676814));
					if (class536_sub36 == null)
						break;
				}
				Class398.method4903(class536_sub36, true, false, 1759806773);
			}
			client.anInt11187 = -2074470025;
			client.aClass4_11008 = new Class4(8);
			Class302.method4101(-2147191976);
			client.anInt11187 = -1848669231 * Class644.aClass628_8352.anInt8225;
			if (client.anInt11187 * -1959825479 != -1) {
				Class325_Sub1.method9206(false, 1418117971);
				Class552.method6692(-2098309945);
				Class668.method8010(-1959825479 * client.anInt11187, null, 1540863673);
			}
		}
		Class61.aBool653 = true;
	}

	public static int method5879(String string, boolean bool, int i) {
		string = string.toLowerCase();
		Class155.anIntArray1733 = null;
		Class50.anInt586 = 0;
		LinkedList linkedlist = new LinkedList();
		LinkedList linkedlist_6_ = new LinkedList();
		for (int i_7_ = 0; i_7_ < Class111.aClass34_Sub13_1391.anInt290 * 2103424577; i_7_++) {
			Class1 class1 = ((Class1) Class111.aClass34_Sub13_1391.method70(i_7_, (byte) -2));
			if ((!bool || class1.aBool77) && class1.anInt63 * 79208069 == -1 && class1.anInt17 * -1494720165 == -1 && -1 == class1.anInt83 * -377039411 && -32062435 * class1.anInt78 == 0 && class1.aString44.toLowerCase().indexOf(string) != -1) {
				if (linkedlist.size() >= 250)
					return -1;
				linkedlist.add(Integer.valueOf(i_7_));
				linkedlist_6_.add(class1.aString44);
			}
		}
		Class155.anIntArray1733 = new int[linkedlist.size()];
		int i_8_ = 0;
		Iterator iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			Class155.anIntArray1733[i_8_++] = integer.intValue();
		}
		String[] strings = ((String[]) linkedlist_6_.toArray(new String[Class155.anIntArray1733.length]));
		Class205_Sub12.method9071(strings, Class155.anIntArray1733, 1891101628);
		return linkedlist.size();
	}

	static final void method5880(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class247_Sub1.method9105(class251, class234, class668, 935760968);
	}

	static final void method5881(Class668 class668, byte i) {
		int i_9_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		InterfaceDefinitions class251 = Class264.method3678(i_9_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_9_ >> 16];
		Class173_Sub1.method8633(class251, class234, class668, 65280);
	}
}
