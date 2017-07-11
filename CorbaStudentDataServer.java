/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corbastudentdataserver;

/**
 *
 * @author Jan
 */
import NewStudentData.StudentData;
import NewStudentData.StudentDataHelper;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

public class CorbaStudentDataServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        try {
            ORB orb = ORB.init(args, null);
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();
            
            NewStudentDataServant newstudentdataobj = new NewStudentDataServant();
            newstudentdataobj.setORB(orb);
            
            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(newstudentdataobj);
            StudentData hRef = StudentDataHelper.narrow(ref);
            
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            
            NameComponent path[] = ncRef.to_name("ABC");
            ncRef.rebind(path, hRef);
            
            System.out.println("Corba Student Data Server ready and waiting...");
            
            for (;;){
                orb.run();
            }
        } catch (Exception e) {
            System.err.println("Error: " + e );
            e.printStackTrace(System.out);
        }
        System.out.println("Corba Student Data Server exiting...");
    }
    
}
