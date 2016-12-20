/* Class546 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Class546 {
	int anInt7261;
	boolean aBool7262;
	int anInt7263;
	public List aList7264 = new LinkedList();
	public static int anInt7265;

	public void method9051() {
		Iterator iterator = aList7264.iterator();
		while (iterator.hasNext()) {
			Class558 class558 = (Class558) iterator.next();
			iterator.remove();
			Class389.method6463(class558, -2035325610);
		}
	}

	public void method9052(byte i) {
		Iterator iterator = aList7264.iterator();
		while (iterator.hasNext()) {
			Class558 class558 = (Class558) iterator.next();
			iterator.remove();
			Class389.method6463(class558, -1781601893);
		}
	}

	void method9053(Class558 class558, int i) {
		Class640_Sub1 class640_sub1 = class558.aClass640_Sub1_7532;
		boolean bool = true;
		Class169[] class169s = class558.aClass640_Sub1_7532.aClass169Array10863;
		for (int i_0_ = 0; i_0_ < class169s.length; i_0_++) {
			if (class169s[i_0_].aBool1874) {
				bool = false;
				break;
			}
		}
		if (!bool) {
			class558.aClass546_7529 = this;
			if (aBool7262) {
				Iterator iterator = aList7264.iterator();
				while (iterator.hasNext()) {
					Class558 class558_1_ = (Class558) iterator.next();
					if (class640_sub1 == class558_1_.aClass640_Sub1_7532) {
						iterator.remove();
						Class389.method6463(class558_1_, -1680378427);
					}
				}
			}
			ListIterator listiterator = aList7264.listIterator();
			while (listiterator.hasNext()) {
				Class558 class558_2_ = (Class558) listiterator.next();
				if (class640_sub1.anInt10866 * 1971671255 >= (class558_2_.aClass640_Sub1_7532.anInt10866 * 1971671255)) {
					listiterator.previous();
					listiterator.add(class558);
					return;
				}
			}
			aList7264.add(class558);
		}
	}

	void method9054(Class558 class558) {
		Class640_Sub1 class640_sub1 = class558.aClass640_Sub1_7532;
		boolean bool = true;
		Class169[] class169s = class558.aClass640_Sub1_7532.aClass169Array10863;
		for (int i = 0; i < class169s.length; i++) {
			if (class169s[i].aBool1874) {
				bool = false;
				break;
			}
		}
		if (!bool) {
			class558.aClass546_7529 = this;
			if (aBool7262) {
				Iterator iterator = aList7264.iterator();
				while (iterator.hasNext()) {
					Class558 class558_3_ = (Class558) iterator.next();
					if (class640_sub1 == class558_3_.aClass640_Sub1_7532) {
						iterator.remove();
						Class389.method6463(class558_3_, 402121184);
					}
				}
			}
			ListIterator listiterator = aList7264.listIterator();
			while (listiterator.hasNext()) {
				Class558 class558_4_ = (Class558) listiterator.next();
				if (class640_sub1.anInt10866 * 1971671255 >= (class558_4_.aClass640_Sub1_7532.anInt10866 * 1971671255)) {
					listiterator.previous();
					listiterator.add(class558);
					return;
				}
			}
			aList7264.add(class558);
		}
	}

	void method9055(Class558 class558) {
		Class640_Sub1 class640_sub1 = class558.aClass640_Sub1_7532;
		boolean bool = true;
		Class169[] class169s = class558.aClass640_Sub1_7532.aClass169Array10863;
		for (int i = 0; i < class169s.length; i++) {
			if (class169s[i].aBool1874) {
				bool = false;
				break;
			}
		}
		if (!bool) {
			class558.aClass546_7529 = this;
			if (aBool7262) {
				Iterator iterator = aList7264.iterator();
				while (iterator.hasNext()) {
					Class558 class558_5_ = (Class558) iterator.next();
					if (class640_sub1 == class558_5_.aClass640_Sub1_7532) {
						iterator.remove();
						Class389.method6463(class558_5_, -168827137);
					}
				}
			}
			ListIterator listiterator = aList7264.listIterator();
			while (listiterator.hasNext()) {
				Class558 class558_6_ = (Class558) listiterator.next();
				if (class640_sub1.anInt10866 * 1971671255 >= (class558_6_.aClass640_Sub1_7532.anInt10866 * 1971671255)) {
					listiterator.previous();
					listiterator.add(class558);
					return;
				}
			}
			aList7264.add(class558);
		}
	}

	Class546(boolean bool) {
		aBool7262 = false;
		anInt7261 = 0;
		anInt7263 = 0;
		aBool7262 = bool;
	}

	public static long method9056(int i) {
		long l;
		try {
			URL url = new URL(new StringBuilder().append(Class23.method828("services", false, -1708114234)).append("m=accountappeal/login.ws").toString());
			URLConnection urlconnection = url.openConnection();
			urlconnection.setRequestProperty("connection", "close");
			urlconnection.setDoInput(true);
			urlconnection.setDoOutput(true);
			urlconnection.setConnectTimeout(5000);
			OutputStreamWriter outputstreamwriter = new OutputStreamWriter(urlconnection.getOutputStream());
			outputstreamwriter.write("data1=req");
			outputstreamwriter.flush();
			InputStream inputstream = urlconnection.getInputStream();
			RSByteBuffer class527_sub38 = new RSByteBuffer(new byte[1000]);
			for (;;) {
				int i_7_ = inputstream.read(class527_sub38.buffer, -441238943 * class527_sub38.anInt10689, 1000 - (-441238943 * class527_sub38.anInt10689));
				if (-1 == i_7_)
					break;
				class527_sub38.anInt10689 += i_7_ * 1474750881;
				if (class527_sub38.anInt10689 * -441238943 >= 1000)
					return 0L;
			}
			class527_sub38.anInt10689 = 0;
			long l_8_ = class527_sub38.method16612((byte) 1);
			l = l_8_;
		} catch (Exception exception) {
			return 0L;
		}
		return l;
	}

	static Class266[] method9057(byte i) {
		return (new Class266[] { Class266.aClass266_2982, Class266.aClass266_2878, Class266.aClass266_2927, Class266.aClass266_2936, Class266.aClass266_2935, Class266.aClass266_2949, Class266.aClass266_2968, Class266.aClass266_2894, Class266.aClass266_2885, Class266.aClass266_2886, Class266.aClass266_2887, Class266.aClass266_2901, Class266.aClass266_2889, Class266.aClass266_2890, Class266.aClass266_2891, Class266.aClass266_2980, Class266.aClass266_2893, Class266.aClass266_2892,
				Class266.aClass266_2884, Class266.aClass266_2896, Class266.aClass266_2897, Class266.aClass266_2898, Class266.aClass266_2961, Class266.aClass266_2900, Class266.aClass266_2995, Class266.aClass266_2902, Class266.aClass266_2903, Class266.aClass266_2904, Class266.aClass266_2983, Class266.aClass266_2906, Class266.aClass266_2907, Class266.aClass266_2908, Class266.aClass266_2909, Class266.aClass266_2992, Class266.aClass266_2905, Class266.aClass266_2943, Class266.aClass266_2937,
				Class266.aClass266_2990, Class266.aClass266_2915, Class266.aClass266_2916, Class266.aClass266_2917, Class266.aClass266_2918, Class266.aClass266_2919, Class266.aClass266_2882, Class266.aClass266_2921, Class266.aClass266_2922, Class266.aClass266_2923, Class266.aClass266_2924, Class266.aClass266_2925, Class266.aClass266_2926, Class266.aClass266_2883, Class266.aClass266_2928, Class266.aClass266_2929, Class266.aClass266_2930, Class266.aClass266_2911, Class266.aClass266_2932,
				Class266.aClass266_2880, Class266.aClass266_2879, Class266.aClass266_2920, Class266.aClass266_2991, Class266.aClass266_2914, Class266.aClass266_2938, Class266.aClass266_2939, Class266.aClass266_2940, Class266.aClass266_2997, Class266.aClass266_2942, Class266.aClass266_2931, Class266.aClass266_2944, Class266.aClass266_2945, Class266.aClass266_2946, Class266.aClass266_2947, Class266.aClass266_2910, Class266.aClass266_2984, Class266.aClass266_2950, Class266.aClass266_2970,
				Class266.aClass266_2952, Class266.aClass266_2953, Class266.aClass266_2954, Class266.aClass266_2955, Class266.aClass266_2956, Class266.aClass266_2933, Class266.aClass266_2958, Class266.aClass266_2959, Class266.aClass266_2960, Class266.aClass266_2934, Class266.aClass266_2962, Class266.aClass266_2999, Class266.aClass266_2964, Class266.aClass266_2965, Class266.aClass266_2966, Class266.aClass266_2967, Class266.aClass266_2948, Class266.aClass266_2969, Class266.aClass266_2877,
				Class266.aClass266_2971, Class266.aClass266_2972, Class266.aClass266_2913, Class266.aClass266_2974, Class266.aClass266_2963, Class266.aClass266_2976, Class266.aClass266_2977, Class266.aClass266_2978, Class266.aClass266_2979, Class266.aClass266_2957, Class266.aClass266_2981, Class266.aClass266_2912, Class266.aClass266_2881, Class266.aClass266_2951, Class266.aClass266_2985, Class266.aClass266_2986, Class266.aClass266_2987, Class266.aClass266_2988, Class266.aClass266_2989,
				Class266.aClass266_2973, Class266.aClass266_2975, Class266.aClass266_2888, Class266.aClass266_2993, Class266.aClass266_2994, Class266.aClass266_2895, Class266.aClass266_2996, Class266.aClass266_2941, Class266.aClass266_2998, Class266.aClass266_2899, Class266.aClass266_3000, Class266.aClass266_3001 });
	}

	static final void method9058(Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		int i_9_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = new StringBuilder().append(string).append(Class677.method13888(i_9_, true, 321705090)).toString();
	}

	static void method9059(int i) {
		Class32.aString318 = "";
		Class32.aString306 = "";
		Class32.aString289 = "";
		Class32.aBool271 = true;
	}

	public static void method9060(Class579 class579, int i, int i_10_, byte i_11_) {
		Class665 class665 = Class383.method6409((byte) -109);
		Class261.method4926(class579, i, i_10_, class665, 1057482031);
	}
}
