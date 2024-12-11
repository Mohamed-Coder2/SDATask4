package Model;

import java.util.ArrayList;

public class Post {
    private ArrayList<Comment> comments = new ArrayList<Comment>();
    private int likes;

    public Post() {
        this.likes = 0;
    }

    public int getLikes() {
        return likes;
    }

    public void addLike() {
        likes++;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }
}
