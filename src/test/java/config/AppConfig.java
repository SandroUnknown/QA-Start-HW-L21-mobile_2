package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:properties/project.properties"})

public interface AppConfig extends Config {

    @Key("app")
    @DefaultValue("bs://sample.app")
    String getApp();

    @Key("projectName")
    @DefaultValue("First Java Project")
    String getProjectName();

    @Key("buildName")
    @DefaultValue("browserstack-build-1")
    String getBuildName();

    @Key("testName")
    @DefaultValue("My First Test")
    String getTestName();
}