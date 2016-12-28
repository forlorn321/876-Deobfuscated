/* Class257 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class257 implements Interface27 {
	int anInt2763;
	Class213 this$0;
	int anInt2764;
	public static Class34_Sub5 aClass34_Sub5_2765;

	public void method154(Class226 class226, short i) {
		class226.method3270(anInt2764 * 1833800925, anInt2763 * -1562736289, 1704181810);
		class226.method3227(anInt2764 * 1833800925, -781094290).method3123(368312517);
	}

	public void method155(Class226 class226) {
		class226.method3270(anInt2764 * 1833800925, anInt2763 * -1562736289, 640525319);
		class226.method3227(anInt2764 * 1833800925, -781094290).method3123(368312517);
	}

	public void method153(Class226 class226) {
		class226.method3270(anInt2764 * 1833800925, anInt2763 * -1562736289, 1237903913);
		class226.method3227(anInt2764 * 1833800925, -781094290).method3123(368312517);
	}

	Class257(Class213 class213, RSByteBuffer class536_sub33) {
		this$0 = class213;
		anInt2764 = class536_sub33.readUnsignedShort() * -1064836235;
		anInt2763 = class536_sub33.readUnsignedByte() * 1558450847;
	}

	static final void method3542(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_0_);
		Class234 class234 = Class463.aClass234Array5227[i_0_ >> 16];
		Class662.method7985(class251, class234, class668, -1498715688);
	}

	static final void method3543(Class668 class668, byte i) {
		CharSequence charsequence = ((CharSequence) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]));
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = Class629.method7500(charsequence, -994720658);
	}

	static final void method3544(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class668.aClass649_Sub1_Sub1_Sub1_8556.method9953(1596027471);
	}

	static void method3545(int i, int i_1_, IComponentDefinitions class251, byte i_2_) {
		int i_3_ = -1606950689 * class251.anInt2573 + i;
		int i_4_ = 15 + i_1_;
		if (client.aBool11314) {
			int i_5_ = -256;
			if (-311312947 * client.anInt6856 < 20)
				i_5_ = -65536;
			Class536_Sub15.aClass184_10488.method2741(new StringBuilder().append("Fps:").append(-311312947 * client.anInt6856).append(" (").append(93998629 * client.anInt6884).append(" ms)").toString(), i_3_, i_4_, i_5_, -1, -636852084);
			i_4_ += 15;
			Runtime runtime = Runtime.getRuntime();
			long l = runtime.totalMemory() / 1024L;
			long l_6_ = l - runtime.freeMemory() / 1024L;
			int i_7_ = -256;
			if (l_6_ > 262144L)
				i_7_ = -65536;
			Class536_Sub15.aClass184_10488.method2741(new StringBuilder().append("Mem:").append(l_6_).append("/").append(l).append("k").toString(), i_3_, i_4_, i_7_, -1, -1990281439);
			i_4_ += 15;
			long l_8_ = client.aClass106_11322.aClass27_1272.method747(1074553518);
			String string = "N/A";
			if (l_8_ != -1L) {
				string = new StringBuilder().append(l_8_).append("ms").toString();
				if (l_8_ > 500L)
					string = new StringBuilder().append(Class264.method3680(16711680, -1761422499)).append(string).append(Class264.method3680(16776960, -1222731397)).toString();
			}
			Class536_Sub15.aClass184_10488.method2741(new StringBuilder().append("Game: In:").append(client.aClass106_11322.anInt1269 * -1625480315).append("B/s ").append("Out:").append(-482436795 * client.aClass106_11322.anInt1273).append("B/s ").append("Ping:").append(string).toString(), i_3_, i_4_, -256, -1, -153055796);
			i_4_ += 15;
			long l_9_ = client.aClass106_11218.aClass27_1272.method747(1074553518);
			String string_10_ = "N/A";
			if (l_9_ != -1L) {
				string_10_ = new StringBuilder().append(l_9_).append("ms").toString();
				if (l_9_ > 500L)
					string_10_ = new StringBuilder().append(Class264.method3680(16711680, -1691763648)).append(string_10_).append(Class264.method3680(16776960, -1761297398)).toString();
			}
			Class536_Sub15.aClass184_10488.method2741(new StringBuilder().append("Lobby: In:").append(-1625480315 * client.aClass106_11218.anInt1269).append("B/s ").append("Out:").append(-482436795 * client.aClass106_11218.anInt1273).append("B/s ").append("Ping:").append(string_10_).toString(), i_3_, i_4_, -256, -1, -503508468);
			i_4_ += 15;
			int i_11_ = Class677.aClass167_8609.method2008() / 1024;
			Class536_Sub15.aClass184_10488.method2741(new StringBuilder().append("Offheap:").append(i_11_).append("k").toString(), i_3_, i_4_, i_11_ > 65536 ? -65536 : -256, -1, -360173563);
			i_4_ += 15;
			int i_12_ = 0;
			int i_13_ = 0;
			int i_14_ = 0;
			for (int i_15_ = 0; i_15_ < Class275.aClass459_Sub1Array3024.length; i_15_++) {
				if (Class275.aClass459_Sub1Array3024[i_15_] != null && Class275.aClass459_Sub1Array3024[i_15_].method9240(-1574978162)) {
					i_12_ += Class275.aClass459_Sub1Array3024[i_15_].method9236(653672513);
					i_13_ += Class275.aClass459_Sub1Array3024[i_15_].method9242((byte) 7);
					i_14_ += Class275.aClass459_Sub1Array3024[i_15_].method9238((byte) -36);
				}
			}
			int i_16_ = 0 == i_12_ ? 0 : 100 * i_14_ / i_12_;
			int i_17_ = i_12_ == 0 ? 0 : i_13_ * 10000 / i_12_;
			String string_18_ = new StringBuilder().append("Cache:").append(Class650.method7859((long) i_17_, 2, true, Class664.aClass664_8524, 497890603)).append("% (").append(i_16_).append("%)").toString();
			Class18.aClass184_190.method2741(string_18_, i_3_, i_4_, -256, -1, -153408222);
			i_4_ += 12;
		}
	}
}
