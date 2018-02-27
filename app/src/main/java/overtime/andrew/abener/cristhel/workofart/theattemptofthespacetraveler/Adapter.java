package overtime.andrew.abener.cristhel.workofart.theattemptofthespacetraveler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import overtime.andrew.abener.cristhel.workofart.theattemptofthespacetraveler.Class.Character;
/**
 * Created by thech on 25/2/2018.
 */

public class Adapter extends BaseAdapter {

    private Context mContext;
    private List<Character> listCharacters;

    public Adapter(Context mContext, List<Character> list) {
        this.mContext = mContext;
        this.listCharacters = list;
    }

    @Override
    public int getCount() {
        return listCharacters.size();
    }

    @Override
    public Object getItem(int position) {
        return listCharacters.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.card,null);
        TextView txtName = (TextView) view.findViewById(R.id.characterName);
        TextView txtDescription = (TextView) view.findViewById(R.id.characterDescription);

        txtName.setText(listCharacters.get(position).getName());
        txtDescription.setText(listCharacters.get(position).getDescription());
        return view;
    }
}
