/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class19 {
	long aLong201;
	long aLong202;
	RandomAccessFile aRandomAccessFile203;

	void method748() throws Throwable {
		if (null != aRandomAccessFile203) {
			System.out.println("");
			method751((byte) -97);
		}
	}

	final void method749(long l) throws IOException {
		aRandomAccessFile203.seek(l);
		aLong201 = -4817209310744594173L * l;
	}

	public final void method750(byte[] is, int i, int i_0_) throws IOException {
		if ((long) i_0_ + -2993909263196358229L * aLong201 > 8128550049254796721L * aLong202) {
			aRandomAccessFile203.seek(aLong202 * 8128550049254796721L);
			aRandomAccessFile203.write(1);
			throw new EOFException();
		}
		aRandomAccessFile203.write(is, i, i_0_);
		aLong201 += (long) i_0_ * -4817209310744594173L;
	}

	public final void method751(byte i) throws IOException {
		if (null != aRandomAccessFile203) {
			aRandomAccessFile203.close();
			aRandomAccessFile203 = null;
		}
	}

	public final long method752(int i) throws IOException {
		return aRandomAccessFile203.length();
	}

	public final int method753(byte[] is, int i, int i_1_, byte i_2_) throws IOException {
		int i_3_ = aRandomAccessFile203.read(is, i, i_1_);
		if (i_3_ > 0)
			aLong201 += (long) i_3_ * -4817209310744594173L;
		return i_3_;
	}

	public void finalize() throws Throwable {
		if (null != aRandomAccessFile203) {
			System.out.println("");
			method751((byte) 17);
		}
	}

	final void method754(long l) throws IOException {
		aRandomAccessFile203.seek(l);
		aLong201 = -4817209310744594173L * l;
	}

	void method755() throws Throwable {
		if (null != aRandomAccessFile203) {
			System.out.println("");
			method751((byte) -28);
		}
	}

	void method756() throws Throwable {
		if (null != aRandomAccessFile203) {
			System.out.println("");
			method751((byte) 31);
		}
	}

	public Class19(File file, String string, long l) throws IOException {
		if (-1L == l)
			l = 9223372036854775807L;
		if (file.length() > l)
			file.delete();
		aRandomAccessFile203 = new RandomAccessFile(file, string);
		aLong202 = l * 5300328711859288913L;
		aLong201 = 0L;
		int i = aRandomAccessFile203.read();
		if (i != -1 && !string.equals("r")) {
			aRandomAccessFile203.seek(0L);
			aRandomAccessFile203.write(i);
		}
		aRandomAccessFile203.seek(0L);
	}

	void method757() throws Throwable {
		if (null != aRandomAccessFile203) {
			System.out.println("");
			method751((byte) 7);
		}
	}

	void method758() throws Throwable {
		if (null != aRandomAccessFile203) {
			System.out.println("");
			method751((byte) -7);
		}
	}

	final void method759(long l) throws IOException {
		aRandomAccessFile203.seek(l);
		aLong201 = -4817209310744594173L * l;
	}

	public final void method760(byte[] is, int i, int i_4_, byte i_5_) throws IOException {
		if ((long) i_4_ + -2993909263196358229L * aLong201 > 8128550049254796721L * aLong202) {
			aRandomAccessFile203.seek(aLong202 * 8128550049254796721L);
			aRandomAccessFile203.write(1);
			throw new EOFException();
		}
		aRandomAccessFile203.write(is, i, i_4_);
		aLong201 += (long) i_4_ * -4817209310744594173L;
	}

	public final void method761() throws IOException {
		if (null != aRandomAccessFile203) {
			aRandomAccessFile203.close();
			aRandomAccessFile203 = null;
		}
	}

	public final long method762() throws IOException {
		return aRandomAccessFile203.length();
	}

	public final long method763() throws IOException {
		return aRandomAccessFile203.length();
	}

	public final int method764(byte[] is, int i, int i_6_) throws IOException {
		int i_7_ = aRandomAccessFile203.read(is, i, i_6_);
		if (i_7_ > 0)
			aLong201 += (long) i_7_ * -4817209310744594173L;
		return i_7_;
	}

	public final int method765(byte[] is, int i, int i_8_) throws IOException {
		int i_9_ = aRandomAccessFile203.read(is, i, i_8_);
		if (i_9_ > 0)
			aLong201 += (long) i_9_ * -4817209310744594173L;
		return i_9_;
	}

	public final int method766(byte[] is, int i, int i_10_) throws IOException {
		int i_11_ = aRandomAccessFile203.read(is, i, i_10_);
		if (i_11_ > 0)
			aLong201 += (long) i_11_ * -4817209310744594173L;
		return i_11_;
	}

	public static void method767(byte i) {
		if (null == Class56.aFrame711) {
			int i_12_ = -416298495 * client.anInt7019;
			int i_13_ = -1313216019 * client.anInt7020;
			int i_14_ = (-21941151 * Class358.anInt3831 - -1803844265 * Class289.anInt3223 - i_12_);
			int i_15_ = (-239790197 * Class76.anInt796 - Class611.anInt8009 * -471480167 - i_13_);
			if (i_12_ > 0 || i_14_ > 0 || i_13_ > 0 || i_15_ > 0) {
				try {
					Container container = Class198.method3745((byte) 31);
					int i_16_ = 0;
					int i_17_ = 0;
					if (container == Class514.aFrame7012) {
						Insets insets = Class514.aFrame7012.getInsets();
						i_16_ = insets.left;
						i_17_ = insets.top;
					}
					Graphics graphics = container.getGraphics();
					graphics.setColor(Color.black);
					if (i_12_ > 0)
						graphics.fillRect(i_16_, i_17_, i_12_, -239790197 * Class76.anInt796);
					if (i_13_ > 0)
						graphics.fillRect(i_16_, i_17_, -21941151 * Class358.anInt3831, i_13_);
					if (i_14_ > 0)
						graphics.fillRect((Class358.anInt3831 * -21941151 + i_16_ - i_14_), i_17_, i_14_, -239790197 * Class76.anInt796);
					if (i_15_ > 0)
						graphics.fillRect(i_16_, (Class76.anInt796 * -239790197 + i_17_ - i_15_), -21941151 * Class358.anInt3831, i_15_);
				} catch (Exception exception) {
					/* empty */
				}
			}
		}
	}

	public static String method768(Class527_Sub8_Sub7 class527_sub8_sub7, int i) {
		if (Class35.aBool338 || class527_sub8_sub7 == null)
			return "";
		return class527_sub8_sub7.aString11641;
	}

	static final void method769(Class665 class665, byte i) {
		int i_18_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_18_, -1126186897);
		Class240 class240 = Class183.aClass240Array2100[i_18_ >> 16];
		Class160.method2581(class243, class240, class665, -1909740404);
	}

	public static Class532 method770(Class459 class459, String string, boolean bool, int i) {
		int i_19_ = class459.method7540(string, -1193884611);
		if (i_19_ == -1)
			return new Class532(0);
		byte[] is = class459.method7470(i_19_, 1, (byte) -105);
		if (is == null)
			return new Class532(0);
		RSByteBuffer class527_sub38 = new RSByteBuffer(is);
		int i_20_ = class527_sub38.readUnsignedShort();
		Class532 class532 = new Class532(i_20_);
		int i_21_ = 0;
		while (i_21_ < -1479175311 * class532.anInt7208) {
			int i_22_ = class527_sub38.readInt();
			int i_23_ = class527_sub38.readUnsignedShort();
			int i_24_ = class527_sub38.readUnsignedByte();
			if (bool || 1 != i_24_) {
				class532.anIntArray7206[i_21_] = i_22_;
				class532.anIntArray7207[i_21_] = i_23_;
				i_21_++;
			} else
				class532.anInt7208 -= -245969519;
		}
		return class532;
	}
}
