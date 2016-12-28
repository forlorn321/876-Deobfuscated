/* Class191 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class191 implements DefinitionI {
	public boolean aBool2152;
	Class206 aClass206_2153;
	public int anInt2154;
	public int[] anIntArray2155;
	public int[] anIntArray2156;
	public int[] anIntArray2157;
	public int anInt2158;
	public int anInt2159;
	int anInt2160;
	public int[][] anIntArrayArray2161;
	public int anInt2162;
	public int anInt2163;
	public int anInt2164;
	public boolean aBool2165;
	public static boolean aBool2166 = false;
	public int anInt2167;
	public int anInt2168;
	public int anInt2169;
	public int anInt2170;
	public Class186 aClass186_2171;
	public int[] anIntArray2172;
	public int[] anIntArray2173;
	public int[] anIntArray2174;
	Class4 aClass4_2175;
	public int anInt2176 = 0;

	public void method77() {
		if (-1 == -833363861 * anInt2167) {
			if (null != aClass186_2171 && null != aClass186_2171.aBoolArray2126)
				anInt2167 = 986421382;
			else
				anInt2167 = 0;
		}
		if (-1 == anInt2168 * 713510171) {
			if (aClass186_2171 != null && null != aClass186_2171.aBoolArray2126)
				anInt2168 = -2001827290;
			else
				anInt2168 = 0;
		}
		if (null != anIntArray2157) {
			anInt2176 = 0;
			for (int i = 0; i < anIntArray2157.length; i++)
				anInt2176 += anIntArray2157[i] * 2051078915;
		}
	}

	public void method75(byte i) {
		if (-1 == -833363861 * anInt2167) {
			if (null != aClass186_2171 && null != aClass186_2171.aBoolArray2126)
				anInt2167 = 986421382;
			else
				anInt2167 = 0;
		}
		if (-1 == anInt2168 * 713510171) {
			if (aClass186_2171 != null && null != aClass186_2171.aBoolArray2126)
				anInt2168 = -2001827290;
			else
				anInt2168 = 0;
		}
		if (null != anIntArray2157) {
			anInt2176 = 0;
			for (int i_0_ = 0; i_0_ < anIntArray2157.length; i_0_++)
				anInt2176 += anIntArray2157[i_0_] * 2051078915;
		}
	}

	public void method74(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_1_ = class536_sub33.readUnsignedByte();
			if (0 == i_1_)
				break;
			method2832(class536_sub33, i_1_, (byte) 3);
		}
	}

	public int method2829(int i, int i_2_, int i_3_) {
		if (aClass4_2175 == null)
			return i_2_;
		Class536_Sub26 class536_sub26 = (Class536_Sub26) aClass4_2175.method556((long) i);
		if (null == class536_sub26)
			return i_2_;
		return 2083602213 * class536_sub26.anInt10533;
	}

	public String method2830(int i, String string, int i_4_) {
		if (aClass4_2175 == null)
			return string;
		Class536_Sub13 class536_sub13 = (Class536_Sub13) aClass4_2175.method556((long) i);
		if (null == class536_sub13)
			return string;
		return (String) class536_sub13.anObject10468;
	}

	Class191(int i, Class206 class206) {
		anInt2160 = -170884507;
		anInt2158 = -554355403;
		anInt2163 = 665923857;
		anInt2164 = 2015247881;
		anInt2162 = 138397899;
		anInt2170 = -76534399;
		anInt2167 = 1654272957;
		anInt2168 = -1146570003;
		anInt2169 = -974461902;
		aBool2152 = false;
		aBool2165 = false;
		anInt2159 = 1164796991;
		anInt2154 = i * 1252475461;
		aClass206_2153 = class206;
	}

	public boolean method2831() {
		if (anIntArray2155 == null)
			return true;
		boolean bool = true;
		int[] is = anIntArray2155;
		for (int i = 0; i < is.length; i++) {
			int i_5_ = is[i];
			if (aClass206_2153.method2952(i_5_ >>> 16, 1329033712) == null)
				bool = false;
		}
		return bool;
	}

	void method2832(RSByteBuffer class536_sub33, int i, byte i_6_) {
		if (i == 1) {
			int i_7_ = class536_sub33.readUnsignedShort();
			anIntArray2157 = new int[i_7_];
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
				anIntArray2157[i_8_] = class536_sub33.readUnsignedShort();
			anIntArray2155 = new int[i_7_];
			for (int i_9_ = 0; i_9_ < i_7_; i_9_++)
				anIntArray2155[i_9_] = class536_sub33.readUnsignedShort();
			for (int i_10_ = 0; i_10_ < i_7_; i_10_++)
				anIntArray2155[i_10_] = ((class536_sub33.readUnsignedShort() << 16) + anIntArray2155[i_10_]);
		} else if (i == 2)
			anInt2158 = class536_sub33.readUnsignedShort() * 554355403;
		else if (i == 5)
			anInt2163 = class536_sub33.readUnsignedByte() * -1584802147;
		else if (i == 6)
			anInt2164 = class536_sub33.readUnsignedShort() * -2015247881;
		else if (i == 7)
			anInt2162 = class536_sub33.readUnsignedShort() * -138397899;
		else if (i == 8)
			anInt2170 = class536_sub33.readUnsignedByte() * 1864717771;
		else if (9 == i)
			anInt2167 = class536_sub33.readUnsignedByte() * -1654272957;
		else if (10 == i)
			anInt2168 = class536_sub33.readUnsignedByte() * 1146570003;
		else if (i == 11)
			anInt2169 = class536_sub33.readUnsignedByte() * 1660252697;
		else if (12 == i || i == 112) {
			int i_11_;
			if (i == 12)
				i_11_ = class536_sub33.readUnsignedByte();
			else
				i_11_ = class536_sub33.readUnsignedShort();
			anIntArray2156 = new int[i_11_];
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
				anIntArray2156[i_12_] = class536_sub33.readUnsignedShort();
			for (int i_13_ = 0; i_13_ < i_11_; i_13_++)
				anIntArray2156[i_13_] = ((class536_sub33.readUnsignedShort() << 16) + anIntArray2156[i_13_]);
		} else if (i == 13) {
			int i_14_ = class536_sub33.readUnsignedShort();
			anIntArrayArray2161 = new int[i_14_][];
			for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
				int i_16_ = class536_sub33.readUnsignedByte();
				if (i_16_ > 0) {
					anIntArrayArray2161[i_15_] = new int[i_16_];
					anIntArrayArray2161[i_15_][0] = class536_sub33.read24BitUnsignedInteger();
					for (int i_17_ = 1; i_17_ < i_16_; i_17_++)
						anIntArrayArray2161[i_15_][i_17_] = class536_sub33.readUnsignedShort();
				}
			}
		} else if (i == 14)
			aBool2152 = true;
		else if (i == 15)
			aBool2165 = true;
		else if (16 != i && i != 18) {
			if (i == 19 || i == 119) {
				if (null == anIntArray2172) {
					anIntArray2172 = new int[anIntArrayArray2161.length];
					for (int i_18_ = 0; i_18_ < anIntArrayArray2161.length; i_18_++)
						anIntArray2172[i_18_] = 255;
				}
				int i_19_;
				if (19 == i)
					i_19_ = class536_sub33.readUnsignedByte();
				else
					i_19_ = class536_sub33.readUnsignedShort();
				anIntArray2172[i_19_] = class536_sub33.readUnsignedByte();
			} else if (20 == i || i == 120) {
				if (null == anIntArray2173 || null == anIntArray2174) {
					anIntArray2173 = new int[anIntArrayArray2161.length];
					anIntArray2174 = new int[anIntArrayArray2161.length];
					for (int i_20_ = 0; i_20_ < anIntArrayArray2161.length; i_20_++) {
						anIntArray2173[i_20_] = 256;
						anIntArray2174[i_20_] = 256;
					}
				}
				int i_21_;
				if (20 == i)
					i_21_ = class536_sub33.readUnsignedByte();
				else
					i_21_ = class536_sub33.readUnsignedShort();
				anIntArray2173[i_21_] = class536_sub33.readUnsignedShort();
				anIntArray2174[i_21_] = class536_sub33.readUnsignedShort();
			} else if (22 == i)
				anInt2159 = class536_sub33.readUnsignedByte() * -1164796991;
			else if (i == 23)
				class536_sub33.readUnsignedShort();
			else if (24 == i) {
				anInt2160 = class536_sub33.readUnsignedShort() * 170884507;
				if (aClass206_2153 != null)
					aClass186_2171 = ((Class186) aClass206_2153.anInterface12_2237.method70(1229889683 * anInt2160, (byte) -34));
			} else if (249 == i) {
				int i_22_ = class536_sub33.readUnsignedByte();
				if (aClass4_2175 == null) {
					int i_23_ = Class528.method6434(i_22_, -1793203440);
					aClass4_2175 = new Class4(i_23_);
				}
				for (int i_24_ = 0; i_24_ < i_22_; i_24_++) {
					boolean bool = class536_sub33.readUnsignedByte() == 1;
					int i_25_ = class536_sub33.read24BitUnsignedInteger();
					Class536 class536;
					if (bool)
						class536 = new Class536_Sub13(class536_sub33.readString());
					else
						class536 = new Class536_Sub26(class536_sub33.readInt());
					aClass4_2175.method560(class536, (long) i_25_);
				}
			}
		}
	}

	void method2833(RSByteBuffer class536_sub33, int i) {
		if (i == 1) {
			int i_26_ = class536_sub33.readUnsignedShort();
			anIntArray2157 = new int[i_26_];
			for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
				anIntArray2157[i_27_] = class536_sub33.readUnsignedShort();
			anIntArray2155 = new int[i_26_];
			for (int i_28_ = 0; i_28_ < i_26_; i_28_++)
				anIntArray2155[i_28_] = class536_sub33.readUnsignedShort();
			for (int i_29_ = 0; i_29_ < i_26_; i_29_++)
				anIntArray2155[i_29_] = ((class536_sub33.readUnsignedShort() << 16) + anIntArray2155[i_29_]);
		} else if (i == 2)
			anInt2158 = class536_sub33.readUnsignedShort() * 554355403;
		else if (i == 5)
			anInt2163 = class536_sub33.readUnsignedByte() * -1584802147;
		else if (i == 6)
			anInt2164 = class536_sub33.readUnsignedShort() * -2015247881;
		else if (i == 7)
			anInt2162 = class536_sub33.readUnsignedShort() * -138397899;
		else if (i == 8)
			anInt2170 = class536_sub33.readUnsignedByte() * 1864717771;
		else if (9 == i)
			anInt2167 = class536_sub33.readUnsignedByte() * -1654272957;
		else if (10 == i)
			anInt2168 = class536_sub33.readUnsignedByte() * 1146570003;
		else if (i == 11)
			anInt2169 = class536_sub33.readUnsignedByte() * 1660252697;
		else if (12 == i || i == 112) {
			int i_30_;
			if (i == 12)
				i_30_ = class536_sub33.readUnsignedByte();
			else
				i_30_ = class536_sub33.readUnsignedShort();
			anIntArray2156 = new int[i_30_];
			for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
				anIntArray2156[i_31_] = class536_sub33.readUnsignedShort();
			for (int i_32_ = 0; i_32_ < i_30_; i_32_++)
				anIntArray2156[i_32_] = ((class536_sub33.readUnsignedShort() << 16) + anIntArray2156[i_32_]);
		} else if (i == 13) {
			int i_33_ = class536_sub33.readUnsignedShort();
			anIntArrayArray2161 = new int[i_33_][];
			for (int i_34_ = 0; i_34_ < i_33_; i_34_++) {
				int i_35_ = class536_sub33.readUnsignedByte();
				if (i_35_ > 0) {
					anIntArrayArray2161[i_34_] = new int[i_35_];
					anIntArrayArray2161[i_34_][0] = class536_sub33.read24BitUnsignedInteger();
					for (int i_36_ = 1; i_36_ < i_35_; i_36_++)
						anIntArrayArray2161[i_34_][i_36_] = class536_sub33.readUnsignedShort();
				}
			}
		} else if (i == 14)
			aBool2152 = true;
		else if (i == 15)
			aBool2165 = true;
		else if (16 != i && i != 18) {
			if (i == 19 || i == 119) {
				if (null == anIntArray2172) {
					anIntArray2172 = new int[anIntArrayArray2161.length];
					for (int i_37_ = 0; i_37_ < anIntArrayArray2161.length; i_37_++)
						anIntArray2172[i_37_] = 255;
				}
				int i_38_;
				if (19 == i)
					i_38_ = class536_sub33.readUnsignedByte();
				else
					i_38_ = class536_sub33.readUnsignedShort();
				anIntArray2172[i_38_] = class536_sub33.readUnsignedByte();
			} else if (20 == i || i == 120) {
				if (null == anIntArray2173 || null == anIntArray2174) {
					anIntArray2173 = new int[anIntArrayArray2161.length];
					anIntArray2174 = new int[anIntArrayArray2161.length];
					for (int i_39_ = 0; i_39_ < anIntArrayArray2161.length; i_39_++) {
						anIntArray2173[i_39_] = 256;
						anIntArray2174[i_39_] = 256;
					}
				}
				int i_40_;
				if (20 == i)
					i_40_ = class536_sub33.readUnsignedByte();
				else
					i_40_ = class536_sub33.readUnsignedShort();
				anIntArray2173[i_40_] = class536_sub33.readUnsignedShort();
				anIntArray2174[i_40_] = class536_sub33.readUnsignedShort();
			} else if (22 == i)
				anInt2159 = class536_sub33.readUnsignedByte() * -1164796991;
			else if (i == 23)
				class536_sub33.readUnsignedShort();
			else if (24 == i) {
				anInt2160 = class536_sub33.readUnsignedShort() * 170884507;
				if (aClass206_2153 != null)
					aClass186_2171 = ((Class186) aClass206_2153.anInterface12_2237.method70(1229889683 * anInt2160, (byte) -43));
			} else if (249 == i) {
				int i_41_ = class536_sub33.readUnsignedByte();
				if (aClass4_2175 == null) {
					int i_42_ = Class528.method6434(i_41_, -1000106046);
					aClass4_2175 = new Class4(i_42_);
				}
				for (int i_43_ = 0; i_43_ < i_41_; i_43_++) {
					boolean bool = class536_sub33.readUnsignedByte() == 1;
					int i_44_ = class536_sub33.read24BitUnsignedInteger();
					Class536 class536;
					if (bool)
						class536 = new Class536_Sub13(class536_sub33.readString());
					else
						class536 = new Class536_Sub26(class536_sub33.readInt());
					aClass4_2175.method560(class536, (long) i_44_);
				}
			}
		}
	}

	public boolean method2834() {
		if (anIntArray2155 == null)
			return true;
		boolean bool = true;
		int[] is = anIntArray2155;
		for (int i = 0; i < is.length; i++) {
			int i_45_ = is[i];
			if (aClass206_2153.method2952(i_45_ >>> 16, 1499435709) == null)
				bool = false;
		}
		return bool;
	}

	public boolean method2835() {
		if (anIntArray2155 == null)
			return true;
		boolean bool = true;
		int[] is = anIntArray2155;
		for (int i = 0; i < is.length; i++) {
			int i_46_ = is[i];
			if (aClass206_2153.method2952(i_46_ >>> 16, 1907796483) == null)
				bool = false;
		}
		return bool;
	}

	public boolean method2836(int i) {
		if (anIntArray2155 == null)
			return true;
		boolean bool = true;
		int[] is = anIntArray2155;
		for (int i_47_ = 0; i_47_ < is.length; i_47_++) {
			int i_48_ = is[i_47_];
			if (aClass206_2153.method2952(i_48_ >>> 16, 2006188950) == null)
				bool = false;
		}
		return bool;
	}

	public boolean method2837() {
		if (anIntArray2155 == null)
			return true;
		boolean bool = true;
		int[] is = anIntArray2155;
		for (int i = 0; i < is.length; i++) {
			int i_49_ = is[i];
			if (aClass206_2153.method2952(i_49_ >>> 16, 2002974983) == null)
				bool = false;
		}
		return bool;
	}

	public int method2838(int i, int i_50_) {
		if (aClass4_2175 == null)
			return i_50_;
		Class536_Sub26 class536_sub26 = (Class536_Sub26) aClass4_2175.method556((long) i);
		if (null == class536_sub26)
			return i_50_;
		return 2083602213 * class536_sub26.anInt10533;
	}

	public int method2839(int i, int i_51_) {
		if (aClass4_2175 == null)
			return i_51_;
		Class536_Sub26 class536_sub26 = (Class536_Sub26) aClass4_2175.method556((long) i);
		if (null == class536_sub26)
			return i_51_;
		return 2083602213 * class536_sub26.anInt10533;
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (0 == i)
				break;
			method2832(class536_sub33, i, (byte) 3);
		}
	}

	static int method2840(Class461 class461, Class648 class648, int i) {
		if (class461 != null) {
			if (class648.method7819(-1966275174) > 1) {
				int i_52_ = class461.method5570(1085815444) - 1;
				return (i_52_ * class648.method7819(655682450) + class461.method5566(i_52_, -522748013));
			}
			return class461.method5566(class648.anInt8389 * 1716263195, 1096872211);
		}
		return 0;
	}
}
