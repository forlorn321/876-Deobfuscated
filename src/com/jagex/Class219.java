/* Class219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Class219 {
	long aLong2287;
	static final int anInt2288 = 1;
	static final int anInt2289 = 2;
	ArrayList anArrayList2290;
	long aLong2291;
	boolean aBool2292;
	String aString2293;
	static final int anInt2294 = 4;
	int anInt2295 = -1967594813;
	Class18 aClass18_2296;
	int anInt2297;
	ArrayList anArrayList2298;
	boolean aBool2299;
	boolean aBool2300;
	static final int anInt2301 = 1;
	int anInt2302;
	public static Class386 aClass386_2303;
	static Class243[] aClass243Array2304;
	static int anInt2305;

	void method3981(int i, Class215 class215) {
		Class215 class215_0_ = (Class215) anArrayList2290.get(i);
		class215_0_.method3953(class215, -1569503476);
	}

	public List method3982(byte i) {
		return Collections.unmodifiableList(anArrayList2290);
	}

	public boolean method3983() {
		return aBool2292;
	}

	int method3984(int i) {
		return anInt2302 * -1558850309;
	}

	void method3985(int i) {
		anInt2302 += -38070733;
	}

	public boolean method3986(int i) {
		return aBool2292;
	}

	public int method3987(int i) {
		return -165427287 * anInt2297;
	}

	void method3988() {
		Iterator iterator = anArrayList2290.iterator();
		while (iterator.hasNext()) {
			Class215 class215 = (Class215) iterator.next();
			class215.method3909(Class242.aClass242_2466, (byte) -64);
		}
	}

	public int hashCode() {
		return (int) (-6984276438804814041L * aLong2291);
	}

	void method3989(int i) {
		int i_1_ = -1;
		int i_2_ = -1;
		for (int i_3_ = 0; i_3_ < anArrayList2290.size(); i_3_++) {
			Class215 class215 = (Class215) anArrayList2290.get(i_3_);
			int i_4_ = class215.method3907(-832733432);
			if (i_4_ > i_1_) {
				i_1_ = i_4_;
				i_2_ = i_3_;
			}
		}
		anInt2295 = i_2_ * 1967594813;
	}

	public int method3990(byte i) {
		return -2114805227 * anInt2295;
	}

	void method3991(int i, Class215 class215) {
		Class215 class215_5_ = (Class215) anArrayList2290.get(i);
		class215_5_.method3953(class215, -176536961);
	}

	public Class215 method3992(int i, int i_6_) {
		if (-1 == i)
			return null;
		return (Class215) anArrayList2290.get(i);
	}

	void method3993(int i, boolean bool, int i_7_) {
		Class215 class215 = (Class215) anArrayList2290.get(i);
		class215.method3909((bool ? Class242.aClass242_2467 : Class242.aClass242_2468), (byte) -111);
	}

	public Interface19 method3994(int i) {
		return new Class144(Class465.aClass465_5309, aClass18_2296);
	}

	public Class219(long l, RSByteBuffer class527_sub38, boolean bool, Interface28 interface28) {
		aLong2291 = l * -2116117152079521641L;
		int i = class527_sub38.readUnsignedByte();
		if (i == 1) {
			int i_8_ = class527_sub38.readUnsignedByte();
			aBool2292 = (i_8_ & 0x1) != 0;
			aBool2299 = (i_8_ & 0x2) != 0;
			aBool2300 = (i_8_ & 0x4) != 0;
			anInt2302 = class527_sub38.readInt() * -38070733;
			aLong2287 = class527_sub38.method16612((byte) 1) * -1749732162657802049L;
			aString2293 = class527_sub38.readString(1429490668);
			anInt2297 = class527_sub38.readShort() * -1421095783;
			class527_sub38.readInt();
			class527_sub38.method16612((byte) 1);
			int i_9_ = class527_sub38.readUnsignedShort();
			anArrayList2290 = new ArrayList(i_9_);
			for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
				anArrayList2290.add(new Class215(class527_sub38, aBool2299, aBool2300, interface28));
			int i_11_ = class527_sub38.readUnsignedShort();
			anArrayList2298 = new ArrayList(i_11_);
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
				anArrayList2298.add(new Class228(class527_sub38, aBool2299, aBool2300));
			aClass18_2296 = new Class18(interface28.method153(-1348998462));
			int i_13_ = class527_sub38.readUnsignedShort();
			for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
				Class425 class425 = interface28.method153(-1348998462).method14483(class527_sub38, 623022710);
				aClass18_2296.method18(494563151 * class425.anInt4803, class425.anObject4804, -1340004094);
			}
			if (!bool) {
				class527_sub38.readUnsignedShort();
				class527_sub38.readUnsignedShort();
				class527_sub38.readUnsignedShort();
				class527_sub38.readUnsignedShort();
				class527_sub38.readUnsignedShort();
			}
			method3989(-2046174135);
		}
	}

	void method3995(int i, int i_15_) {
		anArrayList2290.remove(i);
		method3989(-2046174135);
	}

	void method3996(Class228 class228, byte i) {
		anArrayList2298.add(class228);
	}

	void method3997(int i, int i_16_) {
		anArrayList2298.remove(i);
	}

	void method3998(int i, int i_17_, byte i_18_) {
		((Class215) anArrayList2290.get(i)).method3940(i_17_, (byte) 43);
		method3989(-2046174135);
	}

	void method3999(int i, int i_19_, byte i_20_) {
		Class215 class215 = (Class215) anArrayList2290.get(i);
		class215.method3910(i_19_, 1550047890);
		class215.method3912(true, -1826729605);
	}

	void method4000(int i, int i_21_) {
		Class215 class215 = (Class215) anArrayList2290.get(i);
		class215.method3912(false, -1818313312);
	}

	void method4001(int i, int i_22_) {
		((Class215) anArrayList2290.get(i)).method3916(i_22_, 551435165);
	}

	public Class242 method4002() {
		if (anArrayList2290.isEmpty())
			return Class242.aClass242_2468;
		Class242 class242 = ((Class215) anArrayList2290.get(0)).method3913(-1477355208);
		switch (1998758859 * class242.anInt2465) {
		case 0:
		case 3:
			return class242;
		default: {
			Iterator iterator = anArrayList2290.iterator();
			while (iterator.hasNext()) {
				Class215 class215 = (Class215) iterator.next();
				if (class215.method3913(1450559403) == Class242.aClass242_2468)
					return Class242.aClass242_2468;
			}
			return Class242.aClass242_2467;
		}
		}
	}

	public int method4003() {
		return (int) (-6984276438804814041L * aLong2291);
	}

	void method4004(int i) {
		Iterator iterator = anArrayList2290.iterator();
		while (iterator.hasNext()) {
			Class215 class215 = (Class215) iterator.next();
			class215.method3909(Class242.aClass242_2466, (byte) -43);
		}
	}

	void method4005(int i, Class215 class215, int i_23_) {
		Class215 class215_24_ = (Class215) anArrayList2290.get(i);
		class215_24_.method3953(class215, -1122893738);
	}

	public Interface19 method4006() {
		return new Class144(Class465.aClass465_5309, aClass18_2296);
	}

	void method4007() {
		Iterator iterator = anArrayList2290.iterator();
		while (iterator.hasNext()) {
			Class215 class215 = (Class215) iterator.next();
			class215.method3909(Class242.aClass242_2469, (byte) -29);
		}
	}

	int method4008() {
		return anInt2302 * -1558850309;
	}

	int method4009() {
		return anInt2302 * -1558850309;
	}

	void method4010(Class215 class215, byte i) {
		anArrayList2290.add(class215);
		method3989(-2046174135);
	}

	public List method4011() {
		return Collections.unmodifiableList(anArrayList2298);
	}

	public boolean method4012() {
		return aBool2292;
	}

	void method4013(Class215 class215) {
		anArrayList2290.add(class215);
		method3989(-2046174135);
	}

	public int method4014() {
		return -165427287 * anInt2297;
	}

	public int method4015() {
		return -165427287 * anInt2297;
	}

	public Interface19 method4016() {
		return new Class144(Class465.aClass465_5309, aClass18_2296);
	}

	public long method4017() {
		return 454742085340415807L * aLong2287;
	}

	public long method4018() {
		return 454742085340415807L * aLong2287;
	}

	public long method4019() {
		return 454742085340415807L * aLong2287;
	}

	public long method4020() {
		return 454742085340415807L * aLong2287;
	}

	public String method4021() {
		return aString2293;
	}

	public int method4022() {
		return (int) (-6984276438804814041L * aLong2291);
	}

	public String method4023(int i) {
		return aString2293;
	}

	void method4024() {
		int i = -1;
		int i_25_ = -1;
		for (int i_26_ = 0; i_26_ < anArrayList2290.size(); i_26_++) {
			Class215 class215 = (Class215) anArrayList2290.get(i_26_);
			int i_27_ = class215.method3907(2025045684);
			if (i_27_ > i) {
				i = i_27_;
				i_25_ = i_26_;
			}
		}
		anInt2295 = i_25_ * 1967594813;
	}

	void method4025() {
		int i = -1;
		int i_28_ = -1;
		for (int i_29_ = 0; i_29_ < anArrayList2290.size(); i_29_++) {
			Class215 class215 = (Class215) anArrayList2290.get(i_29_);
			int i_30_ = class215.method3907(1144082487);
			if (i_30_ > i) {
				i = i_30_;
				i_28_ = i_29_;
			}
		}
		anInt2295 = i_28_ * 1967594813;
	}

	void method4026() {
		int i = -1;
		int i_31_ = -1;
		for (int i_32_ = 0; i_32_ < anArrayList2290.size(); i_32_++) {
			Class215 class215 = (Class215) anArrayList2290.get(i_32_);
			int i_33_ = class215.method3907(-219210809);
			if (i_33_ > i) {
				i = i_33_;
				i_31_ = i_32_;
			}
		}
		anInt2295 = i_31_ * 1967594813;
	}

	public int method4027() {
		return -2114805227 * anInt2295;
	}

	public int method4028() {
		return -2114805227 * anInt2295;
	}

	public int method4029() {
		return -2114805227 * anInt2295;
	}

	public Class242 method4030() {
		if (anArrayList2290.isEmpty())
			return Class242.aClass242_2468;
		Class242 class242 = ((Class215) anArrayList2290.get(0)).method3913(1587553090);
		switch (1998758859 * class242.anInt2465) {
		case 0:
		case 3:
			return class242;
		default: {
			Iterator iterator = anArrayList2290.iterator();
			while (iterator.hasNext()) {
				Class215 class215 = (Class215) iterator.next();
				if (class215.method3913(1762589664) == Class242.aClass242_2468)
					return Class242.aClass242_2468;
			}
			return Class242.aClass242_2467;
		}
		}
	}

	void method4031(int i, Class215 class215) {
		Class215 class215_34_ = (Class215) anArrayList2290.get(i);
		class215_34_.method3953(class215, -382626560);
	}

	public Class215 method4032(int i) {
		if (-1 == i)
			return null;
		return (Class215) anArrayList2290.get(i);
	}

	public String method4033() {
		return aString2293;
	}

	public long method4034() {
		return 454742085340415807L * aLong2287;
	}

	public int method4035() {
		return (int) (-6984276438804814041L * aLong2291);
	}

	public Interface19 method4036() {
		return new Class144(Class465.aClass465_5309, aClass18_2296);
	}

	void method4037(int i, int i_35_) {
		((Class215) anArrayList2290.get(i)).method3940(i_35_, (byte) 119);
		method3989(-2046174135);
	}

	public boolean method4038() {
		return aBool2292;
	}

	public List method4039() {
		return Collections.unmodifiableList(anArrayList2298);
	}

	void method4040(int i) {
		anArrayList2290.remove(i);
		method3989(-2046174135);
	}

	void method4041(int i) {
		anArrayList2290.remove(i);
		method3989(-2046174135);
	}

	void method4042(Class228 class228) {
		anArrayList2298.add(class228);
	}

	void method4043(int i, int i_36_, int i_37_) {
		((Class215) anArrayList2290.get(i)).method3916(i_36_, -39496154);
	}

	void method4044(int i) {
		anArrayList2298.remove(i);
	}

	void method4045(int i, boolean bool) {
		Class215 class215 = (Class215) anArrayList2290.get(i);
		class215.method3909((bool ? Class242.aClass242_2467 : Class242.aClass242_2468), (byte) -109);
	}

	void method4046(int i, int i_38_) {
		Class215 class215 = (Class215) anArrayList2290.get(i);
		class215.method3910(i_38_, 2103284388);
		class215.method3912(true, -1646119751);
	}

	public String method4047() {
		return aString2293;
	}

	void method4048(int i) {
		Class215 class215 = (Class215) anArrayList2290.get(i);
		class215.method3912(false, -1395190997);
	}

	void method4049(int i) {
		Class215 class215 = (Class215) anArrayList2290.get(i);
		class215.method3912(false, -1216293906);
	}

	void method4050(int i) {
		anArrayList2298.remove(i);
	}

	void method4051(int i) {
		Iterator iterator = anArrayList2290.iterator();
		while (iterator.hasNext()) {
			Class215 class215 = (Class215) iterator.next();
			class215.method3909(Class242.aClass242_2469, (byte) -54);
		}
	}

	void method4052(int i, int i_39_) {
		((Class215) anArrayList2290.get(i)).method3916(i_39_, 727152496);
	}

	void method4053() {
		Iterator iterator = anArrayList2290.iterator();
		while (iterator.hasNext()) {
			Class215 class215 = (Class215) iterator.next();
			class215.method3909(Class242.aClass242_2469, (byte) -122);
		}
	}

	public long method4054(int i) {
		return 454742085340415807L * aLong2287;
	}

	void method4055() {
		Iterator iterator = anArrayList2290.iterator();
		while (iterator.hasNext()) {
			Class215 class215 = (Class215) iterator.next();
			class215.method3909(Class242.aClass242_2469, (byte) -115);
		}
	}

	void method4056() {
		Iterator iterator = anArrayList2290.iterator();
		while (iterator.hasNext()) {
			Class215 class215 = (Class215) iterator.next();
			class215.method3909(Class242.aClass242_2469, (byte) -23);
		}
	}

	void method4057() {
		Iterator iterator = anArrayList2290.iterator();
		while (iterator.hasNext()) {
			Class215 class215 = (Class215) iterator.next();
			class215.method3909(Class242.aClass242_2466, (byte) -35);
		}
	}

	void method4058() {
		Iterator iterator = anArrayList2290.iterator();
		while (iterator.hasNext()) {
			Class215 class215 = (Class215) iterator.next();
			class215.method3909(Class242.aClass242_2466, (byte) -128);
		}
	}

	public List method4059(byte i) {
		return Collections.unmodifiableList(anArrayList2298);
	}

	void method4060() {
		Iterator iterator = anArrayList2290.iterator();
		while (iterator.hasNext()) {
			Class215 class215 = (Class215) iterator.next();
			class215.method3909(Class242.aClass242_2466, (byte) -52);
		}
	}

	public boolean method4061() {
		return aBool2292;
	}

	public Class242 method4062(int i) {
		if (anArrayList2290.isEmpty())
			return Class242.aClass242_2468;
		Class242 class242 = ((Class215) anArrayList2290.get(0)).method3913(-1334406644);
		switch (1998758859 * class242.anInt2465) {
		case 0:
		case 3:
			return class242;
		default: {
			Iterator iterator = anArrayList2290.iterator();
			while (iterator.hasNext()) {
				Class215 class215 = (Class215) iterator.next();
				if (class215.method3913(1215212874) == Class242.aClass242_2468)
					return Class242.aClass242_2468;
			}
			return Class242.aClass242_2467;
		}
		}
	}

	void method4063(int i, int i_40_) {
		Class215 class215 = (Class215) anArrayList2290.get(i);
		class215.method3910(i_40_, 459096334);
		class215.method3912(true, -1448922896);
	}

	static final void method4064(Class665 class665, int i) {
		String string = null;
		if (null != Class200.aClass50_2203)
			string = Class200.aClass50_2203.method1269(-1967081588);
		if (null == string)
			string = "";
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = string;
	}

	static final void method4065(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class254.anInt2808 * 1948568831;
	}

	public static final void method4066(int i, String string, Color color, Color color_41_, Color color_42_, int i_43_) {
		try {
			Graphics graphics = Class451.aCanvas4939.getGraphics();
			if (null == Class515.aFont7021)
				Class515.aFont7021 = new Font("Helvetica", 1, 13);
			if (null == color)
				color = new Color(140, 17, 17);
			if (null == color_41_)
				color_41_ = new Color(140, 17, 17);
			if (null == color_42_)
				color_42_ = new Color(255, 255, 255);
			try {
				if (null == Class629.anImage8217)
					Class629.anImage8217 = Class451.aCanvas4939.createImage((Class289.anInt3223 * -1803844265), (-471480167 * (Class611.anInt8009)));
				Graphics graphics_44_ = Class629.anImage8217.getGraphics();
				graphics_44_.setColor(Color.black);
				graphics_44_.fillRect(0, 0, -1803844265 * Class289.anInt3223, -471480167 * Class611.anInt8009);
				int i_45_ = Class289.anInt3223 * -1803844265 / 2 - 152;
				int i_46_ = Class611.anInt8009 * -471480167 / 2 - 18;
				graphics_44_.setColor(color_41_);
				graphics_44_.drawRect(i_45_, i_46_, 303, 33);
				graphics_44_.setColor(color);
				graphics_44_.fillRect(i_45_ + 2, i_46_ + 2, i * 3, 30);
				graphics_44_.setColor(Color.black);
				graphics_44_.drawRect(1 + i_45_, i_46_ + 1, 301, 31);
				graphics_44_.fillRect(2 + i_45_ + i * 3, 2 + i_46_, 300 - i * 3, 30);
				graphics_44_.setFont(Class515.aFont7021);
				graphics_44_.setColor(color_42_);
				graphics_44_.drawString(string, (i_45_ + (304 - string.length() * 6) / 2), i_46_ + 22);
				if (null != Class515.aString7037) {
					graphics_44_.setFont(Class515.aFont7021);
					graphics_44_.setColor(color_42_);
					graphics_44_.drawString(Class515.aString7037, (-1803844265 * Class289.anInt3223 / 2 - Class515.aString7037.length() * 6 / 2), -471480167 * Class611.anInt8009 / 2 - 26);
				}
				graphics.drawImage(Class629.anImage8217, 0, 0, null);
			} catch (Exception exception) {
				graphics.setColor(Color.black);
				graphics.fillRect(0, 0, Class289.anInt3223 * -1803844265, Class611.anInt8009 * -471480167);
				int i_47_ = -1803844265 * Class289.anInt3223 / 2 - 152;
				int i_48_ = -471480167 * Class611.anInt8009 / 2 - 18;
				graphics.setColor(color_41_);
				graphics.drawRect(i_47_, i_48_, 303, 33);
				graphics.setColor(color);
				graphics.fillRect(i_47_ + 2, i_48_ + 2, i * 3, 30);
				graphics.setColor(Color.black);
				graphics.drawRect(i_47_ + 1, i_48_ + 1, 301, 31);
				graphics.fillRect(3 * i + (2 + i_47_), 2 + i_48_, 300 - i * 3, 30);
				graphics.setFont(Class515.aFont7021);
				graphics.setColor(color_42_);
				if (Class515.aString7037 != null) {
					graphics.setFont(Class515.aFont7021);
					graphics.setColor(color_42_);
					graphics.drawString(Class515.aString7037, (-1803844265 * Class289.anInt3223 / 2 - (Class515.aString7037.length() * 6 / 2)), (-471480167 * Class611.anInt8009 / 2 - 26));
				}
				graphics.drawString(string, i_47_ + (304 - string.length() * 6) / 2, 22 + i_48_);
			}
		} catch (Exception exception) {
			Class451.aCanvas4939.repaint();
		}
	}

	static final void method4067(Class243 class243, Class665 class665, int i) {
		int i_49_ = 10;
		int i_50_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		int i_51_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class208_Sub22.method15640(class243, i_49_, i_50_, i_51_, class665, 910230032);
	}
}
