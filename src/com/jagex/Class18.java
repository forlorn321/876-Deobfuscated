/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.EOFException;
import java.io.IOException;

public class Class18 {
	long aLong187;
	Class6 aClass6_188;
	byte[] aByteArray189;
	public static Class184 aClass184_190;
	long aLong191 = 4959175407544468093L;
	byte[] aByteArray192;
	static final int anInt193 = 200000000;
	int anInt194;
	long aLong195;
	long aLong196;
	int anInt197;
	long aLong198;
	long aLong199 = -694675203779731049L;

	public void method672(int i) throws IOException {
		method679(2051316463);
		aClass6_188.method585(-1411037171);
	}

	public void method673(long l) throws IOException {
		if (l < 0L)
			throw new IOException();
		aLong195 = 985725911870710859L * l;
	}

	public long method674(int i) {
		return -4139965294413894319L * aLong187;
	}

	void method675(byte i) throws IOException {
		anInt197 = 0;
		if (aLong195 * 5526509938323883363L != aLong198 * -3881699947241150589L) {
			aClass6_188.method583(aLong195 * 5526509938323883363L);
			aLong198 = aLong195 * -130872875752151903L;
		}
		aLong191 = 4767418873865902249L * aLong195;
		int i_0_;
		for (/**/; -162493831 * anInt197 < aByteArray189.length; anInt197 += 38518729 * i_0_) {
			int i_1_ = aByteArray189.length - anInt197 * -162493831;
			if (i_1_ > 200000000)
				i_1_ = 200000000;
			i_0_ = aClass6_188.method587(aByteArray189, anInt197 * -162493831, i_1_, -1547506245);
			if (-1 == i_0_)
				break;
			aLong198 += (long) i_0_ * -6527836322445795541L;
		}
	}

	public void method676(byte[] is, int i, int i_2_, int i_3_) throws IOException {
		try {
			if (i_2_ + i > is.length)
				throw new ArrayIndexOutOfBoundsException(i_2_ + i - is.length);
			if (aLong199 * -6177348949580492327L != -1L && (5526509938323883363L * aLong195 >= -6177348949580492327L * aLong199) && ((long) i_2_ + aLong195 * 5526509938323883363L <= ((long) (anInt194 * 1538276455) + -6177348949580492327L * aLong199))) {
				System.arraycopy(aByteArray192, (int) (aLong195 * 5526509938323883363L - -6177348949580492327L * aLong199), is, i, i_2_);
				aLong195 += (long) i_2_ * 985725911870710859L;
				return;
			}
			long l = 5526509938323883363L * aLong195;
			int i_4_ = i;
			int i_5_ = i_2_;
			if ((aLong195 * 5526509938323883363L >= -9161898460855961301L * aLong191) && (5526509938323883363L * aLong195 < (aLong191 * -9161898460855961301L + (long) (anInt197 * -162493831)))) {
				int i_6_ = (int) ((long) (anInt197 * -162493831) - (aLong195 * 5526509938323883363L - aLong191 * -9161898460855961301L));
				if (i_6_ > i_2_)
					i_6_ = i_2_;
				System.arraycopy(aByteArray189, (int) (5526509938323883363L * aLong195 - aLong191 * -9161898460855961301L), is, i, i_6_);
				aLong195 += (long) i_6_ * 985725911870710859L;
				i += i_6_;
				i_2_ -= i_6_;
			}
			if (i_2_ > aByteArray189.length) {
				aClass6_188.method583(5526509938323883363L * aLong195);
				aLong198 = aLong195 * -130872875752151903L;
				int i_7_;
				for (/**/; i_2_ > 0; i_2_ -= i_7_) {
					i_7_ = aClass6_188.method587(is, i, i_2_, -489049147);
					if (i_7_ == -1)
						break;
					aLong198 += (long) i_7_ * -6527836322445795541L;
					aLong195 += 985725911870710859L * (long) i_7_;
					i += i_7_;
				}
			} else if (i_2_ > 0) {
				method675((byte) -118);
				int i_8_ = i_2_;
				if (i_8_ > anInt197 * -162493831)
					i_8_ = anInt197 * -162493831;
				System.arraycopy(aByteArray189, 0, is, i, i_8_);
				i += i_8_;
				i_2_ -= i_8_;
				aLong195 += 985725911870710859L * (long) i_8_;
			}
			if (aLong199 * -6177348949580492327L != -1L) {
				if ((-6177348949580492327L * aLong199 > 5526509938323883363L * aLong195) && i_2_ > 0) {
					int i_9_ = ((int) (aLong199 * -6177348949580492327L - aLong195 * 5526509938323883363L) + i);
					if (i_9_ > i_2_ + i)
						i_9_ = i_2_ + i;
					while (i < i_9_) {
						is[i++] = (byte) 0;
						i_2_--;
						aLong195 += 985725911870710859L;
					}
				}
				long l_10_ = -1L;
				long l_11_ = -1L;
				if (aLong199 * -6177348949580492327L >= l && -6177348949580492327L * aLong199 < l + (long) i_5_)
					l_10_ = -6177348949580492327L * aLong199;
				else if (l >= -6177348949580492327L * aLong199 && l < ((long) (anInt194 * 1538276455) + -6177348949580492327L * aLong199))
					l_10_ = l;
				if (((long) (1538276455 * anInt194) + -6177348949580492327L * aLong199) > l && ((long) (anInt194 * 1538276455) + aLong199 * -6177348949580492327L) <= l + (long) i_5_)
					l_11_ = (aLong199 * -6177348949580492327L + (long) (anInt194 * 1538276455));
				else if (l + (long) i_5_ > -6177348949580492327L * aLong199 && ((long) i_5_ + l <= ((long) (1538276455 * anInt194) + -6177348949580492327L * aLong199)))
					l_11_ = (long) i_5_ + l;
				if (l_10_ > -1L && l_11_ > l_10_) {
					int i_12_ = (int) (l_11_ - l_10_);
					System.arraycopy(aByteArray192, (int) (l_10_ - (-6177348949580492327L * aLong199)), is, (int) (l_10_ - l) + i_4_, i_12_);
					if (l_11_ > 5526509938323883363L * aLong195) {
						i_2_ -= l_11_ - 5526509938323883363L * aLong195;
						aLong195 = l_11_ * 985725911870710859L;
					}
				}
			}
		} catch (IOException ioexception) {
			aLong198 = 6527836322445795541L;
			throw ioexception;
		}
		if (i_2_ > 0)
			throw new EOFException();
	}

	public void method677() throws IOException {
		method679(2051316463);
		aClass6_188.method585(-1411037171);
	}

	public void method678(byte[] is, int i, int i_13_, int i_14_) throws IOException {
		do {
			try {
				if (aLong195 * 5526509938323883363L + (long) i_13_ > aLong187 * -4139965294413894319L)
					aLong187 = (5526509938323883363L * aLong195 + (long) i_13_) * 7641596323336797105L;
				if (aLong199 * -6177348949580492327L != -1L && ((aLong195 * 5526509938323883363L < aLong199 * -6177348949580492327L) || (aLong195 * 5526509938323883363L > (aLong199 * -6177348949580492327L + (long) (1538276455 * anInt194)))))
					method679(2051316463);
				if (-6177348949580492327L * aLong199 != -1L && ((long) i_13_ + aLong195 * 5526509938323883363L > (aLong199 * -6177348949580492327L + (long) aByteArray192.length))) {
					int i_15_ = (int) ((long) aByteArray192.length - (5526509938323883363L * aLong195 - aLong199 * -6177348949580492327L));
					System.arraycopy(is, i, aByteArray192, (int) (5526509938323883363L * aLong195 - (-6177348949580492327L * aLong199)), i_15_);
					aLong195 += (long) i_15_ * 985725911870710859L;
					i += i_15_;
					i_13_ -= i_15_;
					anInt194 = aByteArray192.length * 50143063;
					method679(2051316463);
				}
				if (i_13_ > aByteArray192.length) {
					if (-3881699947241150589L * aLong198 != 5526509938323883363L * aLong195) {
						aClass6_188.method583(aLong195 * 5526509938323883363L);
						aLong198 = aLong195 * -130872875752151903L;
					}
					aClass6_188.method584(is, i, i_13_, (byte) 1);
					aLong198 += -6527836322445795541L * (long) i_13_;
					if (aLong198 * -3881699947241150589L > aLong196 * -7865984452899838095L)
						aLong196 = -2762400689929679821L * aLong198;
					long l = -1L;
					long l_16_ = -1L;
					if ((aLong195 * 5526509938323883363L >= -9161898460855961301L * aLong191) && (aLong195 * 5526509938323883363L < ((long) (-162493831 * anInt197) + aLong191 * -9161898460855961301L)))
						l = aLong195 * 5526509938323883363L;
					else if ((-9161898460855961301L * aLong191 >= 5526509938323883363L * aLong195) && (aLong191 * -9161898460855961301L < (5526509938323883363L * aLong195 + (long) i_13_)))
						l = -9161898460855961301L * aLong191;
					if (((long) i_13_ + 5526509938323883363L * aLong195 > aLong191 * -9161898460855961301L) && (aLong195 * 5526509938323883363L + (long) i_13_ <= (aLong191 * -9161898460855961301L + (long) (-162493831 * anInt197))))
						l_16_ = (long) i_13_ + aLong195 * 5526509938323883363L;
					else if (((aLong191 * -9161898460855961301L + (long) (-162493831 * anInt197)) > aLong195 * 5526509938323883363L) && ((aLong191 * -9161898460855961301L + (long) (-162493831 * anInt197)) <= ((long) i_13_ + aLong195 * 5526509938323883363L)))
						l_16_ = ((long) (-162493831 * anInt197) + aLong191 * -9161898460855961301L);
					if (l > -1L && l_16_ > l) {
						int i_17_ = (int) (l_16_ - l);
						System.arraycopy(is, (int) ((long) i + l - (5526509938323883363L * aLong195)), aByteArray189, (int) (l - (-9161898460855961301L * aLong191)), i_17_);
					}
					aLong195 += (long) i_13_ * 985725911870710859L;
				} else {
					if (i_13_ <= 0)
						break;
					if (-1L == aLong199 * -6177348949580492327L)
						aLong199 = aLong195 * 3720092219428425627L;
					System.arraycopy(is, i, aByteArray192, (int) (aLong195 * 5526509938323883363L - (-6177348949580492327L * aLong199)), i_13_);
					aLong195 += 985725911870710859L * (long) i_13_;
					if ((aLong195 * 5526509938323883363L - -6177348949580492327L * aLong199) > (long) (anInt194 * 1538276455))
						anInt194 = (50143063 * (int) (5526509938323883363L * aLong195 - -6177348949580492327L * aLong199));
				}
			} catch (IOException ioexception) {
				aLong198 = 6527836322445795541L;
				throw ioexception;
			}
			break;
		} while (false);
	}

	void method679(int i) throws IOException {
		if (-1L != aLong199 * -6177348949580492327L) {
			if (-3881699947241150589L * aLong198 != -6177348949580492327L * aLong199) {
				aClass6_188.method583(aLong199 * -6177348949580492327L);
				aLong198 = 3344452752668345971L * aLong199;
			}
			aClass6_188.method584(aByteArray192, 0, 1538276455 * anInt194, (byte) 1);
			aLong198 += (long) anInt194 * 3151301708742057549L;
			if (aLong198 * -3881699947241150589L > -7865984452899838095L * aLong196)
				aLong196 = aLong198 * -2762400689929679821L;
			long l = -1L;
			long l_18_ = -1L;
			if ((aLong199 * -6177348949580492327L >= -9161898460855961301L * aLong191) && (aLong199 * -6177348949580492327L < ((long) (-162493831 * anInt197) + -9161898460855961301L * aLong191)))
				l = aLong199 * -6177348949580492327L;
			else if ((aLong191 * -9161898460855961301L >= -6177348949580492327L * aLong199) && (-9161898460855961301L * aLong191 < ((long) (anInt194 * 1538276455) + -6177348949580492327L * aLong199)))
				l = aLong191 * -9161898460855961301L;
			if ((aLong199 * -6177348949580492327L + (long) (anInt194 * 1538276455) > aLong191 * -9161898460855961301L) && (((long) (anInt194 * 1538276455) + aLong199 * -6177348949580492327L) <= ((long) (anInt197 * -162493831) + aLong191 * -9161898460855961301L)))
				l_18_ = ((long) (anInt194 * 1538276455) + aLong199 * -6177348949580492327L);
			else if ((aLong191 * -9161898460855961301L + (long) (anInt197 * -162493831) > -6177348949580492327L * aLong199) && (((long) (anInt197 * -162493831) + -9161898460855961301L * aLong191) <= (aLong199 * -6177348949580492327L + (long) (1538276455 * anInt194))))
				l_18_ = aLong191 * -9161898460855961301L + (long) (anInt197 * -162493831);
			if (l > -1L && l_18_ > l) {
				int i_19_ = (int) (l_18_ - l);
				System.arraycopy(aByteArray192, (int) (l - -6177348949580492327L * aLong199), aByteArray189, (int) (l - aLong191 * -9161898460855961301L), i_19_);
			}
			aLong199 = -694675203779731049L;
			anInt194 = 0;
		}
	}

	public long method680() {
		return -4139965294413894319L * aLong187;
	}

	public void method681() throws IOException {
		method679(2051316463);
		aClass6_188.method585(-1411037171);
	}

	public void method682() throws IOException {
		method679(2051316463);
		aClass6_188.method585(-1411037171);
	}

	void method683() throws IOException {
		if (-1L != aLong199 * -6177348949580492327L) {
			if (-3881699947241150589L * aLong198 != -6177348949580492327L * aLong199) {
				aClass6_188.method583(aLong199 * -6177348949580492327L);
				aLong198 = 3344452752668345971L * aLong199;
			}
			aClass6_188.method584(aByteArray192, 0, 1538276455 * anInt194, (byte) 1);
			aLong198 += (long) anInt194 * 3151301708742057549L;
			if (aLong198 * -3881699947241150589L > -7865984452899838095L * aLong196)
				aLong196 = aLong198 * -2762400689929679821L;
			long l = -1L;
			long l_20_ = -1L;
			if ((aLong199 * -6177348949580492327L >= -9161898460855961301L * aLong191) && (aLong199 * -6177348949580492327L < ((long) (-162493831 * anInt197) + -9161898460855961301L * aLong191)))
				l = aLong199 * -6177348949580492327L;
			else if ((aLong191 * -9161898460855961301L >= -6177348949580492327L * aLong199) && (-9161898460855961301L * aLong191 < ((long) (anInt194 * 1538276455) + -6177348949580492327L * aLong199)))
				l = aLong191 * -9161898460855961301L;
			if ((aLong199 * -6177348949580492327L + (long) (anInt194 * 1538276455) > aLong191 * -9161898460855961301L) && (((long) (anInt194 * 1538276455) + aLong199 * -6177348949580492327L) <= ((long) (anInt197 * -162493831) + aLong191 * -9161898460855961301L)))
				l_20_ = ((long) (anInt194 * 1538276455) + aLong199 * -6177348949580492327L);
			else if ((aLong191 * -9161898460855961301L + (long) (anInt197 * -162493831) > -6177348949580492327L * aLong199) && (((long) (anInt197 * -162493831) + -9161898460855961301L * aLong191) <= (aLong199 * -6177348949580492327L + (long) (1538276455 * anInt194))))
				l_20_ = aLong191 * -9161898460855961301L + (long) (anInt197 * -162493831);
			if (l > -1L && l_20_ > l) {
				int i = (int) (l_20_ - l);
				System.arraycopy(aByteArray192, (int) (l - -6177348949580492327L * aLong199), aByteArray189, (int) (l - aLong191 * -9161898460855961301L), i);
			}
			aLong199 = -694675203779731049L;
			anInt194 = 0;
		}
	}

	public void method684() throws IOException {
		method679(2051316463);
		aClass6_188.method585(-1411037171);
	}

	public Class18(Class6 class6, int i, int i_21_) throws IOException {
		anInt194 = 0;
		aClass6_188 = class6;
		aLong187 = ((aLong196 = class6.method586(917143623) * -6895279690123511407L) * 2484611989629997089L);
		aByteArray189 = new byte[i];
		aByteArray192 = new byte[i_21_];
		aLong195 = 0L;
	}

	public void method685(byte[] is, byte i) throws IOException {
		method676(is, 0, is.length, 1836287027);
	}

	static void method686(Class433 class433, Class443 class443, int i, int i_22_, int i_23_) {
		if (Class70.aClass443_777 == null)
			Class70.aClass443_777 = new Class443(class443);
		else
			Class70.aClass443_777.method5339(class443);
		Class70.aClass433_779.method5190(class433);
		Class70.anInt775 = 1972079315 * i;
		Class70.anInt772 = 2007170733 * i_22_;
	}

	static final void method687(byte i) {
		if (client.aFloat11271 < 1032.0F)
			client.aFloat11271 = 1032.0F;
		if (client.aFloat11271 > 2821.0F)
			client.aFloat11271 = 2821.0F;
		for (/**/; client.aFloat11106 >= 16384.0F; client.aFloat11106 -= 16384.0F) {
			/* empty */
		}
		for (/**/; client.aFloat11106 < 0.0F; client.aFloat11106 += 16384.0F) {
			/* empty */
		}
		Class455 class455 = client.aClass515_11066.method6251(-736961523);
		Class553 class553 = client.aClass515_11066.method6249(384881812);
		int i_24_ = Class461.anInt5216 * -787333673 >> 9;
		int i_25_ = -1817694149 * Class222.anInt2326 >> 9;
		int i_26_ = Class54.method944(-787333673 * Class461.anInt5216, -1817694149 * Class222.anInt2326, Class320.anInt3539 * -989431627, 2138078571);
		int i_27_ = 0;
		if (i_24_ > 3 && i_25_ > 3 && i_24_ < client.aClass515_11066.method6321((byte) -4) - 4 && i_25_ < client.aClass515_11066.method6243(177401017) - 4) {
			for (int i_28_ = i_24_ - 4; i_28_ <= i_24_ + 4; i_28_++) {
				for (int i_29_ = i_25_ - 4; i_29_ <= i_25_ + 4; i_29_++) {
					int i_30_ = -989431627 * Class320.anInt3539;
					if (i_30_ < 3 && class455.method5466(i_28_, i_29_, (byte) -24))
						i_30_++;
					int i_31_ = 0;
					byte[][] is = client.aClass515_11066.method6250(i_30_, 1241710909);
					if (null != is)
						i_31_ = 8 * (is[i_28_][i_29_] & 0xff) << 2;
					if (class553.aClass160Array7431 != null && class553.aClass160Array7431[i_30_] != null) {
						int i_32_ = i_26_ - (class553.aClass160Array7431[i_30_].method1927(i_28_, i_29_, 744032595) - i_31_);
						if (i_32_ > i_27_)
							i_27_ = i_32_;
					}
				}
			}
		}
		int i_33_ = 1536 * (i_27_ >> 2);
		if (i_33_ > 786432)
			i_33_ = 786432;
		if (i_33_ < 262144)
			i_33_ = 262144;
		if (i_33_ > client.anInt11312 * -1639712795)
			client.anInt11312 += -1174704659 * ((i_33_ - -1639712795 * client.anInt11312) / 24);
		else if (i_33_ < -1639712795 * client.anInt11312)
			client.anInt11312 += -1174704659 * ((i_33_ - client.anInt11312 * -1639712795) / 80);
	}

	public static void method688(NPC class649_sub1_sub5_sub1_sub1, int i) {
		for (Class536_Sub3 class536_sub3 = ((Class536_Sub3) Class536_Sub3.aClass708_10386.method8308(1867269829)); class536_sub3 != null; class536_sub3 = (Class536_Sub3) Class536_Sub3.aClass708_10386.method8311(1512043747)) {
			if (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub1_10378 == class649_sub1_sub5_sub1_sub1) {
				if (class536_sub3.aClass479_10389 != null) {
					class536_sub3.aClass479_10389.method5774(100, (byte) 32);
					Class184_Sub2.aClass211_9442.method3002((class536_sub3.aClass479_10389), -1092963117);
					class536_sub3.aClass479_10389 = null;
				}
				class536_sub3.method6484(1540125788);
				break;
			}
		}
	}
}
