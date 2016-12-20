/* Class27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

class Class27 implements Iterator {
	Class62 this$0;
	int anInt259;

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public void method859() {
		throw new UnsupportedOperationException();
	}

	public Object next() {
		return (this$0.anInterface14Array732[(anInt259 += -1461828035) * 1532363029 - 1]);
	}

	Class27(Class62 class62) {
		this$0 = class62;
	}

	public boolean method860() {
		return 1532363029 * anInt259 < this$0.anInterface14Array732.length;
	}

	public Object method861() {
		return (this$0.anInterface14Array732[(anInt259 += -1461828035) * 1532363029 - 1]);
	}

	public Object method862() {
		return (this$0.anInterface14Array732[(anInt259 += -1461828035) * 1532363029 - 1]);
	}

	public boolean hasNext() {
		return 1532363029 * anInt259 < this$0.anInterface14Array732.length;
	}

	static final void method863(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class208_Sub22.method15641(class243, class240, class665, -963105634);
	}
}
