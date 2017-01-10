/* Class472 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;

public final class Class472 {
	Map aMap5362;
	int anInt5363;
	AbstractQueue_Sub1 anAbstractQueue_Sub1_5364;
	Comparator aComparator5365 = new Class464(this);
	long aLong5366;
	Class456 aClass456_5367;
	AbstractQueue_Sub1 anAbstractQueue_Sub1_5368;
	public static NativeSprite aClass143_5369;

	Class472(long l, int i, Class456 class456) {
		aLong5366 = 3946137088025422889L * l;
		anInt5363 = i * -1858538297;
		aClass456_5367 = class456;
		if (1163496695 * anInt5363 == -1) {
			aMap5362 = new HashMap(64);
			anAbstractQueue_Sub1_5368 = new AbstractQueue_Sub1(64, aComparator5365);
			anAbstractQueue_Sub1_5364 = null;
		} else {
			if (null == aClass456_5367)
				throw new IllegalArgumentException("");
			aMap5362 = new HashMap(anInt5363 * 1163496695);
			anAbstractQueue_Sub1_5368 = new AbstractQueue_Sub1(1163496695 * anInt5363, aComparator5365);
			anAbstractQueue_Sub1_5364 = new AbstractQueue_Sub1(anInt5363 * 1163496695);
		}
	}

	public Object method5722(Object object, Object object_0_, byte i) {
		synchronized (this) {
			if (-1L != aLong5366 * -7095901281844170727L)
				method5729((byte) 76);
			Class471 class471 = (Class471) aMap5362.get(object);
			if (class471 != null) {
				Object object_1_ = class471.anObject5359;
				class471.anObject5359 = object_0_;
				method5725(class471, false, (byte) -24);
				Object object_2_ = object_1_;
				return object_2_;
			}
			if (method5726((byte) 40) && aMap5362.size() == anInt5363 * 1163496695) {
				Class471 class471_3_ = (Class471) anAbstractQueue_Sub1_5364.remove();
				aMap5362.remove(class471_3_.anObject5358);
				anAbstractQueue_Sub1_5368.remove(class471_3_);
			}
			Class471 class471_4_ = new Class471(object_0_, object);
			aMap5362.put(object, class471_4_);
			method5725(class471_4_, true, (byte) -74);
			Object object_5_ = null;
			return object_5_;
		}
	}

	public Object method5723(Object object, byte i) {
		synchronized (this) {
			if (-7095901281844170727L * aLong5366 != -1L)
				method5729((byte) 95);
			Class471 class471 = (Class471) aMap5362.get(object);
			if (null == class471) {
				Object object_6_ = null;
				return object_6_;
			}
			method5725(class471, false, (byte) -82);
			Object object_7_ = class471.anObject5359;
			return object_7_;
		}
	}

	boolean method5724() {
		return anInt5363 * 1163496695 != -1;
	}

	void method5725(Class471 class471, boolean bool, byte i) {
		if (!bool) {
			anAbstractQueue_Sub1_5368.remove(class471);
			if (method5726((byte) -31) && !anAbstractQueue_Sub1_5364.remove(class471))
				throw new IllegalStateException("");
		}
		class471.aLong5357 = System.currentTimeMillis() * 2564938283178176267L;
		if (method5726((byte) -100)) {
			switch (1698006999 * aClass456_5367.anInt5157) {
			case 0:
				class471.aLong5360 = 5223576442917030791L * class471.aLong5357;
				break;
			case 1:
				class471.aLong5360 += 7444906847349819341L;
				break;
			}
			anAbstractQueue_Sub1_5364.add(class471);
		}
		anAbstractQueue_Sub1_5368.add(class471);
	}

	boolean method5726(byte i) {
		return anInt5363 * 1163496695 != -1;
	}

	boolean method5727() {
		return anInt5363 * 1163496695 != -1;
	}

	void method5728() {
		if (-1L == aLong5366 * -7095901281844170727L)
			throw new IllegalStateException("");
		long l = System.currentTimeMillis() - -7095901281844170727L * aLong5366;
		while (!anAbstractQueue_Sub1_5368.isEmpty()) {
			Class471 class471 = (Class471) anAbstractQueue_Sub1_5368.peek();
			if (class471.aLong5357 * -7667084555533736797L < l) {
				aMap5362.remove(class471.anObject5358);
				anAbstractQueue_Sub1_5368.remove(class471);
				if (method5726((byte) 59))
					anAbstractQueue_Sub1_5364.remove(class471);
			} else
				break;
		}
	}

	public Class472(int i, Class456 class456) {
		this(-1L, i, class456);
	}

	void method5729(byte i) {
		if (-1L == aLong5366 * -7095901281844170727L)
			throw new IllegalStateException("");
		long l = System.currentTimeMillis() - -7095901281844170727L * aLong5366;
		while (!anAbstractQueue_Sub1_5368.isEmpty()) {
			Class471 class471 = (Class471) anAbstractQueue_Sub1_5368.peek();
			if (class471.aLong5357 * -7667084555533736797L < l) {
				aMap5362.remove(class471.anObject5358);
				anAbstractQueue_Sub1_5368.remove(class471);
				if (method5726((byte) -13))
					anAbstractQueue_Sub1_5364.remove(class471);
			} else
				break;
		}
	}

	void method5730() {
		if (-1L == aLong5366 * -7095901281844170727L)
			throw new IllegalStateException("");
		long l = System.currentTimeMillis() - -7095901281844170727L * aLong5366;
		while (!anAbstractQueue_Sub1_5368.isEmpty()) {
			Class471 class471 = (Class471) anAbstractQueue_Sub1_5368.peek();
			if (class471.aLong5357 * -7667084555533736797L < l) {
				aMap5362.remove(class471.anObject5358);
				anAbstractQueue_Sub1_5368.remove(class471);
				if (method5726((byte) 17))
					anAbstractQueue_Sub1_5364.remove(class471);
			} else
				break;
		}
	}

	void method5731() {
		if (-1L == aLong5366 * -7095901281844170727L)
			throw new IllegalStateException("");
		long l = System.currentTimeMillis() - -7095901281844170727L * aLong5366;
		while (!anAbstractQueue_Sub1_5368.isEmpty()) {
			Class471 class471 = (Class471) anAbstractQueue_Sub1_5368.peek();
			if (class471.aLong5357 * -7667084555533736797L < l) {
				aMap5362.remove(class471.anObject5358);
				anAbstractQueue_Sub1_5368.remove(class471);
				if (method5726((byte) 75))
					anAbstractQueue_Sub1_5364.remove(class471);
			} else
				break;
		}
	}

	void method5732() {
		if (-1L == aLong5366 * -7095901281844170727L)
			throw new IllegalStateException("");
		long l = System.currentTimeMillis() - -7095901281844170727L * aLong5366;
		while (!anAbstractQueue_Sub1_5368.isEmpty()) {
			Class471 class471 = (Class471) anAbstractQueue_Sub1_5368.peek();
			if (class471.aLong5357 * -7667084555533736797L < l) {
				aMap5362.remove(class471.anObject5358);
				anAbstractQueue_Sub1_5368.remove(class471);
				if (method5726((byte) 12))
					anAbstractQueue_Sub1_5364.remove(class471);
			} else
				break;
		}
	}

	static void method5733(Class668 class668, int i) {
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = ((QuestTypeDecoder) Class38.aClass53_Sub2_481.method70((class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)]), (byte) 16)).aString3028;
	}

	static final void method5734(Class668 class668, byte i) {
		class668.anInt8542 -= 61855783;
		int i_8_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_9_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		int i_10_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 2];
		int i_11_ = 255;
		int i_12_ = 256;
		Class184_Sub2.aClass211_9442.method3030(Class198.aClass198_2211, i_8_, i_9_, i_11_, Class188.aClass188_2133.method2788(-1297887301), Class207.aClass207_2242, 0.0F, 0.0F, null, 0, i_12_, i_10_, (byte) 51);
	}

	static final void method5735(Class668 class668, int i) {
		/* empty */
	}

	static byte[] method5736(InputStream inputstream, int i, byte i_13_) throws IOException {
		byte[] is = new byte[5];
		if (inputstream.read(is, 0, 5) != 5)
			throw new IOException("2");
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(i);
		synchronized (Class518.aClass537_7042) {
			if (!Class518.aClass537_7042.method6495(is, -1209194845))
				throw new IOException("3");
			Class518.aClass537_7042.method6494(inputstream, bytearrayoutputstream, (long) i);
		}
		bytearrayoutputstream.flush();
		return bytearrayoutputstream.toByteArray();
	}

	static void method5737(Class668 class668, short i) {
		class668.anInt8542 -= 1472892954;
		int i_14_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_15_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		TwitchWebcamDevice twitchwebcamdevice = Class484.method5843(i_14_, -1210521259);
		TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
		if (twitchwebcamdevice != null)
			twitchwebcamdevicecapability = twitchwebcamdevice.method1266(i_15_);
		if (twitchwebcamdevicecapability == null) {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
		} else {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1967448571 * twitchwebcamdevicecapability.anInt1136;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 974204841 * twitchwebcamdevicecapability.anInt1137;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = twitchwebcamdevicecapability.anInt1138 * 605817251;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = twitchwebcamdevicecapability.anInt1139 * 928044193;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = twitchwebcamdevicecapability.anInt1140 * 762345981;
		}
	}
}
