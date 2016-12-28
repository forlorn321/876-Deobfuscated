/* Class536_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;

import jaclib.hardware_info.HardwareInfo;

public class Class536_Sub38 extends Class536 {
	static final int anInt10643 = 7;
	static final int anInt10644 = 1;
	static final int anInt10645 = 2;
	static final int anInt10646 = 3;
	int anInt10647;
	String aString10648;
	static final int anInt10649 = 7;
	int anInt10650;
	static final int anInt10651 = 2;
	static final int anInt10652 = 3;
	static final int anInt10653 = 4;
	static final int anInt10654 = 5;
	static final int anInt10655 = 6;
	int anInt10656;
	static final int anInt10657 = 8;
	int anInt10658;
	static final int anInt10659 = 10;
	static final int anInt10660 = 11;
	static final int anInt10661 = 20;
	static final int anInt10662 = 21;
	static final int anInt10663 = 22;
	static final int anInt10664 = 23;
	static final int anInt10665 = 0;
	static final int anInt10666 = 25;
	int anInt10667;
	static final int anInt10668 = 27;
	static final int anInt10669 = 5;
	static final int anInt10670 = 1;
	static final int anInt10671 = 2;
	static final int anInt10672 = 3;
	String aString10673;
	boolean aBool10674;
	int anInt10675;
	int anInt10676;
	int anInt10677;
	int anInt10678;
	static final int anInt10679 = 1;
	int anInt10680;
	static final int anInt10681 = 4;
	public static final int anInt10682 = 0;
	boolean aBool10683;
	public int anInt10684;
	int anInt10685;
	static final int anInt10686 = 24;
	String aString10687;
	String aString10688;
	String aString10689;
	static final int anInt10690 = 9;
	int anInt10691;
	static final int anInt10692 = 4;
	int anInt10693;
	String aString10694;
	int anInt10695;
	int[] anIntArray10696 = new int[3];
	static final int anInt10697 = 26;
	String aString10698;

	public Class536_Sub38(boolean bool) {
		if (bool) {
			if (Class241.osName.startsWith("win"))
				anInt10650 = 467162529;
			else if (Class241.osName.startsWith("mac"))
				anInt10650 = 934325058;
			else if (Class241.osName.startsWith("linux"))
				anInt10650 = 1401487587;
			else
				anInt10650 = 1868650116;
			if (Class451.osArchRaw.startsWith("amd64") || Class451.osArchRaw.startsWith("x86_64"))
				aBool10683 = true;
			else
				aBool10683 = false;
			if (1 == 1780534881 * anInt10650) {
				if (Class221.aString2312.indexOf("4.0") != -1)
					anInt10667 = -1556445175;
				else if (Class221.aString2312.indexOf("4.1") != -1)
					anInt10667 = 1182076946;
				else if (Class221.aString2312.indexOf("4.9") != -1)
					anInt10667 = -374368229;
				else if (Class221.aString2312.indexOf("5.0") != -1)
					anInt10667 = -1930813404;
				else if (Class221.aString2312.indexOf("5.1") != -1)
					anInt10667 = 807708717;
				else if (Class221.aString2312.indexOf("5.2") != -1)
					anInt10667 = 433340488;
				else if (Class221.aString2312.indexOf("6.0") != -1)
					anInt10667 = -748736458;
				else if (Class221.aString2312.indexOf("6.1") != -1)
					anInt10667 = 1989785663;
				else if (Class221.aString2312.indexOf("6.2") != -1)
					anInt10667 = -1123104687;
				else if (Class221.aString2312.indexOf("6.3") != -1)
					anInt10667 = 1615417434;
				else if (Class221.aString2312.indexOf("10.0") != -1)
					anInt10667 = 58972259;
			} else if (anInt10650 * 1780534881 == 2) {
				if (Class221.aString2312.indexOf("10.4") != -1)
					anInt10667 = -1064132428;
				else if (Class221.aString2312.indexOf("10.5") != -1)
					anInt10667 = 1674389693;
				else if (Class221.aString2312.indexOf("10.6") != -1)
					anInt10667 = 117944518;
				else if (Class221.aString2312.indexOf("10.7") != -1)
					anInt10667 = -1438500657;
				else if (Class221.aString2312.indexOf("10.8") != -1)
					anInt10667 = 1300021464;
				else if (Class221.aString2312.indexOf("10.9") != -1)
					anInt10667 = -256423711;
				else if (Class221.aString2312.indexOf("10.10") != -1)
					anInt10667 = -1812868886;
				else if (Class221.aString2312.indexOf("10.11") != -1)
					anInt10667 = 925653235;
			}
			if (InputStream_Sub1.aString10980.toLowerCase().indexOf("sun") != -1)
				anInt10675 = 1077063661;
			else if (InputStream_Sub1.aString10980.toLowerCase().indexOf("microsoft") != -1)
				anInt10675 = -2140839974;
			else if (InputStream_Sub1.aString10980.toLowerCase().indexOf("apple") != -1)
				anInt10675 = -1063776313;
			else if (InputStream_Sub1.aString10980.toLowerCase().indexOf("oracle") != -1)
				anInt10675 = 1090351009;
			else
				anInt10675 = 13287348;
			int i = 2;
			int i_0_ = 0;
			try {
				for (/**/; i < Class31.aString276.length(); i++) {
					int i_1_ = Class31.aString276.charAt(i);
					if (i_1_ < 48 || i_1_ > 57)
						break;
					i_0_ = i_0_ * 10 + (i_1_ - 48);
				}
			} catch (Exception exception) {
				/* empty */
			}
			anInt10676 = 1027549635 * i_0_;
			i = Class31.aString276.indexOf('.', 2) + 1;
			i_0_ = 0;
			try {
				for (/**/; i < Class31.aString276.length(); i++) {
					int i_2_ = Class31.aString276.charAt(i);
					if (i_2_ < 48 || i_2_ > 57)
						break;
					i_0_ = i_2_ - 48 + 10 * i_0_;
				}
			} catch (Exception exception) {
				/* empty */
			}
			anInt10677 = 998354175 * i_0_;
			i = Class31.aString276.indexOf('_', 4) + 1;
			i_0_ = 0;
			try {
				for (/**/; i < Class31.aString276.length(); i++) {
					int i_3_ = Class31.aString276.charAt(i);
					if (i_3_ < 48 || i_3_ > 57)
						break;
					i_0_ = 10 * i_0_ + (i_3_ - 48);
				}
			} catch (Exception exception) {
				/* empty */
			}
			anInt10678 = 847615163 * i_0_;
			aBool10674 = false;
			anInt10647 = -1356813877 * GameShell.maxMemory;
			if (982781675 * anInt10676 > 3)
				anInt10695 = -647223503 * GameShell.cpuCount;
			else
				anInt10695 = 0;
			try {
				int[] is = HardwareInfo.getCPUInfo();
				if (is != null && 3 == is.length) {
					anInt10656 = is[0] * 408103449;
					anInt10685 = is[1] * 1113539331;
					anInt10684 = -528926223 * is[2];
				}
				int[] is_4_ = HardwareInfo.getRawCPUInfo();
				if (is_4_ != null && 0 == is_4_.length % 5) {
					HashMap hashmap = new HashMap();
					for (int i_5_ = 0; i_5_ < is_4_.length / 5; i_5_++) {
						int i_6_ = is_4_[5 * i_5_];
						int i_7_ = is_4_[1 + i_5_ * 5];
						int i_8_ = is_4_[2 + 5 * i_5_];
						int i_9_ = is_4_[i_5_ * 5 + 3];
						int i_10_ = is_4_[4 + i_5_ * 5];
						Class44 class44 = new Class44(i_6_, i_7_, i_8_, i_9_, i_10_);
						hashmap.put(Integer.valueOf(i_6_), class44);
					}
					Class44 class44 = (Class44) hashmap.get(Integer.valueOf(0));
					if (null != class44) {
						RSByteBuffer class536_sub33 = new RSByteBuffer(13);
						class536_sub33.writeLEInt((class44.anInt517 * 1148204561), 1772012467);
						class536_sub33.writeLEInt((class44.anInt519 * -355001951), 1254891104);
						class536_sub33.writeLEInt((class44.anInt518 * -1485991535), 1772016271);
						class536_sub33.off = 0;
						aString10694 = class536_sub33.readString();
					}
					Class44 class44_11_ = (Class44) hashmap.get(Integer.valueOf(1));
					if (null != class44_11_) {
						anInt10658 = class44_11_.anInt516 * -1371118717;
						int i_12_ = 1148204561 * class44_11_.anInt517;
						anInt10693 = -1546476335 * (i_12_ >> 16 & 0xff);
						anIntArray10696[0] = class44_11_.anInt518 * -1485991535;
						anIntArray10696[1] = class44_11_.anInt519 * -355001951;
					}
					Class44 class44_13_ = (Class44) hashmap.get(Integer.valueOf(-2147483647));
					if (class44_13_ != null)
						anIntArray10696[2] = -355001951 * class44_13_.anInt519;
					RSByteBuffer class536_sub33 = new RSByteBuffer(49);
					for (int i_14_ = -2147483646; i_14_ <= -2147483644; i_14_++) {
						Class44 class44_15_ = (Class44) hashmap.get(Integer.valueOf(i_14_));
						if (null != class44_15_) {
							class536_sub33.writeLEInt((class44_15_.anInt516 * -400390609), 283029958);
							class536_sub33.writeLEInt((class44_15_.anInt517 * 1148204561), 1009401012);
							class536_sub33.writeLEInt((class44_15_.anInt518 * -1485991535), -182081702);
							class536_sub33.writeLEInt((-355001951 * class44_15_.anInt519), 950629539);
						}
					}
					class536_sub33.off = 0;
					aString10673 = class536_sub33.readString();
				}
				String[][] strings = HardwareInfo.getDXDiagDisplayDevicesProps();
				if (null != strings && strings.length > 0 && strings[0] != null) {
					for (int i_16_ = 0; i_16_ < strings[0].length; i_16_ += 2) {
						if (strings[0][i_16_].equalsIgnoreCase("szDescription"))
							aString10648 = strings[0][i_16_ + 1];
						else if (strings[0][i_16_].equalsIgnoreCase("szDriverDateEnglish")) {
							String string = strings[0][1 + i_16_];
							try {
								int i_17_ = string.indexOf("/");
								int i_18_ = string.indexOf("/", 1 + i_17_);
								anInt10691 = ((Integer.parseInt(string.substring(0, i_17_))) * 1343236853);
								anInt10680 = ((Integer.parseInt(string.substring(1 + i_18_, string.indexOf(" ", i_18_)))) * -703048851);
							} catch (Exception exception) {
								/* empty */
							}
						}
					}
				}
				String[] strings_19_ = HardwareInfo.getDXDiagSystemProps();
				if (null != strings_19_) {
					String string = "";
					String string_20_ = "";
					String string_21_ = "";
					for (int i_22_ = 0; i_22_ < strings_19_.length; i_22_ += 2) {
						if (strings_19_[i_22_].equalsIgnoreCase("dwDirectXVersionMajor"))
							string = strings_19_[1 + i_22_];
						else if (strings_19_[i_22_].equalsIgnoreCase("dwDirectXVersionMinor"))
							string_20_ = strings_19_[1 + i_22_];
						else if (strings_19_[i_22_].equalsIgnoreCase("dwDirectXVersionLetter"))
							string_21_ = strings_19_[i_22_ + 1];
					}
					aString10688 = new StringBuilder().append(string).append(".").append(string_20_).append(string_21_).toString();
				}
			} catch (Throwable throwable) {
				anInt10684 = 0;
			}
		}
		if (null == aString10648)
			aString10648 = "";
		if (aString10687 == null)
			aString10687 = "";
		if (null == aString10688)
			aString10688 = "";
		if (aString10689 == null)
			aString10689 = "";
		if (null == aString10694)
			aString10694 = "";
		if (aString10673 == null)
			aString10673 = "";
		if (null == aString10698)
			aString10698 = "";
		method9821(307416230);
	}

	void method9821(int i) {
		if (aString10648.length() > 40)
			aString10648 = aString10648.substring(0, 40);
		if (aString10687.length() > 40)
			aString10687 = aString10687.substring(0, 40);
		if (aString10688.length() > 10)
			aString10688 = aString10688.substring(0, 10);
		if (aString10689.length() > 10)
			aString10689 = aString10689.substring(0, 10);
		if (aString10698.length() > 120)
			aString10698 = aString10698.substring(0, 120);
	}

	public void method9822(RSByteBuffer class536_sub33, int i) {
		class536_sub33.writeByte(7);
		class536_sub33.writeByte(anInt10650 * 1780534881);
		class536_sub33.writeByte(aBool10683 ? 1 : 0);
		class536_sub33.writeByte(anInt10667 * 560694841);
		class536_sub33.writeByte(anInt10675 * -1728248347);
		class536_sub33.writeByte(anInt10676 * 982781675);
		class536_sub33.writeByte(-2137697537 * anInt10677);
		class536_sub33.writeByte(anInt10678 * -735080333);
		class536_sub33.writeByte(aBool10674 ? 1 : 0);
		class536_sub33.writeShort(1203606065 * anInt10647, -1778059594);
		class536_sub33.writeByte(-823027809 * anInt10695);
		class536_sub33.write24BitInt(-853108975 * anInt10684, 1085042331);
		class536_sub33.writeShort(anInt10685 * -42614869, -1778059594);
		class536_sub33.method9785(aString10648, (byte) 113);
		class536_sub33.method9785(aString10687, (byte) 66);
		class536_sub33.method9785(aString10688, (byte) 126);
		class536_sub33.method9785(aString10689, (byte) 29);
		class536_sub33.writeByte(-795233955 * anInt10691);
		class536_sub33.writeShort(-1952469403 * anInt10680, -1778059594);
		class536_sub33.method9785(aString10694, (byte) 25);
		class536_sub33.method9785(aString10673, (byte) 72);
		class536_sub33.writeByte(-1081306583 * anInt10656);
		class536_sub33.writeByte(-2064370639 * anInt10693);
		for (int i_23_ = 0; i_23_ < anIntArray10696.length; i_23_++)
			class536_sub33.writeInt(anIntArray10696[i_23_]);
		class536_sub33.writeInt(1465177829 * anInt10658);
		class536_sub33.method9785(aString10698, (byte) 66);
	}

	public int method9823(int i) {
		int i_24_ = 38;
		i_24_ += Class612.method7315(aString10648, -1311964413);
		i_24_ += Class612.method7315(aString10687, -1311964413);
		i_24_ += Class612.method7315(aString10688, -1311964413);
		i_24_ += Class612.method7315(aString10689, -1311964413);
		i_24_ += Class612.method7315(aString10694, -1311964413);
		i_24_ += Class612.method7315(aString10673, -1311964413);
		i_24_ += Class612.method7315(aString10698, -1311964413);
		return i_24_;
	}

	public void method9824(RSByteBuffer class536_sub33) {
		class536_sub33.writeByte(7);
		class536_sub33.writeByte(anInt10650 * 1780534881);
		class536_sub33.writeByte(aBool10683 ? 1 : 0);
		class536_sub33.writeByte(anInt10667 * 560694841);
		class536_sub33.writeByte(anInt10675 * -1728248347);
		class536_sub33.writeByte(anInt10676 * 982781675);
		class536_sub33.writeByte(-2137697537 * anInt10677);
		class536_sub33.writeByte(anInt10678 * -735080333);
		class536_sub33.writeByte(aBool10674 ? 1 : 0);
		class536_sub33.writeShort(1203606065 * anInt10647, -1778059594);
		class536_sub33.writeByte(-823027809 * anInt10695);
		class536_sub33.write24BitInt(-853108975 * anInt10684, 878874199);
		class536_sub33.writeShort(anInt10685 * -42614869, -1778059594);
		class536_sub33.method9785(aString10648, (byte) 24);
		class536_sub33.method9785(aString10687, (byte) 102);
		class536_sub33.method9785(aString10688, (byte) 107);
		class536_sub33.method9785(aString10689, (byte) 125);
		class536_sub33.writeByte(-795233955 * anInt10691);
		class536_sub33.writeShort(-1952469403 * anInt10680, -1778059594);
		class536_sub33.method9785(aString10694, (byte) 17);
		class536_sub33.method9785(aString10673, (byte) 56);
		class536_sub33.writeByte(-1081306583 * anInt10656);
		class536_sub33.writeByte(-2064370639 * anInt10693);
		for (int i = 0; i < anIntArray10696.length; i++)
			class536_sub33.writeInt(anIntArray10696[i]);
		class536_sub33.writeInt(1465177829 * anInt10658);
		class536_sub33.method9785(aString10698, (byte) 2);
	}

	public int method9825() {
		int i = 38;
		i += Class612.method7315(aString10648, -1311964413);
		i += Class612.method7315(aString10687, -1311964413);
		i += Class612.method7315(aString10688, -1311964413);
		i += Class612.method7315(aString10689, -1311964413);
		i += Class612.method7315(aString10694, -1311964413);
		i += Class612.method7315(aString10673, -1311964413);
		i += Class612.method7315(aString10698, -1311964413);
		return i;
	}

	public int method9826() {
		int i = 38;
		i += Class612.method7315(aString10648, -1311964413);
		i += Class612.method7315(aString10687, -1311964413);
		i += Class612.method7315(aString10688, -1311964413);
		i += Class612.method7315(aString10689, -1311964413);
		i += Class612.method7315(aString10694, -1311964413);
		i += Class612.method7315(aString10673, -1311964413);
		i += Class612.method7315(aString10698, -1311964413);
		return i;
	}

	public void method9827(RSByteBuffer class536_sub33) {
		class536_sub33.writeByte(7);
		class536_sub33.writeByte(anInt10650 * 1780534881);
		class536_sub33.writeByte(aBool10683 ? 1 : 0);
		class536_sub33.writeByte(anInt10667 * 560694841);
		class536_sub33.writeByte(anInt10675 * -1728248347);
		class536_sub33.writeByte(anInt10676 * 982781675);
		class536_sub33.writeByte(-2137697537 * anInt10677);
		class536_sub33.writeByte(anInt10678 * -735080333);
		class536_sub33.writeByte(aBool10674 ? 1 : 0);
		class536_sub33.writeShort(1203606065 * anInt10647, -1778059594);
		class536_sub33.writeByte(-823027809 * anInt10695);
		class536_sub33.write24BitInt(-853108975 * anInt10684, 1786818698);
		class536_sub33.writeShort(anInt10685 * -42614869, -1778059594);
		class536_sub33.method9785(aString10648, (byte) 28);
		class536_sub33.method9785(aString10687, (byte) 1);
		class536_sub33.method9785(aString10688, (byte) 11);
		class536_sub33.method9785(aString10689, (byte) 66);
		class536_sub33.writeByte(-795233955 * anInt10691);
		class536_sub33.writeShort(-1952469403 * anInt10680, -1778059594);
		class536_sub33.method9785(aString10694, (byte) 102);
		class536_sub33.method9785(aString10673, (byte) 112);
		class536_sub33.writeByte(-1081306583 * anInt10656);
		class536_sub33.writeByte(-2064370639 * anInt10693);
		for (int i = 0; i < anIntArray10696.length; i++)
			class536_sub33.writeInt(anIntArray10696[i]);
		class536_sub33.writeInt(1465177829 * anInt10658);
		class536_sub33.method9785(aString10698, (byte) 45);
	}

	public int method9828() {
		int i = 38;
		i += Class612.method7315(aString10648, -1311964413);
		i += Class612.method7315(aString10687, -1311964413);
		i += Class612.method7315(aString10688, -1311964413);
		i += Class612.method7315(aString10689, -1311964413);
		i += Class612.method7315(aString10694, -1311964413);
		i += Class612.method7315(aString10673, -1311964413);
		i += Class612.method7315(aString10698, -1311964413);
		return i;
	}

	public int method9829() {
		int i = 38;
		i += Class612.method7315(aString10648, -1311964413);
		i += Class612.method7315(aString10687, -1311964413);
		i += Class612.method7315(aString10688, -1311964413);
		i += Class612.method7315(aString10689, -1311964413);
		i += Class612.method7315(aString10694, -1311964413);
		i += Class612.method7315(aString10673, -1311964413);
		i += Class612.method7315(aString10698, -1311964413);
		return i;
	}

	static final void method9830(Class668 class668, int i) {
		int i_25_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_25_);
		Class234 class234 = Class463.aClass234Array5227[i_25_ >> 16];
		Class198.method2873(class251, class234, class668, Class233.aClass233_2371, (byte) -69);
	}
}
