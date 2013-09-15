package com.becoda.core.util.uuid;

import java.util.UUID;

public class BkUUID {
	public static long getID() {
		return getUUID();
	}
	
	public static long getUUID() {
		return UUID.randomUUID().getMostSignificantBits();
	}
}
