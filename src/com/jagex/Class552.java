/* Class552 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Method;

public final class Class552 {
	Class1 aClass1_7307 = null;
	static byte[] aByteArray7308 = new byte[520];
	Class1 aClass1_7309 = null;
	int anInt7310;
	int anInt7311 = 98322936;
	public static Class24_Sub3 aClass24_Sub3_7312;
	public static short[][] aShortArrayArray7313;

	public boolean method9135(int i, byte[] is, int i_0_) {
		synchronized (aClass1_7307) {
			if (i_0_ < 0 || i_0_ > anInt7311 * 1760394243)
				throw new IllegalArgumentException(new StringBuilder().append("").append(-1378996243 * anInt7310).append(',').append(i).append(',').append(i_0_).toString());
			boolean bool = method9137(i, is, i_0_, true, 21707438);
			if (!bool)
				bool = method9137(i, is, i_0_, false, 892053122);
			boolean bool_1_ = bool;
			return bool_1_;
		}
	}

	public byte[] method9136(int i) {
		synchronized (aClass1_7307) {
			byte[] is;
			try {
				if (aClass1_7309.method493((byte) 5) < (long) (i * 6 + 6)) {
					byte[] is_2_ = null;
					return is_2_;
				}
				aClass1_7309.method492((long) (i * 6));
				aClass1_7309.method502(aByteArray7308, 0, 6, -2027656751);
				int i_3_ = ((aByteArray7308[2] & 0xff) + (((aByteArray7308[1] & 0xff) << 8) + ((aByteArray7308[0] & 0xff) << 16)));
				int i_4_ = ((aByteArray7308[5] & 0xff) + (((aByteArray7308[3] & 0xff) << 16) + ((aByteArray7308[4] & 0xff) << 8)));
				if (i_3_ < 0 || i_3_ > anInt7311 * 1760394243) {
					byte[] is_5_ = null;
					return is_5_;
				}
				if (i_4_ <= 0 || (long) i_4_ > aClass1_7307.method493((byte) 5) / 520L) {
					byte[] is_6_ = null;
					return is_6_;
				}
				byte[] is_7_ = new byte[i_3_];
				int i_8_ = 0;
				int i_9_ = 0;
				while (i_8_ < i_3_) {
					if (i_4_ == 0) {
						byte[] is_10_ = null;
						return is_10_;
					}
					aClass1_7307.method492(520L * (long) i_4_);
					int i_11_ = i_3_ - i_8_;
					int i_12_;
					int i_13_;
					int i_14_;
					int i_15_;
					int i_16_;
					if (i > 65535) {
						if (i_11_ > 510)
							i_11_ = 510;
						i_12_ = 10;
						aClass1_7307.method502(aByteArray7308, 0, i_12_ + i_11_, -2110334713);
						i_13_ = (((aByteArray7308[2] & 0xff) << 8) + (((aByteArray7308[0] & 0xff) << 24) + ((aByteArray7308[1] & 0xff) << 16)) + (aByteArray7308[3] & 0xff));
						i_14_ = ((aByteArray7308[5] & 0xff) + ((aByteArray7308[4] & 0xff) << 8));
						i_15_ = ((aByteArray7308[8] & 0xff) + (((aByteArray7308[6] & 0xff) << 16) + ((aByteArray7308[7] & 0xff) << 8)));
						i_16_ = aByteArray7308[9] & 0xff;
					} else {
						if (i_11_ > 512)
							i_11_ = 512;
						i_12_ = 8;
						aClass1_7307.method502(aByteArray7308, 0, i_11_ + i_12_, -1989574745);
						i_13_ = ((aByteArray7308[1] & 0xff) + ((aByteArray7308[0] & 0xff) << 8));
						i_14_ = ((aByteArray7308[3] & 0xff) + ((aByteArray7308[2] & 0xff) << 8));
						i_15_ = (((aByteArray7308[4] & 0xff) << 16) + ((aByteArray7308[5] & 0xff) << 8) + (aByteArray7308[6] & 0xff));
						i_16_ = aByteArray7308[7] & 0xff;
					}
					if (i_13_ != i || i_9_ != i_14_ || anInt7310 * -1378996243 != i_16_) {
						byte[] is_17_ = null;
						return is_17_;
					}
					if (i_15_ < 0 || ((long) i_15_ > aClass1_7307.method493((byte) 5) / 520L)) {
						byte[] is_18_ = null;
						return is_18_;
					}
					int i_19_ = i_11_ + i_12_;
					for (int i_20_ = i_12_; i_20_ < i_19_; i_20_++)
						is_7_[i_8_++] = aByteArray7308[i_20_];
					i_4_ = i_15_;
					i_9_++;
				}
				is = is_7_;
			} catch (IOException ioexception) {
				byte[] is_21_ = null;
				return is_21_;
			}
			return is;
		}
	}

	boolean method9137(int i, byte[] is, int i_22_, boolean bool, int i_23_) {
		synchronized (aClass1_7307) {
			boolean bool_24_;
			try {
				int i_25_;
				if (bool) {
					if (aClass1_7309.method493((byte) 5) < (long) (6 + i * 6)) {
						boolean bool_26_ = false;
						return bool_26_;
					}
					aClass1_7309.method492((long) (6 * i));
					aClass1_7309.method502(aByteArray7308, 0, 6, -2100734223);
					i_25_ = ((aByteArray7308[5] & 0xff) + (((aByteArray7308[4] & 0xff) << 8) + ((aByteArray7308[3] & 0xff) << 16)));
					if (i_25_ <= 0 || ((long) i_25_ > aClass1_7307.method493((byte) 5) / 520L)) {
						boolean bool_27_ = false;
						return bool_27_;
					}
				} else {
					i_25_ = (int) ((aClass1_7307.method493((byte) 5) + 519L) / 520L);
					if (0 == i_25_)
						i_25_ = 1;
				}
				aByteArray7308[0] = (byte) (i_22_ >> 16);
				aByteArray7308[1] = (byte) (i_22_ >> 8);
				aByteArray7308[2] = (byte) i_22_;
				aByteArray7308[3] = (byte) (i_25_ >> 16);
				aByteArray7308[4] = (byte) (i_25_ >> 8);
				aByteArray7308[5] = (byte) i_25_;
				aClass1_7309.method492((long) (6 * i));
				aClass1_7309.method497(aByteArray7308, 0, 6, (byte) -26);
				int i_28_ = 0;
				int i_29_ = 0;
				while (i_28_ < i_22_) {
					int i_30_ = 0;
					if (bool) {
						aClass1_7307.method492(520L * (long) i_25_);
						int i_31_;
						int i_32_;
						int i_33_;
						if (i > 65535) {
							try {
								aClass1_7307.method502(aByteArray7308, 0, 10, -1870012944);
							} catch (EOFException eofexception) {
								break;
							}
							i_31_ = ((aByteArray7308[3] & 0xff) + (((aByteArray7308[1] & 0xff) << 16) + ((aByteArray7308[0] & 0xff) << 24) + ((aByteArray7308[2] & 0xff) << 8)));
							i_32_ = (((aByteArray7308[4] & 0xff) << 8) + (aByteArray7308[5] & 0xff));
							i_30_ = (((aByteArray7308[6] & 0xff) << 16) + ((aByteArray7308[7] & 0xff) << 8) + (aByteArray7308[8] & 0xff));
							i_33_ = aByteArray7308[9] & 0xff;
						} else {
							try {
								aClass1_7307.method502(aByteArray7308, 0, 8, -1908491922);
							} catch (EOFException eofexception) {
								break;
							}
							i_31_ = ((aByteArray7308[1] & 0xff) + ((aByteArray7308[0] & 0xff) << 8));
							i_32_ = (((aByteArray7308[2] & 0xff) << 8) + (aByteArray7308[3] & 0xff));
							i_30_ = (((aByteArray7308[4] & 0xff) << 16) + ((aByteArray7308[5] & 0xff) << 8) + (aByteArray7308[6] & 0xff));
							i_33_ = aByteArray7308[7] & 0xff;
						}
						if (i != i_31_ || i_29_ != i_32_ || i_33_ != anInt7310 * -1378996243) {
							boolean bool_34_ = false;
							return bool_34_;
						}
						if (i_30_ < 0 || ((long) i_30_ > aClass1_7307.method493((byte) 5) / 520L)) {
							boolean bool_35_ = false;
							return bool_35_;
						}
					}
					if (0 == i_30_) {
						bool = false;
						i_30_ = (int) ((aClass1_7307.method493((byte) 5) + 519L) / 520L);
						if (i_30_ == 0)
							i_30_++;
						if (i_25_ == i_30_)
							i_30_++;
					}
					if (i > 65535) {
						if (i_22_ - i_28_ <= 510)
							i_30_ = 0;
						aByteArray7308[0] = (byte) (i >> 24);
						aByteArray7308[1] = (byte) (i >> 16);
						aByteArray7308[2] = (byte) (i >> 8);
						aByteArray7308[3] = (byte) i;
						aByteArray7308[4] = (byte) (i_29_ >> 8);
						aByteArray7308[5] = (byte) i_29_;
						aByteArray7308[6] = (byte) (i_30_ >> 16);
						aByteArray7308[7] = (byte) (i_30_ >> 8);
						aByteArray7308[8] = (byte) i_30_;
						aByteArray7308[9] = (byte) (-1378996243 * anInt7310);
						aClass1_7307.method492(520L * (long) i_25_);
						aClass1_7307.method497(aByteArray7308, 0, 10, (byte) -88);
						int i_36_ = i_22_ - i_28_;
						if (i_36_ > 510)
							i_36_ = 510;
						aClass1_7307.method497(is, i_28_, i_36_, (byte) -42);
						i_28_ += i_36_;
					} else {
						if (i_22_ - i_28_ <= 512)
							i_30_ = 0;
						aByteArray7308[0] = (byte) (i >> 8);
						aByteArray7308[1] = (byte) i;
						aByteArray7308[2] = (byte) (i_29_ >> 8);
						aByteArray7308[3] = (byte) i_29_;
						aByteArray7308[4] = (byte) (i_30_ >> 16);
						aByteArray7308[5] = (byte) (i_30_ >> 8);
						aByteArray7308[6] = (byte) i_30_;
						aByteArray7308[7] = (byte) (anInt7310 * -1378996243);
						aClass1_7307.method492(520L * (long) i_25_);
						aClass1_7307.method497(aByteArray7308, 0, 8, (byte) 1);
						int i_37_ = i_22_ - i_28_;
						if (i_37_ > 512)
							i_37_ = 512;
						aClass1_7307.method497(is, i_28_, i_37_, (byte) -74);
						i_28_ += i_37_;
					}
					i_25_ = i_30_;
					i_29_++;
				}
				bool_24_ = true;
			} catch (IOException ioexception) {
				boolean bool_38_ = false;
				return bool_38_;
			}
			return bool_24_;
		}
	}

	public boolean method9138(int i, byte[] is, int i_39_, int i_40_) {
		synchronized (aClass1_7307) {
			if (i_39_ < 0 || i_39_ > anInt7311 * 1760394243)
				throw new IllegalArgumentException(new StringBuilder().append("").append(-1378996243 * anInt7310).append(',').append(i).append(',').append(i_39_).toString());
			boolean bool = method9137(i, is, i_39_, true, -237262469);
			if (!bool)
				bool = method9137(i, is, i_39_, false, -273335638);
			boolean bool_41_ = bool;
			return bool_41_;
		}
	}

	public Class552(int i, Class1 class1, Class1 class1_42_, int i_43_) {
		anInt7310 = i * -2027059739;
		aClass1_7307 = class1;
		aClass1_7309 = class1_42_;
		anInt7311 = i_43_ * 1009913515;
	}

	public String method9139() {
		return new StringBuilder().append("").append(anInt7310 * -1378996243).toString();
	}

	public byte[] method9140(int i) {
		synchronized (aClass1_7307) {
			byte[] is;
			try {
				if (aClass1_7309.method493((byte) 5) < (long) (i * 6 + 6)) {
					byte[] is_44_ = null;
					return is_44_;
				}
				aClass1_7309.method492((long) (i * 6));
				aClass1_7309.method502(aByteArray7308, 0, 6, -1948534688);
				int i_45_ = ((aByteArray7308[2] & 0xff) + (((aByteArray7308[1] & 0xff) << 8) + ((aByteArray7308[0] & 0xff) << 16)));
				int i_46_ = ((aByteArray7308[5] & 0xff) + (((aByteArray7308[3] & 0xff) << 16) + ((aByteArray7308[4] & 0xff) << 8)));
				if (i_45_ < 0 || i_45_ > anInt7311 * 1760394243) {
					byte[] is_47_ = null;
					return is_47_;
				}
				if (i_46_ <= 0 || ((long) i_46_ > aClass1_7307.method493((byte) 5) / 520L)) {
					byte[] is_48_ = null;
					return is_48_;
				}
				byte[] is_49_ = new byte[i_45_];
				int i_50_ = 0;
				int i_51_ = 0;
				while (i_50_ < i_45_) {
					if (i_46_ == 0) {
						byte[] is_52_ = null;
						return is_52_;
					}
					aClass1_7307.method492(520L * (long) i_46_);
					int i_53_ = i_45_ - i_50_;
					int i_54_;
					int i_55_;
					int i_56_;
					int i_57_;
					int i_58_;
					if (i > 65535) {
						if (i_53_ > 510)
							i_53_ = 510;
						i_54_ = 10;
						aClass1_7307.method502(aByteArray7308, 0, i_54_ + i_53_, -1889275754);
						i_55_ = (((aByteArray7308[2] & 0xff) << 8) + (((aByteArray7308[0] & 0xff) << 24) + ((aByteArray7308[1] & 0xff) << 16)) + (aByteArray7308[3] & 0xff));
						i_56_ = ((aByteArray7308[5] & 0xff) + ((aByteArray7308[4] & 0xff) << 8));
						i_57_ = ((aByteArray7308[8] & 0xff) + (((aByteArray7308[6] & 0xff) << 16) + ((aByteArray7308[7] & 0xff) << 8)));
						i_58_ = aByteArray7308[9] & 0xff;
					} else {
						if (i_53_ > 512)
							i_53_ = 512;
						i_54_ = 8;
						aClass1_7307.method502(aByteArray7308, 0, i_53_ + i_54_, -2035724491);
						i_55_ = ((aByteArray7308[1] & 0xff) + ((aByteArray7308[0] & 0xff) << 8));
						i_56_ = ((aByteArray7308[3] & 0xff) + ((aByteArray7308[2] & 0xff) << 8));
						i_57_ = (((aByteArray7308[4] & 0xff) << 16) + ((aByteArray7308[5] & 0xff) << 8) + (aByteArray7308[6] & 0xff));
						i_58_ = aByteArray7308[7] & 0xff;
					}
					if (i_55_ != i || i_51_ != i_56_ || anInt7310 * -1378996243 != i_58_) {
						byte[] is_59_ = null;
						return is_59_;
					}
					if (i_57_ < 0 || ((long) i_57_ > aClass1_7307.method493((byte) 5) / 520L)) {
						byte[] is_60_ = null;
						return is_60_;
					}
					int i_61_ = i_53_ + i_54_;
					for (int i_62_ = i_54_; i_62_ < i_61_; i_62_++)
						is_49_[i_50_++] = aByteArray7308[i_62_];
					i_46_ = i_57_;
					i_51_++;
				}
				is = is_49_;
			} catch (IOException ioexception) {
				byte[] is_63_ = null;
				return is_63_;
			}
			return is;
		}
	}

	public byte[] method9141(int i, byte i_64_) {
		synchronized (aClass1_7307) {
			byte[] is;
			try {
				if (aClass1_7309.method493((byte) 5) < (long) (i * 6 + 6)) {
					byte[] is_65_ = null;
					return is_65_;
				}
				aClass1_7309.method492((long) (i * 6));
				aClass1_7309.method502(aByteArray7308, 0, 6, -1978425347);
				int i_66_ = ((aByteArray7308[2] & 0xff) + (((aByteArray7308[1] & 0xff) << 8) + ((aByteArray7308[0] & 0xff) << 16)));
				int i_67_ = ((aByteArray7308[5] & 0xff) + (((aByteArray7308[3] & 0xff) << 16) + ((aByteArray7308[4] & 0xff) << 8)));
				if (i_66_ < 0 || i_66_ > anInt7311 * 1760394243) {
					byte[] is_68_ = null;
					return is_68_;
				}
				if (i_67_ <= 0 || ((long) i_67_ > aClass1_7307.method493((byte) 5) / 520L)) {
					byte[] is_69_ = null;
					return is_69_;
				}
				byte[] is_70_ = new byte[i_66_];
				int i_71_ = 0;
				int i_72_ = 0;
				while (i_71_ < i_66_) {
					if (i_67_ == 0) {
						byte[] is_73_ = null;
						return is_73_;
					}
					aClass1_7307.method492(520L * (long) i_67_);
					int i_74_ = i_66_ - i_71_;
					int i_75_;
					int i_76_;
					int i_77_;
					int i_78_;
					int i_79_;
					if (i > 65535) {
						if (i_74_ > 510)
							i_74_ = 510;
						i_75_ = 10;
						aClass1_7307.method502(aByteArray7308, 0, i_75_ + i_74_, -2010173711);
						i_76_ = (((aByteArray7308[2] & 0xff) << 8) + (((aByteArray7308[0] & 0xff) << 24) + ((aByteArray7308[1] & 0xff) << 16)) + (aByteArray7308[3] & 0xff));
						i_77_ = ((aByteArray7308[5] & 0xff) + ((aByteArray7308[4] & 0xff) << 8));
						i_78_ = ((aByteArray7308[8] & 0xff) + (((aByteArray7308[6] & 0xff) << 16) + ((aByteArray7308[7] & 0xff) << 8)));
						i_79_ = aByteArray7308[9] & 0xff;
					} else {
						if (i_74_ > 512)
							i_74_ = 512;
						i_75_ = 8;
						aClass1_7307.method502(aByteArray7308, 0, i_74_ + i_75_, -2132312833);
						i_76_ = ((aByteArray7308[1] & 0xff) + ((aByteArray7308[0] & 0xff) << 8));
						i_77_ = ((aByteArray7308[3] & 0xff) + ((aByteArray7308[2] & 0xff) << 8));
						i_78_ = (((aByteArray7308[4] & 0xff) << 16) + ((aByteArray7308[5] & 0xff) << 8) + (aByteArray7308[6] & 0xff));
						i_79_ = aByteArray7308[7] & 0xff;
					}
					if (i_76_ != i || i_72_ != i_77_ || anInt7310 * -1378996243 != i_79_) {
						byte[] is_80_ = null;
						return is_80_;
					}
					if (i_78_ < 0 || ((long) i_78_ > aClass1_7307.method493((byte) 5) / 520L)) {
						byte[] is_81_ = null;
						return is_81_;
					}
					int i_82_ = i_74_ + i_75_;
					for (int i_83_ = i_75_; i_83_ < i_82_; i_83_++)
						is_70_[i_71_++] = aByteArray7308[i_83_];
					i_67_ = i_78_;
					i_72_++;
				}
				is = is_70_;
			} catch (IOException ioexception) {
				byte[] is_84_ = null;
				return is_84_;
			}
			return is;
		}
	}

	public boolean method9142(int i, byte[] is, int i_85_) {
		synchronized (aClass1_7307) {
			if (i_85_ < 0 || i_85_ > anInt7311 * 1760394243)
				throw new IllegalArgumentException(new StringBuilder().append("").append(-1378996243 * anInt7310).append(',').append(i).append(',').append(i_85_).toString());
			boolean bool = method9137(i, is, i_85_, true, -698843588);
			if (!bool)
				bool = method9137(i, is, i_85_, false, -909400880);
			boolean bool_86_ = bool;
			return bool_86_;
		}
	}

	public String toString() {
		return new StringBuilder().append("").append(anInt7310 * -1378996243).toString();
	}

	public boolean method9143(int i, byte[] is, int i_87_) {
		synchronized (aClass1_7307) {
			if (i_87_ < 0 || i_87_ > anInt7311 * 1760394243)
				throw new IllegalArgumentException(new StringBuilder().append("").append(-1378996243 * anInt7310).append(',').append(i).append(',').append(i_87_).toString());
			boolean bool = method9137(i, is, i_87_, true, 267969318);
			if (!bool)
				bool = method9137(i, is, i_87_, false, 1835480394);
			boolean bool_88_ = bool;
			return bool_88_;
		}
	}

	public boolean method9144(int i, byte[] is, int i_89_) {
		synchronized (aClass1_7307) {
			if (i_89_ < 0 || i_89_ > anInt7311 * 1760394243)
				throw new IllegalArgumentException(new StringBuilder().append("").append(-1378996243 * anInt7310).append(',').append(i).append(',').append(i_89_).toString());
			boolean bool = method9137(i, is, i_89_, true, 1237708736);
			if (!bool)
				bool = method9137(i, is, i_89_, false, 1685147251);
			boolean bool_90_ = bool;
			return bool_90_;
		}
	}

	public boolean method9145(int i, byte[] is, int i_91_) {
		synchronized (aClass1_7307) {
			if (i_91_ < 0 || i_91_ > anInt7311 * 1760394243)
				throw new IllegalArgumentException(new StringBuilder().append("").append(-1378996243 * anInt7310).append(',').append(i).append(',').append(i_91_).toString());
			boolean bool = method9137(i, is, i_91_, true, 2009541714);
			if (!bool)
				bool = method9137(i, is, i_91_, false, -882945911);
			boolean bool_92_ = bool;
			return bool_92_;
		}
	}

	boolean method9146(int i, byte[] is, int i_93_, boolean bool) {
		synchronized (aClass1_7307) {
			boolean bool_94_;
			try {
				int i_95_;
				if (bool) {
					if (aClass1_7309.method493((byte) 5) < (long) (6 + i * 6)) {
						boolean bool_96_ = false;
						return bool_96_;
					}
					aClass1_7309.method492((long) (6 * i));
					aClass1_7309.method502(aByteArray7308, 0, 6, -2074152504);
					i_95_ = ((aByteArray7308[5] & 0xff) + (((aByteArray7308[4] & 0xff) << 8) + ((aByteArray7308[3] & 0xff) << 16)));
					if (i_95_ <= 0 || ((long) i_95_ > aClass1_7307.method493((byte) 5) / 520L)) {
						boolean bool_97_ = false;
						return bool_97_;
					}
				} else {
					i_95_ = (int) ((aClass1_7307.method493((byte) 5) + 519L) / 520L);
					if (0 == i_95_)
						i_95_ = 1;
				}
				aByteArray7308[0] = (byte) (i_93_ >> 16);
				aByteArray7308[1] = (byte) (i_93_ >> 8);
				aByteArray7308[2] = (byte) i_93_;
				aByteArray7308[3] = (byte) (i_95_ >> 16);
				aByteArray7308[4] = (byte) (i_95_ >> 8);
				aByteArray7308[5] = (byte) i_95_;
				aClass1_7309.method492((long) (6 * i));
				aClass1_7309.method497(aByteArray7308, 0, 6, (byte) -97);
				int i_98_ = 0;
				int i_99_ = 0;
				while (i_98_ < i_93_) {
					int i_100_ = 0;
					if (bool) {
						aClass1_7307.method492(520L * (long) i_95_);
						int i_101_;
						int i_102_;
						int i_103_;
						if (i > 65535) {
							try {
								aClass1_7307.method502(aByteArray7308, 0, 10, -1982024184);
							} catch (EOFException eofexception) {
								break;
							}
							i_101_ = ((aByteArray7308[3] & 0xff) + (((aByteArray7308[1] & 0xff) << 16) + ((aByteArray7308[0] & 0xff) << 24) + ((aByteArray7308[2] & 0xff) << 8)));
							i_102_ = (((aByteArray7308[4] & 0xff) << 8) + (aByteArray7308[5] & 0xff));
							i_100_ = (((aByteArray7308[6] & 0xff) << 16) + ((aByteArray7308[7] & 0xff) << 8) + (aByteArray7308[8] & 0xff));
							i_103_ = aByteArray7308[9] & 0xff;
						} else {
							try {
								aClass1_7307.method502(aByteArray7308, 0, 8, -1917763466);
							} catch (EOFException eofexception) {
								break;
							}
							i_101_ = ((aByteArray7308[1] & 0xff) + ((aByteArray7308[0] & 0xff) << 8));
							i_102_ = (((aByteArray7308[2] & 0xff) << 8) + (aByteArray7308[3] & 0xff));
							i_100_ = (((aByteArray7308[4] & 0xff) << 16) + ((aByteArray7308[5] & 0xff) << 8) + (aByteArray7308[6] & 0xff));
							i_103_ = aByteArray7308[7] & 0xff;
						}
						if (i != i_101_ || i_99_ != i_102_ || i_103_ != anInt7310 * -1378996243) {
							boolean bool_104_ = false;
							return bool_104_;
						}
						if (i_100_ < 0 || ((long) i_100_ > aClass1_7307.method493((byte) 5) / 520L)) {
							boolean bool_105_ = false;
							return bool_105_;
						}
					}
					if (0 == i_100_) {
						bool = false;
						i_100_ = (int) ((aClass1_7307.method493((byte) 5) + 519L) / 520L);
						if (i_100_ == 0)
							i_100_++;
						if (i_95_ == i_100_)
							i_100_++;
					}
					if (i > 65535) {
						if (i_93_ - i_98_ <= 510)
							i_100_ = 0;
						aByteArray7308[0] = (byte) (i >> 24);
						aByteArray7308[1] = (byte) (i >> 16);
						aByteArray7308[2] = (byte) (i >> 8);
						aByteArray7308[3] = (byte) i;
						aByteArray7308[4] = (byte) (i_99_ >> 8);
						aByteArray7308[5] = (byte) i_99_;
						aByteArray7308[6] = (byte) (i_100_ >> 16);
						aByteArray7308[7] = (byte) (i_100_ >> 8);
						aByteArray7308[8] = (byte) i_100_;
						aByteArray7308[9] = (byte) (-1378996243 * anInt7310);
						aClass1_7307.method492(520L * (long) i_95_);
						aClass1_7307.method497(aByteArray7308, 0, 10, (byte) -5);
						int i_106_ = i_93_ - i_98_;
						if (i_106_ > 510)
							i_106_ = 510;
						aClass1_7307.method497(is, i_98_, i_106_, (byte) -67);
						i_98_ += i_106_;
					} else {
						if (i_93_ - i_98_ <= 512)
							i_100_ = 0;
						aByteArray7308[0] = (byte) (i >> 8);
						aByteArray7308[1] = (byte) i;
						aByteArray7308[2] = (byte) (i_99_ >> 8);
						aByteArray7308[3] = (byte) i_99_;
						aByteArray7308[4] = (byte) (i_100_ >> 16);
						aByteArray7308[5] = (byte) (i_100_ >> 8);
						aByteArray7308[6] = (byte) i_100_;
						aByteArray7308[7] = (byte) (anInt7310 * -1378996243);
						aClass1_7307.method492(520L * (long) i_95_);
						aClass1_7307.method497(aByteArray7308, 0, 8, (byte) -33);
						int i_107_ = i_93_ - i_98_;
						if (i_107_ > 512)
							i_107_ = 512;
						aClass1_7307.method497(is, i_98_, i_107_, (byte) -20);
						i_98_ += i_107_;
					}
					i_95_ = i_100_;
					i_99_++;
				}
				bool_94_ = true;
			} catch (IOException ioexception) {
				boolean bool_108_ = false;
				return bool_108_;
			}
			return bool_94_;
		}
	}

	static final void method9147(Class665 class665, int i) {
		int i_109_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_109_, 1917153418);
		Class240 class240 = Class183.aClass240Array2100[i_109_ >> 16];
		Class601_Sub1.method16681(class243, class240, class665, (short) 26642);
	}

	static final void method9148(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class95.method1729(class243, class240, class665, (byte) -13);
	}

	static final void method9149(Class243 class243, Class240 class240, Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		class243.anInt2566 = (class665.anIntArray8525[1769813785 * class665.anInt8526] * -92092631);
		class243.anInt2551 = (class665.anIntArray8525[1769813785 * class665.anInt8526 + 1] * 2002451487);
		Class430.method6876(class243, (byte) 116);
	}

	public static void method9150(Canvas canvas, int i) {
		try {
			Class var_class = Class.forName("java.awt.Canvas");
			Method method = var_class.getMethod("setIgnoreRepaint", new Class[] { Boolean.TYPE });
			method.invoke(canvas, new Object[] { Boolean.TRUE });
		} catch (Exception exception) {
			/* empty */
		}
	}

	public static void method9151(int i, int i_110_) {
		Class293.anInt3266 = -1154387723 * i;
		Class527_Sub34_Sub1.aClass527_Sub34_Sub1Array11810 = new Class527_Sub34_Sub1[i];
		Class281.anInt3189 = 0;
	}
}
