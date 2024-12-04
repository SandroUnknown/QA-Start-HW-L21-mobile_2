package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:properties/project.properties"})

public interface CredentialsConfig extends Config {

    @Key("remoteUrl")
    @DefaultValue("https://hub-cloud.browserstack.com/wd/hub")
    String getRemoteUrl();

    @Key("user")
    @DefaultValue("alex_qN6X0H")
    String getUser();

    @Key("key")
    @DefaultValue("r9siN8SFjHzuw37LHuDc")
    String getKey();
}
