/* Class479 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class479 {
	Object anObject5392;
	Interface71 anInterface71_5393;
	Class481 aClass481_5394 = Class481.aClass481_5423;
	boolean aBool5395 = false;
	List aList5396;
	Object anObject5397;
	Class436 aClass436_5398;
	int anInt5399;
	boolean aBool5400;
	int anInt5401;
	float aFloat5402;
	int anInt5403 = 0;
	Interface55 anInterface55_5404;
	float aFloat5405;
	Class360 aClass360_5406;
	boolean aBool5407;
	float aFloat5408;
	int anInt5409;
	float aFloat5410;

	void method5764(byte i) {
		anInterface71_5393 = null;
		aClass481_5394 = Class481.aClass481_5423;
		aBool5395 = false;
		aList5396.clear();
		anObject5397 = null;
		aClass436_5398 = null;
		anInt5399 = 1231698901;
		aBool5400 = false;
		anInt5401 = 0;
		aFloat5408 = 0.0F;
		anInterface55_5404 = null;
		aFloat5402 = 0.0F;
		aFloat5405 = 0.0F;
		anInt5409 = 0;
		aBool5407 = false;
		anObject5392 = null;
		anInt5403 = 0;
		aFloat5410 = 1.0F;
	}

	public void method5765(Interface71 interface71, int i) {
		anInterface71_5393 = interface71;
		aFloat5408 = 0.0F;
		aClass481_5394 = Class481.aClass481_5420;
	}

	public void method5766(byte i) {
		if (Class481.aClass481_5427 != aClass481_5394 && Class481.aClass481_5426 != aClass481_5394)
			method5774(0, (byte) 32);
		Iterator iterator = aList5396.iterator();
		while (iterator.hasNext()) {
			Class492 class492 = (Class492) iterator.next();
			if (class492.method5921(1663461174) != this)
				iterator.remove();
			else
				class492.method5892(712668651);
		}
		method5764((byte) -78);
		aClass481_5394 = Class481.aClass481_5428;
	}

	public void method5767(int i) {
		if (!aBool5395 && (Class481.aClass481_5419 != aClass481_5394 && aClass481_5394 != Class481.aClass481_5428 && aClass481_5394 != Class481.aClass481_5423 && Class481.aClass481_5424 != aClass481_5394) && ((832615947 * aClass481_5394.anInt5421 <= Class481.aClass481_5420.anInt5421 * 832615947) || (aClass481_5394.anInt5421 * 832615947 >= 832615947 * Class481.aClass481_5427.anInt5421)))
			aClass481_5394 = Class481.aClass481_5425;
	}

	public Interface71 method5768(int i) {
		return anInterface71_5393;
	}

	public void method5769(float f) {
		if (!(f < 0.0F))
			aFloat5410 = f;
	}

	public void method5770(int i) {
		Iterator iterator = aList5396.iterator();
		aClass481_5394 = Class481.aClass481_5427;
		while (iterator.hasNext()) {
			Class492 class492 = (Class492) iterator.next();
			if (class492.method5921(1411810804) == this)
				class492.method5962((byte) -117);
		}
	}

	public void method5771(short i) {
		Iterator iterator = aList5396.iterator();
		aClass481_5394 = Class481.aClass481_5425;
		while (iterator.hasNext()) {
			Class492 class492 = (Class492) iterator.next();
			if (class492.method5921(1563507628) == this)
				class492.method5908(-1278569833);
		}
	}

	public Class481 method5772(int i) {
		return aClass481_5394;
	}

	public void method5773(Object object, byte i) {
		anObject5397 = object;
	}

	public void method5774(int i, byte i_0_) {
		if (832615947 * aClass481_5394.anInt5421 < Class481.aClass481_5427.anInt5421 * 832615947) {
			if (aClass481_5394.anInt5421 * 832615947 < Class481.aClass481_5429.anInt5421 * 832615947) {
				aClass481_5394 = Class481.aClass481_5427;
				aBool5395 = false;
			} else if (i <= 0) {
				Iterator iterator = aList5396.iterator();
				while (iterator.hasNext()) {
					Class492 class492 = (Class492) iterator.next();
					if (class492.method5921(1725122362) != this)
						iterator.remove();
					else
						class492.method5968((short) 16383);
				}
				aClass481_5394 = Class481.aClass481_5427;
				aBool5395 = false;
			} else {
				aClass481_5394 = Class481.aClass481_5424;
				Iterator iterator = aList5396.iterator();
				while (iterator.hasNext()) {
					Class492 class492 = (Class492) iterator.next();
					if (class492.method5921(2042683076) != this)
						iterator.remove();
					else
						class492.method5958(0.0F, i, (short) -1597);
				}
			}
		}
	}

	public void method5775(Object object, int i) {
		anObject5392 = object;
	}

	public Object method5776(byte i) {
		return anObject5392;
	}

	public int method5777(byte i) {
		return anInt5399 * 1626397315;
	}

	public void method5778(int i, int i_1_) {
		anInt5399 = -1231698901 * i;
	}

	public void method5779(boolean bool, int i) {
		/* empty */
	}

	public void method5780(Interface55 interface55, int i) {
		anInterface55_5404 = interface55;
	}

	public Class436 method5781(byte i) {
		return aClass436_5398;
	}

	public float method5782(int i) {
		return aFloat5405;
	}

	public void method5783(float f, int i) {
		aFloat5402 = f;
	}

	public void method5784(float f, int i) {
		aFloat5405 = f;
	}

	public void method5785(int i, boolean bool, byte i_2_) {
		aBool5407 = bool;
		anInt5409 = i * 1834399737;
	}

	public float method5786() {
		return aFloat5402;
	}

	public void method5787(int i) {
		if (anInt5409 * -665298359 > -1 && !aBool5407)
			anInt5409 -= 1834399737;
		if (0 == anInt5409 * -665298359)
			method5790((byte) -23);
	}

	public void method5788(float f, int i, int i_3_) {
		aFloat5408 = f;
		int i_4_ = 0;
		Iterator iterator = aList5396.iterator();
		while (iterator.hasNext()) {
			Class492 class492 = (Class492) iterator.next();
			if (class492.method5921(1723573308) != this)
				aList5396.remove(class492);
			else {
				class492.method5958(aFloat5408, i, (short) -13391);
				i_4_++;
			}
		}
		if (0 == i_4_)
			anInt5403 = i * -593495971;
	}

	public void method5789(short i) {
		if (aClass481_5394 == Class481.aClass481_5425) {
			Class605 class605 = anInterface71_5393.method438((byte) 1);
			if (class605 == Class605.aClass605_7871)
				aClass481_5394 = Class481.aClass481_5422;
		}
		if (Class481.aClass481_5422 == aClass481_5394 && true == aBool5395) {
			Class492 class492 = aClass360_5406.method4748(anInterface71_5393.method442((byte) -29), 1948576802);
			if (null != class492) {
				boolean bool = anInterface71_5393.method439(2139682132);
				Class476 class476 = new Class476(this);
				boolean bool_5_ = (class492.method5893(bool ? null : anInterface71_5393.method440(0, -70230299), bool ? class476 : null, anInt5399 * 1626397315, anInt5403 * 1228119029 > 0 ? 0.0F : aFloat5408, false, aBool5400, anInt5401 * 1135159995, aFloat5410, this, -1887142122));
				if (true == bool_5_) {
					aClass481_5394 = Class481.aClass481_5429;
					class492.method5896(anInterface55_5404, -1760378984);
					class492.method5958(aFloat5408, 1228119029 * anInt5403, (short) -22588);
					class492.method5894(1354323474);
					aList5396.add(class492);
					aBool5395 = false;
				} else {
					if (class492.method5888((byte) 112) == Class475.aClass475_5374)
						aClass481_5394 = Class481.aClass481_5426;
					class492.method5892(-58230783);
				}
			}
		}
		Iterator iterator = aList5396.iterator();
		boolean bool = true;
		while (iterator.hasNext()) {
			Class492 class492 = (Class492) iterator.next();
			if (class492.method5921(1924902876) != this)
				iterator.remove();
			else {
				if (Class481.aClass481_5424 == aClass481_5394) {
					if (class492.method5922(1105716166) == 0.0F)
						class492.method5968((short) 16383);
					else
						bool = false;
				}
				if (class492.method5964(-583129895) == true || class492.method5890(2001803138) == true) {
					class492.method5892(-1187386787);
					iterator.remove();
				} else
					bool = false;
			}
		}
		if (bool && (aClass481_5394.anInt5421 * 832615947 >= Class481.aClass481_5429.anInt5421 * 832615947) && (aClass481_5394.anInt5421 * 832615947 < 832615947 * Class481.aClass481_5427.anInt5421)) {
			if (aClass481_5394 == Class481.aClass481_5424)
				aClass481_5394 = Class481.aClass481_5427;
			else
				aClass481_5394 = Class481.aClass481_5426;
		}
	}

	public void method5790(byte i) {
		if (aClass481_5394 != Class481.aClass481_5419 && aClass481_5394 != Class481.aClass481_5428 && Class481.aClass481_5423 != aClass481_5394 && aClass481_5394 != Class481.aClass481_5424) {
			if ((aClass481_5394 == Class481.aClass481_5425 || Class481.aClass481_5422 == aClass481_5394) && false == aBool5395)
				aBool5395 = true;
			else if ((aClass481_5394.anInt5421 * 832615947 < 832615947 * Class481.aClass481_5425.anInt5421) || (832615947 * aClass481_5394.anInt5421 >= 832615947 * Class481.aClass481_5427.anInt5421)) {
				aClass481_5394 = Class481.aClass481_5425;
				aBool5395 = true;
			}
		}
	}

	public void method5791() {
		if (!aBool5395 && (Class481.aClass481_5419 != aClass481_5394 && aClass481_5394 != Class481.aClass481_5428 && aClass481_5394 != Class481.aClass481_5423 && Class481.aClass481_5424 != aClass481_5394) && ((832615947 * aClass481_5394.anInt5421 <= Class481.aClass481_5420.anInt5421 * 832615947) || (aClass481_5394.anInt5421 * 832615947 >= 832615947 * Class481.aClass481_5427.anInt5421)))
			aClass481_5394 = Class481.aClass481_5425;
	}

	public void method5792(float f, byte i) {
		if (!(f < 0.0F))
			aFloat5410 = f;
	}

	public void method5793() {
		if (!aBool5395 && (Class481.aClass481_5419 != aClass481_5394 && aClass481_5394 != Class481.aClass481_5428 && aClass481_5394 != Class481.aClass481_5423 && Class481.aClass481_5424 != aClass481_5394) && ((832615947 * aClass481_5394.anInt5421 <= Class481.aClass481_5420.anInt5421 * 832615947) || (aClass481_5394.anInt5421 * 832615947 >= 832615947 * Class481.aClass481_5427.anInt5421)))
			aClass481_5394 = Class481.aClass481_5425;
	}

	public void method5794(int i) {
		if (832615947 * aClass481_5394.anInt5421 < Class481.aClass481_5427.anInt5421 * 832615947) {
			if (aClass481_5394.anInt5421 * 832615947 < Class481.aClass481_5429.anInt5421 * 832615947) {
				aClass481_5394 = Class481.aClass481_5427;
				aBool5395 = false;
			} else if (i <= 0) {
				Iterator iterator = aList5396.iterator();
				while (iterator.hasNext()) {
					Class492 class492 = (Class492) iterator.next();
					if (class492.method5921(1858156083) != this)
						iterator.remove();
					else
						class492.method5968((short) 16383);
				}
				aClass481_5394 = Class481.aClass481_5427;
				aBool5395 = false;
			} else {
				aClass481_5394 = Class481.aClass481_5424;
				Iterator iterator = aList5396.iterator();
				while (iterator.hasNext()) {
					Class492 class492 = (Class492) iterator.next();
					if (class492.method5921(1569327836) != this)
						iterator.remove();
					else
						class492.method5958(0.0F, i, (short) -24529);
				}
			}
		}
	}

	public void method5795(int i) {
		if (832615947 * aClass481_5394.anInt5421 < Class481.aClass481_5427.anInt5421 * 832615947) {
			if (aClass481_5394.anInt5421 * 832615947 < Class481.aClass481_5429.anInt5421 * 832615947) {
				aClass481_5394 = Class481.aClass481_5427;
				aBool5395 = false;
			} else if (i <= 0) {
				Iterator iterator = aList5396.iterator();
				while (iterator.hasNext()) {
					Class492 class492 = (Class492) iterator.next();
					if (class492.method5921(1690023084) != this)
						iterator.remove();
					else
						class492.method5968((short) 16383);
				}
				aClass481_5394 = Class481.aClass481_5427;
				aBool5395 = false;
			} else {
				aClass481_5394 = Class481.aClass481_5424;
				Iterator iterator = aList5396.iterator();
				while (iterator.hasNext()) {
					Class492 class492 = (Class492) iterator.next();
					if (class492.method5921(1763230513) != this)
						iterator.remove();
					else
						class492.method5958(0.0F, i, (short) -5350);
				}
			}
		}
	}

	public void method5796() {
		Iterator iterator = aList5396.iterator();
		aClass481_5394 = Class481.aClass481_5427;
		while (iterator.hasNext()) {
			Class492 class492 = (Class492) iterator.next();
			if (class492.method5921(1936286937) == this)
				class492.method5962((byte) -7);
		}
	}

	public void method5797() {
		if (anInt5409 * -665298359 > -1 && !aBool5407)
			anInt5409 -= 1834399737;
		if (0 == anInt5409 * -665298359)
			method5790((byte) -80);
	}

	public void method5798() {
		Iterator iterator = aList5396.iterator();
		aClass481_5394 = Class481.aClass481_5425;
		while (iterator.hasNext()) {
			Class492 class492 = (Class492) iterator.next();
			if (class492.method5921(1779229013) == this)
				class492.method5908(-1278569833);
		}
	}

	public void method5799() {
		Iterator iterator = aList5396.iterator();
		aClass481_5394 = Class481.aClass481_5425;
		while (iterator.hasNext()) {
			Class492 class492 = (Class492) iterator.next();
			if (class492.method5921(1568504135) == this)
				class492.method5908(-1278569833);
		}
	}

	public void method5800(int i) {
		if (832615947 * aClass481_5394.anInt5421 < Class481.aClass481_5427.anInt5421 * 832615947) {
			if (aClass481_5394.anInt5421 * 832615947 < Class481.aClass481_5429.anInt5421 * 832615947) {
				aClass481_5394 = Class481.aClass481_5427;
				aBool5395 = false;
			} else if (i <= 0) {
				Iterator iterator = aList5396.iterator();
				while (iterator.hasNext()) {
					Class492 class492 = (Class492) iterator.next();
					if (class492.method5921(1482307687) != this)
						iterator.remove();
					else
						class492.method5968((short) 16383);
				}
				aClass481_5394 = Class481.aClass481_5427;
				aBool5395 = false;
			} else {
				aClass481_5394 = Class481.aClass481_5424;
				Iterator iterator = aList5396.iterator();
				while (iterator.hasNext()) {
					Class492 class492 = (Class492) iterator.next();
					if (class492.method5921(1996568597) != this)
						iterator.remove();
					else
						class492.method5958(0.0F, i, (short) -21765);
				}
			}
		}
	}

	public int method5801() {
		return anInt5399 * 1626397315;
	}

	public void method5802(int i) {
		anInt5399 = -1231698901 * i;
	}

	public void method5803(int i) {
		anInt5399 = -1231698901 * i;
	}

	public void method5804(int i) {
		anInt5399 = -1231698901 * i;
	}

	public void method5805(boolean bool) {
		/* empty */
	}

	public void method5806(boolean bool, int i, int i_6_) {
		aBool5400 = bool;
		anInt5401 = i * -723809677;
	}

	public void method5807(Class436 class436) {
		aClass436_5398 = class436;
	}

	public float method5808(int i) {
		return aFloat5402;
	}

	public float method5809() {
		return aFloat5402;
	}

	public void method5810(Class436 class436, short i) {
		aClass436_5398 = class436;
	}

	public void method5811(float f) {
		aFloat5402 = f;
	}

	public void method5812(int i) {
		anInt5399 = -1231698901 * i;
	}

	public boolean method5813(int i) {
		aBool5407 = false;
		return 0 != -665298359 * anInt5409;
	}

	public Class479(Class360 class360) {
		aClass360_5406 = class360;
		aList5396 = new ArrayList();
	}

	public Object method5814(byte i) {
		return anObject5397;
	}

	public void method5815() {
		if (Class481.aClass481_5427 != aClass481_5394 && Class481.aClass481_5426 != aClass481_5394)
			method5774(0, (byte) 32);
		Iterator iterator = aList5396.iterator();
		while (iterator.hasNext()) {
			Class492 class492 = (Class492) iterator.next();
			if (class492.method5921(1408013492) != this)
				iterator.remove();
			else
				class492.method5892(-1502072716);
		}
		method5764((byte) -1);
		aClass481_5394 = Class481.aClass481_5428;
	}

	public void method5816() {
		if (anInt5409 * -665298359 > -1 && !aBool5407)
			anInt5409 -= 1834399737;
		if (0 == anInt5409 * -665298359)
			method5790((byte) -83);
	}

	public void method5817() {
		if (anInt5409 * -665298359 > -1 && !aBool5407)
			anInt5409 -= 1834399737;
		if (0 == anInt5409 * -665298359)
			method5790((byte) -54);
	}

	public void method5818() {
		if (!aBool5395 && (Class481.aClass481_5419 != aClass481_5394 && aClass481_5394 != Class481.aClass481_5428 && aClass481_5394 != Class481.aClass481_5423 && Class481.aClass481_5424 != aClass481_5394) && ((832615947 * aClass481_5394.anInt5421 <= Class481.aClass481_5420.anInt5421 * 832615947) || (aClass481_5394.anInt5421 * 832615947 >= 832615947 * Class481.aClass481_5427.anInt5421)))
			aClass481_5394 = Class481.aClass481_5425;
	}

	public boolean method5819() {
		aBool5407 = false;
		return 0 != -665298359 * anInt5409;
	}

	public void method5820() {
		Iterator iterator = aList5396.iterator();
		aClass481_5394 = Class481.aClass481_5427;
		while (iterator.hasNext()) {
			Class492 class492 = (Class492) iterator.next();
			if (class492.method5921(1429884554) == this)
				class492.method5962((byte) -24);
		}
	}

	public void method5821(Class436 class436) {
		aClass436_5398 = class436;
	}

	static Class552 method5822(Class649_Sub1_Sub5 class649_sub1_sub5, int i) {
		Class552 class552;
		if (null == Class80.aClass552_857)
			class552 = new Class552();
		else {
			class552 = Class80.aClass552_857;
			Class80.aClass552_857 = Class80.aClass552_857.aClass552_7414;
			class552.aClass552_7414 = null;
			Class552.anInt7413 -= 2057192543;
		}
		class552.aClass649_Sub1_Sub5_7415 = class649_sub1_sub5;
		return class552;
	}

	static final void method5823(Class668 class668, short i) {
		int i_7_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_7_);
		Class151.method1852(class251, class668, 1418180668);
	}

	static final void method5824(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1097649699 * class668.aClass350_8563.memberSize;
	}

	static final void method5825(Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		int i_8_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_9_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		int i_10_ = client.aClass485ArrayArray11266[i_9_][i_8_].method5851(-1984342762);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0 == i_10_ ? 1 : 0;
	}
}
