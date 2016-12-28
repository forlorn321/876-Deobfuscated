/* Class219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;
import java.awt.Dimension;

public class Class219 implements Interface27 {
	int anInt2309;
	Class213 this$0;

	public void method155(Class226 class226) {
		Class222 class222 = class226.method3227(anInt2309 * -1968236413, -781094290);
		class222.method3123(368312517);
		class222.method3113((byte) 70);
		class226.method3273(-1968236413 * anInt2309, 792767827);
	}

	public void method154(Class226 class226, short i) {
		Class222 class222 = class226.method3227(anInt2309 * -1968236413, -781094290);
		class222.method3123(368312517);
		class222.method3113((byte) 45);
		class226.method3273(-1968236413 * anInt2309, -1004627056);
	}

	Class219(Class213 class213, RSByteBuffer class536_sub33) {
		this$0 = class213;
		anInt2309 = class536_sub33.readUnsignedShort() * -125569493;
	}

	public void method153(Class226 class226) {
		Class222 class222 = class226.method3227(anInt2309 * -1968236413, -781094290);
		class222.method3123(368312517);
		class222.method3113((byte) 30);
		class226.method3273(-1968236413 * anInt2309, -1028949275);
	}

	static final void method3100(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1064708005 * class251.anInt2658;
	}

	static void method3101(IComponentDefinitions class251, int i, int i_0_, int i_1_) {
		if (client.aBool11188) {
			Class73 class73 = ((Class73) (Class173_Sub1.anInt9384 * -4715005 != -1 ? Class207.aClass34_Sub22_2244.method70((-4715005 * (Class173_Sub1.anInt9384)), (byte) 41) : null));
			if (client.getIComponentSettings(class251).method9491() && (Class511.anInt6931 * 1686601581 & 0x20) != 0 && (null == class73 || (class251.getIntParamDefault(Class173_Sub1.anInt9384 * -4715005, class73.anInt803 * 1566477951, 1869360746) != 1566477951 * class73.anInt803)))
				Class521_Sub6.method9389(client.aString11185, new StringBuilder().append(client.aString11186).append(" ").append(Class40.aString495).append(" ").append(class251.opBase).toString(), 1764906975 * Class13.anInt161, 58, class251.anInt2711 * -1484799213, 0L, -809980533 * class251.anInt2546, class251.anInt2559 * -1591767037, true, false, (long) (class251.anInt2546 * -809980533 << 0 | class251.anInt2559 * -1591767037), false, 1766607330);
		}
		for (int i_2_ = 9; i_2_ >= 5; i_2_--) {
			String string = Class480.method5829(class251, i_2_, (short) 255);
			if (string != null)
				Class521_Sub6.method9389(string, class251.opBase, Class73.method1132(class251, i_2_, -1524473349), 1007, -1484799213 * class251.anInt2711, (long) (i_2_ + 1), class251.anInt2546 * -809980533, class251.anInt2559 * -1591767037, true, false, (long) (class251.anInt2546 * -809980533 << 0 | class251.anInt2559 * -1591767037), false, 1728365000);
		}
		String string = Class554.method6785(class251, 3511850);
		if (null != string)
			Class521_Sub6.method9389(string, class251.opBase, 32874915 * class251.anInt2660, 25, -1484799213 * class251.anInt2711, 0L, class251.anInt2546 * -809980533, class251.anInt2559 * -1591767037, true, false, (long) (-809980533 * class251.anInt2546 << 0 | class251.anInt2559 * -1591767037), false, -814993897);
		for (int i_3_ = 4; i_3_ >= 0; i_3_--) {
			String string_4_ = Class480.method5829(class251, i_3_, (short) 255);
			if (null != string_4_)
				Class521_Sub6.method9389(string_4_, class251.opBase, Class73.method1132(class251, i_3_, 62613787), 57, class251.anInt2711 * -1484799213, (long) (1 + i_3_), -809980533 * class251.anInt2546, -1591767037 * class251.anInt2559, true, false, (long) (-809980533 * class251.anInt2546 << 0 | class251.anInt2559 * -1591767037), false, 273151590);
		}
		if (client.getIComponentSettings(class251).method9476()) {
			if (class251.pauseText != null)
				Class521_Sub6.method9389(class251.pauseText, "", -1, 30, -1484799213 * class251.anInt2711, 0L, -809980533 * class251.anInt2546, class251.anInt2559 * -1591767037, true, false, (long) (class251.anInt2546 * -809980533 << 0 | class251.anInt2559 * -1591767037), false, -184389048);
			else
				Class521_Sub6.method9389(Class38.aClass38_321.method840(Class459.aClass664_5178, 2099584897), "", -1, 30, class251.anInt2711 * -1484799213, 0L, class251.anInt2546 * -809980533, class251.anInt2559 * -1591767037, true, false, (long) (class251.anInt2546 * -809980533 << 0 | class251.anInt2559 * -1591767037), false, 2105766179);
		}
	}

	public static Class702 method3102(int i, int i_5_) {
		Class702[] class702s = Class692.method8195(1276345166);
		for (int i_6_ = 0; i_6_ < class702s.length; i_6_++) {
			Class702 class702 = class702s[i_6_];
			if (-1165196251 * class702.anInt8800 == i)
				return class702;
		}
		return null;
	}

	static final void method3103(Class668 class668, short i) {
		String string;
		if (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 != null && (null != Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aString12192))
			string = Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method11086(false, -1923065949);
		else
			string = "";
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = string;
	}

	static final void method3104(Class668 class668, int i) {
		int i_7_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(i_7_, (byte) -33)).equipLookHideSlot) * 2087922159;
	}

	public static Class167 method3105(int i, Canvas canvas, Class174 class174, Interface24 interface24, Interface47 interface47, Interface48 interface48, Interface46 interface46, Class461 class461, int i_8_, int i_9_) {
		int i_10_ = 0;
		int i_11_ = 0;
		if (null != canvas) {
			Dimension dimension = canvas.getSize();
			i_10_ = dimension.width;
			i_11_ = dimension.height;
		}
		return Class167.method2142(i, canvas, class174, interface24, interface47, interface48, interface46, class461, i_8_, i_10_, i_11_, (byte) -12);
	}
}
