package fi.joniaromaa.spongetest.mixin;

import net.minecraft.server.ServerEula;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ServerEula.class)
public abstract class MixinTest
{
    @Inject(method = "loadEulaStatus", at = @At("HEAD"), cancellable = true)
    private void onLoadEULAFile(CallbackInfoReturnable<Boolean> cir)
    {
        cir.setReturnValue(true);
    }

    @Inject(method = "hasAcceptedEULA", at = @At("HEAD"), cancellable = true)
    private void onHasAcceptedEULA(CallbackInfoReturnable<Boolean> cir)
    {
        cir.setReturnValue(true);
    }
}
