/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class71 {
	static Class708 aClass708_794 = new Class708();
	static int anInt795;
	public static Class631 aClass631_796;

	public static boolean method1118() {
		Class536_Sub34 class536_sub34 = (Class536_Sub34) aClass708_794.method8308(1867269829);
		if (class536_sub34 == null)
			return false;
		return true;
	}

	Class71() throws Throwable {
		throw new Error();
	}

	public static void method1119() {
		aClass708_794 = new Class708();
	}

	public static void method1120(Class536_Sub33_Sub2 class536_sub33_sub2) {
		Class536_Sub34 class536_sub34 = (Class536_Sub34) aClass708_794.method8308(1867269829);
		if (class536_sub34 != null) {
			int i = -810172525 * class536_sub33_sub2.off;
			class536_sub33_sub2.writeInt(966617219 * class536_sub34.anInt10621, -149241618);
			for (int i_0_ = 0; i_0_ < 1706012977 * class536_sub34.anInt10619; i_0_++) {
				if (class536_sub34.anIntArray10624[i_0_] != 0)
					class536_sub33_sub2.writeByte((class536_sub34.anIntArray10624[i_0_]), 465637339);
				else {
					try {
						int i_1_ = class536_sub34.anIntArray10622[i_0_];
						if (0 == i_1_) {
							Field field = class536_sub34.aFieldArray10623[i_0_];
							int i_2_ = field.getInt(null);
							class536_sub33_sub2.writeByte(0, 465637339);
							class536_sub33_sub2.writeInt(i_2_, -149241618);
						} else if (1 == i_1_) {
							Field field = class536_sub34.aFieldArray10623[i_0_];
							field.setInt(null, class536_sub34.anIntArray10620[i_0_]);
							class536_sub33_sub2.writeByte(0, 465637339);
						} else if (2 == i_1_) {
							Field field = class536_sub34.aFieldArray10623[i_0_];
							int i_3_ = field.getModifiers();
							class536_sub33_sub2.writeByte(0, 465637339);
							class536_sub33_sub2.writeInt(i_3_, -149241618);
						}
						if (3 == i_1_) {
							Method method = class536_sub34.aMethodArray10625[i_0_];
							byte[][] is = (class536_sub34.aByteArrayArrayArray10626[i_0_]);
							Object[] objects = new Object[is.length];
							for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
								ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_4_])));
								objects[i_4_] = objectinputstream.readObject();
							}
							Object object = method.invoke(null, objects);
							if (null == object)
								class536_sub33_sub2.writeByte(0, 465637339);
							else if (object instanceof Number) {
								class536_sub33_sub2.writeByte(1, 465637339);
								class536_sub33_sub2.method9693(((Number) object).longValue());
							} else if (object instanceof String) {
								class536_sub33_sub2.writeByte(2, 465637339);
								class536_sub33_sub2.writeString((String) object, -1159357416);
							} else
								class536_sub33_sub2.writeByte(4, 465637339);
						} else if (4 == i_1_) {
							Method method = class536_sub34.aMethodArray10625[i_0_];
							int i_5_ = method.getModifiers();
							class536_sub33_sub2.writeByte(0, 465637339);
							class536_sub33_sub2.writeInt(i_5_, -149241618);
						}
					} catch (ClassNotFoundException classnotfoundexception) {
						class536_sub33_sub2.writeByte(-10, 465637339);
					} catch (InvalidClassException invalidclassexception) {
						class536_sub33_sub2.writeByte(-11, 465637339);
					} catch (StreamCorruptedException streamcorruptedexception) {
						class536_sub33_sub2.writeByte(-12, 465637339);
					} catch (OptionalDataException optionaldataexception) {
						class536_sub33_sub2.writeByte(-13, 465637339);
					} catch (IllegalAccessException illegalaccessexception) {
						class536_sub33_sub2.writeByte(-14, 465637339);
					} catch (IllegalArgumentException illegalargumentexception) {
						class536_sub33_sub2.writeByte(-15, 465637339);
					} catch (InvocationTargetException invocationtargetexception) {
						class536_sub33_sub2.writeByte(-16, 465637339);
					} catch (SecurityException securityexception) {
						class536_sub33_sub2.writeByte(-17, 465637339);
					} catch (IOException ioexception) {
						class536_sub33_sub2.writeByte(-18, 465637339);
					} catch (NullPointerException nullpointerexception) {
						class536_sub33_sub2.writeByte(-19, 465637339);
					} catch (Exception exception) {
						class536_sub33_sub2.writeByte(-20, 465637339);
					} catch (Throwable throwable) {
						class536_sub33_sub2.writeByte(-21, 465637339);
					}
				}
			}
			class536_sub33_sub2.method9768(i, (byte) 86);
			class536_sub34.method6484(-26478031);
		}
	}

	public static void method1121() {
		aClass708_794 = new Class708();
	}

	public static void method1122(RSByteBuffer class536_sub33, int i) {
		Class536_Sub34 class536_sub34 = new Class536_Sub34();
		class536_sub34.anInt10619 = class536_sub33.readUnsignedByte(-1138036135) * 1530398673;
		class536_sub34.anInt10621 = class536_sub33.method9709(-530040156) * -251386325;
		class536_sub34.anIntArray10622 = new int[class536_sub34.anInt10619 * 1706012977];
		class536_sub34.anIntArray10624 = new int[1706012977 * class536_sub34.anInt10619];
		class536_sub34.aFieldArray10623 = new Field[class536_sub34.anInt10619 * 1706012977];
		class536_sub34.anIntArray10620 = new int[class536_sub34.anInt10619 * 1706012977];
		class536_sub34.aMethodArray10625 = new Method[class536_sub34.anInt10619 * 1706012977];
		class536_sub34.aByteArrayArrayArray10626 = new byte[class536_sub34.anInt10619 * 1706012977][][];
		for (int i_6_ = 0; i_6_ < class536_sub34.anInt10619 * 1706012977; i_6_++) {
			try {
				int i_7_ = class536_sub33.readUnsignedByte(-1643763379);
				if (0 == i_7_ || 1 == i_7_ || i_7_ == 2) {
					String string = class536_sub33.method9695((byte) 55);
					String string_8_ = class536_sub33.method9695((byte) 17);
					int i_9_ = 0;
					if (1 == i_7_)
						i_9_ = class536_sub33.method9709(151233379);
					class536_sub34.anIntArray10622[i_6_] = i_7_;
					class536_sub34.anIntArray10620[i_6_] = i_9_;
					if (Class541.method6530(string, 910230270).getClassLoader() == null)
						throw new SecurityException();
					class536_sub34.aFieldArray10623[i_6_] = Class541.method6530(string, 1254770100).getDeclaredField(string_8_);
				} else if (i_7_ == 3 || i_7_ == 4) {
					String string = class536_sub33.method9695((byte) 53);
					String string_10_ = class536_sub33.method9695((byte) 59);
					int i_11_ = class536_sub33.readUnsignedByte(-1400142131);
					String[] strings = new String[i_11_];
					for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
						strings[i_12_] = class536_sub33.method9695((byte) 82);
					String string_13_ = class536_sub33.method9695((byte) 3);
					byte[][] is = new byte[i_11_][];
					if (i_7_ == 3) {
						for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
							int i_15_ = class536_sub33.method9709(40053150);
							is[i_14_] = new byte[i_15_];
							class536_sub33.method9716(is[i_14_], 0, i_15_, 281229313);
						}
					}
					class536_sub34.anIntArray10622[i_6_] = i_7_;
					Class[] var_classes = new Class[i_11_];
					for (int i_16_ = 0; i_16_ < i_11_; i_16_++)
						var_classes[i_16_] = Class541.method6530(strings[i_16_], 108776010);
					Class var_class = Class541.method6530(string_13_, 1860698072);
					if (Class541.method6530(string, 1953980523).getClassLoader() == null)
						throw new SecurityException();
					Method[] methods = Class541.method6530(string, 1964457960).getDeclaredMethods();
					Method[] methods_17_ = methods;
					for (int i_18_ = 0; i_18_ < methods_17_.length; i_18_++) {
						Method method = methods_17_[i_18_];
						if (method.getName().equals(string_10_)) {
							Class[] var_classes_19_ = method.getParameterTypes();
							if (var_classes.length == var_classes_19_.length) {
								boolean bool = true;
								for (int i_20_ = 0; i_20_ < var_classes.length; i_20_++) {
									if (var_classes_19_[i_20_] != var_classes[i_20_]) {
										bool = false;
										break;
									}
								}
								if (bool && var_class == method.getReturnType())
									class536_sub34.aMethodArray10625[i_6_] = method;
							}
						}
					}
					class536_sub34.aByteArrayArrayArray10626[i_6_] = is;
				}
			} catch (ClassNotFoundException classnotfoundexception) {
				class536_sub34.anIntArray10624[i_6_] = -1;
			} catch (SecurityException securityexception) {
				class536_sub34.anIntArray10624[i_6_] = -2;
			} catch (NullPointerException nullpointerexception) {
				class536_sub34.anIntArray10624[i_6_] = -3;
			} catch (Exception exception) {
				class536_sub34.anIntArray10624[i_6_] = -4;
			} catch (Throwable throwable) {
				class536_sub34.anIntArray10624[i_6_] = -5;
			}
		}
		aClass708_794.method8335(class536_sub34, 883201987);
	}

	public static void method1123(RSByteBuffer class536_sub33, int i) {
		Class536_Sub34 class536_sub34 = new Class536_Sub34();
		class536_sub34.anInt10619 = class536_sub33.readUnsignedByte(-733617722) * 1530398673;
		class536_sub34.anInt10621 = class536_sub33.method9709(-1331893319) * -251386325;
		class536_sub34.anIntArray10622 = new int[class536_sub34.anInt10619 * 1706012977];
		class536_sub34.anIntArray10624 = new int[1706012977 * class536_sub34.anInt10619];
		class536_sub34.aFieldArray10623 = new Field[class536_sub34.anInt10619 * 1706012977];
		class536_sub34.anIntArray10620 = new int[class536_sub34.anInt10619 * 1706012977];
		class536_sub34.aMethodArray10625 = new Method[class536_sub34.anInt10619 * 1706012977];
		class536_sub34.aByteArrayArrayArray10626 = new byte[class536_sub34.anInt10619 * 1706012977][][];
		for (int i_21_ = 0; i_21_ < class536_sub34.anInt10619 * 1706012977; i_21_++) {
			try {
				int i_22_ = class536_sub33.readUnsignedByte(1865229913);
				if (0 == i_22_ || 1 == i_22_ || i_22_ == 2) {
					String string = class536_sub33.method9695((byte) 65);
					String string_23_ = class536_sub33.method9695((byte) 99);
					int i_24_ = 0;
					if (1 == i_22_)
						i_24_ = class536_sub33.method9709(-699633713);
					class536_sub34.anIntArray10622[i_21_] = i_22_;
					class536_sub34.anIntArray10620[i_21_] = i_24_;
					if (Class541.method6530(string, 1271832775).getClassLoader() == null)
						throw new SecurityException();
					class536_sub34.aFieldArray10623[i_21_] = Class541.method6530(string, 158640228).getDeclaredField(string_23_);
				} else if (i_22_ == 3 || i_22_ == 4) {
					String string = class536_sub33.method9695((byte) 80);
					String string_25_ = class536_sub33.method9695((byte) 48);
					int i_26_ = class536_sub33.readUnsignedByte(196680433);
					String[] strings = new String[i_26_];
					for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
						strings[i_27_] = class536_sub33.method9695((byte) 31);
					String string_28_ = class536_sub33.method9695((byte) 120);
					byte[][] is = new byte[i_26_][];
					if (i_22_ == 3) {
						for (int i_29_ = 0; i_29_ < i_26_; i_29_++) {
							int i_30_ = class536_sub33.method9709(-772600353);
							is[i_29_] = new byte[i_30_];
							class536_sub33.method9716(is[i_29_], 0, i_30_, -1323820340);
						}
					}
					class536_sub34.anIntArray10622[i_21_] = i_22_;
					Class[] var_classes = new Class[i_26_];
					for (int i_31_ = 0; i_31_ < i_26_; i_31_++)
						var_classes[i_31_] = Class541.method6530(strings[i_31_], 694309418);
					Class var_class = Class541.method6530(string_28_, 1562831654);
					if (Class541.method6530(string, 496149614).getClassLoader() == null)
						throw new SecurityException();
					Method[] methods = Class541.method6530(string, 140347115).getDeclaredMethods();
					Method[] methods_32_ = methods;
					for (int i_33_ = 0; i_33_ < methods_32_.length; i_33_++) {
						Method method = methods_32_[i_33_];
						if (method.getName().equals(string_25_)) {
							Class[] var_classes_34_ = method.getParameterTypes();
							if (var_classes.length == var_classes_34_.length) {
								boolean bool = true;
								for (int i_35_ = 0; i_35_ < var_classes.length; i_35_++) {
									if (var_classes_34_[i_35_] != var_classes[i_35_]) {
										bool = false;
										break;
									}
								}
								if (bool && var_class == method.getReturnType())
									class536_sub34.aMethodArray10625[i_21_] = method;
							}
						}
					}
					class536_sub34.aByteArrayArrayArray10626[i_21_] = is;
				}
			} catch (ClassNotFoundException classnotfoundexception) {
				class536_sub34.anIntArray10624[i_21_] = -1;
			} catch (SecurityException securityexception) {
				class536_sub34.anIntArray10624[i_21_] = -2;
			} catch (NullPointerException nullpointerexception) {
				class536_sub34.anIntArray10624[i_21_] = -3;
			} catch (Exception exception) {
				class536_sub34.anIntArray10624[i_21_] = -4;
			} catch (Throwable throwable) {
				class536_sub34.anIntArray10624[i_21_] = -5;
			}
		}
		aClass708_794.method8335(class536_sub34, -11965826);
	}
}
