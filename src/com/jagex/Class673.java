/* Class673 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class673 {
	static long[] aLongArray8580;
	static char[] aCharArray8581 = { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	static {
		aLongArray8580 = new long[12];
		for (int i = 0; i < aLongArray8580.length; i++)
			aLongArray8580[i] = (long) Math.pow(37.0, (double) i);
	}

	Class673() throws Throwable {
		throw new Error();
	}

	public static void method8026(int i, int i_0_) {
		if (i != client.anInt11101 * -708374433) {
			client.anInt11028 = 0;
			if (9 == client.anInt11101 * -708374433 && i != 10)
				Class475.method5745(-1480680339);
			if (i == 17 || i == 19)
				Class206_Sub1.method9166(-1906017351);
			if (17 != i && Class605.aClass567_7872 != null) {
				Class605.aClass567_7872.method6913(-842345557);
				Class605.aClass567_7872 = null;
			}
			if (16 == i) {
				Class106.method1427((11 == client.anInt11101 * -708374433 || 13 == -708374433 * client.anInt11101 || ((Class644.aClass628_8352.anInt8195 * 1657790451) != -1959825479 * client.anInt11187)), -1436569240);
				Class486.method5860(-2076435390);
			}
			if (i == 0) {
				boolean bool;
				if (-1 == Class644.aClass628_8352.anInt8225 * -2097501943)
					bool = (-708374433 * client.anInt11101 == 1 || -708374433 * client.anInt11101 == 4);
				else
					bool = (client.anInt11187 * -1959825479 != Class644.aClass628_8352.anInt8225 * -2097501943);
				Class489.method5878(bool, -2028212924);
			}
			if (i == 1 || 4 == i) {
				if (!Class508.method6177((byte) -105))
					return;
			} else if (i == 3 || i == 8 && 6 != client.anInt11101 * -708374433) {
				if (!Class206_Sub1.method9166(-1837585672))
					return;
			} else if (i == 13)
				Class249.method3458(951589045);
			if (Class578.method7007(i, 1776308152)) {
				client.aClass515_11066.method6260((byte) 123);
				client.aClass515_11066.aLong7033 = -4972394634653231741L;
			}
			if (i == 10 || i == 16)
				Class458_Sub3.method9357((byte) 12);
			boolean bool = (i == 12 || Class566.method6895(i, 895161574) || Class233.method3334(i, (byte) -73));
			boolean bool_1_ = (-708374433 * client.anInt11101 == 12 || Class566.method6895(-708374433 * client.anInt11101, 2077425752) || Class233.method3334(-708374433 * client.anInt11101, (byte) -83));
			if (bool_1_ != bool)
				Class176.aClass460_1936.method5530(!bool, (byte) -44);
			if (Class578.method7007(i, 2132553946) || 17 == i || i == 19)
				Class677.aClass167_8609.method2034();
			client.anInt11101 = 1309625247 * i;
		}
	}
}
