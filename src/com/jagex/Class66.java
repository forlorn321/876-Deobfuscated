/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Container;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Class66 {
	static final int anInt720 = 1;
	static final int anInt721 = 10;
	LinkedHashMap aLinkedHashMap722 = new LinkedHashMap();
	public static int anInt723;
	public static Class536_Sub15 aClass536_Sub15_724;

	Class66() {
		this(null);
	}

	void method1064(long l, int i, byte i_0_) {
		if (aLinkedHashMap722.size() >= 10 && !aLinkedHashMap722.containsKey(Long.valueOf(l))) {
			Iterator iterator = aLinkedHashMap722.entrySet().iterator();
			iterator.next();
			iterator.remove();
		}
		aLinkedHashMap722.put(Long.valueOf(l), Integer.valueOf(i));
		method1067(205040632);
	}

	boolean method1065(long l) {
		return aLinkedHashMap722.containsKey(Long.valueOf(l));
	}

	int method1066(long l) {
		return ((Integer) aLinkedHashMap722.get(Long.valueOf(l))).intValue();
	}

	void method1067(int i) {
		Class6 class6 = null;
		do {
			try {
				try {
					class6 = Class153_Sub1.method8383("3", (client.aClass670_11043.aString8573), true, 1931241128);
					RSByteBuffer class536_sub33 = new RSByteBuffer(5000);
					method1068(class536_sub33, 2139835010);
					class6.method584(class536_sub33.buffer, 0, class536_sub33.off * -810172525, (byte) 1);
				} catch (Exception exception) {
					try {
						if (null != class6)
							class6.method585(-1411037171);
					} catch (Exception exception_1_) {
						exception = exception_1_;
					}
					break;
				}
				try {
					if (null != class6)
						class6.method585(-1411037171);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					if (null != class6)
						class6.method585(-1411037171);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
	}

	void method1068(RSByteBuffer class536_sub33, int i) {
		class536_sub33.writeByte(1);
		class536_sub33.writeByte(aLinkedHashMap722.size());
		Iterator iterator = aLinkedHashMap722.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			class536_sub33.writeLong(((Long) entry.getKey()).longValue());
			class536_sub33.writeInt(((Integer) entry.getValue()).intValue());
		}
	}

	void method1069() {
		Class6 class6 = null;
		do {
			try {
				try {
					class6 = Class153_Sub1.method8383("3", (client.aClass670_11043.aString8573), true, 2092691719);
					RSByteBuffer class536_sub33 = new RSByteBuffer(5000);
					method1068(class536_sub33, 1625051152);
					class6.method584(class536_sub33.buffer, 0, class536_sub33.off * -810172525, (byte) 1);
				} catch (Exception exception) {
					try {
						if (null != class6)
							class6.method585(-1411037171);
					} catch (Exception exception_2_) {
						exception = exception_2_;
					}
					break;
				}
				try {
					if (null != class6)
						class6.method585(-1411037171);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					if (null != class6)
						class6.method585(-1411037171);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
	}

	void method1070(RSByteBuffer class536_sub33) {
		class536_sub33.writeByte(1);
		class536_sub33.writeByte(aLinkedHashMap722.size());
		Iterator iterator = aLinkedHashMap722.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			class536_sub33.writeLong(((Long) entry.getKey()).longValue());
			class536_sub33.writeInt(((Integer) entry.getValue()).intValue());
		}
	}

	void method1071(RSByteBuffer class536_sub33) {
		class536_sub33.writeByte(1);
		class536_sub33.writeByte(aLinkedHashMap722.size());
		Iterator iterator = aLinkedHashMap722.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			class536_sub33.writeLong(((Long) entry.getKey()).longValue());
			class536_sub33.writeInt(((Integer) entry.getValue()).intValue());
		}
	}

	void method1072() {
		Class6 class6 = null;
		do {
			try {
				try {
					class6 = Class153_Sub1.method8383("3", (client.aClass670_11043.aString8573), true, 2117758360);
					RSByteBuffer class536_sub33 = new RSByteBuffer(5000);
					method1068(class536_sub33, 1389708566);
					class6.method584(class536_sub33.buffer, 0, class536_sub33.off * -810172525, (byte) 1);
				} catch (Exception exception) {
					try {
						if (null != class6)
							class6.method585(-1411037171);
					} catch (Exception exception_3_) {
						exception = exception_3_;
					}
					break;
				}
				try {
					if (null != class6)
						class6.method585(-1411037171);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					if (null != class6)
						class6.method585(-1411037171);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
	}

	Class66(RSByteBuffer class536_sub33) {
		if (class536_sub33 != null && class536_sub33.buffer != null) {
			int i = class536_sub33.readUnsignedByte();
			if (i > 0 && i <= 1) {
				int i_4_ = class536_sub33.readUnsignedByte();
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
					long l = class536_sub33.readLong(702869087);
					int i_6_ = class536_sub33.readInt();
					aLinkedHashMap722.put(Long.valueOf(l), Integer.valueOf(i_6_));
				}
			}
		}
	}

	static Class236[] method1073(int i) {
		return (new Class236[] { Class236.aClass236_2389, Class236.aClass236_2391, Class236.aClass236_2392, Class236.aClass236_2394, Class236.aClass236_2403, Class236.aClass236_2388, Class236.aClass236_2405, Class236.aClass236_2390, Class236.aClass236_2401, Class236.aClass236_2399, Class236.aClass236_2402, Class236.aClass236_2395, Class236.aClass236_2400, Class236.aClass236_2397, Class236.aClass236_2398, Class236.aClass236_2396, Class236.aClass236_2393, Class236.aClass236_2404 });
	}

	static final void method1074(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_7_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_8_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		Class273.method3730(8, i_7_, i_8_, "", -1849279929);
	}

	static void method1075(int i) {
		synchronized (Class313.aclient3500) {
			if (Class223.aFrame2336 != null) {
				/* empty */
			} else {
				Container container = Class300.method4022((byte) 0);
				if (container == null) {
					/* empty */
				} else {
					Class500.anInt6841 = container.getSize().width * -186574765;
					Class313.anInt3499 = container.getSize().height * 558289937;
					if (Class145.aFrame1692 == container) {
						Insets insets = Class145.aFrame1692.getInsets();
						Class500.anInt6841 -= (insets.left + insets.right) * -186574765;
						Class313.anInt3499 -= (insets.bottom + insets.top) * 558289937;
					}
					if (Class500.anInt6841 * 569699291 <= 0)
						Class500.anInt6841 = -186574765;
					if (Class313.anInt3499 * 160996593 <= 0)
						Class313.anInt3499 = 558289937;
					if (Class315.method4212((byte) 89) != 1)
						Class521.method6359((byte) 2);
					else {
						Class144.anInt1679 = -1243488649 * client.anInt11152;
						client.anInt6887 = -257990163 * ((569699291 * Class500.anInt6841 - -125739413 * client.anInt11152) / 2);
						Class34_Sub6.anInt10965 = 1249541775 * client.anInt11153;
						client.anInt6863 = 0;
					}
					if (Class678.aClass678_8619 != Class47.aClass678_578 && Class144.anInt1679 * -1804846931 < 1024 && Class34_Sub6.anInt10965 * 589116499 >= 768) {
						/* empty */
					}
					Class399.aCanvas4127.setSize((-1804846931 * Class144.anInt1679), (589116499 * Class34_Sub6.anInt10965));
					if (null != Class677.aClass167_8609) {
						Class677.aClass167_8609.method2027(Class399.aCanvas4127, Class144.anInt1679 * -1804846931, 589116499 * Class34_Sub6.anInt10965, 246081817);
						Class141.method1716(Class677.aClass167_8609, Class249.method3450(1338048193));
					}
					if (container == Class145.aFrame1692) {
						Insets insets = Class145.aFrame1692.getInsets();
						Class399.aCanvas4127.setLocation(insets.left + 1509041125 * client.anInt6887, -1413419225 * client.anInt6863 + insets.top);
					} else
						Class399.aCanvas4127.setLocation((client.anInt6887 * 1509041125), (client.anInt6863 * -1413419225));
					Class698.method8234(-1725088831);
					if (-1 != -1959825479 * client.anInt11187)
						Class325_Sub1.method9206(true, 250532183);
					Class477.method5751((byte) -82);
				}
			}
		}
	}

	static final void method1076(int i) {
		Class192.method2842(Class677.aClass167_8609, (long) client.cycles);
		if (-1 != client.anInt11187 * -1959825479)
			Class199.method2913(-1959825479 * client.anInt11187, 1237439912);
		for (int i_9_ = 0; i_9_ < -5823823 * client.anInt11245; i_9_++) {
			client.aBoolArray11029[i_9_] = client.aBoolArray11240[i_9_];
			client.aBoolArray11240[i_9_] = false;
		}
		client.anInt11246 = client.cycles * -1287148997;
		if (-1 != -1959825479 * client.anInt11187) {
			client.anInt11245 = 0;
			Class457.method5490(-972318091);
		}
		Class677.aClass167_8609.method2051();
		Class233.method3336(Class677.aClass167_8609, (byte) 99);
		int i_10_ = Class520.method6352(1900092918);
		if (-1 == i_10_)
			i_10_ = 181434031 * client.anInt11179;
		if (i_10_ == -1)
			i_10_ = client.anInt11178 * -551919553;
		Class458_Sub5.method9373(i_10_, (byte) -65);
		client.anInt11180 = 0;
	}

	public static int[] method1077(BufferedImage bufferedimage, int i) {
		if (bufferedimage.getType() == 10 || bufferedimage.getType() == 0) {
			int[] is = null;
			is = bufferedimage.getRaster().getPixels(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), is);
			int[] is_11_ = (new int[bufferedimage.getWidth() * bufferedimage.getHeight()]);
			if (bufferedimage.getType() == 10) {
				for (int i_12_ = 0; i_12_ < is_11_.length; i_12_++)
					is_11_[i_12_] = ((is[i_12_] << 16) + (is[i_12_] << 8) + is[i_12_] + -16777216);
			} else {
				for (int i_13_ = 0; i_13_ < is_11_.length; i_13_++) {
					int i_14_ = i_13_ * 2;
					is_11_[i_13_] = (is[i_14_] + (is[i_14_ + 1] << 24) + ((is[i_14_] << 16) + (is[i_14_] << 8)));
				}
			}
			return is_11_;
		}
		return bufferedimage.getRGB(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), null, 0, bufferedimage.getWidth());
	}
}
