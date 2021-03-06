/*
*   Author:  Dylan Lee & Colin Fitzsimons
*   Date:    27/3/2013
*               Description
*   A class that looks at what is currently
*   in the buffer and returns the information
*   to standard output.
*/
public class Watcher extends Thread{

    private BoundedBuffer buffer;
    //Requires the buffer to be passed in.
    Watcher(BoundedBuffer buffer){
        this.buffer = buffer;
    }
    
    //Takes in the buffer and prints it out
    public void run(){
        while(true){
            try{
                //Loop prints the buffer 5 per line
                System.out.println(buffer.getData());
                //System.out.println("Delta: " + buffer.getDelta() + " Size of Buffer: " + buffer.size());
                sleep(1000);
            }catch(InterruptedException e){ }
        }
    }

}