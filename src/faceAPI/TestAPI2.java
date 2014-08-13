package faceAPI;

import java.net.URL;
import java.util.List;

import com.restfb.types.Post.Likes;

import facebook4j.Comment;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Like;
import facebook4j.PagableList;
import facebook4j.Paging;
import facebook4j.Post;
import facebook4j.Post.Property;
import facebook4j.Reading;
import facebook4j.ResponseList;
import facebook4j.User;
import facebook4j.auth.AccessToken;

public class TestAPI2 {

	public static void main(String[] args) throws FacebookException {

	    // Generate facebook instance.
	    Facebook facebook = new FacebookFactory().getInstance();
	    // Use default values for oauth app id.
	    facebook.setOAuthAppId("", "");
	    // Get an access token from: 
	    // https://developers.facebook.com/tools/explorer
	    // Copy and paste it below.
	    String accessTokenString = "CAACEdEose0cBADQg8YbXhcN4BgxqVjgha6DChPugJJ7dKdzP10ZCUCX6ayiB9vmgehWYynuUyfue9c3cML2WshCSIcS7YD66ZCsJMXs05avcpOVkQTD5gZAeoueJ3ga3xdaOEh4ZBMH6g2fRnxqmB8QuhBS1XtCwJ9iKrdPN3Hj4hTdC7l5rCKWyTUZCCgfFdXjSBOSfx6iE0cGCOZCMq2";
	    AccessToken at = new AccessToken(accessTokenString);
	    // Set access token.
	    facebook.setOAuthAccessToken(at);

	    
	    ResponseList<Post> results = facebook.searchPosts("eduardo campos",  new Reading().limit(60));
	    System.out.println(results.size());
	    for (int i = 0; i < results.size(); i++) {
	    	
            Post post = results.get(i);
            System.out.println("___________________________________________________________________");
            System.out.println("Message: "+ post.getMessage());
            System.out.println("Caption: "+ post.getCaption());
            System.out.println("Name: "+ post.getFrom().getName());
            System.out.println("ID: "+ post.getFrom().getId());
            System.out.println("Create: "+ post.getCreatedTime().toString());
            System.out.println("Description:"+ post.getDescription());
              
           
	    	
	    }
	    
	    
	}
	
}
