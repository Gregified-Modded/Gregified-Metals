package com.therealm18studios.gregifiedmetals.config;

import com.therealm18studios.gregifiedmetals.GM;
import dev.toma.configuration.Configuration;
import dev.toma.configuration.config.Config;
import dev.toma.configuration.config.Configurable;
import dev.toma.configuration.config.format.ConfigFormats;

@Config(id = GM.MOD_ID)
public class GMConfigHolder {
    public static GMConfigHolder INSTANCE;

    public static void init() {
        INSTANCE = Configuration.registerConfig(GMConfigHolder.class, ConfigFormats.yaml()).getConfigInstance();
    }
    @Configurable
    public GMConfigHolder.ChooseDifficulty chooseDifficulty = new GMConfigHolder.ChooseDifficulty();
    public static class ChooseDifficulty {
        @Configurable
        public ChooseDifficulty.Easy easy = new ChooseDifficulty.Easy();

        public static class Easy{
            @Configurable
            @Configurable.Comment({"Whether to harden AE2WTLib recipes.", "Default: true"})
            public boolean Buckets = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Applied Botanics recipes.", "Default: true"})
            public boolean Armors = true; // default true
        }
        @Configurable
        public ChooseDifficulty.Normal normal = new ChooseDifficulty.Normal();

        public static class Normal{
            @Configurable
            @Configurable.Comment({"Whether to harden AE2WTLib recipes.", "Default: true"})
            public boolean Buckets = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Applied Botanics recipes.", "Default: true"})
            public boolean Armors = true; // default true
        }
        @Configurable
        public ChooseDifficulty.Hard hard = new ChooseDifficulty.Hard();

        public static class Hard{
            @Configurable
            @Configurable.Comment({"Whether to harden AE2WTLib recipes.", "Default: true"})
            public boolean Buckets = true; // default true
            @Configurable
            @Configurable.Comment({"Whether to harden Applied Botanics recipes.", "Default: true"})
            public boolean Armors = true; // default true
        }
    }
}
