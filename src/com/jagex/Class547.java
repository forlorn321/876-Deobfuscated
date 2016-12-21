/* Class547 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.EOFException;
import java.io.IOException;

public final class Class547 {
	int anInt7291;
	static byte[] aByteArray7292 = new byte[520];
	Class18 aClass18_7293;
	int anInt7294;
	Class18 aClass18_7295 = null;

	public byte[] method6626(int i, int i_0_) {
		synchronized (aClass18_7295) {
			byte[] is;
			try {
				if (aClass18_7293.method674(444106938) < (long) (i * 6 + 6)) {
					byte[] is_1_ = null;
					return is_1_;
				}
				aClass18_7293.method673((long) (6 * i));
				aClass18_7293.method676(aByteArray7292, 0, 6, 1970903965);
				int i_2_ = ((aByteArray7292[2] & 0xff) + (((aByteArray7292[0] & 0xff) << 16) + ((aByteArray7292[1] & 0xff) << 8)));
				int i_3_ = (((aByteArray7292[4] & 0xff) << 8) + ((aByteArray7292[3] & 0xff) << 16) + (aByteArray7292[5] & 0xff));
				if (i_2_ < 0 || i_2_ > -1241516769 * anInt7291) {
					byte[] is_4_ = null;
					return is_4_;
				}
				if (i_3_ <= 0 || ((long) i_3_ > aClass18_7295.method674(-2001592276) / 520L)) {
					byte[] is_5_ = null;
					return is_5_;
				}
				byte[] is_6_ = new byte[i_2_];
				int i_7_ = 0;
				int i_8_ = 0;
				while (i_7_ < i_2_) {
					if (0 == i_3_) {
						byte[] is_9_ = null;
						return is_9_;
					}
					aClass18_7295.method673((long) i_3_ * 520L);
					int i_10_ = i_2_ - i_7_;
					int i_11_;
					int i_12_;
					int i_13_;
					int i_14_;
					int i_15_;
					if (i > 65535) {
						if (i_10_ > 510)
							i_10_ = 510;
						i_11_ = 10;
						aClass18_7295.method676(aByteArray7292, 0, i_11_ + i_10_, 1600391130);
						i_12_ = ((aByteArray7292[3] & 0xff) + (((aByteArray7292[1] & 0xff) << 16) + ((aByteArray7292[0] & 0xff) << 24) + ((aByteArray7292[2] & 0xff) << 8)));
						i_13_ = (((aByteArray7292[4] & 0xff) << 8) + (aByteArray7292[5] & 0xff));
						i_14_ = ((aByteArray7292[8] & 0xff) + (((aByteArray7292[6] & 0xff) << 16) + ((aByteArray7292[7] & 0xff) << 8)));
						i_15_ = aByteArray7292[9] & 0xff;
					} else {
						if (i_10_ > 512)
							i_10_ = 512;
						i_11_ = 8;
						aClass18_7295.method676(aByteArray7292, 0, i_11_ + i_10_, 1824953634);
						i_12_ = ((aByteArray7292[1] & 0xff) + ((aByteArray7292[0] & 0xff) << 8));
						i_13_ = (((aByteArray7292[2] & 0xff) << 8) + (aByteArray7292[3] & 0xff));
						i_14_ = (((aByteArray7292[5] & 0xff) << 8) + ((aByteArray7292[4] & 0xff) << 16) + (aByteArray7292[6] & 0xff));
						i_15_ = aByteArray7292[7] & 0xff;
					}
					if (i_12_ != i || i_13_ != i_8_ || i_15_ != anInt7294 * 1503320651) {
						byte[] is_16_ = null;
						return is_16_;
					}
					if (i_14_ < 0 || ((long) i_14_ > aClass18_7295.method674(1128266292) / 520L)) {
						byte[] is_17_ = null;
						return is_17_;
					}
					int i_18_ = i_10_ + i_11_;
					for (int i_19_ = i_11_; i_19_ < i_18_; i_19_++)
						is_6_[i_7_++] = aByteArray7292[i_19_];
					i_3_ = i_14_;
					i_8_++;
				}
				is = is_6_;
			} catch (IOException ioexception) {
				byte[] is_20_ = null;
				return is_20_;
			}
			return is;
		}
	}

	boolean method6627(int i, byte[] is, int i_21_, boolean bool, int i_22_) {
		synchronized (aClass18_7295) {
			boolean bool_23_;
			try {
				int i_24_;
				if (bool) {
					if (aClass18_7293.method674(-1351676073) < (long) (6 + i * 6)) {
						boolean bool_25_ = false;
						return bool_25_;
					}
					aClass18_7293.method673((long) (6 * i));
					aClass18_7293.method676(aByteArray7292, 0, 6, 2051313554);
					i_24_ = ((aByteArray7292[5] & 0xff) + (((aByteArray7292[3] & 0xff) << 16) + ((aByteArray7292[4] & 0xff) << 8)));
					if (i_24_ <= 0 || ((long) i_24_ > aClass18_7295.method674(1625411512) / 520L)) {
						boolean bool_26_ = false;
						return bool_26_;
					}
				} else {
					i_24_ = (int) ((aClass18_7295.method674(1442327114) + 519L) / 520L);
					if (0 == i_24_)
						i_24_ = 1;
				}
				aByteArray7292[0] = (byte) (i_21_ >> 16);
				aByteArray7292[1] = (byte) (i_21_ >> 8);
				aByteArray7292[2] = (byte) i_21_;
				aByteArray7292[3] = (byte) (i_24_ >> 16);
				aByteArray7292[4] = (byte) (i_24_ >> 8);
				aByteArray7292[5] = (byte) i_24_;
				aClass18_7293.method673((long) (6 * i));
				aClass18_7293.method678(aByteArray7292, 0, 6, -704298577);
				int i_27_ = 0;
				int i_28_ = 0;
				while (i_27_ < i_21_) {
					int i_29_ = 0;
					if (bool) {
						aClass18_7295.method673((long) i_24_ * 520L);
						int i_30_;
						int i_31_;
						int i_32_;
						if (i > 65535) {
							try {
								aClass18_7295.method676(aByteArray7292, 0, 10, 2098015193);
							} catch (EOFException eofexception) {
								break;
							}
							i_30_ = (((aByteArray7292[0] & 0xff) << 24) + ((aByteArray7292[1] & 0xff) << 16) + ((aByteArray7292[2] & 0xff) << 8) + (aByteArray7292[3] & 0xff));
							i_31_ = ((aByteArray7292[5] & 0xff) + ((aByteArray7292[4] & 0xff) << 8));
							i_29_ = ((aByteArray7292[8] & 0xff) + (((aByteArray7292[6] & 0xff) << 16) + ((aByteArray7292[7] & 0xff) << 8)));
							i_32_ = aByteArray7292[9] & 0xff;
						} else {
							try {
								aClass18_7295.method676(aByteArray7292, 0, 8, 1703116494);
							} catch (EOFException eofexception) {
								break;
							}
							i_30_ = ((aByteArray7292[1] & 0xff) + ((aByteArray7292[0] & 0xff) << 8));
							i_31_ = ((aByteArray7292[3] & 0xff) + ((aByteArray7292[2] & 0xff) << 8));
							i_29_ = (((aByteArray7292[4] & 0xff) << 16) + ((aByteArray7292[5] & 0xff) << 8) + (aByteArray7292[6] & 0xff));
							i_32_ = aByteArray7292[7] & 0xff;
						}
						if (i != i_30_ || i_28_ != i_31_ || 1503320651 * anInt7294 != i_32_) {
							boolean bool_33_ = false;
							return bool_33_;
						}
						if (i_29_ < 0 || ((long) i_29_ > (aClass18_7295.method674(-340223121) / 520L))) {
							boolean bool_34_ = false;
							return bool_34_;
						}
					}
					if (i_29_ == 0) {
						bool = false;
						i_29_ = (int) ((aClass18_7295.method674(-1933178352) + 519L) / 520L);
						if (i_29_ == 0)
							i_29_++;
						if (i_29_ == i_24_)
							i_29_++;
					}
					if (i > 65535) {
						if (i_21_ - i_27_ <= 510)
							i_29_ = 0;
						aByteArray7292[0] = (byte) (i >> 24);
						aByteArray7292[1] = (byte) (i >> 16);
						aByteArray7292[2] = (byte) (i >> 8);
						aByteArray7292[3] = (byte) i;
						aByteArray7292[4] = (byte) (i_28_ >> 8);
						aByteArray7292[5] = (byte) i_28_;
						aByteArray7292[6] = (byte) (i_29_ >> 16);
						aByteArray7292[7] = (byte) (i_29_ >> 8);
						aByteArray7292[8] = (byte) i_29_;
						aByteArray7292[9] = (byte) (1503320651 * anInt7294);
						aClass18_7295.method673(520L * (long) i_24_);
						aClass18_7295.method678(aByteArray7292, 0, 10, -1135009051);
						int i_35_ = i_21_ - i_27_;
						if (i_35_ > 510)
							i_35_ = 510;
						aClass18_7295.method678(is, i_27_, i_35_, -699135458);
						i_27_ += i_35_;
					} else {
						if (i_21_ - i_27_ <= 512)
							i_29_ = 0;
						aByteArray7292[0] = (byte) (i >> 8);
						aByteArray7292[1] = (byte) i;
						aByteArray7292[2] = (byte) (i_28_ >> 8);
						aByteArray7292[3] = (byte) i_28_;
						aByteArray7292[4] = (byte) (i_29_ >> 16);
						aByteArray7292[5] = (byte) (i_29_ >> 8);
						aByteArray7292[6] = (byte) i_29_;
						aByteArray7292[7] = (byte) (anInt7294 * 1503320651);
						aClass18_7295.method673((long) i_24_ * 520L);
						aClass18_7295.method678(aByteArray7292, 0, 8, -1843355917);
						int i_36_ = i_21_ - i_27_;
						if (i_36_ > 512)
							i_36_ = 512;
						aClass18_7295.method678(is, i_27_, i_36_, -1562479746);
						i_27_ += i_36_;
					}
					i_24_ = i_29_;
					i_28_++;
				}
				bool_23_ = true;
			} catch (IOException ioexception) {
				boolean bool_37_ = false;
				return bool_37_;
			}
			return bool_23_;
		}
	}

	public boolean method6628(int i, byte[] is, int i_38_, int i_39_) {
		synchronized (aClass18_7295) {
			if (i_38_ < 0 || i_38_ > -1241516769 * anInt7291)
				throw new IllegalArgumentException(new StringBuilder().append("").append(anInt7294 * 1503320651).append(',').append(i).append(',').append(i_38_).toString());
			boolean bool = method6627(i, is, i_38_, true, -301187804);
			if (!bool)
				bool = method6627(i, is, i_38_, false, 363016244);
			boolean bool_40_ = bool;
			return bool_40_;
		}
	}

	public String method6629() {
		return new StringBuilder().append("").append(1503320651 * anInt7294).toString();
	}

	public String method6630() {
		return new StringBuilder().append("").append(1503320651 * anInt7294).toString();
	}

	public Class547(int i, Class18 class18, Class18 class18_41_, int i_42_) {
		aClass18_7293 = null;
		anInt7291 = 1972542744;
		anInt7294 = i * -319053981;
		aClass18_7295 = class18;
		aClass18_7293 = class18_41_;
		anInt7291 = i_42_ * 1000163039;
	}

	public String method6631() {
		return new StringBuilder().append("").append(1503320651 * anInt7294).toString();
	}

	public String toString() {
		return new StringBuilder().append("").append(1503320651 * anInt7294).toString();
	}

	public byte[] method6632(int i) {
		synchronized (aClass18_7295) {
			byte[] is;
			try {
				if (aClass18_7293.method674(276620371) < (long) (i * 6 + 6)) {
					byte[] is_43_ = null;
					return is_43_;
				}
				aClass18_7293.method673((long) (6 * i));
				aClass18_7293.method676(aByteArray7292, 0, 6, 1838570026);
				int i_44_ = ((aByteArray7292[2] & 0xff) + (((aByteArray7292[0] & 0xff) << 16) + ((aByteArray7292[1] & 0xff) << 8)));
				int i_45_ = (((aByteArray7292[4] & 0xff) << 8) + ((aByteArray7292[3] & 0xff) << 16) + (aByteArray7292[5] & 0xff));
				if (i_44_ < 0 || i_44_ > -1241516769 * anInt7291) {
					byte[] is_46_ = null;
					return is_46_;
				}
				if (i_45_ <= 0 || ((long) i_45_ > aClass18_7295.method674(-583970335) / 520L)) {
					byte[] is_47_ = null;
					return is_47_;
				}
				byte[] is_48_ = new byte[i_44_];
				int i_49_ = 0;
				int i_50_ = 0;
				while (i_49_ < i_44_) {
					if (0 == i_45_) {
						byte[] is_51_ = null;
						return is_51_;
					}
					aClass18_7295.method673((long) i_45_ * 520L);
					int i_52_ = i_44_ - i_49_;
					int i_53_;
					int i_54_;
					int i_55_;
					int i_56_;
					int i_57_;
					if (i > 65535) {
						if (i_52_ > 510)
							i_52_ = 510;
						i_53_ = 10;
						aClass18_7295.method676(aByteArray7292, 0, i_53_ + i_52_, 1948774243);
						i_54_ = ((aByteArray7292[3] & 0xff) + (((aByteArray7292[1] & 0xff) << 16) + ((aByteArray7292[0] & 0xff) << 24) + ((aByteArray7292[2] & 0xff) << 8)));
						i_55_ = (((aByteArray7292[4] & 0xff) << 8) + (aByteArray7292[5] & 0xff));
						i_56_ = ((aByteArray7292[8] & 0xff) + (((aByteArray7292[6] & 0xff) << 16) + ((aByteArray7292[7] & 0xff) << 8)));
						i_57_ = aByteArray7292[9] & 0xff;
					} else {
						if (i_52_ > 512)
							i_52_ = 512;
						i_53_ = 8;
						aClass18_7295.method676(aByteArray7292, 0, i_53_ + i_52_, 1786347258);
						i_54_ = ((aByteArray7292[1] & 0xff) + ((aByteArray7292[0] & 0xff) << 8));
						i_55_ = (((aByteArray7292[2] & 0xff) << 8) + (aByteArray7292[3] & 0xff));
						i_56_ = (((aByteArray7292[5] & 0xff) << 8) + ((aByteArray7292[4] & 0xff) << 16) + (aByteArray7292[6] & 0xff));
						i_57_ = aByteArray7292[7] & 0xff;
					}
					if (i_54_ != i || i_55_ != i_50_ || i_57_ != anInt7294 * 1503320651) {
						byte[] is_58_ = null;
						return is_58_;
					}
					if (i_56_ < 0 || ((long) i_56_ > aClass18_7295.method674(-1524737858) / 520L)) {
						byte[] is_59_ = null;
						return is_59_;
					}
					int i_60_ = i_52_ + i_53_;
					for (int i_61_ = i_53_; i_61_ < i_60_; i_61_++)
						is_48_[i_49_++] = aByteArray7292[i_61_];
					i_45_ = i_56_;
					i_50_++;
				}
				is = is_48_;
			} catch (IOException ioexception) {
				byte[] is_62_ = null;
				return is_62_;
			}
			return is;
		}
	}

	public byte[] method6633(int i) {
		synchronized (aClass18_7295) {
			byte[] is;
			try {
				if (aClass18_7293.method674(-1742851433) < (long) (i * 6 + 6)) {
					byte[] is_63_ = null;
					return is_63_;
				}
				aClass18_7293.method673((long) (6 * i));
				aClass18_7293.method676(aByteArray7292, 0, 6, 1628934007);
				int i_64_ = ((aByteArray7292[2] & 0xff) + (((aByteArray7292[0] & 0xff) << 16) + ((aByteArray7292[1] & 0xff) << 8)));
				int i_65_ = (((aByteArray7292[4] & 0xff) << 8) + ((aByteArray7292[3] & 0xff) << 16) + (aByteArray7292[5] & 0xff));
				if (i_64_ < 0 || i_64_ > -1241516769 * anInt7291) {
					byte[] is_66_ = null;
					return is_66_;
				}
				if (i_65_ <= 0 || ((long) i_65_ > aClass18_7295.method674(1688847792) / 520L)) {
					byte[] is_67_ = null;
					return is_67_;
				}
				byte[] is_68_ = new byte[i_64_];
				int i_69_ = 0;
				int i_70_ = 0;
				while (i_69_ < i_64_) {
					if (0 == i_65_) {
						byte[] is_71_ = null;
						return is_71_;
					}
					aClass18_7295.method673((long) i_65_ * 520L);
					int i_72_ = i_64_ - i_69_;
					int i_73_;
					int i_74_;
					int i_75_;
					int i_76_;
					int i_77_;
					if (i > 65535) {
						if (i_72_ > 510)
							i_72_ = 510;
						i_73_ = 10;
						aClass18_7295.method676(aByteArray7292, 0, i_73_ + i_72_, 2088048823);
						i_74_ = ((aByteArray7292[3] & 0xff) + (((aByteArray7292[1] & 0xff) << 16) + ((aByteArray7292[0] & 0xff) << 24) + ((aByteArray7292[2] & 0xff) << 8)));
						i_75_ = (((aByteArray7292[4] & 0xff) << 8) + (aByteArray7292[5] & 0xff));
						i_76_ = ((aByteArray7292[8] & 0xff) + (((aByteArray7292[6] & 0xff) << 16) + ((aByteArray7292[7] & 0xff) << 8)));
						i_77_ = aByteArray7292[9] & 0xff;
					} else {
						if (i_72_ > 512)
							i_72_ = 512;
						i_73_ = 8;
						aClass18_7295.method676(aByteArray7292, 0, i_73_ + i_72_, 1588123709);
						i_74_ = ((aByteArray7292[1] & 0xff) + ((aByteArray7292[0] & 0xff) << 8));
						i_75_ = (((aByteArray7292[2] & 0xff) << 8) + (aByteArray7292[3] & 0xff));
						i_76_ = (((aByteArray7292[5] & 0xff) << 8) + ((aByteArray7292[4] & 0xff) << 16) + (aByteArray7292[6] & 0xff));
						i_77_ = aByteArray7292[7] & 0xff;
					}
					if (i_74_ != i || i_75_ != i_70_ || i_77_ != anInt7294 * 1503320651) {
						byte[] is_78_ = null;
						return is_78_;
					}
					if (i_76_ < 0 || ((long) i_76_ > aClass18_7295.method674(1100640156) / 520L)) {
						byte[] is_79_ = null;
						return is_79_;
					}
					int i_80_ = i_72_ + i_73_;
					for (int i_81_ = i_73_; i_81_ < i_80_; i_81_++)
						is_68_[i_69_++] = aByteArray7292[i_81_];
					i_65_ = i_76_;
					i_70_++;
				}
				is = is_68_;
			} catch (IOException ioexception) {
				byte[] is_82_ = null;
				return is_82_;
			}
			return is;
		}
	}

	static final void method6634(Class668 class668, byte i) {
		class668.anInt8542 -= -1349181388;
		int i_83_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_84_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		int i_85_ = class668.anIntArray8541[2 + 1867269829 * class668.anInt8542];
		int i_86_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 3];
		Class598 class598 = client.aClass515_11066.method6255(-1755674275);
		Class101.method1354(((i_83_ >> 14 & 0x3fff) - class598.anInt7839 * 1858049507), (i_83_ & 0x3fff) - class598.anInt7840 * 1479112045, i_84_ << 2, i_85_, i_86_, false, (short) 16899);
		client.aBool11242 = true;
	}
}
