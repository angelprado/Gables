package com.grabriel.aprado.gables;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.grabriel.aprado.gables.ItemCategoryFragment.OnListFragmentInteractionListener;
import com.grabriel.aprado.gables.dummy.DummyContent.DummyItem;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class ItemCategoryRVAdapter extends RecyclerView.Adapter<ItemCategoryRVAdapter.ViewHolder> {

    private final List<CategoryItem> mValues;
    private final OnListFragmentInteractionListener mListener;
    private final Context context;
    public ItemCategoryRVAdapter(List<CategoryItem> items, OnListFragmentInteractionListener listener ,Context context) {
        mValues = items;
        mListener = listener;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_itemcategory, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);

        Glide
                .with(context)
                .load(holder.mItem.getImagecategory())
                .priority(Priority.IMMEDIATE)
                .placeholder(R.drawable.ic_home_black_24dp)
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.mIdView);

        holder.mContentView.setText(holder.mItem.getCategory());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {

                    Context context = v.getContext();
                    Intent intent = new Intent(context, ItemDetailActivity.class);
                    intent.putExtra("category", holder.mItem.getCategory());
//                    intent.putExtra("direc", holder.mItem.getDirreccion().toString());
//                    intent.putExtra("horario", holder.mItem.getHorario().toString());
//                    intent.putExtra("tlfn", holder.mItem.getTelefno().toString());
//                    intent.putExtra("image", holder.mItem.getMyimag().trim());

                    context.startActivity(intent);
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
        public final ImageView mIdView;
        public final TextView mContentView;
        public CategoryItem mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (ImageView) view.findViewById(R.id.id);
            mContentView = (TextView) view.findViewById(R.id.content);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}
