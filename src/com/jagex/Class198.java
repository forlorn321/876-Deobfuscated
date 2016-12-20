/* Class198 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Container;
import java.awt.Dimension;

public class Class198 implements Interface14 {
	public int[] anIntArray2169;
	Class200 aClass200_2170;
	public int anInt2171;
	public int[] anIntArray2172;
	public int[] anIntArray2173;
	public int[] anIntArray2174;
	Class14 aClass14_2175;
	public int anInt2176;
	int anInt2177;
	public int[][] anIntArrayArray2178;
	public int anInt2179;
	public int anInt2180 = 0;
	public int anInt2181;
	public int anInt2182;
	public int anInt2183;
	public int[] anIntArray2184;
	public int anInt2185;
	public int anInt2186;
	public boolean aBool2187;
	public boolean aBool2188;
	public int[] anIntArray2189;
	public Class202 aClass202_2190;
	public int anInt2191;
	public static boolean aBool2192 = false;
	public int anInt2193;

	public String method3730(int i, String string) {
		if (null == aClass14_2175)
			return string;
		Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass14_2175.method709((long) i);
		if (class527_sub26 == null)
			return string;
		return (String) class527_sub26.anObject10522;
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_0_ = class527_sub38.readUnsignedByte();
			if (0 == i_0_)
				break;
			method3731(class527_sub38, i_0_, (byte) 105);
		}
	}

	void method3731(RSByteBuffer class527_sub38, int i, byte i_1_) {
		if (i == 1) {
			int i_2_ = class527_sub38.readUnsignedShort();
			anIntArray2174 = new int[i_2_];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
				anIntArray2174[i_3_] = class527_sub38.readUnsignedShort();
			anIntArray2172 = new int[i_2_];
			for (int i_4_ = 0; i_4_ < i_2_; i_4_++)
				anIntArray2172[i_4_] = class527_sub38.readUnsignedShort();
			for (int i_5_ = 0; i_5_ < i_2_; i_5_++)
				anIntArray2172[i_5_] = (class527_sub38.readUnsignedShort() << 16) + anIntArray2172[i_5_];
		} else if (i == 2)
			anInt2179 = class527_sub38.readUnsignedShort() * 90981353;
		else if (5 == i)
			anInt2191 = class527_sub38.readUnsignedByte() * 55051205;
		else if (i == 6)
			anInt2181 = class527_sub38.readUnsignedShort() * 369340003;
		else if (i == 7)
			anInt2182 = class527_sub38.readUnsignedShort() * 756778249;
		else if (8 == i)
			anInt2183 = class527_sub38.readUnsignedByte() * -971804525;
		else if (9 == i)
			anInt2193 = class527_sub38.readUnsignedByte() * -1733521945;
		else if (i == 10)
			anInt2185 = class527_sub38.readUnsignedByte() * -254545953;
		else if (11 == i)
			anInt2186 = class527_sub38.readUnsignedByte() * -1879047213;
		else if (12 == i || i == 112) {
			int i_6_;
			if (i == 12)
				i_6_ = class527_sub38.readUnsignedByte();
			else
				i_6_ = class527_sub38.readUnsignedShort();
			anIntArray2184 = new int[i_6_];
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
				anIntArray2184[i_7_] = class527_sub38.readUnsignedShort();
			for (int i_8_ = 0; i_8_ < i_6_; i_8_++)
				anIntArray2184[i_8_] = (class527_sub38.readUnsignedShort() << 16) + anIntArray2184[i_8_];
		} else if (i == 13) {
			int i_9_ = class527_sub38.readUnsignedShort();
			anIntArrayArray2178 = new int[i_9_][];
			for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
				int i_11_ = class527_sub38.readUnsignedByte();
				if (i_11_ > 0) {
					anIntArrayArray2178[i_10_] = new int[i_11_];
					anIntArrayArray2178[i_10_][0] = class527_sub38.read24BitUnsignedInteger(1630725007);
					for (int i_12_ = 1; i_12_ < i_11_; i_12_++)
						anIntArrayArray2178[i_10_][i_12_] = class527_sub38.readUnsignedShort();
				}
			}
		} else if (14 == i)
			aBool2187 = true;
		else if (i == 15)
			aBool2188 = true;
		else if (i != 16 && 18 != i) {
			if (i == 19 || 119 == i) {
				if (null == anIntArray2189) {
					anIntArray2189 = new int[anIntArrayArray2178.length];
					for (int i_13_ = 0; i_13_ < anIntArrayArray2178.length; i_13_++)
						anIntArray2189[i_13_] = 255;
				}
				int i_14_;
				if (i == 19)
					i_14_ = class527_sub38.readUnsignedByte();
				else
					i_14_ = class527_sub38.readUnsignedShort();
				anIntArray2189[i_14_] = class527_sub38.readUnsignedByte();
			} else if (20 == i || 120 == i) {
				if (null == anIntArray2169 || anIntArray2173 == null) {
					anIntArray2169 = new int[anIntArrayArray2178.length];
					anIntArray2173 = new int[anIntArrayArray2178.length];
					for (int i_15_ = 0; i_15_ < anIntArrayArray2178.length; i_15_++) {
						anIntArray2169[i_15_] = 256;
						anIntArray2173[i_15_] = 256;
					}
				}
				int i_16_;
				if (20 == i)
					i_16_ = class527_sub38.readUnsignedByte();
				else
					i_16_ = class527_sub38.readUnsignedShort();
				anIntArray2169[i_16_] = class527_sub38.readUnsignedShort();
				anIntArray2173[i_16_] = class527_sub38.readUnsignedShort();
			} else if (22 == i)
				anInt2176 = class527_sub38.readUnsignedByte() * 1856459677;
			else if (23 == i)
				class527_sub38.readUnsignedShort();
			else if (i == 24) {
				anInt2177 = class527_sub38.readUnsignedShort() * -225925725;
				if (aClass200_2170 != null)
					aClass202_2190 = ((Class202) aClass200_2170.anInterface13_2199.method81(anInt2177 * 1209382411, 807719811));
			} else if (249 == i) {
				int i_17_ = class527_sub38.readUnsignedByte();
				if (aClass14_2175 == null) {
					int i_18_ = Class186.method3652(i_17_, 1523591309);
					aClass14_2175 = new Class14(i_18_);
				}
				for (int i_19_ = 0; i_19_ < i_17_; i_19_++) {
					boolean bool = class527_sub38.readUnsignedByte() == 1;
					int i_20_ = class527_sub38.read24BitUnsignedInteger(323741576);
					Class527 class527;
					if (bool)
						class527 = new Class527_Sub26(class527_sub38.readString(2114533761));
					else
						class527 = new Node_Sub6(class527_sub38.readInt());
					aClass14_2175.method714(class527, (long) i_20_);
				}
			}
		}
	}

	public void method84() {
		if (-970181161 * anInt2193 == -1) {
			if (aClass202_2190 != null && null != aClass202_2190.aBoolArray2212)
				anInt2193 = 827923406;
			else
				anInt2193 = 0;
		}
		if (-707228641 * anInt2185 == -1) {
			if (null != aClass202_2190 && null != aClass202_2190.aBoolArray2212)
				anInt2185 = -509091906;
			else
				anInt2185 = 0;
		}
		if (anIntArray2174 != null) {
			anInt2180 = 0;
			for (int i = 0; i < anIntArray2174.length; i++)
				anInt2180 += -48556325 * anIntArray2174[i];
		}
	}

	public boolean method3732(byte i) {
		if (null == anIntArray2172)
			return true;
		boolean bool = true;
		int[] is = anIntArray2172;
		for (int i_21_ = 0; i_21_ < is.length; i_21_++) {
			int i_22_ = is[i_21_];
			if (aClass200_2170.method3756(i_22_ >>> 16, (byte) 68) == null)
				bool = false;
		}
		return bool;
	}

	public int method3733(int i, int i_23_, byte i_24_) {
		if (null == aClass14_2175)
			return i_23_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_2175.method709((long) i);
		if (null == class527_sub7)
			return i_23_;
		return -78845949 * class527_sub7.anInt10398;
	}

	public String method3734(int i, String string, int i_25_) {
		if (null == aClass14_2175)
			return string;
		Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass14_2175.method709((long) i);
		if (class527_sub26 == null)
			return string;
		return (String) class527_sub26.anObject10522;
	}

	public String method3735(int i, String string) {
		if (null == aClass14_2175)
			return string;
		Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass14_2175.method709((long) i);
		if (class527_sub26 == null)
			return string;
		return (String) class527_sub26.anObject10522;
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method3731(class527_sub38, i, (byte) 86);
		}
	}

	public void method85() {
		if (-970181161 * anInt2193 == -1) {
			if (aClass202_2190 != null && null != aClass202_2190.aBoolArray2212)
				anInt2193 = 827923406;
			else
				anInt2193 = 0;
		}
		if (-707228641 * anInt2185 == -1) {
			if (null != aClass202_2190 && null != aClass202_2190.aBoolArray2212)
				anInt2185 = -509091906;
			else
				anInt2185 = 0;
		}
		if (anIntArray2174 != null) {
			anInt2180 = 0;
			for (int i = 0; i < anIntArray2174.length; i++)
				anInt2180 += -48556325 * anIntArray2174[i];
		}
	}

	public void method86(int i) {
		if (-970181161 * anInt2193 == -1) {
			if (aClass202_2190 != null && null != aClass202_2190.aBoolArray2212)
				anInt2193 = 827923406;
			else
				anInt2193 = 0;
		}
		if (-707228641 * anInt2185 == -1) {
			if (null != aClass202_2190 && null != aClass202_2190.aBoolArray2212)
				anInt2185 = -509091906;
			else
				anInt2185 = 0;
		}
		if (anIntArray2174 != null) {
			anInt2180 = 0;
			for (int i_26_ = 0; i_26_ < anIntArray2174.length; i_26_++)
				anInt2180 += -48556325 * anIntArray2174[i_26_];
		}
	}

	void method3736(RSByteBuffer class527_sub38, int i) {
		if (i == 1) {
			int i_27_ = class527_sub38.readUnsignedShort();
			anIntArray2174 = new int[i_27_];
			for (int i_28_ = 0; i_28_ < i_27_; i_28_++)
				anIntArray2174[i_28_] = class527_sub38.readUnsignedShort();
			anIntArray2172 = new int[i_27_];
			for (int i_29_ = 0; i_29_ < i_27_; i_29_++)
				anIntArray2172[i_29_] = class527_sub38.readUnsignedShort();
			for (int i_30_ = 0; i_30_ < i_27_; i_30_++)
				anIntArray2172[i_30_] = (class527_sub38.readUnsignedShort() << 16) + anIntArray2172[i_30_];
		} else if (i == 2)
			anInt2179 = class527_sub38.readUnsignedShort() * 90981353;
		else if (5 == i)
			anInt2191 = class527_sub38.readUnsignedByte() * 55051205;
		else if (i == 6)
			anInt2181 = class527_sub38.readUnsignedShort() * 369340003;
		else if (i == 7)
			anInt2182 = class527_sub38.readUnsignedShort() * 756778249;
		else if (8 == i)
			anInt2183 = class527_sub38.readUnsignedByte() * -971804525;
		else if (9 == i)
			anInt2193 = class527_sub38.readUnsignedByte() * -1733521945;
		else if (i == 10)
			anInt2185 = class527_sub38.readUnsignedByte() * -254545953;
		else if (11 == i)
			anInt2186 = class527_sub38.readUnsignedByte() * -1879047213;
		else if (12 == i || i == 112) {
			int i_31_;
			if (i == 12)
				i_31_ = class527_sub38.readUnsignedByte();
			else
				i_31_ = class527_sub38.readUnsignedShort();
			anIntArray2184 = new int[i_31_];
			for (int i_32_ = 0; i_32_ < i_31_; i_32_++)
				anIntArray2184[i_32_] = class527_sub38.readUnsignedShort();
			for (int i_33_ = 0; i_33_ < i_31_; i_33_++)
				anIntArray2184[i_33_] = (class527_sub38.readUnsignedShort() << 16) + anIntArray2184[i_33_];
		} else if (i == 13) {
			int i_34_ = class527_sub38.readUnsignedShort();
			anIntArrayArray2178 = new int[i_34_][];
			for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
				int i_36_ = class527_sub38.readUnsignedByte();
				if (i_36_ > 0) {
					anIntArrayArray2178[i_35_] = new int[i_36_];
					anIntArrayArray2178[i_35_][0] = class527_sub38.read24BitUnsignedInteger(1783909585);
					for (int i_37_ = 1; i_37_ < i_36_; i_37_++)
						anIntArrayArray2178[i_35_][i_37_] = class527_sub38.readUnsignedShort();
				}
			}
		} else if (14 == i)
			aBool2187 = true;
		else if (i == 15)
			aBool2188 = true;
		else if (i != 16 && 18 != i) {
			if (i == 19 || 119 == i) {
				if (null == anIntArray2189) {
					anIntArray2189 = new int[anIntArrayArray2178.length];
					for (int i_38_ = 0; i_38_ < anIntArrayArray2178.length; i_38_++)
						anIntArray2189[i_38_] = 255;
				}
				int i_39_;
				if (i == 19)
					i_39_ = class527_sub38.readUnsignedByte();
				else
					i_39_ = class527_sub38.readUnsignedShort();
				anIntArray2189[i_39_] = class527_sub38.readUnsignedByte();
			} else if (20 == i || 120 == i) {
				if (null == anIntArray2169 || anIntArray2173 == null) {
					anIntArray2169 = new int[anIntArrayArray2178.length];
					anIntArray2173 = new int[anIntArrayArray2178.length];
					for (int i_40_ = 0; i_40_ < anIntArrayArray2178.length; i_40_++) {
						anIntArray2169[i_40_] = 256;
						anIntArray2173[i_40_] = 256;
					}
				}
				int i_41_;
				if (20 == i)
					i_41_ = class527_sub38.readUnsignedByte();
				else
					i_41_ = class527_sub38.readUnsignedShort();
				anIntArray2169[i_41_] = class527_sub38.readUnsignedShort();
				anIntArray2173[i_41_] = class527_sub38.readUnsignedShort();
			} else if (22 == i)
				anInt2176 = class527_sub38.readUnsignedByte() * 1856459677;
			else if (23 == i)
				class527_sub38.readUnsignedShort();
			else if (i == 24) {
				anInt2177 = class527_sub38.readUnsignedShort() * -225925725;
				if (aClass200_2170 != null)
					aClass202_2190 = ((Class202) aClass200_2170.anInterface13_2199.method81(anInt2177 * 1209382411, 140398935));
			} else if (249 == i) {
				int i_42_ = class527_sub38.readUnsignedByte();
				if (aClass14_2175 == null) {
					int i_43_ = Class186.method3652(i_42_, -1643843256);
					aClass14_2175 = new Class14(i_43_);
				}
				for (int i_44_ = 0; i_44_ < i_42_; i_44_++) {
					boolean bool = class527_sub38.readUnsignedByte() == 1;
					int i_45_ = class527_sub38.read24BitUnsignedInteger(162928397);
					Class527 class527;
					if (bool)
						class527 = new Class527_Sub26(class527_sub38.readString(740210579));
					else
						class527 = new Node_Sub6(class527_sub38.readInt());
					aClass14_2175.method714(class527, (long) i_45_);
				}
			}
		}
	}

	void method3737(RSByteBuffer class527_sub38, int i) {
		if (i == 1) {
			int i_46_ = class527_sub38.readUnsignedShort();
			anIntArray2174 = new int[i_46_];
			for (int i_47_ = 0; i_47_ < i_46_; i_47_++)
				anIntArray2174[i_47_] = class527_sub38.readUnsignedShort();
			anIntArray2172 = new int[i_46_];
			for (int i_48_ = 0; i_48_ < i_46_; i_48_++)
				anIntArray2172[i_48_] = class527_sub38.readUnsignedShort();
			for (int i_49_ = 0; i_49_ < i_46_; i_49_++)
				anIntArray2172[i_49_] = (class527_sub38.readUnsignedShort() << 16) + anIntArray2172[i_49_];
		} else if (i == 2)
			anInt2179 = class527_sub38.readUnsignedShort() * 90981353;
		else if (5 == i)
			anInt2191 = class527_sub38.readUnsignedByte() * 55051205;
		else if (i == 6)
			anInt2181 = class527_sub38.readUnsignedShort() * 369340003;
		else if (i == 7)
			anInt2182 = class527_sub38.readUnsignedShort() * 756778249;
		else if (8 == i)
			anInt2183 = class527_sub38.readUnsignedByte() * -971804525;
		else if (9 == i)
			anInt2193 = class527_sub38.readUnsignedByte() * -1733521945;
		else if (i == 10)
			anInt2185 = class527_sub38.readUnsignedByte() * -254545953;
		else if (11 == i)
			anInt2186 = class527_sub38.readUnsignedByte() * -1879047213;
		else if (12 == i || i == 112) {
			int i_50_;
			if (i == 12)
				i_50_ = class527_sub38.readUnsignedByte();
			else
				i_50_ = class527_sub38.readUnsignedShort();
			anIntArray2184 = new int[i_50_];
			for (int i_51_ = 0; i_51_ < i_50_; i_51_++)
				anIntArray2184[i_51_] = class527_sub38.readUnsignedShort();
			for (int i_52_ = 0; i_52_ < i_50_; i_52_++)
				anIntArray2184[i_52_] = (class527_sub38.readUnsignedShort() << 16) + anIntArray2184[i_52_];
		} else if (i == 13) {
			int i_53_ = class527_sub38.readUnsignedShort();
			anIntArrayArray2178 = new int[i_53_][];
			for (int i_54_ = 0; i_54_ < i_53_; i_54_++) {
				int i_55_ = class527_sub38.readUnsignedByte();
				if (i_55_ > 0) {
					anIntArrayArray2178[i_54_] = new int[i_55_];
					anIntArrayArray2178[i_54_][0] = class527_sub38.read24BitUnsignedInteger(844557250);
					for (int i_56_ = 1; i_56_ < i_55_; i_56_++)
						anIntArrayArray2178[i_54_][i_56_] = class527_sub38.readUnsignedShort();
				}
			}
		} else if (14 == i)
			aBool2187 = true;
		else if (i == 15)
			aBool2188 = true;
		else if (i != 16 && 18 != i) {
			if (i == 19 || 119 == i) {
				if (null == anIntArray2189) {
					anIntArray2189 = new int[anIntArrayArray2178.length];
					for (int i_57_ = 0; i_57_ < anIntArrayArray2178.length; i_57_++)
						anIntArray2189[i_57_] = 255;
				}
				int i_58_;
				if (i == 19)
					i_58_ = class527_sub38.readUnsignedByte();
				else
					i_58_ = class527_sub38.readUnsignedShort();
				anIntArray2189[i_58_] = class527_sub38.readUnsignedByte();
			} else if (20 == i || 120 == i) {
				if (null == anIntArray2169 || anIntArray2173 == null) {
					anIntArray2169 = new int[anIntArrayArray2178.length];
					anIntArray2173 = new int[anIntArrayArray2178.length];
					for (int i_59_ = 0; i_59_ < anIntArrayArray2178.length; i_59_++) {
						anIntArray2169[i_59_] = 256;
						anIntArray2173[i_59_] = 256;
					}
				}
				int i_60_;
				if (20 == i)
					i_60_ = class527_sub38.readUnsignedByte();
				else
					i_60_ = class527_sub38.readUnsignedShort();
				anIntArray2169[i_60_] = class527_sub38.readUnsignedShort();
				anIntArray2173[i_60_] = class527_sub38.readUnsignedShort();
			} else if (22 == i)
				anInt2176 = class527_sub38.readUnsignedByte() * 1856459677;
			else if (23 == i)
				class527_sub38.readUnsignedShort();
			else if (i == 24) {
				anInt2177 = class527_sub38.readUnsignedShort() * -225925725;
				if (aClass200_2170 != null)
					aClass202_2190 = ((Class202) aClass200_2170.anInterface13_2199.method81(anInt2177 * 1209382411, 1581238228));
			} else if (249 == i) {
				int i_61_ = class527_sub38.readUnsignedByte();
				if (aClass14_2175 == null) {
					int i_62_ = Class186.method3652(i_61_, -736883348);
					aClass14_2175 = new Class14(i_62_);
				}
				for (int i_63_ = 0; i_63_ < i_61_; i_63_++) {
					boolean bool = class527_sub38.readUnsignedByte() == 1;
					int i_64_ = class527_sub38.read24BitUnsignedInteger(927950825);
					Class527 class527;
					if (bool)
						class527 = new Class527_Sub26(class527_sub38.readString(1744669331));
					else
						class527 = new Node_Sub6(class527_sub38.readInt());
					aClass14_2175.method714(class527, (long) i_64_);
				}
			}
		}
	}

	void method3738(RSByteBuffer class527_sub38, int i) {
		if (i == 1) {
			int i_65_ = class527_sub38.readUnsignedShort();
			anIntArray2174 = new int[i_65_];
			for (int i_66_ = 0; i_66_ < i_65_; i_66_++)
				anIntArray2174[i_66_] = class527_sub38.readUnsignedShort();
			anIntArray2172 = new int[i_65_];
			for (int i_67_ = 0; i_67_ < i_65_; i_67_++)
				anIntArray2172[i_67_] = class527_sub38.readUnsignedShort();
			for (int i_68_ = 0; i_68_ < i_65_; i_68_++)
				anIntArray2172[i_68_] = (class527_sub38.readUnsignedShort() << 16) + anIntArray2172[i_68_];
		} else if (i == 2)
			anInt2179 = class527_sub38.readUnsignedShort() * 90981353;
		else if (5 == i)
			anInt2191 = class527_sub38.readUnsignedByte() * 55051205;
		else if (i == 6)
			anInt2181 = class527_sub38.readUnsignedShort() * 369340003;
		else if (i == 7)
			anInt2182 = class527_sub38.readUnsignedShort() * 756778249;
		else if (8 == i)
			anInt2183 = class527_sub38.readUnsignedByte() * -971804525;
		else if (9 == i)
			anInt2193 = class527_sub38.readUnsignedByte() * -1733521945;
		else if (i == 10)
			anInt2185 = class527_sub38.readUnsignedByte() * -254545953;
		else if (11 == i)
			anInt2186 = class527_sub38.readUnsignedByte() * -1879047213;
		else if (12 == i || i == 112) {
			int i_69_;
			if (i == 12)
				i_69_ = class527_sub38.readUnsignedByte();
			else
				i_69_ = class527_sub38.readUnsignedShort();
			anIntArray2184 = new int[i_69_];
			for (int i_70_ = 0; i_70_ < i_69_; i_70_++)
				anIntArray2184[i_70_] = class527_sub38.readUnsignedShort();
			for (int i_71_ = 0; i_71_ < i_69_; i_71_++)
				anIntArray2184[i_71_] = (class527_sub38.readUnsignedShort() << 16) + anIntArray2184[i_71_];
		} else if (i == 13) {
			int i_72_ = class527_sub38.readUnsignedShort();
			anIntArrayArray2178 = new int[i_72_][];
			for (int i_73_ = 0; i_73_ < i_72_; i_73_++) {
				int i_74_ = class527_sub38.readUnsignedByte();
				if (i_74_ > 0) {
					anIntArrayArray2178[i_73_] = new int[i_74_];
					anIntArrayArray2178[i_73_][0] = class527_sub38.read24BitUnsignedInteger(2078746243);
					for (int i_75_ = 1; i_75_ < i_74_; i_75_++)
						anIntArrayArray2178[i_73_][i_75_] = class527_sub38.readUnsignedShort();
				}
			}
		} else if (14 == i)
			aBool2187 = true;
		else if (i == 15)
			aBool2188 = true;
		else if (i != 16 && 18 != i) {
			if (i == 19 || 119 == i) {
				if (null == anIntArray2189) {
					anIntArray2189 = new int[anIntArrayArray2178.length];
					for (int i_76_ = 0; i_76_ < anIntArrayArray2178.length; i_76_++)
						anIntArray2189[i_76_] = 255;
				}
				int i_77_;
				if (i == 19)
					i_77_ = class527_sub38.readUnsignedByte();
				else
					i_77_ = class527_sub38.readUnsignedShort();
				anIntArray2189[i_77_] = class527_sub38.readUnsignedByte();
			} else if (20 == i || 120 == i) {
				if (null == anIntArray2169 || anIntArray2173 == null) {
					anIntArray2169 = new int[anIntArrayArray2178.length];
					anIntArray2173 = new int[anIntArrayArray2178.length];
					for (int i_78_ = 0; i_78_ < anIntArrayArray2178.length; i_78_++) {
						anIntArray2169[i_78_] = 256;
						anIntArray2173[i_78_] = 256;
					}
				}
				int i_79_;
				if (20 == i)
					i_79_ = class527_sub38.readUnsignedByte();
				else
					i_79_ = class527_sub38.readUnsignedShort();
				anIntArray2169[i_79_] = class527_sub38.readUnsignedShort();
				anIntArray2173[i_79_] = class527_sub38.readUnsignedShort();
			} else if (22 == i)
				anInt2176 = class527_sub38.readUnsignedByte() * 1856459677;
			else if (23 == i)
				class527_sub38.readUnsignedShort();
			else if (i == 24) {
				anInt2177 = class527_sub38.readUnsignedShort() * -225925725;
				if (aClass200_2170 != null)
					aClass202_2190 = ((Class202) aClass200_2170.anInterface13_2199.method81(anInt2177 * 1209382411, 1161605249));
			} else if (249 == i) {
				int i_80_ = class527_sub38.readUnsignedByte();
				if (aClass14_2175 == null) {
					int i_81_ = Class186.method3652(i_80_, -1087585035);
					aClass14_2175 = new Class14(i_81_);
				}
				for (int i_82_ = 0; i_82_ < i_80_; i_82_++) {
					boolean bool = class527_sub38.readUnsignedByte() == 1;
					int i_83_ = class527_sub38.read24BitUnsignedInteger(1482343562);
					Class527 class527;
					if (bool)
						class527 = new Class527_Sub26(class527_sub38.readString(1071044423));
					else
						class527 = new Node_Sub6(class527_sub38.readInt());
					aClass14_2175.method714(class527, (long) i_83_);
				}
			}
		}
	}

	public boolean method3739() {
		if (null == anIntArray2172)
			return true;
		boolean bool = true;
		int[] is = anIntArray2172;
		for (int i = 0; i < is.length; i++) {
			int i_84_ = is[i];
			if (aClass200_2170.method3756(i_84_ >>> 16, (byte) 11) == null)
				bool = false;
		}
		return bool;
	}

	public String method3740(int i, String string) {
		if (null == aClass14_2175)
			return string;
		Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass14_2175.method709((long) i);
		if (class527_sub26 == null)
			return string;
		return (String) class527_sub26.anObject10522;
	}

	Class198(int i, Class200 class200) {
		anInt2177 = 225925725;
		anInt2179 = -90981353;
		anInt2191 = 275256025;
		anInt2181 = -369340003;
		anInt2182 = -756778249;
		anInt2183 = -1719367463;
		anInt2193 = 1733521945;
		anInt2185 = 254545953;
		anInt2186 = 536872870;
		aBool2187 = false;
		aBool2188 = false;
		anInt2176 = -1856459677;
		anInt2171 = i * -1468478491;
		aClass200_2170 = class200;
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method3731(class527_sub38, i, (byte) 50);
		}
	}

	public String method3741(int i, String string) {
		if (null == aClass14_2175)
			return string;
		Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass14_2175.method709((long) i);
		if (class527_sub26 == null)
			return string;
		return (String) class527_sub26.anObject10522;
	}

	public int method3742(int i, int i_85_) {
		if (null == aClass14_2175)
			return i_85_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_2175.method709((long) i);
		if (null == class527_sub7)
			return i_85_;
		return -78845949 * class527_sub7.anInt10398;
	}

	static final void method3743(Class665 class665, int i) {
		if (Class707.aBool8841) {
			Class704[] class704s = Class64.method1453(1457540718);
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class704s.length;
		} else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}

	static void method3744(byte i) {
		if (Class402.aClass180_4150.method3095()) {
			Class402.aClass180_4150.method3103(Class451.aCanvas4939, -2138725744);
			Class527_Sub8_Sub1.method17872(-944782427);
			Dimension dimension = Class451.aCanvas4939.getSize();
			Class402.aClass180_4150.method3371(Class451.aCanvas4939, dimension.width, dimension.height, 1674801646);
			Class402.aClass180_4150.method3104(Class451.aCanvas4939, 673954373);
		} else
			Class535.method8982(Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-390187411), false, 2038795974);
		Class289.method5226(-1288050256);
	}

	public static Container method3745(byte i) {
		if (null != Class56.aFrame711)
			return Class56.aFrame711;
		if (null != Class514.aFrame7012)
			return Class514.aFrame7012;
		return Class212.anApplet2258;
	}

	static final void method3746(Class665 class665, short i) {
		int i_86_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_86_, 1340022054);
		Class240 class240 = Class183.aClass240Array2100[i_86_ >> 16];
		Class95.method1729(class243, class240, class665, (byte) -27);
	}
}
