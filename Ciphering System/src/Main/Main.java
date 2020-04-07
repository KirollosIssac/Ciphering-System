package Main;
import CipherImplementation.HillCipher.HillCipher;
import CipherImplementation.PlayFair.PlayFair;
import CipherImplementation.Vigenere.Caesar;
import CipherImplementation.Vigenere.VigenereAutoKey;
import CipherImplementation.Vigenere.VigenereWithReapeatingKey;

public class Main {

    public static void main(String[] args) {

        VigenereWithReapeatingKey VG= new VigenereWithReapeatingKey("Ciphering system") ;
        System.out.println("key  : " + VG.getKey()) ;
        System.out.println("Encrypted text Vigenere   : " + VG.Encrypt()) ;
        System.out.println("Decrypted text Vigenere   : " + VG.Decrypt());

        VigenereAutoKey v=new VigenereAutoKey("Ciphering system" );
        System.out.println("Encrypted text VigenereK  : " + v.Encrypt());
        System.out.println("Decrypted text VigenereK  : " + v.Decrypt());

  	    PlayFair obj = new PlayFair("Ciphering system", "Key");
        System.out.println("Encrypted text PlayFair   : " + obj.Encrypt());
        System.out.println("Decrypted text PlayFair   : " + obj.Decrypt());

        Caesar c2 = new Caesar("Ciphering system");
        System.out.println("Encrypted text Caesar     : " + c2.Encrypt());
        System.out.println("Decrypted text Caesar     : " + c2.Decrypt());

        HillCipher H = new HillCipher("Ciphering system");
        System.out.println("Encrypted text HillCipher : " + H.Encrypt());
        System.out.println("Decrypted text HillCipher : " + H.Decrypt());

    }
}