/* Class465_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class Class465_Sub2 extends Class465 {
	Class465_Sub2(Class657 class657, int i, boolean bool, boolean bool_0_) {
		super(class657, i, bool, bool_0_);
	}

	Object method7643(Class160 class160) {
		if (class160.aClass462_1748 == Class462.aClass462_5096)
			return Integer.valueOf(-1);
		return class160.aClass462_1748.method7608((short) 258);
	}

	Object method7632(Class160 class160, int i) {
		if (class160.aClass462_1748 == Class462.aClass462_5096)
			return Integer.valueOf(-1);
		return class160.aClass462_1748.method7608((short) 258);
	}

	Object method7640(Class160 class160) {
		if (class160.aClass462_1748 == Class462.aClass462_5096)
			return Integer.valueOf(-1);
		return class160.aClass462_1748.method7608((short) 258);
	}

	Object method7638(Class160 class160) {
		if (class160.aClass462_1748 == Class462.aClass462_5096)
			return Integer.valueOf(-1);
		return class160.aClass462_1748.method7608((short) 258);
	}

	Object method7639(Class160 class160) {
		if (class160.aClass462_1748 == Class462.aClass462_5096)
			return Integer.valueOf(-1);
		return class160.aClass462_1748.method7608((short) 258);
	}

	public static void method15953(RSByteBuffer buffer, int i, int i_1_) {
		Class527_Sub29 class527_sub29 = new Class527_Sub29();
		class527_sub29.anInt10557 = buffer.readUnsignedByte() * 1273426665;
		class527_sub29.anInt10561 = buffer.readInt() * 1622705615;
		class527_sub29.anIntArray10559 = new int[class527_sub29.anInt10557 * -639695527];
		class527_sub29.anIntArray10558 = new int[-639695527 * class527_sub29.anInt10557];
		class527_sub29.aFieldArray10560 = new Field[-639695527 * class527_sub29.anInt10557];
		class527_sub29.anIntArray10562 = new int[class527_sub29.anInt10557 * -639695527];
		class527_sub29.aMethodArray10563 = new Method[-639695527 * class527_sub29.anInt10557];
		class527_sub29.aByteArrayArrayArray10564 = new byte[class527_sub29.anInt10557 * -639695527][][];
		for (int i_2_ = 0; i_2_ < -639695527 * class527_sub29.anInt10557; i_2_++) {
			try {
				int i_3_ = buffer.readUnsignedByte();
				if (0 == i_3_ || i_3_ == 1 || 2 == i_3_) {
					String string = buffer.readString(991008254);
					String string_4_ = buffer.readString(911136045);
					int i_5_ = 0;
					if (1 == i_3_)
						i_5_ = buffer.readInt();
					class527_sub29.anIntArray10559[i_2_] = i_3_;
					class527_sub29.anIntArray10562[i_2_] = i_5_;
					if (Class632.method10473(string, 1256600945).getClassLoader() == null)
						throw new SecurityException();
					class527_sub29.aFieldArray10560[i_2_] = Class632.method10473(string, 1545068554).getDeclaredField(string_4_);
				} else if (3 == i_3_ || i_3_ == 4) {
					String string = buffer.readString(1545742568);
					String string_6_ = buffer.readString(1712491158);
					int i_7_ = buffer.readUnsignedByte();
					String[] strings = new String[i_7_];
					for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
						strings[i_8_] = buffer.readString(1639722172);
					String string_9_ = buffer.readString(2034172140);
					byte[][] is = new byte[i_7_][];
					if (i_3_ == 3) {
						for (int i_10_ = 0; i_10_ < i_7_; i_10_++) {
							int i_11_ = buffer.readInt();
							is[i_10_] = new byte[i_11_];
							buffer.method16460(is[i_10_], 0, i_11_, -1659244558);
						}
					}
					class527_sub29.anIntArray10559[i_2_] = i_3_;
					Class[] var_classes = new Class[i_7_];
					for (int i_12_ = 0; i_12_ < i_7_; i_12_++)
						var_classes[i_12_] = Class632.method10473(strings[i_12_], 1904498044);
					Class var_class = Class632.method10473(string_9_, 1164270214);
					if (Class632.method10473(string, 928530583).getClassLoader() == null)
						throw new SecurityException();
					Method[] methods = Class632.method10473(string, 1441900104).getDeclaredMethods();
					Method[] methods_13_ = methods;
					for (int i_14_ = 0; i_14_ < methods_13_.length; i_14_++) {
						Method method = methods_13_[i_14_];
						if (method.getName().equals(string_6_)) {
							Class[] var_classes_15_ = method.getParameterTypes();
							if (var_classes.length == var_classes_15_.length) {
								boolean bool = true;
								for (int i_16_ = 0; i_16_ < var_classes.length; i_16_++) {
									if (var_classes[i_16_] != var_classes_15_[i_16_]) {
										bool = false;
										break;
									}
								}
								if (bool && var_class == method.getReturnType())
									class527_sub29.aMethodArray10563[i_2_] = method;
							}
						}
					}
					class527_sub29.aByteArrayArrayArray10564[i_2_] = is;
				}
			} catch (ClassNotFoundException classnotfoundexception) {
				class527_sub29.anIntArray10558[i_2_] = -1;
			} catch (SecurityException securityexception) {
				class527_sub29.anIntArray10558[i_2_] = -2;
			} catch (NullPointerException nullpointerexception) {
				class527_sub29.anIntArray10558[i_2_] = -3;
			} catch (Exception exception) {
				class527_sub29.anIntArray10558[i_2_] = -4;
			} catch (Throwable throwable) {
				class527_sub29.anIntArray10558[i_2_] = -5;
			}
		}
		Class34.aClass694_331.method14147(class527_sub29, -1457954297);
	}

	static final void method15954(Class665 class665, short i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class574.method9623((byte) -3);
	}
}
