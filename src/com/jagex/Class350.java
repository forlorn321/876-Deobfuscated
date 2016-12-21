/* Class350 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class350 {
	public byte aByte3698;
	boolean aBool3699;
	boolean aBool3700;
	long aLong3701;
	int anInt3702 = 0;
	public String[] aStringArray3703;
	public byte aByte3704;
	int anInt3705;
	public byte aByte3706;
	public String aString3707 = null;
	public byte aByte3708;
	static final byte aByte3709 = 0;
	public int anInt3710;
	long[] aLongArray3711;
	public byte[] aByteArray3712;
	int[] anIntArray3713;
	Class4 aClass4_3714;
	public static final byte aByte3715 = -1;
	public boolean[] aBoolArray3716;
	public int anInt3717;
	public int anInt3718;
	public int anInt3719;
	long[] aLongArray3720;
	public int[] anIntArray3721;
	public String[] aStringArray3722;
	static final int anInt3723 = 6;
	public boolean aBool3724;
	static final byte aByte3725 = 126;
	static final byte aByte3726 = 125;
	int[] anIntArray3727;
	static final byte aByte3728 = 127;

	void method4594(int i) {
		anInt3719 -= 772237047;
		if (anInt3719 * 984431303 == 0) {
			aLongArray3720 = null;
			aStringArray3722 = null;
		} else {
			if (aLongArray3720 != null)
				System.arraycopy(aLongArray3720, i + 1, aLongArray3720, i, 984431303 * anInt3719 - i);
			if (aStringArray3722 != null)
				System.arraycopy(aStringArray3722, i + 1, aStringArray3722, i, anInt3719 * 984431303 - i);
		}
	}

	void method4595(int i, int i_0_) {
		if (aBool3699) {
			if (null != aLongArray3711)
				System.arraycopy(aLongArray3711, 0, aLongArray3711 = new long[i], 0, anInt3710 * -1097649699);
			else
				aLongArray3711 = new long[i];
		}
		if (aBool3700) {
			if (null != aStringArray3703)
				System.arraycopy(aStringArray3703, 0, aStringArray3703 = new String[i], 0, -1097649699 * anInt3710);
			else
				aStringArray3703 = new String[i];
		}
		if (aByteArray3712 != null)
			System.arraycopy(aByteArray3712, 0, aByteArray3712 = new byte[i], 0, anInt3710 * -1097649699);
		else
			aByteArray3712 = new byte[i];
		if (null != anIntArray3727)
			System.arraycopy(anIntArray3727, 0, anIntArray3727 = new int[i], 0, -1097649699 * anInt3710);
		else
			anIntArray3727 = new int[i];
		if (null != anIntArray3721)
			System.arraycopy(anIntArray3721, 0, anIntArray3721 = new int[i], 0, anInt3710 * -1097649699);
		else
			anIntArray3721 = new int[i];
		if (null != aBoolArray3716)
			System.arraycopy(aBoolArray3716, 0, aBoolArray3716 = new boolean[i], 0, anInt3710 * -1097649699);
		else
			aBoolArray3716 = new boolean[i];
	}

	void method4596(int i, int i_1_) {
		if (aBool3699) {
			if (aLongArray3720 != null)
				System.arraycopy(aLongArray3720, 0, aLongArray3720 = new long[i], 0, 984431303 * anInt3719);
			else
				aLongArray3720 = new long[i];
		}
		if (aBool3700) {
			if (null != aStringArray3722)
				System.arraycopy(aStringArray3722, 0, aStringArray3722 = new String[i], 0, 984431303 * anInt3719);
			else
				aStringArray3722 = new String[i];
		}
	}

	void method4597(int i) {
		if (aBool3699) {
			if (null != aLongArray3711)
				System.arraycopy(aLongArray3711, 0, aLongArray3711 = new long[i], 0, anInt3710 * -1097649699);
			else
				aLongArray3711 = new long[i];
		}
		if (aBool3700) {
			if (null != aStringArray3703)
				System.arraycopy(aStringArray3703, 0, aStringArray3703 = new String[i], 0, -1097649699 * anInt3710);
			else
				aStringArray3703 = new String[i];
		}
		if (aByteArray3712 != null)
			System.arraycopy(aByteArray3712, 0, aByteArray3712 = new byte[i], 0, anInt3710 * -1097649699);
		else
			aByteArray3712 = new byte[i];
		if (null != anIntArray3727)
			System.arraycopy(anIntArray3727, 0, anIntArray3727 = new int[i], 0, -1097649699 * anInt3710);
		else
			anIntArray3727 = new int[i];
		if (null != anIntArray3721)
			System.arraycopy(anIntArray3721, 0, anIntArray3721 = new int[i], 0, anInt3710 * -1097649699);
		else
			anIntArray3721 = new int[i];
		if (null != aBoolArray3716)
			System.arraycopy(aBoolArray3716, 0, aBoolArray3716 = new boolean[i], 0, anInt3710 * -1097649699);
		else
			aBoolArray3716 = new boolean[i];
	}

	public int method4598(int i, int i_2_, int i_3_, byte i_4_) {
		int i_5_ = i_3_ == 31 ? -1 : (1 << i_3_ + 1) - 1;
		return (anIntArray3727[i] & i_5_) >>> i_2_;
	}

	public Integer method4599(int i, int i_6_) {
		if (null == aClass4_3714)
			return null;
		Class536 class536 = aClass4_3714.method556((long) i);
		if (null == class536 || !(class536 instanceof Class536_Sub26))
			return null;
		return new Integer(2083602213 * ((Class536_Sub26) class536).anInt10533);
	}

	public Long method4600(int i, int i_7_) {
		if (null == aClass4_3714)
			return null;
		Class536 class536 = aClass4_3714.method556((long) i);
		if (class536 == null || !(class536 instanceof Class536_Sub16))
			return null;
		return new Long(((Class536_Sub16) class536).aLong10489 * -8221678582872212071L);
	}

	public String method4601(int i, int i_8_) {
		if (null == aClass4_3714)
			return null;
		Class536 class536 = aClass4_3714.method556((long) i);
		if (null == class536 || !(class536 instanceof Class536_Sub13))
			return null;
		return (String) ((Class536_Sub13) class536).anObject10468;
	}

	public int[] method4602(int i) {
		if (null == anIntArray3713) {
			String[] strings = new String[-1097649699 * anInt3710];
			anIntArray3713 = new int[-1097649699 * anInt3710];
			for (int i_9_ = 0; i_9_ < -1097649699 * anInt3710; i_9_++) {
				strings[i_9_] = aStringArray3703[i_9_];
				if (null != strings[i_9_])
					strings[i_9_] = strings[i_9_].toLowerCase();
				anIntArray3713[i_9_] = i_9_;
			}
			Class205_Sub12.method9071(strings, anIntArray3713, 1104727675);
		}
		return anIntArray3713;
	}

	void method4603(int i, byte i_10_) {
		if (i < 0 || i >= -1097649699 * anInt3710)
			throw new RuntimeException("");
		anInt3710 -= 2010033781;
		anIntArray3713 = null;
		if (anInt3710 * -1097649699 == 0) {
			aLongArray3711 = null;
			aStringArray3703 = null;
			aByteArray3712 = null;
			anIntArray3727 = null;
			anIntArray3721 = null;
			aBoolArray3716 = null;
			anInt3717 = -80708359;
			anInt3718 = 2003344807;
		} else {
			System.arraycopy(aByteArray3712, 1 + i, aByteArray3712, i, anInt3710 * -1097649699 - i);
			System.arraycopy(anIntArray3727, 1 + i, anIntArray3727, i, -1097649699 * anInt3710 - i);
			System.arraycopy(anIntArray3721, 1 + i, anIntArray3721, i, anInt3710 * -1097649699 - i);
			System.arraycopy(aBoolArray3716, 1 + i, aBoolArray3716, i, -1097649699 * anInt3710 - i);
			if (null != aLongArray3711)
				System.arraycopy(aLongArray3711, i + 1, aLongArray3711, i, anInt3710 * -1097649699 - i);
			if (aStringArray3703 != null)
				System.arraycopy(aStringArray3703, i + 1, aStringArray3703, i, -1097649699 * anInt3710 - i);
			method4621(514637503);
		}
	}

	void method4604(int i) {
		if (aBool3699) {
			if (aLongArray3720 != null)
				System.arraycopy(aLongArray3720, 0, aLongArray3720 = new long[i], 0, 984431303 * anInt3719);
			else
				aLongArray3720 = new long[i];
		}
		if (aBool3700) {
			if (null != aStringArray3722)
				System.arraycopy(aStringArray3722, 0, aStringArray3722 = new String[i], 0, 984431303 * anInt3719);
			else
				aStringArray3722 = new String[i];
		}
	}

	void method4605(long l, String string, byte i) {
		if (string != null && string.length() == 0)
			string = null;
		if (aBool3699 != l > 0L)
			throw new RuntimeException("");
		if ((null != string) != aBool3700)
			throw new RuntimeException("");
		if (l > 0L && (null == aLongArray3720 || anInt3719 * 984431303 >= aLongArray3720.length) || (string != null && (aStringArray3722 == null || anInt3719 * 984431303 >= aStringArray3722.length)))
			method4596(anInt3719 * 984431303 + 5, 1472671728);
		if (aLongArray3720 != null)
			aLongArray3720[984431303 * anInt3719] = l;
		if (aStringArray3722 != null)
			aStringArray3722[984431303 * anInt3719] = string;
		anInt3719 += 772237047;
	}

	void method4606(int i, byte i_11_) {
		anInt3719 -= 772237047;
		if (anInt3719 * 984431303 == 0) {
			aLongArray3720 = null;
			aStringArray3722 = null;
		} else {
			if (aLongArray3720 != null)
				System.arraycopy(aLongArray3720, i + 1, aLongArray3720, i, 984431303 * anInt3719 - i);
			if (aStringArray3722 != null)
				System.arraycopy(aStringArray3722, i + 1, aStringArray3722, i, anInt3719 * 984431303 - i);
		}
	}

	int method4607(int i, byte i_12_, byte i_13_) {
		if (i_12_ == 126 || i_12_ == 127)
			return -1;
		if (352877239 * anInt3717 == i && (-1330526743 * anInt3718 == -1 || aByteArray3712[anInt3718 * -1330526743] < 125))
			return -1;
		if (aByteArray3712[i] == i_12_)
			return -1;
		aByteArray3712[i] = i_12_;
		method4621(106468222);
		return i;
	}

	int method4608(int i, boolean bool, int i_14_) {
		if (bool == aBoolArray3716[i])
			return -1;
		aBoolArray3716[i] = bool;
		return i;
	}

	public int method4609(int i, int i_15_, int i_16_) {
		int i_17_ = i_16_ == 31 ? -1 : (1 << i_16_ + 1) - 1;
		return (anIntArray3727[i] & i_17_) >>> i_15_;
	}

	int method4610(int i, int i_18_, int i_19_, int i_20_, int i_21_) {
		int i_22_ = (1 << i_19_) - 1;
		int i_23_ = 31 == i_20_ ? -1 : (1 << 1 + i_20_) - 1;
		int i_24_ = i_23_ ^ i_22_;
		i_18_ <<= i_19_;
		i_18_ &= i_24_;
		int i_25_ = anIntArray3727[i];
		if (i_18_ == (i_25_ & i_24_))
			return -1;
		i_25_ &= i_24_ ^ 0xffffffff;
		anIntArray3727[i] = i_25_ | i_18_;
		return i;
	}

	boolean method4611(int i, int i_26_, int i_27_, int i_28_, int i_29_) {
		int i_30_ = (1 << i_27_) - 1;
		int i_31_ = 31 == i_28_ ? -1 : (1 << i_28_ + 1) - 1;
		int i_32_ = i_31_ ^ i_30_;
		i_26_ <<= i_27_;
		i_26_ &= i_32_;
		if (null != aClass4_3714) {
			Class536 class536 = aClass4_3714.method556((long) i);
			if (null != class536) {
				if (class536 instanceof Class536_Sub26) {
					Class536_Sub26 class536_sub26 = (Class536_Sub26) class536;
					if ((class536_sub26.anInt10533 * 2083602213 & i_32_) == i_26_)
						return false;
					Class536_Sub26 class536_sub26_33_;
					(class536_sub26_33_ = class536_sub26).anInt10533 = (1189135533 * (2083602213 * class536_sub26_33_.anInt10533 & (i_32_ ^ 0xffffffff)));
					Class536_Sub26 class536_sub26_34_;
					(class536_sub26_34_ = class536_sub26).anInt10533 = ((2083602213 * class536_sub26_34_.anInt10533 | i_26_) * 1189135533);
					return true;
				}
				class536.method6484(1266348258);
			}
		} else
			aClass4_3714 = new Class4(4);
		aClass4_3714.method560(new Class536_Sub26(i_26_), (long) i);
		return true;
	}

	boolean method4612(int i, long l) {
		if (aClass4_3714 != null) {
			Class536 class536 = aClass4_3714.method556((long) i);
			if (class536 != null) {
				if (class536 instanceof Class536_Sub16) {
					Class536_Sub16 class536_sub16 = (Class536_Sub16) class536;
					if (l == -8221678582872212071L * class536_sub16.aLong10489)
						return false;
					class536_sub16.aLong10489 = 1363666573745260201L * l;
					return true;
				}
				class536.method6484(1195058721);
			}
		} else
			aClass4_3714 = new Class4(4);
		aClass4_3714.method560(new Class536_Sub16(l), (long) i);
		return true;
	}

	void method4613(RSByteBuffer class536_sub33, int i) {
		int i_35_ = class536_sub33.readUnsignedByte();
		if (i_35_ < 1 || i_35_ > 6)
			throw new RuntimeException(new StringBuilder().append("").append(i_35_).toString());
		int i_36_ = class536_sub33.readUnsignedByte();
		if (0 != (i_36_ & 0x1))
			aBool3699 = true;
		if (0 != (i_36_ & 0x2))
			aBool3700 = true;
		if (!aBool3699) {
			aLongArray3711 = null;
			aLongArray3720 = null;
		}
		if (!aBool3700) {
			aStringArray3703 = null;
			aStringArray3722 = null;
		}
		anInt3702 = class536_sub33.readInt() * -2076295007;
		anInt3705 = class536_sub33.readInt() * 1731525133;
		if (i_35_ <= 3 && 1101587653 * anInt3705 != 0)
			anInt3705 += 114369824;
		anInt3710 = class536_sub33.readUnsignedShort() * 2010033781;
		anInt3719 = class536_sub33.readUnsignedByte() * 772237047;
		aString3707 = class536_sub33.readString();
		if (i_35_ >= 4)
			class536_sub33.readInt();
		aBool3724 = class536_sub33.readUnsignedByte() == 1;
		aByte3706 = class536_sub33.readByte();
		aByte3698 = class536_sub33.readByte();
		aByte3708 = class536_sub33.readByte();
		aByte3704 = class536_sub33.readByte();
		if (-1097649699 * anInt3710 > 0) {
			if (aBool3699 && (null == aLongArray3711 || aLongArray3711.length < anInt3710 * -1097649699))
				aLongArray3711 = new long[-1097649699 * anInt3710];
			if (aBool3700 && (null == aStringArray3703 || aStringArray3703.length < anInt3710 * -1097649699))
				aStringArray3703 = new String[-1097649699 * anInt3710];
			if (aByteArray3712 == null || aByteArray3712.length < anInt3710 * -1097649699)
				aByteArray3712 = new byte[-1097649699 * anInt3710];
			if (anIntArray3727 == null || anIntArray3727.length < anInt3710 * -1097649699)
				anIntArray3727 = new int[anInt3710 * -1097649699];
			if (null == anIntArray3721 || anIntArray3721.length < -1097649699 * anInt3710)
				anIntArray3721 = new int[-1097649699 * anInt3710];
			if (null == aBoolArray3716 || aBoolArray3716.length < -1097649699 * anInt3710)
				aBoolArray3716 = new boolean[-1097649699 * anInt3710];
			for (int i_37_ = 0; i_37_ < anInt3710 * -1097649699; i_37_++) {
				if (aBool3699)
					aLongArray3711[i_37_] = class536_sub33.method9711(702869087);
				if (aBool3700)
					aStringArray3703[i_37_] = class536_sub33.method9713(16509697);
				aByteArray3712[i_37_] = class536_sub33.readByte();
				if (i_35_ >= 2)
					anIntArray3727[i_37_] = class536_sub33.readInt();
				if (i_35_ >= 5)
					anIntArray3721[i_37_] = class536_sub33.readUnsignedShort();
				else
					anIntArray3721[i_37_] = 0;
				if (i_35_ >= 6)
					aBoolArray3716[i_37_] = class536_sub33.readUnsignedByte() == 1;
				else
					aBoolArray3716[i_37_] = false;
			}
			method4621(-151470967);
		}
		if (984431303 * anInt3719 > 0) {
			if (aBool3699 && (aLongArray3720 == null || aLongArray3720.length < 984431303 * anInt3719))
				aLongArray3720 = new long[984431303 * anInt3719];
			if (aBool3700 && (null == aStringArray3722 || aStringArray3722.length < 984431303 * anInt3719))
				aStringArray3722 = new String[anInt3719 * 984431303];
			for (int i_38_ = 0; i_38_ < 984431303 * anInt3719; i_38_++) {
				if (aBool3699)
					aLongArray3720[i_38_] = class536_sub33.method9711(702869087);
				if (aBool3700)
					aStringArray3722[i_38_] = class536_sub33.method9713(16509697);
			}
		}
		if (i_35_ >= 3) {
			int i_39_ = class536_sub33.readUnsignedShort();
			if (i_39_ > 0) {
				aClass4_3714 = new Class4(i_39_ < 16 ? Class528.method6434(i_39_, -2071539782) : 16);
				while (i_39_-- > 0) {
					int i_40_ = class536_sub33.readInt();
					int i_41_ = i_40_ & 0x3fffffff;
					int i_42_ = i_40_ >>> 30;
					if (0 == i_42_) {
						int i_43_ = class536_sub33.readInt();
						aClass4_3714.method560(new Class536_Sub26(i_43_), (long) i_41_);
					} else if (i_42_ == 1) {
						long l = class536_sub33.method9711(702869087);
						aClass4_3714.method560(new Class536_Sub16(l), (long) i_41_);
					} else if (2 == i_42_) {
						String string = class536_sub33.readString();
						aClass4_3714.method560(new Class536_Sub13(string), (long) i_41_);
					}
				}
			}
		}
	}

	public int method4614(int i, int i_44_, int i_45_) {
		int i_46_ = i_45_ == 31 ? -1 : (1 << i_45_ + 1) - 1;
		return (anIntArray3727[i] & i_46_) >>> i_44_;
	}

	void method4615(int i) {
		if (i < 0 || i >= -1097649699 * anInt3710)
			throw new RuntimeException("");
		anInt3710 -= 2010033781;
		anIntArray3713 = null;
		if (anInt3710 * -1097649699 == 0) {
			aLongArray3711 = null;
			aStringArray3703 = null;
			aByteArray3712 = null;
			anIntArray3727 = null;
			anIntArray3721 = null;
			aBoolArray3716 = null;
			anInt3717 = -80708359;
			anInt3718 = 2003344807;
		} else {
			System.arraycopy(aByteArray3712, 1 + i, aByteArray3712, i, anInt3710 * -1097649699 - i);
			System.arraycopy(anIntArray3727, 1 + i, anIntArray3727, i, -1097649699 * anInt3710 - i);
			System.arraycopy(anIntArray3721, 1 + i, anIntArray3721, i, anInt3710 * -1097649699 - i);
			System.arraycopy(aBoolArray3716, 1 + i, aBoolArray3716, i, -1097649699 * anInt3710 - i);
			if (null != aLongArray3711)
				System.arraycopy(aLongArray3711, i + 1, aLongArray3711, i, anInt3710 * -1097649699 - i);
			if (aStringArray3703 != null)
				System.arraycopy(aStringArray3703, i + 1, aStringArray3703, i, -1097649699 * anInt3710 - i);
			method4621(381103264);
		}
	}

	void method4616(int i) {
		if (aBool3699) {
			if (null != aLongArray3711)
				System.arraycopy(aLongArray3711, 0, aLongArray3711 = new long[i], 0, anInt3710 * -1097649699);
			else
				aLongArray3711 = new long[i];
		}
		if (aBool3700) {
			if (null != aStringArray3703)
				System.arraycopy(aStringArray3703, 0, aStringArray3703 = new String[i], 0, -1097649699 * anInt3710);
			else
				aStringArray3703 = new String[i];
		}
		if (aByteArray3712 != null)
			System.arraycopy(aByteArray3712, 0, aByteArray3712 = new byte[i], 0, anInt3710 * -1097649699);
		else
			aByteArray3712 = new byte[i];
		if (null != anIntArray3727)
			System.arraycopy(anIntArray3727, 0, anIntArray3727 = new int[i], 0, -1097649699 * anInt3710);
		else
			anIntArray3727 = new int[i];
		if (null != anIntArray3721)
			System.arraycopy(anIntArray3721, 0, anIntArray3721 = new int[i], 0, anInt3710 * -1097649699);
		else
			anIntArray3721 = new int[i];
		if (null != aBoolArray3716)
			System.arraycopy(aBoolArray3716, 0, aBoolArray3716 = new boolean[i], 0, anInt3710 * -1097649699);
		else
			aBoolArray3716 = new boolean[i];
	}

	void method4617() {
		if (-1097649699 * anInt3710 == 0) {
			anInt3717 = -80708359;
			anInt3718 = 2003344807;
		} else {
			anInt3717 = -80708359;
			anInt3718 = 2003344807;
			int i = 0;
			byte i_47_ = aByteArray3712[0];
			for (int i_48_ = 1; i_48_ < -1097649699 * anInt3710; i_48_++) {
				if (aByteArray3712[i_48_] > i_47_) {
					if (i_47_ == 125)
						anInt3718 = -2003344807 * i;
					i = i_48_;
					i_47_ = aByteArray3712[i_48_];
				} else if (-1330526743 * anInt3718 == -1 && 125 == aByteArray3712[i_48_])
					anInt3718 = -2003344807 * i_48_;
			}
			anInt3717 = 80708359 * i;
			if (352877239 * anInt3717 != -1)
				aByteArray3712[352877239 * anInt3717] = (byte) 126;
		}
	}

	void method4618(int i) {
		if (aBool3699) {
			if (aLongArray3720 != null)
				System.arraycopy(aLongArray3720, 0, aLongArray3720 = new long[i], 0, 984431303 * anInt3719);
			else
				aLongArray3720 = new long[i];
		}
		if (aBool3700) {
			if (null != aStringArray3722)
				System.arraycopy(aStringArray3722, 0, aStringArray3722 = new String[i], 0, 984431303 * anInt3719);
			else
				aStringArray3722 = new String[i];
		}
	}

	public int method4619(int i, int i_49_, int i_50_) {
		int i_51_ = i_50_ == 31 ? -1 : (1 << i_50_ + 1) - 1;
		return (anIntArray3727[i] & i_51_) >>> i_49_;
	}

	void method4620(int i) {
		if (aBool3699) {
			if (null != aLongArray3711)
				System.arraycopy(aLongArray3711, 0, aLongArray3711 = new long[i], 0, anInt3710 * -1097649699);
			else
				aLongArray3711 = new long[i];
		}
		if (aBool3700) {
			if (null != aStringArray3703)
				System.arraycopy(aStringArray3703, 0, aStringArray3703 = new String[i], 0, -1097649699 * anInt3710);
			else
				aStringArray3703 = new String[i];
		}
		if (aByteArray3712 != null)
			System.arraycopy(aByteArray3712, 0, aByteArray3712 = new byte[i], 0, anInt3710 * -1097649699);
		else
			aByteArray3712 = new byte[i];
		if (null != anIntArray3727)
			System.arraycopy(anIntArray3727, 0, anIntArray3727 = new int[i], 0, -1097649699 * anInt3710);
		else
			anIntArray3727 = new int[i];
		if (null != anIntArray3721)
			System.arraycopy(anIntArray3721, 0, anIntArray3721 = new int[i], 0, anInt3710 * -1097649699);
		else
			anIntArray3721 = new int[i];
		if (null != aBoolArray3716)
			System.arraycopy(aBoolArray3716, 0, aBoolArray3716 = new boolean[i], 0, anInt3710 * -1097649699);
		else
			aBoolArray3716 = new boolean[i];
	}

	void method4621(int i) {
		if (-1097649699 * anInt3710 == 0) {
			anInt3717 = -80708359;
			anInt3718 = 2003344807;
		} else {
			anInt3717 = -80708359;
			anInt3718 = 2003344807;
			int i_52_ = 0;
			byte i_53_ = aByteArray3712[0];
			for (int i_54_ = 1; i_54_ < -1097649699 * anInt3710; i_54_++) {
				if (aByteArray3712[i_54_] > i_53_) {
					if (i_53_ == 125)
						anInt3718 = -2003344807 * i_52_;
					i_52_ = i_54_;
					i_53_ = aByteArray3712[i_54_];
				} else if (-1330526743 * anInt3718 == -1 && 125 == aByteArray3712[i_54_])
					anInt3718 = -2003344807 * i_54_;
			}
			anInt3717 = 80708359 * i_52_;
			if (352877239 * anInt3717 != -1)
				aByteArray3712[352877239 * anInt3717] = (byte) 126;
		}
	}

	void method4622(long l, String string, int i, int i_55_) {
		if (null != string && string.length() == 0)
			string = null;
		if (l > 0L != aBool3699)
			throw new RuntimeException("");
		if (aBool3700 != (null != string))
			throw new RuntimeException("");
		if (l > 0L && (null == aLongArray3711 || anInt3710 * -1097649699 >= aLongArray3711.length) || (string != null && (null == aStringArray3703 || anInt3710 * -1097649699 >= aStringArray3703.length)))
			method4595(5 + anInt3710 * -1097649699, 1840357689);
		if (aLongArray3711 != null)
			aLongArray3711[anInt3710 * -1097649699] = l;
		if (null != aStringArray3703)
			aStringArray3703[-1097649699 * anInt3710] = string;
		if (anInt3717 * 352877239 == -1) {
			anInt3717 = anInt3710 * 1312650251;
			aByteArray3712[-1097649699 * anInt3710] = (byte) 126;
		} else
			aByteArray3712[-1097649699 * anInt3710] = (byte) 0;
		anIntArray3727[-1097649699 * anInt3710] = 0;
		anIntArray3721[anInt3710 * -1097649699] = i;
		aBoolArray3716[anInt3710 * -1097649699] = false;
		anInt3710 += 2010033781;
		anIntArray3713 = null;
	}

	boolean method4623(int i, int i_56_, byte i_57_) {
		if (null != aClass4_3714) {
			Class536 class536 = aClass4_3714.method556((long) i);
			if (null != class536) {
				if (class536 instanceof Class536_Sub26) {
					Class536_Sub26 class536_sub26 = (Class536_Sub26) class536;
					if (class536_sub26.anInt10533 * 2083602213 == i_56_)
						return false;
					class536_sub26.anInt10533 = 1189135533 * i_56_;
					return true;
				}
				class536.method6484(315871873);
			}
		} else
			aClass4_3714 = new Class4(4);
		aClass4_3714.method560(new Class536_Sub26(i_56_), (long) i);
		return true;
	}

	void method4624(int i) {
		if (i < 0 || i >= -1097649699 * anInt3710)
			throw new RuntimeException("");
		anInt3710 -= 2010033781;
		anIntArray3713 = null;
		if (anInt3710 * -1097649699 == 0) {
			aLongArray3711 = null;
			aStringArray3703 = null;
			aByteArray3712 = null;
			anIntArray3727 = null;
			anIntArray3721 = null;
			aBoolArray3716 = null;
			anInt3717 = -80708359;
			anInt3718 = 2003344807;
		} else {
			System.arraycopy(aByteArray3712, 1 + i, aByteArray3712, i, anInt3710 * -1097649699 - i);
			System.arraycopy(anIntArray3727, 1 + i, anIntArray3727, i, -1097649699 * anInt3710 - i);
			System.arraycopy(anIntArray3721, 1 + i, anIntArray3721, i, anInt3710 * -1097649699 - i);
			System.arraycopy(aBoolArray3716, 1 + i, aBoolArray3716, i, -1097649699 * anInt3710 - i);
			if (null != aLongArray3711)
				System.arraycopy(aLongArray3711, i + 1, aLongArray3711, i, anInt3710 * -1097649699 - i);
			if (aStringArray3703 != null)
				System.arraycopy(aStringArray3703, i + 1, aStringArray3703, i, -1097649699 * anInt3710 - i);
			method4621(-2128091825);
		}
	}

	void method4625() {
		if (-1097649699 * anInt3710 == 0) {
			anInt3717 = -80708359;
			anInt3718 = 2003344807;
		} else {
			anInt3717 = -80708359;
			anInt3718 = 2003344807;
			int i = 0;
			byte i_58_ = aByteArray3712[0];
			for (int i_59_ = 1; i_59_ < -1097649699 * anInt3710; i_59_++) {
				if (aByteArray3712[i_59_] > i_58_) {
					if (i_58_ == 125)
						anInt3718 = -2003344807 * i;
					i = i_59_;
					i_58_ = aByteArray3712[i_59_];
				} else if (-1330526743 * anInt3718 == -1 && 125 == aByteArray3712[i_59_])
					anInt3718 = -2003344807 * i_59_;
			}
			anInt3717 = 80708359 * i;
			if (352877239 * anInt3717 != -1)
				aByteArray3712[352877239 * anInt3717] = (byte) 126;
		}
	}

	void method4626() {
		if (-1097649699 * anInt3710 == 0) {
			anInt3717 = -80708359;
			anInt3718 = 2003344807;
		} else {
			anInt3717 = -80708359;
			anInt3718 = 2003344807;
			int i = 0;
			byte i_60_ = aByteArray3712[0];
			for (int i_61_ = 1; i_61_ < -1097649699 * anInt3710; i_61_++) {
				if (aByteArray3712[i_61_] > i_60_) {
					if (i_60_ == 125)
						anInt3718 = -2003344807 * i;
					i = i_61_;
					i_60_ = aByteArray3712[i_61_];
				} else if (-1330526743 * anInt3718 == -1 && 125 == aByteArray3712[i_61_])
					anInt3718 = -2003344807 * i_61_;
			}
			anInt3717 = 80708359 * i;
			if (352877239 * anInt3717 != -1)
				aByteArray3712[352877239 * anInt3717] = (byte) 126;
		}
	}

	public Class350(RSByteBuffer class536_sub33) {
		anInt3705 = 0;
		anInt3717 = -80708359;
		anInt3718 = 2003344807;
		method4613(class536_sub33, -992123471);
	}

	void method4627(int i) {
		anInt3719 -= 772237047;
		if (anInt3719 * 984431303 == 0) {
			aLongArray3720 = null;
			aStringArray3722 = null;
		} else {
			if (aLongArray3720 != null)
				System.arraycopy(aLongArray3720, i + 1, aLongArray3720, i, 984431303 * anInt3719 - i);
			if (aStringArray3722 != null)
				System.arraycopy(aStringArray3722, i + 1, aStringArray3722, i, anInt3719 * 984431303 - i);
		}
	}

	public int method4628(String string, byte i) {
		if (null == string || string.length() == 0)
			return -1;
		for (int i_62_ = 0; i_62_ < anInt3710 * -1097649699; i_62_++) {
			if (aStringArray3703[i_62_].equals(string))
				return i_62_;
		}
		return -1;
	}

	void method4629(int i) {
		anInt3719 -= 772237047;
		if (anInt3719 * 984431303 == 0) {
			aLongArray3720 = null;
			aStringArray3722 = null;
		} else {
			if (aLongArray3720 != null)
				System.arraycopy(aLongArray3720, i + 1, aLongArray3720, i, 984431303 * anInt3719 - i);
			if (aStringArray3722 != null)
				System.arraycopy(aStringArray3722, i + 1, aStringArray3722, i, anInt3719 * 984431303 - i);
		}
	}

	void method4630(int i) {
		anInt3719 -= 772237047;
		if (anInt3719 * 984431303 == 0) {
			aLongArray3720 = null;
			aStringArray3722 = null;
		} else {
			if (aLongArray3720 != null)
				System.arraycopy(aLongArray3720, i + 1, aLongArray3720, i, 984431303 * anInt3719 - i);
			if (aStringArray3722 != null)
				System.arraycopy(aStringArray3722, i + 1, aStringArray3722, i, anInt3719 * 984431303 - i);
		}
	}

	boolean method4631(int i, String string, byte i_63_) {
		if (string == null)
			string = "";
		else if (string.length() > 80)
			string = string.substring(0, 80);
		if (null != aClass4_3714) {
			Class536 class536 = aClass4_3714.method556((long) i);
			if (class536 != null) {
				if (class536 instanceof Class536_Sub13) {
					Class536_Sub13 class536_sub13 = (Class536_Sub13) class536;
					if (class536_sub13.anObject10468 instanceof String) {
						if (string.equals(class536_sub13.anObject10468))
							return false;
						class536_sub13.method6484(-949847317);
						aClass4_3714.method560(new Class536_Sub13(string), (-6909195213925454795L * class536_sub13.aLong7133));
						return true;
					}
				}
				class536.method6484(1952794609);
			}
		} else
			aClass4_3714 = new Class4(4);
		aClass4_3714.method560(new Class536_Sub13(string), (long) i);
		return true;
	}

	boolean method4632(int i, int i_64_) {
		if (null != aClass4_3714) {
			Class536 class536 = aClass4_3714.method556((long) i);
			if (null != class536) {
				if (class536 instanceof Class536_Sub26) {
					Class536_Sub26 class536_sub26 = (Class536_Sub26) class536;
					if (class536_sub26.anInt10533 * 2083602213 == i_64_)
						return false;
					class536_sub26.anInt10533 = 1189135533 * i_64_;
					return true;
				}
				class536.method6484(1507967763);
			}
		} else
			aClass4_3714 = new Class4(4);
		aClass4_3714.method560(new Class536_Sub26(i_64_), (long) i);
		return true;
	}

	void method4633(int i) {
		if (i < 0 || i >= -1097649699 * anInt3710)
			throw new RuntimeException("");
		anInt3710 -= 2010033781;
		anIntArray3713 = null;
		if (anInt3710 * -1097649699 == 0) {
			aLongArray3711 = null;
			aStringArray3703 = null;
			aByteArray3712 = null;
			anIntArray3727 = null;
			anIntArray3721 = null;
			aBoolArray3716 = null;
			anInt3717 = -80708359;
			anInt3718 = 2003344807;
		} else {
			System.arraycopy(aByteArray3712, 1 + i, aByteArray3712, i, anInt3710 * -1097649699 - i);
			System.arraycopy(anIntArray3727, 1 + i, anIntArray3727, i, -1097649699 * anInt3710 - i);
			System.arraycopy(anIntArray3721, 1 + i, anIntArray3721, i, anInt3710 * -1097649699 - i);
			System.arraycopy(aBoolArray3716, 1 + i, aBoolArray3716, i, -1097649699 * anInt3710 - i);
			if (null != aLongArray3711)
				System.arraycopy(aLongArray3711, i + 1, aLongArray3711, i, anInt3710 * -1097649699 - i);
			if (aStringArray3703 != null)
				System.arraycopy(aStringArray3703, i + 1, aStringArray3703, i, -1097649699 * anInt3710 - i);
			method4621(1730063394);
		}
	}

	void method4634(RSByteBuffer class536_sub33) {
		int i = class536_sub33.readUnsignedByte();
		if (i < 1 || i > 6)
			throw new RuntimeException(new StringBuilder().append("").append(i).toString());
		int i_65_ = class536_sub33.readUnsignedByte();
		if (0 != (i_65_ & 0x1))
			aBool3699 = true;
		if (0 != (i_65_ & 0x2))
			aBool3700 = true;
		if (!aBool3699) {
			aLongArray3711 = null;
			aLongArray3720 = null;
		}
		if (!aBool3700) {
			aStringArray3703 = null;
			aStringArray3722 = null;
		}
		anInt3702 = class536_sub33.readInt() * -2076295007;
		anInt3705 = class536_sub33.readInt() * 1731525133;
		if (i <= 3 && 1101587653 * anInt3705 != 0)
			anInt3705 += 114369824;
		anInt3710 = class536_sub33.readUnsignedShort() * 2010033781;
		anInt3719 = class536_sub33.readUnsignedByte() * 772237047;
		aString3707 = class536_sub33.readString();
		if (i >= 4)
			class536_sub33.readInt();
		aBool3724 = class536_sub33.readUnsignedByte() == 1;
		aByte3706 = class536_sub33.readByte();
		aByte3698 = class536_sub33.readByte();
		aByte3708 = class536_sub33.readByte();
		aByte3704 = class536_sub33.readByte();
		if (-1097649699 * anInt3710 > 0) {
			if (aBool3699 && (null == aLongArray3711 || aLongArray3711.length < anInt3710 * -1097649699))
				aLongArray3711 = new long[-1097649699 * anInt3710];
			if (aBool3700 && (null == aStringArray3703 || aStringArray3703.length < anInt3710 * -1097649699))
				aStringArray3703 = new String[-1097649699 * anInt3710];
			if (aByteArray3712 == null || aByteArray3712.length < anInt3710 * -1097649699)
				aByteArray3712 = new byte[-1097649699 * anInt3710];
			if (anIntArray3727 == null || anIntArray3727.length < anInt3710 * -1097649699)
				anIntArray3727 = new int[anInt3710 * -1097649699];
			if (null == anIntArray3721 || anIntArray3721.length < -1097649699 * anInt3710)
				anIntArray3721 = new int[-1097649699 * anInt3710];
			if (null == aBoolArray3716 || aBoolArray3716.length < -1097649699 * anInt3710)
				aBoolArray3716 = new boolean[-1097649699 * anInt3710];
			for (int i_66_ = 0; i_66_ < anInt3710 * -1097649699; i_66_++) {
				if (aBool3699)
					aLongArray3711[i_66_] = class536_sub33.method9711(702869087);
				if (aBool3700)
					aStringArray3703[i_66_] = class536_sub33.method9713(16509697);
				aByteArray3712[i_66_] = class536_sub33.readByte();
				if (i >= 2)
					anIntArray3727[i_66_] = class536_sub33.readInt();
				if (i >= 5)
					anIntArray3721[i_66_] = class536_sub33.readUnsignedShort();
				else
					anIntArray3721[i_66_] = 0;
				if (i >= 6)
					aBoolArray3716[i_66_] = class536_sub33.readUnsignedByte() == 1;
				else
					aBoolArray3716[i_66_] = false;
			}
			method4621(1144918047);
		}
		if (984431303 * anInt3719 > 0) {
			if (aBool3699 && (aLongArray3720 == null || aLongArray3720.length < 984431303 * anInt3719))
				aLongArray3720 = new long[984431303 * anInt3719];
			if (aBool3700 && (null == aStringArray3722 || aStringArray3722.length < 984431303 * anInt3719))
				aStringArray3722 = new String[anInt3719 * 984431303];
			for (int i_67_ = 0; i_67_ < 984431303 * anInt3719; i_67_++) {
				if (aBool3699)
					aLongArray3720[i_67_] = class536_sub33.method9711(702869087);
				if (aBool3700)
					aStringArray3722[i_67_] = class536_sub33.method9713(16509697);
			}
		}
		if (i >= 3) {
			int i_68_ = class536_sub33.readUnsignedShort();
			if (i_68_ > 0) {
				aClass4_3714 = new Class4(i_68_ < 16 ? Class528.method6434(i_68_, -1684606451) : 16);
				while (i_68_-- > 0) {
					int i_69_ = class536_sub33.readInt();
					int i_70_ = i_69_ & 0x3fffffff;
					int i_71_ = i_69_ >>> 30;
					if (0 == i_71_) {
						int i_72_ = class536_sub33.readInt();
						aClass4_3714.method560(new Class536_Sub26(i_72_), (long) i_70_);
					} else if (i_71_ == 1) {
						long l = class536_sub33.method9711(702869087);
						aClass4_3714.method560(new Class536_Sub16(l), (long) i_70_);
					} else if (2 == i_71_) {
						String string = class536_sub33.readString();
						aClass4_3714.method560(new Class536_Sub13(string), (long) i_70_);
					}
				}
			}
		}
	}

	static final void method4635(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class656.method7944(class251, class668, -1110660808);
	}

	static final void method4636(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_73_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_74_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (Class39.aClass450_490.method5424(i_73_, 2063494658).anIntArray11760[i_74_]);
	}

	static final void method4637(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class453.method5447(class251, class234, class668, (byte) 112);
	}

	public static boolean method4638(String string, short i) {
		if (null == string)
			return false;
		for (int i_75_ = 0; i_75_ < 1857706641 * client.anInt11293; i_75_++) {
			Class30 class30 = client.aClass30Array11295[i_75_];
			if (string.equalsIgnoreCase(class30.aString263))
				return true;
			if (string.equalsIgnoreCase(class30.aString262))
				return true;
		}
		return false;
	}
}
