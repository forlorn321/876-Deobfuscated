/* Class26_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class26_Sub1 extends Class26 implements Interface67 {
	public static Class461 aClass461_10572;

	public void method16293(int i, int i_0_) {
		anInt243 = (-58012769 * anInt243 | i) * -705982369;
	}

	public void method421(int i) {
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4442, client.aClass109_11067.aClass2_1367, (byte) 17);
		class527_sub15.buffer.writeShort(anInt243 * -58012769, 1404835786);
		class527_sub15.buffer.method16602(-1249895429 * anInt254, (byte) 25);
		class527_sub15.buffer.writeShortLE128(-1310069531 * anInt247, 2109298772);
		class527_sub15.buffer.writeByte(anInt257 * 2050547659, -967512620);
		class527_sub15.buffer.method16557(anInt252 * 934424765, 1945265395);
		class527_sub15.buffer.writeLE24BitInt(anInt253 * 251430947, (byte) 27);
		class527_sub15.buffer.method16586(1393148371 * anInt239, -381629883);
		class527_sub15.buffer.writeLE24BitInt(-1289415941 * anInt241, (byte) 62);
		client.aClass109_11067.method1969(class527_sub15, (byte) 1);
	}

	public void method285() {
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4442, client.aClass109_11067.aClass2_1367, (byte) 69);
		class527_sub15.buffer.writeShort(anInt243 * -58012769, 1404835786);
		class527_sub15.buffer.method16602(-1249895429 * anInt254, (byte) 24);
		class527_sub15.buffer.writeShortLE128(-1310069531 * anInt247, 1628398995);
		class527_sub15.buffer.writeByte(anInt257 * 2050547659, -813880642);
		class527_sub15.buffer.method16557(anInt252 * 934424765, 2085859207);
		class527_sub15.buffer.writeLE24BitInt(anInt253 * 251430947, (byte) -119);
		class527_sub15.buffer.method16586(1393148371 * anInt239, -901918212);
		class527_sub15.buffer.writeLE24BitInt(-1289415941 * anInt241, (byte) -1);
		client.aClass109_11067.method1969(class527_sub15, (byte) 1);
	}

	public void method16294(int i, int i_1_, byte i_2_) {
		if (0 == i && i_1_ > 32767)
			i_1_ = 32767;
		else if (i_1_ > 8388607)
			i_1_ = 8388607;
		switch (i) {
		case 5:
			anInt253 = 691300235 * i_1_;
			break;
		case 1:
			anInt241 = 1561471027 * i_1_;
			break;
		case 0:
			anInt247 = i_1_ * 241561837;
			break;
		case 3:
			anInt254 = -1488013517 * i_1_;
			break;
		}
	}

	public void method16295(int i, int i_3_) {
		anInt257 = -1181430301 * i;
	}

	public void method16296(int i, int i_4_) {
		anInt239 = i * 1907179099;
	}

	public void method16297(int i) {
		anInt257 = -1181430301 * i;
	}

	public void method16298(int i) {
		anInt243 = (-58012769 * anInt243 | i) * -705982369;
	}

	public void method16299(int i) {
		anInt243 = (-58012769 * anInt243 | i) * -705982369;
	}

	public void method16300(int i, int i_5_) {
		if (0 == i && i_5_ > 32767)
			i_5_ = 32767;
		else if (i_5_ > 8388607)
			i_5_ = 8388607;
		switch (i) {
		case 5:
			anInt253 = 691300235 * i_5_;
			break;
		case 1:
			anInt241 = 1561471027 * i_5_;
			break;
		case 0:
			anInt247 = i_5_ * 241561837;
			break;
		case 3:
			anInt254 = -1488013517 * i_5_;
			break;
		}
	}

	public void method16301(int i) {
		anInt257 = -1181430301 * i;
	}

	public void method16302(int i) {
		anInt243 = (-58012769 * anInt243 | i) * -705982369;
	}

	public void method16303(int i, int i_6_) {
		if (0 == i && i_6_ > 32767)
			i_6_ = 32767;
		else if (i_6_ > 8388607)
			i_6_ = 8388607;
		switch (i) {
		case 5:
			anInt253 = 691300235 * i_6_;
			break;
		case 1:
			anInt241 = 1561471027 * i_6_;
			break;
		case 0:
			anInt247 = i_6_ * 241561837;
			break;
		case 3:
			anInt254 = -1488013517 * i_6_;
			break;
		}
	}

	public void method16304(int i, int i_7_) {
		if (0 == i && i_7_ > 32767)
			i_7_ = 32767;
		else if (i_7_ > 8388607)
			i_7_ = 8388607;
		switch (i) {
		case 5:
			anInt253 = 691300235 * i_7_;
			break;
		case 1:
			anInt241 = 1561471027 * i_7_;
			break;
		case 0:
			anInt247 = i_7_ * 241561837;
			break;
		case 3:
			anInt254 = -1488013517 * i_7_;
			break;
		}
	}

	static void method16305(Class701 class701, int i) {
		Class497.aClass701_5581 = class701;
	}
}
