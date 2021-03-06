package NewStudentData;


/**
* NewStudentData/StudentDataPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from NewStudentData.idl
* Friday, March 25, 2016 5:37:20 PM PDT
*/

public abstract class StudentDataPOA extends org.omg.PortableServer.Servant
 implements NewStudentData.StudentDataOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_StudID", new java.lang.Integer (0));
    _methods.put ("_set_StudID", new java.lang.Integer (1));
    _methods.put ("_get_Name", new java.lang.Integer (2));
    _methods.put ("_set_Name", new java.lang.Integer (3));
    _methods.put ("_get_SSN", new java.lang.Integer (4));
    _methods.put ("_set_SSN", new java.lang.Integer (5));
    _methods.put ("_get_EmailAddress", new java.lang.Integer (6));
    _methods.put ("_set_EmailAddress", new java.lang.Integer (7));
    _methods.put ("_get_HomePhone", new java.lang.Integer (8));
    _methods.put ("_set_HomePhone", new java.lang.Integer (9));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // NewStudentData/StudentData/_get_StudID
       {
         int $result = (int)0;
         $result = this.StudID ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 1:  // NewStudentData/StudentData/_set_StudID
       {
         int newStudID = in.read_long ();
         this.StudID (newStudID);
         out = $rh.createReply();
         break;
       }

       case 2:  // NewStudentData/StudentData/_get_Name
       {
         String $result = null;
         $result = this.Name ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 3:  // NewStudentData/StudentData/_set_Name
       {
         String newName = in.read_string ();
         this.Name (newName);
         out = $rh.createReply();
         break;
       }

       case 4:  // NewStudentData/StudentData/_get_SSN
       {
         String $result = null;
         $result = this.SSN ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 5:  // NewStudentData/StudentData/_set_SSN
       {
         String newSSN = in.read_string ();
         this.SSN (newSSN);
         out = $rh.createReply();
         break;
       }

       case 6:  // NewStudentData/StudentData/_get_EmailAddress
       {
         String $result = null;
         $result = this.EmailAddress ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 7:  // NewStudentData/StudentData/_set_EmailAddress
       {
         String newEmailAddress = in.read_string ();
         this.EmailAddress (newEmailAddress);
         out = $rh.createReply();
         break;
       }

       case 8:  // NewStudentData/StudentData/_get_HomePhone
       {
         String $result = null;
         $result = this.HomePhone ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 9:  // NewStudentData/StudentData/_set_HomePhone
       {
         String newHomePhone = in.read_string ();
         this.HomePhone (newHomePhone);
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:NewStudentData/StudentData:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public StudentData _this() 
  {
    return StudentDataHelper.narrow(
    super._this_object());
  }

  public StudentData _this(org.omg.CORBA.ORB orb) 
  {
    return StudentDataHelper.narrow(
    super._this_object(orb));
  }


} // class StudentDataPOA
