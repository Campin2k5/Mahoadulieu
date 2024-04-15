package sha;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA{
    public static void main(String[] args) {
        String input = "Nhập dữ liệu cần mã hóa: ";
        System.out.println("Input: " + input);

        try {
            String hashedValue = hashSHA1(input);
            System.out.println("Xuất dữ liệu đã được mã hóa: " + hashedValue);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String hashSHA1(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        byte[] hashBytes = md.digest(input.getBytes());

        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) {
            sb.append(String.format("%02x", b));
        }

        return sb.toString();
    }
}
