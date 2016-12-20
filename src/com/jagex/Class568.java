/* Class568 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.util.Date;

public class Class568 {
	int anInt7610;
	int anInt7611;
	int anInt7612;
	int anInt7613;
	static int anInt7614;
	static Class22 aClass22_7615;

	Class568(int i, int i_0_, int i_1_, int i_2_) {
		anInt7611 = 595679897 * i;
		anInt7612 = 821054141 * i_0_;
		anInt7610 = i_1_ * 449669933;
		anInt7613 = -1040487347 * i_2_;
	}

	public static void method9565(byte i) {
		if (null != Class290.aClass300_3229)
			Class290.aClass300_3229.method5536(-861314209);
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

	static void method9566(byte i) {
		if (Class63.aClass28_737 != null) {
			try {
				int i_3_;
				if (956017269 * Class63.anInt735 == 0)
					i_3_ = 250;
				else
					i_3_ = 2000;
				Class63.anInt734 += -700818389;
				if (209683075 * Class63.anInt734 > i_3_)
					Class527_Sub41.method16679(854158057);
				if (Class28.aClass28_260 == Class63.aClass28_737) {
					client.aClass109_11066.method1957(Class492.method7995(Class3.aClass13_36.method705((byte) 0), 40000, -691042923), Class3.aClass13_36.aString178, -1386323644);
					client.aClass109_11066.method1960((byte) -109);
					Class527_Sub15 class527_sub15 = Class565.method9498(757051694);
					class527_sub15.buffer.writeByte(1000765535 * Class410.aClass410_4355.anInt4354, 853072286);
					class527_sub15.buffer.writeShort(0, 1404835786);
					int i_4_ = (class527_sub15.buffer.anInt10689 * -441238943);
					class527_sub15.buffer.writeShort(876, 1404835786);
					class527_sub15.buffer.writeShort(1, 1404835786);
					Class77.anIntArray797 = Class602.method10007(class527_sub15, 1699687375);
					int i_5_ = (-441238943 * (class527_sub15.buffer.anInt10689));
					class527_sub15.buffer.writeString(client.aString11009, -258856136);
					class527_sub15.buffer.writeShort(client.anInt10992 * 651761593, 1404835786);
					class527_sub15.buffer.writeInt(client.anInt11035 * -2046174135, 1288891983);
					class527_sub15.buffer.writeInt(client.anInt10995 * 1582447073, -1246771571);
					class527_sub15.buffer.writeString(Class628.aString8204, -857745340);
					class527_sub15.buffer.writeByte(Class144_Sub1.aClass671_8995.method87(), -656235785);
					class527_sub15.buffer.writeByte(client.aClass678_11259.anInt8610 * -1907167873, 171980532);
					Class187.method3655((class527_sub15.buffer), -1499997049);
					String string = client.aString11308;
					class527_sub15.buffer.writeByte(string == null ? 0 : 1, 1592577981);
					if (null != string)
						class527_sub15.buffer.writeString(string, 213489540);
					Class177.aClass527_Sub40_2048.method16668(class527_sub15.buffer, 753577756);
					class527_sub15.buffer.anInt10689 += 1733321575;
					class527_sub15.buffer.method16471(Class77.anIntArray797, i_5_, -441238943 * (class527_sub15.buffer.anInt10689), (byte) 79);
					class527_sub15.buffer.method16437((-441238943 * (class527_sub15.buffer.anInt10689) - i_4_), -18705907);
					client.aClass109_11066.method1969(class527_sub15, (byte) 1);
					client.aClass109_11066.method1954(-949891446);
					Class63.aClass28_737 = Class28.aClass28_261;
				}
				if (Class28.aClass28_261 == Class63.aClass28_737) {
					if (client.aClass109_11066.method1967(2071668656) == null)
						Class527_Sub41.method16679(1568116953);
					else if (client.aClass109_11066.method1967(2103705005).method9466(1, (byte) -61)) {
						client.aClass109_11066.method1967(1969207466).method9472((client.aClass109_11066.aClass527_Sub38_Sub2_1364.buffer), 0, 1, -226630132);
						Class63.aClass699_733 = ((Class699) Class26.method858(Class615.method10188((byte) 18), (client.aClass109_11066.aClass527_Sub38_Sub2_1364.buffer[0]) & 0xff, -110624564));
						if (Class63.aClass699_733 == Class699.aClass699_8776) {
							client.aClass109_11066.aClass2_1367 = new Class2(Class77.anIntArray797);
							int[] is = new int[4];
							for (int i_6_ = 0; i_6_ < 4; i_6_++)
								is[i_6_] = Class77.anIntArray797[i_6_] + 50;
							client.aClass109_11066.aClass2_1365 = new Class2(is);
							new Class2(is);
							client.aClass109_11066.aClass527_Sub38_Sub2_1364.method18445(client.aClass109_11066.aClass2_1365, -294962883);
							Class78.method1560(11, (byte) 0);
							client.aClass109_11066.method1960((byte) -87);
							client.aClass109_11066.aClass527_Sub38_Sub2_1364.anInt10689 = 0;
							client.aClass109_11066.aClass422_1361 = null;
							client.aClass109_11066.aClass422_1376 = null;
							client.aClass109_11066.aClass422_1377 = null;
							client.aClass109_11066.anInt1369 = 0;
							Class671.aClass97_8584.aClass603_1162.method10014(943054202);
							Class527_Sub5.method16052(49653433);
						} else
							client.aClass109_11066.method1968((byte) 97);
						client.aClass109_11066.incomingPacket = null;
						Class63.aClass28_737 = null;
					}
				}
			} catch (IOException ioexception) {
				Class527_Sub41.method16679(1283176712);
			}
		}
	}

	static void method9567(long l) {
		Class85.aCalendar818.setTime(new Date(l));
	}

	static void method9568(int i, int i_7_, int i_8_, Class527_Sub22 class527_sub22, int i_9_) {
		long l = (long) (i << 28 | i_8_ << 14 | i_7_);
		Class527_Sub12 class527_sub12 = (Class527_Sub12) client.aClass14_11253.method709(l);
		if (class527_sub12 == null) {
			class527_sub12 = new Class527_Sub12();
			client.aClass14_11253.method714(class527_sub12, l);
			class527_sub12.aClass694_10444.method14147(class527_sub22, -1050888092);
		} else {
			Class9 class9 = ((Class9) (Class174_Sub2.aClass24_Sub17_9120.method81(-875637783 * class527_sub22.anInt10494, -1156001865)));
			int i_10_ = class9.anInt100 * -1204628591;
			if (1 == class9.anInt98 * -1099072041)
				i_10_ *= class527_sub22.anInt10493 * -1543349933 + 1;
			for (Class527_Sub22 class527_sub22_11_ = (Class527_Sub22) class527_sub12.aClass694_10444.method14081((short) -9056); class527_sub22_11_ != null; class527_sub22_11_ = ((Class527_Sub22) class527_sub12.aClass694_10444.method14086(-65534))) {
				class9 = (Class9) (Class174_Sub2.aClass24_Sub17_9120.method81(-875637783 * class527_sub22_11_.anInt10494, -1655894867));
				int i_12_ = -1204628591 * class9.anInt100;
				if (1 == class9.anInt98 * -1099072041)
					i_12_ *= 1 + -1543349933 * class527_sub22_11_.anInt10493;
				if (i_10_ > i_12_) {
					Class188.method3665(class527_sub22, class527_sub22_11_, (short) 20778);
					return;
				}
			}
			class527_sub12.aClass694_10444.method14147(class527_sub22, -824507411);
		}
	}

	public static Class147 method9569(Class459 class459, int i, int i_13_) {
		Class147 class147 = (Class147) Class299.aClass205_3393.method3787((long) i);
		if (class147 == null) {
			if (Class527_Sub22.aBool10492)
				class147 = Class402.aClass180_4150.method3271(Class165.method2665(class459, i), true);
			else
				class147 = Class689.method14000(class459.method7512(i, 1447980132), -1749222307);
			Class299.aClass205_3393.method3790(class147, (long) i);
		}
		return class147;
	}

	public static void method9570(boolean bool, int i) {
		Class245.aClass226_2698.method4200(-391089068);
		if (Class167.method2677(-1927019389 * client.anInt11048, (byte) 17)) {
			Class109[] class109s = client.aClass109Array11068;
			for (int i_14_ = 0; i_14_ < class109s.length; i_14_++) {
				Class109 class109 = class109s[i_14_];
				class109.anInt1368 += -1444708313;
				if (1750986647 * class109.anInt1368 < 50 && !bool)
					return;
				class109.anInt1368 = 0;
				if (!class109.aBool1378 && class109.method1967(2128707739) != null) {
					Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4494, class109.aClass2_1367, (byte) 57);
					class109.method1969(class527_sub15, (byte) 1);
					try {
						class109.method1954(-820819026);
					} catch (IOException ioexception) {
						class109.aBool1378 = true;
					}
				}
			}
			Class245.aClass226_2698.method4200(680055842);
		}
	}
}
