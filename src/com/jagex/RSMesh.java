/* Class180 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class RSMesh {
	public int[] anIntArray1946;
	public int anInt1947;
	public int[] anIntArray1948;
	public int anInt1949 = 12;
	public int[] anIntArray1950;
	public int anInt1951;
	public int[] anIntArray1952;
	public int[] anIntArray1953;
	public short[] aShortArray1954;
	public int[] anIntArray1955;
	public short[] aShortArray1956;
	public short[] aShortArray1957;
	public short[] aShortArray1958;
	public float[] aFloatArray1959;
	public float[] aFloatArray1960;
	public int anInt1961;
	public short[] aShortArray1962;
	int anInt1963;
	public short[] aShortArray1964;
	public byte[] aByteArray1965;
	public byte[] aByteArray1966;
	public byte[] aByteArray1967;
	public byte[] aByteArray1968;
	public byte[] aByteArray1969;
	public byte[] aByteArray1970;
	static final int anInt1971 = 26;
	public short[] aShortArray1972;
	static final int anInt1973 = 3;
	public int[] anIntArray1974;
	byte aByte1975;
	public short[] aShortArray1976;
	public static final short aShort1977 = -1;
	public int[] anIntArray1978;
	public short[] aShortArray1979;
	public byte[] aByteArray1980;
	public int[] anIntArray1981;
	public short[] aShortArray1982;
	int anInt1983;
	public short[] aShortArray1984;
	public int[] anIntArray1985;
	public int[] anIntArray1986;
	public static final short aShort1987 = 32766;
	public int[] anIntArray1988;
	static final int anInt1989 = 1;
	byte[] aByteArray1990;
	public byte[] aByteArray1991;
	public Class172[] aClass172Array1992;
	public Class156[] aClass156Array1993;
	public Class170[] aClass170Array1994;

	public RSMesh(byte[] is) {
		anInt1947 = 0;
		anInt1951 = 0;
		anInt1961 = 0;
		aByte1975 = (byte) 0;
		anInt1983 = 0;
		RSByteBuffer class536_sub33 = new RSByteBuffer(is);
		RSByteBuffer class536_sub33_0_ = new RSByteBuffer(is);
		RSByteBuffer class536_sub33_1_ = new RSByteBuffer(is);
		RSByteBuffer class536_sub33_2_ = new RSByteBuffer(is);
		RSByteBuffer class536_sub33_3_ = new RSByteBuffer(is);
		RSByteBuffer class536_sub33_4_ = new RSByteBuffer(is);
		RSByteBuffer class536_sub33_5_ = new RSByteBuffer(is);
		int i = class536_sub33.readUnsignedByte();
		if (i != 1)
			System.out.println(new StringBuilder().append("").append(i).toString());
		else {
			class536_sub33.readUnsignedByte();
			anInt1949 = class536_sub33.readUnsignedByte();
			class536_sub33.off = (is.length - 26) * 516175515;
			anInt1947 = class536_sub33.readUnsignedShort();
			anInt1961 = class536_sub33.readUnsignedShort();
			anInt1983 = class536_sub33.readUnsignedShort();
			int i_6_ = class536_sub33.readUnsignedByte();
			boolean bool = (i_6_ & 0x1) == 1;
			boolean bool_7_ = (i_6_ & 0x2) == 2;
			boolean bool_8_ = (i_6_ & 0x4) == 4;
			boolean bool_9_ = (i_6_ & 0x10) == 16;
			boolean bool_10_ = (i_6_ & 0x20) == 32;
			boolean bool_11_ = (i_6_ & 0x40) == 64;
			boolean bool_12_ = (i_6_ & 0x80) == 128;
			int i_13_ = class536_sub33.readUnsignedByte();
			int i_14_ = class536_sub33.readUnsignedByte();
			int i_15_ = class536_sub33.readUnsignedByte();
			int i_16_ = class536_sub33.readUnsignedByte();
			int i_17_ = class536_sub33.readUnsignedByte();
			int i_18_ = class536_sub33.readUnsignedShort();
			int i_19_ = class536_sub33.readUnsignedShort();
			int i_20_ = class536_sub33.readUnsignedShort();
			int i_21_ = class536_sub33.readUnsignedShort();
			int i_22_ = class536_sub33.readUnsignedShort();
			int i_23_ = class536_sub33.readUnsignedShort();
			int i_24_ = class536_sub33.readUnsignedShort();
			if (!bool_9_) {
				if (i_17_ == 1)
					i_23_ = anInt1947;
				else
					i_23_ = 0;
			}
			if (!bool_10_) {
				if (i_15_ == 1)
					i_24_ = anInt1961;
				else
					i_24_ = 0;
			}
			int i_25_ = 0;
			int i_26_ = 0;
			int i_27_ = 0;
			if (anInt1983 > 0) {
				aByteArray1980 = new byte[anInt1983];
				class536_sub33.off = 1548526545;
				for (int i_28_ = 0; i_28_ < anInt1983; i_28_++) {
					byte i_29_ = (aByteArray1980[i_28_] = class536_sub33.readByte());
					if (i_29_ == 0)
						i_25_++;
					if (i_29_ >= 1 && i_29_ <= 3)
						i_26_++;
					if (i_29_ == 2)
						i_27_++;
				}
			}
			int i_30_ = 3 + anInt1983;
			int i_31_ = i_30_;
			i_30_ += anInt1947;
			int i_32_ = i_30_;
			if (bool)
				i_30_ += anInt1961;
			int i_33_ = i_30_;
			i_30_ += anInt1961;
			int i_34_ = i_30_;
			if (i_13_ == 255)
				i_30_ += anInt1961;
			int i_35_ = i_30_;
			i_30_ += i_24_;
			int i_36_ = i_30_;
			i_30_ += i_23_;
			int i_37_ = i_30_;
			if (i_14_ == 1)
				i_30_ += anInt1961;
			int i_38_ = i_30_;
			i_30_ += i_21_;
			int i_39_ = i_30_;
			if (i_16_ == 1)
				i_30_ += anInt1961 * 2;
			int i_40_ = i_30_;
			i_30_ += i_22_;
			int i_41_ = i_30_;
			i_30_ += anInt1961 * 2;
			int i_42_ = i_30_;
			i_30_ += i_18_;
			int i_43_ = i_30_;
			i_30_ += i_19_;
			int i_44_ = i_30_;
			i_30_ += i_20_;
			int i_45_ = i_30_;
			i_30_ += i_25_ * 6;
			int i_46_ = i_30_;
			i_30_ += i_26_ * 6;
			int i_47_ = 6;
			if (anInt1949 == 14)
				i_47_ = 7;
			else if (anInt1949 >= 15)
				i_47_ = 9;
			int i_48_ = i_30_;
			i_30_ += i_26_ * i_47_;
			int i_49_ = i_30_;
			i_30_ += i_26_;
			int i_50_ = i_30_;
			i_30_ += i_26_;
			int i_51_ = i_30_;
			i_30_ += i_26_ + i_27_ * 2;
			int i_52_ = i_30_;
			int i_53_ = is.length;
			int i_54_ = is.length;
			int i_55_ = is.length;
			int i_56_ = is.length;
			if (bool_12_) {
				RSByteBuffer class536_sub33_57_ = new RSByteBuffer(is);
				class536_sub33_57_.off = (is.length - 26) * 516175515;
				class536_sub33_57_.off -= (is[class536_sub33_57_.off * -810172525 - 1] * 516175515);
				anInt1963 = class536_sub33_57_.readUnsignedShort();
				int i_58_ = class536_sub33_57_.readUnsignedShort();
				int i_59_ = class536_sub33_57_.readUnsignedShort();
				i_53_ = i_52_ + i_58_;
				i_54_ = i_53_ + i_59_;
				i_55_ = i_54_ + anInt1947;
				i_56_ = i_55_ + anInt1963 * 2;
			}
			anIntArray1952 = new int[anInt1947];
			anIntArray1981 = new int[anInt1947];
			anIntArray1978 = new int[anInt1947];
			aShortArray1962 = new short[anInt1961];
			aShortArray1979 = new short[anInt1961];
			aShortArray1964 = new short[anInt1961];
			if (i_17_ == 1)
				anIntArray1953 = new int[anInt1947];
			if (bool)
				aByteArray1968 = new byte[anInt1961];
			if (i_13_ == 255)
				aByteArray1969 = new byte[anInt1961];
			else
				aByte1975 = (byte) i_13_;
			if (i_14_ == 1)
				aByteArray1970 = new byte[anInt1961];
			if (i_15_ == 1)
				anIntArray1974 = new int[anInt1961];
			if (i_16_ == 1)
				aShortArray1957 = new short[anInt1961];
			if (i_16_ == 1 && (anInt1983 > 0 || anInt1963 > 0))
				aShortArray1982 = new short[anInt1961];
			aShortArray1972 = new short[anInt1961];
			if (anInt1983 > 0) {
				aShortArray1984 = new short[anInt1983];
				aShortArray1954 = new short[anInt1983];
				aShortArray1956 = new short[anInt1983];
				if (i_26_ > 0) {
					anIntArray1950 = new int[i_26_];
					anIntArray1985 = new int[i_26_];
					anIntArray1986 = new int[i_26_];
					aByteArray1990 = new byte[i_26_];
					aByteArray1991 = new byte[i_26_];
					anIntArray1946 = new int[i_26_];
				}
				if (i_27_ > 0) {
					anIntArray1988 = new int[i_27_];
					anIntArray1948 = new int[i_27_];
				}
			}
			class536_sub33.off = i_31_ * 516175515;
			class536_sub33_0_.off = i_42_ * 516175515;
			class536_sub33_1_.off = i_43_ * 516175515;
			class536_sub33_2_.off = i_44_ * 516175515;
			class536_sub33_3_.off = i_36_ * 516175515;
			int i_60_ = 0;
			int i_61_ = 0;
			int i_62_ = 0;
			for (int i_63_ = 0; i_63_ < anInt1947; i_63_++) {
				int i_64_ = class536_sub33.readUnsignedByte();
				int i_65_ = 0;
				if ((i_64_ & 0x1) != 0)
					i_65_ = class536_sub33_0_.method9717(820906235);
				int i_66_ = 0;
				if ((i_64_ & 0x2) != 0)
					i_66_ = class536_sub33_1_.method9717(2043186052);
				int i_67_ = 0;
				if ((i_64_ & 0x4) != 0)
					i_67_ = class536_sub33_2_.method9717(-1508152080);
				anIntArray1952[i_63_] = i_60_ + i_65_;
				anIntArray1981[i_63_] = i_61_ + i_66_;
				anIntArray1978[i_63_] = i_62_ + i_67_;
				i_60_ = anIntArray1952[i_63_];
				i_61_ = anIntArray1981[i_63_];
				i_62_ = anIntArray1978[i_63_];
				if (i_17_ == 1) {
					if (bool_9_)
						anIntArray1953[i_63_] = class536_sub33_3_.readSmart4();
					else {
						anIntArray1953[i_63_] = class536_sub33_3_.readUnsignedByte();
						if (anIntArray1953[i_63_] == 255)
							anIntArray1953[i_63_] = -1;
					}
				}
			}
			if (anInt1963 > 0) {
				class536_sub33.off = i_54_ * 516175515;
				class536_sub33_0_.off = i_55_ * 516175515;
				class536_sub33_1_.off = i_56_ * 516175515;
				anIntArray1955 = new int[anInt1947];
				int i_68_ = 0;
				int i_69_ = 0;
				for (/**/; i_68_ < anInt1947; i_68_++) {
					anIntArray1955[i_68_] = i_69_;
					i_69_ += class536_sub33.readUnsignedByte();
				}
				aByteArray1965 = new byte[anInt1961];
				aByteArray1966 = new byte[anInt1961];
				aByteArray1967 = new byte[anInt1961];
				aFloatArray1959 = new float[anInt1963];
				aFloatArray1960 = new float[anInt1963];
				for (i_68_ = 0; i_68_ < anInt1963; i_68_++) {
					aFloatArray1959[i_68_] = ((float) class536_sub33_0_.readShort() / 4096.0F);
					aFloatArray1960[i_68_] = ((float) class536_sub33_1_.readShort() / 4096.0F);
				}
			}
			class536_sub33.off = i_41_ * 516175515;
			class536_sub33_0_.off = i_32_ * 516175515;
			class536_sub33_1_.off = i_34_ * 516175515;
			class536_sub33_2_.off = i_37_ * 516175515;
			class536_sub33_3_.off = i_35_ * 516175515;
			class536_sub33_4_.off = i_39_ * 516175515;
			class536_sub33_5_.off = i_40_ * 516175515;
			for (int i_70_ = 0; i_70_ < anInt1961; i_70_++) {
				aShortArray1972[i_70_] = (short) class536_sub33.readUnsignedShort();
				if (bool)
					aByteArray1968[i_70_] = class536_sub33_0_.readByte();
				if (i_13_ == 255)
					aByteArray1969[i_70_] = class536_sub33_1_.readByte();
				if (i_14_ == 1)
					aByteArray1970[i_70_] = class536_sub33_2_.readByte();
				if (i_15_ == 1) {
					if (bool_10_)
						anIntArray1974[i_70_] = class536_sub33_3_.readSmart4();
					else {
						anIntArray1974[i_70_] = class536_sub33_3_.readUnsignedByte();
						if (anIntArray1974[i_70_] == 255)
							anIntArray1974[i_70_] = -1;
					}
				}
				if (i_16_ == 1)
					aShortArray1957[i_70_] = (short) (class536_sub33_4_.readUnsignedShort() - 1);
				if (aShortArray1982 != null) {
					if (aShortArray1957[i_70_] != -1) {
						if (anInt1949 >= 16)
							aShortArray1982[i_70_] = (short) (class536_sub33_5_.readUnsignedSmart() - 1);
						else
							aShortArray1982[i_70_] = (short) (class536_sub33_5_.readUnsignedByte() - 1);
					} else
						aShortArray1982[i_70_] = (short) -1;
				}
			}
			anInt1951 = -1;
			class536_sub33.off = i_38_ * 516175515;
			class536_sub33_0_.off = i_33_ * 516175515;
			class536_sub33_1_.off = i_53_ * 516175515;
			method2694(class536_sub33, class536_sub33_0_, class536_sub33_1_);
			class536_sub33.off = i_45_ * 516175515;
			class536_sub33_0_.off = i_46_ * 516175515;
			class536_sub33_1_.off = i_48_ * 516175515;
			class536_sub33_2_.off = i_49_ * 516175515;
			class536_sub33_3_.off = i_50_ * 516175515;
			class536_sub33_4_.off = i_51_ * 516175515;
			method2696(class536_sub33, class536_sub33_0_, class536_sub33_1_, class536_sub33_2_, class536_sub33_3_, class536_sub33_4_);
			class536_sub33.off = i_52_ * 516175515;
			if (bool_7_) {
				int i_71_ = class536_sub33.readUnsignedByte();
				if (i_71_ > 0) {
					aClass172Array1992 = new Class172[i_71_];
					for (int i_72_ = 0; i_72_ < i_71_; i_72_++) {
						int i_73_ = class536_sub33.readUnsignedShort();
						int i_74_ = class536_sub33.readUnsignedShort();
						byte i_75_;
						if (i_13_ == 255)
							i_75_ = aByteArray1969[i_74_];
						else
							i_75_ = (byte) i_13_;
						aClass172Array1992[i_72_] = new Class172(i_73_, i_74_, aShortArray1962[i_74_], aShortArray1979[i_74_], aShortArray1964[i_74_], i_75_);
					}
				}
				int i_76_ = class536_sub33.readUnsignedByte();
				if (i_76_ > 0) {
					aClass156Array1993 = new Class156[i_76_];
					for (int i_77_ = 0; i_77_ < i_76_; i_77_++) {
						int i_78_ = class536_sub33.readUnsignedShort();
						int i_79_ = class536_sub33.readUnsignedShort();
						aClass156Array1993[i_77_] = new Class156(i_78_, i_79_);
					}
				}
			}
			if (bool_8_) {
				int i_80_ = class536_sub33.readUnsignedByte();
				if (i_80_ > 0) {
					aClass170Array1994 = new Class170[i_80_];
					for (int i_81_ = 0; i_81_ < i_80_; i_81_++) {
						int i_82_ = class536_sub33.readUnsignedShort();
						int i_83_ = class536_sub33.readUnsignedShort();
						int i_84_;
						if (bool_11_)
							i_84_ = class536_sub33.readSmart4();
						else {
							i_84_ = class536_sub33.readUnsignedByte();
							if (i_84_ == 255)
								i_84_ = -1;
						}
						byte i_85_ = class536_sub33.readByte();
						aClass170Array1994[i_81_] = new Class170(i_82_, i_83_, i_84_, i_85_);
					}
				}
			}
		}
	}

	void method2694(RSByteBuffer class536_sub33, RSByteBuffer class536_sub33_86_, RSByteBuffer class536_sub33_87_) {
		short i = 0;
		short i_88_ = 0;
		short i_89_ = 0;
		int i_90_ = 0;
		for (int i_91_ = 0; i_91_ < anInt1961; i_91_++) {
			int i_92_ = class536_sub33_86_.readUnsignedByte();
			int i_93_ = i_92_ & 0x7;
			if (i_93_ == 1) {
				aShortArray1962[i_91_] = i = (short) (class536_sub33.method9717(-1668628526) + i_90_);
				i_90_ = i;
				aShortArray1979[i_91_] = i_88_ = (short) (class536_sub33.method9717(-908677916) + i_90_);
				i_90_ = i_88_;
				aShortArray1964[i_91_] = i_89_ = (short) (class536_sub33.method9717(1551894160) + i_90_);
				i_90_ = i_89_;
				if (i > anInt1951)
					anInt1951 = i;
				if (i_88_ > anInt1951)
					anInt1951 = i_88_;
				if (i_89_ > anInt1951)
					anInt1951 = i_89_;
			}
			if (i_93_ == 2) {
				i_88_ = i_89_;
				i_89_ = (short) (class536_sub33.method9717(-751055468) + i_90_);
				i_90_ = i_89_;
				aShortArray1962[i_91_] = i;
				aShortArray1979[i_91_] = i_88_;
				aShortArray1964[i_91_] = i_89_;
				if (i_89_ > anInt1951)
					anInt1951 = i_89_;
			}
			if (i_93_ == 3) {
				i = i_89_;
				i_89_ = (short) (class536_sub33.method9717(-1691112420) + i_90_);
				i_90_ = i_89_;
				aShortArray1962[i_91_] = i;
				aShortArray1979[i_91_] = i_88_;
				aShortArray1964[i_91_] = i_89_;
				if (i_89_ > anInt1951)
					anInt1951 = i_89_;
			}
			if (i_93_ == 4) {
				short i_94_ = i;
				i = i_88_;
				i_88_ = i_94_;
				i_89_ = (short) (class536_sub33.method9717(-1703493327) + i_90_);
				i_90_ = i_89_;
				aShortArray1962[i_91_] = i;
				aShortArray1979[i_91_] = i_88_;
				aShortArray1964[i_91_] = i_89_;
				if (i_89_ > anInt1951)
					anInt1951 = i_89_;
			}
			if (anInt1963 > 0 && (i_92_ & 0x8) != 0) {
				aByteArray1965[i_91_] = (byte) class536_sub33_87_.readUnsignedByte();
				aByteArray1966[i_91_] = (byte) class536_sub33_87_.readUnsignedByte();
				aByteArray1967[i_91_] = (byte) class536_sub33_87_.readUnsignedByte();
			}
		}
		anInt1951++;
	}

	public RSMesh(RSMesh[] class180s, int i) {
		anInt1947 = 0;
		anInt1951 = 0;
		anInt1961 = 0;
		aByte1975 = (byte) 0;
		anInt1983 = 0;
		anInt1947 = 0;
		anInt1961 = 0;
		anInt1983 = 0;
		anInt1963 = 0;
		int i_95_ = 0;
		int i_96_ = 0;
		int i_97_ = 0;
		boolean bool = false;
		boolean bool_98_ = false;
		boolean bool_99_ = false;
		boolean bool_100_ = false;
		boolean bool_101_ = false;
		boolean bool_102_ = false;
		aByte1975 = (byte) -1;
		for (int i_103_ = 0; i_103_ < i; i_103_++) {
			RSMesh class180_104_ = class180s[i_103_];
			if (class180_104_ != null) {
				anInt1947 += class180_104_.anInt1947;
				anInt1961 += class180_104_.anInt1961;
				anInt1983 += class180_104_.anInt1983;
				anInt1963 += class180_104_.anInt1963;
				if (class180_104_.aClass172Array1992 != null)
					i_95_ += class180_104_.aClass172Array1992.length;
				if (class180_104_.aClass156Array1993 != null)
					i_96_ += class180_104_.aClass156Array1993.length;
				if (class180_104_.aClass170Array1994 != null)
					i_97_ += class180_104_.aClass170Array1994.length;
				bool = bool | class180_104_.aByteArray1968 != null;
				if (class180_104_.aByteArray1969 != null)
					bool_98_ = true;
				else {
					if (aByte1975 == -1)
						aByte1975 = class180_104_.aByte1975;
					if (aByte1975 != class180_104_.aByte1975)
						bool_98_ = true;
				}
				bool_99_ = bool_99_ | class180_104_.aByteArray1970 != null;
				bool_100_ = bool_100_ | class180_104_.aShortArray1982 != null;
				bool_101_ = bool_101_ | class180_104_.aShortArray1957 != null;
				bool_102_ = bool_102_ | class180_104_.anIntArray1974 != null;
			}
		}
		anIntArray1952 = new int[anInt1947];
		anIntArray1981 = new int[anInt1947];
		anIntArray1978 = new int[anInt1947];
		anIntArray1953 = new int[anInt1947];
		aShortArray1958 = new short[anInt1947];
		aShortArray1962 = new short[anInt1961];
		aShortArray1979 = new short[anInt1961];
		aShortArray1964 = new short[anInt1961];
		if (bool)
			aByteArray1968 = new byte[anInt1961];
		if (bool_98_)
			aByteArray1969 = new byte[anInt1961];
		if (bool_99_)
			aByteArray1970 = new byte[anInt1961];
		if (bool_100_)
			aShortArray1982 = new short[anInt1961];
		aShortArray1972 = new short[anInt1961];
		if (bool_101_)
			aShortArray1957 = new short[anInt1961];
		if (bool_102_)
			anIntArray1974 = new int[anInt1961];
		aShortArray1976 = new short[anInt1961];
		if (anInt1983 > 0) {
			aByteArray1980 = new byte[anInt1983];
			aShortArray1984 = new short[anInt1983];
			aShortArray1954 = new short[anInt1983];
			aShortArray1956 = new short[anInt1983];
			anIntArray1950 = new int[anInt1983];
			anIntArray1985 = new int[anInt1983];
			anIntArray1986 = new int[anInt1983];
			aByteArray1990 = new byte[anInt1983];
			aByteArray1991 = new byte[anInt1983];
			anIntArray1946 = new int[anInt1983];
			anIntArray1988 = new int[anInt1983];
			anIntArray1948 = new int[anInt1983];
		}
		if (i_97_ > 0)
			aClass170Array1994 = new Class170[i_97_];
		if (i_95_ > 0)
			aClass172Array1992 = new Class172[i_95_];
		if (i_96_ > 0)
			aClass156Array1993 = new Class156[i_96_];
		if (anInt1963 > 0) {
			aFloatArray1959 = new float[anInt1963];
			aFloatArray1960 = new float[anInt1963];
			anIntArray1955 = new int[anInt1947];
			aByteArray1965 = new byte[anInt1961];
			aByteArray1966 = new byte[anInt1961];
			aByteArray1967 = new byte[anInt1961];
		}
		int[] is = new int[anInt1947];
		int[] is_105_ = new int[anInt1963];
		int[] is_106_ = new int[anInt1947];
		int[] is_107_ = new int[anInt1947];
		int[] is_108_ = new int[3];
		anInt1947 = 0;
		anInt1961 = 0;
		anInt1983 = 0;
		anInt1963 = 0;
		i_95_ = 0;
		i_96_ = 0;
		i_97_ = 0;
		for (int i_109_ = 0; i_109_ < i; i_109_++) {
			short i_110_ = (short) (1 << i_109_);
			RSMesh class180_111_ = class180s[i_109_];
			int i_112_ = anInt1961;
			if (class180_111_ != null) {
				boolean[] bools = new boolean[class180_111_.anInt1947];
				if (class180_111_.aClass170Array1994 != null) {
					for (int i_113_ = 0; i_113_ < class180_111_.aClass170Array1994.length; i_113_++) {
						Class170 class170 = class180_111_.aClass170Array1994[i_113_];
						aClass170Array1994[i_97_++] = class170.method2420((class170.anInt1892 * -479439647) + anInt1961, 1187493357);
					}
				}
				for (int i_114_ = 0; i_114_ < class180_111_.anInt1961; i_114_++) {
					is_108_[0] = class180_111_.aShortArray1962[i_114_];
					is_108_[1] = class180_111_.aShortArray1979[i_114_];
					is_108_[2] = class180_111_.aShortArray1964[i_114_];
					for (int i_115_ = 0; i_115_ < 3; i_115_++) {
						int i_116_ = is_108_[i_115_];
						int i_117_ = class180_111_.anIntArray1952[i_116_];
						int i_118_ = class180_111_.anIntArray1981[i_116_];
						int i_119_ = class180_111_.anIntArray1978[i_116_];
						int i_120_;
						for (i_120_ = 0; i_120_ < anInt1947; i_120_++) {
							if (i_117_ == anIntArray1952[i_120_] && i_118_ == anIntArray1981[i_120_] && i_119_ == anIntArray1978[i_120_]) {
								aShortArray1958[i_120_] |= i_110_;
								is_106_[i_116_] = i_120_;
								break;
							}
						}
						if (class180_111_.anInt1963 > 0 && !bools[i_116_]) {
							int i_121_ = ((i_116_ < class180_111_.anInt1947 - 1 ? class180_111_.anIntArray1955[i_116_ + 1] : class180_111_.anInt1963) - class180_111_.anIntArray1955[i_116_]);
							for (int i_122_ = 0; i_122_ < i_121_; i_122_++) {
								aFloatArray1959[anInt1963] = (class180_111_.aFloatArray1959[(class180_111_.anIntArray1955[i_116_] + i_122_)]);
								aFloatArray1960[anInt1963] = (class180_111_.aFloatArray1960[(class180_111_.anIntArray1955[i_116_] + i_122_)]);
								is_105_[anInt1963] = i_120_ << 16 | is[i_120_] + i_122_;
								anInt1963++;
							}
							is_107_[i_116_] = is[i_120_];
							is[i_120_] += i_121_;
							bools[i_116_] = true;
						}
						if (i_120_ >= anInt1947) {
							anIntArray1952[anInt1947] = i_117_;
							anIntArray1981[anInt1947] = i_118_;
							anIntArray1978[anInt1947] = i_119_;
							aShortArray1958[anInt1947] = i_110_;
							anIntArray1953[anInt1947] = (class180_111_.anIntArray1953 != null ? class180_111_.anIntArray1953[i_116_] : -1);
							is_106_[i_116_] = anInt1947;
							anInt1947++;
						}
					}
				}
				for (int i_123_ = 0; i_123_ < class180_111_.anInt1961; i_123_++) {
					if (bool && class180_111_.aByteArray1968 != null)
						aByteArray1968[anInt1961] = class180_111_.aByteArray1968[i_123_];
					if (bool_98_) {
						if (class180_111_.aByteArray1969 != null)
							aByteArray1969[anInt1961] = class180_111_.aByteArray1969[i_123_];
						else
							aByteArray1969[anInt1961] = class180_111_.aByte1975;
					}
					if (bool_99_ && class180_111_.aByteArray1970 != null)
						aByteArray1970[anInt1961] = class180_111_.aByteArray1970[i_123_];
					if (bool_101_) {
						if (class180_111_.aShortArray1957 != null)
							aShortArray1957[anInt1961] = class180_111_.aShortArray1957[i_123_];
						else
							aShortArray1957[anInt1961] = (short) -1;
					}
					if (bool_102_) {
						if (class180_111_.anIntArray1974 != null)
							anIntArray1974[anInt1961] = class180_111_.anIntArray1974[i_123_];
						else
							anIntArray1974[anInt1961] = -1;
					}
					if (class180_111_.anInt1963 > 0) {
						aByteArray1965[anInt1961] = (byte) (class180_111_.aByteArray1965[i_123_] + is_107_[(class180_111_.aShortArray1962[i_123_])]);
						aByteArray1966[anInt1961] = (byte) (class180_111_.aByteArray1966[i_123_] + is_107_[(class180_111_.aShortArray1979[i_123_])]);
						aByteArray1967[anInt1961] = (byte) (class180_111_.aByteArray1967[i_123_] + is_107_[(class180_111_.aShortArray1964[i_123_])]);
					}
					aShortArray1962[anInt1961] = (short) (is_106_[class180_111_.aShortArray1962[i_123_]]);
					aShortArray1979[anInt1961] = (short) (is_106_[class180_111_.aShortArray1979[i_123_]]);
					aShortArray1964[anInt1961] = (short) (is_106_[class180_111_.aShortArray1964[i_123_]]);
					aShortArray1976[anInt1961] = i_110_;
					aShortArray1972[anInt1961] = class180_111_.aShortArray1972[i_123_];
					anInt1961++;
				}
				if (class180_111_.aClass172Array1992 != null) {
					for (int i_124_ = 0; i_124_ < class180_111_.aClass172Array1992.length; i_124_++) {
						int i_125_ = is_106_[(class180_111_.aClass172Array1992[i_124_].anInt1909) * -1506968299];
						int i_126_ = is_106_[(class180_111_.aClass172Array1992[i_124_].anInt1916) * -1724466837];
						int i_127_ = is_106_[(class180_111_.aClass172Array1992[i_124_].anInt1911) * -767867943];
						aClass172Array1992[i_95_] = (class180_111_.aClass172Array1992[i_124_].method2431((class180_111_.aClass172Array1992[i_124_].anInt1908) * 1443923489 + i_112_, i_125_, i_126_, i_127_, (byte) -78));
						i_95_++;
					}
				}
				if (class180_111_.aClass156Array1993 != null) {
					for (int i_128_ = 0; i_128_ < class180_111_.aClass156Array1993.length; i_128_++) {
						int i_129_ = is_106_[(class180_111_.aClass156Array1993[i_128_].anInt1738) * -986127555];
						aClass156Array1993[i_96_] = class180_111_.aClass156Array1993[i_128_].method1881(i_129_, (byte) 83);
						i_96_++;
					}
				}
			}
		}
		anInt1951 = anInt1947;
		if (anInt1963 > 0) {
			Class236.method3342(is_105_, aFloatArray1959, aFloatArray1960, -541620436);
			int i_130_ = 0;
			int i_131_ = 0;
			for (/**/; i_130_ < anInt1947; i_130_++) {
				anIntArray1955[i_130_] = i_131_;
				i_131_ += is[i_130_];
			}
		}
		int i_132_ = 0;
		int i_133_ = 0;
		for (/**/; i_132_ < i; i_132_++) {
			short i_134_ = (short) (1 << i_132_);
			RSMesh class180_135_ = class180s[i_132_];
			if (class180_135_ != null) {
				if (bool_100_) {
					int i_136_ = 0;
					while (i_136_ < class180_135_.anInt1961) {
						aShortArray1982[i_133_] = (class180_135_.aShortArray1982 != null ? class180_135_.aShortArray1982[i_136_] : (short) -1);
						if (aShortArray1982[i_133_] > -1 && aShortArray1982[i_133_] < 32766)
							aShortArray1982[i_133_] = (short) (aShortArray1982[i_133_] + anInt1983);
						i_136_++;
						i_133_++;
					}
				}
				for (int i_137_ = 0; i_137_ < class180_135_.anInt1983; i_137_++) {
					byte i_138_ = (aByteArray1980[anInt1983] = class180_135_.aByteArray1980[i_137_]);
					if (i_138_ == 0) {
						aShortArray1984[anInt1983] = (short) method2695(class180_135_, (class180_135_.aShortArray1984[i_137_]), i_134_);
						aShortArray1954[anInt1983] = (short) method2695(class180_135_, (class180_135_.aShortArray1954[i_137_]), i_134_);
						aShortArray1956[anInt1983] = (short) method2695(class180_135_, (class180_135_.aShortArray1956[i_137_]), i_134_);
					} else if (i_138_ >= 1 && i_138_ <= 3) {
						aShortArray1984[anInt1983] = class180_135_.aShortArray1984[i_137_];
						aShortArray1954[anInt1983] = class180_135_.aShortArray1954[i_137_];
						aShortArray1956[anInt1983] = class180_135_.aShortArray1956[i_137_];
						anIntArray1950[anInt1983] = class180_135_.anIntArray1950[i_137_];
						anIntArray1985[anInt1983] = class180_135_.anIntArray1985[i_137_];
						anIntArray1986[anInt1983] = class180_135_.anIntArray1986[i_137_];
						aByteArray1990[anInt1983] = class180_135_.aByteArray1990[i_137_];
						aByteArray1991[anInt1983] = class180_135_.aByteArray1991[i_137_];
						anIntArray1946[anInt1983] = class180_135_.anIntArray1946[i_137_];
					} else if (i_138_ == 2) {
						anIntArray1988[anInt1983] = class180_135_.anIntArray1988[i_137_];
						anIntArray1948[anInt1983] = class180_135_.anIntArray1948[i_137_];
					}
					anInt1983++;
				}
			}
		}
	}

	final int method2695(RSMesh class180_139_, int i, short i_140_) {
		int i_141_ = class180_139_.anIntArray1952[i];
		int i_142_ = class180_139_.anIntArray1981[i];
		int i_143_ = class180_139_.anIntArray1978[i];
		for (int i_144_ = 0; i_144_ < anInt1947; i_144_++) {
			if (i_141_ == anIntArray1952[i_144_] && i_142_ == anIntArray1981[i_144_] && i_143_ == anIntArray1978[i_144_]) {
				aShortArray1958[i_144_] |= i_140_;
				return i_144_;
			}
		}
		anIntArray1952[anInt1947] = i_141_;
		anIntArray1981[anInt1947] = i_142_;
		anIntArray1978[anInt1947] = i_143_;
		aShortArray1958[anInt1947] = i_140_;
		anIntArray1953[anInt1947] = (class180_139_.anIntArray1953 != null ? class180_139_.anIntArray1953[i] : -1);
		return anInt1947++;
	}

	void method2696(RSByteBuffer class536_sub33, RSByteBuffer class536_sub33_145_, RSByteBuffer class536_sub33_146_, RSByteBuffer class536_sub33_147_, RSByteBuffer class536_sub33_148_, RSByteBuffer class536_sub33_149_) {
		for (int i = 0; i < anInt1983; i++) {
			int i_150_ = aByteArray1980[i] & 0xff;
			if (i_150_ == 0) {
				aShortArray1984[i] = (short) class536_sub33.readUnsignedShort();
				aShortArray1954[i] = (short) class536_sub33.readUnsignedShort();
				aShortArray1956[i] = (short) class536_sub33.readUnsignedShort();
			}
			if (i_150_ == 1) {
				aShortArray1984[i] = (short) class536_sub33_145_.readUnsignedShort();
				aShortArray1954[i] = (short) class536_sub33_145_.readUnsignedShort();
				aShortArray1956[i] = (short) class536_sub33_145_.readUnsignedShort();
				if (anInt1949 < 15) {
					anIntArray1950[i] = class536_sub33_146_.readUnsignedShort();
					if (anInt1949 < 14)
						anIntArray1985[i] = class536_sub33_146_.readUnsignedShort();
					else
						anIntArray1985[i] = class536_sub33_146_.read24BitUnsignedInteger();
					anIntArray1986[i] = class536_sub33_146_.readUnsignedShort();
				} else {
					anIntArray1950[i] = class536_sub33_146_.read24BitUnsignedInteger();
					anIntArray1985[i] = class536_sub33_146_.read24BitUnsignedInteger();
					anIntArray1986[i] = class536_sub33_146_.read24BitUnsignedInteger();
				}
				aByteArray1990[i] = class536_sub33_147_.readByte();
				aByteArray1991[i] = class536_sub33_148_.readByte();
				anIntArray1946[i] = class536_sub33_149_.readByte();
			}
			if (i_150_ == 2) {
				aShortArray1984[i] = (short) class536_sub33_145_.readUnsignedShort();
				aShortArray1954[i] = (short) class536_sub33_145_.readUnsignedShort();
				aShortArray1956[i] = (short) class536_sub33_145_.readUnsignedShort();
				if (anInt1949 < 15) {
					anIntArray1950[i] = class536_sub33_146_.readUnsignedShort();
					if (anInt1949 < 14)
						anIntArray1985[i] = class536_sub33_146_.readUnsignedShort();
					else
						anIntArray1985[i] = class536_sub33_146_.read24BitUnsignedInteger();
					anIntArray1986[i] = class536_sub33_146_.readUnsignedShort();
				} else {
					anIntArray1950[i] = class536_sub33_146_.read24BitUnsignedInteger();
					anIntArray1985[i] = class536_sub33_146_.read24BitUnsignedInteger();
					anIntArray1986[i] = class536_sub33_146_.read24BitUnsignedInteger();
				}
				aByteArray1990[i] = class536_sub33_147_.readByte();
				aByteArray1991[i] = class536_sub33_148_.readByte();
				anIntArray1946[i] = class536_sub33_149_.readByte();
				anIntArray1988[i] = class536_sub33_149_.readByte();
				anIntArray1948[i] = class536_sub33_149_.readByte();
			}
			if (i_150_ == 3) {
				aShortArray1984[i] = (short) class536_sub33_145_.readUnsignedShort();
				aShortArray1954[i] = (short) class536_sub33_145_.readUnsignedShort();
				aShortArray1956[i] = (short) class536_sub33_145_.readUnsignedShort();
				if (anInt1949 < 15) {
					anIntArray1950[i] = class536_sub33_146_.readUnsignedShort();
					if (anInt1949 < 14)
						anIntArray1985[i] = class536_sub33_146_.readUnsignedShort();
					else
						anIntArray1985[i] = class536_sub33_146_.read24BitUnsignedInteger();
					anIntArray1986[i] = class536_sub33_146_.readUnsignedShort();
				} else {
					anIntArray1950[i] = class536_sub33_146_.read24BitUnsignedInteger();
					anIntArray1985[i] = class536_sub33_146_.read24BitUnsignedInteger();
					anIntArray1986[i] = class536_sub33_146_.read24BitUnsignedInteger();
				}
				aByteArray1990[i] = class536_sub33_147_.readByte();
				aByteArray1991[i] = class536_sub33_148_.readByte();
				anIntArray1946[i] = class536_sub33_149_.readByte();
			}
		}
	}

	public int method2697(int i, int i_151_, int i_152_) {
		for (int i_153_ = 0; i_153_ < anInt1947; i_153_++) {
			if (anIntArray1952[i_153_] == i && anIntArray1981[i_153_] == i_151_ && anIntArray1978[i_153_] == i_152_)
				return i_153_;
		}
		anIntArray1952[anInt1947] = i;
		anIntArray1981[anInt1947] = i_151_;
		anIntArray1978[anInt1947] = i_152_;
		anInt1951 = anInt1947 + 1;
		return anInt1947++;
	}

	public void method2698(float f) {
		for (int i = 0; i < anInt1947; i++) {
			anIntArray1952[i] *= f;
			anIntArray1981[i] *= f;
			anIntArray1978[i] *= f;
		}
		if (anInt1983 > 0 && anIntArray1950 != null) {
			for (int i = 0; i < anIntArray1950.length; i++) {
				anIntArray1950[i] *= f;
				anIntArray1985[i] *= f;
				if (aByteArray1980[i] != 1)
					anIntArray1986[i] *= f;
			}
		}
	}

	public byte method2699(short i, short i_154_, short i_155_) {
		if (anInt1983 >= 255)
			throw new IllegalStateException();
		aByteArray1980[anInt1983] = (byte) 0;
		aShortArray1984[anInt1983] = i;
		aShortArray1954[anInt1983] = i_154_;
		aShortArray1956[anInt1983] = i_155_;
		return (byte) anInt1983++;
	}

	public RSMesh(int i, int i_156_, int i_157_) {
		anInt1947 = 0;
		anInt1951 = 0;
		anInt1961 = 0;
		aByte1975 = (byte) 0;
		anInt1983 = 0;
		anIntArray1952 = new int[i];
		anIntArray1981 = new int[i];
		anIntArray1978 = new int[i];
		anIntArray1953 = new int[i];
		aShortArray1962 = new short[i_156_];
		aShortArray1979 = new short[i_156_];
		aShortArray1964 = new short[i_156_];
		aByteArray1968 = new byte[i_156_];
		aByteArray1969 = new byte[i_156_];
		aByteArray1970 = new byte[i_156_];
		aShortArray1982 = new short[i_156_];
		aShortArray1972 = new short[i_156_];
		aShortArray1957 = new short[i_156_];
		anIntArray1974 = new int[i_156_];
		if (i_157_ > 0) {
			aByteArray1980 = new byte[i_157_];
			aShortArray1984 = new short[i_157_];
			aShortArray1954 = new short[i_157_];
			aShortArray1956 = new short[i_157_];
			anIntArray1950 = new int[i_157_];
			anIntArray1985 = new int[i_157_];
			anIntArray1986 = new int[i_157_];
			aByteArray1990 = new byte[i_157_];
			aByteArray1991 = new byte[i_157_];
			anIntArray1946 = new int[i_157_];
			anIntArray1988 = new int[i_157_];
			anIntArray1948 = new int[i_157_];
		}
	}

	public int method2700(int i, int i_158_, int i_159_) {
		for (int i_160_ = 0; i_160_ < anInt1947; i_160_++) {
			if (anIntArray1952[i_160_] == i && anIntArray1981[i_160_] == i_158_ && anIntArray1978[i_160_] == i_159_)
				return i_160_;
		}
		anIntArray1952[anInt1947] = i;
		anIntArray1981[anInt1947] = i_158_;
		anIntArray1978[anInt1947] = i_159_;
		anInt1951 = anInt1947 + 1;
		return anInt1947++;
	}

	public int[][] method2701() {
		int[] is = new int[256];
		int i = 0;
		for (int i_161_ = 0; i_161_ < anInt1961; i_161_++) {
			int i_162_ = anIntArray1974[i_161_];
			if (i_162_ >= 0) {
				is[i_162_]++;
				if (i_162_ > i)
					i = i_162_;
			}
		}
		int[][] is_163_ = new int[i + 1][];
		for (int i_164_ = 0; i_164_ <= i; i_164_++) {
			is_163_[i_164_] = new int[is[i_164_]];
			is[i_164_] = 0;
		}
		for (int i_165_ = 0; i_165_ < anInt1961; i_165_++) {
			int i_166_ = anIntArray1974[i_165_];
			if (i_166_ >= 0)
				is_163_[i_166_][is[i_166_]++] = i_165_;
		}
		return is_163_;
	}

	public int[][] method2702(boolean bool) {
		int[] is = new int[400];
		int i = 0;
		int i_167_ = bool ? anInt1947 : anInt1951;
		for (int i_168_ = 0; i_168_ < i_167_; i_168_++) {
			int i_169_ = anIntArray1953[i_168_];
			if (i_169_ >= 0) {
				is[i_169_]++;
				if (i_169_ > i)
					i = i_169_;
			}
		}
		int[][] is_170_ = new int[i + 1][];
		for (int i_171_ = 0; i_171_ <= i; i_171_++) {
			is_170_[i_171_] = new int[is[i_171_]];
			is[i_171_] = 0;
		}
		for (int i_172_ = 0; i_172_ < i_167_; i_172_++) {
			int i_173_ = anIntArray1953[i_172_];
			if (i_173_ >= 0)
				is_170_[i_173_][is[i_173_]++] = i_172_;
		}
		return is_170_;
	}

	public void recolor(short i, short i_174_) {
		for (int i_175_ = 0; i_175_ < anInt1961; i_175_++) {
			if (aShortArray1972[i_175_] == i)
				aShortArray1972[i_175_] = i_174_;
		}
	}

	public void retexture(short i, short i_176_) {
		if (aShortArray1957 != null) {
			for (int i_177_ = 0; i_177_ < anInt1961; i_177_++) {
				if (aShortArray1957[i_177_] == i)
					aShortArray1957[i_177_] = i_176_;
			}
		}
	}

	public void method2705(int i, int i_178_, int i_179_) {
		for (int i_180_ = 0; i_180_ < anInt1947; i_180_++) {
			anIntArray1952[i_180_] += i;
			anIntArray1981[i_180_] += i_178_;
			anIntArray1978[i_180_] += i_179_;
		}
	}

	public int method2706(int i, int i_181_, int i_182_, byte i_183_, byte i_184_, short i_185_, byte i_186_, short i_187_) {
		aShortArray1962[anInt1961] = (short) i;
		aShortArray1979[anInt1961] = (short) i_181_;
		aShortArray1964[anInt1961] = (short) i_182_;
		aByteArray1968[anInt1961] = i_183_;
		aShortArray1982[anInt1961] = (short) i_184_;
		aShortArray1972[anInt1961] = i_185_;
		aByteArray1970[anInt1961] = i_186_;
		aShortArray1957[anInt1961] = i_187_;
		return anInt1961++;
	}

	public void upscale(int i) {
		for (int i_188_ = 0; i_188_ < anInt1947; i_188_++) {
			anIntArray1952[i_188_] <<= i;
			anIntArray1981[i_188_] <<= i;
			anIntArray1978[i_188_] <<= i;
		}
		if (anInt1983 > 0 && anIntArray1950 != null) {
			for (int i_189_ = 0; i_189_ < anIntArray1950.length; i_189_++) {
				anIntArray1950[i_189_] <<= i;
				anIntArray1985[i_189_] <<= i;
				if (aByteArray1980[i_189_] != 1)
					anIntArray1986[i_189_] <<= i;
			}
		}
	}

	public static RSMesh decodeMesh(JS5ResourceProvider class461, int i, int i_190_) {
		byte[] is = class461.method5556(i, i_190_, (byte) 1);
		if (is == null)
			return null;
		return new RSMesh(is);
	}

	public int method2709(int i, int i_191_, int i_192_) {
		for (int i_193_ = 0; i_193_ < anInt1947; i_193_++) {
			if (anIntArray1952[i_193_] == i && anIntArray1981[i_193_] == i_191_ && anIntArray1978[i_193_] == i_192_)
				return i_193_;
		}
		anIntArray1952[anInt1947] = i;
		anIntArray1981[anInt1947] = i_191_;
		anIntArray1978[anInt1947] = i_192_;
		anInt1951 = anInt1947 + 1;
		return anInt1947++;
	}

	public int[][] method2710() {
		int[] is = new int[256];
		int i = 0;
		for (int i_194_ = 0; i_194_ < aClass170Array1994.length; i_194_++) {
			int i_195_ = aClass170Array1994[i_194_].anInt1891 * 216922085;
			if (i_195_ >= 0) {
				is[i_195_]++;
				if (i_195_ > i)
					i = i_195_;
			}
		}
		int[][] is_196_ = new int[i + 1][];
		for (int i_197_ = 0; i_197_ <= i; i_197_++) {
			is_196_[i_197_] = new int[is[i_197_]];
			is[i_197_] = 0;
		}
		for (int i_198_ = 0; i_198_ < aClass170Array1994.length; i_198_++) {
			int i_199_ = aClass170Array1994[i_198_].anInt1891 * 216922085;
			if (i_199_ >= 0)
				is_196_[i_199_][is[i_199_]++] = i_198_;
		}
		return is_196_;
	}

	public void method2711(int i, int i_200_, int i_201_) {
		if (i_201_ != 0) {
			int i_202_ = Class447.anIntArray4906[i_201_];
			int i_203_ = Class447.anIntArray4921[i_201_];
			for (int i_204_ = 0; i_204_ < anInt1947; i_204_++) {
				int i_205_ = ((anIntArray1981[i_204_] * i_202_ + anIntArray1952[i_204_] * i_203_) >> 14);
				anIntArray1981[i_204_] = (anIntArray1981[i_204_] * i_203_ - anIntArray1952[i_204_] * i_202_) >> 14;
				anIntArray1952[i_204_] = i_205_;
			}
		}
		if (i != 0) {
			int i_206_ = Class447.anIntArray4906[i];
			int i_207_ = Class447.anIntArray4921[i];
			for (int i_208_ = 0; i_208_ < anInt1947; i_208_++) {
				int i_209_ = ((anIntArray1981[i_208_] * i_207_ - anIntArray1978[i_208_] * i_206_) >> 14);
				anIntArray1978[i_208_] = (anIntArray1981[i_208_] * i_206_ + anIntArray1978[i_208_] * i_207_) >> 14;
				anIntArray1981[i_208_] = i_209_;
			}
		}
		if (i_200_ != 0) {
			int i_210_ = Class447.anIntArray4906[i_200_];
			int i_211_ = Class447.anIntArray4921[i_200_];
			for (int i_212_ = 0; i_212_ < anInt1947; i_212_++) {
				int i_213_ = ((anIntArray1978[i_212_] * i_210_ + anIntArray1952[i_212_] * i_211_) >> 14);
				anIntArray1978[i_212_] = (anIntArray1978[i_212_] * i_211_ - anIntArray1952[i_212_] * i_210_) >> 14;
				anIntArray1952[i_212_] = i_213_;
			}
		}
	}

	public byte method2712(short i, short i_214_, short i_215_, short i_216_, short i_217_, short i_218_, byte i_219_, byte i_220_, byte i_221_) {
		if (anInt1983 >= 255)
			throw new IllegalStateException();
		aByteArray1980[anInt1983] = (byte) 3;
		aShortArray1984[anInt1983] = i;
		aShortArray1954[anInt1983] = i_214_;
		aShortArray1956[anInt1983] = i_215_;
		anIntArray1950[anInt1983] = i_216_;
		anIntArray1985[anInt1983] = i_217_;
		anIntArray1986[anInt1983] = i_218_;
		aByteArray1990[anInt1983] = i_219_;
		aByteArray1991[anInt1983] = i_220_;
		anIntArray1946[anInt1983] = i_221_;
		return (byte) anInt1983++;
	}

	public void method2713(int i, int i_222_, int i_223_) {
		for (int i_224_ = 0; i_224_ < anInt1947; i_224_++) {
			anIntArray1952[i_224_] += i;
			anIntArray1981[i_224_] += i_222_;
			anIntArray1978[i_224_] += i_223_;
		}
	}

	public void method2714(int i, int i_225_, int i_226_) {
		if (i_226_ != 0) {
			int i_227_ = Class447.anIntArray4906[i_226_];
			int i_228_ = Class447.anIntArray4921[i_226_];
			for (int i_229_ = 0; i_229_ < anInt1947; i_229_++) {
				int i_230_ = ((anIntArray1981[i_229_] * i_227_ + anIntArray1952[i_229_] * i_228_) >> 14);
				anIntArray1981[i_229_] = (anIntArray1981[i_229_] * i_228_ - anIntArray1952[i_229_] * i_227_) >> 14;
				anIntArray1952[i_229_] = i_230_;
			}
		}
		if (i != 0) {
			int i_231_ = Class447.anIntArray4906[i];
			int i_232_ = Class447.anIntArray4921[i];
			for (int i_233_ = 0; i_233_ < anInt1947; i_233_++) {
				int i_234_ = ((anIntArray1981[i_233_] * i_232_ - anIntArray1978[i_233_] * i_231_) >> 14);
				anIntArray1978[i_233_] = (anIntArray1981[i_233_] * i_231_ + anIntArray1978[i_233_] * i_232_) >> 14;
				anIntArray1981[i_233_] = i_234_;
			}
		}
		if (i_225_ != 0) {
			int i_235_ = Class447.anIntArray4906[i_225_];
			int i_236_ = Class447.anIntArray4921[i_225_];
			for (int i_237_ = 0; i_237_ < anInt1947; i_237_++) {
				int i_238_ = ((anIntArray1978[i_237_] * i_235_ + anIntArray1952[i_237_] * i_236_) >> 14);
				anIntArray1978[i_237_] = (anIntArray1978[i_237_] * i_236_ - anIntArray1952[i_237_] * i_235_) >> 14;
				anIntArray1952[i_237_] = i_238_;
			}
		}
	}

	public void method2715(int i, int i_239_, int i_240_) {
		if (i_240_ != 0) {
			int i_241_ = Class447.anIntArray4906[i_240_];
			int i_242_ = Class447.anIntArray4921[i_240_];
			for (int i_243_ = 0; i_243_ < anInt1947; i_243_++) {
				int i_244_ = ((anIntArray1981[i_243_] * i_241_ + anIntArray1952[i_243_] * i_242_) >> 14);
				anIntArray1981[i_243_] = (anIntArray1981[i_243_] * i_242_ - anIntArray1952[i_243_] * i_241_) >> 14;
				anIntArray1952[i_243_] = i_244_;
			}
		}
		if (i != 0) {
			int i_245_ = Class447.anIntArray4906[i];
			int i_246_ = Class447.anIntArray4921[i];
			for (int i_247_ = 0; i_247_ < anInt1947; i_247_++) {
				int i_248_ = ((anIntArray1981[i_247_] * i_246_ - anIntArray1978[i_247_] * i_245_) >> 14);
				anIntArray1978[i_247_] = (anIntArray1981[i_247_] * i_245_ + anIntArray1978[i_247_] * i_246_) >> 14;
				anIntArray1981[i_247_] = i_248_;
			}
		}
		if (i_239_ != 0) {
			int i_249_ = Class447.anIntArray4906[i_239_];
			int i_250_ = Class447.anIntArray4921[i_239_];
			for (int i_251_ = 0; i_251_ < anInt1947; i_251_++) {
				int i_252_ = ((anIntArray1978[i_251_] * i_249_ + anIntArray1952[i_251_] * i_250_) >> 14);
				anIntArray1978[i_251_] = (anIntArray1978[i_251_] * i_250_ - anIntArray1952[i_251_] * i_249_) >> 14;
				anIntArray1952[i_251_] = i_252_;
			}
		}
	}

	public void method2716(int i) {
		for (int i_253_ = 0; i_253_ < anInt1947; i_253_++) {
			anIntArray1952[i_253_] <<= i;
			anIntArray1981[i_253_] <<= i;
			anIntArray1978[i_253_] <<= i;
		}
		if (anInt1983 > 0 && anIntArray1950 != null) {
			for (int i_254_ = 0; i_254_ < anIntArray1950.length; i_254_++) {
				anIntArray1950[i_254_] <<= i;
				anIntArray1985[i_254_] <<= i;
				if (aByteArray1980[i_254_] != 1)
					anIntArray1986[i_254_] <<= i;
			}
		}
	}
}
