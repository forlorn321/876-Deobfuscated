/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class51 {
	public int anInt514;
	Class459 aClass459_515;
	Class459 aClass459_516;
	public int anInt517 = 0;
	Class205 aClass205_518;
	static final int anInt519 = 32768;
	static final int anInt520 = 1;
	Interface72 anInterface72_521;
	public static Class24_Sub16 aClass24_Sub16_522;

	String method1276(Class618 class618, int[] is, long l) {
		if (anInterface72_521 != null) {
			String string = anInterface72_521.method480(class618, is, l);
			if (null != string)
				return string;
		}
		return Long.toString(l);
	}

	public Class527_Sub8_Sub17 method1277(int i, int i_0_) {
		Class527_Sub8_Sub17 class527_sub8_sub17 = (Class527_Sub8_Sub17) aClass205_518.method3787((long) i);
		if (class527_sub8_sub17 != null)
			return class527_sub8_sub17;
		byte[] is;
		if (i >= 32768)
			is = aClass459_515.method7470(1, i & 0x7fff, (byte) -74);
		else
			is = aClass459_516.method7470(1, i, (byte) -37);
		class527_sub8_sub17 = new Class527_Sub8_Sub17();
		class527_sub8_sub17.aClass51_11824 = this;
		if (is != null)
			class527_sub8_sub17.method18401(new RSByteBuffer(is), -657201454);
		if (i >= 32768)
			class527_sub8_sub17.method18408(1186280511);
		aClass205_518.method3790(class527_sub8_sub17, (long) i);
		return class527_sub8_sub17;
	}

	public Class51(Class671 class671, Class459 class459, Class459 class459_1_, Interface72 interface72) {
		anInt514 = 0;
		aClass205_518 = new Class205(64);
		anInterface72_521 = null;
		aClass459_516 = class459;
		aClass459_515 = class459_1_;
		anInterface72_521 = interface72;
		if (aClass459_516 != null)
			anInt517 = aClass459_516.method7504(1, 596836204) * 1944330209;
		if (aClass459_515 != null)
			anInt514 = aClass459_515.method7504(1, -1451640904) * 1182727637;
	}

	public Class527_Sub8_Sub17 method1278(int i) {
		Class527_Sub8_Sub17 class527_sub8_sub17 = (Class527_Sub8_Sub17) aClass205_518.method3787((long) i);
		if (class527_sub8_sub17 != null)
			return class527_sub8_sub17;
		byte[] is;
		if (i >= 32768)
			is = aClass459_515.method7470(1, i & 0x7fff, (byte) -103);
		else
			is = aClass459_516.method7470(1, i, (byte) -77);
		class527_sub8_sub17 = new Class527_Sub8_Sub17();
		class527_sub8_sub17.aClass51_11824 = this;
		if (is != null)
			class527_sub8_sub17.method18401(new RSByteBuffer(is), -1620012643);
		if (i >= 32768)
			class527_sub8_sub17.method18408(-2038363521);
		aClass205_518.method3790(class527_sub8_sub17, (long) i);
		return class527_sub8_sub17;
	}

	String method1279(Class618 class618, int[] is, long l) {
		if (anInterface72_521 != null) {
			String string = anInterface72_521.method480(class618, is, l);
			if (null != string)
				return string;
		}
		return Long.toString(l);
	}

	public Class527_Sub8_Sub17 method1280(int i) {
		Class527_Sub8_Sub17 class527_sub8_sub17 = (Class527_Sub8_Sub17) aClass205_518.method3787((long) i);
		if (class527_sub8_sub17 != null)
			return class527_sub8_sub17;
		byte[] is;
		if (i >= 32768)
			is = aClass459_515.method7470(1, i & 0x7fff, (byte) -28);
		else
			is = aClass459_516.method7470(1, i, (byte) -66);
		class527_sub8_sub17 = new Class527_Sub8_Sub17();
		class527_sub8_sub17.aClass51_11824 = this;
		if (is != null)
			class527_sub8_sub17.method18401(new RSByteBuffer(is), -413126420);
		if (i >= 32768)
			class527_sub8_sub17.method18408(-901302652);
		aClass205_518.method3790(class527_sub8_sub17, (long) i);
		return class527_sub8_sub17;
	}

	public Class527_Sub8_Sub17 method1281(int i) {
		Class527_Sub8_Sub17 class527_sub8_sub17 = (Class527_Sub8_Sub17) aClass205_518.method3787((long) i);
		if (class527_sub8_sub17 != null)
			return class527_sub8_sub17;
		byte[] is;
		if (i >= 32768)
			is = aClass459_515.method7470(1, i & 0x7fff, (byte) -101);
		else
			is = aClass459_516.method7470(1, i, (byte) -122);
		class527_sub8_sub17 = new Class527_Sub8_Sub17();
		class527_sub8_sub17.aClass51_11824 = this;
		if (is != null)
			class527_sub8_sub17.method18401(new RSByteBuffer(is), 247960192);
		if (i >= 32768)
			class527_sub8_sub17.method18408(-1552224198);
		aClass205_518.method3790(class527_sub8_sub17, (long) i);
		return class527_sub8_sub17;
	}

	String method1282(Class618 class618, int[] is, long l) {
		if (anInterface72_521 != null) {
			String string = anInterface72_521.method480(class618, is, l);
			if (null != string)
				return string;
		}
		return Long.toString(l);
	}

	String method1283(Class618 class618, int[] is, long l) {
		if (anInterface72_521 != null) {
			String string = anInterface72_521.method480(class618, is, l);
			if (null != string)
				return string;
		}
		return Long.toString(l);
	}

	static final void method1284(Class665 class665, int i) {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (0 != -405609043 * client.anInt11083 && i_2_ < 182205737 * client.anInt11299)
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = client.aClass72Array11301[i_2_].aString787;
		else
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
	}
}
