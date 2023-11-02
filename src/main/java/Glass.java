public class Glass {


    public static void main(String[] args) {

        final short vGlass = 500;
        System.out.println("Объем стакана: " + vGlass + " мл");

        double plenum = 0.55;
        System.out.println("Заполненность стакана " + plenum);

        double plenumGlass = vGlass * plenum;
        System.out.println("Стакан заполнен на " + plenumGlass + " мл");
    }
}
