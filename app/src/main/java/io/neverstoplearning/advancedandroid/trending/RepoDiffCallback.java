package io.neverstoplearning.advancedandroid.trending;

import android.support.v7.util.DiffUtil;

import java.util.List;

import io.neverstoplearning.advancedandroid.models.Repo;

class RepoDiffCallback extends DiffUtil.Callback {

    private List<Repo> oldList;
    private List<Repo> newList;

    public RepoDiffCallback(List<Repo> data, List<Repo> repos) {
        this.oldList = data;
        this.newList = repos;
    }

    @Override
    public int getOldListSize() {
        return oldList.size();
    }

    @Override
    public int getNewListSize() {
        return newList.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return oldList.get(oldItemPosition).id() == newList.get(newItemPosition).id();
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return oldList.get(oldItemPosition).equals(newList.get(newItemPosition));
    }
}
