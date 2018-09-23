//I AM NOT A JAVA PROGRAMMER
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Peter
 */
//‘******************************************************
//‘***  QSLL
//‘***  Peter Martinez
//‘******************************************************
//‘***  This class was made to provide an object to hold 
//‘***  data in. I decided to go with a link list as I'm
//‘***  unfamiliar with them.
//‘******************************************************
//‘***  9/23/2018
//‘******************************************************
//‘***  9/23/2018: added a constructor to class
//‘******************************************************
public class QSLL 
{
    public int value;
    public QSLL nextLL;
    public QSLL prevLL;     //unlike the link lists presented in class I went with a double link list because I found this easier to work with for the assignment
    
    public QSLL (int i)
    {
        this.value = i;
    }
}
