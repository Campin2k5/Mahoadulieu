package sha_256;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class SHA_256 {
	    public static void main(String[] args) {
	        String input = "Nhập dữ liệu cần mã hóa: ";
	        System.out.println("Input: " + input);

	        String hashedValue = hashSHA256(input);
	        System.out.println("Dữ liệu sau khi mã hóa: " + hashedValue);
	    }

	    public static String hashSHA256(String input) {
	        try {
	            MessageDigest digest = MessageDigest.getInstance("SHA-256");
	            byte[] encodedHash = digest.digest(input.getBytes(StandardCharsets.UTF_8));

	            StringBuilder hexString = new StringBuilder();
	            for (byte b : encodedHash) {
	                String hex = String.format("%02x", b);
	                hexString.append(hex);
	            }

	            return hexString.toString();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return null;
	    }
	}
