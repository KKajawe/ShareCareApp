package com.example.sharecareapp.model


import com.google.gson.annotations.SerializedName

data class UserItemX(
    @SerializedName("avatar_url")
    var avatarUrl: String?,
    @SerializedName("bio")
    var bio: Any?,
    @SerializedName("blog")
    var blog: String?,
    @SerializedName("company")
    var company: String?,
    @SerializedName("created_at")
    var createdAt: String?,
    @SerializedName("email")
    var email: Any?,
    @SerializedName("events_url")
    var eventsUrl: String?,
    @SerializedName("followers")
    var followers: Int?,
    @SerializedName("followers_url")
    var followersUrl: String?,
    @SerializedName("following")
    var following: Int?,
    @SerializedName("following_url")
    var followingUrl: String?,
    @SerializedName("gists_url")
    var gistsUrl: String?,
    @SerializedName("gravatar_id")
    var gravatarId: String?,
    @SerializedName("hireable")
    var hireable: Any?,
    @SerializedName("html_url")
    var htmlUrl: String?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("location")
    var location: String?,
    @SerializedName("login")
    var login: String?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("node_id")
    var nodeId: String?,
    @SerializedName("organizations_url")
    var organizationsUrl: String?,
    @SerializedName("public_gists")
    var publicGists: Int?,
    @SerializedName("public_repos")
    var publicRepos: Int?,
    @SerializedName("received_events_url")
    var receivedEventsUrl: String?,
    @SerializedName("repos_url")
    var reposUrl: String?,
    @SerializedName("site_admin")
    var siteAdmin: Boolean?,
    @SerializedName("starred_url")
    var starredUrl: String?,
    @SerializedName("subscriptions_url")
    var subscriptionsUrl: String?,
    @SerializedName("twitter_username")
    var twitterUsername: String?,
    @SerializedName("type")
    var type: String?,
    @SerializedName("updated_at")
    var updatedAt: String?,
    @SerializedName("url")
    var url: String?
)