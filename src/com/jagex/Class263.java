/* Class263 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class Class263 {
	LinkedList aLinkedList2850;
	boolean aBool2851 = false;
	static final int anInt2852 = 10;
	String aString2853;

	public boolean method3644(byte i) {
		return aBool2851;
	}

	public void method3645(boolean bool, int i) {
		aBool2851 = bool;
	}

	public int method3646(byte i) {
		return aLinkedList2850.size();
	}

	public final boolean method3647(String string, int i, int i_0_, int i_1_) {
		if (!string.isEmpty() && string.length() <= 10 && Class585.method7050(string.charAt(0), (byte) 1)) {
			Class272 class272 = method3648(string, (byte) -4);
			if (class272 != null)
				aLinkedList2850.remove(class272);
			aLinkedList2850.add(new Class272(string, i, i_0_));
			method3650((byte) -124);
			return true;
		}
		return false;
	}

	final Class272 method3648(String string, byte i) {
		Iterator iterator = aLinkedList2850.iterator();
		while (iterator.hasNext()) {
			Class272 class272 = (Class272) iterator.next();
			if (class272.aString2890.equals(string))
				return class272;
		}
		return null;
	}

	public final String method3649(String string, int i) {
		if (aLinkedList2850.isEmpty())
			return string;
		StringBuilder stringbuilder = new StringBuilder(string.length());
		int i_2_ = string.length();
		boolean bool = false;
		for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
			boolean bool_4_ = false;
			char c = string.charAt(i_3_);
			if (bool) {
				if ('>' == c)
					bool = false;
			} else if ('<' == c)
				bool = true;
			else if (aString2853.indexOf(c) != -1) {
				for (int i_5_ = 0; i_5_ < aLinkedList2850.size(); i_5_++) {
					Class272 class272 = (Class272) aLinkedList2850.get(i_5_);
					int i_6_ = class272.aString2890.length();
					if (i_3_ <= i_2_ - i_6_ && string.substring(i_3_, i_3_ + i_6_).equals(class272.aString2890)) {
						String string_7_;
						if (class272.anInt2888 * 428423995 > 0)
							string_7_ = (String.format("<sprite=%d,%d>", (new Object[] { Integer.valueOf(523024491 * class272.anInt2889), Integer.valueOf(428423995 * (class272.anInt2888)) })));
						else
							string_7_ = (String.format("<sprite=%d>", (new Object[] { Integer.valueOf(class272.anInt2889 * 523024491) })));
						stringbuilder.append(string_7_);
						bool_4_ = true;
						i_3_ += i_6_ - 1;
						break;
					}
				}
			}
			if (!bool_4_)
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	final void method3650(byte i) {
		aString2853 = "";
		for (int i_8_ = 0; i_8_ < aLinkedList2850.size(); i_8_++) {
			Class272 class272 = (Class272) aLinkedList2850.get(i_8_);
			char c = class272.aString2890.charAt(0);
			if (aString2853.indexOf(c) < 0) {
				StringBuilder stringbuilder = new StringBuilder();
				Class263 class263_9_ = this;
				class263_9_.aString2853 = stringbuilder.append(class263_9_.aString2853).append(c).toString();
			}
		}
	}

	public boolean method3651() {
		return aBool2851;
	}

	public final void method3652(String string, int i) {
		Iterator iterator = aLinkedList2850.iterator();
		while (iterator.hasNext()) {
			Class272 class272 = (Class272) iterator.next();
			if (class272.aString2890.equals(string)) {
				iterator.remove();
				break;
			}
		}
	}

	public void method3653(boolean bool) {
		aBool2851 = bool;
	}

	public final void method3654() {
		aLinkedList2850.clear();
		aString2853 = "";
	}

	public int method3655() {
		return aLinkedList2850.size();
	}

	public void method3656(boolean bool) {
		aBool2851 = bool;
	}

	final void method3657() {
		aString2853 = "";
		for (int i = 0; i < aLinkedList2850.size(); i++) {
			Class272 class272 = (Class272) aLinkedList2850.get(i);
			char c = class272.aString2890.charAt(0);
			if (aString2853.indexOf(c) < 0) {
				StringBuilder stringbuilder = new StringBuilder();
				Class263 class263_10_ = this;
				class263_10_.aString2853 = stringbuilder.append(class263_10_.aString2853).append(c).toString();
			}
		}
	}

	public Class263() {
		aLinkedList2850 = new LinkedList();
	}

	public int method3658() {
		return aLinkedList2850.size();
	}

	public final void method3659(int i) {
		aLinkedList2850.clear();
		aString2853 = "";
	}

	public void method3660(boolean bool) {
		aBool2851 = bool;
	}

	final void method3661() {
		aString2853 = "";
		for (int i = 0; i < aLinkedList2850.size(); i++) {
			Class272 class272 = (Class272) aLinkedList2850.get(i);
			char c = class272.aString2890.charAt(0);
			if (aString2853.indexOf(c) < 0) {
				StringBuilder stringbuilder = new StringBuilder();
				Class263 class263_11_ = this;
				class263_11_.aString2853 = stringbuilder.append(class263_11_.aString2853).append(c).toString();
			}
		}
	}

	final void method3662() {
		aString2853 = "";
		for (int i = 0; i < aLinkedList2850.size(); i++) {
			Class272 class272 = (Class272) aLinkedList2850.get(i);
			char c = class272.aString2890.charAt(0);
			if (aString2853.indexOf(c) < 0) {
				StringBuilder stringbuilder = new StringBuilder();
				Class263 class263_12_ = this;
				class263_12_.aString2853 = stringbuilder.append(class263_12_.aString2853).append(c).toString();
			}
		}
	}

	static void method3663(byte i) {
		/* empty */
	}

	static final void method3664(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class205_Sub14.aByte9920;
	}

	static final void method3665(Class668 class668, byte i) {
		Class412.aClass412_4389.method5009((byte) 27);
	}

	public static void method3666(short[] is, byte i) {
		for (int i_13_ = 0; i_13_ < is.length; i_13_++)
			is[i_13_] = (short) 1024;
	}

	static final void method3667(Class668 class668, int i) throws Exception_Sub3 {
		Class683.aClass301_Sub1_8651.method4064(1982623183);
	}

	static final void method3668(Class668 class668, byte i) {
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = (Class536_Sub36_Sub1.method10752(Class588.method7085((class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)]), (short) 17738), Class459.CLIENT_PARAMS.method78(), -1619918777));
	}
}
