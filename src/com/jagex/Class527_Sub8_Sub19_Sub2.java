/* Class527_Sub8_Sub19_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.lang.ref.SoftReference;

public class Class527_Sub8_Sub19_Sub2 extends Class527_Sub8_Sub19 {
	SoftReference aSoftReference12070;

	boolean method18495() {
		return true;
	}

	Object method18492(short i) {
		return aSoftReference12070.get();
	}

	Class527_Sub8_Sub19_Sub2(Object object, int i) {
		super(i);
		aSoftReference12070 = new SoftReference(object);
	}

	Object method18493() {
		return aSoftReference12070.get();
	}

	boolean method18491(short i) {
		return true;
	}

	Object method18494() {
		return aSoftReference12070.get();
	}
}
