/* Class496 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Class496 {
	String aString5544;
	int anInt5545;
	int anInt5546;
	int anInt5547;
	int anInt5548;

	int method5998() {
		return -1164809383 * anInt5547;
	}

	int method5999() {
		return -940832673 * anInt5546;
	}

	public Class496(int i, int i_0_, int i_1_, int i_2_, String string) {
		anInt5547 = i * 1148267753;
		anInt5545 = i_0_ * 286079047;
		anInt5546 = i_1_ * 1347441567;
		anInt5548 = -1320355287 * i_2_;
		aString5544 = string;
	}

	int method6000() {
		return 951403033 * anInt5548;
	}

	int method6001(int i) {
		return 951403033 * anInt5548;
	}

	int method6002(byte i) {
		return -940832673 * anInt5546;
	}

	int method6003() {
		return -1164809383 * anInt5547;
	}

	String method6004(int i) {
		return aString5544;
	}

	int method6005() {
		return anInt5545 * -1474236041;
	}

	int method6006() {
		return anInt5545 * -1474236041;
	}

	int method6007() {
		return -940832673 * anInt5546;
	}

	int method6008() {
		return -940832673 * anInt5546;
	}

	int method6009(byte i) {
		return -1164809383 * anInt5547;
	}

	int method6010(int i) {
		return anInt5545 * -1474236041;
	}

	static final void method6011(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class353.method4648(class251, class234, class668, (byte) -16);
	}

	static String method6012(Throwable throwable, int i) throws IOException {
		String string;
		if (throwable instanceof RuntimeException_Sub1) {
			RuntimeException_Sub1 runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			string = new StringBuilder().append(runtimeexception_sub1.aString12037).append(" | ").toString();
			throwable = runtimeexception_sub1.aThrowable12040;
		} else
			string = "";
		StringWriter stringwriter = new StringWriter();
		PrintWriter printwriter = new PrintWriter(stringwriter);
		throwable.printStackTrace(printwriter);
		printwriter.close();
		String string_3_ = stringwriter.toString();
		BufferedReader bufferedreader = new BufferedReader(new StringReader(string_3_));
		String string_4_ = bufferedreader.readLine();
		for (;;) {
			String string_5_ = bufferedreader.readLine();
			if (string_5_ == null)
				break;
			int i_6_ = string_5_.indexOf('(');
			int i_7_ = string_5_.indexOf(')', 1 + i_6_);
			String string_8_;
			if (-1 != i_6_)
				string_8_ = string_5_.substring(0, i_6_);
			else
				string_8_ = string_5_;
			string_8_ = string_8_.trim();
			string_8_ = string_8_.substring(string_8_.lastIndexOf(' ') + 1);
			string_8_ = string_8_.substring(string_8_.lastIndexOf('\t') + 1);
			string = new StringBuilder().append(string).append(string_8_).toString();
			if (i_6_ != -1 && -1 != i_7_) {
				int i_9_ = string_5_.indexOf(".java:", i_6_);
				if (i_9_ >= 0)
					string = new StringBuilder().append(string).append(string_5_.substring(5 + i_9_, i_7_)).toString();
			}
			string = new StringBuilder().append(string).append(' ').toString();
		}
		string = new StringBuilder().append(string).append("| ").append(string_4_).toString();
		return string;
	}
}
