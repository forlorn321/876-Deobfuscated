/* Class554_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Class554_Sub1 extends Class554 implements KeyListener, FocusListener {
	static int[] anIntArray10810 = { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101,
			128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 0, 0, 0, 0, 0, 0, 150, 151, 152, 153, 0, 100, 0, 0, 0, 0, 160, 161, 162, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	static final int anInt10811 = 128;
	Class694 aClass694_10812 = new Class694();
	Class694 aClass694_10813 = new Class694();
	static final int anInt10814 = 112;
	Component aComponent10815;
	boolean[] aBoolArray10816 = new boolean[112];

	public synchronized void method16796(KeyEvent keyevent) {
		method16801(keyevent, 1, -1384915712);
	}

	void method16797(int i, char c, int i_0_) {
		Class527_Sub32 class527_sub32 = new Class527_Sub32();
		class527_sub32.anInt10642 = i * 1632677851;
		class527_sub32.aChar10640 = c;
		class527_sub32.anInt10645 = 769063539 * i_0_;
		class527_sub32.aLong10644 = Class234.method4347(-1408626088) * 2087597669864614737L;
		aClass694_10813.method14147(class527_sub32, -1088526586);
	}

	void method16798(int i) {
		if (aComponent10815 != null) {
			aComponent10815.removeKeyListener(this);
			aComponent10815.removeFocusListener(this);
			aComponent10815 = null;
			for (int i_1_ = 0; i_1_ < 112; i_1_++)
				aBoolArray10816[i_1_] = false;
			aClass694_10812.method14105((byte) 48);
			aClass694_10813.method14105((byte) 120);
		}
	}

	void method16799(int i, char c, int i_2_, int i_3_) {
		Class527_Sub32 class527_sub32 = new Class527_Sub32();
		class527_sub32.anInt10642 = i * 1632677851;
		class527_sub32.aChar10640 = c;
		class527_sub32.anInt10645 = 769063539 * i_2_;
		class527_sub32.aLong10644 = Class234.method4347(-1408626088) * 2087597669864614737L;
		aClass694_10813.method14147(class527_sub32, -1377514430);
	}

	public Interface64 method9204() {
		return (Interface64) aClass694_10812.method14077(-1480065385);
	}

	public boolean method9199(int i, int i_4_) {
		if (i < 0 || i >= 112)
			return false;
		return aBoolArray10816[i];
	}

	public synchronized void method9198(byte i) {
		aClass694_10812.method14105((byte) 124);
		for (Class527_Sub32 class527_sub32 = (Class527_Sub32) aClass694_10813.method14077(-298869767); class527_sub32 != null; class527_sub32 = (Class527_Sub32) aClass694_10813.method14077(-1823247469)) {
			class527_sub32.anInt10641 = method16800(-398432504) * 1882048927;
			if (class527_sub32.anInt10642 * -656165805 == 0) {
				if (!aBoolArray10816[1218656955 * class527_sub32.anInt10645]) {
					Class527_Sub32 class527_sub32_5_ = new Class527_Sub32();
					class527_sub32_5_.anInt10642 = 0;
					class527_sub32_5_.aChar10640 = '\uffff';
					class527_sub32_5_.anInt10645 = class527_sub32.anInt10645 * 1;
					class527_sub32_5_.aLong10644 = 1L * class527_sub32.aLong10644;
					class527_sub32_5_.anInt10641 = class527_sub32.anInt10641 * 1;
					aClass694_10812.method14147(class527_sub32_5_, -1922124229);
					aBoolArray10816[class527_sub32.anInt10645 * 1218656955] = true;
				}
				class527_sub32.anInt10642 = -1029611594;
				aClass694_10812.method14147(class527_sub32, -1953242869);
			} else if (class527_sub32.anInt10642 * -656165805 == 1) {
				if (aBoolArray10816[class527_sub32.anInt10645 * 1218656955]) {
					aClass694_10812.method14147(class527_sub32, -722706380);
					aBoolArray10816[1218656955 * class527_sub32.anInt10645] = false;
				}
			} else if (class527_sub32.anInt10642 * -656165805 == -1) {
				for (int i_6_ = 0; i_6_ < 112; i_6_++) {
					if (aBoolArray10816[i_6_]) {
						Class527_Sub32 class527_sub32_7_ = new Class527_Sub32();
						class527_sub32_7_.anInt10642 = 1632677851;
						class527_sub32_7_.aChar10640 = '\uffff';
						class527_sub32_7_.anInt10645 = 769063539 * i_6_;
						class527_sub32_7_.aLong10644 = 1L * class527_sub32.aLong10644;
						class527_sub32_7_.anInt10641 = 1 * class527_sub32.anInt10641;
						aClass694_10812.method14147(class527_sub32_7_, -346098420);
						aBoolArray10816[i_6_] = false;
					}
				}
			} else if (3 == class527_sub32.anInt10642 * -656165805)
				aClass694_10812.method14147(class527_sub32, -1637014575);
		}
	}

	int method16800(int i) {
		int i_8_ = 0;
		if (aBoolArray10816[81])
			i_8_ |= 0x1;
		if (aBoolArray10816[82])
			i_8_ |= 0x4;
		if (aBoolArray10816[86])
			i_8_ |= 0x2;
		return i_8_;
	}

	public void method9201(int i) {
		method16798(184302313);
	}

	void method16801(KeyEvent keyevent, int i, int i_9_) {
		int i_10_ = keyevent.getKeyCode();
		if (0 != i_10_) {
			if (i_10_ >= 0 && i_10_ < anIntArray10810.length) {
				i_10_ = anIntArray10810[i_10_];
				if (i == 0 && 0 != (i_10_ & 0x80))
					i_10_ = 0;
				else
					i_10_ &= ~0x80;
			} else
				i_10_ = 0;
		} else
			i_10_ = 0;
		if (i_10_ != 0) {
			method16799(i, '\uffff', i_10_, 1568743549);
			keyevent.consume();
		}
	}

	public synchronized void keyPressed(KeyEvent keyevent) {
		method16801(keyevent, 0, -1913206907);
	}

	public synchronized void keyReleased(KeyEvent keyevent) {
		method16801(keyevent, 1, -1526087545);
	}

	public boolean method9207(int i) {
		if (i < 0 || i >= 112)
			return false;
		return aBoolArray10816[i];
	}

	public void focusGained(FocusEvent focusevent) {
		/* empty */
	}

	public synchronized void focusLost(FocusEvent focusevent) {
		method16799(-1, '\0', 0, -1584260704);
	}

	void method16802() {
		if (aComponent10815 != null) {
			aComponent10815.removeKeyListener(this);
			aComponent10815.removeFocusListener(this);
			aComponent10815 = null;
			for (int i = 0; i < 112; i++)
				aBoolArray10816[i] = false;
			aClass694_10812.method14105((byte) 5);
			aClass694_10813.method14105((byte) 64);
		}
	}

	public void method16803(FocusEvent focusevent) {
		/* empty */
	}

	public void method16804(FocusEvent focusevent) {
		/* empty */
	}

	public synchronized void method16805(FocusEvent focusevent) {
		method16799(-1, '\0', 0, -1964063192);
	}

	public synchronized void method16806(FocusEvent focusevent) {
		method16799(-1, '\0', 0, 1367182883);
	}

	void method16807() {
		if (aComponent10815 != null) {
			aComponent10815.removeKeyListener(this);
			aComponent10815.removeFocusListener(this);
			aComponent10815 = null;
			for (int i = 0; i < 112; i++)
				aBoolArray10816[i] = false;
			aClass694_10812.method14105((byte) 122);
			aClass694_10813.method14105((byte) 14);
		}
	}

	static void method16808() {
		anIntArray10810[44] = 71;
		anIntArray10810[45] = 26;
		anIntArray10810[46] = 72;
		anIntArray10810[47] = 73;
		anIntArray10810[59] = 57;
		anIntArray10810[61] = 27;
		anIntArray10810[91] = 42;
		anIntArray10810[92] = 74;
		anIntArray10810[93] = 43;
		anIntArray10810[192] = 28;
		anIntArray10810[222] = 58;
		anIntArray10810[520] = 59;
	}

	public Interface64 method9203() {
		return (Interface64) aClass694_10812.method14077(-1216830710);
	}

	public synchronized void keyTyped(KeyEvent keyevent) {
		char c = keyevent.getKeyChar();
		if (c != '\uffff' && Class456.method7427(c, (byte) -95)) {
			method16799(3, c, -1, 697237450);
			keyevent.consume();
		}
	}

	static void method16809() {
		anIntArray10810[44] = 71;
		anIntArray10810[45] = 26;
		anIntArray10810[46] = 72;
		anIntArray10810[47] = 73;
		anIntArray10810[59] = 57;
		anIntArray10810[61] = 27;
		anIntArray10810[91] = 42;
		anIntArray10810[92] = 74;
		anIntArray10810[93] = 43;
		anIntArray10810[192] = 28;
		anIntArray10810[222] = 58;
		anIntArray10810[520] = 59;
	}

	void method16810(Component component, int i) {
		method16798(-645343880);
		aComponent10815 = component;
		aComponent10815.addKeyListener(this);
		aComponent10815.addFocusListener(this);
	}

	void method16811() {
		if (aComponent10815 != null) {
			aComponent10815.removeKeyListener(this);
			aComponent10815.removeFocusListener(this);
			aComponent10815 = null;
			for (int i = 0; i < 112; i++)
				aBoolArray10816[i] = false;
			aClass694_10812.method14105((byte) 51);
			aClass694_10813.method14105((byte) 1);
		}
	}

	void method16812() {
		if (aComponent10815 != null) {
			aComponent10815.removeKeyListener(this);
			aComponent10815.removeFocusListener(this);
			aComponent10815 = null;
			for (int i = 0; i < 112; i++)
				aBoolArray10816[i] = false;
			aClass694_10812.method14105((byte) 28);
			aClass694_10813.method14105((byte) 119);
		}
	}

	public synchronized void method16813(KeyEvent keyevent) {
		char c = keyevent.getKeyChar();
		if (c != '\uffff' && Class456.method7427(c, (byte) -36)) {
			method16799(3, c, -1, 599003379);
			keyevent.consume();
		}
	}

	static void method16814() {
		anIntArray10810[44] = 71;
		anIntArray10810[45] = 26;
		anIntArray10810[46] = 72;
		anIntArray10810[47] = 73;
		anIntArray10810[59] = 57;
		anIntArray10810[61] = 27;
		anIntArray10810[91] = 42;
		anIntArray10810[92] = 74;
		anIntArray10810[93] = 43;
		anIntArray10810[192] = 28;
		anIntArray10810[222] = 58;
		anIntArray10810[520] = 59;
	}

	void method16815(Component component) {
		method16798(9575332);
		aComponent10815 = component;
		aComponent10815.addKeyListener(this);
		aComponent10815.addFocusListener(this);
	}

	void method16816(int i, char c, int i_11_) {
		Class527_Sub32 class527_sub32 = new Class527_Sub32();
		class527_sub32.anInt10642 = i * 1632677851;
		class527_sub32.aChar10640 = c;
		class527_sub32.anInt10645 = 769063539 * i_11_;
		class527_sub32.aLong10644 = Class234.method4347(-1408626088) * 2087597669864614737L;
		aClass694_10813.method14147(class527_sub32, -1515526771);
	}

	public Interface64 method9202() {
		return (Interface64) aClass694_10812.method14077(-865908603);
	}

	public synchronized void method16817(KeyEvent keyevent) {
		method16801(keyevent, 1, -699315580);
	}

	public void method16818(FocusEvent focusevent) {
		/* empty */
	}

	public Interface64 method9205() {
		return (Interface64) aClass694_10812.method14077(-844571416);
	}

	public synchronized void method9206() {
		aClass694_10812.method14105((byte) 48);
		for (Class527_Sub32 class527_sub32 = (Class527_Sub32) aClass694_10813.method14077(-1963971067); class527_sub32 != null; class527_sub32 = (Class527_Sub32) aClass694_10813.method14077(-1896074005)) {
			class527_sub32.anInt10641 = method16800(-696400788) * 1882048927;
			if (class527_sub32.anInt10642 * -656165805 == 0) {
				if (!aBoolArray10816[1218656955 * class527_sub32.anInt10645]) {
					Class527_Sub32 class527_sub32_12_ = new Class527_Sub32();
					class527_sub32_12_.anInt10642 = 0;
					class527_sub32_12_.aChar10640 = '\uffff';
					class527_sub32_12_.anInt10645 = class527_sub32.anInt10645 * 1;
					class527_sub32_12_.aLong10644 = 1L * class527_sub32.aLong10644;
					class527_sub32_12_.anInt10641 = class527_sub32.anInt10641 * 1;
					aClass694_10812.method14147(class527_sub32_12_, -190547267);
					aBoolArray10816[class527_sub32.anInt10645 * 1218656955] = true;
				}
				class527_sub32.anInt10642 = -1029611594;
				aClass694_10812.method14147(class527_sub32, -1154370489);
			} else if (class527_sub32.anInt10642 * -656165805 == 1) {
				if (aBoolArray10816[class527_sub32.anInt10645 * 1218656955]) {
					aClass694_10812.method14147(class527_sub32, -1515419025);
					aBoolArray10816[1218656955 * class527_sub32.anInt10645] = false;
				}
			} else if (class527_sub32.anInt10642 * -656165805 == -1) {
				for (int i = 0; i < 112; i++) {
					if (aBoolArray10816[i]) {
						Class527_Sub32 class527_sub32_13_ = new Class527_Sub32();
						class527_sub32_13_.anInt10642 = 1632677851;
						class527_sub32_13_.aChar10640 = '\uffff';
						class527_sub32_13_.anInt10645 = 769063539 * i;
						class527_sub32_13_.aLong10644 = 1L * class527_sub32.aLong10644;
						class527_sub32_13_.anInt10641 = 1 * class527_sub32.anInt10641;
						aClass694_10812.method14147(class527_sub32_13_, -1875844656);
						aBoolArray10816[i] = false;
					}
				}
			} else if (3 == class527_sub32.anInt10642 * -656165805)
				aClass694_10812.method14147(class527_sub32, -671614092);
		}
	}

	public synchronized void method9208() {
		aClass694_10812.method14105((byte) 98);
		for (Class527_Sub32 class527_sub32 = (Class527_Sub32) aClass694_10813.method14077(-1790880049); class527_sub32 != null; class527_sub32 = (Class527_Sub32) aClass694_10813.method14077(-2114559812)) {
			class527_sub32.anInt10641 = method16800(-974180616) * 1882048927;
			if (class527_sub32.anInt10642 * -656165805 == 0) {
				if (!aBoolArray10816[1218656955 * class527_sub32.anInt10645]) {
					Class527_Sub32 class527_sub32_14_ = new Class527_Sub32();
					class527_sub32_14_.anInt10642 = 0;
					class527_sub32_14_.aChar10640 = '\uffff';
					class527_sub32_14_.anInt10645 = class527_sub32.anInt10645 * 1;
					class527_sub32_14_.aLong10644 = 1L * class527_sub32.aLong10644;
					class527_sub32_14_.anInt10641 = class527_sub32.anInt10641 * 1;
					aClass694_10812.method14147(class527_sub32_14_, -1215960571);
					aBoolArray10816[class527_sub32.anInt10645 * 1218656955] = true;
				}
				class527_sub32.anInt10642 = -1029611594;
				aClass694_10812.method14147(class527_sub32, -1893699900);
			} else if (class527_sub32.anInt10642 * -656165805 == 1) {
				if (aBoolArray10816[class527_sub32.anInt10645 * 1218656955]) {
					aClass694_10812.method14147(class527_sub32, -1612333174);
					aBoolArray10816[1218656955 * class527_sub32.anInt10645] = false;
				}
			} else if (class527_sub32.anInt10642 * -656165805 == -1) {
				for (int i = 0; i < 112; i++) {
					if (aBoolArray10816[i]) {
						Class527_Sub32 class527_sub32_15_ = new Class527_Sub32();
						class527_sub32_15_.anInt10642 = 1632677851;
						class527_sub32_15_.aChar10640 = '\uffff';
						class527_sub32_15_.anInt10645 = 769063539 * i;
						class527_sub32_15_.aLong10644 = 1L * class527_sub32.aLong10644;
						class527_sub32_15_.anInt10641 = 1 * class527_sub32.anInt10641;
						aClass694_10812.method14147(class527_sub32_15_, -1668935264);
						aBoolArray10816[i] = false;
					}
				}
			} else if (3 == class527_sub32.anInt10642 * -656165805)
				aClass694_10812.method14147(class527_sub32, -499925461);
		}
	}

	public synchronized void method9197() {
		aClass694_10812.method14105((byte) 50);
		for (Class527_Sub32 class527_sub32 = (Class527_Sub32) aClass694_10813.method14077(-1721440762); class527_sub32 != null; class527_sub32 = (Class527_Sub32) aClass694_10813.method14077(-1036493488)) {
			class527_sub32.anInt10641 = method16800(1259339406) * 1882048927;
			if (class527_sub32.anInt10642 * -656165805 == 0) {
				if (!aBoolArray10816[1218656955 * class527_sub32.anInt10645]) {
					Class527_Sub32 class527_sub32_16_ = new Class527_Sub32();
					class527_sub32_16_.anInt10642 = 0;
					class527_sub32_16_.aChar10640 = '\uffff';
					class527_sub32_16_.anInt10645 = class527_sub32.anInt10645 * 1;
					class527_sub32_16_.aLong10644 = 1L * class527_sub32.aLong10644;
					class527_sub32_16_.anInt10641 = class527_sub32.anInt10641 * 1;
					aClass694_10812.method14147(class527_sub32_16_, -1866958073);
					aBoolArray10816[class527_sub32.anInt10645 * 1218656955] = true;
				}
				class527_sub32.anInt10642 = -1029611594;
				aClass694_10812.method14147(class527_sub32, -1788690278);
			} else if (class527_sub32.anInt10642 * -656165805 == 1) {
				if (aBoolArray10816[class527_sub32.anInt10645 * 1218656955]) {
					aClass694_10812.method14147(class527_sub32, -1545830687);
					aBoolArray10816[1218656955 * class527_sub32.anInt10645] = false;
				}
			} else if (class527_sub32.anInt10642 * -656165805 == -1) {
				for (int i = 0; i < 112; i++) {
					if (aBoolArray10816[i]) {
						Class527_Sub32 class527_sub32_17_ = new Class527_Sub32();
						class527_sub32_17_.anInt10642 = 1632677851;
						class527_sub32_17_.aChar10640 = '\uffff';
						class527_sub32_17_.anInt10645 = 769063539 * i;
						class527_sub32_17_.aLong10644 = 1L * class527_sub32.aLong10644;
						class527_sub32_17_.anInt10641 = 1 * class527_sub32.anInt10641;
						aClass694_10812.method14147(class527_sub32_17_, -757056517);
						aBoolArray10816[i] = false;
					}
				}
			} else if (3 == class527_sub32.anInt10642 * -656165805)
				aClass694_10812.method14147(class527_sub32, -863922290);
		}
	}

	int method16819() {
		int i = 0;
		if (aBoolArray10816[81])
			i |= 0x1;
		if (aBoolArray10816[82])
			i |= 0x4;
		if (aBoolArray10816[86])
			i |= 0x2;
		return i;
	}

	int method16820() {
		int i = 0;
		if (aBoolArray10816[81])
			i |= 0x1;
		if (aBoolArray10816[82])
			i |= 0x4;
		if (aBoolArray10816[86])
			i |= 0x2;
		return i;
	}

	public Interface64 method9200(int i) {
		return (Interface64) aClass694_10812.method14077(-1881519946);
	}

	public void method9209() {
		method16798(-1156969244);
	}

	void method16821(KeyEvent keyevent, int i) {
		int i_18_ = keyevent.getKeyCode();
		if (0 != i_18_) {
			if (i_18_ >= 0 && i_18_ < anIntArray10810.length) {
				i_18_ = anIntArray10810[i_18_];
				if (i == 0 && 0 != (i_18_ & 0x80))
					i_18_ = 0;
				else
					i_18_ &= ~0x80;
			} else
				i_18_ = 0;
		} else
			i_18_ = 0;
		if (i_18_ != 0) {
			method16799(i, '\uffff', i_18_, -844967550);
			keyevent.consume();
		}
	}

	public synchronized void method16822(KeyEvent keyevent) {
		method16801(keyevent, 0, -717550021);
	}

	public synchronized void method16823(KeyEvent keyevent) {
		method16801(keyevent, 0, -1161032112);
	}

	public synchronized void method16824(KeyEvent keyevent) {
		method16801(keyevent, 1, -2135357100);
	}

	void method16825(int i, char c, int i_19_) {
		Class527_Sub32 class527_sub32 = new Class527_Sub32();
		class527_sub32.anInt10642 = i * 1632677851;
		class527_sub32.aChar10640 = c;
		class527_sub32.anInt10645 = 769063539 * i_19_;
		class527_sub32.aLong10644 = Class234.method4347(-1408626088) * 2087597669864614737L;
		aClass694_10813.method14147(class527_sub32, -1201756575);
	}

	void method16826(Component component) {
		method16798(885024060);
		aComponent10815 = component;
		aComponent10815.addKeyListener(this);
		aComponent10815.addFocusListener(this);
	}

	int method16827() {
		int i = 0;
		if (aBoolArray10816[81])
			i |= 0x1;
		if (aBoolArray10816[82])
			i |= 0x4;
		if (aBoolArray10816[86])
			i |= 0x2;
		return i;
	}

	public synchronized void method16828(KeyEvent keyevent) {
		char c = keyevent.getKeyChar();
		if (c != '\uffff' && Class456.method7427(c, (byte) -7)) {
			method16799(3, c, -1, -1206741634);
			keyevent.consume();
		}
	}

	Class554_Sub1(Component component) {
		Class420.method6713((byte) 107);
		method16810(component, -139379311);
	}

	static final void method16829(int i, int i_20_, int i_21_, int i_22_, byte i_23_) {
		for (int i_24_ = 0; i_24_ < client.anInt11260 * 195456631; i_24_++) {
			Rectangle rectangle = client.aRectangleArray11239[i_24_];
			if (rectangle.width + rectangle.x > i && rectangle.x < i_21_ + i && rectangle.y + rectangle.height > i_20_ && rectangle.y < i_20_ + i_22_)
				client.aBoolArray11310[i_24_] = true;
		}
	}
}
