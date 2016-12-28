/* Class711 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class711 {
	int anInt8844;
	int anInt8845;
	boolean aBool8846;
	boolean aBool8847;
	boolean aBool8848;
	public static JS5ResourceProvider aClass461_8849;

	public boolean method8362() {
		return aBool8848;
	}

	public int method8363(int i) {
		return 1288610677 * anInt8844;
	}

	public boolean method8364() {
		return aBool8846;
	}

	public boolean method8365(int i) {
		return aBool8848;
	}

	public boolean method8366(byte i) {
		return aBool8847;
	}

	public boolean method8367(byte i) {
		return aBool8846;
	}

	public int method8368() {
		return 1288610677 * anInt8844;
	}

	public boolean method8369() {
		return aBool8847;
	}

	public boolean method8370() {
		return aBool8848;
	}

	public boolean method8371() {
		return aBool8847;
	}

	Class711(int i, int i_0_, boolean bool, boolean bool_1_, boolean bool_2_) {
		anInt8844 = 1094767837 * i;
		anInt8845 = 566054077 * i_0_;
		aBool8848 = bool;
		aBool8847 = bool_1_;
		aBool8846 = bool_2_;
	}

	public int method8372(int i) {
		return 1193283221 * anInt8845;
	}

	public boolean method8373() {
		return aBool8846;
	}

	public int method8374() {
		return 1193283221 * anInt8845;
	}

	public static final void method8375(short i) {
		if (!client.aBool11109) {
			client.aFloat11269 += (12.0F - client.aFloat11269) / 2.0F;
			client.aBool11242 = true;
			client.aBool11109 = true;
		}
	}

	static final void method8376(long l) {
		Class436 class436 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823);
		int i = 938724179 * client.anInt10983 + (int) class436.aFloat4850;
		int i_3_ = (int) class436.aFloat4853 + client.anInt11091 * 1846249523;
		if (-787333673 * JS5ResourceProvider.anInt5216 - i < -2000 || -787333673 * JS5ResourceProvider.anInt5216 - i > 2000 || -1817694149 * Class222.anInt2326 - i_3_ < -2000 || -1817694149 * Class222.anInt2326 - i_3_ > 2000) {
			JS5ResourceProvider.anInt5216 = i * 1085474279;
			Class222.anInt2326 = i_3_ * 727918835;
		}
		if (i != -787333673 * JS5ResourceProvider.anInt5216) {
			int i_4_ = i - -787333673 * JS5ResourceProvider.anInt5216;
			int i_5_ = (int) ((long) i_4_ * l / 320L);
			if (i_4_ > 0) {
				if (i_5_ == 0)
					i_5_ = 1;
				else if (i_5_ > i_4_)
					i_5_ = i_4_;
			} else if (i_5_ == 0)
				i_5_ = -1;
			else if (i_5_ < i_4_)
				i_5_ = i_4_;
			JS5ResourceProvider.anInt5216 += i_5_ * 1085474279;
		}
		if (i_3_ != -1817694149 * Class222.anInt2326) {
			int i_6_ = i_3_ - Class222.anInt2326 * -1817694149;
			int i_7_ = (int) ((long) i_6_ * l / 320L);
			if (i_6_ > 0) {
				if (i_7_ == 0)
					i_7_ = 1;
				else if (i_7_ > i_6_)
					i_7_ = i_6_;
			} else if (i_7_ == 0)
				i_7_ = -1;
			else if (i_7_ < i_6_)
				i_7_ = i_6_;
			Class222.anInt2326 += i_7_ * 727918835;
		}
		client.aFloat11106 += client.aFloat11107 * (float) l / 6.0F;
		client.aFloat11271 += (float) l * client.aFloat11269 / 6.0F;
		Class18.method687((byte) 19);
	}

	public static void method8377(int i, boolean bool, int i_8_, boolean bool_9_, byte i_10_) {
		Class344.method4484(0, Class23.aClass603_Sub1Array226.length - 1, i, bool, i_8_, bool_9_, 454276885);
		Class23.anInt218 = 0;
		Class23.aClass654_223 = null;
	}
}
