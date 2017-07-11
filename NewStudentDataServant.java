/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corbastudentdataserver;

import NewStudentData.StudentDataPOA;
import org.omg.CORBA.ORB;

/**
 *
 * @author Jan
 */
public class NewStudentDataServant extends StudentDataPOA {
    
    private int StudID = 1111;
    private String Name = "Bob Smith";
    private String SSN = "222-333-1111";
    private String EmailAddress = "bsmith@yahoo.com";
    private String HomePhone = "215-777-8888";
    private ORB orb;
    
    public void setORB(ORB orb_val){
        orb = orb_val;
    }
    
    @Override
    public int StudID() {
        return StudID;
    }

    @Override
    public void StudID(int newStudID) {
        StudID = newStudID;
    }

    @Override
    public String Name() {
        return Name;
    }

    @Override
    public void Name(String newName) {
        Name = newName;
    }

    @Override
    public String SSN() {
        return SSN;
    }

    @Override
    public void SSN(String newSSN) {
        SSN = newSSN;
    }

    @Override
    public String EmailAddress() {
        return EmailAddress;
    }

    @Override
    public void EmailAddress(String newEmailAddress) {
        EmailAddress = newEmailAddress;
    }

    @Override
    public String HomePhone() {
        return HomePhone;
    }

    @Override
    public void HomePhone(String newHomePhone) {
        HomePhone = newHomePhone;
    }
    
}
