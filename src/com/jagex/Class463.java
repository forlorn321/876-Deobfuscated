/* Class463 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class463 {
	static final int anInt5286 = 0;
	Class459 aClass459_5287;
	Class205 aClass205_5288 = new Class205(64);
	Class459 aClass459_5289;
	static final int anInt5290 = 32768;

	public Class527_Sub8_Sub18 method7619(int i) {
		Class527_Sub8_Sub18 class527_sub8_sub18 = (Class527_Sub8_Sub18) aClass205_5288.method3787((long) i);
		if (class527_sub8_sub18 != null)
			return class527_sub8_sub18;
		byte[] is;
		if (i >= 32768)
			is = aClass459_5287.method7470(0, i & 0x7fff, (byte) -95);
		else
			is = aClass459_5289.method7470(0, i, (byte) -19);
		class527_sub8_sub18 = new Class527_Sub8_Sub18();
		if (is != null)
			class527_sub8_sub18.method18479(new RSByteBuffer(is), 886290664);
		if (i >= 32768)
			class527_sub8_sub18.method18484(1575059696);
		aClass205_5288.method3790(class527_sub8_sub18, (long) i);
		return class527_sub8_sub18;
	}

	public Class463(Class671 class671, Class459 class459, Class459 class459_0_) {
		aClass459_5289 = class459;
		aClass459_5287 = class459_0_;
		if (null != aClass459_5289)
			aClass459_5289.method7504(0, -1867009523);
		if (null != aClass459_5287)
			aClass459_5287.method7504(0, -461478835);
	}

	public Class527_Sub8_Sub18 method7620(int i) {
		Class527_Sub8_Sub18 class527_sub8_sub18 = (Class527_Sub8_Sub18) aClass205_5288.method3787((long) i);
		if (class527_sub8_sub18 != null)
			return class527_sub8_sub18;
		byte[] is;
		if (i >= 32768)
			is = aClass459_5287.method7470(0, i & 0x7fff, (byte) -21);
		else
			is = aClass459_5289.method7470(0, i, (byte) -48);
		class527_sub8_sub18 = new Class527_Sub8_Sub18();
		if (is != null)
			class527_sub8_sub18.method18479(new RSByteBuffer(is), 886290664);
		if (i >= 32768)
			class527_sub8_sub18.method18484(-486902247);
		aClass205_5288.method3790(class527_sub8_sub18, (long) i);
		return class527_sub8_sub18;
	}

	public Class527_Sub8_Sub18 method7621(int i, int i_1_) {
		Class527_Sub8_Sub18 class527_sub8_sub18 = (Class527_Sub8_Sub18) aClass205_5288.method3787((long) i);
		if (class527_sub8_sub18 != null)
			return class527_sub8_sub18;
		byte[] is;
		if (i >= 32768)
			is = aClass459_5287.method7470(0, i & 0x7fff, (byte) -82);
		else
			is = aClass459_5289.method7470(0, i, (byte) -10);
		class527_sub8_sub18 = new Class527_Sub8_Sub18();
		if (is != null)
			class527_sub8_sub18.method18479(new RSByteBuffer(is), 886290664);
		if (i >= 32768)
			class527_sub8_sub18.method18484(75327732);
		aClass205_5288.method3790(class527_sub8_sub18, (long) i);
		return class527_sub8_sub18;
	}

	public Class527_Sub8_Sub18 method7622(int i) {
		Class527_Sub8_Sub18 class527_sub8_sub18 = (Class527_Sub8_Sub18) aClass205_5288.method3787((long) i);
		if (class527_sub8_sub18 != null)
			return class527_sub8_sub18;
		byte[] is;
		if (i >= 32768)
			is = aClass459_5287.method7470(0, i & 0x7fff, (byte) -110);
		else
			is = aClass459_5289.method7470(0, i, (byte) -77);
		class527_sub8_sub18 = new Class527_Sub8_Sub18();
		if (is != null)
			class527_sub8_sub18.method18479(new RSByteBuffer(is), 886290664);
		if (i >= 32768)
			class527_sub8_sub18.method18484(-415500275);
		aClass205_5288.method3790(class527_sub8_sub18, (long) i);
		return class527_sub8_sub18;
	}

	static void method7623(Class665 class665, int i) {
		class665.anIntArray8525[class665.anInt8526 * 1769813785 - 1] = (((Class259) Class590.aClass62_Sub1_7793.method81((class665.anIntArray8525[(class665.anInt8526 * 1769813785) - 1]), -442016441)).anInt2833 * -1278903187);
	}

	static final void method7624(Class665 class665, byte i) {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (2 == -405609043 * client.anInt11083 && i_2_ < client.anInt11261 * -67152419) {
			Class69 class69 = client.aClass69Array11297[i_2_];
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class69.aString776;
			if (class69.aString779 != null)
				class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class69.aString779;
			else
				class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
		} else {
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
		}
	}

	static final void method7625(Class665 class665, int i) {
		int i_3_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (!Class402.aClass180_4150.method3374())
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 3;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = Class204.aClass527_Sub31_2213.aClass700_Sub42_10592.method14289(i_3_, 2011563020);
	}

	static final void method7626(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (Class204.aClass527_Sub31_2213.aClass700_Sub42_10592.method17319((byte) 1) && Class402.aClass180_4150.method3374()) ? 1 : 0;
	}

	static final void method7627(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class588.method9812(class243, class240, class665, (byte) 85);
	}
}
