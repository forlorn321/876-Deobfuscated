/* Class34 - Decompiled by JODE
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

public class Class34 {
	static Class694 aClass694_331 = new Class694();

	static Class method952(String string) throws ClassNotFoundException {
		if (string.equals("B"))
			return Byte.TYPE;
		if (string.equals("I"))
			return Integer.TYPE;
		if (string.equals("S"))
			return Short.TYPE;
		if (string.equals("J"))
			return Long.TYPE;
		if (string.equals("Z"))
			return Boolean.TYPE;
		if (string.equals("F"))
			return Float.TYPE;
		if (string.equals("D"))
			return Double.TYPE;
		if (string.equals("C"))
			return Character.TYPE;
		if (string.equals("void"))
			return Void.TYPE;
		return Class.forName(string);
	}

	public static void method953() {
		aClass694_331 = new Class694();
	}

	public static void method954() {
		aClass694_331 = new Class694();
	}

	public static boolean method955() {
		Class527_Sub29 class527_sub29 = (Class527_Sub29) aClass694_331.method14081((short) 5713);
		if (class527_sub29 == null)
			return false;
		return true;
	}

	public static boolean method956() {
		Class527_Sub29 class527_sub29 = (Class527_Sub29) aClass694_331.method14081((short) 12836);
		if (class527_sub29 == null)
			return false;
		return true;
	}

	public static boolean method957() {
		Class527_Sub29 class527_sub29 = (Class527_Sub29) aClass694_331.method14081((short) -4070);
		if (class527_sub29 == null)
			return false;
		return true;
	}

	public static void method958(RSByteBuffer class527_sub38, int i) {
		Class527_Sub29 class527_sub29 = new Class527_Sub29();
		class527_sub29.anInt10557 = class527_sub38.readUnsignedByte() * 1273426665;
		class527_sub29.anInt10561 = class527_sub38.readInt() * 1622705615;
		class527_sub29.anIntArray10559 = new int[class527_sub29.anInt10557 * -639695527];
		class527_sub29.anIntArray10558 = new int[-639695527 * class527_sub29.anInt10557];
		class527_sub29.aFieldArray10560 = new Field[-639695527 * class527_sub29.anInt10557];
		class527_sub29.anIntArray10562 = new int[class527_sub29.anInt10557 * -639695527];
		class527_sub29.aMethodArray10563 = new Method[-639695527 * class527_sub29.anInt10557];
		class527_sub29.aByteArrayArrayArray10564 = new byte[class527_sub29.anInt10557 * -639695527][][];
		for (int i_0_ = 0; i_0_ < -639695527 * class527_sub29.anInt10557; i_0_++) {
			try {
				int i_1_ = class527_sub38.readUnsignedByte();
				if (0 == i_1_ || i_1_ == 1 || 2 == i_1_) {
					String string = class527_sub38.readString(820966623);
					String string_2_ = class527_sub38.readString(721403329);
					int i_3_ = 0;
					if (1 == i_1_)
						i_3_ = class527_sub38.readInt();
					class527_sub29.anIntArray10559[i_0_] = i_1_;
					class527_sub29.anIntArray10562[i_0_] = i_3_;
					if (Class632.method10473(string, 1971936833).getClassLoader() == null)
						throw new SecurityException();
					class527_sub29.aFieldArray10560[i_0_] = Class632.method10473(string, 1779176266).getDeclaredField(string_2_);
				} else if (3 == i_1_ || i_1_ == 4) {
					String string = class527_sub38.readString(966159884);
					String string_4_ = class527_sub38.readString(1466480482);
					int i_5_ = class527_sub38.readUnsignedByte();
					String[] strings = new String[i_5_];
					for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
						strings[i_6_] = class527_sub38.readString(1692626201);
					String string_7_ = class527_sub38.readString(760739585);
					byte[][] is = new byte[i_5_][];
					if (i_1_ == 3) {
						for (int i_8_ = 0; i_8_ < i_5_; i_8_++) {
							int i_9_ = class527_sub38.readInt();
							is[i_8_] = new byte[i_9_];
							class527_sub38.method16460(is[i_8_], 0, i_9_, -1765476591);
						}
					}
					class527_sub29.anIntArray10559[i_0_] = i_1_;
					Class[] var_classes = new Class[i_5_];
					for (int i_10_ = 0; i_10_ < i_5_; i_10_++)
						var_classes[i_10_] = Class632.method10473(strings[i_10_], 1628399824);
					Class var_class = Class632.method10473(string_7_, 1501092253);
					if (Class632.method10473(string, 1376850094).getClassLoader() == null)
						throw new SecurityException();
					Method[] methods = Class632.method10473(string, 1951238657).getDeclaredMethods();
					Method[] methods_11_ = methods;
					for (int i_12_ = 0; i_12_ < methods_11_.length; i_12_++) {
						Method method = methods_11_[i_12_];
						if (method.getName().equals(string_4_)) {
							Class[] var_classes_13_ = method.getParameterTypes();
							if (var_classes.length == var_classes_13_.length) {
								boolean bool = true;
								for (int i_14_ = 0; i_14_ < var_classes.length; i_14_++) {
									if (var_classes[i_14_] != var_classes_13_[i_14_]) {
										bool = false;
										break;
									}
								}
								if (bool && var_class == method.getReturnType())
									class527_sub29.aMethodArray10563[i_0_] = method;
							}
						}
					}
					class527_sub29.aByteArrayArrayArray10564[i_0_] = is;
				}
			} catch (ClassNotFoundException classnotfoundexception) {
				class527_sub29.anIntArray10558[i_0_] = -1;
			} catch (SecurityException securityexception) {
				class527_sub29.anIntArray10558[i_0_] = -2;
			} catch (NullPointerException nullpointerexception) {
				class527_sub29.anIntArray10558[i_0_] = -3;
			} catch (Exception exception) {
				class527_sub29.anIntArray10558[i_0_] = -4;
			} catch (Throwable throwable) {
				class527_sub29.anIntArray10558[i_0_] = -5;
			}
		}
		aClass694_331.method14147(class527_sub29, -1642562810);
	}

	Class34() throws Throwable {
		throw new Error();
	}

	public static void method959(RSByteBuffer class527_sub38, int i) {
		Class527_Sub29 class527_sub29 = new Class527_Sub29();
		class527_sub29.anInt10557 = class527_sub38.readUnsignedByte() * 1273426665;
		class527_sub29.anInt10561 = class527_sub38.readInt() * 1622705615;
		class527_sub29.anIntArray10559 = new int[class527_sub29.anInt10557 * -639695527];
		class527_sub29.anIntArray10558 = new int[-639695527 * class527_sub29.anInt10557];
		class527_sub29.aFieldArray10560 = new Field[-639695527 * class527_sub29.anInt10557];
		class527_sub29.anIntArray10562 = new int[class527_sub29.anInt10557 * -639695527];
		class527_sub29.aMethodArray10563 = new Method[-639695527 * class527_sub29.anInt10557];
		class527_sub29.aByteArrayArrayArray10564 = new byte[class527_sub29.anInt10557 * -639695527][][];
		for (int i_15_ = 0; i_15_ < -639695527 * class527_sub29.anInt10557; i_15_++) {
			try {
				int i_16_ = class527_sub38.readUnsignedByte();
				if (0 == i_16_ || i_16_ == 1 || 2 == i_16_) {
					String string = class527_sub38.readString(1007803021);
					String string_17_ = class527_sub38.readString(1171591545);
					int i_18_ = 0;
					if (1 == i_16_)
						i_18_ = class527_sub38.readInt();
					class527_sub29.anIntArray10559[i_15_] = i_16_;
					class527_sub29.anIntArray10562[i_15_] = i_18_;
					if (Class632.method10473(string, 1707684288).getClassLoader() == null)
						throw new SecurityException();
					class527_sub29.aFieldArray10560[i_15_] = Class632.method10473(string, 1003293580).getDeclaredField(string_17_);
				} else if (3 == i_16_ || i_16_ == 4) {
					String string = class527_sub38.readString(1477880176);
					String string_19_ = class527_sub38.readString(1107209180);
					int i_20_ = class527_sub38.readUnsignedByte();
					String[] strings = new String[i_20_];
					for (int i_21_ = 0; i_21_ < i_20_; i_21_++)
						strings[i_21_] = class527_sub38.readString(721130144);
					String string_22_ = class527_sub38.readString(1896491345);
					byte[][] is = new byte[i_20_][];
					if (i_16_ == 3) {
						for (int i_23_ = 0; i_23_ < i_20_; i_23_++) {
							int i_24_ = class527_sub38.readInt();
							is[i_23_] = new byte[i_24_];
							class527_sub38.method16460(is[i_23_], 0, i_24_, -2085970583);
						}
					}
					class527_sub29.anIntArray10559[i_15_] = i_16_;
					Class[] var_classes = new Class[i_20_];
					for (int i_25_ = 0; i_25_ < i_20_; i_25_++)
						var_classes[i_25_] = Class632.method10473(strings[i_25_], 2006654108);
					Class var_class = Class632.method10473(string_22_, 1914901329);
					if (Class632.method10473(string, 1311501121).getClassLoader() == null)
						throw new SecurityException();
					Method[] methods = Class632.method10473(string, 1188191559).getDeclaredMethods();
					Method[] methods_26_ = methods;
					for (int i_27_ = 0; i_27_ < methods_26_.length; i_27_++) {
						Method method = methods_26_[i_27_];
						if (method.getName().equals(string_19_)) {
							Class[] var_classes_28_ = method.getParameterTypes();
							if (var_classes.length == var_classes_28_.length) {
								boolean bool = true;
								for (int i_29_ = 0; i_29_ < var_classes.length; i_29_++) {
									if (var_classes[i_29_] != var_classes_28_[i_29_]) {
										bool = false;
										break;
									}
								}
								if (bool && var_class == method.getReturnType())
									class527_sub29.aMethodArray10563[i_15_] = method;
							}
						}
					}
					class527_sub29.aByteArrayArrayArray10564[i_15_] = is;
				}
			} catch (ClassNotFoundException classnotfoundexception) {
				class527_sub29.anIntArray10558[i_15_] = -1;
			} catch (SecurityException securityexception) {
				class527_sub29.anIntArray10558[i_15_] = -2;
			} catch (NullPointerException nullpointerexception) {
				class527_sub29.anIntArray10558[i_15_] = -3;
			} catch (Exception exception) {
				class527_sub29.anIntArray10558[i_15_] = -4;
			} catch (Throwable throwable) {
				class527_sub29.anIntArray10558[i_15_] = -5;
			}
		}
		aClass694_331.method14147(class527_sub29, -1822311479);
	}

	static Class method960(String string) throws ClassNotFoundException {
		if (string.equals("B"))
			return Byte.TYPE;
		if (string.equals("I"))
			return Integer.TYPE;
		if (string.equals("S"))
			return Short.TYPE;
		if (string.equals("J"))
			return Long.TYPE;
		if (string.equals("Z"))
			return Boolean.TYPE;
		if (string.equals("F"))
			return Float.TYPE;
		if (string.equals("D"))
			return Double.TYPE;
		if (string.equals("C"))
			return Character.TYPE;
		if (string.equals("void"))
			return Void.TYPE;
		return Class.forName(string);
	}

	public static void method961(RSByteBuffer class527_sub38, int i) {
		Class527_Sub29 class527_sub29 = new Class527_Sub29();
		class527_sub29.anInt10557 = class527_sub38.readUnsignedByte() * 1273426665;
		class527_sub29.anInt10561 = class527_sub38.readInt() * 1622705615;
		class527_sub29.anIntArray10559 = new int[class527_sub29.anInt10557 * -639695527];
		class527_sub29.anIntArray10558 = new int[-639695527 * class527_sub29.anInt10557];
		class527_sub29.aFieldArray10560 = new Field[-639695527 * class527_sub29.anInt10557];
		class527_sub29.anIntArray10562 = new int[class527_sub29.anInt10557 * -639695527];
		class527_sub29.aMethodArray10563 = new Method[-639695527 * class527_sub29.anInt10557];
		class527_sub29.aByteArrayArrayArray10564 = new byte[class527_sub29.anInt10557 * -639695527][][];
		for (int i_30_ = 0; i_30_ < -639695527 * class527_sub29.anInt10557; i_30_++) {
			try {
				int i_31_ = class527_sub38.readUnsignedByte();
				if (0 == i_31_ || i_31_ == 1 || 2 == i_31_) {
					String string = class527_sub38.readString(1305720485);
					String string_32_ = class527_sub38.readString(2080367658);
					int i_33_ = 0;
					if (1 == i_31_)
						i_33_ = class527_sub38.readInt();
					class527_sub29.anIntArray10559[i_30_] = i_31_;
					class527_sub29.anIntArray10562[i_30_] = i_33_;
					if (Class632.method10473(string, 1515025345).getClassLoader() == null)
						throw new SecurityException();
					class527_sub29.aFieldArray10560[i_30_] = Class632.method10473(string, 1690368015).getDeclaredField(string_32_);
				} else if (3 == i_31_ || i_31_ == 4) {
					String string = class527_sub38.readString(1459756366);
					String string_34_ = class527_sub38.readString(1326322011);
					int i_35_ = class527_sub38.readUnsignedByte();
					String[] strings = new String[i_35_];
					for (int i_36_ = 0; i_36_ < i_35_; i_36_++)
						strings[i_36_] = class527_sub38.readString(1760810669);
					String string_37_ = class527_sub38.readString(1912103589);
					byte[][] is = new byte[i_35_][];
					if (i_31_ == 3) {
						for (int i_38_ = 0; i_38_ < i_35_; i_38_++) {
							int i_39_ = class527_sub38.readInt();
							is[i_38_] = new byte[i_39_];
							class527_sub38.method16460(is[i_38_], 0, i_39_, -2082085685);
						}
					}
					class527_sub29.anIntArray10559[i_30_] = i_31_;
					Class[] var_classes = new Class[i_35_];
					for (int i_40_ = 0; i_40_ < i_35_; i_40_++)
						var_classes[i_40_] = Class632.method10473(strings[i_40_], 1634678941);
					Class var_class = Class632.method10473(string_37_, 1638856860);
					if (Class632.method10473(string, 2112796525).getClassLoader() == null)
						throw new SecurityException();
					Method[] methods = Class632.method10473(string, 1674726807).getDeclaredMethods();
					Method[] methods_41_ = methods;
					for (int i_42_ = 0; i_42_ < methods_41_.length; i_42_++) {
						Method method = methods_41_[i_42_];
						if (method.getName().equals(string_34_)) {
							Class[] var_classes_43_ = method.getParameterTypes();
							if (var_classes.length == var_classes_43_.length) {
								boolean bool = true;
								for (int i_44_ = 0; i_44_ < var_classes.length; i_44_++) {
									if (var_classes[i_44_] != var_classes_43_[i_44_]) {
										bool = false;
										break;
									}
								}
								if (bool && var_class == method.getReturnType())
									class527_sub29.aMethodArray10563[i_30_] = method;
							}
						}
					}
					class527_sub29.aByteArrayArrayArray10564[i_30_] = is;
				}
			} catch (ClassNotFoundException classnotfoundexception) {
				class527_sub29.anIntArray10558[i_30_] = -1;
			} catch (SecurityException securityexception) {
				class527_sub29.anIntArray10558[i_30_] = -2;
			} catch (NullPointerException nullpointerexception) {
				class527_sub29.anIntArray10558[i_30_] = -3;
			} catch (Exception exception) {
				class527_sub29.anIntArray10558[i_30_] = -4;
			} catch (Throwable throwable) {
				class527_sub29.anIntArray10558[i_30_] = -5;
			}
		}
		aClass694_331.method14147(class527_sub29, -1581717913);
	}

	public static void method962(Class527_Sub38_Sub2 class527_sub38_sub2) {
		Class527_Sub29 class527_sub29 = (Class527_Sub29) aClass694_331.method14081((short) 9943);
		if (null != class527_sub29) {
			int i = -441238943 * class527_sub38_sub2.anInt10689;
			class527_sub38_sub2.writeInt((class527_sub29.anInt10561 * 1020551471), 451158194);
			for (int i_45_ = 0; i_45_ < class527_sub29.anInt10557 * -639695527; i_45_++) {
				if (class527_sub29.anIntArray10558[i_45_] != 0)
					class527_sub38_sub2.writeByte((class527_sub29.anIntArray10558[i_45_]), -1078505346);
				else {
					try {
						int i_46_ = class527_sub29.anIntArray10559[i_45_];
						if (0 == i_46_) {
							Field field = class527_sub29.aFieldArray10560[i_45_];
							int i_47_ = field.getInt(null);
							class527_sub38_sub2.writeByte(0, -1564112588);
							class527_sub38_sub2.writeInt(i_47_, 2113454177);
						} else if (1 == i_46_) {
							Field field = class527_sub29.aFieldArray10560[i_45_];
							field.setInt(null, (class527_sub29.anIntArray10562[i_45_]));
							class527_sub38_sub2.writeByte(0, 1900013975);
						} else if (i_46_ == 2) {
							Field field = class527_sub29.aFieldArray10560[i_45_];
							int i_48_ = field.getModifiers();
							class527_sub38_sub2.writeByte(0, 963809677);
							class527_sub38_sub2.writeInt(i_48_, 1814948341);
						}
						if (i_46_ == 3) {
							Method method = class527_sub29.aMethodArray10563[i_45_];
							byte[][] is = (class527_sub29.aByteArrayArrayArray10564[i_45_]);
							Object[] objects = new Object[is.length];
							for (int i_49_ = 0; i_49_ < is.length; i_49_++) {
								ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_49_])));
								objects[i_49_] = objectinputstream.readObject();
							}
							Object object = method.invoke(null, objects);
							if (object == null)
								class527_sub38_sub2.writeByte(0, -1103871094);
							else if (object instanceof Number) {
								class527_sub38_sub2.writeByte(1, -208664601);
								class527_sub38_sub2.writeLong(((Number) object).longValue());
							} else if (object instanceof String) {
								class527_sub38_sub2.writeByte(2, 1005232439);
								class527_sub38_sub2.writeString((String) object, 836989878);
							} else
								class527_sub38_sub2.writeByte(4, 1503280286);
						} else if (4 == i_46_) {
							Method method = class527_sub29.aMethodArray10563[i_45_];
							int i_50_ = method.getModifiers();
							class527_sub38_sub2.writeByte(0, 1899073129);
							class527_sub38_sub2.writeInt(i_50_, 28044637);
						}
					} catch (ClassNotFoundException classnotfoundexception) {
						class527_sub38_sub2.writeByte(-10, 186406905);
					} catch (InvalidClassException invalidclassexception) {
						class527_sub38_sub2.writeByte(-11, -1958909667);
					} catch (StreamCorruptedException streamcorruptedexception) {
						class527_sub38_sub2.writeByte(-12, -109392896);
					} catch (OptionalDataException optionaldataexception) {
						class527_sub38_sub2.writeByte(-13, 1361260500);
					} catch (IllegalAccessException illegalaccessexception) {
						class527_sub38_sub2.writeByte(-14, -1352592572);
					} catch (IllegalArgumentException illegalargumentexception) {
						class527_sub38_sub2.writeByte(-15, -2024807194);
					} catch (InvocationTargetException invocationtargetexception) {
						class527_sub38_sub2.writeByte(-16, 1150979254);
					} catch (SecurityException securityexception) {
						class527_sub38_sub2.writeByte(-17, 437311184);
					} catch (IOException ioexception) {
						class527_sub38_sub2.writeByte(-18, -2134162317);
					} catch (NullPointerException nullpointerexception) {
						class527_sub38_sub2.writeByte(-19, 557194626);
					} catch (Exception exception) {
						class527_sub38_sub2.writeByte(-20, -268797549);
					} catch (Throwable throwable) {
						class527_sub38_sub2.writeByte(-21, 605920435);
					}
				}
			}
			class527_sub38_sub2.method16474(i, (byte) 30);
			class527_sub29.method8735(-1889161967);
		}
	}

	public static void method963(Class527_Sub38_Sub2 class527_sub38_sub2) {
		Class527_Sub29 class527_sub29 = (Class527_Sub29) aClass694_331.method14081((short) 29650);
		if (null != class527_sub29) {
			int i = -441238943 * class527_sub38_sub2.anInt10689;
			class527_sub38_sub2.writeInt(class527_sub29.anInt10561 * 1020551471, 83275583);
			for (int i_51_ = 0; i_51_ < class527_sub29.anInt10557 * -639695527; i_51_++) {
				if (class527_sub29.anIntArray10558[i_51_] != 0)
					class527_sub38_sub2.writeByte((class527_sub29.anIntArray10558[i_51_]), 1462612224);
				else {
					try {
						int i_52_ = class527_sub29.anIntArray10559[i_51_];
						if (0 == i_52_) {
							Field field = class527_sub29.aFieldArray10560[i_51_];
							int i_53_ = field.getInt(null);
							class527_sub38_sub2.writeByte(0, 1242159919);
							class527_sub38_sub2.writeInt(i_53_, 246880949);
						} else if (1 == i_52_) {
							Field field = class527_sub29.aFieldArray10560[i_51_];
							field.setInt(null, (class527_sub29.anIntArray10562[i_51_]));
							class527_sub38_sub2.writeByte(0, -361749191);
						} else if (i_52_ == 2) {
							Field field = class527_sub29.aFieldArray10560[i_51_];
							int i_54_ = field.getModifiers();
							class527_sub38_sub2.writeByte(0, -74645723);
							class527_sub38_sub2.writeInt(i_54_, -163803962);
						}
						if (i_52_ == 3) {
							Method method = class527_sub29.aMethodArray10563[i_51_];
							byte[][] is = (class527_sub29.aByteArrayArrayArray10564[i_51_]);
							Object[] objects = new Object[is.length];
							for (int i_55_ = 0; i_55_ < is.length; i_55_++) {
								ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_55_])));
								objects[i_55_] = objectinputstream.readObject();
							}
							Object object = method.invoke(null, objects);
							if (object == null)
								class527_sub38_sub2.writeByte(0, -1919982796);
							else if (object instanceof Number) {
								class527_sub38_sub2.writeByte(1, -603635844);
								class527_sub38_sub2.writeLong(((Number) object).longValue());
							} else if (object instanceof String) {
								class527_sub38_sub2.writeByte(2, -1030560741);
								class527_sub38_sub2.writeString((String) object, 1854535595);
							} else
								class527_sub38_sub2.writeByte(4, 850205213);
						} else if (4 == i_52_) {
							Method method = class527_sub29.aMethodArray10563[i_51_];
							int i_56_ = method.getModifiers();
							class527_sub38_sub2.writeByte(0, 25261099);
							class527_sub38_sub2.writeInt(i_56_, -1967911929);
						}
					} catch (ClassNotFoundException classnotfoundexception) {
						class527_sub38_sub2.writeByte(-10, 1855364934);
					} catch (InvalidClassException invalidclassexception) {
						class527_sub38_sub2.writeByte(-11, 694433404);
					} catch (StreamCorruptedException streamcorruptedexception) {
						class527_sub38_sub2.writeByte(-12, 1292771807);
					} catch (OptionalDataException optionaldataexception) {
						class527_sub38_sub2.writeByte(-13, 2007242193);
					} catch (IllegalAccessException illegalaccessexception) {
						class527_sub38_sub2.writeByte(-14, -2091541314);
					} catch (IllegalArgumentException illegalargumentexception) {
						class527_sub38_sub2.writeByte(-15, -1243909524);
					} catch (InvocationTargetException invocationtargetexception) {
						class527_sub38_sub2.writeByte(-16, 678370563);
					} catch (SecurityException securityexception) {
						class527_sub38_sub2.writeByte(-17, -1543316257);
					} catch (IOException ioexception) {
						class527_sub38_sub2.writeByte(-18, 1321304416);
					} catch (NullPointerException nullpointerexception) {
						class527_sub38_sub2.writeByte(-19, 1786555857);
					} catch (Exception exception) {
						class527_sub38_sub2.writeByte(-20, 1825037935);
					} catch (Throwable throwable) {
						class527_sub38_sub2.writeByte(-21, 1106266846);
					}
				}
			}
			class527_sub38_sub2.method16474(i, (byte) 61);
			class527_sub29.method8735(-1889161967);
		}
	}

	static Class method964(String string) throws ClassNotFoundException {
		if (string.equals("B"))
			return Byte.TYPE;
		if (string.equals("I"))
			return Integer.TYPE;
		if (string.equals("S"))
			return Short.TYPE;
		if (string.equals("J"))
			return Long.TYPE;
		if (string.equals("Z"))
			return Boolean.TYPE;
		if (string.equals("F"))
			return Float.TYPE;
		if (string.equals("D"))
			return Double.TYPE;
		if (string.equals("C"))
			return Character.TYPE;
		if (string.equals("void"))
			return Void.TYPE;
		return Class.forName(string);
	}

	static void method965(int i, int i_57_, byte i_58_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(5, (long) i);
		class527_sub8_sub9.method18187(1011675217);
		class527_sub8_sub9.anInt11676 = i_57_ * -281159195;
	}

	static final void method966(Class665 class665, int i) {
		if (null != Class187.anIterator2119 && Class187.anIterator2119.hasNext())
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = ((Integer) Class187.anIterator2119.next()).intValue();
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
	}
}
