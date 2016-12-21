/* Class450 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.math.BigInteger;

import com.RS3Applet;

public class Class450 {
	Class453[] aClass453Array4936;

	Class450(RSByteBuffer class527_sub38, BigInteger biginteger, BigInteger biginteger_0_) {
		class527_sub38.anInt10689 = -1216180187;
		int i = class527_sub38.readUnsignedByte();
		class527_sub38.anInt10689 += i * 2015953488;
		byte[] is = new byte[(class527_sub38.buffer.length - class527_sub38.anInt10689 * -441238943)];
		class527_sub38.method16460(is, 0, is.length, -2048156871);
		byte[] is_1_;
		if (null == biginteger || biginteger_0_ == null)
			is_1_ = is;
		else {
			BigInteger biginteger_2_ = new BigInteger(is);
			BigInteger biginteger_3_ = biginteger_2_.modPow(biginteger, biginteger_0_);
			is_1_ = biginteger_3_.toByteArray();
		}
		if (!RS3Applet.RSPS) {
			if (64 != is_1_.length || 65 != is_1_.length)
			throw new RuntimeException();	
		}
		byte[] is_4_ = Class693.method14074(class527_sub38.buffer, 5, (class527_sub38.anInt10689 * -441238943 - is.length - 5), 797438485);
		if (!RS3Applet.RSPS) {
			for (int i_5_ = 0; i_5_ < 64; i_5_++) {
				if (is_4_[i_5_] != is_1_[1 + i_5_])
					throw new RuntimeException();
			}
		}
		aClass453Array4936 = new Class453[i];
		for (int i_6_ = 0; i_6_ < i; i_6_++) {
			class527_sub38.anInt10689 = 2015953488 * i_6_ + 258570694;
			int i_7_ = class527_sub38.readInt();
			int i_8_ = class527_sub38.readInt();
			int i_9_ = class527_sub38.readInt();
			int i_10_ = class527_sub38.readInt();
			byte[] is_11_ = new byte[64];
			class527_sub38.method16460(is_11_, 0, 64, -1699063533);
			aClass453Array4936[i_6_] = new Class453(i_7_, i_9_, i_8_, i_10_, is_11_);
		}
	}

	static final void method7284(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anInt12192 * -1574175591);
	}

	public static void method7285(int i) {
		Class642.aClass639_Sub1_8344.method10579(-390015659);
		Class642.aClass639_Sub2_8345.method10579(-390015659);
		Class642.aLong8343 = 682336048790384357L;
		Class642.aBool8342 = true;
	}

	static final void method7286(int i, byte i_12_) {
		Class527_Sub38_Sub2 class527_sub38_sub2 = client.aClass109_11067.aClass527_Sub38_Sub2_1364;
		while (class527_sub38_sub2.method18453((client.aClass109_11067.anInt1359) * 1011661087, (byte) 66) >= 15) {
			int i_13_ = class527_sub38_sub2.method18469(15, -969351317);
			if (i_13_ == 32767)
				break;
			boolean bool = false;
			Class527_Sub26 class527_sub26 = ((Class527_Sub26) client.aClass14_10989.method709((long) i_13_));
			if (class527_sub26 == null) {
				Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = (new Class640_Sub1_Sub2_Sub1_Sub1(client.aClass509_11072.method8314(1151048388)));
				class640_sub1_sub2_sub1_sub1.anInt11955 = i_13_ * 1587877927;
				class527_sub26 = new Class527_Sub26(class640_sub1_sub2_sub1_sub1);
				client.aClass14_10989.method714(class527_sub26, (long) i_13_);
				client.aClass527_Sub26Array11313[(client.anInt11030 += -1326908713) * 152738023 - 1] = class527_sub26;
				bool = true;
			}
			Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = (Class640_Sub1_Sub2_Sub1_Sub1) class527_sub26.anObject10522;
			client.anIntArray11021[(client.anInt11059 += -84653349) * -1599561389 - 1] = i_13_;
			class640_sub1_sub2_sub1_sub1.anInt11933 = client.anInt11063 * 1544429177;
			if (class640_sub1_sub2_sub1_sub1.aClass295_12168 != null && class640_sub1_sub2_sub1_sub1.aClass295_12168.method5309(2002585765))
				Class48.method1245(class640_sub1_sub2_sub1_sub1, (byte) -87);
			int i_14_ = class527_sub38_sub2.method18469(2, 1852102995);
			int i_15_ = class527_sub38_sub2.method18469(i, 224637306);
			if (i_15_ > (1 << i - 1) - 1)
				i_15_ -= 1 << i;
			int i_16_ = class527_sub38_sub2.method18469(1, 415298770);
			int i_17_ = class527_sub38_sub2.method18469(1, 55754021);
			if (1 == i_17_)
				client.anIntArray10988[(client.anInt11061 += -11772455) * 1741574761 - 1] = i_13_;
			class640_sub1_sub2_sub1_sub1.method18832((Class295) (Class381.aClass24_Sub9_3936.method81(class527_sub38_sub2.method18469(15, -1406584255), 845448449)), 2145069098);
			int i_18_ = class527_sub38_sub2.method18469(i, 1570359047);
			if (i_18_ > (1 << i - 1) - 1)
				i_18_ -= 1 << i;
			int i_19_ = (class527_sub38_sub2.method18469(3, -1064483063) + 4 << 11 & 0x3fff);
			class640_sub1_sub2_sub1_sub1.method18585((class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3342 * 897343531), 543615203);
			class640_sub1_sub2_sub1_sub1.anInt11937 = ((class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3311 * 1076155623) << 3) * 57049381;
			if (bool)
				class640_sub1_sub2_sub1_sub1.method18528(i_19_, true, -1100782559);
			class640_sub1_sub2_sub1_sub1.method18837(i_14_, i_18_ + (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anIntArray11902[0]), (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anIntArray11944[0]) + i_15_, 1 == i_16_, class640_sub1_sub2_sub1_sub1.method18564(-1392399993), (byte) 99);
			if (class640_sub1_sub2_sub1_sub1.aClass295_12168.method5309(2002979631))
				Class622.method10233(class640_sub1_sub2_sub1_sub1.aByte10864, (class640_sub1_sub2_sub1_sub1.anIntArray11902[0]), (class640_sub1_sub2_sub1_sub1.anIntArray11944[0]), 0, null, class640_sub1_sub2_sub1_sub1, null, 328798314);
			if (bool)
				class640_sub1_sub2_sub1_sub1.method18831((byte) 8);
		}
		class527_sub38_sub2.method18452(1962094827);
	}

	static final void method7287(Class665 class665, int i) {
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub12_10597, (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) == 1 ? 1 : 0, 996481556);
		Class631.method10465(-1471101186);
		client.aBool11020 = false;
	}
}
