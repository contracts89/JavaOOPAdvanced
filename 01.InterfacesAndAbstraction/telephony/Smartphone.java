package telephony;

/**
 * Created by Radoslav on 25.7.2016 г..
 */
public class Smartphone implements Call, BrowseWeb {

    public Smartphone() {
    }

    @Override
    public String call(String phoneNumber) {
        if(phoneNumber.matches("\\d*")){
            return String.format("Calling... %s", phoneNumber);
        }
        throw new IllegalArgumentException("Invalid number!");
    }

    @Override
    public String browseWeb(String website) {
        if(website.matches("\\D*")){
            return String.format("Browsing: %s!", website);
        }
        throw new IllegalArgumentException("Invalid URL!");
    }
}
