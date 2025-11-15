package test;

public enum CommonObjects {

    DEV_ENV("https://google.com"),
    PROD_ENV("https://google.com"),
    STAGING_ENV("https://google.com"),
    TEST_ENV("https://google.com");

    private final String url;

    CommonObjects(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

}

class runnerexample {
    public static void main(String[] args) {
        System.out.println(CommonObjects.DEV_ENV.getUrl());
        System.out.println(CommonObjects.PROD_ENV.getUrl());
        System.out.println(CommonObjects.STAGING_ENV.getUrl());
        System.out.println(CommonObjects.TEST_ENV.getUrl());
    }
}
