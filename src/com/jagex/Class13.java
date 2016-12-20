/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Class13 {
	boolean aBool177;
	public String aString178;
	public int anInt179;
	public int anInt180;
	public int anInt181;
	boolean aBool182 = true;

	public void method700(int i) {
		if (!aBool182) {
			aBool182 = true;
			aBool177 = true;
		} else if (aBool177)
			aBool177 = false;
		else
			aBool182 = false;
	}

	public void method701() {
		if (!aBool182) {
			aBool182 = true;
			aBool177 = true;
		} else if (aBool177)
			aBool177 = false;
		else
			aBool182 = false;
	}

	public Socket method702() throws IOException {
		if (!aBool177)
			return new Socket(InetAddress.getByName(aString178), (aBool182 ? -941127567 * anInt180 : anInt179 * 375656933));
		return Class305.method5598(aString178, aBool182 ? anInt180 * -941127567 : 375656933 * anInt179, 1832322120).method874((byte) 57);
	}

	public boolean method703(Class13 class13_0_, int i) {
		if (class13_0_ == null)
			return false;
		return (44791937 * class13_0_.anInt181 == anInt181 * 44791937 && aString178.equals(class13_0_.aString178) && anInt179 * 375656933 == class13_0_.anInt179 * 375656933 && anInt180 * -941127567 == -941127567 * class13_0_.anInt180);
	}

	public Socket method704() throws IOException {
		if (!aBool177)
			return new Socket(InetAddress.getByName(aString178), (aBool182 ? -941127567 * anInt180 : anInt179 * 375656933));
		return Class305.method5598(aString178, aBool182 ? anInt180 * -941127567 : 375656933 * anInt179, 1293501268).method874((byte) -20);
	}

	public Socket method705(byte i) throws IOException {
		if (!aBool177)
			return new Socket(InetAddress.getByName(aString178), (aBool182 ? -941127567 * anInt180 : anInt179 * 375656933));
		return Class305.method5598(aString178, aBool182 ? anInt180 * -941127567 : 375656933 * anInt179, 1878669204).method874((byte) 29);
	}

	public Class13() {
		aBool177 = false;
	}

	public void method706() {
		if (!aBool182) {
			aBool182 = true;
			aBool177 = true;
		} else if (aBool177)
			aBool177 = false;
		else
			aBool182 = false;
	}

	public void method707() {
		if (!aBool182) {
			aBool182 = true;
			aBool177 = true;
		} else if (aBool177)
			aBool177 = false;
		else
			aBool182 = false;
	}
}
