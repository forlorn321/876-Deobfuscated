/* Class536_Sub18_Sub11_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.lang.ref.SoftReference;

public class Class536_Sub18_Sub11_Sub2 extends Class536_Sub18_Sub11 {
	SoftReference aSoftReference12106;

	Class536_Sub18_Sub11_Sub2(Object object, int i) {
		super(i);
		aSoftReference12106 = new SoftReference(object);
	}

	boolean method10738() {
		return true;
	}

	boolean method10734(short i) {
		return true;
	}

	Object method10733(byte i) {
		return aSoftReference12106.get();
	}

	Object method10736() {
		return aSoftReference12106.get();
	}

	Object method10737() {
		return aSoftReference12106.get();
	}

	Object method10732() {
		return aSoftReference12106.get();
	}

	boolean method10735() {
		return true;
	}
}
