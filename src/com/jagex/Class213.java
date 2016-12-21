/* Class213 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class Class213 {
	int anInt2295 = -488725477;
	Interface28 anInterface28_2296;
	long aLong2297;
	LinkedList aLinkedList2298 = new LinkedList();

	public void method3070(Class226 class226, int i) {
		if ((4715971104369784683L * aLong2297 != class226.aLong2349 * 7724426318237330575L) || class226.method3257((byte) 39) != anInt2295 * 2129226221)
			throw new IllegalStateException("");
		Iterator iterator = aLinkedList2298.iterator();
		while (iterator.hasNext()) {
			Interface27 interface27 = (Interface27) iterator.next();
			interface27.method154(class226, (short) -30805);
		}
		class226.method3221(-312900595);
	}

	public void method3071(Class226 class226) {
		if ((4715971104369784683L * aLong2297 != class226.aLong2349 * 7724426318237330575L) || class226.method3257((byte) 41) != anInt2295 * 2129226221)
			throw new IllegalStateException("");
		Iterator iterator = aLinkedList2298.iterator();
		while (iterator.hasNext()) {
			Interface27 interface27 = (Interface27) iterator.next();
			interface27.method154(class226, (short) -4202);
		}
		class226.method3221(-312900595);
	}

	public void method3072(Class226 class226) {
		if ((4715971104369784683L * aLong2297 != class226.aLong2349 * 7724426318237330575L) || class226.method3257((byte) 18) != anInt2295 * 2129226221)
			throw new IllegalStateException("");
		Iterator iterator = aLinkedList2298.iterator();
		while (iterator.hasNext()) {
			Interface27 interface27 = (Interface27) iterator.next();
			interface27.method154(class226, (short) -2266);
		}
		class226.method3221(-312900595);
	}

	public Class213(RSByteBuffer class536_sub33, Interface28 interface28) {
		anInterface28_2296 = interface28;
		aLong2297 = class536_sub33.method9711(702869087) * -775646023304102589L;
		anInt2295 = class536_sub33.readInt() * 488725477;
		for (int i = class536_sub33.readUnsignedByte(); 0 != i; i = class536_sub33.readUnsignedByte()) {
			Class237 class237 = ((Class237) Class682.method8091(Class237.method3352(1555544768), i, 1858049507));
			Interface27 interface27;
			switch (class237.anInt2420 * -783149299) {
			case 3:
				interface27 = new Class214(this, class536_sub33);
				break;
			case 5:
				interface27 = new Class219(this, class536_sub33);
				break;
			case 10:
				interface27 = new Class218(this);
				break;
			case 0:
				interface27 = new Class227(this, class536_sub33);
				break;
			case 12:
				interface27 = new Class221(this, class536_sub33);
				break;
			case 13:
				interface27 = new Class241(this, class536_sub33);
				break;
			case 9:
				interface27 = new Class254(this);
				break;
			case 2:
				interface27 = new Class232(this, class536_sub33);
				break;
			case 8:
				interface27 = new Class225(this, class536_sub33);
				break;
			case 11:
				interface27 = new Class230(this, class536_sub33);
				break;
			case 7:
				interface27 = new Class250(this, class536_sub33);
				break;
			case 6:
				interface27 = new Class257(this, class536_sub33);
				break;
			default:
				throw new IllegalStateException("");
			case 4:
				interface27 = new Class229(this, class536_sub33);
				break;
			case 1:
				interface27 = new Class212(this, class536_sub33);
			}
			aLinkedList2298.add(interface27);
		}
	}

	static final void method3073(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class486.method5858((byte) -8).method78();
	}

	static final void method3074(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class61.anInt693 * -12109375;
	}

	public static Class536_Sub23 method3075(OutgoingPacket class414, Class15 class15, int i) {
		Class536_Sub23 class536_sub23 = Class144.method1795(-2057897875);
		class536_sub23.aClass414_10529 = class414;
		class536_sub23.anInt10527 = 1504910693 * class414.anInt4526;
		if (-1 == class536_sub23.anInt10527 * 1105927695)
			class536_sub23.aClass536_Sub33_Sub2_10528 = new Class536_Sub33_Sub2(260);
		else if (class536_sub23.anInt10527 * 1105927695 == -2)
			class536_sub23.aClass536_Sub33_Sub2_10528 = new Class536_Sub33_Sub2(10000);
		else if (1105927695 * class536_sub23.anInt10527 <= 18)
			class536_sub23.aClass536_Sub33_Sub2_10528 = new Class536_Sub33_Sub2(20);
		else if (1105927695 * class536_sub23.anInt10527 <= 98)
			class536_sub23.aClass536_Sub33_Sub2_10528 = new Class536_Sub33_Sub2(100);
		else
			class536_sub23.aClass536_Sub33_Sub2_10528 = new Class536_Sub33_Sub2(260);
		class536_sub23.aClass536_Sub33_Sub2_10528.method10782(class15, -2019890215);
		class536_sub23.aClass536_Sub33_Sub2_10528.method10783(class536_sub23.aClass414_10529.anInt4525 * -150166127, (byte) 0);
		class536_sub23.anInt10530 = 0;
		return class536_sub23;
	}

	static final void method3076(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = Class264.method3680(i_0_, -1703238370);
	}
}
