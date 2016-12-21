/* Class549_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Class549_Sub1 extends Class549 implements KeyListener, FocusListener {
	static final int anInt10577 = 128;
	Class708 aClass708_10578;
	Class708 aClass708_10579 = new Class708();
	static int[] anIntArray10580 = { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101,
			128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 0, 0, 0, 0, 0, 0, 150, 151, 152, 153, 0, 100, 0, 0, 0, 0, 160, 161, 162, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	boolean[] aBoolArray10581;
	static final int anInt10582 = 112;
	Component aComponent10583;

	public void method6642() {
		method9659(-1963892935);
	}

	public void method6648(int i) {
		method9659(-1909393992);
	}

	void method9659(int i) {
		if (aComponent10583 != null) {
			aComponent10583.removeKeyListener(this);
			aComponent10583.removeFocusListener(this);
			aComponent10583 = null;
			for (int i_0_ = 0; i_0_ < 112; i_0_++)
				aBoolArray10581[i_0_] = false;
			aClass708_10579.method8304(454036827);
			aClass708_10578.method8304(454036827);
		}
	}

	public synchronized void method6646() {
		aClass708_10579.method8304(454036827);
		for (Class536_Sub35 class536_sub35 = (Class536_Sub35) aClass708_10578.method8305(-2074580038); null != class536_sub35; class536_sub35 = (Class536_Sub35) aClass708_10578.method8305(944383083)) {
			class536_sub35.anInt10631 = method9661((short) -12229) * 650298029;
			if (0 == class536_sub35.anInt10628 * 1184323753) {
				if (!aBoolArray10581[class536_sub35.anInt10630 * -365074903]) {
					Class536_Sub35 class536_sub35_1_ = new Class536_Sub35();
					class536_sub35_1_.anInt10628 = 0;
					class536_sub35_1_.aChar10629 = '\uffff';
					class536_sub35_1_.anInt10630 = 1 * class536_sub35.anInt10630;
					class536_sub35_1_.aLong10632 = 1L * class536_sub35.aLong10632;
					class536_sub35_1_.anInt10631 = 1 * class536_sub35.anInt10631;
					aClass708_10579.method8335(class536_sub35_1_, 428157023);
					aBoolArray10581[class536_sub35.anInt10630 * -365074903] = true;
				}
				class536_sub35.anInt10628 = 1981650738;
				aClass708_10579.method8335(class536_sub35, -2025419492);
			} else if (class536_sub35.anInt10628 * 1184323753 == 1) {
				if (aBoolArray10581[-365074903 * class536_sub35.anInt10630]) {
					aClass708_10579.method8335(class536_sub35, -233570277);
					aBoolArray10581[-365074903 * class536_sub35.anInt10630] = false;
				}
			} else if (class536_sub35.anInt10628 * 1184323753 == -1) {
				for (int i = 0; i < 112; i++) {
					if (aBoolArray10581[i]) {
						Class536_Sub35 class536_sub35_2_ = new Class536_Sub35();
						class536_sub35_2_.anInt10628 = 990825369;
						class536_sub35_2_.aChar10629 = '\uffff';
						class536_sub35_2_.anInt10630 = i * 1738380825;
						class536_sub35_2_.aLong10632 = 1L * class536_sub35.aLong10632;
						class536_sub35_2_.anInt10631 = class536_sub35.anInt10631 * 1;
						aClass708_10579.method8335(class536_sub35_2_, -1457459819);
						aBoolArray10581[i] = false;
					}
				}
			} else if (3 == class536_sub35.anInt10628 * 1184323753)
				aClass708_10579.method8335(class536_sub35, -398464051);
		}
	}

	public Interface63 method6640(int i) {
		return (Interface63) aClass708_10579.method8305(-523902518);
	}

	Class549_Sub1(Component component) {
		aClass708_10578 = new Class708();
		aBoolArray10581 = new boolean[112];
		Class430.method5169(2091552108);
		method9673(component, -1817015813);
	}

	int method9660() {
		int i = 0;
		if (aBoolArray10581[81])
			i |= 0x1;
		if (aBoolArray10581[82])
			i |= 0x4;
		if (aBoolArray10581[86])
			i |= 0x2;
		return i;
	}

	int method9661(short i) {
		int i_3_ = 0;
		if (aBoolArray10581[81])
			i_3_ |= 0x1;
		if (aBoolArray10581[82])
			i_3_ |= 0x4;
		if (aBoolArray10581[86])
			i_3_ |= 0x2;
		return i_3_;
	}

	void method9662() {
		if (aComponent10583 != null) {
			aComponent10583.removeKeyListener(this);
			aComponent10583.removeFocusListener(this);
			aComponent10583 = null;
			for (int i = 0; i < 112; i++)
				aBoolArray10581[i] = false;
			aClass708_10579.method8304(454036827);
			aClass708_10578.method8304(454036827);
		}
	}

	public synchronized void method9663(FocusEvent focusevent) {
		method9664(-1, '\0', 0, 620540934);
	}

	void method9664(int i, char c, int i_4_, int i_5_) {
		Class536_Sub35 class536_sub35 = new Class536_Sub35();
		class536_sub35.anInt10628 = 990825369 * i;
		class536_sub35.aChar10629 = c;
		class536_sub35.anInt10630 = 1738380825 * i_4_;
		class536_sub35.aLong10632 = Class249.method3450(2063246937) * -1614323376049383713L;
		aClass708_10578.method8335(class536_sub35, -208646251);
	}

	public synchronized void keyTyped(KeyEvent keyevent) {
		char c = keyevent.getKeyChar();
		if (c != '\uffff' && Class480.method5828(c, 663351095)) {
			method9664(3, c, -1, 620540934);
			keyevent.consume();
		}
	}

	public void focusGained(FocusEvent focusevent) {
		/* empty */
	}

	public synchronized void focusLost(FocusEvent focusevent) {
		method9664(-1, '\0', 0, 620540934);
	}

	public void method9665(FocusEvent focusevent) {
		/* empty */
	}

	public synchronized void keyPressed(KeyEvent keyevent) {
		method9670(keyevent, 0, -352312490);
	}

	static void method9666() {
		anIntArray10580[44] = 71;
		anIntArray10580[45] = 26;
		anIntArray10580[46] = 72;
		anIntArray10580[47] = 73;
		anIntArray10580[59] = 57;
		anIntArray10580[61] = 27;
		anIntArray10580[91] = 42;
		anIntArray10580[92] = 74;
		anIntArray10580[93] = 43;
		anIntArray10580[192] = 28;
		anIntArray10580[222] = 58;
		anIntArray10580[520] = 59;
	}

	static void method9667() {
		anIntArray10580[44] = 71;
		anIntArray10580[45] = 26;
		anIntArray10580[46] = 72;
		anIntArray10580[47] = 73;
		anIntArray10580[59] = 57;
		anIntArray10580[61] = 27;
		anIntArray10580[91] = 42;
		anIntArray10580[92] = 74;
		anIntArray10580[93] = 43;
		anIntArray10580[192] = 28;
		anIntArray10580[222] = 58;
		anIntArray10580[520] = 59;
	}

	void method9668() {
		if (aComponent10583 != null) {
			aComponent10583.removeKeyListener(this);
			aComponent10583.removeFocusListener(this);
			aComponent10583 = null;
			for (int i = 0; i < 112; i++)
				aBoolArray10581[i] = false;
			aClass708_10579.method8304(454036827);
			aClass708_10578.method8304(454036827);
		}
	}

	int method9669() {
		int i = 0;
		if (aBoolArray10581[81])
			i |= 0x1;
		if (aBoolArray10581[82])
			i |= 0x4;
		if (aBoolArray10581[86])
			i |= 0x2;
		return i;
	}

	public Interface63 method6641() {
		return (Interface63) aClass708_10579.method8305(548228767);
	}

	void method9670(KeyEvent keyevent, int i, int i_6_) {
		int i_7_ = keyevent.getKeyCode();
		if (0 != i_7_) {
			if (i_7_ >= 0 && i_7_ < anIntArray10580.length) {
				i_7_ = anIntArray10580[i_7_];
				if (0 == i && (i_7_ & 0x80) != 0)
					i_7_ = 0;
				else
					i_7_ &= ~0x80;
			} else
				i_7_ = 0;
		} else
			i_7_ = 0;
		if (i_7_ != 0) {
			method9664(i, '\uffff', i_7_, 620540934);
			keyevent.consume();
		}
	}

	public synchronized void method6637(int i) {
		aClass708_10579.method8304(454036827);
		for (Class536_Sub35 class536_sub35 = (Class536_Sub35) aClass708_10578.method8305(-976861370); null != class536_sub35; class536_sub35 = (Class536_Sub35) aClass708_10578.method8305(1884352652)) {
			class536_sub35.anInt10631 = method9661((short) -12477) * 650298029;
			if (0 == class536_sub35.anInt10628 * 1184323753) {
				if (!aBoolArray10581[class536_sub35.anInt10630 * -365074903]) {
					Class536_Sub35 class536_sub35_8_ = new Class536_Sub35();
					class536_sub35_8_.anInt10628 = 0;
					class536_sub35_8_.aChar10629 = '\uffff';
					class536_sub35_8_.anInt10630 = 1 * class536_sub35.anInt10630;
					class536_sub35_8_.aLong10632 = 1L * class536_sub35.aLong10632;
					class536_sub35_8_.anInt10631 = 1 * class536_sub35.anInt10631;
					aClass708_10579.method8335(class536_sub35_8_, -1017378551);
					aBoolArray10581[class536_sub35.anInt10630 * -365074903] = true;
				}
				class536_sub35.anInt10628 = 1981650738;
				aClass708_10579.method8335(class536_sub35, 753383721);
			} else if (class536_sub35.anInt10628 * 1184323753 == 1) {
				if (aBoolArray10581[-365074903 * class536_sub35.anInt10630]) {
					aClass708_10579.method8335(class536_sub35, 347048110);
					aBoolArray10581[-365074903 * class536_sub35.anInt10630] = false;
				}
			} else if (class536_sub35.anInt10628 * 1184323753 == -1) {
				for (int i_9_ = 0; i_9_ < 112; i_9_++) {
					if (aBoolArray10581[i_9_]) {
						Class536_Sub35 class536_sub35_10_ = new Class536_Sub35();
						class536_sub35_10_.anInt10628 = 990825369;
						class536_sub35_10_.aChar10629 = '\uffff';
						class536_sub35_10_.anInt10630 = i_9_ * 1738380825;
						class536_sub35_10_.aLong10632 = 1L * class536_sub35.aLong10632;
						class536_sub35_10_.anInt10631 = class536_sub35.anInt10631 * 1;
						aClass708_10579.method8335(class536_sub35_10_, -858707241);
						aBoolArray10581[i_9_] = false;
					}
				}
			} else if (3 == class536_sub35.anInt10628 * 1184323753)
				aClass708_10579.method8335(class536_sub35, 413127473);
		}
	}

	public Interface63 method6644() {
		return (Interface63) aClass708_10579.method8305(639593597);
	}

	public boolean method6647(int i) {
		if (i < 0 || i >= 112)
			return false;
		return aBoolArray10581[i];
	}

	public synchronized void method6645() {
		aClass708_10579.method8304(454036827);
		for (Class536_Sub35 class536_sub35 = (Class536_Sub35) aClass708_10578.method8305(-790427322); null != class536_sub35; class536_sub35 = (Class536_Sub35) aClass708_10578.method8305(881033393)) {
			class536_sub35.anInt10631 = method9661((short) -23978) * 650298029;
			if (0 == class536_sub35.anInt10628 * 1184323753) {
				if (!aBoolArray10581[class536_sub35.anInt10630 * -365074903]) {
					Class536_Sub35 class536_sub35_11_ = new Class536_Sub35();
					class536_sub35_11_.anInt10628 = 0;
					class536_sub35_11_.aChar10629 = '\uffff';
					class536_sub35_11_.anInt10630 = 1 * class536_sub35.anInt10630;
					class536_sub35_11_.aLong10632 = 1L * class536_sub35.aLong10632;
					class536_sub35_11_.anInt10631 = 1 * class536_sub35.anInt10631;
					aClass708_10579.method8335(class536_sub35_11_, 670253278);
					aBoolArray10581[class536_sub35.anInt10630 * -365074903] = true;
				}
				class536_sub35.anInt10628 = 1981650738;
				aClass708_10579.method8335(class536_sub35, -784392054);
			} else if (class536_sub35.anInt10628 * 1184323753 == 1) {
				if (aBoolArray10581[-365074903 * class536_sub35.anInt10630]) {
					aClass708_10579.method8335(class536_sub35, 557900905);
					aBoolArray10581[-365074903 * class536_sub35.anInt10630] = false;
				}
			} else if (class536_sub35.anInt10628 * 1184323753 == -1) {
				for (int i = 0; i < 112; i++) {
					if (aBoolArray10581[i]) {
						Class536_Sub35 class536_sub35_12_ = new Class536_Sub35();
						class536_sub35_12_.anInt10628 = 990825369;
						class536_sub35_12_.aChar10629 = '\uffff';
						class536_sub35_12_.anInt10630 = i * 1738380825;
						class536_sub35_12_.aLong10632 = 1L * class536_sub35.aLong10632;
						class536_sub35_12_.anInt10631 = class536_sub35.anInt10631 * 1;
						aClass708_10579.method8335(class536_sub35_12_, -1246834686);
						aBoolArray10581[i] = false;
					}
				}
			} else if (3 == class536_sub35.anInt10628 * 1184323753)
				aClass708_10579.method8335(class536_sub35, -213898486);
		}
	}

	int method9671() {
		int i = 0;
		if (aBoolArray10581[81])
			i |= 0x1;
		if (aBoolArray10581[82])
			i |= 0x4;
		if (aBoolArray10581[86])
			i |= 0x2;
		return i;
	}

	public Interface63 method6639() {
		return (Interface63) aClass708_10579.method8305(-231764455);
	}

	int method9672() {
		int i = 0;
		if (aBoolArray10581[81])
			i |= 0x1;
		if (aBoolArray10581[82])
			i |= 0x4;
		if (aBoolArray10581[86])
			i |= 0x2;
		return i;
	}

	public synchronized void keyReleased(KeyEvent keyevent) {
		method9670(keyevent, 1, -1070978595);
	}

	public boolean method6638(int i, byte i_13_) {
		if (i < 0 || i >= 112)
			return false;
		return aBoolArray10581[i];
	}

	public Interface63 method6643() {
		return (Interface63) aClass708_10579.method8305(1860614903);
	}

	void method9673(Component component, int i) {
		method9659(-1972029307);
		aComponent10583 = component;
		aComponent10583.addKeyListener(this);
		aComponent10583.addFocusListener(this);
	}

	static final void method9674(Class251[] class251s, int i, int i_14_) {
		for (int i_15_ = 0; i_15_ < class251s.length; i_15_++) {
			Class251 class251 = class251s[i_15_];
			if (class251 != null && class251.anInt2577 * -1940204141 == i && !client.method10439(class251)) {
				if (class251.anInt2728 * 1049444347 == 0) {
					method9674(class251s, -1591767037 * class251.anInt2559, 1983741393);
					if (null != class251.aClass251Array2726)
						method9674(class251.aClass251Array2726, class251.anInt2559 * -1591767037, 1983741393);
					Class536_Sub36 class536_sub36 = ((Class536_Sub36) (client.aClass4_11008.method556((long) (-1591767037 * class251.anInt2559))));
					if (null != class536_sub36)
						Class199.method2913((class536_sub36.anInt10634 * -358726121), -97240780);
				}
				if (6 == class251.anInt2728 * 1049444347 && 1625008649 * class251.anInt2723 != -1) {
					if (class251.aClass688_2653 == null) {
						class251.aClass688_2653 = new Class688_Sub1();
						class251.aClass688_2653.method8122((1625008649 * (class251.anInt2723)), -1474623312);
					}
					if (class251.aClass688_2653.method8138((client.anInt11180 * -1483561311), 1489564848) && class251.aClass688_2653.method8135(495203082))
						class251.aClass688_2653.method8137(-703751447);
				}
			}
		}
	}
}
