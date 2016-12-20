/* Class639 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public abstract class Class639 {
	long aLong8322;
	long aLong8323;
	Class694 aClass694_8324 = new Class694();
	int anInt8325;
	int anInt8326;
	static int anInt8327;

	abstract boolean method10577(int i);

	void method10578(int i) {
		if (method10577(1826772823)) {
			Class527_Sub15 class527_sub15 = null;
			int i_0_ = 0;
			int i_1_ = 0;
			int i_2_ = 0;
			Iterator iterator = aClass694_8324.iterator();
			while (iterator.hasNext()) {
				Class527_Sub34 class527_sub34 = (Class527_Sub34) iterator.next();
				if (class527_sub15 != null && ((class527_sub15.buffer.anInt10689 * -441238943) - i_0_ >= 252 - (6 + method10580(47673585))))
					break;
				class527_sub34.method8735(-1889161967);
				int i_3_ = class527_sub34.method16357(719777205);
				if (i_3_ < -1)
					i_3_ = -1;
				else if (i_3_ > 65534)
					i_3_ = 65534;
				int i_4_ = class527_sub34.method16356(1319623125);
				if (i_4_ < -1)
					i_4_ = -1;
				else if (i_4_ > 65534)
					i_4_ = 65534;
				if (anInt8325 * 289370887 == i_4_ && i_3_ == anInt8326 * 1814967859)
					class527_sub34.method16363(182953128);
				else {
					if (null == class527_sub15) {
						class527_sub15 = method10586(-1240481098);
						class527_sub15.buffer.writeByte(0, 119741757);
						i_0_ = (class527_sub15.buffer.anInt10689) * -441238943;
						class527_sub15.buffer.anInt10689 += -1345465534;
						i_1_ = 0;
						i_2_ = 0;
					}
					int i_5_;
					int i_6_;
					int i_7_;
					if (aLong8322 * -2812603364086814583L != -1L) {
						i_5_ = i_4_ - anInt8325 * 289370887;
						i_6_ = i_3_ - anInt8326 * 1814967859;
						i_7_ = (int) ((class527_sub34.method16359((byte) 1) - -2812603364086814583L * aLong8322) / 20L);
						i_1_ += (class527_sub34.method16359((byte) 1) - aLong8322 * -2812603364086814583L) % 20L;
					} else {
						i_5_ = i_4_;
						i_6_ = i_3_;
						i_7_ = 2147483647;
					}
					anInt8325 = i_4_ * 1669696183;
					anInt8326 = 639087867 * i_3_;
					if (i_7_ < 8 && i_5_ >= -32 && i_5_ <= 31 && i_6_ >= -32 && i_6_ <= 31) {
						i_5_ += 32;
						i_6_ += 32;
						class527_sub15.buffer.writeShort((i_5_ << 6) + (i_7_ << 12) + i_6_, 1404835786);
					} else if (i_7_ < 32 && i_5_ >= -128 && i_5_ <= 127 && i_6_ >= -128 && i_6_ <= 127) {
						i_5_ += 128;
						i_6_ += 128;
						class527_sub15.buffer.writeByte(i_7_ + 128, 881126336);
						class527_sub15.buffer.writeShort((i_5_ << 8) + i_6_, 1404835786);
					} else if (i_7_ < 32) {
						class527_sub15.buffer.writeByte(i_7_ + 192, 1414323556);
						if (-1 == i_4_ || -1 == i_3_)
							class527_sub15.buffer.writeInt(-2147483648, -1386968306);
						else
							class527_sub15.buffer.writeInt(i_4_ | i_3_ << 16, -830247477);
					} else {
						class527_sub15.buffer.writeShort((i_7_ & 0x1fff) + 57344, 1404835786);
						if (i_4_ == -1 || i_3_ == -1)
							class527_sub15.buffer.writeInt(-2147483648, 1142150094);
						else
							class527_sub15.buffer.writeInt(i_4_ | i_3_ << 16, 1520218203);
					}
					i_2_++;
					method10583(class527_sub15.buffer, class527_sub34, (byte) 0);
					aLong8322 = (class527_sub34.method16359((byte) 1) * 4226322422311194041L);
					class527_sub34.method16363(182953128);
				}
			}
			if (null != class527_sub15) {
				class527_sub15.buffer.method16534((class527_sub15.buffer.anInt10689 * -441238943) - i_0_, -1160615870);
				int i_8_ = (-441238943 * class527_sub15.buffer.anInt10689);
				class527_sub15.buffer.anInt10689 = 1474750881 * i_0_;
				class527_sub15.buffer.writeByte(i_1_ / i_2_, -1225998784);
				class527_sub15.buffer.writeByte(i_1_ % i_2_, -76485349);
				class527_sub15.buffer.anInt10689 = 1474750881 * i_8_;
				client.aClass109_11067.method1969(class527_sub15, (byte) 1);
			}
		}
		method10584(-899807796);
	}

	void method10579(int i) {
		aClass694_8324.method14105((byte) 2);
		aLong8323 = 4775478460060213657L;
		aLong8322 = -4226322422311194041L;
		anInt8325 = -1669696183;
		anInt8326 = -639087867;
	}

	abstract int method10580(int i);

	abstract boolean method10581();

	void method10582() {
		if (method10577(-1298036237)) {
			Class527_Sub15 class527_sub15 = null;
			int i = 0;
			int i_9_ = 0;
			int i_10_ = 0;
			Iterator iterator = aClass694_8324.iterator();
			while (iterator.hasNext()) {
				Class527_Sub34 class527_sub34 = (Class527_Sub34) iterator.next();
				if (class527_sub15 != null && ((class527_sub15.buffer.anInt10689 * -441238943) - i >= 252 - (6 + method10580(1810182141))))
					break;
				class527_sub34.method8735(-1889161967);
				int i_11_ = class527_sub34.method16357(719777205);
				if (i_11_ < -1)
					i_11_ = -1;
				else if (i_11_ > 65534)
					i_11_ = 65534;
				int i_12_ = class527_sub34.method16356(1319623125);
				if (i_12_ < -1)
					i_12_ = -1;
				else if (i_12_ > 65534)
					i_12_ = 65534;
				if (anInt8325 * 289370887 == i_12_ && i_11_ == anInt8326 * 1814967859)
					class527_sub34.method16363(182953128);
				else {
					if (null == class527_sub15) {
						class527_sub15 = method10586(-739994387);
						class527_sub15.buffer.writeByte(0, -2107014696);
						i = (class527_sub15.buffer.anInt10689) * -441238943;
						class527_sub15.buffer.anInt10689 += -1345465534;
						i_9_ = 0;
						i_10_ = 0;
					}
					int i_13_;
					int i_14_;
					int i_15_;
					if (aLong8322 * -2812603364086814583L != -1L) {
						i_13_ = i_12_ - anInt8325 * 289370887;
						i_14_ = i_11_ - anInt8326 * 1814967859;
						i_15_ = (int) ((class527_sub34.method16359((byte) 1) - -2812603364086814583L * aLong8322) / 20L);
						i_9_ += (class527_sub34.method16359((byte) 1) - aLong8322 * -2812603364086814583L) % 20L;
					} else {
						i_13_ = i_12_;
						i_14_ = i_11_;
						i_15_ = 2147483647;
					}
					anInt8325 = i_12_ * 1669696183;
					anInt8326 = 639087867 * i_11_;
					if (i_15_ < 8 && i_13_ >= -32 && i_13_ <= 31 && i_14_ >= -32 && i_14_ <= 31) {
						i_13_ += 32;
						i_14_ += 32;
						class527_sub15.buffer.writeShort((i_13_ << 6) + (i_15_ << 12) + i_14_, 1404835786);
					} else if (i_15_ < 32 && i_13_ >= -128 && i_13_ <= 127 && i_14_ >= -128 && i_14_ <= 127) {
						i_13_ += 128;
						i_14_ += 128;
						class527_sub15.buffer.writeByte(i_15_ + 128, -1331592854);
						class527_sub15.buffer.writeShort((i_13_ << 8) + i_14_, 1404835786);
					} else if (i_15_ < 32) {
						class527_sub15.buffer.writeByte(i_15_ + 192, -562556383);
						if (-1 == i_12_ || -1 == i_11_)
							class527_sub15.buffer.writeInt(-2147483648, -1392777212);
						else
							class527_sub15.buffer.writeInt(i_12_ | i_11_ << 16, -1729623402);
					} else {
						class527_sub15.buffer.writeShort((i_15_ & 0x1fff) + 57344, 1404835786);
						if (i_12_ == -1 || i_11_ == -1)
							class527_sub15.buffer.writeInt(-2147483648, -651840186);
						else
							class527_sub15.buffer.writeInt(i_12_ | i_11_ << 16, 467941718);
					}
					i_10_++;
					method10583(class527_sub15.buffer, class527_sub34, (byte) 0);
					aLong8322 = (class527_sub34.method16359((byte) 1) * 4226322422311194041L);
					class527_sub34.method16363(182953128);
				}
			}
			if (null != class527_sub15) {
				class527_sub15.buffer.method16534((class527_sub15.buffer.anInt10689 * -441238943) - i, 518410874);
				int i_16_ = (-441238943 * class527_sub15.buffer.anInt10689);
				class527_sub15.buffer.anInt10689 = 1474750881 * i;
				class527_sub15.buffer.writeByte(i_9_ / i_10_, -1325310856);
				class527_sub15.buffer.writeByte(i_9_ % i_10_, -2024175534);
				class527_sub15.buffer.anInt10689 = 1474750881 * i_16_;
				client.aClass109_11067.method1969(class527_sub15, (byte) 1);
			}
		}
		method10584(-899807796);
	}

	abstract void method10583(RSByteBuffer class527_sub38, Class527_Sub34 class527_sub34, byte i);

	abstract void method10584(int i);

	abstract Class527_Sub15 method10585();

	abstract Class527_Sub15 method10586(int i);

	int method10587(Class527_Sub34 class527_sub34, int i, int i_17_) {
		long l;
		if (-1L == 4809331173628796247L * aLong8323)
			l = (long) i;
		else {
			l = (class527_sub34.method16359((byte) 1) - aLong8323 * 4809331173628796247L);
			if (l > (long) i)
				l = (long) i;
		}
		aLong8323 = class527_sub34.method16359((byte) 1) * -4775478460060213657L;
		return (int) l;
	}

	abstract boolean method10588();

	abstract Class527_Sub15 method10589();

	void method10590() {
		aClass694_8324.method14105((byte) 16);
		aLong8323 = 4775478460060213657L;
		aLong8322 = -4226322422311194041L;
		anInt8325 = -1669696183;
		anInt8326 = -639087867;
	}

	void method10591() {
		aClass694_8324.method14105((byte) 51);
		aLong8323 = 4775478460060213657L;
		aLong8322 = -4226322422311194041L;
		anInt8325 = -1669696183;
		anInt8326 = -639087867;
	}

	abstract int method10592();

	abstract int method10593();

	abstract void method10594(RSByteBuffer class527_sub38, Class527_Sub34 class527_sub34);

	abstract Class527_Sub15 method10595();

	void method10596() {
		if (method10577(1472621919)) {
			Class527_Sub15 class527_sub15 = null;
			int i = 0;
			int i_18_ = 0;
			int i_19_ = 0;
			Iterator iterator = aClass694_8324.iterator();
			while (iterator.hasNext()) {
				Class527_Sub34 class527_sub34 = (Class527_Sub34) iterator.next();
				if (class527_sub15 != null && ((class527_sub15.buffer.anInt10689 * -441238943) - i >= 252 - (6 + method10580(2104695693))))
					break;
				class527_sub34.method8735(-1889161967);
				int i_20_ = class527_sub34.method16357(719777205);
				if (i_20_ < -1)
					i_20_ = -1;
				else if (i_20_ > 65534)
					i_20_ = 65534;
				int i_21_ = class527_sub34.method16356(1319623125);
				if (i_21_ < -1)
					i_21_ = -1;
				else if (i_21_ > 65534)
					i_21_ = 65534;
				if (anInt8325 * 289370887 == i_21_ && i_20_ == anInt8326 * 1814967859)
					class527_sub34.method16363(182953128);
				else {
					if (null == class527_sub15) {
						class527_sub15 = method10586(1773512733);
						class527_sub15.buffer.writeByte(0, -448481555);
						i = (class527_sub15.buffer.anInt10689) * -441238943;
						class527_sub15.buffer.anInt10689 += -1345465534;
						i_18_ = 0;
						i_19_ = 0;
					}
					int i_22_;
					int i_23_;
					int i_24_;
					if (aLong8322 * -2812603364086814583L != -1L) {
						i_22_ = i_21_ - anInt8325 * 289370887;
						i_23_ = i_20_ - anInt8326 * 1814967859;
						i_24_ = (int) ((class527_sub34.method16359((byte) 1) - -2812603364086814583L * aLong8322) / 20L);
						i_18_ += (class527_sub34.method16359((byte) 1) - aLong8322 * -2812603364086814583L) % 20L;
					} else {
						i_22_ = i_21_;
						i_23_ = i_20_;
						i_24_ = 2147483647;
					}
					anInt8325 = i_21_ * 1669696183;
					anInt8326 = 639087867 * i_20_;
					if (i_24_ < 8 && i_22_ >= -32 && i_22_ <= 31 && i_23_ >= -32 && i_23_ <= 31) {
						i_22_ += 32;
						i_23_ += 32;
						class527_sub15.buffer.writeShort((i_22_ << 6) + (i_24_ << 12) + i_23_, 1404835786);
					} else if (i_24_ < 32 && i_22_ >= -128 && i_22_ <= 127 && i_23_ >= -128 && i_23_ <= 127) {
						i_22_ += 128;
						i_23_ += 128;
						class527_sub15.buffer.writeByte(i_24_ + 128, 41891555);
						class527_sub15.buffer.writeShort((i_22_ << 8) + i_23_, 1404835786);
					} else if (i_24_ < 32) {
						class527_sub15.buffer.writeByte(i_24_ + 192, 1792741870);
						if (-1 == i_21_ || -1 == i_20_)
							class527_sub15.buffer.writeInt(-2147483648, -1173347218);
						else
							class527_sub15.buffer.writeInt(i_21_ | i_20_ << 16, 1463110795);
					} else {
						class527_sub15.buffer.writeShort((i_24_ & 0x1fff) + 57344, 1404835786);
						if (i_21_ == -1 || i_20_ == -1)
							class527_sub15.buffer.writeInt(-2147483648, -1609057429);
						else
							class527_sub15.buffer.writeInt(i_21_ | i_20_ << 16, -1787050430);
					}
					i_19_++;
					method10583(class527_sub15.buffer, class527_sub34, (byte) 0);
					aLong8322 = (class527_sub34.method16359((byte) 1) * 4226322422311194041L);
					class527_sub34.method16363(182953128);
				}
			}
			if (null != class527_sub15) {
				class527_sub15.buffer.method16534((class527_sub15.buffer.anInt10689 * -441238943) - i, -1765625582);
				int i_25_ = (-441238943 * class527_sub15.buffer.anInt10689);
				class527_sub15.buffer.anInt10689 = 1474750881 * i;
				class527_sub15.buffer.writeByte(i_18_ / i_19_, -1328150012);
				class527_sub15.buffer.writeByte(i_18_ % i_19_, 1729434172);
				class527_sub15.buffer.anInt10689 = 1474750881 * i_25_;
				client.aClass109_11067.method1969(class527_sub15, (byte) 1);
			}
		}
		method10584(-899807796);
	}

	Class639() {
		aLong8323 = 4775478460060213657L;
		aLong8322 = -4226322422311194041L;
		anInt8325 = -1669696183;
		anInt8326 = -639087867;
	}

	void method10597() {
		aClass694_8324.method14105((byte) 28);
		aLong8323 = 4775478460060213657L;
		aLong8322 = -4226322422311194041L;
		anInt8325 = -1669696183;
		anInt8326 = -639087867;
	}

	void method10598() {
		aClass694_8324.method14105((byte) 18);
		aLong8323 = 4775478460060213657L;
		aLong8322 = -4226322422311194041L;
		anInt8325 = -1669696183;
		anInt8326 = -639087867;
	}

	int method10599(Class527_Sub34 class527_sub34, int i) {
		long l;
		if (-1L == 4809331173628796247L * aLong8323)
			l = (long) i;
		else {
			l = (class527_sub34.method16359((byte) 1) - aLong8323 * 4809331173628796247L);
			if (l > (long) i)
				l = (long) i;
		}
		aLong8323 = class527_sub34.method16359((byte) 1) * -4775478460060213657L;
		return (int) l;
	}

	int method10600(Class527_Sub34 class527_sub34, int i) {
		long l;
		if (-1L == 4809331173628796247L * aLong8323)
			l = (long) i;
		else {
			l = (class527_sub34.method16359((byte) 1) - aLong8323 * 4809331173628796247L);
			if (l > (long) i)
				l = (long) i;
		}
		aLong8323 = class527_sub34.method16359((byte) 1) * -4775478460060213657L;
		return (int) l;
	}

	void method10601(Class527_Sub34 class527_sub34) {
		aClass694_8324.method14147(class527_sub34, -118484755);
	}

	void method10602(Class527_Sub34 class527_sub34) {
		aClass694_8324.method14147(class527_sub34, -1942815758);
	}

	void method10603(Class527_Sub34 class527_sub34) {
		aClass694_8324.method14147(class527_sub34, -2052211130);
	}

	abstract void method10604(RSByteBuffer class527_sub38, Class527_Sub34 class527_sub34);

	void method10605(Class527_Sub34 class527_sub34, int i) {
		aClass694_8324.method14147(class527_sub34, -1141289933);
	}

	int method10606(Class527_Sub34 class527_sub34, int i) {
		long l;
		if (-1L == 4809331173628796247L * aLong8323)
			l = (long) i;
		else {
			l = (class527_sub34.method16359((byte) 1) - aLong8323 * 4809331173628796247L);
			if (l > (long) i)
				l = (long) i;
		}
		aLong8323 = class527_sub34.method16359((byte) 1) * -4775478460060213657L;
		return (int) l;
	}

	abstract void method10607();

	abstract void method10608();

	abstract void method10609();

	static final void method10610(Class665 class665, int i) {
		Class527_Sub36 class527_sub36 = ((Class527_Sub36) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]));
		if (Class208_Sub10.aClass296_Sub1_9923.method5376((byte) 46) != Class301.aClass301_3413)
			throw new RuntimeException();
		Class327_Sub1 class327_sub1 = ((Class327_Sub1) Class208_Sub10.aClass296_Sub1_9923.method5372((byte) 0));
		class327_sub1.method15702(class527_sub36, 1510540095);
		client.aBool11119 = true;
	}

	static final void method10611(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub2_10596.method16853((byte) 66);
	}
}
