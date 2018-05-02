package com.example.kimtaehyeong.myapplication;

        import android.content.Context;
        import android.graphics.drawable.Drawable;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.BaseAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;

        import java.util.ArrayList;

public class Adapter extends BaseAdapter
{
    private ArrayList<list_item> myItems=new ArrayList<>();
    @Override
    public int getCount() {return myItems.size();}

    @Override
    public list_item getItem(int position) {return myItems.get(position); }

    @Override
    public long getItemId(int position) { return 0; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context = parent.getContext();

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_layout, parent, false);
        }
        ImageView imageView = (ImageView)convertView.findViewById(R.id.custom_list_image);
        TextView textView = (TextView) convertView.findViewById(R.id.custom_list_title_main);

        list_item myItem = getItem(position);

        imageView.setImageDrawable(myItem.getIcon());
        textView.setText(myItem.getName());

        return convertView;
    }
    public void addItem(Drawable img, String name)
    {
        list_item myItem = new list_item();
        myItem.setIcon(img);
        myItem.setName(name);
        myItems.add(myItem);

    }

}
