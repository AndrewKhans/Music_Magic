package andrewmogo.Sounds;

import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SoundRegisterListener {
    @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
    public void registerSoundEvents(RegistryEvent.Register<SoundEvent> event) {

        // To add more sounds: (SoundRegistrator.sound1, SoundRegistrator.sound2)
        event.getRegistry().registerAll(SoundRegistrator.guitarSound);

    }
}