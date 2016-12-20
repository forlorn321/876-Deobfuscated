/* Class527_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.net.Socket;

public class Node_Sub6 extends Class527 {
	public int anInt10398;
	static Socket getClientSocket;

	public Node_Sub6(int i) {
		anInt10398 = i * -1332018517;
	}

	static void method16054(boolean bool, int i) {
		Class107.aString1337 = Class107.aString1337.trim();
		Class107.anInt1338 = 0;
		if (Class107.aString1337.length() == 0)
			Class107.anInt1339 = 0;
		else {
			Class493.method7997(new StringBuilder().append("--> ").append(Class107.aString1337).toString(), (byte) 8);
			Class29.method868(Class107.aString1337, false, bool, -885250808);
			if (!bool) {
				Class107.anInt1339 = 0;
				Class107.aString1337 = "";
			} else
				Class107.anInt1339 = Class107.aString1337.length() * 207030263;
		}
	}

	static final void method16055(Class665 class665, int i) {
		Class101.method1791((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]), (short) 30432);
	}
}
