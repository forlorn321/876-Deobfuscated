/* Class242 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.util.Iterator;

class Class242 implements Iterator {
	Class98_Sub1_Sub1 this$0;
	int anInt2457;

	public void method3389() {
		throw new UnsupportedOperationException();
	}

	Class242(Class98_Sub1_Sub1 class98_sub1_sub1) {
		this$0 = class98_sub1_sub1;
	}

	public boolean method3390() {
		return 950358283 * anInt2457 < this$0.method71(2111952649);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean method3391() {
		return 950358283 * anInt2457 < this$0.method71(1639943301);
	}

	public boolean hasNext() {
		return 950358283 * anInt2457 < this$0.method71(1906375672);
	}

	public Object method3392() {
		int i = (anInt2457 += 1057223331) * 950358283 - 1;
		Class153_Sub1 class153_sub1 = (Class153_Sub1) this$0.aClass199_11324.method2886((long) i);
		if (class153_sub1 != null)
			return class153_sub1;
		return this$0.method10462(i, (byte) 14);
	}

	public Object method3393() {
		int i = (anInt2457 += 1057223331) * 950358283 - 1;
		Class153_Sub1 class153_sub1 = (Class153_Sub1) this$0.aClass199_11324.method2886((long) i);
		if (class153_sub1 != null)
			return class153_sub1;
		return this$0.method10462(i, (byte) 14);
	}

	public Object next() {
		int i = (anInt2457 += 1057223331) * 950358283 - 1;
		Class153_Sub1 class153_sub1 = (Class153_Sub1) this$0.aClass199_11324.method2886((long) i);
		if (class153_sub1 != null)
			return class153_sub1;
		return this$0.method10462(i, (byte) 14);
	}

	static final void method3394(Class668 class668, int i) {
		Class275.method3737(false, -1572806093);
	}

	static final int method3395(Class74 class74, byte i) {
		if (null == class74)
			return 12;
		switch (-886768489 * class74.anInt806) {
		case 6:
			return 20;
		default:
			return 12;
		}
	}

	static void method3397(String string, String string_483_, String string_484_, boolean bool, boolean bool_485_, int i) {
		Class106 class106 = Class536_Sub41.method9871(2077853800);
		if (class106.method1413((short) 11684) != null) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4504, class106.aClass15_1258, 2123327853);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeShort((Class555.method6802(string, 224779434) + Class555.method6802(string_483_, 287243558) + Class555.method6802(string_484_, -759942065) + 1), -1778059594);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string_483_);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string_484_);
			int i_486_ = 0;
			if (bool)
				i_486_ |= 0x1;
			if (bool_485_)
				i_486_ |= 0x2;
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(i_486_);
			class106.method1409(class536_sub23, 895809939);
		}
	}

	static final void method3398(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class542.anInt7185 + Class552.anInt7416 * 804924017;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class542.anInt7186 + 2122662073 * Class391.anInt4063;
	}
}
