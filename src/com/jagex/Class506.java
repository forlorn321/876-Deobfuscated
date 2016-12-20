/* Class506 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.LinkedList;

public class Class506 implements Runnable {
	LinkedList aLinkedList6914;
	Class509 aClass509_6915;
	volatile boolean aBool6916 = false;

	public void method8227() {
		for (;;)
			method8233(-919242766);
	}

	public void method8228(Class24_Sub6 class24_sub6, byte i) {
		aClass509_6915.method8301(class24_sub6, -730230549);
	}

	public boolean method8229() {
		return aBool6916;
	}

	public void method8230(Class24_Sub6 class24_sub6) {
		aClass509_6915.method8301(class24_sub6, -730230549);
	}

	public Class509 method8231(int i) {
		return aClass509_6915;
	}

	void method8232(Class509 class509, int i) {
		aClass509_6915 = class509;
	}

	public void run() {
		for (;;)
			method8233(-1843261742);
	}

	void method8233(int i) {
		Object object = null;
		Class514 class514;
		synchronized (aLinkedList6914) {
			try {
				aLinkedList6914.wait();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			class514 = (Class514) aLinkedList6914.pollFirst();
		}
		do {
			try {
				try {
					if (class514 != null) {
						aBool6916 = true;
						method8234(class514, 208369826);
					}
				} catch (Exception exception) {
					aBool6916 = false;
					break;
				}
				aBool6916 = false;
			} catch (Exception object_0_) {
				aBool6916 = false;
				throw object_0_;
			}
		} while (false);
	}

	void method8234(Class514 class514, int i) {
		if (class514.aClass503_7010 == Class503.aClass503_6881)
			aClass509_6915.method8361(-428559959);
		else
			aClass509_6915.method8280(class514, -1075450570);
		for (boolean bool = aClass509_6915.method8320(-1236954550); !bool; bool = aClass509_6915.method8320(-571612728)) {
			/* empty */
		}
		aClass509_6915.method8304(-1919290647);
		client.aClass509_11072.method8304(390576139);
	}

	public boolean method8235(int i) {
		return aBool6916;
	}

	public void method8236() {
		for (;;)
			method8233(-1587061756);
	}

	public Class506() {
		aLinkedList6914 = new LinkedList();
		aClass509_6915 = new Class509(true);
	}

	public void method8237(Class514 class514) {
		synchronized (aLinkedList6914) {
			aLinkedList6914.add(class514);
			aLinkedList6914.notify();
		}
	}

	public void method8238(Class514 class514) {
		synchronized (aLinkedList6914) {
			aLinkedList6914.add(class514);
			aLinkedList6914.notify();
		}
	}

	public void method8239(Class514 class514, byte i) {
		synchronized (aLinkedList6914) {
			aLinkedList6914.add(class514);
			aLinkedList6914.notify();
		}
	}

	public boolean method8240() {
		return aBool6916;
	}

	public Class509 method8241() {
		return aClass509_6915;
	}

	public Class509 method8242() {
		return aClass509_6915;
	}

	void method8243(Class509 class509) {
		aClass509_6915 = class509;
	}

	static final void method8244(Class665 class665, int i) {
		class665.anInt8526 -= 511904205;
	}

	static final void method8245(Class665 class665, byte i) {
		if (Class707.aBool8841 && null != Class56.aFrame711)
			Class188.method3663(Class204.aClass527_Sub31_2213.aClass700_Sub2_10596.method16853((byte) -55), -1, -1, false, (byte) -5);
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		boolean bool = ((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) == 1);
		String string_1_ = new StringBuilder().append(Class587.method9807(1887327313)).append(string).toString();
		Class183.method3558(string_1_, bool, client.aBool11193, 1488380075);
	}

	static final void method8246(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -1176934951 * Class515.anInt7014;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class515.anInt7014 * -1176934951;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 1;
	}
}
