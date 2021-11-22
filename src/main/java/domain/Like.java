package domain;

public class Like {

    private int count;
    private int userLikes;
    private int canLike;
    private int canPublish;

    public void setCount() {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public void setCanLike() {
        this.canLike = canLike;
    }

    public int getCanLike() {
        return canLike;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }

    public int getCanPublish() {
        return canPublish;
    }

}
