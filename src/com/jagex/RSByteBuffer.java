/* Class536_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.math.BigInteger;

public class RSByteBuffer extends Class536 {
	public static long[] aLongArray10595;
	public int off;
	static int[] anIntArray10597 = new int[256];
	public byte[] buffer;

	public RSByteBuffer(byte[] is) {
		buffer = is;
		off = 0;
	}

	public void method9685(int i) {
		if (null != buffer)
			Class705.method8270(buffer, 1184229658);
		buffer = null;
	}

	int method9686(int i) {
		int i_0_ = buffer[(off += 516175515) * -810172525 - 1];
		int i_1_ = 0;
		for (/**/; i_0_ < 0; i_0_ = buffer[(off += 516175515) * -810172525 - 1])
			i_1_ = (i_1_ | i_0_ & 0x7f) << 7;
		return i_1_ | i_0_;
	}

	public void writeShort(int i, int i_2_) {
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 8);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) i;
	}

	public void writeShortLE(int i, int i_3_) {
		buffer[(off += 516175515) * -810172525 - 1] = (byte) i;
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 8);
	}

	public void write24BitInt(int i, int i_4_) {
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 16);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 8);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) i;
	}

	public int method9690(int i) {
		int i_5_ = buffer[off * -810172525] & 0xff;
		if (i_5_ < 128)
			return readUnsignedByte(-761215470);
		return readUnsignedShort((short) 2254) - 32768;
	}

	public void writeLEInt(int i, int i_6_) {
		buffer[(off += 516175515) * -810172525 - 1] = (byte) i;
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 8);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 16);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 24);
	}

	public void method9692(long l) {
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (int) (l >> 40);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (int) (l >> 32);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (int) (l >> 24);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (int) (l >> 16);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (int) (l >> 8);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (int) l;
	}

	public void method9693(long l) {
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (int) (l >> 56);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (int) (l >> 48);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (int) (l >> 40);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (int) (l >> 32);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (int) (l >> 24);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (int) (l >> 16);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (int) (l >> 8);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (int) l;
	}

	public void method9694(long l, int i, int i_7_) {
		if (--i < 0 || i > 7)
			throw new IllegalArgumentException();
		for (int i_8_ = 8 * i; i_8_ >= 0; i_8_ -= 8)
			buffer[(off += 516175515) * -810172525 - 1] = (byte) (int) (l >> i_8_);
	}

	public String method9695(byte i) {
		int i_9_ = off * -810172525;
		while (buffer[(off += 516175515) * -810172525 - 1] != 0) {
			/* empty */
		}
		int i_10_ = off * -810172525 - i_9_ - 1;
		if (i_10_ == 0)
			return "";
		return Class202.method2925(buffer, i_9_, i_10_, -1694498816);
	}

	public void method9696(byte[] is, int i, int i_11_, byte i_12_) {
		for (int i_13_ = i; i_13_ < i_11_ + i; i_13_++)
			buffer[(off += 516175515) * -810172525 - 1] = is[i_13_];
	}

	public int method9697(int i) {
		off += 2064702060;
		return ((buffer[-810172525 * off - 4] & 0xff) + (((buffer[off * -810172525 - 2] & 0xff) << 16) + ((buffer[off * -810172525 - 1] & 0xff) << 24) + ((buffer[-810172525 * off - 3] & 0xff) << 8)));
	}

	public void method9698(int i, int i_14_) {
		if (i < 0 || i > 65535)
			throw new IllegalArgumentException();
		buffer[-810172525 * off - i - 2] = (byte) (i >> 8);
		buffer[-810172525 * off - i - 1] = (byte) i;
	}

	public void method9699(int i, int i_15_) {
		if (i < 0 || i > 255)
			throw new IllegalArgumentException();
		buffer[off * -810172525 - i - 1] = (byte) i;
	}

	public void method9700(int i, byte i_16_) {
		if (i < 64 && i >= -64)
			writeByte(i + 64, 465637339);
		else if (i < 16384 && i >= -16384)
			writeShort(i + 49152, -1778059594);
		else
			throw new IllegalArgumentException();
	}

	public void method9701(int i, int i_17_) {
		if (i >= 0 && i < 128)
			writeByte(i, 465637339);
		else if (i >= 0 && i < 32768)
			writeShort(i + 32768, -1778059594);
		else
			throw new IllegalArgumentException();
	}

	public void method9702(int i, int i_18_) {
		if (i < -1)
			throw new IllegalArgumentException();
		if (i == -1)
			writeShort(32767, -1778059594);
		else if (i < 32767)
			writeShort(i, -1778059594);
		else {
			writeInt(i, -149241618);
			buffer[-810172525 * off - 4] |= 0x80;
		}
	}

	void method9703(int i, int i_19_) {
		if ((i & ~0x7f) != 0) {
			if ((i & ~0x3fff) != 0) {
				if (0 != (i & ~0x1fffff)) {
					if ((i & ~0xfffffff) != 0)
						writeByte(i >>> 28 | 0x80, 465637339);
					writeByte(i >>> 21 | 0x80, 465637339);
				}
				writeByte(i >>> 14 | 0x80, 465637339);
			}
			writeByte(i >>> 7 | 0x80, 465637339);
		}
		writeByte(i & 0x7f, 465637339);
	}

	public int readUnsignedByte(int i) {
		return (buffer[(off += 516175515) * -810172525 - 1] & 0xff);
	}

	public int readUnsignedShort(short i) {
		off += 1032351030;
		return (((buffer[off * -810172525 - 2] & 0xff) << 8) + (buffer[off * -810172525 - 1] & 0xff));
	}

	public int readShort(byte i) {
		off += 1032351030;
		int i_20_ = ((buffer[off * -810172525 - 1] & 0xff) + ((buffer[-810172525 * off - 2] & 0xff) << 8));
		if (i_20_ > 32767)
			i_20_ -= 65536;
		return i_20_;
	}

	public long method9707(byte i) {
		long l = (long) readUnsignedShort((short) 7801) & 0xffffffffL;
		long l_21_ = (long) method9709(-2118332834) & 0xffffffffL;
		return (l << 32) + l_21_;
	}

	public int method9708(byte i) {
		off += 1548526545;
		int i_22_ = ((buffer[-810172525 * off - 1] & 0xff) + (((buffer[-810172525 * off - 2] & 0xff) << 8) + ((buffer[-810172525 * off - 3] & 0xff) << 16)));
		if (i_22_ > 8388607)
			i_22_ -= 16777216;
		return i_22_;
	}

	public int method9709(int i) {
		off += 2064702060;
		return (((buffer[off * -810172525 - 2] & 0xff) << 8) + (((buffer[off * -810172525 - 4] & 0xff) << 24) + ((buffer[off * -810172525 - 3] & 0xff) << 16)) + (buffer[-810172525 * off - 1] & 0xff));
	}

	public long method9710(int i) {
		long l = (long) readUnsignedByte(1784719236) & 0xffffffffL;
		long l_23_ = (long) method9709(-1493296210) & 0xffffffffL;
		return (l << 32) + l_23_;
	}

	public long method9711(int i) {
		long l = (long) method9709(-1082760135) & 0xffffffffL;
		long l_24_ = (long) method9709(-1874386449) & 0xffffffffL;
		return l_24_ + (l << 32);
	}

	public float method9712(int i) {
		return Float.intBitsToFloat(method9709(-341200706));
	}

	public String method9713(int i) {
		if (0 == buffer[off * -810172525]) {
			off += 516175515;
			return null;
		}
		return method9695((byte) 37);
	}

	public String method9714(byte i) {
		byte i_25_ = buffer[(off += 516175515) * -810172525 - 1];
		if (i_25_ != 0)
			throw new IllegalStateException("");
		int i_26_ = -810172525 * off;
		while (buffer[(off += 516175515) * -810172525 - 1] != 0) {
			/* empty */
		}
		int i_27_ = off * -810172525 - i_26_ - 1;
		if (i_27_ == 0)
			return "";
		return Class202.method2925(buffer, i_26_, i_27_, -1694498816);
	}

	public String method9715(int i) {
		byte i_28_ = buffer[(off += 516175515) * -810172525 - 1];
		if (0 != i_28_)
			throw new IllegalStateException("");
		int i_29_ = method9686(1283778802);
		if (off * -810172525 + i_29_ > buffer.length)
			throw new IllegalStateException("");
		String string = Class508.method6175(buffer, off * -810172525, i_29_, 186009753);
		off += i_29_ * 516175515;
		return string;
	}

	public void method9716(byte[] is, int i, int i_30_, int i_31_) {
		for (int i_32_ = i; i_32_ < i_30_ + i; i_32_++)
			is[i_32_] = buffer[(off += 516175515) * -810172525 - 1];
	}

	public int method9717(int i) {
		int i_33_ = buffer[off * -810172525] & 0xff;
		if (i_33_ < 128)
			return readUnsignedByte(-452542728) - 64;
		return readUnsignedShort((short) 1613) - 49152;
	}

	public int method9718(int i) {
		int i_34_ = buffer[-810172525 * off] & 0xff;
		if (i_34_ < 128)
			return readUnsignedByte(641687181) - 1;
		return readUnsignedShort((short) -7898) - 32769;
	}

	public int method9719(int i) {
		int i_35_ = 0;
		int i_36_;
		for (i_36_ = method9690(-219704208); 32767 == i_36_; i_36_ = method9690(2038838021))
			i_35_ += 32767;
		i_35_ += i_36_;
		return i_35_;
	}

	public int method9720(byte i) {
		if (buffer[off * -810172525] < 0)
			return method9709(-1282207959) & 0x7fffffff;
		int i_37_ = readUnsignedShort((short) 3400);
		if (32767 == i_37_)
			return -1;
		return i_37_;
	}

	public void method9721(long l) {
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (int) (l >> 32);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (int) (l >> 24);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (int) (l >> 16);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (int) (l >> 8);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (int) l;
	}

	public void method9723(int[] is, int i) {
		int i_38_ = off * -810172525 / 8;
		off = 0;
		for (int i_39_ = 0; i_39_ < i_38_; i_39_++) {
			int i_40_ = method9709(-1546755786);
			int i_41_ = method9709(-1377338881);
			int i_42_ = 0;
			int i_43_ = -1640531527;
			int i_44_ = 32;
			while (i_44_-- > 0) {
				i_40_ += ((i_41_ << 4 ^ i_41_ >>> 5) + i_41_ ^ i_42_ + is[i_42_ & 0x3]);
				i_42_ += i_43_;
				i_41_ += ((i_40_ << 4 ^ i_40_ >>> 5) + i_40_ ^ i_42_ + is[i_42_ >>> 11 & 0x3]);
			}
			off -= -165563176;
			writeInt(i_40_, -149241618);
			writeInt(i_41_, -149241618);
		}
	}

	public void method9724(int[] is, int i) {
		int i_45_ = -810172525 * off / 8;
		off = 0;
		for (int i_46_ = 0; i_46_ < i_45_; i_46_++) {
			int i_47_ = method9709(-1588312795);
			int i_48_ = method9709(-698949474);
			int i_49_ = -957401312;
			int i_50_ = -1640531527;
			int i_51_ = 32;
			while (i_51_-- > 0) {
				i_48_ -= ((i_47_ << 4 ^ i_47_ >>> 5) + i_47_ ^ i_49_ + is[i_49_ >>> 11 & 0x3]);
				i_49_ -= i_50_;
				i_47_ -= ((i_48_ << 4 ^ i_48_ >>> 5) + i_48_ ^ i_49_ + is[i_49_ & 0x3]);
			}
			off -= -165563176;
			writeInt(i_47_, -149241618);
			writeInt(i_48_, -149241618);
		}
	}

	public void method9725(int[] is, int i, int i_52_, int i_53_) {
		int i_54_ = -810172525 * off;
		off = 516175515 * i;
		int i_55_ = (i_52_ - i) / 8;
		for (int i_56_ = 0; i_56_ < i_55_; i_56_++) {
			int i_57_ = method9709(-406587383);
			int i_58_ = method9709(254141213);
			int i_59_ = 0;
			int i_60_ = -1640531527;
			int i_61_ = 32;
			while (i_61_-- > 0) {
				i_57_ += ((i_58_ << 4 ^ i_58_ >>> 5) + i_58_ ^ is[i_59_ & 0x3] + i_59_);
				i_59_ += i_60_;
				i_58_ += ((i_57_ << 4 ^ i_57_ >>> 5) + i_57_ ^ i_59_ + is[i_59_ >>> 11 & 0x3]);
			}
			off -= -165563176;
			writeInt(i_57_, -149241618);
			writeInt(i_58_, -149241618);
		}
		off = 516175515 * i_54_;
	}

	public void method9726(BigInteger biginteger, BigInteger biginteger_62_, int i) {
		int i_63_ = off * -810172525;
		off = 0;
		byte[] is = new byte[i_63_];
		method9716(is, 0, i_63_, 1518599019);
		BigInteger biginteger_64_ = new BigInteger(is);
		BigInteger biginteger_65_ = biginteger_64_.modPow(biginteger, biginteger_62_);
		byte[] is_66_ = biginteger_65_.toByteArray();
		off = 0;
		writeShort(is_66_.length, -1778059594);
		method9696(is_66_, 0, is_66_.length, (byte) 107);
	}

	public boolean method9727(byte i) {
		off -= 2064702060;
		int i_67_ = Class205_Sub5.method9059(buffer, 0, -810172525 * off, (byte) 1);
		int i_68_ = method9709(-587974728);
		if (i_67_ == i_68_)
			return true;
		return false;
	}

	public void method9728(int i, byte i_69_) {
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i + 128);
	}

	public void method9729(int i, int i_70_) {
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (0 - i);
	}

	public RSByteBuffer(int i) {
		buffer = Class705.method8268(i, 1413422708);
		off = 0;
	}

	public void writeInt(int i, int i_71_) {
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 24);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 16);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 8);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) i;
	}

	public int method9731(int i) {
		return (0 - buffer[(off += 516175515) * -810172525 - 1] & 0xff);
	}

	public int method9732(short i) {
		return ((128 - buffer[(off += 516175515) * -810172525 - 1]) & 0xff);
	}

	public byte method9733(int i) {
		return (byte) ((buffer[(off += 516175515) * -810172525 - 1]) - 128);
	}

	public byte method9734(byte i) {
		return (byte) (0 - (buffer[(off += 516175515) * -810172525 - 1]));
	}

	public void writeString(String string, int i) {
		int i_72_ = string.indexOf('\0');
		if (i_72_ >= 0)
			throw new IllegalArgumentException("");
		off += Class671.method8016(string, 0, string.length(), buffer, off * -810172525, 1975381117) * 516175515;
		buffer[(off += 516175515) * -810172525 - 1] = (byte) 0;
	}

	public void method9736(int i, int i_73_) {
		buffer[(off += 516175515) * -810172525 - 1] = (byte) i;
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 8);
	}

	public RSByteBuffer(int i, boolean bool) {
		buffer = Class705.method8269(i, bool, -731672108);
	}

	public void method9737(int i, int i_74_) {
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (128 + i);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 8);
	}

	public void method9738(int i, byte i_75_) {
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 16);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 24);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) i;
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 8);
	}

	public int readUnsignedShort128(int i) {
		off += 1032351030;
		return (((buffer[-810172525 * off - 2] & 0xff) << 8) + (buffer[off * -810172525 - 1] - 128 & 0xff));
	}

	public int readUnsignedShortLE128(int i) {
		off += 1032351030;
		return (((buffer[-810172525 * off - 1] & 0xff) << 8) + (buffer[off * -810172525 - 2] - 128 & 0xff));
	}

	public int method9741(byte i) {
		off += 1032351030;
		int i_76_ = ((buffer[-810172525 * off - 2] & 0xff) + ((buffer[off * -810172525 - 1] & 0xff) << 8));
		if (i_76_ > 32767)
			i_76_ -= 65536;
		return i_76_;
	}

	public int method9742(int i) {
		off += 1548526545;
		return ((buffer[off * -810172525 - 1] & 0xff) + (((buffer[-810172525 * off - 3] & 0xff) << 16) + ((buffer[off * -810172525 - 2] & 0xff) << 8)));
	}

	public int method9743(byte i) {
		off += 1032351030;
		int i_77_ = (((buffer[off * -810172525 - 1] & 0xff) << 8) + (buffer[-810172525 * off - 2] - 128 & 0xff));
		if (i_77_ > 32767)
			i_77_ -= 65536;
		return i_77_;
	}

	public int method9744(int i) {
		off += 1548526545;
		return ((buffer[off * -810172525 - 2] & 0xff) + (((buffer[off * -810172525 - 1] & 0xff) << 8) + ((buffer[-810172525 * off - 3] & 0xff) << 16)));
	}

	public void method9745(int i, int i_78_) {
		buffer[(off += 516175515) * -810172525 - 1] = (byte) i;
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 8);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 16);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 24);
	}

	public int method9746(short i) {
		off += 2064702060;
		return ((buffer[off * -810172525 - 4] & 0xff) + (((buffer[off * -810172525 - 3] & 0xff) << 8) + (((buffer[off * -810172525 - 2] & 0xff) << 16) + ((buffer[off * -810172525 - 1] & 0xff) << 24))));
	}

	public void method9748(int i, int i_79_) {
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 8);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) i;
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 24);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 16);
	}

	public byte method9749(int i) {
		return (byte) (128 - (buffer[(off += 516175515) * -810172525 - 1]));
	}

	public int method9750(byte i) {
		off += 2064702060;
		return (((buffer[off * -810172525 - 1] & 0xff) << 8) + (((buffer[-810172525 * off - 3] & 0xff) << 24) + ((buffer[off * -810172525 - 4] & 0xff) << 16)) + (buffer[-810172525 * off - 2] & 0xff));
	}

	public long method9751(int i, int i_80_) {
		if (--i < 0 || i > 7)
			throw new IllegalArgumentException();
		int i_81_ = 8 * i;
		long l = 0L;
		for (/**/; i_81_ >= 0; i_81_ -= 8)
			l |= ((long) (buffer[(off += 516175515) * -810172525 - 1]) & 0xffL) << i_81_;
		return l;
	}

	public void method9752(CharSequence charsequence, int i) {
		int i_82_ = Class248.method3445(charsequence, -1288789377);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) 0;
		method9703(i_82_, -1074820527);
		off += Class187.method2781(buffer, -810172525 * off, charsequence, 1314403458) * 516175515;
	}

	public void method9753(int i, int i_83_) {
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (128 - i);
	}

	public void method9754(int i, int i_84_) {
		buffer[(off += 516175515) * -810172525 - 1] = (byte) i;
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 8);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 16);
	}

	public int method9756(byte i) {
		off += 1032351030;
		int i_85_ = ((buffer[off * -810172525 - 1] - 128 & 0xff) + ((buffer[-810172525 * off - 2] & 0xff) << 8));
		if (i_85_ > 32767)
			i_85_ -= 65536;
		return i_85_;
	}

	public int readUnsignedByte128(byte i) {
		return ((buffer[(off += 516175515) * -810172525 - 1] - 128) & 0xff);
	}

	public int method9760(int i) {
		int i_86_ = 0;
		int i_87_ = 0;
		int i_88_;
		do {
			i_88_ = readUnsignedByte(2000334644);
			i_86_ |= (i_88_ & 0x7f) << i_87_;
			i_87_ += 7;
		} while (i_88_ > 127);
		return i_86_;
	}

	public void method9762(byte[] is, int i, int i_89_, int i_90_) {
		for (int i_91_ = i + i_89_ - 1; i_91_ >= i; i_91_--)
			is[i_91_] = buffer[(off += 516175515) * -810172525 - 1];
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_92_ = i;
			for (int i_93_ = 0; i_93_ < 8; i_93_++) {
				if (1 == (i_92_ & 0x1))
					i_92_ = i_92_ >>> 1 ^ ~0x12477cdf;
				else
					i_92_ >>>= 1;
			}
			anIntArray10597[i] = i_92_;
		}
		aLongArray10595 = new long[256];
		for (int i = 0; i < 256; i++) {
			long l = (long) i;
			for (int i_94_ = 0; i_94_ < 8; i_94_++) {
				if ((l & 0x1L) == 1L)
					l = l >>> 1 ^ ~0x3693a86a2878f0bdL;
				else
					l >>>= 1;
			}
			aLongArray10595[i] = l;
		}
	}

	public int method9765(short i) {
		if (buffer[-810172525 * off] < 0)
			return method9709(-60683548) & 0x7fffffff;
		return readUnsignedShort((short) -20720);
	}

	public int method9768(int i, byte i_95_) {
		int i_96_ = Class205_Sub5.method9059(buffer, i, off * -810172525, (byte) 1);
		writeInt(i_96_, -149241618);
		return i_96_;
	}

	public void writeByte(int i, int i_97_) {
		buffer[(off += 516175515) * -810172525 - 1] = (byte) i;
	}

	public void method9770(int i, byte i_98_) {
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 8);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (128 + i);
	}

	public byte readByte(int i) {
		return buffer[(off += 516175515) * -810172525 - 1];
	}

	public void method9780(byte[] is, int i, int i_99_, int i_100_) {
		for (int i_101_ = i + i_99_ - 1; i_101_ >= i; i_101_--)
			is[i_101_] = (byte) ((buffer[(off += 516175515) * -810172525 - 1]) - 128);
	}

	public void method9781(int[] is, int i, int i_102_, byte i_103_) {
		int i_104_ = -810172525 * off;
		off = 516175515 * i;
		int i_105_ = (i_102_ - i) / 8;
		for (int i_106_ = 0; i_106_ < i_105_; i_106_++) {
			int i_107_ = method9709(-725652301);
			int i_108_ = method9709(-1889003327);
			int i_109_ = -957401312;
			int i_110_ = -1640531527;
			int i_111_ = 32;
			while (i_111_-- > 0) {
				i_108_ -= (i_107_ + (i_107_ << 4 ^ i_107_ >>> 5) ^ is[i_109_ >>> 11 & 0x3] + i_109_);
				i_109_ -= i_110_;
				i_107_ -= ((i_108_ << 4 ^ i_108_ >>> 5) + i_108_ ^ i_109_ + is[i_109_ & 0x3]);
			}
			off -= -165563176;
			writeInt(i_107_, -149241618);
			writeInt(i_108_, -149241618);
		}
		off = i_104_ * 516175515;
	}

	public int method9783(int i) {
		off += 2064702060;
		return (((buffer[-810172525 * off - 4] & 0xff) << 8) + (((buffer[off * -810172525 - 1] & 0xff) << 16) + ((buffer[off * -810172525 - 2] & 0xff) << 24)) + (buffer[-810172525 * off - 3] & 0xff));
	}

	public int method9784(int i) {
		off += 1032351030;
		return (((buffer[off * -810172525 - 1] & 0xff) << 8) + (buffer[off * -810172525 - 2] & 0xff));
	}

	public void method9785(String string, byte i) {
		int i_112_ = string.indexOf('\0');
		if (i_112_ >= 0)
			throw new IllegalArgumentException("");
		buffer[(off += 516175515) * -810172525 - 1] = (byte) 0;
		off += Class671.method8016(string, 0, string.length(), buffer, -810172525 * off, 1979027636) * 516175515;
		buffer[(off += 516175515) * -810172525 - 1] = (byte) 0;
	}


	public void method9790(RSByteBuffer class536_sub33_113_, int i) {
		method9696(class536_sub33_113_.buffer, 0, -810172525 * class536_sub33_113_.off, (byte) 65);
	}

	public static Class392 method9791(RSByteBuffer class536_sub33, int i) {
		Class392 class392 = Class392.method4864(class536_sub33, -317645171);
		int i_114_ = class536_sub33.method9709(-578457384);
		int i_115_ = class536_sub33.method9709(-286813584);
		return new Class392_Sub1(class392.aClass395_4064, class392.aClass399_4065, 316945261 * class392.anInt4066, 1917287119 * class392.anInt4069, class392.anInt4068 * -1755858667, -840030237 * class392.anInt4067, -2068781397 * class392.anInt4070, 1694830205 * class392.anInt4071, class392.anInt4072 * -369678755, i_114_, i_115_);
	}
}
