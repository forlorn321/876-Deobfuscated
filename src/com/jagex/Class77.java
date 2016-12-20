/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.zip.Inflater;

import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;

public class Class77 {
	static int[] anIntArray797;
	Inflater anInflater798;

	public byte[] method1539(byte[] is) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(is);
		class527_sub38.anInt10689 = (is.length - 4) * 1474750881;
		int i = class527_sub38.readIntLE((byte) 1);
		byte[] is_0_ = new byte[i];
		class527_sub38.anInt10689 = 0;
		method1542(class527_sub38, is_0_, 272878773);
		return is_0_;
	}

	Class77(int i, int i_1_, int i_2_) {
		/* empty */
	}

	public byte[] method1540(byte[] is, byte i) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(is);
		class527_sub38.anInt10689 = (is.length - 4) * 1474750881;
		int i_3_ = class527_sub38.readIntLE((byte) 1);
		byte[] is_4_ = new byte[i_3_];
		class527_sub38.anInt10689 = 0;
		method1542(class527_sub38, is_4_, 429392123);
		return is_4_;
	}

	public byte[] method1541(byte[] is) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(is);
		class527_sub38.anInt10689 = (is.length - 4) * 1474750881;
		int i = class527_sub38.readIntLE((byte) 1);
		byte[] is_5_ = new byte[i];
		class527_sub38.anInt10689 = 0;
		method1542(class527_sub38, is_5_, 1522365772);
		return is_5_;
	}

	public void method1542(RSByteBuffer class527_sub38, byte[] is, int i) {
		if (31 != (class527_sub38.buffer[-441238943 * class527_sub38.anInt10689]) || (class527_sub38.buffer[class527_sub38.anInt10689 * -441238943 + 1]) != -117)
			throw new RuntimeException("");
		if (null == anInflater798)
			anInflater798 = new Inflater(true);
		try {
			anInflater798.setInput(class527_sub38.buffer, class527_sub38.anInt10689 * -441238943 + 10, (class527_sub38.buffer.length - (8 + (10 + -441238943 * (class527_sub38.anInt10689)))));
			anInflater798.inflate(is);
		} catch (Exception exception) {
			anInflater798.reset();
			throw new RuntimeException("");
		}
		anInflater798.reset();
	}

	public Class77() {
		this(-1, 1000000, 1000000);
	}

	static final void method1543(byte i) {
		int i_6_ = Class105.anInt1300 * 351100807;
		int[] is = Class105.anIntArray1301;
		for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
			Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[is[i_7_]];
			if (null != class640_sub1_sub2_sub1_sub2)
				Class695_Sub1.method17366(class640_sub1_sub2_sub1_sub2, false, -220745629);
		}
	}

	static void method1544(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_8_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_9_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		TwitchWebcamDevice twitchwebcamdevice = Class460.method7571(i_8_, (byte) -57);
		TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
		if (twitchwebcamdevice != null)
			twitchwebcamdevicecapability = twitchwebcamdevice.method1692(i_9_);
		if (null == twitchwebcamdevicecapability) {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		} else {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = twitchwebcamdevicecapability.anInt1129 * 654182613;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 268176839 * twitchwebcamdevicecapability.anInt1130;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1984150841 * twitchwebcamdevicecapability.anInt1131;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 187330919 * twitchwebcamdevicecapability.anInt1132;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = twitchwebcamdevicecapability.anInt1133 * 1447398877;
		}
	}
}
