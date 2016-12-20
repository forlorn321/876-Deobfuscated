/* Class290 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class290 {
	static final String aString3224 = " - ";
	static Interface31[] anInterface31Array3225;
	static int anInt3226 = 331436087;
	static Class90 aClass90_3227;
	static Class459 aClass459_3228;
	public static Class300 aClass300_3229;
	static Class310[] aClass310Array3230;
	static long aLong3231;
	static boolean aBool3232 = false;
	static int anInt3233 = 302015967;

	public static void method5230(boolean bool) {
		if (null == aClass300_3229)
			Class97.method1749(102380841);
		if (bool)
			aClass300_3229.method5526((byte) 0);
	}

	public static void method5231() {
		aBool3232 = true;
		Class329.aString3606 = Class32.aString289;
		Class200.aString2201 = Class32.aString306;
		Class149.method2493(false, (byte) -91);
		Class295.method5339((short) -7565);
		aClass310Array3230 = null;
		Class309.aClass440_3464 = null;
		Class78.method1560(18, (byte) 0);
	}

	static void method5232() {
		Class19 class19 = Class32.method944("2", client.aClass678_11259.aString8616, false, (byte) 97);
		Class598.aClass144_Sub1_7852.method14500(class19, -1515198831);
	}

	public static boolean method5233() {
		return aBool3232;
	}

	static void method5234(byte[] is) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(is);
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			if (1 == i) {
				int i_0_ = class527_sub38.readUnsignedShort();
				Class245.aClass226_2698.method4221(i_0_, -453736411);
			}
		}
	}

	static void method5235() {
		if (null != Class593.aClass310_7804) {
			aClass300_3229 = new Class300();
			aClass300_3229.method5551(aLong3231 * 5626840548048503187L, Class593.aClass310_7804.aClass53_3484.method1290(Class144_Sub1.aClass671_8995, (byte) -86), Class593.aClass310_7804.aClass53_3484.method1290(Class144_Sub1.aClass671_8995, (byte) -11), -138373539 * Class593.aClass310_7804.anInt3487, Class593.aClass310_7804, 1398655286);
			Class595.aThread7818 = new Thread(aClass300_3229, "");
			Class595.aThread7818.start();
		}
	}

	static void method5236() {
		if (null != Class593.aClass310_7804) {
			aClass300_3229 = new Class300();
			aClass300_3229.method5551(aLong3231 * 5626840548048503187L, Class593.aClass310_7804.aClass53_3484.method1290(Class144_Sub1.aClass671_8995, (byte) -81), Class593.aClass310_7804.aClass53_3484.method1290(Class144_Sub1.aClass671_8995, (byte) -119), -138373539 * Class593.aClass310_7804.anInt3487, Class593.aClass310_7804, 1288429056);
			Class595.aThread7818 = new Thread(aClass300_3229, "");
			Class595.aThread7818.start();
		}
	}

	public static int method5237() {
		return aClass300_3229.method5555(-611887994);
	}

	public static void method5238(boolean bool) {
		if (null == aClass300_3229)
			Class97.method1749(102380841);
		if (bool)
			aClass300_3229.method5526((byte) 0);
	}

	Class290() throws Throwable {
		throw new Error();
	}

	public static int method5239() {
		return aClass300_3229.method5555(-1955920619);
	}

	public static void method5240() {
		aBool3232 = true;
		Class329.aString3606 = Class32.aString289;
		Class200.aString2201 = Class32.aString306;
		Class149.method2493(false, (byte) -42);
		Class295.method5339((short) -1969);
		aClass310Array3230 = null;
		Class309.aClass440_3464 = null;
		Class78.method1560(18, (byte) 0);
	}

	public static void method5241() {
		if (null != anInterface31Array3225) {
			Interface31[] interface31s = anInterface31Array3225;
			for (int i = 0; i < interface31s.length; i++) {
				Interface31 interface31 = interface31s[i];
				interface31.method182(-1468892838);
			}
		}
	}

	static void method5242() {
		if (null != Class593.aClass310_7804) {
			aClass300_3229 = new Class300();
			aClass300_3229.method5551(aLong3231 * 5626840548048503187L, Class593.aClass310_7804.aClass53_3484.method1290(Class144_Sub1.aClass671_8995, (byte) -124), Class593.aClass310_7804.aClass53_3484.method1290(Class144_Sub1.aClass671_8995, (byte) -113), -138373539 * Class593.aClass310_7804.anInt3487, Class593.aClass310_7804, 1273882937);
			Class595.aThread7818 = new Thread(aClass300_3229, "");
			Class595.aThread7818.start();
		}
	}

	static int method5243() {
		int i = Class593.aClass310_7804.anInt3485 * -1481142029;
		if (i < aClass310Array3230.length - 1)
			Class593.aClass310_7804 = aClass310Array3230[i + 1];
		return 100;
	}

	static void method5244(byte[] is) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(is);
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			if (1 == i)
				Class623.anInt8138 = class527_sub38.readUnsignedShort() * -654439817;
			else if (10 == i)
				class527_sub38.readUnsignedShort();
		}
	}

	static void method5245(byte[] is) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(is);
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			if (1 == i) {
				int i_1_ = class527_sub38.readUnsignedShort();
				Class245.aClass226_2698.method4221(i_1_, -339551111);
			}
		}
	}

	static void method5246(byte[] is) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(is);
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			if (1 == i) {
				int i_2_ = class527_sub38.readUnsignedShort();
				Class245.aClass226_2698.method4221(i_2_, 1854156670);
			}
		}
	}

	public static void method5247(boolean bool) {
		if (null == aClass300_3229)
			Class97.method1749(102380841);
		if (bool)
			aClass300_3229.method5526((byte) 0);
	}

	public static void method5248() {
		if (null != anInterface31Array3225) {
			Interface31[] interface31s = anInterface31Array3225;
			for (int i = 0; i < interface31s.length; i++) {
				Interface31 interface31 = interface31s[i];
				interface31.method182(198676033);
			}
		}
	}

	public static void method5249() {
		if (null != aClass300_3229)
			aClass300_3229.method5536(-537094523);
		if (null != Class595.aThread7818) {
			for (;;) {
				try {
					Class595.aThread7818.join();
					break;
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
	}

	static void method5250(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class482.method7842(-1850741129);
	}

	static final void method5251(Class665 class665, byte i) {
		int i_3_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_3_, -1257298575);
		Class240 class240 = Class183.aClass240Array2100[i_3_ >> 16];
		Class621.method10230(class243, class240, class665, (byte) 96);
	}

	static final void method5252(Class243 class243, Class240 class240, Class665 class665, int i) {
		class243.anInt2541 = 363357291;
		class243.anInt2542 = client.anInt11070 * 961629445;
		class243.anInt2543 = 0;
		if (-1 == -927924265 * class243.anInt2675 && !class240.aBool2394)
			Class207.method3844(class243.anInt2504 * -254728301, -2108828213);
	}

	public static int method5253(CharSequence charsequence, CharSequence charsequence_4_, int i) {
		int i_5_ = charsequence.length();
		int i_6_ = charsequence_4_.length();
		if (0 == i_5_)
			return i_6_;
		if (i_6_ == 0)
			return i_5_;
		int[] is = new int[i_5_ + 1];
		int[] is_7_ = new int[i_5_ + 1];
		for (int i_8_ = 0; i_8_ <= i_5_; i_8_++)
			is[i_8_] = i_8_;
		for (int i_9_ = 1; i_9_ <= i_6_; i_9_++) {
			is_7_[0] = i_9_;
			char c = charsequence_4_.charAt(i_9_ - 1);
			for (int i_10_ = 1; i_10_ <= i_5_; i_10_++)
				is_7_[i_10_] = Math.min(Math.min(1 + is_7_[i_10_ - 1], is[i_10_] + 1), (is[i_10_ - 1] + (charsequence.charAt(i_10_ - 1) == c ? 0 : 1)));
			int[] is_11_ = is;
			is = is_7_;
			is_7_ = is_11_;
		}
		return is[i_5_];
	}

	static final void method5254(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	static final void method5255(Class665 class665, byte i) {
		if ((0 != client.anInt11048 * -1927019389 && 9 != client.anInt11048 * -1927019389) || Class266.method5045((byte) 1))
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1;
		else if (Class3.aBool38)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
		else if (7019108318973771579L * Class273.aLong3141 > Class234.method4347(-1408626088) - 1000L)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1;
		else {
			Class3.aBool38 = true;
			Class109 class109 = Class203.method3782((byte) -1);
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4492, class109.aClass2_1367, (byte) -51);
			class527_sub15.buffer.writeInt(933988233 * Class605.anInt7970, 378435480);
			class109.method1969(class527_sub15, (byte) 1);
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
		}
	}

	static void method5256(int i, int i_12_, int i_13_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(1, (long) i);
		class527_sub8_sub9.method18187(-1481804142);
		class527_sub8_sub9.anInt11676 = i_12_ * -281159195;
	}
}
