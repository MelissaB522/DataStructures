/**
 *
 * @author melissabakke
 */
public class MaxHeapNode {
    // Variables
    private String FirstName;
    private String LastName;
    private int IDnumber;
    
    // Constructor
    public MaxHeapNode (String first, String last, int id) {
        FirstName = first;
        LastName = last;
        IDnumber = id;
    }
     /**
     * @return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the IDnumber
     */
    public int getIDnumber() {
        return IDnumber;
    }

    /**
     * @param IDnumber the IDnumber to set
     */
    public void setIDnumber(int IDnumber) {
        this.IDnumber = IDnumber;
    }
    
    @Override
    public String toString () {
        return FirstName + " " + LastName + ", " + IDnumber;
    }
}
