/* Class214 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.util.Date;

public class Class214 implements Interface27 {
	Class222 aClass222_2299;
	int anInt2300;
	Class213 this$0;
	public static Class461 aClass461_2301;
	public static Class461 aClass461_2302;

	public void method155(Class226 class226) {
		class226.method3240(-662857247 * anInt2300, aClass222_2299, 1551608756);
	}

	Class214(Class213 class213, RSByteBuffer class536_sub33) {
		this$0 = class213;
		anInt2300 = class536_sub33.readUnsignedShort() * -921146847;
		aClass222_2299 = new Class222(class536_sub33, false, false, class213.anInterface28_2296);
	}

	public void method153(Class226 class226) {
		class226.method3240(-662857247 * anInt2300, aClass222_2299, -102274381);
	}

	public void method154(Class226 class226, short i) {
		class226.method3240(-662857247 * anInt2300, aClass222_2299, -287201202);
	}

	public static void sendPanelBoxMessage(String message) {
		if (Class205_Sub16.aStringArray9941 == null)
			Class558.method6818(1551682379);
		client.aCalendar11296.setTime(new Date(Class249.method3450(1766258818)));
		int i_0_ = client.aCalendar11296.get(11);
		int i_1_ = client.aCalendar11296.get(12);
		int i_2_ = client.aCalendar11296.get(13);
		String string_3_ = new StringBuilder().append(Integer.toString(i_0_ / 10)).append(i_0_ % 10).append(":").append(i_1_ / 10).append(i_1_ % 10).append(":").append(i_2_ / 10).append(i_2_ % 10).toString();
		String[] strings = Class344.method4483(message, '\n', (byte) -33);
		for (int i_4_ = 0; i_4_ < strings.length; i_4_++) {
			for (int i_5_ = Class105.anInt1247 * -2122502799; i_5_ > 0; i_5_--)
				Class205_Sub16.aStringArray9941[i_5_] = Class205_Sub16.aStringArray9941[i_5_ - 1];
			Class205_Sub16.aStringArray9941[0] = new StringBuilder().append(string_3_).append(": ").append(strings[i_4_]).toString();
			if (null != Class710_Sub7.aFileOutputStream10835) {
				try {
					Class710_Sub7.aFileOutputStream10835.write(Class364.method4765(new StringBuilder().append(Class205_Sub16.aStringArray9941[0]).append("\n").toString(), -1778056149));
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			if (-2122502799 * Class105.anInt1247 < Class205_Sub16.aStringArray9941.length - 1) {
				Class105.anInt1247 += -1511525487;
				if (Class105.anInt1240 * 817280251 > 0)
					Class105.anInt1240 += -2034813389;
			}
		}
	}

	static final void method3078(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class390.method4856(class251, class234, true, 0, class668, (byte) -62);
	}

	static final void method3079(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -168974521 * Class61.anInt651;
	}

	public static final void method3080(int i, int i_6_) {
		if (Class646.aClass536_Sub15_8361 != null && (i >= 0 && i < (1494047173 * Class646.aClass536_Sub15_8361.anInt10482))) {
			Class349 class349 = Class646.aClass536_Sub15_8361.aClass349Array10479[i];
			if (class349.aByte3696 == -1) {
				Class106 class106 = Class536_Sub41.method9871(2077853800);
				Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4497, class106.aClass15_1258, 1478623793);
				class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(2 + Class555.method6802(class349.aString3695, 1359327571));
				class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(i, -1778059594);
				class536_sub23.aClass536_Sub33_Sub2_10528.writeString(class349.aString3695);
				class106.method1409(class536_sub23, -100796677);
			}
		}
	}

	static final void method3081(Class668 class668, int i) {
		int i_7_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		ItemDefinitions class1 = (ItemDefinitions) Class111.aClass34_Sub13_1391.method70(i_7_, (byte) -44);
		int i_8_;
		if (class1.aBool84)
			i_8_ = 676567643 * class1.anInt40;
		else if (class1.membersOnly)
			i_8_ = -1020331067 * Class331_Sub2.aClass621_10048.anInt8103;
		else
			i_8_ = 696751511 * Class331_Sub2.aClass621_10048.anInt8102;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_8_;
	}

	static final void method3082(Class668 class668, int i) {
		int i_9_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class97.method1320((class668.aClass536_Sub15_8553 == Class646.aClass536_Sub15_8361), i_9_, 1330569410);
	}

	public static void method3083(Class521 class521, Class521 class521_10_, int i) {
		if (null != class521.aClass521_7055)
			class521.method6354((byte) 20);
		class521.aClass521_7055 = class521_10_;
		class521.aClass521_7056 = class521_10_.aClass521_7056;
		class521.aClass521_7055.aClass521_7056 = class521;
		class521.aClass521_7056.aClass521_7055 = class521;
	}
}
