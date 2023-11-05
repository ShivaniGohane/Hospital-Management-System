import Model.Hospital;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Hospital aiims = new Hospital("Aiims New Delhi", 1000, "New Delhi", 123456);
        aiims.getTotalBeds();
        aiims.getHospitalName();
    }
}