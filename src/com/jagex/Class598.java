/* Class598 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class598 {
	public int anInt7838;
	public int anInt7839;
	public int anInt7840;
	public static boolean aBool7841;

	public int method7142() {
		return (-1551431315 * anInt7838 << 28 | 1858049507 * anInt7839 << 14 | anInt7840 * 1479112045);
	}

	public String method7143() {
		return new StringBuilder().append(anInt7838 * -1551431315).append(",").append(anInt7839 * 1858049507 >> 6).append(",").append(anInt7840 * 1479112045 >> 6).append(",").append(anInt7839 * 1858049507 & 0x3f).append(",").append(anInt7840 * 1479112045 & 0x3f).toString();
	}

	public int hashCode() {
		return method7145((byte) -43);
	}

	public void method7144(Class536_Sub30 class536_sub30, int i) {
		anInt7838 = -1168251639 * class536_sub30.anInt10565;
		anInt7839 = (2135129199 * class536_sub30.anInt10568 >> 9) * -1634969653;
		anInt7840 = 734518373 * (class536_sub30.anInt10567 * -1369836225 >> 9);
	}

	public int method7145(byte i) {
		return (-1551431315 * anInt7838 << 28 | 1858049507 * anInt7839 << 14 | anInt7840 * 1479112045);
	}

	public Class598() {
		anInt7838 = -492398693;
	}

	public Class598(int i) {
		if (-1 == i)
			anInt7838 = -492398693;
		else {
			anInt7838 = 492398693 * (i >> 28 & 0x3);
			anInt7839 = -1634969653 * (i >> 14 & 0x3fff);
			anInt7840 = (i & 0x3fff) * 734518373;
		}
	}

	public String method7146() {
		return new StringBuilder().append(anInt7838 * -1551431315).append(",").append(anInt7839 * 1858049507 >> 6).append(",").append(anInt7840 * 1479112045 >> 6).append(",").append(anInt7839 * 1858049507 & 0x3f).append(",").append(anInt7840 * 1479112045 & 0x3f).toString();
	}

	public String toString() {
		return new StringBuilder().append(anInt7838 * -1551431315).append(",").append(anInt7839 * 1858049507 >> 6).append(",").append(anInt7840 * 1479112045 >> 6).append(",").append(anInt7839 * 1858049507 & 0x3f).append(",").append(anInt7840 * 1479112045 & 0x3f).toString();
	}

	public boolean method7147(Object object) {
		if (this == object)
			return true;
		if (!(object instanceof Class598))
			return false;
		return method7152((Class598) object, (byte) 6);
	}

	public Class598(int i, int i_0_, int i_1_) {
		anInt7838 = 492398693 * i;
		anInt7839 = -1634969653 * i_0_;
		anInt7840 = i_1_ * 734518373;
	}

	public boolean method7148(Object object) {
		if (this == object)
			return true;
		if (!(object instanceof Class598))
			return false;
		return method7152((Class598) object, (byte) 79);
	}

	public String method7149() {
		return new StringBuilder().append(anInt7838 * -1551431315).append(",").append(anInt7839 * 1858049507 >> 6).append(",").append(anInt7840 * 1479112045 >> 6).append(",").append(anInt7839 * 1858049507 & 0x3f).append(",").append(anInt7840 * 1479112045 & 0x3f).toString();
	}

	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (!(object instanceof Class598))
			return false;
		return method7152((Class598) object, (byte) 87);
	}

	public int method7150() {
		return method7145((byte) -2);
	}

	public int method7151() {
		return method7145((byte) 97);
	}

	boolean method7152(Class598 class598_2_, byte i) {
		if (-1551431315 * anInt7838 != -1551431315 * class598_2_.anInt7838)
			return false;
		if (1858049507 * anInt7839 != 1858049507 * class598_2_.anInt7839)
			return false;
		if (1479112045 * class598_2_.anInt7840 != 1479112045 * anInt7840)
			return false;
		return true;
	}

	static void method7153(Class668 class668, byte i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		TwitchWebcamDevice twitchwebcamdevice = Class521_Sub3.method9344(string, 650090934);
		if (twitchwebcamdevice == null) {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
		} else {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1043008323 * twitchwebcamdevice.anInt1127;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = twitchwebcamdevice.aString1125;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = twitchwebcamdevice.aString1126;
		}
	}

	static final void method7154(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class329.aClass550_3601.method6652(427110908) ? 1 : 0;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class329.aClass550_3601.method6653((byte) 0) ? 1 : 0;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class329.aClass550_3601.method6664((byte) -51) ? 1 : 0;
	}
}
