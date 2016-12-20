/* Class553_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class553_Sub1 extends Class553 implements MouseListener, MouseMotionListener, MouseWheelListener {
	int anInt10797;
	static final int anInt10798 = 2;
	static final int anInt10799 = 4;
	Component aComponent10800;
	int anInt10801;
	int anInt10802;
	Class694 aClass694_10803 = new Class694();
	int anInt10804;
	int anInt10805;
	int anInt10806;
	Class694 aClass694_10807 = new Class694();
	static final int anInt10808 = 1;
	boolean aBool10809;

	public boolean method9175() {
		return 0 != (anInt10797 * 2014676093 & 0x2);
	}

	void method16776(Component component, int i) {
		method16777(19691302);
		aComponent10800 = component;
		aComponent10800.addMouseListener(this);
		aComponent10800.addMouseMotionListener(this);
		aComponent10800.addMouseWheelListener(this);
	}

	void method16777(int i) {
		if (null != aComponent10800) {
			aComponent10800.removeMouseWheelListener(this);
			aComponent10800.removeMouseMotionListener(this);
			aComponent10800.removeMouseListener(this);
			aComponent10800 = null;
			anInt10797 = 0;
			anInt10806 = 0;
			anInt10801 = 0;
			anInt10802 = 0;
			anInt10805 = 0;
			anInt10804 = 0;
			aClass694_10803 = null;
			aClass694_10807 = null;
		}
	}

	void method16778(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		Class527_Sub34_Sub2 class527_sub34_sub2 = Class71.method1494(i, i_0_, i_1_, Class234.method4347(-1408626088), i_2_, (byte) 28);
		aClass694_10807.method14147(class527_sub34_sub2, -1259844182);
	}

	public void method9186() {
		method16777(-1334229545);
	}

	public void method9161(int i) {
		method16777(223260159);
	}

	public synchronized void method9162(int i) {
		anInt10801 = 584557657 * anInt10804;
		anInt10806 = 656048635 * anInt10805;
		anInt10797 = anInt10802 * -324595431;
		Class694 class694 = aClass694_10803;
		aClass694_10803 = aClass694_10807;
		aClass694_10807 = class694;
		aClass694_10807.method14105((byte) 43);
	}

	void method16779(int i, int i_4_, int i_5_, int i_6_) {
		Class527_Sub34_Sub2 class527_sub34_sub2 = Class71.method1494(i, i_4_, i_5_, Class234.method4347(-1408626088), i_6_, (byte) -76);
		aClass694_10807.method14147(class527_sub34_sub2, -1178290939);
	}

	public boolean method9174() {
		return 0 != (anInt10797 * 2014676093 & 0x2);
	}

	public boolean method9172(byte i) {
		return 0 != (2014676093 * anInt10797 & 0x4);
	}

	public int method9158(int i) {
		return anInt10801 * -365677825;
	}

	public synchronized void method9170() {
		anInt10801 = 584557657 * anInt10804;
		anInt10806 = 656048635 * anInt10805;
		anInt10797 = anInt10802 * -324595431;
		Class694 class694 = aClass694_10803;
		aClass694_10803 = aClass694_10807;
		aClass694_10807 = class694;
		aClass694_10807.method14105((byte) 22);
	}

	public int method9169() {
		return -1284344145 * anInt10806;
	}

	public synchronized void mouseClicked(MouseEvent mouseevent) {
		if (mouseevent.isPopupTrigger())
			mouseevent.consume();
	}

	Class553_Sub1(Component component, boolean bool) {
		method16776(component, 1133095296);
		aBool10809 = bool;
	}

	public int method9159(int i) {
		return -1284344145 * anInt10806;
	}

	public boolean method9165(byte i) {
		return 0 != (anInt10797 * 2014676093 & 0x1);
	}

	public synchronized void mousePressed(MouseEvent mouseevent) {
		int i = method16780(mouseevent, (short) -9550);
		if (i == 1)
			method16778(0, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), 44791937);
		else if (i == 4)
			method16778(2, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), 44791937);
		else if (i == 2)
			method16778(1, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), 44791937);
		anInt10802 = (anInt10802 * -781107915 | i) * 414903581;
		if (mouseevent.isPopupTrigger())
			mouseevent.consume();
	}

	public synchronized void mouseReleased(MouseEvent mouseevent) {
		int i = method16780(mouseevent, (short) -5638);
		if (0 == (-781107915 * anInt10802 & i))
			i = -781107915 * anInt10802;
		if (0 != (i & 0x1))
			method16778(3, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), 44791937);
		if ((i & 0x4) != 0)
			method16778(5, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), 44791937);
		if ((i & 0x2) != 0)
			method16778(4, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), 44791937);
		anInt10802 = 414903581 * (anInt10802 * -781107915 & (i ^ 0xffffffff));
		if (mouseevent.isPopupTrigger())
			mouseevent.consume();
	}

	public synchronized void mouseDragged(MouseEvent mouseevent) {
		method16787(mouseevent.getX(), mouseevent.getY(), (byte) -3);
	}

	public synchronized void mouseMoved(MouseEvent mouseevent) {
		method16787(mouseevent.getX(), mouseevent.getY(), (byte) -101);
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
		int i = mousewheelevent.getX();
		int i_7_ = mousewheelevent.getY();
		int i_8_ = mousewheelevent.getWheelRotation();
		method16778(6, i, i_7_, i_8_, 44791937);
		mousewheelevent.consume();
	}

	public synchronized void method9160() {
		anInt10801 = 584557657 * anInt10804;
		anInt10806 = 656048635 * anInt10805;
		anInt10797 = anInt10802 * -324595431;
		Class694 class694 = aClass694_10803;
		aClass694_10803 = aClass694_10807;
		aClass694_10807 = class694;
		aClass694_10807.method14105((byte) 104);
	}

	public synchronized void method9152() {
		anInt10801 = 584557657 * anInt10804;
		anInt10806 = 656048635 * anInt10805;
		anInt10797 = anInt10802 * -324595431;
		Class694 class694 = aClass694_10803;
		aClass694_10803 = aClass694_10807;
		aClass694_10807 = class694;
		aClass694_10807.method14105((byte) 122);
	}

	public synchronized void mouseEntered(MouseEvent mouseevent) {
		method16787(mouseevent.getX(), mouseevent.getY(), (byte) -30);
	}

	public void method9188() {
		method16777(97721994);
	}

	public boolean method9157() {
		return 0 != (anInt10797 * 2014676093 & 0x1);
	}

	public boolean method9173() {
		return 0 != (anInt10797 * 2014676093 & 0x2);
	}

	int method16780(MouseEvent mouseevent, short i) {
		if (mouseevent.getButton() == 1) {
			if (mouseevent.isMetaDown())
				return 4;
			return 1;
		}
		if (mouseevent.getButton() == 2)
			return 2;
		if (mouseevent.getButton() == 3)
			return 4;
		return 0;
	}

	public void method9154() {
		method16777(-469911373);
	}

	public int method9178() {
		return anInt10801 * -365677825;
	}

	public int method9179() {
		return -1284344145 * anInt10806;
	}

	public int method9180() {
		return -1284344145 * anInt10806;
	}

	void method16781(int i, int i_9_) {
		anInt10804 = 629027095 * i;
		anInt10805 = i_9_ * -2030707011;
		if (aBool10809)
			method16778(-1, i, i_9_, 0, 44791937);
	}

	public Class527_Sub34 method9182() {
		return (Class527_Sub34) aClass694_10803.method14077(-1811253172);
	}

	public Class527_Sub34 method9183() {
		return (Class527_Sub34) aClass694_10803.method14077(-980200695);
	}

	public void method9184() {
		method16777(-1259257660);
	}

	public synchronized void mouseExited(MouseEvent mouseevent) {
		method16787(mouseevent.getX(), mouseevent.getY(), (byte) -35);
	}

	public boolean method9171() {
		return 0 != (anInt10797 * 2014676093 & 0x1);
	}

	int method16782(MouseEvent mouseevent) {
		if (mouseevent.getButton() == 1) {
			if (mouseevent.isMetaDown())
				return 4;
			return 1;
		}
		if (mouseevent.getButton() == 2)
			return 2;
		if (mouseevent.getButton() == 3)
			return 4;
		return 0;
	}

	public Class527_Sub34 method9168(int i) {
		return (Class527_Sub34) aClass694_10803.method14077(-1412688736);
	}

	void method16783(Component component) {
		method16777(-360090984);
		aComponent10800 = component;
		aComponent10800.addMouseListener(this);
		aComponent10800.addMouseMotionListener(this);
		aComponent10800.addMouseWheelListener(this);
	}

	void method16784(Component component) {
		method16777(-796677612);
		aComponent10800 = component;
		aComponent10800.addMouseListener(this);
		aComponent10800.addMouseMotionListener(this);
		aComponent10800.addMouseWheelListener(this);
	}

	void method16785(Component component) {
		method16777(2145715542);
		aComponent10800 = component;
		aComponent10800.addMouseListener(this);
		aComponent10800.addMouseMotionListener(this);
		aComponent10800.addMouseWheelListener(this);
	}

	void method16786() {
		if (null != aComponent10800) {
			aComponent10800.removeMouseWheelListener(this);
			aComponent10800.removeMouseMotionListener(this);
			aComponent10800.removeMouseListener(this);
			aComponent10800 = null;
			anInt10797 = 0;
			anInt10806 = 0;
			anInt10801 = 0;
			anInt10802 = 0;
			anInt10805 = 0;
			anInt10804 = 0;
			aClass694_10803 = null;
			aClass694_10807 = null;
		}
	}

	void method16787(int i, int i_10_, byte i_11_) {
		anInt10804 = 629027095 * i;
		anInt10805 = i_10_ * -2030707011;
		if (aBool10809)
			method16778(-1, i, i_10_, 0, 44791937);
	}

	void method16788(int i, int i_12_) {
		anInt10804 = 629027095 * i;
		anInt10805 = i_12_ * -2030707011;
		if (aBool10809)
			method16778(-1, i, i_12_, 0, 44791937);
	}

	public boolean method9155(int i) {
		return 0 != (anInt10797 * 2014676093 & 0x2);
	}

	void method16789(int i, int i_13_) {
		anInt10804 = 629027095 * i;
		anInt10805 = i_13_ * -2030707011;
		if (aBool10809)
			method16778(-1, i, i_13_, 0, 44791937);
	}

	public boolean method9189() {
		return 0 != (2014676093 * anInt10797 & 0x4);
	}

	public void method9185() {
		method16777(304657768);
	}

	static final void method16790(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class665.aClass527_Sub21_8537.aByte10489;
	}

	static final void method16791(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -124591531 * class243.anInt2546;
	}

	static final void method16792(int i) {
		Class238.method4373(Class402.aClass180_4150, 465417520);
		if (Class673.anInt8585 * 162317215 != -1887216025 * client.anInt11319)
			Class639_Sub1.method16871((byte) 32);
	}

	static final void method16793(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (1 == -1260029751 * class243.anInt2541 ? class243.anInt2542 * 1538136819 : -1);
	}
}
