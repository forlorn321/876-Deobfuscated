/* TwitchWebcamDevice - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;

import java.util.LinkedList;

public class TwitchWebcamDevice {
	public String aString1125;
	public String aString1126;
	public int anInt1127;
	public int anInt1128;
	private LinkedList aLinkedList1129 = new LinkedList();

	public TwitchWebcamDevice(int i, int i_0_, String string, String string_1_) {
		anInt1127 = i * -787981973;
		anInt1128 = -2081814639 * i_0_;
		aString1125 = string;
		aString1126 = string_1_;
	}

	public void AddCapability(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		aLinkedList1129.add(new TwitchWebcamDeviceCapability(i, i_2_, i_3_, i_4_, i_5_));
	}

	public TwitchWebcamDeviceCapability method1265(int i) {
		if (i < 0 || i >= aLinkedList1129.size())
			return null;
		return (TwitchWebcamDeviceCapability) aLinkedList1129.get(i);
	}

	public TwitchWebcamDeviceCapability method1266(int i) {
		for (int i_6_ = 0; i_6_ < aLinkedList1129.size(); i_6_++) {
			if ((((TwitchWebcamDeviceCapability) aLinkedList1129.get(i_6_)).anInt1137) * 974204841 == i)
				return ((TwitchWebcamDeviceCapability) aLinkedList1129.get(i_6_));
		}
		return null;
	}

	public int method1267() {
		return aLinkedList1129.size();
	}

	public int method1268() {
		return aLinkedList1129.size();
	}
}
