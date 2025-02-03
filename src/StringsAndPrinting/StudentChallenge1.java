package StringsAndPrinting;

public class StudentChallenge1 {
    public static void main(String[] args) {
        String str = "sanyamgairola111@gmail.com";
        String username = str.substring(0, str.indexOf("@"));
        String domainName = str.substring(str.indexOf('@')+1);
        System.out.println("USername: " + username);
        System.out.println("Domain Name: " + domainName);
    }
}
