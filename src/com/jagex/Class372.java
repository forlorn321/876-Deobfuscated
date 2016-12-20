/* Class372 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class372 {
	int anInt3905;
	long aLong3906;

	public final int method6364() {
		return anInt3905;
	}

	Class372(Class347[] class347s) {
		for (int i = 0; i < class347s.length; i++)
			method6368(class347s[i]);
	}

	public final int method6365() {
		return anInt3905;
	}

	public final Class347 method6366(int i) {
		return Class347.method6162(method6370(i));
	}

	final int method6367(int i) {
		return (int) (aLong3906 >> Class347.anInt3746 * i) & 0xf;
	}

	final void method6368(Class347 class347) {
		aLong3906 |= (long) (class347.anInt3747 << Class347.anInt3746 * anInt3905++);
	}

	Class372(Class347 class347) {
		aLong3906 = (long) class347.anInt3747;
		anInt3905 = 1;
	}

	public final int method6369() {
		return anInt3905;
	}

	final int method6370(int i) {
		return (int) (aLong3906 >> Class347.anInt3746 * i) & 0xf;
	}

	public final int method6371() {
		return anInt3905;
	}

	public final Class347 method6372(int i) {
		return Class347.method6162(method6370(i));
	}

	public final Class347 method6373(int i) {
		return Class347.method6162(method6370(i));
	}

	public final int method6374() {
		return anInt3905;
	}
}
