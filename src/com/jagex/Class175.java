/* Class175 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class175 {
	public int[] anIntArray1902;
	static final int anInt1903 = 26;
	static final int anInt1904 = 1;
	public int anInt1905 = 12;
	public int anInt1906 = 0;
	public byte[] aByteArray1907;
	public int[] anIntArray1908;
	public int[] anIntArray1909;
	public int[] anIntArray1910;
	public int[] anIntArray1911;
	public int anInt1912 = 0;
	public short[] aShortArray1913;
	public int[] anIntArray1914;
	public float[] aFloatArray1915;
	int anInt1916;
	public int anInt1917 = 0;
	public short[] aShortArray1918;
	static final int anInt1919 = 3;
	public short[] aShortArray1920;
	public int[] anIntArray1921;
	byte aByte1922 = 0;
	public byte[] aByteArray1923;
	public byte[] aByteArray1924;
	public Class159[] aClass159Array1925;
	int anInt1926 = 0;
	public short[] aShortArray1927;
	public byte[] aByteArray1928;
	public short[] aShortArray1929;
	public int[] anIntArray1930;
	public float[] aFloatArray1931;
	public byte[] aByteArray1932;
	public static final short aShort1933 = -1;
	public static final short aShort1934 = 32766;
	public short[] aShortArray1935;
	public byte[] aByteArray1936;
	public short[] aShortArray1937;
	public short[] aShortArray1938;
	public short[] aShortArray1939;
	public short[] aShortArray1940;
	public int[] anIntArray1941;
	public short[] aShortArray1942;
	public int[] anIntArray1943;
	public byte[] aByteArray1944;
	public int[] anIntArray1945;
	byte[] aByteArray1946;
	public Class183[] aClass183Array1947;
	public Class167[] aClass167Array1948;
	public byte[] aByteArray1949;
	public int[] anIntArray1950;

	void method2798(RSByteBuffer class527_sub38, RSByteBuffer class527_sub38_0_, RSByteBuffer class527_sub38_1_) {
		short i = 0;
		short i_2_ = 0;
		short i_3_ = 0;
		int i_4_ = 0;
		for (int i_5_ = 0; i_5_ < anInt1917; i_5_++) {
			int i_6_ = class527_sub38_0_.readUnsignedByte();
			int i_7_ = i_6_ & 0x7;
			if (i_7_ == 1) {
				aShortArray1918[i_5_] = i = (short) (class527_sub38.readSmartVariant(983912765) + i_4_);
				i_4_ = i;
				aShortArray1940[i_5_] = i_2_ = (short) (class527_sub38.readSmartVariant(983912765) + i_4_);
				i_4_ = i_2_;
				aShortArray1920[i_5_] = i_3_ = (short) (class527_sub38.readSmartVariant(983912765) + i_4_);
				i_4_ = i_3_;
				if (i > anInt1912)
					anInt1912 = i;
				if (i_2_ > anInt1912)
					anInt1912 = i_2_;
				if (i_3_ > anInt1912)
					anInt1912 = i_3_;
			}
			if (i_7_ == 2) {
				i_2_ = i_3_;
				i_3_ = (short) (class527_sub38.readSmartVariant(983912765) + i_4_);
				i_4_ = i_3_;
				aShortArray1918[i_5_] = i;
				aShortArray1940[i_5_] = i_2_;
				aShortArray1920[i_5_] = i_3_;
				if (i_3_ > anInt1912)
					anInt1912 = i_3_;
			}
			if (i_7_ == 3) {
				i = i_3_;
				i_3_ = (short) (class527_sub38.readSmartVariant(983912765) + i_4_);
				i_4_ = i_3_;
				aShortArray1918[i_5_] = i;
				aShortArray1940[i_5_] = i_2_;
				aShortArray1920[i_5_] = i_3_;
				if (i_3_ > anInt1912)
					anInt1912 = i_3_;
			}
			if (i_7_ == 4) {
				short i_8_ = i;
				i = i_2_;
				i_2_ = i_8_;
				i_3_ = (short) (class527_sub38.readSmartVariant(983912765) + i_4_);
				i_4_ = i_3_;
				aShortArray1918[i_5_] = i;
				aShortArray1940[i_5_] = i_2_;
				aShortArray1920[i_5_] = i_3_;
				if (i_3_ > anInt1912)
					anInt1912 = i_3_;
			}
			if (anInt1916 > 0 && (i_6_ & 0x8) != 0) {
				aByteArray1944[i_5_] = (byte) class527_sub38_1_.readUnsignedByte();
				aByteArray1949[i_5_] = (byte) class527_sub38_1_.readUnsignedByte();
				aByteArray1923[i_5_] = (byte) class527_sub38_1_.readUnsignedByte();
			}
		}
		anInt1912++;
	}

	public Class175(byte[] is) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(is);
		RSByteBuffer class527_sub38_9_ = new RSByteBuffer(is);
		RSByteBuffer class527_sub38_10_ = new RSByteBuffer(is);
		RSByteBuffer class527_sub38_11_ = new RSByteBuffer(is);
		RSByteBuffer class527_sub38_12_ = new RSByteBuffer(is);
		RSByteBuffer class527_sub38_13_ = new RSByteBuffer(is);
		RSByteBuffer class527_sub38_14_ = new RSByteBuffer(is);
		int i = class527_sub38.readUnsignedByte();
		if (i != 1)
			System.out.println(new StringBuilder().append("").append(i).toString());
		else {
			class527_sub38.readUnsignedByte();
			anInt1905 = class527_sub38.readUnsignedByte();
			class527_sub38.anInt10689 = (is.length - 26) * 1474750881;
			anInt1906 = class527_sub38.readUnsignedShort();
			anInt1917 = class527_sub38.readUnsignedShort();
			anInt1926 = class527_sub38.readUnsignedShort();
			int i_15_ = class527_sub38.readUnsignedByte();
			boolean bool = (i_15_ & 0x1) == 1;
			boolean bool_16_ = (i_15_ & 0x2) == 2;
			boolean bool_17_ = (i_15_ & 0x4) == 4;
			boolean bool_18_ = (i_15_ & 0x10) == 16;
			boolean bool_19_ = (i_15_ & 0x20) == 32;
			boolean bool_20_ = (i_15_ & 0x40) == 64;
			boolean bool_21_ = (i_15_ & 0x80) == 128;
			int i_22_ = class527_sub38.readUnsignedByte();
			int i_23_ = class527_sub38.readUnsignedByte();
			int i_24_ = class527_sub38.readUnsignedByte();
			int i_25_ = class527_sub38.readUnsignedByte();
			int i_26_ = class527_sub38.readUnsignedByte();
			int i_27_ = class527_sub38.readUnsignedShort();
			int i_28_ = class527_sub38.readUnsignedShort();
			int i_29_ = class527_sub38.readUnsignedShort();
			int i_30_ = class527_sub38.readUnsignedShort();
			int i_31_ = class527_sub38.readUnsignedShort();
			int i_32_ = class527_sub38.readUnsignedShort();
			int i_33_ = class527_sub38.readUnsignedShort();
			if (!bool_18_) {
				if (i_26_ == 1)
					i_32_ = anInt1906;
				else
					i_32_ = 0;
			}
			if (!bool_19_) {
				if (i_24_ == 1)
					i_33_ = anInt1917;
				else
					i_33_ = 0;
			}
			int i_34_ = 0;
			int i_35_ = 0;
			int i_36_ = 0;
			if (anInt1926 > 0) {
				aByteArray1936 = new byte[anInt1926];
				class527_sub38.anInt10689 = 129285347;
				for (int i_37_ = 0; i_37_ < anInt1926; i_37_++) {
					byte i_38_ = (aByteArray1936[i_37_] = class527_sub38.readByte());
					if (i_38_ == 0)
						i_34_++;
					if (i_38_ >= 1 && i_38_ <= 3)
						i_35_++;
					if (i_38_ == 2)
						i_36_++;
				}
			}
			int i_39_ = 3 + anInt1926;
			int i_40_ = i_39_;
			i_39_ += anInt1906;
			int i_41_ = i_39_;
			if (bool)
				i_39_ += anInt1917;
			int i_42_ = i_39_;
			i_39_ += anInt1917;
			int i_43_ = i_39_;
			if (i_22_ == 255)
				i_39_ += anInt1917;
			int i_44_ = i_39_;
			i_39_ += i_33_;
			int i_45_ = i_39_;
			i_39_ += i_32_;
			int i_46_ = i_39_;
			if (i_23_ == 1)
				i_39_ += anInt1917;
			int i_47_ = i_39_;
			i_39_ += i_30_;
			int i_48_ = i_39_;
			if (i_25_ == 1)
				i_39_ += anInt1917 * 2;
			int i_49_ = i_39_;
			i_39_ += i_31_;
			int i_50_ = i_39_;
			i_39_ += anInt1917 * 2;
			int i_51_ = i_39_;
			i_39_ += i_27_;
			int i_52_ = i_39_;
			i_39_ += i_28_;
			int i_53_ = i_39_;
			i_39_ += i_29_;
			int i_54_ = i_39_;
			i_39_ += i_34_ * 6;
			int i_55_ = i_39_;
			i_39_ += i_35_ * 6;
			int i_56_ = 6;
			if (anInt1905 == 14)
				i_56_ = 7;
			else if (anInt1905 >= 15)
				i_56_ = 9;
			int i_57_ = i_39_;
			i_39_ += i_35_ * i_56_;
			int i_58_ = i_39_;
			i_39_ += i_35_;
			int i_59_ = i_39_;
			i_39_ += i_35_;
			int i_60_ = i_39_;
			i_39_ += i_35_ + i_36_ * 2;
			int i_61_ = i_39_;
			int i_62_ = is.length;
			int i_63_ = is.length;
			int i_64_ = is.length;
			int i_65_ = is.length;
			if (bool_21_) {
				RSByteBuffer class527_sub38_66_ = new RSByteBuffer(is);
				class527_sub38_66_.anInt10689 = (is.length - 26) * 1474750881;
				class527_sub38_66_.anInt10689 -= (is[class527_sub38_66_.anInt10689 * -441238943 - 1] * 1474750881);
				anInt1916 = class527_sub38_66_.readUnsignedShort();
				int i_67_ = class527_sub38_66_.readUnsignedShort();
				int i_68_ = class527_sub38_66_.readUnsignedShort();
				i_62_ = i_61_ + i_67_;
				i_63_ = i_62_ + i_68_;
				i_64_ = i_63_ + anInt1906;
				i_65_ = i_64_ + anInt1916 * 2;
			}
			anIntArray1908 = new int[anInt1906];
			anIntArray1909 = new int[anInt1906];
			anIntArray1910 = new int[anInt1906];
			aShortArray1918 = new short[anInt1917];
			aShortArray1940 = new short[anInt1917];
			aShortArray1920 = new short[anInt1917];
			if (i_26_ == 1)
				anIntArray1921 = new int[anInt1906];
			if (bool)
				aByteArray1928 = new byte[anInt1917];
			if (i_22_ == 255)
				aByteArray1924 = new byte[anInt1917];
			else
				aByte1922 = (byte) i_22_;
			if (i_23_ == 1)
				aByteArray1907 = new byte[anInt1917];
			if (i_24_ == 1)
				anIntArray1914 = new int[anInt1917];
			if (i_25_ == 1)
				aShortArray1929 = new short[anInt1917];
			if (i_25_ == 1 && (anInt1926 > 0 || anInt1916 > 0))
				aShortArray1927 = new short[anInt1917];
			aShortArray1942 = new short[anInt1917];
			if (anInt1926 > 0) {
				aShortArray1937 = new short[anInt1926];
				aShortArray1938 = new short[anInt1926];
				aShortArray1939 = new short[anInt1926];
				if (i_35_ > 0) {
					anIntArray1930 = new int[i_35_];
					anIntArray1941 = new int[i_35_];
					anIntArray1943 = new int[i_35_];
					aByteArray1946 = new byte[i_35_];
					aByteArray1932 = new byte[i_35_];
					anIntArray1902 = new int[i_35_];
				}
				if (i_36_ > 0) {
					anIntArray1950 = new int[i_36_];
					anIntArray1945 = new int[i_36_];
				}
			}
			class527_sub38.anInt10689 = i_40_ * 1474750881;
			class527_sub38_9_.anInt10689 = i_51_ * 1474750881;
			class527_sub38_10_.anInt10689 = i_52_ * 1474750881;
			class527_sub38_11_.anInt10689 = i_53_ * 1474750881;
			class527_sub38_12_.anInt10689 = i_45_ * 1474750881;
			int i_69_ = 0;
			int i_70_ = 0;
			int i_71_ = 0;
			for (int i_72_ = 0; i_72_ < anInt1906; i_72_++) {
				int i_73_ = class527_sub38.readUnsignedByte();
				int i_74_ = 0;
				if ((i_73_ & 0x1) != 0)
					i_74_ = class527_sub38_9_.readSmartVariant(983912765);
				int i_75_ = 0;
				if ((i_73_ & 0x2) != 0)
					i_75_ = class527_sub38_10_.readSmartVariant(983912765);
				int i_76_ = 0;
				if ((i_73_ & 0x4) != 0)
					i_76_ = class527_sub38_11_.readSmartVariant(983912765);
				anIntArray1908[i_72_] = i_69_ + i_74_;
				anIntArray1909[i_72_] = i_70_ + i_75_;
				anIntArray1910[i_72_] = i_71_ + i_76_;
				i_69_ = anIntArray1908[i_72_];
				i_70_ = anIntArray1909[i_72_];
				i_71_ = anIntArray1910[i_72_];
				if (i_26_ == 1) {
					if (bool_18_)
						anIntArray1921[i_72_] = class527_sub38_12_.method16606(2104728346);
					else {
						anIntArray1921[i_72_] = class527_sub38_12_.readUnsignedByte();
						if (anIntArray1921[i_72_] == 255)
							anIntArray1921[i_72_] = -1;
					}
				}
			}
			if (anInt1916 > 0) {
				class527_sub38.anInt10689 = i_63_ * 1474750881;
				class527_sub38_9_.anInt10689 = i_64_ * 1474750881;
				class527_sub38_10_.anInt10689 = i_65_ * 1474750881;
				anIntArray1911 = new int[anInt1906];
				int i_77_ = 0;
				int i_78_ = 0;
				for (/**/; i_77_ < anInt1906; i_77_++) {
					anIntArray1911[i_77_] = i_78_;
					i_78_ += class527_sub38.readUnsignedByte();
				}
				aByteArray1944 = new byte[anInt1917];
				aByteArray1949 = new byte[anInt1917];
				aByteArray1923 = new byte[anInt1917];
				aFloatArray1915 = new float[anInt1916];
				aFloatArray1931 = new float[anInt1916];
				for (i_77_ = 0; i_77_ < anInt1916; i_77_++) {
					aFloatArray1915[i_77_] = ((float) class527_sub38_9_.readShort() / 4096.0F);
					aFloatArray1931[i_77_] = ((float) class527_sub38_10_.readShort() / 4096.0F);
				}
			}
			class527_sub38.anInt10689 = i_50_ * 1474750881;
			class527_sub38_9_.anInt10689 = i_41_ * 1474750881;
			class527_sub38_10_.anInt10689 = i_43_ * 1474750881;
			class527_sub38_11_.anInt10689 = i_46_ * 1474750881;
			class527_sub38_12_.anInt10689 = i_44_ * 1474750881;
			class527_sub38_13_.anInt10689 = i_48_ * 1474750881;
			class527_sub38_14_.anInt10689 = i_49_ * 1474750881;
			for (int i_79_ = 0; i_79_ < anInt1917; i_79_++) {
				aShortArray1942[i_79_] = (short) class527_sub38.readUnsignedShort();
				if (bool)
					aByteArray1928[i_79_] = class527_sub38_9_.readByte();
				if (i_22_ == 255)
					aByteArray1924[i_79_] = class527_sub38_10_.readByte();
				if (i_23_ == 1)
					aByteArray1907[i_79_] = class527_sub38_11_.readByte();
				if (i_24_ == 1) {
					if (bool_19_)
						anIntArray1914[i_79_] = class527_sub38_12_.method16606(1036567297);
					else {
						anIntArray1914[i_79_] = class527_sub38_12_.readUnsignedByte();
						if (anIntArray1914[i_79_] == 255)
							anIntArray1914[i_79_] = -1;
					}
				}
				if (i_25_ == 1)
					aShortArray1929[i_79_] = (short) (class527_sub38_13_.readUnsignedShort() - 1);
				if (aShortArray1927 != null) {
					if (aShortArray1929[i_79_] != -1) {
						if (anInt1905 >= 16)
							aShortArray1927[i_79_] = (short) (class527_sub38_14_.readUnsignedSmart((byte) -90) - 1);
						else
							aShortArray1927[i_79_] = (short) (class527_sub38_14_.readUnsignedByte() - 1);
					} else
						aShortArray1927[i_79_] = (short) -1;
				}
			}
			anInt1912 = -1;
			class527_sub38.anInt10689 = i_47_ * 1474750881;
			class527_sub38_9_.anInt10689 = i_42_ * 1474750881;
			class527_sub38_10_.anInt10689 = i_62_ * 1474750881;
			method2801(class527_sub38, class527_sub38_9_, class527_sub38_10_);
			class527_sub38.anInt10689 = i_54_ * 1474750881;
			class527_sub38_9_.anInt10689 = i_55_ * 1474750881;
			class527_sub38_10_.anInt10689 = i_57_ * 1474750881;
			class527_sub38_11_.anInt10689 = i_58_ * 1474750881;
			class527_sub38_12_.anInt10689 = i_59_ * 1474750881;
			class527_sub38_13_.anInt10689 = i_60_ * 1474750881;
			method2802(class527_sub38, class527_sub38_9_, class527_sub38_10_, class527_sub38_11_, class527_sub38_12_, class527_sub38_13_);
			class527_sub38.anInt10689 = i_61_ * 1474750881;
			if (bool_16_) {
				int i_80_ = class527_sub38.readUnsignedByte();
				if (i_80_ > 0) {
					aClass167Array1948 = new Class167[i_80_];
					for (int i_81_ = 0; i_81_ < i_80_; i_81_++) {
						int i_82_ = class527_sub38.readUnsignedShort();
						int i_83_ = class527_sub38.readUnsignedShort();
						byte i_84_;
						if (i_22_ == 255)
							i_84_ = aByteArray1924[i_83_];
						else
							i_84_ = (byte) i_22_;
						aClass167Array1948[i_81_] = new Class167(i_82_, i_83_, aShortArray1918[i_83_], aShortArray1940[i_83_], aShortArray1920[i_83_], i_84_);
					}
				}
				int i_85_ = class527_sub38.readUnsignedByte();
				if (i_85_ > 0) {
					aClass159Array1925 = new Class159[i_85_];
					for (int i_86_ = 0; i_86_ < i_85_; i_86_++) {
						int i_87_ = class527_sub38.readUnsignedShort();
						int i_88_ = class527_sub38.readUnsignedShort();
						aClass159Array1925[i_86_] = new Class159(i_87_, i_88_);
					}
				}
			}
			if (bool_17_) {
				int i_89_ = class527_sub38.readUnsignedByte();
				if (i_89_ > 0) {
					aClass183Array1947 = new Class183[i_89_];
					for (int i_90_ = 0; i_90_ < i_89_; i_90_++) {
						int i_91_ = class527_sub38.readUnsignedShort();
						int i_92_ = class527_sub38.readUnsignedShort();
						int i_93_;
						if (bool_20_)
							i_93_ = class527_sub38.method16606(1547029782);
						else {
							i_93_ = class527_sub38.readUnsignedByte();
							if (i_93_ == 255)
								i_93_ = -1;
						}
						byte i_94_ = class527_sub38.readByte();
						aClass183Array1947[i_90_] = new Class183(i_91_, i_92_, i_93_, i_94_);
					}
				}
			}
		}
	}

	public Class175(int i, int i_95_, int i_96_) {
		anIntArray1908 = new int[i];
		anIntArray1909 = new int[i];
		anIntArray1910 = new int[i];
		anIntArray1921 = new int[i];
		aShortArray1918 = new short[i_95_];
		aShortArray1940 = new short[i_95_];
		aShortArray1920 = new short[i_95_];
		aByteArray1928 = new byte[i_95_];
		aByteArray1924 = new byte[i_95_];
		aByteArray1907 = new byte[i_95_];
		aShortArray1927 = new short[i_95_];
		aShortArray1942 = new short[i_95_];
		aShortArray1929 = new short[i_95_];
		anIntArray1914 = new int[i_95_];
		if (i_96_ > 0) {
			aByteArray1936 = new byte[i_96_];
			aShortArray1937 = new short[i_96_];
			aShortArray1938 = new short[i_96_];
			aShortArray1939 = new short[i_96_];
			anIntArray1930 = new int[i_96_];
			anIntArray1941 = new int[i_96_];
			anIntArray1943 = new int[i_96_];
			aByteArray1946 = new byte[i_96_];
			aByteArray1932 = new byte[i_96_];
			anIntArray1902 = new int[i_96_];
			anIntArray1950 = new int[i_96_];
			anIntArray1945 = new int[i_96_];
		}
	}

	public void method2799(short i, short i_97_) {
		for (int i_98_ = 0; i_98_ < anInt1917; i_98_++) {
			if (aShortArray1942[i_98_] == i)
				aShortArray1942[i_98_] = i_97_;
		}
	}

	public void method2800(int i) {
		for (int i_99_ = 0; i_99_ < anInt1906; i_99_++) {
			anIntArray1908[i_99_] <<= i;
			anIntArray1909[i_99_] <<= i;
			anIntArray1910[i_99_] <<= i;
		}
		if (anInt1926 > 0 && anIntArray1930 != null) {
			for (int i_100_ = 0; i_100_ < anIntArray1930.length; i_100_++) {
				anIntArray1930[i_100_] <<= i;
				anIntArray1941[i_100_] <<= i;
				if (aByteArray1936[i_100_] != 1)
					anIntArray1943[i_100_] <<= i;
			}
		}
	}

	void method2801(RSByteBuffer class527_sub38, RSByteBuffer class527_sub38_101_, RSByteBuffer class527_sub38_102_) {
		short i = 0;
		short i_103_ = 0;
		short i_104_ = 0;
		int i_105_ = 0;
		for (int i_106_ = 0; i_106_ < anInt1917; i_106_++) {
			int i_107_ = class527_sub38_101_.readUnsignedByte();
			int i_108_ = i_107_ & 0x7;
			if (i_108_ == 1) {
				aShortArray1918[i_106_] = i = (short) (class527_sub38.readSmartVariant(983912765) + i_105_);
				i_105_ = i;
				aShortArray1940[i_106_] = i_103_ = (short) (class527_sub38.readSmartVariant(983912765) + i_105_);
				i_105_ = i_103_;
				aShortArray1920[i_106_] = i_104_ = (short) (class527_sub38.readSmartVariant(983912765) + i_105_);
				i_105_ = i_104_;
				if (i > anInt1912)
					anInt1912 = i;
				if (i_103_ > anInt1912)
					anInt1912 = i_103_;
				if (i_104_ > anInt1912)
					anInt1912 = i_104_;
			}
			if (i_108_ == 2) {
				i_103_ = i_104_;
				i_104_ = (short) (class527_sub38.readSmartVariant(983912765) + i_105_);
				i_105_ = i_104_;
				aShortArray1918[i_106_] = i;
				aShortArray1940[i_106_] = i_103_;
				aShortArray1920[i_106_] = i_104_;
				if (i_104_ > anInt1912)
					anInt1912 = i_104_;
			}
			if (i_108_ == 3) {
				i = i_104_;
				i_104_ = (short) (class527_sub38.readSmartVariant(983912765) + i_105_);
				i_105_ = i_104_;
				aShortArray1918[i_106_] = i;
				aShortArray1940[i_106_] = i_103_;
				aShortArray1920[i_106_] = i_104_;
				if (i_104_ > anInt1912)
					anInt1912 = i_104_;
			}
			if (i_108_ == 4) {
				short i_109_ = i;
				i = i_103_;
				i_103_ = i_109_;
				i_104_ = (short) (class527_sub38.readSmartVariant(983912765) + i_105_);
				i_105_ = i_104_;
				aShortArray1918[i_106_] = i;
				aShortArray1940[i_106_] = i_103_;
				aShortArray1920[i_106_] = i_104_;
				if (i_104_ > anInt1912)
					anInt1912 = i_104_;
			}
			if (anInt1916 > 0 && (i_107_ & 0x8) != 0) {
				aByteArray1944[i_106_] = (byte) class527_sub38_102_.readUnsignedByte();
				aByteArray1949[i_106_] = (byte) class527_sub38_102_.readUnsignedByte();
				aByteArray1923[i_106_] = (byte) class527_sub38_102_.readUnsignedByte();
			}
		}
		anInt1912++;
	}

	void method2802(RSByteBuffer class527_sub38, RSByteBuffer class527_sub38_110_, RSByteBuffer class527_sub38_111_, RSByteBuffer class527_sub38_112_, RSByteBuffer class527_sub38_113_, RSByteBuffer class527_sub38_114_) {
		for (int i = 0; i < anInt1926; i++) {
			int i_115_ = aByteArray1936[i] & 0xff;
			if (i_115_ == 0) {
				aShortArray1937[i] = (short) class527_sub38.readUnsignedShort();
				aShortArray1938[i] = (short) class527_sub38.readUnsignedShort();
				aShortArray1939[i] = (short) class527_sub38.readUnsignedShort();
			}
			if (i_115_ == 1) {
				aShortArray1937[i] = (short) class527_sub38_110_.readUnsignedShort();
				aShortArray1938[i] = (short) class527_sub38_110_.readUnsignedShort();
				aShortArray1939[i] = (short) class527_sub38_110_.readUnsignedShort();
				if (anInt1905 < 15) {
					anIntArray1930[i] = class527_sub38_111_.readUnsignedShort();
					if (anInt1905 < 14)
						anIntArray1941[i] = class527_sub38_111_.readUnsignedShort();
					else
						anIntArray1941[i] = class527_sub38_111_.read24BitUnsignedInteger(1465350354);
					anIntArray1943[i] = class527_sub38_111_.readUnsignedShort();
				} else {
					anIntArray1930[i] = class527_sub38_111_.read24BitUnsignedInteger(1453060745);
					anIntArray1941[i] = class527_sub38_111_.read24BitUnsignedInteger(699353164);
					anIntArray1943[i] = class527_sub38_111_.read24BitUnsignedInteger(1727472255);
				}
				aByteArray1946[i] = class527_sub38_112_.readByte();
				aByteArray1932[i] = class527_sub38_113_.readByte();
				anIntArray1902[i] = class527_sub38_114_.readByte();
			}
			if (i_115_ == 2) {
				aShortArray1937[i] = (short) class527_sub38_110_.readUnsignedShort();
				aShortArray1938[i] = (short) class527_sub38_110_.readUnsignedShort();
				aShortArray1939[i] = (short) class527_sub38_110_.readUnsignedShort();
				if (anInt1905 < 15) {
					anIntArray1930[i] = class527_sub38_111_.readUnsignedShort();
					if (anInt1905 < 14)
						anIntArray1941[i] = class527_sub38_111_.readUnsignedShort();
					else
						anIntArray1941[i] = class527_sub38_111_.read24BitUnsignedInteger(49454833);
					anIntArray1943[i] = class527_sub38_111_.readUnsignedShort();
				} else {
					anIntArray1930[i] = class527_sub38_111_.read24BitUnsignedInteger(1721872762);
					anIntArray1941[i] = class527_sub38_111_.read24BitUnsignedInteger(1006942204);
					anIntArray1943[i] = class527_sub38_111_.read24BitUnsignedInteger(2080836561);
				}
				aByteArray1946[i] = class527_sub38_112_.readByte();
				aByteArray1932[i] = class527_sub38_113_.readByte();
				anIntArray1902[i] = class527_sub38_114_.readByte();
				anIntArray1950[i] = class527_sub38_114_.readByte();
				anIntArray1945[i] = class527_sub38_114_.readByte();
			}
			if (i_115_ == 3) {
				aShortArray1937[i] = (short) class527_sub38_110_.readUnsignedShort();
				aShortArray1938[i] = (short) class527_sub38_110_.readUnsignedShort();
				aShortArray1939[i] = (short) class527_sub38_110_.readUnsignedShort();
				if (anInt1905 < 15) {
					anIntArray1930[i] = class527_sub38_111_.readUnsignedShort();
					if (anInt1905 < 14)
						anIntArray1941[i] = class527_sub38_111_.readUnsignedShort();
					else
						anIntArray1941[i] = class527_sub38_111_.read24BitUnsignedInteger(45282331);
					anIntArray1943[i] = class527_sub38_111_.readUnsignedShort();
				} else {
					anIntArray1930[i] = class527_sub38_111_.read24BitUnsignedInteger(630377008);
					anIntArray1941[i] = class527_sub38_111_.read24BitUnsignedInteger(316088428);
					anIntArray1943[i] = class527_sub38_111_.read24BitUnsignedInteger(1905092962);
				}
				aByteArray1946[i] = class527_sub38_112_.readByte();
				aByteArray1932[i] = class527_sub38_113_.readByte();
				anIntArray1902[i] = class527_sub38_114_.readByte();
			}
		}
	}

	public void method2803(short i, short i_116_) {
		for (int i_117_ = 0; i_117_ < anInt1917; i_117_++) {
			if (aShortArray1942[i_117_] == i)
				aShortArray1942[i_117_] = i_116_;
		}
	}

	public int method2804(int i, int i_118_, int i_119_, byte i_120_, byte i_121_, short i_122_, byte i_123_, short i_124_) {
		aShortArray1918[anInt1917] = (short) i;
		aShortArray1940[anInt1917] = (short) i_118_;
		aShortArray1920[anInt1917] = (short) i_119_;
		aByteArray1928[anInt1917] = i_120_;
		aShortArray1927[anInt1917] = (short) i_121_;
		aShortArray1942[anInt1917] = i_122_;
		aByteArray1907[anInt1917] = i_123_;
		aShortArray1929[anInt1917] = i_124_;
		return anInt1917++;
	}

	public byte method2805(short i, short i_125_, short i_126_) {
		if (anInt1926 >= 255)
			throw new IllegalStateException();
		aByteArray1936[anInt1926] = (byte) 0;
		aShortArray1937[anInt1926] = i;
		aShortArray1938[anInt1926] = i_125_;
		aShortArray1939[anInt1926] = i_126_;
		return (byte) anInt1926++;
	}

	public byte method2806(short i, short i_127_, short i_128_, short i_129_, short i_130_, short i_131_, byte i_132_, byte i_133_, byte i_134_) {
		if (anInt1926 >= 255)
			throw new IllegalStateException();
		aByteArray1936[anInt1926] = (byte) 3;
		aShortArray1937[anInt1926] = i;
		aShortArray1938[anInt1926] = i_127_;
		aShortArray1939[anInt1926] = i_128_;
		anIntArray1930[anInt1926] = i_129_;
		anIntArray1941[anInt1926] = i_130_;
		anIntArray1943[anInt1926] = i_131_;
		aByteArray1946[anInt1926] = i_132_;
		aByteArray1932[anInt1926] = i_133_;
		anIntArray1902[anInt1926] = i_134_;
		return (byte) anInt1926++;
	}

	public int[][] method2807(boolean bool) {
		int[] is = new int[400];
		int i = 0;
		int i_135_ = bool ? anInt1906 : anInt1912;
		for (int i_136_ = 0; i_136_ < i_135_; i_136_++) {
			int i_137_ = anIntArray1921[i_136_];
			if (i_137_ >= 0) {
				is[i_137_]++;
				if (i_137_ > i)
					i = i_137_;
			}
		}
		int[][] is_138_ = new int[i + 1][];
		for (int i_139_ = 0; i_139_ <= i; i_139_++) {
			is_138_[i_139_] = new int[is[i_139_]];
			is[i_139_] = 0;
		}
		for (int i_140_ = 0; i_140_ < i_135_; i_140_++) {
			int i_141_ = anIntArray1921[i_140_];
			if (i_141_ >= 0)
				is_138_[i_141_][is[i_141_]++] = i_140_;
		}
		return is_138_;
	}

	public int[][] method2808() {
		int[] is = new int[256];
		int i = 0;
		for (int i_142_ = 0; i_142_ < anInt1917; i_142_++) {
			int i_143_ = anIntArray1914[i_142_];
			if (i_143_ >= 0) {
				is[i_143_]++;
				if (i_143_ > i)
					i = i_143_;
			}
		}
		int[][] is_144_ = new int[i + 1][];
		for (int i_145_ = 0; i_145_ <= i; i_145_++) {
			is_144_[i_145_] = new int[is[i_145_]];
			is[i_145_] = 0;
		}
		for (int i_146_ = 0; i_146_ < anInt1917; i_146_++) {
			int i_147_ = anIntArray1914[i_146_];
			if (i_147_ >= 0)
				is_144_[i_147_][is[i_147_]++] = i_146_;
		}
		return is_144_;
	}

	public int[][] method2809() {
		int[] is = new int[256];
		int i = 0;
		for (int i_148_ = 0; i_148_ < aClass183Array1947.length; i_148_++) {
			int i_149_ = aClass183Array1947[i_148_].anInt2096 * 302411983;
			if (i_149_ >= 0) {
				is[i_149_]++;
				if (i_149_ > i)
					i = i_149_;
			}
		}
		int[][] is_150_ = new int[i + 1][];
		for (int i_151_ = 0; i_151_ <= i; i_151_++) {
			is_150_[i_151_] = new int[is[i_151_]];
			is[i_151_] = 0;
		}
		for (int i_152_ = 0; i_152_ < aClass183Array1947.length; i_152_++) {
			int i_153_ = aClass183Array1947[i_152_].anInt2096 * 302411983;
			if (i_153_ >= 0)
				is_150_[i_153_][is[i_153_]++] = i_152_;
		}
		return is_150_;
	}

	final int method2810(Class175 class175_154_, int i, short i_155_) {
		int i_156_ = class175_154_.anIntArray1908[i];
		int i_157_ = class175_154_.anIntArray1909[i];
		int i_158_ = class175_154_.anIntArray1910[i];
		for (int i_159_ = 0; i_159_ < anInt1906; i_159_++) {
			if (i_156_ == anIntArray1908[i_159_] && i_157_ == anIntArray1909[i_159_] && i_158_ == anIntArray1910[i_159_]) {
				aShortArray1913[i_159_] |= i_155_;
				return i_159_;
			}
		}
		anIntArray1908[anInt1906] = i_156_;
		anIntArray1909[anInt1906] = i_157_;
		anIntArray1910[anInt1906] = i_158_;
		aShortArray1913[anInt1906] = i_155_;
		anIntArray1921[anInt1906] = (class175_154_.anIntArray1921 != null ? class175_154_.anIntArray1921[i] : -1);
		return anInt1906++;
	}

	public void method2811(float f) {
		for (int i = 0; i < anInt1906; i++) {
			anIntArray1908[i] *= f;
			anIntArray1909[i] *= f;
			anIntArray1910[i] *= f;
		}
		if (anInt1926 > 0 && anIntArray1930 != null) {
			for (int i = 0; i < anIntArray1930.length; i++) {
				anIntArray1930[i] *= f;
				anIntArray1941[i] *= f;
				if (aByteArray1936[i] != 1)
					anIntArray1943[i] *= f;
			}
		}
	}

	public void method2812(int i, int i_160_, int i_161_) {
		for (int i_162_ = 0; i_162_ < anInt1906; i_162_++) {
			anIntArray1908[i_162_] += i;
			anIntArray1909[i_162_] += i_160_;
			anIntArray1910[i_162_] += i_161_;
		}
	}

	public void method2813(float f) {
		for (int i = 0; i < anInt1906; i++) {
			anIntArray1908[i] *= f;
			anIntArray1909[i] *= f;
			anIntArray1910[i] *= f;
		}
		if (anInt1926 > 0 && anIntArray1930 != null) {
			for (int i = 0; i < anIntArray1930.length; i++) {
				anIntArray1930[i] *= f;
				anIntArray1941[i] *= f;
				if (aByteArray1936[i] != 1)
					anIntArray1943[i] *= f;
			}
		}
	}

	public static Class175 method2814(Class459 class459, int i, int i_163_) {
		byte[] is = class459.method7470(i, i_163_, (byte) -112);
		if (is == null)
			return null;
		return new Class175(is);
	}

	public static Class175 method2815(Class459 class459, int i, int i_164_) {
		byte[] is = class459.method7470(i, i_164_, (byte) -48);
		if (is == null)
			return null;
		return new Class175(is);
	}

	public static Class175 method2816(Class459 class459, int i, int i_165_) {
		byte[] is = class459.method7470(i, i_165_, (byte) -29);
		if (is == null)
			return null;
		return new Class175(is);
	}

	public void method2817(float f) {
		for (int i = 0; i < anInt1906; i++) {
			anIntArray1908[i] *= f;
			anIntArray1909[i] *= f;
			anIntArray1910[i] *= f;
		}
		if (anInt1926 > 0 && anIntArray1930 != null) {
			for (int i = 0; i < anIntArray1930.length; i++) {
				anIntArray1930[i] *= f;
				anIntArray1941[i] *= f;
				if (aByteArray1936[i] != 1)
					anIntArray1943[i] *= f;
			}
		}
	}

	final int method2818(Class175 class175_166_, int i, short i_167_) {
		int i_168_ = class175_166_.anIntArray1908[i];
		int i_169_ = class175_166_.anIntArray1909[i];
		int i_170_ = class175_166_.anIntArray1910[i];
		for (int i_171_ = 0; i_171_ < anInt1906; i_171_++) {
			if (i_168_ == anIntArray1908[i_171_] && i_169_ == anIntArray1909[i_171_] && i_170_ == anIntArray1910[i_171_]) {
				aShortArray1913[i_171_] |= i_167_;
				return i_171_;
			}
		}
		anIntArray1908[anInt1906] = i_168_;
		anIntArray1909[anInt1906] = i_169_;
		anIntArray1910[anInt1906] = i_170_;
		aShortArray1913[anInt1906] = i_167_;
		anIntArray1921[anInt1906] = (class175_166_.anIntArray1921 != null ? class175_166_.anIntArray1921[i] : -1);
		return anInt1906++;
	}

	public Class175(Class175[] class175s, int i) {
		anInt1906 = 0;
		anInt1917 = 0;
		anInt1926 = 0;
		anInt1916 = 0;
		int i_172_ = 0;
		int i_173_ = 0;
		int i_174_ = 0;
		boolean bool = false;
		boolean bool_175_ = false;
		boolean bool_176_ = false;
		boolean bool_177_ = false;
		boolean bool_178_ = false;
		boolean bool_179_ = false;
		aByte1922 = (byte) -1;
		for (int i_180_ = 0; i_180_ < i; i_180_++) {
			Class175 class175_181_ = class175s[i_180_];
			if (class175_181_ != null) {
				anInt1906 += class175_181_.anInt1906;
				anInt1917 += class175_181_.anInt1917;
				anInt1926 += class175_181_.anInt1926;
				anInt1916 += class175_181_.anInt1916;
				if (class175_181_.aClass167Array1948 != null)
					i_172_ += class175_181_.aClass167Array1948.length;
				if (class175_181_.aClass159Array1925 != null)
					i_173_ += class175_181_.aClass159Array1925.length;
				if (class175_181_.aClass183Array1947 != null)
					i_174_ += class175_181_.aClass183Array1947.length;
				bool = bool | class175_181_.aByteArray1928 != null;
				if (class175_181_.aByteArray1924 != null)
					bool_175_ = true;
				else {
					if (aByte1922 == -1)
						aByte1922 = class175_181_.aByte1922;
					if (aByte1922 != class175_181_.aByte1922)
						bool_175_ = true;
				}
				bool_176_ = bool_176_ | class175_181_.aByteArray1907 != null;
				bool_177_ = bool_177_ | class175_181_.aShortArray1927 != null;
				bool_178_ = bool_178_ | class175_181_.aShortArray1929 != null;
				bool_179_ = bool_179_ | class175_181_.anIntArray1914 != null;
			}
		}
		anIntArray1908 = new int[anInt1906];
		anIntArray1909 = new int[anInt1906];
		anIntArray1910 = new int[anInt1906];
		anIntArray1921 = new int[anInt1906];
		aShortArray1913 = new short[anInt1906];
		aShortArray1918 = new short[anInt1917];
		aShortArray1940 = new short[anInt1917];
		aShortArray1920 = new short[anInt1917];
		if (bool)
			aByteArray1928 = new byte[anInt1917];
		if (bool_175_)
			aByteArray1924 = new byte[anInt1917];
		if (bool_176_)
			aByteArray1907 = new byte[anInt1917];
		if (bool_177_)
			aShortArray1927 = new short[anInt1917];
		aShortArray1942 = new short[anInt1917];
		if (bool_178_)
			aShortArray1929 = new short[anInt1917];
		if (bool_179_)
			anIntArray1914 = new int[anInt1917];
		aShortArray1935 = new short[anInt1917];
		if (anInt1926 > 0) {
			aByteArray1936 = new byte[anInt1926];
			aShortArray1937 = new short[anInt1926];
			aShortArray1938 = new short[anInt1926];
			aShortArray1939 = new short[anInt1926];
			anIntArray1930 = new int[anInt1926];
			anIntArray1941 = new int[anInt1926];
			anIntArray1943 = new int[anInt1926];
			aByteArray1946 = new byte[anInt1926];
			aByteArray1932 = new byte[anInt1926];
			anIntArray1902 = new int[anInt1926];
			anIntArray1950 = new int[anInt1926];
			anIntArray1945 = new int[anInt1926];
		}
		if (i_174_ > 0)
			aClass183Array1947 = new Class183[i_174_];
		if (i_172_ > 0)
			aClass167Array1948 = new Class167[i_172_];
		if (i_173_ > 0)
			aClass159Array1925 = new Class159[i_173_];
		if (anInt1916 > 0) {
			aFloatArray1915 = new float[anInt1916];
			aFloatArray1931 = new float[anInt1916];
			anIntArray1911 = new int[anInt1906];
			aByteArray1944 = new byte[anInt1917];
			aByteArray1949 = new byte[anInt1917];
			aByteArray1923 = new byte[anInt1917];
		}
		int[] is = new int[anInt1906];
		int[] is_182_ = new int[anInt1916];
		int[] is_183_ = new int[anInt1906];
		int[] is_184_ = new int[anInt1906];
		int[] is_185_ = new int[3];
		anInt1906 = 0;
		anInt1917 = 0;
		anInt1926 = 0;
		anInt1916 = 0;
		i_172_ = 0;
		i_173_ = 0;
		i_174_ = 0;
		for (int i_186_ = 0; i_186_ < i; i_186_++) {
			short i_187_ = (short) (1 << i_186_);
			Class175 class175_188_ = class175s[i_186_];
			int i_189_ = anInt1917;
			if (class175_188_ != null) {
				boolean[] bools = new boolean[class175_188_.anInt1906];
				if (class175_188_.aClass183Array1947 != null) {
					for (int i_190_ = 0; i_190_ < class175_188_.aClass183Array1947.length; i_190_++) {
						Class183 class183 = class175_188_.aClass183Array1947[i_190_];
						aClass183Array1947[i_174_++] = class183.method3554((class183.anInt2097 * -214271421) + anInt1917, (byte) 42);
					}
				}
				for (int i_191_ = 0; i_191_ < class175_188_.anInt1917; i_191_++) {
					is_185_[0] = class175_188_.aShortArray1918[i_191_];
					is_185_[1] = class175_188_.aShortArray1940[i_191_];
					is_185_[2] = class175_188_.aShortArray1920[i_191_];
					for (int i_192_ = 0; i_192_ < 3; i_192_++) {
						int i_193_ = is_185_[i_192_];
						int i_194_ = class175_188_.anIntArray1908[i_193_];
						int i_195_ = class175_188_.anIntArray1909[i_193_];
						int i_196_ = class175_188_.anIntArray1910[i_193_];
						int i_197_;
						for (i_197_ = 0; i_197_ < anInt1906; i_197_++) {
							if (i_194_ == anIntArray1908[i_197_] && i_195_ == anIntArray1909[i_197_] && i_196_ == anIntArray1910[i_197_]) {
								aShortArray1913[i_197_] |= i_187_;
								is_183_[i_193_] = i_197_;
								break;
							}
						}
						if (class175_188_.anInt1916 > 0 && !bools[i_193_]) {
							int i_198_ = ((i_193_ < class175_188_.anInt1906 - 1 ? class175_188_.anIntArray1911[i_193_ + 1] : class175_188_.anInt1916) - class175_188_.anIntArray1911[i_193_]);
							for (int i_199_ = 0; i_199_ < i_198_; i_199_++) {
								aFloatArray1915[anInt1916] = (class175_188_.aFloatArray1915[(class175_188_.anIntArray1911[i_193_] + i_199_)]);
								aFloatArray1931[anInt1916] = (class175_188_.aFloatArray1931[(class175_188_.anIntArray1911[i_193_] + i_199_)]);
								is_182_[anInt1916] = i_197_ << 16 | is[i_197_] + i_199_;
								anInt1916++;
							}
							is_184_[i_193_] = is[i_197_];
							is[i_197_] += i_198_;
							bools[i_193_] = true;
						}
						if (i_197_ >= anInt1906) {
							anIntArray1908[anInt1906] = i_194_;
							anIntArray1909[anInt1906] = i_195_;
							anIntArray1910[anInt1906] = i_196_;
							aShortArray1913[anInt1906] = i_187_;
							anIntArray1921[anInt1906] = (class175_188_.anIntArray1921 != null ? class175_188_.anIntArray1921[i_193_] : -1);
							is_183_[i_193_] = anInt1906;
							anInt1906++;
						}
					}
				}
				for (int i_200_ = 0; i_200_ < class175_188_.anInt1917; i_200_++) {
					if (bool && class175_188_.aByteArray1928 != null)
						aByteArray1928[anInt1917] = class175_188_.aByteArray1928[i_200_];
					if (bool_175_) {
						if (class175_188_.aByteArray1924 != null)
							aByteArray1924[anInt1917] = class175_188_.aByteArray1924[i_200_];
						else
							aByteArray1924[anInt1917] = class175_188_.aByte1922;
					}
					if (bool_176_ && class175_188_.aByteArray1907 != null)
						aByteArray1907[anInt1917] = class175_188_.aByteArray1907[i_200_];
					if (bool_178_) {
						if (class175_188_.aShortArray1929 != null)
							aShortArray1929[anInt1917] = class175_188_.aShortArray1929[i_200_];
						else
							aShortArray1929[anInt1917] = (short) -1;
					}
					if (bool_179_) {
						if (class175_188_.anIntArray1914 != null)
							anIntArray1914[anInt1917] = class175_188_.anIntArray1914[i_200_];
						else
							anIntArray1914[anInt1917] = -1;
					}
					if (class175_188_.anInt1916 > 0) {
						aByteArray1944[anInt1917] = (byte) (class175_188_.aByteArray1944[i_200_] + is_184_[(class175_188_.aShortArray1918[i_200_])]);
						aByteArray1949[anInt1917] = (byte) (class175_188_.aByteArray1949[i_200_] + is_184_[(class175_188_.aShortArray1940[i_200_])]);
						aByteArray1923[anInt1917] = (byte) (class175_188_.aByteArray1923[i_200_] + is_184_[(class175_188_.aShortArray1920[i_200_])]);
					}
					aShortArray1918[anInt1917] = (short) (is_183_[class175_188_.aShortArray1918[i_200_]]);
					aShortArray1940[anInt1917] = (short) (is_183_[class175_188_.aShortArray1940[i_200_]]);
					aShortArray1920[anInt1917] = (short) (is_183_[class175_188_.aShortArray1920[i_200_]]);
					aShortArray1935[anInt1917] = i_187_;
					aShortArray1942[anInt1917] = class175_188_.aShortArray1942[i_200_];
					anInt1917++;
				}
				if (class175_188_.aClass167Array1948 != null) {
					for (int i_201_ = 0; i_201_ < class175_188_.aClass167Array1948.length; i_201_++) {
						int i_202_ = is_183_[(class175_188_.aClass167Array1948[i_201_].anInt1851) * -18705907];
						int i_203_ = is_183_[(class175_188_.aClass167Array1948[i_201_].anInt1852) * -1573542389];
						int i_204_ = is_183_[(class175_188_.aClass167Array1948[i_201_].anInt1853) * -2116684303];
						aClass167Array1948[i_172_] = (class175_188_.aClass167Array1948[i_201_].method2670((class175_188_.aClass167Array1948[i_201_].anInt1848) * 359046121 + i_189_, i_202_, i_203_, i_204_, 1733250700));
						i_172_++;
					}
				}
				if (class175_188_.aClass159Array1925 != null) {
					for (int i_205_ = 0; i_205_ < class175_188_.aClass159Array1925.length; i_205_++) {
						int i_206_ = is_183_[(class175_188_.aClass159Array1925[i_205_].anInt1740) * -449756941];
						aClass159Array1925[i_173_] = class175_188_.aClass159Array1925[i_205_].method2565(i_206_, 1045554725);
						i_173_++;
					}
				}
			}
		}
		anInt1912 = anInt1906;
		if (anInt1916 > 0) {
			Class174_Sub1.method14590(is_182_, aFloatArray1915, aFloatArray1931, -269825575);
			int i_207_ = 0;
			int i_208_ = 0;
			for (/**/; i_207_ < anInt1906; i_207_++) {
				anIntArray1911[i_207_] = i_208_;
				i_208_ += is[i_207_];
			}
		}
		int i_209_ = 0;
		int i_210_ = 0;
		for (/**/; i_209_ < i; i_209_++) {
			short i_211_ = (short) (1 << i_209_);
			Class175 class175_212_ = class175s[i_209_];
			if (class175_212_ != null) {
				if (bool_177_) {
					int i_213_ = 0;
					while (i_213_ < class175_212_.anInt1917) {
						aShortArray1927[i_210_] = (class175_212_.aShortArray1927 != null ? class175_212_.aShortArray1927[i_213_] : (short) -1);
						if (aShortArray1927[i_210_] > -1 && aShortArray1927[i_210_] < 32766)
							aShortArray1927[i_210_] = (short) (aShortArray1927[i_210_] + anInt1926);
						i_213_++;
						i_210_++;
					}
				}
				for (int i_214_ = 0; i_214_ < class175_212_.anInt1926; i_214_++) {
					byte i_215_ = (aByteArray1936[anInt1926] = class175_212_.aByteArray1936[i_214_]);
					if (i_215_ == 0) {
						aShortArray1937[anInt1926] = (short) method2850(class175_212_, (class175_212_.aShortArray1937[i_214_]), i_211_);
						aShortArray1938[anInt1926] = (short) method2850(class175_212_, (class175_212_.aShortArray1938[i_214_]), i_211_);
						aShortArray1939[anInt1926] = (short) method2850(class175_212_, (class175_212_.aShortArray1939[i_214_]), i_211_);
					} else if (i_215_ >= 1 && i_215_ <= 3) {
						aShortArray1937[anInt1926] = class175_212_.aShortArray1937[i_214_];
						aShortArray1938[anInt1926] = class175_212_.aShortArray1938[i_214_];
						aShortArray1939[anInt1926] = class175_212_.aShortArray1939[i_214_];
						anIntArray1930[anInt1926] = class175_212_.anIntArray1930[i_214_];
						anIntArray1941[anInt1926] = class175_212_.anIntArray1941[i_214_];
						anIntArray1943[anInt1926] = class175_212_.anIntArray1943[i_214_];
						aByteArray1946[anInt1926] = class175_212_.aByteArray1946[i_214_];
						aByteArray1932[anInt1926] = class175_212_.aByteArray1932[i_214_];
						anIntArray1902[anInt1926] = class175_212_.anIntArray1902[i_214_];
					} else if (i_215_ == 2) {
						anIntArray1950[anInt1926] = class175_212_.anIntArray1950[i_214_];
						anIntArray1945[anInt1926] = class175_212_.anIntArray1945[i_214_];
					}
					anInt1926++;
				}
			}
		}
	}

	public void method2819(short i, short i_216_) {
		for (int i_217_ = 0; i_217_ < anInt1917; i_217_++) {
			if (aShortArray1942[i_217_] == i)
				aShortArray1942[i_217_] = i_216_;
		}
	}

	void method2820(RSByteBuffer class527_sub38, RSByteBuffer class527_sub38_218_, RSByteBuffer class527_sub38_219_) {
		short i = 0;
		short i_220_ = 0;
		short i_221_ = 0;
		int i_222_ = 0;
		for (int i_223_ = 0; i_223_ < anInt1917; i_223_++) {
			int i_224_ = class527_sub38_218_.readUnsignedByte();
			int i_225_ = i_224_ & 0x7;
			if (i_225_ == 1) {
				aShortArray1918[i_223_] = i = (short) (class527_sub38.readSmartVariant(983912765) + i_222_);
				i_222_ = i;
				aShortArray1940[i_223_] = i_220_ = (short) (class527_sub38.readSmartVariant(983912765) + i_222_);
				i_222_ = i_220_;
				aShortArray1920[i_223_] = i_221_ = (short) (class527_sub38.readSmartVariant(983912765) + i_222_);
				i_222_ = i_221_;
				if (i > anInt1912)
					anInt1912 = i;
				if (i_220_ > anInt1912)
					anInt1912 = i_220_;
				if (i_221_ > anInt1912)
					anInt1912 = i_221_;
			}
			if (i_225_ == 2) {
				i_220_ = i_221_;
				i_221_ = (short) (class527_sub38.readSmartVariant(983912765) + i_222_);
				i_222_ = i_221_;
				aShortArray1918[i_223_] = i;
				aShortArray1940[i_223_] = i_220_;
				aShortArray1920[i_223_] = i_221_;
				if (i_221_ > anInt1912)
					anInt1912 = i_221_;
			}
			if (i_225_ == 3) {
				i = i_221_;
				i_221_ = (short) (class527_sub38.readSmartVariant(983912765) + i_222_);
				i_222_ = i_221_;
				aShortArray1918[i_223_] = i;
				aShortArray1940[i_223_] = i_220_;
				aShortArray1920[i_223_] = i_221_;
				if (i_221_ > anInt1912)
					anInt1912 = i_221_;
			}
			if (i_225_ == 4) {
				short i_226_ = i;
				i = i_220_;
				i_220_ = i_226_;
				i_221_ = (short) (class527_sub38.readSmartVariant(983912765) + i_222_);
				i_222_ = i_221_;
				aShortArray1918[i_223_] = i;
				aShortArray1940[i_223_] = i_220_;
				aShortArray1920[i_223_] = i_221_;
				if (i_221_ > anInt1912)
					anInt1912 = i_221_;
			}
			if (anInt1916 > 0 && (i_224_ & 0x8) != 0) {
				aByteArray1944[i_223_] = (byte) class527_sub38_219_.readUnsignedByte();
				aByteArray1949[i_223_] = (byte) class527_sub38_219_.readUnsignedByte();
				aByteArray1923[i_223_] = (byte) class527_sub38_219_.readUnsignedByte();
			}
		}
		anInt1912++;
	}

	void method2821(RSByteBuffer class527_sub38, RSByteBuffer class527_sub38_227_, RSByteBuffer class527_sub38_228_) {
		short i = 0;
		short i_229_ = 0;
		short i_230_ = 0;
		int i_231_ = 0;
		for (int i_232_ = 0; i_232_ < anInt1917; i_232_++) {
			int i_233_ = class527_sub38_227_.readUnsignedByte();
			int i_234_ = i_233_ & 0x7;
			if (i_234_ == 1) {
				aShortArray1918[i_232_] = i = (short) (class527_sub38.readSmartVariant(983912765) + i_231_);
				i_231_ = i;
				aShortArray1940[i_232_] = i_229_ = (short) (class527_sub38.readSmartVariant(983912765) + i_231_);
				i_231_ = i_229_;
				aShortArray1920[i_232_] = i_230_ = (short) (class527_sub38.readSmartVariant(983912765) + i_231_);
				i_231_ = i_230_;
				if (i > anInt1912)
					anInt1912 = i;
				if (i_229_ > anInt1912)
					anInt1912 = i_229_;
				if (i_230_ > anInt1912)
					anInt1912 = i_230_;
			}
			if (i_234_ == 2) {
				i_229_ = i_230_;
				i_230_ = (short) (class527_sub38.readSmartVariant(983912765) + i_231_);
				i_231_ = i_230_;
				aShortArray1918[i_232_] = i;
				aShortArray1940[i_232_] = i_229_;
				aShortArray1920[i_232_] = i_230_;
				if (i_230_ > anInt1912)
					anInt1912 = i_230_;
			}
			if (i_234_ == 3) {
				i = i_230_;
				i_230_ = (short) (class527_sub38.readSmartVariant(983912765) + i_231_);
				i_231_ = i_230_;
				aShortArray1918[i_232_] = i;
				aShortArray1940[i_232_] = i_229_;
				aShortArray1920[i_232_] = i_230_;
				if (i_230_ > anInt1912)
					anInt1912 = i_230_;
			}
			if (i_234_ == 4) {
				short i_235_ = i;
				i = i_229_;
				i_229_ = i_235_;
				i_230_ = (short) (class527_sub38.readSmartVariant(983912765) + i_231_);
				i_231_ = i_230_;
				aShortArray1918[i_232_] = i;
				aShortArray1940[i_232_] = i_229_;
				aShortArray1920[i_232_] = i_230_;
				if (i_230_ > anInt1912)
					anInt1912 = i_230_;
			}
			if (anInt1916 > 0 && (i_233_ & 0x8) != 0) {
				aByteArray1944[i_232_] = (byte) class527_sub38_228_.readUnsignedByte();
				aByteArray1949[i_232_] = (byte) class527_sub38_228_.readUnsignedByte();
				aByteArray1923[i_232_] = (byte) class527_sub38_228_.readUnsignedByte();
			}
		}
		anInt1912++;
	}

	void method2822(RSByteBuffer class527_sub38, RSByteBuffer class527_sub38_236_, RSByteBuffer class527_sub38_237_, RSByteBuffer class527_sub38_238_, RSByteBuffer class527_sub38_239_, RSByteBuffer class527_sub38_240_) {
		for (int i = 0; i < anInt1926; i++) {
			int i_241_ = aByteArray1936[i] & 0xff;
			if (i_241_ == 0) {
				aShortArray1937[i] = (short) class527_sub38.readUnsignedShort();
				aShortArray1938[i] = (short) class527_sub38.readUnsignedShort();
				aShortArray1939[i] = (short) class527_sub38.readUnsignedShort();
			}
			if (i_241_ == 1) {
				aShortArray1937[i] = (short) class527_sub38_236_.readUnsignedShort();
				aShortArray1938[i] = (short) class527_sub38_236_.readUnsignedShort();
				aShortArray1939[i] = (short) class527_sub38_236_.readUnsignedShort();
				if (anInt1905 < 15) {
					anIntArray1930[i] = class527_sub38_237_.readUnsignedShort();
					if (anInt1905 < 14)
						anIntArray1941[i] = class527_sub38_237_.readUnsignedShort();
					else
						anIntArray1941[i] = class527_sub38_237_.read24BitUnsignedInteger(1229865397);
					anIntArray1943[i] = class527_sub38_237_.readUnsignedShort();
				} else {
					anIntArray1930[i] = class527_sub38_237_.read24BitUnsignedInteger(203979217);
					anIntArray1941[i] = class527_sub38_237_.read24BitUnsignedInteger(1883166486);
					anIntArray1943[i] = class527_sub38_237_.read24BitUnsignedInteger(987111750);
				}
				aByteArray1946[i] = class527_sub38_238_.readByte();
				aByteArray1932[i] = class527_sub38_239_.readByte();
				anIntArray1902[i] = class527_sub38_240_.readByte();
			}
			if (i_241_ == 2) {
				aShortArray1937[i] = (short) class527_sub38_236_.readUnsignedShort();
				aShortArray1938[i] = (short) class527_sub38_236_.readUnsignedShort();
				aShortArray1939[i] = (short) class527_sub38_236_.readUnsignedShort();
				if (anInt1905 < 15) {
					anIntArray1930[i] = class527_sub38_237_.readUnsignedShort();
					if (anInt1905 < 14)
						anIntArray1941[i] = class527_sub38_237_.readUnsignedShort();
					else
						anIntArray1941[i] = class527_sub38_237_.read24BitUnsignedInteger(1124619275);
					anIntArray1943[i] = class527_sub38_237_.readUnsignedShort();
				} else {
					anIntArray1930[i] = class527_sub38_237_.read24BitUnsignedInteger(724768624);
					anIntArray1941[i] = class527_sub38_237_.read24BitUnsignedInteger(1324511621);
					anIntArray1943[i] = class527_sub38_237_.read24BitUnsignedInteger(15378036);
				}
				aByteArray1946[i] = class527_sub38_238_.readByte();
				aByteArray1932[i] = class527_sub38_239_.readByte();
				anIntArray1902[i] = class527_sub38_240_.readByte();
				anIntArray1950[i] = class527_sub38_240_.readByte();
				anIntArray1945[i] = class527_sub38_240_.readByte();
			}
			if (i_241_ == 3) {
				aShortArray1937[i] = (short) class527_sub38_236_.readUnsignedShort();
				aShortArray1938[i] = (short) class527_sub38_236_.readUnsignedShort();
				aShortArray1939[i] = (short) class527_sub38_236_.readUnsignedShort();
				if (anInt1905 < 15) {
					anIntArray1930[i] = class527_sub38_237_.readUnsignedShort();
					if (anInt1905 < 14)
						anIntArray1941[i] = class527_sub38_237_.readUnsignedShort();
					else
						anIntArray1941[i] = class527_sub38_237_.read24BitUnsignedInteger(1368236070);
					anIntArray1943[i] = class527_sub38_237_.readUnsignedShort();
				} else {
					anIntArray1930[i] = class527_sub38_237_.read24BitUnsignedInteger(734410584);
					anIntArray1941[i] = class527_sub38_237_.read24BitUnsignedInteger(95673327);
					anIntArray1943[i] = class527_sub38_237_.read24BitUnsignedInteger(691402729);
				}
				aByteArray1946[i] = class527_sub38_238_.readByte();
				aByteArray1932[i] = class527_sub38_239_.readByte();
				anIntArray1902[i] = class527_sub38_240_.readByte();
			}
		}
	}

	void method2823(RSByteBuffer class527_sub38, RSByteBuffer class527_sub38_242_, RSByteBuffer class527_sub38_243_, RSByteBuffer class527_sub38_244_, RSByteBuffer class527_sub38_245_, RSByteBuffer class527_sub38_246_) {
		for (int i = 0; i < anInt1926; i++) {
			int i_247_ = aByteArray1936[i] & 0xff;
			if (i_247_ == 0) {
				aShortArray1937[i] = (short) class527_sub38.readUnsignedShort();
				aShortArray1938[i] = (short) class527_sub38.readUnsignedShort();
				aShortArray1939[i] = (short) class527_sub38.readUnsignedShort();
			}
			if (i_247_ == 1) {
				aShortArray1937[i] = (short) class527_sub38_242_.readUnsignedShort();
				aShortArray1938[i] = (short) class527_sub38_242_.readUnsignedShort();
				aShortArray1939[i] = (short) class527_sub38_242_.readUnsignedShort();
				if (anInt1905 < 15) {
					anIntArray1930[i] = class527_sub38_243_.readUnsignedShort();
					if (anInt1905 < 14)
						anIntArray1941[i] = class527_sub38_243_.readUnsignedShort();
					else
						anIntArray1941[i] = class527_sub38_243_.read24BitUnsignedInteger(1165623825);
					anIntArray1943[i] = class527_sub38_243_.readUnsignedShort();
				} else {
					anIntArray1930[i] = class527_sub38_243_.read24BitUnsignedInteger(1903006991);
					anIntArray1941[i] = class527_sub38_243_.read24BitUnsignedInteger(1160726839);
					anIntArray1943[i] = class527_sub38_243_.read24BitUnsignedInteger(936143416);
				}
				aByteArray1946[i] = class527_sub38_244_.readByte();
				aByteArray1932[i] = class527_sub38_245_.readByte();
				anIntArray1902[i] = class527_sub38_246_.readByte();
			}
			if (i_247_ == 2) {
				aShortArray1937[i] = (short) class527_sub38_242_.readUnsignedShort();
				aShortArray1938[i] = (short) class527_sub38_242_.readUnsignedShort();
				aShortArray1939[i] = (short) class527_sub38_242_.readUnsignedShort();
				if (anInt1905 < 15) {
					anIntArray1930[i] = class527_sub38_243_.readUnsignedShort();
					if (anInt1905 < 14)
						anIntArray1941[i] = class527_sub38_243_.readUnsignedShort();
					else
						anIntArray1941[i] = class527_sub38_243_.read24BitUnsignedInteger(1188467928);
					anIntArray1943[i] = class527_sub38_243_.readUnsignedShort();
				} else {
					anIntArray1930[i] = class527_sub38_243_.read24BitUnsignedInteger(44602177);
					anIntArray1941[i] = class527_sub38_243_.read24BitUnsignedInteger(95000867);
					anIntArray1943[i] = class527_sub38_243_.read24BitUnsignedInteger(471617095);
				}
				aByteArray1946[i] = class527_sub38_244_.readByte();
				aByteArray1932[i] = class527_sub38_245_.readByte();
				anIntArray1902[i] = class527_sub38_246_.readByte();
				anIntArray1950[i] = class527_sub38_246_.readByte();
				anIntArray1945[i] = class527_sub38_246_.readByte();
			}
			if (i_247_ == 3) {
				aShortArray1937[i] = (short) class527_sub38_242_.readUnsignedShort();
				aShortArray1938[i] = (short) class527_sub38_242_.readUnsignedShort();
				aShortArray1939[i] = (short) class527_sub38_242_.readUnsignedShort();
				if (anInt1905 < 15) {
					anIntArray1930[i] = class527_sub38_243_.readUnsignedShort();
					if (anInt1905 < 14)
						anIntArray1941[i] = class527_sub38_243_.readUnsignedShort();
					else
						anIntArray1941[i] = class527_sub38_243_.read24BitUnsignedInteger(386147575);
					anIntArray1943[i] = class527_sub38_243_.readUnsignedShort();
				} else {
					anIntArray1930[i] = class527_sub38_243_.read24BitUnsignedInteger(1241207647);
					anIntArray1941[i] = class527_sub38_243_.read24BitUnsignedInteger(1693939821);
					anIntArray1943[i] = class527_sub38_243_.read24BitUnsignedInteger(653564667);
				}
				aByteArray1946[i] = class527_sub38_244_.readByte();
				aByteArray1932[i] = class527_sub38_245_.readByte();
				anIntArray1902[i] = class527_sub38_246_.readByte();
			}
		}
	}

	void method2824(RSByteBuffer class527_sub38, RSByteBuffer class527_sub38_248_, RSByteBuffer class527_sub38_249_, RSByteBuffer class527_sub38_250_, RSByteBuffer class527_sub38_251_, RSByteBuffer class527_sub38_252_) {
		for (int i = 0; i < anInt1926; i++) {
			int i_253_ = aByteArray1936[i] & 0xff;
			if (i_253_ == 0) {
				aShortArray1937[i] = (short) class527_sub38.readUnsignedShort();
				aShortArray1938[i] = (short) class527_sub38.readUnsignedShort();
				aShortArray1939[i] = (short) class527_sub38.readUnsignedShort();
			}
			if (i_253_ == 1) {
				aShortArray1937[i] = (short) class527_sub38_248_.readUnsignedShort();
				aShortArray1938[i] = (short) class527_sub38_248_.readUnsignedShort();
				aShortArray1939[i] = (short) class527_sub38_248_.readUnsignedShort();
				if (anInt1905 < 15) {
					anIntArray1930[i] = class527_sub38_249_.readUnsignedShort();
					if (anInt1905 < 14)
						anIntArray1941[i] = class527_sub38_249_.readUnsignedShort();
					else
						anIntArray1941[i] = class527_sub38_249_.read24BitUnsignedInteger(329218628);
					anIntArray1943[i] = class527_sub38_249_.readUnsignedShort();
				} else {
					anIntArray1930[i] = class527_sub38_249_.read24BitUnsignedInteger(1411266102);
					anIntArray1941[i] = class527_sub38_249_.read24BitUnsignedInteger(611190057);
					anIntArray1943[i] = class527_sub38_249_.read24BitUnsignedInteger(2095689495);
				}
				aByteArray1946[i] = class527_sub38_250_.readByte();
				aByteArray1932[i] = class527_sub38_251_.readByte();
				anIntArray1902[i] = class527_sub38_252_.readByte();
			}
			if (i_253_ == 2) {
				aShortArray1937[i] = (short) class527_sub38_248_.readUnsignedShort();
				aShortArray1938[i] = (short) class527_sub38_248_.readUnsignedShort();
				aShortArray1939[i] = (short) class527_sub38_248_.readUnsignedShort();
				if (anInt1905 < 15) {
					anIntArray1930[i] = class527_sub38_249_.readUnsignedShort();
					if (anInt1905 < 14)
						anIntArray1941[i] = class527_sub38_249_.readUnsignedShort();
					else
						anIntArray1941[i] = class527_sub38_249_.read24BitUnsignedInteger(1662284342);
					anIntArray1943[i] = class527_sub38_249_.readUnsignedShort();
				} else {
					anIntArray1930[i] = class527_sub38_249_.read24BitUnsignedInteger(1708274126);
					anIntArray1941[i] = class527_sub38_249_.read24BitUnsignedInteger(1769637392);
					anIntArray1943[i] = class527_sub38_249_.read24BitUnsignedInteger(1346427716);
				}
				aByteArray1946[i] = class527_sub38_250_.readByte();
				aByteArray1932[i] = class527_sub38_251_.readByte();
				anIntArray1902[i] = class527_sub38_252_.readByte();
				anIntArray1950[i] = class527_sub38_252_.readByte();
				anIntArray1945[i] = class527_sub38_252_.readByte();
			}
			if (i_253_ == 3) {
				aShortArray1937[i] = (short) class527_sub38_248_.readUnsignedShort();
				aShortArray1938[i] = (short) class527_sub38_248_.readUnsignedShort();
				aShortArray1939[i] = (short) class527_sub38_248_.readUnsignedShort();
				if (anInt1905 < 15) {
					anIntArray1930[i] = class527_sub38_249_.readUnsignedShort();
					if (anInt1905 < 14)
						anIntArray1941[i] = class527_sub38_249_.readUnsignedShort();
					else
						anIntArray1941[i] = class527_sub38_249_.read24BitUnsignedInteger(950978228);
					anIntArray1943[i] = class527_sub38_249_.readUnsignedShort();
				} else {
					anIntArray1930[i] = class527_sub38_249_.read24BitUnsignedInteger(505557817);
					anIntArray1941[i] = class527_sub38_249_.read24BitUnsignedInteger(450282408);
					anIntArray1943[i] = class527_sub38_249_.read24BitUnsignedInteger(162018491);
				}
				aByteArray1946[i] = class527_sub38_250_.readByte();
				aByteArray1932[i] = class527_sub38_251_.readByte();
				anIntArray1902[i] = class527_sub38_252_.readByte();
			}
		}
	}

	void method2825(RSByteBuffer class527_sub38, RSByteBuffer class527_sub38_254_, RSByteBuffer class527_sub38_255_, RSByteBuffer class527_sub38_256_, RSByteBuffer class527_sub38_257_, RSByteBuffer class527_sub38_258_) {
		for (int i = 0; i < anInt1926; i++) {
			int i_259_ = aByteArray1936[i] & 0xff;
			if (i_259_ == 0) {
				aShortArray1937[i] = (short) class527_sub38.readUnsignedShort();
				aShortArray1938[i] = (short) class527_sub38.readUnsignedShort();
				aShortArray1939[i] = (short) class527_sub38.readUnsignedShort();
			}
			if (i_259_ == 1) {
				aShortArray1937[i] = (short) class527_sub38_254_.readUnsignedShort();
				aShortArray1938[i] = (short) class527_sub38_254_.readUnsignedShort();
				aShortArray1939[i] = (short) class527_sub38_254_.readUnsignedShort();
				if (anInt1905 < 15) {
					anIntArray1930[i] = class527_sub38_255_.readUnsignedShort();
					if (anInt1905 < 14)
						anIntArray1941[i] = class527_sub38_255_.readUnsignedShort();
					else
						anIntArray1941[i] = class527_sub38_255_.read24BitUnsignedInteger(655769337);
					anIntArray1943[i] = class527_sub38_255_.readUnsignedShort();
				} else {
					anIntArray1930[i] = class527_sub38_255_.read24BitUnsignedInteger(1474323675);
					anIntArray1941[i] = class527_sub38_255_.read24BitUnsignedInteger(793168792);
					anIntArray1943[i] = class527_sub38_255_.read24BitUnsignedInteger(1193963800);
				}
				aByteArray1946[i] = class527_sub38_256_.readByte();
				aByteArray1932[i] = class527_sub38_257_.readByte();
				anIntArray1902[i] = class527_sub38_258_.readByte();
			}
			if (i_259_ == 2) {
				aShortArray1937[i] = (short) class527_sub38_254_.readUnsignedShort();
				aShortArray1938[i] = (short) class527_sub38_254_.readUnsignedShort();
				aShortArray1939[i] = (short) class527_sub38_254_.readUnsignedShort();
				if (anInt1905 < 15) {
					anIntArray1930[i] = class527_sub38_255_.readUnsignedShort();
					if (anInt1905 < 14)
						anIntArray1941[i] = class527_sub38_255_.readUnsignedShort();
					else
						anIntArray1941[i] = class527_sub38_255_.read24BitUnsignedInteger(89098806);
					anIntArray1943[i] = class527_sub38_255_.readUnsignedShort();
				} else {
					anIntArray1930[i] = class527_sub38_255_.read24BitUnsignedInteger(526511140);
					anIntArray1941[i] = class527_sub38_255_.read24BitUnsignedInteger(34851331);
					anIntArray1943[i] = class527_sub38_255_.read24BitUnsignedInteger(1021637825);
				}
				aByteArray1946[i] = class527_sub38_256_.readByte();
				aByteArray1932[i] = class527_sub38_257_.readByte();
				anIntArray1902[i] = class527_sub38_258_.readByte();
				anIntArray1950[i] = class527_sub38_258_.readByte();
				anIntArray1945[i] = class527_sub38_258_.readByte();
			}
			if (i_259_ == 3) {
				aShortArray1937[i] = (short) class527_sub38_254_.readUnsignedShort();
				aShortArray1938[i] = (short) class527_sub38_254_.readUnsignedShort();
				aShortArray1939[i] = (short) class527_sub38_254_.readUnsignedShort();
				if (anInt1905 < 15) {
					anIntArray1930[i] = class527_sub38_255_.readUnsignedShort();
					if (anInt1905 < 14)
						anIntArray1941[i] = class527_sub38_255_.readUnsignedShort();
					else
						anIntArray1941[i] = class527_sub38_255_.read24BitUnsignedInteger(2070534790);
					anIntArray1943[i] = class527_sub38_255_.readUnsignedShort();
				} else {
					anIntArray1930[i] = class527_sub38_255_.read24BitUnsignedInteger(1468354058);
					anIntArray1941[i] = class527_sub38_255_.read24BitUnsignedInteger(1148509647);
					anIntArray1943[i] = class527_sub38_255_.read24BitUnsignedInteger(186912564);
				}
				aByteArray1946[i] = class527_sub38_256_.readByte();
				aByteArray1932[i] = class527_sub38_257_.readByte();
				anIntArray1902[i] = class527_sub38_258_.readByte();
			}
		}
	}

	public void method2826(int i, int i_260_, int i_261_) {
		for (int i_262_ = 0; i_262_ < anInt1906; i_262_++) {
			anIntArray1908[i_262_] += i;
			anIntArray1909[i_262_] += i_260_;
			anIntArray1910[i_262_] += i_261_;
		}
	}

	public int method2827(int i, int i_263_, int i_264_) {
		for (int i_265_ = 0; i_265_ < anInt1906; i_265_++) {
			if (anIntArray1908[i_265_] == i && anIntArray1909[i_265_] == i_263_ && anIntArray1910[i_265_] == i_264_)
				return i_265_;
		}
		anIntArray1908[anInt1906] = i;
		anIntArray1909[anInt1906] = i_263_;
		anIntArray1910[anInt1906] = i_264_;
		anInt1912 = anInt1906 + 1;
		return anInt1906++;
	}

	public int method2828(int i, int i_266_, int i_267_) {
		for (int i_268_ = 0; i_268_ < anInt1906; i_268_++) {
			if (anIntArray1908[i_268_] == i && anIntArray1909[i_268_] == i_266_ && anIntArray1910[i_268_] == i_267_)
				return i_268_;
		}
		anIntArray1908[anInt1906] = i;
		anIntArray1909[anInt1906] = i_266_;
		anIntArray1910[anInt1906] = i_267_;
		anInt1912 = anInt1906 + 1;
		return anInt1906++;
	}

	public void method2829(int i) {
		for (int i_269_ = 0; i_269_ < anInt1906; i_269_++) {
			anIntArray1908[i_269_] <<= i;
			anIntArray1909[i_269_] <<= i;
			anIntArray1910[i_269_] <<= i;
		}
		if (anInt1926 > 0 && anIntArray1930 != null) {
			for (int i_270_ = 0; i_270_ < anIntArray1930.length; i_270_++) {
				anIntArray1930[i_270_] <<= i;
				anIntArray1941[i_270_] <<= i;
				if (aByteArray1936[i_270_] != 1)
					anIntArray1943[i_270_] <<= i;
			}
		}
	}

	public byte method2830(short i, short i_271_, short i_272_) {
		if (anInt1926 >= 255)
			throw new IllegalStateException();
		aByteArray1936[anInt1926] = (byte) 0;
		aShortArray1937[anInt1926] = i;
		aShortArray1938[anInt1926] = i_271_;
		aShortArray1939[anInt1926] = i_272_;
		return (byte) anInt1926++;
	}

	public byte method2831(short i, short i_273_, short i_274_, short i_275_, short i_276_, short i_277_, byte i_278_, byte i_279_, byte i_280_) {
		if (anInt1926 >= 255)
			throw new IllegalStateException();
		aByteArray1936[anInt1926] = (byte) 3;
		aShortArray1937[anInt1926] = i;
		aShortArray1938[anInt1926] = i_273_;
		aShortArray1939[anInt1926] = i_274_;
		anIntArray1930[anInt1926] = i_275_;
		anIntArray1941[anInt1926] = i_276_;
		anIntArray1943[anInt1926] = i_277_;
		aByteArray1946[anInt1926] = i_278_;
		aByteArray1932[anInt1926] = i_279_;
		anIntArray1902[anInt1926] = i_280_;
		return (byte) anInt1926++;
	}

	public int[][] method2832(boolean bool) {
		int[] is = new int[400];
		int i = 0;
		int i_281_ = bool ? anInt1906 : anInt1912;
		for (int i_282_ = 0; i_282_ < i_281_; i_282_++) {
			int i_283_ = anIntArray1921[i_282_];
			if (i_283_ >= 0) {
				is[i_283_]++;
				if (i_283_ > i)
					i = i_283_;
			}
		}
		int[][] is_284_ = new int[i + 1][];
		for (int i_285_ = 0; i_285_ <= i; i_285_++) {
			is_284_[i_285_] = new int[is[i_285_]];
			is[i_285_] = 0;
		}
		for (int i_286_ = 0; i_286_ < i_281_; i_286_++) {
			int i_287_ = anIntArray1921[i_286_];
			if (i_287_ >= 0)
				is_284_[i_287_][is[i_287_]++] = i_286_;
		}
		return is_284_;
	}

	public int[][] method2833(boolean bool) {
		int[] is = new int[400];
		int i = 0;
		int i_288_ = bool ? anInt1906 : anInt1912;
		for (int i_289_ = 0; i_289_ < i_288_; i_289_++) {
			int i_290_ = anIntArray1921[i_289_];
			if (i_290_ >= 0) {
				is[i_290_]++;
				if (i_290_ > i)
					i = i_290_;
			}
		}
		int[][] is_291_ = new int[i + 1][];
		for (int i_292_ = 0; i_292_ <= i; i_292_++) {
			is_291_[i_292_] = new int[is[i_292_]];
			is[i_292_] = 0;
		}
		for (int i_293_ = 0; i_293_ < i_288_; i_293_++) {
			int i_294_ = anIntArray1921[i_293_];
			if (i_294_ >= 0)
				is_291_[i_294_][is[i_294_]++] = i_293_;
		}
		return is_291_;
	}

	public int[][] method2834() {
		int[] is = new int[256];
		int i = 0;
		for (int i_295_ = 0; i_295_ < anInt1917; i_295_++) {
			int i_296_ = anIntArray1914[i_295_];
			if (i_296_ >= 0) {
				is[i_296_]++;
				if (i_296_ > i)
					i = i_296_;
			}
		}
		int[][] is_297_ = new int[i + 1][];
		for (int i_298_ = 0; i_298_ <= i; i_298_++) {
			is_297_[i_298_] = new int[is[i_298_]];
			is[i_298_] = 0;
		}
		for (int i_299_ = 0; i_299_ < anInt1917; i_299_++) {
			int i_300_ = anIntArray1914[i_299_];
			if (i_300_ >= 0)
				is_297_[i_300_][is[i_300_]++] = i_299_;
		}
		return is_297_;
	}

	public int[][] method2835() {
		int[] is = new int[256];
		int i = 0;
		for (int i_301_ = 0; i_301_ < anInt1917; i_301_++) {
			int i_302_ = anIntArray1914[i_301_];
			if (i_302_ >= 0) {
				is[i_302_]++;
				if (i_302_ > i)
					i = i_302_;
			}
		}
		int[][] is_303_ = new int[i + 1][];
		for (int i_304_ = 0; i_304_ <= i; i_304_++) {
			is_303_[i_304_] = new int[is[i_304_]];
			is[i_304_] = 0;
		}
		for (int i_305_ = 0; i_305_ < anInt1917; i_305_++) {
			int i_306_ = anIntArray1914[i_305_];
			if (i_306_ >= 0)
				is_303_[i_306_][is[i_306_]++] = i_305_;
		}
		return is_303_;
	}

	public int[][] method2836() {
		int[] is = new int[256];
		int i = 0;
		for (int i_307_ = 0; i_307_ < aClass183Array1947.length; i_307_++) {
			int i_308_ = aClass183Array1947[i_307_].anInt2096 * 302411983;
			if (i_308_ >= 0) {
				is[i_308_]++;
				if (i_308_ > i)
					i = i_308_;
			}
		}
		int[][] is_309_ = new int[i + 1][];
		for (int i_310_ = 0; i_310_ <= i; i_310_++) {
			is_309_[i_310_] = new int[is[i_310_]];
			is[i_310_] = 0;
		}
		for (int i_311_ = 0; i_311_ < aClass183Array1947.length; i_311_++) {
			int i_312_ = aClass183Array1947[i_311_].anInt2096 * 302411983;
			if (i_312_ >= 0)
				is_309_[i_312_][is[i_312_]++] = i_311_;
		}
		return is_309_;
	}

	public void method2837(int i, int i_313_, int i_314_) {
		for (int i_315_ = 0; i_315_ < anInt1906; i_315_++) {
			anIntArray1908[i_315_] += i;
			anIntArray1909[i_315_] += i_313_;
			anIntArray1910[i_315_] += i_314_;
		}
	}

	public void method2838(short i, short i_316_) {
		if (aShortArray1929 != null) {
			for (int i_317_ = 0; i_317_ < anInt1917; i_317_++) {
				if (aShortArray1929[i_317_] == i)
					aShortArray1929[i_317_] = i_316_;
			}
		}
	}

	public void method2839(short i, short i_318_) {
		for (int i_319_ = 0; i_319_ < anInt1917; i_319_++) {
			if (aShortArray1942[i_319_] == i)
				aShortArray1942[i_319_] = i_318_;
		}
	}

	public void method2840(int i, int i_320_, int i_321_) {
		if (i_321_ != 0) {
			int i_322_ = Class428.anIntArray4825[i_321_];
			int i_323_ = Class428.anIntArray4819[i_321_];
			for (int i_324_ = 0; i_324_ < anInt1906; i_324_++) {
				int i_325_ = ((anIntArray1909[i_324_] * i_322_ + anIntArray1908[i_324_] * i_323_) >> 14);
				anIntArray1909[i_324_] = (anIntArray1909[i_324_] * i_323_ - anIntArray1908[i_324_] * i_322_) >> 14;
				anIntArray1908[i_324_] = i_325_;
			}
		}
		if (i != 0) {
			int i_326_ = Class428.anIntArray4825[i];
			int i_327_ = Class428.anIntArray4819[i];
			for (int i_328_ = 0; i_328_ < anInt1906; i_328_++) {
				int i_329_ = ((anIntArray1909[i_328_] * i_327_ - anIntArray1910[i_328_] * i_326_) >> 14);
				anIntArray1910[i_328_] = (anIntArray1909[i_328_] * i_326_ + anIntArray1910[i_328_] * i_327_) >> 14;
				anIntArray1909[i_328_] = i_329_;
			}
		}
		if (i_320_ != 0) {
			int i_330_ = Class428.anIntArray4825[i_320_];
			int i_331_ = Class428.anIntArray4819[i_320_];
			for (int i_332_ = 0; i_332_ < anInt1906; i_332_++) {
				int i_333_ = ((anIntArray1910[i_332_] * i_330_ + anIntArray1908[i_332_] * i_331_) >> 14);
				anIntArray1910[i_332_] = (anIntArray1910[i_332_] * i_331_ - anIntArray1908[i_332_] * i_330_) >> 14;
				anIntArray1908[i_332_] = i_333_;
			}
		}
	}

	public void method2841(short i, short i_334_) {
		if (aShortArray1929 != null) {
			for (int i_335_ = 0; i_335_ < anInt1917; i_335_++) {
				if (aShortArray1929[i_335_] == i)
					aShortArray1929[i_335_] = i_334_;
			}
		}
	}

	public void method2842(int i, int i_336_, int i_337_) {
		for (int i_338_ = 0; i_338_ < anInt1906; i_338_++) {
			anIntArray1908[i_338_] += i;
			anIntArray1909[i_338_] += i_336_;
			anIntArray1910[i_338_] += i_337_;
		}
	}

	public int method2843(int i, int i_339_, int i_340_, byte i_341_, byte i_342_, short i_343_, byte i_344_, short i_345_) {
		aShortArray1918[anInt1917] = (short) i;
		aShortArray1940[anInt1917] = (short) i_339_;
		aShortArray1920[anInt1917] = (short) i_340_;
		aByteArray1928[anInt1917] = i_341_;
		aShortArray1927[anInt1917] = (short) i_342_;
		aShortArray1942[anInt1917] = i_343_;
		aByteArray1907[anInt1917] = i_344_;
		aShortArray1929[anInt1917] = i_345_;
		return anInt1917++;
	}

	public void method2844(int i, int i_346_, int i_347_) {
		if (i_347_ != 0) {
			int i_348_ = Class428.anIntArray4825[i_347_];
			int i_349_ = Class428.anIntArray4819[i_347_];
			for (int i_350_ = 0; i_350_ < anInt1906; i_350_++) {
				int i_351_ = ((anIntArray1909[i_350_] * i_348_ + anIntArray1908[i_350_] * i_349_) >> 14);
				anIntArray1909[i_350_] = (anIntArray1909[i_350_] * i_349_ - anIntArray1908[i_350_] * i_348_) >> 14;
				anIntArray1908[i_350_] = i_351_;
			}
		}
		if (i != 0) {
			int i_352_ = Class428.anIntArray4825[i];
			int i_353_ = Class428.anIntArray4819[i];
			for (int i_354_ = 0; i_354_ < anInt1906; i_354_++) {
				int i_355_ = ((anIntArray1909[i_354_] * i_353_ - anIntArray1910[i_354_] * i_352_) >> 14);
				anIntArray1910[i_354_] = (anIntArray1909[i_354_] * i_352_ + anIntArray1910[i_354_] * i_353_) >> 14;
				anIntArray1909[i_354_] = i_355_;
			}
		}
		if (i_346_ != 0) {
			int i_356_ = Class428.anIntArray4825[i_346_];
			int i_357_ = Class428.anIntArray4819[i_346_];
			for (int i_358_ = 0; i_358_ < anInt1906; i_358_++) {
				int i_359_ = ((anIntArray1910[i_358_] * i_356_ + anIntArray1908[i_358_] * i_357_) >> 14);
				anIntArray1910[i_358_] = (anIntArray1910[i_358_] * i_357_ - anIntArray1908[i_358_] * i_356_) >> 14;
				anIntArray1908[i_358_] = i_359_;
			}
		}
	}

	public void method2845(int i, int i_360_, int i_361_) {
		if (i_361_ != 0) {
			int i_362_ = Class428.anIntArray4825[i_361_];
			int i_363_ = Class428.anIntArray4819[i_361_];
			for (int i_364_ = 0; i_364_ < anInt1906; i_364_++) {
				int i_365_ = ((anIntArray1909[i_364_] * i_362_ + anIntArray1908[i_364_] * i_363_) >> 14);
				anIntArray1909[i_364_] = (anIntArray1909[i_364_] * i_363_ - anIntArray1908[i_364_] * i_362_) >> 14;
				anIntArray1908[i_364_] = i_365_;
			}
		}
		if (i != 0) {
			int i_366_ = Class428.anIntArray4825[i];
			int i_367_ = Class428.anIntArray4819[i];
			for (int i_368_ = 0; i_368_ < anInt1906; i_368_++) {
				int i_369_ = ((anIntArray1909[i_368_] * i_367_ - anIntArray1910[i_368_] * i_366_) >> 14);
				anIntArray1910[i_368_] = (anIntArray1909[i_368_] * i_366_ + anIntArray1910[i_368_] * i_367_) >> 14;
				anIntArray1909[i_368_] = i_369_;
			}
		}
		if (i_360_ != 0) {
			int i_370_ = Class428.anIntArray4825[i_360_];
			int i_371_ = Class428.anIntArray4819[i_360_];
			for (int i_372_ = 0; i_372_ < anInt1906; i_372_++) {
				int i_373_ = ((anIntArray1910[i_372_] * i_370_ + anIntArray1908[i_372_] * i_371_) >> 14);
				anIntArray1910[i_372_] = (anIntArray1910[i_372_] * i_371_ - anIntArray1908[i_372_] * i_370_) >> 14;
				anIntArray1908[i_372_] = i_373_;
			}
		}
	}

	public void method2846(int i) {
		for (int i_374_ = 0; i_374_ < anInt1906; i_374_++) {
			anIntArray1908[i_374_] <<= i;
			anIntArray1909[i_374_] <<= i;
			anIntArray1910[i_374_] <<= i;
		}
		if (anInt1926 > 0 && anIntArray1930 != null) {
			for (int i_375_ = 0; i_375_ < anIntArray1930.length; i_375_++) {
				anIntArray1930[i_375_] <<= i;
				anIntArray1941[i_375_] <<= i;
				if (aByteArray1936[i_375_] != 1)
					anIntArray1943[i_375_] <<= i;
			}
		}
	}

	public int method2847(int i, int i_376_, int i_377_) {
		for (int i_378_ = 0; i_378_ < anInt1906; i_378_++) {
			if (anIntArray1908[i_378_] == i && anIntArray1909[i_378_] == i_376_ && anIntArray1910[i_378_] == i_377_)
				return i_378_;
		}
		anIntArray1908[anInt1906] = i;
		anIntArray1909[anInt1906] = i_376_;
		anIntArray1910[anInt1906] = i_377_;
		anInt1912 = anInt1906 + 1;
		return anInt1906++;
	}

	public void method2848(int i) {
		for (int i_379_ = 0; i_379_ < anInt1906; i_379_++) {
			anIntArray1908[i_379_] <<= i;
			anIntArray1909[i_379_] <<= i;
			anIntArray1910[i_379_] <<= i;
		}
		if (anInt1926 > 0 && anIntArray1930 != null) {
			for (int i_380_ = 0; i_380_ < anIntArray1930.length; i_380_++) {
				anIntArray1930[i_380_] <<= i;
				anIntArray1941[i_380_] <<= i;
				if (aByteArray1936[i_380_] != 1)
					anIntArray1943[i_380_] <<= i;
			}
		}
	}

	public int method2849(int i, int i_381_, int i_382_) {
		for (int i_383_ = 0; i_383_ < anInt1906; i_383_++) {
			if (anIntArray1908[i_383_] == i && anIntArray1909[i_383_] == i_381_ && anIntArray1910[i_383_] == i_382_)
				return i_383_;
		}
		anIntArray1908[anInt1906] = i;
		anIntArray1909[anInt1906] = i_381_;
		anIntArray1910[anInt1906] = i_382_;
		anInt1912 = anInt1906 + 1;
		return anInt1906++;
	}

	final int method2850(Class175 class175_384_, int i, short i_385_) {
		int i_386_ = class175_384_.anIntArray1908[i];
		int i_387_ = class175_384_.anIntArray1909[i];
		int i_388_ = class175_384_.anIntArray1910[i];
		for (int i_389_ = 0; i_389_ < anInt1906; i_389_++) {
			if (i_386_ == anIntArray1908[i_389_] && i_387_ == anIntArray1909[i_389_] && i_388_ == anIntArray1910[i_389_]) {
				aShortArray1913[i_389_] |= i_385_;
				return i_389_;
			}
		}
		anIntArray1908[anInt1906] = i_386_;
		anIntArray1909[anInt1906] = i_387_;
		anIntArray1910[anInt1906] = i_388_;
		aShortArray1913[anInt1906] = i_385_;
		anIntArray1921[anInt1906] = (class175_384_.anIntArray1921 != null ? class175_384_.anIntArray1921[i] : -1);
		return anInt1906++;
	}

	public void method2851(int i) {
		for (int i_390_ = 0; i_390_ < anInt1906; i_390_++) {
			anIntArray1908[i_390_] <<= i;
			anIntArray1909[i_390_] <<= i;
			anIntArray1910[i_390_] <<= i;
		}
		if (anInt1926 > 0 && anIntArray1930 != null) {
			for (int i_391_ = 0; i_391_ < anIntArray1930.length; i_391_++) {
				anIntArray1930[i_391_] <<= i;
				anIntArray1941[i_391_] <<= i;
				if (aByteArray1936[i_391_] != 1)
					anIntArray1943[i_391_] <<= i;
			}
		}
	}

	public void method2852(float f) {
		for (int i = 0; i < anInt1906; i++) {
			anIntArray1908[i] *= f;
			anIntArray1909[i] *= f;
			anIntArray1910[i] *= f;
		}
		if (anInt1926 > 0 && anIntArray1930 != null) {
			for (int i = 0; i < anIntArray1930.length; i++) {
				anIntArray1930[i] *= f;
				anIntArray1941[i] *= f;
				if (aByteArray1936[i] != 1)
					anIntArray1943[i] *= f;
			}
		}
	}

	public void method2853(short i, short i_392_) {
		if (aShortArray1929 != null) {
			for (int i_393_ = 0; i_393_ < anInt1917; i_393_++) {
				if (aShortArray1929[i_393_] == i)
					aShortArray1929[i_393_] = i_392_;
			}
		}
	}

	public void method2854(float f) {
		for (int i = 0; i < anInt1906; i++) {
			anIntArray1908[i] *= f;
			anIntArray1909[i] *= f;
			anIntArray1910[i] *= f;
		}
		if (anInt1926 > 0 && anIntArray1930 != null) {
			for (int i = 0; i < anIntArray1930.length; i++) {
				anIntArray1930[i] *= f;
				anIntArray1941[i] *= f;
				if (aByteArray1936[i] != 1)
					anIntArray1943[i] *= f;
			}
		}
	}
}
