package io.neverstoplearning.advancedandroid.data;

import java.util.List;

import javax.inject.Inject;

import io.neverstoplearning.advancedandroid.models.Repo;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Марта on 20.03.2018.
 */

public class RepoRequester {
    private RepoService service;

    @Inject
    RepoRequester(RepoService repoService) {
        this.service = repoService;
    }

    public Single<List<Repo>> getTrendingRepos(){
        return service.getTrendingRepos()
                .map(TrendingReposResponse::repos)
                .subscribeOn(Schedulers.io());
    }
}
