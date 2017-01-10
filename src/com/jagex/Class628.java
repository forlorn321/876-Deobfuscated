/* Class628 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class628 {
	public int anInt8184;
	public int anInt8185 = -1826144908;
	public short aShort8186;
	public int[] anIntArray8187;
	public int anInt8188;
	public short[][] aShortArrayArray8189;
	static final int anInt8190 = 4;
	static final int anInt8191 = 4;
	static final int anInt8192 = 7;
	public int anInt8193;
	public int anInt8194;
	public int anInt8195;
	public int anInt8196;
	public int anInt8197;
	public int anInt8198;
	public byte aByte8199;
	public int defaultColor;
	static final int anInt8201 = 4;
	public short[][][] aShortArrayArrayArray8202;
	public short[][] aShortArrayArray8203;
	public short[][][] aShortArrayArrayArray8204;
	public boolean aBool8205;
	public int anInt8206;
	public int anInt8207;
	public int anInt8208;
	public int anInt8209;
	public int anInt8210;
	public boolean aBool8211;
	public int anInt8212;
	public int above100kColor;
	public int above10mColor;
	public int anInt8215;
	public int anInt8216;
	public int anInt8217;
	public boolean aBool8218;
	public boolean aBool8219;
	public int[] anIntArray8220 = null;
	public int anInt8221;
	public int anInt8222;
	public int anInt8223;
	public int anInt8224;
	public int anInt8225;
	public int anInt8226;
	public int anInt8227;
	public int anInt8228;
	public int anInt8229;
	public static int anInt8230;

	void method7487(RSByteBuffer class536_sub33) {
		boolean bool = false;
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (0 == i)
				break;
			if (1 == i) {
				if (null == anIntArray8220) {
					anInt8185 = -1826144908;
					anIntArray8220 = new int[4];
					anIntArray8187 = new int[4];
				}
				for (int i_0_ = 0; i_0_ < anIntArray8220.length; i_0_++) {
					anIntArray8220[i_0_] = class536_sub33.readShort();
					anIntArray8187[i_0_] = class536_sub33.readShort();
				}
				bool = true;
			} else if (2 == i)
				anInt8197 = class536_sub33.readBigSmart() * -1997220653;
			else if (i == 3) {
				anInt8185 = class536_sub33.readUnsignedByte() * -456536227;
				anIntArray8220 = new int[-1964901131 * anInt8185];
				anIntArray8187 = new int[-1964901131 * anInt8185];
			} else if (4 == i)
				aBool8218 = false;
			else if (5 == i)
				anInt8195 = class536_sub33.read24BitUnsignedInteger() * 1563873595;
			else if (6 == i)
				anInt8225 = class536_sub33.read24BitUnsignedInteger() * 864400697;
			else if (7 == i) {
				aShortArrayArray8189 = new short[10][4];
				aShortArrayArrayArray8202 = new short[10][4][];
				for (int i_1_ = 0; i_1_ < 10; i_1_++) {
					for (int i_2_ = 0; i_2_ < 4; i_2_++) {
						int i_3_ = class536_sub33.readUnsignedShort();
						if (65535 == i_3_)
							i_3_ = -1;
						aShortArrayArray8189[i_1_][i_2_] = (short) i_3_;
						int i_4_ = class536_sub33.readUnsignedShort();
						aShortArrayArrayArray8202[i_1_][i_2_] = new short[i_4_];
						for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
							int i_6_ = class536_sub33.readUnsignedShort();
							if (i_6_ == 65535)
								i_6_ = -1;
							aShortArrayArrayArray8202[i_1_][i_2_][i_5_] = (short) i_6_;
						}
					}
				}
			} else if (i == 8)
				aBool8205 = false;
			else if (i == 9)
				anInt8206 = class536_sub33.readUnsignedByte() * 872523483;
			else if (i == 10)
				aBool8219 = false;
			else if (11 == i)
				anInt8208 = class536_sub33.readUnsignedByte() * 2110833501;
			else if (12 == i) {
				anInt8209 = class536_sub33.readUnsignedShort() * -537414415;
				anInt8227 = class536_sub33.readUnsignedShort() * 1833838075;
			} else if (13 == i)
				anInt8196 = class536_sub33.readUnsignedByte() * -1690009303;
			else if (14 == i)
				anInt8198 = class536_sub33.readUnsignedByte() * 1302676419;
			else if (15 == i)
				anInt8193 = class536_sub33.readUnsignedByte() * -28704513;
			else if (i == 16)
				aBool8211 = true;
			else if (17 == i)
				defaultColor = class536_sub33.readInt() * 1146723269;
			else if (i == 18)
				above100kColor = class536_sub33.readInt() * -1310538059;
			else if (i == 19)
				above10mColor = class536_sub33.readInt() * -1839086529;
			else if (20 == i) {
				aShort8186 = (short) class536_sub33.readUnsignedShort();
				aByte8199 = (byte) class536_sub33.readUnsignedByte();
			} else if (21 == i)
				anInt8207 = class536_sub33.readUnsignedByte() * -518382511;
			else if (i == 22) {
				anInt8215 = class536_sub33.readBigSmart() * 602161847;
				anInt8216 = class536_sub33.readBigSmart() * -1130044229;
				anInt8217 = class536_sub33.readBigSmart() * -307195707;
				anInt8184 = class536_sub33.readBigSmart() * -1604560095;
				anInt8210 = class536_sub33.readBigSmart() * 976337773;
				anInt8188 = class536_sub33.readBigSmart() * 573805623;
				anInt8221 = class536_sub33.readByte() * -626619777;
				anInt8222 = class536_sub33.readByte() * 531895345;
				anInt8223 = class536_sub33.readBigSmart() * -876097603;
				anInt8224 = class536_sub33.readBigSmart() * -737086327;
				anInt8212 = class536_sub33.readBigSmart() * -1079424305;
				anInt8226 = class536_sub33.readBigSmart() * 969665301;
				anInt8194 = class536_sub33.readBigSmart() * 1412454521;
				anInt8228 = class536_sub33.readBigSmart() * 1203449429;
				anInt8229 = class536_sub33.readBigSmart() * 82436367;
			} else if (i == 23) {
				aShortArrayArray8203 = new short[10][4];
				aShortArrayArrayArray8204 = new short[10][4][];
				for (int i_7_ = 0; i_7_ < 10; i_7_++) {
					for (int i_8_ = 0; i_8_ < 4; i_8_++) {
						int i_9_ = class536_sub33.readUnsignedShort();
						if (65535 == i_9_)
							i_9_ = -1;
						aShortArrayArray8203[i_7_][i_8_] = (short) i_9_;
						int i_10_ = class536_sub33.readUnsignedShort();
						aShortArrayArrayArray8204[i_7_][i_8_] = new short[i_10_];
						for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
							int i_12_ = class536_sub33.readUnsignedShort();
							if (65535 == i_12_)
								i_12_ = -1;
							aShortArrayArrayArray8204[i_7_][i_8_][i_11_] = (short) i_12_;
						}
					}
				}
			}
		}
		if (!bool) {
			if (anIntArray8220 == null) {
				anInt8185 = -1826144908;
				anIntArray8220 = new int[4];
				anIntArray8187 = new int[4];
			}
			for (int i = 0; i < anIntArray8220.length; i++) {
				anIntArray8220[i] = 0;
				anIntArray8187[i] = i * 20;
			}
		}
	}

	void method7488(RSByteBuffer class536_sub33, int i) {
		boolean bool = false;
		for (;;) {
			int i_13_ = class536_sub33.readUnsignedByte();
			if (0 == i_13_)
				break;
			if (1 == i_13_) {
				if (null == anIntArray8220) {
					anInt8185 = -1826144908;
					anIntArray8220 = new int[4];
					anIntArray8187 = new int[4];
				}
				for (int i_14_ = 0; i_14_ < anIntArray8220.length; i_14_++) {
					anIntArray8220[i_14_] = class536_sub33.readShort();
					anIntArray8187[i_14_] = class536_sub33.readShort();
				}
				bool = true;
			} else if (2 == i_13_)
				anInt8197 = class536_sub33.readBigSmart() * -1997220653;
			else if (i_13_ == 3) {
				anInt8185 = class536_sub33.readUnsignedByte() * -456536227;
				anIntArray8220 = new int[-1964901131 * anInt8185];
				anIntArray8187 = new int[-1964901131 * anInt8185];
			} else if (4 == i_13_)
				aBool8218 = false;
			else if (5 == i_13_)
				anInt8195 = class536_sub33.read24BitUnsignedInteger() * 1563873595;
			else if (6 == i_13_)
				anInt8225 = class536_sub33.read24BitUnsignedInteger() * 864400697;
			else if (7 == i_13_) {
				aShortArrayArray8189 = new short[10][4];
				aShortArrayArrayArray8202 = new short[10][4][];
				for (int i_15_ = 0; i_15_ < 10; i_15_++) {
					for (int i_16_ = 0; i_16_ < 4; i_16_++) {
						int i_17_ = class536_sub33.readUnsignedShort();
						if (65535 == i_17_)
							i_17_ = -1;
						aShortArrayArray8189[i_15_][i_16_] = (short) i_17_;
						int i_18_ = class536_sub33.readUnsignedShort();
						aShortArrayArrayArray8202[i_15_][i_16_] = new short[i_18_];
						for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
							int i_20_ = class536_sub33.readUnsignedShort();
							if (i_20_ == 65535)
								i_20_ = -1;
							aShortArrayArrayArray8202[i_15_][i_16_][i_19_] = (short) i_20_;
						}
					}
				}
			} else if (i_13_ == 8)
				aBool8205 = false;
			else if (i_13_ == 9)
				anInt8206 = class536_sub33.readUnsignedByte() * 872523483;
			else if (i_13_ == 10)
				aBool8219 = false;
			else if (11 == i_13_)
				anInt8208 = class536_sub33.readUnsignedByte() * 2110833501;
			else if (12 == i_13_) {
				anInt8209 = class536_sub33.readUnsignedShort() * -537414415;
				anInt8227 = class536_sub33.readUnsignedShort() * 1833838075;
			} else if (13 == i_13_)
				anInt8196 = class536_sub33.readUnsignedByte() * -1690009303;
			else if (14 == i_13_)
				anInt8198 = class536_sub33.readUnsignedByte() * 1302676419;
			else if (15 == i_13_)
				anInt8193 = class536_sub33.readUnsignedByte() * -28704513;
			else if (i_13_ == 16)
				aBool8211 = true;
			else if (17 == i_13_)
				defaultColor = class536_sub33.readInt() * 1146723269;
			else if (i_13_ == 18)
				above100kColor = class536_sub33.readInt() * -1310538059;
			else if (i_13_ == 19)
				above10mColor = class536_sub33.readInt() * -1839086529;
			else if (20 == i_13_) {
				aShort8186 = (short) class536_sub33.readUnsignedShort();
				aByte8199 = (byte) class536_sub33.readUnsignedByte();
			} else if (21 == i_13_)
				anInt8207 = class536_sub33.readUnsignedByte() * -518382511;
			else if (i_13_ == 22) {
				anInt8215 = class536_sub33.readBigSmart() * 602161847;
				anInt8216 = class536_sub33.readBigSmart() * -1130044229;
				anInt8217 = class536_sub33.readBigSmart() * -307195707;
				anInt8184 = class536_sub33.readBigSmart() * -1604560095;
				anInt8210 = class536_sub33.readBigSmart() * 976337773;
				anInt8188 = class536_sub33.readBigSmart() * 573805623;
				anInt8221 = class536_sub33.readByte() * -626619777;
				anInt8222 = class536_sub33.readByte() * 531895345;
				anInt8223 = class536_sub33.readBigSmart() * -876097603;
				anInt8224 = class536_sub33.readBigSmart() * -737086327;
				anInt8212 = class536_sub33.readBigSmart() * -1079424305;
				anInt8226 = class536_sub33.readBigSmart() * 969665301;
				anInt8194 = class536_sub33.readBigSmart() * 1412454521;
				anInt8228 = class536_sub33.readBigSmart() * 1203449429;
				anInt8229 = class536_sub33.readBigSmart() * 82436367;
			} else if (i_13_ == 23) {
				aShortArrayArray8203 = new short[10][4];
				aShortArrayArrayArray8204 = new short[10][4][];
				for (int i_21_ = 0; i_21_ < 10; i_21_++) {
					for (int i_22_ = 0; i_22_ < 4; i_22_++) {
						int i_23_ = class536_sub33.readUnsignedShort();
						if (65535 == i_23_)
							i_23_ = -1;
						aShortArrayArray8203[i_21_][i_22_] = (short) i_23_;
						int i_24_ = class536_sub33.readUnsignedShort();
						aShortArrayArrayArray8204[i_21_][i_22_] = new short[i_24_];
						for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
							int i_26_ = class536_sub33.readUnsignedShort();
							if (65535 == i_26_)
								i_26_ = -1;
							aShortArrayArrayArray8204[i_21_][i_22_][i_25_] = (short) i_26_;
						}
					}
				}
			}
		}
		if (!bool) {
			if (anIntArray8220 == null) {
				anInt8185 = -1826144908;
				anIntArray8220 = new int[4];
				anIntArray8187 = new int[4];
			}
			for (int i_27_ = 0; i_27_ < anIntArray8220.length; i_27_++) {
				anIntArray8220[i_27_] = 0;
				anIntArray8187[i_27_] = i_27_ * 20;
			}
		}
	}

	void method7489(RSByteBuffer class536_sub33) {
		boolean bool = false;
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (0 == i)
				break;
			if (1 == i) {
				if (null == anIntArray8220) {
					anInt8185 = -1826144908;
					anIntArray8220 = new int[4];
					anIntArray8187 = new int[4];
				}
				for (int i_28_ = 0; i_28_ < anIntArray8220.length; i_28_++) {
					anIntArray8220[i_28_] = class536_sub33.readShort();
					anIntArray8187[i_28_] = class536_sub33.readShort();
				}
				bool = true;
			} else if (2 == i)
				anInt8197 = class536_sub33.readBigSmart() * -1997220653;
			else if (i == 3) {
				anInt8185 = class536_sub33.readUnsignedByte() * -456536227;
				anIntArray8220 = new int[-1964901131 * anInt8185];
				anIntArray8187 = new int[-1964901131 * anInt8185];
			} else if (4 == i)
				aBool8218 = false;
			else if (5 == i)
				anInt8195 = class536_sub33.read24BitUnsignedInteger() * 1563873595;
			else if (6 == i)
				anInt8225 = class536_sub33.read24BitUnsignedInteger() * 864400697;
			else if (7 == i) {
				aShortArrayArray8189 = new short[10][4];
				aShortArrayArrayArray8202 = new short[10][4][];
				for (int i_29_ = 0; i_29_ < 10; i_29_++) {
					for (int i_30_ = 0; i_30_ < 4; i_30_++) {
						int i_31_ = class536_sub33.readUnsignedShort();
						if (65535 == i_31_)
							i_31_ = -1;
						aShortArrayArray8189[i_29_][i_30_] = (short) i_31_;
						int i_32_ = class536_sub33.readUnsignedShort();
						aShortArrayArrayArray8202[i_29_][i_30_] = new short[i_32_];
						for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
							int i_34_ = class536_sub33.readUnsignedShort();
							if (i_34_ == 65535)
								i_34_ = -1;
							aShortArrayArrayArray8202[i_29_][i_30_][i_33_] = (short) i_34_;
						}
					}
				}
			} else if (i == 8)
				aBool8205 = false;
			else if (i == 9)
				anInt8206 = class536_sub33.readUnsignedByte() * 872523483;
			else if (i == 10)
				aBool8219 = false;
			else if (11 == i)
				anInt8208 = class536_sub33.readUnsignedByte() * 2110833501;
			else if (12 == i) {
				anInt8209 = class536_sub33.readUnsignedShort() * -537414415;
				anInt8227 = class536_sub33.readUnsignedShort() * 1833838075;
			} else if (13 == i)
				anInt8196 = class536_sub33.readUnsignedByte() * -1690009303;
			else if (14 == i)
				anInt8198 = class536_sub33.readUnsignedByte() * 1302676419;
			else if (15 == i)
				anInt8193 = class536_sub33.readUnsignedByte() * -28704513;
			else if (i == 16)
				aBool8211 = true;
			else if (17 == i)
				defaultColor = class536_sub33.readInt() * 1146723269;
			else if (i == 18)
				above100kColor = class536_sub33.readInt() * -1310538059;
			else if (i == 19)
				above10mColor = class536_sub33.readInt() * -1839086529;
			else if (20 == i) {
				aShort8186 = (short) class536_sub33.readUnsignedShort();
				aByte8199 = (byte) class536_sub33.readUnsignedByte();
			} else if (21 == i)
				anInt8207 = class536_sub33.readUnsignedByte() * -518382511;
			else if (i == 22) {
				anInt8215 = class536_sub33.readBigSmart() * 602161847;
				anInt8216 = class536_sub33.readBigSmart() * -1130044229;
				anInt8217 = class536_sub33.readBigSmart() * -307195707;
				anInt8184 = class536_sub33.readBigSmart() * -1604560095;
				anInt8210 = class536_sub33.readBigSmart() * 976337773;
				anInt8188 = class536_sub33.readBigSmart() * 573805623;
				anInt8221 = class536_sub33.readByte() * -626619777;
				anInt8222 = class536_sub33.readByte() * 531895345;
				anInt8223 = class536_sub33.readBigSmart() * -876097603;
				anInt8224 = class536_sub33.readBigSmart() * -737086327;
				anInt8212 = class536_sub33.readBigSmart() * -1079424305;
				anInt8226 = class536_sub33.readBigSmart() * 969665301;
				anInt8194 = class536_sub33.readBigSmart() * 1412454521;
				anInt8228 = class536_sub33.readBigSmart() * 1203449429;
				anInt8229 = class536_sub33.readBigSmart() * 82436367;
			} else if (i == 23) {
				aShortArrayArray8203 = new short[10][4];
				aShortArrayArrayArray8204 = new short[10][4][];
				for (int i_35_ = 0; i_35_ < 10; i_35_++) {
					for (int i_36_ = 0; i_36_ < 4; i_36_++) {
						int i_37_ = class536_sub33.readUnsignedShort();
						if (65535 == i_37_)
							i_37_ = -1;
						aShortArrayArray8203[i_35_][i_36_] = (short) i_37_;
						int i_38_ = class536_sub33.readUnsignedShort();
						aShortArrayArrayArray8204[i_35_][i_36_] = new short[i_38_];
						for (int i_39_ = 0; i_39_ < i_38_; i_39_++) {
							int i_40_ = class536_sub33.readUnsignedShort();
							if (65535 == i_40_)
								i_40_ = -1;
							aShortArrayArrayArray8204[i_35_][i_36_][i_39_] = (short) i_40_;
						}
					}
				}
			}
		}
		if (!bool) {
			if (anIntArray8220 == null) {
				anInt8185 = -1826144908;
				anIntArray8220 = new int[4];
				anIntArray8187 = new int[4];
			}
			for (int i = 0; i < anIntArray8220.length; i++) {
				anIntArray8220[i] = 0;
				anIntArray8187[i] = i * 20;
			}
		}
	}

	void method7490(RSByteBuffer class536_sub33) {
		boolean bool = false;
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (0 == i)
				break;
			if (1 == i) {
				if (null == anIntArray8220) {
					anInt8185 = -1826144908;
					anIntArray8220 = new int[4];
					anIntArray8187 = new int[4];
				}
				for (int i_41_ = 0; i_41_ < anIntArray8220.length; i_41_++) {
					anIntArray8220[i_41_] = class536_sub33.readShort();
					anIntArray8187[i_41_] = class536_sub33.readShort();
				}
				bool = true;
			} else if (2 == i)
				anInt8197 = class536_sub33.readBigSmart() * -1997220653;
			else if (i == 3) {
				anInt8185 = class536_sub33.readUnsignedByte() * -456536227;
				anIntArray8220 = new int[-1964901131 * anInt8185];
				anIntArray8187 = new int[-1964901131 * anInt8185];
			} else if (4 == i)
				aBool8218 = false;
			else if (5 == i)
				anInt8195 = class536_sub33.read24BitUnsignedInteger() * 1563873595;
			else if (6 == i)
				anInt8225 = class536_sub33.read24BitUnsignedInteger() * 864400697;
			else if (7 == i) {
				aShortArrayArray8189 = new short[10][4];
				aShortArrayArrayArray8202 = new short[10][4][];
				for (int i_42_ = 0; i_42_ < 10; i_42_++) {
					for (int i_43_ = 0; i_43_ < 4; i_43_++) {
						int i_44_ = class536_sub33.readUnsignedShort();
						if (65535 == i_44_)
							i_44_ = -1;
						aShortArrayArray8189[i_42_][i_43_] = (short) i_44_;
						int i_45_ = class536_sub33.readUnsignedShort();
						aShortArrayArrayArray8202[i_42_][i_43_] = new short[i_45_];
						for (int i_46_ = 0; i_46_ < i_45_; i_46_++) {
							int i_47_ = class536_sub33.readUnsignedShort();
							if (i_47_ == 65535)
								i_47_ = -1;
							aShortArrayArrayArray8202[i_42_][i_43_][i_46_] = (short) i_47_;
						}
					}
				}
			} else if (i == 8)
				aBool8205 = false;
			else if (i == 9)
				anInt8206 = class536_sub33.readUnsignedByte() * 872523483;
			else if (i == 10)
				aBool8219 = false;
			else if (11 == i)
				anInt8208 = class536_sub33.readUnsignedByte() * 2110833501;
			else if (12 == i) {
				anInt8209 = class536_sub33.readUnsignedShort() * -537414415;
				anInt8227 = class536_sub33.readUnsignedShort() * 1833838075;
			} else if (13 == i)
				anInt8196 = class536_sub33.readUnsignedByte() * -1690009303;
			else if (14 == i)
				anInt8198 = class536_sub33.readUnsignedByte() * 1302676419;
			else if (15 == i)
				anInt8193 = class536_sub33.readUnsignedByte() * -28704513;
			else if (i == 16)
				aBool8211 = true;
			else if (17 == i)
				defaultColor = class536_sub33.readInt() * 1146723269;
			else if (i == 18)
				above100kColor = class536_sub33.readInt() * -1310538059;
			else if (i == 19)
				above10mColor = class536_sub33.readInt() * -1839086529;
			else if (20 == i) {
				aShort8186 = (short) class536_sub33.readUnsignedShort();
				aByte8199 = (byte) class536_sub33.readUnsignedByte();
			} else if (21 == i)
				anInt8207 = class536_sub33.readUnsignedByte() * -518382511;
			else if (i == 22) {
				anInt8215 = class536_sub33.readBigSmart() * 602161847;
				anInt8216 = class536_sub33.readBigSmart() * -1130044229;
				anInt8217 = class536_sub33.readBigSmart() * -307195707;
				anInt8184 = class536_sub33.readBigSmart() * -1604560095;
				anInt8210 = class536_sub33.readBigSmart() * 976337773;
				anInt8188 = class536_sub33.readBigSmart() * 573805623;
				anInt8221 = class536_sub33.readByte() * -626619777;
				anInt8222 = class536_sub33.readByte() * 531895345;
				anInt8223 = class536_sub33.readBigSmart() * -876097603;
				anInt8224 = class536_sub33.readBigSmart() * -737086327;
				anInt8212 = class536_sub33.readBigSmart() * -1079424305;
				anInt8226 = class536_sub33.readBigSmart() * 969665301;
				anInt8194 = class536_sub33.readBigSmart() * 1412454521;
				anInt8228 = class536_sub33.readBigSmart() * 1203449429;
				anInt8229 = class536_sub33.readBigSmart() * 82436367;
			} else if (i == 23) {
				aShortArrayArray8203 = new short[10][4];
				aShortArrayArrayArray8204 = new short[10][4][];
				for (int i_48_ = 0; i_48_ < 10; i_48_++) {
					for (int i_49_ = 0; i_49_ < 4; i_49_++) {
						int i_50_ = class536_sub33.readUnsignedShort();
						if (65535 == i_50_)
							i_50_ = -1;
						aShortArrayArray8203[i_48_][i_49_] = (short) i_50_;
						int i_51_ = class536_sub33.readUnsignedShort();
						aShortArrayArrayArray8204[i_48_][i_49_] = new short[i_51_];
						for (int i_52_ = 0; i_52_ < i_51_; i_52_++) {
							int i_53_ = class536_sub33.readUnsignedShort();
							if (65535 == i_53_)
								i_53_ = -1;
							aShortArrayArrayArray8204[i_48_][i_49_][i_52_] = (short) i_53_;
						}
					}
				}
			}
		}
		if (!bool) {
			if (anIntArray8220 == null) {
				anInt8185 = -1826144908;
				anIntArray8220 = new int[4];
				anIntArray8187 = new int[4];
			}
			for (int i = 0; i < anIntArray8220.length; i++) {
				anIntArray8220[i] = 0;
				anIntArray8187[i] = i * 20;
			}
		}
	}

	public Class628(JS5ResourceProvider class461) {
		anIntArray8187 = null;
		anInt8198 = 915738380;
		anInt8196 = 1829897380;
		anInt8193 = -200931591;
		anInt8197 = 1997220653;
		anInt8195 = -1563873595;
		anInt8225 = -864400697;
		aBool8218 = true;
		aShort8186 = (short) -1;
		aByte8199 = (byte) 0;
		anInt8207 = -298643548;
		aBool8205 = true;
		anInt8206 = 1745046966;
		aBool8219 = true;
		anInt8208 = 2037533207;
		anInt8209 = 537414415;
		anInt8227 = -1833838075;
		defaultColor = 1801730816;
		above100kColor = 52246859;
		above10mColor = -1822629760;
		anInt8215 = -602161847;
		anInt8216 = 1130044229;
		anInt8217 = 307195707;
		anInt8184 = 1604560095;
		anInt8210 = -976337773;
		anInt8188 = -573805623;
		anInt8223 = 876097603;
		anInt8224 = 737086327;
		anInt8212 = 1079424305;
		anInt8226 = -969665301;
		anInt8194 = -1412454521;
		anInt8228 = -1203449429;
		anInt8229 = -82436367;
		byte[] is = class461.method5595((-848473139 * Class633.aClass633_8253.anInt8258), -1161780094);
		method7488(new RSByteBuffer(is), -1952520672);
	}

	void method7491(RSByteBuffer class536_sub33) {
		boolean bool = false;
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (0 == i)
				break;
			if (1 == i) {
				if (null == anIntArray8220) {
					anInt8185 = -1826144908;
					anIntArray8220 = new int[4];
					anIntArray8187 = new int[4];
				}
				for (int i_54_ = 0; i_54_ < anIntArray8220.length; i_54_++) {
					anIntArray8220[i_54_] = class536_sub33.readShort();
					anIntArray8187[i_54_] = class536_sub33.readShort();
				}
				bool = true;
			} else if (2 == i)
				anInt8197 = class536_sub33.readBigSmart() * -1997220653;
			else if (i == 3) {
				anInt8185 = class536_sub33.readUnsignedByte() * -456536227;
				anIntArray8220 = new int[-1964901131 * anInt8185];
				anIntArray8187 = new int[-1964901131 * anInt8185];
			} else if (4 == i)
				aBool8218 = false;
			else if (5 == i)
				anInt8195 = class536_sub33.read24BitUnsignedInteger() * 1563873595;
			else if (6 == i)
				anInt8225 = class536_sub33.read24BitUnsignedInteger() * 864400697;
			else if (7 == i) {
				aShortArrayArray8189 = new short[10][4];
				aShortArrayArrayArray8202 = new short[10][4][];
				for (int i_55_ = 0; i_55_ < 10; i_55_++) {
					for (int i_56_ = 0; i_56_ < 4; i_56_++) {
						int i_57_ = class536_sub33.readUnsignedShort();
						if (65535 == i_57_)
							i_57_ = -1;
						aShortArrayArray8189[i_55_][i_56_] = (short) i_57_;
						int i_58_ = class536_sub33.readUnsignedShort();
						aShortArrayArrayArray8202[i_55_][i_56_] = new short[i_58_];
						for (int i_59_ = 0; i_59_ < i_58_; i_59_++) {
							int i_60_ = class536_sub33.readUnsignedShort();
							if (i_60_ == 65535)
								i_60_ = -1;
							aShortArrayArrayArray8202[i_55_][i_56_][i_59_] = (short) i_60_;
						}
					}
				}
			} else if (i == 8)
				aBool8205 = false;
			else if (i == 9)
				anInt8206 = class536_sub33.readUnsignedByte() * 872523483;
			else if (i == 10)
				aBool8219 = false;
			else if (11 == i)
				anInt8208 = class536_sub33.readUnsignedByte() * 2110833501;
			else if (12 == i) {
				anInt8209 = class536_sub33.readUnsignedShort() * -537414415;
				anInt8227 = class536_sub33.readUnsignedShort() * 1833838075;
			} else if (13 == i)
				anInt8196 = class536_sub33.readUnsignedByte() * -1690009303;
			else if (14 == i)
				anInt8198 = class536_sub33.readUnsignedByte() * 1302676419;
			else if (15 == i)
				anInt8193 = class536_sub33.readUnsignedByte() * -28704513;
			else if (i == 16)
				aBool8211 = true;
			else if (17 == i)
				defaultColor = class536_sub33.readInt() * 1146723269;
			else if (i == 18)
				above100kColor = class536_sub33.readInt() * -1310538059;
			else if (i == 19)
				above10mColor = class536_sub33.readInt() * -1839086529;
			else if (20 == i) {
				aShort8186 = (short) class536_sub33.readUnsignedShort();
				aByte8199 = (byte) class536_sub33.readUnsignedByte();
			} else if (21 == i)
				anInt8207 = class536_sub33.readUnsignedByte() * -518382511;
			else if (i == 22) {
				anInt8215 = class536_sub33.readBigSmart() * 602161847;
				anInt8216 = class536_sub33.readBigSmart() * -1130044229;
				anInt8217 = class536_sub33.readBigSmart() * -307195707;
				anInt8184 = class536_sub33.readBigSmart() * -1604560095;
				anInt8210 = class536_sub33.readBigSmart() * 976337773;
				anInt8188 = class536_sub33.readBigSmart() * 573805623;
				anInt8221 = class536_sub33.readByte() * -626619777;
				anInt8222 = class536_sub33.readByte() * 531895345;
				anInt8223 = class536_sub33.readBigSmart() * -876097603;
				anInt8224 = class536_sub33.readBigSmart() * -737086327;
				anInt8212 = class536_sub33.readBigSmart() * -1079424305;
				anInt8226 = class536_sub33.readBigSmart() * 969665301;
				anInt8194 = class536_sub33.readBigSmart() * 1412454521;
				anInt8228 = class536_sub33.readBigSmart() * 1203449429;
				anInt8229 = class536_sub33.readBigSmart() * 82436367;
			} else if (i == 23) {
				aShortArrayArray8203 = new short[10][4];
				aShortArrayArrayArray8204 = new short[10][4][];
				for (int i_61_ = 0; i_61_ < 10; i_61_++) {
					for (int i_62_ = 0; i_62_ < 4; i_62_++) {
						int i_63_ = class536_sub33.readUnsignedShort();
						if (65535 == i_63_)
							i_63_ = -1;
						aShortArrayArray8203[i_61_][i_62_] = (short) i_63_;
						int i_64_ = class536_sub33.readUnsignedShort();
						aShortArrayArrayArray8204[i_61_][i_62_] = new short[i_64_];
						for (int i_65_ = 0; i_65_ < i_64_; i_65_++) {
							int i_66_ = class536_sub33.readUnsignedShort();
							if (65535 == i_66_)
								i_66_ = -1;
							aShortArrayArrayArray8204[i_61_][i_62_][i_65_] = (short) i_66_;
						}
					}
				}
			}
		}
		if (!bool) {
			if (anIntArray8220 == null) {
				anInt8185 = -1826144908;
				anIntArray8220 = new int[4];
				anIntArray8187 = new int[4];
			}
			for (int i = 0; i < anIntArray8220.length; i++) {
				anIntArray8220[i] = 0;
				anIntArray8187[i] = i * 20;
			}
		}
	}

	static final void method7492(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		int[] is = Class510.method6183(string, class668, -1278934401);
		if (is != null)
			string = string.substring(0, string.length() - 1);
		class251.onVarcTransmitHook = Class33.method796(string, class668, (short) 14509);
		class251.varcTransmitList = is;
		class251.hasComponentHook = true;
	}

	static final void method7493(Class668 class668, int i) {
		int i_67_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class688.method8170(i_67_, false, -1119620338);
	}

	static final void method7494(Class668 class668, int i) {
		int i_68_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class608.method7260((char) i_68_, 980627836) ? 1 : 0;
	}

	static final void method7495(Class668 class668, int i) {
		class668.anInt8542 -= 61855783;
		int i_69_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_70_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		int i_71_ = class668.anIntArray8541[2 + class668.anInt8542 * 1867269829];
		Class281 class281 = Class520.method6350(i_69_, (byte) -22);
		float f = (float) i_70_;
		if (Class281.aClass281_3170 == class281 || class281 == Class281.aClass281_3172 || class281 == Class281.aClass281_3173)
			f = Class447.method5400(i_70_);
		Class536_Sub18_Sub18_Sub1 class536_sub18_sub18_sub1 = new Class536_Sub18_Sub18_Sub1(Class683.aClass301_Sub1_8651.method9200(-1193741927), class281, f, (float) i_71_ / 1000.0F);
		Class683.aClass301_Sub1_8651.method4063(class536_sub18_sub18_sub1, -1081235108);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class536_sub18_sub18_sub1.anInt11824 * 1164011507;
	}

	static final void method7496(int i) {
		if (Class233.method3334(client.anInt11101 * -708374433, (byte) -98) || RSOutputStream.method6895(-708374433 * client.anInt11101, 2069498977))
			Class275.method3737(false, -1412415318);
		else {
			Class605.aClass567_7872 = client.aClass106_11322.method1413((short) -13854);
			client.aClass106_11322.method1412(245736433);
			Class673.method8026(17, -1798113843);
		}
	}

	static final void method7497(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class311.method4180(class251, class234, class668, (byte) 59);
	}
}
