/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.DataInputStream;
import java.net.URL;
import java.util.Calendar;
import java.util.TimeZone;

public class Class81 {
	static String[][] aStringArrayArray858 = { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "f\u00e9v", "mars", "avr", "mai", "juin", "juil", "ao\u00fbt", "sept", "oct", "nov", "d\u00e9c" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" },
			{ "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" }, { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic" } };
	static Calendar aCalendar859 = Calendar.getInstance();
	static Calendar aCalendar860 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	Class81() throws Throwable {
		throw new Error();
	}

	static boolean method1164(int i) {
		return Class45.aClass42_525 != null;
	}

	public static void method1165(String string, Throwable throwable, byte i) {
		try {
			String string_0_ = "";
			if (null != throwable)
				string_0_ = Class496.method6012(throwable, -58687791);
			if (null != string) {
				if (null != throwable)
					string_0_ = new StringBuilder().append(string_0_).append(" | ").toString();
				string_0_ = new StringBuilder().append(string_0_).append(string).toString();
			}
			ObjShapes.method7221(string_0_, (byte) 1);
			string_0_ = Class629.method7500(string_0_, -994720658);
			URL url = null;
			if (null != Class249.anApplet2529)
				url = Class249.anApplet2529.getCodeBase();
			else if (RuntimeException_Sub1.anInterface61_12039 != null)
				url = RuntimeException_Sub1.anInterface61_12039.method393(1977184675);
			if (url != null) {
				String string_1_ = "Unknown";
				String string_2_ = "1.1";
				try {
					string_1_ = System.getProperty("java.vendor");
					string_2_ = System.getProperty("java.version");
				} catch (Exception exception) {
					/* empty */
				}
				URL url_3_ = (new URL(url, new StringBuilder().append("clienterror.ws?c=").append(1180576371 * RuntimeException_Sub1.anInt12035).append("&cs=").append(RuntimeException_Sub1.anInt12038 * -169710231).append("&u=").append(RuntimeException_Sub1.aString12036 != null ? Class629.method7500((RuntimeException_Sub1.aString12036), -994720658) : new StringBuilder().append("").append(-8673045396982173989L * RuntimeException_Sub1.aLong12041).toString()).append("&v1=")
						.append(Class629.method7500(string_1_, -994720658)).append("&v2=").append(Class629.method7500(string_2_, -994720658)).append("&e=").append(string_0_).toString()));
				DataInputStream datainputstream = new DataInputStream(url_3_.openStream());
				datainputstream.read();
				datainputstream.close();
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
