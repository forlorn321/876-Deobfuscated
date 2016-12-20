/* Class527_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.math.BigInteger;

public class RSByteBuffer extends Class527 {
	public byte[] buffer;
	public static long[] aLongArray10688;
	public int anInt10689;
	static int[] anIntArray10690 = new int[256];

	public RSByteBuffer(int i, boolean bool) {
		buffer = Class706.method14340(i, bool, -740746889);
	}

	public RSByteBuffer(byte[] is) {
		buffer = is;
		anInt10689 = 0;
	}

	public void writeIntLE(int i, byte i_2_) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) i;
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 8);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 16);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 24);
	}

	public void writeByte(int i, int i_3_) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) i;
	}

	public void writeShort(int i, int i_4_) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 8);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) i;
	}

	public void writeInt(int i, int i_6_) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 24);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 16);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 8);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) i;
	}

	public void method16429(long l) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (int) (l >> 40);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (int) (l >> 32);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (int) (l >> 24);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (int) (l >> 16);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (int) (l >> 8);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (int) l;
	}

	public void writeLong(long l) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (int) (l >> 56);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (int) (l >> 48);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (int) (l >> 40);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (int) (l >> 32);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (int) (l >> 24);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (int) (l >> 16);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (int) (l >> 8);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (int) l;
	}

	public void method16431(long l, int i, int i_8_) {
		if (--i < 0 || i > 7)
			throw new IllegalArgumentException();
		for (int i_9_ = 8 * i; i_9_ >= 0; i_9_ -= 8)
			buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (int) (l >> i_9_);
	}

	public void writeString(String string, int i) {
		int i_10_ = string.indexOf('\0');
		if (i_10_ >= 0)
			throw new IllegalArgumentException("");
		anInt10689 += Class464.method7629(string, 0, string.length(), buffer, -441238943 * anInt10689, (byte) 2) * 1474750881;
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) 0;
	}

	public void writeGJString3(String string, short i) {
		int i_11_ = string.indexOf('\0');
		if (i_11_ >= 0)
			throw new IllegalArgumentException("");
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) 0;
		anInt10689 += Class464.method7629(string, 0, string.length(), buffer, anInt10689 * -441238943, (byte) 2) * 1474750881;
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) 0;
	}

	public void writeGJString(CharSequence charsequence, int i) {
		int i_12_ = Class702.method14302(charsequence, (byte) -48);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) 0;
		method16594(i_12_, (byte) 104);
		anInt10689 += Class221.method4147(buffer, -441238943 * anInt10689, charsequence, (byte) 11) * 1474750881;
	}

	public void writeBuffer(RSByteBuffer class527_sub38_13_, byte i) {
		writeBytes(class527_sub38_13_.buffer, 0, -441238943 * class527_sub38_13_.anInt10689, (byte) 46);
	}

	public void method16437(int i, int i_14_) {
		if (i < 0 || i > 65535)
			throw new IllegalArgumentException();
		buffer[-441238943 * anInt10689 - i - 2] = (byte) (i >> 8);
		buffer[anInt10689 * -441238943 - i - 1] = (byte) i;
	}

	public void writeShortLE128(int i, int i_15_) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (128 + i);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 8);
	}

	public void method16439(int i, byte i_16_) {
		if (i < 64 && i >= -64)
			writeByte(i + 64, -960612499);
		else if (i < 16384 && i >= -16384)
			writeShort(49152 + i, 1404835786);
		else
			throw new IllegalArgumentException();
	}

	public void writeLE24BitInt(int i, byte i_17_) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) i;
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 8);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 16);
	}

	public void writeShortLE(int i, int i_24_) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) i;
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 8);
		
	}

	public byte readByte() {
		return buffer[(anInt10689 += 1474750881) * -441238943 - 1];
	}

	public int readUnsignedShort() {
		anInt10689 += -1345465534;
		return ((buffer[-441238943 * anInt10689 - 1] & 0xff) + ((buffer[-441238943 * anInt10689 - 2] & 0xff) << 8));
	}

	public int readShort() {
		anInt10689 += -1345465534;
		int i_25_ = (((buffer[anInt10689 * -441238943 - 2] & 0xff) << 8) + (buffer[anInt10689 * -441238943 - 1] & 0xff));
		if (i_25_ > 32767)
			i_25_ -= 65536;
		return i_25_;
	}

	public int read24BitUnsignedInteger(int i) {
		anInt10689 += 129285347;
		return ((buffer[-441238943 * anInt10689 - 1] & 0xff) + (((buffer[-441238943 * anInt10689 - 2] & 0xff) << 8) + ((buffer[-441238943 * anInt10689 - 3] & 0xff) << 16)));
	}

	public int readInt() {
		anInt10689 += 1604036228;
		return ((buffer[anInt10689 * -441238943 - 1] & 0xff) + (((buffer[anInt10689 * -441238943 - 3] & 0xff) << 16) + ((buffer[-441238943 * anInt10689 - 4] & 0xff) << 24) + ((buffer[-441238943 * anInt10689 - 2] & 0xff) << 8)));
	}

	public int readIntLE(byte i) {
		anInt10689 += 1604036228;
		return (((buffer[-441238943 * anInt10689 - 3] & 0xff) << 8) + (((buffer[anInt10689 * -441238943 - 1] & 0xff) << 24) + ((buffer[-441238943 * anInt10689 - 2] & 0xff) << 16)) + (buffer[-441238943 * anInt10689 - 4] & 0xff));
	}

	public long method16451(byte i) {
		long l = (long) readUnsignedByte() & 0xffffffffL;
		long l_26_ = (long) readInt() & 0xffffffffL;
		return l_26_ + (l << 32);
	}

	public long method16454(int i, int i_27_) {
		if (--i < 0 || i > 7)
			throw new IllegalArgumentException();
		int i_28_ = 8 * i;
		long l = 0L;
		for (/**/; i_28_ >= 0; i_28_ -= 8)
			l |= ((long) (buffer[(anInt10689 += 1474750881) * -441238943 - 1]) & 0xffL) << i_28_;
		return l;
	}

	public float readFloat(int i) {
		return Float.intBitsToFloat(readInt());
	}

	public String method16456(byte i) {
		if (0 == buffer[anInt10689 * -441238943]) {
			anInt10689 += 1474750881;
			return null;
		}
		return readString(2093307958);
	}

	public int readSmartVariant(int i) {
		int i_29_ = buffer[anInt10689 * -441238943] & 0xff;
		if (i_29_ < 128)
			return readUnsignedByte() - 64;
		return readUnsignedShort() - 49152;
	}

	public String readVersionedString(int i) {
		byte i_30_ = buffer[(anInt10689 += 1474750881) * -441238943 - 1];
		if (i_30_ != 0)
			throw new IllegalStateException("");
		int i_31_ = anInt10689 * -441238943;
		while (buffer[(anInt10689 += 1474750881) * -441238943 - 1] != 0) {
			/* empty */
		}
		int i_32_ = -441238943 * anInt10689 - i_31_ - 1;
		if (0 == i_32_)
			return "";
		return Class539.method9000(buffer, i_31_, i_32_, -1902650054);
	}

	public String method16459(int i) {
		byte i_33_ = buffer[(anInt10689 += 1474750881) * -441238943 - 1];
		if (0 != i_33_)
			throw new IllegalStateException("");
		int i_34_ = method16467((byte) -109);
		if (i_34_ + anInt10689 * -441238943 > buffer.length)
			throw new IllegalStateException("");
		String string = Class325.method5753(buffer, anInt10689 * -441238943, i_34_, (byte) 0);
		anInt10689 += i_34_ * 1474750881;
		return string;
	}

	public void method16460(byte[] is, int i, int i_35_, int i_36_) {
		for (int i_37_ = i; i_37_ < i_35_ + i; i_37_++)
			is[i_37_] = buffer[(anInt10689 += 1474750881) * -441238943 - 1];
	}

	public int readUnsignedSmart(byte i) {
		int i_38_ = buffer[-441238943 * anInt10689] & 0xff;
		if (i_38_ < 128)
			return readUnsignedByte();
		return readUnsignedShort() - 32768;
	}

	public int readSmart(int i) {
		int i_39_ = 0;
		int i_40_;
		for (i_40_ = readUnsignedSmart((byte) -40); i_40_ == 32767; i_40_ = readUnsignedSmart((byte) -66))
			i_39_ += 32767;
		i_39_ += i_40_;
		return i_39_;
	}

	public void method16465(int[] is, byte i) {
		int i_41_ = anInt10689 * -441238943 / 8;
		anInt10689 = 0;
		for (int i_42_ = 0; i_42_ < i_41_; i_42_++) {
			int i_43_ = readInt();
			int i_44_ = readInt();
			int i_45_ = 0;
			int i_46_ = -1640531527;
			int i_47_ = 32;
			while (i_47_-- > 0) {
				i_43_ += (i_44_ + (i_44_ << 4 ^ i_44_ >>> 5) ^ is[i_45_ & 0x3] + i_45_);
				i_45_ += i_46_;
				i_44_ += ((i_43_ << 4 ^ i_43_ >>> 5) + i_43_ ^ i_45_ + is[i_45_ >>> 11 & 0x3]);
			}
			anInt10689 -= -1086894840;
			writeInt(i_43_, -1409167800);
			writeInt(i_44_, 954247542);
		}
	}

	public int method16466(int i) {
		if (buffer[anInt10689 * -441238943] < 0)
			return readInt() & 0x7fffffff;
		int i_48_ = readUnsignedShort();
		if (32767 == i_48_)
			return -1;
		return i_48_;
	}

	int method16467(byte i) {
		int i_49_ = buffer[(anInt10689 += 1474750881) * -441238943 - 1];
		int i_50_ = 0;
		for (/**/; i_49_ < 0; i_49_ = (buffer[(anInt10689 += 1474750881) * -441238943 - 1]))
			i_50_ = (i_50_ | i_49_ & 0x7f) << 7;
		return i_50_ | i_49_;
	}

	public int method16468(byte i) {
		int i_51_ = 0;
		int i_52_ = 0;
		int i_53_;
		do {
			i_53_ = readUnsignedByte();
			i_51_ |= (i_53_ & 0x7f) << i_52_;
			i_52_ += 7;
		} while (i_53_ > 127);
		return i_51_;
	}

	public void writeBytes(byte[] is, int i, int i_54_, byte i_55_) {
		for (int i_56_ = i; i_56_ < i_54_ + i; i_56_++)
			buffer[(anInt10689 += 1474750881) * -441238943 - 1] = is[i_56_];
	}

	public void method16470(int[] is, int i) {
		int i_57_ = anInt10689 * -441238943 / 8;
		anInt10689 = 0;
		for (int i_58_ = 0; i_58_ < i_57_; i_58_++) {
			int i_59_ = readInt();
			int i_60_ = readInt();
			int i_61_ = -957401312;
			int i_62_ = -1640531527;
			int i_63_ = 32;
			while (i_63_-- > 0) {
				i_60_ -= ((i_59_ << 4 ^ i_59_ >>> 5) + i_59_ ^ is[i_61_ >>> 11 & 0x3] + i_61_);
				i_61_ -= i_62_;
				i_59_ -= ((i_60_ << 4 ^ i_60_ >>> 5) + i_60_ ^ is[i_61_ & 0x3] + i_61_);
			}
			anInt10689 -= -1086894840;
			writeInt(i_59_, -619775168);
			writeInt(i_60_, -1646419816);
		}
	}

	public void method16471(int[] is, int i, int i_64_, byte i_65_) {
		int i_66_ = -441238943 * anInt10689;
		anInt10689 = 1474750881 * i;
		int i_67_ = (i_64_ - i) / 8;
		for (int i_68_ = 0; i_68_ < i_67_; i_68_++) {
			int i_69_ = readInt();
			int i_70_ = readInt();
			int i_71_ = 0;
			int i_72_ = -1640531527;
			int i_73_ = 32;
			while (i_73_-- > 0) {
				i_69_ += ((i_70_ << 4 ^ i_70_ >>> 5) + i_70_ ^ is[i_71_ & 0x3] + i_71_);
				i_71_ += i_72_;
				i_70_ += ((i_69_ << 4 ^ i_69_ >>> 5) + i_69_ ^ is[i_71_ >>> 11 & 0x3] + i_71_);
			}
			anInt10689 -= -1086894840;
			writeInt(i_69_, -1179226341);
			writeInt(i_70_, -1047663002);
		}
		anInt10689 = i_66_ * 1474750881;
	}

	public int method16474(int i, byte i_74_) {
		int i_75_ = Class482.method7845(buffer, i, anInt10689 * -441238943, 1976593891);
		writeInt(i_75_, 1167653668);
		return i_75_;
	}

	public boolean method16475(int i) {
		anInt10689 -= 1604036228;
		int i_76_ = Class482.method7845(buffer, 0, anInt10689 * -441238943, 2023025648);
		int i_77_ = readInt();
		if (i_76_ == i_77_)
			return true;
		return false;
	}

	public void writeByte128(int i, int i_78_) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (128 + i);
	}

	public void writeShort128(int i, int i_79_) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 8);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i + 128);
	}

	public void write128Byte(int i, byte i_80_) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (128 - i);
	}

	public int readUnsignedByte128() {
		return ((buffer[(anInt10689 += 1474750881) * -441238943 - 1] - 128) & 0xff);
	}

	public int readUnsignedByteC(int i) {
		return (0 - (buffer[(anInt10689 += 1474750881) * -441238943 - 1]) & 0xff);
	}

	public int method16481(int i) {
		anInt10689 += -1345465534;
		int i_81_ = (((buffer[-441238943 * anInt10689 - 1] & 0xff) << 8) + (buffer[anInt10689 * -441238943 - 2] & 0xff));
		if (i_81_ > 32767)
			i_81_ -= 65536;
		return i_81_;
	}

	public byte readByte128(byte i) {
		return (byte) ((buffer[(anInt10689 += 1474750881) * -441238943 - 1]) - 128);
	}

	public byte readByteC(byte i) {
		return (byte) (0 - (buffer[(anInt10689 += 1474750881) * -441238943 - 1]));
	}

	public byte read128Byte(byte i) {
		return (byte) (128 - (buffer[(anInt10689 += 1474750881) * -441238943 - 1]));
	}

	public void writeShortLE2(int i, byte i_82_) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) i;
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 8);
	}

	public void method16488(int[] is, int i, int i_86_, int i_87_) {
		int i_88_ = -441238943 * anInt10689;
		anInt10689 = i * 1474750881;
		int i_89_ = (i_86_ - i) / 8;
		for (int i_90_ = 0; i_90_ < i_89_; i_90_++) {
			int i_91_ = readInt();
			int i_92_ = readInt();
			int i_93_ = -957401312;
			int i_94_ = -1640531527;
			int i_95_ = 32;
			while (i_95_-- > 0) {
				i_92_ -= ((i_91_ << 4 ^ i_91_ >>> 5) + i_91_ ^ i_93_ + is[i_93_ >>> 11 & 0x3]);
				i_93_ -= i_94_;
				i_91_ -= ((i_92_ << 4 ^ i_92_ >>> 5) + i_92_ ^ i_93_ + is[i_93_ & 0x3]);
			}
			anInt10689 -= -1086894840;
			writeInt(i_91_, 951423978);
			writeInt(i_92_, 2128391908);
		}
		anInt10689 = i_88_ * 1474750881;
	}

	public int readUnsignedShort128() {
		anInt10689 += -1345465534;
		return ((buffer[anInt10689 * -441238943 - 1] - 128 & 0xff) + ((buffer[-441238943 * anInt10689 - 2] & 0xff) << 8));
	}

	public int readUnsignedShortLE128() {
		anInt10689 += -1345465534;
		return (((buffer[anInt10689 * -441238943 - 1] & 0xff) << 8) + (buffer[-441238943 * anInt10689 - 2] - 128 & 0xff));
	}

	public int read24BitUnsignedIntegerV2(int i) {
		anInt10689 += 129285347;
		return (((buffer[anInt10689 * -441238943 - 1] & 0xff) << 8) + ((buffer[anInt10689 * -441238943 - 3] & 0xff) << 16) + (buffer[anInt10689 * -441238943 - 2] & 0xff));
	}

	public void writeIntLE2(int i, byte i_100_) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) i;
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 8);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 16);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 24);
	}

	public void writeIntV1(int i, byte i_101_) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 8);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) i;
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 24);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 16);
	}

	public void writeIntV2(int i, byte i_102_) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 16);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 24);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) i;
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 8);
	}

	public long method16500(byte i) {
		long l = (long) readUnsignedShort() & 0xffffffffL;
		long l_103_ = (long) readInt() & 0xffffffffL;
		return l_103_ + (l << 32);
	}

	public int readIntV2() {
		anInt10689 += 1604036228;
		return (((buffer[anInt10689 * -441238943 - 3] & 0xff) << 24) + ((buffer[anInt10689 * -441238943 - 4] & 0xff) << 16) + ((buffer[anInt10689 * -441238943 - 1] & 0xff) << 8) + (buffer[anInt10689 * -441238943 - 2] & 0xff));
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_105_ = i;
			for (int i_106_ = 0; i_106_ < 8; i_106_++) {
				if (1 == (i_105_ & 0x1))
					i_105_ = i_105_ >>> 1 ^ ~0x12477cdf;
				else
					i_105_ >>>= 1;
			}
			anIntArray10690[i] = i_105_;
		}
		aLongArray10688 = new long[256];
		for (int i = 0; i < 256; i++) {
			long l = (long) i;
			for (int i_107_ = 0; i_107_ < 8; i_107_++) {
				if ((l & 0x1L) == 1L)
					l = l >>> 1 ^ ~0x3693a86a2878f0bdL;
				else
					l >>>= 1;
			}
			aLongArray10688[i] = l;
		}
	}

	public int readLEInt() {
		anInt10689 += 1604036228;
		return  ((buffer[-441238943 * anInt10689 - 4] & 0xff) + 
			   (((buffer[-441238943 * anInt10689 - 1] & 0xff) << 24) + 
				((buffer[anInt10689 * -441238943 - 2] & 0xff) << 16) + 
				((buffer[-441238943 * anInt10689 - 3] & 0xff) << 8)));
	}

	public void method16520(int i, int i_120_) {
		if (i < -1)
			throw new IllegalArgumentException();
		if (-1 == i)
			writeShort(32767, 1404835786);
		else if (i < 32767)
			writeShort(i, 1404835786);
		else {
			writeInt(i, -83066367);
			buffer[-441238943 * anInt10689 - 4] |= 0x80;
		}
	}

	public int method16526(int i) {
		if (buffer[anInt10689 * -441238943] < 0)
			return readInt() & 0x7fffffff;
		return readUnsignedShort();
	}

	public int readUnsigned128Byte() {
		return (128 - (buffer[(anInt10689 += 1474750881) * -441238943 - 1]) & 0xff);
	}

	public int readUnsignedShortLE(byte i) {
		anInt10689 += -1345465534;
		return ((buffer[anInt10689 * -441238943 - 2] & 0xff) + ((buffer[-441238943 * anInt10689 - 1] & 0xff) << 8));
	}

	public void method16534(int i, int i_121_) {
		if (i < 0 || i > 255)
			throw new IllegalArgumentException();
		buffer[-441238943 * anInt10689 - i - 1] = (byte) i;
	}

	public void method16557(int i, int i_127_) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 8);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 16);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) i;
	}

	public int readUnsignedByte() {
		return (buffer[(anInt10689 += 1474750881) * -441238943 - 1] & 0xff);
	}

	public int method16581(int i) {
		anInt10689 += 129285347;
		int i_145_ = ((buffer[anInt10689 * -441238943 - 1] & 0xff) + (((buffer[anInt10689 * -441238943 - 3] & 0xff) << 16) + ((buffer[anInt10689 * -441238943 - 2] & 0xff) << 8)));
		if (i_145_ > 8388607)
			i_145_ -= 16777216;
		return i_145_;
	}

	public void method16586(int i, int i_147_) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (0 - i);
	}

	public String readString(int i) {
		int i_148_ = -441238943 * anInt10689;
		while (buffer[(anInt10689 += 1474750881) * -441238943 - 1] != 0) {
			/* empty */
		}
		int i_149_ = anInt10689 * -441238943 - i_148_ - 1;
		if (0 == i_149_)
			return "";
		return Class539.method9000(buffer, i_148_, i_149_, -1799456365);
	}

	public void writeTriByte(int i, int i_152_) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 16);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 8);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) i;
	}

	void method16594(int i, byte i_156_) {
		if (0 != (i & ~0x7f)) {
			if ((i & ~0x3fff) != 0) {
				if ((i & ~0x1fffff) != 0) {
					if (0 != (i & ~0xfffffff))
						writeByte(i >>> 28 | 0x80, 1217887878);
					writeByte(i >>> 21 | 0x80, -259979140);
				}
				writeByte(i >>> 14 | 0x80, 1200140774);
			}
			writeByte(i >>> 7 | 0x80, 1622524358);
		}
		writeByte(i & 0x7f, -1795737002);
	}

	public void method16599(byte i) {
		if (buffer != null)
			Class706.method14342(buffer, (byte) -43);
		buffer = null;
	}

	public void method16602(int i, byte i_186_) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 16);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) i;
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i >> 8);
	}

	public int method16606(int i) {
		int i_189_ = buffer[anInt10689 * -441238943] & 0xff;
		if (i_189_ < 128)
			return readUnsignedByte() - 1;
		return readUnsignedShort() - 32769;
	}

	public long method16612(byte i) {
		long l = (long) readInt() & 0xffffffffL;
		long l_197_ = (long) readInt() & 0xffffffffL;
		return l_197_ + (l << 32);
	}

	public int readIntV1() {
		anInt10689 += 1604036228;
		return (((buffer[anInt10689 * -441238943 - 4] & 0xff) << 8) + (((buffer[anInt10689 * -441238943 - 1] & 0xff) << 16) + ((buffer[anInt10689 * -441238943 - 2] & 0xff) << 24)) + (buffer[-441238943 * anInt10689 - 3] & 0xff));
	}

	public void method16650(BigInteger biginteger, BigInteger biginteger_207_, byte i) {
		int i_208_ = -441238943 * anInt10689;
		anInt10689 = 0;
		byte[] is = new byte[i_208_];
		method16460(is, 0, i_208_, -1902805705);
		BigInteger biginteger_209_ = new BigInteger(is);
		BigInteger biginteger_210_ = biginteger_209_.modPow(biginteger, biginteger_207_);
		byte[] is_211_ = biginteger_210_.toByteArray();
		anInt10689 = 0;
		writeShort(is_211_.length, 1404835786);
		writeBytes(is_211_, 0, is_211_.length, (byte) 90);
	}

	public void method16652(int i, int i_212_) {
		if (i >= 0 && i < 128)
			writeByte(i, -2002134787);
		else if (i >= 0 && i < 32768)
			writeShort(32768 + i, 1404835786);
		else
			throw new IllegalArgumentException();
	}

	public RSByteBuffer(int i) {
		buffer = Class706.method14341(i, -257729101);
		anInt10689 = 0;
	}

	public void write36BitLong(long l) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (int) (l >> 32);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (int) (l >> 24);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (int) (l >> 16);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (int) (l >> 8);
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (int) l;
	}

	public void readBytes(byte[] is, int i, int i_213_, int i_214_) {
		for (int i_215_ = i + i_213_ - 1; i_215_ >= i; i_215_--)
			is[i_215_] = buffer[(anInt10689 += 1474750881) * -441238943 - 1];
	}

	static final void method16664(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class186.method3650(class243, class240, class665, 999745152);
	}

	static final void method16665(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (Class204.aClass527_Sub31_2213.aClass700_Sub37_10589.method17281(1769973735) && Class402.aClass180_4150.method3251()) ? 1 : 0;
	}
}
