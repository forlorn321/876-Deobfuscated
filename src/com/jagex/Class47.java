/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.net.Socket;

import com.RS3Applet;

public abstract class Class47 {
	String aString576;
	int anInt577;
	public static Class678 aClass678_578;

	Socket method908(int i) throws IOException {
		if (RS3Applet.RSPS) {
			return new Socket(RS3Applet.Host, 43594);
		}
		return new Socket(aString576, -657305375 * anInt577);
	}

	public abstract Socket method909(int i) throws IOException;

	public abstract Socket method910() throws IOException;

	Class47() {
		/* empty */
	}

	public static void method912(Class649_Sub1_Sub5_Sub1_Sub2 class649_sub1_sub5_sub1_sub2, short i) {
		Class536_Sub3 class536_sub3 = (Class536_Sub3) (Class536_Sub3.aClass4_10366.method556((long) (class649_sub1_sub5_sub1_sub2.anInt11889 * 1710020215)));
		if (null != class536_sub3) {
			if (class536_sub3.aClass479_10389 != null) {
				class536_sub3.aClass479_10389.method5774(100, (byte) 32);
				Class184_Sub2.aClass211_9442.method3002(class536_sub3.aClass479_10389, -1092963117);
				class536_sub3.aClass479_10389 = null;
			}
			class536_sub3.method6484(-1334550304);
		}
	}

	static final void method913(Class668 class668, int i) {
		Class710.aClass536_Sub40_8843.method9857(Class710.aClass536_Sub40_8843.aClass710_Sub10_10781, (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1 ? 1 : 0, (byte) 1);
		Class27.method763(1903966911);
		client.aBool11015 = false;
	}
}
