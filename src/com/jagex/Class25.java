/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.applet.Applet;

import netscape.javascript.JSObject;

public class Class25 {
	public static void method728(Applet applet, String string, byte i) throws Throwable {
		JSObject.getWindow(applet).eval(string);
	}

	public static Object method729(Applet applet, String string, int i) throws Throwable {
		return JSObject.getWindow(applet).call(string, null);
	}

	public static Object method730(Applet applet, String string, Object[] objects, int i) throws Throwable {
		return JSObject.getWindow(applet).call(string, objects);
	}

	Class25() throws Throwable {
		throw new Error();
	}
}
