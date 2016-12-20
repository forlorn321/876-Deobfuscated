/* Class502 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class Class502 {
	static Hashtable aHashtable6871;
	static File aFile6872;
	static boolean aBool6873 = false;

	public static String method8194() {
		return aFile6872.getAbsolutePath();
	}

	public static File method8195(String string) {
		if (!aBool6873)
			throw new RuntimeException("");
		File file = (File) aHashtable6871.get(string);
		if (null != file)
			return file;
		File file_0_ = new File(aFile6872, string);
		RandomAccessFile randomaccessfile = null;
		File file_1_;
		try {
			File file_2_ = new File(file_0_.getParent());
			if (!file_2_.exists())
				throw new RuntimeException("");
			randomaccessfile = new RandomAccessFile(file_0_, "rw");
			int i = randomaccessfile.read();
			randomaccessfile.seek(0L);
			randomaccessfile.write(i);
			randomaccessfile.seek(0L);
			randomaccessfile.close();
			aHashtable6871.put(string, file_0_);
			file_1_ = file_0_;
		} catch (Exception exception) {
			try {
				if (null != randomaccessfile) {
					randomaccessfile.close();
					Object object = null;
				}
			} catch (Exception exception_3_) {
				/* empty */
			}
			throw new RuntimeException();
		}
		return file_1_;
	}

	static void method8196(File file) {
		aFile6872 = file;
		if (!aFile6872.exists())
			throw new RuntimeException("");
		aBool6873 = true;
	}

	static void method8197(File file) {
		aFile6872 = file;
		if (!aFile6872.exists())
			throw new RuntimeException("");
		aBool6873 = true;
	}

	public static String method8198() {
		return aFile6872.getAbsolutePath();
	}

	static void method8199(File file) {
		aFile6872 = file;
		if (!aFile6872.exists())
			throw new RuntimeException("");
		aBool6873 = true;
	}

	static {
		aHashtable6871 = new Hashtable(16);
	}

	Class502() throws Throwable {
		throw new Error();
	}

	static void method8200(File file) {
		aFile6872 = file;
		if (!aFile6872.exists())
			throw new RuntimeException("");
		aBool6873 = true;
	}

	public static File method8201(String string) {
		if (!aBool6873)
			throw new RuntimeException("");
		File file = (File) aHashtable6871.get(string);
		if (null != file)
			return file;
		File file_4_ = new File(aFile6872, string);
		RandomAccessFile randomaccessfile = null;
		File file_5_;
		try {
			File file_6_ = new File(file_4_.getParent());
			if (!file_6_.exists())
				throw new RuntimeException("");
			randomaccessfile = new RandomAccessFile(file_4_, "rw");
			int i = randomaccessfile.read();
			randomaccessfile.seek(0L);
			randomaccessfile.write(i);
			randomaccessfile.seek(0L);
			randomaccessfile.close();
			aHashtable6871.put(string, file_4_);
			file_5_ = file_4_;
		} catch (Exception exception) {
			try {
				if (null != randomaccessfile) {
					randomaccessfile.close();
					Object object = null;
				}
			} catch (Exception exception_7_) {
				/* empty */
			}
			throw new RuntimeException();
		}
		return file_5_;
	}

	static final void method8202(Class665 class665, int i) {
		if (!Class208_Sub10.aClass296_Sub1_9923.method5378((byte) -112).method5627((byte) 118))
			throw new RuntimeException();
		Class696_Sub4 class696_sub4 = ((Class696_Sub4) Class208_Sub10.aClass296_Sub1_9923.method5472(1207787065));
		class696_sub4.method17343(Class505.aClass437_6913, -1, 0.0F, (byte) 5);
		client.aBool11119 = true;
	}

	public static final void method8203(byte i) {
		client.aBool11217 = true;
	}

	static final void method8204(Class665 class665, int i) {
		class665.anInt8526 -= 102380841;
	}
}
