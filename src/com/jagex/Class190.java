/* Class190 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Container;
import java.awt.Insets;
import java.util.Iterator;

class Class190 implements Interface42 {
	Class226 this$0;
	static int anInt2128;
	public static int anInt2129;
	public static Class147 aClass147_2130;

	Class190(Class226 class226) {
		this$0 = class226;
	}

	public float method278(int i) {
		return ((float) Class204.aClass527_Sub31_2213.aClass700_Sub24_10633.method17139((byte) 38) / 255.0F);
	}

	public float method279() {
		return ((float) Class204.aClass527_Sub31_2213.aClass700_Sub24_10633.method17139((byte) -9) / 255.0F);
	}

	public static void method3674(Class555 class555, Class180 class180, int i) {
		Iterator iterator = Class628.aList8199.iterator();
		while (iterator.hasNext()) {
			Class613 class613 = (Class613) iterator.next();
			if (class613.aBool8030)
				class613.method10138(class555, class180);
		}
	}

	static final void method3675(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_0_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_1_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_0_ | i_1_;
	}

	static void method3676(int i, int i_2_, int i_3_, int i_4_, boolean bool, short i_5_) {
		if (Class707.aBool8841 && null != Class56.aFrame711 && (3 != i_2_ || Class232.anInt2361 * -397936919 != i_3_ || i_4_ != Class319.anInt3537 * -1718907591)) {
			Class184.method3564(Class504.aClass709_6907, Class56.aFrame711, 1569527577);
			Class56.aFrame711 = null;
		}
		if (Class707.aBool8841 && i_2_ == 3 && Class56.aFrame711 == null) {
			Class56.aFrame711 = Class665.method11053(Class504.aClass709_6907, i_3_, i_4_, 0, 0, 1213021499);
			if (null != Class56.aFrame711) {
				Class232.anInt2361 = 1958363481 * i_3_;
				Class319.anInt3537 = i_4_ * 1051808009;
				Class631.method10465(1494984553);
			}
		}
		if (3 == i_2_ && (!Class707.aBool8841 || Class56.aFrame711 == null))
			method3676(i, Class204.aClass527_Sub31_2213.aClass700_Sub2_10596.method16853((byte) -72), -1, -1, true, (short) 29846);
		else {
			Container container = Class198.method3745((byte) 31);
			if (null != Class56.aFrame711) {
				Class358.anInt3831 = i_3_ * -1411879007;
				Class76.anInt796 = i_4_ * -1322100701;
			} else if (Class514.aFrame7012 != null) {
				Insets insets = Class514.aFrame7012.getInsets();
				Class358.anInt3831 = (Class514.aFrame7012.getSize().width - (insets.left + insets.right)) * -1411879007;
				Class76.anInt796 = (Class514.aFrame7012.getSize().height - (insets.bottom + insets.top)) * -1322100701;
			} else {
				Class358.anInt3831 = container.getSize().width * -1411879007;
				Class76.anInt796 = container.getSize().height * -1322100701;
			}
			if (-21941151 * Class358.anInt3831 <= 0)
				Class358.anInt3831 = -1411879007;
			if (-239790197 * Class76.anInt796 <= 0)
				Class76.anInt796 = -1322100701;
			if (i_2_ != 1)
				Class295.method5335(-736879272);
			else {
				Class289.anInt3223 = 70008131 * client.anInt11158;
				client.anInt7019 = (Class358.anInt3831 * -21941151 - -1844600635 * client.anInt11158) / 2 * -63687167;
				Class611.anInt8009 = client.anInt11058 * -1951628069;
				client.anInt7020 = 0;
			}
			if (Class73.aClass677_790 != Class677.aClass677_8596 && -1803844265 * Class289.anInt3223 < 1024 && Class611.anInt8009 * -471480167 >= 768) {
				/* empty */
			}
			if (!bool) {
				Class451.aCanvas4939.setSize(Class289.anInt3223 * -1803844265, Class611.anInt8009 * -471480167);
				Class402.aClass180_4150.method3159(Class451.aCanvas4939, Class289.anInt3223 * -1803844265, -471480167 * Class611.anInt8009, -2012341435);
				if (container == Class514.aFrame7012) {
					Insets insets = Class514.aFrame7012.getInsets();
					Class451.aCanvas4939.setLocation(client.anInt7019 * -416298495 + insets.left, insets.top + client.anInt7020 * -1313216019);
				} else
					Class451.aCanvas4939.setLocation((client.anInt7019 * -416298495), (-1313216019 * client.anInt7020));
			} else
				Class198.method3744((byte) 52);
			if (i_2_ >= 2)
				client.aBool11155 = true;
			else
				client.aBool11155 = false;
			Class225.method4191(406942694);
			if (-2119864417 * client.anInt11237 != -1)
				Class316_Sub1.method15721(true, 666383690);
			if (Class203.method3782((byte) -1).method1967(1986620816) != null && (Class167.method2677(-1927019389 * client.anInt11048, (byte) 17) || Class208_Sub23.method15642((client.anInt11048 * -1927019389), 2019460379)))
				Class195.method3711(Class203.method3782((byte) -1), 1760869332);
			for (int i_6_ = 0; i_6_ < 102; i_6_++)
				client.aBoolArray11310[i_6_] = true;
			client.aBool7023 = true;
		}
	}

	static void method3677(Class527_Sub15 class527_sub15, int i, int i_7_, int i_8_, int i_9_) {
		class527_sub15.buffer.writeShortLE128(i_7_, 1278860914);
		class527_sub15.buffer.writeIntV1(i, (byte) 7);
		class527_sub15.buffer.writeShortLE2(i_8_, (byte) 11);
	}

	static final void method3678(Class243 class243, Class240 class240, Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, 823514902) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2636 = Class103.method1800(string, class665, (byte) -47);
		class243.aBool2606 = true;
	}
}
