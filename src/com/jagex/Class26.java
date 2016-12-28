/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Class26 {
	static final int anInt234 = 4;
	static BigInteger aBigInteger235;
	static final String aString236 = "passwordchoice.ws";
	static final String aString237 = "services";
	static BigInteger aBigInteger238 = (new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"));
	static final int anInt239 = 1000;
	static final int anInt240 = 2;
	static final int anInt241 = 3;
	static final int anInt242 = 6;
	public static final int anInt243 = 5;
	static final String aString244 = "m=accountappeal/login.ws";
	static final int anInt245 = 7;
	static final int anInt246 = 2;
	public static int anInt247;
	public static Class184 aClass184_248;

	static {
		aBigInteger235 = (new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"));
	}

	static boolean method731(String string) {
		if (null == string)
			return false;
		try {
			new URL(string);
		} catch (MalformedURLException malformedurlexception) {
			return false;
		}
		return true;
	}

	public static long method732() {
		long l;
		try {
			URL url = new URL(new StringBuilder().append(Class640.method7673("services", false, -923644264)).append("m=accountappeal/login.ws").toString());
			URLConnection urlconnection = url.openConnection();
			urlconnection.setRequestProperty("connection", "close");
			urlconnection.setDoInput(true);
			urlconnection.setDoOutput(true);
			urlconnection.setConnectTimeout(5000);
			OutputStreamWriter outputstreamwriter = new OutputStreamWriter(urlconnection.getOutputStream());
			outputstreamwriter.write("data1=req");
			outputstreamwriter.flush();
			InputStream inputstream = urlconnection.getInputStream();
			RSByteBuffer class536_sub33 = new RSByteBuffer(new byte[1000]);
			for (;;) {
				int i = inputstream.read(class536_sub33.buffer, -810172525 * class536_sub33.off, 1000 - (-810172525 * class536_sub33.off));
				if (-1 == i)
					break;
				class536_sub33.off += i * 516175515;
				if (class536_sub33.off * -810172525 >= 1000)
					return 0L;
			}
			class536_sub33.off = 0;
			long l_0_ = class536_sub33.readLong(702869087);
			l = l_0_;
		} catch (Exception exception) {
			return 0L;
		}
		return l;
	}

	public static long method733() {
		long l;
		try {
			URL url = new URL(new StringBuilder().append(Class640.method7673("services", false, -923644264)).append("m=accountappeal/login.ws").toString());
			URLConnection urlconnection = url.openConnection();
			urlconnection.setRequestProperty("connection", "close");
			urlconnection.setDoInput(true);
			urlconnection.setDoOutput(true);
			urlconnection.setConnectTimeout(5000);
			OutputStreamWriter outputstreamwriter = new OutputStreamWriter(urlconnection.getOutputStream());
			outputstreamwriter.write("data1=req");
			outputstreamwriter.flush();
			InputStream inputstream = urlconnection.getInputStream();
			RSByteBuffer class536_sub33 = new RSByteBuffer(new byte[1000]);
			for (;;) {
				int i = inputstream.read(class536_sub33.buffer, -810172525 * class536_sub33.off, 1000 - (-810172525 * class536_sub33.off));
				if (-1 == i)
					break;
				class536_sub33.off += i * 516175515;
				if (class536_sub33.off * -810172525 >= 1000)
					return 0L;
			}
			class536_sub33.off = 0;
			long l_1_ = class536_sub33.readLong(702869087);
			l = l_1_;
		} catch (Exception exception) {
			return 0L;
		}
		return l;
	}

	static boolean method734(String string) {
		if (null == string)
			return false;
		try {
			new URL(string);
		} catch (MalformedURLException malformedurlexception) {
			return false;
		}
		return true;
	}

	Class26() throws Throwable {
		throw new Error();
	}

	static long method735(Interface59 interface59, int i, int i_2_, byte i_3_) {
		long l = 4194304L;
		long l_4_ = -9223372036854775808L;
		Class612 class612 = ((Class612) client.aClass515_11066.method6280(-1073841494).method70(interface59.method373((byte) 33), (byte) -52));
		long l_5_ = (long) (i | i_2_ << 7 | interface59.method71(1923200161) << 14 | interface59.method367((byte) -28) << 20 | 0x40000000);
		if (0 == 1248110961 * class612.anInt7953)
			l_5_ |= l_4_;
		if (1 == class612.anInt7996 * -1529252395)
			l_5_ |= l;
		l_5_ |= (long) interface59.method373((byte) -73) << 32;
		return l_5_;
	}

	static final void method736(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class63.aClass226_717.method3222(133626197) ? 1 : 0;
	}

	static final void method737(Class668 class668, byte i) {
		ClientSetting.aClass536_Sub40_8843.method9857(ClientSetting.aClass536_Sub40_8843.groundBlendingSetting, (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) != 0 ? 1 : 0, (byte) 1);
		Class27.method763(1926239903);
		client.aClass515_11066.method6319(-1336882576);
	}

	static final void method738(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class251.colour * -336626187;
	}

	static void method739(Class167 class167, int i) {
		if (Class187.method2780(-1208840786) && Class292.method3964(2042272942))
			Class265.method3686(0, 0, Class144.anInt1679 * -1804846931, 350, (byte) 4);
		class167.method2369(0, 0, -1804846931 * Class144.anInt1679, 350);
		class167.method2063(0, 0, Class144.anInt1679 * -1804846931, 350, 935006559 * Class105.anInt1244 << 24 | 0x332277, 1);
		if (Class105.aBool1242) {
			for (int i_6_ = 0; i_6_ < 100; i_6_++) {
				int i_7_ = Class105.anIntArray1251[i_6_] >> 4;
				int i_8_ = Class388.anIntArray4046[i_6_] >> 4;
				i_7_ += (Class447.anIntArray4906[64 * ((i_7_ & 0x40) + i_8_) & 0x3fff]) >> 10;
				if (i_7_ >= 0 && i_7_ >> 1 < Class271.anIntArray2887.length && Class271.anIntArray2887[i_7_ >> 1] >> 2 < 350 - i_8_)
					class167.method2063(i_7_, i_8_, 2, 2, (Class536_Sub22_Sub1.anIntArray11618[i_6_]) << 24 | 0xffffff, 1);
			}
			for (int i_9_ = 0; i_9_ < Class271.anIntArray2887.length; i_9_++) {
				int i_10_ = Class271.anIntArray2887[i_9_] >> 2;
				class167.method2063(i_9_ << 1, 350 - i_10_, 2, i_10_, -2130706433, 1);
			}
		}
		int i_11_ = 350 / (1496715277 * Class105.anInt1238);
		if (Class105.anInt1247 * -2122502799 > 0) {
			int i_12_ = 346 - 1496715277 * Class105.anInt1238 - 4;
			int i_13_ = (i_12_ * i_11_ / (-2122502799 * Class105.anInt1247 + i_11_ - 1));
			int i_14_ = 4;
			if (Class105.anInt1247 * -2122502799 > 1)
				i_14_ += ((i_12_ - i_13_) * (Class105.anInt1247 * -2122502799 - 1 - Class105.anInt1240 * 817280251) / (-2122502799 * Class105.anInt1247 - 1));
			class167.method2063(Class144.anInt1679 * -1804846931 - 16, i_14_, 12, i_13_, (935006559 * Class105.anInt1244 << 24 | 0x332277), 2);
			for (int i_15_ = Class105.anInt1240 * 817280251; (i_15_ < Class105.anInt1240 * 817280251 + i_11_ && i_15_ < Class105.anInt1247 * -2122502799); i_15_++) {
				String[] strings = Class344.method4483((Class205_Sub16.aStringArray9941[i_15_]), '\010', (byte) -86);
				int i_16_ = ((-1804846931 * Class144.anInt1679 - 8 - 16) / strings.length);
				for (int i_17_ = 0; i_17_ < strings.length; i_17_++) {
					int i_18_ = 8 + i_17_ * i_16_;
					class167.method2369(i_18_, 0, i_16_ + i_18_ - 8, 350);
					Class536_Sub15.aClass184_10488.renderItemAmountIThink(Class580.method7015(strings[i_17_], 2117647683), i_18_, (350 - 1213913633 * Class105.anInt1237 - 2 - Class223.aClass2_2338.anInt92 * 1780869003 - ((i_15_ - 817280251 * Class105.anInt1240) * (Class105.anInt1238 * 1496715277))), -1, -16777216, (byte) -94);
				}
			}
		}
		Class18.aClass184_190.method2741("876 1", Class144.anInt1679 * -1804846931 - 25, 330, -1, -16777216, -1516754983);
		class167.method2369(0, 0, Class144.anInt1679 * -1804846931, 350);
		class167.method2059(0, 350 - 1213913633 * Class105.anInt1237, Class144.anInt1679 * -1804846931, -1, -1399442393);
		aClass184_248.renderItemAmountIThink(new StringBuilder().append("--> ").append(Class580.method7015(Class105.aString1243, 659315203)).toString(), 10, (350 - 1780869003 * Class260.aClass2_2840.anInt92 - 1), -1, -16777216, (byte) -23);
		if (Class67_Sub1.aBool10601) {
			int i_19_ = -1;
			if (client.cycles % 30 > 15)
				i_19_ = 16777215;
			class167.method2385((10 + (Class260.aClass2_2840.method530(new StringBuilder().append("--> ").append(Class580.method7015(Class105.aString1243, -1357855486).substring(0, -478568567 * Class105.anInt1246)).toString(), (byte) -95))), 350 - 1780869003 * Class260.aClass2_2840.anInt92 - 11, 12, i_19_, 1399787617);
		}
		class167.method2051();
		Class263.method3663((byte) -40);
	}

	static final void method740(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class542_Sub1.aBool10708 ? 1 : 0;
	}

	public static Class536_Sub41 method741(int i) {
		if (Class542_Sub1.aClass708_7218 == null || null == Class542_Sub1.aClass693_10725)
			return null;
		Class542_Sub1.aClass693_10725.method8196(Class542_Sub1.aClass708_7218, -1879277910);
		Class536_Sub41 class536_sub41 = ((Class536_Sub41) Class542_Sub1.aClass693_10725.method8198(-1281475800));
		if (class536_sub41 == null)
			return null;
		Class248 class248 = ((Class248) Class542_Sub1.aClass34_Sub8_7212.method70((2000440429 * (class536_sub41.anInt10793)), (byte) -38));
		if (null == class248 || !class248.aBool2522 || !class248.method3429(Class542_Sub1.anInterface20_7169, Class542_Sub1.anInterface18_7163, 1930779258))
			return Class521_Sub4.method9365(-708145194);
		return class536_sub41;
	}

	static final void method742(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		if (class668.anIntArray8541[1 + class668.anInt8542 * 1867269829] == class668.anIntArray8541[1867269829 * class668.anInt8542])
			class668.anInt8564 += -1531084683 * (class668.anIntArray8537[-1640738851 * class668.anInt8564]);
	}

	static void method743(IComponentDefinitions class251, int i, int i_20_, boolean bool, int i_21_) {
		int i_22_ = -1606950689 * class251.anInt2573;
		int i_23_ = 223822141 * class251.anInt2574;
		if (0 == class251.sizeXMode)
			class251.anInt2573 = 734859999 * class251.sizeX;
		else if (class251.sizeXMode == 1)
			class251.anInt2573 = (i - 101683265 * class251.sizeX) * -1094460641;
		else if (class251.sizeXMode == 2)
			class251.anInt2573 = (i * (class251.sizeX * 101683265) >> 14) * -1094460641;
		if (class251.sizeYMode == 0)
			class251.anInt2574 = 247423453 * class251.sizeY;
		else if (1 == class251.sizeYMode)
			class251.anInt2574 = 1965334037 * (i_20_ - -1769050455 * class251.sizeY);
		else if (class251.sizeYMode == 2)
			class251.anInt2574 = 1965334037 * (class251.sizeY * -1769050455 * i_20_ >> 14);
		if (4 == class251.sizeXMode)
			class251.anInt2573 = (class251.anInt2693 * 460230119 * (223822141 * class251.anInt2574) / (class251.anInt2576 * 1468559887) * -1094460641);
		if (class251.sizeYMode == 4)
			class251.anInt2574 = (class251.anInt2576 * 1468559887 * (class251.anInt2573 * -1606950689) / (460230119 * class251.anInt2693) * 1965334037);
		if (client.aBool11010 && (client.getIComponentSettings(class251).settings * -512963777 != 0 || 0 == 1049444347 * class251.anInt2728)) {
			if (class251.anInt2574 * 223822141 < 5 && class251.anInt2573 * -1606950689 < 5) {
				class251.anInt2574 = 1236735593;
				class251.anInt2573 = -1177335909;
			} else {
				if (223822141 * class251.anInt2574 <= 0)
					class251.anInt2574 = 1236735593;
				if (class251.anInt2573 * -1606950689 <= 0)
					class251.anInt2573 = -1177335909;
			}
		}
		if (IComponentDefinitions.anInt2537 * -2049675251 == -1769600535 * class251.anInt2562)
			client.aClass251_11195 = class251;
		if (bool && null != class251.onResizeHook && (i_22_ != class251.anInt2573 * -1606950689 || i_23_ != 223822141 * class251.anInt2574)) {
			Class536_Sub42 class536_sub42 = new Class536_Sub42();
			class536_sub42.aClass251_10804 = class251;
			class536_sub42.anObjectArray10802 = class251.onResizeHook;
			client.aClass708_11077.method8335(class536_sub42, -422152708);
		}
	}

	static void method744(int i, int i_24_, IComponentDefinitions class251, Class161 class161, int i_25_, int i_26_, short i_27_) {
		int i_28_ = -1482773169 * Class95.anInt1156;
		int[] is = Class95.anIntArray1157;
		for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
			Player player = client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i_29_]];
			if (null != player && player.method11088(1644471179) && !player.aClass623_12201.method7421(811086071) && (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 != player) && (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839 == player.aByte10839)) {
				Class436 class436 = player.method7837().aClass436_4823;
				int i_30_ = (int) class436.aFloat4850 / 128 - i / 128;
				int i_31_ = (int) class436.aFloat4853 / 128 - i_24_ / 128;
				boolean bool = false;
				for (int i_32_ = 0; i_32_ < 142551095 * client.anInt11288; i_32_++) {
					Class31 class31 = client.aClass31Array11291[i_32_];
					if (player.username.equals(class31.aString266) && class31.anInt272 * -32584767 != 0) {
						bool = true;
						break;
					}
				}
				boolean bool_33_ = false;
				for (int i_34_ = 0; i_34_ < -918987073 * Class269.anInt2880; i_34_++) {
					if (player.username.equals(Class360_Sub1.aClass94Array10168[i_34_].aString1146)) {
						bool_33_ = true;
						break;
					}
				}
				boolean bool_35_ = false;
				if ((Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.anInt12191 * 1717228615) != 0 && (player.anInt12191 * 1717228615 != 0) && ((Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.anInt12191 * 1717228615) == (player.anInt12191 * 1717228615)))
					bool_35_ = true;
				if (null != player.aClass617_12202 && -1 != -587726343 * (player.aClass617_12202.anInt8079) && ((Class296) (Class172.aClass34_Sub7_1922.method70((player.aClass617_12202.anInt8079) * -587726343, (byte) 47))).aBool3339)
					Class533.method6467(class251, class161, i_25_, i_26_, i_30_, i_31_, Class35.aClass143Array292[1], (byte) 84);
				else if (Class210.aClass210_2259 == player.aClass210_12200)
					Class533.method6467(class251, class161, i_25_, i_26_, i_30_, i_31_, Class35.aClass143Array292[8], (byte) 39);
				else if (player.aClass210_12200 == Class210.aClass210_2257)
					Class533.method6467(class251, class161, i_25_, i_26_, i_30_, i_31_, Class35.aClass143Array292[6], (byte) -28);
				else if (bool_35_)
					Class533.method6467(class251, class161, i_25_, i_26_, i_30_, i_31_, Class35.aClass143Array292[4], (byte) 17);
				else if (player.isClanMember)
					Class533.method6467(class251, class161, i_25_, i_26_, i_30_, i_31_, Class35.aClass143Array292[7], (byte) -58);
				else if (bool)
					Class533.method6467(class251, class161, i_25_, i_26_, i_30_, i_31_, Class35.aClass143Array292[3], (byte) 85);
				else if (bool_33_)
					Class533.method6467(class251, class161, i_25_, i_26_, i_30_, i_31_, Class35.aClass143Array292[5], (byte) 38);
				else
					Class533.method6467(class251, class161, i_25_, i_26_, i_30_, i_31_, Class35.aClass143Array292[2], (byte) -63);
			}
		}
	}
}
