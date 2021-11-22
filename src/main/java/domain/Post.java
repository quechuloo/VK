package domain;

public class Post {

    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyPostId;
    private int friendsOnly;
    private CommentsInfo CommentsInfo;
    private Copyright Copyright;
    private Like Like;
    private Repost repost;
    private Views view;
    private String postType;
    private PostSource postSource;
    private int singerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;

    public void setid() {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setownerId() {
        this.ownerId = ownerId;
    }

    public int getownerId() {
        return ownerId;
    }

    public void setfromId() {
        this.fromId = fromId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setcreatedBy() {
        this.createdBy = createdBy;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setdate() {
        this.date = date;
    }

    public int getdate() {
        return date;
    }

    public void settext() {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setreplyPostId() {
        this.replyPostId = replyPostId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setFriendsOnly() {
        this.friendsOnly = friendsOnly;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setCommentsInfo() {
        this.CommentsInfo = CommentsInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return CommentsInfo;
    }

    public void setCopyright() {
        this.Copyright = Copyright;
    }

    public Copyright getCopyright() {
        return Copyright;
    }

    public void setLike() {
        this.Like = Like;
    }

    public Like getLike() {
        return Like;
    }

    public void setRepost(Repost repost) {
        this.repost = repost;
    }

    public Repost getRepost() {
        return repost;
    }

    public void setView(Views view) {
        this.view = view;
    }

    public Views getView() {
        return view;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public PostSource getPostSource() {
        return postSource;
    }


    public void setSingerId() {
        this.singerId = singerId;
    }

    public int getSingerId() {
        return singerId;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public int getPostponedId() {
        return postponedId;
    }

}
