/* Class313 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class313 implements Interface13 {
	short[] aShortArray3488;
	byte[] aByteArray3489;
	short[] aShortArray3490;
	int[] anIntArray3491;
	short[] aShortArray3492;
	Class461 aClass461_3493;
	byte[] aByteArray3494;
	short[] aShortArray3495;
	int[] anIntArray3496 = { -1, -1, -1, -1, -1 };
	public static int[] anIntArray3497 = { 0, 1, 2, 3, 4, 5, 6, 14 };
	public static int[] anIntArray3498 = { 7, 8, 9, 10, 11, 12, 13, 15 };
	protected static int anInt3499;
	public static client aclient3500;

	void method4185(RSByteBuffer class536_sub33, int i) {
		if (i == 1)
			class536_sub33.readUnsignedByte();
		else if (i == 2) {
			int i_0_ = class536_sub33.readUnsignedByte();
			anIntArray3491 = new int[i_0_];
			for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
				anIntArray3491[i_1_] = class536_sub33.readBigSmart((byte) 1);
		} else if (3 != i) {
			if (40 == i) {
				int i_2_ = class536_sub33.readUnsignedByte();
				aShortArray3490 = new short[i_2_];
				aShortArray3488 = new short[i_2_];
				for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
					aShortArray3490[i_3_] = (short) class536_sub33.readUnsignedShort();
					aShortArray3488[i_3_] = (short) class536_sub33.readUnsignedShort();
				}
			} else if (i == 41) {
				int i_4_ = class536_sub33.readUnsignedByte();
				aShortArray3492 = new short[i_4_];
				aShortArray3495 = new short[i_4_];
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
					aShortArray3492[i_5_] = (short) class536_sub33.readUnsignedShort();
					aShortArray3495[i_5_] = (short) class536_sub33.readUnsignedShort();
				}
			} else if (44 == i) {
				int i_6_ = class536_sub33.readUnsignedShort();
				int i_7_ = 0;
				for (int i_8_ = i_6_; i_8_ > 0; i_8_ >>= 1)
					i_7_++;
				aByteArray3494 = new byte[i_7_];
				byte i_9_ = 0;
				for (int i_10_ = 0; i_10_ < i_7_; i_10_++) {
					if ((i_6_ & 1 << i_10_) > 0) {
						aByteArray3494[i_10_] = i_9_;
						i_9_++;
					} else
						aByteArray3494[i_10_] = (byte) -1;
				}
			} else if (i == 45) {
				int i_11_ = class536_sub33.readUnsignedShort();
				int i_12_ = 0;
				for (int i_13_ = i_11_; i_13_ > 0; i_13_ >>= 1)
					i_12_++;
				aByteArray3489 = new byte[i_12_];
				byte i_14_ = 0;
				for (int i_15_ = 0; i_15_ < i_12_; i_15_++) {
					if ((i_11_ & 1 << i_15_) > 0) {
						aByteArray3489[i_15_] = i_14_;
						i_14_++;
					} else
						aByteArray3489[i_15_] = (byte) -1;
				}
			} else if (i >= 60 && i < 70)
				anIntArray3496[i - 60] = class536_sub33.readBigSmart((byte) 1);
		}
	}

	public void method77() {
		/* empty */
	}

	void method4186(RSByteBuffer class536_sub33, int i, byte i_16_) {
		if (i == 1)
			class536_sub33.readUnsignedByte();
		else if (i == 2) {
			int i_17_ = class536_sub33.readUnsignedByte();
			anIntArray3491 = new int[i_17_];
			for (int i_18_ = 0; i_18_ < i_17_; i_18_++)
				anIntArray3491[i_18_] = class536_sub33.readBigSmart((byte) 1);
		} else if (3 != i) {
			if (40 == i) {
				int i_19_ = class536_sub33.readUnsignedByte();
				aShortArray3490 = new short[i_19_];
				aShortArray3488 = new short[i_19_];
				for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
					aShortArray3490[i_20_] = (short) class536_sub33.readUnsignedShort();
					aShortArray3488[i_20_] = (short) class536_sub33.readUnsignedShort();
				}
			} else if (i == 41) {
				int i_21_ = class536_sub33.readUnsignedByte();
				aShortArray3492 = new short[i_21_];
				aShortArray3495 = new short[i_21_];
				for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
					aShortArray3492[i_22_] = (short) class536_sub33.readUnsignedShort();
					aShortArray3495[i_22_] = (short) class536_sub33.readUnsignedShort();
				}
			} else if (44 == i) {
				int i_23_ = class536_sub33.readUnsignedShort();
				int i_24_ = 0;
				for (int i_25_ = i_23_; i_25_ > 0; i_25_ >>= 1)
					i_24_++;
				aByteArray3494 = new byte[i_24_];
				byte i_26_ = 0;
				for (int i_27_ = 0; i_27_ < i_24_; i_27_++) {
					if ((i_23_ & 1 << i_27_) > 0) {
						aByteArray3494[i_27_] = i_26_;
						i_26_++;
					} else
						aByteArray3494[i_27_] = (byte) -1;
				}
			} else if (i == 45) {
				int i_28_ = class536_sub33.readUnsignedShort();
				int i_29_ = 0;
				for (int i_30_ = i_28_; i_30_ > 0; i_30_ >>= 1)
					i_29_++;
				aByteArray3489 = new byte[i_29_];
				byte i_31_ = 0;
				for (int i_32_ = 0; i_32_ < i_29_; i_32_++) {
					if ((i_28_ & 1 << i_32_) > 0) {
						aByteArray3489[i_32_] = i_31_;
						i_31_++;
					} else
						aByteArray3489[i_32_] = (byte) -1;
				}
			} else if (i >= 60 && i < 70)
				anIntArray3496[i - 60] = class536_sub33.readBigSmart((byte) 1);
		}
	}

	public void method75(byte i) {
		/* empty */
	}

	public boolean method4187(int i) {
		if (anIntArray3491 == null)
			return true;
		boolean bool = true;
		synchronized (aClass461_3493) {
			for (int i_33_ = 0; i_33_ < anIntArray3491.length; i_33_++) {
				if (!aClass461_3493.method5558(anIntArray3491[i_33_], 0, 531239568))
					bool = false;
			}
		}
		return bool;
	}

	public Class180 method4188(int i) {
		if (null == anIntArray3491)
			return null;
		Class180[] class180s = new Class180[anIntArray3491.length];
		synchronized (aClass461_3493) {
			for (int i_34_ = 0; i_34_ < anIntArray3491.length; i_34_++)
				class180s[i_34_] = Class180.method2708(aClass461_3493, anIntArray3491[i_34_], 0);
		}
		for (int i_35_ = 0; i_35_ < anIntArray3491.length; i_35_++) {
			if (class180s[i_35_].anInt1949 < 13)
				class180s[i_35_].method2707(2);
		}
		Class180 class180;
		if (class180s.length == 1)
			class180 = class180s[0];
		else
			class180 = new Class180(class180s, class180s.length);
		if (class180 == null)
			return null;
		if (null != aShortArray3490) {
			for (int i_36_ = 0; i_36_ < aShortArray3490.length; i_36_++)
				class180.method2703(aShortArray3490[i_36_], aShortArray3488[i_36_]);
		}
		if (aShortArray3492 != null) {
			for (int i_37_ = 0; i_37_ < aShortArray3492.length; i_37_++)
				class180.method2704(aShortArray3492[i_37_], aShortArray3495[i_37_]);
		}
		return class180;
	}

	void method4189(RSByteBuffer class536_sub33, int i) {
		if (i == 1)
			class536_sub33.readUnsignedByte();
		else if (i == 2) {
			int i_38_ = class536_sub33.readUnsignedByte();
			anIntArray3491 = new int[i_38_];
			for (int i_39_ = 0; i_39_ < i_38_; i_39_++)
				anIntArray3491[i_39_] = class536_sub33.readBigSmart((byte) 1);
		} else if (3 != i) {
			if (40 == i) {
				int i_40_ = class536_sub33.readUnsignedByte();
				aShortArray3490 = new short[i_40_];
				aShortArray3488 = new short[i_40_];
				for (int i_41_ = 0; i_41_ < i_40_; i_41_++) {
					aShortArray3490[i_41_] = (short) class536_sub33.readUnsignedShort();
					aShortArray3488[i_41_] = (short) class536_sub33.readUnsignedShort();
				}
			} else if (i == 41) {
				int i_42_ = class536_sub33.readUnsignedByte();
				aShortArray3492 = new short[i_42_];
				aShortArray3495 = new short[i_42_];
				for (int i_43_ = 0; i_43_ < i_42_; i_43_++) {
					aShortArray3492[i_43_] = (short) class536_sub33.readUnsignedShort();
					aShortArray3495[i_43_] = (short) class536_sub33.readUnsignedShort();
				}
			} else if (44 == i) {
				int i_44_ = class536_sub33.readUnsignedShort();
				int i_45_ = 0;
				for (int i_46_ = i_44_; i_46_ > 0; i_46_ >>= 1)
					i_45_++;
				aByteArray3494 = new byte[i_45_];
				byte i_47_ = 0;
				for (int i_48_ = 0; i_48_ < i_45_; i_48_++) {
					if ((i_44_ & 1 << i_48_) > 0) {
						aByteArray3494[i_48_] = i_47_;
						i_47_++;
					} else
						aByteArray3494[i_48_] = (byte) -1;
				}
			} else if (i == 45) {
				int i_49_ = class536_sub33.readUnsignedShort();
				int i_50_ = 0;
				for (int i_51_ = i_49_; i_51_ > 0; i_51_ >>= 1)
					i_50_++;
				aByteArray3489 = new byte[i_50_];
				byte i_52_ = 0;
				for (int i_53_ = 0; i_53_ < i_50_; i_53_++) {
					if ((i_49_ & 1 << i_53_) > 0) {
						aByteArray3489[i_53_] = i_52_;
						i_52_++;
					} else
						aByteArray3489[i_53_] = (byte) -1;
				}
			} else if (i >= 60 && i < 70)
				anIntArray3496[i - 60] = class536_sub33.readBigSmart((byte) 1);
		}
	}

	public Class180 method4190(byte i) {
		Class180[] class180s = new Class180[5];
		int i_54_ = 0;
		synchronized (aClass461_3493) {
			for (int i_55_ = 0; i_55_ < 5; i_55_++) {
				if (anIntArray3496[i_55_] != -1)
					class180s[i_54_++] = Class180.method2708(aClass461_3493, anIntArray3496[i_55_], 0);
			}
		}
		for (int i_56_ = 0; i_56_ < 5; i_56_++) {
			if (null != class180s[i_56_] && class180s[i_56_].anInt1949 < 13)
				class180s[i_56_].method2707(2);
		}
		Class180 class180 = new Class180(class180s, i_54_);
		if (null != aShortArray3490) {
			for (int i_57_ = 0; i_57_ < aShortArray3490.length; i_57_++)
				class180.method2703(aShortArray3490[i_57_], aShortArray3488[i_57_]);
		}
		if (null != aShortArray3492) {
			for (int i_58_ = 0; i_58_ < aShortArray3492.length; i_58_++)
				class180.method2704(aShortArray3492[i_58_], aShortArray3495[i_58_]);
		}
		return class180;
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (0 == i)
				break;
			method4186(class536_sub33, i, (byte) -65);
		}
	}

	void method4191(RSByteBuffer class536_sub33, int i) {
		if (i == 1)
			class536_sub33.readUnsignedByte();
		else if (i == 2) {
			int i_59_ = class536_sub33.readUnsignedByte();
			anIntArray3491 = new int[i_59_];
			for (int i_60_ = 0; i_60_ < i_59_; i_60_++)
				anIntArray3491[i_60_] = class536_sub33.readBigSmart((byte) 1);
		} else if (3 != i) {
			if (40 == i) {
				int i_61_ = class536_sub33.readUnsignedByte();
				aShortArray3490 = new short[i_61_];
				aShortArray3488 = new short[i_61_];
				for (int i_62_ = 0; i_62_ < i_61_; i_62_++) {
					aShortArray3490[i_62_] = (short) class536_sub33.readUnsignedShort();
					aShortArray3488[i_62_] = (short) class536_sub33.readUnsignedShort();
				}
			} else if (i == 41) {
				int i_63_ = class536_sub33.readUnsignedByte();
				aShortArray3492 = new short[i_63_];
				aShortArray3495 = new short[i_63_];
				for (int i_64_ = 0; i_64_ < i_63_; i_64_++) {
					aShortArray3492[i_64_] = (short) class536_sub33.readUnsignedShort();
					aShortArray3495[i_64_] = (short) class536_sub33.readUnsignedShort();
				}
			} else if (44 == i) {
				int i_65_ = class536_sub33.readUnsignedShort();
				int i_66_ = 0;
				for (int i_67_ = i_65_; i_67_ > 0; i_67_ >>= 1)
					i_66_++;
				aByteArray3494 = new byte[i_66_];
				byte i_68_ = 0;
				for (int i_69_ = 0; i_69_ < i_66_; i_69_++) {
					if ((i_65_ & 1 << i_69_) > 0) {
						aByteArray3494[i_69_] = i_68_;
						i_68_++;
					} else
						aByteArray3494[i_69_] = (byte) -1;
				}
			} else if (i == 45) {
				int i_70_ = class536_sub33.readUnsignedShort();
				int i_71_ = 0;
				for (int i_72_ = i_70_; i_72_ > 0; i_72_ >>= 1)
					i_71_++;
				aByteArray3489 = new byte[i_71_];
				byte i_73_ = 0;
				for (int i_74_ = 0; i_74_ < i_71_; i_74_++) {
					if ((i_70_ & 1 << i_74_) > 0) {
						aByteArray3489[i_74_] = i_73_;
						i_73_++;
					} else
						aByteArray3489[i_74_] = (byte) -1;
				}
			} else if (i >= 60 && i < 70)
				anIntArray3496[i - 60] = class536_sub33.readBigSmart((byte) 1);
		}
	}

	Class313(int i, Class461 class461) {
		aClass461_3493 = class461;
	}

	public boolean method4192(int i) {
		boolean bool = true;
		synchronized (aClass461_3493) {
			for (int i_75_ = 0; i_75_ < 5; i_75_++) {
				if (-1 != anIntArray3496[i_75_] && !aClass461_3493.method5558(anIntArray3496[i_75_], 0, 24549920))
					bool = false;
			}
		}
		return bool;
	}

	void method4193(RSByteBuffer class536_sub33, int i) {
		if (i == 1)
			class536_sub33.readUnsignedByte();
		else if (i == 2) {
			int i_76_ = class536_sub33.readUnsignedByte();
			anIntArray3491 = new int[i_76_];
			for (int i_77_ = 0; i_77_ < i_76_; i_77_++)
				anIntArray3491[i_77_] = class536_sub33.readBigSmart((byte) 1);
		} else if (3 != i) {
			if (40 == i) {
				int i_78_ = class536_sub33.readUnsignedByte();
				aShortArray3490 = new short[i_78_];
				aShortArray3488 = new short[i_78_];
				for (int i_79_ = 0; i_79_ < i_78_; i_79_++) {
					aShortArray3490[i_79_] = (short) class536_sub33.readUnsignedShort();
					aShortArray3488[i_79_] = (short) class536_sub33.readUnsignedShort();
				}
			} else if (i == 41) {
				int i_80_ = class536_sub33.readUnsignedByte();
				aShortArray3492 = new short[i_80_];
				aShortArray3495 = new short[i_80_];
				for (int i_81_ = 0; i_81_ < i_80_; i_81_++) {
					aShortArray3492[i_81_] = (short) class536_sub33.readUnsignedShort();
					aShortArray3495[i_81_] = (short) class536_sub33.readUnsignedShort();
				}
			} else if (44 == i) {
				int i_82_ = class536_sub33.readUnsignedShort();
				int i_83_ = 0;
				for (int i_84_ = i_82_; i_84_ > 0; i_84_ >>= 1)
					i_83_++;
				aByteArray3494 = new byte[i_83_];
				byte i_85_ = 0;
				for (int i_86_ = 0; i_86_ < i_83_; i_86_++) {
					if ((i_82_ & 1 << i_86_) > 0) {
						aByteArray3494[i_86_] = i_85_;
						i_85_++;
					} else
						aByteArray3494[i_86_] = (byte) -1;
				}
			} else if (i == 45) {
				int i_87_ = class536_sub33.readUnsignedShort();
				int i_88_ = 0;
				for (int i_89_ = i_87_; i_89_ > 0; i_89_ >>= 1)
					i_88_++;
				aByteArray3489 = new byte[i_88_];
				byte i_90_ = 0;
				for (int i_91_ = 0; i_91_ < i_88_; i_91_++) {
					if ((i_87_ & 1 << i_91_) > 0) {
						aByteArray3489[i_91_] = i_90_;
						i_90_++;
					} else
						aByteArray3489[i_91_] = (byte) -1;
				}
			} else if (i >= 60 && i < 70)
				anIntArray3496[i - 60] = class536_sub33.readBigSmart((byte) 1);
		}
	}

	public void method74(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_92_ = class536_sub33.readUnsignedByte();
			if (0 == i_92_)
				break;
			method4186(class536_sub33, i_92_, (byte) -71);
		}
	}

	public boolean method4194() {
		boolean bool = true;
		synchronized (aClass461_3493) {
			for (int i = 0; i < 5; i++) {
				if (-1 != anIntArray3496[i] && !aClass461_3493.method5558(anIntArray3496[i], 0, 735242349))
					bool = false;
			}
		}
		return bool;
	}

	public boolean method4195() {
		boolean bool = true;
		synchronized (aClass461_3493) {
			for (int i = 0; i < 5; i++) {
				if (-1 != anIntArray3496[i] && !aClass461_3493.method5558(anIntArray3496[i], 0, -1516650802))
					bool = false;
			}
		}
		return bool;
	}

	static final void method4196(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class208.method2971(class251, class234, class668, (byte) -36);
	}

	static final void method4197(Class668 class668, int i) {
		int i_93_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (i_93_ < 0)
			i_93_ = 0;
		client.anInt10997 = -1268819339 * (i_93_ + 1037490133 * client.anInt11111);
	}

	static final void method4198(Class668 class668, int i) {
		class668.anInt8542 -= 61855783;
		byte[] is = { (byte) class668.anIntArray8541[class668.anInt8542 * 1867269829] };
		byte[] is_94_ = { (byte) class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1] };
		int i_95_ = class668.anIntArray8541[2 + class668.anInt8542 * 1867269829];
		InterfaceDefinitions class251 = Class264.method3678(i_95_, -689214737);
		Class386.method4844(class251, is, is_94_, class668, 874400348);
	}

	static final int method4199(int i, byte i_96_) {
		return i < 7 ? 9 : 11;
	}

	static final void method4200(Class668 class668, int i) {
		Class649_Sub1_Sub5_Sub1_Sub1 class649_sub1_sub5_sub1_sub1 = ((Class649_Sub1_Sub5_Sub1_Sub1) class668.aClass649_Sub1_Sub5_Sub1_8554);
		Class296 class296 = class649_sub1_sub5_sub1_sub1.aClass296_12174;
		if (null != class296.anIntArray3304)
			class296 = class296.method3984(Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, (byte) -112);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class296 != null ? 1 : 0;
	}
}
