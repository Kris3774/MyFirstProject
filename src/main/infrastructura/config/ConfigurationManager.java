package infrastructura.config;


public class ConfigurationManager {
    private static ConfigurationManager instance;

    private ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public static String getEnvinromentVariableOrDefault(String envVar, String defaultValue) {
        String currentVarvalue = System.getenv(envVar);
        return currentVarvalue == null || currentVarvalue.isEmpty() ?
                defaultValue : currentVarvalue;
    }

    public BrowserType getTestBrowser() {

        return BrowserType.valueOf(getEnvinromentVariableOrDefault("browser", "chrome").toUpperCase());
    }

    public String getTestEnvironment() {
        return getEnvinromentVariableOrDefault("environment", "qa_env");
    }

    public String getCurrentEnvironment() {
        return getEnvinromentVariableOrDefault("runEnv", "local");
    }

    public RunOn getRunOn() {
        return RunOn.valueOf(getEnvinromentVariableOrDefault("runOn", "local").toUpperCase());
    }
    public String getLocale(){
        return getEnvinromentVariableOrDefault("local","en");
    }
    public String getRemoteHubUrl(){
        return getEnvinromentVariableOrDefault("hubUrl","http://hubUrl.");
    }



}






