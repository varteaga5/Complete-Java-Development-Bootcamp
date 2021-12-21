public class BooleanComparisons {
    public static void main(String[] args) {
        int chemGrade = 95;
        int bioGrade = 75;
        int engGrade = 75;

        System.out.println("this is > ");
        System.out.println(bioGrade > chemGrade);

        System.out.println("this is > ");
        System.out.println(bioGrade < chemGrade);

        System.out.println("this is <= ");
        System.out.println(bioGrade <= chemGrade);

        System.out.println("this is >=");
        System.out.println(bioGrade >= chemGrade);
        
        System.out.println("this is == ");
        System.out.println(bioGrade == chemGrade);

        System.out.println("this is != ");
        System.out.println(bioGrade != engGrade);

        String sentence = "java";

        String sentence2 = "python";

        System.out.println("this is .equals " + sentence.equals
        (sentence2));

        System.out.println("this is !.equals " + !sentence.equals(sentence2));



    }
}
