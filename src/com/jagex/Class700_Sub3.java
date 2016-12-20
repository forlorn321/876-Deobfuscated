/* Class700_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class700_Sub3 extends Class700 {
	static final int anInt10825 = 0;
	static final int anInt10826 = 2;

	public int method14286(int i) {
		if (i == 2)
			return 2;
		return 1;
	}

	public Class700_Sub3(Class527_Sub31 class527_sub31) {
		super(class527_sub31);
	}

	public void method16856(int i) {
		if (anInt8785 * -420933067 < 0 || -420933067 * anInt8785 > 2)
			anInt8785 = method14279((byte) -3) * -380424163;
	}

	int method14279(byte i) {
		return 0;
	}

	public int method16857() {
		return -420933067 * anInt8785;
	}

	public int method16858() {
		return -420933067 * anInt8785;
	}

	void method14284(int i, int i_0_) {
		anInt8785 = -380424163 * i;
	}

	public int method16859(int i) {
		return -420933067 * anInt8785;
	}

	public boolean method16860(byte i) {
		return true;
	}

	public void method16861() {
		if (anInt8785 * -420933067 < 0 || -420933067 * anInt8785 > 2)
			anInt8785 = method14279((byte) 37) * -380424163;
	}

	void method14287(int i) {
		anInt8785 = -380424163 * i;
	}

	void method14281(int i) {
		anInt8785 = -380424163 * i;
	}

	int method14288() {
		return 0;
	}

	public void method16862() {
		if (anInt8785 * -420933067 < 0 || -420933067 * anInt8785 > 2)
			anInt8785 = method14279((byte) -20) * -380424163;
	}

	public Class700_Sub3(int i, Class527_Sub31 class527_sub31) {
		super(i, class527_sub31);
	}

	public void method16863() {
		if (anInt8785 * -420933067 < 0 || -420933067 * anInt8785 > 2)
			anInt8785 = method14279((byte) -49) * -380424163;
	}

	public void method16864() {
		if (anInt8785 * -420933067 < 0 || -420933067 * anInt8785 > 2)
			anInt8785 = method14279((byte) 54) * -380424163;
	}

	public boolean method16865() {
		return true;
	}

	public boolean method16866() {
		return true;
	}

	public int method16867() {
		return -420933067 * anInt8785;
	}

	public int method16868() {
		return -420933067 * anInt8785;
	}

	public int method14289(int i, int i_1_) {
		if (i == 2)
			return 2;
		return 1;
	}

	public int method14285(int i) {
		if (i == 2)
			return 2;
		return 1;
	}

	static void method16869(Class180 class180, Class602 class602, int i, int i_2_, int i_3_, byte i_4_) {
		Class54 class54 = ((Class54) Class346.aClass24_Sub8_3731.method81(624402131 * class602.anInt7909, 1335404726));
		if (1725725845 * class54.anInt705 != -1) {
			if (class602.aBool7910) {
				i += class602.anInt7877 * -1839961413;
				i &= 0x3;
			} else
				i = 0;
			Class147 class147 = class54.method1293(class180, i, class602.aBool7912, (byte) 54);
			if (class147 != null) {
				int i_5_ = -49406469 * class602.anInt7874;
				int i_6_ = class602.anInt7891 * 1481957615;
				if ((i & 0x1) == 1) {
					i_5_ = class602.anInt7891 * 1481957615;
					i_6_ = class602.anInt7874 * -49406469;
				}
				int i_7_ = class147.method42();
				int i_8_ = class147.method2410();
				if (class54.aBool704) {
					i_7_ = 4 * i_5_;
					i_8_ = i_6_ * 4;
				}
				if (0 != 1932916921 * class54.anInt706)
					class147.method2419(i_2_, i_3_ - 4 * (i_6_ - 1), i_7_, i_8_, 0, (~0xffffff | class54.anInt706 * 1932916921), 1);
				else
					class147.method2418(i_2_, i_3_ - 4 * (i_6_ - 1), i_7_, i_8_);
			}
		}
	}
}
