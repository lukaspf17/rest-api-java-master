package com.api.facebook.service;

import org.springframework.social.facebook.api.Account;
import org.springframework.social.facebook.api.Album;
import org.springframework.social.facebook.api.GroupMembership;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.social.facebook.api.Post;

public interface FacebookService {
	public String generateFacebookAuthorizeUrl();
	
	public void generateFacebookAccessToken(String code);
	
	public String getUserData();
	
	public PagedList<Post> getUserFeed();
	
	public PagedList<Album> getUserAlbum();
	
	public PagedList<Account> getUserAccounts();
	
	public Account getUserAccount(String accountId);
	
	public PagedList<GroupMembership> getUserGroupMembership();
}
