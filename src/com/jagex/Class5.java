/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

import com.RS3Applet;

public class Class5 {
	public int anInt108;
	boolean aBool109 = true;
	public int anInt110;
	public int anInt111;
	public String aString112;
	boolean aBool113 = false;

	public void method574(int i) {
		if (!aBool109) {
			aBool109 = true;
			aBool113 = true;
		} else if (aBool113)
			aBool113 = false;
		else
			aBool109 = false;
	}

	public Socket method575(byte i) throws IOException {
		if (RS3Applet.RSPS) {
			return new Socket(InetAddress.getByName(RS3Applet.Host), 43594);
		}
		if (!aBool113) {
			return new Socket(InetAddress.getByName(aString112), (aBool109 ? -910853859 * anInt108 : -843966029 * anInt110));
		}
		return Class606.method7219(aString112, aBool109 ? anInt108 * -910853859 : -843966029 * anInt110, -62207556).method909(-979285364);
	}

	public boolean method579(Class5 class5_0_, byte i) {
		if (class5_0_ == null)
			return false;
		return (anInt111 * 1318197187 == 1318197187 * class5_0_.anInt111 && aString112.equals(class5_0_.aString112) && -843966029 * anInt110 == class5_0_.anInt110 * -843966029 && -910853859 * anInt108 == class5_0_.anInt108 * -910853859);
	}

	static final void method582(Class668 class668, int i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (2 == -1484801557 * client.anInt11289 && i_1_ < client.anInt11288 * 142551095)
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = client.aClass31Array11291[i_1_].aString274;
		else
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
	}
}
