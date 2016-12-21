/* Class550_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class550_Sub1 extends Class550 implements MouseListener, MouseMotionListener, MouseWheelListener {
	Class708 aClass708_10604;
	static final int anInt10605 = 1;
	static final int anInt10606 = 4;
	int anInt10607;
	int anInt10608;
	int anInt10609;
	Class708 aClass708_10610 = new Class708();
	int anInt10611;
	int anInt10612;
	int anInt10613;
	static final int anInt10614 = 2;
	Component aComponent10615;
	boolean aBool10616;
	public static Class461 aClass461_10617;
	static String[] aStringArray10618;

	Class550_Sub1(Component component, boolean bool) {
		aClass708_10604 = new Class708();
		method9808(component, (byte) 0);
		aBool10616 = bool;
	}

	void method9808(Component component, byte i) {
		method9809(-1682934933);
		aComponent10615 = component;
		aComponent10615.addMouseListener(this);
		aComponent10615.addMouseMotionListener(this);
		aComponent10615.addMouseWheelListener(this);
	}

	void method9809(int i) {
		if (null != aComponent10615) {
			aComponent10615.removeMouseWheelListener(this);
			aComponent10615.removeMouseMotionListener(this);
			aComponent10615.removeMouseListener(this);
			aComponent10615 = null;
			anInt10609 = 0;
			anInt10608 = 0;
			anInt10607 = 0;
			anInt10613 = 0;
			anInt10612 = 0;
			anInt10611 = 0;
			aClass708_10610 = null;
			aClass708_10604 = null;
		}
	}

	void method9810(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		Class536_Sub31_Sub1 class536_sub31_sub1 = Class594.method7129(i, i_0_, i_1_, Class249.method3450(1444662370), i_2_, 1868843835);
		aClass708_10604.method8335(class536_sub31_sub1, -1329778480);
	}

	void method9811(int i, int i_4_, int i_5_) {
		anInt10611 = i * 962825373;
		anInt10612 = i_4_ * -1677169959;
		if (aBool10616)
			method9810(-1, i, i_4_, 0, -30037684);
	}

	public synchronized void mousePressed(MouseEvent mouseevent) {
		int i = method9813(mouseevent, (byte) -37);
		if (i == 1)
			method9810(0, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -30037684);
		else if (4 == i)
			method9810(2, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -30037684);
		else if (i == 2)
			method9810(1, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -30037684);
		anInt10613 = (anInt10613 * -428931327 | i) * -725485311;
		if (mouseevent.isPopupTrigger())
			mouseevent.consume();
	}

	public void method6667() {
		method9809(-2071010907);
	}

	public boolean method6652(int i) {
		return 0 != (anInt10609 * -764732147 & 0x1);
	}

	public synchronized void method6651(int i) {
		anInt10607 = 731928249 * anInt10611;
		anInt10608 = anInt10612 * 1907473763;
		anInt10609 = anInt10613 * 529882309;
		Class708 class708 = aClass708_10610;
		aClass708_10610 = aClass708_10604;
		aClass708_10604 = class708;
		aClass708_10604.method8304(454036827);
	}

	public boolean method6664(byte i) {
		return 0 != (-764732147 * anInt10609 & 0x4);
	}

	public int method6656(int i) {
		return anInt10607 * 313679069;
	}

	public int method6657(int i) {
		return -1447628349 * anInt10608;
	}

	public void method6654(byte i) {
		method9809(-1739599044);
	}

	public synchronized void mouseClicked(MouseEvent mouseevent) {
		if (mouseevent.isPopupTrigger())
			mouseevent.consume();
	}

	public synchronized void mouseReleased(MouseEvent mouseevent) {
		int i = method9813(mouseevent, (byte) 41);
		if ((-428931327 * anInt10613 & i) == 0)
			i = -428931327 * anInt10613;
		if (0 != (i & 0x1))
			method9810(3, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -30037684);
		if ((i & 0x4) != 0)
			method9810(5, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -30037684);
		if (0 != (i & 0x2))
			method9810(4, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -30037684);
		anInt10613 = -725485311 * (anInt10613 * -428931327 & (i ^ 0xffffffff));
		if (mouseevent.isPopupTrigger())
			mouseevent.consume();
	}

	public synchronized void mouseExited(MouseEvent mouseevent) {
		method9811(mouseevent.getX(), mouseevent.getY(), 938403431);
	}

	public int method6679() {
		return anInt10607 * 313679069;
	}

	void method9812() {
		if (null != aComponent10615) {
			aComponent10615.removeMouseWheelListener(this);
			aComponent10615.removeMouseMotionListener(this);
			aComponent10615.removeMouseListener(this);
			aComponent10615 = null;
			anInt10609 = 0;
			anInt10608 = 0;
			anInt10607 = 0;
			anInt10613 = 0;
			anInt10612 = 0;
			anInt10611 = 0;
			aClass708_10610 = null;
			aClass708_10604 = null;
		}
	}

	public int method6674() {
		return -1447628349 * anInt10608;
	}

	public synchronized void mouseDragged(MouseEvent mouseevent) {
		method9811(mouseevent.getX(), mouseevent.getY(), -1869794077);
	}

	public synchronized void mouseMoved(MouseEvent mouseevent) {
		method9811(mouseevent.getX(), mouseevent.getY(), 817518169);
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
		int i = mousewheelevent.getX();
		int i_6_ = mousewheelevent.getY();
		int i_7_ = mousewheelevent.getWheelRotation();
		method9810(6, i, i_6_, i_7_, -30037684);
		mousewheelevent.consume();
	}

	public boolean method6672() {
		return (anInt10609 * -764732147 & 0x2) != 0;
	}

	public boolean method6673() {
		return 0 != (anInt10609 * -764732147 & 0x1);
	}

	public synchronized void mouseEntered(MouseEvent mouseevent) {
		method9811(mouseevent.getX(), mouseevent.getY(), -653653466);
	}

	public boolean method6666() {
		return (anInt10609 * -764732147 & 0x2) != 0;
	}

	int method9813(MouseEvent mouseevent, byte i) {
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

	public boolean method6665() {
		return 0 != (anInt10609 * -764732147 & 0x1);
	}

	public boolean method6669() {
		return 0 != (-764732147 * anInt10609 & 0x4);
	}

	public boolean method6653(byte i) {
		return (anInt10609 * -764732147 & 0x2) != 0;
	}

	public int method6670() {
		return -1447628349 * anInt10608;
	}

	public boolean method6668() {
		return (anInt10609 * -764732147 & 0x2) != 0;
	}

	public int method6678() {
		return anInt10607 * 313679069;
	}

	void method9814(int i, int i_8_) {
		anInt10611 = i * 962825373;
		anInt10612 = i_8_ * -1677169959;
		if (aBool10616)
			method9810(-1, i, i_8_, 0, -30037684);
	}

	public Class536_Sub31 method6677() {
		return (Class536_Sub31) aClass708_10610.method8305(1300333807);
	}

	public Class536_Sub31 method6659(byte i) {
		return (Class536_Sub31) aClass708_10610.method8305(1593362436);
	}

	public synchronized void method6663() {
		anInt10607 = 731928249 * anInt10611;
		anInt10608 = anInt10612 * 1907473763;
		anInt10609 = anInt10613 * 529882309;
		Class708 class708 = aClass708_10610;
		aClass708_10610 = aClass708_10604;
		aClass708_10604 = class708;
		aClass708_10604.method8304(454036827);
	}

	public int method6680() {
		return anInt10607 * 313679069;
	}

	static void method9815(int i) {
		try {
			File file = new File(Class189.aString2145, "random.dat");
			if (file.exists())
				Class505.aClass18_6878 = new Class18(new Class6(file, "rw", 25L), 24, 0);
			else {
				while_66_: for (int i_9_ = 0; i_9_ < Class248.aStringArray2526.length; i_9_++) {
					for (int i_10_ = 0; i_10_ < Class107.aStringArray1322.length; i_10_++) {
						File file_11_ = new File(new StringBuilder().append(Class107.aStringArray1322[i_10_]).append(Class248.aStringArray2526[i_9_]).append(File.separatorChar).append("random.dat").toString());
						if (file_11_.exists()) {
							Class505.aClass18_6878 = new Class18(new Class6(file_11_, "rw", 25L), 24, 0);
							break while_66_;
						}
					}
				}
			}
			if (Class505.aClass18_6878 == null) {
				RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
				int i_12_ = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i_12_);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				Class505.aClass18_6878 = new Class18(new Class6(file, "rw", 25L), 24, 0);
			}
		} catch (IOException ioexception) {
			/* empty */
		}
	}
}
