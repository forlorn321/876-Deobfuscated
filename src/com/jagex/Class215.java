/* Class215 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class215 {
	Class18 aClass18_2267;
	static final int anInt2268 = 2;
	long aLong2269;
	Class634[] aClass634Array2270;
	Class18 aClass18_2271;
	boolean aBool2272;
	String aString2273;
	static final int anInt2274 = 1;
	boolean aBool2275;
	int anInt2276;
	int anInt2277;
	int anInt2278;
	Class242 aClass242_2279;

	void method3905(Class242 class242) {
		aClass242_2279 = class242;
	}

	public void method3906(Interface28 interface28) {
		if (null == aClass18_2267)
			aClass18_2267 = new Class18(interface28.method159(-1745638946));
		else
			aClass18_2267.method19((byte) 7);
	}

	public int method3907(int i) {
		return anInt2276 * -217203455;
	}

	void method3908(int i) {
		anInt2277 = 1771213545 * i;
	}

	void method3909(Class242 class242, byte i) {
		aClass242_2279 = class242;
	}

	void method3910(int i, int i_0_) {
		anInt2278 = i * 1740157001;
	}

	public boolean method3911(int i) {
		return aBool2275;
	}

	void method3912(boolean bool, int i) {
		aBool2275 = bool;
	}

	public Class242 method3913(int i) {
		return aClass242_2279;
	}

	public boolean method3914() {
		return aBool2272;
	}

	public String method3915(byte i) {
		return aString2273;
	}

	void method3916(int i, int i_1_) {
		anInt2277 = 1771213545 * i;
	}

	public int method3917(byte i) {
		return anInt2278 * 667566585;
	}

	public boolean method3918(byte i) {
		return aBool2272;
	}

	public Class634 method3919(int i, int i_2_) {
		return aClass634Array2270[i];
	}

	void method3920(int i) {
		anInt2278 = i * 1740157001;
	}

	long method3921() {
		return aLong2269 * -5029257101765991383L;
	}

	public Class18 method3922(byte i) {
		return aClass18_2267;
	}

	public String method3923() {
		return aString2273;
	}

	public int method3924() {
		return anInt2276 * -217203455;
	}

	public int method3925() {
		return anInt2276 * -217203455;
	}

	void method3926(int i) {
		anInt2276 = -1518648575 * i;
	}

	public int method3927() {
		return anInt2278 * 667566585;
	}

	public void method3928(Interface28 interface28, int i) {
		if (null == aClass18_2267)
			aClass18_2267 = new Class18(interface28.method159(-2104403724));
		else
			aClass18_2267.method19((byte) 7);
	}

	public int method3929() {
		return anInt2278 * 667566585;
	}

	void method3930(int i) {
		anInt2278 = i * 1740157001;
	}

	public boolean method3931() {
		return aBool2275;
	}

	public boolean method3932() {
		return aBool2275;
	}

	public void method3933(Interface28 interface28) {
		if (null == aClass18_2267)
			aClass18_2267 = new Class18(interface28.method159(-1867856170));
		else
			aClass18_2267.method19((byte) 7);
	}

	void method3934(boolean bool) {
		aBool2275 = bool;
	}

	void method3935(boolean bool) {
		aBool2275 = bool;
	}

	public Class242 method3936() {
		return aClass242_2279;
	}

	void method3937(Class242 class242) {
		aClass242_2279 = class242;
	}

	void method3938(Class242 class242) {
		aClass242_2279 = class242;
	}

	void method3939(Class242 class242) {
		aClass242_2279 = class242;
	}

	void method3940(int i, byte i_3_) {
		anInt2276 = -1518648575 * i;
	}

	public int method3941() {
		return anInt2277 * 139289945;
	}

	long method3942(int i) {
		return aLong2269 * -5029257101765991383L;
	}

	public boolean method3943() {
		return aBool2272;
	}

	Class215(RSByteBuffer class527_sub38, boolean bool, boolean bool_4_, Interface28 interface28) {
		if (bool)
			aLong2269 = class527_sub38.method16612((byte) 1) * -622091538707564519L;
		else
			aLong2269 = 622091538707564519L;
		if (bool_4_)
			aString2273 = class527_sub38.method16456((byte) 107);
		int i = class527_sub38.readUnsignedByte();
		aBool2272 = 0 != (i & 0x1);
		aBool2275 = (i & 0x2) != 0;
		aClass634Array2270 = new Class634[interface28.method157(2058006602).method10095(2123211891)];
		int i_5_ = class527_sub38.readUnsignedByte();
		if (i_5_ > aClass634Array2270.length)
			throw new IllegalStateException("");
		for (int i_6_ = 0; i_6_ < aClass634Array2270.length; i_6_++) {
			Class634 class634 = (aClass634Array2270[i_6_] = new Class634(interface28.method157(1697074766).method10096(i_6_, (byte) -42), true));
			if (i_6_ < i_5_)
				class634.method10521(class527_sub38.readInt(), -406937952);
			else
				class634.method10521(0, -746962142);
			class634.method10531(class634.method10522((byte) -88), 865032979);
		}
		int i_7_ = class527_sub38.readUnsignedShort();
		aClass18_2271 = new Class18(interface28.method159(-1743184338));
		for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
			Class425 class425 = interface28.method159(-1862381713).method14483(class527_sub38, 937388644);
			aClass18_2271.method18(class425.anInt4803 * 494563151, class425.anObject4804, 373099583);
		}
		anInt2278 = class527_sub38.readUnsignedShort() * 1740157001;
		if (65535 == 667566585 * anInt2278)
			anInt2278 = -1740157001;
		anInt2276 = class527_sub38.readUnsignedByte() * -1518648575;
		aClass242_2279 = ((Class242) Class26.method858(Class242.method4506(1722570638), class527_sub38.readUnsignedByte(), 66067930));
		anInt2277 = class527_sub38.readUnsignedByte() * 1771213545;
	}

	long method3944() {
		return aLong2269 * -5029257101765991383L;
	}

	long method3945() {
		return aLong2269 * -5029257101765991383L;
	}

	void method3946(int i) {
		anInt2277 = 1771213545 * i;
	}

	public int method3947(int i) {
		return anInt2277 * 139289945;
	}

	public boolean method3948() {
		return aBool2272;
	}

	public Class634 method3949(int i) {
		return aClass634Array2270[i];
	}

	public Class634 method3950(int i) {
		return aClass634Array2270[i];
	}

	void method3951(Class215 class215_9_) {
		for (int i = 0; i < aClass634Array2270.length; i++) {
			aClass634Array2270[i].method10521(class215_9_.aClass634Array2270[i].method10526(894393877), 398643554);
			aClass634Array2270[i].method10531(aClass634Array2270[i].method10522((byte) -49), 1921891071);
		}
		aClass18_2271.method19((byte) 7);
		Iterator iterator = class215_9_.aClass18_2271.iterator();
		while (iterator.hasNext()) {
			Class425 class425 = (Class425) iterator.next();
			aClass18_2271.method18(494563151 * class425.anInt4803, class425.anObject4804, -211521437);
		}
		aBool2272 = class215_9_.aBool2272;
	}

	void method3952(Class215 class215_10_) {
		for (int i = 0; i < aClass634Array2270.length; i++) {
			aClass634Array2270[i].method10521(class215_10_.aClass634Array2270[i].method10526(697384511), 1100991868);
			aClass634Array2270[i].method10531(aClass634Array2270[i].method10522((byte) 66), 1496379060);
		}
		aClass18_2271.method19((byte) 7);
		Iterator iterator = class215_10_.aClass18_2271.iterator();
		while (iterator.hasNext()) {
			Class425 class425 = (Class425) iterator.next();
			aClass18_2271.method18(494563151 * class425.anInt4803, class425.anObject4804, 816541104);
		}
		aBool2272 = class215_10_.aBool2272;
	}

	void method3953(Class215 class215_11_, int i) {
		for (int i_12_ = 0; i_12_ < aClass634Array2270.length; i_12_++) {
			aClass634Array2270[i_12_].method10521(class215_11_.aClass634Array2270[i_12_].method10526(1333970113), -1626343424);
			aClass634Array2270[i_12_].method10531(aClass634Array2270[i_12_].method10522((byte) 25), 1437383128);
		}
		aClass18_2271.method19((byte) 7);
		Iterator iterator = class215_11_.aClass18_2271.iterator();
		while (iterator.hasNext()) {
			Class425 class425 = (Class425) iterator.next();
			aClass18_2271.method18(494563151 * class425.anInt4803, class425.anObject4804, 1437859669);
		}
		aBool2272 = class215_11_.aBool2272;
	}

	public void method3954(Interface28 interface28) {
		if (null == aClass18_2267)
			aClass18_2267 = new Class18(interface28.method159(-1816315394));
		else
			aClass18_2267.method19((byte) 7);
	}

	public void method3955(Interface28 interface28) {
		if (null == aClass18_2267)
			aClass18_2267 = new Class18(interface28.method159(-2041698291));
		else
			aClass18_2267.method19((byte) 7);
	}

	public Class634 method3956(int i) {
		return aClass634Array2270[i];
	}

	public int method3957() {
		return anInt2278 * 667566585;
	}

	public Class18 method3958() {
		return aClass18_2267;
	}

	public Class18 method3959() {
		return aClass18_2267;
	}

	static String method3960(String string, byte i) {
		String string_13_ = null;
		int i_14_ = string.indexOf("--> ");
		if (i_14_ >= 0) {
			string_13_ = string.substring(0, 4 + i_14_);
			string = string.substring(4 + i_14_);
		}
		int i_15_ = -1;
		if (string.startsWith("directlogin "))
			i_15_ = string.indexOf(" ", "directlogin ".length());
		if (i_15_ >= 0) {
			int i_16_ = string.length();
			string = new StringBuilder().append(string.substring(0, i_15_)).append(" ").toString();
			for (int i_17_ = i_15_ + 1; i_17_ < i_16_; i_17_++)
				string = new StringBuilder().append(string).append("*").toString();
		}
		if (null != string_13_)
			return new StringBuilder().append(string_13_).append(string).toString();
		return string;
	}

	public static Class698 method3961(int i) {
		if (Class63.aClass698_738 == null)
			return Class698.aClass698_8767;
		return Class63.aClass698_738;
	}

	public static boolean method3962(byte[] is, int i) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(is);
		int i_18_ = class527_sub38.readUnsignedByte();
		if (2 != i_18_)
			return false;
		boolean bool = class527_sub38.readUnsignedByte() == 1;
		if (bool)
			Class171_Sub2.method15337(class527_sub38, -35728309);
		Class555.method9408(class527_sub38, (byte) 1);
		return true;
	}

	static final void method3963(Class665 class665, int i) {
		int i_19_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_19_, 2082510922)).anInt123) * 64063519;
	}

	static final void method3964(Class665 class665, int i) {
		if (Class681.aClass554_8644.method9199(82, 1994074186))
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}

	static final void method3965(Class665 class665, int i) {
		class665.anInt8526 -= 307142523;
		int i_20_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_21_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		int i_22_ = class665.anIntArray8525[2 + 1769813785 * class665.anInt8526];
		Integer integer = (Integer) client.aClass223_11241.method4154(i_20_, 97344961).method4119(i_21_, i_22_, 1334553553);
		if (integer == null)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = integer.intValue();
	}
}
