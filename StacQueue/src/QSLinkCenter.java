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
public class QSLinkCenter 
{
    public static QSLL firstOne;
    public static QSLL lastOne;
    public static int size;    
//‘******************************************************
//‘***  fillNode
//‘***  Peter Martinez
//‘******************************************************
//‘***  Method is used to populate the nodes of the link 
//‘***  list.
//‘***  Thie method expects a integer and it can be of  
//‘***  just about any size.
//‘******************************************************
//‘***  9/20/2018
//‘******************************************************        
    public static void fillNode(int value1)
    {
        QSLL newOne = new QSLL(value1);
        if(isEmpty())
        {
            lastOne = newOne;
        }
        else
        {
            firstOne.prevLL = newOne;
        }
        newOne.nextLL = firstOne;
        firstOne = newOne;
        size++;
    }
//‘******************************************************
//‘***  pop
//‘***  Peter Martinez
//‘******************************************************
//‘***  Method pops the most recent addition to the link 
//‘***  list. Was originally the dequeue method but it
//‘***  wound up going last in first out instead.  
//‘******************************************************
//‘***  9/21/2018
//‘******************************************************     
    public static int pop()
    {
        //Was originally using the code from class, but I found code from
        //Dinesh Varyani who implemented double link lists very similar to this.
        //I used that code as the basis for this.
        QSLL temp = firstOne;
        if(firstOne == lastOne)
        {
            lastOne = null;
        }
        else
        {
            firstOne.nextLL.prevLL = null;
        }
        firstOne = firstOne.nextLL;
        temp.nextLL = null;
        size--;
        return temp.value;
    }
//‘******************************************************
//‘***  dequeue
//‘***  Peter Martinez
//‘******************************************************
//‘***  Method pops the firstt addition to the link 
//‘***  list. Was originally the pop method but it
//‘***  wound up going first in first out instead.  
//‘******************************************************
//‘***  9/21/2018
//‘******************************************************    
    public static int dequeue()
    {
        //Was originally using the code from class, but I found code from
        //Dinesh Varyani who implemented double link lists very similar to this.
        //I used that code as the basis for this.
        QSLL temp = lastOne;
        if(firstOne == lastOne)
        {
            firstOne = null;
        }
        else
        {
            lastOne.prevLL.nextLL = null;
        }
        lastOne = lastOne.prevLL;
        temp.prevLL = null;
        size--;
        return temp.value;
    }

    /**
     *
     * @return
     */
//‘******************************************************
//‘***  isEmpty
//‘***  Peter Martinez
//‘******************************************************
//‘***  Method is used to check if the link list if empty 
//‘***  Uses the size variable to help keep track of 
//‘***  items. "firstOne = null" works as well.
//‘******************************************************
//‘***  9/21/2018
//‘******************************************************    
    public static boolean isEmpty()
    {
        return size == 0;
    }
}
