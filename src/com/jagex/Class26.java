/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public abstract class Class26 {
	protected int anInt239;
	public static final int anInt240 = 4;
	protected int anInt241;
	public static final int anInt242 = 32;
	protected int anInt243;
	public static final int anInt244 = 256;
	public static final int anInt245 = 512;
	public static final int anInt246 = 2048;
	protected int anInt247 = -241561837;
	public static final int anInt248 = 8192;
	public static final int anInt249 = 2;
	public static final int anInt250 = 32768;
	public static final int anInt251 = 4096;
	protected int anInt252 = 357610859;
	protected int anInt253;
	protected int anInt254;
	public static final int anInt255 = 64;
	public static final int anInt256 = 16;
	protected int anInt257;
	public static final int anInt258 = 16384;

	public int method852() {
		return anInt239 * 1393148371;
	}

	Class26() {
		anInt241 = -1561471027;
		anInt254 = 1488013517;
		anInt253 = -691300235;
	}

	public int method853(int i) {
		return anInt239 * 1393148371;
	}

	public int method854() {
		return anInt239 * 1393148371;
	}

	public static int method855(int i) {
		return (null == Class585.aTwitchWebcamDeviceArray7709 ? 0 : Class585.aTwitchWebcamDeviceArray7709.length);
	}

	public static void method856(Iterable iterable, RSByteBuffer class527_sub38, int i) {
		int i_0_ = Class115.method2027(iterable, -2114016219);
		class527_sub38.method16652(i_0_, 1451443168);
		if (i_0_ != 0) {
			for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
				class527_sub38.buffer[class527_sub38.anInt10689 * -441238943 + i_1_] = (byte) 0;
			Iterator iterator = iterable.iterator();
			while (iterator.hasNext()) {
				Interface76 interface76 = (Interface76) iterator.next();
				int i_2_ = interface76.method87();
				int i_3_ = i_2_ / 8;
				class527_sub38.buffer[class527_sub38.anInt10689 * -441238943 + i_3_] |= 1 << (i_2_ & 0x7);
			}
			class527_sub38.anInt10689 += 1474750881 * i_0_;
		}
	}

	static void method857(int i, int i_4_, int i_5_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(14, 0L);
		class527_sub8_sub9.method18187(-1474744276);
		class527_sub8_sub9.anInt11676 = -281159195 * i;
		class527_sub8_sub9.anInt11667 = i_4_ * -164049787;
	}

	public static Interface76 method858(Interface76[] interface76s, int i, int i_6_) {
		Interface76[] interface76s_7_ = interface76s;
		for (int i_8_ = 0; i_8_ < interface76s_7_.length; i_8_++) {
			Interface76 interface76 = interface76s_7_[i_8_];
			if (i == interface76.method87())
				return interface76;
		}
		return null;
	}
}
