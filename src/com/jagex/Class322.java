/* Class322 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class322 implements Interface14 {
	short[] aShortArray3553;
	int[] anIntArray3554;
	byte[] aByteArray3555;
	short[] aShortArray3556;
	short[] aShortArray3557;
	Class459 aClass459_3558;
	public static int[] anIntArray3559 = { 0, 1, 2, 3, 4, 5, 6, 14 };
	int[] anIntArray3560 = { -1, -1, -1, -1, -1 };
	byte[] aByteArray3561;
	short[] aShortArray3562;
	public static int[] anIntArray3563 = { 7, 8, 9, 10, 11, 12, 13, 15 };

	void method5704(RSByteBuffer class527_sub38, int i) {
		if (1 == i)
			class527_sub38.readUnsignedByte();
		else if (i == 2) {
			int i_0_ = class527_sub38.readUnsignedByte();
			anIntArray3554 = new int[i_0_];
			for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
				anIntArray3554[i_1_] = class527_sub38.method16466(-2064503577);
		} else if (3 != i) {
			if (i == 40) {
				int i_2_ = class527_sub38.readUnsignedByte();
				aShortArray3553 = new short[i_2_];
				aShortArray3556 = new short[i_2_];
				for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
					aShortArray3553[i_3_] = (short) class527_sub38.readUnsignedShort();
					aShortArray3556[i_3_] = (short) class527_sub38.readUnsignedShort();
				}
			} else if (i == 41) {
				int i_4_ = class527_sub38.readUnsignedByte();
				aShortArray3557 = new short[i_4_];
				aShortArray3562 = new short[i_4_];
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
					aShortArray3557[i_5_] = (short) class527_sub38.readUnsignedShort();
					aShortArray3562[i_5_] = (short) class527_sub38.readUnsignedShort();
				}
			} else if (i == 44) {
				int i_6_ = class527_sub38.readUnsignedShort();
				int i_7_ = 0;
				for (int i_8_ = i_6_; i_8_ > 0; i_8_ >>= 1)
					i_7_++;
				aByteArray3561 = new byte[i_7_];
				byte i_9_ = 0;
				for (int i_10_ = 0; i_10_ < i_7_; i_10_++) {
					if ((i_6_ & 1 << i_10_) > 0) {
						aByteArray3561[i_10_] = i_9_;
						i_9_++;
					} else
						aByteArray3561[i_10_] = (byte) -1;
				}
			} else if (i == 45) {
				int i_11_ = class527_sub38.readUnsignedShort();
				int i_12_ = 0;
				for (int i_13_ = i_11_; i_13_ > 0; i_13_ >>= 1)
					i_12_++;
				aByteArray3555 = new byte[i_12_];
				byte i_14_ = 0;
				for (int i_15_ = 0; i_15_ < i_12_; i_15_++) {
					if ((i_11_ & 1 << i_15_) > 0) {
						aByteArray3555[i_15_] = i_14_;
						i_14_++;
					} else
						aByteArray3555[i_15_] = (byte) -1;
				}
			} else if (i >= 60 && i < 70)
				anIntArray3560[i - 60] = class527_sub38.method16466(-2085747882);
		}
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method5710(class527_sub38, i, (byte) -58);
		}
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method5710(class527_sub38, i, (byte) -73);
		}
	}

	public void method86(int i) {
		/* empty */
	}

	public boolean method5705(byte i) {
		if (anIntArray3554 == null)
			return true;
		boolean bool = true;
		synchronized (aClass459_3558) {
			for (int i_16_ = 0; i_16_ < anIntArray3554.length; i_16_++) {
				if (!aClass459_3558.method7479(anIntArray3554[i_16_], 0, 102380841))
					bool = false;
			}
		}
		return bool;
	}

	public Class175 method5706(int i) {
		if (anIntArray3554 == null)
			return null;
		Class175[] class175s = new Class175[anIntArray3554.length];
		synchronized (aClass459_3558) {
			for (int i_17_ = 0; i_17_ < anIntArray3554.length; i_17_++)
				class175s[i_17_] = Class175.method2814(aClass459_3558, anIntArray3554[i_17_], 0);
		}
		for (int i_18_ = 0; i_18_ < anIntArray3554.length; i_18_++) {
			if (class175s[i_18_].anInt1905 < 13)
				class175s[i_18_].method2829(2);
		}
		Class175 class175;
		if (1 == class175s.length)
			class175 = class175s[0];
		else
			class175 = new Class175(class175s, class175s.length);
		if (null == class175)
			return null;
		if (aShortArray3553 != null) {
			for (int i_19_ = 0; i_19_ < aShortArray3553.length; i_19_++)
				class175.method2803(aShortArray3553[i_19_], aShortArray3556[i_19_]);
		}
		if (aShortArray3557 != null) {
			for (int i_20_ = 0; i_20_ < aShortArray3557.length; i_20_++)
				class175.method2853(aShortArray3557[i_20_], aShortArray3562[i_20_]);
		}
		return class175;
	}

	public Class175 method5707() {
		Class175[] class175s = new Class175[5];
		int i = 0;
		synchronized (aClass459_3558) {
			for (int i_21_ = 0; i_21_ < 5; i_21_++) {
				if (anIntArray3560[i_21_] != -1)
					class175s[i++] = Class175.method2814(aClass459_3558, anIntArray3560[i_21_], 0);
			}
		}
		for (int i_22_ = 0; i_22_ < 5; i_22_++) {
			if (null != class175s[i_22_] && class175s[i_22_].anInt1905 < 13)
				class175s[i_22_].method2829(2);
		}
		Class175 class175 = new Class175(class175s, i);
		if (aShortArray3553 != null) {
			for (int i_23_ = 0; i_23_ < aShortArray3553.length; i_23_++)
				class175.method2803(aShortArray3553[i_23_], aShortArray3556[i_23_]);
		}
		if (null != aShortArray3557) {
			for (int i_24_ = 0; i_24_ < aShortArray3557.length; i_24_++)
				class175.method2853(aShortArray3557[i_24_], aShortArray3562[i_24_]);
		}
		return class175;
	}

	public Class175 method5708(int i) {
		Class175[] class175s = new Class175[5];
		int i_25_ = 0;
		synchronized (aClass459_3558) {
			for (int i_26_ = 0; i_26_ < 5; i_26_++) {
				if (anIntArray3560[i_26_] != -1)
					class175s[i_25_++] = Class175.method2814(aClass459_3558, anIntArray3560[i_26_], 0);
			}
		}
		for (int i_27_ = 0; i_27_ < 5; i_27_++) {
			if (null != class175s[i_27_] && class175s[i_27_].anInt1905 < 13)
				class175s[i_27_].method2829(2);
		}
		Class175 class175 = new Class175(class175s, i_25_);
		if (aShortArray3553 != null) {
			for (int i_28_ = 0; i_28_ < aShortArray3553.length; i_28_++)
				class175.method2803(aShortArray3553[i_28_], aShortArray3556[i_28_]);
		}
		if (null != aShortArray3557) {
			for (int i_29_ = 0; i_29_ < aShortArray3557.length; i_29_++)
				class175.method2853(aShortArray3557[i_29_], aShortArray3562[i_29_]);
		}
		return class175;
	}

	public Class175 method5709() {
		if (anIntArray3554 == null)
			return null;
		Class175[] class175s = new Class175[anIntArray3554.length];
		synchronized (aClass459_3558) {
			for (int i = 0; i < anIntArray3554.length; i++)
				class175s[i] = Class175.method2814(aClass459_3558, anIntArray3554[i], 0);
		}
		for (int i = 0; i < anIntArray3554.length; i++) {
			if (class175s[i].anInt1905 < 13)
				class175s[i].method2829(2);
		}
		Class175 class175;
		if (1 == class175s.length)
			class175 = class175s[0];
		else
			class175 = new Class175(class175s, class175s.length);
		if (null == class175)
			return null;
		if (aShortArray3553 != null) {
			for (int i = 0; i < aShortArray3553.length; i++)
				class175.method2803(aShortArray3553[i], aShortArray3556[i]);
		}
		if (aShortArray3557 != null) {
			for (int i = 0; i < aShortArray3557.length; i++)
				class175.method2853(aShortArray3557[i], aShortArray3562[i]);
		}
		return class175;
	}

	void method5710(RSByteBuffer class527_sub38, int i, byte i_30_) {
		if (1 == i)
			class527_sub38.readUnsignedByte();
		else if (i == 2) {
			int i_31_ = class527_sub38.readUnsignedByte();
			anIntArray3554 = new int[i_31_];
			for (int i_32_ = 0; i_32_ < i_31_; i_32_++)
				anIntArray3554[i_32_] = class527_sub38.method16466(-2074845000);
		} else if (3 != i) {
			if (i == 40) {
				int i_33_ = class527_sub38.readUnsignedByte();
				aShortArray3553 = new short[i_33_];
				aShortArray3556 = new short[i_33_];
				for (int i_34_ = 0; i_34_ < i_33_; i_34_++) {
					aShortArray3553[i_34_] = (short) class527_sub38.readUnsignedShort();
					aShortArray3556[i_34_] = (short) class527_sub38.readUnsignedShort();
				}
			} else if (i == 41) {
				int i_35_ = class527_sub38.readUnsignedByte();
				aShortArray3557 = new short[i_35_];
				aShortArray3562 = new short[i_35_];
				for (int i_36_ = 0; i_36_ < i_35_; i_36_++) {
					aShortArray3557[i_36_] = (short) class527_sub38.readUnsignedShort();
					aShortArray3562[i_36_] = (short) class527_sub38.readUnsignedShort();
				}
			} else if (i == 44) {
				int i_37_ = class527_sub38.readUnsignedShort();
				int i_38_ = 0;
				for (int i_39_ = i_37_; i_39_ > 0; i_39_ >>= 1)
					i_38_++;
				aByteArray3561 = new byte[i_38_];
				byte i_40_ = 0;
				for (int i_41_ = 0; i_41_ < i_38_; i_41_++) {
					if ((i_37_ & 1 << i_41_) > 0) {
						aByteArray3561[i_41_] = i_40_;
						i_40_++;
					} else
						aByteArray3561[i_41_] = (byte) -1;
				}
			} else if (i == 45) {
				int i_42_ = class527_sub38.readUnsignedShort();
				int i_43_ = 0;
				for (int i_44_ = i_42_; i_44_ > 0; i_44_ >>= 1)
					i_43_++;
				aByteArray3555 = new byte[i_43_];
				byte i_45_ = 0;
				for (int i_46_ = 0; i_46_ < i_43_; i_46_++) {
					if ((i_42_ & 1 << i_46_) > 0) {
						aByteArray3555[i_46_] = i_45_;
						i_45_++;
					} else
						aByteArray3555[i_46_] = (byte) -1;
				}
			} else if (i >= 60 && i < 70)
				anIntArray3560[i - 60] = class527_sub38.method16466(-1706403322);
		}
	}

	public boolean method5711(int i) {
		boolean bool = true;
		synchronized (aClass459_3558) {
			for (int i_47_ = 0; i_47_ < 5; i_47_++) {
				if (-1 != anIntArray3560[i_47_] && !aClass459_3558.method7479(anIntArray3560[i_47_], 0, 102380841))
					bool = false;
			}
		}
		return bool;
	}

	public void method84() {
		/* empty */
	}

	void method5712(RSByteBuffer class527_sub38, int i) {
		if (1 == i)
			class527_sub38.readUnsignedByte();
		else if (i == 2) {
			int i_48_ = class527_sub38.readUnsignedByte();
			anIntArray3554 = new int[i_48_];
			for (int i_49_ = 0; i_49_ < i_48_; i_49_++)
				anIntArray3554[i_49_] = class527_sub38.method16466(-1861396180);
		} else if (3 != i) {
			if (i == 40) {
				int i_50_ = class527_sub38.readUnsignedByte();
				aShortArray3553 = new short[i_50_];
				aShortArray3556 = new short[i_50_];
				for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
					aShortArray3553[i_51_] = (short) class527_sub38.readUnsignedShort();
					aShortArray3556[i_51_] = (short) class527_sub38.readUnsignedShort();
				}
			} else if (i == 41) {
				int i_52_ = class527_sub38.readUnsignedByte();
				aShortArray3557 = new short[i_52_];
				aShortArray3562 = new short[i_52_];
				for (int i_53_ = 0; i_53_ < i_52_; i_53_++) {
					aShortArray3557[i_53_] = (short) class527_sub38.readUnsignedShort();
					aShortArray3562[i_53_] = (short) class527_sub38.readUnsignedShort();
				}
			} else if (i == 44) {
				int i_54_ = class527_sub38.readUnsignedShort();
				int i_55_ = 0;
				for (int i_56_ = i_54_; i_56_ > 0; i_56_ >>= 1)
					i_55_++;
				aByteArray3561 = new byte[i_55_];
				byte i_57_ = 0;
				for (int i_58_ = 0; i_58_ < i_55_; i_58_++) {
					if ((i_54_ & 1 << i_58_) > 0) {
						aByteArray3561[i_58_] = i_57_;
						i_57_++;
					} else
						aByteArray3561[i_58_] = (byte) -1;
				}
			} else if (i == 45) {
				int i_59_ = class527_sub38.readUnsignedShort();
				int i_60_ = 0;
				for (int i_61_ = i_59_; i_61_ > 0; i_61_ >>= 1)
					i_60_++;
				aByteArray3555 = new byte[i_60_];
				byte i_62_ = 0;
				for (int i_63_ = 0; i_63_ < i_60_; i_63_++) {
					if ((i_59_ & 1 << i_63_) > 0) {
						aByteArray3555[i_63_] = i_62_;
						i_62_++;
					} else
						aByteArray3555[i_63_] = (byte) -1;
				}
			} else if (i >= 60 && i < 70)
				anIntArray3560[i - 60] = class527_sub38.method16466(-1708099193);
		}
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_64_ = class527_sub38.readUnsignedByte();
			if (0 == i_64_)
				break;
			method5710(class527_sub38, i_64_, (byte) -36);
		}
	}

	public boolean method5713() {
		if (anIntArray3554 == null)
			return true;
		boolean bool = true;
		synchronized (aClass459_3558) {
			for (int i = 0; i < anIntArray3554.length; i++) {
				if (!aClass459_3558.method7479(anIntArray3554[i], 0, 102380841))
					bool = false;
			}
		}
		return bool;
	}

	public boolean method5714() {
		if (anIntArray3554 == null)
			return true;
		boolean bool = true;
		synchronized (aClass459_3558) {
			for (int i = 0; i < anIntArray3554.length; i++) {
				if (!aClass459_3558.method7479(anIntArray3554[i], 0, 102380841))
					bool = false;
			}
		}
		return bool;
	}

	public boolean method5715() {
		if (anIntArray3554 == null)
			return true;
		boolean bool = true;
		synchronized (aClass459_3558) {
			for (int i = 0; i < anIntArray3554.length; i++) {
				if (!aClass459_3558.method7479(anIntArray3554[i], 0, 102380841))
					bool = false;
			}
		}
		return bool;
	}

	public void method85() {
		/* empty */
	}

	public Class175 method5716() {
		if (anIntArray3554 == null)
			return null;
		Class175[] class175s = new Class175[anIntArray3554.length];
		synchronized (aClass459_3558) {
			for (int i = 0; i < anIntArray3554.length; i++)
				class175s[i] = Class175.method2814(aClass459_3558, anIntArray3554[i], 0);
		}
		for (int i = 0; i < anIntArray3554.length; i++) {
			if (class175s[i].anInt1905 < 13)
				class175s[i].method2829(2);
		}
		Class175 class175;
		if (1 == class175s.length)
			class175 = class175s[0];
		else
			class175 = new Class175(class175s, class175s.length);
		if (null == class175)
			return null;
		if (aShortArray3553 != null) {
			for (int i = 0; i < aShortArray3553.length; i++)
				class175.method2803(aShortArray3553[i], aShortArray3556[i]);
		}
		if (aShortArray3557 != null) {
			for (int i = 0; i < aShortArray3557.length; i++)
				class175.method2853(aShortArray3557[i], aShortArray3562[i]);
		}
		return class175;
	}

	public boolean method5717() {
		boolean bool = true;
		synchronized (aClass459_3558) {
			for (int i = 0; i < 5; i++) {
				if (-1 != anIntArray3560[i] && !aClass459_3558.method7479(anIntArray3560[i], 0, 102380841))
					bool = false;
			}
		}
		return bool;
	}

	public boolean method5718() {
		boolean bool = true;
		synchronized (aClass459_3558) {
			for (int i = 0; i < 5; i++) {
				if (-1 != anIntArray3560[i] && !aClass459_3558.method7479(anIntArray3560[i], 0, 102380841))
					bool = false;
			}
		}
		return bool;
	}

	public Class175 method5719() {
		Class175[] class175s = new Class175[5];
		int i = 0;
		synchronized (aClass459_3558) {
			for (int i_65_ = 0; i_65_ < 5; i_65_++) {
				if (anIntArray3560[i_65_] != -1)
					class175s[i++] = Class175.method2814(aClass459_3558, anIntArray3560[i_65_], 0);
			}
		}
		for (int i_66_ = 0; i_66_ < 5; i_66_++) {
			if (null != class175s[i_66_] && class175s[i_66_].anInt1905 < 13)
				class175s[i_66_].method2829(2);
		}
		Class175 class175 = new Class175(class175s, i);
		if (aShortArray3553 != null) {
			for (int i_67_ = 0; i_67_ < aShortArray3553.length; i_67_++)
				class175.method2803(aShortArray3553[i_67_], aShortArray3556[i_67_]);
		}
		if (null != aShortArray3557) {
			for (int i_68_ = 0; i_68_ < aShortArray3557.length; i_68_++)
				class175.method2853(aShortArray3557[i_68_], aShortArray3562[i_68_]);
		}
		return class175;
	}

	Class322(int i, Class459 class459) {
		aClass459_3558 = class459;
	}

	public Class175 method5720() {
		Class175[] class175s = new Class175[5];
		int i = 0;
		synchronized (aClass459_3558) {
			for (int i_69_ = 0; i_69_ < 5; i_69_++) {
				if (anIntArray3560[i_69_] != -1)
					class175s[i++] = Class175.method2814(aClass459_3558, anIntArray3560[i_69_], 0);
			}
		}
		for (int i_70_ = 0; i_70_ < 5; i_70_++) {
			if (null != class175s[i_70_] && class175s[i_70_].anInt1905 < 13)
				class175s[i_70_].method2829(2);
		}
		Class175 class175 = new Class175(class175s, i);
		if (aShortArray3553 != null) {
			for (int i_71_ = 0; i_71_ < aShortArray3553.length; i_71_++)
				class175.method2803(aShortArray3553[i_71_], aShortArray3556[i_71_]);
		}
		if (null != aShortArray3557) {
			for (int i_72_ = 0; i_72_ < aShortArray3557.length; i_72_++)
				class175.method2853(aShortArray3557[i_72_], aShortArray3562[i_72_]);
		}
		return class175;
	}

	static final void method5721(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class527_Sub24_Sub2.method18174(class243, class240, class665, -1965626850);
	}

	static final void method5722(Class665 class665, byte i) throws Exception_Sub6 {
		class665.anInt8526 -= 204761682;
		int i_73_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_74_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		Class208_Sub10.aClass296_Sub1_9923.method5431((float) (3.141592653589793 * (double) i_73_ * 2.0 / 16384.0), (float) (2.0 * ((double) i_74_ * 3.141592653589793) / 16384.0), -1768994012);
	}
}
