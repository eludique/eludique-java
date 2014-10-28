package projet.java;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Toolbox {

	private Toolbox() {

	}
	
	/**
	 * Méthode qui hash une String en SHA-1
	 * @param key
	 * @return
	 */
	public static String hashSha1(String key) 
    { 
 
     byte[] uniqueKey = key.getBytes(); 
     byte[] hash = null; 
 
     try 
	 { 
        hash = MessageDigest.getInstance("SHA-1").digest(uniqueKey); //MD2, MD5, SHA-1, SHA-256, SHA-384, SHA-512
 
     } 
     catch (NoSuchAlgorithmException e) { 
        throw new Error("no SHA-1 support in this VM"); 
     }
     catch (Exception e) {
        e.printStackTrace();
     }
 
     StringBuffer hashString = new StringBuffer(); 
     for ( int i = 0; i < hash.length; ++i ) { 
        String hex = Integer.toHexString(hash[i]); 
        if ( hex.length() == 1 ) { 
         hashString.append('0'); 
         hashString.append(hex.charAt(hex.length()-1)); 
        } else { 
         hashString.append(hex.substring(hex.length()-2)); 
        } 
     } 
     return hashString.toString(); 
    }

}
