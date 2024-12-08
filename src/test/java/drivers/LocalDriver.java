package drivers;


//public static CredentialsConfig credentialsConfig = ConfigFactory.create(CredentialsConfig.class, System.getProperties());
    //public static EnvironmentConfig environmentConfig = ConfigFactory.create(EnvironmentConfig.class, System.getProperties());
    //public static AppConfig appConfig = ConfigFactory.create(AppConfig.class, System.getProperties());

    //public class LocalDriver implements WebDriverProvider {

      /*  private static final TestEnvConfig testEnvConfig = ConfigFactory.create(TestEnvConfig.class, System.getProperties());
        public static final DeviceConfig deviceConfig = ConfigFactory.create(DeviceConfig.class, System.getProperties());
        public static final AppConfig appConfig = ConfigFactory.create(AppConfig.class, System.getProperties());




        public static EnvironmentConfig environmentConfig = ConfigFactory.create(EnvironmentConfig.class, System.getProperties());

        @Nonnull
        @Override
        public WebDriver createDriver(@Nonnull Capabilities capabilities) {

            UiAutomator2Options options = new UiAutomator2Options();

            options.setAutomationName(ANDROID_UIAUTOMATOR2)
                    .setPlatformName(ANDROID)
                    .setDeviceName(environmentConfig.getDevice())
                    .setPlatformVersion(environmentConfig.getVersion())
                    .setApp(getAppPath())
                    .setAppPackage(appConfig.getAppPackage())
                    .setAppActivity(appConfig.getAppActivity());

            return new AndroidDriver(getAppiumServerUrl(), options);
        }

        public static URL getAppiumServerUrl() {

            try {
                return new URL(testEnvConfig.getRemoteUrl());
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }

        private String getAppPath() {

            String appVersion = appConfig.getAppVersion();
            String appUrl = appConfig.getAppUrl() + appVersion;
            String appPath = appConfig.getAppPath() + appVersion;

            File app = new File(appPath);
            if (!app.exists()) {
                try (InputStream in = new URL(appUrl).openStream()) {
                    copyInputStreamToFile(in, app);
                } catch (IOException e) {
                    throw new AssertionError("Failed to download application", e);
                }
            }

            return app.getAbsolutePath();
        }*/
    //}