/* Class606 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class ObjShapes implements Interface75 {
	public static ObjShapes aClass606_7873;
	public static ObjShapes aClass606_7874;
	public static ObjShapes aClass606_7875;
	public static ObjShapes aClass606_7876;
	static ObjShapes aClass606_7877;
	public int anInt7878;
	public static ObjShapes aClass606_7879;
	public static ObjShapes aClass606_7880;
	public static ObjShapes aClass606_7881;
	public static ObjShapes aClass606_7882;
	static ObjShapes aClass606_7883;
	public static ObjShapes aClass606_7884;
	static ObjShapes aClass606_7885;
	static ObjShapes aClass606_7886;
	static ObjShapes aClass606_7887;
	public static ObjShapes aClass606_7888;
	public static ObjShapes aClass606_7889;
	static ObjShapes aClass606_7890;
	static ObjShapes aClass606_7891;
	public static ObjShapes aClass606_7892 = new ObjShapes(0, 0);
	static ObjShapes aClass606_7893;
	public static ObjShapes aClass606_7894;
	public static ObjShapes aClass606_7895;
	static ObjShapes aClass606_7896;
	public int anInt7897;
	public static int anInt7898;

	static {
		aClass606_7874 = new ObjShapes(1, 0);
		aClass606_7875 = new ObjShapes(2, 0);
		aClass606_7876 = new ObjShapes(3, 0);
		aClass606_7873 = new ObjShapes(9, 2);
		aClass606_7888 = new ObjShapes(4, 1);
		aClass606_7879 = new ObjShapes(5, 1);
		aClass606_7889 = new ObjShapes(6, 1);
		aClass606_7881 = new ObjShapes(7, 1);
		aClass606_7882 = new ObjShapes(8, 1);
		aClass606_7883 = new ObjShapes(12, 2);
		aClass606_7884 = new ObjShapes(13, 2);
		aClass606_7885 = new ObjShapes(14, 2);
		aClass606_7893 = new ObjShapes(15, 2);
		aClass606_7887 = new ObjShapes(16, 2);
		aClass606_7877 = new ObjShapes(17, 2);
		aClass606_7886 = new ObjShapes(18, 2);
		aClass606_7890 = new ObjShapes(19, 2);
		aClass606_7896 = new ObjShapes(20, 2);
		aClass606_7891 = new ObjShapes(21, 2);
		aClass606_7880 = new ObjShapes(10, 2);
		aClass606_7894 = new ObjShapes(11, 2);
		aClass606_7895 = new ObjShapes(22, 3);
	}

	public static boolean method7210(int i) {
		return (i >= aClass606_7883.anInt7878 * -723459231 && i <= aClass606_7877.anInt7878 * -723459231);
	}

	public int method12() {
		return anInt7878 * -723459231;
	}

	public int method73() {
		return anInt7878 * -723459231;
	}

	ObjShapes(int i, int i_0_) {
		anInt7878 = 959512737 * i;
		anInt7897 = -1074856779 * i_0_;
	}

	public int method78() {
		return anInt7878 * -723459231;
	}

	public static boolean method7211(int i) {
		return ((i >= aClass606_7892.anInt7878 * -723459231 && i <= aClass606_7876.anInt7878 * -723459231) || aClass606_7873.anInt7878 * -723459231 == i);
	}

	public static boolean method7212(int i) {
		return ((i >= aClass606_7892.anInt7878 * -723459231 && i <= aClass606_7876.anInt7878 * -723459231) || aClass606_7873.anInt7878 * -723459231 == i);
	}

	public static boolean method7213(int i) {
		return ((i >= aClass606_7892.anInt7878 * -723459231 && i <= aClass606_7876.anInt7878 * -723459231) || aClass606_7873.anInt7878 * -723459231 == i);
	}

	static boolean method7214(int i) {
		return (i >= -723459231 * aClass606_7888.anInt7878 && i <= -723459231 * aClass606_7882.anInt7878);
	}

	static boolean method7215(int i) {
		return (i >= -723459231 * aClass606_7888.anInt7878 && i <= -723459231 * aClass606_7882.anInt7878);
	}

	public static boolean method7216(int i) {
		return (i >= -723459231 * aClass606_7886.anInt7878 && i <= -723459231 * aClass606_7891.anInt7878);
	}

	static final void method7217(Class668 class668, int i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_1_);
		Class466.method5682(class251, class668, -220895150);
	}

	static final void method7218(Class668 class668, byte i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_2_);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class251.yan2d * 92396219;
	}

	public static Class47 method7219(String string, int i, int i_3_) {
		Class47_Sub1 class47_sub1 = new Class47_Sub1();
		class47_sub1.aString576 = string;
		class47_sub1.anInt577 = i * 668922657;
		return class47_sub1;
	}

	static final void method7220(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.aBool11123 ? 1 : 0;
	}

	static final void method7221(String string, byte i) {
		System.out.println(new StringBuilder().append("Error: ").append(Class83.method1177(string, "%0a", "\n", 1048284803)).toString());
	}
}
