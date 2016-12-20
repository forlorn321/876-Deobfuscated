/* Class685 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class685 implements Interface14 {
	int anInt8655;
	Class676 aClass676_8656;
	int anInt8657;
	byte[] aByteArray8658;
	short[] aShortArray8659;
	short[] aShortArray8660;
	short[] aShortArray8661;
	int anInt8662;
	short[] aShortArray8663;
	byte[] aByteArray8664;
	public boolean aBool8665;
	int anInt8666;
	int anInt8667;
	int anInt8668;
	static final int anInt8669 = 8224;
	int anInt8670;
	public int anInt8671 = -555856381;
	byte aByte8672;
	int anInt8673;

	final Class176 method13929(Class180 class180, int i, boolean bool, Class161 class161, Class161 class161_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, Class695 class695, byte i_8_) {
		int i_9_ = i;
		bool = bool & aByte8672 != 0;
		if (class695 != null)
			i_9_ |= class695.method14174(-822649352);
		if (anInt8667 * 1718250905 != 128)
			i_9_ |= 0x2;
		if (128 != -2031298775 * anInt8666 || 0 != anInt8668 * -638547033 || 0 != i_4_)
			i_9_ |= 0x5;
		if (bool)
			i_9_ |= 0x7;
		Class176 class176;
		synchronized (aClass676_8656.aClass205_8592) {
			class176 = ((Class176) (aClass676_8656.aClass205_8592.method3787((long) (-1446108027 * anInt8657 | -397006101 * class180.anInt2064 << 29))));
		}
		if (class176 == null || class180.method3175(class176.method2874(), i_9_) != 0) {
			if (class176 != null)
				i_9_ = class180.method3176(i_9_, class176.method2874());
			int i_10_ = i_9_;
			if (null != aShortArray8660)
				i_10_ |= 0x4000;
			if (aShortArray8661 != null)
				i_10_ |= 0x8000;
			Class175 class175 = Class175.method2814(aClass676_8656.aClass459_8594, anInt8655 * -757170789, 0);
			if (null == class175)
				return null;
			if (class175.anInt1905 < 13)
				class175.method2829(2);
			class176 = class180.method3376(class175, i_10_, -389759161 * aClass676_8656.anInt8593, 64 + anInt8670 * 180024929, 850 + anInt8662 * -1251833877);
			if (aShortArray8660 != null) {
				for (int i_11_ = 0; i_11_ < aShortArray8660.length; i_11_++)
					class176.method2907(aShortArray8660[i_11_], aShortArray8659[i_11_]);
			}
			if (aShortArray8661 != null) {
				for (int i_12_ = 0; i_12_ < aShortArray8661.length; i_12_++)
					class176.method2909(aShortArray8661[i_12_], aShortArray8663[i_12_]);
			}
			class176.method2941(i_9_);
			synchronized (aClass676_8656.aClass205_8592) {
				aClass676_8656.aClass205_8592.method3790(class176, (long) (-1446108027 * anInt8657 | class180.anInt2064 * -397006101 << 29));
			}
		}
		Class176 class176_13_ = class176.method2862(i_8_, i_9_, true);
		if (null != class695)
			class695.method14175(class176_13_, 0, (byte) 0);
		if (anInt8666 * -2031298775 != 128 || 128 != 1718250905 * anInt8667)
			class176_13_.method2872(-2031298775 * anInt8666, anInt8667 * 1718250905, anInt8666 * -2031298775);
		if (0 != -638547033 * anInt8668) {
			if (-638547033 * anInt8668 == 90)
				i_4_ += 4096;
			if (-638547033 * anInt8668 == 180)
				i_4_ += 8192;
			if (anInt8668 * -638547033 == 270)
				i_4_ += 12288;
		}
		if (i_4_ != 0) {
			i_4_ &= 0x3fff;
			class176_13_.method2911(i_4_);
		}
		if (bool) {
			if (class161 != null)
				class176_13_.method2873(aByte8672, anInt8673 * 412562009, class161, class161_0_, i_1_, i_2_, i_3_);
			else {
				if (0 != i_5_)
					class176_13_.method2868(i_5_);
				if (0 != i_6_)
					class176_13_.method2869(i_6_);
				if (0 != i_7_)
					class176_13_.method3015(0, i_7_, 0);
			}
		}
		class176_13_.method2941(i);
		return class176_13_;
	}

	final Class176 method13930(Class180 class180, int i, boolean bool, Class161 class161, Class161 class161_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, Class695 class695, byte i_22_) {
		int i_23_ = i;
		bool = bool & aByte8672 != 0;
		if (class695 != null)
			i_23_ |= class695.method14174(-822649352);
		if (anInt8667 * 1718250905 != 128)
			i_23_ |= 0x2;
		if (128 != -2031298775 * anInt8666 || 0 != anInt8668 * -638547033 || 0 != i_18_)
			i_23_ |= 0x5;
		if (bool)
			i_23_ |= 0x7;
		Class176 class176;
		synchronized (aClass676_8656.aClass205_8592) {
			class176 = ((Class176) (aClass676_8656.aClass205_8592.method3787((long) (-1446108027 * anInt8657 | -397006101 * class180.anInt2064 << 29))));
		}
		if (class176 == null || class180.method3175(class176.method2874(), i_23_) != 0) {
			if (class176 != null)
				i_23_ = class180.method3176(i_23_, class176.method2874());
			int i_24_ = i_23_;
			if (null != aShortArray8660)
				i_24_ |= 0x4000;
			if (aShortArray8661 != null)
				i_24_ |= 0x8000;
			Class175 class175 = Class175.method2814(aClass676_8656.aClass459_8594, anInt8655 * -757170789, 0);
			if (null == class175)
				return null;
			if (class175.anInt1905 < 13)
				class175.method2829(2);
			class176 = class180.method3376(class175, i_24_, -389759161 * aClass676_8656.anInt8593, 64 + anInt8670 * 180024929, 850 + anInt8662 * -1251833877);
			if (aShortArray8660 != null) {
				for (int i_25_ = 0; i_25_ < aShortArray8660.length; i_25_++)
					class176.method2907(aShortArray8660[i_25_], aShortArray8659[i_25_]);
			}
			if (aShortArray8661 != null) {
				for (int i_26_ = 0; i_26_ < aShortArray8661.length; i_26_++)
					class176.method2909(aShortArray8661[i_26_], aShortArray8663[i_26_]);
			}
			class176.method2941(i_23_);
			synchronized (aClass676_8656.aClass205_8592) {
				aClass676_8656.aClass205_8592.method3790(class176, (long) (-1446108027 * anInt8657 | class180.anInt2064 * -397006101 << 29));
			}
		}
		Class176 class176_27_ = class176.method2862(i_22_, i_23_, true);
		if (null != class695)
			class695.method14175(class176_27_, 0, (byte) 0);
		if (anInt8666 * -2031298775 != 128 || 128 != 1718250905 * anInt8667)
			class176_27_.method2872(-2031298775 * anInt8666, anInt8667 * 1718250905, anInt8666 * -2031298775);
		if (0 != -638547033 * anInt8668) {
			if (-638547033 * anInt8668 == 90)
				i_18_ += 4096;
			if (-638547033 * anInt8668 == 180)
				i_18_ += 8192;
			if (anInt8668 * -638547033 == 270)
				i_18_ += 12288;
		}
		if (i_18_ != 0) {
			i_18_ &= 0x3fff;
			class176_27_.method2911(i_18_);
		}
		if (bool) {
			if (class161 != null)
				class176_27_.method2873(aByte8672, anInt8673 * 412562009, class161, class161_14_, i_15_, i_16_, i_17_);
			else {
				if (0 != i_19_)
					class176_27_.method2868(i_19_);
				if (0 != i_20_)
					class176_27_.method2869(i_20_);
				if (0 != i_21_)
					class176_27_.method3015(0, i_21_, 0);
			}
		}
		class176_27_.method2941(i);
		return class176_27_;
	}

	public void method85() {
		/* empty */
	}

	public final Class176 method13931(Class180 class180, int i, Class695 class695, byte i_28_, short i_29_) {
		return method13934(class180, i, false, null, null, 0, 0, 0, 0, 0, 0, 0, class695, i_28_, -314008326);
	}

	public final Class176 method13932(Class180 class180, int i, int i_30_, int i_31_, int i_32_, int i_33_, Class695 class695, byte i_34_, byte i_35_) {
		if (aByte8672 != 3)
			return method13934(class180, i, false, null, null, 0, 0, 0, i_30_, 0, 0, 0, class695, i_34_, -314008326);
		return method13934(class180, i, true, null, null, 0, 0, 0, i_30_, i_31_, i_32_, i_33_, class695, i_34_, -314008326);
	}

	public final Class176 method13933(Class180 class180, int i, int i_36_, Class161 class161, Class161 class161_37_, int i_38_, int i_39_, int i_40_, Class695 class695, byte i_41_, byte i_42_) {
		return method13934(class180, i, true, class161, class161_37_, i_38_, i_39_, i_40_, i_36_, 0, 0, 0, class695, i_41_, -314008326);
	}

	final Class176 method13934(Class180 class180, int i, boolean bool, Class161 class161, Class161 class161_43_, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, Class695 class695, byte i_51_, int i_52_) {
		int i_53_ = i;
		bool = bool & aByte8672 != 0;
		if (class695 != null)
			i_53_ |= class695.method14174(-822649352);
		if (anInt8667 * 1718250905 != 128)
			i_53_ |= 0x2;
		if (128 != -2031298775 * anInt8666 || 0 != anInt8668 * -638547033 || 0 != i_47_)
			i_53_ |= 0x5;
		if (bool)
			i_53_ |= 0x7;
		Class176 class176;
		synchronized (aClass676_8656.aClass205_8592) {
			class176 = ((Class176) (aClass676_8656.aClass205_8592.method3787((long) (-1446108027 * anInt8657 | -397006101 * class180.anInt2064 << 29))));
		}
		if (class176 == null || class180.method3175(class176.method2874(), i_53_) != 0) {
			if (class176 != null)
				i_53_ = class180.method3176(i_53_, class176.method2874());
			int i_54_ = i_53_;
			if (null != aShortArray8660)
				i_54_ |= 0x4000;
			if (aShortArray8661 != null)
				i_54_ |= 0x8000;
			Class175 class175 = Class175.method2814(aClass676_8656.aClass459_8594, anInt8655 * -757170789, 0);
			if (null == class175)
				return null;
			if (class175.anInt1905 < 13)
				class175.method2829(2);
			class176 = class180.method3376(class175, i_54_, -389759161 * aClass676_8656.anInt8593, 64 + anInt8670 * 180024929, 850 + anInt8662 * -1251833877);
			if (aShortArray8660 != null) {
				for (int i_55_ = 0; i_55_ < aShortArray8660.length; i_55_++)
					class176.method2907(aShortArray8660[i_55_], aShortArray8659[i_55_]);
			}
			if (aShortArray8661 != null) {
				for (int i_56_ = 0; i_56_ < aShortArray8661.length; i_56_++)
					class176.method2909(aShortArray8661[i_56_], aShortArray8663[i_56_]);
			}
			class176.method2941(i_53_);
			synchronized (aClass676_8656.aClass205_8592) {
				aClass676_8656.aClass205_8592.method3790(class176, (long) (-1446108027 * anInt8657 | class180.anInt2064 * -397006101 << 29));
			}
		}
		Class176 class176_57_ = class176.method2862(i_51_, i_53_, true);
		if (null != class695)
			class695.method14175(class176_57_, 0, (byte) 0);
		if (anInt8666 * -2031298775 != 128 || 128 != 1718250905 * anInt8667)
			class176_57_.method2872(-2031298775 * anInt8666, anInt8667 * 1718250905, anInt8666 * -2031298775);
		if (0 != -638547033 * anInt8668) {
			if (-638547033 * anInt8668 == 90)
				i_47_ += 4096;
			if (-638547033 * anInt8668 == 180)
				i_47_ += 8192;
			if (anInt8668 * -638547033 == 270)
				i_47_ += 12288;
		}
		if (i_47_ != 0) {
			i_47_ &= 0x3fff;
			class176_57_.method2911(i_47_);
		}
		if (bool) {
			if (class161 != null)
				class176_57_.method2873(aByte8672, anInt8673 * 412562009, class161, class161_43_, i_44_, i_45_, i_46_);
			else {
				if (0 != i_48_)
					class176_57_.method2868(i_48_);
				if (0 != i_49_)
					class176_57_.method2869(i_49_);
				if (0 != i_50_)
					class176_57_.method3015(0, i_50_, 0);
			}
		}
		class176_57_.method2941(i);
		return class176_57_;
	}

	public final boolean method13935(int i) {
		if (-1 == anInt8655 * -757170789)
			return true;
		return aClass676_8656.aClass459_8594.method7479(-757170789 * anInt8655, 0, 102380841);
	}

	public void method86(int i) {
		/* empty */
	}

	public void method84() {
		/* empty */
	}

	void method13936(RSByteBuffer class527_sub38, int i, int i_58_) {
		do {
			if (i == 1)
				anInt8655 = class527_sub38.method16466(-2026970103) * 1300734099;
			else if (2 == i)
				anInt8671 = class527_sub38.method16466(-1960680575) * 555856381;
			else if (i == 4)
				anInt8666 = class527_sub38.readUnsignedShort() * 1269282073;
			else if (i == 5)
				anInt8667 = class527_sub38.readUnsignedShort() * 2071369385;
			else if (6 == i)
				anInt8668 = class527_sub38.readUnsignedShort() * -1495307241;
			else if (7 == i)
				anInt8670 = class527_sub38.readUnsignedByte() * 1083977121;
			else if (8 == i)
				anInt8662 = class527_sub38.readUnsignedByte() * 1886480579;
			else if (i == 10)
				aBool8665 = true;
			else if (9 == i) {
				aByte8672 = (byte) 3;
				anInt8673 = 1767628064;
			} else if (i == 15) {
				aByte8672 = (byte) 3;
				anInt8673 = class527_sub38.readUnsignedShort() * -699075095;
			} else if (i == 16) {
				aByte8672 = (byte) 3;
				anInt8673 = class527_sub38.readInt() * -699075095;
			} else if (i == 40) {
				int i_59_ = class527_sub38.readUnsignedByte();
				aShortArray8660 = new short[i_59_];
				aShortArray8659 = new short[i_59_];
				for (int i_60_ = 0; i_60_ < i_59_; i_60_++) {
					aShortArray8660[i_60_] = (short) class527_sub38.readUnsignedShort();
					aShortArray8659[i_60_] = (short) class527_sub38.readUnsignedShort();
				}
			} else if (i == 41) {
				int i_61_ = class527_sub38.readUnsignedByte();
				aShortArray8661 = new short[i_61_];
				aShortArray8663 = new short[i_61_];
				for (int i_62_ = 0; i_62_ < i_61_; i_62_++) {
					aShortArray8661[i_62_] = (short) class527_sub38.readUnsignedShort();
					aShortArray8663[i_62_] = (short) class527_sub38.readUnsignedShort();
				}
			} else if (44 == i) {
				int i_63_ = class527_sub38.readUnsignedShort();
				int i_64_ = 0;
				for (int i_65_ = i_63_; i_65_ > 0; i_65_ >>= 1)
					i_64_++;
				aByteArray8664 = new byte[i_64_];
				byte i_66_ = 0;
				for (int i_67_ = 0; i_67_ < i_64_; i_67_++) {
					if ((i_63_ & 1 << i_67_) > 0) {
						aByteArray8664[i_67_] = i_66_;
						i_66_++;
					} else
						aByteArray8664[i_67_] = (byte) -1;
				}
			} else if (45 == i) {
				int i_68_ = class527_sub38.readUnsignedShort();
				int i_69_ = 0;
				for (int i_70_ = i_68_; i_70_ > 0; i_70_ >>= 1)
					i_69_++;
				aByteArray8658 = new byte[i_69_];
				byte i_71_ = 0;
				for (int i_72_ = 0; i_72_ < i_69_; i_72_++) {
					if ((i_68_ & 1 << i_72_) > 0) {
						aByteArray8658[i_72_] = i_71_;
						i_71_++;
					} else
						aByteArray8658[i_72_] = (byte) -1;
				}
			} else if (i == 46)
				break;
		} while (false);
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method13936(class527_sub38, i, -619872988);
		}
	}

	public final Class176 method13937(Class180 class180, int i, int i_73_, int i_74_, int i_75_, int i_76_, Class695 class695, byte i_77_) {
		if (aByte8672 != 3)
			return method13934(class180, i, false, null, null, 0, 0, 0, i_73_, 0, 0, 0, class695, i_77_, -314008326);
		return method13934(class180, i, true, null, null, 0, 0, 0, i_73_, i_74_, i_75_, i_76_, class695, i_77_, -314008326);
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_78_ = class527_sub38.readUnsignedByte();
			if (i_78_ == 0)
				break;
			method13936(class527_sub38, i_78_, -269525790);
		}
	}

	void method13938(RSByteBuffer class527_sub38, int i) {
		do {
			if (i == 1)
				anInt8655 = class527_sub38.method16466(-1980228153) * 1300734099;
			else if (2 == i)
				anInt8671 = class527_sub38.method16466(-1631396559) * 555856381;
			else if (i == 4)
				anInt8666 = class527_sub38.readUnsignedShort() * 1269282073;
			else if (i == 5)
				anInt8667 = class527_sub38.readUnsignedShort() * 2071369385;
			else if (6 == i)
				anInt8668 = class527_sub38.readUnsignedShort() * -1495307241;
			else if (7 == i)
				anInt8670 = class527_sub38.readUnsignedByte() * 1083977121;
			else if (8 == i)
				anInt8662 = class527_sub38.readUnsignedByte() * 1886480579;
			else if (i == 10)
				aBool8665 = true;
			else if (9 == i) {
				aByte8672 = (byte) 3;
				anInt8673 = 1767628064;
			} else if (i == 15) {
				aByte8672 = (byte) 3;
				anInt8673 = class527_sub38.readUnsignedShort() * -699075095;
			} else if (i == 16) {
				aByte8672 = (byte) 3;
				anInt8673 = class527_sub38.readInt() * -699075095;
			} else if (i == 40) {
				int i_79_ = class527_sub38.readUnsignedByte();
				aShortArray8660 = new short[i_79_];
				aShortArray8659 = new short[i_79_];
				for (int i_80_ = 0; i_80_ < i_79_; i_80_++) {
					aShortArray8660[i_80_] = (short) class527_sub38.readUnsignedShort();
					aShortArray8659[i_80_] = (short) class527_sub38.readUnsignedShort();
				}
			} else if (i == 41) {
				int i_81_ = class527_sub38.readUnsignedByte();
				aShortArray8661 = new short[i_81_];
				aShortArray8663 = new short[i_81_];
				for (int i_82_ = 0; i_82_ < i_81_; i_82_++) {
					aShortArray8661[i_82_] = (short) class527_sub38.readUnsignedShort();
					aShortArray8663[i_82_] = (short) class527_sub38.readUnsignedShort();
				}
			} else if (44 == i) {
				int i_83_ = class527_sub38.readUnsignedShort();
				int i_84_ = 0;
				for (int i_85_ = i_83_; i_85_ > 0; i_85_ >>= 1)
					i_84_++;
				aByteArray8664 = new byte[i_84_];
				byte i_86_ = 0;
				for (int i_87_ = 0; i_87_ < i_84_; i_87_++) {
					if ((i_83_ & 1 << i_87_) > 0) {
						aByteArray8664[i_87_] = i_86_;
						i_86_++;
					} else
						aByteArray8664[i_87_] = (byte) -1;
				}
			} else if (45 == i) {
				int i_88_ = class527_sub38.readUnsignedShort();
				int i_89_ = 0;
				for (int i_90_ = i_88_; i_90_ > 0; i_90_ >>= 1)
					i_89_++;
				aByteArray8658 = new byte[i_89_];
				byte i_91_ = 0;
				for (int i_92_ = 0; i_92_ < i_89_; i_92_++) {
					if ((i_88_ & 1 << i_92_) > 0) {
						aByteArray8658[i_92_] = i_91_;
						i_91_++;
					} else
						aByteArray8658[i_92_] = (byte) -1;
				}
			} else if (i == 46)
				break;
		} while (false);
	}

	public final Class176 method13939(Class180 class180, int i, Class695 class695, byte i_93_) {
		return method13934(class180, i, false, null, null, 0, 0, 0, 0, 0, 0, 0, class695, i_93_, -314008326);
	}

	public final Class176 method13940(Class180 class180, int i, Class695 class695, byte i_94_) {
		return method13934(class180, i, false, null, null, 0, 0, 0, 0, 0, 0, 0, class695, i_94_, -314008326);
	}

	public final Class176 method13941(Class180 class180, int i, Class695 class695, byte i_95_) {
		return method13934(class180, i, false, null, null, 0, 0, 0, 0, 0, 0, 0, class695, i_95_, -314008326);
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method13936(class527_sub38, i, -903938059);
		}
	}

	public final Class176 method13942(Class180 class180, int i, int i_96_, int i_97_, int i_98_, int i_99_, Class695 class695, byte i_100_) {
		if (aByte8672 != 3)
			return method13934(class180, i, false, null, null, 0, 0, 0, i_96_, 0, 0, 0, class695, i_100_, -314008326);
		return method13934(class180, i, true, null, null, 0, 0, 0, i_96_, i_97_, i_98_, i_99_, class695, i_100_, -314008326);
	}

	public final Class176 method13943(Class180 class180, int i, int i_101_, int i_102_, int i_103_, int i_104_, Class695 class695, byte i_105_) {
		if (aByte8672 != 3)
			return method13934(class180, i, false, null, null, 0, 0, 0, i_101_, 0, 0, 0, class695, i_105_, -314008326);
		return method13934(class180, i, true, null, null, 0, 0, 0, i_101_, i_102_, i_103_, i_104_, class695, i_105_, -314008326);
	}

	public final Class176 method13944(Class180 class180, int i, int i_106_, Class161 class161, Class161 class161_107_, int i_108_, int i_109_, int i_110_, Class695 class695, byte i_111_) {
		return method13934(class180, i, true, class161, class161_107_, i_108_, i_109_, i_110_, i_106_, 0, 0, 0, class695, i_111_, -314008326);
	}

	Class685(int i, Class676 class676) {
		anInt8666 = -740651904;
		anInt8667 = -1152691072;
		anInt8668 = 0;
		anInt8670 = 0;
		anInt8662 = 0;
		aBool8665 = false;
		aByte8672 = (byte) 0;
		anInt8673 = 699075095;
		anInt8657 = 629421133 * i;
		aClass676_8656 = class676;
	}

	final Class176 method13945(Class180 class180, int i, boolean bool, Class161 class161, Class161 class161_112_, int i_113_, int i_114_, int i_115_, int i_116_, int i_117_, int i_118_, int i_119_, Class695 class695, byte i_120_) {
		int i_121_ = i;
		bool = bool & aByte8672 != 0;
		if (class695 != null)
			i_121_ |= class695.method14174(-822649352);
		if (anInt8667 * 1718250905 != 128)
			i_121_ |= 0x2;
		if (128 != -2031298775 * anInt8666 || 0 != anInt8668 * -638547033 || 0 != i_116_)
			i_121_ |= 0x5;
		if (bool)
			i_121_ |= 0x7;
		Class176 class176;
		synchronized (aClass676_8656.aClass205_8592) {
			class176 = ((Class176) (aClass676_8656.aClass205_8592.method3787((long) (-1446108027 * anInt8657 | -397006101 * class180.anInt2064 << 29))));
		}
		if (class176 == null || class180.method3175(class176.method2874(), i_121_) != 0) {
			if (class176 != null)
				i_121_ = class180.method3176(i_121_, class176.method2874());
			int i_122_ = i_121_;
			if (null != aShortArray8660)
				i_122_ |= 0x4000;
			if (aShortArray8661 != null)
				i_122_ |= 0x8000;
			Class175 class175 = Class175.method2814(aClass676_8656.aClass459_8594, anInt8655 * -757170789, 0);
			if (null == class175)
				return null;
			if (class175.anInt1905 < 13)
				class175.method2829(2);
			class176 = class180.method3376(class175, i_122_, -389759161 * aClass676_8656.anInt8593, 64 + anInt8670 * 180024929, 850 + anInt8662 * -1251833877);
			if (aShortArray8660 != null) {
				for (int i_123_ = 0; i_123_ < aShortArray8660.length; i_123_++)
					class176.method2907(aShortArray8660[i_123_], aShortArray8659[i_123_]);
			}
			if (aShortArray8661 != null) {
				for (int i_124_ = 0; i_124_ < aShortArray8661.length; i_124_++)
					class176.method2909(aShortArray8661[i_124_], aShortArray8663[i_124_]);
			}
			class176.method2941(i_121_);
			synchronized (aClass676_8656.aClass205_8592) {
				aClass676_8656.aClass205_8592.method3790(class176, (long) (-1446108027 * anInt8657 | class180.anInt2064 * -397006101 << 29));
			}
		}
		Class176 class176_125_ = class176.method2862(i_120_, i_121_, true);
		if (null != class695)
			class695.method14175(class176_125_, 0, (byte) 0);
		if (anInt8666 * -2031298775 != 128 || 128 != 1718250905 * anInt8667)
			class176_125_.method2872(-2031298775 * anInt8666, anInt8667 * 1718250905, anInt8666 * -2031298775);
		if (0 != -638547033 * anInt8668) {
			if (-638547033 * anInt8668 == 90)
				i_116_ += 4096;
			if (-638547033 * anInt8668 == 180)
				i_116_ += 8192;
			if (anInt8668 * -638547033 == 270)
				i_116_ += 12288;
		}
		if (i_116_ != 0) {
			i_116_ &= 0x3fff;
			class176_125_.method2911(i_116_);
		}
		if (bool) {
			if (class161 != null)
				class176_125_.method2873(aByte8672, anInt8673 * 412562009, class161, class161_112_, i_113_, i_114_, i_115_);
			else {
				if (0 != i_117_)
					class176_125_.method2868(i_117_);
				if (0 != i_118_)
					class176_125_.method2869(i_118_);
				if (0 != i_119_)
					class176_125_.method3015(0, i_119_, 0);
			}
		}
		class176_125_.method2941(i);
		return class176_125_;
	}

	final Class176 method13946(Class180 class180, int i, boolean bool, Class161 class161, Class161 class161_126_, int i_127_, int i_128_, int i_129_, int i_130_, int i_131_, int i_132_, int i_133_, Class695 class695, byte i_134_) {
		int i_135_ = i;
		bool = bool & aByte8672 != 0;
		if (class695 != null)
			i_135_ |= class695.method14174(-822649352);
		if (anInt8667 * 1718250905 != 128)
			i_135_ |= 0x2;
		if (128 != -2031298775 * anInt8666 || 0 != anInt8668 * -638547033 || 0 != i_130_)
			i_135_ |= 0x5;
		if (bool)
			i_135_ |= 0x7;
		Class176 class176;
		synchronized (aClass676_8656.aClass205_8592) {
			class176 = ((Class176) (aClass676_8656.aClass205_8592.method3787((long) (-1446108027 * anInt8657 | -397006101 * class180.anInt2064 << 29))));
		}
		if (class176 == null || class180.method3175(class176.method2874(), i_135_) != 0) {
			if (class176 != null)
				i_135_ = class180.method3176(i_135_, class176.method2874());
			int i_136_ = i_135_;
			if (null != aShortArray8660)
				i_136_ |= 0x4000;
			if (aShortArray8661 != null)
				i_136_ |= 0x8000;
			Class175 class175 = Class175.method2814(aClass676_8656.aClass459_8594, anInt8655 * -757170789, 0);
			if (null == class175)
				return null;
			if (class175.anInt1905 < 13)
				class175.method2829(2);
			class176 = class180.method3376(class175, i_136_, -389759161 * aClass676_8656.anInt8593, 64 + anInt8670 * 180024929, 850 + anInt8662 * -1251833877);
			if (aShortArray8660 != null) {
				for (int i_137_ = 0; i_137_ < aShortArray8660.length; i_137_++)
					class176.method2907(aShortArray8660[i_137_], aShortArray8659[i_137_]);
			}
			if (aShortArray8661 != null) {
				for (int i_138_ = 0; i_138_ < aShortArray8661.length; i_138_++)
					class176.method2909(aShortArray8661[i_138_], aShortArray8663[i_138_]);
			}
			class176.method2941(i_135_);
			synchronized (aClass676_8656.aClass205_8592) {
				aClass676_8656.aClass205_8592.method3790(class176, (long) (-1446108027 * anInt8657 | class180.anInt2064 * -397006101 << 29));
			}
		}
		Class176 class176_139_ = class176.method2862(i_134_, i_135_, true);
		if (null != class695)
			class695.method14175(class176_139_, 0, (byte) 0);
		if (anInt8666 * -2031298775 != 128 || 128 != 1718250905 * anInt8667)
			class176_139_.method2872(-2031298775 * anInt8666, anInt8667 * 1718250905, anInt8666 * -2031298775);
		if (0 != -638547033 * anInt8668) {
			if (-638547033 * anInt8668 == 90)
				i_130_ += 4096;
			if (-638547033 * anInt8668 == 180)
				i_130_ += 8192;
			if (anInt8668 * -638547033 == 270)
				i_130_ += 12288;
		}
		if (i_130_ != 0) {
			i_130_ &= 0x3fff;
			class176_139_.method2911(i_130_);
		}
		if (bool) {
			if (class161 != null)
				class176_139_.method2873(aByte8672, anInt8673 * 412562009, class161, class161_126_, i_127_, i_128_, i_129_);
			else {
				if (0 != i_131_)
					class176_139_.method2868(i_131_);
				if (0 != i_132_)
					class176_139_.method2869(i_132_);
				if (0 != i_133_)
					class176_139_.method3015(0, i_133_, 0);
			}
		}
		class176_139_.method2941(i);
		return class176_139_;
	}

	void method13947(RSByteBuffer class527_sub38, int i) {
		do {
			if (i == 1)
				anInt8655 = class527_sub38.method16466(-1897790681) * 1300734099;
			else if (2 == i)
				anInt8671 = class527_sub38.method16466(-2098507665) * 555856381;
			else if (i == 4)
				anInt8666 = class527_sub38.readUnsignedShort() * 1269282073;
			else if (i == 5)
				anInt8667 = class527_sub38.readUnsignedShort() * 2071369385;
			else if (6 == i)
				anInt8668 = class527_sub38.readUnsignedShort() * -1495307241;
			else if (7 == i)
				anInt8670 = class527_sub38.readUnsignedByte() * 1083977121;
			else if (8 == i)
				anInt8662 = class527_sub38.readUnsignedByte() * 1886480579;
			else if (i == 10)
				aBool8665 = true;
			else if (9 == i) {
				aByte8672 = (byte) 3;
				anInt8673 = 1767628064;
			} else if (i == 15) {
				aByte8672 = (byte) 3;
				anInt8673 = class527_sub38.readUnsignedShort() * -699075095;
			} else if (i == 16) {
				aByte8672 = (byte) 3;
				anInt8673 = class527_sub38.readInt() * -699075095;
			} else if (i == 40) {
				int i_140_ = class527_sub38.readUnsignedByte();
				aShortArray8660 = new short[i_140_];
				aShortArray8659 = new short[i_140_];
				for (int i_141_ = 0; i_141_ < i_140_; i_141_++) {
					aShortArray8660[i_141_] = (short) class527_sub38.readUnsignedShort();
					aShortArray8659[i_141_] = (short) class527_sub38.readUnsignedShort();
				}
			} else if (i == 41) {
				int i_142_ = class527_sub38.readUnsignedByte();
				aShortArray8661 = new short[i_142_];
				aShortArray8663 = new short[i_142_];
				for (int i_143_ = 0; i_143_ < i_142_; i_143_++) {
					aShortArray8661[i_143_] = (short) class527_sub38.readUnsignedShort();
					aShortArray8663[i_143_] = (short) class527_sub38.readUnsignedShort();
				}
			} else if (44 == i) {
				int i_144_ = class527_sub38.readUnsignedShort();
				int i_145_ = 0;
				for (int i_146_ = i_144_; i_146_ > 0; i_146_ >>= 1)
					i_145_++;
				aByteArray8664 = new byte[i_145_];
				byte i_147_ = 0;
				for (int i_148_ = 0; i_148_ < i_145_; i_148_++) {
					if ((i_144_ & 1 << i_148_) > 0) {
						aByteArray8664[i_148_] = i_147_;
						i_147_++;
					} else
						aByteArray8664[i_148_] = (byte) -1;
				}
			} else if (45 == i) {
				int i_149_ = class527_sub38.readUnsignedShort();
				int i_150_ = 0;
				for (int i_151_ = i_149_; i_151_ > 0; i_151_ >>= 1)
					i_150_++;
				aByteArray8658 = new byte[i_150_];
				byte i_152_ = 0;
				for (int i_153_ = 0; i_153_ < i_150_; i_153_++) {
					if ((i_149_ & 1 << i_153_) > 0) {
						aByteArray8658[i_153_] = i_152_;
						i_152_++;
					} else
						aByteArray8658[i_153_] = (byte) -1;
				}
			} else if (i == 46)
				break;
		} while (false);
	}

	public final boolean method13948() {
		if (-1 == anInt8655 * -757170789)
			return true;
		return aClass676_8656.aClass459_8594.method7479(-757170789 * anInt8655, 0, 102380841);
	}

	static final void method13949(Class665 class665, byte i) {
		int i_154_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_154_, 1298360422);
		Class240 class240 = Class183.aClass240Array2100[i_154_ >> 16];
		Class615.method10186(class243, class240, class665, -568253638);
	}

	public static int method13950(byte i) {
		return 10;
	}
}
