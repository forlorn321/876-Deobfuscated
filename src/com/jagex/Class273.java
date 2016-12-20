/* Class273 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class Class273 {
	boolean aBool3137 = false;
	LinkedList aLinkedList3138 = new LinkedList();
	String aString3139;
	static final int anInt3140 = 10;
	public static long aLong3141;
	static int anInt3142;

	final Class286 method5085(String string, int i) {
		Iterator iterator = aLinkedList3138.iterator();
		while (iterator.hasNext()) {
			Class286 class286 = (Class286) iterator.next();
			if (class286.aString3208.equals(string))
				return class286;
		}
		return null;
	}

	public boolean method5086(byte i) {
		return aBool3137;
	}

	public int method5087() {
		return aLinkedList3138.size();
	}

	public int method5088(int i) {
		return aLinkedList3138.size();
	}

	public void method5089(boolean bool) {
		aBool3137 = bool;
	}

	final Class286 method5090(String string) {
		Iterator iterator = aLinkedList3138.iterator();
		while (iterator.hasNext()) {
			Class286 class286 = (Class286) iterator.next();
			if (class286.aString3208.equals(string))
				return class286;
		}
		return null;
	}

	public void method5091(boolean bool) {
		aBool3137 = bool;
	}

	public final void method5092(int i) {
		aLinkedList3138.clear();
		aString3139 = "";
	}

	public final boolean method5093(String string, int i, int i_0_) {
		if (!string.isEmpty() && string.length() <= 10 && Class157.method2559(string.charAt(0), (byte) 1)) {
			Class286 class286 = method5085(string, 981100777);
			if (class286 != null)
				aLinkedList3138.remove(class286);
			aLinkedList3138.add(new Class286(string, i, i_0_));
			method5094(1653435863);
			return true;
		}
		return false;
	}

	final void method5094(int i) {
		aString3139 = "";
		for (int i_1_ = 0; i_1_ < aLinkedList3138.size(); i_1_++) {
			Class286 class286 = (Class286) aLinkedList3138.get(i_1_);
			char c = class286.aString3208.charAt(0);
			if (aString3139.indexOf(c) < 0) {
				StringBuilder stringbuilder = new StringBuilder();
				Class273 class273_2_ = this;
				class273_2_.aString3139 = stringbuilder.append(class273_2_.aString3139).append(c).toString();
			}
		}
	}

	public static final boolean method5095(char c) {
		return (c >= '!' && c < '0' || c >= ':' && c <= '@' && '<' != c || c >= '[' && c <= '_' || c >= '{');
	}

	public void method5096(boolean bool) {
		aBool3137 = bool;
	}

	public void method5097(boolean bool) {
		aBool3137 = bool;
	}

	public void method5098(boolean bool, int i) {
		aBool3137 = bool;
	}

	public static final boolean method5099(char c) {
		return (c >= '!' && c < '0' || c >= ':' && c <= '@' && '<' != c || c >= '[' && c <= '_' || c >= '{');
	}

	public int method5100() {
		return aLinkedList3138.size();
	}

	public int method5101() {
		return aLinkedList3138.size();
	}

	public int method5102() {
		return aLinkedList3138.size();
	}

	public final boolean method5103(String string, int i, int i_3_, int i_4_) {
		if (!string.isEmpty() && string.length() <= 10 && Class157.method2559(string.charAt(0), (byte) 30)) {
			Class286 class286 = method5085(string, 981100777);
			if (class286 != null)
				aLinkedList3138.remove(class286);
			aLinkedList3138.add(new Class286(string, i, i_3_));
			method5094(1653435863);
			return true;
		}
		return false;
	}

	public static final boolean method5104(char c) {
		return (c >= '!' && c < '0' || c >= ':' && c <= '@' && '<' != c || c >= '[' && c <= '_' || c >= '{');
	}

	public static final boolean method5105(char c) {
		return (c >= '!' && c < '0' || c >= ':' && c <= '@' && '<' != c || c >= '[' && c <= '_' || c >= '{');
	}

	public void method5106(boolean bool) {
		aBool3137 = bool;
	}

	public final boolean method5107(String string, int i, int i_5_) {
		if (!string.isEmpty() && string.length() <= 10 && Class157.method2559(string.charAt(0), (byte) 5)) {
			Class286 class286 = method5085(string, 981100777);
			if (class286 != null)
				aLinkedList3138.remove(class286);
			aLinkedList3138.add(new Class286(string, i, i_5_));
			method5094(1653435863);
			return true;
		}
		return false;
	}

	public final boolean method5108(String string, int i, int i_6_) {
		if (!string.isEmpty() && string.length() <= 10 && Class157.method2559(string.charAt(0), (byte) 95)) {
			Class286 class286 = method5085(string, 981100777);
			if (class286 != null)
				aLinkedList3138.remove(class286);
			aLinkedList3138.add(new Class286(string, i, i_6_));
			method5094(1653435863);
			return true;
		}
		return false;
	}

	public final String method5109(String string, int i) {
		if (aLinkedList3138.isEmpty())
			return string;
		StringBuilder stringbuilder = new StringBuilder(string.length());
		int i_7_ = string.length();
		boolean bool = false;
		for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
			boolean bool_9_ = false;
			char c = string.charAt(i_8_);
			if (bool) {
				if (c == '>')
					bool = false;
			} else if ('<' == c)
				bool = true;
			else if (aString3139.indexOf(c) != -1) {
				for (int i_10_ = 0; i_10_ < aLinkedList3138.size(); i_10_++) {
					Class286 class286 = (Class286) aLinkedList3138.get(i_10_);
					int i_11_ = class286.aString3208.length();
					if (i_8_ <= i_7_ - i_11_ && string.substring(i_8_, i_11_ + i_8_).equals(class286.aString3208)) {
						String string_12_;
						if (class286.anInt3210 * -424917803 > 0)
							string_12_ = (String.format("<sprite=%d,%d>", (new Object[] { Integer.valueOf(class286.anInt3209 * -123570997), Integer.valueOf(-424917803 * (class286.anInt3210)) })));
						else
							string_12_ = String.format("<sprite=%d>", (new Object[] { Integer.valueOf(-123570997 * class286.anInt3209) }));
						stringbuilder.append(string_12_);
						bool_9_ = true;
						i_8_ += i_11_ - 1;
						break;
					}
				}
			}
			if (!bool_9_)
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	final void method5110() {
		aString3139 = "";
		for (int i = 0; i < aLinkedList3138.size(); i++) {
			Class286 class286 = (Class286) aLinkedList3138.get(i);
			char c = class286.aString3208.charAt(0);
			if (aString3139.indexOf(c) < 0) {
				StringBuilder stringbuilder = new StringBuilder();
				Class273 class273_13_ = this;
				class273_13_.aString3139 = stringbuilder.append(class273_13_.aString3139).append(c).toString();
			}
		}
	}

	final Class286 method5111(String string) {
		Iterator iterator = aLinkedList3138.iterator();
		while (iterator.hasNext()) {
			Class286 class286 = (Class286) iterator.next();
			if (class286.aString3208.equals(string))
				return class286;
		}
		return null;
	}

	public final void method5112() {
		aLinkedList3138.clear();
		aString3139 = "";
	}

	public final void method5113() {
		aLinkedList3138.clear();
		aString3139 = "";
	}

	public final void method5114() {
		aLinkedList3138.clear();
		aString3139 = "";
	}

	public final void method5115() {
		aLinkedList3138.clear();
		aString3139 = "";
	}

	public final void method5116(String string, int i) {
		Iterator iterator = aLinkedList3138.iterator();
		while (iterator.hasNext()) {
			Class286 class286 = (Class286) iterator.next();
			if (class286.aString3208.equals(string)) {
				iterator.remove();
				break;
			}
		}
	}

	final void method5117() {
		aString3139 = "";
		for (int i = 0; i < aLinkedList3138.size(); i++) {
			Class286 class286 = (Class286) aLinkedList3138.get(i);
			char c = class286.aString3208.charAt(0);
			if (aString3139.indexOf(c) < 0) {
				StringBuilder stringbuilder = new StringBuilder();
				Class273 class273_14_ = this;
				class273_14_.aString3139 = stringbuilder.append(class273_14_.aString3139).append(c).toString();
			}
		}
	}

	final void method5118() {
		aString3139 = "";
		for (int i = 0; i < aLinkedList3138.size(); i++) {
			Class286 class286 = (Class286) aLinkedList3138.get(i);
			char c = class286.aString3208.charAt(0);
			if (aString3139.indexOf(c) < 0) {
				StringBuilder stringbuilder = new StringBuilder();
				Class273 class273_15_ = this;
				class273_15_.aString3139 = stringbuilder.append(class273_15_.aString3139).append(c).toString();
			}
		}
	}

	final void method5119() {
		aString3139 = "";
		for (int i = 0; i < aLinkedList3138.size(); i++) {
			Class286 class286 = (Class286) aLinkedList3138.get(i);
			char c = class286.aString3208.charAt(0);
			if (aString3139.indexOf(c) < 0) {
				StringBuilder stringbuilder = new StringBuilder();
				Class273 class273_16_ = this;
				class273_16_.aString3139 = stringbuilder.append(class273_16_.aString3139).append(c).toString();
			}
		}
	}

	static final void method5120(Class665 class665, short i) {
		int i_17_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_17_, -717438739);
		Class240 class240 = Class183.aClass240Array2100[i_17_ >> 16];
		Class249.method4659(class243, class240, false, 2, class665, (byte) 72);
	}

	static final void method5121(Class243 class243, Class240 class240, Class665 class665, int i) {
		class243.anInt2521 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) * -1635447227;
	}

	static final void method5122(Class665 class665, int i) {
		class665.anInt8526 -= 307142523;
		int i_18_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_19_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		int i_20_ = class665.anIntArray8525[2 + 1769813785 * class665.anInt8526];
		Class269 class269 = Class188.method3664(i_18_, (byte) -21);
		float f = (float) i_19_;
		if (class269 == Class269.aClass269_3114 || Class269.aClass269_3120 == class269 || Class269.aClass269_3119 == class269)
			f = Class428.method6863(i_19_);
		Class527_Sub8_Sub15_Sub1 class527_sub8_sub15_sub1 = new Class527_Sub8_Sub15_Sub1(Class208_Sub10.aClass296_Sub1_9923.method15684(430289300), class269, f, (float) i_20_ / 1000.0F);
		Class208_Sub10.aClass296_Sub1_9923.method5445(class527_sub8_sub15_sub1, -276573002);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class527_sub8_sub15_sub1.anInt11779 * 575434551;
	}

	static final void method5123(Class665 class665, int i) {
		Class245.aClass226_2698.method4228(-1202231575);
	}

	static void method5124(Class665 class665, int i) {
		class665.anInt8528 -= 866019034;
		String string = ((String) class665.anObjectArray8541[class665.anInt8528 * 318492261]);
		String string_21_ = ((String) class665.anObjectArray8541[class665.anInt8528 * 318492261 + 1]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class299.method5523(string, string_21_, (byte) 0);
	}
}
