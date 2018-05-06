package jeongmee.jeongmeetalk;

import android.graphics.drawable.Drawable;
import android.media.Image;

public class list_item {
    private Drawable profile;
    private  String name;
    private  String sub;

    public Drawable getProfile() { return profile;}
    public void setIcon(Drawable icon) {this.profile=profile;}

    public String getName() {return name;}
    public void setName(String name) {this.name=name;}

    public String getSub() {return sub=sub;}
    public void setSub(String sub) {this.sub=sub;}

}
