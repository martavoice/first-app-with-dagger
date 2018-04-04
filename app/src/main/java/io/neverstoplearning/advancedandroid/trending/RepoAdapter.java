package io.neverstoplearning.advancedandroid.trending;

import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.neverstoplearning.advancedandroid.R;
import io.neverstoplearning.advancedandroid.models.Repo;

public class RepoAdapter extends RecyclerView.Adapter<RepoAdapter.RepoViewHolder> {

    private final RepoClickListener listener;
    private final List<Repo> data = new ArrayList<>();

    public RepoAdapter(RepoClickListener listener) {
        this.listener = listener;
        setHasStableIds(true);
    }

    @Override
    public RepoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_repo_list_item, parent, false);
        return new RepoViewHolder(itemView, listener);
    }

    @Override
    public void onBindViewHolder(RepoViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    void setData(List<Repo> repos) {
        if (repos != null) {
            DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(new RepoDiffCallback(data, repos));
            data.clear();
            data.addAll(repos);
            diffResult.dispatchUpdatesTo(this);
        }

    }

    class RepoViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_repo_name)
        TextView repoName;
        @BindView(R.id.tv_repo_description)
        TextView repoDescription;
        @BindView(R.id.tv_fork_count)
        TextView forkCount;
        @BindView(R.id.tv_star_count)
        TextView starCount;

        private Repo repo;
        private RepoClickListener listener;

        RepoViewHolder(View itemView, RepoClickListener listener) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(v -> {
                if (repo != null) {
                    listener.onRepoClicked(repo);
                }
            });
        }

        public void bind(Repo repo) {
            this.repo = repo;
            repoName.setText(repo.name());
            repoDescription.setText(repo.description());
            forkCount.setText(NumberFormat.getInstance().format(repo.forksCount()));
            starCount.setText(NumberFormat.getInstance().format(repo.stargazersCount()));
        }

    }

    interface RepoClickListener {
        void onRepoClicked(Repo repo);
    }
}
