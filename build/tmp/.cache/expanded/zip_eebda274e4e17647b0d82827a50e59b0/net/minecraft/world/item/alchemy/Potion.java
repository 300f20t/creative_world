package net.minecraft.world.item.alchemy;

import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;

public class Potion {
    @Nullable
    private final String name;
    private final ImmutableList<MobEffectInstance> effects;
    private final Holder.Reference<Potion> builtInRegistryHolder = BuiltInRegistries.POTION.createIntrusiveHolder(this);

    public static Potion byName(String p_43490_) {
        return BuiltInRegistries.POTION.get(ResourceLocation.tryParse(p_43490_));
    }

    public Potion(MobEffectInstance... p_43487_) {
        this(null, p_43487_);
    }

    public Potion(@Nullable String p_43484_, MobEffectInstance... p_43485_) {
        this.name = p_43484_;
        this.effects = ImmutableList.copyOf(p_43485_);
    }

    public String getName(String p_43493_) {
        return p_43493_ + (this.name == null ? BuiltInRegistries.POTION.getKey(this).getPath() : this.name);
    }

    public List<MobEffectInstance> getEffects() {
        return this.effects;
    }

    public boolean hasInstantEffects() {
        if (!this.effects.isEmpty()) {
            for(MobEffectInstance mobeffectinstance : this.effects) {
                if (mobeffectinstance.getEffect().isInstantenous()) {
                    return true;
                }
            }
        }

        return false;
    }

    @Deprecated
    public Holder.Reference<Potion> builtInRegistryHolder() {
        return this.builtInRegistryHolder;
    }
}
