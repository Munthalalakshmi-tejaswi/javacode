interface Animal{
    public void Sound();
    public void Sleep();
}
class Dog implements Animal{
    public void Sound(){
        System.out.println("Bow-Bow");
    }
    public void Sleep(){
        System.out.println("zzzzzzzzzzzz");
    }
}
class Inter{
    public static void main (String[] args) {
        Dog obj=new Dog();
        obj.Sound();
        obj.Sleep();
    }
}