/*******************************************************************************
 * Copyright (c) 2011, 2016 Eurotech and/or its affiliates
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech
 *******************************************************************************/
package org.eclipse.kura.net.wifi;

import java.util.EnumSet;
import java.util.List;

import org.eclipse.kura.net.NetInterface;

/**
 * Wifi interface
 *
 * @param <T>
 */
public interface WifiInterface<T extends WifiInterfaceAddress> extends NetInterface<T> 
{
	/**
	 * Flags describing the capabilities of a wireless device.
	 */
	public enum Capability
	{
		/** no capabilities supported */
		NONE,
		/** The device supports the 40-bit WEP cipher. */
		CIPHER_WEP40,
		/** The device supports the 104-bit WEP cipher. */
		CIPHER_WEP104,
		/** The device supports the TKIP cipher. */
		CIPHER_TKIP,
		/** The device supports the CCMP cipher. */
		CIPHER_CCMP,
		/** The device supports the WPA encryption/authentication protocol. */
		WPA,
		/** The device supports the RSN encryption/authentication protocol. */
		RSN;
	}
	
	/**
	 * Returns the the capabilities of the wireless device.
	 * @return
	 */
	public EnumSet<Capability> getCapabilities();
	
	/**
	 * Returns a List of all InterfaceAddresses of this network interface.
	 * @return a List object with all or a subset of the InterfaceAddresss of this network interface
	 */
	public List<T> getNetInterfaceAddresses(); 

}
