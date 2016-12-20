/* Class271 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class271 {
	int anInt3125;
	Class527_Sub8_Sub11[] aClass527_Sub8_Sub11Array3126 = new Class527_Sub8_Sub11[100];
	static final int anInt3127 = 100;
	public static Class624 aClass624_3128;

	int method5064() {
		return -152585603 * anInt3125;
	}

	Class527_Sub8_Sub11 method5065(int i, int i_0_, String string, String string_1_, String string_2_, String string_3_, String string_4_, int i_5_, Class406 class406, int i_6_) {
		Class527_Sub8_Sub11 class527_sub8_sub11 = aClass527_Sub8_Sub11Array3126[99];
		for (int i_7_ = anInt3125 * -152585603; i_7_ > 0; i_7_--) {
			if (i_7_ != 100)
				aClass527_Sub8_Sub11Array3126[i_7_] = aClass527_Sub8_Sub11Array3126[i_7_ - 1];
		}
		if (null == class527_sub8_sub11)
			class527_sub8_sub11 = new Class527_Sub8_Sub11(i, i_0_, string, string_1_, string_2_, string_4_, i_5_, string_3_, class406);
		else {
			class527_sub8_sub11.method8735(-1889161967);
			class527_sub8_sub11.method16057((byte) -59);
			class527_sub8_sub11.method18296(i, i_0_, string, string_1_, string_2_, string_4_, i_5_, string_3_, class406, -1457348559);
		}
		aClass527_Sub8_Sub11Array3126[0] = class527_sub8_sub11;
		if (anInt3125 * -152585603 < 100)
			anInt3125 += 2049642197;
		return class527_sub8_sub11;
	}

	Class527_Sub8_Sub11 method5066(int i, byte i_8_) {
		if (i < 0 || i >= anInt3125 * -152585603)
			return null;
		return aClass527_Sub8_Sub11Array3126[i];
	}

	Class527_Sub8_Sub11 method5067(int i) {
		if (i < 0 || i >= anInt3125 * -152585603)
			return null;
		return aClass527_Sub8_Sub11Array3126[i];
	}

	int method5068(int i) {
		return -152585603 * anInt3125;
	}

	Class527_Sub8_Sub11 method5069(int i, int i_9_, String string, String string_10_, String string_11_, String string_12_, String string_13_, int i_14_, Class406 class406) {
		Class527_Sub8_Sub11 class527_sub8_sub11 = aClass527_Sub8_Sub11Array3126[99];
		for (int i_15_ = anInt3125 * -152585603; i_15_ > 0; i_15_--) {
			if (i_15_ != 100)
				aClass527_Sub8_Sub11Array3126[i_15_] = aClass527_Sub8_Sub11Array3126[i_15_ - 1];
		}
		if (null == class527_sub8_sub11)
			class527_sub8_sub11 = new Class527_Sub8_Sub11(i, i_9_, string, string_10_, string_11_, string_13_, i_14_, string_12_, class406);
		else {
			class527_sub8_sub11.method8735(-1889161967);
			class527_sub8_sub11.method16057((byte) -81);
			class527_sub8_sub11.method18296(i, i_9_, string, string_10_, string_11_, string_13_, i_14_, string_12_, class406, 1885009137);
		}
		aClass527_Sub8_Sub11Array3126[0] = class527_sub8_sub11;
		if (anInt3125 * -152585603 < 100)
			anInt3125 += 2049642197;
		return class527_sub8_sub11;
	}

	Class527_Sub8_Sub11 method5070(int i) {
		if (i < 0 || i >= anInt3125 * -152585603)
			return null;
		return aClass527_Sub8_Sub11Array3126[i];
	}

	int method5071() {
		return -152585603 * anInt3125;
	}

	int method5072() {
		return -152585603 * anInt3125;
	}

	int method5073() {
		return -152585603 * anInt3125;
	}

	Class271() {
		/* empty */
	}

	static int method5074(int i, byte i_16_) {
		if (16711935 == i)
			return -1;
		return Class57.method1365(i, 2001496417);
	}

	static final void method5075(Class243 class243, Class240 class240, Class665 class665, short i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, -320728764) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2617 = Class103.method1800(string, class665, (byte) -41);
		class243.aBool2606 = true;
	}

	static final void method5076(Class243 class243, Class240 class240, Class665 class665, byte i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, -88952922) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2649 = Class103.method1800(string, class665, (byte) -82);
		class243.aBool2606 = true;
	}

	public static final int method5077(Class24_Sub6 class24_sub6, byte[] is, int i, int i_17_, int i_18_, int i_19_, Class645 class645, Class645 class645_20_, int i_21_) {
		int i_22_ = 0;
		RSByteBuffer class527_sub38 = new RSByteBuffer(is);
		int i_23_ = -1;
		for (;;) {
			int i_24_ = class527_sub38.readSmart(-1028931328);
			if (0 == i_24_)
				break;
			i_23_ += i_24_;
			int i_25_ = 0;
			boolean bool = false;
			for (;;) {
				if (bool) {
					int i_26_ = class527_sub38.readUnsignedSmart((byte) -43);
					if (i_26_ == 0)
						break;
					class527_sub38.readUnsignedByte();
				} else {
					int i_27_ = class527_sub38.readUnsignedSmart((byte) -16);
					if (0 == i_27_)
						break;
					i_25_ += i_27_ - 1;
					int i_28_ = i_25_ & 0x3f;
					int i_29_ = i_25_ >> 6 & 0x3f;
					int i_30_ = class527_sub38.readUnsignedByte() >> 2;
					int i_31_ = i_30_ & 0x3;
					i_30_ >>= 2;
					int i_32_ = i_29_ + i;
					int i_33_ = i_28_ + i_17_;
					Class602 class602 = (Class602) class24_sub6.method81(i_23_, 1852941985);
					int i_34_;
					int i_35_;
					if ((i_31_ & 0x1) == 0) {
						i_34_ = -49406469 * class602.anInt7874;
						i_35_ = 1481957615 * class602.anInt7891;
					} else {
						i_34_ = 1481957615 * class602.anInt7891;
						i_35_ = class602.anInt7874 * -49406469;
					}
					if (i_32_ < i_18_ && i_33_ < i_19_ && i_32_ + i_34_ >= 0 && i_35_ + i_33_ >= 0) {
						if (i_30_ != (-1736797763 * Class596.aClass596_7842.anInt7844) || Class204.aClass527_Sub31_2213.aClass700_Sub4_10600.method16875(-1866873441) != 0 || class602.anInt7898 * -1508648055 != 0 || 1 == 177265375 * class602.anInt7892 || class602.aBool7924) {
							if (!class602.method9968(class645_20_, -1784395681)) {
								class645.anInt8348 = 1626444987 * i_23_;
								i_22_++;
							}
							bool = true;
						}
					}
				}
			}
		}
		return i_22_;
	}

	public static void method5078(int i, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_) {
		if (i_36_ >= 0 && i_37_ >= 0 && i_36_ < client.aClass509_11072.method8284((byte) 103) - 1 && i_37_ < client.aClass509_11072.method8285(1660434409) - 1) {
			if (client.aClass509_11072.method8314(-1843777518) != null) {
				if (0 == i_38_) {
					Interface62 interface62 = ((Interface62) client.aClass509_11072.method8314(-786487486).method9377(i, i_36_, i_37_, -910262463));
					Interface62 interface62_44_ = ((Interface62) client.aClass509_11072.method8314(1792158449).method9251(i, i_36_, i_37_, (byte) 3));
					if (null != interface62 && 2 != i_39_) {
						if (interface62 instanceof Class640_Sub1_Sub3_Sub2)
							((Class640_Sub1_Sub3_Sub2) interface62).aClass531_12014.method8884(i_41_, i_42_, 189826407);
						else
							Class654.method10915(i, i_38_, i_36_, i_37_, interface62.method64(-1477525093), i_40_, i_39_, i_41_, i_42_, -492434390);
					}
					if (interface62_44_ != null) {
						if (interface62_44_ instanceof Class640_Sub1_Sub3_Sub2)
							((Class640_Sub1_Sub3_Sub2) interface62_44_).aClass531_12014.method8884(i_41_, i_42_, -998774778);
						else
							Class654.method10915(i, i_38_, i_36_, i_37_, interface62_44_.method64(-1243922751), i_40_, i_39_, i_41_, i_42_, -492434390);
					}
				} else if (i_38_ == 1) {
					Interface62 interface62 = ((Interface62) client.aClass509_11072.method8314(-857462734).method9252(i, i_36_, i_37_, 514427235));
					if (null != interface62) {
						if (interface62 instanceof Class640_Sub1_Sub1_Sub2)
							((Class640_Sub1_Sub1_Sub2) interface62).aClass531_12017.method8884(i_41_, i_42_, 15098428);
						else {
							int i_45_ = interface62.method64(-1859081258);
							if (i_39_ == 4 || i_39_ == 5)
								Class654.method10915(i, i_38_, i_36_, i_37_, i_45_, i_40_, 4, i_41_, i_42_, -492434390);
							else if (6 == i_39_)
								Class654.method10915(i, i_38_, i_36_, i_37_, i_45_, 4 + i_40_, 4, i_41_, i_42_, -492434390);
							else if (7 == i_39_)
								Class654.method10915(i, i_38_, i_36_, i_37_, i_45_, (2 + i_40_ & 0x3) + 4, 4, i_41_, i_42_, -492434390);
							else if (i_39_ == 8) {
								Class654.method10915(i, i_38_, i_36_, i_37_, i_45_, 4 + i_40_, 4, i_41_, i_42_, -492434390);
								Class654.method10915(i, i_38_, i_36_, i_37_, i_45_, (i_40_ + 2 & 0x3) + 4, 4, i_41_, i_42_, -492434390);
							}
						}
					}
				} else if (2 == i_38_) {
					Interface62 interface62 = ((Interface62) (client.aClass509_11072.method8314(371246770).method9254(i, i_36_, i_37_, client.anInterface63_11303, -771914770)));
					if (null != interface62) {
						if (11 == i_39_)
							i_39_ = 10;
						if (interface62 instanceof Class640_Sub1_Sub2_Sub2)
							((Class640_Sub1_Sub2_Sub2) interface62).aClass531_12007.method8884(i_41_, i_42_, -1526982610);
						else
							Class654.method10915(i, i_38_, i_36_, i_37_, interface62.method64(-1156986672), i_40_, i_39_, i_41_, i_42_, -492434390);
					}
				} else if (i_38_ == 3) {
					Interface62 interface62 = ((Interface62) client.aClass509_11072.method8314(2126142252).method9256(i, i_36_, i_37_, 1369770818));
					if (null != interface62) {
						if (interface62 instanceof Class640_Sub1_Sub4_Sub2)
							((Class640_Sub1_Sub4_Sub2) interface62).aClass531_12002.method8884(i_41_, i_42_, 782265396);
						else
							Class654.method10915(i, i_38_, i_36_, i_37_, interface62.method64(-1940360781), i_40_, i_39_, i_41_, i_42_, -492434390);
					}
				}
			}
		}
	}
}
