package com.bankfrequency;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class BankFrequencyPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(BankFrequencyPlugin.class);
		RuneLite.main(args);
	}
}