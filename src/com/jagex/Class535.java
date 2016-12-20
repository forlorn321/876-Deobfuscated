/* Class535 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class Class535 {
	int anInt7214;
	LinkedList aLinkedList7215;
	public Class176 aClass176_7216;
	int[] anIntArray7217;
	int[] anIntArray7218;
	int anInt7219;
	boolean aBool7220;
	static int anInt7221 = 0;

	Class176 method8958(Class180 class180) {
		Class175 class175 = Class175.method2814(Class208_Sub12.aClass459_9930, 1910833981 * anInt7219, 0);
		if (class175 == null)
			return null;
		if (class175.anInt1905 < 13)
			class175.method2829(2);
		return class180.method3376(class175, 2048, 2027898691 * anInt7221, 64, 768);
	}

	Class176 method8959(Class180 class180, int i) {
		Class175 class175 = Class175.method2814(Class208_Sub12.aClass459_9930, 1910833981 * anInt7219, 0);
		if (class175 == null)
			return null;
		if (class175.anInt1905 < 13)
			class175.method2829(2);
		return class180.method3376(class175, 2048, 2027898691 * anInt7221, 64, 768);
	}

	public void method8960(Class555 class555) {
		if (class555 != null && anInt7214 * 247552429 > 0) {
			method8962(class555, (byte) -28);
			Iterator iterator = aLinkedList7215.iterator();
			while (iterator.hasNext()) {
				Class640_Sub1_Sub2_Sub6 class640_sub1_sub2_sub6 = (Class640_Sub1_Sub2_Sub6) iterator.next();
				class555.method9269(class640_sub1_sub2_sub6, false, -1895317417);
			}
			aBool7220 = true;
		}
	}

	public void method8961(Class555 class555, int i) {
		if (class555 != null && anInt7214 * 247552429 > 0) {
			method8962(class555, (byte) -71);
			Iterator iterator = aLinkedList7215.iterator();
			while (iterator.hasNext()) {
				Class640_Sub1_Sub2_Sub6 class640_sub1_sub2_sub6 = (Class640_Sub1_Sub2_Sub6) iterator.next();
				class555.method9269(class640_sub1_sub2_sub6, false, -1810199529);
			}
			aBool7220 = true;
		}
	}

	void method8962(Class555 class555, byte i) {
		aLinkedList7215 = new LinkedList();
		Class470 class470 = client.aClass509_11072.method8359(-387023123);
		Class592 class592 = client.aClass509_11072.method8283((short) 7353);
		Class592 class592_0_ = new Class592(162317215 * Class673.anInt8585, anIntArray7217[0], anIntArray7218[0]);
		for (int i_1_ = 1; i_1_ < 247552429 * anInt7214; i_1_++) {
			Class592 class592_2_ = new Class592(162317215 * Class673.anInt8585, anIntArray7217[i_1_], anIntArray7218[i_1_]);
			while ((153371143 * class592_2_.anInt7798 != class592_0_.anInt7798 * 153371143) || (-2029646807 * class592_2_.anInt7799 != class592_0_.anInt7799 * -2029646807)) {
				if (class592_0_.anInt7798 * 153371143 < 153371143 * class592_2_.anInt7798)
					class592_0_.anInt7798 += 1949141943;
				else if (class592_0_.anInt7798 * 153371143 > 153371143 * class592_2_.anInt7798)
					class592_0_.anInt7798 -= 1949141943;
				if (class592_0_.anInt7799 * -2029646807 < class592_2_.anInt7799 * -2029646807)
					class592_0_.anInt7799 += -616804327;
				else if (-2029646807 * class592_0_.anInt7799 > -2029646807 * class592_2_.anInt7799)
					class592_0_.anInt7799 -= -616804327;
				int i_3_ = Class673.anInt8585 * 162317215;
				int i_4_ = (class592_0_.anInt7798 * 153371143 - 153371143 * class592.anInt7798);
				int i_5_ = (class592_0_.anInt7799 * -2029646807 - class592.anInt7799 * -2029646807);
				if (i_4_ >= 0 && i_4_ < -547681223 * class555.anInt7443 && i_5_ >= 0 && i_5_ < class555.anInt7432 * -1437024153) {
					int i_6_ = 256 + (i_4_ << 9);
					int i_7_ = (i_5_ << 9) + 256;
					if (class470.method7706(i_4_, i_5_, (short) 4283))
						i_3_++;
					aLinkedList7215.add(new Class640_Sub1_Sub2_Sub6(class555, this, 162317215 * Class673.anInt8585, i_3_, i_6_, Class590.method9853(i_6_, i_7_, (162317215 * (Class673.anInt8585)), (byte) 5), i_7_));
				}
			}
			class592_0_ = class592_2_;
		}
	}

	public void method8963(byte i) {
		aBool7220 = false;
		aClass176_7216 = null;
	}

	public boolean method8964(int i) {
		return aBool7220;
	}

	public boolean method8965(Class180 class180, int i) {
		aClass176_7216 = method8959(class180, -314603062);
		return null != aClass176_7216;
	}

	Class176 method8966(Class180 class180) {
		Class175 class175 = Class175.method2814(Class208_Sub12.aClass459_9930, 1910833981 * anInt7219, 0);
		if (class175 == null)
			return null;
		if (class175.anInt1905 < 13)
			class175.method2829(2);
		return class180.method3376(class175, 2048, 2027898691 * anInt7221, 64, 768);
	}

	Class176 method8967(Class180 class180) {
		Class175 class175 = Class175.method2814(Class208_Sub12.aClass459_9930, 1910833981 * anInt7219, 0);
		if (class175 == null)
			return null;
		if (class175.anInt1905 < 13)
			class175.method2829(2);
		return class180.method3376(class175, 2048, 2027898691 * anInt7221, 64, 768);
	}

	public void method8968(Class555 class555) {
		if (null != class555 && null != aLinkedList7215) {
			Iterator iterator = aLinkedList7215.iterator();
			while (iterator.hasNext()) {
				Class640_Sub1_Sub2_Sub6 class640_sub1_sub2_sub6 = (Class640_Sub1_Sub2_Sub6) iterator.next();
				class555.method9219(class640_sub1_sub2_sub6.aByte10864, class640_sub1_sub2_sub6.aShort11775, class640_sub1_sub2_sub6.aShort11771, new Class542(class640_sub1_sub2_sub6), 1511356246);
			}
		}
	}

	public void method8969(Class555 class555) {
		if (class555 != null && anInt7214 * 247552429 > 0) {
			method8962(class555, (byte) 58);
			Iterator iterator = aLinkedList7215.iterator();
			while (iterator.hasNext()) {
				Class640_Sub1_Sub2_Sub6 class640_sub1_sub2_sub6 = (Class640_Sub1_Sub2_Sub6) iterator.next();
				class555.method9269(class640_sub1_sub2_sub6, false, -1627632084);
			}
			aBool7220 = true;
		}
	}

	public boolean method8970() {
		return aBool7220;
	}

	public void method8971(Class555 class555, byte i) {
		if (null != class555 && null != aLinkedList7215) {
			Iterator iterator = aLinkedList7215.iterator();
			while (iterator.hasNext()) {
				Class640_Sub1_Sub2_Sub6 class640_sub1_sub2_sub6 = (Class640_Sub1_Sub2_Sub6) iterator.next();
				class555.method9219(class640_sub1_sub2_sub6.aByte10864, class640_sub1_sub2_sub6.aShort11775, class640_sub1_sub2_sub6.aShort11771, new Class542(class640_sub1_sub2_sub6), 1504491086);
			}
		}
	}

	public void method8972(Class555 class555) {
		if (null != class555 && null != aLinkedList7215) {
			Iterator iterator = aLinkedList7215.iterator();
			while (iterator.hasNext()) {
				Class640_Sub1_Sub2_Sub6 class640_sub1_sub2_sub6 = (Class640_Sub1_Sub2_Sub6) iterator.next();
				class555.method9219(class640_sub1_sub2_sub6.aByte10864, class640_sub1_sub2_sub6.aShort11775, class640_sub1_sub2_sub6.aShort11771, new Class542(class640_sub1_sub2_sub6), 1232214605);
			}
		}
	}

	public void method8973(Class555 class555) {
		if (null != class555 && null != aLinkedList7215) {
			Iterator iterator = aLinkedList7215.iterator();
			while (iterator.hasNext()) {
				Class640_Sub1_Sub2_Sub6 class640_sub1_sub2_sub6 = (Class640_Sub1_Sub2_Sub6) iterator.next();
				class555.method9219(class640_sub1_sub2_sub6.aByte10864, class640_sub1_sub2_sub6.aShort11775, class640_sub1_sub2_sub6.aShort11771, new Class542(class640_sub1_sub2_sub6), 1465915767);
			}
		}
	}

	Class176 method8974(Class180 class180) {
		Class175 class175 = Class175.method2814(Class208_Sub12.aClass459_9930, 1910833981 * anInt7219, 0);
		if (class175 == null)
			return null;
		if (class175.anInt1905 < 13)
			class175.method2829(2);
		return class180.method3376(class175, 2048, 2027898691 * anInt7221, 64, 768);
	}

	public static void method8975(int i) {
		anInt7221 = -1245643413 * i;
	}

	public void method8976() {
		aBool7220 = false;
		aClass176_7216 = null;
	}

	public void method8977() {
		aBool7220 = false;
		aClass176_7216 = null;
	}

	public void method8978() {
		aBool7220 = false;
		aClass176_7216 = null;
	}

	public boolean method8979() {
		return aBool7220;
	}

	public Class535(Class180 class180, RSByteBuffer class527_sub38, int i) {
		anInt7219 = 1875733525 * i;
		anInt7214 = class527_sub38.readSmartVariant(983912765) * 645624357;
		anIntArray7217 = new int[anInt7214 * 247552429];
		anIntArray7218 = new int[247552429 * anInt7214];
		int i_8_ = class527_sub38.readUnsignedShort();
		int i_9_ = class527_sub38.readUnsignedShort();
		for (int i_10_ = 0; i_10_ < anInt7214 * 247552429; i_10_++) {
			anIntArray7217[i_10_] = i_8_ + class527_sub38.readByte();
			anIntArray7218[i_10_] = i_9_ + class527_sub38.readByte();
		}
		aClass176_7216 = method8959(class180, -314603062);
	}

	static final void method8980(Class665 class665, int i) {
		Class243 class243 = Class648.method10837(class665.anIntArray8525[((class665.anInt8526 -= 102380841) * 1769813785)], 790503497);
		if (null == class243.aClass243Array2665)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
		else {
			int i_11_ = class243.aClass243Array2665.length;
			for (int i_12_ = 0; i_12_ < class243.aClass243Array2665.length; i_12_++) {
				if (null == class243.aClass243Array2665[i_12_]) {
					i_11_ = i_12_;
					break;
				}
			}
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = i_11_;
		}
	}

	public static Class309 method8981(int i, int i_13_) {
		if (i == 1240716057 * Class309.aClass309_3456.anInt3462)
			return Class309.aClass309_3456;
		if (i == 1240716057 * Class309.aClass309_3455.anInt3462)
			return Class309.aClass309_3455;
		if (1240716057 * Class309.aClass309_3457.anInt3462 == i)
			return Class309.aClass309_3457;
		if (i == 1240716057 * Class309.aClass309_3459.anInt3462)
			return Class309.aClass309_3459;
		if (i == Class309.aClass309_3463.anInt3462 * 1240716057)
			return Class309.aClass309_3463;
		if (i == 1240716057 * Class309.aClass309_3460.anInt3462)
			return Class309.aClass309_3460;
		if (i == 1240716057 * Class309.aClass309_3461.anInt3462)
			return Class309.aClass309_3461;
		return null;
	}

	public static void method8982(int i, boolean bool, int i_14_) {
		Class274.method5131(i, Class53.aClass53_625.method1290((Class144_Sub1.aClass671_8995), (byte) -38), bool, -339759205);
	}

	public static int method8983(long l) {
		Class565.method9496(l);
		return Class85.aCalendar816.get(1);
	}
}
