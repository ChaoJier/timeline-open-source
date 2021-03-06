package NovClient.API.Events.World;

import NovClient.API.Event;
import net.minecraft.network.Packet;

public class EventPacketReceive extends Event {
	private Packet packet;

	public EventPacketReceive(Packet packet) {
		this.packet = packet;
	}

	public Packet getPacket() {
		return this.packet;
	}

	public void setPacket(Packet packet) {
		this.packet = packet;
	}
}
