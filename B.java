/* ---------------Constructor-----------------*/  

class A{
    int a;
    String name;
    
    //A() is constructor
    // A(){
    //     a=0; name=null;
    // }

    void show(){
        System.out.println(a+" & "+name );
    }
}

class B{
    public static void main(String[] args){
        A ref= new A();        // call function at the time of object creation
        ref.show();
    }

}