/* Class627 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class627 {
	public boolean aBool8168 = false;
	boolean aBool8169 = false;
	Class521_Sub2_Sub1_Sub1[] aClass521_Sub2_Sub1_Sub1Array8170;
	int anInt8171 = 0;
	long aLong8172;
	long aLong8173;
	List aList8174 = new LinkedList();
	int anInt8175 = 0;
	List aList8176 = new LinkedList();
	int anInt8177;
	boolean aBool8178;
	boolean aBool8179;
	Class166 aClass166_8180;
	static boolean[] aBoolArray8181 = new boolean[64];
	int anInt8182 = 0;
	static boolean[] aBoolArray8183 = new boolean[16];

	public void method7464() {
		aBool8169 = true;
	}

	public void method7465() {
		aBool8178 = true;
	}

	void method7466(int i, boolean bool) {
		Class626.aList8161.add(this);
		aLong8173 = (long) i;
		aLong8172 = (long) i;
		aBool8178 = true;
		aBool8179 = bool;
	}

	public void method7467() {
		aBool8178 = true;
	}

	void method7468() {
		aBool8168 = true;
		Iterator iterator = aList8176.iterator();
		while (iterator.hasNext()) {
			Class536_Sub37 class536_sub37 = (Class536_Sub37) iterator.next();
			if (class536_sub37.aClass393_10636.anInt4087 * -1267717877 == 1)
				class536_sub37.method6484(1166594488);
		}
		for (int i = 0; i < aClass521_Sub2_Sub1_Sub1Array8170.length; i++) {
			if (aClass521_Sub2_Sub1_Sub1Array8170[i] != null) {
				aClass521_Sub2_Sub1_Sub1Array8170[i].method10986();
				aClass521_Sub2_Sub1_Sub1Array8170[i] = null;
			}
		}
		anInt8171 = 0;
		aList8174 = new LinkedList();
		anInt8175 = 0;
		aList8176 = new LinkedList();
		anInt8182 = 0;
	}

	public void method7469() {
		aBool8169 = true;
	}

	void method7470() {
		aBool8169 = false;
	}

	boolean method7471(Class167 class167, long l) {
		if (aLong8173 != aLong8172)
			method7469();
		else
			method7470();
		if (l - aLong8173 > 750L) {
			method7468();
			return false;
		}
		int i = (int) (l - aLong8172);
		if (aBool8178) {
			Iterator iterator = aList8174.iterator();
			while (iterator.hasNext()) {
				Class615 class615 = (Class615) iterator.next();
				for (int i_0_ = 0; i_0_ < class615.aClass381_8042.anInt3969 * 1888879445; i_0_++)
					class615.method7325(class167, l, 1, !aBool8169, 91418313);
			}
			aBool8178 = false;
		}
		Iterator iterator = aList8174.iterator();
		while (iterator.hasNext()) {
			Class615 class615 = (Class615) iterator.next();
			class615.method7325(class167, l, i, !aBool8169, 1243337273);
		}
		aLong8172 = l;
		return true;
	}

	public void method7472() {
		aBool8169 = true;
	}

	public void method7473(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		anInt8177 = i;
	}

	public void method7474(Class167 class167, long l, Class172[] class172s, Class156[] class156s, boolean bool) {
		if (!aBool8168) {
			method7479(class167, class172s, bool);
			method7483(class156s, bool);
			aLong8173 = l;
		}
	}

	public Class166 method7475() {
		aClass166_8180.aClass703_1841.method8254(1679461828);
		for (int i = 0; i < aClass521_Sub2_Sub1_Sub1Array8170.length; i++) {
			if (aClass521_Sub2_Sub1_Sub1Array8170[i] != null && (aClass521_Sub2_Sub1_Sub1Array8170[i].aClass615_12068 != null))
				aClass166_8180.aClass703_1841.method8255(aClass521_Sub2_Sub1_Sub1Array8170[i], 2065977934);
		}
		return aClass166_8180;
	}

	public Class166 method7476() {
		return aClass166_8180;
	}

	void method7477(Class553 class553, Class167 class167) {
		aClass166_8180.aClass703_1841.method8254(1679461828);
		Iterator iterator = aList8174.iterator();
		while (iterator.hasNext()) {
			Class615 class615 = (Class615) iterator.next();
			class615.method7326(class553, class167, aLong8172);
		}
	}

	void method7478() {
		aBool8168 = true;
		Iterator iterator = aList8176.iterator();
		while (iterator.hasNext()) {
			Class536_Sub37 class536_sub37 = (Class536_Sub37) iterator.next();
			if (class536_sub37.aClass393_10636.anInt4087 * -1267717877 == 1)
				class536_sub37.method6484(1055442339);
		}
		for (int i = 0; i < aClass521_Sub2_Sub1_Sub1Array8170.length; i++) {
			if (aClass521_Sub2_Sub1_Sub1Array8170[i] != null) {
				aClass521_Sub2_Sub1_Sub1Array8170[i].method10986();
				aClass521_Sub2_Sub1_Sub1Array8170[i] = null;
			}
		}
		anInt8171 = 0;
		aList8174 = new LinkedList();
		anInt8175 = 0;
		aList8176 = new LinkedList();
		anInt8182 = 0;
	}

	Class627(int i, boolean bool) {
		aBool8178 = false;
		aBool8179 = false;
		aClass166_8180 = new Class166();
		aClass521_Sub2_Sub1_Sub1Array8170 = new Class521_Sub2_Sub1_Sub1[8192];
		method7466(i, bool);
	}

	void method7479(Class167 class167, Class172[] class172s, boolean bool) {
		for (int i = 0; i < 64; i++)
			aBoolArray8181[i] = false;
		Iterator iterator = aList8174.iterator();
		while_64_: while (iterator.hasNext()) {
			Class615 class615 = (Class615) iterator.next();
			if (class172s != null) {
				for (int i = 0; i < class172s.length && i != 64; i++) {
					if (class615.aClass172_8038 == class172s[i] || (class615.aClass172_8038 == class172s[i].aClass172_1910)) {
						aBoolArray8181[i] = true;
						class615.method7329(255333456);
						class615.aBool8040 = false;
						continue while_64_;
					}
				}
			}
			if (!bool) {
				if (class615.anInt8034 * 801612181 == 0) {
					iterator.remove();
					anInt8175--;
				} else
					class615.aBool8040 = true;
			}
		}
		if (class172s != null) {
			for (int i = 0; i < class172s.length && i != 64 && anInt8175 != 64; i++) {
				if (!aBoolArray8181[i]) {
					Class615 class615 = new Class615(class167, class172s[i], this, aLong8173);
					aList8174.add(class615);
					anInt8175++;
					aBoolArray8181[i] = true;
				}
			}
		}
	}

	public void method7480() {
		aBool8178 = true;
	}

	public void method7481() {
		aBool8169 = true;
	}

	void method7482() {
		aBool8169 = false;
	}

	void method7483(Class156[] class156s, boolean bool) {
		for (int i = 0; i < 16; i++)
			aBoolArray8183[i] = false;
		Iterator iterator = aList8176.iterator();
		while_65_: while (iterator.hasNext()) {
			Class536_Sub37 class536_sub37 = (Class536_Sub37) iterator.next();
			if (class156s != null) {
				for (int i = 0; i < class156s.length; i++) {
					if (class536_sub37.aClass156_10641 == class156s[i] || (class536_sub37.aClass156_10641 == class156s[i].aClass156_1735)) {
						aBoolArray8183[i] = true;
						class536_sub37.method9819(-2002331696);
						continue while_65_;
					}
				}
			}
			if (!bool) {
				class536_sub37.method6484(-659478812);
				anInt8182--;
				if (class536_sub37.method6487((byte) -103)) {
					class536_sub37.method6484(1063149517);
					Class626.anInt8166 -= -1754799671;
				}
			}
		}
		if (class156s != null) {
			for (int i = 0; i < class156s.length && i != 16 && anInt8182 != 16; i++) {
				if (!aBoolArray8183[i]) {
					Class536_Sub37 class536_sub37 = null;
					if (((class156s[i].method1882(Class532.anInterface46_7121, -1532000407).anInt4087) * -1267717877) == 1 && Class626.anInt8166 * -703068039 < 32) {
						class536_sub37 = new Class536_Sub37(class156s[i], this);
						Class626.aClass4_8165.method560(class536_sub37, (long) ((class156s[i].anInt1736) * -804329929));
						Class626.anInt8166 += -1754799671;
					}
					if (class536_sub37 == null)
						class536_sub37 = new Class536_Sub37(class156s[i], this);
					aList8176.add(class536_sub37);
					anInt8182++;
					aBoolArray8183[i] = true;
				}
			}
		}
	}

	public static Class627 method7484(int i, boolean bool) {
		if (Class626.anInt8162 * 1973009219 != Class626.anInt8154 * 156401091) {
			Class627 class627 = Class626.aClass627Array8157[Class626.anInt8154 * 156401091];
			Class626.anInt8154 = ((Class626.anInt8154 * 156401091 + 1 & Class169.anIntArray1878[Class626.anInt8167 * 500175661]) * 1773165291);
			class627.method7466(i, bool);
			return class627;
		}
		return new Class627(i, bool);
	}

	public void method7485(long l) {
		aLong8173 = l;
	}

	public void method7486(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		anInt8177 = i;
	}
}
