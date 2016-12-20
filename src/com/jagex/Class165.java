/* Class165 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class165 {
	static final int anInt1831 = 1;
	static final int anInt1832 = 0;
	static final int anInt1833 = 0;

	public static Class185[] method2652(Class459 class459, int i, int i_0_) {
		byte[] is = class459.method7470(i, i_0_, (byte) -14);
		if (is == null)
			return null;
		return method2657(is);
	}

	public static Class185 method2653(Class459 class459, int i, int i_1_) {
		byte[] is = class459.method7470(i, i_1_, (byte) -116);
		if (is == null)
			return null;
		return method2657(is)[0];
	}

	public static Class185[] method2654(Class459 class459, int i, int i_2_) {
		byte[] is = class459.method7470(i, i_2_, (byte) -78);
		if (is == null)
			return null;
		return method2657(is);
	}

	public static Class185[] method2655(Class459 class459, int i, int i_3_) {
		byte[] is = class459.method7470(i, i_3_, (byte) -7);
		if (is == null)
			return null;
		return method2657(is);
	}

	public static Class185[] method2656(Class459 class459, int i) {
		byte[] is = class459.method7512(i, 1447980132);
		if (is == null)
			return null;
		return method2657(is);
	}

	public static Class185[] method2657(byte[] is) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(is);
		class527_sub38.anInt10689 = (is.length - 2) * 1474750881;
		int i = class527_sub38.readUnsignedShort();
		int i_4_ = i >> 15;
		int i_5_ = i & 0x7fff;
		if (i_4_ == 0) {
			Class185_Sub2[] class185_sub2s = new Class185_Sub2[i_5_];
			for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
				class185_sub2s[i_6_] = new Class185_Sub2();
			class527_sub38.anInt10689 = (is.length - 7 - i_5_ * 8) * 1474750881;
			int i_7_ = class527_sub38.readUnsignedShort();
			int i_8_ = class527_sub38.readUnsignedShort();
			int i_9_ = (class527_sub38.readUnsignedByte() & 0xff) + 1;
			for (int i_10_ = 0; i_10_ < i_5_; i_10_++)
				class185_sub2s[i_10_].anInt9375 = class527_sub38.readUnsignedShort();
			for (int i_11_ = 0; i_11_ < i_5_; i_11_++)
				class185_sub2s[i_11_].anInt9378 = class527_sub38.readUnsignedShort();
			for (int i_12_ = 0; i_12_ < i_5_; i_12_++)
				class185_sub2s[i_12_].anInt9373 = class527_sub38.readUnsignedShort();
			for (int i_13_ = 0; i_13_ < i_5_; i_13_++)
				class185_sub2s[i_13_].anInt9372 = class527_sub38.readUnsignedShort();
			for (int i_14_ = 0; i_14_ < i_5_; i_14_++) {
				Class185_Sub2 class185_sub2 = class185_sub2s[i_14_];
				class185_sub2.anInt9374 = i_7_ - class185_sub2.anInt9373 - class185_sub2.anInt9375;
				class185_sub2.anInt9376 = i_8_ - class185_sub2.anInt9372 - class185_sub2.anInt9378;
			}
			class527_sub38.anInt10689 = (is.length - 7 - i_5_ * 8 - (i_9_ - 1) * 3) * 1474750881;
			int[] is_15_ = new int[i_9_];
			for (int i_16_ = 1; i_16_ < i_9_; i_16_++) {
				is_15_[i_16_] = class527_sub38.read24BitUnsignedInteger(2056552159);
				if (is_15_[i_16_] == 0)
					is_15_[i_16_] = 1;
			}
			for (int i_17_ = 0; i_17_ < i_5_; i_17_++)
				class185_sub2s[i_17_].anIntArray9377 = is_15_;
			class527_sub38.anInt10689 = 0;
			for (int i_18_ = 0; i_18_ < i_5_; i_18_++) {
				Class185_Sub2 class185_sub2 = class185_sub2s[i_18_];
				int i_19_ = class185_sub2.anInt9373 * class185_sub2.anInt9372;
				class185_sub2.aByteArray9371 = new byte[i_19_];
				int i_20_ = class527_sub38.readUnsignedByte();
				if ((i_20_ & 0x2) == 0) {
					if ((i_20_ & 0x1) == 0) {
						for (int i_21_ = 0; i_21_ < i_19_; i_21_++)
							class185_sub2.aByteArray9371[i_21_] = class527_sub38.readByte();
					} else {
						for (int i_22_ = 0; i_22_ < class185_sub2.anInt9373; i_22_++) {
							for (int i_23_ = 0; i_23_ < class185_sub2.anInt9372; i_23_++)
								class185_sub2.aByteArray9371[i_22_ + i_23_ * class185_sub2.anInt9373] = class527_sub38.readByte();
						}
					}
				} else {
					boolean bool = false;
					class185_sub2.aByteArray9379 = new byte[i_19_];
					if ((i_20_ & 0x1) == 0) {
						for (int i_24_ = 0; i_24_ < i_19_; i_24_++)
							class185_sub2.aByteArray9371[i_24_] = class527_sub38.readByte();
						for (int i_25_ = 0; i_25_ < i_19_; i_25_++) {
							byte i_26_ = (class185_sub2.aByteArray9379[i_25_] = class527_sub38.readByte());
							bool = bool | i_26_ != -1;
						}
					} else {
						for (int i_27_ = 0; i_27_ < class185_sub2.anInt9373; i_27_++) {
							for (int i_28_ = 0; i_28_ < class185_sub2.anInt9372; i_28_++)
								class185_sub2.aByteArray9371[i_27_ + i_28_ * class185_sub2.anInt9373] = class527_sub38.readByte();
						}
						for (int i_29_ = 0; i_29_ < class185_sub2.anInt9373; i_29_++) {
							for (int i_30_ = 0; i_30_ < class185_sub2.anInt9372; i_30_++) {
								byte i_31_ = (class185_sub2.aByteArray9379[i_29_ + i_30_ * (class185_sub2.anInt9373)] = class527_sub38.readByte());
								bool = bool | i_31_ != -1;
							}
						}
					}
					if (!bool)
						class185_sub2.aByteArray9379 = null;
				}
			}
			return class185_sub2s;
		}
		Class185_Sub1[] class185_sub1s = new Class185_Sub1[i_5_];
		class527_sub38.anInt10689 = 0;
		int i_32_ = class527_sub38.readUnsignedByte();
		if (i_32_ == 0) {
			boolean bool = class527_sub38.readUnsignedByte() == 1;
			int i_33_ = class527_sub38.readUnsignedShort();
			int i_34_ = class527_sub38.readUnsignedShort();
			for (int i_35_ = 0; i_35_ < i_5_; i_35_++) {
				int[] is_36_ = new int[i_33_ * i_34_];
				for (int i_37_ = 0; i_37_ < i_33_ * i_34_; i_37_++) {
					is_36_[i_37_] = ~0xffffff | class527_sub38.read24BitUnsignedInteger(1244745662);
					if (is_36_[i_37_] == -65281)
						is_36_[i_37_] = 0;
				}
				if (bool) {
					for (int i_38_ = 0; i_38_ < i_33_ * i_34_; i_38_++) {
						is_36_[i_38_] &= 0xffffff;
						is_36_[i_38_] |= class527_sub38.readUnsignedByte() << 24;
					}
				}
				class185_sub1s[i_35_] = new Class185_Sub1(i_33_, i_34_, is_36_);
			}
		} else {
			if (i_32_ == 1)
				throw new UnsupportedOperationException();
			throw new RuntimeException();
		}
		return class185_sub1s;
	}

	public static Class185[] method2658(byte[] is) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(is);
		class527_sub38.anInt10689 = (is.length - 2) * 1474750881;
		int i = class527_sub38.readUnsignedShort();
		int i_39_ = i >> 15;
		int i_40_ = i & 0x7fff;
		if (i_39_ == 0) {
			Class185_Sub2[] class185_sub2s = new Class185_Sub2[i_40_];
			for (int i_41_ = 0; i_41_ < i_40_; i_41_++)
				class185_sub2s[i_41_] = new Class185_Sub2();
			class527_sub38.anInt10689 = (is.length - 7 - i_40_ * 8) * 1474750881;
			int i_42_ = class527_sub38.readUnsignedShort();
			int i_43_ = class527_sub38.readUnsignedShort();
			int i_44_ = (class527_sub38.readUnsignedByte() & 0xff) + 1;
			for (int i_45_ = 0; i_45_ < i_40_; i_45_++)
				class185_sub2s[i_45_].anInt9375 = class527_sub38.readUnsignedShort();
			for (int i_46_ = 0; i_46_ < i_40_; i_46_++)
				class185_sub2s[i_46_].anInt9378 = class527_sub38.readUnsignedShort();
			for (int i_47_ = 0; i_47_ < i_40_; i_47_++)
				class185_sub2s[i_47_].anInt9373 = class527_sub38.readUnsignedShort();
			for (int i_48_ = 0; i_48_ < i_40_; i_48_++)
				class185_sub2s[i_48_].anInt9372 = class527_sub38.readUnsignedShort();
			for (int i_49_ = 0; i_49_ < i_40_; i_49_++) {
				Class185_Sub2 class185_sub2 = class185_sub2s[i_49_];
				class185_sub2.anInt9374 = (i_42_ - class185_sub2.anInt9373 - class185_sub2.anInt9375);
				class185_sub2.anInt9376 = (i_43_ - class185_sub2.anInt9372 - class185_sub2.anInt9378);
			}
			class527_sub38.anInt10689 = (is.length - 7 - i_40_ * 8 - (i_44_ - 1) * 3) * 1474750881;
			int[] is_50_ = new int[i_44_];
			for (int i_51_ = 1; i_51_ < i_44_; i_51_++) {
				is_50_[i_51_] = class527_sub38.read24BitUnsignedInteger(206946985);
				if (is_50_[i_51_] == 0)
					is_50_[i_51_] = 1;
			}
			for (int i_52_ = 0; i_52_ < i_40_; i_52_++)
				class185_sub2s[i_52_].anIntArray9377 = is_50_;
			class527_sub38.anInt10689 = 0;
			for (int i_53_ = 0; i_53_ < i_40_; i_53_++) {
				Class185_Sub2 class185_sub2 = class185_sub2s[i_53_];
				int i_54_ = class185_sub2.anInt9373 * class185_sub2.anInt9372;
				class185_sub2.aByteArray9371 = new byte[i_54_];
				int i_55_ = class527_sub38.readUnsignedByte();
				if ((i_55_ & 0x2) == 0) {
					if ((i_55_ & 0x1) == 0) {
						for (int i_56_ = 0; i_56_ < i_54_; i_56_++)
							class185_sub2.aByteArray9371[i_56_] = class527_sub38.readByte();
					} else {
						for (int i_57_ = 0; i_57_ < class185_sub2.anInt9373; i_57_++) {
							for (int i_58_ = 0; i_58_ < class185_sub2.anInt9372; i_58_++)
								class185_sub2.aByteArray9371[i_57_ + i_58_ * class185_sub2.anInt9373] = class527_sub38.readByte();
						}
					}
				} else {
					boolean bool = false;
					class185_sub2.aByteArray9379 = new byte[i_54_];
					if ((i_55_ & 0x1) == 0) {
						for (int i_59_ = 0; i_59_ < i_54_; i_59_++)
							class185_sub2.aByteArray9371[i_59_] = class527_sub38.readByte();
						for (int i_60_ = 0; i_60_ < i_54_; i_60_++) {
							byte i_61_ = (class185_sub2.aByteArray9379[i_60_] = class527_sub38.readByte());
							bool = bool | i_61_ != -1;
						}
					} else {
						for (int i_62_ = 0; i_62_ < class185_sub2.anInt9373; i_62_++) {
							for (int i_63_ = 0; i_63_ < class185_sub2.anInt9372; i_63_++)
								class185_sub2.aByteArray9371[i_62_ + i_63_ * class185_sub2.anInt9373] = class527_sub38.readByte();
						}
						for (int i_64_ = 0; i_64_ < class185_sub2.anInt9373; i_64_++) {
							for (int i_65_ = 0; i_65_ < class185_sub2.anInt9372; i_65_++) {
								byte i_66_ = (class185_sub2.aByteArray9379[i_64_ + i_65_ * (class185_sub2.anInt9373)] = class527_sub38.readByte());
								bool = bool | i_66_ != -1;
							}
						}
					}
					if (!bool)
						class185_sub2.aByteArray9379 = null;
				}
			}
			return class185_sub2s;
		}
		Class185_Sub1[] class185_sub1s = new Class185_Sub1[i_40_];
		class527_sub38.anInt10689 = 0;
		int i_67_ = class527_sub38.readUnsignedByte();
		if (i_67_ == 0) {
			boolean bool = class527_sub38.readUnsignedByte() == 1;
			int i_68_ = class527_sub38.readUnsignedShort();
			int i_69_ = class527_sub38.readUnsignedShort();
			for (int i_70_ = 0; i_70_ < i_40_; i_70_++) {
				int[] is_71_ = new int[i_68_ * i_69_];
				for (int i_72_ = 0; i_72_ < i_68_ * i_69_; i_72_++) {
					is_71_[i_72_] = ~0xffffff | class527_sub38.read24BitUnsignedInteger(1554180040);
					if (is_71_[i_72_] == -65281)
						is_71_[i_72_] = 0;
				}
				if (bool) {
					for (int i_73_ = 0; i_73_ < i_68_ * i_69_; i_73_++) {
						is_71_[i_73_] &= 0xffffff;
						is_71_[i_73_] |= class527_sub38.readUnsignedByte() << 24;
					}
				}
				class185_sub1s[i_70_] = new Class185_Sub1(i_68_, i_69_, is_71_);
			}
		} else {
			if (i_67_ == 1)
				throw new UnsupportedOperationException();
			throw new RuntimeException();
		}
		return class185_sub1s;
	}

	public static Class185 method2659(Class459 class459, int i, int i_74_) {
		byte[] is = class459.method7470(i, i_74_, (byte) -111);
		if (is == null)
			return null;
		return method2657(is)[0];
	}

	public static Class185 method2660(Class459 class459, int i, int i_75_) {
		byte[] is = class459.method7470(i, i_75_, (byte) -15);
		if (is == null)
			return null;
		return method2657(is)[0];
	}

	public static Class185 method2661(Class459 class459, int i) {
		byte[] is = class459.method7512(i, 1447980132);
		if (is == null)
			return null;
		return method2657(is)[0];
	}

	public static Class185 method2662(Class459 class459, int i) {
		byte[] is = class459.method7512(i, 1447980132);
		if (is == null)
			return null;
		return method2657(is)[0];
	}

	public static Class185 method2663(Class459 class459, int i, int i_76_) {
		byte[] is = class459.method7470(i, i_76_, (byte) -89);
		if (is == null)
			return null;
		return method2657(is)[0];
	}

	public static Class185[] method2664(Class459 class459, int i, int i_77_) {
		byte[] is = class459.method7470(i, i_77_, (byte) -12);
		if (is == null)
			return null;
		return method2657(is);
	}

	public static Class185 method2665(Class459 class459, int i) {
		byte[] is = class459.method7512(i, 1447980132);
		if (is == null)
			return null;
		return method2657(is)[0];
	}

	Class165() throws Throwable {
		throw new Error();
	}

	public static Class185[] method2666(byte[] is) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(is);
		class527_sub38.anInt10689 = (is.length - 2) * 1474750881;
		int i = class527_sub38.readUnsignedShort();
		int i_78_ = i >> 15;
		int i_79_ = i & 0x7fff;
		if (i_78_ == 0) {
			Class185_Sub2[] class185_sub2s = new Class185_Sub2[i_79_];
			for (int i_80_ = 0; i_80_ < i_79_; i_80_++)
				class185_sub2s[i_80_] = new Class185_Sub2();
			class527_sub38.anInt10689 = (is.length - 7 - i_79_ * 8) * 1474750881;
			int i_81_ = class527_sub38.readUnsignedShort();
			int i_82_ = class527_sub38.readUnsignedShort();
			int i_83_ = (class527_sub38.readUnsignedByte() & 0xff) + 1;
			for (int i_84_ = 0; i_84_ < i_79_; i_84_++)
				class185_sub2s[i_84_].anInt9375 = class527_sub38.readUnsignedShort();
			for (int i_85_ = 0; i_85_ < i_79_; i_85_++)
				class185_sub2s[i_85_].anInt9378 = class527_sub38.readUnsignedShort();
			for (int i_86_ = 0; i_86_ < i_79_; i_86_++)
				class185_sub2s[i_86_].anInt9373 = class527_sub38.readUnsignedShort();
			for (int i_87_ = 0; i_87_ < i_79_; i_87_++)
				class185_sub2s[i_87_].anInt9372 = class527_sub38.readUnsignedShort();
			for (int i_88_ = 0; i_88_ < i_79_; i_88_++) {
				Class185_Sub2 class185_sub2 = class185_sub2s[i_88_];
				class185_sub2.anInt9374 = (i_81_ - class185_sub2.anInt9373 - class185_sub2.anInt9375);
				class185_sub2.anInt9376 = (i_82_ - class185_sub2.anInt9372 - class185_sub2.anInt9378);
			}
			class527_sub38.anInt10689 = (is.length - 7 - i_79_ * 8 - (i_83_ - 1) * 3) * 1474750881;
			int[] is_89_ = new int[i_83_];
			for (int i_90_ = 1; i_90_ < i_83_; i_90_++) {
				is_89_[i_90_] = class527_sub38.read24BitUnsignedInteger(454387152);
				if (is_89_[i_90_] == 0)
					is_89_[i_90_] = 1;
			}
			for (int i_91_ = 0; i_91_ < i_79_; i_91_++)
				class185_sub2s[i_91_].anIntArray9377 = is_89_;
			class527_sub38.anInt10689 = 0;
			for (int i_92_ = 0; i_92_ < i_79_; i_92_++) {
				Class185_Sub2 class185_sub2 = class185_sub2s[i_92_];
				int i_93_ = class185_sub2.anInt9373 * class185_sub2.anInt9372;
				class185_sub2.aByteArray9371 = new byte[i_93_];
				int i_94_ = class527_sub38.readUnsignedByte();
				if ((i_94_ & 0x2) == 0) {
					if ((i_94_ & 0x1) == 0) {
						for (int i_95_ = 0; i_95_ < i_93_; i_95_++)
							class185_sub2.aByteArray9371[i_95_] = class527_sub38.readByte();
					} else {
						for (int i_96_ = 0; i_96_ < class185_sub2.anInt9373; i_96_++) {
							for (int i_97_ = 0; i_97_ < class185_sub2.anInt9372; i_97_++)
								class185_sub2.aByteArray9371[i_96_ + i_97_ * class185_sub2.anInt9373] = class527_sub38.readByte();
						}
					}
				} else {
					boolean bool = false;
					class185_sub2.aByteArray9379 = new byte[i_93_];
					if ((i_94_ & 0x1) == 0) {
						for (int i_98_ = 0; i_98_ < i_93_; i_98_++)
							class185_sub2.aByteArray9371[i_98_] = class527_sub38.readByte();
						for (int i_99_ = 0; i_99_ < i_93_; i_99_++) {
							byte i_100_ = (class185_sub2.aByteArray9379[i_99_] = class527_sub38.readByte());
							bool = bool | i_100_ != -1;
						}
					} else {
						for (int i_101_ = 0; i_101_ < class185_sub2.anInt9373; i_101_++) {
							for (int i_102_ = 0; i_102_ < class185_sub2.anInt9372; i_102_++)
								class185_sub2.aByteArray9371[i_101_ + i_102_ * class185_sub2.anInt9373] = class527_sub38.readByte();
						}
						for (int i_103_ = 0; i_103_ < class185_sub2.anInt9373; i_103_++) {
							for (int i_104_ = 0; i_104_ < class185_sub2.anInt9372; i_104_++) {
								byte i_105_ = (class185_sub2.aByteArray9379[i_103_ + i_104_ * (class185_sub2.anInt9373)] = class527_sub38.readByte());
								bool = bool | i_105_ != -1;
							}
						}
					}
					if (!bool)
						class185_sub2.aByteArray9379 = null;
				}
			}
			return class185_sub2s;
		}
		Class185_Sub1[] class185_sub1s = new Class185_Sub1[i_79_];
		class527_sub38.anInt10689 = 0;
		int i_106_ = class527_sub38.readUnsignedByte();
		if (i_106_ == 0) {
			boolean bool = class527_sub38.readUnsignedByte() == 1;
			int i_107_ = class527_sub38.readUnsignedShort();
			int i_108_ = class527_sub38.readUnsignedShort();
			for (int i_109_ = 0; i_109_ < i_79_; i_109_++) {
				int[] is_110_ = new int[i_107_ * i_108_];
				for (int i_111_ = 0; i_111_ < i_107_ * i_108_; i_111_++) {
					is_110_[i_111_] = ~0xffffff | class527_sub38.read24BitUnsignedInteger(119885453);
					if (is_110_[i_111_] == -65281)
						is_110_[i_111_] = 0;
				}
				if (bool) {
					for (int i_112_ = 0; i_112_ < i_107_ * i_108_; i_112_++) {
						is_110_[i_112_] &= 0xffffff;
						is_110_[i_112_] |= class527_sub38.readUnsignedByte() << 24;
					}
				}
				class185_sub1s[i_109_] = new Class185_Sub1(i_107_, i_108_, is_110_);
			}
		} else {
			if (i_106_ == 1)
				throw new UnsupportedOperationException();
			throw new RuntimeException();
		}
		return class185_sub1s;
	}
}
