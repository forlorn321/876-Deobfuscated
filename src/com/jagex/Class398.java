/* Class398 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class398 implements Interface49 {
	public Class395 aClass395_4117;
	public int anInt4118;
	public Class399 aClass399_4119;
	public int anInt4120;
	public int anInt4121;
	public static Class461 aClass461_4122;
	static Class654 aClass654_4123;

	Class398(int i, Class395 class395, Class399 class399, int i_0_, int i_1_) {
		anInt4120 = 74539037 * i;
		aClass395_4117 = class395;
		aClass399_4119 = class399;
		anInt4121 = i_0_ * -1569767673;
		anInt4118 = -702093783 * i_1_;
	}

	public Class390 method342() {
		return Class390.aClass390_4053;
	}

	public Class390 method344() {
		return Class390.aClass390_4053;
	}

	public Class390 method343(byte i) {
		return Class390.aClass390_4053;
	}

	public static void method4898(Class63 class63, byte i) {
		Class467.method5689(new Class577(class63), -2074698737);
	}

	public static int method4899(int i, int i_2_) {
		Class575.aTwitchWebcamFrameData7651 = null;
		Class575.aClass143_7676 = null;
		if (i < 0 || i >= Class575.aTwitchWebcamDeviceArray7674.length)
			return -1;
		return (Class536_Sub42.aTwitchTV10811.StopWebcamDevice(Class575.aTwitchWebcamDeviceArray7674[i].anInt1128 * -270689935));
	}

	static final void method4900(Class668 class668, int i) {
		int i_3_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		InterfaceDefinitions class251 = Class264.method3678(i_3_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_3_ >> 16];
		Class208.method2969(class251, class234, class668, -1436471118);
	}

	static final void method4901(Class668 class668, int i) {
		int i_4_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (-1 != client.anInt11187 * -1959825479) {
			if (i_4_ == 0) {
				class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.anInt11187 * -1959825479;
				return;
			}
			i_4_--;
		}
		Class536_Sub36 class536_sub36 = (Class536_Sub36) client.aClass4_11008.method562(-2074921103);
		while (i_4_-- > 0)
			class536_sub36 = (Class536_Sub36) client.aClass4_11008.method567(-1230140320);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class536_sub36.anInt10634 * -358726121;
	}

	static final void method4902(Class668 class668, int i) {
		if (null == Class155.anIntArray1733 || Class50.anInt586 * 804701685 >= Class155.anIntArray1733.length)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (Class155.anIntArray1733[(Class50.anInt586 += 126746205) * 804701685 - 1]) & 0xffff;
	}

	public static final void method4903(Class536_Sub36 class536_sub36, boolean bool, boolean bool_5_, int i) {
		int i_6_ = -358726121 * class536_sub36.anInt10634;
		int i_7_ = (int) (class536_sub36.aLong7133 * -6909195213925454795L);
		class536_sub36.method6484();
		if (bool)
			Class444.method5395(i_6_, -687424059);
		Class574.method6947(i_6_, (byte) 91);
		InterfaceDefinitions class251 = Class264.method3678(i_7_, -689214737);
		if (class251 != null)
			Class668.method8011(class251, 263642117);
		Class690.method8187(i_6_, (byte) -67);
		if (!bool_5_ && -1959825479 * client.anInt11187 != -1)
			Class205.method2950(client.anInt11187 * -1959825479, 1, -870807069);
		Class3 class3 = new Class3(client.aClass4_11008);
		for (Class536_Sub36 class536_sub36_8_ = (Class536_Sub36) class3.method552(279545888); null != class536_sub36_8_; class536_sub36_8_ = (Class536_Sub36) class3.next()) {
			if (!class536_sub36_8_.method6487((byte) -24)) {
				class536_sub36_8_ = (Class536_Sub36) class3.method552(-1331008439);
				if (null == class536_sub36_8_)
					break;
			}
			if (-700395843 * class536_sub36_8_.anInt10633 == 3) {
				int i_9_ = (int) (-6909195213925454795L * class536_sub36_8_.aLong7133);
				if (i_6_ == i_9_ >>> 16)
					method4903(class536_sub36_8_, true, bool_5_, 1759806773);
			}
		}
	}

	static final void method4904(Class668 class668, int i) {
		int i_10_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		ItemDefinitions class1 = (ItemDefinitions) Class111.aClass34_Sub13_1391.method70(i_10_, (byte) 72);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1370184373 * class1.stackable == 2 ? 1 : 0;
	}

	static final void method4905(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (int) (Class63.aClass226_717.method3224((byte) -36) / 60000L);
	}
}
