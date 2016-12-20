/* Class208_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class208_Sub6 extends Class208 {
	Class483 aClass483_9889;
	int anInt9890;
	int anInt9891;
	int anInt9892;
	int anInt9893;

	void method3854() {
		if (null != aClass483_9889) {
			aClass483_9889.method7864(50, (byte) 6);
			Class245.aClass226_2698.method4215(aClass483_9889, (byte) -1);
			aClass483_9889 = null;
		}
	}

	public void method3851() {
		if (null != aClass483_9889)
			aClass483_9889.method7852(1969554825);
	}

	void method3850(byte i) {
		if (null != aClass483_9889) {
			aClass483_9889.method7864(50, (byte) 6);
			Class245.aClass226_2698.method4215(aClass483_9889, (byte) -1);
			aClass483_9889 = null;
		}
	}

	public void method3848() {
		if (null != aClass483_9889)
			aClass483_9889.method7852(1969554825);
	}

	Class208_Sub6(RSByteBuffer class527_sub38) {
		super(class527_sub38);
		anInt9893 = class527_sub38.readUnsignedShort() * -968124165;
		anInt9890 = class527_sub38.readUnsignedByte() * 497593041;
		anInt9891 = class527_sub38.readUnsignedByte() * -876665895;
		anInt9892 = class527_sub38.readUnsignedByte() * -1505055377;
		aClass483_9889 = Class245.aClass226_2698.method4211(Class193.aClass193_2150, this, 186036787 * anInt9893, anInt9892 * 682054031, -577114575 * anInt9890, Class206.aClass206_2228.method3836(-547026537), Class189.aClass189_2126, 0.0F, 0.0F, null, 0, anInt9891 * 1314466921, false, (byte) 98);
		if (null != aClass483_9889)
			aClass483_9889.method7851((byte) 0);
	}

	void method3852() {
		if (null != aClass483_9889) {
			aClass483_9889.method7864(50, (byte) 6);
			Class245.aClass226_2698.method4215(aClass483_9889, (byte) -1);
			aClass483_9889 = null;
		}
	}

	void method3853() {
		if (null != aClass483_9889) {
			aClass483_9889.method7864(50, (byte) 6);
			Class245.aClass226_2698.method4215(aClass483_9889, (byte) -1);
			aClass483_9889 = null;
		}
	}

	public void method3846(int i) {
		if (null != aClass483_9889)
			aClass483_9889.method7852(1969554825);
	}

	static final void method15609(int i, int i_0_) {
		client.anIntArray11149 = new int[i];
		client.anIntArray11052 = new int[i];
		client.anIntArray11151 = new int[i];
		client.anIntArray11101 = new int[i];
		client.anIntArray11104 = new int[i];
	}

	static final void method15610(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	static final void method15611(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_1_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_2_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		Class674 class674;
		if (class665.aBool8549)
			class674 = class665.aClass674_8534;
		else
			class674 = class665.aClass674_8533;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (i_2_ != -1 && class674.method13843(i_1_, i_2_, -2127130410) ? 1 : 0);
	}

	static final void method15612(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class330.method5818(class243, class240, class665, -1016164900);
	}
}
