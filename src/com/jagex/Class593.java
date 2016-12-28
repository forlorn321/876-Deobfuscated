/* Class593 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class593 {
	static final int anInt7804 = -1;
	static final int anInt7805 = 1;
	static boolean aBool7806 = false;
	public static int worldCount;
	public static int highestWorldId;
	public static int worldListChecksum;
	static final int anInt7810 = 2;
	static int anInt7811;
	static Class536_Sub18_Sub14 aClass536_Sub18_Sub14_7812;

	static void method7119(RSByteBuffer class536_sub33) {
		int i = class536_sub33.readUnsignedSmart();
		Class94.worlds = new Class592[i];
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			Class94.worlds[i_0_] = new Class592();
			Class94.worlds[i_0_].flagId = class536_sub33.readUnsignedSmart() * -1820632555;
			Class94.worlds[i_0_].countryName = class536_sub33.readVersionedString();
		}
		Class220.lowestWorldId = class536_sub33.readUnsignedSmart() * 516757439;
		highestWorldId = class536_sub33.readUnsignedSmart() * -1155278909;
		worldCount = class536_sub33.readUnsignedSmart() * -317832355;
		Class506.aClass603_Sub1Array6890 = new Class603_Sub1[1 + (highestWorldId * 870600939 - Class220.lowestWorldId * -805119937)];
		for (int i_1_ = 0; i_1_ < -537974539 * worldCount; i_1_++) {
			int i_2_ = class536_sub33.readUnsignedSmart();
			Class603_Sub1 class603_sub1 = Class506.aClass603_Sub1Array6890[i_2_] = new Class603_Sub1();
			class603_sub1.worldIndex = class536_sub33.readUnsignedByte() * 809472901;
			class603_sub1.worldFlags = class536_sub33.readInt() * -261605043;
			class603_sub1.extraString = class536_sub33.readUnsignedSmart() * 1502072849;
			if (class603_sub1.extraString * 1844650225 != 0)
				class603_sub1.theExtraString = class536_sub33.readVersionedString();
			class603_sub1.anInt10557 = (i_2_ + Class220.lowestWorldId * -805119937) * -130957999;
			class603_sub1.worldActivity = class536_sub33.readVersionedString();
			class603_sub1.worldIp = class536_sub33.readVersionedString();
		}
		worldListChecksum = class536_sub33.readInt() * 591411205;
		aBool7806 = true;
	}

	Class593() throws Throwable {
		throw new Error();
	}

	static void method7120(RSByteBuffer class536_sub33) {
		int i = class536_sub33.readUnsignedSmart();
		Class94.worlds = new Class592[i];
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			Class94.worlds[i_3_] = new Class592();
			Class94.worlds[i_3_].flagId = class536_sub33.readUnsignedSmart() * -1820632555;
			Class94.worlds[i_3_].countryName = class536_sub33.readVersionedString();
		}
		Class220.lowestWorldId = class536_sub33.readUnsignedSmart() * 516757439;
		highestWorldId = class536_sub33.readUnsignedSmart() * -1155278909;
		worldCount = class536_sub33.readUnsignedSmart() * -317832355;
		Class506.aClass603_Sub1Array6890 = new Class603_Sub1[1 + (highestWorldId * 870600939 - Class220.lowestWorldId * -805119937)];
		for (int i_4_ = 0; i_4_ < -537974539 * worldCount; i_4_++) {
			int i_5_ = class536_sub33.readUnsignedSmart();
			Class603_Sub1 class603_sub1 = Class506.aClass603_Sub1Array6890[i_5_] = new Class603_Sub1();
			class603_sub1.worldIndex = class536_sub33.readUnsignedByte() * 809472901;
			class603_sub1.worldFlags = class536_sub33.readInt() * -261605043;
			class603_sub1.extraString = class536_sub33.readUnsignedSmart() * 1502072849;
			if (class603_sub1.extraString * 1844650225 != 0)
				class603_sub1.theExtraString = class536_sub33.readVersionedString();
			class603_sub1.anInt10557 = (i_5_ + Class220.lowestWorldId * -805119937) * -130957999;
			class603_sub1.worldActivity = class536_sub33.readVersionedString();
			class603_sub1.worldIp = class536_sub33.readVersionedString();
		}
		worldListChecksum = class536_sub33.readInt() * 591411205;
		aBool7806 = true;
	}

	static void method7121(RSByteBuffer class536_sub33) {
		int i = class536_sub33.readUnsignedSmart();
		Class94.worlds = new Class592[i];
		for (int i_6_ = 0; i_6_ < i; i_6_++) {
			Class94.worlds[i_6_] = new Class592();
			Class94.worlds[i_6_].flagId = class536_sub33.readUnsignedSmart() * -1820632555;
			Class94.worlds[i_6_].countryName = class536_sub33.readVersionedString();
		}
		Class220.lowestWorldId = class536_sub33.readUnsignedSmart() * 516757439;
		highestWorldId = class536_sub33.readUnsignedSmart() * -1155278909;
		worldCount = class536_sub33.readUnsignedSmart() * -317832355;
		Class506.aClass603_Sub1Array6890 = new Class603_Sub1[1 + (highestWorldId * 870600939 - Class220.lowestWorldId * -805119937)];
		for (int i_7_ = 0; i_7_ < -537974539 * worldCount; i_7_++) {
			int i_8_ = class536_sub33.readUnsignedSmart();
			Class603_Sub1 class603_sub1 = Class506.aClass603_Sub1Array6890[i_8_] = new Class603_Sub1();
			class603_sub1.worldIndex = class536_sub33.readUnsignedByte() * 809472901;
			class603_sub1.worldFlags = class536_sub33.readInt() * -261605043;
			class603_sub1.extraString = class536_sub33.readUnsignedSmart() * 1502072849;
			if (class603_sub1.extraString * 1844650225 != 0)
				class603_sub1.theExtraString = class536_sub33.readVersionedString();
			class603_sub1.anInt10557 = (i_8_ + Class220.lowestWorldId * -805119937) * -130957999;
			class603_sub1.worldActivity = class536_sub33.readVersionedString();
			class603_sub1.worldIp = class536_sub33.readVersionedString();
		}
		worldListChecksum = class536_sub33.readInt() * 591411205;
		aBool7806 = true;
	}

	public static Class603_Sub1 method7122(int i) {
		if (!aBool7806 || i < Class220.lowestWorldId * -805119937 || i > highestWorldId * 870600939)
			return null;
		return (Class506.aClass603_Sub1Array6890[i - Class220.lowestWorldId * -805119937]);
	}

	static final void method7123(Class499 class499, Class668 class668, byte i) throws Exception_Sub3, Exception_Sub4 {
		switch (1771926685 * class499.anInt5608) {
		case 1017:
			Class519.method6333(class668, (byte) 37);
			break;
		case 901:
			Class467.method5694(class668, -1796454693);
			break;
		case 1111:
			Class426.method5128(class668, -1765163311);
			break;
		case 730:
			Class272.method3724(class668, 582279854);
			break;
		case 270:
			Class247_Sub1.method9106(class668, -2008555065);
			break;
		case 55:
			Class223.method3201(class668, 2146477659);
			break;
		case 792:
			Class633.method7543(class668, (byte) 118);
			break;
		case 423:
			Class154.method1872(class668, 1498591841);
			break;
		case 45:
			Class455.method5481(class668, (byte) -121);
			break;
		case 869:
			Class536_Sub1.method9356(class668, (byte) 36);
			break;
		case 1189:
			Class26.method736(class668, -1956380755);
			break;
		case 285:
			Class205_Sub19.method9090(class668, 1198223871);
			break;
		case 379:
			Class570.method6926(class668, (byte) 32);
			break;
		case 28:
			Class541.method6528(class668, 1407808845);
			break;
		case 560:
			Class334.method4367(class668, -2064260076);
			break;
		case 463:
			Class344.method4482(class668, 149646827);
			break;
		case 109:
			Class644.method7793(class668, (byte) 1);
			break;
		case 525:
			Class16.method671(class668, 311736579);
			break;
		case 535:
			Class588.method7082(class668, (byte) -98);
			break;
		case 44:
			Class660.method7971(class668, 2063698217);
			break;
		case 284:
			Class613.method7320(class668, (byte) 11);
			break;
		case 1123:
			Class281.method3766(class668, 1463118718);
			break;
		case 865:
			Class186.method2776(class668, (short) 27445);
			break;
		case 540:
			Class410.method5000(class668, (byte) 1);
			break;
		case 417:
			Class562.method6863(class668, 802539896);
			break;
		case 685:
			Class241.method3387(class668, -2122888510);
			break;
		case 797:
			Class626.method7459(class668, (byte) -87);
			break;
		case 292:
			Class585.method7051(class668, -1288173967);
			break;
		case 918:
			Class710_Sub3.method9900(class668, 365037652);
			break;
		case 482:
			Class317.method4226(class668, (byte) -77);
			break;
		case 173:
			Class434.method5232(class668, (byte) 20);
			break;
		case 1056:
			Class695.method8224(class668, -58375497);
			break;
		case 627:
			Class273.method3727(class668, -1084174005);
			break;
		case 123:
			Class349.method4592(class668, -408477009);
			break;
		case 812:
			Class694.method8208(class668, (byte) 10);
			break;
		case 170:
			Class183.method2737(class668, -1243588619);
			break;
		case 31:
			Class592.method7115(class668, 1511103431);
			break;
		case 611:
			Class474.method5742(class668, -1524736117);
			break;
		case 283:
			Class636.method7621(class668, 169297106);
			break;
		case 1248:
			Class581.method7019(class668, -133832167);
			break;
		case 815:
			Class648.method7831(class668, 1824424503);
			break;
		case 616:
			Class412.method5014(class668, 1041190815);
			break;
		case 164:
			Class187.method2784(class668, 967524693);
			break;
		case 206:
			Class386.method4843(class668, (byte) -120);
			break;
		case 619:
			Class586.method7065(class668, (short) -14924);
			break;
		case 650:
			Class532.method6443(class668, (byte) 1);
			break;
		case 549:
			Class306.method4127(class668, (byte) -64);
			break;
		case 304:
			Class262.method3638(true, class668, (byte) 40);
			break;
		case 220:
			Class453.method5445(class668, 1961254881);
			break;
		case 739:
			Class646.method7808(class668, -1128720721);
			break;
		case 845:
			Class641.method7686(class668, -2129978507);
			break;
		case 1015:
			Class224.method3207(class668, -1172698931);
			break;
		case 696:
			Class595.method7135(class668, -615628218);
			break;
		case 1104:
			Class500.method6030(class668, (byte) -65);
			break;
		case 1137:
			Class656.method7943(class668, (byte) 36);
			break;
		case 152:
			Class158.method1887(class668, (byte) -86);
			break;
		case 1087:
			Class160.method1957(class668, (byte) 1);
			break;
		case 1099:
			Class299.method4018(class668, -1940782353);
			break;
		case 1016:
			Class145.method1798(class668, -1723406470);
			break;
		case 234:
			Class541.method6529(class668, -1521492824);
			break;
		case 424:
			Class324.method4272(class668, 1872602292);
			break;
		case 238:
			Class204.method2936(class668, 366709801);
			break;
		case 863:
			Class495.method5996(class668, -1022164323);
			break;
		case 136:
			Class471.method5718(class668, (byte) 11);
			break;
		case 273:
			Class678.method8061(class668, 1154246459);
			break;
		case 554:
			Class62.method1055(class668, -1392078955);
			break;
		case 433:
			Class511.method6208(class668, 43020283);
			break;
		case 128:
			Class458_Sub5.method9374(class668, 858398809);
			break;
		case 393:
			Class634.method7548(class668, -872113812);
			break;
		case 319:
			Class618.method7390(class668, (byte) 127);
			break;
		case 748:
			Class30.method779(class668, -1729975475);
			break;
		case 698:
			Class519.method6334(class668, -238528922);
			break;
		case 808:
			Class601.method7164(class668, 1243816017);
			break;
		case 859:
			Class494.method5991(class668, 2060464217);
			break;
		case 883:
			Class586.method7059(class668, 1812200652);
			break;
		case 1133:
			Class188.method2792(class668, -29371528);
			break;
		case 1237:
			Class574.method6946(class668, -1889842196);
			break;
		case 895:
			Class561.method6850(class668, 1688949100);
			break;
		case 310:
			Class545.method6609(class668, -1988059504);
			break;
		case 497:
			Class66.method1074(class668, 117088791);
			break;
		case 334:
			Class527.method6428(class668, 1788323995);
			break;
		case 1187:
			Class76_Sub1.method10366(class668, 98197761);
			break;
		case 873:
			Class202.method2927(class668, -1309291525);
			break;
		case 90:
			Class309_Sub1.method9189(class668, (byte) 97);
			break;
		case 888:
			Class205_Sub8.method9063(class668, 1756104255);
			break;
		case 138:
			Class262.method3639(class668, (byte) -61);
			break;
		case 61:
			Class34_Sub16.method10351(class668, -669406356);
			break;
		case 1091:
			Class510.method6184(class668, 2074994612);
			break;
		case 690:
			Class604.method7203(class668, (byte) 15);
			break;
		case 984:
			Class476.method5747(class668, -1773354357);
			break;
		case 280:
			Class105.method1402(class668, 141374024);
			break;
		case 725:
			Class265.method3687(class668, (byte) 23);
			break;
		case 85:
			Class649_Sub1_Sub5_Sub1.method10920(class668, 2118679258);
			break;
		case 17:
			Class471.method5716(class668, (byte) 1);
			break;
		case 1170:
			Class450.method5425(class668, (short) -15603);
			break;
		case 298:
			Class105.method1405(class668, 1863955637);
			break;
		case 1074:
			Class196.method2865(class668, (byte) -45);
			break;
		case 1171:
			Class209.method2977(class668, 1476007333);
			break;
		case 156:
			Class610.method7273(class668, (short) 147);
			break;
		case 166:
			Class294.method3976(class668, (byte) 86);
			break;
		case 759:
			Class260.method3618(class668, 1607784690);
			break;
		case 785:
			Class174.method2447(class668, 2019147807);
			break;
		case 534:
			Class575.method6998(class668, -1365499786);
			break;
		case 1230:
			Class281.method3765(class668, 1320034165);
			break;
		case 806:
			Class451.method5432(class668, (byte) -41);
			break;
		case 807:
			Class641.method7683(class668, -1278244142);
			break;
		case 1216:
			Class139.method1698(class668, 16711680);
			break;
		case 183:
			Class353.method4649(class668, 1270564628);
			break;
		case 1156:
			Class174.method2449(class668, -783498866);
			break;
		case 521:
			Class385.method4838(class668, (byte) 2);
			break;
		case 970:
			Class649_Sub1.method9991(class668, (byte) -20);
			break;
		case 160:
			Class655.method7936(class668, (byte) -62);
			break;
		case 307:
			Class536_Sub20.method9570(class668, 1938459486);
			break;
		case 201:
			Class522.method6381(class668, 281023884);
			break;
		case 218:
			Class472.method5734(class668, (byte) -89);
			break;
		case 438:
			Class43.method879(class668, 2138832921);
			break;
		case 389:
			Class223.method3203(class668, -770035112);
			break;
		case 617:
			Class103.method1372(class668, 1392295675);
			break;
		case 1112:
			Class213.method3074(class668, (byte) 47);
			break;
		case 712:
			Class641.method7682(class668, (short) 27709);
			break;
		case 751:
			Class57.method967(class668, 1485628180);
			break;
		case 780:
			Class64.method1061(class668, (byte) 29);
			break;
		case 9:
			Class302.method4098(class668, (byte) 76);
			break;
		case 1013:
			Class432.method5187(class668, -24076509);
			break;
		case 1034:
			Class580.method7017(class668, 574711198);
			break;
		case 890:
			Class606.method7218(class668, (byte) 19);
			break;
		case 1073:
			Class518.method6332(class668, 1496797787);
			break;
		case 1235:
			Class523.method6403(class668, -744418433);
			break;
		case 196:
			Class188.method2800(class668, -283405088);
			break;
		case 878:
			Class192.method2841(class668, (byte) 9);
			break;
		case 963:
			Class621.method7411(class668, 849395834);
			break;
		case 121:
			Class512.method6214(class668, -190831762);
			break;
		case 876:
			Class236.method3345(class668, 1037052499);
			break;
		case 731:
			Class555.method6800(class668, -112143485);
			break;
		case 1158:
			Class707.method8299(class668, 1559881279);
			break;
		case 884:
			Class32.method790(class668, -1466467431);
			break;
		case 614:
			Class46.method907(class668, 2052975770);
			break;
		case 180:
			Class521_Sub2.method9340(class668, 925942332);
			break;
		case 782:
			Class236.method3351(class668, 359473796);
			break;
		case 1234:
			Class398.method4902(class668, -688901085);
			break;
		case 664:
			Class583.method7029(class668, -1410114308);
			break;
		case 391:
			Class249.method3455(class668, (byte) -20);
			break;
		case 252:
			Class550.method6683(class668, 1744528482);
			break;
		case 999:
			Class661.method7983(class668, (byte) -38);
			break;
		case 930:
			Class314.method4201(class668, (byte) 14);
			break;
		case 76:
			Class353.method4647(class668, (byte) -23);
			break;
		case 343:
			Class654.method7884(class668, 1904407108);
			break;
		case 1012:
			Class299.method4017(class668, 238292858);
			break;
		case 578:
			Class430.method5164(class668, -553419952);
			break;
		case 1001:
			Class441.method5331(class668, -2142496806);
			break;
		case 769:
			Class485.method5855(class668, -2008654264);
			break;
		case 1038:
			Class319_Sub1.method9136(class668, (byte) -33);
			break;
		case 4:
			Class97.method1317(class668, 1624828028);
			break;
		case 405:
			Class676.method8042(class668, false, (byte) 1);
			break;
		case 318:
			Class385.method4840(class668, (byte) -44);
			break;
		case 1270:
			Class536_Sub27.method9594(class668, 1376793007);
			break;
		case 58:
			Class478.method5761(class668, (byte) 117);
			break;
		case 661:
			Class497.method6013(class668, 1083890789);
			break;
		case 588:
			Class643.method7737(class668, 1619839959);
			break;
		case 944:
			Class679.method8067(class668, (byte) 37);
			break;
		case 750:
			Class522.method6380(class668, 592702159);
			break;
		case 518:
			Class196.method2866(class668, -393645079);
			break;
		case 458:
			Class617.method7365(class668, 2019461208);
			break;
		case 967:
			Class298.method4011(class668, 1828669705);
			break;
		case 309:
			Class472.method5735(class668, 1514744242);
			break;
		case 6:
			Class677.method8054(class668, -337239516);
			break;
		case 777:
			Class658.method7951(class668, 47740734);
			break;
		case 860:
			Class710_Sub42.method10272(class668, (byte) 1);
			break;
		case 505:
			Class405.method4942(class668, 1031718736);
			break;
		case 1257:
			Class555.method6804(class668, 1033872715);
			break;
		case 22:
			Class496.method6011(class668, -1046429119);
			break;
		case 517:
			Class638.method7649(class668, 2124473450);
			break;
		case 838:
			Class483.method5840(class668, -1374252919);
			break;
		case 854:
			Class289.method3920(class668, (byte) 0);
			break;
		case 221:
			Class218.method3099(class668, -2046988225);
			break;
		case 485:
			Class236.method3346(class668, 442840817);
			break;
		case 840:
			Class221.method3109(class668, -1338228310);
			break;
		case 861:
			Class300.method4025(class668, -741123532);
			break;
		case 894:
			Class399.method4912(class668, (byte) -88);
			break;
		case 3:
			Class661.method7982(class668, (byte) -41);
			break;
		case 969:
			Class610.method7276(class668, 46386671);
			break;
		case 622:
			Class594.method7128(class668, 1715523737);
			break;
		case 361:
			Class64.method1059(class668, (byte) -63);
			break;
		case 229:
			Class707.method8300(class668, -1635332755);
			break;
		case 866:
			Class259.method3607(class668, -716799024);
			break;
		case 887:
			Class402.method4927(class668, 16711680);
			break;
		case 1209:
			Class139.method1696(class668, -1387929672);
			break;
		case 768:
			Class501.method6034(class668, 712784518);
			break;
		case 444:
			Class313.method4196(class668, -2091672137);
			break;
		case 344:
			Class401.method4920(class668, -1683851660);
			break;
		case 1058:
			Class262.method3638(false, class668, (byte) -27);
			break;
		case 23:
			Class220.method3107(class668, 1632795426);
			break;
		case 1138:
			Class626.method7460(class668, (byte) 77);
			break;
		case 703:
			Class77.method1159(class668, true, false, 1331954632);
			break;
		case 454:
			Class206.method2958(class668, (byte) 6);
			break;
		case 857:
			Class608.method7258(class668, (byte) -122);
			break;
		case 897:
			Class480.method5830(class668, -2004962808);
			break;
		case 822:
			Class452.method5436(class668, 600464371);
			break;
		case 451:
			Class405.method4939(class668, 1596931879);
			break;
		case 551:
			Class383.method4829(class668, (byte) 12);
			break;
		case 159:
			Class350.method4635(class668, 65280);
			break;
		case 917:
			Class247.method3426(class668, -1224341121);
			break;
		case 568:
			Class679.method8064(class668, 1842033905);
			break;
		case 817:
			Class311.method4181(class668, (byte) 90);
			break;
		case 59:
			Class184.method2766(class668, -1325704268);
			break;
		case 644:
			Class571.method6928(class668, -1687673905);
			break;
		case 1081:
			Class572.method6936(class668, (byte) -10);
			break;
		case 955:
			Class398.method4905(class668, (byte) 50);
			break;
		case 1098:
			Class306.method4131(class668, (byte) -36);
			break;
		case 42:
			Class214.method3081(class668, 1930550185);
			break;
		case 243:
			Class511.method6209(class668, -1476526390);
			break;
		case 928:
			Class114.method1483(class668, (byte) -17);
			break;
		case 764:
			Class155.method1876(class668, (byte) 65);
			break;
		case 481:
			Class665.method8000(class668, (byte) -37);
			break;
		case 1148:
			Class233.method3333(class668, 2083602213);
			break;
		case 2:
			Class285.method3838(class668, -1462715429);
			break;
		case 47:
			Class48.method916(class668, -2049181702);
			break;
		case 1113:
			Class374.method4784(class668, -553891371);
			break;
		case 11:
			Class282.method3772(class668, -2139512993);
			break;
		case 526:
			Class272.method3720(class668, (byte) 31);
			break;
		case 38:
			Class111.method1475(class668, 931197598);
			break;
		case 1191:
			Class34.method816(class668, (short) -15950);
			break;
		case 837:
			IntParam.method9593(class668, (byte) -91);
			break;
		case 1154:
			Class458.method5503(class668, 498470885);
			break;
		case 1225:
			Class521_Sub4.method9367(class668, 1057483714);
			break;
		case 720:
			Class404.method4932(class668, -2136725186);
			break;
		case 439:
			InterfaceDefinitions.method3510(class668, (byte) 0);
			break;
		case 982:
			Class45.method900(class668, (byte) 105);
			break;
		case 486:
			Class501.method6031(class668, 60299354);
			break;
		case 506:
			Class273.method3728(class668, 190380473);
			break;
		case 495:
			method7124(class668, -102195103);
			break;
		case 242:
			Class639.method7662(class668, 1695544345);
			break;
		case 204:
			Class575.method6997(class668, (byte) 1);
			break;
		case 143:
			Class205_Sub7.method9061(class668, (byte) 9);
			break;
		case 763:
			Class710_Sub10.method10021(class668, (byte) 26);
			break;
		case 542:
			Class374.method4783(class668, 2013262118);
			break;
		case 564:
			Class398.method4904(class668, -163300014);
			break;
		case 336:
			Class208.method2970(class668, 855984090);
			break;
		case 795:
			Class492.method5973(class668, 114563965);
			break;
		case 89:
			Class420.method5062(class668, 1020950963);
			break;
		case 543:
			Class633.method7545(class668, (byte) -71);
			break;
		case 30:
			Class144.method1793(class668, 1802385749);
			break;
		case 26:
			Class219.method3103(class668, (short) 13863);
			break;
		case 624:
			Class309.method4153(class668, (short) 20427);
			break;
		case 1224:
			Class335.method4376(class668, 2122983262);
			break;
		case 972:
			Class518.method6328(class668, -2012832575);
			break;
		case 745:
			Class469.method5698(class668, (byte) -65);
			break;
		case 598:
			Class323.method4258(class668, 665499933);
			break;
		case 308:
			Class184_Sub2.method8667(class668, -810103881);
			break;
		case 989:
			Class489.method5877(class668, (byte) 5);
			break;
		case 682:
			Class41_Sub1.method9624(class668, 2004561855);
			break;
		case 480:
			Class104.method1378(class668, (byte) -80);
			break;
		case 79:
			Class314.method4202(class668, (short) -9093);
			break;
		case 409:
			Class42.method876(class668, -672452204);
			break;
		case 355:
			Class213.method3076(class668, -1423846975);
			break;
		case 1095:
			Class572.method6934(class668, 1760025974);
			break;
		case 191:
			Class275.method3739(class668, (byte) 111);
			break;
		case 1020:
			Class655.method7939(class668, -819829235);
			break;
		case 374:
			Class261.method3622(class668, 70680948);
			break;
		case 647:
			Class166.method1994(class668, (byte) 61);
			break;
		case 1219:
			Class110.method1453(class668, -1677487036);
			break;
		case 637:
			Class77.method1158(class668, 1857342083);
			break;
		case 652:
			Class318.method4229(class668, (byte) -65);
			break;
		case 213:
			Class306.method4125(class668, (byte) 65);
			break;
		case 1021:
			Class464.method5633(class668, (short) -12920);
			break;
		case 1019:
			Class211.method3064(class668, (byte) -19);
			break;
		case 395:
			Class636.method7623(class668, 516175515);
			break;
		case 1143:
			Class643.method7735(class668, -614835233);
			break;
		case 1176:
			Class144.method1792(class668, 1456298458);
			break;
		case 613:
			Class360.method4757(class668, (byte) -41);
			break;
		case 29:
			ChunkSceneSubPackets.method4971(class668, 1966593575);
			break;
		case 369:
			Class203.method2929(class668, -1540451335);
			break;
		case 1231:
			Class611.method7277(class668, (byte) 0);
			break;
		case 744:
			Class527.method6426(class668, -1029966251);
			break;
		case 188:
			Class260.method3619(class668, (byte) 89);
			break;
		case 1258:
			Class35.method821(class668, 1521120324);
			break;
		case 646:
			Class609.method7264(class668, (byte) -59);
			break;
		case 477:
			Class653.method7879(class668, (byte) 54);
			break;
		case 1163:
			Class321.method4247(class668, -1125621563);
			break;
		case 642:
			Class612.method7313(class668, -1411037171);
			break;
		case 410:
			Class577.method7003(class668, -1673498412);
			break;
		case 903:
			Class406.method4949(class668, -1425963677);
			break;
		case 1181:
			Class259.method3606(class668, -661663078);
			break;
		case 1194:
			Class677.method8052(class668, 222450154);
			break;
		case 21:
			Class616.method7335(class668, (short) -15564);
			break;
		case 1174:
			Class506.method6145(class668, (byte) 7);
			break;
		case 342:
			Class27.method759(class668, (byte) 47);
			break;
		case 1079:
			Class668.method8006(class668, (byte) -17);
			break;
		case 1147:
			Class615.method7331(class668, 857943224);
			break;
		case 54:
			Class591.method7110(class668, 1481206083);
			break;
		case 1134:
			Class390.method4859(class668, (byte) 99);
			break;
		case 1090:
			Class232.method3324(class668, -756426545);
			break;
		case 19:
			Class99.method1328(class668, (byte) 21);
			break;
		case 638:
			Class302.method4100(class668, -1714147679);
			break;
		case 1192:
			Class205_Sub23.method9103(class668, (byte) 49);
			break;
		case 743:
			IcmpService_Sub1.method10060(class668, -881511990);
			break;
		case 1075:
			Class247.method3423(class668, -555241854);
			break;
		case 736:
			Class521_Sub1.method9333(class668, 1620233368);
			break;
		case 1124:
			Class503.method6054(class668, 1877879398);
			break;
		case 788:
			Class620.method7403(class668, (byte) -52);
			break;
		case 459:
			Class502.method6039(class668, -2056682459);
			break;
		case 602:
			Class534.method6468(class668, -136713173);
			break;
		case 356:
			Class243.method3401(class668, (byte) -51);
			break;
		case 823:
			Class105.method1403(class668, -257323507);
			break;
		case 658:
			Class403.method4931(class668, -1124830618);
			break;
		case 793:
			Class212.method3068(class668, (byte) 82);
			break;
		case 693:
			Class309.method4151(class668, -905024171);
			break;
		case 697:
			Class244.method3411(class668, (byte) 124);
			break;
		case 523:
			Class183_Sub1.method8659(class668, (byte) -23);
			break;
		case 1088:
			Class184.method2765(class668, 36650657);
			break;
		case 422:
			Class434.method5237(class668, 1483418012);
			break;
		case 889:
			Class669.method8012(class668, (byte) 0);
			break;
		case 842:
			Class565.method6875(class668, 203084180);
			break;
		case 896:
			Class283.method3777(class668, 91887237);
			break;
		case 233:
			Class95.method1297(class668, (byte) 17);
			break;
		case 756:
			Class411.method5003(class668, 1451811690);
			break;
		case 113:
			Class172.method2435(class668, 1682583948);
			break;
		case 958:
			Class381.method4818(class668, (short) 255);
			break;
		case 700:
			Class52.method935(class668, 1762279361);
			break;
		case 957:
			Class101.method1353(class668, (byte) 20);
			break;
		case 550:
			Class526.method6423(class668, 943090799);
			break;
		case 324:
			Class550.method6681(class668, (byte) 15);
			break;
		case 390:
			Class561.method6849(class668, 553554808);
			break;
		case 1005:
			Class300.method4024(class668, 1613832222);
			break;
		case 684:
			Class479.method5823(class668, (short) -8680);
			break;
		case 1127:
			Class166.method1995(class668, (byte) 70);
			break;
		case 572:
			Class226.method3282(class668, 1967368221);
			break;
		case 453:
			Class234.method3340(class668, (byte) 94);
			break;
		case 810:
			Class461.method5613(class668, -1456420388);
			break;
		case 1042:
			Class242.method3398(class668, -1056108788);
			break;
		case 124:
			Class24.method727(class668, 590103434);
			break;
		case 107:
			Class161.method1966(class668, (byte) 13);
			break;
		case 192:
			Class283.method3775(class668, 1867269829);
			break;
		case 1105:
			Class94.method1291(class668, (byte) 11);
			break;
		case 959:
			Class567.method6917(class668, (byte) 51);
			break;
		case 185:
			Class710_Sub35.method10216(class668, (byte) 121);
			break;
		case 775:
			Class482.method5835(class668, 294953677);
			break;
		case 364:
			Class584.method7043(class668, (byte) -15);
			break;
		case 119:
			Class603.method7201(class668, -1687082133);
			break;
		case 445:
			IComponentSettings.method9500(class668, (byte) -1);
			break;
		case 1100:
			Class61.method1043(class668, 653672513);
			break;
		case 154:
			Class77.method1159(class668, false, false, 1511383428);
			break;
		case 255:
			Class225.method3214(class668, -514646203);
			break;
		case 1206:
			Class204.method2937(class668, -1709556271);
			break;
		case 326:
			Class83.method1176(class668, (byte) 0);
			break;
		case 804:
			Class145.method1797(class668, 769545072);
			break;
		case 167:
			Class236.method3349(class668, -678980867);
			break;
		case 974:
			Class430.method5168(class668, 1614852873);
			break;
		case 850:
			Class230.method3294(class668, (byte) 0);
			break;
		case 971:
			Class649_Sub1_Sub3_Sub1.method10940(class668, -1219533553);
			break;
		case 314:
			Class263.method3667(class668, -1932623393);
			break;
		case 1255:
			Class34_Sub22.method10371(class668, (byte) 40);
			break;
		case 615:
			Class26.method742(class668, 1634456151);
			break;
		case 881:
			Class563.method6869(class668, (byte) 38);
			break;
		case 510:
			Class35.method823(class668, (byte) -86);
			break;
		case 468:
			Class161_Sub2.method8670(class668, 2076232171);
			break;
		case 1217:
			Class499.method6022(class668, (byte) -93);
			break;
		case 382:
			Class270.method3715(class668, -1612919938);
			break;
		case 1065:
			Class221.method3112(class668, -1564837028);
			break;
		case 189:
			Class417.method5036(class668, 2089962610);
			break;
		case 870:
			Class476.method5748(class668, 1315926055);
			break;
		case 773:
			Class167.method2413(class668, (byte) 124);
			break;
		case 1256:
			Class642.method7732(class668, -1087802104);
			break;
		case 911:
			Class205_Sub10.method9067(class668, -1664923705);
			break;
		case 200:
			Class230.method3296(class668, 1662880601);
			break;
		case 737:
			Class641.method7684(class668, 1294716896);
			break;
		case 591:
			Class639.method7665(class668, (short) -9103);
			break;
		case 1066:
			Class454.method5462(class668, 1316603396);
			break;
		case 920:
			Class441.method5329(class668, -2110992489);
			break;
		case 39:
			ItemDefinitions.method523(class668, 1857517913);
			break;
		case 1103:
			Class285.method3840(class668, -1610843831);
			break;
		case 1239:
			Class312.method4182(class668, -1963752069);
			break;
		case 1110:
			Class391.method4860(class668, 2028169967);
			break;
		case 207:
			Class233.method3332(class668, (byte) 47);
			break;
		case 986:
			Class248.method3449(class668, 454527090);
			break;
		case 800:
			Class595.method7131(class668, -639606248);
			break;
		case 184:
			Class224.method3211(class668, 1756455859);
			break;
		case 689:
			Class454.method5458(class668, -1383546429);
			break;
		case 708:
			Class296.method4001(class668, -2101007464);
			break;
		case 631:
			Class514.method6239(class668, 723496535);
			break;
		case 1201:
			Class306.method4129(class668, -1698457321);
			break;
		case 1146:
			Class296.method4003(class668, -230027219);
			break;
		case 1213:
			Class452.method5435(class668, -1596537643);
			break;
		case 388:
			Class208.method2967(class668, 1080494857);
			break;
		case 945:
			Class156.method1885(class668, -1989389272);
			break;
		case 300:
			Class449.method5417(class668, (byte) -110);
			break;
		case 943:
			Class455.method5478(class668, (byte) 1);
			break;
		case 462:
			Class306.method4123(class668, 268788246);
			break;
		case 258:
			Class458.method5500(class668, (byte) 32);
			break;
		case 604:
			Class281.method3767(class668, 1597104718);
			break;
		case 679:
			Class465.method5663(class668, 2064238369);
			break;
		case 175:
			Class335.method4372(class668, (byte) 55);
			break;
		case 1119:
			IncomingPacket.method5068(class668, (byte) 68);
			break;
		case 561:
			Class325.method4279(class668, -2099743844);
			break;
		case 966:
			Class456.method5482(class668, 1859091007);
			break;
		case 811:
			Class75.method1141(class668, 1385396101);
			break;
		case 695:
			Class612.method7314(class668, 319675571);
			break;
		case 402:
			Class710_Sub9.method10011(class668, -426371588);
			break;
		case 634:
			Class296.method4002(class668, 399699509);
			break;
		case 532:
			Class588.method7083(class668, -296676306);
			break;
		case 96:
			Class392.method4868(class668, -1614796999);
			break;
		case 277:
			Class511.method6210(class668, (byte) -7);
			break;
		case 1024:
			Class485.method5856(class668, (byte) -41);
			break;
		case 702:
			Class141.method1711(class668, 2080758401);
			break;
		case 710:
			Class57.method968(class668, 686450547);
			break;
		case 251:
			Class648.method7830(class668, -414739265);
			break;
		case 1004:
			Class141.method1708(class668, (short) 255);
			break;
		case 1076:
			Class498.method6018(class668, (byte) 8);
			break;
		case 1101:
			Class176.method2456(class668, (byte) 14);
			break;
		case 925:
			Class207.method2963(class668, 1010817225);
			break;
		case 1044:
			Class383.method4831(class668, 1993945694);
			break;
		case 670:
			Class186.method2778(class668, (byte) 2);
			break;
		case 352:
			Class169.method2418(class668, 858065920);
			break;
		case 648:
			Class397.method4897(class668, 1967658191);
			break;
		case 13:
			Class205.method2948(class668, -1394273900);
			break;
		case 399:
			Class26.method738(class668, -1348114376);
			break;
		case 148:
			Class430.method5170(class668, 2096101392);
			break;
		case 1244:
			Class98_Sub1_Sub1.method10475(class668, 1410118886);
			break;
		case 77:
			Class619.method7394(class668, (byte) -124);
			break;
		case 582:
			Class501.method6032(class668, -145990709);
			break;
		case 488:
			Class374.method4782(class668, (byte) 80);
			break;
		case 1263:
			Class350.method4636(class668, 1674188724);
			break;
		case 680:
			Class550.method6682(class668, 1228758909);
			break;
		case 126:
			Class116.method1486(class668, 1251373949);
			break;
		case 973:
			Class326.method4281(class668, (byte) 0);
			break;
		case 404:
			Class549.method6650(class668, -1127752608);
			break;
		case 776:
			Class536_Sub18.method9526(class668, -1449782286);
			break;
		case 1067:
			Class623.method7425(class668, (byte) -94);
			break;
		case 687:
			Class272.method3721(class668, (byte) 115);
			break;
		case 968:
			Class233.method3329(class668, -1827304143);
			break;
		case 264:
			Class226.method3278(class668, (byte) 17);
			break;
		case 120:
			Class224.method3208(class668, (byte) 2);
			break;
		case 132:
			Class237.method3355(class668, (byte) -5);
			break;
		case 721:
			Class598.method7154(class668, -870540806);
			break;
		case 597:
			Class527.method6433(class668, (short) 128);
			break;
		case 198:
			Class448.method5402(class668, (byte) -68);
			break;
		case 577:
			Class155.method1878(class668, (byte) -26);
			break;
		case 583:
			Class248.method3447(class668, (byte) -38);
			break;
		case 1092:
			Class212.method3069(class668, -1574917498);
			break;
		case 49:
			Class639.method7663(class668, 1741592726);
			break;
		case 1153:
			Class202.method2924(class668, (byte) -75);
			break;
		case 222:
			Class466.method5684(class668, -368328365);
			break;
		case 668:
			Class299.method4019(class668, (byte) -10);
			break;
		case 898:
			Class319_Sub1.method9137(class668, 1079773968);
			break;
		case 853:
			Class553.method6768(class668, (byte) 8);
			break;
		case 820:
			Class13.method623(class668, -1529018229);
			break;
		case 354:
			Class536_Sub31.method9658(class668, -213690903);
			break;
		case 479:
			Class385.method4839(class668, -1470358685);
			break;
		case 1:
			Class536_Sub5.method9402(class668, (byte) 124);
			break;
		case 94:
			Class572.method6937(class668, -1627593291);
			break;
		case 862:
			Class462.method5617(class668, -1571257930);
			break;
		case 1000:
			Class243.method3400(class668, 1236518941);
			break;
		case 1046:
			Class676.method8039(class668, 2057980546);
			break;
		case 586:
			Class333_Sub3_Sub1.method10601(class668, (byte) -1);
			break;
		case 7:
			Class605.method7208(class668, 497774820);
			break;
		case 1051:
			Class678.method8060(class668, (byte) 2);
			break;
		case 1125:
			Class479.method5825(class668, (byte) 1);
			break;
		case 63:
			Class75.method1142(class668, 363168304);
			break;
		case 1226:
			Class405.method4943(class668, (byte) -81);
			break;
		case 755:
			Class507.method6170(class668, -1736170371);
			break;
		case 151:
			Class403.method4930(class668, 989554008);
			break;
		case 467:
			Class704.method8267(class668, (byte) 92);
			break;
		case 678:
			Class584_Sub1.method9623(class668, (byte) 3);
			break;
		case 950:
			Class629.method7498(class668, 11985758);
			break;
		case 1049:
			Class285.method3839(class668, (byte) -3);
			break;
		case 492:
			Class225.method3215(class668, (byte) 64);
			break;
		case 1215:
			Class281.method3762(class668, 1790838270);
			break;
		case 87:
			Class657.method7949(class668, (byte) -115);
			break;
		case 1071:
			Class606.method7217(class668, -1411037171);
			break;
		case 770:
			Class565.method6878(class668, (byte) 43);
			break;
		case 1122:
			IncomingPacket.method5071(class668, 282905001);
			break;
		case 907:
			Class376.method4792(class668, -2116984157);
			break;
		case 65:
			Class380.method4806(class668, (byte) 102);
			break;
		case 267:
			Class103.method1373(class668, 2049472582);
			break;
		case 1069:
			Class250.method3462(class668, -286434639);
			break;
		case 596:
			Class207.method2964(class668, (byte) 60);
			break;
		case 435:
			Class563.method6871(class668, -312255341);
			break;
		case 118:
			Class100.method1336(class668, (byte) 1);
			break;
		case 289:
			Class637.method7641(class668, -406080485);
			break;
		case 975:
			Class514.method6236(class668, -1256158786);
			break;
		case 991:
			Class216.method3092(class668, (byte) -8);
			break;
		case 1070:
			Class621.method7409(class668, -2062451736);
			break;
		case 933:
			Class243.method3403(class668, 362196777);
			break;
		case 533:
			Class568.method6921(class668, 1369574205);
			break;
		case 348:
			Class229.method3291(class668, -34965505);
			break;
		case 1045:
			Class438.method5303(class668, -1019780031);
			break;
		case 1159:
			Class105.method1401(class668, 2064408969);
			break;
		case 593:
			Class51.method932(class668, (byte) -115);
			break;
		case 211:
			Class540.method6521(class668, (short) 10126);
			break;
		case 722:
			Class710_Sub39.method10244(class668, 2138419426);
			break;
		case 1106:
			Class641.method7681(class668, -2060168152);
			break;
		case 491:
			Class603.method7199(class668, (short) 255);
			break;
		case 1085:
			Class107.method1436(class668, (short) 15391);
			break;
		case 466:
			Class260.method3620(class668, 2034110814);
			break;
		case 530:
			Class536_Sub40.method9870(class668, (byte) 126);
			break;
		case 762:
			Class210.method2981(class668, (short) 26892);
			break;
		case 1262:
			Class211.method3061(class668, (byte) 35);
			break;
		case 1084:
			Class189.method2812(class668, (short) 8247);
			break;
		case 1195:
			Class693.method8207(class668, 1690118349);
			break;
		case 781:
			Class184_Sub6.method9081(class668, 752555649);
			break;
		case 441:
			Class45.method899(class668, -488932851);
			break;
		case 239:
			Class668.method8009(class668, 455796171);
			break;
		case 493:
			Class638.method7650(class668, -961210988);
			break;
		case 165:
			Class471.method5720(class668, (byte) 116);
			break;
		case 993:
			Class572.method6938(class668, 401302654);
			break;
		case 366:
			Class205_Sub10.method9065(class668, (short) 349);
			break;
		case 688:
			Class211.method3062(class668, 114785949);
			break;
		case 1052:
			Class244.method3409(class668, (byte) -81);
			break;
		case 683:
			Class494.method5992(class668, 855679952);
			break;
		case 618:
			Class247_Sub1.method9104(class668, -811879237);
			break;
		case 153:
			Class522.method6382(class668, (byte) 0);
			break;
		case 964:
			Class552.method6689(class668, 343287725);
			break;
		case 406:
			Class38.method842(class668, (short) -13753);
			break;
		case 187:
			Class529_Sub1.method9319(class668, -123565561);
			break;
		case 1116:
			Class160.method1958(class668, (byte) -1);
			break;
		case 430:
			Class624.method7429(class668, 1345846126);
			break;
		case 938:
			Class475.method5746(class668, (byte) 0);
			break;
		case 603:
			Class314.method4204(class668, 1867269829);
			break;
		case 161:
			Class174.method2448(class668, -1460475947);
			break;
		case 774:
			Class562.method6862(class668, 1513498950);
			break;
		case 669:
			Class297.method4004(class668, (byte) 77);
			break;
		case 1120:
			Class461.method5614(class668, 1921200445);
			break;
		case 874:
			Class290.method3925(class668, -1869687420);
			break;
		case 135:
			Class294.method3974(class668, -1949170551);
			break;
		case 412:
			Class645.method7804(class668, -204562688);
			break;
		case 1082:
			Class189.method2813(class668, -1645373535);
			break;
		case 478:
			Class41.method875(class668, 1222397625);
			break;
		case 1175:
			Class55.method956(class668, (byte) -20);
			break;
		case 1094:
			Class710_Sub13.method10050(class668, (byte) 91);
			break;
		case 282:
			Class398.method4901(class668, 1537698259);
			break;
		case 225:
			Class199.method2911(class668, 2023358163);
			break;
		case 784:
			Class217.method3097(class668, (byte) -32);
			break;
		case 827:
			Class67.method1082(class668, -1800415738);
			break;
		case 41:
			Class457.method5491(class668, -1407164081);
			break;
		case 868:
			Class232.method3322(class668, -1780842898);
			break;
		case 1128:
			Class460.method5549(class668, (short) 12789);
			break;
		case 706:
			Class555.method6799(class668, (byte) 0);
			break;
		case 358:
			Class236.method3343(class668, -872160269);
			break;
		case 1083:
			Class459.method5520(class668, (byte) -1);
			break;
		case 5:
			Class30.method784(class668, -1982501413);
			break;
		case 791:
			Class438.method5302(class668, (short) -19185);
			break;
		case 428:
			Class201.method2919(class668, 432289019);
			break;
		case 893:
			Class614.method7322(class668, -1906385303);
			break;
		case 232:
			Class510.method6185(class668, -853732880);
			break;
		case 749:
			Class521_Sub6.method9390(class668, 1937763563);
			break;
		case 147:
			Class305.method4107(class668, -1958091871);
			break;
		case 168:
			Class173.method2444(class668, (byte) 90);
			break;
		case 190:
			Class309_Sub1.method9188(class668, (byte) 118);
			break;
		case 1037:
			Class184_Sub6.method9083(class668, 1718686690);
			break;
		case 939:
			Class468.method5696(class668, -1639443626);
			break;
		case 432:
			Class269.method3712(class668, 2132999391);
			break;
		case 843:
			Class710_Sub9.method10010(class668, 913307477);
			break;
		case 900:
			Class153_Sub1.method8385(class668, 1011111925);
			break;
		case 371:
			Class458.method5502(class668, 16711935);
			break;
		case 1025:
			Class656.method7942(class668, 1716880871);
			break;
		case 236:
			Class584.method7045(class668, 1543795427);
			break;
		case 628:
			Class319_Sub2.method9158(class668, 700915819);
			break;
		case 455:
			Class246.method3417(class668, (byte) 24);
			break;
		case 723:
			Class333.method4366(class668, (byte) 1);
			break;
		case 1182:
			Class561.method6847(class668, -1724466837);
			break;
		case 1250:
			Class639.method7666(class668, 452842640);
			break;
		case 378:
			ChunkSceneSubPackets.method4974(class668, (byte) 0);
			break;
		case 1167:
			Class613.method7319(class668, -69981907);
			break;
		case 1054:
			Class396.method4886(class668, 2058261296);
			break;
		case 625:
			Class573.method6942(class668, -2046850320);
			break;
		case 1032:
			Class611.method7281(class668, -1474039195);
			break;
		case 513:
			Class595.method7130(class668, -1648367967);
			break;
		case 864:
			Class288.method3916(class668, -209816021);
			break;
		case 332:
			Class654.method7881(class668, (byte) 0);
			break;
		case 306:
			Class406.method4946(class668, (byte) 0);
			break;
		case 786:
			Class626.method7461(class668, (byte) -117);
			break;
		case 738:
			Class155.method1877(class668, (byte) -15);
			break;
		case 440:
			Class430.method5167(class668, 1240374771);
			break;
		case 421:
			Class228.method3287(class668, 1287990279);
			break;
		case 516:
			Class484.method5849(class668, (byte) 54);
			break;
		case 155:
			Class478.method5760(class668, -1968190402);
			break;
		case 1118:
			Class298.method4010(class668, (byte) -11);
			break;
		case 1183:
			Class334.method4368(class668, 447591339);
			break;
		case 35:
			Class153_Sub1.method8384(class668, -1298347846);
			break;
		case 1047:
			Class243.method3402(class668, (byte) -9);
			break;
		case 1002:
			Class540.method6519(class668, -1041772424);
			break;
		case 1048:
			Class389.method4853(class668, -1514199393);
			break;
		case 448:
			Class399.method4910(class668, 1557639708);
			break;
		case 16:
			Class655.method7937(class668, 2047287954);
			break;
		case 414:
			Class205_Sub22.method9100(class668, -149843590);
			break;
		case 447:
			Class50.method929(class668, -1232099595);
			break;
		case 14:
			Class622.method7419(class668, 1703088758);
			break;
		case 779:
			Class173.method2442(class668, (byte) -64);
			break;
		case 643:
			Class463.method5622(class668, (byte) -32);
			break;
		case 956:
			Class360_Sub1.method9270(class668, 34668368);
			break;
		case 1240:
			Class249.method3456(class668, -1465649478);
			break;
		case 205:
			Class147.method1813(class668, 708702043);
			break;
		case 181:
			Class486.method5859(class668, -1147002039);
			break;
		case 929:
			Class105.method1406(class668, -476418577);
			break;
		case 502:
			Class571.method6931(class668, (byte) 96);
			break;
		case 1173:
			Class617.method7368(class668, 1158243215);
			break;
		case 429:
			Class289.method3921(class668, 1821681753);
			break;
		case 248:
			Class406.method4948(class668, 266927495);
			break;
		case 494:
			Class502.method6038(class668, 439456570);
			break;
		case 209:
			Class567.method6916(class668, 949437176);
			break;
		case 92:
			Class69.method1092(class668, 1188450990);
			break;
		case 101:
			Class257.method3544(class668, 813860727);
			break;
		case 460:
			Class161.method1965(class668, -1837290158);
			break;
		case 1210:
			Class292.method3967(class668, (byte) -31);
			break;
		case 1140:
			Class499.method6021(class668, -2028615535);
			break;
		case 1223:
			Class330.method4320(class668, -735855552);
			break;
		case 10:
			Class640.method7671(class668, (byte) 88);
			break;
		case 1053:
			Class313.method4200(class668, 2049705539);
			break;
		case 913:
			Class313.method4198(class668, -1737824672);
			break;
		case 940:
			Class96.method1312(class668, -1374303013);
			break;
		case 311:
			Class549.method6649(class668, (byte) -35);
			break;
		case 794:
			Class577.method7004(class668, -679512346);
			break;
		case 557:
			Class28.method771(class668, 121834292);
			break;
		case 88:
			Class709.method8342(class668, (short) 20470);
			break;
		case 40:
			Class442.method5334(class668, (byte) 10);
			break;
		case 25:
			Class230.method3295(class668, 1806334488);
			break;
		case 585:
			Class233.method3335(class668, -1354642928);
			break;
		case 56:
			Class635.method7562(class668, (byte) 28);
			break;
		case 1126:
			Class170.method2422(class668, (byte) 62);
			break;
		case 1059:
			Class116.method1484(class668, 410413650);
			break;
		case 1222:
			Class384.method4832(class668, -615310653);
			break;
		case 1043:
			Class420.method5064(class668, 993410618);
			break;
		case 733:
			Class107.method1437(class668, 131072);
			break;
		case 1196:
			Class527.method6431(class668, (byte) -1);
			break;
		case 473:
			Class103.method1376(class668, -1679845023);
			break;
		case 1168:
			Class210.method2983(class668, 575029541);
			break;
		case 1197:
			Exception_Sub7.method10553(class668, (byte) 91);
			break;
		case 741:
			Class195.method2862(class668, -1091798666);
			break;
		case 951:
			Class228.method3286(class668, -665066217);
			break;
		case 562:
			Class644.method7790(class668, 694945405);
			break;
		case 425:
			Class231.method3319(class668, -855261630);
			break;
		case 1160:
			Class710_Sub15.method10078(class668, -1103609760);
			break;
		case 961:
			Class516.method6326(class668, 34336);
			break;
		case 1228:
			Class628.method7497(class668, (byte) 1);
			break;
		case 649:
			Class546.method6622(class668, 1047461233);
			break;
		case 1268:
			Class676.method8042(class668, true, (byte) 1);
			break;
		case 824:
			Class147.method1812(class668, 309915606);
			break;
		case 384:
			Class333_Sub2.method9180(class668, (byte) -38);
			break;
		case 52:
			Class484.method5848(class668, 1688508772);
			break;
		case 709:
			Class416.method5034(class668, (byte) 77);
			break;
		case 519:
			Class396.method4890(class668, -803684305);
			break;
		case 692:
			Class498.method6019(class668, 1699257369);
			break;
		case 400:
			Class100.method1338(class668, (short) -12653);
			break;
		case 1036:
			Class601.method7163(class668, -1049104220);
			break;
		case 411:
			Class536_Sub31_Sub2.method10835(class668, -405355603);
			break;
		case 1220:
			Class324.method4273(class668, -1722781010);
			break;
		case 946:
			Class481.method5834(class668, 1267640604);
			break;
		case 256:
			Class76.method1157(class668, -1461386844);
			break;
		case 131:
			Class465.method5665(class668, -2025329390);
			break;
		case 387:
			Class37.method838(class668, 2142390165);
			break;
		case 1221:
			Class104.method1379(class668, -1455427780);
			break;
		case 992:
			Class434.method5236(class668, 1941458471);
			break;
		case 1064:
			Class563.method6868(class668, 1779142399);
			break;
		case 948:
			Class279.method3759(class668, -441909634);
			break;
		case 15:
			Class629.method7499(class668, -1765969992);
			break;
		case 1026:
			Class197.method2871(class668, (byte) 71);
			break;
		case 559:
			Class571.method6932(class668, (byte) -94);
			break;
		case 244:
			Class294.method3973(class668, 984452028);
			break;
		case 469:
			Class189.method2815(class668, (byte) 121);
			break;
		case 95:
			OutgoingPacket.method5026(class668, -1258675209);
			break;
		case 612:
			Class232.method3323(class668, (byte) 17);
			break;
		case 237:
			Class264.method3676(class668, 222513083);
			break;
		case 179:
			Class310.method4174(class668, -1865523998);
			break;
		case 949:
			Class34_Sub4.method10318(class668, -1248225334);
			break;
		case 740:
			Class703.method8259(class668, -529461702);
			break;
		case 111:
			Class322.method4251(class668, (byte) -19);
			break;
		case 727:
			Class31.method786(class668, 2073010234);
			break;
		case 250:
			Class89.method1227(class668, (byte) 0);
			break;
		case 351:
			Class434.method5234(class668, 128004956);
			break;
		case 362:
			Class561.method6848(class668, -1558923600);
			break;
		case 1211:
			Class24.method726(class668, 752815129);
			break;
		case 979:
			Class315_Sub2.method9203(class668, 145411650);
			break;
		case 202:
			Class161.method1964(class668, 896749456);
			break;
		case 484:
			Class49.method924(class668, 1178055475);
			break;
		case 24:
			Class659.method7969(class668, 2059582538);
			break;
		case 317:
			Class466.method5685(class668, (byte) -29);
			break;
		case 563:
			Class188.method2797(class668, 649079784);
			break;
		case 260:
			Class597.method7141(class668, 122464974);
			break;
		case 245:
			Class471.method5714(class668, 2128719268);
			break;
		case 416:
			Class602.method7183(class668, -365133100);
			break;
		case 1157:
			Class33.method798(class668, -760542404);
			break;
		case 32:
			Class316.method4216(class668, -1302139605);
			break;
		case 1166:
			Class489.method5880(class668, 1776648732);
			break;
		case 1006:
			Class31.method787(class668, 69190648);
			break;
		case 246:
			Class86.method1202(class668, 1553391943);
			break;
		case 1144:
			Class272.method3722(class668, -2030672338);
			break;
		case 254:
			Class645_Sub1.method10042(class668, -2145193758);
			break;
		case 660:
			Class617.method7366(class668, -1302338280);
			break;
		case 681:
			Class26.method737(class668, (byte) 13);
			break;
		case 828:
			Class568.method6922(class668, 2096841703);
			break;
		case 805:
			Class293.method3970(class668, -576514635);
			break;
		case 1267:
			Class93.method1239(true, class668, (short) 17551);
			break;
		case 553:
			Class481.method5832(class668, 882901601);
			break;
		case 323:
			Class649_Sub1.method9992(class668, (byte) 0);
			break;
		case 1121:
			Class324.method4271(class668, (byte) -5);
			break;
		case 345:
			Class384.method4834(class668, 1664771670);
			break;
		case 316:
			ChunkSceneSubPackets.method4969(class668, (short) -180);
			break;
		case 919:
			Class230.method3297(class668, 120071885);
			break;
		case 450:
			Class535.method6481(class668, (byte) -74);
			break;
		case 675:
			Class382.method4822(class668, -1190586162);
			break;
		case 1003:
			Class293.method3969(class668, 1711515046);
			break;
		case 276:
			Class70.method1116(class668, (byte) -27);
			break;
		case 584:
			Class558.method6816(class668, (byte) 101);
			break;
		case 735:
			Class632.method7541(class668, (byte) -79);
			break;
		case 1078:
			Class263.method3664(class668, (byte) 87);
			break;
		case 215:
			Class292.method3965(class668, (byte) 111);
			break;
		case 403:
			Class526.method6422(class668, true, 1272502380);
			break;
		case 629:
			Class204.method2935(class668, 1409181238);
			break;
		case 1129:
			Class515.method6323(class668, -575549704);
			break;
		case 465:
			Class60.method997(class668, (short) 256);
			break;
		case 694:
			Class257.method3542(class668, 1637601608);
			break;
		case 609:
			Class416.method5033(class668, 1304513121);
			break;
		case 303:
			Class99.method1329(class668, (short) 822);
			break;
		case 885:
			Class313.method4197(class668, 1386342421);
			break;
		case 338:
			Class547.method6634(class668, (byte) 0);
			break;
		case 556:
			Class59.method981(class668, 805668109);
			break;
		case 1253:
			Class242.method3394(class668, -1957463000);
			break;
		case 97:
			Class685.method8113(class668, 1430185408);
			break;
		case 1022:
			Class247.method3422(class668, (byte) 4);
			break;
		case 498:
			Class449.method5419(class668, -1860177643);
			break;
		case 717:
			Class457.method5487(class668, -948976061);
			break;
		case 1260:
			Class606.method7220(class668, (byte) 1);
			break;
		case 81:
			Class394.method4877(class668, -428807180);
			break;
		case 1055:
			Class678.method8058(class668, (byte) 12);
			break;
		case 449:
			Class586.method7060(class668, -2099434899);
			break;
		case 144:
			Class575.method7001(class668, 1893698405);
			break;
		case 1014:
			Class536_Sub18_Sub2.method10490(class668, -1431527920);
			break;
		case 1203:
			Class589.method7096(class668, (byte) -36);
			break;
		case 707:
			Class201.method2920(class668, -1993303974);
			break;
		case 667:
			Class685.method8110(class668, 258822434);
			break;
		case 932:
			Class64.method1058(class668, -1887030244);
			break;
		case 1130:
			Class472.method5737(class668, (short) -12974);
			break;
		case 1152:
			Class315_Sub2.method9205(class668, -293741765);
			break;
		case 846:
			Class205_Sub21.method9095(class668, -179035371);
			break;
		case 401:
			Class399.method4913(class668, -2106464211);
			break;
		case 653:
			Class456.method5484(class668, (byte) 1);
			break;
		case 163:
			ObjectParam.method9469(class668, (byte) 104);
			break;
		case 1068:
			Class536_Sub17.method9520(class668, -1918249791);
			break;
		case 34:
			Class640.method7670(class668, -111579099);
			break;
		case 1027:
			Class335.method4373(class668, 1052842044);
			break;
		case 606:
			Class79.method1162(class668, -629003550);
			break;
		case 962:
			Class194.method2854(class668, -2111012557);
			break;
		case 357:
			Class72.method1125(class668, -780357562);
			break;
		case 279:
			Class404.method4933(class668, 1426677255);
			break;
		case 855:
			Class247.method3421(class668, (byte) -29);
			break;
		case 452:
			Class430.method5165(class668, 1994349958);
			break;
		case 436:
			Class600.method7160(class668, (byte) -71);
			break;
		case 829:
			Class628.method7495(class668, 1100238230);
			break;
		case 570:
			Class160.method1962(class668, 346457849);
			break;
		case 904:
			Class55.method952(class668, (byte) 16);
			break;
		case 754:
			Class211.method3063(class668, 8119236);
			break;
		case 265:
			Class334.method4369(class668, 1356688933);
			break;
		case 558:
			Class27.method760(class668, 2123596659);
			break;
		case 335:
			Exception_Sub6.method10535(class668, (byte) 57);
			break;
		case 1252:
			Class59.method988(class668, 1068583013);
			break;
		case 980:
			Class33.method799(class668, 205809120);
			break;
		case 398:
			Class183.method2736(class668, 2038916313);
			break;
		case 269:
			Class581.method7020(class668, -417194119);
			break;
		case 528:
			Class652.method7865(class668, -370605213);
			break;
		case 1269:
			Class324.method4274(class668, -1866889458);
			break;
		case 909:
			Class213.method3073(class668, -231932546);
			break;
		case 27:
			Class374.method4780(class668, -139713593);
			break;
		case 385:
			Class649_Sub1_Sub5_Sub1.method10919(class668, -741890823);
			break;
		case 899:
			Class384.method4833(class668, 904716295);
			break;
		case 995:
			Class583.method7026(class668, -2124537414);
			break;
		case 998:
			Class595.method7132(class668, 419395260);
			break;
		case 1155:
			Class444.method5393(class668, (byte) 108);
			break;
		case 69:
			Class640.method7675(class668, -675841203);
			break;
		case 315:
			Class566.method6893(class668, (byte) -26);
			break;
		case 589:
			Class649_Sub1_Sub4_Sub2.method10956(class668, -1300558766);
			break;
		case 443:
			Class246.method3416(class668, -1198075554);
			break;
		case 902:
			Class572.method6935(class668, -972057181);
			break;
		case 947:
			Class708.method8341(class668, 1472892954);
			break;
		case 931:
			Class678.method8059(class668, (byte) 33);
			break;
		case 567:
			Class523.method6401(class668, 1914095996);
			break;
		case 171:
			Class461.method5612(class668, -889224915);
			break;
		case 294:
			Class430.method5166(class668, -691399867);
			break;
		case 501:
			Class306.method4126(class668, -1905633977);
			break;
		case 127:
			Class383.method4830(class668, (short) 255);
			break;
		case 941:
			Class652.method7867(class668, 878041669);
			break;
		case 295:
			Class710_Sub36.method10224(class668, 1567671700);
			break;
		case 353:
			Class173.method2443(class668, 2008644184);
			break;
		case 370:
			Class654.method7883(class668, 1298485916);
			break;
		case 1030:
			Class550.method6684(class668, 1412374043);
			break;
		case 651:
			Class523.method6402(class668, (byte) -108);
			break;
		case 728:
			Class205_Sub22.method9097(class668, -1190950716);
			break;
		case 84:
			Class312.method4183(class668, -2091881079);
			break;
		case 565:
			Class106.method1426(class668, (byte) 54);
			break;
		case 66:
			Class391.method4861(class668, -1722254152);
			break;
		case 555:
			Class263.method3668(class668, (byte) 4);
			break;
		case 43:
			Class657.method7948(class668, 600459007);
			break;
		case 831:
			IncomingPacket.method5067(class668, 819698031);
			break;
		case 1233:
			Class561.method6851(class668, 1205403461);
			break;
		case 990:
			Class707.method8302(class668, (short) 4098);
			break;
		case 1131:
			Class392_Sub1.method9209(class668, 559746021);
			break;
		case 257:
			Class462.method5616(class668, 1982497339);
			break;
		case 98:
			Class650.method7860(class668, -1933245054);
			break;
		case 977:
			Class471.method5719(class668, (short) 255);
			break;
		case 1114:
			Class186.method2775(class668, (byte) 0);
			break;
		case 819:
			Class527.method6425(class668, (byte) -40);
			break;
		case 413:
			Class23.method724(class668, 261187593);
			break;
		case 18:
			Class105.method1404(class668, -45940979);
			break;
		case 341:
			Class573.method6941(class668, -879555824);
			break;
		case 844:
			Class405.method4940(class668, 1734717975);
			break;
		case 1096:
			Class579.method7009(class668, (byte) 97);
			break;
		case 431:
			Class404.method4936(class668, (byte) 52);
			break;
		case 713:
			Class451.method5431(class668, (short) 255);
			break;
		case 581:
			Class582.method7024(class668, 1277571877);
			break;
		case 877:
			Class536_Sub24_Sub4.method10697(class668, 748170653);
			break;
		case 1050:
			Class468.method5697(class668, 1312049811);
			break;
		case 673:
			Class608.method7259(class668, (byte) 10);
			break;
		case 203:
			Class647.method7816(class668, 2086793821);
			break;
		case 114:
			Class188.method2794(class668, -307348693);
			break;
		case 1251:
			Class264.method3675(class668, -664627230);
			break;
		case 130:
			Class670.method8013(class668, (byte) 15);
			break;
		case 149:
			Class405.method4944(class668, 1141507807);
			break;
		case 834:
			Class335.method4375(class668, (byte) -47);
			break;
		case 921:
			Class463.method5624(class668, -358375360);
			break;
		case 747:
			Class53_Sub1.method10365(class668, (byte) 36);
			break;
		case 522:
			Class662.method7984(class668, -1645921193);
			break;
		case 1180:
			Class341_Sub1_Sub2.method10599(class668, -274805719);
			break;
		case 116:
			Class224.method3206(class668, -40002016);
			break;
		case 789:
			Class571.method6933(class668, -379612225);
			break;
		case 301:
			Class465.method5664(class668, -1386386516);
			break;
		case 146:
			Class214.method3079(class668, 22634028);
			break;
		case 129:
			Class333_Sub3_Sub1.method10600(class668, (byte) 41);
			break;
		case 490:
			Class158.method1888(class668, 1340048739);
			break;
		case 346:
			Class22.method714(class668, (byte) -66);
			break;
		case 790:
			Class333_Sub3_Sub2.method10633(class668, -549034776);
			break;
		case 839:
			Class477.method5750(class668, 143333043);
			break;
		default:
			throw new RuntimeException();
		case 772:
			Class241.method3384(class668, (byte) -3);
			break;
		case 656:
			Class22.method715(class668, -72975368);
			break;
		case 544:
			Class252.method3520(class668, -1233957403);
			break;
		case 905:
			Class535.method6482(class668, (byte) 0);
			break;
		case 325:
			Class404.method4935(class668, (byte) 1);
			break;
		case 994:
			Class651.method7861(class668, 1001841232);
			break;
		case 134:
			Class289.method3918(class668, -534311277);
			break;
		case 359:
			Class261.method3625(class668, -1773413613);
			break;
		case 71:
			Class171.method2426(class668, 1914879831);
			break;
		case 641:
			Class245.method3412(class668, -1407412574);
			break;
		case 408:
			Class224.method3205(class668, 1592646445);
			break;
		case 210:
			Class404.method4937(class668, (byte) 25);
			break;
		case 590:
			InterfaceDefinitions.method3512(class668, (byte) 86);
			break;
		case 836:
			Class205_Sub6.method9060(class668, -1137569162);
			break;
		case 813:
			Class458_Sub5.method9375(class668, 1347535133);
			break;
		case 771:
			Class536_Sub39.method9850(class668, -1215439027);
			break;
		case 302:
			Class543.method6582(class668, (short) 18563);
			break;
		case 571:
			Class556.method6806(class668, 436645430);
			break;
		case 851:
			Class144.method1791(class668, -1136935245);
			break;
		case 74:
			Class450.method5428(class668, -2085368825);
			break;
		case 230:
			Class641.method7680(class668, 382055716);
			break;
		case 636:
			Class322.method4252(class668, 4633269);
			break;
		case 487:
			Class509.method6181(class668, (byte) 19);
			break;
		case 70:
			Class396.method4888(class668, -675887647);
			break;
		case 934:
			Class398.method4900(class668, -1163687583);
			break;
		case 915:
			Class392.method4865(class668, 451816957);
			break;
		case 8:
			Class285.method3841(class668, -1268874659);
			break;
		case 182:
			Class592.method7118(class668, 1568843901);
			break;
		case 1102:
			Class26.method740(class668, (byte) 0);
			break;
		case 140:
			Class661.method7981(class668, (byte) -66);
			break;
		case 825:
			Class628.method7494(class668, -306178230);
			break;
		case 976:
			Class478.method5759(class668, (byte) 2);
			break;
		case 882:
			Class537.method6505(class668, (byte) -25);
			break;
		case 46:
			Class705.method8274(class668, -1026600667);
			break;
		case 83:
			Class381.method4820(class668, 1010845362);
			break;
		case 1185:
			Class219.method3100(class668, -986521148);
			break;
		case 373:
			Class8.method602(class668, (byte) 1);
			break;
		case 274:
			Class198.method2874(class668, -369448145);
			break;
		case 626:
			Class617.method7369(class668, 1550654881);
			break;
		case 418:
			Class710_Sub39.method10245(class668, 1815629367);
			break;
		case 299:
			Class38.method844(class668, -651002383);
			break;
		case 607:
			Class175.method2452(class668, -919665912);
			break;
		case 312:
			Class484.method5846(class668, 1919609833);
			break;
		case 1077:
			Class310.method4175(class668, 2049727417);
			break;
		case 536:
			Class214.method3082(class668, 1251521045);
			break;
		case 910:
			Class489.method5881(class668, (byte) 13);
			break;
		case 1200:
			Class13.method622(class668, (byte) 1);
			break;
		case 1151:
			Class519.method6335(class668, -1106709147);
			break;
		case 64:
			Class596.method7136(class668, (byte) 0);
			break;
		case 172:
			Class497.method6014(class668, (short) 8192);
			break;
		case 841:
			Class536_Sub24_Sub5.method10698(class668, 1303236673);
			break;
		case 51:
			Class226.method3279(class668, (byte) 108);
			break;
		case 552:
			Class679.method8066(class668, 1964628351);
			break;
		case 515:
			Class28.method764(class668, (byte) 115);
			break;
		case 821:
			Class188.method2798(class668, -352087103);
			break;
		case 1010:
			Class580.method7016(class668, (byte) 88);
			break;
		case 715:
			Class199.method2910(class668, (byte) -40);
			break;
		case 729:
			Class187.method2783(class668, 1780363756);
			break;
		case 621:
			Class68.method1089(class668, 796154754);
			break;
		case 923:
			Class193.method2851(class668, -854039123);
			break;
		case 1188:
			Class678.method8056(class668, (byte) 121);
			break;
		case 906:
			Class710_Sub7.method9936(class668, 1034008067);
			break;
		case 573:
			Class8.method603(class668, 575130754);
			break;
		case 99:
			Class384.method4837(class668, -1245491561);
			break;
		case 1177:
			Class250.method3463(class668, -423470693);
			break;
		case 1023:
			Class482.method5836(class668, -1983493342);
			break;
		case 1029:
			Class262.method3641(class668, 1025920001);
			break;
		case 331:
			Class286.method3909(class668, (byte) 102);
			break;
		case 677:
			Class114.method1482(class668, 29717546);
			break;
		case 1108:
			Class236.method3348(class668, 1715984765);
			break;
		case 1007:
			Class589.method7097(class668, (short) 256);
			break;
		case 48:
			Class652.method7866(class668, (byte) 11);
			break;
		case 987:
			Class279.method3760(class668, 1609206936);
			break;
		case 437:
			Class710_Sub3.method9901(class668, 2027693981);
			break;
		case 924:
			Class219.method3104(class668, 74569975);
			break;
		case 630:
			Class406.method4947(class668, (byte) -4);
			break;
		case 1264:
			Class335.method4371(class668, 1866764132);
			break;
		case 208:
			Class587.method7079(class668, (short) 189);
			break;
		case 249:
			Class32.method791(class668, -1875865954);
			break;
		case 297:
			Class512.method6217(class668, 671179845);
			break;
		case 266:
			Class402.method4926(class668, 1996814418);
			break;
		case 833:
			Class69.method1095(class668, 543339087);
			break;
		case 1259:
			Class77.method1159(class668, true, true, 1247741295);
			break;
		case 719:
			Class434.method5235(class668, 1032351030);
			break;
		case 286:
			method7125(class668, (byte) -27);
			break;
		case 133:
			Class664.method7998(class668, -764990172);
			break;
		case 645:
			Class649_Sub1_Sub2_Sub2.method10948(class668, 884734482);
			break;
		case 734:
			Class217.method3098(class668, (byte) 5);
			break;
		case 663:
			Class205_Sub7.method9062(class668, 679117982);
			break;
		case 1039:
			Class110.method1455(class668, -800583684);
			break;
		case 1080:
			Class526.method6424(class668, -306650385);
			break;
		case 150:
			Class39.method867(class668, -635787496);
			break;
		case 442:
			Class450.method5426(class668, (byte) 1);
			break;
		case 504:
			Class141.method1709(class668, -276929566);
			break;
		case 290:
			Class640.method7674(class668, (byte) 8);
			break;
		case 1109:
			Class391.method4862(class668, (byte) 64);
			break;
		case 548:
			Class446.method5398(class668, -1063216974);
			break;
		case 659:
			Class560.method6826(class668, 1957554287);
			break;
		case 104:
			Class453.method5444(class668, -1702743475);
			break;
		case 1266:
			Class90.method1229(class668, 239369826);
			break;
		case 1115:
			Class259.method3609(class668, 796001083);
			break;
		case 75:
			Class438.method5298(class668, 1685635026);
			break;
		case 174:
			Class48.method914(class668, (byte) 34);
			break;
		case 36:
			Class315.method4211(class668, 1759375275);
			break;
		case 538:
			Class15.method639(class668, 1075646475);
			break;
		case 985:
			Class706_Sub1.method10138(class668, (byte) 2);
			break;
		case 1205:
			Class12.method621(class668, 65280);
			break;
		case 461:
			Class301.method4096(class668, 806667054);
			break;
		case 1247:
			Class182.method2722(class668, (byte) 2);
			break;
		case 767:
			Class250.method3459(class668, 2074958543);
			break;
		case 288:
			Class565.method6877(class668, 981523405);
			break;
		case 117:
			Class220.method3106(class668, -2042597148);
			break;
		case 350:
			Class571.method6930(class668, (byte) 23);
			break;
		case 67:
			Class642.method7731(class668, (byte) -88);
			break;
		case 539:
			Class536_Sub38.method9830(class668, -840030237);
			break;
		case 848:
			Class110.method1454(class668, -1976631256);
			break;
		case 186:
			Class601.method7167(class668, -876533965);
			break;
		case 142:
			Class359.method4723(class668, (byte) -14);
			break;
		case 1142:
			Class184_Sub1.method8645(class668, -1709845793);
			break;
		case 199:
			Class495.method5997(class668, (byte) -25);
			break;
		case 193:
			Class315.method4214(class668, (short) 139);
			break;
		case 472:
			Class610.method7274(class668, (short) 2160);
			break;
		case 1132:
			Class250.method3460(class668, (byte) -8);
			break;
		case 1236:
			Class405.method4941(class668, 155310066);
			break;
		case 547:
			Class33.method797(class668, (byte) -12);
			break;
		case 102:
			Class463.method5623(class668, 1724589332);
			break;
		case 705:
			Class188.method2795(class668, 1857054129);
			break;
		case 996:
			Class536_Sub5.method9403(class668, 199584040);
			break;
		case 787:
			Class275.method3738(class668, (byte) 27);
			break;
		case 108:
			Class4.method573(class668, -708374433);
			break;
		case 368:
			Class527.method6427(class668, 1463561829);
			break;
		case 500:
			Class384.method4835(class668, (byte) 4);
			break;
		case 100:
			Class470.method5708(class668, -678367908);
			break;
		case 386:
			Class3.method553(class668, -38822417);
			break;
		case 676:
			Class34_Sub7.method10327(class668, -2122097987);
			break;
		case 575:
			Class139.method1700(class668, 1785385297);
			break;
		case 392:
			Class205_Sub14.method9074(class668, 213738999);
			break;
		case 396:
			Class269.method3711(class668, -1343991525);
			break;
		case 456:
			Class591.method7113(class668, -2051823719);
			break;
		case 287:
			Class674.method8028(class668, 1160779422);
			break;
		case 1204:
			Class609.method7263(class668, 2039629376);
			break;
		case 587:
			Class156.method1884(class668, -2003641254);
			break;
		case 832:
			Class45.method901(class668, (byte) 1);
			break;
		case 53:
			Class302.method4099(class668, 795957825);
			break;
		case 926:
			Class631.method7532(class668, 1745698128);
			break;
		case 816:
			Class504.method6077(class668, 550541180);
			break;
		case 802:
			Class509.method6180(class668, 2067931712);
			break;
		case 93:
			Class590.method7101(class668, (byte) 1);
			break;
		case 655:
			Class512.method6212(class668, -1861066989);
			break;
		case 420:
			Class504.method6078(class668, (short) -7461);
			break;
		case 145:
			ItemDefinitions.method525(class668, (byte) 30);
			break;
		case 340:
			Class664.method7990(class668, -825581025);
			break;
		case 197:
			Class30.method778(class668, 240211446);
			break;
		case 1097:
			InterfaceDefinitions.method3511(class668, -1783914702);
			break;
		case 419:
			Class610.method7272(class668, (byte) -75);
			break;
		case 594:
			Class663.method7987(class668, 348542257);
			break;
		case 241:
			Class166.method1996(class668, 1288352997);
			break;
		case 464:
			Class495.method5995(class668, (byte) 0);
			break;
		case 381:
			Class552.method6690(class668, 16711680);
			break;
		case 1184:
			Class287.method3914(class668, 36160);
			break;
		case 1169:
			Class266.method3696(class668, -333732968);
			break;
		case 545:
			Class291.method3930(class668, 1571982358);
			break;
		case 574:
			Class478.method5763(class668, -277186529);
			break;
		case 1062:
			Class289.method3917(class668, (byte) 1);
			break;
		case 541:
			Class411.method5001(class668, 2055901231);
			break;
		case 1162:
			Class261.method3623(class668, -1349631560);
			break;
		case 60:
			Class204.method2938(class668, 425136979);
			break;
		case 546:
			Class214.method3078(class668, (byte) -18);
			break;
		case 858:
			Class30.method783(class668, (byte) 20);
			break;
		case 262:
			Class618.method7391(class668, (byte) 5);
			break;
		case 1063:
			Class217.method3096(class668, (byte) 8);
			break;
		case 983:
			Class215.method3090(class668, 1216691562);
			break;
		case 33:
			Class621.method7408(class668, -1283771083);
			break;
		case 125:
			Class484.method5847(class668, (short) 11206);
			break;
		case 798:
			Class453.method5448(class668, (byte) -31);
			break;
		case 322:
			Exception_Sub6.method10536(class668, -2046401918);
			break;
		case 1178:
			Class164.method1973(class668, 454911528);
			break;
		case 1245:
			Class567_Sub1.method9875(class668, -1719771165);
			break;
		case 1139:
			Class203.method2928(class668, -1394257329);
			break;
		case 1135:
			Class8.method604(class668, -2143931850);
			break;
		case 272:
			Class465.method5662(class668, 605338668);
			break;
		case 580:
			Class587.method7080(class668, -1743072297);
			break;
		case 62:
			Class167.method2409(class668, (byte) 9);
			break;
		case 529:
			Class591.method7109(class668, -674903560);
			break;
		case 112:
			Class225.method3213(class668, 1085696663);
			break;
		case 965:
			Class153.method1868(class668, -96940279);
			break;
		case 1199:
			Class530.method6440(class668, 1891827960);
			break;
		case 880:
			Class610.method7275(class668, (byte) 117);
			break;
		case 796:
			Class376.method4793(class668, (byte) 107);
			break;
		case 91:
			Class221.method3110(class668, (byte) -103);
			break;
		case 826:
			Class646.method7807(class668, (byte) -28);
			break;
		case 349:
			Class465.method5666(class668, -2020441271);
			break;
		case 799:
			Class524.method6408(class668, -2046440386);
			break;
		case 914:
			Class640.method7672(class668, (byte) 69);
			break;
		case 674:
			Class104.method1377(class668, -924560227);
			break;
		case 527:
			Class479.method5824(class668, 1457452186);
			break;
		case 766:
			Class226.method3281(class668, -1240827878);
			break;
		case 333:
			Class683.method8103(class668, -1879519006);
			break;
		case 714:
			Class281.method3763(class668, -1071334357);
			break;
		case 434:
			Class671.method8022(class668, -1826570227);
			break;
		case 765:
			Class483.method5838(class668, 1102055614);
			break;
		case 760:
			Class55.method953(class668, -934156339);
			break;
		case 847:
			Class247.method3420(class668, -505126699);
			break;
		case 639:
			Class541.method6527(class668, 1864731483);
			break;
		case 666:
			Class205_Sub4_Sub1.method10583(class668, (byte) -106);
			break;
		case 1057:
			Class644.method7788(class668, (short) 20569);
			break;
		case 223:
			Class623.method7424(class668, (byte) 61);
			break;
		case 1165:
			Class260.method3617(class668, (byte) 106);
			break;
		case 803:
			Class9.method606(class668, (byte) 118);
			break;
		case 537:
			Class710_Sub22.method10121(class668, -1277212020);
			break;
		case 849:
			Class217.method3095(class668, -1591111253);
			break;
		case 235:
			Class460.method5550(class668, 2017144644);
			break;
		case 263:
			Class22.method713(class668, -1122231036);
			break;
		case 1218:
			Class598.method7153(class668, (byte) 1);
			break;
		case 1141:
			Class494.method5990(class668, -554812072);
			break;
		case 814:
			Class533.method6463(class668, (byte) 22);
			break;
		case 1089:
			Class211.method3066(class668, 1758909112);
			break;
		case 952:
			Class306.method4124(class668, -468039548);
			break;
		case 595:
			ChunkSceneSubPackets.method4970(class668, -1500006845);
			break;
		case 82:
			Class226.method3277(class668, -691783618);
			break;
		case 139:
			Class506.method6141(class668, (byte) -53);
			break;
		case 427:
			Class449.method5421(class668, 1729818490);
			break;
		case 268:
			Class298.method4012(class668, (byte) 0);
			break;
		case 801:
			Class546.method6623(class668, 1547299573);
			break;
		case 610:
			Class353.method4646(class668, -709285902);
			break;
		case 291:
			Class710_Sub22.method10122(class668, -1553077312);
			break;
		case 892:
			Class215.method3089(class668, -1747900835);
			break;
		case 367:
			Class512.method6215(class668, (byte) -1);
			break;
		case 635:
			Class451.method5429(class668, 1899393726);
			break;
		case 1041:
			Class589.method7098(class668, 1891248525);
			break;
		case 600:
			Class241.method3386(class668, -1794083673);
			break;
		case 960:
			Class364.method4764(class668, (short) 255);
			break;
		case 73:
			Class710_Sub6.method9930(class668, 518278148);
			break;
		case 592:
			Class98_Sub1_Sub1.method10474(class668, (byte) 10);
			break;
		case 328:
			Class650.method7858(class668, (byte) 119);
			break;
		case 78:
			Class560.method6825(class668, (byte) 0);
			break;
		case 686:
			Class485.method5857(class668, -401326557);
			break;
		case 1238:
			Class60.method1000(class668, (short) -6267);
			break;
		case 407:
			Class139.method1697(class668, (byte) 16);
			break;
		case 72:
			Class101.method1356(class668, 2043026212);
			break;
		case 80:
			Class385.method4842(class668, (short) -9234);
			break;
		case 503:
			Class42.method877(class668, -1969713037);
			break;
		case 511:
			Class111.method1474(class668, (byte) 61);
			break;
		case 259:
			Class183_Sub2_Sub1.method10521(class668, -818882419);
			break;
		case 194:
			Class603.method7197(class668, (byte) 67);
			break;
		case 1061:
			Class632.method7540(class668, -1148239461);
			break;
		case 0:
			Class350.method4637(class668, -1068613841);
			break;
		case 531:
			Class624.method7426(class668, -383564666);
			break;
		case 867:
			Class633.method7544(class668, -1923312719);
			break;
		case 981:
			Class321.method4245(class668, (byte) -95);
			break;
		case 620:
			Class626.method7462(class668, (short) 13605);
			break;
		case 496:
			Class166.method1998(class668, 68582778);
			break;
		case 640:
			Class99.method1330(class668, (byte) 96);
			break;
		case 1265:
			Class454.method5459(class668, 1215873805);
			break;
		case 512:
			Class229.method3292(class668, (byte) -45);
			break;
		case 507:
			Class438.method5299(class668, -1107237008);
			break;
		case 296:
			Class196.method2867(class668, (byte) -37);
			break;
		case 397:
			Class30.method782(class668, 662549519);
			break;
		case 608:
			Class508.method6176(class668, 1029164725);
			break;
		case 1149:
			Class622.method7416(class668, (byte) 20);
			break;
		case 1161:
			Class688.method8171(class668, 643742020);
			break;
		case 1227:
			Class232.method3327(class668, -1289509981);
			break;
		case 916:
			Class283.method3774(class668, (short) -495);
			break;
		case 178:
			Class324.method4270(class668, 1996254472);
			break;
		case 137:
			Class144.method1794(class668, 1630972807);
			break;
		case 176:
			Class438.method5297(class668, -1678826130);
			break;
		case 372:
			Class532.method6444(class668, -811007456);
			break;
		case 623:
			Class507.method6169(class668, 650327106);
			break;
		case 579:
			Class505.method6137(class668, 1891024563);
			break;
		case 365:
			Class614.method7321(class668, -1740906961);
			break;
		case 908:
			Class602.method7182(class668, (byte) 6);
			break;
		case 761:
			Class514.method6235(class668, (short) -32152);
			break;
		case 699:
			Class263.method3665(class668, (byte) 1);
			break;
		case 891:
			Class449.method5418(class668, 2006041984);
			break;
		case 1214:
			Class571.method6929(class668, 684669874);
			break;
		case 214:
			Class225.method3216(class668, 612089158);
			break;
		case 1249:
			Class183_Sub2.method9044(class668, -836355089);
			break;
		case 1208:
			Class521.method6357(class668, -760278446);
			break;
		case 732:
			Class186.method2777(class668, 2009248995);
			break;
		case 37:
			Class35.method822(class668, (byte) -13);
			break;
		case 212:
			Class64.method1060(class668, (byte) 61);
			break;
		case 671:
			Class205_Sub4.method9056(class668, 951319957);
			break;
		case 1028:
			Class571.method6927(class668, 744777336);
			break;
		case 632:
			Class55.method951(class668, -1314173427);
			break;
		case 942:
			Class653.method7880(class668, -1571922977);
			break;
		case 1207:
			Class590.method7100(class668, 373852831);
			break;
		case 665:
			Class444.method5396(class668, -1212369417);
			break;
		case 1202:
			Class287.method3912(class668, -2108852484);
			break;
		case 360:
			Class333_Sub1.method9164(class668, -734766984);
			break;
		case 605:
			Class412.method5013(class668, (short) -7004);
			break;
		case 1232:
			Class618.method7389(class668, -847675702);
			break;
		case 601:
			Class520.method6349(class668, 442577768);
			break;
		case 818:
			Class141.method1710(class668, 2023710189);
			break;
		case 1261:
			Class202.method2926(class668, (byte) 2);
			break;
		case 1093:
			Class260.method3616(class668, -2119950577);
			break;
		case 231:
			Class312.method4184(class668, (byte) 23);
			break;
		case 394:
			Class94.method1290(class668, 1390437209);
			break;
		case 599:
			Class209.method2979(class668, -989431627);
			break;
		case 757:
			Class193.method2850(class668, (short) 255);
			break;
		case 86:
			Class472.method5733(class668, -566903035);
			break;
		case 103:
			Class388.method4848(class668, 1429621004);
			break;
		case 122:
			Class184_Sub2.method8669(class668, 2033372074);
			break;
		case 1243:
			Class684.method8108(class668, -2041061484);
			break;
		case 886:
			Class5.method582(class668, 185282800);
			break;
		case 569:
			Class470.method5707(class668, (byte) 1);
			break;
		case 141:
			Class521_Sub3.method9345(class668, 1910376870);
			break;
		case 509:
			Class581.method7021(class668, -1857785490);
			break;
		case 1241:
			Class392_Sub3.method9308(class668, (byte) 6);
			break;
		case 226:
			Class27.method758(class668, 1165943921);
			break;
		case 718:
			Class404.method4934(class668, 1437218521);
			break;
		case 954:
			Class417.method5035(class668, -1616812394);
			break;
		case 247:
			Class411.method5002(class668, 32210463);
			break;
		case 524:
			Class601.method7166(class668, -725583309);
			break;
		case 872:
			Class509.method6182(class668, (byte) -45);
			break;
		case 363:
			Class451.method5430(class668, (short) 255);
			break;
		case 1172:
			Class658.method7950(class668, 146413065);
			break;
		case 783:
			Class205_Sub11.method9069(class668, 1410692514);
			break;
		case 746:
			Class584.method7044(class668, 1741817547);
			break;
		case 953:
			Class543.method6580(class668, -1109847117);
			break;
		case 476:
			Class322.method4250(class668, 2138905198);
			break;
		case 1186:
			Class374.method4781(class668, -330121808);
			break;
		case 106:
			Class306.method4132(class668, -795768090);
			break;
		case 224:
			Class560.method6829(class668, -889860474);
			break;
		case 1150:
			Class24.method725(class668, 2120058719);
			break;
		case 830:
			Class353.method4645(class668, -2063837749);
			break;
		case 321:
			Class380.method4807(class668, (byte) -16);
			break;
		case 475:
			Class516.method6327(class668, (byte) -24);
			break;
		case 1008:
			Class221.method3111(class668, (byte) 126);
			break;
		case 809:
			Class27.method762(class668, 1295278533);
			break;
		case 514:
			Class682.method8092(class668, -730420723);
			break;
		case 261:
			Class254.method3539(class668, 787376662);
			break;
		case 988:
			Class608.method7257(class668, (byte) -18);
			break;
		case 1164:
			Class562.method6864(class668, (byte) 9);
			break;
		case 337:
			Class319.method4239(class668, (byte) 0);
			break;
		case 329:
			Class637_Sub2.method10054(class668, -54553192);
			break;
		case 1145:
			Class188.method2793(class668, -984704402);
			break;
		case 1190:
			Class514.method6237(class668, (byte) 26);
			break;
		case 1011:
			Class93.method1236(class668, (byte) 48);
			break;
		case 1179:
			Class329.method4318(class668, (byte) -47);
			break;
		case 281:
			Class234.method3341(class668, 452091178);
			break;
		case 426:
			Class335.method4370(class668, -1296881477);
			break;
		case 1035:
			Class160.method1959(class668, (short) 255);
			break;
		case 1242:
			Class61.method1042(class668, -865062694);
			break;
		case 758:
			Class684.method8106(class668, 1653361229);
			break;
		case 927:
			Class47.method913(class668, -895009488);
			break;
		case 566:
			Class301.method4094(class668, 17864377);
			break;
		case 376:
			Class575.method6999(class668, (byte) 2);
			break;
		case 711:
			Class476.method5749(class668, -862635229);
			break;
		case 275:
			Class540.method6520(class668, -845712889);
			break;
		case 701:
			Class21.method709(class668, 930598196);
			break;
		case 1198:
			Class333_Sub3_Sub3.method10634(class668, 44555059);
			break;
		case 162:
			Class100.method1337(class668, -1156441224);
			break;
		case 271:
			Class266.method3693(class668, -761754092);
			break;
		case 474:
			Class553.method6769(class668, 755711350);
			break;
		case 313:
			Class386.method4845(class668, (byte) 117);
			break;
		case 691:
			Class459.method5519(class668, -379999159);
			break;
		case 50:
			Class248.method3448(class668, -2130615297);
			break;
		case 227:
			Class40.method871(class668, 217803093);
			break;
		case 380:
			Class536_Sub30.method9640(class668, 2003030026);
			break;
		case 1117:
			Class292.method3966(class668, -1778220562);
			break;
		case 912:
			Class664.method7996(class668, -2080780590);
			break;
		case 752:
			Class567.method6919(class668, 535840638);
			break;
		case 657:
			Class274.method3734(class668, (byte) -31);
			break;
		case 115:
			Class106.method1425(class668, 2053554644);
			break;
		case 1060:
			Class417.method5038(class668, -1903216972);
			break;
		case 219:
			Class101.method1358(class668, (byte) 27);
			break;
		case 716:
			Class432.method5186(class668, 2064238369);
			break;
		case 1031:
			Class446.method5399(class668, 1758128080);
			break;
		case 726:
			Class523.method6404(class668, -1694737976);
			break;
		case 508:
			Class625.method7450(class668, 1254669251);
			break;
		case 105:
			Class484.method5844(class668, -1818696136);
			break;
		case 879:
			Class92.method1232(class668, (byte) 89);
			break;
		case 339:
			Class554.method6784(class668, -449031566);
			break;
		case 520:
			Class20.method703(class668, (byte) -2);
			break;
		case 68:
			Class310.method4173(class668, (byte) -7);
			break;
		case 327:
			Class647.method7815(class668, 530857495);
			break;
		case 483:
			Class699.method8236(class668, 2097630206);
			break;
		case 320:
			Class654.method7882(class668, (byte) 40);
			break;
		case 383:
			Class4.method571(class668, -1637240121);
			break;
		case 936:
			Class297.method4005(class668, (short) -4520);
			break;
		case 446:
			Class500.method6027(class668, 765889018);
			break;
		case 672:
			Class536_Sub30.method9638(class668, -2120976947);
			break;
		case 1193:
			Class622.method7418(class668, (byte) -82);
			break;
		case 177:
			Class458.method5501(class668, -2046982572);
			break;
		case 742:
			Class467.method5693(class668, 1940749771);
			break;
		case 1086:
			Class289.method3919(class668, (byte) 16);
			break;
		case 1254:
			Class231.method3318(class668, 1995743162);
			break;
		case 875:
			Class402.method4928(class668, 287019756);
			break;
		case 158:
			Class243.method3404(class668, -1411037171);
			break;
		case 633:
			Class62.method1054(class668, -1120375951);
			break;
		case 1246:
			Class252.method3519(class668, 234729866);
			break;
		case 835:
			Class536_Sub22_Sub4.method10657(class668, 1930515362);
			break;
		case 489:
			Class569.method6923(class668, (byte) -108);
			break;
		case 169:
			Class636.method7620(class668, -1242753629);
			break;
		case 937:
			Class202.method2923(class668, (byte) 104);
			break;
		case 1107:
			Class522.method6384(class668, -1916203271);
			break;
		case 415:
			Class469.method5699(class668, -1511572977);
			break;
		case 1136:
			Class587.method7081(class668, -151227232);
			break;
		case 195:
			Class662.method7986(class668, -1122917522);
			break;
		case 997:
			Class93.method1239(false, class668, (short) 26744);
			break;
		case 375:
			Class640.method7669(class668, (short) 17669);
			break;
		case 305:
			Class161.method1967(class668, (byte) 47);
			break;
		case 1212:
			Class320.method4241(class668, -2137672352);
			break;
		case 471:
			Class430.method5163(class668, 1026712209);
			break;
		case 240:
			Class457.method5489(class668, (byte) 0);
			break;
		case 377:
			Class110.method1452(class668, -1835225080);
			break;
		case 856:
			Class360_Sub1.method9271(class668, 501835161);
			break;
		case 217:
			Class316.method4217(class668, (short) -20644);
			break;
		case 110:
			Class603.method7198(class668, 1600237685);
			break;
		case 1040:
			Class628.method7493(class668, 1846172018);
			break;
		case 978:
			Class566.method6892(class668, 2071705877);
			break;
		case 704:
			Class103.method1374(class668, -835374742);
			break;
		case 922:
			Class188.method2791(class668, 1933392010);
			break;
		case 499:
			IComponentSettings.method9499(class668, (byte) 0);
			break;
		case 778:
			Class528.method6435(class668, 1472260417);
			break;
		case 157:
			Class553.method6770(class668, (byte) 83);
			break;
		case 253:
			ChunkSceneSubPackets.method4968(class668, -1283784853);
			break;
		case 216:
			Class236.method3347(class668, 1218014554);
			break;
		case 1072:
			Class257.method3543(class668, (byte) 72);
			break;
		case 935:
			OutgoingPacket.method5028(class668, (byte) -73);
			break;
		case 457:
			Class440.method5327(class668, 1314177717);
			break;
		case 576:
			Class688.method8172(class668, (byte) -127);
			break;
		case 470:
			Class495.method5994(class668, 1128882488);
			break;
		case 1229:
			Class526.method6422(class668, false, -1788254869);
			break;
		case 20:
			Class67_Sub1.method9802(class668, 99387797);
			break;
		case 347:
			Class500.method6028(class668, -1590475448);
			break;
		case 1009:
			Class552.method6691(class668, (byte) 1);
			break;
		case 724:
			Class512.method6213(class668, -1292050669);
			break;
		case 57:
			Class705.method8273(class668, (byte) 1);
			break;
		case 228:
			Class49.method925(class668, -1222723827);
			break;
		case 1018:
			Class40.method874(class668, 809685857);
			break;
		case 852:
			Class710_Sub12.method10041(class668, (byte) 75);
			break;
		case 1033:
			Class600.method7161(class668, 148606604);
			break;
		case 871:
			Class298.method4014(class668, (byte) 90);
			break;
		case 330:
			Class578.method7006(class668, (byte) 0);
			break;
		case 278:
			Class631.method7531(class668, -1954697798);
		}
	}

	static final void method7124(Class668 class668, int i) {
		Class153 class153 = (Class153) (class668.aClass536_Sub18_Sub16_8547.anObjectArray11796[-1640738851 * class668.anInt8564]);
		Interface19 interface19 = ((Interface19) (0 == class668.anIntArray8537[class668.anInt8564 * -1640738851] ? class668.aMap8557.get(class153.aClass458_1717) : class668.aMap8558.get(class153.aClass458_1717)));
		Class478 class478 = class153.aClass453_1716.method5437(65280);
		if (class478 == Class478.aClass478_5385)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = interface19.method99(class153, 2133615493);
		else if (class478 == Class478.aClass478_5388)
			class668.aLongArray8565[(class668.anInt8546 += 1792517805) * 1346022693 - 1] = interface19.method102(class153, -1872340515);
		else if (Class478.aClass478_5387 == class478) {
			try {
				String string = (String) interface19.method104(class153, (byte) -55);
				if (string == null)
					string = "null";
				class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = string;
			} catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		} else
			throw new RuntimeException();
	}

	static final void method7125(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class99.method1327(class251, class234, class668, 1774718082);
	}

	public static void method7126(boolean bool, int i) {
		Class542_Sub1.aBool10718 = bool;
	}
}
