package com.olyx.mod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OlyxConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<String> GROQ_API_KEY;

    static {
        BUILDER.push("Olyx AI Settings");
        GROQ_API_KEY = BUILDER.comment("Groq API Key")
                .define("groqApiKey", "BURAYA_GROQ_API_KEY_YAZILACAK");
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
