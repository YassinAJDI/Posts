package com.karntrehan.posts.list;

import com.karntrehan.posts.base.callback.StatefulCallback;
import com.karntrehan.posts.list.entity.Post;

import java.util.List;

/**
 * Created by karn on 03-06-2017.
 */

public interface ListContract {
    interface Presenter {
        void create();

        void setView(View view);

        void destroy();

        void getPosts();

        void postClicked(Post post);
    }

    interface View {
        void showLoading(boolean loading);

        void showPosts(List<Post> posts);
    }

    interface Model {
        void loadPosts(StatefulCallback<List<Post>> statefulCallback);
    }
}
