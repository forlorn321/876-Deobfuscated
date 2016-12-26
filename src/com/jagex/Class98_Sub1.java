/* Class98_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public abstract class Class98_Sub1 extends Class98 implements Interface54 {
	protected Class458 aClass458_8868;

	public Object method358(int i) {
		Class153 class153 = (Class153) method70(i, (byte) -15);
		if (null == class153 || !class153.method1857((byte) 95))
			return null;
		return class153.method1855((byte) -30);
	}

	Class98_Sub1(Class670 class670, Class458 class458, Class664 class664, int i) {
		super(class670, class664, i);
		aClass458_8868 = class458;
	}

	public int method73() {
		return anInt1180 * 1628850519;
	}

	public Object method357(int i, int i_0_) {
		Class153 class153 = (Class153) method70(i, (byte) -42);
		if (null == class153 || !class153.method1857((byte) 57))
			return null;
		return class153.method1855((byte) -97);
	}

	public int method8387(Class430 class430, int i) {
		int i_1_ = 2;
		if (class430.anObject4819 instanceof Integer)
			i_1_ += 4;
		else if (class430.anObject4819 instanceof Long)
			i_1_ += 8;
		else if (class430.anObject4819 instanceof String)
			i_1_ += Class612.method7315((String) class430.anObject4819, -1311964413);
		else if (class430.anObject4819 instanceof Interface8)
			i_1_ += ((Interface8) class430.anObject4819).method48(-963399078);
		else
			throw new IllegalStateException();
		return i_1_;
	}

	public int method71(int i) {
		return anInt1180 * 1628850519;
	}

	public Class430 method8388(RSByteBuffer buffer, int i) {
		int i_2_ = buffer.readUnsignedShort();
		Class153 class153 = (Class153) method70(i_2_, (byte) -18);
		if (!class153.method1857((byte) 40))
			throw new IllegalStateException("");
		Class430 class430 = new Class430(i_2_);
		Class var_class = class153.aClass453_1716.method5437(65280).aClass5390;
		if (var_class == java.lang.Integer.class)
			class430.anObject4819 = Integer.valueOf(buffer.readInt());
		else if (var_class == java.lang.Long.class)
			class430.anObject4819 = Long.valueOf(buffer.readLong(702869087));
		else if (java.lang.String.class == var_class)
			class430.anObject4819 = buffer.readVersionedString((byte) 106);
		else if (com.jagex.Interface8.class.isAssignableFrom(var_class)) {
			try {
				Interface8 interface8 = (Interface8) var_class.newInstance();
				interface8.method61(buffer, 372399233);
				class430.anObject4819 = interface8;
			} catch (InstantiationException instantiationexception) {
				/* empty */
			} catch (IllegalAccessException illegalaccessexception) {
				/* empty */
			}
		} else
			throw new IllegalStateException();
		if (class430.anObject4819 != null)
			System.out.println("Item metadata: " + i_2_ + ", " + class430.anObject4819.toString());
		return class430;
	}

	public abstract Interface13 method70(int i, byte i_3_);

	public abstract Interface13 method72(int i);

	public int method12() {
		return anInt1180 * 1628850519;
	}

	public Object method359(int i) {
		Class153 class153 = (Class153) method70(i, (byte) 60);
		if (null == class153 || !class153.method1857((byte) 1))
			return null;
		return class153.method1855((byte) -121);
	}

	public void method8389(RSByteBuffer class536_sub33, Class430 class430, int i) {
		class536_sub33.writeShort(706703961 * class430.anInt4820, -1778059594);
		if (class430.anObject4819 instanceof Integer)
			class536_sub33.writeInt(((Integer) class430.anObject4819).intValue());
		else if (class430.anObject4819 instanceof Long)
			class536_sub33.writeLong(((Long) class430.anObject4819).longValue());
		else if (class430.anObject4819 instanceof String)
			class536_sub33.method9785((String) class430.anObject4819, (byte) 59);
		else if (class430.anObject4819 instanceof Interface8)
			((Interface8) class430.anObject4819).method60(class536_sub33, (byte) 101);
		else
			throw new IllegalStateException();
	}

	public Class430 method8390(RSByteBuffer class536_sub33, Class478 class478, int i) {
		int i_4_ = class536_sub33.readUnsignedShort();
		Class430 class430 = new Class430(i_4_);
		Class var_class = class478.aClass5390;
		if (java.lang.Integer.class == var_class)
			class430.anObject4819 = Integer.valueOf(class536_sub33.readInt());
		else if (java.lang.Long.class == var_class)
			class430.anObject4819 = Long.valueOf(class536_sub33.readLong(702869087));
		else if (java.lang.String.class == var_class)
			class430.anObject4819 = class536_sub33.readVersionedString((byte) 9);
		else if (com.jagex.Interface8.class.isAssignableFrom(var_class)) {
			try {
				Interface8 interface8 = (Interface8) var_class.newInstance();
				interface8.method61(class536_sub33, -1522704521);
				class430.anObject4819 = interface8;
			} catch (InstantiationException instantiationexception) {
				/* empty */
			} catch (IllegalAccessException illegalaccessexception) {
				/* empty */
			}
		} else
			throw new IllegalStateException();
		Class153 class153 = (Class153) method70(i_4_, (byte) 37);
		if (!class153.method1857((byte) 75) || class153.aClass453_1716.method5437(65280) != class478)
			return null;
		return class430;
	}

	static final void method8391(int i, byte i_5_) {
		client.anInt11247 = 0;
		client.anInt11055 = 0;
		client.anInt11124 += -851661825;
		Class205_Sub17.method9088(1440679574);
		Class262.method3642(i, 712927339);
		Class106.method1428(-161624943);
		boolean bool = false;
		for (int i_6_ = 0; i_6_ < client.anInt11247 * 537050591; i_6_++) {
			int i_7_ = client.anIntArray11059[i_6_];
			Class536_Sub13 class536_sub13 = (Class536_Sub13) client.aClass4_11050.method556((long) i_7_);
			Class649_Sub1_Sub5_Sub1_Sub1 class649_sub1_sub5_sub1_sub1 = (Class649_Sub1_Sub5_Sub1_Sub1) class536_sub13.anObject10468;
			if (1597199359 * client.anInt11124 != class649_sub1_sub5_sub1_sub1.anInt11934 * 1081522251) {
				if (Class70.aBool752 && Class709.method8343(i_7_, 36161))
					Class51.method930(-1398418648);
				if (class649_sub1_sub5_sub1_sub1.aClass296_12174.method3986(-198439992))
					Class18.method688(class649_sub1_sub5_sub1_sub1, -270177334);
				class649_sub1_sub5_sub1_sub1.method11065(null, 179188063);
				class536_sub13.method6484(1708251234);
				bool = true;
			}
		}
		if (bool) {
			int i_8_ = client.anInt11164 * -1683770117;
			client.anInt11164 = client.aClass4_11050.method569(2120619519) * -255707597;
			int i_9_ = 0;
			Iterator iterator = client.aClass4_11050.iterator();
			while (iterator.hasNext()) {
				Class536_Sub13 class536_sub13 = (Class536_Sub13) iterator.next();
				client.aClass536_Sub13Array11044[i_9_++] = class536_sub13;
			}
			for (int i_10_ = client.anInt11164 * -1683770117; i_10_ < i_8_; i_10_++)
				client.aClass536_Sub13Array11044[i_10_] = null;
			Class290 class290 = Class683.aClass301_Sub1_8651.method4054(-297153113);
			if (class290 == Class290.aClass290_3220) {
				Class333_Sub2 class333_sub2 = ((Class333_Sub2) Class683.aClass301_Sub1_8651.method4051(826143221));
				class333_sub2.method9168((byte) -54);
			}
			Class300 class300 = Class683.aClass301_Sub1_8651.method4062(307769163);
			if (Class300.aClass300_3360 == class300) {
				Class706_Sub2 class706_sub2 = ((Class706_Sub2) Class683.aClass301_Sub1_8651.method4052(-810172525));
				class706_sub2.method10258(1198904381);
			}
		}
		if ((client.aClass106_11322.byteBuffer.off * -810172525) != 610303591 * client.aClass106_11322.anInt1262)
			throw new RuntimeException(new StringBuilder().append(-810172525 * (client.aClass106_11322.byteBuffer.off)).append(" ").append(client.aClass106_11322.anInt1262 * 610303591).toString());
		for (int i_11_ = 0; i_11_ < -664631943 * client.anInt11053; i_11_++) {
			if (client.aClass4_11050.method556((long) client.anIntArray11211[i_11_]) == null)
				throw new RuntimeException(new StringBuilder().append(i_11_).append(" ").append(client.anInt11053 * -664631943).toString());
		}
		if (0 != (-1683770117 * client.anInt11164 - client.anInt11053 * -664631943))
			throw new RuntimeException(new StringBuilder().append("").append(client.anInt11164 * -1683770117 - -664631943 * client.anInt11053).toString());
		for (int i_12_ = 0; i_12_ < client.anInt11164 * -1683770117; i_12_++) {
			if (1081522251 * ((Class649_Sub1_Sub5_Sub1) (client.aClass536_Sub13Array11044[i_12_].anObject10468)).anInt11934 != 1597199359 * client.anInt11124)
				throw new RuntimeException(new StringBuilder().append("").append((((Class649_Sub1_Sub5_Sub1) (client.aClass536_Sub13Array11044[i_12_].anObject10468)).anInt11889) * 1710020215).toString());
		}
	}

	public static int method8392(int i, byte i_13_) {
		int i_14_ = 0;
		if (i < 0 || i >= 65536) {
			i >>>= 16;
			i_14_ += 16;
		}
		if (i >= 256) {
			i >>>= 8;
			i_14_ += 8;
		}
		if (i >= 16) {
			i >>>= 4;
			i_14_ += 4;
		}
		if (i >= 4) {
			i >>>= 2;
			i_14_ += 2;
		}
		if (i >= 1) {
			i >>>= 1;
			i_14_++;
		}
		return i_14_ + i;
	}

	static void method8393(int i) {
		Class105.aBool1248 = false;
		Class105.anIntArray1251 = null;
		Class388.anIntArray4046 = null;
		Class536_Sub22_Sub1.anIntArray11618 = null;
		Class16_Sub1.anIntArray10976 = null;
		Class552.method6692(-1355699726);
	}
}
