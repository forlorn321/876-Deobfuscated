/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Class84 implements Interface14, Interface7 {
	public Object[][] anObjectArrayArray813;
	public Class462[][] aClass462ArrayArray814;
	public static Class24_Sub1 aClass24_Sub1_815;

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method1578(class527_sub38, i, 495107257);
		}
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_0_ = class527_sub38.readUnsignedByte();
			if (0 == i_0_)
				break;
			method1578(class527_sub38, i_0_, -195699850);
		}
	}

	void method1578(RSByteBuffer class527_sub38, int i, int i_1_) {
		if (1 == i) {
			int i_2_ = class527_sub38.readUnsignedByte();
			if (null == aClass462ArrayArray814)
				aClass462ArrayArray814 = new Class462[i_2_][];
			for (int i_3_ = class527_sub38.readUnsignedByte(); i_3_ != 255; i_3_ = class527_sub38.readUnsignedByte()) {
				int i_4_ = i_3_ & 0x7f;
				boolean bool = (i_3_ & 0x80) != 0;
				Class462[] class462s = new Class462[class527_sub38.readUnsignedByte()];
				for (int i_5_ = 0; i_5_ < class462s.length; i_5_++)
					class462s[i_5_] = ((Class462) Class26.method858(Class462.method7610(134076452), class527_sub38.readUnsignedSmart((byte) -61), -751332564));
				aClass462ArrayArray814[i_4_] = class462s;
				if (bool) {
					if (null == anObjectArrayArray813)
						anObjectArrayArray813 = new Object[aClass462ArrayArray814.length][];
					anObjectArrayArray813[i_4_] = Class352.method6211(class527_sub38, class462s, (byte) 11);
				}
			}
		}
	}

	public void method85() {
		/* empty */
	}

	public void method16(int i, int i_6_) {
		/* empty */
	}

	public void method86(int i) {
		/* empty */
	}

	public void method60(int i) {
		/* empty */
	}

	Class84() {
		/* empty */
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method1578(class527_sub38, i, 414473262);
		}
	}

	public void method84() {
		/* empty */
	}

	void method1579(RSByteBuffer class527_sub38, int i) {
		if (1 == i) {
			int i_7_ = class527_sub38.readUnsignedByte();
			if (null == aClass462ArrayArray814)
				aClass462ArrayArray814 = new Class462[i_7_][];
			for (int i_8_ = class527_sub38.readUnsignedByte(); i_8_ != 255; i_8_ = class527_sub38.readUnsignedByte()) {
				int i_9_ = i_8_ & 0x7f;
				boolean bool = (i_8_ & 0x80) != 0;
				Class462[] class462s = new Class462[class527_sub38.readUnsignedByte()];
				for (int i_10_ = 0; i_10_ < class462s.length; i_10_++)
					class462s[i_10_] = ((Class462) Class26.method858(Class462.method7610(890536263), class527_sub38.readUnsignedSmart((byte) -36), -151928587));
				aClass462ArrayArray814[i_9_] = class462s;
				if (bool) {
					if (null == anObjectArrayArray813)
						anObjectArrayArray813 = new Object[aClass462ArrayArray814.length][];
					anObjectArrayArray813[i_9_] = Class352.method6211(class527_sub38, class462s, (byte) 62);
				}
			}
		}
	}

	void method1580(RSByteBuffer class527_sub38, int i) {
		if (1 == i) {
			int i_11_ = class527_sub38.readUnsignedByte();
			if (null == aClass462ArrayArray814)
				aClass462ArrayArray814 = new Class462[i_11_][];
			for (int i_12_ = class527_sub38.readUnsignedByte(); i_12_ != 255; i_12_ = class527_sub38.readUnsignedByte()) {
				int i_13_ = i_12_ & 0x7f;
				boolean bool = (i_12_ & 0x80) != 0;
				Class462[] class462s = new Class462[class527_sub38.readUnsignedByte()];
				for (int i_14_ = 0; i_14_ < class462s.length; i_14_++)
					class462s[i_14_] = ((Class462) Class26.method858(Class462.method7610(-1371785810), class527_sub38.readUnsignedSmart((byte) -11), -1271079354));
				aClass462ArrayArray814[i_13_] = class462s;
				if (bool) {
					if (null == anObjectArrayArray813)
						anObjectArrayArray813 = new Object[aClass462ArrayArray814.length][];
					anObjectArrayArray813[i_13_] = Class352.method6211(class527_sub38, class462s, (byte) 109);
				}
			}
		}
	}

	public static byte[] method1581(RSByteBuffer class527_sub38, int i, int i_15_) throws IOException {
		ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(class527_sub38.buffer);
		bytearrayinputstream.skip((long) (class527_sub38.anInt10689 * -441238943));
		return Class227.method4305(bytearrayinputstream, i, (byte) 0);
	}
}
