package NovClient.API.Events.World;


import NovClient.API.Event;
import net.minecraft.entity.Entity;

public class EventAttack extends Event {
    private Entity entity;
    private boolean preAttack;

    public EventAttack(Entity targetEntity, boolean preAttack) {
        this.entity = targetEntity;
        this.preAttack = preAttack;
    }

    public Entity getEntity() {
        return entity;
    }

    public boolean isPreAttack() {
        return preAttack;
    }

    public boolean isPostAttack() {
        return !preAttack;
    }
}
