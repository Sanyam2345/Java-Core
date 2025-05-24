package JavaLangPackage;

enum Dept {
    CSE("Sanyam", "A Block"), IT("Stuti","B Block"), CIVIL("Anita", "C Block"), MECH("Prabhu", "D Block");
    final String name;
    final String block;
    Dept(String name, String block){
        this.name = name;
        this.block = block;
    }
    public void getName(){
        System.out.println(name);
    }
    public void getBlock(){
        System.out.println(block);
    }
}

public class EnumDefining {
    public static void main(String[] args) {
        Dept d = Dept.CSE;
        d.getName();
        d.getBlock();
        System.out.println("---------------------------");
        Dept.IT.getName();
        Dept.IT.getBlock();
        System.out.println("---------------------------");
        Dept.CIVIL.getName();
        Dept.CIVIL.getBlock();
        System.out.println("---------------------------");
        Dept.MECH.getName();
        Dept.MECH.getBlock();
        System.out.println("---------------------------");
    }
}
