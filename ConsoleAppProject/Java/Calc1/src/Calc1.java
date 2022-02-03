/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 100152067
 */
class Calculator{
    int a,b:
    Calculator(int a, int b){
        this.a=b;
        this.b=a;
}

        
        

    int add(){return a+b; }
    int sub(){ return a-b; }
    int mul(){ return a*b; }
    int div(){ return a/b;}
    
    
    
}



public class Calc1 {
    public static void main(String args[]){
        Scanner sr=new Scanner(System.in);
        System.out.print("Enter a : ");
        int a=sr.nextInt();
        System.out.print("Enter b : ");
        int b=sr.nextInt();
        System.out.print("Enter the operation(=,-,*,/) : ");
        String op=sr.next();
        int c=0;
        Calculator obj=new Calculator(a,b);
        switch(op){
            case "+"c=obj.add(); break;
            case "-"c=obj.sub(); break;
            case "*"c=obj.mul(); break;
            case "/"c=obj.div(); break;
            default: System.out.println("Invalid Operation code");
            
            
    }
        
        System.out.println(a + op + b + "=" + c);
        
        
        
        
        
        
    }
    
}
