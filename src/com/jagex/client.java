/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;

import javax.imageio.ImageIO;

import jaclib.ping.Ping;

public final class client extends Class505 {
	static int anInt10983;
	public static boolean aBool10984;
	static boolean aBool10985;
	static String aString10986;
	public static int anInt10987;
	public static int anInt10988;
	public static boolean aBool10989;
	public static int anInt10990;
	public static int anInt10991;
	public static InterfaceDefinitions aClass251_10992;
	public static int anInt10993;
	public static boolean aBool10994;
	public static boolean aBool10995;
	static String aString10996;
	public static int anInt10997;
	static String aString10998;
	static boolean aBool10999;
	static boolean aBool11000;
	static boolean aBool11001;
	public static int anInt11002;
	static int anInt11003;
	static String aString11004;
	public static String aString11005;
	static int[] anIntArray11006;
	static int anInt11007;
	public static Class4 aClass4_11008;
	static int anInt11009;
	static boolean aBool11010;
	public static boolean aBool11011;
	static boolean aBool11012;
	public static int anInt11013;
	public static int cycles;
	public static boolean aBool11015;
	static int anInt11016;
	public static int anInt11017;
	static boolean aBool11018;
	public static Class661 aClass661_11019;
	public static Class103[] aClass103Array11020;
	public static Class526[] aClass526Array11021;
	static final int anInt11022 = -754974720;
	static boolean aBool11023;
	static int[] anIntArray11024;
	static long aLong11025;
	public static boolean aBool11026;
	public static int anInt11027;
	static int anInt11028;
	static boolean[] aBoolArray11029;
	static int anInt11030;
	static int anInt11031;
	static final int anInt11032 = 130;
	public static int anInt11033;
	public static Interface63[] anInterface63Array11034;
	static int anInt11035;
	public static int anInt11036;
	public static Interface63[] anInterface63Array11037;
	public static Color[] aColorArray11038;
	public static Color[] aColorArray11039;
	static int anInt11040;
	public static int handshakeStage;
	static int anInt11042;
	public static Class670 aClass670_11043 = null;
	public static Class536_Sub13[] aClass536_Sub13Array11044;
	static Class199 aClass199_11045;
	static String aString11046;
	public static int anInt11047;
	static Class199 aClass199_11048;
	public static Interface28 anInterface28_11049;
	public static Class4 aClass4_11050;
	static int[] anIntArray11051;
	public static int anInt11052;
	public static int anInt11053;
	public static int anInt11054;
	static int anInt11055;
	static int anInt11056;
	public static InterfaceDefinitions aClass251_11057;
	public static Color[] aColorArray11058;
	static int[] anIntArray11059;
	static final int anInt11060 = 64;
	static int anInt11061;
	public static Class106[] aClass106Array11062;
	static int anInt11063;
	static boolean aBool11064;
	public static int anInt11065;
	public static Class515 aClass515_11066;
	public static volatile boolean aBool11067;
	public static Object anObject11068;
	public static Object anObject11069;
	public static int[] anIntArray11070;
	public static int anInt11071;
	static int anInt11072;
	public static int anInt11073;
	public static int anInt11074;
	static final int anInt11075 = 100;
	static int anInt11076;
	public static Class708 aClass708_11077;
	public static boolean aBool11078;
	public static int anInt11079;
	public static int anInt11080;
	static final int anInt11081 = 400;
	public static int anInt11082;
	public static int anInt11083;
	public static int anInt11084;
	public static int anInt11085;
	static int[] anIntArray11086;
	static int[] anIntArray11087;
	public static Class231 aClass231_11088;
	static int[] anIntArray11089;
	static int anInt11090;
	static int anInt11091;
	static int anInt11092;
	static int anInt11093;
	static int anInt11094;
	static int anInt11095;
	static int anInt11096;
	static int[] anIntArray11097;
	static int anInt11098;
	static int anInt11099;
	static String[] aStringArray11100;
	public static int anInt11101;
	public static final int anInt11102 = 106;
	public static boolean aBool11103;
	static int anInt11104;
	static int[] anIntArray11105;
	public static float aFloat11106;
	static float aFloat11107;
	public static String aString11108;
	static boolean aBool11109;
	static Class433 aClass433_11110;
	public static int anInt11111;
	static int anInt11112;
	public static Interface64 anInterface64_11113;
	public static int anInt11114;
	public static final int anInt11115 = 2;
	static final int anInt11116 = 65535;
	public static int[][][] anIntArrayArrayArray11117;
	public static int anInt11118;
	public static int anInt11119;
	static boolean aBool11120;
	static boolean aBool11121;
	public static int anInt11122;
	public static boolean aBool11123;
	static int anInt11124;
	static final int anInt11125 = 5;
	static boolean aBool11126;
	public static int anInt11127;
	static int[] anIntArray11128;
	static int[] anIntArray11129;
	static int anInt11130;
	static Class695 aClass695_11131;
	static int anInt11132;
	public static float[] aFloatArray11133;
	static int anInt11134;
	static int anInt11135;
	static boolean aBool11136;
	public static String aString11137;
	static Class24 aClass24_11138;
	static int[] anIntArray11139;
	static final int anInt11140 = 0;
	static final int anInt11141 = 1;
	static final int anInt11142 = 77;
	static final int anInt11143 = 63;
	static int anInt11144;
	static int[] anIntArray11145;
	static int[] anIntArray11146;
	public static boolean aBool11147;
	static long aLong11148;
	static final int anInt11149 = 5439488;
	static int anInt11150;
	static final int anInt11151 = 400;
	public static int anInt11152;
	public static int anInt11153;
	public static final int anInt11154 = 2048;
	public static Player[] aClass649_Sub1_Sub5_Sub1_Sub2Array11155;
	public static int anInt11156;
	static Map aMap11157;
	public static int anInt11158;
	public static boolean aBool11159;
	public static int anInt11160;
	static Random aRandom11161;
	public static int anInt11162;
	public static boolean aBool11163;
	public static int anInt11164;
	static Class634 aClass634_11165;
	public static boolean aBool11166;
	static final int anInt11167 = 8;
	static short[] aShortArray11168;
	static int[] anIntArray11169;
	public static Class4 aClass4_11170;
	static boolean[] aBoolArray11171;
	static boolean aBool11172;
	static final int anInt11173 = 9633792;
	public static Class708 aClass708_11174;
	public static Class4 aClass4_11175;
	public static Class695 aClass695_11176;
	static int[] anIntArray11177;
	public static int anInt11178;
	static int anInt11179;
	static int anInt11180;
	static Class708 aClass708_11181;
	public static int anInt11182;
	static int anInt11183;
	static int anInt11184;
	public static String aString11185;
	public static String aString11186;
	public static volatile int anInt11187;
	public static boolean aBool11188;
	static int anInt11189;
	static int[] anIntArray11190;
	static long aLong11191;
	public static int anInt11192;
	static boolean aBool11193;
	static boolean aBool11194;
	public static InterfaceDefinitions aClass251_11195;
	public static Interface51 anInterface51_11196;
	static boolean aBool11197;
	static Class443 aClass443_11198;
	public static InterfaceDefinitions aClass251_11199;
	public static boolean aBool11200;
	static int anInt11201;
	static InterfaceDefinitions aClass251_11202;
	public static int anInt11203;
	static int anInt11204;
	static int anInt11205;
	static int anInt11206;
	static int anInt11207;
	static boolean aBool11208;
	static int anInt11209;
	static int anInt11210;
	public static int[] anIntArray11211;
	static int anInt11212;
	public static int anInt11213;
	static boolean aBool11214;
	public static int anInt11215;
	public static int anInt11216;
	static final int anInt11217 = 4095;
	public static Class106 aClass106_11218;
	static int anInt11219;
	static int[] anIntArray11220;
	static int anInt11221;
	static int[] anIntArray11222;
	public static boolean aBool11223;
	static int[] anIntArray11224;
	static int anInt11225;
	static int anInt11226;
	static int anInt11227;
	public static boolean aBool11228;
	static int anInt11229;
	static final int anInt11230 = -771751936;
	static int anInt11231;
	static int anInt11232;
	static List aList11233;
	static int anInt11234;
	static long[] aLongArray11235;
	public static int anInt11236;
	static long aLong11237;
	static int anInt11238;
	static int anInt11239;
	public static boolean[] aBoolArray11240;
	static Class708 aClass708_11241;
	public static boolean aBool11242;
	static Class4 aClass4_11243;
	static boolean aBool11244;
	static int anInt11245;
	static int anInt11246;
	static int anInt11247;
	public static int anInt11248;
	static Rectangle[] aRectangleArray11249;
	public static Class708 aClass708_11250;
	static int[] anIntArray11251;
	static int anInt11252;
	static final int anInt11253 = 2;
	static int[] anIntArray11254;
	public static short aShort11255;
	static int[] anIntArray11256;
	static Class533[] aClass533Array11257;
	static int[] anIntArray11258;
	public static int anInt11259;
	static final int anInt11260 = 1392508928;
	static int anInt11261;
	static int anInt11262;
	static int anInt11263;
	static int anInt11264;
	public static String aString11265;
	public static Class485[][] aClass485ArrayArray11266;
	static int anInt11267;
	static int anInt11268;
	static float aFloat11269;
	static boolean[] aBoolArray11270;
	public static float aFloat11271;
	static int[] anIntArray11272;
	static int[] anIntArray11273;
	static boolean aBool11274;
	public static short aShort11275;
	public static short aShort11276;
	public static short aShort11277;
	public static short aShort11278;
	public static short aShort11279;
	public static short aShort11280;
	static int anInt11281;
	public static short aShort11282;
	static int anInt11283;
	static int anInt11284;
	public static int anInt11285;
	public static int anInt11286;
	static int anInt11287;
	public static int anInt11288;
	public static int anInt11289;
	public static boolean aBool11290;
	public static Class31[] aClass31Array11291;
	static Class695 aClass695_11292;
	public static int anInt11293;
	static Class433 aClass433_11294;
	public static Class30[] aClass30Array11295;
	static Calendar aCalendar11296;
	static int[] anIntArray11297;
	static int anInt11298;
	static long aLong11299;
	static Class199 aClass199_11300;
	static Map aMap11301;
	static int[] anIntArray11302;
	static boolean aBool11303;
	static boolean aBool11304;
	static final int anInt11305 = 1179648;
	static final int anInt11306 = 5373952;
	static final int anInt11307 = 9568256;
	static final int anInt11308 = 13762560;
	static final int anInt11309 = 301989888;
	static final int anInt11310 = 1375731712;
	static final int anInt11311 = -1845493760;
	static int anInt11312;
	static final int anInt11313 = 1245184;
	static boolean aBool11314;
	public static int[] anIntArray11315;
	static final int anInt11316 = 13828096;
	static final int anInt11317 = 318767104;
	public static int anInt11318;
	static final int anInt11319 = -1828716544;
	static Class199 aClass199_11320;
	static int[] anIntArray11321;
	public static Class106 aClass106_11322;

	static {
		aBool10984 = false;
		aBool10985 = false;
		aString10986 = null;
		anInt10987 = 0;
		anInt10988 = 0;
		aBool10989 = false;
		anInt11017 = 0;
		anInt10991 = 0;
		anInt10990 = 0;
		anInt10993 = 0;
		aBool10994 = false;
		aBool10995 = false;
		aString10996 = null;
		aString11108 = null;
		aString10998 = null;
		aBool11228 = false;
		aBool11000 = false;
		aBool11001 = false;
		anInt11002 = 0;
		anInt11003 = 2088371061;
		aString11004 = null;
		aString11005 = null;
		anInt11101 = 2098417966;
		aClass443_11198 = new Class443();
		aClass433_11110 = new Class433();
		aClass433_11294 = new Class433();
		aLong11237 = 0L;
		aBool11011 = false;
		aBool11012 = true;
		anInt11013 = 0;
		cycles = 0;
		aBool11015 = true;
		aBool11223 = true;
		aBool11314 = false;
		aBool11018 = false;
		anInt11065 = 0;
		aClass103Array11020 = new Class103[8];
		aClass526Array11021 = new Class526[8];
		aBool11103 = false;
		aBool11023 = false;
		aBool11197 = true;
		aLong11025 = (long) (Math.random() * 9.999999999E9) * 6817262481403808529L;
		aBool11026 = false;
		anInt11027 = 0;
		anInt11028 = 0;
		aBool11200 = false;
		aClass708_11250 = new Class708();
		anInt11031 = 0;
		anInt11033 = 0;
		anInterface63Array11034 = new Interface63[130];
		anInt11036 = 0;
		anInterface63Array11037 = new Interface63[77];
		aColorArray11038 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };
		aColorArray11039 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };
		aColorArray11058 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };
		handshakeStage = 0;
		anInt11042 = 0;
		anInt11263 = 0;
		aClass199_11320 = new Class199(8);
		aClass199_11045 = new Class199(8);
		aString11046 = null;
		anInterface51_11196 = new Class69();
		aClass199_11048 = new Class199(16);
		anInterface28_11049 = new Class64();
		aClass4_11050 = new Class4(64);
		aClass536_Sub13Array11044 = new Class536_Sub13[1024];
		anInt11164 = 0;
		anInt11053 = 0;
		anIntArray11211 = new int[1024];
		anInt11055 = 0;
		anIntArray11105 = new int[260];
		anInt11124 = 0;
		anInt11247 = 0;
		anIntArray11059 = new int[1005];
		aClass106_11218 = new Class106();
		aClass106_11322 = new Class106();
		aClass106Array11062 = new Class106[] { aClass106_11322, aClass106_11218 };
		anInt11063 = 0;
		aBool11064 = false;
		aClass661_11019 = new Class661();
		aClass515_11066 = new Class515(false);
		aBool11067 = false;
		anObject11068 = new Object();
		anObject11069 = new Object();
		anIntArray11070 = new int[64];
		anInt11071 = 0;
		anIntArray11315 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
		anInt11052 = 2044763365;
		anInt11074 = -416311143;
		aBool11159 = false;
		anInt11076 = 446199109;
		anInt11112 = 0;
		anInt11114 = 0;
		anInt11079 = 1002800615;
		anInt11080 = 1581042987;
		anInt11213 = -712139825;
		anInt11047 = 0;
		anInt11083 = 0;
		anInt11084 = 0;
		anIntArray11086 = new int[4096];
		anIntArray11087 = new int[4096];
		anIntArray11190 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };
		anInt10983 = 0;
		anInt11090 = 1550571938;
		anInt11091 = 0;
		anInt11092 = -2047507750;
		anInt11093 = 0;
		anInt11094 = 1730374267;
		anInt11095 = 0;
		anInt11096 = 0;
		anInt11104 = -1025456554;
		anInt11098 = 0;
		anInt11099 = -458285263;
		anInt11262 = 0;
		aRandom11161 = new Random();
		anInt11180 = 0;
		anInt11082 = 0;
		anInt11236 = 0;
		aFloat11271 = 1034.0F;
		aFloat11106 = 0.0F;
		aFloat11107 = 0.0F;
		aFloat11269 = 0.0F;
		aBool11109 = false;
		aBool10999 = false;
		anInt11111 = 447129076;
		anInt10997 = -360797336 + -1491302823 * anInt11111;
		aBool11242 = true;
		anInt11312 = 0;
		anIntArrayArrayArray11117 = new int[2][][];
		anInt11192 = -1863105115;
		anInt11119 = -408425903;
		anInt11182 = 0;
		anInt11248 = 0;
		anInt11122 = 0;
		anInt11054 = 0;
		anInt11318 = 0;
		aBool11120 = false;
		aBool11126 = false;
		anInt11127 = 0;
		anIntArray11128 = new int[509];
		anIntArray11129 = new int[503];
		anInt11261 = 0;
		aClass695_11131 = new Class695();
		anInt11132 = 0;
		aFloatArray11133 = new float[3];
		anInt11134 = 0;
		anInt11135 = 0;
		anInt11130 = 0;
		anInt11007 = 0;
		anInt11009 = 0;
		anInt11264 = -214718999;
		anIntArray11051 = new int[2];
		anIntArray11089 = new int[2];
		anIntArray11145 = new int[2];
		anIntArray11146 = new int[2];
		anIntArray11097 = new int[2];
		aLong11148 = 0L;
		aBool11244 = true;
		anInt11150 = -980972320;
		anInt11298 = 331736176;
		anInt11152 = 2081992247;
		anInt11153 = 1576421437;
		aClass649_Sub1_Sub5_Sub1_Sub2Array11155 = new Player[2048];
		anInt11156 = -213831113;
		aMap11157 = new HashMap();
		aBool11290 = false;
		aBool11123 = false;
		anInt11160 = 0;
		anInt11118 = 0;
		aBool11078 = false;
		aBool11163 = false;
		aBool11303 = false;
		aClass634_11165 = Class634.aClass634_8264;
		aBool11166 = false;
		aShortArray11168 = new short[] { 44, 45, 46, 47, 48, 49, 50, 51 };
		anIntArray11169 = new int[8];
		aStringArray11100 = new String[8];
		aBoolArray11171 = new boolean[8];
		anInt11035 = 1003121495;
		aClass4_11170 = new Class4(64);
		aClass708_11174 = new Class708();
		aClass4_11175 = new Class4(16);
		aClass695_11176 = new Class695();
		anInt11040 = 0;
		anInt11178 = 1129214017;
		anInt11179 = -937599055;
		anInt11203 = -479693287;
		anInt11085 = 1031276389;
		aBool11188 = false;
		anInt11183 = -1187709807;
		anInt11184 = 1443325723;
		aString11185 = null;
		aString11186 = null;
		anInt11187 = -2074470025;
		aClass4_11008 = new Class4(8);
		anInt11189 = 0;
		aClass251_11057 = null;
		anInt11216 = 0;
		anInt11158 = 0;
		aBool11010 = false;
		aBool11194 = false;
		aClass251_11195 = null;
		aBool11147 = true;
		aBool11136 = false;
		aClass251_10992 = null;
		aClass251_11199 = null;
		anInt11281 = 0;
		anInt11201 = 0;
		aClass251_11202 = null;
		aBool11274 = false;
		anInt11204 = 1314923761;
		anInt11205 = -310853723;
		anInt11206 = -1553699789;
		anInt11207 = 170432581;
		aBool11208 = false;
		anInt11209 = -851690289;
		anInt11210 = 1568264063;
		aBool11121 = false;
		anInt11212 = 0;
		aBool11193 = false;
		aBool11214 = false;
		anInt11215 = -575680763;
		anIntArray11177 = new int[64];
		anInt11219 = 0;
		anIntArray11220 = new int[64];
		anInt11221 = 0;
		anIntArray11222 = new int[64];
		anInt11056 = 0;
		anIntArray11224 = new int[64];
		anInt11225 = 0;
		anIntArray11297 = new int[64];
		anInt11227 = 0;
		anIntArray11139 = new int[64];
		anInt11229 = 0;
		anInt11162 = 0;
		anInt11231 = 0;
		anInt11232 = 0;
		anInt11226 = 0;
		anInt11234 = 0;
		anInt11144 = 0;
		anInt11030 = 0;
		anInt11268 = 0;
		anInt11238 = 0;
		anInt11239 = 0;
		aClass708_11077 = new Class708();
		aClass708_11241 = new Class708();
		aClass708_11181 = new Class708();
		aClass4_11243 = new Class4(512);
		anInt11245 = 0;
		anInt11246 = -1720669302;
		aBoolArray11240 = new boolean[106];
		aBoolArray11029 = new boolean[106];
		aRectangleArray11249 = new Rectangle[106];
		for (int i = 0; i < 106; i++)
			aRectangleArray11249[i] = new Rectangle();
		anInt11016 = 0;
		anIntArray11251 = new int[4];
		anInt11252 = 0;
		anInt11061 = -399774666;
		anIntArray11254 = new int[anInt11061 * -1712931327];
		anIntArray11258 = new int[anInt11061 * -1712931327];
		anIntArray11256 = new int[-1712931327 * anInt11061];
		aClass533Array11257 = new Class533[anInt11061 * -1712931327];
		anIntArray11024 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
		anInt11259 = 0;
		anInt11073 = 0;
		aLongArray11235 = new long[100];
		anInt11072 = 0;
		aString11137 = null;
		aString11265 = null;
		aClass485ArrayArray11266 = new Class485[3][8];
		anInt11267 = 0;
		aClass24_11138 = new Class24();
		aBoolArray11270 = new boolean[5];
		anIntArray11006 = new int[5];
		anIntArray11272 = new int[5];
		anIntArray11273 = new int[5];
		anIntArray11302 = new int[5];
		aShort11275 = (short) 256;
		aShort11276 = (short) 205;
		aShort11277 = (short) 256;
		aShort11278 = (short) 320;
		aShort11279 = (short) 1;
		aShort11280 = (short) 32767;
		aShort11255 = (short) 1;
		aShort11282 = (short) 32767;
		anInt11283 = 0;
		anInt11284 = 0;
		anInt11285 = 0;
		anInt11286 = 0;
		anInt11287 = 0;
		anInt11288 = 0;
		anInt11289 = 0;
		aClass31Array11291 = new Class31[400];
		aClass695_11292 = new Class695();
		anInt11293 = 0;
		aClass30Array11295 = new Class30[400];
		aCalendar11296 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		anInterface64_11113 = new Class48();
		aLong11191 = 7131540482466414253L;
		aLong11299 = 4401799186768191899L;
		aClass199_11300 = new Class199(8);
		aMap11301 = new HashMap();
		aClass231_11088 = new Class231();
		aBool11172 = false;
		aBool11304 = false;
		anIntArray11321 = new int[4];
		aList11233 = new ArrayList();
	}

	public final void init() {
		if (method6089(-1411037171)) {
			String string = "";
			Class401[] class401s = Class57.method969(-1642299918);
			for (int i = 0; i < class401s.length; i++) {
				Class401 class401 = class401s[i];
				String string_0_ = Class622.anApplet8126.getParameter(class401.aString4190);
				if (null != string_0_) {
					switch (Integer.parseInt(class401.aString4190)) {
					case 39:
						Class353.anInt3740 = Integer.parseInt(string_0_) * -1387464143;
						break;
					case 49:
						Class459.aClass664_5178 = Class664.method7989(Integer.parseInt(string_0_), -894658816);
						break;
					case 8:
						if (string_0_.equalsIgnoreCase(Class40.aString492))
							aBool10984 = true;
						else
							aBool10984 = false;
						break;
					case 34:
						Class522.aString7077 = string_0_;
						break;
					default:
						//Class81.method1165("", new RuntimeException(), (byte) -96);
						break;
					case 14:
						break;
					case 46:
						anInt11017 = Integer.parseInt(string_0_) * -437437047;
						break;
					case 21:
						if (string_0_.equalsIgnoreCase(Class40.aString492))
							aBool11228 = true;
						else
							aBool11228 = false;
						break;
					case 9:
						if (Class23.aClass5_219 == null)
							Class23.aClass5_219 = new Class5();
						Class23.aClass5_219.anInt110 = Integer.parseInt(string_0_) * -1803928197;
						break;
					case 30:
						Class210.aString2260 = string_0_;
						break;
					case 25:
						if (string_0_.equalsIgnoreCase(Class40.aString492))
							aBool11001 = true;
						else
							aBool11001 = false;
						break;
					case 12:
						aString11108 = string_0_;
						break;
					case 40:
						if (string_0_.equalsIgnoreCase(Class40.aString492))
							aBool10985 = true;
						else
							aBool10985 = false;
						break;
					case 51:
						if (Class23.aClass5_220 == null)
							Class23.aClass5_220 = new Class5();
						Class23.aClass5_220.anInt108 = Integer.parseInt(string_0_) * -1753280203;
						break;
					case 43:
						if (string_0_.equals(Class40.aString492))
							aBool11200 = true;
						else
							aBool11200 = false;
						break;
					case 44:
						if (null == Class23.aClass5_220)
							Class23.aClass5_220 = new Class5();
						Class23.aClass5_220.anInt110 = Integer.parseInt(string_0_) * -1803928197;
						break;
					case 17:
						anInt10993 = Integer.parseInt(string_0_) * -374893847;
						break;
					case 16:
						aString11005 = string_0_;
						break;
					case 42:
						break;
					case 31:
						anInt10991 = Integer.parseInt(string_0_) * -697170731;
						break;
					case 45:
						break;
					case 36:
						if (Class23.aClass5_230 == null)
							Class23.aClass5_230 = new Class5();
						Class23.aClass5_230.anInt111 = Integer.parseInt(string_0_) * 1232605419;
						break;
					case 13:
						anInt10987 = Integer.parseInt(string_0_) * -1298837637;
						break;
					case 38:
						if (null == Class23.aClass5_222)
							Class23.aClass5_222 = new Class5();
						Class23.aClass5_222.anInt108 = Integer.parseInt(string_0_) * -1753280203;
						break;
					case 18:
						if (Class23.aClass5_222 == null)
							Class23.aClass5_222 = new Class5();
						Class23.aClass5_222.anInt111 = Integer.parseInt(string_0_) * 1232605419;
						break;
					case 32:
						break;
					case 15:
						aString10996 = string_0_;
						if (aString10996.length() > 100)
							aString10996 = null;
						break;
					case 50:
						if (Class23.aClass5_222 == null)
							Class23.aClass5_222 = new Class5();
						Class23.aClass5_222.anInt110 = Integer.parseInt(string_0_) * -1803928197;
						break;
					case 35:
						anInt10990 = Integer.parseInt(string_0_) * 97502975;
						break;
					case 23:
						anInt11003 = Integer.parseInt(string_0_) * -2088371061;
						break;
					case 47:
						if (string_0_.equalsIgnoreCase(Class40.aString492))
							aBool11000 = true;
						else
							aBool11000 = false;
						break;
					case 27:
						aClass670_11043 = Class72.method1126(Integer.parseInt(string_0_), (byte) -86);
						if (Class670.aClass670_8568 == aClass670_11043)
							Class302.aClass74_3406 = Class74.aClass74_808;
						else
							Class302.aClass74_3406 = Class74.aClass74_814;
						break;
					case 3:
						aString10986 = string_0_;
						break;
					case 28:
						anInt10988 = Integer.parseInt(string_0_) * 1765963605;
						if (247320061 * anInt10988 < 0 || (anInt10988 * 247320061 >= aColorArray11038.length))
							anInt10988 = 0;
						break;
					case 33:
						if (Class23.aClass5_230 == null)
							Class23.aClass5_230 = new Class5();
						Class23.aClass5_230.anInt108 = Integer.parseInt(string_0_) * -1753280203;
						break;
					case 48:
						if (Class23.aClass5_220 == null)
							Class23.aClass5_220 = new Class5();
						Class23.aClass5_220.aString112 = string_0_;
						break;
					case 29:
						if (string_0_.equalsIgnoreCase(Class40.aString492)) {
							/* empty */
						}
						break;
					case 24:
						Class462.aString5220 = string_0_;
						break;
					case 6:
						if (Class23.aClass5_230 == null)
							Class23.aClass5_230 = new Class5();
						Class23.aClass5_230.aString112 = string_0_;
						break;
					case 52:
						if (Class23.aClass5_230 == null)
							Class23.aClass5_230 = new Class5();
						Class23.aClass5_230.anInt110 = Integer.parseInt(string_0_) * -1803928197;
						break;
					case 11:
						string = string_0_;
						break;
					case 1:
						if (string_0_.equalsIgnoreCase(Class40.aString492))
							aBool11290 = true;
						break;
					case 26:
						if (Class23.aClass5_219 == null)
							Class23.aClass5_219 = new Class5();
						Class23.aClass5_219.aString112 = string_0_;
						break;
					case 5:
						if (string_0_.equals(Class40.aString492))
							aBool10989 = true;
						else
							aBool10989 = false;
						break;
					case 10:
						aString10998 = string_0_;
						break;
					case 2:
						if (null == Class23.aClass5_219)
							Class23.aClass5_219 = new Class5();
						Class23.aClass5_219.anInt111 = Integer.parseInt(string_0_) * 1232605419;
						break;
					case 20:
						Class47.aClass678_578 = (Class678) (Class682.method8091(Class678.method8057(-1838826521), Integer.parseInt(string_0_), 1858049507));
						if (Class47.aClass678_578 == Class678.aClass678_8616)
							Class47.aClass678_578 = Class678.aClass678_8613;
						else if (!(Class47.aClass678_578.method8055(Class672.aClass672_8576, (byte) 1)) && (Class678.aClass678_8619 != Class47.aClass678_578))
							Class47.aClass678_578 = Class678.aClass678_8619;
						break;
					case 4:
						if (null == Class23.aClass5_219)
							Class23.aClass5_219 = new Class5();
						Class23.aClass5_219.anInt108 = Integer.parseInt(string_0_) * -1753280203;
						break;
					case 7:
						Class314.anInt3504 = Integer.parseInt(string_0_) * 935130637;
						break;
					case 37:
						if (Class23.aClass5_220 == null)
							Class23.aClass5_220 = new Class5();
						Class23.aClass5_220.anInt111 = Integer.parseInt(string_0_) * 1232605419;
						break;
					case 22:
						aString11004 = string_0_;
						break;
					case 41:
						Class254.aClass702_2755 = Class219.method3102(Integer.parseInt(string_0_), -1663136534);
						if (Class702.aClass702_8796 != Class254.aClass702_2755 && (Class702.aClass702_8798 != Class254.aClass702_2755) && (Class702.aClass702_8797 != Class254.aClass702_2755) && (Class702.aClass702_8799 != Class254.aClass702_2755))
							Class254.aClass702_2755 = Class702.aClass702_8799;
					}
				}
			}
			if (aString10986 == null)
				aString10986 = "";
			Class496 class496 = new Class496(-125739413 * anInt11152, -358673315 * anInt11153, -1899946153 * anInt11150, 1408494455 * anInt11298, aClass670_11043.aString8574);
			Class313.aclient3500 = this;
			String string_1_ = Class254.aClass702_2755.aString8801;
			int i = 32 + -1165196251 * Class254.aClass702_2755.anInt8800;
			if (!string.equals("")) {
				string_1_ = new StringBuilder().append(string_1_).append("_").append(string).toString();
				i = 0;
			}
			method6081(class496, aClass670_11043.aString8573, string_1_, i, Class319.method4240(942052439), 876, 1, aBool11001, 235175950);
		}
	}

	final void method6096(byte i) {
		if (anInt11101 * -708374433 != 2) {
			if ((12 == anInt11101 * -708374433 || Class566.method6895(-708374433 * anInt11101, 1821020689) || Class233.method3334(-708374433 * anInt11101, (byte) -31)) && Class184_Sub2.aClass211_9442 != null)
				Class184_Sub2.aClass211_9442.method3010(Class184_Sub2.aClass211_9442.method3059((byte) 84), Class710.aClass536_Sub40_8843.aClass710_Sub35_10790.method10213(-466085069), 250797117);
			if (aBool11067) {
				synchronized (anObject11069) {
					anObject11069.notify();
				}
				synchronized (anObject11068) {
					try {
						anObject11068.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool11067 = false;
			}
			cycles++;
			if (cycles % 1000 == 1) {
				GregorianCalendar gregoriancalendar = new GregorianCalendar();
				Class458_Sub4.anInt10337 = (gregoriancalendar.get(11) * 600 + gregoriancalendar.get(12) * 10 + gregoriancalendar.get(13) / 6);
				aRandom11161.setSeed((long) Class458_Sub4.anInt10337);
			}
			long l = Class249.method3450(1760472850);
			aClass106_11322.method1410(285568722);
			aClass106_11218.method1410(1570725448);
			method10372((byte) 0);
			if (null != Class290.aClass426_3223)
				Class290.aClass426_3223.method5125(-1758102811);
			if (Class184_Sub2.aClass211_9442 != null)
				Class184_Sub2.aClass211_9442.method2987((short) 13562);
			Class331_Sub2.aClass549_10049.method6637(286407033);
			Class329.aClass550_3601.method6651(-864189975);
			Class295.method3977(Class677.aClass167_8609, l);
			method10383(-853598984);
			if (Class677.aClass167_8609 != null)
				Class677.aClass167_8609.method2007((int) l);
			anInt11033 = 0;
			anInt11036 = 0;
			for (Interface63 interface63 = Class331_Sub2.aClass549_10049.method6640(612307069); interface63 != null; interface63 = Class331_Sub2.aClass549_10049.method6640(612307069)) {
				int i_2_ = interface63.method373((byte) 61);
				if (2 == i_2_ || i_2_ == 3) {
					if (anInt11033 * -1816034791 < 130) {
						anInterface63Array11034[anInt11033 * -1816034791] = interface63;
						anInt11033 += 1893513769;
					}
				} else if (i_2_ == 0) {
					if (Class54.method942(-208070002) && interface63.method413(570551940) == 28) {
						if (423156687 * anInt11160 >= 2 && Class331_Sub2.aClass549_10049.method6638(82, (byte) 0)) {
							if (Class70.method1117(327619023))
								Class316.method4218(-2076318706);
							else
								Class294.method3971(Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method190(147366573), (byte) 24);
						} else if (Class44.method882(259854151) && (Class710.aClass536_Sub40_8843.aClass710_Sub30_10786.method10180(-1647630198) == 0 || Class331_Sub2.aClass549_10049.method6638(86, (byte) 0)))
							Class98_Sub1.method8393(359282232);
						else if (Class710.aClass536_Sub40_8843.aClass710_Sub30_10786.method10180(-1647630198) == 0 || Class331_Sub2.aClass549_10049.method6638(86, (byte) 0))
							Class167.method2414(355094633);
						else
							Class269.method3710((Class38.aClass38_453.method840(Class459.aClass664_5178, 2087486238)), (byte) -113);
					}
					if (anInt11036 * -1621465757 < 77) {
						anInterface63Array11037[-1621465757 * anInt11036] = interface63;
						anInt11036 += -1829616565;
					}
				}
			}
			anInt11031 = 0;
			for (Class536_Sub31 class536_sub31 = Class329.aClass550_3601.method6659((byte) 68); null != class536_sub31; class536_sub31 = Class329.aClass550_3601.method6659((byte) -81)) {
				int i_3_ = class536_sub31.method9642(-1689046271);
				if (i_3_ == -1)
					Class523.method6400(class536_sub31, (short) -12761);
				else if (6 == i_3_) {
					anInt11031 += class536_sub31.method9644(-343267839) * 241652841;
					class536_sub31.method9641(-1817197656);
				} else if (Class160.method1960(i_3_, (byte) 69)) {
					aClass708_11250.method8335(class536_sub31, -1852038058);
					if (aClass708_11250.method8339((byte) 122) > 10) {
						Class536_Sub31 class536_sub31_4_ = ((Class536_Sub31) aClass708_11250.method8305(-2031604621));
						if (class536_sub31_4_ != null)
							class536_sub31_4_.method9641(-1540503225);
					}
				}
			}
			if (Class44.method882(243498528))
				Class624.method7427((byte) 46);
			if (Class482.method5837(-708374433 * anInt11101, 1128163784)) {
				Class3.method554(-2112368911);
				Class444.method5392(210181676);
			} else if (Class578.method7007(-708374433 * anInt11101, -387349523))
				aClass515_11066.method6271(1988652390);
			if (Class566.method6895(anInt11101 * -708374433, -430748811) && !Class578.method7007(anInt11101 * -708374433, -656952535)) {
				method10374(1510506421);
				Class154.method1871(-1503392045);
				Class283.handleLogin(-193266476);
			} else if (Class233.method3334(anInt11101 * -708374433, (byte) -82) && !Class578.method7007(anInt11101 * -708374433, 1955319672)) {
				method10374(1713360562);
				Class283.handleLogin(-1184448458);
			} else if (4 == anInt11101 * -708374433)
				Class283.handleLogin(123021423);
			else if (Class426.method5129(anInt11101 * -708374433, 1603352511) && !Class578.method7007(anInt11101 * -708374433, 778144345))
				Class678.method8062(-708236199);
			else if (17 == -708374433 * anInt11101 || 19 == anInt11101 * -708374433) {
				Class283.handleLogin(-1231138478);
				if (-3 != 1063476305 * Class61.anInt687 && 1063476305 * Class61.anInt687 != 2 && 15 != Class61.anInt687 * 1063476305) {
					if (-708374433 * anInt11101 == 19) {
						Class61.anInt690 = 1717456075 * Class61.anInt693;
						Class61.anInt689 = Class61.anInt651 * 1842886491;
						Class61.anInt688 = Class61.anInt687 * 1466930321;
						if (Class710_Sub1.aBool10815) {
							Class554.method6786(1318197187 * Class195.aClass5_2200.anInt111, Class195.aClass5_2200.aString112, Class195.aClass5_2200.anInt110 * -843966029, Class195.aClass5_2200.anInt108 * -910853859, -887771298);
							aClass106_11322.method1412(833605579);
							Class673.method8026(17, -1798113843);
						} else
							Class275.method3737(Class61.aBool653, -1932195958);
					} else
						Class275.method3737(false, -1090735149);
				}
			}
			Class699.method8235(Class677.aClass167_8609, 1588869959);
			aClass708_11250.method8305(-1038654557);
			if (null != Class677.aClass167_8609) {
				Iterator iterator = aMap11301.entrySet().iterator();
				while (iterator.hasNext()) {
					Map.Entry entry = (Map.Entry) iterator.next();
					Class114 class114 = (Class114) entry.getValue();
					if (class114.method1476(-1983087405)) {
						byte[] is = class114.method1477(-1513664771);
						if (null != is) {
							try {
								BufferedImage bufferedimage = ImageIO.read(new ByteArrayInputStream(is));
								int[] is_5_ = Class66.method1077(bufferedimage, -1755254907);
								Class143 class143 = (Class677.aClass167_8609.method2081(is_5_, 0, bufferedimage.getWidth(), bufferedimage.getWidth(), bufferedimage.getHeight(), (byte) -117));
								aClass199_11300.method2881(class143, (long) ((Integer) entry.getKey()).intValue());
							} catch (IOException ioexception) {
								Class81.method1165(Class313.aclient3500.method6092(1836620767), ioexception, (byte) -26);
							}
						}
						iterator.remove();
					}
				}
			}
		}
	}

	final void method6109(byte i) {
		if (2 != -708374433 * anInt11101) {
			long l = (Class614.method7323(1210987849) / 1000000L - 8534821430371810531L * aLong11237);
			aLong11237 = (Class614.method7323(178215200) / 1000000L * -6183332289911379765L);
			if (Class536_Sub37.method9820(-708374433 * anInt11101, 1733394435)) {
				if (0L != aLong11148 * 8767938331932336319L && (Class249.method3450(1441485712) > aLong11148 * 8767938331932336319L))
					Class15.method640(Class315.method4212((byte) 122), -1, -1, false, -1452054405);
				else if (!Class677.aClass167_8609.method2010() && aBool6865)
					Class388.method4851(646586935);
			}
			if (null == Class223.aFrame2336)
				Class205_Sub1.method9054(433796645);
			if (Class707.aBool8822 && null != Class223.aFrame2336 && !Class67_Sub1.aBool10601 && Class536_Sub37.method9820(anInt11101 * -708374433, 89982216))
				Class15.method640(Class710.aClass536_Sub40_8843.aClass710_Sub12_10769.method10038(-1409947466), -1, -1, false, -2102098254);
			boolean bool = false;
			if (aBool6889) {
				aBool6889 = false;
				bool = true;
			}
			if (bool)
				Class477.method5751((byte) -64);
			if ((null != Class677.aClass167_8609 && Class677.aClass167_8609.method2010()) || Class315.method4212((byte) 107) != 1)
				Class552.method6692(-1739759547);
			if (Class482.method5837(-708374433 * anInt11101, -1704172889))
				Class560.method6828(bool, (byte) 103);
			else if (Class285.method3842(anInt11101 * -708374433, 1873689221))
				Class66.method1076(-1703647591);
			else if (Class270.method3716(-708374433 * anInt11101, -1992047222))
				Class66.method1076(1161039267);
			else if (Class578.method7007(anInt11101 * -708374433, 2027601583)) {
				if (aClass515_11066.method6298(-2089480711) == Class516.aClass516_7036) {
					int i_6_ = aClass515_11066.method6242((byte) -100) / 2;
					Class306.method4120(new StringBuilder().append(Class38.aClass38_402.method840(Class459.aClass664_5178, 1446669138)).append(Class40.aString496).append("(").append(i_6_).append("%)").toString(), true, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
				} else if (aClass515_11066.method6298(-2089480711) == Class516.aClass516_7038) {
					int i_7_ = 50 + aClass515_11066.method6257(-2104704893) / 2;
					Class306.method4120(new StringBuilder().append(Class38.aClass38_402.method840(Class459.aClass664_5178, 1917937501)).append(Class40.aString496).append("(").append(i_7_).append("%)").toString(), true, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
				} else
					Class306.method4120(Class38.aClass38_402.method840(Class459.aClass664_5178, 2099732590), true, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
			} else if (9 == -708374433 * anInt11101)
				Class315.method4213(l);
			else if (-708374433 * anInt11101 == 17)
				Class306.method4120(new StringBuilder().append(Class38.aClass38_415.method840(Class459.aClass664_5178, 1884484574)).append(Class40.aString496).append(Class38.aClass38_405.method840(Class459.aClass664_5178, 2134185323)).toString(), false, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
			else if (19 == anInt11101 * -708374433)
				Class306.method4120(Class38.aClass38_442.method840(Class459.aClass664_5178, 1909968422), false, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
			if (anInt11016 * -176554429 == 3) {
				for (int i_8_ = 0; i_8_ < anInt11245 * -5823823; i_8_++) {
					Rectangle rectangle = aRectangleArray11249[i_8_];
					if (aBoolArray11029[i_8_])
						Class677.aClass167_8609.method2056(rectangle.x, rectangle.y, rectangle.width, rectangle.height, -65281, -1791586879);
					else
						Class677.aClass167_8609.method2056(rectangle.x, rectangle.y, rectangle.width, rectangle.height, -16711936, -1049193986);
				}
			}
			if (Class44.method882(705649670))
				Class26.method739(Class677.aClass167_8609, 1847077222);
			if (!Class482.method5837(-708374433 * anInt11101, 1196285489) && !Class578.method7007(-708374433 * anInt11101, 2137963455) && -1 != anInt11187 * -1959825479) {
				try {
					Class677.aClass167_8609.method2084();
					Class204.method2932(Class677.aClass167_8609, Class249.method3450(1526370616), Class144.anInt1679 * -1804846931, Class34_Sub6.anInt10965 * 589116499, -2130607730);
					Class677.aClass167_8609.method2002((byte) 53);
				} catch (Exception_Sub5 exception_sub5) {
					Class81.method1165(new StringBuilder().append(exception_sub5.getMessage()).append(" ").append(method6092(1788051038)).toString(), exception_sub5, (byte) 41);
					switch (Class710.aClass536_Sub40_8843.aClass710_Sub15_10767.method10071(254962375)) {
					case 3:
						Class560.method6827(exception_sub5.method10533(1510775706), (byte) -26);
						Class704.method8264(1, false, (byte) 80);
						break;
					default:
						Class704.method8264(0, false, (byte) 47);
					}
				}
			}
			int i_9_ = Class710.aClass536_Sub40_8843.aClass710_Sub26_10758.method10149(-664631943);
			if (i_9_ == 0)
				Class212.method3067(15L);
			else if (1 == i_9_)
				Class212.method3067(10L);
			else if (2 == i_9_)
				Class212.method3067(5L);
			else if (i_9_ == 3)
				Class212.method3067(2L);
			if (aBool11103)
				Class679.method8065((byte) 77);
			if (Class710.aClass536_Sub40_8843.aClass710_Sub39_10783.method10236(-2075932782) == 1 && 16 == -708374433 * anInt11101 && -1 != anInt11187 * -1959825479) {
				Class710.aClass536_Sub40_8843.method9857(Class710.aClass536_Sub40_8843.aClass710_Sub39_10783, 0, (byte) 1);
				Class27.method763(1915382938);
			}
		}
	}

	final void method6097(int i) {
		if (Class590.aClass147_Sub1_7791 != null && Class590.aClass147_Sub1_7791.aBool8886)
			Class567.method6918(620403414);
		Class187.method2779((byte) 6);
		Class502.method6040(-169171215);
		if (null != Class677.aClass167_8609)
			Class677.aClass167_8609.method2005(778784407);
		if (Class707.aBool8822 && null != Class223.aFrame2336) {
			Class310.method4176(Class464.aClass691_5228, Class223.aFrame2336, (byte) -9);
			Class223.aFrame2336 = null;
		}
		aClass106_11322.method1418(1138674553);
		aClass106_11322.aClass27_1272.method754(-1479117875);
		aClass106_11218.method1418(-1105910137);
		aClass106_11218.aClass27_1272.method754(-2084959037);
		if (null != Class184_Sub2.aClass211_9442)
			Class184_Sub2.aClass211_9442.method3041(-2036753657);
		Class176.aClass460_1936.method5532(-1995681564);
		Class183_Sub2.aClass449_9812.method5415((byte) 1);
		Class246.aClass466_2473.method5673(-1730438640);
		if (null != aClass661_11019) {
			aClass661_11019.method7976((byte) 16);
			aClass661_11019 = null;
		}
		try {
			Ping.quit();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class169.method2419(677135823);
		try {
			Class88.method1213(-1039931142);
		} catch (Exception exception) {
			/* empty */
		}
		if (null != Class208.aClass60_2245)
			Class208.aClass60_2245.method991(1432588681);
		if (aBool6869 && Class678.aClass678_8616 != Class47.aClass678_578)
			Class205_Sub22.method9098(-737698076);
	}

	void method10372(byte i) {
		boolean bool = Class176.aClass460_1936.method5537((byte) -24);
		if (!bool)
			method10433(4209465);
	}

	void method10373(int i, int i_10_) {
		Class321.aSocket3543 = null;
		Class582.aClass567_7700 = null;
		handshakeStage = 0;
		Class176.aClass460_1936.anInt5195 += 971530315;
		Class176.aClass460_1936.anInt5196 = i * -938617607;
	}

	final void method10374(int i) {
		if (0 == anInt11101 * -708374433 && !Class344.method4487(-440129613) || (anInt11101 * -708374433 == 8 && 42 == Class61.anInt687 * 1063476305) || (1 == anInt11101 * -708374433 && (49 == 625930941 * Class61.anInt654 || Class61.anInt654 * 625930941 == 52)) || 11 == anInt11101 * -708374433) {
			if (anInt11065 * 691419549 > 1) {
				anInt11065 -= 1895634101;
				anInt11030 = anInt11215 * -1021888685;
			}
			if (!Class70.aBool752)
				Class452.method5434(793351454);
			if (-708374433 * anInt11101 != 1 || (Class61.anInt654 * 625930941 != 49 && Class61.anInt654 * 625930941 != 52)) {
				for (int i_11_ = 0; (i_11_ < 100 && Class537.method6506(aClass106_11218, 1741586889)); i_11_++) {
					/* empty */
				}
			}
		}
		Class161_Sub2.method8671(1553533834);
		Class99.method1324((byte) -24);
		anInt11180 += 640335201;
		Class34.method815(-1, -1, -1517849548);
		Class183.method2738(null, -1, -1, -1491102025);
		Class458_Sub4.method9372(486719078);
		anInt11215 += -575680763;
		for (int i_12_ = 0; i_12_ < -1683770117 * anInt11164; i_12_++) {
			NPC class649_sub1_sub5_sub1_sub1 = ((NPC) aClass536_Sub13Array11044[i_12_].anObject10468);
			if (class649_sub1_sub5_sub1_sub1 != null) {
				byte i_13_ = class649_sub1_sub5_sub1_sub1.aClass296_12174.aByte3316;
				if ((i_13_ & 0x1) != 0) {
					int i_14_ = class649_sub1_sub5_sub1_sub1.method10874();
					if (0 != (i_13_ & 0x2) && 0 == (class649_sub1_sub5_sub1_sub1.stepsCount * -711375609) && Math.random() * 1000.0 < 10.0) {
						int i_15_ = (int) Math.round(Math.random() * 10.0 - 5.0);
						int i_16_ = (int) Math.round(Math.random() * 10.0 - 5.0);
						if (i_15_ != 0 || 0 != i_16_) {
							int i_17_ = ((class649_sub1_sub5_sub1_sub1.screenX[0]) + i_15_);
							int i_18_ = ((class649_sub1_sub5_sub1_sub1.screenY[0]) + i_16_);
							if (i_17_ < 0) {
								boolean bool = false;
							} else if (i_17_ > (aClass515_11066.method6321((byte) 39) - i_14_ - 1))
								i_17_ = (aClass515_11066.method6321((byte) -16) - i_14_ - 1);
							if (i_18_ < 0) {
								boolean bool = false;
							} else if (i_18_ > (aClass515_11066.method6243(177401017) - i_14_ - 1))
								i_18_ = (aClass515_11066.method6243(177401017) - i_14_ - 1);
						}
					}
					Class609.method7267(class649_sub1_sub5_sub1_sub1, true, 363090350);
					int i_19_ = IncomingPacket.method5073(class649_sub1_sub5_sub1_sub1, -290551381);
					Class305.method4108(class649_sub1_sub5_sub1_sub1, -652647262);
					Class633.method7546(class649_sub1_sub5_sub1_sub1, Class489.anInt5465 * -2066703787, 1866061237 * Class207.anInt2243, i_19_, -406052348);
					Class611.method7278(class649_sub1_sub5_sub1_sub1, -2066703787 * Class489.anInt5465, 443857613);
					Class521_Sub2.method9341(class649_sub1_sub5_sub1_sub1, (byte) 83);
					Class425 class425 = Class425.method5081();
					class425.method5088(Class447.method5400(class649_sub1_sub5_sub1_sub1.aClass62_11940.method1047((byte) 16)), Class447.method5400(class649_sub1_sub5_sub1_sub1.aClass62_11942.method1047((byte) 16)), Class447.method5400(class649_sub1_sub5_sub1_sub1.aClass62_11902.method1047((byte) 16)));
					class649_sub1_sub5_sub1_sub1.method7840(class425);
					class425.method5080();
				}
			}
		}
		if ((-708374433 * anInt11101 == 16 || 8 == -708374433 * anInt11101 || 0 == -708374433 * anInt11101 || 11 == anInt11101 * -708374433) && (!Class344.method4487(-440129613) || (8 == anInt11101 * -708374433 && 42 == 1063476305 * Class61.anInt687) || (1 == anInt11101 * -708374433 && (49 == 625930941 * Class61.anInt654 || 52 == 625930941 * Class61.anInt654))) && !Class81.method1164(65280)) {
			if (3 == Class246.anInt2474 * 155362615)
				Class390.method4857(1771174916);
			else
				Class32.method792((byte) 0);
			if (Class637.anInt8301 * -1607026219 >> 9 < 14 || (Class637.anInt8301 * -1607026219 >> 9 >= aClass515_11066.method6321((byte) -99) - 14) || -1646092097 * Class685.anInt8665 >> 9 < 14 || (-1646092097 * Class685.anInt8665 >> 9 >= aClass515_11066.method6243(177401017) - 14))
				aClass515_11066.method6291(new Class510((Class498.aClass498_5559), null), (byte) -27);
		}
		for (;;) {
			Class536_Sub42 class536_sub42 = (Class536_Sub42) aClass708_11241.method8305(541476487);
			if (class536_sub42 == null)
				break;
			InterfaceDefinitions class251 = class536_sub42.aClass251_10804;
			if (-809980533 * class251.anInt2546 >= 0) {
				InterfaceDefinitions class251_20_ = Class264.method3678(class251.anInt2577 * -1940204141, -689214737);
				if (class251_20_ == null || class251_20_.aClass251Array2725 == null || (-809980533 * class251.anInt2546 >= class251_20_.aClass251Array2725.length) || (class251_20_.aClass251Array2725[class251.anInt2546 * -809980533]) != class251)
					continue;
			}
			Class618.method7388(class536_sub42, -1020032130);
		}
		for (;;) {
			Class536_Sub42 class536_sub42 = (Class536_Sub42) aClass708_11181.method8305(1880045722);
			if (class536_sub42 == null)
				break;
			InterfaceDefinitions class251 = class536_sub42.aClass251_10804;
			if (-809980533 * class251.anInt2546 >= 0) {
				InterfaceDefinitions class251_21_ = Class264.method3678(class251.anInt2577 * -1940204141, -689214737);
				if (class251_21_ == null || class251_21_.aClass251Array2725 == null || (class251.anInt2546 * -809980533 >= class251_21_.aClass251Array2725.length) || (class251_21_.aClass251Array2725[-809980533 * class251.anInt2546]) != class251)
					continue;
			}
			Class618.method7388(class536_sub42, -1248901383);
		}
		for (;;) {
			Class536_Sub42 class536_sub42 = (Class536_Sub42) aClass708_11077.method8305(1459277315);
			if (class536_sub42 == null)
				break;
			InterfaceDefinitions class251 = class536_sub42.aClass251_10804;
			if (-809980533 * class251.anInt2546 >= 0) {
				InterfaceDefinitions class251_22_ = Class264.method3678(class251.anInt2577 * -1940204141, -689214737);
				if (class251_22_ == null || null == class251_22_.aClass251Array2725 || (-809980533 * class251.anInt2546 >= class251_22_.aClass251Array2725.length) || (class251_22_.aClass251Array2725[class251.anInt2546 * -809980533]) != class251)
					continue;
			}
			Class618.method7388(class536_sub42, -195109917);
		}
		if (null != aClass251_10992)
			Class441.method5330(2134120671);
		if (cycles % 15000 == 0)
			Class458_Sub3.method9357((byte) 76);
		if (0 == anInt11101 * -708374433 && !Class344.method4487(-440129613) || (-708374433 * anInt11101 == 8 && 42 == 1063476305 * Class61.anInt687) || (anInt11101 * -708374433 == 1 && (49 == Class61.anInt654 * 625930941 || 52 == Class61.anInt654 * 625930941)) || 11 == -708374433 * anInt11101)
			Class396.method4885(523954249);
		Class252.method3522((short) 2068);
		if (aBool11064 && anInt11101 * -708374433 == 0) {
			Class611.method7279(975300967);
			aBool11064 = false;
		}
		if (Class590.aClass147_Sub1_7791.aBool8886 && (-2824174956198053549L * Class590.aClass147_Sub1_7791.aLong8888 < Class249.method3450(1864495638) - 60000L))
			Class567.method6918(-325437170);
		for (Class521_Sub6 class521_sub6 = (Class521_Sub6) aClass695_11292.method8210(-107757342); null != class521_sub6; class521_sub6 = (Class521_Sub6) aClass695_11292.method8219(-746204591)) {
			if ((long) (class521_sub6.anInt10362 * 1936831955) < Class249.method3450(1775755363) / 1000L - 5L) {
				if (class521_sub6.aShort10361 > 0)
					Class635.method7564(5, 0, "", "", "", new StringBuilder().append(class521_sub6.aString10360).append(Class38.aClass38_429.method840(Class459.aClass664_5178, 1916933728)).toString(), null, -1538266173);
				if (0 == class521_sub6.aShort10361)
					Class635.method7564(5, 0, "", "", "", new StringBuilder().append(class521_sub6.aString10360).append(Class38.aClass38_430.method840(Class459.aClass664_5178, 1530773236)).toString(), null, -1538266173);
				class521_sub6.method6354((byte) -35);
			}
		}
		if (anInt11101 * -708374433 == 0 && !Class344.method4487(-440129613) || (-708374433 * anInt11101 == 8 && 1063476305 * Class61.anInt687 == 42) || (anInt11101 * -708374433 == 1 && (Class61.anInt654 * 625930941 == 49 || 52 == Class61.anInt654 * 625930941)) || 11 == -708374433 * anInt11101) {
			if (anInt11101 * -708374433 != 8 && aClass106_11218.method1413((short) -20288) == null)
				Class275.method3737(false, -1655731679);
			else if (null != aClass106_11218) {
				aClass106_11218.anInt1265 += -768200239;
				if (aClass106_11218.anInt1265 * -1086863567 > 50) {
					Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4521, aClass106_11218.aClass15_1258, 820394303);
					aClass106_11218.method1409(class536_sub23, -205306058);
				}
				try {
					aClass106_11218.method1408(1442985919);
				} catch (IOException ioexception) {
					if (-708374433 * anInt11101 == 8)
						aClass106_11218.method1418(-445801849);
					else
						Class275.method3737(false, -1563342199);
				}
			}
		}
	}

	static final void method10375() {
		int i = Class95.anInt1156 * -1482773169;
		int[] is = Class95.anIntArray1157;
		int i_23_ = Class710.aClass536_Sub40_8843.aClass710_Sub21_10741.method10109((byte) 1);
		boolean bool = 1 == i_23_ && i > 200 || i_23_ == 0 && i > 50;
		for (int i_24_ = 0; i_24_ < i; i_24_++) {
			Player class649_sub1_sub5_sub1_sub2 = aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i_24_]];
			if (!class649_sub1_sub5_sub1_sub2.method11088(1644471179))
				class649_sub1_sub5_sub1_sub2.anInt11905 = 1239170155;
			else if (class649_sub1_sub5_sub1_sub2.aClass623_12201.method7420(1331948679))
				class649_sub1_sub5_sub1_sub2.anInt11905 = 1239170155;
			else {
				class649_sub1_sub5_sub1_sub2.method10836((short) 12771);
				if (class649_sub1_sub5_sub1_sub2.aShort11867 < 0 || class649_sub1_sub5_sub1_sub2.aShort11865 < 0 || (class649_sub1_sub5_sub1_sub2.aShort11864 >= aClass515_11066.method6321((byte) -45)) || (class649_sub1_sub5_sub1_sub2.aShort11870 >= aClass515_11066.method6243(177401017)))
					class649_sub1_sub5_sub1_sub2.anInt11905 = 1239170155;
				else {
					class649_sub1_sub5_sub1_sub2.aBool12185 = (class649_sub1_sub5_sub1_sub2.aClass688_Sub3_11914.aBool10975) ? bool : false;
					if (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 == class649_sub1_sub5_sub1_sub2)
						class649_sub1_sub5_sub1_sub2.anInt11905 = -908313493;
					else {
						int i_25_ = 0;
						if (!class649_sub1_sub5_sub1_sub2.aBool11894)
							i_25_++;
						if (!class649_sub1_sub5_sub1_sub2.aClass695_11910.method8221(1360139595))
							i_25_ += 2;
						i_25_ += 5 - class649_sub1_sub5_sub1_sub2.method10874() << 2;
						if ((Class210.aClass210_2258 != class649_sub1_sub5_sub1_sub2.aClass210_12200) || class649_sub1_sub5_sub1_sub2.isClanMember)
							i_25_ += 512;
						else {
							if (-1671034871 * anInt11132 == 0)
								i_25_ += 32;
							else
								i_25_ += 128;
							i_25_ += 256;
						}
						if (class649_sub1_sub5_sub1_sub2.method10886(1995401058) == 1696506681 * anInt11002)
							i_25_ += 2047;
						class649_sub1_sub5_sub1_sub2.anInt11905 = (1 + i_25_) * -1239170155;
					}
				}
			}
		}
		for (int i_26_ = 0; i_26_ < anInt11053 * -664631943; i_26_++) {
			NPC class649_sub1_sub5_sub1_sub1 = ((NPC) (((Class536_Sub13) aClass4_11050.method556((long) anIntArray11211[i_26_])).anObject10468));
			if (!class649_sub1_sub5_sub1_sub1.method11068(1315435013) || !(class649_sub1_sub5_sub1_sub1.aClass296_12174.method3985(Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, -744356458)))
				class649_sub1_sub5_sub1_sub1.anInt11905 = 1239170155;
			else {
				class649_sub1_sub5_sub1_sub1.method10836((short) 21295);
				if (class649_sub1_sub5_sub1_sub1.aShort11867 < 0 || class649_sub1_sub5_sub1_sub1.aShort11865 < 0 || (class649_sub1_sub5_sub1_sub1.aShort11864 >= aClass515_11066.method6321((byte) -44)) || (class649_sub1_sub5_sub1_sub1.aShort11870 >= aClass515_11066.method6243(177401017)))
					class649_sub1_sub5_sub1_sub1.anInt11905 = 1239170155;
				else {
					int i_27_ = 0;
					if (!class649_sub1_sub5_sub1_sub1.aBool11894)
						i_27_++;
					if (!class649_sub1_sub5_sub1_sub1.aClass695_11910.method8221(1360139595))
						i_27_ += 2;
					if (class649_sub1_sub5_sub1_sub1.method10874() < 5)
						i_27_ += 5 - class649_sub1_sub5_sub1_sub1.method10874() << 2;
					if (0 == -1671034871 * anInt11132) {
						if (class649_sub1_sub5_sub1_sub1.aClass296_12174.aBool3290)
							i_27_ += 64;
						else
							i_27_ += 128;
					} else if (1 == anInt11132 * -1671034871) {
						if (class649_sub1_sub5_sub1_sub1.aClass296_12174.aBool3290)
							i_27_ += 32;
						else
							i_27_ += 64;
					}
					if (class649_sub1_sub5_sub1_sub1.aClass296_12174.aBool3303)
						i_27_ += 1024;
					else if (!class649_sub1_sub5_sub1_sub1.aClass296_12174.aBool3296)
						i_27_ += 256;
					if (class649_sub1_sub5_sub1_sub1.method10886(2132273987) == 1696506681 * anInt11002)
						i_27_ += 2047;
					class649_sub1_sub5_sub1_sub1.anInt11905 = -1239170155 * (i_27_ + 1);
				}
			}
		}
		for (int i_28_ = 0; i_28_ < aClass103Array11020.length; i_28_++) {
			Class103 class103 = aClass103Array11020[i_28_];
			if (class103 != null) {
				if (1 == class103.anInt1224 * 2030004867) {
					Class536_Sub13 class536_sub13 = ((Class536_Sub13) aClass4_11050.method556((long) (class103.anInt1223 * 1298998125)));
					if (class536_sub13 != null) {
						NPC class649_sub1_sub5_sub1_sub1 = ((NPC) class536_sub13.anObject10468);
						if ((1272934333 * class649_sub1_sub5_sub1_sub1.anInt11905) >= 0)
							class649_sub1_sub5_sub1_sub1.anInt11905 += 505194496;
					}
				} else if (10 == 2030004867 * class103.anInt1224) {
					Player class649_sub1_sub5_sub1_sub2 = (aClass649_Sub1_Sub5_Sub1_Sub2Array11155[class103.anInt1223 * 1298998125]);
					if (class649_sub1_sub5_sub1_sub2 != null && (class649_sub1_sub5_sub1_sub2 != Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591) && (class649_sub1_sub5_sub1_sub2.anInt11905 * 1272934333) >= 0)
						class649_sub1_sub5_sub1_sub2.anInt11905 += 505194496;
				}
			}
		}
	}

	static final void method10376() {
		int[][] is = aClass515_11066.method6295(-428261827);
		int i = aClass515_11066.method6321((byte) 6);
		int i_29_ = aClass515_11066.method6243(177401017);
		for (int i_30_ = 0; i_30_ < i; i_30_++) {
			int[] is_31_ = is[i_30_];
			for (int i_32_ = 0; i_32_ < i_29_; i_32_++)
				is_31_[i_32_] = 0;
		}
	}

	static final void method10377(int i) {
		int i_33_ = -1482773169 * Class95.anInt1156;
		int[] is = Class95.anIntArray1157;
		int[][] is_34_ = aClass515_11066.method6295(551067295);
		int[][] is_35_ = aClass515_11066.method6286((byte) -116);
		int i_36_;
		if (1542697723 * anInt11074 == 4)
			i_36_ = Class193.aClass189Array2180.length;
		else
			i_36_ = i_33_ + anInt11053 * -664631943;
		for (int i_37_ = 0; i_37_ < i_36_; i_37_++) {
			Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1;
			if (4 == anInt11074 * 1542697723) {
				Class189 class189 = Class193.aClass189Array2180[i_37_];
				if (!class189.aBool2141)
					continue;
				class649_sub1_sub5_sub1 = class189.method2804(2116826164);
			} else {
				if (i_37_ < i_33_)
					class649_sub1_sub5_sub1 = aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i_37_]];
				else
					class649_sub1_sub5_sub1 = ((Class649_Sub1_Sub5_Sub1) (((Class536_Sub13) aClass4_11050.method556((long) anIntArray11211[i_37_ - i_33_])).anObject10468));
				if (i != class649_sub1_sub5_sub1.aByte10839 || class649_sub1_sub5_sub1.anInt11905 * 1272934333 < 0 || class649_sub1_sub5_sub1.aBool11895)
					continue;
			}
			int i_38_ = class649_sub1_sub5_sub1.method10874();
			Class436 class436 = class649_sub1_sub5_sub1.method7837().aClass436_4823;
			if ((i_38_ & 0x1) == 0) {
				if (((int) class436.aFloat4850 & 0x1ff) != 0 || ((int) class436.aFloat4853 & 0x1ff) != 0)
					continue;
			} else if (256 != ((int) class436.aFloat4850 & 0x1ff) || ((int) class436.aFloat4853 & 0x1ff) != 256)
				continue;
			if (1 == i_38_) {
				int i_39_ = (int) class436.aFloat4850 >> 9;
				int i_40_ = (int) class436.aFloat4853 >> 9;
				if (class649_sub1_sub5_sub1.anInt11905 * 1272934333 > is_34_[i_39_][i_40_]) {
					is_34_[i_39_][i_40_] = class649_sub1_sub5_sub1.anInt11905 * 1272934333;
					is_35_[i_39_][i_40_] = 1;
				} else if (is_34_[i_39_][i_40_] == class649_sub1_sub5_sub1.anInt11905 * 1272934333)
					is_35_[i_39_][i_40_]++;
			} else {
				int i_41_ = 60 + (i_38_ - 1) * 256;
				int i_42_ = (int) class436.aFloat4850 - i_41_ >> 9;
				int i_43_ = (int) class436.aFloat4853 - i_41_ >> 9;
				int i_44_ = i_41_ + (int) class436.aFloat4850 >> 9;
				int i_45_ = (int) class436.aFloat4853 + i_41_ >> 9;
				for (int i_46_ = i_42_; i_46_ <= i_44_; i_46_++) {
					for (int i_47_ = i_43_; i_47_ <= i_45_; i_47_++) {
						if (1272934333 * class649_sub1_sub5_sub1.anInt11905 > is_34_[i_46_][i_47_]) {
							is_34_[i_46_][i_47_] = (class649_sub1_sub5_sub1.anInt11905 * 1272934333);
							is_35_[i_46_][i_47_] = 1;
						} else if ((class649_sub1_sub5_sub1.anInt11905 * 1272934333) == is_34_[i_46_][i_47_])
							is_35_[i_46_][i_47_]++;
					}
				}
			}
		}
	}

	static final void method10378(int i) {
		int i_48_ = Class95.anInt1156 * -1482773169;
		int[] is = Class95.anIntArray1157;
		int[][] is_49_ = aClass515_11066.method6295(-1877925913);
		int[][] is_50_ = aClass515_11066.method6286((byte) -104);
		int i_51_;
		if (anInt11074 * 1542697723 == 4)
			i_51_ = Class193.aClass189Array2180.length;
		else
			i_51_ = aBool11023 ? i_48_ : i_48_ + -664631943 * anInt11053;
		for (int i_52_ = 0; i_52_ < i_51_; i_52_++) {
			Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1;
			if (4 == anInt11074 * 1542697723) {
				Class189 class189 = Class193.aClass189Array2180[i_52_];
				if (!class189.aBool2141)
					continue;
				class649_sub1_sub5_sub1 = class189.method2804(-442545034);
			} else {
				if (i_52_ < i_48_)
					class649_sub1_sub5_sub1 = aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i_52_]];
				else
					class649_sub1_sub5_sub1 = ((Class649_Sub1_Sub5_Sub1) (((Class536_Sub13) aClass4_11050.method556((long) anIntArray11211[i_52_ - i_48_])).anObject10468));
				if (i != class649_sub1_sub5_sub1.aByte10839)
					continue;
				if (class649_sub1_sub5_sub1.anInt11905 * 1272934333 < 0) {
					class649_sub1_sub5_sub1.aBool11894 = false;
					continue;
				}
			}
			class649_sub1_sub5_sub1.anInt11896 = 0;
			int i_53_ = class649_sub1_sub5_sub1.method10874();
			Class436 class436 = class649_sub1_sub5_sub1.method7837().aClass436_4823;
			if (0 == (i_53_ & 0x1)) {
				if (((int) class436.aFloat4850 & 0x1ff) != 0 || ((int) class436.aFloat4853 & 0x1ff) != 0) {
					class649_sub1_sub5_sub1.aBool11894 = false;
					continue;
				}
			} else if (((int) class436.aFloat4850 & 0x1ff) != 256 || 256 != ((int) class436.aFloat4853 & 0x1ff)) {
				class649_sub1_sub5_sub1.aBool11894 = false;
				continue;
			}
			if (4 != anInt11074 * 1542697723 && !class649_sub1_sub5_sub1.aBool11895) {
				if (1 == i_53_) {
					int i_54_ = (int) class436.aFloat4850 >> 9;
					int i_55_ = (int) class436.aFloat4853 >> 9;
					if (class649_sub1_sub5_sub1.anInt11905 * 1272934333 != is_49_[i_54_][i_55_]) {
						class649_sub1_sub5_sub1.aBool11894 = true;
						continue;
					}
					if (is_50_[i_54_][i_55_] > 1) {
						is_50_[i_54_][i_55_]--;
						class649_sub1_sub5_sub1.aBool11894 = true;
						continue;
					}
				} else {
					int i_56_ = 252 + 256 * (i_53_ - 1);
					int i_57_ = (int) class436.aFloat4850 - i_56_ >> 9;
					int i_58_ = (int) class436.aFloat4853 - i_56_ >> 9;
					int i_59_ = i_56_ + (int) class436.aFloat4850 >> 9;
					int i_60_ = i_56_ + (int) class436.aFloat4853 >> 9;
					if (!Class704.method8265(is_49_, is_50_, (class649_sub1_sub5_sub1.anInt11905) * 1272934333, i_57_, i_58_, i_59_, i_60_, -2055348248)) {
						for (int i_61_ = i_57_; i_61_ <= i_59_; i_61_++) {
							for (int i_62_ = i_58_; i_62_ <= i_60_; i_62_++) {
								if (is_49_[i_61_][i_62_] == (class649_sub1_sub5_sub1.anInt11905 * 1272934333))
									is_50_[i_61_][i_62_]--;
							}
						}
						class649_sub1_sub5_sub1.aBool11894 = true;
						continue;
					}
				}
			}
			class649_sub1_sub5_sub1.aBool11894 = false;
			if ((class649_sub1_sub5_sub1.anInt11923 * 1080012231 <= cycles && (class649_sub1_sub5_sub1.anInt11924 * -327061215 < cycles)) || (-22167277 * class649_sub1_sub5_sub1.anInt11922 == -1428852859 * class649_sub1_sub5_sub1.anInt11921))
				class649_sub1_sub5_sub1.method7842(class436.aFloat4850, (float) Class54.method944((int) class436.aFloat4850, (int) class436.aFloat4853, (class649_sub1_sub5_sub1.aByte10839), 2062832387), class436.aFloat4853);
			aClass515_11066.method6249(-2120317167).method6711(class649_sub1_sub5_sub1, true, 734784384);
		}
	}

	static final void method10379() {
		anInt11261 = 0;
		for (int i = 0; i < anInt11053 * -664631943; i++) {
			NPC class649_sub1_sub5_sub1_sub1 = ((NPC) (((Class536_Sub13) aClass4_11050.method556((long) anIntArray11211[i])).anObject10468));
			if (class649_sub1_sub5_sub1_sub1.aBool11894 && (class649_sub1_sub5_sub1_sub1.method10879((byte) -39) != -1)) {
				int i_63_ = ((class649_sub1_sub5_sub1_sub1.method10874() - 1) * 256 + 252);
				Class436 class436 = class649_sub1_sub5_sub1_sub1.method7837().aClass436_4823;
				int i_64_ = (int) class436.aFloat4850 - i_63_ >> 9;
				int i_65_ = (int) class436.aFloat4853 - i_63_ >> 9;
				Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1 = Class533.method6466((class649_sub1_sub5_sub1_sub1.aByte10839), i_64_, i_65_, 900916669);
				if (null != class649_sub1_sub5_sub1) {
					int i_66_ = class649_sub1_sub5_sub1.anInt11889 * 1710020215;
					if (class649_sub1_sub5_sub1 instanceof NPC)
						i_66_ += 2048;
					if (class649_sub1_sub5_sub1.anInt11896 * -1991503595 == 0 && (class649_sub1_sub5_sub1.method10879((byte) 5) != -1)) {
						anIntArray11128[1973460815 * anInt11261] = i_66_;
						anIntArray11129[anInt11261 * 1973460815] = i_66_;
						anInt11261 += 1479350191;
						class649_sub1_sub5_sub1.anInt11896 += -2104510915;
					}
					anIntArray11128[anInt11261 * 1973460815] = i_66_;
					anIntArray11129[1973460815 * anInt11261] = 2048 + (class649_sub1_sub5_sub1_sub1.anInt11889 * 1710020215);
					anInt11261 += 1479350191;
					class649_sub1_sub5_sub1.anInt11896 += -2104510915;
				}
			}
		}
		Class591.method7112(anIntArray11129, anIntArray11128, 0, 1973460815 * anInt11261 - 1, (byte) 54);
	}

	static final void method10380() {
		int i = Class95.anInt1156 * -1482773169;
		int[] is = Class95.anIntArray1157;
		int i_67_;
		if (1542697723 * anInt11074 == 4)
			i_67_ = Class193.aClass189Array2180.length;
		else
			i_67_ = aBool11023 ? i : -664631943 * anInt11053 + i;
		for (int i_68_ = 0; i_68_ < i_67_; i_68_++) {
			Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1;
			if (anInt11074 * 1542697723 == 4) {
				Class189 class189 = Class193.aClass189Array2180[i_68_];
				if (!class189.aBool2141)
					continue;
				class649_sub1_sub5_sub1 = class189.method2804(1139594860);
			} else {
				if (i_68_ < i)
					class649_sub1_sub5_sub1 = aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i_68_]];
				else
					class649_sub1_sub5_sub1 = ((Class649_Sub1_Sub5_Sub1) (((Class536_Sub13) aClass4_11050.method556((long) anIntArray11211[i_68_ - i])).anObject10468));
				if (class649_sub1_sub5_sub1.anInt11905 * 1272934333 < 0)
					continue;
			}
			int i_69_ = class649_sub1_sub5_sub1.method10874();
			Class436 class436 = class649_sub1_sub5_sub1.method7837().aClass436_4823;
			if (0 == (i_69_ & 0x1)) {
				if (((int) class436.aFloat4850 & 0x1ff) == 0 && ((int) class436.aFloat4853 & 0x1ff) == 0)
					continue;
			} else if (((int) class436.aFloat4850 & 0x1ff) == 256 && 256 == ((int) class436.aFloat4853 & 0x1ff))
				continue;
			if ((class649_sub1_sub5_sub1.anInt11923 * 1080012231 <= cycles && (class649_sub1_sub5_sub1.anInt11924 * -327061215 < cycles)) || (class649_sub1_sub5_sub1.anInt11921 * -1428852859 == class649_sub1_sub5_sub1.anInt11922 * -22167277))
				class649_sub1_sub5_sub1.method7842(class436.aFloat4850, (float) Class54.method944((int) class436.aFloat4850, (int) class436.aFloat4853, (class649_sub1_sub5_sub1.aByte10839), 1960119989), class436.aFloat4853);
			aClass515_11066.method6249(-1999477364).method6711(class649_sub1_sub5_sub1, true, 960283767);
		}
	}

	public static final void method10381(Class234 class234, InterfaceDefinitions[] class251s, int i, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_) {
		for (int i_78_ = 0; i_78_ < class251s.length; i_78_++) {
			InterfaceDefinitions class251 = class251s[i_78_];
			if (null != class251 && -1940204141 * class251.anInt2577 == i) {
				int i_79_ = i_74_ + class251.anInt2571 * 1151043453;
				int i_80_ = -712740187 * class251.anInt2572 + i_75_;
				int i_81_;
				int i_82_;
				int i_83_;
				int i_84_;
				if (2 == 1049444347 * class251.anInt2728) {
					i_81_ = i_70_;
					i_82_ = i_71_;
					i_83_ = i_72_;
					i_84_ = i_73_;
				} else {
					int i_85_ = -1606950689 * class251.anInt2573 + i_79_;
					int i_86_ = class251.anInt2574 * 223822141 + i_80_;
					if (1049444347 * class251.anInt2728 == 9) {
						i_85_++;
						i_86_++;
					}
					i_81_ = i_79_ > i_70_ ? i_79_ : i_70_;
					i_82_ = i_80_ > i_71_ ? i_80_ : i_71_;
					i_83_ = i_85_ < i_72_ ? i_85_ : i_72_;
					i_84_ = i_86_ < i_73_ ? i_86_ : i_73_;
				}
				if (0 != 1049444347 * class251.anInt2728 && !class251.aBool2666 && method10389(class251).settings * -512963777 == 0 && aClass251_11199 != class251 && (-1769600535 * class251.anInt2562 != InterfaceDefinitions.anInt2691 * 1208417731) && (InterfaceDefinitions.anInt2605 * 280161423 != -1769600535 * class251.anInt2562) && (-1769600535 * class251.anInt2562 != InterfaceDefinitions.anInt2537 * -2049675251) && (InterfaceDefinitions.anInt2646 * -1686834873 != class251.anInt2562 * -1769600535)) {
					if (i_81_ < i_83_ && i_82_ < i_84_)
						Class534.method6470(class251, 2086053374);
				} else if (!method10439(class251)) {
					if (aClass251_10992 == class251 && Class542_Sub1.method9848(aClass251_10992, 1394658601)) {
						aBool11208 = true;
						anInt11209 = i_79_ * 851690289;
						anInt11210 = i_80_ * -1568264063;
					}
					if (class251.aBool2582 || i_81_ < i_83_ && i_82_ < i_84_) {
						if (class251.aBool2708 && i_76_ >= i_81_ && i_77_ >= i_82_ && i_76_ < i_83_ && i_77_ < i_84_) {
							for (Class536_Sub42 class536_sub42 = ((Class536_Sub42) aClass708_11077.method8308(1867269829)); null != class536_sub42; class536_sub42 = ((Class536_Sub42) aClass708_11077.method8311(1966476339))) {
								if (class536_sub42.aBool10801) {
									class536_sub42.method6484(-737426665);
									class536_sub42.aClass251_10804.aBool2727 = false;
								}
							}
							if (2018211705 * Class360.anInt3827 == 0) {
								aClass251_10992 = null;
								aClass251_11199 = null;
							}
							anInt11212 = 0;
							Class542_Sub1.aBool10717 = false;
							aBool11214 = false;
							if (!Class70.aBool752)
								Class452.method5434(2023331400);
						}
						boolean bool = (class251.aBool2677 && 5 == class251.anInt2728 * 1049444347 && class251.anInt2589 * 1425974027 == 0 && class251.anInt2716 * 2028683203 < 0 && -1 == class251.anInt2711 * -1484799213 && !class251.aBool2594 && 1548616703 * class251.anInt2593 == 0);
						boolean bool_87_ = false;
						if (i_76_ >= i_81_ && i_77_ >= i_82_ && i_76_ < i_83_ && i_77_ < i_84_) {
							if (bool) {
								Class244 class244 = class251.method3478((Class677.aClass167_8609), -474108962);
								if (class244 == null || (class244.anInt2464 * -598030877 != -1606950689 * class251.anInt2573) || (-313075149 * class244.anInt2460 != 223822141 * class251.anInt2574))
									bool_87_ = true;
								else {
									int i_88_ = i_76_ - i_79_;
									int i_89_ = i_77_ - i_80_;
									if (i_89_ >= 0 && i_89_ < (class244.anIntArray2462).length) {
										int i_90_ = class244.anIntArray2462[i_89_];
										if (i_88_ >= i_90_ && (i_88_ <= i_90_ + (class244.anIntArray2461[i_89_])))
											bool_87_ = true;
									}
								}
							} else
								bool_87_ = true;
						}
						if (!aBool11188 && bool_87_) {
							if (1973741201 * class251.anInt2713 >= 0)
								anInt11179 = class251.anInt2713 * 285198015;
							else if (class251.aBool2708)
								anInt11179 = -937599055;
						}
						if (!Class70.aBool752 && bool_87_ && !class234.aBool2379)
							Class219.method3101(class251, i_76_ - i_79_, i_77_ - i_80_, 1339797835);
						boolean bool_91_ = false;
						if (Class329.aClass550_3601.method6652(1997457570) && bool_87_)
							bool_91_ = true;
						boolean bool_92_ = false;
						Class536_Sub31 class536_sub31 = ((Class536_Sub31) aClass708_11250.method8308(1867269829));
						if (class536_sub31 != null && class536_sub31.method9642(-1763732009) == 0 && class536_sub31.method9647(-1802307810) >= i_81_ && class536_sub31.method9643((byte) 1) >= i_82_ && class536_sub31.method9647(-1854982103) < i_83_ && class536_sub31.method9643((byte) 1) < i_84_) {
							if (bool) {
								Class244 class244 = class251.method3478((Class677.aClass167_8609), 91742362);
								if (null == class244 || (-1606950689 * class251.anInt2573 != class244.anInt2464 * -598030877) || (class244.anInt2460 * -313075149 != class251.anInt2574 * 223822141))
									bool_92_ = true;
								else {
									int i_93_ = (class536_sub31.method9647(-1891348132) - i_79_);
									int i_94_ = (class536_sub31.method9643((byte) 1) - i_80_);
									if (i_94_ >= 0 && i_94_ < (class244.anIntArray2462).length) {
										int i_95_ = class244.anIntArray2462[i_94_];
										if (i_93_ >= i_95_ && (i_93_ <= i_95_ + (class244.anIntArray2461[i_94_])))
											bool_92_ = true;
									}
								}
							} else
								bool_92_ = true;
						}
						if (class251.aBool2582 && !Class44.method882(1607298402)) {
							for (int i_96_ = 0; i_96_ < class251.aByteArrayArray2647.length; i_96_++) {
								boolean bool_97_ = false;
								boolean bool_98_ = false;
								if (class251.anIntArray2651[i_96_] > 0) {
									for (int i_99_ = 0; i_99_ < anInt11033 * -1816034791; i_99_++) {
										if (class251.anIntArray2651[i_96_] == anInterface63Array11034[i_99_].method412((byte) -3)) {
											bool_97_ = true;
											if (class251.anIntArray2738 == null || (class251.anIntArray2738[i_96_]) <= cycles)
												bool_98_ = true;
											break;
										}
									}
								}
								if (!bool_97_ && null != (class251.aByteArrayArray2647[i_96_])) {
									for (int i_100_ = 0; i_100_ < (class251.aByteArrayArray2647[i_96_]).length; i_100_++) {
										if (Class331_Sub2.aClass549_10049.method6638((class251.aByteArrayArray2647[i_96_][i_100_]), (byte) 0)) {
											bool_97_ = true;
											if (class251.anIntArray2738 != null && (class251.anIntArray2738[i_96_]) > cycles)
												break;
											byte i_101_ = (class251.aByteArrayArray2648[i_96_][i_100_]);
											if (0 == i_101_ || (((i_101_ & 0x8) == 0 || (!(Class331_Sub2.aClass549_10049.method6638(86, (byte) 0)) && !(Class331_Sub2.aClass549_10049.method6638(82, (byte) 0)) && !(Class331_Sub2.aClass549_10049.method6638(81, (byte) 0)))) && ((i_101_ & 0x2) == 0 || (Class331_Sub2.aClass549_10049.method6638(86, (byte) 0))) && ((i_101_ & 0x1) == 0 || (Class331_Sub2.aClass549_10049.method6638(82, (byte) 0)))
													&& ((i_101_ & 0x4) == 0 || (Class331_Sub2.aClass549_10049.method6638(81, (byte) 0))))) {
												bool_98_ = true;
												break;
											}
										}
									}
								}
								if (bool_98_) {
									if (i_96_ < 10)
										Class273.method3730(i_96_ + 1, -1591767037 * class251.anInt2559, -809980533 * class251.anInt2546, "", -1656222990);
									else if (i_96_ == 10) {
										Class270.method3717(378095825);
										IComponentSettings class536_sub14 = method10389(class251);
										Class501.method6033(class251, class536_sub14.method9474((byte) 3), (class536_sub14.interfaceHash * 501091713), 1561786323);
										aString11185 = Class554.method6785(class251, 795492450);
										if (aString11185 == null)
											aString11185 = "Null";
										aString11186 = new StringBuilder().append(class251.aString2556).append(Class264.method3680(16777215, -1793827376)).toString();
									}
									int i_102_ = class251.anIntArray2560[i_96_];
									if (class251.anIntArray2738 == null)
										class251.anIntArray2738 = (new int[(class251.aByteArrayArray2647).length]);
									if (class251.anIntArray2722 == null)
										class251.anIntArray2722 = (new int[(class251.aByteArrayArray2647).length]);
									if (i_102_ != 0) {
										if (0 == class251.anIntArray2738[i_96_])
											class251.anIntArray2738[i_96_] = (cycles + i_102_ + (class251.anIntArray2722[i_96_]));
										else
											class251.anIntArray2738[i_96_] = cycles + i_102_;
									} else
										class251.anIntArray2738[i_96_] = 2147483647;
								}
								if (!bool_97_ && null != class251.anIntArray2738)
									class251.anIntArray2738[i_96_] = 0;
							}
						}
						if (bool_92_)
							Class569.method6924(class251, (class536_sub31.method9647(-2124080942) - i_79_), class536_sub31.method9643((byte) 1) - i_80_, -345315736);
						if (null != aClass251_10992 && class251 != aClass251_10992 && bool_87_) {
							if (class251.aBool2708 == true)
								aClass251_11202 = null;
							if (method10389(class251).method9473(1569223986))
								aClass251_11202 = class251;
						}
						if (class251 == aClass251_11199) {
							aBool11274 = true;
							anInt11204 = i_79_ * -1314923761;
							anInt11205 = 310853723 * i_80_;
							anInt11206 = aClass251_11199.anInt2573 * -1377558637;
							anInt11207 = 87503503 * aClass251_11199.anInt2574;
						}
						if (class251.aBool2666 || 0 != -1769600535 * class251.anInt2562) {
							if (bool_87_ && 0 != anInt11031 * 1990425561 && null != class251.anObjectArray2715) {
								Class536_Sub42 class536_sub42 = new Class536_Sub42();
								class536_sub42.aBool10801 = true;
								class536_sub42.aClass251_10804 = class251;
								class536_sub42.anInt10800 = anInt11031 * -1789992863;
								class536_sub42.anObjectArray10802 = class251.anObjectArray2715;
								aClass708_11077.method8335(class536_sub42, 394932406);
							}
							if (aClass251_10992 != null) {
								bool_92_ = false;
								bool_91_ = false;
							} else if (Class70.aBool752 || ((InterfaceDefinitions.anInt2541 * -628362163 != (-1769600535 * class251.anInt2562)) && anInt11212 * -1577593895 > 0)) {
								bool_92_ = false;
								bool_91_ = false;
								bool_87_ = false;
							}
							if (0 != class251.anInt2562 * -1769600535) {
								if ((class251.anInt2562 * -1769600535 == InterfaceDefinitions.anInt2537 * -2049675251) || (-1769600535 * class251.anInt2562 == InterfaceDefinitions.anInt2646 * -1686834873)) {
									aClass251_11195 = class251;
									Class625 class625 = aClass515_11066.method6252(1796531619).method7570((byte) 123);
									if (class625.method7442(1304896821) != null && !Class266.aClass503_2867.method6044((byte) -4))
										class625.method7442(1304896821).method6151(Class677.aClass167_8609, 223822141 * class251.anInt2574, Class710.aClass536_Sub40_8843.aClass710_Sub25_10735.method10142(1805613591), -1917875770);
									if (-2049675251 * InterfaceDefinitions.anInt2537 == class251.anInt2562 * -1769600535) {
										if (!Class70.aBool752 && i_76_ >= i_81_ && i_77_ >= i_82_ && i_76_ < i_83_ && i_77_ < i_84_) {
											Class494.method5989(Class677.aClass167_8609, i_76_, i_77_, 16711680);
											for (Class521_Sub5 class521_sub5 = ((Class521_Sub5) (aClass695_11131.method8210(631796223))); class521_sub5 != null; class521_sub5 = ((Class521_Sub5) (aClass695_11131.method8219(1254879165)))) {
												if (i_76_ >= ((class521_sub5.anInt10356) * -1797885291) && (i_76_ < (1042004967 * (class521_sub5.anInt10358))) && (i_77_ >= (1810372693 * (class521_sub5.anInt10354))) && (i_77_ < ((class521_sub5.anInt10359) * -1040369609))) {
													Class452.method5434(1171580099);
													Class154.method1873((class521_sub5.aClass649_Sub1_Sub5_Sub1_10355), 886926649);
												}
											}
										} else
											Class22.method716(Class677.aClass167_8609, -2131423477);
									}
									int i_103_ = -1482773169 * Class95.anInt1156;
									int[] is = Class95.anIntArray1157;
									for (int i_104_ = 0; i_104_ < i_103_; i_104_++) {
										Player class649_sub1_sub5_sub1_sub2 = (aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i_104_]]);
										if (null != class649_sub1_sub5_sub1_sub2) {
											Class390.method4858(Class570.aClass570_7620, -1, -1, class649_sub1_sub5_sub1_sub2, is[i_104_], 1876527263);
											class649_sub1_sub5_sub1_sub2.method10883(i_81_, i_82_, i_83_, i_84_, (i_79_ - (1428895931 * class251.anInt2581)), (i_80_ - (-2092413585 * class251.anInt2584)), i_76_, i_77_, 525244518);
										}
									}
									for (int i_105_ = 0; i_105_ < -664631943 * anInt11053; i_105_++) {
										int i_106_ = anIntArray11211[i_105_];
										Class536_Sub13 class536_sub13 = ((Class536_Sub13) aClass4_11050.method556((long) i_106_));
										if (null != class536_sub13) {
											Class390.method4858(Class570.aClass570_7610, (-1647549559 * (((NPC) (class536_sub13.anObject10468)).aClass296_12174.anInt3270)), -1, ((Class649_Sub1_Sub5_Sub1) (class536_sub13.anObject10468)), i_106_, 1388559673);
											((Class649_Sub1_Sub5_Sub1) class536_sub13.anObject10468).method10883(i_81_, i_82_, i_83_, i_84_, i_79_ - (class251.anInt2581 * 1428895931), i_80_ - (class251.anInt2584 * -2092413585), i_76_, i_77_, -1961672040);
										}
									}
									continue;
								}
								if (1208417731 * InterfaceDefinitions.anInt2691 == class251.anInt2562 * -1769600535) {
									int i_107_ = 0;
									int i_108_ = i_72_ - i_70_;
									int i_109_ = i_76_ - i_79_;
									int i_110_ = i_77_ - i_80_;
									if (5 == class251.anInt2728 * 1049444347) {
										Class244 class244 = (class251.method3478(Class677.aClass167_8609, -1811404314));
										if (class244 == null)
											continue;
										if (i_76_ >= i_81_ && i_77_ >= i_82_ && i_76_ < i_83_ && i_77_ < i_84_) {
											i_107_ = (class244.anIntArray2462[i_110_]);
											i_108_ = (class244.anIntArray2461[i_110_]);
										}
									}
									if ((Class101.anInt1200 * 2131718319 == 0 || 3 == (Class101.anInt1200 * 2131718319)) && !Class70.aBool752 && i_76_ >= i_81_ && i_77_ >= i_82_ && i_76_ < i_83_ && i_77_ < i_84_ && i_109_ >= i_107_ && i_109_ <= i_108_ + i_107_) {
										i_109_ -= (-1606950689 * class251.anInt2573 / 2);
										i_110_ -= (class251.anInt2574 * 223822141 / 2);
										int i_111_;
										if (155362615 * Class246.anInt2474 == 6)
											i_111_ = (int) aFloat11106 & 0x3fff;
										else if (Class246.anInt2474 * 155362615 == 2)
											i_111_ = (int) ((double) (Class683.aClass301_Sub1_8651.method4092((byte) 30)) * 2607.5945876176133);
										else
											i_111_ = ((-2011409073 * anInt11096 + (int) aFloat11106) & 0x3fff);
										int i_112_ = Class447.anIntArray4906[i_111_];
										int i_113_ = Class447.anIntArray4921[i_111_];
										if (6 != (155362615 * Class246.anInt2474)) {
											i_112_ = i_112_ * ((1858649483 * anInt11098) + 256) >> 8;
											i_113_ = (anInt11098 * 1858649483 + 256) * i_113_ >> 8;
										}
										int i_114_ = ((i_109_ * i_113_ + i_110_ * i_112_) >> 14);
										int i_115_ = ((i_113_ * i_110_ - i_109_ * i_112_) >> 14);
										int i_116_;
										int i_117_;
										if (6 == (155362615 * Class246.anInt2474)) {
											i_116_ = (anInt11082 * 289882095 >> 9) + (i_114_ >> 2);
											i_117_ = (182288133 * anInt11236 >> 9) - (i_115_ >> 2);
										} else {
											int i_118_ = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method10874() - 1) * 256;
											Class436 class436 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823);
											i_116_ = (((int) class436.aFloat4850 - i_118_) >> 9) + (i_114_ >> 2);
											i_117_ = (((int) class436.aFloat4853 - i_118_) >> 9) - (i_115_ >> 2);
										}
										if (aBool11188 && 0 != ((Class511.anInt6931 * 1686601581) & 0x40)) {
											InterfaceDefinitions class251_119_ = (Class527.method6429((1625551467 * Class663.anInt8515), anInt11183 * -1059472497, (byte) -44));
											if (null != class251_119_)
												Class521_Sub6.method9389(aString11185, new StringBuilder().append(" ").append(Class40.aString495).toString(), (Class13.anInt161 * 1764906975), 59, (-1484799213 * class251.anInt2711), 1L, i_116_, i_117_, true, false, (long) (((-809980533 * (class251.anInt2546)) << 0) | (-1591767037 * (class251.anInt2559))), true, 1767908968);
											else
												Class270.method3717(134012254);
										} else {
											if (Class670.aClass670_8575 == aClass670_11043)
												Class521_Sub6.method9389((Class38.aClass38_438.method840(Class459.aClass664_5178, 1391934685)), "", -1, 60, -1, 1L, i_116_, i_117_, true, false, 0L, true, 516175864);
											Class521_Sub6.method9389(Class689.aString8692, "", -1869983847 * anInt11035, 23, -1, 1L, i_116_, i_117_, true, false, 0L, true, -64780958);
										}
									}
									continue;
								}
								if (-1769600535 * class251.anInt2562 == InterfaceDefinitions.anInt2541 * -628362163) {
									Class72.aClass251_801 = class251;
									if (bool_87_)
										Class542_Sub1.aBool10717 = true;
									if (bool_92_) {
										int i_120_ = (int) ((double) ((class536_sub31.method9647(-1782022450)) - i_79_ - (-1606950689 * (class251.anInt2573) / 2)) * 2.0 / (double) (Class542.aFloat7181));
										int i_121_ = (int) -((double) ((class536_sub31.method9643((byte) 1)) - i_80_ - (223822141 * (class251.anInt2574) / 2)) * 2.0 / (double) (Class542.aFloat7181));
										int i_122_ = (i_120_ + Class552.anInt7416 * 804924017 + Class542.anInt7185);
										int i_123_ = (Class542.anInt7186 + (i_121_ + (2122662073 * Class391.anInt4063)));
										Class536_Sub18_Sub14 class536_sub18_sub14 = Class682.method8090(532675698);
										if (class536_sub18_sub14 != null) {
											int[] is = new int[3];
											class536_sub18_sub14.method10769(i_122_, i_123_, is, -1100148889);
											if (is != null) {
												if ((Class331_Sub2.aClass549_10049.method6638(82, (byte) 0)) && (anInt11160 * 423156687 > 0)) {
													Class521_Sub4.method9366(is[0], is[1], is[2], 2070080059);
													continue;
												}
												aBool11214 = true;
												Class53.anInt599 = is[0] * -1788295901;
												Class205_Sub16.anInt9942 = is[1] * -1707836011;
												Class151.anInt1713 = 226070799 * is[2];
											}
											anInt11212 = -813335447;
											aBool11193 = false;
											anInt11281 = (Class329.aClass550_3601.method6656(-1088152664) * -1892629569);
											anInt11201 = (Class329.aClass550_3601.method6657(-1987709431) * 841721139);
										}
									} else if (bool_91_ && (anInt11212 * -1577593895 > 0)) {
										if (-1577593895 * anInt11212 == 1 && ((anInt11281 * -1721422785 != (Class329.aClass550_3601.method6656(-1765082351))) || (anInt11201 * 671669755 != (Class329.aClass550_3601.method6657(-1642715304))))) {
											Class514.anInt6989 = (1719889839 * Class552.anInt7416);
											Class459.anInt5180 = (-770408881 * Class391.anInt4063);
											anInt11212 = -1626670894;
										}
										if (2 == -1577593895 * anInt11212) {
											aBool11193 = true;
											Class536_Sub19.method9566(((664891359 * Class514.anInt6989) + (int) ((double) ((-1721422785 * anInt11281) - (Class329.aClass550_3601.method6656(-1464401838))) * 2.0 / (double) (Class542.aFloat7232))), -957842816);
											Class649_Sub1_Sub2_Sub2.method10946(((-1368369545 * Class459.anInt5180) - (int) ((double) ((671669755 * anInt11201) - (Class329.aClass550_3601.method6657(-1256958769))) * 2.0 / (double) (Class542.aFloat7232))), 2139681978);
										}
									} else {
										if (-1577593895 * anInt11212 > 0 && !aBool11193) {
											if ((anInt11040 * 1862126853 == 1 || Class622.method7417((byte) 32)) && (1780207751 * Class70.anInt760) > 2)
												Class670.method8014(-1721422785 * anInt11281, anInt11201 * 671669755, -2024864368);
											else if (Class536_Sub15.method9518(419371655))
												Class670.method8014(-1721422785 * anInt11281, anInt11201 * 671669755, 1697838035);
										}
										anInt11212 = 0;
									}
									continue;
								}
								if (InterfaceDefinitions.anInt2542 * -1789268997 == class251.anInt2562 * -1769600535) {
									if (bool_91_)
										Class205_Sub20.method9094((Class329.aClass550_3601.method6656(-1885086535) - i_79_), (Class329.aClass550_3601.method6657(-2088714956) - i_80_), -1606950689 * class251.anInt2573, 223822141 * class251.anInt2574, 231488724);
									continue;
								}
								if (280161423 * InterfaceDefinitions.anInt2605 == -1769600535 * class251.anInt2562) {
									Class183.method2738(class251, i_79_, i_80_, -1199868975);
									continue;
								}
							}
							if (!class251.aBool2607 && bool_92_) {
								class251.aBool2607 = true;
								if (null != class251.anObjectArray2555) {
									Class536_Sub42 class536_sub42 = new Class536_Sub42();
									class536_sub42.aBool10801 = true;
									class536_sub42.aClass251_10804 = class251;
									class536_sub42.anInt10803 = (class536_sub31.method9647(-2097511203) - i_79_) * 1761425895;
									class536_sub42.anInt10800 = (class536_sub31.method9643((byte) 1) - i_80_) * -1275012151;
									class536_sub42.anObjectArray10802 = class251.anObjectArray2555;
									aClass708_11077.method8335(class536_sub42, -130169937);
								}
							}
							if (class251.aBool2607 && bool_91_ && null != class251.anObjectArray2645) {
								Class536_Sub42 class536_sub42 = new Class536_Sub42();
								class536_sub42.aBool10801 = true;
								class536_sub42.aClass251_10804 = class251;
								class536_sub42.anInt10803 = (Class329.aClass550_3601.method6656(-1303682219) - i_79_) * 1761425895;
								class536_sub42.anInt10800 = (Class329.aClass550_3601.method6657(-1475204099) - i_80_) * -1275012151;
								class536_sub42.anObjectArray10802 = class251.anObjectArray2645;
								aClass708_11077.method8335(class536_sub42, -22741061);
							}
							if (class251.aBool2607 && !bool_91_) {
								class251.aBool2607 = false;
								if (class251.anObjectArray2670 != null) {
									Class536_Sub42 class536_sub42 = new Class536_Sub42();
									class536_sub42.aBool10801 = true;
									class536_sub42.aClass251_10804 = class251;
									class536_sub42.anInt10803 = (Class329.aClass550_3601.method6656(-1021651273) - i_79_) * 1761425895;
									class536_sub42.anInt10800 = (Class329.aClass550_3601.method6657(-1286824459) - i_80_) * -1275012151;
									class536_sub42.anObjectArray10802 = class251.anObjectArray2670;
									aClass708_11181.method8335(class536_sub42, -1891845672);
								}
							}
							if (bool_91_ && class251.anObjectArray2696 != null) {
								Class536_Sub42 class536_sub42 = new Class536_Sub42();
								class536_sub42.aBool10801 = true;
								class536_sub42.aClass251_10804 = class251;
								class536_sub42.anInt10803 = (Class329.aClass550_3601.method6656(-1967193183) - i_79_) * 1761425895;
								class536_sub42.anInt10800 = (Class329.aClass550_3601.method6657(-2069077614) - i_80_) * -1275012151;
								class536_sub42.anObjectArray10802 = class251.anObjectArray2696;
								aClass708_11077.method8335(class536_sub42, 497006881);
							}
							if (!class251.aBool2727 && bool_87_) {
								class251.aBool2727 = true;
								if (class251.anObjectArray2672 != null) {
									Class536_Sub42 class536_sub42 = new Class536_Sub42();
									class536_sub42.aBool10801 = true;
									class536_sub42.aClass251_10804 = class251;
									class536_sub42.anInt10803 = (Class329.aClass550_3601.method6656(-2003521248) - i_79_) * 1761425895;
									class536_sub42.anInt10800 = (Class329.aClass550_3601.method6657(-2094043827) - i_80_) * -1275012151;
									class536_sub42.anObjectArray10802 = class251.anObjectArray2672;
									aClass708_11077.method8335(class536_sub42, -1750133454);
								}
							}
							if (class251.aBool2727 && bool_87_ && class251.anObjectArray2673 != null) {
								Class536_Sub42 class536_sub42 = new Class536_Sub42();
								class536_sub42.aBool10801 = true;
								class536_sub42.aClass251_10804 = class251;
								class536_sub42.anInt10803 = (Class329.aClass550_3601.method6656(-1504006206) - i_79_) * 1761425895;
								class536_sub42.anInt10800 = (Class329.aClass550_3601.method6657(-2112535782) - i_80_) * -1275012151;
								class536_sub42.anObjectArray10802 = class251.anObjectArray2673;
								aClass708_11077.method8335(class536_sub42, -1783657481);
							}
							if (class251.aBool2727 && !bool_87_) {
								class251.aBool2727 = false;
								if (class251.anObjectArray2674 != null) {
									Class536_Sub42 class536_sub42 = new Class536_Sub42();
									class536_sub42.aBool10801 = true;
									class536_sub42.aClass251_10804 = class251;
									class536_sub42.anInt10803 = (Class329.aClass550_3601.method6656(-1165521671) - i_79_) * 1761425895;
									class536_sub42.anInt10800 = (Class329.aClass550_3601.method6657(-1202268946) - i_80_) * -1275012151;
									class536_sub42.anObjectArray10802 = class251.anObjectArray2674;
									aClass708_11181.method8335(class536_sub42, -1627323438);
								}
							}
							if (class251.anObjectArray2543 != null) {
								Class536_Sub42 class536_sub42 = new Class536_Sub42();
								class536_sub42.aClass251_10804 = class251;
								class536_sub42.anObjectArray10802 = class251.anObjectArray2543;
								aClass708_11241.method8335(class536_sub42, -768260215);
							}
							if (class251.anObjectArray2662 != null && (381884669 * anInt11225 > -1995454871 * class251.anInt2733)) {
								if (class251.anIntArray2686 == null || ((381884669 * anInt11225 - -1995454871 * class251.anInt2733) > 64)) {
									Class536_Sub42 class536_sub42 = new Class536_Sub42();
									class536_sub42.aClass251_10804 = class251;
									class536_sub42.anObjectArray10802 = class251.anObjectArray2662;
									aClass708_11077.method8335(class536_sub42, -100130260);
								} else {
									while_55_: for (int i_124_ = (-1995454871 * class251.anInt2733); i_124_ < anInt11225 * 381884669; i_124_++) {
										int i_125_ = anIntArray11224[i_124_ & 0x3f];
										for (int i_126_ = 0; i_126_ < (class251.anIntArray2686).length; i_126_++) {
											if (i_125_ == (class251.anIntArray2686[i_126_])) {
												Class536_Sub42 class536_sub42 = new Class536_Sub42();
												class536_sub42.aClass251_10804 = class251;
												class536_sub42.anObjectArray10802 = (class251.anObjectArray2662);
												aClass708_11077.method8335(class536_sub42, -901817340);
												break while_55_;
											}
										}
									}
								}
								class251.anInt2733 = anInt11225 * 771928949;
							}
							if (class251.anObjectArray2710 != null && (1393118255 * anInt11227 > class251.anInt2734 * -1334473985)) {
								if (null == class251.anIntArray2688 || ((1393118255 * anInt11227 - -1334473985 * class251.anInt2734) > 64)) {
									Class536_Sub42 class536_sub42 = new Class536_Sub42();
									class536_sub42.aClass251_10804 = class251;
									class536_sub42.anObjectArray10802 = class251.anObjectArray2710;
									aClass708_11077.method8335(class536_sub42, 172890875);
								} else {
									while_56_: for (int i_127_ = (class251.anInt2734 * -1334473985); i_127_ < anInt11227 * 1393118255; i_127_++) {
										int i_128_ = anIntArray11297[i_127_ & 0x3f];
										for (int i_129_ = 0; i_129_ < (class251.anIntArray2688).length; i_129_++) {
											if (class251.anIntArray2688[i_129_] == i_128_) {
												Class536_Sub42 class536_sub42 = new Class536_Sub42();
												class536_sub42.aClass251_10804 = class251;
												class536_sub42.anObjectArray10802 = (class251.anObjectArray2710);
												aClass708_11077.method8335(class536_sub42, -1500290458);
												break while_56_;
											}
										}
									}
								}
								class251.anInt2734 = 1223110353 * anInt11227;
							}
							if (null != class251.anObjectArray2679 && (2051607825 * anInt11219 > -2145838891 * class251.anInt2730)) {
								if (class251.anIntArray2680 == null || ((anInt11219 * 2051607825 - -2145838891 * class251.anInt2730) > 64)) {
									Class536_Sub42 class536_sub42 = new Class536_Sub42();
									class536_sub42.aClass251_10804 = class251;
									class536_sub42.anObjectArray10802 = class251.anObjectArray2679;
									aClass708_11077.method8335(class536_sub42, -1695788196);
								} else {
									while_57_: for (int i_130_ = (-2145838891 * class251.anInt2730); i_130_ < 2051607825 * anInt11219; i_130_++) {
										int i_131_ = anIntArray11177[i_130_ & 0x3f];
										for (int i_132_ = 0; i_132_ < (class251.anIntArray2680).length; i_132_++) {
											if (i_131_ == (class251.anIntArray2680[i_132_])) {
												Class536_Sub42 class536_sub42 = new Class536_Sub42();
												class536_sub42.aClass251_10804 = class251;
												class536_sub42.anObjectArray10802 = (class251.anObjectArray2679);
												aClass708_11077.method8335(class536_sub42, -66168648);
												break while_57_;
											}
										}
									}
								}
								class251.anInt2730 = -319504051 * anInt11219;
							}
							if (class251.anObjectArray2669 != null && (anInt11221 * -111956463 > -1441975605 * class251.anInt2731)) {
								if (class251.anIntArray2561 == null || ((-111956463 * anInt11221 - -1441975605 * class251.anInt2731) > 64)) {
									Class536_Sub42 class536_sub42 = new Class536_Sub42();
									class536_sub42.aClass251_10804 = class251;
									class536_sub42.anObjectArray10802 = class251.anObjectArray2669;
									aClass708_11077.method8335(class536_sub42, -1916329693);
								} else {
									while_58_: for (int i_133_ = (class251.anInt2731 * -1441975605); i_133_ < -111956463 * anInt11221; i_133_++) {
										int i_134_ = anIntArray11220[i_133_ & 0x3f];
										for (int i_135_ = 0; i_135_ < (class251.anIntArray2561).length; i_135_++) {
											if (class251.anIntArray2561[i_135_] == i_134_) {
												Class536_Sub42 class536_sub42 = new Class536_Sub42();
												class536_sub42.aClass251_10804 = class251;
												class536_sub42.anObjectArray10802 = (class251.anObjectArray2669);
												aClass708_11077.method8335(class536_sub42, -1835010829);
												break while_58_;
											}
										}
									}
								}
								class251.anInt2731 = 1254660883 * anInt11221;
							}
							if (class251.anObjectArray2683 != null && (-323786587 * anInt11056 > class251.anInt2732 * -1932384497)) {
								if (null == class251.anIntArray2684 || ((anInt11056 * -323786587 - class251.anInt2732 * -1932384497) > 64)) {
									Class536_Sub42 class536_sub42 = new Class536_Sub42();
									class536_sub42.aClass251_10804 = class251;
									class536_sub42.anObjectArray10802 = class251.anObjectArray2683;
									aClass708_11077.method8335(class536_sub42, -706623968);
								} else {
									while_59_: for (int i_136_ = (class251.anInt2732 * -1932384497); i_136_ < anInt11056 * -323786587; i_136_++) {
										int i_137_ = anIntArray11222[i_136_ & 0x3f];
										for (int i_138_ = 0; i_138_ < (class251.anIntArray2684).length; i_138_++) {
											if (i_137_ == (class251.anIntArray2684[i_138_])) {
												Class536_Sub42 class536_sub42 = new Class536_Sub42();
												class536_sub42.aClass251_10804 = class251;
												class536_sub42.anObjectArray10802 = (class251.anObjectArray2683);
												aClass708_11077.method8335(class536_sub42, -973617036);
												break while_59_;
											}
										}
									}
								}
								class251.anInt2732 = 34641163 * anInt11056;
							}
							if (null != class251.anObjectArray2689 && (anInt11229 * 1597313657 > 300099435 * class251.anInt2735)) {
								if (class251.anIntArray2690 == null || ((anInt11229 * 1597313657 - 300099435 * class251.anInt2735) > 64)) {
									Class536_Sub42 class536_sub42 = new Class536_Sub42();
									class536_sub42.aClass251_10804 = class251;
									class536_sub42.anObjectArray10802 = class251.anObjectArray2689;
									aClass708_11077.method8335(class536_sub42, -2054274966);
								} else {
									while_60_: for (int i_139_ = class251.anInt2735 * 300099435; i_139_ < 1597313657 * anInt11229; i_139_++) {
										int i_140_ = anIntArray11139[i_139_ & 0x3f];
										for (int i_141_ = 0; i_141_ < (class251.anIntArray2690).length; i_141_++) {
											if (class251.anIntArray2690[i_141_] == i_140_) {
												Class536_Sub42 class536_sub42 = new Class536_Sub42();
												class536_sub42.aClass251_10804 = class251;
												class536_sub42.anObjectArray10802 = (class251.anObjectArray2689);
												aClass708_11077.method8335(class536_sub42, -536163049);
												break while_60_;
											}
										}
									}
								}
								class251.anInt2735 = -117261653 * anInt11229;
							}
							if ((anInt11162 * -1322175201 > class251.anInt2729 * 317675385) && class251.anObjectArray2695 != null) {
								Class536_Sub42 class536_sub42 = new Class536_Sub42();
								class536_sub42.aClass251_10804 = class251;
								class536_sub42.anObjectArray10802 = class251.anObjectArray2695;
								aClass708_11077.method8335(class536_sub42, -567402539);
							}
							if ((anInt11231 * -1945388451 > class251.anInt2729 * 317675385) && class251.anObjectArray2697 != null) {
								Class536_Sub42 class536_sub42 = new Class536_Sub42();
								class536_sub42.aClass251_10804 = class251;
								class536_sub42.anObjectArray10802 = class251.anObjectArray2697;
								aClass708_11077.method8335(class536_sub42, -1544653993);
							}
							if ((1583970115 * anInt11232 > class251.anInt2729 * 317675385) && null != class251.anObjectArray2698) {
								Class536_Sub42 class536_sub42 = new Class536_Sub42();
								class536_sub42.aClass251_10804 = class251;
								class536_sub42.anObjectArray10802 = class251.anObjectArray2698;
								aClass708_11077.method8335(class536_sub42, 268896445);
							}
							if ((anInt11226 * -1277837443 > class251.anInt2729 * 317675385) && class251.anObjectArray2544 != null) {
								Class536_Sub42 class536_sub42 = new Class536_Sub42();
								class536_sub42.aClass251_10804 = class251;
								class536_sub42.anObjectArray10802 = class251.anObjectArray2544;
								aClass708_11077.method8335(class536_sub42, -32842548);
							}
							if ((803578401 * anInt11234 > 317675385 * class251.anInt2729) && null != class251.anObjectArray2701) {
								Class536_Sub42 class536_sub42 = new Class536_Sub42();
								class536_sub42.aClass251_10804 = class251;
								class536_sub42.anObjectArray10802 = class251.anObjectArray2701;
								aClass708_11077.method8335(class536_sub42, -1978606583);
							}
							if ((-1198553069 * anInt11144 > 317675385 * class251.anInt2729) && class251.anObjectArray2702 != null) {
								Class536_Sub42 class536_sub42 = new Class536_Sub42();
								class536_sub42.aClass251_10804 = class251;
								class536_sub42.anObjectArray10802 = class251.anObjectArray2702;
								aClass708_11077.method8335(class536_sub42, -1649547896);
							}
							if ((anInt11030 * 379169375 > 317675385 * class251.anInt2729) && class251.anObjectArray2628 != null) {
								Class536_Sub42 class536_sub42 = new Class536_Sub42();
								class536_sub42.aClass251_10804 = class251;
								class536_sub42.anObjectArray10802 = class251.anObjectArray2628;
								aClass708_11077.method8335(class536_sub42, 825894593);
							}
							if ((anInt11268 * -1070471587 > class251.anInt2729 * 317675385) && null != class251.anObjectArray2707) {
								Class536_Sub42 class536_sub42 = new Class536_Sub42();
								class536_sub42.aClass251_10804 = class251;
								class536_sub42.anObjectArray10802 = class251.anObjectArray2707;
								aClass708_11077.method8335(class536_sub42, -1932189289);
							}
							if ((anInt11238 * 1184623885 > 317675385 * class251.anInt2729) && class251.anObjectArray2599 != null) {
								Class536_Sub42 class536_sub42 = new Class536_Sub42();
								class536_sub42.aClass251_10804 = class251;
								class536_sub42.anObjectArray10802 = class251.anObjectArray2599;
								aClass708_11077.method8335(class536_sub42, -1288857864);
							}
							if ((anInt11239 * -811824111 > class251.anInt2729 * 317675385) && class251.anObjectArray2709 != null) {
								Class536_Sub42 class536_sub42 = new Class536_Sub42();
								class536_sub42.aClass251_10804 = class251;
								class536_sub42.anObjectArray10802 = class251.anObjectArray2709;
								aClass708_11077.method8335(class536_sub42, 217809580);
							}
							class251.anInt2729 = 2144315381 * anInt11215;
							if (class251.anObjectArray2538 != null) {
								for (int i_142_ = 0; i_142_ < anInt11033 * -1816034791; i_142_++) {
									Class536_Sub42 class536_sub42 = new Class536_Sub42();
									class536_sub42.aClass251_10804 = class251;
									class536_sub42.anInt10807 = (anInterface63Array11034[i_142_].method413(757744496) * -1268278061);
									class536_sub42.anInt10808 = (anInterface63Array11034[i_142_].method412((byte) -3) * -1403803033);
									class536_sub42.anObjectArray10802 = class251.anObjectArray2538;
									aClass708_11077.method8335(class536_sub42, -1660442700);
								}
							}
							if (aBool11120 && null != class251.anObjectArray2661) {
								Class536_Sub42 class536_sub42 = new Class536_Sub42();
								class536_sub42.aClass251_10804 = class251;
								class536_sub42.anObjectArray10802 = class251.anObjectArray2661;
								aClass708_11077.method8335(class536_sub42, 518170566);
							}
						}
						if (5 == 1049444347 * class251.anInt2728 && 2028683203 * class251.anInt2716 != -1)
							class251.method3472(Class459.aClass34_Sub9_5179, Class144.aClass34_Sub12_1680, (byte) 92).method6151(Class677.aClass167_8609, 223822141 * class251.anInt2574, Class710.aClass536_Sub40_8843.aClass710_Sub25_10735.method10142(1777467965), -1750786846);
						Class534.method6470(class251, 2062935527);
						if (0 == class251.anInt2728 * 1049444347) {
							method10381(class234, class251s, -1591767037 * class251.anInt2559, i_81_, i_82_, i_83_, i_84_, (i_79_ - class251.anInt2581 * 1428895931), (i_80_ - class251.anInt2584 * -2092413585), i_76_, i_77_);
							if (null != class251.aClass251Array2726)
								method10381(class234, class251.aClass251Array2726, class251.anInt2559 * -1591767037, i_81_, i_82_, i_83_, i_84_, i_79_ - (class251.anInt2581 * 1428895931), i_80_ - (-2092413585 * class251.anInt2584), i_76_, i_77_);
							Class536_Sub36 class536_sub36 = ((Class536_Sub36) (aClass4_11008.method556((long) (-1591767037 * class251.anInt2559))));
							if (null != class536_sub36)
								Class155.method1879(class536_sub36, class536_sub36.anInt10634 * -358726121, i_81_, i_82_, i_83_, i_84_, i_79_ - class251.anInt2581 * 1428895931, i_80_ - -2092413585 * class251.anInt2584, i_76_, i_77_, (byte) -11);
						}
					}
				}
			}
		}
	}

	static InterfaceDefinitions method10382(InterfaceDefinitions class251) {
		IComponentSettings class536_sub14 = method10389(class251);
		if (class536_sub14.method9477(377974859))
			return Class107.aClass251_1323;
		int i = class536_sub14.method9494(-1411037171);
		if (0 == i)
			return null;
		for (int i_143_ = 0; i_143_ < i; i_143_++) {
			class251 = Class648.method7834(Class402.method4924((-1591767037 * (class251.anInt2559)), -1178274465), class251, -16777216);
			if (class251 == null)
				return Class107.aClass251_1323;
		}
		return class251;
	}

	void method10383(int i) {
		Class226.anIterator2357 = aList11233.iterator();
		while (Class226.anIterator2357.hasNext()) {
			int i_144_ = ((Integer) Class226.anIterator2357.next()).intValue();
			if (Class398.aClass461_4122.method5580(i_144_, -964514165))
				Class226.anIterator2357.remove();
		}
	}

	public String method6107() {
		String string = " ";
		try {
			Class598 class598 = aClass515_11066.method6255(-1635943853);
			string = new StringBuilder().append(string).append(1858049507 * class598.anInt7839).append(Class40.aString491).append(class598.anInt7840 * 1479112045).append(Class40.aString491).append(aClass515_11066.method6321((byte) 0)).append(Class40.aString491).append(aClass515_11066.method6243(177401017)).append(" ").toString();
			if (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 != null)
				string = new StringBuilder().append(string).append(-989431627 * Class320.anInt3539).append(Class40.aString491).append(class598.anInt7839 * 1858049507 + (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenX[0])).append(Class40.aString491).append(1479112045 * class598.anInt7840 + (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenY[0])).append(" ").toString();
			else
				string = new StringBuilder().append(string).append(Class320.anInt3539 * -989431627).append(Class40.aString491).append(-989431627 * Class320.anInt3539).append(Class40.aString491).append(Class320.anInt3539 * -989431627).append(Class40.aString491).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub15_10767.method10071(353272034)).append(" ").append(Class710.aClass536_Sub40_8843.aClass710_Sub27_10746.method10156(323433252)).append(" ").append(Class315.method4212((byte) 36)).append(" ").append(Class144.anInt1679 * -1804846931).append(Class40.aString491).append(Class34_Sub6.anInt10965 * 589116499).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub14_10755.method10066((byte) 0)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub9_10756.method10004(391157968)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub3_10754.method9894(-1017210055)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub2_10765.method9885(-1443859728)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub34_10787.method10204(1867269829)).append(" ").toString();
			string = new StringBuilder().append(string).append("0 ").toString();
			string = new StringBuilder().append(string).append(anInt6857 * -839563813).append(" ").toString();
			string = new StringBuilder().append(string).append(anInt11101 * -708374433).append(" ").toString();
			if (Class458_Sub4.aClass536_Sub38_10336 != null)
				string = new StringBuilder().append(string).append(-853108975 * Class458_Sub4.aClass536_Sub38_10336.anInt10684).toString();
			else
				string = new StringBuilder().append(string).append(-1).toString();
			string = new StringBuilder().append(string).append(" ").toString();
			if (aString11004 != null)
				string = new StringBuilder().append(string).append(aString11004).toString();
			else
				string = new StringBuilder().append(string).append(Class40.aString491).toString();
		} catch (Throwable throwable) {
			/* empty */
		}
		return string;
	}

	final void method6112() {
		Frame frame = new Frame(" ");
		frame.pack();
		frame.dispose();
		Class107.aClass251_1323 = new InterfaceDefinitions();
		Class66.method1075(-941885011);
		Class298.method4015(new int[] { 20, 260, 2048, 5120, 10240, 75000, 100000, 153600 }, new int[] { 1000, 100, 1000, 250, 500, 100, 100, 10 }, 1899442467);
		Class436.method5260(100);
		Class425.method5109(10);
		Class147.method1816(100, (byte) -19);
		Class392_Sub3.method9310(100, 1513507978);
		if (Class678.aClass678_8619 != Class47.aClass678_578)
			Class692.aByteArrayArray8722 = new byte[50][];
		Class710.aClass536_Sub40_8843 = Class82.method1170(909285016);
		if (Class710.aClass536_Sub40_8843.aClass710_Sub41_10784.method10248(65533) == 1)
			Class553.aBool7469 = false;
		switch (Class710.aClass536_Sub40_8843.aClass710_Sub39_10783.method10236(-2097978014)) {
		case 3:
			Class111.aBool1389 = true;
			Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub39_10783), 0, (byte) 1);
			Class398.method4898(Class63.aClass63_703, (byte) 0);
			break;
		default:
			break;
		case 4:
			Class111.aBool1387 = true;
			Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub39_10783), 0, (byte) 1);
			Class398.method4898(Class63.aClass63_716, (byte) 0);
		}
		if (null == Class23.aClass5_222.aString112)
			Class23.aClass5_222.aString112 = Class622.anApplet8126.getCodeBase().getHost();
		Class23.aClass5_221 = Class23.aClass5_222;
		Class246.aClass466_2473 = new Class466();
		Class176.aClass460_1936 = new Class460_Sub1();
		Class183_Sub2.aClass449_9812 = new Class449(Class23.aClass5_220.aString112, Class23.aClass5_220.anInt110 * -843966029, 273023065 * aClass670_11043.anInt8567);
		if (aClass670_11043 == Class670.aClass670_8568)
			aBool11197 = false;
		Class612.aShortArray7932 = Class296.aShortArray3267 = ItemDefinitions.aShortArray14 = new short[256];
		try {
			Class400.aClipboard4137 = Class300.method4022((byte) 0).getToolkit().getSystemClipboard();
		} catch (Exception exception) {
			/* empty */
		}
		Class331_Sub2.aClass549_10049 = Class50.method928(Class399.aCanvas4127, -1160310842);
		Class329.aClass550_3601 = Class34_Sub22.method10370(Class399.aCanvas4127, true, 1162187039);
		if (null != aClass18_6879)
			Class653.aClass547_8490 = new Class547(255, aClass18_6879, aClass18_6880, 2000000);
		Class683.aClass301_Sub1_8651 = new Class301_Sub1(aClass24_11138);
		try {
			Class683.aClass301_Sub1_8651.method4033(Class293.aClass293_3246, -693000904);
			Class683.aClass301_Sub1_8651.method4031(Class290.aClass290_3222, false, 266657894);
			Class683.aClass301_Sub1_8651.method4082(Class300.aClass300_3355, false, (byte) 0);
			Class683.aClass301_Sub1_8651.method4031(Class290.aClass290_3222, false, -1924333503);
			Class683.aClass301_Sub1_8651.method4039(Class436.method5257(99999.0F, 99999.0F, 99999.0F), 1727661220);
			Class683.aClass301_Sub1_8651.method4037(Class436.method5257(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), 2070216072);
			Class683.aClass301_Sub1_8651.method4040(Class436.method5257(99999.0F, 99999.0F, 99999.0F), (byte) 120);
			Class683.aClass301_Sub1_8651.method4036(Class436.method5257(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), 263350573);
		} catch (Exception_Sub3 exception_sub3) {
			/* empty */
		}
		Class147.method1809(Class622.anApplet8126, Class241.aString2456, -548497307);
		if (Class678.aClass678_8619 != Class47.aClass678_578 && Class678.aClass678_8618 != Class47.aClass678_578)
			aBool11314 = true;
		aString6881 = Class38.aClass38_402.method840(Class459.aClass664_5178, 1752354939);
		Class266.aClass503_2867 = new Class503();
		new Thread(Class266.aClass503_2867).start();
		Class208.aClass60_2245 = new Class60();
		Class613.aClass263_8014 = new Class263();
	}

	final void method6116() {
		Frame frame = new Frame(" ");
		frame.pack();
		frame.dispose();
		Class107.aClass251_1323 = new InterfaceDefinitions();
		Class66.method1075(-105245521);
		Class298.method4015(new int[] { 20, 260, 2048, 5120, 10240, 75000, 100000, 153600 }, new int[] { 1000, 100, 1000, 250, 500, 100, 100, 10 }, 1873212260);
		Class436.method5260(100);
		Class425.method5109(10);
		Class147.method1816(100, (byte) -54);
		Class392_Sub3.method9310(100, 1243865597);
		if (Class678.aClass678_8619 != Class47.aClass678_578)
			Class692.aByteArrayArray8722 = new byte[50][];
		Class710.aClass536_Sub40_8843 = Class82.method1170(406238057);
		if (Class710.aClass536_Sub40_8843.aClass710_Sub41_10784.method10248(65533) == 1)
			Class553.aBool7469 = false;
		switch (Class710.aClass536_Sub40_8843.aClass710_Sub39_10783.method10236(-2108491748)) {
		case 3:
			Class111.aBool1389 = true;
			Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub39_10783), 0, (byte) 1);
			Class398.method4898(Class63.aClass63_703, (byte) 0);
			break;
		default:
			break;
		case 4:
			Class111.aBool1387 = true;
			Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub39_10783), 0, (byte) 1);
			Class398.method4898(Class63.aClass63_716, (byte) 0);
		}
		if (null == Class23.aClass5_222.aString112)
			Class23.aClass5_222.aString112 = Class622.anApplet8126.getCodeBase().getHost();
		Class23.aClass5_221 = Class23.aClass5_222;
		Class246.aClass466_2473 = new Class466();
		Class176.aClass460_1936 = new Class460_Sub1();
		Class183_Sub2.aClass449_9812 = new Class449(Class23.aClass5_220.aString112, Class23.aClass5_220.anInt110 * -843966029, 273023065 * aClass670_11043.anInt8567);
		if (aClass670_11043 == Class670.aClass670_8568)
			aBool11197 = false;
		Class612.aShortArray7932 = Class296.aShortArray3267 = ItemDefinitions.aShortArray14 = new short[256];
		try {
			Class400.aClipboard4137 = Class300.method4022((byte) 0).getToolkit().getSystemClipboard();
		} catch (Exception exception) {
			/* empty */
		}
		Class331_Sub2.aClass549_10049 = Class50.method928(Class399.aCanvas4127, 1386438148);
		Class329.aClass550_3601 = Class34_Sub22.method10370(Class399.aCanvas4127, true, 1788217942);
		if (null != aClass18_6879)
			Class653.aClass547_8490 = new Class547(255, aClass18_6879, aClass18_6880, 2000000);
		Class683.aClass301_Sub1_8651 = new Class301_Sub1(aClass24_11138);
		try {
			Class683.aClass301_Sub1_8651.method4033(Class293.aClass293_3246, -693000904);
			Class683.aClass301_Sub1_8651.method4031(Class290.aClass290_3222, false, -1259846537);
			Class683.aClass301_Sub1_8651.method4082(Class300.aClass300_3355, false, (byte) 0);
			Class683.aClass301_Sub1_8651.method4031(Class290.aClass290_3222, false, -1364616907);
			Class683.aClass301_Sub1_8651.method4039(Class436.method5257(99999.0F, 99999.0F, 99999.0F), -2135871521);
			Class683.aClass301_Sub1_8651.method4037(Class436.method5257(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), 1423216907);
			Class683.aClass301_Sub1_8651.method4040(Class436.method5257(99999.0F, 99999.0F, 99999.0F), (byte) 102);
			Class683.aClass301_Sub1_8651.method4036(Class436.method5257(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), 263350573);
		} catch (Exception_Sub3 exception_sub3) {
			/* empty */
		}
		Class147.method1809(Class622.anApplet8126, Class241.aString2456, -1199868989);
		if (Class678.aClass678_8619 != Class47.aClass678_578 && Class678.aClass678_8618 != Class47.aClass678_578)
			aBool11314 = true;
		aString6881 = Class38.aClass38_402.method840(Class459.aClass664_5178, 1391890372);
		Class266.aClass503_2867 = new Class503();
		new Thread(Class266.aClass503_2867).start();
		Class208.aClass60_2245 = new Class60();
		Class613.aClass263_8014 = new Class263();
	}

	final void method6101() {
		Frame frame = new Frame(" ");
		frame.pack();
		frame.dispose();
		Class107.aClass251_1323 = new InterfaceDefinitions();
		Class66.method1075(-1216112093);
		Class298.method4015(new int[] { 20, 260, 2048, 5120, 10240, 75000, 100000, 153600 }, new int[] { 1000, 100, 1000, 250, 500, 100, 100, 10 }, 2145187823);
		Class436.method5260(100);
		Class425.method5109(10);
		Class147.method1816(100, (byte) -127);
		Class392_Sub3.method9310(100, 1195609767);
		if (Class678.aClass678_8619 != Class47.aClass678_578)
			Class692.aByteArrayArray8722 = new byte[50][];
		Class710.aClass536_Sub40_8843 = Class82.method1170(1926486355);
		if (Class710.aClass536_Sub40_8843.aClass710_Sub41_10784.method10248(65533) == 1)
			Class553.aBool7469 = false;
		switch (Class710.aClass536_Sub40_8843.aClass710_Sub39_10783.method10236(-2060107898)) {
		case 3:
			Class111.aBool1389 = true;
			Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub39_10783), 0, (byte) 1);
			Class398.method4898(Class63.aClass63_703, (byte) 0);
			break;
		default:
			break;
		case 4:
			Class111.aBool1387 = true;
			Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub39_10783), 0, (byte) 1);
			Class398.method4898(Class63.aClass63_716, (byte) 0);
		}
		if (null == Class23.aClass5_222.aString112)
			Class23.aClass5_222.aString112 = Class622.anApplet8126.getCodeBase().getHost();
		Class23.aClass5_221 = Class23.aClass5_222;
		Class246.aClass466_2473 = new Class466();
		Class176.aClass460_1936 = new Class460_Sub1();
		Class183_Sub2.aClass449_9812 = new Class449(Class23.aClass5_220.aString112, Class23.aClass5_220.anInt110 * -843966029, 273023065 * aClass670_11043.anInt8567);
		if (aClass670_11043 == Class670.aClass670_8568)
			aBool11197 = false;
		Class612.aShortArray7932 = Class296.aShortArray3267 = ItemDefinitions.aShortArray14 = new short[256];
		try {
			Class400.aClipboard4137 = Class300.method4022((byte) 0).getToolkit().getSystemClipboard();
		} catch (Exception exception) {
			/* empty */
		}
		Class331_Sub2.aClass549_10049 = Class50.method928(Class399.aCanvas4127, 1919811309);
		Class329.aClass550_3601 = Class34_Sub22.method10370(Class399.aCanvas4127, true, 1642645538);
		if (null != aClass18_6879)
			Class653.aClass547_8490 = new Class547(255, aClass18_6879, aClass18_6880, 2000000);
		Class683.aClass301_Sub1_8651 = new Class301_Sub1(aClass24_11138);
		try {
			Class683.aClass301_Sub1_8651.method4033(Class293.aClass293_3246, -693000904);
			Class683.aClass301_Sub1_8651.method4031(Class290.aClass290_3222, false, -1217383631);
			Class683.aClass301_Sub1_8651.method4082(Class300.aClass300_3355, false, (byte) 0);
			Class683.aClass301_Sub1_8651.method4031(Class290.aClass290_3222, false, -1777192503);
			Class683.aClass301_Sub1_8651.method4039(Class436.method5257(99999.0F, 99999.0F, 99999.0F), -1188490810);
			Class683.aClass301_Sub1_8651.method4037(Class436.method5257(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), -737972145);
			Class683.aClass301_Sub1_8651.method4040(Class436.method5257(99999.0F, 99999.0F, 99999.0F), (byte) 120);
			Class683.aClass301_Sub1_8651.method4036(Class436.method5257(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), 263350573);
		} catch (Exception_Sub3 exception_sub3) {
			/* empty */
		}
		Class147.method1809(Class622.anApplet8126, Class241.aString2456, -1516717997);
		if (Class678.aClass678_8619 != Class47.aClass678_578 && Class678.aClass678_8618 != Class47.aClass678_578)
			aBool11314 = true;
		aString6881 = Class38.aClass38_402.method840(Class459.aClass664_5178, 1930511470);
		Class266.aClass503_2867 = new Class503();
		new Thread(Class266.aClass503_2867).start();
		Class208.aClass60_2245 = new Class60();
		Class613.aClass263_8014 = new Class263();
	}

	final void method6102() {
		if (2 != -708374433 * anInt11101) {
			long l = (Class614.method7323(1515703878) / 1000000L - 8534821430371810531L * aLong11237);
			aLong11237 = (Class614.method7323(1527377495) / 1000000L * -6183332289911379765L);
			if (Class536_Sub37.method9820(-708374433 * anInt11101, 1173314743)) {
				if (0L != aLong11148 * 8767938331932336319L && (Class249.method3450(1682105319) > aLong11148 * 8767938331932336319L))
					Class15.method640(Class315.method4212((byte) 68), -1, -1, false, -1796828336);
				else if (!Class677.aClass167_8609.method2010() && aBool6865)
					Class388.method4851(2123562542);
			}
			if (null == Class223.aFrame2336)
				Class205_Sub1.method9054(1560514996);
			if (Class707.aBool8822 && null != Class223.aFrame2336 && !Class67_Sub1.aBool10601 && Class536_Sub37.method9820(anInt11101 * -708374433, 1827829260))
				Class15.method640(Class710.aClass536_Sub40_8843.aClass710_Sub12_10769.method10038(-1042972821), -1, -1, false, -2121616874);
			boolean bool = false;
			if (aBool6889) {
				aBool6889 = false;
				bool = true;
			}
			if (bool)
				Class477.method5751((byte) -73);
			if ((null != Class677.aClass167_8609 && Class677.aClass167_8609.method2010()) || Class315.method4212((byte) 69) != 1)
				Class552.method6692(-1878955427);
			if (Class482.method5837(-708374433 * anInt11101, -726766203))
				Class560.method6828(bool, (byte) 79);
			else if (Class285.method3842(anInt11101 * -708374433, 1873689221))
				Class66.method1076(1828859215);
			else if (Class270.method3716(-708374433 * anInt11101, -1931318899))
				Class66.method1076(1622939948);
			else if (Class578.method7007(anInt11101 * -708374433, 1815537384)) {
				if (aClass515_11066.method6298(-2089480711) == Class516.aClass516_7036) {
					int i = aClass515_11066.method6242((byte) -19) / 2;
					Class306.method4120(new StringBuilder().append(Class38.aClass38_402.method840(Class459.aClass664_5178, 1878255772)).append(Class40.aString496).append("(").append(i).append("%)").toString(), true, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
				} else if (aClass515_11066.method6298(-2089480711) == Class516.aClass516_7038) {
					int i = 50 + aClass515_11066.method6257(-1421043170) / 2;
					Class306.method4120(new StringBuilder().append(Class38.aClass38_402.method840(Class459.aClass664_5178, 1922781871)).append(Class40.aString496).append("(").append(i).append("%)").toString(), true, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
				} else
					Class306.method4120(Class38.aClass38_402.method840(Class459.aClass664_5178, 1614260358), true, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
			} else if (9 == -708374433 * anInt11101)
				Class315.method4213(l);
			else if (-708374433 * anInt11101 == 17)
				Class306.method4120(new StringBuilder().append(Class38.aClass38_415.method840(Class459.aClass664_5178, 2059767199)).append(Class40.aString496).append(Class38.aClass38_405.method840(Class459.aClass664_5178, 2035308662)).toString(), false, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
			else if (19 == anInt11101 * -708374433)
				Class306.method4120(Class38.aClass38_442.method840(Class459.aClass664_5178, 1365526410), false, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
			if (anInt11016 * -176554429 == 3) {
				for (int i = 0; i < anInt11245 * -5823823; i++) {
					Rectangle rectangle = aRectangleArray11249[i];
					if (aBoolArray11029[i])
						Class677.aClass167_8609.method2056(rectangle.x, rectangle.y, rectangle.width, rectangle.height, -65281, 902328500);
					else
						Class677.aClass167_8609.method2056(rectangle.x, rectangle.y, rectangle.width, rectangle.height, -16711936, -1684120270);
				}
			}
			if (Class44.method882(1809136421))
				Class26.method739(Class677.aClass167_8609, -2073531924);
			if (!Class482.method5837(-708374433 * anInt11101, -1265711625) && !Class578.method7007(-708374433 * anInt11101, 1962073642) && -1 != anInt11187 * -1959825479) {
				try {
					Class677.aClass167_8609.method2084();
					Class204.method2932(Class677.aClass167_8609, Class249.method3450(1484174392), Class144.anInt1679 * -1804846931, Class34_Sub6.anInt10965 * 589116499, -1249354505);
					Class677.aClass167_8609.method2002((byte) 44);
				} catch (Exception_Sub5 exception_sub5) {
					Class81.method1165(new StringBuilder().append(exception_sub5.getMessage()).append(" ").append(method6092(2103922567)).toString(), exception_sub5, (byte) -16);
					switch (Class710.aClass536_Sub40_8843.aClass710_Sub15_10767.method10071(775701252)) {
					case 3:
						Class560.method6827(exception_sub5.method10533(2018184697), (byte) -52);
						Class704.method8264(1, false, (byte) 93);
						break;
					default:
						Class704.method8264(0, false, (byte) 23);
					}
				}
			}
			int i = Class710.aClass536_Sub40_8843.aClass710_Sub26_10758.method10149(-664631943);
			if (i == 0)
				Class212.method3067(15L);
			else if (1 == i)
				Class212.method3067(10L);
			else if (2 == i)
				Class212.method3067(5L);
			else if (i == 3)
				Class212.method3067(2L);
			if (aBool11103)
				Class679.method8065((byte) -47);
			if (Class710.aClass536_Sub40_8843.aClass710_Sub39_10783.method10236(-2098672430) == 1 && 16 == -708374433 * anInt11101 && -1 != anInt11187 * -1959825479) {
				Class710.aClass536_Sub40_8843.method9857(Class710.aClass536_Sub40_8843.aClass710_Sub39_10783, 0, (byte) 1);
				Class27.method763(2032833723);
			}
		}
	}

	final void method6103() {
		if (2 != -708374433 * anInt11101) {
			long l = (Class614.method7323(560822037) / 1000000L - 8534821430371810531L * aLong11237);
			aLong11237 = (Class614.method7323(1711848046) / 1000000L * -6183332289911379765L);
			if (Class536_Sub37.method9820(-708374433 * anInt11101, 538015912)) {
				if (0L != aLong11148 * 8767938331932336319L && (Class249.method3450(2060476474) > aLong11148 * 8767938331932336319L))
					Class15.method640(Class315.method4212((byte) 94), -1, -1, false, -1594040179);
				else if (!Class677.aClass167_8609.method2010() && aBool6865)
					Class388.method4851(1391845517);
			}
			if (null == Class223.aFrame2336)
				Class205_Sub1.method9054(1324896012);
			if (Class707.aBool8822 && null != Class223.aFrame2336 && !Class67_Sub1.aBool10601 && Class536_Sub37.method9820(anInt11101 * -708374433, 1640799495))
				Class15.method640(Class710.aClass536_Sub40_8843.aClass710_Sub12_10769.method10038(-1215334040), -1, -1, false, -1761806265);
			boolean bool = false;
			if (aBool6889) {
				aBool6889 = false;
				bool = true;
			}
			if (bool)
				Class477.method5751((byte) -80);
			if ((null != Class677.aClass167_8609 && Class677.aClass167_8609.method2010()) || Class315.method4212((byte) 87) != 1)
				Class552.method6692(-1985400959);
			if (Class482.method5837(-708374433 * anInt11101, -1172277013))
				Class560.method6828(bool, (byte) 121);
			else if (Class285.method3842(anInt11101 * -708374433, 1873689221))
				Class66.method1076(1988714814);
			else if (Class270.method3716(-708374433 * anInt11101, -1599016475))
				Class66.method1076(-745598766);
			else if (Class578.method7007(anInt11101 * -708374433, -230520142)) {
				if (aClass515_11066.method6298(-2089480711) == Class516.aClass516_7036) {
					int i = aClass515_11066.method6242((byte) -112) / 2;
					Class306.method4120(new StringBuilder().append(Class38.aClass38_402.method840(Class459.aClass664_5178, 1451795395)).append(Class40.aString496).append("(").append(i).append("%)").toString(), true, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
				} else if (aClass515_11066.method6298(-2089480711) == Class516.aClass516_7038) {
					int i = 50 + aClass515_11066.method6257(-1135742060) / 2;
					Class306.method4120(new StringBuilder().append(Class38.aClass38_402.method840(Class459.aClass664_5178, 1468146662)).append(Class40.aString496).append("(").append(i).append("%)").toString(), true, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
				} else
					Class306.method4120(Class38.aClass38_402.method840(Class459.aClass664_5178, 1833267639), true, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
			} else if (9 == -708374433 * anInt11101)
				Class315.method4213(l);
			else if (-708374433 * anInt11101 == 17)
				Class306.method4120(new StringBuilder().append(Class38.aClass38_415.method840(Class459.aClass664_5178, 1907839229)).append(Class40.aString496).append(Class38.aClass38_405.method840(Class459.aClass664_5178, 1699949044)).toString(), false, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
			else if (19 == anInt11101 * -708374433)
				Class306.method4120(Class38.aClass38_442.method840(Class459.aClass664_5178, 1894766631), false, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
			if (anInt11016 * -176554429 == 3) {
				for (int i = 0; i < anInt11245 * -5823823; i++) {
					Rectangle rectangle = aRectangleArray11249[i];
					if (aBoolArray11029[i])
						Class677.aClass167_8609.method2056(rectangle.x, rectangle.y, rectangle.width, rectangle.height, -65281, 443708955);
					else
						Class677.aClass167_8609.method2056(rectangle.x, rectangle.y, rectangle.width, rectangle.height, -16711936, -349543632);
				}
			}
			if (Class44.method882(172817556))
				Class26.method739(Class677.aClass167_8609, -1151057325);
			if (!Class482.method5837(-708374433 * anInt11101, -563056295) && !Class578.method7007(-708374433 * anInt11101, -254632408) && -1 != anInt11187 * -1959825479) {
				try {
					Class677.aClass167_8609.method2084();
					Class204.method2932(Class677.aClass167_8609, Class249.method3450(1515365409), Class144.anInt1679 * -1804846931, Class34_Sub6.anInt10965 * 589116499, -342912956);
					Class677.aClass167_8609.method2002((byte) 95);
				} catch (Exception_Sub5 exception_sub5) {
					Class81.method1165(new StringBuilder().append(exception_sub5.getMessage()).append(" ").append(method6092(1163112762)).toString(), exception_sub5, (byte) -72);
					switch (Class710.aClass536_Sub40_8843.aClass710_Sub15_10767.method10071(1745078650)) {
					case 3:
						Class560.method6827(exception_sub5.method10533(1621455319), (byte) 110);
						Class704.method8264(1, false, (byte) 106);
						break;
					default:
						Class704.method8264(0, false, (byte) 64);
					}
				}
			}
			int i = Class710.aClass536_Sub40_8843.aClass710_Sub26_10758.method10149(-664631943);
			if (i == 0)
				Class212.method3067(15L);
			else if (1 == i)
				Class212.method3067(10L);
			else if (2 == i)
				Class212.method3067(5L);
			else if (i == 3)
				Class212.method3067(2L);
			if (aBool11103)
				Class679.method8065((byte) 62);
			if (Class710.aClass536_Sub40_8843.aClass710_Sub39_10783.method10236(-2076801449) == 1 && 16 == -708374433 * anInt11101 && -1 != anInt11187 * -1959825479) {
				Class710.aClass536_Sub40_8843.method9857(Class710.aClass536_Sub40_8843.aClass710_Sub39_10783, 0, (byte) 1);
				Class27.method763(2084448771);
			}
		}
	}

	final void method6100() {
		if (2 != -708374433 * anInt11101) {
			long l = (Class614.method7323(1754293717) / 1000000L - 8534821430371810531L * aLong11237);
			aLong11237 = (Class614.method7323(296739191) / 1000000L * -6183332289911379765L);
			if (Class536_Sub37.method9820(-708374433 * anInt11101, 319538016)) {
				if (0L != aLong11148 * 8767938331932336319L && (Class249.method3450(1831463709) > aLong11148 * 8767938331932336319L))
					Class15.method640(Class315.method4212((byte) 104), -1, -1, false, -1920493237);
				else if (!Class677.aClass167_8609.method2010() && aBool6865)
					Class388.method4851(963535110);
			}
			if (null == Class223.aFrame2336)
				Class205_Sub1.method9054(240913261);
			if (Class707.aBool8822 && null != Class223.aFrame2336 && !Class67_Sub1.aBool10601 && Class536_Sub37.method9820(anInt11101 * -708374433, 780733304))
				Class15.method640(Class710.aClass536_Sub40_8843.aClass710_Sub12_10769.method10038(-1686316206), -1, -1, false, -1339718113);
			boolean bool = false;
			if (aBool6889) {
				aBool6889 = false;
				bool = true;
			}
			if (bool)
				Class477.method5751((byte) -97);
			if ((null != Class677.aClass167_8609 && Class677.aClass167_8609.method2010()) || Class315.method4212((byte) 122) != 1)
				Class552.method6692(-1458776811);
			if (Class482.method5837(-708374433 * anInt11101, -1739948025))
				Class560.method6828(bool, (byte) 117);
			else if (Class285.method3842(anInt11101 * -708374433, 1873689221))
				Class66.method1076(-1416073900);
			else if (Class270.method3716(-708374433 * anInt11101, -1691048851))
				Class66.method1076(1660028269);
			else if (Class578.method7007(anInt11101 * -708374433, 762141905)) {
				if (aClass515_11066.method6298(-2089480711) == Class516.aClass516_7036) {
					int i = aClass515_11066.method6242((byte) -48) / 2;
					Class306.method4120(new StringBuilder().append(Class38.aClass38_402.method840(Class459.aClass664_5178, 1598817119)).append(Class40.aString496).append("(").append(i).append("%)").toString(), true, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
				} else if (aClass515_11066.method6298(-2089480711) == Class516.aClass516_7038) {
					int i = 50 + aClass515_11066.method6257(-1644216595) / 2;
					Class306.method4120(new StringBuilder().append(Class38.aClass38_402.method840(Class459.aClass664_5178, 1901081286)).append(Class40.aString496).append("(").append(i).append("%)").toString(), true, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
				} else
					Class306.method4120(Class38.aClass38_402.method840(Class459.aClass664_5178, 1969069762), true, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
			} else if (9 == -708374433 * anInt11101)
				Class315.method4213(l);
			else if (-708374433 * anInt11101 == 17)
				Class306.method4120(new StringBuilder().append(Class38.aClass38_415.method840(Class459.aClass664_5178, 2081304229)).append(Class40.aString496).append(Class38.aClass38_405.method840(Class459.aClass664_5178, 1635337144)).toString(), false, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
			else if (19 == anInt11101 * -708374433)
				Class306.method4120(Class38.aClass38_442.method840(Class459.aClass664_5178, 1644549542), false, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
			if (anInt11016 * -176554429 == 3) {
				for (int i = 0; i < anInt11245 * -5823823; i++) {
					Rectangle rectangle = aRectangleArray11249[i];
					if (aBoolArray11029[i])
						Class677.aClass167_8609.method2056(rectangle.x, rectangle.y, rectangle.width, rectangle.height, -65281, -46246215);
					else
						Class677.aClass167_8609.method2056(rectangle.x, rectangle.y, rectangle.width, rectangle.height, -16711936, 1580751340);
				}
			}
			if (Class44.method882(1665896252))
				Class26.method739(Class677.aClass167_8609, 654075108);
			if (!Class482.method5837(-708374433 * anInt11101, -780744426) && !Class578.method7007(-708374433 * anInt11101, 1646488554) && -1 != anInt11187 * -1959825479) {
				try {
					Class677.aClass167_8609.method2084();
					Class204.method2932(Class677.aClass167_8609, Class249.method3450(2140386109), Class144.anInt1679 * -1804846931, Class34_Sub6.anInt10965 * 589116499, -801483076);
					Class677.aClass167_8609.method2002((byte) 115);
				} catch (Exception_Sub5 exception_sub5) {
					Class81.method1165(new StringBuilder().append(exception_sub5.getMessage()).append(" ").append(method6092(-999202132)).toString(), exception_sub5, (byte) 18);
					switch (Class710.aClass536_Sub40_8843.aClass710_Sub15_10767.method10071(1432314670)) {
					case 3:
						Class560.method6827(exception_sub5.method10533(1006875100), (byte) 9);
						Class704.method8264(1, false, (byte) 82);
						break;
					default:
						Class704.method8264(0, false, (byte) 95);
					}
				}
			}
			int i = Class710.aClass536_Sub40_8843.aClass710_Sub26_10758.method10149(-664631943);
			if (i == 0)
				Class212.method3067(15L);
			else if (1 == i)
				Class212.method3067(10L);
			else if (2 == i)
				Class212.method3067(5L);
			else if (i == 3)
				Class212.method3067(2L);
			if (aBool11103)
				Class679.method8065((byte) 59);
			if (Class710.aClass536_Sub40_8843.aClass710_Sub39_10783.method10236(-2134540800) == 1 && 16 == -708374433 * anInt11101 && -1 != anInt11187 * -1959825479) {
				Class710.aClass536_Sub40_8843.method9857(Class710.aClass536_Sub40_8843.aClass710_Sub39_10783, 0, (byte) 1);
				Class27.method763(2040806387);
			}
		}
	}

	public String method6104() {
		String string = " ";
		try {
			Class598 class598 = aClass515_11066.method6255(-1793309352);
			string = new StringBuilder().append(string).append(1858049507 * class598.anInt7839).append(Class40.aString491).append(class598.anInt7840 * 1479112045).append(Class40.aString491).append(aClass515_11066.method6321((byte) 46)).append(Class40.aString491).append(aClass515_11066.method6243(177401017)).append(" ").toString();
			if (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 != null)
				string = new StringBuilder().append(string).append(-989431627 * Class320.anInt3539).append(Class40.aString491).append(class598.anInt7839 * 1858049507 + (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenX[0])).append(Class40.aString491).append(1479112045 * class598.anInt7840 + (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenY[0])).append(" ").toString();
			else
				string = new StringBuilder().append(string).append(Class320.anInt3539 * -989431627).append(Class40.aString491).append(-989431627 * Class320.anInt3539).append(Class40.aString491).append(Class320.anInt3539 * -989431627).append(Class40.aString491).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub15_10767.method10071(1490585605)).append(" ").append(Class710.aClass536_Sub40_8843.aClass710_Sub27_10746.method10156(2145485788)).append(" ").append(Class315.method4212((byte) 90)).append(" ").append(Class144.anInt1679 * -1804846931).append(Class40.aString491).append(Class34_Sub6.anInt10965 * 589116499).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub14_10755.method10066((byte) 0)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub9_10756.method10004(-572498950)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub3_10754.method9894(-1017210055)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub2_10765.method9885(-684161367)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub34_10787.method10204(1867269829)).append(" ").toString();
			string = new StringBuilder().append(string).append("0 ").toString();
			string = new StringBuilder().append(string).append(anInt6857 * -839563813).append(" ").toString();
			string = new StringBuilder().append(string).append(anInt11101 * -708374433).append(" ").toString();
			if (Class458_Sub4.aClass536_Sub38_10336 != null)
				string = new StringBuilder().append(string).append(-853108975 * Class458_Sub4.aClass536_Sub38_10336.anInt10684).toString();
			else
				string = new StringBuilder().append(string).append(-1).toString();
			string = new StringBuilder().append(string).append(" ").toString();
			if (aString11004 != null)
				string = new StringBuilder().append(string).append(aString11004).toString();
			else
				string = new StringBuilder().append(string).append(Class40.aString491).toString();
		} catch (Throwable throwable) {
			/* empty */
		}
		return string;
	}

	public String method6106() {
		String string = " ";
		try {
			Class598 class598 = aClass515_11066.method6255(-1474607626);
			string = new StringBuilder().append(string).append(1858049507 * class598.anInt7839).append(Class40.aString491).append(class598.anInt7840 * 1479112045).append(Class40.aString491).append(aClass515_11066.method6321((byte) 62)).append(Class40.aString491).append(aClass515_11066.method6243(177401017)).append(" ").toString();
			if (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 != null)
				string = new StringBuilder().append(string).append(-989431627 * Class320.anInt3539).append(Class40.aString491).append(class598.anInt7839 * 1858049507 + (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenX[0])).append(Class40.aString491).append(1479112045 * class598.anInt7840 + (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenY[0])).append(" ").toString();
			else
				string = new StringBuilder().append(string).append(Class320.anInt3539 * -989431627).append(Class40.aString491).append(-989431627 * Class320.anInt3539).append(Class40.aString491).append(Class320.anInt3539 * -989431627).append(Class40.aString491).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub15_10767.method10071(1074348710)).append(" ").append(Class710.aClass536_Sub40_8843.aClass710_Sub27_10746.method10156(1402038272)).append(" ").append(Class315.method4212((byte) 32)).append(" ").append(Class144.anInt1679 * -1804846931).append(Class40.aString491).append(Class34_Sub6.anInt10965 * 589116499).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub14_10755.method10066((byte) 0)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub9_10756.method10004(-545028511)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub3_10754.method9894(-1017210055)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub2_10765.method9885(1051640979)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub34_10787.method10204(1867269829)).append(" ").toString();
			string = new StringBuilder().append(string).append("0 ").toString();
			string = new StringBuilder().append(string).append(anInt6857 * -839563813).append(" ").toString();
			string = new StringBuilder().append(string).append(anInt11101 * -708374433).append(" ").toString();
			if (Class458_Sub4.aClass536_Sub38_10336 != null)
				string = new StringBuilder().append(string).append(-853108975 * Class458_Sub4.aClass536_Sub38_10336.anInt10684).toString();
			else
				string = new StringBuilder().append(string).append(-1).toString();
			string = new StringBuilder().append(string).append(" ").toString();
			if (aString11004 != null)
				string = new StringBuilder().append(string).append(aString11004).toString();
			else
				string = new StringBuilder().append(string).append(Class40.aString491).toString();
		} catch (Throwable throwable) {
			/* empty */
		}
		return string;
	}

	static final void method10384() {
		int i = 256 + 48434688 * Class440.anInt4874;
		int i_145_ = Class606.anInt7898 * 1754388992 + 256;
		int i_146_ = (Class54.method944(i, i_145_, -989431627 * Class320.anInt3539, 1417433834) - -1655704623 * Class653.anInt8491);
		if (Class234.anInt2381 * -1497935111 >= 100) {
			Class637.anInt8301 = Class440.anInt4874 * 1474287104 + -1330152192;
			Class685.anInt8665 = -1060159744 + Class606.anInt7898 * 724215296;
			Class205_Sub21.anInt9958 = (Class54.method944(-1607026219 * Class637.anInt8301, -1646092097 * Class685.anInt8665, -989431627 * Class320.anInt3539, 1757902532) - Class653.anInt8491 * -1655704623) * -300318539;
		} else {
			if (Class637.anInt8301 * -1607026219 < i) {
				Class637.anInt8301 += (((i - -1607026219 * Class637.anInt8301) * (-1497935111 * Class234.anInt2381) / 1000) + 819919625 * Class584_Sub1.anInt10560) * 1420867453;
				if (Class637.anInt8301 * -1607026219 > i)
					Class637.anInt8301 = 1420867453 * i;
			}
			if (-1607026219 * Class637.anInt8301 > i) {
				Class637.anInt8301 -= 1420867453 * (Class584_Sub1.anInt10560 * 819919625 + (-1497935111 * Class234.anInt2381 * (-1607026219 * Class637.anInt8301 - i) / 1000));
				if (-1607026219 * Class637.anInt8301 < i)
					Class637.anInt8301 = 1420867453 * i;
			}
			if (Class205_Sub21.anInt9958 * -1598853731 < i_146_) {
				Class205_Sub21.anInt9958 += ((Class234.anInt2381 * -1497935111 * (i_146_ - -1598853731 * Class205_Sub21.anInt9958) / 1000) + 819919625 * Class584_Sub1.anInt10560) * -300318539;
				if (Class205_Sub21.anInt9958 * -1598853731 > i_146_)
					Class205_Sub21.anInt9958 = i_146_ * -300318539;
			}
			if (Class205_Sub21.anInt9958 * -1598853731 > i_146_) {
				Class205_Sub21.anInt9958 -= (819919625 * Class584_Sub1.anInt10560 + (Class234.anInt2381 * -1497935111 * (Class205_Sub21.anInt9958 * -1598853731 - i_146_) / 1000)) * -300318539;
				if (-1598853731 * Class205_Sub21.anInt9958 < i_146_)
					Class205_Sub21.anInt9958 = -300318539 * i_146_;
			}
			if (Class685.anInt8665 * -1646092097 < i_145_) {
				Class685.anInt8665 += (717279039 * (819919625 * Class584_Sub1.anInt10560 + ((i_145_ - -1646092097 * Class685.anInt8665) * (Class234.anInt2381 * -1497935111) / 1000)));
				if (Class685.anInt8665 * -1646092097 > i_145_)
					Class685.anInt8665 = 717279039 * i_145_;
			}
			if (Class685.anInt8665 * -1646092097 > i_145_) {
				Class685.anInt8665 -= 717279039 * ((-1497935111 * Class234.anInt2381 * (Class685.anInt8665 * -1646092097 - i_145_) / 1000) + Class584_Sub1.anInt10560 * 819919625);
				if (Class685.anInt8665 * -1646092097 < i_145_)
					Class685.anInt8665 = 717279039 * i_145_;
			}
		}
		i = 256 + Class438.anInt4868 * -590130688;
		i_145_ = Class550.anInt7412 * -28297728 + 256;
		i_146_ = (Class54.method944(i, i_145_, -989431627 * Class320.anInt3539, 1960511017) - -565938271 * Class184_Sub6.anInt9934);
		int i_147_ = i - -1607026219 * Class637.anInt8301;
		int i_148_ = i_146_ - Class205_Sub21.anInt9958 * -1598853731;
		int i_149_ = i_145_ - -1646092097 * Class685.anInt8665;
		int i_150_ = (int) Math.sqrt((double) (i_149_ * i_149_ + i_147_ * i_147_));
		int i_151_ = ((int) (Math.atan2((double) i_148_, (double) i_150_) * 2607.5945876176133) & 0x3fff);
		int i_152_ = ((int) (Math.atan2((double) i_147_, (double) i_149_) * -2607.5945876176133) & 0x3fff);
		if (i_151_ < 1024)
			i_151_ = 1024;
		if (i_151_ > 3072)
			i_151_ = 3072;
		if (62800801 * Class141.anInt1658 < i_151_) {
			Class141.anInt1658 += 269246561 * ((-699510373 * Class460_Sub1.anInt10291 * (i_151_ - 62800801 * Class141.anInt1658 >> 3) / 1000) + 1604835643 * Class593.anInt7811 << 3);
			if (62800801 * Class141.anInt1658 > i_151_)
				Class141.anInt1658 = 269246561 * i_151_;
		}
		if (Class141.anInt1658 * 62800801 > i_151_) {
			Class141.anInt1658 -= (269246561 * ((1604835643 * Class593.anInt7811 + ((62800801 * Class141.anInt1658 - i_151_ >> 3) * (Class460_Sub1.anInt10291 * -699510373) / 1000)) << 3));
			if (62800801 * Class141.anInt1658 < i_151_)
				Class141.anInt1658 = 269246561 * i_151_;
		}
		int i_153_ = i_152_ - 158223895 * Class144.anInt1681;
		if (i_153_ > 8192)
			i_153_ -= 16384;
		if (i_153_ < -8192)
			i_153_ += 16384;
		i_153_ >>= 3;
		if (i_153_ > 0) {
			Class144.anInt1681 += 402508199 * ((Class460_Sub1.anInt10291 * -699510373 * i_153_ / 1000) + Class593.anInt7811 * 1604835643 << 3);
			Class144.anInt1681 = (158223895 * Class144.anInt1681 & 0x3fff) * 402508199;
		}
		if (i_153_ < 0) {
			Class144.anInt1681 -= (402508199 * ((-699510373 * Class460_Sub1.anInt10291 * -i_153_ / 1000 + 1604835643 * Class593.anInt7811) << 3));
			Class144.anInt1681 = 402508199 * (Class144.anInt1681 * 158223895 & 0x3fff);
		}
		int i_154_ = i_152_ - 158223895 * Class144.anInt1681;
		if (i_154_ > 8192)
			i_154_ -= 16384;
		if (i_154_ < -8192)
			i_154_ += 16384;
		if (i_154_ < 0 && i_153_ > 0 || i_154_ > 0 && i_153_ < 0)
			Class144.anInt1681 = 402508199 * i_152_;
		Class304.anInt3440 = 0;
	}

	public static void method10385() {
		int i = 0;
		if (Class710.aClass536_Sub40_8843.aClass710_Sub14_10755.method10066((byte) 0) == 1) {
			i |= 0x1;
			i |= 0x10;
			i |= 0x20;
			i |= 0x2;
			i |= 0x4;
		}
		if (Class710.aClass536_Sub40_8843.aClass710_Sub2_10765.method9885(138201217) == 0)
			i |= 0x40;
		Class153.method1866(i, (byte) -89);
		aClass515_11066.method6280(-1073841494).method10352(i, (byte) -64);
		Class266.aClass503_2867.method6045(-498461347).method6280(-1073841494).method10352(i, (byte) -103);
		Class111.aClass34_Sub13_1391.method10339(i, 1867269829);
		Class172.aClass34_Sub7_1922.method10323(i, 903956364);
		Class633.aClass34_Sub15_8260.method10348(i, 1700206604);
		Class406.method4950(i, 339066292);
		Class671.method8020(i, -1089563619);
		Class444.method5394(i, 1771351622);
		Class57.method966(i, -1936897460);
		Class360_Sub2.method9318(i, 80226366);
		aClass515_11066.method6319(-1321776401);
	}

	public static final void method10386() {
		Class106 class106 = Class536_Sub41.method9871(2077853800);
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4494, class106.aClass15_1258, 1846041062);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(0);
		class106.method1409(class536_sub23, 1168613901);
	}

	void method10387() {
		if (-2073269917 * Class176.aClass460_1936.anInt5195 > 1500629495 * anInt11263) {
			Class23.aClass5_219.method574(1554949275);
			anInt11042 = 535840638 * Class176.aClass460_1936.anInt5195 - 1315189226;
			if (anInt11042 * -862309271 > 3000)
				anInt11042 = -1397598472;
			if (Class176.aClass460_1936.anInt5195 * -2073269917 >= 2 && 6 == Class176.aClass460_1936.anInt5196 * 917679433) {
				method6121("js5connect_outofdate", -1820873372);
				anInt11101 = -1675716802;
				return;
			}
			if (-2073269917 * Class176.aClass460_1936.anInt5195 >= 1 && 48 == Class176.aClass460_1936.anInt5196 * 917679433) {
				method6121("sessionexpired", -177065424);
				anInt11101 = -1675716802;
				return;
			}
			if (Class176.aClass460_1936.anInt5195 * -2073269917 >= 4 && 917679433 * Class176.aClass460_1936.anInt5196 == -1) {
				method6098("js5crc", new StringBuilder().append("a=").append(38726355 * Class176.aClass460_1936.anInt5197).append("&g=").append(Class176.aClass460_1936.anInt5183 * -899459829).toString(), -1649496430);
				anInt11101 = -1675716802;
				return;
			}
			if (-2073269917 * Class176.aClass460_1936.anInt5195 >= 4 && Class482.method5837(-708374433 * anInt11101, 1085515934)) {
				if (7 == 917679433 * Class176.aClass460_1936.anInt5196 || Class176.aClass460_1936.anInt5196 * 917679433 == 9)
					method6121("js5connect_full", 1943495823);
				else if (917679433 * Class176.aClass460_1936.anInt5196 > 0) {
					if (aString11046 == null)
						method6121("js5connect", -1032641035);
					else
						method6121(new StringBuilder().append("js5proxy_").append(aString11046.trim()).toString(), 1015488141);
				} else
					method6121("js5io", -64681970);
				anInt11101 = -1675716802;
				return;
			}
		}
		anInt11263 = Class176.aClass460_1936.anInt5195 * -249372427;
		if (anInt11042 * -862309271 > 0)
			anInt11042 -= -1386308647;
		else {
			try {
				if (handshakeStage * -275818405 == 0) {
					Class321.aSocket3543 = Class23.aClass5_219.method575((byte) 3);
					handshakeStage += -1210181677;
				}
				if (handshakeStage * -275818405 == 1) {
					Class582.aClass567_7700 = Class506.method6146(Class321.aSocket3543, 131072, (byte) 86);
					int i = 10 + aString11004.length();
					RSByteBuffer buffer = new RSByteBuffer(2 + i);
					buffer.writeByte(1258126983 * (Class420.aClass420_4572.anInt4571));
					buffer.writeByte(i);
					buffer.writeInt(876);
					buffer.writeInt(1);
					buffer.writeString(aString11004);
					buffer.writeByte((Class459.aClass664_5178.anInt8526) * -1919173613);
					Class582.aClass567_7700.method6912((buffer.buffer), 0, i + 2, (byte) 5);
					handshakeStage += -1210181677;
					Class95.aLong1163 = (Class249.method3450(1485070864) * 8318299307769190309L);
				}
				if (handshakeStage * -275818405 == 2) {
					if (Class582.aClass567_7700.bitsRemaining(1, -458960978)) {
						byte[] is = new byte[1];
						int i = Class582.aClass567_7700.method6899(is, 0, 1, -508252472);
						if (0 != is[0]) {
							method10373(i, 1538512972);
							return;
						}
						handshakeStage += -1210181677;
					} else if ((Class249.method3450(1518779264) - -3305165298707384275L * Class95.aLong1163) > 30000L) {
						method10373(1001, 1538512972);
						return;
					}
				}
				if (-275818405 * handshakeStage == 3) {
					Class59[] class59s = Class59.method983(-2140404394);
					int i = class59s.length * 4;
					if (Class582.aClass567_7700.bitsRemaining(i, -2065178589)) {
						RSByteBuffer class536_sub33 = new RSByteBuffer(i);
						Class582.aClass567_7700.method6899(class536_sub33.buffer, 0, class536_sub33.buffer.length, 239261002);
						for (int i_155_ = 0; i_155_ < class59s.length; i_155_++)
							class59s[i_155_].method977(class536_sub33.readInt(), 1854131966);
						boolean bool = (Class482.method5837(anInt11101 * -708374433, -1664510884) || Class566.method6895(anInt11101 * -708374433, 347229948) || Class233.method3334(-708374433 * anInt11101, (byte) -24));
						Class176.aClass460_1936.method5529((Class582.aClass567_7700), !bool, (byte) 34);
						Class321.aSocket3543 = null;
						Class582.aClass567_7700 = null;
						handshakeStage = 0;
					}
				}
			} catch (IOException ioexception) {
				method10373(1002, 1538512972);
			}
		}
	}

	static final void method10388() {
		Class668.method8011(aClass251_10992, 263642117);
		Class360.anInt3827 += 822231753;
		if (!aBool11208 || !aBool11274) {
			if (Class360.anInt3827 * 2018211705 > 1) {
				aClass251_10992 = null;
				aClass251_11199 = null;
			}
		} else {
			int i = Class329.aClass550_3601.method6656(-1290762989);
			int i_156_ = Class329.aClass550_3601.method6657(-1274328532);
			i -= -1721422785 * anInt11281;
			i_156_ -= anInt11201 * 671669755;
			if (i < anInt11204 * 1828303855)
				i = anInt11204 * 1828303855;
			if (aClass251_10992.anInt2573 * -1606950689 + i > 171675909 * anInt11206 + 1828303855 * anInt11204)
				i = (anInt11204 * 1828303855 + anInt11206 * 171675909 - -1606950689 * aClass251_10992.anInt2573);
			if (i_156_ < anInt11205 * 1260646355)
				i_156_ = anInt11205 * 1260646355;
			if (aClass251_10992.anInt2574 * 223822141 + i_156_ > 1260646355 * anInt11205 + anInt11207 * 904217971)
				i_156_ = (904217971 * anInt11207 + anInt11205 * 1260646355 - aClass251_10992.anInt2574 * 223822141);
			int i_157_;
			int i_158_;
			if (Class107.aClass251_1323 == aClass251_11199) {
				i_157_ = i;
				i_158_ = i_156_;
			} else {
				i_157_ = (aClass251_11199.anInt2581 * 1428895931 + (i - 1828303855 * anInt11204));
				i_158_ = (aClass251_11199.anInt2584 * -2092413585 + (i_156_ - anInt11205 * 1260646355));
			}
			if (!Class329.aClass550_3601.method6655((short) 255)) {
				if (aBool11121) {
					Class270.method3717(1097947641);
					if (null != aClass251_10992.anObjectArray2676) {
						Class536_Sub42 class536_sub42 = new Class536_Sub42();
						class536_sub42.aClass251_10804 = aClass251_10992;
						class536_sub42.anInt10803 = 1761425895 * i_157_;
						class536_sub42.anInt10800 = -1275012151 * i_158_;
						InterfaceDefinitions class251 = method10382(aClass251_10992);
						InterfaceDefinitions class251_159_ = aClass251_11202;
						boolean bool = false;
						for (/**/; (null != class251_159_ && -1 != class251_159_.anInt2577 * -1940204141 && null != class251); class251_159_ = (Class463.aClass234Array5227[(-1591767037 * class251_159_.anInt2559 >> 16)].aClass251Array2378[(-1940204141 * class251_159_.anInt2577 & 0xffff)])) {
							if (-1591767037 * class251.anInt2559 == -1591767037 * class251_159_.anInt2559) {
								bool = true;
								break;
							}
						}
						if (null != class251_159_ && null != class251 && class251 != Class107.aClass251_1323 && !bool)
							class536_sub42.aClass251_10806 = Class107.aClass251_1323;
						else
							class536_sub42.aClass251_10806 = aClass251_11202;
						class536_sub42.anObjectArray10802 = aClass251_10992.anObjectArray2676;
						Class618.method7388(class536_sub42, -1385947822);
					}
					if (aClass251_11202 != null && method10382(aClass251_10992) != null)
						Class578.method7008(aClass251_10992, aClass251_11202, -2145704482);
				} else if ((1 == 1862126853 * anInt11040 || Class622.method7417((byte) 1)) && 1780207751 * Class70.anInt760 > 2)
					Class670.method8014((anInt11209 * 1961670097 + anInt11281 * -1721422785), (anInt11210 * 411701121 + anInt11201 * 671669755), -661697415);
				else if (Class536_Sub15.method9518(419371655))
					Class670.method8014((1961670097 * anInt11209 + -1721422785 * anInt11281), (411701121 * anInt11210 + 671669755 * anInt11201), 1452052724);
				aClass251_10992 = null;
				aClass251_11199 = null;
			} else {
				if (Class360.anInt3827 * 2018211705 > aClass251_10992.anInt2663 * 1330942333) {
					int i_160_ = i - 1961670097 * anInt11209;
					int i_161_ = i_156_ - 411701121 * anInt11210;
					if (i_160_ > 632017109 * aClass251_10992.anInt2600 || i_160_ < -(632017109 * aClass251_10992.anInt2600) || i_161_ > 632017109 * aClass251_10992.anInt2600 || i_161_ < -(aClass251_10992.anInt2600 * 632017109))
						aBool11121 = true;
				}
				if (null != aClass251_10992.anObjectArray2675 && aBool11121) {
					Class536_Sub42 class536_sub42 = new Class536_Sub42();
					class536_sub42.aClass251_10804 = aClass251_10992;
					class536_sub42.anInt10803 = i_157_ * 1761425895;
					class536_sub42.anInt10800 = -1275012151 * i_158_;
					class536_sub42.anObjectArray10802 = aClass251_10992.anObjectArray2675;
					Class618.method7388(class536_sub42, -826452271);
				}
			}
		}
	}

	public static IComponentSettings method10389(InterfaceDefinitions class251) {
		IComponentSettings class536_sub14 = ((IComponentSettings) aClass4_11243.method556(((long) (-1591767037 * class251.anInt2559) << 32) + (long) (-809980533 * class251.anInt2546)));
		return (class536_sub14 != null ? class536_sub14 : class251.aClass536_Sub14_2575);
	}

	public static void method10390() {
		int i = 0;
		if (Class710.aClass536_Sub40_8843.aClass710_Sub14_10755.method10066((byte) 0) == 1) {
			i |= 0x1;
			i |= 0x10;
			i |= 0x20;
			i |= 0x2;
			i |= 0x4;
		}
		if (Class710.aClass536_Sub40_8843.aClass710_Sub2_10765.method9885(149035552) == 0)
			i |= 0x40;
		Class153.method1866(i, (byte) -97);
		aClass515_11066.method6280(-1073841494).method10352(i, (byte) -70);
		Class266.aClass503_2867.method6045(-1788884092).method6280(-1073841494).method10352(i, (byte) -44);
		Class111.aClass34_Sub13_1391.method10339(i, 1867269829);
		Class172.aClass34_Sub7_1922.method10323(i, 903956364);
		Class633.aClass34_Sub15_8260.method10348(i, 1700206604);
		Class406.method4950(i, 339066292);
		Class671.method8020(i, 78315421);
		Class444.method5394(i, -818755098);
		Class57.method966(i, -1936897460);
		Class360_Sub2.method9318(i, 373278147);
		aClass515_11066.method6319(-1280132755);
	}

	public static final void method10391() {
		Class106 class106 = Class536_Sub41.method9871(2077853800);
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4494, class106.aClass15_1258, 1886826904);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(0);
		class106.method1409(class536_sub23, 602324261);
	}

	public static final void method10392() {
		int i = Class710.aClass536_Sub40_8843.aClass710_Sub5_10761.method9916(1468020347);
		if (i == 0) {
			aClass515_11066.method6246(null, 1803647170);
			Class689.method8183(0, (byte) -64);
		} else if (1 == i || 3 == i) {
			Class184_Sub3.method8990((byte) 0, 274214272);
			Class689.method8183(512, (byte) -66);
			if (aClass515_11066.method6249(651774818) != null)
				Class158.method1890((byte) 18);
		} else {
			Class184_Sub3.method8990((byte) (648319383 * anInt11127 - 4 & 0xff), -178779814);
			Class689.method8183(2, (byte) -5);
		}
		anInt11264 = Class320.anInt3539 * -1505723837;
	}

	static final void method10393() {
		anInt11052 = 2044763365;
		anInt11074 = -416311143;
		Class392_Sub1.aClass536_Sub33_10107 = null;
		Class521_Sub4.method9368(614090676);
	}

	static final void method10394() {
		anInt11052 = 2044763365;
		anInt11074 = -416311143;
		Class392_Sub1.aClass536_Sub33_10107 = null;
		Class521_Sub4.method9368(1329014968);
	}

	static final void method10395() {
		Class478.method5762(1290035240);
		aClass515_11066.method6258((byte) 0);
		for (int i = 0; i < aClass103Array11020.length; i++)
			aClass103Array11020[i] = null;
		for (int i = 0; i < aClass526Array11021.length; i++)
			aClass526Array11021[i] = null;
		Class324.method4276(-2025234968);
		for (int i = 0; i < 2048; i++)
			aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i] = null;
		anInt11053 = 0;
		aClass4_11050.method561(-2117553523);
		anInt11164 = 0;
		aClass4_11170.method561(-2117553523);
		Class609.method7265(Class65.method1062((short) -15916), -952911284);
		anInt11063 = 0;
		Class465_Sub1.aClass96_10352.aClass610_1164.method7271(-1056104537);
		Class50.aClass350_585 = null;
		Class256.aClass350_2762 = null;
		Class66.aClass536_Sub15_724 = null;
		Class646.aClass536_Sub15_8361 = null;
		Class63.aClass226_717 = null;
		aBool11172 = true;
		Class398.aClass654_4123 = null;
		Class567.aLong7600 = 0L;
		Class51.method930(-1398418648);
		Class452.method5434(814833493);
	}

	static final void method10396() {
		Class654.aClass34_Sub4_8494.method804(5, (byte) 43);
		Class279.aClass34_Sub3_3163.method804(5, (byte) 78);
		Class205_Sub7.aClass34_Sub2_9878.method804(5, (byte) 93);
		aClass515_11066.method6280(-1073841494).method804(5, (byte) 12);
		Class172.aClass34_Sub7_1922.method804(5, (byte) -19);
		Class111.aClass34_Sub13_1391.method804(5, (byte) 26);
		Class45.aClass34_Sub11_529.method804(5, (byte) -28);
		Class633.aClass34_Sub15_8260.method804(5, (byte) 43);
		Class56.aClass34_Sub14_608.method804(5, (byte) 24);
		Class532.aClass98_Sub1_Sub1_7122.method10467(5, (byte) 0);
		Class678.aClass98_Sub1_Sub2_8625.method10499(5, -1113158745);
		Class536_Sub19.aClass98_Sub1_Sub2_10519.method10499(5, -1414037888);
		Class446.aClass98_Sub1_Sub2_4902.method10499(5, -549732758);
		Class333.aClass98_Sub1_Sub2_3622.method10499(5, -1229629137);
		Class458_Sub2.aClass98_Sub1_Sub2_10306.method10499(5, 724017082);
		Class497.aClass34_Sub16_5554.method804(5, (byte) 4);
		Class398_Sub1.aClass34_Sub8_10110.method804(5, (byte) 10);
		Class602.aClass34_Sub1_7856.method804(5, (byte) -43);
		Class207.aClass34_Sub22_2244.method804(5, (byte) 7);
		Class459.aClass34_Sub9_5179.method804(5, (byte) -37);
		Class144.aClass34_Sub12_1680.method804(5, (byte) -106);
		Class642.aClass34_Sub20_8334.method804(5, (byte) 7);
		Class580.aClass34_Sub19_7695.method804(5, (byte) -47);
		Class524.aClass34_Sub10_7097.method804(5, (byte) 99);
		Class257.aClass34_Sub5_2765.method804(5, (byte) 16);
		Class486.method5862(5, (byte) 17);
		Class45.method896(50, (byte) 8);
		Class196.aClass410_2202.method4983(50, 1867269829);
		Class195.method2863(5, (short) 255);
		Class86.method1203(5, -1069257187);
		aClass199_11320.method2883(5, -1929492345);
		aClass199_11045.method2883(5, -1766504431);
		Class685.aClass199_8658.method2883(5, -1551235182);
		aClass199_11300.method2883(5, -1382786834);
		Class228.aClass34_2360.method804(5, (byte) -29);
		Class205_Sub17.aClass34_9949.method804(5, (byte) -61);
		aClass199_11048.method2883(5, -1904505729);
	}

	static final void method10397() {
		Class654.aClass34_Sub4_8494.method804(5, (byte) -18);
		Class279.aClass34_Sub3_3163.method804(5, (byte) 91);
		Class205_Sub7.aClass34_Sub2_9878.method804(5, (byte) -42);
		aClass515_11066.method6280(-1073841494).method804(5, (byte) -87);
		Class172.aClass34_Sub7_1922.method804(5, (byte) 17);
		Class111.aClass34_Sub13_1391.method804(5, (byte) -8);
		Class45.aClass34_Sub11_529.method804(5, (byte) -45);
		Class633.aClass34_Sub15_8260.method804(5, (byte) 16);
		Class56.aClass34_Sub14_608.method804(5, (byte) 41);
		Class532.aClass98_Sub1_Sub1_7122.method10467(5, (byte) 0);
		Class678.aClass98_Sub1_Sub2_8625.method10499(5, -1801856149);
		Class536_Sub19.aClass98_Sub1_Sub2_10519.method10499(5, 189308848);
		Class446.aClass98_Sub1_Sub2_4902.method10499(5, -697610778);
		Class333.aClass98_Sub1_Sub2_3622.method10499(5, -688268333);
		Class458_Sub2.aClass98_Sub1_Sub2_10306.method10499(5, -1577537750);
		Class497.aClass34_Sub16_5554.method804(5, (byte) 39);
		Class398_Sub1.aClass34_Sub8_10110.method804(5, (byte) 47);
		Class602.aClass34_Sub1_7856.method804(5, (byte) -64);
		Class207.aClass34_Sub22_2244.method804(5, (byte) 30);
		Class459.aClass34_Sub9_5179.method804(5, (byte) -43);
		Class144.aClass34_Sub12_1680.method804(5, (byte) -16);
		Class642.aClass34_Sub20_8334.method804(5, (byte) 44);
		Class580.aClass34_Sub19_7695.method804(5, (byte) 64);
		Class524.aClass34_Sub10_7097.method804(5, (byte) -72);
		Class257.aClass34_Sub5_2765.method804(5, (byte) 13);
		Class486.method5862(5, (byte) 90);
		Class45.method896(50, (byte) 8);
		Class196.aClass410_2202.method4983(50, 1867269829);
		Class195.method2863(5, (short) 255);
		Class86.method1203(5, 2140365421);
		aClass199_11320.method2883(5, -1345693860);
		aClass199_11045.method2883(5, -1169667282);
		Class685.aClass199_8658.method2883(5, -2014205969);
		aClass199_11300.method2883(5, -1065729449);
		Class228.aClass34_2360.method804(5, (byte) -40);
		Class205_Sub17.aClass34_9949.method804(5, (byte) 47);
		aClass199_11048.method2883(5, -1111717954);
	}

	static final void method10398() {
		Class654.aClass34_Sub4_8494.method810(-1125020363);
		Class279.aClass34_Sub3_3163.method810(-1336747517);
		Class205_Sub7.aClass34_Sub2_9878.method810(-1665966079);
		aClass515_11066.method6280(-1073841494).method810(-1701170392);
		Class172.aClass34_Sub7_1922.method810(-1679427542);
		Class111.aClass34_Sub13_1391.method810(-1540324562);
		Class45.aClass34_Sub11_529.method810(-1911544878);
		Class633.aClass34_Sub15_8260.method810(-960375271);
		Class56.aClass34_Sub14_608.method810(-1299895351);
		Class532.aClass98_Sub1_Sub1_7122.method10465(-798257226);
		Class678.aClass98_Sub1_Sub2_8625.method10495((byte) 26);
		Class536_Sub19.aClass98_Sub1_Sub2_10519.method10495((byte) 106);
		Class446.aClass98_Sub1_Sub2_4902.method10495((byte) 77);
		Class333.aClass98_Sub1_Sub2_3622.method10495((byte) 83);
		Class458_Sub2.aClass98_Sub1_Sub2_10306.method10495((byte) 105);
		Class497.aClass34_Sub16_5554.method810(-1186903954);
		Class602.aClass34_Sub1_7856.method810(-1494972743);
		Class398_Sub1.aClass34_Sub8_10110.method810(-938552457);
		Class207.aClass34_Sub22_2244.method810(-1976885806);
		Class459.aClass34_Sub9_5179.method810(-903147155);
		Class144.aClass34_Sub12_1680.method810(-1944977789);
		Class642.aClass34_Sub20_8334.method810(-1990113405);
		Class580.aClass34_Sub19_7695.method810(-1810099117);
		Class524.aClass34_Sub10_7097.method810(-1502747183);
		Class257.aClass34_Sub5_2765.method810(-1057823699);
		Class227.method3285((byte) -21);
		Class478.method5755((byte) -92);
		Class196.aClass410_2202.method4984(14038585);
		Class173_Sub1.method8637(1965516209);
		Class237.method3353(-1283111680);
		aClass199_11320.method2892(1660690641);
		aClass199_11045.method2892(1781464751);
		Class685.aClass199_8658.method2892(2130464189);
		aClass199_11300.method2892(-986307361);
		Class228.aClass34_2360.method810(-1120376925);
		Class205_Sub17.aClass34_9949.method810(-802892644);
		aClass199_11048.method2892(426999321);
	}

	public String method6105() {
		String string = " ";
		try {
			Class598 class598 = aClass515_11066.method6255(-1608522450);
			string = new StringBuilder().append(string).append(1858049507 * class598.anInt7839).append(Class40.aString491).append(class598.anInt7840 * 1479112045).append(Class40.aString491).append(aClass515_11066.method6321((byte) -25)).append(Class40.aString491).append(aClass515_11066.method6243(177401017)).append(" ").toString();
			if (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 != null)
				string = new StringBuilder().append(string).append(-989431627 * Class320.anInt3539).append(Class40.aString491).append(class598.anInt7839 * 1858049507 + (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenX[0])).append(Class40.aString491).append(1479112045 * class598.anInt7840 + (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenY[0])).append(" ").toString();
			else
				string = new StringBuilder().append(string).append(Class320.anInt3539 * -989431627).append(Class40.aString491).append(-989431627 * Class320.anInt3539).append(Class40.aString491).append(Class320.anInt3539 * -989431627).append(Class40.aString491).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub15_10767.method10071(2001193339)).append(" ").append(Class710.aClass536_Sub40_8843.aClass710_Sub27_10746.method10156(518603427)).append(" ").append(Class315.method4212((byte) 46)).append(" ").append(Class144.anInt1679 * -1804846931).append(Class40.aString491).append(Class34_Sub6.anInt10965 * 589116499).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub14_10755.method10066((byte) 0)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub9_10756.method10004(-960602366)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub3_10754.method9894(-1017210055)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub2_10765.method9885(-2072898419)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub34_10787.method10204(1867269829)).append(" ").toString();
			string = new StringBuilder().append(string).append("0 ").toString();
			string = new StringBuilder().append(string).append(anInt6857 * -839563813).append(" ").toString();
			string = new StringBuilder().append(string).append(anInt11101 * -708374433).append(" ").toString();
			if (Class458_Sub4.aClass536_Sub38_10336 != null)
				string = new StringBuilder().append(string).append(-853108975 * Class458_Sub4.aClass536_Sub38_10336.anInt10684).toString();
			else
				string = new StringBuilder().append(string).append(-1).toString();
			string = new StringBuilder().append(string).append(" ").toString();
			if (aString11004 != null)
				string = new StringBuilder().append(string).append(aString11004).toString();
			else
				string = new StringBuilder().append(string).append(Class40.aString491).toString();
		} catch (Throwable throwable) {
			/* empty */
		}
		return string;
	}

	static final void method10399() {
		int[] is = Class95.anIntArray1157;
		for (int i = 0; i < Class95.anInt1156 * -1482773169; i++) {
			Player class649_sub1_sub5_sub1_sub2 = aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i]];
			if (class649_sub1_sub5_sub1_sub2 != null)
				class649_sub1_sub5_sub1_sub2.method10905((byte) -101);
		}
		for (int i = 0; i < anInt11053 * -664631943; i++) {
			long l = (long) anIntArray11211[i];
			Class536_Sub13 class536_sub13 = (Class536_Sub13) aClass4_11050.method556(l);
			if (class536_sub13 != null)
				((Class649_Sub1_Sub5_Sub1) class536_sub13.anObject10468).method10905((byte) 11);
		}
		if (1542697723 * anInt11074 == 4) {
			for (int i = 0; i < Class193.aClass189Array2180.length; i++) {
				Class189 class189 = Class193.aClass189Array2180[i];
				if (class189.aBool2141)
					class189.method2804(1149378771).method10905((byte) -119);
			}
		}
	}

	static final void method10400() {
		int[] is = Class95.anIntArray1157;
		for (int i = 0; i < Class95.anInt1156 * -1482773169; i++) {
			Player class649_sub1_sub5_sub1_sub2 = aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i]];
			if (class649_sub1_sub5_sub1_sub2 != null)
				class649_sub1_sub5_sub1_sub2.method10905((byte) -100);
		}
		for (int i = 0; i < anInt11053 * -664631943; i++) {
			long l = (long) anIntArray11211[i];
			Class536_Sub13 class536_sub13 = (Class536_Sub13) aClass4_11050.method556(l);
			if (class536_sub13 != null)
				((Class649_Sub1_Sub5_Sub1) class536_sub13.anObject10468).method10905((byte) 20);
		}
		if (1542697723 * anInt11074 == 4) {
			for (int i = 0; i < Class193.aClass189Array2180.length; i++) {
				Class189 class189 = Class193.aClass189Array2180[i];
				if (class189.aBool2141)
					class189.method2804(-526811475).method10905((byte) 2);
			}
		}
	}

	static final void method10401() {
		int[] is = Class95.anIntArray1157;
		for (int i = 0; i < Class95.anInt1156 * -1482773169; i++) {
			Player class649_sub1_sub5_sub1_sub2 = aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i]];
			if (class649_sub1_sub5_sub1_sub2 != null)
				class649_sub1_sub5_sub1_sub2.method10905((byte) -41);
		}
		for (int i = 0; i < anInt11053 * -664631943; i++) {
			long l = (long) anIntArray11211[i];
			Class536_Sub13 class536_sub13 = (Class536_Sub13) aClass4_11050.method556(l);
			if (class536_sub13 != null)
				((Class649_Sub1_Sub5_Sub1) class536_sub13.anObject10468).method10905((byte) 19);
		}
		if (1542697723 * anInt11074 == 4) {
			for (int i = 0; i < Class193.aClass189Array2180.length; i++) {
				Class189 class189 = Class193.aClass189Array2180[i];
				if (class189.aBool2141)
					class189.method2804(45170917).method10905((byte) -67);
			}
		}
	}

	public static final void method10402() {
		for (int i = 0; i < 5; i++)
			aBoolArray11270[i] = false;
		anInt11192 = -1863105115;
		anInt11119 = -408425903;
		Class593.anInt7811 = 0;
		Class460_Sub1.anInt10291 = 0;
		Class246.anInt2474 = 68985507;
		if (Class65.method1062((short) -17864) == 2) {
			Class598 class598 = aClass515_11066.method6255(-1977873276);
			int i = 1858049507 * class598.anInt7839 << 9;
			int i_162_ = 1479112045 * class598.anInt7840 << 9;
			int i_163_ = 1000 / Class319_Sub1.method9134(-1990889278);
			Class683.aClass301_Sub1_8651.method4070((float) i_163_ / 1000.0F, (aClass515_11066.method6292(609698365).anIntArrayArrayArray5245), aClass515_11066.method6251(-1685259738), i, i_162_, 112434514);
		}
		Class667.anInt8535 = 1594603721;
		Class658.anInt8498 = -662013517;
		anInt11267 = -460612177 * cycles;
		Class184_Sub6.anInt9933 = -371967667 * Class637.anInt8301;
		Class469.anInt5356 = Class205_Sub21.anInt9958 * 761726941;
		Class681.anInt8648 = Class685.anInt8665 * 76702477;
		Class392_Sub3.anInt10231 = 540543625 * Class141.anInt1658;
		Class23.anInt231 = -1308716707 * Class144.anInt1681;
		Class98_Sub1_Sub2.anInt11335 = -34019295 * anInt11287;
	}

	public static final void method10403() {
		if (-1 != anInt11192 * 614327763 && -1 != anInt11119 * 763781455) {
			int i = (anInt11054 * -2057389237 + (-1891555007 * anInt11122 * (anInt11318 * 1242679705 - -2057389237 * anInt11054) >> 16));
			anInt11122 += i * -1116707135;
			if (-1891555007 * anInt11122 >= 65535) {
				anInt11122 = -1454335681;
				if (!aBool11126)
					aBool11120 = true;
				else
					aBool11120 = false;
				aBool11126 = true;
			} else {
				aBool11120 = false;
				aBool11126 = false;
			}
			float f = (float) (-1891555007 * anInt11122) / 65535.0F;
			float[] fs = new float[3];
			int i_164_ = anInt11182 * 1867387298;
			for (int i_165_ = 0; i_165_ < 3; i_165_++) {
				int i_166_ = 3 * (anIntArrayArrayArray11117[614327763 * anInt11192][i_164_][i_165_]);
				int i_167_ = 3 * (anIntArrayArrayArray11117[anInt11192 * 614327763][1 + i_164_][i_165_]);
				int i_168_ = 3 * ((anIntArrayArrayArray11117[anInt11192 * 614327763][2 + i_164_][i_165_]) - ((anIntArrayArrayArray11117[anInt11192 * 614327763][3 + i_164_][i_165_]) - (anIntArrayArrayArray11117[614327763 * anInt11192][2 + i_164_][i_165_])));
				int i_169_ = (anIntArrayArrayArray11117[614327763 * anInt11192][i_164_][i_165_]);
				int i_170_ = i_167_ - i_166_;
				int i_171_ = i_168_ + (i_166_ - i_167_ * 2);
				int i_172_ = ((anIntArrayArrayArray11117[anInt11192 * 614327763][i_164_ + 2][i_165_]) - i_169_ + i_167_ - i_168_);
				fs[i_165_] = (((float) i_170_ + f * ((float) i_171_ + f * (float) i_172_)) * f + (float) i_169_);
			}
			Class598 class598 = aClass515_11066.method6255(-1431704185);
			Class637.anInt8301 = 1420867453 * ((int) fs[0] - class598.anInt7839 * 2133575168);
			Class205_Sub21.anInt9958 = 300318539 * (int) fs[1];
			Class685.anInt8665 = 717279039 * ((int) fs[2] - 1391122944 * class598.anInt7840);
			float[] fs_173_ = new float[3];
			int i_174_ = anInt11248 * -356507514;
			for (int i_175_ = 0; i_175_ < 3; i_175_++) {
				int i_176_ = ((anIntArrayArrayArray11117[anInt11119 * 763781455][i_174_][i_175_]) * 3);
				int i_177_ = 3 * (anIntArrayArrayArray11117[anInt11119 * 763781455][i_174_ + 1][i_175_]);
				int i_178_ = 3 * ((anIntArrayArrayArray11117[763781455 * anInt11119][2 + i_174_][i_175_]) - ((anIntArrayArrayArray11117[anInt11119 * 763781455][3 + i_174_][i_175_]) - (anIntArrayArrayArray11117[763781455 * anInt11119][i_174_ + 2][i_175_])));
				int i_179_ = (anIntArrayArrayArray11117[anInt11119 * 763781455][i_174_][i_175_]);
				int i_180_ = i_177_ - i_176_;
				int i_181_ = i_178_ + (i_176_ - 2 * i_177_);
				int i_182_ = i_177_ + ((anIntArrayArrayArray11117[anInt11119 * 763781455][2 + i_174_][i_175_]) - i_179_) - i_178_;
				fs_173_[i_175_] = ((float) i_179_ + f * ((float) i_180_ + ((float) i_181_ + (float) i_182_ * f) * f));
			}
			float f_183_ = fs_173_[0] - fs[0];
			float f_184_ = -1.0F * (fs_173_[1] - fs[1]);
			float f_185_ = fs_173_[2] - fs[2];
			double d = Math.sqrt((double) (f_185_ * f_185_ + f_183_ * f_183_));
			Class141.anInt1658 = ((int) (Math.atan2((double) f_184_, d) * 2607.5945876176133) & 0x3fff) * 269246561;
			Class144.anInt1681 = ((int) (-Math.atan2((double) f_183_, (double) f_185_) * 2607.5945876176133) & 0x3fff) * 402508199;
			Class304.anInt3440 = (anIntArrayArrayArray11117[anInt11192 * 614327763][i_164_][3] + (((anIntArrayArrayArray11117[614327763 * anInt11192][2 + i_164_][3]) - (anIntArrayArrayArray11117[anInt11192 * 614327763][i_164_][3])) * (anInt11122 * -1891555007) >> 16)) * -2135395277;
		}
	}

	public static final void method10404() {
		if (!aBool11109) {
			aFloat11269 += (12.0F - aFloat11269) / 2.0F;
			aBool11242 = true;
			aBool11109 = true;
		}
	}

	public static final void method10405() {
		if (!aBool11109) {
			aFloat11269 += (12.0F - aFloat11269) / 2.0F;
			aBool11242 = true;
			aBool11109 = true;
		}
	}

	public static final void method10406() {
		if (!aBool11109) {
			aFloat11269 += (-12.0F - aFloat11269) / 2.0F;
			aBool11242 = true;
			aBool11109 = true;
		}
	}

	public static final void method10407() {
		if (!aBool11109) {
			aFloat11269 += (-12.0F - aFloat11269) / 2.0F;
			aBool11242 = true;
			aBool11109 = true;
		}
	}

	public static final void method10408() {
		if (!aBool11109) {
			aFloat11269 += (-12.0F - aFloat11269) / 2.0F;
			aBool11242 = true;
			aBool11109 = true;
		}
	}

	public static final void method10409() {
		if (!aBool10999) {
			aFloat11107 += (24.0F - aFloat11107) / 2.0F;
			aBool11242 = true;
			aBool10999 = true;
		}
	}

	public static final void method10410() {
		if (!aBool10999) {
			aFloat11107 += (-24.0F - aFloat11107) / 2.0F;
			aBool11242 = true;
			aBool10999 = true;
		}
	}

	public static final void method10411() {
		if (!aBool10999) {
			aFloat11107 += (-24.0F - aFloat11107) / 2.0F;
			aBool11242 = true;
			aBool10999 = true;
		}
	}

	static final void method10412() {
		if (aFloat11271 < 1032.0F)
			aFloat11271 = 1032.0F;
		if (aFloat11271 > 2821.0F)
			aFloat11271 = 2821.0F;
		for (/**/; aFloat11106 >= 16384.0F; aFloat11106 -= 16384.0F) {
			/* empty */
		}
		for (/**/; aFloat11106 < 0.0F; aFloat11106 += 16384.0F) {
			/* empty */
		}
		Class455 class455 = aClass515_11066.method6251(-1368036112);
		Class553 class553 = aClass515_11066.method6249(-1070799300);
		int i = Class461.anInt5216 * -787333673 >> 9;
		int i_186_ = -1817694149 * Class222.anInt2326 >> 9;
		int i_187_ = Class54.method944(-787333673 * Class461.anInt5216, -1817694149 * Class222.anInt2326, Class320.anInt3539 * -989431627, 1582358879);
		int i_188_ = 0;
		if (i > 3 && i_186_ > 3 && i < aClass515_11066.method6321((byte) -41) - 4 && i_186_ < aClass515_11066.method6243(177401017) - 4) {
			for (int i_189_ = i - 4; i_189_ <= i + 4; i_189_++) {
				for (int i_190_ = i_186_ - 4; i_190_ <= i_186_ + 4; i_190_++) {
					int i_191_ = -989431627 * Class320.anInt3539;
					if (i_191_ < 3 && class455.method5466(i_189_, i_190_, (byte) -79))
						i_191_++;
					int i_192_ = 0;
					byte[][] is = aClass515_11066.method6250(i_191_, 546570759);
					if (null != is)
						i_192_ = 8 * (is[i_189_][i_190_] & 0xff) << 2;
					if (class553.aClass160Array7431 != null && class553.aClass160Array7431[i_191_] != null) {
						int i_193_ = (i_187_ - (class553.aClass160Array7431[i_191_].method1927(i_189_, i_190_, 1702747792) - i_192_));
						if (i_193_ > i_188_)
							i_188_ = i_193_;
					}
				}
			}
		}
		int i_194_ = 1536 * (i_188_ >> 2);
		if (i_194_ > 786432)
			i_194_ = 786432;
		if (i_194_ < 262144)
			i_194_ = 262144;
		if (i_194_ > anInt11312 * -1639712795)
			anInt11312 += -1174704659 * ((i_194_ - -1639712795 * anInt11312) / 24);
		else if (i_194_ < -1639712795 * anInt11312)
			anInt11312 += -1174704659 * ((i_194_ - anInt11312 * -1639712795) / 80);
	}

	static final void method10413() {
		Class598 class598 = aClass515_11066.method6255(-2003768136);
		Class436 class436 = Class683.aClass301_Sub1_8651.method4055((byte) 5);
		Class637.anInt8301 = 1420867453 * ((int) class436.aFloat4850 - (1858049507 * class598.anInt7839 << 9));
		Class205_Sub21.anInt9958 = -300318539 * -(int) class436.aFloat4852;
		Class685.anInt8665 = ((int) class436.aFloat4853 - (class598.anInt7840 * 1479112045 << 9)) * 717279039;
		Class141.anInt1658 = ((int) ((double) Class683.aClass301_Sub1_8651.method4058((byte) -43) * 2607.5945876176133) & 0x3fff) * 269246561;
		Class144.anInt1681 = ((int) ((double) Class683.aClass301_Sub1_8651.method4092((byte) 20) * 2607.5945876176133) & 0x3fff) * 402508199;
		Class304.anInt3440 = 0;
	}

	static final void method10414() {
		Class598 class598 = aClass515_11066.method6255(-1592305790);
		Class436 class436 = Class683.aClass301_Sub1_8651.method4055((byte) 5);
		Class637.anInt8301 = 1420867453 * ((int) class436.aFloat4850 - (1858049507 * class598.anInt7839 << 9));
		Class205_Sub21.anInt9958 = -300318539 * -(int) class436.aFloat4852;
		Class685.anInt8665 = ((int) class436.aFloat4853 - (class598.anInt7840 * 1479112045 << 9)) * 717279039;
		Class141.anInt1658 = ((int) ((double) Class683.aClass301_Sub1_8651.method4058((byte) -89) * 2607.5945876176133) & 0x3fff) * 269246561;
		Class144.anInt1681 = ((int) ((double) Class683.aClass301_Sub1_8651.method4092((byte) 86) * 2607.5945876176133) & 0x3fff) * 402508199;
		Class304.anInt3440 = 0;
	}

	static final void method10415() {
		Class192.method2842(Class677.aClass167_8609, (long) cycles);
		if (-1 != anInt11187 * -1959825479)
			Class199.method2913(-1959825479 * anInt11187, 820544666);
		for (int i = 0; i < -5823823 * anInt11245; i++) {
			aBoolArray11029[i] = aBoolArray11240[i];
			aBoolArray11240[i] = false;
		}
		anInt11246 = cycles * -1287148997;
		if (-1 != -1959825479 * anInt11187) {
			anInt11245 = 0;
			Class457.method5490(-972318091);
		}
		Class677.aClass167_8609.method2051();
		Class233.method3336(Class677.aClass167_8609, (byte) 15);
		int i = Class520.method6352(117619665);
		if (-1 == i)
			i = 181434031 * anInt11179;
		if (i == -1)
			i = anInt11178 * -551919553;
		Class458_Sub5.method9373(i, (byte) -7);
		anInt11180 = 0;
	}

	static final void method10416() {
		int i = Class95.anInt1156 * -1482773169;
		int[] is = Class95.anIntArray1157;
		int i_195_ = Class710.aClass536_Sub40_8843.aClass710_Sub21_10741.method10109((byte) 1);
		boolean bool = 1 == i_195_ && i > 200 || i_195_ == 0 && i > 50;
		for (int i_196_ = 0; i_196_ < i; i_196_++) {
			Player class649_sub1_sub5_sub1_sub2 = aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i_196_]];
			if (!class649_sub1_sub5_sub1_sub2.method11088(1644471179))
				class649_sub1_sub5_sub1_sub2.anInt11905 = 1239170155;
			else if (class649_sub1_sub5_sub1_sub2.aClass623_12201.method7420(1697426394))
				class649_sub1_sub5_sub1_sub2.anInt11905 = 1239170155;
			else {
				class649_sub1_sub5_sub1_sub2.method10836((short) 29561);
				if (class649_sub1_sub5_sub1_sub2.aShort11867 < 0 || class649_sub1_sub5_sub1_sub2.aShort11865 < 0 || (class649_sub1_sub5_sub1_sub2.aShort11864 >= aClass515_11066.method6321((byte) -1)) || (class649_sub1_sub5_sub1_sub2.aShort11870 >= aClass515_11066.method6243(177401017)))
					class649_sub1_sub5_sub1_sub2.anInt11905 = 1239170155;
				else {
					class649_sub1_sub5_sub1_sub2.aBool12185 = (class649_sub1_sub5_sub1_sub2.aClass688_Sub3_11914.aBool10975) ? bool : false;
					if (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 == class649_sub1_sub5_sub1_sub2)
						class649_sub1_sub5_sub1_sub2.anInt11905 = -908313493;
					else {
						int i_197_ = 0;
						if (!class649_sub1_sub5_sub1_sub2.aBool11894)
							i_197_++;
						if (!class649_sub1_sub5_sub1_sub2.aClass695_11910.method8221(1360139595))
							i_197_ += 2;
						i_197_ += 5 - class649_sub1_sub5_sub1_sub2.method10874() << 2;
						if ((Class210.aClass210_2258 != class649_sub1_sub5_sub1_sub2.aClass210_12200) || class649_sub1_sub5_sub1_sub2.isClanMember)
							i_197_ += 512;
						else {
							if (-1671034871 * anInt11132 == 0)
								i_197_ += 32;
							else
								i_197_ += 128;
							i_197_ += 256;
						}
						if (class649_sub1_sub5_sub1_sub2.method10886(2053541315) == 1696506681 * anInt11002)
							i_197_ += 2047;
						class649_sub1_sub5_sub1_sub2.anInt11905 = (1 + i_197_) * -1239170155;
					}
				}
			}
		}
		for (int i_198_ = 0; i_198_ < anInt11053 * -664631943; i_198_++) {
			NPC class649_sub1_sub5_sub1_sub1 = ((NPC) (((Class536_Sub13) aClass4_11050.method556((long) anIntArray11211[i_198_])).anObject10468));
			if (!class649_sub1_sub5_sub1_sub1.method11068(799896193) || !(class649_sub1_sub5_sub1_sub1.aClass296_12174.method3985(Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, 49424863)))
				class649_sub1_sub5_sub1_sub1.anInt11905 = 1239170155;
			else {
				class649_sub1_sub5_sub1_sub1.method10836((short) 10919);
				if (class649_sub1_sub5_sub1_sub1.aShort11867 < 0 || class649_sub1_sub5_sub1_sub1.aShort11865 < 0 || (class649_sub1_sub5_sub1_sub1.aShort11864 >= aClass515_11066.method6321((byte) 102)) || (class649_sub1_sub5_sub1_sub1.aShort11870 >= aClass515_11066.method6243(177401017)))
					class649_sub1_sub5_sub1_sub1.anInt11905 = 1239170155;
				else {
					int i_199_ = 0;
					if (!class649_sub1_sub5_sub1_sub1.aBool11894)
						i_199_++;
					if (!class649_sub1_sub5_sub1_sub1.aClass695_11910.method8221(1360139595))
						i_199_ += 2;
					if (class649_sub1_sub5_sub1_sub1.method10874() < 5)
						i_199_ += 5 - class649_sub1_sub5_sub1_sub1.method10874() << 2;
					if (0 == -1671034871 * anInt11132) {
						if (class649_sub1_sub5_sub1_sub1.aClass296_12174.aBool3290)
							i_199_ += 64;
						else
							i_199_ += 128;
					} else if (1 == anInt11132 * -1671034871) {
						if (class649_sub1_sub5_sub1_sub1.aClass296_12174.aBool3290)
							i_199_ += 32;
						else
							i_199_ += 64;
					}
					if (class649_sub1_sub5_sub1_sub1.aClass296_12174.aBool3303)
						i_199_ += 1024;
					else if (!class649_sub1_sub5_sub1_sub1.aClass296_12174.aBool3296)
						i_199_ += 256;
					if (class649_sub1_sub5_sub1_sub1.method10886(2142564288) == 1696506681 * anInt11002)
						i_199_ += 2047;
					class649_sub1_sub5_sub1_sub1.anInt11905 = -1239170155 * (i_199_ + 1);
				}
			}
		}
		for (int i_200_ = 0; i_200_ < aClass103Array11020.length; i_200_++) {
			Class103 class103 = aClass103Array11020[i_200_];
			if (class103 != null) {
				if (1 == class103.anInt1224 * 2030004867) {
					Class536_Sub13 class536_sub13 = ((Class536_Sub13) aClass4_11050.method556((long) (class103.anInt1223 * 1298998125)));
					if (class536_sub13 != null) {
						NPC class649_sub1_sub5_sub1_sub1 = ((NPC) class536_sub13.anObject10468);
						if ((1272934333 * class649_sub1_sub5_sub1_sub1.anInt11905) >= 0)
							class649_sub1_sub5_sub1_sub1.anInt11905 += 505194496;
					}
				} else if (10 == 2030004867 * class103.anInt1224) {
					Player class649_sub1_sub5_sub1_sub2 = (aClass649_Sub1_Sub5_Sub1_Sub2Array11155[class103.anInt1223 * 1298998125]);
					if (class649_sub1_sub5_sub1_sub2 != null && (class649_sub1_sub5_sub1_sub2 != Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591) && (class649_sub1_sub5_sub1_sub2.anInt11905 * 1272934333) >= 0)
						class649_sub1_sub5_sub1_sub2.anInt11905 += 505194496;
				}
			}
		}
	}

	public static final void method10417() {
		int i = Class710.aClass536_Sub40_8843.aClass710_Sub5_10761.method9916(37998661);
		if (i == 0) {
			aClass515_11066.method6246(null, -566973078);
			Class689.method8183(0, (byte) -17);
		} else if (1 == i || 3 == i) {
			Class184_Sub3.method8990((byte) 0, 989859281);
			Class689.method8183(512, (byte) 40);
			if (aClass515_11066.method6249(-363692350) != null)
				Class158.method1890((byte) 18);
		} else {
			Class184_Sub3.method8990((byte) (648319383 * anInt11127 - 4 & 0xff), 573460852);
			Class689.method8183(2, (byte) -103);
		}
		anInt11264 = Class320.anInt3539 * -1505723837;
	}

	public static final void method10418() {
		aBool11121 = true;
	}

	static final void method10419() {
		for (Class521_Sub5 class521_sub5 = (Class521_Sub5) aClass695_11131.method8213(-1423263947); class521_sub5 != null; class521_sub5 = (Class521_Sub5) aClass695_11131.method8213(-1423263947))
			ItemDefinitions.method524(class521_sub5, (byte) 19);
		int i = 0;
		int i_201_ = 3;
		if (1542697723 * anInt11074 == 4) {
			for (int i_202_ = i; i_202_ <= i_201_; i_202_++)
				method10378(i_202_);
			method10380();
		} else {
			method10375();
			for (int i_203_ = i; i_203_ <= i_201_; i_203_++) {
				method10376();
				method10377(i_203_);
				method10378(i_203_);
			}
			method10379();
			method10380();
		}
	}

	static final void method10420() {
		anInt11261 = 0;
		for (int i = 0; i < anInt11053 * -664631943; i++) {
			NPC class649_sub1_sub5_sub1_sub1 = ((NPC) (((Class536_Sub13) aClass4_11050.method556((long) anIntArray11211[i])).anObject10468));
			if (class649_sub1_sub5_sub1_sub1.aBool11894 && class649_sub1_sub5_sub1_sub1.method10879((byte) 5) != -1) {
				int i_204_ = ((class649_sub1_sub5_sub1_sub1.method10874() - 1) * 256 + 252);
				Class436 class436 = class649_sub1_sub5_sub1_sub1.method7837().aClass436_4823;
				int i_205_ = (int) class436.aFloat4850 - i_204_ >> 9;
				int i_206_ = (int) class436.aFloat4853 - i_204_ >> 9;
				Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1 = Class533.method6466((class649_sub1_sub5_sub1_sub1.aByte10839), i_205_, i_206_, 553966281);
				if (null != class649_sub1_sub5_sub1) {
					int i_207_ = class649_sub1_sub5_sub1.anInt11889 * 1710020215;
					if (class649_sub1_sub5_sub1 instanceof NPC)
						i_207_ += 2048;
					if (class649_sub1_sub5_sub1.anInt11896 * -1991503595 == 0 && (class649_sub1_sub5_sub1.method10879((byte) -90) != -1)) {
						anIntArray11128[1973460815 * anInt11261] = i_207_;
						anIntArray11129[anInt11261 * 1973460815] = i_207_;
						anInt11261 += 1479350191;
						class649_sub1_sub5_sub1.anInt11896 += -2104510915;
					}
					anIntArray11128[anInt11261 * 1973460815] = i_207_;
					anIntArray11129[1973460815 * anInt11261] = 2048 + (class649_sub1_sub5_sub1_sub1.anInt11889 * 1710020215);
					anInt11261 += 1479350191;
					class649_sub1_sub5_sub1.anInt11896 += -2104510915;
				}
			}
		}
		Class591.method7112(anIntArray11129, anIntArray11128, 0, 1973460815 * anInt11261 - 1, (byte) 115);
	}

	static final void method10421() {
		anInt11261 = 0;
		for (int i = 0; i < anInt11053 * -664631943; i++) {
			NPC class649_sub1_sub5_sub1_sub1 = ((NPC) (((Class536_Sub13) aClass4_11050.method556((long) anIntArray11211[i])).anObject10468));
			if (class649_sub1_sub5_sub1_sub1.aBool11894 && (class649_sub1_sub5_sub1_sub1.method10879((byte) -74) != -1)) {
				int i_208_ = ((class649_sub1_sub5_sub1_sub1.method10874() - 1) * 256 + 252);
				Class436 class436 = class649_sub1_sub5_sub1_sub1.method7837().aClass436_4823;
				int i_209_ = (int) class436.aFloat4850 - i_208_ >> 9;
				int i_210_ = (int) class436.aFloat4853 - i_208_ >> 9;
				Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1 = Class533.method6466((class649_sub1_sub5_sub1_sub1.aByte10839), i_209_, i_210_, 1327241412);
				if (null != class649_sub1_sub5_sub1) {
					int i_211_ = class649_sub1_sub5_sub1.anInt11889 * 1710020215;
					if (class649_sub1_sub5_sub1 instanceof NPC)
						i_211_ += 2048;
					if (class649_sub1_sub5_sub1.anInt11896 * -1991503595 == 0 && (class649_sub1_sub5_sub1.method10879((byte) -68) != -1)) {
						anIntArray11128[1973460815 * anInt11261] = i_211_;
						anIntArray11129[anInt11261 * 1973460815] = i_211_;
						anInt11261 += 1479350191;
						class649_sub1_sub5_sub1.anInt11896 += -2104510915;
					}
					anIntArray11128[anInt11261 * 1973460815] = i_211_;
					anIntArray11129[1973460815 * anInt11261] = 2048 + (class649_sub1_sub5_sub1_sub1.anInt11889 * 1710020215);
					anInt11261 += 1479350191;
					class649_sub1_sub5_sub1.anInt11896 += -2104510915;
				}
			}
		}
		Class591.method7112(anIntArray11129, anIntArray11128, 0, 1973460815 * anInt11261 - 1, (byte) 72);
	}

	static final void method10422() {
		anInt11261 = 0;
		for (int i = 0; i < anInt11053 * -664631943; i++) {
			NPC class649_sub1_sub5_sub1_sub1 = ((NPC) (((Class536_Sub13) aClass4_11050.method556((long) anIntArray11211[i])).anObject10468));
			if (class649_sub1_sub5_sub1_sub1.aBool11894 && (class649_sub1_sub5_sub1_sub1.method10879((byte) -33) != -1)) {
				int i_212_ = ((class649_sub1_sub5_sub1_sub1.method10874() - 1) * 256 + 252);
				Class436 class436 = class649_sub1_sub5_sub1_sub1.method7837().aClass436_4823;
				int i_213_ = (int) class436.aFloat4850 - i_212_ >> 9;
				int i_214_ = (int) class436.aFloat4853 - i_212_ >> 9;
				Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1 = Class533.method6466((class649_sub1_sub5_sub1_sub1.aByte10839), i_213_, i_214_, 1644429936);
				if (null != class649_sub1_sub5_sub1) {
					int i_215_ = class649_sub1_sub5_sub1.anInt11889 * 1710020215;
					if (class649_sub1_sub5_sub1 instanceof NPC)
						i_215_ += 2048;
					if (class649_sub1_sub5_sub1.anInt11896 * -1991503595 == 0 && (class649_sub1_sub5_sub1.method10879((byte) -41) != -1)) {
						anIntArray11128[1973460815 * anInt11261] = i_215_;
						anIntArray11129[anInt11261 * 1973460815] = i_215_;
						anInt11261 += 1479350191;
						class649_sub1_sub5_sub1.anInt11896 += -2104510915;
					}
					anIntArray11128[anInt11261 * 1973460815] = i_215_;
					anIntArray11129[1973460815 * anInt11261] = 2048 + (class649_sub1_sub5_sub1_sub1.anInt11889 * 1710020215);
					anInt11261 += 1479350191;
					class649_sub1_sub5_sub1.anInt11896 += -2104510915;
				}
			}
		}
		Class591.method7112(anIntArray11129, anIntArray11128, 0, 1973460815 * anInt11261 - 1, (byte) 17);
	}

	static final void method10423() {
		int i = Class95.anInt1156 * -1482773169;
		int[] is = Class95.anIntArray1157;
		int i_216_;
		if (1542697723 * anInt11074 == 4)
			i_216_ = Class193.aClass189Array2180.length;
		else
			i_216_ = aBool11023 ? i : -664631943 * anInt11053 + i;
		for (int i_217_ = 0; i_217_ < i_216_; i_217_++) {
			Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1;
			if (anInt11074 * 1542697723 == 4) {
				Class189 class189 = Class193.aClass189Array2180[i_217_];
				if (!class189.aBool2141)
					continue;
				class649_sub1_sub5_sub1 = class189.method2804(665303819);
			} else {
				if (i_217_ < i)
					class649_sub1_sub5_sub1 = aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i_217_]];
				else
					class649_sub1_sub5_sub1 = ((Class649_Sub1_Sub5_Sub1) (((Class536_Sub13) aClass4_11050.method556((long) anIntArray11211[i_217_ - i])).anObject10468));
				if (class649_sub1_sub5_sub1.anInt11905 * 1272934333 < 0)
					continue;
			}
			int i_218_ = class649_sub1_sub5_sub1.method10874();
			Class436 class436 = class649_sub1_sub5_sub1.method7837().aClass436_4823;
			if (0 == (i_218_ & 0x1)) {
				if (((int) class436.aFloat4850 & 0x1ff) == 0 && ((int) class436.aFloat4853 & 0x1ff) == 0)
					continue;
			} else if (((int) class436.aFloat4850 & 0x1ff) == 256 && 256 == ((int) class436.aFloat4853 & 0x1ff))
				continue;
			if ((class649_sub1_sub5_sub1.anInt11923 * 1080012231 <= cycles && (class649_sub1_sub5_sub1.anInt11924 * -327061215 < cycles)) || (class649_sub1_sub5_sub1.anInt11921 * -1428852859 == class649_sub1_sub5_sub1.anInt11922 * -22167277))
				class649_sub1_sub5_sub1.method7842(class436.aFloat4850, (float) Class54.method944((int) class436.aFloat4850, (int) class436.aFloat4853, (class649_sub1_sub5_sub1.aByte10839), 1381765850), class436.aFloat4853);
			aClass515_11066.method6249(1965934762).method6711(class649_sub1_sub5_sub1, true, -1077781554);
		}
	}

	static final void method10424() {
		int i = Class95.anInt1156 * -1482773169;
		int[] is = Class95.anIntArray1157;
		int i_219_;
		if (1542697723 * anInt11074 == 4)
			i_219_ = Class193.aClass189Array2180.length;
		else
			i_219_ = aBool11023 ? i : -664631943 * anInt11053 + i;
		for (int i_220_ = 0; i_220_ < i_219_; i_220_++) {
			Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1;
			if (anInt11074 * 1542697723 == 4) {
				Class189 class189 = Class193.aClass189Array2180[i_220_];
				if (!class189.aBool2141)
					continue;
				class649_sub1_sub5_sub1 = class189.method2804(852622634);
			} else {
				if (i_220_ < i)
					class649_sub1_sub5_sub1 = aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i_220_]];
				else
					class649_sub1_sub5_sub1 = ((Class649_Sub1_Sub5_Sub1) (((Class536_Sub13) aClass4_11050.method556((long) anIntArray11211[i_220_ - i])).anObject10468));
				if (class649_sub1_sub5_sub1.anInt11905 * 1272934333 < 0)
					continue;
			}
			int i_221_ = class649_sub1_sub5_sub1.method10874();
			Class436 class436 = class649_sub1_sub5_sub1.method7837().aClass436_4823;
			if (0 == (i_221_ & 0x1)) {
				if (((int) class436.aFloat4850 & 0x1ff) == 0 && ((int) class436.aFloat4853 & 0x1ff) == 0)
					continue;
			} else if (((int) class436.aFloat4850 & 0x1ff) == 256 && 256 == ((int) class436.aFloat4853 & 0x1ff))
				continue;
			if ((class649_sub1_sub5_sub1.anInt11923 * 1080012231 <= cycles && (class649_sub1_sub5_sub1.anInt11924 * -327061215 < cycles)) || (class649_sub1_sub5_sub1.anInt11921 * -1428852859 == class649_sub1_sub5_sub1.anInt11922 * -22167277))
				class649_sub1_sub5_sub1.method7842(class436.aFloat4850, (float) Class54.method944((int) class436.aFloat4850, (int) class436.aFloat4853, (class649_sub1_sub5_sub1.aByte10839), 1905099195), class436.aFloat4853);
			aClass515_11066.method6249(1366009502).method6711(class649_sub1_sub5_sub1, true, -1441599509);
		}
	}

	static final void method10425() {
		int i = Class95.anInt1156 * -1482773169;
		int[] is = Class95.anIntArray1157;
		int i_222_;
		if (1542697723 * anInt11074 == 4)
			i_222_ = Class193.aClass189Array2180.length;
		else
			i_222_ = aBool11023 ? i : -664631943 * anInt11053 + i;
		for (int i_223_ = 0; i_223_ < i_222_; i_223_++) {
			Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1;
			if (anInt11074 * 1542697723 == 4) {
				Class189 class189 = Class193.aClass189Array2180[i_223_];
				if (!class189.aBool2141)
					continue;
				class649_sub1_sub5_sub1 = class189.method2804(1380179956);
			} else {
				if (i_223_ < i)
					class649_sub1_sub5_sub1 = aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i_223_]];
				else
					class649_sub1_sub5_sub1 = ((Class649_Sub1_Sub5_Sub1) (((Class536_Sub13) aClass4_11050.method556((long) anIntArray11211[i_223_ - i])).anObject10468));
				if (class649_sub1_sub5_sub1.anInt11905 * 1272934333 < 0)
					continue;
			}
			int i_224_ = class649_sub1_sub5_sub1.method10874();
			Class436 class436 = class649_sub1_sub5_sub1.method7837().aClass436_4823;
			if (0 == (i_224_ & 0x1)) {
				if (((int) class436.aFloat4850 & 0x1ff) == 0 && ((int) class436.aFloat4853 & 0x1ff) == 0)
					continue;
			} else if (((int) class436.aFloat4850 & 0x1ff) == 256 && 256 == ((int) class436.aFloat4853 & 0x1ff))
				continue;
			if ((class649_sub1_sub5_sub1.anInt11923 * 1080012231 <= cycles && (class649_sub1_sub5_sub1.anInt11924 * -327061215 < cycles)) || (class649_sub1_sub5_sub1.anInt11921 * -1428852859 == class649_sub1_sub5_sub1.anInt11922 * -22167277))
				class649_sub1_sub5_sub1.method7842(class436.aFloat4850, (float) Class54.method944((int) class436.aFloat4850, (int) class436.aFloat4853, (class649_sub1_sub5_sub1.aByte10839), 1758570003), class436.aFloat4853);
			aClass515_11066.method6249(1771527498).method6711(class649_sub1_sub5_sub1, true, 757754089);
		}
	}

	static final void method10426() {
		for (Class536_Sub18_Sub8 class536_sub18_sub8 = ((Class536_Sub18_Sub8) aClass708_11174.method8308(1867269829)); class536_sub18_sub8 != null; class536_sub18_sub8 = ((Class536_Sub18_Sub8) aClass708_11174.method8311(900235146))) {
			Class649_Sub1_Sub5_Sub6 class649_sub1_sub5_sub6 = class536_sub18_sub8.aClass649_Sub1_Sub5_Sub6_11696;
			if (cycles > 668402135 * class649_sub1_sub5_sub6.anInt12140) {
				class536_sub18_sub8.method6484(-421136579);
				class649_sub1_sub5_sub6.method11048(2136640584);
			} else if (cycles >= class649_sub1_sub5_sub6.anInt12139 * -861810539) {
				class649_sub1_sub5_sub6.method11054(219909430);
				if (class649_sub1_sub5_sub6.anInt12144 * -2056997773 > 0) {
					if (anInt11074 * 1542697723 == 4) {
						Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1 = Class193.aClass189Array2180[(class649_sub1_sub5_sub6.anInt12144 * -2056997773) - 1].method2804(583874957);
						if (null != class649_sub1_sub5_sub1) {
							Class436 class436 = (class649_sub1_sub5_sub1.method7837().aClass436_4823);
							if ((int) class436.aFloat4850 >= 0 && ((int) class436.aFloat4850 < (aClass515_11066.method6321((byte) -11) * 512)) && (int) class436.aFloat4853 >= 0 && ((int) class436.aFloat4853 < (aClass515_11066.method6243(177401017) * 512)))
								class649_sub1_sub5_sub6.method11046((int) class436.aFloat4850, (int) class436.aFloat4853, ((Class54.method944((int) class436.aFloat4850, (int) class436.aFloat4853, class649_sub1_sub5_sub1.aByte10839, 1592806544)) - -856318621 * (class649_sub1_sub5_sub6.anInt12155)), cycles, -2080177988);
						}
					} else {
						Class536_Sub13 class536_sub13 = ((Class536_Sub13) (aClass4_11050.method556((long) ((-2056997773 * class649_sub1_sub5_sub6.anInt12144) - 1))));
						if (null != class536_sub13) {
							NPC class649_sub1_sub5_sub1_sub1 = ((NPC) class536_sub13.anObject10468);
							Class436 class436 = (class649_sub1_sub5_sub1_sub1.method7837().aClass436_4823);
							if ((int) class436.aFloat4850 >= 0 && ((int) class436.aFloat4850 < (aClass515_11066.method6321((byte) 115) * 512)) && (int) class436.aFloat4853 >= 0 && ((int) class436.aFloat4853 < (aClass515_11066.method6243(177401017) * 512)))
								class649_sub1_sub5_sub6.method11046((int) class436.aFloat4850, (int) class436.aFloat4853, ((Class54.method944((int) class436.aFloat4850, (int) class436.aFloat4853, class649_sub1_sub5_sub6.aByte10839, 1326794667)) - (class649_sub1_sub5_sub6.anInt12155 * -856318621)), cycles, -1845927667);
						}
					}
				}
				if (-2056997773 * class649_sub1_sub5_sub6.anInt12144 < 0) {
					int i = (-(class649_sub1_sub5_sub6.anInt12144 * -2056997773) - 1);
					Player class649_sub1_sub5_sub1_sub2;
					if (-1791435655 * anInt11156 == i)
						class649_sub1_sub5_sub1_sub2 = Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591;
					else
						class649_sub1_sub5_sub1_sub2 = aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i];
					if (class649_sub1_sub5_sub1_sub2 != null) {
						Class436 class436 = (class649_sub1_sub5_sub1_sub2.method7837().aClass436_4823);
						if ((int) class436.aFloat4850 >= 0 && ((int) class436.aFloat4850 < aClass515_11066.method6321((byte) -33) * 512) && (int) class436.aFloat4853 >= 0 && ((int) class436.aFloat4853 < aClass515_11066.method6243(177401017) * 512))
							class649_sub1_sub5_sub6.method11046((int) class436.aFloat4850, (int) class436.aFloat4853, (Class54.method944((int) class436.aFloat4850, (int) class436.aFloat4853, (class649_sub1_sub5_sub6.aByte10839), 2106256927) - (class649_sub1_sub5_sub6.anInt12155 * -856318621)), cycles, -1076569001);
					}
				}
				class649_sub1_sub5_sub6.method11047(anInt11180 * -1483561311, (byte) -39);
				aClass515_11066.method6249(1973361865).method6711(class649_sub1_sub5_sub6, true, -253548245);
			}
		}
	}

	static final void method10427() {
		Iterator iterator = aClass4_11175.iterator();
		while (iterator.hasNext()) {
			Class536_Sub18_Sub4 class536_sub18_sub4 = (Class536_Sub18_Sub4) iterator.next();
			Class649_Sub1_Sub5_Sub4 class649_sub1_sub5_sub4 = class536_sub18_sub4.aClass649_Sub1_Sub5_Sub4_11619;
			if (aClass515_11066.method6249(-1883827166) != null && class649_sub1_sub5_sub4.method11039(-1925024599))
				aClass515_11066.method6249(-183770508).method6711(class649_sub1_sub5_sub4, true, -1049805263);
		}
	}

	static final void method10428() {
		Iterator iterator = aClass4_11175.iterator();
		while (iterator.hasNext()) {
			Class536_Sub18_Sub4 class536_sub18_sub4 = (Class536_Sub18_Sub4) iterator.next();
			Class649_Sub1_Sub5_Sub4 class649_sub1_sub5_sub4 = class536_sub18_sub4.aClass649_Sub1_Sub5_Sub4_11619;
			if (aClass515_11066.method6249(1522215891) != null && class649_sub1_sub5_sub4.method11039(-1832069290))
				aClass515_11066.method6249(-662453863).method6711(class649_sub1_sub5_sub4, true, -1519731149);
		}
	}

	static final void method10429() {
		Iterator iterator = aClass4_11175.iterator();
		while (iterator.hasNext()) {
			Class536_Sub18_Sub4 class536_sub18_sub4 = (Class536_Sub18_Sub4) iterator.next();
			Class649_Sub1_Sub5_Sub4 class649_sub1_sub5_sub4 = class536_sub18_sub4.aClass649_Sub1_Sub5_Sub4_11619;
			if (aClass515_11066.method6249(-1843735780) != null && class649_sub1_sub5_sub4.method11039(-1580801593))
				aClass515_11066.method6249(1140056034).method6711(class649_sub1_sub5_sub4, true, 1141901010);
		}
	}

	void method10430(int i) {
		Class321.aSocket3543 = null;
		Class582.aClass567_7700 = null;
		handshakeStage = 0;
		Class176.aClass460_1936.anInt5195 += 971530315;
		Class176.aClass460_1936.anInt5196 = i * -938617607;
	}

	final void method6128() {
		if (anInt11101 * -708374433 != 2) {
			if ((12 == anInt11101 * -708374433 || Class566.method6895(-708374433 * anInt11101, -1247996131) || Class233.method3334(-708374433 * anInt11101, (byte) -120)) && Class184_Sub2.aClass211_9442 != null)
				Class184_Sub2.aClass211_9442.method3010(Class184_Sub2.aClass211_9442.method3059((byte) 45), Class710.aClass536_Sub40_8843.aClass710_Sub35_10790.method10213(-1844066675), -1707682181);
			if (aBool11067) {
				synchronized (anObject11069) {
					anObject11069.notify();
				}
				synchronized (anObject11068) {
					try {
						anObject11068.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool11067 = false;
			}
			cycles++;
			if (cycles % 1000 == 1) {
				GregorianCalendar gregoriancalendar = new GregorianCalendar();
				Class458_Sub4.anInt10337 = (gregoriancalendar.get(11) * 600 + gregoriancalendar.get(12) * 10 + gregoriancalendar.get(13) / 6);
				aRandom11161.setSeed((long) Class458_Sub4.anInt10337);
			}
			long l = Class249.method3450(1402169731);
			aClass106_11322.method1410(-900595112);
			aClass106_11218.method1410(-337488167);
			method10372((byte) 0);
			if (null != Class290.aClass426_3223)
				Class290.aClass426_3223.method5125(1231560177);
			if (Class184_Sub2.aClass211_9442 != null)
				Class184_Sub2.aClass211_9442.method2987((short) 31216);
			Class331_Sub2.aClass549_10049.method6637(1842518823);
			Class329.aClass550_3601.method6651(-520487674);
			Class295.method3977(Class677.aClass167_8609, l);
			method10383(-1251746916);
			if (Class677.aClass167_8609 != null)
				Class677.aClass167_8609.method2007((int) l);
			anInt11033 = 0;
			anInt11036 = 0;
			for (Interface63 interface63 = Class331_Sub2.aClass549_10049.method6640(612307069); interface63 != null; interface63 = Class331_Sub2.aClass549_10049.method6640(612307069)) {
				int i = interface63.method373((byte) 14);
				if (2 == i || i == 3) {
					if (anInt11033 * -1816034791 < 130) {
						anInterface63Array11034[anInt11033 * -1816034791] = interface63;
						anInt11033 += 1893513769;
					}
				} else if (i == 0) {
					if (Class54.method942(472844728) && interface63.method413(842319059) == 28) {
						if (423156687 * anInt11160 >= 2 && Class331_Sub2.aClass549_10049.method6638(82, (byte) 0)) {
							if (Class70.method1117(-265710562))
								Class316.method4218(-1717165789);
							else
								Class294.method3971(Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method190(-561773182), (byte) 85);
						} else if (Class44.method882(765303365) && (Class710.aClass536_Sub40_8843.aClass710_Sub30_10786.method10180(-1647630198) == 0 || Class331_Sub2.aClass549_10049.method6638(86, (byte) 0)))
							Class98_Sub1.method8393(1327422080);
						else if (Class710.aClass536_Sub40_8843.aClass710_Sub30_10786.method10180(-1647630198) == 0 || Class331_Sub2.aClass549_10049.method6638(86, (byte) 0))
							Class167.method2414(355094633);
						else
							Class269.method3710((Class38.aClass38_453.method840(Class459.aClass664_5178, 1338285243)), (byte) -85);
					}
					if (anInt11036 * -1621465757 < 77) {
						anInterface63Array11037[-1621465757 * anInt11036] = interface63;
						anInt11036 += -1829616565;
					}
				}
			}
			anInt11031 = 0;
			for (Class536_Sub31 class536_sub31 = Class329.aClass550_3601.method6659((byte) 61); null != class536_sub31; class536_sub31 = Class329.aClass550_3601.method6659((byte) 21)) {
				int i = class536_sub31.method9642(-2101163496);
				if (i == -1)
					Class523.method6400(class536_sub31, (short) -8514);
				else if (6 == i) {
					anInt11031 += class536_sub31.method9644(-343267839) * 241652841;
					class536_sub31.method9641(-1999360770);
				} else if (Class160.method1960(i, (byte) -23)) {
					aClass708_11250.method8335(class536_sub31, 107892308);
					if (aClass708_11250.method8339((byte) 100) > 10) {
						Class536_Sub31 class536_sub31_225_ = ((Class536_Sub31) aClass708_11250.method8305(-850053449));
						if (class536_sub31_225_ != null)
							class536_sub31_225_.method9641(-1252579842);
					}
				}
			}
			if (Class44.method882(15629094))
				Class624.method7427((byte) -15);
			if (Class482.method5837(-708374433 * anInt11101, -1705092942)) {
				Class3.method554(-1890764077);
				Class444.method5392(-1679511901);
			} else if (Class578.method7007(-708374433 * anInt11101, 1359516053))
				aClass515_11066.method6271(1818538378);
			if (Class566.method6895(anInt11101 * -708374433, -1229205844) && !Class578.method7007(anInt11101 * -708374433, -330575497)) {
				method10374(22069970);
				Class154.method1871(1155307375);
				Class283.handleLogin(-1602819907);
			} else if (Class233.method3334(anInt11101 * -708374433, (byte) -3) && !Class578.method7007(anInt11101 * -708374433, 588340395)) {
				method10374(1847694081);
				Class283.handleLogin(-619753006);
			} else if (4 == anInt11101 * -708374433)
				Class283.handleLogin(1619619300);
			else if (Class426.method5129(anInt11101 * -708374433, 1603352511) && !Class578.method7007(anInt11101 * -708374433, 1854377388))
				Class678.method8062(792267065);
			else if (17 == -708374433 * anInt11101 || 19 == anInt11101 * -708374433) {
				Class283.handleLogin(-1056532617);
				if (-3 != 1063476305 * Class61.anInt687 && 1063476305 * Class61.anInt687 != 2 && 15 != Class61.anInt687 * 1063476305) {
					if (-708374433 * anInt11101 == 19) {
						Class61.anInt690 = 1717456075 * Class61.anInt693;
						Class61.anInt689 = Class61.anInt651 * 1842886491;
						Class61.anInt688 = Class61.anInt687 * 1466930321;
						if (Class710_Sub1.aBool10815) {
							Class554.method6786(1318197187 * Class195.aClass5_2200.anInt111, Class195.aClass5_2200.aString112, Class195.aClass5_2200.anInt110 * -843966029, Class195.aClass5_2200.anInt108 * -910853859, -2121564312);
							aClass106_11322.method1412(25531420);
							Class673.method8026(17, -1798113843);
						} else
							Class275.method3737(Class61.aBool653, -1576165129);
					} else
						Class275.method3737(false, -1326902289);
				}
			}
			Class699.method8235(Class677.aClass167_8609, 1598282021);
			aClass708_11250.method8305(931986654);
			if (null != Class677.aClass167_8609) {
				Iterator iterator = aMap11301.entrySet().iterator();
				while (iterator.hasNext()) {
					Map.Entry entry = (Map.Entry) iterator.next();
					Class114 class114 = (Class114) entry.getValue();
					if (class114.method1476(268833862)) {
						byte[] is = class114.method1477(-717952580);
						if (null != is) {
							try {
								BufferedImage bufferedimage = ImageIO.read(new ByteArrayInputStream(is));
								int[] is_226_ = Class66.method1077(bufferedimage, -1655573017);
								Class143 class143 = (Class677.aClass167_8609.method2081(is_226_, 0, bufferedimage.getWidth(), bufferedimage.getWidth(), bufferedimage.getHeight(), (byte) -107));
								aClass199_11300.method2881(class143, (long) ((Integer) entry.getKey()).intValue());
							} catch (IOException ioexception) {
								Class81.method1165(Class313.aclient3500.method6092(21887516), ioexception, (byte) -92);
							}
						}
						iterator.remove();
					}
				}
			}
		}
	}

	void method10431(int i) {
		Class321.aSocket3543 = null;
		Class582.aClass567_7700 = null;
		handshakeStage = 0;
		Class176.aClass460_1936.anInt5195 += 971530315;
		Class176.aClass460_1936.anInt5196 = i * -938617607;
	}

	static final void method10432() {
		int i = Class95.anInt1156 * -1482773169;
		int[] is = Class95.anIntArray1157;
		int i_227_;
		if (1542697723 * anInt11074 == 4)
			i_227_ = Class193.aClass189Array2180.length;
		else
			i_227_ = aBool11023 ? i : -664631943 * anInt11053 + i;
		for (int i_228_ = 0; i_228_ < i_227_; i_228_++) {
			Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1;
			if (anInt11074 * 1542697723 == 4) {
				Class189 class189 = Class193.aClass189Array2180[i_228_];
				if (!class189.aBool2141)
					continue;
				class649_sub1_sub5_sub1 = class189.method2804(1376085863);
			} else {
				if (i_228_ < i)
					class649_sub1_sub5_sub1 = aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i_228_]];
				else
					class649_sub1_sub5_sub1 = ((Class649_Sub1_Sub5_Sub1) (((Class536_Sub13) aClass4_11050.method556((long) anIntArray11211[i_228_ - i])).anObject10468));
				if (class649_sub1_sub5_sub1.anInt11905 * 1272934333 < 0)
					continue;
			}
			int i_229_ = class649_sub1_sub5_sub1.method10874();
			Class436 class436 = class649_sub1_sub5_sub1.method7837().aClass436_4823;
			if (0 == (i_229_ & 0x1)) {
				if (((int) class436.aFloat4850 & 0x1ff) == 0 && ((int) class436.aFloat4853 & 0x1ff) == 0)
					continue;
			} else if (((int) class436.aFloat4850 & 0x1ff) == 256 && 256 == ((int) class436.aFloat4853 & 0x1ff))
				continue;
			if ((class649_sub1_sub5_sub1.anInt11923 * 1080012231 <= cycles && (class649_sub1_sub5_sub1.anInt11924 * -327061215 < cycles)) || (class649_sub1_sub5_sub1.anInt11921 * -1428852859 == class649_sub1_sub5_sub1.anInt11922 * -22167277))
				class649_sub1_sub5_sub1.method7842(class436.aFloat4850, (float) Class54.method944((int) class436.aFloat4850, (int) class436.aFloat4853, (class649_sub1_sub5_sub1.aByte10839), 1739231395), class436.aFloat4853);
			aClass515_11066.method6249(257818501).method6711(class649_sub1_sub5_sub1, true, -1037407793);
		}
	}

	void method10433(int i) {
		if (-2073269917 * Class176.aClass460_1936.anInt5195 > 1500629495 * anInt11263) {
			Class23.aClass5_219.method574(-1387027942);
			anInt11042 = 535840638 * Class176.aClass460_1936.anInt5195 - 1315189226;
			if (anInt11042 * -862309271 > 3000)
				anInt11042 = -1397598472;
			if (Class176.aClass460_1936.anInt5195 * -2073269917 >= 2 && 6 == Class176.aClass460_1936.anInt5196 * 917679433) {
				method6121("js5connect_outofdate", 145879821);
				anInt11101 = -1675716802;
				return;
			}
			if (-2073269917 * Class176.aClass460_1936.anInt5195 >= 1 && 48 == Class176.aClass460_1936.anInt5196 * 917679433) {
				method6121("sessionexpired", -148113314);
				anInt11101 = -1675716802;
				return;
			}
			if (Class176.aClass460_1936.anInt5195 * -2073269917 >= 4 && 917679433 * Class176.aClass460_1936.anInt5196 == -1) {
				method6098("js5crc", new StringBuilder().append("a=").append(38726355 * Class176.aClass460_1936.anInt5197).append("&g=").append(Class176.aClass460_1936.anInt5183 * -899459829).toString(), -1649496430);
				anInt11101 = -1675716802;
				return;
			}
			if (-2073269917 * Class176.aClass460_1936.anInt5195 >= 4 && Class482.method5837(-708374433 * anInt11101, 2124611816)) {
				if (7 == 917679433 * Class176.aClass460_1936.anInt5196 || Class176.aClass460_1936.anInt5196 * 917679433 == 9)
					method6121("js5connect_full", -516493141);
				else if (917679433 * Class176.aClass460_1936.anInt5196 > 0) {
					if (aString11046 == null)
						method6121("js5connect", -579060911);
					else
						method6121(new StringBuilder().append("js5proxy_").append(aString11046.trim()).toString(), 1577388765);
				} else
					method6121("js5io", 1228952217);
				anInt11101 = -1675716802;
				return;
			}
		}
		anInt11263 = Class176.aClass460_1936.anInt5195 * -249372427;
		if (anInt11042 * -862309271 > 0)
			anInt11042 -= -1386308647;
		else {
			try {
				if (handshakeStage * -275818405 == 0) {
					Class321.aSocket3543 = Class23.aClass5_219.method575((byte) 40);
					handshakeStage += -1210181677;
				}
				if (handshakeStage * -275818405 == 1) {
					Class582.aClass567_7700 = Class506.method6146(Class321.aSocket3543, 131072, (byte) 111);
					int i_230_ = 10 + aString11004.length();
					RSByteBuffer class536_sub33 = new RSByteBuffer(2 + i_230_);
					class536_sub33.writeByte(1258126983 * (Class420.aClass420_4572.anInt4571));
					class536_sub33.writeByte(i_230_);
					class536_sub33.writeInt(876);
					class536_sub33.writeInt(1);
					class536_sub33.writeString(aString11004);
					class536_sub33.writeByte((Class459.aClass664_5178.anInt8526) * -1919173613);
					Class582.aClass567_7700.method6912((class536_sub33.buffer), 0, i_230_ + 2, (byte) -5);
					handshakeStage += -1210181677;
					Class95.aLong1163 = (Class249.method3450(1614797338) * 8318299307769190309L);
				}
				if (handshakeStage * -275818405 == 2) {
					if (Class582.aClass567_7700.bitsRemaining(1, -1483849144)) {
						byte[] is = new byte[1];
						int i_231_ = Class582.aClass567_7700.method6899(is, 0, 1, 1580523327);
						if (0 != is[0]) {
							method10373(i_231_, 1538512972);
							return;
						}
						handshakeStage += -1210181677;
					} else if ((Class249.method3450(1565861518) - -3305165298707384275L * Class95.aLong1163) > 30000L) {
						method10373(1001, 1538512972);
						return;
					}
				}
				if (-275818405 * handshakeStage == 3) {
					Class59[] class59s = Class59.method983(-2132919323);
					int i_232_ = class59s.length * 4;
					if (Class582.aClass567_7700.bitsRemaining(i_232_, -1160328489)) {
						RSByteBuffer class536_sub33 = new RSByteBuffer(i_232_);
						Class582.aClass567_7700.method6899(class536_sub33.buffer, 0, class536_sub33.buffer.length, 1774523566);
						for (int i_233_ = 0; i_233_ < class59s.length; i_233_++)
							class59s[i_233_].method977(class536_sub33.readInt(), 1854131966);
						boolean bool = (Class482.method5837(anInt11101 * -708374433, -486831229) || Class566.method6895(anInt11101 * -708374433, 702071024) || Class233.method3334(-708374433 * anInt11101, (byte) -20));
						Class176.aClass460_1936.method5529((Class582.aClass567_7700), !bool, (byte) 47);
						Class321.aSocket3543 = null;
						Class582.aClass567_7700 = null;
						handshakeStage = 0;
					}
				}
			} catch (IOException ioexception) {
				method10373(1002, 1538512972);
			}
		}
	}

	static final void method10434() {
		Class397.aClass251Array4115 = null;
		Class527.method6432(-1959825479 * anInt11187, 0, 0, -1804846931 * Class144.anInt1679, 589116499 * Class34_Sub6.anInt10965, 0, 0, -1, 265392979);
		if (null != Class397.aClass251Array4115) {
			Class620.method7404(Class397.aClass251Array4115, -1412584499, 0, 0, Class144.anInt1679 * -1804846931, Class34_Sub6.anInt10965 * 589116499, -800528797 * Class581.anInt7698, -1952223945 * Class512.anInt6936, (aClass251_11199 == Class107.aClass251_1323 ? -1 : 1139436581 * aClass251_11199.anInt2736), true, 109975642);
			Class397.aClass251Array4115 = null;
		}
	}

	public static final void method10435() {
		if (!aBool10999) {
			aFloat11107 += (24.0F - aFloat11107) / 2.0F;
			aBool11242 = true;
			aBool10999 = true;
		}
	}

	public static final void method10436() {
		if (!aBool11109) {
			aFloat11269 += (12.0F - aFloat11269) / 2.0F;
			aBool11242 = true;
			aBool11109 = true;
		}
	}

	public static final void method10437() {
		aBool11121 = true;
	}

	public static final void method10438() {
		aBool11121 = true;
	}

	public static boolean method10439(InterfaceDefinitions class251) {
		if (aBool11010) {
			if (method10389(class251).settings * -512963777 != 0)
				return false;
			if (0 == 1049444347 * class251.anInt2728)
				return false;
		}
		if (-1769600535 * class251.anInt2562 == -1560473329 * InterfaceDefinitions.anInt2685)
			return class251.aBool2578 || !aBool11314 && !aBool11018;
		return class251.aBool2578;
	}

	public static final void method10440() {
		aBool11121 = true;
	}

	public static final void method10441() {
		aBool11121 = true;
	}

	static final void method10442() {
		Class668.method8011(aClass251_10992, 263642117);
		Class360.anInt3827 += 822231753;
		if (!aBool11208 || !aBool11274) {
			if (Class360.anInt3827 * 2018211705 > 1) {
				aClass251_10992 = null;
				aClass251_11199 = null;
			}
		} else {
			int i = Class329.aClass550_3601.method6656(-1415357079);
			int i_234_ = Class329.aClass550_3601.method6657(-1529898161);
			i -= -1721422785 * anInt11281;
			i_234_ -= anInt11201 * 671669755;
			if (i < anInt11204 * 1828303855)
				i = anInt11204 * 1828303855;
			if (aClass251_10992.anInt2573 * -1606950689 + i > 171675909 * anInt11206 + 1828303855 * anInt11204)
				i = (anInt11204 * 1828303855 + anInt11206 * 171675909 - -1606950689 * aClass251_10992.anInt2573);
			if (i_234_ < anInt11205 * 1260646355)
				i_234_ = anInt11205 * 1260646355;
			if (aClass251_10992.anInt2574 * 223822141 + i_234_ > 1260646355 * anInt11205 + anInt11207 * 904217971)
				i_234_ = (904217971 * anInt11207 + anInt11205 * 1260646355 - aClass251_10992.anInt2574 * 223822141);
			int i_235_;
			int i_236_;
			if (Class107.aClass251_1323 == aClass251_11199) {
				i_235_ = i;
				i_236_ = i_234_;
			} else {
				i_235_ = (aClass251_11199.anInt2581 * 1428895931 + (i - 1828303855 * anInt11204));
				i_236_ = (aClass251_11199.anInt2584 * -2092413585 + (i_234_ - anInt11205 * 1260646355));
			}
			if (!Class329.aClass550_3601.method6655((short) 255)) {
				if (aBool11121) {
					Class270.method3717(603602216);
					if (null != aClass251_10992.anObjectArray2676) {
						Class536_Sub42 class536_sub42 = new Class536_Sub42();
						class536_sub42.aClass251_10804 = aClass251_10992;
						class536_sub42.anInt10803 = 1761425895 * i_235_;
						class536_sub42.anInt10800 = -1275012151 * i_236_;
						InterfaceDefinitions class251 = method10382(aClass251_10992);
						InterfaceDefinitions class251_237_ = aClass251_11202;
						boolean bool = false;
						for (/**/; (null != class251_237_ && -1 != class251_237_.anInt2577 * -1940204141 && null != class251); class251_237_ = (Class463.aClass234Array5227[(-1591767037 * class251_237_.anInt2559 >> 16)].aClass251Array2378[(-1940204141 * class251_237_.anInt2577 & 0xffff)])) {
							if (-1591767037 * class251.anInt2559 == -1591767037 * class251_237_.anInt2559) {
								bool = true;
								break;
							}
						}
						if (null != class251_237_ && null != class251 && class251 != Class107.aClass251_1323 && !bool)
							class536_sub42.aClass251_10806 = Class107.aClass251_1323;
						else
							class536_sub42.aClass251_10806 = aClass251_11202;
						class536_sub42.anObjectArray10802 = aClass251_10992.anObjectArray2676;
						Class618.method7388(class536_sub42, -1532558269);
					}
					if (aClass251_11202 != null && method10382(aClass251_10992) != null)
						Class578.method7008(aClass251_10992, aClass251_11202, -2145704482);
				} else if ((1 == 1862126853 * anInt11040 || Class622.method7417((byte) 42)) && 1780207751 * Class70.anInt760 > 2)
					Class670.method8014((anInt11209 * 1961670097 + anInt11281 * -1721422785), (anInt11210 * 411701121 + anInt11201 * 671669755), 10666290);
				else if (Class536_Sub15.method9518(419371655))
					Class670.method8014((1961670097 * anInt11209 + -1721422785 * anInt11281), (411701121 * anInt11210 + 671669755 * anInt11201), -1345228084);
				aClass251_10992 = null;
				aClass251_11199 = null;
			} else {
				if (Class360.anInt3827 * 2018211705 > aClass251_10992.anInt2663 * 1330942333) {
					int i_238_ = i - 1961670097 * anInt11209;
					int i_239_ = i_234_ - 411701121 * anInt11210;
					if (i_238_ > 632017109 * aClass251_10992.anInt2600 || i_238_ < -(632017109 * aClass251_10992.anInt2600) || i_239_ > 632017109 * aClass251_10992.anInt2600 || i_239_ < -(aClass251_10992.anInt2600 * 632017109))
						aBool11121 = true;
				}
				if (null != aClass251_10992.anObjectArray2675 && aBool11121) {
					Class536_Sub42 class536_sub42 = new Class536_Sub42();
					class536_sub42.aClass251_10804 = aClass251_10992;
					class536_sub42.anInt10803 = i_235_ * 1761425895;
					class536_sub42.anInt10800 = -1275012151 * i_236_;
					class536_sub42.anObjectArray10802 = aClass251_10992.anObjectArray2675;
					Class618.method7388(class536_sub42, 601033503);
				}
			}
		}
	}

	static final void method10443(int i) {
		int i_240_ = Class95.anInt1156 * -1482773169;
		int[] is = Class95.anIntArray1157;
		int[][] is_241_ = aClass515_11066.method6295(-1137308467);
		int[][] is_242_ = aClass515_11066.method6286((byte) -77);
		int i_243_;
		if (anInt11074 * 1542697723 == 4)
			i_243_ = Class193.aClass189Array2180.length;
		else
			i_243_ = aBool11023 ? i_240_ : i_240_ + -664631943 * anInt11053;
		for (int i_244_ = 0; i_244_ < i_243_; i_244_++) {
			Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1;
			if (4 == anInt11074 * 1542697723) {
				Class189 class189 = Class193.aClass189Array2180[i_244_];
				if (!class189.aBool2141)
					continue;
				class649_sub1_sub5_sub1 = class189.method2804(1086770833);
			} else {
				if (i_244_ < i_240_)
					class649_sub1_sub5_sub1 = aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i_244_]];
				else
					class649_sub1_sub5_sub1 = ((Class649_Sub1_Sub5_Sub1) (((Class536_Sub13) aClass4_11050.method556((long) anIntArray11211[i_244_ - i_240_])).anObject10468));
				if (i != class649_sub1_sub5_sub1.aByte10839)
					continue;
				if (class649_sub1_sub5_sub1.anInt11905 * 1272934333 < 0) {
					class649_sub1_sub5_sub1.aBool11894 = false;
					continue;
				}
			}
			class649_sub1_sub5_sub1.anInt11896 = 0;
			int i_245_ = class649_sub1_sub5_sub1.method10874();
			Class436 class436 = class649_sub1_sub5_sub1.method7837().aClass436_4823;
			if (0 == (i_245_ & 0x1)) {
				if (((int) class436.aFloat4850 & 0x1ff) != 0 || ((int) class436.aFloat4853 & 0x1ff) != 0) {
					class649_sub1_sub5_sub1.aBool11894 = false;
					continue;
				}
			} else if (((int) class436.aFloat4850 & 0x1ff) != 256 || 256 != ((int) class436.aFloat4853 & 0x1ff)) {
				class649_sub1_sub5_sub1.aBool11894 = false;
				continue;
			}
			if (4 != anInt11074 * 1542697723 && !class649_sub1_sub5_sub1.aBool11895) {
				if (1 == i_245_) {
					int i_246_ = (int) class436.aFloat4850 >> 9;
					int i_247_ = (int) class436.aFloat4853 >> 9;
					if (class649_sub1_sub5_sub1.anInt11905 * 1272934333 != is_241_[i_246_][i_247_]) {
						class649_sub1_sub5_sub1.aBool11894 = true;
						continue;
					}
					if (is_242_[i_246_][i_247_] > 1) {
						is_242_[i_246_][i_247_]--;
						class649_sub1_sub5_sub1.aBool11894 = true;
						continue;
					}
				} else {
					int i_248_ = 252 + 256 * (i_245_ - 1);
					int i_249_ = (int) class436.aFloat4850 - i_248_ >> 9;
					int i_250_ = (int) class436.aFloat4853 - i_248_ >> 9;
					int i_251_ = i_248_ + (int) class436.aFloat4850 >> 9;
					int i_252_ = i_248_ + (int) class436.aFloat4853 >> 9;
					if (!Class704.method8265(is_241_, is_242_, (class649_sub1_sub5_sub1.anInt11905) * 1272934333, i_249_, i_250_, i_251_, i_252_, -1912029384)) {
						for (int i_253_ = i_249_; i_253_ <= i_251_; i_253_++) {
							for (int i_254_ = i_250_; i_254_ <= i_252_; i_254_++) {
								if (is_241_[i_253_][i_254_] == (class649_sub1_sub5_sub1.anInt11905 * 1272934333))
									is_242_[i_253_][i_254_]--;
							}
						}
						class649_sub1_sub5_sub1.aBool11894 = true;
						continue;
					}
				}
			}
			class649_sub1_sub5_sub1.aBool11894 = false;
			if ((class649_sub1_sub5_sub1.anInt11923 * 1080012231 <= cycles && (class649_sub1_sub5_sub1.anInt11924 * -327061215 < cycles)) || (-22167277 * class649_sub1_sub5_sub1.anInt11922 == -1428852859 * class649_sub1_sub5_sub1.anInt11921))
				class649_sub1_sub5_sub1.method7842(class436.aFloat4850, (float) Class54.method944((int) class436.aFloat4850, (int) class436.aFloat4853, (class649_sub1_sub5_sub1.aByte10839), 2115484675), class436.aFloat4853);
			aClass515_11066.method6249(1631489647).method6711(class649_sub1_sub5_sub1, true, 750695155);
		}
	}

	static final void method10444(int i) {
		if (Class644.method7794(i, null, 345167250))
			Class549_Sub1.method9674((Class463.aClass234Array5227[i].aClass251Array2378), -1, 1983741393);
	}

	static final void method10445(int i) {
		if (Class644.method7794(i, null, 2124626593))
			Class549_Sub1.method9674((Class463.aClass234Array5227[i].aClass251Array2378), -1, 1983741393);
	}

	static final void method10446(int i) {
		if (Class644.method7794(i, null, 1676894385))
			Class549_Sub1.method9674((Class463.aClass234Array5227[i].aClass251Array2378), -1, 1983741393);
	}

	public static final void method10447() {
		for (int i = 0; i < 5; i++)
			aBoolArray11270[i] = false;
		anInt11192 = -1863105115;
		anInt11119 = -408425903;
		Class593.anInt7811 = 0;
		Class460_Sub1.anInt10291 = 0;
		Class246.anInt2474 = 68985507;
		if (Class65.method1062((short) -18024) == 2) {
			Class598 class598 = aClass515_11066.method6255(-1299084972);
			int i = 1858049507 * class598.anInt7839 << 9;
			int i_255_ = 1479112045 * class598.anInt7840 << 9;
			int i_256_ = 1000 / Class319_Sub1.method9134(787732727);
			Class683.aClass301_Sub1_8651.method4070((float) i_256_ / 1000.0F, (aClass515_11066.method6292(896690046).anIntArrayArrayArray5245), aClass515_11066.method6251(-155256352), i, i_255_, 246339788);
		}
		Class667.anInt8535 = 1594603721;
		Class658.anInt8498 = -662013517;
		anInt11267 = -460612177 * cycles;
		Class184_Sub6.anInt9933 = -371967667 * Class637.anInt8301;
		Class469.anInt5356 = Class205_Sub21.anInt9958 * 761726941;
		Class681.anInt8648 = Class685.anInt8665 * 76702477;
		Class392_Sub3.anInt10231 = 540543625 * Class141.anInt1658;
		Class23.anInt231 = -1308716707 * Class144.anInt1681;
		Class98_Sub1_Sub2.anInt11335 = -34019295 * anInt11287;
	}

	public static final void method10448() {
		if (!aBool11109) {
			aFloat11269 += (-12.0F - aFloat11269) / 2.0F;
			aBool11242 = true;
			aBool11109 = true;
		}
	}

	final void method6084(int i) {
		Frame frame = new Frame(" ");
		frame.pack();
		frame.dispose();
		Class107.aClass251_1323 = new InterfaceDefinitions();
		Class66.method1075(510226751);
		Class298.method4015(new int[] { 20, 260, 2048, 5120, 10240, 75000, 100000, 153600 }, new int[] { 1000, 100, 1000, 250, 500, 100, 100, 10 }, 2041451732);
		Class436.method5260(100);
		Class425.method5109(10);
		Class147.method1816(100, (byte) -46);
		Class392_Sub3.method9310(100, 1935208538);
		if (Class678.aClass678_8619 != Class47.aClass678_578)
			Class692.aByteArrayArray8722 = new byte[50][];
		Class710.aClass536_Sub40_8843 = Class82.method1170(1710451504);
		if (Class710.aClass536_Sub40_8843.aClass710_Sub41_10784.method10248(65533) == 1)
			Class553.aBool7469 = false;
		switch (Class710.aClass536_Sub40_8843.aClass710_Sub39_10783.method10236(-2002933056)) {
		case 3:
			Class111.aBool1389 = true;
			Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub39_10783), 0, (byte) 1);
			Class398.method4898(Class63.aClass63_703, (byte) 0);
			break;
		default:
			break;
		case 4:
			Class111.aBool1387 = true;
			Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub39_10783), 0, (byte) 1);
			Class398.method4898(Class63.aClass63_716, (byte) 0);
		}
		if (null == Class23.aClass5_222.aString112)
			Class23.aClass5_222.aString112 = Class622.anApplet8126.getCodeBase().getHost();
		Class23.aClass5_221 = Class23.aClass5_222;
		Class246.aClass466_2473 = new Class466();
		Class176.aClass460_1936 = new Class460_Sub1();
		Class183_Sub2.aClass449_9812 = new Class449(Class23.aClass5_220.aString112, Class23.aClass5_220.anInt110 * -843966029, 273023065 * aClass670_11043.anInt8567);
		if (aClass670_11043 == Class670.aClass670_8568)
			aBool11197 = false;
		Class612.aShortArray7932 = Class296.aShortArray3267 = ItemDefinitions.aShortArray14 = new short[256];
		try {
			Class400.aClipboard4137 = Class300.method4022((byte) 0).getToolkit().getSystemClipboard();
		} catch (Exception exception) {
			/* empty */
		}
		Class331_Sub2.aClass549_10049 = Class50.method928(Class399.aCanvas4127, -1819741330);
		Class329.aClass550_3601 = Class34_Sub22.method10370(Class399.aCanvas4127, true, 1012159798);
		if (null != aClass18_6879)
			Class653.aClass547_8490 = new Class547(255, aClass18_6879, aClass18_6880, 2000000);
		Class683.aClass301_Sub1_8651 = new Class301_Sub1(aClass24_11138);
		try {
			Class683.aClass301_Sub1_8651.method4033(Class293.aClass293_3246, -693000904);
			Class683.aClass301_Sub1_8651.method4031(Class290.aClass290_3222, false, 84478469);
			Class683.aClass301_Sub1_8651.method4082(Class300.aClass300_3355, false, (byte) 0);
			Class683.aClass301_Sub1_8651.method4031(Class290.aClass290_3222, false, -1383091161);
			Class683.aClass301_Sub1_8651.method4039(Class436.method5257(99999.0F, 99999.0F, 99999.0F), -478855682);
			Class683.aClass301_Sub1_8651.method4037(Class436.method5257(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), -713528324);
			Class683.aClass301_Sub1_8651.method4040(Class436.method5257(99999.0F, 99999.0F, 99999.0F), (byte) 125);
			Class683.aClass301_Sub1_8651.method4036(Class436.method5257(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), 263350573);
		} catch (Exception_Sub3 exception_sub3) {
			/* empty */
		}
		Class147.method1809(Class622.anApplet8126, Class241.aString2456, -2000080347);
		if (Class678.aClass678_8619 != Class47.aClass678_578 && Class678.aClass678_8618 != Class47.aClass678_578)
			aBool11314 = true;
		aString6881 = Class38.aClass38_402.method840(Class459.aClass664_5178, 1655060601);
		Class266.aClass503_2867 = new Class503();
		new Thread(Class266.aClass503_2867).start();
		Class208.aClass60_2245 = new Class60();
		Class613.aClass263_8014 = new Class263();
	}

	static final void method10449() {
		int[][] is = aClass515_11066.method6295(-260692879);
		int i = aClass515_11066.method6321((byte) 31);
		int i_257_ = aClass515_11066.method6243(177401017);
		for (int i_258_ = 0; i_258_ < i; i_258_++) {
			int[] is_259_ = is[i_258_];
			for (int i_260_ = 0; i_260_ < i_257_; i_260_++)
				is_259_[i_260_] = 0;
		}
	}

	public static final void method10450() {
		Class106 class106 = Class536_Sub41.method9871(2077853800);
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4494, class106.aClass15_1258, 2115671994);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(0);
		class106.method1409(class536_sub23, 890056318);
	}

	public static final void method10451() {
		Class106 class106 = Class536_Sub41.method9871(2077853800);
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4494, class106.aClass15_1258, 1090239143);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(0);
		class106.method1409(class536_sub23, -172482486);
	}

	public static final void method10452() {
		Class106 class106 = Class536_Sub41.method9871(2077853800);
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4494, class106.aClass15_1258, 701257458);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(0);
		class106.method1409(class536_sub23, 575123133);
	}

	public String method6092(int i) {
		String string = " ";
		try {
			Class598 class598 = aClass515_11066.method6255(-1276641382);
			string = new StringBuilder().append(string).append(1858049507 * class598.anInt7839).append(Class40.aString491).append(class598.anInt7840 * 1479112045).append(Class40.aString491).append(aClass515_11066.method6321((byte) -94)).append(Class40.aString491).append(aClass515_11066.method6243(177401017)).append(" ").toString();
			if (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 != null)
				string = new StringBuilder().append(string).append(-989431627 * Class320.anInt3539).append(Class40.aString491).append(class598.anInt7839 * 1858049507 + (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenX[0])).append(Class40.aString491).append(1479112045 * class598.anInt7840 + (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenY[0])).append(" ").toString();
			else
				string = new StringBuilder().append(string).append(Class320.anInt3539 * -989431627).append(Class40.aString491).append(-989431627 * Class320.anInt3539).append(Class40.aString491).append(Class320.anInt3539 * -989431627).append(Class40.aString491).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub15_10767.method10071(693632502)).append(" ").append(Class710.aClass536_Sub40_8843.aClass710_Sub27_10746.method10156(2114615123)).append(" ").append(Class315.method4212((byte) 119)).append(" ").append(Class144.anInt1679 * -1804846931).append(Class40.aString491).append(Class34_Sub6.anInt10965 * 589116499).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub14_10755.method10066((byte) 0)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub9_10756.method10004(119066304)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub3_10754.method9894(-1017210055)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub2_10765.method9885(-538319988)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class710.aClass536_Sub40_8843.aClass710_Sub34_10787.method10204(1867269829)).append(" ").toString();
			string = new StringBuilder().append(string).append("0 ").toString();
			string = new StringBuilder().append(string).append(anInt6857 * -839563813).append(" ").toString();
			string = new StringBuilder().append(string).append(anInt11101 * -708374433).append(" ").toString();
			if (Class458_Sub4.aClass536_Sub38_10336 != null)
				string = new StringBuilder().append(string).append(-853108975 * Class458_Sub4.aClass536_Sub38_10336.anInt10684).toString();
			else
				string = new StringBuilder().append(string).append(-1).toString();
			string = new StringBuilder().append(string).append(" ").toString();
			if (aString11004 != null)
				string = new StringBuilder().append(string).append(aString11004).toString();
			else
				string = new StringBuilder().append(string).append(Class40.aString491).toString();
		} catch (Throwable throwable) {
			/* empty */
		}
		return string;
	}

	static final void method10453() {
		Iterator iterator = aClass4_11175.iterator();
		while (iterator.hasNext()) {
			Class536_Sub18_Sub4 class536_sub18_sub4 = (Class536_Sub18_Sub4) iterator.next();
			Class649_Sub1_Sub5_Sub4 class649_sub1_sub5_sub4 = class536_sub18_sub4.aClass649_Sub1_Sub5_Sub4_11619;
			if (aClass515_11066.method6249(-148295428) != null && class649_sub1_sub5_sub4.method11039(-1703146327))
				aClass515_11066.method6249(75704356).method6711(class649_sub1_sub5_sub4, true, -834250234);
		}
	}

	void method10454(int i) {
		Class321.aSocket3543 = null;
		Class582.aClass567_7700 = null;
		handshakeStage = 0;
		Class176.aClass460_1936.anInt5195 += 971530315;
		Class176.aClass460_1936.anInt5196 = i * -938617607;
	}

	static final void method10455(int i) {
		if (Class644.method7794(i, null, 915976043))
			Class549_Sub1.method9674((Class463.aClass234Array5227[i].aClass251Array2378), -1, 1983741393);
	}

	void method10456() {
		if (-2073269917 * Class176.aClass460_1936.anInt5195 > 1500629495 * anInt11263) {
			Class23.aClass5_219.method574(1254037645);
			anInt11042 = 535840638 * Class176.aClass460_1936.anInt5195 - 1315189226;
			if (anInt11042 * -862309271 > 3000)
				anInt11042 = -1397598472;
			if (Class176.aClass460_1936.anInt5195 * -2073269917 >= 2 && 6 == Class176.aClass460_1936.anInt5196 * 917679433) {
				method6121("js5connect_outofdate", -849468335);
				anInt11101 = -1675716802;
				return;
			}
			if (-2073269917 * Class176.aClass460_1936.anInt5195 >= 1 && 48 == Class176.aClass460_1936.anInt5196 * 917679433) {
				method6121("sessionexpired", -395280143);
				anInt11101 = -1675716802;
				return;
			}
			if (Class176.aClass460_1936.anInt5195 * -2073269917 >= 4 && 917679433 * Class176.aClass460_1936.anInt5196 == -1) {
				method6098("js5crc", new StringBuilder().append("a=").append(38726355 * Class176.aClass460_1936.anInt5197).append("&g=").append(Class176.aClass460_1936.anInt5183 * -899459829).toString(), -1649496430);
				anInt11101 = -1675716802;
				return;
			}
			if (-2073269917 * Class176.aClass460_1936.anInt5195 >= 4 && Class482.method5837(-708374433 * anInt11101, 386802624)) {
				if (7 == 917679433 * Class176.aClass460_1936.anInt5196 || Class176.aClass460_1936.anInt5196 * 917679433 == 9)
					method6121("js5connect_full", 327412233);
				else if (917679433 * Class176.aClass460_1936.anInt5196 > 0) {
					if (aString11046 == null)
						method6121("js5connect", 1224880168);
					else
						method6121(new StringBuilder().append("js5proxy_").append(aString11046.trim()).toString(), -1253604159);
				} else
					method6121("js5io", -749788772);
				anInt11101 = -1675716802;
				return;
			}
		}
		anInt11263 = Class176.aClass460_1936.anInt5195 * -249372427;
		if (anInt11042 * -862309271 > 0)
			anInt11042 -= -1386308647;
		else {
			try {
				if (handshakeStage * -275818405 == 0) {
					Class321.aSocket3543 = Class23.aClass5_219.method575((byte) 79);
					handshakeStage += -1210181677;
				}
				if (handshakeStage * -275818405 == 1) {
					Class582.aClass567_7700 = Class506.method6146(Class321.aSocket3543, 131072, (byte) 125);
					int i = 10 + aString11004.length();
					RSByteBuffer class536_sub33 = new RSByteBuffer(2 + i);
					class536_sub33.writeByte(1258126983 * (Class420.aClass420_4572.anInt4571));
					class536_sub33.writeByte(i);
					class536_sub33.writeInt(876);
					class536_sub33.writeInt(1);
					class536_sub33.writeString(aString11004);
					class536_sub33.writeByte((Class459.aClass664_5178.anInt8526) * -1919173613);
					Class582.aClass567_7700.method6912((class536_sub33.buffer), 0, i + 2, (byte) 21);
					handshakeStage += -1210181677;
					Class95.aLong1163 = (Class249.method3450(1936562489) * 8318299307769190309L);
				}
				if (handshakeStage * -275818405 == 2) {
					if (Class582.aClass567_7700.bitsRemaining(1, -1362771204)) {
						byte[] is = new byte[1];
						int i = Class582.aClass567_7700.method6899(is, 0, 1, 1621321128);
						if (0 != is[0]) {
							method10373(i, 1538512972);
							return;
						}
						handshakeStage += -1210181677;
					} else if ((Class249.method3450(1644644491) - -3305165298707384275L * Class95.aLong1163) > 30000L) {
						method10373(1001, 1538512972);
						return;
					}
				}
				if (-275818405 * handshakeStage == 3) {
					Class59[] class59s = Class59.method983(-2128907348);
					int i = class59s.length * 4;
					if (Class582.aClass567_7700.bitsRemaining(i, -1660393165)) {
						RSByteBuffer class536_sub33 = new RSByteBuffer(i);
						Class582.aClass567_7700.method6899(class536_sub33.buffer, 0, class536_sub33.buffer.length, 1622897807);
						for (int i_261_ = 0; i_261_ < class59s.length; i_261_++)
							class59s[i_261_].method977(class536_sub33.readInt(), 1854131966);
						boolean bool = (Class482.method5837(anInt11101 * -708374433, 1122171088) || Class566.method6895(anInt11101 * -708374433, -91207182) || Class233.method3334(-708374433 * anInt11101, (byte) -80));
						Class176.aClass460_1936.method5529((Class582.aClass567_7700), !bool, (byte) 106);
						Class321.aSocket3543 = null;
						Class582.aClass567_7700 = null;
						handshakeStage = 0;
					}
				}
			} catch (IOException ioexception) {
				method10373(1002, 1538512972);
			}
		}
	}

	void method10457() {
		if (-2073269917 * Class176.aClass460_1936.anInt5195 > 1500629495 * anInt11263) {
			Class23.aClass5_219.method574(593804224);
			anInt11042 = 535840638 * Class176.aClass460_1936.anInt5195 - 1315189226;
			if (anInt11042 * -862309271 > 3000)
				anInt11042 = -1397598472;
			if (Class176.aClass460_1936.anInt5195 * -2073269917 >= 2 && 6 == Class176.aClass460_1936.anInt5196 * 917679433) {
				method6121("js5connect_outofdate", 1173047686);
				anInt11101 = -1675716802;
				return;
			}
			if (-2073269917 * Class176.aClass460_1936.anInt5195 >= 1 && 48 == Class176.aClass460_1936.anInt5196 * 917679433) {
				method6121("sessionexpired", 1083008140);
				anInt11101 = -1675716802;
				return;
			}
			if (Class176.aClass460_1936.anInt5195 * -2073269917 >= 4 && 917679433 * Class176.aClass460_1936.anInt5196 == -1) {
				method6098("js5crc", new StringBuilder().append("a=").append(38726355 * Class176.aClass460_1936.anInt5197).append("&g=").append(Class176.aClass460_1936.anInt5183 * -899459829).toString(), -1649496430);
				anInt11101 = -1675716802;
				return;
			}
			if (-2073269917 * Class176.aClass460_1936.anInt5195 >= 4 && Class482.method5837(-708374433 * anInt11101, 105599952)) {
				if (7 == 917679433 * Class176.aClass460_1936.anInt5196 || Class176.aClass460_1936.anInt5196 * 917679433 == 9)
					method6121("js5connect_full", -641729743);
				else if (917679433 * Class176.aClass460_1936.anInt5196 > 0) {
					if (aString11046 == null)
						method6121("js5connect", -1005088813);
					else
						method6121(new StringBuilder().append("js5proxy_").append(aString11046.trim()).toString(), -2008385190);
				} else
					method6121("js5io", 163180114);
				anInt11101 = -1675716802;
				return;
			}
		}
		anInt11263 = Class176.aClass460_1936.anInt5195 * -249372427;
		if (anInt11042 * -862309271 > 0)
			anInt11042 -= -1386308647;
		else {
			try {
				if (handshakeStage * -275818405 == 0) {
					Class321.aSocket3543 = Class23.aClass5_219.method575((byte) 26);
					handshakeStage += -1210181677;
				}
				if (handshakeStage * -275818405 == 1) {
					Class582.aClass567_7700 = Class506.method6146(Class321.aSocket3543, 131072, (byte) 61);
					int i = 10 + aString11004.length();
					RSByteBuffer class536_sub33 = new RSByteBuffer(2 + i);
					class536_sub33.writeByte(1258126983 * (Class420.aClass420_4572.anInt4571));
					class536_sub33.writeByte(i);
					class536_sub33.writeInt(876);
					class536_sub33.writeInt(1);
					class536_sub33.writeString(aString11004);
					class536_sub33.writeByte((Class459.aClass664_5178.anInt8526) * -1919173613);
					Class582.aClass567_7700.method6912((class536_sub33.buffer), 0, i + 2, (byte) -17);
					handshakeStage += -1210181677;
					Class95.aLong1163 = (Class249.method3450(2084433943) * 8318299307769190309L);
				}
				if (handshakeStage * -275818405 == 2) {
					if (Class582.aClass567_7700.bitsRemaining(1, -2121696846)) {
						byte[] is = new byte[1];
						int i = Class582.aClass567_7700.method6899(is, 0, 1, 956205467);
						if (0 != is[0]) {
							method10373(i, 1538512972);
							return;
						}
						handshakeStage += -1210181677;
					} else if ((Class249.method3450(1524796588) - -3305165298707384275L * Class95.aLong1163) > 30000L) {
						method10373(1001, 1538512972);
						return;
					}
				}
				if (-275818405 * handshakeStage == 3) {
					Class59[] class59s = Class59.method983(-2123212533);
					int i = class59s.length * 4;
					if (Class582.aClass567_7700.bitsRemaining(i, -1560624441)) {
						RSByteBuffer class536_sub33 = new RSByteBuffer(i);
						Class582.aClass567_7700.method6899(class536_sub33.buffer, 0, class536_sub33.buffer.length, 471066595);
						for (int i_262_ = 0; i_262_ < class59s.length; i_262_++)
							class59s[i_262_].method977(class536_sub33.readInt(), 1854131966);
						boolean bool = (Class482.method5837(anInt11101 * -708374433, -1586324867) || Class566.method6895(anInt11101 * -708374433, 1794890183) || Class233.method3334(-708374433 * anInt11101, (byte) -26));
						Class176.aClass460_1936.method5529((Class582.aClass567_7700), !bool, (byte) 14);
						Class321.aSocket3543 = null;
						Class582.aClass567_7700 = null;
						handshakeStage = 0;
					}
				}
			} catch (IOException ioexception) {
				method10373(1002, 1538512972);
			}
		}
	}

	public static final void method10458() {
		int i = Class710.aClass536_Sub40_8843.aClass710_Sub5_10761.method9916(-322869721);
		if (i == 0) {
			aClass515_11066.method6246(null, -58282889);
			Class689.method8183(0, (byte) -96);
		} else if (1 == i || 3 == i) {
			Class184_Sub3.method8990((byte) 0, -705290102);
			Class689.method8183(512, (byte) -40);
			if (aClass515_11066.method6249(1390864092) != null)
				Class158.method1890((byte) 18);
		} else {
			Class184_Sub3.method8990((byte) (648319383 * anInt11127 - 4 & 0xff), 1524077029);
			Class689.method8183(2, (byte) 72);
		}
		anInt11264 = Class320.anInt3539 * -1505723837;
	}

	static final void method10459() {
		for (Class536_Sub18_Sub8 class536_sub18_sub8 = ((Class536_Sub18_Sub8) aClass708_11174.method8308(1867269829)); class536_sub18_sub8 != null; class536_sub18_sub8 = ((Class536_Sub18_Sub8) aClass708_11174.method8311(910899639))) {
			Class649_Sub1_Sub5_Sub6 class649_sub1_sub5_sub6 = class536_sub18_sub8.aClass649_Sub1_Sub5_Sub6_11696;
			if (cycles > 668402135 * class649_sub1_sub5_sub6.anInt12140) {
				class536_sub18_sub8.method6484(2058587599);
				class649_sub1_sub5_sub6.method11048(2089418955);
			} else if (cycles >= class649_sub1_sub5_sub6.anInt12139 * -861810539) {
				class649_sub1_sub5_sub6.method11054(219909430);
				if (class649_sub1_sub5_sub6.anInt12144 * -2056997773 > 0) {
					if (anInt11074 * 1542697723 == 4) {
						Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1 = Class193.aClass189Array2180[(class649_sub1_sub5_sub6.anInt12144 * -2056997773) - 1].method2804(-691931655);
						if (null != class649_sub1_sub5_sub1) {
							Class436 class436 = (class649_sub1_sub5_sub1.method7837().aClass436_4823);
							if ((int) class436.aFloat4850 >= 0 && ((int) class436.aFloat4850 < (aClass515_11066.method6321((byte) -49) * 512)) && (int) class436.aFloat4853 >= 0 && ((int) class436.aFloat4853 < (aClass515_11066.method6243(177401017) * 512)))
								class649_sub1_sub5_sub6.method11046((int) class436.aFloat4850, (int) class436.aFloat4853, ((Class54.method944((int) class436.aFloat4850, (int) class436.aFloat4853, class649_sub1_sub5_sub1.aByte10839, 1885349993)) - -856318621 * (class649_sub1_sub5_sub6.anInt12155)), cycles, -2112138342);
						}
					} else {
						Class536_Sub13 class536_sub13 = ((Class536_Sub13) (aClass4_11050.method556((long) ((-2056997773 * class649_sub1_sub5_sub6.anInt12144) - 1))));
						if (null != class536_sub13) {
							NPC class649_sub1_sub5_sub1_sub1 = ((NPC) class536_sub13.anObject10468);
							Class436 class436 = (class649_sub1_sub5_sub1_sub1.method7837().aClass436_4823);
							if ((int) class436.aFloat4850 >= 0 && ((int) class436.aFloat4850 < (aClass515_11066.method6321((byte) -23) * 512)) && (int) class436.aFloat4853 >= 0 && ((int) class436.aFloat4853 < (aClass515_11066.method6243(177401017) * 512)))
								class649_sub1_sub5_sub6.method11046((int) class436.aFloat4850, (int) class436.aFloat4853, ((Class54.method944((int) class436.aFloat4850, (int) class436.aFloat4853, class649_sub1_sub5_sub6.aByte10839, 1814836749)) - (class649_sub1_sub5_sub6.anInt12155 * -856318621)), cycles, -14214020);
						}
					}
				}
				if (-2056997773 * class649_sub1_sub5_sub6.anInt12144 < 0) {
					int i = (-(class649_sub1_sub5_sub6.anInt12144 * -2056997773) - 1);
					Player class649_sub1_sub5_sub1_sub2;
					if (-1791435655 * anInt11156 == i)
						class649_sub1_sub5_sub1_sub2 = Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591;
					else
						class649_sub1_sub5_sub1_sub2 = aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i];
					if (class649_sub1_sub5_sub1_sub2 != null) {
						Class436 class436 = (class649_sub1_sub5_sub1_sub2.method7837().aClass436_4823);
						if ((int) class436.aFloat4850 >= 0 && ((int) class436.aFloat4850 < aClass515_11066.method6321((byte) -19) * 512) && (int) class436.aFloat4853 >= 0 && ((int) class436.aFloat4853 < aClass515_11066.method6243(177401017) * 512))
							class649_sub1_sub5_sub6.method11046((int) class436.aFloat4850, (int) class436.aFloat4853, (Class54.method944((int) class436.aFloat4850, (int) class436.aFloat4853, (class649_sub1_sub5_sub6.aByte10839), 1480539543) - (class649_sub1_sub5_sub6.anInt12155 * -856318621)), cycles, -751615620);
					}
				}
				class649_sub1_sub5_sub6.method11047(anInt11180 * -1483561311, (byte) -99);
				aClass515_11066.method6249(1288204751).method6711(class649_sub1_sub5_sub6, true, 469977830);
			}
		}
	}

	public final void method408() {
		if (method6089(-1411037171)) {
			String string = "";
			Class401[] class401s = Class57.method969(369012001);
			for (int i = 0; i < class401s.length; i++) {
				Class401 class401 = class401s[i];
				String string_263_ = Class622.anApplet8126.getParameter(class401.aString4190);
				if (null != string_263_) {
					switch (Integer.parseInt(class401.aString4190)) {
					case 39:
						Class353.anInt3740 = Integer.parseInt(string_263_) * -1387464143;
						break;
					case 49:
						Class459.aClass664_5178 = Class664.method7989(Integer.parseInt(string_263_), -1722953524);
						break;
					case 8:
						if (string_263_.equalsIgnoreCase(Class40.aString492))
							aBool10984 = true;
						else
							aBool10984 = false;
						break;
					case 34:
						Class522.aString7077 = string_263_;
						break;
					default:
						Class81.method1165("", new RuntimeException(), (byte) -3);
						break;
					case 14:
						break;
					case 46:
						anInt11017 = Integer.parseInt(string_263_) * -437437047;
						break;
					case 21:
						if (string_263_.equalsIgnoreCase(Class40.aString492))
							aBool11228 = true;
						else
							aBool11228 = false;
						break;
					case 9:
						if (Class23.aClass5_219 == null)
							Class23.aClass5_219 = new Class5();
						Class23.aClass5_219.anInt110 = Integer.parseInt(string_263_) * -1803928197;
						break;
					case 30:
						Class210.aString2260 = string_263_;
						break;
					case 25:
						if (string_263_.equalsIgnoreCase(Class40.aString492))
							aBool11001 = true;
						else
							aBool11001 = false;
						break;
					case 12:
						aString11108 = string_263_;
						break;
					case 40:
						if (string_263_.equalsIgnoreCase(Class40.aString492))
							aBool10985 = true;
						else
							aBool10985 = false;
						break;
					case 51:
						if (Class23.aClass5_220 == null)
							Class23.aClass5_220 = new Class5();
						Class23.aClass5_220.anInt108 = Integer.parseInt(string_263_) * -1753280203;
						break;
					case 43:
						if (string_263_.equals(Class40.aString492))
							aBool11200 = true;
						else
							aBool11200 = false;
						break;
					case 44:
						if (null == Class23.aClass5_220)
							Class23.aClass5_220 = new Class5();
						Class23.aClass5_220.anInt110 = Integer.parseInt(string_263_) * -1803928197;
						break;
					case 17:
						anInt10993 = Integer.parseInt(string_263_) * -374893847;
						break;
					case 16:
						aString11005 = string_263_;
						break;
					case 42:
						break;
					case 31:
						anInt10991 = Integer.parseInt(string_263_) * -697170731;
						break;
					case 45:
						break;
					case 36:
						if (Class23.aClass5_230 == null)
							Class23.aClass5_230 = new Class5();
						Class23.aClass5_230.anInt111 = Integer.parseInt(string_263_) * 1232605419;
						break;
					case 13:
						anInt10987 = Integer.parseInt(string_263_) * -1298837637;
						break;
					case 38:
						if (null == Class23.aClass5_222)
							Class23.aClass5_222 = new Class5();
						Class23.aClass5_222.anInt108 = Integer.parseInt(string_263_) * -1753280203;
						break;
					case 18:
						if (Class23.aClass5_222 == null)
							Class23.aClass5_222 = new Class5();
						Class23.aClass5_222.anInt111 = Integer.parseInt(string_263_) * 1232605419;
						break;
					case 32:
						break;
					case 15:
						aString10996 = string_263_;
						if (aString10996.length() > 100)
							aString10996 = null;
						break;
					case 50:
						if (Class23.aClass5_222 == null)
							Class23.aClass5_222 = new Class5();
						Class23.aClass5_222.anInt110 = Integer.parseInt(string_263_) * -1803928197;
						break;
					case 35:
						anInt10990 = Integer.parseInt(string_263_) * 97502975;
						break;
					case 23:
						anInt11003 = Integer.parseInt(string_263_) * -2088371061;
						break;
					case 47:
						if (string_263_.equalsIgnoreCase(Class40.aString492))
							aBool11000 = true;
						else
							aBool11000 = false;
						break;
					case 27:
						aClass670_11043 = Class72.method1126(Integer.parseInt(string_263_), (byte) 15);
						if (Class670.aClass670_8568 == aClass670_11043)
							Class302.aClass74_3406 = Class74.aClass74_808;
						else
							Class302.aClass74_3406 = Class74.aClass74_814;
						break;
					case 3:
						aString10986 = string_263_;
						break;
					case 28:
						anInt10988 = Integer.parseInt(string_263_) * 1765963605;
						if (247320061 * anInt10988 < 0 || (anInt10988 * 247320061 >= aColorArray11038.length))
							anInt10988 = 0;
						break;
					case 33:
						if (Class23.aClass5_230 == null)
							Class23.aClass5_230 = new Class5();
						Class23.aClass5_230.anInt108 = Integer.parseInt(string_263_) * -1753280203;
						break;
					case 48:
						if (Class23.aClass5_220 == null)
							Class23.aClass5_220 = new Class5();
						Class23.aClass5_220.aString112 = string_263_;
						break;
					case 29:
						if (string_263_.equalsIgnoreCase(Class40.aString492)) {
							/* empty */
						}
						break;
					case 24:
						Class462.aString5220 = string_263_;
						break;
					case 6:
						if (Class23.aClass5_230 == null)
							Class23.aClass5_230 = new Class5();
						Class23.aClass5_230.aString112 = string_263_;
						break;
					case 52:
						if (Class23.aClass5_230 == null)
							Class23.aClass5_230 = new Class5();
						Class23.aClass5_230.anInt110 = Integer.parseInt(string_263_) * -1803928197;
						break;
					case 11:
						string = string_263_;
						break;
					case 1:
						if (string_263_.equalsIgnoreCase(Class40.aString492))
							aBool11290 = true;
						break;
					case 26:
						if (Class23.aClass5_219 == null)
							Class23.aClass5_219 = new Class5();
						Class23.aClass5_219.aString112 = string_263_;
						break;
					case 5:
						if (string_263_.equals(Class40.aString492))
							aBool10989 = true;
						else
							aBool10989 = false;
						break;
					case 10:
						aString10998 = string_263_;
						break;
					case 2:
						if (null == Class23.aClass5_219)
							Class23.aClass5_219 = new Class5();
						Class23.aClass5_219.anInt111 = Integer.parseInt(string_263_) * 1232605419;
						break;
					case 20:
						Class47.aClass678_578 = ((Class678) Class682.method8091(Class678.method8057(392150635), Integer.parseInt(string_263_), 1858049507));
						if (Class47.aClass678_578 == Class678.aClass678_8616)
							Class47.aClass678_578 = Class678.aClass678_8613;
						else if (!(Class47.aClass678_578.method8055(Class672.aClass672_8576, (byte) 1)) && (Class678.aClass678_8619 != Class47.aClass678_578))
							Class47.aClass678_578 = Class678.aClass678_8619;
						break;
					case 4:
						if (null == Class23.aClass5_219)
							Class23.aClass5_219 = new Class5();
						Class23.aClass5_219.anInt108 = Integer.parseInt(string_263_) * -1753280203;
						break;
					case 7:
						Class314.anInt3504 = Integer.parseInt(string_263_) * 935130637;
						break;
					case 37:
						if (Class23.aClass5_220 == null)
							Class23.aClass5_220 = new Class5();
						Class23.aClass5_220.anInt111 = Integer.parseInt(string_263_) * 1232605419;
						break;
					case 22:
						aString11004 = string_263_;
						break;
					case 41:
						Class254.aClass702_2755 = Class219.method3102(Integer.parseInt(string_263_), 1170099673);
						if (Class702.aClass702_8796 != Class254.aClass702_2755 && (Class702.aClass702_8798 != Class254.aClass702_2755) && (Class702.aClass702_8797 != Class254.aClass702_2755) && (Class702.aClass702_8799 != Class254.aClass702_2755))
							Class254.aClass702_2755 = Class702.aClass702_8799;
					}
				}
			}
			if (aString10986 == null)
				aString10986 = "";
			Class496 class496 = new Class496(-125739413 * anInt11152, -358673315 * anInt11153, -1899946153 * anInt11150, 1408494455 * anInt11298, aClass670_11043.aString8574);
			Class313.aclient3500 = this;
			String string_264_ = Class254.aClass702_2755.aString8801;
			int i = 32 + -1165196251 * Class254.aClass702_2755.anInt8800;
			if (!string.equals("")) {
				string_264_ = new StringBuilder().append(string_264_).append("_").append(string).toString();
				i = 0;
			}
			method6081(class496, aClass670_11043.aString8573, string_264_, i, Class319.method4240(1233932879), 876, 1, aBool11001, 235175950);
		}
	}

	public final void method397() {
		if (method6089(-1411037171)) {
			String string = "";
			Class401[] class401s = Class57.method969(-404647581);
			for (int i = 0; i < class401s.length; i++) {
				Class401 class401 = class401s[i];
				String string_265_ = Class622.anApplet8126.getParameter(class401.aString4190);
				if (null != string_265_) {
					switch (Integer.parseInt(class401.aString4190)) {
					case 39:
						Class353.anInt3740 = Integer.parseInt(string_265_) * -1387464143;
						break;
					case 49:
						Class459.aClass664_5178 = Class664.method7989(Integer.parseInt(string_265_), -1563052214);
						break;
					case 8:
						if (string_265_.equalsIgnoreCase(Class40.aString492))
							aBool10984 = true;
						else
							aBool10984 = false;
						break;
					case 34:
						Class522.aString7077 = string_265_;
						break;
					default:
						Class81.method1165("", new RuntimeException(), (byte) 7);
						break;
					case 14:
						break;
					case 46:
						anInt11017 = Integer.parseInt(string_265_) * -437437047;
						break;
					case 21:
						if (string_265_.equalsIgnoreCase(Class40.aString492))
							aBool11228 = true;
						else
							aBool11228 = false;
						break;
					case 9:
						if (Class23.aClass5_219 == null)
							Class23.aClass5_219 = new Class5();
						Class23.aClass5_219.anInt110 = Integer.parseInt(string_265_) * -1803928197;
						break;
					case 30:
						Class210.aString2260 = string_265_;
						break;
					case 25:
						if (string_265_.equalsIgnoreCase(Class40.aString492))
							aBool11001 = true;
						else
							aBool11001 = false;
						break;
					case 12:
						aString11108 = string_265_;
						break;
					case 40:
						if (string_265_.equalsIgnoreCase(Class40.aString492))
							aBool10985 = true;
						else
							aBool10985 = false;
						break;
					case 51:
						if (Class23.aClass5_220 == null)
							Class23.aClass5_220 = new Class5();
						Class23.aClass5_220.anInt108 = Integer.parseInt(string_265_) * -1753280203;
						break;
					case 43:
						if (string_265_.equals(Class40.aString492))
							aBool11200 = true;
						else
							aBool11200 = false;
						break;
					case 44:
						if (null == Class23.aClass5_220)
							Class23.aClass5_220 = new Class5();
						Class23.aClass5_220.anInt110 = Integer.parseInt(string_265_) * -1803928197;
						break;
					case 17:
						anInt10993 = Integer.parseInt(string_265_) * -374893847;
						break;
					case 16:
						aString11005 = string_265_;
						break;
					case 42:
						break;
					case 31:
						anInt10991 = Integer.parseInt(string_265_) * -697170731;
						break;
					case 45:
						break;
					case 36:
						if (Class23.aClass5_230 == null)
							Class23.aClass5_230 = new Class5();
						Class23.aClass5_230.anInt111 = Integer.parseInt(string_265_) * 1232605419;
						break;
					case 13:
						anInt10987 = Integer.parseInt(string_265_) * -1298837637;
						break;
					case 38:
						if (null == Class23.aClass5_222)
							Class23.aClass5_222 = new Class5();
						Class23.aClass5_222.anInt108 = Integer.parseInt(string_265_) * -1753280203;
						break;
					case 18:
						if (Class23.aClass5_222 == null)
							Class23.aClass5_222 = new Class5();
						Class23.aClass5_222.anInt111 = Integer.parseInt(string_265_) * 1232605419;
						break;
					case 32:
						break;
					case 15:
						aString10996 = string_265_;
						if (aString10996.length() > 100)
							aString10996 = null;
						break;
					case 50:
						if (Class23.aClass5_222 == null)
							Class23.aClass5_222 = new Class5();
						Class23.aClass5_222.anInt110 = Integer.parseInt(string_265_) * -1803928197;
						break;
					case 35:
						anInt10990 = Integer.parseInt(string_265_) * 97502975;
						break;
					case 23:
						anInt11003 = Integer.parseInt(string_265_) * -2088371061;
						break;
					case 47:
						if (string_265_.equalsIgnoreCase(Class40.aString492))
							aBool11000 = true;
						else
							aBool11000 = false;
						break;
					case 27:
						aClass670_11043 = Class72.method1126(Integer.parseInt(string_265_), (byte) -25);
						if (Class670.aClass670_8568 == aClass670_11043)
							Class302.aClass74_3406 = Class74.aClass74_808;
						else
							Class302.aClass74_3406 = Class74.aClass74_814;
						break;
					case 3:
						aString10986 = string_265_;
						break;
					case 28:
						anInt10988 = Integer.parseInt(string_265_) * 1765963605;
						if (247320061 * anInt10988 < 0 || (anInt10988 * 247320061 >= aColorArray11038.length))
							anInt10988 = 0;
						break;
					case 33:
						if (Class23.aClass5_230 == null)
							Class23.aClass5_230 = new Class5();
						Class23.aClass5_230.anInt108 = Integer.parseInt(string_265_) * -1753280203;
						break;
					case 48:
						if (Class23.aClass5_220 == null)
							Class23.aClass5_220 = new Class5();
						Class23.aClass5_220.aString112 = string_265_;
						break;
					case 29:
						if (string_265_.equalsIgnoreCase(Class40.aString492)) {
							/* empty */
						}
						break;
					case 24:
						Class462.aString5220 = string_265_;
						break;
					case 6:
						if (Class23.aClass5_230 == null)
							Class23.aClass5_230 = new Class5();
						Class23.aClass5_230.aString112 = string_265_;
						break;
					case 52:
						if (Class23.aClass5_230 == null)
							Class23.aClass5_230 = new Class5();
						Class23.aClass5_230.anInt110 = Integer.parseInt(string_265_) * -1803928197;
						break;
					case 11:
						string = string_265_;
						break;
					case 1:
						if (string_265_.equalsIgnoreCase(Class40.aString492))
							aBool11290 = true;
						break;
					case 26:
						if (Class23.aClass5_219 == null)
							Class23.aClass5_219 = new Class5();
						Class23.aClass5_219.aString112 = string_265_;
						break;
					case 5:
						if (string_265_.equals(Class40.aString492))
							aBool10989 = true;
						else
							aBool10989 = false;
						break;
					case 10:
						aString10998 = string_265_;
						break;
					case 2:
						if (null == Class23.aClass5_219)
							Class23.aClass5_219 = new Class5();
						Class23.aClass5_219.anInt111 = Integer.parseInt(string_265_) * 1232605419;
						break;
					case 20:
						Class47.aClass678_578 = ((Class678) Class682.method8091(Class678.method8057(1280160142), Integer.parseInt(string_265_), 1858049507));
						if (Class47.aClass678_578 == Class678.aClass678_8616)
							Class47.aClass678_578 = Class678.aClass678_8613;
						else if (!(Class47.aClass678_578.method8055(Class672.aClass672_8576, (byte) 1)) && (Class678.aClass678_8619 != Class47.aClass678_578))
							Class47.aClass678_578 = Class678.aClass678_8619;
						break;
					case 4:
						if (null == Class23.aClass5_219)
							Class23.aClass5_219 = new Class5();
						Class23.aClass5_219.anInt108 = Integer.parseInt(string_265_) * -1753280203;
						break;
					case 7:
						Class314.anInt3504 = Integer.parseInt(string_265_) * 935130637;
						break;
					case 37:
						if (Class23.aClass5_220 == null)
							Class23.aClass5_220 = new Class5();
						Class23.aClass5_220.anInt111 = Integer.parseInt(string_265_) * 1232605419;
						break;
					case 22:
						aString11004 = string_265_;
						break;
					case 41:
						Class254.aClass702_2755 = Class219.method3102(Integer.parseInt(string_265_), 871640695);
						if (Class702.aClass702_8796 != Class254.aClass702_2755 && (Class702.aClass702_8798 != Class254.aClass702_2755) && (Class702.aClass702_8797 != Class254.aClass702_2755) && (Class702.aClass702_8799 != Class254.aClass702_2755))
							Class254.aClass702_2755 = Class702.aClass702_8799;
					}
				}
			}
			if (aString10986 == null)
				aString10986 = "";
			Class496 class496 = new Class496(-125739413 * anInt11152, -358673315 * anInt11153, -1899946153 * anInt11150, 1408494455 * anInt11298, aClass670_11043.aString8574);
			Class313.aclient3500 = this;
			String string_266_ = Class254.aClass702_2755.aString8801;
			int i = 32 + -1165196251 * Class254.aClass702_2755.anInt8800;
			if (!string.equals("")) {
				string_266_ = new StringBuilder().append(string_266_).append("_").append(string).toString();
				i = 0;
			}
			method6081(class496, aClass670_11043.aString8573, string_266_, i, Class319.method4240(-353220427), 876, 1, aBool11001, 235175950);
		}
	}

	public final void method410() {
		if (method6089(-1411037171)) {
			String string = "";
			Class401[] class401s = Class57.method969(-2087621675);
			for (int i = 0; i < class401s.length; i++) {
				Class401 class401 = class401s[i];
				String string_267_ = Class622.anApplet8126.getParameter(class401.aString4190);
				if (null != string_267_) {
					switch (Integer.parseInt(class401.aString4190)) {
					case 39:
						Class353.anInt3740 = Integer.parseInt(string_267_) * -1387464143;
						break;
					case 49:
						Class459.aClass664_5178 = Class664.method7989(Integer.parseInt(string_267_), -1119507194);
						break;
					case 8:
						if (string_267_.equalsIgnoreCase(Class40.aString492))
							aBool10984 = true;
						else
							aBool10984 = false;
						break;
					case 34:
						Class522.aString7077 = string_267_;
						break;
					default:
						Class81.method1165("", new RuntimeException(), (byte) -5);
						break;
					case 14:
						break;
					case 46:
						anInt11017 = Integer.parseInt(string_267_) * -437437047;
						break;
					case 21:
						if (string_267_.equalsIgnoreCase(Class40.aString492))
							aBool11228 = true;
						else
							aBool11228 = false;
						break;
					case 9:
						if (Class23.aClass5_219 == null)
							Class23.aClass5_219 = new Class5();
						Class23.aClass5_219.anInt110 = Integer.parseInt(string_267_) * -1803928197;
						break;
					case 30:
						Class210.aString2260 = string_267_;
						break;
					case 25:
						if (string_267_.equalsIgnoreCase(Class40.aString492))
							aBool11001 = true;
						else
							aBool11001 = false;
						break;
					case 12:
						aString11108 = string_267_;
						break;
					case 40:
						if (string_267_.equalsIgnoreCase(Class40.aString492))
							aBool10985 = true;
						else
							aBool10985 = false;
						break;
					case 51:
						if (Class23.aClass5_220 == null)
							Class23.aClass5_220 = new Class5();
						Class23.aClass5_220.anInt108 = Integer.parseInt(string_267_) * -1753280203;
						break;
					case 43:
						if (string_267_.equals(Class40.aString492))
							aBool11200 = true;
						else
							aBool11200 = false;
						break;
					case 44:
						if (null == Class23.aClass5_220)
							Class23.aClass5_220 = new Class5();
						Class23.aClass5_220.anInt110 = Integer.parseInt(string_267_) * -1803928197;
						break;
					case 17:
						anInt10993 = Integer.parseInt(string_267_) * -374893847;
						break;
					case 16:
						aString11005 = string_267_;
						break;
					case 42:
						break;
					case 31:
						anInt10991 = Integer.parseInt(string_267_) * -697170731;
						break;
					case 45:
						break;
					case 36:
						if (Class23.aClass5_230 == null)
							Class23.aClass5_230 = new Class5();
						Class23.aClass5_230.anInt111 = Integer.parseInt(string_267_) * 1232605419;
						break;
					case 13:
						anInt10987 = Integer.parseInt(string_267_) * -1298837637;
						break;
					case 38:
						if (null == Class23.aClass5_222)
							Class23.aClass5_222 = new Class5();
						Class23.aClass5_222.anInt108 = Integer.parseInt(string_267_) * -1753280203;
						break;
					case 18:
						if (Class23.aClass5_222 == null)
							Class23.aClass5_222 = new Class5();
						Class23.aClass5_222.anInt111 = Integer.parseInt(string_267_) * 1232605419;
						break;
					case 32:
						break;
					case 15:
						aString10996 = string_267_;
						if (aString10996.length() > 100)
							aString10996 = null;
						break;
					case 50:
						if (Class23.aClass5_222 == null)
							Class23.aClass5_222 = new Class5();
						Class23.aClass5_222.anInt110 = Integer.parseInt(string_267_) * -1803928197;
						break;
					case 35:
						anInt10990 = Integer.parseInt(string_267_) * 97502975;
						break;
					case 23:
						anInt11003 = Integer.parseInt(string_267_) * -2088371061;
						break;
					case 47:
						if (string_267_.equalsIgnoreCase(Class40.aString492))
							aBool11000 = true;
						else
							aBool11000 = false;
						break;
					case 27:
						aClass670_11043 = Class72.method1126(Integer.parseInt(string_267_), (byte) 2);
						if (Class670.aClass670_8568 == aClass670_11043)
							Class302.aClass74_3406 = Class74.aClass74_808;
						else
							Class302.aClass74_3406 = Class74.aClass74_814;
						break;
					case 3:
						aString10986 = string_267_;
						break;
					case 28:
						anInt10988 = Integer.parseInt(string_267_) * 1765963605;
						if (247320061 * anInt10988 < 0 || (anInt10988 * 247320061 >= aColorArray11038.length))
							anInt10988 = 0;
						break;
					case 33:
						if (Class23.aClass5_230 == null)
							Class23.aClass5_230 = new Class5();
						Class23.aClass5_230.anInt108 = Integer.parseInt(string_267_) * -1753280203;
						break;
					case 48:
						if (Class23.aClass5_220 == null)
							Class23.aClass5_220 = new Class5();
						Class23.aClass5_220.aString112 = string_267_;
						break;
					case 29:
						if (string_267_.equalsIgnoreCase(Class40.aString492)) {
							/* empty */
						}
						break;
					case 24:
						Class462.aString5220 = string_267_;
						break;
					case 6:
						if (Class23.aClass5_230 == null)
							Class23.aClass5_230 = new Class5();
						Class23.aClass5_230.aString112 = string_267_;
						break;
					case 52:
						if (Class23.aClass5_230 == null)
							Class23.aClass5_230 = new Class5();
						Class23.aClass5_230.anInt110 = Integer.parseInt(string_267_) * -1803928197;
						break;
					case 11:
						string = string_267_;
						break;
					case 1:
						if (string_267_.equalsIgnoreCase(Class40.aString492))
							aBool11290 = true;
						break;
					case 26:
						if (Class23.aClass5_219 == null)
							Class23.aClass5_219 = new Class5();
						Class23.aClass5_219.aString112 = string_267_;
						break;
					case 5:
						if (string_267_.equals(Class40.aString492))
							aBool10989 = true;
						else
							aBool10989 = false;
						break;
					case 10:
						aString10998 = string_267_;
						break;
					case 2:
						if (null == Class23.aClass5_219)
							Class23.aClass5_219 = new Class5();
						Class23.aClass5_219.anInt111 = Integer.parseInt(string_267_) * 1232605419;
						break;
					case 20:
						Class47.aClass678_578 = ((Class678) Class682.method8091(Class678.method8057(1120390582), Integer.parseInt(string_267_), 1858049507));
						if (Class47.aClass678_578 == Class678.aClass678_8616)
							Class47.aClass678_578 = Class678.aClass678_8613;
						else if (!(Class47.aClass678_578.method8055(Class672.aClass672_8576, (byte) 1)) && (Class678.aClass678_8619 != Class47.aClass678_578))
							Class47.aClass678_578 = Class678.aClass678_8619;
						break;
					case 4:
						if (null == Class23.aClass5_219)
							Class23.aClass5_219 = new Class5();
						Class23.aClass5_219.anInt108 = Integer.parseInt(string_267_) * -1753280203;
						break;
					case 7:
						Class314.anInt3504 = Integer.parseInt(string_267_) * 935130637;
						break;
					case 37:
						if (Class23.aClass5_220 == null)
							Class23.aClass5_220 = new Class5();
						Class23.aClass5_220.anInt111 = Integer.parseInt(string_267_) * 1232605419;
						break;
					case 22:
						aString11004 = string_267_;
						break;
					case 41:
						Class254.aClass702_2755 = Class219.method3102(Integer.parseInt(string_267_), 1300456377);
						if (Class702.aClass702_8796 != Class254.aClass702_2755 && (Class702.aClass702_8798 != Class254.aClass702_2755) && (Class702.aClass702_8797 != Class254.aClass702_2755) && (Class702.aClass702_8799 != Class254.aClass702_2755))
							Class254.aClass702_2755 = Class702.aClass702_8799;
					}
				}
			}
			if (aString10986 == null)
				aString10986 = "";
			Class496 class496 = new Class496(-125739413 * anInt11152, -358673315 * anInt11153, -1899946153 * anInt11150, 1408494455 * anInt11298, aClass670_11043.aString8574);
			Class313.aclient3500 = this;
			String string_268_ = Class254.aClass702_2755.aString8801;
			int i = 32 + -1165196251 * Class254.aClass702_2755.anInt8800;
			if (!string.equals("")) {
				string_268_ = new StringBuilder().append(string_268_).append("_").append(string).toString();
				i = 0;
			}
			method6081(class496, aClass670_11043.aString8573, string_268_, i, Class319.method4240(2110472289), 876, 1, aBool11001, 235175950);
		}
	}

	final void method6134() {
		if (anInt11101 * -708374433 != 2) {
			if ((12 == anInt11101 * -708374433 || Class566.method6895(-708374433 * anInt11101, -721406407) || Class233.method3334(-708374433 * anInt11101, (byte) -115)) && Class184_Sub2.aClass211_9442 != null)
				Class184_Sub2.aClass211_9442.method3010(Class184_Sub2.aClass211_9442.method3059((byte) 121), Class710.aClass536_Sub40_8843.aClass710_Sub35_10790.method10213(-330903701), -1986261790);
			if (aBool11067) {
				synchronized (anObject11069) {
					anObject11069.notify();
				}
				synchronized (anObject11068) {
					try {
						anObject11068.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool11067 = false;
			}
			cycles++;
			if (cycles % 1000 == 1) {
				GregorianCalendar gregoriancalendar = new GregorianCalendar();
				Class458_Sub4.anInt10337 = (gregoriancalendar.get(11) * 600 + gregoriancalendar.get(12) * 10 + gregoriancalendar.get(13) / 6);
				aRandom11161.setSeed((long) Class458_Sub4.anInt10337);
			}
			long l = Class249.method3450(1389416252);
			aClass106_11322.method1410(1627459933);
			aClass106_11218.method1410(1500168289);
			method10372((byte) 0);
			if (null != Class290.aClass426_3223)
				Class290.aClass426_3223.method5125(-1005042281);
			if (Class184_Sub2.aClass211_9442 != null)
				Class184_Sub2.aClass211_9442.method2987((short) 20329);
			Class331_Sub2.aClass549_10049.method6637(1321967144);
			Class329.aClass550_3601.method6651(-1449359661);
			Class295.method3977(Class677.aClass167_8609, l);
			method10383(-2003260332);
			if (Class677.aClass167_8609 != null)
				Class677.aClass167_8609.method2007((int) l);
			anInt11033 = 0;
			anInt11036 = 0;
			for (Interface63 interface63 = Class331_Sub2.aClass549_10049.method6640(612307069); interface63 != null; interface63 = Class331_Sub2.aClass549_10049.method6640(612307069)) {
				int i = interface63.method373((byte) 25);
				if (2 == i || i == 3) {
					if (anInt11033 * -1816034791 < 130) {
						anInterface63Array11034[anInt11033 * -1816034791] = interface63;
						anInt11033 += 1893513769;
					}
				} else if (i == 0) {
					if (Class54.method942(1430016135) && interface63.method413(1665486746) == 28) {
						if (423156687 * anInt11160 >= 2 && Class331_Sub2.aClass549_10049.method6638(82, (byte) 0)) {
							if (Class70.method1117(1244079993))
								Class316.method4218(-1130375414);
							else
								Class294.method3971(Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method190(-1838570595), (byte) 50);
						} else if (Class44.method882(320657273) && (Class710.aClass536_Sub40_8843.aClass710_Sub30_10786.method10180(-1647630198) == 0 || Class331_Sub2.aClass549_10049.method6638(86, (byte) 0)))
							Class98_Sub1.method8393(557142479);
						else if (Class710.aClass536_Sub40_8843.aClass710_Sub30_10786.method10180(-1647630198) == 0 || Class331_Sub2.aClass549_10049.method6638(86, (byte) 0))
							Class167.method2414(355094633);
						else
							Class269.method3710((Class38.aClass38_453.method840(Class459.aClass664_5178, 1584865630)), (byte) -21);
					}
					if (anInt11036 * -1621465757 < 77) {
						anInterface63Array11037[-1621465757 * anInt11036] = interface63;
						anInt11036 += -1829616565;
					}
				}
			}
			anInt11031 = 0;
			for (Class536_Sub31 class536_sub31 = Class329.aClass550_3601.method6659((byte) -87); null != class536_sub31; class536_sub31 = Class329.aClass550_3601.method6659((byte) -10)) {
				int i = class536_sub31.method9642(-1722352600);
				if (i == -1)
					Class523.method6400(class536_sub31, (short) 9005);
				else if (6 == i) {
					anInt11031 += class536_sub31.method9644(-343267839) * 241652841;
					class536_sub31.method9641(-1708775813);
				} else if (Class160.method1960(i, (byte) -32)) {
					aClass708_11250.method8335(class536_sub31, -92895981);
					if (aClass708_11250.method8339((byte) 85) > 10) {
						Class536_Sub31 class536_sub31_269_ = ((Class536_Sub31) aClass708_11250.method8305(-1090545495));
						if (class536_sub31_269_ != null)
							class536_sub31_269_.method9641(-1662196552);
					}
				}
			}
			if (Class44.method882(202557690))
				Class624.method7427((byte) 99);
			if (Class482.method5837(-708374433 * anInt11101, -1400185074)) {
				Class3.method554(-1889601520);
				Class444.method5392(571772391);
			} else if (Class578.method7007(-708374433 * anInt11101, 988297504))
				aClass515_11066.method6271(1827350578);
			if (Class566.method6895(anInt11101 * -708374433, 843215641) && !Class578.method7007(anInt11101 * -708374433, 916607381)) {
				method10374(-1278766367);
				Class154.method1871(1682925767);
				Class283.handleLogin(-1172926562);
			} else if (Class233.method3334(anInt11101 * -708374433, (byte) -122) && !Class578.method7007(anInt11101 * -708374433, 161101909)) {
				method10374(-608170486);
				Class283.handleLogin(236778952);
			} else if (4 == anInt11101 * -708374433)
				Class283.handleLogin(2028948453);
			else if (Class426.method5129(anInt11101 * -708374433, 1603352511) && !Class578.method7007(anInt11101 * -708374433, -430625128))
				Class678.method8062(1736935364);
			else if (17 == -708374433 * anInt11101 || 19 == anInt11101 * -708374433) {
				Class283.handleLogin(-1703260163);
				if (-3 != 1063476305 * Class61.anInt687 && 1063476305 * Class61.anInt687 != 2 && 15 != Class61.anInt687 * 1063476305) {
					if (-708374433 * anInt11101 == 19) {
						Class61.anInt690 = 1717456075 * Class61.anInt693;
						Class61.anInt689 = Class61.anInt651 * 1842886491;
						Class61.anInt688 = Class61.anInt687 * 1466930321;
						if (Class710_Sub1.aBool10815) {
							Class554.method6786(1318197187 * Class195.aClass5_2200.anInt111, Class195.aClass5_2200.aString112, Class195.aClass5_2200.anInt110 * -843966029, Class195.aClass5_2200.anInt108 * -910853859, -642227827);
							aClass106_11322.method1412(891878180);
							Class673.method8026(17, -1798113843);
						} else
							Class275.method3737(Class61.aBool653, -1167171321);
					} else
						Class275.method3737(false, -1953325475);
				}
			}
			Class699.method8235(Class677.aClass167_8609, 477728608);
			aClass708_11250.method8305(-660833243);
			if (null != Class677.aClass167_8609) {
				Iterator iterator = aMap11301.entrySet().iterator();
				while (iterator.hasNext()) {
					Map.Entry entry = (Map.Entry) iterator.next();
					Class114 class114 = (Class114) entry.getValue();
					if (class114.method1476(-1154580595)) {
						byte[] is = class114.method1477(-483325453);
						if (null != is) {
							try {
								BufferedImage bufferedimage = ImageIO.read(new ByteArrayInputStream(is));
								int[] is_270_ = Class66.method1077(bufferedimage, -869751986);
								Class143 class143 = (Class677.aClass167_8609.method2081(is_270_, 0, bufferedimage.getWidth(), bufferedimage.getWidth(), bufferedimage.getHeight(), (byte) -56));
								aClass199_11300.method2881(class143, (long) ((Integer) entry.getKey()).intValue());
							} catch (IOException ioexception) {
								Class81.method1165(Class313.aclient3500.method6092(1184482271), ioexception, (byte) -101);
							}
						}
						iterator.remove();
					}
				}
			}
		}
	}

	final void method6086() {
		if (anInt11101 * -708374433 != 2) {
			if ((12 == anInt11101 * -708374433 || Class566.method6895(-708374433 * anInt11101, 451421044) || Class233.method3334(-708374433 * anInt11101, (byte) -41)) && Class184_Sub2.aClass211_9442 != null)
				Class184_Sub2.aClass211_9442.method3010(Class184_Sub2.aClass211_9442.method3059((byte) 51), Class710.aClass536_Sub40_8843.aClass710_Sub35_10790.method10213(1349538729), 1374246826);
			if (aBool11067) {
				synchronized (anObject11069) {
					anObject11069.notify();
				}
				synchronized (anObject11068) {
					try {
						anObject11068.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool11067 = false;
			}
			cycles++;
			if (cycles % 1000 == 1) {
				GregorianCalendar gregoriancalendar = new GregorianCalendar();
				Class458_Sub4.anInt10337 = (gregoriancalendar.get(11) * 600 + gregoriancalendar.get(12) * 10 + gregoriancalendar.get(13) / 6);
				aRandom11161.setSeed((long) Class458_Sub4.anInt10337);
			}
			long l = Class249.method3450(1545837452);
			aClass106_11322.method1410(1677609543);
			aClass106_11218.method1410(1609625709);
			method10372((byte) 0);
			if (null != Class290.aClass426_3223)
				Class290.aClass426_3223.method5125(-631850996);
			if (Class184_Sub2.aClass211_9442 != null)
				Class184_Sub2.aClass211_9442.method2987((short) 32621);
			Class331_Sub2.aClass549_10049.method6637(81961433);
			Class329.aClass550_3601.method6651(-786186330);
			Class295.method3977(Class677.aClass167_8609, l);
			method10383(-1924744008);
			if (Class677.aClass167_8609 != null)
				Class677.aClass167_8609.method2007((int) l);
			anInt11033 = 0;
			anInt11036 = 0;
			for (Interface63 interface63 = Class331_Sub2.aClass549_10049.method6640(612307069); interface63 != null; interface63 = Class331_Sub2.aClass549_10049.method6640(612307069)) {
				int i = interface63.method373((byte) 63);
				if (2 == i || i == 3) {
					if (anInt11033 * -1816034791 < 130) {
						anInterface63Array11034[anInt11033 * -1816034791] = interface63;
						anInt11033 += 1893513769;
					}
				} else if (i == 0) {
					if (Class54.method942(1224302271) && interface63.method413(-1657661223) == 28) {
						if (423156687 * anInt11160 >= 2 && Class331_Sub2.aClass549_10049.method6638(82, (byte) 0)) {
							if (Class70.method1117(-141059888))
								Class316.method4218(-56582093);
							else
								Class294.method3971(Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method190(1044578938), (byte) 49);
						} else if (Class44.method882(666746671) && (Class710.aClass536_Sub40_8843.aClass710_Sub30_10786.method10180(-1647630198) == 0 || Class331_Sub2.aClass549_10049.method6638(86, (byte) 0)))
							Class98_Sub1.method8393(1712997656);
						else if (Class710.aClass536_Sub40_8843.aClass710_Sub30_10786.method10180(-1647630198) == 0 || Class331_Sub2.aClass549_10049.method6638(86, (byte) 0))
							Class167.method2414(355094633);
						else
							Class269.method3710((Class38.aClass38_453.method840(Class459.aClass664_5178, 1802097441)), (byte) -16);
					}
					if (anInt11036 * -1621465757 < 77) {
						anInterface63Array11037[-1621465757 * anInt11036] = interface63;
						anInt11036 += -1829616565;
					}
				}
			}
			anInt11031 = 0;
			for (Class536_Sub31 class536_sub31 = Class329.aClass550_3601.method6659((byte) 33); null != class536_sub31; class536_sub31 = Class329.aClass550_3601.method6659((byte) -26)) {
				int i = class536_sub31.method9642(-2043341545);
				if (i == -1)
					Class523.method6400(class536_sub31, (short) 28573);
				else if (6 == i) {
					anInt11031 += class536_sub31.method9644(-343267839) * 241652841;
					class536_sub31.method9641(-1384620280);
				} else if (Class160.method1960(i, (byte) 89)) {
					aClass708_11250.method8335(class536_sub31, -2024482586);
					if (aClass708_11250.method8339((byte) 52) > 10) {
						Class536_Sub31 class536_sub31_271_ = ((Class536_Sub31) aClass708_11250.method8305(1375082622));
						if (class536_sub31_271_ != null)
							class536_sub31_271_.method9641(-1768137340);
					}
				}
			}
			if (Class44.method882(1417667133))
				Class624.method7427((byte) -11);
			if (Class482.method5837(-708374433 * anInt11101, 733945576)) {
				Class3.method554(-1852339491);
				Class444.method5392(602444209);
			} else if (Class578.method7007(-708374433 * anInt11101, 629435898))
				aClass515_11066.method6271(1799489132);
			if (Class566.method6895(anInt11101 * -708374433, 1943401430) && !Class578.method7007(anInt11101 * -708374433, -284427533)) {
				method10374(-1415140104);
				Class154.method1871(714846512);
				Class283.handleLogin(-913785170);
			} else if (Class233.method3334(anInt11101 * -708374433, (byte) -106) && !Class578.method7007(anInt11101 * -708374433, 617966129)) {
				method10374(492535152);
				Class283.handleLogin(-1427792072);
			} else if (4 == anInt11101 * -708374433)
				Class283.handleLogin(-2116903340);
			else if (Class426.method5129(anInt11101 * -708374433, 1603352511) && !Class578.method7007(anInt11101 * -708374433, 918529743))
				Class678.method8062(-591546398);
			else if (17 == -708374433 * anInt11101 || 19 == anInt11101 * -708374433) {
				Class283.handleLogin(1277144652);
				if (-3 != 1063476305 * Class61.anInt687 && 1063476305 * Class61.anInt687 != 2 && 15 != Class61.anInt687 * 1063476305) {
					if (-708374433 * anInt11101 == 19) {
						Class61.anInt690 = 1717456075 * Class61.anInt693;
						Class61.anInt689 = Class61.anInt651 * 1842886491;
						Class61.anInt688 = Class61.anInt687 * 1466930321;
						if (Class710_Sub1.aBool10815) {
							Class554.method6786(1318197187 * Class195.aClass5_2200.anInt111, Class195.aClass5_2200.aString112, Class195.aClass5_2200.anInt110 * -843966029, Class195.aClass5_2200.anInt108 * -910853859, -1598533195);
							aClass106_11322.method1412(-802524925);
							Class673.method8026(17, -1798113843);
						} else
							Class275.method3737(Class61.aBool653, -1596765333);
					} else
						Class275.method3737(false, -1152857368);
				}
			}
			Class699.method8235(Class677.aClass167_8609, 177648271);
			aClass708_11250.method8305(-109679946);
			if (null != Class677.aClass167_8609) {
				Iterator iterator = aMap11301.entrySet().iterator();
				while (iterator.hasNext()) {
					Map.Entry entry = (Map.Entry) iterator.next();
					Class114 class114 = (Class114) entry.getValue();
					if (class114.method1476(-751702303)) {
						byte[] is = class114.method1477(307714803);
						if (null != is) {
							try {
								BufferedImage bufferedimage = ImageIO.read(new ByteArrayInputStream(is));
								int[] is_272_ = Class66.method1077(bufferedimage, -1112578753);
								Class143 class143 = (Class677.aClass167_8609.method2081(is_272_, 0, bufferedimage.getWidth(), bufferedimage.getWidth(), bufferedimage.getHeight(), (byte) -102));
								aClass199_11300.method2881(class143, (long) ((Integer) entry.getKey()).intValue());
							} catch (IOException ioexception) {
								Class81.method1165(Class313.aclient3500.method6092(-1155404374), ioexception, (byte) 23);
							}
						}
						iterator.remove();
					}
				}
			}
		}
	}

	final void method6129() {
		if (Class590.aClass147_Sub1_7791 != null && Class590.aClass147_Sub1_7791.aBool8886)
			Class567.method6918(1298619917);
		Class187.method2779((byte) 16);
		Class502.method6040(1985696571);
		if (null != Class677.aClass167_8609)
			Class677.aClass167_8609.method2005(778784407);
		if (Class707.aBool8822 && null != Class223.aFrame2336) {
			Class310.method4176(Class464.aClass691_5228, Class223.aFrame2336, (byte) -85);
			Class223.aFrame2336 = null;
		}
		aClass106_11322.method1418(-1974152117);
		aClass106_11322.aClass27_1272.method754(-613191279);
		aClass106_11218.method1418(158452257);
		aClass106_11218.aClass27_1272.method754(-36849645);
		if (null != Class184_Sub2.aClass211_9442)
			Class184_Sub2.aClass211_9442.method3041(-2083370138);
		Class176.aClass460_1936.method5532(-381931475);
		Class183_Sub2.aClass449_9812.method5415((byte) 1);
		Class246.aClass466_2473.method5673(-1005059964);
		if (null != aClass661_11019) {
			aClass661_11019.method7976((byte) 16);
			aClass661_11019 = null;
		}
		try {
			Ping.quit();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class169.method2419(677135823);
		try {
			Class88.method1213(-2018016429);
		} catch (Exception exception) {
			/* empty */
		}
		if (null != Class208.aClass60_2245)
			Class208.aClass60_2245.method991(1432588681);
		if (aBool6869 && Class678.aClass678_8616 != Class47.aClass678_578)
			Class205_Sub22.method9098(1751093053);
	}

	static final void method10460(int i, int i_273_, int i_274_, int i_275_, int i_276_, int i_277_, int i_278_, byte i_279_) {
		int i_280_ = i_278_ - 334;
		if (i_280_ < 0)
			i_280_ = 0;
		else if (i_280_ > 100)
			i_280_ = 100;
		int i_281_ = aShort11277 + (aShort11278 - aShort11277) * i_280_ / 100;
		i_277_ = i_277_ * i_281_ >> 8;
		int i_282_ = 16384 - i_275_ & 0x3fff;
		int i_283_ = 16384 - i_276_ & 0x3fff;
		int i_284_ = 0;
		int i_285_ = 0;
		int i_286_ = i_277_;
		if (i_282_ != 0) {
			i_285_ = -i_286_ * Class447.anIntArray4906[i_282_] >> 14;
			i_286_ = i_286_ * Class447.anIntArray4921[i_282_] >> 14;
		}
		if (0 != i_283_) {
			i_284_ = Class447.anIntArray4906[i_283_] * i_286_ >> 14;
			i_286_ = i_286_ * Class447.anIntArray4921[i_283_] >> 14;
		}
		Class637.anInt8301 = 1420867453 * (i - i_284_);
		Class205_Sub21.anInt9958 = (i_273_ - i_285_) * -300318539;
		Class685.anInt8665 = 717279039 * (i_274_ - i_286_);
		Class141.anInt1658 = i_275_ * 269246561;
		Class144.anInt1681 = i_276_ * 402508199;
		Class304.anInt3440 = 0;
	}
}
