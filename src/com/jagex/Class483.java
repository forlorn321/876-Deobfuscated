/* Class483 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class483 {
	float aFloat5431;
	Interface70 anInterface70_5432;
	Class482 aClass482_5433 = Class482.aClass482_5419;
	boolean aBool5434 = false;
	Object anObject5435;
	float aFloat5436;
	Class442 aClass442_5437;
	int anInt5438;
	boolean aBool5439;
	boolean aBool5440;
	List aList5441;
	int anInt5442;
	float aFloat5443;
	Class358 aClass358_5444;
	int anInt5445;
	Interface56 anInterface56_5446;
	Object anObject5447;
	int anInt5448 = 0;
	float aFloat5449;

	public void method7847(Interface56 interface56, byte i) {
		anInterface56_5446 = interface56;
	}

	void method7848(byte i) {
		anInterface70_5432 = null;
		aClass482_5433 = Class482.aClass482_5419;
		aBool5434 = false;
		aList5441.clear();
		anObject5435 = null;
		aClass442_5437 = null;
		anInt5438 = -1968923573;
		aBool5439 = false;
		anInt5442 = 0;
		aFloat5431 = 0.0F;
		anInterface56_5446 = null;
		aFloat5443 = 0.0F;
		aFloat5436 = 0.0F;
		anInt5445 = 0;
		aBool5440 = false;
		anObject5447 = null;
		anInt5448 = 0;
		aFloat5449 = 1.0F;
	}

	public void method7849(Interface70 interface70, int i) {
		anInterface70_5432 = interface70;
		aFloat5431 = 0.0F;
		aClass482_5433 = Class482.aClass482_5420;
	}

	public void method7850(byte i) {
		if (aClass482_5433 != Class482.aClass482_5425 && Class482.aClass482_5426 != aClass482_5433)
			method7864(0, (byte) 6);
		Iterator iterator = aList5441.iterator();
		while (iterator.hasNext()) {
			Class494 class494 = (Class494) iterator.next();
			if (class494.method8020(433009517) != this)
				iterator.remove();
			else
				class494.method8009((short) 363);
		}
		method7848((byte) -117);
		aClass482_5433 = Class482.aClass482_5428;
	}

	public void method7851(byte i) {
		if (!aBool5434 && (aClass482_5433 != Class482.aClass482_5427 && Class482.aClass482_5428 != aClass482_5433 && Class482.aClass482_5419 != aClass482_5433 && aClass482_5433 != Class482.aClass482_5424) && ((-211953871 * aClass482_5433.anInt5429 <= -211953871 * Class482.aClass482_5420.anInt5429) || (-211953871 * aClass482_5433.anInt5429 >= Class482.aClass482_5425.anInt5429 * -211953871)))
			aClass482_5433 = Class482.aClass482_5421;
	}

	public void method7852(int i) {
		if (Class482.aClass482_5427 != aClass482_5433 && Class482.aClass482_5428 != aClass482_5433 && aClass482_5433 != Class482.aClass482_5419 && aClass482_5433 != Class482.aClass482_5424) {
			if ((aClass482_5433 == Class482.aClass482_5421 || Class482.aClass482_5422 == aClass482_5433) && false == aBool5434)
				aBool5434 = true;
			else if ((-211953871 * aClass482_5433.anInt5429 < -211953871 * Class482.aClass482_5421.anInt5429) || (aClass482_5433.anInt5429 * -211953871 >= -211953871 * Class482.aClass482_5425.anInt5429)) {
				aClass482_5433 = Class482.aClass482_5421;
				aBool5434 = true;
			}
		}
	}

	public Class442 method7853() {
		return aClass442_5437;
	}

	public boolean method7854() {
		aBool5440 = false;
		return 0 != -1333626445 * anInt5445;
	}

	public int method7855(short i) {
		return 287355549 * anInt5438;
	}

	public void method7856() {
		if (!aBool5434 && (aClass482_5433 != Class482.aClass482_5427 && Class482.aClass482_5428 != aClass482_5433 && Class482.aClass482_5419 != aClass482_5433 && aClass482_5433 != Class482.aClass482_5424) && ((-211953871 * aClass482_5433.anInt5429 <= -211953871 * Class482.aClass482_5420.anInt5429) || (-211953871 * aClass482_5433.anInt5429 >= Class482.aClass482_5425.anInt5429 * -211953871)))
			aClass482_5433 = Class482.aClass482_5421;
	}

	public void method7857(int i, boolean bool) {
		aBool5440 = bool;
		anInt5445 = i * -1732190853;
	}

	public Class482 method7858(int i) {
		return aClass482_5433;
	}

	public void method7859(Object object, int i) {
		anObject5435 = object;
	}

	public Object method7860() {
		return anObject5447;
	}

	public void method7861(Object object, byte i) {
		anObject5447 = object;
	}

	public void method7862(int i, byte i_0_) {
		anInt5438 = i * 1968923573;
	}

	public void method7863(int i) {
		if (-211953871 * aClass482_5433.anInt5429 < Class482.aClass482_5425.anInt5429 * -211953871) {
			if (aClass482_5433.anInt5429 * -211953871 < Class482.aClass482_5423.anInt5429 * -211953871) {
				aClass482_5433 = Class482.aClass482_5425;
				aBool5434 = false;
			} else if (i <= 0) {
				Iterator iterator = aList5441.iterator();
				while (iterator.hasNext()) {
					Class494 class494 = (Class494) iterator.next();
					if (class494.method8020(433009517) != this)
						iterator.remove();
					else
						class494.method8078(-1630878985);
				}
				aClass482_5433 = Class482.aClass482_5425;
				aBool5434 = false;
			} else {
				aClass482_5433 = Class482.aClass482_5424;
				Iterator iterator = aList5441.iterator();
				while (iterator.hasNext()) {
					Class494 class494 = (Class494) iterator.next();
					if (class494.method8020(433009517) != this)
						iterator.remove();
					else
						class494.method8010(0.0F, i, (byte) 10);
				}
			}
		}
	}

	public void method7864(int i, byte i_1_) {
		if (-211953871 * aClass482_5433.anInt5429 < Class482.aClass482_5425.anInt5429 * -211953871) {
			if (aClass482_5433.anInt5429 * -211953871 < Class482.aClass482_5423.anInt5429 * -211953871) {
				aClass482_5433 = Class482.aClass482_5425;
				aBool5434 = false;
			} else if (i <= 0) {
				Iterator iterator = aList5441.iterator();
				while (iterator.hasNext()) {
					Class494 class494 = (Class494) iterator.next();
					if (class494.method8020(433009517) != this)
						iterator.remove();
					else
						class494.method8078(-1630878985);
				}
				aClass482_5433 = Class482.aClass482_5425;
				aBool5434 = false;
			} else {
				aClass482_5433 = Class482.aClass482_5424;
				Iterator iterator = aList5441.iterator();
				while (iterator.hasNext()) {
					Class494 class494 = (Class494) iterator.next();
					if (class494.method8020(433009517) != this)
						iterator.remove();
					else
						class494.method8010(0.0F, i, (byte) 28);
				}
			}
		}
	}

	public Class482 method7865() {
		return aClass482_5433;
	}

	public void method7866(Interface70 interface70) {
		anInterface70_5432 = interface70;
		aFloat5431 = 0.0F;
		aClass482_5433 = Class482.aClass482_5420;
	}

	public void method7867(Class442 class442, int i) {
		aClass442_5437 = class442;
	}

	public Class442 method7868(int i) {
		return aClass442_5437;
	}

	public float method7869(short i) {
		return aFloat5443;
	}

	public void method7870(boolean bool, int i, int i_2_) {
		aBool5439 = bool;
		anInt5442 = i * 1971645381;
	}

	public void method7871(Interface56 interface56) {
		anInterface56_5446 = interface56;
	}

	public void method7872(float f, byte i) {
		aFloat5436 = f;
	}

	public int method7873() {
		return 287355549 * anInt5438;
	}

	public boolean method7874(byte i) {
		aBool5440 = false;
		return 0 != -1333626445 * anInt5445;
	}

	public void method7875(int i) {
		Iterator iterator = aList5441.iterator();
		aClass482_5433 = Class482.aClass482_5425;
		while (iterator.hasNext()) {
			Class494 class494 = (Class494) iterator.next();
			if (class494.method8020(433009517) == this)
				class494.method8017(-1469817245);
		}
	}

	public void method7876(float f, int i, int i_3_) {
		aFloat5431 = f;
		int i_4_ = 0;
		Iterator iterator = aList5441.iterator();
		while (iterator.hasNext()) {
			Class494 class494 = (Class494) iterator.next();
			if (class494.method8020(433009517) != this)
				aList5441.remove(class494);
			else {
				class494.method8010(aFloat5431, i, (byte) 122);
				i_4_++;
			}
		}
		if (0 == i_4_)
			anInt5448 = -1009406003 * i;
	}

	public void method7877(Object object) {
		anObject5447 = object;
	}

	public void method7878(float f, int i) {
		if (!(f < 0.0F))
			aFloat5449 = f;
	}

	public void method7879(float f) {
		if (!(f < 0.0F))
			aFloat5449 = f;
	}

	public void method7880(int i, boolean bool, int i_5_) {
		aBool5440 = bool;
		anInt5445 = i * -1732190853;
	}

	void method7881() {
		anInterface70_5432 = null;
		aClass482_5433 = Class482.aClass482_5419;
		aBool5434 = false;
		aList5441.clear();
		anObject5435 = null;
		aClass442_5437 = null;
		anInt5438 = -1968923573;
		aBool5439 = false;
		anInt5442 = 0;
		aFloat5431 = 0.0F;
		anInterface56_5446 = null;
		aFloat5443 = 0.0F;
		aFloat5436 = 0.0F;
		anInt5445 = 0;
		aBool5440 = false;
		anObject5447 = null;
		anInt5448 = 0;
		aFloat5449 = 1.0F;
	}

	public void method7882(int i) {
		Iterator iterator = aList5441.iterator();
		aClass482_5433 = Class482.aClass482_5421;
		while (iterator.hasNext()) {
			Class494 class494 = (Class494) iterator.next();
			if (class494.method8020(433009517) == this)
				class494.method8028(-1660906271);
		}
	}

	public void method7883(Interface70 interface70) {
		anInterface70_5432 = interface70;
		aFloat5431 = 0.0F;
		aClass482_5433 = Class482.aClass482_5420;
	}

	public void method7884(int i) {
		if (anInt5445 * -1333626445 > -1 && !aBool5440)
			anInt5445 -= -1732190853;
		if (anInt5445 * -1333626445 == 0)
			method7852(1969554825);
	}

	public void method7885(Interface70 interface70) {
		anInterface70_5432 = interface70;
		aFloat5431 = 0.0F;
		aClass482_5433 = Class482.aClass482_5420;
	}

	public void method7886() {
		if (aClass482_5433 != Class482.aClass482_5425 && Class482.aClass482_5426 != aClass482_5433)
			method7864(0, (byte) 6);
		Iterator iterator = aList5441.iterator();
		while (iterator.hasNext()) {
			Class494 class494 = (Class494) iterator.next();
			if (class494.method8020(433009517) != this)
				iterator.remove();
			else
				class494.method8009((short) -18399);
		}
		method7848((byte) -114);
		aClass482_5433 = Class482.aClass482_5428;
	}

	public void method7887() {
		if (aClass482_5433 != Class482.aClass482_5425 && Class482.aClass482_5426 != aClass482_5433)
			method7864(0, (byte) 6);
		Iterator iterator = aList5441.iterator();
		while (iterator.hasNext()) {
			Class494 class494 = (Class494) iterator.next();
			if (class494.method8020(433009517) != this)
				iterator.remove();
			else
				class494.method8009((short) -885);
		}
		method7848((byte) -114);
		aClass482_5433 = Class482.aClass482_5428;
	}

	public void method7888() {
		if (!aBool5434 && (aClass482_5433 != Class482.aClass482_5427 && Class482.aClass482_5428 != aClass482_5433 && Class482.aClass482_5419 != aClass482_5433 && aClass482_5433 != Class482.aClass482_5424) && ((-211953871 * aClass482_5433.anInt5429 <= -211953871 * Class482.aClass482_5420.anInt5429) || (-211953871 * aClass482_5433.anInt5429 >= Class482.aClass482_5425.anInt5429 * -211953871)))
			aClass482_5433 = Class482.aClass482_5421;
	}

	void method7889() {
		anInterface70_5432 = null;
		aClass482_5433 = Class482.aClass482_5419;
		aBool5434 = false;
		aList5441.clear();
		anObject5435 = null;
		aClass442_5437 = null;
		anInt5438 = -1968923573;
		aBool5439 = false;
		anInt5442 = 0;
		aFloat5431 = 0.0F;
		anInterface56_5446 = null;
		aFloat5443 = 0.0F;
		aFloat5436 = 0.0F;
		anInt5445 = 0;
		aBool5440 = false;
		anObject5447 = null;
		anInt5448 = 0;
		aFloat5449 = 1.0F;
	}

	public void method7890() {
		if (Class482.aClass482_5427 != aClass482_5433 && Class482.aClass482_5428 != aClass482_5433 && aClass482_5433 != Class482.aClass482_5419 && aClass482_5433 != Class482.aClass482_5424) {
			if ((aClass482_5433 == Class482.aClass482_5421 || Class482.aClass482_5422 == aClass482_5433) && false == aBool5434)
				aBool5434 = true;
			else if ((-211953871 * aClass482_5433.anInt5429 < -211953871 * Class482.aClass482_5421.anInt5429) || (aClass482_5433.anInt5429 * -211953871 >= -211953871 * Class482.aClass482_5425.anInt5429)) {
				aClass482_5433 = Class482.aClass482_5421;
				aBool5434 = true;
			}
		}
	}

	public void method7891() {
		if (Class482.aClass482_5427 != aClass482_5433 && Class482.aClass482_5428 != aClass482_5433 && aClass482_5433 != Class482.aClass482_5419 && aClass482_5433 != Class482.aClass482_5424) {
			if ((aClass482_5433 == Class482.aClass482_5421 || Class482.aClass482_5422 == aClass482_5433) && false == aBool5434)
				aBool5434 = true;
			else if ((-211953871 * aClass482_5433.anInt5429 < -211953871 * Class482.aClass482_5421.anInt5429) || (aClass482_5433.anInt5429 * -211953871 >= -211953871 * Class482.aClass482_5425.anInt5429)) {
				aClass482_5433 = Class482.aClass482_5421;
				aBool5434 = true;
			}
		}
	}

	public void method7892() {
		if (Class482.aClass482_5427 != aClass482_5433 && Class482.aClass482_5428 != aClass482_5433 && aClass482_5433 != Class482.aClass482_5419 && aClass482_5433 != Class482.aClass482_5424) {
			if ((aClass482_5433 == Class482.aClass482_5421 || Class482.aClass482_5422 == aClass482_5433) && false == aBool5434)
				aBool5434 = true;
			else if ((-211953871 * aClass482_5433.anInt5429 < -211953871 * Class482.aClass482_5421.anInt5429) || (aClass482_5433.anInt5429 * -211953871 >= -211953871 * Class482.aClass482_5425.anInt5429)) {
				aClass482_5433 = Class482.aClass482_5421;
				aBool5434 = true;
			}
		}
	}

	public void method7893(boolean bool, byte i) {
		/* empty */
	}

	public void method7894(int i) {
		if (-211953871 * aClass482_5433.anInt5429 < Class482.aClass482_5425.anInt5429 * -211953871) {
			if (aClass482_5433.anInt5429 * -211953871 < Class482.aClass482_5423.anInt5429 * -211953871) {
				aClass482_5433 = Class482.aClass482_5425;
				aBool5434 = false;
			} else if (i <= 0) {
				Iterator iterator = aList5441.iterator();
				while (iterator.hasNext()) {
					Class494 class494 = (Class494) iterator.next();
					if (class494.method8020(433009517) != this)
						iterator.remove();
					else
						class494.method8078(-1630878985);
				}
				aClass482_5433 = Class482.aClass482_5425;
				aBool5434 = false;
			} else {
				aClass482_5433 = Class482.aClass482_5424;
				Iterator iterator = aList5441.iterator();
				while (iterator.hasNext()) {
					Class494 class494 = (Class494) iterator.next();
					if (class494.method8020(433009517) != this)
						iterator.remove();
					else
						class494.method8010(0.0F, i, (byte) 44);
				}
			}
		}
	}

	public void method7895(float f) {
		if (!(f < 0.0F))
			aFloat5449 = f;
	}

	public void method7896() {
		Iterator iterator = aList5441.iterator();
		aClass482_5433 = Class482.aClass482_5425;
		while (iterator.hasNext()) {
			Class494 class494 = (Class494) iterator.next();
			if (class494.method8020(433009517) == this)
				class494.method8017(-1601394516);
		}
	}

	public void method7897() {
		Iterator iterator = aList5441.iterator();
		aClass482_5433 = Class482.aClass482_5425;
		while (iterator.hasNext()) {
			Class494 class494 = (Class494) iterator.next();
			if (class494.method8020(433009517) == this)
				class494.method8017(-1282032928);
		}
	}

	public float method7898() {
		return aFloat5443;
	}

	public void method7899() {
		Iterator iterator = aList5441.iterator();
		aClass482_5433 = Class482.aClass482_5421;
		while (iterator.hasNext()) {
			Class494 class494 = (Class494) iterator.next();
			if (class494.method8020(433009517) == this)
				class494.method8028(-1660906271);
		}
	}

	public Object method7900(byte i) {
		return anObject5447;
	}

	public void method7901() {
		if (Class482.aClass482_5421 == aClass482_5433) {
			Class597 class597 = anInterface70_5432.method469(1909466083);
			if (Class597.aClass597_7846 == class597)
				aClass482_5433 = Class482.aClass482_5422;
		}
		if (aClass482_5433 == Class482.aClass482_5422 && aBool5434 == true) {
			Class494 class494 = aClass358_5444.method6277(anInterface70_5432.method433(431970536), (short) -284);
			if (null != class494) {
				boolean bool = anInterface70_5432.method429((byte) 49);
				Class488 class488 = new Class488(this);
				boolean bool_6_ = (class494.method8098(bool ? null : anInterface70_5432.method462(0, 102380841), bool ? class488 : null, anInt5438 * 287355549, 231134469 * anInt5448 > 0 ? 0.0F : aFloat5431, false, aBool5439, 1488804621 * anInt5442, aFloat5449, this, (byte) 0));
				if (true == bool_6_) {
					aClass482_5433 = Class482.aClass482_5423;
					class494.method8015(anInterface56_5446, -1083706586);
					class494.method8010(aFloat5431, anInt5448 * 231134469, (byte) 55);
					class494.method8013((byte) -32);
					aList5441.add(class494);
					aBool5434 = false;
				} else {
					if (class494.method8041(-1663361792) == Class491.aClass491_5481)
						aClass482_5433 = Class482.aClass482_5426;
					class494.method8009((short) -17437);
				}
			}
		}
		Iterator iterator = aList5441.iterator();
		boolean bool = true;
		while (iterator.hasNext()) {
			Class494 class494 = (Class494) iterator.next();
			if (class494.method8020(433009517) != this)
				iterator.remove();
			else {
				if (Class482.aClass482_5424 == aClass482_5433) {
					if (class494.method8003(73245669) == 0.0F)
						class494.method8078(-1630878985);
					else
						bool = false;
				}
				if (class494.method8007(2109007922) == true || class494.method8008((short) 255) == true) {
					class494.method8009((short) -3471);
					iterator.remove();
				} else
					bool = false;
			}
		}
		if (bool && (aClass482_5433.anInt5429 * -211953871 >= Class482.aClass482_5423.anInt5429 * -211953871) && (aClass482_5433.anInt5429 * -211953871 < -211953871 * Class482.aClass482_5425.anInt5429)) {
			if (aClass482_5433 == Class482.aClass482_5424)
				aClass482_5433 = Class482.aClass482_5425;
			else
				aClass482_5433 = Class482.aClass482_5426;
		}
	}

	public void method7902() {
		if (Class482.aClass482_5427 != aClass482_5433 && Class482.aClass482_5428 != aClass482_5433 && aClass482_5433 != Class482.aClass482_5419 && aClass482_5433 != Class482.aClass482_5424) {
			if ((aClass482_5433 == Class482.aClass482_5421 || Class482.aClass482_5422 == aClass482_5433) && false == aBool5434)
				aBool5434 = true;
			else if ((-211953871 * aClass482_5433.anInt5429 < -211953871 * Class482.aClass482_5421.anInt5429) || (aClass482_5433.anInt5429 * -211953871 >= -211953871 * Class482.aClass482_5425.anInt5429)) {
				aClass482_5433 = Class482.aClass482_5421;
				aBool5434 = true;
			}
		}
	}

	public void method7903(float f) {
		if (!(f < 0.0F))
			aFloat5449 = f;
	}

	public float method7904() {
		return aFloat5436;
	}

	public void method7905(Object object) {
		anObject5435 = object;
	}

	public void method7906(Object object) {
		anObject5435 = object;
	}

	public void method7907(Object object) {
		anObject5435 = object;
	}

	public void method7908(Interface70 interface70) {
		anInterface70_5432 = interface70;
		aFloat5431 = 0.0F;
		aClass482_5433 = Class482.aClass482_5420;
	}

	public Object method7909() {
		return anObject5435;
	}

	public float method7910() {
		return aFloat5443;
	}

	public void method7911(float f, int i) {
		aFloat5443 = f;
	}

	public void method7912(Object object) {
		anObject5447 = object;
	}

	public void method7913(Object object) {
		anObject5447 = object;
	}

	public void method7914(Object object) {
		anObject5447 = object;
	}

	public float method7915(byte i) {
		return aFloat5436;
	}

	public Object method7916() {
		return anObject5447;
	}

	public Object method7917() {
		return anObject5447;
	}

	public Object method7918() {
		return anObject5447;
	}

	public int method7919() {
		return 287355549 * anInt5438;
	}

	void method7920() {
		anInterface70_5432 = null;
		aClass482_5433 = Class482.aClass482_5419;
		aBool5434 = false;
		aList5441.clear();
		anObject5435 = null;
		aClass442_5437 = null;
		anInt5438 = -1968923573;
		aBool5439 = false;
		anInt5442 = 0;
		aFloat5431 = 0.0F;
		anInterface56_5446 = null;
		aFloat5443 = 0.0F;
		aFloat5436 = 0.0F;
		anInt5445 = 0;
		aBool5440 = false;
		anObject5447 = null;
		anInt5448 = 0;
		aFloat5449 = 1.0F;
	}

	public void method7921(int i) {
		anInt5438 = i * 1968923573;
	}

	public void method7922(boolean bool) {
		/* empty */
	}

	public void method7923(boolean bool) {
		/* empty */
	}

	public Interface70 method7924() {
		return anInterface70_5432;
	}

	public void method7925(Class442 class442) {
		aClass442_5437 = class442;
	}

	public Interface70 method7926(int i) {
		return anInterface70_5432;
	}

	public void method7927(Class442 class442) {
		aClass442_5437 = class442;
	}

	public Class482 method7928() {
		return aClass482_5433;
	}

	public Class442 method7929() {
		return aClass442_5437;
	}

	public Class442 method7930() {
		return aClass442_5437;
	}

	public void method7931(Class442 class442) {
		aClass442_5437 = class442;
	}

	public Object method7932() {
		return anObject5435;
	}

	public float method7933() {
		return aFloat5436;
	}

	public Class483(Class358 class358) {
		aClass358_5444 = class358;
		aList5441 = new ArrayList();
	}

	public void method7934(float f) {
		aFloat5443 = f;
	}

	public Object method7935() {
		return anObject5435;
	}

	public void method7936(float f) {
		aFloat5436 = f;
	}

	public void method7937(float f) {
		aFloat5436 = f;
	}

	public void method7938(int i, boolean bool) {
		aBool5440 = bool;
		anInt5445 = i * -1732190853;
	}

	public void method7939() {
		if (anInt5445 * -1333626445 > -1 && !aBool5440)
			anInt5445 -= -1732190853;
		if (anInt5445 * -1333626445 == 0)
			method7852(1969554825);
	}

	public boolean method7940() {
		aBool5440 = false;
		return 0 != -1333626445 * anInt5445;
	}

	public void method7941(float f) {
		aFloat5443 = f;
	}

	public boolean method7942() {
		aBool5440 = false;
		return 0 != -1333626445 * anInt5445;
	}

	public void method7943(float f, int i) {
		aFloat5431 = f;
		int i_7_ = 0;
		Iterator iterator = aList5441.iterator();
		while (iterator.hasNext()) {
			Class494 class494 = (Class494) iterator.next();
			if (class494.method8020(433009517) != this)
				aList5441.remove(class494);
			else {
				class494.method8010(aFloat5431, i, (byte) 67);
				i_7_++;
			}
		}
		if (0 == i_7_)
			anInt5448 = -1009406003 * i;
	}

	public void method7944() {
		Iterator iterator = aList5441.iterator();
		aClass482_5433 = Class482.aClass482_5425;
		while (iterator.hasNext()) {
			Class494 class494 = (Class494) iterator.next();
			if (class494.method8020(433009517) == this)
				class494.method8017(-1348697191);
		}
	}

	public void method7945(float f, int i) {
		aFloat5431 = f;
		int i_8_ = 0;
		Iterator iterator = aList5441.iterator();
		while (iterator.hasNext()) {
			Class494 class494 = (Class494) iterator.next();
			if (class494.method8020(433009517) != this)
				aList5441.remove(class494);
			else {
				class494.method8010(aFloat5431, i, (byte) 79);
				i_8_++;
			}
		}
		if (0 == i_8_)
			anInt5448 = -1009406003 * i;
	}

	public void method7946(float f, int i) {
		aFloat5431 = f;
		int i_9_ = 0;
		Iterator iterator = aList5441.iterator();
		while (iterator.hasNext()) {
			Class494 class494 = (Class494) iterator.next();
			if (class494.method8020(433009517) != this)
				aList5441.remove(class494);
			else {
				class494.method8010(aFloat5431, i, (byte) 43);
				i_9_++;
			}
		}
		if (0 == i_9_)
			anInt5448 = -1009406003 * i;
	}

	public void method7947(float f, int i) {
		aFloat5431 = f;
		int i_10_ = 0;
		Iterator iterator = aList5441.iterator();
		while (iterator.hasNext()) {
			Class494 class494 = (Class494) iterator.next();
			if (class494.method8020(433009517) != this)
				aList5441.remove(class494);
			else {
				class494.method8010(aFloat5431, i, (byte) 52);
				i_10_++;
			}
		}
		if (0 == i_10_)
			anInt5448 = -1009406003 * i;
	}

	public Class482 method7948() {
		return aClass482_5433;
	}

	public Object method7949(byte i) {
		return anObject5435;
	}

	public void method7950(int i) {
		if (Class482.aClass482_5421 == aClass482_5433) {
			Class597 class597 = anInterface70_5432.method469(1909466083);
			if (Class597.aClass597_7846 == class597)
				aClass482_5433 = Class482.aClass482_5422;
		}
		if (aClass482_5433 == Class482.aClass482_5422 && aBool5434 == true) {
			Class494 class494 = aClass358_5444.method6277(anInterface70_5432.method433(1569703037), (short) -5254);
			if (null != class494) {
				boolean bool = anInterface70_5432.method429((byte) 120);
				Class488 class488 = new Class488(this);
				boolean bool_11_ = (class494.method8098(bool ? null : anInterface70_5432.method462(0, 102380841), bool ? class488 : null, anInt5438 * 287355549, 231134469 * anInt5448 > 0 ? 0.0F : aFloat5431, false, aBool5439, 1488804621 * anInt5442, aFloat5449, this, (byte) 0));
				if (true == bool_11_) {
					aClass482_5433 = Class482.aClass482_5423;
					class494.method8015(anInterface56_5446, -1083706586);
					class494.method8010(aFloat5431, anInt5448 * 231134469, (byte) 61);
					class494.method8013((byte) -31);
					aList5441.add(class494);
					aBool5434 = false;
				} else {
					if (class494.method8041(-1760133281) == Class491.aClass491_5481)
						aClass482_5433 = Class482.aClass482_5426;
					class494.method8009((short) -14590);
				}
			}
		}
		Iterator iterator = aList5441.iterator();
		boolean bool = true;
		while (iterator.hasNext()) {
			Class494 class494 = (Class494) iterator.next();
			if (class494.method8020(433009517) != this)
				iterator.remove();
			else {
				if (Class482.aClass482_5424 == aClass482_5433) {
					if (class494.method8003(1061822673) == 0.0F)
						class494.method8078(-1630878985);
					else
						bool = false;
				}
				if (class494.method8007(2109007922) == true || class494.method8008((short) 255) == true) {
					class494.method8009((short) -30299);
					iterator.remove();
				} else
					bool = false;
			}
		}
		if (bool && (aClass482_5433.anInt5429 * -211953871 >= Class482.aClass482_5423.anInt5429 * -211953871) && (aClass482_5433.anInt5429 * -211953871 < -211953871 * Class482.aClass482_5425.anInt5429)) {
			if (aClass482_5433 == Class482.aClass482_5424)
				aClass482_5433 = Class482.aClass482_5425;
			else
				aClass482_5433 = Class482.aClass482_5426;
		}
	}

	static final void method7951(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -437471887 * class243.anInt2572;
	}

	static final void method7952(Class665 class665, byte i) {
		int i_12_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (int) (Math.random() * (double) (i_12_ + 1));
	}

	public static Class22 method7953(Class459 class459, int i, int i_13_, int i_14_) {
		return Class504.method8220(class459, i, i_13_, null, (byte) -124);
	}

	public static void method7954(int i) {
		if (Class440.method7110((byte) 68) != Class516.aClass516_7049) {
			try {
				String string = Class212.anApplet2258.getParameter(Class407.aClass407_4235.aString4246);
				int i_15_ = ((int) (Class234.method4347(-1408626088) / 86400000L) - 11745);
				String string_16_ = new StringBuilder().append("usrdob=").append(i_15_).append("; version=1; path=/; domain=").append(string).toString();
				Class60.method1381(Class212.anApplet2258, new StringBuilder().append("document.cookie=\"").append(string_16_).append("\"").toString(), 693933689);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}
}
