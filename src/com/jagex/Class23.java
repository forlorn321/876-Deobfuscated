/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class23 {
	public int[] anIntArray217;
	public short[] aShortArray218;
	static final int anInt219 = 2;
	static final int anInt220 = 4;
	static final int anInt221 = 8;
	public int[] anIntArray222 = new int[3];
	static final int anInt223 = 1;
	public int[] anIntArray224;
	static final int anInt225 = 2;
	public int[] anIntArray226;
	public short[] aShortArray227;
	static int anInt228;

	static Class23 method821(Class9 class9, RSByteBuffer class527_sub38, int i) {
		Class23 class23 = new Class23(class9);
		int i_0_ = class527_sub38.readUnsignedByte();
		boolean bool = 0 != (i_0_ & 0x1);
		boolean bool_1_ = 0 != (i_0_ & 0x2);
		boolean bool_2_ = (i_0_ & 0x4) != 0;
		boolean bool_3_ = (i_0_ & 0x8) != 0;
		if (bool) {
			if (i <= 1) {
				class23.anIntArray222[0] = class527_sub38.readUnsignedShort();
				class23.anIntArray217[0] = class527_sub38.readUnsignedShort();
			} else {
				class23.anIntArray222[0] = class527_sub38.method16466(-1697220174);
				class23.anIntArray217[0] = class527_sub38.method16466(-1708707834);
			}
			if (-1 != class9.anInt116 * -1198555409 || class9.anInt99 * -291191067 != -1) {
				if (i <= 1) {
					class23.anIntArray222[1] = class527_sub38.readUnsignedShort();
					class23.anIntArray217[1] = class527_sub38.readUnsignedShort();
				} else {
					class23.anIntArray222[1] = class527_sub38.method16466(-1687814313);
					class23.anIntArray217[1] = class527_sub38.method16466(-1692499406);
				}
			}
			if (-1591690929 * class9.anInt121 != -1 || -1 != class9.anInt110 * 816794519) {
				if (i <= 1) {
					class23.anIntArray222[2] = class527_sub38.readUnsignedShort();
					class23.anIntArray217[2] = class527_sub38.readUnsignedShort();
				} else {
					class23.anIntArray222[2] = class527_sub38.method16466(-1910449808);
					class23.anIntArray217[2] = class527_sub38.method16466(-2134151922);
				}
			}
		}
		if (bool_1_) {
			if (i <= 1) {
				class23.anIntArray224[0] = class527_sub38.readUnsignedShort();
				class23.anIntArray226[0] = class527_sub38.readUnsignedShort();
			} else {
				class23.anIntArray224[0] = class527_sub38.method16466(-1686267259);
				class23.anIntArray226[0] = class527_sub38.method16466(-1772709117);
			}
			if (-1 != 1741113833 * class9.anInt112 || -2107841861 * class9.anInt105 != -1) {
				if (i <= 1) {
					class23.anIntArray224[1] = class527_sub38.readUnsignedShort();
					class23.anIntArray226[1] = class527_sub38.readUnsignedShort();
				} else {
					class23.anIntArray224[1] = class527_sub38.method16466(-1668416468);
					class23.anIntArray226[1] = class527_sub38.method16466(-2054054795);
				}
			}
		}
		if (bool_2_) {
			int i_4_ = class527_sub38.readUnsignedShort();
			int[] is = new int[4];
			is[0] = i_4_ & 0xf;
			is[1] = i_4_ >> 4 & 0xf;
			is[2] = i_4_ >> 8 & 0xf;
			is[3] = i_4_ >> 12 & 0xf;
			for (int i_5_ = 0; i_5_ < 4; i_5_++) {
				if (is[i_5_] != 15)
					class23.aShortArray218[is[i_5_]] = (short) class527_sub38.readUnsignedShort();
			}
		}
		if (bool_3_) {
			int i_6_ = class527_sub38.readUnsignedByte();
			int[] is = new int[2];
			is[0] = i_6_ & 0xf;
			is[1] = i_6_ >> 4 & 0xf;
			for (int i_7_ = 0; i_7_ < 2; i_7_++) {
				if (is[i_7_] != 15)
					class23.aShortArray227[is[i_7_]] = (short) class527_sub38.readUnsignedShort();
			}
		}
		return class23;
	}

	public static Class23 method822(Class9 class9, RSByteBuffer class527_sub38) {
		return Class703.method14308(class9, class527_sub38, 2, (byte) 80);
	}

	static Class23 method823(Class9 class9, RSByteBuffer class527_sub38, int i) {
		Class23 class23 = new Class23(class9);
		int i_8_ = class527_sub38.readUnsignedByte();
		boolean bool = 0 != (i_8_ & 0x1);
		boolean bool_9_ = 0 != (i_8_ & 0x2);
		boolean bool_10_ = (i_8_ & 0x4) != 0;
		boolean bool_11_ = (i_8_ & 0x8) != 0;
		if (bool) {
			if (i <= 1) {
				class23.anIntArray222[0] = class527_sub38.readUnsignedShort();
				class23.anIntArray217[0] = class527_sub38.readUnsignedShort();
			} else {
				class23.anIntArray222[0] = class527_sub38.method16466(-1674134933);
				class23.anIntArray217[0] = class527_sub38.method16466(-1930265279);
			}
			if (-1 != class9.anInt116 * -1198555409 || class9.anInt99 * -291191067 != -1) {
				if (i <= 1) {
					class23.anIntArray222[1] = class527_sub38.readUnsignedShort();
					class23.anIntArray217[1] = class527_sub38.readUnsignedShort();
				} else {
					class23.anIntArray222[1] = class527_sub38.method16466(-1800614007);
					class23.anIntArray217[1] = class527_sub38.method16466(-2070193785);
				}
			}
			if (-1591690929 * class9.anInt121 != -1 || -1 != class9.anInt110 * 816794519) {
				if (i <= 1) {
					class23.anIntArray222[2] = class527_sub38.readUnsignedShort();
					class23.anIntArray217[2] = class527_sub38.readUnsignedShort();
				} else {
					class23.anIntArray222[2] = class527_sub38.method16466(-1928800451);
					class23.anIntArray217[2] = class527_sub38.method16466(-1606457436);
				}
			}
		}
		if (bool_9_) {
			if (i <= 1) {
				class23.anIntArray224[0] = class527_sub38.readUnsignedShort();
				class23.anIntArray226[0] = class527_sub38.readUnsignedShort();
			} else {
				class23.anIntArray224[0] = class527_sub38.method16466(-2091870066);
				class23.anIntArray226[0] = class527_sub38.method16466(-2111605375);
			}
			if (-1 != 1741113833 * class9.anInt112 || -2107841861 * class9.anInt105 != -1) {
				if (i <= 1) {
					class23.anIntArray224[1] = class527_sub38.readUnsignedShort();
					class23.anIntArray226[1] = class527_sub38.readUnsignedShort();
				} else {
					class23.anIntArray224[1] = class527_sub38.method16466(-1985138735);
					class23.anIntArray226[1] = class527_sub38.method16466(-1867539085);
				}
			}
		}
		if (bool_10_) {
			int i_12_ = class527_sub38.readUnsignedShort();
			int[] is = new int[4];
			is[0] = i_12_ & 0xf;
			is[1] = i_12_ >> 4 & 0xf;
			is[2] = i_12_ >> 8 & 0xf;
			is[3] = i_12_ >> 12 & 0xf;
			for (int i_13_ = 0; i_13_ < 4; i_13_++) {
				if (is[i_13_] != 15)
					class23.aShortArray218[is[i_13_]] = (short) class527_sub38.readUnsignedShort();
			}
		}
		if (bool_11_) {
			int i_14_ = class527_sub38.readUnsignedByte();
			int[] is = new int[2];
			is[0] = i_14_ & 0xf;
			is[1] = i_14_ >> 4 & 0xf;
			for (int i_15_ = 0; i_15_ < 2; i_15_++) {
				if (is[i_15_] != 15)
					class23.aShortArray227[is[i_15_]] = (short) class527_sub38.readUnsignedShort();
			}
		}
		return class23;
	}

	static Class23 method824(Class9 class9, RSByteBuffer class527_sub38, int i) {
		Class23 class23 = new Class23(class9);
		int i_16_ = class527_sub38.readUnsignedByte();
		boolean bool = 0 != (i_16_ & 0x1);
		boolean bool_17_ = 0 != (i_16_ & 0x2);
		boolean bool_18_ = (i_16_ & 0x4) != 0;
		boolean bool_19_ = (i_16_ & 0x8) != 0;
		if (bool) {
			if (i <= 1) {
				class23.anIntArray222[0] = class527_sub38.readUnsignedShort();
				class23.anIntArray217[0] = class527_sub38.readUnsignedShort();
			} else {
				class23.anIntArray222[0] = class527_sub38.method16466(-1809274465);
				class23.anIntArray217[0] = class527_sub38.method16466(-1598636449);
			}
			if (-1 != class9.anInt116 * -1198555409 || class9.anInt99 * -291191067 != -1) {
				if (i <= 1) {
					class23.anIntArray222[1] = class527_sub38.readUnsignedShort();
					class23.anIntArray217[1] = class527_sub38.readUnsignedShort();
				} else {
					class23.anIntArray222[1] = class527_sub38.method16466(-2101810614);
					class23.anIntArray217[1] = class527_sub38.method16466(-1891469922);
				}
			}
			if (-1591690929 * class9.anInt121 != -1 || -1 != class9.anInt110 * 816794519) {
				if (i <= 1) {
					class23.anIntArray222[2] = class527_sub38.readUnsignedShort();
					class23.anIntArray217[2] = class527_sub38.readUnsignedShort();
				} else {
					class23.anIntArray222[2] = class527_sub38.method16466(-1662766578);
					class23.anIntArray217[2] = class527_sub38.method16466(-1880581770);
				}
			}
		}
		if (bool_17_) {
			if (i <= 1) {
				class23.anIntArray224[0] = class527_sub38.readUnsignedShort();
				class23.anIntArray226[0] = class527_sub38.readUnsignedShort();
			} else {
				class23.anIntArray224[0] = class527_sub38.method16466(-1794246546);
				class23.anIntArray226[0] = class527_sub38.method16466(-1605432686);
			}
			if (-1 != 1741113833 * class9.anInt112 || -2107841861 * class9.anInt105 != -1) {
				if (i <= 1) {
					class23.anIntArray224[1] = class527_sub38.readUnsignedShort();
					class23.anIntArray226[1] = class527_sub38.readUnsignedShort();
				} else {
					class23.anIntArray224[1] = class527_sub38.method16466(-1795822675);
					class23.anIntArray226[1] = class527_sub38.method16466(-1931976003);
				}
			}
		}
		if (bool_18_) {
			int i_20_ = class527_sub38.readUnsignedShort();
			int[] is = new int[4];
			is[0] = i_20_ & 0xf;
			is[1] = i_20_ >> 4 & 0xf;
			is[2] = i_20_ >> 8 & 0xf;
			is[3] = i_20_ >> 12 & 0xf;
			for (int i_21_ = 0; i_21_ < 4; i_21_++) {
				if (is[i_21_] != 15)
					class23.aShortArray218[is[i_21_]] = (short) class527_sub38.readUnsignedShort();
			}
		}
		if (bool_19_) {
			int i_22_ = class527_sub38.readUnsignedByte();
			int[] is = new int[2];
			is[0] = i_22_ & 0xf;
			is[1] = i_22_ >> 4 & 0xf;
			for (int i_23_ = 0; i_23_ < 2; i_23_++) {
				if (is[i_23_] != 15)
					class23.aShortArray227[is[i_23_]] = (short) class527_sub38.readUnsignedShort();
			}
		}
		return class23;
	}

	Class23(Class9 class9) {
		anIntArray217 = new int[3];
		anIntArray224 = new int[2];
		anIntArray226 = new int[2];
		anIntArray222[0] = class9.anInt90 * 705433971;
		anIntArray222[1] = class9.anInt116 * -1198555409;
		anIntArray222[2] = -1591690929 * class9.anInt121;
		anIntArray217[0] = class9.anInt111 * 1566897319;
		anIntArray217[1] = class9.anInt99 * -291191067;
		anIntArray217[2] = class9.anInt110 * 816794519;
		anIntArray224[0] = 1802376245 * class9.anInt101;
		anIntArray224[1] = 1741113833 * class9.anInt112;
		anIntArray226[0] = 2039549583 * class9.anInt109;
		anIntArray226[1] = -2107841861 * class9.anInt105;
		if (class9.aShortArray86 != null) {
			aShortArray218 = new short[class9.aShortArray86.length];
			System.arraycopy(class9.aShortArray86, 0, aShortArray218, 0, aShortArray218.length);
		}
		if (null != class9.aShortArray131) {
			aShortArray227 = new short[class9.aShortArray131.length];
			System.arraycopy(class9.aShortArray131, 0, aShortArray227, 0, aShortArray227.length);
		}
	}

	static Class23 method825(Class9 class9, RSByteBuffer class527_sub38, int i) {
		Class23 class23 = new Class23(class9);
		int i_24_ = class527_sub38.readUnsignedByte();
		boolean bool = 0 != (i_24_ & 0x1);
		boolean bool_25_ = 0 != (i_24_ & 0x2);
		boolean bool_26_ = (i_24_ & 0x4) != 0;
		boolean bool_27_ = (i_24_ & 0x8) != 0;
		if (bool) {
			if (i <= 1) {
				class23.anIntArray222[0] = class527_sub38.readUnsignedShort();
				class23.anIntArray217[0] = class527_sub38.readUnsignedShort();
			} else {
				class23.anIntArray222[0] = class527_sub38.method16466(-2106329335);
				class23.anIntArray217[0] = class527_sub38.method16466(-1837098330);
			}
			if (-1 != class9.anInt116 * -1198555409 || class9.anInt99 * -291191067 != -1) {
				if (i <= 1) {
					class23.anIntArray222[1] = class527_sub38.readUnsignedShort();
					class23.anIntArray217[1] = class527_sub38.readUnsignedShort();
				} else {
					class23.anIntArray222[1] = class527_sub38.method16466(-2024391753);
					class23.anIntArray217[1] = class527_sub38.method16466(-1764343022);
				}
			}
			if (-1591690929 * class9.anInt121 != -1 || -1 != class9.anInt110 * 816794519) {
				if (i <= 1) {
					class23.anIntArray222[2] = class527_sub38.readUnsignedShort();
					class23.anIntArray217[2] = class527_sub38.readUnsignedShort();
				} else {
					class23.anIntArray222[2] = class527_sub38.method16466(-1881811997);
					class23.anIntArray217[2] = class527_sub38.method16466(-1653405019);
				}
			}
		}
		if (bool_25_) {
			if (i <= 1) {
				class23.anIntArray224[0] = class527_sub38.readUnsignedShort();
				class23.anIntArray226[0] = class527_sub38.readUnsignedShort();
			} else {
				class23.anIntArray224[0] = class527_sub38.method16466(-1938091418);
				class23.anIntArray226[0] = class527_sub38.method16466(-1781550528);
			}
			if (-1 != 1741113833 * class9.anInt112 || -2107841861 * class9.anInt105 != -1) {
				if (i <= 1) {
					class23.anIntArray224[1] = class527_sub38.readUnsignedShort();
					class23.anIntArray226[1] = class527_sub38.readUnsignedShort();
				} else {
					class23.anIntArray224[1] = class527_sub38.method16466(-1857075889);
					class23.anIntArray226[1] = class527_sub38.method16466(-1968297745);
				}
			}
		}
		if (bool_26_) {
			int i_28_ = class527_sub38.readUnsignedShort();
			int[] is = new int[4];
			is[0] = i_28_ & 0xf;
			is[1] = i_28_ >> 4 & 0xf;
			is[2] = i_28_ >> 8 & 0xf;
			is[3] = i_28_ >> 12 & 0xf;
			for (int i_29_ = 0; i_29_ < 4; i_29_++) {
				if (is[i_29_] != 15)
					class23.aShortArray218[is[i_29_]] = (short) class527_sub38.readUnsignedShort();
			}
		}
		if (bool_27_) {
			int i_30_ = class527_sub38.readUnsignedByte();
			int[] is = new int[2];
			is[0] = i_30_ & 0xf;
			is[1] = i_30_ >> 4 & 0xf;
			for (int i_31_ = 0; i_31_ < 2; i_31_++) {
				if (is[i_31_] != 15)
					class23.aShortArray227[is[i_31_]] = (short) class527_sub38.readUnsignedShort();
			}
		}
		return class23;
	}

	static Class23 method826(Class9 class9, RSByteBuffer class527_sub38, int i) {
		Class23 class23 = new Class23(class9);
		int i_32_ = class527_sub38.readUnsignedByte();
		boolean bool = 0 != (i_32_ & 0x1);
		boolean bool_33_ = 0 != (i_32_ & 0x2);
		boolean bool_34_ = (i_32_ & 0x4) != 0;
		boolean bool_35_ = (i_32_ & 0x8) != 0;
		if (bool) {
			if (i <= 1) {
				class23.anIntArray222[0] = class527_sub38.readUnsignedShort();
				class23.anIntArray217[0] = class527_sub38.readUnsignedShort();
			} else {
				class23.anIntArray222[0] = class527_sub38.method16466(-2055872204);
				class23.anIntArray217[0] = class527_sub38.method16466(-2013544598);
			}
			if (-1 != class9.anInt116 * -1198555409 || class9.anInt99 * -291191067 != -1) {
				if (i <= 1) {
					class23.anIntArray222[1] = class527_sub38.readUnsignedShort();
					class23.anIntArray217[1] = class527_sub38.readUnsignedShort();
				} else {
					class23.anIntArray222[1] = class527_sub38.method16466(-1637634900);
					class23.anIntArray217[1] = class527_sub38.method16466(-1992272797);
				}
			}
			if (-1591690929 * class9.anInt121 != -1 || -1 != class9.anInt110 * 816794519) {
				if (i <= 1) {
					class23.anIntArray222[2] = class527_sub38.readUnsignedShort();
					class23.anIntArray217[2] = class527_sub38.readUnsignedShort();
				} else {
					class23.anIntArray222[2] = class527_sub38.method16466(-1911781555);
					class23.anIntArray217[2] = class527_sub38.method16466(-1820216838);
				}
			}
		}
		if (bool_33_) {
			if (i <= 1) {
				class23.anIntArray224[0] = class527_sub38.readUnsignedShort();
				class23.anIntArray226[0] = class527_sub38.readUnsignedShort();
			} else {
				class23.anIntArray224[0] = class527_sub38.method16466(-1703594686);
				class23.anIntArray226[0] = class527_sub38.method16466(-1888283396);
			}
			if (-1 != 1741113833 * class9.anInt112 || -2107841861 * class9.anInt105 != -1) {
				if (i <= 1) {
					class23.anIntArray224[1] = class527_sub38.readUnsignedShort();
					class23.anIntArray226[1] = class527_sub38.readUnsignedShort();
				} else {
					class23.anIntArray224[1] = class527_sub38.method16466(-1604424877);
					class23.anIntArray226[1] = class527_sub38.method16466(-1665571094);
				}
			}
		}
		if (bool_34_) {
			int i_36_ = class527_sub38.readUnsignedShort();
			int[] is = new int[4];
			is[0] = i_36_ & 0xf;
			is[1] = i_36_ >> 4 & 0xf;
			is[2] = i_36_ >> 8 & 0xf;
			is[3] = i_36_ >> 12 & 0xf;
			for (int i_37_ = 0; i_37_ < 4; i_37_++) {
				if (is[i_37_] != 15)
					class23.aShortArray218[is[i_37_]] = (short) class527_sub38.readUnsignedShort();
			}
		}
		if (bool_35_) {
			int i_38_ = class527_sub38.readUnsignedByte();
			int[] is = new int[2];
			is[0] = i_38_ & 0xf;
			is[1] = i_38_ >> 4 & 0xf;
			for (int i_39_ = 0; i_39_ < 2; i_39_++) {
				if (is[i_39_] != 15)
					class23.aShortArray227[is[i_39_]] = (short) class527_sub38.readUnsignedShort();
			}
		}
		return class23;
	}

	static final int method827(Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1, int i) {
		if (2021896877 * class640_sub1_sub2_sub1.anInt11937 == 0)
			return 0;
		if (-1 != 816496727 * class640_sub1_sub2_sub1.anInt11910) {
			Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1_40_ = null;
			if (816496727 * class640_sub1_sub2_sub1.anInt11910 < 32768) {
				Class527_Sub26 class527_sub26 = ((Class527_Sub26) (client.aClass14_10989.method709((long) (class640_sub1_sub2_sub1.anInt11910 * 816496727))));
				if (class527_sub26 != null)
					class640_sub1_sub2_sub1_40_ = ((Class640_Sub1_Sub2_Sub1) class527_sub26.anObject10522);
			} else if (816496727 * class640_sub1_sub2_sub1.anInt11910 >= 32768)
				class640_sub1_sub2_sub1_40_ = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[(816496727 * class640_sub1_sub2_sub1.anInt11910 - 32768)]);
			if (class640_sub1_sub2_sub1_40_ != null) {
				Class442 class442 = Class442.method7155((class640_sub1_sub2_sub1.method10637().aClass442_4927), class640_sub1_sub2_sub1_40_.method10637().aClass442_4927);
				int i_41_ = (int) class442.aFloat4918;
				int i_42_ = (int) class442.aFloat4919;
				if (0 != i_41_ || 0 != i_42_)
					class640_sub1_sub2_sub1.method18527((int) (Math.atan2((double) i_41_, (double) i_42_) * 2607.5945876176133) & 0x3fff, 1353112297);
			}
		}
		if (class640_sub1_sub2_sub1 instanceof Class640_Sub1_Sub2_Sub1_Sub2) {
			Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = (Class640_Sub1_Sub2_Sub1_Sub2) class640_sub1_sub2_sub1;
			if (class640_sub1_sub2_sub1_sub2.anInt12178 * 294621047 != -1 && (0 == class640_sub1_sub2_sub1_sub2.anInt11942 * -1057678739 || (-1410302685 * class640_sub1_sub2_sub1_sub2.anInt11946 > 0))) {
				class640_sub1_sub2_sub1_sub2.method18527(class640_sub1_sub2_sub1_sub2.anInt12178 * 294621047, -1275231467);
				class640_sub1_sub2_sub1_sub2.anInt12178 = 791414201;
			}
		} else if (class640_sub1_sub2_sub1 instanceof Class640_Sub1_Sub2_Sub1_Sub1) {
			Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = (Class640_Sub1_Sub2_Sub1_Sub1) class640_sub1_sub2_sub1;
			if (-1 != class640_sub1_sub2_sub1_sub1.anInt12161 * -881851247 && (-1057678739 * class640_sub1_sub2_sub1_sub1.anInt11942 == 0 || (-1410302685 * class640_sub1_sub2_sub1_sub1.anInt11946 > 0))) {
				Class442 class442 = (class640_sub1_sub2_sub1_sub1.method10637().aClass442_4927);
				Class592 class592 = client.aClass509_11072.method8283((short) 32356);
				int i_43_ = ((int) class442.aFloat4918 - (1879347456 * class640_sub1_sub2_sub1_sub1.anInt12161 - 608306944 * class592.anInt7798 - class592.anInt7798 * 608306944));
				int i_44_ = ((int) class442.aFloat4919 - (-1561322240 * class640_sub1_sub2_sub1_sub1.anInt12175 - 101460224 * class592.anInt7799 - 101460224 * class592.anInt7799));
				if (i_43_ != 0 || 0 != i_44_)
					class640_sub1_sub2_sub1_sub1.method18527((int) (Math.atan2((double) i_43_, (double) i_44_) * 2607.5945876176133) & 0x3fff, 651436145);
				class640_sub1_sub2_sub1_sub1.anInt12161 = -414989425;
			}
		}
		return class640_sub1_sub2_sub1.method18529((byte) 1);
	}

	static String method828(String string, boolean bool, int i) {
		String string_45_ = bool ? "https://" : "http://";
		if (Class677.aClass677_8600 == Class73.aClass677_790)
			string = new StringBuilder().append(string).append("-wtrc").toString();
		else if (Class677.aClass677_8597 == Class73.aClass677_790)
			string = new StringBuilder().append(string).append("-wtqa").toString();
		else if (Class73.aClass677_790 == Class677.aClass677_8608)
			string = new StringBuilder().append(string).append("-wtwip").toString();
		else if (Class677.aClass677_8609 == Class73.aClass677_790)
			string = new StringBuilder().append(string).append("-wti").toString();
		else if (Class73.aClass677_790 == Class677.aClass677_8604)
			string = new StringBuilder().append(string).append("-demo").toString();
		else if (Class73.aClass677_790 == Class677.aClass677_8599)
			string = "local";
		String string_46_ = "";
		if (null != client.aString11162)
			string_46_ = new StringBuilder().append("/p=").append(client.aString11162).toString();
		String string_47_ = new StringBuilder().append(client.aClass678_11259.aString8616).append(".com").toString();
		return new StringBuilder().append(string_45_).append(string).append(".").append(string_47_).append("/l=").append(-53745175 * Class144_Sub1.aClass671_8995.anInt8581).append("/a=").append(651761593 * client.anInt10992).append(string_46_).append("/").toString();
	}

	public static int method829(CharSequence charsequence, CharSequence charsequence_48_, Class671 class671, int i) {
		int i_49_ = charsequence.length();
		int i_50_ = charsequence_48_.length();
		int i_51_ = 0;
		int i_52_ = 0;
		char c = '\0';
		char c_53_ = '\0';
		while (i_51_ - c < i_49_ || i_52_ - c_53_ < i_50_) {
			if (i_51_ - c >= i_49_)
				return -1;
			if (i_52_ - c_53_ >= i_50_)
				return 1;
			char c_54_;
			if (c != 0) {
				c_54_ = c;
				boolean bool = false;
			} else
				c_54_ = charsequence.charAt(i_51_++);
			char c_55_;
			if (c_53_ != 0) {
				c_55_ = c_53_;
				boolean bool = false;
			} else
				c_55_ = charsequence_48_.charAt(i_52_++);
			c = Class525.method8725(c_54_, -392318468);
			c_53_ = Class525.method8725(c_55_, 967027139);
			c_54_ = Class230.method4319(c_54_, class671, (byte) 113);
			c_55_ = Class230.method4319(c_55_, class671, (byte) 85);
			if (c_54_ != c_55_ && (Character.toUpperCase(c_54_) != Character.toUpperCase(c_55_))) {
				c_54_ = Character.toLowerCase(c_54_);
				c_55_ = Character.toLowerCase(c_55_);
				if (c_54_ != c_55_)
					return (Class179.method3072(c_54_, class671, -1126065318) - Class179.method3072(c_55_, class671, -1502180880));
			}
		}
		int i_56_ = Math.min(i_49_, i_50_);
		for (int i_57_ = 0; i_57_ < i_56_; i_57_++) {
			if (Class671.aClass671_8573 == class671) {
				i_51_ = i_49_ - 1 - i_57_;
				i_52_ = i_50_ - 1 - i_57_;
			} else
				i_51_ = i_52_ = i_57_;
			char c_58_ = charsequence.charAt(i_51_);
			char c_59_ = charsequence_48_.charAt(i_52_);
			if (c_59_ != c_58_ && (Character.toUpperCase(c_58_) != Character.toUpperCase(c_59_))) {
				c_58_ = Character.toLowerCase(c_58_);
				c_59_ = Character.toLowerCase(c_59_);
				if (c_58_ != c_59_)
					return (Class179.method3072(c_58_, class671, -1577162493) - Class179.method3072(c_59_, class671, -1764859634));
			}
		}
		int i_60_ = i_49_ - i_50_;
		if (0 != i_60_)
			return i_60_;
		for (int i_61_ = 0; i_61_ < i_56_; i_61_++) {
			char c_62_ = charsequence.charAt(i_61_);
			char c_63_ = charsequence_48_.charAt(i_61_);
			if (c_62_ != c_63_)
				return (Class179.method3072(c_62_, class671, -1631117590) - Class179.method3072(c_63_, class671, -1745972362));
		}
		return 0;
	}
}
