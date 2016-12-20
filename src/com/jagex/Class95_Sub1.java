/* Class95_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Map;

public abstract class Class95_Sub1 extends Class95 implements Interface53 {
	protected Class465 aClass465_8985;

	public Class425 method14480(RSByteBuffer class527_sub38, Class475 class475) {
		int i = class527_sub38.readUnsignedShort();
		Class425 class425 = new Class425(i);
		Class var_class = class475.aClass5381;
		if (var_class == java.lang.Integer.class)
			class425.anObject4804 = Integer.valueOf(class527_sub38.readInt());
		else if (var_class == java.lang.Long.class)
			class425.anObject4804 = Long.valueOf(class527_sub38.method16612((byte) 1));
		else if (var_class == java.lang.String.class)
			class425.anObject4804 = class527_sub38.readVersionedString(90180177);
		else if (com.jagex.Interface8.class.isAssignableFrom(var_class)) {
			try {
				Interface8 interface8 = (Interface8) var_class.newInstance();
				interface8.method63(class527_sub38, 1938919602);
				class425.anObject4804 = interface8;
			} catch (InstantiationException instantiationexception) {
				/* empty */
			} catch (IllegalAccessException illegalaccessexception) {
				/* empty */
			}
		} else
			throw new IllegalStateException();
		Class160 class160 = (Class160) method81(i, -1027099683);
		if (!class160.method2573(1380376418) || class160.aClass462_1748.method7606(-370544245) != class475)
			return null;
		return class425;
	}

	public int method14481(Class425 class425) {
		int i = 2;
		if (class425.anObject4804 instanceof Integer)
			i += 4;
		else if (class425.anObject4804 instanceof Long)
			i += 8;
		else if (class425.anObject4804 instanceof String)
			i += Class57.method1363((String) class425.anObject4804, (byte) 8);
		else if (class425.anObject4804 instanceof Interface8)
			i += ((Interface8) class425.anObject4804).method64(1140979902);
		else
			throw new IllegalStateException();
		return i;
	}

	public Object method354(int i, int i_0_) {
		Class160 class160 = (Class160) method81(i, -473563258);
		if (class160 == null || !class160.method2573(-1263733416))
			return null;
		return class160.method2577((byte) 1);
	}

	public Object method355(int i) {
		Class160 class160 = (Class160) method81(i, -255095076);
		if (class160 == null || !class160.method2573(-1500712379))
			return null;
		return class160.method2577((byte) 1);
	}

	Class95_Sub1(Class678 class678, Class465 class465, Class671 class671, int i) {
		super(class678, class671, i);
		aClass465_8985 = class465;
	}

	public void method14482(RSByteBuffer class527_sub38, Class425 class425, int i) {
		class527_sub38.writeShort(494563151 * class425.anInt4803, 1404835786);
		if (class425.anObject4804 instanceof Integer)
			class527_sub38.writeInt(((Integer) class425.anObject4804).intValue(), 1181413429);
		else if (class425.anObject4804 instanceof Long)
			class527_sub38.writeLong(((Long) class425.anObject4804).longValue());
		else if (class425.anObject4804 instanceof String)
			class527_sub38.writeGJString3((String) class425.anObject4804, (short) -27680);
		else if (class425.anObject4804 instanceof Interface8)
			((Interface8) class425.anObject4804).method69(class527_sub38, (byte) 0);
		else
			throw new IllegalStateException();
	}

	public Class425 method14483(RSByteBuffer stream, int i) {
		int i_1_ = stream.readUnsignedShort();
		Class160 class160 = (Class160) method81(i_1_, 453762875);
		if (!class160.method2573(892715707))
			throw new IllegalStateException("");
		Class425 class425 = new Class425(i_1_);
		Class var_class = class160.aClass462_1748.method7606(-1424953292).aClass5381;
		if (var_class == java.lang.Integer.class)
			class425.anObject4804 = Integer.valueOf(stream.readInt());
		else if (var_class == java.lang.Long.class)
			class425.anObject4804 = Long.valueOf(stream.method16612((byte) 1));
		else if (var_class == java.lang.String.class)
			class425.anObject4804 = stream.readVersionedString(90180177);
		else if (com.jagex.Interface8.class.isAssignableFrom(var_class)) {
			try {
				Interface8 interface8 = (Interface8) var_class.newInstance();
				interface8.method63(stream, 1326092308);
				class425.anObject4804 = interface8;
			} catch (InstantiationException instantiationexception) {
				/* empty */
			} catch (IllegalAccessException illegalaccessexception) {
				/* empty */
			}
		} else
			throw new IllegalStateException();
		return class425;
	}

	public Class425 method14484(RSByteBuffer class527_sub38, Class475 class475, byte i) {
		int i_2_ = class527_sub38.readUnsignedShort();
		Class425 class425 = new Class425(i_2_);
		Class var_class = class475.aClass5381;
		if (var_class == java.lang.Integer.class)
			class425.anObject4804 = Integer.valueOf(class527_sub38.readInt());
		else if (var_class == java.lang.Long.class)
			class425.anObject4804 = Long.valueOf(class527_sub38.method16612((byte) 1));
		else if (var_class == java.lang.String.class)
			class425.anObject4804 = class527_sub38.readVersionedString(90180177);
		else if (com.jagex.Interface8.class.isAssignableFrom(var_class)) {
			try {
				Interface8 interface8 = (Interface8) var_class.newInstance();
				interface8.method63(class527_sub38, 1782984981);
				class425.anObject4804 = interface8;
			} catch (InstantiationException instantiationexception) {
				/* empty */
			} catch (IllegalAccessException illegalaccessexception) {
				/* empty */
			}
		} else
			throw new IllegalStateException();
		Class160 class160 = (Class160) method81(i_2_, -214643709);
		if (!class160.method2573(-850917085) || class160.aClass462_1748.method7606(-895841315) != class475)
			return null;
		return class425;
	}

	public abstract Interface14 method80(int i);

	public abstract Interface14 method76(int i);

	public abstract Interface14 method79(int i);

	public abstract Interface14 method78(int i);

	public int method7() {
		return anInt1146 * 1552909915;
	}

	public int method46() {
		return anInt1146 * 1552909915;
	}

	public int method14485(Class425 class425, byte i) {
		int i_3_ = 2;
		if (class425.anObject4804 instanceof Integer)
			i_3_ += 4;
		else if (class425.anObject4804 instanceof Long)
			i_3_ += 8;
		else if (class425.anObject4804 instanceof String)
			i_3_ += Class57.method1363((String) class425.anObject4804, (byte) 8);
		else if (class425.anObject4804 instanceof Interface8)
			i_3_ += ((Interface8) class425.anObject4804).method64(758107570);
		else
			throw new IllegalStateException();
		return i_3_;
	}

	public abstract Interface14 method81(int i, int i_4_);

	public Object method356(int i) {
		Class160 class160 = (Class160) method81(i, -916494393);
		if (class160 == null || !class160.method2573(1314358402))
			return null;
		return class160.method2577((byte) 1);
	}

	public Class425 method14486(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedShort();
		Class160 class160 = (Class160) method81(i, -697593392);
		if (!class160.method2573(187354461))
			throw new IllegalStateException("");
		Class425 class425 = new Class425(i);
		Class var_class = class160.aClass462_1748.method7606(-798127923).aClass5381;
		if (var_class == java.lang.Integer.class)
			class425.anObject4804 = Integer.valueOf(class527_sub38.readInt());
		else if (var_class == java.lang.Long.class)
			class425.anObject4804 = Long.valueOf(class527_sub38.method16612((byte) 1));
		else if (var_class == java.lang.String.class)
			class425.anObject4804 = class527_sub38.readVersionedString(90180177);
		else if (com.jagex.Interface8.class.isAssignableFrom(var_class)) {
			try {
				Interface8 interface8 = (Interface8) var_class.newInstance();
				interface8.method63(class527_sub38, 1670927392);
				class425.anObject4804 = interface8;
			} catch (InstantiationException instantiationexception) {
				/* empty */
			} catch (IllegalAccessException illegalaccessexception) {
				/* empty */
			}
		} else
			throw new IllegalStateException();
		return class425;
	}

	public Class425 method14487(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedShort();
		Class160 class160 = (Class160) method81(i, 1334552687);
		if (!class160.method2573(957521740))
			throw new IllegalStateException("");
		Class425 class425 = new Class425(i);
		Class var_class = class160.aClass462_1748.method7606(-1371418406).aClass5381;
		if (var_class == java.lang.Integer.class)
			class425.anObject4804 = Integer.valueOf(class527_sub38.readInt());
		else if (var_class == java.lang.Long.class)
			class425.anObject4804 = Long.valueOf(class527_sub38.method16612((byte) 1));
		else if (var_class == java.lang.String.class)
			class425.anObject4804 = class527_sub38.readVersionedString(90180177);
		else if (com.jagex.Interface8.class.isAssignableFrom(var_class)) {
			try {
				Interface8 interface8 = (Interface8) var_class.newInstance();
				interface8.method63(class527_sub38, 1234418918);
				class425.anObject4804 = interface8;
			} catch (InstantiationException instantiationexception) {
				/* empty */
			} catch (IllegalAccessException illegalaccessexception) {
				/* empty */
			}
		} else
			throw new IllegalStateException();
		return class425;
	}

	public void method14488(RSByteBuffer class527_sub38, Class425 class425) {
		class527_sub38.writeShort(494563151 * class425.anInt4803, 1404835786);
		if (class425.anObject4804 instanceof Integer)
			class527_sub38.writeInt(((Integer) class425.anObject4804).intValue(), 1218532939);
		else if (class425.anObject4804 instanceof Long)
			class527_sub38.writeLong(((Long) class425.anObject4804).longValue());
		else if (class425.anObject4804 instanceof String)
			class527_sub38.writeGJString3((String) class425.anObject4804, (short) -6453);
		else if (class425.anObject4804 instanceof Interface8)
			((Interface8) class425.anObject4804).method69(class527_sub38, (byte) 0);
		else
			throw new IllegalStateException();
	}

	public void method14489(RSByteBuffer class527_sub38, Class425 class425) {
		class527_sub38.writeShort(494563151 * class425.anInt4803, 1404835786);
		if (class425.anObject4804 instanceof Integer)
			class527_sub38.writeInt(((Integer) class425.anObject4804).intValue(), 1607769783);
		else if (class425.anObject4804 instanceof Long)
			class527_sub38.writeLong(((Long) class425.anObject4804).longValue());
		else if (class425.anObject4804 instanceof String)
			class527_sub38.writeGJString3((String) class425.anObject4804, (short) 525);
		else if (class425.anObject4804 instanceof Interface8)
			((Interface8) class425.anObject4804).method69(class527_sub38, (byte) 0);
		else
			throw new IllegalStateException();
	}

	public void method14490(RSByteBuffer class527_sub38, Class425 class425) {
		class527_sub38.writeShort(494563151 * class425.anInt4803, 1404835786);
		if (class425.anObject4804 instanceof Integer)
			class527_sub38.writeInt(((Integer) class425.anObject4804).intValue(), -1557431199);
		else if (class425.anObject4804 instanceof Long)
			class527_sub38.writeLong(((Long) class425.anObject4804).longValue());
		else if (class425.anObject4804 instanceof String)
			class527_sub38.writeGJString3((String) class425.anObject4804, (short) -2576);
		else if (class425.anObject4804 instanceof Interface8)
			((Interface8) class425.anObject4804).method69(class527_sub38, (byte) 0);
		else
			throw new IllegalStateException();
	}

	public int method77(int i) {
		return anInt1146 * 1552909915;
	}

	public Class425 method14491(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedShort();
		Class160 class160 = (Class160) method81(i, 1303499116);
		if (!class160.method2573(265961570))
			throw new IllegalStateException("");
		Class425 class425 = new Class425(i);
		Class var_class = class160.aClass462_1748.method7606(-1278235215).aClass5381;
		if (var_class == java.lang.Integer.class)
			class425.anObject4804 = Integer.valueOf(class527_sub38.readInt());
		else if (var_class == java.lang.Long.class)
			class425.anObject4804 = Long.valueOf(class527_sub38.method16612((byte) 1));
		else if (var_class == java.lang.String.class)
			class425.anObject4804 = class527_sub38.readVersionedString(90180177);
		else if (com.jagex.Interface8.class.isAssignableFrom(var_class)) {
			try {
				Interface8 interface8 = (Interface8) var_class.newInstance();
				interface8.method63(class527_sub38, 1098330785);
				class425.anObject4804 = interface8;
			} catch (InstantiationException instantiationexception) {
				/* empty */
			} catch (IllegalAccessException illegalaccessexception) {
				/* empty */
			}
		} else
			throw new IllegalStateException();
		return class425;
	}

	public Class425 method14492(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedShort();
		Class160 class160 = (Class160) method81(i, 913823929);
		if (!class160.method2573(-1904903413))
			throw new IllegalStateException("");
		Class425 class425 = new Class425(i);
		Class var_class = class160.aClass462_1748.method7606(-962502193).aClass5381;
		if (var_class == java.lang.Integer.class)
			class425.anObject4804 = Integer.valueOf(class527_sub38.readInt());
		else if (var_class == java.lang.Long.class)
			class425.anObject4804 = Long.valueOf(class527_sub38.method16612((byte) 1));
		else if (var_class == java.lang.String.class)
			class425.anObject4804 = class527_sub38.readVersionedString(90180177);
		else if (com.jagex.Interface8.class.isAssignableFrom(var_class)) {
			try {
				Interface8 interface8 = (Interface8) var_class.newInstance();
				interface8.method63(class527_sub38, 1418350989);
				class425.anObject4804 = interface8;
			} catch (InstantiationException instantiationexception) {
				/* empty */
			} catch (IllegalAccessException illegalaccessexception) {
				/* empty */
			}
		} else
			throw new IllegalStateException();
		return class425;
	}

	public int method14493(Class425 class425) {
		int i = 2;
		if (class425.anObject4804 instanceof Integer)
			i += 4;
		else if (class425.anObject4804 instanceof Long)
			i += 8;
		else if (class425.anObject4804 instanceof String)
			i += Class57.method1363((String) class425.anObject4804, (byte) 8);
		else if (class425.anObject4804 instanceof Interface8)
			i += ((Interface8) class425.anObject4804).method64(967939511);
		else
			throw new IllegalStateException();
		return i;
	}

	public static Map method14494(Class95_Sub1[] class95_sub1s) {
		if (null == class95_sub1s || class95_sub1s.length == 0)
			return null;
		HashMap hashmap = new HashMap();
		Class95_Sub1[] class95_sub1s_5_ = class95_sub1s;
		for (int i = 0; i < class95_sub1s_5_.length; i++) {
			Class95_Sub1 class95_sub1 = class95_sub1s_5_[i];
			hashmap.put(class95_sub1.aClass465_8985, class95_sub1);
		}
		return hashmap;
	}

	static final void method14495(int i) {
		for (Class522_Sub2 class522_sub2 = ((Class522_Sub2) client.aClass705_11220.method14318(1391267174)); class522_sub2 != null; class522_sub2 = ((Class522_Sub2) client.aClass705_11220.method14318(2066936356)))
			Class230.method4320(class522_sub2, 2132000159);
		int i_6_ = 0;
		int i_7_ = 3;
		if (4 == -1481292237 * client.anInt11080) {
			for (int i_8_ = i_6_; i_8_ <= i_7_; i_8_++)
				client.method17439(i_8_);
			client.method17441();
		} else {
			client.method17477();
			for (int i_9_ = i_6_; i_9_ <= i_7_; i_9_++) {
				client.method17456();
				client.method17438(i_9_);
				client.method17439(i_9_);
			}
			client.method17440();
			client.method17441();
		}
	}

	static final void method14496(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class624.method10335(class243, class240, class665, 454382781);
	}
}
