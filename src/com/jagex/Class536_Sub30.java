/* Class536_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub30 extends Class536 implements Interface8 {
	public int anInt10564;
	public int anInt10565;
	static Class536_Sub30[] aClass536_Sub30Array10566 = new Class536_Sub30[0];
	public int anInt10567;
	public int anInt10568;

	public void method64(RSByteBuffer class536_sub33) {
		anInt10565 = class536_sub33.readUnsignedByte(123598781) * 1968946045;
		anInt10568 = class536_sub33.readInt(90011794) * 1921344143;
		anInt10564 = class536_sub33.readInt(113643697) * 524680463;
		anInt10567 = class536_sub33.readInt(-1116567395) * -377587009;
	}

	Class536_Sub30(Class536_Sub30 class536_sub30_0_) {
		anInt10565 = 1 * class536_sub30_0_.anInt10565;
		anInt10568 = class536_sub30_0_.anInt10568 * 1;
		anInt10564 = 1 * class536_sub30_0_.anInt10564;
		anInt10567 = 1 * class536_sub30_0_.anInt10567;
	}

	public Class536_Sub30(RSByteBuffer class536_sub33) {
		method61(class536_sub33, -770869965);
	}

	public void method60(RSByteBuffer class536_sub33, byte i) {
		method9630(class536_sub33, (byte) -106);
	}

	void method9627(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		anInt10565 = 1968946045 * i;
		anInt10568 = i_1_ * 1921344143;
		anInt10564 = 524680463 * i_2_;
		anInt10567 = i_3_ * -377587009;
	}

	void method9628(Class536_Sub30 class536_sub30_5_, int i) {
		anInt10565 = class536_sub30_5_.anInt10565 * 1;
		anInt10568 = 1 * class536_sub30_5_.anInt10568;
		anInt10564 = class536_sub30_5_.anInt10564 * 1;
		anInt10567 = class536_sub30_5_.anInt10567 * 1;
	}

	public void method67(RSByteBuffer class536_sub33) {
		method9630(class536_sub33, (byte) -81);
	}

	public Class436 method9629(int i) {
		return new Class436((float) (anInt10568 * 2135129199), (float) (737759727 * anInt10564), (float) (-1369836225 * anInt10567));
	}

	void method9630(RSByteBuffer class536_sub33, byte i) {
		class536_sub33.writeByte(700896725 * anInt10565, 465637339);
		class536_sub33.writeInt(2135129199 * anInt10568, -149241618);
		class536_sub33.writeInt(anInt10564 * 737759727, -149241618);
		class536_sub33.writeInt(anInt10567 * -1369836225, -149241618);
	}

	public String toString() {
		return new StringBuilder().append("Level: ").append(700896725 * anInt10565).append(" Coord: ").append(anInt10568 * 2135129199).append(",").append(anInt10564 * 737759727).append(",").append(-1369836225 * anInt10567).append(" Coord Split: ").append(anInt10568 * 2135129199 >> 15).append(",").append(-1369836225 * anInt10567 >> 15).append(",").append(anInt10568 * 2135129199 >> 9 & 0x3f).append(",").append(anInt10567 * -1369836225 >> 9 & 0x3f).append(",")
				.append(2135129199 * anInt10568 & 0x1ff).append(",").append(anInt10567 * -1369836225 & 0x1ff).toString();
	}

	public int method48(int i) {
		return Class506.method6143(355112762);
	}

	public void method65(RSByteBuffer class536_sub33) {
		anInt10565 = class536_sub33.readUnsignedByte(1905021836) * 1968946045;
		anInt10568 = class536_sub33.readInt(-1692921264) * 1921344143;
		anInt10564 = class536_sub33.readInt(-1677279193) * 524680463;
		anInt10567 = class536_sub33.readInt(-94018751) * -377587009;
	}

	public void method61(RSByteBuffer class536_sub33, int i) {
		anInt10565 = class536_sub33.readUnsignedByte(-906087978) * 1968946045;
		anInt10568 = class536_sub33.readInt(-824451811) * 1921344143;
		anInt10564 = class536_sub33.readInt(-501456860) * 524680463;
		anInt10567 = class536_sub33.readInt(108272111) * -377587009;
	}

	public String method9631() {
		return new StringBuilder().append("Level: ").append(700896725 * anInt10565).append(" Coord: ").append(anInt10568 * 2135129199).append(",").append(anInt10564 * 737759727).append(",").append(-1369836225 * anInt10567).append(" Coord Split: ").append(anInt10568 * 2135129199 >> 15).append(",").append(-1369836225 * anInt10567 >> 15).append(",").append(anInt10568 * 2135129199 >> 9 & 0x3f).append(",").append(anInt10567 * -1369836225 >> 9 & 0x3f).append(",")
				.append(2135129199 * anInt10568 & 0x1ff).append(",").append(anInt10567 * -1369836225 & 0x1ff).toString();
	}

	void method9632(int i, boolean bool, int i_6_) {
		if (-1 == i)
			anInt10565 = -1968946045;
		else {
			anInt10565 = (i >> 28 & 0x3) * 1968946045;
			anInt10568 = 1921344143 * ((i >> 14 & 0x3fff) << 9);
			anInt10564 = 0;
			anInt10567 = -377587009 * ((i & 0x3fff) << 9);
			if (bool) {
				anInt10568 += -2057138432;
				anInt10567 += 2121973504;
			}
		}
	}

	public Class536_Sub30() {
		anInt10565 = -1968946045;
	}

	static int method9633() {
		return 13;
	}

	public String method9634() {
		return new StringBuilder().append("Level: ").append(700896725 * anInt10565).append(" Coord: ").append(anInt10568 * 2135129199).append(",").append(anInt10564 * 737759727).append(",").append(-1369836225 * anInt10567).append(" Coord Split: ").append(anInt10568 * 2135129199 >> 15).append(",").append(-1369836225 * anInt10567 >> 15).append(",").append(anInt10568 * 2135129199 >> 9 & 0x3f).append(",").append(anInt10567 * -1369836225 >> 9 & 0x3f).append(",")
				.append(2135129199 * anInt10568 & 0x1ff).append(",").append(anInt10567 * -1369836225 & 0x1ff).toString();
	}

	public void method62(RSByteBuffer class536_sub33) {
		method9630(class536_sub33, (byte) -81);
	}

	void method9635(int i, boolean bool) {
		if (-1 == i)
			anInt10565 = -1968946045;
		else {
			anInt10565 = (i >> 28 & 0x3) * 1968946045;
			anInt10568 = 1921344143 * ((i >> 14 & 0x3fff) << 9);
			anInt10564 = 0;
			anInt10567 = -377587009 * ((i & 0x3fff) << 9);
			if (bool) {
				anInt10568 += -2057138432;
				anInt10567 += 2121973504;
			}
		}
	}

	public Class536_Sub30(int i, int i_7_, int i_8_, int i_9_) {
		anInt10565 = 1968946045 * i;
		anInt10568 = i_7_ * 1921344143;
		anInt10564 = i_8_ * 524680463;
		anInt10567 = -377587009 * i_9_;
	}

	void method9636(int i, int i_10_, int i_11_, int i_12_) {
		anInt10565 = 1968946045 * i;
		anInt10568 = i_10_ * 1921344143;
		anInt10564 = 524680463 * i_11_;
		anInt10567 = i_12_ * -377587009;
	}

	public void method63(RSByteBuffer class536_sub33) {
		method9630(class536_sub33, (byte) -52);
	}

	Class536_Sub30(int i, boolean bool) {
		if (i == -1)
			anInt10565 = -1968946045;
		else {
			anInt10565 = (i >> 28 & 0x3) * 1968946045;
			anInt10568 = ((i >> 14 & 0x3fff) << 9) * 1921344143;
			anInt10564 = 0;
			anInt10567 = ((i & 0x3fff) << 9) * -377587009;
			if (bool) {
				anInt10568 += -2057138432;
				anInt10567 += 2121973504;
			}
		}
	}

	public String method9637() {
		return new StringBuilder().append("Level: ").append(700896725 * anInt10565).append(" Coord: ").append(anInt10568 * 2135129199).append(",").append(anInt10564 * 737759727).append(",").append(-1369836225 * anInt10567).append(" Coord Split: ").append(anInt10568 * 2135129199 >> 15).append(",").append(-1369836225 * anInt10567 >> 15).append(",").append(anInt10568 * 2135129199 >> 9 & 0x3f).append(",").append(anInt10567 * -1369836225 >> 9 & 0x3f).append(",")
				.append(2135129199 * anInt10568 & 0x1ff).append(",").append(anInt10567 * -1369836225 & 0x1ff).toString();
	}

	public void method66(RSByteBuffer class536_sub33) {
		anInt10565 = class536_sub33.readUnsignedByte(-287187857) * 1968946045;
		anInt10568 = class536_sub33.readInt(-961326752) * 1921344143;
		anInt10564 = class536_sub33.readInt(-1389539793) * 524680463;
		anInt10567 = class536_sub33.readInt(-1783979157) * -377587009;
	}

	public int method10() {
		return Class506.method6143(355112762);
	}

	static final void method9638(Class668 class668, int i) {
		int i_13_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (0 != -1484801557 * client.anInt11289 && i_13_ < client.anInt11293 * 1857706641) {
			Class30 class30 = client.aClass30Array11295[i_13_];
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class30.aString263;
			if (null != class30.aString262)
				class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class30.aString262;
			else
				class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
		} else {
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
		}
	}

	static final void method9639(Class251 class251, Class234 class234, Class668 class668, int i) {
		class251.anInt2601 = -323602093;
		class251.anInt2602 = class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)] * 1639447419;
		if (-809980533 * class251.anInt2546 == -1 && !class234.aBool2379)
			Class34_Sub7.method10328(-1591767037 * class251.anInt2559, (short) -15173);
	}

	static final void method9640(Class668 class668, int i) {
		Class710.aClass536_Sub40_8843.method9857(Class710.aClass536_Sub40_8843.aClass710_Sub7_10753, (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1 ? 1 : 0, (byte) 1);
		client.aClass515_11066.method6319(-1043013316);
		Class27.method763(1998246146);
		client.aBool11015 = false;
	}
}
