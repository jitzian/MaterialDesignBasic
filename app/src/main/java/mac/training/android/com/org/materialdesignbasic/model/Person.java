package mac.training.android.com.org.materialdesignbasic.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by raian on 23/10/16.
 */

public class Person extends BaseObservable{

    private String name;
    private String lastName;
    private String urlImg;

    public Person(String name, String lastName, String urlImg) {
        this.name = name;
        this.lastName = lastName;
        this.urlImg = urlImg;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    @BindingAdapter("bind:img_url")
    public static void loadUrlImg(ImageView view, String urlImg){
        Glide.with(view.getContext())
                .load(urlImg)
                .into(view);
    }

}
