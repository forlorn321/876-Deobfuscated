/* Class362 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class362 {
	long aLong3833;
	int anInt3834;

	final void method4758(Class355 class355) {
		aLong3833 |= (long) (class355.anInt3772 << Class355.anInt3768 * anInt3834++);
	}

	public final Class355 method4759(int i) {
		return Class355.method4657(method4761(i));
	}

	public final int method4760() {
		return anInt3834;
	}

	Class362(Class355[] class355s) {
		for (int i = 0; i < class355s.length; i++)
			method4758(class355s[i]);
	}

	final int method4761(int i) {
		return (int) (aLong3833 >> Class355.anInt3768 * i) & 0xf;
	}

	public final int method4762() {
		return anInt3834;
	}

	public final int method4763() {
		return anInt3834;
	}

	Class362(Class355 class355) {
		aLong3833 = (long) class355.anInt3772;
		anInt3834 = 1;
	}
}
