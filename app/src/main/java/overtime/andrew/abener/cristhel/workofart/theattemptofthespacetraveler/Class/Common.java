package overtime.andrew.abener.cristhel.workofart.theattemptofthespacetraveler.Class;

import android.util.Log;

/**
 * Created by thech on 24/2/2018.
 */

public class Common {
    public static String DB_NAME = "zombiedb";
    public static String COLLECTION_NAME = "characters";
    public static String API_KEY = "ydJ7b818ogwofiTxzmsdCo7i5k2cGis3";

    public static String getAddresSingle(Character character){
        String baseUrl = String.format("https://api.mlab.com/api/1/databases/%s/collections/%s", DB_NAME, COLLECTION_NAME);
        StringBuilder stringBuilder = new StringBuilder(baseUrl);
        stringBuilder.append("/"+character.getOd().getOid()+"?apiKey="+API_KEY);
        return stringBuilder.toString();
    }

    public static String getAddressAPI(){
        Log.i("Rocket", "Ready to be shooooooooooooooooooooooooooooooooooooooooooooot");
        String baseUrl = String.format("https://api.mlab.com/api/1/databases/%s/collections/%s",DB_NAME,COLLECTION_NAME);

        Log.i("Rocket", "Ready to be shooooooooooooooooooooooooooooooooooooooooooooot 111111111111111111111111111111");StringBuilder stringBuilder = new StringBuilder(baseUrl);
        stringBuilder.append("?apiKey="+API_KEY);
        Log.i("Rocket", "Ready to be shooooooooooooooooooooooooooooooooooooooooooooot 222222222222222222");
        return stringBuilder.toString();
    }

}
