package com.grabriel.aprado.gables;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link ItemListActivity}
 * in two-pane mode (on tablets) or a {@link ItemDetailActivity}
 * on handsets.
 */
public class ItemDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private FutureItem mItem;
    String mansage;
    String mansage2;
    String mansage3;
    String mansage4;
    String mansage5;
    String mansage6;
    String category;
    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemDetailFragment() {
    }
    ImageView imagen;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
//            mItem.setName(getArguments().getString(ARG_ITEM_ID));

            mansage = (getArguments().getString(ARG_ITEM_ID));
            mansage2 = (getArguments().getString("detai"));
            mansage3 = (getArguments().getString("imag"));
            mansage4 = (getArguments().getString("direc"));
            mansage5 = (getArguments().getString("horario"));
            mansage6 = (getArguments().getString("tlfn"));
            category = (getArguments().getString("category"));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);

            imagen= (ImageView) activity.findViewById(R.id.myimage);

            if (appBarLayout != null) {

//                new Loadata().execute("execute");
//                AsyncTask<String, Void, String> asi new AsyncTask<>() {
//                    @Override
//                    protected Object doInBackground(Object[] params) {
//                        return null;
//                    }
//                }
//                ImageView imageView = new ImageView(getActivity());
                Glide
                        .with(getActivity())
                        .load(mansage3.trim())
//                        .override(310, 150)
                        .centerCrop()
                        .priority(Priority.IMMEDIATE)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
//                        .placeholder( R.drawable.ic_home_black_24dp)
                        .into(imagen);
//                appBarLayout.setBackground(imageView);
                appBarLayout.setTitle(mansage);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_detail, container, false);

        // Show the dummy content as text in a TextView.
//        if (mItem != null) {
//            ((TextView) rootView.findViewById(R.id.item_detail)).setText(mItem.getName());
//        }


        TextView mg = (TextView)rootView.findViewById(R.id.item_detail);
        TextView direc = (TextView)rootView.findViewById(R.id.direccion);
        TextView horario = (TextView)rootView.findViewById(R.id.Horario);
        TextView tlfn = (TextView)rootView.findViewById(R.id.Teléfono);
        direc.setText(mansage4);
        horario.setText(mansage5);
        tlfn.setText(mansage6);
        mg.setText(mansage2);

        return rootView;
    }
//    public class Loadata extends AsyncTask<String, Void, String> {
//
//        @Override
//        protected String doInBackground(String... params) {
//
//            Glide
//                    .with(getActivity())
//                    .load(mansage3.trim().toString())
////                        .override(310, 150)
//                    .centerCrop()
//                    .placeholder( R.drawable.ic_home_black_24dp)
//                    .into(imagen);
////            for (int i = 0; i < 5; i++) {
////                try {
////                    Thread.sleep(1000);
////                } catch (InterruptedException e) {
////                    Thread.interrupted();
////                }
////            }
//            return "Execute";
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
}
