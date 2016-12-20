/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.net.Socket;

public abstract class Class30 {
	String aString263;
	int anInt264;
	public static int anInt265;

	Class30() {
		/* empty */
	}

	Socket method873(short i) throws IOException {
		return new Socket(aString263, 1193730039 * anInt264);
	}

	public abstract Socket method874(byte i) throws IOException;

	public abstract Socket method875() throws IOException;

	Socket method876() throws IOException {
		return new Socket(aString263, 1193730039 * anInt264);
	}

	Socket method877() throws IOException {
		return new Socket(aString263, 1193730039 * anInt264);
	}
}
