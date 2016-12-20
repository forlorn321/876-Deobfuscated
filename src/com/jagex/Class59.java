/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

class Class59 implements Iterator {
	int anInt723;
	Class24 this$0;
	static Class638 aClass638_724;

	public Object method1368() {
		int i = (anInt723 += 1398760641) * 1318792001 - 1;
		synchronized (this$0.aClass205_232) {
			Interface14 interface14 = (Interface14) this$0.aClass205_232.method3787((long) i);
			if (interface14 != null) {
				Interface14 interface14_0_ = interface14;
				return interface14_0_;
			}
		}
		return this$0.method831(i, -276974424);
	}

	public boolean hasNext() {
		return anInt723 * 1318792001 < this$0.anInt230 * -1588728841;
	}

	Class59(Class24 class24) {
		this$0 = class24;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean method1369() {
		return anInt723 * 1318792001 < this$0.anInt230 * -1588728841;
	}

	public Object next() {
		int i = (anInt723 += 1398760641) * 1318792001 - 1;
		synchronized (this$0.aClass205_232) {
			Interface14 interface14 = (Interface14) this$0.aClass205_232.method3787((long) i);
			if (interface14 != null) {
				Interface14 interface14_1_ = interface14;
				return interface14_1_;
			}
		}
		return this$0.method831(i, 787746734);
	}

	public Object method1370() {
		int i = (anInt723 += 1398760641) * 1318792001 - 1;
		synchronized (this$0.aClass205_232) {
			Interface14 interface14 = (Interface14) this$0.aClass205_232.method3787((long) i);
			if (interface14 != null) {
				Interface14 interface14_2_ = interface14;
				return interface14_2_;
			}
		}
		return this$0.method831(i, 927140112);
	}

	public void method1371() {
		throw new UnsupportedOperationException();
	}

	public static Class612[] method1372(int i) {
		return (new Class612[] { Class612.aClass612_8012, Class612.aClass612_8015, Class612.aClass612_8013, Class612.aClass612_8011, Class612.aClass612_8010, Class612.aClass612_8014 });
	}

	static final void method1373(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class468.method7688(class243, class240, class665, 1687228516);
	}

	public static int method1374(CharSequence charsequence, int i, byte i_3_) {
		return Class217.method3972(charsequence, i, true, -1372484991);
	}
}
