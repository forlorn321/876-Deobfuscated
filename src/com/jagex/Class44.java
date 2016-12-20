/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.net.InetAddress;
import java.net.UnknownHostException;

import jaclib.ping.Ping;

public class Class44 implements Runnable {
	volatile boolean aBool459;
	InetAddress anInetAddress460;
	volatile long aLong461 = -3626096020910676821L;
	String aString462;

	void method1184(int i) {
		aBool459 = false;
	}

	Class44() {
		aBool459 = true;
	}

	long method1185(int i) {
		return aLong461 * 8461617102714341885L;
	}

	void method1186(String string, byte i) {
		aString462 = string;
		anInetAddress460 = null;
		aLong461 = -3626096020910676821L;
		if (aString462 != null) {
			try {
				anInetAddress460 = InetAddress.getByName(aString462);
			} catch (UnknownHostException unknownhostexception) {
				/* empty */
			}
		}
	}

	public void run() {
		while (aBool459)
			method1187(-1775554363);
	}

	void method1187(int i) {
		if (anInetAddress460 != null) {
			try {
				byte[] is = anInetAddress460.getAddress();
				aLong461 = (long) Ping.method670(is[0], is[1], is[2], is[3], 10000L) * 3626096020910676821L;
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		Class518.method8635(1000L);
	}

	void method1188() {
		aBool459 = false;
	}

	void method1189() {
		aBool459 = false;
	}

	void method1190() {
		if (anInetAddress460 != null) {
			try {
				byte[] is = anInetAddress460.getAddress();
				aLong461 = (long) Ping.method670(is[0], is[1], is[2], is[3], 10000L) * 3626096020910676821L;
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		Class518.method8635(1000L);
	}

	public void method1191() {
		while (aBool459)
			method1187(-1775554363);
	}

	public void method1192() {
		while (aBool459)
			method1187(-1775554363);
	}

	static void method1193(short i) {
		Class107.aBool1341 = false;
		Class107.anIntArray1334 = null;
		Class107.anIntArray1333 = null;
		Class107.anIntArray1340 = null;
		Class697.anIntArray8760 = null;
		Class289.method5226(-2074389036);
	}

	static final void method1194(Class665 class665, int i) {
		Class527_Sub8_Sub7 class527_sub8_sub7 = Class620.method10226(2082978901);
		if (Class43.method1182(class527_sub8_sub7, (byte) -35) == 4) {
			Class527_Sub26 class527_sub26 = ((Class527_Sub26) client.aClass14_10989.method709(class527_sub8_sub7.method18177(-406426733)));
			if (class527_sub26 != null) {
				class665.aClass640_Sub1_Sub2_Sub1_8522 = (Class640_Sub1_Sub2_Sub1) class527_sub26.anObject10522;
				class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1;
				return;
			}
		}
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}
}
