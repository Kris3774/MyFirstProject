package infrastructura;

import infrastructura.config.ConfigurationManager;

public class TestServer {
    public String getUrl() {
        String testEnvironment = ConfigurationManager.getInstance().getTestEnvironment();
        switch (testEnvironment) {
            case "qa_env":
                return "https://bugsmanager.herokuapp.com/";
            case "prod_env":
                return "http://prod.env.mycite.com";
            case "staging_env":
                return "http://staging.env.mycite.com";
            default:
                return "";
        }
    }
}
