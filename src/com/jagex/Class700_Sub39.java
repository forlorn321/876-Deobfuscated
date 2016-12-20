/* Class700_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class700_Sub39 extends Class700 {
	public static final int anInt10943 = 0;
	public static final int anInt10944 = 3;
	public static final int anInt10945 = 1;
	public static final int anInt10946 = 4;
	public static final int anInt10947 = 2;

	public void method17288() {
		if (-420933067 * anInt8785 < 0 || -420933067 * anInt8785 > 4)
			anInt8785 = method14279((byte) 35) * -380424163;
	}

	public Class700_Sub39(int i, Class527_Sub31 class527_sub31) {
		super(i, class527_sub31);
	}

	public void method17289(int i) {
		if (-420933067 * anInt8785 < 0 || -420933067 * anInt8785 > 4)
			anInt8785 = method14279((byte) -16) * -380424163;
	}

	int method14288() {
		return 0;
	}

	int method14289(int i, int i_0_) {
		return 1;
	}

	void method14284(int i, int i_1_) {
		anInt8785 = i * -380424163;
	}

	public int method17290(int i) {
		return -420933067 * anInt8785;
	}

	int method14285(int i) {
		return 1;
	}

	int method14279(byte i) {
		return 0;
	}

	void method14287(int i) {
		anInt8785 = i * -380424163;
	}

	public Class700_Sub39(Class527_Sub31 class527_sub31) {
		super(class527_sub31);
	}

	int method14286(int i) {
		return 1;
	}

	void method14281(int i) {
		anInt8785 = i * -380424163;
	}

	public int method17291() {
		return -420933067 * anInt8785;
	}

	static boolean method17292(int i) {
		Class32.anInt286 = -2004669559;
		Class32.aClass109_270 = client.aClass109_11067;
		return Class40.method1166((Class32.aLong321 * -8573635942399706625L == -1L), true, "", "", Class32.aLong321 * -8573635942399706625L);
	}

	static long method17293(Interface62 interface62, int i, int i_2_, int i_3_) {
		long l = 4194304L;
		long l_4_ = -9223372036854775808L;
		Class602 class602 = ((Class602) client.aClass509_11072.method8310(-1639835615).method81(interface62.method64(-1620438184), -1453119618));
		long l_5_ = (long) (i | i_2_ << 7 | interface62.method77(-1993584139) << 14 | interface62.method396(893681415) << 20 | 0x40000000);
		if (class602.anInt7898 * -1508648055 == 0)
			l_5_ |= l_4_;
		if (1 == 1302526849 * class602.anInt7872)
			l_5_ |= l;
		l_5_ |= (long) interface62.method64(-1116546032) << 32;
		return l_5_;
	}
}
