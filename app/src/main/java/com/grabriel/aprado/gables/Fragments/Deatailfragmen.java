package com.grabriel.aprado.gables.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.grabriel.aprado.gables.FutureItem;
import com.grabriel.aprado.gables.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Deatailfragmen.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Deatailfragmen#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Deatailfragmen extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Deatailfragmen() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Deatailfragmen.
     */
    // TODO: Rename and change types and number of parameters
    public static Deatailfragmen newInstance(String param1, String param2) {
        Deatailfragmen fragment = new Deatailfragmen();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    public TextView mIdView;
    public TextView mContentView;
    public ImageView myimagen;
    public FutureItem mItem;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_deatailfragmen, container, false);

            myimagen = (ImageView)v.findViewById(R.id.imagen);
            mIdView = (TextView) v.findViewById(R.id.name);
            mContentView = (TextView) v.findViewById(R.id.descripcion);
           mIdView.setText(mParam1);
           mContentView.setText(mParam2);



//        FutureItem.getplacebyposition()
//        Course detailCourse = Courses.getCourseByPosition(position);
//        name.setText(detailCourse.getName());
//        description.setText(detailCourse.getDescription());
//        rating.setRating(detailCourse.getRating());
//        Glide.with(this)
//                .load(detailCourse.getIdImage())
//                .into(image);
//
//        FutureItem ft =  FutureItem.getplacebyposition(startPostponedEnterTransit   ion());
        return v;
    }


    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
