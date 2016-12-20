/* Class570 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.LinkedList;

public class Class570 {
	static LinkedList aLinkedList7619 = new LinkedList();

	public static void method9579(int i, int i_0_, int i_1_) {
		Class472.method7735(new Class68_Sub1(i, i_0_, i_1_, -1830559883 * client.anInt11046, Class454.aClass452_4972.anInt4949 * 784881143, Class454.aClass452_4972.anInt4942 * 1936772959, Class454.aClass452_4972.method7299((byte) -7), Class454.aClass452_4972.method7323(-1544239050), Class26_Sub1.aClass461_10572.method7583((short) 6036)), (byte) -52);
	}

	public static void method9580(Class41 class41) {
		Class472.method7735(new Class583(class41), (byte) -123);
	}

	public static void method9581(int i) {
		Class472.method7735(new Class582(i), (byte) -46);
	}

	public static void method9582(Class26_Sub1 class26_sub1) {
		Class472.method7735(class26_sub1, (byte) -105);
	}

	public static void method9583(Class26_Sub1 class26_sub1) {
		Class472.method7735(class26_sub1, (byte) -59);
	}

	Class570() throws Throwable {
		throw new Error();
	}

	public static void method9584(int i) {
		Class472.method7735(new Class582(i), (byte) -26);
	}

	public static void method9585(int i) {
		Class472.method7735(new Class582(i), (byte) -116);
	}

	public static void method9586(int i) {
		Class472.method7735(new Class582(i), (byte) -86);
	}

	public static void method9587(int i) {
		Class472.method7735(new Class582(i), (byte) -34);
	}

	public static void method9588(Class26_Sub1 class26_sub1) {
		Class472.method7735(class26_sub1, (byte) -71);
	}

	public static void method9589(Class41 class41) {
		Class472.method7735(new Class583(class41), (byte) -90);
	}

	public static void method9590() {
		if ((9 == client.anInt11048 * -1927019389 || 10 == -1927019389 * client.anInt11048) && null != client.aClass109_11067) {
			for (;;) {
				Interface67 interface67 = (Interface67) aLinkedList7619.poll();
				if (null == interface67)
					break;
				interface67.method421(595145956);
			}
		}
	}

	public static void method9591(Class71 class71, String string, int i, Throwable throwable) {
		Class472.method7735(new Class576(class71, string, i, throwable), (byte) -87);
	}

	static void method9592(Interface67 interface67) {
		while (aLinkedList7619.size() > 10)
			aLinkedList7619.remove();
		aLinkedList7619.add(interface67);
	}

	public static void method9593() {
		if ((9 == client.anInt11048 * -1927019389 || 10 == -1927019389 * client.anInt11048) && null != client.aClass109_11067) {
			for (;;) {
				Interface67 interface67 = (Interface67) aLinkedList7619.poll();
				if (null == interface67)
					break;
				interface67.method421(595145956);
			}
		}
	}

	public static void method9594() {
		if ((9 == client.anInt11048 * -1927019389 || 10 == -1927019389 * client.anInt11048) && null != client.aClass109_11067) {
			for (;;) {
				Interface67 interface67 = (Interface67) aLinkedList7619.poll();
				if (null == interface67)
					break;
				interface67.method421(595145956);
			}
		}
	}

	public static void method9595() {
		if ((9 == client.anInt11048 * -1927019389 || 10 == -1927019389 * client.anInt11048) && null != client.aClass109_11067) {
			for (;;) {
				Interface67 interface67 = (Interface67) aLinkedList7619.poll();
				if (null == interface67)
					break;
				interface67.method421(595145956);
			}
		}
	}

	public static void method9596() {
		if ((9 == client.anInt11048 * -1927019389 || 10 == -1927019389 * client.anInt11048) && null != client.aClass109_11067) {
			for (;;) {
				Interface67 interface67 = (Interface67) aLinkedList7619.poll();
				if (null == interface67)
					break;
				interface67.method421(595145956);
			}
		}
	}

	static final void method9597(Class665 class665, byte i) {
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub24_10635, (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]), 1973077188);
		Class631.method10465(-675343979);
		client.aBool11020 = false;
	}

	public static void method9598(int i, int i_2_, int i_3_, int i_4_) {
		i <<= 3;
		i_2_ <<= 3;
		i_3_ <<= 3;
		if (2 == -349191067 * Class30.anInt265) {
			if (Class208_Sub10.aClass296_Sub1_9923.method5376((byte) 19) == Class301.aClass301_3418) {
				Class327_Sub2 class327_sub2 = (Class327_Sub2) Class208_Sub10.aClass296_Sub1_9923.method5372((byte) 0);
				Class438 class438 = new Class438();
				Class438 class438_5_ = new Class438();
				class438.method7040(0.0F, 1.0F, 0.0F, 3.1415927F - (float) (2.0 * (3.141592653589793 * (double) i_2_) / 16384.0));
				Class442 class442 = new Class442(1.0F, 0.0F, 0.0F);
				class442.method7157(class438);
				class442.method7149();
				class438_5_.method7091(class442, ((float) (2.0 * (3.141592653589793 * (double) i)) / 16384.0F));
				class438.method7019(class438_5_);
				class327_sub2.aClass438_10044.method7054(class438);
			}
		} else {
			client.aFloat11111 = (float) i;
			client.aFloat11112 = (float) i_2_;
			if (3 == -349191067 * Class30.anInt265) {
				Class700_Sub34.anInt10928 = -290107601 * i;
				Class12.anInt176 = i_2_ * 355973435;
				Class689.anInt8692 = -1131167749 * i_3_;
			}
			Class229.method4317((byte) -108);
		}
		client.aBool11119 = true;
	}

	static final void method9599(boolean bool, Class665 class665, int i) {
		int i_6_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_6_, -620100147);
		Class240 class240 = Class183.aClass240Array2100[i_6_ >> 16];
		if (bool)
			Class171_Sub1.method14734(class240, class243, (byte) -24);
		else
			Class69.method1480(class240, class243, 2084747753);
	}
}
