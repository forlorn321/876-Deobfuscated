/* OutputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStream_Sub1 extends OutputStream {
	public static int anInt10987;

	OutputStream_Sub1() {
		/* empty */
	}

	public void write(int i) throws IOException {
		throw new IOException();
	}

	public void method17425(int i) throws IOException {
		throw new IOException();
	}

	static Class678[] method17426(byte i) {
		return (new Class678[] { Class678.aClass678_8611, Class678.aClass678_8612, Class678.aClass678_8613, Class678.aClass678_8617, Class678.aClass678_8614, Class678.aClass678_8615 });
	}

	static final void method17427(Class665 class665, byte i) {
		boolean bool = true;
		if (client.aBool11271) {
			try {
				Object object = Class411.aClass411_4364.method6579(1974363165);
				if (null != object)
					bool = ((Boolean) object).booleanValue();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = bool ? 1 : 0;
	}
}
