/* Class208_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class208_Sub1 extends Class208 {
	public void method3846(int i) {
		Class312.method5652(true, -1265576738);
	}

	public void method3851() {
		Class312.method5652(true, -1319018606);
	}

	public void method3848() {
		Class312.method5652(true, -1718734028);
	}

	Class208_Sub1(RSByteBuffer class527_sub38) {
		super(class527_sub38);
	}

	public static int method15588(Class438 class438, int i) {
		Class442 class442 = Class442.method7166(0.0F, 0.0F, 1.0F);
		class442.method7157(class438);
		double d = 1.5707963267948966 - Math.acos((double) class442.aFloat4915);
		class442.method7141();
		if (d < 0.0)
			d = 3.141592653589793 + d + 3.141592653589793;
		return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
	}
}
