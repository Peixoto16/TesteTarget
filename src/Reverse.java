public class Reverse {

    public static void main(String[] args) {

        String normal = "hello word";

        System.out.println("Normal: " + normal);

        String reverso = "";
        for(int i = normal.length() - 1; i >= 0; i--){
            reverso +=  normal.charAt(i);
        }

        System.out.println("Manda o reverso: " + reverso);
    }

}
