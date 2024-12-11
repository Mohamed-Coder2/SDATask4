package Controller;

import Model.Post;
import View.PostView;

public class PostController {
    private Post post;
    private PostView postView;

    public PostController(Post model, PostView view) {
        this.post = model;
        this.postView = view;
    }

    public void addLike() {
        post.addLike();
        postView.displayLikes(post.getLikes());
    }
}
