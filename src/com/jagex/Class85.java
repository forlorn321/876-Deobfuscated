/* Class85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.zip.Inflater;

public class Class85 {
	Inflater anInflater868;

	Class85(int i, int i_0_, int i_1_) {
		/* empty */
	}

	public Class85() {
		this(-1, 1000000, 1000000);
	}

	public void method1184(RSByteBuffer class536_sub33, byte[] is, int i) {
		if (31 != (class536_sub33.buffer[class536_sub33.off * -810172525]) || (class536_sub33.buffer[1 + class536_sub33.off * -810172525]) != -117)
			throw new RuntimeException("");
		if (null == anInflater868)
			anInflater868 = new Inflater(true);
		try {
			anInflater868.setInput(class536_sub33.buffer, 10 + class536_sub33.off * -810172525, (class536_sub33.buffer.length - (10 + class536_sub33.off * -810172525 + 8)));
			anInflater868.inflate(is);
		} catch (Exception exception) {
			anInflater868.reset();
			throw new RuntimeException("");
		}
		anInflater868.reset();
	}

	public byte[] method1185(byte[] is, int i) {
		RSByteBuffer class536_sub33 = new RSByteBuffer(is);
		class536_sub33.off = (is.length - 4) * 516175515;
		int i_2_ = class536_sub33.method9697(1239367194);
		byte[] is_3_ = new byte[i_2_];
		class536_sub33.off = 0;
		method1184(class536_sub33, is_3_, 305018890);
		return is_3_;
	}

	public byte[] method1186(byte[] is) {
		RSByteBuffer class536_sub33 = new RSByteBuffer(is);
		class536_sub33.off = (is.length - 4) * 516175515;
		int i = class536_sub33.method9697(358020992);
		byte[] is_4_ = new byte[i];
		class536_sub33.off = 0;
		method1184(class536_sub33, is_4_, 1373804440);
		return is_4_;
	}

	public static void method1187(int i, int i_5_) {
		if (i < 1)
			Class542_Sub1.anInt10716 = Class542_Sub1.anInt10703 * -410256283;
		else
			Class542_Sub1.anInt10716 = i * 1048934007;
	}

	public static final void method1188(int i) {
		int i_6_ = ClientSetting.aClass536_Sub40_8843.removeRoofSetting.method9916();
		if (i_6_ == 0) {
			client.aClass515_11066.method6246(null, -1557750801);
			Class689.method8183(0, (byte) -60);
		} else if (1 == i_6_ || 3 == i_6_) {
			Class184_Sub3.method8990((byte) 0, -332271776);
			Class689.method8183(512, (byte) -1);
			if (client.aClass515_11066.method6249(-290506465) != null)
				Class158.method1890((byte) 18);
		} else {
			Class184_Sub3.method8990((byte) (648319383 * client.anInt11127 - 4 & 0xff), 951566288);
			Class689.method8183(2, (byte) 39);
		}
		client.anInt11264 = Class320.anInt3539 * -1505723837;
	}
}
