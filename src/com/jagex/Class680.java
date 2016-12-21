/* Class680 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Rectangle;

public class Class680 implements Interface75 {
	public static Class680 aClass680_8637;
	public static Class680 aClass680_8638;
	public static Class680 aClass680_8639;
	public static Class680 aClass680_8640;
	public static final int anInt8641 = 4;
	public int anInt8642;
	public static Class680 aClass680_8643 = new Class680(0, (byte) -1);
	public byte aByte8644;

	public int method8068() {
		return aByte8644 + 1;
	}

	public int method78() {
		return aByte8644;
	}

	public static Class680[] method8069(int i) {
		return new Class680[] { aClass680_8643, aClass680_8638, aClass680_8639, aClass680_8640, aClass680_8637 };
	}

	public int method8070(int i) {
		return aByte8644 + 1;
	}

	public int method12() {
		return aByte8644;
	}

	public int method73() {
		return aByte8644;
	}

	public int method8071() {
		return aByte8644 + 1;
	}

	Class680(int i, byte i_0_) {
		anInt8642 = i * 1901762559;
		aByte8644 = i_0_;
	}

	public int method8072() {
		return aByte8644 + 1;
	}

	static {
		aClass680_8638 = new Class680(1, (byte) 0);
		aClass680_8639 = new Class680(2, (byte) 1);
		aClass680_8640 = new Class680(3, (byte) 2);
		aClass680_8637 = new Class680(4, (byte) 3);
	}

	static final void method8073(int i, int i_1_, int i_2_, int i_3_, byte i_4_) {
		for (int i_5_ = 0; i_5_ < client.anInt11245 * -5823823; i_5_++) {
			Rectangle rectangle = client.aRectangleArray11249[i_5_];
			if (rectangle.width + rectangle.x > i && rectangle.x < i + i_2_ && rectangle.height + rectangle.y > i_1_ && rectangle.y < i_1_ + i_3_)
				client.aBoolArray11240[i_5_] = true;
		}
	}
}
