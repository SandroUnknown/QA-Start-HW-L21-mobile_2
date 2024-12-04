package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:properties/${env}.properties"
})

public interface EnvironmentConfig extends Config {

    @Key("device")
    @DefaultValue("Samsung Galaxy S22 Ultra")
    String getDevice();

    @Key("osVersion")
    @DefaultValue("12.0")
    String getVersion();
}
