/* Class471 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class471 implements Comparable {
	long aLong5357;
	Object anObject5358;
	Object anObject5359;
	long aLong5360;
	public static long aLong5361;

	public int compareTo(Object object) {
		return method5709((Class471) object, -1215888877);
	}

	Class471(Object object, Object object_0_) {
		anObject5359 = object;
		anObject5358 = object_0_;
	}

	public boolean equals(Object object) {
		if (object instanceof Class471)
			return anObject5358.equals(((Class471) object).anObject5358);
		throw new IllegalArgumentException();
	}

	int method5709(Class471 class471_1_, int i) {
		if (aLong5360 * -7098968320258769659L < -7098968320258769659L * class471_1_.aLong5360)
			return -1;
		if (aLong5360 * -7098968320258769659L > class471_1_.aLong5360 * -7098968320258769659L)
			return 1;
		return 0;
	}

	public boolean method5710(Object object) {
		if (object instanceof Class471)
			return anObject5358.equals(((Class471) object).anObject5358);
		throw new IllegalArgumentException();
	}

	public boolean method5711(Object object) {
		if (object instanceof Class471)
			return anObject5358.equals(((Class471) object).anObject5358);
		throw new IllegalArgumentException();
	}

	public int method5712() {
		return anObject5358.hashCode();
	}

	public int method5713() {
		return anObject5358.hashCode();
	}

	public int hashCode() {
		return anObject5358.hashCode();
	}

	static void method5714(Class668 class668, int i) {
		class668.anIntArray8541[1867269829 * class668.anInt8542 - 1] = (((Class277) Class38.aClass53_Sub2_481.method70((class668.anIntArray8541[((1867269829 * class668.anInt8542) - 1)]), (byte) 47)).method3744(Class465_Sub1.aClass96_10352, (byte) -68) ? 1 : 0);
	}

	static final void method5715(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -2091455035) != null)
			string = string.substring(0, string.length() - 1);
		class251.onMouseLeaveHook = Class33.method796(string, class668, (short) 22578);
		class251.hasComponentHook = true;
	}

	static final void method5716(Class668 class668, byte i) {
		if (null != Class646.aClass536_Sub15_8361) {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1;
			class668.aClass536_Sub15_8553 = Class646.aClass536_Sub15_8361;
		} else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	static void method5717(Class167 class167, int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		class167.method2369(i, i_2_, i + i_3_, i_2_ + i_4_);
		if (962386111 * Class542_Sub1.anInt10700 < 100) {
			int i_6_ = 20;
			int i_7_ = i_3_ / 2 + i;
			int i_8_ = i_2_ + i_4_ / 2 - 18 - i_6_;
			class167.method2063(i, i_2_, i_3_, i_4_, -16777216, 0);
			class167.method2062(i_7_ - 152, i_8_, 304, 34, client.aColorArray11039[client.anInt10988 * 247320061].getRGB(), 0);
			class167.method2063(i_7_ - 150, i_8_ + 2, Class542_Sub1.anInt10700 * -1407808963, 30, client.aColorArray11038[client.anInt10988 * 247320061].getRGB(), 0);
			Class26.aClass184_248.method2742(Class38.aClass38_425.method840(Class459.aClass664_5178, 1526292006), i_7_, i_6_ + i_8_, client.aColorArray11058[client.anInt10988 * 247320061].getRGB(), -1, (byte) -52);
		} else {
			int i_9_ = (804924017 * Class552.anInt7416 - (int) ((float) i_3_ / Class542_Sub1.aFloat7181));
			int i_10_ = (Class391.anInt4063 * 2122662073 + (int) ((float) i_4_ / Class542_Sub1.aFloat7181));
			int i_11_ = (804924017 * Class552.anInt7416 + (int) ((float) i_3_ / Class542_Sub1.aFloat7181));
			int i_12_ = (2122662073 * Class391.anInt4063 - (int) ((float) i_4_ / Class542_Sub1.aFloat7181));
			Class514.anInt6990 = 1520576557 * (Class552.anInt7416 * 804924017 - (int) ((float) i_3_ / Class542_Sub1.aFloat7181));
			Class360.anInt3828 = ((Class391.anInt4063 * 2122662073 - (int) ((float) i_4_ / Class542_Sub1.aFloat7181)) * -1380067899);
			Class223.anInt2337 = ((int) ((float) (i_3_ * 2) / Class542_Sub1.aFloat7181) * -430154795);
			Class553.anInt7482 = 2095454767 * (int) ((float) (2 * i_4_) / Class542_Sub1.aFloat7181);
			Class542_Sub1.aClass199_7211 = Class542_Sub1.aClass199_7166;
			Class542_Sub1.method6568(Class542_Sub1.anInt7185 + i_9_, Class542_Sub1.anInt7186 + i_10_, Class542_Sub1.anInt7185 + i_11_, Class542_Sub1.anInt7186 + i_12_, i, i_2_, i_3_ + i, 1 + (i_4_ + i_2_));
			Class542_Sub1.method6548(class167, !Class542_Sub1.aBool10726, !Class542_Sub1.aBool10727, client.aBool11123, false);
			Class708 class708 = Class542_Sub1.method6569(class167);
			Class676.method8041(class167, class708, 0, 0, 1839102121);
			if (client.aBool11314) {
				int i_13_ = i + i_3_ - 5;
				int i_14_ = i_4_ + i_2_ - 8;
				Class536_Sub15.aClass184_10488.method2741(new StringBuilder().append("Fps: ").append(GameShell.anInt6856 * -311312947).append(" (").append(GameShell.anInt6884 * 93998629).append(" ms)").toString(), i_13_, i_14_, 16776960, -1, -256630460);
				i_14_ -= 15;
				Runtime runtime = Runtime.getRuntime();
				int i_15_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				int i_16_ = 16776960;
				if (i_15_ > 65536)
					i_16_ = 16711680;
				Class536_Sub15.aClass184_10488.method2741(new StringBuilder().append("Mem:").append(i_15_).append("k").toString(), i_13_, i_14_, i_16_, -1, 727570684);
				i_14_ -= 15;
			}
			Class542_Sub1.aClass199_7166.method2883(5, -1951545000);
		}
	}

	static final void method5718(Class668 class668, byte i) {
		if (Class683.aClass301_Sub1_8651.method4062(1916215837) != Class300.aClass300_3357)
			throw new RuntimeException();
		((Class706_Sub3) Class683.aClass301_Sub1_8651.method4052(-810172525)).method10281((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]), 1753335757);
	}

	static final void method5719(Class668 class668, short i) throws Exception_Sub3 {
		int i_17_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class683.aClass301_Sub1_8651.method4082(Class642.method7734(i_17_, (byte) 10), true, (byte) 0);
		client.aBool11242 = true;
	}

	static final void method5720(Class668 class668, byte i) {
		int i_18_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_18_);
		Class234 class234 = Class463.aClass234Array5227[i_18_ >> 16];
		Class329.method4317(class251, class234, class668, 1643719200);
	}

	public static Class536_Sub31_Sub2 method5721(int i, int i_19_, int i_20_, int i_21_, int i_22_) {
		synchronized (Class536_Sub31_Sub2.aClass536_Sub31_Sub2Array11857) {
			Class536_Sub31_Sub2 class536_sub31_sub2;
			if (Class292.anInt3245 * -1272911001 == 0)
				class536_sub31_sub2 = new Class536_Sub31_Sub2();
			else
				class536_sub31_sub2 = (Class536_Sub31_Sub2.aClass536_Sub31_Sub2Array11857[(Class292.anInt3245 -= 1051721815) * -1272911001]);
			class536_sub31_sub2.anInt11861 = i * -291598331;
			class536_sub31_sub2.anInt11862 = -873632981 * i_19_;
			class536_sub31_sub2.anInt11858 = i_20_ * 1272902575;
			class536_sub31_sub2.anInt11859 = 572664169 * i_21_;
			class536_sub31_sub2.aLong11860 = Class249.method3450(1423316392) * -8035874528456178869L;
			Class536_Sub31_Sub2 class536_sub31_sub2_23_ = class536_sub31_sub2;
			return class536_sub31_sub2_23_;
		}
	}
}
