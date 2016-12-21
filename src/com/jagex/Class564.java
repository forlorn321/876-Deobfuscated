/* Class564 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Class564 {
	int anInt7583;
	boolean aBool7584;
	int anInt7585;
	public List aList7586 = new LinkedList();

	Class564(boolean bool) {
		aBool7584 = false;
		anInt7585 = 0;
		anInt7583 = 0;
		aBool7584 = bool;
	}

	public void method6872(int i) {
		Iterator iterator = aList7586.iterator();
		while (iterator.hasNext()) {
			Class563 class563 = (Class563) iterator.next();
			iterator.remove();
			Class97.method1316(class563, 1541185560);
		}
	}

	void method6873(Class563 class563, int i) {
		Class649_Sub1 class649_sub1 = class563.aClass649_Sub1_7582;
		boolean bool = true;
		Class178[] class178s = class563.aClass649_Sub1_7582.aClass178Array10842;
		for (int i_0_ = 0; i_0_ < class178s.length; i_0_++) {
			if (class178s[i_0_].aBool1945) {
				bool = false;
				break;
			}
		}
		if (!bool) {
			class563.aClass564_7579 = this;
			if (aBool7584) {
				Iterator iterator = aList7586.iterator();
				while (iterator.hasNext()) {
					Class563 class563_1_ = (Class563) iterator.next();
					if (class563_1_.aClass649_Sub1_7582 == class649_sub1) {
						iterator.remove();
						Class97.method1316(class563_1_, 2050726821);
					}
				}
			}
			ListIterator listiterator = aList7586.listIterator();
			while (listiterator.hasNext()) {
				Class563 class563_2_ = (Class563) listiterator.next();
				if (1477898525 * class649_sub1.anInt10841 >= (1477898525 * class563_2_.aClass649_Sub1_7582.anInt10841)) {
					listiterator.previous();
					listiterator.add(class563);
					return;
				}
			}
			aList7586.add(class563);
		}
	}

	public static void method6874(Class251[] class251s, int i, int i_3_, int i_4_, boolean bool, int i_5_) {
		for (int i_6_ = 0; i_6_ < class251s.length; i_6_++) {
			Class251 class251 = class251s[i_6_];
			if (class251 != null && i == class251.anInt2577 * -1940204141) {
				Class26.method743(class251, i_3_, i_4_, bool, 1281081384);
				Class173_Sub1.method8636(class251, i_3_, i_4_, (short) 255);
				if (class251.anInt2581 * 1428895931 > (class251.anInt2585 * -1382035527 - class251.anInt2573 * -1606950689))
					class251.anInt2581 = (class251.anInt2585 * -2072036325 - 155334701 * class251.anInt2573);
				if (1428895931 * class251.anInt2581 < 0)
					class251.anInt2581 = 0;
				if (class251.anInt2584 * -2092413585 > (class251.anInt2586 * 452091921 - 223822141 * class251.anInt2574))
					class251.anInt2584 = (1547463295 * class251.anInt2586 - class251.anInt2574 * 1514249747);
				if (-2092413585 * class251.anInt2584 < 0)
					class251.anInt2584 = 0;
				if (0 == class251.anInt2728 * 1049444347)
					Class320.method4242(class251s, class251, bool, 1571544888);
			}
		}
	}
}
