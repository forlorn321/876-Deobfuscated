/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.EOFException;
import java.io.IOException;

public class Class1 {
	long aLong9;
	byte[] aByteArray10;
	byte[] aByteArray11;
	long aLong12;
	int anInt13;
	long aLong14 = -8092488086943569855L;
	long aLong15 = 7625285407943155949L;
	int anInt16 = 0;
	Class19 aClass19_17;
	static final int anInt18 = 200000000;
	long aLong19;
	long aLong20;
	static Class24_Sub10 aClass24_Sub10_21;

	public void method490(byte[] is, byte i) throws IOException {
		method502(is, 0, is.length, -2052768800);
	}

	public void method491(int i) throws IOException {
		method498(-1760145730);
		aClass19_17.method751((byte) -65);
	}

	public void method492(long l) throws IOException {
		if (l < 0L)
			throw new IOException();
		aLong9 = 496919880189835143L * l;
	}

	public long method493(byte i) {
		return -3768516185403201073L * aLong19;
	}

	public void method494(long l) throws IOException {
		if (l < 0L)
			throw new IOException();
		aLong9 = 496919880189835143L * l;
	}

	void method495() throws IOException {
		anInt13 = 0;
		if (aLong20 * 7019125770131954419L != -6068535747011633609L * aLong9) {
			aClass19_17.method749(-6068535747011633609L * aLong9);
			aLong20 = aLong9 * 3063636397010139309L;
		}
		aLong14 = aLong9 * -5986901503151506423L;
		int i;
		for (/**/; 176241341 * anInt13 < aByteArray11.length; anInt13 += i * 1541476501) {
			int i_0_ = aByteArray11.length - 176241341 * anInt13;
			if (i_0_ > 200000000)
				i_0_ = 200000000;
			i = aClass19_17.method753(aByteArray11, anInt13 * 176241341, i_0_, (byte) 12);
			if (-1 == i)
				break;
			aLong20 += -8513339312163631557L * (long) i;
		}
	}

	public long method496() {
		return -3768516185403201073L * aLong19;
	}

	public void method497(byte[] is, int i, int i_1_, byte i_2_) throws IOException {
		do {
			try {
				if (aLong9 * -6068535747011633609L + (long) i_1_ > aLong19 * -3768516185403201073L)
					aLong19 = ((aLong9 * -6068535747011633609L + (long) i_1_) * 8469539789884554543L);
				if (-2957283407649930469L * aLong15 != -1L && ((-6068535747011633609L * aLong9 < aLong15 * -2957283407649930469L) || (-6068535747011633609L * aLong9 > (aLong15 * -2957283407649930469L + (long) (-695299283 * anInt16)))))
					method498(-2106949461);
				if (-2957283407649930469L * aLong15 != -1L && (-6068535747011633609L * aLong9 + (long) i_1_ > ((long) aByteArray10.length + -2957283407649930469L * aLong15))) {
					int i_3_ = (int) ((long) aByteArray10.length - (-6068535747011633609L * aLong9 - aLong15 * -2957283407649930469L));
					System.arraycopy(is, i, aByteArray10, (int) (-6068535747011633609L * aLong9 - -2957283407649930469L * aLong15), i_3_);
					aLong9 += 496919880189835143L * (long) i_3_;
					i += i_3_;
					i_1_ -= i_3_;
					anInt16 = -624020315 * aByteArray10.length;
					method498(2032018105);
				}
				if (i_1_ > aByteArray10.length) {
					if (7019125770131954419L * aLong20 != aLong9 * -6068535747011633609L) {
						aClass19_17.method749(aLong9 * -6068535747011633609L);
						aLong20 = 3063636397010139309L * aLong9;
					}
					aClass19_17.method760(is, i, i_1_, (byte) 85);
					aLong20 += -8513339312163631557L * (long) i_1_;
					if (aLong20 * 7019125770131954419L > aLong12 * 7831094144256977097L)
						aLong12 = -5096093718177300517L * aLong20;
					long l = -1L;
					long l_4_ = -1L;
					if ((aLong9 * -6068535747011633609L >= 5842985433272014911L * aLong14) && (-6068535747011633609L * aLong9 < (5842985433272014911L * aLong14 + (long) (176241341 * anInt13))))
						l = aLong9 * -6068535747011633609L;
					else if ((aLong14 * 5842985433272014911L >= aLong9 * -6068535747011633609L) && (aLong14 * 5842985433272014911L < ((long) i_1_ + -6068535747011633609L * aLong9)))
						l = 5842985433272014911L * aLong14;
					if ((aLong9 * -6068535747011633609L + (long) i_1_ > 5842985433272014911L * aLong14) && ((long) i_1_ + aLong9 * -6068535747011633609L <= ((long) (anInt13 * 176241341) + 5842985433272014911L * aLong14)))
						l_4_ = aLong9 * -6068535747011633609L + (long) i_1_;
					else if (((5842985433272014911L * aLong14 + (long) (anInt13 * 176241341)) > aLong9 * -6068535747011633609L) && (((long) (176241341 * anInt13) + aLong14 * 5842985433272014911L) <= (-6068535747011633609L * aLong9 + (long) i_1_)))
						l_4_ = ((long) (anInt13 * 176241341) + 5842985433272014911L * aLong14);
					if (l > -1L && l_4_ > l) {
						int i_5_ = (int) (l_4_ - l);
						System.arraycopy(is, (int) ((long) i + l - (-6068535747011633609L * aLong9)), aByteArray11, (int) (l - (5842985433272014911L * aLong14)), i_5_);
					}
					aLong9 += (long) i_1_ * 496919880189835143L;
				} else {
					if (i_1_ <= 0)
						break;
					if (aLong15 * -2957283407649930469L == -1L)
						aLong15 = aLong9 * 3970946078556317461L;
					System.arraycopy(is, i, aByteArray10, (int) (aLong9 * -6068535747011633609L - -2957283407649930469L * aLong15), i_1_);
					aLong9 += 496919880189835143L * (long) i_1_;
					if ((aLong9 * -6068535747011633609L - -2957283407649930469L * aLong15) > (long) (-695299283 * anInt16))
						anInt16 = ((int) (-6068535747011633609L * aLong9 - aLong15 * -2957283407649930469L) * -624020315);
				}
			} catch (IOException ioexception) {
				aLong20 = 8513339312163631557L;
				throw ioexception;
			}
			break;
		} while (false);
	}

	void method498(int i) throws IOException {
		if (aLong15 * -2957283407649930469L != -1L) {
			if (7019125770131954419L * aLong20 != -2957283407649930469L * aLong15) {
				aClass19_17.method749(-2957283407649930469L * aLong15);
				aLong20 = aLong15 * -4376718079516446407L;
			}
			aClass19_17.method760(aByteArray10, 0, anInt16 * -695299283, (byte) 53);
			aLong20 += -4137128128995024545L * (long) anInt16;
			if (aLong20 * 7019125770131954419L > 7831094144256977097L * aLong12)
				aLong12 = aLong20 * -5096093718177300517L;
			long l = -1L;
			long l_6_ = -1L;
			if ((-2957283407649930469L * aLong15 >= 5842985433272014911L * aLong14) && (-2957283407649930469L * aLong15 < 5842985433272014911L * aLong14 + (long) (anInt13 * 176241341)))
				l = aLong15 * -2957283407649930469L;
			else if ((aLong14 * 5842985433272014911L >= aLong15 * -2957283407649930469L) && (aLong14 * 5842985433272014911L < ((long) (-695299283 * anInt16) + -2957283407649930469L * aLong15)))
				l = 5842985433272014911L * aLong14;
			if ((((long) (anInt16 * -695299283) + aLong15 * -2957283407649930469L) > aLong14 * 5842985433272014911L) && (-2957283407649930469L * aLong15 + (long) (-695299283 * anInt16) <= ((long) (176241341 * anInt13) + aLong14 * 5842985433272014911L)))
				l_6_ = ((long) (-695299283 * anInt16) + aLong15 * -2957283407649930469L);
			else if ((((long) (anInt13 * 176241341) + 5842985433272014911L * aLong14) > aLong15 * -2957283407649930469L) && (((long) (anInt13 * 176241341) + aLong14 * 5842985433272014911L) <= ((long) (-695299283 * anInt16) + -2957283407649930469L * aLong15)))
				l_6_ = 5842985433272014911L * aLong14 + (long) (176241341 * anInt13);
			if (l > -1L && l_6_ > l) {
				int i_7_ = (int) (l_6_ - l);
				System.arraycopy(aByteArray10, (int) (l - -2957283407649930469L * aLong15), aByteArray11, (int) (l - 5842985433272014911L * aLong14), i_7_);
			}
			aLong15 = 7625285407943155949L;
			anInt16 = 0;
		}
	}

	public void method499() throws IOException {
		method498(300564952);
		aClass19_17.method751((byte) 43);
	}

	public void method500(long l) throws IOException {
		if (l < 0L)
			throw new IOException();
		aLong9 = 496919880189835143L * l;
	}

	public void method501(long l) throws IOException {
		if (l < 0L)
			throw new IOException();
		aLong9 = 496919880189835143L * l;
	}

	public Class1(Class19 class19, int i, int i_8_) throws IOException {
		aClass19_17 = class19;
		aLong19 = ((aLong12 = class19.method752(1892021102) * -7092461401411128967L) * -4521534441873727001L);
		aByteArray11 = new byte[i];
		aByteArray10 = new byte[i_8_];
		aLong9 = 0L;
	}

	public void method502(byte[] is, int i, int i_9_, int i_10_) throws IOException {
		try {
			if (i + i_9_ > is.length)
				throw new ArrayIndexOutOfBoundsException(i + i_9_ - is.length);
			if (-1L != aLong15 * -2957283407649930469L && (-6068535747011633609L * aLong9 >= aLong15 * -2957283407649930469L) && ((long) i_9_ + -6068535747011633609L * aLong9 <= aLong15 * -2957283407649930469L + (long) (-695299283 * anInt16))) {
				System.arraycopy(aByteArray10, (int) (aLong9 * -6068535747011633609L - -2957283407649930469L * aLong15), is, i, i_9_);
				aLong9 += (long) i_9_ * 496919880189835143L;
				return;
			}
			long l = aLong9 * -6068535747011633609L;
			int i_11_ = i;
			int i_12_ = i_9_;
			if ((aLong9 * -6068535747011633609L >= 5842985433272014911L * aLong14) && (aLong9 * -6068535747011633609L < ((long) (176241341 * anInt13) + aLong14 * 5842985433272014911L))) {
				int i_13_ = (int) ((long) (anInt13 * 176241341) - (aLong9 * -6068535747011633609L - aLong14 * 5842985433272014911L));
				if (i_13_ > i_9_)
					i_13_ = i_9_;
				System.arraycopy(aByteArray11, (int) (-6068535747011633609L * aLong9 - 5842985433272014911L * aLong14), is, i, i_13_);
				aLong9 += 496919880189835143L * (long) i_13_;
				i += i_13_;
				i_9_ -= i_13_;
			}
			if (i_9_ > aByteArray11.length) {
				aClass19_17.method749(-6068535747011633609L * aLong9);
				aLong20 = aLong9 * 3063636397010139309L;
				int i_14_;
				for (/**/; i_9_ > 0; i_9_ -= i_14_) {
					i_14_ = aClass19_17.method753(is, i, i_9_, (byte) 12);
					if (i_14_ == -1)
						break;
					aLong20 += -8513339312163631557L * (long) i_14_;
					aLong9 += 496919880189835143L * (long) i_14_;
					i += i_14_;
				}
			} else if (i_9_ > 0) {
				method508((byte) 3);
				int i_15_ = i_9_;
				if (i_15_ > 176241341 * anInt13)
					i_15_ = anInt13 * 176241341;
				System.arraycopy(aByteArray11, 0, is, i, i_15_);
				i += i_15_;
				i_9_ -= i_15_;
				aLong9 += (long) i_15_ * 496919880189835143L;
			}
			if (aLong15 * -2957283407649930469L != -1L) {
				if ((aLong15 * -2957283407649930469L > -6068535747011633609L * aLong9) && i_9_ > 0) {
					int i_16_ = i + (int) (-2957283407649930469L * aLong15 - aLong9 * -6068535747011633609L);
					if (i_16_ > i_9_ + i)
						i_16_ = i + i_9_;
					while (i < i_16_) {
						is[i++] = (byte) 0;
						i_9_--;
						aLong9 += 496919880189835143L;
					}
				}
				long l_17_ = -1L;
				long l_18_ = -1L;
				if (aLong15 * -2957283407649930469L >= l && aLong15 * -2957283407649930469L < l + (long) i_12_)
					l_17_ = aLong15 * -2957283407649930469L;
				else if (l >= -2957283407649930469L * aLong15 && l < ((long) (anInt16 * -695299283) + -2957283407649930469L * aLong15))
					l_17_ = l;
				if (((long) (-695299283 * anInt16) + aLong15 * -2957283407649930469L) > l && (-2957283407649930469L * aLong15 + (long) (anInt16 * -695299283) <= (long) i_12_ + l))
					l_18_ = ((long) (-695299283 * anInt16) + aLong15 * -2957283407649930469L);
				else if (l + (long) i_12_ > -2957283407649930469L * aLong15 && ((long) i_12_ + l <= ((long) (-695299283 * anInt16) + aLong15 * -2957283407649930469L)))
					l_18_ = (long) i_12_ + l;
				if (l_17_ > -1L && l_18_ > l_17_) {
					int i_19_ = (int) (l_18_ - l_17_);
					System.arraycopy(aByteArray10, (int) (l_17_ - aLong15 * -2957283407649930469L), is, i_11_ + (int) (l_17_ - l), i_19_);
					if (l_18_ > aLong9 * -6068535747011633609L) {
						i_9_ -= l_18_ - aLong9 * -6068535747011633609L;
						aLong9 = 496919880189835143L * l_18_;
					}
				}
			}
		} catch (IOException ioexception) {
			aLong20 = 8513339312163631557L;
			throw ioexception;
		}
		if (i_9_ > 0)
			throw new EOFException();
	}

	public void method503(byte[] is) throws IOException {
		method502(is, 0, is.length, -2136542192);
	}

	public void method504(byte[] is) throws IOException {
		method502(is, 0, is.length, -2135235737);
	}

	public void method505(byte[] is, int i, int i_20_) throws IOException {
		try {
			if (i + i_20_ > is.length)
				throw new ArrayIndexOutOfBoundsException(i + i_20_ - is.length);
			if (-1L != aLong15 * -2957283407649930469L && (-6068535747011633609L * aLong9 >= aLong15 * -2957283407649930469L) && ((long) i_20_ + -6068535747011633609L * aLong9 <= aLong15 * -2957283407649930469L + (long) (-695299283 * anInt16))) {
				System.arraycopy(aByteArray10, (int) (aLong9 * -6068535747011633609L - -2957283407649930469L * aLong15), is, i, i_20_);
				aLong9 += (long) i_20_ * 496919880189835143L;
				return;
			}
			long l = aLong9 * -6068535747011633609L;
			int i_21_ = i;
			int i_22_ = i_20_;
			if ((aLong9 * -6068535747011633609L >= 5842985433272014911L * aLong14) && (aLong9 * -6068535747011633609L < ((long) (176241341 * anInt13) + aLong14 * 5842985433272014911L))) {
				int i_23_ = (int) ((long) (anInt13 * 176241341) - (aLong9 * -6068535747011633609L - aLong14 * 5842985433272014911L));
				if (i_23_ > i_20_)
					i_23_ = i_20_;
				System.arraycopy(aByteArray11, (int) (-6068535747011633609L * aLong9 - 5842985433272014911L * aLong14), is, i, i_23_);
				aLong9 += 496919880189835143L * (long) i_23_;
				i += i_23_;
				i_20_ -= i_23_;
			}
			if (i_20_ > aByteArray11.length) {
				aClass19_17.method749(-6068535747011633609L * aLong9);
				aLong20 = aLong9 * 3063636397010139309L;
				int i_24_;
				for (/**/; i_20_ > 0; i_20_ -= i_24_) {
					i_24_ = aClass19_17.method753(is, i, i_20_, (byte) 12);
					if (i_24_ == -1)
						break;
					aLong20 += -8513339312163631557L * (long) i_24_;
					aLong9 += 496919880189835143L * (long) i_24_;
					i += i_24_;
				}
			} else if (i_20_ > 0) {
				method508((byte) 3);
				int i_25_ = i_20_;
				if (i_25_ > 176241341 * anInt13)
					i_25_ = anInt13 * 176241341;
				System.arraycopy(aByteArray11, 0, is, i, i_25_);
				i += i_25_;
				i_20_ -= i_25_;
				aLong9 += (long) i_25_ * 496919880189835143L;
			}
			if (aLong15 * -2957283407649930469L != -1L) {
				if ((aLong15 * -2957283407649930469L > -6068535747011633609L * aLong9) && i_20_ > 0) {
					int i_26_ = i + (int) (-2957283407649930469L * aLong15 - aLong9 * -6068535747011633609L);
					if (i_26_ > i_20_ + i)
						i_26_ = i + i_20_;
					while (i < i_26_) {
						is[i++] = (byte) 0;
						i_20_--;
						aLong9 += 496919880189835143L;
					}
				}
				long l_27_ = -1L;
				long l_28_ = -1L;
				if (aLong15 * -2957283407649930469L >= l && aLong15 * -2957283407649930469L < l + (long) i_22_)
					l_27_ = aLong15 * -2957283407649930469L;
				else if (l >= -2957283407649930469L * aLong15 && l < ((long) (anInt16 * -695299283) + -2957283407649930469L * aLong15))
					l_27_ = l;
				if (((long) (-695299283 * anInt16) + aLong15 * -2957283407649930469L) > l && (-2957283407649930469L * aLong15 + (long) (anInt16 * -695299283) <= (long) i_22_ + l))
					l_28_ = ((long) (-695299283 * anInt16) + aLong15 * -2957283407649930469L);
				else if (l + (long) i_22_ > -2957283407649930469L * aLong15 && ((long) i_22_ + l <= ((long) (-695299283 * anInt16) + aLong15 * -2957283407649930469L)))
					l_28_ = (long) i_22_ + l;
				if (l_27_ > -1L && l_28_ > l_27_) {
					int i_29_ = (int) (l_28_ - l_27_);
					System.arraycopy(aByteArray10, (int) (l_27_ - aLong15 * -2957283407649930469L), is, i_21_ + (int) (l_27_ - l), i_29_);
					if (l_28_ > aLong9 * -6068535747011633609L) {
						i_20_ -= l_28_ - aLong9 * -6068535747011633609L;
						aLong9 = 496919880189835143L * l_28_;
					}
				}
			}
		} catch (IOException ioexception) {
			aLong20 = 8513339312163631557L;
			throw ioexception;
		}
		if (i_20_ > 0)
			throw new EOFException();
	}

	public void method506(byte[] is) throws IOException {
		method502(is, 0, is.length, -2103041504);
	}

	public void method507(byte[] is) throws IOException {
		method502(is, 0, is.length, -2000933856);
	}

	void method508(byte i) throws IOException {
		anInt13 = 0;
		if (aLong20 * 7019125770131954419L != -6068535747011633609L * aLong9) {
			aClass19_17.method749(-6068535747011633609L * aLong9);
			aLong20 = aLong9 * 3063636397010139309L;
		}
		aLong14 = aLong9 * -5986901503151506423L;
		int i_30_;
		for (/**/; 176241341 * anInt13 < aByteArray11.length; anInt13 += i_30_ * 1541476501) {
			int i_31_ = aByteArray11.length - 176241341 * anInt13;
			if (i_31_ > 200000000)
				i_31_ = 200000000;
			i_30_ = aClass19_17.method753(aByteArray11, anInt13 * 176241341, i_31_, (byte) 12);
			if (-1 == i_30_)
				break;
			aLong20 += -8513339312163631557L * (long) i_30_;
		}
	}

	void method509() throws IOException {
		anInt13 = 0;
		if (aLong20 * 7019125770131954419L != -6068535747011633609L * aLong9) {
			aClass19_17.method749(-6068535747011633609L * aLong9);
			aLong20 = aLong9 * 3063636397010139309L;
		}
		aLong14 = aLong9 * -5986901503151506423L;
		int i;
		for (/**/; 176241341 * anInt13 < aByteArray11.length; anInt13 += i * 1541476501) {
			int i_32_ = aByteArray11.length - 176241341 * anInt13;
			if (i_32_ > 200000000)
				i_32_ = 200000000;
			i = aClass19_17.method753(aByteArray11, anInt13 * 176241341, i_32_, (byte) 12);
			if (-1 == i)
				break;
			aLong20 += -8513339312163631557L * (long) i;
		}
	}

	void method510() throws IOException {
		if (aLong15 * -2957283407649930469L != -1L) {
			if (7019125770131954419L * aLong20 != -2957283407649930469L * aLong15) {
				aClass19_17.method749(-2957283407649930469L * aLong15);
				aLong20 = aLong15 * -4376718079516446407L;
			}
			aClass19_17.method760(aByteArray10, 0, anInt16 * -695299283, (byte) 76);
			aLong20 += -4137128128995024545L * (long) anInt16;
			if (aLong20 * 7019125770131954419L > 7831094144256977097L * aLong12)
				aLong12 = aLong20 * -5096093718177300517L;
			long l = -1L;
			long l_33_ = -1L;
			if ((-2957283407649930469L * aLong15 >= 5842985433272014911L * aLong14) && (-2957283407649930469L * aLong15 < 5842985433272014911L * aLong14 + (long) (anInt13 * 176241341)))
				l = aLong15 * -2957283407649930469L;
			else if ((aLong14 * 5842985433272014911L >= aLong15 * -2957283407649930469L) && (aLong14 * 5842985433272014911L < ((long) (-695299283 * anInt16) + -2957283407649930469L * aLong15)))
				l = 5842985433272014911L * aLong14;
			if ((((long) (anInt16 * -695299283) + aLong15 * -2957283407649930469L) > aLong14 * 5842985433272014911L) && (-2957283407649930469L * aLong15 + (long) (-695299283 * anInt16) <= ((long) (176241341 * anInt13) + aLong14 * 5842985433272014911L)))
				l_33_ = ((long) (-695299283 * anInt16) + aLong15 * -2957283407649930469L);
			else if ((((long) (anInt13 * 176241341) + 5842985433272014911L * aLong14) > aLong15 * -2957283407649930469L) && (((long) (anInt13 * 176241341) + aLong14 * 5842985433272014911L) <= ((long) (-695299283 * anInt16) + -2957283407649930469L * aLong15)))
				l_33_ = 5842985433272014911L * aLong14 + (long) (176241341 * anInt13);
			if (l > -1L && l_33_ > l) {
				int i = (int) (l_33_ - l);
				System.arraycopy(aByteArray10, (int) (l - -2957283407649930469L * aLong15), aByteArray11, (int) (l - 5842985433272014911L * aLong14), i);
			}
			aLong15 = 7625285407943155949L;
			anInt16 = 0;
		}
	}

	public void method511(byte[] is, int i, int i_34_) throws IOException {
		do {
			try {
				if (aLong9 * -6068535747011633609L + (long) i_34_ > aLong19 * -3768516185403201073L)
					aLong19 = ((aLong9 * -6068535747011633609L + (long) i_34_) * 8469539789884554543L);
				if (-2957283407649930469L * aLong15 != -1L && ((-6068535747011633609L * aLong9 < aLong15 * -2957283407649930469L) || (-6068535747011633609L * aLong9 > (aLong15 * -2957283407649930469L + (long) (-695299283 * anInt16)))))
					method498(315443864);
				if (-2957283407649930469L * aLong15 != -1L && (-6068535747011633609L * aLong9 + (long) i_34_ > ((long) aByteArray10.length + -2957283407649930469L * aLong15))) {
					int i_35_ = (int) ((long) aByteArray10.length - (-6068535747011633609L * aLong9 - aLong15 * -2957283407649930469L));
					System.arraycopy(is, i, aByteArray10, (int) (-6068535747011633609L * aLong9 - -2957283407649930469L * aLong15), i_35_);
					aLong9 += 496919880189835143L * (long) i_35_;
					i += i_35_;
					i_34_ -= i_35_;
					anInt16 = -624020315 * aByteArray10.length;
					method498(-1548472363);
				}
				if (i_34_ > aByteArray10.length) {
					if (7019125770131954419L * aLong20 != aLong9 * -6068535747011633609L) {
						aClass19_17.method749(aLong9 * -6068535747011633609L);
						aLong20 = 3063636397010139309L * aLong9;
					}
					aClass19_17.method760(is, i, i_34_, (byte) 27);
					aLong20 += -8513339312163631557L * (long) i_34_;
					if (aLong20 * 7019125770131954419L > aLong12 * 7831094144256977097L)
						aLong12 = -5096093718177300517L * aLong20;
					long l = -1L;
					long l_36_ = -1L;
					if ((aLong9 * -6068535747011633609L >= 5842985433272014911L * aLong14) && (-6068535747011633609L * aLong9 < (5842985433272014911L * aLong14 + (long) (176241341 * anInt13))))
						l = aLong9 * -6068535747011633609L;
					else if ((aLong14 * 5842985433272014911L >= aLong9 * -6068535747011633609L) && (aLong14 * 5842985433272014911L < ((long) i_34_ + -6068535747011633609L * aLong9)))
						l = 5842985433272014911L * aLong14;
					if ((aLong9 * -6068535747011633609L + (long) i_34_ > 5842985433272014911L * aLong14) && ((long) i_34_ + aLong9 * -6068535747011633609L <= ((long) (anInt13 * 176241341) + 5842985433272014911L * aLong14)))
						l_36_ = aLong9 * -6068535747011633609L + (long) i_34_;
					else if (((5842985433272014911L * aLong14 + (long) (anInt13 * 176241341)) > aLong9 * -6068535747011633609L) && (((long) (176241341 * anInt13) + aLong14 * 5842985433272014911L) <= (-6068535747011633609L * aLong9 + (long) i_34_)))
						l_36_ = ((long) (anInt13 * 176241341) + 5842985433272014911L * aLong14);
					if (l > -1L && l_36_ > l) {
						int i_37_ = (int) (l_36_ - l);
						System.arraycopy(is, (int) ((long) i + l - (-6068535747011633609L * aLong9)), aByteArray11, (int) (l - (5842985433272014911L * aLong14)), i_37_);
					}
					aLong9 += (long) i_34_ * 496919880189835143L;
				} else {
					if (i_34_ <= 0)
						break;
					if (aLong15 * -2957283407649930469L == -1L)
						aLong15 = aLong9 * 3970946078556317461L;
					System.arraycopy(is, i, aByteArray10, (int) (aLong9 * -6068535747011633609L - -2957283407649930469L * aLong15), i_34_);
					aLong9 += 496919880189835143L * (long) i_34_;
					if ((aLong9 * -6068535747011633609L - -2957283407649930469L * aLong15) > (long) (-695299283 * anInt16))
						anInt16 = ((int) (-6068535747011633609L * aLong9 - aLong15 * -2957283407649930469L) * -624020315);
				}
			} catch (IOException ioexception) {
				aLong20 = 8513339312163631557L;
				throw ioexception;
			}
			break;
		} while (false);
	}

	void method512() throws IOException {
		if (aLong15 * -2957283407649930469L != -1L) {
			if (7019125770131954419L * aLong20 != -2957283407649930469L * aLong15) {
				aClass19_17.method749(-2957283407649930469L * aLong15);
				aLong20 = aLong15 * -4376718079516446407L;
			}
			aClass19_17.method760(aByteArray10, 0, anInt16 * -695299283, (byte) 51);
			aLong20 += -4137128128995024545L * (long) anInt16;
			if (aLong20 * 7019125770131954419L > 7831094144256977097L * aLong12)
				aLong12 = aLong20 * -5096093718177300517L;
			long l = -1L;
			long l_38_ = -1L;
			if ((-2957283407649930469L * aLong15 >= 5842985433272014911L * aLong14) && (-2957283407649930469L * aLong15 < 5842985433272014911L * aLong14 + (long) (anInt13 * 176241341)))
				l = aLong15 * -2957283407649930469L;
			else if ((aLong14 * 5842985433272014911L >= aLong15 * -2957283407649930469L) && (aLong14 * 5842985433272014911L < ((long) (-695299283 * anInt16) + -2957283407649930469L * aLong15)))
				l = 5842985433272014911L * aLong14;
			if ((((long) (anInt16 * -695299283) + aLong15 * -2957283407649930469L) > aLong14 * 5842985433272014911L) && (-2957283407649930469L * aLong15 + (long) (-695299283 * anInt16) <= ((long) (176241341 * anInt13) + aLong14 * 5842985433272014911L)))
				l_38_ = ((long) (-695299283 * anInt16) + aLong15 * -2957283407649930469L);
			else if ((((long) (anInt13 * 176241341) + 5842985433272014911L * aLong14) > aLong15 * -2957283407649930469L) && (((long) (anInt13 * 176241341) + aLong14 * 5842985433272014911L) <= ((long) (-695299283 * anInt16) + -2957283407649930469L * aLong15)))
				l_38_ = 5842985433272014911L * aLong14 + (long) (176241341 * anInt13);
			if (l > -1L && l_38_ > l) {
				int i = (int) (l_38_ - l);
				System.arraycopy(aByteArray10, (int) (l - -2957283407649930469L * aLong15), aByteArray11, (int) (l - 5842985433272014911L * aLong14), i);
			}
			aLong15 = 7625285407943155949L;
			anInt16 = 0;
		}
	}

	public long method513() {
		return -3768516185403201073L * aLong19;
	}

	void method514() throws IOException {
		if (aLong15 * -2957283407649930469L != -1L) {
			if (7019125770131954419L * aLong20 != -2957283407649930469L * aLong15) {
				aClass19_17.method749(-2957283407649930469L * aLong15);
				aLong20 = aLong15 * -4376718079516446407L;
			}
			aClass19_17.method760(aByteArray10, 0, anInt16 * -695299283, (byte) 57);
			aLong20 += -4137128128995024545L * (long) anInt16;
			if (aLong20 * 7019125770131954419L > 7831094144256977097L * aLong12)
				aLong12 = aLong20 * -5096093718177300517L;
			long l = -1L;
			long l_39_ = -1L;
			if ((-2957283407649930469L * aLong15 >= 5842985433272014911L * aLong14) && (-2957283407649930469L * aLong15 < 5842985433272014911L * aLong14 + (long) (anInt13 * 176241341)))
				l = aLong15 * -2957283407649930469L;
			else if ((aLong14 * 5842985433272014911L >= aLong15 * -2957283407649930469L) && (aLong14 * 5842985433272014911L < ((long) (-695299283 * anInt16) + -2957283407649930469L * aLong15)))
				l = 5842985433272014911L * aLong14;
			if ((((long) (anInt16 * -695299283) + aLong15 * -2957283407649930469L) > aLong14 * 5842985433272014911L) && (-2957283407649930469L * aLong15 + (long) (-695299283 * anInt16) <= ((long) (176241341 * anInt13) + aLong14 * 5842985433272014911L)))
				l_39_ = ((long) (-695299283 * anInt16) + aLong15 * -2957283407649930469L);
			else if ((((long) (anInt13 * 176241341) + 5842985433272014911L * aLong14) > aLong15 * -2957283407649930469L) && (((long) (anInt13 * 176241341) + aLong14 * 5842985433272014911L) <= ((long) (-695299283 * anInt16) + -2957283407649930469L * aLong15)))
				l_39_ = 5842985433272014911L * aLong14 + (long) (176241341 * anInt13);
			if (l > -1L && l_39_ > l) {
				int i = (int) (l_39_ - l);
				System.arraycopy(aByteArray10, (int) (l - -2957283407649930469L * aLong15), aByteArray11, (int) (l - 5842985433272014911L * aLong14), i);
			}
			aLong15 = 7625285407943155949L;
			anInt16 = 0;
		}
	}

	public static Class45 method515(byte i) {
		Class19 class19 = null;
		try {
			Class45 class45;
			try {
				class19 = Class32.method944("3", client.aClass678_11259.aString8616, false, (byte) 97);
				byte[] is = new byte[(int) class19.method752(2026825835)];
				int i_40_;
				for (int i_41_ = 0; i_41_ < is.length; i_41_ += i_40_) {
					i_40_ = class19.method753(is, i_41_, is.length - i_41_, (byte) 12);
					if (i_40_ == -1)
						throw new EOFException();
				}
				class45 = new Class45(new RSByteBuffer(is));
			} catch (Exception exception) {
				Class45 class45_42_ = new Class45();
				try {
					if (class19 != null)
						class19.method751((byte) -46);
				} catch (Exception exception_43_) {
					/* empty */
				}
				return class45_42_;
			}
			try {
				if (class19 != null)
					class19.method751((byte) 12);
			} catch (Exception exception) {
				/* empty */
			}
			return class45;
		} catch (Exception object) {
			try {
				if (class19 != null)
					class19.method751((byte) -42);
			} catch (Exception exception) {
				/* empty */
			}
			throw object;
		}
	}
}
