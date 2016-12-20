/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class10 implements Iterator {
	Class14 aClass14_153;
	Class527 aClass527_154;
	int anInt155;
	Class527 aClass527_156 = null;

	public Class527 method673(int i) {
		method674((byte) 9);
		return (Class527) next();
	}

	void method674(byte i) {
		aClass527_154 = aClass14_153.aClass527Array184[0].aClass527_7105;
		anInt155 = -1602681475;
		aClass527_156 = null;
	}

	public Object method675() {
		if (aClass527_154 != aClass14_153.aClass527Array184[anInt155 * -759735339 - 1]) {
			Class527 class527 = aClass527_154;
			aClass527_154 = class527.aClass527_7105;
			aClass527_156 = class527;
			return class527;
		}
		while (-759735339 * anInt155 < aClass14_153.anInt185 * -778154051) {
			Class527 class527 = (aClass14_153.aClass527Array184[(anInt155 += -1602681475) * -759735339 - 1].aClass527_7105);
			if (aClass14_153.aClass527Array184[anInt155 * -759735339 - 1] != class527) {
				aClass527_154 = class527.aClass527_7105;
				aClass527_156 = class527;
				return class527;
			}
		}
		return null;
	}

	public Object next() {
		if (aClass527_154 != aClass14_153.aClass527Array184[anInt155 * -759735339 - 1]) {
			Class527 class527 = aClass527_154;
			aClass527_154 = class527.aClass527_7105;
			aClass527_156 = class527;
			return class527;
		}
		while (-759735339 * anInt155 < aClass14_153.anInt185 * -778154051) {
			Class527 class527 = (aClass14_153.aClass527Array184[(anInt155 += -1602681475) * -759735339 - 1].aClass527_7105);
			if (aClass14_153.aClass527Array184[anInt155 * -759735339 - 1] != class527) {
				aClass527_154 = class527.aClass527_7105;
				aClass527_156 = class527;
				return class527;
			}
		}
		return null;
	}

	public boolean hasNext() {
		if (aClass14_153.aClass527Array184[anInt155 * -759735339 - 1] != aClass527_154)
			return true;
		while (anInt155 * -759735339 < -778154051 * aClass14_153.anInt185) {
			if ((aClass14_153.aClass527Array184[(anInt155 += -1602681475) * -759735339 - 1].aClass527_7105) != aClass14_153.aClass527Array184[anInt155 * -759735339 - 1]) {
				aClass527_154 = (aClass14_153.aClass527Array184[anInt155 * -759735339 - 1].aClass527_7105);
				return true;
			}
			aClass527_154 = aClass14_153.aClass527Array184[anInt155 * -759735339 - 1];
		}
		return false;
	}

	public void remove() {
		if (null == aClass527_156)
			throw new IllegalStateException();
		aClass527_156.method8735(-1889161967);
		aClass527_156 = null;
	}

	public boolean method676() {
		if (aClass14_153.aClass527Array184[anInt155 * -759735339 - 1] != aClass527_154)
			return true;
		while (anInt155 * -759735339 < -778154051 * aClass14_153.anInt185) {
			if ((aClass14_153.aClass527Array184[(anInt155 += -1602681475) * -759735339 - 1].aClass527_7105) != aClass14_153.aClass527Array184[anInt155 * -759735339 - 1]) {
				aClass527_154 = (aClass14_153.aClass527Array184[anInt155 * -759735339 - 1].aClass527_7105);
				return true;
			}
			aClass527_154 = aClass14_153.aClass527Array184[anInt155 * -759735339 - 1];
		}
		return false;
	}

	public Class10(Class14 class14) {
		aClass14_153 = class14;
		method674((byte) 24);
	}

	public Object method677() {
		if (aClass527_154 != aClass14_153.aClass527Array184[anInt155 * -759735339 - 1]) {
			Class527 class527 = aClass527_154;
			aClass527_154 = class527.aClass527_7105;
			aClass527_156 = class527;
			return class527;
		}
		while (-759735339 * anInt155 < aClass14_153.anInt185 * -778154051) {
			Class527 class527 = (aClass14_153.aClass527Array184[(anInt155 += -1602681475) * -759735339 - 1].aClass527_7105);
			if (aClass14_153.aClass527Array184[anInt155 * -759735339 - 1] != class527) {
				aClass527_154 = class527.aClass527_7105;
				aClass527_156 = class527;
				return class527;
			}
		}
		return null;
	}

	public void method678() {
		if (null == aClass527_156)
			throw new IllegalStateException();
		aClass527_156.method8735(-1889161967);
		aClass527_156 = null;
	}

	void method679() {
		aClass527_154 = aClass14_153.aClass527Array184[0].aClass527_7105;
		anInt155 = -1602681475;
		aClass527_156 = null;
	}

	void method680() {
		aClass527_154 = aClass14_153.aClass527Array184[0].aClass527_7105;
		anInt155 = -1602681475;
		aClass527_156 = null;
	}

	public Class527 method681() {
		method674((byte) 47);
		return (Class527) next();
	}

	public Class527 method682() {
		method674((byte) -75);
		return (Class527) next();
	}

	public Class527 method683() {
		method674((byte) -49);
		return (Class527) next();
	}

	static final void method684(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, 1791554062);
		Class240 class240 = Class183.aClass240Array2100[i_0_ >> 16];
		Class409.method6569(class243, class240, class665, (short) 4098);
	}
}
