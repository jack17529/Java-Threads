//*******************************************************************
// Dear CompileJava users,
//
// In an effort to recover costs for hosting and development of a new
// site (stay tuned!) I ran a two-week advertising experiment. After
// hearing your feedback about the type and quality of the ads I have
// chosen to remove them. CompileJava is used widely in educational
// settings and I apologize for any frustration/inconvenience caused.
//
// CompileJava has been operating since 2013 completely free. If you
// find this site useful, or would otherwise like to contribute, then
// please consider making a donation (link in 'More Info' tab).
// Thank you for your patience, understanding, and continued support.
//
// Most sincerely, Z.
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class MyClass extends Thread
{
  public void run(){
    for(int i=0;i<10;i++){
    	System.out.println(Thread.currentThread().getId() + " value "+ i);
    }
    
    try{
    	Thread.sleep(100);
    } catch(InterruptedException e){
    	e.printStackTrace();
    }
    
  }
}