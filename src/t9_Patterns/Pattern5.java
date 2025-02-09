package t9_Patterns;

//*
//* *
//* * *
//* * * *
//* * * * *
//* * * *
//* * *
//* *
//*

public class Pattern5 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i = 1; i<=n*2-1; i++){
            int col;
            if(i<=n){
                col = i;
            }
            else{
                col = n*2-i;
            }
            for(int j = 1; j<=col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
