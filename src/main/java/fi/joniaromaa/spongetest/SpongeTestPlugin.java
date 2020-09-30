package fi.joniaromaa.spongetest;

import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.lifecycle.ConstructPluginEvent;
import org.spongepowered.plugin.jvm.Plugin;

@Plugin("test")
public class SpongeTestPlugin
{
    @Listener
    public void onConstructPluginEvent(ConstructPluginEvent event)
    {
        System.out.println("Test lmao laoded haha");
    }
}
