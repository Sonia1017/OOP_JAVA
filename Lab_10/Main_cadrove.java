package Lab_10;

public class Main_cadrove {

    public static void main(String[] args) {


        Cadrove_agenstvo[] list=new Cadrove_agenstvo[2];

        list[0]= new Cadrove_agenstvo();

        list[0].setFirm("Школа іноземних мов");
        list[0].setWork_specialty("Викладач іспанської");
        list[0].setWork_conditions("Повний день, володіння комп'ютером.");
        list[0].setSalary(8000);
        list[0].setPeople_specialty("Філолог");
        list[0].setExperiance(1);
        list[0].setEducation("Вища");

        System.out.println(list[0].getFirm());
        System.out.println(list[0].getWork_specialty());
        System.out.println(list[0].getWork_conditions());
        System.out.println(list[0].getSalary());
        System.out.println(list[0].getPeople_specialty());
        System.out.println(list[0].getExperiance());
        System.out.println(list[0].getEducation());



    }


}