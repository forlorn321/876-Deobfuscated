/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class88 {
	public int anInt876;
	public int anInt877;
	public int anInt878;

	Class88(int i, int i_0_, int i_1_) {
		anInt877 = 2094687903 * i;
		anInt878 = i_0_ * 1933364685;
		anInt876 = i_1_ * -147554361;
	}

	static void method1213(int i) {
		if (null != Class710_Sub7.aFileOutputStream10835) {
			try {
				Class710_Sub7.aFileOutputStream10835.close();
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		Class710_Sub7.aFileOutputStream10835 = null;
	}
}
