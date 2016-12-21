/* Class536_Sub18_Sub19_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.lang.ref.SoftReference;

public class Class536_Sub18_Sub19_Sub2 extends Class536_Sub18_Sub19 {
	SoftReference aSoftReference12118;

	boolean method10815() {
		return true;
	}

	Object method10814() {
		return aSoftReference12118.get();
	}

	Class536_Sub18_Sub19_Sub2(Interface70 interface70, Object object, int i) {
		super(interface70, i);
		aSoftReference12118 = new SoftReference(object);
	}

	Object method10817() {
		return aSoftReference12118.get();
	}

	Object method10816() {
		return aSoftReference12118.get();
	}

	boolean method10818() {
		return true;
	}
}
