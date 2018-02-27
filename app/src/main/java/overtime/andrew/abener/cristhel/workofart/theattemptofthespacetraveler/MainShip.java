package overtime.andrew.abener.cristhel.workofart.theattemptofthespacetraveler;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ListView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import overtime.andrew.abener.cristhel.workofart.theattemptofthespacetraveler.Class.Character;
import overtime.andrew.abener.cristhel.workofart.theattemptofthespacetraveler.Class.Common;
import overtime.andrew.abener.cristhel.workofart.theattemptofthespacetraveler.Class.HTTPDataHandler;

public class MainShip extends AppCompatActivity {

    ListView listView;
    RecyclerView recyclerView;
    List<Character> characters = new ArrayList<Character>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);

        setContentView(R.layout.activity_main_ship);
        recyclerView = (RecyclerView) findViewById(R.id.rv);
//listView = (ListView) findViewById(R.id.lv);
        Log.i("0", "Step LAUNCHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIING");
        new GetData().execute(Common.getAddressAPI());
        Log.i("1", "Step INITIATEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");

    }

    //functions
    class GetData extends AsyncTask<String, Void, String>{
        ProgressDialog pd = new ProgressDialog(MainShip.this);



        @Override
        protected void onPreExecute(){
            super.onPreExecute();
            //Pre Process
            Log.i("Rocket", "Ready to be shooooooooooooooooooooooooooooooooooooooooooooot where am iiiiiiiiiiiiiiiiiiiiiiiii");
            pd.setTitle("Please wait...");
            pd.show();
            Log.i("2", "Step");
        }

        @Override
        protected String doInBackground(String... strings) {
            //Running process...
            String stream = null;
            String urlString = strings[0];
            HTTPDataHandler http = new HTTPDataHandler();
            stream = http.GetHTTPData(urlString);
            return stream;

        }

        @Override
        protected void onPostExecute(String s){
            super.onPostExecute(s);
            //Done process

            //Use gson to parse files
            Gson gson = new Gson();
            Type listType = new TypeToken<List<Character>>(){}.getType();
            characters = gson.fromJson(s, listType);//Parse to list
            LinearLayoutManager layout = new LinearLayoutManager(getApplicationContext());
            layout.setOrientation(LinearLayoutManager.VERTICAL);
            Log.i("3", "Step");
            Adapter2 adapter = new Adapter2(getApplicationContext(), characters);
            Log.i("4", "Step");
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(layout);
            recyclerView.setAdapter(adapter);
            pd.dismiss();

        }
    }

}
