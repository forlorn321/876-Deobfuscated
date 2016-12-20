/* Class109 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class109 {
	int anInt1359;
	Class694 aClass694_1360 = new Class694();
	IncomingPacket aClass422_1361;
	RSByteBuffer aClass527_Sub38_1362;
	public int anInt1363 = 0;
	Class527_Sub38_Sub2 aClass527_Sub38_Sub2_1364;
	Class2 aClass2_1365;
	Class563 aClass563_1366;
	public Class2 aClass2_1367;
	public int anInt1368;
	int anInt1369;
	int anInt1370;
	int anInt1371;
	boolean aBool1372;
	int anInt1373;
	int anInt1374;
	IncomingPacket incomingPacket;
	IncomingPacket aClass422_1376;
	IncomingPacket aClass422_1377;
	public boolean aBool1378;
	Class44 aClass44_1379;

	final void method1952() {
		aClass694_1360.method14105((byte) 121);
		anInt1363 = 0;
	}

	void method1953(Class563 class563, String string) {
		aClass563_1366 = class563;
		aClass44_1379.method1186(string, (byte) 8);
	}

	public final void method1954(int i) throws IOException {
		if (aClass563_1366 != null && anInt1363 * 1083275433 > 0) {
			aClass527_Sub38_1362.anInt10689 = 0;
			for (;;) {
				Class527_Sub15 class527_sub15 = ((Class527_Sub15) aClass694_1360.method14081((short) 3803));
				if (null == class527_sub15 || (-1767921195 * class527_sub15.anInt10460 > (aClass527_Sub38_1362.buffer.length - aClass527_Sub38_1362.anInt10689 * -441238943)))
					break;
				aClass527_Sub38_1362.writeBytes(class527_sub15.buffer.buffer, 0, -1767921195 * class527_sub15.anInt10460, (byte) 16);
				anInt1363 -= class527_sub15.anInt10460 * -497301683;
				class527_sub15.method8735(-1889161967);
				class527_sub15.buffer.method16599((byte) 107);
				class527_sub15.method16118(16711935);
			}
			aClass563_1366.method9469(aClass527_Sub38_1362.buffer, 0, (-441238943 * aClass527_Sub38_1362.anInt10689), (byte) 81);
			anInt1371 += aClass527_Sub38_1362.anInt10689 * -1283919913;
			anInt1368 = 0;
		}
	}

	void method1955() {
		if (client.anInt11019 % 50 == 0) {
			anInt1373 = anInt1371 * -512830793;
			anInt1371 = 0;
			anInt1374 = -761382005 * anInt1370;
			anInt1370 = 0;
		}
	}

	void method1956(int i) {
		if (client.anInt11019 % 50 == 0) {
			anInt1373 = anInt1371 * -512830793;
			anInt1371 = 0;
			anInt1374 = -761382005 * anInt1370;
			anInt1370 = 0;
		}
	}

	void method1957(Class563 class563, String string, int i) {
		aClass563_1366 = class563;
		aClass44_1379.method1186(string, (byte) 8);
	}

	void method1958() {
		aClass563_1366 = null;
		aClass44_1379.method1186(null, (byte) 8);
	}

	void method1959(int i) {
		aClass563_1366 = null;
		aClass44_1379.method1186(null, (byte) 8);
	}

	Class109() {
		aClass527_Sub38_1362 = new RSByteBuffer(1700);
		aClass527_Sub38_Sub2_1364 = new Class527_Sub38_Sub2(40000);
		incomingPacket = null;
		anInt1359 = 0;
		aBool1372 = true;
		anInt1369 = 0;
		anInt1368 = 0;
		aBool1378 = false;
		aClass44_1379 = new Class44();
		Thread thread = new Thread(aClass44_1379);
		thread.setDaemon(true);
		thread.setPriority(1);
		thread.start();
	}

	final void method1960(byte i) {
		aClass694_1360.method14105((byte) 43);
		anInt1363 = 0;
	}

	void method1961(Class563 class563, String string) {
		aClass563_1366 = class563;
		aClass44_1379.method1186(string, (byte) 8);
	}

	public final void method1962() throws IOException {
		if (aClass563_1366 != null && anInt1363 * 1083275433 > 0) {
			aClass527_Sub38_1362.anInt10689 = 0;
			for (;;) {
				Class527_Sub15 class527_sub15 = ((Class527_Sub15) aClass694_1360.method14081((short) -11084));
				if (null == class527_sub15 || (-1767921195 * class527_sub15.anInt10460 > (aClass527_Sub38_1362.buffer.length - aClass527_Sub38_1362.anInt10689 * -441238943)))
					break;
				aClass527_Sub38_1362.writeBytes(class527_sub15.buffer.buffer, 0, -1767921195 * class527_sub15.anInt10460, (byte) 116);
				anInt1363 -= class527_sub15.anInt10460 * -497301683;
				class527_sub15.method8735(-1889161967);
				class527_sub15.buffer.method16599((byte) 121);
				class527_sub15.method16118(16711935);
			}
			aClass563_1366.method9469(aClass527_Sub38_1362.buffer, 0, (-441238943 * aClass527_Sub38_1362.anInt10689), (byte) 111);
			anInt1371 += aClass527_Sub38_1362.anInt10689 * -1283919913;
			anInt1368 = 0;
		}
	}

	public final void method1963() throws IOException {
		if (aClass563_1366 != null && anInt1363 * 1083275433 > 0) {
			aClass527_Sub38_1362.anInt10689 = 0;
			for (;;) {
				Class527_Sub15 class527_sub15 = ((Class527_Sub15) aClass694_1360.method14081((short) 20455));
				if (null == class527_sub15 || (-1767921195 * class527_sub15.anInt10460 > (aClass527_Sub38_1362.buffer.length - aClass527_Sub38_1362.anInt10689 * -441238943)))
					break;
				aClass527_Sub38_1362.writeBytes(class527_sub15.buffer.buffer, 0, -1767921195 * class527_sub15.anInt10460, (byte) 80);
				anInt1363 -= class527_sub15.anInt10460 * -497301683;
				class527_sub15.method8735(-1889161967);
				class527_sub15.buffer.method16599((byte) 120);
				class527_sub15.method16118(16711935);
			}
			aClass563_1366.method9469(aClass527_Sub38_1362.buffer, 0, (-441238943 * aClass527_Sub38_1362.anInt10689), (byte) 52);
			anInt1371 += aClass527_Sub38_1362.anInt10689 * -1283919913;
			anInt1368 = 0;
		}
	}

	public final void method1964(Class527_Sub15 class527_sub15) {
		aClass694_1360.method14147(class527_sub15, -2071504780);
		class527_sub15.anInt10460 = (class527_sub15.buffer.anInt10689 * 1407477853);
		class527_sub15.buffer.anInt10689 = 0;
		anInt1363 += -497301683 * class527_sub15.anInt10460;
	}

	public final void method1965(Class527_Sub15 class527_sub15) {
		aClass694_1360.method14147(class527_sub15, -231956780);
		class527_sub15.anInt10460 = (class527_sub15.buffer.anInt10689 * 1407477853);
		class527_sub15.buffer.anInt10689 = 0;
		anInt1363 += -497301683 * class527_sub15.anInt10460;
	}

	public final void method1966(Class527_Sub15 class527_sub15) {
		aClass694_1360.method14147(class527_sub15, -2096572543);
		class527_sub15.anInt10460 = (class527_sub15.buffer.anInt10689 * 1407477853);
		class527_sub15.buffer.anInt10689 = 0;
		anInt1363 += -497301683 * class527_sub15.anInt10460;
	}

	public Class563 method1967(int i) {
		return aClass563_1366;
	}

	void method1968(byte i) {
		if (null != aClass563_1366) {
			aClass563_1366.method9470((byte) 92);
			aClass563_1366 = null;
		}
		aClass44_1379.method1186(null, (byte) 8);
	}

	public final void method1969(Class527_Sub15 class527_sub15, byte i) {
		aClass694_1360.method14147(class527_sub15, -1415332600);
		class527_sub15.anInt10460 = (class527_sub15.buffer.anInt10689 * 1407477853);
		class527_sub15.buffer.anInt10689 = 0;
		anInt1363 += -497301683 * class527_sub15.anInt10460;
	}

	void method1970(Class563 class563, String string) {
		aClass563_1366 = class563;
		aClass44_1379.method1186(string, (byte) 8);
	}

	void method1971(Class563 class563, String string) {
		aClass563_1366 = class563;
		aClass44_1379.method1186(string, (byte) 8);
	}

	void method1972(Class563 class563, String string) {
		aClass563_1366 = class563;
		aClass44_1379.method1186(string, (byte) 8);
	}

	void method1973() {
		if (client.anInt11019 % 50 == 0) {
			anInt1373 = anInt1371 * -512830793;
			anInt1371 = 0;
			anInt1374 = -761382005 * anInt1370;
			anInt1370 = 0;
		}
	}

	void method1974() {
		if (client.anInt11019 % 50 == 0) {
			anInt1373 = anInt1371 * -512830793;
			anInt1371 = 0;
			anInt1374 = -761382005 * anInt1370;
			anInt1370 = 0;
		}
	}

	void method1975() {
		if (null != aClass563_1366) {
			aClass563_1366.method9470((byte) 16);
			aClass563_1366 = null;
		}
		aClass44_1379.method1186(null, (byte) 8);
	}

	void method1976() {
		aClass563_1366 = null;
		aClass44_1379.method1186(null, (byte) 8);
	}

	void method1977() {
		aClass563_1366 = null;
		aClass44_1379.method1186(null, (byte) 8);
	}

	final void method1978() {
		aClass694_1360.method14105((byte) 11);
		anInt1363 = 0;
	}

	public Class563 method1979() {
		return aClass563_1366;
	}

	static final void method1980(Class527_Sub38_Sub2 class527_sub38_sub2, int i) {
		for (int i_0_ = 0; i_0_ < Class105.anInt1294 * -673487677; i_0_++) {
			class527_sub38_sub2.readUnsignedShort();
			int i_1_ = Class105.anIntArray1306[i_0_];
			Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_1_];
			int i_2_ = class527_sub38_sub2.readUnsignedByte();
			if (0 != (i_2_ & 0x80))
				i_2_ += class527_sub38_sub2.readUnsignedByte() << 8;
			if (0 != (i_2_ & 0x800))
				i_2_ += class527_sub38_sub2.readUnsignedByte() << 16;
			Class208_Sub14.method15623(class527_sub38_sub2, i_1_, class640_sub1_sub2_sub1_sub2, i_2_, -848417122);
		}
	}

	static final void method1981(Class665 class665, int i) {
		int i_3_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_3_, 1105323270);
		Class240 class240 = Class183.aClass240Array2100[i_3_ >> 16];
		Class47.method1238(class243, class240, class665, 246128225);
	}

	public static final void method1982(String string, String string_4_, int i) {
		Class109 class109 = Class203.method3782((byte) -1);
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4389, class109.aClass2_1367, (byte) 47);
		if (string_4_.length() > 30)
			string_4_ = string_4_.substring(0, 30);
		class527_sub15.buffer.writeByte((Class208_Sub18.method15632(string, (byte) -42) + Class208_Sub18.method15632(string_4_, (byte) -57)), 635174454);
		class527_sub15.buffer.writeString(string, 1082207588);
		class527_sub15.buffer.writeString(string_4_, 303220460);
		class109.method1969(class527_sub15, (byte) 1);
	}

	static void method1983(byte i) {
		Class527_Sub1.aClass205_10331.method3793((byte) 56);
	}
}
