/* Class668 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class668 {
	public static int anInt8567;

	public static float method13745(float f, float f_0_) {
		double d = Math.atan2((double) f, (double) f_0_);
		if (d < 0.0)
			d = 3.141592653589793 + (d + 3.141592653589793);
		return (float) d;
	}

	public static int method13746(Class438 class438) {
		Class442 class442 = Class442.method7166(0.0F, 0.0F, 1.0F);
		class442.method7157(class438);
		double d = 1.5707963267948966 - Math.acos((double) class442.aFloat4915);
		class442.method7141();
		if (d < 0.0)
			d = 3.141592653589793 + d + 3.141592653589793;
		return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
	}

	public static int method13747(Class438 class438) {
		Class442 class442 = Class442.method7166(0.0F, 0.0F, 1.0F);
		class442.method7157(class438);
		double d = 1.5707963267948966 - Math.acos((double) class442.aFloat4915);
		class442.method7141();
		if (d < 0.0)
			d = 3.141592653589793 + d + 3.141592653589793;
		return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
	}

	public static float method13748(Class438 class438) {
		Class442 class442 = Class442.method7166(0.0F, 0.0F, 1.0F);
		class442.method7157(class438);
		double d = 1.5707963267948966 - Math.acos((double) class442.aFloat4915);
		class442.method7141();
		return (float) d;
	}

	public static float method13749(float f, float f_1_) {
		double d = Math.atan2((double) f, (double) f_1_);
		if (d < 0.0)
			d = 3.141592653589793 + (d + 3.141592653589793);
		return (float) d;
	}

	Class668() throws Throwable {
		throw new Error();
	}

	public static int method13750(Class438 class438) {
		Class442 class442 = Class442.method7166(0.0F, 0.0F, 1.0F);
		class442.method7157(class438);
		double d = Math.atan2((double) class442.aFloat4918, (double) class442.aFloat4919);
		class442.method7141();
		if (d < 0.0)
			d = 3.141592653589793 + d + 3.141592653589793;
		return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
	}

	public static int method13751(Class438 class438) {
		Class442 class442 = Class442.method7166(0.0F, 0.0F, 1.0F);
		class442.method7157(class438);
		double d = Math.atan2((double) class442.aFloat4918, (double) class442.aFloat4919);
		class442.method7141();
		if (d < 0.0)
			d = 3.141592653589793 + d + 3.141592653589793;
		return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
	}

	public static int method13752(Class438 class438) {
		Class442 class442 = Class442.method7166(0.0F, 0.0F, 1.0F);
		class442.method7157(class438);
		double d = Math.atan2((double) class442.aFloat4918, (double) class442.aFloat4919);
		class442.method7141();
		if (d < 0.0)
			d = 3.141592653589793 + d + 3.141592653589793;
		return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
	}

	static Class711[] method13753(byte i) {
		return (new Class711[] { Class711.aClass711_8852, Class711.aClass711_8854, Class711.aClass711_8853 });
	}

	static final void method13754(Class665 class665, int i) {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class671.aClass97_8584.method483(i_2_, 1420030316);
	}
}
