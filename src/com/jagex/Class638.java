/* Class638 - Decompiled by JODE
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

public final class Class638 {
	volatile String aString8319;
	public volatile int anInt8320 = -1460071847;
	public static int anInt8321;

	Class638(String string) {
		aString8319 = string;
	}

	static final void method10572(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anInt8526 -= 204761682;
		int i_0_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_1_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		Class80 class80 = ((Class80) Class679.aClass24_Sub21_8628.method81(i_0_, 1262938100));
		if (i_1_ != 780718929 * class80.anInt804)
			class243.method4558(i_0_, i_1_, 1330208577);
		else
			class243.method4581(i_0_, (short) 14715);
	}

	static final void method10573(Class665 class665, int i) {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_2_, -566357496);
		Class240 class240 = Class183.aClass240Array2100[i_2_ >> 16];
		Class575.method9632(class243, class240, class665, (byte) 66);
	}

	public static void method10574(boolean bool, byte i) {
		/* empty */
	}

	public static void method10575(Class527_Sub38_Sub2 class527_sub38_sub2, short i) {
		Class527_Sub29 class527_sub29 = ((Class527_Sub29) Class34.aClass694_331.method14081((short) 19871));
		if (null != class527_sub29) {
			int i_3_ = -441238943 * class527_sub38_sub2.anInt10689;
			class527_sub38_sub2.writeInt((class527_sub29.anInt10561 * 1020551471), 2079734581);
			for (int i_4_ = 0; i_4_ < class527_sub29.anInt10557 * -639695527; i_4_++) {
				if (class527_sub29.anIntArray10558[i_4_] != 0)
					class527_sub38_sub2.writeByte((class527_sub29.anIntArray10558[i_4_]), -164944462);
				else {
					try {
						int i_5_ = class527_sub29.anIntArray10559[i_4_];
						if (0 == i_5_) {
							Field field = class527_sub29.aFieldArray10560[i_4_];
							int i_6_ = field.getInt(null);
							class527_sub38_sub2.writeByte(0, 3345826);
							class527_sub38_sub2.writeInt(i_6_, -1571826851);
						} else if (1 == i_5_) {
							Field field = class527_sub29.aFieldArray10560[i_4_];
							field.setInt(null, class527_sub29.anIntArray10562[i_4_]);
							class527_sub38_sub2.writeByte(0, 2007251003);
						} else if (i_5_ == 2) {
							Field field = class527_sub29.aFieldArray10560[i_4_];
							int i_7_ = field.getModifiers();
							class527_sub38_sub2.writeByte(0, -150482752);
							class527_sub38_sub2.writeInt(i_7_, 800834463);
						}
						if (i_5_ == 3) {
							Method method = class527_sub29.aMethodArray10563[i_4_];
							byte[][] is = (class527_sub29.aByteArrayArrayArray10564[i_4_]);
							Object[] objects = new Object[is.length];
							for (int i_8_ = 0; i_8_ < is.length; i_8_++) {
								ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_8_])));
								objects[i_8_] = objectinputstream.readObject();
							}
							Object object = method.invoke(null, objects);
							if (object == null)
								class527_sub38_sub2.writeByte(0, 2024402573);
							else if (object instanceof Number) {
								class527_sub38_sub2.writeByte(1, -695175351);
								class527_sub38_sub2.writeLong(((Number) object).longValue());
							} else if (object instanceof String) {
								class527_sub38_sub2.writeByte(2, -1455164556);
								class527_sub38_sub2.writeString((String) object, 1061077961);
							} else
								class527_sub38_sub2.writeByte(4, 766250846);
						} else if (4 == i_5_) {
							Method method = class527_sub29.aMethodArray10563[i_4_];
							int i_9_ = method.getModifiers();
							class527_sub38_sub2.writeByte(0, 305815482);
							class527_sub38_sub2.writeInt(i_9_, 1152986603);
						}
					} catch (ClassNotFoundException classnotfoundexception) {
						class527_sub38_sub2.writeByte(-10, -1722636828);
					} catch (InvalidClassException invalidclassexception) {
						class527_sub38_sub2.writeByte(-11, -1939243785);
					} catch (StreamCorruptedException streamcorruptedexception) {
						class527_sub38_sub2.writeByte(-12, 1233931736);
					} catch (OptionalDataException optionaldataexception) {
						class527_sub38_sub2.writeByte(-13, -295901859);
					} catch (IllegalAccessException illegalaccessexception) {
						class527_sub38_sub2.writeByte(-14, -212906854);
					} catch (IllegalArgumentException illegalargumentexception) {
						class527_sub38_sub2.writeByte(-15, -869609331);
					} catch (InvocationTargetException invocationtargetexception) {
						class527_sub38_sub2.writeByte(-16, 544389950);
					} catch (SecurityException securityexception) {
						class527_sub38_sub2.writeByte(-17, 2051366247);
					} catch (IOException ioexception) {
						class527_sub38_sub2.writeByte(-18, 1919413472);
					} catch (NullPointerException nullpointerexception) {
						class527_sub38_sub2.writeByte(-19, 1199876308);
					} catch (Exception exception) {
						class527_sub38_sub2.writeByte(-20, -1555961361);
					} catch (Throwable throwable) {
						class527_sub38_sub2.writeByte(-21, -1307999844);
					}
				}
			}
			class527_sub38_sub2.method16474(i_3_, (byte) 24);
			class527_sub29.method8735(-1889161967);
		}
	}

	static final void method10576(int i, int i_10_, int i_11_, int i_12_, int i_13_, boolean bool, boolean bool_14_, short i_15_) {
		if (!bool && (i_10_ < 512 || i_11_ < 512 || (i_10_ > (client.aClass509_11072.method8284((byte) 63) - 2) * 512) || i_11_ > (client.aClass509_11072.method8285(-1957567458) - 2) * 512)) {
			float[] fs = client.aFloatArray11139;
			client.aFloatArray11139[1] = -1.0F;
			fs[0] = -1.0F;
		} else {
			int i_16_ = Class590.method9853(i_10_, i_11_, i, (byte) 5) - i_13_;
			client.aClass432_11013.method6899(Class402.aClass180_4150.method3181());
			client.aClass432_11013.method6896((float) i_12_, 0.0F, 0.0F);
			Class402.aClass180_4150.method3180(client.aClass432_11013);
			if (bool)
				Class402.aClass180_4150.method3333((float) i_10_, (float) i_16_, (float) i_11_, client.aFloatArray11139);
			else
				Class402.aClass180_4150.method3210((float) i_10_, (float) i_16_, (float) i_11_, client.aFloatArray11139);
			client.aClass432_11013.method6896((float) -i_12_, 0.0F, 0.0F);
			Class402.aClass180_4150.method3180(client.aClass432_11013);
			if (!bool_14_) {
				client.aFloatArray11139[0] -= (float) (1902851817 * client.anInt11289);
				client.aFloatArray11139[1] -= (float) (-1270596543 * client.anInt11097);
			}
		}
	}
}
