package mtr.fabric;

import mtr.MainClient;
import net.fabricmc.api.ClientModInitializer;

public class MainFabricClient implements ClientModInitializer{
	@Override
	public void onInitializeClient() {
		MainClient.registerItem();
	}
}