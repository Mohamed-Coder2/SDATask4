import Controller.PostController;
import Model.Post;
import View.PostView;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Post post = new Post();
        PostView postView = new PostView();
        PostController controller = new PostController(post, postView);

        System.out.println("Press 1 to like the post. Press 'q' to quit.");

        while (true) {
            char input = (char) System.in.read();
            if (input == '1') {
                controller.addLike();
            } else if (input == 'q') {
                System.out.println("Exiting application.");
                break;
            }
        }
    }
}