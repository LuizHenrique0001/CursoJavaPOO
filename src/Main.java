
import Entity.Post;

import java.time.Instant;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Title:");
        String title = sc.nextLine();
        System.out.print("Enter content:");
        String content = sc.nextLine();

        System.out.println("Would you like to leave a comment on this post? y/n");
        char initialComment = sc.nextLine().charAt(0);

        Post post = new Post(Instant.now(),title,0);
        if (initialComment == 'y'){
            System.out.println("How many comments would you like to make on this post?");
            int numberComments = sc.nextInt();
            sc.nextLine();

            for (int i=1; i<=numberComments; i++){
                System.out.print("Enter the #"+ i +" comment:");
                String comment = sc.nextLine();
                post.AddComment(comment);

            }
        }

        System.out.println("Would you like to like your own post? y/n");
        char initialLike = sc.nextLine().charAt(0);
        if (initialLike == 'y'){
            post.AddLike();
        }

        System.out.print(post);

        sc.close();

    }
}