/* Class208_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

public class Class208_Sub9 extends Class208 {
	int anInt9917;
	int anInt9918;

	public void method3848() {
		Class245.aClass226_2698.method4299(602126363 * anInt9918, 1495716825);
	}

	public void method3846(int i) {
		Class245.aClass226_2698.method4299(602126363 * anInt9918, 1495716825);
	}

	boolean method3847(byte i) {
		Class245.aClass226_2698.method4298(602126363 * anInt9918, 31860561 * anInt9917, 1109622596);
		return true;
	}

	public void method3851() {
		Class245.aClass226_2698.method4299(602126363 * anInt9918, 1495716825);
	}

	Class208_Sub9(RSByteBuffer class527_sub38) {
		super(class527_sub38);
		anInt9918 = class527_sub38.readUnsignedShort() * -187866605;
		anInt9917 = class527_sub38.readUnsignedByte() * 1868530097;
	}

	boolean method3845() {
		Class245.aClass226_2698.method4298(602126363 * anInt9918, 31860561 * anInt9917, 882985534);
		return true;
	}

	boolean method3849() {
		Class245.aClass226_2698.method4298(602126363 * anInt9918, 31860561 * anInt9917, -1401454398);
		return true;
	}

	static final void method15613(byte i) {
		if (client.anInt11024 * 481650633 > 1) {
			client.anInt11024 -= 164586105;
			client.anInt11242 = -818664029 * client.anInt11221;
		}
		if (client.aClass109_11067.aBool1378) {
			client.aClass109_11067.aBool1378 = false;
			Class313_Sub1.method15658((byte) -87);
		} else {
			if (!Class35.aBool338)
				Class700_Sub10.method16944((byte) 36);
			for (int i_0_ = 0; (i_0_ < 100 && Class53.method1292(client.aClass109_11067, (byte) 1)); i_0_++) {
				/* empty */
			}
			if (client.anInt11048 * -1927019389 == 9) {
				while (Class246.method4629(-2139179221)) {
					Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4489, (client.aClass109_11067.aClass2_1367), (byte) 9);
					class527_sub15.buffer.writeByte(0, -1839578266);
					int i_1_ = (-441238943 * (class527_sub15.buffer.anInt10689));
					Class638.method10575((class527_sub15.buffer), (short) -31605);
					class527_sub15.buffer.method16534((-441238943 * (class527_sub15.buffer.anInt10689) - i_1_), -1620514550);
					client.aClass109_11067.method1969(class527_sub15, (byte) 1);
				}
				if (Class59.aClass638_724 != null) {
					if (-1 != 1047194135 * Class59.aClass638_724.anInt8320) {
						Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4410, (client.aClass109_11067.aClass2_1367), (byte) -71);
						if (null == Class58.aGarbageCollectorMXBean722 || !Class58.aGarbageCollectorMXBean722.isValid()) {
							try {
								Iterator iterator = ManagementFactory.getGarbageCollectorMXBeans().iterator();
								while (iterator.hasNext()) {
									GarbageCollectorMXBean garbagecollectormxbean = ((GarbageCollectorMXBean) iterator.next());
									if (garbagecollectormxbean.isValid()) {
										Class58.aGarbageCollectorMXBean722 = garbagecollectormxbean;
										client.aLong11305 = 8402899855349815137L;
										client.aLong11102 = 1558075806628091167L;
									}
								}
							} catch (Throwable throwable) {
								/* empty */
							}
						}
						long l = Class234.method4347(-1408626088);
						int i_2_ = -1;
						if (Class58.aGarbageCollectorMXBean722 != null) {
							long l_3_ = Class58.aGarbageCollectorMXBean722.getCollectionTime();
							if (-1L != -1218166214690514655L * client.aLong11102) {
								long l_4_ = l_3_ - (-1218166214690514655L * client.aLong11102);
								long l_5_ = l - (client.aLong11305 * -7910833988839820449L);
								if (l_5_ != 0L)
									i_2_ = (int) (100L * l_4_ / l_5_);
							}
							client.aLong11102 = -1558075806628091167L * l_3_;
							client.aLong11305 = l * -8402899855349815137L;
						}
						class527_sub15.buffer.writeByte128(-1176934951 * client.anInt7014, -362087053);
						class527_sub15.buffer.writeShort(1047194135 * Class59.aClass638_724.anInt8320, 1404835786);
						class527_sub15.buffer.writeByte(i_2_, -1816558397);
						client.aClass109_11067.method1969(class527_sub15, (byte) 1);
						Class59.aClass638_724 = null;
						Class395.aLong4106 = 2793894859726693007L * (l + 30000L);
					}
				} else if (Class234.method4347(-1408626088) >= -8072959849625535377L * Class395.aLong4106)
					Class59.aClass638_724 = client.aClass654_11071.method10904((Class3.aClass13_34.aString178), -1460763393);
				Class197.method3729(102380841);
				Class643.method10737(60078314);
				Class527_Sub34 class527_sub34 = ((Class527_Sub34) client.aClass694_11278.method14081((short) -13841));
				if (client.aClass509_11072.method8314(1851870042) != null) {
					if (Class30.anInt265 * -349191067 == 3)
						Class578.method9650(1197091903);
					else if (4 == Class30.anInt265 * -349191067)
						Class657.method11007(39159280);
				}
				if (client.aBool11115)
					client.aBool11115 = false;
				else
					client.aFloat11114 /= 2.0F;
				if (client.aBool11116)
					client.aBool11116 = false;
				else
					client.aFloat11156 /= 2.0F;
				if (Class635.method10557(1896128843))
					Class472.method7738((byte) -38);
				else if (2 == Class30.anInt265 * -349191067) {
					Class592 class592 = client.aClass509_11072.method8283((short) 18510);
					int i_6_ = 153371143 * class592.anInt7798 << 9;
					int i_7_ = -2029646807 * class592.anInt7799 << 9;
					if (-3490983046183437261L * Class260.aLong2853 <= 0L)
						Class260.aLong2853 = (Class234.method4347(-1408626088) * -1392817201419772165L);
					float f = (float) (Class234.method4347(-1408626088) - (Class260.aLong2853 * -3490983046183437261L));
					int i_8_ = 1000 / Class259.method4781((byte) 29);
					i_8_ *= 1.25;
					for (/**/; f > 0.0F; f -= (float) i_8_) {
						float f_9_ = Math.min(f, (float) i_8_);
						Class208_Sub10.aClass296_Sub1_9923.method5343(f_9_ / 1000.0F, (client.aClass509_11072.method8300((byte) 103).anIntArrayArrayArray4989), client.aClass509_11072.method8359(-241125230), i_6_, i_7_, (byte) 1);
					}
					Class260.aLong2853 = (Class234.method4347(-1408626088) * -1392817201419772165L);
				}
				Class553_Sub1.method16792(-2004215130);
				if (client.anInt11048 * -1927019389 == 9) {
					client.aClass509_11072.method8397(407094392).method10250(client.aClass509_11072, -1946323544);
					Class265.method5040(-622806904);
					if (787487721 * client.anInt11312 > 10)
						client.aClass109_11067.anInt1369 += 698092973;
					if (client.aClass109_11067.anInt1369 * 1907285541 > 2250)
						Class313_Sub1.method15658((byte) -52);
					else {
						if (3 == client.anInt11080 * -1481292237) {
							Class77.method1543((byte) 15);
							Class701.method14293((byte) 1);
						} else if (Class490.aClass617_5473.anInterface65_8092.method420(class527_sub34, client.anInterface64Array11166, -7744771 * client.anInt11041, Class681.aClass554_8644, (byte) -41))
							Class312.method5652(false, -896062384);
						else {
							if (-1481292237 * client.anInt11080 == 0 && Class285.method5204((client.anInt11245 * 1310321663), (byte) -37)) {
								client.aClass509_11072.method8280(new Class514(Class503.aClass503_6875, null), -1577044677);
								client.anInt11080 = 939992315;
							}
							if (1 == client.anInt11080 * -1481292237 && client.anInt11048 * -1927019389 != 10) {
								Class209.aClass14_2236.method721(-1164514558);
								client.anInt11080 = -534998036;
								client.anInt11304 = 1791423621 * client.anInt11019;
								client.anInt11251 = 0;
								client.aBool11081 = false;
								Class64.method1450(-1637270496);
							}
							if (4 == -1481292237 * client.anInt11080) {
								int i_10_ = (client.anInt11019 - client.anInt11304 * 1434117197);
								if (client.anInt11251 * 1810511561 < Class181.aClass208Array2093.length) {
									do {
										Class208 class208 = (Class181.aClass208Array2093[(client.anInt11251 * 1810511561)]);
										if (class208.anInt2233 * 213602659 > i_10_)
											break;
										class208.method3846(-206232506);
									} while (4 == (-1481292237 * client.anInt11080) && ((client.anInt11251 += -1651915911) * 1810511561 < (Class181.aClass208Array2093).length));
								}
								if (client.anInt11080 * -1481292237 == 4) {
									for (int i_11_ = 0; i_11_ < (Class466.aClass196Array5314).length; i_11_++) {
										Class196 class196 = (Class466.aClass196Array5314[i_11_]);
										if (class196.aBool2165) {
											Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1 = class196.method3717(2074164772);
											Class695_Sub1.method17366(class640_sub1_sub2_sub1, true, 625047052);
										}
									}
								}
							}
						}
						Class631.method10466(1742774806);
						Class527_Sub8_Sub7.method18181(624288130);
						Class315.method5675(2120353502);
						Class465_Sub3.method15987(false, 69642518);
						Class444.method7245(Class402.aClass180_4150, Class143.aClass181_1669, -34434359);
						client.anInt11108 += 1169587941;
						if (-25431897 * client.anInt11123 != 0) {
							client.anInt11142 += 1242249804;
							if (client.anInt11142 * -398426617 >= 400)
								client.anInt11123 = 0;
						}
						if (Class214.aClass243_2266 != null) {
							client.anInt11144 += 1539249403;
							if (client.anInt11144 * -383789517 >= 15) {
								Class430.method6876(Class214.aClass243_2266, (byte) 9);
								Class214.aClass243_2266 = null;
							}
						}
						client.aClass243_11208 = null;
						client.aBool11214 = false;
						client.aBool11209 = false;
						Class527_Sub27.aClass243_10524 = null;
						Class360.method6327(null, -1, -1, (byte) 0);
						if (!client.aBool11188)
							client.anInt11185 = 1544143943;
						Class14.method730(1888787317);
						client.anInt11221 += 1464669977;
						if (client.aBool11286) {
							Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4423, (client.aClass109_11067.aClass2_1367), (byte) 62);
							class527_sub15.buffer.writeIntV2((Class381.anInt3938 * 1499526951 << 28 | Class25.anInt238 * -593792281 << 14 | 862307231 * Class86.anInt824), (byte) 126);
							client.aClass109_11067.method1969(class527_sub15, (byte) 1);
							client.aBool11286 = false;
						}
						for (;;) {
							Class527_Sub33 class527_sub33 = ((Class527_Sub33) client.aClass694_11247.method14077(-1103363968));
							if (class527_sub33 == null)
								break;
							Class243 class243 = class527_sub33.aClass243_10648;
							if (class243.anInt2675 * -927924265 >= 0) {
								Class243 class243_12_ = Class648.method10837((class243.anInt2536 * -1774688479), -1901204078);
								if (null == class243_12_ || class243_12_.aClass243Array2665 == null || (class243.anInt2675 * -927924265 >= (class243_12_.aClass243Array2665).length) || ((class243_12_.aClass243Array2665[class243.anInt2675 * -927924265]) != class243))
									continue;
							}
							Class491.method7980(class527_sub33, -1188434667);
						}
						for (;;) {
							Class527_Sub33 class527_sub33 = ((Class527_Sub33) client.aClass694_11321.method14077(-1616706096));
							if (null == class527_sub33)
								break;
							Class243 class243 = class527_sub33.aClass243_10648;
							if (class243.anInt2675 * -927924265 >= 0) {
								Class243 class243_13_ = Class648.method10837((-1774688479 * (class243.anInt2536)), -1473432202);
								if (class243_13_ == null || null == class243_13_.aClass243Array2665 || (class243.anInt2675 * -927924265 >= (class243_13_.aClass243Array2665).length) || ((class243_13_.aClass243Array2665[class243.anInt2675 * -927924265]) != class243))
									continue;
							}
							Class491.method7980(class527_sub33, -97297313);
						}
						for (;;) {
							Class527_Sub33 class527_sub33 = ((Class527_Sub33) client.aClass694_11246.method14077(-1426804407));
							if (class527_sub33 == null)
								break;
							Class243 class243 = class527_sub33.aClass243_10648;
							if (class243.anInt2675 * -927924265 >= 0) {
								Class243 class243_14_ = Class648.method10837((class243.anInt2536 * -1774688479), 307344481);
								if (class243_14_ == null || class243_14_.aClass243Array2665 == null || (class243.anInt2675 * -927924265 >= (class243_14_.aClass243Array2665).length) || class243 != (class243_14_.aClass243Array2665[(class243.anInt2675 * -927924265)]))
									continue;
							}
							Class491.method7980(class527_sub33, -1931218478);
						}
						if (Class527_Sub27.aClass243_10524 == null)
							client.anInt11255 = 0;
						if (client.aClass243_11150 != null)
							Class554.method9214(790447674);
						Class154.method2532(-2058252185);
						if (962135673 * client.anInt11075 > 0 && Class681.aClass554_8644.method9199(82, 360161841) && Class681.aClass554_8644.method9199(81, 1503328632) && 0 != client.anInt11005 * -1027814645) {
							int i_15_ = ((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864) - client.anInt11005 * -1027814645);
							if (i_15_ < 0)
								i_15_ = 0;
							else if (i_15_ > 3)
								i_15_ = 3;
							Class592 class592 = client.aClass509_11072.method8283((short) 9777);
							Class157.method2561(i_15_, ((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anIntArray11902[0]) + 153371143 * class592.anInt7798), ((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anIntArray11944[0]) + -2029646807 * class592.anInt7799), (byte) -11);
						}
						for (int i_16_ = 0; i_16_ < 5; i_16_++)
							client.anIntArray11280[i_16_]++;
						if (Class598.aClass144_Sub1_7852.aBool8987 && ((-377877880746283087L * Class598.aClass144_Sub1_7852.aLong8988) < Class234.method4347(-1408626088) - 60000L))
							Class503.method8214(382613059);
						Class598.aClass144_Sub1_7852.method14501(-1452941089);
						for (Class522_Sub5 class522_sub5 = (Class522_Sub5) client.aClass705_11298.method14317(297060422); null != class522_sub5; class522_sub5 = ((Class522_Sub5) client.aClass705_11298.method14320((byte) -10))) {
							if ((long) (class522_sub5.anInt10326 * 119097519) < (Class234.method4347(-1408626088) / 1000L - 5L)) {
								if (class522_sub5.aShort10327 > 0)
									Class99.method1766(5, 0, "", "", "", new StringBuilder().append(class522_sub5.aString10325).append(Class53.aClass53_675.method1290(Class144_Sub1.aClass671_8995, (byte) -123)).toString(), null, 467182070);
								if (0 == class522_sub5.aShort10327)
									Class99.method1766(5, 0, "", "", "", new StringBuilder().append(class522_sub5.aString10325).append(Class53.aClass53_653.method1290(Class144_Sub1.aClass671_8995, (byte) -12)).toString(), null, 1622127953);
								class522_sub5.method8682(935373478);
							}
						}
						client.anInt11031 += -371758369;
						if (244764959 * client.anInt11031 > 506) {
							client.anInt11031 = 0;
							int i_17_ = (int) (Math.random() * 8.0);
							if (1 == (i_17_ & 0x1))
								client.anInt11195 += -1704473343 * client.anInt11096;
							if (2 == (i_17_ & 0x2))
								client.anInt11213 += client.anInt11011 * -495258009;
							if ((i_17_ & 0x4) == 4)
								client.anInt11099 += -869185457 * client.anInt11100;
						}
						if (client.anInt11195 * -912781963 < -57)
							client.anInt11096 = -334019654;
						if (-912781963 * client.anInt11195 > 55)
							client.anInt11096 = 334019654;
						if (client.anInt11213 * -84518431 < -56)
							client.anInt11011 = 427453550;
						if (client.anInt11213 * -84518431 > 60)
							client.anInt11011 = -427453550;
						if (client.anInt11099 * 1325625329 < -44)
							client.anInt11100 = 1340786847;
						if (client.anInt11099 * 1325625329 > 40)
							client.anInt11100 = -1340786847;
						client.anInt11029 += 148327613;
						if (-782889323 * client.anInt11029 > 506) {
							client.anInt11029 = 0;
							int i_18_ = (int) (Math.random() * 8.0);
							if (1 == (i_18_ & 0x1))
								client.anInt11088 += client.anInt11103 * 782899475;
							if ((i_18_ & 0x2) == 2)
								client.anInt10991 += client.anInt11105 * -115237859;
						}
						if (client.anInt11088 * -973282125 < -66)
							client.anInt11103 = 1831566322;
						if (client.anInt11088 * -973282125 > 65)
							client.anInt11103 = -1831566322;
						if (client.anInt10991 * -2083955513 < -20)
							client.anInt11105 = -163712733;
						if (-2083955513 * client.anInt10991 > 12)
							client.anInt11105 = 163712733;
						client.aClass109_11067.anInt1368 += -1444708313;
						if (1750986647 * client.aClass109_11067.anInt1368 > 50) {
							Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4494, (client.aClass109_11067.aClass2_1367), (byte) -85);
							client.aClass109_11067.method1969(class527_sub15, (byte) 1);
						}
						if (client.aBool11288) {
							Class551.method9134(-1309935893);
							client.aBool11288 = false;
						}
						try {
							client.aClass109_11067.method1954(-1142807680);
						} catch (IOException ioexception) {
							Class313_Sub1.method15658((byte) -58);
						}
					}
				}
			}
		}
	}
}
