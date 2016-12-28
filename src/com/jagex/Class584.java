/* Class584 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class584 {
	Class461 aClass461_7705;
	Class199 aClass199_7706 = new Class199(20);

	void method7030() {
		synchronized (aClass199_7706) {
			aClass199_7706.method2892(-1635835750);
		}
	}

	void method7031(byte i) {
		synchronized (aClass199_7706) {
			aClass199_7706.method2884((byte) -93);
		}
	}

	void method7032(int i, byte i_0_) {
		synchronized (aClass199_7706) {
			aClass199_7706.method2883(i, -1033268774);
		}
	}

	void method7033(byte i) {
		synchronized (aClass199_7706) {
			aClass199_7706.method2892(1923538145);
		}
	}

	void method7034() {
		synchronized (aClass199_7706) {
			aClass199_7706.method2884((byte) -105);
		}
	}

	Class584(Class461 class461) {
		aClass461_7705 = class461;
	}

	void method7035() {
		synchronized (aClass199_7706) {
			aClass199_7706.method2884((byte) -91);
		}
	}

	void method7036(int i) {
		synchronized (aClass199_7706) {
			aClass199_7706.method2883(i, -1793628437);
		}
	}

	void method7037(int i) {
		synchronized (aClass199_7706) {
			aClass199_7706.method2883(i, -1350774834);
		}
	}

	void method7038(int i) {
		synchronized (aClass199_7706) {
			aClass199_7706.method2883(i, -1334762375);
		}
	}

	void method7039() {
		synchronized (aClass199_7706) {
			aClass199_7706.method2884((byte) -87);
		}
	}

	void method7040() {
		synchronized (aClass199_7706) {
			aClass199_7706.method2892(-545178586);
		}
	}

	void method7041(int i) {
		synchronized (aClass199_7706) {
			aClass199_7706.method2883(i, -1294311095);
		}
	}

	void method7042() {
		synchronized (aClass199_7706) {
			aClass199_7706.method2892(-1406365614);
		}
	}

	static void method7043(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class554.method6782(Class677.aClass167_8609, (byte) 8);
	}

	static final void method7044(Class668 class668, int i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		ItemTypeDecoder class1 = (ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(i_1_, (byte) 2);
		if (-1 == class1.certTemplateId * 79208069 && class1.certId * 1990739153 >= 0)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1990739153 * class1.certId;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_1_;
	}

	static final void method7045(Class668 class668, int i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_2_);
		Class234 class234 = Class463.aClass234Array5227[i_2_ >> 16];
		Class147.method1811(class251, class234, class668, -825961586);
	}

	public static Class536_Sub30 method7046(Class536_Sub30 class536_sub30, byte i) {
		synchronized (Class536_Sub30.aClass536_Sub30Array10566) {
			if (1483220115 * Class497.anInt5553 == 0) {
				Class536_Sub30 class536_sub30_3_ = new Class536_Sub30(class536_sub30);
				return class536_sub30_3_;
			}
			Class536_Sub30.aClass536_Sub30Array10566[(Class497.anInt5553 -= -330131045) * 1483220115].method9628(class536_sub30, -1714592246);
			Class536_Sub30 class536_sub30_4_ = (Class536_Sub30.aClass536_Sub30Array10566[Class497.anInt5553 * 1483220115]);
			return class536_sub30_4_;
		}
	}

	static final long method7047(int i) {
		return (((long) ((Class685.anInt8654 += 1203527187) * 315104283 - 1) << 32) | 0xffffffffL);
	}
}
