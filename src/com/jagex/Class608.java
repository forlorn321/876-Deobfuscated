/* Class608 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.List;

public class Class608 implements Interface70 {
	Class358 aClass358_7985;
	Class597 aClass597_7986 = Class597.aClass597_7847;
	int anInt7987;
	Class459 aClass459_7988;
	Interface71 anInterface71_7989;
	Class205 aClass205_7990;
	boolean aBool7991;
	boolean aBool7992;
	byte[] aByteArray7993;
	int anInt7994;
	public static int anInt7995;

	public Class597 method469(int i) {
		return aClass597_7986;
	}

	public void method205(byte i) {
		if (aClass597_7986 == Class597.aClass597_7848) {
			byte[] is = aClass459_7988.method7512(2003412369 * anInt7987, 1447980132);
			if (is != null) {
				aByteArray7993 = is;
				method10080(1734428475);
				aClass597_7986 = Class597.aClass597_7846;
				if (null != anInterface71_7989)
					anInterface71_7989.method474(this, is.length, 2003412369 * anInt7987, false, (byte) 104);
			}
		}
	}

	public Class483 method446(int i) {
		Class483 class483 = new Class483(aClass358_7985);
		class483.method7849(this, -524800442);
		return class483;
	}

	public boolean method458() {
		return null != aClass205_7990 && aBool7992;
	}

	public boolean method429(byte i) {
		return false;
	}

	void method10080(int i) {
		/* empty */
	}

	public boolean method438() {
		return null != aClass205_7990 && aBool7992;
	}

	public boolean method452() {
		if (aClass205_7990 == null)
			return false;
		List list = method10082(512977582);
		if (null == list || list.size() <= 0)
			aBool7991 = false;
		return aBool7991;
	}

	public Class485 method448() {
		return Class485.aClass485_5453;
	}

	public int method434(byte i) {
		return anInt7987 * 2003412369;
	}

	public void method450(RSByteBuffer class527_sub38, int i) {
		if (aClass205_7990 != null) {
			if (null != anInterface71_7989)
				anInterface71_7989.method476(this, 1240645817);
			if (aBool7991)
				throw new RuntimeException("");
			synchronized (aClass205_7990) {
				List list = method10082(2032603692);
				if (list != null) {
					list.add(class527_sub38);
					anInt7994 += -1942594359 * class527_sub38.buffer.length;
					method10081(list, anInt7994 * 922779001, -512046304);
				}
			}
		}
	}

	public RSByteBuffer method436(int i, short i_0_) {
		if (aClass205_7990 == null)
			return null;
		RSByteBuffer class527_sub38 = null;
		if (anInterface71_7989 != null)
			anInterface71_7989.method476(this, -1560736756);
		synchronized (aClass205_7990) {
			List list = method10082(1236027628);
			if (list.size() > i)
				class527_sub38 = (RSByteBuffer) list.get(i);
		}
		return class527_sub38;
	}

	public boolean method459(int i, int i_1_) {
		if (aClass205_7990 == null)
			return false;
		boolean bool = false;
		synchronized (aClass205_7990) {
			List list = method10082(1311092205);
			if (list != null && list.size() > i)
				bool = list.get(i) != null;
		}
		return bool;
	}

	public boolean method437(byte i) {
		return null != aClass205_7990 && aBool7992;
	}

	void method10081(List list, int i, int i_2_) {
		if (null != aClass205_7990 && null != list && i >= 0) {
			synchronized (aClass205_7990) {
				aClass205_7990.method3796((long) (2003412369 * anInt7987));
				if (i <= aClass205_7990.method3810(-1154132927))
					aClass205_7990.method3813(list, (long) (anInt7987 * 2003412369), i, 2070111444);
				else {
					aBool7992 = false;
					aBool7991 = false;
					anInt7994 = 0;
				}
			}
		}
	}

	public void method440(boolean bool, byte i) {
		if (anInterface71_7989 != null)
			anInterface71_7989.method476(this, 1007853804);
		aBool7991 = bool;
	}

	public byte[] method427(int i) {
		if (null != anInterface71_7989)
			anInterface71_7989.method476(this, 199057743);
		return aByteArray7993;
	}

	public boolean method240() {
		if (aClass205_7990 == null)
			return false;
		List list = method10082(1966409130);
		if (null == list || list.size() <= 0)
			aBool7991 = false;
		return aBool7991;
	}

	public boolean method441(byte i) {
		if (aClass205_7990 == null)
			return false;
		List list = method10082(626079261);
		if (null == list || list.size() <= 0)
			aBool7991 = false;
		return aBool7991;
	}

	public void method442() {
		if (aClass597_7986 == Class597.aClass597_7848) {
			byte[] is = aClass459_7988.method7512(2003412369 * anInt7987, 1447980132);
			if (is != null) {
				aByteArray7993 = is;
				method10080(1849298034);
				aClass597_7986 = Class597.aClass597_7846;
				if (null != anInterface71_7989)
					anInterface71_7989.method474(this, is.length, 2003412369 * anInt7987, false, (byte) 76);
			}
		}
	}

	public Class483 method435() {
		Class483 class483 = new Class483(aClass358_7985);
		class483.method7849(this, 1065057375);
		return class483;
	}

	public Class597 method453() {
		return aClass597_7986;
	}

	public Class483 method445() {
		Class483 class483 = new Class483(aClass358_7985);
		class483.method7849(this, 1681475480);
		return class483;
	}

	public int method263() {
		if (null != aByteArray7993)
			return aByteArray7993.length;
		return 0;
	}

	public Class485 method443() {
		return Class485.aClass485_5453;
	}

	public byte[] method462(int i, int i_3_) {
		if (null != anInterface71_7989)
			anInterface71_7989.method476(this, -296813383);
		return aByteArray7993;
	}

	public Class608(Class459 class459, int i, Class358 class358, Interface71 interface71, Class205 class205) {
		aClass459_7988 = class459;
		anInt7987 = 220052337 * i;
		aClass358_7985 = class358;
		anInterface71_7989 = interface71;
		aClass205_7990 = class205;
		aBool7992 = aClass205_7990 != null;
		aClass597_7986 = Class597.aClass597_7848;
	}

	public int method449() {
		return anInt7987 * 2003412369;
	}

	public int method466() {
		return anInt7987 * 2003412369;
	}

	public int method185() {
		return anInt7987 * 2003412369;
	}

	public void method430(RSByteBuffer class527_sub38) {
		if (aClass205_7990 != null) {
			if (null != anInterface71_7989)
				anInterface71_7989.method476(this, 1820540700);
			if (aBool7991)
				throw new RuntimeException("");
			synchronized (aClass205_7990) {
				List list = method10082(857503380);
				if (list != null) {
					list.add(class527_sub38);
					anInt7994 += -1942594359 * class527_sub38.buffer.length;
					method10081(list, anInt7994 * 922779001, 1893261065);
				}
			}
		}
	}

	public byte[] method471(int i) {
		if (null != anInterface71_7989)
			anInterface71_7989.method476(this, -771929047);
		return aByteArray7993;
	}

	public RSByteBuffer method431(int i) {
		if (aClass205_7990 == null)
			return null;
		RSByteBuffer class527_sub38 = null;
		if (anInterface71_7989 != null)
			anInterface71_7989.method476(this, -357917738);
		synchronized (aClass205_7990) {
			List list = method10082(1732250743);
			if (list.size() > i)
				class527_sub38 = (RSByteBuffer) list.get(i);
		}
		return class527_sub38;
	}

	public boolean method454(int i) {
		if (aClass205_7990 == null)
			return false;
		boolean bool = false;
		synchronized (aClass205_7990) {
			List list = method10082(1678380417);
			if (list != null && list.size() > i)
				bool = list.get(i) != null;
		}
		return bool;
	}

	public boolean method455(int i) {
		if (aClass205_7990 == null)
			return false;
		boolean bool = false;
		synchronized (aClass205_7990) {
			List list = method10082(1415007315);
			if (list != null && list.size() > i)
				bool = list.get(i) != null;
		}
		return bool;
	}

	public boolean method456() {
		return null != aClass205_7990 && aBool7992;
	}

	public Class483 method444() {
		Class483 class483 = new Class483(aClass358_7985);
		class483.method7849(this, 563723944);
		return class483;
	}

	public Class485 method433(int i) {
		return Class485.aClass485_5453;
	}

	public boolean method451() {
		return null != aClass205_7990 && aBool7992;
	}

	public int method460() {
		if (null == aClass205_7990)
			return 0;
		int i = 0;
		synchronized (aClass205_7990) {
			List list = method10082(1100279541);
			if (list != null)
				i = list.size();
		}
		return i;
	}

	public int method461() {
		if (null == aClass205_7990)
			return 0;
		int i = 0;
		synchronized (aClass205_7990) {
			List list = method10082(438755505);
			if (list != null)
				i = list.size();
		}
		return i;
	}

	public Class485 method447() {
		return Class485.aClass485_5453;
	}

	public void method463(boolean bool) {
		if (anInterface71_7989 != null)
			anInterface71_7989.method476(this, -1349170427);
		aBool7991 = bool;
	}

	public void method465(boolean bool) {
		if (anInterface71_7989 != null)
			anInterface71_7989.method476(this, -618384583);
		aBool7991 = bool;
	}

	List method10082(int i) {
		if (aClass205_7990 == null || !aBool7992)
			return null;
		Object object = null;
		List list;
		synchronized (aClass205_7990) {
			list = (List) aClass205_7990.method3787((long) (anInt7987 * 2003412369));
			if (list == null && aBool7992) {
				list = new ArrayList();
				aClass205_7990.method3813(list, (long) (anInt7987 * 2003412369), 0, 2097480733);
			}
		}
		return list;
	}

	public void method432(RSByteBuffer class527_sub38) {
		if (aClass205_7990 != null) {
			if (null != anInterface71_7989)
				anInterface71_7989.method476(this, 500559515);
			if (aBool7991)
				throw new RuntimeException("");
			synchronized (aClass205_7990) {
				List list = method10082(1926363103);
				if (list != null) {
					list.add(class527_sub38);
					anInt7994 += -1942594359 * class527_sub38.buffer.length;
					method10081(list, anInt7994 * 922779001, 2059641742);
				}
			}
		}
	}

	public int method428() {
		if (null == aClass205_7990)
			return 0;
		int i = 0;
		synchronized (aClass205_7990) {
			List list = method10082(1969761259);
			if (list != null)
				i = list.size();
		}
		return i;
	}

	void method10083(List list, int i) {
		if (null != aClass205_7990 && null != list && i >= 0) {
			synchronized (aClass205_7990) {
				aClass205_7990.method3796((long) (2003412369 * anInt7987));
				if (i <= aClass205_7990.method3810(1180232069))
					aClass205_7990.method3813(list, (long) (anInt7987 * 2003412369), i, 2039603657);
				else {
					aBool7992 = false;
					aBool7991 = false;
					anInt7994 = 0;
				}
			}
		}
	}

	void method10084(List list, int i) {
		if (null != aClass205_7990 && null != list && i >= 0) {
			synchronized (aClass205_7990) {
				aClass205_7990.method3796((long) (2003412369 * anInt7987));
				if (i <= aClass205_7990.method3810(46374244))
					aClass205_7990.method3813(list, (long) (anInt7987 * 2003412369), i, 2125649008);
				else {
					aBool7992 = false;
					aBool7991 = false;
					anInt7994 = 0;
				}
			}
		}
	}

	public Class597 method457() {
		return aClass597_7986;
	}

	public Class597 method468() {
		return aClass597_7986;
	}

	public void method464(boolean bool) {
		if (anInterface71_7989 != null)
			anInterface71_7989.method476(this, -1835290291);
		aBool7991 = bool;
	}

	public boolean method470() {
		return false;
	}

	public int method439(byte i) {
		if (null == aClass205_7990)
			return 0;
		int i_4_ = 0;
		synchronized (aClass205_7990) {
			List list = method10082(644886189);
			if (list != null)
				i_4_ = list.size();
		}
		return i_4_;
	}

	public byte[] method472(int i) {
		if (null != anInterface71_7989)
			anInterface71_7989.method476(this, 292860658);
		return aByteArray7993;
	}

	public int method467(int i) {
		if (null != aByteArray7993)
			return aByteArray7993.length;
		return 0;
	}

	static final void method10085(Class665 class665, short i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class302.method5575(class243, class240, class665, (short) -6732);
	}

	static final void method10086(Class665 class665, int i) {
		int i_5_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (2 == -405609043 * client.anInt11083 && i_5_ < client.anInt11261 * -67152419)
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = client.aClass69Array11297[i_5_].aString775;
		else
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
	}

	public static void method10087(Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2, int i) {
		Class527_Sub28 class527_sub28 = ((Class527_Sub28) (Class527_Sub28.aClass14_10545.method709((long) (-541403241 * class640_sub1_sub2_sub1_sub2.anInt11955))));
		if (class527_sub28 != null) {
			if (class527_sub28.aClass483_10551 != null) {
				class527_sub28.aClass483_10551.method7864(100, (byte) 6);
				Class245.aClass226_2698.method4215(class527_sub28.aClass483_10551, (byte) -1);
				class527_sub28.aClass483_10551 = null;
			}
			class527_sub28.method8735(-1889161967);
		}
	}
}
