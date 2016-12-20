/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class15 {
	public static final int anInt189 = 5;

	Class15() throws Throwable {
		throw new Error();
	}

	public static int method735(int i, byte i_0_) {
		int i_1_ = 0;
		if (i < 0 || i >= 65536) {
			i >>>= 16;
			i_1_ += 16;
		}
		if (i >= 256) {
			i >>>= 8;
			i_1_ += 8;
		}
		if (i >= 16) {
			i >>>= 4;
			i_1_ += 4;
		}
		if (i >= 4) {
			i >>>= 2;
			i_1_ += 2;
		}
		if (i >= 1) {
			i >>>= 1;
			i_1_++;
		}
		return i + i_1_;
	}

	static final void method736(Class243 class243, Class665 class665, int i) {
		class665.anInt8526 -= 307142523;
		int i_2_ = class665.anIntArray8525[1769813785 * class665.anInt8526] - 1;
		int i_3_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		int i_4_ = class665.anIntArray8525[2 + class665.anInt8526 * 1769813785];
		if (i_2_ < 0 || i_2_ > 9)
			throw new RuntimeException();
		Class208_Sub22.method15640(class243, i_2_, i_3_, i_4_, class665, 235456775);
	}

	static final String method737(int i, int i_5_) {
		String string = Integer.toString(i);
		for (int i_6_ = string.length() - 3; i_6_ > 0; i_6_ -= 3)
			string = new StringBuilder().append(string.substring(0, i_6_)).append(Class33.aString325).append(string.substring(i_6_)).toString();
		if (string.length() > 9)
			return new StringBuilder().append(" ").append(Class232.method4330(65408, 2139159500)).append(string.substring(0, string.length() - 8)).append(Class53.aClass53_527.method1290((Class144_Sub1.aClass671_8995), (byte) -75)).append(" (").append(string).append(")").append(Class33.aString330).toString();
		if (string.length() > 6)
			return new StringBuilder().append(" ").append(Class232.method4330(16777215, 594540342)).append(string.substring(0, string.length() - 4)).append(Class53.aClass53_673.method1290((Class144_Sub1.aClass671_8995), (byte) -58)).append(" (").append(string).append(")").append(Class33.aString330).toString();
		return new StringBuilder().append(" ").append(Class232.method4330(16776960, 1209120335)).append(string).append(Class33.aString330).toString();
	}

	static void method738(int i, int i_7_, Class243 class243, byte i_8_) {
		int i_9_ = class243.anInt2511 * -1054537975 + i;
		int i_10_ = 15 + i_7_;
		if (client.aBool11022) {
			int i_11_ = -256;
			if (-1176934951 * client.anInt7014 < 20)
				i_11_ = -65536;
			Class85.aClass174_819.method2744(new StringBuilder().append("Fps:").append(-1176934951 * client.anInt7014).append(" (").append(client.anInt7016 * -961466639).append(" ms)").toString(), i_9_, i_10_, i_11_, -1, -462286101);
			i_10_ += 15;
			Runtime runtime = Runtime.getRuntime();
			long l = runtime.totalMemory() / 1024L;
			long l_12_ = l - runtime.freeMemory() / 1024L;
			int i_13_ = -256;
			if (l_12_ > 262144L)
				i_13_ = -65536;
			Class85.aClass174_819.method2744(new StringBuilder().append("Mem:").append(l_12_).append("/").append(l).append("k").toString(), i_9_, i_10_, i_13_, -1, -483898158);
			i_10_ += 15;
			long l_14_ = client.aClass109_11067.aClass44_1379.method1185(-910519931);
			String string = "N/A";
			if (-1L != l_14_) {
				string = new StringBuilder().append(l_14_).append("ms").toString();
				if (l_14_ > 500L)
					string = new StringBuilder().append(Class232.method4330(16711680, 446418085)).append(string).append(Class232.method4330(16776960, 1612820062)).toString();
			}
			Class85.aClass174_819.method2744(new StringBuilder().append("Game: In:").append(1326507517 * client.aClass109_11067.anInt1374).append("B/s ").append("Out:").append(1257959601 * client.aClass109_11067.anInt1373).append("B/s ").append("Ping:").append(string).toString(), i_9_, i_10_, -256, -1, -1963275244);
			i_10_ += 15;
			long l_15_ = client.aClass109_11066.aClass44_1379.method1185(-910519931);
			String string_16_ = "N/A";
			if (-1L != l_15_) {
				string_16_ = new StringBuilder().append(l_15_).append("ms").toString();
				if (l_15_ > 500L)
					string_16_ = new StringBuilder().append(Class232.method4330(16711680, 1222786472)).append(string_16_).append(Class232.method4330(16776960, 1654776548)).toString();
			}
			Class85.aClass174_819.method2744(new StringBuilder().append("Lobby: In:").append(client.aClass109_11066.anInt1374 * 1326507517).append("B/s ").append("Out:").append(1257959601 * client.aClass109_11066.anInt1373).append("B/s ").append("Ping:").append(string_16_).toString(), i_9_, i_10_, -256, -1, -369104001);
			i_10_ += 15;
			int i_17_ = Class402.aClass180_4150.method3304() / 1024;
			Class85.aClass174_819.method2744(new StringBuilder().append("Offheap:").append(i_17_).append("k").toString(), i_9_, i_10_, i_17_ > 65536 ? -65536 : -256, -1, -1413753148);
			i_10_ += 15;
			int i_18_ = 0;
			int i_19_ = 0;
			int i_20_ = 0;
			for (int i_21_ = 0; i_21_ < Class711.aClass457_Sub1Array8857.length; i_21_++) {
				if (Class711.aClass457_Sub1Array8857[i_21_] != null && Class711.aClass457_Sub1Array8857[i_21_].method15883(1612000780)) {
					i_18_ += Class711.aClass457_Sub1Array8857[i_21_].method15879(-945537161);
					i_19_ += Class711.aClass457_Sub1Array8857[i_21_].method15914((byte) -104);
					i_20_ += Class711.aClass457_Sub1Array8857[i_21_].method15884((byte) -77);
				}
			}
			int i_22_ = 0 == i_18_ ? 0 : i_20_ * 100 / i_18_;
			int i_23_ = i_18_ == 0 ? 0 : 10000 * i_19_ / i_18_;
			String string_24_ = new StringBuilder().append("Cache:").append(Class683.method13911((long) i_23_, 2, true, Class671.aClass671_8572, -1935294771)).append("% (").append(i_22_).append("%)").toString();
			Class24_Sub9.aClass174_10977.method2744(string_24_, i_9_, i_10_, -256, -1, -395244366);
			i_10_ += 12;
		}
	}

	public static final void method739(String string, int i) {
		if (null != string) {
			String string_25_ = Class641.method10704(string, Class242.aClass91_2471, -2105391186);
			if (string_25_ != null) {
				for (int i_26_ = 0; i_26_ < client.anInt11261 * -67152419; i_26_++) {
					Class69 class69 = client.aClass69Array11297[i_26_];
					String string_27_ = class69.aString776;
					String string_28_ = Class641.method10704(string_27_, Class242.aClass91_2471, -2098719147);
					if (Class519.method8660(string, string_25_, string_27_, string_28_, (short) 12009)) {
						client.anInt11261 -= 610118261;
						for (int i_29_ = i_26_; i_29_ < client.anInt11261 * -67152419; i_29_++)
							client.aClass69Array11297[i_29_] = client.aClass69Array11297[1 + i_29_];
						client.anInt11047 = client.anInt11221 * -97421591;
						Class109 class109 = Class203.method3782((byte) -1);
						Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4459, class109.aClass2_1367, (byte) 77);
						class527_sub15.buffer.writeByte(Class208_Sub18.method15632(string, (byte) -24), -1694680286);
						class527_sub15.buffer.writeString(string, -180733021);
						class109.method1969(class527_sub15, (byte) 1);
						break;
					}
				}
			}
		}
	}

	static final void method740(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class665.aClass640_Sub1_Sub5_Sub1_8540.method17049((byte) -19);
	}

	static final void method741(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		int i_30_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_31_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		if (!Class157.method2559(string.charAt(0), (byte) 41))
			throw new RuntimeException();
		if (string.isEmpty() || string.length() > 10)
			throw new RuntimeException();
		if (!Class420.aClass273_4591.method5103(string, i_30_, i_31_, 1575895692))
			throw new RuntimeException();
	}
}
