/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.applet.Applet;

import netscape.javascript.JSObject;

public class Class60 {
	public static Object method1375(Applet applet, String string, int i) throws Throwable {
		return JSObject.getWindow(applet).call(string, null);
	}

	public static Object method1376(Applet applet, String string) throws Throwable {
		return JSObject.getWindow(applet).call(string, null);
	}

	public static Object method1377(Applet applet, String string) throws Throwable {
		return JSObject.getWindow(applet).call(string, null);
	}

	public static Object method1378(Applet applet, String string, Object[] objects, int i) throws Throwable {
		return JSObject.getWindow(applet).call(string, objects);
	}

	public static void method1379(Applet applet, String string) throws Throwable {
		JSObject.getWindow(applet).eval(string);
	}

	public static void method1380(Applet applet, String string) throws Throwable {
		JSObject.getWindow(applet).eval(string);
	}

	Class60() throws Throwable {
		throw new Error();
	}

	public static void method1381(Applet applet, String string, int i) throws Throwable {
		JSObject.getWindow(applet).eval(string);
	}
}
