package utilities;

import org.apache.commons.lang3.StringUtils;

import java.util.Map;

public class SiteUtils {

    private static String baseUrl;
    private static Map<String, String> siteUrls;
    private static Map<String, String> sites;
    private static SiteUtils instance;

    static {
        YamlReader.setProperties(SiteUtils.class, "sites.yml");
    }

    public static SiteUtils instance() {
        if(instance == null) {
            instance = new SiteUtils();
        }
        return instance;
    }

    public String getBaseUrl() {return baseUrl;}

    public void setBaseUrl(String baseUrl) {SiteUtils.baseUrl = baseUrl;}

    public Map<String, String> getSiteUrls() {
        return siteUrls;
    }

    public void setSiteUrls(Map<String, String> baseUrls) {
        SiteUtils.siteUrls = baseUrls;
    }

    public Map<String, String> getSites() {return sites;}

    public void setSites(Map<String, String> sites) {SiteUtils.sites = sites;}

    public String getCurrentSite() {
        return this.getSites().get(StringUtils.defaultIfBlank(System.getProperty("site-id"), "AR"));
    }

    public String getCurrentSiteUrl() {
        return this.getSiteUrls().get(StringUtils.defaultIfBlank(System.getProperty("site-id"), "AR"));
    }
}
