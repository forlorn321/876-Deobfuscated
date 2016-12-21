/* Class536 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.net.MalformedURLException;
import java.net.URL;

public class Class536 {
	public Class536 aClass536_7132;
	public long aLong7133;
	public Class536 aClass536_7134;

	public void method6483() {
		if (null != aClass536_7134) {
			aClass536_7134.aClass536_7132 = aClass536_7132;
			aClass536_7132.aClass536_7134 = aClass536_7134;
			aClass536_7132 = null;
			aClass536_7134 = null;
		}
	}

	public void method6484(int i) {
		if (null != aClass536_7134) {
			aClass536_7134.aClass536_7132 = aClass536_7132;
			aClass536_7132.aClass536_7134 = aClass536_7134;
			aClass536_7132 = null;
			aClass536_7134 = null;
		}
	}

	public void method6485() {
		if (null != aClass536_7134) {
			aClass536_7134.aClass536_7132 = aClass536_7132;
			aClass536_7132.aClass536_7134 = aClass536_7134;
			aClass536_7132 = null;
			aClass536_7134 = null;
		}
	}

	public boolean method6486() {
		if (null == aClass536_7134)
			return false;
		return true;
	}

	public boolean method6487(byte i) {
		if (null == aClass536_7134)
			return false;
		return true;
	}

	public boolean method6488() {
		if (null == aClass536_7134)
			return false;
		return true;
	}

	public boolean method6489() {
		if (null == aClass536_7134)
			return false;
		return true;
	}

	public boolean method6490() {
		if (null == aClass536_7134)
			return false;
		return true;
	}

	static boolean method6491(String string, int i) {
		if (null == string)
			return false;
		try {
			new URL(string);
		} catch (MalformedURLException malformedurlexception) {
			return false;
		}
		return true;
	}
}
