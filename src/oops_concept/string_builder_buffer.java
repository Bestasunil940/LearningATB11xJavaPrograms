package oops_concept;

public class string_builder_buffer {
    public static void main(String[] args) {

        long startTime, endTime;

        // Using String (Immutable)
        String str = "Hello";
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            str = str + " World";
        }
        endTime = System.nanoTime();
        System.out.println("Time with String: " + (endTime - startTime));

        // Using StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            sb.append(" World");
        }
        endTime = System.nanoTime();
        System.out.println("Time with StringBuilder: " + (endTime - startTime));

        // Using StringBuffer
        StringBuffer sbuf = new StringBuffer("Hello");
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            sbuf.append(" World");
        }
        endTime = System.nanoTime();
        System.out.println("Time with StringBuffer: " + (endTime - startTime));
    }

    /*
     *  Feature	      String	    StringBuilder	                StringBuffer
        Mutable?	  ❌ No  	     ✅ Yes	                         ✅ Yes
        Thread-safe?  ❌ No	         ❌ No	                         ✅ Yes
        Performance   ❌ Slow	     ✅ Fast (Single-threaded)	     🔶 Medium (Synchronized)
        Use case	  Few changes	 Frequent edits (fast)	         Multi-threaded updates
     */
}
