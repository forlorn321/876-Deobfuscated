/* Class346 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class346 {
	public boolean aBool3700;
	boolean aBool3701;
	boolean aBool3702;
	static final int anInt3703 = 6;
	int anInt3704 = 0;
	static final byte aByte3705 = 126;
	int anInt3706;
	static final byte aByte3707 = 125;
	public byte aByte3708;
	public byte aByte3709;
	public byte aByte3710;
	public String[] aStringArray3711;
	long[] aLongArray3712;
	long[] aLongArray3713;
	public byte[] aByteArray3714;
	int[] anIntArray3715;
	int[] anIntArray3716;
	public int anInt3717;
	static final byte aByte3718 = 127;
	public int anInt3719;
	public int anInt3720;
	public int[] anIntArray3721;
	public String aString3722 = null;
	public byte aByte3723;
	public String[] aStringArray3724;
	Class14 aClass14_3725;
	public int anInt3726;
	long aLong3727;
	public boolean[] aBoolArray3728;
	static final byte aByte3729 = 0;
	public static final byte aByte3730 = -1;
	public static Class24_Sub8 aClass24_Sub8_3731;

	int method6093(int i, int i_0_, int i_1_, int i_2_) {
		int i_3_ = (1 << i_1_) - 1;
		int i_4_ = i_2_ == 31 ? -1 : (1 << i_2_ + 1) - 1;
		int i_5_ = i_4_ ^ i_3_;
		i_0_ <<= i_1_;
		i_0_ &= i_5_;
		int i_6_ = anIntArray3716[i];
		if (i_0_ == (i_6_ & i_5_))
			return -1;
		i_6_ &= i_5_ ^ 0xffffffff;
		anIntArray3716[i] = i_6_ | i_0_;
		return i;
	}

	void method6094(int i, int i_7_) {
		if (aBool3701) {
			if (null != aLongArray3713)
				System.arraycopy(aLongArray3713, 0, aLongArray3713 = new long[i], 0, 864308515 * anInt3717);
			else
				aLongArray3713 = new long[i];
		}
		if (aBool3702) {
			if (aStringArray3711 != null)
				System.arraycopy(aStringArray3711, 0, aStringArray3711 = new String[i], 0, anInt3717 * 864308515);
			else
				aStringArray3711 = new String[i];
		}
		if (aByteArray3714 != null)
			System.arraycopy(aByteArray3714, 0, aByteArray3714 = new byte[i], 0, anInt3717 * 864308515);
		else
			aByteArray3714 = new byte[i];
		if (null != anIntArray3716)
			System.arraycopy(anIntArray3716, 0, anIntArray3716 = new int[i], 0, 864308515 * anInt3717);
		else
			anIntArray3716 = new int[i];
		if (anIntArray3721 != null)
			System.arraycopy(anIntArray3721, 0, anIntArray3721 = new int[i], 0, anInt3717 * 864308515);
		else
			anIntArray3721 = new int[i];
		if (null != aBoolArray3728)
			System.arraycopy(aBoolArray3728, 0, aBoolArray3728 = new boolean[i], 0, anInt3717 * 864308515);
		else
			aBoolArray3728 = new boolean[i];
	}

	void method6095(int i, byte i_8_) {
		if (aBool3701) {
			if (aLongArray3712 != null)
				System.arraycopy(aLongArray3712, 0, aLongArray3712 = new long[i], 0, anInt3726 * -1045961249);
			else
				aLongArray3712 = new long[i];
		}
		if (aBool3702) {
			if (null != aStringArray3724)
				System.arraycopy(aStringArray3724, 0, aStringArray3724 = new String[i], 0, anInt3726 * -1045961249);
			else
				aStringArray3724 = new String[i];
		}
	}

	public int method6096(String string, int i) {
		if (string == null || string.length() == 0)
			return -1;
		for (int i_9_ = 0; i_9_ < 864308515 * anInt3717; i_9_++) {
			if (aStringArray3711[i_9_].equals(string))
				return i_9_;
		}
		return -1;
	}

	public int method6097(String string) {
		if (string == null || string.length() == 0)
			return -1;
		for (int i = 0; i < 864308515 * anInt3717; i++) {
			if (aStringArray3711[i].equals(string))
				return i;
		}
		return -1;
	}

	void method6098(int i, byte i_10_) {
		anInt3726 -= -631892449;
		if (anInt3726 * -1045961249 == 0) {
			aLongArray3712 = null;
			aStringArray3724 = null;
		} else {
			if (aLongArray3712 != null)
				System.arraycopy(aLongArray3712, 1 + i, aLongArray3712, i, anInt3726 * -1045961249 - i);
			if (aStringArray3724 != null)
				System.arraycopy(aStringArray3724, i + 1, aStringArray3724, i, -1045961249 * anInt3726 - i);
		}
	}

	public Long method6099(int i, int i_11_) {
		if (null == aClass14_3725)
			return null;
		Class527 class527 = aClass14_3725.method709((long) i);
		if (null == class527 || !(class527 instanceof Class527_Sub20))
			return null;
		return new Long(3276150014841543847L * ((Class527_Sub20) class527).aLong10482);
	}

	void method6100(int i) {
		if (aBool3701) {
			if (aLongArray3712 != null)
				System.arraycopy(aLongArray3712, 0, aLongArray3712 = new long[i], 0, anInt3726 * -1045961249);
			else
				aLongArray3712 = new long[i];
		}
		if (aBool3702) {
			if (null != aStringArray3724)
				System.arraycopy(aStringArray3724, 0, aStringArray3724 = new String[i], 0, anInt3726 * -1045961249);
			else
				aStringArray3724 = new String[i];
		}
	}

	public Integer method6101(int i, byte i_12_) {
		if (aClass14_3725 == null)
			return null;
		Class527 class527 = aClass14_3725.method709((long) i);
		if (null == class527 || !(class527 instanceof Node_Sub6))
			return null;
		return new Integer(((Node_Sub6) class527).anInt10398 * -78845949);
	}

	void method6102(long l, String string, int i, int i_13_) {
		if (null != string && string.length() == 0)
			string = null;
		if (l > 0L != aBool3701)
			throw new RuntimeException("");
		if ((string != null) != aBool3702)
			throw new RuntimeException("");
		if (l > 0L && (null == aLongArray3713 || anInt3717 * 864308515 >= aLongArray3713.length) || (string != null && (null == aStringArray3711 || anInt3717 * 864308515 >= aStringArray3711.length)))
			method6094(5 + anInt3717 * 864308515, -66107057);
		if (null != aLongArray3713)
			aLongArray3713[anInt3717 * 864308515] = l;
		if (aStringArray3711 != null)
			aStringArray3711[anInt3717 * 864308515] = string;
		if (-1 == anInt3719 * 2080985119) {
			anInt3719 = 1642730109 * anInt3717;
			aByteArray3714[anInt3717 * 864308515] = (byte) 126;
		} else
			aByteArray3714[864308515 * anInt3717] = (byte) 0;
		anIntArray3716[864308515 * anInt3717] = 0;
		anIntArray3721[864308515 * anInt3717] = i;
		aBoolArray3728[anInt3717 * 864308515] = false;
		anInt3717 += 1015696011;
		anIntArray3715 = null;
	}

	void method6103(int i, int i_14_) {
		if (i < 0 || i >= anInt3717 * 864308515)
			throw new RuntimeException("");
		anInt3717 -= 1015696011;
		anIntArray3715 = null;
		if (0 == anInt3717 * 864308515) {
			aLongArray3713 = null;
			aStringArray3711 = null;
			aByteArray3714 = null;
			anIntArray3716 = null;
			anIntArray3721 = null;
			aBoolArray3728 = null;
			anInt3719 = -382872543;
			anInt3720 = -1867371375;
		} else {
			System.arraycopy(aByteArray3714, i + 1, aByteArray3714, i, 864308515 * anInt3717 - i);
			System.arraycopy(anIntArray3716, i + 1, anIntArray3716, i, anInt3717 * 864308515 - i);
			System.arraycopy(anIntArray3721, i + 1, anIntArray3721, i, 864308515 * anInt3717 - i);
			System.arraycopy(aBoolArray3728, 1 + i, aBoolArray3728, i, 864308515 * anInt3717 - i);
			if (aLongArray3713 != null)
				System.arraycopy(aLongArray3713, i + 1, aLongArray3713, i, anInt3717 * 864308515 - i);
			if (aStringArray3711 != null)
				System.arraycopy(aStringArray3711, 1 + i, aStringArray3711, i, 864308515 * anInt3717 - i);
			method6142((byte) 1);
		}
	}

	public String method6104(int i, int i_15_) {
		if (aClass14_3725 == null)
			return null;
		Class527 class527 = aClass14_3725.method709((long) i);
		if (null == class527 || !(class527 instanceof Class527_Sub26))
			return null;
		return (String) ((Class527_Sub26) class527).anObject10522;
	}

	void method6105(long l, String string, int i) {
		if (string != null && string.length() == 0)
			string = null;
		if (l > 0L != aBool3701)
			throw new RuntimeException("");
		if (aBool3702 != (null != string))
			throw new RuntimeException("");
		if (l > 0L && (aLongArray3712 == null || -1045961249 * anInt3726 >= aLongArray3712.length) || (null != string && (aStringArray3724 == null || -1045961249 * anInt3726 >= aStringArray3724.length)))
			method6095(5 + -1045961249 * anInt3726, (byte) 56);
		if (null != aLongArray3712)
			aLongArray3712[anInt3726 * -1045961249] = l;
		if (null != aStringArray3724)
			aStringArray3724[anInt3726 * -1045961249] = string;
		anInt3726 += -631892449;
	}

	public int[] method6106(byte i) {
		if (null == anIntArray3715) {
			String[] strings = new String[864308515 * anInt3717];
			anIntArray3715 = new int[anInt3717 * 864308515];
			for (int i_16_ = 0; i_16_ < anInt3717 * 864308515; i_16_++) {
				strings[i_16_] = aStringArray3711[i_16_];
				if (strings[i_16_] != null)
					strings[i_16_] = strings[i_16_].toLowerCase();
				anIntArray3715[i_16_] = i_16_;
			}
			Class325.method5752(strings, anIntArray3715, -709566596);
		}
		return anIntArray3715;
	}

	void method6107(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedByte();
		if (i < 1 || i > 6)
			throw new RuntimeException(new StringBuilder().append("").append(i).toString());
		int i_17_ = class527_sub38.readUnsignedByte();
		if ((i_17_ & 0x1) != 0)
			aBool3701 = true;
		if ((i_17_ & 0x2) != 0)
			aBool3702 = true;
		if (!aBool3701) {
			aLongArray3713 = null;
			aLongArray3712 = null;
		}
		if (!aBool3702) {
			aStringArray3711 = null;
			aStringArray3724 = null;
		}
		anInt3704 = class527_sub38.readInt() * 1447391895;
		anInt3706 = class527_sub38.readInt() * 1982342369;
		if (i <= 3 && 0 != anInt3706 * 400301857)
			anInt3706 += -1370751584;
		anInt3717 = class527_sub38.readUnsignedShort() * 1015696011;
		anInt3726 = class527_sub38.readUnsignedByte() * -631892449;
		aString3722 = class527_sub38.readString(1481729643);
		if (i >= 4)
			class527_sub38.readInt();
		aBool3700 = class527_sub38.readUnsignedByte() == 1;
		aByte3708 = class527_sub38.readByte();
		aByte3709 = class527_sub38.readByte();
		aByte3710 = class527_sub38.readByte();
		aByte3723 = class527_sub38.readByte();
		if (anInt3717 * 864308515 > 0) {
			if (aBool3701 && (aLongArray3713 == null || aLongArray3713.length < anInt3717 * 864308515))
				aLongArray3713 = new long[anInt3717 * 864308515];
			if (aBool3702 && (null == aStringArray3711 || aStringArray3711.length < 864308515 * anInt3717))
				aStringArray3711 = new String[864308515 * anInt3717];
			if (null == aByteArray3714 || aByteArray3714.length < anInt3717 * 864308515)
				aByteArray3714 = new byte[864308515 * anInt3717];
			if (anIntArray3716 == null || anIntArray3716.length < anInt3717 * 864308515)
				anIntArray3716 = new int[864308515 * anInt3717];
			if (null == anIntArray3721 || anIntArray3721.length < 864308515 * anInt3717)
				anIntArray3721 = new int[864308515 * anInt3717];
			if (null == aBoolArray3728 || aBoolArray3728.length < anInt3717 * 864308515)
				aBoolArray3728 = new boolean[anInt3717 * 864308515];
			for (int i_18_ = 0; i_18_ < anInt3717 * 864308515; i_18_++) {
				if (aBool3701)
					aLongArray3713[i_18_] = class527_sub38.method16612((byte) 1);
				if (aBool3702)
					aStringArray3711[i_18_] = class527_sub38.method16456((byte) 25);
				aByteArray3714[i_18_] = class527_sub38.readByte();
				if (i >= 2)
					anIntArray3716[i_18_] = class527_sub38.readInt();
				if (i >= 5)
					anIntArray3721[i_18_] = class527_sub38.readUnsignedShort();
				else
					anIntArray3721[i_18_] = 0;
				if (i >= 6)
					aBoolArray3728[i_18_] = class527_sub38.readUnsignedByte() == 1;
				else
					aBoolArray3728[i_18_] = false;
			}
			method6142((byte) 1);
		}
		if (anInt3726 * -1045961249 > 0) {
			if (aBool3701 && (aLongArray3712 == null || aLongArray3712.length < -1045961249 * anInt3726))
				aLongArray3712 = new long[-1045961249 * anInt3726];
			if (aBool3702 && (aStringArray3724 == null || aStringArray3724.length < anInt3726 * -1045961249))
				aStringArray3724 = new String[-1045961249 * anInt3726];
			for (int i_19_ = 0; i_19_ < -1045961249 * anInt3726; i_19_++) {
				if (aBool3701)
					aLongArray3712[i_19_] = class527_sub38.method16612((byte) 1);
				if (aBool3702)
					aStringArray3724[i_19_] = class527_sub38.method16456((byte) 95);
			}
		}
		if (i >= 3) {
			int i_20_ = class527_sub38.readUnsignedShort();
			if (i_20_ > 0) {
				aClass14_3725 = new Class14(i_20_ < 16 ? Class186.method3652(i_20_, 1374108472) : 16);
				while (i_20_-- > 0) {
					int i_21_ = class527_sub38.readInt();
					int i_22_ = i_21_ & 0x3fffffff;
					int i_23_ = i_21_ >>> 30;
					if (0 == i_23_) {
						int i_24_ = class527_sub38.readInt();
						aClass14_3725.method714(new Node_Sub6(i_24_), (long) i_22_);
					} else if (1 == i_23_) {
						long l = class527_sub38.method16612((byte) 1);
						aClass14_3725.method714(new Class527_Sub20(l), (long) i_22_);
					} else if (2 == i_23_) {
						String string = class527_sub38.readString(1894257819);
						aClass14_3725.method714(new Class527_Sub26(string), (long) i_22_);
					}
				}
			}
		}
	}

	int method6108(int i, boolean bool, int i_25_) {
		if (aBoolArray3728[i] == bool)
			return -1;
		aBoolArray3728[i] = bool;
		return i;
	}

	public Class346(RSByteBuffer class527_sub38) {
		anInt3706 = 0;
		anInt3719 = -382872543;
		anInt3720 = -1867371375;
		method6113(class527_sub38, 1108389687);
	}

	boolean method6109(int i, int i_26_, int i_27_) {
		if (aClass14_3725 != null) {
			Class527 class527 = aClass14_3725.method709((long) i);
			if (class527 != null) {
				if (class527 instanceof Node_Sub6) {
					Node_Sub6 class527_sub7 = (Node_Sub6) class527;
					if (class527_sub7.anInt10398 * -78845949 == i_26_)
						return false;
					class527_sub7.anInt10398 = i_26_ * -1332018517;
					return true;
				}
				class527.method8735(-1889161967);
			}
		} else
			aClass14_3725 = new Class14(4);
		aClass14_3725.method714(new Node_Sub6(i_26_), (long) i);
		return true;
	}

	boolean method6110(int i, int i_28_, int i_29_, int i_30_, int i_31_) {
		int i_32_ = (1 << i_29_) - 1;
		int i_33_ = i_30_ == 31 ? -1 : (1 << 1 + i_30_) - 1;
		int i_34_ = i_33_ ^ i_32_;
		i_28_ <<= i_29_;
		i_28_ &= i_34_;
		if (null != aClass14_3725) {
			Class527 class527 = aClass14_3725.method709((long) i);
			if (null != class527) {
				if (class527 instanceof Node_Sub6) {
					Node_Sub6 class527_sub7 = (Node_Sub6) class527;
					if ((class527_sub7.anInt10398 * -78845949 & i_34_) == i_28_)
						return false;
					Node_Sub6 class527_sub7_35_;
					(class527_sub7_35_ = class527_sub7).anInt10398 = (-1332018517 * (class527_sub7_35_.anInt10398 * -78845949 & (i_34_ ^ 0xffffffff)));
					Node_Sub6 class527_sub7_36_;
					(class527_sub7_36_ = class527_sub7).anInt10398 = (-1332018517 * (-78845949 * class527_sub7_36_.anInt10398 | i_28_));
					return true;
				}
				class527.method8735(-1889161967);
			}
		} else
			aClass14_3725 = new Class14(4);
		aClass14_3725.method714(new Node_Sub6(i_28_), (long) i);
		return true;
	}

	int method6111(int i, byte i_37_) {
		if (i_37_ == 126 || 127 == i_37_)
			return -1;
		if (i == 2080985119 * anInt3719 && (-862917745 * anInt3720 == -1 || aByteArray3714[-862917745 * anInt3720] < 125))
			return -1;
		if (aByteArray3714[i] == i_37_)
			return -1;
		aByteArray3714[i] = i_37_;
		method6142((byte) 1);
		return i;
	}

	boolean method6112(int i, String string, byte i_38_) {
		if (string == null)
			string = "";
		else if (string.length() > 80)
			string = string.substring(0, 80);
		if (null != aClass14_3725) {
			Class527 class527 = aClass14_3725.method709((long) i);
			if (null != class527) {
				if (class527 instanceof Class527_Sub26) {
					Class527_Sub26 class527_sub26 = (Class527_Sub26) class527;
					if (class527_sub26.anObject10522 instanceof String) {
						if (string.equals(class527_sub26.anObject10522))
							return false;
						class527_sub26.method8735(-1889161967);
						aClass14_3725.method714(new Class527_Sub26(string), (class527_sub26.aLong7106 * -8168620736534281759L));
						return true;
					}
				}
				class527.method8735(-1889161967);
			}
		} else
			aClass14_3725 = new Class14(4);
		aClass14_3725.method714(new Class527_Sub26(string), (long) i);
		return true;
	}

	void method6113(RSByteBuffer class527_sub38, int i) {
		int i_39_ = class527_sub38.readUnsignedByte();
		if (i_39_ < 1 || i_39_ > 6)
			throw new RuntimeException(new StringBuilder().append("").append(i_39_).toString());
		int i_40_ = class527_sub38.readUnsignedByte();
		if ((i_40_ & 0x1) != 0)
			aBool3701 = true;
		if ((i_40_ & 0x2) != 0)
			aBool3702 = true;
		if (!aBool3701) {
			aLongArray3713 = null;
			aLongArray3712 = null;
		}
		if (!aBool3702) {
			aStringArray3711 = null;
			aStringArray3724 = null;
		}
		anInt3704 = class527_sub38.readInt() * 1447391895;
		anInt3706 = class527_sub38.readInt() * 1982342369;
		if (i_39_ <= 3 && 0 != anInt3706 * 400301857)
			anInt3706 += -1370751584;
		anInt3717 = class527_sub38.readUnsignedShort() * 1015696011;
		anInt3726 = class527_sub38.readUnsignedByte() * -631892449;
		aString3722 = class527_sub38.readString(1569173024);
		if (i_39_ >= 4)
			class527_sub38.readInt();
		aBool3700 = class527_sub38.readUnsignedByte() == 1;
		aByte3708 = class527_sub38.readByte();
		aByte3709 = class527_sub38.readByte();
		aByte3710 = class527_sub38.readByte();
		aByte3723 = class527_sub38.readByte();
		if (anInt3717 * 864308515 > 0) {
			if (aBool3701 && (aLongArray3713 == null || aLongArray3713.length < anInt3717 * 864308515))
				aLongArray3713 = new long[anInt3717 * 864308515];
			if (aBool3702 && (null == aStringArray3711 || aStringArray3711.length < 864308515 * anInt3717))
				aStringArray3711 = new String[864308515 * anInt3717];
			if (null == aByteArray3714 || aByteArray3714.length < anInt3717 * 864308515)
				aByteArray3714 = new byte[864308515 * anInt3717];
			if (anIntArray3716 == null || anIntArray3716.length < anInt3717 * 864308515)
				anIntArray3716 = new int[864308515 * anInt3717];
			if (null == anIntArray3721 || anIntArray3721.length < 864308515 * anInt3717)
				anIntArray3721 = new int[864308515 * anInt3717];
			if (null == aBoolArray3728 || aBoolArray3728.length < anInt3717 * 864308515)
				aBoolArray3728 = new boolean[anInt3717 * 864308515];
			for (int i_41_ = 0; i_41_ < anInt3717 * 864308515; i_41_++) {
				if (aBool3701)
					aLongArray3713[i_41_] = class527_sub38.method16612((byte) 1);
				if (aBool3702)
					aStringArray3711[i_41_] = class527_sub38.method16456((byte) 30);
				aByteArray3714[i_41_] = class527_sub38.readByte();
				if (i_39_ >= 2)
					anIntArray3716[i_41_] = class527_sub38.readInt();
				if (i_39_ >= 5)
					anIntArray3721[i_41_] = class527_sub38.readUnsignedShort();
				else
					anIntArray3721[i_41_] = 0;
				if (i_39_ >= 6)
					aBoolArray3728[i_41_] = class527_sub38.readUnsignedByte() == 1;
				else
					aBoolArray3728[i_41_] = false;
			}
			method6142((byte) 1);
		}
		if (anInt3726 * -1045961249 > 0) {
			if (aBool3701 && (aLongArray3712 == null || aLongArray3712.length < -1045961249 * anInt3726))
				aLongArray3712 = new long[-1045961249 * anInt3726];
			if (aBool3702 && (aStringArray3724 == null || aStringArray3724.length < anInt3726 * -1045961249))
				aStringArray3724 = new String[-1045961249 * anInt3726];
			for (int i_42_ = 0; i_42_ < -1045961249 * anInt3726; i_42_++) {
				if (aBool3701)
					aLongArray3712[i_42_] = class527_sub38.method16612((byte) 1);
				if (aBool3702)
					aStringArray3724[i_42_] = class527_sub38.method16456((byte) 121);
			}
		}
		if (i_39_ >= 3) {
			int i_43_ = class527_sub38.readUnsignedShort();
			if (i_43_ > 0) {
				aClass14_3725 = new Class14(i_43_ < 16 ? Class186.method3652(i_43_, -2021706789) : 16);
				while (i_43_-- > 0) {
					int i_44_ = class527_sub38.readInt();
					int i_45_ = i_44_ & 0x3fffffff;
					int i_46_ = i_44_ >>> 30;
					if (0 == i_46_) {
						int i_47_ = class527_sub38.readInt();
						aClass14_3725.method714(new Node_Sub6(i_47_), (long) i_45_);
					} else if (1 == i_46_) {
						long l = class527_sub38.method16612((byte) 1);
						aClass14_3725.method714(new Class527_Sub20(l), (long) i_45_);
					} else if (2 == i_46_) {
						String string = class527_sub38.readString(1483591846);
						aClass14_3725.method714(new Class527_Sub26(string), (long) i_45_);
					}
				}
			}
		}
	}

	void method6114(long l, String string, int i) {
		if (null != string && string.length() == 0)
			string = null;
		if (l > 0L != aBool3701)
			throw new RuntimeException("");
		if ((string != null) != aBool3702)
			throw new RuntimeException("");
		if (l > 0L && (null == aLongArray3713 || anInt3717 * 864308515 >= aLongArray3713.length) || (string != null && (null == aStringArray3711 || anInt3717 * 864308515 >= aStringArray3711.length)))
			method6094(5 + anInt3717 * 864308515, -66107057);
		if (null != aLongArray3713)
			aLongArray3713[anInt3717 * 864308515] = l;
		if (aStringArray3711 != null)
			aStringArray3711[anInt3717 * 864308515] = string;
		if (-1 == anInt3719 * 2080985119) {
			anInt3719 = 1642730109 * anInt3717;
			aByteArray3714[anInt3717 * 864308515] = (byte) 126;
		} else
			aByteArray3714[864308515 * anInt3717] = (byte) 0;
		anIntArray3716[864308515 * anInt3717] = 0;
		anIntArray3721[864308515 * anInt3717] = i;
		aBoolArray3728[anInt3717 * 864308515] = false;
		anInt3717 += 1015696011;
		anIntArray3715 = null;
	}

	void method6115(int i) {
		if (aBool3701) {
			if (null != aLongArray3713)
				System.arraycopy(aLongArray3713, 0, aLongArray3713 = new long[i], 0, 864308515 * anInt3717);
			else
				aLongArray3713 = new long[i];
		}
		if (aBool3702) {
			if (aStringArray3711 != null)
				System.arraycopy(aStringArray3711, 0, aStringArray3711 = new String[i], 0, anInt3717 * 864308515);
			else
				aStringArray3711 = new String[i];
		}
		if (aByteArray3714 != null)
			System.arraycopy(aByteArray3714, 0, aByteArray3714 = new byte[i], 0, anInt3717 * 864308515);
		else
			aByteArray3714 = new byte[i];
		if (null != anIntArray3716)
			System.arraycopy(anIntArray3716, 0, anIntArray3716 = new int[i], 0, 864308515 * anInt3717);
		else
			anIntArray3716 = new int[i];
		if (anIntArray3721 != null)
			System.arraycopy(anIntArray3721, 0, anIntArray3721 = new int[i], 0, anInt3717 * 864308515);
		else
			anIntArray3721 = new int[i];
		if (null != aBoolArray3728)
			System.arraycopy(aBoolArray3728, 0, aBoolArray3728 = new boolean[i], 0, anInt3717 * 864308515);
		else
			aBoolArray3728 = new boolean[i];
	}

	void method6116(int i) {
		if (aBool3701) {
			if (null != aLongArray3713)
				System.arraycopy(aLongArray3713, 0, aLongArray3713 = new long[i], 0, 864308515 * anInt3717);
			else
				aLongArray3713 = new long[i];
		}
		if (aBool3702) {
			if (aStringArray3711 != null)
				System.arraycopy(aStringArray3711, 0, aStringArray3711 = new String[i], 0, anInt3717 * 864308515);
			else
				aStringArray3711 = new String[i];
		}
		if (aByteArray3714 != null)
			System.arraycopy(aByteArray3714, 0, aByteArray3714 = new byte[i], 0, anInt3717 * 864308515);
		else
			aByteArray3714 = new byte[i];
		if (null != anIntArray3716)
			System.arraycopy(anIntArray3716, 0, anIntArray3716 = new int[i], 0, 864308515 * anInt3717);
		else
			anIntArray3716 = new int[i];
		if (anIntArray3721 != null)
			System.arraycopy(anIntArray3721, 0, anIntArray3721 = new int[i], 0, anInt3717 * 864308515);
		else
			anIntArray3721 = new int[i];
		if (null != aBoolArray3728)
			System.arraycopy(aBoolArray3728, 0, aBoolArray3728 = new boolean[i], 0, anInt3717 * 864308515);
		else
			aBoolArray3728 = new boolean[i];
	}

	void method6117(int i) {
		if (aBool3701) {
			if (null != aLongArray3713)
				System.arraycopy(aLongArray3713, 0, aLongArray3713 = new long[i], 0, 864308515 * anInt3717);
			else
				aLongArray3713 = new long[i];
		}
		if (aBool3702) {
			if (aStringArray3711 != null)
				System.arraycopy(aStringArray3711, 0, aStringArray3711 = new String[i], 0, anInt3717 * 864308515);
			else
				aStringArray3711 = new String[i];
		}
		if (aByteArray3714 != null)
			System.arraycopy(aByteArray3714, 0, aByteArray3714 = new byte[i], 0, anInt3717 * 864308515);
		else
			aByteArray3714 = new byte[i];
		if (null != anIntArray3716)
			System.arraycopy(anIntArray3716, 0, anIntArray3716 = new int[i], 0, 864308515 * anInt3717);
		else
			anIntArray3716 = new int[i];
		if (anIntArray3721 != null)
			System.arraycopy(anIntArray3721, 0, anIntArray3721 = new int[i], 0, anInt3717 * 864308515);
		else
			anIntArray3721 = new int[i];
		if (null != aBoolArray3728)
			System.arraycopy(aBoolArray3728, 0, aBoolArray3728 = new boolean[i], 0, anInt3717 * 864308515);
		else
			aBoolArray3728 = new boolean[i];
	}

	void method6118(int i) {
		if (aBool3701) {
			if (aLongArray3712 != null)
				System.arraycopy(aLongArray3712, 0, aLongArray3712 = new long[i], 0, anInt3726 * -1045961249);
			else
				aLongArray3712 = new long[i];
		}
		if (aBool3702) {
			if (null != aStringArray3724)
				System.arraycopy(aStringArray3724, 0, aStringArray3724 = new String[i], 0, anInt3726 * -1045961249);
			else
				aStringArray3724 = new String[i];
		}
	}

	int method6119(int i, int i_48_, int i_49_, int i_50_) {
		int i_51_ = (1 << i_49_) - 1;
		int i_52_ = i_50_ == 31 ? -1 : (1 << i_50_ + 1) - 1;
		int i_53_ = i_52_ ^ i_51_;
		i_48_ <<= i_49_;
		i_48_ &= i_53_;
		int i_54_ = anIntArray3716[i];
		if (i_48_ == (i_54_ & i_53_))
			return -1;
		i_54_ &= i_53_ ^ 0xffffffff;
		anIntArray3716[i] = i_54_ | i_48_;
		return i;
	}

	void method6120(int i) {
		if (aBool3701) {
			if (aLongArray3712 != null)
				System.arraycopy(aLongArray3712, 0, aLongArray3712 = new long[i], 0, anInt3726 * -1045961249);
			else
				aLongArray3712 = new long[i];
		}
		if (aBool3702) {
			if (null != aStringArray3724)
				System.arraycopy(aStringArray3724, 0, aStringArray3724 = new String[i], 0, anInt3726 * -1045961249);
			else
				aStringArray3724 = new String[i];
		}
	}

	void method6121(int i) {
		if (aBool3701) {
			if (aLongArray3712 != null)
				System.arraycopy(aLongArray3712, 0, aLongArray3712 = new long[i], 0, anInt3726 * -1045961249);
			else
				aLongArray3712 = new long[i];
		}
		if (aBool3702) {
			if (null != aStringArray3724)
				System.arraycopy(aStringArray3724, 0, aStringArray3724 = new String[i], 0, anInt3726 * -1045961249);
			else
				aStringArray3724 = new String[i];
		}
	}

	int method6122(int i, int i_55_, int i_56_, int i_57_, byte i_58_) {
		int i_59_ = (1 << i_56_) - 1;
		int i_60_ = i_57_ == 31 ? -1 : (1 << i_57_ + 1) - 1;
		int i_61_ = i_60_ ^ i_59_;
		i_55_ <<= i_56_;
		i_55_ &= i_61_;
		int i_62_ = anIntArray3716[i];
		if (i_55_ == (i_62_ & i_61_))
			return -1;
		i_62_ &= i_61_ ^ 0xffffffff;
		anIntArray3716[i] = i_62_ | i_55_;
		return i;
	}

	public int method6123(String string) {
		if (string == null || string.length() == 0)
			return -1;
		for (int i = 0; i < 864308515 * anInt3717; i++) {
			if (aStringArray3711[i].equals(string))
				return i;
		}
		return -1;
	}

	public int method6124(int i, int i_63_, int i_64_) {
		int i_65_ = i_64_ == 31 ? -1 : (1 << i_64_ + 1) - 1;
		return (anIntArray3716[i] & i_65_) >>> i_63_;
	}

	public Integer method6125(int i) {
		if (aClass14_3725 == null)
			return null;
		Class527 class527 = aClass14_3725.method709((long) i);
		if (null == class527 || !(class527 instanceof Node_Sub6))
			return null;
		return new Integer(((Node_Sub6) class527).anInt10398 * -78845949);
	}

	public Integer method6126(int i) {
		if (aClass14_3725 == null)
			return null;
		Class527 class527 = aClass14_3725.method709((long) i);
		if (null == class527 || !(class527 instanceof Node_Sub6))
			return null;
		return new Integer(((Node_Sub6) class527).anInt10398 * -78845949);
	}

	int method6127(int i, byte i_66_, int i_67_) {
		if (i_66_ == 126 || 127 == i_66_)
			return -1;
		if (i == 2080985119 * anInt3719 && (-862917745 * anInt3720 == -1 || aByteArray3714[-862917745 * anInt3720] < 125))
			return -1;
		if (aByteArray3714[i] == i_66_)
			return -1;
		aByteArray3714[i] = i_66_;
		method6142((byte) 1);
		return i;
	}

	public Long method6128(int i) {
		if (null == aClass14_3725)
			return null;
		Class527 class527 = aClass14_3725.method709((long) i);
		if (null == class527 || !(class527 instanceof Class527_Sub20))
			return null;
		return new Long(3276150014841543847L * ((Class527_Sub20) class527).aLong10482);
	}

	public Integer method6129(int i) {
		if (aClass14_3725 == null)
			return null;
		Class527 class527 = aClass14_3725.method709((long) i);
		if (null == class527 || !(class527 instanceof Node_Sub6))
			return null;
		return new Integer(((Node_Sub6) class527).anInt10398 * -78845949);
	}

	public int[] method6130() {
		if (null == anIntArray3715) {
			String[] strings = new String[864308515 * anInt3717];
			anIntArray3715 = new int[anInt3717 * 864308515];
			for (int i = 0; i < anInt3717 * 864308515; i++) {
				strings[i] = aStringArray3711[i];
				if (strings[i] != null)
					strings[i] = strings[i].toLowerCase();
				anIntArray3715[i] = i;
			}
			Class325.method5752(strings, anIntArray3715, -709566596);
		}
		return anIntArray3715;
	}

	public String method6131(int i) {
		if (aClass14_3725 == null)
			return null;
		Class527 class527 = aClass14_3725.method709((long) i);
		if (null == class527 || !(class527 instanceof Class527_Sub26))
			return null;
		return (String) ((Class527_Sub26) class527).anObject10522;
	}

	public int method6132(int i, int i_68_, int i_69_, byte i_70_) {
		int i_71_ = i_69_ == 31 ? -1 : (1 << i_69_ + 1) - 1;
		return (anIntArray3716[i] & i_71_) >>> i_68_;
	}

	void method6133(long l, String string, int i) {
		if (null != string && string.length() == 0)
			string = null;
		if (l > 0L != aBool3701)
			throw new RuntimeException("");
		if ((string != null) != aBool3702)
			throw new RuntimeException("");
		if (l > 0L && (null == aLongArray3713 || anInt3717 * 864308515 >= aLongArray3713.length) || (string != null && (null == aStringArray3711 || anInt3717 * 864308515 >= aStringArray3711.length)))
			method6094(5 + anInt3717 * 864308515, -66107057);
		if (null != aLongArray3713)
			aLongArray3713[anInt3717 * 864308515] = l;
		if (aStringArray3711 != null)
			aStringArray3711[anInt3717 * 864308515] = string;
		if (-1 == anInt3719 * 2080985119) {
			anInt3719 = 1642730109 * anInt3717;
			aByteArray3714[anInt3717 * 864308515] = (byte) 126;
		} else
			aByteArray3714[864308515 * anInt3717] = (byte) 0;
		anIntArray3716[864308515 * anInt3717] = 0;
		anIntArray3721[864308515 * anInt3717] = i;
		aBoolArray3728[anInt3717 * 864308515] = false;
		anInt3717 += 1015696011;
		anIntArray3715 = null;
	}

	void method6134(int i) {
		if (i < 0 || i >= anInt3717 * 864308515)
			throw new RuntimeException("");
		anInt3717 -= 1015696011;
		anIntArray3715 = null;
		if (0 == anInt3717 * 864308515) {
			aLongArray3713 = null;
			aStringArray3711 = null;
			aByteArray3714 = null;
			anIntArray3716 = null;
			anIntArray3721 = null;
			aBoolArray3728 = null;
			anInt3719 = -382872543;
			anInt3720 = -1867371375;
		} else {
			System.arraycopy(aByteArray3714, i + 1, aByteArray3714, i, 864308515 * anInt3717 - i);
			System.arraycopy(anIntArray3716, i + 1, anIntArray3716, i, anInt3717 * 864308515 - i);
			System.arraycopy(anIntArray3721, i + 1, anIntArray3721, i, 864308515 * anInt3717 - i);
			System.arraycopy(aBoolArray3728, 1 + i, aBoolArray3728, i, 864308515 * anInt3717 - i);
			if (aLongArray3713 != null)
				System.arraycopy(aLongArray3713, i + 1, aLongArray3713, i, anInt3717 * 864308515 - i);
			if (aStringArray3711 != null)
				System.arraycopy(aStringArray3711, 1 + i, aStringArray3711, i, 864308515 * anInt3717 - i);
			method6142((byte) 1);
		}
	}

	void method6135(int i) {
		if (i < 0 || i >= anInt3717 * 864308515)
			throw new RuntimeException("");
		anInt3717 -= 1015696011;
		anIntArray3715 = null;
		if (0 == anInt3717 * 864308515) {
			aLongArray3713 = null;
			aStringArray3711 = null;
			aByteArray3714 = null;
			anIntArray3716 = null;
			anIntArray3721 = null;
			aBoolArray3728 = null;
			anInt3719 = -382872543;
			anInt3720 = -1867371375;
		} else {
			System.arraycopy(aByteArray3714, i + 1, aByteArray3714, i, 864308515 * anInt3717 - i);
			System.arraycopy(anIntArray3716, i + 1, anIntArray3716, i, anInt3717 * 864308515 - i);
			System.arraycopy(anIntArray3721, i + 1, anIntArray3721, i, 864308515 * anInt3717 - i);
			System.arraycopy(aBoolArray3728, 1 + i, aBoolArray3728, i, 864308515 * anInt3717 - i);
			if (aLongArray3713 != null)
				System.arraycopy(aLongArray3713, i + 1, aLongArray3713, i, anInt3717 * 864308515 - i);
			if (aStringArray3711 != null)
				System.arraycopy(aStringArray3711, 1 + i, aStringArray3711, i, 864308515 * anInt3717 - i);
			method6142((byte) 1);
		}
	}

	void method6136(int i) {
		if (i < 0 || i >= anInt3717 * 864308515)
			throw new RuntimeException("");
		anInt3717 -= 1015696011;
		anIntArray3715 = null;
		if (0 == anInt3717 * 864308515) {
			aLongArray3713 = null;
			aStringArray3711 = null;
			aByteArray3714 = null;
			anIntArray3716 = null;
			anIntArray3721 = null;
			aBoolArray3728 = null;
			anInt3719 = -382872543;
			anInt3720 = -1867371375;
		} else {
			System.arraycopy(aByteArray3714, i + 1, aByteArray3714, i, 864308515 * anInt3717 - i);
			System.arraycopy(anIntArray3716, i + 1, anIntArray3716, i, anInt3717 * 864308515 - i);
			System.arraycopy(anIntArray3721, i + 1, anIntArray3721, i, 864308515 * anInt3717 - i);
			System.arraycopy(aBoolArray3728, 1 + i, aBoolArray3728, i, 864308515 * anInt3717 - i);
			if (aLongArray3713 != null)
				System.arraycopy(aLongArray3713, i + 1, aLongArray3713, i, anInt3717 * 864308515 - i);
			if (aStringArray3711 != null)
				System.arraycopy(aStringArray3711, 1 + i, aStringArray3711, i, 864308515 * anInt3717 - i);
			method6142((byte) 1);
		}
	}

	void method6137() {
		if (0 == 864308515 * anInt3717) {
			anInt3719 = -382872543;
			anInt3720 = -1867371375;
		} else {
			anInt3719 = -382872543;
			anInt3720 = -1867371375;
			int i = 0;
			byte i_72_ = aByteArray3714[0];
			for (int i_73_ = 1; i_73_ < anInt3717 * 864308515; i_73_++) {
				if (aByteArray3714[i_73_] > i_72_) {
					if (125 == i_72_)
						anInt3720 = i * 1867371375;
					i = i_73_;
					i_72_ = aByteArray3714[i_73_];
				} else if (-1 == anInt3720 * -862917745 && aByteArray3714[i_73_] == 125)
					anInt3720 = 1867371375 * i_73_;
			}
			anInt3719 = i * 382872543;
			if (-1 != anInt3719 * 2080985119)
				aByteArray3714[anInt3719 * 2080985119] = (byte) 126;
		}
	}

	void method6138(long l, String string) {
		if (string != null && string.length() == 0)
			string = null;
		if (l > 0L != aBool3701)
			throw new RuntimeException("");
		if (aBool3702 != (null != string))
			throw new RuntimeException("");
		if (l > 0L && (aLongArray3712 == null || -1045961249 * anInt3726 >= aLongArray3712.length) || (null != string && (aStringArray3724 == null || -1045961249 * anInt3726 >= aStringArray3724.length)))
			method6095(5 + -1045961249 * anInt3726, (byte) 107);
		if (null != aLongArray3712)
			aLongArray3712[anInt3726 * -1045961249] = l;
		if (null != aStringArray3724)
			aStringArray3724[anInt3726 * -1045961249] = string;
		anInt3726 += -631892449;
	}

	void method6139(long l, String string) {
		if (string != null && string.length() == 0)
			string = null;
		if (l > 0L != aBool3701)
			throw new RuntimeException("");
		if (aBool3702 != (null != string))
			throw new RuntimeException("");
		if (l > 0L && (aLongArray3712 == null || -1045961249 * anInt3726 >= aLongArray3712.length) || (null != string && (aStringArray3724 == null || -1045961249 * anInt3726 >= aStringArray3724.length)))
			method6095(5 + -1045961249 * anInt3726, (byte) 63);
		if (null != aLongArray3712)
			aLongArray3712[anInt3726 * -1045961249] = l;
		if (null != aStringArray3724)
			aStringArray3724[anInt3726 * -1045961249] = string;
		anInt3726 += -631892449;
	}

	void method6140(long l, String string) {
		if (string != null && string.length() == 0)
			string = null;
		if (l > 0L != aBool3701)
			throw new RuntimeException("");
		if (aBool3702 != (null != string))
			throw new RuntimeException("");
		if (l > 0L && (aLongArray3712 == null || -1045961249 * anInt3726 >= aLongArray3712.length) || (null != string && (aStringArray3724 == null || -1045961249 * anInt3726 >= aStringArray3724.length)))
			method6095(5 + -1045961249 * anInt3726, (byte) 17);
		if (null != aLongArray3712)
			aLongArray3712[anInt3726 * -1045961249] = l;
		if (null != aStringArray3724)
			aStringArray3724[anInt3726 * -1045961249] = string;
		anInt3726 += -631892449;
	}

	void method6141(int i) {
		anInt3726 -= -631892449;
		if (anInt3726 * -1045961249 == 0) {
			aLongArray3712 = null;
			aStringArray3724 = null;
		} else {
			if (aLongArray3712 != null)
				System.arraycopy(aLongArray3712, 1 + i, aLongArray3712, i, anInt3726 * -1045961249 - i);
			if (aStringArray3724 != null)
				System.arraycopy(aStringArray3724, i + 1, aStringArray3724, i, -1045961249 * anInt3726 - i);
		}
	}

	void method6142(byte i) {
		if (0 == 864308515 * anInt3717) {
			anInt3719 = -382872543;
			anInt3720 = -1867371375;
		} else {
			anInt3719 = -382872543;
			anInt3720 = -1867371375;
			int i_74_ = 0;
			byte i_75_ = aByteArray3714[0];
			for (int i_76_ = 1; i_76_ < anInt3717 * 864308515; i_76_++) {
				if (aByteArray3714[i_76_] > i_75_) {
					if (125 == i_75_)
						anInt3720 = i_74_ * 1867371375;
					i_74_ = i_76_;
					i_75_ = aByteArray3714[i_76_];
				} else if (-1 == anInt3720 * -862917745 && aByteArray3714[i_76_] == 125)
					anInt3720 = 1867371375 * i_76_;
			}
			anInt3719 = i_74_ * 382872543;
			if (-1 != anInt3719 * 2080985119)
				aByteArray3714[anInt3719 * 2080985119] = (byte) 126;
		}
	}

	int method6143(int i, boolean bool) {
		if (aBoolArray3728[i] == bool)
			return -1;
		aBoolArray3728[i] = bool;
		return i;
	}

	int method6144(int i, boolean bool) {
		if (aBoolArray3728[i] == bool)
			return -1;
		aBoolArray3728[i] = bool;
		return i;
	}

	boolean method6145(int i, long l) {
		if (aClass14_3725 != null) {
			Class527 class527 = aClass14_3725.method709((long) i);
			if (class527 != null) {
				if (class527 instanceof Class527_Sub20) {
					Class527_Sub20 class527_sub20 = (Class527_Sub20) class527;
					if (3276150014841543847L * class527_sub20.aLong10482 == l)
						return false;
					class527_sub20.aLong10482 = -613984820454061289L * l;
					return true;
				}
				class527.method8735(-1889161967);
			}
		} else
			aClass14_3725 = new Class14(4);
		aClass14_3725.method714(new Class527_Sub20(l), (long) i);
		return true;
	}

	boolean method6146(int i, long l) {
		if (aClass14_3725 != null) {
			Class527 class527 = aClass14_3725.method709((long) i);
			if (class527 != null) {
				if (class527 instanceof Class527_Sub20) {
					Class527_Sub20 class527_sub20 = (Class527_Sub20) class527;
					if (3276150014841543847L * class527_sub20.aLong10482 == l)
						return false;
					class527_sub20.aLong10482 = -613984820454061289L * l;
					return true;
				}
				class527.method8735(-1889161967);
			}
		} else
			aClass14_3725 = new Class14(4);
		aClass14_3725.method714(new Class527_Sub20(l), (long) i);
		return true;
	}

	int method6147(int i, int i_77_, int i_78_, int i_79_) {
		int i_80_ = (1 << i_78_) - 1;
		int i_81_ = i_79_ == 31 ? -1 : (1 << i_79_ + 1) - 1;
		int i_82_ = i_81_ ^ i_80_;
		i_77_ <<= i_78_;
		i_77_ &= i_82_;
		int i_83_ = anIntArray3716[i];
		if (i_77_ == (i_83_ & i_82_))
			return -1;
		i_83_ &= i_82_ ^ 0xffffffff;
		anIntArray3716[i] = i_83_ | i_77_;
		return i;
	}

	void method6148(int i) {
		if (aBool3701) {
			if (aLongArray3712 != null)
				System.arraycopy(aLongArray3712, 0, aLongArray3712 = new long[i], 0, anInt3726 * -1045961249);
			else
				aLongArray3712 = new long[i];
		}
		if (aBool3702) {
			if (null != aStringArray3724)
				System.arraycopy(aStringArray3724, 0, aStringArray3724 = new String[i], 0, anInt3726 * -1045961249);
			else
				aStringArray3724 = new String[i];
		}
	}

	int method6149(int i, int i_84_, int i_85_, int i_86_) {
		int i_87_ = (1 << i_85_) - 1;
		int i_88_ = i_86_ == 31 ? -1 : (1 << i_86_ + 1) - 1;
		int i_89_ = i_88_ ^ i_87_;
		i_84_ <<= i_85_;
		i_84_ &= i_89_;
		int i_90_ = anIntArray3716[i];
		if (i_84_ == (i_90_ & i_89_))
			return -1;
		i_90_ &= i_89_ ^ 0xffffffff;
		anIntArray3716[i] = i_90_ | i_84_;
		return i;
	}

	boolean method6150(int i, int i_91_) {
		if (aClass14_3725 != null) {
			Class527 class527 = aClass14_3725.method709((long) i);
			if (class527 != null) {
				if (class527 instanceof Node_Sub6) {
					Node_Sub6 class527_sub7 = (Node_Sub6) class527;
					if (class527_sub7.anInt10398 * -78845949 == i_91_)
						return false;
					class527_sub7.anInt10398 = i_91_ * -1332018517;
					return true;
				}
				class527.method8735(-1889161967);
			}
		} else
			aClass14_3725 = new Class14(4);
		aClass14_3725.method714(new Node_Sub6(i_91_), (long) i);
		return true;
	}

	boolean method6151(int i, int i_92_) {
		if (aClass14_3725 != null) {
			Class527 class527 = aClass14_3725.method709((long) i);
			if (class527 != null) {
				if (class527 instanceof Node_Sub6) {
					Node_Sub6 class527_sub7 = (Node_Sub6) class527;
					if (class527_sub7.anInt10398 * -78845949 == i_92_)
						return false;
					class527_sub7.anInt10398 = i_92_ * -1332018517;
					return true;
				}
				class527.method8735(-1889161967);
			}
		} else
			aClass14_3725 = new Class14(4);
		aClass14_3725.method714(new Node_Sub6(i_92_), (long) i);
		return true;
	}

	int method6152(int i, boolean bool) {
		if (aBoolArray3728[i] == bool)
			return -1;
		aBoolArray3728[i] = bool;
		return i;
	}

	boolean method6153(int i, long l) {
		if (aClass14_3725 != null) {
			Class527 class527 = aClass14_3725.method709((long) i);
			if (class527 != null) {
				if (class527 instanceof Class527_Sub20) {
					Class527_Sub20 class527_sub20 = (Class527_Sub20) class527;
					if (3276150014841543847L * class527_sub20.aLong10482 == l)
						return false;
					class527_sub20.aLong10482 = -613984820454061289L * l;
					return true;
				}
				class527.method8735(-1889161967);
			}
		} else
			aClass14_3725 = new Class14(4);
		aClass14_3725.method714(new Class527_Sub20(l), (long) i);
		return true;
	}

	boolean method6154(int i, long l) {
		if (aClass14_3725 != null) {
			Class527 class527 = aClass14_3725.method709((long) i);
			if (class527 != null) {
				if (class527 instanceof Class527_Sub20) {
					Class527_Sub20 class527_sub20 = (Class527_Sub20) class527;
					if (3276150014841543847L * class527_sub20.aLong10482 == l)
						return false;
					class527_sub20.aLong10482 = -613984820454061289L * l;
					return true;
				}
				class527.method8735(-1889161967);
			}
		} else
			aClass14_3725 = new Class14(4);
		aClass14_3725.method714(new Class527_Sub20(l), (long) i);
		return true;
	}

	boolean method6155(int i, String string) {
		if (string == null)
			string = "";
		else if (string.length() > 80)
			string = string.substring(0, 80);
		if (null != aClass14_3725) {
			Class527 class527 = aClass14_3725.method709((long) i);
			if (null != class527) {
				if (class527 instanceof Class527_Sub26) {
					Class527_Sub26 class527_sub26 = (Class527_Sub26) class527;
					if (class527_sub26.anObject10522 instanceof String) {
						if (string.equals(class527_sub26.anObject10522))
							return false;
						class527_sub26.method8735(-1889161967);
						aClass14_3725.method714(new Class527_Sub26(string), (class527_sub26.aLong7106 * -8168620736534281759L));
						return true;
					}
				}
				class527.method8735(-1889161967);
			}
		} else
			aClass14_3725 = new Class14(4);
		aClass14_3725.method714(new Class527_Sub26(string), (long) i);
		return true;
	}

	void method6156(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedByte();
		if (i < 1 || i > 6)
			throw new RuntimeException(new StringBuilder().append("").append(i).toString());
		int i_93_ = class527_sub38.readUnsignedByte();
		if ((i_93_ & 0x1) != 0)
			aBool3701 = true;
		if ((i_93_ & 0x2) != 0)
			aBool3702 = true;
		if (!aBool3701) {
			aLongArray3713 = null;
			aLongArray3712 = null;
		}
		if (!aBool3702) {
			aStringArray3711 = null;
			aStringArray3724 = null;
		}
		anInt3704 = class527_sub38.readInt() * 1447391895;
		anInt3706 = class527_sub38.readInt() * 1982342369;
		if (i <= 3 && 0 != anInt3706 * 400301857)
			anInt3706 += -1370751584;
		anInt3717 = class527_sub38.readUnsignedShort() * 1015696011;
		anInt3726 = class527_sub38.readUnsignedByte() * -631892449;
		aString3722 = class527_sub38.readString(1285233554);
		if (i >= 4)
			class527_sub38.readInt();
		aBool3700 = class527_sub38.readUnsignedByte() == 1;
		aByte3708 = class527_sub38.readByte();
		aByte3709 = class527_sub38.readByte();
		aByte3710 = class527_sub38.readByte();
		aByte3723 = class527_sub38.readByte();
		if (anInt3717 * 864308515 > 0) {
			if (aBool3701 && (aLongArray3713 == null || aLongArray3713.length < anInt3717 * 864308515))
				aLongArray3713 = new long[anInt3717 * 864308515];
			if (aBool3702 && (null == aStringArray3711 || aStringArray3711.length < 864308515 * anInt3717))
				aStringArray3711 = new String[864308515 * anInt3717];
			if (null == aByteArray3714 || aByteArray3714.length < anInt3717 * 864308515)
				aByteArray3714 = new byte[864308515 * anInt3717];
			if (anIntArray3716 == null || anIntArray3716.length < anInt3717 * 864308515)
				anIntArray3716 = new int[864308515 * anInt3717];
			if (null == anIntArray3721 || anIntArray3721.length < 864308515 * anInt3717)
				anIntArray3721 = new int[864308515 * anInt3717];
			if (null == aBoolArray3728 || aBoolArray3728.length < anInt3717 * 864308515)
				aBoolArray3728 = new boolean[anInt3717 * 864308515];
			for (int i_94_ = 0; i_94_ < anInt3717 * 864308515; i_94_++) {
				if (aBool3701)
					aLongArray3713[i_94_] = class527_sub38.method16612((byte) 1);
				if (aBool3702)
					aStringArray3711[i_94_] = class527_sub38.method16456((byte) 78);
				aByteArray3714[i_94_] = class527_sub38.readByte();
				if (i >= 2)
					anIntArray3716[i_94_] = class527_sub38.readInt();
				if (i >= 5)
					anIntArray3721[i_94_] = class527_sub38.readUnsignedShort();
				else
					anIntArray3721[i_94_] = 0;
				if (i >= 6)
					aBoolArray3728[i_94_] = class527_sub38.readUnsignedByte() == 1;
				else
					aBoolArray3728[i_94_] = false;
			}
			method6142((byte) 1);
		}
		if (anInt3726 * -1045961249 > 0) {
			if (aBool3701 && (aLongArray3712 == null || aLongArray3712.length < -1045961249 * anInt3726))
				aLongArray3712 = new long[-1045961249 * anInt3726];
			if (aBool3702 && (aStringArray3724 == null || aStringArray3724.length < anInt3726 * -1045961249))
				aStringArray3724 = new String[-1045961249 * anInt3726];
			for (int i_95_ = 0; i_95_ < -1045961249 * anInt3726; i_95_++) {
				if (aBool3701)
					aLongArray3712[i_95_] = class527_sub38.method16612((byte) 1);
				if (aBool3702)
					aStringArray3724[i_95_] = class527_sub38.method16456((byte) 126);
			}
		}
		if (i >= 3) {
			int i_96_ = class527_sub38.readUnsignedShort();
			if (i_96_ > 0) {
				aClass14_3725 = new Class14(i_96_ < 16 ? Class186.method3652(i_96_, 1746137042) : 16);
				while (i_96_-- > 0) {
					int i_97_ = class527_sub38.readInt();
					int i_98_ = i_97_ & 0x3fffffff;
					int i_99_ = i_97_ >>> 30;
					if (0 == i_99_) {
						int i_100_ = class527_sub38.readInt();
						aClass14_3725.method714(new Node_Sub6(i_100_), (long) i_98_);
					} else if (1 == i_99_) {
						long l = class527_sub38.method16612((byte) 1);
						aClass14_3725.method714(new Class527_Sub20(l), (long) i_98_);
					} else if (2 == i_99_) {
						String string = class527_sub38.readString(1513307843);
						aClass14_3725.method714(new Class527_Sub26(string), (long) i_98_);
					}
				}
			}
		}
	}

	void method6157(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedByte();
		if (i < 1 || i > 6)
			throw new RuntimeException(new StringBuilder().append("").append(i).toString());
		int i_101_ = class527_sub38.readUnsignedByte();
		if ((i_101_ & 0x1) != 0)
			aBool3701 = true;
		if ((i_101_ & 0x2) != 0)
			aBool3702 = true;
		if (!aBool3701) {
			aLongArray3713 = null;
			aLongArray3712 = null;
		}
		if (!aBool3702) {
			aStringArray3711 = null;
			aStringArray3724 = null;
		}
		anInt3704 = class527_sub38.readInt() * 1447391895;
		anInt3706 = class527_sub38.readInt() * 1982342369;
		if (i <= 3 && 0 != anInt3706 * 400301857)
			anInt3706 += -1370751584;
		anInt3717 = class527_sub38.readUnsignedShort() * 1015696011;
		anInt3726 = class527_sub38.readUnsignedByte() * -631892449;
		aString3722 = class527_sub38.readString(1486898695);
		if (i >= 4)
			class527_sub38.readInt();
		aBool3700 = class527_sub38.readUnsignedByte() == 1;
		aByte3708 = class527_sub38.readByte();
		aByte3709 = class527_sub38.readByte();
		aByte3710 = class527_sub38.readByte();
		aByte3723 = class527_sub38.readByte();
		if (anInt3717 * 864308515 > 0) {
			if (aBool3701 && (aLongArray3713 == null || aLongArray3713.length < anInt3717 * 864308515))
				aLongArray3713 = new long[anInt3717 * 864308515];
			if (aBool3702 && (null == aStringArray3711 || aStringArray3711.length < 864308515 * anInt3717))
				aStringArray3711 = new String[864308515 * anInt3717];
			if (null == aByteArray3714 || aByteArray3714.length < anInt3717 * 864308515)
				aByteArray3714 = new byte[864308515 * anInt3717];
			if (anIntArray3716 == null || anIntArray3716.length < anInt3717 * 864308515)
				anIntArray3716 = new int[864308515 * anInt3717];
			if (null == anIntArray3721 || anIntArray3721.length < 864308515 * anInt3717)
				anIntArray3721 = new int[864308515 * anInt3717];
			if (null == aBoolArray3728 || aBoolArray3728.length < anInt3717 * 864308515)
				aBoolArray3728 = new boolean[anInt3717 * 864308515];
			for (int i_102_ = 0; i_102_ < anInt3717 * 864308515; i_102_++) {
				if (aBool3701)
					aLongArray3713[i_102_] = class527_sub38.method16612((byte) 1);
				if (aBool3702)
					aStringArray3711[i_102_] = class527_sub38.method16456((byte) 115);
				aByteArray3714[i_102_] = class527_sub38.readByte();
				if (i >= 2)
					anIntArray3716[i_102_] = class527_sub38.readInt();
				if (i >= 5)
					anIntArray3721[i_102_] = class527_sub38.readUnsignedShort();
				else
					anIntArray3721[i_102_] = 0;
				if (i >= 6)
					aBoolArray3728[i_102_] = class527_sub38.readUnsignedByte() == 1;
				else
					aBoolArray3728[i_102_] = false;
			}
			method6142((byte) 1);
		}
		if (anInt3726 * -1045961249 > 0) {
			if (aBool3701 && (aLongArray3712 == null || aLongArray3712.length < -1045961249 * anInt3726))
				aLongArray3712 = new long[-1045961249 * anInt3726];
			if (aBool3702 && (aStringArray3724 == null || aStringArray3724.length < anInt3726 * -1045961249))
				aStringArray3724 = new String[-1045961249 * anInt3726];
			for (int i_103_ = 0; i_103_ < -1045961249 * anInt3726; i_103_++) {
				if (aBool3701)
					aLongArray3712[i_103_] = class527_sub38.method16612((byte) 1);
				if (aBool3702)
					aStringArray3724[i_103_] = class527_sub38.method16456((byte) 47);
			}
		}
		if (i >= 3) {
			int i_104_ = class527_sub38.readUnsignedShort();
			if (i_104_ > 0) {
				aClass14_3725 = new Class14(i_104_ < 16 ? Class186.method3652(i_104_, -545686130) : 16);
				while (i_104_-- > 0) {
					int i_105_ = class527_sub38.readInt();
					int i_106_ = i_105_ & 0x3fffffff;
					int i_107_ = i_105_ >>> 30;
					if (0 == i_107_) {
						int i_108_ = class527_sub38.readInt();
						aClass14_3725.method714(new Node_Sub6(i_108_), (long) i_106_);
					} else if (1 == i_107_) {
						long l = class527_sub38.method16612((byte) 1);
						aClass14_3725.method714(new Class527_Sub20(l), (long) i_106_);
					} else if (2 == i_107_) {
						String string = class527_sub38.readString(1346295543);
						aClass14_3725.method714(new Class527_Sub26(string), (long) i_106_);
					}
				}
			}
		}
	}

	void method6158(long l, String string, int i) {
		if (null != string && string.length() == 0)
			string = null;
		if (l > 0L != aBool3701)
			throw new RuntimeException("");
		if ((string != null) != aBool3702)
			throw new RuntimeException("");
		if (l > 0L && (null == aLongArray3713 || anInt3717 * 864308515 >= aLongArray3713.length) || (string != null && (null == aStringArray3711 || anInt3717 * 864308515 >= aStringArray3711.length)))
			method6094(5 + anInt3717 * 864308515, -66107057);
		if (null != aLongArray3713)
			aLongArray3713[anInt3717 * 864308515] = l;
		if (aStringArray3711 != null)
			aStringArray3711[anInt3717 * 864308515] = string;
		if (-1 == anInt3719 * 2080985119) {
			anInt3719 = 1642730109 * anInt3717;
			aByteArray3714[anInt3717 * 864308515] = (byte) 126;
		} else
			aByteArray3714[864308515 * anInt3717] = (byte) 0;
		anIntArray3716[864308515 * anInt3717] = 0;
		anIntArray3721[864308515 * anInt3717] = i;
		aBoolArray3728[anInt3717 * 864308515] = false;
		anInt3717 += 1015696011;
		anIntArray3715 = null;
	}

	static final void method6159(Class665 class665, int i) {
		class665.anInt8526 -= 307142523;
		int i_109_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_110_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		int i_111_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 2];
		Class243 class243 = Class648.method10837(i_111_, 2007929059);
		Class555.method9409(class243, i_109_, i_110_, (byte) -92);
	}

	public static Class381 method6160(RSByteBuffer class527_sub38, int i) {
		int i_112_ = class527_sub38.readInt();
		return new Class381(i_112_);
	}

	static final void method6161(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class619.aByte8114;
	}
}
