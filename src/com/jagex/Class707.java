/* Class707 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Frame;

public final class Class707 {
	public static boolean aBool8841 = true;

	public static void method14355(Class709 class709, Frame frame) {
		class709.method14384(-142837968);
		frame.setVisible(false);
		frame.dispose();
	}

	public static Class704[] method14356(Class709 class709) {
		int[] is = class709.method14389(1150360169);
		Class704[] class704s = new Class704[is.length >> 2];
		for (int i = 0; i < class704s.length; i++) {
			Class704 class704 = new Class704();
			class704s[i] = class704;
			class704.anInt8829 = is[i << 2] * 990043033;
			class704.anInt8827 = -862491263 * is[(i << 2) + 1];
			class704.anInt8828 = is[2 + (i << 2)] * -695981651;
			class704.anInt8826 = is[3 + (i << 2)] * 1184450883;
		}
		return class704s;
	}

	public static Class704[] method14357(Class709 class709) {
		int[] is = class709.method14389(1150360169);
		Class704[] class704s = new Class704[is.length >> 2];
		for (int i = 0; i < class704s.length; i++) {
			Class704 class704 = new Class704();
			class704s[i] = class704;
			class704.anInt8829 = is[i << 2] * 990043033;
			class704.anInt8827 = -862491263 * is[(i << 2) + 1];
			class704.anInt8828 = is[2 + (i << 2)] * -695981651;
			class704.anInt8826 = is[3 + (i << 2)] * 1184450883;
		}
		return class704s;
	}

	public static void method14358(Class709 class709, Frame frame) {
		class709.method14384(1504301005);
		frame.setVisible(false);
		frame.dispose();
	}

	Class707() throws Throwable {
		throw new Error();
	}

	public static Frame method14359(Class709 class709, int i, int i_0_, int i_1_, int i_2_) {
		if (0 == i_1_) {
			Class704[] class704s = Class144.method2388(class709, (byte) 116);
			if (class704s == null)
				return null;
			boolean bool = false;
			for (int i_3_ = 0; i_3_ < class704s.length; i_3_++) {
				if (class704s[i_3_].anInt8829 * -798340951 == i && class704s[i_3_].anInt8827 * -1159802239 == i_0_ && (0 == i_2_ || i_2_ == class704s[i_3_].anInt8826 * 1045269355) && (!bool || -1133436379 * class704s[i_3_].anInt8828 > i_1_)) {
					i_1_ = class704s[i_3_].anInt8828 * -1133436379;
					bool = true;
				}
			}
			if (!bool)
				return null;
		}
		Frame frame = new Frame("Jagex Full Screen");
		frame.setResizable(false);
		class709.method14383(frame, i, i_0_, i_1_, i_2_, 1734187509);
		return frame;
	}

	public static Frame method14360(Class709 class709, int i, int i_4_, int i_5_, int i_6_) {
		if (0 == i_5_) {
			Class704[] class704s = Class144.method2388(class709, (byte) 27);
			if (class704s == null)
				return null;
			boolean bool = false;
			for (int i_7_ = 0; i_7_ < class704s.length; i_7_++) {
				if (class704s[i_7_].anInt8829 * -798340951 == i && class704s[i_7_].anInt8827 * -1159802239 == i_4_ && (0 == i_6_ || i_6_ == class704s[i_7_].anInt8826 * 1045269355) && (!bool || -1133436379 * class704s[i_7_].anInt8828 > i_5_)) {
					i_5_ = class704s[i_7_].anInt8828 * -1133436379;
					bool = true;
				}
			}
			if (!bool)
				return null;
		}
		Frame frame = new Frame("Jagex Full Screen");
		frame.setResizable(false);
		class709.method14383(frame, i, i_4_, i_5_, i_6_, 1844008746);
		return frame;
	}

	public static void method14361(Class709 class709, Frame frame) {
		class709.method14384(1942272297);
		frame.setVisible(false);
		frame.dispose();
	}

	public static Frame method14362(Class709 class709, int i, int i_8_, int i_9_, int i_10_) {
		if (0 == i_9_) {
			Class704[] class704s = Class144.method2388(class709, (byte) 75);
			if (class704s == null)
				return null;
			boolean bool = false;
			for (int i_11_ = 0; i_11_ < class704s.length; i_11_++) {
				if (class704s[i_11_].anInt8829 * -798340951 == i && class704s[i_11_].anInt8827 * -1159802239 == i_8_ && (0 == i_10_ || i_10_ == class704s[i_11_].anInt8826 * 1045269355) && (!bool || -1133436379 * class704s[i_11_].anInt8828 > i_9_)) {
					i_9_ = class704s[i_11_].anInt8828 * -1133436379;
					bool = true;
				}
			}
			if (!bool)
				return null;
		}
		Frame frame = new Frame("Jagex Full Screen");
		frame.setResizable(false);
		class709.method14383(frame, i, i_8_, i_9_, i_10_, -208486441);
		return frame;
	}

	public static Class678 method14363(int i, byte i_12_) {
		Class678[] class678s = OutputStream_Sub1.method17426((byte) -103);
		for (int i_13_ = 0; i_13_ < class678s.length; i_13_++) {
			Class678 class678 = class678s[i_13_];
			if (i == class678.anInt8610 * -1907167873)
				return class678;
		}
		return null;
	}

	static final void method14364(Class665 class665, int i) {
		class665.anInt8526 -= 307142523;
		Class245.aClass226_2698.method4273(class665.anIntArray8525[1769813785 * class665.anInt8526], class665.anIntArray8525[1 + class665.anInt8526 * 1769813785], (byte) 8);
	}

	static final void method14365(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class290.method5252(class243, class240, class665, -1824832732);
	}
}
