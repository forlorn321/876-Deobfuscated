/* RuntimeException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.applet.Applet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class RuntimeException_Sub1 extends RuntimeException {
	public static int anInt12040;
	static long aLong12041;
	public static int anInt12042;
	Throwable aThrowable12043;
	public static Applet anApplet12044;
	static Interface60 anInterface60_12045 = null;
	String aString12046;
	public static String aString12047;

	static String method18694(Throwable throwable) throws IOException {
		String string;
		if (throwable instanceof RuntimeException_Sub1) {
			RuntimeException_Sub1 runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			string = new StringBuilder().append(runtimeexception_sub1.aString12046).append(" | ").toString();
			throwable = runtimeexception_sub1.aThrowable12043;
		} else
			string = "";
		StringWriter stringwriter = new StringWriter();
		PrintWriter printwriter = new PrintWriter(stringwriter);
		throwable.printStackTrace(printwriter);
		printwriter.close();
		String string_0_ = stringwriter.toString();
		BufferedReader bufferedreader = new BufferedReader(new StringReader(string_0_));
		String string_1_ = bufferedreader.readLine();
		for (;;) {
			String string_2_ = bufferedreader.readLine();
			if (string_2_ == null)
				break;
			int i = string_2_.indexOf('(');
			int i_3_ = string_2_.indexOf(')', 1 + i);
			String string_4_;
			if (-1 != i)
				string_4_ = string_2_.substring(0, i);
			else
				string_4_ = string_2_;
			string_4_ = string_4_.trim();
			string_4_ = string_4_.substring(string_4_.lastIndexOf(' ') + 1);
			string_4_ = string_4_.substring(string_4_.lastIndexOf('\t') + 1);
			string = new StringBuilder().append(string).append(string_4_).toString();
			if (-1 != i && -1 != i_3_) {
				int i_5_ = string_2_.indexOf(".java:", i);
				if (i_5_ >= 0)
					string = new StringBuilder().append(string).append(string_2_.substring(5 + i_5_, i_3_)).toString();
			}
			string = new StringBuilder().append(string).append(' ').toString();
		}
		string = new StringBuilder().append(string).append("| ").append(string_1_).toString();
		return string;
	}

	static final void method18695(String string) {
		System.out.println(new StringBuilder().append("Error: ").append(Class527_Sub24.method16251(string, "%0a", "\n", -415579019)).toString());
	}

	public static RuntimeException_Sub1 method18696(Throwable throwable, String string) {
		RuntimeException_Sub1 runtimeexception_sub1;
		if (throwable instanceof RuntimeException_Sub1) {
			runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			StringBuilder stringbuilder = new StringBuilder();
			RuntimeException_Sub1 runtimeexception_sub1_6_ = runtimeexception_sub1;
			runtimeexception_sub1_6_.aString12046 = stringbuilder.append(runtimeexception_sub1_6_.aString12046).append(' ').append(string).toString();
		} else
			runtimeexception_sub1 = new RuntimeException_Sub1(throwable, string);
		return runtimeexception_sub1;
	}

	static final String method18697(String string, String string_7_, String string_8_) {
		for (int i = string.indexOf(string_7_); -1 != i; i = string.indexOf(string_7_, i + string_8_.length()))
			string = new StringBuilder().append(string.substring(0, i)).append(string_8_).append(string.substring(i + string_7_.length())).toString();
		return string;
	}

	RuntimeException_Sub1(Throwable throwable, String string) {
		aString12046 = string;
		aThrowable12043 = throwable;
		initCause(throwable);
	}

	static String method18698(Throwable throwable) throws IOException {
		String string;
		if (throwable instanceof RuntimeException_Sub1) {
			RuntimeException_Sub1 runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			string = new StringBuilder().append(runtimeexception_sub1.aString12046).append(" | ").toString();
			throwable = runtimeexception_sub1.aThrowable12043;
		} else
			string = "";
		StringWriter stringwriter = new StringWriter();
		PrintWriter printwriter = new PrintWriter(stringwriter);
		throwable.printStackTrace(printwriter);
		printwriter.close();
		String string_9_ = stringwriter.toString();
		BufferedReader bufferedreader = new BufferedReader(new StringReader(string_9_));
		String string_10_ = bufferedreader.readLine();
		for (;;) {
			String string_11_ = bufferedreader.readLine();
			if (string_11_ == null)
				break;
			int i = string_11_.indexOf('(');
			int i_12_ = string_11_.indexOf(')', 1 + i);
			String string_13_;
			if (-1 != i)
				string_13_ = string_11_.substring(0, i);
			else
				string_13_ = string_11_;
			string_13_ = string_13_.trim();
			string_13_ = string_13_.substring(string_13_.lastIndexOf(' ') + 1);
			string_13_ = string_13_.substring(string_13_.lastIndexOf('\t') + 1);
			string = new StringBuilder().append(string).append(string_13_).toString();
			if (-1 != i && -1 != i_12_) {
				int i_14_ = string_11_.indexOf(".java:", i);
				if (i_14_ >= 0)
					string = new StringBuilder().append(string).append(string_11_.substring(5 + i_14_, i_12_)).toString();
			}
			string = new StringBuilder().append(string).append(' ').toString();
		}
		string = new StringBuilder().append(string).append("| ").append(string_10_).toString();
		return string;
	}

	static String method18699(Throwable throwable) throws IOException {
		String string;
		if (throwable instanceof RuntimeException_Sub1) {
			RuntimeException_Sub1 runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			string = new StringBuilder().append(runtimeexception_sub1.aString12046).append(" | ").toString();
			throwable = runtimeexception_sub1.aThrowable12043;
		} else
			string = "";
		StringWriter stringwriter = new StringWriter();
		PrintWriter printwriter = new PrintWriter(stringwriter);
		throwable.printStackTrace(printwriter);
		printwriter.close();
		String string_15_ = stringwriter.toString();
		BufferedReader bufferedreader = new BufferedReader(new StringReader(string_15_));
		String string_16_ = bufferedreader.readLine();
		for (;;) {
			String string_17_ = bufferedreader.readLine();
			if (string_17_ == null)
				break;
			int i = string_17_.indexOf('(');
			int i_18_ = string_17_.indexOf(')', 1 + i);
			String string_19_;
			if (-1 != i)
				string_19_ = string_17_.substring(0, i);
			else
				string_19_ = string_17_;
			string_19_ = string_19_.trim();
			string_19_ = string_19_.substring(string_19_.lastIndexOf(' ') + 1);
			string_19_ = string_19_.substring(string_19_.lastIndexOf('\t') + 1);
			string = new StringBuilder().append(string).append(string_19_).toString();
			if (-1 != i && -1 != i_18_) {
				int i_20_ = string_17_.indexOf(".java:", i);
				if (i_20_ >= 0)
					string = new StringBuilder().append(string).append(string_17_.substring(5 + i_20_, i_18_)).toString();
			}
			string = new StringBuilder().append(string).append(' ').toString();
		}
		string = new StringBuilder().append(string).append("| ").append(string_16_).toString();
		return string;
	}

	static final void method18700(String string) {
		System.out.println(new StringBuilder().append("Error: ").append(Class527_Sub24.method16251(string, "%0a", "\n", -415579019)).toString());
	}

	static String method18701(Throwable throwable) throws IOException {
		String string;
		if (throwable instanceof RuntimeException_Sub1) {
			RuntimeException_Sub1 runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			string = new StringBuilder().append(runtimeexception_sub1.aString12046).append(" | ").toString();
			throwable = runtimeexception_sub1.aThrowable12043;
		} else
			string = "";
		StringWriter stringwriter = new StringWriter();
		PrintWriter printwriter = new PrintWriter(stringwriter);
		throwable.printStackTrace(printwriter);
		printwriter.close();
		String string_21_ = stringwriter.toString();
		BufferedReader bufferedreader = new BufferedReader(new StringReader(string_21_));
		String string_22_ = bufferedreader.readLine();
		for (;;) {
			String string_23_ = bufferedreader.readLine();
			if (string_23_ == null)
				break;
			int i = string_23_.indexOf('(');
			int i_24_ = string_23_.indexOf(')', 1 + i);
			String string_25_;
			if (-1 != i)
				string_25_ = string_23_.substring(0, i);
			else
				string_25_ = string_23_;
			string_25_ = string_25_.trim();
			string_25_ = string_25_.substring(string_25_.lastIndexOf(' ') + 1);
			string_25_ = string_25_.substring(string_25_.lastIndexOf('\t') + 1);
			string = new StringBuilder().append(string).append(string_25_).toString();
			if (-1 != i && -1 != i_24_) {
				int i_26_ = string_23_.indexOf(".java:", i);
				if (i_26_ >= 0)
					string = new StringBuilder().append(string).append(string_23_.substring(5 + i_26_, i_24_)).toString();
			}
			string = new StringBuilder().append(string).append(' ').toString();
		}
		string = new StringBuilder().append(string).append("| ").append(string_22_).toString();
		return string;
	}

	static final String method18702(String string, String string_27_, String string_28_) {
		for (int i = string.indexOf(string_27_); -1 != i; i = string.indexOf(string_27_, i + string_28_.length()))
			string = new StringBuilder().append(string.substring(0, i)).append(string_28_).append(string.substring(i + string_27_.length())).toString();
		return string;
	}

	static final String method18703(String string, String string_29_, String string_30_) {
		for (int i = string.indexOf(string_29_); -1 != i; i = string.indexOf(string_29_, i + string_30_.length()))
			string = new StringBuilder().append(string.substring(0, i)).append(string_30_).append(string.substring(i + string_29_.length())).toString();
		return string;
	}

	static final String method18704(String string, String string_31_, String string_32_) {
		for (int i = string.indexOf(string_31_); -1 != i; i = string.indexOf(string_31_, i + string_32_.length()))
			string = new StringBuilder().append(string.substring(0, i)).append(string_32_).append(string.substring(i + string_31_.length())).toString();
		return string;
	}

	static final String method18705(String string, String string_33_, String string_34_) {
		for (int i = string.indexOf(string_33_); -1 != i; i = string.indexOf(string_33_, i + string_34_.length()))
			string = new StringBuilder().append(string.substring(0, i)).append(string_34_).append(string.substring(i + string_33_.length())).toString();
		return string;
	}
}
