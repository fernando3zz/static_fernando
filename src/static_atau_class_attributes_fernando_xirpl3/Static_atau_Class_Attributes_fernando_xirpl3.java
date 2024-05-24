package static_atau_class_attributes_fernando_xirpl3;

class Display{
    static  String type = "Display";
    private String name;
    
    Display(String name){
        this.name = name;
    }
    
    void setType(String typeInput){
        //type = typeInput; //alternatif 1
       // this.type = typeInput; //alternatif 2
        Display.type =typeInput; //alternatif 3
    }
    
    void show(){
            System.out.println("Display name = " + this.name);
    }
}



public class Static_atau_Class_Attributes_fernando_xirpl3 {

    public static void main(String[] args) {
       Display display1 = new Display("Monitor");
       display1.show();
       
       Display display2 = new Display("Smartphone");
       display2.show();
       
       //tampilkan static variable atau class  variable
       
       // kita menconba mengganti variable staticnya
       display1.setType("Monitor");
       
       
        System.out.println("\nMenampilkan static");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);
       
    }
    
}
