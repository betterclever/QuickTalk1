
package me.betterclever.quicktalk1.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GithubUser {
    
    @SerializedName("login")
    @Expose
    private String login;
    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("gravatar_id")
    @Expose
    private String gravatarId;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("followers_url")
    @Expose
    private String followersUrl;
    @SerializedName("following_url")
    @Expose
    private String followingUrl;
    @SerializedName("gists_url")
    @Expose
    private String gistsUrl;
    @SerializedName("starred_url")
    @Expose
    private String starredUrl;
    @SerializedName("subscriptions_url")
    @Expose
    private String subscriptionsUrl;
    @SerializedName("organizations_url")
    @Expose
    private String organizationsUrl;
    @SerializedName("repos_url")
    @Expose
    private String reposUrl;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;
    @SerializedName("received_events_url")
    @Expose
    private String receivedEventsUrl;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("site_admin")
    @Expose
    private Boolean siteAdmin;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("company")
    @Expose
    private String company;
    @SerializedName("blog")
    @Expose
    private Object blog;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("hireable")
    @Expose
    private Boolean hireable;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("public_repos")
    @Expose
    private Long publicRepos;
    @SerializedName("public_gists")
    @Expose
    private Long publicGists;
    @SerializedName("followers")
    @Expose
    private Long followers;
    @SerializedName("following")
    @Expose
    private Long following;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    
    /**
     * No args constructor for use in serialization
     */
    public GithubUser() {
    }
    
    /**
     * @param eventsUrl
     * @param location
     * @param publicRepos
     * @param type
     * @param blog
     * @param gravatarId
     * @param subscriptionsUrl
     * @param id
     * @param following
     * @param followers
     * @param htmlUrl
     * @param createdAt
     * @param avatarUrl
     * @param name
     * @param followingUrl
     * @param login
     * @param starredUrl
     * @param siteAdmin
     * @param gistsUrl
     * @param url
     * @param updatedAt
     * @param followersUrl
     * @param reposUrl
     * @param hireable
     * @param bio
     * @param publicGists
     * @param email
     * @param receivedEventsUrl
     * @param company
     * @param organizationsUrl
     */
    public GithubUser(String login, Long id, String avatarUrl, String gravatarId, String url, String htmlUrl, String followersUrl, String followingUrl, String gistsUrl, String starredUrl, String subscriptionsUrl, String organizationsUrl, String reposUrl, String eventsUrl, String receivedEventsUrl, String type, Boolean siteAdmin, String name, String company, Object blog, String location, String email, Boolean hireable, String bio, Long publicRepos, Long publicGists, Long followers, Long following, String createdAt, String updatedAt) {
        super();
        this.login = login;
        this.id = id;
        this.avatarUrl = avatarUrl;
        this.gravatarId = gravatarId;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.followersUrl = followersUrl;
        this.followingUrl = followingUrl;
        this.gistsUrl = gistsUrl;
        this.starredUrl = starredUrl;
        this.subscriptionsUrl = subscriptionsUrl;
        this.organizationsUrl = organizationsUrl;
        this.reposUrl = reposUrl;
        this.eventsUrl = eventsUrl;
        this.receivedEventsUrl = receivedEventsUrl;
        this.type = type;
        this.siteAdmin = siteAdmin;
        this.name = name;
        this.company = company;
        this.blog = blog;
        this.location = location;
        this.email = email;
        this.hireable = hireable;
        this.bio = bio;
        this.publicRepos = publicRepos;
        this.publicGists = publicGists;
        this.followers = followers;
        this.following = following;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getAvatarUrl() {
        return avatarUrl;
    }
    
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
    
    public String getGravatarId() {
        return gravatarId;
    }
    
    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }
    
    public String getUrl() {
        return url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    public String getHtmlUrl() {
        return htmlUrl;
    }
    
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }
    
    public String getFollowersUrl() {
        return followersUrl;
    }
    
    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }
    
    public String getFollowingUrl() {
        return followingUrl;
    }
    
    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }
    
    public String getGistsUrl() {
        return gistsUrl;
    }
    
    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }
    
    public String getStarredUrl() {
        return starredUrl;
    }
    
    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }
    
    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }
    
    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }
    
    public String getOrganizationsUrl() {
        return organizationsUrl;
    }
    
    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }
    
    public String getReposUrl() {
        return reposUrl;
    }
    
    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }
    
    public String getEventsUrl() {
        return eventsUrl;
    }
    
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }
    
    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }
    
    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public Boolean getSiteAdmin() {
        return siteAdmin;
    }
    
    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCompany() {
        return company;
    }
    
    public void setCompany(String company) {
        this.company = company;
    }
    
    public Object getBlog() {
        return blog;
    }
    
    public void setBlog(Object blog) {
        this.blog = blog;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Boolean getHireable() {
        return hireable;
    }
    
    public void setHireable(Boolean hireable) {
        this.hireable = hireable;
    }
    
    public String getBio() {
        return bio;
    }
    
    public void setBio(String bio) {
        this.bio = bio;
    }
    
    public Long getPublicRepos() {
        return publicRepos;
    }
    
    public void setPublicRepos(Long publicRepos) {
        this.publicRepos = publicRepos;
    }
    
    public Long getPublicGists() {
        return publicGists;
    }
    
    public void setPublicGists(Long publicGists) {
        this.publicGists = publicGists;
    }
    
    public Long getFollowers() {
        return followers;
    }
    
    public void setFollowers(Long followers) {
        this.followers = followers;
    }
    
    public Long getFollowing() {
        return following;
    }
    
    public void setFollowing(Long following) {
        this.following = following;
    }
    
    public String getCreatedAt() {
        return createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    
    public String getUpdatedAt() {
        return updatedAt;
    }
    
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
    
}