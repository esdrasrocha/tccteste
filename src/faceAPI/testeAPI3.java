package faceAPI;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Post;
import facebook4j.Reading;
import facebook4j.ResponseList;
import facebook4j.User;
import facebook4j.auth.AccessToken;

public class testeAPI3 {

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
	    
	   
	    User results = facebook.getUser("esdds");
	    System.out.println(results.getName());
	    System.out.println(results.getGender());
	    System.out.println(results.getBirthday());
            
              
           
	    	
	    }
	    
	}
	

