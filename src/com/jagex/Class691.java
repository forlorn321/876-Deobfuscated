/* Class691 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class691 implements Iterator {
	Class527 aClass527_8731 = null;
	Class527 aClass527_8732;
	Class694 aClass694_8733;

	public void method14003(Class694 class694, int i) {
		aClass694_8733 = class694;
		aClass527_8732 = aClass694_8733.aClass527_8736.aClass527_7105;
		aClass527_8731 = null;
	}

	public Class527 method14004() {
		method14005(-441344444);
		return (Class527) next();
	}

	void method14005(int i) {
		aClass527_8732 = aClass694_8733.aClass527_8736.aClass527_7105;
		aClass527_8731 = null;
	}

	public void method14006() {
		if (null == aClass527_8731)
			throw new IllegalStateException();
		aClass527_8731.method8735(-1889161967);
		aClass527_8731 = null;
	}

	public Object next() {
		Class527 class527 = aClass527_8732;
		if (aClass694_8733.aClass527_8736 == class527) {
			class527 = null;
			aClass527_8732 = null;
		} else
			aClass527_8732 = class527.aClass527_7105;
		aClass527_8731 = class527;
		return class527;
	}

	public Object method14007() {
		Class527 class527 = aClass527_8732;
		if (aClass694_8733.aClass527_8736 == class527) {
			class527 = null;
			aClass527_8732 = null;
		} else
			aClass527_8732 = class527.aClass527_7105;
		aClass527_8731 = class527;
		return class527;
	}

	public void remove() {
		if (null == aClass527_8731)
			throw new IllegalStateException();
		aClass527_8731.method8735(-1889161967);
		aClass527_8731 = null;
	}

	public boolean method14008() {
		return aClass694_8733.aClass527_8736 != aClass527_8732;
	}

	public Object method14009() {
		Class527 class527 = aClass527_8732;
		if (aClass694_8733.aClass527_8736 == class527) {
			class527 = null;
			aClass527_8732 = null;
		} else
			aClass527_8732 = class527.aClass527_7105;
		aClass527_8731 = class527;
		return class527;
	}

	public Class527 method14010(int i) {
		method14005(-1712857443);
		return (Class527) next();
	}

	public void method14011(Class694 class694) {
		aClass694_8733 = class694;
		aClass527_8732 = aClass694_8733.aClass527_8736.aClass527_7105;
		aClass527_8731 = null;
	}

	public void method14012(Class694 class694) {
		aClass694_8733 = class694;
		aClass527_8732 = aClass694_8733.aClass527_8736.aClass527_7105;
		aClass527_8731 = null;
	}

	public boolean hasNext() {
		return aClass694_8733.aClass527_8736 != aClass527_8732;
	}

	public void method14013(Class694 class694) {
		aClass694_8733 = class694;
		aClass527_8732 = aClass694_8733.aClass527_8736.aClass527_7105;
		aClass527_8731 = null;
	}

	public void method14014(Class694 class694) {
		aClass694_8733 = class694;
		aClass527_8732 = aClass694_8733.aClass527_8736.aClass527_7105;
		aClass527_8731 = null;
	}

	public void method14015(Class694 class694) {
		aClass694_8733 = class694;
		aClass527_8732 = aClass694_8733.aClass527_8736.aClass527_7105;
		aClass527_8731 = null;
	}

	void method14016() {
		aClass527_8732 = aClass694_8733.aClass527_8736.aClass527_7105;
		aClass527_8731 = null;
	}

	void method14017() {
		aClass527_8732 = aClass694_8733.aClass527_8736.aClass527_7105;
		aClass527_8731 = null;
	}

	public Class691(Class694 class694) {
		aClass694_8733 = class694;
		aClass527_8732 = aClass694_8733.aClass527_8736.aClass527_7105;
		aClass527_8731 = null;
	}

	public Class527 method14018() {
		method14005(-1155732182);
		return (Class527) next();
	}

	public static int method14019(int i, byte i_0_) {
		return i >>> 8;
	}
}
