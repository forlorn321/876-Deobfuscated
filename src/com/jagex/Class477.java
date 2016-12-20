/* Class477 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Desktop;
import java.net.URI;

public class Class477 {
	int anInt5384;
	boolean aBool5385;
	Class494 this$0;
	int anInt5386;
	RSByteBuffer aClass527_Sub38_5387;
	static int anInt5388;

	void method7774() {
		if (null != aClass527_Sub38_5387 && !aBool5385)
			aClass527_Sub38_5387.method16599((byte) 124);
		anInt5384 = -613641665;
		anInt5386 = 633303233;
	}

	void method7775(int i) {
		if (null != aClass527_Sub38_5387 && !aBool5385)
			aClass527_Sub38_5387.method16599((byte) 121);
		anInt5384 = -613641665;
		anInt5386 = 633303233;
	}

	void method7776() {
		if (null != aClass527_Sub38_5387 && !aBool5385)
			aClass527_Sub38_5387.method16599((byte) 108);
		anInt5384 = -613641665;
		anInt5386 = 633303233;
	}

	void method7777() {
		if (null != aClass527_Sub38_5387 && !aBool5385)
			aClass527_Sub38_5387.method16599((byte) 109);
		anInt5384 = -613641665;
		anInt5386 = 633303233;
	}

	void method7778() {
		if (null != aClass527_Sub38_5387 && !aBool5385)
			aClass527_Sub38_5387.method16599((byte) 122);
		anInt5384 = -613641665;
		anInt5386 = 633303233;
	}

	Class477(Class494 class494, RSByteBuffer class527_sub38, boolean bool) {
		this$0 = class494;
		aClass527_Sub38_5387 = class527_sub38;
		aBool5385 = bool;
		anInt5384 = -613641665;
		anInt5386 = 633303233;
	}

	void method7779() {
		if (null != aClass527_Sub38_5387 && !aBool5385)
			aClass527_Sub38_5387.method16599((byte) 116);
		anInt5384 = -613641665;
		anInt5386 = 633303233;
	}

	public static void method7780(String string, boolean bool, String string_0_, boolean bool_1_, byte i) {
		if (bool) {
			do {
				if (!bool_1_ && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
					try {
						Desktop.getDesktop().browse(new URI(string));
					} catch (Exception exception) {
						break;
					}
					return;
				}
			} while (false);
			if (Class508.aString6922.startsWith("win") && !bool_1_)
				Class291.method5257(string, 0, -1897325367);
			else if (Class508.aString6922.startsWith("mac"))
				Class282.method5194(string, 1, string_0_, (byte) 64);
			else
				Class291.method5257(string, 2, 1895575297);
		} else
			Class291.method5257(string, 3, -236488025);
	}

	static final void method7781(Class665 class665, int i) {
		Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) class665.aClass640_Sub1_Sub2_Sub1_8522);
		String string = class640_sub1_sub2_sub1_sub1.aString12169;
		Class295 class295 = class640_sub1_sub2_sub1_sub1.aClass295_12168;
		if (class295.anIntArray3312 != null) {
			class295 = class295.method5314(Class671.aClass97_8584, Class671.aClass97_8584, -358891810);
			if (null == class295)
				string = "";
			else
				string = class295.aString3279;
		}
		if (null == string)
			string = "";
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = string;
	}

	static final void method7782(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -1;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -1;
	}

	static final void method7783(Class243[] class243s, int i, int i_2_) {
		for (int i_3_ = 0; i_3_ < class243s.length; i_3_++) {
			Class243 class243 = class243s[i_3_];
			if (class243 != null && class243.anInt2536 * -1774688479 == i && !client.method17449(class243)) {
				if (0 == class243.anInt2501 * -270144907) {
					method7783(class243s, class243.anInt2504 * -254728301, 110323932);
					if (null != class243.aClass243Array2666)
						method7783(class243.aClass243Array2666, class243.anInt2504 * -254728301, 110323932);
					Class527_Sub41 class527_sub41 = ((Class527_Sub41) (client.aClass14_11276.method709((long) (-254728301 * class243.anInt2504))));
					if (null != class527_sub41)
						Class706.method14353((1307137747 * class527_sub41.anInt10752), -1153265395);
				}
				if (6 == -270144907 * class243.anInt2501 && -19060959 * class243.anInt2663 != -1) {
					if (class243.aClass695_2664 == null) {
						class243.aClass695_2664 = new Class695_Sub1();
						class243.aClass695_2664.method14165((class243.anInt2663 * -19060959), (byte) 55);
					}
					if (class243.aClass695_2664.method14187((-2132013331 * (client.anInt11108)), -487624735) && class243.aClass695_2664.method14177(375755918))
						class243.aClass695_2664.method14179(-1084475504);
				}
			}
		}
	}

	static final void method7784(Class665 class665, int i) {
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class115.method2025(Class66.method1470((class665.anIntArray8525[((class665.anInt8526 -= 102380841) * 1769813785)]), 1620175916), Class144_Sub1.aClass671_8995.method87(), 731263237);
	}
}
