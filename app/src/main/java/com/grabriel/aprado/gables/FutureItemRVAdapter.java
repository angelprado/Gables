package com.grabriel.aprado.gables;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.grabriel.aprado.gables.Fragments.FutureItemFragment.OnListFragmentInteractionListener;
import com.grabriel.aprado.gables.dummy.DummyContent.DummyItem;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class FutureItemRVAdapter extends RecyclerView.Adapter<FutureItemRVAdapter.ViewHolder> {

    private final List<FutureItem> mValues;
    private final OnListFragmentInteractionListener mListener;

    private final Context context;
    public FutureItemRVAdapter(List<FutureItem> items, OnListFragmentInteractionListener listener , Context c ) {
        mValues = items;
        context = c;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
//        String url = murl


//        Glide.with(this)
//        .load("IMAGE URL HERE")
//        .placeholder(R.drawable.placeholder)
//        .error(R.drawable.imagenotfound)
//        .override(200, 200);
//        .centerCrop();
//        .into(imageView);
//        Glide
//                .with(context)
//                .load(holder.mItem.getMyimag().trim())
////                .override(310, 150)
//                .centerCrop()
////                .fitCenter()
//                .placeholder(R.drawable.ic_home_black_24dp)
//                .into(holder.myimagen);
        Glide
                .with(context)
                .load(holder.mItem.getMyimag().trim())
                .priority(Priority.IMMEDIATE)
                .placeholder(R.drawable.ic_home_black_24dp)
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.myimagen);

        holder.mIdView.setText(holder.mItem.getName());
        holder.mContentView.setText(holder.mItem.getDetail());

        holder.mView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (null != mListener) {


                    Context context = v.getContext();
                    Intent intent = new Intent(context, ItemDetailActivity.class);
                    intent.putExtra(ItemDetailFragment.ARG_ITEM_ID, holder.mIdView.getText().toString());
                    intent.putExtra("detail", holder.mItem.getDetail().toString());
                    intent.putExtra("direc", holder.mItem.getDirreccion().toString());
                    intent.putExtra("horario", holder.mItem.getHorario().toString());
                    intent.putExtra("tlfn", holder.mItem.getTelefno().toString());
                    intent.putExtra("image", holder.mItem.getMyimag().trim());

                    context.startActivity(intent);
//
////                    Intent i = new Intent(context,Deatailfragmen.class).putExtra("NAME",holder.mItem.getName());
////                    Log.i("TAG", i.toString());
//                    Deatailfragmen fragment =
//                                Deatailfragmen.newInstance(holder.mIdView.getText().toString(), holder.mItem.getDetail());
//
////                        FragmentManager fm = getSupportFragmentManager();
////                        FragmentTransaction ft = fm.beginTransaction();
////                        ft.replace(R.id.content, fragment);
////                        ft.commit();
//
//
//
////                    i.putExtra(OtherActivity.KEY_EXTRA, yourDataObject);
////                    context.startActivity(i);
//                    Toast.makeText(context, holder.mItem.getName(), Toast.LENGTH_SHORT).show();

                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mContentView;
        public final ImageView myimagen;
        public FutureItem mItem;

        public ViewHolder(View view) {
            super(view);
            myimagen = (ImageView)view.findViewById(R.id.imagen);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.name);
            mContentView = (TextView) view.findViewById(R.id.descripcion);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
//    private class Loadata extends AsyncTask<String, Void, String> {
//
//        @Override
//        protected String doInBackground(String... params) {
//
//            Glide
//                    .with(context)
//                    .load(mItem.getMyimag().trim())
////                .override(310, 150)
//                    .centerCrop()
////                .fitCenter()
//                    .placeholder(R.drawable.ic_home_black_24dp)
//                    .into(holder.myimagen);
////            for (int i = 0; i < 5; i++) {
////                try {
////                    Thread.sleep(1000);
////                } catch (InterruptedException e) {
////                    Thread.interrupted();
////                }
////            }
//            return "Executed";
//        }
//
//        @Override
//        protected void onPostExecute(String result) {
//
////            TextView txt = (TextView) findViewById(R.id.output);
////            txt.setText("Executed"); // txt.setText(result);
//            // might want to change "executed" for the returned string passed
//            // into onPostExecute() but that is upto you
//        }
//
//        @Override
//        protected void onPreExecute() {}
//
//        @Override
//        protected void onProgressUpdate(Void... values) {}
//    }
    private class Loadatas extends AsyncTask<String,Integer,String>{

        @Override
        protected String doInBackground(String... params) {
            return null;
        }
    }

}
