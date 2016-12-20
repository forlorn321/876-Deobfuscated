/* Class208_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class208_Sub21 extends Class208 {
	long aLong9961;
	int anInt9962;

	public void method3846(int i) {
		Node_Sub6 class527_sub7 = (Node_Sub6) Class209.aClass14_2236.method709(aLong9961 * 7203496687982350979L);
		if (class527_sub7 != null)
			class527_sub7.anInt10398 = 40927705 * anInt9962;
		else
			Class209.aClass14_2236.method714(new Node_Sub6(anInt9962 * 1282026891), aLong9961 * 7203496687982350979L);
	}

	Class208_Sub21(RSByteBuffer class527_sub38, boolean bool) {
		super(class527_sub38);
		int i = class527_sub38.readUnsignedShort();
		if (bool)
			aLong9961 = (0x100000000L | (long) i) * -910799809564750805L;
		else
			aLong9961 = (long) i * -910799809564750805L;
		anInt9962 = class527_sub38.readInt() * 467145251;
	}

	public void method3848() {
		Node_Sub6 class527_sub7 = (Node_Sub6) Class209.aClass14_2236.method709(aLong9961 * 7203496687982350979L);
		if (class527_sub7 != null)
			class527_sub7.anInt10398 = 40927705 * anInt9962;
		else
			Class209.aClass14_2236.method714(new Node_Sub6(anInt9962 * 1282026891), aLong9961 * 7203496687982350979L);
	}

	public void method3851() {
		Node_Sub6 class527_sub7 = (Node_Sub6) Class209.aClass14_2236.method709(aLong9961 * 7203496687982350979L);
		if (class527_sub7 != null)
			class527_sub7.anInt10398 = 40927705 * anInt9962;
		else
			Class209.aClass14_2236.method714(new Node_Sub6(anInt9962 * 1282026891), aLong9961 * 7203496687982350979L);
	}

	static final void method15635(int i) {
		Class527_Sub38_Sub2 class527_sub38_sub2 = client.aClass109_11067.aClass527_Sub38_Sub2_1364;
		for (int i_0_ = 0; i_0_ < client.anInt11061 * 1741574761; i_0_++) {
			int i_1_ = client.anIntArray10988[i_0_];
			Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) (((Class527_Sub26) client.aClass14_10989.method709((long) i_1_)).anObject10522));
			class527_sub38_sub2.readUnsignedShort();
			int i_2_ = class527_sub38_sub2.readUnsignedByte();
			if ((i_2_ & 0x2) != 0)
				i_2_ += class527_sub38_sub2.readUnsignedByte() << 8;
			if (0 != (i_2_ & 0x200))
				i_2_ += class527_sub38_sub2.readUnsignedByte() << 16;
			if ((i_2_ & 0x400000) != 0)
				i_2_ += class527_sub38_sub2.readUnsignedByte() << 24;
			if ((i_2_ & 0x800000) != 0) {
				class640_sub1_sub2_sub1_sub1.aString12169 = class527_sub38_sub2.readString(1226367705);
				if ("".equals(class640_sub1_sub2_sub1_sub1.aString12169) || (class640_sub1_sub2_sub1_sub1.aString12169.equals(class640_sub1_sub2_sub1_sub1.aClass295_12168.aString3279)))
					class640_sub1_sub2_sub1_sub1.aString12169 = (class640_sub1_sub2_sub1_sub1.aClass295_12168.aString3279);
			}
			if ((i_2_ & 0x800) != 0) {
				class640_sub1_sub2_sub1_sub1.anInt12166 = class527_sub38_sub2.readUnsignedShortLE128() * 2132850665;
				if (65535 == class640_sub1_sub2_sub1_sub1.anInt12166 * -710569895)
					class640_sub1_sub2_sub1_sub1.anInt12166 = -2132850665;
			}
			if ((i_2_ & 0x400) != 0) {
				int i_3_ = class527_sub38_sub2.readUnsignedShortLE((byte) 125);
				int i_4_ = class527_sub38_sub2.readInt();
				if (65535 == i_3_)
					i_3_ = -1;
				int i_5_ = class527_sub38_sub2.readUnsigned128Byte();
				int i_6_ = i_5_ & 0x7;
				int i_7_ = i_5_ >> 3 & 0xf;
				if (15 == i_7_)
					i_7_ = -1;
				boolean bool = 1 == (i_5_ >> 7 & 0x1);
				class640_sub1_sub2_sub1_sub1.method18537(i_3_, i_4_, i_6_, i_7_, bool, 1, (byte) 24);
			}
			if ((i_2_ & 0x10000) != 0) {
				class640_sub1_sub2_sub1_sub1.anInterface3_11953.method19((byte) 7);
				class527_sub38_sub2.anInt10689 += -1345465534;
				int i_8_ = ((class527_sub38_sub2.buffer[((class527_sub38_sub2.anInt10689 += 1474750881) * -441238943) - 1]) & 0xff);
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
					int i_10_ = class527_sub38_sub2.readUnsignedByte();
					Class475 class475 = ((Class475) Class26.method858(Class475.method7767((byte) 12), i_10_, 1709122822));
					Class425 class425 = (IncomingPacket.aClass95_Sub1_Sub2_4802.method14484(class527_sub38_sub2, class475, (byte) 2));
					class640_sub1_sub2_sub1_sub1.anInterface3_11953.method18(class425.anInt4803 * 494563151, class425.anObject4804, -162639583);
				}
			}
			if ((i_2_ & 0x40) != 0) {
				class640_sub1_sub2_sub1_sub1.anInt12161 = class527_sub38_sub2.readUnsignedShortLE((byte) 97) * 414989425;
				class640_sub1_sub2_sub1_sub1.anInt12175 = (class527_sub38_sub2.readUnsignedShortLE128() * -1294511563);
			}
			if ((i_2_ & 0x1) != 0) {
				if (class640_sub1_sub2_sub1_sub1.aClass295_12168.method5309(929092862))
					Class48.method1245(class640_sub1_sub2_sub1_sub1, (byte) -95);
				class640_sub1_sub2_sub1_sub1.method18833((Class295) (Class381.aClass24_Sub9_3936.method81(class527_sub38_sub2.method16466(-2044897212), 1726677089)), (i_2_ & 0x800000) == 0, (i_2_ & 0x20000) == 0, true, (byte) 98);
				class640_sub1_sub2_sub1_sub1.method18585(897343531 * (class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3342), 604609799);
				class640_sub1_sub2_sub1_sub1.anInt11937 = ((class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3311 * 1076155623) << 3) * 57049381;
				if (class640_sub1_sub2_sub1_sub1.aClass295_12168.method5309(892397238))
					Class622.method10233(class640_sub1_sub2_sub1_sub1.aByte10864, class640_sub1_sub2_sub1_sub1.anIntArray11902[0], class640_sub1_sub2_sub1_sub1.anIntArray11944[0], 0, null, class640_sub1_sub2_sub1_sub1, null, 931825955);
			}
			if ((i_2_ & 0x2000000) != 0) {
				int i_11_ = class527_sub38_sub2.readUnsignedShortLE((byte) 122);
				int i_12_ = class527_sub38_sub2.readIntV2();
				if (65535 == i_11_)
					i_11_ = -1;
				int i_13_ = class527_sub38_sub2.readUnsignedByte128();
				int i_14_ = i_13_ & 0x7;
				int i_15_ = i_13_ >> 3 & 0xf;
				if (i_15_ == 15)
					i_15_ = -1;
				boolean bool = 1 == (i_13_ >> 7 & 0x1);
				class640_sub1_sub2_sub1_sub1.method18537(i_11_, i_12_, i_14_, i_15_, bool, 2, (byte) 48);
			}
			if (0 != (i_2_ & 0x20000)) {
				class640_sub1_sub2_sub1_sub1.anInt12170 = class527_sub38_sub2.readUnsignedShort128() * 940215867;
				if (65535 == -318039309 * class640_sub1_sub2_sub1_sub1.anInt12170)
					class640_sub1_sub2_sub1_sub1.anInt12170 = -882122449 * (class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3285);
			}
			if ((i_2_ & 0x20000000) != 0)
				class640_sub1_sub2_sub1_sub1.aBool11939 = class527_sub38_sub2.readUnsignedByteC(58030804) == 1;
			if (0 != (i_2_ & 0x80)) {
				int i_16_ = class527_sub38_sub2.readUnsignedByteC(1104499704);
				if (i_16_ > 0) {
					for (int i_17_ = 0; i_17_ < i_16_; i_17_++) {
						int i_18_ = -1;
						int i_19_ = -1;
						int i_20_ = -1;
						int i_21_ = class527_sub38_sub2.readUnsignedSmart((byte) -47);
						if (i_21_ == 32767) {
							i_21_ = class527_sub38_sub2.readUnsignedSmart((byte) -100);
							i_19_ = class527_sub38_sub2.readUnsignedSmart((byte) -64);
							i_18_ = class527_sub38_sub2.readUnsignedSmart((byte) -1);
							i_20_ = class527_sub38_sub2.readUnsignedSmart((byte) -106);
						} else if (i_21_ != 32766)
							i_19_ = class527_sub38_sub2.readUnsignedSmart((byte) -59);
						else {
							i_21_ = -1;
							i_19_ = class527_sub38_sub2.readUnsignedByteC(119937348);
						}
						int i_22_ = class527_sub38_sub2.readUnsignedSmart((byte) -45);
						class640_sub1_sub2_sub1_sub1.method18538(i_21_, i_19_, i_18_, i_20_, (client.anInt11019), i_22_, 70870272);
					}
				}
				int i_23_ = class527_sub38_sub2.readUnsignedByte();
				if (i_23_ > 0) {
					for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
						int i_25_ = class527_sub38_sub2.readUnsignedSmart((byte) -122);
						int i_26_ = class527_sub38_sub2.readUnsignedSmart((byte) -10);
						if (32767 != i_26_) {
							int i_27_ = class527_sub38_sub2.readUnsignedSmart((byte) -108);
							int i_28_ = class527_sub38_sub2.readUnsignedByteC(400394173);
							int i_29_ = (i_26_ > 0 ? class527_sub38_sub2.readUnsignedByteC(370361646) : i_28_);
							class640_sub1_sub2_sub1_sub1.method18535(i_25_, client.anInt11019, i_26_, i_27_, i_28_, i_29_, -216663154);
						} else
							class640_sub1_sub2_sub1_sub1.method18536(i_25_, 2054525983);
					}
				}
			}
			if (0 != (i_2_ & 0x200000)) {
				int i_30_ = ((class527_sub38_sub2.buffer[((class527_sub38_sub2.anInt10689 += 1474750881) * -441238943) - 1]) & 0xff);
				for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
					int i_32_ = class527_sub38_sub2.readUnsigned128Byte();
					int i_33_ = class527_sub38_sub2.readLEInt();
					int i_34_ = class527_sub38_sub2.read24BitUnsignedIntegerV2(-907979747);
					class640_sub1_sub2_sub1_sub1.method18848(i_32_, i_33_, i_34_, 1809199651);
				}
			}
			if ((i_2_ & 0x4000000) != 0) {
				int i_35_ = class527_sub38_sub2.readUnsignedShort128();
				int i_36_ = class527_sub38_sub2.readInt();
				if (65535 == i_35_)
					i_35_ = -1;
				int i_37_ = class527_sub38_sub2.readUnsigned128Byte();
				int i_38_ = i_37_ & 0x7;
				int i_39_ = i_37_ >> 3 & 0xf;
				if (i_39_ == 15)
					i_39_ = -1;
				boolean bool = (i_37_ >> 7 & 0x1) == 1;
				class640_sub1_sub2_sub1_sub1.method18537(i_35_, i_36_, i_38_, i_39_, bool, 3, (byte) 111);
			}
			if (0 != (i_2_ & 0x80000)) {
				class527_sub38_sub2.anInt10689 += -1345465534;
				int i_40_ = ((class527_sub38_sub2.buffer[((class527_sub38_sub2.anInt10689 += 1474750881) * -441238943) - 1]) & 0xff);
				for (int i_41_ = 0; i_41_ < i_40_; i_41_++) {
					int i_42_ = class527_sub38_sub2.readUnsignedByte();
					Class475 class475 = ((Class475) Class26.method858(Class475.method7767((byte) 21), i_42_, 311406165));
					Class425 class425 = (IncomingPacket.aClass95_Sub1_Sub2_4802.method14484(class527_sub38_sub2, class475, (byte) 2));
					class640_sub1_sub2_sub1_sub1.anInterface3_11953.method18(class425.anInt4803 * 494563151, class425.anObject4804, -142506919);
				}
			}
			if ((i_2_ & 0x8000000) != 0) {
				class640_sub1_sub2_sub1_sub1.aByte11887 = class527_sub38_sub2.readByteC((byte) 36);
				class640_sub1_sub2_sub1_sub1.aByte11907 = class527_sub38_sub2.readByte128((byte) -125);
				class640_sub1_sub2_sub1_sub1.aByte11929 = class527_sub38_sub2.readByte128((byte) -60);
				class640_sub1_sub2_sub1_sub1.aByte11898 = (byte) class527_sub38_sub2.readUnsignedByte128();
				class640_sub1_sub2_sub1_sub1.anInt11925 = ((client.anInt11019 + class527_sub38_sub2.readUnsignedShort128()) * 443123777);
				class640_sub1_sub2_sub1_sub1.anInt11926 = ((client.anInt11019 + class527_sub38_sub2.readUnsignedShortLE128()) * -1162867085);
			}
			if ((i_2_ & 0x4) != 0) {
				int i_43_ = class527_sub38_sub2.readUnsignedShort128();
				int i_44_ = class527_sub38_sub2.readInt();
				if (i_43_ == 65535)
					i_43_ = -1;
				int i_45_ = class527_sub38_sub2.readUnsignedByte128();
				int i_46_ = i_45_ & 0x7;
				int i_47_ = i_45_ >> 3 & 0xf;
				if (15 == i_47_)
					i_47_ = -1;
				boolean bool = 1 == (i_45_ >> 7 & 0x1);
				class640_sub1_sub2_sub1_sub1.method18537(i_43_, i_44_, i_46_, i_47_, bool, 0, (byte) 99);
			}
			if (0 != (i_2_ & 0x40000)) {
				int i_48_ = class527_sub38_sub2.readUnsignedByte();
				int[] is = new int[8];
				short[] is_49_ = new short[8];
				for (int i_50_ = 0; i_50_ < 8; i_50_++) {
					if (0 != (i_48_ & 1 << i_50_)) {
						is[i_50_] = class527_sub38_sub2.method16466(-1638311680);
						is_49_[i_50_] = (short) class527_sub38_sub2.method16606(-139066624);
					} else {
						is[i_50_] = -1;
						is_49_[i_50_] = (short) -1;
					}
				}
				class640_sub1_sub2_sub1_sub1.aClass297_12164 = new Class297(is, is_49_);
			}
			if ((i_2_ & 0x20) != 0) {
				int[] is = new int[4];
				for (int i_51_ = 0; i_51_ < 4; i_51_++)
					is[i_51_] = class527_sub38_sub2.method16466(-2100532043);
				int i_52_ = class527_sub38_sub2.readUnsignedByte128();
				Class524.method8717(class640_sub1_sub2_sub1_sub1, is, i_52_, true, -397006101);
			}
			if ((i_2_ & 0x1000) != 0) {
				int i_53_ = class527_sub38_sub2.readUnsignedByte128();
				int[] is = new int[i_53_];
				int[] is_54_ = new int[i_53_];
				int[] is_55_ = new int[i_53_];
				for (int i_56_ = 0; i_56_ < i_53_; i_56_++) {
					int i_57_ = class527_sub38_sub2.method16466(-1693153195);
					is[i_56_] = i_57_;
					is_54_[i_56_] = class527_sub38_sub2.readUnsigned128Byte();
					is_55_[i_56_] = class527_sub38_sub2.readUnsignedShort128();
				}
				Class71.method1492(class640_sub1_sub2_sub1_sub1, is, is_54_, is_55_, -1672835997);
			}
			if ((i_2_ & 0x10000000) != 0) {
				int i_58_ = class527_sub38_sub2.readUnsignedShortLE((byte) 122);
				int i_59_ = class527_sub38_sub2.readInt();
				if (65535 == i_58_)
					i_58_ = -1;
				int i_60_ = class527_sub38_sub2.readUnsignedByte();
				int i_61_ = i_60_ & 0x7;
				int i_62_ = i_60_ >> 3 & 0xf;
				if (i_62_ == 15)
					i_62_ = -1;
				boolean bool = (i_60_ >> 7 & 0x1) == 1;
				class640_sub1_sub2_sub1_sub1.method18537(i_58_, i_59_, i_61_, i_62_, bool, 4, (byte) 87);
			}
			if ((i_2_ & 0x1000000) != 0)
				class640_sub1_sub2_sub1_sub1.anInt12176 = class527_sub38_sub2.readUnsignedByteC(1090878277) * 1936638967;
			if (0 != (i_2_ & 0x10)) {
				class640_sub1_sub2_sub1_sub1.anInt11910 = class527_sub38_sub2.readUnsignedShort() * -1271780505;
				if (65535 == class640_sub1_sub2_sub1_sub1.anInt11910 * 816496727)
					class640_sub1_sub2_sub1_sub1.anInt11910 = 1271780505;
			}
			if ((i_2_ & 0x100000) != 0) {
				int i_63_ = (class640_sub1_sub2_sub1_sub1.aClass295_12168.anIntArray3282).length;
				int i_64_ = 0;
				if (null != (class640_sub1_sub2_sub1_sub1.aClass295_12168.aShortArray3286))
					i_64_ = (class640_sub1_sub2_sub1_sub1.aClass295_12168.aShortArray3286).length;
				int i_65_ = 0;
				if (null != (class640_sub1_sub2_sub1_sub1.aClass295_12168.aShortArray3289))
					i_64_ = (class640_sub1_sub2_sub1_sub1.aClass295_12168.aShortArray3289).length;
				int i_66_ = class527_sub38_sub2.readUnsignedByte();
				if ((i_66_ & 0x1) != 1) {
					class527_sub38_sub2.anInt10689 += -1345465534;
					int[] is = null;
					if ((i_66_ & 0x2) == 2) {
						is = new int[i_63_];
						for (int i_67_ = 0; i_67_ < i_63_; i_67_++)
							is[i_67_] = class527_sub38_sub2.method16466(-2042538483);
					}
					short[] is_68_ = null;
					if ((i_66_ & 0x4) == 4) {
						is_68_ = new short[i_64_];
						for (int i_69_ = 0; i_69_ < i_64_; i_69_++)
							is_68_[i_69_] = (short) class527_sub38_sub2.readUnsignedShort();
					}
					short[] is_70_ = null;
					if (8 == (i_66_ & 0x8)) {
						is_70_ = new short[i_65_];
						for (int i_71_ = 0; i_71_ < i_65_; i_71_++)
							is_70_[i_71_] = (short) class527_sub38_sub2.readUnsignedShort128();
					}
					long l = (long) ((Class640_Sub1_Sub2_Sub1_Sub1.anInt12165 += 768707353) * -1117347543 - 1);
					new Class308(l, is, null, null, null, is_68_, is_70_);
				}
			}
			if ((i_2_ & 0x4000) != 0) {
				int i_72_ = class527_sub38_sub2.readUnsignedByte();
				int[] is = new int[i_72_];
				int[] is_73_ = new int[i_72_];
				for (int i_74_ = 0; i_74_ < i_72_; i_74_++) {
					int i_75_ = class527_sub38_sub2.readUnsignedShortLE128();
					if ((i_75_ & 0xc000) == 49152) {
						int i_76_ = class527_sub38_sub2.readUnsignedShort();
						is[i_74_] = i_75_ << 16 | i_76_;
					} else
						is[i_74_] = i_75_;
					is_73_[i_74_] = class527_sub38_sub2.readUnsignedShortLE((byte) 103);
				}
				class640_sub1_sub2_sub1_sub1.method18530(is, is_73_, (byte) 7);
			}
			if ((i_2_ & 0x8) != 0)
				class640_sub1_sub2_sub1_sub1.method18841(class527_sub38_sub2.readString(1869582270), 0, 0, 699555823);
			if (0 != (i_2_ & 0x8000)) {
				int i_77_ = (class640_sub1_sub2_sub1_sub1.aClass295_12168.anIntArray3281).length;
				int i_78_ = 0;
				if (null != (class640_sub1_sub2_sub1_sub1.aClass295_12168.aShortArray3286))
					i_78_ = (class640_sub1_sub2_sub1_sub1.aClass295_12168.aShortArray3286).length;
				int i_79_ = 0;
				if (null != (class640_sub1_sub2_sub1_sub1.aClass295_12168.aShortArray3289))
					i_79_ = (class640_sub1_sub2_sub1_sub1.aClass295_12168.aShortArray3289).length;
				int i_80_ = class527_sub38_sub2.readUnsigned128Byte();
				if ((i_80_ & 0x1) == 1)
					class640_sub1_sub2_sub1_sub1.aClass308_12163 = null;
				else {
					class527_sub38_sub2.anInt10689 += -1345465534;
					int[] is = null;
					float[] fs = null;
					int[][] is_81_ = null;
					int[][] is_82_ = null;
					if ((i_80_ & 0x2) == 2) {
						is = new int[i_77_];
						if (16 == (i_80_ & 0x10)) {
							fs = new float[i_77_];
							is_81_ = new int[i_77_][3];
							is_82_ = new int[i_77_][3];
						}
						for (int i_83_ = 0; i_83_ < i_77_; i_83_++) {
							is[i_83_] = class527_sub38_sub2.method16466(-1811029439);
							if ((i_80_ & 0x10) == 16 && -1 != is[i_83_]) {
								fs[i_83_] = class527_sub38_sub2.readFloat(-1039861104);
								for (int i_84_ = 0; i_84_ < 3; i_84_++)
									is_81_[i_83_][i_84_] = class527_sub38_sub2.method16481(1539376156);
								for (int i_85_ = 0; i_85_ < 3; i_85_++)
									is_82_[i_83_][i_85_] = class527_sub38_sub2.method16481(1685212912);
							}
						}
					}
					short[] is_86_ = null;
					if (4 == (i_80_ & 0x4)) {
						is_86_ = new short[i_78_];
						for (int i_87_ = 0; i_87_ < i_78_; i_87_++)
							is_86_[i_87_] = (short) class527_sub38_sub2.readUnsignedShortLE128();
					}
					short[] is_88_ = null;
					if (8 == (i_80_ & 0x8)) {
						is_88_ = new short[i_79_];
						for (int i_89_ = 0; i_89_ < i_79_; i_89_++)
							is_88_[i_89_] = (short) class527_sub38_sub2.readUnsignedShort128();
					}
					long l = (long) ((Class640_Sub1_Sub2_Sub1_Sub1.anInt12174 += -311572459) * -1177303235 - 1);
					class640_sub1_sub2_sub1_sub1.aClass308_12163 = new Class308(l, is, fs, is_81_, is_82_, is_86_, is_88_);
				}
			}
			if ((i_2_ & 0x2000) != 0) {
				class640_sub1_sub2_sub1_sub1.anInt11916 = class527_sub38_sub2.readByte() * 1798102493;
				class640_sub1_sub2_sub1_sub1.anInt11886 = class527_sub38_sub2.readByte() * 1044896249;
				class640_sub1_sub2_sub1_sub1.anInt11895 = class527_sub38_sub2.read128Byte((byte) 33) * -873953571;
				class640_sub1_sub2_sub1_sub1.anInt11909 = class527_sub38_sub2.readByteC((byte) 22) * 1318952643;
				class640_sub1_sub2_sub1_sub1.anInt11920 = class527_sub38_sub2.readByte128((byte) -64) * -935178327;
				class640_sub1_sub2_sub1_sub1.anInt11900 = class527_sub38_sub2.readByteC((byte) 47) * 677568689;
				class640_sub1_sub2_sub1_sub1.anInt11923 = (class527_sub38_sub2.readUnsignedShort128() + client.anInt11019) * -1540379769;
				class640_sub1_sub2_sub1_sub1.anInt11930 = (class527_sub38_sub2.readUnsignedShortLE128() + client.anInt11019) * -1303412629;
				class640_sub1_sub2_sub1_sub1.anInt11924 = class527_sub38_sub2.readUnsignedShortLE((byte) 118) * 1662470151;
				class640_sub1_sub2_sub1_sub1.anInt11942 = 1705181029;
				class640_sub1_sub2_sub1_sub1.anInt11947 = 0;
				class640_sub1_sub2_sub1_sub1.anInt11916 += (1798102493 * class640_sub1_sub2_sub1_sub1.anIntArray11902[0]);
				class640_sub1_sub2_sub1_sub1.anInt11886 += (1044896249 * class640_sub1_sub2_sub1_sub1.anIntArray11944[0]);
				class640_sub1_sub2_sub1_sub1.anInt11895 += (-873953571 * class640_sub1_sub2_sub1_sub1.anIntArray11902[0]);
				class640_sub1_sub2_sub1_sub1.anInt11909 += (1318952643 * class640_sub1_sub2_sub1_sub1.anIntArray11944[0]);
				class640_sub1_sub2_sub1_sub1.anInt11920 += -935178327 * class640_sub1_sub2_sub1_sub1.aByte10864;
				class640_sub1_sub2_sub1_sub1.anInt11900 += class640_sub1_sub2_sub1_sub1.aByte10864 * 677568689;
			}
		}
	}

	static final void method15636(Class665 class665, int i) {
		int i_90_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_90_, -1850690585);
		Class235.method4356(class243, class665, 1738675576);
	}

	public static void method15637(int i, byte i_91_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(8, (long) i);
		class527_sub8_sub9.method18186(-1182321994);
	}
}
