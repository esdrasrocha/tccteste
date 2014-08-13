package faceAPI;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.Page;
import com.restfb.types.Post;
import com.restfb.types.User;



public class TestApi {

	public static void main(String[] args) {
		
		FacebookClient facebookClient = new DefaultFacebookClient("CAACEdEose0cBAKglv0gFMLtmQSEHhdrnxqElfy5OAhdJ17au4oUje3ZC5HXjJFxdB3DhQF023aFf7cYZCSpBcspViM6BZBZAx04rEIoh8Rz64ZBtZCZCbQfkIZCMEKsEL7ZCy5Fx85aO1PtzhY51s9OKk46DNnPD2FHfJe1yatQOKr3WJ9FzZBYLrvtCl2ITFTZC51ZBSfZA2NzxrTtlg87FvDeAz");
		

		 Connection<Post> publicSearch = facebookClient.fetchConnection(
		            "search", Post.class,
		            Parameter.with("q", "puc"), Parameter.with("type", "post")
		        );
		        int size=publicSearch.getData().size();
		        for(int i=0;i<size;i++){
		            System.out.println("Message: " + publicSearch.getData().get(i).getMessage());   
		        }


	}

}
