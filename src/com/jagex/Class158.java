/* Class158 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class158 {
	public static int anInt1743;

	Class158() throws Throwable {
		throw new Error();
	}

	static final void method1887(Class668 class668, byte i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_0_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_0_ >> 16];
		Class171.method2429(class251, class234, class668, (byte) 56);
	}

	static final void method1888(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	public static void method1889(RSByteBuffer class536_sub33, int i, short i_1_) {
		Class536_Sub34 class536_sub34 = new Class536_Sub34();
		class536_sub34.anInt10619 = class536_sub33.readUnsignedByte(-957761069) * 1530398673;
		class536_sub34.anInt10621 = class536_sub33.readInt(265685866) * -251386325;
		class536_sub34.anIntArray10622 = new int[class536_sub34.anInt10619 * 1706012977];
		class536_sub34.anIntArray10624 = new int[1706012977 * class536_sub34.anInt10619];
		class536_sub34.aFieldArray10623 = new Field[class536_sub34.anInt10619 * 1706012977];
		class536_sub34.anIntArray10620 = new int[class536_sub34.anInt10619 * 1706012977];
		class536_sub34.aMethodArray10625 = new Method[class536_sub34.anInt10619 * 1706012977];
		class536_sub34.aByteArrayArrayArray10626 = new byte[class536_sub34.anInt10619 * 1706012977][][];
		for (int i_2_ = 0; i_2_ < class536_sub34.anInt10619 * 1706012977; i_2_++) {
			try {
				int i_3_ = class536_sub33.readUnsignedByte(-698733238);
				if (0 == i_3_ || 1 == i_3_ || i_3_ == 2) {
					String string = class536_sub33.readString((byte) 95);
					String string_4_ = class536_sub33.readString((byte) 120);
					int i_5_ = 0;
					if (1 == i_3_)
						i_5_ = class536_sub33.readInt(-1315305648);
					class536_sub34.anIntArray10622[i_2_] = i_3_;
					class536_sub34.anIntArray10620[i_2_] = i_5_;
					if (Class541.method6530(string, 885421783).getClassLoader() == null)
						throw new SecurityException();
					class536_sub34.aFieldArray10623[i_2_] = Class541.method6530(string, 2045140281).getDeclaredField(string_4_);
				} else if (i_3_ == 3 || i_3_ == 4) {
					String string = class536_sub33.readString((byte) 105);
					String string_6_ = class536_sub33.readString((byte) 87);
					int i_7_ = class536_sub33.readUnsignedByte(-61835438);
					String[] strings = new String[i_7_];
					for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
						strings[i_8_] = class536_sub33.readString((byte) 36);
					String string_9_ = class536_sub33.readString((byte) 126);
					byte[][] is = new byte[i_7_][];
					if (i_3_ == 3) {
						for (int i_10_ = 0; i_10_ < i_7_; i_10_++) {
							int i_11_ = class536_sub33.readInt(-1807773547);
							is[i_10_] = new byte[i_11_];
							class536_sub33.method9716(is[i_10_], 0, i_11_, -1013284220);
						}
					}
					class536_sub34.anIntArray10622[i_2_] = i_3_;
					Class[] var_classes = new Class[i_7_];
					for (int i_12_ = 0; i_12_ < i_7_; i_12_++)
						var_classes[i_12_] = Class541.method6530(strings[i_12_], 682870790);
					Class var_class = Class541.method6530(string_9_, 327386853);
					if (Class541.method6530(string, 1173672077).getClassLoader() == null)
						throw new SecurityException();
					Method[] methods = Class541.method6530(string, 1178921240).getDeclaredMethods();
					Method[] methods_13_ = methods;
					for (int i_14_ = 0; i_14_ < methods_13_.length; i_14_++) {
						Method method = methods_13_[i_14_];
						if (method.getName().equals(string_6_)) {
							Class[] var_classes_15_ = method.getParameterTypes();
							if (var_classes.length == var_classes_15_.length) {
								boolean bool = true;
								for (int i_16_ = 0; i_16_ < var_classes.length; i_16_++) {
									if (var_classes_15_[i_16_] != var_classes[i_16_]) {
										bool = false;
										break;
									}
								}
								if (bool && var_class == method.getReturnType())
									class536_sub34.aMethodArray10625[i_2_] = method;
							}
						}
					}
					class536_sub34.aByteArrayArrayArray10626[i_2_] = is;
				}
			} catch (ClassNotFoundException classnotfoundexception) {
				class536_sub34.anIntArray10624[i_2_] = -1;
			} catch (SecurityException securityexception) {
				class536_sub34.anIntArray10624[i_2_] = -2;
			} catch (NullPointerException nullpointerexception) {
				class536_sub34.anIntArray10624[i_2_] = -3;
			} catch (Exception exception) {
				class536_sub34.anIntArray10624[i_2_] = -4;
			} catch (Throwable throwable) {
				class536_sub34.anIntArray10624[i_2_] = -5;
			}
		}
		Class71.aClass708_794.method8335(class536_sub34, -2110518246);
	}

	static final void method1890(byte i) {
		int i_17_ = 0;
		Class553 class553 = client.aClass515_11066.method6249(126533483);
		for (int i_18_ = 0; i_18_ < client.aClass515_11066.method6321((byte) -95); i_18_++) {
			for (int i_19_ = 0; i_19_ < client.aClass515_11066.method6243(177401017); i_19_++) {
				if (Class566.method6896(class553.aClass556ArrayArrayArray7430, i_17_, i_18_, i_19_, true, 2095857239))
					i_17_++;
				if (i_17_ >= 512)
					return;
			}
		}
	}

	public static final int method1891(int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_) {
		if (client.aClass515_11066.method6249(109988319) == null)
			return 0;
		if (i_23_ < 3) {
			Class455 class455 = client.aClass515_11066.method6251(574175780);
			int i_25_ = i >> 9;
			int i_26_ = i_20_ >> 9;
			if (i_21_ < 0 || i_22_ < 0 || i_21_ > client.aClass515_11066.method6321((byte) 35) - 1 || i_22_ > client.aClass515_11066.method6243(177401017) - 1)
				return 0;
			if (i_25_ < 1 || i_26_ < 1 || i_25_ > client.aClass515_11066.method6321((byte) -60) - 1 || i_26_ > client.aClass515_11066.method6243(177401017) - 1)
				return 0;
			boolean bool = ((class455.aByteArrayArrayArray5154[1][i >> 9][i_20_ >> 9] & 0x2) != 0);
			if (0 == (i & 0x1ff)) {
				boolean bool_27_ = 0 != ((class455.aByteArrayArrayArray5154[1][i_25_ - 1][i_20_ >> 9]) & 0x2);
				boolean bool_28_ = ((class455.aByteArrayArrayArray5154[1][i_25_][i_20_ >> 9] & 0x2) != 0);
				if (bool_27_ != bool_28_)
					bool = (class455.aByteArrayArrayArray5154[1][i_21_][i_22_] & 0x2) != 0;
			}
			if (0 == (i_20_ & 0x1ff)) {
				boolean bool_29_ = ((class455.aByteArrayArrayArray5154[1][i >> 9][i_26_ - 1] & 0x2) != 0);
				boolean bool_30_ = ((class455.aByteArrayArrayArray5154[1][i >> 9][i_26_] & 0x2) != 0);
				if (bool_30_ != bool_29_)
					bool = (class455.aByteArrayArrayArray5154[1][i_21_][i_22_] & 0x2) != 0;
			}
			if (bool)
				i_23_++;
		}
		return client.aClass515_11066.method6249(1859928415).aClass160Array7431[i_23_].method1925(i, i_20_, (byte) 22);
	}

	static String method1892(int[] is, int i) {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i_31_ = 0; i_31_ < is.length; i_31_++) {
			Class277 class277 = ((Class277) Class38.aClass53_Sub2_481.method70(is[i_31_], (byte) 16));
			if (-1 != class277.anInt3048 * 1670428349)
				stringbuilder.append(" <sprite=").append(1670428349 * class277.anInt3048).append(">");
		}
		return stringbuilder.toString();
	}
}
