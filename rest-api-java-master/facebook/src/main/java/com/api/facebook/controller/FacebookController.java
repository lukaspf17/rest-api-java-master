package com.api.facebook.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.facebook.api.Account;
import org.springframework.social.facebook.api.Album;
import org.springframework.social.facebook.api.GroupMembership;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.social.facebook.api.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.facebook.service.FacebookService;

@RestController
@RequestMapping("/")
public class FacebookController {
	
	@Autowired
	private FacebookService facebookService;
	
	@GetMapping
	public List<String> welcome() {
		List<String> urls = new ArrayList<String>();
		urls.add("http://localhost:8080/generateFacebookAuthorizeUrl");
		urls.add("http://localhost:8080/getUserData");
		urls.add("http://localhost:8080/getUserFeed");
		urls.add("http://localhost:8080/getUserAlbum");
		urls.add("http://localhost:8080/getUserAccounts");
		urls.add("http://localhost:8080/getUserGroupMembership");
		return urls;
	}
	
	@GetMapping("/generateFacebookAuthorizeUrl")
	public String generateFacebookAuthorizeUrl() {
		return facebookService.generateFacebookAuthorizeUrl();
	}
	
	@GetMapping("/facebook")
	public void generateFacebookAccessToken(@RequestParam("code") String code) {
		facebookService.generateFacebookAccessToken(code);
	}
	
	@GetMapping("/getUserData")
	public String getUserData() {
		return facebookService.getUserData();
	}
	
	@GetMapping("/getUserFeed")
	public PagedList<Post> getUserFeed() {
		return facebookService.getUserFeed();
	}
	
	@GetMapping("/getUserAlbum")
	public PagedList<Album> getUserAlbum() {
		return facebookService.getUserAlbum();
	}
	
	@GetMapping("/getUserAccounts")
	public PagedList<Account> getUserAccounts() {
		return facebookService.getUserAccounts();
	}
	
	@GetMapping("/getUserAccounts/{accountId}")
	public Account getUserAccount(@PathVariable String accountId) {
		return facebookService.getUserAccount(accountId);
	}
	
	@GetMapping("/getUserGroupMembership")
	public PagedList<GroupMembership> getUserGroupMembership() {
		return facebookService.getUserGroupMembership();
	}
	
}
