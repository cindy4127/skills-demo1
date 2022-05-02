public class SkillsDemo1{
    public static int factorial(int n){
        //factorial of zero is one
        if (n==0){
            return 1;
        }
        return n * factorial(n-1);
    }
}
