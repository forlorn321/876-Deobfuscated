/* Class629 - Decompiled by JODE
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

final class Class629 implements Interface74 {
	public void method495(int i, int i_0_, int i_1_, int i_2_) {
		int i_3_ = i >> 16;
		int i_4_ = i & 0xffff;
		synchronized (Class659.aQueue8499) {
			Class659.aQueue8499.add(Class471.method5721(i_3_, i_4_, i_0_, i_1_, 809085763));
		}
	}

	public void method493(boolean bool, int i) {
		/* empty */
	}

	public void method494(int i, int i_5_, int i_6_) {
		int i_7_ = i >> 16;
		int i_8_ = i & 0xffff;
		synchronized (Class659.aQueue8499) {
			Class659.aQueue8499.add(Class471.method5721(i_7_, i_8_, i_5_, i_6_, 809085763));
		}
	}

	public void method212(boolean bool) {
		/* empty */
	}

	public void method491(int i, int i_9_, int i_10_) {
		int i_11_ = i >> 16;
		int i_12_ = i & 0xffff;
		synchronized (Class659.aQueue8499) {
			Class659.aQueue8499.add(Class471.method5721(i_11_, i_12_, i_9_, i_10_, 809085763));
		}
	}

	public void method496(boolean bool) {
		/* empty */
	}

	public void method492(int i, int i_13_, int i_14_) {
		int i_15_ = i >> 16;
		int i_16_ = i & 0xffff;
		synchronized (Class659.aQueue8499) {
			Class659.aQueue8499.add(Class471.method5721(i_15_, i_16_, i_13_, i_14_, 809085763));
		}
	}

	static final void method7498(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -712740187 * class251.anInt2572;
	}

	static final void method7499(Class668 class668, int i) {
		boolean bool = true;
		if (client.aBool10984) {
			try {
				Object object = Class412.aClass412_4390.method5011((byte) -26);
				if (null != object)
					bool = ((Boolean) object).booleanValue();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = bool ? 1 : 0;
	}

	public static String method7500(CharSequence charsequence, int i) {
		int i_17_ = charsequence.length();
		StringBuilder stringbuilder = new StringBuilder(i_17_);
		for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
			char c = charsequence.charAt(i_18_);
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == '.' || '-' == c || c == '*' || '_' == c)
				stringbuilder.append(c);
			else if (c == ' ')
				stringbuilder.append('+');
			else {
				int i_19_ = Class543.method6581(c, -5823823);
				stringbuilder.append('%');
				int i_20_ = i_19_ >> 4 & 0xf;
				if (i_20_ >= 10)
					stringbuilder.append((char) (i_20_ + 55));
				else
					stringbuilder.append((char) (48 + i_20_));
				i_20_ = i_19_ & 0xf;
				if (i_20_ >= 10)
					stringbuilder.append((char) (55 + i_20_));
				else
					stringbuilder.append((char) (i_20_ + 48));
			}
		}
		return stringbuilder.toString();
	}

	public static final void method7501(int i) {
		client.aBool11121 = true;
	}

	public static void method7502(Class536_Sub33_Sub2 class536_sub33_sub2, int i) {
		Class536_Sub34 class536_sub34 = (Class536_Sub34) Class71.aClass708_794.method8308(1867269829);
		if (class536_sub34 != null) {
			int i_21_ = -810172525 * class536_sub33_sub2.off;
			class536_sub33_sub2.writeInt(966617219 * class536_sub34.anInt10621, -149241618);
			for (int i_22_ = 0; i_22_ < 1706012977 * class536_sub34.anInt10619; i_22_++) {
				if (class536_sub34.anIntArray10624[i_22_] != 0)
					class536_sub33_sub2.writeByte((class536_sub34.anIntArray10624[i_22_]), 465637339);
				else {
					try {
						int i_23_ = class536_sub34.anIntArray10622[i_22_];
						if (0 == i_23_) {
							Field field = class536_sub34.aFieldArray10623[i_22_];
							int i_24_ = field.getInt(null);
							class536_sub33_sub2.writeByte(0, 465637339);
							class536_sub33_sub2.writeInt(i_24_, -149241618);
						} else if (1 == i_23_) {
							Field field = class536_sub34.aFieldArray10623[i_22_];
							field.setInt(null, (class536_sub34.anIntArray10620[i_22_]));
							class536_sub33_sub2.writeByte(0, 465637339);
						} else if (2 == i_23_) {
							Field field = class536_sub34.aFieldArray10623[i_22_];
							int i_25_ = field.getModifiers();
							class536_sub33_sub2.writeByte(0, 465637339);
							class536_sub33_sub2.writeInt(i_25_, -149241618);
						}
						if (3 == i_23_) {
							Method method = class536_sub34.aMethodArray10625[i_22_];
							byte[][] is = (class536_sub34.aByteArrayArrayArray10626[i_22_]);
							Object[] objects = new Object[is.length];
							for (int i_26_ = 0; i_26_ < is.length; i_26_++) {
								ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_26_])));
								objects[i_26_] = objectinputstream.readObject();
							}
							Object object = method.invoke(null, objects);
							if (null == object)
								class536_sub33_sub2.writeByte(0, 465637339);
							else if (object instanceof Number) {
								class536_sub33_sub2.writeByte(1, 465637339);
								class536_sub33_sub2.method9693(((Number) object).longValue());
							} else if (object instanceof String) {
								class536_sub33_sub2.writeByte(2, 465637339);
								class536_sub33_sub2.writeString((String) object, 1402624694);
							} else
								class536_sub33_sub2.writeByte(4, 465637339);
						} else if (4 == i_23_) {
							Method method = class536_sub34.aMethodArray10625[i_22_];
							int i_27_ = method.getModifiers();
							class536_sub33_sub2.writeByte(0, 465637339);
							class536_sub33_sub2.writeInt(i_27_, -149241618);
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
			class536_sub33_sub2.method9768(i_21_, (byte) 86);
			class536_sub34.method6484(1299294636);
		}
	}
}
