package Entity;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private Instant moment;
    private String title;
    private Integer likes;
    private List<Comment> comments = new ArrayList<Comment>();

    public Post(Instant moment, String title, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.likes = likes;
    }

    public Instant getMoment() {
        return moment;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLikes() {
        return likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void AddComment(String comment){
        this.comments.add(new Comment(comment));
    }

    public void AddLike(){
        this.likes+=1;
    }

    @Override
    public String toString() {
        return  moment.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) +
                ", "+ title +
                ", " + likes +
                ", " + comments;
    }

}
