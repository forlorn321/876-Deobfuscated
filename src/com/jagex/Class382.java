/* Class382 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

public class Class382 {
	public Class536_Sub18_Sub10 aClass536_Sub18_Sub10_4012;
	public int anInt4013;
	public int[] anIntArray4014;

	static void method4821(short i) {
		Class575.aBool7667 = false;
		Class536_Sub22_Sub5.anIntArray11645 = null;
		Class508.anIntArray6917 = null;
		Class575.aLinkedList7661.clear();
		Class575.aLinkedList7670.clear();
		Class677.aClass167_8609.method2393();
	}

	static final void method4822(Class668 class668, int i) {
		String string = "";
		if (null != Class400.aClipboard4137) {
			Transferable transferable = Class400.aClipboard4137.getContents(null);
			if (null != transferable) {
				try {
					string = (String) transferable.getTransferData(DataFlavor.stringFlavor);
					if (string == null)
						string = "";
				} catch (Exception exception) {
					/* empty */
				}
			}
		}
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = string;
	}

	public static int method4823(int i) {
		if (2.0 == (double) Class542_Sub1.aFloat7232)
			return 25;
		if (3.0 == (double) Class542_Sub1.aFloat7232)
			return 37;
		if (4.0 == (double) Class542_Sub1.aFloat7232)
			return 50;
		if ((double) Class542_Sub1.aFloat7232 == 6.0)
			return 75;
		if (8.0 == (double) Class542_Sub1.aFloat7232)
			return 100;
		return 200;
	}
}
