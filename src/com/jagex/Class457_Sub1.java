/* Class457_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.zip.CRC32;

public class Class457_Sub1 extends Class457 {
	Class527_Sub8_Sub13 aClass527_Sub8_Sub13_10220;
	boolean aBool10221;
	Class468 aClass468_10222;
	Class461 aClass461_10223;
	Class552 aClass552_10224;
	Class552 aClass552_10225;
	int anInt10226;
	Class694 aClass694_10227;
	static final int anInt10228 = 2;
	int anInt10229;
	int anInt10230 = 0;
	static final byte aByte10231 = 0;
	static final byte aByte10232 = 1;
	static final byte aByte10233 = -1;
	byte[] aByteArray10234;
	int anInt10235;
	Class14 aClass14_10236 = new Class14(16);
	boolean aBool10237;
	boolean aBool10238;
	boolean aBool10239;
	int anInt10240;
	byte[] aByteArray10241;
	Class694 aClass694_10242;
	Class452 aClass452_10243;
	long aLong10244;
	static final int anInt10245 = 1000;
	static final int anInt10246 = 250;
	static CRC32 aCRC32_10247 = new CRC32();
	static final int anInt10248 = 0;
	static final int anInt10249 = 1;
	Class469 aClass469_10250;
	public static Class24_Sub6 aClass24_Sub6_10251;

	void method7437(int i) {
		if (null != aClass552_10224) {
			for (Class527 class527 = aClass694_10242.method14081((short) -31344); class527 != null; class527 = aClass694_10242.method14086(-65534)) {
				if (class527.aLong7106 * -8168620736534281759L == (long) i)
					return;
			}
			Class527 class527 = new Class527();
			class527.aLong7106 = -42244196890836447L * (long) i;
			aClass694_10242.method14147(class527, -1474074063);
		}
	}

	void method15873(int i, byte[] is, int i_0_, int i_1_, byte i_2_) {
		if (!method15874(i, is, i_0_, i_1_, 2075905472)) {
			anInt10240 = 794775523 * i;
			aByteArray10241 = is;
			anInt10229 = -1989555985 * i_0_;
			aClass469_10250 = null;
			aClass527_Sub8_Sub13_10220 = null;
			if (!aClass452_10243.method7299((byte) -56))
				aClass527_Sub8_Sub13_10220 = aClass452_10243.method7297(255, -1920634289 * anInt10226, (byte) 0, true, -1665363594);
		}
	}

	boolean method15874(int i, byte[] is, int i_3_, int i_4_, int i_5_) {
		if (i == anInt10240 * 2021158347 && i_3_ == -1289591281 * anInt10229) {
			boolean bool = true;
			for (int i_6_ = 0; i_6_ < aByteArray10241.length; i_6_++) {
				if (is[i_6_] != aByteArray10241[i_6_]) {
					bool = false;
					break;
				}
			}
			if (bool)
				return true;
		}
		return false;
	}

	public int method15875(int i) {
		if (method7440((byte) 117) == null) {
			if (aClass527_Sub8_Sub13_10220 == null)
				return 0;
			return aClass527_Sub8_Sub13_10220.method18323((byte) 15);
		}
		return 100;
	}

	public int method15876() {
		return anInt10230 * -869292211;
	}

	byte[] method7431(int i, byte i_7_) {
		Class527_Sub8_Sub13 class527_sub8_sub13 = method15896(i, 0, 1279949823);
		if (class527_sub8_sub13 == null)
			return null;
		byte[] is = class527_sub8_sub13.method18319(-582344884);
		class527_sub8_sub13.method8735(-1889161967);
		return is;
	}

	Class469 method7440(byte i) {
		if (aClass469_10250 != null)
			return aClass469_10250;
		if (null == aClass527_Sub8_Sub13_10220) {
			if (aClass452_10243.method7299((byte) -59))
				return null;
			aClass527_Sub8_Sub13_10220 = aClass452_10243.method7297(255, anInt10226 * -1920634289, (byte) 0, true, -1865770767);
		}
		if (aClass527_Sub8_Sub13_10220.aBool11768)
			return null;
		byte[] is = aClass527_Sub8_Sub13_10220.method18319(1971483482);
		if (aClass527_Sub8_Sub13_10220 instanceof Class527_Sub8_Sub13_Sub1) {
			try {
				if (is == null)
					throw new RuntimeException();
				aClass469_10250 = new Class469(is, 2021158347 * anInt10240, aByteArray10241);
				if (anInt10229 * -1289591281 != -605103343 * aClass469_10250.anInt5339)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				aClass469_10250 = null;
				if (aClass452_10243.method7299((byte) 3))
					aClass527_Sub8_Sub13_10220 = null;
				else
					aClass527_Sub8_Sub13_10220 = aClass452_10243.method7297(255, anInt10226 * -1920634289, (byte) 0, true, -1673207565);
				return null;
			}
		} else {
			try {
				if (null == is)
					throw new RuntimeException();
				aClass469_10250 = new Class469(is, 2021158347 * anInt10240, aByteArray10241);
			} catch (RuntimeException runtimeexception) {
				aClass452_10243.method7302(255, anInt10226 * -1920634289, 1141580725);
				aClass469_10250 = null;
				if (aClass452_10243.method7299((byte) 4))
					aClass527_Sub8_Sub13_10220 = null;
				else
					aClass527_Sub8_Sub13_10220 = aClass452_10243.method7297(255, anInt10226 * -1920634289, (byte) 0, true, -2001625807);
				return null;
			}
			if (null != aClass552_10225)
				aClass461_10223.method7586(-1920634289 * anInt10226, is, aClass552_10225, (byte) 0);
		}
		aClass527_Sub8_Sub13_10220 = null;
		if (aClass552_10224 != null) {
			aByteArray10234 = new byte[309096757 * aClass469_10250.anInt5340];
			anInt10230 = 0;
		}
		return aClass469_10250;
	}

	void method15877(int i) {
		if (null != aClass694_10227 && method7440((byte) 77) != null) {
			for (Class527 class527 = aClass694_10242.method14081((short) -5817); class527 != null; class527 = aClass694_10242.method14086(-65534)) {
				int i_8_ = (int) (-8168620736534281759L * class527.aLong7106);
				if (i_8_ < 0 || i_8_ >= aClass469_10250.anInt5340 * 309096757 || aClass469_10250.anIntArray5335[i_8_] == 0)
					class527.method8735(-1889161967);
				else {
					if (aByteArray10234[i_8_] == 0)
						method15896(i_8_, 1, 23930434);
					if (-1 == aByteArray10234[i_8_])
						method15896(i_8_, 2, 586282497);
					if (aByteArray10234[i_8_] == 1)
						class527.method8735(-1889161967);
				}
			}
		}
	}

	public int method15878() {
		if (aClass469_10250 == null)
			return 0;
		return aClass469_10250.anInt5336 * -1019954659;
	}

	public int method15879(int i) {
		if (aClass469_10250 == null)
			return 0;
		return aClass469_10250.anInt5336 * -1019954659;
	}

	void method15880(boolean bool, int i) {
		aClass468_10222.method7674(bool, 1948808790);
	}

	public int method15881() {
		if (aClass469_10250 == null)
			return 0;
		return aClass469_10250.anInt5336 * -1019954659;
	}

	public int method15882() {
		if (method7440((byte) 76) == null) {
			if (aClass527_Sub8_Sub13_10220 == null)
				return 0;
			return aClass527_Sub8_Sub13_10220.method18323((byte) 21);
		}
		return 100;
	}

	void method7430(int i, int i_9_) {
		if (null != aClass552_10224) {
			for (Class527 class527 = aClass694_10242.method14081((short) -14241); class527 != null; class527 = aClass694_10242.method14086(-65534)) {
				if (class527.aLong7106 * -8168620736534281759L == (long) i)
					return;
			}
			Class527 class527 = new Class527();
			class527.aLong7106 = -42244196890836447L * (long) i;
			aClass694_10242.method14147(class527, -927217370);
		}
	}

	int method7433(int i, byte i_10_) {
		Class527_Sub8_Sub13 class527_sub8_sub13 = (Class527_Sub8_Sub13) aClass14_10236.method709((long) i);
		if (class527_sub8_sub13 != null)
			return class527_sub8_sub13.method18323((byte) 103);
		return 0;
	}

	public boolean method15883(int i) {
		return aBool10238;
	}

	public int method15884(byte i) {
		if (aClass469_10250 == null)
			return 0;
		if (!aBool10239)
			return -1019954659 * aClass469_10250.anInt5336;
		Class527 class527 = aClass694_10227.method14081((short) -1521);
		if (null == class527)
			return 0;
		return (int) (-8168620736534281759L * class527.aLong7106);
	}

	boolean method15885(int i) {
		return aClass468_10222 != null;
	}

	public int method15886() {
		return anInt10230 * -869292211;
	}

	Class469 method7429() {
		if (aClass469_10250 != null)
			return aClass469_10250;
		if (null == aClass527_Sub8_Sub13_10220) {
			if (aClass452_10243.method7299((byte) -69))
				return null;
			aClass527_Sub8_Sub13_10220 = aClass452_10243.method7297(255, anInt10226 * -1920634289, (byte) 0, true, -1344936540);
		}
		if (aClass527_Sub8_Sub13_10220.aBool11768)
			return null;
		byte[] is = aClass527_Sub8_Sub13_10220.method18319(1776673493);
		if (aClass527_Sub8_Sub13_10220 instanceof Class527_Sub8_Sub13_Sub1) {
			try {
				if (is == null)
					throw new RuntimeException();
				aClass469_10250 = new Class469(is, 2021158347 * anInt10240, aByteArray10241);
				if (anInt10229 * -1289591281 != -605103343 * aClass469_10250.anInt5339)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				aClass469_10250 = null;
				if (aClass452_10243.method7299((byte) -11))
					aClass527_Sub8_Sub13_10220 = null;
				else
					aClass527_Sub8_Sub13_10220 = aClass452_10243.method7297(255, anInt10226 * -1920634289, (byte) 0, true, -1375096479);
				return null;
			}
		} else {
			try {
				if (null == is)
					throw new RuntimeException();
				aClass469_10250 = new Class469(is, 2021158347 * anInt10240, aByteArray10241);
			} catch (RuntimeException runtimeexception) {
				aClass452_10243.method7302(255, anInt10226 * -1920634289, 1862393440);
				aClass469_10250 = null;
				if (aClass452_10243.method7299((byte) 100))
					aClass527_Sub8_Sub13_10220 = null;
				else
					aClass527_Sub8_Sub13_10220 = aClass452_10243.method7297(255, anInt10226 * -1920634289, (byte) 0, true, -1711241240);
				return null;
			}
			if (null != aClass552_10225)
				aClass461_10223.method7586(-1920634289 * anInt10226, is, aClass552_10225, (byte) 38);
		}
		aClass527_Sub8_Sub13_10220 = null;
		if (aClass552_10224 != null) {
			aByteArray10234 = new byte[309096757 * aClass469_10250.anInt5340];
			anInt10230 = 0;
		}
		return aClass469_10250;
	}

	public int method15887() {
		if (aClass469_10250 == null)
			return 0;
		if (!aBool10239)
			return -1019954659 * aClass469_10250.anInt5336;
		Class527 class527 = aClass694_10227.method14081((short) -3926);
		if (null == class527)
			return 0;
		return (int) (-8168620736534281759L * class527.aLong7106);
	}

	Class469 method7439() {
		if (aClass469_10250 != null)
			return aClass469_10250;
		if (null == aClass527_Sub8_Sub13_10220) {
			if (aClass452_10243.method7299((byte) -81))
				return null;
			aClass527_Sub8_Sub13_10220 = aClass452_10243.method7297(255, anInt10226 * -1920634289, (byte) 0, true, -1740177034);
		}
		if (aClass527_Sub8_Sub13_10220.aBool11768)
			return null;
		byte[] is = aClass527_Sub8_Sub13_10220.method18319(1800713007);
		if (aClass527_Sub8_Sub13_10220 instanceof Class527_Sub8_Sub13_Sub1) {
			try {
				if (is == null)
					throw new RuntimeException();
				aClass469_10250 = new Class469(is, 2021158347 * anInt10240, aByteArray10241);
				if (anInt10229 * -1289591281 != -605103343 * aClass469_10250.anInt5339)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				aClass469_10250 = null;
				if (aClass452_10243.method7299((byte) -66))
					aClass527_Sub8_Sub13_10220 = null;
				else
					aClass527_Sub8_Sub13_10220 = aClass452_10243.method7297(255, anInt10226 * -1920634289, (byte) 0, true, -1986241902);
				return null;
			}
		} else {
			try {
				if (null == is)
					throw new RuntimeException();
				aClass469_10250 = new Class469(is, 2021158347 * anInt10240, aByteArray10241);
			} catch (RuntimeException runtimeexception) {
				aClass452_10243.method7302(255, anInt10226 * -1920634289, -178415089);
				aClass469_10250 = null;
				if (aClass452_10243.method7299((byte) 61))
					aClass527_Sub8_Sub13_10220 = null;
				else
					aClass527_Sub8_Sub13_10220 = aClass452_10243.method7297(255, anInt10226 * -1920634289, (byte) 0, true, -1903336944);
				return null;
			}
			if (null != aClass552_10225)
				aClass461_10223.method7586(-1920634289 * anInt10226, is, aClass552_10225, (byte) -27);
		}
		aClass527_Sub8_Sub13_10220 = null;
		if (aClass552_10224 != null) {
			aByteArray10234 = new byte[309096757 * aClass469_10250.anInt5340];
			anInt10230 = 0;
		}
		return aClass469_10250;
	}

	int method7436(int i) {
		Class527_Sub8_Sub13 class527_sub8_sub13 = (Class527_Sub8_Sub13) aClass14_10236.method709((long) i);
		if (class527_sub8_sub13 != null)
			return class527_sub8_sub13.method18323((byte) 13);
		return 0;
	}

	byte[] method7442(int i) {
		Class527_Sub8_Sub13 class527_sub8_sub13 = method15896(i, 0, 860645870);
		if (class527_sub8_sub13 == null)
			return null;
		byte[] is = class527_sub8_sub13.method18319(2114100474);
		class527_sub8_sub13.method8735(-1889161967);
		return is;
	}

	Class527_Sub8_Sub13 method15888(int i, int i_11_) {
		Class527_Sub8_Sub13 class527_sub8_sub13 = (Class527_Sub8_Sub13) aClass14_10236.method709((long) i);
		if (null != class527_sub8_sub13 && 0 == i_11_ && !class527_sub8_sub13.aBool11767 && class527_sub8_sub13.aBool11768) {
			class527_sub8_sub13.method8735(-1889161967);
			class527_sub8_sub13 = null;
		}
		if (class527_sub8_sub13 == null) {
			if (i_11_ == 0) {
				if (aClass552_10224 != null && -1 != aByteArray10234[i])
					class527_sub8_sub13 = aClass461_10223.method7579(i, aClass552_10224, (byte) 33);
				else if (aClass468_10222 != null) {
					class527_sub8_sub13 = aClass468_10222.method7687(-1920634289 * anInt10226, i, (byte) 2, true, (aClass469_10250.anIntArray5347[i]), (aClass469_10250.anIntArray5333[i]), (byte) 0);
					if (null == class527_sub8_sub13)
						return null;
				} else if (!aClass452_10243.method7299((byte) 22))
					class527_sub8_sub13 = aClass452_10243.method7297(-1920634289 * anInt10226, i, (byte) 2, true, -1637004198);
				else
					return null;
			} else if (i_11_ == 1) {
				if (null == aClass552_10224)
					throw new RuntimeException();
				class527_sub8_sub13 = aClass461_10223.method7581(i, aClass552_10224, -877366523);
			} else if (i_11_ == 2) {
				if (null == aClass552_10224)
					throw new RuntimeException();
				if (-1 != aByteArray10234[i])
					throw new RuntimeException();
				if (aClass468_10222 != null)
					return null;
				if (!aClass452_10243.method7323(-1042101405))
					class527_sub8_sub13 = aClass452_10243.method7297(anInt10226 * -1920634289, i, (byte) 2, false, -1840752826);
				else
					return null;
			} else
				throw new RuntimeException();
			aClass14_10236.method714(class527_sub8_sub13, (long) i);
		}
		if (class527_sub8_sub13.aBool11768)
			return null;
		byte[] is = class527_sub8_sub13.method18319(2144193282);
		if (class527_sub8_sub13 instanceof Class527_Sub8_Sub13_Sub1) {
			Class527_Sub8_Sub13 class527_sub8_sub13_12_;
			try {
				if (is == null || is.length <= 2)
					throw new RuntimeException();
				aCRC32_10247.reset();
				aCRC32_10247.update(is, 0, is.length - 2);
				int i_13_ = (int) aCRC32_10247.getValue();
				if (aClass469_10250.anIntArray5347[i] != i_13_)
					throw new RuntimeException();
				if (aClass469_10250.aByteArrayArray5343 != null && null != aClass469_10250.aByteArrayArray5343[i]) {
					byte[] is_14_ = aClass469_10250.aByteArrayArray5343[i];
					byte[] is_15_ = Class693.method14074(is, 0, is.length - 2, -1127442192);
					for (int i_16_ = 0; i_16_ < 64; i_16_++) {
						if (is_15_[i_16_] != is_14_[i_16_])
							throw new RuntimeException();
					}
				}
				int i_17_ = (((is[is.length - 2] & 0xff) << 8) + (is[is.length - 1] & 0xff));
				if ((aClass469_10250.anIntArray5333[i] & 0xffff) != i_17_)
					throw new RuntimeException();
				if (aByteArray10234[i] != 1) {
					if (0 != aByteArray10234[i]) {
						/* empty */
					}
					anInt10230 += 1499326853;
					aByteArray10234[i] = (byte) 1;
				}
				if (!class527_sub8_sub13.aBool11767)
					class527_sub8_sub13.method8735(-1889161967);
				class527_sub8_sub13_12_ = class527_sub8_sub13;
			} catch (Exception exception) {
				aByteArray10234[i] = (byte) -1;
				class527_sub8_sub13.method8735(-1889161967);
				if (class527_sub8_sub13.aBool11767) {
					if (null != aClass468_10222) {
						if (!aClass468_10222.method7669(-1810551113)) {
							Class527_Sub8_Sub13_Sub2 class527_sub8_sub13_sub2 = (aClass468_10222.method7687(anInt10226 * -1920634289, i, (byte) 2, true, aClass469_10250.anIntArray5347[i], aClass469_10250.anIntArray5333[i], (byte) 0));
							if (class527_sub8_sub13_sub2 != null)
								aClass14_10236.method714(class527_sub8_sub13_sub2, (long) i);
						}
					} else if (!aClass452_10243.method7299((byte) -60)) {
						Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = aClass452_10243.method7297((anInt10226 * -1920634289), i, (byte) 2, true, -1862851706);
						aClass14_10236.method714(class527_sub8_sub13_sub3, (long) i);
					}
				}
				return null;
			}
			return class527_sub8_sub13_12_;
		}
		try {
			if (is == null || is.length <= 2) {
				if (null != aClass468_10222) {
					class527_sub8_sub13.method8735(-1889161967);
					return null;
				}
				throw new RuntimeException();
			}
			aCRC32_10247.reset();
			aCRC32_10247.update(is, 0, is.length - 2);
			int i_18_ = (int) aCRC32_10247.getValue();
			if (i_18_ != aClass469_10250.anIntArray5347[i])
				throw new RuntimeException();
			if (null != aClass469_10250.aByteArrayArray5343 && null != aClass469_10250.aByteArrayArray5343[i]) {
				byte[] is_19_ = aClass469_10250.aByteArrayArray5343[i];
				byte[] is_20_ = Class693.method14074(is, 0, is.length - 2, 2128928450);
				for (int i_21_ = 0; i_21_ < 64; i_21_++) {
					if (is_19_[i_21_] != is_20_[i_21_])
						throw new RuntimeException();
				}
			}
			if (null != aClass468_10222) {
				aClass452_10243.anInt4949 = 0;
				aClass452_10243.anInt4942 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			aClass452_10243.method7302(anInt10226 * -1920634289, i, 1046568293);
			class527_sub8_sub13.method8735(-1889161967);
			if (class527_sub8_sub13.aBool11767) {
				if (null != aClass468_10222) {
					if (!aClass468_10222.method7669(-796965923)) {
						Class527_Sub8_Sub13_Sub2 class527_sub8_sub13_sub2 = (aClass468_10222.method7687(-1920634289 * anInt10226, i, (byte) 2, true, aClass469_10250.anIntArray5347[i], aClass469_10250.anIntArray5333[i], (byte) 0));
						if (null != class527_sub8_sub13_sub2)
							aClass14_10236.method714(class527_sub8_sub13_sub2, (long) i);
					}
				} else if (!aClass452_10243.method7299((byte) -37)) {
					Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = aClass452_10243.method7297(-1920634289 * anInt10226, i, (byte) 2, true, -1965333449);
					aClass14_10236.method714(class527_sub8_sub13_sub3, (long) i);
				}
			}
			return null;
		}
		is[is.length - 2] = (byte) (aClass469_10250.anIntArray5333[i] >>> 8);
		is[is.length - 1] = (byte) aClass469_10250.anIntArray5333[i];
		if (null != aClass552_10224) {
			aClass461_10223.method7586(i, is, aClass552_10224, (byte) -31);
			if (aByteArray10234[i] != 1) {
				anInt10230 += 1499326853;
				aByteArray10234[i] = (byte) 1;
			}
		}
		if (!class527_sub8_sub13.aBool11767)
			class527_sub8_sub13.method8735(-1889161967);
		return class527_sub8_sub13;
	}

	int method7432(int i) {
		Class527_Sub8_Sub13 class527_sub8_sub13 = (Class527_Sub8_Sub13) aClass14_10236.method709((long) i);
		if (class527_sub8_sub13 != null)
			return class527_sub8_sub13.method18323((byte) 75);
		return 0;
	}

	public int method15889() {
		if (aClass469_10250 == null)
			return 0;
		return aClass469_10250.anInt5336 * -1019954659;
	}

	boolean method15890() {
		return aClass468_10222 != null;
	}

	int method7443(int i) {
		Class527_Sub8_Sub13 class527_sub8_sub13 = (Class527_Sub8_Sub13) aClass14_10236.method709((long) i);
		if (class527_sub8_sub13 != null)
			return class527_sub8_sub13.method18323((byte) 83);
		return 0;
	}

	Class469 method7435() {
		if (aClass469_10250 != null)
			return aClass469_10250;
		if (null == aClass527_Sub8_Sub13_10220) {
			if (aClass452_10243.method7299((byte) -8))
				return null;
			aClass527_Sub8_Sub13_10220 = aClass452_10243.method7297(255, anInt10226 * -1920634289, (byte) 0, true, -1579516531);
		}
		if (aClass527_Sub8_Sub13_10220.aBool11768)
			return null;
		byte[] is = aClass527_Sub8_Sub13_10220.method18319(-875098044);
		if (aClass527_Sub8_Sub13_10220 instanceof Class527_Sub8_Sub13_Sub1) {
			try {
				if (is == null)
					throw new RuntimeException();
				aClass469_10250 = new Class469(is, 2021158347 * anInt10240, aByteArray10241);
				if (anInt10229 * -1289591281 != -605103343 * aClass469_10250.anInt5339)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				aClass469_10250 = null;
				if (aClass452_10243.method7299((byte) 3))
					aClass527_Sub8_Sub13_10220 = null;
				else
					aClass527_Sub8_Sub13_10220 = aClass452_10243.method7297(255, anInt10226 * -1920634289, (byte) 0, true, -1636539466);
				return null;
			}
		} else {
			try {
				if (null == is)
					throw new RuntimeException();
				aClass469_10250 = new Class469(is, 2021158347 * anInt10240, aByteArray10241);
			} catch (RuntimeException runtimeexception) {
				aClass452_10243.method7302(255, anInt10226 * -1920634289, -1185891500);
				aClass469_10250 = null;
				if (aClass452_10243.method7299((byte) 35))
					aClass527_Sub8_Sub13_10220 = null;
				else
					aClass527_Sub8_Sub13_10220 = aClass452_10243.method7297(255, anInt10226 * -1920634289, (byte) 0, true, -1995314764);
				return null;
			}
			if (null != aClass552_10225)
				aClass461_10223.method7586(-1920634289 * anInt10226, is, aClass552_10225, (byte) -20);
		}
		aClass527_Sub8_Sub13_10220 = null;
		if (aClass552_10224 != null) {
			aByteArray10234 = new byte[309096757 * aClass469_10250.anInt5340];
			anInt10230 = 0;
		}
		return aClass469_10250;
	}

	Class527_Sub8_Sub13 method15891(int i, int i_22_) {
		Class527_Sub8_Sub13 class527_sub8_sub13 = (Class527_Sub8_Sub13) aClass14_10236.method709((long) i);
		if (null != class527_sub8_sub13 && 0 == i_22_ && !class527_sub8_sub13.aBool11767 && class527_sub8_sub13.aBool11768) {
			class527_sub8_sub13.method8735(-1889161967);
			class527_sub8_sub13 = null;
		}
		if (class527_sub8_sub13 == null) {
			if (i_22_ == 0) {
				if (aClass552_10224 != null && -1 != aByteArray10234[i])
					class527_sub8_sub13 = aClass461_10223.method7579(i, aClass552_10224, (byte) 16);
				else if (aClass468_10222 != null) {
					class527_sub8_sub13 = aClass468_10222.method7687(-1920634289 * anInt10226, i, (byte) 2, true, (aClass469_10250.anIntArray5347[i]), (aClass469_10250.anIntArray5333[i]), (byte) 0);
					if (null == class527_sub8_sub13)
						return null;
				} else if (!aClass452_10243.method7299((byte) -92))
					class527_sub8_sub13 = aClass452_10243.method7297(-1920634289 * anInt10226, i, (byte) 2, true, -1739973485);
				else
					return null;
			} else if (i_22_ == 1) {
				if (null == aClass552_10224)
					throw new RuntimeException();
				class527_sub8_sub13 = aClass461_10223.method7581(i, aClass552_10224, -191342125);
			} else if (i_22_ == 2) {
				if (null == aClass552_10224)
					throw new RuntimeException();
				if (-1 != aByteArray10234[i])
					throw new RuntimeException();
				if (aClass468_10222 != null)
					return null;
				if (!aClass452_10243.method7323(-1025674915))
					class527_sub8_sub13 = aClass452_10243.method7297(anInt10226 * -1920634289, i, (byte) 2, false, -1968436955);
				else
					return null;
			} else
				throw new RuntimeException();
			aClass14_10236.method714(class527_sub8_sub13, (long) i);
		}
		if (class527_sub8_sub13.aBool11768)
			return null;
		byte[] is = class527_sub8_sub13.method18319(1443710701);
		if (class527_sub8_sub13 instanceof Class527_Sub8_Sub13_Sub1) {
			Class527_Sub8_Sub13 class527_sub8_sub13_23_;
			try {
				if (is == null || is.length <= 2)
					throw new RuntimeException();
				aCRC32_10247.reset();
				aCRC32_10247.update(is, 0, is.length - 2);
				int i_24_ = (int) aCRC32_10247.getValue();
				if (aClass469_10250.anIntArray5347[i] != i_24_)
					throw new RuntimeException();
				if (aClass469_10250.aByteArrayArray5343 != null && null != aClass469_10250.aByteArrayArray5343[i]) {
					byte[] is_25_ = aClass469_10250.aByteArrayArray5343[i];
					byte[] is_26_ = Class693.method14074(is, 0, is.length - 2, -721922445);
					for (int i_27_ = 0; i_27_ < 64; i_27_++) {
						if (is_26_[i_27_] != is_25_[i_27_])
							throw new RuntimeException();
					}
				}
				int i_28_ = (((is[is.length - 2] & 0xff) << 8) + (is[is.length - 1] & 0xff));
				if ((aClass469_10250.anIntArray5333[i] & 0xffff) != i_28_)
					throw new RuntimeException();
				if (aByteArray10234[i] != 1) {
					if (0 != aByteArray10234[i]) {
						/* empty */
					}
					anInt10230 += 1499326853;
					aByteArray10234[i] = (byte) 1;
				}
				if (!class527_sub8_sub13.aBool11767)
					class527_sub8_sub13.method8735(-1889161967);
				class527_sub8_sub13_23_ = class527_sub8_sub13;
			} catch (Exception exception) {
				aByteArray10234[i] = (byte) -1;
				class527_sub8_sub13.method8735(-1889161967);
				if (class527_sub8_sub13.aBool11767) {
					if (null != aClass468_10222) {
						if (!aClass468_10222.method7669(-1784922574)) {
							Class527_Sub8_Sub13_Sub2 class527_sub8_sub13_sub2 = (aClass468_10222.method7687(anInt10226 * -1920634289, i, (byte) 2, true, aClass469_10250.anIntArray5347[i], aClass469_10250.anIntArray5333[i], (byte) 0));
							if (class527_sub8_sub13_sub2 != null)
								aClass14_10236.method714(class527_sub8_sub13_sub2, (long) i);
						}
					} else if (!aClass452_10243.method7299((byte) 57)) {
						Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = aClass452_10243.method7297((anInt10226 * -1920634289), i, (byte) 2, true, -1360689644);
						aClass14_10236.method714(class527_sub8_sub13_sub3, (long) i);
					}
				}
				return null;
			}
			return class527_sub8_sub13_23_;
		}
		try {
			if (is == null || is.length <= 2) {
				if (null != aClass468_10222) {
					class527_sub8_sub13.method8735(-1889161967);
					return null;
				}
				throw new RuntimeException();
			}
			aCRC32_10247.reset();
			aCRC32_10247.update(is, 0, is.length - 2);
			int i_29_ = (int) aCRC32_10247.getValue();
			if (i_29_ != aClass469_10250.anIntArray5347[i])
				throw new RuntimeException();
			if (null != aClass469_10250.aByteArrayArray5343 && null != aClass469_10250.aByteArrayArray5343[i]) {
				byte[] is_30_ = aClass469_10250.aByteArrayArray5343[i];
				byte[] is_31_ = Class693.method14074(is, 0, is.length - 2, -1543181443);
				for (int i_32_ = 0; i_32_ < 64; i_32_++) {
					if (is_30_[i_32_] != is_31_[i_32_])
						throw new RuntimeException();
				}
			}
			if (null != aClass468_10222) {
				aClass452_10243.anInt4949 = 0;
				aClass452_10243.anInt4942 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			aClass452_10243.method7302(anInt10226 * -1920634289, i, -1954621644);
			class527_sub8_sub13.method8735(-1889161967);
			if (class527_sub8_sub13.aBool11767) {
				if (null != aClass468_10222) {
					if (!aClass468_10222.method7669(-1742089952)) {
						Class527_Sub8_Sub13_Sub2 class527_sub8_sub13_sub2 = (aClass468_10222.method7687(-1920634289 * anInt10226, i, (byte) 2, true, aClass469_10250.anIntArray5347[i], aClass469_10250.anIntArray5333[i], (byte) 0));
						if (null != class527_sub8_sub13_sub2)
							aClass14_10236.method714(class527_sub8_sub13_sub2, (long) i);
					}
				} else if (!aClass452_10243.method7299((byte) 67)) {
					Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = aClass452_10243.method7297(-1920634289 * anInt10226, i, (byte) 2, true, -1926671280);
					aClass14_10236.method714(class527_sub8_sub13_sub3, (long) i);
				}
			}
			return null;
		}
		is[is.length - 2] = (byte) (aClass469_10250.anIntArray5333[i] >>> 8);
		is[is.length - 1] = (byte) aClass469_10250.anIntArray5333[i];
		if (null != aClass552_10224) {
			aClass461_10223.method7586(i, is, aClass552_10224, (byte) -16);
			if (aByteArray10234[i] != 1) {
				anInt10230 += 1499326853;
				aByteArray10234[i] = (byte) 1;
			}
		}
		if (!class527_sub8_sub13.aBool11767)
			class527_sub8_sub13.method8735(-1889161967);
		return class527_sub8_sub13;
	}

	void method15892(int i, byte[] is, int i_33_, int i_34_) {
		if (!method15874(i, is, i_33_, i_34_, -1507819781)) {
			anInt10240 = 794775523 * i;
			aByteArray10241 = is;
			anInt10229 = -1989555985 * i_33_;
			aClass469_10250 = null;
			aClass527_Sub8_Sub13_10220 = null;
			if (!aClass452_10243.method7299((byte) -4))
				aClass527_Sub8_Sub13_10220 = aClass452_10243.method7297(255, -1920634289 * anInt10226, (byte) 0, true, -1926908634);
		}
	}

	boolean method15893(int i, byte[] is, int i_35_, int i_36_) {
		if (i == anInt10240 * 2021158347 && i_35_ == -1289591281 * anInt10229) {
			boolean bool = true;
			for (int i_37_ = 0; i_37_ < aByteArray10241.length; i_37_++) {
				if (is[i_37_] != aByteArray10241[i_37_]) {
					bool = false;
					break;
				}
			}
			if (bool)
				return true;
		}
		return false;
	}

	public int method15894() {
		if (method7440((byte) 68) == null) {
			if (aClass527_Sub8_Sub13_10220 == null)
				return 0;
			return aClass527_Sub8_Sub13_10220.method18323((byte) 92);
		}
		return 100;
	}

	public int method15895() {
		if (method7440((byte) 17) == null) {
			if (aClass527_Sub8_Sub13_10220 == null)
				return 0;
			return aClass527_Sub8_Sub13_10220.method18323((byte) 116);
		}
		return 100;
	}

	Class527_Sub8_Sub13 method15896(int i, int i_38_, int i_39_) {
		Class527_Sub8_Sub13 class527_sub8_sub13 = (Class527_Sub8_Sub13) aClass14_10236.method709((long) i);
		if (null != class527_sub8_sub13 && 0 == i_38_ && !class527_sub8_sub13.aBool11767 && class527_sub8_sub13.aBool11768) {
			class527_sub8_sub13.method8735(-1889161967);
			class527_sub8_sub13 = null;
		}
		if (class527_sub8_sub13 == null) {
			if (i_38_ == 0) {
				if (aClass552_10224 != null && -1 != aByteArray10234[i])
					class527_sub8_sub13 = aClass461_10223.method7579(i, aClass552_10224, (byte) 97);
				else if (aClass468_10222 != null) {
					class527_sub8_sub13 = aClass468_10222.method7687(-1920634289 * anInt10226, i, (byte) 2, true, (aClass469_10250.anIntArray5347[i]), (aClass469_10250.anIntArray5333[i]), (byte) 0);
					if (null == class527_sub8_sub13)
						return null;
				} else if (!aClass452_10243.method7299((byte) 47))
					class527_sub8_sub13 = aClass452_10243.method7297(-1920634289 * anInt10226, i, (byte) 2, true, -1701476663);
				else
					return null;
			} else if (i_38_ == 1) {
				if (null == aClass552_10224)
					throw new RuntimeException();
				class527_sub8_sub13 = aClass461_10223.method7581(i, aClass552_10224, 995454217);
			} else if (i_38_ == 2) {
				if (null == aClass552_10224)
					throw new RuntimeException();
				if (-1 != aByteArray10234[i])
					throw new RuntimeException();
				if (aClass468_10222 != null)
					return null;
				if (!aClass452_10243.method7323(-2111914387))
					class527_sub8_sub13 = aClass452_10243.method7297(anInt10226 * -1920634289, i, (byte) 2, false, -1650336627);
				else
					return null;
			} else
				throw new RuntimeException();
			aClass14_10236.method714(class527_sub8_sub13, (long) i);
		}
		if (class527_sub8_sub13.aBool11768)
			return null;
		byte[] is = class527_sub8_sub13.method18319(1592679947);
		if (class527_sub8_sub13 instanceof Class527_Sub8_Sub13_Sub1) {
			Class527_Sub8_Sub13 class527_sub8_sub13_40_;
			try {
				if (is == null || is.length <= 2)
					throw new RuntimeException();
				aCRC32_10247.reset();
				aCRC32_10247.update(is, 0, is.length - 2);
				int i_41_ = (int) aCRC32_10247.getValue();
				if (aClass469_10250.anIntArray5347[i] != i_41_)
					throw new RuntimeException();
				if (aClass469_10250.aByteArrayArray5343 != null && null != aClass469_10250.aByteArrayArray5343[i]) {
					byte[] is_42_ = aClass469_10250.aByteArrayArray5343[i];
					byte[] is_43_ = Class693.method14074(is, 0, is.length - 2, 1149426794);
					for (int i_44_ = 0; i_44_ < 64; i_44_++) {
						if (is_43_[i_44_] != is_42_[i_44_])
							throw new RuntimeException();
					}
				}
				int i_45_ = (((is[is.length - 2] & 0xff) << 8) + (is[is.length - 1] & 0xff));
				if ((aClass469_10250.anIntArray5333[i] & 0xffff) != i_45_)
					throw new RuntimeException();
				if (aByteArray10234[i] != 1) {
					if (0 != aByteArray10234[i]) {
						/* empty */
					}
					anInt10230 += 1499326853;
					aByteArray10234[i] = (byte) 1;
				}
				if (!class527_sub8_sub13.aBool11767)
					class527_sub8_sub13.method8735(-1889161967);
				class527_sub8_sub13_40_ = class527_sub8_sub13;
			} catch (Exception exception) {
				aByteArray10234[i] = (byte) -1;
				class527_sub8_sub13.method8735(-1889161967);
				if (class527_sub8_sub13.aBool11767) {
					if (null != aClass468_10222) {
						if (!aClass468_10222.method7669(-1936243909)) {
							Class527_Sub8_Sub13_Sub2 class527_sub8_sub13_sub2 = (aClass468_10222.method7687(anInt10226 * -1920634289, i, (byte) 2, true, aClass469_10250.anIntArray5347[i], aClass469_10250.anIntArray5333[i], (byte) 0));
							if (class527_sub8_sub13_sub2 != null)
								aClass14_10236.method714(class527_sub8_sub13_sub2, (long) i);
						}
					} else if (!aClass452_10243.method7299((byte) -45)) {
						Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = aClass452_10243.method7297((anInt10226 * -1920634289), i, (byte) 2, true, -2060460443);
						aClass14_10236.method714(class527_sub8_sub13_sub3, (long) i);
					}
				}
				return null;
			}
			return class527_sub8_sub13_40_;
		}
		try {
			if (is == null || is.length <= 2) {
				if (null != aClass468_10222) {
					class527_sub8_sub13.method8735(-1889161967);
					return null;
				}
				throw new RuntimeException();
			}
			aCRC32_10247.reset();
			aCRC32_10247.update(is, 0, is.length - 2);
			int i_46_ = (int) aCRC32_10247.getValue();
			if (i_46_ != aClass469_10250.anIntArray5347[i])
				throw new RuntimeException();
			if (null != aClass469_10250.aByteArrayArray5343 && null != aClass469_10250.aByteArrayArray5343[i]) {
				byte[] is_47_ = aClass469_10250.aByteArrayArray5343[i];
				byte[] is_48_ = Class693.method14074(is, 0, is.length - 2, -459629842);
				for (int i_49_ = 0; i_49_ < 64; i_49_++) {
					if (is_47_[i_49_] != is_48_[i_49_])
						throw new RuntimeException();
				}
			}
			if (null != aClass468_10222) {
				aClass452_10243.anInt4949 = 0;
				aClass452_10243.anInt4942 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			aClass452_10243.method7302(anInt10226 * -1920634289, i, -1240299593);
			class527_sub8_sub13.method8735(-1889161967);
			if (class527_sub8_sub13.aBool11767) {
				if (null != aClass468_10222) {
					if (!aClass468_10222.method7669(-2088032641)) {
						Class527_Sub8_Sub13_Sub2 class527_sub8_sub13_sub2 = (aClass468_10222.method7687(-1920634289 * anInt10226, i, (byte) 2, true, aClass469_10250.anIntArray5347[i], aClass469_10250.anIntArray5333[i], (byte) 0));
						if (null != class527_sub8_sub13_sub2)
							aClass14_10236.method714(class527_sub8_sub13_sub2, (long) i);
					}
				} else if (!aClass452_10243.method7299((byte) 24)) {
					Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = aClass452_10243.method7297(-1920634289 * anInt10226, i, (byte) 2, true, -1651088360);
					aClass14_10236.method714(class527_sub8_sub13_sub3, (long) i);
				}
			}
			return null;
		}
		is[is.length - 2] = (byte) (aClass469_10250.anIntArray5333[i] >>> 8);
		is[is.length - 1] = (byte) aClass469_10250.anIntArray5333[i];
		if (null != aClass552_10224) {
			aClass461_10223.method7586(i, is, aClass552_10224, (byte) -34);
			if (aByteArray10234[i] != 1) {
				anInt10230 += 1499326853;
				aByteArray10234[i] = (byte) 1;
			}
		}
		if (!class527_sub8_sub13.aBool11767)
			class527_sub8_sub13.method8735(-1889161967);
		return class527_sub8_sub13;
	}

	Class457_Sub1(int i, Class552 class552, Class552 class552_50_, Class452 class452, Class468 class468, Class461 class461, int i_51_, byte[] is, int i_52_, boolean bool, int i_53_) {
		anInt10235 = 0;
		aClass694_10242 = new Class694();
		aLong10244 = 0L;
		anInt10226 = i * 618685615;
		aClass552_10224 = class552;
		if (null == aClass552_10224)
			aBool10239 = false;
		else {
			aBool10239 = true;
			aClass694_10227 = new Class694();
		}
		aClass552_10225 = class552_50_;
		aClass452_10243 = class452;
		aClass468_10222 = class468;
		aClass461_10223 = class461;
		anInt10240 = 794775523 * i_51_;
		aByteArray10241 = is;
		anInt10229 = -1989555985 * i_52_;
		aBool10221 = bool;
		if (null != aClass552_10225)
			aClass527_Sub8_Sub13_10220 = aClass461_10223.method7579(-1920634289 * anInt10226, aClass552_10225, (byte) 61);
	}

	public int method15897() {
		if (method7440((byte) 18) == null) {
			if (aClass527_Sub8_Sub13_10220 == null)
				return 0;
			return aClass527_Sub8_Sub13_10220.method18323((byte) 33);
		}
		return 100;
	}

	public int method15898() {
		if (method7440((byte) 8) == null) {
			if (aClass527_Sub8_Sub13_10220 == null)
				return 0;
			return aClass527_Sub8_Sub13_10220.method18323((byte) 104);
		}
		return 100;
	}

	void method15899() {
		if (null != aClass694_10227 && method7440((byte) 28) != null) {
			for (Class527 class527 = aClass694_10242.method14081((short) 4519); class527 != null; class527 = aClass694_10242.method14086(-65534)) {
				int i = (int) (-8168620736534281759L * class527.aLong7106);
				if (i < 0 || i >= aClass469_10250.anInt5340 * 309096757 || aClass469_10250.anIntArray5335[i] == 0)
					class527.method8735(-1889161967);
				else {
					if (aByteArray10234[i] == 0)
						method15896(i, 1, 980203188);
					if (-1 == aByteArray10234[i])
						method15896(i, 2, -9243359);
					if (aByteArray10234[i] == 1)
						class527.method8735(-1889161967);
				}
			}
		}
	}

	public void method15900(int i) {
		if (null == aClass468_10222 && null != aClass552_10224) {
			aBool10237 = true;
			aBool10238 = true;
			if (aClass694_10227 == null)
				aClass694_10227 = new Class694();
		}
	}

	void method15901() {
		if (null != aClass694_10227 && method7440((byte) 38) != null) {
			for (Class527 class527 = aClass694_10242.method14081((short) 14572); class527 != null; class527 = aClass694_10242.method14086(-65534)) {
				int i = (int) (-8168620736534281759L * class527.aLong7106);
				if (i < 0 || i >= aClass469_10250.anInt5340 * 309096757 || aClass469_10250.anIntArray5335[i] == 0)
					class527.method8735(-1889161967);
				else {
					if (aByteArray10234[i] == 0)
						method15896(i, 1, 1814844928);
					if (-1 == aByteArray10234[i])
						method15896(i, 2, 1759972784);
					if (aByteArray10234[i] == 1)
						class527.method8735(-1889161967);
				}
			}
		}
	}

	void method15902() {
		if (null != aClass694_10227 && method7440((byte) 21) != null) {
			for (Class527 class527 = aClass694_10242.method14081((short) 641); class527 != null; class527 = aClass694_10242.method14086(-65534)) {
				int i = (int) (-8168620736534281759L * class527.aLong7106);
				if (i < 0 || i >= aClass469_10250.anInt5340 * 309096757 || aClass469_10250.anIntArray5335[i] == 0)
					class527.method8735(-1889161967);
				else {
					if (aByteArray10234[i] == 0)
						method15896(i, 1, 2105786891);
					if (-1 == aByteArray10234[i])
						method15896(i, 2, 858058112);
					if (aByteArray10234[i] == 1)
						class527.method8735(-1889161967);
				}
			}
		}
	}

	Class469 method7434() {
		if (aClass469_10250 != null)
			return aClass469_10250;
		if (null == aClass527_Sub8_Sub13_10220) {
			if (aClass452_10243.method7299((byte) -11))
				return null;
			aClass527_Sub8_Sub13_10220 = aClass452_10243.method7297(255, anInt10226 * -1920634289, (byte) 0, true, -2038413303);
		}
		if (aClass527_Sub8_Sub13_10220.aBool11768)
			return null;
		byte[] is = aClass527_Sub8_Sub13_10220.method18319(-751465253);
		if (aClass527_Sub8_Sub13_10220 instanceof Class527_Sub8_Sub13_Sub1) {
			try {
				if (is == null)
					throw new RuntimeException();
				aClass469_10250 = new Class469(is, 2021158347 * anInt10240, aByteArray10241);
				if (anInt10229 * -1289591281 != -605103343 * aClass469_10250.anInt5339)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				aClass469_10250 = null;
				if (aClass452_10243.method7299((byte) 17))
					aClass527_Sub8_Sub13_10220 = null;
				else
					aClass527_Sub8_Sub13_10220 = aClass452_10243.method7297(255, anInt10226 * -1920634289, (byte) 0, true, -1685593099);
				return null;
			}
		} else {
			try {
				if (null == is)
					throw new RuntimeException();
				aClass469_10250 = new Class469(is, 2021158347 * anInt10240, aByteArray10241);
			} catch (RuntimeException runtimeexception) {
				aClass452_10243.method7302(255, anInt10226 * -1920634289, -1177777718);
				aClass469_10250 = null;
				if (aClass452_10243.method7299((byte) 79))
					aClass527_Sub8_Sub13_10220 = null;
				else
					aClass527_Sub8_Sub13_10220 = aClass452_10243.method7297(255, anInt10226 * -1920634289, (byte) 0, true, -1553213613);
				return null;
			}
			if (null != aClass552_10225)
				aClass461_10223.method7586(-1920634289 * anInt10226, is, aClass552_10225, (byte) -6);
		}
		aClass527_Sub8_Sub13_10220 = null;
		if (aClass552_10224 != null) {
			aByteArray10234 = new byte[309096757 * aClass469_10250.anInt5340];
			anInt10230 = 0;
		}
		return aClass469_10250;
	}

	void method15903() {
		if (null != aClass694_10227) {
			if (method7440((byte) 23) == null)
				return;
			if (aBool10239) {
				boolean bool = true;
				for (Class527 class527 = aClass694_10227.method14081((short) -23572); class527 != null; class527 = aClass694_10227.method14086(-65534)) {
					int i = (int) (-8168620736534281759L * class527.aLong7106);
					if (0 == aByteArray10234[i])
						method15896(i, 1, 1672162430);
					if (aByteArray10234[i] != 0)
						class527.method8735(-1889161967);
					else
						bool = false;
				}
				while (1412822581 * anInt10235 < aClass469_10250.anIntArray5335.length) {
					if (aClass469_10250.anIntArray5335[anInt10235 * 1412822581] == 0)
						anInt10235 += 2072652829;
					else {
						if (1975026397 * aClass461_10223.anInt5093 >= 250) {
							bool = false;
							break;
						}
						if (0 == aByteArray10234[1412822581 * anInt10235])
							method15896(anInt10235 * 1412822581, 1, 577565548);
						if (0 == aByteArray10234[1412822581 * anInt10235]) {
							Class527 class527 = new Class527();
							class527.aLong7106 = -276812008104319275L * (long) anInt10235;
							aClass694_10227.method14147(class527, -1328023676);
							bool = false;
						}
						anInt10235 += 2072652829;
					}
				}
				if (bool) {
					aBool10239 = false;
					anInt10235 = 0;
				}
			} else if (aBool10237) {
				boolean bool = true;
				for (Class527 class527 = aClass694_10227.method14081((short) 8592); null != class527; class527 = aClass694_10227.method14086(-65534)) {
					int i = (int) (-8168620736534281759L * class527.aLong7106);
					if (aByteArray10234[i] != 1)
						method15896(i, 2, 426515787);
					if (1 == aByteArray10234[i])
						class527.method8735(-1889161967);
					else
						bool = false;
				}
				while (1412822581 * anInt10235 < aClass469_10250.anIntArray5335.length) {
					if (aClass469_10250.anIntArray5335[anInt10235 * 1412822581] == 0)
						anInt10235 += 2072652829;
					else {
						if (aClass452_10243.method7323(-1953545138)) {
							bool = false;
							break;
						}
						if (aByteArray10234[1412822581 * anInt10235] != 1)
							method15896(anInt10235 * 1412822581, 2, 859470884);
						if (1 != aByteArray10234[anInt10235 * 1412822581]) {
							Class527 class527 = new Class527();
							class527.aLong7106 = -276812008104319275L * (long) anInt10235;
							aClass694_10227.method14147(class527, -332544128);
							bool = false;
						}
						anInt10235 += 2072652829;
					}
				}
				if (bool) {
					aBool10237 = false;
					anInt10235 = 0;
				}
			} else
				aClass694_10227 = null;
		}
		if (aBool10221 && (Class234.method4347(-1408626088) >= aLong10244 * -1062118290634770187L)) {
			for (Class527_Sub8_Sub13 class527_sub8_sub13 = ((Class527_Sub8_Sub13) aClass14_10236.method713((byte) -30)); null != class527_sub8_sub13; class527_sub8_sub13 = ((Class527_Sub8_Sub13) aClass14_10236.method717(-1505782864))) {
				if (!class527_sub8_sub13.aBool11768) {
					if (class527_sub8_sub13.aBool11766) {
						if (!class527_sub8_sub13.aBool11767)
							throw new RuntimeException();
						class527_sub8_sub13.method8735(-1889161967);
					} else
						class527_sub8_sub13.aBool11766 = true;
				}
			}
			aLong10244 = ((Class234.method4347(-1408626088) + 1000L) * 1884655759191307101L);
		}
	}

	Class469 method7438() {
		if (aClass469_10250 != null)
			return aClass469_10250;
		if (null == aClass527_Sub8_Sub13_10220) {
			if (aClass452_10243.method7299((byte) -54))
				return null;
			aClass527_Sub8_Sub13_10220 = aClass452_10243.method7297(255, anInt10226 * -1920634289, (byte) 0, true, -1875563932);
		}
		if (aClass527_Sub8_Sub13_10220.aBool11768)
			return null;
		byte[] is = aClass527_Sub8_Sub13_10220.method18319(349863488);
		if (aClass527_Sub8_Sub13_10220 instanceof Class527_Sub8_Sub13_Sub1) {
			try {
				if (is == null)
					throw new RuntimeException();
				aClass469_10250 = new Class469(is, 2021158347 * anInt10240, aByteArray10241);
				if (anInt10229 * -1289591281 != -605103343 * aClass469_10250.anInt5339)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				aClass469_10250 = null;
				if (aClass452_10243.method7299((byte) -33))
					aClass527_Sub8_Sub13_10220 = null;
				else
					aClass527_Sub8_Sub13_10220 = aClass452_10243.method7297(255, anInt10226 * -1920634289, (byte) 0, true, -2034640289);
				return null;
			}
		} else {
			try {
				if (null == is)
					throw new RuntimeException();
				aClass469_10250 = new Class469(is, 2021158347 * anInt10240, aByteArray10241);
			} catch (RuntimeException runtimeexception) {
				aClass452_10243.method7302(255, anInt10226 * -1920634289, 1859651331);
				aClass469_10250 = null;
				if (aClass452_10243.method7299((byte) -4))
					aClass527_Sub8_Sub13_10220 = null;
				else
					aClass527_Sub8_Sub13_10220 = aClass452_10243.method7297(255, anInt10226 * -1920634289, (byte) 0, true, -1677205977);
				return null;
			}
			if (null != aClass552_10225)
				aClass461_10223.method7586(-1920634289 * anInt10226, is, aClass552_10225, (byte) 47);
		}
		aClass527_Sub8_Sub13_10220 = null;
		if (aClass552_10224 != null) {
			aByteArray10234 = new byte[309096757 * aClass469_10250.anInt5340];
			anInt10230 = 0;
		}
		return aClass469_10250;
	}

	public int method15904() {
		if (aClass469_10250 == null)
			return 0;
		if (!aBool10239)
			return -1019954659 * aClass469_10250.anInt5336;
		Class527 class527 = aClass694_10227.method14081((short) 6044);
		if (null == class527)
			return 0;
		return (int) (-8168620736534281759L * class527.aLong7106);
	}

	public int method15905() {
		if (aClass469_10250 == null)
			return 0;
		return aClass469_10250.anInt5336 * -1019954659;
	}

	public int method15906() {
		if (aClass469_10250 == null)
			return 0;
		return aClass469_10250.anInt5336 * -1019954659;
	}

	void method15907(int i, byte[] is, int i_54_, int i_55_) {
		if (!method15874(i, is, i_54_, i_55_, -2080172030)) {
			anInt10240 = 794775523 * i;
			aByteArray10241 = is;
			anInt10229 = -1989555985 * i_54_;
			aClass469_10250 = null;
			aClass527_Sub8_Sub13_10220 = null;
			if (!aClass452_10243.method7299((byte) -35))
				aClass527_Sub8_Sub13_10220 = aClass452_10243.method7297(255, -1920634289 * anInt10226, (byte) 0, true, -1306691967);
		}
	}

	public int method15908() {
		if (method7440((byte) 8) == null) {
			if (aClass527_Sub8_Sub13_10220 == null)
				return 0;
			return aClass527_Sub8_Sub13_10220.method18323((byte) 69);
		}
		return 100;
	}

	int method7441(int i) {
		Class527_Sub8_Sub13 class527_sub8_sub13 = (Class527_Sub8_Sub13) aClass14_10236.method709((long) i);
		if (class527_sub8_sub13 != null)
			return class527_sub8_sub13.method18323((byte) 41);
		return 0;
	}

	void method15909(int i) {
		if (null != aClass694_10227) {
			if (method7440((byte) 97) == null)
				return;
			if (aBool10239) {
				boolean bool = true;
				for (Class527 class527 = aClass694_10227.method14081((short) 425); class527 != null; class527 = aClass694_10227.method14086(-65534)) {
					int i_56_ = (int) (-8168620736534281759L * class527.aLong7106);
					if (0 == aByteArray10234[i_56_])
						method15896(i_56_, 1, 287766082);
					if (aByteArray10234[i_56_] != 0)
						class527.method8735(-1889161967);
					else
						bool = false;
				}
				while (1412822581 * anInt10235 < aClass469_10250.anIntArray5335.length) {
					if (aClass469_10250.anIntArray5335[anInt10235 * 1412822581] == 0)
						anInt10235 += 2072652829;
					else {
						if (1975026397 * aClass461_10223.anInt5093 >= 250) {
							bool = false;
							break;
						}
						if (0 == aByteArray10234[1412822581 * anInt10235])
							method15896(anInt10235 * 1412822581, 1, 2112615547);
						if (0 == aByteArray10234[1412822581 * anInt10235]) {
							Class527 class527 = new Class527();
							class527.aLong7106 = -276812008104319275L * (long) anInt10235;
							aClass694_10227.method14147(class527, -1336450587);
							bool = false;
						}
						anInt10235 += 2072652829;
					}
				}
				if (bool) {
					aBool10239 = false;
					anInt10235 = 0;
				}
			} else if (aBool10237) {
				boolean bool = true;
				for (Class527 class527 = aClass694_10227.method14081((short) -18298); null != class527; class527 = aClass694_10227.method14086(-65534)) {
					int i_57_ = (int) (-8168620736534281759L * class527.aLong7106);
					if (aByteArray10234[i_57_] != 1)
						method15896(i_57_, 2, 55723220);
					if (1 == aByteArray10234[i_57_])
						class527.method8735(-1889161967);
					else
						bool = false;
				}
				while (1412822581 * anInt10235 < aClass469_10250.anIntArray5335.length) {
					if (aClass469_10250.anIntArray5335[anInt10235 * 1412822581] == 0)
						anInt10235 += 2072652829;
					else {
						if (aClass452_10243.method7323(-2008974136)) {
							bool = false;
							break;
						}
						if (aByteArray10234[1412822581 * anInt10235] != 1)
							method15896(anInt10235 * 1412822581, 2, 1594515684);
						if (1 != aByteArray10234[anInt10235 * 1412822581]) {
							Class527 class527 = new Class527();
							class527.aLong7106 = -276812008104319275L * (long) anInt10235;
							aClass694_10227.method14147(class527, -601762993);
							bool = false;
						}
						anInt10235 += 2072652829;
					}
				}
				if (bool) {
					aBool10237 = false;
					anInt10235 = 0;
				}
			} else
				aClass694_10227 = null;
		}
		if (aBool10221 && (Class234.method4347(-1408626088) >= aLong10244 * -1062118290634770187L)) {
			for (Class527_Sub8_Sub13 class527_sub8_sub13 = ((Class527_Sub8_Sub13) aClass14_10236.method713((byte) -6)); null != class527_sub8_sub13; class527_sub8_sub13 = ((Class527_Sub8_Sub13) aClass14_10236.method717(1097290615))) {
				if (!class527_sub8_sub13.aBool11768) {
					if (class527_sub8_sub13.aBool11766) {
						if (!class527_sub8_sub13.aBool11767)
							throw new RuntimeException();
						class527_sub8_sub13.method8735(-1889161967);
					} else
						class527_sub8_sub13.aBool11766 = true;
				}
			}
			aLong10244 = ((Class234.method4347(-1408626088) + 1000L) * 1884655759191307101L);
		}
	}

	public int method15910() {
		if (aClass469_10250 == null)
			return 0;
		if (!aBool10239)
			return -1019954659 * aClass469_10250.anInt5336;
		Class527 class527 = aClass694_10227.method14081((short) -2868);
		if (null == class527)
			return 0;
		return (int) (-8168620736534281759L * class527.aLong7106);
	}

	public int method15911() {
		if (aClass469_10250 == null)
			return 0;
		if (!aBool10239)
			return -1019954659 * aClass469_10250.anInt5336;
		Class527 class527 = aClass694_10227.method14081((short) 24502);
		if (null == class527)
			return 0;
		return (int) (-8168620736534281759L * class527.aLong7106);
	}

	public int method15912() {
		if (aClass469_10250 == null)
			return 0;
		if (!aBool10239)
			return -1019954659 * aClass469_10250.anInt5336;
		Class527 class527 = aClass694_10227.method14081((short) -6596);
		if (null == class527)
			return 0;
		return (int) (-8168620736534281759L * class527.aLong7106);
	}

	public int method15913() {
		if (aClass469_10250 == null)
			return 0;
		if (!aBool10239)
			return -1019954659 * aClass469_10250.anInt5336;
		Class527 class527 = aClass694_10227.method14081((short) -7798);
		if (null == class527)
			return 0;
		return (int) (-8168620736534281759L * class527.aLong7106);
	}

	public int method15914(byte i) {
		return anInt10230 * -869292211;
	}

	public void method15915() {
		if (null == aClass468_10222 && null != aClass552_10224) {
			aBool10237 = true;
			aBool10238 = true;
			if (aClass694_10227 == null)
				aClass694_10227 = new Class694();
		}
	}

	public boolean method15916() {
		return aBool10238;
	}

	public boolean method15917() {
		return aBool10238;
	}

	public boolean method15918() {
		return aBool10238;
	}

	public boolean method15919() {
		return aBool10238;
	}

	void method15920(boolean bool) {
		aClass468_10222.method7674(bool, 1948808790);
	}

	int method7444(int i) {
		Class527_Sub8_Sub13 class527_sub8_sub13 = (Class527_Sub8_Sub13) aClass14_10236.method709((long) i);
		if (class527_sub8_sub13 != null)
			return class527_sub8_sub13.method18323((byte) 67);
		return 0;
	}

	static final void method15921(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 100;
	}
}
