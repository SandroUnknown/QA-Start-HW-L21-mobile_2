package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.AppConfig;
import config.CredentialsConfig;
import config.EnvironmentConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackDriver implements WebDriverProvider {

    //public static BrowserStackConfig bsConfig = ConfigFactory.create(BrowserStackConfig.class, System.getProperties());
    //public static DeviceConfig deviceConfig = ConfigFactory.create(DeviceConfig.class, System.getProperties());

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {

        CredentialsConfig credentialsConfig = ConfigFactory.create(CredentialsConfig.class, System.getProperties());
        EnvironmentConfig environmentConfig = ConfigFactory.create(EnvironmentConfig.class, System.getProperties());
        AppConfig appConfig = ConfigFactory.create(AppConfig.class, System.getProperties());


        MutableCapabilities caps = new MutableCapabilities();

        caps.setCapability("browserstack.user", credentialsConfig.getUser());
        caps.setCapability("browserstack.key", credentialsConfig.getKey());

        caps.setCapability("device", environmentConfig.getDevice());
        caps.setCapability("os_version", environmentConfig.getVersion());

        caps.setCapability("app", appConfig.getApp());

        caps.setCapability("project", appConfig.getProjectName());
        caps.setCapability("build", appConfig.getBuildName());
        caps.setCapability("name", appConfig.getTestName());

        try {
            return new RemoteWebDriver(
                    new URL(credentialsConfig.getRemoteUrl()), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }


    }
}
