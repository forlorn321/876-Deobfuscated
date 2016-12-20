/* Class208_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class208_Sub14 extends Class208 {
	int anInt9934;
	int anInt9935;

	Class208_Sub14(RSByteBuffer class527_sub38) {
		super(class527_sub38);
		anInt9935 = class527_sub38.readUnsignedShort() * 462048107;
		anInt9934 = class527_sub38.readInt() * 1794697571;
	}

	public void method3846(int i) {
		client.anInt11085 = 1780144433 * client.anInt11019;
		client.anInt11086 = -1974726851 * (client.anInt11019 + 2010548547 * anInt9935);
		Class668.anInt8567 = client.anInt11087 * 840710773;
		Class331_Sub3.anInt10073 = client.anInt11212 * -593517823;
		Class547.anInt7268 = 542725235 * client.anInt11089;
		Class650.anInt8377 = client.anInt11090 * 481054615;
		client.anInt11087 = -199207383 * (anInt9934 * 348119115 >>> 24);
		client.anInt11212 = (348119115 * anInt9934 >>> 16 & 0xff) * 584623933;
		client.anInt11089 = (anInt9934 * 348119115 >>> 8 & 0xff) * -1207278735;
		client.anInt11090 = 821589913 * (348119115 * anInt9934 & 0xff);
	}

	public void method3851() {
		client.anInt11085 = 1780144433 * client.anInt11019;
		client.anInt11086 = -1974726851 * (client.anInt11019 + 2010548547 * anInt9935);
		Class668.anInt8567 = client.anInt11087 * 840710773;
		Class331_Sub3.anInt10073 = client.anInt11212 * -593517823;
		Class547.anInt7268 = 542725235 * client.anInt11089;
		Class650.anInt8377 = client.anInt11090 * 481054615;
		client.anInt11087 = -199207383 * (anInt9934 * 348119115 >>> 24);
		client.anInt11212 = (348119115 * anInt9934 >>> 16 & 0xff) * 584623933;
		client.anInt11089 = (anInt9934 * 348119115 >>> 8 & 0xff) * -1207278735;
		client.anInt11090 = 821589913 * (348119115 * anInt9934 & 0xff);
	}

	public void method3848() {
		client.anInt11085 = 1780144433 * client.anInt11019;
		client.anInt11086 = -1974726851 * (client.anInt11019 + 2010548547 * anInt9935);
		Class668.anInt8567 = client.anInt11087 * 840710773;
		Class331_Sub3.anInt10073 = client.anInt11212 * -593517823;
		Class547.anInt7268 = 542725235 * client.anInt11089;
		Class650.anInt8377 = client.anInt11090 * 481054615;
		client.anInt11087 = -199207383 * (anInt9934 * 348119115 >>> 24);
		client.anInt11212 = (348119115 * anInt9934 >>> 16 & 0xff) * 584623933;
		client.anInt11089 = (anInt9934 * 348119115 >>> 8 & 0xff) * -1207278735;
		client.anInt11090 = 821589913 * (348119115 * anInt9934 & 0xff);
	}

	static void method15622(Class665 class665, int i) {
		class665.anIntArray8525[1769813785 * class665.anInt8526 - 1] = (((Class259) Class590.aClass62_Sub1_7793.method81((class665.anIntArray8525[((1769813785 * class665.anInt8526) - 1)]), -1367370339)).anInt2829 * 1215109845);
	}

	static final void method15623(Class527_Sub38_Sub2 class527_sub38_sub2, int i, Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2, int i_0_, int i_1_) {
		if ((i_0_ & 0x2000) != 0) {
			int i_2_ = class527_sub38_sub2.readUnsignedByteC(-1827285189);
			byte[] is = new byte[i_2_];
			RSByteBuffer class527_sub38 = new RSByteBuffer(is);
			class527_sub38_sub2.readBytes(is, 0, i_2_, 1133251846);
			Class105.aClass527_Sub38Array1305[i] = class527_sub38;
			class640_sub1_sub2_sub1_sub2.method18874(class527_sub38, -1720390257);
		}
		if ((i_0_ & 0x1000) != 0) {
			int i_3_ = class527_sub38_sub2.readUnsignedShort();
			int i_4_ = class527_sub38_sub2.readIntV2();
			if (i_3_ == 65535)
				i_3_ = -1;
			int i_5_ = class527_sub38_sub2.readUnsignedByte();
			int i_6_ = i_5_ & 0x7;
			int i_7_ = i_5_ >> 3 & 0xf;
			if (15 == i_7_)
				i_7_ = -1;
			boolean bool = (i_5_ >> 7 & 0x1) == 1;
			class640_sub1_sub2_sub1_sub2.method18537(i_3_, i_4_, i_6_, i_7_, bool, 1, (byte) 106);
		}
		if (0 != (i_0_ & 0x10)) {
			int[] is = new int[4];
			for (int i_8_ = 0; i_8_ < 4; i_8_++)
				is[i_8_] = class527_sub38_sub2.method16466(-1831831073);
			int i_9_ = class527_sub38_sub2.readUnsignedByteC(-1883369055);
			Class524.method8717(class640_sub1_sub2_sub1_sub2, is, i_9_, false, -397006101);
		}
		if ((i_0_ & 0x40) != 0) {
			class640_sub1_sub2_sub1_sub2.anInt12178 = class527_sub38_sub2.readUnsignedShortLE((byte) 99) * -791414201;
			if (0 == -1057678739 * class640_sub1_sub2_sub1_sub2.anInt11942) {
				class640_sub1_sub2_sub1_sub2.method18527(294621047 * class640_sub1_sub2_sub1_sub2.anInt12178, -497551853);
				class640_sub1_sub2_sub1_sub2.anInt12178 = 791414201;
			}
		}
		if (0 != (i_0_ & 0x100000)) {
			class640_sub1_sub2_sub1_sub2.aByte11887 = class527_sub38_sub2.readByteC((byte) 73);
			class640_sub1_sub2_sub1_sub2.aByte11907 = class527_sub38_sub2.readByteC((byte) 88);
			class640_sub1_sub2_sub1_sub2.aByte11929 = class527_sub38_sub2.readByteC((byte) 123);
			class640_sub1_sub2_sub1_sub2.aByte11898 = (byte) class527_sub38_sub2.readUnsignedByte128();
			class640_sub1_sub2_sub1_sub2.anInt11925 = (client.anInt11019 + class527_sub38_sub2.readUnsignedShortLE((byte) 120)) * 443123777;
			class640_sub1_sub2_sub1_sub2.anInt11926 = ((client.anInt11019 + class527_sub38_sub2.readUnsignedShortLE128()) * -1162867085);
		}
		if (0 != (i_0_ & 0x4)) {
			int i_10_ = class527_sub38_sub2.readUnsignedShortLE128();
			int i_11_ = class527_sub38_sub2.readInt();
			if (i_10_ == 65535)
				i_10_ = -1;
			int i_12_ = class527_sub38_sub2.readUnsignedByte128();
			int i_13_ = i_12_ & 0x7;
			int i_14_ = i_12_ >> 3 & 0xf;
			if (15 == i_14_)
				i_14_ = -1;
			boolean bool = 1 == (i_12_ >> 7 & 0x1);
			class640_sub1_sub2_sub1_sub2.method18537(i_10_, i_11_, i_13_, i_14_, bool, 0, (byte) 117);
		}
		if ((i_0_ & 0x200) != 0) {
			int i_15_ = class527_sub38_sub2.readUnsignedByte128();
			int[] is = new int[i_15_];
			int[] is_16_ = new int[i_15_];
			int[] is_17_ = new int[i_15_];
			for (int i_18_ = 0; i_18_ < i_15_; i_18_++) {
				is[i_18_] = class527_sub38_sub2.method16466(-1667221518);
				is_16_[i_18_] = class527_sub38_sub2.readUnsignedByteC(-2128161342);
				is_17_[i_18_] = class527_sub38_sub2.readUnsignedShort128();
			}
			Class71.method1492(class640_sub1_sub2_sub1_sub2, is, is_16_, is_17_, 385185328);
		}
		if (0 != (i_0_ & 0x80000)) {
			int i_19_ = class527_sub38_sub2.readUnsignedByte();
			int[] is = new int[i_19_];
			int[] is_20_ = new int[i_19_];
			for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
				int i_22_ = class527_sub38_sub2.readUnsignedShort128();
				if ((i_22_ & 0xc000) == 49152) {
					int i_23_ = class527_sub38_sub2.readUnsignedShortLE128();
					is[i_21_] = i_22_ << 16 | i_23_;
				} else
					is[i_21_] = i_22_;
				is_20_[i_21_] = class527_sub38_sub2.readUnsignedShortLE128();
			}
			class640_sub1_sub2_sub1_sub2.method18530(is, is_20_, (byte) 7);
		}
		if (0 != (i_0_ & 0x200000)) {
			int i_24_ = class527_sub38_sub2.readUnsignedShortLE((byte) 108);
			int i_25_ = class527_sub38_sub2.readIntV1();
			if (65535 == i_24_)
				i_24_ = -1;
			int i_26_ = class527_sub38_sub2.readUnsignedByteC(-390340675);
			int i_27_ = i_26_ & 0x7;
			int i_28_ = i_26_ >> 3 & 0xf;
			if (15 == i_28_)
				i_28_ = -1;
			boolean bool = 1 == (i_26_ >> 7 & 0x1);
			class640_sub1_sub2_sub1_sub2.method18537(i_24_, i_25_, i_27_, i_28_, bool, 3, (byte) 123);
		}
		if (0 != (i_0_ & 0x4000)) {
			String string = class527_sub38_sub2.readString(851784840);
			if (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 == class640_sub1_sub2_sub1_sub2)
				Class99.method1766(2, 0, class640_sub1_sub2_sub1_sub2.method18879(true, (byte) -20), class640_sub1_sub2_sub1_sub2.method18877(false, (byte) -110), class640_sub1_sub2_sub1_sub2.aString12202, string, null, 907044838);
			class640_sub1_sub2_sub1_sub2.method18882(string, 0, 0, 82678984);
		}
		if ((i_0_ & 0x20000) != 0) {
			class527_sub38_sub2.anInt10689 += -1345465534;
			int i_29_ = ((class527_sub38_sub2.buffer[((class527_sub38_sub2.anInt10689 += 1474750881) * -441238943) - 1]) & 0xff);
			for (int i_30_ = 0; i_30_ < i_29_; i_30_++) {
				int i_31_ = class527_sub38_sub2.readUnsigned128Byte();
				Class475 class475 = ((Class475) Class26.method858(Class475.method7767((byte) -13), i_31_, -410211397));
				Class425 class425 = (Class248.aClass95_Sub1_Sub1_2731.method14484(class527_sub38_sub2, class475, (byte) 2));
				class640_sub1_sub2_sub1_sub2.anInterface3_11953.method18(class425.anInt4803 * 494563151, class425.anObject4804, -691245535);
			}
		}
		if ((i_0_ & 0x40000) != 0) {
			class640_sub1_sub2_sub1_sub2.anInterface3_11953.method19((byte) 7);
			class527_sub38_sub2.anInt10689 += -1345465534;
			int i_32_ = ((class527_sub38_sub2.buffer[((class527_sub38_sub2.anInt10689 += 1474750881) * -441238943) - 1]) & 0xff);
			for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
				int i_34_ = class527_sub38_sub2.readUnsignedByteC(-342450253);
				Class475 class475 = ((Class475) Class26.method858(Class475.method7767((byte) -19), i_34_, -643141510));
				Class425 class425 = (Class248.aClass95_Sub1_Sub1_2731.method14484(class527_sub38_sub2, class475, (byte) 2));
				class640_sub1_sub2_sub1_sub2.anInterface3_11953.method18(494563151 * class425.anInt4803, class425.anObject4804, -2113116104);
			}
		}
		if ((i_0_ & 0x400000) != 0) {
			String string = class527_sub38_sub2.readString(1531261505);
			int i_35_ = class527_sub38_sub2.readUnsignedByte128();
			if (0 != (i_35_ & 0x1))
				Class99.method1766(2, i_35_, class640_sub1_sub2_sub1_sub2.method18879(true, (byte) -47), class640_sub1_sub2_sub1_sub2.method18877(false, (byte) -97), class640_sub1_sub2_sub1_sub2.aString12202, string, null, -1794745818);
			class640_sub1_sub2_sub1_sub2.method18882(string, 0, 0, 487582315);
		}
		if (0 != (i_0_ & 0x8)) {
			int i_36_ = class527_sub38_sub2.readUnsignedByteC(141796222);
			byte[] is = new byte[i_36_];
			RSByteBuffer class527_sub38 = new RSByteBuffer(is);
			class527_sub38_sub2.readBytes(is, 0, i_36_, -2104106831);
			Class105.aClass527_Sub38Array1298[i] = class527_sub38;
			class640_sub1_sub2_sub1_sub2.method18873(class527_sub38, 348521444);
		}
		if ((i_0_ & 0x1) != 0) {
			int i_37_ = class527_sub38_sub2.readUnsigned128Byte();
			if (i_37_ > 0) {
				for (int i_38_ = 0; i_38_ < i_37_; i_38_++) {
					int i_39_ = -1;
					int i_40_ = -1;
					int i_41_ = -1;
					int i_42_ = class527_sub38_sub2.readUnsignedSmart((byte) -49);
					if (32767 == i_42_) {
						i_42_ = class527_sub38_sub2.readUnsignedSmart((byte) -70);
						i_40_ = class527_sub38_sub2.readUnsignedSmart((byte) -22);
						i_39_ = class527_sub38_sub2.readUnsignedSmart((byte) -83);
						i_41_ = class527_sub38_sub2.readUnsignedSmart((byte) -11);
					} else if (32766 != i_42_)
						i_40_ = class527_sub38_sub2.readUnsignedSmart((byte) -96);
					else {
						i_42_ = -1;
						i_40_ = class527_sub38_sub2.readUnsignedByteC(969893344);
					}
					int i_43_ = class527_sub38_sub2.readUnsignedSmart((byte) -43);
					class640_sub1_sub2_sub1_sub2.method18538(i_42_, i_40_, i_39_, i_41_, client.anInt11019, i_43_, -843286601);
				}
			}
			int i_44_ = class527_sub38_sub2.readUnsignedByteC(-22086516);
			if (i_44_ > 0) {
				for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
					int i_46_ = class527_sub38_sub2.readUnsignedSmart((byte) -127);
					int i_47_ = class527_sub38_sub2.readUnsignedSmart((byte) -89);
					if (i_47_ != 32767) {
						int i_48_ = class527_sub38_sub2.readUnsignedSmart((byte) -47);
						int i_49_ = class527_sub38_sub2.readUnsignedByte128();
						int i_50_ = (i_47_ > 0 ? class527_sub38_sub2.readUnsignedByteC(-363121407) : i_49_);
						class640_sub1_sub2_sub1_sub2.method18535(i_46_, (client.anInt11019), i_47_, i_48_, i_49_, i_50_, 2122228479);
					} else
						class640_sub1_sub2_sub1_sub2.method18536(i_46_, 1777526183);
				}
			}
		}
		if (0 != (i_0_ & 0x10000)) {
			int i_51_ = class527_sub38_sub2.readUnsignedShortLE128();
			int i_52_ = class527_sub38_sub2.readLEInt();
			if (i_51_ == 65535)
				i_51_ = -1;
			int i_53_ = class527_sub38_sub2.readUnsignedByte128();
			int i_54_ = i_53_ & 0x7;
			int i_55_ = i_53_ >> 3 & 0xf;
			if (i_55_ == 15)
				i_55_ = -1;
			boolean bool = 1 == (i_53_ >> 7 & 0x1);
			class640_sub1_sub2_sub1_sub2.method18537(i_51_, i_52_, i_54_, i_55_, bool, 4, (byte) 46);
		}
		if (0 != (i_0_ & 0x2)) {
			class640_sub1_sub2_sub1_sub2.anInt11916 = class527_sub38_sub2.readByte() * 1798102493;
			class640_sub1_sub2_sub1_sub2.anInt11886 = class527_sub38_sub2.read128Byte((byte) 64) * 1044896249;
			class640_sub1_sub2_sub1_sub2.anInt11895 = class527_sub38_sub2.read128Byte((byte) 95) * -873953571;
			class640_sub1_sub2_sub1_sub2.anInt11909 = class527_sub38_sub2.readByteC((byte) 88) * 1318952643;
			class640_sub1_sub2_sub1_sub2.anInt11920 = class527_sub38_sub2.readByte128((byte) -79) * -935178327;
			class640_sub1_sub2_sub1_sub2.anInt11900 = class527_sub38_sub2.readByte() * 677568689;
			class640_sub1_sub2_sub1_sub2.anInt11923 = (class527_sub38_sub2.readUnsignedShortLE128() + client.anInt11019) * -1540379769;
			class640_sub1_sub2_sub1_sub2.anInt11930 = (class527_sub38_sub2.readUnsignedShortLE((byte) 111) + client.anInt11019) * -1303412629;
			class640_sub1_sub2_sub1_sub2.anInt11924 = class527_sub38_sub2.readUnsignedShort() * 1662470151;
			class640_sub1_sub2_sub1_sub2.anInt11942 = 1705181029;
			class640_sub1_sub2_sub1_sub2.anInt11947 = 0;
			class640_sub1_sub2_sub1_sub2.anInt11916 += (class640_sub1_sub2_sub1_sub2.anIntArray11902[0] * 1798102493);
			class640_sub1_sub2_sub1_sub2.anInt11886 += (1044896249 * class640_sub1_sub2_sub1_sub2.anIntArray11944[0]);
			class640_sub1_sub2_sub1_sub2.anInt11895 += (-873953571 * class640_sub1_sub2_sub1_sub2.anIntArray11902[0]);
			class640_sub1_sub2_sub1_sub2.anInt11909 += (class640_sub1_sub2_sub1_sub2.anIntArray11944[0] * 1318952643);
			class640_sub1_sub2_sub1_sub2.anInt11920 += class640_sub1_sub2_sub1_sub2.aByte10864 * -935178327;
			class640_sub1_sub2_sub1_sub2.anInt11900 += class640_sub1_sub2_sub1_sub2.aByte10864 * 677568689;
		}
		if ((i_0_ & 0x400) != 0) {
			class640_sub1_sub2_sub1_sub2.aClass210_12185 = (Class210) Class26.method858(Class210.method3870((byte) 32), class527_sub38_sub2.readUnsignedByte(), -285199633);
			if (null == class640_sub1_sub2_sub1_sub2.aClass210_12185)
				class640_sub1_sub2_sub1_sub2.aClass210_12185 = Class210.aClass210_2251;
		}
		if ((i_0_ & 0x8000) != 0) {
			int i_56_ = class527_sub38_sub2.readUnsignedShortLE128();
			int i_57_ = class527_sub38_sub2.readLEInt();
			if (i_56_ == 65535)
				i_56_ = -1;
			int i_58_ = class527_sub38_sub2.readUnsignedByte();
			int i_59_ = i_58_ & 0x7;
			int i_60_ = i_58_ >> 3 & 0xf;
			if (i_60_ == 15)
				i_60_ = -1;
			boolean bool = (i_58_ >> 7 & 0x1) == 1;
			class640_sub1_sub2_sub1_sub2.method18537(i_56_, i_57_, i_59_, i_60_, bool, 2, (byte) 42);
		}
		if ((i_0_ & 0x20) != 0) {
			int i_61_ = class527_sub38_sub2.readUnsignedShortLE128();
			if (65535 == i_61_)
				i_61_ = -1;
			class640_sub1_sub2_sub1_sub2.anInt11910 = -1271780505 * i_61_;
		}
		if ((i_0_ & 0x800000) != 0)
			class640_sub1_sub2_sub1_sub2.aBool12180 = class527_sub38_sub2.readUnsigned128Byte() == 1;
	}
}
