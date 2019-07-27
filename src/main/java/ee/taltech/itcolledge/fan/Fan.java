package ee.taltech.itcolledge.fan;

public class Fan {

    private String username;
    private String favoriteClub;

    public Fan(String username, String favoriteClub) {
        this.username = username;
        this.favoriteClub = favoriteClub;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFavoriteClub() {
        return favoriteClub;
    }

    public void setFavoriteClub(String favoriteClub) {
        this.favoriteClub = favoriteClub;
    }
}
