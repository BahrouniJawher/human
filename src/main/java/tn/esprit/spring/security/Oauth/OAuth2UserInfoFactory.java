package tn.esprit.spring.security.Oauth;

import java.util.Map;

import tn.esprit.spring.entity.User.AuthProvider;



public class OAuth2UserInfoFactory {
	
	 public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
	        if(registrationId.equalsIgnoreCase(AuthProvider.google.toString())) {
	            return new GoogleOAuth2UserInfo(attributes);
	        }  else if (registrationId.equalsIgnoreCase(AuthProvider.github.toString())) {
	            return new GithubOAuth2UserInfo(attributes);
	        } else {
	            throw new OAuth2AuthenticationProcessingException("Sorry! Login with " + registrationId + " is not supported yet.");
	        }
	    }

}
