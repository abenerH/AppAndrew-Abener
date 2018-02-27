package overtime.andrew.abener.cristhel.workofart.theattemptofthespacetraveler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import overtime.andrew.abener.cristhel.workofart.theattemptofthespacetraveler.Class.Character;

/**
 * Created by thech on 25/2/2018.
 */

public class Adapter2 extends RecyclerView.Adapter<Adapter2.MyViewHolder>{

    private LayoutInflater inflater;
    private Context context;
    private List<Character> listCharacters;


    public Adapter2(Context context, List<Character> listCharacters) {
        inflater = LayoutInflater.from(context);
        this.context = context;
        this.listCharacters = listCharacters;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.card, parent, false);

        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.characterName.setText(listCharacters.get(position).getName());
        holder.characterDescription.setText(listCharacters.get(position).getDescription());
        try{
            holder.characterImage.setImageURI(listCharacters.get(position).getUrl());
            Log.i("Marco", "heeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeere");
        }catch (Exception e){Log.i("Polo", "heeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeere");}

    }


    public Object getItem(int position) {
        return listCharacters.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return listCharacters.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {

        TextView characterName, characterDescription;
        SimpleDraweeView characterImage;

        public MyViewHolder(View itemView) {

            super(itemView);
            characterName = (TextView)itemView.findViewById(R.id.characterName);
            characterDescription = (TextView) itemView.findViewById(R.id.characterDescription);
            characterImage = (SimpleDraweeView) itemView.findViewById(R.id.characterImage);
        }
    }
}