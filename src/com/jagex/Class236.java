/* Class236 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Class236 {
	static short aShort2379;

	static final void method4359(long l) {
		try {
			Thread.sleep(l);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public static final void method4360(long l) {
		if (l > 0L) {
			if (l % 10L == 0L) {
				Class318.method5687(l - 1L);
				Class318.method5687(1L);
			} else
				Class318.method5687(l);
		}
	}

	Class236() throws Throwable {
		throw new Error();
	}

	public static final void method4361(long l) {
		if (l > 0L) {
			if (l % 10L == 0L) {
				Class318.method5687(l - 1L);
				Class318.method5687(1L);
			} else
				Class318.method5687(l);
		}
	}

	static final void method4362(long l) {
		try {
			Thread.sleep(l);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public static void method4363(int i, String string, int i_0_) {
		Class99.method1766(i, 0, "", "", "", string, null, 281653110);
	}

	static Class527_Sub31 method4364(byte i) {
		Class19 class19 = null;
		Class527_Sub31 class527_sub31 = new Class527_Sub31(client.aClass678_11259, 0);
		try {
			class19 = Class32.method944("", client.aClass678_11259.aString8616, false, (byte) 97);
			byte[] is = new byte[(int) class19.method752(1832000053)];
			int i_1_;
			for (int i_2_ = 0; i_2_ < is.length; i_2_ += i_1_) {
				i_1_ = class19.method753(is, i_2_, is.length - i_2_, (byte) 12);
				if (i_1_ == -1)
					throw new IOException();
			}
			class527_sub31 = new Class527_Sub31(new RSByteBuffer(is), client.aClass678_11259, 0);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (class19 != null)
				class19.method751((byte) 49);
		} catch (Exception exception) {
			/* empty */
		}
		return class527_sub31;
	}

	static final void method4365(Class665 class665, int i) {
		int i_3_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class9 class9 = ((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_3_, 1221003790));
		if (295433991 * class9.anInt127 >= 0 && class9.anInt128 * -1747830577 >= 0)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class9.anInt128 * -1747830577;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = i_3_;
	}

	static void method4366(File file, byte[] is, int i, int i_4_) throws IOException {
		DataInputStream datainputstream = (new DataInputStream(new BufferedInputStream(new FileInputStream(file))));
		try {
			datainputstream.readFully(is, 0, i);
		} catch (EOFException eofexception) {
			/* empty */
		}
		datainputstream.close();
	}
}
