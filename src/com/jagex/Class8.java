/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class Class8 {
	public static byte[] method598(File file) {
		return Class407.method6558(file, (int) file.length(), -1234734981);
	}

	static void method599(File file, byte[] is, int i) throws IOException {
		DataInputStream datainputstream = (new DataInputStream(new BufferedInputStream(new FileInputStream(file))));
		try {
			datainputstream.readFully(is, 0, i);
		} catch (EOFException eofexception) {
			/* empty */
		}
		datainputstream.close();
	}

	public static byte[] method600(File file) {
		return Class407.method6558(file, (int) file.length(), -474286818);
	}

	public static byte[] method601(File file) {
		return Class407.method6558(file, (int) file.length(), -505073851);
	}

	public static byte[] method602(File file) {
		return Class407.method6558(file, (int) file.length(), -1872023882);
	}

	Class8() throws Throwable {
		throw new Error();
	}
}
