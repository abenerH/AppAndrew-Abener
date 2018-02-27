package overtime.andrew.abener.cristhel.workofart.theattemptofthespacetraveler.Class;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by thech on 24/2/2018.
 */

public class Character implements Parcelable {

    public Character(String url, Id od, int id, String name, String description, int age, float height, float weight, String fraction, int rankting) {
        this.url = url;
        this.od = od;
        this.id = id;
        this.name = name;
        this.description = description;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.fraction = fraction;
        this.rankting = rankting;
    }

    private String url;
    private Id od;
    private int id;
    private String name;
    private String description;
    private int age;
    private float height;
    private float weight;
    private String fraction;
    private int rankting;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Id getOd() {
        return od;
    }

    public void setOd(Id od) {
        this.od = od;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getFraction() {
        return fraction;
    }

    public void setFraction(String fraction) {
        this.fraction = fraction;
    }

    public int getRankting() {
        return rankting;
    }

    public void setRankting(int rankting) {
        this.rankting = rankting;
    }

    @Override
    public String toString() {
        return "character{" +
                ", url='" + url + '\'' +
                " id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", fraction='" + fraction + '\'' +
                ", rankting=" + rankting +
                '}';
    }


    //PARSER METHODS


    protected Character(Parcel in) {
        url = in.readString();
        id = in.readInt();
        name = in.readString();
        description = in.readString();
        age = in.readInt();
        height = in.readFloat();
        weight= in.readFloat();
        fraction = in.readString();
        rankting = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }



    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(url);
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeString(description);
        dest.writeInt(age);
        dest.writeFloat(height);
        dest.writeFloat(weight);
        dest.writeString(fraction);
        dest.writeInt(rankting);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Character> CREATOR = new Parcelable.Creator<Character>() {
        @Override
        public Character createFromParcel(Parcel in) {
            return new Character(in);
        }

        @Override
        public Character[] newArray(int size) {
            return new Character[size];
        }
    };
}
