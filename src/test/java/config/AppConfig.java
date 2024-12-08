package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:properties/${env}/${os}.properties"
})
public interface AppConfig extends Config {

    @Key("app")
    @DefaultValue("bs://sample.app")
    String getApp();
    //app=org.wikipedia.alpha



    @Key("activity")
    @DefaultValue("org.wikipedia.main.MainActivity")
    String getActivity();
    //activity=org.wikipedia.main.MainActivity

    // TODO: Получать версию из Дженкинса?
    @Key("version")
    @DefaultValue("version=app-alpha-universal-release.apk")
    String getVersion();
    //version=app-alpha-universal-release.apk

    @Key("url")
    @DefaultValue("https://github.com/wikimedia/apps-android-wikipedia/releases/download/latest/")
    String getUrl();
    //url=https://github.com/wikimedia/apps-android-wikipedia/releases/download/latest/

    @Key("path")
    @DefaultValue("src/test/resources/apps/")
    String getPath();
    //path=src/test/resources/apps/




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