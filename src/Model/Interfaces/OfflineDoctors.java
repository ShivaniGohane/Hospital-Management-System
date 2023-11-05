package Model.Interfaces;

public class OfflineDoctors implements Doctor{
    private String docId;
    private String docName;
    private String  docDegree;
    private String docSpeciality;
    private int docAge;

    OfflineDoctors(String docId, String docName, String docDegree, String docSpeciality, int docAge){
        this.docId = docId;
        this.docName = docName;
        this.docDegree = docDegree;
        this.docSpeciality = docSpeciality;
        this.docAge = docAge;
    }
    public void Diagnosis(){
        System.out.println("Doing diagnosis offline");
    }

    public void getMyPatients(){

    }
    public void getMyDetails(){
        System.out.println("Hey I am doctor "+docName);
        System.out.println("My doc degree is "+docDegree);
        System.out.println("My speciality is "+docSpeciality);
        System.out.println("My age is "+docAge);
    }
}
