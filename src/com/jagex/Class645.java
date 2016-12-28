/* Class645 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class645 {
	Class199 aClass199_8353 = new Class199(2);
	JS5ResourceProvider aClass461_8354;

	void method7795() {
		synchronized (aClass199_8353) {
			aClass199_8353.method2884((byte) -97);
		}
	}

	void method7796(int i) {
		synchronized (aClass199_8353) {
			aClass199_8353.method2884((byte) -111);
		}
	}

	void method7797(int i, byte i_0_) {
		synchronized (aClass199_8353) {
			aClass199_8353.method2883(i, -1236391253);
		}
	}

	void method7798() {
		synchronized (aClass199_8353) {
			aClass199_8353.method2892(-920339642);
		}
	}

	void method7799() {
		synchronized (aClass199_8353) {
			aClass199_8353.method2884((byte) -1);
		}
	}

	Class645(JS5ResourceProvider class461) {
		aClass461_8354 = class461;
	}

	void method7800(int i) {
		synchronized (aClass199_8353) {
			aClass199_8353.method2883(i, -2126937684);
		}
	}

	void method7801() {
		synchronized (aClass199_8353) {
			aClass199_8353.method2892(-116879451);
		}
	}

	void method7802(byte i) {
		synchronized (aClass199_8353) {
			aClass199_8353.method2892(2103661414);
		}
	}

	void method7803() {
		synchronized (aClass199_8353) {
			aClass199_8353.method2892(-505273214);
		}
	}

	static final void method7804(Class668 class668, int i) {
		if (Class464.aClass694_5229 == null)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class464.aClass694_5229.anInt8730 * -1418548035;
	}

	static boolean method7805(int i, int i_1_) {
		return (59 == i || 2 == i || i == 8 || i == 17 || 15 == i || 16 == i || i == 58);
	}

	static void method7806(Class67_Sub1 class67_sub1, int i, int i_2_, int i_3_) {
		class67_sub1.method9797(i, (byte) 117);
		int i_4_;
		if (i_2_ > 100000) {
			Class38.method843((byte) -33);
			i_4_ = 4;
		} else if (i_2_ > 50000) {
			Class154.method1875((byte) 16);
			i_4_ = 3;
		} else if (i_2_ > 10000) {
			IncomingPacket.method5070((byte) 47);
			i_4_ = 2;
		} else {
			Class69.method1091(true, (short) 128);
			i_4_ = 1;
		}
		if (ClientSetting.aClass536_Sub40_8843.toolkit.method10071() != i) {
			ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.defaultToolkit), i, (byte) 1);
			Class704.method8264(i, false, (byte) 50);
		} else
			ClientSetting.aClass536_Sub40_8843.method9858((ClientSetting.aClass536_Sub40_8843.toolkit), true, (byte) -40);
		Class27.method763(1968136931);
		class67_sub1.method9794(i_4_, -1641162333);
	}
}
