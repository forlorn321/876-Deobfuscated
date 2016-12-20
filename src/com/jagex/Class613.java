/* Class613 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class613 {
	boolean aBool8017;
	boolean aBool8018;
	Class522_Sub6_Sub1_Sub1[] aClass522_Sub6_Sub1_Sub1Array8019;
	int anInt8020;
	Class182 aClass182_8021;
	long aLong8022;
	List aList8023;
	int anInt8024;
	long aLong8025;
	public boolean aBool8026 = false;
	static boolean[] aBoolArray8027 = new boolean[64];
	int anInt8028;
	int anInt8029;
	boolean aBool8030;
	List aList8031;
	static boolean[] aBoolArray8032 = new boolean[16];

	void method10125(Class555 class555, Class180 class180) {
		aClass182_8021.aClass710_2094.method14403(-800493244);
		Iterator iterator = aList8023.iterator();
		while (iterator.hasNext()) {
			Class625 class625 = (Class625) iterator.next();
			class625.method10344(class555, class180, aLong8025);
		}
	}

	Class613(int i, boolean bool) {
		aBool8018 = false;
		anInt8020 = 0;
		aList8023 = new LinkedList();
		anInt8024 = 0;
		aList8031 = new LinkedList();
		anInt8028 = 0;
		aBool8017 = false;
		aBool8030 = false;
		aClass182_8021 = new Class182();
		aClass522_Sub6_Sub1_Sub1Array8019 = new Class522_Sub6_Sub1_Sub1[8192];
		method10126(i, bool);
	}

	void method10126(int i, boolean bool) {
		Class628.aList8199.add(this);
		aLong8022 = (long) i;
		aLong8025 = (long) i;
		aBool8017 = true;
		aBool8030 = bool;
	}

	public void method10127() {
		aBool8017 = true;
	}

	void method10128() {
		aBool8026 = true;
		Iterator iterator = aList8031.iterator();
		while (iterator.hasNext()) {
			Class527_Sub42 class527_sub42 = (Class527_Sub42) iterator.next();
			if (class527_sub42.aClass388_10756.anInt3977 * -2028046375 == 1)
				class527_sub42.method8735(-1889161967);
		}
		for (int i = 0; i < aClass522_Sub6_Sub1_Sub1Array8019.length; i++) {
			if (aClass522_Sub6_Sub1_Sub1Array8019[i] != null) {
				aClass522_Sub6_Sub1_Sub1Array8019[i].method18772();
				aClass522_Sub6_Sub1_Sub1Array8019[i] = null;
			}
		}
		anInt8020 = 0;
		aList8023 = new LinkedList();
		anInt8024 = 0;
		aList8031 = new LinkedList();
		anInt8028 = 0;
	}

	public void method10129() {
		aBool8018 = true;
	}

	public static Class613 method10130(int i, boolean bool) {
		if (Class628.anInt8202 * 976297105 != Class628.anInt8193 * -1733921159) {
			Class613 class613 = (Class628.aClass613Array8192[Class628.anInt8193 * -1733921159]);
			Class628.anInt8193 = ((Class628.anInt8193 * -1733921159 + 1 & Class166.anIntArray1835[Class628.anInt8201 * 367556557]) * -1508764727);
			class613.method10126(i, bool);
			return class613;
		}
		return new Class613(i, bool);
	}

	boolean method10131(Class180 class180, long l) {
		if (aLong8022 != aLong8025)
			method10129();
		else
			method10160();
		if (l - aLong8022 > 750L) {
			method10134();
			return false;
		}
		int i = (int) (l - aLong8025);
		if (aBool8017) {
			Iterator iterator = aList8023.iterator();
			while (iterator.hasNext()) {
				Class625 class625 = (Class625) iterator.next();
				for (int i_0_ = 0; i_0_ < class625.aClass394_8161.anInt4061 * 623314517; i_0_++)
					class625.method10340(class180, l, 1, !aBool8018, (byte) 117);
			}
			aBool8017 = false;
		}
		Iterator iterator = aList8023.iterator();
		while (iterator.hasNext()) {
			Class625 class625 = (Class625) iterator.next();
			class625.method10340(class180, l, i, !aBool8018, (byte) -36);
		}
		aLong8025 = l;
		return true;
	}

	public void method10132(long l) {
		aLong8022 = l;
	}

	public void method10133(Class180 class180, long l, Class167[] class167s, Class159[] class159s, boolean bool) {
		if (!aBool8026) {
			method10166(class180, class167s, bool);
			method10143(class159s, bool);
			aLong8022 = l;
		}
	}

	void method10134() {
		aBool8026 = true;
		Iterator iterator = aList8031.iterator();
		while (iterator.hasNext()) {
			Class527_Sub42 class527_sub42 = (Class527_Sub42) iterator.next();
			if (class527_sub42.aClass388_10756.anInt3977 * -2028046375 == 1)
				class527_sub42.method8735(-1889161967);
		}
		for (int i = 0; i < aClass522_Sub6_Sub1_Sub1Array8019.length; i++) {
			if (aClass522_Sub6_Sub1_Sub1Array8019[i] != null) {
				aClass522_Sub6_Sub1_Sub1Array8019[i].method18772();
				aClass522_Sub6_Sub1_Sub1Array8019[i] = null;
			}
		}
		anInt8020 = 0;
		aList8023 = new LinkedList();
		anInt8024 = 0;
		aList8031 = new LinkedList();
		anInt8028 = 0;
	}

	void method10135() {
		aBool8026 = true;
		Iterator iterator = aList8031.iterator();
		while (iterator.hasNext()) {
			Class527_Sub42 class527_sub42 = (Class527_Sub42) iterator.next();
			if (class527_sub42.aClass388_10756.anInt3977 * -2028046375 == 1)
				class527_sub42.method8735(-1889161967);
		}
		for (int i = 0; i < aClass522_Sub6_Sub1_Sub1Array8019.length; i++) {
			if (aClass522_Sub6_Sub1_Sub1Array8019[i] != null) {
				aClass522_Sub6_Sub1_Sub1Array8019[i].method18772();
				aClass522_Sub6_Sub1_Sub1Array8019[i] = null;
			}
		}
		anInt8020 = 0;
		aList8023 = new LinkedList();
		anInt8024 = 0;
		aList8031 = new LinkedList();
		anInt8028 = 0;
	}

	void method10136(int i, boolean bool) {
		Class628.aList8199.add(this);
		aLong8022 = (long) i;
		aLong8025 = (long) i;
		aBool8017 = true;
		aBool8030 = bool;
	}

	public void method10137(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		anInt8029 = i;
	}

	void method10138(Class555 class555, Class180 class180) {
		aClass182_8021.aClass710_2094.method14403(-1681522989);
		Iterator iterator = aList8023.iterator();
		while (iterator.hasNext()) {
			Class625 class625 = (Class625) iterator.next();
			class625.method10344(class555, class180, aLong8025);
		}
	}

	public Class182 method10139() {
		return aClass182_8021;
	}

	public void method10140(long l) {
		aLong8022 = l;
	}

	void method10141(int i, boolean bool) {
		Class628.aList8199.add(this);
		aLong8022 = (long) i;
		aLong8025 = (long) i;
		aBool8017 = true;
		aBool8030 = bool;
	}

	void method10142(int i, boolean bool) {
		Class628.aList8199.add(this);
		aLong8022 = (long) i;
		aLong8025 = (long) i;
		aBool8017 = true;
		aBool8030 = bool;
	}

	void method10143(Class159[] class159s, boolean bool) {
		for (int i = 0; i < 16; i++)
			aBoolArray8032[i] = false;
		Iterator iterator = aList8031.iterator();
		while_109_: while (iterator.hasNext()) {
			Class527_Sub42 class527_sub42 = (Class527_Sub42) iterator.next();
			if (class159s != null) {
				for (int i = 0; i < class159s.length; i++) {
					if (class527_sub42.aClass159_10758 == class159s[i] || (class527_sub42.aClass159_10758 == class159s[i].aClass159_1739)) {
						aBoolArray8032[i] = true;
						class527_sub42.method16683((short) 1011);
						continue while_109_;
					}
				}
			}
			if (!bool) {
				class527_sub42.method8735(-1889161967);
				anInt8028--;
				if (class527_sub42.method8736(-2126519674)) {
					class527_sub42.method8735(-1889161967);
					Class628.anInt8191 -= 1078282209;
				}
			}
		}
		if (class159s != null) {
			for (int i = 0; i < class159s.length && i != 16 && anInt8028 != 16; i++) {
				if (!aBoolArray8032[i]) {
					Class527_Sub42 class527_sub42 = null;
					if (((class159s[i].method2568(Class628.anInterface49_8197, -2046846644).anInt3977) * -2028046375) == 1 && Class628.anInt8191 * 492387361 < 32) {
						class527_sub42 = new Class527_Sub42(class159s[i], this);
						Class628.aClass14_8188.method714(class527_sub42, (long) (class159s[i].anInt1741 * -829073041));
						Class628.anInt8191 += 1078282209;
					}
					if (class527_sub42 == null)
						class527_sub42 = new Class527_Sub42(class159s[i], this);
					aList8031.add(class527_sub42);
					anInt8028++;
					aBoolArray8032[i] = true;
				}
			}
		}
	}

	boolean method10144(Class180 class180, long l) {
		if (aLong8022 != aLong8025)
			method10129();
		else
			method10160();
		if (l - aLong8022 > 750L) {
			method10134();
			return false;
		}
		int i = (int) (l - aLong8025);
		if (aBool8017) {
			Iterator iterator = aList8023.iterator();
			while (iterator.hasNext()) {
				Class625 class625 = (Class625) iterator.next();
				for (int i_5_ = 0; i_5_ < class625.aClass394_8161.anInt4061 * 623314517; i_5_++)
					class625.method10340(class180, l, 1, !aBool8018, (byte) 96);
			}
			aBool8017 = false;
		}
		Iterator iterator = aList8023.iterator();
		while (iterator.hasNext()) {
			Class625 class625 = (Class625) iterator.next();
			class625.method10340(class180, l, i, !aBool8018, (byte) 41);
		}
		aLong8025 = l;
		return true;
	}

	public void method10145() {
		aBool8017 = true;
	}

	public Class182 method10146() {
		aClass182_8021.aClass710_2094.method14403(-1548257726);
		for (int i = 0; i < aClass522_Sub6_Sub1_Sub1Array8019.length; i++) {
			if (aClass522_Sub6_Sub1_Sub1Array8019[i] != null && (aClass522_Sub6_Sub1_Sub1Array8019[i].aClass625_12104 != null))
				aClass182_8021.aClass710_2094.method14402(aClass522_Sub6_Sub1_Sub1Array8019[i], 2096110625);
		}
		return aClass182_8021;
	}

	void method10147(Class180 class180, Class167[] class167s, boolean bool) {
		for (int i = 0; i < 64; i++)
			aBoolArray8027[i] = false;
		Iterator iterator = aList8023.iterator();
		while_110_: while (iterator.hasNext()) {
			Class625 class625 = (Class625) iterator.next();
			if (class167s != null) {
				for (int i = 0; i < class167s.length && i != 64; i++) {
					if (class625.aClass167_8174 == class167s[i] || (class625.aClass167_8174 == class167s[i].aClass167_1849)) {
						aBoolArray8027[i] = true;
						class625.method10339(-230738209);
						class625.aBool8167 = false;
						continue while_110_;
					}
				}
			}
			if (!bool) {
				if (class625.anInt8175 * -1689646929 == 0) {
					iterator.remove();
					anInt8024--;
				} else
					class625.aBool8167 = true;
			}
		}
		if (class167s != null) {
			for (int i = 0; i < class167s.length && i != 64 && anInt8024 != 64; i++) {
				if (!aBoolArray8027[i]) {
					Class625 class625 = new Class625(class180, class167s[i], this, aLong8022);
					aList8023.add(class625);
					anInt8024++;
					aBoolArray8027[i] = true;
				}
			}
		}
	}

	void method10148() {
		aBool8026 = true;
		Iterator iterator = aList8031.iterator();
		while (iterator.hasNext()) {
			Class527_Sub42 class527_sub42 = (Class527_Sub42) iterator.next();
			if (class527_sub42.aClass388_10756.anInt3977 * -2028046375 == 1)
				class527_sub42.method8735(-1889161967);
		}
		for (int i = 0; i < aClass522_Sub6_Sub1_Sub1Array8019.length; i++) {
			if (aClass522_Sub6_Sub1_Sub1Array8019[i] != null) {
				aClass522_Sub6_Sub1_Sub1Array8019[i].method18772();
				aClass522_Sub6_Sub1_Sub1Array8019[i] = null;
			}
		}
		anInt8020 = 0;
		aList8023 = new LinkedList();
		anInt8024 = 0;
		aList8031 = new LinkedList();
		anInt8028 = 0;
	}

	public static Class613 method10149(int i, boolean bool) {
		if (Class628.anInt8202 * 976297105 != Class628.anInt8193 * -1733921159) {
			Class613 class613 = (Class628.aClass613Array8192[Class628.anInt8193 * -1733921159]);
			Class628.anInt8193 = ((Class628.anInt8193 * -1733921159 + 1 & Class166.anIntArray1835[Class628.anInt8201 * 367556557]) * -1508764727);
			class613.method10126(i, bool);
			return class613;
		}
		return new Class613(i, bool);
	}

	public void method10150() {
		aBool8018 = true;
	}

	void method10151() {
		aBool8018 = false;
	}

	void method10152() {
		aBool8018 = false;
	}

	public void method10153(int i, int i_6_, int i_7_, int i_8_, int i_9_) {
		anInt8029 = i;
	}

	boolean method10154(Class180 class180, long l) {
		if (aLong8022 != aLong8025)
			method10129();
		else
			method10160();
		if (l - aLong8022 > 750L) {
			method10134();
			return false;
		}
		int i = (int) (l - aLong8025);
		if (aBool8017) {
			Iterator iterator = aList8023.iterator();
			while (iterator.hasNext()) {
				Class625 class625 = (Class625) iterator.next();
				for (int i_10_ = 0; i_10_ < class625.aClass394_8161.anInt4061 * 623314517; i_10_++)
					class625.method10340(class180, l, 1, !aBool8018, (byte) -94);
			}
			aBool8017 = false;
		}
		Iterator iterator = aList8023.iterator();
		while (iterator.hasNext()) {
			Class625 class625 = (Class625) iterator.next();
			class625.method10340(class180, l, i, !aBool8018, (byte) 10);
		}
		aLong8025 = l;
		return true;
	}

	public void method10155(long l) {
		aLong8022 = l;
	}

	void method10156(Class555 class555, Class180 class180) {
		aClass182_8021.aClass710_2094.method14403(-174830563);
		Iterator iterator = aList8023.iterator();
		while (iterator.hasNext()) {
			Class625 class625 = (Class625) iterator.next();
			class625.method10344(class555, class180, aLong8025);
		}
	}

	public void method10157(Class180 class180, long l, Class167[] class167s, Class159[] class159s, boolean bool) {
		if (!aBool8026) {
			method10166(class180, class167s, bool);
			method10143(class159s, bool);
			aLong8022 = l;
		}
	}

	public void method10158(Class180 class180, long l, Class167[] class167s, Class159[] class159s, boolean bool) {
		if (!aBool8026) {
			method10166(class180, class167s, bool);
			method10143(class159s, bool);
			aLong8022 = l;
		}
	}

	public void method10159(Class180 class180, long l, Class167[] class167s, Class159[] class159s, boolean bool) {
		if (!aBool8026) {
			method10166(class180, class167s, bool);
			method10143(class159s, bool);
			aLong8022 = l;
		}
	}

	void method10160() {
		aBool8018 = false;
	}

	void method10161(Class159[] class159s, boolean bool) {
		for (int i = 0; i < 16; i++)
			aBoolArray8032[i] = false;
		Iterator iterator = aList8031.iterator();
		while_111_: while (iterator.hasNext()) {
			Class527_Sub42 class527_sub42 = (Class527_Sub42) iterator.next();
			if (class159s != null) {
				for (int i = 0; i < class159s.length; i++) {
					if (class527_sub42.aClass159_10758 == class159s[i] || (class527_sub42.aClass159_10758 == class159s[i].aClass159_1739)) {
						aBoolArray8032[i] = true;
						class527_sub42.method16683((short) 1011);
						continue while_111_;
					}
				}
			}
			if (!bool) {
				class527_sub42.method8735(-1889161967);
				anInt8028--;
				if (class527_sub42.method8736(-2126519674)) {
					class527_sub42.method8735(-1889161967);
					Class628.anInt8191 -= 1078282209;
				}
			}
		}
		if (class159s != null) {
			for (int i = 0; i < class159s.length && i != 16 && anInt8028 != 16; i++) {
				if (!aBoolArray8032[i]) {
					Class527_Sub42 class527_sub42 = null;
					if (((class159s[i].method2568(Class628.anInterface49_8197, -710389121).anInt3977) * -2028046375) == 1 && Class628.anInt8191 * 492387361 < 32) {
						class527_sub42 = new Class527_Sub42(class159s[i], this);
						Class628.aClass14_8188.method714(class527_sub42, (long) (class159s[i].anInt1741 * -829073041));
						Class628.anInt8191 += 1078282209;
					}
					if (class527_sub42 == null)
						class527_sub42 = new Class527_Sub42(class159s[i], this);
					aList8031.add(class527_sub42);
					anInt8028++;
					aBoolArray8032[i] = true;
				}
			}
		}
	}

	void method10162(Class159[] class159s, boolean bool) {
		for (int i = 0; i < 16; i++)
			aBoolArray8032[i] = false;
		Iterator iterator = aList8031.iterator();
		while_112_: while (iterator.hasNext()) {
			Class527_Sub42 class527_sub42 = (Class527_Sub42) iterator.next();
			if (class159s != null) {
				for (int i = 0; i < class159s.length; i++) {
					if (class527_sub42.aClass159_10758 == class159s[i] || (class527_sub42.aClass159_10758 == class159s[i].aClass159_1739)) {
						aBoolArray8032[i] = true;
						class527_sub42.method16683((short) 1011);
						continue while_112_;
					}
				}
			}
			if (!bool) {
				class527_sub42.method8735(-1889161967);
				anInt8028--;
				if (class527_sub42.method8736(-2126519674)) {
					class527_sub42.method8735(-1889161967);
					Class628.anInt8191 -= 1078282209;
				}
			}
		}
		if (class159s != null) {
			for (int i = 0; i < class159s.length && i != 16 && anInt8028 != 16; i++) {
				if (!aBoolArray8032[i]) {
					Class527_Sub42 class527_sub42 = null;
					if (((class159s[i].method2568(Class628.anInterface49_8197, -1137753817).anInt3977) * -2028046375) == 1 && Class628.anInt8191 * 492387361 < 32) {
						class527_sub42 = new Class527_Sub42(class159s[i], this);
						Class628.aClass14_8188.method714(class527_sub42, (long) (class159s[i].anInt1741 * -829073041));
						Class628.anInt8191 += 1078282209;
					}
					if (class527_sub42 == null)
						class527_sub42 = new Class527_Sub42(class159s[i], this);
					aList8031.add(class527_sub42);
					anInt8028++;
					aBoolArray8032[i] = true;
				}
			}
		}
	}

	public Class182 method10163() {
		aClass182_8021.aClass710_2094.method14403(-35662075);
		for (int i = 0; i < aClass522_Sub6_Sub1_Sub1Array8019.length; i++) {
			if (aClass522_Sub6_Sub1_Sub1Array8019[i] != null && (aClass522_Sub6_Sub1_Sub1Array8019[i].aClass625_12104 != null))
				aClass182_8021.aClass710_2094.method14402(aClass522_Sub6_Sub1_Sub1Array8019[i], 1765132830);
		}
		return aClass182_8021;
	}

	void method10164() {
		aBool8026 = true;
		Iterator iterator = aList8031.iterator();
		while (iterator.hasNext()) {
			Class527_Sub42 class527_sub42 = (Class527_Sub42) iterator.next();
			if (class527_sub42.aClass388_10756.anInt3977 * -2028046375 == 1)
				class527_sub42.method8735(-1889161967);
		}
		for (int i = 0; i < aClass522_Sub6_Sub1_Sub1Array8019.length; i++) {
			if (aClass522_Sub6_Sub1_Sub1Array8019[i] != null) {
				aClass522_Sub6_Sub1_Sub1Array8019[i].method18772();
				aClass522_Sub6_Sub1_Sub1Array8019[i] = null;
			}
		}
		anInt8020 = 0;
		aList8023 = new LinkedList();
		anInt8024 = 0;
		aList8031 = new LinkedList();
		anInt8028 = 0;
	}

	void method10165(int i, boolean bool) {
		Class628.aList8199.add(this);
		aLong8022 = (long) i;
		aLong8025 = (long) i;
		aBool8017 = true;
		aBool8030 = bool;
	}

	void method10166(Class180 class180, Class167[] class167s, boolean bool) {
		for (int i = 0; i < 64; i++)
			aBoolArray8027[i] = false;
		Iterator iterator = aList8023.iterator();
		while_113_: while (iterator.hasNext()) {
			Class625 class625 = (Class625) iterator.next();
			if (class167s != null) {
				for (int i = 0; i < class167s.length && i != 64; i++) {
					if (class625.aClass167_8174 == class167s[i] || (class625.aClass167_8174 == class167s[i].aClass167_1849)) {
						aBoolArray8027[i] = true;
						class625.method10339(-997378716);
						class625.aBool8167 = false;
						continue while_113_;
					}
				}
			}
			if (!bool) {
				if (class625.anInt8175 * -1689646929 == 0) {
					iterator.remove();
					anInt8024--;
				} else
					class625.aBool8167 = true;
			}
		}
		if (class167s != null) {
			for (int i = 0; i < class167s.length && i != 64 && anInt8024 != 64; i++) {
				if (!aBoolArray8027[i]) {
					Class625 class625 = new Class625(class180, class167s[i], this, aLong8022);
					aList8023.add(class625);
					anInt8024++;
					aBoolArray8027[i] = true;
				}
			}
		}
	}

	void method10167(Class555 class555, Class180 class180) {
		aClass182_8021.aClass710_2094.method14403(-1487327691);
		Iterator iterator = aList8023.iterator();
		while (iterator.hasNext()) {
			Class625 class625 = (Class625) iterator.next();
			class625.method10344(class555, class180, aLong8025);
		}
	}

	public Class182 method10168() {
		return aClass182_8021;
	}

	public Class182 method10169() {
		return aClass182_8021;
	}

	public Class182 method10170() {
		return aClass182_8021;
	}
}
