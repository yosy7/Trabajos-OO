public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isDigit('a'));

        String test = "Hola";
        for(int i = 0; i< test.length(); i++){
           System.out.println(test.charAt(i));
        }
    }
    
    
    

    
}
